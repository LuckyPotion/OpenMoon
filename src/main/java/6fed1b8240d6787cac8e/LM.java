package moom;


public class LM extends moom.LL {

private static final long c;

private static final java.lang.String[] e;

private static final java.lang.String[] f;

private static final java.util.Map g;

public LM() {
super();
}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(476065788838776261L)), ((long)(4329525830296075497L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(200769147813418L)))));

    g = ((java.util.Map)(new java.util.HashMap(13)));

    long local0_life7 = (moom.LM.c ^ 76635954530902L);

    javax.crypto.Cipher local2_life9;

    javax.crypto.Cipher __sourceSpill806_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));

    int __sourceSpill806_12 = 2;

    javax.crypto.SecretKeyFactory __sourceSpill806_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));

    byte[] __sourceSpill806_14 = new byte[8];

    (__sourceSpill806_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));

    int local3_life15 = 1;

    while ((local3_life15 < 8)) {

        (__sourceSpill806_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));

        local3_life15 += 1;

    }

    byte[] __sourcePreallocation806_16 = __sourceSpill806_14;

    ((javax.crypto.Cipher)(__sourceSpill806_11)).init(((int)(__sourceSpill806_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill806_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation806_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));

    java.lang.String[] local9_life19 = new java.lang.String[10];

    int local7_life20 = 0;

    java.lang.String local6_life21;

    int local8_life23 = ((java.lang.String)((local6_life21 = "¢4æpO_áC=\013\fðÜ§\030O\007Ú]jøý\017Ù\017y' /aU3n }Ò\020m\013Ä1\013°\\k¡ª;Ã\002\020üÃó~\003æ2¼×\023s#¡¹.(,\032ÁÖÉ\033t\036X©ø{\003gjÑ%'Æ¥Ïkë:\022râ`­ºk\020\030_ÇoVG§Ò¶\n\f@×åôé÷¿;q^\020àýÙÛ³#\034Ô|\020U/\017×\020aóÿçBZÿ\027t\035:ä,yoD"))).length();

    int local5_life24 = 16;

    int local4_life25 = -1;

    while (true) {

        local4_life25 += 1;

        byte[] __sourceSpill806_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill806_29 = local2_life9;

        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill806_29)).doFinal(((byte[])(__sourceSpill806_28)));

        java.lang.String __sourceSpill806_34 = ((java.lang.String)(moom.LM.b(((byte[])(local10_life31))))).intern();

        java.lang.String[] __sourceSpill806_35 = local9_life19;

        int __sourceSpill806_36 = local7_life20;

        local7_life20 += 1;

        (__sourceSpill806_35)[__sourceSpill806_36] = __sourceSpill806_34;

        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }

        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));

    }

    local8_life23 = ((java.lang.String)((local6_life21 = "RHéüÉöOùE\021~t§qk\020e=5\f!áÄ>B['÷ "))).length();

    local5_life24 = 16;

    local4_life25 = -1;

    while (true) {

        local4_life25 += 1;

        byte[] __sourceSpill806_42 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill806_43 = local2_life9;

        byte[] local10_life45 = ((javax.crypto.Cipher)(__sourceSpill806_43)).doFinal(((byte[])(__sourceSpill806_42)));

        java.lang.String __sourceSpill806_48 = ((java.lang.String)(moom.LM.b(((byte[])(local10_life45))))).intern();

        java.lang.String[] __sourceSpill806_49 = local9_life19;

        int __sourceSpill806_50 = local7_life20;

        local7_life20 += 1;

        (__sourceSpill806_49)[__sourceSpill806_50] = __sourceSpill806_48;

        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }

        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));

    }

    e = ((java.lang.String[])(local9_life19));

    f = ((java.lang.String[])(new java.lang.String[10]));
}


