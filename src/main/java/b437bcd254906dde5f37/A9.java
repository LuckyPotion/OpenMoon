package moom;


public class A9 {

private static final org.apache.logging.log4j.Logger a;

private final java.util.List<java.lang.String> b;

private final java.util.List<java.lang.Long> c;

public boolean d;

private java.lang.String e;

private final java.util.Map<java.lang.String, java.lang.Long> f;

public boolean g;

private boolean h;

private static final int i;

private static final int j;

private static final int k;

private static final int l;

private static final int m;

private static int[] n;

private static final long o;

private static final long[] p;

private static final java.lang.Long[] q;

private static final java.util.Map r;

public A9() {
super();
    this.b = com.google.common.collect.Lists.newArrayList();
    this.c = com.google.common.collect.Lists.newArrayList();
    this.e = "";
    this.f = com.google.common.collect.Maps.newHashMap();
    this.g = true;
    this.h = this.g;
}


static {
o = ((long)(((moom._a)(moom._c.a(((long)(-4052168315984710456L)), ((long)(528383172657628845L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(144713354389926L)))));
    int[] __sourceSpill633_6 = new int[5];
    r = ((java.util.Map)(new java.util.HashMap(13)));
    moom.A9.b(((int[])(__sourceSpill633_6)));
    long local0_life9 = (moom.A9.o ^ 60794939261514L);
    javax.crypto.Cipher local2_life11;
    javax.crypto.Cipher __sourceSpill633_13 = (local2_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill633_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill633_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill633_16 = new byte[8];
    (__sourceSpill633_16)[0] = ((byte) ((int) (local0_life9 >>> 56)));
    int local3_life17 = 1;
    while ((local3_life17 < 8)) {
        (__sourceSpill633_16)[local3_life17] = ((byte) ((int) ((local0_life9 << (local3_life17 * 8)) >>> 56)));
        local3_life17 += 1;
    }
    byte[] __sourcePreallocation633_18 = __sourceSpill633_16;
    ((javax.crypto.Cipher)(__sourceSpill633_13)).init(((int)(__sourceSpill633_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill633_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation633_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life21 = new long[4];
    int local5_life22 = 0;
    java.lang.String local6_life23;
    int local7_life25 = ((java.lang.String)((local6_life23 = "n!PòûñíMU4½Ñcb\031\016"))).length();
    int local4_life26 = 0;
    do {
        java.lang.String __sourceSpill633_27 = local6_life23;
        int __sourceSpill633_28 = local4_life26;
        local4_life26 += 8;
        byte[] local9_life31 = ((java.lang.String)(((java.lang.String)(__sourceSpill633_27)).substring(((int)(__sourceSpill633_28)), ((int)(local4_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill633_32 = local8_life21;
        int __sourceSpill633_33 = local5_life22;
        local5_life22 += 1;
        long local10_life34 = (((((((((((long) (local9_life31)[0]) & 255L) << 56) | ((((long) (local9_life31)[1]) & 255L) << 48)) | ((((long) (local9_life31)[2]) & 255L) << 40)) | ((((long) (local9_life31)[3]) & 255L) << 32)) | ((((long) (local9_life31)[4]) & 255L) << 24)) | ((((long) (local9_life31)[5]) & 255L) << 16)) | ((((long) (local9_life31)[6]) & 255L) << 8)) | (((long) (local9_life31)[7]) & 255L));
        byte[] __sourceSpill633_35 = new byte[8];
        (__sourceSpill633_35)[0] = ((byte) ((int) (local10_life34 >>> 56)));
        (__sourceSpill633_35)[1] = ((byte) ((int) (local10_life34 >>> 48)));
        (__sourceSpill633_35)[2] = ((byte) ((int) (local10_life34 >>> 40)));
        (__sourceSpill633_35)[3] = ((byte) ((int) (local10_life34 >>> 32)));
        (__sourceSpill633_35)[4] = ((byte) ((int) (local10_life34 >>> 24)));
        (__sourceSpill633_35)[5] = ((byte) ((int) (local10_life34 >>> 16)));
        (__sourceSpill633_35)[6] = ((byte) ((int) (local10_life34 >>> 8)));
        (__sourceSpill633_35)[7] = ((byte) ((int) local10_life34));
        javax.crypto.Cipher __sourceSpill633_36 = local2_life11;
        byte[] local12_life38 = ((javax.crypto.Cipher)(__sourceSpill633_36)).doFinal(((byte[])(__sourceSpill633_35)));
        (__sourceSpill633_32)[__sourceSpill633_33] = (((((((((((long) (local12_life38)[0]) & 255L) << 56) | ((((long) (local12_life38)[1]) & 255L) << 48)) | ((((long) (local12_life38)[2]) & 255L) << 40)) | ((((long) (local12_life38)[3]) & 255L) << 32)) | ((((long) (local12_life38)[4]) & 255L) << 24)) | ((((long) (local12_life38)[5]) & 255L) << 16)) | ((((long) (local12_life38)[6]) & 255L) << 8)) | (((long) (local12_life38)[7]) & 255L));
    } while ((!(local4_life26 >= local7_life25)));
    local7_life25 = ((java.lang.String)((local6_life23 = "ªM¸üQ<Ð\000ZÊZÚ%C|"))).length();
    local4_life26 = 0;
    do {
        java.lang.String __sourceSpill633_40 = local6_life23;
        int __sourceSpill633_41 = local4_life26;
        local4_life26 += 8;
        byte[] local9_life44 = ((java.lang.String)(((java.lang.String)(__sourceSpill633_40)).substring(((int)(__sourceSpill633_41)), ((int)(local4_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill633_45 = local8_life21;
        int __sourceSpill633_46 = local5_life22;
        local5_life22 += 1;
        long local10_life47 = (((((((((((long) (local9_life44)[0]) & 255L) << 56) | ((((long) (local9_life44)[1]) & 255L) << 48)) | ((((long) (local9_life44)[2]) & 255L) << 40)) | ((((long) (local9_life44)[3]) & 255L) << 32)) | ((((long) (local9_life44)[4]) & 255L) << 24)) | ((((long) (local9_life44)[5]) & 255L) << 16)) | ((((long) (local9_life44)[6]) & 255L) << 8)) | (((long) (local9_life44)[7]) & 255L));
        byte[] __sourceSpill633_48 = new byte[8];
        (__sourceSpill633_48)[0] = ((byte) ((int) (local10_life47 >>> 56)));
        (__sourceSpill633_48)[1] = ((byte) ((int) (local10_life47 >>> 48)));
        (__sourceSpill633_48)[2] = ((byte) ((int) (local10_life47 >>> 40)));
        (__sourceSpill633_48)[3] = ((byte) ((int) (local10_life47 >>> 32)));
        (__sourceSpill633_48)[4] = ((byte) ((int) (local10_life47 >>> 24)));
        (__sourceSpill633_48)[5] = ((byte) ((int) (local10_life47 >>> 16)));
        (__sourceSpill633_48)[6] = ((byte) ((int) (local10_life47 >>> 8)));
        (__sourceSpill633_48)[7] = ((byte) ((int) local10_life47));
        javax.crypto.Cipher __sourceSpill633_49 = local2_life11;
        byte[] local12_life51 = ((javax.crypto.Cipher)(__sourceSpill633_49)).doFinal(((byte[])(__sourceSpill633_48)));
        (__sourceSpill633_45)[__sourceSpill633_46] = (((((((((((long) (local12_life51)[0]) & 255L) << 56) | ((((long) (local12_life51)[1]) & 255L) << 48)) | ((((long) (local12_life51)[2]) & 255L) << 40)) | ((((long) (local12_life51)[3]) & 255L) << 32)) | ((((long) (local12_life51)[4]) & 255L) << 24)) | ((((long) (local12_life51)[5]) & 255L) << 16)) | ((((long) (local12_life51)[6]) & 255L) << 8)) | (((long) (local12_life51)[7]) & 255L));
    } while ((!(local4_life26 >= local7_life25)));
    p = ((long[])(local8_life21));
    q = ((java.lang.Long[])(new java.lang.Long[4]));
    a = ((org.apache.logging.log4j.Logger)(org.apache.logging.log4j.LogManager.getLogger()));
    i = ((int)(((java.lang.String)("scheduledExecutables")).hashCode()));
    j = ((int)(((java.lang.String)("tick")).hashCode()));
    k = ((int)(((java.lang.String)("preRenderErrors")).hashCode()));
    l = ((int)(((java.lang.String)("render")).hashCode()));
    m = ((int)(((java.lang.String)("display")).hashCode()));
}


public static void b(int[] p0) {
moom.A9.n = ((int[])(p0));
    return;
}


public static int[] b__ArrayInt() {
return moom.A9.n;
}


public void b() {
int forwardValue1422_13_0;
    java.util.Map forwardValue1422_70_0;
    java.lang.String forwardValue1422_70_1;
    moom.A9 forwardValue1422_106_0;
    java.lang.Object forwardValue1422_106_1;
    moom.A9 forwardValue1422_108_0;
    moom.A9 forwardValue1422_109_0;
    java.lang.String forwardValue1422_109_1;
    boolean spill1422_0;
    java.util.Map spill1422_1;
    java.lang.String spill1422_2;
    moom.A9 spill1422_3;
    java.util.List spill1422_4;
    long life1_3;
    int[] life3_5;
    long life4_21;
    long life6_32;
    long life8_45;
    forward_join_110: {
    forward_join_109: {
    forward_join_108: {
    forward_join_106: {
    forward_join_91: {
    forward_join_74: {
    forward_join_70: {
    forward_join_66: {
    forward_join_13: {
    life1_3 = (moom.A9.o ^ 105243777551879L);
    life3_5 = moom.A9.b__ArrayInt();
    spill1422_0 = this.h;
    if (!((life3_5 != null))) {
        forwardValue1422_13_0 = ((spill1422_0) ? 1 : 0);
        break forward_join_13;
    }
    if (!(spill1422_0)) {
        break forward_join_110;
    }
    forwardValue1422_13_0 = ((this.d) ? 1 : 0);
    }
    if (!((forwardValue1422_13_0 != 0))) {
        break forward_join_110;
    }
    life4_21 = java.lang.System.nanoTime();
    life6_32 = ((java.lang.Long)(((java.lang.Long)(((java.util.List)(this.c)).remove(((int)((((java.util.List)(this.c)).size() - 1)))))))).longValue();
    ((java.util.List)(this.b)).remove(((int)((((java.util.List)(this.b)).size() - 1))));
    life8_45 = (life4_21 - life6_32);
    spill1422_1 = this.f;
    spill1422_2 = this.e;
    if (!((life3_5 != null))) {
        forwardValue1422_70_0 = spill1422_1;
        forwardValue1422_70_1 = spill1422_2;
        break forward_join_70;
    }
    if (!(((java.util.Map)(spill1422_1)).containsKey(((java.lang.Object)(spill1422_2))))) {
        break forward_join_66;
    }
    ((java.util.Map)(this.f)).put(((java.lang.Object)(this.e)), ((java.lang.Object)(java.lang.Long.valueOf(((long)((((java.lang.Long)(((java.lang.Long)(((java.util.Map)(this.f)).get(((java.lang.Object)(this.e))))))).longValue() + life8_45)))))));
    if (!((life3_5 == null))) {
        break forward_join_74;
    }
    }
    forwardValue1422_70_0 = this.f;
    forwardValue1422_70_1 = this.e;
    }
    ((java.util.Map)(forwardValue1422_70_0)).put(((java.lang.Object)(forwardValue1422_70_1)), ((java.lang.Object)(java.lang.Long.valueOf(((long)(life8_45))))));
    }
    if (!((recovery.source.CarrierOps.lcmp(((long)(life8_45)), ((long)(__sourceIntrinsic_938da207dded_invokedynamic1422_33(9169, (2801168677945306711L ^ life1_3))))) > 0))) {
        break forward_join_91;
    }
    ((org.apache.logging.log4j.Logger)(moom.A9.a)).warn(((java.lang.String)(__sourceIntrinsic_938da207dded_invokedynamic1422_37(this.e, (((double) life8_45) / 0x1.e848p19d)))));
    }
    spill1422_3 = this;
    spill1422_4 = this.b;
    if (!((life3_5 != null))) {
        forwardValue1422_106_0 = spill1422_3;
        forwardValue1422_106_1 = spill1422_4;
        break forward_join_106;
    }
    if (!((!((java.util.List)(spill1422_4)).isEmpty()))) {
        forwardValue1422_108_0 = spill1422_3;
        break forward_join_108;
    }
    forwardValue1422_106_0 = spill1422_3;
    forwardValue1422_106_1 = ((java.util.List)(this.b)).get(((int)((((java.util.List)(this.b)).size() - 1))));
    }
    forwardValue1422_109_0 = forwardValue1422_106_0;
    forwardValue1422_109_1 = ((java.lang.String)(forwardValue1422_106_1));
    break forward_join_109;
    }
    forwardValue1422_109_0 = forwardValue1422_108_0;
    forwardValue1422_109_1 = "";
    }
    ((moom.A9)(forwardValue1422_109_0)).e = ((java.lang.String)(forwardValue1422_109_1));
    }
    return;
}


public void b(java.lang.String p0) {
moom.A9 forwardValue1423_14_0;
    moom.A9 spill1423_0;
    long life2_3;
    int[] life4_5;
    forward_join_16: {
    forward_join_14: {
    life2_3 = (moom.A9.o ^ 88532678862958L);
    life4_5 = moom.A9.b__ArrayInt();
    spill1423_0 = this;
    if (!((life4_5 != null))) {
        forwardValue1423_14_0 = spill1423_0;
        break forward_join_14;
    }
    if (!(((moom.A9)(spill1423_0)).h)) {
        break forward_join_16;
    }
    this.b();
    forwardValue1423_14_0 = this;
    }
    ((moom.A9)(forwardValue1423_14_0)).a__Void(((java.lang.String)(p0)));
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
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
    life3_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 18531);
    if (((moom.A9.q)[life3_8] == null)) {
        life4_77 = new byte[] {((byte) ((int) (p1 >>> 56))), ((byte) ((int) (p1 >>> 48))), ((byte) ((int) (p1 >>> 40))), ((byte) ((int) (p1 >>> 32))), ((byte) ((int) (p1 >>> 24))), ((byte) ((int) (p1 >>> 16))), ((byte) ((int) (p1 >>> 8))), ((byte) ((int) p1))};
        life5_81 = (moom.A9.p)[life3_8];
        life7_146 = new byte[] {((byte) ((int) (life5_81 >>> 56))), ((byte) ((int) (life5_81 >>> 48))), ((byte) ((int) (life5_81 >>> 40))), ((byte) ((int) (life5_81 >>> 32))), ((byte) ((int) (life5_81 >>> 24))), ((byte) ((int) (life5_81 >>> 16))), ((byte) ((int) (life5_81 >>> 8))), ((byte) ((int) life5_81))};
        life8_150 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life9_155 = ((java.lang.Object[])(((java.util.Map)(moom.A9.r)).get(((java.lang.Object)(life8_150)))));
        try {
        if ((life9_155 == null)) {
        life9_155 = new java.lang.Object[3];
        (life9_155)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding")));
        (life9_155)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life9_155)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.A9.r)).put(((java.lang.Object)(life8_150)), ((java.lang.Object)(life9_155)));
    }
        life11_188 = new javax.crypto.spec.DESKeySpec(life4_77);
        life12_195 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life9_155)[1])))).generateSecret(((java.security.spec.KeySpec)(life11_188)));
        life13_200 = ((javax.crypto.Cipher)((life9_155)[0]));
        ((javax.crypto.Cipher)(life13_200)).init(((int)(2)), ((java.security.Key)(life12_195)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life9_155)[2])))));
        life10_212 = ((javax.crypto.Cipher)(life13_200)).doFinal(((byte[])(life7_146)));
    } catch (java.lang.Exception life11_214) {
        throw new java.lang.RuntimeException("moom/A9", life11_214);
    }
        life11_290 = (((((((((((long) (life10_212)[0]) & 255L) << 56) | ((((long) (life10_212)[1]) & 255L) << 48)) | ((((long) (life10_212)[2]) & 255L) << 40)) | ((((long) (life10_212)[3]) & 255L) << 32)) | ((((long) (life10_212)[4]) & 255L) << 24)) | ((((long) (life10_212)[5]) & 255L) << 16)) | ((((long) (life10_212)[6]) & 255L) << 8)) | (((long) (life10_212)[7]) & 255L));
        (moom.A9.q)[life3_8] = java.lang.Long.valueOf(((long)(life11_290)));
    }
    return ((java.lang.Long)((moom.A9.q)[life3_8])).longValue();
}


private static long a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    long local7 = moom.A9.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local9 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Long.TYPE)), ((java.lang.Object)(java.lang.Long.valueOf(((long)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local9)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public void a__Void() {
((java.util.Map)(this.f)).clear();
    this.e = ((java.lang.String)(""));
    ((java.util.List)(this.b)).clear();
    this.h = ((boolean)__sourceIntrinsic_integerToBoolean((((this.g) ? 1 : 0))));
    return;
}


public void a__Void(java.lang.String p0) {
int forwardValue167_29_0;
    int forwardValue167_30_0;
    int forwardValue167_30_1;
    int forwardValue167_50_0;
    int forwardValue167_53_0;
    int forwardValue167_53_1;
    int forwardValue167_64_0;
    int forwardValue167_69_0;
    int forwardValue167_75_0;
    int forwardValue167_100_0;
    boolean spill167_0;
    int spill167_1;
    int spill167_2;
    boolean spill167_3;
    boolean spill167_4;
    boolean spill167_5;
    boolean spill167_6;
    long life2_3;
    int[] life4_5;
    int life5_15;
    forward_join_101: {
    forward_join_100: {
    forward_join_83: {
    forward_join_75: {
    forward_join_69: {
    forward_join_64: {
    forward_join_62: {
    forward_join_53: {
    forward_join_50: {
    forward_join_49: {
    forward_join_30: {
    forward_join_29: {
    forward_join_28: {
    life2_3 = (moom.A9.o ^ 21251173804339L);
    life4_5 = moom.A9.b__ArrayInt();
    spill167_0 = moom.JK.a__Boolean();
    if (!((life4_5 != null))) {
        forwardValue167_64_0 = ((spill167_0) ? 1 : 0);
        break forward_join_64;
    }
    if (!(spill167_0)) {
        break forward_join_62;
    }
    life5_15 = ((java.lang.String)(p0)).hashCode();
    spill167_1 = life5_15;
    spill167_2 = moom.A9.i;
    if (!((life4_5 != null))) {
        forwardValue167_30_0 = spill167_1;
        forwardValue167_30_1 = spill167_2;
        break forward_join_30;
    }
    if (!((spill167_1 == spill167_2))) {
        break forward_join_28;
    }
    spill167_3 = ((java.lang.String)(p0)).equals(((java.lang.Object)("scheduledExecutables")));
    if (!((life4_5 != null))) {
        forwardValue167_29_0 = ((spill167_3) ? 1 : 0);
        break forward_join_29;
    }
    if (!(spill167_3)) {
        break forward_join_28;
    }
    ((moom.JL)(moom.JK.f)).a();
    if (!((life4_5 == null))) {
        break forward_join_62;
    }
    }
    forwardValue167_29_0 = life5_15;
    }
    forwardValue167_30_0 = forwardValue167_29_0;
    forwardValue167_30_1 = moom.A9.j;
    }
    if (!((life4_5 != null))) {
        forwardValue167_53_0 = forwardValue167_30_0;
        forwardValue167_53_1 = forwardValue167_30_1;
        break forward_join_53;
    }
    if (!((forwardValue167_30_0 == forwardValue167_30_1))) {
        break forward_join_49;
    }
    spill167_4 = ((java.lang.String)(p0)).equals(((java.lang.Object)("tick")));
    if (!((life4_5 != null))) {
        forwardValue167_50_0 = ((spill167_4) ? 1 : 0);
        break forward_join_50;
    }
    if (!(spill167_4)) {
        break forward_join_49;
    }
    spill167_5 = moom.BU.c__Boolean();
    if (!((life4_5 != null))) {
        forwardValue167_50_0 = ((spill167_5) ? 1 : 0);
        break forward_join_50;
    }
    if (!(spill167_5)) {
        break forward_join_49;
    }
    ((moom.JL)(moom.JK.f)).b();
    ((moom.JL)(moom.JK.e)).a();
    if (!((life4_5 == null))) {
        break forward_join_62;
    }
    }
    forwardValue167_50_0 = life5_15;
    }
    if (!((life4_5 != null))) {
        forwardValue167_64_0 = forwardValue167_50_0;
        break forward_join_64;
    }
    forwardValue167_53_0 = forwardValue167_50_0;
    forwardValue167_53_1 = moom.A9.k;
    }
    if (!((forwardValue167_53_0 == forwardValue167_53_1))) {
        break forward_join_62;
    }
    spill167_6 = ((java.lang.String)(p0)).equals(((java.lang.Object)("preRenderErrors")));
    if (!((life4_5 != null))) {
        forwardValue167_64_0 = ((spill167_6) ? 1 : 0);
        break forward_join_64;
    }
    if (!(spill167_6)) {
        break forward_join_62;
    }
    ((moom.JL)(moom.JK.e)).b();
    }
    forwardValue167_64_0 = ((this.h) ? 1 : 0);
    }
    if (!((life4_5 != null))) {
        forwardValue167_69_0 = forwardValue167_64_0;
        break forward_join_69;
    }
    if (!((forwardValue167_64_0 != 0))) {
        break forward_join_101;
    }
    forwardValue167_69_0 = ((this.d) ? 1 : 0);
    }
    if (!((life4_5 != null))) {
        forwardValue167_75_0 = forwardValue167_69_0;
        break forward_join_75;
    }
    if (!((forwardValue167_69_0 != 0))) {
        break forward_join_101;
    }
    forwardValue167_75_0 = ((java.lang.String)(this.e)).length();
    }
    if (!((life4_5 != null))) {
        forwardValue167_100_0 = forwardValue167_75_0;
        break forward_join_100;
    }
    if (!((forwardValue167_75_0 > 0))) {
        break forward_join_83;
    }
    this.e = ((java.lang.String)(__sourceIntrinsic_e2d81269afae_invokedynamic167_31(this.e)));
    }
    this.e = ((java.lang.String)(__sourceIntrinsic_e2d81269afae_invokedynamic167_34(this.e, p0)));
    ((java.util.List)(this.b)).add(((java.lang.Object)(this.e)));
    forwardValue167_100_0 = ((((java.util.List)(this.c)).add(((java.lang.Object)(java.lang.Long.valueOf(((long)(java.lang.System.nanoTime()))))))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue167_100_0);
    }
    return;
}


public java.util.List<moom.A_> a(java.lang.String p0) {
java.lang.Object lexicalValue466_19_0;
    java.lang.String lexicalValue466_44_0;
    int lexicalValue466_69_0;
    int lexicalValue466_79_0;
    int lexicalValue466_107_0;
    long lexicalValue466_109_0;
    int lexicalValue466_134_0;
    int lexicalValue466_146_0;
    java.lang.Object lexicalValue466_151_0;
    int lexicalValue466_197_0;
    moom.A9 spill466_0;
    java.lang.String spill466_1;
    int spill466_2;
    int spill466_3;
    long spill466_4;
    int spill466_5;
    java.lang.String spill466_6;
    long life2_3;
    int[] life4_5;
    long life5_26;
    long life7_39;
    java.util.ArrayList life9_41;
    long life10_57;
    java.util.Iterator life12_62;
    java.lang.String life13_69;
    float life12_116;
    java.util.Iterator life13_143;
    java.lang.String life14_150;
    long life15_203;
    double life17_211;
    double life19_219;
    java.lang.String life21_224;
    lexical_join_242: {
    lexical_join_225: {
    lexical_join_197: {
    lexical_join_186: {
    lexical_join_110: {
    lexical_join_109: {
    lexical_join_107: {
    lexical_join_102: {
    lexical_join_91: {
    lexical_join_45: {
    lexical_join_44: {
    lexical_join_19: {
    lexical_join_13: {
    life2_3 = (moom.A9.o ^ 76566804012212L);
    life4_5 = moom.A9.b__ArrayInt();
    spill466_0 = this;
    if (!((life4_5 != null))) {
        lexicalValue466_19_0 = spill466_0;
        break lexical_join_19;
    }
    if (!((!((moom.A9)(spill466_0)).d))) {
        break lexical_join_13;
    }
    return null;
    }
    lexicalValue466_19_0 = ((java.util.Map)(this.f)).getOrDefault(((java.lang.Object)("root")), ((java.lang.Object)(java.lang.Long.valueOf(((long)(0L))))));
    }
    life5_26 = ((java.lang.Long)(((java.lang.Long)(lexicalValue466_19_0)))).longValue();
    life7_39 = ((java.lang.Long)(((java.lang.Long)(((java.util.Map)(this.f)).getOrDefault(((java.lang.Object)(p0)), ((java.lang.Object)(java.lang.Long.valueOf(((long)(__sourceIntrinsic_efec07a174dd_invokedynamic466_9(14069, (4918418593588160962L ^ life2_3)))))))))))).longValue();
    life9_41 = com.google.common.collect.Lists.newArrayList();
    spill466_1 = p0;
    if (!((life4_5 != null))) {
        lexicalValue466_44_0 = spill466_1;
        break lexical_join_44;
    }
    if (!((((java.lang.String)(spill466_1)).length() > 0))) {
        break lexical_join_45;
    }
    lexicalValue466_44_0 = __sourceIntrinsic_efec07a174dd_invokedynamic466_16(p0);
    }
    p0 = lexicalValue466_44_0;
    }
    life10_57 = 0L;
    life12_62 = ((java.util.Set)(((java.util.Map)(this.f)).keySet())).iterator();
    lexical_cycle_52: while (true) {
    lexical_join_89: {
    lexical_join_79: {
    lexical_join_69: {
    if (!(((java.util.Iterator)(life12_62)).hasNext())) {
        break lexical_join_91;
    }
    life13_69 = ((java.lang.String)(((java.util.Iterator)(life12_62)).next()));
    spill466_2 = ((java.lang.String)(life13_69)).length();
    if (!((life4_5 != null))) {
        lexicalValue466_69_0 = spill466_2;
        break lexical_join_69;
    }
    if (!((spill466_2 > ((java.lang.String)(p0)).length()))) {
        break lexical_join_89;
    }
    lexicalValue466_69_0 = ((((java.lang.String)(life13_69)).startsWith(((java.lang.String)(p0)))) ? 1 : 0);
    }
    if (!((life4_5 != null))) {
        lexicalValue466_79_0 = lexicalValue466_69_0;
        break lexical_join_79;
    }
    if (!((lexicalValue466_69_0 != 0))) {
        break lexical_join_89;
    }
    lexicalValue466_79_0 = ((java.lang.String)(life13_69)).indexOf(((java.lang.String)(".")), ((int)((((java.lang.String)(p0)).length() + 1))));
    }
    if (!((lexicalValue466_79_0 < 0))) {
        break lexical_join_89;
    }
    life10_57 = (life10_57 + ((java.lang.Long)(((java.lang.Long)(((java.util.Map)(this.f)).get(((java.lang.Object)(life13_69))))))).longValue());
    }
    if (!((life4_5 == null))) { continue lexical_cycle_52; }
    break lexical_cycle_52;
    }
    }
    life12_116 = ((float) life10_57);
    spill466_3 = recovery.source.CarrierOps.lcmp(((long)(life10_57)), ((long)(life7_39)));
    if (!((life4_5 != null))) {
        lexicalValue466_107_0 = spill466_3;
        break lexical_join_107;
    }
    if (!((spill466_3 < 0))) {
        break lexical_join_102;
    }
    life10_57 = life7_39;
    }
    spill466_4 = life5_26;
    if (!((life4_5 != null))) {
        lexicalValue466_109_0 = spill466_4;
        break lexical_join_109;
    }
    lexicalValue466_107_0 = recovery.source.CarrierOps.lcmp(((long)(spill466_4)), ((long)(life10_57)));
    }
    if (!((lexicalValue466_107_0 < 0))) {
        break lexical_join_110;
    }
    lexicalValue466_109_0 = life10_57;
    }
    life5_26 = lexicalValue466_109_0;
    }
    life13_143 = ((java.util.Set)(((java.util.Map)(this.f)).keySet())).iterator();
    lexical_cycle_115: while (true) {
    lexical_join_184: {
    lexical_join_151: {
    lexical_join_146: {
    lexical_join_134: {
    if (!(((java.util.Iterator)(life13_143)).hasNext())) {
        break lexical_join_186;
    }
    life14_150 = ((java.lang.String)(((java.util.Iterator)(life13_143)).next()));
    spill466_5 = ((java.lang.String)(life14_150)).length();
    if (!((life4_5 != null))) {
        lexicalValue466_197_0 = spill466_5;
        break lexical_join_197;
    }
    if (!((life4_5 != null))) {
        lexicalValue466_134_0 = spill466_5;
        break lexical_join_134;
    }
    if (!((spill466_5 > ((java.lang.String)(p0)).length()))) {
        break lexical_join_184;
    }
    lexicalValue466_134_0 = ((((java.lang.String)(life14_150)).startsWith(((java.lang.String)(p0)))) ? 1 : 0);
    }
    if (!((life4_5 != null))) {
        lexicalValue466_146_0 = lexicalValue466_134_0;
        break lexical_join_146;
    }
    if (!((lexicalValue466_134_0 != 0))) {
        break lexical_join_184;
    }
    spill466_6 = life14_150;
    if (!((life4_5 != null))) {
        lexicalValue466_151_0 = spill466_6;
        break lexical_join_151;
    }
    lexicalValue466_146_0 = ((java.lang.String)(spill466_6)).indexOf(((java.lang.String)(".")), ((int)((((java.lang.String)(p0)).length() + 1))));
    }
    if (!((lexicalValue466_146_0 < 0))) {
        break lexical_join_184;
    }
    lexicalValue466_151_0 = ((java.util.Map)(this.f)).get(((java.lang.Object)(life14_150)));
    }
    life15_203 = ((java.lang.Long)(((java.lang.Long)(lexicalValue466_151_0)))).longValue();
    life17_211 = ((((double) life15_203) * 0x1.9p6d) / ((double) life10_57));
    life19_219 = ((((double) life15_203) * 0x1.9p6d) / ((double) life5_26));
    life21_224 = ((java.lang.String)(life14_150)).substring(((int)(((java.lang.String)(p0)).length())));
    ((java.util.List)(life9_41)).add(((java.lang.Object)(new moom.A_(life21_224, life17_211, life19_219))));
    }
    if (!((life4_5 == null))) { continue lexical_cycle_115; }
    break lexical_cycle_115;
    }
    }
    ((java.util.Map)(this.f)).replaceAll(((java.util.function.BiFunction)(__sourceIntrinsic_efec07a174dd_invokedynamic466_55(this))));
    if (!((life4_5 != null))) {
        break lexical_join_242;
    }
    lexicalValue466_197_0 = recovery.source.CarrierOps.fcmpl(((float)(((float) life10_57))), ((float)(life12_116)));
    }
    if (!((lexicalValue466_197_0 > 0))) {
        break lexical_join_225;
    }
    ((java.util.List)(life9_41)).add(((java.lang.Object)(new moom.A_("unspecified", ((((double) (((float) life10_57) - life12_116)) * 0x1.9p6d) / ((double) life10_57)), ((((double) (((float) life10_57) - life12_116)) * 0x1.9p6d) / ((double) life5_26))))));
    }
    java.util.Collections.sort(((java.util.List)(life9_41)));
    ((java.util.List)(life9_41)).add(((int)(0)), ((java.lang.Object)(new moom.A_(p0, 0x1.9p6d, ((((double) life10_57) * 0x1.9p6d) / ((double) life5_26))))));
    }
    return life9_41;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral3654_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/A9"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(java.lang.Class<?> p0) {
moom.A9 forwardValue1419_12_0;
    moom.A9 spill1419_0;
    long life2_3;
    int[] life4_5;
    forward_join_15: {
    forward_join_12: {
    life2_3 = (moom.A9.o ^ 88181396113477L);
    life4_5 = moom.A9.b__ArrayInt();
    spill1419_0 = this;
    if (!((life4_5 != null))) {
        forwardValue1419_12_0 = spill1419_0;
        break forward_join_12;
    }
    if (!(((moom.A9)(spill1419_0)).d)) {
        break forward_join_15;
    }
    forwardValue1419_12_0 = this;
    }
    ((moom.A9)(forwardValue1419_12_0)).a__Void(((java.lang.String)(((java.lang.Class)(p0)).getSimpleName())));
    }
    return;
}


public java.lang.String a() {
java.lang.Object forwardValue1418_22_0;
    java.lang.String forwardValue1418_23_0;
    java.util.List spill1418_0;
    long life1_3;
    int[] life3_5;
    forward_join_23: {
    forward_join_22: {
    forward_join_14: {
    life1_3 = (moom.A9.o ^ 11297785378797L);
    life3_5 = moom.A9.b__ArrayInt();
    spill1418_0 = this.b;
    if (!((life3_5 != null))) {
        forwardValue1418_22_0 = spill1418_0;
        break forward_join_22;
    }
    if (!((((java.util.List)(spill1418_0)).size() == 0))) {
        break forward_join_14;
    }
    forwardValue1418_23_0 = "[UNKNOWN]";
    break forward_join_23;
    }
    forwardValue1418_22_0 = ((java.util.List)(this.b)).get(((int)((((java.util.List)(this.b)).size() - 1))));
    }
    forwardValue1418_23_0 = ((java.lang.String)(forwardValue1418_22_0));
    }
    return forwardValue1418_23_0;
}


private java.lang.Long lambda$getProfilingData$0(java.lang.String p0, java.lang.Long p1) {
long local3 = (moom.A9.o ^ 118328979644149L);
    return java.lang.Long.valueOf(((long)(((((java.lang.Long)(((java.lang.Long)(((java.util.Map)(this.f)).get(((java.lang.Object)(p0))))))).longValue() * __sourceIntrinsic_831845fd2706_originalDynamicSite1049_5(23839, (263750838978248810L ^ local3))) / __sourceIntrinsic_831845fd2706_originalDynamicSite1049_6(18047, (2247376244039097096L ^ local3))))));
}


private static native <E extends Throwable> long __sourceIntrinsic_efec07a174dd_invokedynamic466_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_efec07a174dd_invokedynamic466_16(java.lang.String a0) throws E;

private static native <E extends Throwable> java.util.function.BiFunction __sourceIntrinsic_efec07a174dd_invokedynamic466_55(moom.A9 a0) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral3654_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e2d81269afae_invokedynamic167_31(java.lang.String a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e2d81269afae_invokedynamic167_34(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_938da207dded_invokedynamic1422_33(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_938da207dded_invokedynamic1422_37(java.lang.String a0, double a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_831845fd2706_originalDynamicSite1049_5(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_831845fd2706_originalDynamicSite1049_6(int a0, long a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
