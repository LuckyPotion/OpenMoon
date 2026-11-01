package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class qN {

private static int a;

private static java.lang.String[] b;

private java.lang.String[] c;

private java.lang.String[] d;

private static long e;

private static long[] f;

private static java.lang.Integer[] g;

private static java.util.Map h;

public qN() {
super();
    this.c = moom.qN.b;
    this.d = moom.qN.b;
}


static {
e = ((long)(((moom._a)(moom._c.a(((long)(3282077458930861168L)), ((long)(-4779860854061932523L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(38436947489901L)))));
    h = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.qN.e ^ 77370717650617L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill972_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill972_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill972_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill972_14 = new byte[8];
    (__sourceSpill972_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill972_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation972_16 = __sourceSpill972_14;
    ((javax.crypto.Cipher)(__sourceSpill972_11)).init(((int)(__sourceSpill972_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill972_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation972_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[3];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "^º\001\tôÞz¢2ÐB÷óYgæ#ãæGão"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill972_25 = local6_life21;
        int __sourceSpill972_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill972_25)).substring(((int)(__sourceSpill972_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill972_30 = local8_life19;
        int __sourceSpill972_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill972_33 = new byte[8];
        (__sourceSpill972_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill972_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill972_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill972_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill972_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill972_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill972_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill972_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill972_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill972_34)).doFinal(((byte[])(__sourceSpill972_33)));
        (__sourceSpill972_30)[__sourceSpill972_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    f = ((long[])(local8_life19));
    g = ((java.lang.Integer[])(new java.lang.Integer[3]));
    a = ((int)((net.minecraft.command.CommandResultStats$Type.values()).length));
    b = ((java.lang.String[])(new java.lang.String[moom.qN.a]));
}

private static native <E extends Throwable> void __sourceHandlerCall_f3515ade45c806137325(moom.qN a0, net.minecraft.command.CommandResultStats$Type a1) throws E;
private static final class __SourceHandler_f3515ade45c806137325 {

public static void f1149(moom.qN p0, net.minecraft.command.CommandResultStats$Type p1) throws Throwable {
    java.lang.String[] lexicalValue1149_17_0;
    java.lang.String[] lexicalValue1149_17_1;
    java.lang.String[] lexicalValue1149_26_0;
    moom.qN lexicalValue1149_75_0;
    java.lang.String[] spill1149_0;
    java.lang.String[] spill1149_1;
    java.lang.String[] spill1149_2;
    moom.qN spill1149_3;
    long life2_3;
    int life4_5;
    int life5_43;
    net.minecraft.command.CommandResultStats$Type[] life6_45;
    int life7_48;
    int life8_50;
    net.minecraft.command.CommandResultStats$Type life9_57;
    lexical_join_77: {
    lexical_join_75: {
    lexical_join_69: {
    lexical_join_26: {
    lexical_join_17: {
    life2_3 = (__fieldRead1149_0() ^ 88743986427998L);
    life4_5 = __integerCategory1149_2(__call1149_1());
    spill1149_0 = __fieldRead1149_3(p0);
    spill1149_1 = __fieldRead1149_4();
    if (!((life4_5 != 0))) {
        lexicalValue1149_17_0 = spill1149_0;
        lexicalValue1149_17_1 = spill1149_1;
        break lexical_join_17;
    }
    if (!((spill1149_0 != spill1149_1))) {
        break lexical_join_77;
    }
    spill1149_2 = __fieldRead1149_5(p0);
    if (!((life4_5 != 0))) {
        lexicalValue1149_26_0 = spill1149_2;
        break lexical_join_26;
    }
    lexicalValue1149_17_0 = spill1149_2;
    lexicalValue1149_17_1 = __fieldRead1149_6();
    }
    if (!((lexicalValue1149_17_0 != lexicalValue1149_17_1))) {
        break lexical_join_77;
    }
    (__fieldRead1149_7(p0))[__call1149_8(p1)] = null;
    lexicalValue1149_26_0 = __fieldRead1149_9(p0);
    }
    (lexicalValue1149_26_0)[__call1149_10(p1)] = null;
    life5_43 = 1;
    life6_45 = __call1149_11();
    life7_48 = (life6_45).length;
    life8_50 = 0;
    lexical_cycle_39: while (true) {
    lexical_join_67: {
    lexical_join_66: {
    if (!((life8_50 < life7_48))) {
        break lexical_join_69;
    }
    life9_57 = (life6_45)[life8_50];
    if (!((life4_5 != 0))) {
        break lexical_join_67;
    }
    spill1149_3 = p0;
    if (!((life4_5 != 0))) {
        lexicalValue1149_75_0 = spill1149_3;
        break lexical_join_75;
    }
    if (!(((__fieldRead1149_12(spill1149_3))[__call1149_13(life9_57)] != null))) {
        break lexical_join_66;
    }
    if (!(((__fieldRead1149_14(p0))[__call1149_15(life9_57)] != null))) {
        break lexical_join_66;
    }
    life5_43 = 0;
    if (!((life4_5 == 0))) {
        break lexical_join_69;
    }
    }
    life8_50 += 1;
    }
    if (!((life4_5 == 0))) { continue lexical_cycle_39; }
    break lexical_cycle_39;
    }
    }
    if (!((life5_43 != 0))) {
        break lexical_join_77;
    }
    __fieldWrite1149_17(p0, __fieldRead1149_16());
    lexicalValue1149_75_0 = p0;
    }
    __fieldWrite1149_19(lexicalValue1149_75_0, __fieldRead1149_18());
    }
    return;
}
public static void h1149_0(moom.Oo p0) throws Throwable {
    throw __call1114900_0(p0);
}
public static void h1149_1(moom.Oo p0) throws Throwable {
    throw __call1114901_0(p0);
}
public static void h1149_2(moom.Oo p0) throws Throwable {
    throw __call1114902_0(p0);
}
public static void h1149_3(moom.Oo p0) throws Throwable {
    throw __call1114903_0(p0);
}
public static void h1149_4(moom.Oo p0) throws Throwable {
    throw __call1114904_0(p0);
}
public static void h1149_5(moom.Oo p0) throws Throwable {
    throw __call1114905_0(p0);
}
public static void h1149_6(moom.Oo p0) throws Throwable {
    throw __call1114906_0(p0);
}
public static void h1149_7(moom.Oo p0) throws Throwable {
    throw __call1114907_0(p0);
}
public static void h1149_8(moom.Oo p0) throws Throwable {
    throw __call1114908_0(p0);
}
private static native long __fieldRead1149_0() throws Throwable;
private static native boolean __call1149_1() throws Throwable;
private static native int __integerCategory1149_2(boolean value) throws Throwable;
private static native java.lang.String[] __fieldRead1149_3(moom.qN a0) throws Throwable;
private static native java.lang.String[] __fieldRead1149_4() throws Throwable;
private static native java.lang.String[] __fieldRead1149_5(moom.qN a0) throws Throwable;
private static native java.lang.String[] __fieldRead1149_6() throws Throwable;
private static native java.lang.String[] __fieldRead1149_7(moom.qN a0) throws Throwable;
private static native int __call1149_8(net.minecraft.command.CommandResultStats$Type a0) throws Throwable;
private static native java.lang.String[] __fieldRead1149_9(moom.qN a0) throws Throwable;
private static native int __call1149_10(net.minecraft.command.CommandResultStats$Type a0) throws Throwable;
private static native net.minecraft.command.CommandResultStats$Type[] __call1149_11() throws Throwable;
private static native java.lang.String[] __fieldRead1149_12(moom.qN a0) throws Throwable;
private static native int __call1149_13(net.minecraft.command.CommandResultStats$Type a0) throws Throwable;
private static native java.lang.String[] __fieldRead1149_14(moom.qN a0) throws Throwable;
private static native int __call1149_15(net.minecraft.command.CommandResultStats$Type a0) throws Throwable;
private static native java.lang.String[] __fieldRead1149_16() throws Throwable;
private static native void __fieldWrite1149_17(moom.qN a0, java.lang.String[] a1) throws Throwable;
private static native java.lang.String[] __fieldRead1149_18() throws Throwable;
private static native void __fieldWrite1149_19(moom.qN a0, java.lang.String[] a1) throws Throwable;
private static native java.lang.Exception __call1114900_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1114901_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1114902_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1114903_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1114904_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1114905_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1114906_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1114907_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1114908_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_4ab66ae9856ce56b9e8f(moom.qN a0, net.minecraft.command.CommandResultStats$Type a1, java.lang.String a2, java.lang.String a3) throws E;
private static final class __SourceHandler_4ab66ae9856ce56b9e8f {

public static void f1150(moom.qN p0, net.minecraft.command.CommandResultStats$Type p1, java.lang.String p2, java.lang.String p3) throws Throwable {
    java.lang.String forwardValue1150_11_0;
    java.lang.String forwardValue1150_16_0;
    java.lang.String forwardValue1150_20_0;
    moom.qN forwardValue1150_39_0;
    java.lang.String[] forwardValue1150_50_0;
    java.lang.String spill1150_0;
    moom.qN spill1150_1;
    java.lang.String[] spill1150_2;
    long life4_3;
    int life6_5;
    forward_join_59: {
    forward_join_56: {
    forward_join_50: {
    forward_join_42: {
    forward_join_39: {
    forward_join_34: {
    forward_join_20: {
    forward_join_16: {
    forward_join_11: {
    life4_3 = (__fieldRead1150_0() ^ 7597630567773L);
    life6_5 = __integerCategory1150_2(__call1150_1());
    spill1150_0 = p2;
    if (!((life6_5 != 0))) {
        forwardValue1150_11_0 = spill1150_0;
        break forward_join_11;
    }
    if (!((spill1150_0 != null))) {
        break forward_join_56;
    }
    forwardValue1150_11_0 = p2;
    }
    if (!((life6_5 != 0))) {
        forwardValue1150_16_0 = forwardValue1150_11_0;
        break forward_join_16;
    }
    if (!((__call1150_3(forwardValue1150_11_0) != 0))) {
        break forward_join_56;
    }
    forwardValue1150_16_0 = p3;
    }
    if (!((life6_5 != 0))) {
        forwardValue1150_20_0 = forwardValue1150_16_0;
        break forward_join_20;
    }
    if (!((forwardValue1150_16_0 != null))) {
        break forward_join_56;
    }
    forwardValue1150_20_0 = p3;
    }
    if (!((__call1150_4(forwardValue1150_20_0) != 0))) {
        break forward_join_56;
    }
    spill1150_1 = p0;
    if (!((life6_5 != 0))) {
        forwardValue1150_39_0 = spill1150_1;
        break forward_join_39;
    }
    if (!((__fieldRead1150_5(spill1150_1) != __fieldRead1150_6()))) {
        break forward_join_34;
    }
    spill1150_2 = __fieldRead1150_7(p0);
    if (!((life6_5 != 0))) {
        forwardValue1150_50_0 = spill1150_2;
        break forward_join_50;
    }
    if (!((spill1150_2 == __fieldRead1150_8()))) {
        break forward_join_42;
    }
    }
    __fieldWrite1150_10(p0, new java.lang.String[__fieldRead1150_9()]);
    forwardValue1150_39_0 = p0;
    }
    __fieldWrite1150_12(forwardValue1150_39_0, new java.lang.String[__fieldRead1150_11()]);
    }
    (__fieldRead1150_13(p0))[__call1150_14(p1)] = p2;
    forwardValue1150_50_0 = __fieldRead1150_15(p0);
    }
    (forwardValue1150_50_0)[__call1150_16(p1)] = p3;
    if (!((life6_5 == 0))) {
        break forward_join_59;
    }
    }
    __call1150_17(p0, p1);
    }
    return;
}
public static void h1150_0(moom.Oo p0) throws Throwable {
    throw __call1115000_0(p0);
}
public static void h1150_1(moom.Oo p0) throws Throwable {
    throw __call1115001_0(p0);
}
public static void h1150_2(moom.Oo p0) throws Throwable {
    throw __call1115002_0(p0);
}
public static void h1150_3(moom.Oo p0) throws Throwable {
    throw __call1115003_0(p0);
}
public static void h1150_4(moom.Oo p0) throws Throwable {
    throw __call1115004_0(p0);
}
public static void h1150_5(moom.Oo p0) throws Throwable {
    throw __call1115005_0(p0);
}
public static void h1150_6(moom.Oo p0) throws Throwable {
    throw __call1115006_0(p0);
}
public static void h1150_7(moom.Oo p0) throws Throwable {
    throw __call1115007_0(p0);
}
public static void h1150_8(moom.Oo p0) throws Throwable {
    throw __call1115008_0(p0);
}
public static void h1150_9(moom.Oo p0) throws Throwable {
    throw __call1115009_0(p0);
}
private static native long __fieldRead1150_0() throws Throwable;
private static native boolean __call1150_1() throws Throwable;
private static native int __integerCategory1150_2(boolean value) throws Throwable;
private static native int __call1150_3(java.lang.String a0) throws Throwable;
private static native int __call1150_4(java.lang.String a0) throws Throwable;
private static native java.lang.String[] __fieldRead1150_5(moom.qN a0) throws Throwable;
private static native java.lang.String[] __fieldRead1150_6() throws Throwable;
private static native java.lang.String[] __fieldRead1150_7(moom.qN a0) throws Throwable;
private static native java.lang.String[] __fieldRead1150_8() throws Throwable;
private static native int __fieldRead1150_9() throws Throwable;
private static native void __fieldWrite1150_10(moom.qN a0, java.lang.String[] a1) throws Throwable;
private static native int __fieldRead1150_11() throws Throwable;
private static native void __fieldWrite1150_12(moom.qN a0, java.lang.String[] a1) throws Throwable;
private static native java.lang.String[] __fieldRead1150_13(moom.qN a0) throws Throwable;
private static native int __call1150_14(net.minecraft.command.CommandResultStats$Type a0) throws Throwable;
private static native java.lang.String[] __fieldRead1150_15(moom.qN a0) throws Throwable;
private static native int __call1150_16(net.minecraft.command.CommandResultStats$Type a0) throws Throwable;
private static native void __call1150_17(moom.qN a0, net.minecraft.command.CommandResultStats$Type a1) throws Throwable;
private static native java.lang.Exception __call1115000_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1115001_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1115002_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1115003_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1115004_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1115005_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1115006_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1115007_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1115008_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1115009_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_d277326b20e686b53508(moom.qN a0, net.minecraft.command.ICommandSender a1, net.minecraft.command.CommandResultStats$Type a2, int a3) throws E;
private static final class __SourceHandler_d277326b20e686b53508 {

public static void f458(moom.qN receiver, net.minecraft.command.ICommandSender p0, net.minecraft.command.CommandResultStats$Type p1, int p2) throws Throwable {
    net.minecraft.scoreboard.Scoreboard forwardValue458_52_0;
    java.lang.String forwardValue458_52_1;
    net.minecraft.scoreboard.ScoreObjective forwardValue458_52_2;
    boolean spill458_0;
    net.minecraft.scoreboard.Scoreboard spill458_1;
    java.lang.String spill458_2;
    net.minecraft.scoreboard.ScoreObjective spill458_3;
    long life4_3;
    java.lang.String life7_10;
    int life6_11;
    moom.qO life8_19;
    java.lang.String life9_23;
    java.lang.String life10_32;
    net.minecraft.scoreboard.Scoreboard life11_38;
    net.minecraft.scoreboard.ScoreObjective life12_42;
    net.minecraft.scoreboard.Score life13_65;
    forward_join_57: {
    forward_join_52: {
    life4_3 = (__fieldRead458_0() ^ 39898547434171L);
    spill458_0 = __call458_1();
    life7_10 = (__fieldRead458_2(receiver))[__call458_3(p1)];
    life6_11 = __integerCategory458_4(spill458_0);
    if (!((life7_10 != null))) {
        break forward_join_57;
    }
    life8_19 = new moom.qO(receiver, p0);
    life9_23 = __call458_5(life8_19, life7_10);
    life10_32 = (__fieldRead458_6(receiver))[__call458_7(p1)];
    if (!((life10_32 != null))) {
        break forward_join_57;
    }
    life11_38 = __call458_9(__call458_8(p0));
    life12_42 = __call458_10(life11_38, life10_32);
    if (!((life12_42 != null))) {
        break forward_join_57;
    }
    spill458_1 = life11_38;
    spill458_2 = life9_23;
    spill458_3 = life12_42;
    if (!((life6_11 != 0))) {
        forwardValue458_52_0 = spill458_1;
        forwardValue458_52_1 = spill458_2;
        forwardValue458_52_2 = spill458_3;
        break forward_join_52;
    }
    if (!(__call458_11(spill458_1, spill458_2, spill458_3))) {
        break forward_join_57;
    }
    forwardValue458_52_0 = life11_38;
    forwardValue458_52_1 = life9_23;
    forwardValue458_52_2 = life12_42;
    }
    life13_65 = __call458_12(forwardValue458_52_0, forwardValue458_52_1, forwardValue458_52_2);
    __call458_13(life13_65, p2);
    }
    return;
}
public static void h458_0(moom.b9 p0) throws Throwable {
    moom.b9 local1 = p0;
    return;
}
public static void h458_1(moom.b9 p0) throws Throwable {
    throw __call2045801_0(p0);
}
public static void h458_2(moom.b9 p0) throws Throwable {
    throw __call2045802_0(p0);
}
public static void h458_3(moom.b9 p0) throws Throwable {
    throw __call2045803_0(p0);
}
private static native long __fieldRead458_0() throws Throwable;
private static native boolean __call458_1() throws Throwable;
private static native java.lang.String[] __fieldRead458_2(moom.qN a0) throws Throwable;
private static native int __call458_3(net.minecraft.command.CommandResultStats$Type a0) throws Throwable;
private static native int __integerCategory458_4(boolean value) throws Throwable;
private static native java.lang.String __call458_5(moom.qO a0, java.lang.String a1) throws Throwable;
private static native java.lang.String[] __fieldRead458_6(moom.qN a0) throws Throwable;
private static native int __call458_7(net.minecraft.command.CommandResultStats$Type a0) throws Throwable;
private static native net.minecraft.world.World __call458_8(net.minecraft.command.ICommandSender a0) throws Throwable;
private static native net.minecraft.scoreboard.Scoreboard __call458_9(net.minecraft.world.World a0) throws Throwable;
private static native net.minecraft.scoreboard.ScoreObjective __call458_10(net.minecraft.scoreboard.Scoreboard a0, java.lang.String a1) throws Throwable;
private static native boolean __call458_11(net.minecraft.scoreboard.Scoreboard a0, java.lang.String a1, net.minecraft.scoreboard.ScoreObjective a2) throws Throwable;
private static native net.minecraft.scoreboard.Score __call458_12(net.minecraft.scoreboard.Scoreboard a0, java.lang.String a1, net.minecraft.scoreboard.ScoreObjective a2) throws Throwable;
private static native void __call458_13(net.minecraft.scoreboard.Score a0, int a1) throws Throwable;
private static native java.lang.Exception __call2045801_0(moom.b9 a0) throws Throwable;
private static native java.lang.Exception __call2045802_0(moom.b9 a0) throws Throwable;
private static native java.lang.Exception __call2045803_0(moom.b9 a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_6016a73694753cd87eae(moom.qN a0, net.minecraft.nbt.NBTTagCompound a1) throws E;
private static final class __SourceHandler_6016a73694753cd87eae {

public static void f1151(moom.qN receiver, net.minecraft.nbt.NBTTagCompound p0) throws Throwable {
    net.minecraft.nbt.NBTTagCompound lexicalValue1151_19_0;
    java.lang.String lexicalValue1151_19_1;
    net.minecraft.nbt.NBTTagCompound lexicalValue1151_67_0;
    java.lang.String lexicalValue1151_67_1;
    net.minecraft.nbt.NBTTagCompound spill1151_0;
    java.lang.String spill1151_1;
    net.minecraft.nbt.NBTTagCompound spill1151_2;
    java.lang.String spill1151_3;
    long life2_3;
    int life4_5;
    net.minecraft.nbt.NBTTagCompound life5_26;
    net.minecraft.command.CommandResultStats$Type[] life6_28;
    int life7_31;
    int life8_33;
    net.minecraft.command.CommandResultStats$Type life9_40;
    java.lang.String life10_44;
    java.lang.String life11_48;
    java.lang.String life12_86;
    java.lang.String life13_90;
    lexical_join_81: {
    lexical_join_19: {
    life2_3 = (__fieldRead1151_0() ^ 7815968223694L);
    life4_5 = __integerCategory1151_2(__call1151_1());
    spill1151_0 = p0;
    spill1151_1 = "CommandStats";
    if (!((life4_5 != 0))) {
        lexicalValue1151_19_0 = spill1151_0;
        lexicalValue1151_19_1 = spill1151_1;
        break lexical_join_19;
    }
    if (!(__call1151_4(spill1151_0, spill1151_1, __invokedynamic1151_3(24425, (6289720782669013159L ^ life2_3))))) {
        break lexical_join_81;
    }
    lexicalValue1151_19_0 = p0;
    lexicalValue1151_19_1 = "CommandStats";
    }
    life5_26 = __call1151_5(lexicalValue1151_19_0, lexicalValue1151_19_1);
    life6_28 = __call1151_6();
    life7_31 = (life6_28).length;
    life8_33 = 0;
    lexical_cycle_28: while (true) {
    lexical_join_79: {
    lexical_join_78: {
    lexical_join_67: {
    if (!((life8_33 < life7_31))) {
        break lexical_join_81;
    }
    life9_40 = (life6_28)[life8_33];
    life10_44 = __invokedynamic1151_8(__call1151_7(life9_40));
    life11_48 = __invokedynamic1151_10(__call1151_9(life9_40));
    if (!((life4_5 != 0))) {
        break lexical_join_79;
    }
    if (!(__call1151_12(life5_26, life10_44, __invokedynamic1151_11(12558, (1827129950180871873L ^ life2_3))))) {
        break lexical_join_78;
    }
    spill1151_2 = life5_26;
    spill1151_3 = life11_48;
    if (!((life4_5 != 0))) {
        lexicalValue1151_67_0 = spill1151_2;
        lexicalValue1151_67_1 = spill1151_3;
        break lexical_join_67;
    }
    if (!(__call1151_14(spill1151_2, spill1151_3, __invokedynamic1151_13(18628, (8430452807616821000L ^ life2_3))))) {
        break lexical_join_78;
    }
    lexicalValue1151_67_0 = life5_26;
    lexicalValue1151_67_1 = life10_44;
    }
    life12_86 = __call1151_15(lexicalValue1151_67_0, lexicalValue1151_67_1);
    life13_90 = __call1151_16(life5_26, life11_48);
    __call1151_17(receiver, life9_40, life12_86, life13_90);
    }
    life8_33 += 1;
    }
    if (!((life4_5 == 0))) { continue lexical_cycle_28; }
    break lexical_cycle_28;
    }
    }
    return;
}
public static void h1151_0(moom.Oo p0) throws Throwable {
    throw __call1115100_0(p0);
}
public static void h1151_1(moom.Oo p0) throws Throwable {
    throw __call1115101_0(p0);
}
public static void h1151_2(moom.Oo p0) throws Throwable {
    throw __call1115102_0(p0);
}
public static void h1151_3(moom.Oo p0) throws Throwable {
    throw __call1115103_0(p0);
}
public static void h1151_4(moom.Oo p0) throws Throwable {
    throw __call1115104_0(p0);
}
public static void h1151_5(moom.Oo p0) throws Throwable {
    throw __call1115105_0(p0);
}
private static native long __fieldRead1151_0() throws Throwable;
private static native boolean __call1151_1() throws Throwable;
private static native int __integerCategory1151_2(boolean value) throws Throwable;
private static native int __invokedynamic1151_3(int a0, long a1) throws Throwable;
private static native boolean __call1151_4(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call1151_5(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.command.CommandResultStats$Type[] __call1151_6() throws Throwable;
private static native java.lang.String __call1151_7(net.minecraft.command.CommandResultStats$Type a0) throws Throwable;
private static native java.lang.String __invokedynamic1151_8(java.lang.String a0) throws Throwable;
private static native java.lang.String __call1151_9(net.minecraft.command.CommandResultStats$Type a0) throws Throwable;
private static native java.lang.String __invokedynamic1151_10(java.lang.String a0) throws Throwable;
private static native int __invokedynamic1151_11(int a0, long a1) throws Throwable;
private static native boolean __call1151_12(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native int __invokedynamic1151_13(int a0, long a1) throws Throwable;
private static native boolean __call1151_14(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native java.lang.String __call1151_15(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call1151_16(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native void __call1151_17(moom.qN a0, net.minecraft.command.CommandResultStats$Type a1, java.lang.String a2, java.lang.String a3) throws Throwable;
private static native java.lang.Exception __call1115100_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1115101_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1115102_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1115103_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1115104_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1115105_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_a5c56d56bbfc670dc621(moom.qN a0, net.minecraft.nbt.NBTTagCompound a1) throws E;
private static final class __SourceHandler_a5c56d56bbfc670dc621 {

public static void f1152(moom.qN receiver, net.minecraft.nbt.NBTTagCompound p0) throws Throwable {
    net.minecraft.nbt.NBTTagCompound lexicalValue1152_65_0;
    boolean spill1152_0;
    net.minecraft.nbt.NBTTagCompound spill1152_1;
    long life2_3;
    net.minecraft.nbt.NBTTagCompound life5_8;
    int life4_9;
    net.minecraft.command.CommandResultStats$Type[] life6_11;
    int life7_14;
    int life8_16;
    net.minecraft.command.CommandResultStats$Type life9_23;
    java.lang.String life10_29;
    java.lang.String life11_35;
    lexical_join_68: {
    lexical_join_65: {
    lexical_join_59: {
    life2_3 = (__fieldRead1152_0() ^ 97990410063016L);
    spill1152_0 = __call1152_1();
    life5_8 = new net.minecraft.nbt.NBTTagCompound();
    life4_9 = __integerCategory1152_2(spill1152_0);
    life6_11 = __call1152_3();
    life7_14 = (life6_11).length;
    life8_16 = 0;
    lexical_cycle_17: while (true) {
    lexical_join_57: {
    lexical_join_56: {
    if (!((life8_16 < life7_14))) {
        break lexical_join_59;
    }
    life9_23 = (life6_11)[life8_16];
    life10_29 = (__fieldRead1152_4(receiver))[__call1152_5(life9_23)];
    life11_35 = (__fieldRead1152_6(receiver))[__call1152_7(life9_23)];
    if (!((life4_9 == 0))) {
        break lexical_join_68;
    }
    if (!((life4_9 == 0))) {
        break lexical_join_57;
    }
    if (!((life10_29 != null))) {
        break lexical_join_56;
    }
    if (!((life11_35 != null))) {
        break lexical_join_56;
    }
    __call1152_10(life5_8, __invokedynamic1152_9(__call1152_8(life9_23)), life10_29);
    __call1152_13(life5_8, __invokedynamic1152_12(__call1152_11(life9_23)), life11_35);
    }
    life8_16 += 1;
    }
    if (!((life4_9 != 0))) { continue lexical_cycle_17; }
    break lexical_cycle_17;
    }
    }
    spill1152_1 = life5_8;
    if (!((life4_9 == 0))) {
        lexicalValue1152_65_0 = spill1152_1;
        break lexical_join_65;
    }
    if (!((!__call1152_14(spill1152_1)))) {
        break lexical_join_68;
    }
    lexicalValue1152_65_0 = p0;
    }
    __call1152_15(lexicalValue1152_65_0, "CommandStats", life5_8);
    }
    return;
}
public static void h1152_0(moom.Oo p0) throws Throwable {
    throw __call1115200_0(p0);
}
public static void h1152_1(moom.Oo p0) throws Throwable {
    throw __call1115201_0(p0);
}
public static void h1152_2(moom.Oo p0) throws Throwable {
    throw __call1115202_0(p0);
}
public static void h1152_3(moom.Oo p0) throws Throwable {
    throw __call1115203_0(p0);
}
public static void h1152_4(moom.Oo p0) throws Throwable {
    throw __call1115204_0(p0);
}
public static void h1152_5(moom.Oo p0) throws Throwable {
    throw __call1115205_0(p0);
}
private static native long __fieldRead1152_0() throws Throwable;
private static native boolean __call1152_1() throws Throwable;
private static native int __integerCategory1152_2(boolean value) throws Throwable;
private static native net.minecraft.command.CommandResultStats$Type[] __call1152_3() throws Throwable;
private static native java.lang.String[] __fieldRead1152_4(moom.qN a0) throws Throwable;
private static native int __call1152_5(net.minecraft.command.CommandResultStats$Type a0) throws Throwable;
private static native java.lang.String[] __fieldRead1152_6(moom.qN a0) throws Throwable;
private static native int __call1152_7(net.minecraft.command.CommandResultStats$Type a0) throws Throwable;
private static native java.lang.String __call1152_8(net.minecraft.command.CommandResultStats$Type a0) throws Throwable;
private static native java.lang.String __invokedynamic1152_9(java.lang.String a0) throws Throwable;
private static native void __call1152_10(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native java.lang.String __call1152_11(net.minecraft.command.CommandResultStats$Type a0) throws Throwable;
private static native java.lang.String __invokedynamic1152_12(java.lang.String a0) throws Throwable;
private static native void __call1152_13(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native boolean __call1152_14(net.minecraft.nbt.NBTTagCompound a0) throws Throwable;
private static native void __call1152_15(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, net.minecraft.nbt.NBTTagCompound a2) throws Throwable;
private static native java.lang.Exception __call1115200_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1115201_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1115202_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1115203_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1115204_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1115205_0(moom.Oo a0) throws Throwable;

}


public void b(net.minecraft.nbt.NBTTagCompound p0) { __sourceHandlerCall_a5c56d56bbfc670dc621(this, p0); }


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.qN.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 25553;
      if (g[var3] == null) {
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
         long var5 = f[var3];
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
         Object[] var9 = (Object[])h.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               h.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/qN", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         g[var3] = var15;
      }

      return g[var3];
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral8749_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/qN"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(net.minecraft.command.ICommandSender p0, net.minecraft.command.CommandResultStats$Type p1, int p2) { __sourceHandlerCall_d277326b20e686b53508(this, p0, p1, p2); }


public void a(net.minecraft.nbt.NBTTagCompound p0) { __sourceHandlerCall_6016a73694753cd87eae(this, p0); }


public static void a(moom.qN p0, net.minecraft.command.CommandResultStats$Type p1, java.lang.String p2, java.lang.String p3) { __sourceHandlerCall_4ab66ae9856ce56b9e8f(p0, p1, p2, p3); }


private static void a(moom.qN p0, net.minecraft.command.CommandResultStats$Type p1) { __sourceHandlerCall_f3515ade45c806137325(p0, p1); }


public void a(moom.qN p0) {
boolean spill1272_0;
    long life2_3;
    net.minecraft.command.CommandResultStats$Type[] life5_5;
    int life6_8;
    int life7_11;
    int life4_12;
    net.minecraft.command.CommandResultStats$Type life8_19;
    lexical_join_36: {
    life2_3 = (moom.qN.e ^ 130356970143610L);
    life5_5 = net.minecraft.command.CommandResultStats$Type.values();
    life6_8 = (life5_5).length;
    spill1272_0 = moom.b7.c();
    life7_11 = 0;
    life4_12 = ((spill1272_0) ? 1 : 0);
    lexical_cycle_13: while (true) {
    if (!((life7_11 < life6_8))) {
        break lexical_join_36;
    }
    life8_19 = (life5_5)[life7_11];
    moom.qN.a(((moom.qN)(this)), ((net.minecraft.command.CommandResultStats$Type)(life8_19)), ((java.lang.String)((((moom.qN)(p0)).c)[((net.minecraft.command.CommandResultStats$Type)(life8_19)).a()])), ((java.lang.String)((((moom.qN)(p0)).d)[((net.minecraft.command.CommandResultStats$Type)(life8_19)).a()])));
    life7_11 += 1;
    if (!((life4_12 == 0))) { continue lexical_cycle_13; }
    break lexical_cycle_13;
    }
    }
    return;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral8749_0() throws E;
}