private static java.lang.String b(byte[] p0) {
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
        byte[] spill3020_0 = p0;
        life4_9 += 1;
        life5_44 = (spill3020_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill3020_1 = p0;
        life4_9 += 1;
        life5_76 = (spill3020_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill3020_2 = p0;
        life4_9 += 1;
        life5_91 = (spill3020_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private java.lang.String[] b(java.lang.String p0) {
java.lang.String lexicalValue920_23_0;
    java.lang.String[] lexicalValue920_64_0;
    java.lang.String spill920_0;
    java.lang.String[] spill920_1;
    int spill920_2;
    java.lang.String[] spill920_3;
    long life2_3;
    int[] life4_5;
    java.lang.String life1_26;
    java.lang.String[] life5_34;
    int life6_36;
    lexical_join_64: {
    lexical_join_63: {
    lexical_join_23: {
    lexical_join_14: {
    life2_3 = (moom.LM.c ^ 22975102037921L);
    life4_5 = moom.LL.b();
    spill920_0 = p0;
    if (!((life4_5 == null))) {
        lexicalValue920_23_0 = spill920_0;
        break lexical_join_23;
    }
    if (!((((java.lang.String)(spill920_0)).length() == 0))) {
        break lexical_join_14;
    }
    return new java.lang.String[0];
    }
    life1_26 = moom.Ob.b(((java.lang.String)(p0)), ((java.lang.String)(__sourceIntrinsic_c6b3684c79b1_invokedynamic920_3(30549, (2083651519167900853L ^ life2_3)))));
    lexicalValue920_23_0 = life1_26;
    }
    life5_34 = ((java.lang.String)(lexicalValue920_23_0)).split(((java.lang.String)(__sourceIntrinsic_c6b3684c79b1_invokedynamic920_5(28565, (4094535933620368503L ^ life2_3)))));
    life6_36 = 0;
    lexical_cycle_32: while (true) {
    if (!((life6_36 < (life5_34).length))) {
        break lexical_join_63;
    }
    spill920_1 = life5_34;
    spill920_2 = life6_36;
    java.lang.String __stackOp920_9_0 = ((java.lang.String)((life5_34)[life6_36])).trim();
    java.lang.String __stackOp920_9_1 = __sourceIntrinsic_c6b3684c79b1_invokedynamic920_8(29155, (2387895194869770754L ^ life2_3));
    (spill920_1)[spill920_2] = __sourceIntrinsic_c6b3684c79b1_invokedynamic920_10(__stackOp920_9_1, __stackOp920_9_0);
    spill920_3 = life5_34;
    if (!((life4_5 == null))) {
        lexicalValue920_64_0 = spill920_3;
        break lexical_join_64;
    }
    (spill920_3)[life6_36] = moom.Ob.c(((java.lang.String)((life5_34)[life6_36])), ((java.lang.String)(".")));
    life6_36 += 1;
    if (!((life4_5 != null))) { continue lexical_cycle_32; }
    break lexical_cycle_32;
    }
    }
    lexicalValue920_64_0 = life5_34;
    }
    return lexicalValue920_64_0;
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.LM.a(((int)(local4)), ((long)(local5)));
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 13240);
    if (((moom.LM.f)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.LM.g)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.LM.g)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/LM", life9_51);
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
        life9_116 = ((java.lang.String)((moom.LM.e)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.LM.f)[life5_8] = moom.LM.b(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.LM.f)[life5_8];
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral5890_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/LM"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private java.lang.String[] a(moom.M7 p0, int p1) {
int forwardValue2566_31_0;
    int forwardValue2566_101_0;
    moom.M7 forwardValue2566_103_0;
    java.lang.String forwardValue2566_113_0;
    java.lang.String forwardValue2566_153_0;
    java.lang.String forwardValue2566_161_0;
    int[] spill2566_0;
    boolean spill2566_1;
    java.lang.String spill2566_2;
    java.lang.String spill2566_3;
    java.lang.String spill2566_4;
    java.lang.String spill2566_5;
    java.lang.String spill2566_6;
    java.lang.String spill2566_7;
    boolean spill2566_8;
    moom.M7 spill2566_9;
    java.lang.String spill2566_10;
    java.lang.String spill2566_11;
    java.lang.String spill2566_12;
    java.lang.String spill2566_13;
    long life3_3;
    java.lang.String life6_6;
    java.lang.String life7_12;
    int[] life5_13;
    java.lang.String[] life8_17;
    net.minecraft.client.settings.GameSettings life9_19;
    java.lang.String life10_21;
    java.lang.String life11_62;
    java.lang.String life12_97;
    java.lang.String life13_134;
    java.util.ArrayList life13_155;
    forward_join_166: {
    forward_join_161: {
    forward_join_160: {
    forward_join_153: {
    forward_join_152: {
    forward_join_131: {
    forward_join_113: {
    forward_join_107: {
    forward_join_103: {
    forward_join_101: {
    forward_join_87: {
    forward_join_55: {
    forward_join_31: {
    life3_3 = (moom.LM.c ^ 20772003948209L);
    life6_6 = ((moom.M7)(p0)).f();
    spill2566_0 = moom.LL.b();
    life7_12 = ((java.lang.String)(moom.BU.a(((java.lang.String)(((moom.M7)(p0)).c()))))).trim();
    life5_13 = spill2566_0;
    life8_17 = ((moom.LM)(this)).b(((java.lang.String)(life7_12)));
    life9_19 = moom.BU.a__pw();
    life10_21 = null;
    spill2566_1 = ((java.lang.String)(life6_6)).equals(((java.lang.Object)(((moom.M7)(p0)).a__String())));
    if (!((life5_13 == null))) {
        forwardValue2566_31_0 = ((spill2566_1) ? 1 : 0);
        break forward_join_31;
    }
    if (!((!spill2566_1))) {
        break forward_join_55;
    }
    forwardValue2566_31_0 = ((((net.minecraft.client.settings.GameSettings)(life9_19)).J) ? 1 : 0);
    }
    if (!((forwardValue2566_31_0 != 0))) {
        break forward_join_55;
    }
    java.lang.String __stackOp2566_17_0 = moom.JM.a(((java.lang.String)(__sourceIntrinsic_8cbd563e31d2_invokedynamic2566_13(6738, (2172961993034549409L ^ life3_3)))));
    java.lang.String __stackOp2566_17_1 = ((moom.M7)(p0)).a__String();
    java.lang.String __stackOp2566_17_2 = __sourceIntrinsic_8cbd563e31d2_invokedynamic2566_16(15357, (3995194748978751751L ^ life3_3));
    spill2566_2 = __stackOp2566_17_2;
    spill2566_3 = __stackOp2566_17_0;
    spill2566_4 = __stackOp2566_17_1;
    recovery.source.CarrierOps.discard(__stackOp2566_17_2);
    java.lang.String __stackOp2566_20_0 = spill2566_4;
    java.lang.String __stackOp2566_20_1 = __sourceIntrinsic_8cbd563e31d2_invokedynamic2566_19(8497, (2499688005610075076L ^ life3_3));
    life10_21 = __sourceIntrinsic_8cbd563e31d2_invokedynamic2566_21(spill2566_2, spill2566_3, __stackOp2566_20_1, __stackOp2566_20_0);
    }
    life11_62 = null;
    if (!((((moom.M7)(p0)).a__ArrayString() != null))) {
        break forward_join_87;
    }
    if (!(((net.minecraft.client.settings.GameSettings)(life9_19)).J)) {
        break forward_join_87;
    }
    java.lang.String __stackOp2566_29_0 = moom.JM.a(((java.lang.String)(__sourceIntrinsic_8cbd563e31d2_invokedynamic2566_24(23962, (3972537139633491821L ^ life3_3)))));
    java.lang.String __stackOp2566_29_1 = moom.BU.a(((java.lang.Object[])(((moom.M7)(p0)).a__ArrayString())));
    java.lang.String __stackOp2566_29_2 = __sourceIntrinsic_8cbd563e31d2_invokedynamic2566_28(3417, (9068252454277177250L ^ life3_3));
    spill2566_5 = __stackOp2566_29_2;
    spill2566_6 = __stackOp2566_29_0;
    spill2566_7 = __stackOp2566_29_1;
    recovery.source.CarrierOps.discard(__stackOp2566_29_2);
    java.lang.String __stackOp2566_32_0 = spill2566_7;
    java.lang.String __stackOp2566_32_1 = __sourceIntrinsic_8cbd563e31d2_invokedynamic2566_31(11045, (5335898159433021905L ^ life3_3));
    life11_62 = __sourceIntrinsic_8cbd563e31d2_invokedynamic2566_33(spill2566_5, spill2566_6, __stackOp2566_32_1, __stackOp2566_32_0);
    }
    life12_97 = null;
    if (!((((moom.M7)(p0)).e() != null))) {
        break forward_join_131;
    }
    spill2566_8 = ((net.minecraft.client.settings.GameSettings)(life9_19)).J;
    if (!((life5_13 == null))) {
        forwardValue2566_101_0 = ((spill2566_8) ? 1 : 0);
        break forward_join_101;
    }
    if (!(spill2566_8)) {
        break forward_join_131;
    }
    spill2566_9 = p0;
    if (!((life5_13 == null))) {
        forwardValue2566_103_0 = spill2566_9;
        break forward_join_103;
    }
    forwardValue2566_101_0 = ((((moom.M7)(spill2566_9)).a__Boolean()) ? 1 : 0);
    }
    if (!((forwardValue2566_101_0 != 0))) {
        break forward_join_107;
    }
    forwardValue2566_103_0 = p0;
    }
    forwardValue2566_113_0 = ((moom.M7)(forwardValue2566_103_0)).a(((java.lang.String)(((moom.M7)(p0)).e())));
    break forward_join_113;
    }
    forwardValue2566_113_0 = moom.JM.a(((java.lang.String)(__sourceIntrinsic_8cbd563e31d2_invokedynamic2566_41(16683, (6504078499198604253L ^ life3_3)))));
    }
    life13_134 = forwardValue2566_113_0;
    java.lang.String __stackOp2566_45_0 = moom.JM.e();
    java.lang.String __stackOp2566_45_1 = life13_134;
    java.lang.String __stackOp2566_45_2 = __sourceIntrinsic_8cbd563e31d2_invokedynamic2566_44(3417, (9068252454277177250L ^ life3_3));
    spill2566_10 = __stackOp2566_45_2;
    spill2566_11 = __stackOp2566_45_0;
    spill2566_12 = __stackOp2566_45_1;
    recovery.source.CarrierOps.discard(__stackOp2566_45_2);
    java.lang.String __stackOp2566_48_0 = spill2566_12;
    java.lang.String __stackOp2566_48_1 = __sourceIntrinsic_8cbd563e31d2_invokedynamic2566_47(11045, (5335898159433021905L ^ life3_3));
    life12_97 = __sourceIntrinsic_8cbd563e31d2_invokedynamic2566_49(spill2566_10, spill2566_11, __stackOp2566_48_1, __stackOp2566_48_0);
    }
    life13_155 = new java.util.ArrayList();
    ((java.util.List)(life13_155)).add(((java.lang.Object)(life6_6)));
    ((java.util.List)(life13_155)).addAll(((java.util.Collection)(java.util.Arrays.asList(((java.lang.Object[])(life8_17))))));
    spill2566_13 = life10_21;
    if (!((life5_13 == null))) {
        forwardValue2566_153_0 = spill2566_13;
        break forward_join_153;
    }
    if (!((spill2566_13 != null))) {
        break forward_join_152;
    }
    ((java.util.List)(life13_155)).add(((java.lang.Object)(life10_21)));
    }
    forwardValue2566_153_0 = life11_62;
    }
    if (!((life5_13 == null))) {
        forwardValue2566_161_0 = forwardValue2566_153_0;
        break forward_join_161;
    }
    if (!((forwardValue2566_153_0 != null))) {
        break forward_join_160;
    }
    ((java.util.List)(life13_155)).add(((java.lang.Object)(life11_62)));
    }
    forwardValue2566_161_0 = life12_97;
    }
    if (!((forwardValue2566_161_0 != null))) {
        break forward_join_166;
    }
    ((java.util.List)(life13_155)).add(((java.lang.Object)(life12_97)));
    }
    return ((moom.LM)(this)).a(((int)(p1)), ((java.util.List)(life13_155)));
}


public java.lang.String[] a(moom.gc p0, int p1) {
moom.gc forwardValue2567_12_0;
    moom.gc spill2567_0;
    long life3_3;
    int[] life5_5;
    moom.gx life6_19;
    moom.M7 life7_28;
    forward_join_18: {
    forward_join_16: {
    forward_join_12: {
    life3_3 = (moom.LM.c ^ 61002040842791L);
    life5_5 = moom.LL.b();
    spill2567_0 = p0;
    if (!((life5_5 == null))) {
        forwardValue2567_12_0 = spill2567_0;
        break forward_join_12;
    }
    if (!((((spill2567_0 instanceof moom.gx) ? 1 : 0) != 0))) {
        break forward_join_16;
    }
    forwardValue2567_12_0 = p0;
    }
    life6_19 = ((moom.gx)(forwardValue2567_12_0));
    if (!((life5_5 != null))) {
        break forward_join_18;
    }
    }
    return null;
    }
    life7_28 = ((moom.gx)(life6_19)).a__sourceReturn_f8ef67709a();
    return ((moom.LM)(this)).a(((moom.M7)(life7_28)), ((int)(p1)));
}


private java.lang.String[] a(int p0, java.util.List<java.lang.String> p1) {
java.lang.String lexicalValue919_28_0;
    int lexicalValue919_38_0;
    int[] spill919_0;
    java.lang.String spill919_1;
    int spill919_2;
    long life3_3;
    net.minecraft.client.gui.FontRenderer life6_7;
    java.util.ArrayList life7_11;
    java.util.Iterator life8_14;
    int[] life5_15;
    java.lang.String life9_22;
    lexical_join_41: {
    life3_3 = (moom.LM.c ^ 23977227654351L);
    spill919_0 = moom.LL.b();
    life6_7 = ((net.minecraft.client.Minecraft)(moom.BU.a__fM())).N;
    life7_11 = new java.util.ArrayList();
    life8_14 = ((java.util.List)(p1)).iterator();
    life5_15 = spill919_0;
    lexical_cycle_16: while (true) {
    lexical_join_39: {
    lexical_join_38: {
    lexical_join_28: {
    if (!(((java.util.Iterator)(life8_14)).hasNext())) {
        break lexical_join_41;
    }
    life9_22 = ((java.lang.String)(((java.util.Iterator)(life8_14)).next()));
    spill919_1 = life9_22;
    if (!((life5_15 == null))) {
        lexicalValue919_28_0 = spill919_1;
        break lexical_join_28;
    }
    if (!((spill919_1 != null))) {
        break lexical_join_39;
    }
    lexicalValue919_28_0 = life9_22;
    }
    spill919_2 = ((java.lang.String)(lexicalValue919_28_0)).length();
    if (!((life5_15 == null))) {
        lexicalValue919_38_0 = spill919_2;
        break lexical_join_38;
    }
    if (!((spill919_2 > 0))) {
        break lexical_join_39;
    }
    lexicalValue919_38_0 = ((((java.util.List)(life7_11)).addAll(((java.util.Collection)(((net.minecraft.client.gui.FontRenderer)(life6_7)).a__List(((java.lang.String)(life9_22)), ((int)(p0))))))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(lexicalValue919_38_0);
    }
    if (!((life5_15 != null))) { continue lexical_cycle_16; }
    break lexical_cycle_16;
    }
    }
    return ((java.lang.String[])(((java.util.List)(life7_11)).toArray(((java.lang.Object[])(new java.lang.String[0])))));
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c6b3684c79b1_invokedynamic920_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c6b3684c79b1_invokedynamic920_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c6b3684c79b1_invokedynamic920_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c6b3684c79b1_invokedynamic920_10(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral5890_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_8cbd563e31d2_invokedynamic2566_13(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_8cbd563e31d2_invokedynamic2566_16(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_8cbd563e31d2_invokedynamic2566_19(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_8cbd563e31d2_invokedynamic2566_21(java.lang.String a0, java.lang.String a1, java.lang.String a2, java.lang.String a3) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_8cbd563e31d2_invokedynamic2566_24(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_8cbd563e31d2_invokedynamic2566_28(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_8cbd563e31d2_invokedynamic2566_31(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_8cbd563e31d2_invokedynamic2566_33(java.lang.String a0, java.lang.String a1, java.lang.String a2, java.lang.String a3) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_8cbd563e31d2_invokedynamic2566_41(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_8cbd563e31d2_invokedynamic2566_44(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_8cbd563e31d2_invokedynamic2566_47(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_8cbd563e31d2_invokedynamic2566_49(java.lang.String a0, java.lang.String a1, java.lang.String a2, java.lang.String a3) throws E;
}
