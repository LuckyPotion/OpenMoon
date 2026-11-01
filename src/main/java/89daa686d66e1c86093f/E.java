package moom;


public class E extends java.io.PrintStream {

private static final org.apache.logging.log4j.Logger a;

private final java.lang.String b;

public E(java.lang.String p0, java.io.OutputStream p1) {
super(p1);
    this.b = p0;
}


static {
a = org.apache.logging.log4j.LogManager.getLogger();
}


public void println(java.lang.String p0) {
this.a(((java.lang.String)(p0)));
    return;
}


public void println(java.lang.Object p0) {
this.a(((java.lang.String)(java.lang.String.valueOf(((java.lang.Object)(p0))))));
    return;
}


private void a(java.lang.String p0) {
java.lang.StackTraceElement[] local2 = ((java.lang.Thread)(java.lang.Thread.currentThread())).getStackTrace();
    java.lang.StackTraceElement local3 = (local2)[java.lang.Math.min(((int)(3)), ((int)((local2).length)))];
    ((org.apache.logging.log4j.Logger)(moom.E.a)).info(((java.lang.String)("[{}]@.({}:{}): {}")), ((java.lang.Object[])(new java.lang.Object[] {this.b, ((java.lang.StackTraceElement)(local3)).getFileName(), java.lang.Integer.valueOf(((int)(((java.lang.StackTraceElement)(local3)).getLineNumber()))), p0})));
    return;
}

}
