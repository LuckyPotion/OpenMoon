package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class nH {

private final com.moon.module.impl.InventoryManager a;

private final net.minecraft.client.Minecraft b;

private static final long c;

private static final java.lang.String[] d;

private static final java.lang.String[] e;

private static final java.util.Map f;

private static final long[] g;

private static final java.lang.Integer[] h;

private static final java.util.Map i;

public nH(com.moon.module.impl.InventoryManager p0) {
super();
    this.a = p0;
    this.b = net.minecraft.client.Minecraft.a__fM();
}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(-6033484525209471328L)), ((long)(7304519466436385212L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(158001716119635L)))));
    f = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (com.moon.nH.c ^ 15999639965066L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill305_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill305_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill305_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill305_14 = new byte[8];
    (__sourceSpill305_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill305_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation305_16 = __sourceSpill305_14;
    ((javax.crypto.Cipher)(__sourceSpill305_11)).init(((int)(__sourceSpill305_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill305_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation305_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local20_life19 = new java.lang.String[2];
    int local18_life20 = 0;
    java.lang.String local17_life21;
    int local19_life23 = ((java.lang.String)((local17_life21 = "§Kq¶\0131Éj=\"cÒ\020ñöãjK¿£>Cz8âe"))).length();
    int local16_life24 = 16;
    int local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill305_28 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill305_29 = local13_life9;
        byte[] local21_life31 = ((javax.crypto.Cipher)(__sourceSpill305_29)).doFinal(((byte[])(__sourceSpill305_28)));
        java.lang.String __sourceSpill305_34 = ((java.lang.String)(com.moon.nH.a(((byte[])(local21_life31))))).intern();
        java.lang.String[] __sourceSpill305_35 = local20_life19;
        int __sourceSpill305_36 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill305_35)[__sourceSpill305_36] = __sourceSpill305_34;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    d = ((java.lang.String[])(local20_life19));
    e = ((java.lang.String[])(new java.lang.String[2]));
    i = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life42;
    javax.crypto.Cipher __sourceSpill305_44 = (local0_life42 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill305_45 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill305_46 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill305_47 = new byte[8];
    (__sourceSpill305_47)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life48 = 1;
    while ((local1_life48 < 8)) {
        (__sourceSpill305_47)[local1_life48] = ((byte) ((int) ((local11_life7 << (local1_life48 * 8)) >>> 56)));
        local1_life48 += 1;
    }
    byte[] __sourcePreallocation305_49 = __sourceSpill305_47;
    ((javax.crypto.Cipher)(__sourceSpill305_44)).init(((int)(__sourceSpill305_45)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill305_46)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation305_49)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life52 = new long[9];
    int local3_life53 = 0;
    java.lang.String local4_life54;
    int local5_life56 = ((java.lang.String)((local4_life54 = "Í\031±\027ú\027JLÆ{p\023«ÓÊ\013£a}0²·0µ\004\007OÁ\032°®û\023]>\030\n@4ú\036áÜ|©¾¼"))).length();
    int local2_life57 = 0;
    do {
        java.lang.String __sourceSpill305_58 = local4_life54;
        int __sourceSpill305_59 = local2_life57;
        local2_life57 += 8;
        byte[] local7_life62 = ((java.lang.String)(((java.lang.String)(__sourceSpill305_58)).substring(((int)(__sourceSpill305_59)), ((int)(local2_life57))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill305_63 = local6_life52;
        int __sourceSpill305_64 = local3_life53;
        local3_life53 += 1;
        long local8_life65 = (((((((((((long) (local7_life62)[0]) & 255L) << 56) | ((((long) (local7_life62)[1]) & 255L) << 48)) | ((((long) (local7_life62)[2]) & 255L) << 40)) | ((((long) (local7_life62)[3]) & 255L) << 32)) | ((((long) (local7_life62)[4]) & 255L) << 24)) | ((((long) (local7_life62)[5]) & 255L) << 16)) | ((((long) (local7_life62)[6]) & 255L) << 8)) | (((long) (local7_life62)[7]) & 255L));
        byte[] __sourceSpill305_66 = new byte[8];
        (__sourceSpill305_66)[0] = ((byte) ((int) (local8_life65 >>> 56)));
        (__sourceSpill305_66)[1] = ((byte) ((int) (local8_life65 >>> 48)));
        (__sourceSpill305_66)[2] = ((byte) ((int) (local8_life65 >>> 40)));
        (__sourceSpill305_66)[3] = ((byte) ((int) (local8_life65 >>> 32)));
        (__sourceSpill305_66)[4] = ((byte) ((int) (local8_life65 >>> 24)));
        (__sourceSpill305_66)[5] = ((byte) ((int) (local8_life65 >>> 16)));
        (__sourceSpill305_66)[6] = ((byte) ((int) (local8_life65 >>> 8)));
        (__sourceSpill305_66)[7] = ((byte) ((int) local8_life65));
        javax.crypto.Cipher __sourceSpill305_67 = local0_life42;
        byte[] local10_life69 = ((javax.crypto.Cipher)(__sourceSpill305_67)).doFinal(((byte[])(__sourceSpill305_66)));
        (__sourceSpill305_63)[__sourceSpill305_64] = (((((((((((long) (local10_life69)[0]) & 255L) << 56) | ((((long) (local10_life69)[1]) & 255L) << 48)) | ((((long) (local10_life69)[2]) & 255L) << 40)) | ((((long) (local10_life69)[3]) & 255L) << 32)) | ((((long) (local10_life69)[4]) & 255L) << 24)) | ((((long) (local10_life69)[5]) & 255L) << 16)) | ((((long) (local10_life69)[6]) & 255L) << 8)) | (((long) (local10_life69)[7]) & 255L));
    } while ((!(local2_life57 >= local5_life56)));
    local5_life56 = ((java.lang.String)((local4_life54 = "`UÃxóµTü#\0042Tød\022"))).length();
    local2_life57 = 0;
    do {
        java.lang.String __sourceSpill305_71 = local4_life54;
        int __sourceSpill305_72 = local2_life57;
        local2_life57 += 8;
        byte[] local7_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill305_71)).substring(((int)(__sourceSpill305_72)), ((int)(local2_life57))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill305_76 = local6_life52;
        int __sourceSpill305_77 = local3_life53;
        local3_life53 += 1;
        long local8_life78 = (((((((((((long) (local7_life75)[0]) & 255L) << 56) | ((((long) (local7_life75)[1]) & 255L) << 48)) | ((((long) (local7_life75)[2]) & 255L) << 40)) | ((((long) (local7_life75)[3]) & 255L) << 32)) | ((((long) (local7_life75)[4]) & 255L) << 24)) | ((((long) (local7_life75)[5]) & 255L) << 16)) | ((((long) (local7_life75)[6]) & 255L) << 8)) | (((long) (local7_life75)[7]) & 255L));
        byte[] __sourceSpill305_79 = new byte[8];
        (__sourceSpill305_79)[0] = ((byte) ((int) (local8_life78 >>> 56)));
        (__sourceSpill305_79)[1] = ((byte) ((int) (local8_life78 >>> 48)));
        (__sourceSpill305_79)[2] = ((byte) ((int) (local8_life78 >>> 40)));
        (__sourceSpill305_79)[3] = ((byte) ((int) (local8_life78 >>> 32)));
        (__sourceSpill305_79)[4] = ((byte) ((int) (local8_life78 >>> 24)));
        (__sourceSpill305_79)[5] = ((byte) ((int) (local8_life78 >>> 16)));
        (__sourceSpill305_79)[6] = ((byte) ((int) (local8_life78 >>> 8)));
        (__sourceSpill305_79)[7] = ((byte) ((int) local8_life78));
        javax.crypto.Cipher __sourceSpill305_80 = local0_life42;
        byte[] local10_life82 = ((javax.crypto.Cipher)(__sourceSpill305_80)).doFinal(((byte[])(__sourceSpill305_79)));
        (__sourceSpill305_76)[__sourceSpill305_77] = (((((((((((long) (local10_life82)[0]) & 255L) << 56) | ((((long) (local10_life82)[1]) & 255L) << 48)) | ((((long) (local10_life82)[2]) & 255L) << 40)) | ((((long) (local10_life82)[3]) & 255L) << 32)) | ((((long) (local10_life82)[4]) & 255L) << 24)) | ((((long) (local10_life82)[5]) & 255L) << 16)) | ((((long) (local10_life82)[6]) & 255L) << 8)) | (((long) (local10_life82)[7]) & 255L));
    } while ((!(local2_life57 >= local5_life56)));
    g = ((long[])(local6_life52));
    h = ((java.lang.Integer[])(new java.lang.Integer[9]));
}


public int i() {
int lexicalValue286_29_0;
    int lexicalValue286_31_0;
    boolean spill286_0;
    boolean spill286_1;
    long life1_3;
    java.util.Iterator life4_8;
    int life3_9;
    moom.wB life5_16;
    lexical_join_31: {
    lexical_join_30: {
    lexical_join_29: {
    lexical_join_27: {
    life1_3 = (com.moon.nH.c ^ 70677530341909L);
    spill286_0 = com.moon.aO.b__Boolean();
    life4_8 = ((java.util.ArrayList)(((com.moon.nH)(this)).a__ArrayList())).iterator();
    life3_9 = ((spill286_0) ? 1 : 0);
    lexical_cycle_10: while (true) {
    if (!(((java.util.Iterator)(life4_8)).hasNext())) {
        break lexical_join_30;
    }
    life5_16 = ((moom.wB)(((java.util.Iterator)(life4_8)).next()));
    spill286_1 = this.a(((moom.wB)(life5_16)));
    if (!((life3_9 == 0))) {
        lexicalValue286_31_0 = ((spill286_1) ? 1 : 0);
        break lexical_join_31;
    }
    if (!((life3_9 == 0))) {
        lexicalValue286_29_0 = ((spill286_1) ? 1 : 0);
        break lexical_join_29;
    }
    if (!((!spill286_1))) {
        break lexical_join_27;
    }
    if (!((life3_9 != 0))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    lexicalValue286_29_0 = ((moom.wB)(life5_16)).c;
    }
    return lexicalValue286_29_0;
    }
    lexicalValue286_31_0 = -1;
    }
    return lexicalValue286_31_0;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral2863_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/nH"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private double b(net.minecraft.item.ItemStack p0) {
net.minecraft.item.ItemStack forestValue140_11_0;
    net.minecraft.item.ItemStack forestValue140_18_0;
    net.minecraft.item.ItemStack spill140_0;
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
    life2_3 = (com.moon.nH.c ^ 78257738877201L);
    life4_5 = ((com.moon.aO.b__Boolean()) ? 1 : 0);
    spill140_0 = p0;
    if (!((life4_5 == 0))) {
        forestValue140_11_0 = spill140_0;
        break forest_join_11;
    }
    if (!((spill140_0 != null))) {
        break forest_join_15;
    }
    forestValue140_11_0 = p0;
    }
    if (!((life4_5 == 0))) {
        forestValue140_18_0 = forestValue140_11_0;
        break forest_join_18;
    }
    if (!((!((net.minecraft.item.ItemStack)(forestValue140_11_0)).i()))) {
        break forest_join_17;
    }
    }
    return 0x0.0p0d;
    }
    forestValue140_18_0 = p0;
    }
    life5_21 = ((net.minecraft.item.ItemStack)(forestValue140_18_0)).a__yz();
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
    life10_45 = ((net.minecraft.nbt.NBTTagCompound)(life9_37)).a__Short(((java.lang.String)(__sourceIntrinsic_db39cebc37bf_invokedynamic140_7(22987, (5903317003507510215L ^ life2_3)))));
    if (!((life4_5 == 0))) {
        break forest_join_59;
    }
    switch (((int)(((net.minecraft.nbt.NBTTagCompound)(life9_37)).a__Short(((java.lang.String)(__sourceIntrinsic_db39cebc37bf_invokedynamic140_9(5720, (6725908620819424341L ^ life2_3)))))))) {
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
    if (!((life4_5 != 0))) {
        break forest_join_86;
    }
    }
    life6_27 = (life6_27 + (0x1.4p0d * ((double) life10_45)));
    if (!((life4_5 != 0))) {
        break forest_join_86;
    }
    }
    life6_27 = (life6_27 + (0x1.0p-1d * ((double) life10_45)));
    if (!((life4_5 != 0))) {
        break forest_join_86;
    }
    }
    life6_27 = (life6_27 + (0x1.999999999999ap-3d * ((double) life10_45)));
    }
    life8_29 += 1;
    if (!((life4_5 != 0))) {
        continue forest_cycle_28;
    }
    break forest_cycle_28;
    }
    }
    return life6_27;
}


