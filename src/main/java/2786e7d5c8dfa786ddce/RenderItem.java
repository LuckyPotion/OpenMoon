package net.minecraft.client.renderer.entity;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class RenderItem implements net.minecraft.client.resources.IResourceManagerReloadListener {

private static moom.DD a;

private moom.ll b;

private net.minecraft.client.renderer.texture.TextureManager c;

public float d;

public moom.DE e;

public net.minecraft.client.resources.model.ModelManager f;

private boolean g;

private boolean h;

private boolean i;

private boolean j;

private com.moon.module.impl.Glint k;

private static long l;

private static long[] m;

private static java.lang.Integer[] n;

private static java.util.Map o;

private static long[] p;

private static java.lang.Long[] q;

private static java.util.Map r;

public RenderItem(net.minecraft.client.renderer.texture.TextureManager p0, net.minecraft.client.resources.model.ModelManager p1) {
super();
    this.e = null;
    this.f = null;
    this.g = true;
    this.h = false;
    this.i = false;
    this.j = false;
    this.c = p0;
    this.f = p1;
    this.b = new moom.ll(p1);
    (this).a__Void();
}


static {
l = ((long)(((moom._a)(moom._c.a(((long)(-4773518963723764099L)), ((long)(-7910681194357753260L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(96534099844293L)))));
    o = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (net.minecraft.client.renderer.entity.RenderItem.l ^ 70010993849924L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill1176_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1176_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1176_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1176_14 = new byte[8];
    (__sourceSpill1176_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill1176_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation1176_16 = __sourceSpill1176_14;
    ((javax.crypto.Cipher)(__sourceSpill1176_11)).init(((int)(__sourceSpill1176_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1176_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1176_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local19_life19 = new long[36];
    int local16_life20 = 0;
    java.lang.String local17_life21;
    int local18_life23 = ((java.lang.String)((local17_life21 = "­ô!¼K©\005Ã§\n\fôkNª|®®À®¥¸ÓÐssÓlô´HzñL.#\034\033ý3j\031\016r®0]\034È&Ì³X\016w(\036u/!BrïARÉ'W1¸Ú±J^øÇîr\002\003Ø\024ê\037¨\177Ü\0232vO§·B.\035õ\t?é\036-û1=}÷°sþãû\033\t-\\@¸\025V@\035¿£ÍéåÉaØXwoÒÙ¢ke]\003\034f7\b\024*\033!Ýí`x\017hG5'*+\034\003G±-\017+øz©;C¦¶Ë¢\026,+{v\nsVÌhµoÁëh\027­<S<Ö\023blÀ\022ºá2ÒvRóµÍ%ú\004ØôOÍçgo(5âp¶üÂR¼\020¾\016øºg>Ðí!ú"))).length();
    int local15_life24 = 0;
    do {
        java.lang.String __sourceSpill1176_25 = local17_life21;
        int __sourceSpill1176_26 = local15_life24;
        local15_life24 += 8;
        byte[] local20_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1176_25)).substring(((int)(__sourceSpill1176_26)), ((int)(local15_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1176_30 = local19_life19;
        int __sourceSpill1176_31 = local16_life20;
        local16_life20 += 1;
        long local21_life32 = (((((((((((long) (local20_life29)[0]) & 255L) << 56) | ((((long) (local20_life29)[1]) & 255L) << 48)) | ((((long) (local20_life29)[2]) & 255L) << 40)) | ((((long) (local20_life29)[3]) & 255L) << 32)) | ((((long) (local20_life29)[4]) & 255L) << 24)) | ((((long) (local20_life29)[5]) & 255L) << 16)) | ((((long) (local20_life29)[6]) & 255L) << 8)) | (((long) (local20_life29)[7]) & 255L));
        byte[] __sourceSpill1176_33 = new byte[8];
        (__sourceSpill1176_33)[0] = ((byte) ((int) (local21_life32 >>> 56)));
        (__sourceSpill1176_33)[1] = ((byte) ((int) (local21_life32 >>> 48)));
        (__sourceSpill1176_33)[2] = ((byte) ((int) (local21_life32 >>> 40)));
        (__sourceSpill1176_33)[3] = ((byte) ((int) (local21_life32 >>> 32)));
        (__sourceSpill1176_33)[4] = ((byte) ((int) (local21_life32 >>> 24)));
        (__sourceSpill1176_33)[5] = ((byte) ((int) (local21_life32 >>> 16)));
        (__sourceSpill1176_33)[6] = ((byte) ((int) (local21_life32 >>> 8)));
        (__sourceSpill1176_33)[7] = ((byte) ((int) local21_life32));
        javax.crypto.Cipher __sourceSpill1176_34 = local13_life9;
        byte[] local23_life36 = ((javax.crypto.Cipher)(__sourceSpill1176_34)).doFinal(((byte[])(__sourceSpill1176_33)));
        (__sourceSpill1176_30)[__sourceSpill1176_31] = (((((((((((long) (local23_life36)[0]) & 255L) << 56) | ((((long) (local23_life36)[1]) & 255L) << 48)) | ((((long) (local23_life36)[2]) & 255L) << 40)) | ((((long) (local23_life36)[3]) & 255L) << 32)) | ((((long) (local23_life36)[4]) & 255L) << 24)) | ((((long) (local23_life36)[5]) & 255L) << 16)) | ((((long) (local23_life36)[6]) & 255L) << 8)) | (((long) (local23_life36)[7]) & 255L));
    } while ((!(local15_life24 >= local18_life23)));
    local18_life23 = ((java.lang.String)((local17_life21 = "§\\´Å¨êç}æµ°Á¢~"))).length();
    local15_life24 = 0;
    do {
        java.lang.String __sourceSpill1176_38 = local17_life21;
        int __sourceSpill1176_39 = local15_life24;
        local15_life24 += 8;
        byte[] local20_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1176_38)).substring(((int)(__sourceSpill1176_39)), ((int)(local15_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1176_43 = local19_life19;
        int __sourceSpill1176_44 = local16_life20;
        local16_life20 += 1;
        long local21_life45 = (((((((((((long) (local20_life42)[0]) & 255L) << 56) | ((((long) (local20_life42)[1]) & 255L) << 48)) | ((((long) (local20_life42)[2]) & 255L) << 40)) | ((((long) (local20_life42)[3]) & 255L) << 32)) | ((((long) (local20_life42)[4]) & 255L) << 24)) | ((((long) (local20_life42)[5]) & 255L) << 16)) | ((((long) (local20_life42)[6]) & 255L) << 8)) | (((long) (local20_life42)[7]) & 255L));
        byte[] __sourceSpill1176_46 = new byte[8];
        (__sourceSpill1176_46)[0] = ((byte) ((int) (local21_life45 >>> 56)));
        (__sourceSpill1176_46)[1] = ((byte) ((int) (local21_life45 >>> 48)));
        (__sourceSpill1176_46)[2] = ((byte) ((int) (local21_life45 >>> 40)));
        (__sourceSpill1176_46)[3] = ((byte) ((int) (local21_life45 >>> 32)));
        (__sourceSpill1176_46)[4] = ((byte) ((int) (local21_life45 >>> 24)));
        (__sourceSpill1176_46)[5] = ((byte) ((int) (local21_life45 >>> 16)));
        (__sourceSpill1176_46)[6] = ((byte) ((int) (local21_life45 >>> 8)));
        (__sourceSpill1176_46)[7] = ((byte) ((int) local21_life45));
        javax.crypto.Cipher __sourceSpill1176_47 = local13_life9;
        byte[] local23_life49 = ((javax.crypto.Cipher)(__sourceSpill1176_47)).doFinal(((byte[])(__sourceSpill1176_46)));
        (__sourceSpill1176_43)[__sourceSpill1176_44] = (((((((((((long) (local23_life49)[0]) & 255L) << 56) | ((((long) (local23_life49)[1]) & 255L) << 48)) | ((((long) (local23_life49)[2]) & 255L) << 40)) | ((((long) (local23_life49)[3]) & 255L) << 32)) | ((((long) (local23_life49)[4]) & 255L) << 24)) | ((((long) (local23_life49)[5]) & 255L) << 16)) | ((((long) (local23_life49)[6]) & 255L) << 8)) | (((long) (local23_life49)[7]) & 255L));
    } while ((!(local15_life24 >= local18_life23)));
    m = ((long[])(local19_life19));
    n = ((java.lang.Integer[])(new java.lang.Integer[36]));
    r = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life54;
    javax.crypto.Cipher __sourceSpill1176_56 = (local0_life54 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1176_57 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1176_58 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1176_59 = new byte[8];
    (__sourceSpill1176_59)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life60 = 1;
    while ((local1_life60 < 8)) {
        (__sourceSpill1176_59)[local1_life60] = ((byte) ((int) ((local11_life7 << (local1_life60 * 8)) >>> 56)));
        local1_life60 += 1;
    }
    byte[] __sourcePreallocation1176_61 = __sourceSpill1176_59;
    ((javax.crypto.Cipher)(__sourceSpill1176_56)).init(((int)(__sourceSpill1176_57)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1176_58)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1176_61)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life64 = new long[2];
    int local3_life65 = 0;
    java.lang.String local4_life66;
    int local5_life68 = ((java.lang.String)((local4_life66 = "/À\177³\001@¹\021âÏ$"))).length();
    int local2_life69 = 0;
    do {
        java.lang.String __sourceSpill1176_70 = local4_life66;
        int __sourceSpill1176_71 = local2_life69;
        local2_life69 += 8;
        byte[] local7_life74 = ((java.lang.String)(((java.lang.String)(__sourceSpill1176_70)).substring(((int)(__sourceSpill1176_71)), ((int)(local2_life69))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1176_75 = local6_life64;
        int __sourceSpill1176_76 = local3_life65;
        local3_life65 += 1;
        long local8_life77 = (((((((((((long) (local7_life74)[0]) & 255L) << 56) | ((((long) (local7_life74)[1]) & 255L) << 48)) | ((((long) (local7_life74)[2]) & 255L) << 40)) | ((((long) (local7_life74)[3]) & 255L) << 32)) | ((((long) (local7_life74)[4]) & 255L) << 24)) | ((((long) (local7_life74)[5]) & 255L) << 16)) | ((((long) (local7_life74)[6]) & 255L) << 8)) | (((long) (local7_life74)[7]) & 255L));
        byte[] __sourceSpill1176_78 = new byte[8];
        (__sourceSpill1176_78)[0] = ((byte) ((int) (local8_life77 >>> 56)));
        (__sourceSpill1176_78)[1] = ((byte) ((int) (local8_life77 >>> 48)));
        (__sourceSpill1176_78)[2] = ((byte) ((int) (local8_life77 >>> 40)));
        (__sourceSpill1176_78)[3] = ((byte) ((int) (local8_life77 >>> 32)));
        (__sourceSpill1176_78)[4] = ((byte) ((int) (local8_life77 >>> 24)));
        (__sourceSpill1176_78)[5] = ((byte) ((int) (local8_life77 >>> 16)));
        (__sourceSpill1176_78)[6] = ((byte) ((int) (local8_life77 >>> 8)));
        (__sourceSpill1176_78)[7] = ((byte) ((int) local8_life77));
        javax.crypto.Cipher __sourceSpill1176_79 = local0_life54;
        byte[] local10_life81 = ((javax.crypto.Cipher)(__sourceSpill1176_79)).doFinal(((byte[])(__sourceSpill1176_78)));
        (__sourceSpill1176_75)[__sourceSpill1176_76] = (((((((((((long) (local10_life81)[0]) & 255L) << 56) | ((((long) (local10_life81)[1]) & 255L) << 48)) | ((((long) (local10_life81)[2]) & 255L) << 40)) | ((((long) (local10_life81)[3]) & 255L) << 32)) | ((((long) (local10_life81)[4]) & 255L) << 24)) | ((((long) (local10_life81)[5]) & 255L) << 16)) | ((((long) (local10_life81)[6]) & 255L) << 8)) | (((long) (local10_life81)[7]) & 255L));
    } while ((!(local2_life69 >= local5_life68)));
    p = ((long[])(local6_life64));
    q = ((java.lang.Long[])(new java.lang.Long[2]));
    a = ((moom.DD)(new moom.DD("textures/misc/enchanted_item_glint.png")));
}

private static native <E extends Throwable> void __sourceHandlerCall_ecaec38ab040697fa6a7(net.minecraft.client.renderer.entity.RenderItem a0, float a1, float a2, boolean a3) throws E;
private static final class __SourceHandler_ecaec38ab040697fa6a7 {

public static void f2557(net.minecraft.client.renderer.entity.RenderItem receiver, float p0, float p1, boolean p2) throws Throwable {
    __call2557_1(p0, p1, (0x1.9p6f + __fieldRead2557_0(receiver)));
    __call2557_2(0x1.0p3f, 0x1.0p3f, 0x0.0p0f);
    __call2557_3(0x1.0p0f, 0x1.0p0f, -0x1.0p0f);
    __call2557_4(0x1.0p-1f, 0x1.0p-1f, 0x1.0p-1f);
    if (p2) {
        __call2557_5(0x1.4p5f, 0x1.4p5f, 0x1.4p5f);
        __call2557_6(0x1.a4p7f, 0x1.0p0f, 0x0.0p0f, 0x0.0p0f);
        __call2557_7(-0x1.0ep7f, 0x0.0p0f, 0x1.0p0f, 0x0.0p0f);
        __call2557_8();
    } else {
        __call2557_9(0x1.0p6f, 0x1.0p6f, 0x1.0p6f);
        __call2557_10(0x1.68p7f, 0x1.0p0f, 0x0.0p0f, 0x0.0p0f);
        __call2557_11();
    }
    return;
}
public static void h2557_0(moom.Oo p0) throws Throwable {
    throw __call1255700_0(p0);
}
private static native float __fieldRead2557_0(net.minecraft.client.renderer.entity.RenderItem a0) throws Throwable;
private static native void __call2557_1(float a0, float a1, float a2) throws Throwable;
private static native void __call2557_2(float a0, float a1, float a2) throws Throwable;
private static native void __call2557_3(float a0, float a1, float a2) throws Throwable;
private static native void __call2557_4(float a0, float a1, float a2) throws Throwable;
private static native void __call2557_5(float a0, float a1, float a2) throws Throwable;
private static native void __call2557_6(float a0, float a1, float a2, float a3) throws Throwable;
private static native void __call2557_7(float a0, float a1, float a2, float a3) throws Throwable;
private static native void __call2557_8() throws Throwable;
private static native void __call2557_9(float a0, float a1, float a2) throws Throwable;
private static native void __call2557_10(float a0, float a1, float a2, float a3) throws Throwable;
private static native void __call2557_11() throws Throwable;
private static native java.lang.Throwable __call1255700_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_355086170ddc0c54577c(net.minecraft.client.renderer.entity.RenderItem a0, moom.lV a1) throws E;
private static final class __SourceHandler_355086170ddc0c54577c {

public static boolean f610(net.minecraft.client.renderer.entity.RenderItem receiver, moom.lV p0) throws Throwable {
    int forestValue610_9_0;
    int forestValue610_17_0;
    int forestValue610_18_0;
    int forestValue610_18_1;
    int forestValue610_27_0;
    int forestValue610_28_0;
    int forestValue610_28_1;
    int spill610_0;
    forest_join_28: {
    forest_join_27: {
    forest_join_18: {
    forest_join_17: {
    forest_join_9: {
    forest_join_8: {
    if (!((__numericCompare610_2(__fieldRead610_1(__fieldRead610_0(p0)), 0x0.0p0f) < 0))) {
        break forest_join_8;
    }
    forestValue610_9_0 = 1;
    break forest_join_9;
    }
    forestValue610_9_0 = 0;
    }
    if (!((__numericCompare610_5(__fieldRead610_4(__fieldRead610_3(p0)), 0x0.0p0f) < 0))) {
        forestValue610_17_0 = forestValue610_9_0;
        break forest_join_17;
    }
    forestValue610_18_0 = forestValue610_9_0;
    forestValue610_18_1 = 1;
    break forest_join_18;
    }
    forestValue610_18_0 = forestValue610_17_0;
    forestValue610_18_1 = 0;
    }
    spill610_0 = (forestValue610_18_0 ^ forestValue610_18_1);
    if (!((__numericCompare610_8(__fieldRead610_7(__fieldRead610_6(p0)), 0x0.0p0f) < 0))) {
        forestValue610_27_0 = spill610_0;
        break forest_join_27;
    }
    forestValue610_28_0 = spill610_0;
    forestValue610_28_1 = 1;
    break forest_join_28;
    }
    forestValue610_28_0 = forestValue610_27_0;
    forestValue610_28_1 = 0;
    }
    return __integerCategory610_9((forestValue610_28_0 ^ forestValue610_28_1));
}
public static boolean h610_0(moom.Oo p0) throws Throwable {
    throw __call3061000_0(p0);
}
public static boolean h610_1(moom.Oo p0) throws Throwable {
    throw __call3061001_0(p0);
}
public static boolean h610_2(moom.Oo p0) throws Throwable {
    throw __call3061002_0(p0);
}
private static native org.lwjgl.util.vector.Vector3f __fieldRead610_0(moom.lV a0) throws Throwable;
private static native float __fieldRead610_1(org.lwjgl.util.vector.Vector3f a0) throws Throwable;
private static native int __numericCompare610_2(float a0, float a1) throws Throwable;
private static native org.lwjgl.util.vector.Vector3f __fieldRead610_3(moom.lV a0) throws Throwable;
private static native float __fieldRead610_4(org.lwjgl.util.vector.Vector3f a0) throws Throwable;
private static native int __numericCompare610_5(float a0, float a1) throws Throwable;
private static native org.lwjgl.util.vector.Vector3f __fieldRead610_6(moom.lV a0) throws Throwable;
private static native float __fieldRead610_7(org.lwjgl.util.vector.Vector3f a0) throws Throwable;
private static native int __numericCompare610_8(float a0, float a1) throws Throwable;
private static native boolean __integerCategory610_9(int value) throws Throwable;
private static native java.lang.Throwable __call3061000_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3061001_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3061002_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_c851d9164abbb8e270f0(net.minecraft.client.renderer.entity.RenderItem a0, moom.lw a1, java.util.List a2, int a3, net.minecraft.item.ItemStack a4) throws E;
private static final class __SourceHandler_c851d9164abbb8e270f0 {

public static void f1407(net.minecraft.client.renderer.entity.RenderItem receiver, moom.lw p0, java.util.List p1, int p2, net.minecraft.item.ItemStack p3) throws Throwable {
    int lexicalValue1407_18_0;
    long life5_3;
    int life7_7;
    int life8_26;
    int life9_28;
    int life10_31;
    moom.lC life11_39;
    int life12_41;
    int life12_56;
    lexical_join_74: {
    lexical_join_18: {
    lexical_join_17: {
    life5_3 = (__fieldRead1407_0() ^ 41806386085783L);
    life7_7 = __integerCategory1407_4(__call1407_3(__call1407_2(__call1407_1())));
    if (!((p2 == -1))) {
        break lexical_join_17;
    }
    if (!((p3 != null))) {
        break lexical_join_17;
    }
    if (!((life7_7 == 0))) {
        break lexical_join_17;
    }
    lexicalValue1407_18_0 = 1;
    break lexical_join_18;
    }
    lexicalValue1407_18_0 = 0;
    }
    life8_26 = lexicalValue1407_18_0;
    life9_28 = 0;
    life10_31 = __call1407_5(p1);
    lexical_cycle_24: while (true) {
    lexical_join_67: {
    lexical_join_59: {
    lexical_join_54: {
    if (!((life9_28 < life10_31))) {
        break lexical_join_74;
    }
    life11_39 = __cast1407_7(__call1407_6(p1, life9_28));
    life12_41 = p2;
    if (!((life8_26 != 0))) {
        break lexical_join_67;
    }
    if (!(__call1407_8(life11_39))) {
        break lexical_join_67;
    }
    life12_56 = __call1407_11(__call1407_9(p3), p3, __call1407_10(life11_39));
    if (!(__call1407_12())) {
        break lexical_join_54;
    }
    life12_56 = __call1407_14(p3, __call1407_13(life11_39), life12_56);
    }
    if (!(__fieldRead1407_15())) {
        break lexical_join_59;
    }
    life12_56 = __call1407_16(life12_56);
    }
    life12_41 = (life12_56 | __invokedynamic1407_17(21759, (3213137945481136821L ^ life5_3)));
    }
    __call1407_18(receiver, p0, life11_39, life12_41);
    life9_28 += 1;
    continue lexical_cycle_24;
    }
    }
    return;
}
public static void h1407_0(moom.Oo p0) throws Throwable {
    throw __call1140700_0(p0);
}
public static void h1407_1(moom.Oo p0) throws Throwable {
    throw __call1140701_0(p0);
}
public static void h1407_2(moom.Oo p0) throws Throwable {
    throw __call1140702_0(p0);
}
public static void h1407_3(moom.Oo p0) throws Throwable {
    throw __call1140703_0(p0);
}
private static native long __fieldRead1407_0() throws Throwable;
private static native net.minecraft.client.Minecraft __call1407_1() throws Throwable;
private static native net.minecraft.client.renderer.entity.RenderManager __call1407_2(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __call1407_3(net.minecraft.client.renderer.entity.RenderManager a0) throws Throwable;
private static native int __integerCategory1407_4(boolean value) throws Throwable;
private static native int __call1407_5(java.util.List a0) throws Throwable;
private static native java.lang.Object __call1407_6(java.util.List a0, int a1) throws Throwable;
private static native moom.lC __cast1407_7(java.lang.Object a0) throws Throwable;
private static native boolean __call1407_8(moom.lC a0) throws Throwable;
private static native net.minecraft.item.Item __call1407_9(net.minecraft.item.ItemStack a0) throws Throwable;
private static native int __call1407_10(moom.lC a0) throws Throwable;
private static native int __call1407_11(net.minecraft.item.Item a0, net.minecraft.item.ItemStack a1, int a2) throws Throwable;
private static native boolean __call1407_12() throws Throwable;
private static native int __call1407_13(moom.lC a0) throws Throwable;
private static native int __call1407_14(net.minecraft.item.ItemStack a0, int a1, int a2) throws Throwable;
private static native boolean __fieldRead1407_15() throws Throwable;
private static native int __call1407_16(int a0) throws Throwable;
private static native int __invokedynamic1407_17(int a0, long a1) throws Throwable;
private static native void __call1407_18(net.minecraft.client.renderer.entity.RenderItem a0, moom.lw a1, moom.lC a2, int a3) throws Throwable;
private static native java.lang.Throwable __call1140700_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1140701_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1140702_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1140703_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_de235361a69aab351071(net.minecraft.client.renderer.entity.RenderItem a0, net.minecraft.client.gui.FontRenderer a1, net.minecraft.item.ItemStack a2, float a3, float a4, java.lang.String a5) throws E;
private static final class __SourceHandler_de235361a69aab351071 {

public static void f1408(net.minecraft.client.renderer.entity.RenderItem receiver, net.minecraft.client.gui.FontRenderer p0, net.minecraft.item.ItemStack p1, float p2, float p3, java.lang.String p4) throws Throwable {
    java.lang.String forwardValue1408_19_0;
    long life6_3;
    java.lang.String life8_30;
    int life8_92;
    int life9_106;
    net.minecraft.client.renderer.Tessellator life10_113;
    moom.lw life11_116;
    int life12_182;
    int life13_184;
    int life14_186;
    int life15_191;
    forward_join_240: {
    forward_join_216: {
    forward_join_62: {
    forward_join_32: {
    forward_join_19: {
    forward_join_18: {
    forward_join_12: {
    life6_3 = (__fieldRead1408_0() ^ 112277362379089L);
    if (!((p1 != null))) {
        break forward_join_240;
    }
    if (!((__fieldRead1408_1(p1) == 1))) {
        break forward_join_12;
    }
    if (!((p4 != null))) {
        break forward_join_62;
    }
    }
    if (!((p4 == null))) {
        break forward_join_18;
    }
    forwardValue1408_19_0 = __call1408_3(__fieldRead1408_2(p1));
    break forward_join_19;
    }
    forwardValue1408_19_0 = p4;
    }
    life8_30 = forwardValue1408_19_0;
    if (!((p4 == null))) {
        break forward_join_32;
    }
    if (!((__fieldRead1408_4(p1) < 1))) {
        break forward_join_32;
    }
    life8_30 = __invokedynamic1408_8(__fieldRead1408_5(), __call1408_7(__fieldRead1408_6(p1)));
    }
    __call1408_9();
    __call1408_10();
    __call1408_11();
    __call1408_14(p0, life8_30, (((p2 + 0x1.3p4f) - 0x1.0p1f) - ((float) __call1408_12(p0, life8_30))), ((p3 + 0x1.8p2f) + 0x1.8p1f), __invokedynamic1408_13(3169, (4273152099359368417L ^ life6_3)));
    __call1408_15();
    __call1408_16();
    __call1408_17();
    }
    if (!(__call1408_18(p1))) {
        break forward_join_240;
    }
    life8_92 = ((int) __call1408_21((0x1.ap3d - ((((double) __call1408_19(p1)) * 0x1.ap3d) / ((double) __call1408_20(p1))))));
    life9_106 = ((int) __call1408_24((0x1.fep7d - ((((double) __call1408_22(p1)) * 0x1.fep7d) / ((double) __call1408_23(p1))))));
    __call1408_25();
    __call1408_26();
    __call1408_27();
    __call1408_28();
    __call1408_29();
    life10_113 = __call1408_30();
    life11_116 = __call1408_31(life10_113);
    __call1408_34(receiver, life11_116, (p2 + 0x1.0p1f), (p3 + 0x1.ap3f), __invokedynamic1408_32(6362, (1798535515449602128L ^ life6_3)), 2, 0, 0, 0, __invokedynamic1408_33(18052, (3997775578110848522L ^ life6_3)));
    __call1408_39(receiver, life11_116, (p2 + 0x1.0p1f), (p3 + 0x1.ap3f), __invokedynamic1408_35(20245, (2905628429752690584L ^ life6_3)), 1, ((__invokedynamic1408_36(18052, (3997775578110848522L ^ life6_3)) - life9_106) / 4), __invokedynamic1408_37(17530, (1832920593557220566L ^ life6_3)), 0, __invokedynamic1408_38(18052, (3997775578110848522L ^ life6_3)));
    life12_182 = (__invokedynamic1408_40(18052, (3997775578110848522L ^ life6_3)) - life9_106);
    life13_184 = life9_106;
    life14_186 = 0;
    if (!(__call1408_41())) {
        break forward_join_216;
    }
    life15_191 = __call1408_42(life9_106);
    if (!((life15_191 >= 0))) {
        break forward_join_216;
    }
    life12_182 = ((life15_191 >> __invokedynamic1408_43(22797, (5239208953847607711L ^ life6_3))) & __invokedynamic1408_44(18052, (3997775578110848522L ^ life6_3)));
    life13_184 = ((life15_191 >> __invokedynamic1408_45(14003, (7657779603527048742L ^ life6_3))) & __invokedynamic1408_46(18052, (3997775578110848522L ^ life6_3)));
    life14_186 = (life15_191 & __invokedynamic1408_47(18052, (3997775578110848522L ^ life6_3)));
    }
    __call1408_49(receiver, life11_116, (p2 + 0x1.0p1f), (p3 + 0x1.ap3f), life8_92, 1, life12_182, life13_184, life14_186, __invokedynamic1408_48(18052, (3997775578110848522L ^ life6_3)));
    __call1408_50();
    __call1408_51();
    __call1408_52();
    __call1408_53();
    __call1408_54();
    }
    return;
}
public static void h1408_0(moom.Oo p0) throws Throwable {
    throw __call1140800_0(p0);
}
public static void h1408_1(moom.Oo p0) throws Throwable {
    throw __call1140801_0(p0);
}
public static void h1408_2(moom.Oo p0) throws Throwable {
    throw __call1140802_0(p0);
}
public static void h1408_3(moom.Oo p0) throws Throwable {
    throw __call1140803_0(p0);
}
public static void h1408_4(moom.Oo p0) throws Throwable {
    throw __call1140804_0(p0);
}
private static native long __fieldRead1408_0() throws Throwable;
private static native int __fieldRead1408_1(net.minecraft.item.ItemStack a0) throws Throwable;
private static native int __fieldRead1408_2(net.minecraft.item.ItemStack a0) throws Throwable;
private static native java.lang.String __call1408_3(int a0) throws Throwable;
private static native int __fieldRead1408_4(net.minecraft.item.ItemStack a0) throws Throwable;
private static native net.minecraft.util.EnumChatFormatting __fieldRead1408_5() throws Throwable;
private static native int __fieldRead1408_6(net.minecraft.item.ItemStack a0) throws Throwable;
private static native java.lang.String __call1408_7(int a0) throws Throwable;
private static native java.lang.String __invokedynamic1408_8(net.minecraft.util.EnumChatFormatting a0, java.lang.String a1) throws Throwable;
private static native void __call1408_9() throws Throwable;
private static native void __call1408_10() throws Throwable;
private static native void __call1408_11() throws Throwable;
private static native int __call1408_12(net.minecraft.client.gui.FontRenderer a0, java.lang.String a1) throws Throwable;
private static native int __invokedynamic1408_13(int a0, long a1) throws Throwable;
private static native int __call1408_14(net.minecraft.client.gui.FontRenderer a0, java.lang.String a1, float a2, float a3, int a4) throws Throwable;
private static native void __call1408_15() throws Throwable;
private static native void __call1408_16() throws Throwable;
private static native void __call1408_17() throws Throwable;
private static native boolean __call1408_18(net.minecraft.item.ItemStack a0) throws Throwable;
private static native int __call1408_19(net.minecraft.item.ItemStack a0) throws Throwable;
private static native int __call1408_20(net.minecraft.item.ItemStack a0) throws Throwable;
private static native long __call1408_21(double a0) throws Throwable;
private static native int __call1408_22(net.minecraft.item.ItemStack a0) throws Throwable;
private static native int __call1408_23(net.minecraft.item.ItemStack a0) throws Throwable;
private static native long __call1408_24(double a0) throws Throwable;
private static native void __call1408_25() throws Throwable;
private static native void __call1408_26() throws Throwable;
private static native void __call1408_27() throws Throwable;
private static native void __call1408_28() throws Throwable;
private static native void __call1408_29() throws Throwable;
private static native net.minecraft.client.renderer.Tessellator __call1408_30() throws Throwable;
private static native moom.lw __call1408_31(net.minecraft.client.renderer.Tessellator a0) throws Throwable;
private static native int __invokedynamic1408_32(int a0, long a1) throws Throwable;
private static native int __invokedynamic1408_33(int a0, long a1) throws Throwable;
private static native void __call1408_34(net.minecraft.client.renderer.entity.RenderItem a0, moom.lw a1, float a2, float a3, int a4, int a5, int a6, int a7, int a8, int a9) throws Throwable;
private static native int __invokedynamic1408_35(int a0, long a1) throws Throwable;
private static native int __invokedynamic1408_36(int a0, long a1) throws Throwable;
private static native int __invokedynamic1408_37(int a0, long a1) throws Throwable;
private static native int __invokedynamic1408_38(int a0, long a1) throws Throwable;
private static native void __call1408_39(net.minecraft.client.renderer.entity.RenderItem a0, moom.lw a1, float a2, float a3, int a4, int a5, int a6, int a7, int a8, int a9) throws Throwable;
private static native int __invokedynamic1408_40(int a0, long a1) throws Throwable;
private static native boolean __call1408_41() throws Throwable;
private static native int __call1408_42(int a0) throws Throwable;
private static native int __invokedynamic1408_43(int a0, long a1) throws Throwable;
private static native int __invokedynamic1408_44(int a0, long a1) throws Throwable;
private static native int __invokedynamic1408_45(int a0, long a1) throws Throwable;
private static native int __invokedynamic1408_46(int a0, long a1) throws Throwable;
private static native int __invokedynamic1408_47(int a0, long a1) throws Throwable;
private static native int __invokedynamic1408_48(int a0, long a1) throws Throwable;
private static native void __call1408_49(net.minecraft.client.renderer.entity.RenderItem a0, moom.lw a1, float a2, float a3, int a4, int a5, int a6, int a7, int a8, int a9) throws Throwable;
private static native void __call1408_50() throws Throwable;
private static native void __call1408_51() throws Throwable;
private static native void __call1408_52() throws Throwable;
private static native void __call1408_53() throws Throwable;
private static native void __call1408_54() throws Throwable;
private static native java.lang.Throwable __call1140800_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1140801_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1140802_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1140803_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1140804_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_66ef387402eb29ac6e5e(net.minecraft.client.renderer.entity.RenderItem a0, net.minecraft.client.gui.FontRenderer a1, net.minecraft.item.ItemStack a2, int a3, int a4, java.lang.String a5) throws E;
private static final class __SourceHandler_66ef387402eb29ac6e5e {

public static void f1409(net.minecraft.client.renderer.entity.RenderItem receiver, net.minecraft.client.gui.FontRenderer p0, net.minecraft.item.ItemStack p1, int p2, int p3, java.lang.String p4) throws Throwable {
    java.lang.String forwardValue1409_19_0;
    long life6_3;
    java.lang.String life8_30;
    int life8_101;
    int life9_115;
    net.minecraft.client.renderer.Tessellator life10_122;
    moom.lw life11_125;
    int life12_199;
    int life13_201;
    int life14_203;
    int life15_208;
    forward_join_261: {
    forward_join_233: {
    forward_join_71: {
    forward_join_32: {
    forward_join_19: {
    forward_join_18: {
    forward_join_12: {
    life6_3 = (__fieldRead1409_0() ^ 996874878151L);
    if (!((p1 != null))) {
        break forward_join_261;
    }
    if (!((__fieldRead1409_1(p1) == 1))) {
        break forward_join_12;
    }
    if (!((p4 != null))) {
        break forward_join_71;
    }
    }
    if (!((p4 == null))) {
        break forward_join_18;
    }
    forwardValue1409_19_0 = __call1409_3(__fieldRead1409_2(p1));
    break forward_join_19;
    }
    forwardValue1409_19_0 = p4;
    }
    life8_30 = forwardValue1409_19_0;
    if (!((p4 == null))) {
        break forward_join_32;
    }
    if (!((__fieldRead1409_4(p1) < 1))) {
        break forward_join_32;
    }
    life8_30 = __invokedynamic1409_8(__fieldRead1409_5(), __call1409_7(__fieldRead1409_6(p1)));
    }
    __call1409_9();
    __call1409_10();
    __call1409_11();
    __call1409_16(p0, life8_30, ((float) (((p2 + __invokedynamic1409_12(9715, (4157982699442239722L ^ life6_3))) - 2) - __call1409_13(p0, life8_30))), ((float) ((p3 + __invokedynamic1409_14(23155, (4299850729503000445L ^ life6_3))) + 3)), __invokedynamic1409_15(24231, (7359670979173909413L ^ life6_3)));
    __call1409_17();
    __call1409_18();
    __call1409_19();
    }
    if (!(__call1409_20(p1))) {
        break forward_join_261;
    }
    life8_101 = ((int) __call1409_23((0x1.ap3d - ((((double) __call1409_21(p1)) * 0x1.ap3d) / ((double) __call1409_22(p1))))));
    life9_115 = ((int) __call1409_26((0x1.fep7d - ((((double) __call1409_24(p1)) * 0x1.fep7d) / ((double) __call1409_25(p1))))));
    __call1409_27();
    __call1409_28();
    __call1409_29();
    __call1409_30();
    __call1409_31();
    life10_122 = __call1409_32();
    life11_125 = __call1409_33(life10_122);
    __call1409_37(receiver, life11_125, (p2 + 2), (p3 + __invokedynamic1409_34(9363, (1462779329065613700L ^ life6_3))), __invokedynamic1409_35(9363, (1462779329065613700L ^ life6_3)), 2, 0, 0, 0, __invokedynamic1409_36(18052, (3997671723755707292L ^ life6_3)));
    __call1409_43(receiver, life11_125, (p2 + 2), (p3 + __invokedynamic1409_38(9363, (1462779329065613700L ^ life6_3))), __invokedynamic1409_39(32077, (8854802607816745037L ^ life6_3)), 1, ((__invokedynamic1409_40(18052, (3997671723755707292L ^ life6_3)) - life9_115) / 4), __invokedynamic1409_41(8958, (7882580253276110827L ^ life6_3)), 0, __invokedynamic1409_42(18052, (3997671723755707292L ^ life6_3)));
    life12_199 = (__invokedynamic1409_44(18052, (3997671723755707292L ^ life6_3)) - life9_115);
    life13_201 = life9_115;
    life14_203 = 0;
    if (!(__call1409_45())) {
        break forward_join_233;
    }
    life15_208 = __call1409_46(life9_115);
    if (!((life15_208 >= 0))) {
        break forward_join_233;
    }
    life12_199 = ((life15_208 >> __invokedynamic1409_47(22797, (5239109398553658377L ^ life6_3))) & __invokedynamic1409_48(18052, (3997671723755707292L ^ life6_3)));
    life13_201 = ((life15_208 >> __invokedynamic1409_49(14003, (7657670844182981552L ^ life6_3))) & __invokedynamic1409_50(18052, (3997671723755707292L ^ life6_3)));
    life14_203 = (life15_208 & __invokedynamic1409_51(18052, (3997671723755707292L ^ life6_3)));
    }
    __call1409_54(receiver, life11_125, (p2 + 2), (p3 + __invokedynamic1409_52(9363, (1462779329065613700L ^ life6_3))), life8_101, 1, life12_199, life13_201, life14_203, __invokedynamic1409_53(18052, (3997671723755707292L ^ life6_3)));
    __call1409_55();
    __call1409_56();
    __call1409_57();
    __call1409_58();
    __call1409_59();
    }
    return;
}
public static void h1409_0(moom.Oo p0) throws Throwable {
    throw __call1140900_0(p0);
}
public static void h1409_1(moom.Oo p0) throws Throwable {
    throw __call1140901_0(p0);
}
public static void h1409_2(moom.Oo p0) throws Throwable {
    throw __call1140902_0(p0);
}
public static void h1409_3(moom.Oo p0) throws Throwable {
    throw __call1140903_0(p0);
}
public static void h1409_4(moom.Oo p0) throws Throwable {
    throw __call1140904_0(p0);
}
private static native long __fieldRead1409_0() throws Throwable;
private static native int __fieldRead1409_1(net.minecraft.item.ItemStack a0) throws Throwable;
private static native int __fieldRead1409_2(net.minecraft.item.ItemStack a0) throws Throwable;
private static native java.lang.String __call1409_3(int a0) throws Throwable;
private static native int __fieldRead1409_4(net.minecraft.item.ItemStack a0) throws Throwable;
private static native net.minecraft.util.EnumChatFormatting __fieldRead1409_5() throws Throwable;
private static native int __fieldRead1409_6(net.minecraft.item.ItemStack a0) throws Throwable;
private static native java.lang.String __call1409_7(int a0) throws Throwable;
private static native java.lang.String __invokedynamic1409_8(net.minecraft.util.EnumChatFormatting a0, java.lang.String a1) throws Throwable;
private static native void __call1409_9() throws Throwable;
private static native void __call1409_10() throws Throwable;
private static native void __call1409_11() throws Throwable;
private static native int __invokedynamic1409_12(int a0, long a1) throws Throwable;
private static native int __call1409_13(net.minecraft.client.gui.FontRenderer a0, java.lang.String a1) throws Throwable;
private static native int __invokedynamic1409_14(int a0, long a1) throws Throwable;
private static native int __invokedynamic1409_15(int a0, long a1) throws Throwable;
private static native int __call1409_16(net.minecraft.client.gui.FontRenderer a0, java.lang.String a1, float a2, float a3, int a4) throws Throwable;
private static native void __call1409_17() throws Throwable;
private static native void __call1409_18() throws Throwable;
private static native void __call1409_19() throws Throwable;
private static native boolean __call1409_20(net.minecraft.item.ItemStack a0) throws Throwable;
private static native int __call1409_21(net.minecraft.item.ItemStack a0) throws Throwable;
private static native int __call1409_22(net.minecraft.item.ItemStack a0) throws Throwable;
private static native long __call1409_23(double a0) throws Throwable;
private static native int __call1409_24(net.minecraft.item.ItemStack a0) throws Throwable;
private static native int __call1409_25(net.minecraft.item.ItemStack a0) throws Throwable;
private static native long __call1409_26(double a0) throws Throwable;
private static native void __call1409_27() throws Throwable;
private static native void __call1409_28() throws Throwable;
private static native void __call1409_29() throws Throwable;
private static native void __call1409_30() throws Throwable;
private static native void __call1409_31() throws Throwable;
private static native net.minecraft.client.renderer.Tessellator __call1409_32() throws Throwable;
private static native moom.lw __call1409_33(net.minecraft.client.renderer.Tessellator a0) throws Throwable;
private static native int __invokedynamic1409_34(int a0, long a1) throws Throwable;
private static native int __invokedynamic1409_35(int a0, long a1) throws Throwable;
private static native int __invokedynamic1409_36(int a0, long a1) throws Throwable;
private static native void __call1409_37(net.minecraft.client.renderer.entity.RenderItem a0, moom.lw a1, int a2, int a3, int a4, int a5, int a6, int a7, int a8, int a9) throws Throwable;
private static native int __invokedynamic1409_38(int a0, long a1) throws Throwable;
private static native int __invokedynamic1409_39(int a0, long a1) throws Throwable;
private static native int __invokedynamic1409_40(int a0, long a1) throws Throwable;
private static native int __invokedynamic1409_41(int a0, long a1) throws Throwable;
private static native int __invokedynamic1409_42(int a0, long a1) throws Throwable;
private static native void __call1409_43(net.minecraft.client.renderer.entity.RenderItem a0, moom.lw a1, int a2, int a3, int a4, int a5, int a6, int a7, int a8, int a9) throws Throwable;
private static native int __invokedynamic1409_44(int a0, long a1) throws Throwable;
private static native boolean __call1409_45() throws Throwable;
private static native int __call1409_46(int a0) throws Throwable;
private static native int __invokedynamic1409_47(int a0, long a1) throws Throwable;
private static native int __invokedynamic1409_48(int a0, long a1) throws Throwable;
private static native int __invokedynamic1409_49(int a0, long a1) throws Throwable;
private static native int __invokedynamic1409_50(int a0, long a1) throws Throwable;
private static native int __invokedynamic1409_51(int a0, long a1) throws Throwable;
private static native int __invokedynamic1409_52(int a0, long a1) throws Throwable;
private static native int __invokedynamic1409_53(int a0, long a1) throws Throwable;
private static native void __call1409_54(net.minecraft.client.renderer.entity.RenderItem a0, moom.lw a1, int a2, int a3, int a4, int a5, int a6, int a7, int a8, int a9) throws Throwable;
private static native void __call1409_55() throws Throwable;
private static native void __call1409_56() throws Throwable;
private static native void __call1409_57() throws Throwable;
private static native void __call1409_58() throws Throwable;
private static native void __call1409_59() throws Throwable;
private static native java.lang.Throwable __call1140900_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1140901_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1140902_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1140903_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1140904_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_795310c629e787cb2ac7(net.minecraft.client.renderer.entity.RenderItem a0, net.minecraft.client.resources.model.IBakedModel a1) throws E;
private static final class __SourceHandler_795310c629e787cb2ac7 {

public static void f1410(net.minecraft.client.renderer.entity.RenderItem receiver, net.minecraft.client.resources.model.IBakedModel p0) throws Throwable {
    int forwardValue1410_66_0;
    int spill1410_0;
    int spill1410_1;
    long spill1410_2;
    int spill1410_3;
    long life2_3;
    int life4_89;
    float life5_125;
    float life6_157;
    forward_join_180: {
    forward_join_73: {
    forward_join_66: {
    forward_join_61: {
    forward_join_50: {
    forward_join_20: {
    forward_join_8: {
    life2_3 = (__fieldRead1410_0() ^ 34185907591347L);
    if (!(__call1410_1())) {
        break forward_join_8;
    }
    if (!(__call1410_2())) {
        break forward_join_180;
    }
    }
    if (!(__call1410_5(__call1410_4(__call1410_3())))) {
        break forward_join_180;
    }
    if (!((!__call1410_8(__call1410_7(__call1410_6()))))) {
        break forward_join_180;
    }
    if (!(__call1410_9())) {
        break forward_join_20;
    }
    if (!((!__fieldRead1410_10()))) {
        break forward_join_180;
    }
    }
    __call1410_11(0);
    __call1410_13(__invokedynamic1410_12(5481, (2723931527661087770L ^ life2_3)));
    spill1410_0 = 30921;
    __call1410_14();
    __call1410_16(__invokedynamic1410_15(spill1410_0, (7569456691530826164L ^ life2_3)), 1);
    __call1410_19(__fieldRead1410_17(receiver), __fieldRead1410_18());
    if (!((__fieldRead1410_20(receiver) == null))) {
        break forward_join_50;
    }
    __fieldWrite1410_26(receiver, __cast1410_25(__call1410_24(__call1410_22(__call1410_21()), __classLiteral1410_23())));
    }
    if (!(__call1410_28(__fieldRead1410_27(receiver)))) {
        break forward_join_61;
    }
    forwardValue1410_66_0 = __call1410_33(__cast1410_32(__call1410_31(__fieldRead1410_30(__fieldRead1410_29(receiver)))));
    break forward_join_66;
    }
    forwardValue1410_66_0 = __invokedynamic1410_34(27248, (8157261601887458068L ^ life2_3));
    }
    life4_89 = forwardValue1410_66_0;
    if (!(__call1410_35())) {
        break forward_join_73;
    }
    if (!((!__fieldRead1410_36(receiver)))) {
        break forward_join_73;
    }
    __call1410_37();
    }
    __call1410_39(__invokedynamic1410_38(8269, (8144856961485986093L ^ life2_3)));
    __call1410_40();
    __call1410_41(0x1.0p3f, 0x1.0p3f, 0x1.0p3f);
    life5_125 = ((((float) (__call1410_42() % __invokedynamic1410_43(18658, (4900775321989850901L ^ life2_3)))) / 0x1.77p11f) / 0x1.0p3f);
    __call1410_44(life5_125, 0x0.0p0f, 0x0.0p0f);
    __call1410_45(-0x1.9p5f, 0x0.0p0f, 0x0.0p0f, 0x1.0p0f);
    __call1410_46(receiver, p0, life4_89);
    __call1410_47();
    __call1410_48();
    __call1410_49(0x1.0p3f, 0x1.0p3f, 0x1.0p3f);
    life6_157 = ((((float) (__call1410_50() % __invokedynamic1410_51(7314, (504476530196673380L ^ life2_3)))) / 0x1.309p12f) / 0x1.0p3f);
    __call1410_52((-life6_157), 0x0.0p0f, 0x0.0p0f);
    spill1410_1 = 10354;
    __call1410_53(0x1.4p3f, 0x0.0p0f, 0x0.0p0f, 0x1.0p0f);
    spill1410_2 = (6844767503043121470L ^ life2_3);
    __call1410_54(receiver, p0, life4_89);
    __call1410_55();
    __call1410_57(__invokedynamic1410_56(spill1410_1, spill1410_2));
    __call1410_60(__invokedynamic1410_58(32465, (7072598802950490040L ^ life2_3)), __invokedynamic1410_59(4132, (4653132090204907867L ^ life2_3)));
    spill1410_3 = 28281;
    __call1410_61();
    __call1410_63(__invokedynamic1410_62(spill1410_3, (2715547954320283404L ^ life2_3)));
    __call1410_64(1);
    __call1410_67(__fieldRead1410_65(receiver), __fieldRead1410_66());
    if (!(__call1410_68())) {
        break forward_join_180;
    }
    if (!((!__fieldRead1410_69(receiver)))) {
        break forward_join_180;
    }
    __call1410_70();
    }
    return;
}
public static void h1410_0(moom.Oo p0) throws Throwable {
    throw __call1141000_0(p0);
}
public static void h1410_1(moom.Oo p0) throws Throwable {
    throw __call1141001_0(p0);
}
public static void h1410_2(moom.Oo p0) throws Throwable {
    throw __call1141002_0(p0);
}
public static void h1410_3(moom.Oo p0) throws Throwable {
    throw __call1141003_0(p0);
}
public static void h1410_4(moom.Oo p0) throws Throwable {
    throw __call1141004_0(p0);
}
public static void h1410_5(moom.Oo p0) throws Throwable {
    throw __call1141005_0(p0);
}
public static void h1410_6(moom.Oo p0) throws Throwable {
    throw __call1141006_0(p0);
}
public static void h1410_7(moom.Oo p0) throws Throwable {
    throw __call1141007_0(p0);
}
public static void h1410_8(moom.Oo p0) throws Throwable {
    throw __call1141008_0(p0);
}
public static void h1410_9(moom.Oo p0) throws Throwable {
    throw __call1141009_0(p0);
}
public static void h1410_10(moom.Oo p0) throws Throwable {
    throw __call1141010_0(p0);
}
public static void h1410_11(moom.Oo p0) throws Throwable {
    throw __call1141011_0(p0);
}
private static native long __fieldRead1410_0() throws Throwable;
private static native boolean __call1410_1() throws Throwable;
private static native boolean __call1410_2() throws Throwable;
private static native net.minecraft.client.Minecraft __call1410_3() throws Throwable;
private static native net.minecraft.client.renderer.entity.RenderManager __call1410_4(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __call1410_5(net.minecraft.client.renderer.entity.RenderManager a0) throws Throwable;
private static native net.minecraft.client.Minecraft __call1410_6() throws Throwable;
private static native net.minecraft.client.renderer.entity.RenderManager __call1410_7(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __call1410_8(net.minecraft.client.renderer.entity.RenderManager a0) throws Throwable;
private static native boolean __call1410_9() throws Throwable;
private static native boolean __fieldRead1410_10() throws Throwable;
private static native void __call1410_11(int a0) throws Throwable;
private static native int __invokedynamic1410_12(int a0, long a1) throws Throwable;
private static native void __call1410_13(int a0) throws Throwable;
private static native void __call1410_14() throws Throwable;
private static native int __invokedynamic1410_15(int a0, long a1) throws Throwable;
private static native void __call1410_16(int a0, int a1) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureManager __fieldRead1410_17(net.minecraft.client.renderer.entity.RenderItem a0) throws Throwable;
private static native moom.DD __fieldRead1410_18() throws Throwable;
private static native void __call1410_19(net.minecraft.client.renderer.texture.TextureManager a0, moom.DD a1) throws Throwable;
private static native com.moon.module.impl.Glint __fieldRead1410_20(net.minecraft.client.renderer.entity.RenderItem a0) throws Throwable;
private static native com.moon.runtime.ClientContext __call1410_21() throws Throwable;
private static native com.moon.fU __call1410_22(com.moon.runtime.ClientContext a0) throws Throwable;
private static native java.lang.Object __classLiteral1410_23() throws Throwable;
private static native com.moon.module.Module __call1410_24(com.moon.fU a0, java.lang.Object a1) throws Throwable;
private static native com.moon.module.impl.Glint __cast1410_25(com.moon.module.Module a0) throws Throwable;
private static native void __fieldWrite1410_26(net.minecraft.client.renderer.entity.RenderItem a0, com.moon.module.impl.Glint a1) throws Throwable;
private static native com.moon.module.impl.Glint __fieldRead1410_27(net.minecraft.client.renderer.entity.RenderItem a0) throws Throwable;
private static native boolean __call1410_28(com.moon.module.impl.Glint a0) throws Throwable;
private static native com.moon.module.impl.Glint __fieldRead1410_29(net.minecraft.client.renderer.entity.RenderItem a0) throws Throwable;
private static native com.moon.setting.ColorSetting __fieldRead1410_30(com.moon.module.impl.Glint a0) throws Throwable;
private static native java.lang.Object __call1410_31(com.moon.setting.ColorSetting a0) throws Throwable;
private static native java.lang.Integer __cast1410_32(java.lang.Object a0) throws Throwable;
private static native int __call1410_33(java.lang.Integer a0) throws Throwable;
private static native int __invokedynamic1410_34(int a0, long a1) throws Throwable;
private static native boolean __call1410_35() throws Throwable;
private static native boolean __fieldRead1410_36(net.minecraft.client.renderer.entity.RenderItem a0) throws Throwable;
private static native void __call1410_37() throws Throwable;
private static native int __invokedynamic1410_38(int a0, long a1) throws Throwable;
private static native void __call1410_39(int a0) throws Throwable;
private static native void __call1410_40() throws Throwable;
private static native void __call1410_41(float a0, float a1, float a2) throws Throwable;
private static native long __call1410_42() throws Throwable;
private static native long __invokedynamic1410_43(int a0, long a1) throws Throwable;
private static native void __call1410_44(float a0, float a1, float a2) throws Throwable;
private static native void __call1410_45(float a0, float a1, float a2, float a3) throws Throwable;
private static native void __call1410_46(net.minecraft.client.renderer.entity.RenderItem a0, net.minecraft.client.resources.model.IBakedModel a1, int a2) throws Throwable;
private static native void __call1410_47() throws Throwable;
private static native void __call1410_48() throws Throwable;
private static native void __call1410_49(float a0, float a1, float a2) throws Throwable;
private static native long __call1410_50() throws Throwable;
private static native long __invokedynamic1410_51(int a0, long a1) throws Throwable;
private static native void __call1410_52(float a0, float a1, float a2) throws Throwable;
private static native void __call1410_53(float a0, float a1, float a2, float a3) throws Throwable;
private static native void __call1410_54(net.minecraft.client.renderer.entity.RenderItem a0, net.minecraft.client.resources.model.IBakedModel a1, int a2) throws Throwable;
private static native void __call1410_55() throws Throwable;
private static native int __invokedynamic1410_56(int a0, long a1) throws Throwable;
private static native void __call1410_57(int a0) throws Throwable;
private static native int __invokedynamic1410_58(int a0, long a1) throws Throwable;
private static native int __invokedynamic1410_59(int a0, long a1) throws Throwable;
private static native void __call1410_60(int a0, int a1) throws Throwable;
private static native void __call1410_61() throws Throwable;
private static native int __invokedynamic1410_62(int a0, long a1) throws Throwable;
private static native void __call1410_63(int a0) throws Throwable;
private static native void __call1410_64(int a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureManager __fieldRead1410_65(net.minecraft.client.renderer.entity.RenderItem a0) throws Throwable;
private static native moom.DD __fieldRead1410_66() throws Throwable;
private static native void __call1410_67(net.minecraft.client.renderer.texture.TextureManager a0, moom.DD a1) throws Throwable;
private static native boolean __call1410_68() throws Throwable;
private static native boolean __fieldRead1410_69(net.minecraft.client.renderer.entity.RenderItem a0) throws Throwable;
private static native void __call1410_70() throws Throwable;
private static native java.lang.Throwable __call1141000_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1141001_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1141002_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1141003_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1141004_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1141005_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1141006_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1141007_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1141008_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1141009_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1141010_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1141011_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_46ee60b020e8f4a59255(net.minecraft.client.renderer.entity.RenderItem a0, net.minecraft.client.resources.model.IBakedModel a1, int a2, net.minecraft.item.ItemStack a3) throws E;
private static final class __SourceHandler_46ee60b020e8f4a59255 {

public static void f1411(net.minecraft.client.renderer.entity.RenderItem receiver, net.minecraft.client.resources.model.IBakedModel p0, int p1, net.minecraft.item.ItemStack p2) throws Throwable {
    int lexicalValue1411_20_0;
    long life4_3;
    net.minecraft.client.renderer.Tessellator life6_5;
    moom.lw life7_8;
    int life8_12;
    int life9_25;
    moom.bs[] life10_43;
    int life11_46;
    int life12_48;
    moom.bs life13_55;
    lexical_join_73: {
    lexical_join_58: {
    lexical_join_26: {
    lexical_join_20: {
    lexical_join_19: {
    life4_3 = (__fieldRead1411_0() ^ 75430499613434L);
    life6_5 = __call1411_1();
    life7_8 = __call1411_2(life6_5);
    life8_12 = __integerCategory1411_6(__call1411_5(__call1411_4(__call1411_3())));
    if (!(__call1411_7())) {
        break lexical_join_19;
    }
    if (!((life8_12 != 0))) {
        break lexical_join_19;
    }
    lexicalValue1411_20_0 = 1;
    break lexical_join_20;
    }
    lexicalValue1411_20_0 = 0;
    }
    life9_25 = lexicalValue1411_20_0;
    if (!((life9_25 != 0))) {
        break lexical_join_26;
    }
    __call1411_9(life7_8, __fieldRead1411_8());
    }
    __call1411_12(life7_8, __invokedynamic1411_10(26029, (8479761309307125391L ^ life4_3)), __fieldRead1411_11());
    life10_43 = __fieldRead1411_13();
    life11_46 = (life10_43).length;
    life12_48 = 0;
    lexical_cycle_41: while (true) {
    if (!((life12_48 < life11_46))) {
        break lexical_join_58;
    }
    life13_55 = (life10_43)[life12_48];
    __call1411_15(receiver, life7_8, __call1411_14(p0, life13_55), p1, p2);
    life12_48 += 1;
    continue lexical_cycle_41;
    }
    }
    __call1411_17(receiver, life7_8, __call1411_16(p0), p1, p2);
    __call1411_18(life6_5);
    if (!((life9_25 != 0))) {
        break lexical_join_73;
    }
    __call1411_19(life7_8, null);
    __call1411_20();
    }
    return;
}
public static void h1411_0(moom.Oo p0) throws Throwable {
    throw __call1141100_0(p0);
}
public static void h1411_1(moom.Oo p0) throws Throwable {
    throw __call1141101_0(p0);
}
public static void h1411_2(moom.Oo p0) throws Throwable {
    throw __call1141102_0(p0);
}
public static void h1411_3(moom.Oo p0) throws Throwable {
    throw __call1141103_0(p0);
}
private static native long __fieldRead1411_0() throws Throwable;
private static native net.minecraft.client.renderer.Tessellator __call1411_1() throws Throwable;
private static native moom.lw __call1411_2(net.minecraft.client.renderer.Tessellator a0) throws Throwable;
private static native net.minecraft.client.Minecraft __call1411_3() throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureMap __call1411_4(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __call1411_5(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native int __integerCategory1411_6(boolean value) throws Throwable;
private static native boolean __call1411_7() throws Throwable;
private static native net.minecraft.util.EnumWorldBlockLayer __fieldRead1411_8() throws Throwable;
private static native void __call1411_9(moom.lw a0, net.minecraft.util.EnumWorldBlockLayer a1) throws Throwable;
private static native int __invokedynamic1411_10(int a0, long a1) throws Throwable;
private static native moom.oD __fieldRead1411_11() throws Throwable;
private static native void __call1411_12(moom.lw a0, int a1, moom.oD a2) throws Throwable;
private static native moom.bs[] __fieldRead1411_13() throws Throwable;
private static native java.util.List __call1411_14(net.minecraft.client.resources.model.IBakedModel a0, moom.bs a1) throws Throwable;
private static native void __call1411_15(net.minecraft.client.renderer.entity.RenderItem a0, moom.lw a1, java.util.List a2, int a3, net.minecraft.item.ItemStack a4) throws Throwable;
private static native java.util.List __call1411_16(net.minecraft.client.resources.model.IBakedModel a0) throws Throwable;
private static native void __call1411_17(net.minecraft.client.renderer.entity.RenderItem a0, moom.lw a1, java.util.List a2, int a3, net.minecraft.item.ItemStack a4) throws Throwable;
private static native void __call1411_18(net.minecraft.client.renderer.Tessellator a0) throws Throwable;
private static native void __call1411_19(moom.lw a0, java.lang.Object a1) throws Throwable;
private static native void __call1411_20() throws Throwable;
private static native java.lang.Throwable __call1141100_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1141101_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1141102_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1141103_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_d69b36235ff34be0529f(net.minecraft.client.renderer.entity.RenderItem a0, net.minecraft.item.ItemStack a1, int a2, int a3) throws E;
private static final class __SourceHandler_d69b36235ff34be0529f {

public static void f517(net.minecraft.client.renderer.entity.RenderItem receiver, net.minecraft.item.ItemStack p0, int p1, int p2) throws Throwable {
    if ((p0 != null)) {
        if ((__call517_0(p0) != null)) {
        net.minecraft.client.renderer.entity.RenderItem __stackOp517_1_0 = receiver;
        __fieldWrite517_3(__stackOp517_1_0, (__fieldRead517_2(__stackOp517_1_0) + 0x1.9p5f));
        __call517_4(receiver, p0, ((float) p1), ((float) p2));
        net.minecraft.client.renderer.entity.RenderItem __stackOp517_5_0 = receiver;
        __fieldWrite517_7(__stackOp517_5_0, (__fieldRead517_6(__stackOp517_5_0) - 0x1.9p5f));
    }
    }
    return;
}
public static void h517_0(java.lang.Throwable p0) throws Throwable {
    throw __call2051700_0(p0);
}
public static void h517_1(java.lang.Throwable p0, net.minecraft.item.ItemStack p1) throws Throwable {
    java.lang.Throwable local2 = p0;
    moom.qY local3 = __call2051701_0(local2, "Rendering item");
    moom.qZ local4 = __call2051701_1(local3, "Item being rendered");
    __call2051701_3(local4, "Item Type", __invokedynamic2051701_2(p1));
    __call2051701_5(local4, "Item Aux", __invokedynamic2051701_4(p1));
    __call2051701_7(local4, "Item NBT", __invokedynamic2051701_6(p1));
    __call2051701_9(local4, "Item Foil", __invokedynamic2051701_8(p1));
    throw new moom.Oo(local3);
}
private static native net.minecraft.item.Item __call517_0(net.minecraft.item.ItemStack a0) throws Throwable;
private static native float __fieldRead517_2(net.minecraft.client.renderer.entity.RenderItem a0) throws Throwable;
private static native void __fieldWrite517_3(net.minecraft.client.renderer.entity.RenderItem a0, float a1) throws Throwable;
private static native void __call517_4(net.minecraft.client.renderer.entity.RenderItem a0, net.minecraft.item.ItemStack a1, float a2, float a3) throws Throwable;
private static native float __fieldRead517_6(net.minecraft.client.renderer.entity.RenderItem a0) throws Throwable;
private static native void __fieldWrite517_7(net.minecraft.client.renderer.entity.RenderItem a0, float a1) throws Throwable;
private static native java.lang.Throwable __call2051700_0(java.lang.Throwable a0) throws Throwable;
private static native moom.qY __call2051701_0(java.lang.Throwable a0, java.lang.String a1) throws Throwable;
private static native moom.qZ __call2051701_1(moom.qY a0, java.lang.String a1) throws Throwable;
private static native java.util.concurrent.Callable __invokedynamic2051701_2(net.minecraft.item.ItemStack a0) throws Throwable;
private static native void __call2051701_3(moom.qZ a0, java.lang.String a1, java.util.concurrent.Callable a2) throws Throwable;
private static native java.util.concurrent.Callable __invokedynamic2051701_4(net.minecraft.item.ItemStack a0) throws Throwable;
private static native void __call2051701_5(moom.qZ a0, java.lang.String a1, java.util.concurrent.Callable a2) throws Throwable;
private static native java.util.concurrent.Callable __invokedynamic2051701_6(net.minecraft.item.ItemStack a0) throws Throwable;
private static native void __call2051701_7(moom.qZ a0, java.lang.String a1, java.util.concurrent.Callable a2) throws Throwable;
private static native java.util.concurrent.Callable __invokedynamic2051701_8(net.minecraft.item.ItemStack a0) throws Throwable;
private static native void __call2051701_9(moom.qZ a0, java.lang.String a1, java.util.concurrent.Callable a2) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_7e0fdf7f7b41ea7817aa(net.minecraft.client.renderer.entity.RenderItem a0, net.minecraft.item.ItemStack a1, net.minecraft.client.resources.model.IBakedModel a2) throws E;
private static final class __SourceHandler_7e0fdf7f7b41ea7817aa {

public static void f1412(net.minecraft.client.renderer.entity.RenderItem receiver, net.minecraft.item.ItemStack p0, net.minecraft.client.resources.model.IBakedModel p1) throws Throwable {
    float life3_58;
    float life4_60;
    forward_join_92: {
    forward_join_91: {
    forward_join_88: {
    forward_join_74: {
    forward_join_42: {
    forward_join_29: {
    if (!((p0 != null))) { break forward_join_92; }
    __call1412_0();
    __call1412_1(0x1.0p-1f, 0x1.0p-1f, 0x1.0p-1f);
    if (!(__call1412_2(p1))) { break forward_join_29; }
    __call1412_3(0x1.68p7f, 0x0.0p0f, 0x1.0p0f, 0x0.0p0f);
    __call1412_4(-0x1.0p-1f, -0x1.0p-1f, -0x1.0p-1f);
    __call1412_5(0x1.0p0f, 0x1.0p0f, 0x1.0p0f, 0x1.0p0f);
    __call1412_6();
    __call1412_8(__fieldRead1412_7(), p0);
    break forward_join_91;
    }
    __call1412_9(-0x1.0p-1f, -0x1.0p-1f, -0x1.0p-1f);
    if (!(__call1412_10())) { break forward_join_42; }
    p1 = __call1412_12(p0, p1, __fieldRead1412_11(receiver), 0);
    }
    __fieldWrite1412_13(receiver, 0);
    __call1412_14(receiver, p1, p0);
    if (!(__fieldRead1412_15(receiver))) { break forward_join_74; }
    life3_58 = __fieldRead1412_16();
    life4_60 = __fieldRead1412_17();
    __call1412_19(__fieldRead1412_18(), 0x1.ep7f, life4_60);
    __fieldWrite1412_20(receiver, 1);
    __call1412_21(receiver, p1, p0);
    __fieldWrite1412_22(receiver, 0);
    __call1412_24(__fieldRead1412_23(), life3_58, life4_60);
    }
    if (!(__call1412_27(__call1412_26(__call1412_25())))) { break forward_join_91; }
    if (!(__call1412_28(p0))) { break forward_join_91; }
    if (!(__call1412_29())) { break forward_join_88; }
    if (!((!__call1412_30(receiver, p0, p1)))) { break forward_join_91; }
    }
    __call1412_31(receiver, p1);
    }
    __call1412_32();
    }
    return;
}
public static void h1412_0(moom.Oo p0) throws Throwable {
    throw __call1141200_0(p0);
}
public static void h1412_1(moom.Oo p0) throws Throwable {
    throw __call1141201_0(p0);
}
public static void h1412_2(moom.Oo p0) throws Throwable {
    throw __call1141202_0(p0);
}
public static void h1412_3(moom.Oo p0) throws Throwable {
    throw __call1141203_0(p0);
}
public static void h1412_4(moom.Oo p0) throws Throwable {
    throw __call1141204_0(p0);
}
public static void h1412_5(moom.Oo p0) throws Throwable {
    throw __call1141205_0(p0);
}
private static native void __call1412_0() throws Throwable;
private static native void __call1412_1(float a0, float a1, float a2) throws Throwable;
private static native boolean __call1412_2(net.minecraft.client.resources.model.IBakedModel a0) throws Throwable;
private static native void __call1412_3(float a0, float a1, float a2, float a3) throws Throwable;
private static native void __call1412_4(float a0, float a1, float a2) throws Throwable;
private static native void __call1412_5(float a0, float a1, float a2, float a3) throws Throwable;
private static native void __call1412_6() throws Throwable;
private static native moom.on __fieldRead1412_7() throws Throwable;
private static native void __call1412_8(moom.on a0, net.minecraft.item.ItemStack a1) throws Throwable;
private static native void __call1412_9(float a0, float a1, float a2) throws Throwable;
private static native boolean __call1412_10() throws Throwable;
private static native moom.DE __fieldRead1412_11(net.minecraft.client.renderer.entity.RenderItem a0) throws Throwable;
private static native net.minecraft.client.resources.model.IBakedModel __call1412_12(net.minecraft.item.ItemStack a0, net.minecraft.client.resources.model.IBakedModel a1, moom.DE a2, int a3) throws Throwable;
private static native void __fieldWrite1412_13(net.minecraft.client.renderer.entity.RenderItem a0, int a1) throws Throwable;
private static native void __call1412_14(net.minecraft.client.renderer.entity.RenderItem a0, net.minecraft.client.resources.model.IBakedModel a1, net.minecraft.item.ItemStack a2) throws Throwable;
private static native boolean __fieldRead1412_15(net.minecraft.client.renderer.entity.RenderItem a0) throws Throwable;
private static native float __fieldRead1412_16() throws Throwable;
private static native float __fieldRead1412_17() throws Throwable;
private static native int __fieldRead1412_18() throws Throwable;
private static native void __call1412_19(int a0, float a1, float a2) throws Throwable;
private static native void __fieldWrite1412_20(net.minecraft.client.renderer.entity.RenderItem a0, int a1) throws Throwable;
private static native void __call1412_21(net.minecraft.client.renderer.entity.RenderItem a0, net.minecraft.client.resources.model.IBakedModel a1, net.minecraft.item.ItemStack a2) throws Throwable;
private static native void __fieldWrite1412_22(net.minecraft.client.renderer.entity.RenderItem a0, int a1) throws Throwable;
private static native int __fieldRead1412_23() throws Throwable;
private static native void __call1412_24(int a0, float a1, float a2) throws Throwable;
private static native net.minecraft.client.Minecraft __call1412_25() throws Throwable;
private static native net.minecraft.client.renderer.entity.RenderManager __call1412_26(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __call1412_27(net.minecraft.client.renderer.entity.RenderManager a0) throws Throwable;
private static native boolean __call1412_28(net.minecraft.item.ItemStack a0) throws Throwable;
private static native boolean __call1412_29() throws Throwable;
private static native boolean __call1412_30(net.minecraft.client.renderer.entity.RenderItem a0, net.minecraft.item.ItemStack a1, net.minecraft.client.resources.model.IBakedModel a2) throws Throwable;
private static native void __call1412_31(net.minecraft.client.renderer.entity.RenderItem a0, net.minecraft.client.resources.model.IBakedModel a1) throws Throwable;
private static native void __call1412_32() throws Throwable;
private static native java.lang.Throwable __call1141200_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1141201_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1141202_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1141203_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1141204_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1141205_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_13a2dd98ab22bf1b4558(net.minecraft.client.renderer.entity.RenderItem a0, net.minecraft.item.ItemStack a1, net.minecraft.entity.EntityLivingBase a2, net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType a3) throws E;
private static final class __SourceHandler_13a2dd98ab22bf1b4558 {

public static void f1413(net.minecraft.client.renderer.entity.RenderItem receiver, net.minecraft.item.ItemStack p0, net.minecraft.entity.EntityLivingBase p1, net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType p2) throws Throwable {
    long life4_3;
    net.minecraft.client.resources.model.IBakedModel life6_15;
    net.minecraft.entity.player.EntityPlayer life7_21;
    net.minecraft.item.Item life8_24;
    moom.DE life9_26;
    int life10_57;
    forward_join_104: {
    forward_join_96: {
    forward_join_85: {
    forward_join_77: {
    forward_join_63: {
    forward_join_37: {
    life4_3 = (__fieldRead1413_0() ^ 71021774909899L);
    if (!((p0 != null))) { break forward_join_104; }
    if (!((p1 != null))) { break forward_join_104; }
    life6_15 = __call1413_2(__fieldRead1413_1(receiver), p0);
    if (!((__instanceOf1413_3(p1) != 0))) { break forward_join_96; }
    life7_21 = __cast1413_4(p1);
    life8_24 = __call1413_5(p0);
    life9_26 = null;
    if (!((life8_24 == __fieldRead1413_6()))) { break forward_join_37; }
    if (!((__fieldRead1413_7(life7_21) != null))) { break forward_join_37; }
    life9_26 = new moom.DE("fishing_rod_cast", "inventory");
    break forward_join_85;
    }
    if (!((life8_24 == __fieldRead1413_8()))) { break forward_join_85; }
    if (!((__call1413_9(life7_21) != null))) { break forward_join_85; }
    life10_57 = (__call1413_10(p0) - __call1413_11(life7_21));
    if (!((life10_57 >= __invokedynamic1413_12(3882, (9135116631633862441L ^ life4_3))))) { break forward_join_63; }
    life9_26 = new moom.DE("bow_pulling_2", "inventory");
    break forward_join_85;
    }
    if (!((life10_57 > __invokedynamic1413_13(9363, (1462709441064875144L ^ life4_3))))) { break forward_join_77; }
    life9_26 = new moom.DE("bow_pulling_1", "inventory");
    break forward_join_85;
    }
    if (!((life10_57 > 0))) { break forward_join_85; }
    life9_26 = new moom.DE("bow_pulling_0", "inventory");
    }
    if (!((life9_26 != null))) { break forward_join_96; }
    life6_15 = __call1413_16(__call1413_15(__fieldRead1413_14(receiver)), life9_26);
    __fieldWrite1413_17(receiver, life9_26);
    }
    __call1413_18(receiver, p0, life6_15, p2);
    __fieldWrite1413_19(receiver, null);
    }
    return;
}
public static void h1413_0(moom.Oo p0) throws Throwable {
    throw __call1141300_0(p0);
}
public static void h1413_1(moom.Oo p0) throws Throwable {
    throw __call1141301_0(p0);
}
public static void h1413_2(moom.Oo p0) throws Throwable {
    throw __call1141302_0(p0);
}
private static native long __fieldRead1413_0() throws Throwable;
private static native moom.ll __fieldRead1413_1(net.minecraft.client.renderer.entity.RenderItem a0) throws Throwable;
private static native net.minecraft.client.resources.model.IBakedModel __call1413_2(moom.ll a0, net.minecraft.item.ItemStack a1) throws Throwable;
private static native int __instanceOf1413_3(net.minecraft.entity.EntityLivingBase a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayer __cast1413_4(net.minecraft.entity.EntityLivingBase a0) throws Throwable;
private static native net.minecraft.item.Item __call1413_5(net.minecraft.item.ItemStack a0) throws Throwable;
private static native moom.xn __fieldRead1413_6() throws Throwable;
private static native net.minecraft.entity.projectile.EntityFishHook __fieldRead1413_7(net.minecraft.entity.player.EntityPlayer a0) throws Throwable;
private static native net.minecraft.item.ItemBow __fieldRead1413_8() throws Throwable;
private static native net.minecraft.item.ItemStack __call1413_9(net.minecraft.entity.player.EntityPlayer a0) throws Throwable;
private static native int __call1413_10(net.minecraft.item.ItemStack a0) throws Throwable;
private static native int __call1413_11(net.minecraft.entity.player.EntityPlayer a0) throws Throwable;
private static native int __invokedynamic1413_12(int a0, long a1) throws Throwable;
private static native int __invokedynamic1413_13(int a0, long a1) throws Throwable;
private static native moom.ll __fieldRead1413_14(net.minecraft.client.renderer.entity.RenderItem a0) throws Throwable;
private static native net.minecraft.client.resources.model.ModelManager __call1413_15(moom.ll a0) throws Throwable;
private static native net.minecraft.client.resources.model.IBakedModel __call1413_16(net.minecraft.client.resources.model.ModelManager a0, moom.DE a1) throws Throwable;
private static native void __fieldWrite1413_17(net.minecraft.client.renderer.entity.RenderItem a0, moom.DE a1) throws Throwable;
private static native void __call1413_18(net.minecraft.client.renderer.entity.RenderItem a0, net.minecraft.item.ItemStack a1, net.minecraft.client.resources.model.IBakedModel a2, net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType a3) throws Throwable;
private static native void __fieldWrite1413_19(net.minecraft.client.renderer.entity.RenderItem a0, java.lang.Object a1) throws Throwable;
private static native java.lang.Throwable __call1141300_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1141301_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1141302_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_4dcc16289550c4f1c3f5(net.minecraft.client.renderer.entity.RenderItem a0, net.minecraft.item.ItemStack a1) throws E;
private static final class __SourceHandler_4dcc16289550c4f1c3f5 {

public static boolean f1414(net.minecraft.client.renderer.entity.RenderItem receiver, net.minecraft.item.ItemStack p0) throws Throwable {
    int forwardValue1414_13_0;
    net.minecraft.client.resources.model.IBakedModel life2_4;
    forward_join_13: {
    forward_join_12: {
    life2_4 = __call1414_1(__fieldRead1414_0(receiver), p0);
    if (!((life2_4 != null))) {
        break forward_join_12;
    }
    if (!(__call1414_2(life2_4))) {
        break forward_join_12;
    }
    forwardValue1414_13_0 = 1;
    break forward_join_13;
    }
    forwardValue1414_13_0 = 0;
    }
    return __integerCategory1414_3(forwardValue1414_13_0);
}
public static void h1414_0(moom.Oo p0) throws Throwable {
    throw __call1141400_0(p0);
}
public static void h1414_1(moom.Oo p0) throws Throwable {
    throw __call1141401_0(p0);
}
private static native moom.ll __fieldRead1414_0(net.minecraft.client.renderer.entity.RenderItem a0) throws Throwable;
private static native net.minecraft.client.resources.model.IBakedModel __call1414_1(moom.ll a0, net.minecraft.item.ItemStack a1) throws Throwable;
private static native boolean __call1414_2(net.minecraft.client.resources.model.IBakedModel a0) throws Throwable;
private static native boolean __integerCategory1414_3(int value) throws Throwable;
private static native java.lang.Throwable __call1141400_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1141401_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_5369a9b7c497c47dbb59(net.minecraft.client.renderer.entity.RenderItem a0, moom.lw a1, moom.lC a2, int a3) throws E;
private static final class __SourceHandler_5369a9b7c497c47dbb59 {

public static void f2568(net.minecraft.client.renderer.entity.RenderItem receiver, moom.lw p0, moom.lC p1, int p2) throws Throwable {
    if (__fieldRead2568_0(receiver)) {
        if ((__call2568_1(p1) == null)) {
        return;
    }
        p1 = __call2568_2(p1);
    } else {
        if ((__call2568_3(p1) != null)) {
        __fieldWrite2568_4(receiver, 1);
    }
    }
    if (__call2568_5(p0)) {
        __call2568_7(p0, __call2568_6(p1));
    } else {
        __call2568_9(p0, __call2568_8(p1));
    }
    __call2568_11(p0, __call2568_10(p1));
    __call2568_12(p0, p2);
    __call2568_13(receiver, p0, p1);
    return;
}
public static void h2568_0(moom.Oo p0) throws Throwable {
    throw __call1256800_0(p0);
}
public static void h2568_1(moom.Oo p0) throws Throwable {
    throw __call1256801_0(p0);
}
public static void h2568_2(moom.Oo p0) throws Throwable {
    throw __call1256802_0(p0);
}
public static void h2568_3(moom.Oo p0) throws Throwable {
    throw __call1256803_0(p0);
}
private static native boolean __fieldRead2568_0(net.minecraft.client.renderer.entity.RenderItem a0) throws Throwable;
private static native moom.lC __call2568_1(moom.lC a0) throws Throwable;
private static native moom.lC __call2568_2(moom.lC a0) throws Throwable;
private static native moom.lC __call2568_3(moom.lC a0) throws Throwable;
private static native void __fieldWrite2568_4(net.minecraft.client.renderer.entity.RenderItem a0, int a1) throws Throwable;
private static native boolean __call2568_5(moom.lw a0) throws Throwable;
private static native int[] __call2568_6(moom.lC a0) throws Throwable;
private static native void __call2568_7(moom.lw a0, int[] a1) throws Throwable;
private static native int[] __call2568_8(moom.lC a0) throws Throwable;
private static native void __call2568_9(moom.lw a0, int[] a1) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __call2568_10(moom.lC a0) throws Throwable;
private static native void __call2568_11(moom.lw a0, net.minecraft.client.renderer.texture.TextureAtlasSprite a1) throws Throwable;
private static native void __call2568_12(moom.lw a0, int a1) throws Throwable;
private static native void __call2568_13(net.minecraft.client.renderer.entity.RenderItem a0, moom.lw a1, moom.lC a2) throws Throwable;
private static native java.lang.Throwable __call1256800_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1256801_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1256802_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1256803_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> moom.DE __sourceHandlerCall_95743551eb121f30811e(net.minecraft.item.ItemStack a0) throws E;
private static final class __SourceHandler_95743551eb121f30811e {

public static moom.DE f2569(net.minecraft.item.ItemStack p0) throws Throwable {
    return (__call2569_1(__call2569_0(p0)) ? new moom.DE("bottle_splash", "inventory") : new moom.DE("bottle_drinkable", "inventory"));
}
public static void h2569_0(moom.Oo p0) throws Throwable {
    throw __call1256900_0(p0);
}
private static native int __call2569_0(net.minecraft.item.ItemStack a0) throws Throwable;
private static native boolean __call2569_1(int a0) throws Throwable;
private static native java.lang.Throwable __call1256900_0(moom.Oo a0) throws Throwable;

}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral10767_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/nv"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void b(net.minecraft.item.ItemStack p0, float p1, float p2) {
this.h = ((boolean)(true));
    java.lang.Object local4 = ((moom.ll)(this.b)).a__pp(((net.minecraft.item.ItemStack)(p0)));
    moom.kZ.B();
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((float)(p1)), ((float)(p2)), ((boolean)(((net.minecraft.client.resources.model.IBakedModel)(local4)).b())));
    ((moom.lP)(((net.minecraft.client.resources.model.IBakedModel)(local4)).a__lP())).a__Void(((net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType)(net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType.GUI)));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.ItemStack)(p0)), ((net.minecraft.client.resources.model.IBakedModel)(local4)));
    moom.kZ.C();
    this.h = ((boolean)(false));
    return;
}


private void b(moom.lw p0, moom.lC p1, int p2) { __sourceHandlerCall_5369a9b7c497c47dbb59(this, p0, p1, p2); }


public void b(moom.oR p0) {
((moom.ll)(this.b)).a__Void();
    return;
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
    life3_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 16831);
    if (((net.minecraft.client.renderer.entity.RenderItem.q)[life3_8] == null)) {
        life4_77 = new byte[] {((byte) ((int) (p1 >>> 56))), ((byte) ((int) (p1 >>> 48))), ((byte) ((int) (p1 >>> 40))), ((byte) ((int) (p1 >>> 32))), ((byte) ((int) (p1 >>> 24))), ((byte) ((int) (p1 >>> 16))), ((byte) ((int) (p1 >>> 8))), ((byte) ((int) p1))};
        life5_81 = (net.minecraft.client.renderer.entity.RenderItem.p)[life3_8];
        life7_146 = new byte[] {((byte) ((int) (life5_81 >>> 56))), ((byte) ((int) (life5_81 >>> 48))), ((byte) ((int) (life5_81 >>> 40))), ((byte) ((int) (life5_81 >>> 32))), ((byte) ((int) (life5_81 >>> 24))), ((byte) ((int) (life5_81 >>> 16))), ((byte) ((int) (life5_81 >>> 8))), ((byte) ((int) life5_81))};
        life8_150 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life9_155 = ((java.lang.Object[])(((java.util.Map)(net.minecraft.client.renderer.entity.RenderItem.r)).get(((java.lang.Object)(life8_150)))));
        try {
        if ((life9_155 == null)) {
        life9_155 = new java.lang.Object[3];
        (life9_155)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding")));
        (life9_155)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life9_155)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(net.minecraft.client.renderer.entity.RenderItem.r)).put(((java.lang.Object)(life8_150)), ((java.lang.Object)(life9_155)));
    }
        life11_188 = new javax.crypto.spec.DESKeySpec(life4_77);
        life12_195 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life9_155)[1])))).generateSecret(((java.security.spec.KeySpec)(life11_188)));
        life13_200 = ((javax.crypto.Cipher)((life9_155)[0]));
        ((javax.crypto.Cipher)(life13_200)).init(((int)(2)), ((java.security.Key)(life12_195)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life9_155)[2])))));
        life10_212 = ((javax.crypto.Cipher)(life13_200)).doFinal(((byte[])(life7_146)));
    } catch (java.lang.Exception life11_214) {
        throw new java.lang.RuntimeException("moom/nv", life11_214);
    }
        life11_290 = (((((((((((long) (life10_212)[0]) & 255L) << 56) | ((((long) (life10_212)[1]) & 255L) << 48)) | ((((long) (life10_212)[2]) & 255L) << 40)) | ((((long) (life10_212)[3]) & 255L) << 32)) | ((((long) (life10_212)[4]) & 255L) << 24)) | ((((long) (life10_212)[5]) & 255L) << 16)) | ((((long) (life10_212)[6]) & 255L) << 8)) | (((long) (life10_212)[7]) & 255L));
        (net.minecraft.client.renderer.entity.RenderItem.q)[life3_8] = java.lang.Long.valueOf(((long)(life11_290)));
    }
    return ((java.lang.Long)((net.minecraft.client.renderer.entity.RenderItem.q)[life3_8])).longValue();
}


private static long b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    long local7 = net.minecraft.client.renderer.entity.RenderItem.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local9 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Long.TYPE)), ((java.lang.Object)(java.lang.Long.valueOf(((long)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local9)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public void a(net.minecraft.client.gui.FontRenderer p0, net.minecraft.item.ItemStack p1, float p2, float p3, java.lang.String p4) { __sourceHandlerCall_de235361a69aab351071(this, p0, p1, p2, p3, p4); }


private void a(moom.lw p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8) {
long local10 = (net.minecraft.client.renderer.entity.RenderItem.l ^ 38419717204765L);
    ((moom.lw)(p0)).a(((int)(__sourceIntrinsic_bdd7d5f4a4ca_originalDynamicSite1833_1(26029, (8479802630105788264L ^ local10)))), ((moom.oD)(moom.oB.h)));
    ((moom.lw)(((moom.lw)(((moom.lw)(p0)).a(((double)(((double) p1))), ((double)(((double) p2))), ((double)(0x0.0p0d))))).a(((int)(p5)), ((int)(p6)), ((int)(p7)), ((int)(p8))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(p0)).a(((double)(((double) p1))), ((double)(((double) (p2 + p4)))), ((double)(0x0.0p0d))))).a(((int)(p5)), ((int)(p6)), ((int)(p7)), ((int)(p8))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(p0)).a(((double)(((double) (p1 + p3)))), ((double)(((double) (p2 + p4)))), ((double)(0x0.0p0d))))).a(((int)(p5)), ((int)(p6)), ((int)(p7)), ((int)(p8))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(p0)).a(((double)(((double) (p1 + p3)))), ((double)(((double) p2))), ((double)(0x0.0p0d))))).a(((int)(p5)), ((int)(p6)), ((int)(p7)), ((int)(p8))))).c__Void();
    ((net.minecraft.client.renderer.Tessellator)(net.minecraft.client.renderer.Tessellator.a())).a__Void();
    return;
}


private void a(moom.lw p0, float p1, float p2, int p3, int p4, int p5, int p6, int p7, int p8) {
long local10 = (net.minecraft.client.renderer.entity.RenderItem.l ^ 49201525392099L);
    ((moom.lw)(p0)).a(((int)(__sourceIntrinsic_ecb3fb6c96d3_originalDynamicSite1834_1(13865, (6552106594281100563L ^ local10)))), ((moom.oD)(moom.oB.h)));
    ((moom.lw)(((moom.lw)(((moom.lw)(p0)).a(((double)(((double) p1))), ((double)(((double) p2))), ((double)(0x0.0p0d))))).a(((int)(p5)), ((int)(p6)), ((int)(p7)), ((int)(p8))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(p0)).a(((double)(((double) p1))), ((double)(((double) (p2 + ((float) p4))))), ((double)(0x0.0p0d))))).a(((int)(p5)), ((int)(p6)), ((int)(p7)), ((int)(p8))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(p0)).a(((double)(((double) (p1 + ((float) p3))))), ((double)(((double) (p2 + ((float) p4))))), ((double)(0x0.0p0d))))).a(((int)(p5)), ((int)(p6)), ((int)(p7)), ((int)(p8))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(p0)).a(((double)(((double) (p1 + ((float) p3))))), ((double)(((double) p2))), ((double)(0x0.0p0d))))).a(((int)(p5)), ((int)(p6)), ((int)(p7)), ((int)(p8))))).c__Void();
    ((net.minecraft.client.renderer.Tessellator)(net.minecraft.client.renderer.Tessellator.a())).a__Void();
    return;
}


private void a__Void() {
((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bU)), ((java.lang.String)("anvil_intact")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bU)), ((int)(1)), ((java.lang.String)("anvil_slightly_damaged")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bU)), ((int)(2)), ((java.lang.String)("anvil_very_damaged")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.cc)), ((int)(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.BLACK)).a())), ((java.lang.String)("black_carpet")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.cc)), ((int)(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.BLUE)).a())), ((java.lang.String)("blue_carpet")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.cc)), ((int)(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.BROWN)).a())), ((java.lang.String)("brown_carpet")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.cc)), ((int)(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.CYAN)).a())), ((java.lang.String)("cyan_carpet")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.cc)), ((int)(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.GRAY)).a())), ((java.lang.String)("gray_carpet")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.cc)), ((int)(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.GREEN)).a())), ((java.lang.String)("green_carpet")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.cc)), ((int)(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.LIGHT_BLUE)).a())), ((java.lang.String)("light_blue_carpet")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.cc)), ((int)(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.LIME)).a())), ((java.lang.String)("lime_carpet")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.cc)), ((int)(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.MAGENTA)).a())), ((java.lang.String)("magenta_carpet")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.cc)), ((int)(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.ORANGE)).a())), ((java.lang.String)("orange_carpet")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.cc)), ((int)(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.PINK)).a())), ((java.lang.String)("pink_carpet")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.cc)), ((int)(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.PURPLE)).a())), ((java.lang.String)("purple_carpet")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.cc)), ((int)(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.RED)).a())), ((java.lang.String)("red_carpet")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.cc)), ((int)(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.SILVER)).a())), ((java.lang.String)("silver_carpet")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.cc)), ((int)(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.WHITE)).a())), ((java.lang.String)("white_carpet")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.cc)), ((int)(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.YELLOW)).a())), ((java.lang.String)("yellow_carpet")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bO)), ((int)(((moom.at)(moom.at.MOSSY)).a())), ((java.lang.String)("mossy_cobblestone_wall")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bO)), ((int)(((moom.at)(moom.at.NORMAL)).a())), ((java.lang.String)("cobblestone_wall")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.d)), ((int)(((net.minecraft.block.BlockDirt$DirtType)(net.minecraft.block.BlockDirt$DirtType.COARSE_DIRT)).a())), ((java.lang.String)("coarse_dirt")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.d)), ((int)(((net.minecraft.block.BlockDirt$DirtType)(net.minecraft.block.BlockDirt$DirtType.DIRT)).a())), ((java.lang.String)("dirt")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.d)), ((int)(((net.minecraft.block.BlockDirt$DirtType)(net.minecraft.block.BlockDirt$DirtType.PODZOL)).a())), ((java.lang.String)("podzol")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.cj)), ((int)(((net.minecraft.block.BlockDoublePlant$EnumPlantType)(net.minecraft.block.BlockDoublePlant$EnumPlantType.FERN)).a())), ((java.lang.String)("double_fern")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.cj)), ((int)(((net.minecraft.block.BlockDoublePlant$EnumPlantType)(net.minecraft.block.BlockDoublePlant$EnumPlantType.GRASS)).a())), ((java.lang.String)("double_grass")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.cj)), ((int)(((net.minecraft.block.BlockDoublePlant$EnumPlantType)(net.minecraft.block.BlockDoublePlant$EnumPlantType.PAEONIA)).a())), ((java.lang.String)("paeonia")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.cj)), ((int)(((net.minecraft.block.BlockDoublePlant$EnumPlantType)(net.minecraft.block.BlockDoublePlant$EnumPlantType.ROSE)).a())), ((java.lang.String)("double_rose")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.cj)), ((int)(((net.minecraft.block.BlockDoublePlant$EnumPlantType)(net.minecraft.block.BlockDoublePlant$EnumPlantType.SUNFLOWER)).a())), ((java.lang.String)("sunflower")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.cj)), ((int)(((net.minecraft.block.BlockDoublePlant$EnumPlantType)(net.minecraft.block.BlockDoublePlant$EnumPlantType.SYRINGA)).a())), ((java.lang.String)("syringa")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.t)), ((int)(((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.BIRCH)).a())), ((java.lang.String)("birch_leaves")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.t)), ((int)(((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.JUNGLE)).a())), ((java.lang.String)("jungle_leaves")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.t)), ((int)(((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.OAK)).a())), ((java.lang.String)("oak_leaves")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.t)), ((int)(((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.SPRUCE)).a())), ((java.lang.String)("spruce_leaves")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.u)), ((int)((((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.ACACIA)).a() - 4))), ((java.lang.String)("acacia_leaves")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.u)), ((int)((((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.DARK_OAK)).a() - 4))), ((java.lang.String)("dark_oak_leaves")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.r)), ((int)(((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.BIRCH)).a())), ((java.lang.String)("birch_log")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.r)), ((int)(((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.JUNGLE)).a())), ((java.lang.String)("jungle_log")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.r)), ((int)(((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.OAK)).a())), ((java.lang.String)("oak_log")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.r)), ((int)(((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.SPRUCE)).a())), ((java.lang.String)("spruce_log")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.s)), ((int)((((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.ACACIA)).a() - 4))), ((java.lang.String)("acacia_log")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.s)), ((int)((((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.DARK_OAK)).a() - 4))), ((java.lang.String)("dark_oak_log")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a4)), ((int)(((net.minecraft.block.BlockSilverfish$EnumType)(net.minecraft.block.BlockSilverfish$EnumType.CHISELED_STONEBRICK)).a())), ((java.lang.String)("chiseled_brick_monster_egg")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a4)), ((int)(((net.minecraft.block.BlockSilverfish$EnumType)(net.minecraft.block.BlockSilverfish$EnumType.COBBLESTONE)).a())), ((java.lang.String)("cobblestone_monster_egg")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a4)), ((int)(((net.minecraft.block.BlockSilverfish$EnumType)(net.minecraft.block.BlockSilverfish$EnumType.CRACKED_STONEBRICK)).a())), ((java.lang.String)("cracked_brick_monster_egg")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a4)), ((int)(((net.minecraft.block.BlockSilverfish$EnumType)(net.minecraft.block.BlockSilverfish$EnumType.MOSSY_STONEBRICK)).a())), ((java.lang.String)("mossy_brick_monster_egg")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a4)), ((int)(((net.minecraft.block.BlockSilverfish$EnumType)(net.minecraft.block.BlockSilverfish$EnumType.STONE)).a())), ((java.lang.String)("stone_monster_egg")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a4)), ((int)(((net.minecraft.block.BlockSilverfish$EnumType)(net.minecraft.block.BlockSilverfish$EnumType.STONEBRICK)).a())), ((java.lang.String)("stone_brick_monster_egg")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)), ((int)(((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.ACACIA)).a())), ((java.lang.String)("acacia_planks")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)), ((int)(((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.BIRCH)).a())), ((java.lang.String)("birch_planks")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)), ((int)(((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.DARK_OAK)).a())), ((java.lang.String)("dark_oak_planks")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)), ((int)(((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.JUNGLE)).a())), ((java.lang.String)("jungle_planks")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)), ((int)(((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.OAK)).a())), ((java.lang.String)("oak_planks")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)), ((int)(((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.SPRUCE)).a())), ((java.lang.String)("spruce_planks")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.cm)), ((int)(((net.minecraft.block.BlockPrismarine$EnumType)(net.minecraft.block.BlockPrismarine$EnumType.BRICKS)).a())), ((java.lang.String)("prismarine_bricks")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.cm)), ((int)(((net.minecraft.block.BlockPrismarine$EnumType)(net.minecraft.block.BlockPrismarine$EnumType.DARK)).a())), ((java.lang.String)("dark_prismarine")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.cm)), ((int)(((net.minecraft.block.BlockPrismarine$EnumType)(net.minecraft.block.BlockPrismarine$EnumType.ROUGH)).a())), ((java.lang.String)("prismarine")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b5)), ((int)(((net.minecraft.block.BlockQuartz$EnumType)(net.minecraft.block.BlockQuartz$EnumType.CHISELED)).a())), ((java.lang.String)("chiseled_quartz_block")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b5)), ((int)(((net.minecraft.block.BlockQuartz$EnumType)(net.minecraft.block.BlockQuartz$EnumType.DEFAULT)).a())), ((java.lang.String)("quartz_block")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b5)), ((int)(((net.minecraft.block.BlockQuartz$EnumType)(net.minecraft.block.BlockQuartz$EnumType.LINES_Y)).a())), ((java.lang.String)("quartz_column")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.O)), ((int)(((net.minecraft.block.BlockFlower$EnumFlowerType)(net.minecraft.block.BlockFlower$EnumFlowerType.ALLIUM)).a())), ((java.lang.String)("allium")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.O)), ((int)(((net.minecraft.block.BlockFlower$EnumFlowerType)(net.minecraft.block.BlockFlower$EnumFlowerType.BLUE_ORCHID)).a())), ((java.lang.String)("blue_orchid")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.O)), ((int)(((net.minecraft.block.BlockFlower$EnumFlowerType)(net.minecraft.block.BlockFlower$EnumFlowerType.HOUSTONIA)).a())), ((java.lang.String)("houstonia")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.O)), ((int)(((net.minecraft.block.BlockFlower$EnumFlowerType)(net.minecraft.block.BlockFlower$EnumFlowerType.ORANGE_TULIP)).a())), ((java.lang.String)("orange_tulip")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.O)), ((int)(((net.minecraft.block.BlockFlower$EnumFlowerType)(net.minecraft.block.BlockFlower$EnumFlowerType.OXEYE_DAISY)).a())), ((java.lang.String)("oxeye_daisy")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.O)), ((int)(((net.minecraft.block.BlockFlower$EnumFlowerType)(net.minecraft.block.BlockFlower$EnumFlowerType.PINK_TULIP)).a())), ((java.lang.String)("pink_tulip")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.O)), ((int)(((net.minecraft.block.BlockFlower$EnumFlowerType)(net.minecraft.block.BlockFlower$EnumFlowerType.POPPY)).a())), ((java.lang.String)("poppy")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.O)), ((int)(((net.minecraft.block.BlockFlower$EnumFlowerType)(net.minecraft.block.BlockFlower$EnumFlowerType.RED_TULIP)).a())), ((java.lang.String)("red_tulip")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.O)), ((int)(((net.minecraft.block.BlockFlower$EnumFlowerType)(net.minecraft.block.BlockFlower$EnumFlowerType.WHITE_TULIP)).a())), ((java.lang.String)("white_tulip")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.m)), ((int)(((moom.ab)(moom.ab.RED_SAND)).a())), ((java.lang.String)("red_sand")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.m)), ((int)(((moom.ab)(moom.ab.SAND)).a())), ((java.lang.String)("sand")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)), ((int)(((moom.ac)(moom.ac.CHISELED)).a())), ((java.lang.String)("chiseled_sandstone")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)), ((int)(((moom.ac)(moom.ac.DEFAULT)).a())), ((java.lang.String)("sandstone")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)), ((int)(((moom.ac)(moom.ac.SMOOTH)).a())), ((java.lang.String)("smooth_sandstone")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.cq)), ((int)(((moom.Y)(moom.Y.CHISELED)).a())), ((java.lang.String)("chiseled_red_sandstone")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.cq)), ((int)(((moom.Y)(moom.Y.DEFAULT)).a())), ((java.lang.String)("red_sandstone")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.cq)), ((int)(((moom.Y)(moom.Y.SMOOTH)).a())), ((java.lang.String)("smooth_red_sandstone")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.g)), ((int)(((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.ACACIA)).a())), ((java.lang.String)("acacia_sapling")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.g)), ((int)(((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.BIRCH)).a())), ((java.lang.String)("birch_sapling")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.g)), ((int)(((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.DARK_OAK)).a())), ((java.lang.String)("dark_oak_sapling")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.g)), ((int)(((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.JUNGLE)).a())), ((java.lang.String)("jungle_sapling")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.g)), ((int)(((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.OAK)).a())), ((java.lang.String)("oak_sapling")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.g)), ((int)(((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.SPRUCE)).a())), ((java.lang.String)("spruce_sapling")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.v)), ((int)(0)), ((java.lang.String)("sponge")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.v)), ((int)(1)), ((java.lang.String)("sponge_wet")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ck)), ((int)(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.BLACK)).a())), ((java.lang.String)("black_stained_glass")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ck)), ((int)(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.BLUE)).a())), ((java.lang.String)("blue_stained_glass")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ck)), ((int)(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.BROWN)).a())), ((java.lang.String)("brown_stained_glass")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ck)), ((int)(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.CYAN)).a())), ((java.lang.String)("cyan_stained_glass")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ck)), ((int)(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.GRAY)).a())), ((java.lang.String)("gray_stained_glass")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ck)), ((int)(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.GREEN)).a())), ((java.lang.String)("green_stained_glass")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ck)), ((int)(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.LIGHT_BLUE)).a())), ((java.lang.String)("light_blue_stained_glass")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ck)), ((int)(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.LIME)).a())), ((java.lang.String)("lime_stained_glass")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ck)), ((int)(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.MAGENTA)).a())), ((java.lang.String)("magenta_stained_glass")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ck)), ((int)(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.ORANGE)).a())), ((java.lang.String)("orange_stained_glass")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ck)), ((int)(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.PINK)).a())), ((java.lang.String)("pink_stained_glass")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ck)), ((int)(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.PURPLE)).a())), ((java.lang.String)("purple_stained_glass")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ck)), ((int)(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.RED)).a())), ((java.lang.String)("red_stained_glass")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ck)), ((int)(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.SILVER)).a())), ((java.lang.String)("silver_stained_glass")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ck)), ((int)(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.WHITE)).a())), ((java.lang.String)("white_stained_glass")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ck)), ((int)(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.YELLOW)).a())), ((java.lang.String)("yellow_stained_glass")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.cl)), ((int)(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.BLACK)).a())), ((java.lang.String)("black_stained_glass_pane")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.cl)), ((int)(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.BLUE)).a())), ((java.lang.String)("blue_stained_glass_pane")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.cl)), ((int)(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.BROWN)).a())), ((java.lang.String)("brown_stained_glass_pane")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.cl)), ((int)(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.CYAN)).a())), ((java.lang.String)("cyan_stained_glass_pane")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.cl)), ((int)(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.GRAY)).a())), ((java.lang.String)("gray_stained_glass_pane")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.cl)), ((int)(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.GREEN)).a())), ((java.lang.String)("green_stained_glass_pane")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.cl)), ((int)(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.LIGHT_BLUE)).a())), ((java.lang.String)("light_blue_stained_glass_pane")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.cl)), ((int)(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.LIME)).a())), ((java.lang.String)("lime_stained_glass_pane")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.cl)), ((int)(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.MAGENTA)).a())), ((java.lang.String)("magenta_stained_glass_pane")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.cl)), ((int)(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.ORANGE)).a())), ((java.lang.String)("orange_stained_glass_pane")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.cl)), ((int)(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.PINK)).a())), ((java.lang.String)("pink_stained_glass_pane")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.cl)), ((int)(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.PURPLE)).a())), ((java.lang.String)("purple_stained_glass_pane")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.cl)), ((int)(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.RED)).a())), ((java.lang.String)("red_stained_glass_pane")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.cl)), ((int)(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.SILVER)).a())), ((java.lang.String)("silver_stained_glass_pane")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.cl)), ((int)(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.WHITE)).a())), ((java.lang.String)("white_stained_glass_pane")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.cl)), ((int)(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.YELLOW)).a())), ((java.lang.String)("yellow_stained_glass_pane")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b9)), ((int)(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.BLACK)).a())), ((java.lang.String)("black_stained_hardened_clay")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b9)), ((int)(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.BLUE)).a())), ((java.lang.String)("blue_stained_hardened_clay")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b9)), ((int)(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.BROWN)).a())), ((java.lang.String)("brown_stained_hardened_clay")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b9)), ((int)(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.CYAN)).a())), ((java.lang.String)("cyan_stained_hardened_clay")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b9)), ((int)(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.GRAY)).a())), ((java.lang.String)("gray_stained_hardened_clay")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b9)), ((int)(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.GREEN)).a())), ((java.lang.String)("green_stained_hardened_clay")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b9)), ((int)(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.LIGHT_BLUE)).a())), ((java.lang.String)("light_blue_stained_hardened_clay")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b9)), ((int)(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.LIME)).a())), ((java.lang.String)("lime_stained_hardened_clay")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b9)), ((int)(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.MAGENTA)).a())), ((java.lang.String)("magenta_stained_hardened_clay")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b9)), ((int)(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.ORANGE)).a())), ((java.lang.String)("orange_stained_hardened_clay")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b9)), ((int)(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.PINK)).a())), ((java.lang.String)("pink_stained_hardened_clay")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b9)), ((int)(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.PURPLE)).a())), ((java.lang.String)("purple_stained_hardened_clay")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b9)), ((int)(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.RED)).a())), ((java.lang.String)("red_stained_hardened_clay")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b9)), ((int)(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.SILVER)).a())), ((java.lang.String)("silver_stained_hardened_clay")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b9)), ((int)(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.WHITE)).a())), ((java.lang.String)("white_stained_hardened_clay")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b9)), ((int)(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.YELLOW)).a())), ((java.lang.String)("yellow_stained_hardened_clay")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b)), ((int)(((net.minecraft.block.BlockStone$EnumType)(net.minecraft.block.BlockStone$EnumType.ANDESITE)).a())), ((java.lang.String)("andesite")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b)), ((int)(((net.minecraft.block.BlockStone$EnumType)(net.minecraft.block.BlockStone$EnumType.ANDESITE_SMOOTH)).a())), ((java.lang.String)("andesite_smooth")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b)), ((int)(((net.minecraft.block.BlockStone$EnumType)(net.minecraft.block.BlockStone$EnumType.DIORITE)).a())), ((java.lang.String)("diorite")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b)), ((int)(((net.minecraft.block.BlockStone$EnumType)(net.minecraft.block.BlockStone$EnumType.DIORITE_SMOOTH)).a())), ((java.lang.String)("diorite_smooth")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b)), ((int)(((net.minecraft.block.BlockStone$EnumType)(net.minecraft.block.BlockStone$EnumType.GRANITE)).a())), ((java.lang.String)("granite")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b)), ((int)(((net.minecraft.block.BlockStone$EnumType)(net.minecraft.block.BlockStone$EnumType.GRANITE_SMOOTH)).a())), ((java.lang.String)("granite_smooth")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b)), ((int)(((net.minecraft.block.BlockStone$EnumType)(net.minecraft.block.BlockStone$EnumType.STONE)).a())), ((java.lang.String)("stone")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a5)), ((int)(((net.minecraft.block.BlockStoneBrick$EnumType)(net.minecraft.block.BlockStoneBrick$EnumType.CRACKED)).a())), ((java.lang.String)("cracked_stonebrick")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a5)), ((int)(((net.minecraft.block.BlockStoneBrick$EnumType)(net.minecraft.block.BlockStoneBrick$EnumType.DEFAULT)).a())), ((java.lang.String)("stonebrick")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a5)), ((int)(((net.minecraft.block.BlockStoneBrick$EnumType)(net.minecraft.block.BlockStoneBrick$EnumType.CHISELED)).a())), ((java.lang.String)("chiseled_stonebrick")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a5)), ((int)(((net.minecraft.block.BlockStoneBrick$EnumType)(net.minecraft.block.BlockStoneBrick$EnumType.MOSSY)).a())), ((java.lang.String)("mossy_stonebrick")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.U)), ((int)(((net.minecraft.block.BlockStoneSlab$EnumType)(net.minecraft.block.BlockStoneSlab$EnumType.BRICK)).a())), ((java.lang.String)("brick_slab")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.U)), ((int)(((net.minecraft.block.BlockStoneSlab$EnumType)(net.minecraft.block.BlockStoneSlab$EnumType.COBBLESTONE)).a())), ((java.lang.String)("cobblestone_slab")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.U)), ((int)(((net.minecraft.block.BlockStoneSlab$EnumType)(net.minecraft.block.BlockStoneSlab$EnumType.WOOD)).a())), ((java.lang.String)("old_wood_slab")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.U)), ((int)(((net.minecraft.block.BlockStoneSlab$EnumType)(net.minecraft.block.BlockStoneSlab$EnumType.NETHERBRICK)).a())), ((java.lang.String)("nether_brick_slab")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.U)), ((int)(((net.minecraft.block.BlockStoneSlab$EnumType)(net.minecraft.block.BlockStoneSlab$EnumType.QUARTZ)).a())), ((java.lang.String)("quartz_slab")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.U)), ((int)(((net.minecraft.block.BlockStoneSlab$EnumType)(net.minecraft.block.BlockStoneSlab$EnumType.SAND)).a())), ((java.lang.String)("sandstone_slab")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.U)), ((int)(((net.minecraft.block.BlockStoneSlab$EnumType)(net.minecraft.block.BlockStoneSlab$EnumType.SMOOTHBRICK)).a())), ((java.lang.String)("stone_brick_slab")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.U)), ((int)(((net.minecraft.block.BlockStoneSlab$EnumType)(net.minecraft.block.BlockStoneSlab$EnumType.STONE)).a())), ((java.lang.String)("stone_slab")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ct)), ((int)(((moom.aq)(moom.aq.RED_SANDSTONE)).a())), ((java.lang.String)("red_sandstone_slab")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.H)), ((int)(((moom.ar)(moom.ar.DEAD_BUSH)).a())), ((java.lang.String)("dead_bush")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.H)), ((int)(((moom.ar)(moom.ar.FERN)).a())), ((java.lang.String)("fern")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.H)), ((int)(((moom.ar)(moom.ar.GRASS)).a())), ((java.lang.String)("tall_grass")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bB)), ((int)(((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.ACACIA)).a())), ((java.lang.String)("acacia_slab")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bB)), ((int)(((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.BIRCH)).a())), ((java.lang.String)("birch_slab")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bB)), ((int)(((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.DARK_OAK)).a())), ((java.lang.String)("dark_oak_slab")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bB)), ((int)(((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.JUNGLE)).a())), ((java.lang.String)("jungle_slab")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bB)), ((int)(((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.OAK)).a())), ((java.lang.String)("oak_slab")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bB)), ((int)(((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.SPRUCE)).a())), ((java.lang.String)("spruce_slab")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.L)), ((int)(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.BLACK)).a())), ((java.lang.String)("black_wool")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.L)), ((int)(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.BLUE)).a())), ((java.lang.String)("blue_wool")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.L)), ((int)(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.BROWN)).a())), ((java.lang.String)("brown_wool")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.L)), ((int)(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.CYAN)).a())), ((java.lang.String)("cyan_wool")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.L)), ((int)(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.GRAY)).a())), ((java.lang.String)("gray_wool")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.L)), ((int)(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.GREEN)).a())), ((java.lang.String)("green_wool")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.L)), ((int)(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.LIGHT_BLUE)).a())), ((java.lang.String)("light_blue_wool")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.L)), ((int)(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.LIME)).a())), ((java.lang.String)("lime_wool")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.L)), ((int)(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.MAGENTA)).a())), ((java.lang.String)("magenta_wool")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.L)), ((int)(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.ORANGE)).a())), ((java.lang.String)("orange_wool")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.L)), ((int)(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.PINK)).a())), ((java.lang.String)("pink_wool")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.L)), ((int)(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.PURPLE)).a())), ((java.lang.String)("purple_wool")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.L)), ((int)(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.RED)).a())), ((java.lang.String)("red_wool")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.L)), ((int)(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.SILVER)).a())), ((java.lang.String)("silver_wool")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.L)), ((int)(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.WHITE)).a())), ((java.lang.String)("white_wool")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.L)), ((int)(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.YELLOW)).a())), ((java.lang.String)("yellow_wool")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.cg)), ((java.lang.String)("acacia_stairs")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b7)), ((java.lang.String)("activator_rail")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bN)), ((java.lang.String)("beacon")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.h)), ((java.lang.String)("bedrock")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bK)), ((java.lang.String)("birch_stairs")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.X)), ((java.lang.String)("bookshelf")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.V)), ((java.lang.String)("brick_block")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.V)), ((java.lang.String)("brick_block")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bj)), ((java.lang.String)("brick_stairs")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.P)), ((java.lang.String)("brown_mushroom")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aK)), ((java.lang.String)("cactus")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aL)), ((java.lang.String)("clay")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ce)), ((java.lang.String)("coal_block")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.q)), ((java.lang.String)("coal_ore")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)), ((java.lang.String)("cobblestone")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ai)), ((java.lang.String)("crafting_table")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ch)), ((java.lang.String)("dark_oak_stairs")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b0)), ((java.lang.String)("daylight_detector")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.I)), ((java.lang.String)("dead_bush")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.E)), ((java.lang.String)("detector_rail")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ah)), ((java.lang.String)("diamond_block")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ag)), ((java.lang.String)("diamond_ore")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.z)), ((java.lang.String)("dispenser")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b8)), ((java.lang.String)("dropper")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bI)), ((java.lang.String)("emerald_block")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bE)), ((java.lang.String)("emerald_ore")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.br)), ((java.lang.String)("enchanting_table")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bv)), ((java.lang.String)("end_portal_frame")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bw)), ((java.lang.String)("end_stone")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aO)), ((java.lang.String)("oak_fence")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aP)), ((java.lang.String)("spruce_fence")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aQ)), ((java.lang.String)("birch_fence")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aR)), ((java.lang.String)("jungle_fence")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aS)), ((java.lang.String)("dark_oak_fence")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aT)), ((java.lang.String)("acacia_fence")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bd)), ((java.lang.String)("oak_fence_gate")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.be)), ((java.lang.String)("spruce_fence_gate")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bf)), ((java.lang.String)("birch_fence_gate")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bg)), ((java.lang.String)("jungle_fence_gate")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bh)), ((java.lang.String)("dark_oak_fence_gate")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bi)), ((java.lang.String)("acacia_fence_gate")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.al)), ((java.lang.String)("furnace")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.w)), ((java.lang.String)("glass")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a9)), ((java.lang.String)("glass_pane")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aX)), ((java.lang.String)("glowstone")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.D)), ((java.lang.String)("golden_rail")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.R)), ((java.lang.String)("gold_block")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.o)), ((java.lang.String)("gold_ore")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.c)), ((java.lang.String)("grass")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.n)), ((java.lang.String)("gravel")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.cd)), ((java.lang.String)("hardened_clay")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.cb)), ((java.lang.String)("hay_block")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bX)), ((java.lang.String)("heavy_weighted_pressure_plate")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b4)), ((java.lang.String)("hopper")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aI)), ((java.lang.String)("ice")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a8)), ((java.lang.String)("iron_bars")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.S)), ((java.lang.String)("iron_block")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.p)), ((java.lang.String)("iron_ore")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ca)), ((java.lang.String)("iron_trapdoor")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aN)), ((java.lang.String)("jukebox")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bL)), ((java.lang.String)("jungle_stairs")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.au)), ((java.lang.String)("ladder")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.y)), ((java.lang.String)("lapis_block")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.x)), ((java.lang.String)("lapis_ore")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ay)), ((java.lang.String)("lever")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bW)), ((java.lang.String)("light_weighted_pressure_plate")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aZ)), ((java.lang.String)("lit_pumpkin")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a_)), ((java.lang.String)("melon_block")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.Y)), ((java.lang.String)("mossy_cobblestone")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bl)), ((java.lang.String)("mycelium")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aV)), ((java.lang.String)("netherrack")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)), ((java.lang.String)("nether_brick")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bo)), ((java.lang.String)("nether_brick_fence")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bp)), ((java.lang.String)("nether_brick_stairs")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.B)), ((java.lang.String)("noteblock")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ad)), ((java.lang.String)("oak_stairs")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.Z)), ((java.lang.String)("obsidian")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.cf)), ((java.lang.String)("packed_ice")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.J)), ((java.lang.String)("piston")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aU)), ((java.lang.String)("pumpkin")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b3)), ((java.lang.String)("quartz_ore")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b6)), ((java.lang.String)("quartz_stairs")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.av)), ((java.lang.String)("rail")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b2)), ((java.lang.String)("redstone_block")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.by)), ((java.lang.String)("redstone_lamp")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aC)), ((java.lang.String)("redstone_ore")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aF)), ((java.lang.String)("redstone_torch")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.Q)), ((java.lang.String)("red_mushroom")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bD)), ((java.lang.String)("sandstone_stairs")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.cr)), ((java.lang.String)("red_sandstone_stairs")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.cn)), ((java.lang.String)("sea_lantern")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ci)), ((java.lang.String)("slime")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aJ)), ((java.lang.String)("snow")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aH)), ((java.lang.String)("snow_layer")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aW)), ((java.lang.String)("soul_sand")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bJ)), ((java.lang.String)("spruce_stairs")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.F)), ((java.lang.String)("sticky_piston")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bk)), ((java.lang.String)("stone_brick_stairs")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aG)), ((java.lang.String)("stone_button")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.az)), ((java.lang.String)("stone_pressure_plate")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aw)), ((java.lang.String)("stone_stairs")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.W)), ((java.lang.String)("tnt")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aa)), ((java.lang.String)("torch")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a3)), ((java.lang.String)("trapdoor")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bG)), ((java.lang.String)("tripwire_hook")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bc)), ((java.lang.String)("vine")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bm)), ((java.lang.String)("waterlily")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.G)), ((java.lang.String)("web")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bS)), ((java.lang.String)("wooden_button")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aB)), ((java.lang.String)("wooden_pressure_plate")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.N)), ((int)(((net.minecraft.block.BlockFlower$EnumFlowerType)(net.minecraft.block.BlockFlower$EnumFlowerType.DANDELION)).a())), ((java.lang.String)("dandelion")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ae)), ((java.lang.String)("chest")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bV)), ((java.lang.String)("trapped_chest")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bF)), ((java.lang.String)("ender_chest")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.a)), ((java.lang.String)("iron_shovel")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.b)), ((java.lang.String)("iron_pickaxe")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.c)), ((java.lang.String)("iron_axe")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.d)), ((java.lang.String)("flint_and_steel")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.e)), ((java.lang.String)("apple")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.f)), ((int)(0)), ((java.lang.String)("bow")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.f)), ((int)(1)), ((java.lang.String)("bow_pulling_0")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.f)), ((int)(2)), ((java.lang.String)("bow_pulling_1")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.f)), ((int)(3)), ((java.lang.String)("bow_pulling_2")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.g)), ((java.lang.String)("arrow")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.h)), ((int)(0)), ((java.lang.String)("coal")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.h)), ((int)(1)), ((java.lang.String)("charcoal")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.i)), ((java.lang.String)("diamond")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.j)), ((java.lang.String)("iron_ingot")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.k)), ((java.lang.String)("gold_ingot")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.l)), ((java.lang.String)("iron_sword")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.m)), ((java.lang.String)("wooden_sword")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.n)), ((java.lang.String)("wooden_shovel")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.o)), ((java.lang.String)("wooden_pickaxe")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.p)), ((java.lang.String)("wooden_axe")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.q)), ((java.lang.String)("stone_sword")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.r)), ((java.lang.String)("stone_shovel")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.s)), ((java.lang.String)("stone_pickaxe")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.t)), ((java.lang.String)("stone_axe")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.u)), ((java.lang.String)("diamond_sword")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.v)), ((java.lang.String)("diamond_shovel")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.w)), ((java.lang.String)("diamond_pickaxe")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.x)), ((java.lang.String)("diamond_axe")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.y)), ((java.lang.String)("stick")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.z)), ((java.lang.String)("bowl")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.A)), ((java.lang.String)("mushroom_stew")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.B)), ((java.lang.String)("golden_sword")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.C)), ((java.lang.String)("golden_shovel")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.D)), ((java.lang.String)("golden_pickaxe")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.E)), ((java.lang.String)("golden_axe")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.F)), ((java.lang.String)("string")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.G)), ((java.lang.String)("feather")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.H)), ((java.lang.String)("gunpowder")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.I)), ((java.lang.String)("wooden_hoe")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.J)), ((java.lang.String)("stone_hoe")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.K)), ((java.lang.String)("iron_hoe")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.L)), ((java.lang.String)("diamond_hoe")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.M)), ((java.lang.String)("golden_hoe")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.N)), ((java.lang.String)("wheat_seeds")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.O)), ((java.lang.String)("wheat")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.P)), ((java.lang.String)("bread")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.Q)), ((java.lang.String)("leather_helmet")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.R)), ((java.lang.String)("leather_chestplate")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.S)), ((java.lang.String)("leather_leggings")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.T)), ((java.lang.String)("leather_boots")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.U)), ((java.lang.String)("chainmail_helmet")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.V)), ((java.lang.String)("chainmail_chestplate")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.W)), ((java.lang.String)("chainmail_leggings")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.X)), ((java.lang.String)("chainmail_boots")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.Y)), ((java.lang.String)("iron_helmet")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.Z)), ((java.lang.String)("iron_chestplate")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.aa)), ((java.lang.String)("iron_leggings")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.ab)), ((java.lang.String)("iron_boots")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.ac)), ((java.lang.String)("diamond_helmet")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.ad)), ((java.lang.String)("diamond_chestplate")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.ae)), ((java.lang.String)("diamond_leggings")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.af)), ((java.lang.String)("diamond_boots")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.ag)), ((java.lang.String)("golden_helmet")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.ah)), ((java.lang.String)("golden_chestplate")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.ai)), ((java.lang.String)("golden_leggings")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.aj)), ((java.lang.String)("golden_boots")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.ak)), ((java.lang.String)("flint")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.al)), ((java.lang.String)("porkchop")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.am)), ((java.lang.String)("cooked_porkchop")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.an)), ((java.lang.String)("painting")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.ao)), ((java.lang.String)("golden_apple")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.ao)), ((int)(1)), ((java.lang.String)("golden_apple")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.ap)), ((java.lang.String)("sign")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.aq)), ((java.lang.String)("oak_door")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.ar)), ((java.lang.String)("spruce_door")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.as)), ((java.lang.String)("birch_door")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.at)), ((java.lang.String)("jungle_door")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.au)), ((java.lang.String)("acacia_door")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.av)), ((java.lang.String)("dark_oak_door")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.aw)), ((java.lang.String)("bucket")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.ax)), ((java.lang.String)("water_bucket")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.ay)), ((java.lang.String)("lava_bucket")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.az)), ((java.lang.String)("minecart")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.aA)), ((java.lang.String)("saddle")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.aB)), ((java.lang.String)("iron_door")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.aC)), ((java.lang.String)("redstone")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.aD)), ((java.lang.String)("snowball")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.aE)), ((java.lang.String)("boat")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.aF)), ((java.lang.String)("leather")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.aG)), ((java.lang.String)("milk_bucket")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.aH)), ((java.lang.String)("brick")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.aI)), ((java.lang.String)("clay_ball")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.aJ)), ((java.lang.String)("reeds")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.aK)), ((java.lang.String)("paper")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.aL)), ((java.lang.String)("book")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.aM)), ((java.lang.String)("slime_ball")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.aN)), ((java.lang.String)("chest_minecart")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.aO)), ((java.lang.String)("furnace_minecart")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.aP)), ((java.lang.String)("egg")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.aQ)), ((java.lang.String)("compass")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.aR)), ((java.lang.String)("fishing_rod")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.aR)), ((int)(1)), ((java.lang.String)("fishing_rod_cast")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.aS)), ((java.lang.String)("clock")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.aT)), ((java.lang.String)("glowstone_dust")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.aU)), ((int)(((net.minecraft.item.ItemFishFood$FishType)(net.minecraft.item.ItemFishFood$FishType.COD)).a__Int())), ((java.lang.String)("cod")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.aU)), ((int)(((net.minecraft.item.ItemFishFood$FishType)(net.minecraft.item.ItemFishFood$FishType.SALMON)).a__Int())), ((java.lang.String)("salmon")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.aU)), ((int)(((net.minecraft.item.ItemFishFood$FishType)(net.minecraft.item.ItemFishFood$FishType.CLOWNFISH)).a__Int())), ((java.lang.String)("clownfish")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.aU)), ((int)(((net.minecraft.item.ItemFishFood$FishType)(net.minecraft.item.ItemFishFood$FishType.PUFFERFISH)).a__Int())), ((java.lang.String)("pufferfish")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.aV)), ((int)(((net.minecraft.item.ItemFishFood$FishType)(net.minecraft.item.ItemFishFood$FishType.COD)).a__Int())), ((java.lang.String)("cooked_cod")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.aV)), ((int)(((net.minecraft.item.ItemFishFood$FishType)(net.minecraft.item.ItemFishFood$FishType.SALMON)).a__Int())), ((java.lang.String)("cooked_salmon")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.aW)), ((int)(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.BLACK)).b())), ((java.lang.String)("dye_black")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.aW)), ((int)(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.RED)).b())), ((java.lang.String)("dye_red")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.aW)), ((int)(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.GREEN)).b())), ((java.lang.String)("dye_green")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.aW)), ((int)(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.BROWN)).b())), ((java.lang.String)("dye_brown")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.aW)), ((int)(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.BLUE)).b())), ((java.lang.String)("dye_blue")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.aW)), ((int)(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.PURPLE)).b())), ((java.lang.String)("dye_purple")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.aW)), ((int)(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.CYAN)).b())), ((java.lang.String)("dye_cyan")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.aW)), ((int)(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.SILVER)).b())), ((java.lang.String)("dye_silver")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.aW)), ((int)(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.GRAY)).b())), ((java.lang.String)("dye_gray")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.aW)), ((int)(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.PINK)).b())), ((java.lang.String)("dye_pink")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.aW)), ((int)(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.LIME)).b())), ((java.lang.String)("dye_lime")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.aW)), ((int)(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.YELLOW)).b())), ((java.lang.String)("dye_yellow")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.aW)), ((int)(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.LIGHT_BLUE)).b())), ((java.lang.String)("dye_light_blue")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.aW)), ((int)(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.MAGENTA)).b())), ((java.lang.String)("dye_magenta")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.aW)), ((int)(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.ORANGE)).b())), ((java.lang.String)("dye_orange")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.aW)), ((int)(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.WHITE)).b())), ((java.lang.String)("dye_white")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.aX)), ((java.lang.String)("bone")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.aY)), ((java.lang.String)("sugar")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.aZ)), ((java.lang.String)("cake")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.a0)), ((java.lang.String)("bed")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.a1)), ((java.lang.String)("repeater")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.a2)), ((java.lang.String)("cookie")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.a4)), ((java.lang.String)("shears")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.a5)), ((java.lang.String)("melon")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.a6)), ((java.lang.String)("pumpkin_seeds")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.a7)), ((java.lang.String)("melon_seeds")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.a8)), ((java.lang.String)("beef")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.a9)), ((java.lang.String)("cooked_beef")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.a_)), ((java.lang.String)("chicken")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.ba)), ((java.lang.String)("cooked_chicken")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.bd)), ((java.lang.String)("rabbit")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.be)), ((java.lang.String)("cooked_rabbit")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.bb)), ((java.lang.String)("mutton")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.bc)), ((java.lang.String)("cooked_mutton")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.bg)), ((java.lang.String)("rabbit_foot")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.bh)), ((java.lang.String)("rabbit_hide")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.bf)), ((java.lang.String)("rabbit_stew")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.bi)), ((java.lang.String)("rotten_flesh")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.bj)), ((java.lang.String)("ender_pearl")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.bk)), ((java.lang.String)("blaze_rod")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.bl)), ((java.lang.String)("ghast_tear")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.bm)), ((java.lang.String)("gold_nugget")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.bn)), ((java.lang.String)("nether_wart")));
    ((moom.ll)(this.b)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.bo)), ((net.minecraft.client.renderer.ItemMeshDefinition)(__sourceIntrinsic_b82a5b29b709_invokedynamic611_1284())));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.bp)), ((java.lang.String)("glass_bottle")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.bq)), ((java.lang.String)("spider_eye")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.br)), ((java.lang.String)("fermented_spider_eye")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.bs)), ((java.lang.String)("blaze_powder")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.bt)), ((java.lang.String)("magma_cream")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.bu)), ((java.lang.String)("brewing_stand")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.bv)), ((java.lang.String)("cauldron")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.bw)), ((java.lang.String)("ender_eye")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.bx)), ((java.lang.String)("speckled_melon")));
    ((moom.ll)(this.b)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.by)), ((net.minecraft.client.renderer.ItemMeshDefinition)(__sourceIntrinsic_b82a5b29b709_invokedynamic611_1306())));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.bz)), ((java.lang.String)("experience_bottle")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.bA)), ((java.lang.String)("fire_charge")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.bB)), ((java.lang.String)("writable_book")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.bD)), ((java.lang.String)("emerald")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.bE)), ((java.lang.String)("item_frame")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.bF)), ((java.lang.String)("flower_pot")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.bG)), ((java.lang.String)("carrot")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.bH)), ((java.lang.String)("potato")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.bI)), ((java.lang.String)("baked_potato")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.bJ)), ((java.lang.String)("poisonous_potato")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.bK)), ((java.lang.String)("map")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.bL)), ((java.lang.String)("golden_carrot")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.bM)), ((int)(0)), ((java.lang.String)("skull_skeleton")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.bM)), ((int)(1)), ((java.lang.String)("skull_wither")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.bM)), ((int)(2)), ((java.lang.String)("skull_zombie")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.bM)), ((int)(3)), ((java.lang.String)("skull_char")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.bM)), ((int)(4)), ((java.lang.String)("skull_creeper")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.bN)), ((java.lang.String)("carrot_on_a_stick")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.bO)), ((java.lang.String)("nether_star")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.bP)), ((java.lang.String)("pumpkin_pie")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.bR)), ((java.lang.String)("firework_charge")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.bT)), ((java.lang.String)("comparator")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.bU)), ((java.lang.String)("netherbrick")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.bV)), ((java.lang.String)("quartz")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.bW)), ((java.lang.String)("tnt_minecart")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.bX)), ((java.lang.String)("hopper_minecart")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.bY)), ((java.lang.String)("armor_stand")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.bZ)), ((java.lang.String)("iron_horse_armor")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.b0)), ((java.lang.String)("golden_horse_armor")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.b1)), ((java.lang.String)("diamond_horse_armor")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.b2)), ((java.lang.String)("lead")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.b3)), ((java.lang.String)("name_tag")));
    ((moom.ll)(this.b)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.ci)), ((net.minecraft.client.renderer.ItemMeshDefinition)(__sourceIntrinsic_b82a5b29b709_invokedynamic611_1374())));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.b5)), ((java.lang.String)("record_13")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.b6)), ((java.lang.String)("record_cat")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.b7)), ((java.lang.String)("record_blocks")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.b8)), ((java.lang.String)("record_chirp")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.b9)), ((java.lang.String)("record_far")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.b_)), ((java.lang.String)("record_mall")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.ca)), ((java.lang.String)("record_mellohi")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.cb)), ((java.lang.String)("record_stal")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.cc)), ((java.lang.String)("record_strad")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.cd)), ((java.lang.String)("record_ward")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.ce)), ((java.lang.String)("record_11")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.cf)), ((java.lang.String)("record_wait")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.cg)), ((java.lang.String)("prismarine_shard")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.ch)), ((java.lang.String)("prismarine_crystals")));
    ((moom.ll)(this.b)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.bS)), ((net.minecraft.client.renderer.ItemMeshDefinition)(__sourceIntrinsic_b82a5b29b709_invokedynamic611_1406())));
    ((moom.ll)(this.b)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.a3)), ((net.minecraft.client.renderer.ItemMeshDefinition)(__sourceIntrinsic_b82a5b29b709_invokedynamic611_1410())));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bM)), ((java.lang.String)("command_block")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.bQ)), ((java.lang.String)("fireworks")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.b4)), ((java.lang.String)("command_block_minecart")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b_)), ((java.lang.String)("barrier")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ac)), ((java.lang.String)("mob_spawner")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.bC)), ((java.lang.String)("written_book")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a6)), ((int)(((net.minecraft.block.BlockHugeMushroom$EnumType)(net.minecraft.block.BlockHugeMushroom$EnumType.ALL_INSIDE)).a())), ((java.lang.String)("brown_mushroom_block")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a7)), ((int)(((net.minecraft.block.BlockHugeMushroom$EnumType)(net.minecraft.block.BlockHugeMushroom$EnumType.ALL_INSIDE)).a())), ((java.lang.String)("red_mushroom_block")));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bx)), ((java.lang.String)("dragon_egg")));
    return;
}


