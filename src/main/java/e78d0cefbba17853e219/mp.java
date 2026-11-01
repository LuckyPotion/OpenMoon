package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class mp {

private net.minecraft.world.World a;

private net.minecraft.client.renderer.RenderGlobal b;

public static int c;

private moom.DT d;

public net.minecraft.client.renderer.chunk.CompiledChunk e;

private java.util.concurrent.locks.ReentrantLock f;

private java.util.concurrent.locks.ReentrantLock g;

private net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator h;

private java.util.Set<net.minecraft.tileentity.TileEntity> i;

private int j;

private java.nio.FloatBuffer k;

private moom.oC[] l;

public moom.CA m;

private int n;

private boolean o;

private java.util.EnumMap<moom.bs, moom.DT> p;

private moom.DT[] q;

public static net.minecraft.util.EnumWorldBlockLayer[] r;

private net.minecraft.util.EnumWorldBlockLayer[] s;

private boolean t;

private boolean u;

public int v;

public int w;

private moom.mp[] x;

private boolean y;

private net.minecraft.world.chunk.Chunk z;

private moom.mp[] A;

private moom.mp[] B;

private boolean C;

private moom.ls D;

public moom.CB E;

private static int F;

private static long H;

private static long[] I;

private static java.lang.Integer[] J;

private static java.util.Map K;

public mp(net.minecraft.world.World p0, net.minecraft.client.renderer.RenderGlobal p1, moom.DT p2, int p3) { super(); }

private static void __sourceConstructorBody_69b827d4dc8959a8(moom.mp receiver, net.minecraft.world.World p0, net.minecraft.client.renderer.RenderGlobal p1, moom.DT p2, int p3) throws Throwable {
long life5_3;
    int life7_114;
    forest_join_129: {
    forest_join_111: {
    life5_3 = (moom.mp.H ^ 16329813400721L);
    moom.mp.__sourceConstructorInit_69b827d4dc8959a8_0(((moom.mp)(receiver)));
    ((moom.mp)(receiver)).e = ((net.minecraft.client.renderer.chunk.CompiledChunk)(net.minecraft.client.renderer.chunk.CompiledChunk.a));
    ((moom.mp)(receiver)).f = ((java.util.concurrent.locks.ReentrantLock)(new java.util.concurrent.locks.ReentrantLock()));
    ((moom.mp)(receiver)).g = ((java.util.concurrent.locks.ReentrantLock)(new java.util.concurrent.locks.ReentrantLock()));
    ((moom.mp)(receiver)).h = ((net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator)(null));
    ((moom.mp)(receiver)).i = ((java.util.Set)(com.google.common.collect.Sets.newHashSet()));
    ((moom.mp)(receiver)).k = ((java.nio.FloatBuffer)(net.minecraft.client.renderer.GLAllocation.a__FloatBuffer(((int)(__sourceIntrinsic_69b827d4dc8959a8_invokedynamic483_9(16728, (7374509088395269909L ^ life5_3)))))));
    ((moom.mp)(receiver)).l = ((moom.oC[])(new moom.oC[(net.minecraft.util.EnumWorldBlockLayer.values()).length]));
    ((moom.mp)(receiver)).n = ((int)(-1));
    ((moom.mp)(receiver)).o = ((boolean)(true));
    ((moom.mp)(receiver)).p = ((java.util.EnumMap)(null));
    ((moom.mp)(receiver)).q = ((moom.DT[])(new moom.DT[(moom.bs.VALUES).length]));
    ((moom.mp)(receiver)).s = ((net.minecraft.util.EnumWorldBlockLayer[])(new net.minecraft.util.EnumWorldBlockLayer[1]));
    ((moom.mp)(receiver)).t = ((boolean)(moom.BU.d__Boolean()));
    ((moom.mp)(receiver)).u = ((boolean)(false));
    ((moom.mp)(receiver)).x = ((moom.mp[])(new moom.mp[__sourceIntrinsic_69b827d4dc8959a8_invokedynamic483_23(17367, (7227163259357369749L ^ life5_3))]));
    ((moom.mp)(receiver)).y = ((boolean)(false));
    ((moom.mp)(receiver)).A = ((moom.mp[])(new moom.mp[(moom.bs.VALUES).length]));
    ((moom.mp)(receiver)).B = ((moom.mp[])(new moom.mp[(moom.bs.VALUES).length]));
    ((moom.mp)(receiver)).C = ((boolean)(false));
    ((moom.mp)(receiver)).D = ((moom.ls)(new moom.ls(receiver, null, 0)));
    ((moom.mp)(receiver)).a = ((net.minecraft.world.World)(p0));
    ((moom.mp)(receiver)).b = ((net.minecraft.client.renderer.RenderGlobal)(p1));
    ((moom.mp)(receiver)).j = ((int)(p3));
    if (!((!((moom.DT)(p2)).equals(((java.lang.Object)(((moom.mp)(receiver)).a__DT())))))) {
        break forest_join_111;
    }
    ((moom.mp)(receiver)).a__Void(((moom.DT)(p2)));
    }
    if (!(net.minecraft.client.renderer.OpenGlHelper.b__Boolean())) {
        break forest_join_129;
    }
    life7_114 = 0;
    forest_cycle_115: while (true) {
    if (!((life7_114 < (net.minecraft.util.EnumWorldBlockLayer.values()).length))) {
        break forest_join_129;
    }
    (((moom.mp)(receiver)).l)[life7_114] = new moom.oC(moom.oB.a);
    life7_114 += 1;
    continue forest_cycle_115;
    }
    }
    return;
}


static {
H = ((long)(((moom._a)(moom._c.a(((long)(17542043013886020L)), ((long)(-2474492912143452275L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(221590915362548L)))));
    int __sourceSpill1408_6 = 25;
    K = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life8 = (moom.mp.H ^ 17668546732558L);
    moom.mp.b(((int)(__sourceSpill1408_6)));
    javax.crypto.Cipher local2_life11;
    javax.crypto.Cipher __sourceSpill1408_13 = (local2_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1408_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1408_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1408_16 = new byte[8];
    (__sourceSpill1408_16)[0] = ((byte) ((int) (local0_life8 >>> 56)));
    int local3_life17 = 1;
    while ((local3_life17 < 8)) {
        (__sourceSpill1408_16)[local3_life17] = ((byte) ((int) ((local0_life8 << (local3_life17 * 8)) >>> 56)));
        local3_life17 += 1;
    }
    byte[] __sourcePreallocation1408_18 = __sourceSpill1408_16;
    ((javax.crypto.Cipher)(__sourceSpill1408_13)).init(((int)(__sourceSpill1408_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1408_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1408_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life21 = new long[9];
    int local5_life22 = 0;
    java.lang.String local6_life23;
    int local7_life25 = ((java.lang.String)((local6_life23 = "¾Q\003Õ\033þk\036Ø\0309ñàà\0339}ï°Ø/Í{h¢\034/ ½ÞGäwcû/n|6J0 C\f\007«+ÞG©Q\031"))).length();
    int local4_life26 = 0;
    do {
        java.lang.String __sourceSpill1408_27 = local6_life23;
        int __sourceSpill1408_28 = local4_life26;
        local4_life26 += 8;
        byte[] local9_life31 = ((java.lang.String)(((java.lang.String)(__sourceSpill1408_27)).substring(((int)(__sourceSpill1408_28)), ((int)(local4_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1408_32 = local8_life21;
        int __sourceSpill1408_33 = local5_life22;
        local5_life22 += 1;
        long local10_life34 = (((((((((((long) (local9_life31)[0]) & 255L) << 56) | ((((long) (local9_life31)[1]) & 255L) << 48)) | ((((long) (local9_life31)[2]) & 255L) << 40)) | ((((long) (local9_life31)[3]) & 255L) << 32)) | ((((long) (local9_life31)[4]) & 255L) << 24)) | ((((long) (local9_life31)[5]) & 255L) << 16)) | ((((long) (local9_life31)[6]) & 255L) << 8)) | (((long) (local9_life31)[7]) & 255L));
        byte[] __sourceSpill1408_35 = new byte[8];
        (__sourceSpill1408_35)[0] = ((byte) ((int) (local10_life34 >>> 56)));
        (__sourceSpill1408_35)[1] = ((byte) ((int) (local10_life34 >>> 48)));
        (__sourceSpill1408_35)[2] = ((byte) ((int) (local10_life34 >>> 40)));
        (__sourceSpill1408_35)[3] = ((byte) ((int) (local10_life34 >>> 32)));
        (__sourceSpill1408_35)[4] = ((byte) ((int) (local10_life34 >>> 24)));
        (__sourceSpill1408_35)[5] = ((byte) ((int) (local10_life34 >>> 16)));
        (__sourceSpill1408_35)[6] = ((byte) ((int) (local10_life34 >>> 8)));
        (__sourceSpill1408_35)[7] = ((byte) ((int) local10_life34));
        javax.crypto.Cipher __sourceSpill1408_36 = local2_life11;
        byte[] local12_life38 = ((javax.crypto.Cipher)(__sourceSpill1408_36)).doFinal(((byte[])(__sourceSpill1408_35)));
        (__sourceSpill1408_32)[__sourceSpill1408_33] = (((((((((((long) (local12_life38)[0]) & 255L) << 56) | ((((long) (local12_life38)[1]) & 255L) << 48)) | ((((long) (local12_life38)[2]) & 255L) << 40)) | ((((long) (local12_life38)[3]) & 255L) << 32)) | ((((long) (local12_life38)[4]) & 255L) << 24)) | ((((long) (local12_life38)[5]) & 255L) << 16)) | ((((long) (local12_life38)[6]) & 255L) << 8)) | (((long) (local12_life38)[7]) & 255L));
    } while ((!(local4_life26 >= local7_life25)));
    local7_life25 = ((java.lang.String)((local6_life23 = "@J\004\177yS³â<Ô®¾gQ"))).length();
    local4_life26 = 0;
    do {
        java.lang.String __sourceSpill1408_40 = local6_life23;
        int __sourceSpill1408_41 = local4_life26;
        local4_life26 += 8;
        byte[] local9_life44 = ((java.lang.String)(((java.lang.String)(__sourceSpill1408_40)).substring(((int)(__sourceSpill1408_41)), ((int)(local4_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1408_45 = local8_life21;
        int __sourceSpill1408_46 = local5_life22;
        local5_life22 += 1;
        long local10_life47 = (((((((((((long) (local9_life44)[0]) & 255L) << 56) | ((((long) (local9_life44)[1]) & 255L) << 48)) | ((((long) (local9_life44)[2]) & 255L) << 40)) | ((((long) (local9_life44)[3]) & 255L) << 32)) | ((((long) (local9_life44)[4]) & 255L) << 24)) | ((((long) (local9_life44)[5]) & 255L) << 16)) | ((((long) (local9_life44)[6]) & 255L) << 8)) | (((long) (local9_life44)[7]) & 255L));
        byte[] __sourceSpill1408_48 = new byte[8];
        (__sourceSpill1408_48)[0] = ((byte) ((int) (local10_life47 >>> 56)));
        (__sourceSpill1408_48)[1] = ((byte) ((int) (local10_life47 >>> 48)));
        (__sourceSpill1408_48)[2] = ((byte) ((int) (local10_life47 >>> 40)));
        (__sourceSpill1408_48)[3] = ((byte) ((int) (local10_life47 >>> 32)));
        (__sourceSpill1408_48)[4] = ((byte) ((int) (local10_life47 >>> 24)));
        (__sourceSpill1408_48)[5] = ((byte) ((int) (local10_life47 >>> 16)));
        (__sourceSpill1408_48)[6] = ((byte) ((int) (local10_life47 >>> 8)));
        (__sourceSpill1408_48)[7] = ((byte) ((int) local10_life47));
        javax.crypto.Cipher __sourceSpill1408_49 = local2_life11;
        byte[] local12_life51 = ((javax.crypto.Cipher)(__sourceSpill1408_49)).doFinal(((byte[])(__sourceSpill1408_48)));
        (__sourceSpill1408_45)[__sourceSpill1408_46] = (((((((((((long) (local12_life51)[0]) & 255L) << 56) | ((((long) (local12_life51)[1]) & 255L) << 48)) | ((((long) (local12_life51)[2]) & 255L) << 40)) | ((((long) (local12_life51)[3]) & 255L) << 32)) | ((((long) (local12_life51)[4]) & 255L) << 24)) | ((((long) (local12_life51)[5]) & 255L) << 16)) | ((((long) (local12_life51)[6]) & 255L) << 8)) | (((long) (local12_life51)[7]) & 255L));
    } while ((!(local4_life26 >= local7_life25)));
    I = ((long[])(local8_life21));
    J = ((java.lang.Integer[])(new java.lang.Integer[9]));
    r = ((net.minecraft.util.EnumWorldBlockLayer[])(net.minecraft.util.EnumWorldBlockLayer.values()));
}

private static native <E extends Throwable> void __sourceConstructorInit_69b827d4dc8959a8_0(moom.mp a0) throws E;
private static native <E extends Throwable> void __sourceHandlerCall_1c4ffc6997275405b786(moom.mp a0, net.minecraft.client.renderer.chunk.CompiledChunk a1) throws E;
private static final class __SourceHandler_1c4ffc6997275405b786 {

public static void f418(moom.mp receiver, net.minecraft.client.renderer.chunk.CompiledChunk p0) throws Throwable {
    __call418_1(__fieldRead418_0(receiver));
    __fieldWrite418_2(receiver, p0);
    __call418_4(__fieldRead418_3(receiver));
    return;
}
public static void h418_0(java.lang.Throwable p0, moom.mp p1) throws Throwable {
    java.lang.Throwable local2 = p0;
    __call2041800_1(__fieldRead2041800_0(p1));
    throw local2;
}
private static native java.util.concurrent.locks.ReentrantLock __fieldRead418_0(moom.mp a0) throws Throwable;
private static native void __call418_1(java.util.concurrent.locks.ReentrantLock a0) throws Throwable;
private static native void __fieldWrite418_2(moom.mp a0, net.minecraft.client.renderer.chunk.CompiledChunk a1) throws Throwable;
private static native java.util.concurrent.locks.ReentrantLock __fieldRead418_3(moom.mp a0) throws Throwable;
private static native void __call418_4(java.util.concurrent.locks.ReentrantLock a0) throws Throwable;
private static native java.util.concurrent.locks.ReentrantLock __fieldRead2041800_0(moom.mp a0) throws Throwable;
private static native void __call2041800_1(java.util.concurrent.locks.ReentrantLock a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_99c196da500f3ab2bc75(moom.mp a0) throws E;
private static final class __SourceHandler_99c196da500f3ab2bc75 {

public static void f419(moom.mp receiver) throws Throwable {
    __call419_1(__fieldRead419_0(receiver));
    if ((__fieldRead419_2(receiver) != null)) {
        if ((__call419_4(__fieldRead419_3(receiver)) != __fieldRead419_5())) {
        __call419_7(__fieldRead419_6(receiver));
        __fieldWrite419_8(receiver, null);
    }
    }
    __call419_10(__fieldRead419_9(receiver));
    return;
}
public static void h419_0(moom.Oo p0) throws Throwable {
    throw __call2041900_0(p0);
}
public static void h419_1(java.lang.Throwable p0, moom.mp p1) throws Throwable {
    java.lang.Throwable local2 = p0;
    __call2041901_1(__fieldRead2041901_0(p1));
    throw local2;
}
private static native java.util.concurrent.locks.ReentrantLock __fieldRead419_0(moom.mp a0) throws Throwable;
private static native void __call419_1(java.util.concurrent.locks.ReentrantLock a0) throws Throwable;
private static native net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator __fieldRead419_2(moom.mp a0) throws Throwable;
private static native net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator __fieldRead419_3(moom.mp a0) throws Throwable;
private static native net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator$Status __call419_4(net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator a0) throws Throwable;
private static native net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator$Status __fieldRead419_5() throws Throwable;
private static native net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator __fieldRead419_6(moom.mp a0) throws Throwable;
private static native void __call419_7(net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator a0) throws Throwable;
private static native void __fieldWrite419_8(moom.mp a0, java.lang.Object a1) throws Throwable;
private static native java.util.concurrent.locks.ReentrantLock __fieldRead419_9(moom.mp a0) throws Throwable;
private static native void __call419_10(java.util.concurrent.locks.ReentrantLock a0) throws Throwable;
private static native moom.Oo __call2041900_0(moom.Oo a0) throws Throwable;
private static native java.util.concurrent.locks.ReentrantLock __fieldRead2041901_0(moom.mp a0) throws Throwable;
private static native void __call2041901_1(java.util.concurrent.locks.ReentrantLock a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator __sourceHandlerCall_b60608e940907690c507(moom.mp a0) throws E;
private static final class __SourceHandler_b60608e940907690c507 {

public static net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator f420(moom.mp receiver) throws Throwable {
    net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator life1_14;
    __call420_1(__fieldRead420_0(receiver));
    __call420_2(receiver);
    __fieldWrite420_4(receiver, new net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator(receiver, __fieldRead420_3()));
    life1_14 = __fieldRead420_5(receiver);
    __call420_7(__fieldRead420_6(receiver));
    return life1_14;
}
public static net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator h420_0(java.lang.Throwable p0, moom.mp p1) throws Throwable {
    java.lang.Throwable local2 = p0;
    __call2042000_1(__fieldRead2042000_0(p1));
    throw local2;
}
private static native java.util.concurrent.locks.ReentrantLock __fieldRead420_0(moom.mp a0) throws Throwable;
private static native void __call420_1(java.util.concurrent.locks.ReentrantLock a0) throws Throwable;
private static native void __call420_2(moom.mp a0) throws Throwable;
private static native net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator$Type __fieldRead420_3() throws Throwable;
private static native void __fieldWrite420_4(moom.mp a0, net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator a1) throws Throwable;
private static native net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator __fieldRead420_5(moom.mp a0) throws Throwable;
private static native java.util.concurrent.locks.ReentrantLock __fieldRead420_6(moom.mp a0) throws Throwable;
private static native void __call420_7(java.util.concurrent.locks.ReentrantLock a0) throws Throwable;
private static native java.util.concurrent.locks.ReentrantLock __fieldRead2042000_0(moom.mp a0) throws Throwable;
private static native void __call2042000_1(java.util.concurrent.locks.ReentrantLock a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_b57cdbf8029b5f815e13(moom.mp a0, float a1, float a2, float a3, net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator a4) throws E;
private static final class __SourceHandler_b57cdbf8029b5f815e13 {

public static void f463(moom.mp receiver, float p0, float p1, float p2, net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator p3) throws Throwable {
    long life5_3;
    net.minecraft.client.renderer.chunk.CompiledChunk life7_7;
    int life8_9;
    moom.DT life9_15;
    moom.DT life10_33;
    moom.mt life11_55;
    java.util.HashSet life12_57;
    moom.L4 life13_69;
    boolean[] life14_75;
    net.minecraft.client.renderer.BlockRendererDispatcher life15_78;
    java.util.Iterator life16_83;
    moom.DX life17_90;
    net.minecraft.block.state.IBlockState life18_94;
    net.minecraft.block.Block life19_97;
    net.minecraft.tileentity.TileEntity life20_115;
    net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer life21_119;
    net.minecraft.util.EnumWorldBlockLayer[] life20_139;
    net.minecraft.util.EnumWorldBlockLayer[] life21_146;
    int life22_149;
    int life23_151;
    net.minecraft.util.EnumWorldBlockLayer life24_158;
    net.minecraft.util.EnumWorldBlockLayer life25_160;
    net.minecraft.util.EnumWorldBlockLayer life25_165;
    int life26_168;
    moom.lw life27_177;
    moom.Mi life28_185;
    net.minecraft.util.EnumWorldBlockLayer[] life16_231;
    int life17_234;
    int life18_236;
    net.minecraft.util.EnumWorldBlockLayer life19_243;
    moom.lw life20_270;
    java.util.HashSet life13_308;
    java.util.HashSet life14_312;
    forest_join_288: {
    forest_join_286: {
    forest_join_223: {
    forest_join_45: {
    life5_3 = (__fieldRead463_0() ^ 54963411952917L);
    life7_7 = new net.minecraft.client.renderer.chunk.CompiledChunk();
    life8_9 = 1;
    life9_15 = new moom.DT(__fieldRead463_1(receiver));
    life10_33 = __call463_5(life9_15, __invokedynamic463_2(3901, (3203534203672453367L ^ life5_3)), __invokedynamic463_3(3901, (3203534203672453367L ^ life5_3)), __invokedynamic463_4(3901, (3203534203672453367L ^ life5_3)));
    __call463_7(__call463_6(p3));
    if (!((__call463_8(p3) != __fieldRead463_9()))) {
        break forest_join_45;
    }
    __call463_11(__call463_10(p3));
    return;
    }
    __call463_12(p3, life7_7);
    __call463_14(__call463_13(p3));
    life11_55 = new moom.mt();
    life12_57 = __call463_15();
    if (!((!__call463_16(receiver, life9_15)))) {
        break forest_join_288;
    }
    __fieldWrite463_18((__fieldRead463_17() + 1));
    life13_69 = __call463_19(receiver, life9_15);
    __call463_20(life13_69);
    life14_75 = new boolean[(__fieldRead463_21()).length];
    life15_78 = __call463_23(__call463_22());
    life16_83 = __call463_25(__call463_24(life9_15, life10_33));
    forest_cycle_83: while (true) {
    forest_join_222: {
    forest_join_132: {
    forest_join_103: {
    if (!(__call463_26(life16_83))) {
        break forest_join_223;
    }
    life17_90 = __cast463_28(__call463_27(life16_83));
    life18_94 = __call463_29(life13_69, life17_90);
    life19_97 = __call463_30(life18_94);
    if (!(__call463_31(life19_97))) {
        break forest_join_103;
    }
    __call463_32(life11_55, life17_90);
    }
    if (!(__call463_34(__call463_33(life18_94)))) {
        break forest_join_132;
    }
    life20_115 = __call463_35(life13_69, new moom.DT(life17_90));
    life21_119 = __call463_37(__fieldRead463_36(), life20_115);
    if (!((life20_115 != null))) {
        break forest_join_132;
    }
    if (!((life21_119 != null))) {
        break forest_join_132;
    }
    __call463_38(life7_7, life20_115);
    if (!(__call463_39(life21_119))) {
        break forest_join_132;
    }
    __call463_40(life12_57, life20_115);
    }
    life20_139 = __fieldRead463_41(receiver);
    (life20_139)[0] = __call463_42(life19_97);
    life21_146 = life20_139;
    life22_149 = (life21_146).length;
    life23_151 = 0;
    forest_cycle_147: while (true) {
    forest_join_220: {
    forest_join_196: {
    if (!((life23_151 < life22_149))) {
        break forest_join_222;
    }
    life24_158 = (life21_146)[life23_151];
    life25_160 = life24_158;
    life25_165 = __call463_43(receiver, life18_94, life25_160);
    life26_168 = __call463_44(life25_165);
    if (!((__call463_45(life19_97) != -1))) {
        break forest_join_220;
    }
    life27_177 = __call463_47(__call463_46(p3), life26_168);
    __call463_48(life27_177, life25_165);
    life28_185 = __call463_49(life27_177, life18_94, life17_90);
    __call463_51(life28_185, __call463_50(p3));
    if (!((!__call463_52(life7_7, life25_165)))) {
        break forest_join_196;
    }
    __call463_53(life7_7, life25_165);
    __call463_54(receiver, life27_177, life9_15);
    }
    boolean[] __stackOp463_55_0 = life14_75;
    int __stackOp463_55_1 = life26_168;
    (__stackOp463_55_0)[__stackOp463_55_1] = __integerCategory463_59((__integerCategory463_57((__stackOp463_55_0)[__stackOp463_55_1]) | __integerCategory463_58(__call463_56(life15_78, life18_94, life17_90, life13_69, life27_177))));
    if (!(__call463_60(life28_185))) {
        break forest_join_220;
    }
    __call463_62(receiver, __call463_61(p3), life7_7, life14_75);
    __call463_63(life28_185, 0);
    }
    life23_151 += 1;
    continue forest_cycle_147;
    }
    }
    continue forest_cycle_83;
    }
    }
    life16_231 = __fieldRead463_64();
    life17_234 = (life16_231).length;
    life18_236 = 0;
    forest_cycle_230: while (true) {
    forest_join_284: {
    forest_join_280: {
    forest_join_279: {
    forest_join_256: {
    forest_join_245: {
    if (!((life18_236 < life17_234))) {
        break forest_join_286;
    }
    life19_243 = (life16_231)[life18_236];
    if (!((life14_75)[__call463_65(life19_243)])) {
        break forest_join_245;
    }
    __call463_66(life7_7, life19_243);
    }
    if (!(__call463_67(life7_7, life19_243))) {
        break forest_join_280;
    }
    if (!(__call463_68())) {
        break forest_join_256;
    }
    __call463_71(__call463_70(__call463_69(p3), life19_243));
    }
    life20_270 = __call463_73(__call463_72(p3), life19_243);
    __call463_74(receiver, life19_243, p0, p1, p2, life20_270, life7_7);
    if (!((__fieldRead463_75(life20_270) != null))) {
        break forest_join_279;
    }
    __call463_79(life7_7, life19_243, __cast463_78(__call463_77(__fieldRead463_76(life20_270))));
    }
    break forest_join_284;
    }
    __call463_80(life7_7, life19_243, null);
    }
    life18_236 += 1;
    continue forest_cycle_230;
    }
    }
    __call463_81(life13_69);
    }
    __call463_83(life7_7, __call463_82(life11_55));
    __call463_85(__fieldRead463_84(receiver));
    life13_308 = __call463_86(life12_57);
    life14_312 = __call463_88(__fieldRead463_87(receiver));
    __call463_90(life13_308, __fieldRead463_89(receiver));
    __call463_91(life14_312, life12_57);
    __call463_93(__fieldRead463_92(receiver));
    __call463_95(__fieldRead463_94(receiver), life12_57);
    __call463_97(__fieldRead463_96(receiver), life14_312, life13_308);
    __call463_99(__fieldRead463_98(receiver));
    return;
}
public static void h463_0(java.lang.Throwable p0, net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __call3046300_1(__call3046300_0(p1));
    throw life2_2;
}
public static void h463_1(moom.Oo p0) throws Throwable {
    throw __call3046301_0(p0);
}
public static void h463_2(moom.Oo p0) throws Throwable {
    throw __call3046302_0(p0);
}
public static void h463_3(moom.Oo p0) throws Throwable {
    throw __call3046303_0(p0);
}
public static void h463_4(moom.Oo p0) throws Throwable {
    throw __call3046304_0(p0);
}
public static void h463_5(moom.Oo p0) throws Throwable {
    throw __call3046305_0(p0);
}
public static void h463_6(moom.Oo p0) throws Throwable {
    throw __call3046306_0(p0);
}
public static void h463_7(moom.Oo p0) throws Throwable {
    throw __call3046307_0(p0);
}
public static void h463_8(moom.Oo p0) throws Throwable {
    throw __call3046308_0(p0);
}
public static void h463_9(moom.Oo p0) throws Throwable {
    throw __call3046309_0(p0);
}
public static void h463_10(moom.Oo p0) throws Throwable {
    throw __call3046310_0(p0);
}
public static void h463_11(java.lang.Throwable p0, moom.mp p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __call3046311_1(__fieldRead3046311_0(p1));
    throw life2_2;
}
private static native long __fieldRead463_0() throws Throwable;
private static native moom.DT __fieldRead463_1(moom.mp a0) throws Throwable;
private static native int __invokedynamic463_2(int a0, long a1) throws Throwable;
private static native int __invokedynamic463_3(int a0, long a1) throws Throwable;
private static native int __invokedynamic463_4(int a0, long a1) throws Throwable;
private static native moom.DT __call463_5(moom.DT a0, int a1, int a2, int a3) throws Throwable;
private static native java.util.concurrent.locks.ReentrantLock __call463_6(net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator a0) throws Throwable;
private static native void __call463_7(java.util.concurrent.locks.ReentrantLock a0) throws Throwable;
private static native net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator$Status __call463_8(net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator a0) throws Throwable;
private static native net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator$Status __fieldRead463_9() throws Throwable;
private static native java.util.concurrent.locks.ReentrantLock __call463_10(net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator a0) throws Throwable;
private static native void __call463_11(java.util.concurrent.locks.ReentrantLock a0) throws Throwable;
private static native void __call463_12(net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator a0, net.minecraft.client.renderer.chunk.CompiledChunk a1) throws Throwable;
private static native java.util.concurrent.locks.ReentrantLock __call463_13(net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator a0) throws Throwable;
private static native void __call463_14(java.util.concurrent.locks.ReentrantLock a0) throws Throwable;
private static native java.util.HashSet __call463_15() throws Throwable;
private static native boolean __call463_16(moom.mp a0, moom.DT a1) throws Throwable;
private static native int __fieldRead463_17() throws Throwable;
private static native void __fieldWrite463_18(int a0) throws Throwable;
private static native moom.L4 __call463_19(moom.mp a0, moom.DT a1) throws Throwable;
private static native void __call463_20(moom.L4 a0) throws Throwable;
private static native net.minecraft.util.EnumWorldBlockLayer[] __fieldRead463_21() throws Throwable;
private static native net.minecraft.client.Minecraft __call463_22() throws Throwable;
private static native net.minecraft.client.renderer.BlockRendererDispatcher __call463_23(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.lang.Iterable __call463_24(moom.DT a0, moom.DT a1) throws Throwable;
private static native java.util.Iterator __call463_25(java.lang.Iterable a0) throws Throwable;
private static native boolean __call463_26(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call463_27(java.util.Iterator a0) throws Throwable;
private static native moom.DX __cast463_28(java.lang.Object a0) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call463_29(moom.L4 a0, moom.DX a1) throws Throwable;
private static native net.minecraft.block.Block __call463_30(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native boolean __call463_31(net.minecraft.block.Block a0) throws Throwable;
private static native void __call463_32(moom.mt a0, moom.DX a1) throws Throwable;
private static native net.minecraft.block.Block __call463_33(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native boolean __call463_34(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.tileentity.TileEntity __call463_35(moom.L4 a0, moom.DT a1) throws Throwable;
private static native moom.oo __fieldRead463_36() throws Throwable;
private static native net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer __call463_37(moom.oo a0, net.minecraft.tileentity.TileEntity a1) throws Throwable;
private static native void __call463_38(net.minecraft.client.renderer.chunk.CompiledChunk a0, net.minecraft.tileentity.TileEntity a1) throws Throwable;
private static native boolean __call463_39(net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer a0) throws Throwable;
private static native boolean __call463_40(java.util.HashSet a0, net.minecraft.tileentity.TileEntity a1) throws Throwable;
private static native net.minecraft.util.EnumWorldBlockLayer[] __fieldRead463_41(moom.mp a0) throws Throwable;
private static native net.minecraft.util.EnumWorldBlockLayer __call463_42(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.util.EnumWorldBlockLayer __call463_43(moom.mp a0, net.minecraft.block.state.IBlockState a1, net.minecraft.util.EnumWorldBlockLayer a2) throws Throwable;
private static native int __call463_44(net.minecraft.util.EnumWorldBlockLayer a0) throws Throwable;
private static native int __call463_45(net.minecraft.block.Block a0) throws Throwable;
private static native moom.lp __call463_46(net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator a0) throws Throwable;
private static native moom.lw __call463_47(moom.lp a0, int a1) throws Throwable;
private static native void __call463_48(moom.lw a0, net.minecraft.util.EnumWorldBlockLayer a1) throws Throwable;
private static native moom.Mi __call463_49(moom.lw a0, net.minecraft.block.state.IBlockState a1, moom.DX a2) throws Throwable;
private static native moom.lp __call463_50(net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator a0) throws Throwable;
private static native void __call463_51(moom.Mi a0, moom.lp a1) throws Throwable;
private static native boolean __call463_52(net.minecraft.client.renderer.chunk.CompiledChunk a0, net.minecraft.util.EnumWorldBlockLayer a1) throws Throwable;
private static native void __call463_53(net.minecraft.client.renderer.chunk.CompiledChunk a0, net.minecraft.util.EnumWorldBlockLayer a1) throws Throwable;
private static native void __call463_54(moom.mp a0, moom.lw a1, moom.DT a2) throws Throwable;
private static native boolean __call463_56(net.minecraft.client.renderer.BlockRendererDispatcher a0, net.minecraft.block.state.IBlockState a1, moom.DX a2, moom.L4 a3, moom.lw a4) throws Throwable;
private static native int __integerCategory463_57(boolean value) throws Throwable;
private static native int __integerCategory463_58(boolean value) throws Throwable;
private static native boolean __integerCategory463_59(int value) throws Throwable;
private static native boolean __call463_60(moom.Mi a0) throws Throwable;
private static native moom.lp __call463_61(net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator a0) throws Throwable;
private static native void __call463_62(moom.mp a0, moom.lp a1, net.minecraft.client.renderer.chunk.CompiledChunk a2, boolean[] a3) throws Throwable;
private static native void __call463_63(moom.Mi a0, int a1) throws Throwable;
private static native net.minecraft.util.EnumWorldBlockLayer[] __fieldRead463_64() throws Throwable;
private static native int __call463_65(net.minecraft.util.EnumWorldBlockLayer a0) throws Throwable;
private static native void __call463_66(net.minecraft.client.renderer.chunk.CompiledChunk a0, net.minecraft.util.EnumWorldBlockLayer a1) throws Throwable;
private static native boolean __call463_67(net.minecraft.client.renderer.chunk.CompiledChunk a0, net.minecraft.util.EnumWorldBlockLayer a1) throws Throwable;
private static native boolean __call463_68() throws Throwable;
private static native moom.lp __call463_69(net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator a0) throws Throwable;
private static native moom.lw __call463_70(moom.lp a0, net.minecraft.util.EnumWorldBlockLayer a1) throws Throwable;
private static native void __call463_71(moom.lw a0) throws Throwable;
private static native moom.lp __call463_72(net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator a0) throws Throwable;
private static native moom.lw __call463_73(moom.lp a0, net.minecraft.util.EnumWorldBlockLayer a1) throws Throwable;
private static native void __call463_74(moom.mp a0, net.minecraft.util.EnumWorldBlockLayer a1, float a2, float a3, float a4, moom.lw a5, net.minecraft.client.renderer.chunk.CompiledChunk a6) throws Throwable;
private static native java.util.BitSet __fieldRead463_75(moom.lw a0) throws Throwable;
private static native java.util.BitSet __fieldRead463_76(moom.lw a0) throws Throwable;
private static native java.lang.Object __call463_77(java.util.BitSet a0) throws Throwable;
private static native java.util.BitSet __cast463_78(java.lang.Object a0) throws Throwable;
private static native void __call463_79(net.minecraft.client.renderer.chunk.CompiledChunk a0, net.minecraft.util.EnumWorldBlockLayer a1, java.util.BitSet a2) throws Throwable;
private static native void __call463_80(net.minecraft.client.renderer.chunk.CompiledChunk a0, net.minecraft.util.EnumWorldBlockLayer a1, java.lang.Object a2) throws Throwable;
private static native void __call463_81(moom.L4 a0) throws Throwable;
private static native moom.mr __call463_82(moom.mt a0) throws Throwable;
private static native void __call463_83(net.minecraft.client.renderer.chunk.CompiledChunk a0, moom.mr a1) throws Throwable;
private static native java.util.concurrent.locks.ReentrantLock __fieldRead463_84(moom.mp a0) throws Throwable;
private static native void __call463_85(java.util.concurrent.locks.ReentrantLock a0) throws Throwable;
private static native java.util.HashSet __call463_86(java.util.HashSet a0) throws Throwable;
private static native java.util.Set __fieldRead463_87(moom.mp a0) throws Throwable;
private static native java.util.HashSet __call463_88(java.util.Set a0) throws Throwable;
private static native java.util.Set __fieldRead463_89(moom.mp a0) throws Throwable;
private static native boolean __call463_90(java.util.HashSet a0, java.util.Set a1) throws Throwable;
private static native boolean __call463_91(java.util.HashSet a0, java.util.HashSet a1) throws Throwable;
private static native java.util.Set __fieldRead463_92(moom.mp a0) throws Throwable;
private static native void __call463_93(java.util.Set a0) throws Throwable;
private static native java.util.Set __fieldRead463_94(moom.mp a0) throws Throwable;
private static native boolean __call463_95(java.util.Set a0, java.util.HashSet a1) throws Throwable;
private static native net.minecraft.client.renderer.RenderGlobal __fieldRead463_96(moom.mp a0) throws Throwable;
private static native void __call463_97(net.minecraft.client.renderer.RenderGlobal a0, java.util.HashSet a1, java.util.HashSet a2) throws Throwable;
private static native java.util.concurrent.locks.ReentrantLock __fieldRead463_98(moom.mp a0) throws Throwable;
private static native void __call463_99(java.util.concurrent.locks.ReentrantLock a0) throws Throwable;
private static native java.util.concurrent.locks.ReentrantLock __call3046300_0(net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator a0) throws Throwable;
private static native void __call3046300_1(java.util.concurrent.locks.ReentrantLock a0) throws Throwable;
private static native moom.Oo __call3046301_0(moom.Oo a0) throws Throwable;
private static native moom.Oo __call3046302_0(moom.Oo a0) throws Throwable;
private static native moom.Oo __call3046303_0(moom.Oo a0) throws Throwable;
private static native moom.Oo __call3046304_0(moom.Oo a0) throws Throwable;
private static native moom.Oo __call3046305_0(moom.Oo a0) throws Throwable;
private static native moom.Oo __call3046306_0(moom.Oo a0) throws Throwable;
private static native moom.Oo __call3046307_0(moom.Oo a0) throws Throwable;
private static native moom.Oo __call3046308_0(moom.Oo a0) throws Throwable;
private static native moom.Oo __call3046309_0(moom.Oo a0) throws Throwable;
private static native moom.Oo __call3046310_0(moom.Oo a0) throws Throwable;
private static native java.util.concurrent.locks.ReentrantLock __fieldRead3046311_0(moom.mp a0) throws Throwable;
private static native void __call3046311_1(java.util.concurrent.locks.ReentrantLock a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator __sourceHandlerCall_ac4368e4433a74a11522(moom.mp a0) throws E;
private static final class __SourceHandler_ac4368e4433a74a11522 {

public static net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator f464(moom.mp receiver) throws Throwable {
    net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator life2_12;
    net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator life1_48;
    forest_join_32: {
    forest_join_18: {
    __call464_1(__fieldRead464_0(receiver));
    if (!((__fieldRead464_2(receiver) != null))) {
        break forest_join_18;
    }
    if (!((__call464_4(__fieldRead464_3(receiver)) == __fieldRead464_5()))) {
        break forest_join_18;
    }
    life2_12 = null;
    __call464_7(__fieldRead464_6(receiver));
    return life2_12;
    }
    if (!((__fieldRead464_8(receiver) != null))) {
        break forest_join_32;
    }
    if (!((__call464_10(__fieldRead464_9(receiver)) != __fieldRead464_11()))) {
        break forest_join_32;
    }
    __call464_13(__fieldRead464_12(receiver));
    __fieldWrite464_14(receiver, null);
    }
    __fieldWrite464_16(receiver, new net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator(receiver, __fieldRead464_15()));
    __call464_19(__fieldRead464_17(receiver), __fieldRead464_18(receiver));
    life1_48 = __fieldRead464_20(receiver);
    __call464_22(__fieldRead464_21(receiver));
    return life1_48;
}
public static net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator h464_0(moom.Oo p0) throws Throwable {
    throw __call3046400_0(p0);
}
public static net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator h464_1(moom.Oo p0) throws Throwable {
    throw __call3046401_0(p0);
}
public static net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator h464_2(java.lang.Throwable p0, moom.mp p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __call3046402_1(__fieldRead3046402_0(p1));
    throw life2_2;
}
private static native java.util.concurrent.locks.ReentrantLock __fieldRead464_0(moom.mp a0) throws Throwable;
private static native void __call464_1(java.util.concurrent.locks.ReentrantLock a0) throws Throwable;
private static native net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator __fieldRead464_2(moom.mp a0) throws Throwable;
private static native net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator __fieldRead464_3(moom.mp a0) throws Throwable;
private static native net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator$Status __call464_4(net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator a0) throws Throwable;
private static native net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator$Status __fieldRead464_5() throws Throwable;
private static native java.util.concurrent.locks.ReentrantLock __fieldRead464_6(moom.mp a0) throws Throwable;
private static native void __call464_7(java.util.concurrent.locks.ReentrantLock a0) throws Throwable;
private static native net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator __fieldRead464_8(moom.mp a0) throws Throwable;
private static native net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator __fieldRead464_9(moom.mp a0) throws Throwable;
private static native net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator$Status __call464_10(net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator a0) throws Throwable;
private static native net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator$Status __fieldRead464_11() throws Throwable;
private static native net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator __fieldRead464_12(moom.mp a0) throws Throwable;
private static native void __call464_13(net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator a0) throws Throwable;
private static native void __fieldWrite464_14(moom.mp a0, java.lang.Object a1) throws Throwable;
private static native net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator$Type __fieldRead464_15() throws Throwable;
private static native void __fieldWrite464_16(moom.mp a0, net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator a1) throws Throwable;
private static native net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator __fieldRead464_17(moom.mp a0) throws Throwable;
private static native net.minecraft.client.renderer.chunk.CompiledChunk __fieldRead464_18(moom.mp a0) throws Throwable;
private static native void __call464_19(net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator a0, net.minecraft.client.renderer.chunk.CompiledChunk a1) throws Throwable;
private static native net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator __fieldRead464_20(moom.mp a0) throws Throwable;
private static native java.util.concurrent.locks.ReentrantLock __fieldRead464_21(moom.mp a0) throws Throwable;
private static native void __call464_22(java.util.concurrent.locks.ReentrantLock a0) throws Throwable;
private static native moom.Oo __call3046400_0(moom.Oo a0) throws Throwable;
private static native moom.Oo __call3046401_0(moom.Oo a0) throws Throwable;
private static native java.util.concurrent.locks.ReentrantLock __fieldRead3046402_0(moom.mp a0) throws Throwable;
private static native void __call3046402_1(java.util.concurrent.locks.ReentrantLock a0) throws Throwable;

}


public java.lang.String toString() {
return __sourceIntrinsic_a86c261fcdee_originalDynamicSite1557_2(((moom.mp)(this)).a__DT(), this.n);
}


public moom.DT b(moom.bs p0) {
long local2 = (moom.mp.H ^ 128823646340639L);
    int local4 = ((moom.bs)(p0)).a();
    moom.DT local5 = (this.q)[local4];
    if ((local5 == null)) {
        local5 = ((moom.DT)(((moom.mp)(this)).a__DT())).a(((moom.bs)(p0)), ((int)(__sourceIntrinsic_c394ed412326_invokedynamic8432_4(16728, (7374643297515949467L ^ local2)))));
        (this.q)[local4] = local5;
    }
    return local5;
}


public static int b() {
return moom.mp.F;
}


public static void b(int p0) {
F = ((int)(p0));
    return;
}


public net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator b__mh() { return __sourceHandlerCall_ac4368e4433a74a11522(this); }


private void b__Void() {
long local1 = (moom.mp.H ^ 28124323461610L);
    moom.kZ.B();
    moom.kZ.A();
    float local3 = 0x1.00001p0f;
    moom.kZ.b(((float)(-0x1.0p3f)), ((float)(-0x1.0p3f)), ((float)(-0x1.0p3f)));
    moom.kZ.a(((float)(local3)), ((float)(local3)), ((float)(local3)));
    moom.kZ.b(((float)(0x1.0p3f)), ((float)(0x1.0p3f)), ((float)(0x1.0p3f)));
    moom.kZ.b(((int)(__sourceIntrinsic_9bf881b104f5_originalDynamicSite1558_6(5144, (2959459082584024875L ^ local1)))), ((java.nio.FloatBuffer)(this.k)));
    moom.kZ.C();
    return;
}


private boolean b__Boolean() {
net.minecraft.world.World life2_2;
    net.minecraft.client.multiplayer.WorldClient life1_8;
    life2_2 = this.a;
    if ((((life2_2 instanceof net.minecraft.client.multiplayer.WorldClient) ? 1 : 0) != 0)) {
        life1_8 = ((net.minecraft.client.multiplayer.WorldClient)(life2_2));
        return ((net.minecraft.client.multiplayer.WorldClient)(life1_8)).j__sourceReturn_aae029aa0a();
    }
    return false;
}


public void b(float p0, float p1, float p2, net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator p3) { __sourceHandlerCall_b57cdbf8029b5f815e13(this, p0, p1, p2, p3); }


public void e() {
((moom.mp)(this)).d();
    int local1 = 0;
    while ((local1 < (net.minecraft.util.EnumWorldBlockLayer.values()).length)) {
        if (((this.l)[local1] != null)) {
        ((moom.oC)((this.l)[local1])).c();
    }
        local1 += 1;
    }
    return;
}


public void c__Void() {
moom.kZ.a(((java.nio.FloatBuffer)(this.k)));
    return;
}


public boolean c__Boolean() {
return ((((this.u) ? 1 : 0)) != 0);
}


public static int c() {
int local0 = moom.mp.b();
    if ((local0 == 0)) {
        return 21;
    }
    return 0;
}


private void f() {
long local1 = (moom.mp.H ^ 72272861250250L);
    int local3 = ((moom.DT)(((moom.mp)(this)).a__DT())).a();
    int local4 = ((moom.DT)(((moom.mp)(this)).a__DT())).c();
    int local5 = ((moom.bs)(moom.bs.NORTH)).ordinal();
    int local6 = ((moom.bs)(moom.bs.SOUTH)).ordinal();
    int local7 = ((moom.bs)(moom.bs.WEST)).ordinal();
    int local8 = ((moom.bs)(moom.bs.EAST)).ordinal();
    (this.B)[local5] = ((((moom.DT)(((moom.mp)((this.A)[local5])).a__DT())).c() == (local4 - __sourceIntrinsic_0e8bb1a2e971_invokedynamic7032_17(16728, (7374586738140924238L ^ local1)))) ? (this.A)[local5] : null);
    (this.B)[local6] = ((((moom.DT)(((moom.mp)((this.A)[local6])).a__DT())).c() == (local4 + __sourceIntrinsic_0e8bb1a2e971_invokedynamic7032_23(16728, (7374586738140924238L ^ local1)))) ? (this.A)[local6] : null);
    (this.B)[local7] = ((((moom.DT)(((moom.mp)((this.A)[local7])).a__DT())).a() == (local3 - __sourceIntrinsic_0e8bb1a2e971_invokedynamic7032_29(16728, (7374586738140924238L ^ local1)))) ? (this.A)[local7] : null);
    (this.B)[local8] = ((((moom.DT)(((moom.mp)((this.A)[local8])).a__DT())).a() == (local3 + __sourceIntrinsic_0e8bb1a2e971_invokedynamic7032_35(16728, (7374586738140924238L ^ local1)))) ? (this.A)[local8] : null);
    this.C = ((boolean)(true));
    return;
}


public boolean d__Boolean() {
return (__sourceIntrinsic_booleanComparison((((moom.mp)(this)).a__Boolean(((moom.DT)(this.d))))) != 0);
}


public void d() {
((moom.mp)(this)).a__Void();
    this.e = ((net.minecraft.client.renderer.chunk.CompiledChunk)(net.minecraft.client.renderer.chunk.CompiledChunk.a));
    return;
}


public void a(moom.bs p0, moom.mp p1) {
(this.A)[((moom.bs)(p0)).ordinal()] = p1;
    (this.B)[((moom.bs)(p0)).ordinal()] = p1;
    return;
}


public net.minecraft.world.chunk.Chunk a__Fk() {
return ((moom.mp)(this)).a(((moom.DT)(this.d)));
}


public moom.mp a(moom.lv p0, moom.bs p1) {
int life3_4;
    moom.bs life4_12;
    moom.DT life5_16;
    if ((!this.y)) {
        life3_4 = 0;
        while ((life3_4 < (moom.bs.VALUES).length)) {
        life4_12 = (moom.bs.VALUES)[life3_4];
        life5_16 = ((moom.mp)(this)).a(((moom.bs)(life4_12)));
        (this.x)[life3_4] = ((moom.lv)(p0)).a(((moom.DT)(life5_16)));
        life3_4 += 1;
    }
        this.y = ((boolean)(true));
    }
    return (this.x)[((moom.bs)(p1)).ordinal()];
}


private net.minecraft.world.chunk.Chunk a(moom.DT p0) {
net.minecraft.world.chunk.Chunk life2_2;
    forward_join_16: {
    forward_join_8: {
    life2_2 = this.z;
    if (!((life2_2 != null))) { break forward_join_8; }
    if (!((!((net.minecraft.world.chunk.Chunk)(life2_2)).c__Boolean()))) { break forward_join_16; }
    }
    life2_2 = ((net.minecraft.world.World)(this.a)).a__Fk(((moom.DT)(p0)));
    this.z = ((net.minecraft.world.chunk.Chunk)(life2_2));
    }
    return life2_2;
}


private boolean a__Boolean(moom.DT p0) {
long local2 = (moom.mp.H ^ 76210393080669L);
    int local4 = ((moom.DT)(p0)).b();
    int local5 = (local4 + __sourceIntrinsic_d96db62771c0_originalDynamicSite1559_2(18018, (8967295775883489253L ^ local2)));
    return ((net.minecraft.world.chunk.Chunk)(((moom.mp)(this)).a(((moom.DT)(p0))))).b(((int)(local4)), ((int)(local5)));
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 6066;
      if (J[var3] == null) {
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
         long var5 = I[var3];
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
         Object[] var9 = (Object[])K.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               K.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/mp", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         J[var3] = var15;
      }

      return J[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.mp.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral8440_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/mp"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public moom.mp a__mp(moom.bs p0) {
if ((((this.C) ? 1 : 0) == 0)) {
        ((moom.mp)(this)).f();
    }
    return (this.B)[((moom.bs)(p0)).ordinal()];
}


public moom.ls a__ls() {
return this.D;
}


public boolean a(net.minecraft.client.renderer.culling.ICamera p0, int p1) {
int forwardValue3781_14_0;
    forward_join_14: {
    forward_join_13: {
    forward_join_11: {
    if (!((!((moom.CB)(((moom.mp)(this)).a__CB())).a(((net.minecraft.client.renderer.culling.ICamera)(p0)), ((int)(p1)))))) {
        break forward_join_11;
    }
    if (!(((net.minecraft.client.renderer.culling.ICamera)(p0)).a(((moom.CA)(this.m))))) {
        break forward_join_13;
    }
    }
    forwardValue3781_14_0 = 1;
    break forward_join_14;
    }
    forwardValue3781_14_0 = 0;
    }
    return ((forwardValue3781_14_0) != 0);
}


public moom.CB a__CB() {
moom.DT life1_5;
    int life2_8;
    int life3_11;
    int life4_14;
    int life5_16;
    int life6_22;
    int life7_28;
    int life8_34;
    moom.CB life9_60;
    int life9_102;
    forward_join_108: {
    forward_join_78: {
    forward_join_44: {
    if (!((this.E == null))) { break forward_join_108; }
    life1_5 = ((moom.mp)(this)).a__DT();
    life2_8 = ((moom.DT)(life1_5)).a();
    life3_11 = ((moom.DT)(life1_5)).b();
    life4_14 = ((moom.DT)(life1_5)).c();
    life5_16 = 5;
    life6_22 = ((life2_8 >> life5_16) << life5_16);
    life7_28 = ((life3_11 >> life5_16) << life5_16);
    life8_34 = ((life4_14 >> life5_16) << life5_16);
    if (!((life6_22 == life2_8))) { break forward_join_44; }
    if (!((life7_28 == life3_11))) { break forward_join_44; }
    if (!((life8_34 != life4_14))) { break forward_join_78; }
    }
    life9_60 = ((moom.mp)(((net.minecraft.client.renderer.RenderGlobal)(this.b)).a__mp(((moom.DT)(new moom.DT(life6_22, life7_28, life8_34)))))).a__CB();
    if (!((life9_60 != null))) { break forward_join_78; }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(((moom.CB)(life9_60)).b)), ((double)(((double) life6_22)))) == 0))) { break forward_join_78; }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(((moom.CB)(life9_60)).c)), ((double)(((double) life7_28)))) == 0))) { break forward_join_78; }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(((moom.CB)(life9_60)).d)), ((double)(((double) life8_34)))) == 0))) { break forward_join_78; }
    this.E = ((moom.CB)(life9_60));
    }
    if (!((this.E == null))) { break forward_join_108; }
    life9_102 = (1 << life5_16);
    this.E = ((moom.CB)(new moom.CB(((double) life6_22), ((double) life7_28), ((double) life8_34), ((double) (life6_22 + life9_102)), ((double) (life7_28 + life9_102)), ((double) (life8_34 + life9_102)))));
    }
    return this.E;
}


public java.util.concurrent.locks.ReentrantLock a() {
return this.f;
}


public net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator a__mh() { return __sourceHandlerCall_b60608e940907690c507(this); }


private void a(moom.lw p0, moom.DT p1) {
long life3_3;
    int life5_19;
    int life6_26;
    int life7_33;
    int life8_40;
    int life6_43;
    int life8_46;
    life3_3 = (moom.mp.H ^ 90759629595922L);
    ((moom.lw)(p0)).a(((int)(__sourceIntrinsic_b929cadda356_invokedynamic6888_1(28332, (8651219194785055072L ^ life3_3)))), ((moom.oD)(moom.oB.a)));
    if (moom.BU.aD()) {
        life5_19 = __sourceIntrinsic_b929cadda356_invokedynamic6888_5(24577, (5244218823125651406L ^ life3_3));
        life6_26 = ((((moom.DT)(p1)).a() >> life5_19) << life5_19);
        life7_33 = ((((moom.DT)(p1)).b() >> life5_19) << life5_19);
        life8_40 = ((((moom.DT)(p1)).c() >> life5_19) << life5_19);
        life6_43 = this.v;
        life8_46 = this.w;
        ((moom.lw)(p0)).b(((double)(((double) (-life6_43)))), ((double)(((double) (-life7_33)))), ((double)(((double) (-life8_46)))));
    } else {
        ((moom.lw)(p0)).b(((double)(((double) (-((moom.DT)(p1)).a())))), ((double)(((double) (-((moom.DT)(p1)).b())))), ((double)(((double) (-((moom.DT)(p1)).c())))));
    }
    return;
}


private void a(net.minecraft.util.EnumWorldBlockLayer p0, float p1, float p2, float p3, moom.lw p4, net.minecraft.client.renderer.chunk.CompiledChunk p5) {
if ((p0 == net.minecraft.util.EnumWorldBlockLayer.TRANSLUCENT)) {
        if ((__sourceIntrinsic_booleanComparison(((net.minecraft.client.renderer.chunk.CompiledChunk)(p5)).a__Boolean(((net.minecraft.util.EnumWorldBlockLayer)(p0)))) == 0)) {
        ((moom.lw)(p4)).a__Void(((float)(p1)), ((float)(p2)), ((float)(p3)));
        ((net.minecraft.client.renderer.chunk.CompiledChunk)(p5)).a(((moom.ly)(((moom.lw)(p4)).a__ly())));
    }
    }
    ((moom.lw)(p4)).e();
    return;
}


public net.minecraft.client.renderer.chunk.CompiledChunk a__ml() {
return this.e;
}


public boolean a__Boolean(int p0) {
if ((this.n == p0)) {
        return ((0) != 0);
    }
    this.n = ((int)(p0));
    return ((1) != 0);
}


public moom.oC a(int p0) {
return (this.l)[p0];
}


public void a__Void(moom.DT p0) {
long local2 = (moom.mp.H ^ 101977000463030L);
    ((moom.mp)(this)).d();
    this.d = ((moom.DT)(p0));
    int local4 = __sourceIntrinsic_2bdbd8ad1edc_invokedynamic7039_3(25690, (3021551112087495735L ^ local2));
    this.v = ((int)(((((moom.DT)(p0)).a() >> local4) << local4)));
    this.w = ((int)(((((moom.DT)(p0)).c() >> local4) << local4)));
    this.m = ((moom.CA)(new moom.CA(p0, ((moom.DT)(p0)).a(((int)(__sourceIntrinsic_2bdbd8ad1edc_invokedynamic7039_8(21044, (9132973806680592986L ^ local2)))), ((int)(__sourceIntrinsic_2bdbd8ad1edc_invokedynamic7039_9(16728, (7374598849826505010L ^ local2)))), ((int)(__sourceIntrinsic_2bdbd8ad1edc_invokedynamic7039_10(16728, (7374598849826505010L ^ local2))))))));
    ((moom.mp)(this)).b__Void();
    java.util.Arrays.fill(((java.lang.Object[])(this.q)), ((java.lang.Object)(null)));
    this.y = ((boolean)(false));
    this.C = ((boolean)(false));
    moom.mp[] local5 = this.A;
    int local6 = (local5).length;
    int local7 = 0;
    while ((local7 < local6)) {
        moom.mp local8 = (local5)[local7];
        if ((local8 != null)) {
        ((moom.mp)(local8)).C = ((boolean)(false));
    }
        local7 += 1;
    }
    this.z = ((net.minecraft.world.chunk.Chunk)(null));
    this.E = ((moom.CB)(null));
    return;
}


public void a(float p0, float p1, float p2, net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator p3) {
net.minecraft.client.renderer.chunk.CompiledChunk life5_2;
    moom.lw life6_17;
    life5_2 = ((net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator)(p3)).a__ml();
    if ((((net.minecraft.client.renderer.chunk.CompiledChunk)(life5_2)).a__ly() != null)) {
        if ((!((net.minecraft.client.renderer.chunk.CompiledChunk)(life5_2)).a__Boolean(((net.minecraft.util.EnumWorldBlockLayer)(net.minecraft.util.EnumWorldBlockLayer.TRANSLUCENT))))) {
        life6_17 = ((moom.lp)(((net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator)(p3)).a__lp())).a(((net.minecraft.util.EnumWorldBlockLayer)(net.minecraft.util.EnumWorldBlockLayer.TRANSLUCENT)));
        ((moom.mp)(this)).a(((moom.lw)(life6_17)), ((moom.DT)(this.d)));
        ((moom.lw)(life6_17)).a(((moom.ly)(((net.minecraft.client.renderer.chunk.CompiledChunk)(life5_2)).a__ly())));
        ((moom.mp)(this)).a(((net.minecraft.util.EnumWorldBlockLayer)(net.minecraft.util.EnumWorldBlockLayer.TRANSLUCENT)), ((float)(p0)), ((float)(p1)), ((float)(p2)), ((moom.lw)(life6_17)), ((net.minecraft.client.renderer.chunk.CompiledChunk)(life5_2)));
    }
    }
    return;
}


protected void a__Void() { __sourceHandlerCall_99c196da500f3ab2bc75(this); }


protected moom.Ed a(net.minecraft.world.World p0, moom.DT p1, moom.DT p2, int p3) {
return new moom.Ed(p0, p1, p2, p3);
}


private net.minecraft.util.EnumWorldBlockLayer a(net.minecraft.block.state.IBlockState p0, net.minecraft.util.EnumWorldBlockLayer p1) {
net.minecraft.util.EnumWorldBlockLayer life3_4;
    net.minecraft.block.Block life3_22;
    forward_join_35: {
    forward_join_30: {
    forward_join_28: {
    forward_join_23: {
    forward_join_9: {
    if (!(moom.Ji.a__Boolean())) { break forward_join_9; }
    life3_4 = moom.Ji.a(((net.minecraft.block.state.IBlockState)(p0)));
    if (!((life3_4 != null))) { break forward_join_9; }
    return life3_4;
    }
    if (!(this.t)) { break forward_join_30; }
    if (!((p1 == net.minecraft.util.EnumWorldBlockLayer.CUTOUT))) { break forward_join_35; }
    life3_22 = ((net.minecraft.block.state.IBlockState)(p0)).a__ch();
    if (!((((life3_22 instanceof moom.d9) ? 1 : 0) != 0))) { break forward_join_23; }
    return p1;
    }
    if (!((((life3_22 instanceof moom.cM) ? 1 : 0) != 0))) { break forward_join_28; }
    return p1;
    }
    return net.minecraft.util.EnumWorldBlockLayer.CUTOUT_MIPPED;
    }
    if (!((p1 == net.minecraft.util.EnumWorldBlockLayer.CUTOUT_MIPPED))) { break forward_join_35; }
    return net.minecraft.util.EnumWorldBlockLayer.CUTOUT;
    }
    return p1;
}


private void a(moom.lp p0, net.minecraft.client.renderer.chunk.CompiledChunk p1, boolean[] p2) {
((moom.mp)(this)).a(((net.minecraft.util.EnumWorldBlockLayer)(net.minecraft.util.EnumWorldBlockLayer.CUTOUT)), ((moom.lp)(p0)), ((net.minecraft.client.renderer.chunk.CompiledChunk)(p1)), ((boolean[])(p2)));
    ((moom.mp)(this)).a(((net.minecraft.util.EnumWorldBlockLayer)(net.minecraft.util.EnumWorldBlockLayer.CUTOUT_MIPPED)), ((moom.lp)(p0)), ((net.minecraft.client.renderer.chunk.CompiledChunk)(p1)), ((boolean[])(p2)));
    ((moom.mp)(this)).a(((net.minecraft.util.EnumWorldBlockLayer)(net.minecraft.util.EnumWorldBlockLayer.TRANSLUCENT)), ((moom.lp)(p0)), ((net.minecraft.client.renderer.chunk.CompiledChunk)(p1)), ((boolean[])(p2)));
    return;
}


private void a(net.minecraft.util.EnumWorldBlockLayer p0, moom.lp p1, net.minecraft.client.renderer.chunk.CompiledChunk p2, boolean[] p3) {
moom.lw local5 = ((moom.lp)(p1)).a(((net.minecraft.util.EnumWorldBlockLayer)(p0)));
    if (((moom.lw)(local5)).b__Boolean()) {
        ((net.minecraft.client.renderer.chunk.CompiledChunk)(p2)).b(((net.minecraft.util.EnumWorldBlockLayer)(p0)));
        (p3)[((net.minecraft.util.EnumWorldBlockLayer)(p0)).ordinal()] = true;
    }
    return;
}


private moom.L4 a__L4(moom.DT p0) {
long local2 = (moom.mp.H ^ 72071675296272L);
    moom.DT local4 = ((moom.DT)(p0)).a(((int)(-1)), ((int)(-1)), ((int)(-1)));
    moom.DT local5 = ((moom.DT)(p0)).a(((int)(__sourceIntrinsic_be6cd21f39de_originalDynamicSite1560_2(16728, (7374586836260237716L ^ local2)))), ((int)(__sourceIntrinsic_be6cd21f39de_originalDynamicSite1560_3(16728, (7374586836260237716L ^ local2)))), ((int)(__sourceIntrinsic_be6cd21f39de_originalDynamicSite1560_4(16728, (7374586836260237716L ^ local2)))));
    moom.Ed local6 = ((moom.mp)(this)).a(((net.minecraft.world.World)(this.a)), ((moom.DT)(local4)), ((moom.DT)(local5)), ((int)(1)));
    return new moom.L4(local6, local4, local5, 1);
}


public void a(net.minecraft.client.renderer.chunk.CompiledChunk p0) { __sourceHandlerCall_1c4ffc6997275405b786(this, p0); }


public moom.DT a__DT() {
return this.d;
}


public void a(boolean p0) {
forward_join_15: {
    forward_join_12: {
    this.o = ((boolean)(p0));
    if (!(p0)) { break forward_join_12; }
    if (!(((moom.mp)(this)).b__Boolean())) { break forward_join_15; }
    this.u = ((boolean)(true));
    break forward_join_15;
    }
    this.u = ((boolean)(false));
    }
    return;
}


public boolean a__Boolean() {
return ((((this.o) ? 1 : 0)) != 0);
}


public moom.DT a(moom.bs p0) {
return ((moom.mp)(this)).b(((moom.bs)(p0)));
}


private static native <E extends Throwable> int __sourceIntrinsic_69b827d4dc8959a8_invokedynamic483_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_69b827d4dc8959a8_invokedynamic483_23(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral8440_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b929cadda356_invokedynamic6888_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b929cadda356_invokedynamic6888_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d96db62771c0_originalDynamicSite1559_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_be6cd21f39de_originalDynamicSite1560_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_be6cd21f39de_originalDynamicSite1560_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_be6cd21f39de_originalDynamicSite1560_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2bdbd8ad1edc_invokedynamic7039_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2bdbd8ad1edc_invokedynamic7039_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2bdbd8ad1edc_invokedynamic7039_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2bdbd8ad1edc_invokedynamic7039_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c394ed412326_invokedynamic8432_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9bf881b104f5_originalDynamicSite1558_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0e8bb1a2e971_invokedynamic7032_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0e8bb1a2e971_invokedynamic7032_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0e8bb1a2e971_invokedynamic7032_29(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0e8bb1a2e971_invokedynamic7032_35(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite1557_2(moom.DT a0, int a1) throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
