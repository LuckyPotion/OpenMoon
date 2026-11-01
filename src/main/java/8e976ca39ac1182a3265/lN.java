package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class lN {

private static float a;

private static float b;

private static long c;

private static long[] d;

private static java.lang.Integer[] e;

private static java.util.Map f;

public lN() {
super();
}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(-3357980590043505100L)), ((long)(-1033363767943741891L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(202797325118211L)))));
    f = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.lN.c ^ 36598392949609L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill919_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill919_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill919_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill919_14 = new byte[8];
    (__sourceSpill919_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill919_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation919_16 = __sourceSpill919_14;
    ((javax.crypto.Cipher)(__sourceSpill919_11)).init(((int)(__sourceSpill919_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill919_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation919_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[6];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "\fã\032 ]±\030\bØ\037ó¾eçAÖFB\001\034\000øµ2t"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill919_25 = local6_life21;
        int __sourceSpill919_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill919_25)).substring(((int)(__sourceSpill919_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill919_30 = local8_life19;
        int __sourceSpill919_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill919_33 = new byte[8];
        (__sourceSpill919_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill919_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill919_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill919_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill919_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill919_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill919_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill919_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill919_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill919_34)).doFinal(((byte[])(__sourceSpill919_33)));
        (__sourceSpill919_30)[__sourceSpill919_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "·¼\026xv0=Ã*«¶z\003ÿõF"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill919_38 = local6_life21;
        int __sourceSpill919_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill919_38)).substring(((int)(__sourceSpill919_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill919_43 = local8_life19;
        int __sourceSpill919_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill919_46 = new byte[8];
        (__sourceSpill919_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill919_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill919_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill919_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill919_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill919_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill919_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill919_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill919_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill919_47)).doFinal(((byte[])(__sourceSpill919_46)));
        (__sourceSpill919_43)[__sourceSpill919_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    d = ((long[])(local8_life19));
    e = ((java.lang.Integer[])(new java.lang.Integer[6]));
    a = ((float)(((0x1.0p0f / ((float) java.lang.Math.cos(((double)(0x1.921fb6p-2d))))) - 0x1.0p0f)));
    b = ((float)(((0x1.0p0f / ((float) java.lang.Math.cos(((double)(0x1.921fb54442d18p-1d))))) - 0x1.0p0f)));
}

private static native <E extends Throwable> void __sourceHandlerCall_da291bf96679322e844e(moom.lN a0, org.lwjgl.util.vector.Vector3f a1, net.minecraft.client.renderer.block.model.BlockPartRotation a2) throws E;
private static final class __SourceHandler_da291bf96679322e844e {

public static void f453(moom.lN receiver, org.lwjgl.util.vector.Vector3f p0, net.minecraft.client.renderer.block.model.BlockPartRotation p1) throws Throwable {
    org.lwjgl.util.vector.Vector3f spill453_0;
    float spill453_1;
    org.lwjgl.util.vector.Vector3f spill453_2;
    float spill453_3;
    org.lwjgl.util.vector.Vector3f spill453_4;
    float spill453_5;
    org.lwjgl.util.vector.Vector3f spill453_6;
    org.lwjgl.util.vector.Vector3f spill453_7;
    org.lwjgl.util.vector.Vector3f spill453_8;
    moom.lN spill453_9;
    org.lwjgl.util.vector.Vector3f spill453_10;
    org.lwjgl.util.vector.Vector3f spill453_11;
    org.lwjgl.util.vector.Matrix4f life3_4;
    org.lwjgl.util.vector.Vector3f life4_11;
    forest_join_121: {
    forest_join_111: {
    forest_join_106: {
    forest_join_95: {
    forest_join_91: {
    forest_join_77: {
    forest_join_58: {
    forest_join_38: {
    forest_join_18: {
    if (!((p1 != null))) {
        break forest_join_121;
    }
    life3_4 = __call453_0(receiver);
    org.lwjgl.util.vector.Vector3f __stackOp453_2_0 = __sourceUninitializedNEW453_1();
    spill453_0 = __stackOp453_2_0;
    __explicitNewInit453_3(__stackOp453_2_0, 0x0.0p0f, 0x0.0p0f, 0x0.0p0f);
    life4_11 = spill453_0;
    switch ((__fieldRead453_4())[__call453_6(__fieldRead453_5(p1))]) {
case 1:
{
        break forest_join_18;
    }
case 2:
{
        break forest_join_38;
    }
case 3:
{
        break forest_join_58;
    }
default:
{
        break forest_join_77;
    }
}
    }
    spill453_1 = (__fieldRead453_7(p1) * 0x1.1df46ap-6f);
    org.lwjgl.util.vector.Vector3f __stackOp453_9_0 = __sourceUninitializedNEW453_8();
    spill453_2 = __stackOp453_9_0;
    __explicitNewInit453_10(__stackOp453_9_0, 0x1.0p0f, 0x0.0p0f, 0x0.0p0f);
    __call453_11(spill453_1, spill453_2, life3_4, life3_4);
    __call453_12(life4_11, 0x0.0p0f, 0x1.0p0f, 0x1.0p0f);
    break forest_join_77;
    }
    spill453_3 = (__fieldRead453_13(p1) * 0x1.1df46ap-6f);
    org.lwjgl.util.vector.Vector3f __stackOp453_15_0 = __sourceUninitializedNEW453_14();
    spill453_4 = __stackOp453_15_0;
    __explicitNewInit453_16(__stackOp453_15_0, 0x0.0p0f, 0x1.0p0f, 0x0.0p0f);
    __call453_17(spill453_3, spill453_4, life3_4, life3_4);
    __call453_18(life4_11, 0x1.0p0f, 0x0.0p0f, 0x1.0p0f);
    break forest_join_77;
    }
    spill453_5 = (__fieldRead453_19(p1) * 0x1.1df46ap-6f);
    org.lwjgl.util.vector.Vector3f __stackOp453_21_0 = __sourceUninitializedNEW453_20();
    spill453_6 = __stackOp453_21_0;
    __explicitNewInit453_22(__stackOp453_21_0, 0x0.0p0f, 0x0.0p0f, 0x1.0p0f);
    __call453_23(spill453_5, spill453_6, life3_4, life3_4);
    __call453_24(life4_11, 0x1.0p0f, 0x1.0p0f, 0x0.0p0f);
    }
    if (!(__fieldRead453_25(p1))) {
        break forest_join_106;
    }
    if (!((__numericCompare453_28(__call453_27(__fieldRead453_26(p1)), 0x1.68p4f) == 0))) {
        break forest_join_91;
    }
    __call453_30(life4_11, __fieldRead453_29());
    break forest_join_95;
    }
    __call453_32(life4_11, __fieldRead453_31());
    }
    spill453_7 = life4_11;
    org.lwjgl.util.vector.Vector3f __stackOp453_34_0 = __sourceUninitializedNEW453_33();
    spill453_8 = __stackOp453_34_0;
    __explicitNewInit453_35(__stackOp453_34_0, 0x1.0p0f, 0x1.0p0f, 0x1.0p0f);
    __call453_36(spill453_7, spill453_8, life4_11);
    break forest_join_111;
    }
    __call453_37(life4_11, 0x1.0p0f, 0x1.0p0f, 0x1.0p0f);
    }
    spill453_9 = receiver;
    spill453_10 = p0;
    org.lwjgl.util.vector.Vector3f __stackOp453_39_0 = __sourceUninitializedNEW453_38();
    spill453_11 = __stackOp453_39_0;
    __explicitNewInit453_41(__stackOp453_39_0, __fieldRead453_40(p1));
    __call453_42(spill453_9, spill453_10, spill453_11, life3_4, life4_11);
    }
    return;
}
private static native org.lwjgl.util.vector.Matrix4f __call453_0(moom.lN a0) throws Throwable;
private static native org.lwjgl.util.vector.Vector3f __sourceUninitializedNEW453_1() throws Throwable;
private static native void __explicitNewInit453_3(org.lwjgl.util.vector.Vector3f a0, float a1, float a2, float a3) throws Throwable;
private static native int[] __fieldRead453_4() throws Throwable;
private static native net.minecraft.util.EnumFacing$Axis __fieldRead453_5(net.minecraft.client.renderer.block.model.BlockPartRotation a0) throws Throwable;
private static native int __call453_6(net.minecraft.util.EnumFacing$Axis a0) throws Throwable;
private static native float __fieldRead453_7(net.minecraft.client.renderer.block.model.BlockPartRotation a0) throws Throwable;
private static native org.lwjgl.util.vector.Vector3f __sourceUninitializedNEW453_8() throws Throwable;
private static native void __explicitNewInit453_10(org.lwjgl.util.vector.Vector3f a0, float a1, float a2, float a3) throws Throwable;
private static native org.lwjgl.util.vector.Matrix4f __call453_11(float a0, org.lwjgl.util.vector.Vector3f a1, org.lwjgl.util.vector.Matrix4f a2, org.lwjgl.util.vector.Matrix4f a3) throws Throwable;
private static native void __call453_12(org.lwjgl.util.vector.Vector3f a0, float a1, float a2, float a3) throws Throwable;
private static native float __fieldRead453_13(net.minecraft.client.renderer.block.model.BlockPartRotation a0) throws Throwable;
private static native org.lwjgl.util.vector.Vector3f __sourceUninitializedNEW453_14() throws Throwable;
private static native void __explicitNewInit453_16(org.lwjgl.util.vector.Vector3f a0, float a1, float a2, float a3) throws Throwable;
private static native org.lwjgl.util.vector.Matrix4f __call453_17(float a0, org.lwjgl.util.vector.Vector3f a1, org.lwjgl.util.vector.Matrix4f a2, org.lwjgl.util.vector.Matrix4f a3) throws Throwable;
private static native void __call453_18(org.lwjgl.util.vector.Vector3f a0, float a1, float a2, float a3) throws Throwable;
private static native float __fieldRead453_19(net.minecraft.client.renderer.block.model.BlockPartRotation a0) throws Throwable;
private static native org.lwjgl.util.vector.Vector3f __sourceUninitializedNEW453_20() throws Throwable;
private static native void __explicitNewInit453_22(org.lwjgl.util.vector.Vector3f a0, float a1, float a2, float a3) throws Throwable;
private static native org.lwjgl.util.vector.Matrix4f __call453_23(float a0, org.lwjgl.util.vector.Vector3f a1, org.lwjgl.util.vector.Matrix4f a2, org.lwjgl.util.vector.Matrix4f a3) throws Throwable;
private static native void __call453_24(org.lwjgl.util.vector.Vector3f a0, float a1, float a2, float a3) throws Throwable;
private static native boolean __fieldRead453_25(net.minecraft.client.renderer.block.model.BlockPartRotation a0) throws Throwable;
private static native float __fieldRead453_26(net.minecraft.client.renderer.block.model.BlockPartRotation a0) throws Throwable;
private static native float __call453_27(float a0) throws Throwable;
private static native int __numericCompare453_28(float a0, float a1) throws Throwable;
private static native float __fieldRead453_29() throws Throwable;
private static native org.lwjgl.util.vector.Vector __call453_30(org.lwjgl.util.vector.Vector3f a0, float a1) throws Throwable;
private static native float __fieldRead453_31() throws Throwable;
private static native org.lwjgl.util.vector.Vector __call453_32(org.lwjgl.util.vector.Vector3f a0, float a1) throws Throwable;
private static native org.lwjgl.util.vector.Vector3f __sourceUninitializedNEW453_33() throws Throwable;
private static native void __explicitNewInit453_35(org.lwjgl.util.vector.Vector3f a0, float a1, float a2, float a3) throws Throwable;
private static native org.lwjgl.util.vector.Vector3f __call453_36(org.lwjgl.util.vector.Vector3f a0, org.lwjgl.util.vector.Vector3f a1, org.lwjgl.util.vector.Vector3f a2) throws Throwable;
private static native void __call453_37(org.lwjgl.util.vector.Vector3f a0, float a1, float a2, float a3) throws Throwable;
private static native org.lwjgl.util.vector.Vector3f __sourceUninitializedNEW453_38() throws Throwable;
private static native org.lwjgl.util.vector.Vector3f __fieldRead453_40(net.minecraft.client.renderer.block.model.BlockPartRotation a0) throws Throwable;
private static native void __explicitNewInit453_41(org.lwjgl.util.vector.Vector3f a0, org.lwjgl.util.vector.ReadableVector3f a1) throws Throwable;
private static native void __call453_42(moom.lN a0, org.lwjgl.util.vector.Vector3f a1, org.lwjgl.util.vector.Vector3f a2, org.lwjgl.util.vector.Matrix4f a3, org.lwjgl.util.vector.Vector3f a4) throws Throwable;

}


private void a(int[] p0, moom.bs p1) {
int[] life3_3;
    float[] life4_14;
    int life5_43;
    int life6_45;
    int life7_52;
    float life8_57;
    float life9_64;
    float life10_71;
    moom.aD life6_154;
    int life7_156;
    int life8_163;
    moom.kX life9_167;
    float life10_172;
    float life11_177;
    float life12_182;
    int life13_203;
    int life14_210;
    float life15_215;
    float life16_222;
    float life17_229;
    life3_3 = new int[(p0).length];
    java.lang.System.arraycopy(((java.lang.Object)(p0)), ((int)(0)), ((java.lang.Object)(life3_3)), ((int)(0)), ((int)((p0).length)));
    life4_14 = new float[(moom.bs.values()).length];
    (life4_14)[moom.kW.f] = 0x1.f38p9f;
    (life4_14)[moom.kW.e] = 0x1.f38p9f;
    (life4_14)[moom.kW.d] = 0x1.f38p9f;
    (life4_14)[moom.kW.c] = -0x1.f38p9f;
    (life4_14)[moom.kW.b] = -0x1.f38p9f;
    (life4_14)[moom.kW.a] = -0x1.f38p9f;
    life5_43 = ((p0).length / 4);
    life6_45 = 0;
    while ((life6_45 < 4)) {
        life7_52 = (life5_43 * life6_45);
        life8_57 = java.lang.Float.intBitsToFloat(((int)((life3_3)[life7_52])));
        life9_64 = java.lang.Float.intBitsToFloat(((int)((life3_3)[(life7_52 + 1)])));
        life10_71 = java.lang.Float.intBitsToFloat(((int)((life3_3)[(life7_52 + 2)])));
        if ((life8_57 < (life4_14)[moom.kW.f])) {
        (life4_14)[moom.kW.f] = life8_57;
    }
        if ((life9_64 < (life4_14)[moom.kW.e])) {
        (life4_14)[moom.kW.e] = life9_64;
    }
        if ((life10_71 < (life4_14)[moom.kW.d])) {
        (life4_14)[moom.kW.d] = life10_71;
    }
        if ((life8_57 > (life4_14)[moom.kW.c])) {
        (life4_14)[moom.kW.c] = life8_57;
    }
        if ((life9_64 > (life4_14)[moom.kW.b])) {
        (life4_14)[moom.kW.b] = life9_64;
    }
        if ((life10_71 > (life4_14)[moom.kW.a])) {
        (life4_14)[moom.kW.a] = life10_71;
    }
        life6_45 += 1;
    }
    life6_154 = moom.aD.a(((moom.bs)(p1)));
    life7_156 = 0;
    while ((life7_156 < 4)) {
        life8_163 = (life5_43 * life7_156);
        life9_167 = ((moom.aD)(life6_154)).a(((int)(life7_156)));
        life10_172 = (life4_14)[((moom.kX)(life9_167)).a];
        life11_177 = (life4_14)[((moom.kX)(life9_167)).b];
        life12_182 = (life4_14)[((moom.kX)(life9_167)).c];
        (p0)[life8_163] = java.lang.Float.floatToRawIntBits(((float)(life10_172)));
        (p0)[(life8_163 + 1)] = java.lang.Float.floatToRawIntBits(((float)(life11_177)));
        (p0)[(life8_163 + 2)] = java.lang.Float.floatToRawIntBits(((float)(life12_182)));
        life13_203 = 0;
        while ((life13_203 < 4)) {
        life14_210 = (life5_43 * life13_203);
        life15_215 = java.lang.Float.intBitsToFloat(((int)((life3_3)[life14_210])));
        life16_222 = java.lang.Float.intBitsToFloat(((int)((life3_3)[(life14_210 + 1)])));
        life17_229 = java.lang.Float.intBitsToFloat(((int)((life3_3)[(life14_210 + 2)])));
        if (moom.Dr.a__Boolean(((float)(life10_172)), ((float)(life15_215)))) {
        if (moom.Dr.a__Boolean(((float)(life11_177)), ((float)(life16_222)))) {
        if (moom.Dr.a__Boolean(((float)(life12_182)), ((float)(life17_229)))) {
        (p0)[(life8_163 + 4)] = (life3_3)[(life14_210 + 4)];
        (p0)[((life8_163 + 4) + 1)] = (life3_3)[((life14_210 + 4) + 1)];
    }
    }
    }
        life13_203 += 1;
    }
        life7_156 += 1;
    }
    return;
}


public void a(int[] p0, moom.bs p1, moom.lE p2, net.minecraft.client.renderer.texture.TextureAtlasSprite p3) {
int local5 = 0;
    while ((local5 < 4)) {
        ((moom.lN)(this)).a(((int)(local5)), ((int[])(p0)), ((moom.bs)(p1)), ((moom.lE)(p2)), ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(p3)));
        local5 += 1;
    }
    return;
}


public static moom.bs a(int[] p0) {
int life1_4;
    int life2_8;
    int life3_12;
    org.lwjgl.util.vector.Vector3f life4_28;
    org.lwjgl.util.vector.Vector3f life5_48;
    org.lwjgl.util.vector.Vector3f life6_68;
    org.lwjgl.util.vector.Vector3f life7_72;
    org.lwjgl.util.vector.Vector3f life8_76;
    org.lwjgl.util.vector.Vector3f life9_80;
    float life10_116;
    moom.bs life11_136;
    float life12_138;
    moom.bs[] life13_140;
    int life14_143;
    int life15_145;
    moom.bs life16_152;
    moom.DS life17_155;
    org.lwjgl.util.vector.Vector3f life18_168;
    float life19_172;
    life1_4 = ((p0).length / 4);
    life2_8 = (life1_4 * 2);
    life3_12 = (life1_4 * 3);
    life4_28 = new org.lwjgl.util.vector.Vector3f(java.lang.Float.intBitsToFloat(((int)((p0)[0]))), java.lang.Float.intBitsToFloat(((int)((p0)[1]))), java.lang.Float.intBitsToFloat(((int)((p0)[2]))));
    life5_48 = new org.lwjgl.util.vector.Vector3f(java.lang.Float.intBitsToFloat(((int)((p0)[life1_4]))), java.lang.Float.intBitsToFloat(((int)((p0)[(life1_4 + 1)]))), java.lang.Float.intBitsToFloat(((int)((p0)[(life1_4 + 2)]))));
    life6_68 = new org.lwjgl.util.vector.Vector3f(java.lang.Float.intBitsToFloat(((int)((p0)[life2_8]))), java.lang.Float.intBitsToFloat(((int)((p0)[(life2_8 + 1)]))), java.lang.Float.intBitsToFloat(((int)((p0)[(life2_8 + 2)]))));
    life7_72 = new org.lwjgl.util.vector.Vector3f();
    life8_76 = new org.lwjgl.util.vector.Vector3f();
    life9_80 = new org.lwjgl.util.vector.Vector3f();
    org.lwjgl.util.vector.Vector3f.sub(((org.lwjgl.util.vector.Vector3f)(life4_28)), ((org.lwjgl.util.vector.Vector3f)(life5_48)), ((org.lwjgl.util.vector.Vector3f)(life7_72)));
    org.lwjgl.util.vector.Vector3f.sub(((org.lwjgl.util.vector.Vector3f)(life6_68)), ((org.lwjgl.util.vector.Vector3f)(life5_48)), ((org.lwjgl.util.vector.Vector3f)(life8_76)));
    org.lwjgl.util.vector.Vector3f.cross(((org.lwjgl.util.vector.Vector3f)(life8_76)), ((org.lwjgl.util.vector.Vector3f)(life7_72)), ((org.lwjgl.util.vector.Vector3f)(life9_80)));
    life10_116 = ((float) java.lang.Math.sqrt(((double)(((double) (((((org.lwjgl.util.vector.Vector3f)(life9_80)).x * ((org.lwjgl.util.vector.Vector3f)(life9_80)).x) + (((org.lwjgl.util.vector.Vector3f)(life9_80)).y * ((org.lwjgl.util.vector.Vector3f)(life9_80)).y)) + (((org.lwjgl.util.vector.Vector3f)(life9_80)).z * ((org.lwjgl.util.vector.Vector3f)(life9_80)).z)))))));
    org.lwjgl.util.vector.Vector3f __stackOp1237_19_0 = life9_80;
    ((org.lwjgl.util.vector.Vector3f)(__stackOp1237_19_0)).x = ((float)((((org.lwjgl.util.vector.Vector3f)(__stackOp1237_19_0)).x / life10_116)));
    org.lwjgl.util.vector.Vector3f __stackOp1237_22_0 = life9_80;
    ((org.lwjgl.util.vector.Vector3f)(__stackOp1237_22_0)).y = ((float)((((org.lwjgl.util.vector.Vector3f)(__stackOp1237_22_0)).y / life10_116)));
    org.lwjgl.util.vector.Vector3f __stackOp1237_25_0 = life9_80;
    ((org.lwjgl.util.vector.Vector3f)(__stackOp1237_25_0)).z = ((float)((((org.lwjgl.util.vector.Vector3f)(__stackOp1237_25_0)).z / life10_116)));
    life11_136 = null;
    life12_138 = 0x0.0p0f;
    life13_140 = moom.bs.values();
    life14_143 = (life13_140).length;
    life15_145 = 0;
    loop_region_146: while ((life15_145 < life14_143)) {
        life16_152 = (life13_140)[life15_145];
        life17_155 = ((moom.bs)(life16_152)).a__DS();
        life18_168 = new org.lwjgl.util.vector.Vector3f(((float) ((moom.DS)(life17_155)).a()), ((float) ((moom.DS)(life17_155)).b()), ((float) ((moom.DS)(life17_155)).c()));
        life19_172 = org.lwjgl.util.vector.Vector3f.dot(((org.lwjgl.util.vector.Vector3f)(life9_80)), ((org.lwjgl.util.vector.Vector3f)(life18_168)));
        if ((recovery.source.CarrierOps.fcmpl(((float)(life19_172)), ((float)(0x0.0p0f))) >= 0)) {
        if ((recovery.source.CarrierOps.fcmpl(((float)(life19_172)), ((float)(life12_138))) > 0)) {
        life12_138 = life19_172;
        life11_136 = life16_152;
    }
    }
        life15_145 += 1;
    }
    return ((moom.bs)(java.util.Objects.requireNonNullElse(((java.lang.Object)(life11_136)), ((java.lang.Object)(moom.bs.UP)))));
}


private org.lwjgl.util.vector.Matrix4f a() {
org.lwjgl.util.vector.Matrix4f local1_life0 = new org.lwjgl.util.vector.Matrix4f();
    ((org.lwjgl.util.vector.Matrix4f)(local1_life0)).setIdentity();
    return local1_life0;
}


private void a(org.lwjgl.util.vector.Vector3f p0, org.lwjgl.util.vector.Vector3f p1, org.lwjgl.util.vector.Matrix4f p2, org.lwjgl.util.vector.Vector3f p3) {
org.lwjgl.util.vector.Vector4f local5_life6 = new org.lwjgl.util.vector.Vector4f((((org.lwjgl.util.vector.Vector3f)(p0)).x - ((org.lwjgl.util.vector.Vector3f)(p1)).x), (((org.lwjgl.util.vector.Vector3f)(p0)).y - ((org.lwjgl.util.vector.Vector3f)(p1)).y), (((org.lwjgl.util.vector.Vector3f)(p0)).z - ((org.lwjgl.util.vector.Vector3f)(p1)).z), 0x1.0p0f);
    org.lwjgl.util.vector.Matrix4f.transform(((org.lwjgl.util.vector.Matrix4f)(p2)), ((org.lwjgl.util.vector.Vector4f)(local5_life6)), ((org.lwjgl.util.vector.Vector4f)(local5_life6)));
    local5_life6.x *= ((org.lwjgl.util.vector.Vector3f)(p3)).x;
    local5_life6.y *= ((org.lwjgl.util.vector.Vector3f)(p3)).y;
    local5_life6.z *= ((org.lwjgl.util.vector.Vector3f)(p3)).z;
    ((org.lwjgl.util.vector.Vector3f)(p0)).set(((float)((((org.lwjgl.util.vector.Vector4f)(local5_life6)).x + ((org.lwjgl.util.vector.Vector3f)(p1)).x))), ((float)((((org.lwjgl.util.vector.Vector4f)(local5_life6)).y + ((org.lwjgl.util.vector.Vector3f)(p1)).y))), ((float)((((org.lwjgl.util.vector.Vector4f)(local5_life6)).z + ((org.lwjgl.util.vector.Vector3f)(p1)).z))));
    return;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral8296_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/lN"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.lN.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int n4 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x3902;
        if (e[n4] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l5 = d[n4];
            byte[] byArray3 = new byte[]{(byte)(l5 >>> 56), (byte)(l5 >>> 48), (byte)(l5 >>> 40), (byte)(l5 >>> 32), (byte)(l5 >>> 24), (byte)(l5 >>> 16), (byte)(l5 >>> 8), (byte)l5};
            Long l6 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])f.get(l6);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    f.put(l6, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/lN", exception);
            }
            int n6 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            lN.e[n4] = n6;
        }
        return e[n4];
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private void a(int p0, int[] p1, moom.bs p2, moom.lE p3, net.minecraft.client.renderer.texture.TextureAtlasSprite p4) {
int life6_4;
    int life7_8;
    float life8_13;
    float life9_20;
    float life10_27;
    float life11_80;
    float life12_82;
    int life13_160;
    forward_join_146: {
    forward_join_134: {
    forward_join_123: {
    forward_join_112: {
    forward_join_99: {
    forward_join_90: {
    forward_join_79: {
    forward_join_70: {
    forward_join_64: {
    forward_join_56: {
    forward_join_50: {
    forward_join_42: {
    forward_join_36: {
    life6_4 = ((p1).length / 4);
    life7_8 = (life6_4 * p0);
    life8_13 = java.lang.Float.intBitsToFloat(((int)((p1)[life7_8])));
    life9_20 = java.lang.Float.intBitsToFloat(((int)((p1)[(life7_8 + 1)])));
    life10_27 = java.lang.Float.intBitsToFloat(((int)((p1)[(life7_8 + 2)])));
    if (!((recovery.source.CarrierOps.fcmpg(((float)(life8_13)), ((float)(-0x1.99999ap-4f))) >= 0))) {
        break forward_join_36;
    }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(life8_13)), ((float)(0x1.19999ap0f))) >= 0))) {
        break forward_join_42;
    }
    }
    life8_13 = (life8_13 - ((float) moom.Dr.a__Int(((float)(life8_13)))));
    }
    if (!((recovery.source.CarrierOps.fcmpg(((float)(life9_20)), ((float)(-0x1.99999ap-4f))) >= 0))) {
        break forward_join_50;
    }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(life9_20)), ((float)(0x1.19999ap0f))) >= 0))) {
        break forward_join_56;
    }
    }
    life9_20 = (life9_20 - ((float) moom.Dr.a__Int(((float)(life9_20)))));
    }
    if (!((recovery.source.CarrierOps.fcmpg(((float)(life10_27)), ((float)(-0x1.99999ap-4f))) >= 0))) {
        break forward_join_64;
    }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(life10_27)), ((float)(0x1.19999ap0f))) >= 0))) {
        break forward_join_70;
    }
    }
    life10_27 = (life10_27 - ((float) moom.Dr.a__Int(((float)(life10_27)))));
    }
    life11_80 = 0x0.0p0f;
    life12_82 = 0x0.0p0f;
    switch ((net.minecraft.client.renderer.block.model.FaceBakery$1.a)[((moom.bs)(p2)).ordinal()]) {
case 1:
{
        break forward_join_79;
    }
case 6:
{
        break forward_join_90;
    }
case 2:
{
        break forward_join_99;
    }
case 3:
{
        break forward_join_112;
    }
case 4:
{
        break forward_join_123;
    }
case 5:
{
        break forward_join_134;
    }
default:
{
        break forward_join_146;
    }
}
    }
    life11_80 = (life8_13 * 0x1.0p4f);
    life12_82 = ((0x1.0p0f - life10_27) * 0x1.0p4f);
    break forward_join_146;
    }
    life11_80 = (life8_13 * 0x1.0p4f);
    life12_82 = (life10_27 * 0x1.0p4f);
    break forward_join_146;
    }
    life11_80 = ((0x1.0p0f - life8_13) * 0x1.0p4f);
    life12_82 = ((0x1.0p0f - life9_20) * 0x1.0p4f);
    break forward_join_146;
    }
    life11_80 = (life8_13 * 0x1.0p4f);
    life12_82 = ((0x1.0p0f - life9_20) * 0x1.0p4f);
    break forward_join_146;
    }
    life11_80 = (life10_27 * 0x1.0p4f);
    life12_82 = ((0x1.0p0f - life9_20) * 0x1.0p4f);
    break forward_join_146;
    }
    life11_80 = ((0x1.0p0f - life10_27) * 0x1.0p4f);
    life12_82 = ((0x1.0p0f - life9_20) * 0x1.0p4f);
    }
    life13_160 = (((moom.lE)(p3)).b__Int(((int)(p0))) * life6_4);
    (p1)[(life13_160 + 4)] = java.lang.Float.floatToRawIntBits(((float)(((net.minecraft.client.renderer.texture.TextureAtlasSprite)(p4)).a(((double)(((double) life11_80)))))));
    (p1)[((life13_160 + 4) + 1)] = java.lang.Float.floatToRawIntBits(((float)(((net.minecraft.client.renderer.texture.TextureAtlasSprite)(p4)).b(((double)(((double) life12_82)))))));
    return;
}


