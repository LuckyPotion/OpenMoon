package moom;


public class I8 {

private static boolean a;

private static boolean b;

private static boolean c;

private static boolean d;

private static boolean e;

private static boolean f;

private static boolean g;

private static net.minecraft.client.renderer.texture.TextureAtlasSprite h;

private static net.minecraft.client.renderer.texture.TextureAtlasSprite i;

private static net.minecraft.client.renderer.texture.TextureAtlasSprite j;

private static net.minecraft.client.renderer.texture.TextureAtlasSprite k;

private static net.minecraft.client.renderer.texture.TextureAtlasSprite l;

private static boolean m;

private static net.minecraft.client.resources.model.IBakedModel n;

private static net.minecraft.client.resources.model.IBakedModel o;

private static net.minecraft.client.resources.model.IBakedModel p;

private static net.minecraft.client.resources.model.IBakedModel q;

private static boolean r;

private static long s;

private static java.lang.String[] t;

private static java.lang.String[] u;

private static java.util.Map v;

public I8() {
super();
}


static {
s = ((long)(((moom._a)(moom._c.a(((long)(-2421559471358075148L)), ((long)(-416319600073779131L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(256764401806108L)))));
    v = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.I8.s ^ 134865022657702L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill692_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill692_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill692_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill692_14 = new byte[8];
    (__sourceSpill692_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill692_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation692_16 = __sourceSpill692_14;
    ((javax.crypto.Cipher)(__sourceSpill692_11)).init(((int)(__sourceSpill692_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill692_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation692_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local9_life19 = new java.lang.String[31];
    int local7_life20 = 0;
    java.lang.String local6_life21;
    int local8_life23 = ((java.lang.String)((local6_life21 = "«¶xo\002Ã=@ÄÃTFéñ%ÛýR,8\005\004°\nOÇMý%\031(D±\035(D·L;/ü\020ö_­\177¸¿V\005þ.q#\020¡N4\rUq\r%Uïì\022\020ÜÐô×a?]B|®q¿ñ¯ #c$Ò\"ÿ\035çÌ\177\fX¥\nEx \001PÍÚ%bp³\030\020ÃÄÜ¢\032\004\021\023â*Ç\r\030\030äy,ËZÆË%òmF,ýR¿\013C}â«\030q@\021q \026&×c÷N\033Å¼·\033õlâ³; ç~æ\031\"\037\034\013Uwà6k-º§ÒF\037_ïH:ÊÐ£ÿé(9×4qÙ_ÎA|¿_r\002®i8\b*ÿO¿»\tlæôE¼$\036ÛÐ3ÿ(Ä±½ýåc^ÿ\027½Ýïÿ/sÁ\177HøªtF#r¿Ë9¤Q'îÂe2ÿÞàT(WKñm\022Ðæþ?=WYgo3t\035¡ÌÝÍÌèÿÚ2´,Ç\030ÌÎ*>\031³ý ê·HfJÅÝÜ·_3g(½\017Zx\b-£ä>*¤ÀÄ@@1\0277R\\[4Ü·-@z\007\020Ã´`\fåPþå1\")çéG²Ï\\+]Ojðß)!/ÛQë\032+*Áö\036vHþ\006fX\003@Û|¢0AºÜ\030\020.]°hQå.Ï@±êÃÖErwÀó\035u¹wjd=Ï{ôé×[)¨më|\030Ó½û8íHIÕÎÌü_Ö|º?Pº[oS\003P\tÒùGµ½®®°Ò\033m$i½wÆþ/UÕrR8ßÄ\b¿9pà¾þþ²)øôà\032c&\177ÖÒ3\036­ñï\001Ù·N\020\000\000¢\bG`Î¥n6m%ª\020X**ÿÌ]eÜà²Ö[\re²0u®\016ÈY\024q\026Ùr[bPíå]à1\002biT%gÛøÓ]W\017Ù/2'Y\027]z\005¤ö\020\177knÙàTs\t¢h;ÀN 8ùüHI\\þÒH\025ÄÇ7õpÖh´À¢Óõ\036!Ünï\020Gí\t\"ã_G\004Ü\031R60Å\026zé\033Â\030ë>of\037E5Ñå\016O×ÆÍ¸)7bø;.\021A\002µîU/È,:Ó\021$¤æ(³ê(¬\024&EÕ×[Jd÷fO<ëáÀþ°YpK\000\035GN\003­\031h\031)bës\030ûìcnVxÇËú^QjÓhÊd\000}¹.\016 Í`uMwGD®QÁq§Ì1d$Ît¼\002u\032Ù({YcW±È\020'ÖY[ÿ-íç¸×\006Ì\003@ÔatÃ3þÆåÆÖÞU³«=(æ»¹¢«¡M\000·qßã\024«Á\035±uê°hV`¡Ô»l©åX8:\bWÑè\0300¬Å=v{\003(ík\027Ì»¿ÕÏ^ú\0213H \t\\hJltSÝí\025HÝæ6W« \021\024]\026.RP"))).length();
    int local5_life24 = 32;
    int local4_life25 = -1;
    while (true) {
        local4_life25 += 1;
        byte[] __sourceSpill692_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill692_29 = local2_life9;
        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill692_29)).doFinal(((byte[])(__sourceSpill692_28)));
        java.lang.String __sourceSpill692_34 = ((java.lang.String)(moom.I8.a(((byte[])(local10_life31))))).intern();
        java.lang.String[] __sourceSpill692_35 = local9_life19;
        int __sourceSpill692_36 = local7_life20;
        local7_life20 += 1;
        (__sourceSpill692_35)[__sourceSpill692_36] = __sourceSpill692_34;
        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }
        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));
    }
    local8_life23 = ((java.lang.String)((local6_life21 = "ÿÅ î\tE\004<K ü¾ë\031Þp\005ÿûPßzèÍ\030Óév\025wÚ|A®\002ànï\\2ã( À¹K9À\fÄÖª÷ªOAj\017\035\037±r7k\fÐ\026#SÌÚs\026-"))).length();
    local5_life24 = 48;
    local4_life25 = -1;
    while (true) {
        local4_life25 += 1;
        byte[] __sourceSpill692_42 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill692_43 = local2_life9;
        byte[] local10_life45 = ((javax.crypto.Cipher)(__sourceSpill692_43)).doFinal(((byte[])(__sourceSpill692_42)));
        java.lang.String __sourceSpill692_48 = ((java.lang.String)(moom.I8.a(((byte[])(local10_life45))))).intern();
        java.lang.String[] __sourceSpill692_49 = local9_life19;
        int __sourceSpill692_50 = local7_life20;
        local7_life20 += 1;
        (__sourceSpill692_49)[__sourceSpill692_50] = __sourceSpill692_48;
        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }
        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));
    }
    t = ((java.lang.String[])(local9_life19));
    u = ((java.lang.String[])(new java.lang.String[31]));
    a = ((boolean)(true));
    b = ((boolean)(true));
    c = ((boolean)(true));
    d = ((boolean)(true));
    e = ((boolean)(true));
    f = ((boolean)(true));
    g = ((boolean)(false));
    h = ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(null));
    i = ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(null));
    j = ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(null));
    k = ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(null));
    l = ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(null));
    m = ((boolean)(false));
    n = ((net.minecraft.client.resources.model.IBakedModel)(null));
    o = ((net.minecraft.client.resources.model.IBakedModel)(null));
    p = ((net.minecraft.client.resources.model.IBakedModel)(null));
    q = ((net.minecraft.client.resources.model.IBakedModel)(null));
    r = ((boolean)(false));
}