public int b(int p0) {
net.minecraft.item.ItemStack lexicalValue105_29_0;
    net.minecraft.item.Item lexicalValue105_37_0;
    int lexicalValue105_68_0;
    int lexicalValue105_78_0;
    int lexicalValue105_83_0;
    int lexicalValue105_83_1;
    int lexicalValue105_86_0;
    int lexicalValue105_88_0;
    boolean spill105_0;
    net.minecraft.item.ItemStack spill105_1;
    net.minecraft.item.Item spill105_2;
    boolean spill105_3;
    int spill105_4;
    int spill105_5;
    int spill105_6;
    long life2_3;
    double life5_5;
    int life7_8;
    java.util.Iterator life8_12;
    int life4_13;
    moom.wB life9_20;
    net.minecraft.item.ItemStack life10_23;
    net.minecraft.item.Item life12_33;
    net.minecraft.item.ItemArmor life11_44;
    double life12_57;
    lexical_join_93: {
    life2_3 = (com.moon.nH.c ^ 89258591110448L);
    life5_5 = __sourceIntrinsic_ead3c349e325_exactNonfiniteDoubleLiteral105_1();
    spill105_0 = com.moon.aO.b__Boolean();
    life7_8 = -1;
    life8_12 = ((java.util.ArrayList)(((com.moon.nH)(this)).a__ArrayList())).iterator();
    life4_13 = ((spill105_0) ? 1 : 0);
    lexical_cycle_14: while (true) {
    lexical_join_88: {
    lexical_join_87: {
    lexical_join_86: {
    lexical_join_83: {
    lexical_join_78: {
    lexical_join_76: {
    lexical_join_68: {
    lexical_join_45: {
    lexical_join_37: {
    lexical_join_29: {
    if (!(((java.util.Iterator)(life8_12)).hasNext())) {
        break lexical_join_93;
    }
    life9_20 = ((moom.wB)(((java.util.Iterator)(life8_12)).next()));
    life10_23 = ((moom.wB)(life9_20)).a__xW();
    spill105_1 = life10_23;
    if (!((life4_13 == 0))) {
        lexicalValue105_29_0 = spill105_1;
        break lexical_join_29;
    }
    if (!((spill105_1 != null))) { continue lexical_cycle_14; }
    lexicalValue105_29_0 = life10_23;
    }
    life12_33 = ((net.minecraft.item.ItemStack)(lexicalValue105_29_0)).a__wQ();
    spill105_2 = life12_33;
    if (!((life4_13 == 0))) {
        lexicalValue105_37_0 = spill105_2;
        break lexical_join_37;
    }
    if (!((((spill105_2 instanceof net.minecraft.item.ItemArmor) ? 1 : 0) != 0))) { continue lexical_cycle_14; }
    lexicalValue105_37_0 = life12_33;
    }
    life11_44 = ((net.minecraft.item.ItemArmor)(lexicalValue105_37_0));
    if (!((((net.minecraft.item.ItemArmor)(life11_44)).q != p0))) {
        break lexical_join_45;
    }
    if (!((life4_13 != 0))) { continue lexical_cycle_14; }
    }
    life12_57 = this.a(((net.minecraft.item.ItemStack)(life10_23)));
    spill105_3 = java.lang.Double.isNaN(((double)(life5_5)));
    if (!((life4_13 == 0))) {
        lexicalValue105_78_0 = ((spill105_3) ? 1 : 0);
        break lexical_join_78;
    }
    if (!((!spill105_3))) {
        break lexical_join_76;
    }
    spill105_4 = recovery.source.CarrierOps.dcmpg(((double)(life12_57)), ((double)(life5_5)));
    if (!((life4_13 == 0))) {
        lexicalValue105_78_0 = spill105_4;
        break lexical_join_78;
    }
    if (!((spill105_4 <= 0))) {
        break lexical_join_76;
    }
    spill105_5 = recovery.source.CarrierOps.dcmpl(((double)(life12_57)), ((double)(life5_5)));
    if (!((life4_13 == 0))) {
        lexicalValue105_68_0 = spill105_5;
        break lexical_join_68;
    }
    if (!((spill105_5 == 0))) { continue lexical_cycle_14; }
    lexicalValue105_68_0 = ((moom.wB)(life9_20)).c;
    }
    spill105_6 = (p0 + 5);
    if (!((life4_13 == 0))) {
        lexicalValue105_83_0 = lexicalValue105_68_0;
        lexicalValue105_83_1 = spill105_6;
        break lexical_join_83;
    }
    if (!((lexicalValue105_68_0 != spill105_6))) {
        break lexical_join_76;
    }
    if (!((life4_13 != 0))) { continue lexical_cycle_14; }
    }
    lexicalValue105_78_0 = ((moom.wB)(life9_20)).c;
    }
    if (!((life4_13 == 0))) {
        lexicalValue105_86_0 = lexicalValue105_78_0;
        break lexical_join_86;
    }
    lexicalValue105_83_0 = lexicalValue105_78_0;
    lexicalValue105_83_1 = (p0 + 5);
    }
    if (!((lexicalValue105_83_0 != lexicalValue105_83_1))) {
        break lexical_join_87;
    }
    lexicalValue105_86_0 = ((moom.wB)(life9_20)).c;
    }
    lexicalValue105_88_0 = lexicalValue105_86_0;
    break lexical_join_88;
    }
    lexicalValue105_88_0 = -1;
    }
    life7_8 = lexicalValue105_88_0;
    life5_5 = life12_57;
    if (!((life4_13 != 0))) { continue lexical_cycle_14; }
    break lexical_cycle_14;
    }
    }
    return life7_8;
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.nH.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 7038;
      if (h[var3] == null) {
         byte[] var4 = new byte[]{
            (byte)(p1 >>> 56),
            (byte)(p1 >>> 48),
            (byte)(p1 >>> 40),
            (byte)(p1 >>> 32),
            (byte)(p1 >>> 24),
            (byte)(p1 >>> 16),
            (byte)(p1 >>> 8),
            (byte)p1
         };
         long var5 = g[var3];
         byte[] var7 = new byte[]{
            (byte)(var5 >>> 56),
            (byte)(var5 >>> 48),
            (byte)(var5 >>> 40),
            (byte)(var5 >>> 32),
            (byte)(var5 >>> 24),
            (byte)(var5 >>> 16),
            (byte)(var5 >>> 8),
            (byte)var5
         };
         Long var8 = Thread.currentThread().getId();
         Object[] var9 = (Object[])i.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               i.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/moon/nH", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         h[var3] = var15;
      }

      return h[var3];
}


private void b__Void() {
com.moon.nH forwardValue1038_15_0;
    com.moon.nH spill1038_0;
    long life1_3;
    int life3_5;
    forward_join_27: {
    forward_join_15: {
    life1_3 = (com.moon.nH.c ^ 63308332675599L);
    life3_5 = ((com.moon.aO.b__Boolean()) ? 1 : 0);
    spill1038_0 = this;
    if (!((life3_5 == 0))) {
        forwardValue1038_15_0 = spill1038_0;
        break forward_join_15;
    }
    if (!((((com.moon.setting.ModeSetting)(((com.moon.module.impl.InventoryManager)(((com.moon.nH)(spill1038_0)).a)).s)).getValue() == com.moon.bB.SPOOF))) {
        break forward_join_27;
    }
    forwardValue1038_15_0 = this;
    }
    ((net.minecraft.client.network.NetHandlerPlayClient)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(((com.moon.nH)(forwardValue1038_15_0)).b)).K)).cm)).a(((moom.yK)(new moom.zg(((moom.v8)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(this.b)).K)).bF)).c))));
    }
    return;
}


public void b(int p0, int p1) {
((com.moon.nH)(this)).a__Void();
    ((moom.jI)(((net.minecraft.client.Minecraft)(this.b)).F)).a(((int)(p0)), ((int)(p1)), ((int)(0)), ((int)(1)), ((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.client.Minecraft)(this.b)).K)));
    ((com.moon.nH)(this)).b__Void();
    return;
}


public int b() {
return this.a(((java.util.function.Predicate)(__sourceIntrinsic_e1958f95391c_originalDynamicSite569_0())), ((int)(1)));
}


