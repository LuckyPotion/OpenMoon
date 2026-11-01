package moom;


public class I3 {

private static boolean b;

private static long a;

private static java.lang.String c;

public I3(org.lwjgl.util.vector.Matrix4f p0) { super(); }


private static void __sourceConstructorBody_e1116d4946423d7f(moom.I3 receiver, org.lwjgl.util.vector.Matrix4f p0) throws Throwable {

long local2_life2 = (moom.I3.a ^ 104032567015040L);

    moom.I3.__sourceConstructorInit_e1116d4946423d7f_0(((moom.I3)(receiver)));

    throw new org.apache.commons.lang3.NotImplementedException(moom.I3.c);

}



static {
a = ((long)(((moom._a)(moom._c.a(((long)(-8576518438158087148L)), ((long)(2803635769051502976L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(280510547808579L)))));
    int __sourceSpill577_6 = 1;
    long local0_life7 = (moom.I3.a ^ 65396186416034L);
    moom.I3.b(((boolean)__sourceIntrinsic_integerToBoolean((__sourceSpill577_6))));
    javax.crypto.Cipher local2_life10;
    javax.crypto.Cipher __sourceSpill577_12 = (local2_life10 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill577_13 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill577_14 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill577_15 = new byte[8];
    (__sourceSpill577_15)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life16 = 1;
    while ((local3_life16 < 8)) {
        (__sourceSpill577_15)[local3_life16] = ((byte) ((int) ((local0_life7 << (local3_life16 * 8)) >>> 56)));
        local3_life16 += 1;
    }
    byte[] __sourcePreallocation577_17 = __sourceSpill577_15;
    ((javax.crypto.Cipher)(__sourceSpill577_12)).init(((int)(__sourceSpill577_13)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill577_14)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation577_17)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    byte[] __sourceSpill577_21 = ((java.lang.String)("$ãD°¹+ièR¸p\022ò'cÁñHTÊ")).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __sourceSpill577_22 = local2_life10;
    byte[] local4_life24 = ((javax.crypto.Cipher)(__sourceSpill577_22)).doFinal(((byte[])(__sourceSpill577_21)));
    c = ((java.lang.String)(((java.lang.String)(moom.I3.a(((byte[])(local4_life24))))).intern()));
}

private static native <E extends Throwable> void __sourceConstructorInit_e1116d4946423d7f_0(moom.I3 a0) throws E;

public static boolean b() {
return ((((moom.I3.b) ? 1 : 0)) != 0);
}


public static void b(boolean p0) {
b = ((boolean)(p0));
    return;
}


public static boolean c() {
int local0 = __sourceIntrinsic_booleanToInteger(moom.I3.b());
    if ((local0 == 0)) {
        return ((1) != 0);
    }
    return ((0) != 0);
}


public static boolean a(org.lwjgl.util.vector.Matrix4f p0) {
return ((0) != 0);
}


private static org.apache.commons.lang3.NotImplementedException a(org.apache.commons.lang3.NotImplementedException p0) {
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
        byte[] spill2173_0 = p0;
        life4_9 += 1;
        life5_44 = (spill2173_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill2173_1 = p0;
        life4_9 += 1;
        life5_76 = (spill2173_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill2173_2 = p0;
        life4_9 += 1;
        life5_91 = (spill2173_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static native int __sourceIntrinsic_booleanToInteger(boolean value);
private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
