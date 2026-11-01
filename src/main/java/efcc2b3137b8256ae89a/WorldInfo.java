package net.minecraft.world.storage;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class WorldInfo {

public static net.minecraft.world.EnumDifficulty a;

private long b;

private net.minecraft.world.WorldType c;

private java.lang.String d;

private int e;

private int f;

private int g;

private long h;

private long i;

private long j;

private long k;

private net.minecraft.nbt.NBTTagCompound l;

private int m;

private java.lang.String n;

private int o;

private int p;

private boolean q;

private int r;

private boolean s;

private int t;

private net.minecraft.world.WorldSettings$GameType u;

private boolean v;

private boolean w;

private boolean x;

private boolean y;

private net.minecraft.world.EnumDifficulty z;

private boolean A;

private double B;

private double C;

private double D;

private long E;

private double F;

private double G;

private double H;

private int I;

private int J;

private net.minecraft.world.GameRules K;

private static java.lang.String L;

private static long N;

private static long[] O;

private static java.lang.Integer[] P;

private static java.util.Map Q;

public WorldInfo(net.minecraft.world.storage.WorldInfo p0) { super(); }

private static void __sourceConstructorBody_173a45f5e813d048(net.minecraft.world.storage.WorldInfo receiver, net.minecraft.world.storage.WorldInfo p0) throws Throwable {
long local2_life2 = (net.minecraft.world.storage.WorldInfo.N ^ 74225539855384L);
    net.minecraft.world.storage.WorldInfo.__sourceConstructorInit_173a45f5e813d048_0(((net.minecraft.world.storage.WorldInfo)(receiver)));
    ((net.minecraft.world.storage.WorldInfo)(receiver)).c = ((net.minecraft.world.WorldType)(net.minecraft.world.WorldType.b));
    ((net.minecraft.world.storage.WorldInfo)(receiver)).d = ((java.lang.String)(""));
    ((net.minecraft.world.storage.WorldInfo)(receiver)).B = ((double)(0x0.0p0d));
    ((net.minecraft.world.storage.WorldInfo)(receiver)).C = ((double)(0x0.0p0d));
    ((net.minecraft.world.storage.WorldInfo)(receiver)).D = ((double)(0x1.c9c3800000000p+25D));
    ((net.minecraft.world.storage.WorldInfo)(receiver)).E = ((long)(0L));
    ((net.minecraft.world.storage.WorldInfo)(receiver)).F = ((double)(0x0.0p0d));
    ((net.minecraft.world.storage.WorldInfo)(receiver)).G = ((double)(0x1.4000000000000p+2D));
    ((net.minecraft.world.storage.WorldInfo)(receiver)).H = ((double)(0x1.999999999999ap-3D));
    ((net.minecraft.world.storage.WorldInfo)(receiver)).I = ((int)(__sourceIntrinsic_173a45f5e813d048_originalDynamicSite885_18(26916, (6041365784067130997L ^ local2_life2))));
    ((net.minecraft.world.storage.WorldInfo)(receiver)).J = ((int)(__sourceIntrinsic_173a45f5e813d048_originalDynamicSite885_21(4457, (6213994804868628026L ^ local2_life2))));
    ((net.minecraft.world.storage.WorldInfo)(receiver)).K = ((net.minecraft.world.GameRules)(new net.minecraft.world.GameRules()));
    ((net.minecraft.world.storage.WorldInfo)(receiver)).b = ((long)(((net.minecraft.world.storage.WorldInfo)(p0)).b));
    ((net.minecraft.world.storage.WorldInfo)(receiver)).c = ((net.minecraft.world.WorldType)(((net.minecraft.world.storage.WorldInfo)(p0)).c));
    ((net.minecraft.world.storage.WorldInfo)(receiver)).d = ((java.lang.String)(((net.minecraft.world.storage.WorldInfo)(p0)).d));
    ((net.minecraft.world.storage.WorldInfo)(receiver)).u = ((net.minecraft.world.WorldSettings$GameType)(((net.minecraft.world.storage.WorldInfo)(p0)).u));
    ((net.minecraft.world.storage.WorldInfo)(receiver)).v = ((boolean)(((net.minecraft.world.storage.WorldInfo)(p0)).v));
    ((net.minecraft.world.storage.WorldInfo)(receiver)).e = ((int)(((net.minecraft.world.storage.WorldInfo)(p0)).e));
    ((net.minecraft.world.storage.WorldInfo)(receiver)).f = ((int)(((net.minecraft.world.storage.WorldInfo)(p0)).f));
    ((net.minecraft.world.storage.WorldInfo)(receiver)).g = ((int)(((net.minecraft.world.storage.WorldInfo)(p0)).g));
    java.lang.String __sourceSpill885_43 = net.minecraft.world.storage.WorldInfo.c__String();
    ((net.minecraft.world.storage.WorldInfo)(receiver)).h = ((long)(((net.minecraft.world.storage.WorldInfo)(p0)).h));
    ((net.minecraft.world.storage.WorldInfo)(receiver)).i = ((long)(((net.minecraft.world.storage.WorldInfo)(p0)).i));
    ((net.minecraft.world.storage.WorldInfo)(receiver)).j = ((long)(((net.minecraft.world.storage.WorldInfo)(p0)).j));
    ((net.minecraft.world.storage.WorldInfo)(receiver)).k = ((long)(((net.minecraft.world.storage.WorldInfo)(p0)).k));
    ((net.minecraft.world.storage.WorldInfo)(receiver)).l = ((net.minecraft.nbt.NBTTagCompound)(((net.minecraft.world.storage.WorldInfo)(p0)).l));
    ((net.minecraft.world.storage.WorldInfo)(receiver)).m = ((int)(((net.minecraft.world.storage.WorldInfo)(p0)).m));
    ((net.minecraft.world.storage.WorldInfo)(receiver)).n = ((java.lang.String)(((net.minecraft.world.storage.WorldInfo)(p0)).n));
    java.lang.String local4_life56 = __sourceSpill885_43;
    try {
        ((net.minecraft.world.storage.WorldInfo)(receiver)).o = ((int)(((net.minecraft.world.storage.WorldInfo)(p0)).o));
        ((net.minecraft.world.storage.WorldInfo)(receiver)).r = ((int)(((net.minecraft.world.storage.WorldInfo)(p0)).r));
        ((net.minecraft.world.storage.WorldInfo)(receiver)).q = ((boolean)(((net.minecraft.world.storage.WorldInfo)(p0)).q));
        ((net.minecraft.world.storage.WorldInfo)(receiver)).t = ((int)(((net.minecraft.world.storage.WorldInfo)(p0)).t));
        ((net.minecraft.world.storage.WorldInfo)(receiver)).s = ((boolean)(((net.minecraft.world.storage.WorldInfo)(p0)).s));
        ((net.minecraft.world.storage.WorldInfo)(receiver)).w = ((boolean)(((net.minecraft.world.storage.WorldInfo)(p0)).w));
        ((net.minecraft.world.storage.WorldInfo)(receiver)).x = ((boolean)(((net.minecraft.world.storage.WorldInfo)(p0)).x));
        ((net.minecraft.world.storage.WorldInfo)(receiver)).y = ((boolean)(((net.minecraft.world.storage.WorldInfo)(p0)).y));
        ((net.minecraft.world.storage.WorldInfo)(receiver)).K = ((net.minecraft.world.GameRules)(((net.minecraft.world.storage.WorldInfo)(p0)).K));
        ((net.minecraft.world.storage.WorldInfo)(receiver)).z = ((net.minecraft.world.EnumDifficulty)(((net.minecraft.world.storage.WorldInfo)(p0)).z));
        ((net.minecraft.world.storage.WorldInfo)(receiver)).A = ((boolean)(((net.minecraft.world.storage.WorldInfo)(p0)).A));
        ((net.minecraft.world.storage.WorldInfo)(receiver)).B = ((double)(((net.minecraft.world.storage.WorldInfo)(p0)).B));
        ((net.minecraft.world.storage.WorldInfo)(receiver)).C = ((double)(((net.minecraft.world.storage.WorldInfo)(p0)).C));
        ((net.minecraft.world.storage.WorldInfo)(receiver)).D = ((double)(((net.minecraft.world.storage.WorldInfo)(p0)).D));
        ((net.minecraft.world.storage.WorldInfo)(receiver)).E = ((long)(((net.minecraft.world.storage.WorldInfo)(p0)).E));
        ((net.minecraft.world.storage.WorldInfo)(receiver)).F = ((double)(((net.minecraft.world.storage.WorldInfo)(p0)).F));
        ((net.minecraft.world.storage.WorldInfo)(receiver)).G = ((double)(((net.minecraft.world.storage.WorldInfo)(p0)).G));
        ((net.minecraft.world.storage.WorldInfo)(receiver)).H = ((double)(((net.minecraft.world.storage.WorldInfo)(p0)).H));
        ((net.minecraft.world.storage.WorldInfo)(receiver)).J = ((int)(((net.minecraft.world.storage.WorldInfo)(p0)).J));
        ((net.minecraft.world.storage.WorldInfo)(receiver)).I = ((int)(((net.minecraft.world.storage.WorldInfo)(p0)).I));
        if ((net.minecraft.entity.Entity.b__ArrayString() != null)) {
        net.minecraft.world.storage.WorldInfo.b(((java.lang.String)("CgICMb")));
    }
    } catch (moom.Oo __catchStack885) {
        throw net.minecraft.world.storage.WorldInfo.a(((java.lang.Throwable)(__catchStack885)));
    }
    return;
}


public WorldInfo(moom.EK p0, java.lang.String p1) { super(); }

private static void __sourceConstructorBody_a53e6558f6d5e912(net.minecraft.world.storage.WorldInfo receiver, moom.EK p0, java.lang.String p1) throws Throwable {
long local3 = (net.minecraft.world.storage.WorldInfo.N ^ 41097104638298L);
    net.minecraft.world.storage.WorldInfo.__sourceConstructorInit_a53e6558f6d5e912_0(((net.minecraft.world.storage.WorldInfo)(receiver)));
    ((net.minecraft.world.storage.WorldInfo)(receiver)).c = ((net.minecraft.world.WorldType)(net.minecraft.world.WorldType.b));
    ((net.minecraft.world.storage.WorldInfo)(receiver)).d = ((java.lang.String)(""));
    ((net.minecraft.world.storage.WorldInfo)(receiver)).B = ((double)(0x0.0p0d));
    ((net.minecraft.world.storage.WorldInfo)(receiver)).C = ((double)(0x0.0p0d));
    ((net.minecraft.world.storage.WorldInfo)(receiver)).D = ((double)(0x1.c9c38p25d));
    ((net.minecraft.world.storage.WorldInfo)(receiver)).E = ((long)(0L));
    ((net.minecraft.world.storage.WorldInfo)(receiver)).F = ((double)(0x0.0p0d));
    ((net.minecraft.world.storage.WorldInfo)(receiver)).G = ((double)(0x1.4p2d));
    ((net.minecraft.world.storage.WorldInfo)(receiver)).H = ((double)(0x1.999999999999ap-3d));
    ((net.minecraft.world.storage.WorldInfo)(receiver)).I = ((int)(__sourceIntrinsic_a53e6558f6d5e912_originalDynamicSite4047_12(26916, (6041395064196313911L ^ local3))));
    ((net.minecraft.world.storage.WorldInfo)(receiver)).J = ((int)(__sourceIntrinsic_a53e6558f6d5e912_originalDynamicSite4047_14(4457, (6214102974435445624L ^ local3))));
    ((net.minecraft.world.storage.WorldInfo)(receiver)).K = ((net.minecraft.world.GameRules)(new net.minecraft.world.GameRules()));
    ((net.minecraft.world.storage.WorldInfo)(receiver)).a(((moom.EK)(p0)));
    ((net.minecraft.world.storage.WorldInfo)(receiver)).n = ((java.lang.String)(p1));
    ((net.minecraft.world.storage.WorldInfo)(receiver)).z = ((net.minecraft.world.EnumDifficulty)(net.minecraft.world.storage.WorldInfo.a));
    ((net.minecraft.world.storage.WorldInfo)(receiver)).y = ((boolean)(false));
    return;
}


public WorldInfo(net.minecraft.nbt.NBTTagCompound p0) { super(); __sourceHandlerCall_ad443a5f7d6c3c1b61b7(this, p0); }


protected WorldInfo() { super(); }

private static void __sourceConstructorBody_786ebcb1558df60a(net.minecraft.world.storage.WorldInfo receiver) throws Throwable {
long local1 = (net.minecraft.world.storage.WorldInfo.N ^ 118606128208233L);
    net.minecraft.world.storage.WorldInfo.__sourceConstructorInit_786ebcb1558df60a_0(((net.minecraft.world.storage.WorldInfo)(receiver)));
    ((net.minecraft.world.storage.WorldInfo)(receiver)).c = ((net.minecraft.world.WorldType)(net.minecraft.world.WorldType.b));
    ((net.minecraft.world.storage.WorldInfo)(receiver)).d = ((java.lang.String)(""));
    ((net.minecraft.world.storage.WorldInfo)(receiver)).B = ((double)(0x0.0p0d));
    ((net.minecraft.world.storage.WorldInfo)(receiver)).C = ((double)(0x0.0p0d));
    ((net.minecraft.world.storage.WorldInfo)(receiver)).D = ((double)(0x1.c9c38p25d));
    ((net.minecraft.world.storage.WorldInfo)(receiver)).E = ((long)(0L));
    ((net.minecraft.world.storage.WorldInfo)(receiver)).F = ((double)(0x0.0p0d));
    ((net.minecraft.world.storage.WorldInfo)(receiver)).G = ((double)(0x1.4p2d));
    ((net.minecraft.world.storage.WorldInfo)(receiver)).H = ((double)(0x1.999999999999ap-3d));
    ((net.minecraft.world.storage.WorldInfo)(receiver)).I = ((int)(__sourceIntrinsic_786ebcb1558df60a_originalDynamicSite4049_12(9278, (3251922269923075610L ^ local1))));
    ((net.minecraft.world.storage.WorldInfo)(receiver)).J = ((int)(__sourceIntrinsic_786ebcb1558df60a_originalDynamicSite4049_14(5950, (7651566128485192989L ^ local1))));
    ((net.minecraft.world.storage.WorldInfo)(receiver)).K = ((net.minecraft.world.GameRules)(new net.minecraft.world.GameRules()));
    return;
}


static {
N = ((long)(((moom._a)(moom._c.a(((long)(9118400810130740320L)), ((long)(-5253842964307074607L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(62402684137640L)))));
    java.lang.String __sourceSpill1962_6 = "obUhhc";
    Q = ((java.util.Map)(new java.util.HashMap(13)));
    net.minecraft.world.storage.WorldInfo.b(((java.lang.String)(__sourceSpill1962_6)));
    long local0_life9 = (net.minecraft.world.storage.WorldInfo.N ^ 29810993629080L);
    javax.crypto.Cipher local2_life11;
    javax.crypto.Cipher __sourceSpill1962_13 = (local2_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1962_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1962_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1962_16 = new byte[8];
    (__sourceSpill1962_16)[0] = ((byte) ((int) (local0_life9 >>> 56)));
    int local3_life17 = 1;
    while ((local3_life17 < 8)) {
        (__sourceSpill1962_16)[local3_life17] = ((byte) ((int) ((local0_life9 << (local3_life17 * 8)) >>> 56)));
        local3_life17 += 1;
    }
    byte[] __sourcePreallocation1962_18 = __sourceSpill1962_16;
    ((javax.crypto.Cipher)(__sourceSpill1962_13)).init(((int)(__sourceSpill1962_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1962_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1962_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life21 = new long[10];
    int local5_life22 = 0;
    java.lang.String local6_life23;
    int local7_life25 = ((java.lang.String)((local6_life23 = "\006Ê.\025Y9&là3\002Tí.dåUó!5<ÜÕ)\035´°y0ì\013½©*\"À{ \0226^\033úqÌ\f¾\025´-Ô+"))).length();
    int local4_life26 = 0;
    do {
        java.lang.String __sourceSpill1962_27 = local6_life23;
        int __sourceSpill1962_28 = local4_life26;
        local4_life26 += 8;
        byte[] local9_life31 = ((java.lang.String)(((java.lang.String)(__sourceSpill1962_27)).substring(((int)(__sourceSpill1962_28)), ((int)(local4_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1962_32 = local8_life21;
        int __sourceSpill1962_33 = local5_life22;
        local5_life22 += 1;
        long local10_life34 = (((((((((((long) (local9_life31)[0]) & 255L) << 56) | ((((long) (local9_life31)[1]) & 255L) << 48)) | ((((long) (local9_life31)[2]) & 255L) << 40)) | ((((long) (local9_life31)[3]) & 255L) << 32)) | ((((long) (local9_life31)[4]) & 255L) << 24)) | ((((long) (local9_life31)[5]) & 255L) << 16)) | ((((long) (local9_life31)[6]) & 255L) << 8)) | (((long) (local9_life31)[7]) & 255L));
        byte[] __sourceSpill1962_35 = new byte[8];
        (__sourceSpill1962_35)[0] = ((byte) ((int) (local10_life34 >>> 56)));
        (__sourceSpill1962_35)[1] = ((byte) ((int) (local10_life34 >>> 48)));
        (__sourceSpill1962_35)[2] = ((byte) ((int) (local10_life34 >>> 40)));
        (__sourceSpill1962_35)[3] = ((byte) ((int) (local10_life34 >>> 32)));
        (__sourceSpill1962_35)[4] = ((byte) ((int) (local10_life34 >>> 24)));
        (__sourceSpill1962_35)[5] = ((byte) ((int) (local10_life34 >>> 16)));
        (__sourceSpill1962_35)[6] = ((byte) ((int) (local10_life34 >>> 8)));
        (__sourceSpill1962_35)[7] = ((byte) ((int) local10_life34));
        javax.crypto.Cipher __sourceSpill1962_36 = local2_life11;
        byte[] local12_life38 = ((javax.crypto.Cipher)(__sourceSpill1962_36)).doFinal(((byte[])(__sourceSpill1962_35)));
        (__sourceSpill1962_32)[__sourceSpill1962_33] = (((((((((((long) (local12_life38)[0]) & 255L) << 56) | ((((long) (local12_life38)[1]) & 255L) << 48)) | ((((long) (local12_life38)[2]) & 255L) << 40)) | ((((long) (local12_life38)[3]) & 255L) << 32)) | ((((long) (local12_life38)[4]) & 255L) << 24)) | ((((long) (local12_life38)[5]) & 255L) << 16)) | ((((long) (local12_life38)[6]) & 255L) << 8)) | (((long) (local12_life38)[7]) & 255L));
    } while ((!(local4_life26 >= local7_life25)));
    local7_life25 = ((java.lang.String)((local6_life23 = "·Ð\r0\016\036QLÜ°%E\021Ný¹"))).length();
    local4_life26 = 0;
    do {
        java.lang.String __sourceSpill1962_40 = local6_life23;
        int __sourceSpill1962_41 = local4_life26;
        local4_life26 += 8;
        byte[] local9_life44 = ((java.lang.String)(((java.lang.String)(__sourceSpill1962_40)).substring(((int)(__sourceSpill1962_41)), ((int)(local4_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1962_45 = local8_life21;
        int __sourceSpill1962_46 = local5_life22;
        local5_life22 += 1;
        long local10_life47 = (((((((((((long) (local9_life44)[0]) & 255L) << 56) | ((((long) (local9_life44)[1]) & 255L) << 48)) | ((((long) (local9_life44)[2]) & 255L) << 40)) | ((((long) (local9_life44)[3]) & 255L) << 32)) | ((((long) (local9_life44)[4]) & 255L) << 24)) | ((((long) (local9_life44)[5]) & 255L) << 16)) | ((((long) (local9_life44)[6]) & 255L) << 8)) | (((long) (local9_life44)[7]) & 255L));
        byte[] __sourceSpill1962_48 = new byte[8];
        (__sourceSpill1962_48)[0] = ((byte) ((int) (local10_life47 >>> 56)));
        (__sourceSpill1962_48)[1] = ((byte) ((int) (local10_life47 >>> 48)));
        (__sourceSpill1962_48)[2] = ((byte) ((int) (local10_life47 >>> 40)));
        (__sourceSpill1962_48)[3] = ((byte) ((int) (local10_life47 >>> 32)));
        (__sourceSpill1962_48)[4] = ((byte) ((int) (local10_life47 >>> 24)));
        (__sourceSpill1962_48)[5] = ((byte) ((int) (local10_life47 >>> 16)));
        (__sourceSpill1962_48)[6] = ((byte) ((int) (local10_life47 >>> 8)));
        (__sourceSpill1962_48)[7] = ((byte) ((int) local10_life47));
        javax.crypto.Cipher __sourceSpill1962_49 = local2_life11;
        byte[] local12_life51 = ((javax.crypto.Cipher)(__sourceSpill1962_49)).doFinal(((byte[])(__sourceSpill1962_48)));
        (__sourceSpill1962_45)[__sourceSpill1962_46] = (((((((((((long) (local12_life51)[0]) & 255L) << 56) | ((((long) (local12_life51)[1]) & 255L) << 48)) | ((((long) (local12_life51)[2]) & 255L) << 40)) | ((((long) (local12_life51)[3]) & 255L) << 32)) | ((((long) (local12_life51)[4]) & 255L) << 24)) | ((((long) (local12_life51)[5]) & 255L) << 16)) | ((((long) (local12_life51)[6]) & 255L) << 8)) | (((long) (local12_life51)[7]) & 255L));
    } while ((!(local4_life26 >= local7_life25)));
    O = ((long[])(local8_life21));
    P = ((java.lang.Integer[])(new java.lang.Integer[10]));
    a = ((net.minecraft.world.EnumDifficulty)(net.minecraft.world.EnumDifficulty.NORMAL));
}

private static native <E extends Throwable> void __sourceConstructorInit_786ebcb1558df60a_0(net.minecraft.world.storage.WorldInfo a0) throws E;
private static native <E extends Throwable> void __sourceConstructorInit_a53e6558f6d5e912_0(net.minecraft.world.storage.WorldInfo a0) throws E;
private static native <E extends Throwable> void __sourceConstructorInit_173a45f5e813d048_0(net.minecraft.world.storage.WorldInfo a0) throws E;
private static native <E extends Throwable> void __sourceHandlerCall_ad443a5f7d6c3c1b61b7(net.minecraft.world.storage.WorldInfo a0, net.minecraft.nbt.NBTTagCompound a1) throws E;
private static final class __SourceHandler_ad443a5f7d6c3c1b61b7 {

public static void f589(net.minecraft.world.storage.WorldInfo receiver, net.minecraft.nbt.NBTTagCompound p0) throws Throwable {
    net.minecraft.world.WorldType forwardValue589_93_0;
    int forwardValue589_113_0;
    int forwardValue589_128_0;
    int forwardValue589_152_0;
    net.minecraft.world.storage.WorldInfo forwardValue589_162_0;
    int forwardValue589_162_1;
    net.minecraft.world.storage.WorldInfo forwardValue589_204_0;
    long forwardValue589_204_1;
    net.minecraft.world.storage.WorldInfo forwardValue589_275_0;
    int forwardValue589_275_1;
    net.minecraft.world.storage.WorldInfo forwardValue589_299_0;
    net.minecraft.world.storage.WorldInfo forwardValue589_300_0;
    int forwardValue589_300_1;
    int forwardValue589_331_0;
    int forwardValue589_348_0;
    int forwardValue589_361_0;
    int forwardValue589_377_0;
    int forwardValue589_393_0;
    int forwardValue589_409_0;
    int forwardValue589_425_0;
    int forwardValue589_441_0;
    int forwardValue589_457_0;
    int forwardValue589_473_0;
    int forwardValue589_489_0;
    int forwardValue589_505_0;
    java.lang.String spill589_0;
    boolean spill589_1;
    net.minecraft.world.WorldType spill589_2;
    boolean spill589_3;
    boolean spill589_4;
    net.minecraft.world.storage.WorldInfo spill589_5;
    int spill589_6;
    net.minecraft.world.storage.WorldInfo spill589_7;
    long spill589_8;
    net.minecraft.world.storage.WorldInfo spill589_9;
    boolean spill589_10;
    net.minecraft.world.storage.WorldInfo spill589_11;
    boolean spill589_12;
    long life2_3;
    java.lang.String life4_13;
    java.lang.String life5_76;
    int life6_113;
    forward_join_511: {
    forward_join_505: {
    forward_join_497: {
    forward_join_489: {
    forward_join_481: {
    forward_join_473: {
    forward_join_465: {
    forward_join_457: {
    forward_join_449: {
    forward_join_441: {
    forward_join_433: {
    forward_join_425: {
    forward_join_417: {
    forward_join_409: {
    forward_join_401: {
    forward_join_393: {
    forward_join_385: {
    forward_join_377: {
    forward_join_369: {
    forward_join_361: {
    forward_join_357: {
    forward_join_348: {
    forward_join_340: {
    forward_join_331: {
    forward_join_323: {
    forward_join_301: {
    forward_join_300: {
    forward_join_299: {
    forward_join_292: {
    forward_join_276: {
    forward_join_275: {
    forward_join_273: {
    forward_join_205: {
    forward_join_204: {
    forward_join_201: {
    forward_join_163: {
    forward_join_162: {
    forward_join_160: {
    forward_join_152: {
    forward_join_136: {
    forward_join_128: {
    forward_join_120: {
    forward_join_114: {
    forward_join_113: {
    forward_join_93: {
    forward_join_91: {
    life2_3 = (__fieldRead589_0() ^ 138472860783370L);
    __directSuperInit589_1(receiver);
    spill589_0 = __call589_2();
    __fieldWrite589_4(receiver, __fieldRead589_3());
    __fieldWrite589_5(receiver, "");
    life4_13 = spill589_0;
    __fieldWrite589_6(receiver, 0x0.0p0d);
    __fieldWrite589_7(receiver, 0x0.0p0d);
    __fieldWrite589_8(receiver, 0x1.c9c38p25d);
    __fieldWrite589_9(receiver, 0L);
    __fieldWrite589_10(receiver, 0x0.0p0d);
    __fieldWrite589_11(receiver, 0x1.4p2d);
    __fieldWrite589_12(receiver, 0x1.999999999999ap-3d);
    __fieldWrite589_14(receiver, __invokedynamic589_13(26916, (6041297825894457703L ^ life2_3)));
    __fieldWrite589_16(receiver, __invokedynamic589_15(4457, (6214040783613532456L ^ life2_3)));
    __fieldWrite589_17(receiver, new net.minecraft.world.GameRules());
    __fieldWrite589_19(receiver, __call589_18(p0, "RandomSeed"));
    spill589_1 = __call589_21(p0, "generatorName", __invokedynamic589_20(31495, (7962514758757905219L ^ life2_3)));
    if (!((life4_13 != null))) {
        forwardValue589_152_0 = __integerCategory589_22(spill589_1);
        break forward_join_152;
    }
    if (!(spill589_1)) {
        break forward_join_136;
    }
    life5_76 = __call589_23(p0, "generatorName");
    __fieldWrite589_25(receiver, __call589_24(life5_76));
    spill589_2 = __fieldRead589_26(receiver);
    if (!((life4_13 != null))) {
        forwardValue589_93_0 = spill589_2;
        break forward_join_93;
    }
    if (!((spill589_2 == null))) {
        break forward_join_91;
    }
    __fieldWrite589_28(receiver, __fieldRead589_27());
    if (!((life4_13 == null))) {
        break forward_join_120;
    }
    __call589_29(new java.lang.String[4]);
    }
    forwardValue589_93_0 = __fieldRead589_30(receiver);
    }
    spill589_3 = __call589_31(forwardValue589_93_0);
    if (!((life4_13 != null))) {
        forwardValue589_128_0 = __integerCategory589_32(spill589_3);
        break forward_join_128;
    }
    if (!(spill589_3)) {
        break forward_join_120;
    }
    life6_113 = 0;
    spill589_4 = __call589_34(p0, "generatorVersion", __invokedynamic589_33(31361, (8692554286517646024L ^ life2_3)));
    if (!((life4_13 != null))) {
        forwardValue589_113_0 = __integerCategory589_35(spill589_4);
        break forward_join_113;
    }
    if (!(spill589_4)) {
        break forward_join_114;
    }
    forwardValue589_113_0 = __call589_36(p0, "generatorVersion");
    }
    life6_113 = forwardValue589_113_0;
    }
    __fieldWrite589_39(receiver, __call589_38(__fieldRead589_37(receiver), life6_113));
    }
    forwardValue589_128_0 = __integerCategory589_42(__call589_41(p0, "generatorOptions", __invokedynamic589_40(12833, (9017133507828529767L ^ life2_3))));
    }
    if (!((life4_13 != null))) {
        forwardValue589_152_0 = forwardValue589_128_0;
        break forward_join_152;
    }
    if (!((forwardValue589_128_0 != 0))) {
        break forward_join_136;
    }
    __fieldWrite589_44(receiver, __call589_43(p0, "generatorOptions"));
    }
    spill589_5 = receiver;
    spill589_6 = __call589_45(p0, "GameType");
    if (!((life4_13 != null))) {
        forwardValue589_162_0 = spill589_5;
        forwardValue589_162_1 = spill589_6;
        break forward_join_162;
    }
    __fieldWrite589_47(spill589_5, __call589_46(spill589_6));
    forwardValue589_152_0 = __integerCategory589_50(__call589_49(p0, "MapFeatures", __invokedynamic589_48(20439, (6020253772930041746L ^ life2_3))));
    }
    if (!((forwardValue589_152_0 != 0))) {
        break forward_join_160;
    }
    __fieldWrite589_52(receiver, __call589_51(p0, "MapFeatures"));
    if (!((life4_13 == null))) {
        break forward_join_163;
    }
    }
    forwardValue589_162_0 = receiver;
    forwardValue589_162_1 = 1;
    }
    __fieldWrite589_53(forwardValue589_162_0, forwardValue589_162_1);
    }
    __fieldWrite589_55(receiver, __call589_54(p0, "SpawnX"));
    __fieldWrite589_57(receiver, __call589_56(p0, "SpawnY"));
    __fieldWrite589_59(receiver, __call589_58(p0, "SpawnZ"));
    spill589_7 = receiver;
    spill589_8 = __call589_60(p0, "Time");
    if (!((life4_13 != null))) {
        forwardValue589_204_0 = spill589_7;
        forwardValue589_204_1 = spill589_8;
        break forward_join_204;
    }
    __fieldWrite589_61(spill589_7, spill589_8);
    if (!(__call589_63(p0, "DayTime", __invokedynamic589_62(20439, (6020253772930041746L ^ life2_3))))) {
        break forward_join_201;
    }
    __fieldWrite589_65(receiver, __call589_64(p0, "DayTime"));
    if (!((life4_13 == null))) {
        break forward_join_205;
    }
    }
    forwardValue589_204_0 = receiver;
    forwardValue589_204_1 = __fieldRead589_66(receiver);
    }
    __fieldWrite589_67(forwardValue589_204_0, forwardValue589_204_1);
    }
    __fieldWrite589_69(receiver, __call589_68(p0, "LastPlayed"));
    __fieldWrite589_71(receiver, __call589_70(p0, "SizeOnDisk"));
    __fieldWrite589_73(receiver, __call589_72(p0, "LevelName"));
    __fieldWrite589_75(receiver, __call589_74(p0, "version"));
    __fieldWrite589_77(receiver, __call589_76(p0, "clearWeatherTime"));
    __fieldWrite589_79(receiver, __call589_78(p0, "rainTime"));
    __fieldWrite589_81(receiver, __call589_80(p0, "raining"));
    __fieldWrite589_83(receiver, __call589_82(p0, "thunderTime"));
    __fieldWrite589_85(receiver, __call589_84(p0, "thundering"));
    spill589_9 = receiver;
    spill589_10 = __call589_86(p0, "hardcore");
    if (!((life4_13 != null))) {
        forwardValue589_275_0 = spill589_9;
        forwardValue589_275_1 = __integerCategory589_87(spill589_10);
        break forward_join_275;
    }
    __fieldWrite589_88(spill589_9, spill589_10);
    if (!(__call589_90(p0, "initialized", __invokedynamic589_89(20439, (6020253772930041746L ^ life2_3))))) {
        break forward_join_273;
    }
    __fieldWrite589_92(receiver, __call589_91(p0, "initialized"));
    if (!((life4_13 == null))) {
        break forward_join_276;
    }
    }
    forwardValue589_275_0 = receiver;
    forwardValue589_275_1 = 1;
    }
    __fieldWrite589_93(forwardValue589_275_0, forwardValue589_275_1);
    }
    if (!(__call589_95(p0, "allowCommands", __invokedynamic589_94(20439, (6020253772930041746L ^ life2_3))))) {
        break forward_join_292;
    }
    __fieldWrite589_97(receiver, __call589_96(p0, "allowCommands"));
    if (!((life4_13 == null))) {
        break forward_join_301;
    }
    }
    spill589_11 = receiver;
    if (!((__fieldRead589_98(receiver) == __fieldRead589_99()))) {
        forwardValue589_299_0 = spill589_11;
        break forward_join_299;
    }
    forwardValue589_300_0 = spill589_11;
    forwardValue589_300_1 = 1;
    break forward_join_300;
    }
    forwardValue589_300_0 = forwardValue589_299_0;
    forwardValue589_300_1 = 0;
    }
    __fieldWrite589_100(forwardValue589_300_0, forwardValue589_300_1);
    }
    spill589_12 = __call589_102(p0, "Player", __invokedynamic589_101(18808, (6531038268352119098L ^ life2_3)));
    if (!((life4_13 != null))) {
        forwardValue589_331_0 = __integerCategory589_103(spill589_12);
        break forward_join_331;
    }
    if (!(spill589_12)) {
        break forward_join_323;
    }
    __fieldWrite589_105(receiver, __call589_104(p0, "Player"));
    __fieldWrite589_108(receiver, __call589_107(__fieldRead589_106(receiver), "Dimension"));
    }
    forwardValue589_331_0 = __integerCategory589_111(__call589_110(p0, "GameRules", __invokedynamic589_109(28845, (9021823122347587813L ^ life2_3))));
    }
    if (!((life4_13 != null))) {
        forwardValue589_348_0 = forwardValue589_331_0;
        break forward_join_348;
    }
    if (!((forwardValue589_331_0 != 0))) {
        break forward_join_340;
    }
    __call589_114(__fieldRead589_112(receiver), __call589_113(p0, "GameRules"));
    }
    forwardValue589_348_0 = __integerCategory589_117(__call589_116(p0, "Difficulty", __invokedynamic589_115(20439, (6020253772930041746L ^ life2_3))));
    }
    if (!((life4_13 != null))) {
        forwardValue589_361_0 = forwardValue589_348_0;
        break forward_join_361;
    }
    if (!((forwardValue589_348_0 != 0))) {
        break forward_join_357;
    }
    __fieldWrite589_120(receiver, __call589_119(__call589_118(p0, "Difficulty")));
    }
    forwardValue589_361_0 = __integerCategory589_122(__call589_121(p0, "DifficultyLocked", 1));
    }
    if (!((life4_13 != null))) {
        forwardValue589_377_0 = forwardValue589_361_0;
        break forward_join_377;
    }
    if (!((forwardValue589_361_0 != 0))) {
        break forward_join_369;
    }
    __fieldWrite589_124(receiver, __call589_123(p0, "DifficultyLocked"));
    }
    forwardValue589_377_0 = __integerCategory589_127(__call589_126(p0, "BorderCenterX", __invokedynamic589_125(20439, (6020253772930041746L ^ life2_3))));
    }
    if (!((life4_13 != null))) {
        forwardValue589_393_0 = forwardValue589_377_0;
        break forward_join_393;
    }
    if (!((forwardValue589_377_0 != 0))) {
        break forward_join_385;
    }
    __fieldWrite589_129(receiver, __call589_128(p0, "BorderCenterX"));
    }
    forwardValue589_393_0 = __integerCategory589_132(__call589_131(p0, "BorderCenterZ", __invokedynamic589_130(20439, (6020253772930041746L ^ life2_3))));
    }
    if (!((life4_13 != null))) {
        forwardValue589_409_0 = forwardValue589_393_0;
        break forward_join_409;
    }
    if (!((forwardValue589_393_0 != 0))) {
        break forward_join_401;
    }
    __fieldWrite589_134(receiver, __call589_133(p0, "BorderCenterZ"));
    }
    forwardValue589_409_0 = __integerCategory589_137(__call589_136(p0, "BorderSize", __invokedynamic589_135(20439, (6020253772930041746L ^ life2_3))));
    }
    if (!((life4_13 != null))) {
        forwardValue589_425_0 = forwardValue589_409_0;
        break forward_join_425;
    }
    if (!((forwardValue589_409_0 != 0))) {
        break forward_join_417;
    }
    __fieldWrite589_139(receiver, __call589_138(p0, "BorderSize"));
    }
    forwardValue589_425_0 = __integerCategory589_142(__call589_141(p0, "BorderSizeLerpTime", __invokedynamic589_140(20439, (6020253772930041746L ^ life2_3))));
    }
    if (!((life4_13 != null))) {
        forwardValue589_441_0 = forwardValue589_425_0;
        break forward_join_441;
    }
    if (!((forwardValue589_425_0 != 0))) {
        break forward_join_433;
    }
    __fieldWrite589_144(receiver, __call589_143(p0, "BorderSizeLerpTime"));
    }
    forwardValue589_441_0 = __integerCategory589_147(__call589_146(p0, "BorderSizeLerpTarget", __invokedynamic589_145(20439, (6020253772930041746L ^ life2_3))));
    }
    if (!((life4_13 != null))) {
        forwardValue589_457_0 = forwardValue589_441_0;
        break forward_join_457;
    }
    if (!((forwardValue589_441_0 != 0))) {
        break forward_join_449;
    }
    __fieldWrite589_149(receiver, __call589_148(p0, "BorderSizeLerpTarget"));
    }
    forwardValue589_457_0 = __integerCategory589_152(__call589_151(p0, "BorderSafeZone", __invokedynamic589_150(20439, (6020253772930041746L ^ life2_3))));
    }
    if (!((life4_13 != null))) {
        forwardValue589_473_0 = forwardValue589_457_0;
        break forward_join_473;
    }
    if (!((forwardValue589_457_0 != 0))) {
        break forward_join_465;
    }
    __fieldWrite589_154(receiver, __call589_153(p0, "BorderSafeZone"));
    }
    forwardValue589_473_0 = __integerCategory589_157(__call589_156(p0, "BorderDamagePerBlock", __invokedynamic589_155(20439, (6020253772930041746L ^ life2_3))));
    }
    if (!((life4_13 != null))) {
        forwardValue589_489_0 = forwardValue589_473_0;
        break forward_join_489;
    }
    if (!((forwardValue589_473_0 != 0))) {
        break forward_join_481;
    }
    __fieldWrite589_159(receiver, __call589_158(p0, "BorderDamagePerBlock"));
    }
    forwardValue589_489_0 = __integerCategory589_162(__call589_161(p0, "BorderWarningBlocks", __invokedynamic589_160(20439, (6020253772930041746L ^ life2_3))));
    }
    if (!((life4_13 != null))) {
        forwardValue589_505_0 = forwardValue589_489_0;
        break forward_join_505;
    }
    if (!((forwardValue589_489_0 != 0))) {
        break forward_join_497;
    }
    __fieldWrite589_164(receiver, __call589_163(p0, "BorderWarningBlocks"));
    }
    forwardValue589_505_0 = __integerCategory589_167(__call589_166(p0, "BorderWarningTime", __invokedynamic589_165(20439, (6020253772930041746L ^ life2_3))));
    }
    if (!((forwardValue589_505_0 != 0))) {
        break forward_join_511;
    }
    __fieldWrite589_169(receiver, __call589_168(p0, "BorderWarningTime"));
    }
    return;
}
public static void h589_0(moom.Oo p0) throws Throwable {
    throw __call3058900_0(p0);
}
public static void h589_1(moom.Oo p0) throws Throwable {
    throw __call3058901_0(p0);
}
public static void h589_2(moom.Oo p0) throws Throwable {
    throw __call3058902_0(p0);
}
public static void h589_3(moom.Oo p0) throws Throwable {
    throw __call3058903_0(p0);
}
public static void h589_4(moom.Oo p0) throws Throwable {
    throw __call3058904_0(p0);
}
public static void h589_5(moom.Oo p0) throws Throwable {
    throw __call3058905_0(p0);
}
public static void h589_6(moom.Oo p0) throws Throwable {
    throw __call3058906_0(p0);
}
public static void h589_7(moom.Oo p0) throws Throwable {
    throw __call3058907_0(p0);
}
public static void h589_8(moom.Oo p0) throws Throwable {
    throw __call3058908_0(p0);
}
public static void h589_9(moom.Oo p0) throws Throwable {
    throw __call3058909_0(p0);
}
public static void h589_10(moom.Oo p0) throws Throwable {
    throw __call3058910_0(p0);
}
public static void h589_11(moom.Oo p0) throws Throwable {
    throw __call3058911_0(p0);
}
public static void h589_12(moom.Oo p0) throws Throwable {
    throw __call3058912_0(p0);
}
public static void h589_13(moom.Oo p0) throws Throwable {
    throw __call3058913_0(p0);
}
public static void h589_14(moom.Oo p0) throws Throwable {
    throw __call3058914_0(p0);
}
public static void h589_15(moom.Oo p0) throws Throwable {
    throw __call3058915_0(p0);
}
public static void h589_16(moom.Oo p0) throws Throwable {
    throw __call3058916_0(p0);
}
public static void h589_17(moom.Oo p0) throws Throwable {
    throw __call3058917_0(p0);
}
public static void h589_18(moom.Oo p0) throws Throwable {
    throw __call3058918_0(p0);
}
public static void h589_19(moom.Oo p0) throws Throwable {
    throw __call3058919_0(p0);
}
public static void h589_20(moom.Oo p0) throws Throwable {
    throw __call3058920_0(p0);
}
public static void h589_21(moom.Oo p0) throws Throwable {
    throw __call3058921_0(p0);
}
public static void h589_22(moom.Oo p0) throws Throwable {
    throw __call3058922_0(p0);
}
public static void h589_23(moom.Oo p0) throws Throwable {
    throw __call3058923_0(p0);
}
public static void h589_24(moom.Oo p0) throws Throwable {
    throw __call3058924_0(p0);
}
public static void h589_25(moom.Oo p0) throws Throwable {
    throw __call3058925_0(p0);
}
public static void h589_26(moom.Oo p0) throws Throwable {
    throw __call3058926_0(p0);
}
public static void h589_27(moom.Oo p0) throws Throwable {
    throw __call3058927_0(p0);
}
public static void h589_28(moom.Oo p0) throws Throwable {
    throw __call3058928_0(p0);
}
public static void h589_29(moom.Oo p0) throws Throwable {
    throw __call3058929_0(p0);
}
public static void h589_30(moom.Oo p0) throws Throwable {
    throw __call3058930_0(p0);
}
public static void h589_31(moom.Oo p0) throws Throwable {
    throw __call3058931_0(p0);
}
public static void h589_32(moom.Oo p0) throws Throwable {
    throw __call3058932_0(p0);
}
public static void h589_33(moom.Oo p0) throws Throwable {
    throw __call3058933_0(p0);
}
public static void h589_34(moom.Oo p0) throws Throwable {
    throw __call3058934_0(p0);
}
public static void h589_35(moom.Oo p0) throws Throwable {
    throw __call3058935_0(p0);
}
public static void h589_36(moom.Oo p0) throws Throwable {
    throw __call3058936_0(p0);
}
public static void h589_37(moom.Oo p0) throws Throwable {
    throw __call3058937_0(p0);
}
public static void h589_38(moom.Oo p0) throws Throwable {
    throw __call3058938_0(p0);
}
public static void h589_39(moom.Oo p0) throws Throwable {
    throw __call3058939_0(p0);
}
public static void h589_40(moom.Oo p0) throws Throwable {
    throw __call3058940_0(p0);
}
public static void h589_41(moom.Oo p0) throws Throwable {
    throw __call3058941_0(p0);
}
public static void h589_42(moom.Oo p0) throws Throwable {
    throw __call3058942_0(p0);
}
public static void h589_43(moom.Oo p0) throws Throwable {
    throw __call3058943_0(p0);
}
public static void h589_44(moom.Oo p0) throws Throwable {
    throw __call3058944_0(p0);
}
public static void h589_45(moom.Oo p0) throws Throwable {
    throw __call3058945_0(p0);
}
private static native long __fieldRead589_0() throws Throwable;
private static native void __directSuperInit589_1(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native java.lang.String __call589_2() throws Throwable;
private static native net.minecraft.world.WorldType __fieldRead589_3() throws Throwable;
private static native void __fieldWrite589_4(net.minecraft.world.storage.WorldInfo a0, net.minecraft.world.WorldType a1) throws Throwable;
private static native void __fieldWrite589_5(net.minecraft.world.storage.WorldInfo a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite589_6(net.minecraft.world.storage.WorldInfo a0, double a1) throws Throwable;
private static native void __fieldWrite589_7(net.minecraft.world.storage.WorldInfo a0, double a1) throws Throwable;
private static native void __fieldWrite589_8(net.minecraft.world.storage.WorldInfo a0, double a1) throws Throwable;
private static native void __fieldWrite589_9(net.minecraft.world.storage.WorldInfo a0, long a1) throws Throwable;
private static native void __fieldWrite589_10(net.minecraft.world.storage.WorldInfo a0, double a1) throws Throwable;
private static native void __fieldWrite589_11(net.minecraft.world.storage.WorldInfo a0, double a1) throws Throwable;
private static native void __fieldWrite589_12(net.minecraft.world.storage.WorldInfo a0, double a1) throws Throwable;
private static native int __invokedynamic589_13(int a0, long a1) throws Throwable;
private static native void __fieldWrite589_14(net.minecraft.world.storage.WorldInfo a0, int a1) throws Throwable;
private static native int __invokedynamic589_15(int a0, long a1) throws Throwable;
private static native void __fieldWrite589_16(net.minecraft.world.storage.WorldInfo a0, int a1) throws Throwable;
private static native void __fieldWrite589_17(net.minecraft.world.storage.WorldInfo a0, net.minecraft.world.GameRules a1) throws Throwable;
private static native long __call589_18(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite589_19(net.minecraft.world.storage.WorldInfo a0, long a1) throws Throwable;
private static native int __invokedynamic589_20(int a0, long a1) throws Throwable;
private static native boolean __call589_21(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native int __integerCategory589_22(boolean value) throws Throwable;
private static native java.lang.String __call589_23(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.world.WorldType __call589_24(java.lang.String a0) throws Throwable;
private static native void __fieldWrite589_25(net.minecraft.world.storage.WorldInfo a0, net.minecraft.world.WorldType a1) throws Throwable;
private static native net.minecraft.world.WorldType __fieldRead589_26(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native net.minecraft.world.WorldType __fieldRead589_27() throws Throwable;
private static native void __fieldWrite589_28(net.minecraft.world.storage.WorldInfo a0, net.minecraft.world.WorldType a1) throws Throwable;
private static native void __call589_29(java.lang.String[] a0) throws Throwable;
private static native net.minecraft.world.WorldType __fieldRead589_30(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native boolean __call589_31(net.minecraft.world.WorldType a0) throws Throwable;
private static native int __integerCategory589_32(boolean value) throws Throwable;
private static native int __invokedynamic589_33(int a0, long a1) throws Throwable;
private static native boolean __call589_34(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native int __integerCategory589_35(boolean value) throws Throwable;
private static native int __call589_36(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.world.WorldType __fieldRead589_37(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native net.minecraft.world.WorldType __call589_38(net.minecraft.world.WorldType a0, int a1) throws Throwable;
private static native void __fieldWrite589_39(net.minecraft.world.storage.WorldInfo a0, net.minecraft.world.WorldType a1) throws Throwable;
private static native int __invokedynamic589_40(int a0, long a1) throws Throwable;
private static native boolean __call589_41(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native int __integerCategory589_42(boolean value) throws Throwable;
private static native java.lang.String __call589_43(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite589_44(net.minecraft.world.storage.WorldInfo a0, java.lang.String a1) throws Throwable;
private static native int __call589_45(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.world.WorldSettings$GameType __call589_46(int a0) throws Throwable;
private static native void __fieldWrite589_47(net.minecraft.world.storage.WorldInfo a0, net.minecraft.world.WorldSettings$GameType a1) throws Throwable;
private static native int __invokedynamic589_48(int a0, long a1) throws Throwable;
private static native boolean __call589_49(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native int __integerCategory589_50(boolean value) throws Throwable;
private static native boolean __call589_51(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite589_52(net.minecraft.world.storage.WorldInfo a0, boolean a1) throws Throwable;
private static native void __fieldWrite589_53(net.minecraft.world.storage.WorldInfo a0, int a1) throws Throwable;
private static native int __call589_54(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite589_55(net.minecraft.world.storage.WorldInfo a0, int a1) throws Throwable;
private static native int __call589_56(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite589_57(net.minecraft.world.storage.WorldInfo a0, int a1) throws Throwable;
private static native int __call589_58(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite589_59(net.minecraft.world.storage.WorldInfo a0, int a1) throws Throwable;
private static native long __call589_60(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite589_61(net.minecraft.world.storage.WorldInfo a0, long a1) throws Throwable;
private static native int __invokedynamic589_62(int a0, long a1) throws Throwable;
private static native boolean __call589_63(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native long __call589_64(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite589_65(net.minecraft.world.storage.WorldInfo a0, long a1) throws Throwable;
private static native long __fieldRead589_66(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native void __fieldWrite589_67(net.minecraft.world.storage.WorldInfo a0, long a1) throws Throwable;
private static native long __call589_68(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite589_69(net.minecraft.world.storage.WorldInfo a0, long a1) throws Throwable;
private static native long __call589_70(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite589_71(net.minecraft.world.storage.WorldInfo a0, long a1) throws Throwable;
private static native java.lang.String __call589_72(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite589_73(net.minecraft.world.storage.WorldInfo a0, java.lang.String a1) throws Throwable;
private static native int __call589_74(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite589_75(net.minecraft.world.storage.WorldInfo a0, int a1) throws Throwable;
private static native int __call589_76(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite589_77(net.minecraft.world.storage.WorldInfo a0, int a1) throws Throwable;
private static native int __call589_78(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite589_79(net.minecraft.world.storage.WorldInfo a0, int a1) throws Throwable;
private static native boolean __call589_80(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite589_81(net.minecraft.world.storage.WorldInfo a0, boolean a1) throws Throwable;
private static native int __call589_82(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite589_83(net.minecraft.world.storage.WorldInfo a0, int a1) throws Throwable;
private static native boolean __call589_84(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite589_85(net.minecraft.world.storage.WorldInfo a0, boolean a1) throws Throwable;
private static native boolean __call589_86(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory589_87(boolean value) throws Throwable;
private static native void __fieldWrite589_88(net.minecraft.world.storage.WorldInfo a0, boolean a1) throws Throwable;
private static native int __invokedynamic589_89(int a0, long a1) throws Throwable;
private static native boolean __call589_90(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native boolean __call589_91(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite589_92(net.minecraft.world.storage.WorldInfo a0, boolean a1) throws Throwable;
private static native void __fieldWrite589_93(net.minecraft.world.storage.WorldInfo a0, int a1) throws Throwable;
private static native int __invokedynamic589_94(int a0, long a1) throws Throwable;
private static native boolean __call589_95(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native boolean __call589_96(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite589_97(net.minecraft.world.storage.WorldInfo a0, boolean a1) throws Throwable;
private static native net.minecraft.world.WorldSettings$GameType __fieldRead589_98(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native net.minecraft.world.WorldSettings$GameType __fieldRead589_99() throws Throwable;
private static native void __fieldWrite589_100(net.minecraft.world.storage.WorldInfo a0, int a1) throws Throwable;
private static native int __invokedynamic589_101(int a0, long a1) throws Throwable;
private static native boolean __call589_102(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native int __integerCategory589_103(boolean value) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call589_104(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite589_105(net.minecraft.world.storage.WorldInfo a0, net.minecraft.nbt.NBTTagCompound a1) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __fieldRead589_106(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native int __call589_107(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite589_108(net.minecraft.world.storage.WorldInfo a0, int a1) throws Throwable;
private static native int __invokedynamic589_109(int a0, long a1) throws Throwable;
private static native boolean __call589_110(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native int __integerCategory589_111(boolean value) throws Throwable;
private static native net.minecraft.world.GameRules __fieldRead589_112(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call589_113(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native void __call589_114(net.minecraft.world.GameRules a0, net.minecraft.nbt.NBTTagCompound a1) throws Throwable;
private static native int __invokedynamic589_115(int a0, long a1) throws Throwable;
private static native boolean __call589_116(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native int __integerCategory589_117(boolean value) throws Throwable;
private static native byte __call589_118(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.world.EnumDifficulty __call589_119(byte a0) throws Throwable;
private static native void __fieldWrite589_120(net.minecraft.world.storage.WorldInfo a0, net.minecraft.world.EnumDifficulty a1) throws Throwable;
private static native boolean __call589_121(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native int __integerCategory589_122(boolean value) throws Throwable;
private static native boolean __call589_123(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite589_124(net.minecraft.world.storage.WorldInfo a0, boolean a1) throws Throwable;
private static native int __invokedynamic589_125(int a0, long a1) throws Throwable;
private static native boolean __call589_126(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native int __integerCategory589_127(boolean value) throws Throwable;
private static native double __call589_128(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite589_129(net.minecraft.world.storage.WorldInfo a0, double a1) throws Throwable;
private static native int __invokedynamic589_130(int a0, long a1) throws Throwable;
private static native boolean __call589_131(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native int __integerCategory589_132(boolean value) throws Throwable;
private static native double __call589_133(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite589_134(net.minecraft.world.storage.WorldInfo a0, double a1) throws Throwable;
private static native int __invokedynamic589_135(int a0, long a1) throws Throwable;
private static native boolean __call589_136(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native int __integerCategory589_137(boolean value) throws Throwable;
private static native double __call589_138(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite589_139(net.minecraft.world.storage.WorldInfo a0, double a1) throws Throwable;
private static native int __invokedynamic589_140(int a0, long a1) throws Throwable;
private static native boolean __call589_141(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native int __integerCategory589_142(boolean value) throws Throwable;
private static native long __call589_143(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite589_144(net.minecraft.world.storage.WorldInfo a0, long a1) throws Throwable;
private static native int __invokedynamic589_145(int a0, long a1) throws Throwable;
private static native boolean __call589_146(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native int __integerCategory589_147(boolean value) throws Throwable;
private static native double __call589_148(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite589_149(net.minecraft.world.storage.WorldInfo a0, double a1) throws Throwable;
private static native int __invokedynamic589_150(int a0, long a1) throws Throwable;
private static native boolean __call589_151(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native int __integerCategory589_152(boolean value) throws Throwable;
private static native double __call589_153(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite589_154(net.minecraft.world.storage.WorldInfo a0, double a1) throws Throwable;
private static native int __invokedynamic589_155(int a0, long a1) throws Throwable;
private static native boolean __call589_156(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native int __integerCategory589_157(boolean value) throws Throwable;
private static native double __call589_158(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite589_159(net.minecraft.world.storage.WorldInfo a0, double a1) throws Throwable;
private static native int __invokedynamic589_160(int a0, long a1) throws Throwable;
private static native boolean __call589_161(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native int __integerCategory589_162(boolean value) throws Throwable;
private static native int __call589_163(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite589_164(net.minecraft.world.storage.WorldInfo a0, int a1) throws Throwable;
private static native int __invokedynamic589_165(int a0, long a1) throws Throwable;
private static native boolean __call589_166(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native int __integerCategory589_167(boolean value) throws Throwable;
private static native int __call589_168(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite589_169(net.minecraft.world.storage.WorldInfo a0, int a1) throws Throwable;
private static native java.lang.Throwable __call3058900_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3058901_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3058902_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3058903_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3058904_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3058905_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3058906_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3058907_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3058908_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3058909_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3058910_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3058911_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3058912_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3058913_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3058914_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3058915_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3058916_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3058917_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3058918_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3058919_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3058920_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3058921_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3058922_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3058923_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3058924_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3058925_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3058926_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3058927_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3058928_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3058929_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3058930_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3058931_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3058932_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3058933_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3058934_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3058935_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3058936_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3058937_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3058938_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3058939_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3058940_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3058941_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3058942_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3058943_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3058944_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3058945_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_269f9ab2bf012868ff24(net.minecraft.world.storage.WorldInfo a0, net.minecraft.nbt.NBTTagCompound a1, net.minecraft.nbt.NBTTagCompound a2) throws E;
private static final class __SourceHandler_269f9ab2bf012868ff24 {

public static void f1854(net.minecraft.world.storage.WorldInfo receiver, net.minecraft.nbt.NBTTagCompound p0, net.minecraft.nbt.NBTTagCompound p1) throws Throwable {
    net.minecraft.nbt.NBTTagCompound forwardValue1854_198_0;
    java.lang.String spill1854_0;
    net.minecraft.nbt.NBTTagCompound spill1854_1;
    long life3_3;
    java.lang.String life5_68;
    forward_join_201: {
    forward_join_198: {
    forward_join_193: {
    forward_join_182: {
    life3_3 = (__fieldRead1854_0() ^ 120954081497395L);
    __call1854_2(p0, "RandomSeed", __fieldRead1854_1(receiver));
    __call1854_5(p0, "generatorName", __call1854_4(__fieldRead1854_3(receiver)));
    __call1854_8(p0, "generatorVersion", __call1854_7(__fieldRead1854_6(receiver)));
    __call1854_10(p0, "generatorOptions", __fieldRead1854_9(receiver));
    __call1854_13(p0, "GameType", __call1854_12(__fieldRead1854_11(receiver)));
    __call1854_15(p0, "MapFeatures", __fieldRead1854_14(receiver));
    __call1854_17(p0, "SpawnX", __fieldRead1854_16(receiver));
    __call1854_19(p0, "SpawnY", __fieldRead1854_18(receiver));
    __call1854_21(p0, "SpawnZ", __fieldRead1854_20(receiver));
    spill1854_0 = __call1854_22();
    __call1854_24(p0, "Time", __fieldRead1854_23(receiver));
    __call1854_26(p0, "DayTime", __fieldRead1854_25(receiver));
    __call1854_28(p0, "SizeOnDisk", __fieldRead1854_27(receiver));
    life5_68 = spill1854_0;
    __call1854_30(p0, "LastPlayed", __call1854_29());
    __call1854_32(p0, "LevelName", __fieldRead1854_31(receiver));
    __call1854_34(p0, "version", __fieldRead1854_33(receiver));
    __call1854_36(p0, "clearWeatherTime", __fieldRead1854_35(receiver));
    __call1854_38(p0, "rainTime", __fieldRead1854_37(receiver));
    __call1854_40(p0, "raining", __fieldRead1854_39(receiver));
    __call1854_42(p0, "thunderTime", __fieldRead1854_41(receiver));
    __call1854_44(p0, "thundering", __fieldRead1854_43(receiver));
    __call1854_46(p0, "hardcore", __fieldRead1854_45(receiver));
    __call1854_48(p0, "allowCommands", __fieldRead1854_47(receiver));
    __call1854_50(p0, "initialized", __fieldRead1854_49(receiver));
    __call1854_52(p0, "BorderCenterX", __fieldRead1854_51(receiver));
    __call1854_54(p0, "BorderCenterZ", __fieldRead1854_53(receiver));
    __call1854_56(p0, "BorderSize", __fieldRead1854_55(receiver));
    __call1854_58(p0, "BorderSizeLerpTime", __fieldRead1854_57(receiver));
    __call1854_60(p0, "BorderSafeZone", __fieldRead1854_59(receiver));
    __call1854_62(p0, "BorderDamagePerBlock", __fieldRead1854_61(receiver));
    __call1854_64(p0, "BorderSizeLerpTarget", __fieldRead1854_63(receiver));
    __call1854_66(p0, "BorderWarningBlocks", ((double) __fieldRead1854_65(receiver)));
    __call1854_68(p0, "BorderWarningTime", ((double) __fieldRead1854_67(receiver)));
    if (!((life5_68 != null))) {
        break forward_join_193;
    }
    if (!((__fieldRead1854_69(receiver) != null))) {
        break forward_join_182;
    }
    __call1854_72(p0, "Difficulty", ((byte) __call1854_71(__fieldRead1854_70(receiver))));
    }
    __call1854_74(p0, "DifficultyLocked", __fieldRead1854_73(receiver));
    __call1854_77(p0, "GameRules", __call1854_76(__fieldRead1854_75(receiver)));
    }
    spill1854_1 = p1;
    if (!((life5_68 != null))) {
        forwardValue1854_198_0 = spill1854_1;
        break forward_join_198;
    }
    if (!((spill1854_1 != null))) {
        break forward_join_201;
    }
    forwardValue1854_198_0 = p0;
    }
    __call1854_78(forwardValue1854_198_0, "Player", p1);
    }
    return;
}
public static void h1854_0(moom.Oo p0) throws Throwable {
    throw __call1185400_0(p0);
}
public static void h1854_1(moom.Oo p0) throws Throwable {
    throw __call1185401_0(p0);
}
public static void h1854_2(moom.Oo p0) throws Throwable {
    throw __call1185402_0(p0);
}
private static native long __fieldRead1854_0() throws Throwable;
private static native long __fieldRead1854_1(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native void __call1854_2(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, long a2) throws Throwable;
private static native net.minecraft.world.WorldType __fieldRead1854_3(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native java.lang.String __call1854_4(net.minecraft.world.WorldType a0) throws Throwable;
private static native void __call1854_5(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native net.minecraft.world.WorldType __fieldRead1854_6(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native int __call1854_7(net.minecraft.world.WorldType a0) throws Throwable;
private static native void __call1854_8(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native java.lang.String __fieldRead1854_9(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native void __call1854_10(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native net.minecraft.world.WorldSettings$GameType __fieldRead1854_11(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native int __call1854_12(net.minecraft.world.WorldSettings$GameType a0) throws Throwable;
private static native void __call1854_13(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native boolean __fieldRead1854_14(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native void __call1854_15(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, boolean a2) throws Throwable;
private static native int __fieldRead1854_16(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native void __call1854_17(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native int __fieldRead1854_18(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native void __call1854_19(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native int __fieldRead1854_20(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native void __call1854_21(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native java.lang.String __call1854_22() throws Throwable;
private static native long __fieldRead1854_23(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native void __call1854_24(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, long a2) throws Throwable;
private static native long __fieldRead1854_25(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native void __call1854_26(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, long a2) throws Throwable;
private static native long __fieldRead1854_27(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native void __call1854_28(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, long a2) throws Throwable;
private static native long __call1854_29() throws Throwable;
private static native void __call1854_30(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, long a2) throws Throwable;
private static native java.lang.String __fieldRead1854_31(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native void __call1854_32(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native int __fieldRead1854_33(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native void __call1854_34(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native int __fieldRead1854_35(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native void __call1854_36(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native int __fieldRead1854_37(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native void __call1854_38(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native boolean __fieldRead1854_39(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native void __call1854_40(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, boolean a2) throws Throwable;
private static native int __fieldRead1854_41(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native void __call1854_42(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native boolean __fieldRead1854_43(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native void __call1854_44(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, boolean a2) throws Throwable;
private static native boolean __fieldRead1854_45(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native void __call1854_46(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, boolean a2) throws Throwable;
private static native boolean __fieldRead1854_47(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native void __call1854_48(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, boolean a2) throws Throwable;
private static native boolean __fieldRead1854_49(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native void __call1854_50(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, boolean a2) throws Throwable;
private static native double __fieldRead1854_51(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native void __call1854_52(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, double a2) throws Throwable;
private static native double __fieldRead1854_53(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native void __call1854_54(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, double a2) throws Throwable;
private static native double __fieldRead1854_55(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native void __call1854_56(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, double a2) throws Throwable;
private static native long __fieldRead1854_57(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native void __call1854_58(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, long a2) throws Throwable;
private static native double __fieldRead1854_59(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native void __call1854_60(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, double a2) throws Throwable;
private static native double __fieldRead1854_61(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native void __call1854_62(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, double a2) throws Throwable;
private static native double __fieldRead1854_63(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native void __call1854_64(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, double a2) throws Throwable;
private static native int __fieldRead1854_65(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native void __call1854_66(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, double a2) throws Throwable;
private static native int __fieldRead1854_67(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native void __call1854_68(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, double a2) throws Throwable;
private static native net.minecraft.world.EnumDifficulty __fieldRead1854_69(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native net.minecraft.world.EnumDifficulty __fieldRead1854_70(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native int __call1854_71(net.minecraft.world.EnumDifficulty a0) throws Throwable;
private static native void __call1854_72(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, byte a2) throws Throwable;
private static native boolean __fieldRead1854_73(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native void __call1854_74(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, boolean a2) throws Throwable;
private static native net.minecraft.world.GameRules __fieldRead1854_75(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call1854_76(net.minecraft.world.GameRules a0) throws Throwable;
private static native void __call1854_77(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, net.minecraft.nbt.NBTTagCompound a2) throws Throwable;
private static native void __call1854_78(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, net.minecraft.nbt.NBTTagCompound a2) throws Throwable;
private static native java.lang.Throwable __call1185400_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1185401_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1185402_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_80a65d79a784d509d44e(net.minecraft.world.storage.WorldInfo a0) throws E;
private static final class __SourceHandler_80a65d79a784d509d44e {

public static java.lang.String f742(net.minecraft.world.storage.WorldInfo receiver) throws Throwable {
    java.lang.String spill742_0;
    java.lang.String spill742_1;
    java.lang.Object[] spill742_2;
    java.lang.Object[] spill742_3;
    long life1_3;
    java.lang.String life4_6;
    java.lang.String life3_7;
    forward_join_19: {
    forward_join_17: {
    forward_join_15: {
    forward_join_13: {
    life1_3 = (__fieldRead742_0() ^ 122545522658912L);
    spill742_0 = __call742_1();
    life4_6 = "Unknown?";
    life3_7 = spill742_0;
    if (!((life3_7 != null))) {
        break forward_join_15;
    }
    switch (__fieldRead742_2(receiver)) {
case 19132:
{
        break forward_join_13;
    }
case 19133:
{
        break forward_join_17;
    }
default:
{
        break forward_join_19;
    }
}
    }
    life4_6 = "McRegion";
    }
    if (!((life3_7 == null))) {
        break forward_join_19;
    }
    }
    life4_6 = "Anvil";
    }
    spill742_1 = "0x%05X - %s";
    java.lang.Object[] __stackOp742_3_0 = new java.lang.Object[2];
    spill742_2 = __stackOp742_3_0;
    (__stackOp742_3_0)[0] = __call742_5(__fieldRead742_4(receiver));
    java.lang.Object[] __stackOp742_6_0 = spill742_2;
    spill742_3 = __stackOp742_6_0;
    (__stackOp742_6_0)[1] = life4_6;
    return __call742_7(spill742_1, spill742_3);
}
public static java.lang.String h742_0(java.lang.Throwable p0) throws Throwable {
    throw __call2074200_0(p0);
}
public static java.lang.String h742_1(java.lang.Throwable p0, net.minecraft.world.storage.WorldInfo p1, java.lang.String p2) throws Throwable {
    java.lang.Throwable local3 = p0;
    java.lang.String spill2074201_0 = "0x%05X - %s";
    java.lang.Object[] __stackOp2074201_0_0 = new java.lang.Object[2];
    java.lang.Object[] spill2074201_1 = __stackOp2074201_0_0;
    (__stackOp2074201_0_0)[0] = __call2074201_2(__fieldRead2074201_1(p1));
    java.lang.Object[] __stackOp2074201_3_0 = spill2074201_1;
    java.lang.Object[] spill2074201_2 = __stackOp2074201_3_0;
    (__stackOp2074201_3_0)[1] = p2;
    return __call2074201_4(spill2074201_0, spill2074201_2);
}
private static native long __fieldRead742_0() throws Throwable;
private static native java.lang.String __call742_1() throws Throwable;
private static native int __fieldRead742_2(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native int __fieldRead742_4(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native java.lang.Integer __call742_5(int a0) throws Throwable;
private static native java.lang.String __call742_7(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native java.lang.Throwable __call2074200_0(java.lang.Throwable a0) throws Throwable;
private static native int __fieldRead2074201_1(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native java.lang.Integer __call2074201_2(int a0) throws Throwable;
private static native java.lang.String __call2074201_4(java.lang.String a0, java.lang.Object[] a1) throws Throwable;

}


public void i(int p0) {
this.J = ((int)(p0));
    return;
}


public int i() {
return this.J;
}


public void b(boolean p0) {
this.q = ((boolean)(p0));
    return;
}


public boolean b__Boolean() {
return ((((this.q) ? 1 : 0)) != 0);
}


public void b(long p0) {
this.i = ((long)(p0));
    return;
}


public void b(int p0) {
this.f = ((int)(p0));
    return;
}


public net.minecraft.nbt.NBTTagCompound b__yw() {
return this.l;
}


public static void b(java.lang.String p0) {
L = ((java.lang.String)(p0));
    return;
}


public void b(double p0) {
this.F = ((double)(p0));
    return;
}


public double b() {
return this.C;
}


public java.lang.String b__String() {
return this.d;
}


public int b__Int() {
return this.f;
}


public long b__Long() {
return this.h;
}


public boolean e__Boolean() {
return ((((this.x) ? 1 : 0)) != 0);
}


public void e(int p0) {
this.p = ((int)(p0));
    return;
}


public int e__Int() {
return this.p;
}


public long e__Long() {
return this.j;
}


public double e() {
return this.G;
}


public void e(double p0) {
this.G = ((double)(p0));
    return;
}


public void e(boolean p0) {
this.x = ((boolean)(p0));
    return;
}


public void c(double p0) {
this.C = ((double)(p0));
    return;
}


public void c(long p0) {
this.E = ((long)(p0));
    return;
}


public void c(boolean p0) {
this.v = ((boolean)(p0));
    return;
}


public boolean c__Boolean() {
return ((((this.v) ? 1 : 0)) != 0);
}


public int c__Int() {
return this.g;
}


public void c(int p0) {
this.g = ((int)(p0));
    return;
}


public long c__Long() {
return this.i;
}


public double c() {
return this.D;
}


public static java.lang.String c__String() {
return net.minecraft.world.storage.WorldInfo.L;
}


public int h() {
return this.I;
}


public void h(int p0) {
this.I = ((int)(p0));
    return;
}


public boolean f__Boolean() {
return ((((this.y) ? 1 : 0)) != 0);
}


public double f() {
return this.H;
}


public long f__Long() {
return this.E;
}


public void f(int p0) {
this.t = ((int)(p0));
    return;
}


public int f__Int() {
return this.t;
}


public void f(double p0) {
this.H = ((double)(p0));
    return;
}


public void f(boolean p0) {
this.y = ((boolean)(p0));
    return;
}


public void d(double p0) {
this.B = ((double)(p0));
    return;
}


public double d() {
return this.F;
}


public int d__Int() {
return this.o;
}


public long d__Long() {
return this.k;
}


public void d(int p0) {
this.o = ((int)(p0));
    return;
}


public void d(boolean p0) {
this.w = ((boolean)(p0));
    return;
}


public boolean d__Boolean() {
return ((((this.w) ? 1 : 0)) != 0);
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral12762_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/IX"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(moom.EK p0) {
this.b = ((long)(((moom.EK)(p0)).a()));
    this.u = ((net.minecraft.world.WorldSettings$GameType)(((moom.EK)(p0)).a__bE()));
    this.v = ((boolean)(((moom.EK)(p0)).c()));
    this.w = ((boolean)(((moom.EK)(p0)).b__Boolean()));
    this.c = ((net.minecraft.world.WorldType)(((moom.EK)(p0)).a__EL()));
    this.d = ((java.lang.String)(((moom.EK)(p0)).a__String()));
    this.x = ((boolean)(((moom.EK)(p0)).d()));
    return;
}


public net.minecraft.world.EnumDifficulty a__bB() {
return this.z;
}


private static java.lang.Throwable a(java.lang.Throwable p0) {
return p0;
}


public void a(net.minecraft.world.EnumDifficulty p0) {
this.z = ((net.minecraft.world.EnumDifficulty)(p0));
    return;
}


public void a(moom.qZ p0) {
((moom.qZ)(p0)).a(((java.lang.String)("Level seed")), ((java.util.concurrent.Callable)(__sourceIntrinsic_5757476ef67c_originalDynamicSite2083_0(this))));
    ((moom.qZ)(p0)).a(((java.lang.String)("Level generator")), ((java.util.concurrent.Callable)(__sourceIntrinsic_5757476ef67c_originalDynamicSite2083_2(this))));
    ((moom.qZ)(p0)).a(((java.lang.String)("Level generator options")), ((java.util.concurrent.Callable)(__sourceIntrinsic_5757476ef67c_originalDynamicSite2083_4(this))));
    ((moom.qZ)(p0)).a(((java.lang.String)("Level spawn location")), ((java.util.concurrent.Callable)(__sourceIntrinsic_5757476ef67c_originalDynamicSite2083_6(this))));
    ((moom.qZ)(p0)).a(((java.lang.String)("Level time")), ((java.util.concurrent.Callable)(__sourceIntrinsic_5757476ef67c_originalDynamicSite2083_8(this))));
    ((moom.qZ)(p0)).a(((java.lang.String)("Level dimension")), ((java.util.concurrent.Callable)(__sourceIntrinsic_5757476ef67c_originalDynamicSite2083_10(this))));
    ((moom.qZ)(p0)).a(((java.lang.String)("Level storage version")), ((java.util.concurrent.Callable)(__sourceIntrinsic_5757476ef67c_originalDynamicSite2083_12(this))));
    ((moom.qZ)(p0)).a(((java.lang.String)("Level weather")), ((java.util.concurrent.Callable)(__sourceIntrinsic_5757476ef67c_originalDynamicSite2083_14(this))));
    ((moom.qZ)(p0)).a(((java.lang.String)("Level game mode")), ((java.util.concurrent.Callable)(__sourceIntrinsic_5757476ef67c_originalDynamicSite2083_16(this))));
    return;
}


public net.minecraft.nbt.NBTTagCompound a__yw() {
net.minecraft.nbt.NBTTagCompound local1 = new net.minecraft.nbt.NBTTagCompound();
    ((net.minecraft.world.storage.WorldInfo)(this)).a(((net.minecraft.nbt.NBTTagCompound)(local1)), ((net.minecraft.nbt.NBTTagCompound)(this.l)));
    return local1;
}


private void a(net.minecraft.nbt.NBTTagCompound p0, net.minecraft.nbt.NBTTagCompound p1) { __sourceHandlerCall_269f9ab2bf012868ff24(this, p0, p1); }


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.world.storage.WorldInfo.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 27764;
      if (P[var3] == null) {
         byte[] var4 = new byte[]{
            (byte)(p1 >>> 56),
            (byte)(p1 >>> 48),
            (byte)(p1 >>> 40),
            (byte)(p1 >>> 32),
            (byte)(p1 >>> 24),
            (byte)(p1 >>> 16),
            (byte)(p1 >>> 8),
            (byte)p1
         };
         long var5 = O[var3];
         byte[] var7 = new byte[]{
            (byte)(var5 >>> 56),
            (byte)(var5 >>> 48),
            (byte)(var5 >>> 40),
            (byte)(var5 >>> 32),
            (byte)(var5 >>> 24),
            (byte)(var5 >>> 16),
            (byte)(var5 >>> 8),
            (byte)var5
         };
         Long var8 = Thread.currentThread().getId();
         Object[] var9 = (Object[])Q.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               Q.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/IX", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         P[var3] = var15;
      }

      return P[var3];
}


public net.minecraft.nbt.NBTTagCompound a(net.minecraft.nbt.NBTTagCompound p0) {
net.minecraft.nbt.NBTTagCompound local2 = new net.minecraft.nbt.NBTTagCompound();
    ((net.minecraft.world.storage.WorldInfo)(this)).a(((net.minecraft.nbt.NBTTagCompound)(local2)), ((net.minecraft.nbt.NBTTagCompound)(p0)));
    return local2;
}


public void a(boolean p0) {
this.s = ((boolean)(p0));
    return;
}


public void a(long p0) {
this.h = ((long)(p0));
    return;
}


public net.minecraft.world.WorldSettings$GameType a__bE() {
return this.u;
}


public void a(net.minecraft.world.WorldSettings$GameType p0) {
this.u = ((net.minecraft.world.WorldSettings$GameType)(p0));
    return;
}


public void a(moom.DT p0) {
this.e = ((int)(((moom.DT)(p0)).a()));
    this.f = ((int)(((moom.DT)(p0)).b()));
    this.g = ((int)(((moom.DT)(p0)).c()));
    return;
}


public java.lang.String a__String() {
return this.n;
}


public void a(java.lang.String p0) {
this.n = ((java.lang.String)(p0));
    return;
}


public boolean a__Boolean() {
return ((((this.s) ? 1 : 0)) != 0);
}


public long a__Long() {
return this.b;
}


public net.minecraft.world.GameRules a__Ej() {
return this.K;
}


public void a(double p0) {
this.D = ((double)(p0));
    return;
}


public void a(int p0) {
this.e = ((int)(p0));
    return;
}


public int a__Int() {
return this.e;
}


public double a() {
return this.B;
}


public net.minecraft.world.WorldType a__EL() {
return this.c;
}


public void a(net.minecraft.world.WorldType p0) {
this.c = ((net.minecraft.world.WorldType)(p0));
    return;
}


public int g() {
return this.r;
}


public void g(int p0) {
this.r = ((int)(p0));
    return;
}


public boolean g__Boolean() {
return ((((this.A) ? 1 : 0)) != 0);
}


public void g(boolean p0) {
this.A = ((boolean)(p0));
    return;
}


private java.lang.String lambda$addToCrashReport$3() throws java.lang.Exception {
return moom.qZ.a(((double)(((double) this.e))), ((double)(((double) this.f))), ((double)(((double) this.g))));
}


private java.lang.String lambda$addToCrashReport$2() throws java.lang.Exception {
return this.d;
}


private java.lang.String lambda$addToCrashReport$8() throws java.lang.Exception {
return java.lang.String.format(((java.lang.String)("Game mode: %s (ID %d). Hardcore: %b. Cheats: %b")), ((java.lang.Object[])(new java.lang.Object[] {((net.minecraft.world.WorldSettings$GameType)(this.u)).a__String(), java.lang.Integer.valueOf(((int)(((net.minecraft.world.WorldSettings$GameType)(this.u)).a()))), java.lang.Boolean.valueOf(((boolean)(this.w))), java.lang.Boolean.valueOf(((boolean)(this.x)))})));
}


private java.lang.String lambda$addToCrashReport$7() throws java.lang.Exception {
return java.lang.String.format(((java.lang.String)("Rain time: %d (now: %b), thunder time: %d (now: %b)")), ((java.lang.Object[])(new java.lang.Object[] {java.lang.Integer.valueOf(((int)(this.r))), java.lang.Boolean.valueOf(((boolean)(this.q))), java.lang.Integer.valueOf(((int)(this.t))), java.lang.Boolean.valueOf(((boolean)(this.s)))})));
}


private java.lang.String lambda$addToCrashReport$5() throws java.lang.Exception {
return java.lang.String.valueOf(((int)(this.m)));
}


private java.lang.String lambda$addToCrashReport$0() throws java.lang.Exception {
return java.lang.String.valueOf(((long)(((net.minecraft.world.storage.WorldInfo)(this)).a__Long())));
}


private java.lang.String lambda$addToCrashReport$6() throws java.lang.Exception { return __sourceHandlerCall_80a65d79a784d509d44e(this); }


private java.lang.String lambda$addToCrashReport$1() throws java.lang.Exception {
return java.lang.String.format(((java.lang.String)("ID %02d - %s, ver %d. Features enabled: %b")), ((java.lang.Object[])(new java.lang.Object[] {java.lang.Integer.valueOf(((int)(((net.minecraft.world.WorldType)(this.c)).b()))), ((net.minecraft.world.WorldType)(this.c)).a__String(), java.lang.Integer.valueOf(((int)(((net.minecraft.world.WorldType)(this.c)).a()))), java.lang.Boolean.valueOf(((boolean)(this.v)))})));
}


private java.lang.String lambda$addToCrashReport$4() throws java.lang.Exception {
return java.lang.String.format(((java.lang.String)("%d game time, %d day time")), ((java.lang.Object[])(new java.lang.Object[] {java.lang.Long.valueOf(((long)(this.h))), java.lang.Long.valueOf(((long)(this.i)))})));
}


private static native <E extends Throwable> int __sourceIntrinsic_786ebcb1558df60a_originalDynamicSite4049_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_786ebcb1558df60a_originalDynamicSite4049_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a53e6558f6d5e912_originalDynamicSite4047_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a53e6558f6d5e912_originalDynamicSite4047_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_173a45f5e813d048_originalDynamicSite885_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_173a45f5e813d048_originalDynamicSite885_21(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral12762_0() throws E;

private static native <E extends Throwable> java.util.concurrent.Callable __sourceIntrinsic_5757476ef67c_originalDynamicSite2083_0(net.minecraft.world.storage.WorldInfo a0) throws E;

private static native <E extends Throwable> java.util.concurrent.Callable __sourceIntrinsic_5757476ef67c_originalDynamicSite2083_2(net.minecraft.world.storage.WorldInfo a0) throws E;

private static native <E extends Throwable> java.util.concurrent.Callable __sourceIntrinsic_5757476ef67c_originalDynamicSite2083_4(net.minecraft.world.storage.WorldInfo a0) throws E;

private static native <E extends Throwable> java.util.concurrent.Callable __sourceIntrinsic_5757476ef67c_originalDynamicSite2083_6(net.minecraft.world.storage.WorldInfo a0) throws E;

private static native <E extends Throwable> java.util.concurrent.Callable __sourceIntrinsic_5757476ef67c_originalDynamicSite2083_8(net.minecraft.world.storage.WorldInfo a0) throws E;

private static native <E extends Throwable> java.util.concurrent.Callable __sourceIntrinsic_5757476ef67c_originalDynamicSite2083_10(net.minecraft.world.storage.WorldInfo a0) throws E;

private static native <E extends Throwable> java.util.concurrent.Callable __sourceIntrinsic_5757476ef67c_originalDynamicSite2083_12(net.minecraft.world.storage.WorldInfo a0) throws E;

private static native <E extends Throwable> java.util.concurrent.Callable __sourceIntrinsic_5757476ef67c_originalDynamicSite2083_14(net.minecraft.world.storage.WorldInfo a0) throws E;

private static native <E extends Throwable> java.util.concurrent.Callable __sourceIntrinsic_5757476ef67c_originalDynamicSite2083_16(net.minecraft.world.storage.WorldInfo a0) throws E;
}
