package com.moon;


public class j1 implements com.moon.scripting.api.functions.InventoryFunctions {

private static final net.minecraft.client.Minecraft a;

private static final long b;

private static final java.lang.String[] c;

private static final java.lang.String[] d;

private static final java.util.Map e;

public j1() {
super();
}


static {
b = ((long)(((moom._a)(moom._c.a(((long)(-3381592484251445260L)), ((long)(-4401457205867117107L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(39943849847505L)))));

    e = ((java.util.Map)(new java.util.HashMap(13)));

    long local0_life7 = (com.moon.j1.b ^ 15744642594115L);

    javax.crypto.Cipher local2_life9;

    javax.crypto.Cipher __sourceSpill257_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));

    int __sourceSpill257_12 = 2;

    javax.crypto.SecretKeyFactory __sourceSpill257_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));

    byte[] __sourceSpill257_14 = new byte[8];

    (__sourceSpill257_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));

    int local3_life15 = 1;

    while ((local3_life15 < 8)) {

        (__sourceSpill257_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));

        local3_life15 += 1;

    }

    byte[] __sourcePreallocation257_16 = __sourceSpill257_14;

    ((javax.crypto.Cipher)(__sourceSpill257_11)).init(((int)(__sourceSpill257_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill257_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation257_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));

    java.lang.String[] local9_life19 = new java.lang.String[13];

    int local7_life20 = 0;

    java.lang.String local6_life21;

    int local8_life23 = ((java.lang.String)((local6_life21 = "ö54­\021ªÌ¤3öáyÓ\036\030d§Í[\túK'\b@@2\nmÛ[òËÌ,V\020]6nmDk\030/>+ÃË[%\020Ô÷3\177ï>÷¢¤ßgs÷»\017\034\020_JñXå¿¥ÚyÜ]ísb\020%\0270üÉ~\n¡d5Ì\n\036öë\020¥\nVò÷çê¤<tÛ\025ë{\030Ó\035uïÇVÀÁ1\017\007\016¨4x\002¼|\007=Øt\020YÇN\020\025$ ~³»»&él\030èltl\tçà=Ô\0061í6s¢à['%\024ù\001\0305[Ý¦Èá\016\024bîã°Q\023yÑ\177ã/Ä0"))).length();

    int local5_life24 = 16;

    int local4_life25 = -1;

    while (true) {

        local4_life25 += 1;

        byte[] __sourceSpill257_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill257_29 = local2_life9;

        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill257_29)).doFinal(((byte[])(__sourceSpill257_28)));

        java.lang.String __sourceSpill257_34 = ((java.lang.String)(com.moon.j1.a(((byte[])(local10_life31))))).intern();

        java.lang.String[] __sourceSpill257_35 = local9_life19;

        int __sourceSpill257_36 = local7_life20;

        local7_life20 += 1;

        (__sourceSpill257_35)[__sourceSpill257_36] = __sourceSpill257_34;

        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }

        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));

    }

    local8_life23 = ((java.lang.String)((local6_life21 = "\031e¯\007@M«f¸Ú;±ÂÐñ\020¬$\003\\½«ãÐg<ÃEmÈ\004"))).length();

    local5_life24 = 16;

    local4_life25 = -1;

    while (true) {

        local4_life25 += 1;

        byte[] __sourceSpill257_42 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill257_43 = local2_life9;

        byte[] local10_life45 = ((javax.crypto.Cipher)(__sourceSpill257_43)).doFinal(((byte[])(__sourceSpill257_42)));

        java.lang.String __sourceSpill257_48 = ((java.lang.String)(com.moon.j1.a(((byte[])(local10_life45))))).intern();

        java.lang.String[] __sourceSpill257_49 = local9_life19;

        int __sourceSpill257_50 = local7_life20;

        local7_life20 += 1;

        (__sourceSpill257_49)[__sourceSpill257_50] = __sourceSpill257_48;

        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }

        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));

    }

    c = ((java.lang.String[])(local9_life19));

    d = ((java.lang.String[])(new java.lang.String[13]));

    a = ((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM()));
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private double a(net.minecraft.item.ItemStack p0) {
net.minecraft.item.ItemStack forestValue80_11_0;
    net.minecraft.item.ItemStack forestValue80_18_0;
    net.minecraft.item.ItemStack spill80_0;
    long life2_3;
    int life4_5;
    net.minecraft.nbt.NBTTagList life5_21;
    double life6_27;
    int life8_29;
    net.minecraft.nbt.NBTTagCompound life9_37;
    int life10_45;
    forest_join_89: {
    forest_join_24: {
    forest_join_18: {
    forest_join_17: {
    forest_join_15: {
    forest_join_11: {
    life2_3 = (com.moon.j1.b ^ 114207748768240L);
    life4_5 = ((com.moon.j2.b()) ? 1 : 0);
    spill80_0 = p0;
    if (!((life4_5 != 0))) {
        forestValue80_11_0 = spill80_0;
        break forest_join_11;
    }
    if (!((spill80_0 != null))) {
        break forest_join_15;
    }
    forestValue80_11_0 = p0;
    }
    if (!((life4_5 != 0))) {
        forestValue80_18_0 = forestValue80_11_0;
        break forest_join_18;
    }
    if (!((!((net.minecraft.item.ItemStack)(forestValue80_11_0)).i()))) {
        break forest_join_17;
    }
    }
    return 0x0.0p0d;
    }
    forestValue80_18_0 = p0;
    }
    life5_21 = ((net.minecraft.item.ItemStack)(forestValue80_18_0)).a__yz();
    if (!((life5_21 == null))) {
        break forest_join_24;
    }
    return 0x0.0p0d;
    }
    life6_27 = 0x0.0p0d;
    life8_29 = 0;
    forest_cycle_28: while (true) {
    forest_join_86: {
    forest_join_79: {
    forest_join_70: {
    forest_join_61: {
    forest_join_59: {
    forest_join_54: {
    if (!((life8_29 < ((net.minecraft.nbt.NBTTagList)(life5_21)).a__Int()))) {
        break forest_join_89;
    }
    life9_37 = ((net.minecraft.nbt.NBTTagList)(life5_21)).a__yw(((int)(life8_29)));
    life10_45 = ((net.minecraft.nbt.NBTTagCompound)(life9_37)).a__Short(((java.lang.String)(__sourceIntrinsic_755b80cb8baf_invokedynamic80_7(10975, (4744007760552099511L ^ life2_3)))));
    if (!((life4_5 != 0))) {
        break forest_join_59;
    }
    switch (((int)(((net.minecraft.nbt.NBTTagCompound)(life9_37)).a__Short(((java.lang.String)(__sourceIntrinsic_755b80cb8baf_invokedynamic80_9(9774, (107027880848978500L ^ life2_3)))))))) {
case 0:
{
        break forest_join_54;
    }
case 16:
{
        break forest_join_61;
    }
case 20:
{
        break forest_join_70;
    }
default:
{
        break forest_join_79;
    }
}
    }
    life6_27 = (life6_27 + ((double) life10_45));
    }
    if (!((life4_5 == 0))) {
        break forest_join_86;
    }
    }
    life6_27 = (life6_27 + (0x1.4p0d * ((double) life10_45)));
    if (!((life4_5 == 0))) {
        break forest_join_86;
    }
    }
    life6_27 = (life6_27 + (0x1.0p-1d * ((double) life10_45)));
    if (!((life4_5 == 0))) {
        break forest_join_86;
    }
    }
    life6_27 = (life6_27 + (0x1.999999999999ap-3d * ((double) life10_45)));
    }
    life8_29 += 1;
    if (!((life4_5 == 0))) {
        continue forest_cycle_28;
    }
    break forest_cycle_28;
    }
    }
    return life6_27;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral1715_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/j1"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
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
        byte[] spill644_0 = p0;
        life4_9 += 1;
        life5_44 = (spill644_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill644_1 = p0;
        life4_9 += 1;
        life5_76 = (spill644_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill644_2 = p0;
        life4_9 += 1;
        life5_91 = (spill644_2)[life4_9];
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 8466);
    if (((com.moon.j1.d)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.j1.e)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.j1.e)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/j1", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.j1.c)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.j1.d)[life5_8] = com.moon.j1.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.j1.d)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.j1.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public void shift(int p0) {
((moom.jI)(((net.minecraft.client.Minecraft)(com.moon.j1.a)).F)).a(((int)(((moom.v8)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.j1.a)).K)).bF)).c)), ((int)(p0)), ((int)(0)), ((int)(1)), ((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.client.Minecraft)(com.moon.j1.a)).K)));
    return;
}


