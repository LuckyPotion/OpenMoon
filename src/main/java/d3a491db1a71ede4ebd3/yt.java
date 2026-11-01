package moom;


public class yt extends net.minecraft.nbt.NBTBase$NBTPrimitive {

private long c;

private static final long d;

private static final long e;

private static final long[] g;

private static final java.lang.Long[] h;

private static final java.util.Map i;

yt() {
super();
}


public yt(long p0) {
super();
    this.c = p0;
}


static {
d = ((long)(((moom._a)(moom._c.a(((long)(624308864567386841L)), ((long)(-459902600963790963L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(252032532889836L)))));
    long local11_life6 = (moom.yt.d ^ 10946620977087L);
    javax.crypto.Cipher local13_life8;
    javax.crypto.Cipher __sourceSpill1135_10 = (local13_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1135_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1135_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1135_13 = new byte[8];
    (__sourceSpill1135_13)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local14_life14 = 1;
    while ((local14_life14 < 8)) {
        (__sourceSpill1135_13)[local14_life14] = ((byte) ((int) ((local11_life6 << (local14_life14 * 8)) >>> 56)));
        local14_life14 += 1;
    }
    byte[] __sourcePreallocation1135_15 = __sourceSpill1135_13;
    ((javax.crypto.Cipher)(__sourceSpill1135_10)).init(((int)(__sourceSpill1135_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1135_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1135_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local15_life18 = -8215226069724791214L;
    byte[] __sourceSpill1135_19 = new byte[8];
    (__sourceSpill1135_19)[0] = ((byte) ((int) (local15_life18 >>> 56)));
    (__sourceSpill1135_19)[1] = ((byte) ((int) (local15_life18 >>> 48)));
    (__sourceSpill1135_19)[2] = ((byte) ((int) (local15_life18 >>> 40)));
    (__sourceSpill1135_19)[3] = ((byte) ((int) (local15_life18 >>> 32)));
    (__sourceSpill1135_19)[4] = ((byte) ((int) (local15_life18 >>> 24)));
    (__sourceSpill1135_19)[5] = ((byte) ((int) (local15_life18 >>> 16)));
    (__sourceSpill1135_19)[6] = ((byte) ((int) (local15_life18 >>> 8)));
    (__sourceSpill1135_19)[7] = ((byte) ((int) local15_life18));
    javax.crypto.Cipher __sourceSpill1135_20 = local13_life8;
    byte[] local17_life22 = ((javax.crypto.Cipher)(__sourceSpill1135_20)).doFinal(((byte[])(__sourceSpill1135_19)));
    e = ((long)((((((((((((long) (local17_life22)[0]) & 255L) << 56) | ((((long) (local17_life22)[1]) & 255L) << 48)) | ((((long) (local17_life22)[2]) & 255L) << 40)) | ((((long) (local17_life22)[3]) & 255L) << 32)) | ((((long) (local17_life22)[4]) & 255L) << 24)) | ((((long) (local17_life22)[5]) & 255L) << 16)) | ((((long) (local17_life22)[6]) & 255L) << 8)) | (((long) (local17_life22)[7]) & 255L))));
    i = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life26;
    javax.crypto.Cipher __sourceSpill1135_28 = (local0_life26 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1135_29 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1135_30 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1135_31 = new byte[8];
    (__sourceSpill1135_31)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local1_life32 = 1;
    while ((local1_life32 < 8)) {
        (__sourceSpill1135_31)[local1_life32] = ((byte) ((int) ((local11_life6 << (local1_life32 * 8)) >>> 56)));
        local1_life32 += 1;
    }
    byte[] __sourcePreallocation1135_33 = __sourceSpill1135_31;
    ((javax.crypto.Cipher)(__sourceSpill1135_28)).init(((int)(__sourceSpill1135_29)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1135_30)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1135_33)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life36 = new long[3];
    int local3_life37 = 0;
    java.lang.String local4_life38;
    int local5_life40 = ((java.lang.String)((local4_life38 = "Imõ,»ùb¬-\006Áf¶Î:ª´-\177Ï¡"))).length();
    int local2_life41 = 0;
    do {
        java.lang.String __sourceSpill1135_42 = local4_life38;
        int __sourceSpill1135_43 = local2_life41;
        local2_life41 += 8;
        byte[] local7_life46 = ((java.lang.String)(((java.lang.String)(__sourceSpill1135_42)).substring(((int)(__sourceSpill1135_43)), ((int)(local2_life41))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1135_47 = local6_life36;
        int __sourceSpill1135_48 = local3_life37;
        local3_life37 += 1;
        long local8_life49 = (((((((((((long) (local7_life46)[0]) & 255L) << 56) | ((((long) (local7_life46)[1]) & 255L) << 48)) | ((((long) (local7_life46)[2]) & 255L) << 40)) | ((((long) (local7_life46)[3]) & 255L) << 32)) | ((((long) (local7_life46)[4]) & 255L) << 24)) | ((((long) (local7_life46)[5]) & 255L) << 16)) | ((((long) (local7_life46)[6]) & 255L) << 8)) | (((long) (local7_life46)[7]) & 255L));
        byte[] __sourceSpill1135_50 = new byte[8];
        (__sourceSpill1135_50)[0] = ((byte) ((int) (local8_life49 >>> 56)));
        (__sourceSpill1135_50)[1] = ((byte) ((int) (local8_life49 >>> 48)));
        (__sourceSpill1135_50)[2] = ((byte) ((int) (local8_life49 >>> 40)));
        (__sourceSpill1135_50)[3] = ((byte) ((int) (local8_life49 >>> 32)));
        (__sourceSpill1135_50)[4] = ((byte) ((int) (local8_life49 >>> 24)));
        (__sourceSpill1135_50)[5] = ((byte) ((int) (local8_life49 >>> 16)));
        (__sourceSpill1135_50)[6] = ((byte) ((int) (local8_life49 >>> 8)));
        (__sourceSpill1135_50)[7] = ((byte) ((int) local8_life49));
        javax.crypto.Cipher __sourceSpill1135_51 = local0_life26;
        byte[] local10_life53 = ((javax.crypto.Cipher)(__sourceSpill1135_51)).doFinal(((byte[])(__sourceSpill1135_50)));
        (__sourceSpill1135_47)[__sourceSpill1135_48] = (((((((((((long) (local10_life53)[0]) & 255L) << 56) | ((((long) (local10_life53)[1]) & 255L) << 48)) | ((((long) (local10_life53)[2]) & 255L) << 40)) | ((((long) (local10_life53)[3]) & 255L) << 32)) | ((((long) (local10_life53)[4]) & 255L) << 24)) | ((((long) (local10_life53)[5]) & 255L) << 16)) | ((((long) (local10_life53)[6]) & 255L) << 8)) | (((long) (local10_life53)[7]) & 255L));
    } while ((!(local2_life41 >= local5_life40)));
    g = ((long[])(local6_life36));
    h = ((java.lang.Long[])(new java.lang.Long[3]));
}


public boolean equals(java.lang.Object p0) {
int forwardValue4581_24_0;
    int forwardValue4581_26_0;
    int forwardValue4581_28_0;
    boolean spill4581_0;
    int spill4581_1;
    long life2_3;
    java.lang.String life4_5;
    moom.yt life5_17;
    forward_join_28: {
    forward_join_27: {
    forward_join_26: {
    forward_join_25: {
    forward_join_24: {
    life2_3 = (moom.yt.d ^ 83988880070710L);
    life4_5 = net.minecraft.nbt.NBTBase.b();
    spill4581_0 = super.equals(((java.lang.Object)(p0)));
    if (!((life4_5 == null))) {
        forwardValue4581_28_0 = ((spill4581_0) ? 1 : 0);
        break forward_join_28;
    }
    if (!(spill4581_0)) {
        break forward_join_27;
    }
    life5_17 = ((moom.yt)(p0));
    spill4581_1 = recovery.source.CarrierOps.lcmp(((long)(this.c)), ((long)(((moom.yt)(life5_17)).c)));
    if (!((life4_5 == null))) {
        forwardValue4581_24_0 = spill4581_1;
        break forward_join_24;
    }
    if (!((spill4581_1 == 0))) {
        break forward_join_25;
    }
    forwardValue4581_24_0 = 1;
    }
    forwardValue4581_26_0 = forwardValue4581_24_0;
    break forward_join_26;
    }
    forwardValue4581_26_0 = 0;
    }
    return ((forwardValue4581_26_0) != 0);
    }
    forwardValue4581_28_0 = 0;
    }
    return ((forwardValue4581_28_0) != 0);
}


public java.lang.String toString() {
return __sourceIntrinsic_a86c261fcdee_originalDynamicSite1723_1(this.c);
}


public int hashCode() {
long local1 = (moom.yt.d ^ 37864671946324L);
    return (super.hashCode() ^ ((int) (this.c ^ (this.c >>> ((int) moom.yt.e)))));
}


public byte b__sourceReturn_7d493934e8() {
long local1 = (moom.yt.d ^ 129599122599951L);
    return ((byte) ((int) (this.c & __sourceIntrinsic_8bc6784b5e90_originalDynamicSite1724_2(24249, (706209064325917845L ^ local1)))));
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public float a__Float() {
return ((float) this.c);
}


public double a__Double() {
return ((double) this.c);
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral9852_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/yt"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static long a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    long local7 = moom.yt.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local9 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Long.TYPE)), ((java.lang.Object)(java.lang.Long.valueOf(((long)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local9)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
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
    life3_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 1527);
    if (((moom.yt.h)[life3_8] == null)) {
        life4_77 = new byte[] {((byte) ((int) (p1 >>> 56))), ((byte) ((int) (p1 >>> 48))), ((byte) ((int) (p1 >>> 40))), ((byte) ((int) (p1 >>> 32))), ((byte) ((int) (p1 >>> 24))), ((byte) ((int) (p1 >>> 16))), ((byte) ((int) (p1 >>> 8))), ((byte) ((int) p1))};
        life5_81 = (moom.yt.g)[life3_8];
        life7_146 = new byte[] {((byte) ((int) (life5_81 >>> 56))), ((byte) ((int) (life5_81 >>> 48))), ((byte) ((int) (life5_81 >>> 40))), ((byte) ((int) (life5_81 >>> 32))), ((byte) ((int) (life5_81 >>> 24))), ((byte) ((int) (life5_81 >>> 16))), ((byte) ((int) (life5_81 >>> 8))), ((byte) ((int) life5_81))};
        life8_150 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life9_155 = ((java.lang.Object[])(((java.util.Map)(moom.yt.i)).get(((java.lang.Object)(life8_150)))));
        try {
        if ((life9_155 == null)) {
        life9_155 = new java.lang.Object[3];
        (life9_155)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding")));
        (life9_155)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life9_155)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.yt.i)).put(((java.lang.Object)(life8_150)), ((java.lang.Object)(life9_155)));
    }
        life11_188 = new javax.crypto.spec.DESKeySpec(life4_77);
        life12_195 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life9_155)[1])))).generateSecret(((java.security.spec.KeySpec)(life11_188)));
        life13_200 = ((javax.crypto.Cipher)((life9_155)[0]));
        ((javax.crypto.Cipher)(life13_200)).init(((int)(2)), ((java.security.Key)(life12_195)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life9_155)[2])))));
        life10_212 = ((javax.crypto.Cipher)(life13_200)).doFinal(((byte[])(life7_146)));
    } catch (java.lang.Exception life11_214) {
        throw new java.lang.RuntimeException("moom/yt", life11_214);
    }
        life11_290 = (((((((((((long) (life10_212)[0]) & 255L) << 56) | ((((long) (life10_212)[1]) & 255L) << 48)) | ((((long) (life10_212)[2]) & 255L) << 40)) | ((((long) (life10_212)[3]) & 255L) << 32)) | ((((long) (life10_212)[4]) & 255L) << 24)) | ((((long) (life10_212)[5]) & 255L) << 16)) | ((((long) (life10_212)[6]) & 255L) << 8)) | (((long) (life10_212)[7]) & 255L));
        (moom.yt.h)[life3_8] = java.lang.Long.valueOf(((long)(life11_290)));
    }
    return ((java.lang.Long)((moom.yt.h)[life3_8])).longValue();
}