public int e() {
net.minecraft.item.ItemStack lexicalValue107_29_0;
    int lexicalValue107_63_0;
    int lexicalValue107_71_0;
    int lexicalValue107_74_0;
    int lexicalValue107_74_1;
    int lexicalValue107_77_0;
    int lexicalValue107_79_0;
    boolean spill107_0;
    net.minecraft.item.ItemStack spill107_1;
    boolean spill107_2;
    int spill107_3;
    int spill107_4;
    int spill107_5;
    long life1_3;
    double life4_6;
    int life3_7;
    int life6_9;
    java.util.Iterator life7_13;
    moom.wB life8_20;
    net.minecraft.item.ItemStack life9_23;
    double life10_43;
    int life12_49;
    lexical_join_84: {
    life1_3 = (com.moon.nH.c ^ 76549549553252L);
    spill107_0 = com.moon.aO.b__Boolean();
    life4_6 = __sourceIntrinsic_c4b63a62bb23_exactNonfiniteDoubleLiteral107_2();
    life3_7 = ((spill107_0) ? 1 : 0);
    life6_9 = -1;
    life7_13 = ((java.util.ArrayList)(((com.moon.nH)(this)).a__ArrayList())).iterator();
    lexical_cycle_14: while (true) {
    lexical_join_79: {
    lexical_join_78: {
    lexical_join_77: {
    lexical_join_74: {
    lexical_join_71: {
    lexical_join_69: {
    lexical_join_63: {
    lexical_join_34: {
    lexical_join_29: {
    if (!(((java.util.Iterator)(life7_13)).hasNext())) {
        break lexical_join_84;
    }
    life8_20 = ((moom.wB)(((java.util.Iterator)(life7_13)).next()));
    life9_23 = ((moom.wB)(life8_20)).a__xW();
    spill107_1 = life9_23;
    if (!((life3_7 == 0))) {
        lexicalValue107_29_0 = spill107_1;
        break lexical_join_29;
    }
    if (!((spill107_1 != null))) { continue lexical_cycle_14; }
    lexicalValue107_29_0 = life9_23;
    }
    if (!((((((net.minecraft.item.ItemStack)(lexicalValue107_29_0)).a__wQ() instanceof net.minecraft.item.ItemBow) ? 1 : 0) == 0))) {
        break lexical_join_34;
    }
    if (!((life3_7 != 0))) { continue lexical_cycle_14; }
    }
    life10_43 = this.b(((net.minecraft.item.ItemStack)(life9_23)));
    life12_49 = __sourceIntrinsic_c4b63a62bb23_invokedynamic107_13(11980, (3589622940925041710L ^ life1_3));
    spill107_2 = java.lang.Double.isNaN(((double)(life4_6)));
    if (!((life3_7 == 0))) {
        lexicalValue107_71_0 = ((spill107_2) ? 1 : 0);
        break lexical_join_71;
    }
    if (!((!spill107_2))) {
        break lexical_join_69;
    }
    spill107_3 = recovery.source.CarrierOps.dcmpl(((double)(life10_43)), ((double)(life4_6)));
    if (!((life3_7 == 0))) {
        lexicalValue107_71_0 = spill107_3;
        break lexical_join_71;
    }
    if (!((spill107_3 <= 0))) {
        break lexical_join_69;
    }
    spill107_4 = recovery.source.CarrierOps.dcmpl(((double)(life10_43)), ((double)(life4_6)));
    if (!((life3_7 == 0))) {
        lexicalValue107_63_0 = spill107_4;
        break lexical_join_63;
    }
    if (!((spill107_4 == 0))) { continue lexical_cycle_14; }
    lexicalValue107_63_0 = ((moom.wB)(life8_20)).c;
    }
    spill107_5 = life12_49;
    if (!((life3_7 == 0))) {
        lexicalValue107_74_0 = lexicalValue107_63_0;
        lexicalValue107_74_1 = spill107_5;
        break lexical_join_74;
    }
    if (!((lexicalValue107_63_0 != spill107_5))) {
        break lexical_join_69;
    }
    if (!((life3_7 != 0))) { continue lexical_cycle_14; }
    }
    lexicalValue107_71_0 = ((moom.wB)(life8_20)).c;
    }
    if (!((life3_7 == 0))) {
        lexicalValue107_77_0 = lexicalValue107_71_0;
        break lexical_join_77;
    }
    lexicalValue107_74_0 = lexicalValue107_71_0;
    lexicalValue107_74_1 = life12_49;
    }
    if (!((lexicalValue107_74_0 != lexicalValue107_74_1))) {
        break lexical_join_78;
    }
    lexicalValue107_77_0 = ((moom.wB)(life8_20)).c;
    }
    lexicalValue107_79_0 = lexicalValue107_77_0;
    break lexical_join_79;
    }
    lexicalValue107_79_0 = -1;
    }
    life6_9 = lexicalValue107_79_0;
    life4_6 = life10_43;
    if (!((life3_7 != 0))) { continue lexical_cycle_14; }
    break lexical_cycle_14;
    }
    }
    return life6_9;
}


public int c() {
return this.a(((java.util.function.Predicate)(__sourceIntrinsic_94b06fabf08c_originalDynamicSite570_0())), ((int)(2)));
}


private int h() {
moom.wB lexicalValue285_37_0;
    int lexicalValue285_61_0;
    int lexicalValue285_66_0;
    boolean spill285_0;
    moom.wB spill285_1;
    boolean spill285_2;
    boolean spill285_3;
    long life1_3;
    int life4_5;
    int life5_8;
    int life3_9;
    net.minecraft.item.ItemStack life6_50;
    net.minecraft.item.Item life7_53;
    lexical_join_66: {
    lexical_join_65: {
    life1_3 = (com.moon.nH.c ^ 17364519659887L);
    life4_5 = 0;
    spill285_0 = com.moon.aO.c();
    life5_8 = 0;
    life3_9 = ((spill285_0) ? 1 : 0);
    lexical_cycle_10: while (true) {
    lexical_join_63: {
    lexical_join_62: {
    lexical_join_61: {
    lexical_join_57: {
    lexical_join_37: {
    lexical_join_31: {
    if (!((life5_8 < __sourceIntrinsic_9d7e73b66053_invokedynamic285_3(28172, (2539020883305825248L ^ life1_3))))) {
        break lexical_join_65;
    }
    spill285_1 = ((moom.v8)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(this.b)).K)).bF)).a__wB(((int)(life5_8)));
    if (!((life3_9 != 0))) {
        lexicalValue285_37_0 = spill285_1;
        break lexical_join_37;
    }
    spill285_2 = ((moom.wB)(spill285_1)).a__Boolean();
    if (!((life3_9 != 0))) {
        lexicalValue285_66_0 = ((spill285_2) ? 1 : 0);
        break lexical_join_66;
    }
    if (!((!spill285_2))) {
        break lexical_join_31;
    }
    if (!((life3_9 == 0))) {
        break lexical_join_62;
    }
    }
    lexicalValue285_37_0 = ((moom.v8)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(this.b)).K)).bF)).a__wB(((int)(life5_8)));
    }
    life6_50 = ((moom.wB)(lexicalValue285_37_0)).a__xW();
    life7_53 = ((net.minecraft.item.ItemStack)(life6_50)).a__wQ();
    if (!((life3_9 != 0))) {
        break lexical_join_63;
    }
    if (!((((((net.minecraft.item.ItemStack)(life6_50)).a__wQ() instanceof moom.wU) ? 1 : 0) != 0))) {
        break lexical_join_62;
    }
    spill285_3 = ((net.minecraft.block.Block)(((moom.wU)(((moom.wU)(life7_53)))).a__ch())).a__Boolean();
    if (!((life3_9 != 0))) {
        lexicalValue285_61_0 = ((spill285_3) ? 1 : 0);
        break lexical_join_61;
    }
    if (!((!spill285_3))) {
        break lexical_join_57;
    }
    if (!((life3_9 == 0))) {
        break lexical_join_62;
    }
    }
    lexicalValue285_61_0 = (life4_5 + ((net.minecraft.item.ItemStack)(life6_50)).b);
    }
    life4_5 = lexicalValue285_61_0;
    }
    life5_8 += 1;
    }
    if (!((life3_9 == 0))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    lexicalValue285_66_0 = life4_5;
    }
    return lexicalValue285_66_0;
}


public int f() {
net.minecraft.item.ItemStack lexicalValue108_29_0;
    net.minecraft.item.Item lexicalValue108_37_0;
    int lexicalValue108_66_0;
    int lexicalValue108_78_0;
    int lexicalValue108_85_0;
    int lexicalValue108_85_1;
    int lexicalValue108_88_0;
    int lexicalValue108_90_0;
    boolean spill108_0;
    net.minecraft.item.ItemStack spill108_1;
    net.minecraft.item.Item spill108_2;
    boolean spill108_3;
    int spill108_4;
    int spill108_5;
    int spill108_6;
    long life1_3;
    double life4_5;
    int life6_8;
    java.util.Iterator life7_12;
    int life3_13;
    moom.wB life8_20;
    net.minecraft.item.ItemStack life9_23;
    net.minecraft.item.Item life11_33;
    moom.xP life10_44;
    double life11_52;
    lexical_join_95: {
    life1_3 = (com.moon.nH.c ^ 28953957463086L);
    life4_5 = __sourceIntrinsic_d5f736cb4191_exactNonfiniteDoubleLiteral108_1();
    spill108_0 = com.moon.aO.c();
    life6_8 = -1;
    life7_12 = ((java.util.ArrayList)(((com.moon.nH)(this)).a__ArrayList())).iterator();
    life3_13 = ((spill108_0) ? 1 : 0);
    lexical_cycle_14: while (true) {
    lexical_join_90: {
    lexical_join_89: {
    lexical_join_88: {
    lexical_join_85: {
    lexical_join_78: {
    lexical_join_76: {
    lexical_join_66: {
    lexical_join_37: {
    lexical_join_29: {
    if (!(((java.util.Iterator)(life7_12)).hasNext())) {
        break lexical_join_95;
    }
    life8_20 = ((moom.wB)(((java.util.Iterator)(life7_12)).next()));
    life9_23 = ((moom.wB)(life8_20)).a__xW();
    spill108_1 = life9_23;
    if (!((life3_13 != 0))) {
        lexicalValue108_29_0 = spill108_1;
        break lexical_join_29;
    }
    if (!((spill108_1 != null))) { continue lexical_cycle_14; }
    lexicalValue108_29_0 = life9_23;
    }
    life11_33 = ((net.minecraft.item.ItemStack)(lexicalValue108_29_0)).a__wQ();
    spill108_2 = life11_33;
    if (!((life3_13 != 0))) {
        lexicalValue108_37_0 = spill108_2;
        break lexical_join_37;
    }
    if (!((((spill108_2 instanceof moom.xP) ? 1 : 0) != 0))) { continue lexical_cycle_14; }
    lexicalValue108_37_0 = life11_33;
    }
    life10_44 = ((moom.xP)(lexicalValue108_37_0));
    life11_52 = (((double) ((moom.xP)(life10_44)).a__sourceReturn_bc607678b6()) + this.b(((net.minecraft.item.ItemStack)(life9_23))));
    spill108_3 = java.lang.Double.isNaN(((double)(life4_5)));
    if (!((life3_13 != 0))) {
        lexicalValue108_78_0 = ((spill108_3) ? 1 : 0);
        break lexical_join_78;
    }
    if (!((!spill108_3))) {
        break lexical_join_76;
    }
    spill108_4 = recovery.source.CarrierOps.dcmpl(((double)(life11_52)), ((double)(life4_5)));
    if (!((life3_13 != 0))) {
        lexicalValue108_78_0 = spill108_4;
        break lexical_join_78;
    }
    if (!((spill108_4 <= 0))) {
        break lexical_join_76;
    }
    spill108_5 = recovery.source.CarrierOps.dcmpl(((double)(life11_52)), ((double)(life4_5)));
    if (!((life3_13 != 0))) {
        lexicalValue108_66_0 = spill108_5;
        break lexical_join_66;
    }
    if (!((spill108_5 == 0))) { continue lexical_cycle_14; }
    lexicalValue108_66_0 = ((moom.wB)(life8_20)).c;
    }
    spill108_6 = __sourceIntrinsic_d5f736cb4191_invokedynamic108_20(5070, (7084492412596953957L ^ life1_3));
    if (!((life3_13 != 0))) {
        lexicalValue108_85_0 = lexicalValue108_66_0;
        lexicalValue108_85_1 = spill108_6;
        break lexical_join_85;
    }
    if (!((lexicalValue108_66_0 != spill108_6))) {
        break lexical_join_76;
    }
    if (!((life3_13 == 0))) { continue lexical_cycle_14; }
    }
    lexicalValue108_78_0 = ((moom.wB)(life8_20)).c;
    }
    if (!((life3_13 != 0))) {
        lexicalValue108_88_0 = lexicalValue108_78_0;
        break lexical_join_88;
    }
    lexicalValue108_85_0 = lexicalValue108_78_0;
    lexicalValue108_85_1 = __sourceIntrinsic_d5f736cb4191_invokedynamic108_22(5070, (7084492412596953957L ^ life1_3));
    }
    if (!((lexicalValue108_85_0 != lexicalValue108_85_1))) {
        break lexical_join_89;
    }
    lexicalValue108_88_0 = ((moom.wB)(life8_20)).c;
    }
    lexicalValue108_90_0 = lexicalValue108_88_0;
    break lexical_join_90;
    }
    lexicalValue108_90_0 = -1;
    }
    life6_8 = lexicalValue108_90_0;
    life4_5 = life11_52;
    if (!((life3_13 == 0))) { continue lexical_cycle_14; }
    break lexical_cycle_14;
    }
    }
    return life6_8;
}