protected void a(net.minecraft.item.Item p0, int p1, java.lang.String p2) {
((moom.ll)(this.b)).a(((net.minecraft.item.Item)(p0)), ((int)(p1)), ((moom.DE)(new moom.DE(p2, "inventory"))));
    return;
}


protected void a(net.minecraft.block.Block p0, int p1, java.lang.String p2) {
((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(net.minecraft.item.Item.a(((net.minecraft.block.Block)(p0))))), ((int)(p1)), ((java.lang.String)(p2)));
    return;
}


public void a(net.minecraft.client.gui.FontRenderer p0, net.minecraft.item.ItemStack p1, int p2, int p3) {
((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.client.gui.FontRenderer)(p0)), ((net.minecraft.item.ItemStack)(p1)), ((int)(p2)), ((int)(p3)), ((java.lang.String)(null)));
    return;
}


public void a(net.minecraft.client.gui.FontRenderer p0, net.minecraft.item.ItemStack p1, float p2, float p3) {
((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.client.gui.FontRenderer)(p0)), ((net.minecraft.item.ItemStack)(p1)), ((float)(p2)), ((float)(p3)), ((java.lang.String)(null)));
    return;
}


public void a(net.minecraft.client.gui.FontRenderer p0, net.minecraft.item.ItemStack p1, int p2, int p3, java.lang.String p4) { __sourceHandlerCall_66ef387402eb29ac6e5e(this, p0, p1, p2, p3, p4); }


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral10772_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/nv"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(boolean p0) {
this.g = ((boolean)(p0));
    return;
}