public net.minecraft.nbt.NBTBase a__yn() {
return new moom.yt(this.c);
}


public byte a() {
return 4;
}


void a(java.io.DataInput p0, int p1, moom.yB p2) throws java.io.IOException {
long local4 = (moom.yt.d ^ 128453076192133L);
    ((moom.yB)(p2)).a(((long)(__sourceIntrinsic_3cae938e49ec_originalDynamicSite1725_1(22415, (5289499788360572456L ^ local4)))));
    this.c = ((long)(((java.io.DataInput)(p0)).readLong()));
    return;
}


void a(java.io.DataOutput p0) throws java.io.IOException {
((java.io.DataOutput)(p0)).writeLong(((long)(this.c)));
    return;
}


public long a__Long() {
return this.c;
}


public int a__Int() {
return ((int) this.c);
}


public short a__Short() {
long local1 = (moom.yt.d ^ 42610209238076L);
    return ((short) ((int) (this.c & __sourceIntrinsic_bf7f94fc0f2a_originalDynamicSite1726_2(5500, (725549143238785889L ^ local1)))));
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite1723_1(long a0) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_8bc6784b5e90_originalDynamicSite1724_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral9852_0() throws E;

private static native <E extends Throwable> long __sourceIntrinsic_3cae938e49ec_originalDynamicSite1725_1(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_bf7f94fc0f2a_originalDynamicSite1726_2(int a0, long a1) throws E;
}
