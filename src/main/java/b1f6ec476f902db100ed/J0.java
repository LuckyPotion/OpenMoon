package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class J0 {

private java.lang.String a;

private java.lang.String b;

moom.DD c;

private int d;

private int e;

private int f;

private int g;

private int h;

private moom.J1[] i;

private int j;

private boolean k;

private int l;

private java.nio.ByteBuffer m;

byte[] n;

private java.nio.ByteBuffer o;

private boolean p;

private boolean q;

private static long r;

private static java.lang.String[] s;

private static java.lang.String[] t;

private static java.util.Map u;

private static long[] v;

private static java.lang.Integer[] w;

private static java.util.Map x;

public J0(java.lang.String p0, byte[] p1, java.lang.String p2, moom.DD p3, int p4, int p5, int p6, int p7, java.util.Properties p8) { super(); }


private static void __sourceConstructorBody_445de687b245ae44(moom.J0 receiver, java.lang.String p0, byte[] p1, java.lang.String p2, moom.DD p3, int p4, int p5, int p6, int p7, java.util.Properties p8) throws Throwable {

int forestValue399_127_0;

    java.lang.Object forestValue399_165_0;

    moom.J0 forestValue399_262_0;

    net.minecraft.entity.Entity[] spill399_0;

    int spill399_1;

    int spill399_2;

    int spill399_3;

    java.lang.Object spill399_4;

    java.util.Properties spill399_5;

    java.util.Properties spill399_6;

    java.util.Properties spill399_7;

    moom.J0 spill399_8;

    long life10_3;

    net.minecraft.entity.Entity[] life12_19;

    int life13_85;

    int life23_98;

    int life24_99;

    int life25_100;

    int life14_128;

    int life15_141;

    java.lang.String life15_168;

    int life16_174;

    int life17_180;

    java.lang.String life18_197;

    int life19_201;

    java.lang.String life20_213;

    int life21_219;

    moom.J1 life22_225;

    forest_join_265: {

    forest_join_262: {

    forest_join_256: {

    forest_join_234: {

    forest_join_165: {

    forest_join_158: {

    forest_join_127: {

    forest_join_120: {

    life10_3 = (moom.J0.r ^ 76317002680147L);

    moom.J0.__sourceConstructorInit_445de687b245ae44_0(((moom.J0)(receiver)));

    spill399_0 = moom.JM.b__Arrayr3();

    ((moom.J0)(receiver)).a = ((java.lang.String)(null));

    ((moom.J0)(receiver)).b = ((java.lang.String)(null));

    ((moom.J0)(receiver)).c = ((moom.DD)(null));

    ((moom.J0)(receiver)).d = ((int)(-1));

    life12_19 = spill399_0;

    ((moom.J0)(receiver)).e = ((int)(0));

    ((moom.J0)(receiver)).f = ((int)(0));

    ((moom.J0)(receiver)).g = ((int)(0));

    ((moom.J0)(receiver)).h = ((int)(0));

    ((moom.J0)(receiver)).i = ((moom.J1[])(null));

    ((moom.J0)(receiver)).j = ((int)(0));

    ((moom.J0)(receiver)).k = ((boolean)(false));

    ((moom.J0)(receiver)).l = ((int)(0));

    ((moom.J0)(receiver)).m = ((java.nio.ByteBuffer)(null));

    ((moom.J0)(receiver)).n = ((byte[])(null));

    ((moom.J0)(receiver)).o = ((java.nio.ByteBuffer)(null));

    ((moom.J0)(receiver)).p = ((boolean)(true));

    ((moom.J0)(receiver)).q = ((boolean)(true));

    ((moom.J0)(receiver)).a = ((java.lang.String)(p0));

    ((moom.J0)(receiver)).b = ((java.lang.String)(p2));

    ((moom.J0)(receiver)).c = ((moom.DD)(p3));

    ((moom.J0)(receiver)).e = ((int)(p4));

    ((moom.J0)(receiver)).f = ((int)(p5));

    ((moom.J0)(receiver)).g = ((int)(p6));

    ((moom.J0)(receiver)).h = ((int)(p7));

    life13_85 = ((p6 * p7) * 4);

    spill399_1 = ((p1).length % life13_85);

    if (!((life12_19 != null))) {

        forestValue399_127_0 = spill399_1;

        break forest_join_127;

    }

    if (!((spill399_1 != 0))) {

        break forest_join_120;

    }

    spill399_2 = (p1).length;

    spill399_3 = p6;

    life23_98 = p7;

    life24_99 = spill399_3;

    life25_100 = spill399_2;

    moom.BU.c(((java.lang.String)(__sourceIntrinsic_445de687b245ae44_invokedynamic399_30(__sourceIntrinsic_445de687b245ae44_invokedynamic399_27(17074, (6979697665167866834L ^ life10_3)), life25_100, __sourceIntrinsic_445de687b245ae44_invokedynamic399_28(15090, (3395609442513666964L ^ life10_3)), life24_99, __sourceIntrinsic_445de687b245ae44_invokedynamic399_29(12972, (7769938288736390091L ^ life10_3)), life23_98))));

    }

    ((moom.J0)(receiver)).n = ((byte[])(p1));

    forestValue399_127_0 = ((p1).length / life13_85);

    }

    life14_128 = forestValue399_127_0;

    spill399_4 = ((java.util.Properties)(p8)).get(((java.lang.Object)(__sourceIntrinsic_445de687b245ae44_invokedynamic399_33(5560, (8216082500614647002L ^ life10_3)))));

    if (!((life12_19 != null))) {

        forestValue399_165_0 = spill399_4;

        break forest_join_165;

    }

    if (!((spill399_4 != null))) {

        break forest_join_158;

    }

    life15_141 = 0;

    forest_cycle_140: while (true) {

    spill399_5 = p8;

    int __stackOp399_36_0 = life15_141;

    java.lang.String __stackOp399_36_1 = __sourceIntrinsic_445de687b245ae44_invokedynamic399_35(14368, (3590124626586878273L ^ life10_3));

    if (!((((java.util.Properties)(spill399_5)).get(((java.lang.Object)(__sourceIntrinsic_445de687b245ae44_invokedynamic399_37(__stackOp399_36_1, __stackOp399_36_0)))) != null))) {

        break forest_join_158;

    }

    life14_128 = (life15_141 + 1);

    life15_141 += 1;

    if (!((life12_19 == null))) {

        continue forest_cycle_140;

    }

    break forest_cycle_140;

    }

    }

    forestValue399_165_0 = ((java.util.Properties)(p8)).get(((java.lang.Object)(__sourceIntrinsic_445de687b245ae44_invokedynamic399_39(24809, (6261184654317721991L ^ life10_3)))));

    }

    life15_168 = ((java.lang.String)(forestValue399_165_0));

    life16_174 = java.lang.Math.max(((int)(moom.BU.a(((java.lang.String)(life15_168)), ((int)(1))))), ((int)(1)));

    ((moom.J0)(receiver)).i = ((moom.J1[])(new moom.J1[life14_128]));

    life17_180 = 0;

    forest_cycle_179: while (true) {

    if (!((life17_180 < (((moom.J0)(receiver)).i).length))) {

        break forest_join_234;

    }

    spill399_6 = p8;

    int __stackOp399_47_0 = life17_180;

    java.lang.String __stackOp399_47_1 = __sourceIntrinsic_445de687b245ae44_invokedynamic399_46(17606, (3790304249276808611L ^ life10_3));

    life18_197 = ((java.lang.String)(((java.util.Properties)(spill399_6)).get(((java.lang.Object)(__sourceIntrinsic_445de687b245ae44_invokedynamic399_48(__stackOp399_47_1, __stackOp399_47_0))))));

    life19_201 = moom.BU.a(((java.lang.String)(life18_197)), ((int)(life17_180)));

    spill399_7 = p8;

    int __stackOp399_53_0 = life17_180;

    java.lang.String __stackOp399_53_1 = __sourceIntrinsic_445de687b245ae44_invokedynamic399_52(124, (4532443220520073496L ^ life10_3));

    life20_213 = ((java.lang.String)(((java.util.Properties)(spill399_7)).get(((java.lang.Object)(__sourceIntrinsic_445de687b245ae44_invokedynamic399_54(__stackOp399_53_1, __stackOp399_53_0))))));

    life21_219 = java.lang.Math.max(((int)(moom.BU.a(((java.lang.String)(life20_213)), ((int)(life16_174))))), ((int)(1)));

    life22_225 = new moom.J1(life19_201, life21_219);

    (((moom.J0)(receiver)).i)[life17_180] = life22_225;

    life17_180 += 1;

    if (!((life12_19 != null))) {

        break forest_join_256;

    }

    if (!((life12_19 == null))) {

        continue forest_cycle_179;

    }

    break forest_cycle_179;

    }

    }

    ((moom.J0)(receiver)).k = ((boolean)(moom.BU.a(((java.lang.String)(((java.util.Properties)(p8)).getProperty(((java.lang.String)(__sourceIntrinsic_445de687b245ae44_invokedynamic399_60(17468, (2334028570818788691L ^ life10_3))))))), ((boolean)(false)))));

    ((moom.J0)(receiver)).l = ((int)(moom.BU.a(((java.lang.String)(((java.util.Properties)(p8)).getProperty(((java.lang.String)(__sourceIntrinsic_445de687b245ae44_invokedynamic399_64(22561, (3214400855239172418L ^ life10_3))))))), ((int)(0)))));

    }

    spill399_8 = receiver;

    if (!((life12_19 != null))) {

        forestValue399_262_0 = spill399_8;

        break forest_join_262;

    }

    if (!(((moom.J0)(spill399_8)).k)) {

        break forest_join_265;

    }

    forestValue399_262_0 = receiver;

    }

    ((moom.J0)(forestValue399_262_0)).m = ((java.nio.ByteBuffer)(net.minecraft.client.renderer.GLAllocation.a__ByteBuffer(((int)(life13_85)))));

    }

    return;

}



static {
r = ((long)(((moom._a)(moom._c.a(((long)(7383053341945218929L)), ((long)(-6017709132543778788L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(211766526268414L)))));
    u = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (moom.J0.r ^ 56707519479148L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill586_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill586_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill586_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill586_14 = new byte[8];
    (__sourceSpill586_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill586_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation586_16 = __sourceSpill586_14;
    ((javax.crypto.Cipher)(__sourceSpill586_11)).init(((int)(__sourceSpill586_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill586_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation586_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local20_life19 = new java.lang.String[10];
    int local18_life20 = 0;
    java.lang.String local17_life21;
    int local19_life23 = ((java.lang.String)((local17_life21 = "7ÎÖ¤q\034»\t\035õ¨p3&Ï½ýWb\035a\030ZÄ[°kä\0031(LÂ80FYa¯ªbþ¡¦y¬ $­XÝBw7·Ì6\005X²\024ot~\003è\fK\026¶õÔ\037ÂTu\020\000%á~iwåx¸\f¾lò7\020I ;Ûï+è_Fr\016¥Áv\020¢Ã¹\013\006/%Õ\\;O»s@»ìQoVÈ|¨ÊóþDp%aØØÂ¿Xú\032RpÇT­ê/<Æ\023O~Yj0¹\007\fÌ|a×W36\002]e0°\0347w|6\020=\005nV\rï\035&£åppót"))).length();
    int local16_life24 = 24;
    int local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill586_28 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill586_29 = local13_life9;
        byte[] local21_life31 = ((javax.crypto.Cipher)(__sourceSpill586_29)).doFinal(((byte[])(__sourceSpill586_28)));
        java.lang.String __sourceSpill586_34 = ((java.lang.String)(moom.J0.a(((byte[])(local21_life31))))).intern();
        java.lang.String[] __sourceSpill586_35 = local20_life19;
        int __sourceSpill586_36 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill586_35)[__sourceSpill586_36] = __sourceSpill586_34;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    local19_life23 = ((java.lang.String)((local17_life21 = "\025\006ì ­#îxö\t¥úùBrGÏ\005¨û\032V\006oÅ{\021\030 \016C©¹àe\005ÐH\003Ö¦E¬1àlÓ«D®÷0\177\bùºê\""))).length();
    local16_life24 = 32;
    local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill586_41 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill586_42 = local13_life9;
        byte[] local21_life44 = ((javax.crypto.Cipher)(__sourceSpill586_42)).doFinal(((byte[])(__sourceSpill586_41)));
        java.lang.String __sourceSpill586_47 = ((java.lang.String)(moom.J0.a(((byte[])(local21_life44))))).intern();
        java.lang.String[] __sourceSpill586_48 = local20_life19;
        int __sourceSpill586_49 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill586_48)[__sourceSpill586_49] = __sourceSpill586_47;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    s = ((java.lang.String[])(local20_life19));
    t = ((java.lang.String[])(new java.lang.String[10]));
    x = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life55;
    javax.crypto.Cipher __sourceSpill586_57 = (local0_life55 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill586_58 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill586_59 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill586_60 = new byte[8];
    (__sourceSpill586_60)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life61 = 1;
    while ((local1_life61 < 8)) {
        (__sourceSpill586_60)[local1_life61] = ((byte) ((int) ((local11_life7 << (local1_life61 * 8)) >>> 56)));
        local1_life61 += 1;
    }
    byte[] __sourcePreallocation586_62 = __sourceSpill586_60;
    ((javax.crypto.Cipher)(__sourceSpill586_57)).init(((int)(__sourceSpill586_58)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill586_59)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation586_62)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life65 = new long[8];
    int local3_life66 = 0;
    java.lang.String local4_life67;
    int local5_life69 = ((java.lang.String)((local4_life67 = "\016¦?#Ë\026õËÞ«\021ÓSµÖtYv\022\0364*jõk²ÁÆWÄ\027m°GfiªÎô\032à"))).length();
    int local2_life70 = 0;
    do {
        java.lang.String __sourceSpill586_71 = local4_life67;
        int __sourceSpill586_72 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill586_71)).substring(((int)(__sourceSpill586_72)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill586_76 = local6_life65;
        int __sourceSpill586_77 = local3_life66;
        local3_life66 += 1;
        long local8_life78 = (((((((((((long) (local7_life75)[0]) & 255L) << 56) | ((((long) (local7_life75)[1]) & 255L) << 48)) | ((((long) (local7_life75)[2]) & 255L) << 40)) | ((((long) (local7_life75)[3]) & 255L) << 32)) | ((((long) (local7_life75)[4]) & 255L) << 24)) | ((((long) (local7_life75)[5]) & 255L) << 16)) | ((((long) (local7_life75)[6]) & 255L) << 8)) | (((long) (local7_life75)[7]) & 255L));
        byte[] __sourceSpill586_79 = new byte[8];
        (__sourceSpill586_79)[0] = ((byte) ((int) (local8_life78 >>> 56)));
        (__sourceSpill586_79)[1] = ((byte) ((int) (local8_life78 >>> 48)));
        (__sourceSpill586_79)[2] = ((byte) ((int) (local8_life78 >>> 40)));
        (__sourceSpill586_79)[3] = ((byte) ((int) (local8_life78 >>> 32)));
        (__sourceSpill586_79)[4] = ((byte) ((int) (local8_life78 >>> 24)));
        (__sourceSpill586_79)[5] = ((byte) ((int) (local8_life78 >>> 16)));
        (__sourceSpill586_79)[6] = ((byte) ((int) (local8_life78 >>> 8)));
        (__sourceSpill586_79)[7] = ((byte) ((int) local8_life78));
        javax.crypto.Cipher __sourceSpill586_80 = local0_life55;
        byte[] local10_life82 = ((javax.crypto.Cipher)(__sourceSpill586_80)).doFinal(((byte[])(__sourceSpill586_79)));
        (__sourceSpill586_76)[__sourceSpill586_77] = (((((((((((long) (local10_life82)[0]) & 255L) << 56) | ((((long) (local10_life82)[1]) & 255L) << 48)) | ((((long) (local10_life82)[2]) & 255L) << 40)) | ((((long) (local10_life82)[3]) & 255L) << 32)) | ((((long) (local10_life82)[4]) & 255L) << 24)) | ((((long) (local10_life82)[5]) & 255L) << 16)) | ((((long) (local10_life82)[6]) & 255L) << 8)) | (((long) (local10_life82)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    local5_life69 = ((java.lang.String)((local4_life67 = "9>\f~\032KëlÞÚ1;t=ò)"))).length();
    local2_life70 = 0;
    do {
        java.lang.String __sourceSpill586_84 = local4_life67;
        int __sourceSpill586_85 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life88 = ((java.lang.String)(((java.lang.String)(__sourceSpill586_84)).substring(((int)(__sourceSpill586_85)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill586_89 = local6_life65;
        int __sourceSpill586_90 = local3_life66;
        local3_life66 += 1;
        long local8_life91 = (((((((((((long) (local7_life88)[0]) & 255L) << 56) | ((((long) (local7_life88)[1]) & 255L) << 48)) | ((((long) (local7_life88)[2]) & 255L) << 40)) | ((((long) (local7_life88)[3]) & 255L) << 32)) | ((((long) (local7_life88)[4]) & 255L) << 24)) | ((((long) (local7_life88)[5]) & 255L) << 16)) | ((((long) (local7_life88)[6]) & 255L) << 8)) | (((long) (local7_life88)[7]) & 255L));
        byte[] __sourceSpill586_92 = new byte[8];
        (__sourceSpill586_92)[0] = ((byte) ((int) (local8_life91 >>> 56)));
        (__sourceSpill586_92)[1] = ((byte) ((int) (local8_life91 >>> 48)));
        (__sourceSpill586_92)[2] = ((byte) ((int) (local8_life91 >>> 40)));
        (__sourceSpill586_92)[3] = ((byte) ((int) (local8_life91 >>> 32)));
        (__sourceSpill586_92)[4] = ((byte) ((int) (local8_life91 >>> 24)));
        (__sourceSpill586_92)[5] = ((byte) ((int) (local8_life91 >>> 16)));
        (__sourceSpill586_92)[6] = ((byte) ((int) (local8_life91 >>> 8)));
        (__sourceSpill586_92)[7] = ((byte) ((int) local8_life91));
        javax.crypto.Cipher __sourceSpill586_93 = local0_life55;
        byte[] local10_life95 = ((javax.crypto.Cipher)(__sourceSpill586_93)).doFinal(((byte[])(__sourceSpill586_92)));
        (__sourceSpill586_89)[__sourceSpill586_90] = (((((((((((long) (local10_life95)[0]) & 255L) << 56) | ((((long) (local10_life95)[1]) & 255L) << 48)) | ((((long) (local10_life95)[2]) & 255L) << 40)) | ((((long) (local10_life95)[3]) & 255L) << 32)) | ((((long) (local10_life95)[4]) & 255L) << 24)) | ((((long) (local10_life95)[5]) & 255L) << 16)) | ((((long) (local10_life95)[6]) & 255L) << 8)) | (((long) (local10_life95)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    v = ((long[])(local6_life65));
    w = ((java.lang.Integer[])(new java.lang.Integer[8]));
}

private static native <E extends Throwable> void __sourceConstructorInit_445de687b245ae44_0(moom.J0 a0) throws E;

public java.lang.String b() {
return this.b;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4975_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/J0"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public boolean b__Boolean() {
return ((((this.p) ? 1 : 0)) != 0);
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.J0.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x2B9A;
        if (w[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = v[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])x.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    x.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/J0", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            J0.w[n2] = n4;
        }
        return w[n2];
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral4976_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/J0"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.J0.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.String a(int p0, long p1) {
int life5_8;
    java.lang.Long life3_16;
    java.lang.Object[] life4_21;
    byte[] life6_60;
    int life7_70;
    javax.crypto.spec.DESKeySpec life7_92;
    javax.crypto.SecretKey life8_99;
    byte[] life9_116;
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 28158);
    if (((moom.J0.t)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.J0.u)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.J0.u)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/J0", life9_51);
    }
        life6_60 = new byte[8];
        (life6_60)[0] = ((byte) ((int) (p1 >>> 56)));
        life7_70 = 1;
        loop_region_71: while ((life7_70 < 8)) {
        (life6_60)[life7_70] = ((byte) ((int) ((p1 << (life7_70 * 8)) >>> 56)));
        life7_70 += 1;
    }
        life7_92 = new javax.crypto.spec.DESKeySpec(life6_60);
        life8_99 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life4_21)[1])))).generateSecret(((java.security.spec.KeySpec)(life7_92)));
        ((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).init(((int)(2)), ((java.security.Key)(life8_99)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life4_21)[2])))));
        life9_116 = ((java.lang.String)((moom.J0.s)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.J0.t)[life5_8] = moom.J0.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.J0.t)[life5_8];
}


private static java.lang.String a(byte[] p0) {
int life1_1;
    int life2_5;
    char[] life3_7;
    int life4_9;
    int life5_19;
    int life6_39;
    int life5_44;
    int life6_52;
    int life6_71;
    int life5_76;
    int life6_86;
    int life5_91;
    int life6_99;
    life1_1 = 0;
    life3_7 = new char[(life2_5 = (p0).length)];
    life4_9 = 0;
    loop_region_10: while ((life4_9 < life2_5)) {
        if (((life5_19 = (255 & (p0)[life4_9])) < 192)) {
        (life3_7)[(life1_1++)] = ((char) life5_19);
    } else {
        if ((life5_19 < 224)) {
        life6_39 = ((int)(((char) (((char) (life5_19 & 31)) << 6))));
        byte[] spill2577_0 = p0;
        life4_9 += 1;
        life5_44 = (spill2577_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill2577_1 = p0;
        life4_9 += 1;
        life5_76 = (spill2577_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill2577_2 = p0;
        life4_9 += 1;
        life5_91 = (spill2577_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


public moom.J1 a__J1() {
return ((moom.J0)(this)).a(((int)(this.j)));
}


public boolean a__Boolean() {
moom.J1 forwardValue2226_22_0;
    int forwardValue2226_47_0;
    int forwardValue2226_47_1;
    int forwardValue2226_52_0;
    net.minecraft.entity.Entity[] spill2226_0;
    moom.J1 spill2226_1;
    int spill2226_2;
    int spill2226_3;
    int spill2226_4;
    long life1_3;
    moom.J1 life4_7;
    net.minecraft.entity.Entity[] life3_8;
    forward_join_52: {
    forward_join_51: {
    forward_join_47: {
    forward_join_31: {
    forward_join_22: {
    forward_join_15: {
    life1_3 = (moom.J0.r ^ 65063804120991L);
    spill2226_0 = moom.JM.b__Arrayr3();
    life4_7 = ((moom.J0)(this)).a__J1();
    life3_8 = spill2226_0;
    spill2226_1 = life4_7;
    if (!((life3_8 != null))) {
        forwardValue2226_22_0 = spill2226_1;
        break forward_join_22;
    }
    if (!((spill2226_1 == null))) {
        break forward_join_15;
    }
    return ((0) != 0);
    }
    moom.J1 __stackOp2226_4_0 = life4_7;
    ((moom.J1)(__stackOp2226_4_0)).c = ((int)((((moom.J1)(__stackOp2226_4_0)).c + 1)));
    forwardValue2226_22_0 = life4_7;
    }
    spill2226_2 = ((moom.J1)(forwardValue2226_22_0)).c;
    spill2226_3 = ((moom.J1)(life4_7)).b;
    if (!((life3_8 != null))) {
        forwardValue2226_47_0 = spill2226_2;
        forwardValue2226_47_1 = spill2226_3;
        break forward_join_47;
    }
    if (!((spill2226_2 < spill2226_3))) {
        break forward_join_31;
    }
    return this.k;
    }
    ((moom.J1)(life4_7)).c = ((int)(0));
    moom.J0 __stackOp2226_11_0 = this;
    ((moom.J0)(__stackOp2226_11_0)).j = ((int)((((moom.J0)(__stackOp2226_11_0)).j + 1)));
    spill2226_4 = this.j;
    if (!((life3_8 != null))) {
        forwardValue2226_52_0 = spill2226_4;
        break forward_join_52;
    }
    forwardValue2226_47_0 = spill2226_4;
    forwardValue2226_47_1 = (this.i).length;
    }
    if (!((forwardValue2226_47_0 >= forwardValue2226_47_1))) {
        break forward_join_51;
    }
    this.j = ((int)(0));
    }
    forwardValue2226_52_0 = 1;
    }
    return ((forwardValue2226_52_0) != 0);
}


public moom.DD a__DD() {
return this.c;
}


public void a__Void() {
int forwardValue2227_15_0;
    moom.J0 forwardValue2227_33_0;
    moom.J0 forwardValue2227_57_0;
    moom.J0 forwardValue2227_67_0;
    moom.J0 forwardValue2227_68_0;
    int forwardValue2227_68_1;
    moom.J0 forwardValue2227_69_0;
    moom.J0 forwardValue2227_70_0;
    int forwardValue2227_70_1;
    int forwardValue2227_78_0;
    int forwardValue2227_88_0;
    int forwardValue2227_110_0;
    moom.J0 forwardValue2227_133_0;
    moom.J1 forwardValue2227_138_0;
    int forwardValue2227_167_0;
    boolean spill2227_0;
    moom.J0 spill2227_1;
    boolean spill2227_2;
    boolean spill2227_3;
    boolean spill2227_4;
    int spill2227_5;
    int spill2227_6;
    moom.J0 spill2227_7;
    moom.J1 spill2227_8;
    int spill2227_9;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    net.minecraft.client.renderer.texture.ITextureObject life4_28;
    int life4_130;
    moom.J1 life5_133;
    int life6_140;
    moom.J1 life7_210;
    double life8_218;
    forward_join_189: {
    forward_join_167: {
    forward_join_154: {
    forward_join_138: {
    forward_join_133: {
    forward_join_132: {
    forward_join_110: {
    forward_join_88: {
    forward_join_78: {
    forward_join_70: {
    forward_join_69: {
    forward_join_68: {
    forward_join_67: {
    forward_join_57: {
    forward_join_56: {
    forward_join_33: {
    forward_join_32: {
    forward_join_28: {
    forward_join_27: {
    forward_join_15: {
    life1_3 = (moom.J0.r ^ 127569821825818L);
    life3_5 = moom.JM.b__Arrayr3();
    spill2227_0 = this.q;
    if (!((life3_5 != null))) {
        forwardValue2227_15_0 = ((spill2227_0) ? 1 : 0);
        break forward_join_15;
    }
    if (!(spill2227_0)) {
        break forward_join_189;
    }
    spill2227_1 = this;
    if (!((life3_5 != null))) {
        forwardValue2227_33_0 = spill2227_1;
        break forward_join_33;
    }
    forwardValue2227_15_0 = ((moom.J0)(spill2227_1)).d;
    }
    if (!((forwardValue2227_15_0 < 0))) {
        break forward_join_32;
    }
    life4_28 = moom.Oc.a(((moom.DD)(this.c)));
    if (!((life3_5 != null))) {
        break forward_join_27;
    }
    if (!((life4_28 == null))) {
        break forward_join_28;
    }
    this.q = ((boolean)(false));
    }
    return;
    }
    this.d = ((int)(((net.minecraft.client.renderer.texture.ITextureObject)(life4_28)).a()));
    }
    forwardValue2227_33_0 = this;
    }
    if (!((life3_5 != null))) {
        forwardValue2227_57_0 = forwardValue2227_33_0;
        break forward_join_57;
    }
    if (!((((moom.J0)(forwardValue2227_33_0)).o == null))) {
        break forward_join_56;
    }
    this.o = ((java.nio.ByteBuffer)(net.minecraft.client.renderer.GLAllocation.a__ByteBuffer(((int)((this.n).length)))));
    ((java.nio.ByteBuffer)(this.o)).put(((byte[])(this.n)));
    ((java.nio.ByteBuffer)(this.o)).flip();
    this.n = ((byte[])(null));
    }
    forwardValue2227_57_0 = this;
    }
    spill2227_2 = moom.JY.a__Boolean();
    if (!((life3_5 != null))) {
        forwardValue2227_68_0 = forwardValue2227_57_0;
        forwardValue2227_68_1 = ((spill2227_2) ? 1 : 0);
        break forward_join_68;
    }
    if (!(spill2227_2)) {
        forwardValue2227_67_0 = forwardValue2227_57_0;
        break forward_join_67;
    }
    spill2227_3 = moom.JY.b__Boolean(((int)(this.d)));
    if (!((life3_5 != null))) {
        forwardValue2227_68_0 = forwardValue2227_57_0;
        forwardValue2227_68_1 = ((spill2227_3) ? 1 : 0);
        break forward_join_68;
    }
    if (!(spill2227_3)) {
        forwardValue2227_69_0 = forwardValue2227_57_0;
        break forward_join_69;
    }
    forwardValue2227_67_0 = forwardValue2227_57_0;
    }
    forwardValue2227_68_0 = forwardValue2227_67_0;
    forwardValue2227_68_1 = 1;
    }
    forwardValue2227_70_0 = forwardValue2227_68_0;
    forwardValue2227_70_1 = forwardValue2227_68_1;
    break forward_join_70;
    }
    forwardValue2227_70_0 = forwardValue2227_69_0;
    forwardValue2227_70_1 = 0;
    }
    ((moom.J0)(forwardValue2227_70_0)).p = ((boolean)__sourceIntrinsic_integerToBoolean((forwardValue2227_70_1)));
    spill2227_4 = ((moom.J0)(this)).a__Boolean();
    if (!((life3_5 != null))) {
        forwardValue2227_78_0 = ((spill2227_4) ? 1 : 0);
        break forward_join_78;
    }
    if (!(spill2227_4)) {
        break forward_join_189;
    }
    forwardValue2227_78_0 = ((this.p) ? 1 : 0);
    }
    if (!((life3_5 != null))) {
        forwardValue2227_88_0 = forwardValue2227_78_0;
        break forward_join_88;
    }
    if (!((forwardValue2227_78_0 != 0))) {
        break forward_join_189;
    }
    forwardValue2227_88_0 = ((this.g * this.h) * 4);
    }
    life4_130 = forwardValue2227_88_0;
    life5_133 = ((moom.J0)(this)).a__J1();
    if (!((life5_133 != null))) {
        break forward_join_189;
    }
    life6_140 = (life4_130 * ((moom.J1)(life5_133)).a);
    spill2227_5 = (life6_140 + life4_130);
    if (!((life3_5 != null))) {
        forwardValue2227_110_0 = spill2227_5;
        break forward_join_110;
    }
    if (!((spill2227_5 <= ((java.nio.ByteBuffer)(this.o)).limit()))) {
        break forward_join_189;
    }
    forwardValue2227_110_0 = ((this.k) ? 1 : 0);
    }
    if (!((life3_5 != null))) {
        forwardValue2227_167_0 = forwardValue2227_110_0;
        break forward_join_167;
    }
    if (!((forwardValue2227_110_0 != 0))) {
        break forward_join_154;
    }
    spill2227_6 = ((moom.J1)(life5_133)).c;
    if (!((life3_5 != null))) {
        forwardValue2227_167_0 = spill2227_6;
        break forward_join_167;
    }
    if (!((spill2227_6 > 0))) {
        break forward_join_154;
    }
    spill2227_7 = this;
    if (!((life3_5 != null))) {
        forwardValue2227_133_0 = spill2227_7;
        break forward_join_133;
    }
    if (!((((moom.J0)(spill2227_7)).l > 1))) {
        break forward_join_132;
    }
    spill2227_8 = life5_133;
    if (!((life3_5 != null))) {
        forwardValue2227_138_0 = spill2227_8;
        break forward_join_138;
    }
    if (!(((((moom.J1)(spill2227_8)).c % this.l) == 0))) {
        break forward_join_189;
    }
    }
    forwardValue2227_133_0 = this;
    }
    forwardValue2227_138_0 = ((moom.J0)(forwardValue2227_133_0)).a(((int)((this.j + 1))));
    }
    life7_210 = forwardValue2227_138_0;
    life8_218 = (((double) ((moom.J1)(life5_133)).c) / ((double) ((moom.J1)(life5_133)).b));
    ((moom.J0)(this)).a(((moom.J1)(life5_133)), ((moom.J1)(life7_210)), ((double)(life8_218)));
    if (!((life3_5 == null))) {
        break forward_join_189;
    }
    }
    ((java.nio.ByteBuffer)(this.o)).position(((int)(life6_140)));
    spill2227_9 = 13391;
    moom.kZ.i(((int)(this.d)));
    forwardValue2227_167_0 = __sourceIntrinsic_b82a5b29b709_invokedynamic2227_51(spill2227_9, (2755599465410836227L ^ life1_3));
    }
    org.lwjgl.opengl.GL11.glTexSubImage2D(((int)(forwardValue2227_167_0)), ((int)(0)), ((int)(this.e)), ((int)(this.f)), ((int)(this.g)), ((int)(this.h)), ((int)(__sourceIntrinsic_b82a5b29b709_invokedynamic2227_56(14015, (5896543611505325553L ^ life1_3)))), ((int)(__sourceIntrinsic_b82a5b29b709_invokedynamic2227_57(22130, (6780069116537263423L ^ life1_3)))), ((java.nio.ByteBuffer)(this.o)));
    }
    return;
}


private void a(moom.J1 p0, moom.J1 p1, double p2) {
int lexicalValue804_31_0;
    int lexicalValue804_31_1;
    int lexicalValue804_47_0;
    net.minecraft.entity.Entity[] spill804_0;
    int spill804_1;
    int spill804_2;
    int spill804_3;
    long life5_3;
    int life8_12;
    int life9_17;
    net.minecraft.entity.Entity[] life7_18;
    int life10_38;
    int life11_59;
    int life12_75;
    int life13_88;
    int life14_94;
    int life15_97;
    lexical_join_130: {
    lexical_join_103: {
    lexical_join_96: {
    lexical_join_47: {
    lexical_join_31: {
    life5_3 = (moom.J0.r ^ 61914384241308L);
    spill804_0 = moom.JM.b__Arrayr3();
    life8_12 = ((this.g * this.h) * 4);
    life9_17 = (life8_12 * ((moom.J1)(p0)).a);
    life7_18 = spill804_0;
    spill804_1 = (life9_17 + life8_12);
    spill804_2 = ((java.nio.ByteBuffer)(this.o)).limit();
    if (!((life7_18 != null))) {
        lexicalValue804_31_0 = spill804_1;
        lexicalValue804_31_1 = spill804_2;
        break lexical_join_31;
    }
    if (!((spill804_1 <= spill804_2))) {
        break lexical_join_130;
    }
    lexicalValue804_31_0 = life8_12;
    lexicalValue804_31_1 = ((moom.J1)(p1)).a;
    }
    life10_38 = (lexicalValue804_31_0 * lexicalValue804_31_1);
    spill804_3 = (life10_38 + life8_12);
    if (!((life7_18 != null))) {
        lexicalValue804_47_0 = spill804_3;
        break lexical_join_47;
    }
    if (!((spill804_3 <= ((java.nio.ByteBuffer)(this.o)).limit()))) {
        break lexical_join_130;
    }
    ((java.nio.ByteBuffer)(this.m)).clear();
    lexicalValue804_47_0 = 0;
    }
    life11_59 = lexicalValue804_47_0;
    lexical_cycle_48: while (true) {
    if (!((life11_59 < life8_12))) {
        break lexical_join_96;
    }
    life12_75 = (((java.nio.ByteBuffer)(this.o)).get(((int)((life9_17 + life11_59)))) & __sourceIntrinsic_237dd859d65d_invokedynamic804_14(12605, (5037486467705854960L ^ life5_3)));
    life13_88 = (((java.nio.ByteBuffer)(this.o)).get(((int)((life10_38 + life11_59)))) & __sourceIntrinsic_237dd859d65d_invokedynamic804_17(31330, (6222321079912304814L ^ life5_3)));
    life14_94 = ((moom.J0)(this)).a(((int)(life12_75)), ((int)(life13_88)), ((double)(p2)));
    life15_97 = ((byte) life14_94);
    ((java.nio.ByteBuffer)(this.m)).put(((byte)(life15_97)));
    life11_59 += 1;
    if (!((life7_18 != null))) {
        break lexical_join_103;
    }
    if (!((life7_18 == null))) { continue lexical_cycle_48; }
    break lexical_cycle_48;
    }
    }
    ((java.nio.ByteBuffer)(this.m)).flip();
    moom.kZ.i(((int)(this.d)));
    }
    org.lwjgl.opengl.GL11.glTexSubImage2D(((int)(__sourceIntrinsic_237dd859d65d_invokedynamic804_25(28778, (3729612575206513316L ^ life5_3)))), ((int)(0)), ((int)(this.e)), ((int)(this.f)), ((int)(this.g)), ((int)(this.h)), ((int)(__sourceIntrinsic_237dd859d65d_invokedynamic804_30(6891, (3696838475704660004L ^ life5_3)))), ((int)(__sourceIntrinsic_237dd859d65d_invokedynamic804_31(10273, (1115151816718762728L ^ life5_3)))), ((java.nio.ByteBuffer)(this.m)));
    }
    return;
}


public java.lang.String a__String() {
return this.a;
}


private int a(int p0, int p1, double p2) {
return ((int) ((((double) p0) * (0x1.0p0d - p2)) + (((double) p1) * p2)));
}


public int a() {
return (this.i).length;
}


public moom.J1 a(int p0) {
int forwardValue2224_15_0;
    int forwardValue2224_26_0;
    int spill2224_0;
    int spill2224_1;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_27: {
    forward_join_26: {
    forward_join_25: {
    forward_join_15: {
    forward_join_14: {
    life2_3 = (moom.J0.r ^ 28819441135682L);
    life4_5 = moom.JM.b__Arrayr3();
    spill2224_0 = (this.i).length;
    if (!((life4_5 != null))) {
        forwardValue2224_15_0 = spill2224_0;
        break forward_join_15;
    }
    if (!((spill2224_0 == 0))) {
        break forward_join_14;
    }
    return null;
    }
    forwardValue2224_15_0 = p0;
    }
    if (!((life4_5 != null))) {
        forwardValue2224_26_0 = forwardValue2224_15_0;
        break forward_join_26;
    }
    if (!((forwardValue2224_15_0 >= 0))) {
        break forward_join_25;
    }
    spill2224_1 = p0;
    if (!((life4_5 != null))) {
        forwardValue2224_26_0 = spill2224_1;
        break forward_join_26;
    }
    if (!((spill2224_1 >= (this.i).length))) {
        break forward_join_27;
    }
    }
    forwardValue2224_26_0 = 0;
    }
    p0 = forwardValue2224_26_0;
    }
    return (this.i)[p0];
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_445de687b245ae44_invokedynamic399_27(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_445de687b245ae44_invokedynamic399_28(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_445de687b245ae44_invokedynamic399_29(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_445de687b245ae44_invokedynamic399_30(java.lang.String a0, int a1, java.lang.String a2, int a3, java.lang.String a4, int a5) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_445de687b245ae44_invokedynamic399_33(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_445de687b245ae44_invokedynamic399_35(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_445de687b245ae44_invokedynamic399_37(java.lang.String a0, int a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_445de687b245ae44_invokedynamic399_39(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_445de687b245ae44_invokedynamic399_46(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_445de687b245ae44_invokedynamic399_48(java.lang.String a0, int a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_445de687b245ae44_invokedynamic399_52(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_445de687b245ae44_invokedynamic399_54(java.lang.String a0, int a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_445de687b245ae44_invokedynamic399_60(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_445de687b245ae44_invokedynamic399_64(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral4976_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_237dd859d65d_invokedynamic804_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_237dd859d65d_invokedynamic804_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_237dd859d65d_invokedynamic804_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_237dd859d65d_invokedynamic804_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_237dd859d65d_invokedynamic804_31(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic2227_51(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic2227_56(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic2227_57(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4975_0() throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