private float[] a(org.lwjgl.util.vector.Vector3f p0, org.lwjgl.util.vector.Vector3f p1) {
float[] local3_life1 = new float[(moom.bs.values()).length];
    (local3_life1)[moom.kW.f] = (((org.lwjgl.util.vector.Vector3f)(p0)).x / 0x1.0000000000000p+4F);
    (local3_life1)[moom.kW.e] = (((org.lwjgl.util.vector.Vector3f)(p0)).y / 0x1.0000000000000p+4F);
    (local3_life1)[moom.kW.d] = (((org.lwjgl.util.vector.Vector3f)(p0)).z / 0x1.0000000000000p+4F);
    (local3_life1)[moom.kW.c] = (((org.lwjgl.util.vector.Vector3f)(p1)).x / 0x1.0000000000000p+4F);
    (local3_life1)[moom.kW.b] = (((org.lwjgl.util.vector.Vector3f)(p1)).y / 0x1.0000000000000p+4F);
    (local3_life1)[moom.kW.a] = (((org.lwjgl.util.vector.Vector3f)(p1)).z / 0x1.0000000000000p+4F);
    return local3_life1;
}


public static float a(moom.bs p0) {
switch ((net.minecraft.client.renderer.block.model.FaceBakery$1.a)[((moom.bs)(p0)).ordinal()]) {
case 1:
{
        if (moom.BU.ap()) {
        return moom.MP.eu;
    }
        return 0x1.0p-1f;
    }
case 2:
case 3:
{
        if (moom.BU.ap()) {
        return moom.MP.ew;
    }
        return 0x1.99999ap-1f;
    }
case 4:
case 5:
{
        if (moom.BU.ap()) {
        return moom.MP.ev;
    }
        return 0x1.333334p-1f;
    }
default:
{
        return 0x1.0p0f;
    }
}
}


