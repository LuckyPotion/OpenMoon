package moom;


public class yv extends net.minecraft.nbt.NBTBase {

private byte[] c;

private static final long d;

private static final long e;

private static final long[] g;

private static final java.lang.Long[] h;

private static final java.util.Map i;

yv() {
super();
}


public yv(byte[] p0) {
super();
    this.c = p0;
}


static {
d = ((long)(((moom._a)(moom._c.a(((long)(5783800030308493925L)), ((long)(4484305323927829809L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(144978498628205L)))));
    long local11_life6 = (moom.yv.d ^ 64282431683464L);
    javax.crypto.Cipher local13_life8;
    javax.crypto.Cipher __sourceSpill1137_10 = (local13_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1137_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1137_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1137_13 = new byte[8];
    (__sourceSpill1137_13)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local14_life14 = 1;
    while ((local14_life14 < 8)) {
        (__sourceSpill1137_13)[local14_life14] = ((byte) ((int) ((local11_life6 << (local14_life14 * 8)) >>> 56)));
        local14_life14 += 1;
    }
    byte[] __sourcePreallocation1137_15 = __sourceSpill1137_13;
    ((javax.crypto.Cipher)(__sourceSpill1137_10)).init(((int)(__sourceSpill1137_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1137_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1137_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local15_life18 = -6498545669987502700L;
    byte[] __sourceSpill1137_19 = new byte[8];
    (__sourceSpill1137_19)[0] = ((byte) ((int) (local15_life18 >>> 56)));
    (__sourceSpill1137_19)[1] = ((byte) ((int) (local15_life18 >>> 48)));
    (__sourceSpill1137_19)[2] = ((byte) ((int) (local15_life18 >>> 40)));
    (__sourceSpill1137_19)[3] = ((byte) ((int) (local15_life18 >>> 32)));
    (__sourceSpill1137_19)[4] = ((byte) ((int) (local15_life18 >>> 24)));
    (__sourceSpill1137_19)[5] = ((byte) ((int) (local15_life18 >>> 16)));
    (__sourceSpill1137_19)[6] = ((byte) ((int) (local15_life18 >>> 8)));
    (__sourceSpill1137_19)[7] = ((byte) ((int) local15_life18));
    javax.crypto.Cipher __sourceSpill1137_20 = local13_life8;
    byte[] local17_life22 = ((javax.crypto.Cipher)(__sourceSpill1137_20)).doFinal(((byte[])(__sourceSpill1137_19)));
    e = ((long)((((((((((((long) (local17_life22)[0]) & 255L) << 56) | ((((long) (local17_life22)[1]) & 255L) << 48)) | ((((long) (local17_life22)[2]) & 255L) << 40)) | ((((long) (local17_life22)[3]) & 255L) << 32)) | ((((long) (local17_life22)[4]) & 255L) << 24)) | ((((long) (local17_life22)[5]) & 255L) << 16)) | ((((long) (local17_life22)[6]) & 255L) << 8)) | (((long) (local17_life22)[7]) & 255L))));
    i = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life26;
    javax.crypto.Cipher __sourceSpill1137_28 = (local0_life26 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1137_29 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1137_30 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1137_31 = new byte[8];
    (__sourceSpill1137_31)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local1_life32 = 1;
    while ((local1_life32 < 8)) {
        (__sourceSpill1137_31)[local1_life32] = ((byte) ((int) ((local11_life6 << (local1_life32 * 8)) >>> 56)));
        local1_life32 += 1;
    }
    byte[] __sourcePreallocation1137_33 = __sourceSpill1137_31;
    ((javax.crypto.Cipher)(__sourceSpill1137_28)).init(((int)(__sourceSpill1137_29)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1137_30)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1137_33)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life36 = new long[2];
    int local3_life37 = 0;
    java.lang.String local4_life38;
    int local5_life40 = ((java.lang.String)((local4_life38 = "\025Ñ\004ý9Öb\007àc¼g\036¦"))).length();
    int local2_life41 = 0;
    do {
        java.lang.String __sourceSpill1137_42 = local4_life38;
        int __sourceSpill1137_43 = local2_life41;
        local2_life41 += 8;
        byte[] local7_life46 = ((java.lang.String)(((java.lang.String)(__sourceSpill1137_42)).substring(((int)(__sourceSpill1137_43)), ((int)(local2_life41))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1137_47 = local6_life36;
        int __sourceSpill1137_48 = local3_life37;
        local3_life37 += 1;
        long local8_life49 = (((((((((((long) (local7_life46)[0]) & 255L) << 56) | ((((long) (local7_life46)[1]) & 255L) << 48)) | ((((long) (local7_life46)[2]) & 255L) << 40)) | ((((long) (local7_life46)[3]) & 255L) << 32)) | ((((long) (local7_life46)[4]) & 255L) << 24)) | ((((long) (local7_life46)[5]) & 255L) << 16)) | ((((long) (local7_life46)[6]) & 255L) << 8)) | (((long) (local7_life46)[7]) & 255L));
        byte[] __sourceSpill1137_50 = new byte[8];
        (__sourceSpill1137_50)[0] = ((byte) ((int) (local8_life49 >>> 56)));
        (__sourceSpill1137_50)[1] = ((byte) ((int) (local8_life49 >>> 48)));
        (__sourceSpill1137_50)[2] = ((byte) ((int) (local8_life49 >>> 40)));
        (__sourceSpill1137_50)[3] = ((byte) ((int) (local8_life49 >>> 32)));
        (__sourceSpill1137_50)[4] = ((byte) ((int) (local8_life49 >>> 24)));
        (__sourceSpill1137_50)[5] = ((byte) ((int) (local8_life49 >>> 16)));
        (__sourceSpill1137_50)[6] = ((byte) ((int) (local8_life49 >>> 8)));
        (__sourceSpill1137_50)[7] = ((byte) ((int) local8_life49));
        javax.crypto.Cipher __sourceSpill1137_51 = local0_life26;
        byte[] local10_life53 = ((javax.crypto.Cipher)(__sourceSpill1137_51)).doFinal(((byte[])(__sourceSpill1137_50)));
        (__sourceSpill1137_47)[__sourceSpill1137_48] = (((((((((((long) (local10_life53)[0]) & 255L) << 56) | ((((long) (local10_life53)[1]) & 255L) << 48)) | ((((long) (local10_life53)[2]) & 255L) << 40)) | ((((long) (local10_life53)[3]) & 255L) << 32)) | ((((long) (local10_life53)[4]) & 255L) << 24)) | ((((long) (local10_life53)[5]) & 255L) << 16)) | ((((long) (local10_life53)[6]) & 255L) << 8)) | (((long) (local10_life53)[7]) & 255L));
    } while ((!(local2_life41 >= local5_life40)));
    g = ((long[])(local6_life36));
    h = ((java.lang.Long[])(new java.lang.Long[2]));
}


public boolean equals(java.lang.Object p0) {
int forwardValue4583_18_0;
    int forwardValue4583_22_0;
    int forwardValue4583_24_0;
    boolean spill4583_0;
    long life2_3;
    java.lang.String life4_5;
    forward_join_24: {
    forward_join_23: {
    forward_join_22: {
    forward_join_18: {
    life2_3 = (moom.yv.d ^ 102499629712425L);
    life4_5 = net.minecraft.nbt.NBTBase.b();
    spill4583_0 = super.equals(((java.lang.Object)(p0)));
    if (!((life4_5 == null))) {
        forwardValue4583_18_0 = ((spill4583_0) ? 1 : 0);
        break forward_join_18;
    }
    if (!(spill4583_0)) {
        break forward_join_23;
    }
    forwardValue4583_18_0 = ((java.util.Arrays.equals(((byte[])(this.c)), ((byte[])(((moom.yv)(((moom.yv)(p0)))).c)))) ? 1 : 0);
    }
    if (!((life4_5 == null))) {
        forwardValue4583_22_0 = forwardValue4583_18_0;
        break forward_join_22;
    }
    if (!((forwardValue4583_18_0 != 0))) {
        break forward_join_23;
    }
    forwardValue4583_22_0 = 1;
    }
    forwardValue4583_24_0 = forwardValue4583_22_0;
    break forward_join_24;
    }
    forwardValue4583_24_0 = 0;
    }
    return ((forwardValue4583_24_0) != 0);
}


public java.lang.String toString() {
return __sourceIntrinsic_a86c261fcdee_originalDynamicSite1728_1((this.c).length);
}


public int hashCode() {
return (super.hashCode() ^ java.util.Arrays.hashCode(((byte[])(this.c))));
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


void a(java.io.DataOutput p0) throws java.io.IOException {
((java.io.DataOutput)(p0)).writeInt(((int)((this.c).length)));
    ((java.io.DataOutput)(p0)).write(((byte[])(this.c)));
    return;
}


private static long a(int p0, long p1) {
int life3_8;
    byte[] life4_77;
    long life5_81;
    byte[] life7_146;
    java.lang.Long life8_150;
    java.lang.Object[] life9_155;
    javax.crypto.spec.DESKeySpec life11_188;
    javax.crypto.SecretKey life12_195;
    javax.crypto.Cipher life13_200;
    byte[] life10_212;
    long life11_290;
    life3_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 15521);
    if (((moom.yv.h)[life3_8] == null)) {
        life4_77 = new byte[] {((byte) ((int) (p1 >>> 56))), ((byte) ((int) (p1 >>> 48))), ((byte) ((int) (p1 >>> 40))), ((byte) ((int) (p1 >>> 32))), ((byte) ((int) (p1 >>> 24))), ((byte) ((int) (p1 >>> 16))), ((byte) ((int) (p1 >>> 8))), ((byte) ((int) p1))};
        life5_81 = (moom.yv.g)[life3_8];
        life7_146 = new byte[] {((byte) ((int) (life5_81 >>> 56))), ((byte) ((int) (life5_81 >>> 48))), ((byte) ((int) (life5_81 >>> 40))), ((byte) ((int) (life5_81 >>> 32))), ((byte) ((int) (life5_81 >>> 24))), ((byte) ((int) (life5_81 >>> 16))), ((byte) ((int) (life5_81 >>> 8))), ((byte) ((int) life5_81))};
        life8_150 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life9_155 = ((java.lang.Object[])(((java.util.Map)(moom.yv.i)).get(((java.lang.Object)(life8_150)))));
        try {
        if ((life9_155 == null)) {
        life9_155 = new java.lang.Object[3];
        (life9_155)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding")));
        (life9_155)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life9_155)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.yv.i)).put(((java.lang.Object)(life8_150)), ((java.lang.Object)(life9_155)));
    }
        life11_188 = new javax.crypto.spec.DESKeySpec(life4_77);
        life12_195 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life9_155)[1])))).generateSecret(((java.security.spec.KeySpec)(life11_188)));
        life13_200 = ((javax.crypto.Cipher)((life9_155)[0]));
        ((javax.crypto.Cipher)(life13_200)).init(((int)(2)), ((java.security.Key)(life12_195)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life9_155)[2])))));
        life10_212 = ((javax.crypto.Cipher)(life13_200)).doFinal(((byte[])(life7_146)));
    } catch (java.lang.Exception life11_214) {
        throw new java.lang.RuntimeException("moom/yv", life11_214);
    }
        life11_290 = (((((((((((long) (life10_212)[0]) & 255L) << 56) | ((((long) (life10_212)[1]) & 255L) << 48)) | ((((long) (life10_212)[2]) & 255L) << 40)) | ((((long) (life10_212)[3]) & 255L) << 32)) | ((((long) (life10_212)[4]) & 255L) << 24)) | ((((long) (life10_212)[5]) & 255L) << 16)) | ((((long) (life10_212)[6]) & 255L) << 8)) | (((long) (life10_212)[7]) & 255L));
        (moom.yv.h)[life3_8] = java.lang.Long.valueOf(((long)(life11_290)));
    }
    return ((java.lang.Long)((moom.yv.h)[life3_8])).longValue();
}