public static void a(moom.lw p0, moom.lC p1, int p2) {
long local3 = (net.minecraft.client.renderer.entity.RenderItem.l ^ 93354050831008L);
    float local5 = ((float) (p2 & __sourceIntrinsic_898f94356deb_invokedynamic8991_1(11017, (7534667811040348287L ^ local3))));
    float local6 = ((float) ((p2 >>> __sourceIntrinsic_898f94356deb_invokedynamic8991_2(25836, (4853341110700902285L ^ local3))) & __sourceIntrinsic_898f94356deb_invokedynamic8991_3(18052, (3997720165268825595L ^ local3))));
    float local7 = ((float) ((p2 >>> __sourceIntrinsic_898f94356deb_invokedynamic8991_4(13913, (3698993238112884012L ^ local3))) & __sourceIntrinsic_898f94356deb_invokedynamic8991_5(18052, (3997720165268825595L ^ local3))));
    float local8 = ((float) ((p2 >>> __sourceIntrinsic_898f94356deb_invokedynamic8991_6(19101, (6513554664413342185L ^ local3))) & __sourceIntrinsic_898f94356deb_invokedynamic8991_7(18052, (3997720165268825595L ^ local3))));
    int[] local9 = ((moom.lC)(p1)).a__ArrayInt();
    int local10 = ((local9).length / 4);
    int local11 = 0;
    while ((local11 < 4)) {
        int local12 = (local9)[(3 + (local10 * local11))];
        float local13 = ((float) (local12 & __sourceIntrinsic_898f94356deb_invokedynamic8991_9(18052, (3997720165268825595L ^ local3))));
        float local14 = ((float) ((local12 >>> __sourceIntrinsic_898f94356deb_invokedynamic8991_10(14003, (7657763137473664471L ^ local3))) & __sourceIntrinsic_898f94356deb_invokedynamic8991_11(18052, (3997720165268825595L ^ local3))));
        float local15 = ((float) ((local12 >>> __sourceIntrinsic_898f94356deb_invokedynamic8991_12(22797, (5239192915622050414L ^ local3))) & __sourceIntrinsic_898f94356deb_invokedynamic8991_13(18052, (3997720165268825595L ^ local3))));
        float local16 = ((float) ((local12 >>> __sourceIntrinsic_898f94356deb_invokedynamic8991_14(15728, (3301765355040726546L ^ local3))) & __sourceIntrinsic_898f94356deb_invokedynamic8991_15(18052, (3997720165268825595L ^ local3))));
        int local17 = java.lang.Math.min(((int)(__sourceIntrinsic_898f94356deb_invokedynamic8991_16(18052, (3997720165268825595L ^ local3)))), ((int)(((int) ((local5 * local13) / 0x1.fep7f)))));
        int local18 = java.lang.Math.min(((int)(__sourceIntrinsic_898f94356deb_invokedynamic8991_18(18052, (3997720165268825595L ^ local3)))), ((int)(((int) ((local6 * local14) / 0x1.fep7f)))));
        int local19 = java.lang.Math.min(((int)(__sourceIntrinsic_898f94356deb_invokedynamic8991_20(18052, (3997720165268825595L ^ local3)))), ((int)(((int) ((local7 * local15) / 0x1.fep7f)))));
        int local20 = java.lang.Math.min(((int)(__sourceIntrinsic_898f94356deb_invokedynamic8991_22(18052, (3997720165268825595L ^ local3)))), ((int)(((int) ((local8 * local16) / 0x1.fep7f)))));
        ((moom.lw)(p0)).a(((int)(((moom.lw)(p0)).a(((int)((4 - local11)))))), ((int)(local17)), ((int)(local18)), ((int)(local19)), ((int)(local20)));
        local11 += 1;
    }
    return;
}