public void swap(int p0, int p1) {
((moom.jI)(((net.minecraft.client.Minecraft)(com.moon.j1.a)).F)).a(((int)(((moom.v8)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.j1.a)).K)).bF)).c)), ((int)(p0)), ((int)(p1)), ((int)(2)), ((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.client.Minecraft)(com.moon.j1.a)).K)));
    return;
}


public void drop(int p0, boolean p1) {
moom.jI forwardValue438_18_0;
    int forwardValue438_18_1;
    int forwardValue438_18_2;
    int forwardValue438_18_3;
    moom.jI forwardValue438_19_0;
    int forwardValue438_19_1;
    int forwardValue438_19_2;
    moom.jI forwardValue438_20_0;
    int forwardValue438_20_1;
    int forwardValue438_20_2;
    int forwardValue438_20_3;
    moom.jI spill438_0;
    int spill438_1;
    int spill438_2;
    boolean spill438_3;
    long life3_3;
    int life5_5;
    forward_join_20: {
    forward_join_19: {
    forward_join_18: {
    life3_3 = (com.moon.j1.b ^ 101005685671055L);
    life5_5 = ((com.moon.j2.c()) ? 1 : 0);
    spill438_0 = ((net.minecraft.client.Minecraft)(com.moon.j1.a)).F;
    spill438_1 = ((moom.v8)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.j1.a)).K)).bF)).c;
    spill438_2 = p0;
    spill438_3 = p1;
    if (!((life5_5 == 0))) {
        forwardValue438_18_0 = spill438_0;
        forwardValue438_18_1 = spill438_1;
        forwardValue438_18_2 = spill438_2;
        forwardValue438_18_3 = ((spill438_3) ? 1 : 0);
        break forward_join_18;
    }
    if (!(spill438_3)) {
        forwardValue438_19_0 = spill438_0;
        forwardValue438_19_1 = spill438_1;
        forwardValue438_19_2 = spill438_2;
        break forward_join_19;
    }
    forwardValue438_18_0 = spill438_0;
    forwardValue438_18_1 = spill438_1;
    forwardValue438_18_2 = spill438_2;
    forwardValue438_18_3 = 1;
    }
    forwardValue438_20_0 = forwardValue438_18_0;
    forwardValue438_20_1 = forwardValue438_18_1;
    forwardValue438_20_2 = forwardValue438_18_2;
    forwardValue438_20_3 = forwardValue438_18_3;
    break forward_join_20;
    }
    forwardValue438_20_0 = forwardValue438_19_0;
    forwardValue438_20_1 = forwardValue438_19_1;
    forwardValue438_20_2 = forwardValue438_19_2;
    forwardValue438_20_3 = 0;
    }
    ((moom.jI)(forwardValue438_20_0)).a(((int)(forwardValue438_20_1)), ((int)(forwardValue438_20_2)), ((int)(forwardValue438_20_3)), ((int)(4)), ((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.client.Minecraft)(com.moon.j1.a)).K)));
    return;
}


public int player_inventory_id() {
net.minecraft.client.entity.EntityPlayerSP forwardValue444_13_0;
    moom.v8 forwardValue444_22_0;
    net.minecraft.client.entity.EntityPlayerSP spill444_0;
    moom.v8 spill444_1;
    long life1_3;
    int life3_5;
    forward_join_22: {
    forward_join_19: {
    forward_join_17: {
    forward_join_13: {
    life1_3 = (com.moon.j1.b ^ 10798601435771L);
    life3_5 = ((com.moon.j2.b()) ? 1 : 0);
    spill444_0 = ((net.minecraft.client.Minecraft)(com.moon.j1.a)).K;
    if (!((life3_5 != 0))) {
        forwardValue444_13_0 = spill444_0;
        break forward_join_13;
    }
    if (!((spill444_0 != null))) {
        break forward_join_17;
    }
    forwardValue444_13_0 = ((net.minecraft.client.Minecraft)(com.moon.j1.a)).K;
    }
    spill444_1 = ((net.minecraft.client.entity.EntityPlayerSP)(forwardValue444_13_0)).bF;
    if (!((life3_5 != 0))) {
        forwardValue444_22_0 = spill444_1;
        break forward_join_22;
    }
    if (!((spill444_1 == null))) {
        break forward_join_19;
    }
    }
    return 0;
    }
    forwardValue444_22_0 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.j1.a)).K)).bF;
    }
    return ((moom.v8)(forwardValue444_22_0)).c;
}