private int a__Int(moom.bs p0) {
long local2 = (moom.lN.c ^ 54594600130272L);
    float local4 = moom.lN.a(((moom.bs)(p0)));
    int local5 = moom.Dr.a(((int)(((int) (local4 * 0x1.fep7f)))), ((int)(0)), ((int)(__sourceIntrinsic_2c5e45f4b060_originalDynamicSite1545_2(2031, (4625896042169060649L ^ local2)))));
    return (((__sourceIntrinsic_2c5e45f4b060_originalDynamicSite1545_4(5289, (1212641643677572714L ^ local2)) | (local5 << __sourceIntrinsic_2c5e45f4b060_originalDynamicSite1545_5(32050, (5136132537818167283L ^ local2)))) | (local5 << __sourceIntrinsic_2c5e45f4b060_originalDynamicSite1545_6(5200, (1124597603847626384L ^ local2)))) | local5);
}


private int[] a(net.minecraft.client.renderer.block.model.BlockPartFace p0, net.minecraft.client.renderer.texture.TextureAtlasSprite p1, moom.bs p2, float[] p3, moom.I2 p4, net.minecraft.client.renderer.block.model.BlockPartRotation p5, boolean p6, boolean p7) {
long local9 = (moom.lN.c ^ 44148742443811L);
    int local11 = __sourceIntrinsic_d202bde30ed4_invokedynamic8299_1(7353, (2327703832835118008L ^ local9));
    if (moom.BU.ap()) {
        local11 = __sourceIntrinsic_d202bde30ed4_invokedynamic8299_3(2377, (7206641613269616205L ^ local9));
    }
    int[] local12 = new int[local11];
    int local13 = 0;
    while ((local13 < 4)) {
        ((moom.lN)(this)).a(((int[])(local12)), ((int)(local13)), ((moom.bs)(p2)), ((net.minecraft.client.renderer.block.model.BlockPartFace)(p0)), ((float[])(p3)), ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(p1)), ((moom.I2)(p4)), ((net.minecraft.client.renderer.block.model.BlockPartRotation)(p5)), ((boolean)(p6)), ((boolean)(p7)));
        local13 += 1;
    }
    return local12;
}


