package moom;


public class L1 {

private static final long a;

private static final java.lang.String[] b;

private static final java.lang.String[] c;

private static final java.util.Map d;

public L1() {
super();
}


static {
a = ((long)(((moom._a)(moom._c.a(((long)(-5033323252029399796L)), ((long)(-5277833961073687972L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(34779447436633L)))));
    d = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.L1.a ^ 74891936115324L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill795_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill795_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill795_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill795_14 = new byte[8];
    (__sourceSpill795_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill795_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation795_16 = __sourceSpill795_14;
    ((javax.crypto.Cipher)(__sourceSpill795_11)).init(((int)(__sourceSpill795_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill795_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation795_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local9_life19 = new java.lang.String[18];
    int local7_life20 = 0;
    java.lang.String local6_life21;
    int local8_life23 = ((java.lang.String)((local6_life21 = "¬ö\004jðóDÄ\036\030n\025³ ÷û\030,Lz\n©­\024¾ð¨º3þÎ[Ü\rÏG»\r\021«'\n\020°Q\025ªl÷e¦\036ëgwd eàù=¹\017»DÚ=òùv\023/çI Ø\003\020Í\030DÈÒvP\013 üG\007ÏúW\002ÒÕÜmCJ\030WË\"xÁ80å*¢\032r:\020]leSêÞÎ\0175¬øXV Q\027\002fÆÌBÌÍ'ê¶OáÐpRüÏ\023F(g\030Q3hÇÕË¡*¿Þ³g£r!E\001%\030\\YI]Ú§³£\fý\031÷Í¿¦©d¨Þ9\0209|!\" hçlé´ò»l \017÷A\013utO6º\fI_KÑp \bî\031õôI\t\025ïU Ç Ck]F+ëª\f`q>´øÎÔb\034?µpÃÊ\003Ý\004\020\005Ë·16B\tµùH38j$¬\020\026É.zØà¿>\031½¦vgL\020øÿùä \0342ÛÃµA]¤\030¡LúH{P\033É!aýEóëµ`ü©<¶\nï"))).length();
    int local5_life24 = 16;
    int local4_life25 = -1;
    while (true) {
        local4_life25 += 1;
        byte[] __sourceSpill795_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill795_29 = local2_life9;
        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill795_29)).doFinal(((byte[])(__sourceSpill795_28)));
        java.lang.String __sourceSpill795_34 = ((java.lang.String)(moom.L1.a(((byte[])(local10_life31))))).intern();
        java.lang.String[] __sourceSpill795_35 = local9_life19;
        int __sourceSpill795_36 = local7_life20;
        local7_life20 += 1;
        (__sourceSpill795_35)[__sourceSpill795_36] = __sourceSpill795_34;
        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }
        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));
    }
    local8_life23 = ((java.lang.String)((local6_life21 = "Ý_ÌÔ:ø\"b¶V=63\002½\"Üfö\003à µ¾i¤âUÁ\021\020{ñ³\000Þ¹ÝÓfYÌüí{Ôh"))).length();
    local5_life24 = 32;
    local4_life25 = -1;
    while (true) {
        local4_life25 += 1;
        byte[] __sourceSpill795_42 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill795_43 = local2_life9;
        byte[] local10_life45 = ((javax.crypto.Cipher)(__sourceSpill795_43)).doFinal(((byte[])(__sourceSpill795_42)));
        java.lang.String __sourceSpill795_48 = ((java.lang.String)(moom.L1.a(((byte[])(local10_life45))))).intern();
        java.lang.String[] __sourceSpill795_49 = local9_life19;
        int __sourceSpill795_50 = local7_life20;
        local7_life20 += 1;
        (__sourceSpill795_49)[__sourceSpill795_50] = __sourceSpill795_48;
        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }
        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));
    }
    b = ((java.lang.String[])(local9_life19));
    c = ((java.lang.String[])(new java.lang.String[18]));
}


