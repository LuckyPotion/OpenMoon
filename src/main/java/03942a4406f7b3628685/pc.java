package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class pc extends net.minecraft.client.gui.Gui {

private int f;

private net.minecraft.client.gui.FontRenderer g;

public int h;

public int i;

public float j;

public float k;

private java.lang.String l;

private int m;

private int n;

private boolean o;

private boolean p;

private boolean q;

private boolean r;

private int s;

private int t;

private int u;

private int v;

private int w;

private boolean x;

private moom.hX y;

private com.google.common.base.Predicate<java.lang.String> z;

private com.v A;

private static long B;

private static long[] C;

private static java.lang.Integer[] D;

private static java.util.Map E;

public pc(int p0, net.minecraft.client.gui.FontRenderer p1, float p2, float p3, int p4, int p5, com.v p6) { super(); }


private static void __sourceConstructorBody_0f7336f21ff6a8cc(com.moon.pc receiver, int p0, net.minecraft.client.gui.FontRenderer p1, float p2, float p3, int p4, int p5, com.v p6) throws Throwable {

long local8_life2 = (com.moon.pc.B ^ 74532353792234L);

    com.moon.pc.__sourceConstructorInit_0f7336f21ff6a8cc_0(((com.moon.pc)(receiver)));

    ((com.moon.pc)(receiver)).l = ((java.lang.String)(""));

    ((com.moon.pc)(receiver)).m = ((int)(__sourceIntrinsic_0f7336f21ff6a8cc_originalDynamicSite117_6(25352, (6219224284285595517L ^ local8_life2))));

    ((com.moon.pc)(receiver)).o = ((boolean)(true));

    ((com.moon.pc)(receiver)).p = ((boolean)(true));

    ((com.moon.pc)(receiver)).r = ((boolean)(true));

    ((com.moon.pc)(receiver)).v = ((int)(__sourceIntrinsic_0f7336f21ff6a8cc_originalDynamicSite117_12(15839, (7555529032923722159L ^ local8_life2))));

    ((com.moon.pc)(receiver)).w = ((int)(__sourceIntrinsic_0f7336f21ff6a8cc_originalDynamicSite117_15(20818, (3555939970967592225L ^ local8_life2))));

    ((com.moon.pc)(receiver)).x = ((boolean)(true));

    ((com.moon.pc)(receiver)).z = ((com.google.common.base.Predicate)(com.google.common.base.Predicates.alwaysTrue()));

    ((com.moon.pc)(receiver)).f = ((int)(p0));

    ((com.moon.pc)(receiver)).g = ((net.minecraft.client.gui.FontRenderer)(p1));

    ((com.moon.pc)(receiver)).j = ((float)(p2));

    ((com.moon.pc)(receiver)).k = ((float)(p3));

    ((com.moon.pc)(receiver)).h = ((int)(p4));

    ((com.moon.pc)(receiver)).i = ((int)(p5));

    ((com.moon.pc)(receiver)).A = ((com.v)(p6));

    return;

}



static {
B = ((long)(((moom._a)(moom._c.a(((long)(6842620808753213509L)), ((long)(-3608735600967227967L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(185668419970543L)))));
    E = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.pc.B ^ 105826332455702L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill530_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill530_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill530_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill530_14 = new byte[8];
    (__sourceSpill530_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill530_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation530_16 = __sourceSpill530_14;
    ((javax.crypto.Cipher)(__sourceSpill530_11)).init(((int)(__sourceSpill530_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill530_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation530_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[8];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "®ºoêªºL8\tÔ\006..\"\036'\177kîx¿Z\026h9;k?v\020Q«/)hÞá7kn\026*"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill530_25 = local6_life21;
        int __sourceSpill530_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill530_25)).substring(((int)(__sourceSpill530_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill530_30 = local8_life19;
        int __sourceSpill530_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill530_33 = new byte[8];
        (__sourceSpill530_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill530_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill530_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill530_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill530_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill530_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill530_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill530_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill530_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill530_34)).doFinal(((byte[])(__sourceSpill530_33)));
        (__sourceSpill530_30)[__sourceSpill530_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "<E 5\\\026ÔÇÙ\027ß¾q\005"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill530_38 = local6_life21;
        int __sourceSpill530_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill530_38)).substring(((int)(__sourceSpill530_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill530_43 = local8_life19;
        int __sourceSpill530_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill530_46 = new byte[8];
        (__sourceSpill530_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill530_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill530_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill530_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill530_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill530_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill530_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill530_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill530_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill530_47)).doFinal(((byte[])(__sourceSpill530_46)));
        (__sourceSpill530_43)[__sourceSpill530_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    C = ((long[])(local8_life19));
    D = ((java.lang.Integer[])(new java.lang.Integer[8]));
}

private static native <E extends Throwable> void __sourceConstructorInit_0f7336f21ff6a8cc_0(com.moon.pc a0) throws E;

public void b(int p0) {
int forwardValue1213_14_0;
    int forwardValue1213_25_0;
    int forwardValue1213_29_0;
    int forwardValue1213_31_0;
    int forwardValue1213_40_0;
    int forwardValue1213_43_0;
    int forwardValue1213_53_0;
    int forwardValue1213_55_0;
    int forwardValue1213_69_0;
    int forwardValue1213_86_0;
    int forwardValue1213_95_0;
    com.moon.pc forwardValue1213_100_0;
    moom.hX forwardValue1213_106_0;
    int spill1213_0;
    int spill1213_1;
    int spill1213_2;
    int spill1213_3;
    com.moon.pc spill1213_4;
    moom.hX spill1213_5;
    long life2_3;
    java.lang.String[] life4_5;
    int life5_49;
    int life6_67;
    int life7_84;
    java.lang.String life8_86;
    forward_join_111: {
    forward_join_106: {
    forward_join_100: {
    forward_join_99: {
    forward_join_95: {
    forward_join_86: {
    forward_join_82: {
    forward_join_69: {
    forward_join_68: {
    forward_join_55: {
    forward_join_53: {
    forward_join_51: {
    forward_join_43: {
    forward_join_41: {
    forward_join_40: {
    forward_join_31: {
    forward_join_30: {
    forward_join_29: {
    forward_join_25: {
    forward_join_24: {
    forward_join_14: {
    life2_3 = (com.moon.pc.B ^ 51757069358818L);
    life4_5 = com.moon.mz.b__ArrayString();
    spill1213_0 = ((java.lang.String)(this.l)).length();
    if (!((life4_5 == null))) {
        forwardValue1213_14_0 = spill1213_0;
        break forward_join_14;
    }
    if (!((spill1213_0 != 0))) {
        break forward_join_111;
    }
    forwardValue1213_14_0 = this.u;
    }
    if (!((life4_5 == null))) {
        forwardValue1213_25_0 = forwardValue1213_14_0;
        break forward_join_25;
    }
    if (!((forwardValue1213_14_0 != this.t))) {
        break forward_join_24;
    }
    ((com.moon.pc)(this)).b(((java.lang.String)("")));
    if (!((life4_5 != null))) {
        break forward_join_111;
    }
    }
    forwardValue1213_25_0 = p0;
    }
    if (!((life4_5 == null))) {
        forwardValue1213_29_0 = forwardValue1213_25_0;
        break forward_join_29;
    }
    if (!((forwardValue1213_25_0 < 0))) {
        break forward_join_30;
    }
    forwardValue1213_29_0 = 1;
    }
    forwardValue1213_31_0 = forwardValue1213_29_0;
    break forward_join_31;
    }
    forwardValue1213_31_0 = 0;
    }
    life5_49 = forwardValue1213_31_0;
    spill1213_1 = life5_49;
    if (!((life4_5 == null))) {
        forwardValue1213_40_0 = spill1213_1;
        break forward_join_40;
    }
    if (!((spill1213_1 != 0))) {
        break forward_join_41;
    }
    forwardValue1213_40_0 = (this.t + p0);
    }
    forwardValue1213_43_0 = forwardValue1213_40_0;
    break forward_join_43;
    }
    forwardValue1213_43_0 = this.t;
    }
    life6_67 = forwardValue1213_43_0;
    spill1213_2 = life5_49;
    if (!((life4_5 == null))) {
        forwardValue1213_53_0 = spill1213_2;
        break forward_join_53;
    }
    if (!((spill1213_2 != 0))) {
        break forward_join_51;
    }
    forwardValue1213_55_0 = this.t;
    break forward_join_55;
    }
    forwardValue1213_53_0 = this.t;
    }
    forwardValue1213_55_0 = (forwardValue1213_53_0 + p0);
    }
    life7_84 = forwardValue1213_55_0;
    life8_86 = "";
    spill1213_3 = life6_67;
    if (!((life4_5 == null))) {
        forwardValue1213_69_0 = spill1213_3;
        break forward_join_69;
    }
    if (!((spill1213_3 >= 0))) {
        break forward_join_68;
    }
    life8_86 = ((java.lang.String)(this.l)).substring(((int)(0)), ((int)(life6_67)));
    }
    forwardValue1213_69_0 = life7_84;
    }
    if (!((life4_5 == null))) {
        forwardValue1213_86_0 = forwardValue1213_69_0;
        break forward_join_86;
    }
    if (!((forwardValue1213_69_0 < ((java.lang.String)(this.l)).length()))) {
        break forward_join_82;
    }
    life8_86 = __sourceIntrinsic_8dbec06774c4_invokedynamic1213_17(life8_86, ((java.lang.String)(this.l)).substring(((int)(life7_84))));
    }
    forwardValue1213_86_0 = ((((com.google.common.base.Predicate)(this.z)).apply(((java.lang.Object)(life8_86)))) ? 1 : 0);
    }
    if (!((life4_5 == null))) {
        forwardValue1213_95_0 = forwardValue1213_86_0;
        break forward_join_95;
    }
    if (!((forwardValue1213_86_0 != 0))) {
        break forward_join_111;
    }
    spill1213_4 = this;
    if (!((life4_5 == null))) {
        forwardValue1213_100_0 = spill1213_4;
        break forward_join_100;
    }
    ((com.moon.pc)(spill1213_4)).l = ((java.lang.String)(life8_86));
    forwardValue1213_95_0 = life5_49;
    }
    if (!((forwardValue1213_95_0 != 0))) {
        break forward_join_99;
    }
    ((com.moon.pc)(this)).c(((int)(p0)));
    }
    forwardValue1213_100_0 = this;
    }
    spill1213_5 = ((com.moon.pc)(forwardValue1213_100_0)).y;
    if (!((life4_5 == null))) {
        forwardValue1213_106_0 = spill1213_5;
        break forward_join_106;
    }
    if (!((spill1213_5 != null))) {
        break forward_join_111;
    }
    forwardValue1213_106_0 = this.y;
    }
    ((moom.hX)(forwardValue1213_106_0)).a(((int)(this.f)), ((java.lang.String)(this.l)));
    }
    return;
}


public void b__Void() {
((com.moon.pc)(this)).e(((int)(0)));
    return;
}


public void b(java.lang.String p0) {
com.moon.pc forwardValue1214_22_0;
    int forwardValue1214_23_0;
    com.moon.pc forwardValue1214_35_0;
    int forwardValue1214_36_0;
    int forwardValue1214_65_0;
    int forwardValue1214_87_0;
    int forwardValue1214_114_0;
    com.moon.pc forwardValue1214_127_0;
    moom.hX forwardValue1214_133_0;
    java.lang.String[] spill1214_0;
    com.moon.pc spill1214_1;
    com.moon.pc spill1214_2;
    int spill1214_3;
    int spill1214_4;
    int spill1214_5;
    com.moon.pc spill1214_6;
    moom.hX spill1214_7;
    long life2_3;
    java.lang.String life5_6;
    java.lang.String life6_9;
    java.lang.String[] life4_10;
    int life7_28;
    int life8_46;
    int life9_57;
    int life10_59;
    int life10_94;
    forward_join_143: {
    forward_join_138: {
    forward_join_133: {
    forward_join_127: {
    forward_join_114: {
    forward_join_108: {
    forward_join_88: {
    forward_join_87: {
    forward_join_81: {
    forward_join_65: {
    forward_join_64: {
    forward_join_36: {
    forward_join_35: {
    forward_join_34: {
    forward_join_23: {
    forward_join_22: {
    forward_join_21: {
    life2_3 = (com.moon.pc.B ^ 2499678362311L);
    spill1214_0 = com.moon.mz.b__ArrayString();
    life5_6 = "";
    life6_9 = moom.CH.a(((java.lang.String)(p0)));
    life4_10 = spill1214_0;
    spill1214_1 = this;
    if (!((life4_10 == null))) {
        forwardValue1214_22_0 = spill1214_1;
        break forward_join_22;
    }
    if (!((((com.moon.pc)(spill1214_1)).t < this.u))) {
        break forward_join_21;
    }
    forwardValue1214_23_0 = this.t;
    break forward_join_23;
    }
    forwardValue1214_22_0 = this;
    }
    forwardValue1214_23_0 = ((com.moon.pc)(forwardValue1214_22_0)).u;
    }
    life7_28 = forwardValue1214_23_0;
    spill1214_2 = this;
    if (!((life4_10 == null))) {
        forwardValue1214_35_0 = spill1214_2;
        break forward_join_35;
    }
    if (!((((com.moon.pc)(spill1214_2)).t < this.u))) {
        break forward_join_34;
    }
    forwardValue1214_36_0 = this.u;
    break forward_join_36;
    }
    forwardValue1214_35_0 = this;
    }
    forwardValue1214_36_0 = ((com.moon.pc)(forwardValue1214_35_0)).t;
    }
    life8_46 = forwardValue1214_36_0;
    life9_57 = ((this.m - ((java.lang.String)(this.l)).length()) - (life7_28 - life8_46));
    life10_59 = 0;
    spill1214_3 = ((java.lang.String)(this.l)).length();
    if (!((life4_10 == null))) {
        forwardValue1214_65_0 = spill1214_3;
        break forward_join_65;
    }
    if (!((spill1214_3 > 0))) {
        break forward_join_64;
    }
    life5_6 = __sourceIntrinsic_d1c1922d1ba0_invokedynamic1214_18(life5_6, ((java.lang.String)(this.l)).substring(((int)(0)), ((int)(life7_28))));
    }
    forwardValue1214_65_0 = life9_57;
    }
    if (!((life4_10 == null))) {
        forwardValue1214_87_0 = forwardValue1214_65_0;
        break forward_join_87;
    }
    if (!((forwardValue1214_65_0 < ((java.lang.String)(life6_9)).length()))) {
        break forward_join_81;
    }
    life5_6 = __sourceIntrinsic_d1c1922d1ba0_invokedynamic1214_21(life5_6, ((java.lang.String)(life6_9)).substring(((int)(0)), ((int)(life9_57))));
    life10_94 = life9_57;
    if (!((life4_10 != null))) {
        break forward_join_88;
    }
    }
    life5_6 = __sourceIntrinsic_d1c1922d1ba0_invokedynamic1214_22(life5_6, life6_9);
    forwardValue1214_87_0 = ((java.lang.String)(life6_9)).length();
    }
    life10_94 = forwardValue1214_87_0;
    }
    spill1214_4 = ((java.lang.String)(this.l)).length();
    if (!((life4_10 == null))) {
        forwardValue1214_114_0 = spill1214_4;
        break forward_join_114;
    }
    if (!((spill1214_4 > 0))) {
        break forward_join_108;
    }
    spill1214_5 = life8_46;
    if (!((life4_10 == null))) {
        forwardValue1214_114_0 = spill1214_5;
        break forward_join_114;
    }
    if (!((spill1214_5 < ((java.lang.String)(this.l)).length()))) {
        break forward_join_108;
    }
    life5_6 = __sourceIntrinsic_d1c1922d1ba0_invokedynamic1214_30(life5_6, ((java.lang.String)(this.l)).substring(((int)(life8_46))));
    }
    spill1214_6 = this;
    if (!((life4_10 == null))) {
        forwardValue1214_127_0 = spill1214_6;
        break forward_join_127;
    }
    forwardValue1214_114_0 = ((((com.google.common.base.Predicate)(((com.moon.pc)(spill1214_6)).z)).apply(((java.lang.Object)(life5_6)))) ? 1 : 0);
    }
    if (!((forwardValue1214_114_0 != 0))) {
        break forward_join_138;
    }
    this.l = ((java.lang.String)(life5_6));
    ((com.moon.pc)(this)).c(((int)(((life7_28 - this.u) + life10_94))));
    forwardValue1214_127_0 = this;
    }
    spill1214_7 = ((com.moon.pc)(forwardValue1214_127_0)).y;
    if (!((life4_10 == null))) {
        forwardValue1214_133_0 = spill1214_7;
        break forward_join_133;
    }
    if (!((spill1214_7 != null))) {
        break forward_join_138;
    }
    forwardValue1214_133_0 = this.y;
    }
    ((moom.hX)(forwardValue1214_133_0)).a(((int)(this.f)), ((java.lang.String)(this.l)));
    }
    if (!((net.minecraft.entity.Entity.b__ArrayString() != null))) {
        break forward_join_143;
    }
    com.moon.mz.b(((java.lang.String[])(new java.lang.String[1])));
    }
    return;
}


public void b(boolean p0) {
com.moon.pc forwardValue1215_19_0;
    com.moon.pc spill1215_0;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_21: {
    forward_join_19: {
    forward_join_18: {
    life2_3 = (com.moon.pc.B ^ 41827714136338L);
    life4_5 = com.moon.mz.b__ArrayString();
    if (!((life4_5 == null))) {
        break forward_join_21;
    }
    if (!(p0)) {
        break forward_join_18;
    }
    spill1215_0 = this;
    if (!((life4_5 == null))) {
        forwardValue1215_19_0 = spill1215_0;
        break forward_join_19;
    }
    if (!((!((com.moon.pc)(spill1215_0)).q))) {
        break forward_join_18;
    }
    this.n = ((int)(0));
    }
    forwardValue1215_19_0 = this;
    }
    ((com.moon.pc)(forwardValue1215_19_0)).q = ((boolean)(p0));
    }
    return;
}


public boolean b__Boolean() {
return ((((this.q) ? 1 : 0)) != 0);
}


public int b() {
return this.m;
}


public void e(boolean p0) {
this.x = ((boolean)(p0));
    return;
}


public void e(int p0) {
this.t = ((int)(p0));
    int local2 = ((java.lang.String)(this.l)).length();
    this.t = ((int)(moom.Dr.a(((int)(this.t)), ((int)(0)), ((int)(local2)))));
    ((com.moon.pc)(this)).h(((int)(this.t)));
    return;
}


public int e() {
com.moon.pc forwardValue1219_21_0;
    int forwardValue1219_22_0;
    com.moon.pc spill1219_0;
    long life1_3;
    java.lang.String[] life3_5;
    forward_join_22: {
    forward_join_21: {
    forward_join_20: {
    life1_3 = (com.moon.pc.B ^ 52492021019461L);
    life3_5 = com.moon.mz.b__ArrayString();
    spill1219_0 = this;
    if (!((life3_5 == null))) {
        forwardValue1219_21_0 = spill1219_0;
        break forward_join_21;
    }
    if (!(((com.moon.pc)(spill1219_0)).a__Boolean())) {
        break forward_join_20;
    }
    forwardValue1219_22_0 = (this.h - __sourceIntrinsic_c4b63a62bb23_invokedynamic1219_4(30937, (912540092145049346L ^ life1_3)));
    break forward_join_22;
    }
    forwardValue1219_21_0 = this;
    }
    forwardValue1219_22_0 = ((com.moon.pc)(forwardValue1219_21_0)).h;
    }
    return forwardValue1219_22_0;
}


public void c__Void() {
((com.moon.pc)(this)).e(((int)(((java.lang.String)(this.l)).length())));
    return;
}


public void c(int p0) {
((com.moon.pc)(this)).e(((int)((this.u + p0))));
    return;
}


public int c() {
return this.t;
}


public boolean c__Boolean() {
return ((((this.x) ? 1 : 0)) != 0);
}


public java.lang.String c__String() {
com.moon.pc forwardValue1216_17_0;
    int forwardValue1216_18_0;
    com.moon.pc forwardValue1216_30_0;
    int forwardValue1216_31_0;
    com.moon.pc spill1216_0;
    com.moon.pc spill1216_1;
    long life1_3;
    java.lang.String[] life3_5;
    int life4_23;
    int life5_41;
    forward_join_31: {
    forward_join_30: {
    forward_join_29: {
    forward_join_18: {
    forward_join_17: {
    forward_join_16: {
    life1_3 = (com.moon.pc.B ^ 1861415352685L);
    life3_5 = com.moon.mz.b__ArrayString();
    spill1216_0 = this;
    if (!((life3_5 == null))) {
        forwardValue1216_17_0 = spill1216_0;
        break forward_join_17;
    }
    if (!((((com.moon.pc)(spill1216_0)).t < this.u))) {
        break forward_join_16;
    }
    forwardValue1216_18_0 = this.t;
    break forward_join_18;
    }
    forwardValue1216_17_0 = this;
    }
    forwardValue1216_18_0 = ((com.moon.pc)(forwardValue1216_17_0)).u;
    }
    life4_23 = forwardValue1216_18_0;
    spill1216_1 = this;
    if (!((life3_5 == null))) {
        forwardValue1216_30_0 = spill1216_1;
        break forward_join_30;
    }
    if (!((((com.moon.pc)(spill1216_1)).t < this.u))) {
        break forward_join_29;
    }
    forwardValue1216_31_0 = this.u;
    break forward_join_31;
    }
    forwardValue1216_30_0 = this;
    }
    forwardValue1216_31_0 = ((com.moon.pc)(forwardValue1216_30_0)).t;
    }
    life5_41 = forwardValue1216_31_0;
    return ((java.lang.String)(this.l)).substring(((int)(life4_23)), ((int)(life5_41)));
}


public void c(boolean p0) {
this.r = ((boolean)(p0));
    return;
}


public void h(int p0) {
int forwardValue1220_18_0;
    int forwardValue1220_22_0;
    com.moon.pc forwardValue1220_32_0;
    int forwardValue1220_42_0;
    int forwardValue1220_80_0;
    int forwardValue1220_80_1;
    int forwardValue1220_96_0;
    int forwardValue1220_96_1;
    java.lang.String[] spill1220_0;
    int spill1220_1;
    com.moon.pc spill1220_2;
    int spill1220_3;
    int spill1220_4;
    int spill1220_5;
    long life2_3;
    int life5_8;
    java.lang.String[] life4_9;
    int life6_60;
    java.lang.String life7_70;
    int life8_76;
    forward_join_113: {
    forward_join_106: {
    forward_join_96: {
    forward_join_93: {
    forward_join_80: {
    forward_join_78: {
    forward_join_42: {
    forward_join_40: {
    forward_join_32: {
    forward_join_23: {
    forward_join_22: {
    forward_join_18: {
    forward_join_17: {
    life2_3 = (com.moon.pc.B ^ 113822072503477L);
    spill1220_0 = com.moon.mz.b__ArrayString();
    life5_8 = ((java.lang.String)(this.l)).length();
    life4_9 = spill1220_0;
    spill1220_1 = p0;
    if (!((life4_9 == null))) {
        forwardValue1220_18_0 = spill1220_1;
        break forward_join_18;
    }
    if (!((spill1220_1 > life5_8))) {
        break forward_join_17;
    }
    p0 = life5_8;
    }
    forwardValue1220_18_0 = p0;
    }
    if (!((life4_9 == null))) {
        forwardValue1220_22_0 = forwardValue1220_18_0;
        break forward_join_22;
    }
    if (!((forwardValue1220_18_0 < 0))) {
        break forward_join_23;
    }
    forwardValue1220_22_0 = 0;
    }
    p0 = forwardValue1220_22_0;
    }
    this.u = ((int)(p0));
    spill1220_2 = this;
    if (!((life4_9 == null))) {
        forwardValue1220_32_0 = spill1220_2;
        break forward_join_32;
    }
    if (!((((com.moon.pc)(spill1220_2)).g != null))) {
        break forward_join_113;
    }
    forwardValue1220_32_0 = this;
    }
    spill1220_3 = ((com.moon.pc)(forwardValue1220_32_0)).s;
    if (!((life4_9 == null))) {
        forwardValue1220_42_0 = spill1220_3;
        break forward_join_42;
    }
    if (!((spill1220_3 > life5_8))) {
        break forward_join_40;
    }
    this.s = ((int)(life5_8));
    }
    forwardValue1220_42_0 = ((com.moon.pc)(this)).e();
    }
    life6_60 = forwardValue1220_42_0;
    life7_70 = ((net.minecraft.client.gui.FontRenderer)(this.g)).a__String(((java.lang.String)(((java.lang.String)(this.l)).substring(((int)(this.s))))), ((int)(life6_60)));
    life8_76 = (((java.lang.String)(life7_70)).length() + this.s);
    spill1220_4 = p0;
    spill1220_5 = this.s;
    if (!((life4_9 == null))) {
        forwardValue1220_80_0 = spill1220_4;
        forwardValue1220_80_1 = spill1220_5;
        break forward_join_80;
    }
    if (!((spill1220_4 == spill1220_5))) {
        break forward_join_78;
    }
    com.moon.pc __stackOp1220_17_0 = this;
    ((com.moon.pc)(__stackOp1220_17_0)).s = ((int)((((com.moon.pc)(__stackOp1220_17_0)).s - ((java.lang.String)(((net.minecraft.client.gui.FontRenderer)(this.g)).a(((java.lang.String)(this.l)), ((int)(life6_60)), ((boolean)(true))))).length())));
    }
    forwardValue1220_80_0 = p0;
    forwardValue1220_80_1 = life8_76;
    }
    if (!((life4_9 == null))) {
        forwardValue1220_96_0 = forwardValue1220_80_0;
        forwardValue1220_96_1 = forwardValue1220_80_1;
        break forward_join_96;
    }
    if (!((forwardValue1220_80_0 > forwardValue1220_80_1))) {
        break forward_join_93;
    }
    com.moon.pc __stackOp1220_24_0 = this;
    ((com.moon.pc)(__stackOp1220_24_0)).s = ((int)((((com.moon.pc)(__stackOp1220_24_0)).s + (p0 - life8_76))));
    if (!((life4_9 != null))) {
        break forward_join_106;
    }
    }
    forwardValue1220_96_0 = p0;
    forwardValue1220_96_1 = this.s;
    }
    if (!((forwardValue1220_96_0 <= forwardValue1220_96_1))) {
        break forward_join_106;
    }
    com.moon.pc __stackOp1220_28_0 = this;
    ((com.moon.pc)(__stackOp1220_28_0)).s = ((int)((((com.moon.pc)(__stackOp1220_28_0)).s - (this.s - p0))));
    }
    this.s = ((int)(moom.Dr.a(((int)(this.s)), ((int)(0)), ((int)(life5_8)))));
    }
    return;
}


public void f(int p0) {
this.v = ((int)(p0));
    return;
}


public void d(int p0) {
com.moon.pc forwardValue1217_17_0;
    java.lang.String[] spill1217_0;
    com.moon.pc spill1217_1;
    long life2_3;
    java.lang.String[] life4_8;
    forward_join_23: {
    forward_join_17: {
    life2_3 = (com.moon.pc.B ^ 136381383317043L);
    spill1217_0 = com.moon.mz.b__ArrayString();
    this.m = ((int)(p0));
    life4_8 = spill1217_0;
    spill1217_1 = this;
    if (!((life4_8 == null))) {
        forwardValue1217_17_0 = spill1217_1;
        break forward_join_17;
    }
    if (!((((java.lang.String)(((com.moon.pc)(spill1217_1)).l)).length() > p0))) {
        break forward_join_23;
    }
    forwardValue1217_17_0 = this;
    }
    ((com.moon.pc)(forwardValue1217_17_0)).l = ((java.lang.String)(((java.lang.String)(this.l)).substring(((int)(0)), ((int)(p0)))));
    }
    return;
}


public void d(boolean p0) {
this.p = ((boolean)(p0));
    return;
}


public int d() {
return this.u;
}


public void d__Void() {
com.moon.pc forwardValue1218_54_0;
    int forwardValue1218_55_0;
    int forwardValue1218_84_0;
    int forwardValue1218_90_0;
    int forwardValue1218_92_0;
    int forwardValue1218_108_0;
    int forwardValue1218_112_0;
    int forwardValue1218_116_0;
    int forwardValue1218_118_0;
    com.moon.pc forwardValue1218_130_0;
    float forwardValue1218_131_0;
    com.moon.pc forwardValue1218_153_0;
    float forwardValue1218_154_0;
    int forwardValue1218_168_0;
    java.lang.String forwardValue1218_179_0;
    int forwardValue1218_206_0;
    int forwardValue1218_221_0;
    int forwardValue1218_223_0;
    float forwardValue1218_239_0;
    int forwardValue1218_243_0;
    int forwardValue1218_254_0;
    int forwardValue1218_258_0;
    int forwardValue1218_262_0;
    int forwardValue1218_339_0;
    int forwardValue1218_353_0;
    com.moon.pc spill1218_0;
    int spill1218_1;
    boolean spill1218_2;
    com.moon.pc spill1218_3;
    com.moon.pc spill1218_4;
    int spill1218_5;
    int spill1218_6;
    int spill1218_7;
    int spill1218_8;
    long life1_3;
    java.lang.String[] life3_5;
    com.moon.jm life4_13;
    com.moon.hW life5_20;
    com.moon.hW life6_25;
    int life7_60;
    int life8_66;
    int life9_72;
    java.lang.String life10_83;
    int life11_106;
    int life12_144;
    float life13_162;
    float life14_190;
    float life15_192;
    java.lang.String life16_226;
    int life16_282;
    float life17_284;
    float life15_374;
    float life18_378;
    int life19_450;
    float life20_459;
    forward_join_385: {
    forward_join_381: {
    forward_join_353: {
    forward_join_339: {
    forward_join_338: {
    forward_join_323: {
    forward_join_296: {
    forward_join_262: {
    forward_join_258: {
    forward_join_254: {
    forward_join_252: {
    forward_join_243: {
    forward_join_242: {
    forward_join_239: {
    forward_join_238: {
    forward_join_223: {
    forward_join_222: {
    forward_join_221: {
    forward_join_220: {
    forward_join_206: {
    forward_join_204: {
    forward_join_179: {
    forward_join_178: {
    forward_join_168: {
    forward_join_166: {
    forward_join_154: {
    forward_join_153: {
    forward_join_152: {
    forward_join_131: {
    forward_join_130: {
    forward_join_129: {
    forward_join_118: {
    forward_join_117: {
    forward_join_116: {
    forward_join_112: {
    forward_join_108: {
    forward_join_92: {
    forward_join_91: {
    forward_join_90: {
    forward_join_84: {
    forward_join_55: {
    forward_join_54: {
    forward_join_53: {
    life1_3 = (com.moon.pc.B ^ 82831256007703L);
    life3_5 = com.moon.mz.b__ArrayString();
    if (!(((com.moon.pc)(this)).c__Boolean())) {
        break forward_join_385;
    }
    life4_13 = ((com.moon.jo)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__jo())).a(((com.moon.ce)(com.moon.ce.ROBOTO_MEDIUM)));
    life5_20 = ((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.MSDF))))).a(((com.moon.jm)(life4_13))))).a();
    life6_25 = ((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.ROUNDED_RECTANGLE))))).a();
    ((com.moon.hW)(life6_25)).a(((com.moon.iX)(com.moon.i3.a(((float)(this.j)), ((float)((this.k - 0x1.0p-1f))), ((float)(((float) this.h))), ((float)(((float) this.i))), ((float)(0x1.8p2f)), ((int)(((com.v)(this.A)).f()))))));
    spill1218_0 = this;
    if (!((life3_5 == null))) {
        forwardValue1218_54_0 = spill1218_0;
        break forward_join_54;
    }
    if (!(((com.moon.pc)(spill1218_0)).r)) {
        break forward_join_53;
    }
    forwardValue1218_55_0 = this.v;
    break forward_join_55;
    }
    forwardValue1218_54_0 = this;
    }
    forwardValue1218_55_0 = ((com.moon.pc)(forwardValue1218_54_0)).w;
    }
    life7_60 = forwardValue1218_55_0;
    life8_66 = (this.t - this.s);
    life9_72 = (this.u - this.s);
    life10_83 = ((net.minecraft.client.gui.FontRenderer)(this.g)).a__String(((java.lang.String)(((java.lang.String)(this.l)).substring(((int)(this.s))))), ((int)(((com.moon.pc)(this)).e())));
    spill1218_1 = life8_66;
    if (!((life3_5 == null))) {
        forwardValue1218_84_0 = spill1218_1;
        break forward_join_84;
    }
    if (!((spill1218_1 >= 0))) {
        break forward_join_91;
    }
    forwardValue1218_84_0 = life8_66;
    }
    if (!((life3_5 == null))) {
        forwardValue1218_90_0 = forwardValue1218_84_0;
        break forward_join_90;
    }
    if (!((forwardValue1218_84_0 <= ((java.lang.String)(life10_83)).length()))) {
        break forward_join_91;
    }
    forwardValue1218_90_0 = 1;
    }
    forwardValue1218_92_0 = forwardValue1218_90_0;
    break forward_join_92;
    }
    forwardValue1218_92_0 = 0;
    }
    life11_106 = forwardValue1218_92_0;
    spill1218_2 = this.q;
    if (!((life3_5 == null))) {
        forwardValue1218_108_0 = ((spill1218_2) ? 1 : 0);
        break forward_join_108;
    }
    if (!(spill1218_2)) {
        break forward_join_117;
    }
    forwardValue1218_108_0 = ((this.n / __sourceIntrinsic_a91ecd6db48f_invokedynamic1218_41(9523, (2287332466902746559L ^ life1_3))) % 2);
    }
    if (!((life3_5 == null))) {
        forwardValue1218_112_0 = forwardValue1218_108_0;
        break forward_join_112;
    }
    if (!((forwardValue1218_108_0 == 0))) {
        break forward_join_117;
    }
    forwardValue1218_112_0 = life11_106;
    }
    if (!((life3_5 == null))) {
        forwardValue1218_116_0 = forwardValue1218_112_0;
        break forward_join_116;
    }
    if (!((forwardValue1218_112_0 != 0))) {
        break forward_join_117;
    }
    forwardValue1218_116_0 = 1;
    }
    forwardValue1218_118_0 = forwardValue1218_116_0;
    break forward_join_118;
    }
    forwardValue1218_118_0 = 0;
    }
    life12_144 = forwardValue1218_118_0;
    spill1218_3 = this;
    if (!((life3_5 == null))) {
        forwardValue1218_130_0 = spill1218_3;
        break forward_join_130;
    }
    if (!(((com.moon.pc)(spill1218_3)).o)) {
        break forward_join_129;
    }
    forwardValue1218_131_0 = (this.j + 0x1.0p2f);
    break forward_join_131;
    }
    forwardValue1218_130_0 = this;
    }
    forwardValue1218_131_0 = ((com.moon.pc)(forwardValue1218_130_0)).j;
    }
    life13_162 = forwardValue1218_131_0;
    spill1218_4 = this;
    if (!((life3_5 == null))) {
        forwardValue1218_153_0 = spill1218_4;
        break forward_join_153;
    }
    if (!(((com.moon.pc)(spill1218_4)).o)) {
        break forward_join_152;
    }
    forwardValue1218_154_0 = (this.k + (((float) (this.i - __sourceIntrinsic_a91ecd6db48f_invokedynamic1218_48(29830, (1506412085847397388L ^ life1_3)))) / 0x1.0p1f));
    break forward_join_154;
    }
    forwardValue1218_153_0 = this;
    }
    forwardValue1218_154_0 = ((com.moon.pc)(forwardValue1218_153_0)).k;
    }
    life14_190 = forwardValue1218_154_0;
    life15_192 = life13_162;
    spill1218_5 = life9_72;
    if (!((life3_5 == null))) {
        forwardValue1218_168_0 = spill1218_5;
        break forward_join_168;
    }
    if (!((spill1218_5 > ((java.lang.String)(life10_83)).length()))) {
        break forward_join_166;
    }
    life9_72 = ((java.lang.String)(life10_83)).length();
    }
    forwardValue1218_168_0 = ((java.lang.String)(life10_83)).length();
    }
    if (!((life3_5 == null))) {
        forwardValue1218_206_0 = forwardValue1218_168_0;
        break forward_join_206;
    }
    if (!((forwardValue1218_168_0 > 0))) {
        break forward_join_204;
    }
    if (!((life11_106 != 0))) {
        break forward_join_178;
    }
    forwardValue1218_179_0 = ((java.lang.String)(life10_83)).substring(((int)(0)), ((int)(life8_66)));
    break forward_join_179;
    }
    forwardValue1218_179_0 = life10_83;
    }
    life16_226 = forwardValue1218_179_0;
    ((com.moon.jm)(life4_13)).a(((com.moon.hW)(life5_20)), ((java.lang.String)(life16_226)), ((float)(0x1.2p3f)), ((float)(life13_162)), ((float)((life14_190 - 0x1.8p0f))), ((int)(((com.v)(this.A)).a())), ((boolean)(false)));
    life15_192 = (life15_192 + (((float) ((int) ((com.moon.jm)(life4_13)).a(((java.lang.String)(life16_226)), ((float)(0x1.2p3f))))) + 0x1.0p1f));
    }
    forwardValue1218_206_0 = this.t;
    }
    if (!((life3_5 == null))) {
        forwardValue1218_221_0 = forwardValue1218_206_0;
        break forward_join_221;
    }
    if (!((forwardValue1218_206_0 >= ((java.lang.String)(this.l)).length()))) {
        break forward_join_220;
    }
    spill1218_6 = ((java.lang.String)(this.l)).length();
    if (!((life3_5 == null))) {
        forwardValue1218_221_0 = spill1218_6;
        break forward_join_221;
    }
    if (!((spill1218_6 >= ((com.moon.pc)(this)).b()))) {
        break forward_join_222;
    }
    }
    forwardValue1218_221_0 = 1;
    }
    forwardValue1218_223_0 = forwardValue1218_221_0;
    break forward_join_223;
    }
    forwardValue1218_223_0 = 0;
    }
    life16_282 = forwardValue1218_223_0;
    life17_284 = life15_192;
    spill1218_7 = life11_106;
    if (!((life3_5 == null))) {
        forwardValue1218_243_0 = spill1218_7;
        break forward_join_243;
    }
    if (!((spill1218_7 == 0))) {
        break forward_join_242;
    }
    if (!((life8_66 > 0))) {
        break forward_join_238;
    }
    forwardValue1218_239_0 = (life13_162 + ((float) this.h));
    break forward_join_239;
    }
    forwardValue1218_239_0 = life13_162;
    }
    life17_284 = forwardValue1218_239_0;
    if (!((life3_5 != null))) {
        break forward_join_252;
    }
    }
    forwardValue1218_243_0 = life16_282;
    }
    if (!((life3_5 == null))) {
        forwardValue1218_254_0 = forwardValue1218_243_0;
        break forward_join_254;
    }
    if (!((forwardValue1218_243_0 != 0))) {
        break forward_join_252;
    }
    life17_284 = life15_192;
    life15_192 = (life15_192 - 0x1.0p0f);
    }
    forwardValue1218_254_0 = ((java.lang.String)(life10_83)).length();
    }
    if (!((life3_5 == null))) {
        forwardValue1218_258_0 = forwardValue1218_254_0;
        break forward_join_258;
    }
    if (!((forwardValue1218_254_0 > 0))) {
        break forward_join_296;
    }
    forwardValue1218_258_0 = life11_106;
    }
    if (!((life3_5 == null))) {
        forwardValue1218_262_0 = forwardValue1218_258_0;
        break forward_join_262;
    }
    if (!((forwardValue1218_258_0 != 0))) {
        break forward_join_296;
    }
    forwardValue1218_262_0 = life8_66;
    }
    if (!((forwardValue1218_262_0 < ((java.lang.String)(life10_83)).length()))) {
        break forward_join_296;
    }
    ((com.moon.jm)(life4_13)).a(((com.moon.hW)(life5_20)), ((java.lang.String)(((java.lang.String)(life10_83)).substring(((int)(life8_66))))), ((float)(0x1.2p3f)), ((float)((life15_192 + 0x1.0p1f))), ((float)((life14_190 - 0x1.8p0f))), ((int)(((com.v)(this.A)).a())), ((boolean)(false)));
    life15_374 = (life15_192 + (((float) ((int) ((com.moon.jm)(life4_13)).a(((java.lang.String)(__sourceIntrinsic_a91ecd6db48f_invokedynamic1218_72(((java.lang.String)(life10_83)).substring(((int)(life8_66)))))), ((float)(0x1.2p3f))))) + 0x1.0p1f));
    }
    life18_378 = ((com.moon.jm)(life4_13)).a(((float)(0x1.2p3f)));
    spill1218_8 = life12_144;
    if (!((life3_5 == null))) {
        forwardValue1218_339_0 = spill1218_8;
        break forward_join_339;
    }
    if (!((spill1218_8 != 0))) {
        break forward_join_338;
    }
    if (!((life16_282 != 0))) {
        break forward_join_323;
    }
    ((com.moon.hW)(life6_25)).a(((com.moon.iX)(com.moon.i3.a(((float)((life17_284 - 0x1.0p0f))), ((float)((life14_190 - 0x1.0p1f))), ((float)(0x1.0p1f)), ((float)(life18_378)), ((float)(0x0.0p0f)), ((int)(((com.v)(this.A)).a()))))));
    if (!((life3_5 != null))) {
        break forward_join_338;
    }
    }
    ((com.moon.hW)(life6_25)).a(((com.moon.iX)(com.moon.i3.a(((float)((life17_284 - 0x1.0p0f))), ((float)((life14_190 - 0x1.0p1f))), ((float)(0x1.0p1f)), ((float)(life18_378)), ((float)(0x0.0p0f)), ((int)(((com.v)(this.A)).a()))))));
    }
    forwardValue1218_339_0 = life9_72;
    }
    if (!((life3_5 == null))) {
        forwardValue1218_353_0 = forwardValue1218_339_0;
        break forward_join_353;
    }
    if (!((forwardValue1218_339_0 != life8_66))) {
        break forward_join_381;
    }
    forwardValue1218_353_0 = ((int) (life13_162 + ((com.moon.jm)(life4_13)).a(((java.lang.String)(((java.lang.String)(life10_83)).substring(((int)(0)), ((int)(life9_72))))), ((float)(0x1.2p3f)))));
    }
    life19_450 = forwardValue1218_353_0;
    life20_459 = ((((float) (life19_450 - 1)) - life17_284) + 0x1.0p0f);
    ((com.moon.hW)(life6_25)).a(((com.moon.iX)(com.moon.i3.a(((float)((life17_284 + life20_459))), ((float)((life14_190 - 0x1.0p1f))), ((float)((-life20_459))), ((float)(life18_378)), ((float)(0x0.0p0f)), ((int)(__sourceIntrinsic_a91ecd6db48f_invokedynamic1218_85(5433, (8720366429025858994L ^ life1_3))))))));
    }
    ((com.moon.hW)(life6_25)).b();
    ((com.moon.hW)(life5_20)).b();
    }
    return;
}


public void a(java.lang.String p0) {
int forwardValue1211_15_0;
    boolean spill1211_0;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_32: {
    forward_join_30: {
    forward_join_27: {
    forward_join_15: {
    life2_3 = (com.moon.pc.B ^ 65397926260491L);
    life4_5 = com.moon.mz.b__ArrayString();
    spill1211_0 = ((com.google.common.base.Predicate)(this.z)).apply(((java.lang.Object)(p0)));
    if (!((life4_5 == null))) {
        forwardValue1211_15_0 = ((spill1211_0) ? 1 : 0);
        break forward_join_15;
    }
    if (!(spill1211_0)) {
        break forward_join_32;
    }
    forwardValue1211_15_0 = ((java.lang.String)(p0)).length();
    }
    if (!((forwardValue1211_15_0 > this.m))) {
        break forward_join_27;
    }
    this.l = ((java.lang.String)(((java.lang.String)(p0)).substring(((int)(0)), ((int)(this.m)))));
    if (!((life4_5 != null))) {
        break forward_join_30;
    }
    }
    this.l = ((java.lang.String)(p0));
    }
    ((com.moon.pc)(this)).c__Void();
    }
    return;
}


public java.lang.String a__String() {
return this.l;
}


public void a__Void() {
this.n += 1;
    return;
}


public void a(com.google.common.base.Predicate<java.lang.String> p0) {
this.z = ((com.google.common.base.Predicate)(p0));
    return;
}


public void a__Void(int p0) {
int forwardValue1212_16_0;
    com.moon.pc forwardValue1212_25_0;
    int spill1212_0;
    com.moon.pc spill1212_1;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_32: {
    forward_join_25: {
    forward_join_24: {
    forward_join_16: {
    life2_3 = (com.moon.pc.B ^ 109735117909839L);
    life4_5 = com.moon.mz.b__ArrayString();
    spill1212_0 = ((java.lang.String)(this.l)).length();
    if (!((life4_5 == null))) {
        forwardValue1212_16_0 = spill1212_0;
        break forward_join_16;
    }
    if (!((spill1212_0 != 0))) {
        break forward_join_32;
    }
    spill1212_1 = this;
    if (!((life4_5 == null))) {
        forwardValue1212_25_0 = spill1212_1;
        break forward_join_25;
    }
    forwardValue1212_16_0 = ((com.moon.pc)(spill1212_1)).u;
    }
    if (!((forwardValue1212_16_0 != this.t))) {
        break forward_join_24;
    }
    ((com.moon.pc)(this)).b(((java.lang.String)("")));
    if (!((life4_5 != null))) {
        break forward_join_32;
    }
    }
    forwardValue1212_25_0 = this;
    }
    ((com.moon.pc)(forwardValue1212_25_0)).b(((int)((((com.moon.pc)(this)).a(((int)(p0))) - this.t))));
    }
    return;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral3198_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/pc"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.pc.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 19550;
      if (D[var3] == null) {
         byte[] var4 = new byte[]{
            (byte)(p1 >>> 56),
            (byte)(p1 >>> 48),
            (byte)(p1 >>> 40),
            (byte)(p1 >>> 32),
            (byte)(p1 >>> 24),
            (byte)(p1 >>> 16),
            (byte)(p1 >>> 8),
            (byte)p1
         };
         long var5 = C[var3];
         byte[] var7 = new byte[]{
            (byte)(var5 >>> 56),
            (byte)(var5 >>> 48),
            (byte)(var5 >>> 40),
            (byte)(var5 >>> 32),
            (byte)(var5 >>> 24),
            (byte)(var5 >>> 16),
            (byte)(var5 >>> 8),
            (byte)var5
         };
         Long var8 = Thread.currentThread().getId();
         Object[] var9 = (Object[])E.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               E.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/moon/pc", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         D[var3] = var15;
      }

      return D[var3];
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(moom.hX p0) {
this.y = ((moom.hX)(p0));
    return;
}


public void a(int p0, int p1, int p2) {
int forwardValue1209_23_0;
    int forwardValue1209_31_0;
    int forwardValue1209_43_0;
    int forwardValue1209_47_0;
    int forwardValue1209_49_0;
    int forwardValue1209_60_0;
    int forwardValue1209_64_0;
    int forwardValue1209_68_0;
    int forwardValue1209_77_0;
    com.moon.pc forwardValue1209_85_0;
    int spill1209_0;
    boolean spill1209_1;
    com.moon.pc spill1209_2;
    long life4_3;
    java.lang.String[] life6_5;
    int life7_70;
    int life8_116;
    java.lang.String life9_139;
    forward_join_106: {
    forward_join_85: {
    forward_join_84: {
    forward_join_77: {
    forward_join_68: {
    forward_join_64: {
    forward_join_60: {
    forward_join_58: {
    forward_join_49: {
    forward_join_48: {
    forward_join_47: {
    forward_join_43: {
    forward_join_31: {
    forward_join_23: {
    life4_3 = (com.moon.pc.B ^ 29474032458209L);
    life6_5 = com.moon.mz.b__ArrayString();
    spill1209_0 = recovery.source.CarrierOps.fcmpl(((float)(((float) p0))), ((float)(this.j)));
    if (!((life6_5 == null))) {
        forwardValue1209_23_0 = spill1209_0;
        break forward_join_23;
    }
    if (!((spill1209_0 >= 0))) {
        break forward_join_48;
    }
    forwardValue1209_23_0 = recovery.source.CarrierOps.fcmpg(((float)(((float) p0))), ((float)((this.j + ((float) this.h)))));
    }
    if (!((life6_5 == null))) {
        forwardValue1209_31_0 = forwardValue1209_23_0;
        break forward_join_31;
    }
    if (!((forwardValue1209_23_0 < 0))) {
        break forward_join_48;
    }
    forwardValue1209_31_0 = recovery.source.CarrierOps.fcmpl(((float)(((float) p1))), ((float)(this.k)));
    }
    if (!((life6_5 == null))) {
        forwardValue1209_43_0 = forwardValue1209_31_0;
        break forward_join_43;
    }
    if (!((forwardValue1209_31_0 >= 0))) {
        break forward_join_48;
    }
    forwardValue1209_43_0 = recovery.source.CarrierOps.fcmpg(((float)(((float) p1))), ((float)((this.k + ((float) this.i)))));
    }
    if (!((life6_5 == null))) {
        forwardValue1209_47_0 = forwardValue1209_43_0;
        break forward_join_47;
    }
    if (!((forwardValue1209_43_0 < 0))) {
        break forward_join_48;
    }
    forwardValue1209_47_0 = 1;
    }
    forwardValue1209_49_0 = forwardValue1209_47_0;
    break forward_join_49;
    }
    forwardValue1209_49_0 = 0;
    }
    life7_70 = forwardValue1209_49_0;
    spill1209_1 = this.p;
    if (!((life6_5 == null))) {
        forwardValue1209_60_0 = ((spill1209_1) ? 1 : 0);
        break forward_join_60;
    }
    if (!(spill1209_1)) {
        break forward_join_58;
    }
    ((com.moon.pc)(this)).b(((boolean)__sourceIntrinsic_integerToBoolean((life7_70))));
    }
    forwardValue1209_60_0 = ((this.q) ? 1 : 0);
    }
    if (!((life6_5 == null))) {
        forwardValue1209_64_0 = forwardValue1209_60_0;
        break forward_join_64;
    }
    if (!((forwardValue1209_60_0 != 0))) {
        break forward_join_106;
    }
    forwardValue1209_64_0 = life7_70;
    }
    if (!((life6_5 == null))) {
        forwardValue1209_68_0 = forwardValue1209_64_0;
        break forward_join_68;
    }
    if (!((forwardValue1209_64_0 != 0))) {
        break forward_join_106;
    }
    forwardValue1209_68_0 = p2;
    }
    if (!((life6_5 == null))) {
        forwardValue1209_77_0 = forwardValue1209_68_0;
        break forward_join_77;
    }
    if (!((forwardValue1209_68_0 == 0))) {
        break forward_join_106;
    }
    forwardValue1209_77_0 = (p0 - moom.Dr.d(((double)(((double) this.j)))));
    }
    life8_116 = forwardValue1209_77_0;
    spill1209_2 = this;
    if (!((life6_5 == null))) {
        forwardValue1209_85_0 = spill1209_2;
        break forward_join_85;
    }
    if (!(((com.moon.pc)(spill1209_2)).o)) {
        break forward_join_84;
    }
    life8_116 += -4;
    }
    forwardValue1209_85_0 = this;
    }
    life9_139 = ((net.minecraft.client.gui.FontRenderer)(((com.moon.pc)(forwardValue1209_85_0)).g)).a__String(((java.lang.String)(((java.lang.String)(this.l)).substring(((int)(this.s))))), ((int)(((com.moon.pc)(this)).e())));
    ((com.moon.pc)(this)).e(((int)((((java.lang.String)(((net.minecraft.client.gui.FontRenderer)(this.g)).a__String(((java.lang.String)(life9_139)), ((int)(life8_116))))).length() + this.s))));
    }
    return;
}


public boolean a(char p0, int p1) {
int forwardValue110_15_0;
    int forwardValue110_27_0;
    int forwardValue110_37_0;
    int forwardValue110_49_0;
    int forwardValue110_52_0;
    int forwardValue110_67_0;
    int forwardValue110_69_0;
    int forwardValue110_88_0;
    int forwardValue110_95_0;
    int forwardValue110_131_0;
    int forwardValue110_168_0;
    int forwardValue110_210_0;
    int forwardValue110_217_0;
    int forwardValue110_220_0;
    int forwardValue110_233_0;
    int forwardValue110_235_0;
    boolean spill110_0;
    boolean spill110_1;
    boolean spill110_2;
    boolean spill110_3;
    boolean spill110_4;
    boolean spill110_5;
    boolean spill110_6;
    boolean spill110_7;
    boolean spill110_8;
    boolean spill110_9;
    long life3_3;
    java.lang.String[] life5_5;
    forward_join_235: {
    forward_join_234: {
    forward_join_233: {
    forward_join_232: {
    forward_join_220: {
    forward_join_218: {
    forward_join_217: {
    forward_join_216: {
    forward_join_210: {
    forward_join_208: {
    forward_join_194: {
    forward_join_192: {
    forward_join_190: {
    forward_join_181: {
    forward_join_179: {
    forward_join_176: {
    forward_join_168: {
    forward_join_167: {
    forward_join_159: {
    forward_join_144: {
    forward_join_142: {
    forward_join_139: {
    forward_join_131: {
    forward_join_130: {
    forward_join_122: {
    forward_join_107: {
    forward_join_105: {
    forward_join_103: {
    forward_join_96: {
    forward_join_95: {
    forward_join_94: {
    forward_join_88: {
    forward_join_86: {
    forward_join_72: {
    forward_join_69: {
    forward_join_68: {
    forward_join_67: {
    forward_join_66: {
    forward_join_52: {
    forward_join_50: {
    forward_join_49: {
    forward_join_48: {
    forward_join_37: {
    forward_join_35: {
    forward_join_27: {
    forward_join_25: {
    forward_join_15: {
    forward_join_13: {
    life3_3 = (com.moon.pc.B ^ 125978118661928L);
    life5_5 = com.moon.mz.b__ArrayString();
    spill110_0 = this.q;
    if (!((life5_5 == null))) {
        forwardValue110_15_0 = ((spill110_0) ? 1 : 0);
        break forward_join_15;
    }
    if (!((!spill110_0))) {
        break forward_join_13;
    }
    return ((0) != 0);
    }
    forwardValue110_15_0 = ((net.minecraft.client.gui.GuiScreen.d(((int)(p1)))) ? 1 : 0);
    }
    if (!((life5_5 == null))) {
        forwardValue110_27_0 = forwardValue110_15_0;
        break forward_join_27;
    }
    if (!((forwardValue110_15_0 != 0))) {
        break forward_join_25;
    }
    ((com.moon.pc)(this)).c__Void();
    ((com.moon.pc)(this)).h(((int)(0)));
    return ((1) != 0);
    }
    forwardValue110_27_0 = ((net.minecraft.client.gui.GuiScreen.c__Boolean(((int)(p1)))) ? 1 : 0);
    }
    if (!((life5_5 == null))) {
        forwardValue110_37_0 = forwardValue110_27_0;
        break forward_join_37;
    }
    if (!((forwardValue110_27_0 != 0))) {
        break forward_join_35;
    }
    net.minecraft.client.gui.GuiScreen.e(((java.lang.String)(((com.moon.pc)(this)).c__String())));
    return ((1) != 0);
    }
    forwardValue110_37_0 = ((net.minecraft.client.gui.GuiScreen.b__Boolean(((int)(p1)))) ? 1 : 0);
    }
    if (!((life5_5 == null))) {
        forwardValue110_52_0 = forwardValue110_37_0;
        break forward_join_52;
    }
    if (!((forwardValue110_37_0 != 0))) {
        break forward_join_50;
    }
    spill110_1 = this.r;
    if (!((life5_5 == null))) {
        forwardValue110_49_0 = ((spill110_1) ? 1 : 0);
        break forward_join_49;
    }
    if (!(spill110_1)) {
        break forward_join_48;
    }
    ((com.moon.pc)(this)).b(((java.lang.String)(net.minecraft.client.gui.GuiScreen.a__StringStatic())));
    }
    forwardValue110_49_0 = 1;
    }
    return ((forwardValue110_49_0) != 0);
    }
    forwardValue110_52_0 = ((net.minecraft.client.gui.GuiScreen.a(((int)(p1)))) ? 1 : 0);
    }
    if (!((life5_5 == null))) {
        forwardValue110_69_0 = forwardValue110_52_0;
        break forward_join_69;
    }
    if (!((forwardValue110_52_0 != 0))) {
        break forward_join_68;
    }
    net.minecraft.client.gui.GuiScreen.e(((java.lang.String)(((com.moon.pc)(this)).c__String())));
    spill110_2 = this.r;
    if (!((life5_5 == null))) {
        forwardValue110_67_0 = ((spill110_2) ? 1 : 0);
        break forward_join_67;
    }
    if (!(spill110_2)) {
        break forward_join_66;
    }
    ((com.moon.pc)(this)).b(((java.lang.String)("")));
    }
    forwardValue110_67_0 = 1;
    }
    return ((forwardValue110_67_0) != 0);
    }
    forwardValue110_69_0 = p1;
    }
    if (!((life5_5 == null))) {
        forwardValue110_220_0 = forwardValue110_69_0;
        break forward_join_220;
    }
    switch (forwardValue110_69_0) {
case 14:
{
        break forward_join_72;
    }
case 199:
{
        break forward_join_96;
    }
case 203:
{
        break forward_join_107;
    }
case 205:
{
        break forward_join_144;
    }
case 207:
{
        break forward_join_181;
    }
case 211:
{
        break forward_join_194;
    }
default:
{
        break forward_join_218;
    }
}
    }
    spill110_3 = net.minecraft.client.gui.GuiScreen.b__BooleanStatic();
    if (!((life5_5 == null))) {
        forwardValue110_88_0 = ((spill110_3) ? 1 : 0);
        break forward_join_88;
    }
    if (!(spill110_3)) {
        break forward_join_86;
    }
    spill110_4 = this.r;
    if (!((life5_5 == null))) {
        forwardValue110_95_0 = ((spill110_4) ? 1 : 0);
        break forward_join_95;
    }
    if (!(spill110_4)) {
        break forward_join_94;
    }
    ((com.moon.pc)(this)).a__Void(((int)(-1)));
    if (!((life5_5 != null))) {
        break forward_join_94;
    }
    }
    forwardValue110_88_0 = ((this.r) ? 1 : 0);
    }
    if (!((life5_5 == null))) {
        forwardValue110_95_0 = forwardValue110_88_0;
        break forward_join_95;
    }
    if (!((forwardValue110_88_0 != 0))) {
        break forward_join_94;
    }
    ((com.moon.pc)(this)).b(((int)(-1)));
    }
    forwardValue110_95_0 = 1;
    }
    return ((forwardValue110_95_0) != 0);
    }
    if (!(net.minecraft.client.gui.GuiScreen.c__Boolean())) {
        break forward_join_103;
    }
    ((com.moon.pc)(this)).h(((int)(0)));
    if (!((life5_5 != null))) {
        break forward_join_105;
    }
    }
    ((com.moon.pc)(this)).b__Void();
    }
    return ((1) != 0);
    }
    spill110_5 = net.minecraft.client.gui.GuiScreen.c__Boolean();
    if (!((life5_5 == null))) {
        forwardValue110_131_0 = ((spill110_5) ? 1 : 0);
        break forward_join_131;
    }
    if (!(spill110_5)) {
        break forward_join_130;
    }
    if (!(net.minecraft.client.gui.GuiScreen.b__BooleanStatic())) {
        break forward_join_122;
    }
    ((com.moon.pc)(this)).h(((int)(((com.moon.pc)(this)).a(((int)(-1)), ((int)(((com.moon.pc)(this)).d()))))));
    if (!((life5_5 != null))) {
        break forward_join_142;
    }
    }
    ((com.moon.pc)(this)).h(((int)((((com.moon.pc)(this)).d() - 1))));
    if (!((life5_5 != null))) {
        break forward_join_142;
    }
    }
    forwardValue110_131_0 = ((net.minecraft.client.gui.GuiScreen.b__BooleanStatic()) ? 1 : 0);
    }
    if (!((forwardValue110_131_0 != 0))) {
        break forward_join_139;
    }
    ((com.moon.pc)(this)).e(((int)(((com.moon.pc)(this)).a(((int)(-1))))));
    if (!((life5_5 != null))) {
        break forward_join_142;
    }
    }
    ((com.moon.pc)(this)).c(((int)(-1)));
    }
    return ((1) != 0);
    }
    spill110_6 = net.minecraft.client.gui.GuiScreen.c__Boolean();
    if (!((life5_5 == null))) {
        forwardValue110_168_0 = ((spill110_6) ? 1 : 0);
        break forward_join_168;
    }
    if (!(spill110_6)) {
        break forward_join_167;
    }
    if (!(net.minecraft.client.gui.GuiScreen.b__BooleanStatic())) {
        break forward_join_159;
    }
    ((com.moon.pc)(this)).h(((int)(((com.moon.pc)(this)).a(((int)(1)), ((int)(((com.moon.pc)(this)).d()))))));
    if (!((life5_5 != null))) {
        break forward_join_179;
    }
    }
    ((com.moon.pc)(this)).h(((int)((((com.moon.pc)(this)).d() + 1))));
    if (!((life5_5 != null))) {
        break forward_join_179;
    }
    }
    forwardValue110_168_0 = ((net.minecraft.client.gui.GuiScreen.b__BooleanStatic()) ? 1 : 0);
    }
    if (!((forwardValue110_168_0 != 0))) {
        break forward_join_176;
    }
    ((com.moon.pc)(this)).e(((int)(((com.moon.pc)(this)).a(((int)(1))))));
    if (!((life5_5 != null))) {
        break forward_join_179;
    }
    }
    ((com.moon.pc)(this)).c(((int)(1)));
    }
    return ((1) != 0);
    }
    if (!(net.minecraft.client.gui.GuiScreen.c__Boolean())) {
        break forward_join_190;
    }
    ((com.moon.pc)(this)).h(((int)(((java.lang.String)(this.l)).length())));
    if (!((life5_5 != null))) {
        break forward_join_192;
    }
    }
    ((com.moon.pc)(this)).c__Void();
    }
    return ((1) != 0);
    }
    spill110_7 = net.minecraft.client.gui.GuiScreen.b__BooleanStatic();
    if (!((life5_5 == null))) {
        forwardValue110_210_0 = ((spill110_7) ? 1 : 0);
        break forward_join_210;
    }
    if (!(spill110_7)) {
        break forward_join_208;
    }
    spill110_8 = this.r;
    if (!((life5_5 == null))) {
        forwardValue110_217_0 = ((spill110_8) ? 1 : 0);
        break forward_join_217;
    }
    if (!(spill110_8)) {
        break forward_join_216;
    }
    ((com.moon.pc)(this)).a__Void(((int)(1)));
    if (!((life5_5 != null))) {
        break forward_join_216;
    }
    }
    forwardValue110_210_0 = ((this.r) ? 1 : 0);
    }
    if (!((life5_5 == null))) {
        forwardValue110_217_0 = forwardValue110_210_0;
        break forward_join_217;
    }
    if (!((forwardValue110_210_0 != 0))) {
        break forward_join_216;
    }
    ((com.moon.pc)(this)).b(((int)(1)));
    }
    forwardValue110_217_0 = 1;
    }
    return ((forwardValue110_217_0) != 0);
    }
    forwardValue110_220_0 = ((moom.CH.a(((char)(p0)))) ? 1 : 0);
    }
    if (!((life5_5 == null))) {
        forwardValue110_235_0 = forwardValue110_220_0;
        break forward_join_235;
    }
    if (!((forwardValue110_220_0 != 0))) {
        break forward_join_234;
    }
    spill110_9 = this.r;
    if (!((life5_5 == null))) {
        forwardValue110_233_0 = ((spill110_9) ? 1 : 0);
        break forward_join_233;
    }
    if (!(spill110_9)) {
        break forward_join_232;
    }
    ((com.moon.pc)(this)).b(((java.lang.String)(java.lang.Character.toString(((char)(p0))))));
    }
    forwardValue110_233_0 = 1;
    }
    return ((forwardValue110_233_0) != 0);
    }
    forwardValue110_235_0 = 0;
    }
    return ((forwardValue110_235_0) != 0);
}


public void a(boolean p0) {
this.o = ((boolean)(p0));
    return;
}


public boolean a__Boolean() {
return ((((this.o) ? 1 : 0)) != 0);
}


public int a() {
return this.f;
}


public int a(int p0) {
return ((com.moon.pc)(this)).a(((int)(p0)), ((int)(((com.moon.pc)(this)).c())));
}


public int a(int p0, int p1) {
return ((com.moon.pc)(this)).a(((int)(p0)), ((int)(p1)), ((boolean)(true)));
}


public int a(int p0, int p1, boolean p2) {
int forestValue162_13_0;
    int forestValue162_15_0;
    int forestValue162_23_0;
    int forestValue162_23_1;
    int forestValue162_54_0;
    int forestValue162_100_0;
    int forestValue162_100_1;
    int forestValue162_105_0;
    int forestValue162_122_0;
    int forestValue162_122_1;
    int forestValue162_157_0;
    int forestValue162_201_0;
    java.lang.String[] spill162_0;
    int spill162_1;
    int spill162_2;
    int spill162_3;
    int spill162_4;
    char spill162_5;
    boolean spill162_6;
    int spill162_7;
    int spill162_8;
    int spill162_9;
    int spill162_10;
    boolean spill162_11;
    int spill162_12;
    char spill162_13;
    char spill162_14;
    int spill162_15;
    int spill162_16;
    char spill162_17;
    int spill162_18;
    long life4_3;
    int life7_6;
    java.lang.String[] life6_7;
    int life8_20;
    int life9_23;
    int life10_25;
    int life11_46;
    forest_join_201: {
    forest_join_200: {
    forest_join_15: {
    forest_join_14: {
    forest_join_13: {
    life4_3 = (com.moon.pc.B ^ 71302362679205L);
    spill162_0 = com.moon.mz.b__ArrayString();
    life7_6 = p1;
    life6_7 = spill162_0;
    spill162_1 = p0;
    if (!((life6_7 == null))) {
        forestValue162_13_0 = spill162_1;
        break forest_join_13;
    }
    if (!((spill162_1 < 0))) {
        break forest_join_14;
    }
    forestValue162_13_0 = 1;
    }
    forestValue162_15_0 = forestValue162_13_0;
    break forest_join_15;
    }
    forestValue162_15_0 = 0;
    }
    life8_20 = forestValue162_15_0;
    life9_23 = java.lang.Math.abs(((int)(p0)));
    life10_25 = 0;
    forest_cycle_21: while (true) {
    forest_join_197: {
    forestValue162_23_0 = life10_25;
    forestValue162_23_1 = life9_23;
    forest_cycle_23: while (true) {
    forest_join_178: {
    forest_join_157: {
    forest_join_131: {
    forest_join_129: {
    forest_join_105: {
    forest_join_82: {
    forest_join_81: {
    forest_join_54: {
    if (!((forestValue162_23_0 < forestValue162_23_1))) {
        break forest_join_200;
    }
    spill162_2 = life8_20;
    if (!((life6_7 == null))) {
        forestValue162_201_0 = spill162_2;
        break forest_join_201;
    }
    if (!((life6_7 == null))) {
        forestValue162_54_0 = spill162_2;
        break forest_join_54;
    }
    if (!((spill162_2 == 0))) {
        break forest_join_131;
    }
    life11_46 = ((java.lang.String)(this.l)).length();
    life7_6 = ((java.lang.String)(this.l)).indexOf(((int)(__sourceIntrinsic_f7c5abbf18cd_invokedynamic162_6(20629, (1016834269834691496L ^ life4_3)))), ((int)(life7_6)));
    spill162_3 = life7_6;
    if (!((life6_7 == null))) {
        forestValue162_105_0 = spill162_3;
        break forest_join_105;
    }
    if (!((spill162_3 == -1))) {
        break forest_join_82;
    }
    life7_6 = life11_46;
    if (!((life6_7 != null))) {
        break forest_join_129;
    }
    break forest_join_82;
    }
    forest_cycle_54: while (true) {
    forest_join_79: {
    if (!((forestValue162_54_0 != 0))) {
        break forest_join_178;
    }
    spill162_4 = life7_6;
    if (!((life6_7 == null))) {
        forestValue162_157_0 = spill162_4;
        break forest_join_157;
    }
    if (!((life6_7 == null))) {
        forestValue162_157_0 = spill162_4;
        break forest_join_157;
    }
    if (!((spill162_4 > 0))) {
        break forest_join_178;
    }
    spill162_5 = ((java.lang.String)(this.l)).charAt(((int)((life7_6 - 1))));
    if (!((life6_7 == null))) {
        forestValue162_157_0 = ((int)(spill162_5));
        break forest_join_157;
    }
    if (!((spill162_5 == __sourceIntrinsic_f7c5abbf18cd_invokedynamic162_11(25352, (6219221054260539442L ^ life4_3))))) {
        break forest_join_178;
    }
    life7_6 += -1;
    if (!((life6_7 != null))) {
        break forest_join_79;
    }
    break forest_join_81;
    }
    spill162_6 = p2;
    forestValue162_54_0 = ((spill162_6) ? 1 : 0);
    continue forest_cycle_54;
    }
    }
    break forest_join_178;
    }
    forest_cycle_82: while (true) {
    forest_join_100: {
    if (!(p2)) {
        break forest_join_129;
    }
    spill162_7 = life7_6;
    spill162_8 = life11_46;
    if (!((life6_7 == null))) {
        forestValue162_23_0 = spill162_7;
        forestValue162_23_1 = spill162_8;
        continue forest_cycle_23;
    }
    if (!((life6_7 == null))) {
        forestValue162_100_0 = spill162_7;
        forestValue162_100_1 = spill162_8;
        break forest_join_100;
    }
    if (!((spill162_7 < spill162_8))) {
        break forest_join_129;
    }
    forestValue162_100_0 = ((int)(((java.lang.String)(this.l)).charAt(((int)(life7_6)))));
    forestValue162_100_1 = __sourceIntrinsic_f7c5abbf18cd_invokedynamic162_15(25352, (6219221054260539442L ^ life4_3));
    }
    if (!((forestValue162_100_0 == forestValue162_100_1))) {
        break forest_join_129;
    }
    life7_6 += 1;
    if (!((life6_7 != null))) {
        continue forest_cycle_82;
    }
    break forest_cycle_82;
    }
    break forest_join_129;
    }
    forest_cycle_105: while (true) {
    forest_join_127: {
    forest_join_122: {
    if (!((forestValue162_105_0 != 0))) {
        break forest_join_129;
    }
    spill162_9 = life7_6;
    spill162_10 = life11_46;
    if (!((life6_7 == null))) {
        forestValue162_23_0 = spill162_9;
        forestValue162_23_1 = spill162_10;
        continue forest_cycle_23;
    }
    if (!((life6_7 == null))) {
        forestValue162_122_0 = spill162_9;
        forestValue162_122_1 = spill162_10;
        break forest_join_122;
    }
    if (!((spill162_9 < spill162_10))) {
        break forest_join_129;
    }
    forestValue162_122_0 = ((int)(((java.lang.String)(this.l)).charAt(((int)(life7_6)))));
    forestValue162_122_1 = __sourceIntrinsic_f7c5abbf18cd_invokedynamic162_19(25352, (6219221054260539442L ^ life4_3));
    }
    if (!((forestValue162_122_0 == forestValue162_122_1))) {
        break forest_join_129;
    }
    life7_6 += 1;
    if (!((life6_7 != null))) {
        break forest_join_127;
    }
    break forest_join_129;
    }
    spill162_11 = p2;
    forestValue162_105_0 = ((spill162_11) ? 1 : 0);
    continue forest_cycle_105;
    }
    }
    if (!((life6_7 != null))) {
        break forest_join_197;
    }
    }
    forest_cycle_131: while (true) {
    if (!(p2)) {
        break forest_join_178;
    }
    spill162_12 = life7_6;
    if (!((life6_7 == null))) {
        forestValue162_157_0 = spill162_12;
        break forest_join_157;
    }
    if (!((life6_7 == null))) {
        forestValue162_157_0 = spill162_12;
        break forest_join_157;
    }
    if (!((spill162_12 > 0))) {
        break forest_join_178;
    }
    spill162_13 = ((java.lang.String)(this.l)).charAt(((int)((life7_6 - 1))));
    if (!((life6_7 == null))) {
        forestValue162_157_0 = ((int)(spill162_13));
        break forest_join_157;
    }
    if (!((spill162_13 == __sourceIntrinsic_f7c5abbf18cd_invokedynamic162_25(25352, (6219221054260539442L ^ life4_3))))) {
        break forest_join_178;
    }
    life7_6 += -1;
    if (!((life6_7 != null))) {
        continue forest_cycle_131;
    }
    break forest_cycle_131;
    }
    break forest_join_178;
    }
    forest_cycle_157: while (true) {
    forest_join_176: {
    if (!((forestValue162_157_0 > 0))) {
        break forest_join_197;
    }
    spill162_14 = ((java.lang.String)(this.l)).charAt(((int)((life7_6 - 1))));
    spill162_15 = __sourceIntrinsic_f7c5abbf18cd_invokedynamic162_28(25352, (6219221054260539442L ^ life4_3));
    if (!((life6_7 == null))) {
        forestValue162_23_0 = ((int)(spill162_14));
        forestValue162_23_1 = spill162_15;
        continue forest_cycle_23;
    }
    if (!((spill162_14 != spill162_15))) {
        break forest_join_197;
    }
    life7_6 += -1;
    if (!((life6_7 != null))) {
        break forest_join_176;
    }
    break forest_join_197;
    }
    spill162_16 = life7_6;
    forestValue162_157_0 = spill162_16;
    continue forest_cycle_157;
    }
    }
    forest_cycle_178: while (true) {
    if (!((life7_6 > 0))) {
        break forest_join_197;
    }
    spill162_17 = ((java.lang.String)(this.l)).charAt(((int)((life7_6 - 1))));
    spill162_18 = __sourceIntrinsic_f7c5abbf18cd_invokedynamic162_32(25352, (6219221054260539442L ^ life4_3));
    if (!((life6_7 == null))) {
        forestValue162_23_0 = ((int)(spill162_17));
        forestValue162_23_1 = spill162_18;
        continue forest_cycle_23;
    }
    if (!((spill162_17 != spill162_18))) {
        break forest_join_197;
    }
    life7_6 += -1;
    if (!((life6_7 != null))) {
        continue forest_cycle_178;
    }
    break forest_cycle_178;
    }
    break forest_cycle_23;
    }
    }
    life10_25 += 1;
    if (!((life6_7 != null))) {
        continue forest_cycle_21;
    }
    break forest_cycle_21;
    }
    }
    forestValue162_201_0 = life7_6;
    }
    return forestValue162_201_0;
}


public void g(int p0) {
this.w = ((int)(p0));
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_0f7336f21ff6a8cc_originalDynamicSite117_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0f7336f21ff6a8cc_originalDynamicSite117_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0f7336f21ff6a8cc_originalDynamicSite117_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f7c5abbf18cd_invokedynamic162_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f7c5abbf18cd_invokedynamic162_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f7c5abbf18cd_invokedynamic162_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f7c5abbf18cd_invokedynamic162_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f7c5abbf18cd_invokedynamic162_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f7c5abbf18cd_invokedynamic162_28(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f7c5abbf18cd_invokedynamic162_32(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral3198_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_8dbec06774c4_invokedynamic1213_17(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_d1c1922d1ba0_invokedynamic1214_18(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_d1c1922d1ba0_invokedynamic1214_21(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_d1c1922d1ba0_invokedynamic1214_22(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_d1c1922d1ba0_invokedynamic1214_30(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a91ecd6db48f_invokedynamic1218_41(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a91ecd6db48f_invokedynamic1218_48(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a91ecd6db48f_invokedynamic1218_72(java.lang.String a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a91ecd6db48f_invokedynamic1218_85(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c4b63a62bb23_invokedynamic1219_4(int a0, long a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
