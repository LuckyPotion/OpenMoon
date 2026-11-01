import com.google.gson.*;
import java.net.*;
import java.nio.file.*;
import java.lang.reflect.*;
import java.security.*;
import java.util.*;
import java.util.zip.*;

/** JVM linkage/verification fixture only: no owned initializer or application method is invoked. */
public final class NonInitializingJarVerifier {
  static String sha(Path p)throws Exception {
    var d=MessageDigest.getInstance("SHA-256");try(var in=Files.newInputStream(p)){byte[] b=new byte[1048576];for(int n;(n=in.read(b))!=-1;)d.update(b,0,n);}return HexFormat.of().withUpperCase().formatHex(d.digest());
  }
  public static void main(String[] args)throws Exception {
    if(args.length<3)throw new IllegalArgumentException("owned.jar new-report.json ordered-provider.jar...");
    Path input=Path.of(args[0]),output=Path.of(args[1]);if(Files.exists(output))throw new IllegalArgumentException("New report path required");
    List<String> names=new ArrayList<>();try(var zip=new ZipFile(input.toFile())){for(var e:Collections.list(zip.entries()))if(e.getName().endsWith(".class"))names.add(e.getName().substring(0,e.getName().length()-6).replace('/','.'));}
    Collections.sort(names);List<URL> urls=new ArrayList<>();urls.add(input.toUri().toURL());JsonArray providers=new JsonArray();
    for(int i=2;i<args.length;i++){Path p=Path.of(args[i]);urls.add(p.toUri().toURL());JsonObject row=new JsonObject();row.addProperty("path",p.toAbsolutePath().toString());row.addProperty("sha256",sha(p));providers.add(row);}
    JsonArray failures=new JsonArray();Map<String,Integer> groups=new TreeMap<>();int passed=0;boolean entryPassed=false;
    try(var loader=new URLClassLoader(urls.toArray(URL[]::new),ClassLoader.getPlatformClassLoader())) {
      for(String name:names) {
        try {
          Class<?> c=Class.forName(name,false,loader);
          if(c.getClassLoader()!=loader)throw new IllegalStateException("Owned definition delegated outside explicit archive loader");
          c.getDeclaredMethods();c.getDeclaredConstructors();c.getDeclaredFields();
          if(name.equals("moom.iP")){Method entry=c.getDeclaredMethod("main",String[].class);if(!Modifier.isPublic(entry.getModifiers())||!Modifier.isStatic(entry.getModifiers())||entry.getReturnType()!=void.class)throw new IllegalStateException("Entry must be public static main(String[]):void");entryPassed=true;}
          passed++;
        } catch(LinkageError|ReflectiveOperationException|RuntimeException error) {
          JsonObject failure=new JsonObject();failure.addProperty("owner",name.replace('.','/'));failure.addProperty("type",error.getClass().getName());failure.addProperty("message",error.getMessage());Throwable cause=error.getCause();if(cause!=null){failure.addProperty("cause_type",cause.getClass().getName());failure.addProperty("cause",cause.getMessage());}failures.add(failure);groups.merge(error.getClass().getName(),1,Integer::sum);
        }
      }
    }
    JsonObject report=new JsonObject();report.addProperty("status",failures.isEmpty()&&entryPassed?"passed_noninitializing_JVM_verification":"failed_noninitializing_JVM_verification");report.addProperty("archive",input.toAbsolutePath().toString());report.addProperty("archive_sha256",sha(input));report.addProperty("owned_denominator",names.size());report.addProperty("passed",passed);report.addProperty("failed",failures.size());report.addProperty("entrypoint_verified",entryPassed);report.addProperty("application_initialization_requested",false);report.addProperty("application_methods_invoked",0);report.addProperty("client_started",false);report.addProperty("java_home",System.getProperty("java.home"));report.addProperty("java_version",System.getProperty("java.version"));report.add("ordered_providers",providers);report.add("failure_groups",new Gson().toJsonTree(groups));report.add("failures",failures);
    Files.writeString(output,new GsonBuilder().setPrettyPrinting().create().toJson(report),StandardOpenOption.CREATE_NEW);
    System.out.println(new Gson().toJson(Map.of("status",report.get("status").getAsString(),"passed",passed,"denominator",names.size(),"failed",failures.size(),"entrypoint_verified",entryPassed,"groups",groups)));if(!failures.isEmpty()||!entryPassed)System.exit(2);
  }
}