public moom.lC a(org.lwjgl.util.vector.Vector3f p0, org.lwjgl.util.vector.Vector3f p1, net.minecraft.client.renderer.block.model.BlockPartFace p2, net.minecraft.client.renderer.texture.TextureAtlasSprite p3, moom.bs p4, moom.I2 p5, net.minecraft.client.renderer.block.model.BlockPartRotation p6, boolean p7, boolean p8) {
int[] life10_13;
    moom.bs life11_16;
    life10_13 = ((moom.lN)(this)).a(((net.minecraft.client.renderer.block.model.BlockPartFace)(p2)), ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(p3)), ((moom.bs)(p4)), ((float[])(((moom.lN)(this)).a(((org.lwjgl.util.vector.Vector3f)(p0)), ((org.lwjgl.util.vector.Vector3f)(p1))))), ((moom.I2)(p5)), ((net.minecraft.client.renderer.block.model.BlockPartRotation)(p6)), ((boolean)(p7)), ((boolean)(p8)));
    life11_16 = moom.lN.a(((int[])(life10_13)));
    if (p7) {
        ((moom.lN)(this)).a(((int[])(life10_13)), ((moom.bs)(life11_16)), ((moom.lE)(((net.minecraft.client.renderer.block.model.BlockPartFace)(p2)).e)), ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(p3)));
    }
    if ((p6 == null)) {
        ((moom.lN)(this)).a(((int[])(life10_13)), ((moom.bs)(life11_16)));
    }
    return new moom.lC(life10_13, ((net.minecraft.client.renderer.block.model.BlockPartFace)(p2)).c, life11_16);
}


