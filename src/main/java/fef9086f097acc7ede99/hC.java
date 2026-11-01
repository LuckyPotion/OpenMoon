package com.moon;


public class hC {

public static com.moon.jn a;

public static com.moon.jn b;

private com.moon.hD c;

private com.moon.module.impl.Effects d;

private com.moon.gX e;

private boolean f;

private com.moon.hW g;

private com.moon.hW h;

private com.moon.hW i;

private com.moon.hW j;

private long k;

private static long l;

private static java.lang.String m;

private static long n;

private static long o;

public hC() { super(); }


private static void __sourceConstructorBody_f535b65919d54ebe(com.moon.hC receiver) throws Throwable {

long local1 = (com.moon.hC.l ^ 49492525920564L);

    com.moon.hC.__sourceConstructorInit_f535b65919d54ebe_0(((com.moon.hC)(receiver)));

    ((com.moon.hC)(receiver)).c = ((com.moon.hD)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__hD()));

    ((com.moon.hC)(receiver)).d = ((com.moon.module.impl.Effects)(((com.moon.module.impl.Effects)(((com.moon.fU)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__fU())).a(((java.lang.Class)(com.moon.module.impl.Effects.class)))))));

    ((com.moon.hC)(receiver)).e = ((com.moon.gX)(new com.moon.gX()));

    ((com.moon.hC)(receiver)).f = ((boolean)(true));

    java.lang.Thread local3 = new java.lang.Thread(__sourceIntrinsic_f535b65919d54ebe_originalDynamicSite935_13(receiver), com.moon.hC.m);

    ((java.lang.Thread)(local3)).start();

    return;

}



