package moom;


public class M0 extends moom.MY {

public static final java.lang.String[] g;

public static final java.lang.String[] h;

private static final long j;

public M0(java.lang.String p0, java.lang.String p1, int p2) {
super(p0, moom.M0.g, p1, moom.M0.h, p2);
}


static {
j = ((long)(((moom._a)(moom._c.a(((long)(1281813115745354167L)), ((long)(-168661338558410032L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(42802450021382L)))));
    long local9_life6 = (moom.M0.j ^ 118410859508810L);
    javax.crypto.Cipher local1_life8;
    javax.crypto.Cipher __sourceSpill821_10 = (local1_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill821_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill821_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill821_13 = new byte[8];
    (__sourceSpill821_13)[0] = ((byte) ((int) (local9_life6 >>> 56)));
    int local2_life14 = 1;
    while ((local2_life14 < 8)) {
        (__sourceSpill821_13)[local2_life14] = ((byte) ((int) ((local9_life6 << (local2_life14 * 8)) >>> 56)));
        local2_life14 += 1;
    }
    byte[] __sourcePreallocation821_15 = __sourceSpill821_13;
    ((javax.crypto.Cipher)(__sourceSpill821_10)).init(((int)(__sourceSpill821_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill821_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation821_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local0_life18 = new java.lang.String[6];
    int local6_life19 = 0;
    java.lang.String local5_life20;
    int local7_life22 = ((java.lang.String)((local5_life20 = "²ßÅÛÈ\b¿O¤ìj\030u\b¼ë\003n\016°\b{àQã4d^­"))).length();
    int local4_life23 = 8;
    int local3_life24 = -1;
    while (true) {
        local3_life24 += 1;
        byte[] __sourceSpill821_27 = ((java.lang.String)(((java.lang.String)(local5_life20)).substring(((int)(local3_life24)), ((int)((local3_life24 + local4_life23)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill821_28 = local1_life8;
        byte[] local8_life30 = ((javax.crypto.Cipher)(__sourceSpill821_28)).doFinal(((byte[])(__sourceSpill821_27)));
        java.lang.String __sourceSpill821_33 = ((java.lang.String)(moom.M0.b(((byte[])(local8_life30))))).intern();
        java.lang.String[] __sourceSpill821_34 = local0_life18;
        int __sourceSpill821_35 = local6_life19;
        local6_life19 += 1;
        (__sourceSpill821_34)[__sourceSpill821_35] = __sourceSpill821_33;
        if (!(((local3_life24 = (local3_life24 + local4_life23)) < local7_life22))) { break; }
        local4_life23 = ((java.lang.String)(local5_life20)).charAt(((int)(local3_life24)));
    }
    local7_life22 = ((java.lang.String)((local5_life20 = "i-Ú\032ñ~\b!Ê)÷/ª£"))).length();
    local4_life23 = 8;
    local3_life24 = -1;
    while (true) {
        local3_life24 += 1;
        byte[] __sourceSpill821_41 = ((java.lang.String)(((java.lang.String)(local5_life20)).substring(((int)(local3_life24)), ((int)((local3_life24 + local4_life23)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill821_42 = local1_life8;
        byte[] local8_life44 = ((javax.crypto.Cipher)(__sourceSpill821_42)).doFinal(((byte[])(__sourceSpill821_41)));
        java.lang.String __sourceSpill821_47 = ((java.lang.String)(moom.M0.b(((byte[])(local8_life44))))).intern();
        java.lang.String[] __sourceSpill821_48 = local0_life18;
        int __sourceSpill821_49 = local6_life19;
        local6_life19 += 1;
        (__sourceSpill821_48)[__sourceSpill821_49] = __sourceSpill821_47;
        if (!(((local3_life24 = (local3_life24 + local4_life23)) < local7_life22))) { break; }
        local4_life23 = ((java.lang.String)(local5_life20)).charAt(((int)(local3_life24)));
    }
    java.lang.String[] __sourceSpill821_52 = new java.lang.String[3];
    (__sourceSpill821_52)[0] = (local0_life18)[5];
    (__sourceSpill821_52)[1] = (local0_life18)[2];
    (__sourceSpill821_52)[2] = (local0_life18)[1];
    g = ((java.lang.String[])(__sourceSpill821_52));
    java.lang.String[] __sourceSpill821_54 = new java.lang.String[3];
    (__sourceSpill821_54)[0] = (local0_life18)[0];
    (__sourceSpill821_54)[1] = (local0_life18)[4];
    (__sourceSpill821_54)[2] = (local0_life18)[3];
    h = ((java.lang.String[])(__sourceSpill821_54));
}


public boolean b__sourceReturn_aae029aa0a() {
int forwardValue2603_13_0;
    int forwardValue2603_15_0;
    int spill2603_0;
    long life1_3;
    int[] life3_5;
    forward_join_15: {
    forward_join_14: {
    forward_join_13: {
    life1_3 = (moom.M0.j ^ 10374420038768L);
    life3_5 = moom.M7.b__ArrayInt();
    spill2603_0 = ((moom.M0)(this)).a();
    if (!((life3_5 == null))) {
        forwardValue2603_13_0 = spill2603_0;
        break forward_join_13;
    }
    if (!((spill2603_0 == 1))) {
        break forward_join_14;
    }
    forwardValue2603_13_0 = 1;
    }
    forwardValue2603_15_0 = forwardValue2603_13_0;
    break forward_join_15;
    }
    forwardValue2603_15_0 = 0;
    }
    return ((forwardValue2603_15_0) != 0);
}


private static java.lang.String b(byte[] p0) {
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
        byte[] spill3070_0 = p0;
        life4_9 += 1;
        life5_44 = (spill3070_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill3070_1 = p0;
        life4_9 += 1;
        life5_76 = (spill3070_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill3070_2 = p0;
        life4_9 += 1;
        life5_91 = (spill3070_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


public boolean c__sourceReturn_aae029aa0a() {
int forwardValue2604_13_0;
    int forwardValue2604_15_0;
    int spill2604_0;
    long life1_3;
    int[] life3_5;
    forward_join_15: {
    forward_join_14: {
    forward_join_13: {
    life1_3 = (moom.M0.j ^ 34320837633551L);
    life3_5 = moom.M7.b__ArrayInt();
    spill2604_0 = ((moom.M0)(this)).a();
    if (!((life3_5 == null))) {
        forwardValue2604_13_0 = spill2604_0;
        break forward_join_13;
    }
    if (!((spill2604_0 == 2))) {
        break forward_join_14;
    }
    forwardValue2604_13_0 = 1;
    }
    forwardValue2604_15_0 = forwardValue2604_13_0;
    break forward_join_15;
    }
    forwardValue2604_15_0 = 0;
    }
    return ((forwardValue2604_15_0) != 0);
}


public boolean a__Boolean() {
int forwardValue2601_12_0;
    int forwardValue2601_14_0;
    int spill2601_0;
    long life1_3;
    int[] life3_5;
    forward_join_14: {
    forward_join_13: {
    forward_join_12: {
    life1_3 = (moom.M0.j ^ 132126251119388L);
    life3_5 = moom.M7.b__ArrayInt();
    spill2601_0 = ((moom.M0)(this)).a();
    if (!((life3_5 == null))) {
        forwardValue2601_12_0 = spill2601_0;
        break forward_join_12;
    }
    if (!((spill2601_0 == 0))) {
        break forward_join_13;
    }
    forwardValue2601_12_0 = 1;
    }
    forwardValue2601_14_0 = forwardValue2601_12_0;
    break forward_join_14;
    }
    forwardValue2601_14_0 = 0;
    }
    return ((forwardValue2601_14_0) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public java.lang.String a__String() {
int forwardValue2602_15_0;
    int forwardValue2602_24_0;
    moom.M0 forwardValue2602_28_0;
    java.lang.String forwardValue2602_29_0;
    boolean spill2602_0;
    moom.M0 spill2602_1;
    long life1_3;
    int[] life3_5;
    forward_join_29: {
    forward_join_28: {
    forward_join_27: {
    forward_join_24: {
    forward_join_20: {
    forward_join_15: {
    forward_join_13: {
    life1_3 = (moom.M0.j ^ 91787298173641L);
    life3_5 = moom.M7.b__ArrayInt();
    spill2602_0 = ((moom.M0)(this)).a__Boolean();
    if (!((life3_5 == null))) {
        forwardValue2602_15_0 = ((spill2602_0) ? 1 : 0);
        break forward_join_15;
    }
    if (!(spill2602_0)) {
        break forward_join_13;
    }
    forwardValue2602_29_0 = moom.JM.e();
    break forward_join_29;
    }
    forwardValue2602_15_0 = ((((moom.M0)(this)).b__sourceReturn_aae029aa0a()) ? 1 : 0);
    }
    if (!((life3_5 == null))) {
        forwardValue2602_24_0 = forwardValue2602_15_0;
        break forward_join_24;
    }
    if (!((forwardValue2602_15_0 != 0))) {
        break forward_join_20;
    }
    forwardValue2602_29_0 = moom.JM.a();
    break forward_join_29;
    }
    spill2602_1 = this;
    if (!((life3_5 == null))) {
        forwardValue2602_28_0 = spill2602_1;
        break forward_join_28;
    }
    forwardValue2602_24_0 = ((((moom.M0)(spill2602_1)).c__sourceReturn_aae029aa0a()) ? 1 : 0);
    }
    if (!((forwardValue2602_24_0 != 0))) {
        break forward_join_27;
    }
    forwardValue2602_29_0 = moom.JM.b();
    break forward_join_29;
    }
    forwardValue2602_28_0 = this;
    }
    forwardValue2602_29_0 = __sourceIntrinsic_64ccfb84e285_call2602_11(forwardValue2602_28_0);
    }
    return forwardValue2602_29_0;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_64ccfb84e285_call2602_11(moom.M0 a0) throws E;
}
