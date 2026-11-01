package moom;


public final class On extends java.lang.RuntimeException {

public static final moom.On a;

private On() {
super();
    (this).setStackTrace(new java.lang.StackTraceElement[0]);
}


static {
a = ((moom.On)(new moom.On()));
}


public synchronized java.lang.Throwable fillInStackTrace() {
((moom.On)(this)).setStackTrace(((java.lang.StackTraceElement[])(new java.lang.StackTraceElement[0])));
    return this;
}

}