public moom.lC a(org.lwjgl.util.vector.Vector3f p0, org.lwjgl.util.vector.Vector3f p1, net.minecraft.client.renderer.block.model.BlockPartFace p2, net.minecraft.client.renderer.texture.TextureAtlasSprite p3, moom.bs p4, net.minecraft.client.resources.model.ModelRotation p5, net.minecraft.client.renderer.block.model.BlockPartRotation p6, boolean p7, boolean p8) {
return ((moom.lN)(this)).a(((org.lwjgl.util.vector.Vector3f)(p0)), ((org.lwjgl.util.vector.Vector3f)(p1)), ((net.minecraft.client.renderer.block.model.BlockPartFace)(p2)), ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(p3)), ((moom.bs)(p4)), ((moom.I2)(p5)), ((net.minecraft.client.renderer.block.model.BlockPartRotation)(p6)), ((boolean)(p7)), ((boolean)(p8)));
}


public int a(org.lwjgl.util.vector.Vector3f p0, moom.bs p1, int p2, moom.I2 p3, boolean p4) {
if ((p3 == net.minecraft.client.resources.model.ModelRotation.X0_Y0)) {
        return p2;
    }
    ((moom.lN)(this)).a(((org.lwjgl.util.vector.Vector3f)(p0)), ((org.lwjgl.util.vector.Vector3f)(new org.lwjgl.util.vector.Vector3f(0x1.0p-1f, 0x1.0p-1f, 0x1.0p-1f))), ((org.lwjgl.util.vector.Matrix4f)(((net.minecraft.client.resources.model.ModelRotation)(((net.minecraft.client.resources.model.ModelRotation)(p3)))).b())), ((org.lwjgl.util.vector.Vector3f)(new org.lwjgl.util.vector.Vector3f(0x1.0p0f, 0x1.0p0f, 0x1.0p0f))));
    return ((moom.I2)(p3)).a(((moom.bs)(p1)), ((int)(p2)));
}