static {
l = ((long)(((moom._a)(moom._c.a(((long)(3785140999206752144L)), ((long)(-4016523632701156368L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(175480948534423L)))));
    long local10_life6 = (com.moon.hC.l ^ 113613087153842L);
    javax.crypto.Cipher local12_life8;
    javax.crypto.Cipher __sourceSpill129_10 = (local12_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill129_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill129_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill129_13 = new byte[8];
    (__sourceSpill129_13)[0] = ((byte) ((int) (local10_life6 >>> 56)));
    int local13_life14 = 1;
    while ((local13_life14 < 8)) {
        (__sourceSpill129_13)[local13_life14] = ((byte) ((int) ((local10_life6 << (local13_life14 * 8)) >>> 56)));
        local13_life14 += 1;
    }
    byte[] __sourcePreallocation129_15 = __sourceSpill129_13;
    ((javax.crypto.Cipher)(__sourceSpill129_10)).init(((int)(__sourceSpill129_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill129_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation129_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    byte[] __sourceSpill129_19 = ((java.lang.String)("\\\021$\003\007\003\016 ^Sj>:<»1nwR#èb³\021-¯.0O")).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __sourceSpill129_20 = local12_life8;
    byte[] local14_life22 = ((javax.crypto.Cipher)(__sourceSpill129_20)).doFinal(((byte[])(__sourceSpill129_19)));
    m = ((java.lang.String)(((java.lang.String)(com.moon.hC.a(((byte[])(local14_life22))))).intern()));
    javax.crypto.Cipher local5_life27;
    javax.crypto.Cipher __sourceSpill129_29 = (local5_life27 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill129_30 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill129_31 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill129_32 = new byte[8];
    (__sourceSpill129_32)[0] = ((byte) ((int) (local10_life6 >>> 56)));
    int local6_life33 = 1;
    while ((local6_life33 < 8)) {
        (__sourceSpill129_32)[local6_life33] = ((byte) ((int) ((local10_life6 << (local6_life33 * 8)) >>> 56)));
        local6_life33 += 1;
    }
    byte[] __sourcePreallocation129_34 = __sourceSpill129_32;
    ((javax.crypto.Cipher)(__sourceSpill129_29)).init(((int)(__sourceSpill129_30)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill129_31)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation129_34)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local7_life37 = -4603370639211134146L;
    byte[] __sourceSpill129_38 = new byte[8];
    (__sourceSpill129_38)[0] = ((byte) ((int) (local7_life37 >>> 56)));
    (__sourceSpill129_38)[1] = ((byte) ((int) (local7_life37 >>> 48)));
    (__sourceSpill129_38)[2] = ((byte) ((int) (local7_life37 >>> 40)));
    (__sourceSpill129_38)[3] = ((byte) ((int) (local7_life37 >>> 32)));
    (__sourceSpill129_38)[4] = ((byte) ((int) (local7_life37 >>> 24)));
    (__sourceSpill129_38)[5] = ((byte) ((int) (local7_life37 >>> 16)));
    (__sourceSpill129_38)[6] = ((byte) ((int) (local7_life37 >>> 8)));
    (__sourceSpill129_38)[7] = ((byte) ((int) local7_life37));
    javax.crypto.Cipher __sourceSpill129_39 = local5_life27;
    byte[] local9_life41 = ((javax.crypto.Cipher)(__sourceSpill129_39)).doFinal(((byte[])(__sourceSpill129_38)));
    n = ((long)((((((((((((long) (local9_life41)[0]) & 255L) << 56) | ((((long) (local9_life41)[1]) & 255L) << 48)) | ((((long) (local9_life41)[2]) & 255L) << 40)) | ((((long) (local9_life41)[3]) & 255L) << 32)) | ((((long) (local9_life41)[4]) & 255L) << 24)) | ((((long) (local9_life41)[5]) & 255L) << 16)) | ((((long) (local9_life41)[6]) & 255L) << 8)) | (((long) (local9_life41)[7]) & 255L))));
    javax.crypto.Cipher local0_life44;
    javax.crypto.Cipher __sourceSpill129_46 = (local0_life44 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill129_47 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill129_48 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill129_49 = new byte[8];
    (__sourceSpill129_49)[0] = ((byte) ((int) (local10_life6 >>> 56)));
    int local1_life50 = 1;
    while ((local1_life50 < 8)) {
        (__sourceSpill129_49)[local1_life50] = ((byte) ((int) ((local10_life6 << (local1_life50 * 8)) >>> 56)));
        local1_life50 += 1;
    }
    byte[] __sourcePreallocation129_51 = __sourceSpill129_49;
    ((javax.crypto.Cipher)(__sourceSpill129_46)).init(((int)(__sourceSpill129_47)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill129_48)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation129_51)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local2_life54 = -4103537720085456971L;
    byte[] __sourceSpill129_55 = new byte[8];
    (__sourceSpill129_55)[0] = ((byte) ((int) (local2_life54 >>> 56)));
    (__sourceSpill129_55)[1] = ((byte) ((int) (local2_life54 >>> 48)));
    (__sourceSpill129_55)[2] = ((byte) ((int) (local2_life54 >>> 40)));
    (__sourceSpill129_55)[3] = ((byte) ((int) (local2_life54 >>> 32)));
    (__sourceSpill129_55)[4] = ((byte) ((int) (local2_life54 >>> 24)));
    (__sourceSpill129_55)[5] = ((byte) ((int) (local2_life54 >>> 16)));
    (__sourceSpill129_55)[6] = ((byte) ((int) (local2_life54 >>> 8)));
    (__sourceSpill129_55)[7] = ((byte) ((int) local2_life54));
    javax.crypto.Cipher __sourceSpill129_56 = local0_life44;
    byte[] local4_life58 = ((javax.crypto.Cipher)(__sourceSpill129_56)).doFinal(((byte[])(__sourceSpill129_55)));
    o = ((long)((((((((((((long) (local4_life58)[0]) & 255L) << 56) | ((((long) (local4_life58)[1]) & 255L) << 48)) | ((((long) (local4_life58)[2]) & 255L) << 40)) | ((((long) (local4_life58)[3]) & 255L) << 32)) | ((((long) (local4_life58)[4]) & 255L) << 24)) | ((((long) (local4_life58)[5]) & 255L) << 16)) | ((((long) (local4_life58)[6]) & 255L) << 8)) | (((long) (local4_life58)[7]) & 255L))));
    a = ((com.moon.jn)(((com.moon.jn)(((com.moon.jo)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__jo())).a(((com.moon.ce)(com.moon.ce.INTER_MEDIUM)))))));
    b = ((com.moon.jn)(((com.moon.jn)(((com.moon.jo)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__jo())).a(((com.moon.ce)(com.moon.ce.MATERIAL_ICONS)))))));
}

private static native <E extends Throwable> void __sourceConstructorInit_f535b65919d54ebe_0(com.moon.hC a0) throws E;

private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static java.lang.String a(byte[] p0) {
int life1_1;
    int life2_5;
    char[] life3_7;
    int life4_9;
    int life5_19;
    int life6_39;
    int life5_44;
    int life6_52;
    int life6_71;
    int life5_76;
    int life6_86;
    int life5_91;
    int life6_99;
    life1_1 = 0;
    life3_7 = new char[(life2_5 = (p0).length)];
    life4_9 = 0;
    loop_region_10: while ((life4_9 < life2_5)) {
        if (((life5_19 = (255 & (p0)[life4_9])) < 192)) {
        (life3_7)[(life1_1++)] = ((char) life5_19);
    } else {
        if ((life5_19 < 224)) {
        life6_39 = ((int)(((char) (((char) (life5_19 & 31)) << 6))));
        byte[] spill467_0 = p0;
        life4_9 += 1;
        life5_44 = (spill467_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill467_1 = p0;
        life4_9 += 1;
        life5_76 = (spill467_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill467_2 = p0;
        life4_9 += 1;
        life5_91 = (spill467_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


public void a(com.moon.ej p0) {
((com.moon.hW)(this.j)).b();
    return;
}


public void a(com.moon.eC p0) {
com.moon.hC forestValue70_12_0;
    com.moon.hW forestValue70_22_0;
    com.moon.hW forestValue70_31_0;
    com.moon.hW forestValue70_42_0;
    com.moon.hC forestValue70_84_0;
    com.moon.hA forestValue70_127_0;
    int forestValue70_130_0;
    int forestValue70_153_0;
    int forestValue70_185_0;
    com.moon.hC spill70_0;
    com.moon.hW spill70_1;
    com.moon.hC spill70_2;
    int spill70_3;
    com.moon.hA spill70_4;
    boolean spill70_5;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    java.util.List life5_109;
    java.util.ArrayList life6_113;
    float life7_115;
    java.util.Iterator life8_118;
    com.moon.hA life9_127;
    com.moon.nY life10_153;
    java.util.Iterator life8_216;
    com.moon.hA life9_226;
    com.moon.hA life9_242;
    forest_join_222: {
    forest_join_219: {
    forest_join_202: {
    forest_join_185: {
    forest_join_166: {
    forest_join_84: {
    forest_join_47: {
    forest_join_42: {
    forest_join_38: {
    forest_join_31: {
    forest_join_29: {
    forest_join_22: {
    forest_join_20: {
    forest_join_12: {
    life2_3 = (com.moon.hC.l ^ 15482667882180L);
    life4_5 = com.moon.hA.b__Arrayr3();
    spill70_0 = this;
    if (!((life4_5 != null))) {
        forestValue70_12_0 = spill70_0;
        break forest_join_12;
    }
    if (!(((com.moon.hC)(spill70_0)).f)) {
        break forest_join_222;
    }
    forestValue70_12_0 = this;
    }
    spill70_1 = ((com.moon.hC)(forestValue70_12_0)).g;
    if (!((life4_5 != null))) {
        forestValue70_22_0 = spill70_1;
        break forest_join_22;
    }
    if (!((spill70_1 != null))) {
        break forest_join_20;
    }
    ((com.moon.hY)(((com.moon.hW)(this.g)).a__hY())).g();
    }
    forestValue70_22_0 = this.h;
    }
    if (!((life4_5 != null))) {
        forestValue70_31_0 = forestValue70_22_0;
        break forest_join_31;
    }
    if (!((forestValue70_22_0 != null))) {
        break forest_join_29;
    }
    ((com.moon.hY)(((com.moon.hW)(this.h)).a__hY())).g();
    }
    forestValue70_31_0 = this.i;
    }
    if (!((life4_5 != null))) {
        forestValue70_42_0 = forestValue70_31_0;
        break forest_join_42;
    }
    if (!((forestValue70_31_0 != null))) {
        break forest_join_38;
    }
    ((com.moon.hY)(((com.moon.hW)(this.i)).a__hY())).g();
    }
    spill70_2 = this;
    if (!((life4_5 != null))) {
        forestValue70_84_0 = spill70_2;
        break forest_join_84;
    }
    forestValue70_42_0 = ((com.moon.hC)(spill70_2)).j;
    }
    if (!((forestValue70_42_0 != null))) {
        break forest_join_47;
    }
    ((com.moon.hY)(((com.moon.hW)(this.j)).a__hY())).g();
    }
    this.g = ((com.moon.hW)(((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.ROUNDED_RECTANGLE))))).a__hX())).c())).a()));
    this.h = ((com.moon.hW)(((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.MSDF))))).a(((com.moon.jm)(com.moon.hC.b))))).a__hX())).c())).a()));
    this.i = ((com.moon.hW)(((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.MSDF))))).a(((com.moon.jm)(com.moon.hC.a))))).a__hX())).c())).a()));
    this.j = ((com.moon.hW)(((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.ROUNDED_RECTANGLE))))).a__hX())).c())).a()));
    forestValue70_84_0 = this;
    }
    life5_109 = ((com.moon.hD)(((com.moon.hC)(forestValue70_84_0)).c)).a();
    life6_113 = new java.util.ArrayList();
    life7_115 = 0x0.0p0f;
    life8_118 = ((java.util.List)(life5_109)).iterator();
    forest_cycle_96: while (true) {
    forest_join_164: {
    forest_join_157: {
    forest_join_153: {
    forest_join_137: {
    forest_join_130: {
    forest_join_128: {
    forest_join_127: {
    forest_join_124: {
    if (!(((java.util.Iterator)(life8_118)).hasNext())) {
        break forest_join_166;
    }
    life9_127 = ((com.moon.hA)(((java.util.Iterator)(life8_118)).next()));
    spill70_3 = recovery.source.CarrierOps.lcmp(((long)(((com.moon.hA)(life9_127)).b__Long())), ((long)(java.lang.System.currentTimeMillis())));
    if (!((life4_5 != null))) {
        forestValue70_185_0 = spill70_3;
        break forest_join_185;
    }
    if (!((life4_5 != null))) {
        forestValue70_130_0 = spill70_3;
        break forest_join_130;
    }
    if (!((spill70_3 < 0))) {
        break forest_join_128;
    }
    spill70_4 = life9_127;
    if (!((life4_5 != null))) {
        forestValue70_127_0 = spill70_4;
        break forest_join_127;
    }
    if (!((!((com.moon.hA)(spill70_4)).a__Boolean()))) {
        break forest_join_124;
    }
    life10_153 = ((com.moon.hA)(life9_127)).a__nY();
    ((com.moon.nY)(life10_153)).a(((float)(((com.moon.nY)(life10_153)).c())));
    }
    forestValue70_127_0 = ((com.moon.hA)(life9_127)).a(((boolean)(true)));
    }
    recovery.source.CarrierOps.discard(forestValue70_127_0);
    }
    forestValue70_130_0 = ((((com.moon.hA)(life9_127)).b__Boolean()) ? 1 : 0);
    }
    if (!((life4_5 != null))) {
        forestValue70_153_0 = forestValue70_130_0;
        break forest_join_153;
    }
    if (!((forestValue70_130_0 != 0))) {
        break forest_join_137;
    }
    ((java.util.List)(life6_113)).add(((java.lang.Object)(life9_127)));
    }
    ((com.moon.hA)(life9_127)).a(((com.moon.hW)(this.g)), ((com.moon.hW)(this.h)), ((com.moon.hW)(this.i)), ((com.moon.hW)(this.j)), ((float)(life7_115)));
    if (!((life4_5 != null))) {
        break forest_join_164;
    }
    forestValue70_153_0 = ((((com.moon.nY)(((com.moon.hA)(life9_127)).a__nY())).a__Boolean()) ? 1 : 0);
    }
    if (!((forestValue70_153_0 == 0))) {
        break forest_join_157;
    }
    this.k = ((long)(java.lang.System.currentTimeMillis()));
    }
    life7_115 = (life7_115 - (((com.moon.hA)(life9_127)).a() + 0x1.0p1f));
    }
    if (!((life4_5 == null))) {
        continue forest_cycle_96;
    }
    break forest_cycle_96;
    }
    }
    life8_216 = ((java.util.List)(life6_113)).iterator();
    forest_cycle_169: while (true) {
    if (!(((java.util.Iterator)(life8_216)).hasNext())) {
        break forest_join_202;
    }
    life9_226 = ((com.moon.hA)(((java.util.Iterator)(life8_216)).next()));
    ((com.moon.hD)(this.c)).b(((com.moon.hA)(life9_226)));
    if (!((life4_5 != null))) {
        break forest_join_219;
    }
    if (!((life4_5 == null))) {
        continue forest_cycle_169;
    }
    break forest_cycle_169;
    }
    break forest_join_202;
    }
    forest_cycle_185: while (true) {
    forest_join_199: {
    if (!((forestValue70_185_0 != 0))) {
        break forest_join_202;
    }
    life9_242 = ((com.moon.hA)(((java.util.Iterator)(life8_118)).next()));
    ((com.moon.hD)(this.c)).b(((com.moon.hA)(life9_242)));
    if (!((life4_5 != null))) {
        break forest_join_219;
    }
    if (!((life4_5 == null))) {
        break forest_join_199;
    }
    break forest_join_202;
    }
    spill70_5 = ((java.util.Iterator)(life8_118)).hasNext();
    forestValue70_185_0 = ((spill70_5) ? 1 : 0);
    continue forest_cycle_185;
    }
    }
    if (!((recovery.source.CarrierOps.lcmp(((long)((java.lang.System.currentTimeMillis() - this.k))), ((long)(com.moon.hC.o))) < 0))) {
        break forest_join_219;
    }
    ((com.moon.gW)(((com.moon.module.impl.Effects)(this.d)).a__gW())).c();
    ((com.moon.gV)(((com.moon.module.impl.Effects)(this.d)).a())).a(((boolean)(true)));
    }
    this.f = ((boolean)(false));
    }
    return;
}