public double get_damage_reduction(int p0) {
net.minecraft.client.entity.EntityPlayerSP forwardValue440_13_0;
    net.minecraft.entity.player.InventoryPlayer forwardValue440_22_0;
    net.minecraft.item.ItemStack forwardValue440_32_0;
    int forwardValue440_43_0;
    int forwardValue440_63_0;
    net.minecraft.client.entity.EntityPlayerSP spill440_0;
    net.minecraft.entity.player.InventoryPlayer spill440_1;
    net.minecraft.item.ItemStack spill440_2;
    int spill440_3;
    boolean spill440_4;
    long life2_3;
    int life4_5;
    net.minecraft.item.ItemStack life5_35;
    float life6_65;
    java.util.Map life7_68;
    int life8_90;
    forward_join_72: {
    forward_join_63: {
    forward_join_43: {
    forward_join_39: {
    forward_join_32: {
    forward_join_31: {
    forward_join_22: {
    forward_join_19: {
    forward_join_17: {
    forward_join_13: {
    life2_3 = (com.moon.j1.b ^ 6653201214501L);
    life4_5 = ((com.moon.j2.b()) ? 1 : 0);
    spill440_0 = ((net.minecraft.client.Minecraft)(com.moon.j1.a)).K;
    if (!((life4_5 != 0))) {
        forwardValue440_13_0 = spill440_0;
        break forward_join_13;
    }
    if (!((spill440_0 != null))) {
        break forward_join_17;
    }
    forwardValue440_13_0 = ((net.minecraft.client.Minecraft)(com.moon.j1.a)).K;
    }
    spill440_1 = ((net.minecraft.client.entity.EntityPlayerSP)(forwardValue440_13_0)).bD;
    if (!((life4_5 != 0))) {
        forwardValue440_22_0 = spill440_1;
        break forward_join_22;
    }
    if (!((spill440_1 == null))) {
        break forward_join_19;
    }
    }
    return 0x0.0p0d;
    }
    forwardValue440_22_0 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.j1.a)).K)).bD;
    }
    life5_35 = ((net.minecraft.entity.player.InventoryPlayer)(forwardValue440_22_0)).a__xW(((int)(p0)));
    spill440_2 = life5_35;
    if (!((life4_5 != 0))) {
        forwardValue440_32_0 = spill440_2;
        break forward_join_32;
    }
    if (!((spill440_2 == null))) {
        break forward_join_31;
    }
    return 0x0.0p0d;
    }
    forwardValue440_32_0 = life5_35;
    }
    spill440_3 = ((((net.minecraft.item.ItemStack)(forwardValue440_32_0)).a__wQ() instanceof net.minecraft.item.ItemArmor) ? 1 : 0);
    if (!((life4_5 != 0))) {
        forwardValue440_43_0 = spill440_3;
        break forward_join_43;
    }
    if (!((spill440_3 == 0))) {
        break forward_join_39;
    }
    return -0x1.0p0d;
    }
    forwardValue440_43_0 = ((net.minecraft.item.ItemArmor)(((net.minecraft.item.ItemArmor)(((net.minecraft.item.ItemStack)(life5_35)).a__wQ())))).r;
    }
    life6_65 = ((float) forwardValue440_43_0);
    life7_68 = moom.rV.a(((net.minecraft.item.ItemStack)(life5_35)));
    spill440_4 = ((java.util.Map)(life7_68)).containsKey(((java.lang.Object)(java.lang.Integer.valueOf(((int)(((net.minecraft.enchantment.Enchantment)(net.minecraft.enchantment.Enchantment.d)).C))))));
    if (!((life4_5 != 0))) {
        forwardValue440_63_0 = ((spill440_4) ? 1 : 0);
        break forward_join_63;
    }
    if (!(spill440_4)) {
        break forward_join_72;
    }
    forwardValue440_63_0 = ((java.lang.Integer)(((java.lang.Integer)(((java.util.Map)(life7_68)).get(((java.lang.Object)(java.lang.Integer.valueOf(((int)(((net.minecraft.enchantment.Enchantment)(net.minecraft.enchantment.Enchantment.d)).C)))))))))).intValue();
    }
    life8_90 = forwardValue440_63_0;
    life6_65 = (life6_65 + ((float) ((net.minecraft.enchantment.Enchantment)(net.minecraft.enchantment.Enchantment.d)).a(((int)(life8_90)), ((net.minecraft.util.DamageSource)(net.minecraft.util.DamageSource.k)))));
    }
    return ((double) life6_65);
}


public void window_click(int p0, int p1, int p2, int p3) {
((moom.jI)(((net.minecraft.client.Minecraft)(com.moon.j1.a)).F)).a(((int)(p0)), ((int)(p1)), ((int)(p2)), ((int)(p3)), ((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.client.Minecraft)(com.moon.j1.a)).K)));
    return;
}


public int lower_container_id() {
return ((com.moon.j1)(this)).player_inventory_id();
}


public java.lang.String current_inventory() {
net.minecraft.client.gui.GuiScreen forwardValue437_16_0;
    int forwardValue437_28_0;
    int forwardValue437_39_0;
    int forwardValue437_50_0;
    int forwardValue437_61_0;
    int forwardValue437_72_0;
    int forwardValue437_83_0;
    int forwardValue437_96_0;
    net.minecraft.client.gui.GuiScreen forwardValue437_98_0;
    int forwardValue437_116_0;
    boolean spill437_0;
    net.minecraft.client.gui.GuiScreen spill437_1;
    int spill437_2;
    net.minecraft.client.gui.GuiScreen spill437_3;
    int spill437_4;
    long life1_3;
    net.minecraft.client.gui.GuiScreen life4_7;
    int life3_8;
    moom.hg life5_142;
    moom.v8 life6_145;
    forward_join_123: {
    forward_join_116: {
    forward_join_114: {
    forward_join_98: {
    forward_join_96: {
    forward_join_92: {
    forward_join_83: {
    forward_join_81: {
    forward_join_72: {
    forward_join_70: {
    forward_join_61: {
    forward_join_59: {
    forward_join_50: {
    forward_join_48: {
    forward_join_39: {
    forward_join_37: {
    forward_join_28: {
    forward_join_26: {
    forward_join_16: {
    forward_join_15: {
    life1_3 = (com.moon.j1.b ^ 112560983558984L);
    spill437_0 = com.moon.j2.b();
    life4_7 = ((net.minecraft.client.Minecraft)(com.moon.j1.a)).P;
    life3_8 = ((spill437_0) ? 1 : 0);
    spill437_1 = life4_7;
    if (!((life3_8 != 0))) {
        forwardValue437_16_0 = spill437_1;
        break forward_join_16;
    }
    if (!((spill437_1 == null))) {
        break forward_join_15;
    }
    return null;
    }
    forwardValue437_16_0 = life4_7;
    }
    spill437_2 = ((forwardValue437_16_0 instanceof moom.hn) ? 1 : 0);
    if (!((life3_8 != 0))) {
        forwardValue437_28_0 = spill437_2;
        break forward_join_28;
    }
    if (!((spill437_2 != 0))) {
        break forward_join_26;
    }
    return __sourceIntrinsic_d78b464d2128_invokedynamic437_6(24820, (3379802425077251628L ^ life1_3));
    }
    forwardValue437_28_0 = ((life4_7 instanceof net.minecraft.client.gui.inventory.GuiBeacon) ? 1 : 0);
    }
    if (!((life3_8 != 0))) {
        forwardValue437_39_0 = forwardValue437_28_0;
        break forward_join_39;
    }
    if (!((forwardValue437_28_0 != 0))) {
        break forward_join_37;
    }
    return __sourceIntrinsic_d78b464d2128_invokedynamic437_8(12840, (2725474056048864510L ^ life1_3));
    }
    forwardValue437_39_0 = ((life4_7 instanceof net.minecraft.client.gui.GuiMerchant) ? 1 : 0);
    }
    if (!((life3_8 != 0))) {
        forwardValue437_50_0 = forwardValue437_39_0;
        break forward_join_50;
    }
    if (!((forwardValue437_39_0 != 0))) {
        break forward_join_48;
    }
    return __sourceIntrinsic_d78b464d2128_invokedynamic437_10(19875, (7704759758843876214L ^ life1_3));
    }
    forwardValue437_50_0 = ((life4_7 instanceof moom.hi) ? 1 : 0);
    }
    if (!((life3_8 != 0))) {
        forwardValue437_61_0 = forwardValue437_50_0;
        break forward_join_61;
    }
    if (!((forwardValue437_50_0 != 0))) {
        break forward_join_59;
    }
    return __sourceIntrinsic_d78b464d2128_invokedynamic437_12(25952, (6822545414414908337L ^ life1_3));
    }
    forwardValue437_61_0 = ((life4_7 instanceof moom.hq) ? 1 : 0);
    }
    if (!((life3_8 != 0))) {
        forwardValue437_72_0 = forwardValue437_61_0;
        break forward_join_72;
    }
    if (!((forwardValue437_61_0 != 0))) {
        break forward_join_70;
    }
    return __sourceIntrinsic_d78b464d2128_invokedynamic437_14(15921, (8585288358942171366L ^ life1_3));
    }
    forwardValue437_72_0 = ((life4_7 instanceof moom.hp) ? 1 : 0);
    }
    if (!((life3_8 != 0))) {
        forwardValue437_83_0 = forwardValue437_72_0;
        break forward_join_83;
    }
    if (!((forwardValue437_72_0 != 0))) {
        break forward_join_81;
    }
    return __sourceIntrinsic_d78b464d2128_invokedynamic437_16(15438, (5534218718277952147L ^ life1_3));
    }
    forwardValue437_83_0 = ((life4_7 instanceof moom.ho) ? 1 : 0);
    }
    if (!((life3_8 != 0))) {
        forwardValue437_96_0 = forwardValue437_83_0;
        break forward_join_96;
    }
    if (!((forwardValue437_83_0 != 0))) {
        break forward_join_92;
    }
    return __sourceIntrinsic_d78b464d2128_invokedynamic437_18(10193, (5296828612617369858L ^ life1_3));
    }
    spill437_3 = life4_7;
    if (!((life3_8 != 0))) {
        forwardValue437_98_0 = spill437_3;
        break forward_join_98;
    }
    forwardValue437_96_0 = ((spill437_3 instanceof moom.hg) ? 1 : 0);
    }
    if (!((forwardValue437_96_0 != 0))) {
        break forward_join_123;
    }
    forwardValue437_98_0 = life4_7;
    }
    life5_142 = ((moom.hg)(forwardValue437_98_0));
    life6_145 = ((moom.hg)(life5_142)).z;
    spill437_4 = ((life6_145 instanceof moom.wk) ? 1 : 0);
    if (!((life3_8 != 0))) {
        forwardValue437_116_0 = spill437_4;
        break forward_join_116;
    }
    if (!((spill437_4 != 0))) {
        break forward_join_114;
    }
    return __sourceIntrinsic_d78b464d2128_invokedynamic437_23(13270, (6128190518208851209L ^ life1_3));
    }
    forwardValue437_116_0 = ((life6_145 instanceof moom.wj) ? 1 : 0);
    }
    if (!((forwardValue437_116_0 != 0))) {
        break forward_join_123;
    }
    return __sourceIntrinsic_d78b464d2128_invokedynamic437_25(31673, (7229439290149053799L ^ life1_3));
    }
    return null;
}


