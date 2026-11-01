package moom;


public class Kh {

private static boolean a;

private static java.util.Map<java.lang.Class, net.minecraft.client.renderer.entity.Render> b;

private static java.util.Map<java.lang.Class, net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer> c;

private static long d;

private static java.lang.String[] e;

private static java.lang.String[] f;

private static java.util.Map g;

public Kh() {
super();
}


static {
d = ((long)(((moom._a)(moom._c.a(((long)(4626525924419469557L)), ((long)(-8896524691498521144L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(255459904753766L)))));
    g = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.Kh.d ^ 24633861769534L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill779_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill779_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill779_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill779_14 = new byte[8];
    (__sourceSpill779_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill779_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation779_16 = __sourceSpill779_14;
    ((javax.crypto.Cipher)(__sourceSpill779_11)).init(((int)(__sourceSpill779_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill779_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation779_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local9_life19 = new java.lang.String[13];
    int local7_life20 = 0;
    java.lang.String local6_life21;
    int local8_life23 = ((java.lang.String)((local6_life21 = "«¿Æoh¬&Êæ'\013YÒ![Â$h¥Ýtã+K\027\nô\013Ä\004ÜÒ\026âÕ ÉV³-Eó´\030Nh\022x¿L[ø'hé\027Lf\nc\"É8\000å\nùÖ 'Zvj©\0310)\031ÏQîJÑ^\007\020Ãyãò)í \\Ëï=\003uÏ\024\\!fë·Ni\bÀÌbjÙ hõÅdºaçèáâÉ&ýôF\021Ò lÐ¶¤E\004xÓñ¿(Ñ2ÄùðqêC¦F1\"¬Ï¨ÖÅ¶¡eåÌI\006êWæN>Ý\006c\033\000`éÖ{Ã<ýÁô[YXÍÃhÕsýÒ&\002¹\004 aæofñR-×ÿ\022úOé\021(E¡'Ç`âÀ®ÐÕÜ(OV\005àÔ¿îò1EÊñé\003¼×\nVúÍ\035½¿'\000\rð>båY§m\f­\020é(q{ö\020©ö\bbç¢\003@\030B%A5VXøÑ\"{ZêÛ\027!¶ÉçpÎ\003Î\rIÎÉÈW¨*Fí?MQæáßÅ\004BPË=%o\bF§^\035\b\037ÑÔ\020»³&\016\013<³yO³Í×Ø\"ûÓaºÆÈ\"¥YXWZòj¬ \006ÝõDÆ°\030#)Ú\t,DWÖ\031vx=.NË E³»TÏ(\"r[\\9\0258\n5®×¿uù¦Ùà «Ó¿â'µTº\007à9déÌ6Ù\021~Nâ\016ÔÂwóm¡%±¤°µ¢\001È¸®\0204Ð7·êììN9IJ<ÝÙ¸ÿ"))).length();
    int local5_life24 = 40;
    int local4_life25 = -1;
    while (true) {
        local4_life25 += 1;
        byte[] __sourceSpill779_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill779_29 = local2_life9;
        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill779_29)).doFinal(((byte[])(__sourceSpill779_28)));
        java.lang.String __sourceSpill779_34 = ((java.lang.String)(moom.Kh.a(((byte[])(local10_life31))))).intern();
        java.lang.String[] __sourceSpill779_35 = local9_life19;
        int __sourceSpill779_36 = local7_life20;
        local7_life20 += 1;
        (__sourceSpill779_35)[__sourceSpill779_36] = __sourceSpill779_34;
        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }
        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));
    }
    local8_life23 = ((java.lang.String)((local6_life21 = " ô8DÉ¢\027PQ!cÈ\030\026\036­íZ6ÄÓ=\004(\003°¼:bm\017ÜtÌ\r\030ø&Ý+·\004\036æ¡Æý*][;u½C¶êª\"@¢å"))).length();
    local5_life24 = 24;
    local4_life25 = -1;
    while (true) {
        local4_life25 += 1;
        byte[] __sourceSpill779_42 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill779_43 = local2_life9;
        byte[] local10_life45 = ((javax.crypto.Cipher)(__sourceSpill779_43)).doFinal(((byte[])(__sourceSpill779_42)));
        java.lang.String __sourceSpill779_48 = ((java.lang.String)(moom.Kh.a(((byte[])(local10_life45))))).intern();
        java.lang.String[] __sourceSpill779_49 = local9_life19;
        int __sourceSpill779_50 = local7_life20;
        local7_life20 += 1;
        (__sourceSpill779_49)[__sourceSpill779_50] = __sourceSpill779_48;
        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }
        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));
    }
    e = ((java.lang.String[])(local9_life19));
    f = ((java.lang.String[])(new java.lang.String[13]));
    a = ((boolean)(false));
    b = ((java.util.Map)(null));
    c = ((java.util.Map)(null));
}

