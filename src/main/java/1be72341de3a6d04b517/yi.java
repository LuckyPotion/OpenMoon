package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class yi {

private static org.apache.logging.log4j.Logger a;

private static java.util.regex.Pattern b;

private static long c;

private static long[] d;

private static java.lang.Integer[] e;

private static java.util.Map f;

public yi() {
super();
}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(3262281692091853385L)), ((long)(289553822909830504L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(28686231355652L)))));
    f = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.yi.c ^ 66757482659373L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1713_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1713_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1713_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1713_14 = new byte[8];
    (__sourceSpill1713_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1713_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1713_16 = __sourceSpill1713_14;
    ((javax.crypto.Cipher)(__sourceSpill1713_11)).init(((int)(__sourceSpill1713_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1713_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1713_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[15];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "´i vFôòEU\tWáðUô\t<Ñpï\fF\001®\024t\013Ue×rc|wút5XùÄ\034D¬&ãå÷çê¬ÌÏ»S`0:ì1¶tQÍjr/Bï\025\017©Z}dKnÉÇs-çuz§\0032 .ÎY`Ê"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1713_25 = local6_life21;
        int __sourceSpill1713_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1713_25)).substring(((int)(__sourceSpill1713_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1713_30 = local8_life19;
        int __sourceSpill1713_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1713_33 = new byte[8];
        (__sourceSpill1713_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1713_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1713_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1713_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1713_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1713_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1713_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1713_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1713_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1713_34)).doFinal(((byte[])(__sourceSpill1713_33)));
        (__sourceSpill1713_30)[__sourceSpill1713_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "æ±Ãi>\024çª´n\007c "))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1713_38 = local6_life21;
        int __sourceSpill1713_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1713_38)).substring(((int)(__sourceSpill1713_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1713_43 = local8_life19;
        int __sourceSpill1713_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1713_46 = new byte[8];
        (__sourceSpill1713_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1713_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1713_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1713_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1713_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1713_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1713_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1713_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1713_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1713_47)).doFinal(((byte[])(__sourceSpill1713_46)));
        (__sourceSpill1713_43)[__sourceSpill1713_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    d = ((long[])(local8_life19));
    e = ((java.lang.Integer[])(new java.lang.Integer[15]));
    a = ((org.apache.logging.log4j.Logger)(org.apache.logging.log4j.LogManager.getLogger()));
    b = ((java.util.regex.Pattern)(java.util.regex.Pattern.compile(((java.lang.String)("\\[[-+\\d|,\\s]+]")))));
}

private static native <E extends Throwable> int __sourceHandlerCall_a7874b76cdf96fbe913f(java.lang.String a0) throws E;
private static final class __SourceHandler_a7874b76cdf96fbe913f {

public static int f193(java.lang.String p0) throws Throwable {
    int lexicalValue193_50_0;
    int lexicalValue193_54_0;
    int lexicalValue193_56_0;
    int lexicalValue193_60_0;
    int lexicalValue193_64_0;
    int lexicalValue193_99_0;
    int lexicalValue193_121_0;
    int lexicalValue193_121_1;
    int lexicalValue193_124_0;
    int lexicalValue193_131_0;
    int lexicalValue193_147_0;
    java.lang.Object lexicalValue193_153_0;
    int lexicalValue193_158_0;
    int lexicalValue193_169_0;
    int lexicalValue193_179_0;
    int lexicalValue193_190_0;
    int lexicalValue193_194_0;
    java.lang.String spill193_0;
    int spill193_1;
    boolean spill193_2;
    int spill193_3;
    int spill193_4;
    int spill193_5;
    boolean spill193_6;
    int spill193_7;
    int spill193_8;
    java.util.Stack spill193_9;
    boolean spill193_10;
    long life1_3;
    int life4_5;
    int life5_8;
    java.lang.String life3_9;
    java.util.Stack life6_13;
    int life7_15;
    int life8_23;
    lexical_join_194: {
    lexical_join_190: {
    lexical_join_189: {
    lexical_join_179: {
    lexical_join_178: {
    lexical_join_169: {
    lexical_join_167: {
    lexical_join_158: {
    lexical_join_157: {
    life1_3 = (__fieldRead193_0() ^ 115914482370678L);
    life4_5 = 0;
    spill193_0 = __call193_1();
    life5_8 = 0;
    life3_9 = spill193_0;
    life6_13 = new java.util.Stack();
    life7_15 = 0;
    lexical_cycle_16: while (true) {
    lexical_join_154: {
    lexical_join_153: {
    lexical_join_149: {
    lexical_join_147: {
    lexical_join_143: {
    lexical_join_137: {
    lexical_join_131: {
    lexical_join_124: {
    lexical_join_121: {
    lexical_join_113: {
    lexical_join_107: {
    lexical_join_99: {
    lexical_join_64: {
    lexical_join_60: {
    lexical_join_59: {
    lexical_join_56: {
    lexical_join_55: {
    lexical_join_54: {
    lexical_join_50: {
    lexical_join_49: {
    if (!((life7_15 < __call193_2(p0)))) {
        break lexical_join_157;
    }
    life8_23 = __integerCategory193_4(__call193_3(p0, life7_15));
    spill193_1 = life8_23;
    if (!((life3_9 == null))) {
        lexicalValue193_158_0 = spill193_1;
        break lexical_join_158;
    }
    if (!((life3_9 == null))) {
        lexicalValue193_60_0 = spill193_1;
        break lexical_join_60;
    }
    if (!((spill193_1 == __invokedynamic193_5(12673, (8495688510008522795L ^ life1_3))))) {
        break lexical_join_59;
    }
    spill193_2 = __call193_6(p0, life7_15);
    if (!((life3_9 == null))) {
        lexicalValue193_50_0 = __integerCategory193_7(spill193_2);
        break lexical_join_50;
    }
    if (!(spill193_2)) {
        break lexical_join_49;
    }
    if (!((life5_8 == 0))) {
        break lexical_join_154;
    }
    throw new net.minecraft.nbt.NBTException(__invokedynamic193_8(p0));
    }
    lexicalValue193_50_0 = life5_8;
    }
    if (!((life3_9 == null))) {
        lexicalValue193_54_0 = lexicalValue193_50_0;
        break lexical_join_54;
    }
    if (!((lexicalValue193_50_0 == 0))) {
        break lexical_join_55;
    }
    lexicalValue193_54_0 = 1;
    }
    lexicalValue193_56_0 = lexicalValue193_54_0;
    break lexical_join_56;
    }
    lexicalValue193_56_0 = 0;
    }
    life5_8 = lexicalValue193_56_0;
    if (!((life3_9 != null))) {
        break lexical_join_154;
    }
    }
    lexicalValue193_60_0 = life5_8;
    }
    if (!((life3_9 == null))) {
        lexicalValue193_64_0 = lexicalValue193_60_0;
        break lexical_join_64;
    }
    if (!((lexicalValue193_60_0 == 0))) {
        break lexical_join_154;
    }
    lexicalValue193_64_0 = life8_23;
    }
    if (!((life3_9 == null))) {
        lexicalValue193_147_0 = lexicalValue193_64_0;
        break lexical_join_147;
    }
    if (!((lexicalValue193_64_0 != __invokedynamic193_9(9434, (794151733303569777L ^ life1_3))))) {
        break lexical_join_143;
    }
    spill193_3 = life8_23;
    if (!((life3_9 == null))) {
        lexicalValue193_147_0 = spill193_3;
        break lexical_join_147;
    }
    if (!((spill193_3 != __invokedynamic193_10(4595, (6877316077726423124L ^ life1_3))))) {
        break lexical_join_143;
    }
    spill193_4 = life8_23;
    spill193_5 = __invokedynamic193_11(13927, (5619800922016874433L ^ life1_3));
    if (!((life3_9 == null))) {
        lexicalValue193_121_0 = spill193_4;
        lexicalValue193_121_1 = spill193_5;
        break lexical_join_121;
    }
    if (!((spill193_4 == spill193_5))) {
        break lexical_join_113;
    }
    spill193_6 = __call193_12(life6_13);
    if (!((life3_9 == null))) {
        lexicalValue193_99_0 = __integerCategory193_13(spill193_6);
        break lexical_join_99;
    }
    if (!((!spill193_6))) {
        break lexical_join_107;
    }
    lexicalValue193_99_0 = __integerCategory193_17(__call193_16(__cast193_15(__call193_14(life6_13))));
    }
    spill193_7 = __invokedynamic193_18(9434, (794151733303569777L ^ life1_3));
    if (!((life3_9 == null))) {
        lexicalValue193_121_0 = lexicalValue193_99_0;
        lexicalValue193_121_1 = spill193_7;
        break lexical_join_121;
    }
    if (!((lexicalValue193_99_0 != spill193_7))) {
        break lexical_join_113;
    }
    }
    throw new net.minecraft.nbt.NBTException(__invokedynamic193_19(p0));
    }
    spill193_8 = life8_23;
    if (!((life3_9 == null))) {
        lexicalValue193_124_0 = spill193_8;
        break lexical_join_124;
    }
    lexicalValue193_121_0 = spill193_8;
    lexicalValue193_121_1 = __invokedynamic193_20(12229, (724162879111423588L ^ life1_3));
    }
    if (!((lexicalValue193_121_0 == lexicalValue193_121_1))) {
        break lexical_join_154;
    }
    lexicalValue193_124_0 = __integerCategory193_22(__call193_21(life6_13));
    }
    if (!((life3_9 == null))) {
        lexicalValue193_131_0 = lexicalValue193_124_0;
        break lexical_join_131;
    }
    if (!((lexicalValue193_124_0 == 0))) {
        break lexical_join_137;
    }
    lexicalValue193_131_0 = __integerCategory193_26(__call193_25(__cast193_24(__call193_23(life6_13))));
    }
    if (!((lexicalValue193_131_0 != __invokedynamic193_27(4595, (6877316077726423124L ^ life1_3))))) {
        break lexical_join_154;
    }
    }
    throw new net.minecraft.nbt.NBTException(__invokedynamic193_28(p0));
    }
    spill193_9 = life6_13;
    if (!((life3_9 == null))) {
        lexicalValue193_153_0 = spill193_9;
        break lexical_join_153;
    }
    lexicalValue193_147_0 = __integerCategory193_30(__call193_29(spill193_9));
    }
    if (!((lexicalValue193_147_0 != 0))) {
        break lexical_join_149;
    }
    life4_5 += 1;
    }
    lexicalValue193_153_0 = __call193_32(life6_13, __call193_31(life8_23));
    }
    __discardScalar193_33(lexicalValue193_153_0);
    }
    life7_15 += 1;
    if (!((life3_9 != null))) { continue lexical_cycle_16; }
    break lexical_cycle_16;
    }
    }
    lexicalValue193_158_0 = life5_8;
    }
    if (!((life3_9 == null))) {
        lexicalValue193_169_0 = lexicalValue193_158_0;
        break lexical_join_169;
    }
    if (!((lexicalValue193_158_0 != 0))) {
        break lexical_join_167;
    }
    throw new net.minecraft.nbt.NBTException(__invokedynamic193_34(p0));
    }
    lexicalValue193_169_0 = __integerCategory193_36(__call193_35(life6_13));
    }
    if (!((life3_9 == null))) {
        lexicalValue193_179_0 = lexicalValue193_169_0;
        break lexical_join_179;
    }
    if (!((lexicalValue193_169_0 == 0))) {
        break lexical_join_178;
    }
    throw new net.minecraft.nbt.NBTException(__invokedynamic193_37(p0));
    }
    lexicalValue193_179_0 = life4_5;
    }
    if (!((life3_9 == null))) {
        lexicalValue193_190_0 = lexicalValue193_179_0;
        break lexical_join_190;
    }
    if (!((lexicalValue193_179_0 == 0))) {
        break lexical_join_189;
    }
    spill193_10 = __call193_38(p0);
    if (!((life3_9 == null))) {
        lexicalValue193_190_0 = __integerCategory193_39(spill193_10);
        break lexical_join_190;
    }
    if (!((!spill193_10))) {
        break lexical_join_189;
    }
    life4_5 = 1;
    }
    lexicalValue193_190_0 = life4_5;
    }
    if (!((__call193_40() != null))) {
        lexicalValue193_194_0 = lexicalValue193_190_0;
        break lexical_join_194;
    }
    __call193_41("WamuWc");
    lexicalValue193_194_0 = lexicalValue193_190_0;
    }
    return lexicalValue193_194_0;
}
public static void h193_0(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1019300_0(p0);
}
public static void h193_1(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1019301_0(p0);
}
public static void h193_2(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1019302_0(p0);
}
public static void h193_3(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1019303_0(p0);
}
public static void h193_4(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1019304_0(p0);
}
public static void h193_5(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1019305_0(p0);
}
public static void h193_6(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1019306_0(p0);
}
public static void h193_7(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1019307_0(p0);
}
public static void h193_8(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1019308_0(p0);
}
public static void h193_9(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1019309_0(p0);
}
public static void h193_10(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1019310_0(p0);
}
public static void h193_11(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1019311_0(p0);
}
public static void h193_12(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1019312_0(p0);
}
public static void h193_13(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1019313_0(p0);
}
public static void h193_14(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1019314_0(p0);
}
public static void h193_15(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1019315_0(p0);
}
public static void h193_16(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1019316_0(p0);
}
public static void h193_17(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1019317_0(p0);
}
public static void h193_18(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1019318_0(p0);
}
public static void h193_19(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1019319_0(p0);
}
public static void h193_20(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1019320_0(p0);
}
public static void h193_21(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1019321_0(p0);
}
public static void h193_22(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1019322_0(p0);
}
public static void h193_23(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1019323_0(p0);
}
public static void h193_24(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1019324_0(p0);
}
public static void h193_25(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1019325_0(p0);
}
public static void h193_26(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1019326_0(p0);
}
public static void h193_27(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1019327_0(p0);
}
public static void h193_28(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1019328_0(p0);
}
public static void h193_29(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1019329_0(p0);
}
public static void h193_30(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1019330_0(p0);
}
public static void h193_31(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1019331_0(p0);
}
public static void h193_32(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1019332_0(p0);
}
private static native long __fieldRead193_0() throws Throwable;
private static native java.lang.String __call193_1() throws Throwable;
private static native int __call193_2(java.lang.String a0) throws Throwable;
private static native char __call193_3(java.lang.String a0, int a1) throws Throwable;
private static native int __integerCategory193_4(char value) throws Throwable;
private static native int __invokedynamic193_5(int a0, long a1) throws Throwable;
private static native boolean __call193_6(java.lang.String a0, int a1) throws Throwable;
private static native int __integerCategory193_7(boolean value) throws Throwable;
private static native java.lang.String __invokedynamic193_8(java.lang.String a0) throws Throwable;
private static native int __invokedynamic193_9(int a0, long a1) throws Throwable;
private static native int __invokedynamic193_10(int a0, long a1) throws Throwable;
private static native int __invokedynamic193_11(int a0, long a1) throws Throwable;
private static native boolean __call193_12(java.util.Stack a0) throws Throwable;
private static native int __integerCategory193_13(boolean value) throws Throwable;
private static native java.lang.Object __call193_14(java.util.Stack a0) throws Throwable;
private static native java.lang.Character __cast193_15(java.lang.Object a0) throws Throwable;
private static native char __call193_16(java.lang.Character a0) throws Throwable;
private static native int __integerCategory193_17(char value) throws Throwable;
private static native int __invokedynamic193_18(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic193_19(java.lang.String a0) throws Throwable;
private static native int __invokedynamic193_20(int a0, long a1) throws Throwable;
private static native boolean __call193_21(java.util.Stack a0) throws Throwable;
private static native int __integerCategory193_22(boolean value) throws Throwable;
private static native java.lang.Object __call193_23(java.util.Stack a0) throws Throwable;
private static native java.lang.Character __cast193_24(java.lang.Object a0) throws Throwable;
private static native char __call193_25(java.lang.Character a0) throws Throwable;
private static native int __integerCategory193_26(char value) throws Throwable;
private static native int __invokedynamic193_27(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic193_28(java.lang.String a0) throws Throwable;
private static native boolean __call193_29(java.util.Stack a0) throws Throwable;
private static native int __integerCategory193_30(boolean value) throws Throwable;
private static native java.lang.Character __call193_31(int a0) throws Throwable;
private static native java.lang.Object __call193_32(java.util.Stack a0, java.lang.Character a1) throws Throwable;
private static native void __discardScalar193_33(java.lang.Object a0) throws Throwable;
private static native java.lang.String __invokedynamic193_34(java.lang.String a0) throws Throwable;
private static native boolean __call193_35(java.util.Stack a0) throws Throwable;
private static native int __integerCategory193_36(boolean value) throws Throwable;
private static native java.lang.String __invokedynamic193_37(java.lang.String a0) throws Throwable;
private static native boolean __call193_38(java.lang.String a0) throws Throwable;
private static native int __integerCategory193_39(boolean value) throws Throwable;
private static native java.lang.String[] __call193_40() throws Throwable;
private static native void __call193_41(java.lang.String a0) throws Throwable;
private static native java.lang.Exception __call1019300_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1019301_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1019302_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1019303_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1019304_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1019305_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1019306_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1019307_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1019308_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1019309_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1019310_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1019311_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1019312_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1019313_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1019314_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1019315_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1019316_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1019317_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1019318_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1019319_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1019320_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1019321_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1019322_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1019323_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1019324_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1019325_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1019326_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1019327_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1019328_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1019329_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1019330_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1019331_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1019332_0(net.minecraft.nbt.NBTException a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_2e97223ad54984d74613(java.lang.String a0, char a1) throws E;
private static final class __SourceHandler_2e97223ad54984d74613 {

public static int f1239(java.lang.String p0, char p1) throws Throwable {
    int lexicalValue1239_36_0;
    int lexicalValue1239_40_0;
    int lexicalValue1239_42_0;
    int lexicalValue1239_46_0;
    int lexicalValue1239_50_0;
    int lexicalValue1239_64_0;
    int lexicalValue1239_64_1;
    int lexicalValue1239_75_0;
    int lexicalValue1239_80_0;
    java.lang.String spill1239_0;
    int spill1239_1;
    boolean spill1239_2;
    char spill1239_3;
    int spill1239_4;
    int spill1239_5;
    long life2_3;
    int life5_6;
    java.lang.String life4_7;
    int life6_9;
    int life7_17;
    lexical_join_80: {
    lexical_join_79: {
    life2_3 = (__fieldRead1239_0() ^ 50538901172147L);
    spill1239_0 = __call1239_1();
    life5_6 = 0;
    life4_7 = spill1239_0;
    life6_9 = 1;
    lexical_cycle_10: while (true) {
    lexical_join_76: {
    lexical_join_75: {
    lexical_join_74: {
    lexical_join_64: {
    lexical_join_56: {
    lexical_join_50: {
    lexical_join_46: {
    lexical_join_45: {
    lexical_join_42: {
    lexical_join_41: {
    lexical_join_40: {
    lexical_join_36: {
    if (!((life5_6 < __call1239_2(p0)))) {
        break lexical_join_79;
    }
    life7_17 = __integerCategory1239_4(__call1239_3(p0, life5_6));
    spill1239_1 = life7_17;
    if (!((life4_7 == null))) {
        lexicalValue1239_80_0 = spill1239_1;
        break lexical_join_80;
    }
    if (!((life4_7 == null))) {
        lexicalValue1239_46_0 = spill1239_1;
        break lexical_join_46;
    }
    if (!((spill1239_1 == __invokedynamic1239_5(6701, (6054289060939297860L ^ life2_3))))) {
        break lexical_join_45;
    }
    spill1239_2 = __call1239_6(p0, life5_6);
    if (!((life4_7 == null))) {
        lexicalValue1239_36_0 = __integerCategory1239_7(spill1239_2);
        break lexical_join_36;
    }
    if (!((!spill1239_2))) {
        break lexical_join_76;
    }
    lexicalValue1239_36_0 = life6_9;
    }
    if (!((life4_7 == null))) {
        lexicalValue1239_40_0 = lexicalValue1239_36_0;
        break lexical_join_40;
    }
    if (!((lexicalValue1239_36_0 == 0))) {
        break lexical_join_41;
    }
    lexicalValue1239_40_0 = 1;
    }
    lexicalValue1239_42_0 = lexicalValue1239_40_0;
    break lexical_join_42;
    }
    lexicalValue1239_42_0 = 0;
    }
    life6_9 = lexicalValue1239_42_0;
    if (!((life4_7 != null))) {
        break lexical_join_76;
    }
    }
    lexicalValue1239_46_0 = life6_9;
    }
    if (!((life4_7 == null))) {
        lexicalValue1239_50_0 = lexicalValue1239_46_0;
        break lexical_join_50;
    }
    if (!((lexicalValue1239_46_0 != 0))) {
        break lexical_join_76;
    }
    lexicalValue1239_50_0 = life7_17;
    }
    spill1239_3 = p1;
    if (!((life4_7 == null))) {
        lexicalValue1239_64_0 = lexicalValue1239_50_0;
        lexicalValue1239_64_1 = __integerCategory1239_8(spill1239_3);
        break lexical_join_64;
    }
    if (!((lexicalValue1239_50_0 == spill1239_3))) {
        break lexical_join_56;
    }
    return life5_6;
    }
    spill1239_4 = life7_17;
    if (!((life4_7 == null))) {
        lexicalValue1239_75_0 = spill1239_4;
        break lexical_join_75;
    }
    lexicalValue1239_64_0 = spill1239_4;
    lexicalValue1239_64_1 = __invokedynamic1239_9(32305, (5825698224923283540L ^ life2_3));
    }
    if (!((lexicalValue1239_64_0 != lexicalValue1239_64_1))) {
        break lexical_join_74;
    }
    spill1239_5 = life7_17;
    if (!((life4_7 == null))) {
        lexicalValue1239_75_0 = spill1239_5;
        break lexical_join_75;
    }
    if (!((spill1239_5 == __invokedynamic1239_10(19792, (3788794800999670586L ^ life2_3))))) {
        break lexical_join_76;
    }
    }
    lexicalValue1239_75_0 = -1;
    }
    return lexicalValue1239_75_0;
    }
    life5_6 += 1;
    if (!((life4_7 != null))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    lexicalValue1239_80_0 = -1;
    }
    return lexicalValue1239_80_0;
}
public static void h1239_0(moom.Oo p0) throws Throwable {
    throw __call1123900_0(p0);
}
public static void h1239_1(moom.Oo p0) throws Throwable {
    throw __call1123901_0(p0);
}
public static void h1239_2(moom.Oo p0) throws Throwable {
    throw __call1123902_0(p0);
}
public static void h1239_3(moom.Oo p0) throws Throwable {
    throw __call1123903_0(p0);
}
public static void h1239_4(moom.Oo p0) throws Throwable {
    throw __call1123904_0(p0);
}
public static void h1239_5(moom.Oo p0) throws Throwable {
    throw __call1123905_0(p0);
}
public static void h1239_6(moom.Oo p0) throws Throwable {
    throw __call1123906_0(p0);
}
public static void h1239_7(moom.Oo p0) throws Throwable {
    throw __call1123907_0(p0);
}
public static void h1239_8(moom.Oo p0) throws Throwable {
    throw __call1123908_0(p0);
}
public static void h1239_9(moom.Oo p0) throws Throwable {
    throw __call1123909_0(p0);
}
public static void h1239_10(moom.Oo p0) throws Throwable {
    throw __call1123910_0(p0);
}
public static void h1239_11(moom.Oo p0) throws Throwable {
    throw __call1123911_0(p0);
}
public static void h1239_12(moom.Oo p0) throws Throwable {
    throw __call1123912_0(p0);
}
private static native long __fieldRead1239_0() throws Throwable;
private static native java.lang.String __call1239_1() throws Throwable;
private static native int __call1239_2(java.lang.String a0) throws Throwable;
private static native char __call1239_3(java.lang.String a0, int a1) throws Throwable;
private static native int __integerCategory1239_4(char value) throws Throwable;
private static native int __invokedynamic1239_5(int a0, long a1) throws Throwable;
private static native boolean __call1239_6(java.lang.String a0, int a1) throws Throwable;
private static native int __integerCategory1239_7(boolean value) throws Throwable;
private static native int __integerCategory1239_8(char value) throws Throwable;
private static native int __invokedynamic1239_9(int a0, long a1) throws Throwable;
private static native int __invokedynamic1239_10(int a0, long a1) throws Throwable;
private static native java.lang.Exception __call1123900_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1123901_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1123902_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1123903_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1123904_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1123905_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1123906_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1123907_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1123908_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1123909_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1123910_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1123911_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1123912_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_4bad045fb25f1c8e5741(java.lang.String a0, int a1) throws E;
private static final class __SourceHandler_4bad045fb25f1c8e5741 {

public static java.lang.String f1240(java.lang.String p0, int p1) throws Throwable {
    int lexicalValue1240_58_0;
    int lexicalValue1240_62_0;
    int lexicalValue1240_64_0;
    int lexicalValue1240_76_0;
    int lexicalValue1240_84_0;
    int lexicalValue1240_102_0;
    int lexicalValue1240_102_1;
    int lexicalValue1240_111_0;
    int lexicalValue1240_111_1;
    int lexicalValue1240_123_0;
    int lexicalValue1240_143_0;
    int lexicalValue1240_143_1;
    int lexicalValue1240_155_0;
    int lexicalValue1240_177_0;
    int lexicalValue1240_177_1;
    int lexicalValue1240_195_0;
    int lexicalValue1240_199_0;
    int lexicalValue1240_219_0;
    java.lang.String lexicalValue1240_225_0;
    int lexicalValue1240_225_1;
    java.lang.String spill1240_0;
    java.lang.String spill1240_1;
    int spill1240_2;
    int spill1240_3;
    boolean spill1240_4;
    int spill1240_5;
    int spill1240_6;
    int spill1240_7;
    int spill1240_8;
    int spill1240_9;
    boolean spill1240_10;
    int spill1240_11;
    boolean spill1240_12;
    int spill1240_13;
    int spill1240_14;
    boolean spill1240_15;
    int spill1240_16;
    int spill1240_17;
    long life2_3;
    java.util.Stack life5_8;
    int life6_12;
    int life7_14;
    java.lang.String life4_15;
    int life8_17;
    int life9_19;
    int life10_21;
    int life11_31;
    lexical_join_225: {
    lexical_join_223: {
    life2_3 = (__fieldRead1240_0() ^ 49497960454988L);
    spill1240_0 = __call1240_1();
    life5_8 = new java.util.Stack();
    life6_12 = (p1 + 1);
    life7_14 = 0;
    life4_15 = spill1240_0;
    life8_17 = 0;
    life9_19 = 0;
    life10_21 = 0;
    lexical_cycle_22: while (true) {
    lexical_join_220: {
    lexical_join_219: {
    lexical_join_218: {
    lexical_join_199: {
    lexical_join_195: {
    lexical_join_193: {
    lexical_join_188: {
    lexical_join_177: {
    lexical_join_169: {
    lexical_join_163: {
    lexical_join_155: {
    lexical_join_143: {
    lexical_join_137: {
    lexical_join_131: {
    lexical_join_123: {
    lexical_join_111: {
    lexical_join_102: {
    lexical_join_84: {
    lexical_join_83: {
    lexical_join_76: {
    lexical_join_75: {
    lexical_join_64: {
    lexical_join_63: {
    lexical_join_62: {
    lexical_join_58: {
    lexical_join_57: {
    if (!((life6_12 < __call1240_2(p0)))) {
        break lexical_join_223;
    }
    spill1240_1 = p0;
    spill1240_2 = life6_12;
    if (!((life4_15 == null))) {
        lexicalValue1240_225_0 = spill1240_1;
        lexicalValue1240_225_1 = spill1240_2;
        break lexical_join_225;
    }
    life11_31 = __integerCategory1240_4(__call1240_3(spill1240_1, spill1240_2));
    spill1240_3 = life11_31;
    if (!((life4_15 == null))) {
        lexicalValue1240_84_0 = spill1240_3;
        break lexical_join_84;
    }
    if (!((spill1240_3 == __invokedynamic1240_5(12673, (8495754655513357073L ^ life2_3))))) {
        break lexical_join_83;
    }
    spill1240_4 = __call1240_6(p0, life6_12);
    if (!((life4_15 == null))) {
        lexicalValue1240_58_0 = __integerCategory1240_7(spill1240_4);
        break lexical_join_58;
    }
    if (!(spill1240_4)) {
        break lexical_join_57;
    }
    spill1240_5 = life7_14;
    if (!((life4_15 == null))) {
        lexicalValue1240_195_0 = spill1240_5;
        break lexical_join_195;
    }
    if (!((spill1240_5 == 0))) {
        break lexical_join_193;
    }
    throw new net.minecraft.nbt.NBTException(__invokedynamic1240_8(p0));
    }
    lexicalValue1240_58_0 = life7_14;
    }
    if (!((life4_15 == null))) {
        lexicalValue1240_62_0 = lexicalValue1240_58_0;
        break lexical_join_62;
    }
    if (!((lexicalValue1240_58_0 == 0))) {
        break lexical_join_63;
    }
    lexicalValue1240_62_0 = 1;
    }
    lexicalValue1240_64_0 = lexicalValue1240_62_0;
    break lexical_join_64;
    }
    lexicalValue1240_64_0 = 0;
    }
    life7_14 = lexicalValue1240_64_0;
    spill1240_6 = life7_14;
    if (!((life4_15 == null))) {
        lexicalValue1240_76_0 = spill1240_6;
        break lexical_join_76;
    }
    if (!((spill1240_6 != 0))) {
        break lexical_join_75;
    }
    spill1240_7 = life9_19;
    if (!((life4_15 == null))) {
        lexicalValue1240_76_0 = spill1240_7;
        break lexical_join_76;
    }
    if (!((spill1240_7 == 0))) {
        break lexical_join_75;
    }
    life8_17 = 1;
    }
    lexicalValue1240_76_0 = life7_14;
    }
    if (!((life4_15 == null))) {
        lexicalValue1240_195_0 = lexicalValue1240_76_0;
        break lexical_join_195;
    }
    if (!((lexicalValue1240_76_0 == 0))) {
        break lexical_join_193;
    }
    life10_21 = life6_12;
    if (!((life4_15 != null))) {
        break lexical_join_193;
    }
    }
    lexicalValue1240_84_0 = life7_14;
    }
    if (!((life4_15 == null))) {
        lexicalValue1240_195_0 = lexicalValue1240_84_0;
        break lexical_join_195;
    }
    if (!((lexicalValue1240_84_0 == 0))) {
        break lexical_join_193;
    }
    spill1240_8 = life11_31;
    spill1240_9 = __invokedynamic1240_9(9434, (794076797720575563L ^ life2_3));
    if (!((life4_15 == null))) {
        lexicalValue1240_102_0 = spill1240_8;
        lexicalValue1240_102_1 = spill1240_9;
        break lexical_join_102;
    }
    if (!((spill1240_8 != spill1240_9))) {
        break lexical_join_188;
    }
    lexicalValue1240_102_0 = life11_31;
    lexicalValue1240_102_1 = __invokedynamic1240_10(4595, (6877391218920459118L ^ life2_3));
    }
    if (!((life4_15 == null))) {
        lexicalValue1240_111_0 = lexicalValue1240_102_0;
        lexicalValue1240_111_1 = lexicalValue1240_102_1;
        break lexical_join_111;
    }
    if (!((lexicalValue1240_102_0 != lexicalValue1240_102_1))) {
        break lexical_join_188;
    }
    lexicalValue1240_111_0 = life11_31;
    lexicalValue1240_111_1 = __invokedynamic1240_11(13927, (5619875788995702011L ^ life2_3));
    }
    if (!((life4_15 == null))) {
        lexicalValue1240_143_0 = lexicalValue1240_111_0;
        lexicalValue1240_143_1 = lexicalValue1240_111_1;
        break lexical_join_143;
    }
    if (!((lexicalValue1240_111_0 == lexicalValue1240_111_1))) {
        break lexical_join_137;
    }
    spill1240_10 = __call1240_12(life5_8);
    if (!((life4_15 == null))) {
        lexicalValue1240_123_0 = __integerCategory1240_13(spill1240_10);
        break lexical_join_123;
    }
    if (!((!spill1240_10))) {
        break lexical_join_131;
    }
    lexicalValue1240_123_0 = __integerCategory1240_17(__call1240_16(__cast1240_15(__call1240_14(life5_8))));
    }
    spill1240_11 = __invokedynamic1240_18(9434, (794076797720575563L ^ life2_3));
    if (!((life4_15 == null))) {
        lexicalValue1240_143_0 = lexicalValue1240_123_0;
        lexicalValue1240_143_1 = spill1240_11;
        break lexical_join_143;
    }
    if (!((lexicalValue1240_123_0 != spill1240_11))) {
        break lexical_join_137;
    }
    }
    throw new net.minecraft.nbt.NBTException(__invokedynamic1240_19(p0));
    }
    lexicalValue1240_143_0 = life11_31;
    lexicalValue1240_143_1 = __invokedynamic1240_20(12229, (724228679422948702L ^ life2_3));
    }
    if (!((life4_15 == null))) {
        lexicalValue1240_177_0 = lexicalValue1240_143_0;
        lexicalValue1240_177_1 = lexicalValue1240_143_1;
        break lexical_join_177;
    }
    if (!((lexicalValue1240_143_0 == lexicalValue1240_143_1))) {
        break lexical_join_169;
    }
    spill1240_12 = __call1240_21(life5_8);
    if (!((life4_15 == null))) {
        lexicalValue1240_155_0 = __integerCategory1240_22(spill1240_12);
        break lexical_join_155;
    }
    if (!((!spill1240_12))) {
        break lexical_join_163;
    }
    lexicalValue1240_155_0 = __integerCategory1240_26(__call1240_25(__cast1240_24(__call1240_23(life5_8))));
    }
    spill1240_13 = __invokedynamic1240_27(4595, (6877391218920459118L ^ life2_3));
    if (!((life4_15 == null))) {
        lexicalValue1240_177_0 = lexicalValue1240_155_0;
        lexicalValue1240_177_1 = spill1240_13;
        break lexical_join_177;
    }
    if (!((lexicalValue1240_155_0 != spill1240_13))) {
        break lexical_join_169;
    }
    }
    throw new net.minecraft.nbt.NBTException(__invokedynamic1240_28(p0));
    }
    spill1240_14 = life11_31;
    if (!((life4_15 == null))) {
        lexicalValue1240_195_0 = spill1240_14;
        break lexical_join_195;
    }
    lexicalValue1240_177_0 = spill1240_14;
    lexicalValue1240_177_1 = __invokedynamic1240_29(3186, (5246318872983639788L ^ life2_3));
    }
    if (!((lexicalValue1240_177_0 == lexicalValue1240_177_1))) {
        break lexical_join_193;
    }
    spill1240_15 = __call1240_30(life5_8);
    if (!((life4_15 == null))) {
        lexicalValue1240_195_0 = __integerCategory1240_31(spill1240_15);
        break lexical_join_195;
    }
    if (!(spill1240_15)) {
        break lexical_join_193;
    }
    return __call1240_32(p0, 0, life6_12);
    }
    __call1240_34(life5_8, __call1240_33(life11_31));
    }
    lexicalValue1240_195_0 = __integerCategory1240_36(__call1240_35(life11_31));
    }
    if (!((life4_15 == null))) {
        lexicalValue1240_199_0 = lexicalValue1240_195_0;
        break lexical_join_199;
    }
    if (!((lexicalValue1240_195_0 == 0))) {
        break lexical_join_220;
    }
    lexicalValue1240_199_0 = life7_14;
    }
    if (!((life4_15 == null))) {
        lexicalValue1240_219_0 = lexicalValue1240_199_0;
        break lexical_join_219;
    }
    if (!((lexicalValue1240_199_0 == 0))) {
        break lexical_join_218;
    }
    spill1240_16 = life8_17;
    if (!((life4_15 == null))) {
        lexicalValue1240_219_0 = spill1240_16;
        break lexical_join_219;
    }
    if (!((spill1240_16 != 0))) {
        break lexical_join_218;
    }
    spill1240_17 = life10_21;
    if (!((life4_15 == null))) {
        lexicalValue1240_219_0 = spill1240_17;
        break lexical_join_219;
    }
    if (!((spill1240_17 != life6_12))) {
        break lexical_join_218;
    }
    return __call1240_37(p0, 0, (life10_21 + 1));
    }
    lexicalValue1240_219_0 = 1;
    }
    life9_19 = lexicalValue1240_219_0;
    }
    life6_12 += 1;
    if (!((life4_15 != null))) { continue lexical_cycle_22; }
    break lexical_cycle_22;
    }
    }
    lexicalValue1240_225_0 = p0;
    lexicalValue1240_225_1 = 0;
    }
    return __call1240_38(lexicalValue1240_225_0, lexicalValue1240_225_1, life6_12);
}
public static void h1240_0(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1124000_0(p0);
}
public static void h1240_1(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1124001_0(p0);
}
public static void h1240_2(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1124002_0(p0);
}
public static void h1240_3(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1124003_0(p0);
}
public static void h1240_4(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1124004_0(p0);
}
public static void h1240_5(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1124005_0(p0);
}
public static void h1240_6(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1124006_0(p0);
}
public static void h1240_7(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1124007_0(p0);
}
public static void h1240_8(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1124008_0(p0);
}
public static void h1240_9(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1124009_0(p0);
}
public static void h1240_10(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1124010_0(p0);
}
public static void h1240_11(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1124011_0(p0);
}
public static void h1240_12(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1124012_0(p0);
}
public static void h1240_13(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1124013_0(p0);
}
public static void h1240_14(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1124014_0(p0);
}
public static void h1240_15(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1124015_0(p0);
}
public static void h1240_16(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1124016_0(p0);
}
public static void h1240_17(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1124017_0(p0);
}
public static void h1240_18(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1124018_0(p0);
}
public static void h1240_19(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1124019_0(p0);
}
public static void h1240_20(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1124020_0(p0);
}
public static void h1240_21(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1124021_0(p0);
}
public static void h1240_22(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1124022_0(p0);
}
public static void h1240_23(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1124023_0(p0);
}
public static void h1240_24(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1124024_0(p0);
}
public static void h1240_25(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1124025_0(p0);
}
public static void h1240_26(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1124026_0(p0);
}
public static void h1240_27(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1124027_0(p0);
}
public static void h1240_28(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1124028_0(p0);
}
public static void h1240_29(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1124029_0(p0);
}
public static void h1240_30(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1124030_0(p0);
}
public static void h1240_31(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1124031_0(p0);
}
public static void h1240_32(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1124032_0(p0);
}
public static void h1240_33(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1124033_0(p0);
}
public static void h1240_34(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1124034_0(p0);
}
public static void h1240_35(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1124035_0(p0);
}
public static void h1240_36(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1124036_0(p0);
}
public static void h1240_37(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1124037_0(p0);
}
public static void h1240_38(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1124038_0(p0);
}
public static void h1240_39(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1124039_0(p0);
}
public static void h1240_40(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1124040_0(p0);
}
private static native long __fieldRead1240_0() throws Throwable;
private static native java.lang.String __call1240_1() throws Throwable;
private static native int __call1240_2(java.lang.String a0) throws Throwable;
private static native char __call1240_3(java.lang.String a0, int a1) throws Throwable;
private static native int __integerCategory1240_4(char value) throws Throwable;
private static native int __invokedynamic1240_5(int a0, long a1) throws Throwable;
private static native boolean __call1240_6(java.lang.String a0, int a1) throws Throwable;
private static native int __integerCategory1240_7(boolean value) throws Throwable;
private static native java.lang.String __invokedynamic1240_8(java.lang.String a0) throws Throwable;
private static native int __invokedynamic1240_9(int a0, long a1) throws Throwable;
private static native int __invokedynamic1240_10(int a0, long a1) throws Throwable;
private static native int __invokedynamic1240_11(int a0, long a1) throws Throwable;
private static native boolean __call1240_12(java.util.Stack a0) throws Throwable;
private static native int __integerCategory1240_13(boolean value) throws Throwable;
private static native java.lang.Object __call1240_14(java.util.Stack a0) throws Throwable;
private static native java.lang.Character __cast1240_15(java.lang.Object a0) throws Throwable;
private static native char __call1240_16(java.lang.Character a0) throws Throwable;
private static native int __integerCategory1240_17(char value) throws Throwable;
private static native int __invokedynamic1240_18(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic1240_19(java.lang.String a0) throws Throwable;
private static native int __invokedynamic1240_20(int a0, long a1) throws Throwable;
private static native boolean __call1240_21(java.util.Stack a0) throws Throwable;
private static native int __integerCategory1240_22(boolean value) throws Throwable;
private static native java.lang.Object __call1240_23(java.util.Stack a0) throws Throwable;
private static native java.lang.Character __cast1240_24(java.lang.Object a0) throws Throwable;
private static native char __call1240_25(java.lang.Character a0) throws Throwable;
private static native int __integerCategory1240_26(char value) throws Throwable;
private static native int __invokedynamic1240_27(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic1240_28(java.lang.String a0) throws Throwable;
private static native int __invokedynamic1240_29(int a0, long a1) throws Throwable;
private static native boolean __call1240_30(java.util.Stack a0) throws Throwable;
private static native int __integerCategory1240_31(boolean value) throws Throwable;
private static native java.lang.String __call1240_32(java.lang.String a0, int a1, int a2) throws Throwable;
private static native java.lang.Character __call1240_33(int a0) throws Throwable;
private static native java.lang.Object __call1240_34(java.util.Stack a0, java.lang.Character a1) throws Throwable;
private static native boolean __call1240_35(int a0) throws Throwable;
private static native int __integerCategory1240_36(boolean value) throws Throwable;
private static native java.lang.String __call1240_37(java.lang.String a0, int a1, int a2) throws Throwable;
private static native java.lang.String __call1240_38(java.lang.String a0, int a1, int a2) throws Throwable;
private static native java.lang.Exception __call1124000_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1124001_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1124002_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1124003_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1124004_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1124005_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1124006_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1124007_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1124008_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1124009_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1124010_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1124011_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1124012_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1124013_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1124014_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1124015_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1124016_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1124017_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1124018_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1124019_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1124020_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1124021_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1124022_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1124023_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1124024_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1124025_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1124026_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1124027_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1124028_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1124029_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1124030_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1124031_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1124032_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1124033_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1124034_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1124035_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1124036_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1124037_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1124038_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1124039_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1124040_0(net.minecraft.nbt.NBTException a0) throws Throwable;

}

private static native <E extends Throwable> moom.yj __sourceHandlerCall_ca9f4f0ae0a4700538a6(java.lang.String a0, java.lang.String a1) throws E;
private static final class __SourceHandler_ca9f4f0ae0a4700538a6 {

public static moom.yj f1241(java.lang.String p0, java.lang.String p1) throws Throwable {
    int lexicalValue1241_51_0;
    int lexicalValue1241_64_0;
    int lexicalValue1241_89_0;
    int lexicalValue1241_89_1;
    int lexicalValue1241_98_0;
    int lexicalValue1241_98_1;
    int lexicalValue1241_107_0;
    int lexicalValue1241_107_1;
    int lexicalValue1241_132_0;
    int lexicalValue1241_139_0;
    int lexicalValue1241_176_0;
    int lexicalValue1241_189_0;
    int lexicalValue1241_214_0;
    int lexicalValue1241_214_1;
    int lexicalValue1241_223_0;
    int lexicalValue1241_223_1;
    int lexicalValue1241_232_0;
    int lexicalValue1241_232_1;
    java.lang.String spill1241_0;
    boolean spill1241_1;
    int spill1241_2;
    int spill1241_3;
    int spill1241_4;
    int spill1241_5;
    int spill1241_6;
    int spill1241_7;
    long life2_3;
    java.lang.String life1_7;
    java.lang.String life4_8;
    java.lang.String life1_25;
    moom.yk life5_30;
    java.lang.String life6_37;
    int life7_47;
    int life7_79;
    java.lang.String life1_194;
    moom.yl life5_199;
    java.lang.String life6_206;
    int life7_216;
    int life7_248;
    lexical_join_254: {
    lexical_join_252: {
    lexical_join_139: {
    lexical_join_132: {
    lexical_join_129: {
    lexical_join_127: {
    life2_3 = (__fieldRead1241_0() ^ 24141681162546L);
    spill1241_0 = __call1241_1();
    life1_7 = __call1241_2(p1);
    life4_8 = spill1241_0;
    spill1241_1 = __call1241_3(life1_7, "{");
    if (!((life4_8 == null))) {
        lexicalValue1241_132_0 = __integerCategory1241_4(spill1241_1);
        break lexical_join_132;
    }
    if (!(spill1241_1)) {
        break lexical_join_129;
    }
    life1_25 = __call1241_6(life1_7, 1, (__call1241_5(life1_7) - 1));
    life5_30 = new moom.yk(p0);
    lexical_cycle_28: while (true) {
    lexical_join_125: {
    lexical_join_118: {
    lexical_join_107: {
    lexical_join_98: {
    lexical_join_89: {
    lexical_join_64: {
    lexical_join_60: {
    lexical_join_51: {
    lexical_join_49: {
    if (!((__call1241_7(life1_25) > 0))) {
        break lexical_join_127;
    }
    life6_37 = __call1241_8(life1_25, 1);
    spill1241_2 = __call1241_9(life6_37);
    if (!((life4_8 == null))) {
        lexicalValue1241_51_0 = spill1241_2;
        break lexical_join_51;
    }
    if (!((spill1241_2 > 0))) {
        break lexical_join_49;
    }
    life7_47 = 0;
    __call1241_12(__fieldRead1241_10(life5_30), __call1241_11(life6_37, life7_47));
    }
    lexicalValue1241_51_0 = __call1241_13(life1_25);
    }
    if (!((life4_8 == null))) {
        lexicalValue1241_64_0 = lexicalValue1241_51_0;
        break lexical_join_64;
    }
    if (!((lexicalValue1241_51_0 < (__call1241_14(life6_37) + 1)))) {
        break lexical_join_60;
    }
    if (!((life4_8 != null))) {
        break lexical_join_127;
    }
    }
    lexicalValue1241_64_0 = __integerCategory1241_17(__call1241_16(life1_25, __call1241_15(life6_37)));
    }
    life7_79 = lexicalValue1241_64_0;
    if (!((life4_8 == null))) {
        break lexical_join_125;
    }
    if (!((life7_79 != __invokedynamic1241_18(30391, (4217156969899134544L ^ life2_3))))) {
        break lexical_join_118;
    }
    spill1241_3 = life7_79;
    spill1241_4 = __invokedynamic1241_19(9434, (794067656822905909L ^ life2_3));
    if (!((life4_8 == null))) {
        lexicalValue1241_89_0 = spill1241_3;
        lexicalValue1241_89_1 = spill1241_4;
        break lexical_join_89;
    }
    if (!((spill1241_3 != spill1241_4))) {
        break lexical_join_118;
    }
    lexicalValue1241_89_0 = life7_79;
    lexicalValue1241_89_1 = __invokedynamic1241_20(12204, (7090258861101766470L ^ life2_3));
    }
    if (!((life4_8 == null))) {
        lexicalValue1241_98_0 = lexicalValue1241_89_0;
        lexicalValue1241_98_1 = lexicalValue1241_89_1;
        break lexical_join_98;
    }
    if (!((lexicalValue1241_89_0 != lexicalValue1241_89_1))) {
        break lexical_join_118;
    }
    lexicalValue1241_98_0 = life7_79;
    lexicalValue1241_98_1 = __invokedynamic1241_21(4595, (6877381530414016784L ^ life2_3));
    }
    if (!((life4_8 == null))) {
        lexicalValue1241_107_0 = lexicalValue1241_98_0;
        lexicalValue1241_107_1 = lexicalValue1241_98_1;
        break lexical_join_107;
    }
    if (!((lexicalValue1241_98_0 != lexicalValue1241_98_1))) {
        break lexical_join_118;
    }
    lexicalValue1241_107_0 = life7_79;
    lexicalValue1241_107_1 = __invokedynamic1241_22(17637, (1897620356695047177L ^ life2_3));
    }
    if (!((lexicalValue1241_107_0 != lexicalValue1241_107_1))) {
        break lexical_join_118;
    }
    throw new net.minecraft.nbt.NBTException(__invokedynamic1241_25(life7_79, __call1241_24(life1_25, __call1241_23(life6_37))));
    }
    life1_25 = __call1241_27(life1_25, (__call1241_26(life6_37) + 1));
    }
    if (!((life4_8 != null))) { continue lexical_cycle_28; }
    break lexical_cycle_28;
    }
    }
    return life5_30;
    }
    lexicalValue1241_132_0 = __integerCategory1241_29(__call1241_28(life1_7, "["));
    }
    if (!((life4_8 == null))) {
        lexicalValue1241_139_0 = lexicalValue1241_132_0;
        break lexical_join_139;
    }
    if (!((lexicalValue1241_132_0 != 0))) {
        break lexical_join_254;
    }
    lexicalValue1241_139_0 = __integerCategory1241_33(__call1241_32(__call1241_31(__fieldRead1241_30(), life1_7)));
    }
    if (!((lexicalValue1241_139_0 == 0))) {
        break lexical_join_254;
    }
    life1_194 = __call1241_35(life1_7, 1, (__call1241_34(life1_7) - 1));
    life5_199 = new moom.yl(p0);
    lexical_cycle_153: while (true) {
    lexical_join_250: {
    lexical_join_243: {
    lexical_join_232: {
    lexical_join_223: {
    lexical_join_214: {
    lexical_join_189: {
    lexical_join_185: {
    lexical_join_176: {
    lexical_join_174: {
    if (!((__call1241_36(life1_194) > 0))) {
        break lexical_join_252;
    }
    life6_206 = __call1241_37(life1_194, 0);
    spill1241_5 = __call1241_38(life6_206);
    if (!((life4_8 == null))) {
        lexicalValue1241_176_0 = spill1241_5;
        break lexical_join_176;
    }
    if (!((spill1241_5 > 0))) {
        break lexical_join_174;
    }
    life7_216 = 1;
    __call1241_41(__fieldRead1241_39(life5_199), __call1241_40(life6_206, life7_216));
    }
    lexicalValue1241_176_0 = __call1241_42(life1_194);
    }
    if (!((life4_8 == null))) {
        lexicalValue1241_189_0 = lexicalValue1241_176_0;
        break lexical_join_189;
    }
    if (!((lexicalValue1241_176_0 < (__call1241_43(life6_206) + 1)))) {
        break lexical_join_185;
    }
    if (!((life4_8 != null))) {
        break lexical_join_252;
    }
    }
    lexicalValue1241_189_0 = __integerCategory1241_46(__call1241_45(life1_194, __call1241_44(life6_206)));
    }
    life7_248 = lexicalValue1241_189_0;
    if (!((life4_8 == null))) {
        break lexical_join_250;
    }
    if (!((life7_248 != __invokedynamic1241_47(3186, (5246293104387159186L ^ life2_3))))) {
        break lexical_join_243;
    }
    spill1241_6 = life7_248;
    spill1241_7 = __invokedynamic1241_48(9434, (794067656822905909L ^ life2_3));
    if (!((life4_8 == null))) {
        lexicalValue1241_214_0 = spill1241_6;
        lexicalValue1241_214_1 = spill1241_7;
        break lexical_join_214;
    }
    if (!((spill1241_6 != spill1241_7))) {
        break lexical_join_243;
    }
    lexicalValue1241_214_0 = life7_248;
    lexicalValue1241_214_1 = __invokedynamic1241_49(13927, (5619920251704954501L ^ life2_3));
    }
    if (!((life4_8 == null))) {
        lexicalValue1241_223_0 = lexicalValue1241_214_0;
        lexicalValue1241_223_1 = lexicalValue1241_214_1;
        break lexical_join_223;
    }
    if (!((lexicalValue1241_214_0 != lexicalValue1241_214_1))) {
        break lexical_join_243;
    }
    lexicalValue1241_223_0 = life7_248;
    lexicalValue1241_223_1 = __invokedynamic1241_50(4595, (6877381530414016784L ^ life2_3));
    }
    if (!((life4_8 == null))) {
        lexicalValue1241_232_0 = lexicalValue1241_223_0;
        lexicalValue1241_232_1 = lexicalValue1241_223_1;
        break lexical_join_232;
    }
    if (!((lexicalValue1241_223_0 != lexicalValue1241_223_1))) {
        break lexical_join_243;
    }
    lexicalValue1241_232_0 = life7_248;
    lexicalValue1241_232_1 = __invokedynamic1241_51(12229, (724167863894169376L ^ life2_3));
    }
    if (!((lexicalValue1241_232_0 != lexicalValue1241_232_1))) {
        break lexical_join_243;
    }
    throw new net.minecraft.nbt.NBTException(__invokedynamic1241_54(life7_248, __call1241_53(life1_194, __call1241_52(life6_206))));
    }
    life1_194 = __call1241_56(life1_194, (__call1241_55(life6_206) + 1));
    }
    if (!((life4_8 != null))) { continue lexical_cycle_153; }
    break lexical_cycle_153;
    }
    }
    return life5_199;
    }
    return new moom.ym(p0, life1_7);
}
public static void h1241_0(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1124100_0(p0);
}
public static void h1241_1(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1124101_0(p0);
}
public static void h1241_2(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1124102_0(p0);
}
public static void h1241_3(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1124103_0(p0);
}
public static void h1241_4(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1124104_0(p0);
}
public static void h1241_5(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1124105_0(p0);
}
public static void h1241_6(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1124106_0(p0);
}
public static void h1241_7(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1124107_0(p0);
}
public static void h1241_8(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1124108_0(p0);
}
public static void h1241_9(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1124109_0(p0);
}
public static void h1241_10(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1124110_0(p0);
}
public static void h1241_11(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1124111_0(p0);
}
public static void h1241_12(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1124112_0(p0);
}
public static void h1241_13(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1124113_0(p0);
}
public static void h1241_14(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1124114_0(p0);
}
public static void h1241_15(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1124115_0(p0);
}
public static void h1241_16(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1124116_0(p0);
}
public static void h1241_17(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1124117_0(p0);
}
public static void h1241_18(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1124118_0(p0);
}
public static void h1241_19(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1124119_0(p0);
}
public static void h1241_20(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1124120_0(p0);
}
public static void h1241_21(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1124121_0(p0);
}
public static void h1241_22(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1124122_0(p0);
}
public static void h1241_23(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1124123_0(p0);
}
public static void h1241_24(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1124124_0(p0);
}
public static void h1241_25(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1124125_0(p0);
}
public static void h1241_26(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1124126_0(p0);
}
public static void h1241_27(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1124127_0(p0);
}
public static void h1241_28(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1124128_0(p0);
}
private static native long __fieldRead1241_0() throws Throwable;
private static native java.lang.String __call1241_1() throws Throwable;
private static native java.lang.String __call1241_2(java.lang.String a0) throws Throwable;
private static native boolean __call1241_3(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1241_4(boolean value) throws Throwable;
private static native int __call1241_5(java.lang.String a0) throws Throwable;
private static native java.lang.String __call1241_6(java.lang.String a0, int a1, int a2) throws Throwable;
private static native int __call1241_7(java.lang.String a0) throws Throwable;
private static native java.lang.String __call1241_8(java.lang.String a0, int a1) throws Throwable;
private static native int __call1241_9(java.lang.String a0) throws Throwable;
private static native java.util.List __fieldRead1241_10(moom.yk a0) throws Throwable;
private static native moom.yj __call1241_11(java.lang.String a0, int a1) throws Throwable;
private static native boolean __call1241_12(java.util.List a0, moom.yj a1) throws Throwable;
private static native int __call1241_13(java.lang.String a0) throws Throwable;
private static native int __call1241_14(java.lang.String a0) throws Throwable;
private static native int __call1241_15(java.lang.String a0) throws Throwable;
private static native char __call1241_16(java.lang.String a0, int a1) throws Throwable;
private static native int __integerCategory1241_17(char value) throws Throwable;
private static native int __invokedynamic1241_18(int a0, long a1) throws Throwable;
private static native int __invokedynamic1241_19(int a0, long a1) throws Throwable;
private static native int __invokedynamic1241_20(int a0, long a1) throws Throwable;
private static native int __invokedynamic1241_21(int a0, long a1) throws Throwable;
private static native int __invokedynamic1241_22(int a0, long a1) throws Throwable;
private static native int __call1241_23(java.lang.String a0) throws Throwable;
private static native java.lang.String __call1241_24(java.lang.String a0, int a1) throws Throwable;
private static native java.lang.String __invokedynamic1241_25(int a0, java.lang.String a1) throws Throwable;
private static native int __call1241_26(java.lang.String a0) throws Throwable;
private static native java.lang.String __call1241_27(java.lang.String a0, int a1) throws Throwable;
private static native boolean __call1241_28(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1241_29(boolean value) throws Throwable;
private static native java.util.regex.Pattern __fieldRead1241_30() throws Throwable;
private static native java.util.regex.Matcher __call1241_31(java.util.regex.Pattern a0, java.lang.String a1) throws Throwable;
private static native boolean __call1241_32(java.util.regex.Matcher a0) throws Throwable;
private static native int __integerCategory1241_33(boolean value) throws Throwable;
private static native int __call1241_34(java.lang.String a0) throws Throwable;
private static native java.lang.String __call1241_35(java.lang.String a0, int a1, int a2) throws Throwable;
private static native int __call1241_36(java.lang.String a0) throws Throwable;
private static native java.lang.String __call1241_37(java.lang.String a0, int a1) throws Throwable;
private static native int __call1241_38(java.lang.String a0) throws Throwable;
private static native java.util.List __fieldRead1241_39(moom.yl a0) throws Throwable;
private static native moom.yj __call1241_40(java.lang.String a0, int a1) throws Throwable;
private static native boolean __call1241_41(java.util.List a0, moom.yj a1) throws Throwable;
private static native int __call1241_42(java.lang.String a0) throws Throwable;
private static native int __call1241_43(java.lang.String a0) throws Throwable;
private static native int __call1241_44(java.lang.String a0) throws Throwable;
private static native char __call1241_45(java.lang.String a0, int a1) throws Throwable;
private static native int __integerCategory1241_46(char value) throws Throwable;
private static native int __invokedynamic1241_47(int a0, long a1) throws Throwable;
private static native int __invokedynamic1241_48(int a0, long a1) throws Throwable;
private static native int __invokedynamic1241_49(int a0, long a1) throws Throwable;
private static native int __invokedynamic1241_50(int a0, long a1) throws Throwable;
private static native int __invokedynamic1241_51(int a0, long a1) throws Throwable;
private static native int __call1241_52(java.lang.String a0) throws Throwable;
private static native java.lang.String __call1241_53(java.lang.String a0, int a1) throws Throwable;
private static native java.lang.String __invokedynamic1241_54(int a0, java.lang.String a1) throws Throwable;
private static native int __call1241_55(java.lang.String a0) throws Throwable;
private static native java.lang.String __call1241_56(java.lang.String a0, int a1) throws Throwable;
private static native java.lang.Exception __call1124100_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1124101_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1124102_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1124103_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1124104_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1124105_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1124106_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1124107_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1124108_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1124109_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1124110_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1124111_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1124112_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1124113_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1124114_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1124115_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1124116_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1124117_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1124118_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1124119_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1124120_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1124121_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1124122_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1124123_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1124124_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1124125_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1124126_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1124127_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1124128_0(net.minecraft.nbt.NBTException a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_38d3332e484deb0f20b1(java.lang.String a0, boolean a1) throws E;
private static final class __SourceHandler_38d3332e484deb0f20b1 {

public static java.lang.String f1242(java.lang.String p0, boolean p1) throws Throwable {
    int forwardValue1242_39_0;
    int forwardValue1242_39_1;
    int forwardValue1242_44_0;
    int forwardValue1242_44_1;
    int forwardValue1242_52_0;
    int forwardValue1242_62_0;
    java.lang.String spill1242_0;
    boolean spill1242_1;
    int spill1242_2;
    int spill1242_3;
    int spill1242_4;
    long life2_3;
    int life5_12;
    java.lang.String life4_13;
    int life6_21;
    forward_join_63: {
    forward_join_62: {
    forward_join_61: {
    forward_join_52: {
    forward_join_51: {
    forward_join_44: {
    forward_join_39: {
    forward_join_37: {
    life2_3 = (__fieldRead1242_0() ^ 23997717619918L);
    spill1242_0 = __call1242_1();
    life5_12 = __call1242_3(p0, __invokedynamic1242_2(23520, (8188481711611412221L ^ life2_3)));
    life4_13 = spill1242_0;
    life6_21 = __call1242_5(p0, __invokedynamic1242_4(3186, (5246293273888729454L ^ life2_3)));
    spill1242_1 = p1;
    if (!((life4_13 == null))) {
        forwardValue1242_52_0 = __integerCategory1242_6(spill1242_1);
        break forward_join_52;
    }
    if (!(spill1242_1)) {
        break forward_join_51;
    }
    spill1242_2 = life5_12;
    spill1242_3 = -1;
    if (!((life4_13 == null))) {
        forwardValue1242_39_0 = spill1242_2;
        forwardValue1242_39_1 = spill1242_3;
        break forward_join_39;
    }
    if (!((spill1242_2 == spill1242_3))) {
        break forward_join_37;
    }
    throw new net.minecraft.nbt.NBTException(__invokedynamic1242_7(p0));
    }
    forwardValue1242_39_0 = life6_21;
    forwardValue1242_39_1 = -1;
    }
    if (!((life4_13 == null))) {
        forwardValue1242_44_0 = forwardValue1242_39_0;
        forwardValue1242_44_1 = forwardValue1242_39_1;
        break forward_join_44;
    }
    if (!((forwardValue1242_39_0 != forwardValue1242_39_1))) {
        break forward_join_63;
    }
    forwardValue1242_44_0 = life6_21;
    forwardValue1242_44_1 = life5_12;
    }
    if (!((forwardValue1242_44_0 < forwardValue1242_44_1))) {
        break forward_join_63;
    }
    throw new net.minecraft.nbt.NBTException(__invokedynamic1242_8(p0));
    }
    forwardValue1242_52_0 = life5_12;
    }
    if (!((life4_13 == null))) {
        forwardValue1242_62_0 = forwardValue1242_52_0;
        break forward_join_62;
    }
    if (!((forwardValue1242_52_0 != -1))) {
        break forward_join_61;
    }
    spill1242_4 = life5_12;
    if (!((life4_13 == null))) {
        forwardValue1242_62_0 = spill1242_4;
        break forward_join_62;
    }
    if (!((spill1242_4 > life6_21))) {
        break forward_join_63;
    }
    }
    forwardValue1242_62_0 = -1;
    }
    life5_12 = forwardValue1242_62_0;
    }
    return __call1242_9(p0, life5_12);
}
public static void h1242_0(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1124200_0(p0);
}
public static void h1242_1(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1124201_0(p0);
}
public static void h1242_2(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1124202_0(p0);
}
public static void h1242_3(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1124203_0(p0);
}
public static void h1242_4(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1124204_0(p0);
}
public static void h1242_5(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1124205_0(p0);
}
public static void h1242_6(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1124206_0(p0);
}
public static void h1242_7(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1124207_0(p0);
}
public static void h1242_8(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1124208_0(p0);
}
public static void h1242_9(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1124209_0(p0);
}
public static void h1242_10(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1124210_0(p0);
}
private static native long __fieldRead1242_0() throws Throwable;
private static native java.lang.String __call1242_1() throws Throwable;
private static native int __invokedynamic1242_2(int a0, long a1) throws Throwable;
private static native int __call1242_3(java.lang.String a0, int a1) throws Throwable;
private static native int __invokedynamic1242_4(int a0, long a1) throws Throwable;
private static native int __call1242_5(java.lang.String a0, int a1) throws Throwable;
private static native int __integerCategory1242_6(boolean value) throws Throwable;
private static native java.lang.String __invokedynamic1242_7(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic1242_8(java.lang.String a0) throws Throwable;
private static native java.lang.String __call1242_9(java.lang.String a0, int a1) throws Throwable;
private static native java.lang.Exception __call1124200_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1124201_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1124202_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1124203_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1124204_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1124205_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1124206_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1124207_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1124208_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1124209_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1124210_0(net.minecraft.nbt.NBTException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_c80373b3c6799c7100ab(java.lang.String a0, int a1) throws E;
private static final class __SourceHandler_c80373b3c6799c7100ab {

public static boolean f1243(java.lang.String p0, int p1) throws Throwable {
    int forwardValue1243_15_0;
    int forwardValue1243_28_0;
    int forwardValue1243_32_0;
    int forwardValue1243_34_0;
    int spill1243_0;
    long life2_3;
    java.lang.String life4_5;
    forward_join_34: {
    forward_join_33: {
    forward_join_32: {
    forward_join_28: {
    forward_join_15: {
    life2_3 = (__fieldRead1243_0() ^ 96082951343297L);
    life4_5 = __call1243_1();
    spill1243_0 = p1;
    if (!((life4_5 == null))) {
        forwardValue1243_15_0 = spill1243_0;
        break forward_join_15;
    }
    if (!((spill1243_0 > 0))) {
        break forward_join_33;
    }
    forwardValue1243_15_0 = __integerCategory1243_3(__call1243_2(p0, (p1 - 1)));
    }
    if (!((life4_5 == null))) {
        forwardValue1243_28_0 = forwardValue1243_15_0;
        break forward_join_28;
    }
    if (!((forwardValue1243_15_0 == __invokedynamic1243_4(5681, (8797648123931040548L ^ life2_3))))) {
        break forward_join_33;
    }
    forwardValue1243_28_0 = __integerCategory1243_6(__call1243_5(p0, (p1 - 1)));
    }
    if (!((life4_5 == null))) {
        forwardValue1243_32_0 = forwardValue1243_28_0;
        break forward_join_32;
    }
    if (!((forwardValue1243_28_0 == 0))) {
        break forward_join_33;
    }
    forwardValue1243_32_0 = 1;
    }
    forwardValue1243_34_0 = forwardValue1243_32_0;
    break forward_join_34;
    }
    forwardValue1243_34_0 = 0;
    }
    return __integerCategory1243_7(forwardValue1243_34_0);
}
public static void h1243_0(moom.Oo p0) throws Throwable {
    throw __call1124300_0(p0);
}
public static void h1243_1(moom.Oo p0) throws Throwable {
    throw __call1124301_0(p0);
}
public static void h1243_2(moom.Oo p0) throws Throwable {
    throw __call1124302_0(p0);
}
public static void h1243_3(moom.Oo p0) throws Throwable {
    throw __call1124303_0(p0);
}
public static void h1243_4(moom.Oo p0) throws Throwable {
    throw __call1124304_0(p0);
}
private static native long __fieldRead1243_0() throws Throwable;
private static native java.lang.String __call1243_1() throws Throwable;
private static native char __call1243_2(java.lang.String a0, int a1) throws Throwable;
private static native int __integerCategory1243_3(char value) throws Throwable;
private static native int __invokedynamic1243_4(int a0, long a1) throws Throwable;
private static native boolean __call1243_5(java.lang.String a0, int a1) throws Throwable;
private static native int __integerCategory1243_6(boolean value) throws Throwable;
private static native boolean __integerCategory1243_7(int value) throws Throwable;
private static native java.lang.Exception __call1124300_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1124301_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1124302_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1124303_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1124304_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.nbt.NBTTagCompound __sourceHandlerCall_7459b987d3843cdf9c9f(java.lang.String a0) throws E;
private static final class __SourceHandler_7459b987d3843cdf9c9f {

public static net.minecraft.nbt.NBTTagCompound f1244(java.lang.String p0) throws Throwable {
    int forwardValue1244_24_0;
    java.lang.String forwardValue1244_32_0;
    java.lang.String spill1244_0;
    boolean spill1244_1;
    java.lang.String spill1244_2;
    long life1_3;
    java.lang.String life0_7;
    java.lang.String life3_8;
    forward_join_32: {
    forward_join_31: {
    forward_join_24: {
    forward_join_20: {
    life1_3 = (__fieldRead1244_0() ^ 93864242807458L);
    spill1244_0 = __call1244_1();
    life0_7 = __call1244_2(p0);
    life3_8 = spill1244_0;
    spill1244_1 = __call1244_3(life0_7, "{");
    if (!((life3_8 == null))) {
        forwardValue1244_24_0 = __integerCategory1244_4(spill1244_1);
        break forward_join_24;
    }
    if (!((!spill1244_1))) {
        break forward_join_20;
    }
    throw new net.minecraft.nbt.NBTException("Invalid tag encountered, expected '{' as first char.");
    }
    spill1244_2 = life0_7;
    if (!((life3_8 == null))) {
        forwardValue1244_32_0 = spill1244_2;
        break forward_join_32;
    }
    forwardValue1244_24_0 = __call1244_5(spill1244_2);
    }
    if (!((forwardValue1244_24_0 != 1))) {
        break forward_join_31;
    }
    throw new net.minecraft.nbt.NBTException("Encountered multiple top tags, only one expected");
    }
    forwardValue1244_32_0 = "tag";
    }
    return __cast1244_8(__call1244_7(__call1244_6(forwardValue1244_32_0, life0_7)));
}
public static void h1244_0(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1124400_0(p0);
}
public static void h1244_1(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1124401_0(p0);
}
public static void h1244_2(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1124402_0(p0);
}
public static void h1244_3(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1124403_0(p0);
}
private static native long __fieldRead1244_0() throws Throwable;
private static native java.lang.String __call1244_1() throws Throwable;
private static native java.lang.String __call1244_2(java.lang.String a0) throws Throwable;
private static native boolean __call1244_3(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1244_4(boolean value) throws Throwable;
private static native int __call1244_5(java.lang.String a0) throws Throwable;
private static native moom.yj __call1244_6(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.nbt.NBTBase __call1244_7(moom.yj a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __cast1244_8(net.minecraft.nbt.NBTBase a0) throws Throwable;
private static native java.lang.Exception __call1124400_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1124401_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1124402_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1124403_0(net.minecraft.nbt.NBTException a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_864541a2d69a0bac3c98(java.lang.String a0, boolean a1) throws E;
private static final class __SourceHandler_864541a2d69a0bac3c98 {

public static java.lang.String f1245(java.lang.String p0, boolean p1) throws Throwable {
    java.lang.String forwardValue1245_26_0;
    int forwardValue1245_34_0;
    int forwardValue1245_41_0;
    boolean spill1245_0;
    java.lang.String spill1245_1;
    boolean spill1245_2;
    int spill1245_3;
    long life2_3;
    java.lang.String life4_5;
    int life5_46;
    forward_join_50: {
    forward_join_44: {
    forward_join_41: {
    forward_join_34: {
    forward_join_27: {
    forward_join_26: {
    forward_join_25: {
    life2_3 = (__fieldRead1245_0() ^ 24821729666667L);
    life4_5 = __call1245_1();
    spill1245_0 = p1;
    if (!((life4_5 == null))) {
        forwardValue1245_34_0 = __integerCategory1245_2(spill1245_0);
        break forward_join_34;
    }
    if (!(spill1245_0)) {
        break forward_join_27;
    }
    p0 = __call1245_3(p0);
    spill1245_1 = p0;
    if (!((life4_5 == null))) {
        forwardValue1245_26_0 = spill1245_1;
        break forward_join_26;
    }
    if (!((!__call1245_4(spill1245_1, "{")))) {
        break forward_join_25;
    }
    spill1245_2 = __call1245_5(p0, "[");
    if (!((life4_5 == null))) {
        forwardValue1245_34_0 = __integerCategory1245_6(spill1245_2);
        break forward_join_34;
    }
    if (!(spill1245_2)) {
        break forward_join_27;
    }
    }
    forwardValue1245_26_0 = "";
    }
    return forwardValue1245_26_0;
    }
    forwardValue1245_34_0 = __call1245_8(p0, __invokedynamic1245_7(18584, (6399698356252995372L ^ life2_3)));
    }
    life5_46 = forwardValue1245_34_0;
    spill1245_3 = life5_46;
    if (!((life4_5 == null))) {
        forwardValue1245_41_0 = spill1245_3;
        break forward_join_41;
    }
    if (!((spill1245_3 == -1))) {
        break forward_join_50;
    }
    forwardValue1245_41_0 = __integerCategory1245_9(p1);
    }
    if (!((forwardValue1245_41_0 != 0))) {
        break forward_join_44;
    }
    return "";
    }
    throw new net.minecraft.nbt.NBTException(__invokedynamic1245_10(p0));
    }
    return __call1245_12(__call1245_11(p0, 0, life5_46));
}
public static void h1245_0(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1124500_0(p0);
}
public static void h1245_1(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1124501_0(p0);
}
public static void h1245_2(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1124502_0(p0);
}
public static void h1245_3(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1124503_0(p0);
}
public static void h1245_4(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1124504_0(p0);
}
public static void h1245_5(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1124505_0(p0);
}
public static void h1245_6(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1124506_0(p0);
}
private static native long __fieldRead1245_0() throws Throwable;
private static native java.lang.String __call1245_1() throws Throwable;
private static native int __integerCategory1245_2(boolean value) throws Throwable;
private static native java.lang.String __call1245_3(java.lang.String a0) throws Throwable;
private static native boolean __call1245_4(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native boolean __call1245_5(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1245_6(boolean value) throws Throwable;
private static native int __invokedynamic1245_7(int a0, long a1) throws Throwable;
private static native int __call1245_8(java.lang.String a0, int a1) throws Throwable;
private static native int __integerCategory1245_9(boolean value) throws Throwable;
private static native java.lang.String __invokedynamic1245_10(java.lang.String a0) throws Throwable;
private static native java.lang.String __call1245_11(java.lang.String a0, int a1, int a2) throws Throwable;
private static native java.lang.String __call1245_12(java.lang.String a0) throws Throwable;
private static native java.lang.Exception __call1124500_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1124501_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1124502_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1124503_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1124504_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1124505_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1124506_0(net.minecraft.nbt.NBTException a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_2c7da1537503a1858120(java.lang.String a0, boolean a1) throws E;
private static final class __SourceHandler_2c7da1537503a1858120 {

public static java.lang.String f1246(java.lang.String p0, boolean p1) throws Throwable {
    java.lang.String forwardValue1246_26_0;
    int forwardValue1246_34_0;
    int forwardValue1246_41_0;
    boolean spill1246_0;
    java.lang.String spill1246_1;
    boolean spill1246_2;
    int spill1246_3;
    long life2_3;
    java.lang.String life4_5;
    int life5_46;
    forward_join_50: {
    forward_join_44: {
    forward_join_41: {
    forward_join_34: {
    forward_join_27: {
    forward_join_26: {
    forward_join_25: {
    life2_3 = (__fieldRead1246_0() ^ 134677715734161L);
    life4_5 = __call1246_1();
    spill1246_0 = p1;
    if (!((life4_5 == null))) {
        forwardValue1246_34_0 = __integerCategory1246_2(spill1246_0);
        break forward_join_34;
    }
    if (!(spill1246_0)) {
        break forward_join_27;
    }
    p0 = __call1246_3(p0);
    spill1246_1 = p0;
    if (!((life4_5 == null))) {
        forwardValue1246_26_0 = spill1246_1;
        break forward_join_26;
    }
    if (!((!__call1246_4(spill1246_1, "{")))) {
        break forward_join_25;
    }
    spill1246_2 = __call1246_5(p0, "[");
    if (!((life4_5 == null))) {
        forwardValue1246_34_0 = __integerCategory1246_6(spill1246_2);
        break forward_join_34;
    }
    if (!(spill1246_2)) {
        break forward_join_27;
    }
    }
    forwardValue1246_26_0 = p0;
    }
    return forwardValue1246_26_0;
    }
    forwardValue1246_34_0 = __call1246_8(p0, __invokedynamic1246_7(18584, (6399658299894695894L ^ life2_3)));
    }
    life5_46 = forwardValue1246_34_0;
    spill1246_3 = life5_46;
    if (!((life4_5 == null))) {
        forwardValue1246_41_0 = spill1246_3;
        break forward_join_41;
    }
    if (!((spill1246_3 == -1))) {
        break forward_join_50;
    }
    forwardValue1246_41_0 = __integerCategory1246_9(p1);
    }
    if (!((forwardValue1246_41_0 != 0))) {
        break forward_join_44;
    }
    return p0;
    }
    throw new net.minecraft.nbt.NBTException(__invokedynamic1246_10(p0));
    }
    return __call1246_12(__call1246_11(p0, (life5_46 + 1)));
}
public static void h1246_0(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1124600_0(p0);
}
public static void h1246_1(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1124601_0(p0);
}
public static void h1246_2(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1124602_0(p0);
}
public static void h1246_3(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1124603_0(p0);
}
public static void h1246_4(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1124604_0(p0);
}
public static void h1246_5(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1124605_0(p0);
}
public static void h1246_6(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call1124606_0(p0);
}
private static native long __fieldRead1246_0() throws Throwable;
private static native java.lang.String __call1246_1() throws Throwable;
private static native int __integerCategory1246_2(boolean value) throws Throwable;
private static native java.lang.String __call1246_3(java.lang.String a0) throws Throwable;
private static native boolean __call1246_4(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native boolean __call1246_5(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1246_6(boolean value) throws Throwable;
private static native int __invokedynamic1246_7(int a0, long a1) throws Throwable;
private static native int __call1246_8(java.lang.String a0, int a1) throws Throwable;
private static native int __integerCategory1246_9(boolean value) throws Throwable;
private static native java.lang.String __invokedynamic1246_10(java.lang.String a0) throws Throwable;
private static native java.lang.String __call1246_11(java.lang.String a0, int a1) throws Throwable;
private static native java.lang.String __call1246_12(java.lang.String a0) throws Throwable;
private static native java.lang.Exception __call1124600_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1124601_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1124602_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1124603_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1124604_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1124605_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call1124606_0(net.minecraft.nbt.NBTException a0) throws Throwable;

}


private static java.lang.String b(java.lang.String p0, boolean p1) throws net.minecraft.nbt.NBTException { return __sourceHandlerCall_864541a2d69a0bac3c98(p0, p1); }


private static java.lang.String c(java.lang.String p0, boolean p1) throws net.minecraft.nbt.NBTException { return __sourceHandlerCall_2c7da1537503a1858120(p0, p1); }


public static net.minecraft.nbt.NBTTagCompound a__yw(java.lang.String p0) throws net.minecraft.nbt.NBTException { return __sourceHandlerCall_7459b987d3843cdf9c9f(p0); }


private static boolean a__Boolean(java.lang.String p0, int p1) { return __sourceHandlerCall_c80373b3c6799c7100ab(p0, p1); }


private static int a(java.lang.String p0, char p1) { return __sourceHandlerCall_2e97223ad54984d74613(p0, p1); }


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral9835_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/yi"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.yi.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 28044;
      if (e[var3] == null) {
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
         long var5 = d[var3];
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
         Object[] var9 = (Object[])f.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               f.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/yi", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         e[var3] = var15;
      }

      return e[var3];
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


static moom.yj a(java.lang.String[] p0) throws net.minecraft.nbt.NBTException {
return moom.yi.a(((java.lang.String)((p0)[0])), ((java.lang.String)((p0)[1])));
}


static moom.yj a(java.lang.String p0, java.lang.String p1) throws net.minecraft.nbt.NBTException { return __sourceHandlerCall_ca9f4f0ae0a4700538a6(p0, p1); }


private static moom.yj a__yj(java.lang.String p0, boolean p1) throws net.minecraft.nbt.NBTException {
java.lang.String local2 = moom.yi.b(((java.lang.String)(p0)), ((boolean)(p1)));
    java.lang.String local3 = moom.yi.c(((java.lang.String)(p0)), ((boolean)(p1)));
    return moom.yi.a(((java.lang.String[])(new java.lang.String[] {local2, local3})));
}


private static java.lang.String a(java.lang.String p0, boolean p1) throws net.minecraft.nbt.NBTException { return __sourceHandlerCall_38d3332e484deb0f20b1(p0, p1); }


private static java.lang.String a(java.lang.String p0, int p1) throws net.minecraft.nbt.NBTException { return __sourceHandlerCall_4bad045fb25f1c8e5741(p0, p1); }


static int a(java.lang.String p0) throws net.minecraft.nbt.NBTException { return __sourceHandlerCall_a7874b76cdf96fbe913f(p0); }


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral9835_0() throws E;
}