public int d() {
net.minecraft.item.ItemStack lexicalValue281_31_0;
    int lexicalValue281_37_0;
    int lexicalValue281_51_0;
    int lexicalValue281_51_1;
    int lexicalValue281_54_0;
    int lexicalValue281_56_0;
    boolean spill281_0;
    net.minecraft.item.ItemStack spill281_1;
    int spill281_2;
    int spill281_3;
    int spill281_4;
    long life1_3;
    int life4_6;
    int life3_7;
    int life5_9;
    java.util.Iterator life6_13;
    moom.wB life7_20;
    net.minecraft.item.ItemStack life8_23;
    lexical_join_62: {
    life1_3 = (com.moon.nH.c ^ 80138128224523L);
    spill281_0 = com.moon.aO.b__Boolean();
    life4_6 = 0;
    life3_7 = ((spill281_0) ? 1 : 0);
    life5_9 = -1;
    life6_13 = ((java.util.ArrayList)(((com.moon.nH)(this)).a__ArrayList())).iterator();
    lexical_cycle_14: while (true) {
    lexical_join_60: {
    lexical_join_56: {
    lexical_join_55: {
    lexical_join_54: {
    lexical_join_51: {
    lexical_join_37: {
    lexical_join_31: {
    lexical_join_30: {
    if (!(((java.util.Iterator)(life6_13)).hasNext())) {
        break lexical_join_62;
    }
    life7_20 = ((moom.wB)(((java.util.Iterator)(life6_13)).next()));
    life8_23 = ((moom.wB)(life7_20)).a__xW();
    spill281_1 = life8_23;
    if (!((life3_7 == 0))) {
        lexicalValue281_31_0 = spill281_1;
        break lexical_join_31;
    }
    if (!((spill281_1 == null))) {
        break lexical_join_30;
    }
    if (!((life3_7 != 0))) { continue lexical_cycle_14; }
    }
    lexicalValue281_31_0 = life8_23;
    }
    spill281_2 = ((((net.minecraft.item.ItemStack)(lexicalValue281_31_0)).a__wQ() instanceof moom.wU) ? 1 : 0);
    if (!((life3_7 == 0))) {
        lexicalValue281_37_0 = spill281_2;
        break lexical_join_37;
    }
    if (!((spill281_2 != 0))) {
        break lexical_join_60;
    }
    lexicalValue281_37_0 = life4_6;
    }
    spill281_3 = ((net.minecraft.item.ItemStack)(life8_23)).b;
    if (!((life3_7 == 0))) {
        lexicalValue281_51_0 = lexicalValue281_37_0;
        lexicalValue281_51_1 = spill281_3;
        break lexical_join_51;
    }
    if (!((lexicalValue281_37_0 <= spill281_3))) {
        break lexical_join_60;
    }
    spill281_4 = ((moom.wB)(life7_20)).c;
    if (!((life3_7 == 0))) {
        lexicalValue281_54_0 = spill281_4;
        break lexical_join_54;
    }
    lexicalValue281_51_0 = spill281_4;
    lexicalValue281_51_1 = __sourceIntrinsic_e0f64934fe3a_invokedynamic281_13(25508, (5326495541426673195L ^ life1_3));
    }
    if (!((lexicalValue281_51_0 != lexicalValue281_51_1))) {
        break lexical_join_55;
    }
    lexicalValue281_54_0 = ((moom.wB)(life7_20)).c;
    }
    lexicalValue281_56_0 = lexicalValue281_54_0;
    break lexical_join_56;
    }
    lexicalValue281_56_0 = -1;
    }
    life5_9 = lexicalValue281_56_0;
    life4_6 = ((net.minecraft.item.ItemStack)(life8_23)).b;
    }
    if (!((life3_7 != 0))) { continue lexical_cycle_14; }
    break lexical_cycle_14;
    }
    }
    return life5_9;
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
        byte[] spill1333_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1333_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1333_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1333_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1333_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1333_2)[life4_9];
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 9445);
    if (((com.moon.nH.e)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.nH.f)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.nH.f)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/nH", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.nH.d)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.nH.e)[life5_8] = com.moon.nH.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.nH.e)[life5_8];
}


public int a() {
return this.a(((java.util.function.Predicate)(__sourceIntrinsic_8aebf151eadb_originalDynamicSite571_0())), ((int)(0)));
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(int p0, boolean p1) {
this.a(((int)(((moom.v8)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(this.b)).K)).bF)).c)), ((int)(p0)), ((boolean)(p1)));
    return;
}


public int a(int p0) {
int forestValue234_14_0;
    int forestValue234_14_1;
    net.minecraft.item.ItemStack forestValue234_32_0;
    int forestValue234_78_0;
    boolean spill234_0;
    net.minecraft.item.ItemStack spill234_1;
    int spill234_2;
    int spill234_3;
    long life2_3;
    int life5_6;
    int life4_7;
    net.minecraft.item.ItemStack[] life6_20;
    net.minecraft.item.ItemStack life7_35;
    net.minecraft.item.Item life9_38;
    net.minecraft.item.ItemPotion life8_47;
    java.util.Iterator life9_59;
    net.minecraft.potion.PotionEffect life10_66;
    forest_join_79: {
    forest_join_78: {
    forest_join_77: {
    life2_3 = (com.moon.nH.c ^ 58820063393046L);
    spill234_0 = com.moon.aO.c();
    life5_6 = 0;
    life4_7 = ((spill234_0) ? 1 : 0);
    forest_cycle_8: while (true) {
    forest_join_74: {
    forest_join_73: {
    forestValue234_14_0 = life5_6;
    forestValue234_14_1 = __sourceIntrinsic_5c51e7cdc795_invokedynamic234_3(27923, (6939183614686026885L ^ life2_3));
    forest_cycle_14: while (true) {
    forest_join_32: {
    forest_join_29: {
    if (!((forestValue234_14_0 <= forestValue234_14_1))) {
        break forest_join_79;
    }
    life6_20 = ((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(this.b)).K)).bD)).a;
    spill234_1 = (life6_20)[life5_6];
    if (!((life4_7 != 0))) {
        forestValue234_32_0 = spill234_1;
        break forest_join_32;
    }
    if (!((spill234_1 == null))) {
        break forest_join_29;
    }
    if (!((life4_7 == 0))) {
        break forest_join_73;
    }
    }
    forestValue234_32_0 = (life6_20)[life5_6];
    }
    life7_35 = forestValue234_32_0;
    life9_38 = ((net.minecraft.item.ItemStack)(life7_35)).a__wQ();
    if (!((life4_7 != 0))) {
        break forest_join_74;
    }
    if (!((((life9_38 instanceof net.minecraft.item.ItemPotion) ? 1 : 0) != 0))) {
        break forest_join_73;
    }
    life8_47 = ((net.minecraft.item.ItemPotion)(life9_38));
    if (!((life4_7 != 0))) {
        break forest_join_74;
    }
    if (!((((net.minecraft.item.ItemPotion)(life8_47)).a__List(((net.minecraft.item.ItemStack)(life7_35))) != null))) {
        break forest_join_73;
    }
    life9_59 = ((java.util.List)(((net.minecraft.item.ItemPotion)(life8_47)).a__List(((net.minecraft.item.ItemStack)(life7_35))))).iterator();
    forest_cycle_55: while (true) {
    forest_join_71: {
    if (!(((java.util.Iterator)(life9_59)).hasNext())) {
        break forest_join_73;
    }
    life10_66 = ((net.minecraft.potion.PotionEffect)(((java.util.Iterator)(life9_59)).next()));
    spill234_2 = ((net.minecraft.potion.PotionEffect)(life10_66)).a();
    if (!((life4_7 != 0))) {
        forestValue234_78_0 = spill234_2;
        break forest_join_78;
    }
    spill234_3 = p0;
    if (!((life4_7 != 0))) {
        forestValue234_14_0 = spill234_2;
        forestValue234_14_1 = spill234_3;
        continue forest_cycle_14;
    }
    if (!((spill234_2 == spill234_3))) {
        break forest_join_71;
    }
    break forest_join_77;
    }
    if (!((life4_7 == 0))) {
        continue forest_cycle_55;
    }
    break forest_cycle_55;
    }
    break forest_cycle_14;
    }
    }
    life5_6 += 1;
    }
    if (!((life4_7 == 0))) {
        continue forest_cycle_8;
    }
    break forest_cycle_8;
    }
    break forest_join_79;
    }
    forestValue234_78_0 = life5_6;
    }
    return forestValue234_78_0;
    }
    return -1;
}


