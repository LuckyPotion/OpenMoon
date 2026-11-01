package moom;


public class Oi implements org.apache.logging.log4j.spi.LoggerContext {

private final org.apache.logging.log4j.spi.LoggerRegistry<org.apache.logging.log4j.spi.ExtendedLogger> a;

private static final long b;

public Oi() {
super();
    this.a = new org.apache.logging.log4j.spi.LoggerRegistry();
}


static {
b = (moom._c.a(-5462148771370091631L, -6123961211572292356L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(107113810073570L);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public org.apache.logging.log4j.spi.ExtendedLogger getLogger(java.lang.String p0, org.apache.logging.log4j.message.MessageFactory p1) {
org.apache.logging.log4j.spi.LoggerRegistry forwardValue2945_25_0;
    java.lang.String forwardValue2945_25_1;
    org.apache.logging.log4j.spi.LoggerRegistry spill2945_0;
    java.lang.String spill2945_1;
    long life3_3;
    int[] life5_5;
    forward_join_25: {
    forward_join_22: {
    life3_3 = (moom.Oi.b ^ 491200758367L);
    life5_5 = moom.OJ.b();
    spill2945_0 = this.a;
    spill2945_1 = p0;
    if (!((life5_5 == null))) {
        forwardValue2945_25_0 = spill2945_0;
        forwardValue2945_25_1 = spill2945_1;
        break forward_join_25;
    }
    if (!((!((org.apache.logging.log4j.spi.LoggerRegistry)(spill2945_0)).hasLogger(((java.lang.String)(spill2945_1)))))) {
        break forward_join_22;
    }
    ((org.apache.logging.log4j.spi.LoggerRegistry)(this.a)).putIfAbsent(((java.lang.String)(p0)), ((org.apache.logging.log4j.message.MessageFactory)(null)), ((org.apache.logging.log4j.spi.ExtendedLogger)(new moom.OJ(p0))));
    }
    forwardValue2945_25_0 = this.a;
    forwardValue2945_25_1 = p0;
    }
    return ((org.apache.logging.log4j.spi.LoggerRegistry)(forwardValue2945_25_0)).getLogger(((java.lang.String)(forwardValue2945_25_1)));
}


public org.apache.logging.log4j.spi.ExtendedLogger getLogger(java.lang.String p0) {
org.apache.logging.log4j.spi.LoggerRegistry forwardValue2944_25_0;
    java.lang.String forwardValue2944_25_1;
    org.apache.logging.log4j.spi.LoggerRegistry spill2944_0;
    java.lang.String spill2944_1;
    long life2_3;
    int[] life4_5;
    forward_join_25: {
    forward_join_22: {
    life2_3 = (moom.Oi.b ^ 6454425339287L);
    life4_5 = moom.OJ.b();
    spill2944_0 = this.a;
    spill2944_1 = p0;
    if (!((life4_5 == null))) {
        forwardValue2944_25_0 = spill2944_0;
        forwardValue2944_25_1 = spill2944_1;
        break forward_join_25;
    }
    if (!((!((org.apache.logging.log4j.spi.LoggerRegistry)(spill2944_0)).hasLogger(((java.lang.String)(spill2944_1)))))) {
        break forward_join_22;
    }
    ((org.apache.logging.log4j.spi.LoggerRegistry)(this.a)).putIfAbsent(((java.lang.String)(p0)), ((org.apache.logging.log4j.message.MessageFactory)(null)), ((org.apache.logging.log4j.spi.ExtendedLogger)(new moom.OJ(p0))));
    }
    forwardValue2944_25_0 = this.a;
    forwardValue2944_25_1 = p0;
    }
    return ((org.apache.logging.log4j.spi.LoggerRegistry)(forwardValue2944_25_0)).getLogger(((java.lang.String)(forwardValue2944_25_1)));
}


public boolean hasLogger(java.lang.String p0, java.lang.Class<? extends org.apache.logging.log4j.message.MessageFactory> p1) {
return (__sourceIntrinsic_booleanComparison((((org.apache.logging.log4j.spi.LoggerRegistry)(this.a)).hasLogger(((java.lang.String)(p0)), ((java.lang.Class)(p1))))) != 0);
}


public boolean hasLogger(java.lang.String p0) {
return (__sourceIntrinsic_booleanComparison((((org.apache.logging.log4j.spi.LoggerRegistry)(this.a)).hasLogger(((java.lang.String)(p0))))) != 0);
}


public boolean hasLogger(java.lang.String p0, org.apache.logging.log4j.message.MessageFactory p1) {
return (__sourceIntrinsic_booleanComparison((((org.apache.logging.log4j.spi.LoggerRegistry)(this.a)).hasLogger(((java.lang.String)(p0)), ((org.apache.logging.log4j.message.MessageFactory)(p1))))) != 0);
}


public java.lang.Object getExternalContext() {
return null;
}


private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
