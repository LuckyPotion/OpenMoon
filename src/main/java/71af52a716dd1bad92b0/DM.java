package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class DM {

public int a;

public float b;

public float c;

public float d;

public float e;

private double f;

private long g;

private long h;

private long i;

private double j;

private double k;

private static long l;

private static long[] m;

private static java.lang.Integer[] n;

private static java.util.Map o;

private static long[] p;

private static java.lang.Long[] q;

private static java.util.Map r;

public DM(float p0) { super(); }


private static void __sourceConstructorBody_173a7166fb054e72(moom.DM receiver, float p0) throws Throwable {

long local2 = (moom.DM.l ^ 92893821878871L);

    moom.DM.__sourceConstructorInit_173a7166fb054e72_0(((moom.DM)(receiver)));

    ((moom.DM)(receiver)).c = ((float)(0x1.0p0f));

    ((moom.DM)(receiver)).j = ((double)(0x1.0p0d));

    ((moom.DM)(receiver)).k = ((double)(0x0.0p0d));

    ((moom.DM)(receiver)).e = ((float)(p0));

    ((moom.DM)(receiver)).g = ((long)(net.minecraft.client.Minecraft.a__Long()));

    ((moom.DM)(receiver)).h = ((long)((java.lang.System.nanoTime() / __sourceIntrinsic_173a7166fb054e72_originalDynamicSite1916_9(13287, (3944699483285756687L ^ local2)))));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_173a7166fb054e72_0(moom.DM a0) throws E;

static {
l = ((long)(((moom._a)(moom._c.a(((long)(3606995464111539081L)), ((long)(8862759499670480345L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(57414882849550L)))));
    o = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (moom.DM.l ^ 76523031001543L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill513_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill513_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill513_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill513_14 = new byte[8];
    (__sourceSpill513_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill513_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation513_16 = __sourceSpill513_14;
    ((javax.crypto.Cipher)(__sourceSpill513_11)).init(((int)(__sourceSpill513_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill513_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation513_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local19_life19 = new long[2];
    int local16_life20 = 0;
    java.lang.String local17_life21;
    int local18_life23 = ((java.lang.String)((local17_life21 = "Á\\\0170\tÀh\003\177¤l "))).length();
    int local15_life24 = 0;
    do {
        java.lang.String __sourceSpill513_25 = local17_life21;
        int __sourceSpill513_26 = local15_life24;
        local15_life24 += 8;
        byte[] local20_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill513_25)).substring(((int)(__sourceSpill513_26)), ((int)(local15_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill513_30 = local19_life19;
        int __sourceSpill513_31 = local16_life20;
        local16_life20 += 1;
        long local21_life32 = (((((((((((long) (local20_life29)[0]) & 255L) << 56) | ((((long) (local20_life29)[1]) & 255L) << 48)) | ((((long) (local20_life29)[2]) & 255L) << 40)) | ((((long) (local20_life29)[3]) & 255L) << 32)) | ((((long) (local20_life29)[4]) & 255L) << 24)) | ((((long) (local20_life29)[5]) & 255L) << 16)) | ((((long) (local20_life29)[6]) & 255L) << 8)) | (((long) (local20_life29)[7]) & 255L));
        byte[] __sourceSpill513_33 = new byte[8];
        (__sourceSpill513_33)[0] = ((byte) ((int) (local21_life32 >>> 56)));
        (__sourceSpill513_33)[1] = ((byte) ((int) (local21_life32 >>> 48)));
        (__sourceSpill513_33)[2] = ((byte) ((int) (local21_life32 >>> 40)));
        (__sourceSpill513_33)[3] = ((byte) ((int) (local21_life32 >>> 32)));
        (__sourceSpill513_33)[4] = ((byte) ((int) (local21_life32 >>> 24)));
        (__sourceSpill513_33)[5] = ((byte) ((int) (local21_life32 >>> 16)));
        (__sourceSpill513_33)[6] = ((byte) ((int) (local21_life32 >>> 8)));
        (__sourceSpill513_33)[7] = ((byte) ((int) local21_life32));
        javax.crypto.Cipher __sourceSpill513_34 = local13_life9;
        byte[] local23_life36 = ((javax.crypto.Cipher)(__sourceSpill513_34)).doFinal(((byte[])(__sourceSpill513_33)));
        (__sourceSpill513_30)[__sourceSpill513_31] = (((((((((((long) (local23_life36)[0]) & 255L) << 56) | ((((long) (local23_life36)[1]) & 255L) << 48)) | ((((long) (local23_life36)[2]) & 255L) << 40)) | ((((long) (local23_life36)[3]) & 255L) << 32)) | ((((long) (local23_life36)[4]) & 255L) << 24)) | ((((long) (local23_life36)[5]) & 255L) << 16)) | ((((long) (local23_life36)[6]) & 255L) << 8)) | (((long) (local23_life36)[7]) & 255L));
    } while ((!(local15_life24 >= local18_life23)));
    m = ((long[])(local19_life19));
    n = ((java.lang.Integer[])(new java.lang.Integer[2]));
    r = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life41;
    javax.crypto.Cipher __sourceSpill513_43 = (local0_life41 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill513_44 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill513_45 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill513_46 = new byte[8];
    (__sourceSpill513_46)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life47 = 1;
    while ((local1_life47 < 8)) {
        (__sourceSpill513_46)[local1_life47] = ((byte) ((int) ((local11_life7 << (local1_life47 * 8)) >>> 56)));
        local1_life47 += 1;
    }
    byte[] __sourcePreallocation513_48 = __sourceSpill513_46;
    ((javax.crypto.Cipher)(__sourceSpill513_43)).init(((int)(__sourceSpill513_44)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill513_45)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation513_48)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life51 = new long[4];
    int local3_life52 = 0;
    java.lang.String local4_life53;
    int local5_life55 = ((java.lang.String)((local4_life53 = "Êãúq\025\027\033ÜÛ_ÛRÙuó"))).length();
    int local2_life56 = 0;
    do {
        java.lang.String __sourceSpill513_57 = local4_life53;
        int __sourceSpill513_58 = local2_life56;
        local2_life56 += 8;
        byte[] local7_life61 = ((java.lang.String)(((java.lang.String)(__sourceSpill513_57)).substring(((int)(__sourceSpill513_58)), ((int)(local2_life56))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill513_62 = local6_life51;
        int __sourceSpill513_63 = local3_life52;
        local3_life52 += 1;
        long local8_life64 = (((((((((((long) (local7_life61)[0]) & 255L) << 56) | ((((long) (local7_life61)[1]) & 255L) << 48)) | ((((long) (local7_life61)[2]) & 255L) << 40)) | ((((long) (local7_life61)[3]) & 255L) << 32)) | ((((long) (local7_life61)[4]) & 255L) << 24)) | ((((long) (local7_life61)[5]) & 255L) << 16)) | ((((long) (local7_life61)[6]) & 255L) << 8)) | (((long) (local7_life61)[7]) & 255L));
        byte[] __sourceSpill513_65 = new byte[8];
        (__sourceSpill513_65)[0] = ((byte) ((int) (local8_life64 >>> 56)));
        (__sourceSpill513_65)[1] = ((byte) ((int) (local8_life64 >>> 48)));
        (__sourceSpill513_65)[2] = ((byte) ((int) (local8_life64 >>> 40)));
        (__sourceSpill513_65)[3] = ((byte) ((int) (local8_life64 >>> 32)));
        (__sourceSpill513_65)[4] = ((byte) ((int) (local8_life64 >>> 24)));
        (__sourceSpill513_65)[5] = ((byte) ((int) (local8_life64 >>> 16)));
        (__sourceSpill513_65)[6] = ((byte) ((int) (local8_life64 >>> 8)));
        (__sourceSpill513_65)[7] = ((byte) ((int) local8_life64));
        javax.crypto.Cipher __sourceSpill513_66 = local0_life41;
        byte[] local10_life68 = ((javax.crypto.Cipher)(__sourceSpill513_66)).doFinal(((byte[])(__sourceSpill513_65)));
        (__sourceSpill513_62)[__sourceSpill513_63] = (((((((((((long) (local10_life68)[0]) & 255L) << 56) | ((((long) (local10_life68)[1]) & 255L) << 48)) | ((((long) (local10_life68)[2]) & 255L) << 40)) | ((((long) (local10_life68)[3]) & 255L) << 32)) | ((((long) (local10_life68)[4]) & 255L) << 24)) | ((((long) (local10_life68)[5]) & 255L) << 16)) | ((((long) (local10_life68)[6]) & 255L) << 8)) | (((long) (local10_life68)[7]) & 255L));
    } while ((!(local2_life56 >= local5_life55)));
    local5_life55 = ((java.lang.String)((local4_life53 = "\035?ëÍ=¬]+õai0N"))).length();
    local2_life56 = 0;
    do {
        java.lang.String __sourceSpill513_70 = local4_life53;
        int __sourceSpill513_71 = local2_life56;
        local2_life56 += 8;
        byte[] local7_life74 = ((java.lang.String)(((java.lang.String)(__sourceSpill513_70)).substring(((int)(__sourceSpill513_71)), ((int)(local2_life56))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill513_75 = local6_life51;
        int __sourceSpill513_76 = local3_life52;
        local3_life52 += 1;
        long local8_life77 = (((((((((((long) (local7_life74)[0]) & 255L) << 56) | ((((long) (local7_life74)[1]) & 255L) << 48)) | ((((long) (local7_life74)[2]) & 255L) << 40)) | ((((long) (local7_life74)[3]) & 255L) << 32)) | ((((long) (local7_life74)[4]) & 255L) << 24)) | ((((long) (local7_life74)[5]) & 255L) << 16)) | ((((long) (local7_life74)[6]) & 255L) << 8)) | (((long) (local7_life74)[7]) & 255L));
        byte[] __sourceSpill513_78 = new byte[8];
        (__sourceSpill513_78)[0] = ((byte) ((int) (local8_life77 >>> 56)));
        (__sourceSpill513_78)[1] = ((byte) ((int) (local8_life77 >>> 48)));
        (__sourceSpill513_78)[2] = ((byte) ((int) (local8_life77 >>> 40)));
        (__sourceSpill513_78)[3] = ((byte) ((int) (local8_life77 >>> 32)));
        (__sourceSpill513_78)[4] = ((byte) ((int) (local8_life77 >>> 24)));
        (__sourceSpill513_78)[5] = ((byte) ((int) (local8_life77 >>> 16)));
        (__sourceSpill513_78)[6] = ((byte) ((int) (local8_life77 >>> 8)));
        (__sourceSpill513_78)[7] = ((byte) ((int) local8_life77));
        javax.crypto.Cipher __sourceSpill513_79 = local0_life41;
        byte[] local10_life81 = ((javax.crypto.Cipher)(__sourceSpill513_79)).doFinal(((byte[])(__sourceSpill513_78)));
        (__sourceSpill513_75)[__sourceSpill513_76] = (((((((((((long) (local10_life81)[0]) & 255L) << 56) | ((((long) (local10_life81)[1]) & 255L) << 48)) | ((((long) (local10_life81)[2]) & 255L) << 40)) | ((((long) (local10_life81)[3]) & 255L) << 32)) | ((((long) (local10_life81)[4]) & 255L) << 24)) | ((((long) (local10_life81)[5]) & 255L) << 16)) | ((((long) (local10_life81)[6]) & 255L) << 8)) | (((long) (local10_life81)[7]) & 255L));
    } while ((!(local2_life56 >= local5_life55)));
    p = ((long[])(local6_life51));
    q = ((java.lang.Long[])(new java.lang.Long[4]));
}


private static long b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    long local7 = moom.DM.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local9 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Long.TYPE)), ((java.lang.Object)(java.lang.Long.valueOf(((long)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local9)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static long b(int p0, long p1) {
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
    life3_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 24742);
    if (((moom.DM.q)[life3_8] == null)) {
        life4_77 = new byte[] {((byte) ((int) (p1 >>> 56))), ((byte) ((int) (p1 >>> 48))), ((byte) ((int) (p1 >>> 40))), ((byte) ((int) (p1 >>> 32))), ((byte) ((int) (p1 >>> 24))), ((byte) ((int) (p1 >>> 16))), ((byte) ((int) (p1 >>> 8))), ((byte) ((int) p1))};
        life5_81 = (moom.DM.p)[life3_8];
        life7_146 = new byte[] {((byte) ((int) (life5_81 >>> 56))), ((byte) ((int) (life5_81 >>> 48))), ((byte) ((int) (life5_81 >>> 40))), ((byte) ((int) (life5_81 >>> 32))), ((byte) ((int) (life5_81 >>> 24))), ((byte) ((int) (life5_81 >>> 16))), ((byte) ((int) (life5_81 >>> 8))), ((byte) ((int) life5_81))};
        life8_150 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life9_155 = ((java.lang.Object[])(((java.util.Map)(moom.DM.r)).get(((java.lang.Object)(life8_150)))));
        try {
        if ((life9_155 == null)) {
        life9_155 = new java.lang.Object[3];
        (life9_155)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding")));
        (life9_155)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life9_155)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.DM.r)).put(((java.lang.Object)(life8_150)), ((java.lang.Object)(life9_155)));
    }
        life11_188 = new javax.crypto.spec.DESKeySpec(life4_77);
        life12_195 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life9_155)[1])))).generateSecret(((java.security.spec.KeySpec)(life11_188)));
        life13_200 = ((javax.crypto.Cipher)((life9_155)[0]));
        ((javax.crypto.Cipher)(life13_200)).init(((int)(2)), ((java.security.Key)(life12_195)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life9_155)[2])))));
        life10_212 = ((javax.crypto.Cipher)(life13_200)).doFinal(((byte[])(life7_146)));
    } catch (java.lang.Exception life11_214) {
        throw new java.lang.RuntimeException("moom/DM", life11_214);
    }
        life11_290 = (((((((((((long) (life10_212)[0]) & 255L) << 56) | ((((long) (life10_212)[1]) & 255L) << 48)) | ((((long) (life10_212)[2]) & 255L) << 40)) | ((((long) (life10_212)[3]) & 255L) << 32)) | ((((long) (life10_212)[4]) & 255L) << 24)) | ((((long) (life10_212)[5]) & 255L) << 16)) | ((((long) (life10_212)[6]) & 255L) << 8)) | (((long) (life10_212)[7]) & 255L));
        (moom.DM.q)[life3_8] = java.lang.Long.valueOf(((long)(life11_290)));
    }
    return ((java.lang.Long)((moom.DM.q)[life3_8])).longValue();
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4178_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/DM"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.DM.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public void a() {
int forwardValue1695_49_0;
    int forwardValue1695_66_0;
    int forwardValue1695_104_0;
    moom.DM forwardValue1695_117_0;
    moom.DM forwardValue1695_183_0;
    moom.DM forwardValue1695_237_0;
    boolean spill1695_0;
    int spill1695_1;
    moom.DM spill1695_2;
    moom.DM spill1695_3;
    moom.DM spill1695_4;
    long life1_3;
    long life4_5;
    long life6_10;
    long life8_18;
    double life10_23;
    com.moon.eH life12_30;
    int life3_31;
    long life13_88;
    double life15_95;
    double life13_150;
    double life13_158;
    forward_join_237: {
    forward_join_236: {
    forward_join_185: {
    forward_join_183: {
    forward_join_173: {
    forward_join_117: {
    forward_join_116: {
    forward_join_113: {
    forward_join_104: {
    forward_join_98: {
    forward_join_66: {
    forward_join_49: {
    life1_3 = (moom.DM.l ^ 19569646909876L);
    life4_5 = net.minecraft.client.Minecraft.a__Long();
    life6_10 = (life4_5 - this.g);
    life8_18 = (java.lang.System.nanoTime() / __sourceIntrinsic_2c8ae721fed4_invokedynamic1695_4(23451, (90163525844764819L ^ life1_3)));
    life10_23 = (((double) life8_18) / 0x1.f4p9d);
    spill1695_0 = moom.DS.c__Boolean();
    life12_30 = new com.moon.eH(this.k);
    life3_31 = ((spill1695_0) ? 1 : 0);
    ((com.moon.events.EventBus)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).getEventBus())).publish(((java.lang.Object)(life12_30)));
    spill1695_1 = recovery.source.CarrierOps.lcmp(((long)(life6_10)), ((long)(__sourceIntrinsic_2c8ae721fed4_invokedynamic1695_11(24648, (771598048309359425L ^ life1_3)))));
    if (!((life3_31 != 0))) {
        forwardValue1695_49_0 = spill1695_1;
        break forward_join_49;
    }
    if (!((spill1695_1 <= 0))) {
        break forward_join_113;
    }
    forwardValue1695_49_0 = recovery.source.CarrierOps.lcmp(((long)(life6_10)), ((long)(0L)));
    }
    if (!((life3_31 != 0))) {
        forwardValue1695_66_0 = forwardValue1695_49_0;
        break forward_join_66;
    }
    if (!((forwardValue1695_49_0 >= 0))) {
        break forward_join_113;
    }
    moom.DM __stackOp1695_14_0 = this;
    ((moom.DM)(__stackOp1695_14_0)).i = ((long)((((moom.DM)(__stackOp1695_14_0)).i + life6_10)));
    forwardValue1695_66_0 = recovery.source.CarrierOps.lcmp(((long)(this.i)), ((long)(__sourceIntrinsic_2c8ae721fed4_invokedynamic1695_18(18915, (5565696806206741225L ^ life1_3)))));
    }
    if (!((life3_31 != 0))) {
        forwardValue1695_104_0 = forwardValue1695_66_0;
        break forward_join_104;
    }
    if (!((forwardValue1695_66_0 > 0))) {
        break forward_join_98;
    }
    life13_88 = (life8_18 - this.h);
    life15_95 = (((double) this.i) / ((double) life13_88));
    moom.DM __stackOp1695_22_0 = this;
    ((moom.DM)(__stackOp1695_22_0)).j = ((double)((((moom.DM)(__stackOp1695_22_0)).j + ((life15_95 - this.j) * 0x1.99999ap-3d))));
    this.h = ((long)(life8_18));
    this.i = ((long)(0L));
    }
    spill1695_2 = this;
    if (!((life3_31 != 0))) {
        forwardValue1695_117_0 = spill1695_2;
        break forward_join_117;
    }
    forwardValue1695_104_0 = recovery.source.CarrierOps.lcmp(((long)(((moom.DM)(spill1695_2)).i)), ((long)(0L)));
    }
    if (!((forwardValue1695_104_0 < 0))) {
        break forward_join_116;
    }
    this.h = ((long)(life8_18));
    if (!((life3_31 == 0))) {
        break forward_join_116;
    }
    __sourceExactCall_6604345f74a40b(((java.lang.String[])(new java.lang.String[5])));
    }
    this.f = ((double)(life10_23));
    }
    forwardValue1695_117_0 = this;
    }
    ((moom.DM)(forwardValue1695_117_0)).g = ((long)(life4_5));
    life13_150 = ((life10_23 - this.f) * this.j);
    this.f = ((double)(life10_23));
    life13_158 = moom.Dr.a(((double)(life13_150)), ((double)(0x0.0p0d)), ((double)(0x1.0p0d)));
    this.d = ((float)(((float) (((double) this.d) + ((life13_158 * ((double) this.c)) * ((double) this.e))))));
    spill1695_3 = this;
    if (!((life3_31 != 0))) {
        forwardValue1695_183_0 = spill1695_3;
        break forward_join_183;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(((moom.DM)(spill1695_3)).k)), ((double)(((double) this.d)))) > 0))) {
        break forward_join_173;
    }
    moom.DM __stackOp1695_45_0 = this;
    ((moom.DM)(__stackOp1695_45_0)).k = ((double)((((moom.DM)(__stackOp1695_45_0)).k - ((double) this.d))));
    this.d = ((float)(0x0.0p0f));
    if (!((life3_31 == 0))) {
        break forward_join_185;
    }
    }
    moom.DM __stackOp1695_50_0 = this;
    ((moom.DM)(__stackOp1695_50_0)).d = ((float)(((float) (((double) ((moom.DM)(__stackOp1695_50_0)).d) - this.k))));
    forwardValue1695_183_0 = this;
    }
    ((moom.DM)(forwardValue1695_183_0)).k = ((double)(0x0.0p0d));
    }
    moom.DM __stackOp1695_55_0 = this;
    ((moom.DM)(__stackOp1695_55_0)).d = ((float)((((moom.DM)(__stackOp1695_55_0)).d + ((float) ((com.moon.eH)(life12_30)).a__Int()))));
    this.k = ((double)(java.lang.Math.max(((double)(((com.moon.eH)(life12_30)).a())), ((double)(this.k)))));
    this.a = ((int)(((int) this.d)));
    moom.DM __stackOp1695_65_0 = this;
    ((moom.DM)(__stackOp1695_65_0)).d = ((float)((((moom.DM)(__stackOp1695_65_0)).d - ((float) this.a))));
    spill1695_4 = this;
    if (!((life3_31 != 0))) {
        forwardValue1695_237_0 = spill1695_4;
        break forward_join_237;
    }
    if (!((((moom.DM)(spill1695_4)).a > (__sourceIntrinsic_2c8ae721fed4_invokedynamic1695_70(4251, (2193039989526279342L ^ life1_3)) + ((com.moon.eH)(life12_30)).a__Int())))) {
        break forward_join_236;
    }
    this.a = ((int)((__sourceIntrinsic_2c8ae721fed4_invokedynamic1695_72(19080, (9069305098492538556L ^ life1_3)) + ((com.moon.eH)(life12_30)).a__Int())));
    }
    forwardValue1695_237_0 = this;
    }
    ((moom.DM)(forwardValue1695_237_0)).b = ((float)(this.d));
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral4180_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/DM"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x179B;
        if (DM.n[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = m[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])o.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    o.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/DM", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            DM.n[n2] = n4;
        }
        return DM.n[n2];
}


private static native <E extends Throwable> long __sourceIntrinsic_173a7166fb054e72_originalDynamicSite1916_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4178_0() throws E;

private static native <E extends Throwable> long __sourceIntrinsic_2c8ae721fed4_invokedynamic1695_4(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_2c8ae721fed4_invokedynamic1695_11(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_2c8ae721fed4_invokedynamic1695_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2c8ae721fed4_invokedynamic1695_70(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2c8ae721fed4_invokedynamic1695_72(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral4180_0() throws E;

private static native void __sourceExactCall_6604345f74a40b(java.lang.String[] p0);
}