public static moom.lC a(moom.lC p0) {
return new moom.lC(((int[])(((int[])(((moom.lC)(p0)).a__ArrayInt())).clone())), ((moom.lC)(p0)).a__Int(), ((moom.lC)(p0)).a__bs(), ((moom.lC)(p0)).a__oh());
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
        byte[] spill2979_0 = p0;
        life4_9 += 1;
        life5_44 = (spill2979_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill2979_1 = p0;
        life4_9 += 1;
        life5_76 = (spill2979_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill2979_2 = p0;
        life4_9 += 1;
        life5_91 = (spill2979_2)[life4_9];
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 27915);
    if (((moom.L1.c)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.L1.d)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.L1.d)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/L1", life9_51);
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
        life9_116 = ((java.lang.String)((moom.L1.b)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.L1.c)[life5_8] = moom.L1.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.L1.c)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.L1.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral5828_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/L1"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public static void a__Void(net.minecraft.client.resources.model.IBakedModel p0) {
net.minecraft.client.resources.model.IBakedModel lexicalValue910_11_0;
    net.minecraft.client.resources.model.IBakedModel spill910_0;
    boolean spill910_1;
    boolean spill910_2;
    boolean spill910_3;
    long life1_3;
    int[] life3_5;
    net.minecraft.client.renderer.texture.TextureAtlasSprite life10_22;
    int life11_23;
    int life12_24;
    int life13_25;
    net.minecraft.client.resources.model.IBakedModel life14_26;
    moom.bs[] life4_60;
    moom.bs[] life5_62;
    int life6_65;
    int life7_67;
    moom.bs life8_74;
    java.util.List life9_78;
    java.util.List life5_98;
    lexical_join_105: {
    lexical_join_90: {
    lexical_join_11: {
    life1_3 = (moom.L1.a ^ 37826831517560L);
    life3_5 = moom.LZ.b();
    spill910_0 = p0;
    if (!((life3_5 != null))) {
        lexicalValue910_11_0 = spill910_0;
        break lexical_join_11;
    }
    if (!((spill910_0 != null))) {
        break lexical_join_105;
    }
    lexicalValue910_11_0 = p0;
    }
    spill910_1 = ((net.minecraft.client.resources.model.IBakedModel)(p0)).a__Boolean();
    spill910_2 = ((net.minecraft.client.resources.model.IBakedModel)(p0)).b();
    spill910_3 = ((net.minecraft.client.resources.model.IBakedModel)(p0)).c();
    life10_22 = ((net.minecraft.client.resources.model.IBakedModel)(p0)).a__oh();
    life11_23 = ((spill910_3) ? 1 : 0);
    life12_24 = ((spill910_2) ? 1 : 0);
    life13_25 = ((spill910_1) ? 1 : 0);
    life14_26 = lexicalValue910_11_0;
    moom.BU.b__Void(((java.lang.String)(__sourceIntrinsic_576b1d924034_invokedynamic910_14(__sourceIntrinsic_576b1d924034_invokedynamic910_9(114, (5512488334571842422L ^ life1_3)), life14_26, __sourceIntrinsic_576b1d924034_invokedynamic910_10(27233, (2219166853109399907L ^ life1_3)), life13_25, __sourceIntrinsic_576b1d924034_invokedynamic910_11(8798, (6234742433023330644L ^ life1_3)), life12_24, __sourceIntrinsic_576b1d924034_invokedynamic910_12(22837, (7541906646100570665L ^ life1_3)), life11_23, __sourceIntrinsic_576b1d924034_invokedynamic910_13(28992, (8033652686978439751L ^ life1_3)), life10_22))));
    life4_60 = moom.bs.VALUES;
    life5_62 = life4_60;
    life6_65 = (life5_62).length;
    life7_67 = 0;
    lexical_cycle_65: while (true) {
    if (!((life7_67 < life6_65))) {
        break lexical_join_90;
    }
    life8_74 = (life5_62)[life7_67];
    life9_78 = ((net.minecraft.client.resources.model.IBakedModel)(p0)).a(((moom.bs)(life8_74)));
    moom.L1.a(((java.lang.String)(((moom.bs)(life8_74)).a__String())), ((java.util.List)(life9_78)), ((java.lang.String)(__sourceIntrinsic_576b1d924034_invokedynamic910_19(16890, (2370965713288850175L ^ life1_3)))));
    life7_67 += 1;
    if (!((life3_5 != null))) {
        break lexical_join_105;
    }
    if (!((life3_5 == null))) { continue lexical_cycle_65; }
    break lexical_cycle_65;
    }
    }
    life5_98 = ((net.minecraft.client.resources.model.IBakedModel)(p0)).a();
    moom.L1.a(((java.lang.String)(__sourceIntrinsic_576b1d924034_invokedynamic910_22(18104, (8444917270696324529L ^ life1_3)))), ((java.util.List)(life5_98)), ((java.lang.String)(__sourceIntrinsic_576b1d924034_invokedynamic910_23(3041, (3612114549515329788L ^ life1_3)))));
    }
    return;
}


private static void a(java.lang.String p0, java.util.List<moom.lC> p1, java.lang.String p2) {
int[] spill906_0;
    long life3_3;
    java.util.Iterator life6_7;
    int[] life5_8;
    moom.lC life7_15;
    lexical_join_22: {
    life3_3 = (moom.L1.a ^ 116789772978612L);
    spill906_0 = moom.LZ.b();
    life6_7 = ((java.util.List)(p1)).iterator();
    life5_8 = spill906_0;
    lexical_cycle_9: while (true) {
    if (!(((java.util.Iterator)(life6_7)).hasNext())) {
        break lexical_join_22;
    }
    life7_15 = ((moom.lC)(((java.util.Iterator)(life6_7)).next()));
    moom.L1.a(((java.lang.String)(p0)), ((moom.lC)(life7_15)), ((java.lang.String)(p2)));
    if (!((life5_8 == null))) { continue lexical_cycle_9; }
    break lexical_cycle_9;
    }
    }
    return;
}


public static void a(java.lang.String p0, moom.lC p1, java.lang.String p2) {
long local3_life2 = (moom.L1.a ^ 77727449997896L);
    java.lang.String __sourceSpill554_8 = p2;
    java.lang.String __sourceSpill554_9 = ((java.lang.Class)(((java.lang.Object)(p1)).getClass())).getName();
    java.lang.String __sourceSpill554_10 = p0;
    moom.bs __sourceSpill554_11 = ((moom.lC)(p1)).a__bs();
    int __sourceSpill554_12 = ((moom.lC)(p1)).a__Int();
    net.minecraft.client.renderer.texture.TextureAtlasSprite local5_life13 = ((moom.lC)(p1)).a__oh();
    int local6_life14 = __sourceSpill554_12;
    moom.bs local7_life15 = __sourceSpill554_11;
    java.lang.String local8_life16 = __sourceSpill554_10;
    java.lang.String local9_life17 = __sourceSpill554_9;
    moom.BU.b__Void(((java.lang.String)(__sourceIntrinsic_64d0aea4e922_originalDynamicSite554_28(__sourceSpill554_8, __sourceIntrinsic_64d0aea4e922_originalDynamicSite554_19(13005, (67805121987902716L ^ local3_life2)), local9_life17, __sourceIntrinsic_64d0aea4e922_originalDynamicSite554_21(11541, (5682576169439290154L ^ local3_life2)), local8_life16, __sourceIntrinsic_64d0aea4e922_originalDynamicSite554_23(12603, (5906625479063109376L ^ local3_life2)), local7_life15, __sourceIntrinsic_64d0aea4e922_originalDynamicSite554_25(4473, (4177074647179910977L ^ local3_life2)), local6_life14, __sourceIntrinsic_64d0aea4e922_originalDynamicSite554_27(31919, (3804961931492307602L ^ local3_life2)), local5_life13))));
    int[] __sourceSpill554_33 = ((moom.lC)(p1)).a__ArrayInt();
    java.lang.String __stackOp554_34_0 = p2;
    java.lang.String __stackOp554_34_1 = __sourceIntrinsic_64d0aea4e922_originalDynamicSite554_32(3041, (3612075870722803148L ^ local3_life2));
    moom.L1.a(((int[])(__sourceSpill554_33)), ((java.lang.String)(__sourceIntrinsic_64d0aea4e922_originalDynamicSite554_35(__stackOp554_34_1, __stackOp554_34_0))));
    return;
}


public static void a(int[] p0, java.lang.String p1) {
int[] spill909_0;
    java.lang.String spill909_1;
    java.lang.String spill909_2;
    int spill909_3;
    int spill909_4;
    java.lang.String spill909_5;
    int spill909_6;
    float spill909_7;
    float spill909_8;
    float spill909_9;
    int spill909_10;
    float spill909_11;
    long life2_3;
    int life5_9;
    int[] life4_10;
    int life6_31;
    int life7_38;
    float life8_43;
    float life9_50;
    float life10_57;
    int life11_63;
    float life12_70;
    float life13_77;
    float life14_86;
    float life15_87;
    int life16_88;
    float life17_89;
    float life18_90;
    float life19_91;
    int life20_92;
    lexical_join_123: {
    life2_3 = (moom.L1.a ^ 26947458350369L);
    spill909_0 = moom.LZ.b();
    life5_9 = ((p0).length / 4);
    life4_10 = spill909_0;
    spill909_1 = p1;
    int __stackOp909_3_0 = (p0).length;
    int __stackOp909_3_1 = life5_9;
    java.lang.String __stackOp909_3_2 = __sourceIntrinsic_7bf8c8630d38_invokedynamic909_2(13830, (4611636622420354908L ^ life2_3));
    spill909_2 = __stackOp909_3_2;
    spill909_3 = __stackOp909_3_0;
    spill909_4 = __stackOp909_3_1;
    recovery.source.CarrierOps.discard(__stackOp909_3_2);
    int __stackOp909_6_0 = spill909_4;
    java.lang.String __stackOp909_6_1 = __sourceIntrinsic_7bf8c8630d38_invokedynamic909_5(4789, (6439717133319177194L ^ life2_3));
    moom.BU.b__Void(((java.lang.String)(__sourceIntrinsic_7bf8c8630d38_invokedynamic909_7(spill909_1, spill909_2, spill909_3, __stackOp909_6_1, __stackOp909_6_0))));
    life6_31 = 0;
    lexical_cycle_32: while (true) {
    if (!((life6_31 < 4))) {
        break lexical_join_123;
    }
    life7_38 = (life6_31 * life5_9);
    life8_43 = java.lang.Float.intBitsToFloat(((int)((p0)[life7_38])));
    life9_50 = java.lang.Float.intBitsToFloat(((int)((p0)[(life7_38 + 1)])));
    life10_57 = java.lang.Float.intBitsToFloat(((int)((p0)[(life7_38 + 2)])));
    life11_63 = (p0)[(life7_38 + 3)];
    life12_70 = java.lang.Float.intBitsToFloat(((int)((p0)[(life7_38 + 4)])));
    life13_77 = java.lang.Float.intBitsToFloat(((int)((p0)[(life7_38 + 5)])));
    spill909_5 = p1;
    spill909_6 = life6_31;
    spill909_7 = life8_43;
    spill909_8 = life9_50;
    spill909_9 = life10_57;
    spill909_10 = life11_63;
    spill909_11 = life12_70;
    life14_86 = life13_77;
    life15_87 = spill909_11;
    life16_88 = spill909_10;
    life17_89 = spill909_9;
    life18_90 = spill909_8;
    life19_91 = spill909_7;
    life20_92 = spill909_6;
    moom.BU.b__Void(((java.lang.String)(__sourceIntrinsic_7bf8c8630d38_invokedynamic909_17(spill909_5, life20_92, __sourceIntrinsic_7bf8c8630d38_invokedynamic909_14(31968, (7979171080246717879L ^ life2_3)), life19_91, ",", life18_90, ",", life17_89, __sourceIntrinsic_7bf8c8630d38_invokedynamic909_15(30892, (53908538452666873L ^ life2_3)), life16_88, __sourceIntrinsic_7bf8c8630d38_invokedynamic909_16(32740, (7450806031777296061L ^ life2_3)), life15_87, ",", life14_86))));
    life6_31 += 1;
    if (!((life4_10 == null))) { continue lexical_cycle_32; }
    break lexical_cycle_32;
    }
    }
    return;
}


public static net.minecraft.client.resources.model.IBakedModel a(net.minecraft.client.resources.model.IBakedModel p0) {
int[] spill908_0;
    long life1_3;
    java.util.List life4_8;
    int[] life3_9;
    moom.bs[] life5_11;
    java.util.ArrayList life6_15;
    moom.bs[] life7_17;
    int life8_20;
    int life9_22;
    moom.bs life10_29;
    java.util.List life11_33;
    java.util.List life12_36;
    lexical_join_44: {
    life1_3 = (moom.L1.a ^ 87264748260482L);
    spill908_0 = moom.LZ.b();
    life4_8 = moom.L1.a(((java.util.List)(((net.minecraft.client.resources.model.IBakedModel)(p0)).a())));
    life3_9 = spill908_0;
    life5_11 = moom.bs.VALUES;
    life6_15 = new java.util.ArrayList();
    life7_17 = life5_11;
    life8_20 = (life7_17).length;
    life9_22 = 0;
    lexical_cycle_23: while (true) {
    if (!((life9_22 < life8_20))) {
        break lexical_join_44;
    }
    life10_29 = (life7_17)[life9_22];
    life11_33 = ((net.minecraft.client.resources.model.IBakedModel)(p0)).a(((moom.bs)(life10_29)));
    life12_36 = moom.L1.a(((java.util.List)(life11_33)));
    ((java.util.List)(life6_15)).add(((java.lang.Object)(life12_36)));
    life9_22 += 1;
    if (!((life3_9 == null))) { continue lexical_cycle_23; }
    break lexical_cycle_23;
    }
    }
    return new moom.ps(life4_8, life6_15, ((net.minecraft.client.resources.model.IBakedModel)(p0)).a__Boolean(), ((net.minecraft.client.resources.model.IBakedModel)(p0)).b(), ((net.minecraft.client.resources.model.IBakedModel)(p0)).a__oh(), ((net.minecraft.client.resources.model.IBakedModel)(p0)).a__lP());
}


public static java.util.List a(java.util.List<moom.lC> p0) {
java.util.ArrayList lexicalValue907_32_0;
    int[] spill907_0;
    java.util.ArrayList spill907_1;
    long life1_3;
    java.util.ArrayList life4_8;
    int[] life3_9;
    java.util.Iterator life5_12;
    moom.lC life6_19;
    moom.lC life7_22;
    lexical_join_32: {
    lexical_join_31: {
    life1_3 = (moom.L1.a ^ 63593966944735L);
    spill907_0 = moom.LZ.b();
    life4_8 = new java.util.ArrayList();
    life3_9 = spill907_0;
    life5_12 = ((java.util.List)(p0)).iterator();
    lexical_cycle_13: while (true) {
    if (!(((java.util.Iterator)(life5_12)).hasNext())) {
        break lexical_join_31;
    }
    life6_19 = ((moom.lC)(((java.util.Iterator)(life5_12)).next()));
    life7_22 = moom.L1.a(((moom.lC)(life6_19)));
    spill907_1 = life4_8;
    if (!((life3_9 != null))) {
        lexicalValue907_32_0 = spill907_1;
        break lexical_join_32;
    }
    ((java.util.List)(spill907_1)).add(((java.lang.Object)(life7_22)));
    if (!((life3_9 == null))) { continue lexical_cycle_13; }
    break lexical_cycle_13;
    }
    }
    lexicalValue907_32_0 = life4_8;
    }
    return lexicalValue907_32_0;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_64d0aea4e922_originalDynamicSite554_19(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_64d0aea4e922_originalDynamicSite554_21(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_64d0aea4e922_originalDynamicSite554_23(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_64d0aea4e922_originalDynamicSite554_25(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_64d0aea4e922_originalDynamicSite554_27(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_64d0aea4e922_originalDynamicSite554_28(java.lang.String a0, java.lang.String a1, java.lang.String a2, java.lang.String a3, java.lang.String a4, java.lang.String a5, moom.bs a6, java.lang.String a7, int a8, java.lang.String a9, net.minecraft.client.renderer.texture.TextureAtlasSprite a10) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_64d0aea4e922_originalDynamicSite554_32(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_64d0aea4e922_originalDynamicSite554_35(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral5828_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_7bf8c8630d38_invokedynamic909_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_7bf8c8630d38_invokedynamic909_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_7bf8c8630d38_invokedynamic909_7(java.lang.String a0, java.lang.String a1, int a2, java.lang.String a3, int a4) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_7bf8c8630d38_invokedynamic909_14(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_7bf8c8630d38_invokedynamic909_15(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_7bf8c8630d38_invokedynamic909_16(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_7bf8c8630d38_invokedynamic909_17(java.lang.String a0, int a1, java.lang.String a2, float a3, java.lang.String a4, float a5, java.lang.String a6, float a7, java.lang.String a8, int a9, java.lang.String a10, float a11, java.lang.String a12, float a13) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_576b1d924034_invokedynamic910_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_576b1d924034_invokedynamic910_10(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_576b1d924034_invokedynamic910_11(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_576b1d924034_invokedynamic910_12(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_576b1d924034_invokedynamic910_13(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_576b1d924034_invokedynamic910_14(java.lang.String a0, net.minecraft.client.resources.model.IBakedModel a1, java.lang.String a2, int a3, java.lang.String a4, int a5, java.lang.String a6, int a7, java.lang.String a8, net.minecraft.client.renderer.texture.TextureAtlasSprite a9) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_576b1d924034_invokedynamic910_19(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_576b1d924034_invokedynamic910_22(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_576b1d924034_invokedynamic910_23(int a0, long a1) throws E;
}