private static long a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    long local7 = moom.yv.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local9 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Long.TYPE)), ((java.lang.Object)(java.lang.Long.valueOf(((long)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local9)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral9857_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/yv"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public byte a() {
long local1 = (moom.yv.d ^ 106870596886430L);
    return (__sourceIntrinsic_integerToByte((int) moom.yv.e));
}


public net.minecraft.nbt.NBTBase a__yn() {
byte[] local1 = new byte[(this.c).length];
    java.lang.System.arraycopy(((java.lang.Object)(this.c)), ((int)(0)), ((java.lang.Object)(local1)), ((int)(0)), ((int)((this.c).length)));
    return new moom.yv(local1);
}


void a(java.io.DataInput p0, int p1, moom.yB p2) throws java.io.IOException {
long local4 = (moom.yv.d ^ 82704684527484L);
    ((moom.yB)(p2)).a(((long)(__sourceIntrinsic_3cae938e49ec_originalDynamicSite1729_1(32314, (7380098683532693195L ^ local4)))));
    int local6 = ((java.io.DataInput)(p0)).readInt();
    ((moom.yB)(p2)).a(((long)((__sourceIntrinsic_3cae938e49ec_originalDynamicSite1729_4(18031, (6479943046822196895L ^ local4)) * ((long) local6)))));
    this.c = ((byte[])(new byte[local6]));
    ((java.io.DataInput)(p0)).readFully(((byte[])(this.c)));
    return;
}


public byte[] a__ArrayByte() {
return this.c;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite1728_1(int a0) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral9857_0() throws E;

private static native <E extends Throwable> long __sourceIntrinsic_3cae938e49ec_originalDynamicSite1729_1(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_3cae938e49ec_originalDynamicSite1729_4(int a0, long a1) throws E;

private static native byte __sourceIntrinsic_integerToByte(int value);
}
