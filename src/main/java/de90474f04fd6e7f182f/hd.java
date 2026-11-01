package com.moon;


public class hd extends com.moon.g9 {

private static final long h;

private static final java.lang.String[] i;

private static final java.lang.String[] j;

private static final java.util.Map k;

public hd(com.moon.module.impl.ESP p0) {
super(p0);
}


static {
h = ((long)(((moom._a)(moom._c.a(((long)(8083775713617615473L)), ((long)(5990183251912856145L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(160259071135868L)))));
    k = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.hd.h ^ 14621085884578L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill134_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill134_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill134_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill134_14 = new byte[8];
    (__sourceSpill134_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill134_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation134_16 = __sourceSpill134_14;
    ((javax.crypto.Cipher)(__sourceSpill134_11)).init(((int)(__sourceSpill134_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill134_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation134_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local9_life19 = new java.lang.String[2];
    int local7_life20 = 0;
    java.lang.String local6_life21;
    int local8_life23 = ((java.lang.String)((local6_life21 = "¥J½\"\021eÔ\021kY:#è\020\023¢\177]PCÊä]éSµgü±±"))).length();
    int local5_life24 = 16;
    int local4_life25 = -1;
    while (true) {
        local4_life25 += 1;
        byte[] __sourceSpill134_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill134_29 = local2_life9;
        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill134_29)).doFinal(((byte[])(__sourceSpill134_28)));
        java.lang.String __sourceSpill134_34 = ((java.lang.String)(com.moon.hd.a(((byte[])(local10_life31))))).intern();
        java.lang.String[] __sourceSpill134_35 = local9_life19;
        int __sourceSpill134_36 = local7_life20;
        local7_life20 += 1;
        (__sourceSpill134_35)[__sourceSpill134_36] = __sourceSpill134_34;
        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }
        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));
    }
    i = ((java.lang.String[])(local9_life19));
    j = ((java.lang.String[])(new java.lang.String[2]));
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
        byte[] spill512_0 = p0;
        life4_9 += 1;
        life5_44 = (spill512_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill512_1 = p0;
        life4_9 += 1;
        life5_76 = (spill512_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill512_2 = p0;
        life4_9 += 1;
        life5_91 = (spill512_2)[life4_9];
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 25787);
    if (((com.moon.hd.j)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.hd.k)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.hd.k)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/hd", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.hd.i)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.hd.j)[life5_8] = com.moon.hd.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.hd.j)[life5_8];
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral1432_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/hd"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.hd.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public boolean a__Boolean(net.minecraft.entity.Entity p0) {
int forwardValue350_17_0;
    int forwardValue350_21_0;
    int forwardValue350_23_0;
    boolean spill350_0;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_23: {
    forward_join_22: {
    forward_join_21: {
    forward_join_17: {
    life2_3 = (com.moon.hd.h ^ 11932696092303L);
    life4_5 = moom.mS.a__ArrayString();
    spill350_0 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.ESP)(((com.moon.hd)(this)).a__lV())).k__kV())).getValue())))).booleanValue();
    if (!((life4_5 == null))) {
        forwardValue350_17_0 = ((spill350_0) ? 1 : 0);
        break forward_join_17;
    }
    if (!(spill350_0)) {
        break forward_join_22;
    }
    forwardValue350_17_0 = ((p0 instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0);
    }
    if (!((life4_5 == null))) {
        forwardValue350_21_0 = forwardValue350_17_0;
        break forward_join_21;
    }
    if (!((forwardValue350_17_0 != 0))) {
        break forward_join_22;
    }
    forwardValue350_21_0 = 1;
    }
    forwardValue350_23_0 = forwardValue350_21_0;
    break forward_join_23;
    }
    forwardValue350_23_0 = 0;
    }
    return ((forwardValue350_23_0) != 0);
}


