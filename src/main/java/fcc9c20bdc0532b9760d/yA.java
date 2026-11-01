package moom;


public class yA extends net.minecraft.nbt.NBTBase {

private java.lang.String c;

private static long d;

private static long e;

private static long[] g;

private static java.lang.Long[] h;

private static java.util.Map i;

public yA() {
super();
    this.c = "";
}

private static native <E extends Throwable> void __sourceConstructorInit_c5c3487553eff578_0(moom.yA a0) throws E;

public yA(java.lang.String p0) { super(); }

private static void __sourceConstructorBody_c5c3487553eff578(moom.yA receiver, java.lang.String p0) throws Throwable {
long local2 = (moom.yA.d ^ 123445096479205L);
    moom.yA.__sourceConstructorInit_c5c3487553eff578_0(((moom.yA)(receiver)));
    ((moom.yA)(receiver)).c = ((java.lang.String)(p0));
    if ((p0 == null)) {
        throw new java.lang.IllegalArgumentException("Empty string not allowed");
    }
    return;
}


static {
d = ((long)(((moom._a)(moom._c.a(((long)(7309398105037636507L)), ((long)(1730815712755031688L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(73806403177120L)))));
    long local11_life6 = (moom.yA.d ^ 111300554476331L);
    javax.crypto.Cipher local13_life8;
    javax.crypto.Cipher __sourceSpill1120_10 = (local13_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1120_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1120_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1120_13 = new byte[8];
    (__sourceSpill1120_13)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local14_life14 = 1;
    while ((local14_life14 < 8)) {
        (__sourceSpill1120_13)[local14_life14] = ((byte) ((int) ((local11_life6 << (local14_life14 * 8)) >>> 56)));
        local14_life14 += 1;
    }
    byte[] __sourcePreallocation1120_15 = __sourceSpill1120_13;
    ((javax.crypto.Cipher)(__sourceSpill1120_10)).init(((int)(__sourceSpill1120_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1120_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1120_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local15_life18 = 4632468365434887271L;
    byte[] __sourceSpill1120_19 = new byte[8];
    (__sourceSpill1120_19)[0] = ((byte) ((int) (local15_life18 >>> 56)));
    (__sourceSpill1120_19)[1] = ((byte) ((int) (local15_life18 >>> 48)));
    (__sourceSpill1120_19)[2] = ((byte) ((int) (local15_life18 >>> 40)));
    (__sourceSpill1120_19)[3] = ((byte) ((int) (local15_life18 >>> 32)));
    (__sourceSpill1120_19)[4] = ((byte) ((int) (local15_life18 >>> 24)));
    (__sourceSpill1120_19)[5] = ((byte) ((int) (local15_life18 >>> 16)));
    (__sourceSpill1120_19)[6] = ((byte) ((int) (local15_life18 >>> 8)));
    (__sourceSpill1120_19)[7] = ((byte) ((int) local15_life18));
    javax.crypto.Cipher __sourceSpill1120_20 = local13_life8;
    byte[] local17_life22 = ((javax.crypto.Cipher)(__sourceSpill1120_20)).doFinal(((byte[])(__sourceSpill1120_19)));
    e = ((long)((((((((((((long) (local17_life22)[0]) & 255L) << 56) | ((((long) (local17_life22)[1]) & 255L) << 48)) | ((((long) (local17_life22)[2]) & 255L) << 40)) | ((((long) (local17_life22)[3]) & 255L) << 32)) | ((((long) (local17_life22)[4]) & 255L) << 24)) | ((((long) (local17_life22)[5]) & 255L) << 16)) | ((((long) (local17_life22)[6]) & 255L) << 8)) | (((long) (local17_life22)[7]) & 255L))));
    i = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life26;
    javax.crypto.Cipher __sourceSpill1120_28 = (local0_life26 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1120_29 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1120_30 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1120_31 = new byte[8];
    (__sourceSpill1120_31)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local1_life32 = 1;
    while ((local1_life32 < 8)) {
        (__sourceSpill1120_31)[local1_life32] = ((byte) ((int) ((local11_life6 << (local1_life32 * 8)) >>> 56)));
        local1_life32 += 1;
    }
    byte[] __sourcePreallocation1120_33 = __sourceSpill1120_31;
    ((javax.crypto.Cipher)(__sourceSpill1120_28)).init(((int)(__sourceSpill1120_29)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1120_30)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1120_33)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life36 = new long[2];
    int local3_life37 = 0;
    java.lang.String local4_life38;
    int local5_life40 = ((java.lang.String)((local4_life38 = "\003Ò;r¥·ïÔØ_BZ\035\005"))).length();
    int local2_life41 = 0;
    do {
        java.lang.String __sourceSpill1120_42 = local4_life38;
        int __sourceSpill1120_43 = local2_life41;
        local2_life41 += 8;
        byte[] local7_life46 = ((java.lang.String)(((java.lang.String)(__sourceSpill1120_42)).substring(((int)(__sourceSpill1120_43)), ((int)(local2_life41))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1120_47 = local6_life36;
        int __sourceSpill1120_48 = local3_life37;
        local3_life37 += 1;
        long local8_life49 = (((((((((((long) (local7_life46)[0]) & 255L) << 56) | ((((long) (local7_life46)[1]) & 255L) << 48)) | ((((long) (local7_life46)[2]) & 255L) << 40)) | ((((long) (local7_life46)[3]) & 255L) << 32)) | ((((long) (local7_life46)[4]) & 255L) << 24)) | ((((long) (local7_life46)[5]) & 255L) << 16)) | ((((long) (local7_life46)[6]) & 255L) << 8)) | (((long) (local7_life46)[7]) & 255L));
        byte[] __sourceSpill1120_50 = new byte[8];
        (__sourceSpill1120_50)[0] = ((byte) ((int) (local8_life49 >>> 56)));
        (__sourceSpill1120_50)[1] = ((byte) ((int) (local8_life49 >>> 48)));
        (__sourceSpill1120_50)[2] = ((byte) ((int) (local8_life49 >>> 40)));
        (__sourceSpill1120_50)[3] = ((byte) ((int) (local8_life49 >>> 32)));
        (__sourceSpill1120_50)[4] = ((byte) ((int) (local8_life49 >>> 24)));
        (__sourceSpill1120_50)[5] = ((byte) ((int) (local8_life49 >>> 16)));
        (__sourceSpill1120_50)[6] = ((byte) ((int) (local8_life49 >>> 8)));
        (__sourceSpill1120_50)[7] = ((byte) ((int) local8_life49));
        javax.crypto.Cipher __sourceSpill1120_51 = local0_life26;
        byte[] local10_life53 = ((javax.crypto.Cipher)(__sourceSpill1120_51)).doFinal(((byte[])(__sourceSpill1120_50)));
        (__sourceSpill1120_47)[__sourceSpill1120_48] = (((((((((((long) (local10_life53)[0]) & 255L) << 56) | ((((long) (local10_life53)[1]) & 255L) << 48)) | ((((long) (local10_life53)[2]) & 255L) << 40)) | ((((long) (local10_life53)[3]) & 255L) << 32)) | ((((long) (local10_life53)[4]) & 255L) << 24)) | ((((long) (local10_life53)[5]) & 255L) << 16)) | ((((long) (local10_life53)[6]) & 255L) << 8)) | (((long) (local10_life53)[7]) & 255L));
    } while ((!(local2_life41 >= local5_life40)));
    g = ((long[])(local6_life36));
    h = ((java.lang.Long[])(new java.lang.Long[2]));
}


public boolean equals(java.lang.Object p0) {
moom.yA forwardValue4552_16_0;
    java.lang.String forwardValue4552_29_0;
    java.lang.String forwardValue4552_34_0;
    int forwardValue4552_41_0;
    int forwardValue4552_43_0;
    moom.yA spill4552_0;
    java.lang.String spill4552_1;
    java.lang.String spill4552_2;
    boolean spill4552_3;
    long life2_3;
    java.lang.String life4_5;
    moom.yA life5_21;
    forward_join_43: {
    forward_join_42: {
    forward_join_41: {
    forward_join_40: {
    forward_join_34: {
    forward_join_29: {
    forward_join_27: {
    forward_join_16: {
    forward_join_14: {
    life2_3 = (moom.yA.d ^ 20095150377497L);
    life4_5 = net.minecraft.nbt.NBTBase.b();
    spill4552_0 = this;
    if (!((life4_5 == null))) {
        forwardValue4552_16_0 = spill4552_0;
        break forward_join_16;
    }
    if (!((!__sourceIntrinsic_eb1342255c6f_call4552_2(spill4552_0, p0)))) {
        break forward_join_14;
    }
    return ((0) != 0);
    }
    forwardValue4552_16_0 = ((moom.yA)(p0));
    }
    life5_21 = forwardValue4552_16_0;
    spill4552_1 = this.c;
    if (!((life4_5 == null))) {
        forwardValue4552_29_0 = spill4552_1;
        break forward_join_29;
    }
    if (!((spill4552_1 == null))) {
        break forward_join_27;
    }
    spill4552_2 = ((moom.yA)(life5_21)).c;
    if (!((life4_5 == null))) {
        forwardValue4552_29_0 = spill4552_2;
        break forward_join_29;
    }
    if (!((spill4552_2 != null))) {
        break forward_join_40;
    }
    }
    forwardValue4552_29_0 = this.c;
    }
    if (!((life4_5 == null))) {
        forwardValue4552_34_0 = forwardValue4552_29_0;
        break forward_join_34;
    }
    if (!((forwardValue4552_29_0 != null))) {
        break forward_join_42;
    }
    forwardValue4552_34_0 = this.c;
    }
    spill4552_3 = ((java.lang.String)(forwardValue4552_34_0)).equals(((java.lang.Object)(((moom.yA)(life5_21)).c)));
    if (!((life4_5 == null))) {
        forwardValue4552_41_0 = ((spill4552_3) ? 1 : 0);
        break forward_join_41;
    }
    if (!(spill4552_3)) {
        break forward_join_42;
    }
    }
    forwardValue4552_41_0 = 1;
    }
    forwardValue4552_43_0 = forwardValue4552_41_0;
    break forward_join_43;
    }
    forwardValue4552_43_0 = 0;
    }
    return ((forwardValue4552_43_0) != 0);
}


public java.lang.String toString() {
return __sourceIntrinsic_a86c261fcdee_originalDynamicSite1709_2(((java.lang.String)(this.c)).replace(((java.lang.CharSequence)("\"")), ((java.lang.CharSequence)("\\\""))));
}


public int hashCode() {
return (super.hashCode() ^ ((java.lang.String)(this.c)).hashCode());
}


private static java.lang.IllegalArgumentException a(java.lang.IllegalArgumentException p0) {
return p0;
}


void a(java.io.DataOutput p0) throws java.io.IOException {
((java.io.DataOutput)(p0)).writeUTF(((java.lang.String)(this.c)));
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
    life3_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 11434);
    if (((moom.yA.h)[life3_8] == null)) {
        life4_77 = new byte[] {((byte) ((int) (p1 >>> 56))), ((byte) ((int) (p1 >>> 48))), ((byte) ((int) (p1 >>> 40))), ((byte) ((int) (p1 >>> 32))), ((byte) ((int) (p1 >>> 24))), ((byte) ((int) (p1 >>> 16))), ((byte) ((int) (p1 >>> 8))), ((byte) ((int) p1))};
        life5_81 = (moom.yA.g)[life3_8];
        life7_146 = new byte[] {((byte) ((int) (life5_81 >>> 56))), ((byte) ((int) (life5_81 >>> 48))), ((byte) ((int) (life5_81 >>> 40))), ((byte) ((int) (life5_81 >>> 32))), ((byte) ((int) (life5_81 >>> 24))), ((byte) ((int) (life5_81 >>> 16))), ((byte) ((int) (life5_81 >>> 8))), ((byte) ((int) life5_81))};
        life8_150 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life9_155 = ((java.lang.Object[])(((java.util.Map)(moom.yA.i)).get(((java.lang.Object)(life8_150)))));
        try {
        if ((life9_155 == null)) {
        life9_155 = new java.lang.Object[3];
        (life9_155)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding")));
        (life9_155)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life9_155)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.yA.i)).put(((java.lang.Object)(life8_150)), ((java.lang.Object)(life9_155)));
    }
        life11_188 = new javax.crypto.spec.DESKeySpec(life4_77);
        life12_195 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life9_155)[1])))).generateSecret(((java.security.spec.KeySpec)(life11_188)));
        life13_200 = ((javax.crypto.Cipher)((life9_155)[0]));
        ((javax.crypto.Cipher)(life13_200)).init(((int)(2)), ((java.security.Key)(life12_195)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life9_155)[2])))));
        life10_212 = ((javax.crypto.Cipher)(life13_200)).doFinal(((byte[])(life7_146)));
    } catch (java.lang.Exception life11_214) {
        throw new java.lang.RuntimeException("moom/yA", life11_214);
    }
        life11_290 = (((((((((((long) (life10_212)[0]) & 255L) << 56) | ((((long) (life10_212)[1]) & 255L) << 48)) | ((((long) (life10_212)[2]) & 255L) << 40)) | ((((long) (life10_212)[3]) & 255L) << 32)) | ((((long) (life10_212)[4]) & 255L) << 24)) | ((((long) (life10_212)[5]) & 255L) << 16)) | ((((long) (life10_212)[6]) & 255L) << 8)) | (((long) (life10_212)[7]) & 255L));
        (moom.yA.h)[life3_8] = java.lang.Long.valueOf(((long)(life11_290)));
    }
    return ((java.lang.Long)((moom.yA.h)[life3_8])).longValue();
}


