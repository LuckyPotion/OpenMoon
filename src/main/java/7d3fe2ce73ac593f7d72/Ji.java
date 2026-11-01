package moom;


public class Ji {

private static net.minecraft.util.EnumWorldBlockLayer[] a;

public static boolean b;

private static final long c;

private static final java.lang.String[] d;

private static final java.lang.String[] e;

private static final java.util.Map f;

public Ji() {
super();
}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(-5504321302578690844L)), ((long)(8523434186954543664L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(71710015008405L)))));

    f = ((java.util.Map)(new java.util.HashMap(13)));

    long local0_life7 = (moom.Ji.c ^ 139501713802363L);

    javax.crypto.Cipher local2_life9;

    javax.crypto.Cipher __sourceSpill729_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));

    int __sourceSpill729_12 = 2;

    javax.crypto.SecretKeyFactory __sourceSpill729_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));

    byte[] __sourceSpill729_14 = new byte[8];

    (__sourceSpill729_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));

    int local3_life15 = 1;

    while ((local3_life15 < 8)) {

        (__sourceSpill729_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));

        local3_life15 += 1;

    }

    byte[] __sourcePreallocation729_16 = __sourceSpill729_14;

    ((javax.crypto.Cipher)(__sourceSpill729_11)).init(((int)(__sourceSpill729_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill729_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation729_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));

    java.lang.String[] local9_life19 = new java.lang.String[12];

    int local7_life20 = 0;

    java.lang.String local6_life21;

    int local8_life23 = ((java.lang.String)((local6_life21 = "o+Õ+á;Ò0\022§sÙç`\007»\n_ò4)/xW¡êÊ\002\032\034A(ÛÕñ\r\033Þi%bQa\022<Ì\035Ë²¥ék§pl\032\005¬`9Oÿ\027×$)ÄýÂä\020µÂ4\fö2{7ª¾\003ÞA{\000Xeay_\003v±\\\\çÄé9\tûô)çPb§\f°\037xr\fk\030P\005£/nJ\0258:Z°Y4É7\r\027\0229È«çÉ]? ¼Aª?ÜÇÈ\tå9°L\\\nÖ:\036\031=ÀA·8êzÛ¹ÀO\"×p\003\036\177,üÕ\0321¡ þ«\025\020³Ñyb¾\034AæP²ÿ1\021ñý]n M-DrÊ¬\021m\020\030|g×Ýì\bM`«\030ñ:(\"BR\177k\022ºf\035\026\030Yî_ß²7\036\025pÏ,Ç\021¦í.Þ¼¦º)\027ü©<Ö0\020ßí5×Êö#²=ÒÑ þBÈ!\030%·\032)÷¢9P\005è\"Ëþ\022¹\tö\016i½´\\ Jò:­¦»\022*Yù¾V¿ÎE\0273õÒúÍÌ\013y\017\026;õ"))).length();

    int local5_life24 = 40;

    int local4_life25 = -1;

    while (true) {

        local4_life25 += 1;

        byte[] __sourceSpill729_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill729_29 = local2_life9;

        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill729_29)).doFinal(((byte[])(__sourceSpill729_28)));

        java.lang.String __sourceSpill729_34 = ((java.lang.String)(moom.Ji.a(((byte[])(local10_life31))))).intern();

        java.lang.String[] __sourceSpill729_35 = local9_life19;

        int __sourceSpill729_36 = local7_life20;

        local7_life20 += 1;

        (__sourceSpill729_35)[__sourceSpill729_36] = __sourceSpill729_34;

        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }

        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));

    }

    local8_life23 = ((java.lang.String)((local6_life21 = "M¸RË9ù\bhs)\t`³«wC§ðÜÄX$.;Ë.bÕßË¥Äçí°\016ødZêÊ2ym\024m\027F}ÿ ¦üê'\006ã ¿6;ú\"¸õØ\177'ß]C)eê\030¼\027ô;"))).length();

    local5_life24 = 56;

    local4_life25 = -1;

    while (true) {

        local4_life25 += 1;

        byte[] __sourceSpill729_42 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill729_43 = local2_life9;

        byte[] local10_life45 = ((javax.crypto.Cipher)(__sourceSpill729_43)).doFinal(((byte[])(__sourceSpill729_42)));

        java.lang.String __sourceSpill729_48 = ((java.lang.String)(moom.Ji.a(((byte[])(local10_life45))))).intern();

        java.lang.String[] __sourceSpill729_49 = local9_life19;

        int __sourceSpill729_50 = local7_life20;

        local7_life20 += 1;

        (__sourceSpill729_49)[__sourceSpill729_50] = __sourceSpill729_48;

        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }

        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));

    }

    d = ((java.lang.String[])(local9_life19));

    e = ((java.lang.String[])(new java.lang.String[12]));

    a = ((net.minecraft.util.EnumWorldBlockLayer[])(null));

    b = ((boolean)(false));
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
        byte[] spill2762_0 = p0;
        life4_9 += 1;
        life5_44 = (spill2762_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill2762_1 = p0;
        life4_9 += 1;
        life5_76 = (spill2762_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill2762_2 = p0;
        life4_9 += 1;
        life5_91 = (spill2762_2)[life4_9];
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 9464);
    if (((moom.Ji.e)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.Ji.f)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.Ji.f)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/Ji", life9_51);
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
        life9_116 = ((java.lang.String)((moom.Ji.d)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.Ji.e)[life5_8] = moom.Ji.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.Ji.e)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.Ji.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral5344_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Ji"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public static void a() {
int forwardValue2382_54_0;
    int forwardValue2382_64_0;
    net.minecraft.entity.Entity[] spill2382_0;
    boolean spill2382_1;
    long life0_3;
    java.util.ArrayList life3_12;
    java.lang.String life4_18;
    java.util.Properties life5_26;
    net.minecraft.entity.Entity[] life2_27;
    moom.OH life6_45;
    java.lang.String life7_53;
    forward_join_65: {
    forward_join_64: {
    forward_join_54: {
    forward_join_52: {
    forward_join_34: {
    life0_3 = (moom.Ji.c ^ 110152400317188L);
    spill2382_0 = moom.JM.b__Arrayr3();
    moom.Ji.a = ((net.minecraft.util.EnumWorldBlockLayer[])(null));
    moom.Ji.b = ((boolean)(false));
    life3_12 = new java.util.ArrayList();
    life4_18 = __sourceIntrinsic_2c8ae721fed4_invokedynamic2382_4(24752, (3045865973011608139L ^ life0_3));
    life5_26 = moom.N_.a(((java.lang.String)(life4_18)), ((java.lang.String)(__sourceIntrinsic_2c8ae721fed4_invokedynamic2382_5(21422, (8049401151996150111L ^ life0_3)))));
    life2_27 = spill2382_0;
    if (!((life5_26 != null))) {
        break forward_join_34;
    }
    moom.Ji.a(((java.lang.String)(life4_18)), ((java.util.Properties)(life5_26)), ((java.util.List)(life3_12)));
    }
    spill2382_1 = moom.BU.ap();
    if (!((life2_27 != null))) {
        forwardValue2382_54_0 = ((spill2382_1) ? 1 : 0);
        break forward_join_54;
    }
    if (!(spill2382_1)) {
        break forward_join_52;
    }
    life6_45 = moom.Mm.a();
    if (!((life6_45 != null))) {
        break forward_join_52;
    }
    life7_53 = __sourceIntrinsic_2c8ae721fed4_invokedynamic2382_11(13016, (3355989387683569709L ^ life0_3));
    moom.Ji.a(((java.lang.String)(life7_53)), ((java.util.Properties)(life6_45)), ((java.util.List)(life3_12)));
    }
    forwardValue2382_54_0 = ((((java.util.List)(life3_12)).isEmpty()) ? 1 : 0);
    }
    if (!((life2_27 != null))) {
        forwardValue2382_64_0 = forwardValue2382_54_0;
        break forward_join_64;
    }
    if (!((forwardValue2382_54_0 == 0))) {
        break forward_join_65;
    }
    moom.Ji.a = ((net.minecraft.util.EnumWorldBlockLayer[])(((net.minecraft.util.EnumWorldBlockLayer[])(((java.util.List)(life3_12)).toArray(((java.lang.Object[])(new net.minecraft.util.EnumWorldBlockLayer[0])))))));
    forwardValue2382_64_0 = 1;
    }
    moom.Ji.b = ((boolean)__sourceIntrinsic_integerToBoolean((forwardValue2382_64_0)));
    }
    return;
}


