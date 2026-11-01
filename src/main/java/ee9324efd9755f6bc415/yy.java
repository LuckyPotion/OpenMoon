package moom;


public class yy extends net.minecraft.nbt.NBTBase {

private int[] c;

private static final long d;

private static final long e;

private static final long[] g;

private static final java.lang.Long[] h;

private static final java.util.Map i;

yy() {
super();
}


public yy(int[] p0) {
super();
    this.c = p0;
}


static {
d = ((long)(((moom._a)(moom._c.a(((long)(7862042773207935662L)), ((long)(7838563635586629717L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(252707731944364L)))));
    long local11_life6 = (moom.yy.d ^ 126442418866240L);
    javax.crypto.Cipher local13_life8;
    javax.crypto.Cipher __sourceSpill1139_10 = (local13_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1139_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1139_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1139_13 = new byte[8];
    (__sourceSpill1139_13)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local14_life14 = 1;
    while ((local14_life14 < 8)) {
        (__sourceSpill1139_13)[local14_life14] = ((byte) ((int) ((local11_life6 << (local14_life14 * 8)) >>> 56)));
        local14_life14 += 1;
    }
    byte[] __sourcePreallocation1139_15 = __sourceSpill1139_13;
    ((javax.crypto.Cipher)(__sourceSpill1139_10)).init(((int)(__sourceSpill1139_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1139_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1139_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local15_life18 = -6538489086984265503L;
    byte[] __sourceSpill1139_19 = new byte[8];
    (__sourceSpill1139_19)[0] = ((byte) ((int) (local15_life18 >>> 56)));
    (__sourceSpill1139_19)[1] = ((byte) ((int) (local15_life18 >>> 48)));
    (__sourceSpill1139_19)[2] = ((byte) ((int) (local15_life18 >>> 40)));
    (__sourceSpill1139_19)[3] = ((byte) ((int) (local15_life18 >>> 32)));
    (__sourceSpill1139_19)[4] = ((byte) ((int) (local15_life18 >>> 24)));
    (__sourceSpill1139_19)[5] = ((byte) ((int) (local15_life18 >>> 16)));
    (__sourceSpill1139_19)[6] = ((byte) ((int) (local15_life18 >>> 8)));
    (__sourceSpill1139_19)[7] = ((byte) ((int) local15_life18));
    javax.crypto.Cipher __sourceSpill1139_20 = local13_life8;
    byte[] local17_life22 = ((javax.crypto.Cipher)(__sourceSpill1139_20)).doFinal(((byte[])(__sourceSpill1139_19)));
    e = ((long)((((((((((((long) (local17_life22)[0]) & 255L) << 56) | ((((long) (local17_life22)[1]) & 255L) << 48)) | ((((long) (local17_life22)[2]) & 255L) << 40)) | ((((long) (local17_life22)[3]) & 255L) << 32)) | ((((long) (local17_life22)[4]) & 255L) << 24)) | ((((long) (local17_life22)[5]) & 255L) << 16)) | ((((long) (local17_life22)[6]) & 255L) << 8)) | (((long) (local17_life22)[7]) & 255L))));
    i = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life26;
    javax.crypto.Cipher __sourceSpill1139_28 = (local0_life26 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1139_29 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1139_30 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1139_31 = new byte[8];
    (__sourceSpill1139_31)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local1_life32 = 1;
    while ((local1_life32 < 8)) {
        (__sourceSpill1139_31)[local1_life32] = ((byte) ((int) ((local11_life6 << (local1_life32 * 8)) >>> 56)));
        local1_life32 += 1;
    }
    byte[] __sourcePreallocation1139_33 = __sourceSpill1139_31;
    ((javax.crypto.Cipher)(__sourceSpill1139_28)).init(((int)(__sourceSpill1139_29)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1139_30)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1139_33)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life36 = new long[2];
    int local3_life37 = 0;
    java.lang.String local4_life38;
    int local5_life40 = ((java.lang.String)((local4_life38 = "4~¢î®;Ê{O¹óÃ)"))).length();
    int local2_life41 = 0;
    do {
        java.lang.String __sourceSpill1139_42 = local4_life38;
        int __sourceSpill1139_43 = local2_life41;
        local2_life41 += 8;
        byte[] local7_life46 = ((java.lang.String)(((java.lang.String)(__sourceSpill1139_42)).substring(((int)(__sourceSpill1139_43)), ((int)(local2_life41))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1139_47 = local6_life36;
        int __sourceSpill1139_48 = local3_life37;
        local3_life37 += 1;
        long local8_life49 = (((((((((((long) (local7_life46)[0]) & 255L) << 56) | ((((long) (local7_life46)[1]) & 255L) << 48)) | ((((long) (local7_life46)[2]) & 255L) << 40)) | ((((long) (local7_life46)[3]) & 255L) << 32)) | ((((long) (local7_life46)[4]) & 255L) << 24)) | ((((long) (local7_life46)[5]) & 255L) << 16)) | ((((long) (local7_life46)[6]) & 255L) << 8)) | (((long) (local7_life46)[7]) & 255L));
        byte[] __sourceSpill1139_50 = new byte[8];
        (__sourceSpill1139_50)[0] = ((byte) ((int) (local8_life49 >>> 56)));
        (__sourceSpill1139_50)[1] = ((byte) ((int) (local8_life49 >>> 48)));
        (__sourceSpill1139_50)[2] = ((byte) ((int) (local8_life49 >>> 40)));
        (__sourceSpill1139_50)[3] = ((byte) ((int) (local8_life49 >>> 32)));
        (__sourceSpill1139_50)[4] = ((byte) ((int) (local8_life49 >>> 24)));
        (__sourceSpill1139_50)[5] = ((byte) ((int) (local8_life49 >>> 16)));
        (__sourceSpill1139_50)[6] = ((byte) ((int) (local8_life49 >>> 8)));
        (__sourceSpill1139_50)[7] = ((byte) ((int) local8_life49));
        javax.crypto.Cipher __sourceSpill1139_51 = local0_life26;
        byte[] local10_life53 = ((javax.crypto.Cipher)(__sourceSpill1139_51)).doFinal(((byte[])(__sourceSpill1139_50)));
        (__sourceSpill1139_47)[__sourceSpill1139_48] = (((((((((((long) (local10_life53)[0]) & 255L) << 56) | ((((long) (local10_life53)[1]) & 255L) << 48)) | ((((long) (local10_life53)[2]) & 255L) << 40)) | ((((long) (local10_life53)[3]) & 255L) << 32)) | ((((long) (local10_life53)[4]) & 255L) << 24)) | ((((long) (local10_life53)[5]) & 255L) << 16)) | ((((long) (local10_life53)[6]) & 255L) << 8)) | (((long) (local10_life53)[7]) & 255L));
    } while ((!(local2_life41 >= local5_life40)));
    g = ((long[])(local6_life36));
    h = ((java.lang.Long[])(new java.lang.Long[2]));
}


public boolean equals(java.lang.Object p0) {
int forwardValue4586_18_0;
    int forwardValue4586_22_0;
    int forwardValue4586_24_0;
    boolean spill4586_0;
    long life2_3;
    java.lang.String life4_5;
    forward_join_24: {
    forward_join_23: {
    forward_join_22: {
    forward_join_18: {
    life2_3 = (moom.yy.d ^ 51034111278000L);
    life4_5 = net.minecraft.nbt.NBTBase.b();
    spill4586_0 = super.equals(((java.lang.Object)(p0)));
    if (!((life4_5 == null))) {
        forwardValue4586_18_0 = ((spill4586_0) ? 1 : 0);
        break forward_join_18;
    }
    if (!(spill4586_0)) {
        break forward_join_23;
    }
    forwardValue4586_18_0 = ((java.util.Arrays.equals(((int[])(this.c)), ((int[])(((moom.yy)(((moom.yy)(p0)))).c)))) ? 1 : 0);
    }
    if (!((life4_5 == null))) {
        forwardValue4586_22_0 = forwardValue4586_18_0;
        break forward_join_22;
    }
    if (!((forwardValue4586_18_0 != 0))) {
        break forward_join_23;
    }
    forwardValue4586_22_0 = 1;
    }
    forwardValue4586_24_0 = forwardValue4586_22_0;
    break forward_join_24;
    }
    forwardValue4586_24_0 = 0;
    }
    return ((forwardValue4586_24_0) != 0);
}


public java.lang.String toString() {
java.lang.StringBuilder lexicalValue1441_38_0;
    java.lang.String spill1441_0;
    java.lang.StringBuilder spill1441_1;
    long life1_3;
    java.lang.StringBuilder life4_9;
    java.lang.String life3_10;
    int[] life5_13;
    int life6_16;
    int life7_18;
    int life8_25;
    lexical_join_38: {
    lexical_join_37: {
    life1_3 = (moom.yy.d ^ 43209066318602L);
    spill1441_0 = net.minecraft.nbt.NBTBase.b();
    life4_9 = new java.lang.StringBuilder("[");
    life3_10 = spill1441_0;
    life5_13 = this.c;
    life6_16 = (life5_13).length;
    life7_18 = 0;
    lexical_cycle_19: while (true) {
    if (!((life7_18 < life6_16))) {
        break lexical_join_37;
    }
    life8_25 = (life5_13)[life7_18];
    spill1441_1 = ((java.lang.StringBuilder)(((java.lang.StringBuilder)(life4_9)).append(((int)(life8_25))))).append(((java.lang.String)(",")));
    if (!((life3_10 == null))) {
        lexicalValue1441_38_0 = spill1441_1;
        break lexical_join_38;
    }
    recovery.source.CarrierOps.discard(spill1441_1);
    life7_18 += 1;
    if (!((life3_10 != null))) { continue lexical_cycle_19; }
    break lexical_cycle_19;
    }
    }
    lexicalValue1441_38_0 = life4_9;
    }
    return __sourceIntrinsic_a86c261fcdee_invokedynamic1441_6(lexicalValue1441_38_0);
}


public int hashCode() {
return (super.hashCode() ^ java.util.Arrays.hashCode(((int[])(this.c))));
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


void a(java.io.DataOutput p0) throws java.io.IOException {
java.lang.String spill1440_0;
    long life2_3;
    java.lang.String life4_10;
    int[] life5_13;
    int life6_16;
    int life7_18;
    int life8_25;
    lexical_join_32: {
    life2_3 = (moom.yy.d ^ 75058369642190L);
    spill1440_0 = net.minecraft.nbt.NBTBase.b();
    ((java.io.DataOutput)(p0)).writeInt(((int)((this.c).length)));
    life4_10 = spill1440_0;
    life5_13 = this.c;
    life6_16 = (life5_13).length;
    life7_18 = 0;
    lexical_cycle_19: while (true) {
    if (!((life7_18 < life6_16))) {
        break lexical_join_32;
    }
    life8_25 = (life5_13)[life7_18];
    ((java.io.DataOutput)(p0)).writeInt(((int)(life8_25)));
    life7_18 += 1;
    if (!((life4_10 != null))) { continue lexical_cycle_19; }
    break lexical_cycle_19;
    }
    }
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
    life3_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 14092);
    if (((moom.yy.h)[life3_8] == null)) {
        life4_77 = new byte[] {((byte) ((int) (p1 >>> 56))), ((byte) ((int) (p1 >>> 48))), ((byte) ((int) (p1 >>> 40))), ((byte) ((int) (p1 >>> 32))), ((byte) ((int) (p1 >>> 24))), ((byte) ((int) (p1 >>> 16))), ((byte) ((int) (p1 >>> 8))), ((byte) ((int) p1))};
        life5_81 = (moom.yy.g)[life3_8];
        life7_146 = new byte[] {((byte) ((int) (life5_81 >>> 56))), ((byte) ((int) (life5_81 >>> 48))), ((byte) ((int) (life5_81 >>> 40))), ((byte) ((int) (life5_81 >>> 32))), ((byte) ((int) (life5_81 >>> 24))), ((byte) ((int) (life5_81 >>> 16))), ((byte) ((int) (life5_81 >>> 8))), ((byte) ((int) life5_81))};
        life8_150 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life9_155 = ((java.lang.Object[])(((java.util.Map)(moom.yy.i)).get(((java.lang.Object)(life8_150)))));
        try {
        if ((life9_155 == null)) {
        life9_155 = new java.lang.Object[3];
        (life9_155)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding")));
        (life9_155)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life9_155)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.yy.i)).put(((java.lang.Object)(life8_150)), ((java.lang.Object)(life9_155)));
    }
        life11_188 = new javax.crypto.spec.DESKeySpec(life4_77);
        life12_195 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life9_155)[1])))).generateSecret(((java.security.spec.KeySpec)(life11_188)));
        life13_200 = ((javax.crypto.Cipher)((life9_155)[0]));
        ((javax.crypto.Cipher)(life13_200)).init(((int)(2)), ((java.security.Key)(life12_195)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life9_155)[2])))));
        life10_212 = ((javax.crypto.Cipher)(life13_200)).doFinal(((byte[])(life7_146)));
    } catch (java.lang.Exception life11_214) {
        throw new java.lang.RuntimeException("moom/yy", life11_214);
    }
        life11_290 = (((((((((((long) (life10_212)[0]) & 255L) << 56) | ((((long) (life10_212)[1]) & 255L) << 48)) | ((((long) (life10_212)[2]) & 255L) << 40)) | ((((long) (life10_212)[3]) & 255L) << 32)) | ((((long) (life10_212)[4]) & 255L) << 24)) | ((((long) (life10_212)[5]) & 255L) << 16)) | ((((long) (life10_212)[6]) & 255L) << 8)) | (((long) (life10_212)[7]) & 255L));
        (moom.yy.h)[life3_8] = java.lang.Long.valueOf(((long)(life11_290)));
    }
    return ((java.lang.Long)((moom.yy.h)[life3_8])).longValue();
}


