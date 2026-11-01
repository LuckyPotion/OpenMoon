package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public final class yD {

private static long a;

private static long[] b;

private static java.lang.Integer[] c;

private static java.util.Map d;

public yD() {
super();
}


static {
a = ((long)(((moom._a)(moom._c.a(((long)(4611748945085779825L)), ((long)(-128496701292036656L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(29497901387821L)))));
    d = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.yD.a ^ 103260604804785L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1701_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1701_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1701_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1701_14 = new byte[8];
    (__sourceSpill1701_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1701_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1701_16 = __sourceSpill1701_14;
    ((javax.crypto.Cipher)(__sourceSpill1701_11)).init(((int)(__sourceSpill1701_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1701_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1701_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[4];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "Û©\"Ø÷ëS\n\005ê;\027ý["))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1701_25 = local6_life21;
        int __sourceSpill1701_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1701_25)).substring(((int)(__sourceSpill1701_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1701_30 = local8_life19;
        int __sourceSpill1701_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1701_33 = new byte[8];
        (__sourceSpill1701_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1701_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1701_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1701_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1701_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1701_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1701_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1701_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1701_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1701_34)).doFinal(((byte[])(__sourceSpill1701_33)));
        (__sourceSpill1701_30)[__sourceSpill1701_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "i&âó&â\b­\004ç<<\037&Fè"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1701_38 = local6_life21;
        int __sourceSpill1701_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1701_38)).substring(((int)(__sourceSpill1701_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1701_43 = local8_life19;
        int __sourceSpill1701_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1701_46 = new byte[8];
        (__sourceSpill1701_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1701_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1701_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1701_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1701_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1701_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1701_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1701_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1701_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1701_47)).doFinal(((byte[])(__sourceSpill1701_46)));
        (__sourceSpill1701_43)[__sourceSpill1701_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    b = ((long[])(local8_life19));
    c = ((java.lang.Integer[])(new java.lang.Integer[4]));
}

private static native <E extends Throwable> boolean __sourceHandlerCall_d3d4e22af5c3ef02aef3(net.minecraft.nbt.NBTBase a0, net.minecraft.nbt.NBTBase a1, boolean a2) throws E;
private static final class __SourceHandler_d3d4e22af5c3ef02aef3 {

public static boolean f1235(net.minecraft.nbt.NBTBase p0, net.minecraft.nbt.NBTBase p1, boolean p2) throws Throwable {
    net.minecraft.nbt.NBTBase lexicalValue1235_14_0;
    net.minecraft.nbt.NBTBase lexicalValue1235_20_0;
    net.minecraft.nbt.NBTBase lexicalValue1235_26_0;
    int lexicalValue1235_37_0;
    int lexicalValue1235_73_0;
    int lexicalValue1235_77_0;
    int lexicalValue1235_80_0;
    int lexicalValue1235_104_0;
    int lexicalValue1235_106_0;
    int lexicalValue1235_108_0;
    int lexicalValue1235_139_0;
    int lexicalValue1235_146_0;
    int lexicalValue1235_150_0;
    int lexicalValue1235_155_0;
    int lexicalValue1235_159_0;
    net.minecraft.nbt.NBTBase spill1235_0;
    boolean spill1235_1;
    boolean spill1235_2;
    boolean spill1235_3;
    int spill1235_4;
    int spill1235_5;
    int spill1235_6;
    boolean spill1235_7;
    long life3_3;
    java.lang.String life5_5;
    net.minecraft.nbt.NBTTagCompound life6_65;
    net.minecraft.nbt.NBTTagCompound life8_68;
    java.util.Iterator life9_72;
    java.lang.String life10_79;
    net.minecraft.nbt.NBTBase life11_83;
    net.minecraft.nbt.NBTTagList life7_117;
    net.minecraft.nbt.NBTTagList life8_127;
    int life9_152;
    net.minecraft.nbt.NBTBase life10_160;
    int life11_162;
    int life12_166;
    lexical_join_159: {
    lexical_join_156: {
    lexical_join_155: {
    lexical_join_154: {
    lexical_join_108: {
    lexical_join_107: {
    lexical_join_106: {
    lexical_join_105: {
    lexical_join_104: {
    lexical_join_80: {
    lexical_join_78: {
    lexical_join_77: {
    lexical_join_76: {
    lexical_join_37: {
    lexical_join_35: {
    lexical_join_26: {
    lexical_join_25: {
    lexical_join_20: {
    lexical_join_19: {
    lexical_join_14: {
    lexical_join_13: {
    life3_3 = (__fieldRead1235_0() ^ 897517407948L);
    life5_5 = __call1235_1();
    spill1235_0 = p0;
    if (!((life5_5 == null))) {
        lexicalValue1235_14_0 = spill1235_0;
        break lexical_join_14;
    }
    if (!((spill1235_0 == p1))) {
        break lexical_join_13;
    }
    return __integerCategory1235_2(1);
    }
    lexicalValue1235_14_0 = p0;
    }
    if (!((life5_5 == null))) {
        lexicalValue1235_20_0 = lexicalValue1235_14_0;
        break lexical_join_20;
    }
    if (!((lexicalValue1235_14_0 == null))) {
        break lexical_join_19;
    }
    return __integerCategory1235_3(1);
    }
    lexicalValue1235_20_0 = p1;
    }
    if (!((life5_5 == null))) {
        lexicalValue1235_26_0 = lexicalValue1235_20_0;
        break lexical_join_26;
    }
    if (!((lexicalValue1235_20_0 == null))) {
        break lexical_join_25;
    }
    return __integerCategory1235_4(0);
    }
    lexicalValue1235_26_0 = p0;
    }
    spill1235_1 = __call1235_7(__call1235_5(lexicalValue1235_26_0), __call1235_6(p1));
    if (!((life5_5 == null))) {
        lexicalValue1235_37_0 = __integerCategory1235_8(spill1235_1);
        break lexical_join_37;
    }
    if (!((!spill1235_1))) {
        break lexical_join_35;
    }
    return __integerCategory1235_9(0);
    }
    lexicalValue1235_37_0 = __instanceOf1235_10(p0);
    }
    if (!((life5_5 == null))) {
        lexicalValue1235_80_0 = lexicalValue1235_37_0;
        break lexical_join_80;
    }
    if (!((lexicalValue1235_37_0 != 0))) {
        break lexical_join_78;
    }
    life6_65 = __cast1235_11(p0);
    life8_68 = __cast1235_12(p1);
    life9_72 = __call1235_14(__call1235_13(life6_65));
    lexical_cycle_50: while (true) {
    lexical_join_74: {
    lexical_join_73: {
    if (!(__call1235_15(life9_72))) {
        break lexical_join_76;
    }
    life10_79 = __cast1235_17(__call1235_16(life9_72));
    life11_83 = __call1235_18(life6_65, life10_79);
    spill1235_2 = __call1235_20(life11_83, __call1235_19(life8_68, life10_79), p2);
    if (!((life5_5 == null))) {
        lexicalValue1235_77_0 = __integerCategory1235_21(spill1235_2);
        break lexical_join_77;
    }
    if (!((life5_5 == null))) {
        lexicalValue1235_73_0 = __integerCategory1235_22(spill1235_2);
        break lexical_join_73;
    }
    if (!((!spill1235_2))) {
        break lexical_join_74;
    }
    lexicalValue1235_73_0 = 0;
    }
    return __integerCategory1235_23(lexicalValue1235_73_0);
    }
    if (!((life5_5 != null))) { continue lexical_cycle_50; }
    break lexical_cycle_50;
    }
    }
    lexicalValue1235_77_0 = 1;
    }
    return __integerCategory1235_24(lexicalValue1235_77_0);
    }
    lexicalValue1235_80_0 = __instanceOf1235_25(p0);
    }
    if (!((life5_5 == null))) {
        lexicalValue1235_159_0 = lexicalValue1235_80_0;
        break lexical_join_159;
    }
    if (!((lexicalValue1235_80_0 != 0))) {
        break lexical_join_156;
    }
    life7_117 = __cast1235_26(p0);
    spill1235_3 = p2;
    if (!((life5_5 == null))) {
        lexicalValue1235_159_0 = __integerCategory1235_27(spill1235_3);
        break lexical_join_159;
    }
    if (!(spill1235_3)) {
        break lexical_join_156;
    }
    life8_127 = __cast1235_28(p1);
    spill1235_4 = __call1235_29(life7_117);
    if (!((life5_5 == null))) {
        lexicalValue1235_108_0 = spill1235_4;
        break lexical_join_108;
    }
    if (!((spill1235_4 == 0))) {
        break lexical_join_107;
    }
    spill1235_5 = __call1235_30(life8_127);
    if (!((life5_5 == null))) {
        lexicalValue1235_104_0 = spill1235_5;
        break lexical_join_104;
    }
    if (!((spill1235_5 == 0))) {
        break lexical_join_105;
    }
    lexicalValue1235_104_0 = 1;
    }
    lexicalValue1235_106_0 = lexicalValue1235_104_0;
    break lexical_join_106;
    }
    lexicalValue1235_106_0 = 0;
    }
    return __integerCategory1235_31(lexicalValue1235_106_0);
    }
    lexicalValue1235_108_0 = 0;
    }
    life9_152 = lexicalValue1235_108_0;
    lexical_cycle_109: while (true) {
    lexical_join_151: {
    lexical_join_150: {
    lexical_join_146: {
    lexical_join_145: {
    if (!((life9_152 < __call1235_32(life7_117)))) {
        break lexical_join_154;
    }
    life10_160 = __call1235_33(life7_117, life9_152);
    life11_162 = 0;
    spill1235_6 = 0;
    if (!((life5_5 == null))) {
        lexicalValue1235_155_0 = spill1235_6;
        break lexical_join_155;
    }
    life12_166 = spill1235_6;
    lexical_cycle_123: while (true) {
    lexical_join_142: {
    lexical_join_139: {
    if (!((life12_166 < __call1235_34(life8_127)))) {
        break lexical_join_145;
    }
    spill1235_7 = __call1235_36(life10_160, __call1235_35(life8_127, life12_166), p2);
    if (!((life5_5 == null))) {
        lexicalValue1235_146_0 = __integerCategory1235_37(spill1235_7);
        break lexical_join_146;
    }
    if (!((life5_5 == null))) {
        lexicalValue1235_139_0 = __integerCategory1235_38(spill1235_7);
        break lexical_join_139;
    }
    if (!(spill1235_7)) {
        break lexical_join_142;
    }
    lexicalValue1235_139_0 = 1;
    }
    life11_162 = lexicalValue1235_139_0;
    if (!((life5_5 != null))) {
        break lexical_join_145;
    }
    }
    life12_166 += 1;
    if (!((life5_5 != null))) { continue lexical_cycle_123; }
    break lexical_cycle_123;
    }
    }
    lexicalValue1235_146_0 = life11_162;
    }
    if (!((life5_5 == null))) {
        lexicalValue1235_150_0 = lexicalValue1235_146_0;
        break lexical_join_150;
    }
    if (!((lexicalValue1235_146_0 == 0))) {
        break lexical_join_151;
    }
    lexicalValue1235_150_0 = 0;
    }
    return __integerCategory1235_39(lexicalValue1235_150_0);
    }
    life9_152 += 1;
    if (!((life5_5 != null))) { continue lexical_cycle_109; }
    break lexical_cycle_109;
    }
    }
    lexicalValue1235_155_0 = 1;
    }
    return __integerCategory1235_40(lexicalValue1235_155_0);
    }
    lexicalValue1235_159_0 = __integerCategory1235_42(__call1235_41(p0, p1));
    }
    return __integerCategory1235_43(lexicalValue1235_159_0);
}
public static void h1235_0(moom.Oo p0) throws Throwable {
    throw __call1123500_0(p0);
}
public static void h1235_1(moom.Oo p0) throws Throwable {
    throw __call1123501_0(p0);
}
public static void h1235_2(moom.Oo p0) throws Throwable {
    throw __call1123502_0(p0);
}
public static void h1235_3(moom.Oo p0) throws Throwable {
    throw __call1123503_0(p0);
}
public static void h1235_4(moom.Oo p0) throws Throwable {
    throw __call1123504_0(p0);
}
public static void h1235_5(moom.Oo p0) throws Throwable {
    throw __call1123505_0(p0);
}
public static void h1235_6(moom.Oo p0) throws Throwable {
    throw __call1123506_0(p0);
}
public static void h1235_7(moom.Oo p0) throws Throwable {
    throw __call1123507_0(p0);
}
public static void h1235_8(moom.Oo p0) throws Throwable {
    throw __call1123508_0(p0);
}
public static void h1235_9(moom.Oo p0) throws Throwable {
    throw __call1123509_0(p0);
}
public static void h1235_10(moom.Oo p0) throws Throwable {
    throw __call1123510_0(p0);
}
public static void h1235_11(moom.Oo p0) throws Throwable {
    throw __call1123511_0(p0);
}
public static void h1235_12(moom.Oo p0) throws Throwable {
    throw __call1123512_0(p0);
}
public static void h1235_13(moom.Oo p0) throws Throwable {
    throw __call1123513_0(p0);
}
public static void h1235_14(moom.Oo p0) throws Throwable {
    throw __call1123514_0(p0);
}
public static void h1235_15(moom.Oo p0) throws Throwable {
    throw __call1123515_0(p0);
}
public static void h1235_16(moom.Oo p0) throws Throwable {
    throw __call1123516_0(p0);
}
public static void h1235_17(moom.Oo p0) throws Throwable {
    throw __call1123517_0(p0);
}
public static void h1235_18(moom.Oo p0) throws Throwable {
    throw __call1123518_0(p0);
}
public static void h1235_19(moom.Oo p0) throws Throwable {
    throw __call1123519_0(p0);
}
private static native long __fieldRead1235_0() throws Throwable;
private static native java.lang.String __call1235_1() throws Throwable;
private static native boolean __integerCategory1235_2(int value) throws Throwable;
private static native boolean __integerCategory1235_3(int value) throws Throwable;
private static native boolean __integerCategory1235_4(int value) throws Throwable;
private static native java.lang.Class __call1235_5(net.minecraft.nbt.NBTBase a0) throws Throwable;
private static native java.lang.Class __call1235_6(net.minecraft.nbt.NBTBase a0) throws Throwable;
private static native boolean __call1235_7(java.lang.Class a0, java.lang.Class a1) throws Throwable;
private static native int __integerCategory1235_8(boolean value) throws Throwable;
private static native boolean __integerCategory1235_9(int value) throws Throwable;
private static native int __instanceOf1235_10(net.minecraft.nbt.NBTBase a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __cast1235_11(net.minecraft.nbt.NBTBase a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __cast1235_12(net.minecraft.nbt.NBTBase a0) throws Throwable;
private static native java.util.Set __call1235_13(net.minecraft.nbt.NBTTagCompound a0) throws Throwable;
private static native java.util.Iterator __call1235_14(java.util.Set a0) throws Throwable;
private static native boolean __call1235_15(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1235_16(java.util.Iterator a0) throws Throwable;
private static native java.lang.String __cast1235_17(java.lang.Object a0) throws Throwable;
private static native net.minecraft.nbt.NBTBase __call1235_18(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.nbt.NBTBase __call1235_19(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native boolean __call1235_20(net.minecraft.nbt.NBTBase a0, net.minecraft.nbt.NBTBase a1, boolean a2) throws Throwable;
private static native int __integerCategory1235_21(boolean value) throws Throwable;
private static native int __integerCategory1235_22(boolean value) throws Throwable;
private static native boolean __integerCategory1235_23(int value) throws Throwable;
private static native boolean __integerCategory1235_24(int value) throws Throwable;
private static native int __instanceOf1235_25(net.minecraft.nbt.NBTBase a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagList __cast1235_26(net.minecraft.nbt.NBTBase a0) throws Throwable;
private static native int __integerCategory1235_27(boolean value) throws Throwable;
private static native net.minecraft.nbt.NBTTagList __cast1235_28(net.minecraft.nbt.NBTBase a0) throws Throwable;
private static native int __call1235_29(net.minecraft.nbt.NBTTagList a0) throws Throwable;
private static native int __call1235_30(net.minecraft.nbt.NBTTagList a0) throws Throwable;
private static native boolean __integerCategory1235_31(int value) throws Throwable;
private static native int __call1235_32(net.minecraft.nbt.NBTTagList a0) throws Throwable;
private static native net.minecraft.nbt.NBTBase __call1235_33(net.minecraft.nbt.NBTTagList a0, int a1) throws Throwable;
private static native int __call1235_34(net.minecraft.nbt.NBTTagList a0) throws Throwable;
private static native net.minecraft.nbt.NBTBase __call1235_35(net.minecraft.nbt.NBTTagList a0, int a1) throws Throwable;
private static native boolean __call1235_36(net.minecraft.nbt.NBTBase a0, net.minecraft.nbt.NBTBase a1, boolean a2) throws Throwable;
private static native int __integerCategory1235_37(boolean value) throws Throwable;
private static native int __integerCategory1235_38(boolean value) throws Throwable;
private static native boolean __integerCategory1235_39(int value) throws Throwable;
private static native boolean __integerCategory1235_40(int value) throws Throwable;
private static native boolean __call1235_41(net.minecraft.nbt.NBTBase a0, net.minecraft.nbt.NBTBase a1) throws Throwable;
private static native int __integerCategory1235_42(boolean value) throws Throwable;
private static native boolean __integerCategory1235_43(int value) throws Throwable;
private static native java.lang.Throwable __call1123500_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1123501_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1123502_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1123503_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1123504_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1123505_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1123506_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1123507_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1123508_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1123509_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1123510_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1123511_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1123512_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1123513_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1123514_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1123515_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1123516_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1123517_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1123518_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1123519_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> com.mojang.authlib.GameProfile __sourceHandlerCall_045cde962b9e86c7bc43(net.minecraft.nbt.NBTTagCompound a0) throws E;
private static final class __SourceHandler_045cde962b9e86c7bc43 {

public static com.mojang.authlib.GameProfile f523(net.minecraft.nbt.NBTTagCompound p0) throws Throwable {
    net.minecraft.nbt.NBTTagCompound forestValue523_23_0;
    java.lang.String forestValue523_23_1;
    net.minecraft.nbt.NBTTagCompound forestValue523_38_0;
    java.lang.String forestValue523_38_1;
    java.lang.String forestValue523_53_0;
    net.minecraft.nbt.NBTTagCompound forestValue523_74_0;
    java.lang.String forestValue523_74_1;
    int forestValue523_82_0;
    int forestValue523_147_0;
    java.lang.String spill523_0;
    net.minecraft.nbt.NBTTagCompound spill523_1;
    java.lang.String spill523_2;
    net.minecraft.nbt.NBTTagCompound spill523_3;
    java.lang.String spill523_4;
    java.lang.String spill523_5;
    java.lang.String spill523_6;
    net.minecraft.nbt.NBTTagCompound spill523_7;
    java.lang.String spill523_8;
    boolean spill523_9;
    long life1_3;
    java.lang.String life4_5;
    java.lang.String life5_8;
    java.lang.String life3_9;
    java.util.UUID life6_61;
    com.mojang.authlib.GameProfile life7_68;
    net.minecraft.nbt.NBTTagCompound life8_85;
    java.util.Iterator life9_89;
    java.lang.String life10_96;
    net.minecraft.nbt.NBTTagList life11_105;
    int life12_107;
    net.minecraft.nbt.NBTTagCompound life13_115;
    java.lang.String life14_119;
    forest_join_153: {
    forest_join_74: {
    forest_join_53: {
    forest_join_52: {
    forest_join_40: {
    forest_join_38: {
    forest_join_25: {
    forest_join_23: {
    life1_3 = (__fieldRead523_0() ^ 96333568574955L);
    life4_5 = null;
    spill523_0 = __call523_1();
    life5_8 = null;
    life3_9 = spill523_0;
    spill523_1 = p0;
    spill523_2 = "Name";
    if (!((life3_9 == null))) {
        forestValue523_23_0 = spill523_1;
        forestValue523_23_1 = spill523_2;
        break forest_join_23;
    }
    if (!(__call523_3(spill523_1, spill523_2, __invokedynamic523_2(4614, (2332213841918709112L ^ life1_3))))) {
        break forest_join_25;
    }
    forestValue523_23_0 = p0;
    forestValue523_23_1 = "Name";
    }
    life4_5 = __call523_4(forestValue523_23_0, forestValue523_23_1);
    }
    spill523_3 = p0;
    spill523_4 = "Id";
    if (!((life3_9 == null))) {
        forestValue523_38_0 = spill523_3;
        forestValue523_38_1 = spill523_4;
        break forest_join_38;
    }
    if (!(__call523_6(spill523_3, spill523_4, __invokedynamic523_5(5641, (1388434156749212020L ^ life1_3))))) {
        break forest_join_40;
    }
    forestValue523_38_0 = p0;
    forestValue523_38_1 = "Id";
    }
    life5_8 = __call523_7(forestValue523_38_0, forestValue523_38_1);
    }
    spill523_5 = life4_5;
    if (!((life3_9 == null))) {
        forestValue523_53_0 = spill523_5;
        break forest_join_53;
    }
    if (!(__call523_8(spill523_5))) {
        break forest_join_52;
    }
    spill523_6 = life5_8;
    if (!((life3_9 == null))) {
        forestValue523_53_0 = spill523_6;
        break forest_join_53;
    }
    if (!(__call523_9(spill523_6))) {
        break forest_join_52;
    }
    return null;
    }
    forestValue523_53_0 = life5_8;
    }
    life6_61 = __call523_10(forestValue523_53_0);
    life7_68 = new com.mojang.authlib.GameProfile(life6_61, life4_5);
    spill523_7 = p0;
    spill523_8 = "Properties";
    if (!((life3_9 == null))) {
        forestValue523_74_0 = spill523_7;
        forestValue523_74_1 = spill523_8;
        break forest_join_74;
    }
    if (!(__call523_12(spill523_7, spill523_8, __invokedynamic523_11(11248, (7129334516791899279L ^ life1_3))))) {
        break forest_join_153;
    }
    forestValue523_74_0 = p0;
    forestValue523_74_1 = "Properties";
    }
    life8_85 = __call523_13(forestValue523_74_0, forestValue523_74_1);
    life9_89 = __call523_15(__call523_14(life8_85));
    forest_cycle_80: while (true) {
    forest_join_151: {
    forestValue523_82_0 = __integerCategory523_17(__call523_16(life9_89));
    forest_cycle_82: while (true) {
    if (!((forestValue523_82_0 != 0))) {
        break forest_join_153;
    }
    life10_96 = __cast523_19(__call523_18(life9_89));
    life11_105 = __call523_21(life8_85, life10_96, __invokedynamic523_20(30291, (365645120697346351L ^ life1_3)));
    life12_107 = 0;
    forest_cycle_98: while (true) {
    forest_join_148: {
    forest_join_147: {
    forest_join_138: {
    if (!((life12_107 < __call523_22(life11_105)))) {
        break forest_join_151;
    }
    life13_115 = __call523_23(life11_105, life12_107);
    life14_119 = __call523_24(life13_115, "Value");
    spill523_9 = __call523_26(life13_115, "Signature", __invokedynamic523_25(5641, (1388434156749212020L ^ life1_3)));
    if (!((life3_9 == null))) {
        forestValue523_82_0 = __integerCategory523_27(spill523_9);
        continue forest_cycle_82;
    }
    if (!((life3_9 == null))) {
        forestValue523_147_0 = __integerCategory523_28(spill523_9);
        break forest_join_147;
    }
    if (!(spill523_9)) {
        break forest_join_138;
    }
    __call523_31(__call523_29(life7_68), life10_96, new com.mojang.authlib.properties.Property(life10_96, life14_119, __call523_30(life13_115, "Signature")));
    if (!((life3_9 != null))) {
        break forest_join_148;
    }
    }
    forestValue523_147_0 = __integerCategory523_34(__call523_33(__call523_32(life7_68), life10_96, new com.mojang.authlib.properties.Property(life10_96, life14_119)));
    }
    __discardScalar523_35(forestValue523_147_0);
    }
    life12_107 += 1;
    if (!((life3_9 != null))) {
        continue forest_cycle_98;
    }
    break forest_cycle_98;
    }
    break forest_cycle_82;
    }
    }
    if (!((life3_9 != null))) {
        continue forest_cycle_80;
    }
    break forest_cycle_80;
    }
    }
    return life7_68;
}
public static com.mojang.authlib.GameProfile h523_0(java.lang.Throwable p0) throws Throwable {
    throw __call3052300_0(p0);
}
public static com.mojang.authlib.GameProfile h523_1(java.lang.Throwable p0) throws Throwable {
    throw __call3052301_0(p0);
}
public static com.mojang.authlib.GameProfile h523_2(java.lang.Throwable p0) throws Throwable {
    throw __call3052302_0(p0);
}
public static com.mojang.authlib.GameProfile h523_3(java.lang.Throwable p0) throws Throwable {
    throw __call3052303_0(p0);
}
public static com.mojang.authlib.GameProfile h523_4(java.lang.Throwable p0) throws Throwable {
    throw __call3052304_0(p0);
}
public static com.mojang.authlib.GameProfile h523_5(java.lang.Throwable p0) throws Throwable {
    throw __call3052305_0(p0);
}
public static com.mojang.authlib.GameProfile h523_6(java.lang.Throwable p0) throws Throwable {
    throw __call3052306_0(p0);
}
public static com.mojang.authlib.GameProfile h523_7(java.lang.Throwable p0) throws Throwable {
    throw __call3052307_0(p0);
}
public static com.mojang.authlib.GameProfile h523_8(java.lang.Throwable p0, net.minecraft.nbt.NBTTagCompound p1, long p2, java.lang.String p3, java.lang.String p4, java.util.UUID p5) throws Throwable {
    net.minecraft.nbt.NBTTagCompound forestValue3052308_23_0;
    java.lang.String forestValue3052308_23_1;
    int forestValue3052308_31_0;
    int forestValue3052308_96_0;
    net.minecraft.nbt.NBTTagCompound spill3052308_0;
    java.lang.String spill3052308_1;
    boolean spill3052308_2;
    java.lang.Throwable life7_2;
    java.util.UUID life6_4;
    com.mojang.authlib.GameProfile life7_10;
    net.minecraft.nbt.NBTTagCompound life8_27;
    java.util.Iterator life9_31;
    java.lang.String life10_38;
    net.minecraft.nbt.NBTTagList life11_47;
    int life12_49;
    net.minecraft.nbt.NBTTagCompound life13_57;
    java.lang.String life14_61;
    forest_join_102: {
    forest_join_23: {
    life7_2 = p0;
    life6_4 = null;
    life7_10 = new com.mojang.authlib.GameProfile(life6_4, p4);
    spill3052308_0 = p1;
    spill3052308_1 = "Properties";
    if (!((p3 == null))) {
        forestValue3052308_23_0 = spill3052308_0;
        forestValue3052308_23_1 = spill3052308_1;
        break forest_join_23;
    }
    if (!(__call3052308_1(spill3052308_0, spill3052308_1, __invokedynamic3052308_0(11248, (7129334516791899279L ^ p2))))) {
        break forest_join_102;
    }
    forestValue3052308_23_0 = p1;
    forestValue3052308_23_1 = "Properties";
    }
    life8_27 = __call3052308_2(forestValue3052308_23_0, forestValue3052308_23_1);
    life9_31 = __call3052308_4(__call3052308_3(life8_27));
    forest_cycle_29: while (true) {
    forest_join_100: {
    forestValue3052308_31_0 = __integerCategory3052308_6(__call3052308_5(life9_31));
    forest_cycle_31: while (true) {
    if (!((forestValue3052308_31_0 != 0))) {
        break forest_join_102;
    }
    life10_38 = __cast3052308_8(__call3052308_7(life9_31));
    life11_47 = __call3052308_10(life8_27, life10_38, __invokedynamic3052308_9(30291, (365645120697346351L ^ p2)));
    life12_49 = 0;
    forest_cycle_47: while (true) {
    forest_join_97: {
    forest_join_96: {
    forest_join_87: {
    if (!((life12_49 < __call3052308_11(life11_47)))) {
        break forest_join_100;
    }
    life13_57 = __call3052308_12(life11_47, life12_49);
    life14_61 = __call3052308_13(life13_57, "Value");
    spill3052308_2 = __call3052308_15(life13_57, "Signature", __invokedynamic3052308_14(5641, (1388434156749212020L ^ p2)));
    if (!((p3 == null))) {
        forestValue3052308_31_0 = __integerCategory3052308_16(spill3052308_2);
        continue forest_cycle_31;
    }
    if (!((p3 == null))) {
        forestValue3052308_96_0 = __integerCategory3052308_17(spill3052308_2);
        break forest_join_96;
    }
    if (!(spill3052308_2)) {
        break forest_join_87;
    }
    __call3052308_20(__call3052308_18(life7_10), life10_38, new com.mojang.authlib.properties.Property(life10_38, life14_61, __call3052308_19(life13_57, "Signature")));
    if (!((p3 != null))) {
        break forest_join_97;
    }
    }
    forestValue3052308_96_0 = __integerCategory3052308_23(__call3052308_22(__call3052308_21(life7_10), life10_38, new com.mojang.authlib.properties.Property(life10_38, life14_61)));
    }
    __discardScalar3052308_24(forestValue3052308_96_0);
    }
    life12_49 += 1;
    if (!((p3 != null))) {
        continue forest_cycle_47;
    }
    break forest_cycle_47;
    }
    break forest_cycle_31;
    }
    }
    if (!((p3 != null))) {
        continue forest_cycle_29;
    }
    break forest_cycle_29;
    }
    }
    return life7_10;
}
public static com.mojang.authlib.GameProfile h523_9(java.lang.Throwable p0) throws Throwable {
    throw __call3052309_0(p0);
}
public static com.mojang.authlib.GameProfile h523_10(java.lang.Throwable p0) throws Throwable {
    throw __call3052310_0(p0);
}
public static com.mojang.authlib.GameProfile h523_11(java.lang.Throwable p0) throws Throwable {
    throw __call3052311_0(p0);
}
public static com.mojang.authlib.GameProfile h523_12(java.lang.Throwable p0) throws Throwable {
    throw __call3052312_0(p0);
}
public static com.mojang.authlib.GameProfile h523_13(java.lang.Throwable p0) throws Throwable {
    throw __call3052313_0(p0);
}
private static native long __fieldRead523_0() throws Throwable;
private static native java.lang.String __call523_1() throws Throwable;
private static native int __invokedynamic523_2(int a0, long a1) throws Throwable;
private static native boolean __call523_3(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native java.lang.String __call523_4(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native int __invokedynamic523_5(int a0, long a1) throws Throwable;
private static native boolean __call523_6(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native java.lang.String __call523_7(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native boolean __call523_8(java.lang.String a0) throws Throwable;
private static native boolean __call523_9(java.lang.String a0) throws Throwable;
private static native java.util.UUID __call523_10(java.lang.String a0) throws Throwable;
private static native int __invokedynamic523_11(int a0, long a1) throws Throwable;
private static native boolean __call523_12(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call523_13(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native java.util.Set __call523_14(net.minecraft.nbt.NBTTagCompound a0) throws Throwable;
private static native java.util.Iterator __call523_15(java.util.Set a0) throws Throwable;
private static native boolean __call523_16(java.util.Iterator a0) throws Throwable;
private static native int __integerCategory523_17(boolean value) throws Throwable;
private static native java.lang.Object __call523_18(java.util.Iterator a0) throws Throwable;
private static native java.lang.String __cast523_19(java.lang.Object a0) throws Throwable;
private static native int __invokedynamic523_20(int a0, long a1) throws Throwable;
private static native net.minecraft.nbt.NBTTagList __call523_21(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native int __call523_22(net.minecraft.nbt.NBTTagList a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call523_23(net.minecraft.nbt.NBTTagList a0, int a1) throws Throwable;
private static native java.lang.String __call523_24(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native int __invokedynamic523_25(int a0, long a1) throws Throwable;
private static native boolean __call523_26(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native int __integerCategory523_27(boolean value) throws Throwable;
private static native int __integerCategory523_28(boolean value) throws Throwable;
private static native com.mojang.authlib.properties.PropertyMap __call523_29(com.mojang.authlib.GameProfile a0) throws Throwable;
private static native java.lang.String __call523_30(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native boolean __call523_31(com.mojang.authlib.properties.PropertyMap a0, java.lang.String a1, com.mojang.authlib.properties.Property a2) throws Throwable;
private static native com.mojang.authlib.properties.PropertyMap __call523_32(com.mojang.authlib.GameProfile a0) throws Throwable;
private static native boolean __call523_33(com.mojang.authlib.properties.PropertyMap a0, java.lang.String a1, com.mojang.authlib.properties.Property a2) throws Throwable;
private static native int __integerCategory523_34(boolean value) throws Throwable;
private static native void __discardScalar523_35(int a0) throws Throwable;
private static native java.lang.Throwable __call3052300_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3052301_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3052302_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3052303_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3052304_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3052305_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3052306_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3052307_0(java.lang.Throwable a0) throws Throwable;
private static native int __invokedynamic3052308_0(int a0, long a1) throws Throwable;
private static native boolean __call3052308_1(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call3052308_2(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native java.util.Set __call3052308_3(net.minecraft.nbt.NBTTagCompound a0) throws Throwable;
private static native java.util.Iterator __call3052308_4(java.util.Set a0) throws Throwable;
private static native boolean __call3052308_5(java.util.Iterator a0) throws Throwable;
private static native int __integerCategory3052308_6(boolean value) throws Throwable;
private static native java.lang.Object __call3052308_7(java.util.Iterator a0) throws Throwable;
private static native java.lang.String __cast3052308_8(java.lang.Object a0) throws Throwable;
private static native int __invokedynamic3052308_9(int a0, long a1) throws Throwable;
private static native net.minecraft.nbt.NBTTagList __call3052308_10(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native int __call3052308_11(net.minecraft.nbt.NBTTagList a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call3052308_12(net.minecraft.nbt.NBTTagList a0, int a1) throws Throwable;
private static native java.lang.String __call3052308_13(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native int __invokedynamic3052308_14(int a0, long a1) throws Throwable;
private static native boolean __call3052308_15(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native int __integerCategory3052308_16(boolean value) throws Throwable;
private static native int __integerCategory3052308_17(boolean value) throws Throwable;
private static native com.mojang.authlib.properties.PropertyMap __call3052308_18(com.mojang.authlib.GameProfile a0) throws Throwable;
private static native java.lang.String __call3052308_19(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native boolean __call3052308_20(com.mojang.authlib.properties.PropertyMap a0, java.lang.String a1, com.mojang.authlib.properties.Property a2) throws Throwable;
private static native com.mojang.authlib.properties.PropertyMap __call3052308_21(com.mojang.authlib.GameProfile a0) throws Throwable;
private static native boolean __call3052308_22(com.mojang.authlib.properties.PropertyMap a0, java.lang.String a1, com.mojang.authlib.properties.Property a2) throws Throwable;
private static native int __integerCategory3052308_23(boolean value) throws Throwable;
private static native void __discardScalar3052308_24(int a0) throws Throwable;
private static native java.lang.Throwable __call3052309_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3052310_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3052311_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3052312_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3052313_0(java.lang.Throwable a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.nbt.NBTTagCompound __sourceHandlerCall_d0d14cf2edece67a1237(net.minecraft.nbt.NBTTagCompound a0, com.mojang.authlib.GameProfile a1) throws E;
private static final class __SourceHandler_d0d14cf2edece67a1237 {

public static net.minecraft.nbt.NBTTagCompound f946(net.minecraft.nbt.NBTTagCompound p0, com.mojang.authlib.GameProfile p1) throws Throwable {
    com.mojang.authlib.GameProfile forestValue946_18_0;
    com.mojang.authlib.GameProfile forestValue946_29_0;
    int forestValue946_43_0;
    com.mojang.authlib.GameProfile spill946_0;
    boolean spill946_1;
    long life2_3;
    java.lang.String life4_5;
    net.minecraft.nbt.NBTTagCompound life5_39;
    java.util.Iterator life6_44;
    java.lang.String life7_51;
    net.minecraft.nbt.NBTTagList life8_55;
    java.util.Iterator life9_63;
    com.mojang.authlib.properties.Property life10_70;
    net.minecraft.nbt.NBTTagCompound life11_74;
    forest_join_103: {
    forest_join_99: {
    forest_join_29: {
    forest_join_28: {
    forest_join_18: {
    forest_join_17: {
    life2_3 = (__fieldRead946_0() ^ 92343943326507L);
    life4_5 = __call946_1();
    spill946_0 = p1;
    if (!((life4_5 == null))) {
        forestValue946_18_0 = spill946_0;
        break forest_join_18;
    }
    if (!((!__call946_3(__call946_2(spill946_0))))) {
        break forest_join_17;
    }
    __call946_5(p0, "Name", __call946_4(p1));
    }
    forestValue946_18_0 = p1;
    }
    if (!((life4_5 == null))) {
        forestValue946_29_0 = forestValue946_18_0;
        break forest_join_29;
    }
    if (!((__call946_6(forestValue946_18_0) != null))) {
        break forest_join_28;
    }
    __call946_9(p0, "Id", __call946_8(__call946_7(p1)));
    }
    forestValue946_29_0 = p1;
    }
    if (!((!__call946_11(__call946_10(forestValue946_29_0))))) {
        break forest_join_103;
    }
    life5_39 = new net.minecraft.nbt.NBTTagCompound();
    life6_44 = __call946_14(__call946_13(__call946_12(p1)));
    forest_cycle_41: while (true) {
    forest_join_93: {
    forestValue946_43_0 = __integerCategory946_16(__call946_15(life6_44));
    forest_cycle_43: while (true) {
    if (!((forestValue946_43_0 != 0))) {
        break forest_join_99;
    }
    life7_51 = __cast946_18(__call946_17(life6_44));
    life8_55 = new net.minecraft.nbt.NBTTagList();
    if (!((life4_5 == null))) {
        break forest_join_103;
    }
    life9_63 = __call946_21(__call946_20(__call946_19(p1), life7_51));
    forest_cycle_60: while (true) {
    forest_join_91: {
    forest_join_88: {
    if (!(__call946_22(life9_63))) {
        break forest_join_93;
    }
    life10_70 = __cast946_24(__call946_23(life9_63));
    life11_74 = new net.minecraft.nbt.NBTTagCompound();
    __call946_26(life11_74, "Value", __call946_25(life10_70));
    if (!((life4_5 == null))) {
        break forest_join_91;
    }
    spill946_1 = __call946_27(life10_70);
    if (!((life4_5 == null))) {
        forestValue946_43_0 = __integerCategory946_28(spill946_1);
        continue forest_cycle_43;
    }
    if (!(spill946_1)) {
        break forest_join_88;
    }
    __call946_30(life11_74, "Signature", __call946_29(life10_70));
    }
    __call946_31(life8_55, life11_74);
    }
    if (!((life4_5 != null))) {
        continue forest_cycle_60;
    }
    break forest_cycle_60;
    }
    break forest_cycle_43;
    }
    }
    __call946_32(life5_39, life7_51, life8_55);
    if (!((life4_5 != null))) {
        continue forest_cycle_41;
    }
    break forest_cycle_41;
    }
    }
    __call946_33(p0, "Properties", life5_39);
    }
    return p0;
}
public static net.minecraft.nbt.NBTTagCompound h946_0(moom.Oo p0) throws Throwable {
    throw __call3094600_0(p0);
}
public static net.minecraft.nbt.NBTTagCompound h946_1(moom.Oo p0) throws Throwable {
    throw __call3094601_0(p0);
}
public static net.minecraft.nbt.NBTTagCompound h946_2(moom.Oo p0) throws Throwable {
    throw __call3094602_0(p0);
}
public static net.minecraft.nbt.NBTTagCompound h946_3(moom.Oo p0) throws Throwable {
    throw __call3094603_0(p0);
}
public static net.minecraft.nbt.NBTTagCompound h946_4(moom.Oo p0) throws Throwable {
    throw __call3094604_0(p0);
}
public static net.minecraft.nbt.NBTTagCompound h946_5(moom.Oo p0) throws Throwable {
    throw __call3094605_0(p0);
}
private static native long __fieldRead946_0() throws Throwable;
private static native java.lang.String __call946_1() throws Throwable;
private static native java.lang.String __call946_2(com.mojang.authlib.GameProfile a0) throws Throwable;
private static native boolean __call946_3(java.lang.String a0) throws Throwable;
private static native java.lang.String __call946_4(com.mojang.authlib.GameProfile a0) throws Throwable;
private static native void __call946_5(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native java.util.UUID __call946_6(com.mojang.authlib.GameProfile a0) throws Throwable;
private static native java.util.UUID __call946_7(com.mojang.authlib.GameProfile a0) throws Throwable;
private static native java.lang.String __call946_8(java.util.UUID a0) throws Throwable;
private static native void __call946_9(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native com.mojang.authlib.properties.PropertyMap __call946_10(com.mojang.authlib.GameProfile a0) throws Throwable;
private static native boolean __call946_11(com.mojang.authlib.properties.PropertyMap a0) throws Throwable;
private static native com.mojang.authlib.properties.PropertyMap __call946_12(com.mojang.authlib.GameProfile a0) throws Throwable;
private static native java.util.Set __call946_13(com.mojang.authlib.properties.PropertyMap a0) throws Throwable;
private static native java.util.Iterator __call946_14(java.util.Set a0) throws Throwable;
private static native boolean __call946_15(java.util.Iterator a0) throws Throwable;
private static native int __integerCategory946_16(boolean value) throws Throwable;
private static native java.lang.Object __call946_17(java.util.Iterator a0) throws Throwable;
private static native java.lang.String __cast946_18(java.lang.Object a0) throws Throwable;
private static native com.mojang.authlib.properties.PropertyMap __call946_19(com.mojang.authlib.GameProfile a0) throws Throwable;
private static native java.util.Collection __call946_20(com.mojang.authlib.properties.PropertyMap a0, java.lang.String a1) throws Throwable;
private static native java.util.Iterator __call946_21(java.util.Collection a0) throws Throwable;
private static native boolean __call946_22(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call946_23(java.util.Iterator a0) throws Throwable;
private static native com.mojang.authlib.properties.Property __cast946_24(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call946_25(com.mojang.authlib.properties.Property a0) throws Throwable;
private static native void __call946_26(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native boolean __call946_27(com.mojang.authlib.properties.Property a0) throws Throwable;
private static native int __integerCategory946_28(boolean value) throws Throwable;
private static native java.lang.String __call946_29(com.mojang.authlib.properties.Property a0) throws Throwable;
private static native void __call946_30(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native void __call946_31(net.minecraft.nbt.NBTTagList a0, net.minecraft.nbt.NBTTagCompound a1) throws Throwable;
private static native void __call946_32(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, net.minecraft.nbt.NBTTagList a2) throws Throwable;
private static native void __call946_33(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, net.minecraft.nbt.NBTTagCompound a2) throws Throwable;
private static native java.lang.Throwable __call3094600_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3094601_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3094602_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3094603_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3094604_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3094605_0(moom.Oo a0) throws Throwable;

}


private static java.lang.Throwable a(java.lang.Throwable p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 2386;
      if (c[var3] == null) {
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
         long var5 = b[var3];
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
         Object[] var9 = (Object[])d.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               d.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/yD", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         c[var3] = var15;
      }

      return c[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.yD.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral9787_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/yD"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public static com.mojang.authlib.GameProfile a(net.minecraft.nbt.NBTTagCompound p0) { return __sourceHandlerCall_045cde962b9e86c7bc43(p0); }


public static boolean a(net.minecraft.nbt.NBTBase p0, net.minecraft.nbt.NBTBase p1, boolean p2) { return __sourceHandlerCall_d3d4e22af5c3ef02aef3(p0, p1, p2); }


public static net.minecraft.nbt.NBTTagCompound a(net.minecraft.nbt.NBTTagCompound p0, com.mojang.authlib.GameProfile p1) { return __sourceHandlerCall_d0d14cf2edece67a1237(p0, p1); }


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral9787_0() throws E;
}