private static void a(java.lang.String p0, java.util.Properties p1, java.util.List<net.minecraft.util.EnumWorldBlockLayer> p2) {
long local3_life2 = (moom.Ji.c ^ 123112600201738L);
    java.lang.String __stackOp540_5_0 = p0;
    java.lang.String __stackOp540_5_1 = __sourceIntrinsic_e84d0022f294_originalDynamicSite540_4(9075, (7832629589341433997L ^ local3_life2));
    moom.BU.b__Void(((java.lang.String)(__sourceIntrinsic_e84d0022f294_originalDynamicSite540_6(__stackOp540_5_1, __stackOp540_5_0))));
    moom.Ji.a(((java.lang.String)(__sourceIntrinsic_e84d0022f294_originalDynamicSite540_9(32589, (7498130328364788919L ^ local3_life2)))), ((net.minecraft.util.EnumWorldBlockLayer)(net.minecraft.util.EnumWorldBlockLayer.SOLID)), ((java.util.Properties)(p1)), ((java.util.List)(p2)));
    moom.Ji.a(((java.lang.String)(__sourceIntrinsic_e84d0022f294_originalDynamicSite540_13(15633, (5461172277402955500L ^ local3_life2)))), ((net.minecraft.util.EnumWorldBlockLayer)(net.minecraft.util.EnumWorldBlockLayer.CUTOUT)), ((java.util.Properties)(p1)), ((java.util.List)(p2)));
    moom.Ji.a(((java.lang.String)(__sourceIntrinsic_e84d0022f294_originalDynamicSite540_17(20515, (3829662260625769428L ^ local3_life2)))), ((net.minecraft.util.EnumWorldBlockLayer)(net.minecraft.util.EnumWorldBlockLayer.CUTOUT_MIPPED)), ((java.util.Properties)(p1)), ((java.util.List)(p2)));
    moom.Ji.a(((java.lang.String)(__sourceIntrinsic_e84d0022f294_originalDynamicSite540_21(23723, (2366310806670577501L ^ local3_life2)))), ((net.minecraft.util.EnumWorldBlockLayer)(net.minecraft.util.EnumWorldBlockLayer.TRANSLUCENT)), ((java.util.Properties)(p1)), ((java.util.List)(p2)));
    return;
}


