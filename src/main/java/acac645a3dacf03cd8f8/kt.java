package com.moon;


public class kt extends com.moon.kd<moom.zb> {

private final net.minecraft.client.Minecraft c;

private static final long d;

private static final java.lang.String[] e;

private static final java.lang.String[] f;

private static final java.util.Map g;

public kt(java.lang.Class<moom.zb> p0) {
super(p0);
    this.c = net.minecraft.client.Minecraft.a__fM();
}


static {
d = ((long)(((moom._a)(moom._c.a(((long)(7829172942349977640L)), ((long)(8526479212894462389L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(106383744842087L)))));
    g = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.kt.d ^ 46995770548939L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill228_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill228_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill228_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill228_14 = new byte[8];
    (__sourceSpill228_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill228_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation228_16 = __sourceSpill228_14;
    ((javax.crypto.Cipher)(__sourceSpill228_11)).init(((int)(__sourceSpill228_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill228_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation228_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local9_life19 = new java.lang.String[10];
    int local7_life20 = 0;
    java.lang.String local6_life21;
    int local8_life23 = ((java.lang.String)((local6_life21 = "\006N2^úF\023z0Ì»;g;ÓoR¸F\"\006£62ë×Î\031\020õS\blø·ç±DãÄØÇs æ`+HË¦\021²¶Hù0\016/ÛÀ\020$s2\bÔ¸ö¸êI\005\020¯FUÇ0`Ó4`GÑôc¯ ¹Ã\006èý\033Àò=ñ$Ýä\fbõ\016Wk\007\024æ7>Ã%\002 .ãËeX¾½ÎSù[Èän\021æxßaðõ\035v-=Ä/rJ\016\030\027Xã\nD°øåBë'/\fÅ¸Ä,;ñ\032=ê\030/\000¥#Ævâgø\000O\030\031áë6\0247"))).length();
    int local5_life24 = 32;
    int local4_life25 = -1;
    while (true) {
        local4_life25 += 1;
        byte[] __sourceSpill228_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill228_29 = local2_life9;
        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill228_29)).doFinal(((byte[])(__sourceSpill228_28)));
        java.lang.String __sourceSpill228_34 = ((java.lang.String)(com.moon.kt.a(((byte[])(local10_life31))))).intern();
        java.lang.String[] __sourceSpill228_35 = local9_life19;
        int __sourceSpill228_36 = local7_life20;
        local7_life20 += 1;
        (__sourceSpill228_35)[__sourceSpill228_36] = __sourceSpill228_34;
        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }
        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));
    }
    local8_life23 = ((java.lang.String)((local6_life21 = "S'\t¡2;Ð¼\035?¶gòÁò6u¿\024 \030øJ¶×|høJq`\177Äk%§Éxï(Ê?&(kê~"))).length();
    local5_life24 = 24;
    local4_life25 = -1;
    while (true) {
        local4_life25 += 1;
        byte[] __sourceSpill228_41 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill228_42 = local2_life9;
        byte[] local10_life44 = ((javax.crypto.Cipher)(__sourceSpill228_42)).doFinal(((byte[])(__sourceSpill228_41)));
        java.lang.String __sourceSpill228_47 = ((java.lang.String)(com.moon.kt.a(((byte[])(local10_life44))))).intern();
        java.lang.String[] __sourceSpill228_48 = local9_life19;
        int __sourceSpill228_49 = local7_life20;
        local7_life20 += 1;
        (__sourceSpill228_48)[__sourceSpill228_49] = __sourceSpill228_47;
        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }
        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));
    }
    e = ((java.lang.String[])(local9_life19));
    f = ((java.lang.String[])(new java.lang.String[10]));
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
        byte[] spill650_0 = p0;
        life4_9 += 1;
        life5_44 = (spill650_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill650_1 = p0;
        life4_9 += 1;
        life5_76 = (spill650_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill650_2 = p0;
        life4_9 += 1;
        life5_91 = (spill650_2)[life4_9];
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 31865);
    if (((com.moon.kt.f)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.kt.g)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.kt.g)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/kt", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.kt.e)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.kt.f)[life5_8] = __sourceExactCall_a71d7bee014544(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.kt.f)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = __sourceExactCall_73603662470e19(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral2090_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/kt"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(org.luaj.vm2.LuaTable p0, moom.zb p1) {
net.minecraft.client.Minecraft forwardValue649_58_0;
    int spill649_0;
    net.minecraft.client.Minecraft spill649_1;
    long life3_3;
    int life6_8;
    int life7_13;
    int life8_19;
    int life5_29;
    forward_join_114: {
    forward_join_109: {
    forward_join_76: {
    forward_join_58: {
    life3_3 = (com.moon.kt.d ^ 56471082892345L);
    life6_8 = ((org.luaj.vm2.LuaValue)(((org.luaj.vm2.LuaTable)(p0)).get(((java.lang.String)("x"))))).toint();
    life7_13 = ((org.luaj.vm2.LuaValue)(((org.luaj.vm2.LuaTable)(p0)).get(((java.lang.String)("y"))))).toint();
    spill649_0 = __sourceExactCall_0183a4f0b8e474();
    life8_19 = ((org.luaj.vm2.LuaValue)(((org.luaj.vm2.LuaTable)(p0)).get(((java.lang.String)("z"))))).toint();
    ((moom.zb)(p1)).a(((moom.DT)(new moom.DT(life6_8, life7_13, life8_19))));
    life5_29 = spill649_0;
    ((moom.zb)(p1)).a(((int)(((org.luaj.vm2.LuaValue)(((org.luaj.vm2.LuaTable)(p0)).get(((java.lang.String)(__sourceIntrinsic_14bf3cb230e3_invokedynamic649_9(14925, (924874812760041381L ^ life3_3))))))).toint())));
    if (!((life5_29 != 0))) {
        break forward_join_109;
    }
    if (!((((org.luaj.vm2.LuaValue)(((org.luaj.vm2.LuaTable)(p0)).get(((java.lang.String)(__sourceIntrinsic_14bf3cb230e3_invokedynamic649_13(20354, (8719926334121202286L ^ life3_3))))))).toint() != -1))) {
        break forward_join_76;
    }
    spill649_1 = com.moon.kt.a;
    if (!((life5_29 != 0))) {
        forwardValue649_58_0 = spill649_1;
        break forward_join_58;
    }
    if (!((spill649_1 != null))) {
        break forward_join_76;
    }
    forwardValue649_58_0 = com.moon.kt.a;
    }
    if (!((((net.minecraft.client.Minecraft)(forwardValue649_58_0)).K != null))) {
        break forward_join_76;
    }
    ((moom.zb)(p1)).a(((net.minecraft.item.ItemStack)(((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(this.c)).K)).bD)).a__xW(((int)(((org.luaj.vm2.LuaValue)(((org.luaj.vm2.LuaTable)(p0)).get(((java.lang.String)(__sourceIntrinsic_14bf3cb230e3_invokedynamic649_22(20354, (8719926334121202286L ^ life3_3))))))).toint()))))));
    }
    ((moom.zb)(p1)).a(((float)(((org.luaj.vm2.LuaValue)(((org.luaj.vm2.LuaTable)(p0)).get(((java.lang.String)(__sourceIntrinsic_14bf3cb230e3_invokedynamic649_27(10214, (5951851188256684555L ^ life3_3))))))).tofloat())));
    ((moom.zb)(p1)).b(((float)(((org.luaj.vm2.LuaValue)(((org.luaj.vm2.LuaTable)(p0)).get(((java.lang.String)(__sourceIntrinsic_14bf3cb230e3_invokedynamic649_31(12713, (3779761877371923532L ^ life3_3))))))).tofloat())));
    ((moom.zb)(p1)).c(((float)(((org.luaj.vm2.LuaValue)(((org.luaj.vm2.LuaTable)(p0)).get(((java.lang.String)(__sourceIntrinsic_14bf3cb230e3_invokedynamic649_35(1510, (6657364925067073551L ^ life3_3))))))).tofloat())));
    }
    if (!((net.minecraft.entity.Entity.b__ArrayString() != null))) {
        break forward_join_114;
    }
    life5_29 += 1;
    __sourceExactCall_61ad05ea2b08c1(((int)(life5_29)));
    }
    return;
}