private static long a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    long local7 = moom.yA.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local9 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Long.TYPE)), ((java.lang.Object)(java.lang.Long.valueOf(((long)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local9)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral9785_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/yA"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public byte a() {
long local1 = (moom.yA.d ^ 119389815913455L);
    return (__sourceIntrinsic_integerToByte((int) moom.yA.e));
}


public net.minecraft.nbt.NBTBase a__yn() {
return new moom.yA(this.c);
}


public boolean a__Boolean() {
return (__sourceIntrinsic_booleanComparison((((java.lang.String)(this.c)).isEmpty())) != 0);
}


void a(java.io.DataInput p0, int p1, moom.yB p2) throws java.io.IOException {
long local4 = (moom.yA.d ^ 77648901458701L);
    ((moom.yB)(p2)).a(((long)(__sourceIntrinsic_3cae938e49ec_originalDynamicSite1710_1(6856, (1849249593074793011L ^ local4)))));
    this.c = ((java.lang.String)(((java.io.DataInput)(p0)).readUTF()));
    ((moom.yB)(p2)).a(((long)((__sourceIntrinsic_3cae938e49ec_originalDynamicSite1710_5(18249, (256918939572561843L ^ local4)) * ((long) ((java.lang.String)(this.c)).length())))));
    return;
}


public java.lang.String a__String() {
return this.c;
}


private static native <E extends Throwable> boolean __sourceIntrinsic_eb1342255c6f_call4552_2(moom.yA a0, java.lang.Object a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite1709_2(java.lang.String a0) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral9785_0() throws E;

private static native <E extends Throwable> long __sourceIntrinsic_3cae938e49ec_originalDynamicSite1710_1(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_3cae938e49ec_originalDynamicSite1710_5(int a0, long a1) throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);

private static native byte __sourceIntrinsic_integerToByte(int value);
}
