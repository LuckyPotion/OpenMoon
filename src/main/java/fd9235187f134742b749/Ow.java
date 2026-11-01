package moom;


public class Ow extends java.lang.Thread {

private static long a;

private static java.lang.String[] b;

private static java.lang.String[] c;

private static java.util.Map d;

public Ow() { super((java.lang.String)null); }

private static void __sourceConstructorBody_c247210d5f3fbb1c(moom.Ow receiver) throws Throwable {
long local1 = (moom.Ow.a ^ 20130863643804L);
    moom.Ow.__sourceConstructorInit_c247210d5f3fbb1c_0(((moom.Ow)(receiver)), ((java.lang.String)(__sourceIntrinsic_c247210d5f3fbb1c_originalDynamicSite2548_1(9532, (8998206489383855570L ^ local1)))));
    return;
}


static {
a = ((long)(((moom._a)(moom._c.a(((long)(-1296512048608586907L)), ((long)(8520838277723280641L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(170184678969618L)))));
    d = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.Ow.a ^ 15713494641999L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill909_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill909_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill909_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill909_14 = new byte[8];
    (__sourceSpill909_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill909_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation909_16 = __sourceSpill909_14;
    ((javax.crypto.Cipher)(__sourceSpill909_11)).init(((int)(__sourceSpill909_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill909_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation909_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local9_life19 = new java.lang.String[19];
    int local7_life20 = 0;
    java.lang.String local6_life21;
    int local8_life23 = ((java.lang.String)((local6_life21 = ")bEi6:²/UÑ®\004kØ\033X\025ë-\032Â½ÅF\034îôaÕ!·=_+éKXeG\016¼\006\037\003vÿþ&û®­l-Y\025\f\022\006üV¼\020P3ð(\\\017 Ø¸¯\006n\036³\020\020Õ\022à[Â-Ü*»Yã[\020a+QwPTU?ØÿH[\020DP{\004R\013*ª¼`TÀ¶6 R-#§ï\006ô¥¤:¶ÌV\f\017:e\002\005%\003s®~¼L (lê}¯a'M1Ë\036V\021ûÄLDâxûf~7wOÅ7\030¦\t!Ùßzo¿K§0w¯­I\000\034\022îÉ\005_,N(e¤2 jOëe\000®Ûõ°ó-Bzbá(\016*a7¯®ÿãQóö!¦Po æXâ\n7çÐyÊË§C½¹ò\boå¹Ä·k\001º; \027FÀ\003tå)¸ïôsØ\033OÅJ6hWà%\023\002ÀÞ°Ã0'OâÎ;uÏt\007¿\177ÕD!*\037õZV>ýhäÿ[¿ìWÂ\003ªY±ô¼x\003 z²(ojïcUlMF8úo\035ÃôÝ);\027Üä[×»\\wy´¶v\024$P³íýÑ cw{¡<÷\033Â2L2'üÒñ2§\"¸Ã;\rq ìOÁ\fþj »ëçýÀ\007Ç{\033KæÛeÈ\022\035á\001_d´I\025wª¤ %Ù!\030`öX\032§q-ô¸:Óq\fkiäÖ6d`íQ@¥¼Èæ\020®§ÄXs\r¡V\026·\fWùÈ/"))).length();
    int local5_life24 = 72;
    int local4_life25 = -1;
    while (true) {
        local4_life25 += 1;
        byte[] __sourceSpill909_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill909_29 = local2_life9;
        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill909_29)).doFinal(((byte[])(__sourceSpill909_28)));
        java.lang.String __sourceSpill909_34 = ((java.lang.String)(moom.Ow.a(((byte[])(local10_life31))))).intern();
        java.lang.String[] __sourceSpill909_35 = local9_life19;
        int __sourceSpill909_36 = local7_life20;
        local7_life20 += 1;
        (__sourceSpill909_35)[__sourceSpill909_36] = __sourceSpill909_34;
        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }
        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));
    }
    local8_life23 = ((java.lang.String)((local6_life21 = "?guíãÙßÛ\023¡Q\026\031à\030Çö\026Ô4\020«ÚÖÝô3r:\025´ál"))).length();
    local5_life24 = 24;
    local4_life25 = -1;
    while (true) {
        local4_life25 += 1;
        byte[] __sourceSpill909_42 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill909_43 = local2_life9;
        byte[] local10_life45 = ((javax.crypto.Cipher)(__sourceSpill909_43)).doFinal(((byte[])(__sourceSpill909_42)));
        java.lang.String __sourceSpill909_48 = ((java.lang.String)(moom.Ow.a(((byte[])(local10_life45))))).intern();
        java.lang.String[] __sourceSpill909_49 = local9_life19;
        int __sourceSpill909_50 = local7_life20;
        local7_life20 += 1;
        (__sourceSpill909_49)[__sourceSpill909_50] = __sourceSpill909_48;
        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }
        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));
    }
    b = ((java.lang.String[])(local9_life19));
    c = ((java.lang.String[])(new java.lang.String[19]));
}