public int upper_container_id() {
int forwardValue445_20_0;
    boolean spill445_0;
    int spill445_1;
    long life1_3;
    net.minecraft.client.gui.GuiScreen life5_7;
    int life3_8;
    moom.hn life4_19;
    forward_join_21: {
    forward_join_20: {
    forward_join_19: {
    life1_3 = (com.moon.j1.b ^ 73900223805607L);
    spill445_0 = com.moon.j2.b();
    life5_7 = ((net.minecraft.client.Minecraft)(com.moon.j1.a)).P;
    life3_8 = ((spill445_0) ? 1 : 0);
    spill445_1 = ((life5_7 instanceof moom.hn) ? 1 : 0);
    if (!((life3_8 != 0))) {
        forwardValue445_20_0 = spill445_1;
        break forward_join_20;
    }
    if (!((spill445_1 != 0))) {
        break forward_join_19;
    }
    life4_19 = ((moom.hn)(life5_7));
    if (!((life3_8 == 0))) {
        break forward_join_21;
    }
    }
    forwardValue445_20_0 = 0;
    }
    return forwardValue445_20_0;
    }
    return ((moom.v8)(((moom.hn)(life4_19)).z)).c;
}


public double get_harvest_level(int p0) {
net.minecraft.client.entity.EntityPlayerSP forwardValue441_13_0;
    net.minecraft.entity.player.InventoryPlayer forwardValue441_22_0;
    net.minecraft.item.ItemStack forwardValue441_32_0;
    net.minecraft.item.Item forwardValue441_40_0;
    net.minecraft.client.entity.EntityPlayerSP spill441_0;
    net.minecraft.entity.player.InventoryPlayer spill441_1;
    net.minecraft.item.ItemStack spill441_2;
    net.minecraft.item.Item spill441_3;
    long life2_3;
    int life4_5;
    net.minecraft.item.ItemStack life5_35;
    net.minecraft.item.Item life7_49;
    net.minecraft.item.ItemTool life6_63;
    forward_join_46: {
    forward_join_44: {
    forward_join_40: {
    forward_join_32: {
    forward_join_31: {
    forward_join_22: {
    forward_join_19: {
    forward_join_17: {
    forward_join_13: {
    life2_3 = (com.moon.j1.b ^ 115444884716476L);
    life4_5 = ((com.moon.j2.b()) ? 1 : 0);
    spill441_0 = ((net.minecraft.client.Minecraft)(com.moon.j1.a)).K;
    if (!((life4_5 != 0))) {
        forwardValue441_13_0 = spill441_0;
        break forward_join_13;
    }
    if (!((spill441_0 != null))) {
        break forward_join_17;
    }
    forwardValue441_13_0 = ((net.minecraft.client.Minecraft)(com.moon.j1.a)).K;
    }
    spill441_1 = ((net.minecraft.client.entity.EntityPlayerSP)(forwardValue441_13_0)).bD;
    if (!((life4_5 != 0))) {
        forwardValue441_22_0 = spill441_1;
        break forward_join_22;
    }
    if (!((spill441_1 == null))) {
        break forward_join_19;
    }
    }
    return 0x0.0p0d;
    }
    forwardValue441_22_0 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.j1.a)).K)).bD;
    }
    life5_35 = ((net.minecraft.entity.player.InventoryPlayer)(forwardValue441_22_0)).a__xW(((int)(p0)));
    spill441_2 = life5_35;
    if (!((life4_5 != 0))) {
        forwardValue441_32_0 = spill441_2;
        break forward_join_32;
    }
    if (!((spill441_2 == null))) {
        break forward_join_31;
    }
    return 0x0.0p0d;
    }
    forwardValue441_32_0 = life5_35;
    }
    life7_49 = ((net.minecraft.item.ItemStack)(forwardValue441_32_0)).a__wQ();
    spill441_3 = life7_49;
    if (!((life4_5 != 0))) {
        forwardValue441_40_0 = spill441_3;
        break forward_join_40;
    }
    if (!((((spill441_3 instanceof net.minecraft.item.ItemTool) ? 1 : 0) != 0))) {
        break forward_join_44;
    }
    forwardValue441_40_0 = life7_49;
    }
    life6_63 = ((net.minecraft.item.ItemTool)(forwardValue441_40_0));
    if (!((life4_5 == 0))) {
        break forward_join_46;
    }
    }
    return 0x0.0p0d;
    }
    return (((double) ((moom.a4)(((net.minecraft.item.ItemTool)(life6_63)).a__a4())).b__Int()) + this.a(((net.minecraft.item.ItemStack)(life5_35))));
}


