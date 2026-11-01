package com.moon;


public class ky extends com.moon.kd<moom.zh> {

private static final long c;

private static final java.lang.String[] d;

private static final java.lang.String[] e;

private static final java.util.Map f;

public ky(java.lang.Class<moom.zh> p0) {
super(p0);
}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(-1123729496031412223L)), ((long)(3488724206291870336L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(219004198957170L)))));
    f = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.ky.c ^ 110471932667598L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill233_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill233_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill233_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill233_14 = new byte[8];
    (__sourceSpill233_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill233_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation233_16 = __sourceSpill233_14;
    ((javax.crypto.Cipher)(__sourceSpill233_11)).init(((int)(__sourceSpill233_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill233_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation233_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local9_life19 = new java.lang.String[10];
    int local7_life20 = 0;
    java.lang.String local6_life21;
    int local8_life23 = ((java.lang.String)((local6_life21 = "\036\023\027¹ E¥\177\026HEÞ1\021(\020î\037k\b¸]TÇ[&w¢äªö\020©ãv}AÌKCvwù\0052õd\020\033_sJÎ\034hü-\025\177/m^p \020\031.\037#1[/Í\f\024>åëô\036môÿñe\026\0273\004\020rAV/\000?L\177\031@?³! @\024¹Ó\020bé&q\\LýsueÅ.lda\"\027qÙ\0242«Í\020\031\034Ûeù¢TÌ¯e\023:ê ®\006"))).length();
    int local5_life24 = 16;
    int local4_life25 = -1;
    while (true) {
        local4_life25 += 1;
        byte[] __sourceSpill233_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill233_29 = local2_life9;
        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill233_29)).doFinal(((byte[])(__sourceSpill233_28)));
        java.lang.String __sourceSpill233_34 = ((java.lang.String)(com.moon.ky.a(((byte[])(local10_life31))))).intern();
        java.lang.String[] __sourceSpill233_35 = local9_life19;
        int __sourceSpill233_36 = local7_life20;
        local7_life20 += 1;
        (__sourceSpill233_35)[__sourceSpill233_36] = __sourceSpill233_34;
        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }
        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));
    }
    local8_life23 = ((java.lang.String)((local6_life21 = "Á~\rxua¹3bíe*¬D§&\020¾ÃDÂ\004»\023zÇ±·&hÉ"))).length();
    local5_life24 = 16;
    local4_life25 = -1;
    while (true) {
        local4_life25 += 1;
        byte[] __sourceSpill233_41 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill233_42 = local2_life9;
        byte[] local10_life44 = ((javax.crypto.Cipher)(__sourceSpill233_42)).doFinal(((byte[])(__sourceSpill233_41)));
        java.lang.String __sourceSpill233_47 = ((java.lang.String)(com.moon.ky.a(((byte[])(local10_life44))))).intern();
        java.lang.String[] __sourceSpill233_48 = local9_life19;
        int __sourceSpill233_49 = local7_life20;
        local7_life20 += 1;
        (__sourceSpill233_48)[__sourceSpill233_49] = __sourceSpill233_47;
        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }
        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));
    }
    d = ((java.lang.String[])(local9_life19));
    e = ((java.lang.String[])(new java.lang.String[10]));
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
        byte[] spill656_0 = p0;
        life4_9 += 1;
        life5_44 = (spill656_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill656_1 = p0;
        life4_9 += 1;
        life5_76 = (spill656_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill656_2 = p0;
        life4_9 += 1;
        life5_91 = (spill656_2)[life4_9];
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 9745);
    if (((com.moon.ky.e)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.ky.f)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.ky.f)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/ky", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.ky.d)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.ky.e)[life5_8] = __sourceExactCall_227588a73c57b6(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.ky.e)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = __sourceExactCall_bdca042c4823f5(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral2107_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/ky"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(org.luaj.vm2.LuaTable p0, moom.zh p1) {
long life3_3;
    int life6_13;
    int life5_25;
    life3_3 = (com.moon.ky.c ^ 119244425755974L);
    int spill655_0 = __sourceExactCall_0183a4f0b8e474();
    life6_13 = ((org.luaj.vm2.LuaValue)(((org.luaj.vm2.LuaTable)(p0)).get(((java.lang.String)(__sourceIntrinsic_082716d58768_invokedynamic655_2(24898, (2523340269438642975L ^ life3_3))))))).toint();
    ((moom.zh)(p1)).a(((int)(((org.luaj.vm2.LuaValue)(((org.luaj.vm2.LuaTable)(p0)).get(((java.lang.String)(__sourceIntrinsic_082716d58768_invokedynamic655_5(10937, (8869132308926423267L ^ life3_3))))))).toint())));
    life5_25 = spill655_0;
    ((moom.zh)(p1)).c(((int)(((org.luaj.vm2.LuaValue)(((org.luaj.vm2.LuaTable)(p0)).get(((java.lang.String)(__sourceIntrinsic_082716d58768_invokedynamic655_9(13638, (823765112354012959L ^ life3_3))))))).toint())));
    ((moom.zh)(p1)).a(((short)(((org.luaj.vm2.LuaValue)(((org.luaj.vm2.LuaTable)(p0)).get(((java.lang.String)(__sourceIntrinsic_082716d58768_invokedynamic655_13(29387, (1621932185530382484L ^ life3_3))))))).toshort())));
    if ((life5_25 != 0)) {
        if ((com.moon.ky.a != null)) {
        if ((((net.minecraft.client.Minecraft)(com.moon.ky.a)).K != null)) {
        if ((life6_13 != ((moom.zh)(p1)).f())) {
        ((moom.zh)(p1)).a(((net.minecraft.item.ItemStack)(((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.ky.a)).K)).bD)).a__xW(((int)(life6_13))))));
    }
    }
    }
        ((moom.zh)(p1)).b(((int)(life6_13)));
        ((moom.zh)(p1)).d(((int)(((org.luaj.vm2.LuaValue)(((org.luaj.vm2.LuaTable)(p0)).get(((java.lang.String)(__sourceIntrinsic_082716d58768_invokedynamic655_27(13560, (3563603442972884655L ^ life3_3))))))).toint())));
    }
    return;
}


