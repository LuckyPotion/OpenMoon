package com.moon;


public class he extends com.moon.g9 {

private static final long h;

private static final java.lang.String[] i;

private static final java.lang.String[] j;

private static final java.util.Map k;

public he(com.moon.module.impl.ESP p0) {
super(p0);
}


static {
h = ((long)(((moom._a)(moom._c.a(((long)(-139311328175849684L)), ((long)(2819980388368597589L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(36949421872570L)))));
    k = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.he.h ^ 132819988181470L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill135_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill135_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill135_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill135_14 = new byte[8];
    (__sourceSpill135_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill135_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation135_16 = __sourceSpill135_14;
    ((javax.crypto.Cipher)(__sourceSpill135_11)).init(((int)(__sourceSpill135_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill135_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation135_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local9_life19 = new java.lang.String[3];
    int local7_life20 = 0;
    java.lang.String local6_life21;
    int local8_life23 = ((java.lang.String)((local6_life21 = "\027\"òû/k<\021\0027\002ÃÂLTó\030G¾+\nÐï\016xÐG¹Àjµ\016PC£v0\020§ä|¶\f`c´.²ÿ]i|C"))).length();
    int local5_life24 = 16;
    int local4_life25 = -1;
    while (true) {
        local4_life25 += 1;
        byte[] __sourceSpill135_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill135_29 = local2_life9;
        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill135_29)).doFinal(((byte[])(__sourceSpill135_28)));
        java.lang.String __sourceSpill135_34 = ((java.lang.String)(com.moon.he.a(((byte[])(local10_life31))))).intern();
        java.lang.String[] __sourceSpill135_35 = local9_life19;
        int __sourceSpill135_36 = local7_life20;
        local7_life20 += 1;
        (__sourceSpill135_35)[__sourceSpill135_36] = __sourceSpill135_34;
        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }
        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));
    }
    i = ((java.lang.String[])(local9_life19));
    j = ((java.lang.String[])(new java.lang.String[3]));
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
        byte[] spill515_0 = p0;
        life4_9 += 1;
        life5_44 = (spill515_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill515_1 = p0;
        life4_9 += 1;
        life5_76 = (spill515_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill515_2 = p0;
        life4_9 += 1;
        life5_91 = (spill515_2)[life4_9];
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 18534);
    if (((com.moon.he.j)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.he.k)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.he.k)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/he", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.he.i)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.he.j)[life5_8] = com.moon.he.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.he.j)[life5_8];
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral1437_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/he"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.he.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public boolean a__Boolean(net.minecraft.entity.Entity p0) {
int forwardValue352_17_0;
    int forwardValue352_21_0;
    int forwardValue352_23_0;
    boolean spill352_0;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_23: {
    forward_join_22: {
    forward_join_21: {
    forward_join_17: {
    life2_3 = (com.moon.he.h ^ 51477508835809L);
    life4_5 = moom.mS.a__ArrayString();
    spill352_0 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.ESP)(((com.moon.he)(this)).a__lV())).f__kV())).getValue())))).booleanValue();
    if (!((life4_5 == null))) {
        forwardValue352_17_0 = ((spill352_0) ? 1 : 0);
        break forward_join_17;
    }
    if (!(spill352_0)) {
        break forward_join_22;
    }
    forwardValue352_17_0 = ((p0 instanceof net.minecraft.entity.EntityLivingBase) ? 1 : 0);
    }
    if (!((life4_5 == null))) {
        forwardValue352_21_0 = forwardValue352_17_0;
        break forward_join_21;
    }
    if (!((forwardValue352_17_0 != 0))) {
        break forward_join_22;
    }
    forwardValue352_21_0 = 1;
    }
    forwardValue352_23_0 = forwardValue352_21_0;
    break forward_join_23;
    }
    forwardValue352_23_0 = 0;
    }
    return ((forwardValue352_23_0) != 0);
}