public com.moon.scripting.api.types.Item get_item(int p0) {
net.minecraft.client.entity.EntityPlayerSP lexicalValue95_13_0;
    net.minecraft.entity.player.InventoryPlayer lexicalValue95_22_0;
    net.minecraft.item.ItemStack lexicalValue95_32_0;
    int lexicalValue95_98_0;
    net.minecraft.item.ItemStack lexicalValue95_169_0;
    net.minecraft.nbt.NBTTagList lexicalValue95_176_0;
    net.minecraft.client.entity.EntityPlayerSP spill95_0;
    net.minecraft.entity.player.InventoryPlayer spill95_1;
    net.minecraft.item.ItemStack spill95_2;
    net.minecraft.item.ItemStack spill95_3;
    int spill95_4;
    net.minecraft.item.ItemStack spill95_5;
    net.minecraft.nbt.NBTTagList spill95_6;
    long life2_3;
    int life4_5;
    net.minecraft.item.ItemStack life5_35;
    net.minecraft.item.Item life6_49;
    com.moon.scripting.api.types.Item life7_53;
    net.minecraft.item.Item life9_95;
    moom.wU life8_106;
    net.minecraft.item.ItemPotion life8_123;
    java.util.List life9_127;
    java.util.ArrayList life10_131;
    java.util.Iterator life11_134;
    net.minecraft.potion.PotionEffect life12_141;
    net.minecraft.potion.Potion life13_146;
    com.moon.scripting.api.types.Potion life14_150;
    net.minecraft.nbt.NBTTagList life8_195;
    int life9_205;
    com.moon.scripting.api.types.Enchantment[] life10_208;
    int life11_210;
    com.moon.scripting.api.types.Enchantment life12_217;
    net.minecraft.nbt.NBTTagCompound life13_221;
    int life14_229;
    int life15_237;
    lexical_join_228: {
    lexical_join_225: {
    lexical_join_176: {
    lexical_join_169: {
    lexical_join_168: {
    lexical_join_161: {
    lexical_join_98: {
    lexical_join_91: {
    lexical_join_32: {
    lexical_join_31: {
    lexical_join_22: {
    lexical_join_19: {
    lexical_join_17: {
    lexical_join_13: {
    life2_3 = (com.moon.j1.b ^ 118594350414203L);
    life4_5 = ((com.moon.j2.b()) ? 1 : 0);
    spill95_0 = ((net.minecraft.client.Minecraft)(com.moon.j1.a)).K;
    if (!((life4_5 != 0))) {
        lexicalValue95_13_0 = spill95_0;
        break lexical_join_13;
    }
    if (!((spill95_0 != null))) {
        break lexical_join_17;
    }
    lexicalValue95_13_0 = ((net.minecraft.client.Minecraft)(com.moon.j1.a)).K;
    }
    spill95_1 = ((net.minecraft.client.entity.EntityPlayerSP)(lexicalValue95_13_0)).bD;
    if (!((life4_5 != 0))) {
        lexicalValue95_22_0 = spill95_1;
        break lexical_join_22;
    }
    if (!((spill95_1 == null))) {
        break lexical_join_19;
    }
    }
    return null;
    }
    lexicalValue95_22_0 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.j1.a)).K)).bD;
    }
    life5_35 = ((net.minecraft.entity.player.InventoryPlayer)(lexicalValue95_22_0)).a__xW(((int)(p0)));
    spill95_2 = life5_35;
    if (!((life4_5 != 0))) {
        lexicalValue95_32_0 = spill95_2;
        break lexical_join_32;
    }
    if (!((spill95_2 == null))) {
        break lexical_join_31;
    }
    return null;
    }
    lexicalValue95_32_0 = life5_35;
    }
    life6_49 = ((net.minecraft.item.ItemStack)(lexicalValue95_32_0)).a__wQ();
    life7_53 = new com.moon.scripting.api.types.Item();
    ((com.moon.scripting.api.types.Item)(life7_53)).name = ((java.lang.String)(((net.minecraft.item.Item)(life6_49)).a__String()));
    ((com.moon.scripting.api.types.Item)(life7_53)).display_name = ((java.lang.String)(((net.minecraft.item.ItemStack)(life5_35)).b__String()));
    ((com.moon.scripting.api.types.Item)(life7_53)).max_stack_size = ((int)(((net.minecraft.item.Item)(life6_49)).a()));
    ((com.moon.scripting.api.types.Item)(life7_53)).max_damage = ((int)(((net.minecraft.item.Item)(life6_49)).b()));
    ((com.moon.scripting.api.types.Item)(life7_53)).stack_size = ((int)(((net.minecraft.item.ItemStack)(life5_35)).b));
    ((com.moon.scripting.api.types.Item)(life7_53)).damage = ((int)(((net.minecraft.item.ItemStack)(life5_35)).b()));
    ((com.moon.scripting.api.types.Item)(life7_53)).potions = ((com.moon.scripting.api.types.Potion[])(new com.moon.scripting.api.types.Potion[0]));
    ((com.moon.scripting.api.types.Item)(life7_53)).solid = ((boolean)(false));
    spill95_3 = life5_35;
    if (!((life4_5 != 0))) {
        lexicalValue95_169_0 = spill95_3;
        break lexical_join_169;
    }
    if (!((((net.minecraft.item.ItemStack)(spill95_3)).a__wQ() != null))) {
        break lexical_join_168;
    }
    life9_95 = ((net.minecraft.item.ItemStack)(life5_35)).a__wQ();
    spill95_4 = ((life9_95 instanceof moom.wU) ? 1 : 0);
    if (!((life4_5 != 0))) {
        lexicalValue95_98_0 = spill95_4;
        break lexical_join_98;
    }
    if (!((spill95_4 != 0))) {
        break lexical_join_91;
    }
    life8_106 = ((moom.wU)(life9_95));
    ((com.moon.scripting.api.types.Item)(life7_53)).solid = ((boolean)(((moom.fn)(((net.minecraft.block.Block)(((moom.wU)(life8_106)).a__ch())).a__fn())).b__Boolean()));
    }
    spill95_5 = life5_35;
    if (!((life4_5 != 0))) {
        lexicalValue95_169_0 = spill95_5;
        break lexical_join_169;
    }
    life9_95 = ((net.minecraft.item.ItemStack)(spill95_5)).a__wQ();
    lexicalValue95_98_0 = ((life9_95 instanceof net.minecraft.item.ItemPotion) ? 1 : 0);
    }
    if (!((lexicalValue95_98_0 != 0))) {
        break lexical_join_168;
    }
    life8_123 = ((net.minecraft.item.ItemPotion)(life9_95));
    life9_127 = ((net.minecraft.item.ItemPotion)(life8_123)).a__List(((net.minecraft.item.ItemStack)(life5_35)));
    life10_131 = new java.util.ArrayList();
    life11_134 = ((java.util.List)(life9_127)).iterator();
    lexical_cycle_113: while (true) {
    if (!(((java.util.Iterator)(life11_134)).hasNext())) {
        break lexical_join_161;
    }
    life12_141 = ((net.minecraft.potion.PotionEffect)(((java.util.Iterator)(life11_134)).next()));
    life13_146 = (net.minecraft.potion.Potion.a)[((net.minecraft.potion.PotionEffect)(life12_141)).a()];
    life14_150 = new com.moon.scripting.api.types.Potion();
    ((com.moon.scripting.api.types.Potion)(life14_150)).id = ((int)(((net.minecraft.potion.PotionEffect)(life12_141)).a()));
    ((com.moon.scripting.api.types.Potion)(life14_150)).amplifier = ((int)(((net.minecraft.potion.PotionEffect)(life12_141)).c()));
    ((com.moon.scripting.api.types.Potion)(life14_150)).duration = ((int)(((net.minecraft.potion.PotionEffect)(life12_141)).b()));
    ((com.moon.scripting.api.types.Potion)(life14_150)).color = ((int)(((net.minecraft.potion.Potion)(life13_146)).c()));
    ((com.moon.scripting.api.types.Potion)(life14_150)).name = ((java.lang.String)(((net.minecraft.potion.Potion)(life13_146)).a__String()));
    ((com.moon.scripting.api.types.Potion)(life14_150)).bad_effect = ((boolean)(((net.minecraft.potion.Potion)(life13_146)).c__Boolean()));
    ((java.util.List)(life10_131)).add(((java.lang.Object)(life14_150)));
    if (!((life4_5 != 0))) {
        break lexical_join_168;
    }
    if (!((life4_5 == 0))) { continue lexical_cycle_113; }
    break lexical_cycle_113;
    }
    }
    ((com.moon.scripting.api.types.Item)(life7_53)).potions = ((com.moon.scripting.api.types.Potion[])(((com.moon.scripting.api.types.Potion[])(((java.util.List)(life10_131)).toArray(((java.lang.Object[])(new com.moon.scripting.api.types.Potion[0])))))));
    }
    lexicalValue95_169_0 = life5_35;
    }
    life8_195 = ((net.minecraft.item.ItemStack)(lexicalValue95_169_0)).a__yz();
    spill95_6 = life8_195;
    if (!((life4_5 != 0))) {
        lexicalValue95_176_0 = spill95_6;
        break lexical_join_176;
    }
    if (!((spill95_6 != null))) {
        break lexical_join_228;
    }
    lexicalValue95_176_0 = life8_195;
    }
    life9_205 = ((net.minecraft.nbt.NBTTagList)(lexicalValue95_176_0)).a__Int();
    life10_208 = new com.moon.scripting.api.types.Enchantment[life9_205];
    life11_210 = 0;
    lexical_cycle_183: while (true) {
    if (!((life11_210 < life9_205))) {
        break lexical_join_225;
    }
    life12_217 = new com.moon.scripting.api.types.Enchantment();
    life13_221 = ((net.minecraft.nbt.NBTTagList)(life8_195)).a__yw(((int)(life11_210)));
    life14_229 = ((net.minecraft.nbt.NBTTagCompound)(life13_221)).a__Short(((java.lang.String)(__sourceIntrinsic_bc3012b62db8_invokedynamic95_64(22629, (2188442058404279434L ^ life2_3)))));
    life15_237 = ((net.minecraft.nbt.NBTTagCompound)(life13_221)).a__Short(((java.lang.String)(__sourceIntrinsic_bc3012b62db8_invokedynamic95_66(14937, (183308912727807678L ^ life2_3)))));
    ((com.moon.scripting.api.types.Enchantment)(life12_217)).id = ((int)(life14_229));
    ((com.moon.scripting.api.types.Enchantment)(life12_217)).level = ((int)(life15_237));
    (life10_208)[life11_210] = life12_217;
    life11_210 += 1;
    if (!((life4_5 != 0))) {
        break lexical_join_228;
    }
    if (!((life4_5 == 0))) { continue lexical_cycle_183; }
    break lexical_cycle_183;
    }
    }
    ((com.moon.scripting.api.types.Item)(life7_53)).enchantments = ((com.moon.scripting.api.types.Enchantment[])(life10_208));
    }
    return life7_53;
}