public void a(net.minecraft.item.ItemStack p0, int p1, int p2) { __sourceHandlerCall_d69b36235ff34be0529f(this, p0, p1, p2); }


public moom.ll a() {
return this.b;
}


private static java.lang.Throwable a(java.lang.Throwable p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 22311;
      if (n[var3] == null) {
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
         long var5 = m[var3];
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
         Object[] var9 = (Object[])o.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               o.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/nv", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         n[var3] = var15;
      }

      return n[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.client.renderer.entity.RenderItem.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private void a(moom.lw p0, moom.lC p1) {
java.lang.Object local3 = ((moom.bs)(((moom.lC)(p1)).a__bs())).a__DS();
    ((moom.lw)(p0)).b(((float)(((float) ((moom.DS)(local3)).a()))), ((float)(((float) ((moom.DS)(local3)).b()))), ((float)(((float) ((moom.DS)(local3)).c()))));
    return;
}


private void a(net.minecraft.item.Item p0, java.lang.String p1) {
((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.Item)(p0)), ((int)(0)), ((java.lang.String)(p1)));
    return;
}


private void a(moom.lw p0, java.util.List<moom.lC> p1, int p2, net.minecraft.item.ItemStack p3) { __sourceHandlerCall_c851d9164abbb8e270f0(this, p0, p1, p2, p3); }


private void a(net.minecraft.client.resources.model.IBakedModel p0, net.minecraft.item.ItemStack p1) {
((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.client.resources.model.IBakedModel)(p0)), ((int)(-1)), ((net.minecraft.item.ItemStack)(p1)));
    return;
}