public int a(org.lwjgl.util.vector.Vector3f p0, moom.bs p1, int p2, net.minecraft.client.resources.model.ModelRotation p3, boolean p4) {
return ((moom.lN)(this)).a(((org.lwjgl.util.vector.Vector3f)(p0)), ((moom.bs)(p1)), ((int)(p2)), ((net.minecraft.client.resources.model.ModelRotation)(p3)), ((boolean)(p4)));
}


private void a(org.lwjgl.util.vector.Vector3f p0, net.minecraft.client.renderer.block.model.BlockPartRotation p1) { __sourceHandlerCall_da291bf96679322e844e(this, p0, p1); }


private void a(int[] p0, int p1, int p2, org.lwjgl.util.vector.Vector3f p3, int p4, net.minecraft.client.renderer.texture.TextureAtlasSprite p5, moom.lE p6) {
int local8 = ((p0).length / 4);
    int local9 = (p1 * local8);
    (p0)[local9] = java.lang.Float.floatToRawIntBits(((float)(((org.lwjgl.util.vector.Vector3f)(p3)).x)));
    (p0)[(local9 + 1)] = java.lang.Float.floatToRawIntBits(((float)(((org.lwjgl.util.vector.Vector3f)(p3)).y)));
    (p0)[(local9 + 2)] = java.lang.Float.floatToRawIntBits(((float)(((org.lwjgl.util.vector.Vector3f)(p3)).z)));
    (p0)[(local9 + 3)] = p4;
    (p0)[(local9 + 4)] = java.lang.Float.floatToRawIntBits(((float)(((net.minecraft.client.renderer.texture.TextureAtlasSprite)(p5)).a(((double)(((((double) ((moom.lE)(p6)).a(((int)(p2)))) * 0x1.ff7ced916872bp-1d) + (((double) ((moom.lE)(p6)).a(((int)(((p2 + 2) % 4))))) * 0x1.0624dd2f1a9fcp-10d))))))));
    (p0)[((local9 + 4) + 1)] = java.lang.Float.floatToRawIntBits(((float)(((net.minecraft.client.renderer.texture.TextureAtlasSprite)(p5)).b(((double)(((((double) ((moom.lE)(p6)).b(((int)(p2)))) * 0x1.ff7ced916872bp-1d) + (((double) ((moom.lE)(p6)).b(((int)(((p2 + 2) % 4))))) * 0x1.0624dd2f1a9fcp-10d))))))));
    return;
}