private int a(java.util.function.Predicate<net.minecraft.item.ItemTool> p0, int p1) {
net.minecraft.item.ItemStack lexicalValue104_31_0;
    net.minecraft.item.Item lexicalValue104_39_0;
    int lexicalValue104_93_0;
    int lexicalValue104_101_0;
    int lexicalValue104_104_0;
    int lexicalValue104_104_1;
    int lexicalValue104_107_0;
    int lexicalValue104_109_0;
    boolean spill104_0;
    net.minecraft.item.ItemStack spill104_1;
    net.minecraft.item.Item spill104_2;
    int spill104_3;
    boolean spill104_4;
    int spill104_5;
    int spill104_6;
    int spill104_7;
    long life3_3;
    double life6_5;
    int life8_8;
    java.util.Iterator life9_12;
    int life5_13;
    moom.wB life10_20;
    net.minecraft.item.ItemStack life11_23;
    net.minecraft.item.Item life12_38;
    net.minecraft.item.ItemTool life13_49;
    moom.a4 life14_62;
    double life15_71;
    int life17_85;
    lexical_join_114: {
    life3_3 = (com.moon.nH.c ^ 109589039954067L);
    life6_5 = __sourceIntrinsic_dfa88205c138_exactNonfiniteDoubleLiteral104_1();
    spill104_0 = com.moon.aO.b__Boolean();
    life8_8 = -1;
    life9_12 = ((java.util.ArrayList)(((com.moon.nH)(this)).a__ArrayList())).iterator();
    life5_13 = ((spill104_0) ? 1 : 0);
    lexical_cycle_14: while (true) {
    lexical_join_109: {
    lexical_join_108: {
    lexical_join_107: {
    lexical_join_104: {
    lexical_join_101: {
    lexical_join_99: {
    lexical_join_93: {
    lexical_join_48: {
    lexical_join_39: {
    lexical_join_31: {
    lexical_join_30: {
    if (!(((java.util.Iterator)(life9_12)).hasNext())) {
        break lexical_join_114;
    }
    life10_20 = ((moom.wB)(((java.util.Iterator)(life9_12)).next()));
    life11_23 = ((moom.wB)(life10_20)).a__xW();
    spill104_1 = life11_23;
    if (!((life5_13 == 0))) {
        lexicalValue104_31_0 = spill104_1;
        break lexical_join_31;
    }
    if (!((spill104_1 == null))) {
        break lexical_join_30;
    }
    if (!((life5_13 != 0))) { continue lexical_cycle_14; }
    }
    lexicalValue104_31_0 = life11_23;
    }
    life12_38 = ((net.minecraft.item.ItemStack)(lexicalValue104_31_0)).a__wQ();
    spill104_2 = life12_38;
    if (!((life5_13 == 0))) {
        lexicalValue104_39_0 = spill104_2;
        break lexical_join_39;
    }
    if (!((((spill104_2 instanceof net.minecraft.item.ItemTool) ? 1 : 0) != 0))) { continue lexical_cycle_14; }
    lexicalValue104_39_0 = life12_38;
    }
    life13_49 = ((net.minecraft.item.ItemTool)(lexicalValue104_39_0));
    if (!((!((java.util.function.Predicate)(p0)).test(((java.lang.Object)(((net.minecraft.item.ItemTool)(life12_38)))))))) {
        break lexical_join_48;
    }
    if (!((life5_13 != 0))) { continue lexical_cycle_14; }
    }
    life14_62 = ((net.minecraft.item.ItemTool)(life13_49)).a__a4();
    spill104_3 = 5070;
    life15_71 = (((double) ((moom.a4)(life14_62)).b__Int()) + this.b(((net.minecraft.item.ItemStack)(life11_23))));
    life17_85 = ((__sourceIntrinsic_dfa88205c138_invokedynamic104_18(spill104_3, (7084537897115709400L ^ life3_3)) + ((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.IntegerSetting)(((com.moon.module.impl.InventoryManager)(this.a)).B)).getValue())))).intValue()) + p1);
    spill104_4 = java.lang.Double.isNaN(((double)(life6_5)));
    if (!((life5_13 == 0))) {
        lexicalValue104_101_0 = ((spill104_4) ? 1 : 0);
        break lexical_join_101;
    }
    if (!((!spill104_4))) {
        break lexical_join_99;
    }
    spill104_5 = recovery.source.CarrierOps.dcmpl(((double)(life15_71)), ((double)(life6_5)));
    if (!((life5_13 == 0))) {
        lexicalValue104_101_0 = spill104_5;
        break lexical_join_101;
    }
    if (!((spill104_5 <= 0))) {
        break lexical_join_99;
    }
    spill104_6 = recovery.source.CarrierOps.dcmpl(((double)(life15_71)), ((double)(life6_5)));
    if (!((life5_13 == 0))) {
        lexicalValue104_93_0 = spill104_6;
        break lexical_join_93;
    }
    if (!((spill104_6 == 0))) { continue lexical_cycle_14; }
    lexicalValue104_93_0 = ((moom.wB)(life10_20)).c;
    }
    spill104_7 = life17_85;
    if (!((life5_13 == 0))) {
        lexicalValue104_104_0 = lexicalValue104_93_0;
        lexicalValue104_104_1 = spill104_7;
        break lexical_join_104;
    }
    if (!((lexicalValue104_93_0 != spill104_7))) {
        break lexical_join_99;
    }
    if (!((life5_13 != 0))) { continue lexical_cycle_14; }
    }
    lexicalValue104_101_0 = ((moom.wB)(life10_20)).c;
    }
    if (!((life5_13 == 0))) {
        lexicalValue104_107_0 = lexicalValue104_101_0;
        break lexical_join_107;
    }
    lexicalValue104_104_0 = lexicalValue104_101_0;
    lexicalValue104_104_1 = life17_85;
    }
    if (!((lexicalValue104_104_0 != lexicalValue104_104_1))) {
        break lexical_join_108;
    }
    lexicalValue104_107_0 = ((moom.wB)(life10_20)).c;
    }
    lexicalValue104_109_0 = lexicalValue104_107_0;
    break lexical_join_109;
    }
    lexicalValue104_109_0 = -1;
    }
    life8_8 = lexicalValue104_109_0;
    life6_5 = life15_71;
    if (!((life5_13 != 0))) { continue lexical_cycle_14; }
    break lexical_cycle_14;
    }
    }
    return life8_8;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral2875_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/nH"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.nH.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private double a(net.minecraft.item.ItemStack p0) {
int forwardValue1034_18_0;
    int forwardValue1034_38_0;
    int spill1034_0;
    boolean spill1034_1;
    long life2_3;
    int life4_5;
    float life5_24;
    java.util.Map life6_27;
    int life7_49;
    forward_join_47: {
    forward_join_38: {
    forward_join_18: {
    forward_join_14: {
    life2_3 = (com.moon.nH.c ^ 35452591786163L);
    life4_5 = ((com.moon.aO.c()) ? 1 : 0);
    spill1034_0 = ((((net.minecraft.item.ItemStack)(p0)).a__wQ() instanceof net.minecraft.item.ItemArmor) ? 1 : 0);
    if (!((life4_5 != 0))) {
        forwardValue1034_18_0 = spill1034_0;
        break forward_join_18;
    }
    if (!((spill1034_0 == 0))) {
        break forward_join_14;
    }
    return -0x1.0p0d;
    }
    forwardValue1034_18_0 = ((net.minecraft.item.ItemArmor)(((net.minecraft.item.ItemArmor)(((net.minecraft.item.ItemStack)(p0)).a__wQ())))).r;
    }
    life5_24 = ((float) forwardValue1034_18_0);
    life6_27 = moom.rV.a(((net.minecraft.item.ItemStack)(p0)));
    spill1034_1 = ((java.util.Map)(life6_27)).containsKey(((java.lang.Object)(java.lang.Integer.valueOf(((int)(((net.minecraft.enchantment.Enchantment)(net.minecraft.enchantment.Enchantment.d)).C))))));
    if (!((life4_5 != 0))) {
        forwardValue1034_38_0 = ((spill1034_1) ? 1 : 0);
        break forward_join_38;
    }
    if (!(spill1034_1)) {
        break forward_join_47;
    }
    forwardValue1034_38_0 = ((java.lang.Integer)(((java.lang.Integer)(((java.util.Map)(life6_27)).get(((java.lang.Object)(java.lang.Integer.valueOf(((int)(((net.minecraft.enchantment.Enchantment)(net.minecraft.enchantment.Enchantment.d)).C)))))))))).intValue();
    }
    life7_49 = forwardValue1034_38_0;
    life5_24 = (life5_24 + ((float) ((net.minecraft.enchantment.Enchantment)(net.minecraft.enchantment.Enchantment.d)).a(((int)(life7_49)), ((net.minecraft.util.DamageSource)(net.minecraft.util.DamageSource.k)))));
    }
    return ((double) life5_24);
}


private void a__Void() {
com.moon.nH forwardValue1035_15_0;
    com.moon.nH spill1035_0;
    long life1_3;
    int life3_5;
    forward_join_23: {
    forward_join_15: {
    life1_3 = (com.moon.nH.c ^ 81847585483741L);
    life3_5 = ((com.moon.aO.c()) ? 1 : 0);
    spill1035_0 = this;
    if (!((life3_5 != 0))) {
        forwardValue1035_15_0 = spill1035_0;
        break forward_join_15;
    }
    if (!((((com.moon.setting.ModeSetting)(((com.moon.module.impl.InventoryManager)(((com.moon.nH)(spill1035_0)).a)).s)).getValue() == com.moon.bB.SPOOF))) {
        break forward_join_23;
    }
    forwardValue1035_15_0 = this;
    }
    ((net.minecraft.client.network.NetHandlerPlayClient)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(((com.moon.nH)(forwardValue1035_15_0)).b)).K)).cm)).a(((moom.yK)(new moom.zp(net.minecraft.network.play.client.C16PacketClientStatus$EnumState.OPEN_INVENTORY_ACHIEVEMENT))));
    }
    return;
}


public void a__Void(int p0) {
this.b(((int)(((moom.v8)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(this.b)).K)).bF)).c)), ((int)(p0)));
    return;
}


