package com.moon;


public class iW {

private static final java.util.Map<com.moon.cb, com.moon.iw> a;

private static final long b;

public iW() {
super();
}


static {
com.moon.iW.b = (moom._c.a(-9096186442699106872L, 3299506681546520240L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(251074666119777L);
    com.moon.iW.a = new java.util.HashMap();
    com.moon.iW.a();
}


public static com.moon.iw a(com.moon.cb p0) {
return ((com.moon.iw)(((java.util.Map)(com.moon.iW.a)).get(((java.lang.Object)(p0)))));
}


private static void a() {
long local0 = (com.moon.iW.b ^ 125911809702970L);
    ((java.util.Map)(com.moon.iW.a)).put(((java.lang.Object)(com.moon.cb.RECTANGLE)), ((java.lang.Object)(new com.moon.iN())));
    ((java.util.Map)(com.moon.iW.a)).put(((java.lang.Object)(com.moon.cb.ROUNDED_RECTANGLE)), ((java.lang.Object)(new com.moon.iO())));
    ((java.util.Map)(com.moon.iW.a)).put(((java.lang.Object)(com.moon.cb.TEXTURE)), ((java.lang.Object)(new com.moon.iR())));
    ((java.util.Map)(com.moon.iW.a)).put(((java.lang.Object)(com.moon.cb.OUTLINE_ROUNDED_RECTANGLE)), ((java.lang.Object)(new com.moon.iM())));
    ((java.util.Map)(com.moon.iW.a)).put(((java.lang.Object)(com.moon.cb.GRADIENT)), ((java.lang.Object)(new com.moon.iL())));
    ((java.util.Map)(com.moon.iW.a)).put(((java.lang.Object)(com.moon.cb.WORLD)), ((java.lang.Object)(new com.moon.iT())));
    ((java.util.Map)(com.moon.iW.a)).put(((java.lang.Object)(com.moon.cb.KAWASE_DOWN)), ((java.lang.Object)(new com.moon.iC())));
    ((java.util.Map)(com.moon.iW.a)).put(((java.lang.Object)(com.moon.cb.KAWASE_UP)), ((java.lang.Object)(new com.moon.iF())));
    ((java.util.Map)(com.moon.iW.a)).put(((java.lang.Object)(com.moon.cb.SHADOW_DOWN)), ((java.lang.Object)(new com.moon.iG())));
    ((java.util.Map)(com.moon.iW.a)).put(((java.lang.Object)(com.moon.cb.SHADOW_UP)), ((java.lang.Object)(new com.moon.iH())));
    ((java.util.Map)(com.moon.iW.a)).put(((java.lang.Object)(com.moon.cb.ENTITY_OUTLINE)), ((java.lang.Object)(new com.moon.iI())));
    ((java.util.Map)(com.moon.iW.a)).put(((java.lang.Object)(com.moon.cb.GLOW_DOWN)), ((java.lang.Object)(new com.moon.iA())));
    ((java.util.Map)(com.moon.iW.a)).put(((java.lang.Object)(com.moon.cb.GLOW_UP)), ((java.lang.Object)(new com.moon.iB())));
    ((java.util.Map)(com.moon.iW.a)).put(((java.lang.Object)(com.moon.cb.MSDF)), ((java.lang.Object)(new com.moon.iy())));
    ((java.util.Map)(com.moon.iW.a)).put(((java.lang.Object)(com.moon.cb.TEXTURE_COL)), ((java.lang.Object)(new com.moon.iP())));
    ((java.util.Map)(com.moon.iW.a)).put(((java.lang.Object)(com.moon.cb.TEXTURE_ROUND)), ((java.lang.Object)(new com.moon.iQ())));
    ((java.util.Map)(com.moon.iW.a)).put(((java.lang.Object)(com.moon.cb.TRIANGLE)), ((java.lang.Object)(new com.moon.iS())));
    ((java.util.Map)(com.moon.iW.a)).put(((java.lang.Object)(com.moon.cb.JUMP_FLOOD_OUTLINE)), ((java.lang.Object)(new com.moon.iK())));
    ((java.util.Map)(com.moon.iW.a)).put(((java.lang.Object)(com.moon.cb.JUMP_FLOOD_OUTLINE_BASE)), ((java.lang.Object)(new com.moon.iJ())));
    ((java.util.Map)(com.moon.iW.a)).put(((java.lang.Object)(com.moon.cb.SMOOTHING)), ((java.lang.Object)(new com.moon.ix())));
    ((java.util.Map)(com.moon.iW.a)).put(((java.lang.Object)(com.moon.cb.KAWASE_FOG)), ((java.lang.Object)(new com.moon.iD())));
    ((java.util.Map)(com.moon.iW.a)).put(((java.lang.Object)(com.moon.cb.KAWASE_STENCIL)), ((java.lang.Object)(new com.moon.iE())));
    java.util.Iterator local2 = ((java.util.Collection)(((java.util.Map)(com.moon.iW.a)).values())).iterator();
    while (((java.util.Iterator)(local2)).hasNext()) {
        com.moon.iw local3 = ((com.moon.iw)(((java.util.Iterator)(local2)).next()));
        ((com.moon.iw)(local3)).a__Void();
    }
    return;
}

}
