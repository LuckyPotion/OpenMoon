package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class BU {

private static java.lang.String a;

private static java.lang.String b;

private static boolean c;

public static java.lang.String d;

public static java.lang.String e;

public static java.lang.String f;

public static java.lang.String[] g;

public static moom.J5 h;

public static moom.J5 i;

public static int j;

public static boolean k;

public static boolean l;

private static net.minecraft.client.settings.GameSettings m;

private static net.minecraft.client.Minecraft n;

private static boolean o;

private static java.lang.Thread p;

private static org.lwjgl.opengl.DisplayMode q;

private static org.lwjgl.opengl.DisplayMode[] r;

private static int s;

private static int t;

public static boolean u;

public static boolean v;

private static int w;

public static boolean x;

private static boolean y;

private static boolean z;

private static moom.oK A;

public static java.lang.Float B;

private static org.apache.logging.log4j.Logger C;

public static boolean D;

private static java.lang.String E;

private static int F;

public static float G;

private static net.minecraft.entity.Entity[] H;

private static long I;

private static long[] J;

private static java.lang.Integer[] K;

private static java.util.Map L;

private static long M;

public BU() {
super();
}


static {
javax.crypto.Cipher forestValue381_38_0;
    int forestValue381_38_1;
    javax.crypto.SecretKeyFactory forestValue381_38_2;
    byte[] forestValue381_38_3;
    javax.crypto.Cipher forestValue381_55_0;
    int forestValue381_55_1;
    javax.crypto.SecretKeyFactory forestValue381_55_2;
    byte[] forestValue381_55_3;
    long[] forestValue381_159_0;
    int forestValue381_159_1;
    long forestValue381_159_2;
    int forestValue381_159_3;
    long[] forestValue381_302_0;
    int forestValue381_302_1;
    long forestValue381_302_2;
    long[] forestValue381_314_0;
    int forestValue381_314_1;
    long forestValue381_314_2;
    javax.crypto.Cipher forestValue381_425_0;
    int forestValue381_425_1;
    javax.crypto.SecretKeyFactory forestValue381_425_2;
    byte[] forestValue381_425_3;
    javax.crypto.Cipher forestValue381_442_0;
    int forestValue381_442_1;
    javax.crypto.SecretKeyFactory forestValue381_442_2;
    byte[] forestValue381_442_3;
    java.lang.Object spill381_0;
    javax.crypto.Cipher spill381_1;
    int spill381_2;
    javax.crypto.SecretKeyFactory spill381_3;
    byte[] spill381_4;
    byte[] spill381_5;
    java.lang.String spill381_6;
    int spill381_7;
    int spill381_8;
    long spill381_9;
    byte[] spill381_10;
    byte[] spill381_11;
    byte[] spill381_12;
    byte[] spill381_13;
    byte[] spill381_14;
    byte[] spill381_15;
    byte[] spill381_16;
    byte[] spill381_17;
    long spill381_18;
    int spill381_19;
    java.lang.String spill381_20;
    int spill381_21;
    long[] spill381_22;
    int spill381_23;
    long spill381_24;
    int spill381_25;
    javax.crypto.Cipher spill381_26;
    int spill381_27;
    javax.crypto.SecretKeyFactory spill381_28;
    byte[] spill381_29;
    byte[] spill381_30;
    int spill381_31;
    long spill381_32;
    byte[] spill381_33;
    byte[] spill381_34;
    byte[] spill381_35;
    byte[] spill381_36;
    byte[] spill381_37;
    byte[] spill381_38;
    byte[] spill381_39;
    byte[] spill381_40;
    long spill381_41;
    int spill381_42;
    long life5_17;
    javax.crypto.Cipher life7_22;
    int life8_37;
    long[] life13_68;
    int life10_70;
    java.lang.String life11_73;
    int life12_75;
    int life9_77;
    byte[] life14_85;
    long life15_162;
    byte[] life17_230;
    byte[] life14_327;
    javax.crypto.Cipher life0_411;
    int life1_426;
    long life2_460;
    byte[] life4_528;
    forest_join_442: {
    forest_join_401: {
    forest_join_55: {
    I = ((long)(((moom._a)(moom._c.a(((long)(-8329901388073155340L)), ((long)(-6599627805227638460L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(280167795728252L)))));
    spill381_0 = null;
    L = ((java.util.Map)(new java.util.HashMap(13)));
    life5_17 = (moom.BU.I ^ 63851567367433L);
    moom.BU.b(((net.minecraft.entity.Entity[])(spill381_0)));
    spill381_1 = (life7_22 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    spill381_2 = 2;
    spill381_3 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp381_10_0 = new byte[8];
    spill381_4 = __stackOp381_10_0;
    (__stackOp381_10_0)[0] = ((byte) ((int) (life5_17 >>> 56)));
    life8_37 = 1;
    forestValue381_38_0 = spill381_1;
    forestValue381_38_1 = spill381_2;
    forestValue381_38_2 = spill381_3;
    forestValue381_38_3 = spill381_4;
    forest_cycle_38: while (true) {
    if (!((life8_37 < 8))) {
        forestValue381_55_0 = forestValue381_38_0;
        forestValue381_55_1 = forestValue381_38_1;
        forestValue381_55_2 = forestValue381_38_2;
        forestValue381_55_3 = forestValue381_38_3;
        break forest_join_55;
    }
    byte[] __stackOp381_11_0 = forestValue381_38_3;
    spill381_5 = __stackOp381_11_0;
    (__stackOp381_11_0)[life8_37] = ((byte) ((int) ((life5_17 << (life8_37 * 8)) >>> 56)));
    life8_37 += 1;
    forestValue381_38_3 = spill381_5;
    continue forest_cycle_38;
    }
    }
    ((javax.crypto.Cipher)(forestValue381_55_0)).init(((int)(forestValue381_55_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue381_55_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue381_55_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    life13_68 = new long[34];
    life10_70 = 0;
    life12_75 = ((java.lang.String)((life11_73 = "0ÍSáÚ\005\035Ç(dÚà\t\nÝñ\037ºUÖ{VÇ_o\003µBù¤#{\r#àä (wp\b_ÎÚ¦£\005\026¦Q\004T¦¡zB}ðVÏïIMý\006Ì)i-²:Ù5¯\177y|±?FÀ\tö\022d¦ñlíßÿWUÞ¤â©-\026È,4¬\027WQam2U\013®QîÍ\000\"ê/Á6®JØéM\004Î\036`ñê³·õuþ\b>Þú»ã¸l·Ö¬àTWrç\004öð®Á1Í\023®ï÷yã\022¥±\004\fæ\024ØC´\016/(Bçß/ã£\000\027öD Á»eù]Ûªä»èa\030²9zÍ\000Y¾,9=Ìª³\002ß$\032à\"»kâ\005"))).length();
    life9_77 = 0;
    forest_cycle_78: while (true) {
    spill381_6 = life11_73;
    spill381_7 = life9_77;
    life9_77 += 8;
    life14_85 = ((java.lang.String)(((java.lang.String)(spill381_6)).substring(((int)(spill381_7)), ((int)(life9_77))))).getBytes(((java.lang.String)("ISO-8859-1")));
    forestValue381_159_0 = life13_68;
    forestValue381_159_1 = (life10_70++);
    forestValue381_159_2 = (((((((((((long) (life14_85)[0]) & 255L) << 56) | ((((long) (life14_85)[1]) & 255L) << 48)) | ((((long) (life14_85)[2]) & 255L) << 40)) | ((((long) (life14_85)[3]) & 255L) << 32)) | ((((long) (life14_85)[4]) & 255L) << 24)) | ((((long) (life14_85)[5]) & 255L) << 16)) | ((((long) (life14_85)[6]) & 255L) << 8)) | (((long) (life14_85)[7]) & 255L));
    forestValue381_159_3 = -1;
    forest_cycle_159: while (true) {
    forest_join_319: {
    forest_join_314: {
    forest_join_302: {
    long __stackOp381_17_0 = forestValue381_159_2;
    int __stackOp381_17_1 = forestValue381_159_3;
    spill381_8 = __stackOp381_17_1;
    spill381_9 = __stackOp381_17_0;
    recovery.source.CarrierOps.discard(__stackOp381_17_1);
    life15_162 = spill381_9;
    byte[] __stackOp381_19_0 = new byte[8];
    spill381_10 = __stackOp381_19_0;
    (__stackOp381_19_0)[0] = ((byte) ((int) (life15_162 >>> 56)));
    byte[] __stackOp381_20_0 = spill381_10;
    spill381_11 = __stackOp381_20_0;
    (__stackOp381_20_0)[1] = ((byte) ((int) (life15_162 >>> 48)));
    byte[] __stackOp381_21_0 = spill381_11;
    spill381_12 = __stackOp381_21_0;
    (__stackOp381_21_0)[2] = ((byte) ((int) (life15_162 >>> 40)));
    byte[] __stackOp381_22_0 = spill381_12;
    spill381_13 = __stackOp381_22_0;
    (__stackOp381_22_0)[3] = ((byte) ((int) (life15_162 >>> 32)));
    byte[] __stackOp381_23_0 = spill381_13;
    spill381_14 = __stackOp381_23_0;
    (__stackOp381_23_0)[4] = ((byte) ((int) (life15_162 >>> 24)));
    byte[] __stackOp381_24_0 = spill381_14;
    spill381_15 = __stackOp381_24_0;
    (__stackOp381_24_0)[5] = ((byte) ((int) (life15_162 >>> 16)));
    byte[] __stackOp381_25_0 = spill381_15;
    spill381_16 = __stackOp381_25_0;
    (__stackOp381_25_0)[6] = ((byte) ((int) (life15_162 >>> 8)));
    byte[] __stackOp381_26_0 = spill381_16;
    spill381_17 = __stackOp381_26_0;
    (__stackOp381_26_0)[7] = ((byte) ((int) life15_162));
    byte[] __stackOp381_27_0 = spill381_17;
    javax.crypto.Cipher __stackOp381_27_1 = life7_22;
    life17_230 = ((javax.crypto.Cipher)(__stackOp381_27_1)).doFinal(((byte[])(__stackOp381_27_0)));
    int __stackOp381_29_0 = spill381_8;
    long __stackOp381_29_1 = (((((((((((long) (life17_230)[0]) & 255L) << 56) | ((((long) (life17_230)[1]) & 255L) << 48)) | ((((long) (life17_230)[2]) & 255L) << 40)) | ((((long) (life17_230)[3]) & 255L) << 32)) | ((((long) (life17_230)[4]) & 255L) << 24)) | ((((long) (life17_230)[5]) & 255L) << 16)) | ((((long) (life17_230)[6]) & 255L) << 8)) | (((long) (life17_230)[7]) & 255L));
    spill381_18 = __stackOp381_29_1;
    spill381_19 = __stackOp381_29_0;
    recovery.source.CarrierOps.discard(__stackOp381_29_1);
    switch (spill381_19) {
default:
{
        forestValue381_302_0 = forestValue381_159_0;
        forestValue381_302_1 = forestValue381_159_1;
        forestValue381_302_2 = spill381_18;
        break forest_join_302;
    }
case 0:
{
        forestValue381_314_0 = forestValue381_159_0;
        forestValue381_314_1 = forestValue381_159_1;
        forestValue381_314_2 = spill381_18;
        break forest_join_314;
    }
}
    }
    (forestValue381_302_0)[forestValue381_302_1] = forestValue381_302_2;
    if (!((life9_77 >= life12_75))) {
        continue forest_cycle_78;
    }
    life12_75 = ((java.lang.String)((life11_73 = "\023ÝRå´î\013½ÁznÓçVN|"))).length();
    life9_77 = 0;
    break forest_join_319;
    }
    (forestValue381_314_0)[forestValue381_314_1] = forestValue381_314_2;
    if (!((life9_77 >= life12_75))) {
        break forest_join_319;
    }
    break forest_join_401;
    }
    spill381_20 = life11_73;
    spill381_21 = life9_77;
    life9_77 += 8;
    life14_327 = ((java.lang.String)(((java.lang.String)(spill381_20)).substring(((int)(spill381_21)), ((int)(life9_77))))).getBytes(((java.lang.String)("ISO-8859-1")));
    spill381_22 = life13_68;
    spill381_23 = (life10_70++);
    spill381_24 = (((((((((((long) (life14_327)[0]) & 255L) << 56) | ((((long) (life14_327)[1]) & 255L) << 48)) | ((((long) (life14_327)[2]) & 255L) << 40)) | ((((long) (life14_327)[3]) & 255L) << 32)) | ((((long) (life14_327)[4]) & 255L) << 24)) | ((((long) (life14_327)[5]) & 255L) << 16)) | ((((long) (life14_327)[6]) & 255L) << 8)) | (((long) (life14_327)[7]) & 255L));
    spill381_25 = 0;
    forestValue381_159_0 = spill381_22;
    forestValue381_159_1 = spill381_23;
    forestValue381_159_2 = spill381_24;
    forestValue381_159_3 = spill381_25;
    continue forest_cycle_159;
    }
    }
    }
    J = ((long[])(life13_68));
    K = ((java.lang.Integer[])(new java.lang.Integer[34]));
    spill381_26 = (life0_411 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    spill381_27 = 2;
    spill381_28 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp381_38_0 = new byte[8];
    spill381_29 = __stackOp381_38_0;
    (__stackOp381_38_0)[0] = ((byte) ((int) (life5_17 >>> 56)));
    life1_426 = 1;
    forestValue381_425_0 = spill381_26;
    forestValue381_425_1 = spill381_27;
    forestValue381_425_2 = spill381_28;
    forestValue381_425_3 = spill381_29;
    forest_cycle_425: while (true) {
    if (!((life1_426 < 8))) {
        forestValue381_442_0 = forestValue381_425_0;
        forestValue381_442_1 = forestValue381_425_1;
        forestValue381_442_2 = forestValue381_425_2;
        forestValue381_442_3 = forestValue381_425_3;
        break forest_join_442;
    }
    byte[] __stackOp381_39_0 = forestValue381_425_3;
    spill381_30 = __stackOp381_39_0;
    (__stackOp381_39_0)[life1_426] = ((byte) ((int) ((life5_17 << (life1_426 * 8)) >>> 56)));
    life1_426 += 1;
    forestValue381_425_3 = spill381_30;
    continue forest_cycle_425;
    }
    }
    ((javax.crypto.Cipher)(forestValue381_442_0)).init(((int)(forestValue381_442_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue381_442_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue381_442_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long __stackOp381_42_0 = 3599594546207052612L;
    int __stackOp381_42_1 = -1;
    spill381_31 = __stackOp381_42_1;
    spill381_32 = __stackOp381_42_0;
    recovery.source.CarrierOps.discard(__stackOp381_42_1);
    life2_460 = spill381_32;
    byte[] __stackOp381_44_0 = new byte[8];
    spill381_33 = __stackOp381_44_0;
    (__stackOp381_44_0)[0] = ((byte) ((int) (life2_460 >>> 56)));
    byte[] __stackOp381_45_0 = spill381_33;
    spill381_34 = __stackOp381_45_0;
    (__stackOp381_45_0)[1] = ((byte) ((int) (life2_460 >>> 48)));
    byte[] __stackOp381_46_0 = spill381_34;
    spill381_35 = __stackOp381_46_0;
    (__stackOp381_46_0)[2] = ((byte) ((int) (life2_460 >>> 40)));
    byte[] __stackOp381_47_0 = spill381_35;
    spill381_36 = __stackOp381_47_0;
    (__stackOp381_47_0)[3] = ((byte) ((int) (life2_460 >>> 32)));
    byte[] __stackOp381_48_0 = spill381_36;
    spill381_37 = __stackOp381_48_0;
    (__stackOp381_48_0)[4] = ((byte) ((int) (life2_460 >>> 24)));
    byte[] __stackOp381_49_0 = spill381_37;
    spill381_38 = __stackOp381_49_0;
    (__stackOp381_49_0)[5] = ((byte) ((int) (life2_460 >>> 16)));
    byte[] __stackOp381_50_0 = spill381_38;
    spill381_39 = __stackOp381_50_0;
    (__stackOp381_50_0)[6] = ((byte) ((int) (life2_460 >>> 8)));
    byte[] __stackOp381_51_0 = spill381_39;
    spill381_40 = __stackOp381_51_0;
    (__stackOp381_51_0)[7] = ((byte) ((int) life2_460));
    byte[] __stackOp381_52_0 = spill381_40;
    javax.crypto.Cipher __stackOp381_52_1 = life0_411;
    life4_528 = ((javax.crypto.Cipher)(__stackOp381_52_1)).doFinal(((byte[])(__stackOp381_52_0)));
    int __stackOp381_54_0 = spill381_31;
    long __stackOp381_54_1 = (((((((((((long) (life4_528)[0]) & 255L) << 56) | ((((long) (life4_528)[1]) & 255L) << 48)) | ((((long) (life4_528)[2]) & 255L) << 40)) | ((((long) (life4_528)[3]) & 255L) << 32)) | ((((long) (life4_528)[4]) & 255L) << 24)) | ((((long) (life4_528)[5]) & 255L) << 16)) | ((((long) (life4_528)[6]) & 255L) << 8)) | (((long) (life4_528)[7]) & 255L));
    spill381_41 = __stackOp381_54_1;
    spill381_42 = __stackOp381_54_0;
    recovery.source.CarrierOps.discard(__stackOp381_54_1);
    recovery.source.CarrierOps.discard(spill381_42);
    M = ((long)(spill381_41));
    a = ((java.lang.String)(null));
    b = ((java.lang.String)(null));
    c = ((boolean)(false));
    d = ((java.lang.String)(null));
    e = ((java.lang.String)(null));
    f = ((java.lang.String)(null));
    g = ((java.lang.String[])(null));
    h = ((moom.J5)(null));
    i = ((moom.J5)(null));
    j = ((int)(-1));
    k = ((boolean)(false));
    l = ((boolean)(false));
    m = ((net.minecraft.client.settings.GameSettings)(null));
    n = ((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM()));
    o = ((boolean)(false));
    p = ((java.lang.Thread)(null));
    q = ((org.lwjgl.opengl.DisplayMode)(null));
    r = ((org.lwjgl.opengl.DisplayMode[])(null));
    s = ((int)(0));
    t = ((int)(0));
    u = ((boolean)(false));
    v = ((boolean)(false));
    w = ((int)(0));
    x = ((boolean)(false));
    y = ((boolean)(false));
    z = ((boolean)(false));
    A = ((moom.oK)(null));
    B = ((java.lang.Float)(java.lang.Float.valueOf(((float)(0x1.99999ap-4f)))));
    C = ((org.apache.logging.log4j.Logger)(org.apache.logging.log4j.LogManager.getLogger()));
    D = ((boolean)(((java.lang.String)(java.lang.System.getProperty(((java.lang.String)("log.detail")), ((java.lang.String)("false"))))).equals(((java.lang.Object)("true")))));
    E = ((java.lang.String)(null));
    F = ((int)(0));
}

private static native <E extends Throwable> boolean __sourceHandlerCall_4e28191a77658460c2fa() throws E;
private static final class __SourceHandler_4e28191a77658460c2fa {

public static boolean f950() throws Throwable {
    return ((__fieldRead950_1(__fieldRead950_0()) != 3) ? true : false);
}
public static void h950_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1095000_0(p0);
}
private static native net.minecraft.client.settings.GameSettings __fieldRead950_0() throws Throwable;
private static native int __fieldRead950_1(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native java.lang.Throwable __call1095000_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_62b5b413939de64add71() throws E;
private static final class __SourceHandler_62b5b413939de64add71 {

public static boolean f951() throws Throwable {
    return ((__fieldRead951_1(__fieldRead951_0()) == 2) ? true : false);
}
public static void h951_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1095100_0(p0);
}
private static native net.minecraft.client.settings.GameSettings __fieldRead951_0() throws Throwable;
private static native int __fieldRead951_1(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native java.lang.Throwable __call1095100_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_148d31553da4840b347c() throws E;
private static final class __SourceHandler_148d31553da4840b347c {

public static boolean f586() throws Throwable {
    int forwardValue586_9_0;
    forward_join_9: {
    forward_join_8: {
    forward_join_6: {
    if (!(__call586_0())) {
        break forward_join_8;
    }
    if (!(__call586_1())) {
        break forward_join_6;
    }
    if (!(__call586_2())) {
        break forward_join_8;
    }
    }
    forwardValue586_9_0 = 1;
    break forward_join_9;
    }
    forwardValue586_9_0 = 0;
    }
    return __integerCategory586_3(forwardValue586_9_0);
}
public static void h586_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1058600_0(p0);
}
public static void h586_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1058601_0(p0);
}
public static void h586_2(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1058602_0(p0);
}
private static native boolean __call586_0() throws Throwable;
private static native boolean __call586_1() throws Throwable;
private static native boolean __call586_2() throws Throwable;
private static native boolean __integerCategory586_3(int value) throws Throwable;
private static native java.lang.Throwable __call1058600_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Throwable __call1058601_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Throwable __call1058602_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_054ff8c6ddeec0c2f03b() throws E;
private static final class __SourceHandler_054ff8c6ddeec0c2f03b {

public static boolean f587() throws Throwable {
    int forwardValue587_9_0;
    forward_join_9: {
    forward_join_8: {
    forward_join_6: {
    if (!(__call587_0())) {
        break forward_join_8;
    }
    if (!(__call587_1())) {
        break forward_join_6;
    }
    if (!(__call587_2())) {
        break forward_join_8;
    }
    }
    forwardValue587_9_0 = 1;
    break forward_join_9;
    }
    forwardValue587_9_0 = 0;
    }
    return __integerCategory587_3(forwardValue587_9_0);
}
public static void h587_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1058700_0(p0);
}
public static void h587_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1058701_0(p0);
}
public static void h587_2(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1058702_0(p0);
}
private static native boolean __call587_0() throws Throwable;
private static native boolean __call587_1() throws Throwable;
private static native boolean __call587_2() throws Throwable;
private static native boolean __integerCategory587_3(int value) throws Throwable;
private static native java.lang.Throwable __call1058700_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Throwable __call1058701_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Throwable __call1058702_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_152ab6ef6f0ec75f33a4() throws E;
private static final class __SourceHandler_152ab6ef6f0ec75f33a4 {

public static boolean f209() throws Throwable {
    int forestValue209_18_0;
    forest_join_18: {
    forest_join_17: {
    forest_join_15: {
    forest_join_11: {
    forest_join_4: {
    if (!(__call209_0())) {
        break forest_join_4;
    }
    if (!(__call209_1())) {
        break forest_join_17;
    }
    }
    if (!((__fieldRead209_3(__fieldRead209_2()) == 0))) {
        break forest_join_11;
    }
    if (!(__fieldRead209_5(__fieldRead209_4()))) {
        break forest_join_17;
    }
    break forest_join_15;
    }
    if (!((__fieldRead209_7(__fieldRead209_6()) == 2))) {
        break forest_join_17;
    }
    }
    forestValue209_18_0 = 1;
    break forest_join_18;
    }
    forestValue209_18_0 = 0;
    }
    return __integerCategory209_8(forestValue209_18_0);
}
public static boolean h209_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3020900_0(p0);
}
public static boolean h209_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3020901_0(p0);
}
public static boolean h209_2(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3020902_0(p0);
}
public static boolean h209_3(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3020903_0(p0);
}
public static boolean h209_4(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3020904_0(p0);
}
private static native boolean __call209_0() throws Throwable;
private static native boolean __call209_1() throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead209_2() throws Throwable;
private static native int __fieldRead209_3(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead209_4() throws Throwable;
private static native boolean __fieldRead209_5(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead209_6() throws Throwable;
private static native int __fieldRead209_7(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native boolean __integerCategory209_8(int value) throws Throwable;
private static native java.lang.Throwable __call3020900_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Throwable __call3020901_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Throwable __call3020902_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Throwable __call3020903_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Throwable __call3020904_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_3a74f30a4c73d8429888() throws E;
private static final class __SourceHandler_3a74f30a4c73d8429888 {

public static boolean f955() throws Throwable {
    return ((__fieldRead955_1(__fieldRead955_0()) == 1) ? true : false);
}
public static void h955_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1095500_0(p0);
}
private static native net.minecraft.client.settings.GameSettings __fieldRead955_0() throws Throwable;
private static native int __fieldRead955_1(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native java.lang.Throwable __call1095500_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_6eba1d2a8c73a252b34e() throws E;
private static final class __SourceHandler_6eba1d2a8c73a252b34e {

public static boolean f956() throws Throwable {
    return ((__fieldRead956_1(__fieldRead956_0()) == 0) ? true : false);
}
public static void h956_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1095600_0(p0);
}
private static native net.minecraft.client.settings.GameSettings __fieldRead956_0() throws Throwable;
private static native int __fieldRead956_1(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native java.lang.Throwable __call1095600_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_751a154cbd5da6aac429() throws E;
private static final class __SourceHandler_751a154cbd5da6aac429 {

public static boolean f957() throws Throwable {
    return ((__fieldRead957_1(__fieldRead957_0()) == 2) ? true : false);
}
public static void h957_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1095700_0(p0);
}
private static native net.minecraft.client.settings.GameSettings __fieldRead957_0() throws Throwable;
private static native int __fieldRead957_1(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native java.lang.Throwable __call1095700_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_3bba3462b900693d1cdd() throws E;
private static final class __SourceHandler_3bba3462b900693d1cdd {

public static boolean f958() throws Throwable {
    return ((__call958_0() > 1) ? true : false);
}
public static void h958_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1095800_0(p0);
}
private static native int __call958_0() throws Throwable;
private static native java.lang.Throwable __call1095800_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_013ed3c68e491e91c624() throws E;
private static final class __SourceHandler_013ed3c68e491e91c624 {

public static boolean f959() throws Throwable {
    return ((__call959_0() > 0) ? true : false);
}
public static void h959_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1095900_0(p0);
}
private static native int __call959_0() throws Throwable;
private static native java.lang.Throwable __call1095900_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_24e0bfb382f874012324() throws E;
private static final class __SourceHandler_24e0bfb382f874012324 {

public static boolean f960() throws Throwable {
    return ((__fieldRead960_1(__call960_0()) > 0) ? true : false);
}
public static void h960_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1096000_0(p0);
}
private static native net.minecraft.client.settings.GameSettings __call960_0() throws Throwable;
private static native int __fieldRead960_1(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native java.lang.Throwable __call1096000_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_7b1e0a1f11edc5ee8de0() throws E;
private static final class __SourceHandler_7b1e0a1f11edc5ee8de0 {

public static boolean f589() throws Throwable {
    int forwardValue589_8_0;
    forward_join_8: {
    forward_join_7: {
    forward_join_5: {
    if (!((__call589_0() <= 1))) {
        break forward_join_5;
    }
    if (!((__call589_1() > 0))) {
        break forward_join_7;
    }
    }
    forwardValue589_8_0 = 1;
    break forward_join_8;
    }
    forwardValue589_8_0 = 0;
    }
    return __integerCategory589_2(forwardValue589_8_0);
}
public static void h589_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1058900_0(p0);
}
public static void h589_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1058901_0(p0);
}
private static native int __call589_0() throws Throwable;
private static native int __call589_1() throws Throwable;
private static native boolean __integerCategory589_2(int value) throws Throwable;
private static native java.lang.Throwable __call1058900_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Throwable __call1058901_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> double __sourceHandlerCall_bd30246adaf1b5295b0f(double a0, double a1, double a2) throws E;
private static final class __SourceHandler_bd30246adaf1b5295b0f {

public static double f962(double p0, double p1, double p2) throws Throwable {
    return ((p0 < p1) ? p1 : __call962_0(p0, p2));
}
public static void h962_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1096200_0(p0);
}
private static native double __call962_0(double a0, double a1) throws Throwable;
private static native java.lang.Throwable __call1096200_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> float __sourceHandlerCall_a46d0ccfb86695b3d1c2(float a0) throws E;
private static final class __SourceHandler_a46d0ccfb86695b3d1c2 {

public static float f963(float p0) throws Throwable {
    return ((p0 < 0x0.0p0f) ? 0x0.0p0f : __call963_0(p0, 0x1.0p0f));
}
public static void h963_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1096300_0(p0);
}
private static native float __call963_0(float a0, float a1) throws Throwable;
private static native java.lang.Throwable __call1096300_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> float __sourceHandlerCall_39b7f402939bfb370140(float a0, float a1, float a2) throws E;
private static final class __SourceHandler_39b7f402939bfb370140 {

public static float f964(float p0, float p1, float p2) throws Throwable {
    return ((p0 < p1) ? p1 : __call964_0(p0, p2));
}
public static void h964_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1096400_0(p0);
}
private static native float __call964_0(float a0, float a1) throws Throwable;
private static native java.lang.Throwable __call1096400_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_2f4ec36224961e9f035a(int a0, int a1, int a2) throws E;
private static final class __SourceHandler_2f4ec36224961e9f035a {

public static int f965(int p0, int p1, int p2) throws Throwable {
    return ((p0 < p1) ? p1 : __call965_0(p0, p2));
}
public static void h965_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1096500_0(p0);
}
private static native int __call965_0(int a0, int a1) throws Throwable;
private static native java.lang.Throwable __call1096500_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_b90c05afe68ffda83cd5(int a0, int[] a1) throws E;
private static final class __SourceHandler_b90c05afe68ffda83cd5 {

public static boolean f966(int p0, int[] p1) throws Throwable {
    int[] life2_1;
    int life3_4;
    int life4_6;
    int life5_13;
    life2_1 = p1;
    life3_4 = (life2_1).length;
    life4_6 = 0;
    loop_region_7: while ((life4_6 < life3_4)) {
        life5_13 = (life2_1)[life4_6];
        if ((life5_13 == p0)) {
        return true;
    }
        life4_6 += 1;
    }
    return false;
}
public static void h966_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1096600_0(p0);
}
private static native java.lang.Throwable __call1096600_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> org.lwjgl.opengl.DisplayMode __sourceHandlerCall_cff688aca5b0bbc3413b(java.awt.Dimension a0) throws E;
private static final class __SourceHandler_cff688aca5b0bbc3413b {

public static org.lwjgl.opengl.DisplayMode f210(java.awt.Dimension p0) throws Throwable {
    org.lwjgl.opengl.DisplayMode[] life1_1;
    org.lwjgl.opengl.DisplayMode[] life2_3;
    int life3_6;
    int life4_8;
    org.lwjgl.opengl.DisplayMode life5_15;
    forest_join_31: {
    forest_join_29: {
    life1_1 = __call210_0();
    life2_3 = life1_1;
    life3_6 = (life2_3).length;
    life4_8 = 0;
    forest_cycle_9: while (true) {
    forest_join_27: {
    if (!((life4_8 < life3_6))) {
        break forest_join_31;
    }
    life5_15 = (life2_3)[life4_8];
    if (!((__call210_1(life5_15) == __fieldRead210_2(p0)))) {
        break forest_join_27;
    }
    if (!((__call210_3(life5_15) == __fieldRead210_4(p0)))) {
        break forest_join_27;
    }
    break forest_join_29;
    }
    life4_8 += 1;
    continue forest_cycle_9;
    }
    }
    return life5_15;
    }
    return __fieldRead210_5();
}
public static org.lwjgl.opengl.DisplayMode h210_0(org.lwjgl.LWJGLException p0) throws Throwable {
    throw __call3021000_0(p0);
}
public static org.lwjgl.opengl.DisplayMode h210_1(org.lwjgl.LWJGLException p0) throws Throwable {
    throw __call3021001_0(p0);
}
private static native org.lwjgl.opengl.DisplayMode[] __call210_0() throws Throwable;
private static native int __call210_1(org.lwjgl.opengl.DisplayMode a0) throws Throwable;
private static native int __fieldRead210_2(java.awt.Dimension a0) throws Throwable;
private static native int __call210_3(org.lwjgl.opengl.DisplayMode a0) throws Throwable;
private static native int __fieldRead210_4(java.awt.Dimension a0) throws Throwable;
private static native org.lwjgl.opengl.DisplayMode __fieldRead210_5() throws Throwable;
private static native java.lang.Throwable __call3021000_0(org.lwjgl.LWJGLException a0) throws Throwable;
private static native java.lang.Throwable __call3021001_0(org.lwjgl.LWJGLException a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_94671de1b59ba7199530(java.io.InputStream a0, java.lang.String a1) throws E;
private static final class __SourceHandler_94671de1b59ba7199530 {

public static java.lang.String f125(java.io.InputStream p0, java.lang.String p1) throws Throwable {
    java.io.InputStreamReader life2_5;
    java.io.BufferedReader life3_10;
    java.lang.StringBuilder life4_14;
    java.lang.String life5_17;
    life2_5 = new java.io.InputStreamReader(p0, p1);
    life3_10 = new java.io.BufferedReader(life2_5);
    life4_14 = new java.lang.StringBuilder();
    terminal_cycle_15: while (true) {
        cycle_join_23: {
        life5_17 = __call125_0(life3_10);
        if (!((life5_17 == null))) {
        break cycle_join_23;
    }
        return __call125_1(life4_14);
        }
        __call125_2(life4_14, life5_17);
        __call125_3(life4_14, "\n");
        continue terminal_cycle_15;
    }
}
public static java.lang.String h125_0(java.io.IOException p0) throws Throwable {
    throw __call2012500_0(p0);
}
private static native java.lang.String __call125_0(java.io.BufferedReader a0) throws Throwable;
private static native java.lang.String __call125_1(java.lang.StringBuilder a0) throws Throwable;
private static native java.lang.StringBuilder __call125_2(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call125_3(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.Throwable __call2012500_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_9b35b6a72a24b1a0627d(java.lang.Boolean a0) throws E;
private static final class __SourceHandler_9b35b6a72a24b1a0627d {

public static boolean f590(java.lang.Boolean p0) throws Throwable {
    int forwardValue590_8_0;
    forward_join_8: {
    forward_join_7: {
    if (!((p0 != null))) {
        break forward_join_7;
    }
    if (!(__call590_0(p0))) {
        break forward_join_7;
    }
    forwardValue590_8_0 = 1;
    break forward_join_8;
    }
    forwardValue590_8_0 = 0;
    }
    return __integerCategory590_1(forwardValue590_8_0);
}
public static void h590_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1059000_0(p0);
}
public static void h590_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1059001_0(p0);
}
private static native boolean __call590_0(java.lang.Boolean a0) throws Throwable;
private static native boolean __integerCategory590_1(int value) throws Throwable;
private static native java.lang.Throwable __call1059000_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Throwable __call1059001_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_a7deeb337139729065eb(java.lang.Object a0, java.lang.String a1) throws E;
private static final class __SourceHandler_a7deeb337139729065eb {

public static void f970(java.lang.Object p0, java.lang.String p1) throws Throwable {
    if ((p0 == null)) {
        throw new java.lang.NullPointerException(p1);
    }
    return;
}
public static void h970_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1097000_0(p0);
}
private static native java.lang.Throwable __call1097000_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_1323e7b5441c590cf4a6(java.lang.Object a0, java.lang.Object[] a1) throws E;
private static final class __SourceHandler_1323e7b5441c590cf4a6 {

public static boolean f971(java.lang.Object p0, java.lang.Object[] p1) throws Throwable {
    java.lang.Object[] life2_3;
    int life3_6;
    int life4_8;
    java.lang.Object life5_15;
    if ((p1 != null)) {
        life2_3 = p1;
        life3_6 = (life2_3).length;
        life4_8 = 0;
        loop_region_9: while ((life4_8 < life3_6)) {
        life5_15 = (life2_3)[life4_8];
        if (__call971_0(p0, life5_15)) {
        return true;
    }
        life4_8 += 1;
    }
    }
    return false;
}
public static void h971_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1097100_0(p0);
}
private static native boolean __call971_0(java.lang.Object a0, java.lang.Object a1) throws Throwable;
private static native java.lang.Throwable __call1097100_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_8c683d03e84ec72c34c2(java.lang.String a0) throws E;
private static final class __SourceHandler_8c683d03e84ec72c34c2 {

public static java.lang.String f972(java.lang.String p0) throws Throwable {
    return ((p0 == null) ? "" : p0);
}
public static void h972_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1097200_0(p0);
}
private static native java.lang.Throwable __call1097200_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> float __sourceHandlerCall_7693e953f0779bccd8a7(java.lang.String a0, float a1) throws E;
private static final class __SourceHandler_7693e953f0779bccd8a7 {

public static float f86(java.lang.String p0, float p1) throws Throwable {
    java.lang.String life0_8;
    if ((p0 == null)) {
        return p1;
    }
    life0_8 = __call86_0(p0);
    return __call86_1(life0_8);
}
public static float h86_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call2008600_0(p0);
}
public static float h86_1(java.lang.NumberFormatException p0, float p1) throws Throwable {
    java.lang.NumberFormatException local2 = p0;
    return p1;
}
private static native java.lang.String __call86_0(java.lang.String a0) throws Throwable;
private static native float __call86_1(java.lang.String a0) throws Throwable;
private static native java.lang.Throwable __call2008600_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_1a44b94668ac50130fcb(java.lang.String a0, int a1) throws E;
private static final class __SourceHandler_1a44b94668ac50130fcb {

public static int f87(java.lang.String p0, int p1) throws Throwable {
    java.lang.String life0_8;
    if ((p0 == null)) {
        return p1;
    }
    life0_8 = __call87_0(p0);
    return __call87_1(life0_8);
}
public static int h87_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call2008700_0(p0);
}
public static int h87_1(java.lang.NumberFormatException p0, int p1) throws Throwable {
    java.lang.NumberFormatException local2 = p0;
    return p1;
}
private static native java.lang.String __call87_0(java.lang.String a0) throws Throwable;
private static native int __call87_1(java.lang.String a0) throws Throwable;
private static native java.lang.Throwable __call2008700_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.Boolean __sourceHandlerCall_b809388de9c73e3eb6ef(java.lang.String a0, java.lang.Boolean a1) throws E;
private static final class __SourceHandler_b809388de9c73e3eb6ef {

public static java.lang.Boolean f88(java.lang.String p0, java.lang.Boolean p1) throws Throwable {
    java.lang.String life0_9;
    if ((p0 == null)) {
        return p1;
    }
    life0_9 = __call88_1(__call88_0(p0));
    return (__call88_2(life0_9, "true") ? __fieldRead88_3() : (__call88_4(life0_9, "false") ? __fieldRead88_5() : p1));
}
public static java.lang.Boolean h88_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call2008800_0(p0);
}
public static java.lang.Boolean h88_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call2008801_0(p0);
}
public static java.lang.Boolean h88_2(java.lang.NumberFormatException p0) throws Throwable {
    throw __call2008802_0(p0);
}
public static java.lang.Boolean h88_3(java.lang.NumberFormatException p0, java.lang.Boolean p1) throws Throwable {
    java.lang.NumberFormatException local2 = p0;
    return p1;
}
private static native java.lang.String __call88_0(java.lang.String a0) throws Throwable;
private static native java.lang.String __call88_1(java.lang.String a0) throws Throwable;
private static native boolean __call88_2(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.Boolean __fieldRead88_3() throws Throwable;
private static native boolean __call88_4(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.Boolean __fieldRead88_5() throws Throwable;
private static native java.lang.Throwable __call2008800_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Throwable __call2008801_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Throwable __call2008802_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_8ead7cc52d1c5afe553e(java.lang.String a0, java.lang.String a1) throws E;
private static final class __SourceHandler_8ead7cc52d1c5afe553e {

public static int f976(java.lang.String p0, java.lang.String p1) throws Throwable {
    java.lang.String[] life2_2;
    java.lang.String[] life3_5;
    java.lang.String life4_9;
    java.lang.String life5_13;
    int life6_29;
    int life7_35;
    java.lang.String life8_48;
    java.lang.String life9_52;
    life2_2 = __call976_0(p0);
    life3_5 = __call976_1(p1);
    life4_9 = (life2_2)[0];
    life5_13 = (life3_5)[0];
    if ((!__call976_2(life4_9, life5_13))) {
        return __call976_3(life4_9, life5_13);
    }
    life6_29 = __call976_4((life2_2)[1], -1);
    life7_35 = __call976_5((life3_5)[1], -1);
    if ((life6_29 != life7_35)) {
        return (life6_29 - life7_35);
    }
    life8_48 = (life2_2)[2];
    life9_52 = (life3_5)[2];
    if ((!__call976_6(life8_48, life9_52))) {
        if (__call976_7(life8_48)) {
        return 1;
    }
        if (__call976_8(life9_52)) {
        return -1;
    }
    }
    return __call976_9(life8_48, life9_52);
}
public static void h976_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1097600_0(p0);
}
public static void h976_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1097601_0(p0);
}
public static void h976_2(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1097602_0(p0);
}
public static void h976_3(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1097603_0(p0);
}
public static void h976_4(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1097604_0(p0);
}
private static native java.lang.String[] __call976_0(java.lang.String a0) throws Throwable;
private static native java.lang.String[] __call976_1(java.lang.String a0) throws Throwable;
private static native boolean __call976_2(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __call976_3(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __call976_4(java.lang.String a0, int a1) throws Throwable;
private static native int __call976_5(java.lang.String a0, int a1) throws Throwable;
private static native boolean __call976_6(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native boolean __call976_7(java.lang.String a0) throws Throwable;
private static native boolean __call976_8(java.lang.String a0) throws Throwable;
private static native int __call976_9(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.Throwable __call1097600_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Throwable __call1097601_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Throwable __call1097602_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Throwable __call1097603_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Throwable __call1097604_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> moom.J5 __sourceHandlerCall_9720bb3a0a1b14d7cf4a(java.lang.String a0, moom.J5 a1) throws E;
private static final class __SourceHandler_9720bb3a0a1b14d7cf4a {

public static moom.J5 f89(java.lang.String p0, moom.J5 p1) throws Throwable {
    java.util.regex.Pattern life2_6;
    java.util.regex.Matcher life3_10;
    int life4_20;
    int life5_25;
    int life6_38;
    java.lang.String life7_42;
    if ((p0 == null)) {
        return p1;
    }
    life2_6 = __call89_0("([0-9]+)\\.([0-9]+)(\\.([0-9]+))?(.+)?");
    life3_10 = __call89_1(life2_6, p0);
    if ((!__call89_2(life3_10))) {
        return p1;
    }
    life4_20 = __call89_4(__call89_3(life3_10, 1));
    life5_25 = __call89_6(__call89_5(life3_10, 2));
    life6_38 = ((__call89_7(life3_10, 4) != null) ? __call89_9(__call89_8(life3_10, 4)) : 0);
    life7_42 = __call89_10(life3_10, 5);
    return new moom.J5(life4_20, life5_25, life6_38, life7_42);
}
public static moom.J5 h89_0(java.lang.Exception p0) throws Throwable {
    throw __call2008900_0(p0);
}
public static moom.J5 h89_1(java.lang.Exception p0, moom.J5 p1) throws Throwable {
    java.lang.Exception local2 = p0;
    __call2008901_0(local2);
    return p1;
}
private static native java.util.regex.Pattern __call89_0(java.lang.String a0) throws Throwable;
private static native java.util.regex.Matcher __call89_1(java.util.regex.Pattern a0, java.lang.String a1) throws Throwable;
private static native boolean __call89_2(java.util.regex.Matcher a0) throws Throwable;
private static native java.lang.String __call89_3(java.util.regex.Matcher a0, int a1) throws Throwable;
private static native int __call89_4(java.lang.String a0) throws Throwable;
private static native java.lang.String __call89_5(java.util.regex.Matcher a0, int a1) throws Throwable;
private static native int __call89_6(java.lang.String a0) throws Throwable;
private static native java.lang.String __call89_7(java.util.regex.Matcher a0, int a1) throws Throwable;
private static native java.lang.String __call89_8(java.util.regex.Matcher a0, int a1) throws Throwable;
private static native int __call89_9(java.lang.String a0) throws Throwable;
private static native java.lang.String __call89_10(java.util.regex.Matcher a0, int a1) throws Throwable;
private static native java.lang.Throwable __call2008900_0(java.lang.Exception a0) throws Throwable;
private static native void __call2008901_0(java.lang.Exception a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_5035c217f1a7468caa8e(java.lang.String a0, boolean a1) throws E;
private static final class __SourceHandler_5035c217f1a7468caa8e {

public static boolean f90(java.lang.String p0, boolean p1) throws Throwable {
    java.lang.String life0_8;
    if ((p0 == null)) {
        return p1;
    }
    life0_8 = __call90_0(p0);
    return __call90_1(life0_8);
}
public static boolean h90_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call2009000_0(p0);
}
public static boolean h90_1(java.lang.NumberFormatException p0, boolean p1) throws Throwable {
    java.lang.NumberFormatException local2 = p0;
    return p1;
}
private static native java.lang.String __call90_0(java.lang.String a0) throws Throwable;
private static native boolean __call90_1(java.lang.String a0) throws Throwable;
private static native java.lang.Throwable __call2009000_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.Object[] __sourceHandlerCall_62df1a9fa06b5b9bba30(java.util.Collection a0, java.lang.Class a1) throws E;
private static final class __SourceHandler_62df1a9fa06b5b9bba30 {

public static java.lang.Object[] f979(java.util.Collection p0, java.lang.Class p1) throws Throwable {
    java.lang.Object[] life2_28;
    if ((p0 == null)) {
        return null;
    }
    if ((p1 == null)) {
        return null;
    }
    if (__call979_0(p1)) {
        throw new java.lang.IllegalArgumentException(__invokedynamic979_1(p1));
    }
    life2_28 = __cast979_4(__call979_3(p1, __call979_2(p0)));
    return __call979_5(p0, life2_28);
}
public static void h979_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1097900_0(p0);
}
public static void h979_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1097901_0(p0);
}
public static void h979_2(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1097902_0(p0);
}
private static native boolean __call979_0(java.lang.Class a0) throws Throwable;
private static native java.lang.String __invokedynamic979_1(java.lang.Class a0) throws Throwable;
private static native int __call979_2(java.util.Collection a0) throws Throwable;
private static native java.lang.Object __call979_3(java.lang.Class a0, int a1) throws Throwable;
private static native java.lang.Object[] __cast979_4(java.lang.Object a0) throws Throwable;
private static native java.lang.Object[] __call979_5(java.util.Collection a0, java.lang.Object[] a1) throws Throwable;
private static native java.lang.Throwable __call1097900_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Throwable __call1097901_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Throwable __call1097902_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_f3899c5971b4525b2080(java.util.List a0, java.lang.String a1) throws E;
private static final class __SourceHandler_f3899c5971b4525b2080 {

public static java.lang.String f980(java.util.List p0, java.lang.String p1) throws Throwable {
    java.lang.StringBuilder life2_13;
    int life3_15;
    java.lang.Object life4_23;
    if ((p0 == null)) {
        return "";
    }
    life2_13 = new java.lang.StringBuilder((__call980_0(p0) * 5));
    life3_15 = 0;
    loop_region_14: while ((life3_15 < __call980_1(p0))) {
        life4_23 = __call980_2(p0, life3_15);
        if ((life3_15 > 0)) {
        __call980_3(life2_13, p1);
    }
        __call980_4(life2_13, life4_23);
        life3_15 += 1;
    }
    return __call980_5(life2_13);
}
public static void h980_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1098000_0(p0);
}
public static void h980_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1098001_0(p0);
}
private static native int __call980_0(java.util.List a0) throws Throwable;
private static native int __call980_1(java.util.List a0) throws Throwable;
private static native java.lang.Object __call980_2(java.util.List a0, int a1) throws Throwable;
private static native java.lang.StringBuilder __call980_3(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call980_4(java.lang.StringBuilder a0, java.lang.Object a1) throws Throwable;
private static native java.lang.String __call980_5(java.lang.StringBuilder a0) throws Throwable;
private static native java.lang.Throwable __call1098000_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Throwable __call1098001_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> moom.n3 __sourceHandlerCall_96a015ee7b8f1b655606(moom.n3 a0) throws E;
private static final class __SourceHandler_96a015ee7b8f1b655606 {

public static moom.n3 f91(moom.n3 p0) throws Throwable {
    moom.DD life1_4;
    java.io.InputStream life2_7;
    java.awt.image.BufferedImage life3_14;
    life1_4 = new moom.DD("textures/gui/title/mojang.png");
    life2_7 = __call91_0(life1_4);
    if ((life2_7 == null)) {
        return p0;
    }
    life3_14 = __call91_1(life2_7);
    if ((life3_14 == null)) {
        return p0;
    }
    return new moom.n3(life3_14);
}
public static moom.n3 h91_0(java.lang.Exception p0, moom.n3 p1) throws Throwable {
    java.lang.Exception local2 = p0;
    __call2009100_4(__invokedynamic2009100_3(__call2009100_1(__call2009100_0(local2)), __call2009100_2(local2)));
    return p1;
}
private static native java.io.InputStream __call91_0(moom.DD a0) throws Throwable;
private static native java.awt.image.BufferedImage __call91_1(java.io.InputStream a0) throws Throwable;
private static native java.lang.Class __call2009100_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.String __call2009100_1(java.lang.Class a0) throws Throwable;
private static native java.lang.String __call2009100_2(java.lang.Exception a0) throws Throwable;
private static native java.lang.String __invokedynamic2009100_3(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call2009100_4(java.lang.String a0) throws Throwable;

}

private static native <E extends Throwable> java.io.InputStream __sourceHandlerCall_d94953c03725c5c99985(moom.oR a0, moom.DD a1) throws E;
private static final class __SourceHandler_d94953c03725c5c99985 {

public static java.io.InputStream f982(moom.oR p0, moom.DD p1) throws Throwable {
    net.minecraft.client.resources.IResource life2_3;
    life2_3 = __call982_0(p0, p1);
    return ((life2_3 == null) ? null : __call982_1(life2_3));
}
public static void h982_0(java.io.IOException p0) throws Throwable {
    throw __call1098200_0(p0);
}
private static native net.minecraft.client.resources.IResource __call982_0(moom.oR a0, moom.DD a1) throws Throwable;
private static native java.io.InputStream __call982_1(net.minecraft.client.resources.IResource a0) throws Throwable;
private static native java.lang.Throwable __call1098200_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_61ccdc7a6fb14b97f391(net.minecraft.client.settings.GameSettings a0) throws E;
private static final class __SourceHandler_61ccdc7a6fb14b97f391 {

public static void f100079(net.minecraft.client.settings.GameSettings p0) throws Throwable {
    forest_join_7: {
    if (!((__fieldRead100079_0() == null))) {
        break forest_join_7;
    }
    __fieldWrite100079_1(p0);
    __fieldWrite100079_3(__call100079_2());
    __call100079_4();
    }
    return;
}
public static void h100079_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call13007900_0(p0);
}
private static native net.minecraft.client.settings.GameSettings __fieldRead100079_0() throws Throwable;
private static native void __fieldWrite100079_1(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native org.lwjgl.opengl.DisplayMode __call100079_2() throws Throwable;
private static native void __fieldWrite100079_3(org.lwjgl.opengl.DisplayMode a0) throws Throwable;
private static native void __call100079_4() throws Throwable;
private static native java.lang.Throwable __call13007900_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_1fd2d0c1cf342304492d(float[] a0, java.lang.String a1) throws E;
private static final class __SourceHandler_1fd2d0c1cf342304492d {

public static java.lang.String f984(float[] p0, java.lang.String p1) throws Throwable {
    java.lang.StringBuilder life2_13;
    int life3_15;
    float life4_23;
    if ((p0 == null)) {
        return "";
    }
    life2_13 = new java.lang.StringBuilder(((p0).length * 5));
    life3_15 = 0;
    loop_region_14: while ((life3_15 < (p0).length)) {
        life4_23 = (p0)[life3_15];
        if ((life3_15 > 0)) {
        __call984_0(life2_13, p1);
    }
        __call984_1(life2_13, life4_23);
        life3_15 += 1;
    }
    return __call984_2(life2_13);
}
public static void h984_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1098400_0(p0);
}
public static void h984_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1098401_0(p0);
}
private static native java.lang.StringBuilder __call984_0(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call984_1(java.lang.StringBuilder a0, float a1) throws Throwable;
private static native java.lang.String __call984_2(java.lang.StringBuilder a0) throws Throwable;
private static native java.lang.Throwable __call1098400_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Throwable __call1098401_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_c6a09ce328f734a19c85(int[] a0, java.lang.String a1) throws E;
private static final class __SourceHandler_c6a09ce328f734a19c85 {

public static java.lang.String f985(int[] p0, java.lang.String p1) throws Throwable {
    java.lang.StringBuilder life2_13;
    int life3_15;
    int life4_23;
    if ((p0 == null)) {
        return "";
    }
    life2_13 = new java.lang.StringBuilder(((p0).length * 5));
    life3_15 = 0;
    loop_region_14: while ((life3_15 < (p0).length)) {
        life4_23 = (p0)[life3_15];
        if ((life3_15 > 0)) {
        __call985_0(life2_13, p1);
    }
        __call985_1(life2_13, life4_23);
        life3_15 += 1;
    }
    return __call985_2(life2_13);
}
public static void h985_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1098500_0(p0);
}
public static void h985_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1098501_0(p0);
}
private static native java.lang.StringBuilder __call985_0(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call985_1(java.lang.StringBuilder a0, int a1) throws Throwable;
private static native java.lang.String __call985_2(java.lang.StringBuilder a0) throws Throwable;
private static native java.lang.Throwable __call1098500_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Throwable __call1098501_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> int[] __sourceHandlerCall_0e2e82be58a10f44719e(int[] a0, int[] a1) throws E;
private static final class __SourceHandler_0e2e82be58a10f44719e {

public static int[] f986(int[] p0, int[] p1) throws Throwable {
    int life2_9;
    int life3_14;
    int[] life4_17;
    if ((p0 != null)) {
        if ((p1 != null)) {
        life2_9 = (p0).length;
        life3_14 = (life2_9 + (p1).length);
        life4_17 = new int[life3_14];
        __call986_0(p0, 0, life4_17, 0, life2_9);
        __call986_1(p1, 0, life4_17, life2_9, (p1).length);
        return life4_17;
    }
    }
    throw new java.lang.NullPointerException("The given array is NULL");
}
public static void h986_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1098600_0(p0);
}
private static native void __call986_0(int[] a0, int a1, int[] a2, int a3, int a4) throws Throwable;
private static native void __call986_1(int[] a0, int a1, int[] a2, int a3, int a4) throws Throwable;
private static native java.lang.Throwable __call1098600_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> int[] __sourceHandlerCall_363923571a9db629b42e(java.lang.Integer[] a0) throws E;
private static final class __SourceHandler_363923571a9db629b42e {

public static int[] f987(java.lang.Integer[] p0) throws Throwable {
    int[] life1_17;
    int life2_19;
    if ((p0 == null)) {
        return null;
    }
    if (((p0).length == 0)) {
        return new int[0];
    }
    life1_17 = new int[(p0).length];
    life2_19 = 0;
    loop_region_16: while ((life2_19 < (life1_17).length)) {
        (life1_17)[life2_19] = __call987_0((p0)[life2_19]);
        life2_19 += 1;
    }
    return life1_17;
}
public static void h987_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1098700_0(p0);
}
public static void h987_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1098701_0(p0);
}
public static void h987_2(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1098702_0(p0);
}
private static native int __call987_0(java.lang.Integer a0) throws Throwable;
private static native java.lang.Throwable __call1098700_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Throwable __call1098701_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Throwable __call1098702_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.Object[] __sourceHandlerCall_36611175fdb38afdba1b(java.lang.Object[] a0, java.lang.Object a1) throws E;
private static final class __SourceHandler_36611175fdb38afdba1b {

public static java.lang.Object[] f988(java.lang.Object[] p0, java.lang.Object p1) throws Throwable {
    int life2_11;
    int life3_15;
    java.lang.Object[] life4_22;
    if ((p0 == null)) {
        throw new java.lang.NullPointerException("The given array is NULL");
    }
    life2_11 = (p0).length;
    life3_15 = (life2_11 + 1);
    life4_22 = __cast988_3(__call988_2(__call988_1(__call988_0(p0)), life3_15));
    __call988_4(p0, 0, life4_22, 0, life2_11);
    (life4_22)[life2_11] = p1;
    return life4_22;
}
public static void h988_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1098800_0(p0);
}
private static native java.lang.Class __call988_0(java.lang.Object[] a0) throws Throwable;
private static native java.lang.Class __call988_1(java.lang.Class a0) throws Throwable;
private static native java.lang.Object __call988_2(java.lang.Class a0, int a1) throws Throwable;
private static native java.lang.Object[] __cast988_3(java.lang.Object a0) throws Throwable;
private static native void __call988_4(java.lang.Object[] a0, int a1, java.lang.Object[] a2, int a3, int a4) throws Throwable;
private static native java.lang.Throwable __call1098800_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_63223da2a22b5df6960b(java.lang.Object[] a0, java.lang.String a1) throws E;
private static final class __SourceHandler_63223da2a22b5df6960b {

public static java.lang.String f989(java.lang.Object[] p0, java.lang.String p1) throws Throwable {
    java.lang.StringBuilder life2_13;
    int life3_15;
    java.lang.Object life4_23;
    if ((p0 == null)) {
        return "";
    }
    life2_13 = new java.lang.StringBuilder(((p0).length * 5));
    life3_15 = 0;
    loop_region_14: while ((life3_15 < (p0).length)) {
        life4_23 = (p0)[life3_15];
        if ((life3_15 > 0)) {
        __call989_0(life2_13, p1);
    }
        __call989_1(life2_13, life4_23);
        life3_15 += 1;
    }
    return __call989_2(life2_13);
}
public static void h989_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1098900_0(p0);
}
public static void h989_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1098901_0(p0);
}
private static native java.lang.StringBuilder __call989_0(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call989_1(java.lang.StringBuilder a0, java.lang.Object a1) throws Throwable;
private static native java.lang.String __call989_2(java.lang.StringBuilder a0) throws Throwable;
private static native java.lang.Throwable __call1098900_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Throwable __call1098901_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.Object[] __sourceHandlerCall_d4458255f123a8c62e95(java.lang.Object[] a0, java.lang.Object[] a1) throws E;
private static final class __SourceHandler_d4458255f123a8c62e95 {

public static java.lang.Object[] f990(java.lang.Object[] p0, java.lang.Object[] p1) throws Throwable {
    int life2_18;
    int life3_23;
    java.lang.Object[] life4_30;
    if ((p0 == null)) {
        throw new java.lang.NullPointerException("The given array is NULL");
    }
    if (((p1).length == 0)) {
        return p0;
    }
    life2_18 = (p0).length;
    life3_23 = (life2_18 + (p1).length);
    life4_30 = __cast990_3(__call990_2(__call990_1(__call990_0(p0)), life3_23));
    __call990_4(p0, 0, life4_30, 0, life2_18);
    __call990_5(p1, 0, life4_30, life2_18, (p1).length);
    return life4_30;
}
public static void h990_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1099000_0(p0);
}
public static void h990_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1099001_0(p0);
}
private static native java.lang.Class __call990_0(java.lang.Object[] a0) throws Throwable;
private static native java.lang.Class __call990_1(java.lang.Class a0) throws Throwable;
private static native java.lang.Object __call990_2(java.lang.Class a0, int a1) throws Throwable;
private static native java.lang.Object[] __cast990_3(java.lang.Object a0) throws Throwable;
private static native void __call990_4(java.lang.Object[] a0, int a1, java.lang.Object[] a2, int a3, int a4) throws Throwable;
private static native void __call990_5(java.lang.Object[] a0, int a1, java.lang.Object[] a2, int a3, int a4) throws Throwable;
private static native java.lang.Throwable __call1099000_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Throwable __call1099001_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> org.lwjgl.opengl.DisplayMode[] __sourceHandlerCall_311677aac39f79bb2eab(org.lwjgl.opengl.DisplayMode[] a0, java.awt.Dimension a1) throws E;
private static final class __SourceHandler_311677aac39f79bb2eab {

public static org.lwjgl.opengl.DisplayMode[] f212(org.lwjgl.opengl.DisplayMode[] p0, java.awt.Dimension p1) throws Throwable {
    java.util.ArrayList life2_3;
    org.lwjgl.opengl.DisplayMode[] life3_5;
    int life4_8;
    int life5_10;
    org.lwjgl.opengl.DisplayMode life6_17;
    forest_join_38: {
    life2_3 = new java.util.ArrayList();
    life3_5 = p0;
    life4_8 = (life3_5).length;
    life5_10 = 0;
    forest_cycle_11: while (true) {
    forest_join_36: {
    if (!((life5_10 < life4_8))) {
        break forest_join_38;
    }
    life6_17 = (life3_5)[life5_10];
    if (!((__numericCompare212_2(((double) __call212_0(life6_17)), __call212_1(p1)) == 0))) {
        break forest_join_36;
    }
    if (!((__numericCompare212_5(((double) __call212_3(life6_17)), __call212_4(p1)) == 0))) {
        break forest_join_36;
    }
    __call212_6(life2_3, life6_17);
    }
    life5_10 += 1;
    continue forest_cycle_11;
    }
    }
    return __cast212_8(__call212_7(life2_3, new org.lwjgl.opengl.DisplayMode[0]));
}
public static org.lwjgl.opengl.DisplayMode[] h212_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3021200_0(p0);
}
public static org.lwjgl.opengl.DisplayMode[] h212_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3021201_0(p0);
}
private static native int __call212_0(org.lwjgl.opengl.DisplayMode a0) throws Throwable;
private static native double __call212_1(java.awt.Dimension a0) throws Throwable;
private static native int __numericCompare212_2(double a0, double a1) throws Throwable;
private static native int __call212_3(org.lwjgl.opengl.DisplayMode a0) throws Throwable;
private static native double __call212_4(java.awt.Dimension a0) throws Throwable;
private static native int __numericCompare212_5(double a0, double a1) throws Throwable;
private static native boolean __call212_6(java.util.ArrayList a0, org.lwjgl.opengl.DisplayMode a1) throws Throwable;
private static native java.lang.Object[] __call212_7(java.util.ArrayList a0, org.lwjgl.opengl.DisplayMode[] a1) throws Throwable;
private static native org.lwjgl.opengl.DisplayMode[] __cast212_8(java.lang.Object[] a0) throws Throwable;
private static native java.lang.Throwable __call3021200_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Throwable __call3021201_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> org.lwjgl.opengl.DisplayMode __sourceHandlerCall_966b390b5e80d99b3a32(org.lwjgl.opengl.DisplayMode[] a0, org.lwjgl.opengl.DisplayMode a1) throws E;
private static final class __SourceHandler_966b390b5e80d99b3a32 {

public static org.lwjgl.opengl.DisplayMode f213(org.lwjgl.opengl.DisplayMode[] p0, org.lwjgl.opengl.DisplayMode p1) throws Throwable {
    org.lwjgl.opengl.DisplayMode[] life2_3;
    int life3_6;
    int life4_8;
    org.lwjgl.opengl.DisplayMode life5_15;
    forest_join_36: {
    forest_join_31: {
    forest_join_29: {
    if (!((p1 != null))) {
        break forest_join_31;
    }
    life2_3 = p0;
    life3_6 = (life2_3).length;
    life4_8 = 0;
    forest_cycle_9: while (true) {
    forest_join_27: {
    if (!((life4_8 < life3_6))) {
        break forest_join_31;
    }
    life5_15 = (life2_3)[life4_8];
    if (!((__call213_0(life5_15) == __call213_1(p1)))) {
        break forest_join_27;
    }
    if (!((__call213_2(life5_15) == __call213_3(p1)))) {
        break forest_join_27;
    }
    break forest_join_29;
    }
    life4_8 += 1;
    continue forest_cycle_9;
    }
    }
    return life5_15;
    }
    if (!(((p0).length == 0))) {
        break forest_join_36;
    }
    return null;
    }
    __call213_4(p0, new moom.NL());
    return (p0)[((p0).length - 1)];
}
public static org.lwjgl.opengl.DisplayMode h213_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3021300_0(p0);
}
public static org.lwjgl.opengl.DisplayMode h213_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3021301_0(p0);
}
public static org.lwjgl.opengl.DisplayMode h213_2(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3021302_0(p0);
}
private static native int __call213_0(org.lwjgl.opengl.DisplayMode a0) throws Throwable;
private static native int __call213_1(org.lwjgl.opengl.DisplayMode a0) throws Throwable;
private static native int __call213_2(org.lwjgl.opengl.DisplayMode a0) throws Throwable;
private static native int __call213_3(org.lwjgl.opengl.DisplayMode a0) throws Throwable;
private static native void __call213_4(org.lwjgl.opengl.DisplayMode[] a0, moom.NL a1) throws Throwable;
private static native java.lang.Throwable __call3021300_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Throwable __call3021301_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Throwable __call3021302_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_90e69750a608bcdb3695(boolean[] a0, java.lang.String a1) throws E;
private static final class __SourceHandler_90e69750a608bcdb3695 {

public static java.lang.String f993(boolean[] p0, java.lang.String p1) throws Throwable {
    java.lang.StringBuilder life2_13;
    int life3_15;
    int life4_23;
    if ((p0 == null)) {
        return "";
    }
    life2_13 = new java.lang.StringBuilder(((p0).length * 5));
    life3_15 = 0;
    loop_region_14: while ((life3_15 < (p0).length)) {
        life4_23 = __integerCategory993_0((p0)[life3_15]);
        if ((life3_15 > 0)) {
        __call993_1(life2_13, p1);
    }
        __call993_2(life2_13, life4_23);
        life3_15 += 1;
    }
    return __call993_3(life2_13);
}
public static void h993_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1099300_0(p0);
}
public static void h993_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1099301_0(p0);
}
private static native int __integerCategory993_0(boolean value) throws Throwable;
private static native java.lang.StringBuilder __call993_1(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call993_2(java.lang.StringBuilder a0, int a1) throws Throwable;
private static native java.lang.String __call993_3(java.lang.StringBuilder a0) throws Throwable;
private static native java.lang.Throwable __call1099300_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Throwable __call1099301_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_8f082354f2808a4b0071() throws E;
private static final class __SourceHandler_8f082354f2808a4b0071 {

public static boolean f591() throws Throwable {
    int forwardValue591_9_0;
    forward_join_9: {
    forward_join_8: {
    forward_join_6: {
    if (!(__call591_0())) {
        break forward_join_8;
    }
    if (!(__call591_1())) {
        break forward_join_6;
    }
    if (!(__call591_2())) {
        break forward_join_8;
    }
    }
    forwardValue591_9_0 = 1;
    break forward_join_9;
    }
    forwardValue591_9_0 = 0;
    }
    return __integerCategory591_3(forwardValue591_9_0);
}
public static void h591_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1059100_0(p0);
}
public static void h591_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1059101_0(p0);
}
public static void h591_2(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1059102_0(p0);
}
private static native boolean __call591_0() throws Throwable;
private static native boolean __call591_1() throws Throwable;
private static native boolean __call591_2() throws Throwable;
private static native boolean __integerCategory591_3(int value) throws Throwable;
private static native java.lang.Throwable __call1059100_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Throwable __call1059101_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Throwable __call1059102_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_3f09b47494a7a5ccb408() throws E;
private static final class __SourceHandler_3f09b47494a7a5ccb408 {

public static boolean f592() throws Throwable {
    int forwardValue592_9_0;
    forward_join_9: {
    forward_join_8: {
    if (!((__call592_1(__fieldRead592_0()) != null))) {
        break forward_join_8;
    }
    if (!(__call592_3(__fieldRead592_2()))) {
        break forward_join_8;
    }
    forwardValue592_9_0 = 1;
    break forward_join_9;
    }
    forwardValue592_9_0 = 0;
    }
    return __integerCategory592_4(forwardValue592_9_0);
}
public static void h592_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1059200_0(p0);
}
public static void h592_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1059201_0(p0);
}
private static native net.minecraft.client.Minecraft __fieldRead592_0() throws Throwable;
private static native net.minecraft.server.integrated.IntegratedServer __call592_1(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead592_2() throws Throwable;
private static native boolean __call592_3(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __integerCategory592_4(int value) throws Throwable;
private static native java.lang.Throwable __call1059200_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Throwable __call1059201_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_0eaf27d24b03212362dc() throws E;
private static final class __SourceHandler_0eaf27d24b03212362dc {

public static boolean f593() throws Throwable {
    int forwardValue593_7_0;
    forward_join_7: {
    forward_join_6: {
    if (!(__call593_0())) {
        break forward_join_6;
    }
    if (!((!__call593_1()))) {
        break forward_join_6;
    }
    forwardValue593_7_0 = 1;
    break forward_join_7;
    }
    forwardValue593_7_0 = 0;
    }
    return __integerCategory593_2(forwardValue593_7_0);
}
public static void h593_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1059300_0(p0);
}
public static void h593_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1059301_0(p0);
}
private static native boolean __call593_0() throws Throwable;
private static native boolean __call593_1() throws Throwable;
private static native boolean __integerCategory593_2(int value) throws Throwable;
private static native java.lang.Throwable __call1059300_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Throwable __call1059301_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> byte[] __sourceHandlerCall_e21040221d196a3e564f(java.io.InputStream a0) throws E;
private static final class __SourceHandler_e21040221d196a3e564f {

public static byte[] f126(java.io.InputStream p0) throws Throwable {
    long life1_3;
    java.io.ByteArrayOutputStream life3_7;
    byte[] life4_14;
    int life5_18;
    life1_3 = (__fieldRead126_0() ^ 79385214681334L);
    life3_7 = new java.io.ByteArrayOutputStream();
    life4_14 = new byte[__invokedynamic126_1(4350, (7843587812550543755L ^ life1_3))];
    terminal_cycle_15: while (true) {
        cycle_join_26: {
        life5_18 = __call126_2(p0, life4_14);
        if (!((life5_18 < 0))) {
        break cycle_join_26;
    }
        __call126_3(p0);
        return __call126_4(life3_7);
        }
        __call126_5(life3_7, life4_14, 0, life5_18);
        continue terminal_cycle_15;
    }
}
public static byte[] h126_0(java.io.IOException p0) throws Throwable {
    throw __call2012600_0(p0);
}
private static native long __fieldRead126_0() throws Throwable;
private static native int __invokedynamic126_1(int a0, long a1) throws Throwable;
private static native int __call126_2(java.io.InputStream a0, byte[] a1) throws Throwable;
private static native void __call126_3(java.io.InputStream a0) throws Throwable;
private static native byte[] __call126_4(java.io.ByteArrayOutputStream a0) throws Throwable;
private static native void __call126_5(java.io.ByteArrayOutputStream a0, byte[] a1, int a2, int a3) throws Throwable;
private static native java.lang.Throwable __call2012600_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> org.lwjgl.opengl.DisplayMode[] __sourceHandlerCall_267dcdcea5bff73b1764() throws E;
private static final class __SourceHandler_267dcdcea5bff73b1764 {

public static org.lwjgl.opengl.DisplayMode[] f214() throws Throwable {
    org.lwjgl.opengl.DisplayMode[] life0_3;
    java.util.Set life1_6;
    java.util.ArrayList life2_10;
    java.util.Iterator life3_13;
    java.awt.Dimension life4_20;
    org.lwjgl.opengl.DisplayMode[] life5_24;
    org.lwjgl.opengl.DisplayMode life6_28;
    org.lwjgl.opengl.DisplayMode[] life3_42;
    forest_join_49: {
    forest_join_36: {
    if (!((__fieldRead214_0() == null))) {
        break forest_join_49;
    }
    life0_3 = __call214_1();
    life1_6 = __call214_2(life0_3);
    life2_10 = new java.util.ArrayList();
    life3_13 = __call214_3(life1_6);
    forest_cycle_14: while (true) {
    forest_join_35: {
    if (!(__call214_4(life3_13))) {
        break forest_join_36;
    }
    life4_20 = __cast214_6(__call214_5(life3_13));
    life5_24 = __call214_7(life0_3, life4_20);
    life6_28 = __call214_9(life5_24, __fieldRead214_8());
    if (!((life6_28 != null))) {
        break forest_join_35;
    }
    __call214_10(life2_10, life6_28);
    }
    continue forest_cycle_14;
    }
    }
    life3_42 = __cast214_12(__call214_11(life2_10, new org.lwjgl.opengl.DisplayMode[0]));
    __call214_13(life3_42, new moom.NL());
    return life3_42;
    }
    return __fieldRead214_14();
}
public static org.lwjgl.opengl.DisplayMode[] h214_0(java.lang.Exception p0) throws Throwable {
    throw __call3021400_0(p0);
}
public static org.lwjgl.opengl.DisplayMode[] h214_1(java.lang.Exception p0) throws Throwable {
    org.lwjgl.opengl.DisplayMode[] spill3021401_0;
    java.lang.Exception life1_2;
    life1_2 = p0;
    __call3021401_0(life1_2);
    org.lwjgl.opengl.DisplayMode[] __stackOp3021401_1_0 = new org.lwjgl.opengl.DisplayMode[1];
    spill3021401_0 = __stackOp3021401_1_0;
    (__stackOp3021401_1_0)[0] = __fieldRead3021401_2();
    __fieldWrite3021401_3(spill3021401_0);
    return __fieldRead3021401_4();
}
private static native org.lwjgl.opengl.DisplayMode[] __fieldRead214_0() throws Throwable;
private static native org.lwjgl.opengl.DisplayMode[] __call214_1() throws Throwable;
private static native java.util.Set __call214_2(org.lwjgl.opengl.DisplayMode[] a0) throws Throwable;
private static native java.util.Iterator __call214_3(java.util.Set a0) throws Throwable;
private static native boolean __call214_4(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call214_5(java.util.Iterator a0) throws Throwable;
private static native java.awt.Dimension __cast214_6(java.lang.Object a0) throws Throwable;
private static native org.lwjgl.opengl.DisplayMode[] __call214_7(org.lwjgl.opengl.DisplayMode[] a0, java.awt.Dimension a1) throws Throwable;
private static native org.lwjgl.opengl.DisplayMode __fieldRead214_8() throws Throwable;
private static native org.lwjgl.opengl.DisplayMode __call214_9(org.lwjgl.opengl.DisplayMode[] a0, org.lwjgl.opengl.DisplayMode a1) throws Throwable;
private static native boolean __call214_10(java.util.ArrayList a0, org.lwjgl.opengl.DisplayMode a1) throws Throwable;
private static native java.lang.Object[] __call214_11(java.util.ArrayList a0, org.lwjgl.opengl.DisplayMode[] a1) throws Throwable;
private static native org.lwjgl.opengl.DisplayMode[] __cast214_12(java.lang.Object[] a0) throws Throwable;
private static native void __call214_13(org.lwjgl.opengl.DisplayMode[] a0, moom.NL a1) throws Throwable;
private static native org.lwjgl.opengl.DisplayMode[] __fieldRead214_14() throws Throwable;
private static native java.lang.Throwable __call3021400_0(java.lang.Exception a0) throws Throwable;
private static native void __call3021401_0(java.lang.Exception a0) throws Throwable;
private static native org.lwjgl.opengl.DisplayMode __fieldRead3021401_2() throws Throwable;
private static native void __fieldWrite3021401_3(org.lwjgl.opengl.DisplayMode[] a0) throws Throwable;
private static native org.lwjgl.opengl.DisplayMode[] __fieldRead3021401_4() throws Throwable;

}

private static native <E extends Throwable> java.lang.String[] __sourceHandlerCall_56b8ea4f0fd55eeed377(java.io.InputStream a0) throws E;
private static final class __SourceHandler_56b8ea4f0fd55eeed377 {

public static java.lang.String[] f127(java.io.InputStream p0) throws Throwable {
    java.util.ArrayList life1_3;
    java.io.InputStreamReader life2_9;
    java.io.BufferedReader life3_14;
    java.lang.String life4_17;
    life1_3 = new java.util.ArrayList();
    life2_9 = new java.io.InputStreamReader(p0, __fieldRead127_0());
    life3_14 = new java.io.BufferedReader(life2_9);
    terminal_cycle_15: while (true) {
        cycle_join_26: {
        life4_17 = __call127_1(life3_14);
        if (!((life4_17 == null))) {
        break cycle_join_26;
    }
        return __cast127_3(__call127_2(life1_3, new java.lang.String[0]));
        }
        __call127_4(life1_3, life4_17);
        continue terminal_cycle_15;
    }
}
public static java.lang.String[] h127_0(java.io.IOException p0) throws Throwable {
    throw __call2012700_0(p0);
}
private static native java.nio.charset.Charset __fieldRead127_0() throws Throwable;
private static native java.lang.String __call127_1(java.io.BufferedReader a0) throws Throwable;
private static native java.lang.Object[] __call127_2(java.util.ArrayList a0, java.lang.String[] a1) throws Throwable;
private static native java.lang.String[] __cast127_3(java.lang.Object[] a0) throws Throwable;
private static native boolean __call127_4(java.util.ArrayList a0, java.lang.String a1) throws Throwable;
private static native java.lang.Throwable __call2012700_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String[] __sourceHandlerCall_99ea8f04e7823b30c330(java.lang.String a0) throws E;
private static final class __SourceHandler_99ea8f04e7823b30c330 {

public static java.lang.String[] f1000(java.lang.String p0) throws Throwable {
    java.util.regex.Pattern life1_10;
    java.util.regex.Matcher life2_14;
    java.lang.String life3_39;
    java.lang.String life4_44;
    java.lang.String life5_49;
    if ((p0 != null)) {
        if ((__call1000_0(p0) > 0)) {
        life1_10 = __call1000_1("([A-Z])([0-9]+)(.*)");
        life2_14 = __call1000_2(life1_10, p0);
        if ((!__call1000_3(life2_14))) {
        return new java.lang.String[] {"", "", ""};
    }
        life3_39 = __call1000_5(__call1000_4(life2_14, 1));
        life4_44 = __call1000_7(__call1000_6(life2_14, 2));
        life5_49 = __call1000_9(__call1000_8(life2_14, 3));
        return new java.lang.String[] {life3_39, life4_44, life5_49};
    }
    }
    return new java.lang.String[] {"", "", ""};
}
public static void h1000_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1100000_0(p0);
}
public static void h1000_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1100001_0(p0);
}
private static native int __call1000_0(java.lang.String a0) throws Throwable;
private static native java.util.regex.Pattern __call1000_1(java.lang.String a0) throws Throwable;
private static native java.util.regex.Matcher __call1000_2(java.util.regex.Pattern a0, java.lang.String a1) throws Throwable;
private static native boolean __call1000_3(java.util.regex.Matcher a0) throws Throwable;
private static native java.lang.String __call1000_4(java.util.regex.Matcher a0, int a1) throws Throwable;
private static native java.lang.String __call1000_5(java.lang.String a0) throws Throwable;
private static native java.lang.String __call1000_6(java.util.regex.Matcher a0, int a1) throws Throwable;
private static native java.lang.String __call1000_7(java.lang.String a0) throws Throwable;
private static native java.lang.String __call1000_8(java.util.regex.Matcher a0, int a1) throws Throwable;
private static native java.lang.String __call1000_9(java.lang.String a0) throws Throwable;
private static native java.lang.Throwable __call1100000_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Throwable __call1100001_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_3e04b2fc1639ad5505cc(float a0, float a1, float a2) throws E;
private static final class __SourceHandler_3e04b2fc1639ad5505cc {

public static boolean f594(float p0, float p1, float p2) throws Throwable {
    int forwardValue594_11_0;
    forward_join_11: {
    forward_join_10: {
    if (!((__numericCompare594_0(p0, p1) >= 0))) {
        break forward_join_10;
    }
    if (!((__numericCompare594_1(p0, p2) <= 0))) {
        break forward_join_10;
    }
    forwardValue594_11_0 = 1;
    break forward_join_11;
    }
    forwardValue594_11_0 = 0;
    }
    return __integerCategory594_2(forwardValue594_11_0);
}
public static void h594_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1059400_0(p0);
}
public static void h594_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1059401_0(p0);
}
private static native int __numericCompare594_0(float a0, float a1) throws Throwable;
private static native int __numericCompare594_1(float a0, float a1) throws Throwable;
private static native boolean __integerCategory594_2(int value) throws Throwable;
private static native java.lang.Throwable __call1059400_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Throwable __call1059401_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_d16d91a5c3615f013555(int a0, int a1, int a2) throws E;
private static final class __SourceHandler_d16d91a5c3615f013555 {

public static boolean f595(int p0, int p1, int p2) throws Throwable {
    int forwardValue595_9_0;
    forward_join_9: {
    forward_join_8: {
    if (!((p0 >= p1))) {
        break forward_join_8;
    }
    if (!((p0 <= p2))) {
        break forward_join_8;
    }
    forwardValue595_9_0 = 1;
    break forward_join_9;
    }
    forwardValue595_9_0 = 0;
    }
    return __integerCategory595_0(forwardValue595_9_0);
}
public static void h595_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1059500_0(p0);
}
public static void h595_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1059501_0(p0);
}
private static native boolean __integerCategory595_0(int value) throws Throwable;
private static native java.lang.Throwable __call1059500_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Throwable __call1059501_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_68b542428161d5fc9679(moom.DD a0) throws E;
private static final class __SourceHandler_68b542428161d5fc9679 {

public static boolean f1003(moom.DD p0) throws Throwable {
    net.minecraft.client.resources.IResourcePack life1_8;
    if ((p0 == null)) {
        return false;
    }
    life1_8 = __call1003_0(p0);
    return ((life1_8 != null) ? true : false);
}
public static void h1003_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1100300_0(p0);
}
public static void h1003_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1100301_0(p0);
}
private static native net.minecraft.client.resources.IResourcePack __call1003_0(moom.DD a0) throws Throwable;
private static native java.lang.Throwable __call1100300_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Throwable __call1100301_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_63aa09b4ab72412557d2(moom.oR a0, moom.DD a1) throws E;
private static final class __SourceHandler_63aa09b4ab72412557d2 {

public static boolean f93(moom.oR p0, moom.DD p1) throws Throwable {
    net.minecraft.client.resources.IResource life2_3;
    life2_3 = __call93_0(p0, p1);
    return ((life2_3 != null) ? true : false);
}
public static boolean h93_0(java.io.IOException p0) throws Throwable {
    throw __call2009300_0(p0);
}
public static boolean h93_1(java.io.IOException p0) throws Throwable {
    java.io.IOException local1 = p0;
    return false;
}
private static native net.minecraft.client.resources.IResource __call93_0(moom.oR a0, moom.DD a1) throws Throwable;
private static native java.lang.Throwable __call2009300_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> java.awt.Dimension __sourceHandlerCall_f90f71a697e7e8a6ffad() throws E;
private static final class __SourceHandler_f90f71a697e7e8a6ffad {

public static java.awt.Dimension f100077() throws Throwable {
    java.awt.Dimension forestValue100077_58_0;
    java.lang.String life0_16;
    java.lang.String[] life1_32;
    forest_join_58: {
    forest_join_45: {
    forest_join_29: {
    forest_join_14: {
    forest_join_4: {
    if (!((__fieldRead100077_0() == null))) {
        break forest_join_4;
    }
    return null;
    }
    if (!((__fieldRead100077_1() == null))) {
        break forest_join_14;
    }
    return new java.awt.Dimension(__call100077_3(__fieldRead100077_2()), __call100077_5(__fieldRead100077_4()));
    }
    life0_16 = __fieldRead100077_7(__fieldRead100077_6());
    if (!(__call100077_8(life0_16, "Default"))) {
        break forest_join_29;
    }
    return new java.awt.Dimension(__call100077_10(__fieldRead100077_9()), __call100077_12(__fieldRead100077_11()));
    }
    life1_32 = __call100077_13(life0_16, " x");
    if (!(((life1_32).length < 2))) {
        break forest_join_45;
    }
    forestValue100077_58_0 = new java.awt.Dimension(__call100077_15(__fieldRead100077_14()), __call100077_17(__fieldRead100077_16()));
    break forest_join_58;
    }
    forestValue100077_58_0 = new java.awt.Dimension(__call100077_18((life1_32)[0], -1), __call100077_19((life1_32)[1], -1));
    }
    return forestValue100077_58_0;
}
public static java.awt.Dimension h100077_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call13007700_0(p0);
}
public static java.awt.Dimension h100077_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call13007701_0(p0);
}
public static java.awt.Dimension h100077_2(java.lang.NumberFormatException p0) throws Throwable {
    throw __call13007702_0(p0);
}
public static java.awt.Dimension h100077_3(java.lang.NumberFormatException p0) throws Throwable {
    throw __call13007703_0(p0);
}
private static native org.lwjgl.opengl.DisplayMode __fieldRead100077_0() throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead100077_1() throws Throwable;
private static native org.lwjgl.opengl.DisplayMode __fieldRead100077_2() throws Throwable;
private static native int __call100077_3(org.lwjgl.opengl.DisplayMode a0) throws Throwable;
private static native org.lwjgl.opengl.DisplayMode __fieldRead100077_4() throws Throwable;
private static native int __call100077_5(org.lwjgl.opengl.DisplayMode a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead100077_6() throws Throwable;
private static native java.lang.String __fieldRead100077_7(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native boolean __call100077_8(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native org.lwjgl.opengl.DisplayMode __fieldRead100077_9() throws Throwable;
private static native int __call100077_10(org.lwjgl.opengl.DisplayMode a0) throws Throwable;
private static native org.lwjgl.opengl.DisplayMode __fieldRead100077_11() throws Throwable;
private static native int __call100077_12(org.lwjgl.opengl.DisplayMode a0) throws Throwable;
private static native java.lang.String[] __call100077_13(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native org.lwjgl.opengl.DisplayMode __fieldRead100077_14() throws Throwable;
private static native int __call100077_15(org.lwjgl.opengl.DisplayMode a0) throws Throwable;
private static native org.lwjgl.opengl.DisplayMode __fieldRead100077_16() throws Throwable;
private static native int __call100077_17(org.lwjgl.opengl.DisplayMode a0) throws Throwable;
private static native int __call100077_18(java.lang.String a0, int a1) throws Throwable;
private static native int __call100077_19(java.lang.String a0, int a1) throws Throwable;
private static native java.lang.Throwable __call13007700_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Throwable __call13007701_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Throwable __call13007702_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Throwable __call13007703_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> moom.J5 __sourceHandlerCall_58faa47097cea6374216() throws E;
private static final class __SourceHandler_58faa47097cea6374216 {

public static moom.J5 f100078() throws Throwable {
    moom.J5 forestValue100078_149_0;
    forest_join_149: {
    forest_join_144: {
    forest_join_135: {
    forest_join_126: {
    forest_join_117: {
    forest_join_108: {
    forest_join_99: {
    forest_join_90: {
    forest_join_81: {
    forest_join_72: {
    forest_join_63: {
    forest_join_54: {
    forest_join_45: {
    forest_join_36: {
    forest_join_27: {
    forest_join_18: {
    forest_join_9: {
    if (!(__fieldRead100078_1(__call100078_0()))) {
        break forest_join_9;
    }
    forestValue100078_149_0 = new moom.J5(4, 4);
    break forest_join_149;
    }
    if (!(__fieldRead100078_3(__call100078_2()))) {
        break forest_join_18;
    }
    forestValue100078_149_0 = new moom.J5(4, 3);
    break forest_join_149;
    }
    if (!(__fieldRead100078_5(__call100078_4()))) {
        break forest_join_27;
    }
    forestValue100078_149_0 = new moom.J5(4, 2);
    break forest_join_149;
    }
    if (!(__fieldRead100078_7(__call100078_6()))) {
        break forest_join_36;
    }
    forestValue100078_149_0 = new moom.J5(4, 1);
    break forest_join_149;
    }
    if (!(__fieldRead100078_9(__call100078_8()))) {
        break forest_join_45;
    }
    forestValue100078_149_0 = new moom.J5(4, 0);
    break forest_join_149;
    }
    if (!(__fieldRead100078_11(__call100078_10()))) {
        break forest_join_54;
    }
    forestValue100078_149_0 = new moom.J5(3, 3);
    break forest_join_149;
    }
    if (!(__fieldRead100078_13(__call100078_12()))) {
        break forest_join_63;
    }
    forestValue100078_149_0 = new moom.J5(3, 2);
    break forest_join_149;
    }
    if (!(__fieldRead100078_15(__call100078_14()))) {
        break forest_join_72;
    }
    forestValue100078_149_0 = new moom.J5(3, 1);
    break forest_join_149;
    }
    if (!(__fieldRead100078_17(__call100078_16()))) {
        break forest_join_81;
    }
    forestValue100078_149_0 = new moom.J5(3, 0);
    break forest_join_149;
    }
    if (!(__fieldRead100078_19(__call100078_18()))) {
        break forest_join_90;
    }
    forestValue100078_149_0 = new moom.J5(2, 1);
    break forest_join_149;
    }
    if (!(__fieldRead100078_21(__call100078_20()))) {
        break forest_join_99;
    }
    forestValue100078_149_0 = new moom.J5(2, 0);
    break forest_join_149;
    }
    if (!(__fieldRead100078_23(__call100078_22()))) {
        break forest_join_108;
    }
    forestValue100078_149_0 = new moom.J5(1, 5);
    break forest_join_149;
    }
    if (!(__fieldRead100078_25(__call100078_24()))) {
        break forest_join_117;
    }
    forestValue100078_149_0 = new moom.J5(1, 4);
    break forest_join_149;
    }
    if (!(__fieldRead100078_27(__call100078_26()))) {
        break forest_join_126;
    }
    forestValue100078_149_0 = new moom.J5(1, 3);
    break forest_join_149;
    }
    if (!(__fieldRead100078_29(__call100078_28()))) {
        break forest_join_135;
    }
    forestValue100078_149_0 = new moom.J5(1, 2);
    break forest_join_149;
    }
    if (!(__fieldRead100078_31(__call100078_30()))) {
        break forest_join_144;
    }
    forestValue100078_149_0 = new moom.J5(1, 1);
    break forest_join_149;
    }
    forestValue100078_149_0 = new moom.J5(1, 0);
    }
    return forestValue100078_149_0;
}
public static moom.J5 h100078_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call13007800_0(p0);
}
public static moom.J5 h100078_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call13007801_0(p0);
}
public static moom.J5 h100078_2(java.lang.NumberFormatException p0) throws Throwable {
    throw __call13007802_0(p0);
}
public static moom.J5 h100078_3(java.lang.NumberFormatException p0) throws Throwable {
    throw __call13007803_0(p0);
}
public static moom.J5 h100078_4(java.lang.NumberFormatException p0) throws Throwable {
    throw __call13007804_0(p0);
}
public static moom.J5 h100078_5(java.lang.NumberFormatException p0) throws Throwable {
    throw __call13007805_0(p0);
}
public static moom.J5 h100078_6(java.lang.NumberFormatException p0) throws Throwable {
    throw __call13007806_0(p0);
}
public static moom.J5 h100078_7(java.lang.NumberFormatException p0) throws Throwable {
    throw __call13007807_0(p0);
}
public static moom.J5 h100078_8(java.lang.NumberFormatException p0) throws Throwable {
    throw __call13007808_0(p0);
}
public static moom.J5 h100078_9(java.lang.NumberFormatException p0) throws Throwable {
    throw __call13007809_0(p0);
}
public static moom.J5 h100078_10(java.lang.NumberFormatException p0) throws Throwable {
    throw __call13007810_0(p0);
}
public static moom.J5 h100078_11(java.lang.NumberFormatException p0) throws Throwable {
    throw __call13007811_0(p0);
}
public static moom.J5 h100078_12(java.lang.NumberFormatException p0) throws Throwable {
    throw __call13007812_0(p0);
}
public static moom.J5 h100078_13(java.lang.NumberFormatException p0) throws Throwable {
    throw __call13007813_0(p0);
}
public static moom.J5 h100078_14(java.lang.NumberFormatException p0) throws Throwable {
    throw __call13007814_0(p0);
}
public static moom.J5 h100078_15(java.lang.NumberFormatException p0) throws Throwable {
    throw __call13007815_0(p0);
}
private static native org.lwjgl.opengl.ContextCapabilities __call100078_0() throws Throwable;
private static native boolean __fieldRead100078_1(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native org.lwjgl.opengl.ContextCapabilities __call100078_2() throws Throwable;
private static native boolean __fieldRead100078_3(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native org.lwjgl.opengl.ContextCapabilities __call100078_4() throws Throwable;
private static native boolean __fieldRead100078_5(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native org.lwjgl.opengl.ContextCapabilities __call100078_6() throws Throwable;
private static native boolean __fieldRead100078_7(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native org.lwjgl.opengl.ContextCapabilities __call100078_8() throws Throwable;
private static native boolean __fieldRead100078_9(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native org.lwjgl.opengl.ContextCapabilities __call100078_10() throws Throwable;
private static native boolean __fieldRead100078_11(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native org.lwjgl.opengl.ContextCapabilities __call100078_12() throws Throwable;
private static native boolean __fieldRead100078_13(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native org.lwjgl.opengl.ContextCapabilities __call100078_14() throws Throwable;
private static native boolean __fieldRead100078_15(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native org.lwjgl.opengl.ContextCapabilities __call100078_16() throws Throwable;
private static native boolean __fieldRead100078_17(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native org.lwjgl.opengl.ContextCapabilities __call100078_18() throws Throwable;
private static native boolean __fieldRead100078_19(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native org.lwjgl.opengl.ContextCapabilities __call100078_20() throws Throwable;
private static native boolean __fieldRead100078_21(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native org.lwjgl.opengl.ContextCapabilities __call100078_22() throws Throwable;
private static native boolean __fieldRead100078_23(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native org.lwjgl.opengl.ContextCapabilities __call100078_24() throws Throwable;
private static native boolean __fieldRead100078_25(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native org.lwjgl.opengl.ContextCapabilities __call100078_26() throws Throwable;
private static native boolean __fieldRead100078_27(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native org.lwjgl.opengl.ContextCapabilities __call100078_28() throws Throwable;
private static native boolean __fieldRead100078_29(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native org.lwjgl.opengl.ContextCapabilities __call100078_30() throws Throwable;
private static native boolean __fieldRead100078_31(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.Throwable __call13007800_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Throwable __call13007801_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Throwable __call13007802_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Throwable __call13007803_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Throwable __call13007804_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Throwable __call13007805_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Throwable __call13007806_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Throwable __call13007807_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Throwable __call13007808_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Throwable __call13007809_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Throwable __call13007810_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Throwable __call13007811_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Throwable __call13007812_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Throwable __call13007813_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Throwable __call13007814_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Throwable __call13007815_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_6345b6e884e9b8d755ac(int a0) throws E;
private static final class __SourceHandler_6345b6e884e9b8d755ac {

public static java.lang.String f1007(int p0) throws Throwable {
    switch (p0) {
case 0:
{
        return "No error";
    }
case 1280:
{
        return "Invalid enum";
    }
case 1281:
{
        return "Invalid value";
    }
case 1282:
{
        return "Invalid operation";
    }
case 1283:
{
        return "Stack overflow";
    }
case 1284:
{
        return "Stack underflow";
    }
case 1285:
{
        return "Out of memory";
    }
case 1286:
{
        return "Invalid framebuffer operation";
    }
default:
{
        return "Unknown";
    }
}
}
public static void h1007_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1100700_0(p0);
}
private static native java.lang.Throwable __call1100700_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_defaa0296921ee71dbbd(java.lang.String a0, int a1) throws E;
private static final class __SourceHandler_defaa0296921ee71dbbd {

public static void f94(java.lang.String p0, int p1) throws Throwable {
    long life2_3;
    java.lang.ThreadGroup life4_6;
    int life5_20;
    java.lang.Thread[] life6_23;
    java.lang.Thread[] life7_30;
    int life8_33;
    int life9_35;
    java.lang.Thread life10_42;
    life2_3 = (__fieldRead94_0() ^ 96447658244946L);
    life4_6 = __call94_2(__call94_1());
    if ((life4_6 == null)) {
        return;
    }
    life5_20 = ((__call94_3(life4_6) + __invokedynamic94_4(778, (5727619073801298370L ^ life2_3))) * 2);
    life6_23 = new java.lang.Thread[life5_20];
    __call94_5(life4_6, life6_23, 0);
    life7_30 = life6_23;
    life8_33 = (life7_30).length;
    life9_35 = 0;
    loop_region_36: while ((life9_35 < life8_33)) {
        life10_42 = (life7_30)[life9_35];
        if ((life10_42 != null)) {
        if (__call94_7(__call94_6(life10_42), p0)) {
        __call94_8(life10_42, p1);
    }
    }
        life9_35 += 1;
    }
    return;
}
public static void h94_0(java.lang.Throwable p0) throws Throwable {
    throw __call2009400_0(p0);
}
public static void h94_1(java.lang.Throwable p0) throws Throwable {
    throw __call2009401_0(p0);
}
public static void h94_2(java.lang.Throwable p0) throws Throwable {
    java.lang.Throwable local1 = p0;
    __call2009402_4(__invokedynamic2009402_3(__call2009402_1(__call2009402_0(local1)), __call2009402_2(local1)));
    return;
}
private static native long __fieldRead94_0() throws Throwable;
private static native java.lang.Thread __call94_1() throws Throwable;
private static native java.lang.ThreadGroup __call94_2(java.lang.Thread a0) throws Throwable;
private static native int __call94_3(java.lang.ThreadGroup a0) throws Throwable;
private static native int __invokedynamic94_4(int a0, long a1) throws Throwable;
private static native int __call94_5(java.lang.ThreadGroup a0, java.lang.Thread[] a1, int a2) throws Throwable;
private static native java.lang.String __call94_6(java.lang.Thread a0) throws Throwable;
private static native boolean __call94_7(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call94_8(java.lang.Thread a0, int a1) throws Throwable;
private static native java.lang.Throwable __call2009400_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2009401_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Class __call2009402_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.String __call2009402_1(java.lang.Class a0) throws Throwable;
private static native java.lang.String __call2009402_2(java.lang.Throwable a0) throws Throwable;
private static native java.lang.String __invokedynamic2009402_3(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call2009402_4(java.lang.String a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.client.resources.IResourcePack __sourceHandlerCall_fc0ecbc7e1bd4aea15ba(moom.DD a0) throws E;
private static final class __SourceHandler_fc0ecbc7e1bd4aea15ba {

public static net.minecraft.client.resources.IResourcePack f1009(moom.DD p0) throws Throwable {
    net.minecraft.client.resources.ResourcePackRepository life1_2;
    net.minecraft.client.resources.IResourcePack life2_5;
    java.util.List life3_21;
    int life4_26;
    net.minecraft.client.resources.ResourcePackRepository$Entry life5_33;
    net.minecraft.client.resources.IResourcePack life6_36;
    life1_2 = __call1009_1(__fieldRead1009_0());
    life2_5 = __call1009_2(life1_2);
    if ((life2_5 != null)) {
        if (__call1009_3(life2_5, p0)) {
        return life2_5;
    }
    }
    life3_21 = __fieldRead1009_4(life1_2);
    life4_26 = (__call1009_5(life3_21) - 1);
    loop_region_22: while ((life4_26 >= 0)) {
        life5_33 = __cast1009_7(__call1009_6(life3_21, life4_26));
        life6_36 = __call1009_8(life5_33);
        if (__call1009_9(life6_36, p0)) {
        return life6_36;
    }
        life4_26 += -1;
    }
    if (__call1009_11(__call1009_10(), p0)) {
        return __call1009_12();
    }
    return null;
}
public static void h1009_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1100900_0(p0);
}
public static void h1009_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1100901_0(p0);
}
public static void h1009_2(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1100902_0(p0);
}
public static void h1009_3(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1100903_0(p0);
}
private static native net.minecraft.client.Minecraft __fieldRead1009_0() throws Throwable;
private static native net.minecraft.client.resources.ResourcePackRepository __call1009_1(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.resources.IResourcePack __call1009_2(net.minecraft.client.resources.ResourcePackRepository a0) throws Throwable;
private static native boolean __call1009_3(net.minecraft.client.resources.IResourcePack a0, moom.DD a1) throws Throwable;
private static native java.util.List __fieldRead1009_4(net.minecraft.client.resources.ResourcePackRepository a0) throws Throwable;
private static native int __call1009_5(java.util.List a0) throws Throwable;
private static native java.lang.Object __call1009_6(java.util.List a0, int a1) throws Throwable;
private static native net.minecraft.client.resources.ResourcePackRepository$Entry __cast1009_7(java.lang.Object a0) throws Throwable;
private static native net.minecraft.client.resources.IResourcePack __call1009_8(net.minecraft.client.resources.ResourcePackRepository$Entry a0) throws Throwable;
private static native boolean __call1009_9(net.minecraft.client.resources.IResourcePack a0, moom.DD a1) throws Throwable;
private static native moom.oK __call1009_10() throws Throwable;
private static native boolean __call1009_11(moom.oK a0, moom.DD a1) throws Throwable;
private static native moom.oK __call1009_12() throws Throwable;
private static native java.lang.Throwable __call1100900_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Throwable __call1100901_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Throwable __call1100902_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Throwable __call1100903_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_3906bf36985b99ecb80f() throws E;
private static final class __SourceHandler_3906bf36985b99ecb80f {

public static boolean f1010() throws Throwable {
    return ((__fieldRead1010_1(__fieldRead1010_0()) != 3) ? true : false);
}
public static void h1010_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1101000_0(p0);
}
private static native net.minecraft.client.settings.GameSettings __fieldRead1010_0() throws Throwable;
private static native int __fieldRead1010_1(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native java.lang.Throwable __call1101000_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_b85e37a12e519dadf63d() throws E;
private static final class __SourceHandler_b85e37a12e519dadf63d {

public static boolean f1011() throws Throwable {
    return ((__fieldRead1011_1(__fieldRead1011_0()) == 2) ? true : false);
}
public static void h1011_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1101100_0(p0);
}
private static native net.minecraft.client.settings.GameSettings __fieldRead1011_0() throws Throwable;
private static native int __fieldRead1011_1(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native java.lang.Throwable __call1101100_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_b5c251bfe6ec2a3c993e() throws E;
private static final class __SourceHandler_b5c251bfe6ec2a3c993e {

public static boolean f1012() throws Throwable {
    return ((__fieldRead1012_1(__fieldRead1012_0()) == 0) ? __fieldRead1012_3(__fieldRead1012_2()) : ((__fieldRead1012_5(__fieldRead1012_4()) == 2) ? true : false));
}
public static void h1012_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1101200_0(p0);
}
public static void h1012_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1101201_0(p0);
}
private static native net.minecraft.client.settings.GameSettings __fieldRead1012_0() throws Throwable;
private static native int __fieldRead1012_1(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead1012_2() throws Throwable;
private static native boolean __fieldRead1012_3(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead1012_4() throws Throwable;
private static native int __fieldRead1012_5(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native java.lang.Throwable __call1101200_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Throwable __call1101201_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_5d4e373fff0cf7dee937() throws E;
private static final class __SourceHandler_5d4e373fff0cf7dee937 {

public static boolean f1013() throws Throwable {
    return ((__call1013_0() <= 1) ? true : false);
}
public static void h1013_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1101300_0(p0);
}
private static native int __call1013_0() throws Throwable;
private static native java.lang.Throwable __call1101300_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_b425f0735de2868ab1d6() throws E;
private static final class __SourceHandler_b425f0735de2868ab1d6 {

public static boolean f1014() throws Throwable {
    return ((__fieldRead1014_1(__fieldRead1014_0()) != 3) ? true : false);
}
public static void h1014_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1101400_0(p0);
}
private static native net.minecraft.client.settings.GameSettings __fieldRead1014_0() throws Throwable;
private static native int __fieldRead1014_1(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native java.lang.Throwable __call1101400_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_3a931c4ad6dcc2380982() throws E;
private static final class __SourceHandler_3a931c4ad6dcc2380982 {

public static boolean f1015() throws Throwable {
    return ((__fieldRead1015_1(__fieldRead1015_0()) == 1) ? true : false);
}
public static void h1015_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1101500_0(p0);
}
private static native net.minecraft.client.settings.GameSettings __fieldRead1015_0() throws Throwable;
private static native int __fieldRead1015_1(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native java.lang.Throwable __call1101500_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_eb385738ec3e225bdca7(java.lang.Object a0, java.lang.Object[] a1) throws E;
private static final class __SourceHandler_eb385738ec3e225bdca7 {

public static boolean f1016(java.lang.Object p0, java.lang.Object[] p1) throws Throwable {
    java.lang.Object[] life2_3;
    int life3_6;
    int life4_8;
    java.lang.Object life5_15;
    if ((p1 != null)) {
        life2_3 = p1;
        life3_6 = (life2_3).length;
        life4_8 = 0;
        loop_region_9: while ((life4_8 < life3_6)) {
        life5_15 = (life2_3)[life4_8];
        if ((p0 == life5_15)) {
        return true;
    }
        life4_8 += 1;
    }
    }
    return false;
}
public static void h1016_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1101600_0(p0);
}
private static native java.lang.Throwable __call1101600_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_d2f626eb162337d3fd96(java.lang.String a0) throws E;
private static final class __SourceHandler_d2f626eb162337d3fd96 {

public static java.lang.String f1017(java.lang.String p0) throws Throwable {
    long life1_3;
    int life3_11;
    int life4_26;
    life1_3 = (__fieldRead1017_0() ^ 57793971579555L);
    life3_11 = __call1017_2(p0, __invokedynamic1017_1(24878, (2319467181040865842L ^ life1_3)));
    if ((life3_11 < 0)) {
        return "";
    }
    life4_26 = __call1017_4(p0, __invokedynamic1017_3(25222, (2668567000078553509L ^ life1_3)), life3_11);
    return ((life4_26 < 0) ? "" : __call1017_5(p0, (life3_11 + 1), life4_26));
}
public static void h1017_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1101700_0(p0);
}
public static void h1017_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1101701_0(p0);
}
private static native long __fieldRead1017_0() throws Throwable;
private static native int __invokedynamic1017_1(int a0, long a1) throws Throwable;
private static native int __call1017_2(java.lang.String a0, int a1) throws Throwable;
private static native int __invokedynamic1017_3(int a0, long a1) throws Throwable;
private static native int __call1017_4(java.lang.String a0, int a1, int a2) throws Throwable;
private static native java.lang.String __call1017_5(java.lang.String a0, int a1, int a2) throws Throwable;
private static native java.lang.Throwable __call1101700_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Throwable __call1101701_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_43874a1a009fca0d6a2b(moom.DD a0) throws E;
private static final class __SourceHandler_43874a1a009fca0d6a2b {

public static boolean f1018(moom.DD p0) throws Throwable {
    net.minecraft.client.resources.IResourcePack life1_2;
    life1_2 = __call1018_0(p0);
    return ((life1_2 == __call1018_1()) ? true : false);
}
public static void h1018_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1101800_0(p0);
}
private static native net.minecraft.client.resources.IResourcePack __call1018_0(moom.DD a0) throws Throwable;
private static native moom.oK __call1018_1() throws Throwable;
private static native java.lang.Throwable __call1101800_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String[] __sourceHandlerCall_fc276ca77ecf7eb95d81() throws E;
private static final class __SourceHandler_fc276ca77ecf7eb95d81 {

public static java.lang.String[] f215() throws Throwable {
    long life0_3;
    moom.J5 life2_5;
    int life3_16;
    java.lang.String[] life4_21;
    int life5_23;
    java.lang.String life2_48;
    forest_join_41: {
    forest_join_39: {
    life0_3 = (__fieldRead215_0() ^ 24902248534917L);
    life2_5 = __call215_1();
    if (!((__call215_2(life2_5) >= 3))) {
        break forest_join_41;
    }
    life3_16 = __call215_4(__invokedynamic215_3(5689, (1747435443690839086L ^ life0_3)));
    if (!((life3_16 > 0))) {
        break forest_join_41;
    }
    life4_21 = new java.lang.String[life3_16];
    life5_23 = 0;
    forest_cycle_24: while (true) {
    if (!((life5_23 < life3_16))) {
        break forest_join_39;
    }
    (life4_21)[life5_23] = __call215_6(__invokedynamic215_5(7068, (7550158275844215185L ^ life0_3)), life5_23);
    life5_23 += 1;
    continue forest_cycle_24;
    }
    }
    return life4_21;
    }
    life2_48 = __call215_8(__invokedynamic215_7(16158, (533624813862958348L ^ life0_3)));
    return __call215_9(life2_48, " ");
}
public static java.lang.String[] h215_0(java.lang.Exception p0) throws Throwable {
    throw __call3021500_0(p0);
}
public static java.lang.String[] h215_1(java.lang.Exception p0, long p1) throws Throwable {
    java.lang.Exception life3_2;
    java.lang.String life3_11;
    life3_2 = p0;
    __call3021501_0(life3_2);
    life3_11 = __call3021501_2(__invokedynamic3021501_1(16158, (533624813862958348L ^ p1)));
    return __call3021501_3(life3_11, " ");
}
public static java.lang.String[] h215_2(java.lang.Exception p0) throws Throwable {
    java.lang.Exception life1_2;
    life1_2 = p0;
    __call3021502_0(life1_2);
    return new java.lang.String[0];
}
private static native long __fieldRead215_0() throws Throwable;
private static native moom.J5 __call215_1() throws Throwable;
private static native int __call215_2(moom.J5 a0) throws Throwable;
private static native int __invokedynamic215_3(int a0, long a1) throws Throwable;
private static native int __call215_4(int a0) throws Throwable;
private static native int __invokedynamic215_5(int a0, long a1) throws Throwable;
private static native java.lang.String __call215_6(int a0, int a1) throws Throwable;
private static native int __invokedynamic215_7(int a0, long a1) throws Throwable;
private static native java.lang.String __call215_8(int a0) throws Throwable;
private static native java.lang.String[] __call215_9(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.Throwable __call3021500_0(java.lang.Exception a0) throws Throwable;
private static native void __call3021501_0(java.lang.Exception a0) throws Throwable;
private static native int __invokedynamic3021501_1(int a0, long a1) throws Throwable;
private static native java.lang.String __call3021501_2(int a0) throws Throwable;
private static native java.lang.String[] __call3021501_3(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call3021502_0(java.lang.Exception a0) throws Throwable;

}

private static native <E extends Throwable> org.lwjgl.opengl.DisplayMode __sourceHandlerCall_6e67a0f518b0f1a821b6() throws E;
private static final class __SourceHandler_6e67a0f518b0f1a821b6 {

public static org.lwjgl.opengl.DisplayMode f216() throws Throwable {
    org.lwjgl.opengl.DisplayMode forestValue216_35_0;
    org.lwjgl.opengl.DisplayMode[] life0_1;
    org.lwjgl.opengl.DisplayMode life1_15;
    forest_join_36: {
    forest_join_35: {
    forest_join_34: {
    forest_join_22: {
    life0_1 = __call216_0();
    if (!((life0_1 != null))) {
        break forest_join_36;
    }
    if (!(((life0_1).length >= 1))) {
        break forest_join_36;
    }
    life1_15 = (life0_1)[((life0_1).length - 1)];
    if (!((__call216_2(__fieldRead216_1()) > __call216_3(life1_15)))) {
        break forest_join_22;
    }
    forestValue216_35_0 = __fieldRead216_4();
    break forest_join_35;
    }
    if (!((__call216_6(__fieldRead216_5()) == __call216_7(life1_15)))) {
        break forest_join_34;
    }
    if (!((__call216_9(__fieldRead216_8()) > __call216_10(life1_15)))) {
        break forest_join_34;
    }
    forestValue216_35_0 = __fieldRead216_11();
    break forest_join_35;
    }
    forestValue216_35_0 = life1_15;
    }
    return forestValue216_35_0;
    }
    return __fieldRead216_12();
}
public static org.lwjgl.opengl.DisplayMode h216_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3021600_0(p0);
}
public static org.lwjgl.opengl.DisplayMode h216_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3021601_0(p0);
}
public static org.lwjgl.opengl.DisplayMode h216_2(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3021602_0(p0);
}
public static org.lwjgl.opengl.DisplayMode h216_3(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3021603_0(p0);
}
private static native org.lwjgl.opengl.DisplayMode[] __call216_0() throws Throwable;
private static native org.lwjgl.opengl.DisplayMode __fieldRead216_1() throws Throwable;
private static native int __call216_2(org.lwjgl.opengl.DisplayMode a0) throws Throwable;
private static native int __call216_3(org.lwjgl.opengl.DisplayMode a0) throws Throwable;
private static native org.lwjgl.opengl.DisplayMode __fieldRead216_4() throws Throwable;
private static native org.lwjgl.opengl.DisplayMode __fieldRead216_5() throws Throwable;
private static native int __call216_6(org.lwjgl.opengl.DisplayMode a0) throws Throwable;
private static native int __call216_7(org.lwjgl.opengl.DisplayMode a0) throws Throwable;
private static native org.lwjgl.opengl.DisplayMode __fieldRead216_8() throws Throwable;
private static native int __call216_9(org.lwjgl.opengl.DisplayMode a0) throws Throwable;
private static native int __call216_10(org.lwjgl.opengl.DisplayMode a0) throws Throwable;
private static native org.lwjgl.opengl.DisplayMode __fieldRead216_11() throws Throwable;
private static native org.lwjgl.opengl.DisplayMode __fieldRead216_12() throws Throwable;
private static native java.lang.Throwable __call3021600_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Throwable __call3021601_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Throwable __call3021602_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Throwable __call3021603_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> moom.J5 __sourceHandlerCall_c4fc7b9da6f29f0b8248() throws E;
private static final class __SourceHandler_c4fc7b9da6f29f0b8248 {

public static moom.J5 f100074() throws Throwable {
    long life0_3;
    java.lang.String life2_12;
    forest_join_29: {
    forest_join_21: {
    life0_3 = (__fieldRead100074_0() ^ 45757780705536L);
    if (!((__fieldRead100074_1() == null))) {
        break forest_join_29;
    }
    life2_12 = __call100074_3(__invokedynamic100074_2(4031, (793318396909606706L ^ life0_3)));
    __fieldWrite100074_5(__call100074_4(life2_12, null));
    if (!((__fieldRead100074_6() == null))) {
        break forest_join_21;
    }
    __fieldWrite100074_8(__call100074_7());
    }
    if (!((__fieldRead100074_9() == null))) {
        break forest_join_29;
    }
    __fieldWrite100074_10(new moom.J5(1, 0));
    }
    return __fieldRead100074_11();
}
public static moom.J5 h100074_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call13007400_0(p0);
}
public static moom.J5 h100074_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call13007401_0(p0);
}
private static native long __fieldRead100074_0() throws Throwable;
private static native moom.J5 __fieldRead100074_1() throws Throwable;
private static native int __invokedynamic100074_2(int a0, long a1) throws Throwable;
private static native java.lang.String __call100074_3(int a0) throws Throwable;
private static native moom.J5 __call100074_4(java.lang.String a0, java.lang.Object a1) throws Throwable;
private static native void __fieldWrite100074_5(moom.J5 a0) throws Throwable;
private static native moom.J5 __fieldRead100074_6() throws Throwable;
private static native moom.J5 __call100074_7() throws Throwable;
private static native void __fieldWrite100074_8(moom.J5 a0) throws Throwable;
private static native moom.J5 __fieldRead100074_9() throws Throwable;
private static native void __fieldWrite100074_10(moom.J5 a0) throws Throwable;
private static native moom.J5 __fieldRead100074_11() throws Throwable;
private static native java.lang.Throwable __call13007400_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Throwable __call13007401_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_d1384ac56348035db8a3() throws E;
private static final class __SourceHandler_d1384ac56348035db8a3 {

public static void f100073() throws Throwable {
    forest_join_8: {
    if (!((!__fieldRead100073_0()))) {
        break forest_join_8;
    }
    if (!(__call100073_1())) {
        break forest_join_8;
    }
    __fieldWrite100073_2(1);
    __call100073_3();
    __call100073_4();
    }
    return;
}
public static void h100073_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call13007300_0(p0);
}
public static void h100073_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call13007301_0(p0);
}
private static native boolean __fieldRead100073_0() throws Throwable;
private static native boolean __call100073_1() throws Throwable;
private static native void __fieldWrite100073_2(int a0) throws Throwable;
private static native void __call100073_3() throws Throwable;
private static native void __call100073_4() throws Throwable;
private static native java.lang.Throwable __call13007300_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Throwable __call13007301_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> float __sourceHandlerCall_865731bb2a2fc5702edf() throws E;
private static final class __SourceHandler_865731bb2a2fc5702edf {

public static float f596() throws Throwable {
    float forwardValue596_10_0;
    forward_join_10: {
    forward_join_8: {
    if (!(__call596_0())) {
        break forward_join_8;
    }
    if (!((__numericCompare596_2(__fieldRead596_1(), 0x0.0p0f) >= 0))) {
        break forward_join_8;
    }
    forwardValue596_10_0 = __fieldRead596_3();
    break forward_join_10;
    }
    forwardValue596_10_0 = __fieldRead596_5(__fieldRead596_4());
    }
    return forwardValue596_10_0;
}
public static void h596_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1059600_0(p0);
}
public static void h596_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1059601_0(p0);
}
private static native boolean __call596_0() throws Throwable;
private static native float __fieldRead596_1() throws Throwable;
private static native int __numericCompare596_2(float a0, float a1) throws Throwable;
private static native float __fieldRead596_3() throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead596_4() throws Throwable;
private static native float __fieldRead596_5(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native java.lang.Throwable __call1059600_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Throwable __call1059601_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_28b7cd89a0dfaf6029da() throws E;
private static final class __SourceHandler_28b7cd89a0dfaf6029da {

public static boolean f1024() throws Throwable {
    return ((__call1024_0() == __fieldRead1024_1()) ? true : false);
}
public static void h1024_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1102400_0(p0);
}
private static native java.lang.Thread __call1024_0() throws Throwable;
private static native java.lang.Thread __fieldRead1024_1() throws Throwable;
private static native java.lang.Throwable __call1102400_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_7f3a0077ebb67db336e6() throws E;
private static final class __SourceHandler_7f3a0077ebb67db336e6 {

public static int f1025() throws Throwable {
    long life0_3;
    life0_3 = (__fieldRead1025_0() ^ 13475141855234L);
    switch (__fieldRead1025_2(__fieldRead1025_1())) {
case 2:
{
        if (__call1025_3()) {
        return __invokedynamic1025_4(1591, (4012539740237707195L ^ life0_3));
    }
        return __invokedynamic1025_5(30266, (8560828512025364391L ^ life0_3));
    }
case 3:
{
        if (__call1025_6()) {
        return __invokedynamic1025_7(17232, (7730233721235272399L ^ life0_3));
    }
        return __invokedynamic1025_8(30649, (8853842434428913210L ^ life0_3));
    }
default:
{
        return __invokedynamic1025_9(30649, (8853842434428913210L ^ life0_3));
    }
}
}
public static void h1025_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1102500_0(p0);
}
public static void h1025_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1102501_0(p0);
}
public static void h1025_2(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1102502_0(p0);
}
private static native long __fieldRead1025_0() throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead1025_1() throws Throwable;
private static native int __fieldRead1025_2(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native boolean __call1025_3() throws Throwable;
private static native int __invokedynamic1025_4(int a0, long a1) throws Throwable;
private static native int __invokedynamic1025_5(int a0, long a1) throws Throwable;
private static native boolean __call1025_6() throws Throwable;
private static native int __invokedynamic1025_7(int a0, long a1) throws Throwable;
private static native int __invokedynamic1025_8(int a0, long a1) throws Throwable;
private static native int __invokedynamic1025_9(int a0, long a1) throws Throwable;
private static native java.lang.Throwable __call1102500_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Throwable __call1102501_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Throwable __call1102502_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> moom.J5 __sourceHandlerCall_26ac9121c6284fe30736() throws E;
private static final class __SourceHandler_26ac9121c6284fe30736 {

public static moom.J5 f100076() throws Throwable {
    long life0_3;
    java.lang.String life2_12;
    forest_join_29: {
    life0_3 = (__fieldRead100076_0() ^ 113004183638603L);
    if (!((__fieldRead100076_1() == null))) {
        break forest_join_29;
    }
    life2_12 = __call100076_3(__invokedynamic100076_2(30982, (801485023011123924L ^ life0_3)));
    __fieldWrite100076_5(__call100076_4(life2_12, null));
    if (!((__fieldRead100076_6() == null))) {
        break forest_join_29;
    }
    __fieldWrite100076_8(new moom.J5(1, __invokedynamic100076_7(778, (5727635631207368923L ^ life0_3))));
    }
    return __fieldRead100076_9();
}
public static moom.J5 h100076_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call13007600_0(p0);
}
private static native long __fieldRead100076_0() throws Throwable;
private static native moom.J5 __fieldRead100076_1() throws Throwable;
private static native int __invokedynamic100076_2(int a0, long a1) throws Throwable;
private static native java.lang.String __call100076_3(int a0) throws Throwable;
private static native moom.J5 __call100076_4(java.lang.String a0, java.lang.Object a1) throws Throwable;
private static native void __fieldWrite100076_5(moom.J5 a0) throws Throwable;
private static native moom.J5 __fieldRead100076_6() throws Throwable;
private static native int __invokedynamic100076_7(int a0, long a1) throws Throwable;
private static native void __fieldWrite100076_8(moom.J5 a0) throws Throwable;
private static native moom.J5 __fieldRead100076_9() throws Throwable;
private static native java.lang.Throwable __call13007600_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_dee7c2c45c3df1ae943a() throws E;
private static final class __SourceHandler_dee7c2c45c3df1ae943a {

public static java.lang.String f96() throws Throwable {
    java.io.InputStream life0_5;
    if ((__fieldRead96_0() == null)) {
        life0_5 = __call96_2(__classLiteral96_1(), "/buildof.txt");
        if ((life0_5 == null)) {
        return null;
    }
        __fieldWrite96_4((__call96_3(life0_5))[0]);
    }
    return __fieldRead96_5();
}
public static java.lang.String h96_0(java.lang.Exception p0) throws Throwable {
    java.lang.Exception local1 = p0;
    __call2009600_4(__invokedynamic2009600_3(__call2009600_1(__call2009600_0(local1)), __call2009600_2(local1)));
    __fieldWrite2009600_5("");
    return __fieldRead2009600_6();
}
private static native java.lang.String __fieldRead96_0() throws Throwable;
private static native java.lang.Object __classLiteral96_1() throws Throwable;
private static native java.io.InputStream __call96_2(java.lang.Object a0, java.lang.String a1) throws Throwable;
private static native java.lang.String[] __call96_3(java.io.InputStream a0) throws Throwable;
private static native void __fieldWrite96_4(java.lang.String a0) throws Throwable;
private static native java.lang.String __fieldRead96_5() throws Throwable;
private static native java.lang.Class __call2009600_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.String __call2009600_1(java.lang.Class a0) throws Throwable;
private static native java.lang.String __call2009600_2(java.lang.Exception a0) throws Throwable;
private static native java.lang.String __invokedynamic2009600_3(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call2009600_4(java.lang.String a0) throws Throwable;
private static native void __fieldWrite2009600_5(java.lang.String a0) throws Throwable;
private static native java.lang.String __fieldRead2009600_6() throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_46d9419bd47bfbc57d10() throws E;
private static final class __SourceHandler_46d9419bd47bfbc57d10 {

public static void f100075() throws Throwable {
    long life0_3;
    forest_join_84: {
    forest_join_77: {
    forest_join_70: {
    life0_3 = (__fieldRead100075_0() ^ 79133329393692L);
    __call100075_1("");
    __call100075_3(__call100075_2());
    __call100075_6(__invokedynamic100075_5(__call100075_4()));
    __call100075_11(__invokedynamic100075_10(__call100075_7("os.name"), __call100075_8("os.arch"), __call100075_9("os.version")));
    __call100075_15(__invokedynamic100075_14(__call100075_12("java.version"), __call100075_13("java.vendor")));
    __call100075_20(__invokedynamic100075_19(__call100075_16("java.vm.name"), __call100075_17("java.vm.info"), __call100075_18("java.vm.vendor")));
    __call100075_23(__invokedynamic100075_22(__call100075_21()));
    __fieldWrite100075_26(__call100075_25(__invokedynamic100075_24(27865, (8360131724803472714L ^ life0_3))));
    __fieldWrite100075_29(__call100075_28(__invokedynamic100075_27(19396, (1367183674460592710L ^ life0_3))));
    __fieldWrite100075_32(__call100075_31(__invokedynamic100075_30(7663, (6437652648858291321L ^ life0_3))));
    __call100075_37(__invokedynamic100075_36(__fieldRead100075_33(), __fieldRead100075_34(), __fieldRead100075_35()));
    __call100075_40(__invokedynamic100075_39(__call100075_38()));
    if (!((!__fieldRead100075_42(__call100075_41())))) {
        break forest_join_70;
    }
    __call100075_43("OpenGL Mipmap levels: Not available (GL12.GL_TEXTURE_MAX_LEVEL)");
    }
    __fieldWrite100075_46(__fieldRead100075_45(__call100075_44()));
    if (!((!__fieldRead100075_47()))) {
        break forest_join_77;
    }
    __call100075_48("OpenGL Fancy fog: Not available (GL_NV_fog_distance)");
    }
    __fieldWrite100075_51(__fieldRead100075_50(__call100075_49()));
    if (!((!__fieldRead100075_52()))) {
        break forest_join_84;
    }
    __call100075_53("OpenGL Occlussion culling: Not available (GL_ARB_occlusion_query)");
    }
    return;
}
public static void h100075_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call13007500_0(p0);
}
public static void h100075_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call13007501_0(p0);
}
public static void h100075_2(java.lang.NumberFormatException p0) throws Throwable {
    throw __call13007502_0(p0);
}
private static native long __fieldRead100075_0() throws Throwable;
private static native void __call100075_1(java.lang.String a0) throws Throwable;
private static native java.lang.String __call100075_2() throws Throwable;
private static native void __call100075_3(java.lang.String a0) throws Throwable;
private static native java.lang.String __call100075_4() throws Throwable;
private static native java.lang.String __invokedynamic100075_5(java.lang.String a0) throws Throwable;
private static native void __call100075_6(java.lang.String a0) throws Throwable;
private static native java.lang.String __call100075_7(java.lang.String a0) throws Throwable;
private static native java.lang.String __call100075_8(java.lang.String a0) throws Throwable;
private static native java.lang.String __call100075_9(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic100075_10(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native void __call100075_11(java.lang.String a0) throws Throwable;
private static native java.lang.String __call100075_12(java.lang.String a0) throws Throwable;
private static native java.lang.String __call100075_13(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic100075_14(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call100075_15(java.lang.String a0) throws Throwable;
private static native java.lang.String __call100075_16(java.lang.String a0) throws Throwable;
private static native java.lang.String __call100075_17(java.lang.String a0) throws Throwable;
private static native java.lang.String __call100075_18(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic100075_19(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native void __call100075_20(java.lang.String a0) throws Throwable;
private static native java.lang.String __call100075_21() throws Throwable;
private static native java.lang.String __invokedynamic100075_22(java.lang.String a0) throws Throwable;
private static native void __call100075_23(java.lang.String a0) throws Throwable;
private static native int __invokedynamic100075_24(int a0, long a1) throws Throwable;
private static native java.lang.String __call100075_25(int a0) throws Throwable;
private static native void __fieldWrite100075_26(java.lang.String a0) throws Throwable;
private static native int __invokedynamic100075_27(int a0, long a1) throws Throwable;
private static native java.lang.String __call100075_28(int a0) throws Throwable;
private static native void __fieldWrite100075_29(java.lang.String a0) throws Throwable;
private static native int __invokedynamic100075_30(int a0, long a1) throws Throwable;
private static native java.lang.String __call100075_31(int a0) throws Throwable;
private static native void __fieldWrite100075_32(java.lang.String a0) throws Throwable;
private static native java.lang.String __fieldRead100075_33() throws Throwable;
private static native java.lang.String __fieldRead100075_34() throws Throwable;
private static native java.lang.String __fieldRead100075_35() throws Throwable;
private static native java.lang.String __invokedynamic100075_36(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native void __call100075_37(java.lang.String a0) throws Throwable;
private static native java.lang.String __call100075_38() throws Throwable;
private static native java.lang.String __invokedynamic100075_39(java.lang.String a0) throws Throwable;
private static native void __call100075_40(java.lang.String a0) throws Throwable;
private static native org.lwjgl.opengl.ContextCapabilities __call100075_41() throws Throwable;
private static native boolean __fieldRead100075_42(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native void __call100075_43(java.lang.String a0) throws Throwable;
private static native org.lwjgl.opengl.ContextCapabilities __call100075_44() throws Throwable;
private static native boolean __fieldRead100075_45(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native void __fieldWrite100075_46(boolean a0) throws Throwable;
private static native boolean __fieldRead100075_47() throws Throwable;
private static native void __call100075_48(java.lang.String a0) throws Throwable;
private static native org.lwjgl.opengl.ContextCapabilities __call100075_49() throws Throwable;
private static native boolean __fieldRead100075_50(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native void __fieldWrite100075_51(boolean a0) throws Throwable;
private static native boolean __fieldRead100075_52() throws Throwable;
private static native void __call100075_53(java.lang.String a0) throws Throwable;
private static native java.lang.Throwable __call13007500_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Throwable __call13007501_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Throwable __call13007502_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_61e75a3d1adfc8695ee5() throws E;
private static final class __SourceHandler_61e75a3d1adfc8695ee5 {

public static boolean f1029() throws Throwable {
    return ((__fieldRead1029_1(__fieldRead1029_0()) > 0) ? true : false);
}
public static void h1029_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1102900_0(p0);
}
private static native net.minecraft.client.settings.GameSettings __fieldRead1029_0() throws Throwable;
private static native int __fieldRead1029_1(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native java.lang.Throwable __call1102900_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_a89b02f81a9a01f7c0a7() throws E;
private static final class __SourceHandler_a89b02f81a9a01f7c0a7 {

public static void f597() throws Throwable {
    long life0_3;
    int life2_10;
    forward_join_43: {
    forward_join_33: {
    forward_join_26: {
    life0_3 = (__fieldRead597_0() ^ 112680346755662L);
    __call597_1();
    life2_10 = __invokedynamic597_2(10073, (8554005751803124891L ^ life0_3));
    if (!(__call597_3())) { break forward_join_33; }
    if (!(__call597_4())) { break forward_join_26; }
    __call597_7(__fieldRead597_5(), __invokedynamic597_6(778, (5727636440369576158L ^ life0_3)));
    __call597_8("Server thread", 1);
    break forward_join_43;
    }
    __call597_10(__fieldRead597_9(), 5);
    __call597_11("Server thread", 5);
    break forward_join_43;
    }
    __call597_14(__fieldRead597_12(), __invokedynamic597_13(778, (5727636440369576158L ^ life0_3)));
    __call597_15("Server thread", 5);
    }
    return;
}
public static void h597_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1059700_0(p0);
}
public static void h597_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1059701_0(p0);
}
private static native long __fieldRead597_0() throws Throwable;
private static native void __call597_1() throws Throwable;
private static native int __invokedynamic597_2(int a0, long a1) throws Throwable;
private static native boolean __call597_3() throws Throwable;
private static native boolean __call597_4() throws Throwable;
private static native java.lang.Thread __fieldRead597_5() throws Throwable;
private static native int __invokedynamic597_6(int a0, long a1) throws Throwable;
private static native void __call597_7(java.lang.Thread a0, int a1) throws Throwable;
private static native void __call597_8(java.lang.String a0, int a1) throws Throwable;
private static native java.lang.Thread __fieldRead597_9() throws Throwable;
private static native void __call597_10(java.lang.Thread a0, int a1) throws Throwable;
private static native void __call597_11(java.lang.String a0, int a1) throws Throwable;
private static native java.lang.Thread __fieldRead597_12() throws Throwable;
private static native int __invokedynamic597_13(int a0, long a1) throws Throwable;
private static native void __call597_14(java.lang.Thread a0, int a1) throws Throwable;
private static native void __call597_15(java.lang.String a0, int a1) throws Throwable;
private static native java.lang.Throwable __call1059700_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Throwable __call1059701_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_015a0812c6ea46a74fb3() throws E;
private static final class __SourceHandler_015a0812c6ea46a74fb3 {

public static boolean f1031() throws Throwable {
    float life0_1;
    life0_1 = __call1031_0();
    return ((life0_1 > (__call1031_2(__fieldRead1031_1()) + 0x1.4f8b58p-17f)) ? true : false);
}
public static void h1031_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1103100_0(p0);
}
private static native float __call1031_0() throws Throwable;
private static native java.lang.Float __fieldRead1031_1() throws Throwable;
private static native float __call1031_2(java.lang.Float a0) throws Throwable;
private static native java.lang.Throwable __call1103100_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_9c5c4da1338681391fad() throws E;
private static final class __SourceHandler_9c5c4da1338681391fad {

public static java.lang.String f1032() throws Throwable {
    net.minecraft.client.resources.IResourcePack[] life0_8;
    java.lang.String[] life1_20;
    int life2_22;
    if ((__call1032_1(__fieldRead1032_0()) == null)) {
        return "";
    }
    life0_8 = __call1032_2();
    if (((life0_8).length == 0)) {
        return __call1032_4(__call1032_3());
    }
    life1_20 = new java.lang.String[(life0_8).length];
    life2_22 = 0;
    loop_region_19: while ((life2_22 < (life0_8).length)) {
        (life1_20)[life2_22] = __call1032_5((life0_8)[life2_22]);
        life2_22 += 1;
    }
    return __call1032_6(life1_20);
}
public static void h1032_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1103200_0(p0);
}
public static void h1032_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1103201_0(p0);
}
public static void h1032_2(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1103202_0(p0);
}
private static native net.minecraft.client.Minecraft __fieldRead1032_0() throws Throwable;
private static native net.minecraft.client.resources.ResourcePackRepository __call1032_1(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.resources.IResourcePack[] __call1032_2() throws Throwable;
private static native moom.oK __call1032_3() throws Throwable;
private static native java.lang.String __call1032_4(moom.oK a0) throws Throwable;
private static native java.lang.String __call1032_5(net.minecraft.client.resources.IResourcePack a0) throws Throwable;
private static native java.lang.String __call1032_6(java.lang.String[] a0) throws Throwable;
private static native java.lang.Throwable __call1103200_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Throwable __call1103201_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Throwable __call1103202_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_6d224c7c5b586c1b97eb(java.lang.String a0) throws E;
private static final class __SourceHandler_6d224c7c5b586c1b97eb {

public static void f1033(java.lang.String p0) throws Throwable {
    long life1_3;
    int life3_5;
    java.lang.String life4_16;
    java.lang.String life5_34;
    java.lang.String life6_59;
    life1_3 = (__fieldRead1033_0() ^ 6434798271892L);
    life3_5 = __call1033_1();
    if ((life3_5 != 0)) {
        if (__call1033_2(life3_5)) {
        life4_16 = __call1033_3(life3_5);
        life5_34 = __call1033_5("OpenGL error: %s (%s), at: %s", new java.lang.Object[] {__call1033_4(life3_5), life4_16, p0});
        __call1033_6(life5_34);
        if (__call1033_7()) {
        if (__call1033_9("ShowGlError", __fieldRead1033_8())) {
        life6_59 = __call1033_11("of.message.openglError", new java.lang.Object[] {__call1033_10(life3_5), life4_16});
        __call1033_15(__call1033_14(__fieldRead1033_13(__fieldRead1033_12())), new moom.CM(life6_59));
    }
    }
    }
    }
    return;
}
public static void h1033_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1103300_0(p0);
}
public static void h1033_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1103301_0(p0);
}
private static native long __fieldRead1033_0() throws Throwable;
private static native int __call1033_1() throws Throwable;
private static native boolean __call1033_2(int a0) throws Throwable;
private static native java.lang.String __call1033_3(int a0) throws Throwable;
private static native java.lang.Integer __call1033_4(int a0) throws Throwable;
private static native java.lang.String __call1033_5(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native void __call1033_6(java.lang.String a0) throws Throwable;
private static native boolean __call1033_7() throws Throwable;
private static native long __fieldRead1033_8() throws Throwable;
private static native boolean __call1033_9(java.lang.String a0, long a1) throws Throwable;
private static native java.lang.Integer __call1033_10(int a0) throws Throwable;
private static native java.lang.String __call1033_11(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1033_12() throws Throwable;
private static native net.minecraft.client.gui.GuiIngame __fieldRead1033_13(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.gB __call1033_14(net.minecraft.client.gui.GuiIngame a0) throws Throwable;
private static native void __call1033_15(moom.gB a0, moom.CM a1) throws Throwable;
private static native java.lang.Throwable __call1103300_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Throwable __call1103301_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_481154b4f610b95c0549() throws E;
private static final class __SourceHandler_481154b4f610b95c0549 {

public static boolean f598() throws Throwable {
    int forwardValue598_9_0;
    forward_join_9: {
    forward_join_8: {
    if (!(__call598_0())) {
        break forward_join_8;
    }
    if (!((__fieldRead598_2(__fieldRead598_1()) == 2))) {
        break forward_join_8;
    }
    forwardValue598_9_0 = 1;
    break forward_join_9;
    }
    forwardValue598_9_0 = 0;
    }
    return __integerCategory598_3(forwardValue598_9_0);
}
public static void h598_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1059800_0(p0);
}
public static void h598_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1059801_0(p0);
}
private static native boolean __call598_0() throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead598_1() throws Throwable;
private static native int __fieldRead598_2(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native boolean __integerCategory598_3(int value) throws Throwable;
private static native java.lang.Throwable __call1059800_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Throwable __call1059801_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_dcb005ae9d257d3a9317() throws E;
private static final class __SourceHandler_dcb005ae9d257d3a9317 {

public static void f97() throws Throwable {
    long life0_3;
    moom.oR life2_7;
    java.io.InputStream life3_17;
    moom.OH life4_24;
    java.lang.String life5_33;
    java.lang.String life5_42;
    life0_3 = (__fieldRead97_0() ^ 132470034757440L);
    __fieldWrite97_1(0);
    life2_7 = __call97_2();
    if ((life2_7 != null)) {
        life3_17 = __call97_4(__call97_3(life2_7, new moom.DD("mcpatcher/color.properties")));
        if ((life3_17 == null)) {
        return;
    }
        life4_24 = new moom.OH();
        __call97_5(life4_24, life3_17);
        __call97_6(life3_17);
        life5_33 = __call97_7(life4_24, "clouds");
        if ((life5_33 == null)) {
        return;
    }
        __call97_9(__invokedynamic97_8(life5_33));
        life5_42 = __call97_10(life5_33);
        if (__call97_11(life5_42, "fast")) {
        __fieldWrite97_12(1);
    }
        if (__call97_13(life5_42, "fancy")) {
        __fieldWrite97_15(__invokedynamic97_14(13486, (8525265349038103144L ^ life0_3)));
    }
        if (__call97_16(life5_42, "off")) {
        __fieldWrite97_18(__invokedynamic97_17(12699, (8048452084000448323L ^ life0_3)));
    }
    }
    return;
}
public static void h97_0(java.lang.Exception p0) throws Throwable {
    throw __call2009700_0(p0);
}
public static void h97_1(java.lang.Exception p0) throws Throwable {
    throw __call2009701_0(p0);
}
public static void h97_2(java.lang.Exception p0) throws Throwable {
    throw __call2009702_0(p0);
}
public static void h97_3(java.lang.Exception p0) throws Throwable {
    java.lang.Exception local1 = p0;
    return;
}
private static native long __fieldRead97_0() throws Throwable;
private static native void __fieldWrite97_1(int a0) throws Throwable;
private static native moom.oR __call97_2() throws Throwable;
private static native net.minecraft.client.resources.IResource __call97_3(moom.oR a0, moom.DD a1) throws Throwable;
private static native java.io.InputStream __call97_4(net.minecraft.client.resources.IResource a0) throws Throwable;
private static native void __call97_5(moom.OH a0, java.io.InputStream a1) throws Throwable;
private static native void __call97_6(java.io.InputStream a0) throws Throwable;
private static native java.lang.String __call97_7(moom.OH a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic97_8(java.lang.String a0) throws Throwable;
private static native void __call97_9(java.lang.String a0) throws Throwable;
private static native java.lang.String __call97_10(java.lang.String a0) throws Throwable;
private static native boolean __call97_11(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite97_12(int a0) throws Throwable;
private static native boolean __call97_13(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __invokedynamic97_14(int a0, long a1) throws Throwable;
private static native void __fieldWrite97_15(int a0) throws Throwable;
private static native boolean __call97_16(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __invokedynamic97_17(int a0, long a1) throws Throwable;
private static native void __fieldWrite97_18(int a0) throws Throwable;
private static native java.lang.Throwable __call2009700_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call2009701_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call2009702_0(java.lang.Exception a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_a7a675a3c8b6fa4a0e67() throws E;
private static final class __SourceHandler_a7a675a3c8b6fa4a0e67 {

public static boolean f1036() throws Throwable {
    return ((__fieldRead1036_1(__fieldRead1036_0()) == 1) ? true : false);
}
public static void h1036_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1103600_0(p0);
}
private static native net.minecraft.client.settings.GameSettings __fieldRead1036_0() throws Throwable;
private static native int __fieldRead1036_1(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native java.lang.Throwable __call1103600_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_64789504df0d08d117c3() throws E;
private static final class __SourceHandler_64789504df0d08d117c3 {

public static int f1037() throws Throwable {
    long life0_3;
    life0_3 = (__fieldRead1037_0() ^ 32053165023535L);
    if ((__fieldRead1037_1() == null)) {
        return __invokedynamic1037_2(21399, (2480644772047923974L ^ life0_3));
    }
    return __fieldRead1037_4(__fieldRead1037_3());
}
public static void h1037_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1103700_0(p0);
}
private static native long __fieldRead1037_0() throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead1037_1() throws Throwable;
private static native int __invokedynamic1037_2(int a0, long a1) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead1037_3() throws Throwable;
private static native int __fieldRead1037_4(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native java.lang.Throwable __call1103700_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_2d5c10d11534875d3ca0() throws E;
private static final class __SourceHandler_2d5c10d11534875d3ca0 {

public static boolean f1038() throws Throwable {
    return ((__fieldRead1038_1(__fieldRead1038_0()) == 3) ? true : false);
}
public static void h1038_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1103800_0(p0);
}
private static native net.minecraft.client.settings.GameSettings __fieldRead1038_0() throws Throwable;
private static native int __fieldRead1038_1(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native java.lang.Throwable __call1103800_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_c1cd39095ea5e0b176c9() throws E;
private static final class __SourceHandler_c1cd39095ea5e0b176c9 {

public static void f218() throws Throwable {
    org.lwjgl.opengl.DisplayMode life0_11;
    java.awt.Dimension life1_13;
    org.lwjgl.opengl.DisplayMode life2_30;
    moom.ir life3_65;
    int life4_68;
    int life5_71;
    forest_join_100: {
    forest_join_87: {
    forest_join_84: {
    forest_join_76: {
    forest_join_56: {
    forest_join_50: {
    forest_join_34: {
    forest_join_28: {
    forest_join_17: {
    forest_join_6: {
    if (!(__call218_1(__fieldRead218_0()))) {
        break forest_join_84;
    }
    if (!(__fieldRead218_2())) {
        break forest_join_6;
    }
    return;
    }
    __fieldWrite218_3(1);
    __fieldWrite218_4(0);
    life0_11 = __call218_5();
    life1_13 = __call218_6();
    if (!((life1_13 == null))) {
        break forest_join_17;
    }
    return;
    }
    if (!((__call218_7(life0_11) == __fieldRead218_8(life1_13)))) {
        break forest_join_28;
    }
    if (!((__call218_9(life0_11) == __fieldRead218_10(life1_13)))) {
        break forest_join_28;
    }
    return;
    }
    life2_30 = __call218_11(life1_13);
    if (!((life2_30 == null))) {
        break forest_join_34;
    }
    return;
    }
    __call218_12(life2_30);
    __fieldWrite218_16(__fieldRead218_13(), __call218_15(__call218_14()));
    __fieldWrite218_20(__fieldRead218_17(), __call218_19(__call218_18()));
    if (!((__fieldRead218_22(__fieldRead218_21()) <= 0))) {
        break forest_join_50;
    }
    __fieldWrite218_24(__fieldRead218_23(), 1);
    }
    if (!((__fieldRead218_26(__fieldRead218_25()) <= 0))) {
        break forest_join_56;
    }
    __fieldWrite218_28(__fieldRead218_27(), 1);
    }
    if (!((__fieldRead218_30(__fieldRead218_29()) != null))) {
        break forest_join_76;
    }
    life3_65 = new moom.ir(__fieldRead218_31());
    life4_68 = __call218_32(life3_65);
    life5_71 = __call218_33(life3_65);
    __call218_37(__fieldRead218_35(__fieldRead218_34()), __fieldRead218_36(), life4_68, life5_71);
    }
    __call218_38();
    __call218_39(1);
    __call218_42(__fieldRead218_41(__fieldRead218_40()));
    __call218_43();
    break forest_join_100;
    }
    if (!(__fieldRead218_44())) {
        break forest_join_87;
    }
    return;
    }
    __fieldWrite218_45(1);
    __fieldWrite218_46(0);
    __call218_49(__fieldRead218_48(__fieldRead218_47()));
    __call218_50();
    __call218_51();
    __call218_52(0);
    __call218_53(1);
    }
    return;
}
public static void h218_0(java.lang.Exception p0) throws Throwable {
    throw __call3021800_0(p0);
}
public static void h218_1(java.lang.Exception p0) throws Throwable {
    throw __call3021801_0(p0);
}
public static void h218_2(java.lang.Exception p0, org.lwjgl.opengl.DisplayMode p1) throws Throwable {
    java.lang.Exception life1_2;
    life1_2 = p0;
    __call3021802_0(life1_2);
    __fieldWrite3021802_2(__fieldRead3021802_1(), "Default");
    __call3021802_4(__fieldRead3021802_3());
    return;
}
private static native net.minecraft.client.Minecraft __fieldRead218_0() throws Throwable;
private static native boolean __call218_1(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __fieldRead218_2() throws Throwable;
private static native void __fieldWrite218_3(int a0) throws Throwable;
private static native void __fieldWrite218_4(int a0) throws Throwable;
private static native org.lwjgl.opengl.DisplayMode __call218_5() throws Throwable;
private static native java.awt.Dimension __call218_6() throws Throwable;
private static native int __call218_7(org.lwjgl.opengl.DisplayMode a0) throws Throwable;
private static native int __fieldRead218_8(java.awt.Dimension a0) throws Throwable;
private static native int __call218_9(org.lwjgl.opengl.DisplayMode a0) throws Throwable;
private static native int __fieldRead218_10(java.awt.Dimension a0) throws Throwable;
private static native org.lwjgl.opengl.DisplayMode __call218_11(java.awt.Dimension a0) throws Throwable;
private static native void __call218_12(org.lwjgl.opengl.DisplayMode a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead218_13() throws Throwable;
private static native org.lwjgl.opengl.DisplayMode __call218_14() throws Throwable;
private static native int __call218_15(org.lwjgl.opengl.DisplayMode a0) throws Throwable;
private static native void __fieldWrite218_16(net.minecraft.client.Minecraft a0, int a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead218_17() throws Throwable;
private static native org.lwjgl.opengl.DisplayMode __call218_18() throws Throwable;
private static native int __call218_19(org.lwjgl.opengl.DisplayMode a0) throws Throwable;
private static native void __fieldWrite218_20(net.minecraft.client.Minecraft a0, int a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead218_21() throws Throwable;
private static native int __fieldRead218_22(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead218_23() throws Throwable;
private static native void __fieldWrite218_24(net.minecraft.client.Minecraft a0, int a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead218_25() throws Throwable;
private static native int __fieldRead218_26(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead218_27() throws Throwable;
private static native void __fieldWrite218_28(net.minecraft.client.Minecraft a0, int a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead218_29() throws Throwable;
private static native net.minecraft.client.gui.GuiScreen __fieldRead218_30(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead218_31() throws Throwable;
private static native int __call218_32(moom.ir a0) throws Throwable;
private static native int __call218_33(moom.ir a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead218_34() throws Throwable;
private static native net.minecraft.client.gui.GuiScreen __fieldRead218_35(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead218_36() throws Throwable;
private static native void __call218_37(net.minecraft.client.gui.GuiScreen a0, net.minecraft.client.Minecraft a1, int a2, int a3) throws Throwable;
private static native void __call218_38() throws Throwable;
private static native void __call218_39(int a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead218_40() throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead218_41(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call218_42(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native void __call218_43() throws Throwable;
private static native boolean __fieldRead218_44() throws Throwable;
private static native void __fieldWrite218_45(int a0) throws Throwable;
private static native void __fieldWrite218_46(int a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead218_47() throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead218_48(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call218_49(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native void __call218_50() throws Throwable;
private static native void __call218_51() throws Throwable;
private static native void __call218_52(int a0) throws Throwable;
private static native void __call218_53(int a0) throws Throwable;
private static native java.lang.Throwable __call3021800_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call3021801_0(java.lang.Exception a0) throws Throwable;
private static native void __call3021802_0(java.lang.Exception a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead3021802_1() throws Throwable;
private static native void __fieldWrite3021802_2(net.minecraft.client.settings.GameSettings a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead3021802_3() throws Throwable;
private static native void __call3021802_4(net.minecraft.client.settings.GameSettings a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_b1c58fc8d865740e168a() throws E;
private static final class __SourceHandler_b1c58fc8d865740e168a {

public static int f599() throws Throwable {
    moom.C3 life0_9;
    long[] life1_12;
    int life2_15;
    int life3_18;
    int life4_23;
    long life5_35;
    long life7_37;
    int life9_44;
    long life10_59;
    double life9_82;
    lexical_join_85: {
    lexical_join_75: {
    lexical_join_28: {
    if (!((__fieldRead599_1(__fieldRead599_0()) != __fieldRead599_2()))) {
        break lexical_join_85;
    }
    __fieldWrite599_5(__fieldRead599_4(__fieldRead599_3()));
    life0_9 = __call599_7(__fieldRead599_6());
    life1_12 = __call599_8(life0_9);
    life2_15 = __call599_9(life0_9);
    life3_18 = __call599_10(life0_9);
    if (!((life2_15 != life3_18))) {
        break lexical_join_85;
    }
    life4_23 = __call599_11();
    if (!((life4_23 <= 0))) {
        break lexical_join_28;
    }
    life4_23 = 1;
    }
    life5_35 = ((long) ((0x1.0p0d / ((double) life4_23)) * 0x1.dcd65p29d));
    life7_37 = 0L;
    life9_44 = __call599_12((life2_15 - 1), (life1_12).length);
    lexical_cycle_45: while (true) {
    lexical_join_63: {
    if (!((life9_44 != life3_18))) {
        break lexical_join_75;
    }
    if (!((__numericCompare599_13(((double) life7_37), 0x1.dcd65p29d) < 0))) {
        break lexical_join_75;
    }
    life10_59 = (life1_12)[life9_44];
    if (!((__numericCompare599_14(life10_59, life5_35) > 0))) {
        break lexical_join_63;
    }
    life5_35 = life10_59;
    }
    life7_37 = (life7_37 + life10_59);
    life9_44 = __call599_15((life9_44 - 1), (life1_12).length);
    continue lexical_cycle_45;
    }
    }
    life9_82 = (((double) life5_35) / 0x1.dcd65p29d);
    __fieldWrite599_16(((int) (0x1.0p0d / life9_82)));
    }
    return __fieldRead599_17();
}
public static void h599_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1059900_0(p0);
}
private static native net.minecraft.client.Minecraft __fieldRead599_0() throws Throwable;
private static native java.lang.String __fieldRead599_1(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.lang.String __fieldRead599_2() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead599_3() throws Throwable;
private static native java.lang.String __fieldRead599_4(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __fieldWrite599_5(java.lang.String a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead599_6() throws Throwable;
private static native moom.C3 __call599_7(net.minecraft.client.Minecraft a0) throws Throwable;
private static native long[] __call599_8(moom.C3 a0) throws Throwable;
private static native int __call599_9(moom.C3 a0) throws Throwable;
private static native int __call599_10(moom.C3 a0) throws Throwable;
private static native int __call599_11() throws Throwable;
private static native int __call599_12(int a0, int a1) throws Throwable;
private static native int __numericCompare599_13(double a0, double a1) throws Throwable;
private static native int __numericCompare599_14(long a0, long a1) throws Throwable;
private static native int __call599_15(int a0, int a1) throws Throwable;
private static native void __fieldWrite599_16(int a0) throws Throwable;
private static native int __fieldRead599_17() throws Throwable;
private static native java.lang.Throwable __call1059900_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_646fa7fce7f4d7ccbcb5() throws E;
private static final class __SourceHandler_646fa7fce7f4d7ccbcb5 {

public static boolean f1041() throws Throwable {
    return ((__fieldRead1041_1(__fieldRead1041_0()) != 3) ? true : false);
}
public static void h1041_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1104100_0(p0);
}
private static native net.minecraft.client.settings.GameSettings __fieldRead1041_0() throws Throwable;
private static native int __fieldRead1041_1(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native java.lang.Throwable __call1104100_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_f63a8e583cc8c4c688f0() throws E;
private static final class __SourceHandler_f63a8e583cc8c4c688f0 {

public static int f1042() throws Throwable {
    long life0_3;
    java.lang.String life2_6;
    life0_3 = (__fieldRead1042_0() ^ 24522294218221L);
    life2_6 = __call1042_1("ProgramFiles(X86)");
    return ((life2_6 != null) ? __invokedynamic1042_2(6539, (9096051334550277613L ^ life0_3)) : __invokedynamic1042_3(2142, (6875377304740781103L ^ life0_3)));
}
public static void h1042_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1104200_0(p0);
}
private static native long __fieldRead1042_0() throws Throwable;
private static native java.lang.String __call1042_1(java.lang.String a0) throws Throwable;
private static native int __invokedynamic1042_2(int a0, long a1) throws Throwable;
private static native int __invokedynamic1042_3(int a0, long a1) throws Throwable;
private static native java.lang.Throwable __call1104200_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_d7e041870cf103896c9a() throws E;
private static final class __SourceHandler_d7e041870cf103896c9a {

public static int f1043() throws Throwable {
    long life0_3;
    java.lang.String[] life2_18;
    java.lang.String[] life3_20;
    int life4_23;
    int life5_25;
    java.lang.String life6_32;
    java.lang.String life7_35;
    life0_3 = (__fieldRead1043_0() ^ 105326572739766L);
    life2_18 = new java.lang.String[] {"sun.arch.data.model", "com.ibm.vm.bitmode", "os.arch"};
    life3_20 = life2_18;
    life4_23 = (life3_20).length;
    life5_25 = 0;
    loop_region_26: while ((life5_25 < life4_23)) {
        life6_32 = (life3_20)[life5_25];
        life7_35 = __call1043_1(life6_32);
        if ((life7_35 != null)) {
        if (__call1043_2(life7_35, "64")) {
        return __invokedynamic1043_3(25286, (3573149100498020345L ^ life0_3));
    }
    }
        life5_25 += 1;
    }
    return __invokedynamic1043_4(25222, (2668608003926812592L ^ life0_3));
}
public static void h1043_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1104300_0(p0);
}
public static void h1043_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1104301_0(p0);
}
private static native long __fieldRead1043_0() throws Throwable;
private static native java.lang.String __call1043_1(java.lang.String a0) throws Throwable;
private static native boolean __call1043_2(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __invokedynamic1043_3(int a0, long a1) throws Throwable;
private static native int __invokedynamic1043_4(int a0, long a1) throws Throwable;
private static native java.lang.Throwable __call1104300_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Throwable __call1104301_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_45c93306dd05799646fa() throws E;
private static final class __SourceHandler_45c93306dd05799646fa {

public static boolean f1044() throws Throwable {
    return ((__fieldRead1044_1(__fieldRead1044_0()) == 0) ? __fieldRead1044_3(__fieldRead1044_2()) : ((__fieldRead1044_5(__fieldRead1044_4()) == 2) ? true : false));
}
public static void h1044_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1104400_0(p0);
}
public static void h1044_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1104401_0(p0);
}
private static native net.minecraft.client.settings.GameSettings __fieldRead1044_0() throws Throwable;
private static native int __fieldRead1044_1(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead1044_2() throws Throwable;
private static native boolean __fieldRead1044_3(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead1044_4() throws Throwable;
private static native int __fieldRead1044_5(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native java.lang.Throwable __call1104400_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Throwable __call1104401_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_da6678cb6b9b454b95c6() throws E;
private static final class __SourceHandler_da6678cb6b9b454b95c6 {

public static boolean f1045() throws Throwable {
    return ((__fieldRead1045_1(__fieldRead1045_0()) == 3) ? true : false);
}
public static void h1045_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1104500_0(p0);
}
private static native net.minecraft.client.settings.GameSettings __fieldRead1045_0() throws Throwable;
private static native int __fieldRead1045_1(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native java.lang.Throwable __call1104500_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_9d05024c6fe55f58177b() throws E;
private static final class __SourceHandler_9d05024c6fe55f58177b {

public static boolean f600() throws Throwable {
    int forwardValue600_30_0;
    forward_join_30: {
    forward_join_28: {
    forward_join_26: {
    forward_join_19: {
    forward_join_11: {
    forward_join_9: {
    if (!((__fieldRead600_1(__fieldRead600_0()) != 0))) {
        break forward_join_11;
    }
    if (!((__fieldRead600_3(__fieldRead600_2()) == 2))) {
        break forward_join_9;
    }
    forwardValue600_30_0 = 1;
    break forward_join_30;
    }
    forwardValue600_30_0 = 0;
    break forward_join_30;
    }
    if (!(__call600_4())) {
        break forward_join_19;
    }
    if (!((!__call600_6(__fieldRead600_5())))) {
        break forward_join_19;
    }
    forwardValue600_30_0 = __integerCategory600_9(__call600_8(__fieldRead600_7()));
    break forward_join_30;
    }
    if (!((__fieldRead600_10() != 0))) {
        break forward_join_28;
    }
    if (!((__fieldRead600_11() == 2))) {
        break forward_join_26;
    }
    forwardValue600_30_0 = 1;
    break forward_join_30;
    }
    forwardValue600_30_0 = 0;
    break forward_join_30;
    }
    forwardValue600_30_0 = __integerCategory600_14(__fieldRead600_13(__fieldRead600_12()));
    }
    return __integerCategory600_15(forwardValue600_30_0);
}
public static void h600_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1060000_0(p0);
}
public static void h600_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1060001_0(p0);
}
public static void h600_2(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1060002_0(p0);
}
public static void h600_3(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1060003_0(p0);
}
public static void h600_4(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1060004_0(p0);
}
public static void h600_5(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1060005_0(p0);
}
private static native net.minecraft.client.settings.GameSettings __fieldRead600_0() throws Throwable;
private static native int __fieldRead600_1(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead600_2() throws Throwable;
private static native int __fieldRead600_3(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native boolean __call600_4() throws Throwable;
private static native moom.MZ __fieldRead600_5() throws Throwable;
private static native boolean __call600_6(moom.MZ a0) throws Throwable;
private static native moom.MZ __fieldRead600_7() throws Throwable;
private static native boolean __call600_8(moom.MZ a0) throws Throwable;
private static native int __integerCategory600_9(boolean value) throws Throwable;
private static native int __fieldRead600_10() throws Throwable;
private static native int __fieldRead600_11() throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead600_12() throws Throwable;
private static native boolean __fieldRead600_13(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native int __integerCategory600_14(boolean value) throws Throwable;
private static native boolean __integerCategory600_15(int value) throws Throwable;
private static native java.lang.Throwable __call1060000_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Throwable __call1060001_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Throwable __call1060002_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Throwable __call1060003_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Throwable __call1060004_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Throwable __call1060005_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_1325fa819cfaf0260d0a() throws E;
private static final class __SourceHandler_1325fa819cfaf0260d0a {

public static boolean f601() throws Throwable {
    int forwardValue601_25_0;
    forward_join_25: {
    forward_join_24: {
    forward_join_19: {
    forward_join_11: {
    forward_join_9: {
    if (!((__fieldRead601_1(__fieldRead601_0()) != 0))) {
        break forward_join_11;
    }
    if (!((__fieldRead601_3(__fieldRead601_2()) == 3))) {
        break forward_join_9;
    }
    forwardValue601_25_0 = 1;
    break forward_join_25;
    }
    forwardValue601_25_0 = 0;
    break forward_join_25;
    }
    if (!(__call601_4())) {
        break forward_join_19;
    }
    if (!((!__call601_6(__fieldRead601_5())))) {
        break forward_join_19;
    }
    forwardValue601_25_0 = __integerCategory601_9(__call601_8(__fieldRead601_7()));
    break forward_join_25;
    }
    if (!((__fieldRead601_10() == 3))) {
        break forward_join_24;
    }
    forwardValue601_25_0 = 1;
    break forward_join_25;
    }
    forwardValue601_25_0 = 0;
    }
    return __integerCategory601_11(forwardValue601_25_0);
}
public static void h601_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1060100_0(p0);
}
public static void h601_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1060101_0(p0);
}
public static void h601_2(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1060102_0(p0);
}
public static void h601_3(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1060103_0(p0);
}
public static void h601_4(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1060104_0(p0);
}
private static native net.minecraft.client.settings.GameSettings __fieldRead601_0() throws Throwable;
private static native int __fieldRead601_1(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead601_2() throws Throwable;
private static native int __fieldRead601_3(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native boolean __call601_4() throws Throwable;
private static native moom.MZ __fieldRead601_5() throws Throwable;
private static native boolean __call601_6(moom.MZ a0) throws Throwable;
private static native moom.MZ __fieldRead601_7() throws Throwable;
private static native boolean __call601_8(moom.MZ a0) throws Throwable;
private static native int __integerCategory601_9(boolean value) throws Throwable;
private static native int __fieldRead601_10() throws Throwable;
private static native boolean __integerCategory601_11(int value) throws Throwable;
private static native java.lang.Throwable __call1060100_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Throwable __call1060101_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Throwable __call1060102_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Throwable __call1060103_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Throwable __call1060104_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_36ec1b492ef385b8ab91() throws E;
private static final class __SourceHandler_36ec1b492ef385b8ab91 {

public static boolean f1048() throws Throwable {
    return ((__fieldRead1048_1(__fieldRead1048_0()) == 0) ? __fieldRead1048_3(__fieldRead1048_2()) : ((__fieldRead1048_5(__fieldRead1048_4()) != 1) ? true : false));
}
public static void h1048_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1104800_0(p0);
}
public static void h1048_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1104801_0(p0);
}
private static native net.minecraft.client.settings.GameSettings __fieldRead1048_0() throws Throwable;
private static native int __fieldRead1048_1(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead1048_2() throws Throwable;
private static native boolean __fieldRead1048_3(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead1048_4() throws Throwable;
private static native int __fieldRead1048_5(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native java.lang.Throwable __call1104800_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Throwable __call1104801_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_ebc985d4042c752a7ba4() throws E;
private static final class __SourceHandler_ebc985d4042c752a7ba4 {

public static boolean f1049() throws Throwable {
    return ((__fieldRead1049_1(__fieldRead1049_0()) == 4) ? true : false);
}
public static void h1049_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1104900_0(p0);
}
private static native net.minecraft.client.settings.GameSettings __fieldRead1049_0() throws Throwable;
private static native int __fieldRead1049_1(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native java.lang.Throwable __call1104900_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_6294b8aa7e370a54c90b() throws E;
private static final class __SourceHandler_6294b8aa7e370a54c90b {

public static boolean f602() throws Throwable {
    int forwardValue602_17_0;
    forward_join_17: {
    forward_join_16: {
    forward_join_10: {
    forward_join_8: {
    if (!((__fieldRead602_1(__fieldRead602_0()) == 0))) {
        break forward_join_10;
    }
    if (!((!__fieldRead602_3(__fieldRead602_2())))) {
        break forward_join_8;
    }
    forwardValue602_17_0 = 1;
    break forward_join_17;
    }
    forwardValue602_17_0 = 0;
    break forward_join_17;
    }
    if (!((__fieldRead602_5(__fieldRead602_4()) == 4))) {
        break forward_join_16;
    }
    forwardValue602_17_0 = 1;
    break forward_join_17;
    }
    forwardValue602_17_0 = 0;
    }
    return __integerCategory602_6(forwardValue602_17_0);
}
public static void h602_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1060200_0(p0);
}
public static void h602_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1060201_0(p0);
}
public static void h602_2(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1060202_0(p0);
}
private static native net.minecraft.client.settings.GameSettings __fieldRead602_0() throws Throwable;
private static native int __fieldRead602_1(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead602_2() throws Throwable;
private static native boolean __fieldRead602_3(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead602_4() throws Throwable;
private static native int __fieldRead602_5(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native boolean __integerCategory602_6(int value) throws Throwable;
private static native java.lang.Throwable __call1060200_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Throwable __call1060201_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Throwable __call1060202_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_eee5a344f03cefbbc5c3() throws E;
private static final class __SourceHandler_eee5a344f03cefbbc5c3 {

public static boolean f1051() throws Throwable {
    return ((__fieldRead1051_1(__fieldRead1051_0()) == 0) ? __fieldRead1051_3(__fieldRead1051_2()) : ((__fieldRead1051_5(__fieldRead1051_4()) == 2) ? true : false));
}
public static void h1051_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1105100_0(p0);
}
public static void h1051_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1105101_0(p0);
}
private static native net.minecraft.client.settings.GameSettings __fieldRead1051_0() throws Throwable;
private static native int __fieldRead1051_1(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead1051_2() throws Throwable;
private static native boolean __fieldRead1051_3(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead1051_4() throws Throwable;
private static native int __fieldRead1051_5(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native java.lang.Throwable __call1105100_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Throwable __call1105101_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_26b260c1b51e9272e41b() throws E;
private static final class __SourceHandler_26b260c1b51e9272e41b {

public static boolean f1052() throws Throwable {
    return ((__fieldRead1052_1(__fieldRead1052_0()) != 2) ? true : false);
}
public static void h1052_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1105200_0(p0);
}
private static native net.minecraft.client.settings.GameSettings __fieldRead1052_0() throws Throwable;
private static native int __fieldRead1052_1(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native java.lang.Throwable __call1105200_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_087deea038882de20706() throws E;
private static final class __SourceHandler_087deea038882de20706 {

public static boolean f1053() throws Throwable {
    return ((__fieldRead1053_1(__fieldRead1053_0()) == 1) ? true : false);
}
public static void h1053_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1105300_0(p0);
}
private static native net.minecraft.client.settings.GameSettings __fieldRead1053_0() throws Throwable;
private static native int __fieldRead1053_1(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native java.lang.Throwable __call1105300_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_b310a090d243d38993ef() throws E;
private static final class __SourceHandler_b310a090d243d38993ef {

public static boolean f1054() throws Throwable {
    return ((__fieldRead1054_1(__fieldRead1054_0()) != 2) ? true : false);
}
public static void h1054_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1105400_0(p0);
}
private static native net.minecraft.client.settings.GameSettings __fieldRead1054_0() throws Throwable;
private static native int __fieldRead1054_1(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native java.lang.Throwable __call1105400_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_62b07186cc8cfd45a12b() throws E;
private static final class __SourceHandler_62b07186cc8cfd45a12b {

public static boolean f1055() throws Throwable {
    return ((__fieldRead1055_1(__fieldRead1055_0()) == 1) ? true : false);
}
public static void h1055_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1105500_0(p0);
}
private static native net.minecraft.client.settings.GameSettings __fieldRead1055_0() throws Throwable;
private static native int __fieldRead1055_1(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native java.lang.Throwable __call1105500_0(java.lang.NumberFormatException a0) throws Throwable;

}


public static boolean B() {
return ((((((net.minecraft.client.settings.GameSettings)(moom.BU.m)).b0) ? 1 : 0)) != 0);
}


public static boolean C() {
return ((((((net.minecraft.client.settings.GameSettings)(moom.BU.m)).b1) ? 1 : 0)) != 0);
}


public static boolean D() {
return ((((((net.minecraft.client.settings.GameSettings)(moom.BU.m)).b2) ? 1 : 0)) != 0);
}


public static boolean F() {
return ((((((net.minecraft.client.settings.GameSettings)(moom.BU.m)).b4) ? 1 : 0)) != 0);
}


public static boolean I() { return __sourceHandlerCall_4e28191a77658460c2fa(); }


public static boolean J() { return __sourceHandlerCall_62b5b413939de64add71(); }


public static boolean S() { return __sourceHandlerCall_6eba1d2a8c73a252b34e(); }


public static boolean Z() {
return ((((((net.minecraft.client.settings.GameSettings)(moom.BU.m)).b7) ? 1 : 0)) != 0);
}


public static boolean V() { return __sourceHandlerCall_3bba3462b900693d1cdd(); }


public static int i() { return __sourceHandlerCall_b1c58fc8d865740e168a(); }


public static boolean i__Boolean() { return __sourceHandlerCall_646fa7fce7f4d7ccbcb5(); }


public static void i__Void() {
try {
        ((net.minecraft.client.shader.Framebuffer)(((net.minecraft.client.Minecraft)(moom.BU.n)).a__pA())).a(((int)(((net.minecraft.client.Minecraft)(moom.BU.n)).G)), ((int)(((net.minecraft.client.Minecraft)(moom.BU.n)).H)));
        if ((((net.minecraft.client.Minecraft)(moom.BU.n)).R != null)) {
        ((net.minecraft.client.renderer.EntityRenderer)(((net.minecraft.client.Minecraft)(moom.BU.n)).R)).a(((int)(((net.minecraft.client.Minecraft)(moom.BU.n)).G)), ((int)(((net.minecraft.client.Minecraft)(moom.BU.n)).H)));
    }
    } catch (java.lang.NumberFormatException caught_rethrow_0) {
        throw moom.BU.a(((java.lang.Throwable)(caught_rethrow_0)));
    }
    ((net.minecraft.client.Minecraft)(moom.BU.n)).Q = ((moom.fL)(new moom.fL(moom.BU.n)));
    return;
}


public static float b() {
return ((net.minecraft.client.settings.GameSettings)(moom.BU.m)).a4;
}


public static java.lang.Object[] b(java.lang.Object[] p0, java.lang.Object p1) {
java.util.ArrayList local2 = new java.util.ArrayList(java.util.Arrays.asList(((java.lang.Object[])(p0))));
    ((java.util.List)(local2)).remove(((java.lang.Object)(p1)));
    return moom.BU.a(((java.util.Collection)(local2)), ((java.lang.Class)(((java.lang.Class)(((java.lang.Object)(p0)).getClass())).getComponentType())));
}


public static int b__Int() {
return ((net.minecraft.client.settings.GameSettings)(moom.BU.m)).V;
}


public static org.lwjgl.opengl.DisplayMode b__DisplayMode() { return __sourceHandlerCall_6e67a0f518b0f1a821b6(); }


private static java.lang.String b(java.lang.String p0) { return __sourceHandlerCall_d2f626eb162337d3fd96(p0); }


public static boolean b(java.lang.Object p0, java.lang.Object[] p1) { return __sourceHandlerCall_eb385738ec3e225bdca7(p0, p1); }


public static void b__Void(java.lang.String p0) {
((org.apache.logging.log4j.Logger)(moom.BU.C)).info(((java.lang.String)(__sourceIntrinsic_d09e7390a875_originalDynamicSite1055_1(p0))));
    return;
}


public static boolean b(moom.DD p0) { return __sourceHandlerCall_43874a1a009fca0d6a2b(p0); }


public static void b(net.minecraft.entity.Entity[] p0) {
H = ((net.minecraft.entity.Entity[])(p0));
    return;
}


public static boolean b__Boolean() {
return ((((moom.BU.l) ? 1 : 0)) != 0);
}


public static void b__Void() { __sourceHandlerCall_d1384ac56348035db8a3(); }


private static java.lang.String[] b__ArrayString() { return __sourceHandlerCall_fc276ca77ecf7eb95d81(); }


public static net.minecraft.entity.Entity[] b__Arrayr3() {
return moom.BU.H;
}


public static moom.J5 b__J5() { return __sourceHandlerCall_c4fc7b9da6f29f0b8248(); }


public static java.lang.String b__String() {
long life0_3;
    java.lang.StringBuilder life2_12;
    java.lang.String life3_35;
    life0_3 = (moom.BU.I ^ 53644919370697L);
    life2_12 = new java.lang.StringBuilder(__sourceIntrinsic_d1398b4921c0_invokedynamic1034_1(25222, (2668562920219773135L ^ life0_3)));
    try {
        if (moom.BU.ay()) {
        ((java.lang.StringBuilder)(life2_12)).append(((java.lang.String)("DL: ")));
        ((java.lang.StringBuilder)(life2_12)).append(((int)(moom.JF.a())));
        ((java.lang.StringBuilder)(life2_12)).append(((java.lang.String)(", ")));
    }
    } catch (java.lang.NumberFormatException caught_rethrow_0) {
        throw moom.BU.a(((java.lang.Throwable)(caught_rethrow_0)));
    }
    ((java.lang.StringBuilder)(life2_12)).append(((java.lang.String)("OptiFine_1.8.9_HD_U_M5")));
    life3_35 = moom.MP.a__String();
    try {
        if ((life3_35 != null)) {
        ((java.lang.StringBuilder)(life2_12)).append(((java.lang.String)(", ")));
        ((java.lang.StringBuilder)(life2_12)).append(((java.lang.String)(life3_35)));
    }
    } catch (java.lang.NumberFormatException caught_rethrow_1) {
        throw moom.BU.a(((java.lang.Throwable)(caught_rethrow_1)));
    }
    return ((java.lang.StringBuilder)(life2_12)).toString();
}


public static boolean ad() {
return ((((((net.minecraft.client.settings.GameSettings)(moom.BU.m)).bz) ? 1 : 0)) != 0);
}


public static void e(java.lang.String p0) {
moom.BU.b__Void(((java.lang.String)(p0)));
    return;
}


private static void e__Void() {
moom.Ow local0 = new moom.Ow();
    ((moom.Ow)(local0)).start();
    return;
}


public static boolean e__Boolean() { return __sourceHandlerCall_015a0812c6ea46a74fb3(); }


public static java.lang.String e__String() { return __sourceHandlerCall_9c5c4da1338681391fad(); }


public static int e() {
return ((net.minecraft.client.settings.GameSettings)(moom.BU.m)).bd;
}


public static boolean x() {
return ((((((net.minecraft.client.settings.GameSettings)(moom.BU.m)).bV) ? 1 : 0)) != 0);
}


public static boolean ae() {
return ((((((net.minecraft.client.settings.GameSettings)(moom.BU.m)).bA) ? 1 : 0)) != 0);
}


public static boolean s() { return __sourceHandlerCall_26b260c1b51e9272e41b(); }


public static float c() { return __sourceHandlerCall_865731bb2a2fc5702edf(); }


public static java.lang.String c__String() { return __sourceHandlerCall_dee7c2c45c3df1ae943a(); }


public static java.lang.String[] c__ArrayString() {
org.lwjgl.opengl.DisplayMode[] life0_1;
    java.lang.String[] life1_5;
    int life2_7;
    org.lwjgl.opengl.DisplayMode life3_15;
    java.lang.String life4_21;
    forest_join_28: {
    life0_1 = moom.BU.a__ArrayDisplayMode();
    life1_5 = new java.lang.String[(life0_1).length];
    life2_7 = 0;
    forest_cycle_8: while (true) {
    if (!((life2_7 < (life0_1).length))) {
        break forest_join_28;
    }
    life3_15 = (life0_1)[life2_7];
    life4_21 = __sourceIntrinsic_9620d08a38fc_invokedynamic217_3(((org.lwjgl.opengl.DisplayMode)(life3_15)).getWidth(), ((org.lwjgl.opengl.DisplayMode)(life3_15)).getHeight());
    (life1_5)[life2_7] = life4_21;
    life2_7 += 1;
    continue forest_cycle_8;
    }
    }
    return life1_5;
}


private static void c__Void() { __sourceHandlerCall_46d9419bd47bfbc57d10(); }


public static boolean c__Boolean() { return __sourceHandlerCall_28b7cd89a0dfaf6029da(); }


public static int c__Int() { return __sourceHandlerCall_7f3a0077ebb67db336e6(); }


public static void c(java.lang.String p0) {
((org.apache.logging.log4j.Logger)(moom.BU.C)).warn(((java.lang.String)(__sourceIntrinsic_41b51cd99fcb_originalDynamicSite1056_1(p0))));
    return;
}


public static moom.J5 c__J5() { return __sourceHandlerCall_26ac9121c6284fe30736(); }


public static boolean n() { return __sourceHandlerCall_1325fa819cfaf0260d0a(); }


public static int h() { return __sourceHandlerCall_64789504df0d08d117c3(); }


public static boolean h__Boolean() { return __sourceHandlerCall_2d5c10d11534875d3ca0(); }


public static void h__Void() { __sourceHandlerCall_c1cd39095ea5e0b176c9(); }


public static boolean f__Boolean() { return __sourceHandlerCall_481154b4f610b95c0549(); }


public static java.lang.String f__String() {
return moom.BU.b;
}


public static void f(java.lang.String p0) { __sourceHandlerCall_6d224c7c5b586c1b97eb(p0); }


public static void f__Void() { __sourceHandlerCall_dcb005ae9d257d3a9317(); }


public static int f() {
return moom.BU.s;
}


public static boolean l__Boolean() { return __sourceHandlerCall_da6678cb6b9b454b95c6(); }


public static int l() {
return ((net.minecraft.client.settings.GameSettings)(moom.BU.m)).bS;
}


public static boolean d__Boolean() { return __sourceHandlerCall_61e75a3d1adfc8695ee5(); }


public static void d__Void() { __sourceHandlerCall_a89b02f81a9a01f7c0a7(); }


public static int d() {
return ((net.minecraft.client.settings.GameSettings)(moom.BU.m)).bt;
}


public static void d(java.lang.String p0) {
((org.apache.logging.log4j.Logger)(moom.BU.C)).error(((java.lang.String)(__sourceIntrinsic_acbc417da872_originalDynamicSite1057_1(p0))));
    return;
}


public static java.lang.String d__String() {
moom.J5 local0 = moom.BU.b__J5();
    return __sourceIntrinsic_965bda21d828_originalDynamicSite1058_4(((moom.J5)(local0)).a(), ((moom.J5)(local0)).b(), ((moom.J5)(local0)).c());
}


public static java.awt.Dimension a__Dimension() { return __sourceHandlerCall_f90f71a697e7e8a6ffad(); }


public static java.lang.String a(java.io.File p0) throws java.io.IOException {
java.io.FileInputStream local1 = new java.io.FileInputStream(p0);
    return moom.BU.a(((java.io.InputStream)(local1)), ((java.lang.String)("ASCII")));
}


public static java.lang.String a(java.io.InputStream p0) throws java.io.IOException {
return moom.BU.a(((java.io.InputStream)(p0)), ((java.lang.String)("ASCII")));
}


public static java.lang.String a(java.io.InputStream p0, java.lang.String p1) throws java.io.IOException { return __sourceHandlerCall_94671de1b59ba7199530(p0, p1); }


public static boolean a__Boolean(float p0, float p1, float p2) { return __sourceHandlerCall_3e04b2fc1639ad5505cc(p0, p1, p2); }


public static java.lang.String[] a__ArrayString(java.io.File p0) throws java.io.IOException {
java.io.FileInputStream local1 = new java.io.FileInputStream(p0);
    return moom.BU.a__ArrayString(((java.io.InputStream)(local1)));
}


public static java.lang.String[] a__ArrayString(java.io.InputStream p0) throws java.io.IOException { return __sourceHandlerCall_56b8ea4f0fd55eeed377(p0); }


public static boolean a__Boolean(int p0, int p1, int p2) { return __sourceHandlerCall_d16d91a5c3615f013555(p0, p1, p2); }


public static java.lang.String[] a__ArrayString(java.lang.String p0, java.lang.String p1) {
java.util.StringTokenizer life2_5;
    java.util.ArrayList life3_9;
    java.lang.String life4_15;
    life2_5 = new java.util.StringTokenizer(p0, p1);
    life3_9 = new java.util.ArrayList();
    while (((java.util.StringTokenizer)(life2_5)).hasMoreTokens()) {
        life4_15 = ((java.util.StringTokenizer)(life2_5)).nextToken();
        ((java.util.List)(life3_9)).add(((java.lang.Object)(life4_15)));
    }
    return ((java.lang.String[])(((java.util.List)(life3_9)).toArray(((java.lang.Object[])(new java.lang.String[0])))));
}


public static org.lwjgl.opengl.DisplayMode a__DisplayMode() {
return moom.BU.q;
}


public static org.lwjgl.opengl.DisplayMode[] a__ArrayDisplayMode() { return __sourceHandlerCall_267dcdcea5bff73b1764(); }


private static java.util.Set<java.awt.Dimension> a(org.lwjgl.opengl.DisplayMode[] p0) {
java.util.HashSet life1_3;
    org.lwjgl.opengl.DisplayMode[] life2_5;
    int life3_8;
    int life4_10;
    org.lwjgl.opengl.DisplayMode life5_17;
    java.awt.Dimension life6_25;
    forest_join_32: {
    life1_3 = new java.util.HashSet();
    life2_5 = p0;
    life3_8 = (life2_5).length;
    life4_10 = 0;
    forest_cycle_11: while (true) {
    if (!((life4_10 < life3_8))) {
        break forest_join_32;
    }
    life5_17 = (life2_5)[life4_10];
    life6_25 = new java.awt.Dimension(((org.lwjgl.opengl.DisplayMode)(life5_17)).getWidth(), ((org.lwjgl.opengl.DisplayMode)(life5_17)).getHeight());
    ((java.util.Set)(life1_3)).add(((java.lang.Object)(life6_25)));
    life4_10 += 1;
    continue forest_cycle_11;
    }
    }
    return life1_3;
}


private static org.lwjgl.opengl.DisplayMode[] a(org.lwjgl.opengl.DisplayMode[] p0, java.awt.Dimension p1) { return __sourceHandlerCall_311677aac39f79bb2eab(p0, p1); }


private static org.lwjgl.opengl.DisplayMode a(org.lwjgl.opengl.DisplayMode[] p0, org.lwjgl.opengl.DisplayMode p1) { return __sourceHandlerCall_966b390b5e80d99b3a32(p0, p1); }


public static int a(java.lang.String p0, int p1) { return __sourceHandlerCall_1a44b94668ac50130fcb(p0, p1); }


public static float a(java.lang.String p0, float p1) { return __sourceHandlerCall_7693e953f0779bccd8a7(p0, p1); }


public static org.lwjgl.opengl.DisplayMode a(java.awt.Dimension p0) throws org.lwjgl.LWJGLException { return __sourceHandlerCall_cff688aca5b0bbc3413b(p0); }


public static boolean a(java.lang.String p0, boolean p1) { return __sourceHandlerCall_5035c217f1a7468caa8e(p0, p1); }


public static java.lang.Boolean a(java.lang.String p0, java.lang.Boolean p1) { return __sourceHandlerCall_b809388de9c73e3eb6ef(p0, p1); }


public static void a(java.io.File p0, java.lang.String p1) throws java.io.IOException {
java.io.FileOutputStream local2 = new java.io.FileOutputStream(p0);
    byte[] local3 = ((java.lang.String)(p1)).getBytes(((java.nio.charset.Charset)(java.nio.charset.StandardCharsets.US_ASCII)));
    ((java.io.FileOutputStream)(local2)).write(((byte[])(local3)));
    ((java.io.FileOutputStream)(local2)).close();
    return;
}


public static net.minecraft.client.renderer.texture.TextureMap a__n8() {
return ((net.minecraft.client.Minecraft)(moom.BU.a__fM())).a__n8();
}


public static int[] a(java.lang.Integer[] p0) { return __sourceHandlerCall_363923571a9db629b42e(p0); }


public static boolean a(java.net.URI p0) {
try {
        ((java.awt.Desktop)(java.awt.Desktop.getDesktop())).browse(((java.net.URI)(p0)));
        return true;
    } catch (java.lang.Exception caught1) {
        moom.BU.c(((java.lang.String)(__sourceIntrinsic_1005932d5821_invokedynamic3827_2(p0))));
        moom.BU.c(((java.lang.String)(__sourceIntrinsic_1005932d5821_invokedynamic3827_7(((java.lang.Class)(((java.lang.Object)(caught1)).getClass())).getName(), ((java.lang.Exception)(caught1)).getMessage()))));
        return false;
    }
}


public static void a__Void(java.lang.String p0, java.lang.String p1) {
moom.hz local2 = new moom.hz(((net.minecraft.client.Minecraft)(moom.BU.n)).P, p0, p1);
    ((net.minecraft.client.Minecraft)(moom.BU.n)).a(((net.minecraft.client.gui.GuiScreen)(local2)));
    return;
}


public static int[] a(int[] p0, int p1) {
return moom.BU.a(((int[])(p0)), ((int[])(new int[] {p1})));
}


public static int[] a(int[] p0, int[] p1) { return __sourceHandlerCall_0e2e82be58a10f44719e(p0, p1); }


public static moom.n3 a(moom.n3 p0) { return __sourceHandlerCall_96a015ee7b8f1b655606(p0); }


public static void a(java.lang.Object p0, java.lang.String p1) throws java.lang.NullPointerException { __sourceHandlerCall_a7deeb337139729065eb(p0, p1); }


private static java.lang.Throwable a(java.lang.Throwable p0) {
return p0;
}


private static int a(int p0, long p1) {
int n4 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x1B6A;
        if (K[n4] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = J[n4];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])L.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    L.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/BU", exception);
            }
            int n6 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            BU.K[n4] = n6;
        }
        return K[n4];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.BU.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public static java.lang.String a(boolean[] p0, java.lang.String p1) { return __sourceHandlerCall_90e69750a608bcdb3695(p0, p1); }


public static java.nio.IntBuffer a__IntBuffer(int p0) {
return ((java.nio.ByteBuffer)(net.minecraft.client.renderer.GLAllocation.a__ByteBuffer(((int)((p0 << 2)))))).asIntBuffer();
}


public static java.lang.String a__String(int p0) { return __sourceHandlerCall_6345b6e884e9b8d755ac(p0); }


public static boolean a(java.lang.Boolean p0) { return __sourceHandlerCall_9b35b6a72a24b1a0627d(p0); }


public static int a(int p0) {
long local1 = (moom.BU.I ^ 10572286359944L);
    p0 = ((p0 ^ __sourceIntrinsic_5c51e7cdc795_originalDynamicSite1059_1(22563, (6173287774133172265L ^ local1))) ^ (p0 >> __sourceIntrinsic_5c51e7cdc795_originalDynamicSite1059_2(7091, (7587098019736681404L ^ local1))));
    p0 = (p0 + (p0 << 3));
    p0 = (p0 ^ (p0 >> 4));
    p0 = (p0 * __sourceIntrinsic_5c51e7cdc795_originalDynamicSite1059_3(26620, (2082123606263859169L ^ local1)));
    p0 = (p0 ^ (p0 >> __sourceIntrinsic_5c51e7cdc795_originalDynamicSite1059_4(290, (3584215926454739259L ^ local1))));
    return p0;
}


public static int a(moom.DT p0, int p1) {
long local2 = (moom.BU.I ^ 134952709242845L);
    int local4 = moom.BU.a(((int)((p1 + __sourceIntrinsic_9da13ac3d70e_originalDynamicSite1060_1(7002, (6389784038977322259L ^ local2))))));
    local4 = moom.BU.a(((int)((local4 + ((moom.DT)(p0)).a()))));
    local4 = moom.BU.a(((int)((local4 + ((moom.DT)(p0)).c()))));
    local4 = moom.BU.a(((int)((local4 + ((moom.DT)(p0)).b()))));
    return local4;
}


public static boolean a(java.lang.Object p0, java.lang.Object p1) {
return (__sourceIntrinsic_booleanComparison((java.util.Objects.equals(((java.lang.Object)(p0)), ((java.lang.Object)(p1))))) != 0);
}


public static boolean a(java.lang.Object p0, java.lang.Object[] p1) { return __sourceHandlerCall_1323e7b5441c590cf4a6(p0, p1); }


public static byte[] a__ArrayByte(java.io.InputStream p0) throws java.io.IOException { return __sourceHandlerCall_e21040221d196a3e564f(p0); }


public static net.minecraft.client.settings.GameSettings a__pw() {
return moom.BU.m;
}


public static int a(java.lang.String p0, java.lang.String p1) { return __sourceHandlerCall_8ead7cc52d1c5afe553e(p0, p1); }


private static java.lang.String[] a__ArrayString(java.lang.String p0) { return __sourceHandlerCall_99ea8f04e7823b30c330(p0); }


public static java.lang.Object[] a(java.lang.Object[] p0, java.lang.Object p1, int p2) {
java.util.ArrayList local3 = new java.util.ArrayList(java.util.Arrays.asList(((java.lang.Object[])(p0))));
    ((java.util.List)(local3)).add(((int)(p2)), ((java.lang.Object)(p1)));
    java.lang.Object[] local4 = ((java.lang.Object[])(java.lang.reflect.Array.newInstance(((java.lang.Class)(((java.lang.Class)(((java.lang.Object)(p0)).getClass())).getComponentType())), ((int)(((java.util.List)(local3)).size())))));
    return ((java.util.List)(local3)).toArray(((java.lang.Object[])(local4)));
}


public static java.lang.Object[] a(java.lang.Object[] p0, java.lang.Object[] p1) { return __sourceHandlerCall_d4458255f123a8c62e95(p0, p1); }


public static java.lang.Object[] a(java.util.Collection p0, java.lang.Class p1) { return __sourceHandlerCall_62df1a9fa06b5b9bba30(p0, p1); }


public static void a(boolean p0) {
c = ((boolean)(p0));
    return;
}


public static boolean a(int p0, int[] p1) { return __sourceHandlerCall_b90c05afe68ffda83cd5(p0, p1); }


public static java.lang.String a(java.lang.String p0) { return __sourceHandlerCall_8c683d03e84ec72c34c2(p0); }


private static java.nio.ByteBuffer a__ByteBuffer(java.io.InputStream p0) throws java.io.IOException {
long local1 = (moom.BU.I ^ 45053889520796L);
    java.awt.image.BufferedImage local3 = javax.imageio.ImageIO.read(((java.io.InputStream)(p0)));
    int[] local4 = ((java.awt.image.BufferedImage)(local3)).getRGB(((int)(0)), ((int)(0)), ((int)(((java.awt.image.BufferedImage)(local3)).getWidth())), ((int)(((java.awt.image.BufferedImage)(local3)).getHeight())), ((int[])(null)), ((int)(0)), ((int)(((java.awt.image.BufferedImage)(local3)).getWidth())));
    java.nio.ByteBuffer local5 = java.nio.ByteBuffer.allocate(((int)((4 * (local4).length))));
    int[] local6 = local4;
    int local7 = (local6).length;
    int local8 = 0;
    while ((local8 < local7)) {
        int local9 = (local6)[local8];
        ((java.nio.ByteBuffer)(local5)).putInt(((int)(((local9 << __sourceIntrinsic_b501dfd6a8d4_invokedynamic3284_7(29368, (3290942023205801919L ^ local1))) | ((local9 >> __sourceIntrinsic_b501dfd6a8d4_invokedynamic3284_8(3860, (6518429864765993502L ^ local1))) & __sourceIntrinsic_b501dfd6a8d4_invokedynamic3284_9(7459, (6365675037351288891L ^ local1)))))));
        local8 += 1;
    }
    ((java.nio.ByteBuffer)(local5)).flip();
    return local5;
}


public static java.lang.Object[] a(java.lang.Object[] p0, java.lang.Object p1) { return __sourceHandlerCall_36611175fdb38afdba1b(p0, p1); }


public static java.io.InputStream a(moom.oR p0, moom.DD p1) throws java.io.IOException { return __sourceHandlerCall_d94953c03725c5c99985(p0, p1); }


public static java.io.InputStream a(moom.DD p0) throws java.io.IOException {
return moom.BU.a(((moom.oR)(((net.minecraft.client.Minecraft)(moom.BU.n)).a__oR())), ((moom.DD)(p0)));
}


public static moom.oR a__oR() {
return ((net.minecraft.client.Minecraft)(moom.BU.n)).a__oR();
}


public static net.minecraft.client.renderer.texture.TextureManager a__ok() {
return ((net.minecraft.client.Minecraft)(moom.BU.n)).a__ok();
}


public static net.minecraft.client.Minecraft a__fM() {
return moom.BU.n;
}


public static java.lang.String a(float[] p0, java.lang.String p1) { return __sourceHandlerCall_1fd2d0c1cf342304492d(p0, p1); }


public static java.lang.String[] a__ArrayString() {
try {
        if ((moom.BU.g == null)) {
        g = ((java.lang.String[])(moom.BU.b__ArrayString()));
    }
    } catch (java.lang.NumberFormatException caught_rethrow_0) {
        throw moom.BU.a(((java.lang.Throwable)(caught_rethrow_0)));
    }
    return moom.BU.g;
}


private static void a__Void(java.lang.String p0, int p1) { __sourceHandlerCall_defaa0296921ee71dbbd(p0, p1); }


public static float a() {
return ((java.lang.Float)(moom.BU.B)).floatValue();
}


public static void a__Void(java.lang.String p0) {
try {
        if (moom.BU.D) {
        ((org.apache.logging.log4j.Logger)(moom.BU.C)).info(((java.lang.String)(__sourceIntrinsic_e2d81269afae_invokedynamic1018_2(p0))));
    }
    } catch (java.lang.NumberFormatException caught_rethrow_0) {
        throw moom.BU.a(((java.lang.Throwable)(caught_rethrow_0)));
    }
    return;
}


public static boolean a__Boolean(moom.DD p0) { return __sourceHandlerCall_68b542428161d5fc9679(p0); }


public static net.minecraft.client.resources.IResource a__oQ(moom.DD p0) throws java.io.IOException {
return ((moom.oR)(((net.minecraft.client.Minecraft)(moom.BU.n)).a__oR())).a__oQ(((moom.DD)(p0)));
}


public static net.minecraft.client.resources.model.ModelManager a__pr() {
return ((net.minecraft.client.renderer.entity.RenderItem)(((net.minecraft.client.Minecraft)(moom.BU.n)).a__nv())).f;
}


public static java.lang.String a(java.util.List p0) {
return moom.BU.a(((java.util.List)(p0)), ((java.lang.String)(", ")));
}


public static float a(float p0) { return __sourceHandlerCall_a46d0ccfb86695b3d1c2(p0); }


public static double a(double p0, double p1, double p2) { return __sourceHandlerCall_bd30246adaf1b5295b0f(p0, p1, p2); }


public static float a(float p0, float p1, float p2) { return __sourceHandlerCall_39b7f402939bfb370140(p0, p1, p2); }


public static int a(int p0, int p1, int p2) { return __sourceHandlerCall_2f4ec36224961e9f035a(p0, p1, p2); }


public static java.lang.String a(float[] p0) {
return moom.BU.a(((float[])(p0)), ((java.lang.String)(", ")));
}


public static java.lang.String a(int[] p0, java.lang.String p1) { return __sourceHandlerCall_c6a09ce328f734a19c85(p0, p1); }


public static java.lang.String a(int[] p0) {
return moom.BU.a(((int[])(p0)), ((java.lang.String)(", ")));
}


public static java.lang.String a(java.lang.Object[] p0, java.lang.String p1) { return __sourceHandlerCall_63223da2a22b5df6960b(p0, p1); }


public static java.lang.String a(java.lang.Object[] p0) {
return moom.BU.a(((java.lang.Object[])(p0)), ((java.lang.String)(", ")));
}


private static moom.J5 a__J5() { return __sourceHandlerCall_58faa47097cea6374216(); }


public static java.lang.String a__String() {
return "OptiFine_1.8.9_HD_U_M5";
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral3857_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/BU"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public static net.minecraft.client.renderer.RenderGlobal a__lq() {
return ((net.minecraft.client.Minecraft)(moom.BU.n)).J;
}


public static net.minecraft.client.resources.IResourcePack a__oT(moom.DD p0) { return __sourceHandlerCall_fc0ecbc7e1bd4aea15ba(p0); }


public static moom.J5 a(java.lang.String p0, moom.J5 p1) { return __sourceHandlerCall_9720bb3a0a1b14d7cf4a(p0, p1); }


public static void a__Void() {
moom.BU.b__Void();
    moom.BU.h__Void();
    p = ((java.lang.Thread)(java.lang.Thread.currentThread()));
    moom.BU.d__Void();
    moom.MP.a(((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())));
    return;
}


public static boolean a__Boolean() {
return ((((moom.BU.k) ? 1 : 0)) != 0);
}


public static void a(net.minecraft.client.settings.GameSettings p0) { __sourceHandlerCall_61ccdc7a6fb14b97f391(p0); }


public static void a(long p0) {
try {
        java.lang.Thread.sleep(((long)(p0)));
    } catch (java.lang.InterruptedException caught2) {
        ((java.lang.InterruptedException)(caught2)).printStackTrace();
    }
    return;
}


public static int a__Int() {
long life0_3;
    java.lang.String[] life2_9;
    int life3_11;
    life0_3 = (moom.BU.I ^ 45900708335534L);
    if ((moom.BU.j < 0)) {
        life2_9 = moom.BU.a__ArrayString(((java.lang.String)("1.8.9")), ((java.lang.String)(".")));
        life3_11 = 0;
        if (((life2_9).length > 0)) {
        life3_11 = (life3_11 + (__sourceIntrinsic_0bbed5b41c99_invokedynamic3228_3(2555, (6943773169791524816L ^ life0_3)) * moom.BU.a(((java.lang.String)((life2_9)[0])), ((int)(0)))));
    }
        if (((life2_9).length > 1)) {
        life3_11 = (life3_11 + (__sourceIntrinsic_0bbed5b41c99_invokedynamic3228_5(3624, (3538256336912177174L ^ life0_3)) * moom.BU.a(((java.lang.String)((life2_9)[1])), ((int)(0)))));
    }
        if (((life2_9).length > 2)) {
        life3_11 = (life3_11 + moom.BU.a(((java.lang.String)((life2_9)[2])), ((int)(0))));
    }
        j = ((int)(life3_11));
    }
    return moom.BU.j;
}


public static boolean a__Boolean(moom.oR p0, moom.DD p1) { return __sourceHandlerCall_63aa09b4ab72412557d2(p0, p1); }


public static java.lang.String a(java.util.List p0, java.lang.String p1) { return __sourceHandlerCall_f3899c5971b4525b2080(p0, p1); }


public static moom.oK a__oK() {
net.minecraft.client.Minecraft life0_3;
    net.minecraft.client.resources.ResourcePackRepository life1_11;
    if ((moom.BU.A == null)) {
        life0_3 = net.minecraft.client.Minecraft.a__fM();
        A = ((moom.oK)(((net.minecraft.client.Minecraft)(life0_3)).k));
        if ((moom.BU.A == null)) {
        life1_11 = ((net.minecraft.client.Minecraft)(life0_3)).a__o1();
        try {
        if ((life1_11 != null)) {
        A = ((moom.oK)(((moom.oK)(((net.minecraft.client.resources.ResourcePackRepository)(life1_11)).d))));
    }
    } catch (java.lang.NumberFormatException caught_rethrow_0) {
        throw moom.BU.a(((java.lang.Throwable)(caught_rethrow_0)));
    }
    }
    }
    return moom.BU.A;
}


public static net.minecraft.client.resources.IResourcePack[] a__ArrayoT() {
net.minecraft.client.resources.ResourcePackRepository life0_2;
    java.util.List life1_5;
    java.util.ArrayList life2_9;
    java.util.Iterator life3_12;
    net.minecraft.client.resources.ResourcePackRepository$Entry life4_19;
    life0_2 = ((net.minecraft.client.Minecraft)(moom.BU.n)).a__o1();
    life1_5 = ((net.minecraft.client.resources.ResourcePackRepository)(life0_2)).c();
    life2_9 = new java.util.ArrayList();
    life3_12 = ((java.util.List)(life1_5)).iterator();
    loop_region_13: while (((java.util.Iterator)(life3_12)).hasNext()) {
        life4_19 = ((net.minecraft.client.resources.ResourcePackRepository$Entry)(((java.util.Iterator)(life3_12)).next()));
        ((java.util.List)(life2_9)).add(((java.lang.Object)(((net.minecraft.client.resources.ResourcePackRepository$Entry)(life4_19)).a__oT())));
    }
    try {
        if ((((net.minecraft.client.resources.ResourcePackRepository)(life0_2)).a__oT() != null)) {
        ((java.util.List)(life2_9)).add(((java.lang.Object)(((net.minecraft.client.resources.ResourcePackRepository)(life0_2)).a__oT())));
    }
    } catch (java.lang.NumberFormatException caught_rethrow_0) {
        throw moom.BU.a(((java.lang.Throwable)(caught_rethrow_0)));
    }
    return ((net.minecraft.client.resources.IResourcePack[])(((java.util.List)(life2_9)).toArray(((java.lang.Object[])(new net.minecraft.client.resources.IResourcePack[0])))));
}


public static boolean m() { return __sourceHandlerCall_9d05024c6fe55f58177b(); }


public static boolean o() { return __sourceHandlerCall_36ec1b492ef385b8ab91(); }


public static boolean p() { return __sourceHandlerCall_ebc985d4042c752a7ba4(); }


public static boolean k__Boolean() { return __sourceHandlerCall_45c93306dd05799646fa(); }


public static int k() { return __sourceHandlerCall_d7e041870cf103896c9a(); }


public static boolean t() { return __sourceHandlerCall_087deea038882de20706(); }


public static int g() {
return moom.BU.t;
}


public static void g__Void() {
t = ((int)(((java.lang.Runtime)(java.lang.Runtime.getRuntime())).availableProcessors()));
    return;
}


public static boolean g__Boolean() { return __sourceHandlerCall_a7a675a3c8b6fa4a0e67(); }


public static void g(java.lang.String p0) {
b = ((java.lang.String)(p0));
    return;
}


public static boolean v() { return __sourceHandlerCall_b310a090d243d38993ef(); }


public static void j__Void() {
long local0 = (moom.BU.I ^ 61362888913250L);
    int local2 = net.minecraft.client.Minecraft.b();
    java.lang.String local3 = moom.BU.b(((java.lang.String)(((net.minecraft.client.Minecraft)(moom.BU.n)).Z)));
    int local4 = ((net.minecraft.client.renderer.RenderGlobal)(((net.minecraft.client.Minecraft)(moom.BU.n)).J)).b();
    int local5 = ((net.minecraft.client.renderer.RenderGlobal)(((net.minecraft.client.Minecraft)(moom.BU.n)).J)).c();
    int local6 = ((net.minecraft.client.renderer.RenderGlobal)(((net.minecraft.client.Minecraft)(moom.BU.n)).J)).d();
    java.lang.String local7 = __sourceIntrinsic_d5dece98731f_originalDynamicSite1061_15(local2, moom.BU.i(), local4, local5, local6, local3);
    ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.Minecraft)(moom.BU.n)).N)).b(((java.lang.String)(local7)), ((float)(0x1.0p1f)), ((float)(0x1.0p1f)), ((int)(__sourceIntrinsic_d5dece98731f_originalDynamicSite1061_18(28927, (568483651741505550L ^ local0)))));
    return;
}


public static int j() { return __sourceHandlerCall_f63a8e583cc8c4c688f0(); }


public static boolean j__Boolean() {
return ((((((net.minecraft.client.settings.GameSettings)(moom.BU.m)).bu) ? 1 : 0)) != 0);
}


public static boolean q() { return __sourceHandlerCall_6294b8aa7e370a54c90b(); }


public static boolean ao() { return __sourceHandlerCall_b5c251bfe6ec2a3c993e(); }


public static boolean z() {
return ((((((net.minecraft.client.settings.GameSettings)(moom.BU.m)).bY) ? 1 : 0)) != 0);
}


public static boolean U() {
return ((((((net.minecraft.client.settings.GameSettings)(moom.BU.m)).bw) ? 1 : 0)) != 0);
}


public static boolean at() {
return ((((((net.minecraft.client.settings.GameSettings)(moom.BU.m)).bM) ? 1 : 0)) != 0);
}


public static boolean ak() { return __sourceHandlerCall_3906bf36985b99ecb80f(); }


public static boolean av() {
return ((((((net.minecraft.client.settings.GameSettings)(moom.BU.m)).bH) ? 1 : 0)) != 0);
}


public static boolean w() { return __sourceHandlerCall_62b07186cc8cfd45a12b(); }


public static boolean u() {
return ((((((net.minecraft.client.settings.GameSettings)(moom.BU.m)).bW) ? 1 : 0)) != 0);
}


public static boolean r() { return __sourceHandlerCall_eee5a344f03cefbbc5c3(); }


public static boolean as() {
return ((((((net.minecraft.client.settings.GameSettings)(moom.BU.m)).a9) ? 1 : 0)) != 0);
}


public static boolean y() {
return ((((((net.minecraft.client.settings.GameSettings)(moom.BU.m)).bX) ? 1 : 0)) != 0);
}


public static boolean E() {
return ((((((net.minecraft.client.settings.GameSettings)(moom.BU.m)).b3) ? 1 : 0)) != 0);
}


public static boolean az() { return __sourceHandlerCall_3a931c4ad6dcc2380982(); }


public static boolean ax() {
return ((0) != 0);
}


public static boolean ay() { return __sourceHandlerCall_b425f0735de2868ab1d6(); }


public static boolean A() {
return ((((((net.minecraft.client.settings.GameSettings)(moom.BU.m)).bZ) ? 1 : 0)) != 0);
}


public static boolean K() {
return ((((((net.minecraft.client.settings.GameSettings)(moom.BU.m)).bo) ? 1 : 0)) != 0);
}


public static boolean L() {
return ((((((net.minecraft.client.settings.GameSettings)(moom.BU.m)).bp) ? 1 : 0)) != 0);
}


public static boolean N() { return __sourceHandlerCall_148d31553da4840b347c(); }


public static boolean M() {
return ((((((net.minecraft.client.settings.GameSettings)(moom.BU.m)).br) ? 1 : 0)) != 0);
}


public static boolean P() { return __sourceHandlerCall_152ab6ef6f0ec75f33a4(); }


public static boolean an() { return __sourceHandlerCall_b85e37a12e519dadf63d(); }


public static boolean am() {
return ((((((net.minecraft.client.settings.GameSettings)(moom.BU.m)).bJ) ? 1 : 0)) != 0);
}


public static boolean ac() {
return ((((((net.minecraft.client.settings.GameSettings)(moom.BU.m)).b9) ? 1 : 0)) != 0);
}


public static boolean X() { return __sourceHandlerCall_24e0bfb382f874012324(); }


public static boolean Y() { return __sourceHandlerCall_7b1e0a1f11edc5ee8de0(); }


public static boolean aw() {
return ((((moom.BU.c) ? 1 : 0)) != 0);
}


public static boolean T() { return __sourceHandlerCall_751a154cbd5da6aac429(); }


public static boolean W() { return __sourceHandlerCall_013ed3c68e491e91c624(); }


public static boolean H() {
return ((((((net.minecraft.client.settings.GameSettings)(moom.BU.m)).b6) ? 1 : 0)) != 0);
}


public static boolean R() { return __sourceHandlerCall_3a74f30a4c73d8429888(); }


public static boolean al() {
return ((((((net.minecraft.client.settings.GameSettings)(moom.BU.m)).bI) ? 1 : 0)) != 0);
}


public static boolean ai() {
return ((((((net.minecraft.client.settings.GameSettings)(moom.BU.m)).bC) ? 1 : 0)) != 0);
}


public static boolean ab() {
return ((((((net.minecraft.client.settings.GameSettings)(moom.BU.m)).b8) ? 1 : 0)) != 0);
}


public static boolean aI() { return __sourceHandlerCall_0eaf27d24b03212362dc(); }


public static boolean aG() {
return ((((((net.minecraft.client.settings.GameSettings)(moom.BU.m)).bR) ? 1 : 0)) != 0);
}


public static boolean aq() { return __sourceHandlerCall_5d4e373fff0cf7dee937(); }


public static boolean Q() {
return ((((((net.minecraft.client.settings.GameSettings)(moom.BU.m)).bq) ? 1 : 0)) != 0);
}


public static boolean aj() {
return ((((((net.minecraft.client.settings.GameSettings)(moom.BU.m)).bF) ? 1 : 0)) != 0);
}


public static boolean ap() {
return ((((moom.MP.dV) ? 1 : 0)) != 0);
}


public static boolean aB() {
return ((((((net.minecraft.client.settings.GameSettings)(moom.BU.m)).bP) ? 1 : 0)) != 0);
}


public static boolean ag() {
return ((((((net.minecraft.client.settings.GameSettings)(moom.BU.m)).bD) ? 1 : 0)) != 0);
}


public static boolean aA() { return __sourceHandlerCall_8f082354f2808a4b0071(); }


public static boolean ah() {
return ((((((net.minecraft.client.settings.GameSettings)(moom.BU.m)).bE) ? 1 : 0)) != 0);
}


public static boolean aE() {
return (__sourceIntrinsic_booleanComparison((net.minecraft.client.renderer.OpenGlHelper.b__Boolean())) != 0);
}


public static boolean O() { return __sourceHandlerCall_054ff8c6ddeec0c2f03b(); }


public static boolean au() {
return ((((((net.minecraft.client.settings.GameSettings)(moom.BU.m)).bN) ? 1 : 0)) != 0);
}


public static boolean aa() {
return ((((((net.minecraft.client.settings.GameSettings)(moom.BU.m)).bx) ? 1 : 0)) != 0);
}


public static boolean aF() {
return ((((((net.minecraft.client.settings.GameSettings)(moom.BU.m)).a7) ? 1 : 0)) != 0);
}


public static boolean aD() {
return ((((((net.minecraft.client.settings.GameSettings)(moom.BU.m)).a_) ? 1 : 0)) != 0);
}


public static boolean G() {
return ((((((net.minecraft.client.settings.GameSettings)(moom.BU.m)).b5) ? 1 : 0)) != 0);
}


public static boolean af() {
return ((((((net.minecraft.client.settings.GameSettings)(moom.BU.m)).bB) ? 1 : 0)) != 0);
}


public static boolean ar() {
return ((((((net.minecraft.client.settings.GameSettings)(moom.BU.m)).a8) ? 1 : 0)) != 0);
}


public static boolean aH() { return __sourceHandlerCall_3f09b47494a7a5ccb408(); }


public static boolean aC() {
return ((((((net.minecraft.client.settings.GameSettings)(moom.BU.m)).bQ) ? 1 : 0)) != 0);
}


private static native <E extends Throwable> int __sourceIntrinsic_5c51e7cdc795_originalDynamicSite1059_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5c51e7cdc795_originalDynamicSite1059_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5c51e7cdc795_originalDynamicSite1059_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5c51e7cdc795_originalDynamicSite1059_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral3857_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_1005932d5821_invokedynamic3827_2(java.net.URI a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_1005932d5821_invokedynamic3827_7(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9da13ac3d70e_originalDynamicSite1060_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b501dfd6a8d4_invokedynamic3284_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b501dfd6a8d4_invokedynamic3284_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b501dfd6a8d4_invokedynamic3284_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0bbed5b41c99_invokedynamic3228_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0bbed5b41c99_invokedynamic3228_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e2d81269afae_invokedynamic1018_2(java.lang.String a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d1398b4921c0_invokedynamic1034_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_d09e7390a875_originalDynamicSite1055_1(java.lang.String a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_41b51cd99fcb_originalDynamicSite1056_1(java.lang.String a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9620d08a38fc_invokedynamic217_3(int a0, int a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_acbc417da872_originalDynamicSite1057_1(java.lang.String a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_965bda21d828_originalDynamicSite1058_4(int a0, int a1, int a2) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_d5dece98731f_originalDynamicSite1061_15(int a0, int a1, int a2, int a3, int a4, java.lang.String a5) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d5dece98731f_originalDynamicSite1061_18(int a0, long a1) throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