public boolean a__Boolean(net.minecraft.item.ItemStack p0) { return __sourceHandlerCall_4dcc16289550c4f1c3f5(this, p0); }


public void a(net.minecraft.client.resources.model.IBakedModel p0, int p1) {
((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.client.resources.model.IBakedModel)(p0)), ((int)(p1)), ((net.minecraft.item.ItemStack)(null)));
    return;
}


private void a(net.minecraft.client.resources.model.IBakedModel p0, int p1, net.minecraft.item.ItemStack p2) { __sourceHandlerCall_46ee60b020e8f4a59255(this, p0, p1, p2); }


public void a(net.minecraft.item.ItemStack p0, net.minecraft.client.resources.model.IBakedModel p1) { __sourceHandlerCall_7e0fdf7f7b41ea7817aa(this, p0, p1); }


private void a(net.minecraft.client.resources.model.IBakedModel p0) { __sourceHandlerCall_795310c629e787cb2ac7(this, p0); }


private void a(float p0, float p1, boolean p2) { __sourceHandlerCall_ecaec38ab040697fa6a7(this, p0, p1, p2); }


protected void a(net.minecraft.item.ItemStack p0, net.minecraft.client.resources.model.IBakedModel p1, net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType p2) {
long life4_3;
    moom.lP life6_43;
    life4_3 = (net.minecraft.client.renderer.entity.RenderItem.l ^ 117128671619351L);
    ((net.minecraft.client.renderer.texture.TextureManager)(this.c)).a__Void(((moom.DD)(net.minecraft.client.renderer.texture.TextureMap.k)));
    ((net.minecraft.client.renderer.texture.ITextureObject)(((net.minecraft.client.renderer.texture.TextureManager)(this.c)).a(((moom.DD)(net.minecraft.client.renderer.texture.TextureMap.k))))).a(((boolean)(false)), ((boolean)(false)));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.ItemStack)(p0)));
    moom.kZ.y();
    moom.kZ.a(((int)(__sourceIntrinsic_24972cbfab7c_invokedynamic2635_10(28775, (8646789886872041658L ^ life4_3)))), ((float)(0x1.99999ap-4f)));
    moom.kZ.l();
    moom.kZ.a(((int)(__sourceIntrinsic_24972cbfab7c_invokedynamic2635_13(8735, (9016157253826079429L ^ life4_3)))), ((int)(__sourceIntrinsic_24972cbfab7c_invokedynamic2635_14(5596, (6417603450172726528L ^ life4_3)))), ((int)(1)), ((int)(0)));
    moom.kZ.B();
    life6_43 = ((net.minecraft.client.resources.model.IBakedModel)(p1)).a__lP();
    try {
        ((moom.lP)(life6_43)).a__Void(((net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType)(p2)));
        if (((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((moom.lV)(((moom.lP)(life6_43)).a(((net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType)(p2))))))) {
        moom.kZ.e(((int)(__sourceIntrinsic_24972cbfab7c_invokedynamic2635_21(26915, (1457033566956265930L ^ life4_3)))));
    }
    } catch (moom.Oo caught_rethrow_0) {
        throw net.minecraft.client.renderer.entity.RenderItem.a(((java.lang.Throwable)(caught_rethrow_0)));
    }
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.ItemStack)(p0)), ((net.minecraft.client.resources.model.IBakedModel)(p1)));
    moom.kZ.e(((int)(__sourceIntrinsic_24972cbfab7c_invokedynamic2635_25(1049, (5839916517560995009L ^ life4_3)))));
    moom.kZ.C();
    moom.kZ.z();
    moom.kZ.k();
    ((net.minecraft.client.renderer.texture.TextureManager)(this.c)).a__Void(((moom.DD)(net.minecraft.client.renderer.texture.TextureMap.k)));
    ((net.minecraft.client.renderer.texture.ITextureObject)(((net.minecraft.client.renderer.texture.TextureManager)(this.c)).a(((moom.DD)(net.minecraft.client.renderer.texture.TextureMap.k))))).a__Void();
    return;
}


