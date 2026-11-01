package moom;


public class jP {

private final java.util.List<moom.jO> a;

boolean b;

private static final long c;

public jP() {
super();
    this.a = com.google.common.collect.Lists.newArrayList();
}


static {
c = (moom._c.a(7001031317754088756L, 5989095662450359825L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(257797972810855L);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public synchronized void a(java.lang.String p0, java.net.InetAddress p1) {
java.lang.String lexicalValue1215_20_0;
    int lexicalValue1215_46_0;
    int lexicalValue1215_52_0;
    int lexicalValue1215_63_0;
    boolean spill1215_0;
    java.lang.String spill1215_1;
    boolean spill1215_2;
    long life3_3;
    java.lang.String life6_7;
    java.lang.String life7_10;
    int life5_11;
    java.lang.String life7_26;
    int life8_28;
    java.util.Iterator life9_32;
    moom.jO life10_39;
    lexical_join_67: {
    lexical_join_63: {
    lexical_join_52: {
    lexical_join_51: {
    lexical_join_20: {
    life3_3 = (moom.jP.c ^ 65736646742598L);
    spill1215_0 = net.minecraft.client.network.NetHandlerPlayClient.b();
    life6_7 = moom.Os.a(((java.lang.String)(p0)));
    life7_10 = moom.Os.b(((java.lang.String)(p0)));
    life5_11 = ((spill1215_0) ? 1 : 0);
    spill1215_1 = life7_10;
    if (!((life5_11 == 0))) {
        lexicalValue1215_20_0 = spill1215_1;
        break lexical_join_20;
    }
    if (!((spill1215_1 != null))) {
        break lexical_join_67;
    }
    lexicalValue1215_20_0 = __sourceIntrinsic_2d3cc79c67cd_invokedynamic1215_6(((java.net.InetAddress)(p1)).getHostAddress(), life7_10);
    }
    life7_26 = lexicalValue1215_20_0;
    life8_28 = 0;
    life9_32 = ((java.util.List)(this.a)).iterator();
    lexical_cycle_27: while (true) {
    lexical_join_49: {
    lexical_join_46: {
    if (!(((java.util.Iterator)(life9_32)).hasNext())) {
        break lexical_join_51;
    }
    life10_39 = ((moom.jO)(((java.util.Iterator)(life9_32)).next()));
    spill1215_2 = ((java.lang.String)(((moom.jO)(life10_39)).b())).equals(((java.lang.Object)(life7_26)));
    if (!((life5_11 == 0))) {
        lexicalValue1215_52_0 = ((spill1215_2) ? 1 : 0);
        break lexical_join_52;
    }
    if (!((life5_11 == 0))) {
        lexicalValue1215_46_0 = ((spill1215_2) ? 1 : 0);
        break lexical_join_46;
    }
    if (!(spill1215_2)) {
        break lexical_join_49;
    }
    ((moom.jO)(life10_39)).a__Void();
    lexicalValue1215_46_0 = 1;
    }
    life8_28 = lexicalValue1215_46_0;
    if (!((life5_11 != 0))) {
        break lexical_join_51;
    }
    }
    if (!((life5_11 != 0))) { continue lexical_cycle_27; }
    break lexical_cycle_27;
    }
    }
    lexicalValue1215_52_0 = life8_28;
    }
    if (!((life5_11 == 0))) {
        lexicalValue1215_63_0 = lexicalValue1215_52_0;
        break lexical_join_63;
    }
    if (!((lexicalValue1215_52_0 == 0))) {
        break lexical_join_67;
    }
    lexicalValue1215_63_0 = ((((java.util.List)(this.a)).add(((java.lang.Object)(new moom.jO(life6_7, life7_26))))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(lexicalValue1215_63_0);
    this.b = ((boolean)(true));
    }
    return;
}


public synchronized java.util.List<moom.jO> a() {
return java.util.Collections.unmodifiableList(((java.util.List)(this.a)));
}


public synchronized void a__Void() {
this.b = ((boolean)(false));
    return;
}


public synchronized boolean a__Boolean() {
return ((((this.b) ? 1 : 0)) != 0);
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2d3cc79c67cd_invokedynamic1215_6(java.lang.String a0, java.lang.String a1) throws E;
}