private static void a(java.lang.String p0, net.minecraft.util.EnumWorldBlockLayer p1, java.util.Properties p2, java.util.List<net.minecraft.util.EnumWorldBlockLayer> p3) {
moom.J_[] lexicalValue863_39_0;
    java.lang.Object lexicalValue863_100_0;
    net.minecraft.entity.Entity[] spill863_0;
    moom.J_[] spill863_1;
    java.lang.Object spill863_2;
    java.lang.String spill863_3;
    int spill863_4;
    java.lang.String spill863_5;
    long life4_3;
    java.lang.String life7_13;
    net.minecraft.entity.Entity[] life6_14;
    java.lang.String life8_18;
    moom.J3 life9_29;
    moom.J_[] life10_33;
    moom.J_[] life11_42;
    int life12_45;
    int life13_47;
    moom.J_ life14_54;
    int life15_57;
    lexical_join_104: {
    lexical_join_39: {
    life4_3 = (moom.Ji.c ^ 10621902438923L);
    spill863_0 = moom.JM.b__Arrayr3();
    java.lang.String __stackOp863_3_0 = p0;
    java.lang.String __stackOp863_3_1 = __sourceIntrinsic_538d21f14ea0_invokedynamic863_2(21261, (731914619611719924L ^ life4_3));
    life7_13 = __sourceIntrinsic_538d21f14ea0_invokedynamic863_4(__stackOp863_3_1, __stackOp863_3_0);
    life6_14 = spill863_0;
    life8_18 = ((java.util.Properties)(p2)).getProperty(((java.lang.String)(life7_13)));
    if (!((life8_18 != null))) {
        break lexical_join_104;
    }
    life9_29 = new moom.J3(__sourceIntrinsic_538d21f14ea0_invokedynamic863_6(933, (3938708794087700573L ^ life4_3)));
    life10_33 = ((moom.J3)(life9_29)).a__ArrayJ_(((java.lang.String)(life8_18)));
    spill863_1 = life10_33;
    if (!((life6_14 != null))) {
        lexicalValue863_39_0 = spill863_1;
        break lexical_join_39;
    }
    if (!((spill863_1 != null))) {
        break lexical_join_104;
    }
    lexicalValue863_39_0 = life10_33;
    }
    life11_42 = lexicalValue863_39_0;
    life12_45 = (life11_42).length;
    life13_47 = 0;
    lexical_cycle_45: while (true) {
    lexical_join_102: {
    lexical_join_101: {
    lexical_join_100: {
    lexical_join_96: {
    lexical_join_73: {
    if (!((life13_47 < life12_45))) {
        break lexical_join_104;
    }
    life14_54 = (life11_42)[life13_47];
    life15_57 = ((moom.J_)(life14_54)).a();
    if (!((life6_14 != null))) {
        break lexical_join_102;
    }
    if (!((life15_57 > 0))) {
        break lexical_join_101;
    }
    lexical_cycle_59: while (true) {
    if (!((((java.util.List)(p3)).size() < (life15_57 + 1)))) {
        break lexical_join_73;
    }
    ((java.util.List)(p3)).add(((java.lang.Object)(null)));
    if (!((life6_14 != null))) {
        break lexical_join_96;
    }
    if (!((life6_14 == null))) { continue lexical_cycle_59; }
    break lexical_cycle_59;
    }
    }
    spill863_2 = ((java.util.List)(p3)).get(((int)(life15_57)));
    if (!((life6_14 != null))) {
        lexicalValue863_100_0 = spill863_2;
        break lexical_join_100;
    }
    if (!((spill863_2 != null))) {
        break lexical_join_96;
    }
    int __stackOp863_13_0 = life15_57;
    java.lang.String __stackOp863_13_1 = p0;
    java.lang.String __stackOp863_13_2 = __sourceIntrinsic_538d21f14ea0_invokedynamic863_12(14535, (123755958015738682L ^ life4_3));
    spill863_3 = __stackOp863_13_2;
    spill863_4 = __stackOp863_13_0;
    spill863_5 = __stackOp863_13_1;
    recovery.source.CarrierOps.discard(__stackOp863_13_2);
    java.lang.String __stackOp863_16_0 = spill863_5;
    java.lang.String __stackOp863_16_1 = __sourceIntrinsic_538d21f14ea0_invokedynamic863_15(339, (3958248161620589222L ^ life4_3));
    moom.BU.c(((java.lang.String)(__sourceIntrinsic_538d21f14ea0_invokedynamic863_17(spill863_3, spill863_4, __stackOp863_16_1, __stackOp863_16_0))));
    }
    lexicalValue863_100_0 = ((java.util.List)(p3)).set(((int)(life15_57)), ((java.lang.Object)(p1)));
    }
    recovery.source.CarrierOps.discard(lexicalValue863_100_0);
    }
    life13_47 += 1;
    }
    if (!((life6_14 == null))) { continue lexical_cycle_45; }
    break lexical_cycle_45;
    }
    }
    return;
}