public void a(net.minecraft.item.ItemStack p0, float p1, float p2) {
long local4 = (net.minecraft.client.renderer.entity.RenderItem.l ^ 54313529952429L);
    this.h = ((boolean)(true));
    net.minecraft.client.resources.model.IBakedModel local6 = ((moom.ll)(this.b)).a__pp(((net.minecraft.item.ItemStack)(p0)));
    moom.kZ.B();
    ((net.minecraft.client.renderer.texture.TextureManager)(this.c)).a__Void(((moom.DD)(net.minecraft.client.renderer.texture.TextureMap.k)));
    ((net.minecraft.client.renderer.texture.ITextureObject)(((net.minecraft.client.renderer.texture.TextureManager)(this.c)).a(((moom.DD)(net.minecraft.client.renderer.texture.TextureMap.k))))).a(((boolean)(false)), ((boolean)(false)));
    moom.kZ.y();
    moom.kZ.d__Void();
    moom.kZ.a(((int)(__sourceIntrinsic_405725596bbe_originalDynamicSite1836_14(19111, (7714846089056199670L ^ local4)))), ((float)(0x1.99999ap-4f)));
    moom.kZ.l();
    moom.kZ.b(((int)(__sourceIntrinsic_405725596bbe_originalDynamicSite1836_17(8735, (9016075209713175423L ^ local4)))), ((int)(__sourceIntrinsic_405725596bbe_originalDynamicSite1836_18(5596, (6417545583907077306L ^ local4)))));
    moom.kZ.c(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((float)(p1)), ((float)(p2)), ((boolean)(((net.minecraft.client.resources.model.IBakedModel)(local6)).b())));
    ((moom.lP)(((net.minecraft.client.resources.model.IBakedModel)(local6)).a__lP())).a__Void(((net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType)(net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType.GUI)));
    ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.ItemStack)(p0)), ((net.minecraft.client.resources.model.IBakedModel)(local6)));
    moom.kZ.c__Void();
    moom.kZ.z();
    moom.kZ.f();
    moom.kZ.C();
    ((net.minecraft.client.renderer.texture.TextureManager)(this.c)).a__Void(((moom.DD)(net.minecraft.client.renderer.texture.TextureMap.k)));
    ((net.minecraft.client.renderer.texture.ITextureObject)(((net.minecraft.client.renderer.texture.TextureManager)(this.c)).a(((moom.DD)(net.minecraft.client.renderer.texture.TextureMap.k))))).a__Void();
    this.h = ((boolean)(false));
    return;
}