public void a(net.minecraft.entity.Entity p0) {
net.minecraft.entity.Entity forwardValue351_40_0;
    java.lang.String forwardValue351_50_0;
    int forwardValue351_67_0;
    net.minecraft.entity.EntityLivingBase forwardValue351_69_0;
    com.moon.eU forwardValue351_86_0;
    java.lang.String forwardValue351_103_0;
    java.lang.String forwardValue351_110_0;
    com.moon.jm forwardValue351_170_0;
    com.moon.hW forwardValue351_170_1;
    java.lang.String forwardValue351_170_2;
    float forwardValue351_170_3;
    float forwardValue351_170_4;
    float forwardValue351_170_5;
    int forwardValue351_170_6;
    com.moon.jm forwardValue351_171_0;
    com.moon.hW forwardValue351_171_1;
    java.lang.String forwardValue351_171_2;
    float forwardValue351_171_3;
    float forwardValue351_171_4;
    float forwardValue351_171_5;
    com.moon.jm forwardValue351_172_0;
    com.moon.hW forwardValue351_172_1;
    java.lang.String forwardValue351_172_2;
    float forwardValue351_172_3;
    float forwardValue351_172_4;
    float forwardValue351_172_5;
    int forwardValue351_172_6;
    java.lang.String[] spill351_0;
    net.minecraft.entity.Entity spill351_1;
    java.lang.String spill351_2;
    boolean spill351_3;
    net.minecraft.entity.EntityLivingBase spill351_4;
    com.moon.eU spill351_5;
    java.lang.String spill351_6;
    com.moon.jm spill351_7;
    com.moon.hW spill351_8;
    java.lang.String spill351_9;
    float spill351_10;
    float spill351_11;
    float spill351_12;
    boolean spill351_13;
    long life2_3;
    com.moon.jm life5_8;
    org.lwjgl.util.vector.Vector4f life6_12;
    float life7_15;
    java.lang.String[] life4_16;
    float life8_19;
    float life9_22;
    float life10_25;
    float life11_29;
    float life12_33;
    net.minecraft.entity.EntityLivingBase life13_47;
    java.lang.String life14_62;
    net.minecraft.entity.player.EntityPlayer life15_88;
    com.moon.eU life16_93;
    com.moon.mk life17_98;
    float life15_148;
    float life16_153;
    float life17_163;
    float life18_173;
    forward_join_173: {
    forward_join_172: {
    forward_join_171: {
    forward_join_170: {
    forward_join_121: {
    forward_join_111: {
    forward_join_110: {
    forward_join_103: {
    forward_join_101: {
    forward_join_86: {
    forward_join_69: {
    forward_join_67: {
    forward_join_63: {
    forward_join_50: {
    forward_join_40: {
    life2_3 = (com.moon.he.h ^ 59617166460232L);
    life5_8 = ((com.moon.jo)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__jo())).a(((com.moon.ce)(com.moon.ce.VERDANA)));
    spill351_0 = moom.mS.a__ArrayString();
    life6_12 = ((net.minecraft.entity.Entity)(p0)).a__Vector4f();
    life7_15 = ((org.lwjgl.util.vector.Vector4f)(life6_12)).x;
    life4_16 = spill351_0;
    life8_19 = ((org.lwjgl.util.vector.Vector4f)(life6_12)).y;
    life9_22 = ((org.lwjgl.util.vector.Vector4f)(life6_12)).z;
    life10_25 = ((org.lwjgl.util.vector.Vector4f)(life6_12)).w;
    life11_29 = (life9_22 - life7_15);
    life12_33 = (life10_25 - life8_19);
    spill351_1 = p0;
    if (!((life4_16 == null))) {
        forwardValue351_40_0 = spill351_1;
        break forward_join_40;
    }
    if (!((((spill351_1 instanceof net.minecraft.entity.EntityLivingBase) ? 1 : 0) != 0))) {
        break forward_join_173;
    }
    forwardValue351_40_0 = p0;
    }
    life13_47 = ((net.minecraft.entity.EntityLivingBase)(forwardValue351_40_0));
    spill351_2 = ((net.minecraft.entity.EntityLivingBase)(life13_47)).a__String();
    if (!((life4_16 == null))) {
        forwardValue351_50_0 = spill351_2;
        break forward_join_50;
    }
    if (!((spill351_2 != null))) {
        break forward_join_173;
    }
    forwardValue351_50_0 = ((net.minecraft.util.IChatComponent)(((net.minecraft.entity.EntityLivingBase)(life13_47)).a__C5())).b();
    }
    life14_62 = forwardValue351_50_0;
    spill351_3 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.ESP)(((com.moon.he)(this)).a__lV())).g__kV())).getValue())))).booleanValue();
    if (!((life4_16 == null))) {
        forwardValue351_67_0 = ((spill351_3) ? 1 : 0);
        break forward_join_67;
    }
    if (!(spill351_3)) {
        break forward_join_63;
    }
    life14_62 = ((net.minecraft.entity.EntityLivingBase)(life13_47)).a__String();
    }
    spill351_4 = life13_47;
    if (!((life4_16 == null))) {
        forwardValue351_69_0 = spill351_4;
        break forward_join_69;
    }
    forwardValue351_67_0 = ((spill351_4 instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0);
    }
    if (!((forwardValue351_67_0 != 0))) {
        break forward_join_121;
    }
    forwardValue351_69_0 = life13_47;
    }
    life15_88 = ((net.minecraft.entity.player.EntityPlayer)(forwardValue351_69_0));
    life16_93 = ((com.moon.eV)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__eV())).a(((net.minecraft.entity.player.EntityPlayer)(life15_88)));
    life17_98 = ((com.moon.ml)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__ml())).a(((net.minecraft.entity.player.EntityPlayer)(life15_88)));
    spill351_5 = life16_93;
    if (!((life4_16 == null))) {
        forwardValue351_86_0 = spill351_5;
        break forward_join_86;
    }
    if (!((spill351_5 != null))) {
        break forward_join_111;
    }
    forwardValue351_86_0 = life16_93;
    }
    spill351_6 = ((com.moon.eU)(forwardValue351_86_0)).b();
    if (!((life4_16 == null))) {
        forwardValue351_103_0 = spill351_6;
        break forward_join_103;
    }
    if (!(((java.lang.String)(spill351_6)).isEmpty())) {
        break forward_join_101;
    }
    java.lang.String __stackOp351_35_0 = ((com.moon.eU)(life16_93)).a();
    java.lang.String __stackOp351_35_1 = __sourceIntrinsic_785327fee08c_invokedynamic351_34(1310, (1314042346662223199L ^ life2_3));
    forwardValue351_110_0 = __sourceIntrinsic_785327fee08c_invokedynamic351_36(__stackOp351_35_1, __stackOp351_35_0);
    break forward_join_110;
    }
    forwardValue351_103_0 = ((com.moon.eU)(life16_93)).b();
    }
    java.lang.String __stackOp351_39_0 = forwardValue351_103_0;
    java.lang.String __stackOp351_39_1 = __sourceIntrinsic_785327fee08c_invokedynamic351_38(564, (6913726723184089719L ^ life2_3));
    forwardValue351_110_0 = __sourceIntrinsic_785327fee08c_invokedynamic351_40(__stackOp351_39_1, __stackOp351_39_0);
    }
    life14_62 = forwardValue351_110_0;
    }
    if (!((life17_98 != null))) {
        break forward_join_121;
    }
    life14_62 = __sourceIntrinsic_785327fee08c_invokedynamic351_42(life14_62, __sourceIntrinsic_785327fee08c_invokedynamic351_41(24804, (1558677379473619110L ^ life2_3)));
    }
    life15_148 = 0x1.5p2f;
    life16_153 = ((com.moon.jm)(life5_8)).a(((java.lang.String)(life14_62)), ((float)(life15_148)));
    life17_163 = ((life7_15 + (life11_29 / 0x1.0p1f)) - (life16_153 / 0x1.0p1f));
    life18_173 = ((life8_19 - ((com.moon.jm)(life5_8)).b(((java.lang.String)(life14_62)), ((float)(life15_148)))) - ((com.moon.he)(this)).g);
    spill351_7 = life5_8;
    spill351_8 = ((com.moon.he)(this)).d;
    spill351_9 = life14_62;
    spill351_10 = life15_148;
    spill351_11 = life17_163;
    spill351_12 = life18_173;
    spill351_13 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.ESP)(((com.moon.he)(this)).a__lV())).g__kV())).getValue())))).booleanValue();
    if (!((life4_16 == null))) {
        forwardValue351_170_0 = spill351_7;
        forwardValue351_170_1 = spill351_8;
        forwardValue351_170_2 = spill351_9;
        forwardValue351_170_3 = spill351_10;
        forwardValue351_170_4 = spill351_11;
        forwardValue351_170_5 = spill351_12;
        forwardValue351_170_6 = ((spill351_13) ? 1 : 0);
        break forward_join_170;
    }
    if (!(spill351_13)) {
        forwardValue351_171_0 = spill351_7;
        forwardValue351_171_1 = spill351_8;
        forwardValue351_171_2 = spill351_9;
        forwardValue351_171_3 = spill351_10;
        forwardValue351_171_4 = spill351_11;
        forwardValue351_171_5 = spill351_12;
        break forward_join_171;
    }
    forwardValue351_170_0 = spill351_7;
    forwardValue351_170_1 = spill351_8;
    forwardValue351_170_2 = spill351_9;
    forwardValue351_170_3 = spill351_10;
    forwardValue351_170_4 = spill351_11;
    forwardValue351_170_5 = spill351_12;
    forwardValue351_170_6 = ((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.ColorSetting)(((com.moon.module.impl.ESP)(((com.moon.he)(this)).a__lV())).b__kX())).getValue())))).intValue();
    }
    forwardValue351_172_0 = forwardValue351_170_0;
    forwardValue351_172_1 = forwardValue351_170_1;
    forwardValue351_172_2 = forwardValue351_170_2;
    forwardValue351_172_3 = forwardValue351_170_3;
    forwardValue351_172_4 = forwardValue351_170_4;
    forwardValue351_172_5 = forwardValue351_170_5;
    forwardValue351_172_6 = forwardValue351_170_6;
    break forward_join_172;
    }
    forwardValue351_172_0 = forwardValue351_171_0;
    forwardValue351_172_1 = forwardValue351_171_1;
    forwardValue351_172_2 = forwardValue351_171_2;
    forwardValue351_172_3 = forwardValue351_171_3;
    forwardValue351_172_4 = forwardValue351_171_4;
    forwardValue351_172_5 = forwardValue351_171_5;
    forwardValue351_172_6 = -1;
    }
    ((com.moon.jm)(forwardValue351_172_0)).a(((com.moon.hW)(forwardValue351_172_1)), ((java.lang.String)(forwardValue351_172_2)), ((float)(forwardValue351_172_3)), ((float)(forwardValue351_172_4)), ((float)(forwardValue351_172_5)), ((int)(forwardValue351_172_6)));
    }
    return;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral1437_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_785327fee08c_invokedynamic351_34(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_785327fee08c_invokedynamic351_36(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_785327fee08c_invokedynamic351_38(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_785327fee08c_invokedynamic351_40(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_785327fee08c_invokedynamic351_41(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_785327fee08c_invokedynamic351_42(java.lang.String a0, java.lang.String a1) throws E;
}