public void a(int p0, int p1, boolean p2) {
moom.jI forwardValue1031_18_0;
    int forwardValue1031_18_1;
    int forwardValue1031_18_2;
    int forwardValue1031_18_3;
    moom.jI forwardValue1031_19_0;
    int forwardValue1031_19_1;
    int forwardValue1031_19_2;
    moom.jI forwardValue1031_20_0;
    int forwardValue1031_20_1;
    int forwardValue1031_20_2;
    int forwardValue1031_20_3;
    boolean spill1031_0;
    moom.jI spill1031_1;
    int spill1031_2;
    int spill1031_3;
    boolean spill1031_4;
    long life4_3;
    int life6_7;
    forward_join_20: {
    forward_join_19: {
    forward_join_18: {
    life4_3 = (com.moon.nH.c ^ 47739386952224L);
    spill1031_0 = com.moon.aO.b__Boolean();
    ((com.moon.nH)(this)).a__Void();
    life6_7 = ((spill1031_0) ? 1 : 0);
    spill1031_1 = ((net.minecraft.client.Minecraft)(this.b)).F;
    spill1031_2 = p0;
    spill1031_3 = p1;
    spill1031_4 = p2;
    if (!((life6_7 == 0))) {
        forwardValue1031_18_0 = spill1031_1;
        forwardValue1031_18_1 = spill1031_2;
        forwardValue1031_18_2 = spill1031_3;
        forwardValue1031_18_3 = ((spill1031_4) ? 1 : 0);
        break forward_join_18;
    }
    if (!(spill1031_4)) {
        forwardValue1031_19_0 = spill1031_1;
        forwardValue1031_19_1 = spill1031_2;
        forwardValue1031_19_2 = spill1031_3;
        break forward_join_19;
    }
    forwardValue1031_18_0 = spill1031_1;
    forwardValue1031_18_1 = spill1031_2;
    forwardValue1031_18_2 = spill1031_3;
    forwardValue1031_18_3 = 1;
    }
    forwardValue1031_20_0 = forwardValue1031_18_0;
    forwardValue1031_20_1 = forwardValue1031_18_1;
    forwardValue1031_20_2 = forwardValue1031_18_2;
    forwardValue1031_20_3 = forwardValue1031_18_3;
    break forward_join_20;
    }
    forwardValue1031_20_0 = forwardValue1031_19_0;
    forwardValue1031_20_1 = forwardValue1031_19_1;
    forwardValue1031_20_2 = forwardValue1031_19_2;
    forwardValue1031_20_3 = 0;
    }
    ((moom.jI)(forwardValue1031_20_0)).a(((int)(forwardValue1031_20_1)), ((int)(forwardValue1031_20_2)), ((int)(forwardValue1031_20_3)), ((int)(4)), ((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.client.Minecraft)(this.b)).K)));
    ((com.moon.nH)(this)).b__Void();
    return;
}


public void a(int p0, int p1, int p2) {
((com.moon.nH)(this)).a__Void();
    ((moom.jI)(((net.minecraft.client.Minecraft)(this.b)).F)).a(((int)(p0)), ((int)(p2)), ((int)(p1)), ((int)(2)), ((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.client.Minecraft)(this.b)).K)));
    ((com.moon.nH)(this)).b__Void();
    return;
}