private boolean a(moom.lV p0) { return __sourceHandlerCall_355086170ddc0c54577c(this, p0); }


public void a(net.minecraft.item.ItemStack p0, net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType p1) {
net.minecraft.client.resources.model.IBakedModel life3_6;
    if ((p0 != null)) {
        life3_6 = ((moom.ll)(this.b)).a__pp(((net.minecraft.item.ItemStack)(p0)));
        ((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.item.ItemStack)(p0)), ((net.minecraft.client.resources.model.IBakedModel)(life3_6)), ((net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType)(p1)));
    }
    return;
}


public void a(net.minecraft.item.ItemStack p0, net.minecraft.entity.EntityLivingBase p1, net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType p2) { __sourceHandlerCall_13a2dd98ab22bf1b4558(this, p0, p1, p2); }


private void a(net.minecraft.block.Block p0, java.lang.String p1) {
((net.minecraft.client.renderer.entity.RenderItem)(this)).a(((net.minecraft.block.Block)(p0)), ((int)(0)), ((java.lang.String)(p1)));
    return;
}


private void a(net.minecraft.item.ItemStack p0) {
net.minecraft.client.resources.model.IBakedModel life2_4;
    net.minecraft.item.Item life3_7;
    int life4_12;
    life2_4 = ((moom.ll)(this.b)).a__pp(((net.minecraft.item.ItemStack)(p0)));
    life3_7 = ((net.minecraft.item.ItemStack)(p0)).a__wQ();
    if ((life3_7 != null)) {
        life4_12 = ((((net.minecraft.client.resources.model.IBakedModel)(life2_4)).b()) ? 1 : 0);
        try {
        if ((life4_12 == 0)) {
        moom.kZ.a(((float)(0x1.0p1f)), ((float)(0x1.0p1f)), ((float)(0x1.0p1f)));
    }
    } catch (moom.Oo caught_rethrow_0) {
        throw net.minecraft.client.renderer.entity.RenderItem.a(((java.lang.Throwable)(caught_rethrow_0)));
    }
        moom.kZ.c(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    }
    return;
}


private static moom.DE lambda$registerItems$5(net.minecraft.item.ItemStack p0) {
return new moom.DE("spawn_egg", "inventory");
}


private static moom.DE lambda$registerItems$7(net.minecraft.item.ItemStack p0) {
return new moom.DE("enchanted_book", "inventory");
}


private static moom.DE lambda$registerItems$8(net.minecraft.item.ItemStack p0) {
return new moom.DE("filled_map", "inventory");
}


private static moom.DE lambda$registerItems$6(net.minecraft.item.ItemStack p0) {
return new moom.DE("banner", "inventory");
}


private static moom.DE lambda$registerItems$4(net.minecraft.item.ItemStack p0) { return __sourceHandlerCall_95743551eb121f30811e(p0); }


private static java.lang.String lambda$renderItemAndEffectIntoGUI$2(net.minecraft.item.ItemStack p0) throws java.lang.Exception {
return java.lang.String.valueOf(((java.lang.Object)(((net.minecraft.item.ItemStack)(p0)).a__yw())));
}


private static java.lang.String lambda$renderItemAndEffectIntoGUI$0(net.minecraft.item.ItemStack p0) throws java.lang.Exception {
return java.lang.String.valueOf(((java.lang.Object)(((net.minecraft.item.ItemStack)(p0)).a__wQ())));
}


private static java.lang.String lambda$renderItemAndEffectIntoGUI$3(net.minecraft.item.ItemStack p0) throws java.lang.Exception {
return java.lang.String.valueOf(((boolean)(((net.minecraft.item.ItemStack)(p0)).g())));
}


private static java.lang.String lambda$renderItemAndEffectIntoGUI$1(net.minecraft.item.ItemStack p0) throws java.lang.Exception {
return java.lang.String.valueOf(((int)(((net.minecraft.item.ItemStack)(p0)).c())));
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral10772_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ecb3fb6c96d3_originalDynamicSite1834_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bdd7d5f4a4ca_originalDynamicSite1833_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_898f94356deb_invokedynamic8991_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_898f94356deb_invokedynamic8991_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_898f94356deb_invokedynamic8991_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_898f94356deb_invokedynamic8991_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_898f94356deb_invokedynamic8991_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_898f94356deb_invokedynamic8991_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_898f94356deb_invokedynamic8991_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_898f94356deb_invokedynamic8991_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_898f94356deb_invokedynamic8991_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_898f94356deb_invokedynamic8991_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_898f94356deb_invokedynamic8991_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_898f94356deb_invokedynamic8991_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_898f94356deb_invokedynamic8991_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_898f94356deb_invokedynamic8991_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_898f94356deb_invokedynamic8991_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_898f94356deb_invokedynamic8991_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_898f94356deb_invokedynamic8991_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_898f94356deb_invokedynamic8991_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_405725596bbe_originalDynamicSite1836_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_405725596bbe_originalDynamicSite1836_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_405725596bbe_originalDynamicSite1836_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_24972cbfab7c_invokedynamic2635_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_24972cbfab7c_invokedynamic2635_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_24972cbfab7c_invokedynamic2635_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_24972cbfab7c_invokedynamic2635_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_24972cbfab7c_invokedynamic2635_25(int a0, long a1) throws E;

private static native <E extends Throwable> net.minecraft.client.renderer.ItemMeshDefinition __sourceIntrinsic_b82a5b29b709_invokedynamic611_1284() throws E;

private static native <E extends Throwable> net.minecraft.client.renderer.ItemMeshDefinition __sourceIntrinsic_b82a5b29b709_invokedynamic611_1306() throws E;

private static native <E extends Throwable> net.minecraft.client.renderer.ItemMeshDefinition __sourceIntrinsic_b82a5b29b709_invokedynamic611_1374() throws E;

private static native <E extends Throwable> net.minecraft.client.renderer.ItemMeshDefinition __sourceIntrinsic_b82a5b29b709_invokedynamic611_1406() throws E;

private static native <E extends Throwable> net.minecraft.client.renderer.ItemMeshDefinition __sourceIntrinsic_b82a5b29b709_invokedynamic611_1410() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral10767_0() throws E;
}