public double get_damage_amount(int p0) {
net.minecraft.client.entity.EntityPlayerSP forwardValue439_13_0;
    net.minecraft.entity.player.InventoryPlayer forwardValue439_22_0;
    net.minecraft.item.ItemStack forwardValue439_32_0;
    net.minecraft.item.Item forwardValue439_40_0;
    net.minecraft.client.entity.EntityPlayerSP spill439_0;
    net.minecraft.entity.player.InventoryPlayer spill439_1;
    net.minecraft.item.ItemStack spill439_2;
    net.minecraft.item.Item spill439_3;
    long life2_3;
    int life4_5;
    net.minecraft.item.ItemStack life5_35;
    net.minecraft.item.Item life7_49;
    net.minecraft.item.ItemTool life6_63;
    forward_join_46: {
    forward_join_44: {
    forward_join_40: {
    forward_join_32: {
    forward_join_31: {
    forward_join_22: {
    forward_join_19: {
    forward_join_17: {
    forward_join_13: {
    life2_3 = (com.moon.j1.b ^ 18242991306509L);
    life4_5 = ((com.moon.j2.c()) ? 1 : 0);
    spill439_0 = ((net.minecraft.client.Minecraft)(com.moon.j1.a)).K;
    if (!((life4_5 == 0))) {
        forwardValue439_13_0 = spill439_0;
        break forward_join_13;
    }
    if (!((spill439_0 != null))) {
        break forward_join_17;
    }
    forwardValue439_13_0 = ((net.minecraft.client.Minecraft)(com.moon.j1.a)).K;
    }
    spill439_1 = ((net.minecraft.client.entity.EntityPlayerSP)(forwardValue439_13_0)).bD;
    if (!((life4_5 == 0))) {
        forwardValue439_22_0 = spill439_1;
        break forward_join_22;
    }
    if (!((spill439_1 == null))) {
        break forward_join_19;
    }
    }
    return 0x0.0p0d;
    }
    forwardValue439_22_0 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.j1.a)).K)).bD;
    }
    life5_35 = ((net.minecraft.entity.player.InventoryPlayer)(forwardValue439_22_0)).a__xW(((int)(p0)));
    spill439_2 = life5_35;
    if (!((life4_5 == 0))) {
        forwardValue439_32_0 = spill439_2;
        break forward_join_32;
    }
    if (!((spill439_2 == null))) {
        break forward_join_31;
    }
    return 0x0.0p0d;
    }
    forwardValue439_32_0 = life5_35;
    }
    life7_49 = ((net.minecraft.item.ItemStack)(forwardValue439_32_0)).a__wQ();
    spill439_3 = life7_49;
    if (!((life4_5 == 0))) {
        forwardValue439_40_0 = spill439_3;
        break forward_join_40;
    }
    if (!((((spill439_3 instanceof net.minecraft.item.ItemTool) ? 1 : 0) != 0))) {
        break forward_join_44;
    }
    forwardValue439_40_0 = life7_49;
    }
    life6_63 = ((net.minecraft.item.ItemTool)(forwardValue439_40_0));
    if (!((life4_5 != 0))) {
        break forward_join_46;
    }
    }
    return 0x0.0p0d;
    }
    return (((double) ((moom.a4)(((net.minecraft.item.ItemTool)(life6_63)).a__a4())).b()) + this.a(((net.minecraft.item.ItemStack)(life5_35))));
}