private static native <E extends Throwable> moom.Kl __sourceHandlerCall_226bdc215e15979c0f4f(moom.DD a0) throws E;
private static final class __SourceHandler_226bdc215e15979c0f4f {

public static moom.Kl f136(moom.DD p0) throws Throwable {
    long life1_3;
    com.google.gson.JsonObject life3_6;
    life1_3 = (__fieldRead136_0() ^ 52023681512787L);
    life3_6 = __call136_1(p0);
    return __call136_3(life3_6, __call136_2(p0));
}
public static moom.Kl h136_0(java.lang.Exception p0, long p1) throws Throwable {
    java.lang.Exception local3 = p0;
    java.lang.String spill2013600_0 = __call2013600_1(__call2013600_0(local3));
    java.lang.String __stackOp2013600_4_0 = __call2013600_2(local3);
    java.lang.String __stackOp2013600_4_1 = __invokedynamic2013600_3(19187, (1412538882192576143L ^ p1));
    __call2013600_6(__invokedynamic2013600_5(spill2013600_0, __stackOp2013600_4_1, __stackOp2013600_4_0));
    return null;
}
public static moom.Kl h136_1(java.lang.Exception p0) throws Throwable {
    java.lang.Exception local1 = p0;
    __call2013601_0(local1);
    return null;
}
private static native long __fieldRead136_0() throws Throwable;
private static native com.google.gson.JsonObject __call136_1(moom.DD a0) throws Throwable;
private static native java.lang.String __call136_2(moom.DD a0) throws Throwable;
private static native moom.Kl __call136_3(com.google.gson.JsonObject a0, java.lang.String a1) throws Throwable;
private static native java.lang.Class __call2013600_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.String __call2013600_1(java.lang.Class a0) throws Throwable;
private static native java.lang.String __call2013600_2(java.lang.Exception a0) throws Throwable;
private static native java.lang.String __invokedynamic2013600_3(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic2013600_5(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native void __call2013600_6(java.lang.String a0) throws Throwable;
private static native void __call2013601_0(java.lang.Exception a0) throws Throwable;

}

private static native <E extends Throwable> moom.Kl __sourceHandlerCall_22d028525c128795b63f(moom.Km a0, moom.Ki a1) throws E;
private static final class __SourceHandler_22d028525c128795b63f {

public static moom.Kl f324(moom.Km p0, moom.Ki p1) throws Throwable {
    float forestValue324_23_0;
    moom.Km forestValue324_50_0;
    moom.iQ forestValue324_50_1;
    int[] spill324_0;
    float spill324_1;
    moom.Km spill324_2;
    moom.iQ spill324_3;
    long life2_3;
    moom.DD life5_7;
    moom.Kk[] life6_10;
    int[] life4_11;
    float life7_14;
    moom.iQ life8_28;
    moom.Lc life9_39;
    moom.Kl life10_55;
    forest_join_83: {
    forest_join_78: {
    forest_join_50: {
    forest_join_48: {
    forest_join_31: {
    forest_join_24: {
    forest_join_23: {
    life2_3 = (__fieldRead324_0() ^ 114582477647674L);
    spill324_0 = __call324_1();
    life5_7 = __call324_2(p1);
    life6_10 = __call324_3(p1);
    life4_11 = spill324_0;
    life7_14 = __call324_4(p1);
    spill324_1 = life7_14;
    if (!((life4_11 != null))) {
        forestValue324_23_0 = spill324_1;
        break forest_join_23;
    }
    if (!((__numericCompare324_5(spill324_1, 0x0.0p0f) < 0))) {
        break forest_join_24;
    }
    forestValue324_23_0 = __call324_6(p0);
    }
    life7_14 = forestValue324_23_0;
    }
    life8_28 = __call324_7(p0);
    if (!((life8_28 == null))) {
        break forest_join_31;
    }
    return null;
    }
    life9_39 = new moom.Lc(p0, life8_28, life6_10);
    spill324_2 = p0;
    spill324_3 = life8_28;
    if (!((life4_11 != null))) {
        forestValue324_50_0 = spill324_2;
        forestValue324_50_1 = spill324_3;
        break forest_join_50;
    }
    if (!((!__call324_8(spill324_2, spill324_3, life6_10, life9_39)))) {
        break forest_join_48;
    }
    return null;
    }
    forestValue324_50_0 = p0;
    forestValue324_50_1 = life8_28;
    }
    life10_55 = __call324_9(forestValue324_50_0, forestValue324_50_1, life7_14);
    if (!((life10_55 == null))) {
        break forest_join_78;
    }
    java.lang.Object __inlineStack324_14Token;
    java.lang.Object __inlineStack324_16Token;
    throw new com.google.gson.JsonParseException(__invokedynamic324_17(__inlineStack324_14Output0((__inlineStack324_14Token = __inlineStack324_14Pack(__call324_10(p0), __call324_12(__call324_11(p0)), __invokedynamic324_13(12851, (6891216128672803886L ^ life2_3))))), __inlineStack324_14Output1(__inlineStack324_14Token), __inlineStack324_16Output0((__inlineStack324_16Token = __inlineStack324_16Pack(__inlineStack324_14Output2(__inlineStack324_14Token), __invokedynamic324_15(4842, (4100052951775972594L ^ life2_3))))), __inlineStack324_16Output1(__inlineStack324_16Token)));
    }
    if (!((life5_7 != null))) {
        break forest_join_83;
    }
    __call324_18(life10_55, life5_7);
    }
    return life10_55;
}
private static native long __fieldRead324_0() throws Throwable;
private static native int[] __call324_1() throws Throwable;
private static native moom.DD __call324_2(moom.Ki a0) throws Throwable;
private static native moom.Kk[] __call324_3(moom.Ki a0) throws Throwable;
private static native float __call324_4(moom.Ki a0) throws Throwable;
private static native int __numericCompare324_5(float a0, float a1) throws Throwable;
private static native float __call324_6(moom.Km a0) throws Throwable;
private static native moom.iQ __call324_7(moom.Km a0) throws Throwable;
private static native boolean __call324_8(moom.Km a0, moom.iQ a1, moom.Kk[] a2, moom.Lc a3) throws Throwable;
private static native moom.Kl __call324_9(moom.Km a0, moom.iQ a1, float a2) throws Throwable;
private static native java.lang.String __call324_10(moom.Km a0) throws Throwable;
private static native java.lang.Class __call324_11(moom.Km a0) throws Throwable;
private static native java.lang.String __call324_12(java.lang.Class a0) throws Throwable;
private static native java.lang.String __invokedynamic324_13(int a0, long a1) throws Throwable;
private static native java.lang.Object __inlineStack324_14Pack(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native java.lang.String __inlineStack324_14Output0(java.lang.Object token) throws Throwable;
private static native java.lang.String __inlineStack324_14Output1(java.lang.Object token) throws Throwable;
private static native java.lang.String __inlineStack324_14Output2(java.lang.Object token) throws Throwable;
private static native java.lang.String __invokedynamic324_15(int a0, long a1) throws Throwable;
private static native java.lang.Object __inlineStack324_16Pack(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __inlineStack324_16Output0(java.lang.Object token) throws Throwable;
private static native java.lang.String __inlineStack324_16Output1(java.lang.Object token) throws Throwable;
private static native java.lang.String __invokedynamic324_17(java.lang.String a0, java.lang.String a1, java.lang.String a2, java.lang.String a3) throws Throwable;
private static native void __call324_18(moom.Kl a0, moom.DD a1) throws Throwable;

}


private static java.util.Map<java.lang.Class, net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer> b() {
java.util.Map forwardValue2515_19_0;
    int[] spill2515_0;
    java.util.Map spill2515_1;
    long life0_3;
    java.util.Map life3_7;
    int[] life2_8;
    forward_join_19: {
    forward_join_18: {
    life0_3 = (moom.Kh.d ^ 129665557021060L);
    spill2515_0 = moom.Km.b();
    life3_7 = ((moom.oo)(moom.oo.b)).a;
    life2_8 = spill2515_0;
    spill2515_1 = moom.Kh.c;
    if (!((life2_8 != null))) {
        forwardValue2515_19_0 = spill2515_1;
        break forward_join_19;
    }
    if (!((spill2515_1 == null))) {
        break forward_join_18;
    }
    c = ((java.util.Map)(new java.util.HashMap(life3_7)));
    }
    forwardValue2515_19_0 = life3_7;
    }
    return forwardValue2515_19_0;
}


public static boolean a__Boolean() {
return ((((moom.Kh.a) ? 1 : 0)) != 0);
}


private static void a(java.lang.Object p0, java.lang.String p1) {
long local2 = (moom.Kh.d ^ 71473675089435L);
    if ((p0 == null)) {
        throw new com.google.gson.JsonParseException(p1);
    }
    return;
}


private static com.google.gson.JsonParseException a(com.google.gson.JsonParseException p0) {
return p0;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral5759_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Kh"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.Kh.a(((int)(local4)), ((long)(local5)));
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 26511);
    if (((moom.Kh.f)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.Kh.g)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.Kh.g)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/Kh", life9_51);
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
        life9_116 = ((java.lang.String)((moom.Kh.e)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.Kh.f)[life5_8] = moom.Kh.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.Kh.f)[life5_8];
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
        byte[] spill2940_0 = p0;
        life4_9 += 1;
        life5_44 = (spill2940_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill2940_1 = p0;
        life4_9 += 1;
        life5_76 = (spill2940_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill2940_2 = p0;
        life4_9 += 1;
        life5_91 = (spill2940_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static moom.Kl a(moom.DD p0) { return __sourceHandlerCall_226bdc215e15979c0f4f(p0); }


private static moom.DD[] a__ArrayDD() {
java.lang.Object[] lexicalValue901_66_0;
    int[] spill901_0;
    java.lang.String[] spill901_1;
    long life0_3;
    java.lang.String life3_10;
    int[] life2_11;
    java.lang.String life4_17;
    java.util.ArrayList life5_21;
    java.lang.String[] life6_23;
    java.lang.String[] life7_25;
    int life8_28;
    int life9_30;
    java.lang.String life10_39;
    java.lang.String life11_44;
    moom.DD life12_49;
    lexical_join_66: {
    lexical_join_62: {
    life0_3 = (moom.Kh.d ^ 13723202909945L);
    spill901_0 = moom.Km.b();
    life3_10 = __sourceIntrinsic_dbc89f2b366d_invokedynamic901_2(7627, (2790854427758811670L ^ life0_3));
    life2_11 = spill901_0;
    life4_17 = __sourceIntrinsic_dbc89f2b366d_invokedynamic901_3(20776, (6694906116861564658L ^ life0_3));
    life5_21 = new java.util.ArrayList();
    life6_23 = moom.Kj.a__ArrayString();
    life7_25 = life6_23;
    life8_28 = (life7_25).length;
    life9_30 = 0;
    lexical_cycle_31: while (true) {
    lexical_join_60: {
    lexical_join_59: {
    if (!((life9_30 < life8_28))) {
        break lexical_join_62;
    }
    spill901_1 = life7_25;
    if (!((life2_11 != null))) {
        lexicalValue901_66_0 = spill901_1;
        break lexical_join_66;
    }
    life10_39 = (spill901_1)[life9_30];
    life11_44 = __sourceIntrinsic_dbc89f2b366d_invokedynamic901_5(life3_10, life10_39, life4_17);
    life12_49 = new moom.DD(life11_44);
    if (!((life2_11 != null))) {
        break lexical_join_60;
    }
    if (!(moom.BU.a__Boolean(((moom.DD)(life12_49))))) {
        break lexical_join_59;
    }
    ((java.util.List)(life5_21)).add(((java.lang.Object)(life12_49)));
    }
    life9_30 += 1;
    }
    if (!((life2_11 == null))) { continue lexical_cycle_31; }
    break lexical_cycle_31;
    }
    }
    lexicalValue901_66_0 = ((java.util.List)(life5_21)).toArray(((java.lang.Object[])(new moom.DD[0])));
    }
    return ((moom.DD[])(lexicalValue901_66_0));
}


private static java.util.Map<java.lang.Class, net.minecraft.client.renderer.entity.Render> a() {
java.util.Map forwardValue2508_19_0;
    java.util.Map forwardValue2508_28_0;
    int[] spill2508_0;
    java.util.Map spill2508_1;
    long life0_3;
    net.minecraft.client.renderer.entity.RenderManager life3_6;
    java.util.Map life4_10;
    int[] life2_11;
    forward_join_28: {
    forward_join_27: {
    forward_join_19: {
    forward_join_18: {
    life0_3 = (moom.Kh.d ^ 4840329125829L);
    life3_6 = ((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).a__nw();
    spill2508_0 = moom.Km.b();
    life4_10 = ((net.minecraft.client.renderer.entity.RenderManager)(life3_6)).a__Map();
    life2_11 = spill2508_0;
    spill2508_1 = life4_10;
    if (!((life2_11 != null))) {
        forwardValue2508_19_0 = spill2508_1;
        break forward_join_19;
    }
    if (!((spill2508_1 == null))) {
        break forward_join_18;
    }
    return null;
    }
    forwardValue2508_19_0 = moom.Kh.b;
    }
    if (!((life2_11 != null))) {
        forwardValue2508_28_0 = forwardValue2508_19_0;
        break forward_join_28;
    }
    if (!((forwardValue2508_19_0 == null))) {
        break forward_join_27;
    }
    b = ((java.util.Map)(new java.util.HashMap(life4_10)));
    }
    forwardValue2508_28_0 = life4_10;
    }
    return forwardValue2508_28_0;
}


public static void a__Void() {
java.util.Map lexicalValue902_23_0;
    java.util.Map lexicalValue902_44_0;
    int lexicalValue902_105_0;
    moom.Kl lexicalValue902_115_0;
    int[] spill902_0;
    java.util.Map spill902_1;
    int spill902_2;
    moom.Kl spill902_3;
    long life0_3;
    java.util.Map life3_5;
    java.util.Map life4_8;
    int[] life2_9;
    moom.DD[] life5_67;
    moom.DD[] life6_69;
    int life7_72;
    int life8_74;
    moom.DD life9_81;
    moom.Kl life10_94;
    java.lang.Class life11_104;
    lexical_join_130: {
    lexical_join_44: {
    lexical_join_34: {
    lexical_join_23: {
    lexical_join_22: {
    life0_3 = (moom.Kh.d ^ 105028840206619L);
    life3_5 = moom.Kh.a();
    spill902_0 = moom.Km.b();
    life4_8 = moom.Kh.b();
    life2_9 = spill902_0;
    spill902_1 = life3_5;
    if (!((life2_9 != null))) {
        lexicalValue902_23_0 = spill902_1;
        break lexical_join_23;
    }
    if (!((spill902_1 == null))) {
        break lexical_join_22;
    }
    moom.BU.c(((java.lang.String)(__sourceIntrinsic_b82a5b29b709_invokedynamic902_4(12968, (2834736138335367827L ^ life0_3)))));
    if (!((life2_9 == null))) {
        break lexical_join_130;
    }
    }
    lexicalValue902_23_0 = life4_8;
    }
    if (!((life2_9 != null))) {
        lexicalValue902_44_0 = lexicalValue902_23_0;
        break lexical_join_44;
    }
    if (!((lexicalValue902_23_0 == null))) {
        break lexical_join_34;
    }
    moom.BU.c(((java.lang.String)(__sourceIntrinsic_b82a5b29b709_invokedynamic902_6(13442, (6943209839140287668L ^ life0_3)))));
    if (!((life2_9 == null))) {
        break lexical_join_130;
    }
    }
    a = ((boolean)(false));
    ((java.util.Map)(life3_5)).clear();
    ((java.util.Map)(life4_8)).clear();
    ((java.util.Map)(life3_5)).putAll(((java.util.Map)(moom.Kh.b)));
    lexicalValue902_44_0 = life4_8;
    }
    ((java.util.Map)(lexicalValue902_44_0)).putAll(((java.util.Map)(moom.Kh.c)));
    if (!(moom.BU.aB())) {
        break lexical_join_130;
    }
    life5_67 = moom.Kh.a__ArrayDD();
    life6_69 = life5_67;
    life7_72 = (life6_69).length;
    life8_74 = 0;
    lexical_cycle_57: while (true) {
    lexical_join_128: {
    lexical_join_127: {
    lexical_join_125: {
    lexical_join_115: {
    lexical_join_114: {
    lexical_join_105: {
    lexical_join_101: {
    if (!((life8_74 < life7_72))) {
        break lexical_join_130;
    }
    life9_81 = (life6_69)[life8_74];
    java.lang.String __stackOp902_19_0 = ((moom.DD)(life9_81)).a();
    java.lang.String __stackOp902_19_1 = __sourceIntrinsic_b82a5b29b709_invokedynamic902_18(32437, (1079592504366759559L ^ life0_3));
    moom.BU.b__Void(((java.lang.String)(__sourceIntrinsic_b82a5b29b709_invokedynamic902_20(__stackOp902_19_1, __stackOp902_19_0))));
    life10_94 = moom.Kh.a(((moom.DD)(life9_81)));
    if (!((life2_9 != null))) {
        break lexical_join_128;
    }
    if (!((life10_94 != null))) {
        break lexical_join_127;
    }
    life11_104 = ((moom.Kl)(life10_94)).a();
    if (!((life2_9 != null))) {
        break lexical_join_128;
    }
    if (!((life11_104 != null))) {
        break lexical_join_127;
    }
    spill902_2 = ((life10_94 instanceof net.minecraft.client.renderer.entity.Render) ? 1 : 0);
    if (!((life2_9 != null))) {
        lexicalValue902_105_0 = spill902_2;
        break lexical_join_105;
    }
    if (!((spill902_2 != 0))) {
        break lexical_join_101;
    }
    ((java.util.Map)(life3_5)).put(((java.lang.Object)(life11_104)), ((java.lang.Object)(((net.minecraft.client.renderer.entity.Render)(life10_94)))));
    if (!((life2_9 == null))) {
        break lexical_join_125;
    }
    }
    spill902_3 = life10_94;
    if (!((life2_9 != null))) {
        lexicalValue902_115_0 = spill902_3;
        break lexical_join_115;
    }
    lexicalValue902_105_0 = ((spill902_3 instanceof net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer) ? 1 : 0);
    }
    if (!((lexicalValue902_105_0 != 0))) {
        break lexical_join_114;
    }
    ((java.util.Map)(life4_8)).put(((java.lang.Object)(life11_104)), ((java.lang.Object)(((net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer)(life10_94)))));
    if (!((life2_9 == null))) {
        break lexical_join_125;
    }
    }
    lexicalValue902_115_0 = life10_94;
    }
    java.lang.String __stackOp902_33_0 = ((java.lang.Class)(((java.lang.Object)(lexicalValue902_115_0)).getClass())).getName();
    java.lang.String __stackOp902_33_1 = __sourceIntrinsic_b82a5b29b709_invokedynamic902_32(27613, (3529021170810088416L ^ life0_3));
    moom.BU.c(((java.lang.String)(__sourceIntrinsic_b82a5b29b709_invokedynamic902_34(__stackOp902_33_1, __stackOp902_33_0))));
    }
    a = ((boolean)(true));
    }
    life8_74 += 1;
    }
    if (!((life2_9 == null))) { continue lexical_cycle_57; }
    break lexical_cycle_57;
    }
    }
    return;
}


private static boolean a(moom.Km p0, moom.iQ p1, moom.Kk p2, moom.Lc p3) {
java.util.List lexicalValue899_52_0;
    java.util.List lexicalValue899_62_0;
    moom.jD lexicalValue899_101_0;
    moom.Kk lexicalValue899_105_0;
    moom.Ld lexicalValue899_119_0;
    int lexicalValue899_125_0;
    int[] spill899_0;
    java.lang.String spill899_1;
    java.lang.String spill899_2;
    moom.iQ spill899_3;
    moom.Kk spill899_4;
    java.util.List spill899_5;
    moom.jD spill899_6;
    moom.Ld spill899_7;
    boolean spill899_8;
    long life4_3;
    java.lang.String life7_7;
    moom.jD life8_12;
    int[] life6_13;
    moom.jD[] life9_93;
    java.util.Set life10_98;
    java.util.List life11_106;
    java.util.Iterator life12_109;
    moom.jD life13_116;
    moom.Ld life9_139;
    lexical_join_130: {
    lexical_join_126: {
    lexical_join_125: {
    lexical_join_119: {
    lexical_join_105: {
    lexical_join_104: {
    lexical_join_101: {
    lexical_join_100: {
    lexical_join_62: {
    lexical_join_58: {
    lexical_join_52: {
    lexical_join_50: {
    lexical_join_37: {
    lexical_join_35: {
    life4_3 = (moom.Kh.d ^ 68293530592915L);
    spill899_0 = moom.Km.b();
    life7_7 = ((moom.Kk)(p2)).a();
    life8_12 = ((moom.Km)(p0)).a(((moom.iQ)(p1)), ((java.lang.String)(life7_7)));
    life6_13 = spill899_0;
    if (!((life6_13 != null))) {
        break lexical_join_35;
    }
    if (!((life8_12 == null))) {
        break lexical_join_37;
    }
    java.lang.String __stackOp899_5_0 = life7_7;
    moom.iQ __stackOp899_5_1 = p1;
    java.lang.String __stackOp899_5_2 = __sourceIntrinsic_7a88abbc1eab_invokedynamic899_4(3655, (6223375981302389233L ^ life4_3));
    spill899_1 = __stackOp899_5_2;
    spill899_2 = __stackOp899_5_0;
    spill899_3 = __stackOp899_5_1;
    recovery.source.CarrierOps.discard(__stackOp899_5_2);
    moom.iQ __stackOp899_8_0 = spill899_3;
    java.lang.String __stackOp899_8_1 = __sourceIntrinsic_7a88abbc1eab_invokedynamic899_7(11292, (4786388867327277985L ^ life4_3));
    moom.BU.c(((java.lang.String)(__sourceIntrinsic_7a88abbc1eab_invokedynamic899_9(spill899_1, spill899_2, __stackOp899_8_1, __stackOp899_8_0))));
    }
    return ((0) != 0);
    }
    spill899_4 = p2;
    if (!((life6_13 != null))) {
        lexicalValue899_105_0 = spill899_4;
        break lexical_join_105;
    }
    if (!((!((moom.Kk)(spill899_4)).a__Boolean()))) {
        break lexical_join_100;
    }
    spill899_5 = ((moom.jD)(life8_12)).p;
    if (!((life6_13 != null))) {
        lexicalValue899_52_0 = spill899_5;
        break lexical_join_52;
    }
    if (!((spill899_5 != null))) {
        break lexical_join_50;
    }
    ((java.util.List)(((moom.jD)(life8_12)).p)).clear();
    }
    lexicalValue899_52_0 = ((moom.jD)(life8_12)).w;
    }
    if (!((life6_13 != null))) {
        lexicalValue899_62_0 = lexicalValue899_52_0;
        break lexical_join_62;
    }
    if (!((lexicalValue899_52_0 != null))) {
        break lexical_join_58;
    }
    ((java.util.List)(((moom.jD)(life8_12)).w)).clear();
    }
    spill899_6 = life8_12;
    if (!((life6_13 != null))) {
        lexicalValue899_101_0 = spill899_6;
        break lexical_join_101;
    }
    lexicalValue899_62_0 = ((moom.jD)(spill899_6)).q;
    }
    if (!((lexicalValue899_62_0 != null))) {
        break lexical_join_100;
    }
    life9_93 = ((moom.Km)(p0)).a(((moom.iQ)(p1)));
    life10_98 = java.util.Collections.newSetFromMap(((java.util.Map)(new java.util.IdentityHashMap())));
    ((java.util.Set)(life10_98)).addAll(((java.util.Collection)(java.util.Arrays.asList(((java.lang.Object[])(life9_93))))));
    life11_106 = ((moom.jD)(life8_12)).q;
    life12_109 = ((java.util.List)(life11_106)).iterator();
    lexical_cycle_83: while (true) {
    lexical_join_98: {
    if (!(((java.util.Iterator)(life12_109)).hasNext())) {
        break lexical_join_100;
    }
    life13_116 = ((moom.jD)(((java.util.Iterator)(life12_109)).next()));
    if (!((life6_13 != null))) {
        break lexical_join_104;
    }
    if (!((!((java.util.Set)(life10_98)).contains(((java.lang.Object)(life13_116)))))) {
        break lexical_join_98;
    }
    ((java.util.Iterator)(life12_109)).remove();
    }
    if (!((life6_13 == null))) { continue lexical_cycle_83; }
    break lexical_cycle_83;
    }
    }
    lexicalValue899_101_0 = life8_12;
    }
    ((moom.jD)(lexicalValue899_101_0)).a(((moom.jD)(((moom.Kk)(p2)).a__jD())));
    }
    lexicalValue899_105_0 = p2;
    }
    life9_139 = ((moom.Kk)(lexicalValue899_105_0)).a__Ld();
    spill899_7 = life9_139;
    if (!((life6_13 != null))) {
        lexicalValue899_119_0 = spill899_7;
        break lexical_join_119;
    }
    if (!((spill899_7 != null))) {
        break lexical_join_130;
    }
    ((moom.Lc)(p3)).b(((moom.jD)(((moom.Kk)(p2)).a__jD())));
    ((moom.Lc)(p3)).a(((moom.jD)(life8_12)));
    lexicalValue899_119_0 = life9_139;
    }
    spill899_8 = ((moom.Ld)(lexicalValue899_119_0)).a(((moom.La)(p3)));
    if (!((life6_13 != null))) {
        lexicalValue899_125_0 = ((spill899_8) ? 1 : 0);
        break lexical_join_125;
    }
    if (!((!spill899_8))) {
        break lexical_join_126;
    }
    lexicalValue899_125_0 = 0;
    }
    return ((lexicalValue899_125_0) != 0);
    }
    ((moom.jD)(((moom.Kk)(p2)).a__jD())).a(((moom.Ld)(life9_139)));
    }
    return ((1) != 0);
}


private static boolean a(moom.Km p0, moom.iQ p1, moom.Kk[] p2, moom.Lc p3) {
int lexicalValue900_36_0;
    int[] spill900_0;
    boolean spill900_1;
    long life4_3;
    moom.Kk[] life7_6;
    int life8_9;
    int[] life6_10;
    int life9_12;
    moom.Kk life10_19;
    lexical_join_36: {
    lexical_join_35: {
    life4_3 = (moom.Kh.d ^ 75098534392083L);
    spill900_0 = moom.Km.b();
    life7_6 = p2;
    life8_9 = (life7_6).length;
    life6_10 = spill900_0;
    life9_12 = 0;
    lexical_cycle_13: while (true) {
    lexical_join_33: {
    lexical_join_32: {
    if (!((life9_12 < life8_9))) {
        break lexical_join_35;
    }
    life10_19 = (life7_6)[life9_12];
    if (!((life6_10 != null))) {
        break lexical_join_33;
    }
    spill900_1 = moom.Kh.a(((moom.Km)(p0)), ((moom.iQ)(p1)), ((moom.Kk)(life10_19)), ((moom.Lc)(p3)));
    if (!((life6_10 != null))) {
        lexicalValue900_36_0 = ((spill900_1) ? 1 : 0);
        break lexical_join_36;
    }
    if (!((!spill900_1))) {
        break lexical_join_32;
    }
    return ((0) != 0);
    }
    life9_12 += 1;
    }
    if (!((life6_10 == null))) { continue lexical_cycle_13; }
    break lexical_cycle_13;
    }
    }
    lexicalValue900_36_0 = 1;
    }
    return ((lexicalValue900_36_0) != 0);
}


private static moom.Kl a(moom.Km p0, moom.Ki p1) { return __sourceHandlerCall_22d028525c128795b63f(p0, p1); }


private static moom.Kl a(com.google.gson.JsonObject p0, java.lang.String p1) {
moom.Kl forwardValue2509_53_0;
    int[] spill2509_0;
    moom.Km spill2509_1;
    java.lang.Class spill2509_2;
    moom.Kl spill2509_3;
    long life2_3;
    moom.Ki life5_8;
    int[] life4_9;
    java.lang.String life6_12;
    moom.Km life7_15;
    java.lang.Class life8_28;
    moom.Kl life9_42;
    forward_join_53: {
    forward_join_49: {
    life2_3 = (moom.Kh.d ^ 7452693076381L);
    spill2509_0 = moom.Km.b();
    life5_8 = moom.Kg.a(((com.google.gson.JsonObject)(p0)), ((java.lang.String)(p1)));
    life4_9 = spill2509_0;
    life6_12 = ((moom.Ki)(life5_8)).a__String();
    life7_15 = moom.Kj.a(((java.lang.String)(life6_12)));
    spill2509_1 = life7_15;
    java.lang.String __stackOp2509_6_0 = life6_12;
    java.lang.String __stackOp2509_6_1 = __sourceIntrinsic_15af7e3932e7_invokedynamic2509_5(25791, (1010002883522972675L ^ life2_3));
    moom.Kh.a(((java.lang.Object)(spill2509_1)), ((java.lang.String)(__sourceIntrinsic_15af7e3932e7_invokedynamic2509_7(__stackOp2509_6_1, __stackOp2509_6_0))));
    life8_28 = ((moom.Km)(life7_15)).a__Class();
    spill2509_2 = life8_28;
    java.lang.String __stackOp2509_11_0 = life6_12;
    java.lang.String __stackOp2509_11_1 = __sourceIntrinsic_15af7e3932e7_invokedynamic2509_10(8183, (7681832465234769734L ^ life2_3));
    moom.Kh.a(((java.lang.Object)(spill2509_2)), ((java.lang.String)(__sourceIntrinsic_15af7e3932e7_invokedynamic2509_12(__stackOp2509_11_1, __stackOp2509_11_0))));
    life9_42 = moom.Kh.a(((moom.Km)(life7_15)), ((moom.Ki)(life5_8)));
    spill2509_3 = life9_42;
    if (!((life4_9 != null))) {
        forwardValue2509_53_0 = spill2509_3;
        break forward_join_53;
    }
    if (!((spill2509_3 == null))) {
        break forward_join_49;
    }
    return null;
    }
    ((moom.Kl)(life9_42)).a(((java.lang.Class)(life8_28)));
    forwardValue2509_53_0 = life9_42;
    }
    return forwardValue2509_53_0;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_15af7e3932e7_invokedynamic2509_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_15af7e3932e7_invokedynamic2509_7(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_15af7e3932e7_invokedynamic2509_10(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_15af7e3932e7_invokedynamic2509_12(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral5759_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_7934159adda3_invokedynamic324_13(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_7a88abbc1eab_invokedynamic899_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_7a88abbc1eab_invokedynamic899_7(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_7a88abbc1eab_invokedynamic899_9(java.lang.String a0, java.lang.String a1, java.lang.String a2, moom.iQ a3) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_dbc89f2b366d_invokedynamic901_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_dbc89f2b366d_invokedynamic901_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_dbc89f2b366d_invokedynamic901_5(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b82a5b29b709_invokedynamic902_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b82a5b29b709_invokedynamic902_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b82a5b29b709_invokedynamic902_18(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b82a5b29b709_invokedynamic902_20(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b82a5b29b709_invokedynamic902_32(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b82a5b29b709_invokedynamic902_34(java.lang.String a0, java.lang.String a1) throws E;
}