private static native <E extends Throwable> void __sourceConstructorInit_c247210d5f3fbb1c_0(moom.Ow a0, java.lang.String a1) throws E;
private static native <E extends Throwable> void __sourceHandlerCall_f92290ccac15f8f22f4e(moom.Ow a0) throws E;
private static final class __SourceHandler_f92290ccac15f8f22f4e {

public static void f386(moom.Ow receiver) throws Throwable {
    java.lang.String[] forestValue386_149_0;
    java.net.HttpURLConnection forestValue386_177_0;
    java.lang.String forestValue386_180_0;
    java.net.HttpURLConnection forestValue386_186_0;
    net.minecraft.entity.Entity[] spill386_0;
    java.lang.String[] spill386_1;
    java.lang.String spill386_2;
    java.net.HttpURLConnection spill386_3;
    java.net.HttpURLConnection spill386_4;
    long life1_3;
    java.lang.Object life4_6;
    net.minecraft.entity.Entity[] life3_7;
    java.net.URL life5_22;
    java.net.HttpURLConnection life4_26;
    java.io.InputStream life6_130;
    java.lang.String life7_133;
    java.lang.String[] life8_143;
    java.lang.String life9_156;
    forest_join_187: {
    forest_join_186: {
    forest_join_181: {
    forest_join_180: {
    forest_join_179: {
    forest_join_178: {
    forest_join_177: {
    forest_join_149: {
    forest_join_126: {
    forest_join_118: {
    life1_3 = (__fieldRead386_0() ^ 50451542226331L);
    spill386_0 = __call386_1();
    life4_6 = null;
    life3_7 = spill386_0;
    __call386_3(__invokedynamic386_2(7463, (3848293591839806664L ^ life1_3)));
    life5_22 = new java.net.URL(__invokedynamic386_4(21888, (5065176470595853412L ^ life1_3)));
    life4_26 = __cast386_6(__call386_5(life5_22));
    if (!((life3_7 != null))) {
        break forest_join_126;
    }
    if (!(__fieldRead386_8(__call386_7()))) {
        break forest_join_118;
    }
    __call386_11(life4_26, __invokedynamic386_9(31317, (2582852954470937524L ^ life1_3)), __invokedynamic386_10(14836, (7629569472556150804L ^ life1_3)));
    __call386_15(life4_26, __invokedynamic386_12(3319, (7804293803822449948L ^ life1_3)), __invokedynamic386_14(__call386_13()));
    __call386_18(life4_26, __invokedynamic386_16(21293, (8498245508933966542L ^ life1_3)), __invokedynamic386_17(967, (6255837008315943457L ^ life1_3)));
    __call386_21(life4_26, __invokedynamic386_19(26231, (7893102208675442585L ^ life1_3)), __invokedynamic386_20(22824, (7477530960335982797L ^ life1_3)));
    __call386_26(life4_26, __invokedynamic386_22(15949, (768067716821661600L ^ life1_3)), __invokedynamic386_25(__call386_24(__invokedynamic386_23(23768, (1733748630418969914L ^ life1_3)))));
    __call386_30(life4_26, __invokedynamic386_27(15342, (4471734907016655364L ^ life1_3)), __invokedynamic386_29(__call386_28()));
    __call386_34(life4_26, __invokedynamic386_31(19507, (546037666324628955L ^ life1_3)), __invokedynamic386_33(__fieldRead386_32()));
    __call386_38(life4_26, __invokedynamic386_35(17703, (5346731343054556363L ^ life1_3)), __invokedynamic386_37(__fieldRead386_36()));
    }
    __call386_39(life4_26, 1);
    __call386_40(life4_26, 0);
    __call386_41(life4_26);
    }
    life6_130 = __call386_42(life4_26);
    life7_133 = __call386_43(life6_130);
    __call386_44(life6_130);
    life8_143 = __call386_46(life7_133, __invokedynamic386_45(5510, (4058986729391955058L ^ life1_3)));
    spill386_1 = life8_143;
    if (!((life3_7 != null))) {
        forestValue386_149_0 = spill386_1;
        break forest_join_149;
    }
    if (!(((spill386_1).length >= 1))) {
        break forest_join_181;
    }
    forestValue386_149_0 = life8_143;
    }
    life9_156 = __call386_47((forestValue386_149_0)[0]);
    java.lang.String __stackOp386_49_0 = life9_156;
    java.lang.String __stackOp386_49_1 = __invokedynamic386_48(14960, (5221805441203254149L ^ life1_3));
    __call386_51(__invokedynamic386_50(__stackOp386_49_1, __stackOp386_49_0));
    spill386_2 = life9_156;
    if (!((life3_7 != null))) {
        forestValue386_180_0 = spill386_2;
        break forest_join_180;
    }
    if (!((__call386_53(spill386_2, __invokedynamic386_52(27676, (2630051458193909226L ^ life1_3))) <= 0))) {
        break forest_join_179;
    }
    spill386_3 = life4_26;
    if (!((life3_7 != null))) {
        forestValue386_177_0 = spill386_3;
        break forest_join_177;
    }
    if (!((spill386_3 != null))) {
        break forest_join_178;
    }
    forestValue386_177_0 = life4_26;
    }
    __call386_54(forestValue386_177_0);
    }
    return;
    }
    forestValue386_180_0 = life9_156;
    }
    __call386_55(forestValue386_180_0);
    }
    spill386_4 = life4_26;
    if (!((life3_7 != null))) {
        forestValue386_186_0 = spill386_4;
        break forest_join_186;
    }
    if (!((spill386_4 != null))) {
        break forest_join_187;
    }
    forestValue386_186_0 = life4_26;
    }
    __call386_56(forestValue386_186_0);
    }
    return;
}
public static void h386_0(java.lang.Exception p0) throws Throwable {
    throw __call3038600_0(p0);
}
public static void h386_1(java.lang.Exception p0) throws Throwable {
    throw __call3038601_0(p0);
}
public static void h386_2(java.lang.Exception p0) throws Throwable {
    throw __call3038602_0(p0);
}
public static void h386_3(java.lang.Exception p0) throws Throwable {
    throw __call3038603_0(p0);
}
public static void h386_4(java.lang.Exception p0) throws Throwable {
    throw __call3038604_0(p0);
}
public static void h386_5(java.lang.Exception p0) throws Throwable {
    throw __call3038605_0(p0);
}
public static void h386_6(java.lang.Exception p0) throws Throwable {
    throw __call3038606_0(p0);
}
public static void h386_7(java.lang.Throwable p0, net.minecraft.entity.Entity[] p1, java.net.HttpURLConnection p2) throws Throwable {
    java.net.HttpURLConnection forestValue3038607_7_0;
    java.net.HttpURLConnection spill3038607_0;
    java.lang.Throwable life3_2;
    forest_join_8: {
    forest_join_7: {
    life3_2 = p0;
    spill3038607_0 = p2;
    if (!((p1 != null))) {
        forestValue3038607_7_0 = spill3038607_0;
        break forest_join_7;
    }
    if (!((spill3038607_0 != null))) {
        break forest_join_8;
    }
    forestValue3038607_7_0 = p2;
    }
    __call3038607_0(forestValue3038607_7_0);
    }
    throw life3_2;
}
public static void h386_8(java.lang.Exception p0) throws Throwable {
    throw __call3038608_0(p0);
}
public static void h386_9(java.lang.Exception p0, long p1) throws Throwable {
    java.lang.String spill3038609_0;
    java.lang.Exception life3_2;
    life3_2 = p0;
    spill3038609_0 = __call3038609_1(__call3038609_0(life3_2));
    java.lang.String __stackOp3038609_4_0 = __call3038609_2(life3_2);
    java.lang.String __stackOp3038609_4_1 = __invokedynamic3038609_3(11021, (6180804528964084458L ^ p1));
    __call3038609_6(__invokedynamic3038609_5(spill3038609_0, __stackOp3038609_4_1, __stackOp3038609_4_0));
    return;
}
private static native long __fieldRead386_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call386_1() throws Throwable;
private static native java.lang.String __invokedynamic386_2(int a0, long a1) throws Throwable;
private static native void __call386_3(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic386_4(int a0, long a1) throws Throwable;
private static native java.net.URLConnection __call386_5(java.net.URL a0) throws Throwable;
private static native java.net.HttpURLConnection __cast386_6(java.net.URLConnection a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __call386_7() throws Throwable;
private static native boolean __fieldRead386_8(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native java.lang.String __invokedynamic386_9(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic386_10(int a0, long a1) throws Throwable;
private static native void __call386_11(java.net.HttpURLConnection a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native java.lang.String __invokedynamic386_12(int a0, long a1) throws Throwable;
private static native java.lang.String __call386_13() throws Throwable;
private static native java.lang.String __invokedynamic386_14(java.lang.String a0) throws Throwable;
private static native void __call386_15(java.net.HttpURLConnection a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native java.lang.String __invokedynamic386_16(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic386_17(int a0, long a1) throws Throwable;
private static native void __call386_18(java.net.HttpURLConnection a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native java.lang.String __invokedynamic386_19(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic386_20(int a0, long a1) throws Throwable;
private static native void __call386_21(java.net.HttpURLConnection a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native java.lang.String __invokedynamic386_22(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic386_23(int a0, long a1) throws Throwable;
private static native java.lang.String __call386_24(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic386_25(java.lang.String a0) throws Throwable;
private static native void __call386_26(java.net.HttpURLConnection a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native java.lang.String __invokedynamic386_27(int a0, long a1) throws Throwable;
private static native int __call386_28() throws Throwable;
private static native java.lang.String __invokedynamic386_29(int a0) throws Throwable;
private static native void __call386_30(java.net.HttpURLConnection a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native java.lang.String __invokedynamic386_31(int a0, long a1) throws Throwable;
private static native java.lang.String __fieldRead386_32() throws Throwable;
private static native java.lang.String __invokedynamic386_33(java.lang.String a0) throws Throwable;
private static native void __call386_34(java.net.HttpURLConnection a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native java.lang.String __invokedynamic386_35(int a0, long a1) throws Throwable;
private static native java.lang.String __fieldRead386_36() throws Throwable;
private static native java.lang.String __invokedynamic386_37(java.lang.String a0) throws Throwable;
private static native void __call386_38(java.net.HttpURLConnection a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native void __call386_39(java.net.HttpURLConnection a0, int a1) throws Throwable;
private static native void __call386_40(java.net.HttpURLConnection a0, int a1) throws Throwable;
private static native void __call386_41(java.net.HttpURLConnection a0) throws Throwable;
private static native java.io.InputStream __call386_42(java.net.HttpURLConnection a0) throws Throwable;
private static native java.lang.String __call386_43(java.io.InputStream a0) throws Throwable;
private static native void __call386_44(java.io.InputStream a0) throws Throwable;
private static native java.lang.String __invokedynamic386_45(int a0, long a1) throws Throwable;
private static native java.lang.String[] __call386_46(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call386_47(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic386_48(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic386_50(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call386_51(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic386_52(int a0, long a1) throws Throwable;
private static native int __call386_53(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call386_54(java.net.HttpURLConnection a0) throws Throwable;
private static native void __call386_55(java.lang.String a0) throws Throwable;
private static native void __call386_56(java.net.HttpURLConnection a0) throws Throwable;
private static native java.lang.Exception __call3038600_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3038601_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3038602_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3038603_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3038604_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3038605_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3038606_0(java.lang.Exception a0) throws Throwable;
private static native void __call3038607_0(java.net.HttpURLConnection a0) throws Throwable;
private static native java.lang.Exception __call3038608_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Class __call3038609_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.String __call3038609_1(java.lang.Class a0) throws Throwable;
private static native java.lang.String __call3038609_2(java.lang.Exception a0) throws Throwable;
private static native java.lang.String __invokedynamic3038609_3(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic3038609_5(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native void __call3038609_6(java.lang.String a0) throws Throwable;

}


public void run() { __sourceHandlerCall_f92290ccac15f8f22f4e(this); }


private static java.lang.String a(int p0, long p1) {
int life5_8;
    java.lang.Long life3_16;
    java.lang.Object[] life4_21;
    byte[] life6_60;
    int life7_70;
    javax.crypto.spec.DESKeySpec life7_92;
    javax.crypto.SecretKey life8_99;
    byte[] life9_116;
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 30292);
    if (((moom.Ow.c)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.Ow.d)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.Ow.d)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/Ow", life9_51);
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
        life9_116 = ((java.lang.String)((moom.Ow.b)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.Ow.c)[life5_8] = moom.Ow.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.Ow.c)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.Ow.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral6875_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Ow"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
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
        byte[] spill3478_0 = p0;
        life4_9 += 1;
        life5_44 = (spill3478_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill3478_1 = p0;
        life4_9 += 1;
        life5_76 = (spill3478_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill3478_2 = p0;
        life4_9 += 1;
        life5_91 = (spill3478_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c247210d5f3fbb1c_originalDynamicSite2548_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral6875_0() throws E;
}
