package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public abstract class mS<T extends net.minecraft.entity.EntityLivingBase> extends net.minecraft.client.renderer.entity.Render<T> {

public static boolean h;

private static org.apache.logging.log4j.Logger i;

private static moom.n3 j;

public static float k;

public static float l;

public moom.iQ m;

public net.minecraft.entity.EntityLivingBase n;

public float o;

public float p;

public float q;

public float r;

public float s;

public float t;

public float u;

protected java.nio.FloatBuffer v;

protected java.util.List<net.minecraft.client.renderer.entity.layers.LayerRenderer<T>> w;

protected boolean x;

private boolean y;

private boolean z;

private static java.lang.String[] A;

private static long N;

private static long[] R;

private static java.lang.Integer[] S;

private static java.util.Map T;

public mS(net.minecraft.client.renderer.entity.RenderManager p0, moom.iQ p1, float p2) {
super(p0);
    this.v = net.minecraft.client.renderer.GLAllocation.a__FloatBuffer(4);
    this.w = com.google.common.collect.Lists.newArrayList();
    this.x = false;
    this.m = p1;
    this.c = p2;
    this.y = (this.m instanceof moom.ju);
}


static { __sourceHandlerCall_9fd075610ccb93cf8ffe(); }

private static native <E extends Throwable> void __sourceHandlerCall_9fd075610ccb93cf8ffe() throws E;
private static final class __SourceHandler_9fd075610ccb93cf8ffe {

public static void f481() throws Throwable {
    javax.crypto.Cipher forestValue481_38_0;
    int forestValue481_38_1;
    javax.crypto.SecretKeyFactory forestValue481_38_2;
    byte[] forestValue481_38_3;
    javax.crypto.Cipher forestValue481_55_0;
    int forestValue481_55_1;
    javax.crypto.SecretKeyFactory forestValue481_55_2;
    byte[] forestValue481_55_3;
    long[] forestValue481_159_0;
    int forestValue481_159_1;
    long forestValue481_159_2;
    int forestValue481_159_3;
    long[] forestValue481_302_0;
    int forestValue481_302_1;
    long forestValue481_302_2;
    long[] forestValue481_314_0;
    int forestValue481_314_1;
    long forestValue481_314_2;
    java.lang.Object spill481_0;
    javax.crypto.Cipher spill481_1;
    int spill481_2;
    javax.crypto.SecretKeyFactory spill481_3;
    byte[] spill481_4;
    byte[] spill481_5;
    java.lang.String spill481_6;
    int spill481_7;
    int spill481_8;
    long spill481_9;
    byte[] spill481_10;
    byte[] spill481_11;
    byte[] spill481_12;
    byte[] spill481_13;
    byte[] spill481_14;
    byte[] spill481_15;
    byte[] spill481_16;
    byte[] spill481_17;
    long spill481_18;
    int spill481_19;
    java.lang.String spill481_20;
    int spill481_21;
    long[] spill481_22;
    int spill481_23;
    long spill481_24;
    int spill481_25;
    long life11_11;
    javax.crypto.Cipher life0_22;
    int life1_37;
    long[] life6_68;
    int life3_70;
    java.lang.String life4_73;
    int life5_75;
    int life2_77;
    byte[] life7_85;
    long life8_162;
    byte[] life10_230;
    byte[] life7_327;
    int[] life13_433;
    int life14_435;
    forest_join_447: {
    forest_join_401: {
    forest_join_55: {
    __fieldWrite481_4(__call481_3(__call481_2(7651342674272738621L, 7649981549552279264L, __call481_1(__call481_0())), 261475239240905L));
    life11_11 = (__fieldRead481_5() ^ 60363653019708L);
    spill481_0 = null;
    __fieldWrite481_6(new java.util.HashMap(13));
    __call481_7(spill481_0);
    spill481_1 = (life0_22 = __call481_8("DES/CBC/NoPadding"));
    spill481_2 = 2;
    spill481_3 = __call481_9("DES");
    byte[] __stackOp481_10_0 = new byte[8];
    spill481_4 = __stackOp481_10_0;
    (__stackOp481_10_0)[0] = ((byte) ((int) (life11_11 >>> 56)));
    life1_37 = 1;
    forestValue481_38_0 = spill481_1;
    forestValue481_38_1 = spill481_2;
    forestValue481_38_2 = spill481_3;
    forestValue481_38_3 = spill481_4;
    forest_cycle_38: while (true) {
    if (!((life1_37 < 8))) {
        forestValue481_55_0 = forestValue481_38_0;
        forestValue481_55_1 = forestValue481_38_1;
        forestValue481_55_2 = forestValue481_38_2;
        forestValue481_55_3 = forestValue481_38_3;
        break forest_join_55;
    }
    byte[] __stackOp481_11_0 = forestValue481_38_3;
    spill481_5 = __stackOp481_11_0;
    (__stackOp481_11_0)[life1_37] = ((byte) ((int) ((life11_11 << (life1_37 * 8)) >>> 56)));
    life1_37 += 1;
    forestValue481_38_3 = spill481_5;
    continue forest_cycle_38;
    }
    }
    __call481_13(forestValue481_55_0, forestValue481_55_1, __call481_12(forestValue481_55_2, new javax.crypto.spec.DESKeySpec(forestValue481_55_3)), new javax.crypto.spec.IvParameterSpec(new byte[8]));
    life6_68 = new long[31];
    life3_70 = 0;
    life5_75 = __call481_14((life4_73 = "AÞó­Àgp7ßësÒÿ\\i7\017\tðfø\n\177- \\Aå4J}j-ëèãñÄ=ßc3\034I.Îß>Às»ë\001N\025\037h<¨:\030?J¿Ì\tÐ<(6»Wâ \006·+*&l*é\016lQ\003Q\001ò\027àD\0036g¹=l\002(Äã\025Ýawä[FwµzòñÍ¸H<v¾ýì\026Ö[=UÜª.½Ý<í1}$ý\027\023\033\0337R.Çg\017\022\bçòÂd\021Ë3(\037¬+S°ô>ÕR0Göé\002!\035#£æ® \032g$Ü*àû\r2\022â\n}IrýmC÷"));
    life2_77 = 0;
    forest_cycle_78: while (true) {
    spill481_6 = life4_73;
    spill481_7 = life2_77;
    life2_77 += 8;
    life7_85 = __call481_16(__call481_15(spill481_6, spill481_7, life2_77), "ISO-8859-1");
    forestValue481_159_0 = life6_68;
    forestValue481_159_1 = (life3_70++);
    forestValue481_159_2 = (((((((((((long) (life7_85)[0]) & 255L) << 56) | ((((long) (life7_85)[1]) & 255L) << 48)) | ((((long) (life7_85)[2]) & 255L) << 40)) | ((((long) (life7_85)[3]) & 255L) << 32)) | ((((long) (life7_85)[4]) & 255L) << 24)) | ((((long) (life7_85)[5]) & 255L) << 16)) | ((((long) (life7_85)[6]) & 255L) << 8)) | (((long) (life7_85)[7]) & 255L));
    forestValue481_159_3 = -1;
    forest_cycle_159: while (true) {
    forest_join_319: {
    forest_join_314: {
    forest_join_302: {
    long __stackOp481_17_0 = forestValue481_159_2;
    int __stackOp481_17_1 = forestValue481_159_3;
    spill481_8 = __stackOp481_17_1;
    spill481_9 = __stackOp481_17_0;
    __discardScalar481_18(__stackOp481_17_1);
    life8_162 = spill481_9;
    byte[] __stackOp481_19_0 = new byte[8];
    spill481_10 = __stackOp481_19_0;
    (__stackOp481_19_0)[0] = ((byte) ((int) (life8_162 >>> 56)));
    byte[] __stackOp481_20_0 = spill481_10;
    spill481_11 = __stackOp481_20_0;
    (__stackOp481_20_0)[1] = ((byte) ((int) (life8_162 >>> 48)));
    byte[] __stackOp481_21_0 = spill481_11;
    spill481_12 = __stackOp481_21_0;
    (__stackOp481_21_0)[2] = ((byte) ((int) (life8_162 >>> 40)));
    byte[] __stackOp481_22_0 = spill481_12;
    spill481_13 = __stackOp481_22_0;
    (__stackOp481_22_0)[3] = ((byte) ((int) (life8_162 >>> 32)));
    byte[] __stackOp481_23_0 = spill481_13;
    spill481_14 = __stackOp481_23_0;
    (__stackOp481_23_0)[4] = ((byte) ((int) (life8_162 >>> 24)));
    byte[] __stackOp481_24_0 = spill481_14;
    spill481_15 = __stackOp481_24_0;
    (__stackOp481_24_0)[5] = ((byte) ((int) (life8_162 >>> 16)));
    byte[] __stackOp481_25_0 = spill481_15;
    spill481_16 = __stackOp481_25_0;
    (__stackOp481_25_0)[6] = ((byte) ((int) (life8_162 >>> 8)));
    byte[] __stackOp481_26_0 = spill481_16;
    spill481_17 = __stackOp481_26_0;
    (__stackOp481_26_0)[7] = ((byte) ((int) life8_162));
    byte[] __stackOp481_27_0 = spill481_17;
    javax.crypto.Cipher __stackOp481_27_1 = life0_22;
    life10_230 = __call481_28(__stackOp481_27_1, __stackOp481_27_0);
    int __stackOp481_29_0 = spill481_8;
    long __stackOp481_29_1 = (((((((((((long) (life10_230)[0]) & 255L) << 56) | ((((long) (life10_230)[1]) & 255L) << 48)) | ((((long) (life10_230)[2]) & 255L) << 40)) | ((((long) (life10_230)[3]) & 255L) << 32)) | ((((long) (life10_230)[4]) & 255L) << 24)) | ((((long) (life10_230)[5]) & 255L) << 16)) | ((((long) (life10_230)[6]) & 255L) << 8)) | (((long) (life10_230)[7]) & 255L));
    spill481_18 = __stackOp481_29_1;
    spill481_19 = __stackOp481_29_0;
    __discardWide481_30(__stackOp481_29_1);
    switch (spill481_19) {
default:
{
        forestValue481_302_0 = forestValue481_159_0;
        forestValue481_302_1 = forestValue481_159_1;
        forestValue481_302_2 = spill481_18;
        break forest_join_302;
    }
case 0:
{
        forestValue481_314_0 = forestValue481_159_0;
        forestValue481_314_1 = forestValue481_159_1;
        forestValue481_314_2 = spill481_18;
        break forest_join_314;
    }
}
    }
    (forestValue481_302_0)[forestValue481_302_1] = forestValue481_302_2;
    if (!((life2_77 >= life5_75))) {
        continue forest_cycle_78;
    }
    life5_75 = __call481_31((life4_73 = "9/\017J\030¯kÀájÎäÚGO"));
    life2_77 = 0;
    break forest_join_319;
    }
    (forestValue481_314_0)[forestValue481_314_1] = forestValue481_314_2;
    if (!((life2_77 >= life5_75))) {
        break forest_join_319;
    }
    break forest_join_401;
    }
    spill481_20 = life4_73;
    spill481_21 = life2_77;
    life2_77 += 8;
    life7_327 = __call481_33(__call481_32(spill481_20, spill481_21, life2_77), "ISO-8859-1");
    spill481_22 = life6_68;
    spill481_23 = (life3_70++);
    spill481_24 = (((((((((((long) (life7_327)[0]) & 255L) << 56) | ((((long) (life7_327)[1]) & 255L) << 48)) | ((((long) (life7_327)[2]) & 255L) << 40)) | ((((long) (life7_327)[3]) & 255L) << 32)) | ((((long) (life7_327)[4]) & 255L) << 24)) | ((((long) (life7_327)[5]) & 255L) << 16)) | ((((long) (life7_327)[6]) & 255L) << 8)) | (((long) (life7_327)[7]) & 255L));
    spill481_25 = 0;
    forestValue481_159_0 = spill481_22;
    forestValue481_159_1 = spill481_23;
    forestValue481_159_2 = spill481_24;
    forestValue481_159_3 = spill481_25;
    continue forest_cycle_159;
    }
    }
    }
    __fieldWrite481_34(life6_68);
    __fieldWrite481_35(new java.lang.Integer[31]);
    __fieldWrite481_37(__call481_36("animate.model.living"));
    __fieldWrite481_39(__call481_38());
    __fieldWrite481_42(new moom.n3(__invokedynamic481_40(29711, (7334800429239573610L ^ life11_11)), __invokedynamic481_41(29711, (7334800429239573610L ^ life11_11))));
    __fieldWrite481_43(0x1.0p6f);
    __fieldWrite481_44(0x1.0p5f);
    life13_433 = __call481_46(__fieldRead481_45());
    life14_435 = 0;
    forest_cycle_434: while (true) {
    if (!((life14_435 < __invokedynamic481_47(11293, (1388563611808121965L ^ life11_11))))) {
        break forest_join_447;
    }
    (life13_433)[life14_435] = -1;
    life14_435 += 1;
    continue forest_cycle_434;
    }
    }
    __call481_49(__fieldRead481_48());
    return;
}
public static void h481_0(moom.Oo p0) throws Throwable {
    throw __call3048100_0(p0);
}
private static native java.lang.invoke.MethodHandles.Lookup __call481_0() throws Throwable;
private static native java.lang.Class __call481_1(java.lang.invoke.MethodHandles.Lookup a0) throws Throwable;
private static native moom._a __call481_2(long a0, long a1, java.lang.Class a2) throws Throwable;
private static native long __call481_3(moom._a a0, long a1) throws Throwable;
private static native void __fieldWrite481_4(long a0) throws Throwable;
private static native long __fieldRead481_5() throws Throwable;
private static native void __fieldWrite481_6(java.util.HashMap a0) throws Throwable;
private static native void __call481_7(java.lang.Object a0) throws Throwable;
private static native javax.crypto.Cipher __call481_8(java.lang.String a0) throws Throwable;
private static native javax.crypto.SecretKeyFactory __call481_9(java.lang.String a0) throws Throwable;
private static native javax.crypto.SecretKey __call481_12(javax.crypto.SecretKeyFactory a0, javax.crypto.spec.DESKeySpec a1) throws Throwable;
private static native void __call481_13(javax.crypto.Cipher a0, int a1, javax.crypto.SecretKey a2, javax.crypto.spec.IvParameterSpec a3) throws Throwable;
private static native int __call481_14(java.lang.String a0) throws Throwable;
private static native java.lang.String __call481_15(java.lang.String a0, int a1, int a2) throws Throwable;
private static native byte[] __call481_16(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __discardScalar481_18(int a0) throws Throwable;
private static native byte[] __call481_28(javax.crypto.Cipher a0, byte[] a1) throws Throwable;
private static native void __discardWide481_30(long a0) throws Throwable;
private static native int __call481_31(java.lang.String a0) throws Throwable;
private static native java.lang.String __call481_32(java.lang.String a0, int a1, int a2) throws Throwable;
private static native byte[] __call481_33(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite481_34(long[] a0) throws Throwable;
private static native void __fieldWrite481_35(java.lang.Integer[] a0) throws Throwable;
private static native boolean __call481_36(java.lang.String a0) throws Throwable;
private static native void __fieldWrite481_37(boolean a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __call481_38() throws Throwable;
private static native void __fieldWrite481_39(org.apache.logging.log4j.Logger a0) throws Throwable;
private static native int __invokedynamic481_40(int a0, long a1) throws Throwable;
private static native int __invokedynamic481_41(int a0, long a1) throws Throwable;
private static native void __fieldWrite481_42(moom.n3 a0) throws Throwable;
private static native void __fieldWrite481_43(float a0) throws Throwable;
private static native void __fieldWrite481_44(float a0) throws Throwable;
private static native moom.n3 __fieldRead481_45() throws Throwable;
private static native int[] __call481_46(moom.n3 a0) throws Throwable;
private static native int __invokedynamic481_47(int a0, long a1) throws Throwable;
private static native moom.n3 __fieldRead481_48() throws Throwable;
private static native void __call481_49(moom.n3 a0) throws Throwable;
private static native java.lang.Exception __call3048100_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_b047ffbd8c3779cb9c84(moom.mS a0, net.minecraft.entity.EntityLivingBase a1, double a2, double a3, double a4, float a5, float a6) throws E;
private static final class __SourceHandler_b047ffbd8c3779cb9c84 {

public static void f457(moom.mS receiver, net.minecraft.entity.EntityLivingBase p0, double p1, double p2, double p3, float p4, float p5) throws Throwable {
    com.moon.ec life10_8;
    float life11_49;
    float life12_57;
    float life13_61;
    net.minecraft.entity.Entity life15_68;
    net.minecraft.entity.EntityLivingBase life14_74;
    float life11_82;
    float life13_86;
    float life15_89;
    float life14_132;
    float life15_161;
    float life16_178;
    float life17_193;
    float life18_203;
    int life19_268;
    int life19_288;
    com.moon.eb life20_346;
    forest_join_386: {
    forest_join_367: {
    forest_join_362: {
    forest_join_352: {
    forest_join_331: {
    forest_join_327: {
    forest_join_326: {
    forest_join_306: {
    forest_join_293: {
    forest_join_289: {
    forest_join_281: {
    forest_join_280: {
    forest_join_260: {
    forest_join_216: {
    forest_join_210: {
    forest_join_150: {
    forest_join_121: {
    forest_join_117: {
    forest_join_101: {
    forest_join_95: {
    forest_join_22: {
    forest_join_17: {
    life10_8 = new com.moon.ec(p0, __call457_0(p0), __call457_1(p0));
    __call457_4(__call457_3(__call457_2()), life10_8);
    if (!(__call457_5(life10_8))) {
        break forest_join_17;
    }
    return;
    }
    if (!(__fieldRead457_6())) {
        break forest_join_22;
    }
    __fieldWrite457_7(p0, 0x1.0p0f);
    }
    __call457_8();
    __call457_9();
    __fieldWrite457_12(__fieldRead457_10(receiver), __call457_11(receiver, p0, p5));
    __fieldWrite457_15(__fieldRead457_13(receiver), __call457_14(life10_8));
    __fieldWrite457_18(__fieldRead457_16(receiver), __call457_17(life10_8));
    life11_49 = __call457_21(receiver, __fieldRead457_19(p0), __fieldRead457_20(p0), p5);
    life12_57 = __call457_24(receiver, __fieldRead457_22(p0), __fieldRead457_23(p0), p5);
    life13_61 = (life12_57 - life11_49);
    if (!(__fieldRead457_26(__fieldRead457_25(receiver)))) {
        break forest_join_121;
    }
    life15_68 = __fieldRead457_27(p0);
    if (!((__instanceOf457_28(life15_68) != 0))) {
        break forest_join_121;
    }
    life14_74 = __cast457_29(life15_68);
    life11_82 = __call457_32(receiver, __fieldRead457_30(life14_74), __fieldRead457_31(life14_74), p5);
    life13_86 = (life12_57 - life11_82);
    life15_89 = __call457_33(life13_86);
    if (!((__numericCompare457_34(life15_89, -0x1.54p6f) < 0))) {
        break forest_join_95;
    }
    life15_89 = -0x1.54p6f;
    }
    if (!((__numericCompare457_35(life15_89, 0x1.54p6f) >= 0))) {
        break forest_join_101;
    }
    life15_89 = 0x1.54p6f;
    }
    life11_49 = (life12_57 - life15_89);
    if (!((__numericCompare457_36((life15_89 * life15_89), 0x1.388p11f) > 0))) {
        break forest_join_117;
    }
    life11_49 = (life11_49 + (life15_89 * 0x1.99999ap-3f));
    }
    life13_61 = (life12_57 - life11_49);
    }
    life14_132 = (__fieldRead457_37(p0) + ((__fieldRead457_38(p0) - __fieldRead457_39(p0)) * p5));
    if (!((p0 == __fieldRead457_41(__call457_40())))) {
        break forest_join_150;
    }
    life14_132 = (__fieldRead457_44(__fieldRead457_43(__call457_42())) + ((__fieldRead457_47(__fieldRead457_46(__call457_45())) - __fieldRead457_50(__fieldRead457_49(__call457_48()))) * p5));
    }
    __call457_51(receiver, p0, p1, p2, p3);
    life15_161 = __call457_52(receiver, p0, p5);
    __call457_53(receiver, p0, life15_161, life11_49, p5);
    __call457_54();
    __call457_55(-0x1.0p0f, -0x1.0p0f, 0x1.0p0f);
    __call457_56(receiver, p0, p5);
    life16_178 = 0x1.0p-4f;
    __call457_57(0x0.0p0f, -0x1.82p0f, 0x0.0p0f);
    life17_193 = (__fieldRead457_58(p0) + ((__fieldRead457_59(p0) - __fieldRead457_60(p0)) * p5));
    life18_203 = (__fieldRead457_61(p0) - (__fieldRead457_62(p0) * (0x1.0p0f - p5)));
    if (!(__call457_63(p0))) {
        break forest_join_210;
    }
    life18_203 = (life18_203 * 0x1.8p1f);
    }
    if (!((__numericCompare457_64(life17_193, 0x1.0p0f) > 0))) {
        break forest_join_216;
    }
    life17_193 = 0x1.0p0f;
    }
    __call457_65();
    __call457_67(__fieldRead457_66(receiver), p0, life18_203, life17_193, p5);
    __call457_69(__fieldRead457_68(receiver), life18_203, life17_193, life15_161, life13_61, life14_132, 0x1.0p-4f, p0);
    if (!(__call457_70())) {
        break forest_join_260;
    }
    __fieldWrite457_71(receiver, p0);
    __fieldWrite457_72(receiver, life18_203);
    __fieldWrite457_73(receiver, life17_193);
    __fieldWrite457_74(receiver, life15_161);
    __fieldWrite457_75(receiver, life13_61);
    __fieldWrite457_76(receiver, life14_132);
    __fieldWrite457_77(receiver, life16_178);
    __fieldWrite457_78(receiver, p5);
    }
    if (!(__fieldRead457_79(receiver))) {
        break forest_join_281;
    }
    life19_268 = __integerCategory457_81(__call457_80(receiver, p0));
    __call457_82(receiver, p0, life18_203, life17_193, life15_161, life13_61, life14_132, 0x1.0p-4f);
    if (!((life19_268 != 0))) {
        break forest_join_280;
    }
    __call457_83(receiver);
    }
    break forest_join_362;
    }
    life19_288 = __integerCategory457_85(__call457_84(receiver, p0, p5));
    if (!(__call457_86())) {
        break forest_join_289;
    }
    __call457_87();
    }
    if (!(__fieldRead457_88(receiver))) {
        break forest_join_293;
    }
    __call457_89();
    }
    __call457_90(receiver, p0, life18_203, life17_193, life15_161, life13_61, life14_132, 0x1.0p-4f);
    if (!(__fieldRead457_91(receiver))) {
        break forest_join_306;
    }
    __call457_92();
    }
    if (!(__call457_93())) {
        break forest_join_327;
    }
    if (!(__call457_94())) {
        break forest_join_326;
    }
    __fieldWrite457_95(receiver, 1);
    __call457_96();
    __call457_97();
    __call457_98(receiver, p0, life18_203, life17_193, life15_161, life13_61, life14_132, life16_178);
    __call457_99();
    __call457_100();
    }
    __call457_101();
    }
    if (!((life19_288 != 0))) {
        break forest_join_331;
    }
    __call457_102(receiver);
    }
    __call457_103(1);
    life20_346 = new com.moon.eb(p0);
    __call457_106(__call457_105(__call457_104()), life20_346);
    if (!((!__call457_107(life20_346)))) {
        break forest_join_362;
    }
    if (!((__instanceOf457_108(p0) != 0))) {
        break forest_join_352;
    }
    if (!((!__call457_110(__cast457_109(p0))))) {
        break forest_join_362;
    }
    }
    __call457_111(receiver, p0, life18_203, life17_193, p5, life15_161, life13_61, life14_132, 0x1.0p-4f);
    }
    if (!(__call457_112())) {
        break forest_join_367;
    }
    __fieldWrite457_113(receiver, null);
    }
    __call457_114();
    __call457_116(__fieldRead457_115());
    __call457_117();
    __call457_119(__fieldRead457_118());
    __call457_120();
    __call457_121();
    if (!((!__fieldRead457_122(receiver)))) {
        break forest_join_386;
    }
    __call457_123(receiver, p0, p1, p2, p3, p4, p5);
    }
    return;
}
public static void h457_0(java.lang.Exception p0) throws Throwable {
    throw __call3045700_0(p0);
}
public static void h457_1(java.lang.Exception p0) throws Throwable {
    throw __call3045701_0(p0);
}
public static void h457_2(java.lang.Exception p0) throws Throwable {
    throw __call3045702_0(p0);
}
public static void h457_3(java.lang.Exception p0) throws Throwable {
    throw __call3045703_0(p0);
}
public static void h457_4(java.lang.Exception p0) throws Throwable {
    throw __call3045704_0(p0);
}
public static void h457_5(java.lang.Exception p0) throws Throwable {
    throw __call3045705_0(p0);
}
public static void h457_6(java.lang.Exception p0) throws Throwable {
    throw __call3045706_0(p0);
}
public static void h457_7(java.lang.Exception p0) throws Throwable {
    throw __call3045707_0(p0);
}
public static void h457_8(java.lang.Exception p0) throws Throwable {
    throw __call3045708_0(p0);
}
public static void h457_9(java.lang.Exception p0) throws Throwable {
    throw __call3045709_0(p0);
}
public static void h457_10(java.lang.Exception p0) throws Throwable {
    throw __call3045710_0(p0);
}
public static void h457_11(java.lang.Exception p0) throws Throwable {
    throw __call3045711_0(p0);
}
public static void h457_12(java.lang.Exception p0) throws Throwable {
    throw __call3045712_0(p0);
}
public static void h457_13(java.lang.Exception p0) throws Throwable {
    throw __call3045713_0(p0);
}
public static void h457_14(java.lang.Exception p0, moom.mS p1, net.minecraft.entity.EntityLivingBase p2, double p3, double p4, double p5, float p6, float p7, float p8) throws Throwable {
    java.lang.Exception life11_2;
    forest_join_24: {
    life11_2 = p0;
    __call3045714_1(__fieldRead3045714_0(), "Couldn't render entity", life11_2);
    __call3045714_3(__fieldRead3045714_2());
    __call3045714_4();
    __call3045714_6(__fieldRead3045714_5());
    __call3045714_7();
    __call3045714_8();
    if (!((!__fieldRead3045714_9(p1)))) {
        break forest_join_24;
    }
    __call3045714_10(p1, p2, p3, p4, p5, p6, p7);
    }
    return;
}
public static void h457_15(java.lang.Exception p0) throws Throwable {
    throw __call3045715_0(p0);
}
private static native boolean __call457_0(net.minecraft.entity.EntityLivingBase a0) throws Throwable;
private static native boolean __call457_1(net.minecraft.entity.EntityLivingBase a0) throws Throwable;
private static native com.moon.runtime.ClientContext __call457_2() throws Throwable;
private static native com.moon.events.EventBus __call457_3(com.moon.runtime.ClientContext a0) throws Throwable;
private static native void __call457_4(com.moon.events.EventBus a0, com.moon.ec a1) throws Throwable;
private static native boolean __call457_5(com.moon.ec a0) throws Throwable;
private static native boolean __fieldRead457_6() throws Throwable;
private static native void __fieldWrite457_7(net.minecraft.entity.EntityLivingBase a0, float a1) throws Throwable;
private static native void __call457_8() throws Throwable;
private static native void __call457_9() throws Throwable;
private static native moom.iQ __fieldRead457_10(moom.mS a0) throws Throwable;
private static native float __call457_11(moom.mS a0, net.minecraft.entity.EntityLivingBase a1, float a2) throws Throwable;
private static native void __fieldWrite457_12(moom.iQ a0, float a1) throws Throwable;
private static native moom.iQ __fieldRead457_13(moom.mS a0) throws Throwable;
private static native boolean __call457_14(com.moon.ec a0) throws Throwable;
private static native void __fieldWrite457_15(moom.iQ a0, boolean a1) throws Throwable;
private static native moom.iQ __fieldRead457_16(moom.mS a0) throws Throwable;
private static native boolean __call457_17(com.moon.ec a0) throws Throwable;
private static native void __fieldWrite457_18(moom.iQ a0, boolean a1) throws Throwable;
private static native float __fieldRead457_19(net.minecraft.entity.EntityLivingBase a0) throws Throwable;
private static native float __fieldRead457_20(net.minecraft.entity.EntityLivingBase a0) throws Throwable;
private static native float __call457_21(moom.mS a0, float a1, float a2, float a3) throws Throwable;
private static native float __fieldRead457_22(net.minecraft.entity.EntityLivingBase a0) throws Throwable;
private static native float __fieldRead457_23(net.minecraft.entity.EntityLivingBase a0) throws Throwable;
private static native float __call457_24(moom.mS a0, float a1, float a2, float a3) throws Throwable;
private static native moom.iQ __fieldRead457_25(moom.mS a0) throws Throwable;
private static native boolean __fieldRead457_26(moom.iQ a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead457_27(net.minecraft.entity.EntityLivingBase a0) throws Throwable;
private static native int __instanceOf457_28(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.EntityLivingBase __cast457_29(net.minecraft.entity.Entity a0) throws Throwable;
private static native float __fieldRead457_30(net.minecraft.entity.EntityLivingBase a0) throws Throwable;
private static native float __fieldRead457_31(net.minecraft.entity.EntityLivingBase a0) throws Throwable;
private static native float __call457_32(moom.mS a0, float a1, float a2, float a3) throws Throwable;
private static native float __call457_33(float a0) throws Throwable;
private static native int __numericCompare457_34(float a0, float a1) throws Throwable;
private static native int __numericCompare457_35(float a0, float a1) throws Throwable;
private static native int __numericCompare457_36(float a0, float a1) throws Throwable;
private static native float __fieldRead457_37(net.minecraft.entity.EntityLivingBase a0) throws Throwable;
private static native float __fieldRead457_38(net.minecraft.entity.EntityLivingBase a0) throws Throwable;
private static native float __fieldRead457_39(net.minecraft.entity.EntityLivingBase a0) throws Throwable;
private static native net.minecraft.client.Minecraft __call457_40() throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead457_41(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __call457_42() throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead457_43(net.minecraft.client.Minecraft a0) throws Throwable;
private static native float __fieldRead457_44(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native net.minecraft.client.Minecraft __call457_45() throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead457_46(net.minecraft.client.Minecraft a0) throws Throwable;
private static native float __fieldRead457_47(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native net.minecraft.client.Minecraft __call457_48() throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead457_49(net.minecraft.client.Minecraft a0) throws Throwable;
private static native float __fieldRead457_50(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native void __call457_51(moom.mS a0, net.minecraft.entity.EntityLivingBase a1, double a2, double a3, double a4) throws Throwable;
private static native float __call457_52(moom.mS a0, net.minecraft.entity.EntityLivingBase a1, float a2) throws Throwable;
private static native void __call457_53(moom.mS a0, net.minecraft.entity.EntityLivingBase a1, float a2, float a3, float a4) throws Throwable;
private static native void __call457_54() throws Throwable;
private static native void __call457_55(float a0, float a1, float a2) throws Throwable;
private static native void __call457_56(moom.mS a0, net.minecraft.entity.EntityLivingBase a1, float a2) throws Throwable;
private static native void __call457_57(float a0, float a1, float a2) throws Throwable;
private static native float __fieldRead457_58(net.minecraft.entity.EntityLivingBase a0) throws Throwable;
private static native float __fieldRead457_59(net.minecraft.entity.EntityLivingBase a0) throws Throwable;
private static native float __fieldRead457_60(net.minecraft.entity.EntityLivingBase a0) throws Throwable;
private static native float __fieldRead457_61(net.minecraft.entity.EntityLivingBase a0) throws Throwable;
private static native float __fieldRead457_62(net.minecraft.entity.EntityLivingBase a0) throws Throwable;
private static native boolean __call457_63(net.minecraft.entity.EntityLivingBase a0) throws Throwable;
private static native int __numericCompare457_64(float a0, float a1) throws Throwable;
private static native void __call457_65() throws Throwable;
private static native moom.iQ __fieldRead457_66(moom.mS a0) throws Throwable;
private static native void __call457_67(moom.iQ a0, net.minecraft.entity.EntityLivingBase a1, float a2, float a3, float a4) throws Throwable;
private static native moom.iQ __fieldRead457_68(moom.mS a0) throws Throwable;
private static native void __call457_69(moom.iQ a0, float a1, float a2, float a3, float a4, float a5, float a6, net.minecraft.entity.EntityLivingBase a7) throws Throwable;
private static native boolean __call457_70() throws Throwable;
private static native void __fieldWrite457_71(moom.mS a0, net.minecraft.entity.EntityLivingBase a1) throws Throwable;
private static native void __fieldWrite457_72(moom.mS a0, float a1) throws Throwable;
private static native void __fieldWrite457_73(moom.mS a0, float a1) throws Throwable;
private static native void __fieldWrite457_74(moom.mS a0, float a1) throws Throwable;
private static native void __fieldWrite457_75(moom.mS a0, float a1) throws Throwable;
private static native void __fieldWrite457_76(moom.mS a0, float a1) throws Throwable;
private static native void __fieldWrite457_77(moom.mS a0, float a1) throws Throwable;
private static native void __fieldWrite457_78(moom.mS a0, float a1) throws Throwable;
private static native boolean __fieldRead457_79(moom.mS a0) throws Throwable;
private static native boolean __call457_80(moom.mS a0, net.minecraft.entity.EntityLivingBase a1) throws Throwable;
private static native int __integerCategory457_81(boolean value) throws Throwable;
private static native void __call457_82(moom.mS a0, net.minecraft.entity.EntityLivingBase a1, float a2, float a3, float a4, float a5, float a6, float a7) throws Throwable;
private static native void __call457_83(moom.mS a0) throws Throwable;
private static native boolean __call457_84(moom.mS a0, net.minecraft.entity.EntityLivingBase a1, float a2) throws Throwable;
private static native int __integerCategory457_85(boolean value) throws Throwable;
private static native boolean __call457_86() throws Throwable;
private static native void __call457_87() throws Throwable;
private static native boolean __fieldRead457_88(moom.mS a0) throws Throwable;
private static native void __call457_89() throws Throwable;
private static native void __call457_90(moom.mS a0, net.minecraft.entity.EntityLivingBase a1, float a2, float a3, float a4, float a5, float a6, float a7) throws Throwable;
private static native boolean __fieldRead457_91(moom.mS a0) throws Throwable;
private static native void __call457_92() throws Throwable;
private static native boolean __call457_93() throws Throwable;
private static native boolean __call457_94() throws Throwable;
private static native void __fieldWrite457_95(moom.mS a0, int a1) throws Throwable;
private static native void __call457_96() throws Throwable;
private static native void __call457_97() throws Throwable;
private static native void __call457_98(moom.mS a0, net.minecraft.entity.EntityLivingBase a1, float a2, float a3, float a4, float a5, float a6, float a7) throws Throwable;
private static native void __call457_99() throws Throwable;
private static native void __call457_100() throws Throwable;
private static native void __call457_101() throws Throwable;
private static native void __call457_102(moom.mS a0) throws Throwable;
private static native void __call457_103(int a0) throws Throwable;
private static native com.moon.runtime.ClientContext __call457_104() throws Throwable;
private static native com.moon.events.EventBus __call457_105(com.moon.runtime.ClientContext a0) throws Throwable;
private static native void __call457_106(com.moon.events.EventBus a0, com.moon.eb a1) throws Throwable;
private static native boolean __call457_107(com.moon.eb a0) throws Throwable;
private static native int __instanceOf457_108(net.minecraft.entity.EntityLivingBase a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayer __cast457_109(net.minecraft.entity.EntityLivingBase a0) throws Throwable;
private static native boolean __call457_110(net.minecraft.entity.player.EntityPlayer a0) throws Throwable;
private static native void __call457_111(moom.mS a0, net.minecraft.entity.EntityLivingBase a1, float a2, float a3, float a4, float a5, float a6, float a7, float a8) throws Throwable;
private static native boolean __call457_112() throws Throwable;
private static native void __fieldWrite457_113(moom.mS a0, java.lang.Object a1) throws Throwable;
private static native void __call457_114() throws Throwable;
private static native int __fieldRead457_115() throws Throwable;
private static native void __call457_116(int a0) throws Throwable;
private static native void __call457_117() throws Throwable;
private static native int __fieldRead457_118() throws Throwable;
private static native void __call457_119(int a0) throws Throwable;
private static native void __call457_120() throws Throwable;
private static native void __call457_121() throws Throwable;
private static native boolean __fieldRead457_122(moom.mS a0) throws Throwable;
private static native void __call457_123(moom.mS a0, net.minecraft.entity.EntityLivingBase a1, double a2, double a3, double a4, float a5, float a6) throws Throwable;
private static native java.lang.Exception __call3045700_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3045701_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3045702_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3045703_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3045704_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3045705_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3045706_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3045707_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3045708_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3045709_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3045710_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3045711_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3045712_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3045713_0(java.lang.Exception a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead3045714_0() throws Throwable;
private static native void __call3045714_1(org.apache.logging.log4j.Logger a0, java.lang.String a1, java.lang.Exception a2) throws Throwable;
private static native int __fieldRead3045714_2() throws Throwable;
private static native void __call3045714_3(int a0) throws Throwable;
private static native void __call3045714_4() throws Throwable;
private static native int __fieldRead3045714_5() throws Throwable;
private static native void __call3045714_6(int a0) throws Throwable;
private static native void __call3045714_7() throws Throwable;
private static native void __call3045714_8() throws Throwable;
private static native boolean __fieldRead3045714_9(moom.mS a0) throws Throwable;
private static native void __call3045714_10(moom.mS a0, net.minecraft.entity.EntityLivingBase a1, double a2, double a3, double a4, float a5, float a6) throws Throwable;
private static native java.lang.Exception __call3045715_0(java.lang.Exception a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_c58b06e95e3eba024676(moom.mS a0, net.minecraft.entity.EntityLivingBase a1, float a2, float a3, float a4) throws E;
private static final class __SourceHandler_c58b06e95e3eba024676 {

public static void f1075(moom.mS receiver, net.minecraft.entity.EntityLivingBase p0, float p1, float p2, float p3) throws Throwable {
    float life5_21;
    float life5_24;
    java.lang.String life5_44;
    forward_join_75: {
    forward_join_63: {
    forward_join_55: {
    forward_join_41: {
    forward_join_31: {
    __call1075_0((0x1.68p7f - p2), 0x0.0p0f, 0x1.0p0f, 0x0.0p0f);
    if (!((__fieldRead1075_1(p0) > 0))) { break forward_join_41; }
    life5_21 = ((((((float) __fieldRead1075_2(p0)) + p3) - 0x1.0p0f) / 0x1.4p4f) * 0x1.99999ap0f);
    life5_24 = __call1075_3(life5_21);
    if (!((__numericCompare1075_4(life5_24, 0x1.0p0f) > 0))) { break forward_join_31; }
    life5_24 = 0x1.0p0f;
    }
    __call1075_6((life5_24 * __call1075_5(receiver, p0)), 0x0.0p0f, 0x0.0p0f, 0x1.0p0f);
    break forward_join_75;
    }
    life5_44 = __call1075_8(__call1075_7(p0));
    if (!((life5_44 != null))) { break forward_join_75; }
    if (!((!__call1075_9(life5_44, "Dinnerbone")))) { break forward_join_55; }
    if (!(__call1075_10(life5_44, "Grumm"))) { break forward_join_75; }
    }
    if (!((__instanceOf1075_11(p0) != 0))) { break forward_join_63; }
    if (!(__call1075_14(__cast1075_12(p0), __fieldRead1075_13()))) { break forward_join_75; }
    }
    __call1075_16(0x0.0p0f, (__fieldRead1075_15(p0) + 0x1.99999ap-4f), 0x0.0p0f);
    __call1075_17(0x1.68p7f, 0x0.0p0f, 0x0.0p0f, 0x1.0p0f);
    }
    return;
}
public static void h1075_0(moom.Oo p0) throws Throwable {
    throw __call1107500_0(p0);
}
public static void h1075_1(moom.Oo p0) throws Throwable {
    throw __call1107501_0(p0);
}
public static void h1075_2(moom.Oo p0) throws Throwable {
    throw __call1107502_0(p0);
}
public static void h1075_3(moom.Oo p0) throws Throwable {
    throw __call1107503_0(p0);
}
public static void h1075_4(moom.Oo p0) throws Throwable {
    throw __call1107504_0(p0);
}
private static native void __call1075_0(float a0, float a1, float a2, float a3) throws Throwable;
private static native int __fieldRead1075_1(net.minecraft.entity.EntityLivingBase a0) throws Throwable;
private static native int __fieldRead1075_2(net.minecraft.entity.EntityLivingBase a0) throws Throwable;
private static native float __call1075_3(float a0) throws Throwable;
private static native int __numericCompare1075_4(float a0, float a1) throws Throwable;
private static native float __call1075_5(moom.mS a0, net.minecraft.entity.EntityLivingBase a1) throws Throwable;
private static native void __call1075_6(float a0, float a1, float a2, float a3) throws Throwable;
private static native java.lang.String __call1075_7(net.minecraft.entity.EntityLivingBase a0) throws Throwable;
private static native java.lang.String __call1075_8(java.lang.String a0) throws Throwable;
private static native boolean __call1075_9(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native boolean __call1075_10(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __instanceOf1075_11(net.minecraft.entity.EntityLivingBase a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayer __cast1075_12(net.minecraft.entity.EntityLivingBase a0) throws Throwable;
private static native net.minecraft.entity.player.EnumPlayerModelParts __fieldRead1075_13() throws Throwable;
private static native boolean __call1075_14(net.minecraft.entity.player.EntityPlayer a0, net.minecraft.entity.player.EnumPlayerModelParts a1) throws Throwable;
private static native float __fieldRead1075_15(net.minecraft.entity.EntityLivingBase a0) throws Throwable;
private static native void __call1075_16(float a0, float a1, float a2) throws Throwable;
private static native void __call1075_17(float a0, float a1, float a2, float a3) throws Throwable;
private static native java.lang.Exception __call1107500_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1107501_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1107502_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1107503_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1107504_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_2bea33db5468f09f6b32(moom.mS a0, net.minecraft.entity.EntityLivingBase a1, float a2, float a3, float a4, float a5, float a6, float a7) throws E;
private static final class __SourceHandler_2bea33db5468f09f6b32 {

public static void f1076(moom.mS receiver, net.minecraft.entity.EntityLivingBase p0, float p1, float p2, float p3, float p4, float p5, float p6) throws Throwable {
    int forwardValue1076_10_0;
    int forwardValue1076_21_0;
    int spill1076_0;
    long spill1076_1;
    long life8_3;
    int life10_12;
    int life11_28;
    com.moon.event.EntityRenderEvent life12_91;
    com.moon.event.EntityRenderEvent life13_125;
    forward_join_122: {
    forward_join_91: {
    forward_join_60: {
    forward_join_31: {
    forward_join_26: {
    forward_join_21: {
    forward_join_20: {
    forward_join_10: {
    forward_join_9: {
    life8_3 = (__fieldRead1076_0() ^ 46881087806174L);
    if (!((!__call1076_1(p0)))) {
        break forward_join_9;
    }
    forwardValue1076_10_0 = 1;
    break forward_join_10;
    }
    forwardValue1076_10_0 = 0;
    }
    life10_12 = forwardValue1076_10_0;
    if (!((life10_12 == 0))) {
        break forward_join_20;
    }
    if (!((!__call1076_4(p0, __fieldRead1076_3(__call1076_2()))))) {
        break forward_join_20;
    }
    forwardValue1076_21_0 = 1;
    break forward_join_21;
    }
    forwardValue1076_21_0 = 0;
    }
    life11_28 = forwardValue1076_21_0;
    if (!((life10_12 == 0))) {
        break forward_join_26;
    }
    if (!((life11_28 != 0))) {
        break forward_join_122;
    }
    }
    if (!((!__call1076_5(receiver, p0)))) {
        break forward_join_31;
    }
    return;
    }
    if (!((life11_28 != 0))) {
        break forward_join_60;
    }
    __call1076_6();
    spill1076_0 = 23901;
    __call1076_7(0x1.0p0f, 0x1.0p0f, 0x1.0p0f, 0x1.333334p-3f);
    spill1076_1 = (6707884762529699801L ^ life8_3);
    __call1076_8(0);
    __call1076_9();
    __call1076_12(__invokedynamic1076_10(spill1076_0, spill1076_1), __invokedynamic1076_11(3761, (2474924672631030817L ^ life8_3)));
    __call1076_14(__invokedynamic1076_13(29548, (8099822536807627253L ^ life8_3)), 0x1.010102p-8f);
    }
    life12_91 = new com.moon.event.EntityRenderEvent(p0, __fieldRead1076_15(receiver), p1, p2, p3, p4, p5, p6, true);
    __call1076_18(__call1076_17(__call1076_16()), life12_91);
    if (!((!__call1076_19(life12_91)))) {
        break forward_join_91;
    }
    __call1076_21(__fieldRead1076_20(receiver), p0, p1, p2, p3, p4, p5, p6);
    }
    life13_125 = new com.moon.event.EntityRenderEvent(p0, __fieldRead1076_22(receiver), p1, p2, p3, p4, p5, p6, false);
    __call1076_25(__call1076_24(__call1076_23()), life13_125);
    if (!((life11_28 != 0))) {
        break forward_join_122;
    }
    __call1076_26();
    __call1076_28(__invokedynamic1076_27(29548, (8099822536807627253L ^ life8_3)), 0x1.99999ap-4f);
    __call1076_29();
    __call1076_30(1);
    }
    return;
}
public static void h1076_0(moom.Oo p0) throws Throwable {
    throw __call1107600_0(p0);
}
public static void h1076_1(moom.Oo p0) throws Throwable {
    throw __call1107601_0(p0);
}
public static void h1076_2(moom.Oo p0) throws Throwable {
    throw __call1107602_0(p0);
}
public static void h1076_3(moom.Oo p0) throws Throwable {
    throw __call1107603_0(p0);
}
public static void h1076_4(moom.Oo p0) throws Throwable {
    throw __call1107604_0(p0);
}
public static void h1076_5(moom.Oo p0) throws Throwable {
    throw __call1107605_0(p0);
}
public static void h1076_6(moom.Oo p0) throws Throwable {
    throw __call1107606_0(p0);
}
public static void h1076_7(moom.Oo p0) throws Throwable {
    throw __call1107607_0(p0);
}
public static void h1076_8(moom.Oo p0) throws Throwable {
    throw __call1107608_0(p0);
}
private static native long __fieldRead1076_0() throws Throwable;
private static native boolean __call1076_1(net.minecraft.entity.EntityLivingBase a0) throws Throwable;
private static native net.minecraft.client.Minecraft __call1076_2() throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead1076_3(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __call1076_4(net.minecraft.entity.EntityLivingBase a0, net.minecraft.client.entity.EntityPlayerSP a1) throws Throwable;
private static native boolean __call1076_5(moom.mS a0, net.minecraft.entity.EntityLivingBase a1) throws Throwable;
private static native void __call1076_6() throws Throwable;
private static native void __call1076_7(float a0, float a1, float a2, float a3) throws Throwable;
private static native void __call1076_8(int a0) throws Throwable;
private static native void __call1076_9() throws Throwable;
private static native int __invokedynamic1076_10(int a0, long a1) throws Throwable;
private static native int __invokedynamic1076_11(int a0, long a1) throws Throwable;
private static native void __call1076_12(int a0, int a1) throws Throwable;
private static native int __invokedynamic1076_13(int a0, long a1) throws Throwable;
private static native void __call1076_14(int a0, float a1) throws Throwable;
private static native moom.iQ __fieldRead1076_15(moom.mS a0) throws Throwable;
private static native com.moon.runtime.ClientContext __call1076_16() throws Throwable;
private static native com.moon.events.EventBus __call1076_17(com.moon.runtime.ClientContext a0) throws Throwable;
private static native void __call1076_18(com.moon.events.EventBus a0, com.moon.event.EntityRenderEvent a1) throws Throwable;
private static native boolean __call1076_19(com.moon.event.EntityRenderEvent a0) throws Throwable;
private static native moom.iQ __fieldRead1076_20(moom.mS a0) throws Throwable;
private static native void __call1076_21(moom.iQ a0, net.minecraft.entity.EntityLivingBase a1, float a2, float a3, float a4, float a5, float a6, float a7) throws Throwable;
private static native moom.iQ __fieldRead1076_22(moom.mS a0) throws Throwable;
private static native com.moon.runtime.ClientContext __call1076_23() throws Throwable;
private static native com.moon.events.EventBus __call1076_24(com.moon.runtime.ClientContext a0) throws Throwable;
private static native void __call1076_25(com.moon.events.EventBus a0, com.moon.event.EntityRenderEvent a1) throws Throwable;
private static native void __call1076_26() throws Throwable;
private static native int __invokedynamic1076_27(int a0, long a1) throws Throwable;
private static native void __call1076_28(int a0, float a1) throws Throwable;
private static native void __call1076_29() throws Throwable;
private static native void __call1076_30(int a0) throws Throwable;
private static native java.lang.Exception __call1107600_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1107601_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1107602_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1107603_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1107604_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1107605_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1107606_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1107607_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1107608_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_a6652b79e2172060c244(moom.mS a0, net.minecraft.entity.EntityLivingBase a1, float a2, float a3, float a4, float a5, float a6, float a7, float a8) throws E;
private static final class __SourceHandler_a6652b79e2172060c244 {

public static void f458(moom.mS receiver, net.minecraft.entity.EntityLivingBase p0, float p1, float p2, float p3, float p4, float p5, float p6, float p7) throws Throwable {
    java.util.Iterator life9_3;
    net.minecraft.client.renderer.entity.layers.LayerRenderer life10_10;
    int life11_17;
    forest_join_66: {
    life9_3 = __call458_1(__fieldRead458_0(receiver));
    forest_cycle_4: while (true) {
    forest_join_65: {
    forest_join_61: {
    forest_join_60: {
    forest_join_39: {
    forest_join_25: {
    forest_join_21: {
    if (!(__call458_2(life9_3))) {
        break forest_join_66;
    }
    life10_10 = __cast458_4(__call458_3(life9_3));
    life11_17 = __integerCategory458_7(__call458_6(receiver, p0, p3, __call458_5(life10_10)));
    if (!(__call458_8())) {
        break forest_join_21;
    }
    __call458_9();
    }
    if (!(__fieldRead458_10(receiver))) {
        break forest_join_25;
    }
    __call458_11();
    }
    __call458_12(life10_10, p0, p1, p2, p3, p4, p5, p6, p7);
    if (!(__fieldRead458_13(receiver))) {
        break forest_join_39;
    }
    __call458_14();
    }
    if (!(__call458_15())) {
        break forest_join_61;
    }
    if (!(__call458_16())) {
        break forest_join_60;
    }
    __fieldWrite458_17(receiver, 1);
    __call458_18();
    __call458_19();
    __call458_20(life10_10, p0, p1, p2, p3, p4, p5, p6, p7);
    __call458_21();
    __call458_22();
    }
    __call458_23();
    }
    if (!((life11_17 != 0))) {
        break forest_join_65;
    }
    __call458_24(receiver);
    }
    continue forest_cycle_4;
    }
    }
    return;
}
public static void h458_0(moom.Oo p0) throws Throwable {
    throw __call3045800_0(p0);
}
public static void h458_1(moom.Oo p0) throws Throwable {
    throw __call3045801_0(p0);
}
public static void h458_2(moom.Oo p0) throws Throwable {
    throw __call3045802_0(p0);
}
public static void h458_3(moom.Oo p0) throws Throwable {
    throw __call3045803_0(p0);
}
public static void h458_4(moom.Oo p0) throws Throwable {
    throw __call3045804_0(p0);
}
public static void h458_5(moom.Oo p0) throws Throwable {
    throw __call3045805_0(p0);
}
private static native java.util.List __fieldRead458_0(moom.mS a0) throws Throwable;
private static native java.util.Iterator __call458_1(java.util.List a0) throws Throwable;
private static native boolean __call458_2(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call458_3(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.client.renderer.entity.layers.LayerRenderer __cast458_4(java.lang.Object a0) throws Throwable;
private static native boolean __call458_5(net.minecraft.client.renderer.entity.layers.LayerRenderer a0) throws Throwable;
private static native boolean __call458_6(moom.mS a0, net.minecraft.entity.EntityLivingBase a1, float a2, boolean a3) throws Throwable;
private static native int __integerCategory458_7(boolean value) throws Throwable;
private static native boolean __call458_8() throws Throwable;
private static native void __call458_9() throws Throwable;
private static native boolean __fieldRead458_10(moom.mS a0) throws Throwable;
private static native void __call458_11() throws Throwable;
private static native void __call458_12(net.minecraft.client.renderer.entity.layers.LayerRenderer a0, net.minecraft.entity.EntityLivingBase a1, float a2, float a3, float a4, float a5, float a6, float a7, float a8) throws Throwable;
private static native boolean __fieldRead458_13(moom.mS a0) throws Throwable;
private static native void __call458_14() throws Throwable;
private static native boolean __call458_15() throws Throwable;
private static native boolean __call458_16() throws Throwable;
private static native void __fieldWrite458_17(moom.mS a0, int a1) throws Throwable;
private static native void __call458_18() throws Throwable;
private static native void __call458_19() throws Throwable;
private static native void __call458_20(net.minecraft.client.renderer.entity.layers.LayerRenderer a0, net.minecraft.entity.EntityLivingBase a1, float a2, float a3, float a4, float a5, float a6, float a7, float a8) throws Throwable;
private static native void __call458_21() throws Throwable;
private static native void __call458_22() throws Throwable;
private static native void __call458_23() throws Throwable;
private static native void __call458_24(moom.mS a0) throws Throwable;
private static native java.lang.Exception __call3045800_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3045801_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3045802_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3045803_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3045804_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3045805_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_0abe1ef43278e9589c80(moom.mS a0, net.minecraft.entity.EntityLivingBase a1, float a2, boolean a3) throws E;
private static final class __SourceHandler_0abe1ef43278e9589c80 {

public static boolean f1077(moom.mS receiver, net.minecraft.entity.EntityLivingBase p0, float p1, boolean p2) throws Throwable {
    int forwardValue1077_31_0;
    int forwardValue1077_49_0;
    int spill1077_0;
    int spill1077_1;
    long spill1077_2;
    int spill1077_3;
    long spill1077_4;
    long life4_3;
    float life6_7;
    int life7_13;
    int life8_33;
    int life9_62;
    float life10_355;
    float life11_372;
    float life12_389;
    float life13_400;
    forward_join_404: {
    forward_join_311: {
    forward_join_62: {
    forward_join_56: {
    forward_join_49: {
    forward_join_48: {
    forward_join_46: {
    forward_join_39: {
    forward_join_31: {
    forward_join_30: {
    life4_3 = (__fieldRead1077_0() ^ 47864813828404L);
    life6_7 = __call1077_1(p0, p1);
    life7_13 = __call1077_2(receiver, p0, life6_7, p1);
    if (!((((life7_13 >> __invokedynamic1077_3(1108, (7972378177740352801L ^ life4_3))) & __invokedynamic1077_4(12316, (8578890148051196278L ^ life4_3))) > 0))) {
        break forward_join_30;
    }
    forwardValue1077_31_0 = 1;
    break forward_join_31;
    }
    forwardValue1077_31_0 = 0;
    }
    life8_33 = forwardValue1077_31_0;
    if (!((__fieldRead1077_5(p0) > 0))) {
        break forward_join_39;
    }
    if (!(__call1077_8(__call1077_7(__call1077_6())))) {
        break forward_join_46;
    }
    }
    if (!((__fieldRead1077_9(p0) > 0))) {
        break forward_join_48;
    }
    if (!((!__call1077_12(__call1077_11(__call1077_10()))))) {
        break forward_join_48;
    }
    }
    forwardValue1077_49_0 = 1;
    break forward_join_49;
    }
    forwardValue1077_49_0 = 0;
    }
    life9_62 = forwardValue1077_49_0;
    if (!((life8_33 == 0))) {
        break forward_join_56;
    }
    if (!((life9_62 == 0))) {
        break forward_join_56;
    }
    return __integerCategory1077_13(0);
    }
    if (!((life8_33 == 0))) {
        break forward_join_62;
    }
    if (!((!p2))) {
        break forward_join_62;
    }
    return __integerCategory1077_14(0);
    }
    __call1077_16(__fieldRead1077_15());
    spill1077_0 = 14127;
    __call1077_17();
    __call1077_21(__invokedynamic1077_18(spill1077_0, (377409960534580829L ^ life4_3)), __invokedynamic1077_19(4223, (3906972755999734017L ^ life4_3)), __fieldRead1077_20());
    __call1077_25(__invokedynamic1077_22(19951, (2377862498528289942L ^ life4_3)), __fieldRead1077_23(), __invokedynamic1077_24(5979, (5978887729152769583L ^ life4_3)));
    __call1077_29(__invokedynamic1077_26(19951, (2377862498528289942L ^ life4_3)), __fieldRead1077_27(), __fieldRead1077_28());
    __call1077_33(__invokedynamic1077_30(19951, (2377862498528289942L ^ life4_3)), __fieldRead1077_31(), __fieldRead1077_32());
    __call1077_37(__invokedynamic1077_34(19951, (2377862498528289942L ^ life4_3)), __fieldRead1077_35(), __invokedynamic1077_36(22105, (1306589928986378032L ^ life4_3)));
    __call1077_41(__invokedynamic1077_38(19951, (2377862498528289942L ^ life4_3)), __fieldRead1077_39(), __invokedynamic1077_40(22290, (1003474784976273014L ^ life4_3)));
    __call1077_45(__invokedynamic1077_42(19951, (2377862498528289942L ^ life4_3)), __fieldRead1077_43(), __invokedynamic1077_44(7478, (200599049126851667L ^ life4_3)));
    __call1077_49(__invokedynamic1077_46(19951, (2377862498528289942L ^ life4_3)), __fieldRead1077_47(), __fieldRead1077_48());
    __call1077_53(__invokedynamic1077_50(19951, (2377862498528289942L ^ life4_3)), __fieldRead1077_51(), __invokedynamic1077_52(23901, (6707883556157977651L ^ life4_3)));
    spill1077_1 = 19951;
    __call1077_55(__fieldRead1077_54());
    spill1077_2 = (2377862498528289942L ^ life4_3);
    __call1077_56();
    __call1077_60(__invokedynamic1077_57(spill1077_1, spill1077_2), __invokedynamic1077_58(2235, (168181006238491096L ^ life4_3)), __fieldRead1077_59());
    __call1077_64(__invokedynamic1077_61(19951, (2377862498528289942L ^ life4_3)), __fieldRead1077_62(), __fieldRead1077_63());
    __call1077_68(__invokedynamic1077_65(19951, (2377862498528289942L ^ life4_3)), __fieldRead1077_66(), __fieldRead1077_67());
    __call1077_72(__invokedynamic1077_69(19951, (2377862498528289942L ^ life4_3)), __fieldRead1077_70(), __fieldRead1077_71());
    __call1077_76(__invokedynamic1077_73(19951, (2377862498528289942L ^ life4_3)), __fieldRead1077_74(), __fieldRead1077_75());
    __call1077_80(__invokedynamic1077_77(19951, (2377862498528289942L ^ life4_3)), __fieldRead1077_78(), __invokedynamic1077_79(22290, (1003474784976273014L ^ life4_3)));
    __call1077_84(__invokedynamic1077_81(19951, (2377862498528289942L ^ life4_3)), __fieldRead1077_82(), __invokedynamic1077_83(22290, (1003474784976273014L ^ life4_3)));
    __call1077_88(__invokedynamic1077_85(19951, (2377862498528289942L ^ life4_3)), __fieldRead1077_86(), __invokedynamic1077_87(23901, (6707883556157977651L ^ life4_3)));
    __call1077_92(__invokedynamic1077_89(19951, (2377862498528289942L ^ life4_3)), __fieldRead1077_90(), __invokedynamic1077_91(23048, (1348287311625417592L ^ life4_3)));
    __call1077_96(__invokedynamic1077_93(19951, (2377862498528289942L ^ life4_3)), __fieldRead1077_94(), __fieldRead1077_95());
    __call1077_100(__invokedynamic1077_97(19951, (2377862498528289942L ^ life4_3)), __fieldRead1077_98(), __invokedynamic1077_99(23901, (6707883556157977651L ^ life4_3)));
    __call1077_102(__fieldRead1077_101(receiver), 0);
    if (!((life9_62 != 0))) {
        break forward_join_311;
    }
    __call1077_104(__fieldRead1077_103(receiver), 0x1.0p0f);
    __call1077_106(__fieldRead1077_105(receiver), 0x0.0p0f);
    __call1077_108(__fieldRead1077_107(receiver), 0x0.0p0f);
    __call1077_110(__fieldRead1077_109(receiver), 0x1.333334p-2f);
    if (!(__call1077_111())) {
        break forward_join_404;
    }
    __call1077_112(0x1.0p0f, 0x0.0p0f, 0x0.0p0f, 0x1.333334p-2f);
    break forward_join_404;
    }
    life10_355 = (((float) ((life7_13 >> __invokedynamic1077_113(7905, (1341985036349224860L ^ life4_3))) & __invokedynamic1077_114(12316, (8578890148051196278L ^ life4_3)))) / 0x1.fep7f);
    life11_372 = (((float) ((life7_13 >> __invokedynamic1077_115(29711, (7334797332045946210L ^ life4_3))) & __invokedynamic1077_116(12316, (8578890148051196278L ^ life4_3)))) / 0x1.fep7f);
    life12_389 = (((float) ((life7_13 >> __invokedynamic1077_117(18633, (6201910599192961441L ^ life4_3))) & __invokedynamic1077_118(12316, (8578890148051196278L ^ life4_3)))) / 0x1.fep7f);
    life13_400 = (((float) (life7_13 & __invokedynamic1077_119(12316, (8578890148051196278L ^ life4_3)))) / 0x1.fep7f);
    __call1077_121(__fieldRead1077_120(receiver), life11_372);
    __call1077_123(__fieldRead1077_122(receiver), life12_389);
    __call1077_125(__fieldRead1077_124(receiver), life13_400);
    __call1077_127(__fieldRead1077_126(receiver), (0x1.0p0f - life10_355));
    if (!(__call1077_128())) {
        break forward_join_404;
    }
    __call1077_129(life11_372, life12_389, life13_400, (0x1.0p0f - life10_355));
    }
    __call1077_131(__fieldRead1077_130(receiver));
    __call1077_135(__invokedynamic1077_132(19951, (2377862498528289942L ^ life4_3)), __invokedynamic1077_133(15867, (9038035915157542041L ^ life4_3)), __fieldRead1077_134(receiver));
    spill1077_3 = 19951;
    __call1077_137(__fieldRead1077_136());
    spill1077_4 = (2377862498528289942L ^ life4_3);
    __call1077_138();
    __call1077_141(__call1077_140(__fieldRead1077_139()));
    __call1077_145(__invokedynamic1077_142(spill1077_3, spill1077_4), __invokedynamic1077_143(2235, (168181006238491096L ^ life4_3)), __fieldRead1077_144());
    __call1077_149(__invokedynamic1077_146(19951, (2377862498528289942L ^ life4_3)), __fieldRead1077_147(), __invokedynamic1077_148(30873, (8389823595991618047L ^ life4_3)));
    __call1077_153(__invokedynamic1077_150(19951, (2377862498528289942L ^ life4_3)), __fieldRead1077_151(), __fieldRead1077_152());
    __call1077_157(__invokedynamic1077_154(19951, (2377862498528289942L ^ life4_3)), __fieldRead1077_155(), __fieldRead1077_156());
    __call1077_161(__invokedynamic1077_158(19951, (2377862498528289942L ^ life4_3)), __fieldRead1077_159(), __invokedynamic1077_160(22290, (1003474784976273014L ^ life4_3)));
    __call1077_165(__invokedynamic1077_162(19951, (2377862498528289942L ^ life4_3)), __fieldRead1077_163(), __invokedynamic1077_164(22290, (1003474784976273014L ^ life4_3)));
    __call1077_169(__invokedynamic1077_166(19951, (2377862498528289942L ^ life4_3)), __fieldRead1077_167(), __invokedynamic1077_168(23048, (1348287311625417592L ^ life4_3)));
    __call1077_173(__invokedynamic1077_170(19951, (2377862498528289942L ^ life4_3)), __fieldRead1077_171(), __fieldRead1077_172());
    __call1077_177(__invokedynamic1077_174(19951, (2377862498528289942L ^ life4_3)), __fieldRead1077_175(), __invokedynamic1077_176(23901, (6707883556157977651L ^ life4_3)));
    __call1077_179(__fieldRead1077_178());
    return __integerCategory1077_180(1);
}
public static void h1077_0(moom.Oo p0) throws Throwable {
    throw __call1107700_0(p0);
}
public static void h1077_1(moom.Oo p0) throws Throwable {
    throw __call1107701_0(p0);
}
public static void h1077_2(moom.Oo p0) throws Throwable {
    throw __call1107702_0(p0);
}
public static void h1077_3(moom.Oo p0) throws Throwable {
    throw __call1107703_0(p0);
}
public static void h1077_4(moom.Oo p0) throws Throwable {
    throw __call1107704_0(p0);
}
public static void h1077_5(moom.Oo p0) throws Throwable {
    throw __call1107705_0(p0);
}
public static void h1077_6(moom.Oo p0) throws Throwable {
    throw __call1107706_0(p0);
}
public static void h1077_7(moom.Oo p0) throws Throwable {
    throw __call1107707_0(p0);
}
public static void h1077_8(moom.Oo p0) throws Throwable {
    throw __call1107708_0(p0);
}
public static void h1077_9(moom.Oo p0) throws Throwable {
    throw __call1107709_0(p0);
}
public static void h1077_10(moom.Oo p0) throws Throwable {
    throw __call1107710_0(p0);
}
public static void h1077_11(moom.Oo p0) throws Throwable {
    throw __call1107711_0(p0);
}
private static native long __fieldRead1077_0() throws Throwable;
private static native float __call1077_1(net.minecraft.entity.EntityLivingBase a0, float a1) throws Throwable;
private static native int __call1077_2(moom.mS a0, net.minecraft.entity.EntityLivingBase a1, float a2, float a3) throws Throwable;
private static native int __invokedynamic1077_3(int a0, long a1) throws Throwable;
private static native int __invokedynamic1077_4(int a0, long a1) throws Throwable;
private static native int __fieldRead1077_5(net.minecraft.entity.EntityLivingBase a0) throws Throwable;
private static native net.minecraft.client.Minecraft __call1077_6() throws Throwable;
private static native net.minecraft.client.renderer.entity.RenderManager __call1077_7(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __call1077_8(net.minecraft.client.renderer.entity.RenderManager a0) throws Throwable;
private static native int __fieldRead1077_9(net.minecraft.entity.EntityLivingBase a0) throws Throwable;
private static native net.minecraft.client.Minecraft __call1077_10() throws Throwable;
private static native net.minecraft.client.renderer.entity.RenderManager __call1077_11(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __call1077_12(net.minecraft.client.renderer.entity.RenderManager a0) throws Throwable;
private static native boolean __integerCategory1077_13(int value) throws Throwable;
private static native boolean __integerCategory1077_14(int value) throws Throwable;
private static native int __fieldRead1077_15() throws Throwable;
private static native void __call1077_16(int a0) throws Throwable;
private static native void __call1077_17() throws Throwable;
private static native int __invokedynamic1077_18(int a0, long a1) throws Throwable;
private static native int __invokedynamic1077_19(int a0, long a1) throws Throwable;
private static native int __fieldRead1077_20() throws Throwable;
private static native void __call1077_21(int a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic1077_22(int a0, long a1) throws Throwable;
private static native int __fieldRead1077_23() throws Throwable;
private static native int __invokedynamic1077_24(int a0, long a1) throws Throwable;
private static native void __call1077_25(int a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic1077_26(int a0, long a1) throws Throwable;
private static native int __fieldRead1077_27() throws Throwable;
private static native int __fieldRead1077_28() throws Throwable;
private static native void __call1077_29(int a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic1077_30(int a0, long a1) throws Throwable;
private static native int __fieldRead1077_31() throws Throwable;
private static native int __fieldRead1077_32() throws Throwable;
private static native void __call1077_33(int a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic1077_34(int a0, long a1) throws Throwable;
private static native int __fieldRead1077_35() throws Throwable;
private static native int __invokedynamic1077_36(int a0, long a1) throws Throwable;
private static native void __call1077_37(int a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic1077_38(int a0, long a1) throws Throwable;
private static native int __fieldRead1077_39() throws Throwable;
private static native int __invokedynamic1077_40(int a0, long a1) throws Throwable;
private static native void __call1077_41(int a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic1077_42(int a0, long a1) throws Throwable;
private static native int __fieldRead1077_43() throws Throwable;
private static native int __invokedynamic1077_44(int a0, long a1) throws Throwable;
private static native void __call1077_45(int a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic1077_46(int a0, long a1) throws Throwable;
private static native int __fieldRead1077_47() throws Throwable;
private static native int __fieldRead1077_48() throws Throwable;
private static native void __call1077_49(int a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic1077_50(int a0, long a1) throws Throwable;
private static native int __fieldRead1077_51() throws Throwable;
private static native int __invokedynamic1077_52(int a0, long a1) throws Throwable;
private static native void __call1077_53(int a0, int a1, int a2) throws Throwable;
private static native int __fieldRead1077_54() throws Throwable;
private static native void __call1077_55(int a0) throws Throwable;
private static native void __call1077_56() throws Throwable;
private static native int __invokedynamic1077_57(int a0, long a1) throws Throwable;
private static native int __invokedynamic1077_58(int a0, long a1) throws Throwable;
private static native int __fieldRead1077_59() throws Throwable;
private static native void __call1077_60(int a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic1077_61(int a0, long a1) throws Throwable;
private static native int __fieldRead1077_62() throws Throwable;
private static native int __fieldRead1077_63() throws Throwable;
private static native void __call1077_64(int a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic1077_65(int a0, long a1) throws Throwable;
private static native int __fieldRead1077_66() throws Throwable;
private static native int __fieldRead1077_67() throws Throwable;
private static native void __call1077_68(int a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic1077_69(int a0, long a1) throws Throwable;
private static native int __fieldRead1077_70() throws Throwable;
private static native int __fieldRead1077_71() throws Throwable;
private static native void __call1077_72(int a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic1077_73(int a0, long a1) throws Throwable;
private static native int __fieldRead1077_74() throws Throwable;
private static native int __fieldRead1077_75() throws Throwable;
private static native void __call1077_76(int a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic1077_77(int a0, long a1) throws Throwable;
private static native int __fieldRead1077_78() throws Throwable;
private static native int __invokedynamic1077_79(int a0, long a1) throws Throwable;
private static native void __call1077_80(int a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic1077_81(int a0, long a1) throws Throwable;
private static native int __fieldRead1077_82() throws Throwable;
private static native int __invokedynamic1077_83(int a0, long a1) throws Throwable;
private static native void __call1077_84(int a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic1077_85(int a0, long a1) throws Throwable;
private static native int __fieldRead1077_86() throws Throwable;
private static native int __invokedynamic1077_87(int a0, long a1) throws Throwable;
private static native void __call1077_88(int a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic1077_89(int a0, long a1) throws Throwable;
private static native int __fieldRead1077_90() throws Throwable;
private static native int __invokedynamic1077_91(int a0, long a1) throws Throwable;
private static native void __call1077_92(int a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic1077_93(int a0, long a1) throws Throwable;
private static native int __fieldRead1077_94() throws Throwable;
private static native int __fieldRead1077_95() throws Throwable;
private static native void __call1077_96(int a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic1077_97(int a0, long a1) throws Throwable;
private static native int __fieldRead1077_98() throws Throwable;
private static native int __invokedynamic1077_99(int a0, long a1) throws Throwable;
private static native void __call1077_100(int a0, int a1, int a2) throws Throwable;
private static native java.nio.FloatBuffer __fieldRead1077_101(moom.mS a0) throws Throwable;
private static native java.nio.FloatBuffer __call1077_102(java.nio.FloatBuffer a0, int a1) throws Throwable;
private static native java.nio.FloatBuffer __fieldRead1077_103(moom.mS a0) throws Throwable;
private static native java.nio.FloatBuffer __call1077_104(java.nio.FloatBuffer a0, float a1) throws Throwable;
private static native java.nio.FloatBuffer __fieldRead1077_105(moom.mS a0) throws Throwable;
private static native java.nio.FloatBuffer __call1077_106(java.nio.FloatBuffer a0, float a1) throws Throwable;
private static native java.nio.FloatBuffer __fieldRead1077_107(moom.mS a0) throws Throwable;
private static native java.nio.FloatBuffer __call1077_108(java.nio.FloatBuffer a0, float a1) throws Throwable;
private static native java.nio.FloatBuffer __fieldRead1077_109(moom.mS a0) throws Throwable;
private static native java.nio.FloatBuffer __call1077_110(java.nio.FloatBuffer a0, float a1) throws Throwable;
private static native boolean __call1077_111() throws Throwable;
private static native void __call1077_112(float a0, float a1, float a2, float a3) throws Throwable;
private static native int __invokedynamic1077_113(int a0, long a1) throws Throwable;
private static native int __invokedynamic1077_114(int a0, long a1) throws Throwable;
private static native int __invokedynamic1077_115(int a0, long a1) throws Throwable;
private static native int __invokedynamic1077_116(int a0, long a1) throws Throwable;
private static native int __invokedynamic1077_117(int a0, long a1) throws Throwable;
private static native int __invokedynamic1077_118(int a0, long a1) throws Throwable;
private static native int __invokedynamic1077_119(int a0, long a1) throws Throwable;
private static native java.nio.FloatBuffer __fieldRead1077_120(moom.mS a0) throws Throwable;
private static native java.nio.FloatBuffer __call1077_121(java.nio.FloatBuffer a0, float a1) throws Throwable;
private static native java.nio.FloatBuffer __fieldRead1077_122(moom.mS a0) throws Throwable;
private static native java.nio.FloatBuffer __call1077_123(java.nio.FloatBuffer a0, float a1) throws Throwable;
private static native java.nio.FloatBuffer __fieldRead1077_124(moom.mS a0) throws Throwable;
private static native java.nio.FloatBuffer __call1077_125(java.nio.FloatBuffer a0, float a1) throws Throwable;
private static native java.nio.FloatBuffer __fieldRead1077_126(moom.mS a0) throws Throwable;
private static native java.nio.FloatBuffer __call1077_127(java.nio.FloatBuffer a0, float a1) throws Throwable;
private static native boolean __call1077_128() throws Throwable;
private static native void __call1077_129(float a0, float a1, float a2, float a3) throws Throwable;
private static native java.nio.FloatBuffer __fieldRead1077_130(moom.mS a0) throws Throwable;
private static native java.nio.FloatBuffer __call1077_131(java.nio.FloatBuffer a0) throws Throwable;
private static native int __invokedynamic1077_132(int a0, long a1) throws Throwable;
private static native int __invokedynamic1077_133(int a0, long a1) throws Throwable;
private static native java.nio.FloatBuffer __fieldRead1077_134(moom.mS a0) throws Throwable;
private static native void __call1077_135(int a0, int a1, java.nio.FloatBuffer a2) throws Throwable;
private static native int __fieldRead1077_136() throws Throwable;
private static native void __call1077_137(int a0) throws Throwable;
private static native void __call1077_138() throws Throwable;
private static native moom.n3 __fieldRead1077_139() throws Throwable;
private static native int __call1077_140(moom.n3 a0) throws Throwable;
private static native void __call1077_141(int a0) throws Throwable;
private static native int __invokedynamic1077_142(int a0, long a1) throws Throwable;
private static native int __invokedynamic1077_143(int a0, long a1) throws Throwable;
private static native int __fieldRead1077_144() throws Throwable;
private static native void __call1077_145(int a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic1077_146(int a0, long a1) throws Throwable;
private static native int __fieldRead1077_147() throws Throwable;
private static native int __invokedynamic1077_148(int a0, long a1) throws Throwable;
private static native void __call1077_149(int a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic1077_150(int a0, long a1) throws Throwable;
private static native int __fieldRead1077_151() throws Throwable;
private static native int __fieldRead1077_152() throws Throwable;
private static native void __call1077_153(int a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic1077_154(int a0, long a1) throws Throwable;
private static native int __fieldRead1077_155() throws Throwable;
private static native int __fieldRead1077_156() throws Throwable;
private static native void __call1077_157(int a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic1077_158(int a0, long a1) throws Throwable;
private static native int __fieldRead1077_159() throws Throwable;
private static native int __invokedynamic1077_160(int a0, long a1) throws Throwable;
private static native void __call1077_161(int a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic1077_162(int a0, long a1) throws Throwable;
private static native int __fieldRead1077_163() throws Throwable;
private static native int __invokedynamic1077_164(int a0, long a1) throws Throwable;
private static native void __call1077_165(int a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic1077_166(int a0, long a1) throws Throwable;
private static native int __fieldRead1077_167() throws Throwable;
private static native int __invokedynamic1077_168(int a0, long a1) throws Throwable;
private static native void __call1077_169(int a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic1077_170(int a0, long a1) throws Throwable;
private static native int __fieldRead1077_171() throws Throwable;
private static native int __fieldRead1077_172() throws Throwable;
private static native void __call1077_173(int a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic1077_174(int a0, long a1) throws Throwable;
private static native int __fieldRead1077_175() throws Throwable;
private static native int __invokedynamic1077_176(int a0, long a1) throws Throwable;
private static native void __call1077_177(int a0, int a1, int a2) throws Throwable;
private static native int __fieldRead1077_178() throws Throwable;
private static native void __call1077_179(int a0) throws Throwable;
private static native boolean __integerCategory1077_180(int value) throws Throwable;
private static native java.lang.Exception __call1107700_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1107701_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1107702_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1107703_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1107704_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1107705_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1107706_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1107707_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1107708_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1107709_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1107710_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1107711_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_91e58ac6eb6068872962(moom.mS a0, net.minecraft.entity.EntityLivingBase a1) throws E;
private static final class __SourceHandler_91e58ac6eb6068872962 {

public static boolean f894(moom.mS receiver, net.minecraft.entity.EntityLivingBase p0) throws Throwable {
    int forestValue894_36_0;
    int forestValue894_46_0;
    int forestValue894_66_0;
    net.minecraft.client.entity.EntityPlayerSP life2_2;
    moom.Bj life3_12;
    moom.Bj life4_15;
    net.minecraft.scoreboard.Team$EnumVisible life5_20;
    forest_join_66: {
    forest_join_65: {
    forest_join_49: {
    forest_join_47: {
    forest_join_46: {
    forest_join_45: {
    forest_join_43: {
    forest_join_37: {
    forest_join_36: {
    forest_join_35: {
    forest_join_33: {
    forest_join_27: {
    forest_join_25: {
    life2_2 = __fieldRead894_1(__call894_0());
    if (!((__instanceOf894_2(p0) != 0))) {
        break forest_join_49;
    }
    if (!((p0 != life2_2))) {
        break forest_join_49;
    }
    life3_12 = __call894_3(p0);
    life4_15 = __call894_4(life2_2);
    if (!((life3_12 != null))) {
        break forest_join_49;
    }
    life5_20 = __call894_5(life3_12);
    switch ((__fieldRead894_6())[__call894_7(life5_20)]) {
case 1:
{
        break forest_join_25;
    }
case 2:
{
        break forest_join_27;
    }
case 3:
{
        break forest_join_37;
    }
default:
{
        break forest_join_47;
    }
}
    }
    return __integerCategory894_8(0);
    }
    if (!((life4_15 != null))) {
        break forest_join_33;
    }
    if (!(__call894_9(life3_12, life4_15))) {
        break forest_join_35;
    }
    }
    forestValue894_36_0 = 1;
    break forest_join_36;
    }
    forestValue894_36_0 = 0;
    }
    return __integerCategory894_10(forestValue894_36_0);
    }
    if (!((life4_15 != null))) {
        break forest_join_43;
    }
    if (!((!__call894_11(life3_12, life4_15)))) {
        break forest_join_45;
    }
    }
    forestValue894_46_0 = 1;
    break forest_join_46;
    }
    forestValue894_46_0 = 0;
    }
    return __integerCategory894_12(forestValue894_46_0);
    }
    return __integerCategory894_13(1);
    }
    if (!(__call894_14())) {
        break forest_join_65;
    }
    if (!((p0 != __fieldRead894_16(__fieldRead894_15(receiver))))) {
        break forest_join_65;
    }
    if (!((!__call894_17(p0, life2_2)))) {
        break forest_join_65;
    }
    if (!((__fieldRead894_18(p0) == null))) {
        break forest_join_65;
    }
    forestValue894_66_0 = 1;
    break forest_join_66;
    }
    forestValue894_66_0 = 0;
    }
    return __integerCategory894_19(forestValue894_66_0);
}
public static boolean h894_0(moom.Oo p0) throws Throwable {
    throw __call3089400_0(p0);
}
public static boolean h894_1(moom.Oo p0) throws Throwable {
    throw __call3089401_0(p0);
}
public static boolean h894_2(moom.Oo p0) throws Throwable {
    throw __call3089402_0(p0);
}
public static boolean h894_3(moom.Oo p0) throws Throwable {
    throw __call3089403_0(p0);
}
public static boolean h894_4(moom.Oo p0) throws Throwable {
    throw __call3089404_0(p0);
}
public static boolean h894_5(moom.Oo p0) throws Throwable {
    throw __call3089405_0(p0);
}
public static boolean h894_6(moom.Oo p0) throws Throwable {
    throw __call3089406_0(p0);
}
public static boolean h894_7(moom.Oo p0) throws Throwable {
    throw __call3089407_0(p0);
}
public static boolean h894_8(moom.Oo p0) throws Throwable {
    throw __call3089408_0(p0);
}
public static boolean h894_9(moom.Oo p0) throws Throwable {
    throw __call3089409_0(p0);
}
private static native net.minecraft.client.Minecraft __call894_0() throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead894_1(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __instanceOf894_2(net.minecraft.entity.EntityLivingBase a0) throws Throwable;
private static native moom.Bj __call894_3(net.minecraft.entity.EntityLivingBase a0) throws Throwable;
private static native moom.Bj __call894_4(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native net.minecraft.scoreboard.Team$EnumVisible __call894_5(moom.Bj a0) throws Throwable;
private static native int[] __fieldRead894_6() throws Throwable;
private static native int __call894_7(net.minecraft.scoreboard.Team$EnumVisible a0) throws Throwable;
private static native boolean __integerCategory894_8(int value) throws Throwable;
private static native boolean __call894_9(moom.Bj a0, moom.Bj a1) throws Throwable;
private static native boolean __integerCategory894_10(int value) throws Throwable;
private static native boolean __call894_11(moom.Bj a0, moom.Bj a1) throws Throwable;
private static native boolean __integerCategory894_12(int value) throws Throwable;
private static native boolean __integerCategory894_13(int value) throws Throwable;
private static native boolean __call894_14() throws Throwable;
private static native net.minecraft.client.renderer.entity.RenderManager __fieldRead894_15(moom.mS a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead894_16(net.minecraft.client.renderer.entity.RenderManager a0) throws Throwable;
private static native boolean __call894_17(net.minecraft.entity.EntityLivingBase a0, net.minecraft.client.entity.EntityPlayerSP a1) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead894_18(net.minecraft.entity.EntityLivingBase a0) throws Throwable;
private static native boolean __integerCategory894_19(int value) throws Throwable;
private static native java.lang.Exception __call3089400_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3089401_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3089402_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3089403_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3089404_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3089405_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3089406_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3089407_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3089408_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3089409_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_22a722d4fe94ce37a0be(moom.mS a0, net.minecraft.entity.EntityLivingBase a1, double a2, double a3, double a4) throws E;
private static final class __SourceHandler_22a722d4fe94ce37a0be {

public static void f400(moom.mS receiver, net.minecraft.entity.EntityLivingBase p0, double p1, double p2, double p3) throws Throwable {
    long life8_3;
    com.moon.event.EntityEvent life10_15;
    double life11_35;
    float life13_44;
    java.lang.String life14_55;
    float life15_58;
    net.minecraft.client.gui.FontRenderer life16_70;
    int life17_146;
    net.minecraft.client.renderer.Tessellator life18_148;
    moom.lw life19_151;
    life8_3 = (__fieldRead400_0() ^ 32070555106137L);
    if ((!__call400_3(__call400_2(__call400_1())))) {
        return;
    }
    life10_15 = new com.moon.event.EntityEvent(p0);
    __call400_6(__call400_5(__call400_4()), life10_15);
    if (__call400_7(life10_15)) {
        return;
    }
    if (__call400_8(receiver, p0)) {
        life11_35 = __call400_11(p0, __fieldRead400_10(__fieldRead400_9(receiver)));
        life13_44 = (__call400_12(p0) ? __fieldRead400_13() : __fieldRead400_14());
        if ((life11_35 < ((double) (life13_44 * life13_44)))) {
        life14_55 = __call400_16(__call400_15(p0));
        int spill400_0 = 18252;
        life15_58 = 0x1.b4e81ep-6f;
        __call400_18(__invokedynamic400_17(spill400_0, (6580938787987893338L ^ life8_3)), 0x1.99999ap-4f);
        if (__call400_19(p0)) {
        life16_70 = __call400_20(receiver);
        __call400_21();
        float spill400_1 = ((float) p1);
        float spill400_2 = ((((float) p2) + __fieldRead400_22(p0)) + 0x1.0p-1f);
        __call400_25(spill400_1, (spill400_2 - (__call400_23(p0) ? (__fieldRead400_24(p0) / 0x1.0p1f) : 0x0.0p0f)), ((float) p3));
        int spill400_3 = 27171;
        __call400_26(0x0.0p0f, 0x1.0p0f, 0x0.0p0f);
        long spill400_4 = (9223042901748941093L ^ life8_3);
        __call400_29((-__fieldRead400_28(__fieldRead400_27(receiver))), 0x0.0p0f, 0x1.0p0f, 0x0.0p0f);
        __call400_32(__fieldRead400_31(__fieldRead400_30(receiver)), 0x1.0p0f, 0x0.0p0f, 0x0.0p0f);
        __call400_33(-0x1.b4e81ep-6f, -0x1.b4e81ep-6f, 0x1.b4e81ep-6f);
        __call400_34(0x0.0p0f, 0x1.2bfffep3f, 0x0.0p0f);
        __call400_35();
        __call400_36(0);
        __call400_37();
        __call400_38();
        __call400_41(__invokedynamic400_39(spill400_3, spill400_4), __invokedynamic400_40(11653, (2276630730929981086L ^ life8_3)), 1, 0);
        life17_146 = (__call400_42(life16_70, life14_55) / 2);
        life18_148 = __call400_43();
        life19_151 = __call400_44(life18_148);
        __call400_47(life19_151, __invokedynamic400_45(4799, (3621085512101525923L ^ life8_3)), __fieldRead400_46());
        __call400_50(__call400_49(__call400_48(life19_151, ((double) ((-life17_146) - 1)), -0x1.0p0d, 0x0.0p0d), 0x0.0p0f, 0x0.0p0f, 0x0.0p0f, 0x1.0p-2f));
        __call400_53(__call400_52(__call400_51(life19_151, ((double) ((-life17_146) - 1)), 0x1.0p3d, 0x0.0p0d), 0x0.0p0f, 0x0.0p0f, 0x0.0p0f, 0x1.0p-2f));
        __call400_56(__call400_55(__call400_54(life19_151, ((double) (life17_146 + 1)), 0x1.0p3d, 0x0.0p0d), 0x0.0p0f, 0x0.0p0f, 0x0.0p0f, 0x1.0p-2f));
        __call400_59(__call400_58(__call400_57(life19_151, ((double) (life17_146 + 1)), -0x1.0p0d, 0x0.0p0d), 0x0.0p0f, 0x0.0p0f, 0x0.0p0f, 0x1.0p-2f));
        __call400_60(life18_148);
        __call400_61();
        __call400_62(1);
        __call400_65(life16_70, life14_55, ((float) ((-__call400_63(life16_70, life14_55)) / 2)), 0x0.0p0f, __invokedynamic400_64(21827, (5512530899546193487L ^ life8_3)));
        __call400_66();
        __call400_67();
        __call400_68(0x1.0p0f, 0x1.0p0f, 0x1.0p0f, 0x1.0p0f);
        __call400_69();
    } else {
        moom.mS spill400_5 = receiver;
        net.minecraft.entity.EntityLivingBase spill400_6 = p0;
        double spill400_7 = p1;
        double spill400_8 = p2;
        __call400_72(spill400_5, spill400_6, spill400_7, (spill400_8 - (__call400_70(p0) ? ((double) (__fieldRead400_71(p0) / 0x1.0p1f)) : 0x0.0p0d)), p3, life14_55, 0x1.b4e81ep-6f, life11_35);
    }
    }
    }
    return;
}
public static void h400_0(moom.Oo p0) throws Throwable {
    throw __call2040000_0(p0);
}
public static void h400_1(moom.Oo p0) throws Throwable {
    throw __call2040001_0(p0);
}
public static void h400_2(moom.Oo p0) throws Throwable {
    throw __call2040002_0(p0);
}
public static void h400_3(moom.Oo p0) throws Throwable {
    throw __call2040003_0(p0);
}
public static void h400_4(moom.Oo p0) throws Throwable {
    throw __call2040004_0(p0);
}
private static native long __fieldRead400_0() throws Throwable;
private static native net.minecraft.client.Minecraft __call400_1() throws Throwable;
private static native net.minecraft.client.renderer.entity.RenderManager __call400_2(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __call400_3(net.minecraft.client.renderer.entity.RenderManager a0) throws Throwable;
private static native com.moon.runtime.ClientContext __call400_4() throws Throwable;
private static native com.moon.events.EventBus __call400_5(com.moon.runtime.ClientContext a0) throws Throwable;
private static native void __call400_6(com.moon.events.EventBus a0, com.moon.event.EntityEvent a1) throws Throwable;
private static native boolean __call400_7(com.moon.event.EntityEvent a0) throws Throwable;
private static native boolean __call400_8(moom.mS a0, net.minecraft.entity.EntityLivingBase a1) throws Throwable;
private static native net.minecraft.client.renderer.entity.RenderManager __fieldRead400_9(moom.mS a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead400_10(net.minecraft.client.renderer.entity.RenderManager a0) throws Throwable;
private static native double __call400_11(net.minecraft.entity.EntityLivingBase a0, net.minecraft.entity.Entity a1) throws Throwable;
private static native boolean __call400_12(net.minecraft.entity.EntityLivingBase a0) throws Throwable;
private static native float __fieldRead400_13() throws Throwable;
private static native float __fieldRead400_14() throws Throwable;
private static native net.minecraft.util.IChatComponent __call400_15(net.minecraft.entity.EntityLivingBase a0) throws Throwable;
private static native java.lang.String __call400_16(net.minecraft.util.IChatComponent a0) throws Throwable;
private static native int __invokedynamic400_17(int a0, long a1) throws Throwable;
private static native void __call400_18(int a0, float a1) throws Throwable;
private static native boolean __call400_19(net.minecraft.entity.EntityLivingBase a0) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __call400_20(moom.mS a0) throws Throwable;
private static native void __call400_21() throws Throwable;
private static native float __fieldRead400_22(net.minecraft.entity.EntityLivingBase a0) throws Throwable;
private static native boolean __call400_23(net.minecraft.entity.EntityLivingBase a0) throws Throwable;
private static native float __fieldRead400_24(net.minecraft.entity.EntityLivingBase a0) throws Throwable;
private static native void __call400_25(float a0, float a1, float a2) throws Throwable;
private static native void __call400_26(float a0, float a1, float a2) throws Throwable;
private static native net.minecraft.client.renderer.entity.RenderManager __fieldRead400_27(moom.mS a0) throws Throwable;
private static native float __fieldRead400_28(net.minecraft.client.renderer.entity.RenderManager a0) throws Throwable;
private static native void __call400_29(float a0, float a1, float a2, float a3) throws Throwable;
private static native net.minecraft.client.renderer.entity.RenderManager __fieldRead400_30(moom.mS a0) throws Throwable;
private static native float __fieldRead400_31(net.minecraft.client.renderer.entity.RenderManager a0) throws Throwable;
private static native void __call400_32(float a0, float a1, float a2, float a3) throws Throwable;
private static native void __call400_33(float a0, float a1, float a2) throws Throwable;
private static native void __call400_34(float a0, float a1, float a2) throws Throwable;
private static native void __call400_35() throws Throwable;
private static native void __call400_36(int a0) throws Throwable;
private static native void __call400_37() throws Throwable;
private static native void __call400_38() throws Throwable;
private static native int __invokedynamic400_39(int a0, long a1) throws Throwable;
private static native int __invokedynamic400_40(int a0, long a1) throws Throwable;
private static native void __call400_41(int a0, int a1, int a2, int a3) throws Throwable;
private static native int __call400_42(net.minecraft.client.gui.FontRenderer a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.client.renderer.Tessellator __call400_43() throws Throwable;
private static native moom.lw __call400_44(net.minecraft.client.renderer.Tessellator a0) throws Throwable;
private static native int __invokedynamic400_45(int a0, long a1) throws Throwable;
private static native moom.oD __fieldRead400_46() throws Throwable;
private static native void __call400_47(moom.lw a0, int a1, moom.oD a2) throws Throwable;
private static native moom.lw __call400_48(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call400_49(moom.lw a0, float a1, float a2, float a3, float a4) throws Throwable;
private static native void __call400_50(moom.lw a0) throws Throwable;
private static native moom.lw __call400_51(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call400_52(moom.lw a0, float a1, float a2, float a3, float a4) throws Throwable;
private static native void __call400_53(moom.lw a0) throws Throwable;
private static native moom.lw __call400_54(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call400_55(moom.lw a0, float a1, float a2, float a3, float a4) throws Throwable;
private static native void __call400_56(moom.lw a0) throws Throwable;
private static native moom.lw __call400_57(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call400_58(moom.lw a0, float a1, float a2, float a3, float a4) throws Throwable;
private static native void __call400_59(moom.lw a0) throws Throwable;
private static native void __call400_60(net.minecraft.client.renderer.Tessellator a0) throws Throwable;
private static native void __call400_61() throws Throwable;
private static native void __call400_62(int a0) throws Throwable;
private static native int __call400_63(net.minecraft.client.gui.FontRenderer a0, java.lang.String a1) throws Throwable;
private static native int __invokedynamic400_64(int a0, long a1) throws Throwable;
private static native int __call400_65(net.minecraft.client.gui.FontRenderer a0, java.lang.String a1, float a2, float a3, int a4) throws Throwable;
private static native void __call400_66() throws Throwable;
private static native void __call400_67() throws Throwable;
private static native void __call400_68(float a0, float a1, float a2, float a3) throws Throwable;
private static native void __call400_69() throws Throwable;
private static native boolean __call400_70(net.minecraft.entity.EntityLivingBase a0) throws Throwable;
private static native float __fieldRead400_71(net.minecraft.entity.EntityLivingBase a0) throws Throwable;
private static native void __call400_72(moom.mS a0, net.minecraft.entity.EntityLivingBase a1, double a2, double a3, double a4, java.lang.String a5, float a6, double a7) throws Throwable;
private static native java.lang.Exception __call2040000_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call2040001_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call2040002_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call2040003_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call2040004_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_12f44350dae37c352e6e(moom.mS a0) throws E;
private static final class __SourceHandler_12f44350dae37c352e6e {

public static void f100122(moom.mS receiver) throws Throwable {
    long life1_3;
    forest_join_352: {
    life1_3 = (__fieldRead100122_0() ^ 100684694961510L);
    __call100122_2(__fieldRead100122_1());
    __call100122_3();
    __call100122_7(__invokedynamic100122_4(19951, (2377809627585962180L ^ life1_3)), __invokedynamic100122_5(2235, (168057749296620938L ^ life1_3)), __fieldRead100122_6());
    __call100122_11(__invokedynamic100122_8(19951, (2377809627585962180L ^ life1_3)), __fieldRead100122_9(), __invokedynamic100122_10(30873, (8389876260373190061L ^ life1_3)));
    __call100122_15(__invokedynamic100122_12(19951, (2377809627585962180L ^ life1_3)), __fieldRead100122_13(), __fieldRead100122_14());
    __call100122_19(__invokedynamic100122_16(19951, (2377809627585962180L ^ life1_3)), __fieldRead100122_17(), __fieldRead100122_18());
    __call100122_23(__invokedynamic100122_20(19951, (2377809627585962180L ^ life1_3)), __fieldRead100122_21(), __invokedynamic100122_22(22290, (1003598041851230756L ^ life1_3)));
    __call100122_27(__invokedynamic100122_24(19951, (2377809627585962180L ^ life1_3)), __fieldRead100122_25(), __invokedynamic100122_26(22290, (1003598041851230756L ^ life1_3)));
    __call100122_31(__invokedynamic100122_28(19951, (2377809627585962180L ^ life1_3)), __fieldRead100122_29(), __invokedynamic100122_30(30873, (8389876260373190061L ^ life1_3)));
    __call100122_35(__invokedynamic100122_32(19951, (2377809627585962180L ^ life1_3)), __fieldRead100122_33(), __fieldRead100122_34());
    __call100122_39(__invokedynamic100122_36(19951, (2377809627585962180L ^ life1_3)), __fieldRead100122_37(), __fieldRead100122_38());
    __call100122_43(__invokedynamic100122_40(19951, (2377809627585962180L ^ life1_3)), __fieldRead100122_41(), __invokedynamic100122_42(23901, (6707901191322955873L ^ life1_3)));
    __call100122_47(__invokedynamic100122_44(19951, (2377809627585962180L ^ life1_3)), __fieldRead100122_45(), __invokedynamic100122_46(23901, (6707901191322955873L ^ life1_3)));
    __call100122_49(__fieldRead100122_48());
    __call100122_53(__invokedynamic100122_50(19951, (2377809627585962180L ^ life1_3)), __invokedynamic100122_51(2235, (168057749296620938L ^ life1_3)), __fieldRead100122_52());
    __call100122_57(__invokedynamic100122_54(19951, (2377809627585962180L ^ life1_3)), __fieldRead100122_55(), __invokedynamic100122_56(30873, (8389876260373190061L ^ life1_3)));
    __call100122_61(__invokedynamic100122_58(19951, (2377809627585962180L ^ life1_3)), __fieldRead100122_59(), __invokedynamic100122_60(22290, (1003598041851230756L ^ life1_3)));
    __call100122_65(__invokedynamic100122_62(19951, (2377809627585962180L ^ life1_3)), __fieldRead100122_63(), __invokedynamic100122_64(22290, (1003598041851230756L ^ life1_3)));
    __call100122_69(__invokedynamic100122_66(19951, (2377809627585962180L ^ life1_3)), __fieldRead100122_67(), __invokedynamic100122_68(3808, (2576508121281995741L ^ life1_3)));
    __call100122_73(__invokedynamic100122_70(19951, (2377809627585962180L ^ life1_3)), __fieldRead100122_71(), __fieldRead100122_72());
    __call100122_77(__invokedynamic100122_74(19951, (2377809627585962180L ^ life1_3)), __fieldRead100122_75(), __invokedynamic100122_76(30873, (8389876260373190061L ^ life1_3)));
    __call100122_81(__invokedynamic100122_78(19951, (2377809627585962180L ^ life1_3)), __fieldRead100122_79(), __invokedynamic100122_80(23901, (6707901191322955873L ^ life1_3)));
    __call100122_85(__invokedynamic100122_82(19951, (2377809627585962180L ^ life1_3)), __fieldRead100122_83(), __invokedynamic100122_84(2262, (7753363435611923955L ^ life1_3)));
    __call100122_86(0x1.0p0f, 0x1.0p0f, 0x1.0p0f, 0x1.0p0f);
    __call100122_88(__fieldRead100122_87());
    __call100122_89();
    __call100122_90(0);
    __call100122_94(__invokedynamic100122_91(19951, (2377809627585962180L ^ life1_3)), __invokedynamic100122_92(2235, (168057749296620938L ^ life1_3)), __fieldRead100122_93());
    __call100122_98(__invokedynamic100122_95(19951, (2377809627585962180L ^ life1_3)), __fieldRead100122_96(), __invokedynamic100122_97(30873, (8389876260373190061L ^ life1_3)));
    __call100122_102(__invokedynamic100122_99(19951, (2377809627585962180L ^ life1_3)), __fieldRead100122_100(), __invokedynamic100122_101(22290, (1003598041851230756L ^ life1_3)));
    __call100122_106(__invokedynamic100122_103(19951, (2377809627585962180L ^ life1_3)), __fieldRead100122_104(), __invokedynamic100122_105(22290, (1003598041851230756L ^ life1_3)));
    __call100122_110(__invokedynamic100122_107(19951, (2377809627585962180L ^ life1_3)), __fieldRead100122_108(), __invokedynamic100122_109(2262, (7753363435611923955L ^ life1_3)));
    __call100122_114(__invokedynamic100122_111(19951, (2377809627585962180L ^ life1_3)), __fieldRead100122_112(), __fieldRead100122_113());
    __call100122_118(__invokedynamic100122_115(19951, (2377809627585962180L ^ life1_3)), __fieldRead100122_116(), __invokedynamic100122_117(30873, (8389876260373190061L ^ life1_3)));
    __call100122_122(__invokedynamic100122_119(19951, (2377809627585962180L ^ life1_3)), __fieldRead100122_120(), __invokedynamic100122_121(23901, (6707901191322955873L ^ life1_3)));
    __call100122_126(__invokedynamic100122_123(19951, (2377809627585962180L ^ life1_3)), __fieldRead100122_124(), __invokedynamic100122_125(2262, (7753363435611923955L ^ life1_3)));
    __call100122_128(__fieldRead100122_127());
    if (!(__call100122_129())) {
        break forest_join_352;
    }
    __call100122_130(0x0.0p0f, 0x0.0p0f, 0x0.0p0f, 0x0.0p0f);
    }
    return;
}
public static void h100122_0(moom.Oo p0) throws Throwable {
    throw __call13012200_0(p0);
}
private static native long __fieldRead100122_0() throws Throwable;
private static native int __fieldRead100122_1() throws Throwable;
private static native void __call100122_2(int a0) throws Throwable;
private static native void __call100122_3() throws Throwable;
private static native int __invokedynamic100122_4(int a0, long a1) throws Throwable;
private static native int __invokedynamic100122_5(int a0, long a1) throws Throwable;
private static native int __fieldRead100122_6() throws Throwable;
private static native void __call100122_7(int a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic100122_8(int a0, long a1) throws Throwable;
private static native int __fieldRead100122_9() throws Throwable;
private static native int __invokedynamic100122_10(int a0, long a1) throws Throwable;
private static native void __call100122_11(int a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic100122_12(int a0, long a1) throws Throwable;
private static native int __fieldRead100122_13() throws Throwable;
private static native int __fieldRead100122_14() throws Throwable;
private static native void __call100122_15(int a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic100122_16(int a0, long a1) throws Throwable;
private static native int __fieldRead100122_17() throws Throwable;
private static native int __fieldRead100122_18() throws Throwable;
private static native void __call100122_19(int a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic100122_20(int a0, long a1) throws Throwable;
private static native int __fieldRead100122_21() throws Throwable;
private static native int __invokedynamic100122_22(int a0, long a1) throws Throwable;
private static native void __call100122_23(int a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic100122_24(int a0, long a1) throws Throwable;
private static native int __fieldRead100122_25() throws Throwable;
private static native int __invokedynamic100122_26(int a0, long a1) throws Throwable;
private static native void __call100122_27(int a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic100122_28(int a0, long a1) throws Throwable;
private static native int __fieldRead100122_29() throws Throwable;
private static native int __invokedynamic100122_30(int a0, long a1) throws Throwable;
private static native void __call100122_31(int a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic100122_32(int a0, long a1) throws Throwable;
private static native int __fieldRead100122_33() throws Throwable;
private static native int __fieldRead100122_34() throws Throwable;
private static native void __call100122_35(int a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic100122_36(int a0, long a1) throws Throwable;
private static native int __fieldRead100122_37() throws Throwable;
private static native int __fieldRead100122_38() throws Throwable;
private static native void __call100122_39(int a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic100122_40(int a0, long a1) throws Throwable;
private static native int __fieldRead100122_41() throws Throwable;
private static native int __invokedynamic100122_42(int a0, long a1) throws Throwable;
private static native void __call100122_43(int a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic100122_44(int a0, long a1) throws Throwable;
private static native int __fieldRead100122_45() throws Throwable;
private static native int __invokedynamic100122_46(int a0, long a1) throws Throwable;
private static native void __call100122_47(int a0, int a1, int a2) throws Throwable;
private static native int __fieldRead100122_48() throws Throwable;
private static native void __call100122_49(int a0) throws Throwable;
private static native int __invokedynamic100122_50(int a0, long a1) throws Throwable;
private static native int __invokedynamic100122_51(int a0, long a1) throws Throwable;
private static native int __fieldRead100122_52() throws Throwable;
private static native void __call100122_53(int a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic100122_54(int a0, long a1) throws Throwable;
private static native int __fieldRead100122_55() throws Throwable;
private static native int __invokedynamic100122_56(int a0, long a1) throws Throwable;
private static native void __call100122_57(int a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic100122_58(int a0, long a1) throws Throwable;
private static native int __fieldRead100122_59() throws Throwable;
private static native int __invokedynamic100122_60(int a0, long a1) throws Throwable;
private static native void __call100122_61(int a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic100122_62(int a0, long a1) throws Throwable;
private static native int __fieldRead100122_63() throws Throwable;
private static native int __invokedynamic100122_64(int a0, long a1) throws Throwable;
private static native void __call100122_65(int a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic100122_66(int a0, long a1) throws Throwable;
private static native int __fieldRead100122_67() throws Throwable;
private static native int __invokedynamic100122_68(int a0, long a1) throws Throwable;
private static native void __call100122_69(int a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic100122_70(int a0, long a1) throws Throwable;
private static native int __fieldRead100122_71() throws Throwable;
private static native int __fieldRead100122_72() throws Throwable;
private static native void __call100122_73(int a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic100122_74(int a0, long a1) throws Throwable;
private static native int __fieldRead100122_75() throws Throwable;
private static native int __invokedynamic100122_76(int a0, long a1) throws Throwable;
private static native void __call100122_77(int a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic100122_78(int a0, long a1) throws Throwable;
private static native int __fieldRead100122_79() throws Throwable;
private static native int __invokedynamic100122_80(int a0, long a1) throws Throwable;
private static native void __call100122_81(int a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic100122_82(int a0, long a1) throws Throwable;
private static native int __fieldRead100122_83() throws Throwable;
private static native int __invokedynamic100122_84(int a0, long a1) throws Throwable;
private static native void __call100122_85(int a0, int a1, int a2) throws Throwable;
private static native void __call100122_86(float a0, float a1, float a2, float a3) throws Throwable;
private static native int __fieldRead100122_87() throws Throwable;
private static native void __call100122_88(int a0) throws Throwable;
private static native void __call100122_89() throws Throwable;
private static native void __call100122_90(int a0) throws Throwable;
private static native int __invokedynamic100122_91(int a0, long a1) throws Throwable;
private static native int __invokedynamic100122_92(int a0, long a1) throws Throwable;
private static native int __fieldRead100122_93() throws Throwable;
private static native void __call100122_94(int a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic100122_95(int a0, long a1) throws Throwable;
private static native int __fieldRead100122_96() throws Throwable;
private static native int __invokedynamic100122_97(int a0, long a1) throws Throwable;
private static native void __call100122_98(int a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic100122_99(int a0, long a1) throws Throwable;
private static native int __fieldRead100122_100() throws Throwable;
private static native int __invokedynamic100122_101(int a0, long a1) throws Throwable;
private static native void __call100122_102(int a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic100122_103(int a0, long a1) throws Throwable;
private static native int __fieldRead100122_104() throws Throwable;
private static native int __invokedynamic100122_105(int a0, long a1) throws Throwable;
private static native void __call100122_106(int a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic100122_107(int a0, long a1) throws Throwable;
private static native int __fieldRead100122_108() throws Throwable;
private static native int __invokedynamic100122_109(int a0, long a1) throws Throwable;
private static native void __call100122_110(int a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic100122_111(int a0, long a1) throws Throwable;
private static native int __fieldRead100122_112() throws Throwable;
private static native int __fieldRead100122_113() throws Throwable;
private static native void __call100122_114(int a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic100122_115(int a0, long a1) throws Throwable;
private static native int __fieldRead100122_116() throws Throwable;
private static native int __invokedynamic100122_117(int a0, long a1) throws Throwable;
private static native void __call100122_118(int a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic100122_119(int a0, long a1) throws Throwable;
private static native int __fieldRead100122_120() throws Throwable;
private static native int __invokedynamic100122_121(int a0, long a1) throws Throwable;
private static native void __call100122_122(int a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic100122_123(int a0, long a1) throws Throwable;
private static native int __fieldRead100122_124() throws Throwable;
private static native int __invokedynamic100122_125(int a0, long a1) throws Throwable;
private static native void __call100122_126(int a0, int a1, int a2) throws Throwable;
private static native int __fieldRead100122_127() throws Throwable;
private static native void __call100122_128(int a0) throws Throwable;
private static native boolean __call100122_129() throws Throwable;
private static native void __call100122_130(float a0, float a1, float a2, float a3) throws Throwable;
private static native java.lang.Exception __call13012200_0(moom.Oo a0) throws Throwable;

}


protected boolean b(T p0) { return __sourceHandlerCall_91e58ac6eb6068872962(this, p0); }


public void b(T p0, double p1, double p2, double p3) { __sourceHandlerCall_22a722d4fe94ce37a0be(this, p0, p1, p2, p3); }


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8402_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/mS"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


protected float b(T p0, float p1) {
return (((float) ((net.minecraft.entity.EntityLivingBase)(p0)).S) + p1);
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.mS.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public static void b(java.lang.String[] p0) {
A = ((java.lang.String[])(p0));
    return;
}


private static int b(int p0, long p1) {
int n8 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x3DE9;
        if (S[n8] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = R[n8];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])T.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    T.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/mS", exception);
            }
            int n10 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            mS.S[n8] = n10;
        }
        return S[n8];
}


protected void b__sourceReturn_da8c82d5d4() {
moom.kZ.e();
    moom.kZ.g(((int)(net.minecraft.client.renderer.OpenGlHelper.q)));
    moom.kZ.u();
    moom.kZ.g(((int)(net.minecraft.client.renderer.OpenGlHelper.r)));
    moom.kZ.u();
    moom.kZ.g(((int)(net.minecraft.client.renderer.OpenGlHelper.q)));
    return;
}


protected <V extends net.minecraft.entity.EntityLivingBase, U extends net.minecraft.client.renderer.entity.layers.LayerRenderer<V>> boolean b(U p0) {
return (__sourceIntrinsic_booleanComparison((((java.util.List)(this.w)).remove(((java.lang.Object)(p0))))) != 0);
}


protected void c() { __sourceHandlerCall_12f44350dae37c352e6e(this); }


protected float a(float p0, float p1, float p2) {
float local4 = (p1 - p0);
    while ((local4 < -0x1.68p7f)) {
        local4 = (local4 + 0x1.68p8f);
    }
    while ((local4 >= 0x1.68p7f)) {
        local4 = (local4 - 0x1.68p8f);
    }
    return (p0 + (p2 * local4));
}


public java.util.List<net.minecraft.client.renderer.entity.layers.LayerRenderer<T>> a__sourceReturn_3f0615080b() {
return this.w;
}


public void a(boolean p0) {
this.x = ((boolean)(p0));
    return;
}


public <V extends net.minecraft.entity.EntityLivingBase, U extends net.minecraft.client.renderer.entity.layers.LayerRenderer<V>> boolean a(U p0) {
return (__sourceIntrinsic_booleanComparison((((java.util.List)(this.w)).add(((java.lang.Object)(p0))))) != 0);
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public static java.lang.String[] a__ArrayString() {
return moom.mS.A;
}


public moom.iQ a__iQ() {
return this.m;
}


protected void a(T p0, float p1, float p2, float p3, float p4, float p5, float p6, float p7) { __sourceHandlerCall_a6652b79e2172060c244(this, p0, p1, p2, p3, p4, p5, p6, p7); }


protected float a(T p0, float p1) {
return ((net.minecraft.entity.EntityLivingBase)(p0)).b__sourceReturn_f6c4892e39(((float)(p1)));
}


protected void a(T p0, float p1, float p2, float p3) { __sourceHandlerCall_c58b06e95e3eba024676(this, p0, p1, p2, p3); }


protected void a(T p0, double p1, double p2, double p3) {
moom.kZ.b(((float)(((float) p1))), ((float)(((float) p2))), ((float)(((float) p3))));
    return;
}


protected boolean a(T p0, float p1, boolean p2) { return __sourceHandlerCall_0abe1ef43278e9589c80(this, p0, p1, p2); }


protected boolean a__Boolean(T p0, float p1) {
return (__sourceIntrinsic_booleanComparison((((moom.mS)(this)).a(((net.minecraft.entity.EntityLivingBase)(p0)), ((float)(p1)), ((boolean)(true))))) != 0);
}


protected void a(T p0, float p1, float p2, float p3, float p4, float p5, float p6) { __sourceHandlerCall_2bea33db5468f09f6b32(this, p0, p1, p2, p3, p4, p5, p6); }


public void a__Void() {
return;
}


public void a(T p0, double p1, double p2, double p3, float p4, float p5) { __sourceHandlerCall_b047ffbd8c3779cb9c84(this, p0, p1, p2, p3, p4, p5); }


protected void a__Void(T p0, float p1) {
return;
}


protected int a(T p0, float p1, float p2) {
return 0;
}


protected float a__sourceReturn_fe6e998144(T p0) {
return 0x1.68p6f;
}


protected boolean a__Boolean(T p0) {
long life2_3;
    int life4_9;
    moom.Bk life5_16;
    java.lang.String life6_22;
    float life5_50;
    float life6_67;
    float life7_78;
    life2_3 = (moom.mS.N ^ 68121123784458L);
    life4_9 = __sourceIntrinsic_e58d0370ca9e_invokedynamic6866_1(4617, (469821832452146523L ^ life2_3));
    if ((((p0 instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0) != 0)) {
        life5_16 = ((moom.Bk)(((net.minecraft.entity.EntityLivingBase)(p0)).a__Bj()));
        if ((life5_16 != null)) {
        life6_22 = net.minecraft.client.gui.FontRenderer.c(((java.lang.String)(((moom.Bk)(life5_16)).c())));
        if ((((java.lang.String)(life6_22)).length() >= 2)) {
        life4_9 = ((net.minecraft.client.gui.FontRenderer)(((moom.mS)(this)).a__ga())).b(((char)(((java.lang.String)(life6_22)).charAt(((int)(1))))));
    }
    }
    }
    life5_50 = (((float) ((life4_9 >> __sourceIntrinsic_e58d0370ca9e_invokedynamic6866_11(27679, (8465146892256443206L ^ life2_3))) & __sourceIntrinsic_e58d0370ca9e_invokedynamic6866_12(17146, (7238239201091409339L ^ life2_3)))) / 0x1.fep7f);
    life6_67 = (((float) ((life4_9 >> __sourceIntrinsic_e58d0370ca9e_invokedynamic6866_13(12629, (5600668413050594827L ^ life2_3))) & __sourceIntrinsic_e58d0370ca9e_invokedynamic6866_14(12316, (8578866219886290760L ^ life2_3)))) / 0x1.fep7f);
    life7_78 = (((float) (life4_9 & __sourceIntrinsic_e58d0370ca9e_invokedynamic6866_15(12316, (8578866219886290760L ^ life2_3)))) / 0x1.fep7f);
    moom.kZ.f();
    moom.kZ.g(((int)(net.minecraft.client.renderer.OpenGlHelper.q)));
    moom.kZ.c(((float)(life5_50)), ((float)(life6_67)), ((float)(life7_78)), ((float)(0x1.0p0f)));
    moom.kZ.v();
    moom.kZ.g(((int)(net.minecraft.client.renderer.OpenGlHelper.r)));
    moom.kZ.v();
    moom.kZ.g(((int)(net.minecraft.client.renderer.OpenGlHelper.q)));
    return true;
}


private static native <E extends Throwable> int __sourceIntrinsic_e58d0370ca9e_invokedynamic6866_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e58d0370ca9e_invokedynamic6866_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e58d0370ca9e_invokedynamic6866_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e58d0370ca9e_invokedynamic6866_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e58d0370ca9e_invokedynamic6866_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e58d0370ca9e_invokedynamic6866_15(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8402_0() throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