public void a(net.minecraft.entity.Entity p0) {
org.lwjgl.util.vector.Vector4f forwardValue349_19_0;
    int forwardValue349_51_0;
    net.minecraft.entity.Entity forwardValue349_53_0;
    net.minecraft.item.ItemStack forwardValue349_62_0;
    float forwardValue349_109_0;
    float forwardValue349_109_1;
    float forwardValue349_110_0;
    float forwardValue349_111_0;
    float forwardValue349_111_1;
    java.lang.String[] spill349_0;
    org.lwjgl.util.vector.Vector4f spill349_1;
    boolean spill349_2;
    net.minecraft.entity.Entity spill349_3;
    net.minecraft.item.ItemStack spill349_4;
    float spill349_5;
    float spill349_6;
    float spill349_7;
    long life2_3;
    com.moon.jb life5_8;
    java.lang.String[] life4_9;
    org.lwjgl.util.vector.Vector4f life6_12;
    float life7_23;
    float life8_26;
    float life9_29;
    float life10_32;
    float life11_36;
    float life12_40;
    net.minecraft.entity.player.EntityPlayer life13_66;
    java.lang.String life14_96;
    float life15_108;
    float life16_136;
    forward_join_122: {
    forward_join_111: {
    forward_join_110: {
    forward_join_109: {
    forward_join_62: {
    forward_join_53: {
    forward_join_51: {
    forward_join_19: {
    forward_join_18: {
    life2_3 = (com.moon.hd.h ^ 20012177543718L);
    spill349_0 = moom.mS.a__ArrayString();
    life5_8 = ((com.moon.je)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__je())).a();
    life4_9 = spill349_0;
    life6_12 = ((net.minecraft.entity.Entity)(p0)).a__Vector4f();
    spill349_1 = life6_12;
    if (!((life4_9 == null))) {
        forwardValue349_19_0 = spill349_1;
        break forward_join_19;
    }
    if (!((spill349_1 == null))) {
        break forward_join_18;
    }
    return;
    }
    forwardValue349_19_0 = life6_12;
    }
    life7_23 = ((org.lwjgl.util.vector.Vector4f)(forwardValue349_19_0)).x;
    life8_26 = ((org.lwjgl.util.vector.Vector4f)(life6_12)).y;
    life9_29 = ((org.lwjgl.util.vector.Vector4f)(life6_12)).z;
    life10_32 = ((org.lwjgl.util.vector.Vector4f)(life6_12)).w;
    life11_36 = (life9_29 - life7_23);
    life12_40 = (life10_32 - life8_26);
    spill349_2 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.ESP)(((com.moon.hd)(this)).a__lV())).m())).getValue())))).booleanValue();
    if (!((life4_9 == null))) {
        forwardValue349_51_0 = ((spill349_2) ? 1 : 0);
        break forward_join_51;
    }
    if (!(spill349_2)) {
        break forward_join_122;
    }
    spill349_3 = p0;
    if (!((life4_9 == null))) {
        forwardValue349_53_0 = spill349_3;
        break forward_join_53;
    }
    forwardValue349_51_0 = ((spill349_3 instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0);
    }
    if (!((forwardValue349_51_0 != 0))) {
        break forward_join_122;
    }
    forwardValue349_53_0 = p0;
    }
    life13_66 = ((net.minecraft.entity.player.EntityPlayer)(forwardValue349_53_0));
    spill349_4 = ((net.minecraft.entity.player.EntityPlayer)(life13_66)).a__xW();
    if (!((life4_9 == null))) {
        forwardValue349_62_0 = spill349_4;
        break forward_join_62;
    }
    if (!((spill349_4 != null))) {
        break forward_join_122;
    }
    forwardValue349_62_0 = ((net.minecraft.entity.player.EntityPlayer)(life13_66)).a__xW();
    }
    life14_96 = ((java.lang.String)(((java.lang.String)(((java.lang.String)(((net.minecraft.item.ItemStack)(forwardValue349_62_0)).b__String())).toUpperCase())).replaceAll(((java.lang.String)(__sourceIntrinsic_785327fee08c_invokedynamic349_22(25826, (7320839535430013052L ^ life2_3)))), ((java.lang.String)(""))))).replaceAll(((java.lang.String)(__sourceIntrinsic_785327fee08c_invokedynamic349_24(23093, (4379765007746477738L ^ life2_3)))), ((java.lang.String)("")));
    life15_108 = ((life7_23 + (life11_36 / 0x1.0p1f)) - (((com.moon.jb)(life5_8)).a(((java.lang.String)(life14_96))) / 0x1.0p1f));
    spill349_5 = (life8_26 + life12_40);
    spill349_6 = (((com.moon.hd)(this)).g * 0x1.0p1f);
    if (!((life4_9 == null))) {
        forwardValue349_109_0 = spill349_5;
        forwardValue349_109_1 = spill349_6;
        break forward_join_109;
    }
    spill349_7 = (spill349_5 + spill349_6);
    if (!(((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.ESP)(((com.moon.hd)(this)).a__lV())).j__kV())).getValue())))).booleanValue())) {
        forwardValue349_110_0 = spill349_7;
        break forward_join_110;
    }
    forwardValue349_109_0 = spill349_7;
    forwardValue349_109_1 = 0x1.4p1f;
    }
    forwardValue349_111_0 = forwardValue349_109_0;
    forwardValue349_111_1 = forwardValue349_109_1;
    break forward_join_111;
    }
    forwardValue349_111_0 = forwardValue349_110_0;
    forwardValue349_111_1 = 0x0.0p0f;
    }
    life16_136 = (forwardValue349_111_0 + forwardValue349_111_1);
    ((com.moon.jb)(life5_8)).a(((com.moon.hW)(((com.moon.hd)(this)).f)), ((java.lang.String)(life14_96)), ((float)(life15_108)), ((float)(life16_136)), ((float)(0x1.0p0f)), ((int)(-1)));
    }
    return;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral1432_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_785327fee08c_invokedynamic349_22(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_785327fee08c_invokedynamic349_24(int a0, long a1) throws E;
}
