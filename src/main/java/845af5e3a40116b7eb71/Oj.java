package moom;


public class Oj implements org.apache.logging.log4j.spi.LoggerContextFactory {

private static final org.apache.logging.log4j.status.StatusLogger a;

private static final org.apache.logging.log4j.spi.LoggerContext b;

public Oj() {
super();
}


static {
a = org.apache.logging.log4j.status.StatusLogger.getLogger();
    b = new moom.Oi();
}


public void shutdown(java.lang.String p0, java.lang.ClassLoader p1, boolean p2, boolean p3) {
return;
}


public org.apache.logging.log4j.spi.LoggerContext getContext(java.lang.String p0, java.lang.ClassLoader p1, java.lang.Object p2, boolean p3) {
return moom.Oj.b;
}


public org.apache.logging.log4j.spi.LoggerContext getContext(java.lang.String p0, java.lang.ClassLoader p1, java.lang.Object p2, boolean p3, java.net.URI p4, java.lang.String p5) {
return moom.Oj.b;
}


public boolean hasContext(java.lang.String p0, java.lang.ClassLoader p1, boolean p2) {
return ((1) != 0);
}


public void removeContext(org.apache.logging.log4j.spi.LoggerContext p0) {
return;
}

}