public boolean a(moom.wB p0) {
java.lang.Object forestValue235_19_0;
    int forestValue235_28_0;
    net.minecraft.item.ItemStack forestValue235_38_0;
    net.minecraft.item.Item forestValue235_39_0;
    int forestValue235_58_0;
    int forestValue235_58_1;
    int forestValue235_70_0;
    int forestValue235_72_0;
    int forestValue235_79_0;
    int forestValue235_113_0;
    int forestValue235_113_1;
    int forestValue235_121_0;
    int forestValue235_123_0;
    int forestValue235_126_0;
    int forestValue235_157_0;
    int forestValue235_157_1;
    int forestValue235_165_0;
    int forestValue235_167_0;
    int forestValue235_170_0;
    int forestValue235_201_0;
    int forestValue235_201_1;
    int forestValue235_209_0;
    int forestValue235_211_0;
    int forestValue235_218_0;
    int forestValue235_245_0;
    int forestValue235_245_1;
    int forestValue235_253_0;
    int forestValue235_255_0;
    int forestValue235_258_0;
    int forestValue235_279_0;
    int forestValue235_279_1;
    int forestValue235_290_0;
    int forestValue235_292_0;
    int forestValue235_295_0;
    java.util.Iterator forestValue235_307_0;
    int forestValue235_338_0;
    int forestValue235_343_0;
    int forestValue235_367_0;
    int forestValue235_369_0;
    int forestValue235_372_0;
    int forestValue235_381_0;
    int forestValue235_384_0;
    int forestValue235_390_0;
    boolean spill235_0;
    net.minecraft.item.ItemStack spill235_1;
    boolean spill235_2;
    net.minecraft.item.ItemStack spill235_3;
    net.minecraft.item.Item spill235_4;
    int spill235_5;
    int spill235_6;
    int spill235_7;
    int spill235_8;
    int spill235_9;
    int spill235_10;
    int spill235_11;
    int spill235_12;
    int spill235_13;
    int spill235_14;
    int spill235_15;
    int spill235_16;
    int spill235_17;
    int spill235_18;
    int spill235_19;
    int spill235_20;
    int spill235_21;
    int spill235_22;
    int spill235_23;
    int spill235_24;
    int spill235_25;
    int spill235_26;
    int spill235_27;
    int spill235_28;
    int spill235_29;
    int spill235_30;
    int spill235_31;
    java.util.Iterator spill235_32;
    boolean spill235_33;
    int spill235_34;
    boolean spill235_35;
    int spill235_36;
    int spill235_37;
    long life2_3;
    net.minecraft.item.ItemStack life5_7;
    int life4_8;
    net.minecraft.item.Item life6_45;
    int life7_54;
    int life7_105;
    int life8_118;
    int life7_154;
    int life8_169;
    int life7_205;
    int life8_220;
    int life7_267;
    int life8_273;
    net.minecraft.item.ItemArmor life7_309;
    int life8_314;
    net.minecraft.item.ItemPotion life7_353;
    java.util.Iterator life8_358;
    net.minecraft.potion.PotionEffect life9_367;
    int life7_415;
    forest_join_390: {
    forest_join_389: {
    forest_join_387: {
    forest_join_384: {
    forest_join_382: {
    forest_join_381: {
    forest_join_380: {
    forest_join_372: {
    forest_join_370: {
    forest_join_369: {
    forest_join_368: {
    forest_join_367: {
    forest_join_343: {
    forest_join_341: {
    forest_join_339: {
    forest_join_338: {
    forest_join_337: {
    forest_join_295: {
    forest_join_293: {
    forest_join_292: {
    forest_join_291: {
    forest_join_290: {
    forest_join_289: {
    forest_join_279: {
    forest_join_258: {
    forest_join_256: {
    forest_join_255: {
    forest_join_254: {
    forest_join_253: {
    forest_join_252: {
    forest_join_245: {
    forest_join_218: {
    forest_join_212: {
    forest_join_211: {
    forest_join_210: {
    forest_join_209: {
    forest_join_208: {
    forest_join_201: {
    forest_join_170: {
    forest_join_168: {
    forest_join_167: {
    forest_join_166: {
    forest_join_165: {
    forest_join_164: {
    forest_join_157: {
    forest_join_126: {
    forest_join_124: {
    forest_join_123: {
    forest_join_122: {
    forest_join_121: {
    forest_join_120: {
    forest_join_113: {
    forest_join_79: {
    forest_join_73: {
    forest_join_72: {
    forest_join_71: {
    forest_join_70: {
    forest_join_69: {
    forest_join_58: {
    forest_join_39: {
    forest_join_38: {
    forest_join_37: {
    forest_join_28: {
    forest_join_19: {
    forest_join_15: {
    life2_3 = (com.moon.nH.c ^ 24450789385780L);
    spill235_0 = com.moon.aO.c();
    life5_7 = ((moom.wB)(p0)).a__xW();
    life4_8 = ((spill235_0) ? 1 : 0);
    spill235_1 = life5_7;
    if (!((life4_8 != 0))) {
        forestValue235_19_0 = spill235_1;
        break forest_join_19;
    }
    if (!((spill235_1 == null))) {
        break forest_join_15;
    }
    return ((0) != 0);
    }
    forestValue235_19_0 = ((com.moon.setting.BooleanSetting)(((com.moon.module.impl.InventoryManager)(this.a)).x)).getValue();
    }
    spill235_2 = ((java.lang.Boolean)(((java.lang.Boolean)(forestValue235_19_0)))).booleanValue();
    if (!((life4_8 != 0))) {
        forestValue235_28_0 = ((spill235_2) ? 1 : 0);
        break forest_join_28;
    }
    if (!(spill235_2)) {
        break forest_join_37;
    }
    spill235_3 = life5_7;
    if (!((life4_8 != 0))) {
        forestValue235_38_0 = spill235_3;
        break forest_join_38;
    }
    forestValue235_28_0 = ((((net.minecraft.item.ItemStack)(spill235_3)).f__Boolean()) ? 1 : 0);
    }
    if (!((forestValue235_28_0 != 0))) {
        break forest_join_37;
    }
    spill235_4 = ((net.minecraft.item.ItemStack)(life5_7)).a__wQ();
    if (!((life4_8 != 0))) {
        forestValue235_39_0 = spill235_4;
        break forest_join_39;
    }
    if (!((((spill235_4 instanceof net.minecraft.item.ItemPotion) ? 1 : 0) == 0))) {
        break forest_join_37;
    }
    return ((0) != 0);
    }
    forestValue235_38_0 = life5_7;
    }
    forestValue235_39_0 = ((net.minecraft.item.ItemStack)(forestValue235_38_0)).a__wQ();
    }
    life6_45 = forestValue235_39_0;
    spill235_5 = ((life6_45 instanceof moom.xP) ? 1 : 0);
    if (!((life4_8 != 0))) {
        forestValue235_79_0 = spill235_5;
        break forest_join_79;
    }
    if (!((spill235_5 != 0))) {
        break forest_join_73;
    }
    life7_54 = this.f();
    spill235_6 = ((moom.wB)(p0)).c;
    spill235_7 = life7_54;
    if (!((life4_8 != 0))) {
        forestValue235_58_0 = spill235_6;
        forestValue235_58_1 = spill235_7;
        break forest_join_58;
    }
    if (!((spill235_6 != spill235_7))) {
        break forest_join_71;
    }
    spill235_8 = life7_54;
    if (!((life4_8 != 0))) {
        forestValue235_70_0 = spill235_8;
        break forest_join_70;
    }
    forestValue235_58_0 = spill235_8;
    forestValue235_58_1 = -1;
    }
    if (!((forestValue235_58_0 == forestValue235_58_1))) {
        break forest_join_69;
    }
    spill235_9 = ((moom.wB)(p0)).c;
    if (!((life4_8 != 0))) {
        forestValue235_70_0 = spill235_9;
        break forest_join_70;
    }
    if (!((spill235_9 != __sourceIntrinsic_7f73ca9aeaeb_invokedynamic235_21(3970, (2149196082542144817L ^ life2_3))))) {
        break forest_join_71;
    }
    }
    forestValue235_70_0 = 1;
    }
    forestValue235_72_0 = forestValue235_70_0;
    break forest_join_72;
    }
    forestValue235_72_0 = 0;
    }
    return ((forestValue235_72_0) != 0);
    }
    forestValue235_79_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.InventoryManager)(this.a)).z)).getValue())))).booleanValue()) ? 1 : 0);
    }
    if (!((life4_8 != 0))) {
        forestValue235_218_0 = forestValue235_79_0;
        break forest_join_218;
    }
    if (!((forestValue235_79_0 != 0))) {
        break forest_join_212;
    }
    spill235_10 = ((life6_45 instanceof moom.xS) ? 1 : 0);
    if (!((life4_8 != 0))) {
        forestValue235_126_0 = spill235_10;
        break forest_join_126;
    }
    if (!((spill235_10 != 0))) {
        break forest_join_124;
    }
    life7_105 = this.a();
    life8_118 = (__sourceIntrinsic_7f73ca9aeaeb_invokedynamic235_31(5070, (7084479121640550783L ^ life2_3)) + ((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.IntegerSetting)(((com.moon.module.impl.InventoryManager)(this.a)).B)).getValue())))).intValue());
    spill235_11 = ((moom.wB)(p0)).c;
    spill235_12 = life7_105;
    if (!((life4_8 != 0))) {
        forestValue235_113_0 = spill235_11;
        forestValue235_113_1 = spill235_12;
        break forest_join_113;
    }
    if (!((spill235_11 != spill235_12))) {
        break forest_join_122;
    }
    spill235_13 = life7_105;
    if (!((life4_8 != 0))) {
        forestValue235_121_0 = spill235_13;
        break forest_join_121;
    }
    forestValue235_113_0 = spill235_13;
    forestValue235_113_1 = -1;
    }
    if (!((forestValue235_113_0 == forestValue235_113_1))) {
        break forest_join_120;
    }
    spill235_14 = ((moom.wB)(p0)).c;
    if (!((life4_8 != 0))) {
        forestValue235_121_0 = spill235_14;
        break forest_join_121;
    }
    if (!((spill235_14 != life8_118))) {
        break forest_join_122;
    }
    }
    forestValue235_121_0 = 1;
    }
    forestValue235_123_0 = forestValue235_121_0;
    break forest_join_123;
    }
    forestValue235_123_0 = 0;
    }
    return ((forestValue235_123_0) != 0);
    }
    forestValue235_126_0 = ((life6_45 instanceof moom.xR) ? 1 : 0);
    }
    if (!((life4_8 != 0))) {
        forestValue235_170_0 = forestValue235_126_0;
        break forest_join_170;
    }
    if (!((forestValue235_126_0 != 0))) {
        break forest_join_168;
    }
    life7_154 = this.b();
    life8_169 = ((__sourceIntrinsic_7f73ca9aeaeb_invokedynamic235_42(5070, (7084479121640550783L ^ life2_3)) + ((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.IntegerSetting)(((com.moon.module.impl.InventoryManager)(this.a)).B)).getValue())))).intValue()) + 1);
    spill235_15 = ((moom.wB)(p0)).c;
    spill235_16 = life7_154;
    if (!((life4_8 != 0))) {
        forestValue235_157_0 = spill235_15;
        forestValue235_157_1 = spill235_16;
        break forest_join_157;
    }
    if (!((spill235_15 != spill235_16))) {
        break forest_join_166;
    }
    spill235_17 = life7_154;
    if (!((life4_8 != 0))) {
        forestValue235_165_0 = spill235_17;
        break forest_join_165;
    }
    forestValue235_157_0 = spill235_17;
    forestValue235_157_1 = -1;
    }
    if (!((forestValue235_157_0 == forestValue235_157_1))) {
        break forest_join_164;
    }
    spill235_18 = ((moom.wB)(p0)).c;
    if (!((life4_8 != 0))) {
        forestValue235_165_0 = spill235_18;
        break forest_join_165;
    }
    if (!((spill235_18 != life8_169))) {
        break forest_join_166;
    }
    }
    forestValue235_165_0 = 1;
    }
    forestValue235_167_0 = forestValue235_165_0;
    break forest_join_167;
    }
    forestValue235_167_0 = 0;
    }
    return ((forestValue235_167_0) != 0);
    }
    forestValue235_170_0 = ((life6_45 instanceof moom.xT) ? 1 : 0);
    }
    if (!((life4_8 != 0))) {
        forestValue235_218_0 = forestValue235_170_0;
        break forest_join_218;
    }
    if (!((forestValue235_170_0 != 0))) {
        break forest_join_212;
    }
    life7_205 = this.c();
    life8_220 = ((__sourceIntrinsic_7f73ca9aeaeb_invokedynamic235_53(5070, (7084479121640550783L ^ life2_3)) + ((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.IntegerSetting)(((com.moon.module.impl.InventoryManager)(this.a)).B)).getValue())))).intValue()) + 2);
    spill235_19 = ((moom.wB)(p0)).c;
    spill235_20 = life7_205;
    if (!((life4_8 != 0))) {
        forestValue235_201_0 = spill235_19;
        forestValue235_201_1 = spill235_20;
        break forest_join_201;
    }
    if (!((spill235_19 != spill235_20))) {
        break forest_join_210;
    }
    spill235_21 = life7_205;
    if (!((life4_8 != 0))) {
        forestValue235_209_0 = spill235_21;
        break forest_join_209;
    }
    forestValue235_201_0 = spill235_21;
    forestValue235_201_1 = -1;
    }
    if (!((forestValue235_201_0 == forestValue235_201_1))) {
        break forest_join_208;
    }
    spill235_22 = ((moom.wB)(p0)).c;
    if (!((life4_8 != 0))) {
        forestValue235_209_0 = spill235_22;
        break forest_join_209;
    }
    if (!((spill235_22 != life8_220))) {
        break forest_join_210;
    }
    }
    forestValue235_209_0 = 1;
    }
    forestValue235_211_0 = forestValue235_209_0;
    break forest_join_211;
    }
    forestValue235_211_0 = 0;
    }
    return ((forestValue235_211_0) != 0);
    }
    forestValue235_218_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.InventoryManager)(this.a)).y)).getValue())))).booleanValue()) ? 1 : 0);
    }
    if (!((life4_8 != 0))) {
        forestValue235_258_0 = forestValue235_218_0;
        break forest_join_258;
    }
    if (!((forestValue235_218_0 != 0))) {
        break forest_join_256;
    }
    spill235_23 = ((life6_45 instanceof net.minecraft.item.ItemBow) ? 1 : 0);
    if (!((life4_8 != 0))) {
        forestValue235_258_0 = spill235_23;
        break forest_join_258;
    }
    if (!((spill235_23 != 0))) {
        break forest_join_256;
    }
    life7_267 = this.e();
    life8_273 = __sourceIntrinsic_7f73ca9aeaeb_invokedynamic235_70(6378, (5500094636123880031L ^ life2_3));
    spill235_24 = ((moom.wB)(p0)).c;
    spill235_25 = life7_267;
    if (!((life4_8 != 0))) {
        forestValue235_245_0 = spill235_24;
        forestValue235_245_1 = spill235_25;
        break forest_join_245;
    }
    if (!((spill235_24 != spill235_25))) {
        break forest_join_254;
    }
    spill235_26 = life7_267;
    if (!((life4_8 != 0))) {
        forestValue235_253_0 = spill235_26;
        break forest_join_253;
    }
    forestValue235_245_0 = spill235_26;
    forestValue235_245_1 = -1;
    }
    if (!((forestValue235_245_0 == forestValue235_245_1))) {
        break forest_join_252;
    }
    spill235_27 = ((moom.wB)(p0)).c;
    if (!((life4_8 != 0))) {
        forestValue235_253_0 = spill235_27;
        break forest_join_253;
    }
    if (!((spill235_27 != life8_273))) {
        break forest_join_254;
    }
    }
    forestValue235_253_0 = 1;
    }
    forestValue235_255_0 = forestValue235_253_0;
    break forest_join_255;
    }
    forestValue235_255_0 = 0;
    }
    return ((forestValue235_255_0) != 0);
    }
    forestValue235_258_0 = ((life6_45 instanceof net.minecraft.item.ItemArmor) ? 1 : 0);
    }
    if (!((life4_8 != 0))) {
        forestValue235_295_0 = forestValue235_258_0;
        break forest_join_295;
    }
    if (!((forestValue235_258_0 != 0))) {
        break forest_join_293;
    }
    life7_309 = ((net.minecraft.item.ItemArmor)(life6_45));
    life8_314 = this.b(((int)(((net.minecraft.item.ItemArmor)(life7_309)).q)));
    spill235_28 = ((moom.wB)(p0)).c;
    spill235_29 = life8_314;
    if (!((life4_8 != 0))) {
        forestValue235_279_0 = spill235_28;
        forestValue235_279_1 = spill235_29;
        break forest_join_279;
    }
    if (!((spill235_28 != spill235_29))) {
        break forest_join_291;
    }
    spill235_30 = life8_314;
    if (!((life4_8 != 0))) {
        forestValue235_290_0 = spill235_30;
        break forest_join_290;
    }
    forestValue235_279_0 = spill235_30;
    forestValue235_279_1 = -1;
    }
    if (!((forestValue235_279_0 == forestValue235_279_1))) {
        break forest_join_289;
    }
    spill235_31 = ((moom.wB)(p0)).c;
    if (!((life4_8 != 0))) {
        forestValue235_290_0 = spill235_31;
        break forest_join_290;
    }
    if (!((spill235_31 != (((net.minecraft.item.ItemArmor)(life7_309)).q + 5)))) {
        break forest_join_291;
    }
    }
    forestValue235_290_0 = 1;
    }
    forestValue235_292_0 = forestValue235_290_0;
    break forest_join_292;
    }
    forestValue235_292_0 = 0;
    }
    return ((forestValue235_292_0) != 0);
    }
    forestValue235_295_0 = ((life6_45 instanceof net.minecraft.item.ItemPotion) ? 1 : 0);
    }
    if (!((life4_8 != 0))) {
        forestValue235_343_0 = forestValue235_295_0;
        break forest_join_343;
    }
    if (!((forestValue235_295_0 != 0))) {
        break forest_join_341;
    }
    life7_353 = ((net.minecraft.item.ItemPotion)(life6_45));
    life8_358 = ((java.util.List)(((net.minecraft.item.ItemPotion)(life7_353)).a__List(((net.minecraft.item.ItemStack)(life5_7))))).iterator();
    forest_cycle_306: while (true) {
    forestValue235_307_0 = life8_358;
    forest_cycle_307: while (true) {
    if (!(((java.util.Iterator)(forestValue235_307_0)).hasNext())) {
        break forest_join_339;
    }
    spill235_32 = life8_358;
    if (!((life4_8 != 0))) {
        forestValue235_307_0 = spill235_32;
        continue forest_cycle_307;
    }
    break forest_cycle_307;
    }
    life9_367 = ((net.minecraft.potion.PotionEffect)(((java.util.Iterator)(spill235_32)).next()));
    if (!((life9_367 != null))) {
        continue forest_cycle_306;
    }
    spill235_33 = ((net.minecraft.potion.Potion)((net.minecraft.potion.Potion.a)[((net.minecraft.potion.PotionEffect)(life9_367)).a()])).c__Boolean();
    if (!((life4_8 != 0))) {
        forestValue235_338_0 = ((spill235_33) ? 1 : 0);
        break forest_join_338;
    }
    if (!((!spill235_33))) {
        break forest_join_337;
    }
    spill235_34 = ((net.minecraft.potion.PotionEffect)(life9_367)).a();
    if (!((life4_8 != 0))) {
        forestValue235_338_0 = spill235_34;
        break forest_join_338;
    }
    if (!((spill235_34 != __sourceIntrinsic_7f73ca9aeaeb_invokedynamic235_94(5335, (4847963652737726061L ^ life2_3))))) {
        break forest_join_337;
    }
    if (!((life4_8 == 0))) {
        continue forest_cycle_306;
    }
    break forest_cycle_306;
    }
    }
    forestValue235_338_0 = 1;
    }
    return ((forestValue235_338_0) != 0);
    }
    return ((0) != 0);
    }
    forestValue235_343_0 = ((life6_45 instanceof moom.wU) ? 1 : 0);
    }
    if (!((life4_8 != 0))) {
        forestValue235_372_0 = forestValue235_343_0;
        break forest_join_372;
    }
    if (!((forestValue235_343_0 != 0))) {
        break forest_join_370;
    }
    spill235_35 = ((net.minecraft.block.Block)(((moom.wU)(((moom.wU)(life6_45)))).a__ch())).a__Boolean();
    if (!((life4_8 != 0))) {
        forestValue235_372_0 = ((spill235_35) ? 1 : 0);
        break forest_join_372;
    }
    if (!(spill235_35)) {
        break forest_join_370;
    }
    life7_415 = this.h();
    spill235_36 = life7_415;
    if (!((life4_8 != 0))) {
        forestValue235_367_0 = spill235_36;
        break forest_join_367;
    }
    if (!((spill235_36 > ((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.IntegerSetting)(((com.moon.module.impl.InventoryManager)(this.a)).w)).getValue())))).intValue()))) {
        break forest_join_368;
    }
    forestValue235_367_0 = 1;
    }
    forestValue235_369_0 = forestValue235_367_0;
    break forest_join_369;
    }
    forestValue235_369_0 = 0;
    }
    return ((forestValue235_369_0) != 0);
    }
    forestValue235_372_0 = ((life6_45 instanceof moom.xp) ? 1 : 0);
    }
    if (!((life4_8 != 0))) {
        forestValue235_381_0 = forestValue235_372_0;
        break forest_join_381;
    }
    if (!((forestValue235_372_0 == 0))) {
        break forest_join_380;
    }
    spill235_37 = ((life6_45 instanceof moom.xj) ? 1 : 0);
    if (!((life4_8 != 0))) {
        forestValue235_384_0 = spill235_37;
        break forest_join_384;
    }
    if (!((spill235_37 != 0))) {
        break forest_join_382;
    }
    }
    forestValue235_381_0 = 0;
    }
    return ((forestValue235_381_0) != 0);
    }
    forestValue235_384_0 = net.minecraft.item.Item.a(((net.minecraft.item.Item)(life6_45)));
    }
    if (!((life4_8 != 0))) {
        forestValue235_390_0 = forestValue235_384_0;
        break forest_join_390;
    }
    switch (forestValue235_384_0) {
case 262:
case 263:
case 264:
case 265:
case 266:
case 280:
case 325:
case 326:
case 327:
case 368:
case 369:
case 370:
case 378:
case 388:
case 399:
{
        break forest_join_387;
    }
default:
{
        break forest_join_389;
    }
}
    }
    return ((0) != 0);
    }
    forestValue235_390_0 = 1;
    }
    return ((forestValue235_390_0) != 0);
}


