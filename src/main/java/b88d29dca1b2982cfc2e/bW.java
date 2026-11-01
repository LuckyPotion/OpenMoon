package com.moon;


public class bW extends sourcebuild.EnumConstructor<com.moon.bW> implements com.moon.l8 {

public static com.moon.bW ROBOTO;

public static com.moon.bW PRODUCT_SANS;

public static com.moon.bW SF_UI;

public static com.moon.bW VOLTE;

private java.lang.String a;

private java.util.function.Supplier<com.moon.jm> b;

private static com.moon.bW[] c;

private bW(java.lang.String p0, int p1, java.lang.String p2, java.util.function.Supplier<com.moon.jm> p3) {
super(p0, p1);
    this.a = p2;
    this.b = p3;
}


private static void initialize() {
long local9_life4 = (((moom._a)(moom._c.a(((long)(-9035895791411880004L)), ((long)(-644762381163487740L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(118112794328096L))) ^ 21609601771738L);
    javax.crypto.Cipher local1_life6;
    javax.crypto.Cipher __sourceSpill51_8 = (local1_life6 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill51_9 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill51_10 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill51_11 = new byte[8];
    (__sourceSpill51_11)[0] = ((byte) ((int) (local9_life4 >>> 56)));
    int local2_life12 = 1;
    while ((local2_life12 < 8)) {
        (__sourceSpill51_11)[local2_life12] = ((byte) ((int) ((local9_life4 << (local2_life12 * 8)) >>> 56)));
        local2_life12 += 1;
    }
    byte[] __sourcePreallocation51_13 = __sourceSpill51_11;
    ((javax.crypto.Cipher)(__sourceSpill51_8)).init(((int)(__sourceSpill51_9)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill51_10)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation51_13)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local0_life16 = new java.lang.String[8];
    int local6_life17 = 0;
    java.lang.String local5_life18;
    int local7_life20 = ((java.lang.String)((local5_life18 = "ûíì\"âÐ\007\020k¹ëÇL\f\0367SV\025¶\020«¹÷ásc\nÆ\026\005ÚåapÈ\020~Õ:~J¦`3\004ã¾DÖ\b\000,=·\rÁÏr\bÖ$OJÅÐ²"))).length();
    int local4_life21 = 8;
    int local3_life22 = -1;
    while (true) {
        local3_life22 += 1;
        byte[] __sourceSpill51_25 = ((java.lang.String)(((java.lang.String)(local5_life18)).substring(((int)(local3_life22)), ((int)((local3_life22 + local4_life21)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill51_26 = local1_life6;
        byte[] local8_life28 = ((javax.crypto.Cipher)(__sourceSpill51_26)).doFinal(((byte[])(__sourceSpill51_25)));
        java.lang.String __sourceSpill51_31 = ((java.lang.String)(com.moon.bW.a(((byte[])(local8_life28))))).intern();
        java.lang.String[] __sourceSpill51_32 = local0_life16;
        int __sourceSpill51_33 = local6_life17;
        local6_life17 += 1;
        (__sourceSpill51_32)[__sourceSpill51_33] = __sourceSpill51_31;
        if (!(((local3_life22 = (local3_life22 + local4_life21)) < local7_life20))) { break; }
        local4_life21 = ((java.lang.String)(local5_life18)).charAt(((int)(local3_life22)));
    }
    local7_life20 = ((java.lang.String)((local5_life18 = "nÉËyìì¥³\bdvð÷búM"))).length();
    local4_life21 = 8;
    local3_life22 = -1;
    while (true) {
        local3_life22 += 1;
        byte[] __sourceSpill51_39 = ((java.lang.String)(((java.lang.String)(local5_life18)).substring(((int)(local3_life22)), ((int)((local3_life22 + local4_life21)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill51_40 = local1_life6;
        byte[] local8_life42 = ((javax.crypto.Cipher)(__sourceSpill51_40)).doFinal(((byte[])(__sourceSpill51_39)));
        java.lang.String __sourceSpill51_45 = ((java.lang.String)(com.moon.bW.a(((byte[])(local8_life42))))).intern();
        java.lang.String[] __sourceSpill51_46 = local0_life16;
        int __sourceSpill51_47 = local6_life17;
        local6_life17 += 1;
        (__sourceSpill51_46)[__sourceSpill51_47] = __sourceSpill51_45;
        if (!(((local3_life22 = (local3_life22 + local4_life21)) < local7_life20))) { break; }
        local4_life21 = ((java.lang.String)(local5_life18)).charAt(((int)(local3_life22)));
    }
    ROBOTO = ((com.moon.bW)(new com.moon.bW((local0_life16)[7], 0, (local0_life16)[5], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite51_50())));
    PRODUCT_SANS = ((com.moon.bW)(new com.moon.bW((local0_life16)[2], 1, (local0_life16)[3], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite51_52())));
    SF_UI = ((com.moon.bW)(new com.moon.bW((local0_life16)[6], 2, (local0_life16)[1], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite51_54())));
    VOLTE = ((com.moon.bW)(new com.moon.bW((local0_life16)[4], 3, (local0_life16)[0], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite51_56())));
    c = ((com.moon.bW[])(com.moon.bW.a__ArraybW()));
}


public static com.moon.bW[] values() {
return ((com.moon.bW[])(((com.moon.bW[])(com.moon.bW.c)).clone()));
}


public static com.moon.bW valueOf(java.lang.String p0) {
return ((com.moon.bW)(java.lang.Enum.valueOf(((java.lang.Class)(com.moon.bW.class)), ((java.lang.String)(p0)))));
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
        byte[] spill64_0 = p0;
        life4_9 += 1;
        life5_44 = (spill64_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill64_1 = p0;
        life4_9 += 1;
        life5_76 = (spill64_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill64_2 = p0;
        life4_9 += 1;
        life5_91 = (spill64_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static com.moon.bW[] a__ArraybW() {
return new com.moon.bW[] {com.moon.bW.ROBOTO, com.moon.bW.PRODUCT_SANS, com.moon.bW.SF_UI, com.moon.bW.VOLTE};
}


public java.lang.String a__String() {
return this.a;
}


public java.util.function.Supplier<com.moon.jm> a__Supplier() {
return this.b;
}


private static com.moon.jm lambda$static$1() {
return ((com.moon.jo)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__jo())).a(((com.moon.ce)(com.moon.ce.PRODUCT_SANS)));
}


private static com.moon.jm lambda$static$0() {
return ((com.moon.jo)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__jo())).a(((com.moon.ce)(com.moon.ce.ROBOTO_MEDIUM)));
}


private static com.moon.jm lambda$static$3() {
return ((com.moon.jo)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__jo())).a(((com.moon.ce)(com.moon.ce.VOLTE_SEMI_BOLD)));
}


private static com.moon.jm lambda$static$2() {
return ((com.moon.jo)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__jo())).a(((com.moon.ce)(com.moon.ce.SF_UI)));
}


private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_eb8803ad1f63_originalDynamicSite51_50() throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_eb8803ad1f63_originalDynamicSite51_52() throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_eb8803ad1f63_originalDynamicSite51_54() throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_eb8803ad1f63_originalDynamicSite51_56() throws E;
}