private static long a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    long local7 = moom.yy.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local9 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Long.TYPE)), ((java.lang.Object)(java.lang.Long.valueOf(((long)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local9)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral9862_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/yy"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public byte a() {
long local1 = (moom.yy.d ^ 75865942380627L);
    return (__sourceIntrinsic_integerToByte((int) moom.yy.e));
}


public net.minecraft.nbt.NBTBase a__yn() {
int[] local1 = new int[(this.c).length];
    java.lang.System.arraycopy(((java.lang.Object)(this.c)), ((int)(0)), ((java.lang.Object)(local1)), ((int)(0)), ((int)((this.c).length)));
    return new moom.yy(local1);
}


void a(java.io.DataInput p0, int p1, moom.yB p2) throws java.io.IOException {
java.lang.String spill1439_0;
    long life4_3;
    java.lang.String life6_12;
    int life7_15;
    int life8_31;
    lexical_join_44: {
    life4_3 = (moom.yy.d ^ 122000595656881L);
    spill1439_0 = net.minecraft.nbt.NBTBase.b();
    ((moom.yB)(p2)).a(((long)(__sourceIntrinsic_3cae938e49ec_invokedynamic1439_2(3157, (1517959656394307337L ^ life4_3)))));
    life6_12 = spill1439_0;
    life7_15 = ((java.io.DataInput)(p0)).readInt();
    ((moom.yB)(p2)).a(((long)((__sourceIntrinsic_3cae938e49ec_invokedynamic1439_5(32345, (4749812390436259076L ^ life4_3)) * ((long) life7_15)))));
    this.c = ((int[])(new int[life7_15]));
    life8_31 = 0;
    lexical_cycle_32: while (true) {
    if (!((life8_31 < life7_15))) {
        break lexical_join_44;
    }
    (this.c)[life8_31] = ((java.io.DataInput)(p0)).readInt();
    life8_31 += 1;
    if (!((life6_12 != null))) { continue lexical_cycle_32; }
    break lexical_cycle_32;
    }
    }
    return;
}


public int[] a__ArrayInt() {
return this.c;
}


private static native <E extends Throwable> long __sourceIntrinsic_3cae938e49ec_invokedynamic1439_2(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_3cae938e49ec_invokedynamic1439_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral9862_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_invokedynamic1441_6(java.lang.StringBuilder a0) throws E;

private static native byte __sourceIntrinsic_integerToByte(int value);
}