public void a__sourceBridge_bab6a6134e(org.luaj.vm2.LuaTable p0, moom.yK p1) {
((com.moon.ky)(this)).a(((org.luaj.vm2.LuaTable)(p0)), ((moom.zh)(((moom.zh)(p1)))));
}


public org.luaj.vm2.LuaTable a__sourceBridge_39790ff3c2(moom.yK p0) {
return ((com.moon.ky)(this)).a(((moom.zh)(((moom.zh)(p0)))));
}


public org.luaj.vm2.LuaTable a(moom.zh p0) {
long local2_life2 = (com.moon.ky.c ^ 96883017173196L);
    org.luaj.vm2.LuaTable local4_life3 = new org.luaj.vm2.LuaTable();
    ((org.luaj.vm2.LuaTable)(local4_life3)).set(((java.lang.String)(__sourceIntrinsic_430634e1a05c_originalDynamicSite123_5(25724, (7285194169913711534L ^ local2_life2)))), ((org.luaj.vm2.LuaValue)(org.luaj.vm2.LuaValue.valueOf(((int)(((moom.zh)(p0)).a()))))));
    ((org.luaj.vm2.LuaTable)(local4_life3)).set(((java.lang.String)(__sourceIntrinsic_430634e1a05c_originalDynamicSite123_10(5700, (7831074007329532309L ^ local2_life2)))), ((org.luaj.vm2.LuaValue)(org.luaj.vm2.LuaValue.valueOf(((int)(((moom.zh)(p0)).b()))))));
    ((org.luaj.vm2.LuaTable)(local4_life3)).set(((java.lang.String)(__sourceIntrinsic_430634e1a05c_originalDynamicSite123_15(16445, (3480134461764616169L ^ local2_life2)))), ((org.luaj.vm2.LuaValue)(org.luaj.vm2.LuaValue.valueOf(((int)(((moom.zh)(p0)).c()))))));
    ((org.luaj.vm2.LuaTable)(local4_life3)).set(((java.lang.String)(__sourceIntrinsic_430634e1a05c_originalDynamicSite123_20(17076, (3424571105975844194L ^ local2_life2)))), ((org.luaj.vm2.LuaValue)(org.luaj.vm2.LuaValue.valueOf(((int)(((moom.zh)(p0)).a__Short()))))));
    ((org.luaj.vm2.LuaTable)(local4_life3)).set(((java.lang.String)(__sourceIntrinsic_430634e1a05c_originalDynamicSite123_25(21023, (231145037656239555L ^ local2_life2)))), ((org.luaj.vm2.LuaValue)(org.luaj.vm2.LuaValue.valueOf(((int)(((moom.zh)(p0)).d()))))));
    return local4_life3;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral2107_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_430634e1a05c_originalDynamicSite123_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_430634e1a05c_originalDynamicSite123_10(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_430634e1a05c_originalDynamicSite123_15(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_430634e1a05c_originalDynamicSite123_20(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_430634e1a05c_originalDynamicSite123_25(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_082716d58768_invokedynamic655_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_082716d58768_invokedynamic655_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_082716d58768_invokedynamic655_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_082716d58768_invokedynamic655_13(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_082716d58768_invokedynamic655_27(int a0, long a1) throws E;



private static native java.lang.String __sourceExactCall_227588a73c57b6(byte[] p0);
private static native java.lang.String __sourceExactCall_bdca042c4823f5(int p0, long p1);
private static native int __sourceExactCall_0183a4f0b8e474();
}
