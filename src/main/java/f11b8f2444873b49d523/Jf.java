package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Jf {

private static final long a;

private static final long[] b;

private static final java.lang.Integer[] c;

private static final java.util.Map d;

public Jf() {
super();
}


static {
a = ((long)(((moom._a)(moom._c.a(((long)(-3339110170998079619L)), ((long)(2482785351311571536L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(109084488442543L)))));
    d = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.Jf.a ^ 24459153951638L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill896_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill896_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill896_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill896_14 = new byte[8];
    (__sourceSpill896_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill896_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation896_16 = __sourceSpill896_14;
    ((javax.crypto.Cipher)(__sourceSpill896_11)).init(((int)(__sourceSpill896_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill896_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation896_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[4];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "\023{;îÖù1`Ð~Þ\b6ß\036"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill896_25 = local6_life21;
        int __sourceSpill896_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill896_25)).substring(((int)(__sourceSpill896_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill896_30 = local8_life19;
        int __sourceSpill896_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill896_33 = new byte[8];
        (__sourceSpill896_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill896_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill896_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill896_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill896_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill896_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill896_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill896_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill896_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill896_34)).doFinal(((byte[])(__sourceSpill896_33)));
        (__sourceSpill896_30)[__sourceSpill896_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "*h´ Y=úaÊ$k¹yn,3"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill896_38 = local6_life21;
        int __sourceSpill896_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill896_38)).substring(((int)(__sourceSpill896_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill896_43 = local8_life19;
        int __sourceSpill896_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill896_46 = new byte[8];
        (__sourceSpill896_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill896_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill896_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill896_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill896_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill896_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill896_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill896_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill896_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill896_47)).doFinal(((byte[])(__sourceSpill896_46)));
        (__sourceSpill896_43)[__sourceSpill896_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    b = ((long[])(local8_life19));
    c = ((java.lang.Integer[])(new java.lang.Integer[4]));
}


private static moom.lC[] b(int p0, int p1, net.minecraft.client.renderer.texture.TextureAtlasSprite[] p2, int p3, moom.lC p4, moom.Mi p5) {
return moom.Jf.a(((moom.bL)(moom.bL.UP)), ((int)(p0)), ((moom.bL)(moom.bL.DOWN)), ((int)(p1)), ((net.minecraft.client.renderer.texture.TextureAtlasSprite[])(p2)), ((int)(p3)), ((moom.lC)(p4)), ((moom.Mi)(p5)));
}


private static moom.lC a(moom.lC p0, net.minecraft.client.renderer.texture.TextureAtlasSprite p1, int p2, int p3, int p4, int p5, int p6) {
net.minecraft.entity.Entity[] spill862_0;
    long life7_3;
    int[] life10_8;
    net.minecraft.client.renderer.texture.TextureAtlasSprite life11_11;
    int life12_14;
    net.minecraft.entity.Entity[] life9_15;
    lexical_join_32: {
    life7_3 = (moom.Jf.a ^ 65717947808234L);
    life10_8 = ((int[])(((int[])(((moom.lC)(p0)).a__ArrayInt())).clone()));
    life11_11 = ((moom.lC)(p0)).a__oh();
    spill862_0 = moom.JM.b__Arrayr3();
    life12_14 = 0;
    life9_15 = spill862_0;
    lexical_cycle_16: while (true) {
    if (!((life12_14 < 4))) {
        break lexical_join_32;
    }
    moom.Jf.a(((int[])(life10_8)), ((int)(life12_14)), ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(life11_11)), ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(p1)), ((int)(p2)), ((int)(p3)), ((int)(p4)), ((int)(p5)), ((int)(p6)));
    life12_14 += 1;
    if (!((life9_15 == null))) { continue lexical_cycle_16; }
    break lexical_cycle_16;
    }
    }
    return new moom.lC(life10_8, ((moom.lC)(p0)).a__Int(), ((moom.lC)(p0)).a__bs(), p1);
}


private static void a(int[] p0, int p1, net.minecraft.client.renderer.texture.TextureAtlasSprite p2, net.minecraft.client.renderer.texture.TextureAtlasSprite p3, int p4, int p5, int p6, int p7, int p8) {
int forestValue705_141_0;
    int forestValue705_163_0;
    int forestValue705_185_0;
    int forestValue705_204_0;
    net.minecraft.entity.Entity[] spill705_0;
    int spill705_1;
    long life9_3;
    int life12_8;
    int life13_12;
    float life14_20;
    float life15_29;
    double life16_33;
    net.minecraft.entity.Entity[] life11_34;
    double life18_38;
    float life20_43;
    float life21_50;
    float life22_57;
    float life23_61;
    float life24_65;
    float life25_112;
    float life26_114;
    forest_join_256: {
    forest_join_255: {
    forest_join_245: {
    forest_join_237: {
    forest_join_229: {
    forest_join_219: {
    forest_join_213: {
    forest_join_205: {
    forest_join_204: {
    forest_join_203: {
    forest_join_185: {
    forest_join_181: {
    forest_join_163: {
    forest_join_159: {
    forest_join_141: {
    forest_join_137: {
    forest_join_111: {
    forest_join_110: {
    forest_join_100: {
    forest_join_92: {
    forest_join_84: {
    forest_join_74: {
    forest_join_68: {
    forest_join_60: {
    life9_3 = (moom.Jf.a ^ 102632283999402L);
    life12_8 = ((p0).length / 4);
    life13_12 = (life12_8 * p1);
    spill705_0 = moom.JM.b__Arrayr3();
    life14_20 = java.lang.Float.intBitsToFloat(((int)((p0)[(life13_12 + 4)])));
    life15_29 = java.lang.Float.intBitsToFloat(((int)((p0)[((life13_12 + 4) + 1)])));
    life16_33 = ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(p2)).a(((float)(life14_20)));
    life11_34 = spill705_0;
    life18_38 = ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(p2)).b(((float)(life15_29)));
    life20_43 = java.lang.Float.intBitsToFloat(((int)((p0)[life13_12])));
    life21_50 = java.lang.Float.intBitsToFloat(((int)((p0)[(life13_12 + 1)])));
    life22_57 = java.lang.Float.intBitsToFloat(((int)((p0)[(life13_12 + 2)])));
    switch (p4) {
case 0:
{
        break forest_join_60;
    }
case 1:
{
        break forest_join_68;
    }
case 2:
{
        break forest_join_74;
    }
case 3:
{
        break forest_join_84;
    }
case 4:
{
        break forest_join_92;
    }
case 5:
{
        break forest_join_100;
    }
default:
{
        break forest_join_110;
    }
}
    }
    life23_61 = life20_43;
    life24_65 = (0x1.0p0f - life22_57);
    if (!((life11_34 == null))) {
        break forest_join_111;
    }
    }
    life23_61 = life20_43;
    life24_65 = life22_57;
    if (!((life11_34 == null))) {
        break forest_join_111;
    }
    }
    life23_61 = (0x1.0p0f - life20_43);
    life24_65 = (0x1.0p0f - life21_50);
    if (!((life11_34 == null))) {
        break forest_join_111;
    }
    }
    life23_61 = life20_43;
    life24_65 = (0x1.0p0f - life21_50);
    if (!((life11_34 == null))) {
        break forest_join_111;
    }
    }
    life23_61 = life22_57;
    life24_65 = (0x1.0p0f - life21_50);
    if (!((life11_34 == null))) {
        break forest_join_111;
    }
    }
    life23_61 = (0x1.0p0f - life22_57);
    life24_65 = (0x1.0p0f - life21_50);
    if (!((life11_34 == null))) {
        break forest_join_111;
    }
    }
    return;
    }
    life25_112 = 0x1.fef9dcp3f;
    life26_114 = 0x1.fef9dcp3f;
    spill705_1 = recovery.source.CarrierOps.dcmpg(((double)(life16_33)), ((double)(((double) p5))));
    if (!((life11_34 != null))) {
        forestValue705_141_0 = spill705_1;
        break forest_join_141;
    }
    if (!((spill705_1 < 0))) {
        break forest_join_137;
    }
    life23_61 = ((float) (((double) life23_61) + ((((double) p5) - life16_33) / ((double) life25_112))));
    life16_33 = ((double) p5);
    }
    forestValue705_141_0 = recovery.source.CarrierOps.dcmpl(((double)(life16_33)), ((double)(((double) p7))));
    }
    if (!((life11_34 != null))) {
        forestValue705_163_0 = forestValue705_141_0;
        break forest_join_163;
    }
    if (!((forestValue705_141_0 > 0))) {
        break forest_join_159;
    }
    life23_61 = ((float) (((double) life23_61) - ((life16_33 - ((double) p7)) / ((double) life25_112))));
    life16_33 = ((double) p7);
    }
    forestValue705_163_0 = recovery.source.CarrierOps.dcmpg(((double)(life18_38)), ((double)(((double) p6))));
    }
    if (!((life11_34 != null))) {
        forestValue705_185_0 = forestValue705_163_0;
        break forest_join_185;
    }
    if (!((forestValue705_163_0 < 0))) {
        break forest_join_181;
    }
    life24_65 = ((float) (((double) life24_65) + ((((double) p6) - life18_38) / ((double) life26_114))));
    life18_38 = ((double) p6);
    }
    forestValue705_185_0 = recovery.source.CarrierOps.dcmpl(((double)(life18_38)), ((double)(((double) p8))));
    }
    if (!((life11_34 != null))) {
        forestValue705_204_0 = forestValue705_185_0;
        break forest_join_204;
    }
    if (!((forestValue705_185_0 > 0))) {
        break forest_join_203;
    }
    life24_65 = ((float) (((double) life24_65) - ((life18_38 - ((double) p8)) / ((double) life26_114))));
    life18_38 = ((double) p8);
    }
    forestValue705_204_0 = p4;
    }
    switch (forestValue705_204_0) {
case 0:
{
        break forest_join_205;
    }
case 1:
{
        break forest_join_213;
    }
case 2:
{
        break forest_join_219;
    }
case 3:
{
        break forest_join_229;
    }
case 4:
{
        break forest_join_237;
    }
case 5:
{
        break forest_join_245;
    }
default:
{
        break forest_join_255;
    }
}
    }
    life20_43 = life23_61;
    life22_57 = (0x1.0p0f - life24_65);
    if (!((life11_34 == null))) {
        break forest_join_256;
    }
    }
    life20_43 = life23_61;
    life22_57 = life24_65;
    if (!((life11_34 == null))) {
        break forest_join_256;
    }
    }
    life20_43 = (0x1.0p0f - life23_61);
    life21_50 = (0x1.0p0f - life24_65);
    if (!((life11_34 == null))) {
        break forest_join_256;
    }
    }
    life20_43 = life23_61;
    life21_50 = (0x1.0p0f - life24_65);
    if (!((life11_34 == null))) {
        break forest_join_256;
    }
    }
    life22_57 = life23_61;
    life21_50 = (0x1.0p0f - life24_65);
    if (!((life11_34 == null))) {
        break forest_join_256;
    }
    }
    life22_57 = (0x1.0p0f - life23_61);
    life21_50 = (0x1.0p0f - life24_65);
    if (!((life11_34 == null))) {
        break forest_join_256;
    }
    }
    return;
    }
    (p0)[(life13_12 + 4)] = java.lang.Float.floatToRawIntBits(((float)(((net.minecraft.client.renderer.texture.TextureAtlasSprite)(p3)).a(((double)(life16_33))))));
    (p0)[((life13_12 + 4) + 1)] = java.lang.Float.floatToRawIntBits(((float)(((net.minecraft.client.renderer.texture.TextureAtlasSprite)(p3)).b(((double)(life18_38))))));
    (p0)[life13_12] = java.lang.Float.floatToRawIntBits(((float)(life20_43)));
    (p0)[(life13_12 + 1)] = java.lang.Float.floatToRawIntBits(((float)(life21_50)));
    (p0)[(life13_12 + 2)] = java.lang.Float.floatToRawIntBits(((float)(life22_57)));
    return;
}


private static moom.lC a(net.minecraft.client.renderer.texture.TextureAtlasSprite p0, moom.bL p1, int p2, int p3, int p4, int p5, int p6, moom.lC p7, moom.Mi p8) {
int forestValue39_20_0;
    java.util.Map[] forestValue39_40_0;
    java.lang.Object forestValue39_61_0;
    moom.lC forestValue39_82_0;
    net.minecraft.entity.Entity[] spill39_0;
    int spill39_1;
    java.util.Map[] spill39_2;
    java.util.Map spill39_3;
    moom.lC spill39_4;
    long life9_3;
    java.util.Map[][] life12_6;
    net.minecraft.entity.Entity[] life11_7;
    int life13_15;
    java.util.Map[] life14_32;
    java.util.Map life15_54;
    moom.lC life16_78;
    forest_join_83: {
    forest_join_82: {
    forest_join_81: {
    forest_join_61: {
    forest_join_58: {
    forest_join_40: {
    forest_join_39: {
    forest_join_20: {
    forest_join_12: {
    life9_3 = (moom.Jf.a ^ 7776549646991L);
    spill39_0 = moom.JM.b__Arrayr3();
    life12_6 = moom.Jd.a__ArrayArrayMap();
    life11_7 = spill39_0;
    if (!((life12_6 == null))) {
        break forest_join_12;
    }
    return p7;
    }
    life13_15 = ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(p0)).f();
    spill39_1 = life13_15;
    if (!((life11_7 != null))) {
        forestValue39_20_0 = spill39_1;
        break forest_join_20;
    }
    if (!((spill39_1 >= 0))) {
        break forest_join_83;
    }
    forestValue39_20_0 = life13_15;
    }
    if (!((forestValue39_20_0 < (life12_6).length))) {
        break forest_join_83;
    }
    life14_32 = (life12_6)[life13_15];
    spill39_2 = life14_32;
    if (!((life11_7 != null))) {
        forestValue39_40_0 = spill39_2;
        break forest_join_40;
    }
    if (!((spill39_2 == null))) {
        break forest_join_39;
    }
    life14_32 = new java.util.Map[(moom.bL.VALUES).length];
    (life12_6)[life13_15] = life14_32;
    }
    forestValue39_40_0 = life14_32;
    }
    life15_54 = (forestValue39_40_0)[((moom.bL)(p1)).ordinal()];
    spill39_3 = life15_54;
    if (!((life11_7 != null))) {
        forestValue39_61_0 = spill39_3;
        break forest_join_61;
    }
    if (!((spill39_3 == null))) {
        break forest_join_58;
    }
    life15_54 = new java.util.IdentityHashMap(1);
    (life14_32)[((moom.bL)(p1)).ordinal()] = life15_54;
    }
    forestValue39_61_0 = ((java.util.Map)(life15_54)).get(((java.lang.Object)(p7)));
    }
    life16_78 = ((moom.lC)(forestValue39_61_0));
    spill39_4 = life16_78;
    if (!((life11_7 != null))) {
        forestValue39_82_0 = spill39_4;
        break forest_join_82;
    }
    if (!((spill39_4 == null))) {
        break forest_join_81;
    }
    life16_78 = moom.Jf.a(((moom.lC)(p7)), ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(p0)), ((int)(p6)), ((int)(p2)), ((int)(p3)), ((int)(p4)), ((int)(p5)));
    ((java.util.Map)(life15_54)).put(((java.lang.Object)(p7)), ((java.lang.Object)(life16_78)));
    }
    forestValue39_82_0 = life16_78;
    }
    return forestValue39_82_0;
    }
    return p7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral5332_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Jf"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.Jf.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int n4 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x4EB5;
        if (c[n4] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = b[n4];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])d.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    d.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/Jf", exception);
            }
            int n7 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Jf.c[n4] = n7;
        }
        return c[n4];
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static moom.lC[] a(int p0, net.minecraft.client.renderer.texture.TextureAtlasSprite[] p1, moom.lC p2, moom.Mi p3) {
java.lang.Object local4 = (p1)[p0];
    return moom.Jd.a(((net.minecraft.client.renderer.texture.TextureAtlasSprite)(local4)), ((moom.lC)(p2)), ((moom.Mi)(p3)));
}


private static moom.lC[] a(int p0, int p1, int p2, int p3, net.minecraft.client.renderer.texture.TextureAtlasSprite[] p4, int p5, moom.lC p6, moom.Mi p7) {
int forwardValue2377_38_0;
    int forwardValue2377_38_1;
    int forwardValue2377_55_0;
    int forwardValue2377_55_1;
    int forwardValue2377_85_0;
    int forwardValue2377_85_1;
    moom.lC[] forwardValue2377_111_0;
    int spill2377_0;
    int spill2377_1;
    long life8_3;
    net.minecraft.entity.Entity[] life10_5;
    forward_join_111: {
    forward_join_98: {
    forward_join_85: {
    forward_join_83: {
    forward_join_71: {
    forward_join_55: {
    forward_join_53: {
    forward_join_38: {
    forward_join_36: {
    forward_join_24: {
    life8_3 = (moom.Jf.a ^ 109087916245734L);
    life10_5 = moom.JM.b__Arrayr3();
    spill2377_0 = p0;
    spill2377_1 = p1;
    if (!((life10_5 != null))) {
        forwardValue2377_38_0 = spill2377_0;
        forwardValue2377_38_1 = spill2377_1;
        break forward_join_38;
    }
    if (!((spill2377_0 == spill2377_1))) {
        break forward_join_36;
    }
    if (!((p2 == p3))) {
        break forward_join_24;
    }
    forwardValue2377_111_0 = moom.Jf.a(((moom.bL)(moom.bL.UP)), ((int)(p0)), ((moom.bL)(moom.bL.DOWN)), ((int)(p2)), ((net.minecraft.client.renderer.texture.TextureAtlasSprite[])(p4)), ((int)(p5)), ((moom.lC)(p6)), ((moom.Mi)(p7)));
    break forward_join_111;
    }
    forwardValue2377_111_0 = moom.Jf.a(((moom.bL)(moom.bL.UP)), ((int)(p0)), ((moom.bL)(moom.bL.DOWN_LEFT)), ((int)(p2)), ((moom.bL)(moom.bL.DOWN_RIGHT)), ((int)(p3)), ((net.minecraft.client.renderer.texture.TextureAtlasSprite[])(p4)), ((int)(p5)), ((moom.lC)(p6)), ((moom.Mi)(p7)));
    break forward_join_111;
    }
    forwardValue2377_38_0 = p2;
    forwardValue2377_38_1 = p3;
    }
    if (!((life10_5 != null))) {
        forwardValue2377_55_0 = forwardValue2377_38_0;
        forwardValue2377_55_1 = forwardValue2377_38_1;
        break forward_join_55;
    }
    if (!((forwardValue2377_38_0 == forwardValue2377_38_1))) {
        break forward_join_53;
    }
    forwardValue2377_111_0 = moom.Jf.a(((moom.bL)(moom.bL.UP_LEFT)), ((int)(p0)), ((moom.bL)(moom.bL.UP_RIGHT)), ((int)(p1)), ((moom.bL)(moom.bL.DOWN)), ((int)(p2)), ((net.minecraft.client.renderer.texture.TextureAtlasSprite[])(p4)), ((int)(p5)), ((moom.lC)(p6)), ((moom.Mi)(p7)));
    break forward_join_111;
    }
    forwardValue2377_55_0 = p0;
    forwardValue2377_55_1 = p2;
    }
    if (!((life10_5 != null))) {
        forwardValue2377_85_0 = forwardValue2377_55_0;
        forwardValue2377_85_1 = forwardValue2377_55_1;
        break forward_join_85;
    }
    if (!((forwardValue2377_55_0 == forwardValue2377_55_1))) {
        break forward_join_83;
    }
    if (!((p1 == p3))) {
        break forward_join_71;
    }
    forwardValue2377_111_0 = moom.Jf.a(((moom.bL)(moom.bL.LEFT)), ((int)(p0)), ((moom.bL)(moom.bL.RIGHT)), ((int)(p1)), ((net.minecraft.client.renderer.texture.TextureAtlasSprite[])(p4)), ((int)(p5)), ((moom.lC)(p6)), ((moom.Mi)(p7)));
    break forward_join_111;
    }
    forwardValue2377_111_0 = moom.Jf.a(((moom.bL)(moom.bL.LEFT)), ((int)(p0)), ((moom.bL)(moom.bL.UP_RIGHT)), ((int)(p1)), ((moom.bL)(moom.bL.DOWN_RIGHT)), ((int)(p3)), ((net.minecraft.client.renderer.texture.TextureAtlasSprite[])(p4)), ((int)(p5)), ((moom.lC)(p6)), ((moom.Mi)(p7)));
    break forward_join_111;
    }
    forwardValue2377_85_0 = p1;
    forwardValue2377_85_1 = p3;
    }
    if (!((forwardValue2377_85_0 == forwardValue2377_85_1))) {
        break forward_join_98;
    }
    forwardValue2377_111_0 = moom.Jf.a(((moom.bL)(moom.bL.UP_LEFT)), ((int)(p0)), ((moom.bL)(moom.bL.DOWN_LEFT)), ((int)(p2)), ((moom.bL)(moom.bL.RIGHT)), ((int)(p1)), ((net.minecraft.client.renderer.texture.TextureAtlasSprite[])(p4)), ((int)(p5)), ((moom.lC)(p6)), ((moom.Mi)(p7)));
    break forward_join_111;
    }
    forwardValue2377_111_0 = moom.Jf.a(((moom.bL)(moom.bL.UP_LEFT)), ((int)(p0)), ((moom.bL)(moom.bL.UP_RIGHT)), ((int)(p1)), ((moom.bL)(moom.bL.DOWN_LEFT)), ((int)(p2)), ((moom.bL)(moom.bL.DOWN_RIGHT)), ((int)(p3)), ((net.minecraft.client.renderer.texture.TextureAtlasSprite[])(p4)), ((int)(p5)), ((moom.lC)(p6)), ((moom.Mi)(p7)));
    }
    return forwardValue2377_111_0;
}


private static moom.lC[] a(int p0, int p1, net.minecraft.client.renderer.texture.TextureAtlasSprite[] p2, int p3, moom.lC p4, moom.Mi p5) {
return moom.Jf.a(((moom.bL)(moom.bL.LEFT)), ((int)(p0)), ((moom.bL)(moom.bL.RIGHT)), ((int)(p1)), ((net.minecraft.client.renderer.texture.TextureAtlasSprite[])(p2)), ((int)(p3)), ((moom.lC)(p4)), ((moom.Mi)(p5)));
}


public static moom.lC[] a(int p0, moom.Jc p1, int p2, moom.lC p3, moom.Mi p4) {
int forwardValue244_44_0;
    int forwardValue244_522_0;
    int spill244_0;
    int spill244_1;
    int spill244_2;
    int spill244_3;
    long life5_3;
    net.minecraft.entity.Entity[] life7_5;
    int life8_36;
    forward_join_522: {
    forward_join_521: {
    forward_join_514: {
    forward_join_503: {
    forward_join_492: {
    forward_join_481: {
    forward_join_470: {
    forward_join_459: {
    forward_join_448: {
    forward_join_437: {
    forward_join_428: {
    forward_join_417: {
    forward_join_408: {
    forward_join_397: {
    forward_join_386: {
    forward_join_375: {
    forward_join_364: {
    forward_join_353: {
    forward_join_342: {
    forward_join_331: {
    forward_join_320: {
    forward_join_311: {
    forward_join_304: {
    forward_join_295: {
    forward_join_288: {
    forward_join_277: {
    forward_join_266: {
    forward_join_255: {
    forward_join_244: {
    forward_join_233: {
    forward_join_222: {
    forward_join_211: {
    forward_join_200: {
    forward_join_189: {
    forward_join_180: {
    forward_join_169: {
    forward_join_160: {
    forward_join_149: {
    forward_join_138: {
    forward_join_127: {
    forward_join_116: {
    forward_join_105: {
    forward_join_94: {
    forward_join_83: {
    forward_join_72: {
    forward_join_63: {
    forward_join_56: {
    forward_join_47: {
    forward_join_44: {
    forward_join_43: {
    life5_3 = (moom.Jf.a ^ 48519099140789L);
    life7_5 = moom.JM.b__Arrayr3();
    if (!((((moom.Jc)(p1)).n != null))) {
        break forward_join_43;
    }
    spill244_0 = p0;
    if (!((life7_5 != null))) {
        forwardValue244_44_0 = spill244_0;
        break forward_join_44;
    }
    if (!((spill244_0 >= 0))) {
        break forward_join_43;
    }
    spill244_1 = p0;
    if (!((life7_5 != null))) {
        forwardValue244_44_0 = spill244_1;
        break forward_join_44;
    }
    if (!((spill244_1 < (((moom.Jc)(p1)).n).length))) {
        break forward_join_43;
    }
    life8_36 = (((moom.Jc)(p1)).n)[p0];
    spill244_2 = life8_36;
    if (!((life7_5 != null))) {
        forwardValue244_44_0 = spill244_2;
        break forward_join_44;
    }
    if (!((spill244_2 >= 0))) {
        break forward_join_43;
    }
    spill244_3 = life8_36;
    if (!((life7_5 != null))) {
        forwardValue244_44_0 = spill244_3;
        break forward_join_44;
    }
    if (!((spill244_3 <= (((moom.Jc)(p1)).y).length))) {
        break forward_join_43;
    }
    return moom.Jf.a(((int)(life8_36)), ((net.minecraft.client.renderer.texture.TextureAtlasSprite[])(((moom.Jc)(p1)).y)), ((moom.lC)(p3)), ((moom.Mi)(p4)));
    }
    forwardValue244_44_0 = p0;
    }
    if (!((life7_5 != null))) {
        forwardValue244_522_0 = forwardValue244_44_0;
        break forward_join_522;
    }
    switch (forwardValue244_44_0) {
case 1:
{
        break forward_join_47;
    }
case 2:
{
        break forward_join_56;
    }
case 3:
{
        break forward_join_63;
    }
case 4:
{
        break forward_join_72;
    }
case 5:
{
        break forward_join_83;
    }
case 6:
{
        break forward_join_94;
    }
case 7:
{
        break forward_join_105;
    }
case 8:
{
        break forward_join_116;
    }
case 9:
{
        break forward_join_127;
    }
case 10:
{
        break forward_join_138;
    }
case 11:
{
        break forward_join_149;
    }
case 12:
{
        break forward_join_160;
    }
case 13:
{
        break forward_join_169;
    }
case 14:
{
        break forward_join_180;
    }
case 15:
{
        break forward_join_189;
    }
case 16:
{
        break forward_join_200;
    }
case 17:
{
        break forward_join_211;
    }
case 18:
{
        break forward_join_222;
    }
case 19:
{
        break forward_join_233;
    }
case 20:
{
        break forward_join_244;
    }
case 21:
{
        break forward_join_255;
    }
case 22:
{
        break forward_join_266;
    }
case 23:
{
        break forward_join_277;
    }
case 24:
{
        break forward_join_288;
    }
case 25:
{
        break forward_join_295;
    }
case 26:
{
        break forward_join_304;
    }
case 27:
{
        break forward_join_311;
    }
case 28:
{
        break forward_join_320;
    }
case 29:
{
        break forward_join_331;
    }
case 30:
{
        break forward_join_342;
    }
case 31:
{
        break forward_join_353;
    }
case 32:
{
        break forward_join_364;
    }
case 33:
{
        break forward_join_375;
    }
case 34:
{
        break forward_join_386;
    }
case 35:
{
        break forward_join_397;
    }
case 36:
{
        break forward_join_408;
    }
case 37:
{
        break forward_join_417;
    }
case 38:
{
        break forward_join_428;
    }
case 39:
{
        break forward_join_437;
    }
case 40:
{
        break forward_join_448;
    }
case 41:
{
        break forward_join_459;
    }
case 42:
{
        break forward_join_470;
    }
case 43:
{
        break forward_join_481;
    }
case 44:
{
        break forward_join_492;
    }
case 45:
{
        break forward_join_503;
    }
case 46:
{
        break forward_join_514;
    }
default:
{
        break forward_join_521;
    }
}
    }
    return moom.Jf.a(((int)(0)), ((int)(3)), ((net.minecraft.client.renderer.texture.TextureAtlasSprite[])(((moom.Jc)(p1)).y)), ((int)(p2)), ((moom.lC)(p3)), ((moom.Mi)(p4)));
    }
    return moom.Jf.a(((int)(3)), ((net.minecraft.client.renderer.texture.TextureAtlasSprite[])(((moom.Jc)(p1)).y)), ((moom.lC)(p3)), ((moom.Mi)(p4)));
    }
    return moom.Jf.a(((int)(3)), ((int)(0)), ((net.minecraft.client.renderer.texture.TextureAtlasSprite[])(((moom.Jc)(p1)).y)), ((int)(p2)), ((moom.lC)(p3)), ((moom.Mi)(p4)));
    }
    return moom.Jf.a(((int)(0)), ((int)(3)), ((int)(2)), ((int)(4)), ((net.minecraft.client.renderer.texture.TextureAtlasSprite[])(((moom.Jc)(p1)).y)), ((int)(p2)), ((moom.lC)(p3)), ((moom.Mi)(p4)));
    }
    return moom.Jf.a(((int)(3)), ((int)(0)), ((int)(4)), ((int)(2)), ((net.minecraft.client.renderer.texture.TextureAtlasSprite[])(((moom.Jc)(p1)).y)), ((int)(p2)), ((moom.lC)(p3)), ((moom.Mi)(p4)));
    }
    return moom.Jf.a(((int)(2)), ((int)(4)), ((int)(2)), ((int)(4)), ((net.minecraft.client.renderer.texture.TextureAtlasSprite[])(((moom.Jc)(p1)).y)), ((int)(p2)), ((moom.lC)(p3)), ((moom.Mi)(p4)));
    }
    return moom.Jf.a(((int)(3)), ((int)(3)), ((int)(4)), ((int)(4)), ((net.minecraft.client.renderer.texture.TextureAtlasSprite[])(((moom.Jc)(p1)).y)), ((int)(p2)), ((moom.lC)(p3)), ((moom.Mi)(p4)));
    }
    return moom.Jf.a(((int)(4)), ((int)(1)), ((int)(4)), ((int)(4)), ((net.minecraft.client.renderer.texture.TextureAtlasSprite[])(((moom.Jc)(p1)).y)), ((int)(p2)), ((moom.lC)(p3)), ((moom.Mi)(p4)));
    }
    return moom.Jf.a(((int)(4)), ((int)(4)), ((int)(4)), ((int)(1)), ((net.minecraft.client.renderer.texture.TextureAtlasSprite[])(((moom.Jc)(p1)).y)), ((int)(p2)), ((moom.lC)(p3)), ((moom.Mi)(p4)));
    }
    return moom.Jf.a(((int)(1)), ((int)(4)), ((int)(1)), ((int)(4)), ((net.minecraft.client.renderer.texture.TextureAtlasSprite[])(((moom.Jc)(p1)).y)), ((int)(p2)), ((moom.lC)(p3)), ((moom.Mi)(p4)));
    }
    return moom.Jf.a(((int)(1)), ((int)(1)), ((int)(4)), ((int)(4)), ((net.minecraft.client.renderer.texture.TextureAtlasSprite[])(((moom.Jc)(p1)).y)), ((int)(p2)), ((moom.lC)(p3)), ((moom.Mi)(p4)));
    }
    return moom.Jf.b(((int)(0)), ((int)(2)), ((net.minecraft.client.renderer.texture.TextureAtlasSprite[])(((moom.Jc)(p1)).y)), ((int)(p2)), ((moom.lC)(p3)), ((moom.Mi)(p4)));
    }
    return moom.Jf.a(((int)(0)), ((int)(3)), ((int)(2)), ((int)(1)), ((net.minecraft.client.renderer.texture.TextureAtlasSprite[])(((moom.Jc)(p1)).y)), ((int)(p2)), ((moom.lC)(p3)), ((moom.Mi)(p4)));
    }
    return moom.Jf.b(((int)(3)), ((int)(1)), ((net.minecraft.client.renderer.texture.TextureAtlasSprite[])(((moom.Jc)(p1)).y)), ((int)(p2)), ((moom.lC)(p3)), ((moom.Mi)(p4)));
    }
    return moom.Jf.a(((int)(3)), ((int)(0)), ((int)(1)), ((int)(2)), ((net.minecraft.client.renderer.texture.TextureAtlasSprite[])(((moom.Jc)(p1)).y)), ((int)(p2)), ((moom.lC)(p3)), ((moom.Mi)(p4)));
    }
    return moom.Jf.a(((int)(2)), ((int)(4)), ((int)(0)), ((int)(3)), ((net.minecraft.client.renderer.texture.TextureAtlasSprite[])(((moom.Jc)(p1)).y)), ((int)(p2)), ((moom.lC)(p3)), ((moom.Mi)(p4)));
    }
    return moom.Jf.a(((int)(4)), ((int)(2)), ((int)(3)), ((int)(0)), ((net.minecraft.client.renderer.texture.TextureAtlasSprite[])(((moom.Jc)(p1)).y)), ((int)(p2)), ((moom.lC)(p3)), ((moom.Mi)(p4)));
    }
    return moom.Jf.a(((int)(4)), ((int)(4)), ((int)(3)), ((int)(3)), ((net.minecraft.client.renderer.texture.TextureAtlasSprite[])(((moom.Jc)(p1)).y)), ((int)(p2)), ((moom.lC)(p3)), ((moom.Mi)(p4)));
    }
    return moom.Jf.a(((int)(4)), ((int)(2)), ((int)(4)), ((int)(2)), ((net.minecraft.client.renderer.texture.TextureAtlasSprite[])(((moom.Jc)(p1)).y)), ((int)(p2)), ((moom.lC)(p3)), ((moom.Mi)(p4)));
    }
    return moom.Jf.a(((int)(1)), ((int)(4)), ((int)(4)), ((int)(4)), ((net.minecraft.client.renderer.texture.TextureAtlasSprite[])(((moom.Jc)(p1)).y)), ((int)(p2)), ((moom.lC)(p3)), ((moom.Mi)(p4)));
    }
    return moom.Jf.a(((int)(4)), ((int)(4)), ((int)(1)), ((int)(4)), ((net.minecraft.client.renderer.texture.TextureAtlasSprite[])(((moom.Jc)(p1)).y)), ((int)(p2)), ((moom.lC)(p3)), ((moom.Mi)(p4)));
    }
    return moom.Jf.a(((int)(4)), ((int)(4)), ((int)(1)), ((int)(1)), ((net.minecraft.client.renderer.texture.TextureAtlasSprite[])(((moom.Jc)(p1)).y)), ((int)(p2)), ((moom.lC)(p3)), ((moom.Mi)(p4)));
    }
    return moom.Jf.a(((int)(4)), ((int)(1)), ((int)(4)), ((int)(1)), ((net.minecraft.client.renderer.texture.TextureAtlasSprite[])(((moom.Jc)(p1)).y)), ((int)(p2)), ((moom.lC)(p3)), ((moom.Mi)(p4)));
    }
    return moom.Jf.a(((int)(2)), ((net.minecraft.client.renderer.texture.TextureAtlasSprite[])(((moom.Jc)(p1)).y)), ((moom.lC)(p3)), ((moom.Mi)(p4)));
    }
    return moom.Jf.a(((int)(2)), ((int)(1)), ((net.minecraft.client.renderer.texture.TextureAtlasSprite[])(((moom.Jc)(p1)).y)), ((int)(p2)), ((moom.lC)(p3)), ((moom.Mi)(p4)));
    }
    return moom.Jf.a(((int)(1)), ((net.minecraft.client.renderer.texture.TextureAtlasSprite[])(((moom.Jc)(p1)).y)), ((moom.lC)(p3)), ((moom.Mi)(p4)));
    }
    return moom.Jf.a(((int)(1)), ((int)(2)), ((net.minecraft.client.renderer.texture.TextureAtlasSprite[])(((moom.Jc)(p1)).y)), ((int)(p2)), ((moom.lC)(p3)), ((moom.Mi)(p4)));
    }
    return moom.Jf.a(((int)(2)), ((int)(4)), ((int)(2)), ((int)(1)), ((net.minecraft.client.renderer.texture.TextureAtlasSprite[])(((moom.Jc)(p1)).y)), ((int)(p2)), ((moom.lC)(p3)), ((moom.Mi)(p4)));
    }
    return moom.Jf.a(((int)(3)), ((int)(3)), ((int)(1)), ((int)(4)), ((net.minecraft.client.renderer.texture.TextureAtlasSprite[])(((moom.Jc)(p1)).y)), ((int)(p2)), ((moom.lC)(p3)), ((moom.Mi)(p4)));
    }
    return moom.Jf.a(((int)(2)), ((int)(1)), ((int)(2)), ((int)(4)), ((net.minecraft.client.renderer.texture.TextureAtlasSprite[])(((moom.Jc)(p1)).y)), ((int)(p2)), ((moom.lC)(p3)), ((moom.Mi)(p4)));
    }
    return moom.Jf.a(((int)(3)), ((int)(3)), ((int)(4)), ((int)(1)), ((net.minecraft.client.renderer.texture.TextureAtlasSprite[])(((moom.Jc)(p1)).y)), ((int)(p2)), ((moom.lC)(p3)), ((moom.Mi)(p4)));
    }
    return moom.Jf.a(((int)(1)), ((int)(1)), ((int)(1)), ((int)(4)), ((net.minecraft.client.renderer.texture.TextureAtlasSprite[])(((moom.Jc)(p1)).y)), ((int)(p2)), ((moom.lC)(p3)), ((moom.Mi)(p4)));
    }
    return moom.Jf.a(((int)(1)), ((int)(1)), ((int)(4)), ((int)(1)), ((net.minecraft.client.renderer.texture.TextureAtlasSprite[])(((moom.Jc)(p1)).y)), ((int)(p2)), ((moom.lC)(p3)), ((moom.Mi)(p4)));
    }
    return moom.Jf.a(((int)(4)), ((int)(1)), ((int)(1)), ((int)(4)), ((net.minecraft.client.renderer.texture.TextureAtlasSprite[])(((moom.Jc)(p1)).y)), ((int)(p2)), ((moom.lC)(p3)), ((moom.Mi)(p4)));
    }
    return moom.Jf.a(((int)(1)), ((int)(4)), ((int)(4)), ((int)(1)), ((net.minecraft.client.renderer.texture.TextureAtlasSprite[])(((moom.Jc)(p1)).y)), ((int)(p2)), ((moom.lC)(p3)), ((moom.Mi)(p4)));
    }
    return moom.Jf.b(((int)(2)), ((int)(0)), ((net.minecraft.client.renderer.texture.TextureAtlasSprite[])(((moom.Jc)(p1)).y)), ((int)(p2)), ((moom.lC)(p3)), ((moom.Mi)(p4)));
    }
    return moom.Jf.a(((int)(2)), ((int)(1)), ((int)(0)), ((int)(3)), ((net.minecraft.client.renderer.texture.TextureAtlasSprite[])(((moom.Jc)(p1)).y)), ((int)(p2)), ((moom.lC)(p3)), ((moom.Mi)(p4)));
    }
    return moom.Jf.b(((int)(1)), ((int)(3)), ((net.minecraft.client.renderer.texture.TextureAtlasSprite[])(((moom.Jc)(p1)).y)), ((int)(p2)), ((moom.lC)(p3)), ((moom.Mi)(p4)));
    }
    return moom.Jf.a(((int)(1)), ((int)(2)), ((int)(3)), ((int)(0)), ((net.minecraft.client.renderer.texture.TextureAtlasSprite[])(((moom.Jc)(p1)).y)), ((int)(p2)), ((moom.lC)(p3)), ((moom.Mi)(p4)));
    }
    return moom.Jf.a(((int)(4)), ((int)(1)), ((int)(3)), ((int)(3)), ((net.minecraft.client.renderer.texture.TextureAtlasSprite[])(((moom.Jc)(p1)).y)), ((int)(p2)), ((moom.lC)(p3)), ((moom.Mi)(p4)));
    }
    return moom.Jf.a(((int)(1)), ((int)(2)), ((int)(4)), ((int)(2)), ((net.minecraft.client.renderer.texture.TextureAtlasSprite[])(((moom.Jc)(p1)).y)), ((int)(p2)), ((moom.lC)(p3)), ((moom.Mi)(p4)));
    }
    return moom.Jf.a(((int)(1)), ((int)(4)), ((int)(3)), ((int)(3)), ((net.minecraft.client.renderer.texture.TextureAtlasSprite[])(((moom.Jc)(p1)).y)), ((int)(p2)), ((moom.lC)(p3)), ((moom.Mi)(p4)));
    }
    return moom.Jf.a(((int)(4)), ((int)(2)), ((int)(1)), ((int)(2)), ((net.minecraft.client.renderer.texture.TextureAtlasSprite[])(((moom.Jc)(p1)).y)), ((int)(p2)), ((moom.lC)(p3)), ((moom.Mi)(p4)));
    }
    return moom.Jf.a(((int)(1)), ((int)(4)), ((int)(1)), ((int)(1)), ((net.minecraft.client.renderer.texture.TextureAtlasSprite[])(((moom.Jc)(p1)).y)), ((int)(p2)), ((moom.lC)(p3)), ((moom.Mi)(p4)));
    }
    return moom.Jf.a(((int)(4)), ((int)(1)), ((int)(1)), ((int)(1)), ((net.minecraft.client.renderer.texture.TextureAtlasSprite[])(((moom.Jc)(p1)).y)), ((int)(p2)), ((moom.lC)(p3)), ((moom.Mi)(p4)));
    }
    return moom.Jf.a(((int)(4)), ((net.minecraft.client.renderer.texture.TextureAtlasSprite[])(((moom.Jc)(p1)).y)), ((moom.lC)(p3)), ((moom.Mi)(p4)));
    }
    forwardValue244_522_0 = 0;
    }
    return moom.Jf.a(((int)(forwardValue244_522_0)), ((net.minecraft.client.renderer.texture.TextureAtlasSprite[])(((moom.Jc)(p1)).y)), ((moom.lC)(p3)), ((moom.Mi)(p4)));
}


private static moom.lC a(net.minecraft.client.renderer.texture.TextureAtlasSprite p0, moom.bL p1, int p2, moom.lC p3, moom.Mi p4) {
long local5 = (moom.Jf.a ^ 37319983111108L);
    switch ((moom.Jg.a)[((moom.bL)(p1)).ordinal()]) {
case 1:
{
        return moom.Jf.a(((net.minecraft.client.renderer.texture.TextureAtlasSprite)(p0)), ((moom.bL)(p1)), ((int)(0)), ((int)(0)), ((int)(__sourceIntrinsic_5882d2e96417_invokedynamic4465_3(27595, (4227856631887356977L ^ local5)))), ((int)(__sourceIntrinsic_5882d2e96417_invokedynamic4465_4(11274, (1252807669618942962L ^ local5)))), ((int)(p2)), ((moom.lC)(p3)), ((moom.Mi)(p4)));
    }
case 2:
{
        return moom.Jf.a(((net.minecraft.client.renderer.texture.TextureAtlasSprite)(p0)), ((moom.bL)(p1)), ((int)(__sourceIntrinsic_5882d2e96417_invokedynamic4465_6(29742, (2047635212744063959L ^ local5)))), ((int)(0)), ((int)(__sourceIntrinsic_5882d2e96417_invokedynamic4465_7(31408, (7968179517136172363L ^ local5)))), ((int)(__sourceIntrinsic_5882d2e96417_invokedynamic4465_8(29742, (2047635212744063959L ^ local5)))), ((int)(p2)), ((moom.lC)(p3)), ((moom.Mi)(p4)));
    }
case 3:
{
        return moom.Jf.a(((net.minecraft.client.renderer.texture.TextureAtlasSprite)(p0)), ((moom.bL)(p1)), ((int)(__sourceIntrinsic_5882d2e96417_invokedynamic4465_10(29742, (2047635212744063959L ^ local5)))), ((int)(0)), ((int)(__sourceIntrinsic_5882d2e96417_invokedynamic4465_11(31408, (7968179517136172363L ^ local5)))), ((int)(__sourceIntrinsic_5882d2e96417_invokedynamic4465_12(31408, (7968179517136172363L ^ local5)))), ((int)(p2)), ((moom.lC)(p3)), ((moom.Mi)(p4)));
    }
case 4:
{
        return moom.Jf.a(((net.minecraft.client.renderer.texture.TextureAtlasSprite)(p0)), ((moom.bL)(p1)), ((int)(__sourceIntrinsic_5882d2e96417_invokedynamic4465_14(29742, (2047635212744063959L ^ local5)))), ((int)(__sourceIntrinsic_5882d2e96417_invokedynamic4465_15(29742, (2047635212744063959L ^ local5)))), ((int)(__sourceIntrinsic_5882d2e96417_invokedynamic4465_16(31408, (7968179517136172363L ^ local5)))), ((int)(__sourceIntrinsic_5882d2e96417_invokedynamic4465_17(31408, (7968179517136172363L ^ local5)))), ((int)(p2)), ((moom.lC)(p3)), ((moom.Mi)(p4)));
    }
case 5:
{
        return moom.Jf.a(((net.minecraft.client.renderer.texture.TextureAtlasSprite)(p0)), ((moom.bL)(p1)), ((int)(0)), ((int)(__sourceIntrinsic_5882d2e96417_invokedynamic4465_19(29742, (2047635212744063959L ^ local5)))), ((int)(__sourceIntrinsic_5882d2e96417_invokedynamic4465_20(31408, (7968179517136172363L ^ local5)))), ((int)(__sourceIntrinsic_5882d2e96417_invokedynamic4465_21(31408, (7968179517136172363L ^ local5)))), ((int)(p2)), ((moom.lC)(p3)), ((moom.Mi)(p4)));
    }
case 6:
{
        return moom.Jf.a(((net.minecraft.client.renderer.texture.TextureAtlasSprite)(p0)), ((moom.bL)(p1)), ((int)(0)), ((int)(__sourceIntrinsic_5882d2e96417_invokedynamic4465_23(29742, (2047635212744063959L ^ local5)))), ((int)(__sourceIntrinsic_5882d2e96417_invokedynamic4465_24(29742, (2047635212744063959L ^ local5)))), ((int)(__sourceIntrinsic_5882d2e96417_invokedynamic4465_25(31408, (7968179517136172363L ^ local5)))), ((int)(p2)), ((moom.lC)(p3)), ((moom.Mi)(p4)));
    }
case 7:
{
        return moom.Jf.a(((net.minecraft.client.renderer.texture.TextureAtlasSprite)(p0)), ((moom.bL)(p1)), ((int)(0)), ((int)(0)), ((int)(__sourceIntrinsic_5882d2e96417_invokedynamic4465_27(29742, (2047635212744063959L ^ local5)))), ((int)(__sourceIntrinsic_5882d2e96417_invokedynamic4465_28(31408, (7968179517136172363L ^ local5)))), ((int)(p2)), ((moom.lC)(p3)), ((moom.Mi)(p4)));
    }
case 8:
{
        return moom.Jf.a(((net.minecraft.client.renderer.texture.TextureAtlasSprite)(p0)), ((moom.bL)(p1)), ((int)(0)), ((int)(0)), ((int)(__sourceIntrinsic_5882d2e96417_invokedynamic4465_30(29742, (2047635212744063959L ^ local5)))), ((int)(__sourceIntrinsic_5882d2e96417_invokedynamic4465_31(29742, (2047635212744063959L ^ local5)))), ((int)(p2)), ((moom.lC)(p3)), ((moom.Mi)(p4)));
    }
default:
{
        return p3;
    }
}
}


private static moom.lC[] a(moom.bL p0, int p1, moom.bL p2, int p3, moom.bL p4, int p5, moom.bL p6, int p7, net.minecraft.client.renderer.texture.TextureAtlasSprite[] p8, int p9, moom.lC p10, moom.Mi p11) {
java.lang.Object local12 = moom.Jf.a(((net.minecraft.client.renderer.texture.TextureAtlasSprite)((p8)[p1])), ((moom.bL)(p0)), ((int)(p9)), ((moom.lC)(p10)), ((moom.Mi)(p11)));
    java.lang.Object local13 = moom.Jf.a(((net.minecraft.client.renderer.texture.TextureAtlasSprite)((p8)[p3])), ((moom.bL)(p2)), ((int)(p9)), ((moom.lC)(p10)), ((moom.Mi)(p11)));
    java.lang.Object local14 = moom.Jf.a(((net.minecraft.client.renderer.texture.TextureAtlasSprite)((p8)[p5])), ((moom.bL)(p4)), ((int)(p9)), ((moom.lC)(p10)), ((moom.Mi)(p11)));
    java.lang.Object local15 = moom.Jf.a(((net.minecraft.client.renderer.texture.TextureAtlasSprite)((p8)[p7])), ((moom.bL)(p6)), ((int)(p9)), ((moom.lC)(p10)), ((moom.Mi)(p11)));
    return ((moom.Mi)(p11)).a(((moom.lC)(local12)), ((moom.lC)(local13)), ((moom.lC)(local14)), ((moom.lC)(local15)));
}


private static moom.lC[] a(moom.bL p0, int p1, moom.bL p2, int p3, moom.bL p4, int p5, net.minecraft.client.renderer.texture.TextureAtlasSprite[] p6, int p7, moom.lC p8, moom.Mi p9) {
java.lang.Object local10 = moom.Jf.a(((net.minecraft.client.renderer.texture.TextureAtlasSprite)((p6)[p1])), ((moom.bL)(p0)), ((int)(p7)), ((moom.lC)(p8)), ((moom.Mi)(p9)));
    java.lang.Object local11 = moom.Jf.a(((net.minecraft.client.renderer.texture.TextureAtlasSprite)((p6)[p3])), ((moom.bL)(p2)), ((int)(p7)), ((moom.lC)(p8)), ((moom.Mi)(p9)));
    java.lang.Object local12 = moom.Jf.a(((net.minecraft.client.renderer.texture.TextureAtlasSprite)((p6)[p5])), ((moom.bL)(p4)), ((int)(p7)), ((moom.lC)(p8)), ((moom.Mi)(p9)));
    return ((moom.Mi)(p9)).a(((moom.lC)(local10)), ((moom.lC)(local11)), ((moom.lC)(local12)));
}


private static moom.lC[] a(moom.bL p0, int p1, moom.bL p2, int p3, net.minecraft.client.renderer.texture.TextureAtlasSprite[] p4, int p5, moom.lC p6, moom.Mi p7) {
java.lang.Object local8 = moom.Jf.a(((net.minecraft.client.renderer.texture.TextureAtlasSprite)((p4)[p1])), ((moom.bL)(p0)), ((int)(p5)), ((moom.lC)(p6)), ((moom.Mi)(p7)));
    java.lang.Object local9 = moom.Jf.a(((net.minecraft.client.renderer.texture.TextureAtlasSprite)((p4)[p3])), ((moom.bL)(p2)), ((int)(p5)), ((moom.lC)(p6)), ((moom.Mi)(p7)));
    return ((moom.Mi)(p7)).a(((moom.lC)(local8)), ((moom.lC)(local9)));
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral5332_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5882d2e96417_invokedynamic4465_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5882d2e96417_invokedynamic4465_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5882d2e96417_invokedynamic4465_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5882d2e96417_invokedynamic4465_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5882d2e96417_invokedynamic4465_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5882d2e96417_invokedynamic4465_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5882d2e96417_invokedynamic4465_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5882d2e96417_invokedynamic4465_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5882d2e96417_invokedynamic4465_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5882d2e96417_invokedynamic4465_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5882d2e96417_invokedynamic4465_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5882d2e96417_invokedynamic4465_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5882d2e96417_invokedynamic4465_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5882d2e96417_invokedynamic4465_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5882d2e96417_invokedynamic4465_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5882d2e96417_invokedynamic4465_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5882d2e96417_invokedynamic4465_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5882d2e96417_invokedynamic4465_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5882d2e96417_invokedynamic4465_27(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5882d2e96417_invokedynamic4465_28(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5882d2e96417_invokedynamic4465_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5882d2e96417_invokedynamic4465_31(int a0, long a1) throws E;
}