public void a__sourceBridge_bab6a6134e(org.luaj.vm2.LuaTable p0, moom.yK p1) {
((com.moon.kt)(this)).a(((org.luaj.vm2.LuaTable)(p0)), ((moom.zb)(((moom.zb)(p1)))));
}


public org.luaj.vm2.LuaTable a__sourceBridge_39790ff3c2(moom.yK p0) {
return ((com.moon.kt)(this)).a(((moom.zb)(((moom.zb)(p0)))));
}


public org.luaj.vm2.LuaTable a(moom.zb p0) {
net.minecraft.client.Minecraft forestValue100025_51_0;
    net.minecraft.client.entity.EntityPlayerSP forestValue100025_57_0;
    net.minecraft.item.ItemStack forestValue100025_99_0;
    int spill100025_0;
    net.minecraft.client.Minecraft spill100025_1;
    net.minecraft.client.entity.EntityPlayerSP spill100025_2;
    net.minecraft.item.ItemStack spill100025_3;
    long life2_3;
    org.luaj.vm2.LuaTable life5_8;
    moom.DT life6_11;
    net.minecraft.item.ItemStack life7_42;
    int life8_44;
    int life4_45;
    net.minecraft.item.ItemStack[] life9_62;
    int life10_64;
    net.minecraft.item.ItemStack life11_72;
    forest_join_109: {
    forest_join_100: {
    forest_join_99: {
    forest_join_96: {
    forest_join_57: {
    forest_join_51: {
    life2_3 = (com.moon.kt.d ^ 81053670723548L);
    spill100025_0 = __sourceExactCall_06ee73944ae97f();
    life5_8 = new org.luaj.vm2.LuaTable();
    life6_11 = ((moom.zb)(p0)).a__DT();
    ((org.luaj.vm2.LuaTable)(life5_8)).set(((java.lang.String)("x")), ((org.luaj.vm2.LuaValue)(org.luaj.vm2.LuaValue.valueOf(((int)(((moom.DT)(life6_11)).a()))))));
    ((org.luaj.vm2.LuaTable)(life5_8)).set(((java.lang.String)("y")), ((org.luaj.vm2.LuaValue)(org.luaj.vm2.LuaValue.valueOf(((int)(((moom.DT)(life6_11)).b()))))));
    ((org.luaj.vm2.LuaTable)(life5_8)).set(((java.lang.String)("z")), ((org.luaj.vm2.LuaValue)(org.luaj.vm2.LuaValue.valueOf(((int)(((moom.DT)(life6_11)).c()))))));
    ((org.luaj.vm2.LuaTable)(life5_8)).set(((java.lang.String)(__sourceIntrinsic_ba7c686ba4bf_invokedynamic100025_12(5762, (5290836451730897027L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(org.luaj.vm2.LuaValue.valueOf(((int)(((moom.zb)(p0)).a__Int()))))));
    life7_42 = ((moom.zb)(p0)).c__xW();
    life8_44 = 0;
    life4_45 = spill100025_0;
    spill100025_1 = com.moon.kt.a;
    if (!((life4_45 == 0))) {
        forestValue100025_51_0 = spill100025_1;
        break forest_join_51;
    }
    if (!((spill100025_1 != null))) {
        break forest_join_96;
    }
    forestValue100025_51_0 = com.moon.kt.a;
    }
    spill100025_2 = ((net.minecraft.client.Minecraft)(forestValue100025_51_0)).K;
    if (!((life4_45 == 0))) {
        forestValue100025_57_0 = spill100025_2;
        break forest_join_57;
    }
    if (!((spill100025_2 != null))) {
        break forest_join_96;
    }
    forestValue100025_57_0 = ((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).K;
    }
    life9_62 = ((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.client.entity.EntityPlayerSP)(forestValue100025_57_0)).bD)).a;
    life10_64 = 0;
    forest_cycle_62: while (true) {
    forest_join_94: {
    forest_join_93: {
    if (!((life10_64 < (life9_62).length))) {
        break forest_join_96;
    }
    life11_72 = (life9_62)[life10_64];
    if (!((life4_45 == 0))) {
        break forest_join_94;
    }
    spill100025_3 = life7_42;
    if (!((life4_45 == 0))) {
        forestValue100025_99_0 = spill100025_3;
        break forest_join_99;
    }
    if (!((spill100025_3 == life11_72))) {
        break forest_join_93;
    }
    ((org.luaj.vm2.LuaTable)(life5_8)).set(((java.lang.String)(__sourceIntrinsic_ba7c686ba4bf_invokedynamic100025_24(890, (7660378618885254513L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(org.luaj.vm2.LuaValue.valueOf(((int)(life10_64))))));
    life8_44 = 1;
    if (!((life4_45 != 0))) {
        break forest_join_96;
    }
    __sourceExactCall_6604345f74a40b(((java.lang.String[])(new java.lang.String[1])));
    }
    life10_64 += 1;
    }
    if (!((life4_45 != 0))) {
        continue forest_cycle_62;
    }
    break forest_cycle_62;
    }
    }
    if (!((life8_44 != 0))) {
        break forest_join_100;
    }
    forestValue100025_99_0 = life7_42;
    }
    if (!((forestValue100025_99_0 == null))) {
        break forest_join_109;
    }
    }
    ((org.luaj.vm2.LuaTable)(life5_8)).set(((java.lang.String)(__sourceIntrinsic_ba7c686ba4bf_invokedynamic100025_28(20354, (8719844257504682379L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(org.luaj.vm2.LuaTable.valueOf(((int)(-1))))));
    }
    ((org.luaj.vm2.LuaTable)(life5_8)).set(((java.lang.String)(__sourceIntrinsic_ba7c686ba4bf_invokedynamic100025_31(16178, (2000451184566112572L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(org.luaj.vm2.LuaValue.valueOf(((double)(((double) ((moom.zb)(p0)).a())))))));
    ((org.luaj.vm2.LuaTable)(life5_8)).set(((java.lang.String)(__sourceIntrinsic_ba7c686ba4bf_invokedynamic100025_35(6713, (6810520746876810294L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(org.luaj.vm2.LuaValue.valueOf(((double)(((double) ((moom.zb)(p0)).b())))))));
    ((org.luaj.vm2.LuaTable)(life5_8)).set(((java.lang.String)(__sourceIntrinsic_ba7c686ba4bf_invokedynamic100025_39(7253, (7128163104530707039L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(org.luaj.vm2.LuaValue.valueOf(((double)(((double) ((moom.zb)(p0)).c())))))));
    return life5_8;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral2090_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ba7c686ba4bf_invokedynamic100025_12(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ba7c686ba4bf_invokedynamic100025_24(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ba7c686ba4bf_invokedynamic100025_28(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ba7c686ba4bf_invokedynamic100025_31(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ba7c686ba4bf_invokedynamic100025_35(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ba7c686ba4bf_invokedynamic100025_39(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_14bf3cb230e3_invokedynamic649_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_14bf3cb230e3_invokedynamic649_13(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_14bf3cb230e3_invokedynamic649_22(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_14bf3cb230e3_invokedynamic649_27(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_14bf3cb230e3_invokedynamic649_31(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_14bf3cb230e3_invokedynamic649_35(int a0, long a1) throws E;



private static native java.lang.String __sourceExactCall_a71d7bee014544(byte[] p0);
private static native java.lang.String __sourceExactCall_73603662470e19(int p0, long p1);
private static native int __sourceExactCall_0183a4f0b8e474();
private static native void __sourceExactCall_61ad05ea2b08c1(int p0);
private static native int __sourceExactCall_06ee73944ae97f();
private static native void __sourceExactCall_6604345f74a40b(java.lang.String[] p0);
}