public static boolean a__Boolean() {
return ((((moom.Ji.b) ? 1 : 0)) != 0);
}


public static net.minecraft.util.EnumWorldBlockLayer a(net.minecraft.block.state.IBlockState p0) {
int forwardValue2384_22_0;
    net.minecraft.block.state.IBlockState forwardValue2384_24_0;
    int forwardValue2384_38_0;
    net.minecraft.util.EnumWorldBlockLayer forwardValue2384_46_0;
    boolean spill2384_0;
    net.minecraft.block.state.IBlockState spill2384_1;
    int spill2384_2;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    moom.fB life4_35;
    int life5_44;
    forward_join_46: {
    forward_join_45: {
    forward_join_38: {
    forward_join_30: {
    forward_join_28: {
    forward_join_24: {
    forward_join_22: {
    forward_join_18: {
    forward_join_10: {
    life1_3 = (moom.Ji.c ^ 131909310075411L);
    life3_5 = moom.JM.b__Arrayr3();
    if (!((moom.Ji.a == null))) {
        break forward_join_10;
    }
    return null;
    }
    spill2384_0 = ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(p0)).a__ch())).j();
    if (!((life3_5 != null))) {
        forwardValue2384_22_0 = ((spill2384_0) ? 1 : 0);
        break forward_join_22;
    }
    if (!(spill2384_0)) {
        break forward_join_18;
    }
    return null;
    }
    spill2384_1 = p0;
    if (!((life3_5 != null))) {
        forwardValue2384_24_0 = spill2384_1;
        break forward_join_24;
    }
    forwardValue2384_22_0 = ((spill2384_1 instanceof moom.fB) ? 1 : 0);
    }
    if (!((forwardValue2384_22_0 != 0))) {
        break forward_join_28;
    }
    forwardValue2384_24_0 = p0;
    }
    life4_35 = ((moom.fB)(forwardValue2384_24_0));
    if (!((life3_5 == null))) {
        break forward_join_30;
    }
    }
    return null;
    }
    life5_44 = ((moom.fB)(life4_35)).a__sourceReturn_8abf5c6871();
    spill2384_2 = life5_44;
    if (!((life3_5 != null))) {
        forwardValue2384_38_0 = spill2384_2;
        break forward_join_38;
    }
    if (!((spill2384_2 > 0))) {
        break forward_join_45;
    }
    forwardValue2384_38_0 = life5_44;
    }
    if (!((forwardValue2384_38_0 < (moom.Ji.a).length))) {
        break forward_join_45;
    }
    forwardValue2384_46_0 = (moom.Ji.a)[life5_44];
    break forward_join_46;
    }
    forwardValue2384_46_0 = null;
    }
    return forwardValue2384_46_0;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral5344_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2c8ae721fed4_invokedynamic2382_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2c8ae721fed4_invokedynamic2382_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2c8ae721fed4_invokedynamic2382_11(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e84d0022f294_originalDynamicSite540_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e84d0022f294_originalDynamicSite540_6(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e84d0022f294_originalDynamicSite540_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e84d0022f294_originalDynamicSite540_13(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e84d0022f294_originalDynamicSite540_17(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e84d0022f294_originalDynamicSite540_21(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_538d21f14ea0_invokedynamic863_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_538d21f14ea0_invokedynamic863_4(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_538d21f14ea0_invokedynamic863_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_538d21f14ea0_invokedynamic863_12(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_538d21f14ea0_invokedynamic863_15(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_538d21f14ea0_invokedynamic863_17(java.lang.String a0, int a1, java.lang.String a2, java.lang.String a3) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