private java.util.ArrayList<moom.wB> a__ArrayList() {
long life1_3;
    java.util.ArrayList life4_13;
    int life3_14;
    forward_join_35: {
    forward_join_27: {
    life1_3 = (com.moon.nH.c ^ 89252516518113L);
    boolean spill1334_0 = com.moon.aO.b__Boolean();
    life4_13 = new java.util.ArrayList(((moom.v8)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(this.b)).K)).bF)).b);
    life3_14 = ((spill1334_0) ? 1 : 0);
    if (!((life3_14 == 0))) { break forward_join_27; }
    if (!((((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(this.b)).K)).bG != null))) { break forward_join_35; }
    ((java.util.ArrayList)(life4_13)).removeIf(((java.util.function.Predicate)(__sourceIntrinsic_5550fcbf43ce_invokedynamic1334_10(this))));
    }
    ((java.util.ArrayList)(life4_13)).addAll(((java.util.Collection)(((moom.v8)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(this.b)).K)).bG)).b)));
    }
    return life4_13;
}


public void a(int p0, int p1) {
this.a(((int)(((moom.v8)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(this.b)).K)).bF)).c)), ((int)(p0)), ((int)(p1)));
    return;
}


public int g() {
net.minecraft.client.Minecraft lexicalValue284_23_0;
    net.minecraft.client.Minecraft lexicalValue284_29_0;
    net.minecraft.item.ItemStack lexicalValue284_44_0;
    boolean spill284_0;
    net.minecraft.client.Minecraft spill284_1;
    net.minecraft.item.ItemStack spill284_2;
    long life1_3;
    int life4_6;
    int life3_7;
    net.minecraft.item.ItemStack life5_62;
    net.minecraft.item.Item life6_65;
    lexical_join_58: {
    life1_3 = (com.moon.nH.c ^ 68602199725155L);
    spill284_0 = com.moon.aO.c();
    life4_6 = 0;
    life3_7 = ((spill284_0) ? 1 : 0);
    lexical_cycle_8: while (true) {
    lexical_join_56: {
    lexical_join_55: {
    lexical_join_44: {
    lexical_join_29: {
    lexical_join_23: {
    if (!((life4_6 <= __sourceIntrinsic_80d806743da5_invokedynamic284_3(1792, (1652046707511859169L ^ life1_3))))) {
        break lexical_join_58;
    }
    spill284_1 = this.b;
    if (!((life3_7 != 0))) {
        lexicalValue284_23_0 = spill284_1;
        break lexical_join_23;
    }
    if (!((((net.minecraft.client.Minecraft)(spill284_1)).K != null))) {
        break lexical_join_55;
    }
    lexicalValue284_23_0 = this.b;
    }
    if (!((life3_7 != 0))) {
        lexicalValue284_29_0 = lexicalValue284_23_0;
        break lexical_join_29;
    }
    if (!((((net.minecraft.client.Minecraft)(lexicalValue284_23_0)).I != null))) {
        break lexical_join_55;
    }
    lexicalValue284_29_0 = this.b;
    }
    spill284_2 = (((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(lexicalValue284_29_0)).K)).bD)).a)[life4_6];
    if (!((life3_7 != 0))) {
        lexicalValue284_44_0 = spill284_2;
        break lexical_join_44;
    }
    if (!((spill284_2 != null))) {
        break lexical_join_55;
    }
    lexicalValue284_44_0 = (((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(this.b)).K)).bD)).a)[life4_6];
    }
    life5_62 = lexicalValue284_44_0;
    life6_65 = ((net.minecraft.item.ItemStack)(life5_62)).a__wQ();
    if (!((life3_7 != 0))) {
        break lexical_join_56;
    }
    if (!((((life6_65 instanceof moom.xt) ? 1 : 0) != 0))) {
        break lexical_join_55;
    }
    return life4_6;
    }
    life4_6 += 1;
    }
    if (!((life3_7 == 0))) { continue lexical_cycle_8; }
    break lexical_cycle_8;
    }
    }
    return -1;
}


private static boolean lambda$getPickaxe$0(net.minecraft.item.ItemTool p0) {
return ((((p0 instanceof moom.xS) ? 1 : 0)) != 0);
}


private boolean lambda$getSlots$3(moom.wB p0) {
return (__sourceIntrinsic_booleanComparison((((java.util.List)(((moom.v8)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(this.b)).K)).bG)).b)).contains(((java.lang.Object)(p0))))) != 0);
}


private static boolean lambda$getAxe$1(net.minecraft.item.ItemTool p0) {
return ((((p0 instanceof moom.xR) ? 1 : 0)) != 0);
}


private static boolean lambda$getShovel$2(net.minecraft.item.ItemTool p0) {
return ((((p0 instanceof moom.xT) ? 1 : 0)) != 0);
}


private static native <E extends Throwable> java.util.function.Predicate __sourceIntrinsic_8aebf151eadb_originalDynamicSite571_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5c51e7cdc795_invokedynamic234_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral2875_0() throws E;

private static native <E extends Throwable> double __sourceIntrinsic_dfa88205c138_exactNonfiniteDoubleLiteral104_1() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_dfa88205c138_invokedynamic104_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7f73ca9aeaeb_invokedynamic235_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7f73ca9aeaeb_invokedynamic235_31(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7f73ca9aeaeb_invokedynamic235_42(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7f73ca9aeaeb_invokedynamic235_53(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7f73ca9aeaeb_invokedynamic235_70(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7f73ca9aeaeb_invokedynamic235_94(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Predicate __sourceIntrinsic_5550fcbf43ce_invokedynamic1334_10(com.moon.nH a0) throws E;

private static native <E extends Throwable> java.util.function.Predicate __sourceIntrinsic_e1958f95391c_originalDynamicSite569_0() throws E;

private static native <E extends Throwable> double __sourceIntrinsic_ead3c349e325_exactNonfiniteDoubleLiteral105_1() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral2863_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_db39cebc37bf_invokedynamic140_7(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_db39cebc37bf_invokedynamic140_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Predicate __sourceIntrinsic_94b06fabf08c_originalDynamicSite570_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e0f64934fe3a_invokedynamic281_13(int a0, long a1) throws E;

private static native <E extends Throwable> double __sourceIntrinsic_c4b63a62bb23_exactNonfiniteDoubleLiteral107_2() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c4b63a62bb23_invokedynamic107_13(int a0, long a1) throws E;

private static native <E extends Throwable> double __sourceIntrinsic_d5f736cb4191_exactNonfiniteDoubleLiteral108_1() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d5f736cb4191_invokedynamic108_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d5f736cb4191_invokedynamic108_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_80d806743da5_invokedynamic284_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9d7e73b66053_invokedynamic285_3(int a0, long a1) throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
