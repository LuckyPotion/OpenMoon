package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class pR extends net.minecraft.command.CommandBase {

private static long c;

private static long[] d;

private static java.lang.Integer[] e;

private static java.util.Map g;

public pR() {
super();
}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(3422142628691385946L)), ((long)(337784061261068688L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(169347390281462L)))));
    g = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.pR.c ^ 123121154479354L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1458_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1458_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1458_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1458_14 = new byte[8];
    (__sourceSpill1458_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1458_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1458_16 = __sourceSpill1458_14;
    ((javax.crypto.Cipher)(__sourceSpill1458_11)).init(((int)(__sourceSpill1458_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1458_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1458_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[5];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "\000XFbÄa8\013\016\027;¾H\001Ý|YF~"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1458_25 = local6_life21;
        int __sourceSpill1458_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1458_25)).substring(((int)(__sourceSpill1458_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1458_30 = local8_life19;
        int __sourceSpill1458_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1458_33 = new byte[8];
        (__sourceSpill1458_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1458_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1458_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1458_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1458_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1458_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1458_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1458_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1458_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1458_34)).doFinal(((byte[])(__sourceSpill1458_33)));
        (__sourceSpill1458_30)[__sourceSpill1458_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "`&à*úsV Ç¸«ý&"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1458_38 = local6_life21;
        int __sourceSpill1458_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1458_38)).substring(((int)(__sourceSpill1458_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1458_43 = local8_life19;
        int __sourceSpill1458_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1458_46 = new byte[8];
        (__sourceSpill1458_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1458_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1458_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1458_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1458_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1458_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1458_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1458_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1458_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1458_47)).doFinal(((byte[])(__sourceSpill1458_46)));
        (__sourceSpill1458_43)[__sourceSpill1458_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    d = ((long[])(local8_life19));
    e = ((java.lang.Integer[])(new java.lang.Integer[5]));
}

private static native <E extends Throwable> void __sourceHandlerCall_77083e4fd3e9fd2dca94(moom.pR a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2) throws E;
private static final class __SourceHandler_77083e4fd3e9fd2dca94 {

public static void f145(moom.pR receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws Throwable {
    net.minecraft.command.ICommandSender forwardValue145_54_0;
    int forwardValue145_71_0;
    int forwardValue145_91_0;
    net.minecraft.potion.Potion forwardValue145_103_0;
    int forwardValue145_137_0;
    int forwardValue145_142_0;
    int forwardValue145_149_0;
    int forwardValue145_169_0;
    int forwardValue145_169_1;
    int forwardValue145_179_0;
    int forwardValue145_181_0;
    int forwardValue145_241_0;
    net.minecraft.entity.EntityLivingBase forwardValue145_244_0;
    int forwardValue145_244_1;
    boolean spill145_0;
    net.minecraft.entity.EntityLivingBase spill145_1;
    int spill145_2;
    net.minecraft.potion.Potion spill145_3;
    int spill145_4;
    boolean spill145_5;
    int spill145_6;
    int spill145_7;
    boolean spill145_8;
    int spill145_9;
    net.minecraft.entity.EntityLivingBase spill145_10;
    int spill145_11;
    long life3_3;
    int life5_5;
    net.minecraft.entity.EntityLivingBase life6_26;
    int life7_84;
    int life8_111;
    int life9_117;
    int life10_119;
    net.minecraft.potion.Potion life11_149;
    int life12_254;
    net.minecraft.potion.PotionEffect life13_270;
    forward_join_304: {
    forward_join_292: {
    forward_join_290: {
    forward_join_268: {
    forward_join_244: {
    forward_join_241: {
    forward_join_236: {
    forward_join_181: {
    forward_join_180: {
    forward_join_179: {
    forward_join_178: {
    forward_join_169: {
    forward_join_164: {
    forward_join_149: {
    forward_join_147: {
    forward_join_142: {
    forward_join_140: {
    forward_join_137: {
    forward_join_130: {
    forward_join_103: {
    forward_join_91: {
    forward_join_71: {
    forward_join_66: {
    forward_join_54: {
    forward_join_51: {
    forward_join_17: {
    life3_3 = (__fieldRead145_0() ^ 93670670130081L);
    life5_5 = __integerCategory145_2(__call145_1());
    if (!(((p1).length < 2))) {
        break forward_join_17;
    }
    throw new moom.cc("commands.effect.usage", new java.lang.Object[0]);
    }
    life6_26 = __cast145_5(__call145_4(p0, (p1)[0], __classLiteral145_3()));
    spill145_0 = __call145_6((p1)[1], "clear");
    if (!((life5_5 != 0))) {
        forwardValue145_71_0 = __integerCategory145_7(spill145_0);
        break forward_join_71;
    }
    if (!(spill145_0)) {
        break forward_join_66;
    }
    spill145_1 = life6_26;
    if (!((life5_5 != 0))) {
        forwardValue145_54_0 = spill145_1;
        break forward_join_54;
    }
    if (!(__call145_9(__call145_8(spill145_1)))) {
        break forward_join_51;
    }
    throw new moom.b7("commands.effect.failure.notActive.all", new java.lang.Object[] {__call145_10(life6_26)});
    }
    __call145_11(life6_26);
    forwardValue145_54_0 = p0;
    }
    __call145_13(forwardValue145_54_0, receiver, "commands.effect.success.removed.all", new java.lang.Object[] {__call145_12(life6_26)});
    if (!((life5_5 == 0))) {
        break forward_join_304;
    }
    }
    forwardValue145_71_0 = __call145_14((p1)[1], 1);
    }
    life7_84 = forwardValue145_71_0;
    life8_111 = __invokedynamic145_15(4499, (272198844331289838L ^ life3_3));
    life9_117 = __invokedynamic145_16(23614, (8214243417861267776L ^ life3_3));
    life10_119 = 0;
    spill145_2 = life7_84;
    if (!((life5_5 != 0))) {
        forwardValue145_91_0 = spill145_2;
        break forward_join_91;
    }
    if (!((spill145_2 >= 0))) {
        break forward_join_292;
    }
    forwardValue145_91_0 = life7_84;
    }
    if (!((forwardValue145_91_0 < (__fieldRead145_17()).length))) {
        break forward_join_292;
    }
    spill145_3 = (__fieldRead145_18())[life7_84];
    if (!((life5_5 != 0))) {
        forwardValue145_103_0 = spill145_3;
        break forward_join_103;
    }
    if (!((spill145_3 != null))) {
        break forward_join_292;
    }
    forwardValue145_103_0 = (__fieldRead145_19())[life7_84];
    }
    life11_149 = forwardValue145_103_0;
    spill145_4 = (p1).length;
    if (!((life5_5 != 0))) {
        forwardValue145_142_0 = spill145_4;
        break forward_join_142;
    }
    if (!((spill145_4 >= 3))) {
        break forward_join_140;
    }
    life9_117 = __call145_21((p1)[2], 0, __invokedynamic145_20(14298, (6002358017204210341L ^ life3_3)));
    spill145_5 = __call145_22(life11_149);
    if (!((life5_5 != 0))) {
        forwardValue145_137_0 = __integerCategory145_23(spill145_5);
        break forward_join_137;
    }
    if (!(spill145_5)) {
        break forward_join_130;
    }
    life8_111 = life9_117;
    if (!((life5_5 == 0))) {
        break forward_join_147;
    }
    }
    forwardValue145_137_0 = (life9_117 * __invokedynamic145_24(3596, (2496015564030014324L ^ life3_3)));
    }
    life8_111 = forwardValue145_137_0;
    if (!((life5_5 == 0))) {
        break forward_join_147;
    }
    }
    forwardValue145_142_0 = __integerCategory145_26(__call145_25(life11_149));
    }
    if (!((life5_5 != 0))) {
        forwardValue145_149_0 = forwardValue145_142_0;
        break forward_join_149;
    }
    if (!((forwardValue145_142_0 != 0))) {
        break forward_join_147;
    }
    life8_111 = 1;
    }
    forwardValue145_149_0 = (p1).length;
    }
    spill145_6 = 4;
    if (!((life5_5 != 0))) {
        forwardValue145_169_0 = forwardValue145_149_0;
        forwardValue145_169_1 = spill145_6;
        break forward_join_169;
    }
    if (!((forwardValue145_149_0 >= spill145_6))) {
        break forward_join_164;
    }
    life10_119 = __call145_28((p1)[3], 0, __invokedynamic145_27(31214, (7768990350326858898L ^ life3_3)));
    }
    spill145_7 = (p1).length;
    if (!((life5_5 != 0))) {
        forwardValue145_179_0 = spill145_7;
        break forward_join_179;
    }
    forwardValue145_169_0 = spill145_7;
    forwardValue145_169_1 = 5;
    }
    if (!((forwardValue145_169_0 >= forwardValue145_169_1))) {
        break forward_join_178;
    }
    spill145_8 = __call145_29("true", (p1)[4]);
    if (!((life5_5 != 0))) {
        forwardValue145_179_0 = __integerCategory145_30(spill145_8);
        break forward_join_179;
    }
    if (!((!spill145_8))) {
        break forward_join_180;
    }
    }
    forwardValue145_179_0 = 1;
    }
    forwardValue145_181_0 = forwardValue145_179_0;
    break forward_join_181;
    }
    forwardValue145_181_0 = 0;
    }
    life12_254 = forwardValue145_181_0;
    spill145_9 = life9_117;
    if (!((life5_5 != 0))) {
        forwardValue145_241_0 = spill145_9;
        break forward_join_241;
    }
    if (!((spill145_9 > 0))) {
        break forward_join_236;
    }
    life13_270 = new net.minecraft.potion.PotionEffect(life7_84, life8_111, life10_119, false, __integerCategory145_31(life12_254));
    __call145_32(life6_26, life13_270);
    __call145_38(p0, receiver, "commands.effect.success", new java.lang.Object[] {new moom.CN(__call145_33(life13_270), new java.lang.Object[0]), __call145_34(life7_84), __call145_35(life10_119), __call145_36(life6_26), __call145_37(life9_117)});
    if (!((life5_5 == 0))) {
        break forward_join_290;
    }
    }
    spill145_10 = life6_26;
    spill145_11 = life7_84;
    if (!((life5_5 != 0))) {
        forwardValue145_244_0 = spill145_10;
        forwardValue145_244_1 = spill145_11;
        break forward_join_244;
    }
    forwardValue145_241_0 = __integerCategory145_40(__call145_39(spill145_10, spill145_11));
    }
    if (!((forwardValue145_241_0 != 0))) {
        break forward_join_268;
    }
    forwardValue145_244_0 = life6_26;
    forwardValue145_244_1 = life7_84;
    }
    __call145_41(forwardValue145_244_0, forwardValue145_244_1);
    __call145_44(p0, receiver, "commands.effect.success.removed", new java.lang.Object[] {new moom.CN(__call145_42(life11_149), new java.lang.Object[0]), __call145_43(life6_26)});
    if (!((life5_5 == 0))) {
        break forward_join_290;
    }
    }
    throw new moom.b7("commands.effect.failure.notActive", new java.lang.Object[] {new moom.CN(__call145_45(life11_149), new java.lang.Object[0]), __call145_46(life6_26)});
    }
    if (!((life5_5 == 0))) {
        break forward_join_304;
    }
    }
    throw new moom.b_("commands.effect.notFound", new java.lang.Object[] {__call145_47(life7_84)});
    }
    return;
}
public static void h145_0(moom.b_ p0) throws Throwable {
    throw __call3014500_0(p0);
}
public static void h145_1(moom.b_ p0) throws Throwable {
    throw __call3014501_0(p0);
}
public static void h145_2(moom.b_ p0) throws Throwable {
    throw __call3014502_0(p0);
}
public static void h145_3(moom.b_ p0) throws Throwable {
    throw __call3014503_0(p0);
}
public static void h145_4(moom.b_ p0) throws Throwable {
    throw __call3014504_0(p0);
}
public static void h145_5(moom.b_ p0, moom.pR p1, net.minecraft.command.ICommandSender p2, java.lang.String[] p3, long p4, int p5, net.minecraft.entity.EntityLivingBase p6, int p7, int p8, int p9, int p10, net.minecraft.potion.Potion p11, int p12, net.minecraft.potion.PotionEffect p13) throws Throwable {
    net.minecraft.potion.Potion forwardValue3014505_14_0;
    int forwardValue3014505_35_0;
    net.minecraft.potion.Potion forwardValue3014505_47_0;
    int forwardValue3014505_81_0;
    int forwardValue3014505_86_0;
    int forwardValue3014505_93_0;
    int forwardValue3014505_113_0;
    int forwardValue3014505_113_1;
    int forwardValue3014505_123_0;
    int forwardValue3014505_125_0;
    int forwardValue3014505_185_0;
    net.minecraft.entity.EntityLivingBase forwardValue3014505_188_0;
    int forwardValue3014505_188_1;
    net.minecraft.potion.Potion spill3014505_0;
    int spill3014505_1;
    net.minecraft.potion.Potion spill3014505_2;
    int spill3014505_3;
    boolean spill3014505_4;
    int spill3014505_5;
    int spill3014505_6;
    boolean spill3014505_7;
    int spill3014505_8;
    net.minecraft.entity.EntityLivingBase spill3014505_9;
    int spill3014505_10;
    moom.b_ life9_2;
    net.minecraft.potion.Potion life10_7;
    int life8_17;
    int life9_23;
    int life10_29;
    int life11_31;
    net.minecraft.potion.Potion life12_53;
    int life13_140;
    net.minecraft.potion.PotionEffect life14_154;
    forward_join_248: {
    forward_join_236: {
    forward_join_234: {
    forward_join_212: {
    forward_join_188: {
    forward_join_185: {
    forward_join_180: {
    forward_join_125: {
    forward_join_124: {
    forward_join_123: {
    forward_join_122: {
    forward_join_113: {
    forward_join_108: {
    forward_join_93: {
    forward_join_91: {
    forward_join_86: {
    forward_join_84: {
    forward_join_81: {
    forward_join_74: {
    forward_join_47: {
    forward_join_35: {
    forward_join_14: {
    forward_join_13: {
    life9_2 = p0;
    life10_7 = __call3014505_0((p3)[1]);
    spill3014505_0 = life10_7;
    if (!((p5 != 0))) {
        forwardValue3014505_14_0 = spill3014505_0;
        break forward_join_14;
    }
    if (!((spill3014505_0 == null))) {
        break forward_join_13;
    }
    throw life9_2;
    }
    forwardValue3014505_14_0 = life10_7;
    }
    life8_17 = __fieldRead3014505_1(forwardValue3014505_14_0);
    life9_23 = __invokedynamic3014505_2(4499, (272198844331289838L ^ p4));
    life10_29 = __invokedynamic3014505_3(23614, (8214243417861267776L ^ p4));
    life11_31 = 0;
    spill3014505_1 = life8_17;
    if (!((p5 != 0))) {
        forwardValue3014505_35_0 = spill3014505_1;
        break forward_join_35;
    }
    if (!((spill3014505_1 >= 0))) {
        break forward_join_236;
    }
    forwardValue3014505_35_0 = life8_17;
    }
    if (!((forwardValue3014505_35_0 < (__fieldRead3014505_4()).length))) {
        break forward_join_236;
    }
    spill3014505_2 = (__fieldRead3014505_5())[life8_17];
    if (!((p5 != 0))) {
        forwardValue3014505_47_0 = spill3014505_2;
        break forward_join_47;
    }
    if (!((spill3014505_2 != null))) {
        break forward_join_236;
    }
    forwardValue3014505_47_0 = (__fieldRead3014505_6())[life8_17];
    }
    life12_53 = forwardValue3014505_47_0;
    spill3014505_3 = (p3).length;
    if (!((p5 != 0))) {
        forwardValue3014505_86_0 = spill3014505_3;
        break forward_join_86;
    }
    if (!((spill3014505_3 >= 3))) {
        break forward_join_84;
    }
    life10_29 = __call3014505_8((p3)[2], 0, __invokedynamic3014505_7(14298, (6002358017204210341L ^ p4)));
    spill3014505_4 = __call3014505_9(life12_53);
    if (!((p5 != 0))) {
        forwardValue3014505_81_0 = __integerCategory3014505_10(spill3014505_4);
        break forward_join_81;
    }
    if (!(spill3014505_4)) {
        break forward_join_74;
    }
    life9_23 = life10_29;
    if (!((p5 == 0))) {
        break forward_join_91;
    }
    }
    forwardValue3014505_81_0 = (life10_29 * __invokedynamic3014505_11(3596, (2496015564030014324L ^ p4)));
    }
    life9_23 = forwardValue3014505_81_0;
    if (!((p5 == 0))) {
        break forward_join_91;
    }
    }
    forwardValue3014505_86_0 = __integerCategory3014505_13(__call3014505_12(life12_53));
    }
    if (!((p5 != 0))) {
        forwardValue3014505_93_0 = forwardValue3014505_86_0;
        break forward_join_93;
    }
    if (!((forwardValue3014505_86_0 != 0))) {
        break forward_join_91;
    }
    life9_23 = 1;
    }
    forwardValue3014505_93_0 = (p3).length;
    }
    spill3014505_5 = 4;
    if (!((p5 != 0))) {
        forwardValue3014505_113_0 = forwardValue3014505_93_0;
        forwardValue3014505_113_1 = spill3014505_5;
        break forward_join_113;
    }
    if (!((forwardValue3014505_93_0 >= spill3014505_5))) {
        break forward_join_108;
    }
    life11_31 = __call3014505_15((p3)[3], 0, __invokedynamic3014505_14(31214, (7768990350326858898L ^ p4)));
    }
    spill3014505_6 = (p3).length;
    if (!((p5 != 0))) {
        forwardValue3014505_123_0 = spill3014505_6;
        break forward_join_123;
    }
    forwardValue3014505_113_0 = spill3014505_6;
    forwardValue3014505_113_1 = 5;
    }
    if (!((forwardValue3014505_113_0 >= forwardValue3014505_113_1))) {
        break forward_join_122;
    }
    spill3014505_7 = __call3014505_16("true", (p3)[4]);
    if (!((p5 != 0))) {
        forwardValue3014505_123_0 = __integerCategory3014505_17(spill3014505_7);
        break forward_join_123;
    }
    if (!((!spill3014505_7))) {
        break forward_join_124;
    }
    }
    forwardValue3014505_123_0 = 1;
    }
    forwardValue3014505_125_0 = forwardValue3014505_123_0;
    break forward_join_125;
    }
    forwardValue3014505_125_0 = 0;
    }
    life13_140 = forwardValue3014505_125_0;
    spill3014505_8 = life10_29;
    if (!((p5 != 0))) {
        forwardValue3014505_185_0 = spill3014505_8;
        break forward_join_185;
    }
    if (!((spill3014505_8 > 0))) {
        break forward_join_180;
    }
    life14_154 = new net.minecraft.potion.PotionEffect(life8_17, life9_23, life11_31, false, __integerCategory3014505_18(life13_140));
    __call3014505_19(p6, life14_154);
    __call3014505_25(p2, p1, "commands.effect.success", new java.lang.Object[] {new moom.CN(__call3014505_20(life14_154), new java.lang.Object[0]), __call3014505_21(life8_17), __call3014505_22(life11_31), __call3014505_23(p6), __call3014505_24(life10_29)});
    if (!((p5 == 0))) {
        break forward_join_234;
    }
    }
    spill3014505_9 = p6;
    spill3014505_10 = life8_17;
    if (!((p5 != 0))) {
        forwardValue3014505_188_0 = spill3014505_9;
        forwardValue3014505_188_1 = spill3014505_10;
        break forward_join_188;
    }
    forwardValue3014505_185_0 = __integerCategory3014505_27(__call3014505_26(spill3014505_9, spill3014505_10));
    }
    if (!((forwardValue3014505_185_0 != 0))) {
        break forward_join_212;
    }
    forwardValue3014505_188_0 = p6;
    forwardValue3014505_188_1 = life8_17;
    }
    __call3014505_28(forwardValue3014505_188_0, forwardValue3014505_188_1);
    __call3014505_31(p2, p1, "commands.effect.success.removed", new java.lang.Object[] {new moom.CN(__call3014505_29(life12_53), new java.lang.Object[0]), __call3014505_30(p6)});
    if (!((p5 == 0))) {
        break forward_join_234;
    }
    }
    throw new moom.b7("commands.effect.failure.notActive", new java.lang.Object[] {new moom.CN(__call3014505_32(life12_53), new java.lang.Object[0]), __call3014505_33(p6)});
    }
    if (!((p5 == 0))) {
        break forward_join_248;
    }
    }
    throw new moom.b_("commands.effect.notFound", new java.lang.Object[] {__call3014505_34(life8_17)});
    }
    return;
}
public static void h145_6(moom.b_ p0) throws Throwable {
    throw __call3014506_0(p0);
}
public static void h145_7(moom.b_ p0) throws Throwable {
    throw __call3014507_0(p0);
}
public static void h145_8(moom.b_ p0) throws Throwable {
    throw __call3014508_0(p0);
}
public static void h145_9(moom.b_ p0) throws Throwable {
    throw __call3014509_0(p0);
}
public static void h145_10(moom.b_ p0) throws Throwable {
    throw __call3014510_0(p0);
}
public static void h145_11(moom.b_ p0) throws Throwable {
    throw __call3014511_0(p0);
}
public static void h145_12(moom.b_ p0) throws Throwable {
    throw __call3014512_0(p0);
}
public static void h145_13(moom.b_ p0) throws Throwable {
    throw __call3014513_0(p0);
}
public static void h145_14(moom.b_ p0) throws Throwable {
    throw __call3014514_0(p0);
}
public static void h145_15(moom.b_ p0) throws Throwable {
    throw __call3014515_0(p0);
}
public static void h145_16(moom.b_ p0) throws Throwable {
    throw __call3014516_0(p0);
}
public static void h145_17(moom.b_ p0) throws Throwable {
    throw __call3014517_0(p0);
}
public static void h145_18(moom.b_ p0) throws Throwable {
    throw __call3014518_0(p0);
}
public static void h145_19(moom.b_ p0) throws Throwable {
    throw __call3014519_0(p0);
}
public static void h145_20(moom.b_ p0) throws Throwable {
    throw __call3014520_0(p0);
}
public static void h145_21(moom.b_ p0) throws Throwable {
    throw __call3014521_0(p0);
}
public static void h145_22(moom.b_ p0) throws Throwable {
    throw __call3014522_0(p0);
}
public static void h145_23(moom.b_ p0) throws Throwable {
    throw __call3014523_0(p0);
}
public static void h145_24(moom.b_ p0) throws Throwable {
    throw __call3014524_0(p0);
}
public static void h145_25(moom.b_ p0) throws Throwable {
    throw __call3014525_0(p0);
}
public static void h145_26(moom.b_ p0) throws Throwable {
    throw __call3014526_0(p0);
}
private static native long __fieldRead145_0() throws Throwable;
private static native boolean __call145_1() throws Throwable;
private static native int __integerCategory145_2(boolean value) throws Throwable;
private static native java.lang.Class __classLiteral145_3() throws Throwable;
private static native net.minecraft.entity.Entity __call145_4(net.minecraft.command.ICommandSender a0, java.lang.String a1, java.lang.Class a2) throws Throwable;
private static native net.minecraft.entity.EntityLivingBase __cast145_5(net.minecraft.entity.Entity a0) throws Throwable;
private static native boolean __call145_6(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory145_7(boolean value) throws Throwable;
private static native java.util.Collection __call145_8(net.minecraft.entity.EntityLivingBase a0) throws Throwable;
private static native boolean __call145_9(java.util.Collection a0) throws Throwable;
private static native java.lang.String __call145_10(net.minecraft.entity.EntityLivingBase a0) throws Throwable;
private static native void __call145_11(net.minecraft.entity.EntityLivingBase a0) throws Throwable;
private static native java.lang.String __call145_12(net.minecraft.entity.EntityLivingBase a0) throws Throwable;
private static native void __call145_13(net.minecraft.command.ICommandSender a0, moom.pR a1, java.lang.String a2, java.lang.Object[] a3) throws Throwable;
private static native int __call145_14(java.lang.String a0, int a1) throws Throwable;
private static native int __invokedynamic145_15(int a0, long a1) throws Throwable;
private static native int __invokedynamic145_16(int a0, long a1) throws Throwable;
private static native net.minecraft.potion.Potion[] __fieldRead145_17() throws Throwable;
private static native net.minecraft.potion.Potion[] __fieldRead145_18() throws Throwable;
private static native net.minecraft.potion.Potion[] __fieldRead145_19() throws Throwable;
private static native int __invokedynamic145_20(int a0, long a1) throws Throwable;
private static native int __call145_21(java.lang.String a0, int a1, int a2) throws Throwable;
private static native boolean __call145_22(net.minecraft.potion.Potion a0) throws Throwable;
private static native int __integerCategory145_23(boolean value) throws Throwable;
private static native int __invokedynamic145_24(int a0, long a1) throws Throwable;
private static native boolean __call145_25(net.minecraft.potion.Potion a0) throws Throwable;
private static native int __integerCategory145_26(boolean value) throws Throwable;
private static native int __invokedynamic145_27(int a0, long a1) throws Throwable;
private static native int __call145_28(java.lang.String a0, int a1, int a2) throws Throwable;
private static native boolean __call145_29(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory145_30(boolean value) throws Throwable;
private static native boolean __integerCategory145_31(int value) throws Throwable;
private static native void __call145_32(net.minecraft.entity.EntityLivingBase a0, net.minecraft.potion.PotionEffect a1) throws Throwable;
private static native java.lang.String __call145_33(net.minecraft.potion.PotionEffect a0) throws Throwable;
private static native java.lang.Integer __call145_34(int a0) throws Throwable;
private static native java.lang.Integer __call145_35(int a0) throws Throwable;
private static native java.lang.String __call145_36(net.minecraft.entity.EntityLivingBase a0) throws Throwable;
private static native java.lang.Integer __call145_37(int a0) throws Throwable;
private static native void __call145_38(net.minecraft.command.ICommandSender a0, moom.pR a1, java.lang.String a2, java.lang.Object[] a3) throws Throwable;
private static native boolean __call145_39(net.minecraft.entity.EntityLivingBase a0, int a1) throws Throwable;
private static native int __integerCategory145_40(boolean value) throws Throwable;
private static native void __call145_41(net.minecraft.entity.EntityLivingBase a0, int a1) throws Throwable;
private static native java.lang.String __call145_42(net.minecraft.potion.Potion a0) throws Throwable;
private static native java.lang.String __call145_43(net.minecraft.entity.EntityLivingBase a0) throws Throwable;
private static native void __call145_44(net.minecraft.command.ICommandSender a0, moom.pR a1, java.lang.String a2, java.lang.Object[] a3) throws Throwable;
private static native java.lang.String __call145_45(net.minecraft.potion.Potion a0) throws Throwable;
private static native java.lang.String __call145_46(net.minecraft.entity.EntityLivingBase a0) throws Throwable;
private static native java.lang.Integer __call145_47(int a0) throws Throwable;
private static native java.lang.Exception __call3014500_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call3014501_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call3014502_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call3014503_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call3014504_0(moom.b_ a0) throws Throwable;
private static native net.minecraft.potion.Potion __call3014505_0(java.lang.String a0) throws Throwable;
private static native int __fieldRead3014505_1(net.minecraft.potion.Potion a0) throws Throwable;
private static native int __invokedynamic3014505_2(int a0, long a1) throws Throwable;
private static native int __invokedynamic3014505_3(int a0, long a1) throws Throwable;
private static native net.minecraft.potion.Potion[] __fieldRead3014505_4() throws Throwable;
private static native net.minecraft.potion.Potion[] __fieldRead3014505_5() throws Throwable;
private static native net.minecraft.potion.Potion[] __fieldRead3014505_6() throws Throwable;
private static native int __invokedynamic3014505_7(int a0, long a1) throws Throwable;
private static native int __call3014505_8(java.lang.String a0, int a1, int a2) throws Throwable;
private static native boolean __call3014505_9(net.minecraft.potion.Potion a0) throws Throwable;
private static native int __integerCategory3014505_10(boolean value) throws Throwable;
private static native int __invokedynamic3014505_11(int a0, long a1) throws Throwable;
private static native boolean __call3014505_12(net.minecraft.potion.Potion a0) throws Throwable;
private static native int __integerCategory3014505_13(boolean value) throws Throwable;
private static native int __invokedynamic3014505_14(int a0, long a1) throws Throwable;
private static native int __call3014505_15(java.lang.String a0, int a1, int a2) throws Throwable;
private static native boolean __call3014505_16(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory3014505_17(boolean value) throws Throwable;
private static native boolean __integerCategory3014505_18(int value) throws Throwable;
private static native void __call3014505_19(net.minecraft.entity.EntityLivingBase a0, net.minecraft.potion.PotionEffect a1) throws Throwable;
private static native java.lang.String __call3014505_20(net.minecraft.potion.PotionEffect a0) throws Throwable;
private static native java.lang.Integer __call3014505_21(int a0) throws Throwable;
private static native java.lang.Integer __call3014505_22(int a0) throws Throwable;
private static native java.lang.String __call3014505_23(net.minecraft.entity.EntityLivingBase a0) throws Throwable;
private static native java.lang.Integer __call3014505_24(int a0) throws Throwable;
private static native void __call3014505_25(net.minecraft.command.ICommandSender a0, moom.pR a1, java.lang.String a2, java.lang.Object[] a3) throws Throwable;
private static native boolean __call3014505_26(net.minecraft.entity.EntityLivingBase a0, int a1) throws Throwable;
private static native int __integerCategory3014505_27(boolean value) throws Throwable;
private static native void __call3014505_28(net.minecraft.entity.EntityLivingBase a0, int a1) throws Throwable;
private static native java.lang.String __call3014505_29(net.minecraft.potion.Potion a0) throws Throwable;
private static native java.lang.String __call3014505_30(net.minecraft.entity.EntityLivingBase a0) throws Throwable;
private static native void __call3014505_31(net.minecraft.command.ICommandSender a0, moom.pR a1, java.lang.String a2, java.lang.Object[] a3) throws Throwable;
private static native java.lang.String __call3014505_32(net.minecraft.potion.Potion a0) throws Throwable;
private static native java.lang.String __call3014505_33(net.minecraft.entity.EntityLivingBase a0) throws Throwable;
private static native java.lang.Integer __call3014505_34(int a0) throws Throwable;
private static native java.lang.Exception __call3014506_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call3014507_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call3014508_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call3014509_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call3014510_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call3014511_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call3014512_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call3014513_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call3014514_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call3014515_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call3014516_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call3014517_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call3014518_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call3014519_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call3014520_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call3014521_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call3014522_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call3014523_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call3014524_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call3014525_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call3014526_0(moom.b_ a0) throws Throwable;

}

private static native <E extends Throwable> java.util.List __sourceHandlerCall_5121082c45d2320672e0(moom.pR a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2, moom.DT a3) throws E;
private static final class __SourceHandler_5121082c45d2320672e0 {

public static java.util.List f1118(moom.pR receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1, moom.DT p2) throws Throwable {
    int forwardValue1118_20_0;
    int forwardValue1118_20_1;
    int forwardValue1118_32_0;
    int forwardValue1118_32_1;
    java.lang.String[] forwardValue1118_34_0;
    java.util.List forwardValue1118_47_0;
    int spill1118_0;
    int spill1118_1;
    java.lang.String[] spill1118_2;
    long life4_3;
    int life6_5;
    forward_join_47: {
    forward_join_46: {
    forward_join_34: {
    forward_join_32: {
    forward_join_27: {
    forward_join_20: {
    forward_join_17: {
    life4_3 = (__fieldRead1118_0() ^ 20039045106210L);
    life6_5 = __integerCategory1118_2(__call1118_1());
    spill1118_0 = (p1).length;
    spill1118_1 = 1;
    if (!((life6_5 == 0))) {
        forwardValue1118_20_0 = spill1118_0;
        forwardValue1118_20_1 = spill1118_1;
        break forward_join_20;
    }
    if (!((spill1118_0 == spill1118_1))) {
        break forward_join_17;
    }
    forwardValue1118_47_0 = __call1118_4(p1, __call1118_3(receiver));
    break forward_join_47;
    }
    forwardValue1118_20_0 = (p1).length;
    forwardValue1118_20_1 = 2;
    }
    if (!((life6_5 == 0))) {
        forwardValue1118_32_0 = forwardValue1118_20_0;
        forwardValue1118_32_1 = forwardValue1118_20_1;
        break forward_join_32;
    }
    if (!((forwardValue1118_20_0 == forwardValue1118_20_1))) {
        break forward_join_27;
    }
    forwardValue1118_47_0 = __call1118_6(p1, __call1118_5());
    break forward_join_47;
    }
    spill1118_2 = p1;
    if (!((life6_5 == 0))) {
        forwardValue1118_34_0 = spill1118_2;
        break forward_join_34;
    }
    forwardValue1118_32_0 = (spill1118_2).length;
    forwardValue1118_32_1 = 5;
    }
    if (!((forwardValue1118_32_0 == forwardValue1118_32_1))) {
        break forward_join_46;
    }
    forwardValue1118_34_0 = p1;
    }
    forwardValue1118_47_0 = __call1118_7(forwardValue1118_34_0, new java.lang.String[] {"true", "false"});
    break forward_join_47;
    }
    forwardValue1118_47_0 = null;
    }
    return forwardValue1118_47_0;
}
public static void h1118_0(moom.Oo p0) throws Throwable {
    throw __call1111800_0(p0);
}
public static void h1118_1(moom.Oo p0) throws Throwable {
    throw __call1111801_0(p0);
}
public static void h1118_2(moom.Oo p0) throws Throwable {
    throw __call1111802_0(p0);
}
public static void h1118_3(moom.Oo p0) throws Throwable {
    throw __call1111803_0(p0);
}
public static void h1118_4(moom.Oo p0) throws Throwable {
    throw __call1111804_0(p0);
}
private static native long __fieldRead1118_0() throws Throwable;
private static native boolean __call1118_1() throws Throwable;
private static native int __integerCategory1118_2(boolean value) throws Throwable;
private static native java.lang.String[] __call1118_3(moom.pR a0) throws Throwable;
private static native java.util.List __call1118_4(java.lang.String[] a0, java.lang.String[] a1) throws Throwable;
private static native java.util.Set __call1118_5() throws Throwable;
private static native java.util.List __call1118_6(java.lang.String[] a0, java.util.Set a1) throws Throwable;
private static native java.util.List __call1118_7(java.lang.String[] a0, java.lang.String[] a1) throws Throwable;
private static native java.lang.Exception __call1111800_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1111801_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1111802_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1111803_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1111804_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_bacc57903f0a517786ff(moom.pR a0, java.lang.String[] a1, int a2) throws E;
private static final class __SourceHandler_bacc57903f0a517786ff {

public static boolean f1119(moom.pR receiver, java.lang.String[] p0, int p1) throws Throwable {
    int forwardValue1119_11_0;
    int forwardValue1119_13_0;
    int spill1119_0;
    long life3_3;
    int life5_5;
    forward_join_13: {
    forward_join_12: {
    forward_join_11: {
    life3_3 = (__fieldRead1119_0() ^ 46854765279801L);
    life5_5 = __integerCategory1119_2(__call1119_1());
    spill1119_0 = p1;
    if (!((life5_5 == 0))) {
        forwardValue1119_11_0 = spill1119_0;
        break forward_join_11;
    }
    if (!((spill1119_0 == 0))) {
        break forward_join_12;
    }
    forwardValue1119_11_0 = 1;
    }
    forwardValue1119_13_0 = forwardValue1119_11_0;
    break forward_join_13;
    }
    forwardValue1119_13_0 = 0;
    }
    return __integerCategory1119_3(forwardValue1119_13_0);
}
public static void h1119_0(moom.Oo p0) throws Throwable {
    throw __call1111900_0(p0);
}
private static native long __fieldRead1119_0() throws Throwable;
private static native boolean __call1119_1() throws Throwable;
private static native int __integerCategory1119_2(boolean value) throws Throwable;
private static native boolean __integerCategory1119_3(int value) throws Throwable;
private static native java.lang.Exception __call1111900_0(moom.Oo a0) throws Throwable;

}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8676_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/pR"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 30211;
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
         Object[] var9 = (Object[])g.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               g.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/pR", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         e[var3] = var15;
      }

      return e[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.pR.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public int a() {
return 2;
}


public java.lang.String a__String() {
return "effect";
}


protected java.lang.String[] a__ArrayString() {
return ((moom.Bl)(moom.Bl.a__Bl())).a__ArrayString();
}


public java.util.List<java.lang.String> a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1, moom.DT p2) { return __sourceHandlerCall_5121082c45d2320672e0(this, p0, p1, p2); }


public void a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws moom.b7 { __sourceHandlerCall_77083e4fd3e9fd2dca94(this, p0, p1); }


public boolean a__Boolean(java.lang.String[] p0, int p1) { return __sourceHandlerCall_bacc57903f0a517786ff(this, p0, p1); }


public java.lang.String a__sourceReturn_abea8daec3(net.minecraft.command.ICommandSender p0) {
return "commands.effect.usage";
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8676_0() throws E;
}
