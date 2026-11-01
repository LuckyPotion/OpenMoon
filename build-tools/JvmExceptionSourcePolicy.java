import com.sun.source.util.JavacTask;
import com.sun.tools.javac.api.BasicJavacTask;
import com.sun.tools.javac.util.JCDiagnostic;
import com.sun.tools.javac.util.Log;
import javax.tools.Diagnostic;
import javax.tools.DiagnosticCollector;
import javax.tools.JavaFileObject;
import java.util.Set;

/**
 * The JVM permits checked exceptions to cross a method without an Exceptions
 * declaration, and permits a catch regardless of a callee's Java declaration.
 * Preserve that existing JVM program while javac checks types, assignments,
 * control flow and generates fresh instructions normally. Only these two
 * source-language exception restrictions are recorded separately. No method,
 * throw, catch, instruction or Exceptions attribute is synthesized here.
 */
public final class JvmExceptionSourcePolicy extends Log.DiagnosticHandler {
    private static final Set<String> JVM_ALLOWED_SOURCE_DIAGNOSTICS = Set.of(
        "compiler.err.unreported.exception.need.to.catch.or.throw",
        "compiler.err.except.never.thrown.in.try"
    );
    private final DiagnosticCollector<JavaFileObject> recorded = new DiagnosticCollector<>();

    private JvmExceptionSourcePolicy(Log log) { install(log); }

    public static JvmExceptionSourcePolicy install(JavacTask task) {
        return new JvmExceptionSourcePolicy(Log.instance(((BasicJavacTask)task).getContext()));
    }

    @Override public void report(JCDiagnostic diagnostic) {
        JavaFileObject source=diagnostic.getSource();
        if(diagnostic.getKind()==Diagnostic.Kind.ERROR
                && JVM_ALLOWED_SOURCE_DIAGNOSTICS.contains(diagnostic.getCode())
                && source!=null && "memsrc".equals(source.toUri().getScheme())) {
            recorded.report(diagnostic);
            return;
        }
        prev.report(diagnostic);
    }

    public DiagnosticCollector<JavaFileObject> recorded() { return recorded; }
}
