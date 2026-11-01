package net.minecraft.client.renderer;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class OpenGlHelper {

public static boolean a;

public static boolean b;

public static int c;

public static int d;

public static int e;

public static int f;

public static int g;

public static int h;

public static int i;

public static int j;

public static int k;

public static boolean l;

public static int m;

public static int n;

public static int o;

public static int p;

public static int q;

public static int r;

public static int s;

public static int t;

public static int u;

public static int v;

public static int w;

public static int x;

public static int y;

public static int z;

public static int A;

public static int B;

public static int C;

public static int D;

public static int E;

public static int F;

public static int G;

public static int H;

public static int I;

public static int J;

public static int K;

public static int L;

public static boolean M;

public static boolean N;

public static boolean O;

public static boolean P;

public static boolean Q;

public static int R;

public static int S;

public static float T;

public static float U;

public static boolean V;

public static boolean W;

public static int X;

public static int Y;

private static int Z;

private static boolean aa;

private static boolean ab;

private static boolean ac;

private static boolean ad;

private static boolean ae;

private static java.lang.String af;

private static java.lang.String ag;

private static boolean ah;

private static long bb;

private static long[] cb;

private static java.lang.Integer[] db;

private static java.util.Map eb;

public OpenGlHelper() {
super();
}


static {
bb = ((long)(((moom._a)(moom._c.a(((long)(-5273890471372242707L)), ((long)(-6270754271308757092L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(113946539995883L)))));
    eb = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (net.minecraft.client.renderer.OpenGlHelper.bb ^ 29199796626273L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1809_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1809_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1809_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1809_14 = new byte[8];
    (__sourceSpill1809_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1809_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1809_16 = __sourceSpill1809_14;
    ((javax.crypto.Cipher)(__sourceSpill1809_11)).init(((int)(__sourceSpill1809_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1809_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1809_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[50];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "µéuùWâ^\016{\033áw\036)·H!;ïù\033X¬R\035Õí6És\\'Ïé]À.(-Z¡#ûN\020î«ô@Cñ[K¸Vö±x­Ñö»Èç-½}ØæÿîÁk?QbÃê^ª­í_0áE\017Ü\032v·?â\007âÇ|ïâLTp³|k\006\024\r\b7¦Y§dü%ý¯ûÿªU~NbWgB!úrk£öµ-È'´Î\t@Z%õåí\024Ó:s¬ dÂá\025\024õBÔH¿\tï\bþB\005¡º\003Øcc¤õmÅÐ\002ÄnfÑ\016Uòv`\032\002íf°yS¸K¢w?NÉZì&o\027Ü·\t'ÜÑ%ÜA!íWÑ\006\020Ý²ßphv`ë¼¤'êýJëHå2)^ÍË@IT& î§F8_\001Ð\\\013Û\033ãû©8\\\b=!cä©\031ô1 SÓ\023fmÁC Wsüãî\t/ô½C×½9bÂª#Æ#ø²\027ðI\013E^\021A·`Oûiq^\023|ªa=¾Ý9\002¡Q\004ö!GÁ==C\000(ía"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1809_25 = local6_life21;
        int __sourceSpill1809_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1809_25)).substring(((int)(__sourceSpill1809_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1809_30 = local8_life19;
        int __sourceSpill1809_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1809_33 = new byte[8];
        (__sourceSpill1809_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1809_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1809_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1809_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1809_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1809_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1809_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1809_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1809_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1809_34)).doFinal(((byte[])(__sourceSpill1809_33)));
        (__sourceSpill1809_30)[__sourceSpill1809_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "íÌù\025\nb\007Êsx`ËÍþ"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1809_38 = local6_life21;
        int __sourceSpill1809_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1809_38)).substring(((int)(__sourceSpill1809_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1809_43 = local8_life19;
        int __sourceSpill1809_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1809_46 = new byte[8];
        (__sourceSpill1809_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1809_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1809_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1809_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1809_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1809_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1809_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1809_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1809_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1809_47)).doFinal(((byte[])(__sourceSpill1809_46)));
        (__sourceSpill1809_43)[__sourceSpill1809_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    cb = ((long[])(local8_life19));
    db = ((java.lang.Integer[])(new java.lang.Integer[50]));
    T = ((float)(0x0.0p0f));
    U = ((float)(0x0.0p0f));
    af = ((java.lang.String)(""));
}

private static native <E extends Throwable> int __sourceHandlerCall_6812ba1abf3b9c6860c7() throws E;
private static final class __SourceHandler_6812ba1abf3b9c6860c7 {

public static int f100178() throws Throwable {
    int forestValue100178_5_0;
    forest_join_5: {
    forest_join_4: {
    if (!(__fieldRead100178_0())) {
        break forest_join_4;
    }
    forestValue100178_5_0 = __call100178_1();
    break forest_join_5;
    }
    forestValue100178_5_0 = __call100178_2();
    }
    return forestValue100178_5_0;
}
public static int h100178_0(moom.Oo p0) throws Throwable {
    throw __call13017800_0(p0);
}
private static native boolean __fieldRead100178_0() throws Throwable;
private static native int __call100178_1() throws Throwable;
private static native int __call100178_2() throws Throwable;
private static native java.lang.Throwable __call13017800_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_5e1f8cadbd11f68334c3(int a0) throws E;
private static final class __SourceHandler_5e1f8cadbd11f68334c3 {

public static int f100189(int p0) throws Throwable {
    int forestValue100189_7_0;
    forest_join_7: {
    forest_join_5: {
    if (!(__fieldRead100189_0())) {
        break forest_join_5;
    }
    forestValue100189_7_0 = __call100189_1(p0);
    break forest_join_7;
    }
    forestValue100189_7_0 = __call100189_2(p0);
    }
    return forestValue100189_7_0;
}
public static int h100189_0(moom.Oo p0) throws Throwable {
    throw __call13018900_0(p0);
}
private static native boolean __fieldRead100189_0() throws Throwable;
private static native int __call100189_1(int a0) throws Throwable;
private static native int __call100189_2(int a0) throws Throwable;
private static native java.lang.Throwable __call13018900_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_b79cffd4d1da879249c9(int a0, float a1, float a2) throws E;
private static final class __SourceHandler_b79cffd4d1da879249c9 {

public static void f100181(int p0, float p1, float p2) throws Throwable {
    forest_join_18: {
    forest_join_11: {
    forest_join_7: {
    if (!(__fieldRead100181_0())) {
        break forest_join_7;
    }
    __call100181_1(p0, p1, p2);
    break forest_join_11;
    }
    __call100181_2(p0, p1, p2);
    }
    if (!((p0 == __fieldRead100181_3()))) {
        break forest_join_18;
    }
    __fieldWrite100181_4(p1);
    __fieldWrite100181_5(p2);
    }
    return;
}
public static void h100181_0(moom.Oo p0) throws Throwable {
    throw __call13018100_0(p0);
}
public static void h100181_1(moom.Oo p0) throws Throwable {
    throw __call13018101_0(p0);
}
private static native boolean __fieldRead100181_0() throws Throwable;
private static native void __call100181_1(int a0, float a1, float a2) throws Throwable;
private static native void __call100181_2(int a0, float a1, float a2) throws Throwable;
private static native int __fieldRead100181_3() throws Throwable;
private static native void __fieldWrite100181_4(float a0) throws Throwable;
private static native void __fieldWrite100181_5(float a0) throws Throwable;
private static native java.lang.Throwable __call13018100_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call13018101_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_f80b7714eb71cab1ac0e(int a0, int a1) throws E;
private static final class __SourceHandler_f80b7714eb71cab1ac0e {

public static int f100190(int p0, int p1) throws Throwable {
    int forestValue100190_9_0;
    forest_join_9: {
    forest_join_6: {
    if (!(__fieldRead100190_0())) {
        break forest_join_6;
    }
    forestValue100190_9_0 = __call100190_1(p0, p1);
    break forest_join_9;
    }
    forestValue100190_9_0 = __call100190_2(p0, p1);
    }
    return forestValue100190_9_0;
}
public static int h100190_0(moom.Oo p0) throws Throwable {
    throw __call13019000_0(p0);
}
private static native boolean __fieldRead100190_0() throws Throwable;
private static native int __call100190_1(int a0, int a1) throws Throwable;
private static native int __call100190_2(int a0, int a1) throws Throwable;
private static native java.lang.Throwable __call13019000_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_dbbf4867a9b140bbdbac(int a0, int a1, int a2, int a3) throws E;
private static final class __SourceHandler_dbbf4867a9b140bbdbac {

public static void f587(int p0, int p1, int p2, int p3) throws Throwable {
    forest_join_21: {
    forest_join_16: {
    forest_join_10: {
    forest_join_4: {
    if (!(__fieldRead587_0())) {
        break forest_join_21;
    }
    switch (__fieldRead587_1()) {
case 0:
{
        break forest_join_4;
    }
case 1:
{
        break forest_join_10;
    }
case 2:
{
        break forest_join_16;
    }
default:
{
        break forest_join_21;
    }
}
    }
    __call587_2(p0, p1, p2, p3);
    break forest_join_21;
    }
    __call587_3(p0, p1, p2, p3);
    break forest_join_21;
    }
    __call587_4(p0, p1, p2, p3);
    }
    return;
}
public static void h587_0(moom.Oo p0) throws Throwable {
    throw __call3058700_0(p0);
}
public static void h587_1(moom.Oo p0) throws Throwable {
    throw __call3058701_0(p0);
}
private static native boolean __fieldRead587_0() throws Throwable;
private static native int __fieldRead587_1() throws Throwable;
private static native void __call587_2(int a0, int a1, int a2, int a3) throws Throwable;
private static native void __call587_3(int a0, int a1, int a2, int a3) throws Throwable;
private static native void __call587_4(int a0, int a1, int a2, int a3) throws Throwable;
private static native java.lang.Throwable __call3058700_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3058701_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_484ae238adcb3576d7ef(int a0, int a1, int a2, int a3, int a4) throws E;
private static final class __SourceHandler_484ae238adcb3576d7ef {

public static void f588(int p0, int p1, int p2, int p3, int p4) throws Throwable {
    forest_join_24: {
    forest_join_18: {
    forest_join_11: {
    forest_join_4: {
    if (!(__fieldRead588_0())) {
        break forest_join_24;
    }
    switch (__fieldRead588_1()) {
case 0:
{
        break forest_join_4;
    }
case 1:
{
        break forest_join_11;
    }
case 2:
{
        break forest_join_18;
    }
default:
{
        break forest_join_24;
    }
}
    }
    __call588_2(p0, p1, p2, p3, p4);
    break forest_join_24;
    }
    __call588_3(p0, p1, p2, p3, p4);
    break forest_join_24;
    }
    __call588_4(p0, p1, p2, p3, p4);
    }
    return;
}
public static void h588_0(moom.Oo p0) throws Throwable {
    throw __call3058800_0(p0);
}
public static void h588_1(moom.Oo p0) throws Throwable {
    throw __call3058801_0(p0);
}
private static native boolean __fieldRead588_0() throws Throwable;
private static native int __fieldRead588_1() throws Throwable;
private static native void __call588_2(int a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native void __call588_3(int a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native void __call588_4(int a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native java.lang.Throwable __call3058800_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3058801_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_f989b92e265d7348bf49(int a0, int a1, long a2, long a3, long a4) throws E;
private static final class __SourceHandler_f989b92e265d7348bf49 {

public static void f100182(int p0, int p1, long p2, long p3, long p4) throws Throwable {
    forest_join_15: {
    forest_join_9: {
    if (!(__fieldRead100182_0())) {
        break forest_join_9;
    }
    __call100182_1(p0, p1, p2, p3, p4);
    break forest_join_15;
    }
    __call100182_2(p0, p1, p2, p3, p4);
    }
    return;
}
public static void h100182_0(moom.Oo p0) throws Throwable {
    throw __call13018200_0(p0);
}
private static native boolean __fieldRead100182_0() throws Throwable;
private static native void __call100182_1(int a0, int a1, long a2, long a3, long a4) throws Throwable;
private static native void __call100182_2(int a0, int a1, long a2, long a3, long a4) throws Throwable;
private static native java.lang.Throwable __call13018200_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_0cd5b6f2b6c21f3c058a(int a0, long a1, int a2) throws E;
private static final class __SourceHandler_0cd5b6f2b6c21f3c058a {

public static void f100179(int p0, long p1, int p2) throws Throwable {
    forest_join_11: {
    forest_join_7: {
    if (!(__fieldRead100179_0())) {
        break forest_join_7;
    }
    __call100179_1(p0, p1, p2);
    break forest_join_11;
    }
    __call100179_2(p0, p1, p2);
    }
    return;
}
public static void h100179_0(moom.Oo p0) throws Throwable {
    throw __call13017900_0(p0);
}
private static native boolean __fieldRead100179_0() throws Throwable;
private static native void __call100179_1(int a0, long a1, int a2) throws Throwable;
private static native void __call100179_2(int a0, long a1, int a2) throws Throwable;
private static native java.lang.Throwable __call13017900_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_206131a8e10601ca2eb7(int a0, long a1, java.nio.ByteBuffer a2) throws E;
private static final class __SourceHandler_206131a8e10601ca2eb7 {

public static void f100180(int p0, long p1, java.nio.ByteBuffer p2) throws Throwable {
    forest_join_11: {
    forest_join_7: {
    if (!(__fieldRead100180_0())) {
        break forest_join_7;
    }
    __call100180_1(p0, p1, p2);
    break forest_join_11;
    }
    __call100180_2(p0, p1, p2);
    }
    return;
}
public static void h100180_0(moom.Oo p0) throws Throwable {
    throw __call13018000_0(p0);
}
private static native boolean __fieldRead100180_0() throws Throwable;
private static native void __call100180_1(int a0, long a1, java.nio.ByteBuffer a2) throws Throwable;
private static native void __call100180_2(int a0, long a1, java.nio.ByteBuffer a2) throws Throwable;
private static native java.lang.Throwable __call13018000_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_0bdc3fc3833e6d849777(int a0, java.lang.CharSequence a1) throws E;
private static final class __SourceHandler_0bdc3fc3833e6d849777 {

public static int f100193(int p0, java.lang.CharSequence p1) throws Throwable {
    int forestValue100193_9_0;
    forest_join_9: {
    forest_join_6: {
    if (!(__fieldRead100193_0())) {
        break forest_join_6;
    }
    forestValue100193_9_0 = __call100193_1(p0, p1);
    break forest_join_9;
    }
    forestValue100193_9_0 = __call100193_2(p0, p1);
    }
    return forestValue100193_9_0;
}
public static int h100193_0(moom.Oo p0) throws Throwable {
    throw __call13019300_0(p0);
}
private static native boolean __fieldRead100193_0() throws Throwable;
private static native int __call100193_1(int a0, java.lang.CharSequence a1) throws Throwable;
private static native int __call100193_2(int a0, java.lang.CharSequence a1) throws Throwable;
private static native java.lang.Throwable __call13019300_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_5f9d88fbc47b858e9d94(int a0, java.nio.ByteBuffer a1) throws E;
private static final class __SourceHandler_5f9d88fbc47b858e9d94 {

public static void f100185(int p0, java.nio.ByteBuffer p1) throws Throwable {
    forest_join_9: {
    forest_join_6: {
    if (!(__fieldRead100185_0())) {
        break forest_join_6;
    }
    __call100185_1(p0, p1);
    break forest_join_9;
    }
    __call100185_2(p0, p1);
    }
    return;
}
public static void h100185_0(moom.Oo p0) throws Throwable {
    throw __call13018500_0(p0);
}
private static native boolean __fieldRead100185_0() throws Throwable;
private static native void __call100185_1(int a0, java.nio.ByteBuffer a1) throws Throwable;
private static native void __call100185_2(int a0, java.nio.ByteBuffer a1) throws Throwable;
private static native java.lang.Throwable __call13018500_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_9b5f2af334c6d8fabed8(int a0, java.nio.ByteBuffer a1, int a2) throws E;
private static final class __SourceHandler_9b5f2af334c6d8fabed8 {

public static void f100187(int p0, java.nio.ByteBuffer p1, int p2) throws Throwable {
    forest_join_11: {
    forest_join_7: {
    if (!(__fieldRead100187_0())) {
        break forest_join_7;
    }
    __call100187_1(p0, p1, p2);
    break forest_join_11;
    }
    __call100187_2(p0, p1, p2);
    }
    return;
}
public static void h100187_0(moom.Oo p0) throws Throwable {
    throw __call13018700_0(p0);
}
private static native boolean __fieldRead100187_0() throws Throwable;
private static native void __call100187_1(int a0, java.nio.ByteBuffer a1, int a2) throws Throwable;
private static native void __call100187_2(int a0, java.nio.ByteBuffer a1, int a2) throws Throwable;
private static native java.lang.Throwable __call13018700_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_9666fff23be08a3c3386(int a0, java.nio.FloatBuffer a1) throws E;
private static final class __SourceHandler_9666fff23be08a3c3386 {

public static void f100186(int p0, java.nio.FloatBuffer p1) throws Throwable {
    forest_join_9: {
    forest_join_6: {
    if (!(__fieldRead100186_0())) {
        break forest_join_6;
    }
    __call100186_1(p0, p1);
    break forest_join_9;
    }
    __call100186_2(p0, p1);
    }
    return;
}
public static void h100186_0(moom.Oo p0) throws Throwable {
    throw __call13018600_0(p0);
}
private static native boolean __fieldRead100186_0() throws Throwable;
private static native void __call100186_1(int a0, java.nio.FloatBuffer a1) throws Throwable;
private static native void __call100186_2(int a0, java.nio.FloatBuffer a1) throws Throwable;
private static native java.lang.Throwable __call13018600_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_50bfe26b70bfca4ff940(int a0, java.nio.IntBuffer a1) throws E;
private static final class __SourceHandler_50bfe26b70bfca4ff940 {

public static void f100192(int p0, java.nio.IntBuffer p1) throws Throwable {
    forest_join_9: {
    forest_join_6: {
    if (!(__fieldRead100192_0())) {
        break forest_join_6;
    }
    __call100192_1(p0, p1);
    break forest_join_9;
    }
    __call100192_2(p0, p1);
    }
    return;
}
public static void h100192_0(moom.Oo p0) throws Throwable {
    throw __call13019200_0(p0);
}
private static native boolean __fieldRead100192_0() throws Throwable;
private static native void __call100192_1(int a0, java.nio.IntBuffer a1) throws Throwable;
private static native void __call100192_2(int a0, java.nio.IntBuffer a1) throws Throwable;
private static native java.lang.Throwable __call13019200_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_de2c198ba51dd3e14870(int a0, boolean a1, java.nio.FloatBuffer a2) throws E;
private static final class __SourceHandler_de2c198ba51dd3e14870 {

public static void f100188(int p0, boolean p1, java.nio.FloatBuffer p2) throws Throwable {
    forest_join_11: {
    forest_join_7: {
    if (!(__fieldRead100188_0())) {
        break forest_join_7;
    }
    __call100188_1(p0, p1, p2);
    break forest_join_11;
    }
    __call100188_2(p0, p1, p2);
    }
    return;
}
public static void h100188_0(moom.Oo p0) throws Throwable {
    throw __call13018800_0(p0);
}
private static native boolean __fieldRead100188_0() throws Throwable;
private static native void __call100188_1(int a0, boolean a1, java.nio.FloatBuffer a2) throws Throwable;
private static native void __call100188_2(int a0, boolean a1, java.nio.FloatBuffer a2) throws Throwable;
private static native java.lang.Throwable __call13018800_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_71068f1c10d73ca385d1(int a0, int a1) throws E;
private static final class __SourceHandler_71068f1c10d73ca385d1 {

public static java.lang.String f100184(int p0, int p1) throws Throwable {
    java.lang.String forestValue100184_9_0;
    forest_join_9: {
    forest_join_6: {
    if (!(__fieldRead100184_0())) {
        break forest_join_6;
    }
    forestValue100184_9_0 = __call100184_1(p0, p1);
    break forest_join_9;
    }
    forestValue100184_9_0 = __call100184_2(p0, p1);
    }
    return forestValue100184_9_0;
}
public static java.lang.String h100184_0(moom.Oo p0) throws Throwable {
    throw __call13018400_0(p0);
}
private static native boolean __fieldRead100184_0() throws Throwable;
private static native java.lang.String __call100184_1(int a0, int a1) throws Throwable;
private static native java.lang.String __call100184_2(int a0, int a1) throws Throwable;
private static native java.lang.Throwable __call13018400_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_d6a083f6b41f5e8c4bcc() throws E;
private static final class __SourceHandler_d6a083f6b41f5e8c4bcc {

public static void f589() throws Throwable {
    int forestValue589_16_0;
    int forestValue589_26_0;
    int forestValue589_50_0;
    int forestValue589_61_0;
    int forestValue589_249_0;
    int forestValue589_259_0;
    int forestValue589_274_0;
    java.lang.String forestValue589_482_0;
    java.lang.String forestValue589_483_0;
    java.lang.String forestValue589_483_1;
    java.lang.String forestValue589_491_0;
    java.lang.String forestValue589_492_0;
    java.lang.String forestValue589_492_1;
    java.lang.String forestValue589_500_0;
    java.lang.String forestValue589_501_0;
    java.lang.String forestValue589_501_1;
    java.lang.String forestValue589_509_0;
    java.lang.String forestValue589_510_0;
    java.lang.String forestValue589_510_1;
    java.lang.String forestValue589_518_0;
    java.lang.String forestValue589_519_0;
    java.lang.String forestValue589_519_1;
    int forestValue589_538_0;
    java.lang.String forestValue589_544_0;
    java.lang.String forestValue589_545_0;
    java.lang.String forestValue589_545_1;
    java.lang.String forestValue589_594_0;
    java.lang.String forestValue589_595_0;
    java.lang.String forestValue589_595_1;
    java.lang.String forestValue589_603_0;
    java.lang.String forestValue589_604_0;
    java.lang.String forestValue589_604_1;
    java.lang.String forestValue589_612_0;
    java.lang.String forestValue589_613_0;
    java.lang.String forestValue589_613_1;
    java.lang.String forestValue589_621_0;
    java.lang.String forestValue589_622_0;
    java.lang.String forestValue589_622_1;
    int forestValue589_631_0;
    int forestValue589_653_0;
    int forestValue589_662_0;
    java.lang.String forestValue589_668_0;
    java.lang.String forestValue589_669_0;
    java.lang.String forestValue589_669_1;
    int spill589_0;
    int spill589_1;
    int spill589_2;
    java.lang.String spill589_3;
    java.lang.String spill589_4;
    java.lang.String spill589_5;
    java.lang.String spill589_6;
    java.lang.String spill589_7;
    java.lang.String spill589_8;
    java.lang.String spill589_9;
    java.lang.String spill589_10;
    java.lang.String spill589_11;
    java.lang.String spill589_12;
    java.lang.String spill589_13;
    java.lang.String spill589_14;
    java.lang.Object[] spill589_15;
    java.lang.Object[] spill589_16;
    long life0_3;
    org.lwjgl.opengl.ContextCapabilities life2_6;
    int life3_53;
    int life4_56;
    java.util.ArrayList life5_71;
    java.lang.String life6_89;
    java.lang.String life5_656;
    oshi.hardware.Processor[] life6_734;
    forest_join_708: {
    forest_join_705: {
    forest_join_694: {
    forest_join_682: {
    forest_join_679: {
    forest_join_669: {
    forest_join_668: {
    forest_join_662: {
    forest_join_661: {
    forest_join_659: {
    forest_join_653: {
    forest_join_652: {
    forest_join_631: {
    forest_join_630: {
    forest_join_624: {
    forest_join_622: {
    forest_join_621: {
    forest_join_613: {
    forest_join_612: {
    forest_join_604: {
    forest_join_603: {
    forest_join_595: {
    forest_join_594: {
    forest_join_588: {
    forest_join_563: {
    forest_join_558: {
    forest_join_545: {
    forest_join_544: {
    forest_join_538: {
    forest_join_537: {
    forest_join_535: {
    forest_join_521: {
    forest_join_519: {
    forest_join_518: {
    forest_join_510: {
    forest_join_509: {
    forest_join_501: {
    forest_join_500: {
    forest_join_492: {
    forest_join_491: {
    forest_join_483: {
    forest_join_482: {
    forest_join_473: {
    forest_join_406: {
    forest_join_343: {
    forest_join_274: {
    forest_join_273: {
    forest_join_271: {
    forest_join_259: {
    forest_join_258: {
    forest_join_256: {
    forest_join_249: {
    forest_join_248: {
    forest_join_126: {
    forest_join_123: {
    forest_join_99: {
    forest_join_96: {
    forest_join_90: {
    forest_join_80: {
    forest_join_74: {
    forest_join_61: {
    forest_join_60: {
    forest_join_50: {
    forest_join_49: {
    forest_join_47: {
    forest_join_26: {
    forest_join_25: {
    forest_join_16: {
    forest_join_15: {
    life0_3 = (__fieldRead589_0() ^ 95868382393718L);
    __call589_1();
    life2_6 = __call589_2();
    if (!(__fieldRead589_3(life2_6))) {
        break forest_join_15;
    }
    if (!((!__fieldRead589_4(life2_6)))) {
        break forest_join_15;
    }
    forestValue589_16_0 = 1;
    break forest_join_16;
    }
    forestValue589_16_0 = 0;
    }
    __fieldWrite589_5(forestValue589_16_0);
    if (!(__fieldRead589_6(life2_6))) {
        break forest_join_25;
    }
    if (!((!__fieldRead589_7(life2_6)))) {
        break forest_join_25;
    }
    forestValue589_26_0 = 1;
    break forest_join_26;
    }
    forestValue589_26_0 = 0;
    }
    __fieldWrite589_8(forestValue589_26_0);
    spill589_0 = 15104;
    __fieldWrite589_10(__fieldRead589_9(life2_6));
    __fieldWrite589_12(__invokedynamic589_11(spill589_0, (7064645425379451143L ^ life0_3)));
    __fieldWrite589_14(__invokedynamic589_13(18755, (2678943120708686687L ^ life0_3)));
    if (!((!__fieldRead589_15()))) {
        break forest_join_47;
    }
    if (!(__fieldRead589_16(life2_6))) {
        break forest_join_49;
    }
    }
    forestValue589_50_0 = 1;
    break forest_join_50;
    }
    forestValue589_50_0 = 0;
    }
    life3_53 = forestValue589_50_0;
    life4_56 = __integerCategory589_18(__fieldRead589_17(life2_6));
    if (!((life3_53 != 0))) {
        break forest_join_60;
    }
    if (!((life4_56 != 0))) {
        break forest_join_60;
    }
    forestValue589_61_0 = 1;
    break forest_join_61;
    }
    forestValue589_61_0 = 0;
    }
    __fieldWrite589_19(forestValue589_61_0);
    if (!((!__fieldRead589_20()))) {
        break forest_join_90;
    }
    life5_71 = new java.util.ArrayList();
    if (!((life3_53 == 0))) {
        break forest_join_74;
    }
    __call589_21(life5_71, "OpenGL 1.3, ARB_copy_buffer");
    }
    if (!((life4_56 == 0))) {
        break forest_join_80;
    }
    __call589_22(life5_71, "OpenGL 1.4");
    }
    life6_89 = __invokedynamic589_24(__call589_23(life5_71));
    __call589_25(life6_89);
    __fieldWrite589_28(__invokedynamic589_27(__fieldRead589_26(), life6_89));
    }
    if (!(__fieldRead589_29())) {
        break forest_join_96;
    }
    __fieldWrite589_32(__invokedynamic589_31(__fieldRead589_30()));
    break forest_join_99;
    }
    __fieldWrite589_35(__invokedynamic589_34(__fieldRead589_33()));
    }
    __fieldWrite589_37(__invokedynamic589_36(29547, (3532107316226156899L ^ life0_3)));
    __fieldWrite589_39(__invokedynamic589_38(18446, (6562315069440643603L ^ life0_3)));
    __fieldWrite589_41(__invokedynamic589_40(3466, (6880581183399597980L ^ life0_3)));
    if (!(__fieldRead589_42())) {
        break forest_join_123;
    }
    __fieldWrite589_45(__invokedynamic589_44(__fieldRead589_43()));
    break forest_join_126;
    }
    __fieldWrite589_48(__invokedynamic589_47(__fieldRead589_46()));
    }
    __fieldWrite589_50(__invokedynamic589_49(12868, (1592619107245074507L ^ life0_3)));
    __fieldWrite589_52(__invokedynamic589_51(9399, (1572772126536482484L ^ life0_3)));
    __fieldWrite589_54(__invokedynamic589_53(27925, (7955910292362196748L ^ life0_3)));
    __fieldWrite589_56(__invokedynamic589_55(15106, (4925574201180889359L ^ life0_3)));
    __fieldWrite589_58(__invokedynamic589_57(14785, (5443461582865736667L ^ life0_3)));
    __fieldWrite589_60(__invokedynamic589_59(32320, (3638962407884383342L ^ life0_3)));
    __fieldWrite589_62(__invokedynamic589_61(27038, (8420285214394315709L ^ life0_3)));
    __fieldWrite589_64(__invokedynamic589_63(29846, (7705248824253902492L ^ life0_3)));
    __fieldWrite589_66(__invokedynamic589_65(333, (3757408966806182767L ^ life0_3)));
    __fieldWrite589_68(__invokedynamic589_67(29349, (346495839887452320L ^ life0_3)));
    __fieldWrite589_70(__invokedynamic589_69(22101, (6056541334006287449L ^ life0_3)));
    __fieldWrite589_72(__invokedynamic589_71(7962, (6974862827929273661L ^ life0_3)));
    __fieldWrite589_74(__invokedynamic589_73(9844, (2753004173830503551L ^ life0_3)));
    __fieldWrite589_76(__invokedynamic589_75(31452, (5003769667822412026L ^ life0_3)));
    __fieldWrite589_78(__invokedynamic589_77(172, (1595619022939200168L ^ life0_3)));
    __fieldWrite589_80(__invokedynamic589_79(1537, (2067550546528640015L ^ life0_3)));
    __fieldWrite589_82(__invokedynamic589_81(20578, (1922459227763526263L ^ life0_3)));
    __fieldWrite589_84(__invokedynamic589_83(13319, (1502167994625928747L ^ life0_3)));
    __fieldWrite589_86(__invokedynamic589_85(24897, (2294994559652232044L ^ life0_3)));
    if (!(__fieldRead589_87(life2_6))) {
        break forest_join_248;
    }
    if (!((!__fieldRead589_88(life2_6)))) {
        break forest_join_248;
    }
    forestValue589_249_0 = 1;
    break forest_join_249;
    }
    forestValue589_249_0 = 0;
    }
    __fieldWrite589_89(forestValue589_249_0);
    if (!((!__fieldRead589_90(life2_6)))) {
        break forest_join_256;
    }
    if (!(__fieldRead589_91(life2_6))) {
        break forest_join_258;
    }
    }
    forestValue589_259_0 = 1;
    break forest_join_259;
    }
    forestValue589_259_0 = 0;
    }
    __fieldWrite589_92(forestValue589_259_0);
    if (!(__fieldRead589_93())) {
        break forest_join_273;
    }
    if (!((!__fieldRead589_94(life2_6)))) {
        break forest_join_271;
    }
    if (!((!__fieldRead589_95(life2_6)))) {
        break forest_join_271;
    }
    if (!(__fieldRead589_96(life2_6))) {
        break forest_join_273;
    }
    }
    forestValue589_274_0 = 1;
    break forest_join_274;
    }
    forestValue589_274_0 = 0;
    }
    __fieldWrite589_97(forestValue589_274_0);
    if (!(__fieldRead589_98())) {
        break forest_join_473;
    }
    __fieldWrite589_101(__invokedynamic589_100(__fieldRead589_99()));
    if (!(__fieldRead589_102(life2_6))) {
        break forest_join_343;
    }
    __fieldWrite589_105(__invokedynamic589_104(__fieldRead589_103()));
    spill589_1 = 17367;
    __fieldWrite589_106(0);
    __fieldWrite589_108(__invokedynamic589_107(spill589_1, (5638334868384864708L ^ life0_3)));
    __fieldWrite589_110(__invokedynamic589_109(10456, (2329162313899553479L ^ life0_3)));
    __fieldWrite589_112(__invokedynamic589_111(32159, (7798498489105803189L ^ life0_3)));
    __fieldWrite589_114(__invokedynamic589_113(1562, (3508781039342328890L ^ life0_3)));
    __fieldWrite589_116(__invokedynamic589_115(23115, (4650880465965072479L ^ life0_3)));
    __fieldWrite589_118(__invokedynamic589_117(21206, (6090421496015735026L ^ life0_3)));
    __fieldWrite589_120(__invokedynamic589_119(24118, (3041795973276976191L ^ life0_3)));
    __fieldWrite589_122(__invokedynamic589_121(3556, (373808489056147405L ^ life0_3)));
    __fieldWrite589_124(__invokedynamic589_123(19975, (3034071922158949426L ^ life0_3)));
    break forest_join_521;
    }
    if (!(__fieldRead589_125(life2_6))) {
        break forest_join_406;
    }
    __fieldWrite589_128(__invokedynamic589_127(__fieldRead589_126()));
    spill589_2 = 5284;
    __fieldWrite589_129(1);
    __fieldWrite589_131(__invokedynamic589_130(spill589_2, (940691814301929125L ^ life0_3)));
    __fieldWrite589_133(__invokedynamic589_132(19901, (6061606596734801839L ^ life0_3)));
    __fieldWrite589_135(__invokedynamic589_134(23959, (348406343796737935L ^ life0_3)));
    __fieldWrite589_137(__invokedynamic589_136(18768, (2397232689967190870L ^ life0_3)));
    __fieldWrite589_139(__invokedynamic589_138(30069, (3094353787414474603L ^ life0_3)));
    __fieldWrite589_141(__invokedynamic589_140(12462, (3001303650102389387L ^ life0_3)));
    __fieldWrite589_143(__invokedynamic589_142(27595, (988134640812224992L ^ life0_3)));
    __fieldWrite589_145(__invokedynamic589_144(21942, (5763732542200696737L ^ life0_3)));
    __fieldWrite589_147(__invokedynamic589_146(7260, (7954898870538045053L ^ life0_3)));
    break forest_join_521;
    }
    if (!(__fieldRead589_148(life2_6))) {
        break forest_join_521;
    }
    __fieldWrite589_151(__invokedynamic589_150(__fieldRead589_149()));
    __fieldWrite589_153(__invokedynamic589_152(29994, (6590521839260135217L ^ life0_3)));
    __fieldWrite589_155(__invokedynamic589_154(5284, (940691814301929125L ^ life0_3)));
    __fieldWrite589_157(__invokedynamic589_156(19901, (6061606596734801839L ^ life0_3)));
    __fieldWrite589_159(__invokedynamic589_158(23959, (348406343796737935L ^ life0_3)));
    __fieldWrite589_161(__invokedynamic589_160(18768, (2397232689967190870L ^ life0_3)));
    __fieldWrite589_163(__invokedynamic589_162(30069, (3094353787414474603L ^ life0_3)));
    __fieldWrite589_165(__invokedynamic589_164(12462, (3001303650102389387L ^ life0_3)));
    __fieldWrite589_167(__invokedynamic589_166(27595, (988134640812224992L ^ life0_3)));
    __fieldWrite589_169(__invokedynamic589_168(21942, (5763732542200696737L ^ life0_3)));
    __fieldWrite589_171(__invokedynamic589_170(7260, (7954898870538045053L ^ life0_3)));
    break forest_join_521;
    }
    __fieldWrite589_174(__invokedynamic589_173(__fieldRead589_172()));
    spill589_3 = __fieldRead589_175();
    if (!(__fieldRead589_176(life2_6))) {
        forestValue589_482_0 = spill589_3;
        break forest_join_482;
    }
    forestValue589_483_0 = spill589_3;
    forestValue589_483_1 = "";
    break forest_join_483;
    }
    forestValue589_483_0 = forestValue589_482_0;
    forestValue589_483_1 = "not ";
    }
    __fieldWrite589_178(__invokedynamic589_177(forestValue589_483_0, forestValue589_483_1));
    spill589_4 = __fieldRead589_179();
    if (!(__fieldRead589_180(life2_6))) {
        forestValue589_491_0 = spill589_4;
        break forest_join_491;
    }
    forestValue589_492_0 = spill589_4;
    forestValue589_492_1 = "";
    break forest_join_492;
    }
    forestValue589_492_0 = forestValue589_491_0;
    forestValue589_492_1 = "not ";
    }
    __fieldWrite589_182(__invokedynamic589_181(forestValue589_492_0, forestValue589_492_1));
    spill589_5 = __fieldRead589_183();
    if (!(__fieldRead589_184(life2_6))) {
        forestValue589_500_0 = spill589_5;
        break forest_join_500;
    }
    forestValue589_501_0 = spill589_5;
    forestValue589_501_1 = "";
    break forest_join_501;
    }
    forestValue589_501_0 = forestValue589_500_0;
    forestValue589_501_1 = "not ";
    }
    __fieldWrite589_186(__invokedynamic589_185(forestValue589_501_0, forestValue589_501_1));
    spill589_6 = __fieldRead589_187();
    if (!(__fieldRead589_188(life2_6))) {
        forestValue589_509_0 = spill589_6;
        break forest_join_509;
    }
    forestValue589_510_0 = spill589_6;
    forestValue589_510_1 = "";
    break forest_join_510;
    }
    forestValue589_510_0 = forestValue589_509_0;
    forestValue589_510_1 = "not ";
    }
    __fieldWrite589_190(__invokedynamic589_189(forestValue589_510_0, forestValue589_510_1));
    spill589_7 = __fieldRead589_191();
    if (!(__fieldRead589_192(life2_6))) {
        forestValue589_518_0 = spill589_7;
        break forest_join_518;
    }
    forestValue589_519_0 = spill589_7;
    forestValue589_519_1 = "";
    break forest_join_519;
    }
    forestValue589_519_0 = forestValue589_518_0;
    forestValue589_519_1 = "not ";
    }
    __fieldWrite589_194(__invokedynamic589_193(forestValue589_519_0, forestValue589_519_1));
    }
    __fieldWrite589_196(__fieldRead589_195(life2_6));
    if (!((!__fieldRead589_197()))) {
        break forest_join_535;
    }
    if (!(__fieldRead589_198(life2_6))) {
        break forest_join_537;
    }
    if (!(__fieldRead589_199(life2_6))) {
        break forest_join_537;
    }
    if (!(__fieldRead589_200(life2_6))) {
        break forest_join_537;
    }
    }
    forestValue589_538_0 = 1;
    break forest_join_538;
    }
    forestValue589_538_0 = 0;
    }
    __fieldWrite589_201(forestValue589_538_0);
    spill589_8 = __fieldRead589_202();
    if (!(__fieldRead589_203())) {
        forestValue589_544_0 = spill589_8;
        break forest_join_544;
    }
    forestValue589_545_0 = spill589_8;
    forestValue589_545_1 = "";
    break forest_join_545;
    }
    forestValue589_545_0 = forestValue589_544_0;
    forestValue589_545_1 = "not ";
    }
    __fieldWrite589_205(__invokedynamic589_204(forestValue589_545_0, forestValue589_545_1));
    if (!(__fieldRead589_206())) {
        break forest_join_588;
    }
    if (!(__fieldRead589_207(life2_6))) {
        break forest_join_558;
    }
    __fieldWrite589_210(__invokedynamic589_209(__fieldRead589_208()));
    __fieldWrite589_211(0);
    break forest_join_563;
    }
    __fieldWrite589_214(__invokedynamic589_213(__fieldRead589_212()));
    __fieldWrite589_215(1);
    }
    __fieldWrite589_217(__invokedynamic589_216(8087, (8544937399626761607L ^ life0_3)));
    __fieldWrite589_219(__invokedynamic589_218(14728, (3519673204104700808L ^ life0_3)));
    __fieldWrite589_221(__invokedynamic589_220(27530, (4391227106602283426L ^ life0_3)));
    __fieldWrite589_223(__invokedynamic589_222(12761, (3335776007010036680L ^ life0_3)));
    break forest_join_624;
    }
    spill589_9 = __fieldRead589_224();
    if (!(__fieldRead589_225(life2_6))) {
        forestValue589_594_0 = spill589_9;
        break forest_join_594;
    }
    forestValue589_595_0 = spill589_9;
    forestValue589_595_1 = "";
    break forest_join_595;
    }
    forestValue589_595_0 = forestValue589_594_0;
    forestValue589_595_1 = "not ";
    }
    __fieldWrite589_227(__invokedynamic589_226(forestValue589_595_0, forestValue589_595_1));
    spill589_10 = __fieldRead589_228();
    if (!(__fieldRead589_229(life2_6))) {
        forestValue589_603_0 = spill589_10;
        break forest_join_603;
    }
    forestValue589_604_0 = spill589_10;
    forestValue589_604_1 = "";
    break forest_join_604;
    }
    forestValue589_604_0 = forestValue589_603_0;
    forestValue589_604_1 = "not ";
    }
    __fieldWrite589_231(__invokedynamic589_230(forestValue589_604_0, forestValue589_604_1));
    spill589_11 = __fieldRead589_232();
    if (!(__fieldRead589_233(life2_6))) {
        forestValue589_612_0 = spill589_11;
        break forest_join_612;
    }
    forestValue589_613_0 = spill589_11;
    forestValue589_613_1 = "";
    break forest_join_613;
    }
    forestValue589_613_0 = forestValue589_612_0;
    forestValue589_613_1 = "not ";
    }
    __fieldWrite589_235(__invokedynamic589_234(forestValue589_613_0, forestValue589_613_1));
    spill589_12 = __fieldRead589_236();
    if (!(__fieldRead589_237(life2_6))) {
        forestValue589_621_0 = spill589_12;
        break forest_join_621;
    }
    forestValue589_622_0 = spill589_12;
    forestValue589_622_1 = "";
    break forest_join_622;
    }
    forestValue589_622_0 = forestValue589_621_0;
    forestValue589_622_1 = "not ";
    }
    __fieldWrite589_239(__invokedynamic589_238(forestValue589_622_0, forestValue589_622_1));
    }
    if (!(__fieldRead589_240())) {
        break forest_join_630;
    }
    if (!(__fieldRead589_241())) {
        break forest_join_630;
    }
    forestValue589_631_0 = 1;
    break forest_join_631;
    }
    forestValue589_631_0 = 0;
    }
    __fieldWrite589_242(forestValue589_631_0);
    life5_656 = __call589_245(__call589_244(__invokedynamic589_243(27383, (1310575247938711747L ^ life0_3))));
    __fieldWrite589_247(__call589_246(life5_656, "nvidia"));
    if (!((!__fieldRead589_248(life2_6)))) {
        break forest_join_652;
    }
    if (!(__fieldRead589_249(life2_6))) {
        break forest_join_652;
    }
    forestValue589_653_0 = 1;
    break forest_join_653;
    }
    forestValue589_653_0 = 0;
    }
    __fieldWrite589_250(forestValue589_653_0);
    if (!((!__fieldRead589_251(life2_6)))) {
        break forest_join_659;
    }
    if (!(__fieldRead589_252())) {
        break forest_join_661;
    }
    }
    forestValue589_662_0 = 1;
    break forest_join_662;
    }
    forestValue589_662_0 = 0;
    }
    __fieldWrite589_253(forestValue589_662_0);
    spill589_13 = __fieldRead589_254();
    if (!(__fieldRead589_255())) {
        forestValue589_668_0 = spill589_13;
        break forest_join_668;
    }
    forestValue589_669_0 = spill589_13;
    forestValue589_669_1 = "";
    break forest_join_669;
    }
    forestValue589_669_0 = forestValue589_668_0;
    forestValue589_669_1 = "not ";
    }
    __fieldWrite589_257(__invokedynamic589_256(forestValue589_669_0, forestValue589_669_1));
    if (!(__fieldRead589_258())) {
        break forest_join_694;
    }
    if (!(__fieldRead589_259())) {
        break forest_join_679;
    }
    __fieldWrite589_262(__invokedynamic589_261(__fieldRead589_260()));
    break forest_join_682;
    }
    __fieldWrite589_265(__invokedynamic589_264(__fieldRead589_263()));
    }
    __fieldWrite589_267(__invokedynamic589_266(24826, (8217813575939455701L ^ life0_3)));
    __fieldWrite589_269(__invokedynamic589_268(16300, (2429779194890855854L ^ life0_3)));
    }
    __fieldWrite589_271(__call589_270(life5_656, "ati"));
    if (!(__fieldRead589_272())) {
        break forest_join_708;
    }
    if (!(__fieldRead589_273())) {
        break forest_join_705;
    }
    __fieldWrite589_274(1);
    break forest_join_708;
    }
    __call589_276(__fieldRead589_275(), 0x1.0p4f);
    }
    life6_734 = __call589_278(__call589_277(new oshi.SystemInfo()));
    spill589_14 = "%dx %s";
    java.lang.Object[] __stackOp589_279_0 = new java.lang.Object[2];
    spill589_15 = __stackOp589_279_0;
    (__stackOp589_279_0)[0] = __call589_280((life6_734).length);
    java.lang.Object[] __stackOp589_281_0 = spill589_15;
    spill589_16 = __stackOp589_281_0;
    (__stackOp589_281_0)[1] = (life6_734)[0];
    __fieldWrite589_284(__call589_283(__call589_282(spill589_14, spill589_16), "\\s+", " "));
    return;
}
public static void h589_0(java.lang.Throwable p0) throws Throwable {
    throw __call3058900_0(p0);
}
public static void h589_1(java.lang.Throwable p0) throws Throwable {
    throw __call3058901_0(p0);
}
public static void h589_2(java.lang.Throwable p0) throws Throwable {
    throw __call3058902_0(p0);
}
public static void h589_3(java.lang.Throwable p0) throws Throwable {
    throw __call3058903_0(p0);
}
public static void h589_4(java.lang.Throwable p0) throws Throwable {
    throw __call3058904_0(p0);
}
public static void h589_5(java.lang.Throwable p0) throws Throwable {
    throw __call3058905_0(p0);
}
public static void h589_6(java.lang.Throwable p0) throws Throwable {
    throw __call3058906_0(p0);
}
public static void h589_7(java.lang.Throwable p0) throws Throwable {
    throw __call3058907_0(p0);
}
public static void h589_8(java.lang.Throwable p0) throws Throwable {
    throw __call3058908_0(p0);
}
public static void h589_9(java.lang.Throwable p0) throws Throwable {
    throw __call3058909_0(p0);
}
public static void h589_10(java.lang.Throwable p0) throws Throwable {
    throw __call3058910_0(p0);
}
public static void h589_11(java.lang.Throwable p0) throws Throwable {
    throw __call3058911_0(p0);
}
public static void h589_12(java.lang.Throwable p0) throws Throwable {
    throw __call3058912_0(p0);
}
public static void h589_13(java.lang.Throwable p0) throws Throwable {
    throw __call3058913_0(p0);
}
public static void h589_14(java.lang.Throwable p0) throws Throwable {
    throw __call3058914_0(p0);
}
public static void h589_15(java.lang.Throwable p0) throws Throwable {
    throw __call3058915_0(p0);
}
public static void h589_16(java.lang.Throwable p0) throws Throwable {
    throw __call3058916_0(p0);
}
public static void h589_17(java.lang.Throwable p0) throws Throwable {
    throw __call3058917_0(p0);
}
public static void h589_18(java.lang.Throwable p0) throws Throwable {
    throw __call3058918_0(p0);
}
public static void h589_19(java.lang.Throwable p0) throws Throwable {
    throw __call3058919_0(p0);
}
public static void h589_20(java.lang.Throwable p0) throws Throwable {
    throw __call3058920_0(p0);
}
public static void h589_21(java.lang.Throwable p0) throws Throwable {
    throw __call3058921_0(p0);
}
public static void h589_22(java.lang.Throwable p0) throws Throwable {
    throw __call3058922_0(p0);
}
public static void h589_23(java.lang.Throwable p0) throws Throwable {
    throw __call3058923_0(p0);
}
public static void h589_24(java.lang.Throwable p0) throws Throwable {
    throw __call3058924_0(p0);
}
public static void h589_25(java.lang.Throwable p0) throws Throwable {
    throw __call3058925_0(p0);
}
public static void h589_26(java.lang.Throwable p0) throws Throwable {
    throw __call3058926_0(p0);
}
public static void h589_27(java.lang.Throwable p0) throws Throwable {
    throw __call3058927_0(p0);
}
public static void h589_28(java.lang.Throwable p0) throws Throwable {
    throw __call3058928_0(p0);
}
public static void h589_29(java.lang.Throwable p0) throws Throwable {
    throw __call3058929_0(p0);
}
public static void h589_30(java.lang.Throwable p0) throws Throwable {
    throw __call3058930_0(p0);
}
public static void h589_31(java.lang.Throwable p0) throws Throwable {
    throw __call3058931_0(p0);
}
public static void h589_32(java.lang.Throwable p0) throws Throwable {
    throw __call3058932_0(p0);
}
public static void h589_33(java.lang.Throwable p0) throws Throwable {
    throw __call3058933_0(p0);
}
public static void h589_34(java.lang.Throwable p0) throws Throwable {
    throw __call3058934_0(p0);
}
public static void h589_35(java.lang.Throwable p0) throws Throwable {
    throw __call3058935_0(p0);
}
public static void h589_36(java.lang.Throwable p0) throws Throwable {
    throw __call3058936_0(p0);
}
public static void h589_37(java.lang.Throwable p0) throws Throwable {
    throw __call3058937_0(p0);
}
public static void h589_38(java.lang.Throwable p0) throws Throwable {
    throw __call3058938_0(p0);
}
public static void h589_39(java.lang.Throwable p0) throws Throwable {
    throw __call3058939_0(p0);
}
public static void h589_40(java.lang.Throwable p0) throws Throwable {
    throw __call3058940_0(p0);
}
public static void h589_41(java.lang.Throwable p0) throws Throwable {
    throw __call3058941_0(p0);
}
public static void h589_42(java.lang.Throwable p0) throws Throwable {
    throw __call3058942_0(p0);
}
public static void h589_43(java.lang.Throwable p0) throws Throwable {
    throw __call3058943_0(p0);
}
public static void h589_44(java.lang.Throwable p0) throws Throwable {
    throw __call3058944_0(p0);
}
public static void h589_45(java.lang.Throwable p0) throws Throwable {
    throw __call3058945_0(p0);
}
public static void h589_46(java.lang.Throwable p0) throws Throwable {
    throw __call3058946_0(p0);
}
public static void h589_47(java.lang.Throwable p0) throws Throwable {
    throw __call3058947_0(p0);
}
public static void h589_48(java.lang.Throwable p0) throws Throwable {
    throw __call3058948_0(p0);
}
public static void h589_49(java.lang.Throwable p0) throws Throwable {
    throw __call3058949_0(p0);
}
public static void h589_50(java.lang.Throwable p0) throws Throwable {
    throw __call3058950_0(p0);
}
public static void h589_51(java.lang.Throwable p0) throws Throwable {
    java.lang.Throwable life1_2;
    life1_2 = p0;
    return;
}
private static native long __fieldRead589_0() throws Throwable;
private static native void __call589_1() throws Throwable;
private static native org.lwjgl.opengl.ContextCapabilities __call589_2() throws Throwable;
private static native boolean __fieldRead589_3(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native boolean __fieldRead589_4(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native void __fieldWrite589_5(int a0) throws Throwable;
private static native boolean __fieldRead589_6(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native boolean __fieldRead589_7(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native void __fieldWrite589_8(int a0) throws Throwable;
private static native boolean __fieldRead589_9(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native void __fieldWrite589_10(boolean a0) throws Throwable;
private static native int __invokedynamic589_11(int a0, long a1) throws Throwable;
private static native void __fieldWrite589_12(int a0) throws Throwable;
private static native int __invokedynamic589_13(int a0, long a1) throws Throwable;
private static native void __fieldWrite589_14(int a0) throws Throwable;
private static native boolean __fieldRead589_15() throws Throwable;
private static native boolean __fieldRead589_16(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native boolean __fieldRead589_17(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native int __integerCategory589_18(boolean value) throws Throwable;
private static native void __fieldWrite589_19(int a0) throws Throwable;
private static native boolean __fieldRead589_20() throws Throwable;
private static native boolean __call589_21(java.util.ArrayList a0, java.lang.String a1) throws Throwable;
private static native boolean __call589_22(java.util.ArrayList a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call589_23(java.util.ArrayList a0) throws Throwable;
private static native java.lang.String __invokedynamic589_24(java.lang.String a0) throws Throwable;
private static native void __call589_25(java.lang.String a0) throws Throwable;
private static native java.lang.String __fieldRead589_26() throws Throwable;
private static native java.lang.String __invokedynamic589_27(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite589_28(java.lang.String a0) throws Throwable;
private static native boolean __fieldRead589_29() throws Throwable;
private static native java.lang.String __fieldRead589_30() throws Throwable;
private static native java.lang.String __invokedynamic589_31(java.lang.String a0) throws Throwable;
private static native void __fieldWrite589_32(java.lang.String a0) throws Throwable;
private static native java.lang.String __fieldRead589_33() throws Throwable;
private static native java.lang.String __invokedynamic589_34(java.lang.String a0) throws Throwable;
private static native void __fieldWrite589_35(java.lang.String a0) throws Throwable;
private static native int __invokedynamic589_36(int a0, long a1) throws Throwable;
private static native void __fieldWrite589_37(int a0) throws Throwable;
private static native int __invokedynamic589_38(int a0, long a1) throws Throwable;
private static native void __fieldWrite589_39(int a0) throws Throwable;
private static native int __invokedynamic589_40(int a0, long a1) throws Throwable;
private static native void __fieldWrite589_41(int a0) throws Throwable;
private static native boolean __fieldRead589_42() throws Throwable;
private static native java.lang.String __fieldRead589_43() throws Throwable;
private static native java.lang.String __invokedynamic589_44(java.lang.String a0) throws Throwable;
private static native void __fieldWrite589_45(java.lang.String a0) throws Throwable;
private static native java.lang.String __fieldRead589_46() throws Throwable;
private static native java.lang.String __invokedynamic589_47(java.lang.String a0) throws Throwable;
private static native void __fieldWrite589_48(java.lang.String a0) throws Throwable;
private static native int __invokedynamic589_49(int a0, long a1) throws Throwable;
private static native void __fieldWrite589_50(int a0) throws Throwable;
private static native int __invokedynamic589_51(int a0, long a1) throws Throwable;
private static native void __fieldWrite589_52(int a0) throws Throwable;
private static native int __invokedynamic589_53(int a0, long a1) throws Throwable;
private static native void __fieldWrite589_54(int a0) throws Throwable;
private static native int __invokedynamic589_55(int a0, long a1) throws Throwable;
private static native void __fieldWrite589_56(int a0) throws Throwable;
private static native int __invokedynamic589_57(int a0, long a1) throws Throwable;
private static native void __fieldWrite589_58(int a0) throws Throwable;
private static native int __invokedynamic589_59(int a0, long a1) throws Throwable;
private static native void __fieldWrite589_60(int a0) throws Throwable;
private static native int __invokedynamic589_61(int a0, long a1) throws Throwable;
private static native void __fieldWrite589_62(int a0) throws Throwable;
private static native int __invokedynamic589_63(int a0, long a1) throws Throwable;
private static native void __fieldWrite589_64(int a0) throws Throwable;
private static native int __invokedynamic589_65(int a0, long a1) throws Throwable;
private static native void __fieldWrite589_66(int a0) throws Throwable;
private static native int __invokedynamic589_67(int a0, long a1) throws Throwable;
private static native void __fieldWrite589_68(int a0) throws Throwable;
private static native int __invokedynamic589_69(int a0, long a1) throws Throwable;
private static native void __fieldWrite589_70(int a0) throws Throwable;
private static native int __invokedynamic589_71(int a0, long a1) throws Throwable;
private static native void __fieldWrite589_72(int a0) throws Throwable;
private static native int __invokedynamic589_73(int a0, long a1) throws Throwable;
private static native void __fieldWrite589_74(int a0) throws Throwable;
private static native int __invokedynamic589_75(int a0, long a1) throws Throwable;
private static native void __fieldWrite589_76(int a0) throws Throwable;
private static native int __invokedynamic589_77(int a0, long a1) throws Throwable;
private static native void __fieldWrite589_78(int a0) throws Throwable;
private static native int __invokedynamic589_79(int a0, long a1) throws Throwable;
private static native void __fieldWrite589_80(int a0) throws Throwable;
private static native int __invokedynamic589_81(int a0, long a1) throws Throwable;
private static native void __fieldWrite589_82(int a0) throws Throwable;
private static native int __invokedynamic589_83(int a0, long a1) throws Throwable;
private static native void __fieldWrite589_84(int a0) throws Throwable;
private static native int __invokedynamic589_85(int a0, long a1) throws Throwable;
private static native void __fieldWrite589_86(int a0) throws Throwable;
private static native boolean __fieldRead589_87(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native boolean __fieldRead589_88(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native void __fieldWrite589_89(int a0) throws Throwable;
private static native boolean __fieldRead589_90(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native boolean __fieldRead589_91(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native void __fieldWrite589_92(int a0) throws Throwable;
private static native boolean __fieldRead589_93() throws Throwable;
private static native boolean __fieldRead589_94(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native boolean __fieldRead589_95(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native boolean __fieldRead589_96(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native void __fieldWrite589_97(int a0) throws Throwable;
private static native boolean __fieldRead589_98() throws Throwable;
private static native java.lang.String __fieldRead589_99() throws Throwable;
private static native java.lang.String __invokedynamic589_100(java.lang.String a0) throws Throwable;
private static native void __fieldWrite589_101(java.lang.String a0) throws Throwable;
private static native boolean __fieldRead589_102(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.String __fieldRead589_103() throws Throwable;
private static native java.lang.String __invokedynamic589_104(java.lang.String a0) throws Throwable;
private static native void __fieldWrite589_105(java.lang.String a0) throws Throwable;
private static native void __fieldWrite589_106(int a0) throws Throwable;
private static native int __invokedynamic589_107(int a0, long a1) throws Throwable;
private static native void __fieldWrite589_108(int a0) throws Throwable;
private static native int __invokedynamic589_109(int a0, long a1) throws Throwable;
private static native void __fieldWrite589_110(int a0) throws Throwable;
private static native int __invokedynamic589_111(int a0, long a1) throws Throwable;
private static native void __fieldWrite589_112(int a0) throws Throwable;
private static native int __invokedynamic589_113(int a0, long a1) throws Throwable;
private static native void __fieldWrite589_114(int a0) throws Throwable;
private static native int __invokedynamic589_115(int a0, long a1) throws Throwable;
private static native void __fieldWrite589_116(int a0) throws Throwable;
private static native int __invokedynamic589_117(int a0, long a1) throws Throwable;
private static native void __fieldWrite589_118(int a0) throws Throwable;
private static native int __invokedynamic589_119(int a0, long a1) throws Throwable;
private static native void __fieldWrite589_120(int a0) throws Throwable;
private static native int __invokedynamic589_121(int a0, long a1) throws Throwable;
private static native void __fieldWrite589_122(int a0) throws Throwable;
private static native int __invokedynamic589_123(int a0, long a1) throws Throwable;
private static native void __fieldWrite589_124(int a0) throws Throwable;
private static native boolean __fieldRead589_125(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.String __fieldRead589_126() throws Throwable;
private static native java.lang.String __invokedynamic589_127(java.lang.String a0) throws Throwable;
private static native void __fieldWrite589_128(java.lang.String a0) throws Throwable;
private static native void __fieldWrite589_129(int a0) throws Throwable;
private static native int __invokedynamic589_130(int a0, long a1) throws Throwable;
private static native void __fieldWrite589_131(int a0) throws Throwable;
private static native int __invokedynamic589_132(int a0, long a1) throws Throwable;
private static native void __fieldWrite589_133(int a0) throws Throwable;
private static native int __invokedynamic589_134(int a0, long a1) throws Throwable;
private static native void __fieldWrite589_135(int a0) throws Throwable;
private static native int __invokedynamic589_136(int a0, long a1) throws Throwable;
private static native void __fieldWrite589_137(int a0) throws Throwable;
private static native int __invokedynamic589_138(int a0, long a1) throws Throwable;
private static native void __fieldWrite589_139(int a0) throws Throwable;
private static native int __invokedynamic589_140(int a0, long a1) throws Throwable;
private static native void __fieldWrite589_141(int a0) throws Throwable;
private static native int __invokedynamic589_142(int a0, long a1) throws Throwable;
private static native void __fieldWrite589_143(int a0) throws Throwable;
private static native int __invokedynamic589_144(int a0, long a1) throws Throwable;
private static native void __fieldWrite589_145(int a0) throws Throwable;
private static native int __invokedynamic589_146(int a0, long a1) throws Throwable;
private static native void __fieldWrite589_147(int a0) throws Throwable;
private static native boolean __fieldRead589_148(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.String __fieldRead589_149() throws Throwable;
private static native java.lang.String __invokedynamic589_150(java.lang.String a0) throws Throwable;
private static native void __fieldWrite589_151(java.lang.String a0) throws Throwable;
private static native int __invokedynamic589_152(int a0, long a1) throws Throwable;
private static native void __fieldWrite589_153(int a0) throws Throwable;
private static native int __invokedynamic589_154(int a0, long a1) throws Throwable;
private static native void __fieldWrite589_155(int a0) throws Throwable;
private static native int __invokedynamic589_156(int a0, long a1) throws Throwable;
private static native void __fieldWrite589_157(int a0) throws Throwable;
private static native int __invokedynamic589_158(int a0, long a1) throws Throwable;
private static native void __fieldWrite589_159(int a0) throws Throwable;
private static native int __invokedynamic589_160(int a0, long a1) throws Throwable;
private static native void __fieldWrite589_161(int a0) throws Throwable;
private static native int __invokedynamic589_162(int a0, long a1) throws Throwable;
private static native void __fieldWrite589_163(int a0) throws Throwable;
private static native int __invokedynamic589_164(int a0, long a1) throws Throwable;
private static native void __fieldWrite589_165(int a0) throws Throwable;
private static native int __invokedynamic589_166(int a0, long a1) throws Throwable;
private static native void __fieldWrite589_167(int a0) throws Throwable;
private static native int __invokedynamic589_168(int a0, long a1) throws Throwable;
private static native void __fieldWrite589_169(int a0) throws Throwable;
private static native int __invokedynamic589_170(int a0, long a1) throws Throwable;
private static native void __fieldWrite589_171(int a0) throws Throwable;
private static native java.lang.String __fieldRead589_172() throws Throwable;
private static native java.lang.String __invokedynamic589_173(java.lang.String a0) throws Throwable;
private static native void __fieldWrite589_174(java.lang.String a0) throws Throwable;
private static native java.lang.String __fieldRead589_175() throws Throwable;
private static native boolean __fieldRead589_176(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.String __invokedynamic589_177(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite589_178(java.lang.String a0) throws Throwable;
private static native java.lang.String __fieldRead589_179() throws Throwable;
private static native boolean __fieldRead589_180(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.String __invokedynamic589_181(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite589_182(java.lang.String a0) throws Throwable;
private static native java.lang.String __fieldRead589_183() throws Throwable;
private static native boolean __fieldRead589_184(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.String __invokedynamic589_185(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite589_186(java.lang.String a0) throws Throwable;
private static native java.lang.String __fieldRead589_187() throws Throwable;
private static native boolean __fieldRead589_188(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.String __invokedynamic589_189(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite589_190(java.lang.String a0) throws Throwable;
private static native java.lang.String __fieldRead589_191() throws Throwable;
private static native boolean __fieldRead589_192(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.String __invokedynamic589_193(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite589_194(java.lang.String a0) throws Throwable;
private static native boolean __fieldRead589_195(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native void __fieldWrite589_196(boolean a0) throws Throwable;
private static native boolean __fieldRead589_197() throws Throwable;
private static native boolean __fieldRead589_198(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native boolean __fieldRead589_199(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native boolean __fieldRead589_200(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native void __fieldWrite589_201(int a0) throws Throwable;
private static native java.lang.String __fieldRead589_202() throws Throwable;
private static native boolean __fieldRead589_203() throws Throwable;
private static native java.lang.String __invokedynamic589_204(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite589_205(java.lang.String a0) throws Throwable;
private static native boolean __fieldRead589_206() throws Throwable;
private static native boolean __fieldRead589_207(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.String __fieldRead589_208() throws Throwable;
private static native java.lang.String __invokedynamic589_209(java.lang.String a0) throws Throwable;
private static native void __fieldWrite589_210(java.lang.String a0) throws Throwable;
private static native void __fieldWrite589_211(int a0) throws Throwable;
private static native java.lang.String __fieldRead589_212() throws Throwable;
private static native java.lang.String __invokedynamic589_213(java.lang.String a0) throws Throwable;
private static native void __fieldWrite589_214(java.lang.String a0) throws Throwable;
private static native void __fieldWrite589_215(int a0) throws Throwable;
private static native int __invokedynamic589_216(int a0, long a1) throws Throwable;
private static native void __fieldWrite589_217(int a0) throws Throwable;
private static native int __invokedynamic589_218(int a0, long a1) throws Throwable;
private static native void __fieldWrite589_219(int a0) throws Throwable;
private static native int __invokedynamic589_220(int a0, long a1) throws Throwable;
private static native void __fieldWrite589_221(int a0) throws Throwable;
private static native int __invokedynamic589_222(int a0, long a1) throws Throwable;
private static native void __fieldWrite589_223(int a0) throws Throwable;
private static native java.lang.String __fieldRead589_224() throws Throwable;
private static native boolean __fieldRead589_225(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.String __invokedynamic589_226(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite589_227(java.lang.String a0) throws Throwable;
private static native java.lang.String __fieldRead589_228() throws Throwable;
private static native boolean __fieldRead589_229(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.String __invokedynamic589_230(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite589_231(java.lang.String a0) throws Throwable;
private static native java.lang.String __fieldRead589_232() throws Throwable;
private static native boolean __fieldRead589_233(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.String __invokedynamic589_234(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite589_235(java.lang.String a0) throws Throwable;
private static native java.lang.String __fieldRead589_236() throws Throwable;
private static native boolean __fieldRead589_237(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.String __invokedynamic589_238(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite589_239(java.lang.String a0) throws Throwable;
private static native boolean __fieldRead589_240() throws Throwable;
private static native boolean __fieldRead589_241() throws Throwable;
private static native void __fieldWrite589_242(int a0) throws Throwable;
private static native int __invokedynamic589_243(int a0, long a1) throws Throwable;
private static native java.lang.String __call589_244(int a0) throws Throwable;
private static native java.lang.String __call589_245(java.lang.String a0) throws Throwable;
private static native boolean __call589_246(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite589_247(boolean a0) throws Throwable;
private static native boolean __fieldRead589_248(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native boolean __fieldRead589_249(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native void __fieldWrite589_250(int a0) throws Throwable;
private static native boolean __fieldRead589_251(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native boolean __fieldRead589_252() throws Throwable;
private static native void __fieldWrite589_253(int a0) throws Throwable;
private static native java.lang.String __fieldRead589_254() throws Throwable;
private static native boolean __fieldRead589_255() throws Throwable;
private static native java.lang.String __invokedynamic589_256(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite589_257(java.lang.String a0) throws Throwable;
private static native boolean __fieldRead589_258() throws Throwable;
private static native boolean __fieldRead589_259() throws Throwable;
private static native java.lang.String __fieldRead589_260() throws Throwable;
private static native java.lang.String __invokedynamic589_261(java.lang.String a0) throws Throwable;
private static native void __fieldWrite589_262(java.lang.String a0) throws Throwable;
private static native java.lang.String __fieldRead589_263() throws Throwable;
private static native java.lang.String __invokedynamic589_264(java.lang.String a0) throws Throwable;
private static native void __fieldWrite589_265(java.lang.String a0) throws Throwable;
private static native int __invokedynamic589_266(int a0, long a1) throws Throwable;
private static native void __fieldWrite589_267(int a0) throws Throwable;
private static native int __invokedynamic589_268(int a0, long a1) throws Throwable;
private static native void __fieldWrite589_269(int a0) throws Throwable;
private static native boolean __call589_270(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite589_271(boolean a0) throws Throwable;
private static native boolean __fieldRead589_272() throws Throwable;
private static native boolean __fieldRead589_273() throws Throwable;
private static native void __fieldWrite589_274(int a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings$Options __fieldRead589_275() throws Throwable;
private static native void __call589_276(net.minecraft.client.settings.GameSettings$Options a0, float a1) throws Throwable;
private static native oshi.hardware.HardwareAbstractionLayer __call589_277(oshi.SystemInfo a0) throws Throwable;
private static native oshi.hardware.Processor[] __call589_278(oshi.hardware.HardwareAbstractionLayer a0) throws Throwable;
private static native java.lang.Integer __call589_280(int a0) throws Throwable;
private static native java.lang.String __call589_282(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native java.lang.String __call589_283(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native void __fieldWrite589_284(java.lang.String a0) throws Throwable;
private static native java.lang.Throwable __call3058900_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3058901_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3058902_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3058903_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3058904_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3058905_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3058906_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3058907_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3058908_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3058909_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3058910_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3058911_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3058912_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3058913_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3058914_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3058915_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3058916_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3058917_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3058918_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3058919_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3058920_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3058921_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3058922_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3058923_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3058924_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3058925_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3058926_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3058927_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3058928_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3058929_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3058930_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3058931_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3058932_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3058933_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3058934_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3058935_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3058936_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3058937_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3058938_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3058939_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3058940_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3058941_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3058942_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3058943_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3058944_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3058945_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3058946_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3058947_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3058948_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3058949_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3058950_0(java.lang.Throwable a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_5317d492abf9a19765a2(int a0) throws E;
private static final class __SourceHandler_5317d492abf9a19765a2 {

public static void f100183(int p0) throws Throwable {
    forest_join_7: {
    forest_join_5: {
    if (!(__fieldRead100183_0())) {
        break forest_join_5;
    }
    __call100183_1(p0);
    break forest_join_7;
    }
    __call100183_2(p0);
    }
    return;
}
public static void h100183_0(moom.Oo p0) throws Throwable {
    throw __call13018300_0(p0);
}
private static native boolean __fieldRead100183_0() throws Throwable;
private static native void __call100183_1(int a0) throws Throwable;
private static native void __call100183_2(int a0) throws Throwable;
private static native java.lang.Throwable __call13018300_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_285f4a5630aacfaf2bb6(int a0, int a1) throws E;
private static final class __SourceHandler_285f4a5630aacfaf2bb6 {

public static void f100191(int p0, int p1) throws Throwable {
    forest_join_9: {
    forest_join_6: {
    if (!(__fieldRead100191_0())) {
        break forest_join_6;
    }
    __call100191_1(p0, p1);
    break forest_join_9;
    }
    __call100191_2(p0, p1);
    }
    return;
}
public static void h100191_0(moom.Oo p0) throws Throwable {
    throw __call13019100_0(p0);
}
private static native boolean __fieldRead100191_0() throws Throwable;
private static native void __call100191_1(int a0, int a1) throws Throwable;
private static native void __call100191_2(int a0, int a1) throws Throwable;
private static native java.lang.Throwable __call13019100_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_e42434c81c1c0fcdbe2c() throws E;
private static final class __SourceHandler_e42434c81c1c0fcdbe2c {

public static int f100162() throws Throwable {
    int forestValue100162_5_0;
    forest_join_5: {
    forest_join_4: {
    if (!(__fieldRead100162_0())) {
        break forest_join_4;
    }
    forestValue100162_5_0 = __call100162_1();
    break forest_join_5;
    }
    forestValue100162_5_0 = __call100162_2();
    }
    return forestValue100162_5_0;
}
public static int h100162_0(moom.Oo p0) throws Throwable {
    throw __call13016200_0(p0);
}
private static native boolean __fieldRead100162_0() throws Throwable;
private static native int __call100162_1() throws Throwable;
private static native int __call100162_2() throws Throwable;
private static native java.lang.Throwable __call13016200_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_caa131f6bac5ba34fdc4(int a0) throws E;
private static final class __SourceHandler_caa131f6bac5ba34fdc4 {

public static int f100161(int p0) throws Throwable {
    forest_join_15: {
    forest_join_12: {
    forest_join_9: {
    forest_join_6: {
    forest_join_4: {
    if (!((!__fieldRead100161_0()))) {
        break forest_join_4;
    }
    return -1;
    }
    switch (__fieldRead100161_1()) {
case 0:
{
        break forest_join_6;
    }
case 1:
{
        break forest_join_9;
    }
case 2:
{
        break forest_join_12;
    }
default:
{
        break forest_join_15;
    }
}
    }
    return __call100161_2(p0);
    }
    return __call100161_3(p0);
    }
    return __call100161_4(p0);
    }
    return -1;
}
public static int h100161_0(moom.Oo p0) throws Throwable {
    throw __call13016100_0(p0);
}
public static int h100161_1(moom.Oo p0) throws Throwable {
    throw __call13016101_0(p0);
}
private static native boolean __fieldRead100161_0() throws Throwable;
private static native int __fieldRead100161_1() throws Throwable;
private static native int __call100161_2(int a0) throws Throwable;
private static native int __call100161_3(int a0) throws Throwable;
private static native int __call100161_4(int a0) throws Throwable;
private static native java.lang.Throwable __call13016100_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call13016101_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_17e4df4902a432d06c5f(int a0, int a1) throws E;
private static final class __SourceHandler_17e4df4902a432d06c5f {

public static int f100165(int p0, int p1) throws Throwable {
    int forestValue100165_9_0;
    forest_join_9: {
    forest_join_6: {
    if (!(__fieldRead100165_0())) {
        break forest_join_6;
    }
    forestValue100165_9_0 = __call100165_1(p0, p1);
    break forest_join_9;
    }
    forestValue100165_9_0 = __call100165_2(p0, p1);
    }
    return forestValue100165_9_0;
}
public static int h100165_0(moom.Oo p0) throws Throwable {
    throw __call13016500_0(p0);
}
private static native boolean __fieldRead100165_0() throws Throwable;
private static native int __call100165_1(int a0, int a1) throws Throwable;
private static native int __call100165_2(int a0, int a1) throws Throwable;
private static native java.lang.Throwable __call13016500_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_e8d6eada059db258e533(int a0, int a1, int a2, int a3) throws E;
private static final class __SourceHandler_e8d6eada059db258e533 {

public static void f590(int p0, int p1, int p2, int p3) throws Throwable {
    forest_join_21: {
    forest_join_16: {
    forest_join_10: {
    forest_join_4: {
    if (!(__fieldRead590_0())) {
        break forest_join_21;
    }
    switch (__fieldRead590_1()) {
case 0:
{
        break forest_join_4;
    }
case 1:
{
        break forest_join_10;
    }
case 2:
{
        break forest_join_16;
    }
default:
{
        break forest_join_21;
    }
}
    }
    __call590_2(p0, p1, p2, p3);
    break forest_join_21;
    }
    __call590_3(p0, p1, p2, p3);
    break forest_join_21;
    }
    __call590_4(p0, p1, p2, p3);
    }
    return;
}
public static void h590_0(moom.Oo p0) throws Throwable {
    throw __call3059000_0(p0);
}
public static void h590_1(moom.Oo p0) throws Throwable {
    throw __call3059001_0(p0);
}
private static native boolean __fieldRead590_0() throws Throwable;
private static native int __fieldRead590_1() throws Throwable;
private static native void __call590_2(int a0, int a1, int a2, int a3) throws Throwable;
private static native void __call590_3(int a0, int a1, int a2, int a3) throws Throwable;
private static native void __call590_4(int a0, int a1, int a2, int a3) throws Throwable;
private static native java.lang.Throwable __call3059000_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3059001_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_9d9525acff9543b70dd6(int a0, java.lang.CharSequence a1) throws E;
private static final class __SourceHandler_9d9525acff9543b70dd6 {

public static int f100156(int p0, java.lang.CharSequence p1) throws Throwable {
    int forestValue100156_9_0;
    forest_join_9: {
    forest_join_6: {
    if (!(__fieldRead100156_0())) {
        break forest_join_6;
    }
    forestValue100156_9_0 = __call100156_1(p0, p1);
    break forest_join_9;
    }
    forestValue100156_9_0 = __call100156_2(p0, p1);
    }
    return forestValue100156_9_0;
}
public static int h100156_0(moom.Oo p0) throws Throwable {
    throw __call13015600_0(p0);
}
private static native boolean __fieldRead100156_0() throws Throwable;
private static native int __call100156_1(int a0, java.lang.CharSequence a1) throws Throwable;
private static native int __call100156_2(int a0, java.lang.CharSequence a1) throws Throwable;
private static native java.lang.Throwable __call13015600_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_9939c643da9325d3b78d(int a0, java.nio.FloatBuffer a1) throws E;
private static final class __SourceHandler_9939c643da9325d3b78d {

public static void f100158(int p0, java.nio.FloatBuffer p1) throws Throwable {
    forest_join_9: {
    forest_join_6: {
    if (!(__fieldRead100158_0())) {
        break forest_join_6;
    }
    __call100158_1(p0, p1);
    break forest_join_9;
    }
    __call100158_2(p0, p1);
    }
    return;
}
public static void h100158_0(moom.Oo p0) throws Throwable {
    throw __call13015800_0(p0);
}
private static native boolean __fieldRead100158_0() throws Throwable;
private static native void __call100158_1(int a0, java.nio.FloatBuffer a1) throws Throwable;
private static native void __call100158_2(int a0, java.nio.FloatBuffer a1) throws Throwable;
private static native java.lang.Throwable __call13015800_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_d7ecd4e2e77096b7d1a2(int a0, java.nio.IntBuffer a1) throws E;
private static final class __SourceHandler_d7ecd4e2e77096b7d1a2 {

public static void f100159(int p0, java.nio.IntBuffer p1) throws Throwable {
    forest_join_9: {
    forest_join_6: {
    if (!(__fieldRead100159_0())) {
        break forest_join_6;
    }
    __call100159_1(p0, p1);
    break forest_join_9;
    }
    __call100159_2(p0, p1);
    }
    return;
}
public static void h100159_0(moom.Oo p0) throws Throwable {
    throw __call13015900_0(p0);
}
private static native boolean __fieldRead100159_0() throws Throwable;
private static native void __call100159_1(int a0, java.nio.IntBuffer a1) throws Throwable;
private static native void __call100159_2(int a0, java.nio.IntBuffer a1) throws Throwable;
private static native java.lang.Throwable __call13015900_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_ec0caa2fe91fb3d5b243(int a0, boolean a1, java.nio.FloatBuffer a2) throws E;
private static final class __SourceHandler_ec0caa2fe91fb3d5b243 {

public static void f100157(int p0, boolean p1, java.nio.FloatBuffer p2) throws Throwable {
    forest_join_11: {
    forest_join_7: {
    if (!(__fieldRead100157_0())) {
        break forest_join_7;
    }
    __call100157_1(p0, p1, p2);
    break forest_join_11;
    }
    __call100157_2(p0, p1, p2);
    }
    return;
}
public static void h100157_0(moom.Oo p0) throws Throwable {
    throw __call13015700_0(p0);
}
private static native boolean __fieldRead100157_0() throws Throwable;
private static native void __call100157_1(int a0, boolean a1, java.nio.FloatBuffer a2) throws Throwable;
private static native void __call100157_2(int a0, boolean a1, java.nio.FloatBuffer a2) throws Throwable;
private static native java.lang.Throwable __call13015700_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_58e0782d2f8487b5b16d() throws E;
private static final class __SourceHandler_58e0782d2f8487b5b16d {

public static boolean f1398() throws Throwable {
    int forwardValue1398_15_0;
    forward_join_15: {
    forward_join_14: {
    forward_join_6: {
    if (!((!__call1398_0()))) {
        break forward_join_14;
    }
    if (!(__call1398_1())) {
        break forward_join_6;
    }
    if (!(__fieldRead1398_2())) {
        break forward_join_14;
    }
    }
    if (!(__fieldRead1398_3())) {
        break forward_join_14;
    }
    if (!(__fieldRead1398_6(__fieldRead1398_5(__call1398_4())))) {
        break forward_join_14;
    }
    forwardValue1398_15_0 = 1;
    break forward_join_15;
    }
    forwardValue1398_15_0 = 0;
    }
    return __integerCategory1398_7(forwardValue1398_15_0);
}
public static void h1398_0(moom.Oo p0) throws Throwable {
    throw __call1139800_0(p0);
}
public static void h1398_1(moom.Oo p0) throws Throwable {
    throw __call1139801_0(p0);
}
public static void h1398_2(moom.Oo p0) throws Throwable {
    throw __call1139802_0(p0);
}
public static void h1398_3(moom.Oo p0) throws Throwable {
    throw __call1139803_0(p0);
}
public static void h1398_4(moom.Oo p0) throws Throwable {
    throw __call1139804_0(p0);
}
private static native boolean __call1398_0() throws Throwable;
private static native boolean __call1398_1() throws Throwable;
private static native boolean __fieldRead1398_2() throws Throwable;
private static native boolean __fieldRead1398_3() throws Throwable;
private static native net.minecraft.client.Minecraft __call1398_4() throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead1398_5(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __fieldRead1398_6(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native boolean __integerCategory1398_7(int value) throws Throwable;
private static native java.lang.Throwable __call1139800_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1139801_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1139802_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1139803_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1139804_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_f157995d82b6e56ab86c() throws E;
private static final class __SourceHandler_f157995d82b6e56ab86c {

public static java.lang.String f2488() throws Throwable {
    return ((__fieldRead2488_0() == null) ? "<unknown>" : __fieldRead2488_1());
}
public static void h2488_0(moom.Oo p0) throws Throwable {
    throw __call1248800_0(p0);
}
private static native java.lang.String __fieldRead2488_0() throws Throwable;
private static native java.lang.String __fieldRead2488_1() throws Throwable;
private static native java.lang.Throwable __call1248800_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_e634756dacb23c57f3e0(int a0, int a1) throws E;
private static final class __SourceHandler_e634756dacb23c57f3e0 {

public static java.lang.String f100164(int p0, int p1) throws Throwable {
    java.lang.String forestValue100164_9_0;
    forest_join_9: {
    forest_join_6: {
    if (!(__fieldRead100164_0())) {
        break forest_join_6;
    }
    forestValue100164_9_0 = __call100164_1(p0, p1);
    break forest_join_9;
    }
    forestValue100164_9_0 = __call100164_2(p0, p1);
    }
    return forestValue100164_9_0;
}
public static java.lang.String h100164_0(moom.Oo p0) throws Throwable {
    throw __call13016400_0(p0);
}
private static native boolean __fieldRead100164_0() throws Throwable;
private static native java.lang.String __call100164_1(int a0, int a1) throws Throwable;
private static native java.lang.String __call100164_2(int a0, int a1) throws Throwable;
private static native java.lang.Throwable __call13016400_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_b9f7e20aed9d42a1d147(int a0) throws E;
private static final class __SourceHandler_b9f7e20aed9d42a1d147 {

public static void f100163(int p0) throws Throwable {
    forest_join_7: {
    forest_join_5: {
    if (!(__fieldRead100163_0())) {
        break forest_join_5;
    }
    __call100163_1(p0);
    break forest_join_7;
    }
    __call100163_2(p0);
    }
    return;
}
public static void h100163_0(moom.Oo p0) throws Throwable {
    throw __call13016300_0(p0);
}
private static native boolean __fieldRead100163_0() throws Throwable;
private static native void __call100163_1(int a0) throws Throwable;
private static native void __call100163_2(int a0) throws Throwable;
private static native java.lang.Throwable __call13016300_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_f598e7393256f3baec7d(int a0, int a1) throws E;
private static final class __SourceHandler_f598e7393256f3baec7d {

public static void f100160(int p0, int p1) throws Throwable {
    forest_join_9: {
    forest_join_6: {
    if (!(__fieldRead100160_0())) {
        break forest_join_6;
    }
    __call100160_1(p0, p1);
    break forest_join_9;
    }
    __call100160_2(p0, p1);
    }
    return;
}
public static void h100160_0(moom.Oo p0) throws Throwable {
    throw __call13016000_0(p0);
}
private static native boolean __fieldRead100160_0() throws Throwable;
private static native void __call100160_1(int a0, int a1) throws Throwable;
private static native void __call100160_2(int a0, int a1) throws Throwable;
private static native java.lang.Throwable __call13016000_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_e0ae702766ee55f9e994() throws E;
private static final class __SourceHandler_e0ae702766ee55f9e994 {

public static int f100171() throws Throwable {
    forest_join_12: {
    forest_join_10: {
    forest_join_8: {
    forest_join_6: {
    forest_join_4: {
    if (!((!__fieldRead100171_0()))) {
        break forest_join_4;
    }
    return -1;
    }
    switch (__fieldRead100171_1()) {
case 0:
{
        break forest_join_6;
    }
case 1:
{
        break forest_join_8;
    }
case 2:
{
        break forest_join_10;
    }
default:
{
        break forest_join_12;
    }
}
    }
    return __call100171_2();
    }
    return __call100171_3();
    }
    return __call100171_4();
    }
    return -1;
}
public static int h100171_0(moom.Oo p0) throws Throwable {
    throw __call13017100_0(p0);
}
public static int h100171_1(moom.Oo p0) throws Throwable {
    throw __call13017101_0(p0);
}
private static native boolean __fieldRead100171_0() throws Throwable;
private static native int __fieldRead100171_1() throws Throwable;
private static native int __call100171_2() throws Throwable;
private static native int __call100171_3() throws Throwable;
private static native int __call100171_4() throws Throwable;
private static native java.lang.Throwable __call13017100_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call13017101_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_e8d4f156aa91bbb6a4e2(int a0) throws E;
private static final class __SourceHandler_e8d4f156aa91bbb6a4e2 {

public static void f100172(int p0) throws Throwable {
    forest_join_7: {
    forest_join_5: {
    if (!(__fieldRead100172_0())) {
        break forest_join_5;
    }
    __call100172_1(p0);
    break forest_join_7;
    }
    __call100172_2(p0);
    }
    return;
}
public static void h100172_0(moom.Oo p0) throws Throwable {
    throw __call13017200_0(p0);
}
private static native boolean __fieldRead100172_0() throws Throwable;
private static native void __call100172_1(int a0) throws Throwable;
private static native void __call100172_2(int a0) throws Throwable;
private static native java.lang.Throwable __call13017200_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_6a9635fb21e0b2e69273(int a0, int a1) throws E;
private static final class __SourceHandler_6a9635fb21e0b2e69273 {

public static void f100167(int p0, int p1) throws Throwable {
    forest_join_9: {
    forest_join_6: {
    if (!(__fieldRead100167_0())) {
        break forest_join_6;
    }
    __call100167_1(p0, p1);
    break forest_join_9;
    }
    __call100167_2(p0, p1);
    }
    return;
}
public static void h100167_0(moom.Oo p0) throws Throwable {
    throw __call13016700_0(p0);
}
private static native boolean __fieldRead100167_0() throws Throwable;
private static native void __call100167_1(int a0, int a1) throws Throwable;
private static native void __call100167_2(int a0, int a1) throws Throwable;
private static native java.lang.Throwable __call13016700_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_59c54829a9728463c244(int a0, int a1, int a2, int a3) throws E;
private static final class __SourceHandler_59c54829a9728463c244 {

public static void f1399(int p0, int p1, int p2, int p3) throws Throwable {
    forward_join_19: {
    forward_join_16: {
    forward_join_10: {
    if (!(__fieldRead1399_0())) { break forward_join_16; }
    if (!(__fieldRead1399_1())) { break forward_join_10; }
    __call1399_2(p0, p1, p2, p3);
    break forward_join_19;
    }
    __call1399_3(p0, p1, p2, p3);
    break forward_join_19;
    }
    __call1399_4(p0, p1);
    }
    return;
}
public static void h1399_0(moom.Oo p0) throws Throwable {
    throw __call1139900_0(p0);
}
public static void h1399_1(moom.Oo p0) throws Throwable {
    throw __call1139901_0(p0);
}
private static native boolean __fieldRead1399_0() throws Throwable;
private static native boolean __fieldRead1399_1() throws Throwable;
private static native void __call1399_2(int a0, int a1, int a2, int a3) throws Throwable;
private static native void __call1399_3(int a0, int a1, int a2, int a3) throws Throwable;
private static native void __call1399_4(int a0, int a1) throws Throwable;
private static native java.lang.Throwable __call1139900_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1139901_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_8d64e1dd64e87ca2451e(int a0, java.nio.FloatBuffer a1) throws E;
private static final class __SourceHandler_8d64e1dd64e87ca2451e {

public static void f100170(int p0, java.nio.FloatBuffer p1) throws Throwable {
    forest_join_9: {
    forest_join_6: {
    if (!(__fieldRead100170_0())) {
        break forest_join_6;
    }
    __call100170_1(p0, p1);
    break forest_join_9;
    }
    __call100170_2(p0, p1);
    }
    return;
}
public static void h100170_0(moom.Oo p0) throws Throwable {
    throw __call13017000_0(p0);
}
private static native boolean __fieldRead100170_0() throws Throwable;
private static native void __call100170_1(int a0, java.nio.FloatBuffer a1) throws Throwable;
private static native void __call100170_2(int a0, java.nio.FloatBuffer a1) throws Throwable;
private static native java.lang.Throwable __call13017000_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_bf3b0d2041b49d8a4b71(int a0, java.nio.IntBuffer a1) throws E;
private static final class __SourceHandler_bf3b0d2041b49d8a4b71 {

public static void f100168(int p0, java.nio.IntBuffer p1) throws Throwable {
    forest_join_9: {
    forest_join_6: {
    if (!(__fieldRead100168_0())) {
        break forest_join_6;
    }
    __call100168_1(p0, p1);
    break forest_join_9;
    }
    __call100168_2(p0, p1);
    }
    return;
}
public static void h100168_0(moom.Oo p0) throws Throwable {
    throw __call13016800_0(p0);
}
private static native boolean __fieldRead100168_0() throws Throwable;
private static native void __call100168_1(int a0, java.nio.IntBuffer a1) throws Throwable;
private static native void __call100168_2(int a0, java.nio.IntBuffer a1) throws Throwable;
private static native java.lang.Throwable __call13016800_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_67551edca816ff173327(int a0, boolean a1, java.nio.FloatBuffer a2) throws E;
private static final class __SourceHandler_67551edca816ff173327 {

public static void f100169(int p0, boolean p1, java.nio.FloatBuffer p2) throws Throwable {
    forest_join_11: {
    forest_join_7: {
    if (!(__fieldRead100169_0())) {
        break forest_join_7;
    }
    __call100169_1(p0, p1, p2);
    break forest_join_11;
    }
    __call100169_2(p0, p1, p2);
    }
    return;
}
public static void h100169_0(moom.Oo p0) throws Throwable {
    throw __call13016900_0(p0);
}
private static native boolean __fieldRead100169_0() throws Throwable;
private static native void __call100169_1(int a0, boolean a1, java.nio.FloatBuffer a2) throws Throwable;
private static native void __call100169_2(int a0, boolean a1, java.nio.FloatBuffer a2) throws Throwable;
private static native java.lang.Throwable __call13016900_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_86c2ae9b60a17c81021b() throws E;
private static final class __SourceHandler_86c2ae9b60a17c81021b {

public static boolean f1400() throws Throwable {
    int forwardValue1400_11_0;
    forward_join_11: {
    forward_join_10: {
    if (!((!__call1400_0()))) {
        break forward_join_10;
    }
    if (!(__fieldRead1400_1())) {
        break forward_join_10;
    }
    if (!(__fieldRead1400_4(__fieldRead1400_3(__call1400_2())))) {
        break forward_join_10;
    }
    forwardValue1400_11_0 = 1;
    break forward_join_11;
    }
    forwardValue1400_11_0 = 0;
    }
    return __integerCategory1400_5(forwardValue1400_11_0);
}
public static void h1400_0(moom.Oo p0) throws Throwable {
    throw __call1140000_0(p0);
}
public static void h1400_1(moom.Oo p0) throws Throwable {
    throw __call1140001_0(p0);
}
public static void h1400_2(moom.Oo p0) throws Throwable {
    throw __call1140002_0(p0);
}
private static native boolean __call1400_0() throws Throwable;
private static native boolean __fieldRead1400_1() throws Throwable;
private static native net.minecraft.client.Minecraft __call1400_2() throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead1400_3(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __fieldRead1400_4(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native boolean __integerCategory1400_5(int value) throws Throwable;
private static native java.lang.Throwable __call1140000_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1140001_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1140002_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_825ff4d4200c8a15bbf2() throws E;
private static final class __SourceHandler_825ff4d4200c8a15bbf2 {

public static int f100174() throws Throwable {
    forest_join_12: {
    forest_join_10: {
    forest_join_8: {
    forest_join_6: {
    forest_join_4: {
    if (!((!__fieldRead100174_0()))) {
        break forest_join_4;
    }
    return -1;
    }
    switch (__fieldRead100174_1()) {
case 0:
{
        break forest_join_6;
    }
case 1:
{
        break forest_join_8;
    }
case 2:
{
        break forest_join_10;
    }
default:
{
        break forest_join_12;
    }
}
    }
    return __call100174_2();
    }
    return __call100174_3();
    }
    return __call100174_4();
    }
    return -1;
}
public static int h100174_0(moom.Oo p0) throws Throwable {
    throw __call13017400_0(p0);
}
public static int h100174_1(moom.Oo p0) throws Throwable {
    throw __call13017401_0(p0);
}
private static native boolean __fieldRead100174_0() throws Throwable;
private static native int __fieldRead100174_1() throws Throwable;
private static native int __call100174_2() throws Throwable;
private static native int __call100174_3() throws Throwable;
private static native int __call100174_4() throws Throwable;
private static native java.lang.Throwable __call13017400_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call13017401_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_de32472e22828cd3f6e3(int a0) throws E;
private static final class __SourceHandler_de32472e22828cd3f6e3 {

public static void f100176(int p0) throws Throwable {
    forest_join_7: {
    forest_join_5: {
    if (!(__fieldRead100176_0())) {
        break forest_join_5;
    }
    __call100176_1(p0);
    break forest_join_7;
    }
    __call100176_2(p0);
    }
    return;
}
public static void h100176_0(moom.Oo p0) throws Throwable {
    throw __call13017600_0(p0);
}
private static native boolean __fieldRead100176_0() throws Throwable;
private static native void __call100176_1(int a0) throws Throwable;
private static native void __call100176_2(int a0) throws Throwable;
private static native java.lang.Throwable __call13017600_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_3c599d6faa10446759e8(int a0, int a1) throws E;
private static final class __SourceHandler_3c599d6faa10446759e8 {

public static void f591(int p0, int p1) throws Throwable {
    forest_join_15: {
    forest_join_12: {
    forest_join_8: {
    forest_join_4: {
    if (!(__fieldRead591_0())) {
        break forest_join_15;
    }
    switch (__fieldRead591_1()) {
case 0:
{
        break forest_join_4;
    }
case 1:
{
        break forest_join_8;
    }
case 2:
{
        break forest_join_12;
    }
default:
{
        break forest_join_15;
    }
}
    }
    __call591_2(p0, p1);
    break forest_join_15;
    }
    __call591_3(p0, p1);
    break forest_join_15;
    }
    __call591_4(p0, p1);
    }
    return;
}
public static void h591_0(moom.Oo p0) throws Throwable {
    throw __call3059100_0(p0);
}
public static void h591_1(moom.Oo p0) throws Throwable {
    throw __call3059101_0(p0);
}
private static native boolean __fieldRead591_0() throws Throwable;
private static native int __fieldRead591_1() throws Throwable;
private static native void __call591_2(int a0, int a1) throws Throwable;
private static native void __call591_3(int a0, int a1) throws Throwable;
private static native void __call591_4(int a0, int a1) throws Throwable;
private static native java.lang.Throwable __call3059100_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3059101_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_97d5edebf15ccbecaaf9(int a0, java.nio.FloatBuffer a1) throws E;
private static final class __SourceHandler_97d5edebf15ccbecaaf9 {

public static void f100177(int p0, java.nio.FloatBuffer p1) throws Throwable {
    forest_join_9: {
    forest_join_6: {
    if (!(__fieldRead100177_0())) {
        break forest_join_6;
    }
    __call100177_1(p0, p1);
    break forest_join_9;
    }
    __call100177_2(p0, p1);
    }
    return;
}
public static void h100177_0(moom.Oo p0) throws Throwable {
    throw __call13017700_0(p0);
}
private static native boolean __fieldRead100177_0() throws Throwable;
private static native void __call100177_1(int a0, java.nio.FloatBuffer a1) throws Throwable;
private static native void __call100177_2(int a0, java.nio.FloatBuffer a1) throws Throwable;
private static native java.lang.Throwable __call13017700_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_2b7073419bb63015e287(int a0, java.nio.IntBuffer a1) throws E;
private static final class __SourceHandler_2b7073419bb63015e287 {

public static void f100175(int p0, java.nio.IntBuffer p1) throws Throwable {
    forest_join_9: {
    forest_join_6: {
    if (!(__fieldRead100175_0())) {
        break forest_join_6;
    }
    __call100175_1(p0, p1);
    break forest_join_9;
    }
    __call100175_2(p0, p1);
    }
    return;
}
public static void h100175_0(moom.Oo p0) throws Throwable {
    throw __call13017500_0(p0);
}
private static native boolean __fieldRead100175_0() throws Throwable;
private static native void __call100175_1(int a0, java.nio.IntBuffer a1) throws Throwable;
private static native void __call100175_2(int a0, java.nio.IntBuffer a1) throws Throwable;
private static native java.lang.Throwable __call13017500_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_7c9d9711aaddd3f952a7(int a0) throws E;
private static final class __SourceHandler_7c9d9711aaddd3f952a7 {

public static void f100166(int p0) throws Throwable {
    forest_join_7: {
    forest_join_5: {
    if (!(__fieldRead100166_0())) {
        break forest_join_5;
    }
    __call100166_1(p0);
    break forest_join_7;
    }
    __call100166_2(p0);
    }
    return;
}
public static void h100166_0(moom.Oo p0) throws Throwable {
    throw __call13016600_0(p0);
}
private static native boolean __fieldRead100166_0() throws Throwable;
private static native void __call100166_1(int a0) throws Throwable;
private static native void __call100166_2(int a0) throws Throwable;
private static native java.lang.Throwable __call13016600_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_e7e5070278fff649ea2f(int a0, int a1) throws E;
private static final class __SourceHandler_e7e5070278fff649ea2f {

public static void f592(int p0, int p1) throws Throwable {
    forest_join_15: {
    forest_join_12: {
    forest_join_8: {
    forest_join_4: {
    if (!(__fieldRead592_0())) {
        break forest_join_15;
    }
    switch (__fieldRead592_1()) {
case 0:
{
        break forest_join_4;
    }
case 1:
{
        break forest_join_8;
    }
case 2:
{
        break forest_join_12;
    }
default:
{
        break forest_join_15;
    }
}
    }
    __call592_2(p0, p1);
    break forest_join_15;
    }
    __call592_3(p0, p1);
    break forest_join_15;
    }
    __call592_4(p0, p1);
    }
    return;
}
public static void h592_0(moom.Oo p0) throws Throwable {
    throw __call3059200_0(p0);
}
public static void h592_1(moom.Oo p0) throws Throwable {
    throw __call3059201_0(p0);
}
private static native boolean __fieldRead592_0() throws Throwable;
private static native int __fieldRead592_1() throws Throwable;
private static native void __call592_2(int a0, int a1) throws Throwable;
private static native void __call592_3(int a0, int a1) throws Throwable;
private static native void __call592_4(int a0, int a1) throws Throwable;
private static native java.lang.Throwable __call3059200_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3059201_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_64fd9328d39036ec114b(int a0) throws E;
private static final class __SourceHandler_64fd9328d39036ec114b {

public static void f100173(int p0) throws Throwable {
    forest_join_7: {
    forest_join_5: {
    if (!(__fieldRead100173_0())) {
        break forest_join_5;
    }
    __call100173_1(p0);
    break forest_join_7;
    }
    __call100173_2(p0);
    }
    return;
}
public static void h100173_0(moom.Oo p0) throws Throwable {
    throw __call13017300_0(p0);
}
private static native boolean __fieldRead100173_0() throws Throwable;
private static native void __call100173_1(int a0) throws Throwable;
private static native void __call100173_2(int a0) throws Throwable;
private static native java.lang.Throwable __call13017300_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_d8e2e46da6c250b09f64(int a0) throws E;
private static final class __SourceHandler_d8e2e46da6c250b09f64 {

public static void f593(int p0) throws Throwable {
    forest_join_12: {
    forest_join_10: {
    forest_join_7: {
    forest_join_4: {
    if (!(__fieldRead593_0())) {
        break forest_join_12;
    }
    switch (__fieldRead593_1()) {
case 0:
{
        break forest_join_4;
    }
case 1:
{
        break forest_join_7;
    }
case 2:
{
        break forest_join_10;
    }
default:
{
        break forest_join_12;
    }
}
    }
    __call593_2(p0);
    break forest_join_12;
    }
    __call593_3(p0);
    break forest_join_12;
    }
    __call593_4(p0);
    }
    return;
}
public static void h593_0(moom.Oo p0) throws Throwable {
    throw __call3059300_0(p0);
}
public static void h593_1(moom.Oo p0) throws Throwable {
    throw __call3059301_0(p0);
}
private static native boolean __fieldRead593_0() throws Throwable;
private static native int __fieldRead593_1() throws Throwable;
private static native void __call593_2(int a0) throws Throwable;
private static native void __call593_3(int a0) throws Throwable;
private static native void __call593_4(int a0) throws Throwable;
private static native java.lang.Throwable __call3059300_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3059301_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_06b3cd44d6be74efc1b2(int a0) throws E;
private static final class __SourceHandler_06b3cd44d6be74efc1b2 {

public static void f594(int p0) throws Throwable {
    forest_join_12: {
    forest_join_10: {
    forest_join_7: {
    forest_join_4: {
    if (!(__fieldRead594_0())) {
        break forest_join_12;
    }
    switch (__fieldRead594_1()) {
case 0:
{
        break forest_join_4;
    }
case 1:
{
        break forest_join_7;
    }
case 2:
{
        break forest_join_10;
    }
default:
{
        break forest_join_12;
    }
}
    }
    __call594_2(p0);
    break forest_join_12;
    }
    __call594_3(p0);
    break forest_join_12;
    }
    __call594_4(p0);
    }
    return;
}
public static void h594_0(moom.Oo p0) throws Throwable {
    throw __call3059400_0(p0);
}
public static void h594_1(moom.Oo p0) throws Throwable {
    throw __call3059401_0(p0);
}
private static native boolean __fieldRead594_0() throws Throwable;
private static native int __fieldRead594_1() throws Throwable;
private static native void __call594_2(int a0) throws Throwable;
private static native void __call594_3(int a0) throws Throwable;
private static native void __call594_4(int a0) throws Throwable;
private static native java.lang.Throwable __call3059400_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3059401_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_882ab4d3b321fbf9cd94(int a0) throws E;
private static final class __SourceHandler_882ab4d3b321fbf9cd94 {

public static void f100155(int p0) throws Throwable {
    forest_join_7: {
    forest_join_5: {
    if (!(__fieldRead100155_0())) {
        break forest_join_5;
    }
    __call100155_1(p0);
    break forest_join_7;
    }
    __call100155_2(p0);
    }
    return;
}
public static void h100155_0(moom.Oo p0) throws Throwable {
    throw __call13015500_0(p0);
}
private static native boolean __fieldRead100155_0() throws Throwable;
private static native void __call100155_1(int a0) throws Throwable;
private static native void __call100155_2(int a0) throws Throwable;
private static native java.lang.Throwable __call13015500_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_6b94fb92a96bdce70cff(int a0) throws E;
private static final class __SourceHandler_6b94fb92a96bdce70cff {

public static void f100194(int p0) throws Throwable {
    forest_join_7: {
    forest_join_5: {
    if (!(__fieldRead100194_0())) {
        break forest_join_5;
    }
    __call100194_1(p0);
    break forest_join_7;
    }
    __call100194_2(p0);
    }
    return;
}
public static void h100194_0(moom.Oo p0) throws Throwable {
    throw __call13019400_0(p0);
}
private static native boolean __fieldRead100194_0() throws Throwable;
private static native void __call100194_1(int a0) throws Throwable;
private static native void __call100194_2(int a0) throws Throwable;
private static native java.lang.Throwable __call13019400_0(moom.Oo a0) throws Throwable;

}


public static void i(int p0) { __sourceHandlerCall_882ab4d3b321fbf9cd94(p0); }


public static int b(int p0, java.lang.CharSequence p1) { return __sourceHandlerCall_9d9525acff9543b70dd6(p0, p1); }


public static void b(int p0, boolean p1, java.nio.FloatBuffer p2) { __sourceHandlerCall_ec0caa2fe91fb3d5b243(p0, p1, p2); }


public static void b(int p0, java.nio.FloatBuffer p1) { __sourceHandlerCall_9939c643da9325d3b78d(p0, p1); }


public static void b(int p0, java.nio.IntBuffer p1) { __sourceHandlerCall_d7ecd4e2e77096b7d1a2(p0, p1); }


public static void b__Void(int p0, int p1) { __sourceHandlerCall_f598e7393256f3baec7d(p0, p1); }


public static java.lang.String b__String() { return __sourceHandlerCall_f157995d82b6e56ab86c(); }


public static int b(int p0) { return __sourceHandlerCall_caa131f6bac5ba34fdc4(p0); }


public static void b(int p0, int p1, int p2, int p3) { __sourceHandlerCall_e8d6eada059db258e533(p0, p1, p2, p3); }


public static boolean b__Boolean() { return __sourceHandlerCall_58e0782d2f8487b5b16d(); }


public static int b() { return __sourceHandlerCall_e42434c81c1c0fcdbe2c(); }


public static void b__Void(int p0) { __sourceHandlerCall_b9f7e20aed9d42a1d147(p0); }


public static java.lang.String b__String(int p0, int p1) { return __sourceHandlerCall_e634756dacb23c57f3e0(p0, p1); }


public static int b(int p0, int p1) { return __sourceHandlerCall_17e4df4902a432d06c5f(p0, p1); }


public static void e(int p0, int p1) { __sourceHandlerCall_e7e5070278fff649ea2f(p0, p1); }


public static void e(int p0) { __sourceHandlerCall_7c9d9711aaddd3f952a7(p0); }


public static void c(int p0, int p1) { __sourceHandlerCall_6a9635fb21e0b2e69273(p0, p1); }


public static void c(int p0, java.nio.IntBuffer p1) { __sourceHandlerCall_bf3b0d2041b49d8a4b71(p0, p1); }


public static void c(int p0, boolean p1, java.nio.FloatBuffer p2) { __sourceHandlerCall_67551edca816ff173327(p0, p1, p2); }


public static void c(int p0, java.nio.FloatBuffer p1) { __sourceHandlerCall_8d64e1dd64e87ca2451e(p0, p1); }


public static void c(int p0, int p1, int p2, int p3) { __sourceHandlerCall_59c54829a9728463c244(p0, p1, p2, p3); }


public static boolean c__Boolean() { return __sourceHandlerCall_86c2ae9b60a17c81021b(); }


public static int c() { return __sourceHandlerCall_e0ae702766ee55f9e994(); }


public static void c(int p0) { __sourceHandlerCall_e8d4f156aa91bbb6a4e2(p0); }


public static void h(int p0) { __sourceHandlerCall_06b3cd44d6be74efc1b2(p0); }


public static void f(int p0) { __sourceHandlerCall_64fd9328d39036ec114b(p0); }


public static void d(int p0, int p1) { __sourceHandlerCall_3c599d6faa10446759e8(p0, p1); }


public static int d() { return __sourceHandlerCall_825ff4d4200c8a15bbf2(); }


public static void d(int p0, java.nio.IntBuffer p1) { __sourceHandlerCall_2b7073419bb63015e287(p0, p1); }


public static void d(int p0) { __sourceHandlerCall_de32472e22828cd3f6e3(p0); }


public static void d(int p0, java.nio.FloatBuffer p1) { __sourceHandlerCall_97d5edebf15ccbecaaf9(p0, p1); }


public static int a() { return __sourceHandlerCall_6812ba1abf3b9c6860c7(); }


public static void a(int p0, long p1, int p2) { __sourceHandlerCall_0cd5b6f2b6c21f3c058a(p0, p1, p2); }


public static void a(int p0, long p1, java.nio.ByteBuffer p2) { __sourceHandlerCall_206131a8e10601ca2eb7(p0, p1, p2); }


public static void a(int p0, int p1, int p2, int p3, int p4) { __sourceHandlerCall_484ae238adcb3576d7ef(p0, p1, p2, p3, p4); }


public static void a(int p0, float p1, float p2) { __sourceHandlerCall_b79cffd4d1da879249c9(p0, p1, p2); }


public static java.lang.String a__String() {
return net.minecraft.client.renderer.OpenGlHelper.af;
}


private static java.lang.Throwable a(java.lang.Throwable p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 15185;
      if (db[var3] == null) {
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
         long var5 = cb[var3];
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
         Object[] var9 = (Object[])eb.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               eb.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/lo", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         db[var3] = var15;
      }

      return db[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.client.renderer.OpenGlHelper.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral10636_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/lo"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public static void a__Void() { __sourceHandlerCall_d6a083f6b41f5e8c4bcc(); }


public static boolean a__Boolean() {
return ((((net.minecraft.client.renderer.OpenGlHelper.O) ? 1 : 0)) != 0);
}


public static void a(int p0, int p1, long p2, long p3, long p4) { __sourceHandlerCall_f989b92e265d7348bf49(p0, p1, p2, p3, p4); }


public static void a__Void(int p0) { __sourceHandlerCall_5317d492abf9a19765a2(p0); }


public static java.lang.String a__String(int p0, int p1) { return __sourceHandlerCall_71068f1c10d73ca385d1(p0, p1); }


public static void a(int p0, java.nio.ByteBuffer p1) { __sourceHandlerCall_5f9d88fbc47b858e9d94(p0, p1); }


public static void a(int p0, java.nio.FloatBuffer p1) { __sourceHandlerCall_9666fff23be08a3c3386(p0, p1); }


public static void a(int p0, java.nio.ByteBuffer p1, int p2) { __sourceHandlerCall_9b5f2af334c6d8fabed8(p0, p1, p2); }


public static void a(int p0, boolean p1, java.nio.FloatBuffer p2) { __sourceHandlerCall_de2c198ba51dd3e14870(p0, p1, p2); }


public static int a(int p0) { return __sourceHandlerCall_5e1f8cadbd11f68334c3(p0); }


public static int a(int p0, int p1) { return __sourceHandlerCall_f80b7714eb71cab1ac0e(p0, p1); }


public static void a__Void(int p0, int p1) { __sourceHandlerCall_285f4a5630aacfaf2bb6(p0, p1); }


public static void a(int p0, int p1, int p2, int p3) { __sourceHandlerCall_dbbf4867a9b140bbdbac(p0, p1, p2, p3); }


public static void a(int p0, java.nio.IntBuffer p1) { __sourceHandlerCall_50bfe26b70bfca4ff940(p0, p1); }


public static int a(int p0, java.lang.CharSequence p1) { return __sourceHandlerCall_0bdc3fc3833e6d849777(p0, p1); }


public static void g(int p0) { __sourceHandlerCall_d8e2e46da6c250b09f64(p0); }


public static void j(int p0) { __sourceHandlerCall_6b94fb92a96bdce70cff(p0); }


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral10636_0() throws E;
}
