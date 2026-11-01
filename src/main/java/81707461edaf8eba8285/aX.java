package moom;


public class aX extends sourcebuild.EnumConstructor<moom.aX> {

public static moom.aX OK;

public static moom.aX NOT_POSSIBLE_HERE;

public static moom.aX NOT_POSSIBLE_NOW;

public static moom.aX TOO_FAR_AWAY;

public static moom.aX OTHER_PROBLEM;

public static moom.aX NOT_SAFE;

private static moom.aX[] a;

private static long b;

private static long c;

private aX(java.lang.String p0, int p1) {
super(p0, p1);
}


private static void initialize() {
b = ((long)(((moom._a)(moom._c.a(((long)(-9217627358296951531L)), ((long)(-3421969484866369124L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(95572738746929L)))));
    long local0_life6 = (moom.aX.b ^ 33590163727777L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill758_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill758_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill758_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill758_13 = new byte[8];
    (__sourceSpill758_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill758_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation758_15 = __sourceSpill758_13;
    ((javax.crypto.Cipher)(__sourceSpill758_10)).init(((int)(__sourceSpill758_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill758_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation758_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -2899518267875140314L;
    byte[] __sourceSpill758_19 = new byte[8];
    (__sourceSpill758_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill758_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill758_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill758_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill758_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill758_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill758_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill758_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill758_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill758_20)).doFinal(((byte[])(__sourceSpill758_19)));
    c = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
    OK = ((moom.aX)(new moom.aX("OK", 0)));
    NOT_POSSIBLE_HERE = ((moom.aX)(new moom.aX("NOT_POSSIBLE_HERE", 1)));
    NOT_POSSIBLE_NOW = ((moom.aX)(new moom.aX("NOT_POSSIBLE_NOW", 2)));
    TOO_FAR_AWAY = ((moom.aX)(new moom.aX("TOO_FAR_AWAY", 3)));
    OTHER_PROBLEM = ((moom.aX)(new moom.aX("OTHER_PROBLEM", 4)));
    NOT_SAFE = ((moom.aX)(new moom.aX("NOT_SAFE", 5)));
    a = ((moom.aX[])(moom.aX.a()));
}


public static moom.aX[] values() {
return ((moom.aX[])(((moom.aX[])(moom.aX.a)).clone()));
}


public static moom.aX valueOf(java.lang.String p0) {
return ((moom.aX)(java.lang.Enum.valueOf(((java.lang.Class)(moom.aX.class)), ((java.lang.String)(p0)))));
}


private static moom.aX[] a() {
long local0_life1 = (moom.aX.b ^ 8917360118628L);
    moom.aX[] __sourceSharedArray748_4 = new moom.aX[((int) moom.aX.c)];
    __sourceSharedArray748_4[0] = moom.aX.OK;
    __sourceSharedArray748_4[1] = moom.aX.NOT_POSSIBLE_HERE;
    __sourceSharedArray748_4[2] = moom.aX.NOT_POSSIBLE_NOW;
    __sourceSharedArray748_4[3] = moom.aX.TOO_FAR_AWAY;
    __sourceSharedArray748_4[4] = moom.aX.OTHER_PROBLEM;
    __sourceSharedArray748_4[5] = moom.aX.NOT_SAFE;
    return __sourceSharedArray748_4;
}

}
