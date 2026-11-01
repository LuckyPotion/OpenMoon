package com.moon.commons.io;


public class IOUtils {

public IOUtils() {
super();
}


public static java.lang.String readFile(java.io.BufferedReader p0) throws java.io.IOException {
java.lang.String life1_6;
try {
life1_6 = ((java.lang.String)(((java.util.stream.Stream)(((java.io.BufferedReader)(p0)).lines())).collect(((java.util.stream.Collector)(java.util.stream.Collectors.joining(((java.lang.CharSequence)("\n"))))))));
}
catch (java.lang.Throwable __caughtSource0) {
java.lang.Throwable local2 = __caughtSource0;
    ((java.io.BufferedReader)(p0)).close();
    throw local2;
}
((java.io.BufferedReader)(p0)).close();
return life1_6;
}


public static java.lang.String readFile(java.io.FileReader p0) throws java.io.IOException {
java.io.BufferedReader life1_4;
java.lang.String life2_7;
life1_4 = new java.io.BufferedReader(p0);
try {
life2_7 = com.moon.commons.io.IOUtils.readFile(((java.io.BufferedReader)(life1_4)));
}
catch (java.lang.Throwable __caughtSource0) {
java.lang.Throwable local2 = __caughtSource0;
    ((java.io.FileReader)(p0)).close();
    throw local2;
}
((java.io.FileReader)(p0)).close();
return life2_7;
}


public static java.lang.String readFile(java.io.File p0) throws java.io.IOException {
java.io.FileReader local1 = new java.io.FileReader(p0);
    return com.moon.commons.io.IOUtils.readFile(((java.io.FileReader)(local1)));
}

}
