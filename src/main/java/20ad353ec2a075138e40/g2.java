package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class g2 extends net.minecraft.client.gui.GuiScreen {

private static java.util.List<moom.hZ> w;

private moom.ic x;

private moom.gc y;

private moom.hJ z;

private moom.gN A;

protected java.lang.String B;

private java.lang.String C;

private java.lang.String D;

private static long E;

private static long[] F;

private static java.lang.Integer[] G;

private static java.util.Map H;

public g2(moom.gN p0) {
super();
    this.B = "Customize World Presets";
    this.A = p0;
}


static {
E = ((long)(((moom._a)(moom._c.a(((long)(4778926902893738500L)), ((long)(7032057490129725180L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(145281800008805L)))));
    H = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.g2.E ^ 12296023648345L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1203_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1203_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1203_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1203_14 = new byte[8];
    (__sourceSpill1203_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1203_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1203_16 = __sourceSpill1203_14;
    ((javax.crypto.Cipher)(__sourceSpill1203_11)).init(((int)(__sourceSpill1203_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1203_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1203_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[17];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "Ý¬+ûe^z2SµîÇÐw\003âÞâ®ðqUØ4^\013ÏÌJÉÐúÄH \022Nëã\027+0ßÿOII?©?æK#¦\026\031ñ´%\024äjòýú´\facônÀõZé\020y,ò_»¼_\031ðí\017NÈó£°ìÿ9\024Èññ"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1203_25 = local6_life21;
        int __sourceSpill1203_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1203_25)).substring(((int)(__sourceSpill1203_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1203_30 = local8_life19;
        int __sourceSpill1203_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1203_33 = new byte[8];
        (__sourceSpill1203_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1203_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1203_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1203_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1203_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1203_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1203_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1203_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1203_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1203_34)).doFinal(((byte[])(__sourceSpill1203_33)));
        (__sourceSpill1203_30)[__sourceSpill1203_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "±bVæð$\027@Ü\022h"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1203_38 = local6_life21;
        int __sourceSpill1203_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1203_38)).substring(((int)(__sourceSpill1203_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1203_43 = local8_life19;
        int __sourceSpill1203_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1203_46 = new byte[8];
        (__sourceSpill1203_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1203_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1203_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1203_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1203_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1203_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1203_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1203_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1203_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1203_47)).doFinal(((byte[])(__sourceSpill1203_46)));
        (__sourceSpill1203_43)[__sourceSpill1203_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    F = ((long[])(local8_life19));
    G = ((java.lang.Integer[])(new java.lang.Integer[17]));
    w = ((java.util.List)(com.google.common.collect.Lists.newArrayList()));
    moom.FE local13_life55 = moom.FE.a(((java.lang.String)("{ \"coordinateScale\":684.412, \"heightScale\":684.412, \"upperLimitScale\":512.0, \"lowerLimitScale\":512.0, \"depthNoiseScaleX\":200.0, \"depthNoiseScaleZ\":200.0, \"depthNoiseScaleExponent\":0.5, \"mainNoiseScaleX\":5000.0, \"mainNoiseScaleY\":1000.0, \"mainNoiseScaleZ\":5000.0, \"baseSize\":8.5, \"stretchY\":8.0, \"biomeDepthWeight\":2.0, \"biomeDepthOffset\":0.5, \"biomeScaleWeight\":2.0, \"biomeScaleOffset\":0.375, \"useCaves\":true, \"useDungeons\":true, \"dungeonChance\":8, \"useStrongholds\":true, \"useVillages\":true, \"useMineShafts\":true, \"useTemples\":true, \"useRavines\":true, \"useWaterLakes\":true, \"waterLakeChance\":4, \"useLavaLakes\":true, \"lavaLakeChance\":80, \"useLavaOceans\":false, \"seaLevel\":255 }")));
    moom.DD local14_life56 = new moom.DD("textures/gui/presets/water.png");
    ((java.util.List)(moom.g2.w)).add(((java.lang.Object)(new moom.hZ(moom.oO.a(((java.lang.String)("createWorld.customize.custom.preset.waterWorld")), ((java.lang.Object[])(new java.lang.Object[0]))), local14_life56, local13_life55))));
    local13_life55 = moom.FE.a(((java.lang.String)("{\"coordinateScale\":3000.0, \"heightScale\":6000.0, \"upperLimitScale\":250.0, \"lowerLimitScale\":512.0, \"depthNoiseScaleX\":200.0, \"depthNoiseScaleZ\":200.0, \"depthNoiseScaleExponent\":0.5, \"mainNoiseScaleX\":80.0, \"mainNoiseScaleY\":160.0, \"mainNoiseScaleZ\":80.0, \"baseSize\":8.5, \"stretchY\":10.0, \"biomeDepthWeight\":1.0, \"biomeDepthOffset\":0.0, \"biomeScaleWeight\":1.0, \"biomeScaleOffset\":0.0, \"useCaves\":true, \"useDungeons\":true, \"dungeonChance\":8, \"useStrongholds\":true, \"useVillages\":true, \"useMineShafts\":true, \"useTemples\":true, \"useRavines\":true, \"useWaterLakes\":true, \"waterLakeChance\":4, \"useLavaLakes\":true, \"lavaLakeChance\":80, \"useLavaOceans\":false, \"seaLevel\":63 }")));
    local14_life56 = new moom.DD("textures/gui/presets/isles.png");
    ((java.util.List)(moom.g2.w)).add(((java.lang.Object)(new moom.hZ(moom.oO.a(((java.lang.String)("createWorld.customize.custom.preset.isleLand")), ((java.lang.Object[])(new java.lang.Object[0]))), local14_life56, local13_life55))));
    local13_life55 = moom.FE.a(((java.lang.String)("{\"coordinateScale\":684.412, \"heightScale\":684.412, \"upperLimitScale\":512.0, \"lowerLimitScale\":512.0, \"depthNoiseScaleX\":200.0, \"depthNoiseScaleZ\":200.0, \"depthNoiseScaleExponent\":0.5, \"mainNoiseScaleX\":5000.0, \"mainNoiseScaleY\":1000.0, \"mainNoiseScaleZ\":5000.0, \"baseSize\":8.5, \"stretchY\":5.0, \"biomeDepthWeight\":2.0, \"biomeDepthOffset\":1.0, \"biomeScaleWeight\":4.0, \"biomeScaleOffset\":1.0, \"useCaves\":true, \"useDungeons\":true, \"dungeonChance\":8, \"useStrongholds\":true, \"useVillages\":true, \"useMineShafts\":true, \"useTemples\":true, \"useRavines\":true, \"useWaterLakes\":true, \"waterLakeChance\":4, \"useLavaLakes\":true, \"lavaLakeChance\":80, \"useLavaOceans\":false, \"seaLevel\":63 }")));
    local14_life56 = new moom.DD("textures/gui/presets/delight.png");
    ((java.util.List)(moom.g2.w)).add(((java.lang.Object)(new moom.hZ(moom.oO.a(((java.lang.String)("createWorld.customize.custom.preset.caveDelight")), ((java.lang.Object[])(new java.lang.Object[0]))), local14_life56, local13_life55))));
    local13_life55 = moom.FE.a(((java.lang.String)("{\"coordinateScale\":738.41864, \"heightScale\":157.69133, \"upperLimitScale\":801.4267, \"lowerLimitScale\":1254.1643, \"depthNoiseScaleX\":374.93652, \"depthNoiseScaleZ\":288.65228, \"depthNoiseScaleExponent\":1.2092624, \"mainNoiseScaleX\":1355.9908, \"mainNoiseScaleY\":745.5343, \"mainNoiseScaleZ\":1183.464, \"baseSize\":1.8758626, \"stretchY\":1.7137525, \"biomeDepthWeight\":1.7553768, \"biomeDepthOffset\":3.4701107, \"biomeScaleWeight\":1.0, \"biomeScaleOffset\":2.535211, \"useCaves\":true, \"useDungeons\":true, \"dungeonChance\":8, \"useStrongholds\":true, \"useVillages\":true, \"useMineShafts\":true, \"useTemples\":true, \"useRavines\":true, \"useWaterLakes\":true, \"waterLakeChance\":4, \"useLavaLakes\":true, \"lavaLakeChance\":80, \"useLavaOceans\":false, \"seaLevel\":63 }")));
    local14_life56 = new moom.DD("textures/gui/presets/madness.png");
    ((java.util.List)(moom.g2.w)).add(((java.lang.Object)(new moom.hZ(moom.oO.a(((java.lang.String)("createWorld.customize.custom.preset.mountains")), ((java.lang.Object[])(new java.lang.Object[0]))), local14_life56, local13_life55))));
    local13_life55 = moom.FE.a(((java.lang.String)("{\"coordinateScale\":684.412, \"heightScale\":684.412, \"upperLimitScale\":512.0, \"lowerLimitScale\":512.0, \"depthNoiseScaleX\":200.0, \"depthNoiseScaleZ\":200.0, \"depthNoiseScaleExponent\":0.5, \"mainNoiseScaleX\":1000.0, \"mainNoiseScaleY\":3000.0, \"mainNoiseScaleZ\":1000.0, \"baseSize\":8.5, \"stretchY\":10.0, \"biomeDepthWeight\":1.0, \"biomeDepthOffset\":0.0, \"biomeScaleWeight\":1.0, \"biomeScaleOffset\":0.0, \"useCaves\":true, \"useDungeons\":true, \"dungeonChance\":8, \"useStrongholds\":true, \"useVillages\":true, \"useMineShafts\":true, \"useTemples\":true, \"useRavines\":true, \"useWaterLakes\":true, \"waterLakeChance\":4, \"useLavaLakes\":true, \"lavaLakeChance\":80, \"useLavaOceans\":false, \"seaLevel\":20 }")));
    local14_life56 = new moom.DD("textures/gui/presets/drought.png");
    ((java.util.List)(moom.g2.w)).add(((java.lang.Object)(new moom.hZ(moom.oO.a(((java.lang.String)("createWorld.customize.custom.preset.drought")), ((java.lang.Object[])(new java.lang.Object[0]))), local14_life56, local13_life55))));
    local13_life55 = moom.FE.a(((java.lang.String)("{\"coordinateScale\":684.412, \"heightScale\":684.412, \"upperLimitScale\":2.0, \"lowerLimitScale\":64.0, \"depthNoiseScaleX\":200.0, \"depthNoiseScaleZ\":200.0, \"depthNoiseScaleExponent\":0.5, \"mainNoiseScaleX\":80.0, \"mainNoiseScaleY\":160.0, \"mainNoiseScaleZ\":80.0, \"baseSize\":8.5, \"stretchY\":12.0, \"biomeDepthWeight\":1.0, \"biomeDepthOffset\":0.0, \"biomeScaleWeight\":1.0, \"biomeScaleOffset\":0.0, \"useCaves\":true, \"useDungeons\":true, \"dungeonChance\":8, \"useStrongholds\":true, \"useVillages\":true, \"useMineShafts\":true, \"useTemples\":true, \"useRavines\":true, \"useWaterLakes\":true, \"waterLakeChance\":4, \"useLavaLakes\":true, \"lavaLakeChance\":80, \"useLavaOceans\":false, \"seaLevel\":6 }")));
    local14_life56 = new moom.DD("textures/gui/presets/chaos.png");
    ((java.util.List)(moom.g2.w)).add(((java.lang.Object)(new moom.hZ(moom.oO.a(((java.lang.String)("createWorld.customize.custom.preset.caveChaos")), ((java.lang.Object[])(new java.lang.Object[0]))), local14_life56, local13_life55))));
    local13_life55 = moom.FE.a(((java.lang.String)("{\"coordinateScale\":684.412, \"heightScale\":684.412, \"upperLimitScale\":512.0, \"lowerLimitScale\":512.0, \"depthNoiseScaleX\":200.0, \"depthNoiseScaleZ\":200.0, \"depthNoiseScaleExponent\":0.5, \"mainNoiseScaleX\":80.0, \"mainNoiseScaleY\":160.0, \"mainNoiseScaleZ\":80.0, \"baseSize\":8.5, \"stretchY\":12.0, \"biomeDepthWeight\":1.0, \"biomeDepthOffset\":0.0, \"biomeScaleWeight\":1.0, \"biomeScaleOffset\":0.0, \"useCaves\":true, \"useDungeons\":true, \"dungeonChance\":8, \"useStrongholds\":true, \"useVillages\":true, \"useMineShafts\":true, \"useTemples\":true, \"useRavines\":true, \"useWaterLakes\":true, \"waterLakeChance\":4, \"useLavaLakes\":true, \"lavaLakeChance\":80, \"useLavaOceans\":true, \"seaLevel\":40 }")));
    local14_life56 = new moom.DD("textures/gui/presets/luck.png");
    ((java.util.List)(moom.g2.w)).add(((java.lang.Object)(new moom.hZ(moom.oO.a(((java.lang.String)("createWorld.customize.custom.preset.goodLuck")), ((java.lang.Object[])(new java.lang.Object[0]))), local14_life56, local13_life55))));
}

private static native <E extends Throwable> void __sourceHandlerCall_65249da7f6a550bb2836(moom.g2 a0, moom.gc a1) throws E;
private static final class __SourceHandler_65249da7f6a550bb2836 {

public static void f842(moom.g2 receiver, moom.gc p0) throws Throwable {
    forest_join_20: {
    forest_join_15: {
    forest_join_3: {
    switch (__fieldRead842_0(p0)) {
case 0:
{
        break forest_join_3;
    }
case 1:
{
        break forest_join_15;
    }
default:
{
        break forest_join_20;
    }
}
    }
    __call842_4(__fieldRead842_1(receiver), __call842_3(__fieldRead842_2(receiver)));
    __call842_7(__fieldRead842_5(receiver), __fieldRead842_6(receiver));
    break forest_join_20;
    }
    __call842_10(__fieldRead842_8(receiver), __fieldRead842_9(receiver));
    }
    return;
}
public static void h842_0(java.io.IOException p0) throws Throwable {
    throw __call3084200_0(p0);
}
private static native int __fieldRead842_0(moom.gc a0) throws Throwable;
private static native moom.gN __fieldRead842_1(moom.g2 a0) throws Throwable;
private static native moom.hJ __fieldRead842_2(moom.g2 a0) throws Throwable;
private static native java.lang.String __call842_3(moom.hJ a0) throws Throwable;
private static native void __call842_4(moom.gN a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead842_5(moom.g2 a0) throws Throwable;
private static native moom.gN __fieldRead842_6(moom.g2 a0) throws Throwable;
private static native void __call842_7(net.minecraft.client.Minecraft a0, moom.gN a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead842_8(moom.g2 a0) throws Throwable;
private static native moom.gN __fieldRead842_9(moom.g2 a0) throws Throwable;
private static native void __call842_10(net.minecraft.client.Minecraft a0, moom.gN a1) throws Throwable;
private static native java.lang.Exception __call3084200_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_19e1063e0ea4589207ed(moom.g2 a0) throws E;
private static final class __SourceHandler_19e1063e0ea4589207ed {

public static boolean f1029(moom.g2 receiver) throws Throwable {
    int forwardValue1029_20_0;
    forward_join_20: {
    forward_join_19: {
    forward_join_17: {
    forward_join_11: {
    if (!((__fieldRead1029_1(__fieldRead1029_0(receiver)) > -1))) {
        break forward_join_11;
    }
    if (!((__fieldRead1029_3(__fieldRead1029_2(receiver)) >= __call1029_5(__fieldRead1029_4())))) {
        break forward_join_17;
    }
    }
    if (!((__call1029_8(__call1029_7(__fieldRead1029_6(receiver))) > 1))) {
        break forward_join_19;
    }
    }
    forwardValue1029_20_0 = 1;
    break forward_join_20;
    }
    forwardValue1029_20_0 = 0;
    }
    return __integerCategory1029_9(forwardValue1029_20_0);
}
public static void h1029_0(moom.Oo p0) throws Throwable {
    throw __call1102900_0(p0);
}
public static void h1029_1(moom.Oo p0) throws Throwable {
    throw __call1102901_0(p0);
}
public static void h1029_2(moom.Oo p0) throws Throwable {
    throw __call1102902_0(p0);
}
private static native moom.ic __fieldRead1029_0(moom.g2 a0) throws Throwable;
private static native int __fieldRead1029_1(moom.ic a0) throws Throwable;
private static native moom.ic __fieldRead1029_2(moom.g2 a0) throws Throwable;
private static native int __fieldRead1029_3(moom.ic a0) throws Throwable;
private static native java.util.List __fieldRead1029_4() throws Throwable;
private static native int __call1029_5(java.util.List a0) throws Throwable;
private static native moom.hJ __fieldRead1029_6(moom.g2 a0) throws Throwable;
private static native java.lang.String __call1029_7(moom.hJ a0) throws Throwable;
private static native int __call1029_8(java.lang.String a0) throws Throwable;
private static native boolean __integerCategory1029_9(int value) throws Throwable;
private static native java.lang.Exception __call1102900_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1102901_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1102902_0(moom.Oo a0) throws Throwable;

}


public void e() throws java.io.IOException {
super.e();
    ((moom.ic)(this.x)).c__Void();
    return;
}


private boolean e__Boolean() { return __sourceHandlerCall_19e1063e0ea4589207ed(this); }


public void c__Void() {
java.util.List spill100110_0;
    moom.gc spill100110_1;
    long life1_3;
    life1_3 = (moom.g2.E ^ 33245695966727L);
    ((java.util.List)(this.m)).clear();
    org.lwjgl.input.Keyboard.enableRepeatEvents(((boolean)(true)));
    this.B = ((java.lang.String)(moom.oO.a(((java.lang.String)("createWorld.customize.custom.presets.title")), ((java.lang.Object[])(new java.lang.Object[0])))));
    this.C = ((java.lang.String)(moom.oO.a(((java.lang.String)("createWorld.customize.presets.share")), ((java.lang.Object[])(new java.lang.Object[0])))));
    this.D = ((java.lang.String)(moom.oO.a(((java.lang.String)("createWorld.customize.presets.list")), ((java.lang.Object[])(new java.lang.Object[0])))));
    this.z = ((moom.hJ)(new moom.hJ(2, this.p, __sourceIntrinsic_7ac46ee229a8_invokedynamic100110_11(6900, (8042745533289762262L ^ life1_3)), __sourceIntrinsic_7ac46ee229a8_invokedynamic100110_12(7454, (8783663952066677307L ^ life1_3)), (this.k - __sourceIntrinsic_7ac46ee229a8_invokedynamic100110_14(30516, (3542175203732086803L ^ life1_3))), __sourceIntrinsic_7ac46ee229a8_invokedynamic100110_15(21007, (7493613855261443379L ^ life1_3)))));
    this.x = ((moom.ic)(new moom.ic(this)));
    ((moom.hJ)(this.z)).e(((int)(__sourceIntrinsic_7ac46ee229a8_invokedynamic100110_19(25499, (3452139183435510966L ^ life1_3)))));
    ((moom.hJ)(this.z)).a(((java.lang.String)(((moom.gN)(this.A)).c())));
    spill100110_0 = this.m;
    moom.g2 __stackOp100110_33_0 = this;
    moom.gc __stackOp100110_33_1 = new moom.gc(0, ((this.k / 2) - __sourceIntrinsic_7ac46ee229a8_invokedynamic100110_27(15487, (3561595735661456209L ^ life1_3))), (this.l - __sourceIntrinsic_7ac46ee229a8_invokedynamic100110_29(21308, (5254998097919034390L ^ life1_3))), __sourceIntrinsic_7ac46ee229a8_invokedynamic100110_30(8807, (3143314957722236232L ^ life1_3)), __sourceIntrinsic_7ac46ee229a8_invokedynamic100110_31(9125, (4196900729049166981L ^ life1_3)), moom.oO.a(((java.lang.String)("createWorld.customize.presets.select")), ((java.lang.Object[])(new java.lang.Object[0]))));
    spill100110_1 = __stackOp100110_33_1;
    ((moom.g2)(__stackOp100110_33_0)).y = ((moom.gc)(__stackOp100110_33_1));
    ((java.util.List)(spill100110_0)).add(((java.lang.Object)(spill100110_1)));
    ((java.util.List)(this.m)).add(((java.lang.Object)(new moom.gc(1, ((this.k / 2) + 3), (this.l - __sourceIntrinsic_7ac46ee229a8_invokedynamic100110_39(32179, (8031182504171301520L ^ life1_3))), __sourceIntrinsic_7ac46ee229a8_invokedynamic100110_40(8807, (3143314957722236232L ^ life1_3)), __sourceIntrinsic_7ac46ee229a8_invokedynamic100110_41(9125, (4196900729049166981L ^ life1_3)), moom.oO.a(((java.lang.String)("gui.cancel")), ((java.lang.Object[])(new java.lang.Object[0])))))));
    ((moom.g2)(this)).a();
    return;
}


public void h() {
org.lwjgl.input.Keyboard.enableRepeatEvents(((boolean)(false)));
    return;
}


public void a() {
((moom.gc)(this.y)).m = ((boolean)(((moom.g2)(this)).e__Boolean()));
    return;
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 17499;
      if (G[var3] == null) {
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
         long var5 = F[var3];
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
         Object[] var9 = (Object[])H.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               H.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/g2", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         G[var3] = var15;
      }

      return G[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.g2.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


protected void a(int p0, int p1, int p2) throws java.io.IOException {
((moom.hJ)(this.z)).a(((int)(p0)), ((int)(p1)), ((int)(p2)));
    super.a(((int)(p0)), ((int)(p1)), ((int)(p2)));
    return;
}


protected void a(char p0, int p1) throws java.io.IOException {
try {
        if ((!((moom.hJ)(this.z)).a(((char)(p0)), ((int)(p1))))) {
        super.a(((char)(p0)), ((int)(p1)));
    }
    } catch (java.io.IOException caught_rethrow_0) {
        throw moom.g2.a(((java.lang.Exception)(caught_rethrow_0)));
    }
    return;
}


protected void a__Void(moom.gc p0) throws java.io.IOException { __sourceHandlerCall_65249da7f6a550bb2836(this, p0); }


public void a(int p0, int p1, float p2) {
long local4 = (moom.g2.E ^ 38895712762753L);
    ((moom.g2)(this)).i();
    ((moom.ic)(this.x)).a(((int)(p0)), ((int)(p1)), ((float)(p2)));
    ((moom.g2)(this)).a(((net.minecraft.client.gui.FontRenderer)(this.p)), ((java.lang.String)(this.B)), ((int)((this.k / 2))), ((int)(__sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1439_7(8797, (608796597681139959L ^ local4)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1439_8(7131, (5195843227906378105L ^ local4)))));
    ((moom.g2)(this)).b(((net.minecraft.client.gui.FontRenderer)(this.p)), ((java.lang.String)(this.C)), ((int)(__sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1439_12(16652, (3756616945354625955L ^ local4)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1439_13(6403, (4280654715635207076L ^ local4)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1439_14(22723, (3731812310439578221L ^ local4)))));
    ((moom.g2)(this)).b(((net.minecraft.client.gui.FontRenderer)(this.p)), ((java.lang.String)(this.D)), ((int)(__sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1439_18(6900, (8042777129212512336L ^ local4)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1439_19(21779, (2615751821186156478L ^ local4)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1439_20(29326, (1974944715871674414L ^ local4)))));
    ((moom.hJ)(this.z)).d__Void();
    super.a(((int)(p0)), ((int)(p1)), ((float)(p2)));
    return;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral7664_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/g2"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void g() {
((moom.hJ)(this.z)).a__Void();
    super.g();
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1439_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1439_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1439_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1439_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1439_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1439_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1439_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1439_20(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral7664_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic100110_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic100110_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic100110_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic100110_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic100110_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic100110_27(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic100110_29(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic100110_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic100110_31(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic100110_39(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic100110_40(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic100110_41(int a0, long a1) throws E;
}