public void a(com.moon.eB p0) {
int forwardValue308_25_0;
    net.minecraft.entity.Entity[] spill308_0;
    int spill308_1;
    long life2_3;
    int life5_8;
    net.minecraft.entity.Entity[] life4_9;
    forward_join_27: {
    forward_join_25: {
    forward_join_15: {
    life2_3 = (com.moon.hC.l ^ 25807132601629L);
    spill308_0 = com.moon.hA.b__Arrayr3();
    life5_8 = ((org.lwjgl.opengl.GL11.glIsEnabled(((int)(((int) com.moon.hC.n))))) ? 1 : 0);
    life4_9 = spill308_0;
    spill308_1 = life5_8;
    if (!((life4_9 != null))) {
        forwardValue308_25_0 = spill308_1;
        break forward_join_25;
    }
    if (!((spill308_1 == 0))) {
        break forward_join_15;
    }
    moom.kZ.l();
    }
    ((com.moon.hW)(this.g)).b();
    ((com.moon.hW)(this.h)).b();
    ((com.moon.hW)(this.i)).b();
    forwardValue308_25_0 = life5_8;
    }
    if (!((forwardValue308_25_0 == 0))) {
        break forward_join_27;
    }
    moom.kZ.k();
    }
    return;
}


private void lambda$new$0() {
terminal_cycle_0: while (true) {
        ((com.moon.gX)(this.e)).a(((int)(((org.lwjgl.opengl.DisplayMode)(org.lwjgl.opengl.Display.getDesktopDisplayMode())).getFrequency())));
        this.f = ((boolean)(true));
        continue terminal_cycle_0;
    }
}


private static native <E extends Throwable> java.lang.Runnable __sourceIntrinsic_f535b65919d54ebe_originalDynamicSite935_13(com.moon.hC a0) throws E;
}
