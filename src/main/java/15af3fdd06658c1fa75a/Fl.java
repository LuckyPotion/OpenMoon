package moom;


public class Fl extends net.minecraft.world.chunk.Chunk {

private static final long z;

private static final long D;

private static final long[] H;

private static final java.lang.Long[] I;

private static final java.util.Map J;

public Fl(net.minecraft.world.World p0, int p1, int p2) {
super(p0, p1, p2);
}


static {
z = ((long)(((moom._a)(moom._c.a(((long)(1051787246757045217L)), ((long)(-1529550421388613940L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(48352005696688L)))));
    long local11_life6 = (moom.Fl.z ^ 130702231809967L);
    javax.crypto.Cipher local13_life8;
    javax.crypto.Cipher __sourceSpill540_10 = (local13_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill540_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill540_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill540_13 = new byte[8];
    (__sourceSpill540_13)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local14_life14 = 1;
    while ((local14_life14 < 8)) {
        (__sourceSpill540_13)[local14_life14] = ((byte) ((int) ((local11_life6 << (local14_life14 * 8)) >>> 56)));
        local14_life14 += 1;
    }
    byte[] __sourcePreallocation540_15 = __sourceSpill540_13;
    ((javax.crypto.Cipher)(__sourceSpill540_10)).init(((int)(__sourceSpill540_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill540_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation540_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local15_life18 = 6743048169585741860L;
    byte[] __sourceSpill540_19 = new byte[8];
    (__sourceSpill540_19)[0] = ((byte) ((int) (local15_life18 >>> 56)));
    (__sourceSpill540_19)[1] = ((byte) ((int) (local15_life18 >>> 48)));
    (__sourceSpill540_19)[2] = ((byte) ((int) (local15_life18 >>> 40)));
    (__sourceSpill540_19)[3] = ((byte) ((int) (local15_life18 >>> 32)));
    (__sourceSpill540_19)[4] = ((byte) ((int) (local15_life18 >>> 24)));
    (__sourceSpill540_19)[5] = ((byte) ((int) (local15_life18 >>> 16)));
    (__sourceSpill540_19)[6] = ((byte) ((int) (local15_life18 >>> 8)));
    (__sourceSpill540_19)[7] = ((byte) ((int) local15_life18));
    javax.crypto.Cipher __sourceSpill540_20 = local13_life8;
    byte[] local17_life22 = ((javax.crypto.Cipher)(__sourceSpill540_20)).doFinal(((byte[])(__sourceSpill540_19)));
    D = ((long)((((((((((((long) (local17_life22)[0]) & 255L) << 56) | ((((long) (local17_life22)[1]) & 255L) << 48)) | ((((long) (local17_life22)[2]) & 255L) << 40)) | ((((long) (local17_life22)[3]) & 255L) << 32)) | ((((long) (local17_life22)[4]) & 255L) << 24)) | ((((long) (local17_life22)[5]) & 255L) << 16)) | ((((long) (local17_life22)[6]) & 255L) << 8)) | (((long) (local17_life22)[7]) & 255L))));
    J = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life26;
    javax.crypto.Cipher __sourceSpill540_28 = (local0_life26 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill540_29 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill540_30 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill540_31 = new byte[8];
    (__sourceSpill540_31)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local1_life32 = 1;
    while ((local1_life32 < 8)) {
        (__sourceSpill540_31)[local1_life32] = ((byte) ((int) ((local11_life6 << (local1_life32 * 8)) >>> 56)));
        local1_life32 += 1;
    }
    byte[] __sourcePreallocation540_33 = __sourceSpill540_31;
    ((javax.crypto.Cipher)(__sourceSpill540_28)).init(((int)(__sourceSpill540_29)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill540_30)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation540_33)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life36 = new long[4];
    int local3_life37 = 0;
    java.lang.String local4_life38;
    int local5_life40 = ((java.lang.String)((local4_life38 = "\005 yd\000ç¼5>´ò\033"))).length();
    int local2_life41 = 0;
    do {
        java.lang.String __sourceSpill540_42 = local4_life38;
        int __sourceSpill540_43 = local2_life41;
        local2_life41 += 8;
        byte[] local7_life46 = ((java.lang.String)(((java.lang.String)(__sourceSpill540_42)).substring(((int)(__sourceSpill540_43)), ((int)(local2_life41))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill540_47 = local6_life36;
        int __sourceSpill540_48 = local3_life37;
        local3_life37 += 1;
        long local8_life49 = (((((((((((long) (local7_life46)[0]) & 255L) << 56) | ((((long) (local7_life46)[1]) & 255L) << 48)) | ((((long) (local7_life46)[2]) & 255L) << 40)) | ((((long) (local7_life46)[3]) & 255L) << 32)) | ((((long) (local7_life46)[4]) & 255L) << 24)) | ((((long) (local7_life46)[5]) & 255L) << 16)) | ((((long) (local7_life46)[6]) & 255L) << 8)) | (((long) (local7_life46)[7]) & 255L));
        byte[] __sourceSpill540_50 = new byte[8];
        (__sourceSpill540_50)[0] = ((byte) ((int) (local8_life49 >>> 56)));
        (__sourceSpill540_50)[1] = ((byte) ((int) (local8_life49 >>> 48)));
        (__sourceSpill540_50)[2] = ((byte) ((int) (local8_life49 >>> 40)));
        (__sourceSpill540_50)[3] = ((byte) ((int) (local8_life49 >>> 32)));
        (__sourceSpill540_50)[4] = ((byte) ((int) (local8_life49 >>> 24)));
        (__sourceSpill540_50)[5] = ((byte) ((int) (local8_life49 >>> 16)));
        (__sourceSpill540_50)[6] = ((byte) ((int) (local8_life49 >>> 8)));
        (__sourceSpill540_50)[7] = ((byte) ((int) local8_life49));
        javax.crypto.Cipher __sourceSpill540_51 = local0_life26;
        byte[] local10_life53 = ((javax.crypto.Cipher)(__sourceSpill540_51)).doFinal(((byte[])(__sourceSpill540_50)));
        (__sourceSpill540_47)[__sourceSpill540_48] = (((((((((((long) (local10_life53)[0]) & 255L) << 56) | ((((long) (local10_life53)[1]) & 255L) << 48)) | ((((long) (local10_life53)[2]) & 255L) << 40)) | ((((long) (local10_life53)[3]) & 255L) << 32)) | ((((long) (local10_life53)[4]) & 255L) << 24)) | ((((long) (local10_life53)[5]) & 255L) << 16)) | ((((long) (local10_life53)[6]) & 255L) << 8)) | (((long) (local10_life53)[7]) & 255L));
    } while ((!(local2_life41 >= local5_life40)));
    local5_life40 = ((java.lang.String)((local4_life38 = "\013?mÑn¬DâßdÑÙ´"))).length();
    local2_life41 = 0;
    do {
        java.lang.String __sourceSpill540_55 = local4_life38;
        int __sourceSpill540_56 = local2_life41;
        local2_life41 += 8;
        byte[] local7_life59 = ((java.lang.String)(((java.lang.String)(__sourceSpill540_55)).substring(((int)(__sourceSpill540_56)), ((int)(local2_life41))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill540_60 = local6_life36;
        int __sourceSpill540_61 = local3_life37;
        local3_life37 += 1;
        long local8_life62 = (((((((((((long) (local7_life59)[0]) & 255L) << 56) | ((((long) (local7_life59)[1]) & 255L) << 48)) | ((((long) (local7_life59)[2]) & 255L) << 40)) | ((((long) (local7_life59)[3]) & 255L) << 32)) | ((((long) (local7_life59)[4]) & 255L) << 24)) | ((((long) (local7_life59)[5]) & 255L) << 16)) | ((((long) (local7_life59)[6]) & 255L) << 8)) | (((long) (local7_life59)[7]) & 255L));
        byte[] __sourceSpill540_63 = new byte[8];
        (__sourceSpill540_63)[0] = ((byte) ((int) (local8_life62 >>> 56)));
        (__sourceSpill540_63)[1] = ((byte) ((int) (local8_life62 >>> 48)));
        (__sourceSpill540_63)[2] = ((byte) ((int) (local8_life62 >>> 40)));
        (__sourceSpill540_63)[3] = ((byte) ((int) (local8_life62 >>> 32)));
        (__sourceSpill540_63)[4] = ((byte) ((int) (local8_life62 >>> 24)));
        (__sourceSpill540_63)[5] = ((byte) ((int) (local8_life62 >>> 16)));
        (__sourceSpill540_63)[6] = ((byte) ((int) (local8_life62 >>> 8)));
        (__sourceSpill540_63)[7] = ((byte) ((int) local8_life62));
        javax.crypto.Cipher __sourceSpill540_64 = local0_life26;
        byte[] local10_life66 = ((javax.crypto.Cipher)(__sourceSpill540_64)).doFinal(((byte[])(__sourceSpill540_63)));
        (__sourceSpill540_60)[__sourceSpill540_61] = (((((((((((long) (local10_life66)[0]) & 255L) << 56) | ((((long) (local10_life66)[1]) & 255L) << 48)) | ((((long) (local10_life66)[2]) & 255L) << 40)) | ((((long) (local10_life66)[3]) & 255L) << 32)) | ((((long) (local10_life66)[4]) & 255L) << 24)) | ((((long) (local10_life66)[5]) & 255L) << 16)) | ((((long) (local10_life66)[6]) & 255L) << 8)) | (((long) (local10_life66)[7]) & 255L));
    } while ((!(local2_life41 >= local5_life40)));
    H = ((long[])(local6_life36));
    I = ((java.lang.Long[])(new java.lang.Long[4]));
}


public boolean b(int p0, int p1) {
return ((1) != 0);
}


public int b(moom.DT p0) {
long local2 = (moom.Fl.z ^ 131733213348494L);
    return ((int) moom.Fl.D);
}


public void b(net.minecraft.entity.Entity p0) {
return;
}


public void b__Void() {
return;
}


public void e() {
return;
}


private static long c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    long local7 = moom.Fl.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local9 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Long.TYPE)), ((java.lang.Object)(java.lang.Long.valueOf(((long)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local9)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral4541_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Fl"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void c() {
return;
}


private static long c(int p0, long p1) {
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
    life3_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 19337);
    if (((moom.Fl.I)[life3_8] == null)) {
        life4_77 = new byte[] {((byte) ((int) (p1 >>> 56))), ((byte) ((int) (p1 >>> 48))), ((byte) ((int) (p1 >>> 40))), ((byte) ((int) (p1 >>> 32))), ((byte) ((int) (p1 >>> 24))), ((byte) ((int) (p1 >>> 16))), ((byte) ((int) (p1 >>> 8))), ((byte) ((int) p1))};
        life5_81 = (moom.Fl.H)[life3_8];
        life7_146 = new byte[] {((byte) ((int) (life5_81 >>> 56))), ((byte) ((int) (life5_81 >>> 48))), ((byte) ((int) (life5_81 >>> 40))), ((byte) ((int) (life5_81 >>> 32))), ((byte) ((int) (life5_81 >>> 24))), ((byte) ((int) (life5_81 >>> 16))), ((byte) ((int) (life5_81 >>> 8))), ((byte) ((int) life5_81))};
        life8_150 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life9_155 = ((java.lang.Object[])(((java.util.Map)(moom.Fl.J)).get(((java.lang.Object)(life8_150)))));
        try {
        if ((life9_155 == null)) {
        life9_155 = new java.lang.Object[3];
        (life9_155)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding")));
        (life9_155)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life9_155)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.Fl.J)).put(((java.lang.Object)(life8_150)), ((java.lang.Object)(life9_155)));
    }
        life11_188 = new javax.crypto.spec.DESKeySpec(life4_77);
        life12_195 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life9_155)[1])))).generateSecret(((java.security.spec.KeySpec)(life11_188)));
        life13_200 = ((javax.crypto.Cipher)((life9_155)[0]));
        ((javax.crypto.Cipher)(life13_200)).init(((int)(2)), ((java.security.Key)(life12_195)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life9_155)[2])))));
        life10_212 = ((javax.crypto.Cipher)(life13_200)).doFinal(((byte[])(life7_146)));
    } catch (java.lang.Exception life11_214) {
        throw new java.lang.RuntimeException("moom/Fl", life11_214);
    }
        life11_290 = (((((((((((long) (life10_212)[0]) & 255L) << 56) | ((((long) (life10_212)[1]) & 255L) << 48)) | ((((long) (life10_212)[2]) & 255L) << 40)) | ((((long) (life10_212)[3]) & 255L) << 32)) | ((((long) (life10_212)[4]) & 255L) << 24)) | ((((long) (life10_212)[5]) & 255L) << 16)) | ((((long) (life10_212)[6]) & 255L) << 8)) | (((long) (life10_212)[7]) & 255L));
        (moom.Fl.I)[life3_8] = java.lang.Long.valueOf(((long)(life11_290)));
    }
    return ((java.lang.Long)((moom.Fl.I)[life3_8])).longValue();
}


public int c(moom.DT p0) {
return 0;
}


public void d() {
return;
}


public java.util.Random a(long p0) {
long local3 = (moom.Fl.z ^ 83008680671614L);
    return new java.util.Random((((((((net.minecraft.world.World)(((moom.Fl)(this)).a__Eu())).a__Long() + ((((long) ((moom.Fl)(this)).i) * ((long) ((moom.Fl)(this)).i)) * __sourceIntrinsic_8226ceefacb8_originalDynamicSite1150_5(20790, (4896742263694149619L ^ local3)))) + (((long) ((moom.Fl)(this)).i) * __sourceIntrinsic_8226ceefacb8_originalDynamicSite1150_7(8908, (8563890868032451594L ^ local3)))) + ((((long) ((moom.Fl)(this)).j) * ((long) ((moom.Fl)(this)).j)) * __sourceIntrinsic_8226ceefacb8_originalDynamicSite1150_10(27956, (5644373661463935984L ^ local3)))) + (((long) ((moom.Fl)(this)).j) * __sourceIntrinsic_8226ceefacb8_originalDynamicSite1150_12(9898, (7198435168868872301L ^ local3)))) ^ p0));
}


public boolean a__Boolean() {
return ((1) != 0);
}


public boolean a__Boolean(boolean p0) {
return ((0) != 0);
}


public <T extends net.minecraft.entity.Entity> void a(java.lang.Class<? extends T> p0, moom.CA p1, java.util.List<T> p2, com.google.common.base.Predicate<? super T> p3) {
return;
}


public void a(net.minecraft.tileentity.TileEntity p0) {
return;
}


public boolean a__Boolean(int p0, int p1) {
int forwardValue1942_17_0;
    int forwardValue1942_17_1;
    int forwardValue1942_19_0;
    int forwardValue1942_21_0;
    int spill1942_0;
    int spill1942_1;
    int spill1942_2;
    long life3_3;
    java.lang.String life5_5;
    forward_join_21: {
    forward_join_20: {
    forward_join_19: {
    forward_join_17: {
    life3_3 = (moom.Fl.z ^ 132041145287134L);
    life5_5 = net.minecraft.world.chunk.Chunk.b__String();
    spill1942_0 = p0;
    spill1942_1 = ((moom.Fl)(this)).i;
    if (!((life5_5 == null))) {
        forwardValue1942_17_0 = spill1942_0;
        forwardValue1942_17_1 = spill1942_1;
        break forward_join_17;
    }
    if (!((spill1942_0 == spill1942_1))) {
        break forward_join_20;
    }
    spill1942_2 = p1;
    if (!((life5_5 == null))) {
        forwardValue1942_19_0 = spill1942_2;
        break forward_join_19;
    }
    forwardValue1942_17_0 = spill1942_2;
    forwardValue1942_17_1 = ((moom.Fl)(this)).j;
    }
    if (!((forwardValue1942_17_0 == forwardValue1942_17_1))) {
        break forward_join_20;
    }
    forwardValue1942_19_0 = 1;
    }
    forwardValue1942_21_0 = forwardValue1942_19_0;
    break forward_join_21;
    }
    forwardValue1942_21_0 = 0;
    }
    return ((forwardValue1942_21_0) != 0);
}


public int a(int p0, int p1) {
return 0;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a__Void() {
return;
}


public net.minecraft.block.Block a__ch(moom.DT p0) {
return net.minecraft.init.Blocks.a;
}


public net.minecraft.tileentity.TileEntity a(moom.DT p0, net.minecraft.world.chunk.Chunk$EnumCreateEntityType p1) {
return null;
}


public boolean a__Boolean(moom.DT p0) {
return ((0) != 0);
}


public void a(net.minecraft.entity.Entity p0, int p1) {
return;
}


public int a(moom.DT p0, int p1) {
return 0;
}


public void a(net.minecraft.entity.Entity p0) {
return;
}


public void a(net.minecraft.entity.Entity p0, moom.CA p1, java.util.List<net.minecraft.entity.Entity> p2, com.google.common.base.Predicate<? super net.minecraft.entity.Entity> p3) {
return;
}


public int a(net.minecraft.world.EnumSkyBlock p0, moom.DT p1) {
return ((net.minecraft.world.EnumSkyBlock)(p0)).defaultLightValue;
}


public void a__Void(moom.DT p0) {
return;
}


public void a(moom.DT p0, net.minecraft.tileentity.TileEntity p1) {
return;
}


public void a(net.minecraft.world.EnumSkyBlock p0, moom.DT p1, int p2) {
return;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral4541_0() throws E;

private static native <E extends Throwable> long __sourceIntrinsic_8226ceefacb8_originalDynamicSite1150_5(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_8226ceefacb8_originalDynamicSite1150_7(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_8226ceefacb8_originalDynamicSite1150_10(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_8226ceefacb8_originalDynamicSite1150_12(int a0, long a1) throws E;
}