private void a(int[] p0, int p1, moom.bs p2, net.minecraft.client.renderer.block.model.BlockPartFace p3, float[] p4, net.minecraft.client.renderer.texture.TextureAtlasSprite p5, moom.I2 p6, net.minecraft.client.renderer.block.model.BlockPartRotation p7, boolean p8, boolean p9) {
moom.bs life11_3;
    int life12_13;
    moom.kX life13_18;
    org.lwjgl.util.vector.Vector3f life14_34;
    int life15_46;
    life11_3 = ((moom.I2)(p6)).a(((moom.bs)(p2)));
    life12_13 = (p9 ? ((moom.lN)(this)).a__Int(((moom.bs)(life11_3))) : -1);
    life13_18 = ((moom.aD)(moom.aD.a(((moom.bs)(p2))))).a(((int)(p1)));
    life14_34 = new org.lwjgl.util.vector.Vector3f((p4)[((moom.kX)(life13_18)).a], (p4)[((moom.kX)(life13_18)).b], (p4)[((moom.kX)(life13_18)).c]);
    ((moom.lN)(this)).a(((org.lwjgl.util.vector.Vector3f)(life14_34)), ((net.minecraft.client.renderer.block.model.BlockPartRotation)(p7)));
    life15_46 = ((moom.lN)(this)).a(((org.lwjgl.util.vector.Vector3f)(life14_34)), ((moom.bs)(p2)), ((int)(p1)), ((moom.I2)(p6)), ((boolean)(p8)));
    moom.LY.a(((org.lwjgl.util.vector.Vector3f)(life14_34)));
    ((moom.lN)(this)).a(((int[])(p0)), ((int)(life15_46)), ((int)(p1)), ((org.lwjgl.util.vector.Vector3f)(life14_34)), ((int)(life12_13)), ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(p5)), ((moom.lE)(((net.minecraft.client.renderer.block.model.BlockPartFace)(p3)).e)));
    return;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral8296_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d202bde30ed4_invokedynamic8299_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d202bde30ed4_invokedynamic8299_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2c5e45f4b060_originalDynamicSite1545_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2c5e45f4b060_originalDynamicSite1545_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2c5e45f4b060_originalDynamicSite1545_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2c5e45f4b060_originalDynamicSite1545_6(int a0, long a1) throws E;
}
