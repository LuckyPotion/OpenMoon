package moom;


public class JZ {

private static net.minecraft.client.resources.model.IBakedModel a;

private static net.minecraft.client.resources.model.IBakedModel b;

private static net.minecraft.client.resources.model.IBakedModel c;

private static net.minecraft.client.resources.model.IBakedModel d;

private static net.minecraft.client.resources.model.IBakedModel e;

private static net.minecraft.client.resources.model.IBakedModel f;

private static java.util.List g;

private static java.util.List h;

private static java.util.List i;

private static java.util.List j;

private static java.util.List k;

private static java.util.List l;

private static net.minecraft.client.resources.model.IBakedModel m;

private static net.minecraft.client.resources.model.IBakedModel n;

private static net.minecraft.client.resources.model.IBakedModel o;

private static net.minecraft.client.resources.model.IBakedModel p;

private static net.minecraft.client.resources.model.IBakedModel q;

private static net.minecraft.client.resources.model.IBakedModel r;

private static long s;

private static java.lang.String[] t;

private static java.lang.String[] u;

private static java.util.Map v;

private static long w;

public JZ() {
super();
}


static {
s = ((long)(((moom._a)(moom._c.a(((long)(-5902395517849306183L)), ((long)(-147889478385571031L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(10390597127433L)))));
    v = ((java.util.Map)(new java.util.HashMap(13)));
    long local5_life7 = (moom.JZ.s ^ 116117034940471L);
    javax.crypto.Cipher local7_life9;
    javax.crypto.Cipher __sourceSpill605_11 = (local7_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill605_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill605_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill605_14 = new byte[8];
    (__sourceSpill605_14)[0] = ((byte) ((int) (local5_life7 >>> 56)));
    int local8_life15 = 1;
    while ((local8_life15 < 8)) {
        (__sourceSpill605_14)[local8_life15] = ((byte) ((int) ((local5_life7 << (local8_life15 * 8)) >>> 56)));
        local8_life15 += 1;
    }
    byte[] __sourcePreallocation605_16 = __sourceSpill605_14;
    ((javax.crypto.Cipher)(__sourceSpill605_11)).init(((int)(__sourceSpill605_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill605_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation605_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local14_life19 = new java.lang.String[19];
    int local12_life20 = 0;
    java.lang.String local11_life21;
    int local13_life23 = ((java.lang.String)((local11_life21 = "|/ÕÙáû\000]\007¨\023TÜZ s\020Nä$\fæK3°¼*ÆE£÷\\ \002\031Õ\013\021Ï \036®K¨%î¬\005^ÐuäÌõ\001HOçY\020W¾2¸Tá(K\001ÓX\tø(VNêaUYÂôÖ\013E§!«® ª(Â\177\0014\"e\027+V#kõ\r~\033@\025\rIH&\023èÐ¢Á\177o©\033q\nTÛR\177ÊX}©3å£¢½³VÃÎàáÚ\016xZå\rÏ BÍo'\0168\bÌ\024æ=gê{ù · ð'\t¹L¬\030\005ÜÑÄÏüP\033D]ÿ\016vTcfÓ\013ÔK\002±X&\020MCúçú\rÎåÅ\177~­ú 'ü\000#g\030¸îb¹\026j(þ\001nY(¤L\007o['ÎP\n\016å\0269Ä\023/ ¯âûB\177×ÈT\016î<µÎ]µ×;wß\034Zl\013ÇÇ\ns:ï>;4ê5\021\\\024h\033:ª\003Ô\034fÁªp\026MÛçQîþéC\030#ñªé\023!ñ#¸\177Qçt¯Jh«Cq\bkè nÊäÊà)K]£ÔzÕi¨úíyÚÅe}ÁZÆN\033ýi\032 6,\026ÙÇ6ÿ\037ã|\023­[B\016·æ¨\026Eä>H\027¸Î\\ |hÊr\001cè¾3þhÒ\023¬Ã\021Úã°¥ø a\031­\020bÝàp8¸Ì>\013Ov\013óé³ _5¯{c¥oU\035\027í)\030\020d¨\177qFP¸\035v\034,{ôÚJ\020Óíåë\027®Ï­R\024e¾"))).length();
    int local10_life24 = 16;
    int local9_life25 = -1;
    while (true) {
        local9_life25 += 1;
        byte[] __sourceSpill605_28 = ((java.lang.String)(((java.lang.String)(local11_life21)).substring(((int)(local9_life25)), ((int)((local9_life25 + local10_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill605_29 = local7_life9;
        byte[] local15_life31 = ((javax.crypto.Cipher)(__sourceSpill605_29)).doFinal(((byte[])(__sourceSpill605_28)));
        java.lang.String __sourceSpill605_34 = ((java.lang.String)(moom.JZ.a(((byte[])(local15_life31))))).intern();
        java.lang.String[] __sourceSpill605_35 = local14_life19;
        int __sourceSpill605_36 = local12_life20;
        local12_life20 += 1;
        (__sourceSpill605_35)[__sourceSpill605_36] = __sourceSpill605_34;
        if (!(((local9_life25 = (local9_life25 + local10_life24)) < local13_life23))) { break; }
        local10_life24 = ((java.lang.String)(local11_life21)).charAt(((int)(local9_life25)));
    }
    local13_life23 = ((java.lang.String)((local11_life21 = "\ràì×\017Ý½\023¤iCÕ¥ê\020 }.¬\013ø/8\003|O"))).length();
    local10_life24 = 16;
    local9_life25 = -1;
    while (true) {
        local9_life25 += 1;
        byte[] __sourceSpill605_41 = ((java.lang.String)(((java.lang.String)(local11_life21)).substring(((int)(local9_life25)), ((int)((local9_life25 + local10_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill605_42 = local7_life9;
        byte[] local15_life44 = ((javax.crypto.Cipher)(__sourceSpill605_42)).doFinal(((byte[])(__sourceSpill605_41)));
        java.lang.String __sourceSpill605_47 = ((java.lang.String)(moom.JZ.a(((byte[])(local15_life44))))).intern();
        java.lang.String[] __sourceSpill605_48 = local14_life19;
        int __sourceSpill605_49 = local12_life20;
        local12_life20 += 1;
        (__sourceSpill605_48)[__sourceSpill605_49] = __sourceSpill605_47;
        if (!(((local9_life25 = (local9_life25 + local10_life24)) < local13_life23))) { break; }
        local10_life24 = ((java.lang.String)(local11_life21)).charAt(((int)(local9_life25)));
    }
    t = ((java.lang.String[])(local14_life19));
    u = ((java.lang.String[])(new java.lang.String[19]));
    javax.crypto.Cipher local0_life54;
    javax.crypto.Cipher __sourceSpill605_56 = (local0_life54 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill605_57 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill605_58 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill605_59 = new byte[8];
    (__sourceSpill605_59)[0] = ((byte) ((int) (local5_life7 >>> 56)));
    int local1_life60 = 1;
    while ((local1_life60 < 8)) {
        (__sourceSpill605_59)[local1_life60] = ((byte) ((int) ((local5_life7 << (local1_life60 * 8)) >>> 56)));
        local1_life60 += 1;
    }
    byte[] __sourcePreallocation605_61 = __sourceSpill605_59;
    ((javax.crypto.Cipher)(__sourceSpill605_56)).init(((int)(__sourceSpill605_57)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill605_58)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation605_61)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local2_life64 = 6272495602300611325L;
    byte[] __sourceSpill605_65 = new byte[8];
    (__sourceSpill605_65)[0] = ((byte) ((int) (local2_life64 >>> 56)));
    (__sourceSpill605_65)[1] = ((byte) ((int) (local2_life64 >>> 48)));
    (__sourceSpill605_65)[2] = ((byte) ((int) (local2_life64 >>> 40)));
    (__sourceSpill605_65)[3] = ((byte) ((int) (local2_life64 >>> 32)));
    (__sourceSpill605_65)[4] = ((byte) ((int) (local2_life64 >>> 24)));
    (__sourceSpill605_65)[5] = ((byte) ((int) (local2_life64 >>> 16)));
    (__sourceSpill605_65)[6] = ((byte) ((int) (local2_life64 >>> 8)));
    (__sourceSpill605_65)[7] = ((byte) ((int) local2_life64));
    javax.crypto.Cipher __sourceSpill605_66 = local0_life54;
    byte[] local4_life68 = ((javax.crypto.Cipher)(__sourceSpill605_66)).doFinal(((byte[])(__sourceSpill605_65)));
    w = ((long)((((((((((((long) (local4_life68)[0]) & 255L) << 56) | ((((long) (local4_life68)[1]) & 255L) << 48)) | ((((long) (local4_life68)[2]) & 255L) << 40)) | ((((long) (local4_life68)[3]) & 255L) << 32)) | ((((long) (local4_life68)[4]) & 255L) << 24)) | ((((long) (local4_life68)[5]) & 255L) << 16)) | ((((long) (local4_life68)[6]) & 255L) << 8)) | (((long) (local4_life68)[7]) & 255L))));
    a = ((net.minecraft.client.resources.model.IBakedModel)(null));
    b = ((net.minecraft.client.resources.model.IBakedModel)(null));
    c = ((net.minecraft.client.resources.model.IBakedModel)(null));
    d = ((net.minecraft.client.resources.model.IBakedModel)(null));
    e = ((net.minecraft.client.resources.model.IBakedModel)(null));
    f = ((net.minecraft.client.resources.model.IBakedModel)(null));
    g = ((java.util.List)(null));
    h = ((java.util.List)(null));
    i = ((java.util.List)(null));
    j = ((java.util.List)(null));
    k = ((java.util.List)(null));
    l = ((java.util.List)(null));
    m = ((net.minecraft.client.resources.model.IBakedModel)(null));
    n = ((net.minecraft.client.resources.model.IBakedModel)(null));
    o = ((net.minecraft.client.resources.model.IBakedModel)(null));
    p = ((net.minecraft.client.resources.model.IBakedModel)(null));
    q = ((net.minecraft.client.resources.model.IBakedModel)(null));
    r = ((net.minecraft.client.resources.model.IBakedModel)(null));
}

private static native <E extends Throwable> net.minecraft.client.resources.model.IBakedModel __sourceHandlerCall_3e3fe359ba38437996ca(java.lang.String a0, java.util.List a1) throws E;
private static final class __SourceHandler_3e3fe359ba38437996ca {

public static net.minecraft.client.resources.model.IBakedModel f99(java.lang.String p0, java.util.List p1) throws Throwable {
    moom.DD lexicalValue99_53_0;
    net.minecraft.client.resources.model.IBakedModel lexicalValue99_85_0;
    net.minecraft.client.resources.model.IBakedModel lexicalValue99_91_0;
    int lexicalValue99_104_0;
    java.util.List lexicalValue99_110_0;
    int lexicalValue99_136_0;
    int lexicalValue99_150_0;
    net.minecraft.entity.Entity[] spill99_0;
    moom.DD spill99_1;
    net.minecraft.client.resources.model.IBakedModel spill99_2;
    int spill99_3;
    java.util.List spill99_4;
    int spill99_5;
    long life2_3;
    net.minecraft.client.resources.model.ModelManager life5_6;
    net.minecraft.entity.Entity[] life4_7;
    moom.DD life6_30;
    moom.DD life7_60;
    moom.DE life8_84;
    net.minecraft.client.resources.model.IBakedModel life9_88;
    java.util.List life10_110;
    java.util.Iterator life11_139;
    moom.lC life12_146;
    java.util.List life13_151;
    lexical_join_153: {
    lexical_join_150: {
    lexical_join_139: {
    lexical_join_110: {
    lexical_join_109: {
    lexical_join_104: {
    lexical_join_100: {
    lexical_join_91: {
    lexical_join_85: {
    lexical_join_60: {
    lexical_join_53: {
    lexical_join_37: {
    lexical_join_12: {
    life2_3 = (__fieldRead99_0() ^ 94662547574097L);
    spill99_0 = __call99_1();
    life5_6 = __call99_2();
    life4_7 = spill99_0;
    if (!((life5_6 == null))) {
        break lexical_join_12;
    }
    return null;
    }
    java.lang.Object __inlineStack99_4Token;
    life6_30 = new moom.DD(__invokedynamic99_6(__inlineStack99_4Output0((__inlineStack99_4Token = __inlineStack99_4Pack(p0, __invokedynamic99_3(21953, (8791897666371445107L ^ life2_3))))), __inlineStack99_4Output1(__inlineStack99_4Token), __invokedynamic99_5(1988, (3020604669987828597L ^ life2_3))));
    spill99_1 = life6_30;
    if (!((life4_7 != null))) {
        lexicalValue99_53_0 = spill99_1;
        break lexical_join_53;
    }
    if (!((__call99_7(spill99_1) != __call99_8()))) {
        break lexical_join_37;
    }
    return null;
    }
    java.lang.Object __inlineStack99_10Token;
    lexicalValue99_53_0 = new moom.DD(__invokedynamic99_12(__inlineStack99_10Output0((__inlineStack99_10Token = __inlineStack99_10Pack(p0, __invokedynamic99_9(11866, (8833745382164798190L ^ life2_3))))), __inlineStack99_10Output1(__inlineStack99_10Token), __invokedynamic99_11(29678, (545212269611042653L ^ life2_3))));
    }
    life7_60 = lexicalValue99_53_0;
    if (!((__call99_13(life7_60) != __call99_14()))) {
        break lexical_join_60;
    }
    return null;
    }
    life8_84 = new moom.DE(__invokedynamic99_16(p0, __invokedynamic99_15(20164, (572798062173452921L ^ life2_3))), __invokedynamic99_17(15537, (6900248475086096399L ^ life2_3)));
    life9_88 = __call99_18(life5_6, life8_84);
    spill99_2 = life9_88;
    if (!((life4_7 != null))) {
        lexicalValue99_85_0 = spill99_2;
        break lexical_join_85;
    }
    if (!((spill99_2 != null))) {
        break lexical_join_153;
    }
    lexicalValue99_85_0 = life9_88;
    }
    if (!((life4_7 != null))) {
        lexicalValue99_91_0 = lexicalValue99_85_0;
        break lexical_join_91;
    }
    if (!((lexicalValue99_85_0 != __call99_19(life5_6)))) {
        break lexical_join_153;
    }
    lexicalValue99_91_0 = life9_88;
    }
    life10_110 = __call99_20(lexicalValue99_91_0);
    spill99_3 = __call99_21(life10_110);
    if (!((life4_7 != null))) {
        lexicalValue99_104_0 = spill99_3;
        break lexical_join_104;
    }
    if (!((spill99_3 == 0))) {
        break lexical_join_100;
    }
    return life9_88;
    }
    spill99_4 = life10_110;
    if (!((life4_7 != null))) {
        lexicalValue99_110_0 = spill99_4;
        break lexical_join_110;
    }
    lexicalValue99_104_0 = __call99_22(spill99_4);
    }
    if (!((lexicalValue99_104_0 != ((int) __fieldRead99_23())))) {
        break lexical_join_109;
    }
    return null;
    }
    lexicalValue99_110_0 = life10_110;
    }
    life11_139 = __call99_24(lexicalValue99_110_0);
    lexical_cycle_112: while (true) {
    lexical_join_136: {
    lexical_join_133: {
    if (!(__call99_25(life11_139))) {
        break lexical_join_139;
    }
    life12_146 = __cast99_27(__call99_26(life11_139));
    life13_151 = __call99_29(life9_88, __call99_28(life12_146));
    spill99_5 = __call99_30(life13_151);
    if (!((life4_7 != null))) {
        lexicalValue99_150_0 = spill99_5;
        break lexical_join_150;
    }
    if (!((life4_7 != null))) {
        lexicalValue99_136_0 = spill99_5;
        break lexical_join_136;
    }
    if (!((spill99_5 > 0))) {
        break lexical_join_133;
    }
    return null;
    }
    lexicalValue99_136_0 = __integerCategory99_32(__call99_31(life13_151, life12_146));
    }
    __discardScalar99_33(lexicalValue99_136_0);
    if (!((life4_7 == null))) { continue lexical_cycle_112; }
    break lexical_cycle_112;
    }
    }
    __call99_34(life10_110);
    lexicalValue99_150_0 = __integerCategory99_38(__call99_37(p1, __invokedynamic99_36(p0, __invokedynamic99_35(29624, (5254523597653395222L ^ life2_3)))));
    }
    __discardScalar99_39(lexicalValue99_150_0);
    return life9_88;
    }
    return null;
}
private static native long __fieldRead99_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call99_1() throws Throwable;
private static native net.minecraft.client.resources.model.ModelManager __call99_2() throws Throwable;
private static native java.lang.String __invokedynamic99_3(int a0, long a1) throws Throwable;
private static native java.lang.Object __inlineStack99_4Pack(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __inlineStack99_4Output0(java.lang.Object token) throws Throwable;
private static native java.lang.String __inlineStack99_4Output1(java.lang.Object token) throws Throwable;
private static native java.lang.String __invokedynamic99_5(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic99_6(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native net.minecraft.client.resources.IResourcePack __call99_7(moom.DD a0) throws Throwable;
private static native moom.oK __call99_8() throws Throwable;
private static native java.lang.String __invokedynamic99_9(int a0, long a1) throws Throwable;
private static native java.lang.Object __inlineStack99_10Pack(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __inlineStack99_10Output0(java.lang.Object token) throws Throwable;
private static native java.lang.String __inlineStack99_10Output1(java.lang.Object token) throws Throwable;
private static native java.lang.String __invokedynamic99_11(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic99_12(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native net.minecraft.client.resources.IResourcePack __call99_13(moom.DD a0) throws Throwable;
private static native moom.oK __call99_14() throws Throwable;
private static native java.lang.String __invokedynamic99_15(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic99_16(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic99_17(int a0, long a1) throws Throwable;
private static native net.minecraft.client.resources.model.IBakedModel __call99_18(net.minecraft.client.resources.model.ModelManager a0, moom.DE a1) throws Throwable;
private static native net.minecraft.client.resources.model.IBakedModel __call99_19(net.minecraft.client.resources.model.ModelManager a0) throws Throwable;
private static native java.util.List __call99_20(net.minecraft.client.resources.model.IBakedModel a0) throws Throwable;
private static native int __call99_21(java.util.List a0) throws Throwable;
private static native int __call99_22(java.util.List a0) throws Throwable;
private static native long __fieldRead99_23() throws Throwable;
private static native java.util.Iterator __call99_24(java.util.List a0) throws Throwable;
private static native boolean __call99_25(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call99_26(java.util.Iterator a0) throws Throwable;
private static native moom.lC __cast99_27(java.lang.Object a0) throws Throwable;
private static native moom.bs __call99_28(moom.lC a0) throws Throwable;
private static native java.util.List __call99_29(net.minecraft.client.resources.model.IBakedModel a0, moom.bs a1) throws Throwable;
private static native int __call99_30(java.util.List a0) throws Throwable;
private static native boolean __call99_31(java.util.List a0, moom.lC a1) throws Throwable;
private static native int __integerCategory99_32(boolean value) throws Throwable;
private static native void __discardScalar99_33(int a0) throws Throwable;
private static native void __call99_34(java.util.List a0) throws Throwable;
private static native java.lang.String __invokedynamic99_35(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic99_36(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native boolean __call99_37(java.util.List a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory99_38(boolean value) throws Throwable;
private static native void __discardScalar99_39(int a0) throws Throwable;

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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 5104);
    if (((moom.JZ.u)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.JZ.v)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.JZ.v)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/JZ", life9_51);
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
        life9_116 = ((java.lang.String)((moom.JZ.t)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.JZ.u)[life5_8] = moom.JZ.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.JZ.u)[life5_8];
}


private static moom.Oo a(moom.Oo p0) {
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
        byte[] spill2706_0 = p0;
        life4_9 += 1;
        life5_44 = (spill2706_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill2706_1 = p0;
        life4_9 += 1;
        life5_76 = (spill2706_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill2706_2 = p0;
        life4_9 += 1;
        life5_91 = (spill2706_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral5223_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/JZ"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.JZ.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public static net.minecraft.client.resources.model.IBakedModel a(net.minecraft.client.resources.model.IBakedModel p0, net.minecraft.block.state.IBlockState p1) {
java.util.List forwardValue2333_22_0;
    java.util.List forwardValue2333_22_1;
    java.util.List forwardValue2333_29_0;
    java.util.List forwardValue2333_29_1;
    java.util.List forwardValue2333_36_0;
    java.util.List forwardValue2333_36_1;
    java.util.List forwardValue2333_43_0;
    java.util.List forwardValue2333_43_1;
    java.util.List forwardValue2333_50_0;
    java.util.List forwardValue2333_50_1;
    net.minecraft.client.resources.model.IBakedModel forwardValue2333_54_0;
    java.util.List spill2333_0;
    java.util.List spill2333_1;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    java.util.List life5_14;
    forward_join_54: {
    forward_join_53: {
    forward_join_50: {
    forward_join_48: {
    forward_join_43: {
    forward_join_41: {
    forward_join_36: {
    forward_join_34: {
    forward_join_29: {
    forward_join_27: {
    forward_join_22: {
    forward_join_20: {
    forward_join_10: {
    life2_3 = (moom.JZ.s ^ 63824806098927L);
    life4_5 = moom.JM.b__Arrayr3();
    if (!((!moom.BU.p()))) {
        break forward_join_10;
    }
    return p0;
    }
    life5_14 = ((net.minecraft.client.resources.model.IBakedModel)(p0)).a();
    spill2333_0 = life5_14;
    spill2333_1 = moom.JZ.g;
    if (!((life4_5 != null))) {
        forwardValue2333_22_0 = spill2333_0;
        forwardValue2333_22_1 = spill2333_1;
        break forward_join_22;
    }
    if (!((spill2333_0 == spill2333_1))) {
        break forward_join_20;
    }
    forwardValue2333_54_0 = moom.JZ.m;
    break forward_join_54;
    }
    forwardValue2333_22_0 = life5_14;
    forwardValue2333_22_1 = moom.JZ.h;
    }
    if (!((life4_5 != null))) {
        forwardValue2333_29_0 = forwardValue2333_22_0;
        forwardValue2333_29_1 = forwardValue2333_22_1;
        break forward_join_29;
    }
    if (!((forwardValue2333_22_0 == forwardValue2333_22_1))) {
        break forward_join_27;
    }
    forwardValue2333_54_0 = moom.JZ.n;
    break forward_join_54;
    }
    forwardValue2333_29_0 = life5_14;
    forwardValue2333_29_1 = moom.JZ.i;
    }
    if (!((life4_5 != null))) {
        forwardValue2333_36_0 = forwardValue2333_29_0;
        forwardValue2333_36_1 = forwardValue2333_29_1;
        break forward_join_36;
    }
    if (!((forwardValue2333_29_0 == forwardValue2333_29_1))) {
        break forward_join_34;
    }
    forwardValue2333_54_0 = moom.JZ.o;
    break forward_join_54;
    }
    forwardValue2333_36_0 = life5_14;
    forwardValue2333_36_1 = moom.JZ.j;
    }
    if (!((life4_5 != null))) {
        forwardValue2333_43_0 = forwardValue2333_36_0;
        forwardValue2333_43_1 = forwardValue2333_36_1;
        break forward_join_43;
    }
    if (!((forwardValue2333_36_0 == forwardValue2333_36_1))) {
        break forward_join_41;
    }
    forwardValue2333_54_0 = moom.JZ.p;
    break forward_join_54;
    }
    forwardValue2333_43_0 = life5_14;
    forwardValue2333_43_1 = moom.JZ.k;
    }
    if (!((life4_5 != null))) {
        forwardValue2333_50_0 = forwardValue2333_43_0;
        forwardValue2333_50_1 = forwardValue2333_43_1;
        break forward_join_50;
    }
    if (!((forwardValue2333_43_0 == forwardValue2333_43_1))) {
        break forward_join_48;
    }
    forwardValue2333_54_0 = moom.JZ.q;
    break forward_join_54;
    }
    forwardValue2333_50_0 = life5_14;
    forwardValue2333_50_1 = moom.JZ.l;
    }
    if (!((forwardValue2333_50_0 == forwardValue2333_50_1))) {
        break forward_join_53;
    }
    forwardValue2333_54_0 = moom.JZ.r;
    break forward_join_54;
    }
    forwardValue2333_54_0 = p0;
    }
    return forwardValue2333_54_0;
}


public static boolean a(net.minecraft.block.state.IBlockState p0, net.minecraft.block.state.IBlockState p1) {
net.minecraft.block.state.IBlockState forestValue690_14_0;
    net.minecraft.block.Block forestValue690_25_0;
    int forestValue690_41_0;
    int forestValue690_52_0;
    int forestValue690_56_0;
    int forestValue690_58_0;
    net.minecraft.block.state.IBlockState spill690_0;
    net.minecraft.block.Block spill690_1;
    int spill690_2;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    net.minecraft.block.Block life5_16;
    net.minecraft.block.Block life6_19;
    forest_join_58: {
    forest_join_57: {
    forest_join_56: {
    forest_join_55: {
    forest_join_52: {
    forest_join_41: {
    forest_join_39: {
    forest_join_25: {
    forest_join_14: {
    forest_join_13: {
    life2_3 = (moom.JZ.s ^ 35675348181206L);
    life4_5 = moom.JM.b__Arrayr3();
    spill690_0 = p0;
    if (!((life4_5 != null))) {
        forestValue690_14_0 = spill690_0;
        break forest_join_14;
    }
    if (!((spill690_0 == p1))) {
        break forest_join_13;
    }
    return ((1) != 0);
    }
    forestValue690_14_0 = p0;
    }
    life5_16 = ((net.minecraft.block.state.IBlockState)(forestValue690_14_0)).a__ch();
    life6_19 = ((net.minecraft.block.state.IBlockState)(p1)).a__ch();
    spill690_1 = life5_16;
    if (!((life4_5 != null))) {
        forestValue690_25_0 = spill690_1;
        break forest_join_25;
    }
    if (!((spill690_1 == life6_19))) {
        break forest_join_57;
    }
    forestValue690_25_0 = life5_16;
    }
    spill690_2 = ((forestValue690_25_0 instanceof moom.dJ) ? 1 : 0);
    if (!((life4_5 != null))) {
        forestValue690_41_0 = spill690_2;
        break forest_join_41;
    }
    if (!((spill690_2 != 0))) {
        break forest_join_39;
    }
    if (!(((net.minecraft.block.BlockPlanks$EnumType)(((net.minecraft.block.BlockPlanks$EnumType)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.dJ.W))))))).equals(((java.lang.Object)(((net.minecraft.block.state.IBlockState)(p1)).a(((net.minecraft.block.properties.IProperty)(moom.dJ.W)))))))) {
        break forest_join_57;
    }
    break forest_join_55;
    }
    forestValue690_41_0 = ((life5_16 instanceof moom.dI) ? 1 : 0);
    }
    if (!((life4_5 != null))) {
        forestValue690_52_0 = forestValue690_41_0;
        break forest_join_52;
    }
    if (!((forestValue690_41_0 != 0))) {
        break forest_join_57;
    }
    forestValue690_52_0 = ((((net.minecraft.block.BlockPlanks$EnumType)(((net.minecraft.block.BlockPlanks$EnumType)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.dI.W))))))).equals(((java.lang.Object)(((net.minecraft.block.state.IBlockState)(p1)).a(((net.minecraft.block.properties.IProperty)(moom.dI.W))))))) ? 1 : 0);
    }
    if (!((life4_5 != null))) {
        forestValue690_56_0 = forestValue690_52_0;
        break forest_join_56;
    }
    if (!((forestValue690_52_0 != 0))) {
        break forest_join_57;
    }
    }
    forestValue690_56_0 = 1;
    }
    forestValue690_58_0 = forestValue690_56_0;
    break forest_join_58;
    }
    forestValue690_58_0 = 0;
    }
    return ((forestValue690_58_0) != 0);
}


public static void a() {
java.util.ArrayList forwardValue2329_100_0;
    net.minecraft.entity.Entity[] spill2329_0;
    java.util.ArrayList spill2329_1;
    long life0_3;
    java.util.ArrayList life3_7;
    net.minecraft.entity.Entity[] life2_78;
    forward_join_110: {
    forward_join_100: {
    life0_3 = (moom.JZ.s ^ 56884963604192L);
    life3_7 = new java.util.ArrayList();
    a = ((net.minecraft.client.resources.model.IBakedModel)(moom.JZ.a(((java.lang.String)(__sourceIntrinsic_2c8ae721fed4_invokedynamic2329_1(6623, (925362918748313297L ^ life0_3)))), ((java.util.List)(life3_7)))));
    b = ((net.minecraft.client.resources.model.IBakedModel)(moom.JZ.a(((java.lang.String)(__sourceIntrinsic_2c8ae721fed4_invokedynamic2329_4(7284, (8492614198412858218L ^ life0_3)))), ((java.util.List)(life3_7)))));
    c = ((net.minecraft.client.resources.model.IBakedModel)(moom.JZ.a(((java.lang.String)(__sourceIntrinsic_2c8ae721fed4_invokedynamic2329_7(18754, (8501246148192110150L ^ life0_3)))), ((java.util.List)(life3_7)))));
    d = ((net.minecraft.client.resources.model.IBakedModel)(moom.JZ.a(((java.lang.String)(__sourceIntrinsic_2c8ae721fed4_invokedynamic2329_10(27944, (4924665160117822005L ^ life0_3)))), ((java.util.List)(life3_7)))));
    e = ((net.minecraft.client.resources.model.IBakedModel)(moom.JZ.a(((java.lang.String)(__sourceIntrinsic_2c8ae721fed4_invokedynamic2329_13(30162, (7333481607172373203L ^ life0_3)))), ((java.util.List)(life3_7)))));
    f = ((net.minecraft.client.resources.model.IBakedModel)(moom.JZ.a(((java.lang.String)(__sourceIntrinsic_2c8ae721fed4_invokedynamic2329_16(31174, (4701021080560744142L ^ life0_3)))), ((java.util.List)(life3_7)))));
    g = ((java.util.List)(moom.JZ.a(((net.minecraft.client.resources.model.IBakedModel)(moom.JZ.a)))));
    h = ((java.util.List)(moom.JZ.a(((net.minecraft.client.resources.model.IBakedModel)(moom.JZ.b)))));
    i = ((java.util.List)(moom.JZ.a(((net.minecraft.client.resources.model.IBakedModel)(moom.JZ.c)))));
    spill2329_0 = moom.JM.b__Arrayr3();
    j = ((java.util.List)(moom.JZ.a(((net.minecraft.client.resources.model.IBakedModel)(moom.JZ.d)))));
    k = ((java.util.List)(moom.JZ.a(((net.minecraft.client.resources.model.IBakedModel)(moom.JZ.e)))));
    l = ((java.util.List)(moom.JZ.a(((net.minecraft.client.resources.model.IBakedModel)(moom.JZ.f)))));
    m = ((net.minecraft.client.resources.model.IBakedModel)(moom.JZ.a__pp(((net.minecraft.client.resources.model.IBakedModel)(moom.JZ.a)))));
    life2_78 = spill2329_0;
    n = ((net.minecraft.client.resources.model.IBakedModel)(moom.JZ.a__pp(((net.minecraft.client.resources.model.IBakedModel)(moom.JZ.b)))));
    o = ((net.minecraft.client.resources.model.IBakedModel)(moom.JZ.a__pp(((net.minecraft.client.resources.model.IBakedModel)(moom.JZ.c)))));
    p = ((net.minecraft.client.resources.model.IBakedModel)(moom.JZ.a__pp(((net.minecraft.client.resources.model.IBakedModel)(moom.JZ.d)))));
    q = ((net.minecraft.client.resources.model.IBakedModel)(moom.JZ.a__pp(((net.minecraft.client.resources.model.IBakedModel)(moom.JZ.e)))));
    r = ((net.minecraft.client.resources.model.IBakedModel)(moom.JZ.a__pp(((net.minecraft.client.resources.model.IBakedModel)(moom.JZ.f)))));
    spill2329_1 = life3_7;
    if (!((life2_78 != null))) {
        forwardValue2329_100_0 = spill2329_1;
        break forward_join_100;
    }
    if (!((((java.util.List)(spill2329_1)).size() > 0))) {
        break forward_join_110;
    }
    forwardValue2329_100_0 = life3_7;
    }
    java.lang.String __stackOp2329_60_0 = moom.BU.a(((java.lang.Object[])(((java.util.List)(forwardValue2329_100_0)).toArray())));
    java.lang.String __stackOp2329_60_1 = __sourceIntrinsic_2c8ae721fed4_invokedynamic2329_59(3038, (224795962579633365L ^ life0_3));
    moom.BU.b__Void(((java.lang.String)(__sourceIntrinsic_2c8ae721fed4_invokedynamic2329_61(__stackOp2329_60_1, __stackOp2329_60_0))));
    }
    return;
}


private static java.util.List a(net.minecraft.client.resources.model.IBakedModel p0) {
net.minecraft.client.resources.model.IBakedModel forwardValue2332_13_0;
    java.util.List forwardValue2332_14_0;
    net.minecraft.client.resources.model.IBakedModel spill2332_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_14: {
    forward_join_13: {
    forward_join_12: {
    life1_3 = (moom.JZ.s ^ 20544258837179L);
    life3_5 = moom.JM.b__Arrayr3();
    spill2332_0 = p0;
    if (!((life3_5 != null))) {
        forwardValue2332_13_0 = spill2332_0;
        break forward_join_13;
    }
    if (!((spill2332_0 == null))) {
        break forward_join_12;
    }
    forwardValue2332_14_0 = null;
    break forward_join_14;
    }
    forwardValue2332_13_0 = p0;
    }
    forwardValue2332_14_0 = ((net.minecraft.client.resources.model.IBakedModel)(forwardValue2332_13_0)).a();
    }
    return forwardValue2332_14_0;
}


static net.minecraft.client.resources.model.IBakedModel a(java.lang.String p0, java.util.List p1) { return __sourceHandlerCall_3e3fe359ba38437996ca(p0, p1); }


private static net.minecraft.client.resources.model.IBakedModel a__pp(net.minecraft.client.resources.model.IBakedModel p0) {
net.minecraft.client.resources.model.IBakedModel lexicalValue847_13_0;
    int lexicalValue847_21_0;
    net.minecraft.client.resources.model.IBakedModel lexicalValue847_101_0;
    net.minecraft.client.resources.model.IBakedModel lexicalValue847_204_0;
    net.minecraft.client.resources.model.IBakedModel spill847_0;
    int spill847_1;
    java.lang.String spill847_2;
    int spill847_3;
    net.minecraft.client.resources.model.IBakedModel spill847_4;
    net.minecraft.client.resources.model.IBakedModel spill847_5;
    moom.bs spill847_6;
    int spill847_7;
    net.minecraft.client.resources.model.IBakedModel spill847_8;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    moom.bs[] life4_51;
    moom.bs[] life5_53;
    int life6_56;
    int life7_58;
    moom.bs life8_65;
    java.util.List life9_71;
    net.minecraft.client.resources.model.IBakedModel life17_85;
    int life18_86;
    moom.bs life19_87;
    net.minecraft.client.resources.model.IBakedModel life5_115;
    java.util.List[] life6_119;
    moom.bs[] life7_121;
    int life8_124;
    int life9_126;
    moom.bs life10_133;
    java.util.List life11_139;
    moom.lC life12_144;
    moom.lC life13_158;
    int[] life14_161;
    int[] life15_165;
    int life16_170;
    lexical_join_204: {
    lexical_join_203: {
    lexical_join_101: {
    lexical_join_99: {
    lexical_join_39: {
    lexical_join_21: {
    lexical_join_13: {
    lexical_join_12: {
    life1_3 = (moom.JZ.s ^ 38946501499934L);
    life3_5 = moom.JM.b__Arrayr3();
    spill847_0 = p0;
    if (!((life3_5 != null))) {
        lexicalValue847_13_0 = spill847_0;
        break lexical_join_13;
    }
    if (!((spill847_0 == null))) {
        break lexical_join_12;
    }
    return null;
    }
    lexicalValue847_13_0 = p0;
    }
    spill847_1 = ((java.util.List)(((net.minecraft.client.resources.model.IBakedModel)(lexicalValue847_13_0)).a())).size();
    if (!((life3_5 != null))) {
        lexicalValue847_21_0 = spill847_1;
        break lexical_join_21;
    }
    if (!((spill847_1 > 0))) {
        break lexical_join_39;
    }
    lexicalValue847_21_0 = ((java.util.List)(((net.minecraft.client.resources.model.IBakedModel)(p0)).a())).size();
    }
    int __stackOp847_7_0 = lexicalValue847_21_0;
    net.minecraft.client.resources.model.IBakedModel __stackOp847_7_1 = p0;
    java.lang.String __stackOp847_7_2 = __sourceIntrinsic_a9315286e9bb_invokedynamic847_6(2151, (2406178496797715871L ^ life1_3));
    spill847_2 = __stackOp847_7_2;
    spill847_3 = __stackOp847_7_0;
    spill847_4 = __stackOp847_7_1;
    recovery.source.CarrierOps.discard(__stackOp847_7_2);
    net.minecraft.client.resources.model.IBakedModel __stackOp847_10_0 = spill847_4;
    java.lang.String __stackOp847_10_1 = __sourceIntrinsic_a9315286e9bb_invokedynamic847_9(8158, (1294783540309375533L ^ life1_3));
    moom.BU.c(((java.lang.String)(__sourceIntrinsic_a9315286e9bb_invokedynamic847_11(spill847_2, spill847_3, __stackOp847_10_1, __stackOp847_10_0))));
    return p0;
    }
    life4_51 = moom.bs.VALUES;
    life5_53 = life4_51;
    life6_56 = (life5_53).length;
    life7_58 = 0;
    lexical_cycle_48: while (true) {
    lexical_join_97: {
    lexical_join_96: {
    if (!((life7_58 < life6_56))) {
        break lexical_join_99;
    }
    life8_65 = (life5_53)[life7_58];
    spill847_5 = p0;
    if (!((life3_5 != null))) {
        lexicalValue847_101_0 = spill847_5;
        break lexical_join_101;
    }
    life9_71 = ((net.minecraft.client.resources.model.IBakedModel)(spill847_5)).a(((moom.bs)(life8_65)));
    if (!((life3_5 != null))) {
        break lexical_join_97;
    }
    if (!((((java.util.List)(life9_71)).size() != 1))) {
        break lexical_join_96;
    }
    spill847_6 = life8_65;
    spill847_7 = ((java.util.List)(life9_71)).size();
    life17_85 = p0;
    life18_86 = spill847_7;
    life19_87 = spill847_6;
    moom.BU.c(((java.lang.String)(__sourceIntrinsic_a9315286e9bb_invokedynamic847_20(__sourceIntrinsic_a9315286e9bb_invokedynamic847_17(3654, (5546122752709733298L ^ life1_3)), life19_87, __sourceIntrinsic_a9315286e9bb_invokedynamic847_18(23426, (4647227600263085691L ^ life1_3)), life18_86, __sourceIntrinsic_a9315286e9bb_invokedynamic847_19(8818, (8543225331714262917L ^ life1_3)), life17_85))));
    return p0;
    }
    life7_58 += 1;
    }
    if (!((life3_5 == null))) { continue lexical_cycle_48; }
    break lexical_cycle_48;
    }
    }
    lexicalValue847_101_0 = moom.L1.a(((net.minecraft.client.resources.model.IBakedModel)(p0)));
    }
    life5_115 = lexicalValue847_101_0;
    life6_119 = new java.util.List[(life4_51).length];
    life7_121 = life4_51;
    life8_124 = (life7_121).length;
    life9_126 = 0;
    lexical_cycle_113: while (true) {
    if (!((life9_126 < life8_124))) {
        break lexical_join_203;
    }
    life10_133 = (life7_121)[life9_126];
    spill847_8 = life5_115;
    if (!((life3_5 != null))) {
        lexicalValue847_204_0 = spill847_8;
        break lexical_join_204;
    }
    life11_139 = ((net.minecraft.client.resources.model.IBakedModel)(spill847_8)).a(((moom.bs)(life10_133)));
    life12_144 = ((moom.lC)(((java.util.List)(life11_139)).get(((int)(0)))));
    life13_158 = new moom.lC(((int[])(((int[])(((moom.lC)(life12_144)).a__ArrayInt())).clone())), ((moom.lC)(life12_144)).a__Int(), ((moom.lC)(life12_144)).a__bs(), ((moom.lC)(life12_144)).a__oh());
    life14_161 = ((moom.lC)(life13_158)).a__ArrayInt();
    life15_165 = ((int[])(((int[])(life14_161)).clone()));
    life16_170 = ((life14_161).length / 4);
    java.lang.System.arraycopy(((java.lang.Object)(life14_161)), ((int)(0)), ((java.lang.Object)(life15_165)), ((int)((3 * life16_170))), ((int)(life16_170)));
    java.lang.System.arraycopy(((java.lang.Object)(life14_161)), ((int)(life16_170)), ((java.lang.Object)(life15_165)), ((int)((2 * life16_170))), ((int)(life16_170)));
    java.lang.System.arraycopy(((java.lang.Object)(life14_161)), ((int)((2 * life16_170))), ((java.lang.Object)(life15_165)), ((int)(life16_170)), ((int)(life16_170)));
    java.lang.System.arraycopy(((java.lang.Object)(life14_161)), ((int)((3 * life16_170))), ((java.lang.Object)(life15_165)), ((int)(0)), ((int)(life16_170)));
    java.lang.System.arraycopy(((java.lang.Object)(life15_165)), ((int)(0)), ((java.lang.Object)(life14_161)), ((int)(0)), ((int)((life15_165).length)));
    ((java.util.List)(life11_139)).add(((java.lang.Object)(life13_158)));
    life9_126 += 1;
    if (!((life3_5 == null))) { continue lexical_cycle_113; }
    break lexical_cycle_113;
    }
    }
    lexicalValue847_204_0 = life5_115;
    }
    return lexicalValue847_204_0;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2c8ae721fed4_invokedynamic2329_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2c8ae721fed4_invokedynamic2329_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2c8ae721fed4_invokedynamic2329_7(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2c8ae721fed4_invokedynamic2329_10(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2c8ae721fed4_invokedynamic2329_13(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2c8ae721fed4_invokedynamic2329_16(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2c8ae721fed4_invokedynamic2329_59(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2c8ae721fed4_invokedynamic2329_61(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_14d889ca4ce8_invokedynamic99_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral5223_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a9315286e9bb_invokedynamic847_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a9315286e9bb_invokedynamic847_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a9315286e9bb_invokedynamic847_11(java.lang.String a0, int a1, java.lang.String a2, net.minecraft.client.resources.model.IBakedModel a3) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a9315286e9bb_invokedynamic847_17(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a9315286e9bb_invokedynamic847_18(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a9315286e9bb_invokedynamic847_19(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a9315286e9bb_invokedynamic847_20(java.lang.String a0, moom.bs a1, java.lang.String a2, int a3, java.lang.String a4, net.minecraft.client.resources.model.IBakedModel a5) throws E;
}