private static native <E extends Throwable> void __sourceHandlerCall_337b5b8e7ac83ea29c61() throws E;
private static final class __SourceHandler_337b5b8e7ac83ea29c61 {

public static void f642() throws Throwable {
    int forwardValue642_15_0;
    int forwardValue642_39_0;
    boolean spill642_0;
    long life0_3;
    net.minecraft.entity.Entity[] life2_5;
    net.minecraft.client.resources.model.IBakedModel life3_30;
    forward_join_40: {
    forward_join_39: {
    forward_join_26: {
    forward_join_15: {
    life0_3 = (__fieldRead642_0() ^ 110935468510878L);
    life2_5 = __call642_1();
    spill642_0 = __fieldRead642_2();
    if (!((life2_5 != null))) {
        forwardValue642_15_0 = __integerCategory642_3(spill642_0);
        break forward_join_15;
    }
    if (!(spill642_0)) {
        break forward_join_40;
    }
    __fieldWrite642_6(__call642_5(__fieldRead642_4(), 0));
    forwardValue642_15_0 = __integerCategory642_8(__fieldRead642_7());
    }
    if (!((life2_5 != null))) {
        forwardValue642_39_0 = forwardValue642_15_0;
        break forward_join_39;
    }
    if (!((forwardValue642_15_0 != 0))) {
        break forward_join_26;
    }
    life3_30 = __call642_10(__fieldRead642_9(), -1);
    __fieldWrite642_13(__call642_12(life3_30, __fieldRead642_11()));
    }
    __fieldWrite642_16(__call642_15(__fieldRead642_14(), -1));
    __fieldWrite642_19(__call642_18(__fieldRead642_17(), 0));
    __fieldWrite642_22(__call642_21(__fieldRead642_20(), -1));
    forwardValue642_39_0 = 1;
    }
    __fieldWrite642_23(forwardValue642_39_0);
    }
    return;
}
public static void h642_0(moom.Oo p0) throws Throwable {
    throw __call1064200_0(p0);
}
public static void h642_1(moom.Oo p0) throws Throwable {
    throw __call1064201_0(p0);
}
public static void h642_2(moom.Oo p0) throws Throwable {
    throw __call1064202_0(p0);
}
private static native long __fieldRead642_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call642_1() throws Throwable;
private static native boolean __fieldRead642_2() throws Throwable;
private static native int __integerCategory642_3(boolean value) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __fieldRead642_4() throws Throwable;
private static native net.minecraft.client.resources.model.IBakedModel __call642_5(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1) throws Throwable;
private static native void __fieldWrite642_6(net.minecraft.client.resources.model.IBakedModel a0) throws Throwable;
private static native boolean __fieldRead642_7() throws Throwable;
private static native int __integerCategory642_8(boolean value) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __fieldRead642_9() throws Throwable;
private static native net.minecraft.client.resources.model.IBakedModel __call642_10(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1) throws Throwable;
private static native net.minecraft.client.resources.model.IBakedModel __fieldRead642_11() throws Throwable;
private static native net.minecraft.client.resources.model.IBakedModel __call642_12(net.minecraft.client.resources.model.IBakedModel a0, net.minecraft.client.resources.model.IBakedModel a1) throws Throwable;
private static native void __fieldWrite642_13(net.minecraft.client.resources.model.IBakedModel a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __fieldRead642_14() throws Throwable;
private static native net.minecraft.client.resources.model.IBakedModel __call642_15(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1) throws Throwable;
private static native void __fieldWrite642_16(net.minecraft.client.resources.model.IBakedModel a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __fieldRead642_17() throws Throwable;
private static native net.minecraft.client.resources.model.IBakedModel __call642_18(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1) throws Throwable;
private static native void __fieldWrite642_19(net.minecraft.client.resources.model.IBakedModel a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __fieldRead642_20() throws Throwable;
private static native net.minecraft.client.resources.model.IBakedModel __call642_21(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1) throws Throwable;
private static native void __fieldWrite642_22(net.minecraft.client.resources.model.IBakedModel a0) throws Throwable;
private static native void __fieldWrite642_23(int a0) throws Throwable;
private static native java.lang.Exception __call1064200_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1064201_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1064202_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.client.renderer.texture.TextureAtlasSprite __sourceHandlerCall_507d1220e0ab4572b97a(java.util.Properties a0, java.lang.String a1, java.lang.String a2, net.minecraft.client.renderer.texture.TextureMap a3) throws E;
private static final class __SourceHandler_507d1220e0ab4572b97a {

public static net.minecraft.client.renderer.texture.TextureAtlasSprite f100084(java.util.Properties p0, java.lang.String p1, java.lang.String p2, net.minecraft.client.renderer.texture.TextureMap p3) throws Throwable {
    java.lang.String forestValue100084_15_0;
    moom.DD forestValue100084_53_0;
    net.minecraft.entity.Entity[] spill100084_0;
    java.lang.String spill100084_1;
    moom.DD spill100084_2;
    long life4_3;
    java.lang.String life7_8;
    net.minecraft.entity.Entity[] life6_9;
    moom.DD life8_33;
    moom.DD life9_55;
    forest_join_53: {
    forest_join_49: {
    forest_join_16: {
    forest_join_15: {
    life4_3 = (__fieldRead100084_0() ^ 54162289058164L);
    spill100084_0 = __call100084_1();
    life7_8 = __call100084_2(p0, p1);
    life6_9 = spill100084_0;
    spill100084_1 = life7_8;
    if (!((life6_9 != null))) {
        forestValue100084_15_0 = spill100084_1;
        break forest_join_15;
    }
    if (!((spill100084_1 == null))) {
        break forest_join_16;
    }
    forestValue100084_15_0 = p2;
    }
    life7_8 = forestValue100084_15_0;
    }
    java.lang.Object __inlineStack100084_4Token;
    life8_33 = new moom.DD(__invokedynamic100084_6(__inlineStack100084_4Output0((__inlineStack100084_4Token = __inlineStack100084_4Pack(life7_8, __invokedynamic100084_3(2457, (74268253754906480L ^ life4_3))))), __inlineStack100084_4Output1(__inlineStack100084_4Token), __invokedynamic100084_5(29567, (1909058653289196941L ^ life4_3))));
    spill100084_2 = life8_33;
    if (!((life6_9 != null))) {
        forestValue100084_53_0 = spill100084_2;
        break forest_join_53;
    }
    if (!((!__call100084_7(spill100084_2)))) {
        break forest_join_49;
    }
    moom.DD __stackOp100084_9_0 = life8_33;
    java.lang.String __stackOp100084_9_1 = __invokedynamic100084_8(1329, (3160073317475900358L ^ life4_3));
    __call100084_11(__invokedynamic100084_10(__stackOp100084_9_1, __stackOp100084_9_0));
    life7_8 = p2;
    }
    forestValue100084_53_0 = new moom.DD(life7_8);
    }
    life9_55 = forestValue100084_53_0;
    return __call100084_12(p3, life9_55);
}
public static net.minecraft.client.renderer.texture.TextureAtlasSprite h100084_0(moom.Oo p0) throws Throwable {
    throw __call13008400_0(p0);
}
public static net.minecraft.client.renderer.texture.TextureAtlasSprite h100084_1(moom.Oo p0) throws Throwable {
    throw __call13008401_0(p0);
}
private static native long __fieldRead100084_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call100084_1() throws Throwable;
private static native java.lang.String __call100084_2(java.util.Properties a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic100084_3(int a0, long a1) throws Throwable;
private static native java.lang.Object __inlineStack100084_4Pack(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __inlineStack100084_4Output0(java.lang.Object token) throws Throwable;
private static native java.lang.String __inlineStack100084_4Output1(java.lang.Object token) throws Throwable;
private static native java.lang.String __invokedynamic100084_5(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic100084_6(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native boolean __call100084_7(moom.DD a0) throws Throwable;
private static native java.lang.String __invokedynamic100084_8(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic100084_10(java.lang.String a0, moom.DD a1) throws Throwable;
private static native void __call100084_11(java.lang.String a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __call100084_12(net.minecraft.client.renderer.texture.TextureMap a0, moom.DD a1) throws Throwable;
private static native java.lang.Exception __call13008400_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call13008401_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_909376c4cc580ce06280(java.util.Properties a0, java.lang.String a1, boolean a2) throws E;
private static final class __SourceHandler_909376c4cc580ce06280 {

public static boolean f644(java.util.Properties p0, java.lang.String p1, boolean p2) throws Throwable {
    java.lang.String forwardValue644_17_0;
    int forwardValue644_18_0;
    net.minecraft.entity.Entity[] spill644_0;
    java.lang.String spill644_1;
    long life3_3;
    java.lang.String life6_8;
    net.minecraft.entity.Entity[] life5_9;
    forward_join_18: {
    forward_join_17: {
    forward_join_16: {
    life3_3 = (__fieldRead644_0() ^ 137496661548437L);
    spill644_0 = __call644_1();
    life6_8 = __call644_2(p0, p1);
    life5_9 = spill644_0;
    spill644_1 = life6_8;
    if (!((life5_9 != null))) {
        forwardValue644_17_0 = spill644_1;
        break forward_join_17;
    }
    if (!((spill644_1 == null))) {
        break forward_join_16;
    }
    forwardValue644_18_0 = __integerCategory644_3(p2);
    break forward_join_18;
    }
    forwardValue644_17_0 = life6_8;
    }
    forwardValue644_18_0 = __integerCategory644_5(__call644_4(forwardValue644_17_0));
    }
    return __integerCategory644_6(forwardValue644_18_0);
}
public static void h644_0(moom.Oo p0) throws Throwable {
    throw __call1064400_0(p0);
}
public static void h644_1(moom.Oo p0) throws Throwable {
    throw __call1064401_0(p0);
}
private static native long __fieldRead644_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call644_1() throws Throwable;
private static native java.lang.String __call644_2(java.util.Properties a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory644_3(boolean value) throws Throwable;
private static native boolean __call644_4(java.lang.String a0) throws Throwable;
private static native int __integerCategory644_5(boolean value) throws Throwable;
private static native boolean __integerCategory644_6(int value) throws Throwable;
private static native java.lang.Exception __call1064400_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1064401_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> java.util.List __sourceHandlerCall_e9b5f2acc8319aeea33b(net.minecraft.world.IBlockAccess a0, net.minecraft.block.state.IBlockState a1, moom.DT a2, moom.bs a3, java.util.List a4) throws E;
private static final class __SourceHandler_e9b5f2acc8319aeea33b {

public static java.util.List f645(net.minecraft.world.IBlockAccess p0, net.minecraft.block.state.IBlockState p1, moom.DT p2, moom.bs p3, java.util.List p4) throws Throwable {
    moom.bs forwardValue645_13_0;
    moom.bs forwardValue645_13_1;
    int forwardValue645_35_0;
    int forwardValue645_47_0;
    java.util.List forwardValue645_56_0;
    moom.bs spill645_0;
    moom.bs spill645_1;
    int spill645_2;
    long life5_3;
    net.minecraft.entity.Entity[] life7_5;
    net.minecraft.block.Block life8_31;
    forward_join_57: {
    forward_join_56: {
    forward_join_55: {
    forward_join_47: {
    forward_join_45: {
    forward_join_35: {
    forward_join_33: {
    forward_join_18: {
    forward_join_13: {
    life5_3 = (__fieldRead645_0() ^ 120338034647508L);
    life7_5 = __call645_1();
    spill645_0 = p3;
    spill645_1 = __fieldRead645_2();
    if (!((life7_5 != null))) {
        forwardValue645_13_0 = spill645_0;
        forwardValue645_13_1 = spill645_1;
        break forward_join_13;
    }
    if (!((spill645_0 != spill645_1))) {
        break forward_join_57;
    }
    forwardValue645_13_0 = p3;
    forwardValue645_13_1 = __fieldRead645_3();
    }
    if (!((forwardValue645_13_0 != forwardValue645_13_1))) {
        break forward_join_57;
    }
    if (!((!__fieldRead645_4()))) {
        break forward_join_18;
    }
    return p4;
    }
    life8_31 = __call645_5(p1);
    spill645_2 = __instanceOf645_6(life8_31);
    if (!((life7_5 != null))) {
        forwardValue645_35_0 = spill645_2;
        break forward_join_35;
    }
    if (!((spill645_2 != 0))) {
        break forward_join_33;
    }
    forwardValue645_56_0 = __call645_7(p0, p1, p2, p3, p4);
    break forward_join_56;
    }
    forwardValue645_35_0 = __instanceOf645_8(life8_31);
    }
    if (!((life7_5 != null))) {
        forwardValue645_47_0 = forwardValue645_35_0;
        break forward_join_47;
    }
    if (!((forwardValue645_35_0 != 0))) {
        break forward_join_45;
    }
    forwardValue645_56_0 = __call645_9(p0, p1, p2, p3, p4);
    break forward_join_56;
    }
    forwardValue645_47_0 = __instanceOf645_10(life8_31);
    }
    if (!((forwardValue645_47_0 != 0))) {
        break forward_join_55;
    }
    forwardValue645_56_0 = __call645_11(p0, p1, p2, p3, p4);
    break forward_join_56;
    }
    forwardValue645_56_0 = p4;
    }
    return forwardValue645_56_0;
    }
    return p4;
}
public static void h645_0(moom.Oo p0) throws Throwable {
    throw __call1064500_0(p0);
}
public static void h645_1(moom.Oo p0) throws Throwable {
    throw __call1064501_0(p0);
}
public static void h645_2(moom.Oo p0) throws Throwable {
    throw __call1064502_0(p0);
}
public static void h645_3(moom.Oo p0) throws Throwable {
    throw __call1064503_0(p0);
}
public static void h645_4(moom.Oo p0) throws Throwable {
    throw __call1064504_0(p0);
}
public static void h645_5(moom.Oo p0) throws Throwable {
    throw __call1064505_0(p0);
}
public static void h645_6(moom.Oo p0) throws Throwable {
    throw __call1064506_0(p0);
}
public static void h645_7(moom.Oo p0) throws Throwable {
    throw __call1064507_0(p0);
}
public static void h645_8(moom.Oo p0) throws Throwable {
    throw __call1064508_0(p0);
}
private static native long __fieldRead645_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call645_1() throws Throwable;
private static native moom.bs __fieldRead645_2() throws Throwable;
private static native moom.bs __fieldRead645_3() throws Throwable;
private static native boolean __fieldRead645_4() throws Throwable;
private static native net.minecraft.block.Block __call645_5(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native int __instanceOf645_6(net.minecraft.block.Block a0) throws Throwable;
private static native java.util.List __call645_7(net.minecraft.world.IBlockAccess a0, net.minecraft.block.state.IBlockState a1, moom.DT a2, moom.bs a3, java.util.List a4) throws Throwable;
private static native int __instanceOf645_8(net.minecraft.block.Block a0) throws Throwable;
private static native java.util.List __call645_9(net.minecraft.world.IBlockAccess a0, net.minecraft.block.state.IBlockState a1, moom.DT a2, moom.bs a3, java.util.List a4) throws Throwable;
private static native int __instanceOf645_10(net.minecraft.block.Block a0) throws Throwable;
private static native java.util.List __call645_11(net.minecraft.world.IBlockAccess a0, net.minecraft.block.state.IBlockState a1, moom.DT a2, moom.bs a3, java.util.List a4) throws Throwable;
private static native java.lang.Exception __call1064500_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1064501_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1064502_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1064503_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1064504_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1064505_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1064506_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1064507_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1064508_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_253593680fa970c25a2d(net.minecraft.client.renderer.texture.TextureMap a0) throws E;
private static final class __SourceHandler_253593680fa970c25a2d {

public static void f116(net.minecraft.client.renderer.texture.TextureMap p0) throws Throwable {
    moom.DD forwardValue116_93_0;
    net.minecraft.entity.Entity[] spill116_0;
    moom.DD spill116_1;
    long life1_3;
    net.minecraft.entity.Entity[] life3_61;
    java.lang.String life4_80;
    moom.DD life5_85;
    java.io.InputStream life6_97;
    int life7_103;
    moom.OH life8_140;
    forward_join_125: {
    forward_join_116: {
    forward_join_114: {
    forward_join_98: {
    forward_join_93: {
    forward_join_92: {
    life1_3 = (__fieldRead116_0() ^ 114879511319890L);
    __fieldWrite116_1(1);
    spill116_0 = __call116_2();
    __fieldWrite116_3(1);
    __fieldWrite116_4(1);
    __fieldWrite116_5(1);
    __fieldWrite116_6(1);
    __fieldWrite116_7(1);
    __fieldWrite116_10(__call116_9(p0, new moom.DD(__invokedynamic116_8(17390, (6144444119503808800L ^ life1_3)))));
    __fieldWrite116_13(__call116_12(p0, new moom.DD(__invokedynamic116_11(23101, (3440574873153253603L ^ life1_3)))));
    __fieldWrite116_16(__call116_15(p0, new moom.DD(__invokedynamic116_14(7796, (3219966185230857393L ^ life1_3)))));
    __fieldWrite116_19(__call116_18(p0, new moom.DD(__invokedynamic116_17(28696, (5620943919982025421L ^ life1_3)))));
    life3_61 = spill116_0;
    __fieldWrite116_22(__call116_21(p0, new moom.DD(__invokedynamic116_20(1512, (2495224809066229538L ^ life1_3)))));
    __fieldWrite116_23(1);
    life4_80 = __invokedynamic116_24(7976, (3668601568958477809L ^ life1_3));
    life5_85 = new moom.DD(life4_80);
    spill116_1 = life5_85;
    if (!((life3_61 != null))) {
        forwardValue116_93_0 = spill116_1;
        break forward_join_93;
    }
    if (!((!__call116_25(spill116_1)))) {
        break forward_join_92;
    }
    return;
    }
    forwardValue116_93_0 = life5_85;
    }
    life6_97 = __call116_26(forwardValue116_93_0);
    if (!((life6_97 == null))) {
        break forward_join_98;
    }
    return;
    }
    life7_103 = __integerCategory116_28(__call116_27(life5_85));
    if (!((life3_61 != null))) {
        break forward_join_114;
    }
    if (!((life7_103 != 0))) {
        break forward_join_116;
    }
    java.lang.String __stackOp116_30_0 = life4_80;
    java.lang.String __stackOp116_30_1 = __invokedynamic116_29(697, (4314139578640001138L ^ life1_3));
    __call116_32(__invokedynamic116_31(__stackOp116_30_1, __stackOp116_30_0));
    }
    if (!((life3_61 == null))) {
        break forward_join_125;
    }
    }
    java.lang.String __stackOp116_34_0 = life4_80;
    java.lang.String __stackOp116_34_1 = __invokedynamic116_33(22948, (8926434516092531564L ^ life1_3));
    __call116_36(__invokedynamic116_35(__stackOp116_34_1, __stackOp116_34_0));
    }
    life8_140 = new moom.OH();
    __call116_37(life8_140, life6_97);
    __call116_38(life6_97);
    __fieldWrite116_41(__call116_40(life8_140, __invokedynamic116_39(12078, (2227043099208369656L ^ life1_3)), 1));
    __fieldWrite116_44(__call116_43(life8_140, __invokedynamic116_42(12169, (2634147099990738254L ^ life1_3)), 1));
    __fieldWrite116_47(__call116_46(life8_140, __invokedynamic116_45(3623, (19424121815819511L ^ life1_3)), 1));
    __fieldWrite116_50(__call116_49(life8_140, __invokedynamic116_48(15595, (1308389941878576700L ^ life1_3)), 1));
    __fieldWrite116_53(__call116_52(life8_140, __invokedynamic116_51(18816, (4541323329804903260L ^ life1_3)), 1));
    __fieldWrite116_56(__call116_55(life8_140, __invokedynamic116_54(13397, (1272158365998243469L ^ life1_3)), 1));
    __fieldWrite116_59(__call116_58(life8_140, __invokedynamic116_57(17886, (202928944960417555L ^ life1_3)), 0));
    __fieldWrite116_63(__call116_62(life8_140, __invokedynamic116_60(26147, (3164424637017853168L ^ life1_3)), __invokedynamic116_61(26153, (8777600398189137125L ^ life1_3)), p0));
    __fieldWrite116_67(__call116_66(life8_140, __invokedynamic116_64(23020, (2281800137677091621L ^ life1_3)), __invokedynamic116_65(25751, (7655703609772805701L ^ life1_3)), p0));
    __fieldWrite116_71(__call116_70(life8_140, __invokedynamic116_68(9025, (7072095005520546204L ^ life1_3)), __invokedynamic116_69(6548, (4436553072059741008L ^ life1_3)), p0));
    __fieldWrite116_75(__call116_74(life8_140, __invokedynamic116_72(10053, (8497957414584176007L ^ life1_3)), __invokedynamic116_73(20996, (1276343494714013918L ^ life1_3)), p0));
    __fieldWrite116_79(__call116_78(life8_140, __invokedynamic116_76(2374, (8622816249944368007L ^ life1_3)), __invokedynamic116_77(13258, (990394955483666697L ^ life1_3)), p0));
    return;
}
public static void h116_0(java.io.IOException p0) throws Throwable {
    throw __call2011600_0(p0);
}
public static void h116_1(java.io.IOException p0) throws Throwable {
    throw __call2011601_0(p0);
}
public static void h116_2(java.io.IOException p0) throws Throwable {
    throw __call2011602_0(p0);
}
public static void h116_3(java.io.IOException p0) throws Throwable {
    throw __call2011603_0(p0);
}
public static void h116_4(java.io.IOException p0, long p1, java.lang.String p2) throws Throwable {
    java.io.IOException local4 = p0;
    int spill2011604_0 = 16538;
    java.lang.String spill2011604_1 = p2;
    java.lang.String spill2011604_2 = __call2011604_1(__call2011604_0(local4));
    java.lang.String local5 = __call2011604_2(local4);
    java.lang.String local6 = spill2011604_2;
    java.lang.String local7 = spill2011604_1;
    __call2011604_7(__invokedynamic2011604_6(__invokedynamic2011604_3(spill2011604_0, (8417966078544325189L ^ p1)), local7, __invokedynamic2011604_4(23610, (218707587109205756L ^ p1)), local6, __invokedynamic2011604_5(19247, (8676388459512570351L ^ p1)), local5));
    return;
}
private static native long __fieldRead116_0() throws Throwable;
private static native void __fieldWrite116_1(int a0) throws Throwable;
private static native net.minecraft.entity.Entity[] __call116_2() throws Throwable;
private static native void __fieldWrite116_3(int a0) throws Throwable;
private static native void __fieldWrite116_4(int a0) throws Throwable;
private static native void __fieldWrite116_5(int a0) throws Throwable;
private static native void __fieldWrite116_6(int a0) throws Throwable;
private static native void __fieldWrite116_7(int a0) throws Throwable;
private static native java.lang.String __invokedynamic116_8(int a0, long a1) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __call116_9(net.minecraft.client.renderer.texture.TextureMap a0, moom.DD a1) throws Throwable;
private static native void __fieldWrite116_10(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native java.lang.String __invokedynamic116_11(int a0, long a1) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __call116_12(net.minecraft.client.renderer.texture.TextureMap a0, moom.DD a1) throws Throwable;
private static native void __fieldWrite116_13(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native java.lang.String __invokedynamic116_14(int a0, long a1) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __call116_15(net.minecraft.client.renderer.texture.TextureMap a0, moom.DD a1) throws Throwable;
private static native void __fieldWrite116_16(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native java.lang.String __invokedynamic116_17(int a0, long a1) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __call116_18(net.minecraft.client.renderer.texture.TextureMap a0, moom.DD a1) throws Throwable;
private static native void __fieldWrite116_19(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native java.lang.String __invokedynamic116_20(int a0, long a1) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __call116_21(net.minecraft.client.renderer.texture.TextureMap a0, moom.DD a1) throws Throwable;
private static native void __fieldWrite116_22(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native void __fieldWrite116_23(int a0) throws Throwable;
private static native java.lang.String __invokedynamic116_24(int a0, long a1) throws Throwable;
private static native boolean __call116_25(moom.DD a0) throws Throwable;
private static native java.io.InputStream __call116_26(moom.DD a0) throws Throwable;
private static native boolean __call116_27(moom.DD a0) throws Throwable;
private static native int __integerCategory116_28(boolean value) throws Throwable;
private static native java.lang.String __invokedynamic116_29(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic116_31(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call116_32(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic116_33(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic116_35(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call116_36(java.lang.String a0) throws Throwable;
private static native void __call116_37(moom.OH a0, java.io.InputStream a1) throws Throwable;
private static native void __call116_38(java.io.InputStream a0) throws Throwable;
private static native java.lang.String __invokedynamic116_39(int a0, long a1) throws Throwable;
private static native boolean __call116_40(moom.OH a0, java.lang.String a1, int a2) throws Throwable;
private static native void __fieldWrite116_41(boolean a0) throws Throwable;
private static native java.lang.String __invokedynamic116_42(int a0, long a1) throws Throwable;
private static native boolean __call116_43(moom.OH a0, java.lang.String a1, int a2) throws Throwable;
private static native void __fieldWrite116_44(boolean a0) throws Throwable;
private static native java.lang.String __invokedynamic116_45(int a0, long a1) throws Throwable;
private static native boolean __call116_46(moom.OH a0, java.lang.String a1, int a2) throws Throwable;
private static native void __fieldWrite116_47(boolean a0) throws Throwable;
private static native java.lang.String __invokedynamic116_48(int a0, long a1) throws Throwable;
private static native boolean __call116_49(moom.OH a0, java.lang.String a1, int a2) throws Throwable;
private static native void __fieldWrite116_50(boolean a0) throws Throwable;
private static native java.lang.String __invokedynamic116_51(int a0, long a1) throws Throwable;
private static native boolean __call116_52(moom.OH a0, java.lang.String a1, int a2) throws Throwable;
private static native void __fieldWrite116_53(boolean a0) throws Throwable;
private static native java.lang.String __invokedynamic116_54(int a0, long a1) throws Throwable;
private static native boolean __call116_55(moom.OH a0, java.lang.String a1, int a2) throws Throwable;
private static native void __fieldWrite116_56(boolean a0) throws Throwable;
private static native java.lang.String __invokedynamic116_57(int a0, long a1) throws Throwable;
private static native boolean __call116_58(moom.OH a0, java.lang.String a1, int a2) throws Throwable;
private static native void __fieldWrite116_59(boolean a0) throws Throwable;
private static native java.lang.String __invokedynamic116_60(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic116_61(int a0, long a1) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __call116_62(moom.OH a0, java.lang.String a1, java.lang.String a2, net.minecraft.client.renderer.texture.TextureMap a3) throws Throwable;
private static native void __fieldWrite116_63(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native java.lang.String __invokedynamic116_64(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic116_65(int a0, long a1) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __call116_66(moom.OH a0, java.lang.String a1, java.lang.String a2, net.minecraft.client.renderer.texture.TextureMap a3) throws Throwable;
private static native void __fieldWrite116_67(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native java.lang.String __invokedynamic116_68(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic116_69(int a0, long a1) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __call116_70(moom.OH a0, java.lang.String a1, java.lang.String a2, net.minecraft.client.renderer.texture.TextureMap a3) throws Throwable;
private static native void __fieldWrite116_71(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native java.lang.String __invokedynamic116_72(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic116_73(int a0, long a1) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __call116_74(moom.OH a0, java.lang.String a1, java.lang.String a2, net.minecraft.client.renderer.texture.TextureMap a3) throws Throwable;
private static native void __fieldWrite116_75(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native java.lang.String __invokedynamic116_76(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic116_77(int a0, long a1) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __call116_78(moom.OH a0, java.lang.String a1, java.lang.String a2, net.minecraft.client.renderer.texture.TextureMap a3) throws Throwable;
private static native void __fieldWrite116_79(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native java.lang.Exception __call2011600_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2011601_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2011602_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2011603_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Class __call2011604_0(java.io.IOException a0) throws Throwable;
private static native java.lang.String __call2011604_1(java.lang.Class a0) throws Throwable;
private static native java.lang.String __call2011604_2(java.io.IOException a0) throws Throwable;
private static native java.lang.String __invokedynamic2011604_3(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic2011604_4(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic2011604_5(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic2011604_6(java.lang.String a0, java.lang.String a1, java.lang.String a2, java.lang.String a3, java.lang.String a4, java.lang.String a5) throws Throwable;
private static native void __call2011604_7(java.lang.String a0) throws Throwable;

}

private static native <E extends Throwable> java.util.List __sourceHandlerCall_a8385bb335490c940d24(net.minecraft.world.IBlockAccess a0, net.minecraft.block.state.IBlockState a1, moom.DT a2, moom.bs a3, java.util.List a4) throws E;
private static final class __SourceHandler_a8385bb335490c940d24 {

public static java.util.List f646(net.minecraft.world.IBlockAccess p0, net.minecraft.block.state.IBlockState p1, moom.DT p2, moom.bs p3, java.util.List p4) throws Throwable {
    net.minecraft.block.Block forwardValue646_19_0;
    net.minecraft.block.Block forwardValue646_19_1;
    int forwardValue646_23_0;
    int forwardValue646_45_0;
    int forwardValue646_58_0;
    int forwardValue646_68_0;
    net.minecraft.entity.Entity[] spill646_0;
    net.minecraft.block.Block spill646_1;
    net.minecraft.block.Block spill646_2;
    boolean spill646_3;
    int spill646_4;
    long life5_3;
    net.minecraft.block.Block life8_10;
    net.minecraft.entity.Entity[] life7_11;
    int life9_31;
    forward_join_73: {
    forward_join_68: {
    forward_join_67: {
    forward_join_58: {
    forward_join_57: {
    forward_join_45: {
    forward_join_44: {
    forward_join_23: {
    forward_join_22: {
    forward_join_20: {
    forward_join_19: {
    life5_3 = (__fieldRead646_0() ^ 99290208633674L);
    spill646_0 = __call646_1();
    life8_10 = __call646_4(__call646_3(p0, __call646_2(p2)));
    life7_11 = spill646_0;
    spill646_1 = life8_10;
    spill646_2 = __fieldRead646_5();
    if (!((life7_11 != null))) {
        forwardValue646_19_0 = spill646_1;
        forwardValue646_19_1 = spill646_2;
        break forward_join_19;
    }
    if (!((spill646_1 != spill646_2))) {
        break forward_join_20;
    }
    forwardValue646_19_0 = life8_10;
    forwardValue646_19_1 = __fieldRead646_6();
    }
    if (!((forwardValue646_19_0 == forwardValue646_19_1))) {
        break forward_join_22;
    }
    }
    forwardValue646_23_0 = 1;
    break forward_join_23;
    }
    forwardValue646_23_0 = 0;
    }
    life9_31 = forwardValue646_23_0;
    spill646_3 = __call646_7();
    if (!((life7_11 != null))) {
        forwardValue646_58_0 = __integerCategory646_8(spill646_3);
        break forward_join_58;
    }
    if (!(spill646_3)) {
        break forward_join_57;
    }
    spill646_4 = life9_31;
    if (!((life7_11 != null))) {
        forwardValue646_45_0 = spill646_4;
        break forward_join_45;
    }
    if (!((spill646_4 != 0))) {
        break forward_join_44;
    }
    if (!(__fieldRead646_9())) {
        break forward_join_73;
    }
    if (!((__call646_10(p2, p3, p0) == __fieldRead646_11()))) {
        break forward_join_73;
    }
    return __call646_13(__fieldRead646_12(), p3);
    }
    forwardValue646_45_0 = __integerCategory646_15(__fieldRead646_14());
    }
    if (!((forwardValue646_45_0 != 0))) {
        break forward_join_73;
    }
    if (!((__call646_17(__call646_16(p2), p3, p0) == __fieldRead646_18()))) {
        break forward_join_73;
    }
    return __call646_20(__fieldRead646_19(), p3);
    }
    forwardValue646_58_0 = life9_31;
    }
    if (!((life7_11 != null))) {
        forwardValue646_68_0 = forwardValue646_58_0;
        break forward_join_68;
    }
    if (!((forwardValue646_58_0 != 0))) {
        break forward_join_67;
    }
    if (!(__fieldRead646_21())) {
        break forward_join_73;
    }
    return __call646_23(__fieldRead646_22(), p3);
    }
    forwardValue646_68_0 = __integerCategory646_25(__fieldRead646_24());
    }
    if (!((forwardValue646_68_0 != 0))) {
        break forward_join_73;
    }
    return __call646_27(__fieldRead646_26(), p3);
    }
    return p4;
}
public static void h646_0(moom.Oo p0) throws Throwable {
    throw __call1064600_0(p0);
}
public static void h646_1(moom.Oo p0) throws Throwable {
    throw __call1064601_0(p0);
}
public static void h646_2(moom.Oo p0) throws Throwable {
    throw __call1064602_0(p0);
}
public static void h646_3(moom.Oo p0) throws Throwable {
    throw __call1064603_0(p0);
}
public static void h646_4(moom.Oo p0) throws Throwable {
    throw __call1064604_0(p0);
}
public static void h646_5(moom.Oo p0) throws Throwable {
    throw __call1064605_0(p0);
}
public static void h646_6(moom.Oo p0) throws Throwable {
    throw __call1064606_0(p0);
}
public static void h646_7(moom.Oo p0) throws Throwable {
    throw __call1064607_0(p0);
}
public static void h646_8(moom.Oo p0) throws Throwable {
    throw __call1064608_0(p0);
}
public static void h646_9(moom.Oo p0) throws Throwable {
    throw __call1064609_0(p0);
}
public static void h646_10(moom.Oo p0) throws Throwable {
    throw __call1064610_0(p0);
}
public static void h646_11(moom.Oo p0) throws Throwable {
    throw __call1064611_0(p0);
}
public static void h646_12(moom.Oo p0) throws Throwable {
    throw __call1064612_0(p0);
}
public static void h646_13(moom.Oo p0) throws Throwable {
    throw __call1064613_0(p0);
}
public static void h646_14(moom.Oo p0) throws Throwable {
    throw __call1064614_0(p0);
}
private static native long __fieldRead646_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call646_1() throws Throwable;
private static native moom.DT __call646_2(moom.DT a0) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call646_3(net.minecraft.world.IBlockAccess a0, moom.DT a1) throws Throwable;
private static native net.minecraft.block.Block __call646_4(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead646_5() throws Throwable;
private static native net.minecraft.block.Block __fieldRead646_6() throws Throwable;
private static native boolean __call646_7() throws Throwable;
private static native int __integerCategory646_8(boolean value) throws Throwable;
private static native boolean __fieldRead646_9() throws Throwable;
private static native net.minecraft.block.Block __call646_10(moom.DT a0, moom.bs a1, net.minecraft.world.IBlockAccess a2) throws Throwable;
private static native net.minecraft.block.Block __fieldRead646_11() throws Throwable;
private static native net.minecraft.client.resources.model.IBakedModel __fieldRead646_12() throws Throwable;
private static native java.util.List __call646_13(net.minecraft.client.resources.model.IBakedModel a0, moom.bs a1) throws Throwable;
private static native boolean __fieldRead646_14() throws Throwable;
private static native int __integerCategory646_15(boolean value) throws Throwable;
private static native moom.DT __call646_16(moom.DT a0) throws Throwable;
private static native net.minecraft.block.Block __call646_17(moom.DT a0, moom.bs a1, net.minecraft.world.IBlockAccess a2) throws Throwable;
private static native moom.dP __fieldRead646_18() throws Throwable;
private static native net.minecraft.client.resources.model.IBakedModel __fieldRead646_19() throws Throwable;
private static native java.util.List __call646_20(net.minecraft.client.resources.model.IBakedModel a0, moom.bs a1) throws Throwable;
private static native boolean __fieldRead646_21() throws Throwable;
private static native net.minecraft.client.resources.model.IBakedModel __fieldRead646_22() throws Throwable;
private static native java.util.List __call646_23(net.minecraft.client.resources.model.IBakedModel a0, moom.bs a1) throws Throwable;
private static native boolean __fieldRead646_24() throws Throwable;
private static native int __integerCategory646_25(boolean value) throws Throwable;
private static native net.minecraft.client.resources.model.IBakedModel __fieldRead646_26() throws Throwable;
private static native java.util.List __call646_27(net.minecraft.client.resources.model.IBakedModel a0, moom.bs a1) throws Throwable;
private static native java.lang.Exception __call1064600_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1064601_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1064602_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1064603_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1064604_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1064605_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1064606_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1064607_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1064608_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1064609_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1064610_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1064611_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1064612_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1064613_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1064614_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> java.util.List __sourceHandlerCall_2045d338402823f605fe(net.minecraft.world.IBlockAccess a0, net.minecraft.block.state.IBlockState a1, moom.DT a2, moom.bs a3, java.util.List a4) throws E;
private static final class __SourceHandler_2045d338402823f605fe {

public static java.util.List f647(net.minecraft.world.IBlockAccess p0, net.minecraft.block.state.IBlockState p1, moom.DT p2, moom.bs p3, java.util.List p4) throws Throwable {
    net.minecraft.block.Block forwardValue647_25_0;
    net.minecraft.block.Block forwardValue647_25_1;
    int forwardValue647_29_0;
    int forwardValue647_51_0;
    net.minecraft.block.state.IBlockState forwardValue647_68_0;
    int forwardValue647_79_0;
    int forwardValue647_89_0;
    net.minecraft.entity.Entity[] spill647_0;
    net.minecraft.block.Block spill647_1;
    net.minecraft.block.Block spill647_2;
    boolean spill647_3;
    int spill647_4;
    net.minecraft.block.state.IBlockState spill647_5;
    long life5_3;
    net.minecraft.block.Block life8_9;
    net.minecraft.entity.Entity[] life7_10;
    int life9_39;
    moom.DT life10_83;
    net.minecraft.block.state.IBlockState life11_87;
    forward_join_94: {
    forward_join_89: {
    forward_join_88: {
    forward_join_79: {
    forward_join_78: {
    forward_join_76: {
    forward_join_68: {
    forward_join_51: {
    forward_join_50: {
    forward_join_29: {
    forward_join_28: {
    forward_join_26: {
    forward_join_25: {
    forward_join_18: {
    life5_3 = (__fieldRead647_0() ^ 83255873913206L);
    spill647_0 = __call647_1();
    life8_9 = __call647_3(p2, __fieldRead647_2(), p0);
    life7_10 = spill647_0;
    if (!((__call647_5(p1, __fieldRead647_4()) != __fieldRead647_6()))) {
        break forward_join_18;
    }
    return p4;
    }
    spill647_1 = life8_9;
    spill647_2 = __fieldRead647_7();
    if (!((life7_10 != null))) {
        forwardValue647_25_0 = spill647_1;
        forwardValue647_25_1 = spill647_2;
        break forward_join_25;
    }
    if (!((spill647_1 != spill647_2))) {
        break forward_join_26;
    }
    forwardValue647_25_0 = life8_9;
    forwardValue647_25_1 = __fieldRead647_8();
    }
    if (!((forwardValue647_25_0 == forwardValue647_25_1))) {
        break forward_join_28;
    }
    }
    forwardValue647_29_0 = 1;
    break forward_join_29;
    }
    forwardValue647_29_0 = 0;
    }
    life9_39 = forwardValue647_29_0;
    spill647_3 = __call647_9();
    if (!((life7_10 != null))) {
        forwardValue647_79_0 = __integerCategory647_10(spill647_3);
        break forward_join_79;
    }
    if (!(spill647_3)) {
        break forward_join_78;
    }
    spill647_4 = life9_39;
    if (!((life7_10 != null))) {
        forwardValue647_51_0 = spill647_4;
        break forward_join_51;
    }
    if (!((spill647_4 != 0))) {
        break forward_join_50;
    }
    if (!(__fieldRead647_11())) {
        break forward_join_94;
    }
    if (!((__call647_12(p2, p3, p0) == __fieldRead647_13()))) {
        break forward_join_94;
    }
    return __call647_15(__fieldRead647_14(), p3);
    }
    forwardValue647_51_0 = __integerCategory647_17(__fieldRead647_16());
    }
    if (!((forwardValue647_51_0 != 0))) {
        break forward_join_94;
    }
    life10_83 = __call647_19(__call647_18(p2), p3);
    life11_87 = __call647_20(p0, life10_83);
    spill647_5 = life11_87;
    if (!((life7_10 != null))) {
        forwardValue647_68_0 = spill647_5;
        break forward_join_68;
    }
    if (!((__call647_21(spill647_5) == __fieldRead647_22()))) {
        break forward_join_76;
    }
    forwardValue647_68_0 = life11_87;
    }
    if (!((__call647_24(forwardValue647_68_0, __fieldRead647_23()) == __fieldRead647_25()))) {
        break forward_join_76;
    }
    return __call647_27(__fieldRead647_26(), p3);
    }
    if (!((life7_10 == null))) {
        break forward_join_94;
    }
    }
    forwardValue647_79_0 = life9_39;
    }
    if (!((life7_10 != null))) {
        forwardValue647_89_0 = forwardValue647_79_0;
        break forward_join_89;
    }
    if (!((forwardValue647_79_0 != 0))) {
        break forward_join_88;
    }
    if (!(__fieldRead647_28())) {
        break forward_join_94;
    }
    return __call647_30(__fieldRead647_29(), p3);
    }
    forwardValue647_89_0 = __integerCategory647_32(__fieldRead647_31());
    }
    if (!((forwardValue647_89_0 != 0))) {
        break forward_join_94;
    }
    return __call647_34(__fieldRead647_33(), p3);
    }
    return p4;
}
public static void h647_0(moom.Oo p0) throws Throwable {
    throw __call1064700_0(p0);
}
public static void h647_1(moom.Oo p0) throws Throwable {
    throw __call1064701_0(p0);
}
public static void h647_2(moom.Oo p0) throws Throwable {
    throw __call1064702_0(p0);
}
public static void h647_3(moom.Oo p0) throws Throwable {
    throw __call1064703_0(p0);
}
public static void h647_4(moom.Oo p0) throws Throwable {
    throw __call1064704_0(p0);
}
public static void h647_5(moom.Oo p0) throws Throwable {
    throw __call1064705_0(p0);
}
public static void h647_6(moom.Oo p0) throws Throwable {
    throw __call1064706_0(p0);
}
public static void h647_7(moom.Oo p0) throws Throwable {
    throw __call1064707_0(p0);
}
public static void h647_8(moom.Oo p0) throws Throwable {
    throw __call1064708_0(p0);
}
public static void h647_9(moom.Oo p0) throws Throwable {
    throw __call1064709_0(p0);
}
public static void h647_10(moom.Oo p0) throws Throwable {
    throw __call1064710_0(p0);
}
public static void h647_11(moom.Oo p0) throws Throwable {
    throw __call1064711_0(p0);
}
public static void h647_12(moom.Oo p0) throws Throwable {
    throw __call1064712_0(p0);
}
public static void h647_13(moom.Oo p0) throws Throwable {
    throw __call1064713_0(p0);
}
public static void h647_14(moom.Oo p0) throws Throwable {
    throw __call1064714_0(p0);
}
public static void h647_15(moom.Oo p0) throws Throwable {
    throw __call1064715_0(p0);
}
public static void h647_16(moom.Oo p0) throws Throwable {
    throw __call1064716_0(p0);
}
public static void h647_17(moom.Oo p0) throws Throwable {
    throw __call1064717_0(p0);
}
private static native long __fieldRead647_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call647_1() throws Throwable;
private static native moom.bs __fieldRead647_2() throws Throwable;
private static native net.minecraft.block.Block __call647_3(moom.DT a0, moom.bs a1, net.minecraft.world.IBlockAccess a2) throws Throwable;
private static native moom.fw __fieldRead647_4() throws Throwable;
private static native java.lang.Comparable __call647_5(net.minecraft.block.state.IBlockState a0, moom.fw a1) throws Throwable;
private static native net.minecraft.block.BlockDirt$DirtType __fieldRead647_6() throws Throwable;
private static native net.minecraft.block.Block __fieldRead647_7() throws Throwable;
private static native net.minecraft.block.Block __fieldRead647_8() throws Throwable;
private static native boolean __call647_9() throws Throwable;
private static native int __integerCategory647_10(boolean value) throws Throwable;
private static native boolean __fieldRead647_11() throws Throwable;
private static native net.minecraft.block.Block __call647_12(moom.DT a0, moom.bs a1, net.minecraft.world.IBlockAccess a2) throws Throwable;
private static native net.minecraft.block.Block __fieldRead647_13() throws Throwable;
private static native net.minecraft.client.resources.model.IBakedModel __fieldRead647_14() throws Throwable;
private static native java.util.List __call647_15(net.minecraft.client.resources.model.IBakedModel a0, moom.bs a1) throws Throwable;
private static native boolean __fieldRead647_16() throws Throwable;
private static native int __integerCategory647_17(boolean value) throws Throwable;
private static native moom.DT __call647_18(moom.DT a0) throws Throwable;
private static native moom.DT __call647_19(moom.DT a0, moom.bs a1) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call647_20(net.minecraft.world.IBlockAccess a0, moom.DT a1) throws Throwable;
private static native net.minecraft.block.Block __call647_21(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead647_22() throws Throwable;
private static native moom.fw __fieldRead647_23() throws Throwable;
private static native java.lang.Comparable __call647_24(net.minecraft.block.state.IBlockState a0, moom.fw a1) throws Throwable;
private static native net.minecraft.block.BlockDirt$DirtType __fieldRead647_25() throws Throwable;
private static native net.minecraft.client.resources.model.IBakedModel __fieldRead647_26() throws Throwable;
private static native java.util.List __call647_27(net.minecraft.client.resources.model.IBakedModel a0, moom.bs a1) throws Throwable;
private static native boolean __fieldRead647_28() throws Throwable;
private static native net.minecraft.client.resources.model.IBakedModel __fieldRead647_29() throws Throwable;
private static native java.util.List __call647_30(net.minecraft.client.resources.model.IBakedModel a0, moom.bs a1) throws Throwable;
private static native boolean __fieldRead647_31() throws Throwable;
private static native int __integerCategory647_32(boolean value) throws Throwable;
private static native net.minecraft.client.resources.model.IBakedModel __fieldRead647_33() throws Throwable;
private static native java.util.List __call647_34(net.minecraft.client.resources.model.IBakedModel a0, moom.bs a1) throws Throwable;
private static native java.lang.Exception __call1064700_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1064701_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1064702_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1064703_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1064704_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1064705_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1064706_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1064707_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1064708_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1064709_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1064710_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1064711_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1064712_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1064713_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1064714_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1064715_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1064716_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1064717_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> java.util.List __sourceHandlerCall_0a05ea6dab9ddc3c8c9d(net.minecraft.world.IBlockAccess a0, net.minecraft.block.state.IBlockState a1, moom.DT a2, moom.bs a3, java.util.List a4) throws E;
private static final class __SourceHandler_0a05ea6dab9ddc3c8c9d {

public static java.util.List f648(net.minecraft.world.IBlockAccess p0, net.minecraft.block.state.IBlockState p1, moom.DT p2, moom.bs p3, java.util.List p4) throws Throwable {
    net.minecraft.block.Block forwardValue648_19_0;
    net.minecraft.block.Block forwardValue648_19_1;
    int forwardValue648_23_0;
    int forwardValue648_45_0;
    int forwardValue648_58_0;
    int forwardValue648_68_0;
    net.minecraft.entity.Entity[] spill648_0;
    net.minecraft.block.Block spill648_1;
    net.minecraft.block.Block spill648_2;
    boolean spill648_3;
    int spill648_4;
    long life5_3;
    net.minecraft.block.Block life8_10;
    net.minecraft.entity.Entity[] life7_11;
    int life9_31;
    forward_join_73: {
    forward_join_68: {
    forward_join_67: {
    forward_join_58: {
    forward_join_57: {
    forward_join_45: {
    forward_join_44: {
    forward_join_23: {
    forward_join_22: {
    forward_join_20: {
    forward_join_19: {
    life5_3 = (__fieldRead648_0() ^ 109309944143440L);
    spill648_0 = __call648_1();
    life8_10 = __call648_4(__call648_3(p0, __call648_2(p2)));
    life7_11 = spill648_0;
    spill648_1 = life8_10;
    spill648_2 = __fieldRead648_5();
    if (!((life7_11 != null))) {
        forwardValue648_19_0 = spill648_1;
        forwardValue648_19_1 = spill648_2;
        break forward_join_19;
    }
    if (!((spill648_1 != spill648_2))) {
        break forward_join_20;
    }
    forwardValue648_19_0 = life8_10;
    forwardValue648_19_1 = __fieldRead648_6();
    }
    if (!((forwardValue648_19_0 == forwardValue648_19_1))) {
        break forward_join_22;
    }
    }
    forwardValue648_23_0 = 1;
    break forward_join_23;
    }
    forwardValue648_23_0 = 0;
    }
    life9_31 = forwardValue648_23_0;
    spill648_3 = __call648_7();
    if (!((life7_11 != null))) {
        forwardValue648_58_0 = __integerCategory648_8(spill648_3);
        break forward_join_58;
    }
    if (!(spill648_3)) {
        break forward_join_57;
    }
    spill648_4 = life9_31;
    if (!((life7_11 != null))) {
        forwardValue648_45_0 = spill648_4;
        break forward_join_45;
    }
    if (!((spill648_4 != 0))) {
        break forward_join_44;
    }
    if (!(__fieldRead648_9())) {
        break forward_join_73;
    }
    if (!((__call648_10(p2, p3, p0) == __fieldRead648_11()))) {
        break forward_join_73;
    }
    return __call648_13(__fieldRead648_12(), p3);
    }
    forwardValue648_45_0 = __integerCategory648_15(__fieldRead648_14());
    }
    if (!((forwardValue648_45_0 != 0))) {
        break forward_join_73;
    }
    if (!((__call648_17(__call648_16(p2), p3, p0) == __fieldRead648_18()))) {
        break forward_join_73;
    }
    return __call648_20(__fieldRead648_19(), p3);
    }
    forwardValue648_58_0 = life9_31;
    }
    if (!((life7_11 != null))) {
        forwardValue648_68_0 = forwardValue648_58_0;
        break forward_join_68;
    }
    if (!((forwardValue648_58_0 != 0))) {
        break forward_join_67;
    }
    if (!(__fieldRead648_21())) {
        break forward_join_73;
    }
    return __call648_23(__fieldRead648_22(), p3);
    }
    forwardValue648_68_0 = __integerCategory648_25(__fieldRead648_24());
    }
    if (!((forwardValue648_68_0 != 0))) {
        break forward_join_73;
    }
    return __call648_27(__fieldRead648_26(), p3);
    }
    return p4;
}
public static void h648_0(moom.Oo p0) throws Throwable {
    throw __call1064800_0(p0);
}
public static void h648_1(moom.Oo p0) throws Throwable {
    throw __call1064801_0(p0);
}
public static void h648_2(moom.Oo p0) throws Throwable {
    throw __call1064802_0(p0);
}
public static void h648_3(moom.Oo p0) throws Throwable {
    throw __call1064803_0(p0);
}
public static void h648_4(moom.Oo p0) throws Throwable {
    throw __call1064804_0(p0);
}
public static void h648_5(moom.Oo p0) throws Throwable {
    throw __call1064805_0(p0);
}
public static void h648_6(moom.Oo p0) throws Throwable {
    throw __call1064806_0(p0);
}
public static void h648_7(moom.Oo p0) throws Throwable {
    throw __call1064807_0(p0);
}
public static void h648_8(moom.Oo p0) throws Throwable {
    throw __call1064808_0(p0);
}
public static void h648_9(moom.Oo p0) throws Throwable {
    throw __call1064809_0(p0);
}
public static void h648_10(moom.Oo p0) throws Throwable {
    throw __call1064810_0(p0);
}
public static void h648_11(moom.Oo p0) throws Throwable {
    throw __call1064811_0(p0);
}
public static void h648_12(moom.Oo p0) throws Throwable {
    throw __call1064812_0(p0);
}
public static void h648_13(moom.Oo p0) throws Throwable {
    throw __call1064813_0(p0);
}
public static void h648_14(moom.Oo p0) throws Throwable {
    throw __call1064814_0(p0);
}
private static native long __fieldRead648_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call648_1() throws Throwable;
private static native moom.DT __call648_2(moom.DT a0) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call648_3(net.minecraft.world.IBlockAccess a0, moom.DT a1) throws Throwable;
private static native net.minecraft.block.Block __call648_4(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead648_5() throws Throwable;
private static native net.minecraft.block.Block __fieldRead648_6() throws Throwable;
private static native boolean __call648_7() throws Throwable;
private static native int __integerCategory648_8(boolean value) throws Throwable;
private static native boolean __fieldRead648_9() throws Throwable;
private static native net.minecraft.block.Block __call648_10(moom.DT a0, moom.bs a1, net.minecraft.world.IBlockAccess a2) throws Throwable;
private static native net.minecraft.block.Block __fieldRead648_11() throws Throwable;
private static native net.minecraft.client.resources.model.IBakedModel __fieldRead648_12() throws Throwable;
private static native java.util.List __call648_13(net.minecraft.client.resources.model.IBakedModel a0, moom.bs a1) throws Throwable;
private static native boolean __fieldRead648_14() throws Throwable;
private static native int __integerCategory648_15(boolean value) throws Throwable;
private static native moom.DT __call648_16(moom.DT a0) throws Throwable;
private static native net.minecraft.block.Block __call648_17(moom.DT a0, moom.bs a1, net.minecraft.world.IBlockAccess a2) throws Throwable;
private static native moom.dC __fieldRead648_18() throws Throwable;
private static native net.minecraft.client.resources.model.IBakedModel __fieldRead648_19() throws Throwable;
private static native java.util.List __call648_20(net.minecraft.client.resources.model.IBakedModel a0, moom.bs a1) throws Throwable;
private static native boolean __fieldRead648_21() throws Throwable;
private static native net.minecraft.client.resources.model.IBakedModel __fieldRead648_22() throws Throwable;
private static native java.util.List __call648_23(net.minecraft.client.resources.model.IBakedModel a0, moom.bs a1) throws Throwable;
private static native boolean __fieldRead648_24() throws Throwable;
private static native int __integerCategory648_25(boolean value) throws Throwable;
private static native net.minecraft.client.resources.model.IBakedModel __fieldRead648_26() throws Throwable;
private static native java.util.List __call648_27(net.minecraft.client.resources.model.IBakedModel a0, moom.bs a1) throws Throwable;
private static native java.lang.Exception __call1064800_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1064801_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1064802_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1064803_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1064804_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1064805_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1064806_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1064807_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1064808_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1064809_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1064810_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1064811_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1064812_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1064813_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1064814_0(moom.Oo a0) throws Throwable;

}


private static void b(net.minecraft.client.renderer.texture.TextureMap p0) { __sourceHandlerCall_253593680fa970c25a2d(p0); }


private static java.util.List b(net.minecraft.world.IBlockAccess p0, net.minecraft.block.state.IBlockState p1, moom.DT p2, moom.bs p3, java.util.List p4) { return __sourceHandlerCall_a8385bb335490c940d24(p0, p1, p2, p3, p4); }


private static java.util.List c(net.minecraft.world.IBlockAccess p0, net.minecraft.block.state.IBlockState p1, moom.DT p2, moom.bs p3, java.util.List p4) { return __sourceHandlerCall_2045d338402823f605fe(p0, p1, p2, p3, p4); }


private static java.util.List d(net.minecraft.world.IBlockAccess p0, net.minecraft.block.state.IBlockState p1, moom.DT p2, moom.bs p3, java.util.List p4) { return __sourceHandlerCall_0a05ea6dab9ddc3c8c9d(p0, p1, p2, p3, p4); }


public static void a(net.minecraft.client.renderer.texture.TextureMap p0) {
m = ((boolean)(false));
    r = ((boolean)(false));
    moom.I8.b(((net.minecraft.client.renderer.texture.TextureMap)(p0)));
    return;
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
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
        byte[] spill2524_0 = p0;
        life4_9 += 1;
        life5_44 = (spill2524_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill2524_1 = p0;
        life4_9 += 1;
        life5_76 = (spill2524_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill2524_2 = p0;
        life4_9 += 1;
        life5_91 = (spill2524_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 12844);
    if (((moom.I8.u)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.I8.v)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.I8.v)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/I8", life9_51);
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
        life9_116 = ((java.lang.String)((moom.I8.t)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.I8.u)[life5_8] = moom.I8.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.I8.u)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.I8.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral4901_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/I8"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public static java.util.List a(net.minecraft.world.IBlockAccess p0, net.minecraft.block.state.IBlockState p1, moom.DT p2, moom.bs p3, java.util.List p4) { return __sourceHandlerCall_e9b5f2acc8319aeea33b(p0, p1, p2, p3, p4); }


private static net.minecraft.client.renderer.texture.TextureAtlasSprite a(java.util.Properties p0, java.lang.String p1, java.lang.String p2, net.minecraft.client.renderer.texture.TextureMap p3) { return __sourceHandlerCall_507d1220e0ab4572b97a(p0, p1, p2, p3); }


public static void a() { __sourceHandlerCall_337b5b8e7ac83ea29c61(); }


private static net.minecraft.block.Block a(moom.DT p0, moom.bs p1, net.minecraft.world.IBlockAccess p2) {
java.lang.Object local3 = ((moom.DT)(p0)).a(((moom.bs)(p1)));
    return ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.IBlockAccess)(p2)).a__fE(((moom.DT)(local3))))).a__ch();
}


private static boolean a(java.util.Properties p0, java.lang.String p1, boolean p2) { return __sourceHandlerCall_909376c4cc580ce06280(p0, p1, p2); }


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral4901_0() throws E;
}