public com.moon.scripting.api.types.Item get_item_in_window(int p0, int p1) {
int lexicalValue96_28_0;
    int lexicalValue96_28_1;
    net.minecraft.client.gui.GuiScreen lexicalValue96_38_0;
    java.lang.Object lexicalValue96_62_0;
    net.minecraft.item.ItemStack lexicalValue96_71_0;
    int lexicalValue96_137_0;
    net.minecraft.item.ItemStack lexicalValue96_208_0;
    net.minecraft.nbt.NBTTagList lexicalValue96_215_0;
    int spill96_0;
    int spill96_1;
    net.minecraft.client.gui.GuiScreen spill96_2;
    moom.v8 spill96_3;
    net.minecraft.item.ItemStack spill96_4;
    net.minecraft.item.ItemStack spill96_5;
    int spill96_6;
    net.minecraft.item.ItemStack spill96_7;
    net.minecraft.nbt.NBTTagList spill96_8;
    long life3_3;
    int life5_5;
    java.lang.Object life6_14;
    net.minecraft.client.gui.GuiScreen life8_38;
    moom.hn life7_52;
    moom.v8 life6_61;
    net.minecraft.item.ItemStack life7_83;
    net.minecraft.item.Item life8_97;
    com.moon.scripting.api.types.Item life9_101;
    net.minecraft.item.Item life11_143;
    moom.wU life10_154;
    net.minecraft.item.ItemPotion life10_171;
    java.util.List life11_175;
    java.util.ArrayList life12_179;
    java.util.Iterator life13_182;
    net.minecraft.potion.PotionEffect life14_189;
    net.minecraft.potion.Potion life15_194;
    com.moon.scripting.api.types.Potion life16_198;
    net.minecraft.nbt.NBTTagList life10_243;
    int life11_253;
    com.moon.scripting.api.types.Enchantment[] life12_256;
    int life13_258;
    com.moon.scripting.api.types.Enchantment life14_265;
    net.minecraft.nbt.NBTTagCompound life15_269;
    int life16_277;
    int life17_285;
    lexical_join_267: {
    lexical_join_264: {
    lexical_join_215: {
    lexical_join_208: {
    lexical_join_207: {
    lexical_join_200: {
    lexical_join_137: {
    lexical_join_130: {
    lexical_join_71: {
    lexical_join_70: {
    lexical_join_62: {
    lexical_join_58: {
    lexical_join_52: {
    lexical_join_48: {
    lexical_join_44: {
    lexical_join_42: {
    lexical_join_38: {
    lexical_join_28: {
    lexical_join_25: {
    lexical_join_11: {
    life3_3 = (com.moon.j1.b ^ 37507346234720L);
    life5_5 = ((com.moon.j2.b()) ? 1 : 0);
    if (!((((net.minecraft.client.Minecraft)(com.moon.j1.a)).K == null))) {
        break lexical_join_11;
    }
    return null;
    }
    life6_14 = null;
    spill96_0 = p0;
    spill96_1 = ((moom.v8)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.j1.a)).K)).bF)).c;
    if (!((life5_5 != 0))) {
        lexicalValue96_28_0 = spill96_0;
        lexicalValue96_28_1 = spill96_1;
        break lexical_join_28;
    }
    if (!((spill96_0 == spill96_1))) {
        break lexical_join_25;
    }
    return ((com.moon.j1)(this)).get_item(((int)(p1)));
    }
    lexicalValue96_28_0 = p0;
    lexicalValue96_28_1 = ((com.moon.j1)(this)).upper_container_id();
    }
    if (!((lexicalValue96_28_0 == lexicalValue96_28_1))) {
        break lexical_join_48;
    }
    life8_38 = ((net.minecraft.client.Minecraft)(com.moon.j1.a)).P;
    spill96_2 = life8_38;
    if (!((life5_5 != 0))) {
        lexicalValue96_38_0 = spill96_2;
        break lexical_join_38;
    }
    if (!((((spill96_2 instanceof moom.hn) ? 1 : 0) != 0))) {
        break lexical_join_42;
    }
    lexicalValue96_38_0 = life8_38;
    }
    life7_52 = ((moom.hn)(lexicalValue96_38_0));
    if (!((life5_5 == 0))) {
        break lexical_join_44;
    }
    }
    return null;
    }
    life6_61 = ((moom.hn)(life7_52)).z;
    break lexical_join_52;
    }
    return ((com.moon.j1)(this)).get_item(((int)(p1)));
    }
    spill96_3 = life6_61;
    if (!((life5_5 != 0))) {
        lexicalValue96_62_0 = spill96_3;
        break lexical_join_62;
    }
    if (!((spill96_3 == null))) {
        break lexical_join_58;
    }
    return null;
    }
    lexicalValue96_62_0 = ((java.util.List)(((moom.v8)(life6_61)).a)).get(((int)(p1)));
    }
    life7_83 = ((net.minecraft.item.ItemStack)(lexicalValue96_62_0));
    spill96_4 = life7_83;
    if (!((life5_5 != 0))) {
        lexicalValue96_71_0 = spill96_4;
        break lexical_join_71;
    }
    if (!((spill96_4 == null))) {
        break lexical_join_70;
    }
    return null;
    }
    lexicalValue96_71_0 = life7_83;
    }
    life8_97 = ((net.minecraft.item.ItemStack)(lexicalValue96_71_0)).a__wQ();
    life9_101 = new com.moon.scripting.api.types.Item();
    ((com.moon.scripting.api.types.Item)(life9_101)).name = ((java.lang.String)(((net.minecraft.item.Item)(life8_97)).a__String()));
    ((com.moon.scripting.api.types.Item)(life9_101)).display_name = ((java.lang.String)(((net.minecraft.item.ItemStack)(life7_83)).b__String()));
    ((com.moon.scripting.api.types.Item)(life9_101)).max_stack_size = ((int)(((net.minecraft.item.Item)(life8_97)).a()));
    ((com.moon.scripting.api.types.Item)(life9_101)).max_damage = ((int)(((net.minecraft.item.Item)(life8_97)).b()));
    ((com.moon.scripting.api.types.Item)(life9_101)).stack_size = ((int)(((net.minecraft.item.ItemStack)(life7_83)).b));
    ((com.moon.scripting.api.types.Item)(life9_101)).damage = ((int)(((net.minecraft.item.ItemStack)(life7_83)).b()));
    ((com.moon.scripting.api.types.Item)(life9_101)).potions = ((com.moon.scripting.api.types.Potion[])(new com.moon.scripting.api.types.Potion[0]));
    ((com.moon.scripting.api.types.Item)(life9_101)).solid = ((boolean)(false));
    spill96_5 = life7_83;
    if (!((life5_5 != 0))) {
        lexicalValue96_208_0 = spill96_5;
        break lexical_join_208;
    }
    if (!((((net.minecraft.item.ItemStack)(spill96_5)).a__wQ() != null))) {
        break lexical_join_207;
    }
    life11_143 = ((net.minecraft.item.ItemStack)(life7_83)).a__wQ();
    spill96_6 = ((life11_143 instanceof moom.wU) ? 1 : 0);
    if (!((life5_5 != 0))) {
        lexicalValue96_137_0 = spill96_6;
        break lexical_join_137;
    }
    if (!((spill96_6 != 0))) {
        break lexical_join_130;
    }
    life10_154 = ((moom.wU)(life11_143));
    ((com.moon.scripting.api.types.Item)(life9_101)).solid = ((boolean)(((moom.fn)(((net.minecraft.block.Block)(((moom.wU)(life10_154)).a__ch())).a__fn())).b__Boolean()));
    }
    spill96_7 = life7_83;
    if (!((life5_5 != 0))) {
        lexicalValue96_208_0 = spill96_7;
        break lexical_join_208;
    }
    life11_143 = ((net.minecraft.item.ItemStack)(spill96_7)).a__wQ();
    lexicalValue96_137_0 = ((life11_143 instanceof net.minecraft.item.ItemPotion) ? 1 : 0);
    }
    if (!((lexicalValue96_137_0 != 0))) {
        break lexical_join_207;
    }
    life10_171 = ((net.minecraft.item.ItemPotion)(life11_143));
    life11_175 = ((net.minecraft.item.ItemPotion)(life10_171)).a__List(((net.minecraft.item.ItemStack)(life7_83)));
    life12_179 = new java.util.ArrayList();
    life13_182 = ((java.util.List)(life11_175)).iterator();
    lexical_cycle_152: while (true) {
    if (!(((java.util.Iterator)(life13_182)).hasNext())) {
        break lexical_join_200;
    }
    life14_189 = ((net.minecraft.potion.PotionEffect)(((java.util.Iterator)(life13_182)).next()));
    life15_194 = (net.minecraft.potion.Potion.a)[((net.minecraft.potion.PotionEffect)(life14_189)).a()];
    life16_198 = new com.moon.scripting.api.types.Potion();
    ((com.moon.scripting.api.types.Potion)(life16_198)).id = ((int)(((net.minecraft.potion.PotionEffect)(life14_189)).a()));
    ((com.moon.scripting.api.types.Potion)(life16_198)).amplifier = ((int)(((net.minecraft.potion.PotionEffect)(life14_189)).c()));
    ((com.moon.scripting.api.types.Potion)(life16_198)).duration = ((int)(((net.minecraft.potion.PotionEffect)(life14_189)).b()));
    ((com.moon.scripting.api.types.Potion)(life16_198)).color = ((int)(((net.minecraft.potion.Potion)(life15_194)).c()));
    ((com.moon.scripting.api.types.Potion)(life16_198)).name = ((java.lang.String)(((net.minecraft.potion.Potion)(life15_194)).a__String()));
    ((com.moon.scripting.api.types.Potion)(life16_198)).bad_effect = ((boolean)(((net.minecraft.potion.Potion)(life15_194)).c__Boolean()));
    ((java.util.List)(life12_179)).add(((java.lang.Object)(life16_198)));
    if (!((life5_5 != 0))) {
        break lexical_join_207;
    }
    if (!((life5_5 == 0))) { continue lexical_cycle_152; }
    break lexical_cycle_152;
    }
    }
    ((com.moon.scripting.api.types.Item)(life9_101)).potions = ((com.moon.scripting.api.types.Potion[])(((com.moon.scripting.api.types.Potion[])(((java.util.List)(life12_179)).toArray(((java.lang.Object[])(new com.moon.scripting.api.types.Potion[0])))))));
    }
    lexicalValue96_208_0 = life7_83;
    }
    life10_243 = ((net.minecraft.item.ItemStack)(lexicalValue96_208_0)).a__yz();
    spill96_8 = life10_243;
    if (!((life5_5 != 0))) {
        lexicalValue96_215_0 = spill96_8;
        break lexical_join_215;
    }
    if (!((spill96_8 != null))) {
        break lexical_join_267;
    }
    lexicalValue96_215_0 = life10_243;
    }
    life11_253 = ((net.minecraft.nbt.NBTTagList)(lexicalValue96_215_0)).a__Int();
    life12_256 = new com.moon.scripting.api.types.Enchantment[life11_253];
    life13_258 = 0;
    lexical_cycle_222: while (true) {
    if (!((life13_258 < life11_253))) {
        break lexical_join_264;
    }
    life14_265 = new com.moon.scripting.api.types.Enchantment();
    life15_269 = ((net.minecraft.nbt.NBTTagList)(life10_243)).a__yw(((int)(life13_258)));
    life16_277 = ((net.minecraft.nbt.NBTTagCompound)(life15_269)).a__Short(((java.lang.String)(__sourceIntrinsic_ae04db786409_invokedynamic96_72(22629, (2188364270739828881L ^ life3_3)))));
    life17_285 = ((net.minecraft.nbt.NBTTagCompound)(life15_269)).a__Short(((java.lang.String)(__sourceIntrinsic_ae04db786409_invokedynamic96_74(14937, (183371861749486245L ^ life3_3)))));
    ((com.moon.scripting.api.types.Enchantment)(life14_265)).id = ((int)(life16_277));
    ((com.moon.scripting.api.types.Enchantment)(life14_265)).level = ((int)(life17_285));
    (life12_256)[life13_258] = life14_265;
    life13_258 += 1;
    if (!((life5_5 != 0))) {
        break lexical_join_267;
    }
    if (!((life5_5 == 0))) { continue lexical_cycle_222; }
    break lexical_cycle_222;
    }
    }
    ((com.moon.scripting.api.types.Item)(life9_101)).enchantments = ((com.moon.scripting.api.types.Enchantment[])(life12_256));
    }
    return life9_101;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral1715_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_755b80cb8baf_invokedynamic80_7(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_755b80cb8baf_invokedynamic80_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_d78b464d2128_invokedynamic437_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_d78b464d2128_invokedynamic437_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_d78b464d2128_invokedynamic437_10(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_d78b464d2128_invokedynamic437_12(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_d78b464d2128_invokedynamic437_14(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_d78b464d2128_invokedynamic437_16(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_d78b464d2128_invokedynamic437_18(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_d78b464d2128_invokedynamic437_23(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_d78b464d2128_invokedynamic437_25(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_bc3012b62db8_invokedynamic95_64(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_bc3012b62db8_invokedynamic95_66(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ae04db786409_invokedynamic96_72(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ae04db786409_invokedynamic96_74(int a0, long a1) throws E;
}
