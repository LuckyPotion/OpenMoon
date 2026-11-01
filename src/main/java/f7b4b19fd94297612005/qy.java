package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class qy extends net.minecraft.command.CommandBase {

private static long c;

private static long[] d;

private static java.lang.Integer[] e;

private static java.util.Map g;

public qy() {
super();
}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(-4340204476302663351L)), ((long)(-7728199685877484235L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(229394136547793L)))));
    g = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.qy.c ^ 134803504442455L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1482_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1482_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1482_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1482_14 = new byte[8];
    (__sourceSpill1482_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1482_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1482_16 = __sourceSpill1482_14;
    ((javax.crypto.Cipher)(__sourceSpill1482_11)).init(((int)(__sourceSpill1482_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1482_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1482_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[15];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "}`½þ$vØcÿ%Ý¥\"`¶\023ã\001Vâ\tb%\b\032éLÄdÇ<ð7¾d\004É\biÂ\023Æyq¼]w¬Ñº°-%T{[ÌÀó,NÓ\\ùv\032\016Ëa\033©3OãÝY î`Ê¡5Hïà\024º§;\nëQK"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1482_25 = local6_life21;
        int __sourceSpill1482_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1482_25)).substring(((int)(__sourceSpill1482_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1482_30 = local8_life19;
        int __sourceSpill1482_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1482_33 = new byte[8];
        (__sourceSpill1482_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1482_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1482_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1482_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1482_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1482_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1482_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1482_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1482_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1482_34)).doFinal(((byte[])(__sourceSpill1482_33)));
        (__sourceSpill1482_30)[__sourceSpill1482_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "b¯¬É-ª¼>\017[³'"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1482_38 = local6_life21;
        int __sourceSpill1482_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1482_38)).substring(((int)(__sourceSpill1482_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1482_43 = local8_life19;
        int __sourceSpill1482_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1482_46 = new byte[8];
        (__sourceSpill1482_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1482_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1482_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1482_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1482_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1482_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1482_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1482_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1482_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1482_47)).doFinal(((byte[])(__sourceSpill1482_46)));
        (__sourceSpill1482_43)[__sourceSpill1482_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    d = ((long[])(local8_life19));
    e = ((java.lang.Integer[])(new java.lang.Integer[15]));
}

private static native <E extends Throwable> moom.Bk __sourceHandlerCall_862345544e99c5560f88(moom.qy a0, java.lang.String a1) throws E;
private static final class __SourceHandler_862345544e99c5560f88 {

public static moom.Bk f1206(moom.qy receiver, java.lang.String p0) throws Throwable {
    moom.Bk forwardValue1206_29_0;
    int spill1206_0;
    moom.Bk spill1206_1;
    long life2_3;
    net.minecraft.scoreboard.Scoreboard life5_7;
    int life4_8;
    moom.Bk life6_12;
    forward_join_29: {
    forward_join_28: {
    life2_3 = (__fieldRead1206_0() ^ 42161392544475L);
    spill1206_0 = __call1206_1();
    life5_7 = __call1206_2(receiver);
    life4_8 = spill1206_0;
    life6_12 = __call1206_3(life5_7, p0);
    spill1206_1 = life6_12;
    if (!((life4_8 != 0))) {
        forwardValue1206_29_0 = spill1206_1;
        break forward_join_29;
    }
    if (!((spill1206_1 == null))) {
        break forward_join_28;
    }
    throw new moom.b7("commands.scoreboard.teamNotFound", new java.lang.Object[] {p0});
    }
    forwardValue1206_29_0 = life6_12;
    }
    return forwardValue1206_29_0;
}
public static void h1206_0(moom.b7 p0) throws Throwable {
    throw __call1120600_0(p0);
}
public static void h1206_1(moom.b7 p0) throws Throwable {
    throw __call1120601_0(p0);
}
private static native long __fieldRead1206_0() throws Throwable;
private static native int __call1206_1() throws Throwable;
private static native net.minecraft.scoreboard.Scoreboard __call1206_2(moom.qy a0) throws Throwable;
private static native moom.Bk __call1206_3(net.minecraft.scoreboard.Scoreboard a0, java.lang.String a1) throws Throwable;
private static native java.lang.Exception __call1120600_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120601_0(moom.b7 a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.scoreboard.ScoreObjective __sourceHandlerCall_7620c9d551a85304e29c(moom.qy a0, java.lang.String a1, boolean a2) throws E;
private static final class __SourceHandler_7620c9d551a85304e29c {

public static net.minecraft.scoreboard.ScoreObjective f1207(moom.qy receiver, java.lang.String p0, boolean p1) throws Throwable {
    int forwardValue1207_35_0;
    net.minecraft.scoreboard.ScoreObjective forwardValue1207_48_0;
    int spill1207_0;
    boolean spill1207_1;
    net.minecraft.scoreboard.ScoreObjective spill1207_2;
    long life3_3;
    net.minecraft.scoreboard.Scoreboard life6_7;
    net.minecraft.scoreboard.ScoreObjective life7_11;
    int life5_12;
    forward_join_48: {
    forward_join_47: {
    forward_join_35: {
    forward_join_26: {
    life3_3 = (__fieldRead1207_0() ^ 134465638799697L);
    spill1207_0 = __call1207_1();
    life6_7 = __call1207_2(receiver);
    life7_11 = __call1207_3(life6_7, p0);
    life5_12 = spill1207_0;
    if (!((life7_11 == null))) {
        break forward_join_26;
    }
    throw new moom.b7("commands.scoreboard.objectiveNotFound", new java.lang.Object[] {p0});
    }
    spill1207_1 = p1;
    if (!((life5_12 != 0))) {
        forwardValue1207_35_0 = __integerCategory1207_4(spill1207_1);
        break forward_join_35;
    }
    if (!(spill1207_1)) {
        break forward_join_47;
    }
    spill1207_2 = life7_11;
    if (!((life5_12 != 0))) {
        forwardValue1207_48_0 = spill1207_2;
        break forward_join_48;
    }
    forwardValue1207_35_0 = __integerCategory1207_7(__call1207_6(__call1207_5(spill1207_2)));
    }
    if (!((forwardValue1207_35_0 != 0))) {
        break forward_join_47;
    }
    throw new moom.b7("commands.scoreboard.objectiveReadOnly", new java.lang.Object[] {p0});
    }
    forwardValue1207_48_0 = life7_11;
    }
    return forwardValue1207_48_0;
}
public static void h1207_0(moom.b7 p0) throws Throwable {
    throw __call1120700_0(p0);
}
public static void h1207_1(moom.b7 p0) throws Throwable {
    throw __call1120701_0(p0);
}
public static void h1207_2(moom.b7 p0) throws Throwable {
    throw __call1120702_0(p0);
}
public static void h1207_3(moom.b7 p0) throws Throwable {
    throw __call1120703_0(p0);
}
public static void h1207_4(moom.b7 p0) throws Throwable {
    throw __call1120704_0(p0);
}
private static native long __fieldRead1207_0() throws Throwable;
private static native int __call1207_1() throws Throwable;
private static native net.minecraft.scoreboard.Scoreboard __call1207_2(moom.qy a0) throws Throwable;
private static native net.minecraft.scoreboard.ScoreObjective __call1207_3(net.minecraft.scoreboard.Scoreboard a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1207_4(boolean value) throws Throwable;
private static native net.minecraft.scoreboard.IScoreObjectiveCriteria __call1207_5(net.minecraft.scoreboard.ScoreObjective a0) throws Throwable;
private static native boolean __call1207_6(net.minecraft.scoreboard.IScoreObjectiveCriteria a0) throws Throwable;
private static native int __integerCategory1207_7(boolean value) throws Throwable;
private static native java.lang.Exception __call1120700_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120701_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120702_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120703_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120704_0(moom.b7 a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_2265ab4080095ab77816(moom.qy a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2) throws E;
private static final class __SourceHandler_2265ab4080095ab77816 {

public static void f1208(moom.qy receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws Throwable {
    int forwardValue1208_15_0;
    int forwardValue1208_31_0;
    int forwardValue1208_52_0;
    int forwardValue1208_65_0;
    int forwardValue1208_91_0;
    int forwardValue1208_118_0;
    int forwardValue1208_130_0;
    int forwardValue1208_137_0;
    int forwardValue1208_137_1;
    int forwardValue1208_157_0;
    int forwardValue1208_178_0;
    int forwardValue1208_204_0;
    int forwardValue1208_230_0;
    int forwardValue1208_256_0;
    int forwardValue1208_282_0;
    int forwardValue1208_294_0;
    int forwardValue1208_294_1;
    int forwardValue1208_314_0;
    int forwardValue1208_340_0;
    int forwardValue1208_356_0;
    int forwardValue1208_356_1;
    int forwardValue1208_376_0;
    int forwardValue1208_388_0;
    int forwardValue1208_413_0;
    int forwardValue1208_425_0;
    int forwardValue1208_441_0;
    int forwardValue1208_467_0;
    int forwardValue1208_493_0;
    int forwardValue1208_519_0;
    int forwardValue1208_545_0;
    int forwardValue1208_559_0;
    int forwardValue1208_559_1;
    int forwardValue1208_562_0;
    int forwardValue1208_582_0;
    int forwardValue1208_593_0;
    int forwardValue1208_613_0;
    int forwardValue1208_625_0;
    int forwardValue1208_632_0;
    int forwardValue1208_632_1;
    boolean spill1208_0;
    int spill1208_1;
    int spill1208_2;
    int spill1208_3;
    int spill1208_4;
    int spill1208_5;
    int spill1208_6;
    int spill1208_7;
    int spill1208_8;
    int spill1208_9;
    int spill1208_10;
    int spill1208_11;
    int spill1208_12;
    long life3_3;
    int life5_5;
    forward_join_645: {
    forward_join_640: {
    forward_join_632: {
    forward_join_625: {
    forward_join_623: {
    forward_join_613: {
    forward_join_608: {
    forward_join_601: {
    forward_join_593: {
    forward_join_582: {
    forward_join_577: {
    forward_join_570: {
    forward_join_563: {
    forward_join_562: {
    forward_join_559: {
    forward_join_545: {
    forward_join_540: {
    forward_join_533: {
    forward_join_519: {
    forward_join_514: {
    forward_join_507: {
    forward_join_493: {
    forward_join_488: {
    forward_join_481: {
    forward_join_467: {
    forward_join_462: {
    forward_join_455: {
    forward_join_441: {
    forward_join_436: {
    forward_join_425: {
    forward_join_423: {
    forward_join_413: {
    forward_join_408: {
    forward_join_401: {
    forward_join_388: {
    forward_join_386: {
    forward_join_376: {
    forward_join_371: {
    forward_join_364: {
    forward_join_356: {
    forward_join_340: {
    forward_join_335: {
    forward_join_328: {
    forward_join_314: {
    forward_join_309: {
    forward_join_302: {
    forward_join_294: {
    forward_join_282: {
    forward_join_277: {
    forward_join_270: {
    forward_join_256: {
    forward_join_251: {
    forward_join_244: {
    forward_join_230: {
    forward_join_225: {
    forward_join_218: {
    forward_join_204: {
    forward_join_199: {
    forward_join_192: {
    forward_join_178: {
    forward_join_173: {
    forward_join_157: {
    forward_join_152: {
    forward_join_145: {
    forward_join_137: {
    forward_join_130: {
    forward_join_128: {
    forward_join_118: {
    forward_join_113: {
    forward_join_105: {
    forward_join_91: {
    forward_join_86: {
    forward_join_79: {
    forward_join_65: {
    forward_join_60: {
    forward_join_52: {
    forward_join_47: {
    forward_join_31: {
    forward_join_26: {
    forward_join_15: {
    life3_3 = (__fieldRead1208_0() ^ 97202177398495L);
    life5_5 = __call1208_1();
    spill1208_0 = __call1208_2(receiver, p0, p1);
    if (!((life5_5 == 0))) {
        forwardValue1208_15_0 = __integerCategory1208_3(spill1208_0);
        break forward_join_15;
    }
    if (!((!spill1208_0))) {
        break forward_join_645;
    }
    forwardValue1208_15_0 = (p1).length;
    }
    if (!((life5_5 == 0))) {
        forwardValue1208_31_0 = forwardValue1208_15_0;
        break forward_join_31;
    }
    if (!((forwardValue1208_15_0 < 1))) {
        break forward_join_26;
    }
    throw new moom.cc("commands.scoreboard.usage", new java.lang.Object[0]);
    }
    forwardValue1208_31_0 = __integerCategory1208_5(__call1208_4((p1)[0], "objectives"));
    }
    if (!((life5_5 == 0))) {
        forwardValue1208_157_0 = forwardValue1208_31_0;
        break forward_join_157;
    }
    if (!((forwardValue1208_31_0 != 0))) {
        break forward_join_152;
    }
    spill1208_1 = (p1).length;
    if (!((life5_5 == 0))) {
        forwardValue1208_52_0 = spill1208_1;
        break forward_join_52;
    }
    if (!((spill1208_1 == 1))) {
        break forward_join_47;
    }
    throw new moom.cc("commands.scoreboard.objectives.usage", new java.lang.Object[0]);
    }
    forwardValue1208_52_0 = __integerCategory1208_7(__call1208_6((p1)[1], "list"));
    }
    if (!((life5_5 == 0))) {
        forwardValue1208_65_0 = forwardValue1208_52_0;
        break forward_join_65;
    }
    if (!((forwardValue1208_52_0 != 0))) {
        break forward_join_60;
    }
    __call1208_8(receiver, p0);
    if (!((life5_5 != 0))) {
        break forward_join_645;
    }
    }
    forwardValue1208_65_0 = __integerCategory1208_10(__call1208_9((p1)[1], "add"));
    }
    if (!((life5_5 == 0))) {
        forwardValue1208_91_0 = forwardValue1208_65_0;
        break forward_join_91;
    }
    if (!((forwardValue1208_65_0 != 0))) {
        break forward_join_86;
    }
    if (!(((p1).length < 4))) {
        break forward_join_79;
    }
    throw new moom.cc("commands.scoreboard.objectives.add.usage", new java.lang.Object[0]);
    }
    __call1208_11(receiver, p0, p1, 2);
    if (!((life5_5 != 0))) {
        break forward_join_645;
    }
    }
    forwardValue1208_91_0 = __integerCategory1208_13(__call1208_12((p1)[1], "remove"));
    }
    if (!((life5_5 == 0))) {
        forwardValue1208_118_0 = forwardValue1208_91_0;
        break forward_join_118;
    }
    if (!((forwardValue1208_91_0 != 0))) {
        break forward_join_113;
    }
    if (!(((p1).length != 3))) {
        break forward_join_105;
    }
    throw new moom.cc("commands.scoreboard.objectives.remove.usage", new java.lang.Object[0]);
    }
    __call1208_14(receiver, p0, (p1)[2]);
    if (!((life5_5 != 0))) {
        break forward_join_645;
    }
    }
    forwardValue1208_118_0 = __integerCategory1208_16(__call1208_15((p1)[1], "setdisplay"));
    }
    if (!((life5_5 == 0))) {
        forwardValue1208_130_0 = forwardValue1208_118_0;
        break forward_join_130;
    }
    if (!((forwardValue1208_118_0 == 0))) {
        break forward_join_128;
    }
    throw new moom.cc("commands.scoreboard.objectives.usage", new java.lang.Object[0]);
    }
    forwardValue1208_130_0 = (p1).length;
    }
    spill1208_2 = 3;
    if (!((life5_5 == 0))) {
        forwardValue1208_137_0 = forwardValue1208_130_0;
        forwardValue1208_137_1 = spill1208_2;
        break forward_join_137;
    }
    if (!((forwardValue1208_130_0 != spill1208_2))) {
        break forward_join_145;
    }
    forwardValue1208_137_0 = (p1).length;
    forwardValue1208_137_1 = 4;
    }
    if (!((forwardValue1208_137_0 != forwardValue1208_137_1))) {
        break forward_join_145;
    }
    throw new moom.cc("commands.scoreboard.objectives.setdisplay.usage", new java.lang.Object[0]);
    }
    __call1208_17(receiver, p0, p1, 2);
    if (!((life5_5 != 0))) {
        break forward_join_645;
    }
    }
    forwardValue1208_157_0 = __integerCategory1208_19(__call1208_18((p1)[0], "players"));
    }
    if (!((life5_5 == 0))) {
        forwardValue1208_413_0 = forwardValue1208_157_0;
        break forward_join_413;
    }
    if (!((forwardValue1208_157_0 != 0))) {
        break forward_join_408;
    }
    spill1208_3 = (p1).length;
    if (!((life5_5 == 0))) {
        forwardValue1208_178_0 = spill1208_3;
        break forward_join_178;
    }
    if (!((spill1208_3 == 1))) {
        break forward_join_173;
    }
    throw new moom.cc("commands.scoreboard.players.usage", new java.lang.Object[0]);
    }
    forwardValue1208_178_0 = __integerCategory1208_21(__call1208_20((p1)[1], "list"));
    }
    if (!((life5_5 == 0))) {
        forwardValue1208_204_0 = forwardValue1208_178_0;
        break forward_join_204;
    }
    if (!((forwardValue1208_178_0 != 0))) {
        break forward_join_199;
    }
    if (!(((p1).length > 3))) {
        break forward_join_192;
    }
    throw new moom.cc("commands.scoreboard.players.list.usage", new java.lang.Object[0]);
    }
    __call1208_22(receiver, p0, p1, 2);
    if (!((life5_5 != 0))) {
        break forward_join_645;
    }
    }
    forwardValue1208_204_0 = __integerCategory1208_24(__call1208_23((p1)[1], "add"));
    }
    if (!((life5_5 == 0))) {
        forwardValue1208_230_0 = forwardValue1208_204_0;
        break forward_join_230;
    }
    if (!((forwardValue1208_204_0 != 0))) {
        break forward_join_225;
    }
    if (!(((p1).length < 5))) {
        break forward_join_218;
    }
    throw new moom.cc("commands.scoreboard.players.add.usage", new java.lang.Object[0]);
    }
    __call1208_25(receiver, p0, p1, 2);
    if (!((life5_5 != 0))) {
        break forward_join_645;
    }
    }
    forwardValue1208_230_0 = __integerCategory1208_27(__call1208_26((p1)[1], "remove"));
    }
    if (!((life5_5 == 0))) {
        forwardValue1208_256_0 = forwardValue1208_230_0;
        break forward_join_256;
    }
    if (!((forwardValue1208_230_0 != 0))) {
        break forward_join_251;
    }
    if (!(((p1).length < 5))) {
        break forward_join_244;
    }
    throw new moom.cc("commands.scoreboard.players.remove.usage", new java.lang.Object[0]);
    }
    __call1208_28(receiver, p0, p1, 2);
    if (!((life5_5 != 0))) {
        break forward_join_645;
    }
    }
    forwardValue1208_256_0 = __integerCategory1208_30(__call1208_29((p1)[1], "set"));
    }
    if (!((life5_5 == 0))) {
        forwardValue1208_282_0 = forwardValue1208_256_0;
        break forward_join_282;
    }
    if (!((forwardValue1208_256_0 != 0))) {
        break forward_join_277;
    }
    if (!(((p1).length < 5))) {
        break forward_join_270;
    }
    throw new moom.cc("commands.scoreboard.players.set.usage", new java.lang.Object[0]);
    }
    __call1208_31(receiver, p0, p1, 2);
    if (!((life5_5 != 0))) {
        break forward_join_645;
    }
    }
    forwardValue1208_282_0 = __integerCategory1208_33(__call1208_32((p1)[1], "reset"));
    }
    if (!((life5_5 == 0))) {
        forwardValue1208_314_0 = forwardValue1208_282_0;
        break forward_join_314;
    }
    if (!((forwardValue1208_282_0 != 0))) {
        break forward_join_309;
    }
    spill1208_4 = (p1).length;
    spill1208_5 = 3;
    if (!((life5_5 == 0))) {
        forwardValue1208_294_0 = spill1208_4;
        forwardValue1208_294_1 = spill1208_5;
        break forward_join_294;
    }
    if (!((spill1208_4 != spill1208_5))) {
        break forward_join_302;
    }
    forwardValue1208_294_0 = (p1).length;
    forwardValue1208_294_1 = 4;
    }
    if (!((forwardValue1208_294_0 != forwardValue1208_294_1))) {
        break forward_join_302;
    }
    throw new moom.cc("commands.scoreboard.players.reset.usage", new java.lang.Object[0]);
    }
    __call1208_34(receiver, p0, p1, 2);
    if (!((life5_5 != 0))) {
        break forward_join_645;
    }
    }
    forwardValue1208_314_0 = __integerCategory1208_36(__call1208_35((p1)[1], "enable"));
    }
    if (!((life5_5 == 0))) {
        forwardValue1208_340_0 = forwardValue1208_314_0;
        break forward_join_340;
    }
    if (!((forwardValue1208_314_0 != 0))) {
        break forward_join_335;
    }
    if (!(((p1).length != 4))) {
        break forward_join_328;
    }
    throw new moom.cc("commands.scoreboard.players.enable.usage", new java.lang.Object[0]);
    }
    __call1208_37(receiver, p0, p1, 2);
    if (!((life5_5 != 0))) {
        break forward_join_645;
    }
    }
    forwardValue1208_340_0 = __integerCategory1208_39(__call1208_38((p1)[1], "test"));
    }
    if (!((life5_5 == 0))) {
        forwardValue1208_376_0 = forwardValue1208_340_0;
        break forward_join_376;
    }
    if (!((forwardValue1208_340_0 != 0))) {
        break forward_join_371;
    }
    spill1208_6 = (p1).length;
    spill1208_7 = 5;
    if (!((life5_5 == 0))) {
        forwardValue1208_356_0 = spill1208_6;
        forwardValue1208_356_1 = spill1208_7;
        break forward_join_356;
    }
    if (!((spill1208_6 != spill1208_7))) {
        break forward_join_364;
    }
    forwardValue1208_356_0 = (p1).length;
    forwardValue1208_356_1 = __invokedynamic1208_40(14132, (448097934313352110L ^ life3_3));
    }
    if (!((forwardValue1208_356_0 != forwardValue1208_356_1))) {
        break forward_join_364;
    }
    throw new moom.cc("commands.scoreboard.players.test.usage", new java.lang.Object[0]);
    }
    __call1208_41(receiver, p0, p1, 2);
    if (!((life5_5 != 0))) {
        break forward_join_645;
    }
    }
    forwardValue1208_376_0 = __integerCategory1208_43(__call1208_42((p1)[1], "operation"));
    }
    if (!((life5_5 == 0))) {
        forwardValue1208_388_0 = forwardValue1208_376_0;
        break forward_join_388;
    }
    if (!((forwardValue1208_376_0 == 0))) {
        break forward_join_386;
    }
    throw new moom.cc("commands.scoreboard.players.usage", new java.lang.Object[0]);
    }
    forwardValue1208_388_0 = (p1).length;
    }
    if (!((forwardValue1208_388_0 != __invokedynamic1208_44(17861, (248699161488103773L ^ life3_3))))) {
        break forward_join_401;
    }
    throw new moom.cc("commands.scoreboard.players.operation.usage", new java.lang.Object[0]);
    }
    __call1208_45(receiver, p0, p1, 2);
    if (!((life5_5 != 0))) {
        break forward_join_645;
    }
    }
    forwardValue1208_413_0 = __integerCategory1208_47(__call1208_46((p1)[0], "teams"));
    }
    if (!((life5_5 == 0))) {
        forwardValue1208_425_0 = forwardValue1208_413_0;
        break forward_join_425;
    }
    if (!((forwardValue1208_413_0 == 0))) {
        break forward_join_423;
    }
    throw new moom.cc("commands.scoreboard.usage", new java.lang.Object[0]);
    }
    forwardValue1208_425_0 = (p1).length;
    }
    if (!((life5_5 == 0))) {
        forwardValue1208_441_0 = forwardValue1208_425_0;
        break forward_join_441;
    }
    if (!((forwardValue1208_425_0 == 1))) {
        break forward_join_436;
    }
    throw new moom.cc("commands.scoreboard.teams.usage", new java.lang.Object[0]);
    }
    forwardValue1208_441_0 = __integerCategory1208_49(__call1208_48((p1)[1], "list"));
    }
    if (!((life5_5 == 0))) {
        forwardValue1208_467_0 = forwardValue1208_441_0;
        break forward_join_467;
    }
    if (!((forwardValue1208_441_0 != 0))) {
        break forward_join_462;
    }
    if (!(((p1).length > 3))) {
        break forward_join_455;
    }
    throw new moom.cc("commands.scoreboard.teams.list.usage", new java.lang.Object[0]);
    }
    __call1208_50(receiver, p0, p1, 2);
    if (!((life5_5 != 0))) {
        break forward_join_645;
    }
    }
    forwardValue1208_467_0 = __integerCategory1208_52(__call1208_51((p1)[1], "add"));
    }
    if (!((life5_5 == 0))) {
        forwardValue1208_493_0 = forwardValue1208_467_0;
        break forward_join_493;
    }
    if (!((forwardValue1208_467_0 != 0))) {
        break forward_join_488;
    }
    if (!(((p1).length < 3))) {
        break forward_join_481;
    }
    throw new moom.cc("commands.scoreboard.teams.add.usage", new java.lang.Object[0]);
    }
    __call1208_53(receiver, p0, p1, 2);
    if (!((life5_5 != 0))) {
        break forward_join_645;
    }
    }
    forwardValue1208_493_0 = __integerCategory1208_55(__call1208_54((p1)[1], "remove"));
    }
    if (!((life5_5 == 0))) {
        forwardValue1208_519_0 = forwardValue1208_493_0;
        break forward_join_519;
    }
    if (!((forwardValue1208_493_0 != 0))) {
        break forward_join_514;
    }
    if (!(((p1).length != 3))) {
        break forward_join_507;
    }
    throw new moom.cc("commands.scoreboard.teams.remove.usage", new java.lang.Object[0]);
    }
    __call1208_56(receiver, p0, p1, 2);
    if (!((life5_5 != 0))) {
        break forward_join_645;
    }
    }
    forwardValue1208_519_0 = __integerCategory1208_58(__call1208_57((p1)[1], "empty"));
    }
    if (!((life5_5 == 0))) {
        forwardValue1208_545_0 = forwardValue1208_519_0;
        break forward_join_545;
    }
    if (!((forwardValue1208_519_0 != 0))) {
        break forward_join_540;
    }
    if (!(((p1).length != 3))) {
        break forward_join_533;
    }
    throw new moom.cc("commands.scoreboard.teams.empty.usage", new java.lang.Object[0]);
    }
    __call1208_59(receiver, p0, p1, 2);
    if (!((life5_5 != 0))) {
        break forward_join_645;
    }
    }
    forwardValue1208_545_0 = __integerCategory1208_61(__call1208_60((p1)[1], "join"));
    }
    if (!((life5_5 == 0))) {
        forwardValue1208_582_0 = forwardValue1208_545_0;
        break forward_join_582;
    }
    if (!((forwardValue1208_545_0 != 0))) {
        break forward_join_577;
    }
    spill1208_8 = (p1).length;
    spill1208_9 = 4;
    if (!((life5_5 == 0))) {
        forwardValue1208_559_0 = spill1208_8;
        forwardValue1208_559_1 = spill1208_9;
        break forward_join_559;
    }
    if (!((spill1208_8 < spill1208_9))) {
        break forward_join_570;
    }
    spill1208_10 = (p1).length;
    if (!((life5_5 == 0))) {
        forwardValue1208_562_0 = spill1208_10;
        break forward_join_562;
    }
    forwardValue1208_559_0 = spill1208_10;
    forwardValue1208_559_1 = 3;
    }
    if (!((forwardValue1208_559_0 == forwardValue1208_559_1))) {
        break forward_join_563;
    }
    forwardValue1208_562_0 = __instanceOf1208_62(p0);
    }
    if (!((forwardValue1208_562_0 == 0))) {
        break forward_join_570;
    }
    }
    throw new moom.cc("commands.scoreboard.teams.join.usage", new java.lang.Object[0]);
    }
    __call1208_63(receiver, p0, p1, 2);
    if (!((life5_5 != 0))) {
        break forward_join_645;
    }
    }
    forwardValue1208_582_0 = __integerCategory1208_65(__call1208_64((p1)[1], "leave"));
    }
    if (!((life5_5 == 0))) {
        forwardValue1208_613_0 = forwardValue1208_582_0;
        break forward_join_613;
    }
    if (!((forwardValue1208_582_0 != 0))) {
        break forward_join_608;
    }
    spill1208_11 = (p1).length;
    if (!((life5_5 == 0))) {
        forwardValue1208_593_0 = spill1208_11;
        break forward_join_593;
    }
    if (!((spill1208_11 < 3))) {
        break forward_join_601;
    }
    forwardValue1208_593_0 = __instanceOf1208_66(p0);
    }
    if (!((forwardValue1208_593_0 == 0))) {
        break forward_join_601;
    }
    throw new moom.cc("commands.scoreboard.teams.leave.usage", new java.lang.Object[0]);
    }
    __call1208_67(receiver, p0, p1, 2);
    if (!((life5_5 != 0))) {
        break forward_join_645;
    }
    }
    forwardValue1208_613_0 = __integerCategory1208_69(__call1208_68((p1)[1], "option"));
    }
    if (!((life5_5 == 0))) {
        forwardValue1208_625_0 = forwardValue1208_613_0;
        break forward_join_625;
    }
    if (!((forwardValue1208_613_0 == 0))) {
        break forward_join_623;
    }
    throw new moom.cc("commands.scoreboard.teams.usage", new java.lang.Object[0]);
    }
    forwardValue1208_625_0 = (p1).length;
    }
    spill1208_12 = 4;
    if (!((life5_5 == 0))) {
        forwardValue1208_632_0 = forwardValue1208_625_0;
        forwardValue1208_632_1 = spill1208_12;
        break forward_join_632;
    }
    if (!((forwardValue1208_625_0 != spill1208_12))) {
        break forward_join_640;
    }
    forwardValue1208_632_0 = (p1).length;
    forwardValue1208_632_1 = 5;
    }
    if (!((forwardValue1208_632_0 != forwardValue1208_632_1))) {
        break forward_join_640;
    }
    throw new moom.cc("commands.scoreboard.teams.option.usage", new java.lang.Object[0]);
    }
    __call1208_70(receiver, p0, p1, 2);
    }
    return;
}
public static void h1208_0(moom.b7 p0) throws Throwable {
    throw __call1120800_0(p0);
}
public static void h1208_1(moom.b7 p0) throws Throwable {
    throw __call1120801_0(p0);
}
public static void h1208_2(moom.b7 p0) throws Throwable {
    throw __call1120802_0(p0);
}
public static void h1208_3(moom.b7 p0) throws Throwable {
    throw __call1120803_0(p0);
}
public static void h1208_4(moom.b7 p0) throws Throwable {
    throw __call1120804_0(p0);
}
public static void h1208_5(moom.b7 p0) throws Throwable {
    throw __call1120805_0(p0);
}
public static void h1208_6(moom.b7 p0) throws Throwable {
    throw __call1120806_0(p0);
}
public static void h1208_7(moom.b7 p0) throws Throwable {
    throw __call1120807_0(p0);
}
public static void h1208_8(moom.b7 p0) throws Throwable {
    throw __call1120808_0(p0);
}
public static void h1208_9(moom.b7 p0) throws Throwable {
    throw __call1120809_0(p0);
}
public static void h1208_10(moom.b7 p0) throws Throwable {
    throw __call1120810_0(p0);
}
public static void h1208_11(moom.b7 p0) throws Throwable {
    throw __call1120811_0(p0);
}
public static void h1208_12(moom.b7 p0) throws Throwable {
    throw __call1120812_0(p0);
}
public static void h1208_13(moom.b7 p0) throws Throwable {
    throw __call1120813_0(p0);
}
public static void h1208_14(moom.b7 p0) throws Throwable {
    throw __call1120814_0(p0);
}
public static void h1208_15(moom.b7 p0) throws Throwable {
    throw __call1120815_0(p0);
}
public static void h1208_16(moom.b7 p0) throws Throwable {
    throw __call1120816_0(p0);
}
public static void h1208_17(moom.b7 p0) throws Throwable {
    throw __call1120817_0(p0);
}
public static void h1208_18(moom.b7 p0) throws Throwable {
    throw __call1120818_0(p0);
}
public static void h1208_19(moom.b7 p0) throws Throwable {
    throw __call1120819_0(p0);
}
public static void h1208_20(moom.b7 p0) throws Throwable {
    throw __call1120820_0(p0);
}
public static void h1208_21(moom.b7 p0) throws Throwable {
    throw __call1120821_0(p0);
}
public static void h1208_22(moom.b7 p0) throws Throwable {
    throw __call1120822_0(p0);
}
public static void h1208_23(moom.b7 p0) throws Throwable {
    throw __call1120823_0(p0);
}
public static void h1208_24(moom.b7 p0) throws Throwable {
    throw __call1120824_0(p0);
}
public static void h1208_25(moom.b7 p0) throws Throwable {
    throw __call1120825_0(p0);
}
public static void h1208_26(moom.b7 p0) throws Throwable {
    throw __call1120826_0(p0);
}
public static void h1208_27(moom.b7 p0) throws Throwable {
    throw __call1120827_0(p0);
}
public static void h1208_28(moom.b7 p0) throws Throwable {
    throw __call1120828_0(p0);
}
public static void h1208_29(moom.b7 p0) throws Throwable {
    throw __call1120829_0(p0);
}
public static void h1208_30(moom.b7 p0) throws Throwable {
    throw __call1120830_0(p0);
}
public static void h1208_31(moom.b7 p0) throws Throwable {
    throw __call1120831_0(p0);
}
public static void h1208_32(moom.b7 p0) throws Throwable {
    throw __call1120832_0(p0);
}
public static void h1208_33(moom.b7 p0) throws Throwable {
    throw __call1120833_0(p0);
}
public static void h1208_34(moom.b7 p0) throws Throwable {
    throw __call1120834_0(p0);
}
public static void h1208_35(moom.b7 p0) throws Throwable {
    throw __call1120835_0(p0);
}
public static void h1208_36(moom.b7 p0) throws Throwable {
    throw __call1120836_0(p0);
}
public static void h1208_37(moom.b7 p0) throws Throwable {
    throw __call1120837_0(p0);
}
public static void h1208_38(moom.b7 p0) throws Throwable {
    throw __call1120838_0(p0);
}
public static void h1208_39(moom.b7 p0) throws Throwable {
    throw __call1120839_0(p0);
}
public static void h1208_40(moom.b7 p0) throws Throwable {
    throw __call1120840_0(p0);
}
public static void h1208_41(moom.b7 p0) throws Throwable {
    throw __call1120841_0(p0);
}
public static void h1208_42(moom.b7 p0) throws Throwable {
    throw __call1120842_0(p0);
}
public static void h1208_43(moom.b7 p0) throws Throwable {
    throw __call1120843_0(p0);
}
public static void h1208_44(moom.b7 p0) throws Throwable {
    throw __call1120844_0(p0);
}
public static void h1208_45(moom.b7 p0) throws Throwable {
    throw __call1120845_0(p0);
}
public static void h1208_46(moom.b7 p0) throws Throwable {
    throw __call1120846_0(p0);
}
public static void h1208_47(moom.b7 p0) throws Throwable {
    throw __call1120847_0(p0);
}
public static void h1208_48(moom.b7 p0) throws Throwable {
    throw __call1120848_0(p0);
}
public static void h1208_49(moom.b7 p0) throws Throwable {
    throw __call1120849_0(p0);
}
public static void h1208_50(moom.b7 p0) throws Throwable {
    throw __call1120850_0(p0);
}
public static void h1208_51(moom.b7 p0) throws Throwable {
    throw __call1120851_0(p0);
}
public static void h1208_52(moom.b7 p0) throws Throwable {
    throw __call1120852_0(p0);
}
public static void h1208_53(moom.b7 p0) throws Throwable {
    throw __call1120853_0(p0);
}
public static void h1208_54(moom.b7 p0) throws Throwable {
    throw __call1120854_0(p0);
}
public static void h1208_55(moom.b7 p0) throws Throwable {
    throw __call1120855_0(p0);
}
public static void h1208_56(moom.b7 p0) throws Throwable {
    throw __call1120856_0(p0);
}
public static void h1208_57(moom.b7 p0) throws Throwable {
    throw __call1120857_0(p0);
}
public static void h1208_58(moom.b7 p0) throws Throwable {
    throw __call1120858_0(p0);
}
public static void h1208_59(moom.b7 p0) throws Throwable {
    throw __call1120859_0(p0);
}
public static void h1208_60(moom.b7 p0) throws Throwable {
    throw __call1120860_0(p0);
}
public static void h1208_61(moom.b7 p0) throws Throwable {
    throw __call1120861_0(p0);
}
public static void h1208_62(moom.b7 p0) throws Throwable {
    throw __call1120862_0(p0);
}
public static void h1208_63(moom.b7 p0) throws Throwable {
    throw __call1120863_0(p0);
}
public static void h1208_64(moom.b7 p0) throws Throwable {
    throw __call1120864_0(p0);
}
public static void h1208_65(moom.b7 p0) throws Throwable {
    throw __call1120865_0(p0);
}
public static void h1208_66(moom.b7 p0) throws Throwable {
    throw __call1120866_0(p0);
}
public static void h1208_67(moom.b7 p0) throws Throwable {
    throw __call1120867_0(p0);
}
public static void h1208_68(moom.b7 p0) throws Throwable {
    throw __call1120868_0(p0);
}
public static void h1208_69(moom.b7 p0) throws Throwable {
    throw __call1120869_0(p0);
}
public static void h1208_70(moom.b7 p0) throws Throwable {
    throw __call1120870_0(p0);
}
public static void h1208_71(moom.b7 p0) throws Throwable {
    throw __call1120871_0(p0);
}
public static void h1208_72(moom.b7 p0) throws Throwable {
    throw __call1120872_0(p0);
}
public static void h1208_73(moom.b7 p0) throws Throwable {
    throw __call1120873_0(p0);
}
public static void h1208_74(moom.b7 p0) throws Throwable {
    throw __call1120874_0(p0);
}
public static void h1208_75(moom.b7 p0) throws Throwable {
    throw __call1120875_0(p0);
}
public static void h1208_76(moom.b7 p0) throws Throwable {
    throw __call1120876_0(p0);
}
public static void h1208_77(moom.b7 p0) throws Throwable {
    throw __call1120877_0(p0);
}
public static void h1208_78(moom.b7 p0) throws Throwable {
    throw __call1120878_0(p0);
}
public static void h1208_79(moom.b7 p0) throws Throwable {
    throw __call1120879_0(p0);
}
public static void h1208_80(moom.b7 p0) throws Throwable {
    throw __call1120880_0(p0);
}
public static void h1208_81(moom.b7 p0) throws Throwable {
    throw __call1120881_0(p0);
}
public static void h1208_82(moom.b7 p0) throws Throwable {
    throw __call1120882_0(p0);
}
public static void h1208_83(moom.b7 p0) throws Throwable {
    throw __call1120883_0(p0);
}
public static void h1208_84(moom.b7 p0) throws Throwable {
    throw __call1120884_0(p0);
}
public static void h1208_85(moom.b7 p0) throws Throwable {
    throw __call1120885_0(p0);
}
public static void h1208_86(moom.b7 p0) throws Throwable {
    throw __call1120886_0(p0);
}
public static void h1208_87(moom.b7 p0) throws Throwable {
    throw __call1120887_0(p0);
}
public static void h1208_88(moom.b7 p0) throws Throwable {
    throw __call1120888_0(p0);
}
public static void h1208_89(moom.b7 p0) throws Throwable {
    throw __call1120889_0(p0);
}
public static void h1208_90(moom.b7 p0) throws Throwable {
    throw __call1120890_0(p0);
}
public static void h1208_91(moom.b7 p0) throws Throwable {
    throw __call1120891_0(p0);
}
public static void h1208_92(moom.b7 p0) throws Throwable {
    throw __call1120892_0(p0);
}
public static void h1208_93(moom.b7 p0) throws Throwable {
    throw __call1120893_0(p0);
}
public static void h1208_94(moom.b7 p0) throws Throwable {
    throw __call1120894_0(p0);
}
public static void h1208_95(moom.b7 p0) throws Throwable {
    throw __call1120895_0(p0);
}
public static void h1208_96(moom.b7 p0) throws Throwable {
    throw __call1120896_0(p0);
}
public static void h1208_97(moom.b7 p0) throws Throwable {
    throw __call1120897_0(p0);
}
public static void h1208_98(moom.b7 p0) throws Throwable {
    throw __call1120898_0(p0);
}
public static void h1208_99(moom.b7 p0) throws Throwable {
    throw __call1120899_0(p0);
}
public static void h1208_100(moom.b7 p0) throws Throwable {
    throw __call1120900_0(p0);
}
public static void h1208_101(moom.b7 p0) throws Throwable {
    throw __call1120901_0(p0);
}
public static void h1208_102(moom.b7 p0) throws Throwable {
    throw __call1120902_0(p0);
}
public static void h1208_103(moom.b7 p0) throws Throwable {
    throw __call1120903_0(p0);
}
private static native long __fieldRead1208_0() throws Throwable;
private static native int __call1208_1() throws Throwable;
private static native boolean __call1208_2(moom.qy a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2) throws Throwable;
private static native int __integerCategory1208_3(boolean value) throws Throwable;
private static native boolean __call1208_4(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1208_5(boolean value) throws Throwable;
private static native boolean __call1208_6(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1208_7(boolean value) throws Throwable;
private static native void __call1208_8(moom.qy a0, net.minecraft.command.ICommandSender a1) throws Throwable;
private static native boolean __call1208_9(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1208_10(boolean value) throws Throwable;
private static native void __call1208_11(moom.qy a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2, int a3) throws Throwable;
private static native boolean __call1208_12(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1208_13(boolean value) throws Throwable;
private static native void __call1208_14(moom.qy a0, net.minecraft.command.ICommandSender a1, java.lang.String a2) throws Throwable;
private static native boolean __call1208_15(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1208_16(boolean value) throws Throwable;
private static native void __call1208_17(moom.qy a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2, int a3) throws Throwable;
private static native boolean __call1208_18(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1208_19(boolean value) throws Throwable;
private static native boolean __call1208_20(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1208_21(boolean value) throws Throwable;
private static native void __call1208_22(moom.qy a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2, int a3) throws Throwable;
private static native boolean __call1208_23(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1208_24(boolean value) throws Throwable;
private static native void __call1208_25(moom.qy a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2, int a3) throws Throwable;
private static native boolean __call1208_26(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1208_27(boolean value) throws Throwable;
private static native void __call1208_28(moom.qy a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2, int a3) throws Throwable;
private static native boolean __call1208_29(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1208_30(boolean value) throws Throwable;
private static native void __call1208_31(moom.qy a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2, int a3) throws Throwable;
private static native boolean __call1208_32(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1208_33(boolean value) throws Throwable;
private static native void __call1208_34(moom.qy a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2, int a3) throws Throwable;
private static native boolean __call1208_35(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1208_36(boolean value) throws Throwable;
private static native void __call1208_37(moom.qy a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2, int a3) throws Throwable;
private static native boolean __call1208_38(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1208_39(boolean value) throws Throwable;
private static native int __invokedynamic1208_40(int a0, long a1) throws Throwable;
private static native void __call1208_41(moom.qy a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2, int a3) throws Throwable;
private static native boolean __call1208_42(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1208_43(boolean value) throws Throwable;
private static native int __invokedynamic1208_44(int a0, long a1) throws Throwable;
private static native void __call1208_45(moom.qy a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2, int a3) throws Throwable;
private static native boolean __call1208_46(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1208_47(boolean value) throws Throwable;
private static native boolean __call1208_48(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1208_49(boolean value) throws Throwable;
private static native void __call1208_50(moom.qy a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2, int a3) throws Throwable;
private static native boolean __call1208_51(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1208_52(boolean value) throws Throwable;
private static native void __call1208_53(moom.qy a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2, int a3) throws Throwable;
private static native boolean __call1208_54(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1208_55(boolean value) throws Throwable;
private static native void __call1208_56(moom.qy a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2, int a3) throws Throwable;
private static native boolean __call1208_57(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1208_58(boolean value) throws Throwable;
private static native void __call1208_59(moom.qy a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2, int a3) throws Throwable;
private static native boolean __call1208_60(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1208_61(boolean value) throws Throwable;
private static native int __instanceOf1208_62(net.minecraft.command.ICommandSender a0) throws Throwable;
private static native void __call1208_63(moom.qy a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2, int a3) throws Throwable;
private static native boolean __call1208_64(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1208_65(boolean value) throws Throwable;
private static native int __instanceOf1208_66(net.minecraft.command.ICommandSender a0) throws Throwable;
private static native void __call1208_67(moom.qy a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2, int a3) throws Throwable;
private static native boolean __call1208_68(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1208_69(boolean value) throws Throwable;
private static native void __call1208_70(moom.qy a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2, int a3) throws Throwable;
private static native java.lang.Exception __call1120800_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120801_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120802_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120803_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120804_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120805_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120806_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120807_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120808_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120809_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120810_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120811_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120812_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120813_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120814_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120815_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120816_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120817_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120818_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120819_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120820_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120821_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120822_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120823_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120824_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120825_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120826_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120827_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120828_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120829_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120830_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120831_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120832_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120833_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120834_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120835_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120836_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120837_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120838_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120839_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120840_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120841_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120842_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120843_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120844_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120845_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120846_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120847_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120848_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120849_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120850_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120851_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120852_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120853_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120854_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120855_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120856_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120857_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120858_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120859_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120860_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120861_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120862_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120863_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120864_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120865_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120866_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120867_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120868_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120869_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120870_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120871_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120872_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120873_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120874_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120875_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120876_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120877_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120878_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120879_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120880_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120881_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120882_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120883_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120884_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120885_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120886_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120887_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120888_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120889_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120890_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120891_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120892_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120893_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120894_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120895_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120896_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120897_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120898_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120899_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120900_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120901_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120902_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120903_0(moom.b7 a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_50ada76537afa6e57635(moom.qy a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2, int a3) throws E;
private static final class __SourceHandler_50ada76537afa6e57635 {

public static void f62(moom.qy receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1, int p2) throws Throwable {
    int forwardValue62_84_0;
    int forwardValue62_96_0;
    int forwardValue62_136_0;
    int spill62_0;
    int spill62_1;
    int spill62_2;
    long life4_3;
    java.lang.String life7_8;
    java.lang.String life8_13;
    net.minecraft.scoreboard.Scoreboard life9_16;
    net.minecraft.scoreboard.IScoreObjectiveCriteria life10_22;
    int life6_23;
    java.lang.String life11_117;
    forward_join_157: {
    forward_join_152: {
    forward_join_150: {
    forward_join_145: {
    forward_join_136: {
    forward_join_134: {
    forward_join_96: {
    forward_join_94: {
    forward_join_84: {
    forward_join_82: {
    forward_join_52: {
    forward_join_37: {
    life4_3 = (__fieldRead62_0() ^ 91613436458062L);
    life7_8 = (p1)[(p2++)];
    life8_13 = (p1)[(p2++)];
    life9_16 = __call62_1(receiver);
    spill62_0 = __call62_2();
    life10_22 = __cast62_5(__call62_4(__fieldRead62_3(), life8_13));
    life6_23 = spill62_0;
    if (!((life10_22 == null))) {
        break forward_join_37;
    }
    throw new moom.cc("commands.scoreboard.objectives.add.wrongType", new java.lang.Object[] {life8_13});
    }
    if (!((__call62_6(life9_16, life7_8) != null))) {
        break forward_join_52;
    }
    throw new moom.b7("commands.scoreboard.objectives.add.alreadyExists", new java.lang.Object[] {life7_8});
    }
    spill62_1 = __call62_7(life7_8);
    if (!((life6_23 != 0))) {
        forwardValue62_84_0 = spill62_1;
        break forward_join_84;
    }
    if (!((spill62_1 > __invokedynamic62_8(22879, (2343953013508630367L ^ life4_3))))) {
        break forward_join_82;
    }
    throw new moom.cb("commands.scoreboard.objectives.add.tooLong", new java.lang.Object[] {life7_8, __call62_10(__invokedynamic62_9(6746, (3292153875289842775L ^ life4_3)))});
    }
    forwardValue62_84_0 = __call62_11(life7_8);
    }
    if (!((life6_23 != 0))) {
        forwardValue62_96_0 = forwardValue62_84_0;
        break forward_join_96;
    }
    if (!((forwardValue62_84_0 == 0))) {
        break forward_join_94;
    }
    throw new moom.cc("commands.scoreboard.objectives.add.usage", new java.lang.Object[0]);
    }
    forwardValue62_96_0 = (p1).length;
    }
    if (!((forwardValue62_96_0 > p2))) {
        break forward_join_152;
    }
    life11_117 = __call62_13(__call62_12(p0, p1, p2));
    spill62_2 = __call62_14(life11_117);
    if (!((life6_23 != 0))) {
        forwardValue62_136_0 = spill62_2;
        break forward_join_136;
    }
    if (!((spill62_2 > __invokedynamic62_15(27043, (5669674948903786409L ^ life4_3))))) {
        break forward_join_134;
    }
    throw new moom.cb("commands.scoreboard.objectives.add.displayTooLong", new java.lang.Object[] {life11_117, __call62_17(__invokedynamic62_16(4580, (622608097597927400L ^ life4_3)))});
    }
    forwardValue62_136_0 = __call62_18(life11_117);
    }
    if (!((forwardValue62_136_0 > 0))) {
        break forward_join_145;
    }
    __call62_20(__call62_19(life9_16, life7_8, life10_22), life11_117);
    if (!((life6_23 == 0))) {
        break forward_join_150;
    }
    }
    __call62_21(life9_16, life7_8, life10_22);
    }
    if (!((life6_23 == 0))) {
        break forward_join_157;
    }
    }
    __call62_22(life9_16, life7_8, life10_22);
    }
    __call62_23(p0, receiver, "commands.scoreboard.objectives.add.success", new java.lang.Object[] {life7_8});
    return;
}
public static void h62_0(moom.b7 p0) throws Throwable {
    throw __call3006200_0(p0);
}
public static void h62_1(moom.b7 p0) throws Throwable {
    throw __call3006201_0(p0);
}
public static void h62_2(moom.b7 p0) throws Throwable {
    throw __call3006202_0(p0);
}
public static void h62_3(moom.b7 p0) throws Throwable {
    throw __call3006203_0(p0);
}
public static void h62_4(moom.b7 p0) throws Throwable {
    throw __call3006204_0(p0);
}
public static void h62_5(moom.b7 p0) throws Throwable {
    throw __call3006205_0(p0);
}
public static void h62_6(moom.b7 p0) throws Throwable {
    throw __call3006206_0(p0);
}
public static void h62_7(moom.b7 p0) throws Throwable {
    throw __call3006207_0(p0);
}
public static void h62_8(moom.b7 p0) throws Throwable {
    throw __call3006208_0(p0);
}
public static void h62_9(moom.b7 p0) throws Throwable {
    throw __call3006209_0(p0);
}
public static void h62_10(moom.b7 p0) throws Throwable {
    throw __call3006210_0(p0);
}
private static native long __fieldRead62_0() throws Throwable;
private static native net.minecraft.scoreboard.Scoreboard __call62_1(moom.qy a0) throws Throwable;
private static native int __call62_2() throws Throwable;
private static native java.util.Map __fieldRead62_3() throws Throwable;
private static native java.lang.Object __call62_4(java.util.Map a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.scoreboard.IScoreObjectiveCriteria __cast62_5(java.lang.Object a0) throws Throwable;
private static native net.minecraft.scoreboard.ScoreObjective __call62_6(net.minecraft.scoreboard.Scoreboard a0, java.lang.String a1) throws Throwable;
private static native int __call62_7(java.lang.String a0) throws Throwable;
private static native int __invokedynamic62_8(int a0, long a1) throws Throwable;
private static native int __invokedynamic62_9(int a0, long a1) throws Throwable;
private static native java.lang.Integer __call62_10(int a0) throws Throwable;
private static native int __call62_11(java.lang.String a0) throws Throwable;
private static native net.minecraft.util.IChatComponent __call62_12(net.minecraft.command.ICommandSender a0, java.lang.String[] a1, int a2) throws Throwable;
private static native java.lang.String __call62_13(net.minecraft.util.IChatComponent a0) throws Throwable;
private static native int __call62_14(java.lang.String a0) throws Throwable;
private static native int __invokedynamic62_15(int a0, long a1) throws Throwable;
private static native int __invokedynamic62_16(int a0, long a1) throws Throwable;
private static native java.lang.Integer __call62_17(int a0) throws Throwable;
private static native int __call62_18(java.lang.String a0) throws Throwable;
private static native net.minecraft.scoreboard.ScoreObjective __call62_19(net.minecraft.scoreboard.Scoreboard a0, java.lang.String a1, net.minecraft.scoreboard.IScoreObjectiveCriteria a2) throws Throwable;
private static native void __call62_20(net.minecraft.scoreboard.ScoreObjective a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.scoreboard.ScoreObjective __call62_21(net.minecraft.scoreboard.Scoreboard a0, java.lang.String a1, net.minecraft.scoreboard.IScoreObjectiveCriteria a2) throws Throwable;
private static native net.minecraft.scoreboard.ScoreObjective __call62_22(net.minecraft.scoreboard.Scoreboard a0, java.lang.String a1, net.minecraft.scoreboard.IScoreObjectiveCriteria a2) throws Throwable;
private static native void __call62_23(net.minecraft.command.ICommandSender a0, moom.qy a1, java.lang.String a2, java.lang.Object[] a3) throws Throwable;
private static native java.lang.Exception __call3006200_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3006201_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3006202_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3006203_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3006204_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3006205_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3006206_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3006207_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3006208_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3006209_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3006210_0(moom.b7 a0) throws Throwable;

}

private static native <E extends Throwable> java.util.List __sourceHandlerCall_d52def4868c45e075ec7(moom.qy a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2, moom.DT a3) throws E;
private static final class __SourceHandler_d52def4868c45e075ec7 {

public static java.util.List f189(moom.qy receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1, moom.DT p2) throws Throwable {
    int forwardValue189_34_0;
    int forwardValue189_69_0;
    int forwardValue189_88_0;
    java.lang.String[] forwardValue189_98_0;
    int forwardValue189_108_0;
    int forwardValue189_113_0;
    int forwardValue189_126_0;
    int forwardValue189_126_1;
    java.lang.String[] forwardValue189_128_0;
    int forwardValue189_138_0;
    int forwardValue189_201_0;
    int forwardValue189_252_0;
    int forwardValue189_252_1;
    java.lang.String[] forwardValue189_254_0;
    int forwardValue189_263_0;
    int forwardValue189_284_0;
    int forwardValue189_297_0;
    int forwardValue189_297_1;
    int forwardValue189_309_0;
    int forwardValue189_309_1;
    int forwardValue189_376_0;
    int forwardValue189_376_1;
    int forwardValue189_393_0;
    int forwardValue189_393_1;
    java.lang.String[] forwardValue189_395_0;
    int forwardValue189_402_0;
    int forwardValue189_417_0;
    int forwardValue189_417_1;
    int forwardValue189_425_0;
    java.lang.String[] forwardValue189_427_0;
    int forwardValue189_434_0;
    int forwardValue189_448_0;
    int forwardValue189_448_1;
    java.lang.String[] forwardValue189_450_0;
    int forwardValue189_460_0;
    int forwardValue189_465_0;
    int forwardValue189_515_0;
    int forwardValue189_535_0;
    int forwardValue189_535_1;
    java.lang.String[] forwardValue189_537_0;
    int forwardValue189_546_0;
    int forwardValue189_559_0;
    int forwardValue189_588_0;
    int forwardValue189_601_0;
    int forwardValue189_601_1;
    int forwardValue189_634_0;
    int forwardValue189_634_1;
    int forwardValue189_640_0;
    int forwardValue189_656_0;
    java.lang.String[] forwardValue189_666_0;
    int forwardValue189_676_0;
    java.lang.String[] forwardValue189_687_0;
    int forwardValue189_687_1;
    int forwardValue189_702_0;
    java.lang.String[] forwardValue189_705_0;
    int spill189_0;
    java.lang.String[] spill189_1;
    java.lang.String[] spill189_2;
    java.lang.String[] spill189_3;
    java.lang.String[] spill189_4;
    int spill189_5;
    java.lang.String[] spill189_6;
    java.lang.String[] spill189_7;
    java.lang.String[] spill189_8;
    java.lang.String[] spill189_9;
    java.lang.String[] spill189_10;
    java.lang.String[] spill189_11;
    int spill189_12;
    java.lang.String[] spill189_13;
    int spill189_14;
    java.lang.String[] spill189_15;
    java.lang.String[] spill189_16;
    java.lang.String[] spill189_17;
    java.lang.String[] spill189_18;
    java.lang.String[] spill189_19;
    java.lang.String[] spill189_20;
    java.lang.String[] spill189_21;
    java.lang.String[] spill189_22;
    java.lang.String[] spill189_23;
    boolean spill189_24;
    boolean spill189_25;
    boolean spill189_26;
    boolean spill189_27;
    int spill189_28;
    int spill189_29;
    java.lang.String[] spill189_30;
    boolean spill189_31;
    boolean spill189_32;
    int spill189_33;
    java.lang.String[] spill189_34;
    java.lang.String[] spill189_35;
    java.lang.String[] spill189_36;
    java.lang.String[] spill189_37;
    java.lang.String[] spill189_38;
    java.lang.String[] spill189_39;
    java.lang.String[] spill189_40;
    java.lang.String[] spill189_41;
    java.lang.String[] spill189_42;
    java.lang.String[] spill189_43;
    java.lang.String[] spill189_44;
    int spill189_45;
    int spill189_46;
    java.lang.String[] spill189_47;
    int spill189_48;
    java.lang.String[] spill189_49;
    java.lang.String[] spill189_50;
    java.lang.String[] spill189_51;
    java.lang.String[] spill189_52;
    java.lang.String[] spill189_53;
    java.lang.String[] spill189_54;
    java.lang.String[] spill189_55;
    java.lang.String[] spill189_56;
    java.lang.String[] spill189_57;
    int spill189_58;
    int spill189_59;
    java.lang.String[] spill189_60;
    boolean spill189_61;
    boolean spill189_62;
    boolean spill189_63;
    int spill189_64;
    java.lang.String[] spill189_65;
    java.lang.String[] spill189_66;
    java.lang.String[] spill189_67;
    java.lang.String[] spill189_68;
    java.lang.String[] spill189_69;
    java.lang.String[] spill189_70;
    int spill189_71;
    java.lang.String[] spill189_72;
    boolean spill189_73;
    java.lang.String[] spill189_74;
    int spill189_75;
    java.lang.String[] spill189_76;
    int spill189_77;
    java.lang.String[] spill189_78;
    java.lang.String[] spill189_79;
    java.lang.String[] spill189_80;
    long life4_3;
    int life6_5;
    java.util.Set life7_100;
    forward_join_710: {
    forward_join_705: {
    forward_join_702: {
    forward_join_698: {
    forward_join_687: {
    forward_join_685: {
    forward_join_676: {
    forward_join_669: {
    forward_join_666: {
    forward_join_665: {
    forward_join_656: {
    forward_join_649: {
    forward_join_640: {
    forward_join_634: {
    forward_join_629: {
    forward_join_601: {
    forward_join_598: {
    forward_join_588: {
    forward_join_559: {
    forward_join_554: {
    forward_join_546: {
    forward_join_541: {
    forward_join_537: {
    forward_join_535: {
    forward_join_530: {
    forward_join_515: {
    forward_join_510: {
    forward_join_465: {
    forward_join_460: {
    forward_join_455: {
    forward_join_450: {
    forward_join_448: {
    forward_join_443: {
    forward_join_434: {
    forward_join_432: {
    forward_join_427: {
    forward_join_425: {
    forward_join_417: {
    forward_join_412: {
    forward_join_402: {
    forward_join_400: {
    forward_join_395: {
    forward_join_393: {
    forward_join_384: {
    forward_join_376: {
    forward_join_369: {
    forward_join_309: {
    forward_join_306: {
    forward_join_297: {
    forward_join_294: {
    forward_join_284: {
    forward_join_263: {
    forward_join_258: {
    forward_join_254: {
    forward_join_252: {
    forward_join_247: {
    forward_join_201: {
    forward_join_196: {
    forward_join_138: {
    forward_join_133: {
    forward_join_128: {
    forward_join_126: {
    forward_join_121: {
    forward_join_113: {
    forward_join_108: {
    forward_join_103: {
    forward_join_98: {
    forward_join_88: {
    forward_join_83: {
    forward_join_69: {
    forward_join_64: {
    forward_join_34: {
    forward_join_29: {
    life4_3 = (__fieldRead189_0() ^ 34563588867932L);
    life6_5 = __call189_1();
    spill189_0 = (p1).length;
    if (!((life6_5 == 0))) {
        forwardValue189_34_0 = spill189_0;
        break forward_join_34;
    }
    if (!((spill189_0 == 1))) {
        break forward_join_29;
    }
    spill189_1 = p1;
    java.lang.String[] __stackOp189_2_0 = new java.lang.String[3];
    spill189_2 = __stackOp189_2_0;
    (__stackOp189_2_0)[0] = "objectives";
    java.lang.String[] __stackOp189_3_0 = spill189_2;
    spill189_3 = __stackOp189_3_0;
    (__stackOp189_3_0)[1] = "players";
    java.lang.String[] __stackOp189_4_0 = spill189_3;
    spill189_4 = __stackOp189_4_0;
    (__stackOp189_4_0)[2] = "teams";
    return __call189_5(spill189_1, spill189_4);
    }
    forwardValue189_34_0 = __integerCategory189_7(__call189_6((p1)[0], "objectives"));
    }
    if (!((life6_5 == 0))) {
        forwardValue189_138_0 = forwardValue189_34_0;
        break forward_join_138;
    }
    if (!((forwardValue189_34_0 != 0))) {
        break forward_join_133;
    }
    spill189_5 = (p1).length;
    if (!((life6_5 == 0))) {
        forwardValue189_69_0 = spill189_5;
        break forward_join_69;
    }
    if (!((spill189_5 == 2))) {
        break forward_join_64;
    }
    spill189_6 = p1;
    java.lang.String[] __stackOp189_8_0 = new java.lang.String[4];
    spill189_7 = __stackOp189_8_0;
    (__stackOp189_8_0)[0] = "list";
    java.lang.String[] __stackOp189_9_0 = spill189_7;
    spill189_8 = __stackOp189_9_0;
    (__stackOp189_9_0)[1] = "add";
    java.lang.String[] __stackOp189_10_0 = spill189_8;
    spill189_9 = __stackOp189_10_0;
    (__stackOp189_10_0)[2] = "remove";
    java.lang.String[] __stackOp189_11_0 = spill189_9;
    spill189_10 = __stackOp189_11_0;
    (__stackOp189_11_0)[3] = "setdisplay";
    return __call189_12(spill189_6, spill189_10);
    }
    forwardValue189_69_0 = __integerCategory189_14(__call189_13((p1)[1], "add"));
    }
    if (!((life6_5 == 0))) {
        forwardValue189_88_0 = forwardValue189_69_0;
        break forward_join_88;
    }
    if (!((forwardValue189_69_0 != 0))) {
        break forward_join_83;
    }
    if (!(((p1).length == 4))) {
        break forward_join_710;
    }
    life7_100 = __call189_16(__fieldRead189_15());
    return __call189_17(p1, life7_100);
    }
    forwardValue189_88_0 = __integerCategory189_19(__call189_18((p1)[1], "remove"));
    }
    if (!((life6_5 == 0))) {
        forwardValue189_108_0 = forwardValue189_88_0;
        break forward_join_108;
    }
    if (!((forwardValue189_88_0 != 0))) {
        break forward_join_103;
    }
    spill189_11 = p1;
    if (!((life6_5 == 0))) {
        forwardValue189_98_0 = spill189_11;
        break forward_join_98;
    }
    if (!(((spill189_11).length == 3))) {
        break forward_join_710;
    }
    forwardValue189_98_0 = p1;
    }
    return __call189_21(forwardValue189_98_0, __call189_20(receiver, 0));
    }
    forwardValue189_108_0 = __integerCategory189_23(__call189_22((p1)[1], "setdisplay"));
    }
    if (!((life6_5 == 0))) {
        forwardValue189_113_0 = forwardValue189_108_0;
        break forward_join_113;
    }
    if (!((forwardValue189_108_0 != 0))) {
        break forward_join_710;
    }
    forwardValue189_113_0 = (p1).length;
    }
    spill189_12 = 3;
    if (!((life6_5 == 0))) {
        forwardValue189_126_0 = forwardValue189_113_0;
        forwardValue189_126_1 = spill189_12;
        break forward_join_126;
    }
    if (!((forwardValue189_113_0 == spill189_12))) {
        break forward_join_121;
    }
    return __call189_25(p1, __call189_24());
    }
    spill189_13 = p1;
    if (!((life6_5 == 0))) {
        forwardValue189_128_0 = spill189_13;
        break forward_join_128;
    }
    forwardValue189_126_0 = (spill189_13).length;
    forwardValue189_126_1 = 4;
    }
    if (!((forwardValue189_126_0 == forwardValue189_126_1))) {
        break forward_join_710;
    }
    forwardValue189_128_0 = p1;
    }
    return __call189_27(forwardValue189_128_0, __call189_26(receiver, 0));
    }
    forwardValue189_138_0 = __integerCategory189_29(__call189_28((p1)[0], "players"));
    }
    if (!((life6_5 == 0))) {
        forwardValue189_460_0 = forwardValue189_138_0;
        break forward_join_460;
    }
    if (!((forwardValue189_138_0 != 0))) {
        break forward_join_455;
    }
    spill189_14 = (p1).length;
    if (!((life6_5 == 0))) {
        forwardValue189_201_0 = spill189_14;
        break forward_join_201;
    }
    if (!((spill189_14 == 2))) {
        break forward_join_196;
    }
    spill189_15 = p1;
    java.lang.String[] __stackOp189_31_0 = new java.lang.String[__invokedynamic189_30(14158, (8242456471889246802L ^ life4_3))];
    spill189_16 = __stackOp189_31_0;
    (__stackOp189_31_0)[0] = "set";
    java.lang.String[] __stackOp189_32_0 = spill189_16;
    spill189_17 = __stackOp189_32_0;
    (__stackOp189_32_0)[1] = "add";
    java.lang.String[] __stackOp189_33_0 = spill189_17;
    spill189_18 = __stackOp189_33_0;
    (__stackOp189_33_0)[2] = "remove";
    java.lang.String[] __stackOp189_34_0 = spill189_18;
    spill189_19 = __stackOp189_34_0;
    (__stackOp189_34_0)[3] = "reset";
    java.lang.String[] __stackOp189_35_0 = spill189_19;
    spill189_20 = __stackOp189_35_0;
    (__stackOp189_35_0)[4] = "list";
    java.lang.String[] __stackOp189_36_0 = spill189_20;
    spill189_21 = __stackOp189_36_0;
    (__stackOp189_36_0)[5] = "enable";
    java.lang.String[] __stackOp189_37_0 = spill189_21;
    spill189_22 = __stackOp189_37_0;
    (__stackOp189_37_0)[__invokedynamic189_38(12855, (2410023310495481642L ^ life4_3))] = "test";
    java.lang.String[] __stackOp189_39_0 = spill189_22;
    spill189_23 = __stackOp189_39_0;
    (__stackOp189_39_0)[__invokedynamic189_40(17256, (2075064577937903228L ^ life4_3))] = "operation";
    return __call189_41(spill189_15, spill189_23);
    }
    forwardValue189_201_0 = __integerCategory189_43(__call189_42((p1)[1], "set"));
    }
    if (!((life6_5 == 0))) {
        forwardValue189_434_0 = forwardValue189_201_0;
        break forward_join_434;
    }
    if (!((forwardValue189_201_0 == 0))) {
        break forward_join_432;
    }
    spill189_24 = __call189_44((p1)[1], "add");
    if (!((life6_5 == 0))) {
        forwardValue189_434_0 = __integerCategory189_45(spill189_24);
        break forward_join_434;
    }
    if (!((!spill189_24))) {
        break forward_join_432;
    }
    spill189_25 = __call189_46((p1)[1], "remove");
    if (!((life6_5 == 0))) {
        forwardValue189_434_0 = __integerCategory189_47(spill189_25);
        break forward_join_434;
    }
    if (!((!spill189_25))) {
        break forward_join_432;
    }
    spill189_26 = __call189_48((p1)[1], "reset");
    if (!((life6_5 == 0))) {
        forwardValue189_434_0 = __integerCategory189_49(spill189_26);
        break forward_join_434;
    }
    if (!((!spill189_26))) {
        break forward_join_432;
    }
    spill189_27 = __call189_50((p1)[1], "enable");
    if (!((life6_5 == 0))) {
        forwardValue189_263_0 = __integerCategory189_51(spill189_27);
        break forward_join_263;
    }
    if (!(spill189_27)) {
        break forward_join_258;
    }
    spill189_28 = (p1).length;
    spill189_29 = 3;
    if (!((life6_5 == 0))) {
        forwardValue189_252_0 = spill189_28;
        forwardValue189_252_1 = spill189_29;
        break forward_join_252;
    }
    if (!((spill189_28 == spill189_29))) {
        break forward_join_247;
    }
    return __call189_54(p1, __call189_53(__call189_52()));
    }
    spill189_30 = p1;
    if (!((life6_5 == 0))) {
        forwardValue189_254_0 = spill189_30;
        break forward_join_254;
    }
    forwardValue189_252_0 = (spill189_30).length;
    forwardValue189_252_1 = 4;
    }
    if (!((forwardValue189_252_0 == forwardValue189_252_1))) {
        break forward_join_710;
    }
    forwardValue189_254_0 = p1;
    }
    return __call189_56(forwardValue189_254_0, __call189_55(receiver));
    }
    forwardValue189_263_0 = __integerCategory189_58(__call189_57((p1)[1], "list"));
    }
    if (!((life6_5 == 0))) {
        forwardValue189_402_0 = forwardValue189_263_0;
        break forward_join_402;
    }
    if (!((forwardValue189_263_0 == 0))) {
        break forward_join_400;
    }
    spill189_31 = __call189_59((p1)[1], "test");
    if (!((life6_5 == 0))) {
        forwardValue189_402_0 = __integerCategory189_60(spill189_31);
        break forward_join_402;
    }
    if (!((!spill189_31))) {
        break forward_join_400;
    }
    spill189_32 = __call189_61((p1)[1], "operation");
    if (!((life6_5 == 0))) {
        forwardValue189_284_0 = __integerCategory189_62(spill189_32);
        break forward_join_284;
    }
    if (!(spill189_32)) {
        break forward_join_710;
    }
    forwardValue189_284_0 = (p1).length;
    }
    spill189_33 = 3;
    if (!((life6_5 == 0))) {
        forwardValue189_297_0 = forwardValue189_284_0;
        forwardValue189_297_1 = spill189_33;
        break forward_join_297;
    }
    if (!((forwardValue189_284_0 == spill189_33))) {
        break forward_join_294;
    }
    return __call189_65(p1, __call189_64(__call189_63(receiver)));
    }
    forwardValue189_297_0 = (p1).length;
    forwardValue189_297_1 = 4;
    }
    if (!((life6_5 == 0))) {
        forwardValue189_309_0 = forwardValue189_297_0;
        forwardValue189_309_1 = forwardValue189_297_1;
        break forward_join_309;
    }
    if (!((forwardValue189_297_0 == forwardValue189_297_1))) {
        break forward_join_306;
    }
    return __call189_67(p1, __call189_66(receiver, 1));
    }
    forwardValue189_309_0 = (p1).length;
    forwardValue189_309_1 = 5;
    }
    if (!((life6_5 == 0))) {
        forwardValue189_376_0 = forwardValue189_309_0;
        forwardValue189_376_1 = forwardValue189_309_1;
        break forward_join_376;
    }
    if (!((forwardValue189_309_0 == forwardValue189_309_1))) {
        break forward_join_369;
    }
    spill189_34 = p1;
    java.lang.String[] __stackOp189_69_0 = new java.lang.String[__invokedynamic189_68(12077, (2112520522565247549L ^ life4_3))];
    spill189_35 = __stackOp189_69_0;
    (__stackOp189_69_0)[0] = "+=";
    java.lang.String[] __stackOp189_70_0 = spill189_35;
    spill189_36 = __stackOp189_70_0;
    (__stackOp189_70_0)[1] = "-=";
    java.lang.String[] __stackOp189_71_0 = spill189_36;
    spill189_37 = __stackOp189_71_0;
    (__stackOp189_71_0)[2] = "*=";
    java.lang.String[] __stackOp189_72_0 = spill189_37;
    spill189_38 = __stackOp189_72_0;
    (__stackOp189_72_0)[3] = "/=";
    java.lang.String[] __stackOp189_73_0 = spill189_38;
    spill189_39 = __stackOp189_73_0;
    (__stackOp189_73_0)[4] = "%=";
    java.lang.String[] __stackOp189_74_0 = spill189_39;
    spill189_40 = __stackOp189_74_0;
    (__stackOp189_74_0)[5] = "=";
    java.lang.String[] __stackOp189_75_0 = spill189_40;
    spill189_41 = __stackOp189_75_0;
    (__stackOp189_75_0)[__invokedynamic189_76(12855, (2410023310495481642L ^ life4_3))] = "<";
    java.lang.String[] __stackOp189_77_0 = spill189_41;
    spill189_42 = __stackOp189_77_0;
    (__stackOp189_77_0)[__invokedynamic189_78(17256, (2075064577937903228L ^ life4_3))] = ">";
    java.lang.String[] __stackOp189_79_0 = spill189_42;
    spill189_43 = __stackOp189_79_0;
    (__stackOp189_79_0)[__invokedynamic189_80(6749, (1532907859477911374L ^ life4_3))] = "><";
    return __call189_81(spill189_34, spill189_43);
    }
    forwardValue189_376_0 = (p1).length;
    forwardValue189_376_1 = __invokedynamic189_82(12855, (2410023310495481642L ^ life4_3));
    }
    if (!((life6_5 == 0))) {
        forwardValue189_393_0 = forwardValue189_376_0;
        forwardValue189_393_1 = forwardValue189_376_1;
        break forward_join_393;
    }
    if (!((forwardValue189_376_0 == forwardValue189_376_1))) {
        break forward_join_384;
    }
    return __call189_85(p1, __call189_84(__call189_83()));
    }
    spill189_44 = p1;
    if (!((life6_5 == 0))) {
        forwardValue189_395_0 = spill189_44;
        break forward_join_395;
    }
    forwardValue189_393_0 = (spill189_44).length;
    forwardValue189_393_1 = __invokedynamic189_86(17256, (2075064577937903228L ^ life4_3));
    }
    if (!((forwardValue189_393_0 == forwardValue189_393_1))) {
        break forward_join_710;
    }
    forwardValue189_395_0 = p1;
    }
    return __call189_88(forwardValue189_395_0, __call189_87(receiver, 0));
    }
    forwardValue189_402_0 = (p1).length;
    }
    spill189_45 = 3;
    if (!((life6_5 == 0))) {
        forwardValue189_417_0 = forwardValue189_402_0;
        forwardValue189_417_1 = spill189_45;
        break forward_join_417;
    }
    if (!((forwardValue189_402_0 == spill189_45))) {
        break forward_join_412;
    }
    return __call189_91(p1, __call189_90(__call189_89(receiver)));
    }
    spill189_46 = (p1).length;
    if (!((life6_5 == 0))) {
        forwardValue189_425_0 = spill189_46;
        break forward_join_425;
    }
    forwardValue189_417_0 = spill189_46;
    forwardValue189_417_1 = 4;
    }
    if (!((forwardValue189_417_0 == forwardValue189_417_1))) {
        break forward_join_710;
    }
    spill189_47 = p1;
    if (!((life6_5 == 0))) {
        forwardValue189_427_0 = spill189_47;
        break forward_join_427;
    }
    forwardValue189_425_0 = __integerCategory189_93(__call189_92((spill189_47)[1], "test"));
    }
    if (!((forwardValue189_425_0 != 0))) {
        break forward_join_710;
    }
    forwardValue189_427_0 = p1;
    }
    return __call189_95(forwardValue189_427_0, __call189_94(receiver, 0));
    }
    forwardValue189_434_0 = (p1).length;
    }
    spill189_48 = 3;
    if (!((life6_5 == 0))) {
        forwardValue189_448_0 = forwardValue189_434_0;
        forwardValue189_448_1 = spill189_48;
        break forward_join_448;
    }
    if (!((forwardValue189_434_0 == spill189_48))) {
        break forward_join_443;
    }
    return __call189_98(p1, __call189_97(__call189_96()));
    }
    spill189_49 = p1;
    if (!((life6_5 == 0))) {
        forwardValue189_450_0 = spill189_49;
        break forward_join_450;
    }
    forwardValue189_448_0 = (spill189_49).length;
    forwardValue189_448_1 = 4;
    }
    if (!((forwardValue189_448_0 == forwardValue189_448_1))) {
        break forward_join_710;
    }
    forwardValue189_450_0 = p1;
    }
    return __call189_100(forwardValue189_450_0, __call189_99(receiver, 1));
    }
    forwardValue189_460_0 = __integerCategory189_102(__call189_101((p1)[0], "teams"));
    }
    if (!((life6_5 == 0))) {
        forwardValue189_465_0 = forwardValue189_460_0;
        break forward_join_465;
    }
    if (!((forwardValue189_460_0 != 0))) {
        break forward_join_710;
    }
    forwardValue189_465_0 = (p1).length;
    }
    if (!((life6_5 == 0))) {
        forwardValue189_515_0 = forwardValue189_465_0;
        break forward_join_515;
    }
    if (!((forwardValue189_465_0 == 2))) {
        break forward_join_510;
    }
    spill189_50 = p1;
    java.lang.String[] __stackOp189_104_0 = new java.lang.String[__invokedynamic189_103(17256, (2075064577937903228L ^ life4_3))];
    spill189_51 = __stackOp189_104_0;
    (__stackOp189_104_0)[0] = "add";
    java.lang.String[] __stackOp189_105_0 = spill189_51;
    spill189_52 = __stackOp189_105_0;
    (__stackOp189_105_0)[1] = "remove";
    java.lang.String[] __stackOp189_106_0 = spill189_52;
    spill189_53 = __stackOp189_106_0;
    (__stackOp189_106_0)[2] = "join";
    java.lang.String[] __stackOp189_107_0 = spill189_53;
    spill189_54 = __stackOp189_107_0;
    (__stackOp189_107_0)[3] = "leave";
    java.lang.String[] __stackOp189_108_0 = spill189_54;
    spill189_55 = __stackOp189_108_0;
    (__stackOp189_108_0)[4] = "empty";
    java.lang.String[] __stackOp189_109_0 = spill189_55;
    spill189_56 = __stackOp189_109_0;
    (__stackOp189_109_0)[5] = "list";
    java.lang.String[] __stackOp189_110_0 = spill189_56;
    spill189_57 = __stackOp189_110_0;
    (__stackOp189_110_0)[__invokedynamic189_111(12855, (2410023310495481642L ^ life4_3))] = "option";
    return __call189_112(spill189_50, spill189_57);
    }
    forwardValue189_515_0 = __integerCategory189_114(__call189_113((p1)[1], "join"));
    }
    if (!((life6_5 == 0))) {
        forwardValue189_546_0 = forwardValue189_515_0;
        break forward_join_546;
    }
    if (!((forwardValue189_515_0 != 0))) {
        break forward_join_541;
    }
    spill189_58 = (p1).length;
    spill189_59 = 3;
    if (!((life6_5 == 0))) {
        forwardValue189_535_0 = spill189_58;
        forwardValue189_535_1 = spill189_59;
        break forward_join_535;
    }
    if (!((spill189_58 == spill189_59))) {
        break forward_join_530;
    }
    return __call189_117(p1, __call189_116(__call189_115(receiver)));
    }
    spill189_60 = p1;
    if (!((life6_5 == 0))) {
        forwardValue189_537_0 = spill189_60;
        break forward_join_537;
    }
    forwardValue189_535_0 = (spill189_60).length;
    forwardValue189_535_1 = 4;
    }
    if (!((forwardValue189_535_0 >= forwardValue189_535_1))) {
        break forward_join_710;
    }
    forwardValue189_537_0 = p1;
    }
    return __call189_120(forwardValue189_537_0, __call189_119(__call189_118()));
    }
    forwardValue189_546_0 = __integerCategory189_122(__call189_121((p1)[1], "leave"));
    }
    if (!((life6_5 == 0))) {
        forwardValue189_559_0 = forwardValue189_546_0;
        break forward_join_559;
    }
    if (!((forwardValue189_546_0 != 0))) {
        break forward_join_554;
    }
    return __call189_125(p1, __call189_124(__call189_123()));
    }
    forwardValue189_559_0 = __integerCategory189_127(__call189_126((p1)[1], "empty"));
    }
    if (!((life6_5 == 0))) {
        forwardValue189_702_0 = forwardValue189_559_0;
        break forward_join_702;
    }
    if (!((forwardValue189_559_0 == 0))) {
        break forward_join_698;
    }
    spill189_61 = __call189_128((p1)[1], "list");
    if (!((life6_5 == 0))) {
        forwardValue189_702_0 = __integerCategory189_129(spill189_61);
        break forward_join_702;
    }
    if (!((!spill189_61))) {
        break forward_join_698;
    }
    spill189_62 = __call189_130((p1)[1], "remove");
    if (!((life6_5 == 0))) {
        forwardValue189_702_0 = __integerCategory189_131(spill189_62);
        break forward_join_702;
    }
    if (!((!spill189_62))) {
        break forward_join_698;
    }
    spill189_63 = __call189_132((p1)[1], "option");
    if (!((life6_5 == 0))) {
        forwardValue189_588_0 = __integerCategory189_133(spill189_63);
        break forward_join_588;
    }
    if (!(spill189_63)) {
        break forward_join_710;
    }
    forwardValue189_588_0 = (p1).length;
    }
    spill189_64 = 3;
    if (!((life6_5 == 0))) {
        forwardValue189_601_0 = forwardValue189_588_0;
        forwardValue189_601_1 = spill189_64;
        break forward_join_601;
    }
    if (!((forwardValue189_588_0 == spill189_64))) {
        break forward_join_598;
    }
    return __call189_136(p1, __call189_135(__call189_134(receiver)));
    }
    forwardValue189_601_0 = (p1).length;
    forwardValue189_601_1 = 4;
    }
    if (!((life6_5 == 0))) {
        forwardValue189_634_0 = forwardValue189_601_0;
        forwardValue189_634_1 = forwardValue189_601_1;
        break forward_join_634;
    }
    if (!((forwardValue189_601_0 == forwardValue189_601_1))) {
        break forward_join_629;
    }
    spill189_65 = p1;
    java.lang.String[] __stackOp189_137_0 = new java.lang.String[5];
    spill189_66 = __stackOp189_137_0;
    (__stackOp189_137_0)[0] = "color";
    java.lang.String[] __stackOp189_138_0 = spill189_66;
    spill189_67 = __stackOp189_138_0;
    (__stackOp189_138_0)[1] = "friendlyfire";
    java.lang.String[] __stackOp189_139_0 = spill189_67;
    spill189_68 = __stackOp189_139_0;
    (__stackOp189_139_0)[2] = "seeFriendlyInvisibles";
    java.lang.String[] __stackOp189_140_0 = spill189_68;
    spill189_69 = __stackOp189_140_0;
    (__stackOp189_140_0)[3] = "nametagVisibility";
    java.lang.String[] __stackOp189_141_0 = spill189_69;
    spill189_70 = __stackOp189_141_0;
    (__stackOp189_141_0)[4] = "deathMessageVisibility";
    return __call189_142(spill189_65, spill189_70);
    }
    spill189_71 = (p1).length;
    if (!((life6_5 == 0))) {
        forwardValue189_640_0 = spill189_71;
        break forward_join_640;
    }
    forwardValue189_634_0 = spill189_71;
    forwardValue189_634_1 = 5;
    }
    if (!((forwardValue189_634_0 == forwardValue189_634_1))) {
        break forward_join_710;
    }
    forwardValue189_640_0 = __integerCategory189_144(__call189_143((p1)[3], "color"));
    }
    if (!((life6_5 == 0))) {
        forwardValue189_656_0 = forwardValue189_640_0;
        break forward_join_656;
    }
    if (!((forwardValue189_640_0 != 0))) {
        break forward_join_649;
    }
    return __call189_146(p1, __call189_145(1, 0));
    }
    spill189_72 = p1;
    if (!((life6_5 == 0))) {
        forwardValue189_666_0 = spill189_72;
        break forward_join_666;
    }
    forwardValue189_656_0 = __integerCategory189_148(__call189_147((spill189_72)[3], "nametagVisibility"));
    }
    if (!((forwardValue189_656_0 == 0))) {
        break forward_join_665;
    }
    spill189_73 = __call189_149((p1)[3], "deathMessageVisibility");
    if (!((life6_5 == 0))) {
        forwardValue189_676_0 = __integerCategory189_150(spill189_73);
        break forward_join_676;
    }
    if (!(spill189_73)) {
        break forward_join_669;
    }
    }
    forwardValue189_666_0 = p1;
    }
    return __call189_152(forwardValue189_666_0, __call189_151());
    }
    spill189_74 = p1;
    spill189_75 = 3;
    if (!((life6_5 == 0))) {
        forwardValue189_687_0 = spill189_74;
        forwardValue189_687_1 = spill189_75;
        break forward_join_687;
    }
    forwardValue189_676_0 = __integerCategory189_154(__call189_153((spill189_74)[spill189_75], "friendlyfire"));
    }
    if (!((forwardValue189_676_0 == 0))) {
        break forward_join_685;
    }
    spill189_76 = p1;
    spill189_77 = 3;
    if (!((life6_5 == 0))) {
        forwardValue189_687_0 = spill189_76;
        forwardValue189_687_1 = spill189_77;
        break forward_join_687;
    }
    if (!(__call189_155((spill189_76)[spill189_77], "seeFriendlyInvisibles"))) {
        break forward_join_710;
    }
    }
    forwardValue189_687_0 = p1;
    forwardValue189_687_1 = 2;
    }
    java.lang.String[] __stackOp189_156_0 = new java.lang.String[forwardValue189_687_1];
    spill189_78 = __stackOp189_156_0;
    (__stackOp189_156_0)[0] = "true";
    java.lang.String[] __stackOp189_157_0 = spill189_78;
    spill189_79 = __stackOp189_157_0;
    (__stackOp189_157_0)[1] = "false";
    return __call189_158(forwardValue189_687_0, spill189_79);
    }
    spill189_80 = p1;
    if (!((life6_5 == 0))) {
        forwardValue189_705_0 = spill189_80;
        break forward_join_705;
    }
    forwardValue189_702_0 = (spill189_80).length;
    }
    if (!((forwardValue189_702_0 == 3))) {
        break forward_join_710;
    }
    forwardValue189_705_0 = p1;
    }
    return __call189_161(forwardValue189_705_0, __call189_160(__call189_159(receiver)));
    }
    return null;
}
public static void h189_0(moom.Oo p0) throws Throwable {
    throw __call1018900_0(p0);
}
public static void h189_1(moom.Oo p0) throws Throwable {
    throw __call1018901_0(p0);
}
public static void h189_2(moom.Oo p0) throws Throwable {
    throw __call1018902_0(p0);
}
public static void h189_3(moom.Oo p0) throws Throwable {
    throw __call1018903_0(p0);
}
public static void h189_4(moom.Oo p0) throws Throwable {
    throw __call1018904_0(p0);
}
public static void h189_5(moom.Oo p0) throws Throwable {
    throw __call1018905_0(p0);
}
public static void h189_6(moom.Oo p0) throws Throwable {
    throw __call1018906_0(p0);
}
public static void h189_7(moom.Oo p0) throws Throwable {
    throw __call1018907_0(p0);
}
public static void h189_8(moom.Oo p0) throws Throwable {
    throw __call1018908_0(p0);
}
public static void h189_9(moom.Oo p0) throws Throwable {
    throw __call1018909_0(p0);
}
public static void h189_10(moom.Oo p0) throws Throwable {
    throw __call1018910_0(p0);
}
public static void h189_11(moom.Oo p0) throws Throwable {
    throw __call1018911_0(p0);
}
public static void h189_12(moom.Oo p0) throws Throwable {
    throw __call1018912_0(p0);
}
public static void h189_13(moom.Oo p0) throws Throwable {
    throw __call1018913_0(p0);
}
public static void h189_14(moom.Oo p0) throws Throwable {
    throw __call1018914_0(p0);
}
public static void h189_15(moom.Oo p0) throws Throwable {
    throw __call1018915_0(p0);
}
public static void h189_16(moom.Oo p0) throws Throwable {
    throw __call1018916_0(p0);
}
public static void h189_17(moom.Oo p0) throws Throwable {
    throw __call1018917_0(p0);
}
public static void h189_18(moom.Oo p0) throws Throwable {
    throw __call1018918_0(p0);
}
public static void h189_19(moom.Oo p0) throws Throwable {
    throw __call1018919_0(p0);
}
public static void h189_20(moom.Oo p0) throws Throwable {
    throw __call1018920_0(p0);
}
public static void h189_21(moom.Oo p0) throws Throwable {
    throw __call1018921_0(p0);
}
public static void h189_22(moom.Oo p0) throws Throwable {
    throw __call1018922_0(p0);
}
public static void h189_23(moom.Oo p0) throws Throwable {
    throw __call1018923_0(p0);
}
public static void h189_24(moom.Oo p0) throws Throwable {
    throw __call1018924_0(p0);
}
public static void h189_25(moom.Oo p0) throws Throwable {
    throw __call1018925_0(p0);
}
public static void h189_26(moom.Oo p0) throws Throwable {
    throw __call1018926_0(p0);
}
public static void h189_27(moom.Oo p0) throws Throwable {
    throw __call1018927_0(p0);
}
public static void h189_28(moom.Oo p0) throws Throwable {
    throw __call1018928_0(p0);
}
public static void h189_29(moom.Oo p0) throws Throwable {
    throw __call1018929_0(p0);
}
public static void h189_30(moom.Oo p0) throws Throwable {
    throw __call1018930_0(p0);
}
public static void h189_31(moom.Oo p0) throws Throwable {
    throw __call1018931_0(p0);
}
public static void h189_32(moom.Oo p0) throws Throwable {
    throw __call1018932_0(p0);
}
public static void h189_33(moom.Oo p0) throws Throwable {
    throw __call1018933_0(p0);
}
public static void h189_34(moom.Oo p0) throws Throwable {
    throw __call1018934_0(p0);
}
public static void h189_35(moom.Oo p0) throws Throwable {
    throw __call1018935_0(p0);
}
public static void h189_36(moom.Oo p0) throws Throwable {
    throw __call1018936_0(p0);
}
public static void h189_37(moom.Oo p0) throws Throwable {
    throw __call1018937_0(p0);
}
public static void h189_38(moom.Oo p0) throws Throwable {
    throw __call1018938_0(p0);
}
public static void h189_39(moom.Oo p0) throws Throwable {
    throw __call1018939_0(p0);
}
public static void h189_40(moom.Oo p0) throws Throwable {
    throw __call1018940_0(p0);
}
public static void h189_41(moom.Oo p0) throws Throwable {
    throw __call1018941_0(p0);
}
public static void h189_42(moom.Oo p0) throws Throwable {
    throw __call1018942_0(p0);
}
public static void h189_43(moom.Oo p0) throws Throwable {
    throw __call1018943_0(p0);
}
public static void h189_44(moom.Oo p0) throws Throwable {
    throw __call1018944_0(p0);
}
public static void h189_45(moom.Oo p0) throws Throwable {
    throw __call1018945_0(p0);
}
public static void h189_46(moom.Oo p0) throws Throwable {
    throw __call1018946_0(p0);
}
public static void h189_47(moom.Oo p0) throws Throwable {
    throw __call1018947_0(p0);
}
public static void h189_48(moom.Oo p0) throws Throwable {
    throw __call1018948_0(p0);
}
public static void h189_49(moom.Oo p0) throws Throwable {
    throw __call1018949_0(p0);
}
public static void h189_50(moom.Oo p0) throws Throwable {
    throw __call1018950_0(p0);
}
public static void h189_51(moom.Oo p0) throws Throwable {
    throw __call1018951_0(p0);
}
public static void h189_52(moom.Oo p0) throws Throwable {
    throw __call1018952_0(p0);
}
public static void h189_53(moom.Oo p0) throws Throwable {
    throw __call1018953_0(p0);
}
public static void h189_54(moom.Oo p0) throws Throwable {
    throw __call1018954_0(p0);
}
public static void h189_55(moom.Oo p0) throws Throwable {
    throw __call1018955_0(p0);
}
public static void h189_56(moom.Oo p0) throws Throwable {
    throw __call1018956_0(p0);
}
public static void h189_57(moom.Oo p0) throws Throwable {
    throw __call1018957_0(p0);
}
public static void h189_58(moom.Oo p0) throws Throwable {
    throw __call1018958_0(p0);
}
public static void h189_59(moom.Oo p0) throws Throwable {
    throw __call1018959_0(p0);
}
public static void h189_60(moom.Oo p0) throws Throwable {
    throw __call1018960_0(p0);
}
public static void h189_61(moom.Oo p0) throws Throwable {
    throw __call1018961_0(p0);
}
public static void h189_62(moom.Oo p0) throws Throwable {
    throw __call1018962_0(p0);
}
public static void h189_63(moom.Oo p0) throws Throwable {
    throw __call1018963_0(p0);
}
public static void h189_64(moom.Oo p0) throws Throwable {
    throw __call1018964_0(p0);
}
public static void h189_65(moom.Oo p0) throws Throwable {
    throw __call1018965_0(p0);
}
public static void h189_66(moom.Oo p0) throws Throwable {
    throw __call1018966_0(p0);
}
public static void h189_67(moom.Oo p0) throws Throwable {
    throw __call1018967_0(p0);
}
public static void h189_68(moom.Oo p0) throws Throwable {
    throw __call1018968_0(p0);
}
public static void h189_69(moom.Oo p0) throws Throwable {
    throw __call1018969_0(p0);
}
public static void h189_70(moom.Oo p0) throws Throwable {
    throw __call1018970_0(p0);
}
public static void h189_71(moom.Oo p0) throws Throwable {
    throw __call1018971_0(p0);
}
public static void h189_72(moom.Oo p0) throws Throwable {
    throw __call1018972_0(p0);
}
public static void h189_73(moom.Oo p0) throws Throwable {
    throw __call1018973_0(p0);
}
public static void h189_74(moom.Oo p0) throws Throwable {
    throw __call1018974_0(p0);
}
public static void h189_75(moom.Oo p0) throws Throwable {
    throw __call1018975_0(p0);
}
public static void h189_76(moom.Oo p0) throws Throwable {
    throw __call1018976_0(p0);
}
public static void h189_77(moom.Oo p0) throws Throwable {
    throw __call1018977_0(p0);
}
public static void h189_78(moom.Oo p0) throws Throwable {
    throw __call1018978_0(p0);
}
public static void h189_79(moom.Oo p0) throws Throwable {
    throw __call1018979_0(p0);
}
public static void h189_80(moom.Oo p0) throws Throwable {
    throw __call1018980_0(p0);
}
public static void h189_81(moom.Oo p0) throws Throwable {
    throw __call1018981_0(p0);
}
public static void h189_82(moom.Oo p0) throws Throwable {
    throw __call1018982_0(p0);
}
public static void h189_83(moom.Oo p0) throws Throwable {
    throw __call1018983_0(p0);
}
public static void h189_84(moom.Oo p0) throws Throwable {
    throw __call1018984_0(p0);
}
public static void h189_85(moom.Oo p0) throws Throwable {
    throw __call1018985_0(p0);
}
public static void h189_86(moom.Oo p0) throws Throwable {
    throw __call1018986_0(p0);
}
public static void h189_87(moom.Oo p0) throws Throwable {
    throw __call1018987_0(p0);
}
public static void h189_88(moom.Oo p0) throws Throwable {
    throw __call1018988_0(p0);
}
public static void h189_89(moom.Oo p0) throws Throwable {
    throw __call1018989_0(p0);
}
public static void h189_90(moom.Oo p0) throws Throwable {
    throw __call1018990_0(p0);
}
public static void h189_91(moom.Oo p0) throws Throwable {
    throw __call1018991_0(p0);
}
public static void h189_92(moom.Oo p0) throws Throwable {
    throw __call1018992_0(p0);
}
private static native long __fieldRead189_0() throws Throwable;
private static native int __call189_1() throws Throwable;
private static native java.util.List __call189_5(java.lang.String[] a0, java.lang.String[] a1) throws Throwable;
private static native boolean __call189_6(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory189_7(boolean value) throws Throwable;
private static native java.util.List __call189_12(java.lang.String[] a0, java.lang.String[] a1) throws Throwable;
private static native boolean __call189_13(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory189_14(boolean value) throws Throwable;
private static native java.util.Map __fieldRead189_15() throws Throwable;
private static native java.util.Set __call189_16(java.util.Map a0) throws Throwable;
private static native java.util.List __call189_17(java.lang.String[] a0, java.util.Set a1) throws Throwable;
private static native boolean __call189_18(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory189_19(boolean value) throws Throwable;
private static native java.util.List __call189_20(moom.qy a0, int a1) throws Throwable;
private static native java.util.List __call189_21(java.lang.String[] a0, java.util.List a1) throws Throwable;
private static native boolean __call189_22(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory189_23(boolean value) throws Throwable;
private static native java.lang.String[] __call189_24() throws Throwable;
private static native java.util.List __call189_25(java.lang.String[] a0, java.lang.String[] a1) throws Throwable;
private static native java.util.List __call189_26(moom.qy a0, int a1) throws Throwable;
private static native java.util.List __call189_27(java.lang.String[] a0, java.util.List a1) throws Throwable;
private static native boolean __call189_28(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory189_29(boolean value) throws Throwable;
private static native int __invokedynamic189_30(int a0, long a1) throws Throwable;
private static native int __invokedynamic189_38(int a0, long a1) throws Throwable;
private static native int __invokedynamic189_40(int a0, long a1) throws Throwable;
private static native java.util.List __call189_41(java.lang.String[] a0, java.lang.String[] a1) throws Throwable;
private static native boolean __call189_42(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory189_43(boolean value) throws Throwable;
private static native boolean __call189_44(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory189_45(boolean value) throws Throwable;
private static native boolean __call189_46(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory189_47(boolean value) throws Throwable;
private static native boolean __call189_48(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory189_49(boolean value) throws Throwable;
private static native boolean __call189_50(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory189_51(boolean value) throws Throwable;
private static native moom.Bl __call189_52() throws Throwable;
private static native java.lang.String[] __call189_53(moom.Bl a0) throws Throwable;
private static native java.util.List __call189_54(java.lang.String[] a0, java.lang.String[] a1) throws Throwable;
private static native java.util.List __call189_55(moom.qy a0) throws Throwable;
private static native java.util.List __call189_56(java.lang.String[] a0, java.util.List a1) throws Throwable;
private static native boolean __call189_57(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory189_58(boolean value) throws Throwable;
private static native boolean __call189_59(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory189_60(boolean value) throws Throwable;
private static native boolean __call189_61(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory189_62(boolean value) throws Throwable;
private static native net.minecraft.scoreboard.Scoreboard __call189_63(moom.qy a0) throws Throwable;
private static native java.util.Collection __call189_64(net.minecraft.scoreboard.Scoreboard a0) throws Throwable;
private static native java.util.List __call189_65(java.lang.String[] a0, java.util.Collection a1) throws Throwable;
private static native java.util.List __call189_66(moom.qy a0, int a1) throws Throwable;
private static native java.util.List __call189_67(java.lang.String[] a0, java.util.List a1) throws Throwable;
private static native int __invokedynamic189_68(int a0, long a1) throws Throwable;
private static native int __invokedynamic189_76(int a0, long a1) throws Throwable;
private static native int __invokedynamic189_78(int a0, long a1) throws Throwable;
private static native int __invokedynamic189_80(int a0, long a1) throws Throwable;
private static native java.util.List __call189_81(java.lang.String[] a0, java.lang.String[] a1) throws Throwable;
private static native int __invokedynamic189_82(int a0, long a1) throws Throwable;
private static native moom.Bl __call189_83() throws Throwable;
private static native java.lang.String[] __call189_84(moom.Bl a0) throws Throwable;
private static native java.util.List __call189_85(java.lang.String[] a0, java.lang.String[] a1) throws Throwable;
private static native int __invokedynamic189_86(int a0, long a1) throws Throwable;
private static native java.util.List __call189_87(moom.qy a0, int a1) throws Throwable;
private static native java.util.List __call189_88(java.lang.String[] a0, java.util.List a1) throws Throwable;
private static native net.minecraft.scoreboard.Scoreboard __call189_89(moom.qy a0) throws Throwable;
private static native java.util.Collection __call189_90(net.minecraft.scoreboard.Scoreboard a0) throws Throwable;
private static native java.util.List __call189_91(java.lang.String[] a0, java.util.Collection a1) throws Throwable;
private static native boolean __call189_92(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory189_93(boolean value) throws Throwable;
private static native java.util.List __call189_94(moom.qy a0, int a1) throws Throwable;
private static native java.util.List __call189_95(java.lang.String[] a0, java.util.List a1) throws Throwable;
private static native moom.Bl __call189_96() throws Throwable;
private static native java.lang.String[] __call189_97(moom.Bl a0) throws Throwable;
private static native java.util.List __call189_98(java.lang.String[] a0, java.lang.String[] a1) throws Throwable;
private static native java.util.List __call189_99(moom.qy a0, int a1) throws Throwable;
private static native java.util.List __call189_100(java.lang.String[] a0, java.util.List a1) throws Throwable;
private static native boolean __call189_101(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory189_102(boolean value) throws Throwable;
private static native int __invokedynamic189_103(int a0, long a1) throws Throwable;
private static native int __invokedynamic189_111(int a0, long a1) throws Throwable;
private static native java.util.List __call189_112(java.lang.String[] a0, java.lang.String[] a1) throws Throwable;
private static native boolean __call189_113(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory189_114(boolean value) throws Throwable;
private static native net.minecraft.scoreboard.Scoreboard __call189_115(moom.qy a0) throws Throwable;
private static native java.util.Collection __call189_116(net.minecraft.scoreboard.Scoreboard a0) throws Throwable;
private static native java.util.List __call189_117(java.lang.String[] a0, java.util.Collection a1) throws Throwable;
private static native moom.Bl __call189_118() throws Throwable;
private static native java.lang.String[] __call189_119(moom.Bl a0) throws Throwable;
private static native java.util.List __call189_120(java.lang.String[] a0, java.lang.String[] a1) throws Throwable;
private static native boolean __call189_121(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory189_122(boolean value) throws Throwable;
private static native moom.Bl __call189_123() throws Throwable;
private static native java.lang.String[] __call189_124(moom.Bl a0) throws Throwable;
private static native java.util.List __call189_125(java.lang.String[] a0, java.lang.String[] a1) throws Throwable;
private static native boolean __call189_126(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory189_127(boolean value) throws Throwable;
private static native boolean __call189_128(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory189_129(boolean value) throws Throwable;
private static native boolean __call189_130(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory189_131(boolean value) throws Throwable;
private static native boolean __call189_132(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory189_133(boolean value) throws Throwable;
private static native net.minecraft.scoreboard.Scoreboard __call189_134(moom.qy a0) throws Throwable;
private static native java.util.Collection __call189_135(net.minecraft.scoreboard.Scoreboard a0) throws Throwable;
private static native java.util.List __call189_136(java.lang.String[] a0, java.util.Collection a1) throws Throwable;
private static native java.util.List __call189_142(java.lang.String[] a0, java.lang.String[] a1) throws Throwable;
private static native boolean __call189_143(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory189_144(boolean value) throws Throwable;
private static native java.util.Collection __call189_145(int a0, int a1) throws Throwable;
private static native java.util.List __call189_146(java.lang.String[] a0, java.util.Collection a1) throws Throwable;
private static native boolean __call189_147(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory189_148(boolean value) throws Throwable;
private static native boolean __call189_149(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory189_150(boolean value) throws Throwable;
private static native java.lang.String[] __call189_151() throws Throwable;
private static native java.util.List __call189_152(java.lang.String[] a0, java.lang.String[] a1) throws Throwable;
private static native boolean __call189_153(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory189_154(boolean value) throws Throwable;
private static native boolean __call189_155(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.util.List __call189_158(java.lang.String[] a0, java.lang.String[] a1) throws Throwable;
private static native net.minecraft.scoreboard.Scoreboard __call189_159(moom.qy a0) throws Throwable;
private static native java.util.Collection __call189_160(net.minecraft.scoreboard.Scoreboard a0) throws Throwable;
private static native java.util.List __call189_161(java.lang.String[] a0, java.util.Collection a1) throws Throwable;
private static native java.lang.Exception __call1018900_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018901_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018902_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018903_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018904_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018905_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018906_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018907_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018908_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018909_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018910_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018911_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018912_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018913_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018914_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018915_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018916_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018917_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018918_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018919_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018920_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018921_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018922_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018923_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018924_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018925_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018926_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018927_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018928_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018929_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018930_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018931_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018932_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018933_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018934_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018935_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018936_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018937_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018938_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018939_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018940_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018941_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018942_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018943_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018944_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018945_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018946_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018947_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018948_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018949_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018950_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018951_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018952_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018953_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018954_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018955_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018956_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018957_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018958_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018959_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018960_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018961_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018962_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018963_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018964_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018965_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018966_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018967_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018968_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018969_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018970_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018971_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018972_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018973_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018974_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018975_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018976_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018977_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018978_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018979_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018980_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018981_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018982_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018983_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018984_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018985_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018986_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018987_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018988_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018989_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018990_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018991_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018992_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> java.util.List __sourceHandlerCall_6d7f134604d3eb09c954(moom.qy a0, boolean a1) throws E;
private static final class __SourceHandler_6d7f134604d3eb09c954 {

public static java.util.List f190(moom.qy receiver, boolean p0) throws Throwable {
    int lexicalValue190_36_0;
    int spill190_0;
    boolean spill190_1;
    boolean spill190_2;
    long life2_3;
    java.util.Collection life5_8;
    int life4_9;
    java.util.ArrayList life6_11;
    java.util.Iterator life7_14;
    net.minecraft.scoreboard.ScoreObjective life8_21;
    lexical_join_39: {
    life2_3 = (__fieldRead190_0() ^ 49796743369974L);
    spill190_0 = __call190_1();
    life5_8 = __call190_3(__call190_2(receiver));
    life4_9 = spill190_0;
    life6_11 = __call190_4();
    life7_14 = __call190_5(life5_8);
    lexical_cycle_15: while (true) {
    lexical_join_37: {
    lexical_join_36: {
    lexical_join_32: {
    if (!(__call190_6(life7_14))) {
        break lexical_join_39;
    }
    life8_21 = __cast190_8(__call190_7(life7_14));
    spill190_1 = p0;
    if (!((life4_9 != 0))) {
        lexicalValue190_36_0 = __integerCategory190_9(spill190_1);
        break lexical_join_36;
    }
    if (!(spill190_1)) {
        break lexical_join_32;
    }
    spill190_2 = __call190_11(__call190_10(life8_21));
    if (!((life4_9 != 0))) {
        lexicalValue190_36_0 = __integerCategory190_12(spill190_2);
        break lexical_join_36;
    }
    if (!((!spill190_2))) {
        break lexical_join_37;
    }
    }
    lexicalValue190_36_0 = __integerCategory190_15(__call190_14(life6_11, __call190_13(life8_21)));
    }
    __discardScalar190_16(lexicalValue190_36_0);
    }
    if (!((life4_9 == 0))) { continue lexical_cycle_15; }
    break lexical_cycle_15;
    }
    }
    return life6_11;
}
public static void h190_0(moom.Oo p0) throws Throwable {
    throw __call1019000_0(p0);
}
public static void h190_1(moom.Oo p0) throws Throwable {
    throw __call1019001_0(p0);
}
public static void h190_2(moom.Oo p0) throws Throwable {
    throw __call1019002_0(p0);
}
public static void h190_3(moom.Oo p0) throws Throwable {
    throw __call1019003_0(p0);
}
private static native long __fieldRead190_0() throws Throwable;
private static native int __call190_1() throws Throwable;
private static native net.minecraft.scoreboard.Scoreboard __call190_2(moom.qy a0) throws Throwable;
private static native java.util.Collection __call190_3(net.minecraft.scoreboard.Scoreboard a0) throws Throwable;
private static native java.util.ArrayList __call190_4() throws Throwable;
private static native java.util.Iterator __call190_5(java.util.Collection a0) throws Throwable;
private static native boolean __call190_6(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call190_7(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.scoreboard.ScoreObjective __cast190_8(java.lang.Object a0) throws Throwable;
private static native int __integerCategory190_9(boolean value) throws Throwable;
private static native net.minecraft.scoreboard.IScoreObjectiveCriteria __call190_10(net.minecraft.scoreboard.ScoreObjective a0) throws Throwable;
private static native boolean __call190_11(net.minecraft.scoreboard.IScoreObjectiveCriteria a0) throws Throwable;
private static native int __integerCategory190_12(boolean value) throws Throwable;
private static native java.lang.String __call190_13(net.minecraft.scoreboard.ScoreObjective a0) throws Throwable;
private static native boolean __call190_14(java.util.ArrayList a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory190_15(boolean value) throws Throwable;
private static native void __discardScalar190_16(int a0) throws Throwable;
private static native java.lang.Exception __call1019000_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1019001_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1019002_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1019003_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_c61112026afdf1fbd1f8(moom.qy a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2) throws E;
private static final class __SourceHandler_c61112026afdf1fbd1f8 {

public static boolean f498(moom.qy receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws Throwable {
    int forestValue498_28_0;
    int forestValue498_32_0;
    int forestValue498_37_0;
    int forestValue498_50_0;
    int forestValue498_54_0;
    int forestValue498_114_0;
    int spill498_0;
    boolean spill498_1;
    int spill498_2;
    long life3_3;
    int life6_5;
    int life7_8;
    int life5_9;
    java.util.ArrayList life7_65;
    java.lang.String life8_69;
    java.util.ArrayList life9_71;
    java.util.Iterator life10_74;
    java.lang.String life11_81;
    forest_join_114: {
    forest_join_113: {
    forest_join_101: {
    forest_join_92: {
    forest_join_55: {
    forest_join_54: {
    forest_join_50: {
    forest_join_49: {
    forest_join_42: {
    life3_3 = (__fieldRead498_0() ^ 41084167855212L);
    life6_5 = -1;
    spill498_0 = __call498_1();
    life7_8 = 0;
    life5_9 = spill498_0;
    forest_cycle_10: while (true) {
    forest_join_38: {
    forest_join_37: {
    forest_join_36: {
    forest_join_32: {
    forest_join_28: {
    if (!((life7_8 < (p1).length))) {
        break forest_join_49;
    }
    spill498_1 = __call498_2(receiver, p1, life7_8);
    if (!((life5_9 != 0))) {
        forestValue498_50_0 = __integerCategory498_3(spill498_1);
        break forest_join_50;
    }
    if (!((life5_9 != 0))) {
        forestValue498_28_0 = __integerCategory498_4(spill498_1);
        break forest_join_28;
    }
    if (!(spill498_1)) {
        break forest_join_38;
    }
    forestValue498_28_0 = __integerCategory498_6(__call498_5("*", (p1)[life7_8]));
    }
    if (!((life5_9 != 0))) {
        forestValue498_32_0 = forestValue498_28_0;
        break forest_join_32;
    }
    if (!((forestValue498_28_0 != 0))) {
        break forest_join_38;
    }
    forestValue498_32_0 = life6_5;
    }
    if (!((life5_9 != 0))) {
        forestValue498_37_0 = forestValue498_32_0;
        break forest_join_37;
    }
    if (!((forestValue498_32_0 >= 0))) {
        break forest_join_36;
    }
    break forest_join_42;
    }
    forestValue498_37_0 = life7_8;
    }
    life6_5 = forestValue498_37_0;
    }
    life7_8 += 1;
    if (!((life5_9 == 0))) {
        continue forest_cycle_10;
    }
    break forest_cycle_10;
    }
    break forest_join_49;
    }
    throw new moom.b7("commands.scoreboard.noMultiWildcard", new java.lang.Object[0]);
    }
    forestValue498_50_0 = life6_5;
    }
    if (!((life5_9 != 0))) {
        forestValue498_54_0 = forestValue498_50_0;
        break forest_join_54;
    }
    if (!((forestValue498_50_0 < 0))) {
        break forest_join_55;
    }
    forestValue498_54_0 = 0;
    }
    return __integerCategory498_7(forestValue498_54_0);
    }
    life7_65 = __call498_10(__call498_9(__call498_8(receiver)));
    life8_69 = (p1)[life6_5];
    life9_71 = __call498_11();
    life10_74 = __call498_12(life7_65);
    forest_cycle_69: while (true) {
    if (!(__call498_13(life10_74))) {
        break forest_join_92;
    }
    life11_81 = __cast498_15(__call498_14(life10_74));
    (p1)[life6_5] = life11_81;
    __call498_16(receiver, p0, p1);
    __call498_17(life9_71, life11_81);
    if (!((life5_9 != 0))) {
        break forest_join_101;
    }
    if (!((life5_9 == 0))) {
        continue forest_cycle_69;
    }
    break forest_cycle_69;
    }
    }
    (p1)[life6_5] = life8_69;
    __call498_20(p0, __fieldRead498_18(), __call498_19(life9_71));
    }
    spill498_2 = __call498_21(life9_71);
    if (!((life5_9 != 0))) {
        forestValue498_114_0 = spill498_2;
        break forest_join_114;
    }
    if (!((spill498_2 == 0))) {
        break forest_join_113;
    }
    throw new moom.cc("commands.scoreboard.allMatchesFailed", new java.lang.Object[0]);
    }
    forestValue498_114_0 = 1;
    }
    return __integerCategory498_22(forestValue498_114_0);
}
public static boolean h498_0(moom.b7 p0) throws Throwable {
    throw __call3049800_0(p0);
}
public static boolean h498_1(moom.b7 p0) throws Throwable {
    throw __call3049801_0(p0);
}
public static boolean h498_2(moom.b7 p0) throws Throwable {
    throw __call3049802_0(p0);
}
public static boolean h498_3(moom.b7 p0) throws Throwable {
    throw __call3049803_0(p0);
}
public static boolean h498_4(moom.b7 p0) throws Throwable {
    throw __call3049804_0(p0);
}
public static boolean h498_5(moom.b7 p0) throws Throwable {
    throw __call3049805_0(p0);
}
public static boolean h498_6(moom.b7 p0) throws Throwable {
    throw __call3049806_0(p0);
}
public static boolean h498_7(moom.Oo p0) throws Throwable {
    throw __call3049807_0(p0);
}
public static boolean h498_8(moom.b7 p0, moom.qy p1, net.minecraft.command.ICommandSender p2, java.lang.String[] p3, int p4, int p5, java.lang.String p6, java.util.ArrayList p7, java.util.Iterator p8, java.lang.String p9) throws Throwable {
    int forestValue3049808_65_0;
    int spill3049808_0;
    moom.b7 life10_2;
    moom.CN life11_10;
    java.lang.String life9_28;
    forest_join_65: {
    forest_join_64: {
    forest_join_52: {
    forest_join_43: {
    life10_2 = p0;
    life11_10 = new moom.CN(__call3049808_0(life10_2), __call3049808_1(life10_2));
    __call3049808_4(__call3049808_2(life11_10), __fieldRead3049808_3());
    __call3049808_5(p2, life11_10);
    forest_cycle_18: while (true) {
    forest_join_21: {
    if (!((p4 == 0))) {
        break forest_join_21;
    }
    break forest_join_43;
    }
    if (!(__call3049808_6(p8))) {
        break forest_join_43;
    }
    life9_28 = __cast3049808_8(__call3049808_7(p8));
    (p3)[p5] = life9_28;
    __call3049808_9(p1, p2, p3);
    __call3049808_10(p7, life9_28);
    if (!((p4 != 0))) {
        break forest_join_52;
    }
    continue forest_cycle_18;
    }
    }
    (p3)[p5] = p6;
    __call3049808_13(p2, __fieldRead3049808_11(), __call3049808_12(p7));
    }
    spill3049808_0 = __call3049808_14(p7);
    if (!((p4 != 0))) {
        forestValue3049808_65_0 = spill3049808_0;
        break forest_join_65;
    }
    if (!((spill3049808_0 == 0))) {
        break forest_join_64;
    }
    throw new moom.cc("commands.scoreboard.allMatchesFailed", new java.lang.Object[0]);
    }
    forestValue3049808_65_0 = 1;
    }
    return __integerCategory3049808_15(forestValue3049808_65_0);
}
public static boolean h498_9(moom.b7 p0) throws Throwable {
    throw __call3049809_0(p0);
}
public static boolean h498_10(moom.b7 p0) throws Throwable {
    throw __call3049810_0(p0);
}
private static native long __fieldRead498_0() throws Throwable;
private static native int __call498_1() throws Throwable;
private static native boolean __call498_2(moom.qy a0, java.lang.String[] a1, int a2) throws Throwable;
private static native int __integerCategory498_3(boolean value) throws Throwable;
private static native int __integerCategory498_4(boolean value) throws Throwable;
private static native boolean __call498_5(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory498_6(boolean value) throws Throwable;
private static native boolean __integerCategory498_7(int value) throws Throwable;
private static native net.minecraft.scoreboard.Scoreboard __call498_8(moom.qy a0) throws Throwable;
private static native java.util.Collection __call498_9(net.minecraft.scoreboard.Scoreboard a0) throws Throwable;
private static native java.util.ArrayList __call498_10(java.util.Collection a0) throws Throwable;
private static native java.util.ArrayList __call498_11() throws Throwable;
private static native java.util.Iterator __call498_12(java.util.ArrayList a0) throws Throwable;
private static native boolean __call498_13(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call498_14(java.util.Iterator a0) throws Throwable;
private static native java.lang.String __cast498_15(java.lang.Object a0) throws Throwable;
private static native void __call498_16(moom.qy a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2) throws Throwable;
private static native boolean __call498_17(java.util.ArrayList a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.command.CommandResultStats$Type __fieldRead498_18() throws Throwable;
private static native int __call498_19(java.util.ArrayList a0) throws Throwable;
private static native void __call498_20(net.minecraft.command.ICommandSender a0, net.minecraft.command.CommandResultStats$Type a1, int a2) throws Throwable;
private static native int __call498_21(java.util.ArrayList a0) throws Throwable;
private static native boolean __integerCategory498_22(int value) throws Throwable;
private static native java.lang.Exception __call3049800_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3049801_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3049802_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3049803_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3049804_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3049805_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3049806_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3049807_0(moom.Oo a0) throws Throwable;
private static native java.lang.String __call3049808_0(moom.b7 a0) throws Throwable;
private static native java.lang.Object[] __call3049808_1(moom.b7 a0) throws Throwable;
private static native moom.CO __call3049808_2(moom.CN a0) throws Throwable;
private static native net.minecraft.util.EnumChatFormatting __fieldRead3049808_3() throws Throwable;
private static native moom.CO __call3049808_4(moom.CO a0, net.minecraft.util.EnumChatFormatting a1) throws Throwable;
private static native void __call3049808_5(net.minecraft.command.ICommandSender a0, moom.CN a1) throws Throwable;
private static native boolean __call3049808_6(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call3049808_7(java.util.Iterator a0) throws Throwable;
private static native java.lang.String __cast3049808_8(java.lang.Object a0) throws Throwable;
private static native void __call3049808_9(moom.qy a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2) throws Throwable;
private static native boolean __call3049808_10(java.util.ArrayList a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.command.CommandResultStats$Type __fieldRead3049808_11() throws Throwable;
private static native int __call3049808_12(java.util.ArrayList a0) throws Throwable;
private static native void __call3049808_13(net.minecraft.command.ICommandSender a0, net.minecraft.command.CommandResultStats$Type a1, int a2) throws Throwable;
private static native int __call3049808_14(java.util.ArrayList a0) throws Throwable;
private static native boolean __integerCategory3049808_15(int value) throws Throwable;
private static native java.lang.Exception __call3049809_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3049810_0(moom.b7 a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_989512cc2d3379ddfdaf(moom.qy a0, java.lang.String[] a1, int a2) throws E;
private static final class __SourceHandler_989512cc2d3379ddfdaf {

public static boolean f1211(moom.qy receiver, java.lang.String[] p0, int p1) throws Throwable {
    int forwardValue1211_30_0;
    int forwardValue1211_33_0;
    int forwardValue1211_56_0;
    int forwardValue1211_58_0;
    int forwardValue1211_60_0;
    int forwardValue1211_63_0;
    int forwardValue1211_63_1;
    int forwardValue1211_65_0;
    int forwardValue1211_67_0;
    boolean spill1211_0;
    boolean spill1211_1;
    int spill1211_2;
    int spill1211_3;
    boolean spill1211_4;
    int spill1211_5;
    int spill1211_6;
    long life3_3;
    int life5_5;
    forward_join_67: {
    forward_join_66: {
    forward_join_65: {
    forward_join_63: {
    forward_join_60: {
    forward_join_59: {
    forward_join_58: {
    forward_join_57: {
    forward_join_56: {
    forward_join_55: {
    forward_join_33: {
    forward_join_31: {
    forward_join_30: {
    forward_join_29: {
    life3_3 = (__fieldRead1211_0() ^ 43757058029383L);
    life5_5 = __call1211_1();
    spill1211_0 = __call1211_2((p0)[0], "players");
    if (!((life5_5 != 0))) {
        forwardValue1211_33_0 = __integerCategory1211_3(spill1211_0);
        break forward_join_33;
    }
    if (!((!spill1211_0))) {
        break forward_join_31;
    }
    spill1211_1 = __call1211_4((p0)[0], "teams");
    if (!((life5_5 != 0))) {
        forwardValue1211_30_0 = __integerCategory1211_5(spill1211_1);
        break forward_join_30;
    }
    if (!(spill1211_1)) {
        break forward_join_29;
    }
    spill1211_2 = p1;
    if (!((life5_5 != 0))) {
        forwardValue1211_30_0 = spill1211_2;
        break forward_join_30;
    }
    if (!((spill1211_2 == 2))) {
        break forward_join_29;
    }
    forwardValue1211_67_0 = 1;
    break forward_join_67;
    }
    forwardValue1211_30_0 = 0;
    }
    forwardValue1211_67_0 = forwardValue1211_30_0;
    break forward_join_67;
    }
    forwardValue1211_33_0 = (p0).length;
    }
    spill1211_3 = 1;
    if (!((life5_5 != 0))) {
        forwardValue1211_63_0 = forwardValue1211_33_0;
        forwardValue1211_63_1 = spill1211_3;
        break forward_join_63;
    }
    if (!((forwardValue1211_33_0 > spill1211_3))) {
        break forward_join_59;
    }
    spill1211_4 = __call1211_6((p0)[1], "operation");
    if (!((life5_5 != 0))) {
        forwardValue1211_60_0 = __integerCategory1211_7(spill1211_4);
        break forward_join_60;
    }
    if (!(spill1211_4)) {
        break forward_join_59;
    }
    spill1211_5 = p1;
    if (!((life5_5 != 0))) {
        forwardValue1211_56_0 = spill1211_5;
        break forward_join_56;
    }
    if (!((spill1211_5 != 2))) {
        break forward_join_55;
    }
    spill1211_6 = p1;
    if (!((life5_5 != 0))) {
        forwardValue1211_58_0 = spill1211_6;
        break forward_join_58;
    }
    if (!((spill1211_6 == 5))) {
        break forward_join_57;
    }
    }
    forwardValue1211_56_0 = 1;
    }
    forwardValue1211_67_0 = forwardValue1211_56_0;
    break forward_join_67;
    }
    forwardValue1211_58_0 = 0;
    }
    forwardValue1211_67_0 = forwardValue1211_58_0;
    break forward_join_67;
    }
    forwardValue1211_60_0 = p1;
    }
    if (!((life5_5 != 0))) {
        forwardValue1211_65_0 = forwardValue1211_60_0;
        break forward_join_65;
    }
    forwardValue1211_63_0 = forwardValue1211_60_0;
    forwardValue1211_63_1 = 2;
    }
    if (!((forwardValue1211_63_0 == forwardValue1211_63_1))) {
        break forward_join_66;
    }
    forwardValue1211_65_0 = 1;
    }
    forwardValue1211_67_0 = forwardValue1211_65_0;
    break forward_join_67;
    }
    forwardValue1211_67_0 = 0;
    }
    return __integerCategory1211_8(forwardValue1211_67_0);
}
public static void h1211_0(moom.Oo p0) throws Throwable {
    throw __call1121100_0(p0);
}
public static void h1211_1(moom.Oo p0) throws Throwable {
    throw __call1121101_0(p0);
}
public static void h1211_2(moom.Oo p0) throws Throwable {
    throw __call1121102_0(p0);
}
public static void h1211_3(moom.Oo p0) throws Throwable {
    throw __call1121103_0(p0);
}
public static void h1211_4(moom.Oo p0) throws Throwable {
    throw __call1121104_0(p0);
}
public static void h1211_5(moom.Oo p0) throws Throwable {
    throw __call1121105_0(p0);
}
public static void h1211_6(moom.Oo p0) throws Throwable {
    throw __call1121106_0(p0);
}
public static void h1211_7(moom.Oo p0) throws Throwable {
    throw __call1121107_0(p0);
}
public static void h1211_8(moom.Oo p0) throws Throwable {
    throw __call1121108_0(p0);
}
public static void h1211_9(moom.Oo p0) throws Throwable {
    throw __call1121109_0(p0);
}
public static void h1211_10(moom.Oo p0) throws Throwable {
    throw __call1121110_0(p0);
}
public static void h1211_11(moom.Oo p0) throws Throwable {
    throw __call1121111_0(p0);
}
public static void h1211_12(moom.Oo p0) throws Throwable {
    throw __call1121112_0(p0);
}
public static void h1211_13(moom.Oo p0) throws Throwable {
    throw __call1121113_0(p0);
}
public static void h1211_14(moom.Oo p0) throws Throwable {
    throw __call1121114_0(p0);
}
private static native long __fieldRead1211_0() throws Throwable;
private static native int __call1211_1() throws Throwable;
private static native boolean __call1211_2(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1211_3(boolean value) throws Throwable;
private static native boolean __call1211_4(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1211_5(boolean value) throws Throwable;
private static native boolean __call1211_6(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1211_7(boolean value) throws Throwable;
private static native boolean __integerCategory1211_8(int value) throws Throwable;
private static native java.lang.Exception __call1121100_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1121101_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1121102_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1121103_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1121104_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1121105_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1121106_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1121107_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1121108_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1121109_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1121110_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1121111_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1121112_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1121113_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1121114_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_9c509aa764b4190e76e0(moom.qy a0, net.minecraft.command.ICommandSender a1) throws E;
private static final class __SourceHandler_9c509aa764b4190e76e0 {

public static void f1212(moom.qy receiver, net.minecraft.command.ICommandSender p0) throws Throwable {
    int spill1212_0;
    long life2_3;
    net.minecraft.scoreboard.Scoreboard life5_7;
    java.util.Collection life6_10;
    int life4_11;
    moom.CN life7_36;
    java.util.Iterator life8_47;
    net.minecraft.scoreboard.ScoreObjective life9_54;
    lexical_join_79: {
    lexical_join_22: {
    life2_3 = (__fieldRead1212_0() ^ 100117064438257L);
    spill1212_0 = __call1212_1();
    life5_7 = __call1212_2(receiver);
    life6_10 = __call1212_3(life5_7);
    life4_11 = spill1212_0;
    if (!((__call1212_4(life6_10) == 0))) {
        break lexical_join_22;
    }
    throw new moom.b7("commands.scoreboard.objectives.list.empty", new java.lang.Object[0]);
    }
    life7_36 = new moom.CN("commands.scoreboard.objectives.list.count", new java.lang.Object[] {__call1212_6(__call1212_5(life6_10))});
    __call1212_9(__call1212_7(life7_36), __fieldRead1212_8());
    __call1212_10(p0, life7_36);
    life8_47 = __call1212_11(life6_10);
    lexical_cycle_46: while (true) {
    if (!(__call1212_12(life8_47))) {
        break lexical_join_79;
    }
    life9_54 = __cast1212_14(__call1212_13(life8_47));
    __call1212_19(p0, new moom.CN("commands.scoreboard.objectives.list.entry", new java.lang.Object[] {__call1212_15(life9_54), __call1212_16(life9_54), __call1212_18(__call1212_17(life9_54))}));
    if (!((life4_11 == 0))) { continue lexical_cycle_46; }
    break lexical_cycle_46;
    }
    }
    return;
}
public static void h1212_0(moom.b7 p0) throws Throwable {
    throw __call1121200_0(p0);
}
private static native long __fieldRead1212_0() throws Throwable;
private static native int __call1212_1() throws Throwable;
private static native net.minecraft.scoreboard.Scoreboard __call1212_2(moom.qy a0) throws Throwable;
private static native java.util.Collection __call1212_3(net.minecraft.scoreboard.Scoreboard a0) throws Throwable;
private static native int __call1212_4(java.util.Collection a0) throws Throwable;
private static native int __call1212_5(java.util.Collection a0) throws Throwable;
private static native java.lang.Integer __call1212_6(int a0) throws Throwable;
private static native moom.CO __call1212_7(moom.CN a0) throws Throwable;
private static native net.minecraft.util.EnumChatFormatting __fieldRead1212_8() throws Throwable;
private static native moom.CO __call1212_9(moom.CO a0, net.minecraft.util.EnumChatFormatting a1) throws Throwable;
private static native void __call1212_10(net.minecraft.command.ICommandSender a0, moom.CN a1) throws Throwable;
private static native java.util.Iterator __call1212_11(java.util.Collection a0) throws Throwable;
private static native boolean __call1212_12(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1212_13(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.scoreboard.ScoreObjective __cast1212_14(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call1212_15(net.minecraft.scoreboard.ScoreObjective a0) throws Throwable;
private static native java.lang.String __call1212_16(net.minecraft.scoreboard.ScoreObjective a0) throws Throwable;
private static native net.minecraft.scoreboard.IScoreObjectiveCriteria __call1212_17(net.minecraft.scoreboard.ScoreObjective a0) throws Throwable;
private static native java.lang.String __call1212_18(net.minecraft.scoreboard.IScoreObjectiveCriteria a0) throws Throwable;
private static native void __call1212_19(net.minecraft.command.ICommandSender a0, moom.CN a1) throws Throwable;
private static native java.lang.Exception __call1121200_0(moom.b7 a0) throws Throwable;

}

private static native <E extends Throwable> java.util.List __sourceHandlerCall_4c5f44c0b266d3a6e742(moom.qy a0) throws E;
private static final class __SourceHandler_4c5f44c0b266d3a6e742 {

public static java.util.List f1213(moom.qy receiver) throws Throwable {
    int spill1213_0;
    long life1_3;
    java.util.Collection life4_7;
    java.util.ArrayList life5_10;
    int life3_11;
    java.util.Iterator life6_14;
    net.minecraft.scoreboard.ScoreObjective life7_21;
    lexical_join_33: {
    life1_3 = (__fieldRead1213_0() ^ 76559150271772L);
    life4_7 = __call1213_2(__call1213_1(receiver));
    spill1213_0 = __call1213_3();
    life5_10 = __call1213_4();
    life3_11 = spill1213_0;
    life6_14 = __call1213_5(life4_7);
    lexical_cycle_15: while (true) {
    lexical_join_31: {
    if (!(__call1213_6(life6_14))) {
        break lexical_join_33;
    }
    life7_21 = __cast1213_8(__call1213_7(life6_14));
    if (!((__call1213_9(life7_21) == __fieldRead1213_10()))) {
        break lexical_join_31;
    }
    __call1213_12(life5_10, __call1213_11(life7_21));
    }
    if (!((life3_11 == 0))) { continue lexical_cycle_15; }
    break lexical_cycle_15;
    }
    }
    return life5_10;
}
public static void h1213_0(moom.Oo p0) throws Throwable {
    throw __call1121300_0(p0);
}
private static native long __fieldRead1213_0() throws Throwable;
private static native net.minecraft.scoreboard.Scoreboard __call1213_1(moom.qy a0) throws Throwable;
private static native java.util.Collection __call1213_2(net.minecraft.scoreboard.Scoreboard a0) throws Throwable;
private static native int __call1213_3() throws Throwable;
private static native java.util.ArrayList __call1213_4() throws Throwable;
private static native java.util.Iterator __call1213_5(java.util.Collection a0) throws Throwable;
private static native boolean __call1213_6(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1213_7(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.scoreboard.ScoreObjective __cast1213_8(java.lang.Object a0) throws Throwable;
private static native net.minecraft.scoreboard.IScoreObjectiveCriteria __call1213_9(net.minecraft.scoreboard.ScoreObjective a0) throws Throwable;
private static native net.minecraft.scoreboard.IScoreObjectiveCriteria __fieldRead1213_10() throws Throwable;
private static native java.lang.String __call1213_11(net.minecraft.scoreboard.ScoreObjective a0) throws Throwable;
private static native boolean __call1213_12(java.util.ArrayList a0, java.lang.String a1) throws Throwable;
private static native java.lang.Exception __call1121300_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_cde3de7ea94634d4719f(moom.qy a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2, int a3) throws E;
private static final class __SourceHandler_cde3de7ea94634d4719f {

public static void f59(moom.qy receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1, int p2) throws Throwable {
    int forwardValue59_61_0;
    int forwardValue59_73_0;
    int forwardValue59_113_0;
    int spill59_0;
    int spill59_1;
    int spill59_2;
    long life4_3;
    java.lang.String life7_9;
    net.minecraft.scoreboard.Scoreboard life8_12;
    int life6_13;
    java.lang.String life9_92;
    forward_join_131: {
    forward_join_127: {
    forward_join_125: {
    forward_join_121: {
    forward_join_113: {
    forward_join_111: {
    forward_join_73: {
    forward_join_71: {
    forward_join_61: {
    forward_join_59: {
    forward_join_29: {
    life4_3 = (__fieldRead59_0() ^ 140529520478568L);
    spill59_0 = __call59_1();
    life7_9 = (p1)[(p2++)];
    life8_12 = __call59_2(receiver);
    life6_13 = spill59_0;
    if (!((__call59_3(life8_12, life7_9) != null))) {
        break forward_join_29;
    }
    throw new moom.b7("commands.scoreboard.teams.add.alreadyExists", new java.lang.Object[] {life7_9});
    }
    spill59_1 = __call59_4(life7_9);
    if (!((life6_13 != 0))) {
        forwardValue59_61_0 = spill59_1;
        break forward_join_61;
    }
    if (!((spill59_1 > __invokedynamic59_5(6746, (3292193021405403505L ^ life4_3))))) {
        break forward_join_59;
    }
    throw new moom.cb("commands.scoreboard.teams.add.tooLong", new java.lang.Object[] {life7_9, __call59_7(__invokedynamic59_6(6746, (3292193021405403505L ^ life4_3)))});
    }
    forwardValue59_61_0 = __call59_8(life7_9);
    }
    if (!((life6_13 != 0))) {
        forwardValue59_73_0 = forwardValue59_61_0;
        break forward_join_73;
    }
    if (!((forwardValue59_61_0 == 0))) {
        break forward_join_71;
    }
    throw new moom.cc("commands.scoreboard.teams.add.usage", new java.lang.Object[0]);
    }
    forwardValue59_73_0 = (p1).length;
    }
    if (!((forwardValue59_73_0 > p2))) {
        break forward_join_127;
    }
    life9_92 = __call59_10(__call59_9(p0, p1, p2));
    spill59_2 = __call59_11(life9_92);
    if (!((life6_13 != 0))) {
        forwardValue59_113_0 = spill59_2;
        break forward_join_113;
    }
    if (!((spill59_2 > __invokedynamic59_12(4580, (622585651198104270L ^ life4_3))))) {
        break forward_join_111;
    }
    throw new moom.cb("commands.scoreboard.teams.add.displayTooLong", new java.lang.Object[] {life9_92, __call59_14(__invokedynamic59_13(4580, (622585651198104270L ^ life4_3)))});
    }
    forwardValue59_113_0 = __call59_15(life9_92);
    }
    if (!((forwardValue59_113_0 > 0))) {
        break forward_join_121;
    }
    __call59_17(__call59_16(life8_12, life7_9), life9_92);
    if (!((life6_13 == 0))) {
        break forward_join_125;
    }
    }
    __call59_18(life8_12, life7_9);
    }
    if (!((life6_13 == 0))) {
        break forward_join_131;
    }
    }
    __call59_19(life8_12, life7_9);
    }
    __call59_20(p0, receiver, "commands.scoreboard.teams.add.success", new java.lang.Object[] {life7_9});
    return;
}
public static void h59_0(moom.b7 p0) throws Throwable {
    throw __call3005900_0(p0);
}
public static void h59_1(moom.b7 p0) throws Throwable {
    throw __call3005901_0(p0);
}
public static void h59_2(moom.b7 p0) throws Throwable {
    throw __call3005902_0(p0);
}
public static void h59_3(moom.b7 p0) throws Throwable {
    throw __call3005903_0(p0);
}
public static void h59_4(moom.b7 p0) throws Throwable {
    throw __call3005904_0(p0);
}
public static void h59_5(moom.b7 p0) throws Throwable {
    throw __call3005905_0(p0);
}
public static void h59_6(moom.b7 p0) throws Throwable {
    throw __call3005906_0(p0);
}
public static void h59_7(moom.b7 p0) throws Throwable {
    throw __call3005907_0(p0);
}
public static void h59_8(moom.b7 p0) throws Throwable {
    throw __call3005908_0(p0);
}
public static void h59_9(moom.b7 p0) throws Throwable {
    throw __call3005909_0(p0);
}
private static native long __fieldRead59_0() throws Throwable;
private static native int __call59_1() throws Throwable;
private static native net.minecraft.scoreboard.Scoreboard __call59_2(moom.qy a0) throws Throwable;
private static native moom.Bk __call59_3(net.minecraft.scoreboard.Scoreboard a0, java.lang.String a1) throws Throwable;
private static native int __call59_4(java.lang.String a0) throws Throwable;
private static native int __invokedynamic59_5(int a0, long a1) throws Throwable;
private static native int __invokedynamic59_6(int a0, long a1) throws Throwable;
private static native java.lang.Integer __call59_7(int a0) throws Throwable;
private static native int __call59_8(java.lang.String a0) throws Throwable;
private static native net.minecraft.util.IChatComponent __call59_9(net.minecraft.command.ICommandSender a0, java.lang.String[] a1, int a2) throws Throwable;
private static native java.lang.String __call59_10(net.minecraft.util.IChatComponent a0) throws Throwable;
private static native int __call59_11(java.lang.String a0) throws Throwable;
private static native int __invokedynamic59_12(int a0, long a1) throws Throwable;
private static native int __invokedynamic59_13(int a0, long a1) throws Throwable;
private static native java.lang.Integer __call59_14(int a0) throws Throwable;
private static native int __call59_15(java.lang.String a0) throws Throwable;
private static native moom.Bk __call59_16(net.minecraft.scoreboard.Scoreboard a0, java.lang.String a1) throws Throwable;
private static native void __call59_17(moom.Bk a0, java.lang.String a1) throws Throwable;
private static native moom.Bk __call59_18(net.minecraft.scoreboard.Scoreboard a0, java.lang.String a1) throws Throwable;
private static native moom.Bk __call59_19(net.minecraft.scoreboard.Scoreboard a0, java.lang.String a1) throws Throwable;
private static native void __call59_20(net.minecraft.command.ICommandSender a0, moom.qy a1, java.lang.String a2, java.lang.Object[] a3) throws Throwable;
private static native java.lang.Exception __call3005900_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3005901_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3005902_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3005903_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3005904_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3005905_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3005906_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3005907_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3005908_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3005909_0(moom.b7 a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_e1ee3192cead96533b35(moom.qy a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2, int a3) throws E;
private static final class __SourceHandler_e1ee3192cead96533b35 {

public static void f60(moom.qy receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1, int p2) throws Throwable {
    int forwardValue60_62_0;
    int forwardValue60_91_0;
    int forwardValue60_97_0;
    int forwardValue60_103_0;
    int forwardValue60_109_0;
    java.lang.String[] forwardValue60_160_0;
    net.minecraft.util.EnumChatFormatting forwardValue60_177_0;
    int forwardValue60_213_0;
    int forwardValue60_225_0;
    int forwardValue60_262_0;
    int forwardValue60_274_0;
    int forwardValue60_311_0;
    int forwardValue60_347_0;
    java.lang.String forwardValue60_349_0;
    int spill60_0;
    boolean spill60_1;
    boolean spill60_2;
    boolean spill60_3;
    boolean spill60_4;
    boolean spill60_5;
    java.lang.String[] spill60_6;
    boolean spill60_7;
    boolean spill60_8;
    net.minecraft.util.EnumChatFormatting spill60_9;
    boolean spill60_10;
    boolean spill60_11;
    java.lang.String spill60_12;
    long life4_3;
    moom.Bk life7_11;
    int life6_12;
    java.lang.String life8_20;
    java.lang.String life9_222;
    net.minecraft.util.EnumChatFormatting life10_234;
    net.minecraft.scoreboard.Team$EnumVisible life10_424;
    net.minecraft.scoreboard.Team$EnumVisible life10_469;
    forward_join_391: {
    forward_join_372: {
    forward_join_369: {
    forward_join_349: {
    forward_join_347: {
    forward_join_342: {
    forward_join_340: {
    forward_join_337: {
    forward_join_311: {
    forward_join_308: {
    forward_join_301: {
    forward_join_274: {
    forward_join_262: {
    forward_join_259: {
    forward_join_252: {
    forward_join_225: {
    forward_join_213: {
    forward_join_210: {
    forward_join_197: {
    forward_join_179: {
    forward_join_177: {
    forward_join_160: {
    forward_join_159: {
    forward_join_133: {
    forward_join_117: {
    forward_join_109: {
    forward_join_103: {
    forward_join_97: {
    forward_join_91: {
    forward_join_88: {
    forward_join_62: {
    forward_join_58: {
    life4_3 = (__fieldRead60_0() ^ 85162954540430L);
    spill60_0 = __call60_1();
    life7_11 = __call60_2(receiver, (p1)[(p2++)]);
    life6_12 = spill60_0;
    if (!((life7_11 != null))) {
        break forward_join_391;
    }
    life8_20 = __call60_3((p1)[(p2++)]);
    spill60_1 = __call60_4(life8_20, "color");
    if (!((life6_12 == 0))) {
        forwardValue60_62_0 = __integerCategory60_5(spill60_1);
        break forward_join_62;
    }
    if (!((!spill60_1))) {
        break forward_join_58;
    }
    spill60_2 = __call60_6(life8_20, "friendlyfire");
    if (!((life6_12 == 0))) {
        forwardValue60_62_0 = __integerCategory60_7(spill60_2);
        break forward_join_62;
    }
    if (!((!spill60_2))) {
        break forward_join_58;
    }
    spill60_3 = __call60_8(life8_20, "seeFriendlyInvisibles");
    if (!((life6_12 == 0))) {
        forwardValue60_62_0 = __integerCategory60_9(spill60_3);
        break forward_join_62;
    }
    if (!((!spill60_3))) {
        break forward_join_58;
    }
    spill60_4 = __call60_10(life8_20, "nametagVisibility");
    if (!((life6_12 == 0))) {
        forwardValue60_62_0 = __integerCategory60_11(spill60_4);
        break forward_join_62;
    }
    if (!((!spill60_4))) {
        break forward_join_58;
    }
    spill60_5 = __call60_12(life8_20, "deathMessageVisibility");
    if (!((life6_12 == 0))) {
        forwardValue60_62_0 = __integerCategory60_13(spill60_5);
        break forward_join_62;
    }
    if (!((!spill60_5))) {
        break forward_join_58;
    }
    throw new moom.cc("commands.scoreboard.teams.option.usage", new java.lang.Object[0]);
    }
    spill60_6 = p1;
    if (!((life6_12 == 0))) {
        forwardValue60_160_0 = spill60_6;
        break forward_join_160;
    }
    forwardValue60_62_0 = (spill60_6).length;
    }
    if (!((forwardValue60_62_0 == 4))) {
        break forward_join_159;
    }
    spill60_7 = __call60_14(life8_20, "color");
    if (!((life6_12 == 0))) {
        forwardValue60_91_0 = __integerCategory60_15(spill60_7);
        break forward_join_91;
    }
    if (!(spill60_7)) {
        break forward_join_88;
    }
    throw new moom.cc("commands.scoreboard.teams.option.noValue", new java.lang.Object[] {life8_20, __call60_17(__call60_16(1, 0))});
    }
    forwardValue60_91_0 = __integerCategory60_19(__call60_18(life8_20, "friendlyfire"));
    }
    if (!((life6_12 == 0))) {
        forwardValue60_97_0 = forwardValue60_91_0;
        break forward_join_97;
    }
    if (!((forwardValue60_91_0 == 0))) {
        break forward_join_133;
    }
    forwardValue60_97_0 = __integerCategory60_21(__call60_20(life8_20, "seeFriendlyInvisibles"));
    }
    if (!((life6_12 == 0))) {
        forwardValue60_103_0 = forwardValue60_97_0;
        break forward_join_103;
    }
    if (!((forwardValue60_97_0 == 0))) {
        break forward_join_133;
    }
    forwardValue60_103_0 = __integerCategory60_23(__call60_22(life8_20, "nametagVisibility"));
    }
    if (!((life6_12 == 0))) {
        forwardValue60_109_0 = forwardValue60_103_0;
        break forward_join_109;
    }
    if (!((forwardValue60_103_0 == 0))) {
        break forward_join_117;
    }
    forwardValue60_109_0 = __integerCategory60_25(__call60_24(life8_20, "deathMessageVisibility"));
    }
    if (!((forwardValue60_109_0 == 0))) {
        break forward_join_117;
    }
    throw new moom.cc("commands.scoreboard.teams.option.usage", new java.lang.Object[0]);
    }
    throw new moom.cc("commands.scoreboard.teams.option.noValue", new java.lang.Object[] {life8_20, __call60_27(__call60_26())});
    }
    throw new moom.cc("commands.scoreboard.teams.option.noValue", new java.lang.Object[] {life8_20, __call60_29(__call60_28(new java.lang.String[] {"true", "false"}))});
    }
    forwardValue60_160_0 = p1;
    }
    life9_222 = (forwardValue60_160_0)[p2];
    spill60_8 = __call60_30(life8_20, "color");
    if (!((life6_12 == 0))) {
        forwardValue60_213_0 = __integerCategory60_31(spill60_8);
        break forward_join_213;
    }
    if (!(spill60_8)) {
        break forward_join_210;
    }
    life10_234 = __call60_32(life9_222);
    spill60_9 = life10_234;
    if (!((life6_12 == 0))) {
        forwardValue60_177_0 = spill60_9;
        break forward_join_177;
    }
    if (!((spill60_9 != null))) {
        break forward_join_179;
    }
    forwardValue60_177_0 = life10_234;
    }
    if (!(__call60_33(forwardValue60_177_0))) {
        break forward_join_197;
    }
    }
    throw new moom.cc("commands.scoreboard.teams.option.noValue", new java.lang.Object[] {life8_20, __call60_35(__call60_34(1, 0))});
    }
    __call60_36(life7_11, life10_234);
    __call60_38(life7_11, __call60_37(life10_234));
    __call60_41(life7_11, __call60_40(__fieldRead60_39()));
    if (!((life6_12 != 0))) {
        break forward_join_372;
    }
    }
    forwardValue60_213_0 = __integerCategory60_43(__call60_42(life8_20, "friendlyfire"));
    }
    if (!((life6_12 == 0))) {
        forwardValue60_262_0 = forwardValue60_213_0;
        break forward_join_262;
    }
    if (!((forwardValue60_213_0 != 0))) {
        break forward_join_259;
    }
    spill60_10 = __call60_44(life9_222, "true");
    if (!((life6_12 == 0))) {
        forwardValue60_225_0 = __integerCategory60_45(spill60_10);
        break forward_join_225;
    }
    if (!((!spill60_10))) {
        break forward_join_252;
    }
    forwardValue60_225_0 = __integerCategory60_47(__call60_46(life9_222, "false"));
    }
    if (!((forwardValue60_225_0 == 0))) {
        break forward_join_252;
    }
    throw new moom.cc("commands.scoreboard.teams.option.noValue", new java.lang.Object[] {life8_20, __call60_49(__call60_48(new java.lang.String[] {"true", "false"}))});
    }
    __call60_51(life7_11, __call60_50(life9_222, "true"));
    if (!((life6_12 != 0))) {
        break forward_join_372;
    }
    }
    forwardValue60_262_0 = __integerCategory60_53(__call60_52(life8_20, "seeFriendlyInvisibles"));
    }
    if (!((life6_12 == 0))) {
        forwardValue60_311_0 = forwardValue60_262_0;
        break forward_join_311;
    }
    if (!((forwardValue60_262_0 != 0))) {
        break forward_join_308;
    }
    spill60_11 = __call60_54(life9_222, "true");
    if (!((life6_12 == 0))) {
        forwardValue60_274_0 = __integerCategory60_55(spill60_11);
        break forward_join_274;
    }
    if (!((!spill60_11))) {
        break forward_join_301;
    }
    forwardValue60_274_0 = __integerCategory60_57(__call60_56(life9_222, "false"));
    }
    if (!((forwardValue60_274_0 == 0))) {
        break forward_join_301;
    }
    throw new moom.cc("commands.scoreboard.teams.option.noValue", new java.lang.Object[] {life8_20, __call60_59(__call60_58(new java.lang.String[] {"true", "false"}))});
    }
    __call60_61(life7_11, __call60_60(life9_222, "true"));
    if (!((life6_12 != 0))) {
        break forward_join_372;
    }
    }
    forwardValue60_311_0 = __integerCategory60_63(__call60_62(life8_20, "nametagVisibility"));
    }
    if (!((life6_12 == 0))) {
        forwardValue60_347_0 = forwardValue60_311_0;
        break forward_join_347;
    }
    if (!((forwardValue60_311_0 != 0))) {
        break forward_join_342;
    }
    life10_424 = __call60_64(life9_222);
    if (!((life6_12 == 0))) {
        break forward_join_340;
    }
    if (!((life10_424 == null))) {
        break forward_join_337;
    }
    throw new moom.cc("commands.scoreboard.teams.option.noValue", new java.lang.Object[] {life8_20, __call60_66(__call60_65())});
    }
    __call60_67(life7_11, life10_424);
    }
    if (!((life6_12 != 0))) {
        break forward_join_372;
    }
    }
    spill60_12 = life8_20;
    if (!((life6_12 == 0))) {
        forwardValue60_349_0 = spill60_12;
        break forward_join_349;
    }
    forwardValue60_347_0 = __integerCategory60_69(__call60_68(spill60_12, "deathMessageVisibility"));
    }
    if (!((forwardValue60_347_0 != 0))) {
        break forward_join_372;
    }
    forwardValue60_349_0 = life9_222;
    }
    life10_469 = __call60_70(forwardValue60_349_0);
    if (!((life10_469 == null))) {
        break forward_join_369;
    }
    throw new moom.cc("commands.scoreboard.teams.option.noValue", new java.lang.Object[] {life8_20, __call60_72(__call60_71())});
    }
    __call60_73(life7_11, life10_469);
    }
    __call60_75(p0, receiver, "commands.scoreboard.teams.option.success", new java.lang.Object[] {life8_20, __call60_74(life7_11), life9_222});
    }
    return;
}
public static void h60_0(moom.b7 p0) throws Throwable {
    throw __call3006000_0(p0);
}
public static void h60_1(moom.b7 p0) throws Throwable {
    throw __call3006001_0(p0);
}
public static void h60_2(moom.b7 p0) throws Throwable {
    throw __call3006002_0(p0);
}
public static void h60_3(moom.b7 p0) throws Throwable {
    throw __call3006003_0(p0);
}
public static void h60_4(moom.b7 p0) throws Throwable {
    throw __call3006004_0(p0);
}
public static void h60_5(moom.b7 p0) throws Throwable {
    throw __call3006005_0(p0);
}
public static void h60_6(moom.b7 p0) throws Throwable {
    throw __call3006006_0(p0);
}
public static void h60_7(moom.b7 p0) throws Throwable {
    throw __call3006007_0(p0);
}
public static void h60_8(moom.b7 p0) throws Throwable {
    throw __call3006008_0(p0);
}
public static void h60_9(moom.b7 p0) throws Throwable {
    throw __call3006009_0(p0);
}
public static void h60_10(moom.b7 p0) throws Throwable {
    throw __call3006010_0(p0);
}
public static void h60_11(moom.b7 p0) throws Throwable {
    throw __call3006011_0(p0);
}
public static void h60_12(moom.b7 p0) throws Throwable {
    throw __call3006012_0(p0);
}
public static void h60_13(moom.b7 p0) throws Throwable {
    throw __call3006013_0(p0);
}
public static void h60_14(moom.b7 p0) throws Throwable {
    throw __call3006014_0(p0);
}
public static void h60_15(moom.b7 p0) throws Throwable {
    throw __call3006015_0(p0);
}
public static void h60_16(moom.b7 p0) throws Throwable {
    throw __call3006016_0(p0);
}
public static void h60_17(moom.b7 p0) throws Throwable {
    throw __call3006017_0(p0);
}
public static void h60_18(moom.b7 p0) throws Throwable {
    throw __call3006018_0(p0);
}
public static void h60_19(moom.b7 p0) throws Throwable {
    throw __call3006019_0(p0);
}
public static void h60_20(moom.b7 p0) throws Throwable {
    throw __call3006020_0(p0);
}
public static void h60_21(moom.b7 p0) throws Throwable {
    throw __call3006021_0(p0);
}
public static void h60_22(moom.b7 p0) throws Throwable {
    throw __call3006022_0(p0);
}
public static void h60_23(moom.b7 p0) throws Throwable {
    throw __call3006023_0(p0);
}
public static void h60_24(moom.b7 p0) throws Throwable {
    throw __call3006024_0(p0);
}
public static void h60_25(moom.b7 p0) throws Throwable {
    throw __call3006025_0(p0);
}
public static void h60_26(moom.b7 p0) throws Throwable {
    throw __call3006026_0(p0);
}
public static void h60_27(moom.b7 p0) throws Throwable {
    throw __call3006027_0(p0);
}
public static void h60_28(moom.b7 p0) throws Throwable {
    throw __call3006028_0(p0);
}
public static void h60_29(moom.b7 p0) throws Throwable {
    throw __call3006029_0(p0);
}
public static void h60_30(moom.b7 p0) throws Throwable {
    throw __call3006030_0(p0);
}
public static void h60_31(moom.b7 p0) throws Throwable {
    throw __call3006031_0(p0);
}
public static void h60_32(moom.b7 p0) throws Throwable {
    throw __call3006032_0(p0);
}
public static void h60_33(moom.b7 p0) throws Throwable {
    throw __call3006033_0(p0);
}
public static void h60_34(moom.b7 p0) throws Throwable {
    throw __call3006034_0(p0);
}
public static void h60_35(moom.b7 p0) throws Throwable {
    throw __call3006035_0(p0);
}
public static void h60_36(moom.b7 p0) throws Throwable {
    throw __call3006036_0(p0);
}
public static void h60_37(moom.b7 p0) throws Throwable {
    throw __call3006037_0(p0);
}
public static void h60_38(moom.b7 p0) throws Throwable {
    throw __call3006038_0(p0);
}
public static void h60_39(moom.b7 p0) throws Throwable {
    throw __call3006039_0(p0);
}
public static void h60_40(moom.b7 p0) throws Throwable {
    throw __call3006040_0(p0);
}
public static void h60_41(moom.b7 p0) throws Throwable {
    throw __call3006041_0(p0);
}
public static void h60_42(moom.b7 p0) throws Throwable {
    throw __call3006042_0(p0);
}
private static native long __fieldRead60_0() throws Throwable;
private static native int __call60_1() throws Throwable;
private static native moom.Bk __call60_2(moom.qy a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call60_3(java.lang.String a0) throws Throwable;
private static native boolean __call60_4(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory60_5(boolean value) throws Throwable;
private static native boolean __call60_6(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory60_7(boolean value) throws Throwable;
private static native boolean __call60_8(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory60_9(boolean value) throws Throwable;
private static native boolean __call60_10(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory60_11(boolean value) throws Throwable;
private static native boolean __call60_12(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory60_13(boolean value) throws Throwable;
private static native boolean __call60_14(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory60_15(boolean value) throws Throwable;
private static native java.util.Collection __call60_16(int a0, int a1) throws Throwable;
private static native java.lang.String __call60_17(java.util.Collection a0) throws Throwable;
private static native boolean __call60_18(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory60_19(boolean value) throws Throwable;
private static native boolean __call60_20(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory60_21(boolean value) throws Throwable;
private static native boolean __call60_22(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory60_23(boolean value) throws Throwable;
private static native boolean __call60_24(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory60_25(boolean value) throws Throwable;
private static native java.lang.String[] __call60_26() throws Throwable;
private static native java.lang.String __call60_27(java.lang.String[] a0) throws Throwable;
private static native java.util.List __call60_28(java.lang.String[] a0) throws Throwable;
private static native java.lang.String __call60_29(java.util.List a0) throws Throwable;
private static native boolean __call60_30(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory60_31(boolean value) throws Throwable;
private static native net.minecraft.util.EnumChatFormatting __call60_32(java.lang.String a0) throws Throwable;
private static native boolean __call60_33(net.minecraft.util.EnumChatFormatting a0) throws Throwable;
private static native java.util.Collection __call60_34(int a0, int a1) throws Throwable;
private static native java.lang.String __call60_35(java.util.Collection a0) throws Throwable;
private static native void __call60_36(moom.Bk a0, net.minecraft.util.EnumChatFormatting a1) throws Throwable;
private static native java.lang.String __call60_37(net.minecraft.util.EnumChatFormatting a0) throws Throwable;
private static native void __call60_38(moom.Bk a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.util.EnumChatFormatting __fieldRead60_39() throws Throwable;
private static native java.lang.String __call60_40(net.minecraft.util.EnumChatFormatting a0) throws Throwable;
private static native void __call60_41(moom.Bk a0, java.lang.String a1) throws Throwable;
private static native boolean __call60_42(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory60_43(boolean value) throws Throwable;
private static native boolean __call60_44(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory60_45(boolean value) throws Throwable;
private static native boolean __call60_46(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory60_47(boolean value) throws Throwable;
private static native java.util.List __call60_48(java.lang.String[] a0) throws Throwable;
private static native java.lang.String __call60_49(java.util.List a0) throws Throwable;
private static native boolean __call60_50(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call60_51(moom.Bk a0, boolean a1) throws Throwable;
private static native boolean __call60_52(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory60_53(boolean value) throws Throwable;
private static native boolean __call60_54(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory60_55(boolean value) throws Throwable;
private static native boolean __call60_56(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory60_57(boolean value) throws Throwable;
private static native java.util.List __call60_58(java.lang.String[] a0) throws Throwable;
private static native java.lang.String __call60_59(java.util.List a0) throws Throwable;
private static native boolean __call60_60(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call60_61(moom.Bk a0, boolean a1) throws Throwable;
private static native boolean __call60_62(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory60_63(boolean value) throws Throwable;
private static native net.minecraft.scoreboard.Team$EnumVisible __call60_64(java.lang.String a0) throws Throwable;
private static native java.lang.String[] __call60_65() throws Throwable;
private static native java.lang.String __call60_66(java.lang.String[] a0) throws Throwable;
private static native void __call60_67(moom.Bk a0, net.minecraft.scoreboard.Team$EnumVisible a1) throws Throwable;
private static native boolean __call60_68(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory60_69(boolean value) throws Throwable;
private static native net.minecraft.scoreboard.Team$EnumVisible __call60_70(java.lang.String a0) throws Throwable;
private static native java.lang.String[] __call60_71() throws Throwable;
private static native java.lang.String __call60_72(java.lang.String[] a0) throws Throwable;
private static native void __call60_73(moom.Bk a0, net.minecraft.scoreboard.Team$EnumVisible a1) throws Throwable;
private static native java.lang.String __call60_74(moom.Bk a0) throws Throwable;
private static native void __call60_75(net.minecraft.command.ICommandSender a0, moom.qy a1, java.lang.String a2, java.lang.Object[] a3) throws Throwable;
private static native java.lang.Exception __call3006000_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3006001_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3006002_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3006003_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3006004_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3006005_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3006006_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3006007_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3006008_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3006009_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3006010_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3006011_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3006012_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3006013_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3006014_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3006015_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3006016_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3006017_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3006018_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3006019_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3006020_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3006021_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3006022_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3006023_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3006024_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3006025_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3006026_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3006027_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3006028_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3006029_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3006030_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3006031_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3006032_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3006033_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3006034_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3006035_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3006036_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3006037_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3006038_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3006039_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3006040_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3006041_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3006042_0(moom.b7 a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_2166eec5a57e8b6c283f(moom.qy a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2, int a3) throws E;
private static final class __SourceHandler_2166eec5a57e8b6c283f {

public static void f1214(moom.qy receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1, int p2) throws Throwable {
    long life4_3;
    net.minecraft.scoreboard.Scoreboard life7_7;
    moom.Bk life8_13;
    int life6_14;
    forward_join_33: {
    forward_join_22: {
    life4_3 = (__fieldRead1214_0() ^ 69748068840784L);
    int spill1214_0 = __call1214_1();
    life7_7 = __call1214_2(receiver);
    life8_13 = __call1214_3(receiver, (p1)[p2]);
    life6_14 = spill1214_0;
    if (!((life6_14 == 0))) { break forward_join_22; }
    if (!((life8_13 != null))) { break forward_join_33; }
    __call1214_4(life7_7, life8_13);
    }
    __call1214_6(p0, receiver, "commands.scoreboard.teams.remove.success", new java.lang.Object[] {__call1214_5(life8_13)});
    }
    return;
}
public static void h1214_0(moom.b7 p0) throws Throwable {
    throw __call1121400_0(p0);
}
public static void h1214_1(moom.b7 p0) throws Throwable {
    throw __call1121401_0(p0);
}
private static native long __fieldRead1214_0() throws Throwable;
private static native int __call1214_1() throws Throwable;
private static native net.minecraft.scoreboard.Scoreboard __call1214_2(moom.qy a0) throws Throwable;
private static native moom.Bk __call1214_3(moom.qy a0, java.lang.String a1) throws Throwable;
private static native void __call1214_4(net.minecraft.scoreboard.Scoreboard a0, moom.Bk a1) throws Throwable;
private static native java.lang.String __call1214_5(moom.Bk a0) throws Throwable;
private static native void __call1214_6(net.minecraft.command.ICommandSender a0, moom.qy a1, java.lang.String a2, java.lang.Object[] a3) throws Throwable;
private static native java.lang.Exception __call1121400_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1121401_0(moom.b7 a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_340ace8432982f975972(moom.qy a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2, int a3) throws E;
private static final class __SourceHandler_340ace8432982f975972 {

public static void f1215(moom.qy receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1, int p2) throws Throwable {
    moom.Bk lexicalValue1215_25_0;
    int spill1215_0;
    moom.Bk spill1215_1;
    long life4_3;
    net.minecraft.scoreboard.Scoreboard life7_7;
    int life6_8;
    moom.Bk life8_18;
    java.util.Collection life9_29;
    moom.CN life10_69;
    java.util.Collection life8_90;
    moom.CN life9_120;
    java.util.Iterator life10_131;
    moom.Bk life11_138;
    lexical_join_159: {
    lexical_join_101: {
    lexical_join_83: {
    lexical_join_47: {
    lexical_join_25: {
    lexical_join_24: {
    life4_3 = (__fieldRead1215_0() ^ 74301737870300L);
    spill1215_0 = __call1215_1();
    life7_7 = __call1215_2(receiver);
    life6_8 = spill1215_0;
    if (!(((p1).length > p2))) {
        break lexical_join_83;
    }
    life8_18 = __call1215_3(receiver, (p1)[p2]);
    spill1215_1 = life8_18;
    if (!((life6_8 != 0))) {
        lexicalValue1215_25_0 = spill1215_1;
        break lexical_join_25;
    }
    if (!((spill1215_1 == null))) {
        break lexical_join_24;
    }
    return;
    }
    lexicalValue1215_25_0 = life8_18;
    }
    life9_29 = __call1215_4(lexicalValue1215_25_0);
    __call1215_7(p0, __fieldRead1215_5(), __call1215_6(life9_29));
    if (!((__call1215_8(life9_29) == 0))) {
        break lexical_join_47;
    }
    throw new moom.b7("commands.scoreboard.teams.list.player.empty", new java.lang.Object[] {__call1215_9(life8_18)});
    }
    life10_69 = new moom.CN("commands.scoreboard.teams.list.player.count", new java.lang.Object[] {__call1215_11(__call1215_10(life9_29)), __call1215_12(life8_18)});
    __call1215_15(__call1215_13(life10_69), __fieldRead1215_14());
    __call1215_16(p0, life10_69);
    __call1215_19(p0, new moom.CM(__call1215_18(__call1215_17(life9_29))));
    if (!((life6_8 == 0))) {
        break lexical_join_159;
    }
    }
    life8_90 = __call1215_20(life7_7);
    __call1215_23(p0, __fieldRead1215_21(), __call1215_22(life8_90));
    if (!((__call1215_24(life8_90) == 0))) {
        break lexical_join_101;
    }
    throw new moom.b7("commands.scoreboard.teams.list.empty", new java.lang.Object[0]);
    }
    life9_120 = new moom.CN("commands.scoreboard.teams.list.count", new java.lang.Object[] {__call1215_26(__call1215_25(life8_90))});
    __call1215_29(__call1215_27(life9_120), __fieldRead1215_28());
    __call1215_30(p0, life9_120);
    life10_131 = __call1215_31(life8_90);
    lexical_cycle_125: while (true) {
    if (!(__call1215_32(life10_131))) {
        break lexical_join_159;
    }
    life11_138 = __cast1215_34(__call1215_33(life10_131));
    __call1215_40(p0, new moom.CN("commands.scoreboard.teams.list.entry", new java.lang.Object[] {__call1215_35(life11_138), __call1215_36(life11_138), __call1215_39(__call1215_38(__call1215_37(life11_138)))}));
    if (!((life6_8 == 0))) { continue lexical_cycle_125; }
    break lexical_cycle_125;
    }
    }
    return;
}
public static void h1215_0(moom.b7 p0) throws Throwable {
    throw __call1121500_0(p0);
}
public static void h1215_1(moom.b7 p0) throws Throwable {
    throw __call1121501_0(p0);
}
public static void h1215_2(moom.b7 p0) throws Throwable {
    throw __call1121502_0(p0);
}
private static native long __fieldRead1215_0() throws Throwable;
private static native int __call1215_1() throws Throwable;
private static native net.minecraft.scoreboard.Scoreboard __call1215_2(moom.qy a0) throws Throwable;
private static native moom.Bk __call1215_3(moom.qy a0, java.lang.String a1) throws Throwable;
private static native java.util.Collection __call1215_4(moom.Bk a0) throws Throwable;
private static native net.minecraft.command.CommandResultStats$Type __fieldRead1215_5() throws Throwable;
private static native int __call1215_6(java.util.Collection a0) throws Throwable;
private static native void __call1215_7(net.minecraft.command.ICommandSender a0, net.minecraft.command.CommandResultStats$Type a1, int a2) throws Throwable;
private static native int __call1215_8(java.util.Collection a0) throws Throwable;
private static native java.lang.String __call1215_9(moom.Bk a0) throws Throwable;
private static native int __call1215_10(java.util.Collection a0) throws Throwable;
private static native java.lang.Integer __call1215_11(int a0) throws Throwable;
private static native java.lang.String __call1215_12(moom.Bk a0) throws Throwable;
private static native moom.CO __call1215_13(moom.CN a0) throws Throwable;
private static native net.minecraft.util.EnumChatFormatting __fieldRead1215_14() throws Throwable;
private static native moom.CO __call1215_15(moom.CO a0, net.minecraft.util.EnumChatFormatting a1) throws Throwable;
private static native void __call1215_16(net.minecraft.command.ICommandSender a0, moom.CN a1) throws Throwable;
private static native java.lang.Object[] __call1215_17(java.util.Collection a0) throws Throwable;
private static native java.lang.String __call1215_18(java.lang.Object[] a0) throws Throwable;
private static native void __call1215_19(net.minecraft.command.ICommandSender a0, moom.CM a1) throws Throwable;
private static native java.util.Collection __call1215_20(net.minecraft.scoreboard.Scoreboard a0) throws Throwable;
private static native net.minecraft.command.CommandResultStats$Type __fieldRead1215_21() throws Throwable;
private static native int __call1215_22(java.util.Collection a0) throws Throwable;
private static native void __call1215_23(net.minecraft.command.ICommandSender a0, net.minecraft.command.CommandResultStats$Type a1, int a2) throws Throwable;
private static native int __call1215_24(java.util.Collection a0) throws Throwable;
private static native int __call1215_25(java.util.Collection a0) throws Throwable;
private static native java.lang.Integer __call1215_26(int a0) throws Throwable;
private static native moom.CO __call1215_27(moom.CN a0) throws Throwable;
private static native net.minecraft.util.EnumChatFormatting __fieldRead1215_28() throws Throwable;
private static native moom.CO __call1215_29(moom.CO a0, net.minecraft.util.EnumChatFormatting a1) throws Throwable;
private static native void __call1215_30(net.minecraft.command.ICommandSender a0, moom.CN a1) throws Throwable;
private static native java.util.Iterator __call1215_31(java.util.Collection a0) throws Throwable;
private static native boolean __call1215_32(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1215_33(java.util.Iterator a0) throws Throwable;
private static native moom.Bk __cast1215_34(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call1215_35(moom.Bk a0) throws Throwable;
private static native java.lang.String __call1215_36(moom.Bk a0) throws Throwable;
private static native java.util.Collection __call1215_37(moom.Bk a0) throws Throwable;
private static native int __call1215_38(java.util.Collection a0) throws Throwable;
private static native java.lang.Integer __call1215_39(int a0) throws Throwable;
private static native void __call1215_40(net.minecraft.command.ICommandSender a0, moom.CN a1) throws Throwable;
private static native java.lang.Exception __call1121500_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1121501_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1121502_0(moom.b7 a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_d7bbb00a803617e4c142(moom.qy a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2, int a3) throws E;
private static final class __SourceHandler_d7bbb00a803617e4c142 {

public static void f100132(moom.qy receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1, int p2) throws Throwable {
    int forestValue100132_49_0;
    int forestValue100132_53_0;
    int forestValue100132_105_0;
    java.lang.String forestValue100132_113_0;
    int forestValue100132_130_0;
    int forestValue100132_134_0;
    int forestValue100132_186_0;
    java.lang.String forestValue100132_194_0;
    int forestValue100132_211_0;
    int forestValue100132_218_0;
    int forestValue100132_218_1;
    int forestValue100132_268_0;
    java.lang.String forestValue100132_276_0;
    int forestValue100132_293_0;
    int forestValue100132_298_0;
    int forestValue100132_303_0;
    int forestValue100132_337_0;
    int spill100132_0;
    int spill100132_1;
    int spill100132_2;
    int spill100132_3;
    boolean spill100132_4;
    java.lang.String spill100132_5;
    boolean spill100132_6;
    boolean spill100132_7;
    boolean spill100132_8;
    java.lang.String spill100132_9;
    boolean spill100132_10;
    boolean spill100132_11;
    boolean spill100132_12;
    int spill100132_13;
    java.lang.String spill100132_14;
    boolean spill100132_15;
    boolean spill100132_16;
    boolean spill100132_17;
    int spill100132_18;
    net.minecraft.command.ICommandSender spill100132_19;
    moom.qy spill100132_20;
    java.lang.String spill100132_21;
    java.lang.Object[] spill100132_22;
    java.lang.Object[] spill100132_23;
    java.lang.Object[] spill100132_24;
    moom.b7 spill100132_25;
    moom.b7 spill100132_26;
    java.lang.String spill100132_27;
    java.lang.Object[] spill100132_28;
    java.lang.Object[] spill100132_29;
    java.lang.Object[] spill100132_30;
    long life4_3;
    net.minecraft.scoreboard.Scoreboard life7_7;
    int life6_8;
    java.lang.String life8_13;
    java.util.HashSet life9_15;
    java.util.HashSet life10_17;
    java.lang.String life11_39;
    java.lang.String life11_78;
    java.util.Iterator life12_96;
    net.minecraft.entity.Entity life13_105;
    java.lang.String life14_111;
    java.lang.String life12_149;
    java.lang.String life11_186;
    java.util.Iterator life12_204;
    net.minecraft.entity.Entity life13_213;
    java.lang.String life14_219;
    java.lang.String life12_257;
    java.lang.String life11_294;
    java.util.Iterator life12_312;
    net.minecraft.entity.Entity life13_321;
    java.lang.String life14_327;
    java.lang.String life12_365;
    forest_join_363: {
    forest_join_337: {
    forest_join_335: {
    forest_join_303: {
    forest_join_301: {
    forest_join_218: {
    forest_join_217: {
    forest_join_134: {
    forest_join_52: {
    forest_join_50: {
    forest_join_49: {
    forest_join_46: {
    life4_3 = (__fieldRead100132_0() ^ 28281993740354L);
    spill100132_0 = __call100132_1();
    life7_7 = __call100132_2(receiver);
    life6_8 = spill100132_0;
    life8_13 = (p1)[(p2++)];
    life9_15 = __call100132_3();
    life10_17 = __call100132_4();
    spill100132_1 = __instanceOf100132_5(p0);
    if (!((life6_8 != 0))) {
        forestValue100132_134_0 = spill100132_1;
        break forest_join_134;
    }
    if (!((spill100132_1 != 0))) {
        break forest_join_52;
    }
    spill100132_2 = p2;
    spill100132_3 = (p1).length;
    if (!((life6_8 != 0))) {
        forestValue100132_218_0 = spill100132_2;
        forestValue100132_218_1 = spill100132_3;
        break forest_join_218;
    }
    if (!((spill100132_2 == spill100132_3))) {
        break forest_join_52;
    }
    life11_39 = __call100132_7(__call100132_6(p0));
    spill100132_4 = __call100132_8(life7_7, life11_39, life8_13);
    if (!((life6_8 != 0))) {
        forestValue100132_49_0 = __integerCategory100132_9(spill100132_4);
        break forest_join_49;
    }
    if (!(spill100132_4)) {
        break forest_join_46;
    }
    __call100132_10(life9_15, life11_39);
    if (!((life6_8 == 0))) {
        break forest_join_50;
    }
    }
    forestValue100132_49_0 = __integerCategory100132_12(__call100132_11(life10_17, life11_39));
    }
    __discardScalar100132_13(forestValue100132_49_0);
    }
    if (!((life6_8 == 0))) {
        break forest_join_301;
    }
    }
    forest_cycle_52: while (true) {
    forest_join_131: {
    forest_join_130: {
    forest_join_127: {
    forest_join_113: {
    forest_join_110: {
    forest_join_108: {
    forestValue100132_53_0 = p2;
    forest_cycle_53: while (true) {
    if (!((forestValue100132_53_0 < (p1).length))) {
        break forest_join_301;
    }
    life11_78 = (p1)[(p2++)];
    spill100132_5 = life11_78;
    if (!((life6_8 != 0))) {
        forestValue100132_113_0 = spill100132_5;
        break forest_join_113;
    }
    spill100132_6 = __call100132_14(spill100132_5, "@");
    if (!((life6_8 != 0))) {
        forestValue100132_303_0 = __integerCategory100132_15(spill100132_6);
        break forest_join_303;
    }
    if (!(spill100132_6)) {
        break forest_join_110;
    }
    life12_96 = __call100132_17(__call100132_16(p0, life11_78));
    forest_cycle_74: while (true) {
    forest_join_106: {
    forest_join_105: {
    forest_join_102: {
    if (!(__call100132_18(life12_96))) {
        break forest_join_108;
    }
    life13_105 = __cast100132_20(__call100132_19(life12_96));
    life14_111 = __call100132_23(p0, __call100132_22(__call100132_21(life13_105)));
    spill100132_7 = __call100132_24(life7_7, life14_111, life8_13);
    if (!((life6_8 != 0))) {
        forestValue100132_53_0 = __integerCategory100132_25(spill100132_7);
        continue forest_cycle_53;
    }
    if (!((life6_8 != 0))) {
        forestValue100132_105_0 = __integerCategory100132_26(spill100132_7);
        break forest_join_105;
    }
    if (!(spill100132_7)) {
        break forest_join_102;
    }
    __call100132_27(life9_15, life14_111);
    if (!((life6_8 == 0))) {
        break forest_join_106;
    }
    }
    forestValue100132_105_0 = __integerCategory100132_29(__call100132_28(life10_17, life14_111));
    }
    __discardScalar100132_30(forestValue100132_105_0);
    }
    if (!((life6_8 == 0))) {
        continue forest_cycle_74;
    }
    break forest_cycle_74;
    }
    break forest_cycle_53;
    }
    }
    if (!((life6_8 == 0))) {
        break forest_join_131;
    }
    }
    forestValue100132_113_0 = __call100132_31(p0, life11_78);
    }
    life12_149 = forestValue100132_113_0;
    spill100132_8 = __call100132_32(life7_7, life12_149, life8_13);
    if (!((life6_8 != 0))) {
        forestValue100132_130_0 = __integerCategory100132_33(spill100132_8);
        break forest_join_130;
    }
    if (!(spill100132_8)) {
        break forest_join_127;
    }
    __call100132_34(life9_15, life12_149);
    if (!((life6_8 == 0))) {
        break forest_join_131;
    }
    }
    forestValue100132_130_0 = __integerCategory100132_36(__call100132_35(life10_17, life12_149));
    }
    __discardScalar100132_37(forestValue100132_130_0);
    }
    if (!((life6_8 == 0))) {
        continue forest_cycle_52;
    }
    break forest_cycle_52;
    }
    break forest_join_301;
    }
    forest_cycle_134: while (true) {
    forest_join_215: {
    forest_join_212: {
    forest_join_211: {
    forest_join_208: {
    forest_join_194: {
    forest_join_191: {
    forest_join_189: {
    if (!((forestValue100132_134_0 < (p1).length))) {
        break forest_join_301;
    }
    life11_186 = (p1)[(p2++)];
    spill100132_9 = life11_186;
    if (!((life6_8 != 0))) {
        forestValue100132_194_0 = spill100132_9;
        break forest_join_194;
    }
    spill100132_10 = __call100132_38(spill100132_9, "@");
    if (!((life6_8 != 0))) {
        forestValue100132_303_0 = __integerCategory100132_39(spill100132_10);
        break forest_join_303;
    }
    if (!(spill100132_10)) {
        break forest_join_191;
    }
    life12_204 = __call100132_41(__call100132_40(p0, life11_186));
    forest_cycle_155: while (true) {
    forest_join_187: {
    forest_join_186: {
    forest_join_183: {
    if (!(__call100132_42(life12_204))) {
        break forest_join_189;
    }
    life13_213 = __cast100132_44(__call100132_43(life12_204));
    life14_219 = __call100132_47(p0, __call100132_46(__call100132_45(life13_213)));
    spill100132_11 = __call100132_48(life7_7, life14_219, life8_13);
    if (!((life6_8 != 0))) {
        forestValue100132_134_0 = __integerCategory100132_49(spill100132_11);
        continue forest_cycle_134;
    }
    if (!((life6_8 != 0))) {
        forestValue100132_186_0 = __integerCategory100132_50(spill100132_11);
        break forest_join_186;
    }
    if (!(spill100132_11)) {
        break forest_join_183;
    }
    __call100132_51(life9_15, life14_219);
    if (!((life6_8 == 0))) {
        break forest_join_187;
    }
    }
    forestValue100132_186_0 = __integerCategory100132_53(__call100132_52(life10_17, life14_219));
    }
    __discardScalar100132_54(forestValue100132_186_0);
    }
    if (!((life6_8 == 0))) {
        continue forest_cycle_155;
    }
    break forest_cycle_155;
    }
    }
    if (!((life6_8 == 0))) {
        break forest_join_212;
    }
    }
    forestValue100132_194_0 = __call100132_55(p0, life11_186);
    }
    life12_257 = forestValue100132_194_0;
    spill100132_12 = __call100132_56(life7_7, life12_257, life8_13);
    if (!((life6_8 != 0))) {
        forestValue100132_211_0 = __integerCategory100132_57(spill100132_12);
        break forest_join_211;
    }
    if (!(spill100132_12)) {
        break forest_join_208;
    }
    __call100132_58(life9_15, life12_257);
    if (!((life6_8 == 0))) {
        break forest_join_212;
    }
    }
    forestValue100132_211_0 = __integerCategory100132_60(__call100132_59(life10_17, life12_257));
    }
    __discardScalar100132_61(forestValue100132_211_0);
    }
    if (!((life6_8 == 0))) {
        break forest_join_215;
    }
    break forest_join_217;
    }
    spill100132_13 = p2;
    forestValue100132_134_0 = spill100132_13;
    continue forest_cycle_134;
    }
    }
    break forest_join_301;
    }
    forest_cycle_218: while (true) {
    forest_join_298: {
    forest_join_297: {
    forest_join_294: {
    forest_join_293: {
    forest_join_290: {
    forest_join_276: {
    forest_join_273: {
    forest_join_271: {
    if (!((forestValue100132_218_0 < forestValue100132_218_1))) {
        break forest_join_301;
    }
    life11_294 = (p1)[(p2++)];
    spill100132_14 = life11_294;
    if (!((life6_8 != 0))) {
        forestValue100132_276_0 = spill100132_14;
        break forest_join_276;
    }
    spill100132_15 = __call100132_62(spill100132_14, "@");
    if (!((life6_8 != 0))) {
        forestValue100132_303_0 = __integerCategory100132_63(spill100132_15);
        break forest_join_303;
    }
    if (!(spill100132_15)) {
        break forest_join_273;
    }
    life12_312 = __call100132_65(__call100132_64(p0, life11_294));
    forest_cycle_237: while (true) {
    forest_join_269: {
    forest_join_268: {
    forest_join_265: {
    if (!(__call100132_66(life12_312))) {
        break forest_join_271;
    }
    life13_321 = __cast100132_68(__call100132_67(life12_312));
    life14_327 = __call100132_71(p0, __call100132_70(__call100132_69(life13_321)));
    spill100132_16 = __call100132_72(life7_7, life14_327, life8_13);
    if (!((life6_8 != 0))) {
        forestValue100132_298_0 = __integerCategory100132_73(spill100132_16);
        break forest_join_298;
    }
    if (!((life6_8 != 0))) {
        forestValue100132_268_0 = __integerCategory100132_74(spill100132_16);
        break forest_join_268;
    }
    if (!(spill100132_16)) {
        break forest_join_265;
    }
    __call100132_75(life9_15, life14_327);
    if (!((life6_8 == 0))) {
        break forest_join_269;
    }
    }
    forestValue100132_268_0 = __integerCategory100132_77(__call100132_76(life10_17, life14_327));
    }
    __discardScalar100132_78(forestValue100132_268_0);
    }
    if (!((life6_8 == 0))) {
        continue forest_cycle_237;
    }
    break forest_cycle_237;
    }
    }
    if (!((life6_8 == 0))) {
        break forest_join_294;
    }
    }
    forestValue100132_276_0 = __call100132_79(p0, life11_294);
    }
    life12_365 = forestValue100132_276_0;
    spill100132_17 = __call100132_80(life7_7, life12_365, life8_13);
    if (!((life6_8 != 0))) {
        forestValue100132_293_0 = __integerCategory100132_81(spill100132_17);
        break forest_join_293;
    }
    if (!(spill100132_17)) {
        break forest_join_290;
    }
    __call100132_82(life9_15, life12_365);
    if (!((life6_8 == 0))) {
        break forest_join_294;
    }
    }
    forestValue100132_293_0 = __integerCategory100132_84(__call100132_83(life10_17, life12_365));
    }
    __discardScalar100132_85(forestValue100132_293_0);
    }
    if (!((life6_8 == 0))) {
        break forest_join_297;
    }
    break forest_join_301;
    }
    forestValue100132_298_0 = p2;
    }
    spill100132_18 = (p1).length;
    forestValue100132_218_0 = forestValue100132_298_0;
    forestValue100132_218_1 = spill100132_18;
    continue forest_cycle_218;
    }
    }
    forestValue100132_303_0 = __integerCategory100132_87(__call100132_86(life9_15));
    }
    if (!((life6_8 != 0))) {
        forestValue100132_337_0 = forestValue100132_303_0;
        break forest_join_337;
    }
    if (!((forestValue100132_303_0 == 0))) {
        break forest_join_335;
    }
    __call100132_90(p0, __fieldRead100132_88(), __call100132_89(life9_15));
    spill100132_19 = p0;
    spill100132_20 = receiver;
    spill100132_21 = "commands.scoreboard.teams.join.success";
    java.lang.Object[] __stackOp100132_91_0 = new java.lang.Object[3];
    spill100132_22 = __stackOp100132_91_0;
    (__stackOp100132_91_0)[0] = __call100132_93(__call100132_92(life9_15));
    java.lang.Object[] __stackOp100132_94_0 = spill100132_22;
    spill100132_23 = __stackOp100132_94_0;
    (__stackOp100132_94_0)[1] = life8_13;
    java.lang.Object[] __stackOp100132_95_0 = spill100132_23;
    spill100132_24 = __stackOp100132_95_0;
    (__stackOp100132_95_0)[2] = __call100132_97(__call100132_96(life9_15, new java.lang.String[0]));
    __call100132_98(spill100132_19, spill100132_20, spill100132_21, spill100132_24);
    }
    forestValue100132_337_0 = __integerCategory100132_100(__call100132_99(life10_17));
    }
    if (!((forestValue100132_337_0 == 0))) {
        break forest_join_363;
    }
    moom.b7 __stackOp100132_102_0 = __sourceUninitializedNEW100132_101();
    spill100132_25 = __stackOp100132_102_0;
    spill100132_26 = __stackOp100132_102_0;
    spill100132_27 = "commands.scoreboard.teams.join.failure";
    java.lang.Object[] __stackOp100132_103_0 = new java.lang.Object[3];
    spill100132_28 = __stackOp100132_103_0;
    (__stackOp100132_103_0)[0] = __call100132_105(__call100132_104(life10_17));
    java.lang.Object[] __stackOp100132_106_0 = spill100132_28;
    spill100132_29 = __stackOp100132_106_0;
    (__stackOp100132_106_0)[1] = life8_13;
    java.lang.Object[] __stackOp100132_107_0 = spill100132_29;
    spill100132_30 = __stackOp100132_107_0;
    (__stackOp100132_107_0)[2] = __call100132_109(__call100132_108(life10_17, new java.lang.String[0]));
    __explicitNewInit100132_110(spill100132_26, spill100132_27, spill100132_30);
    throw spill100132_25;
    }
    return;
}
public static void h100132_0(moom.b7 p0) throws Throwable {
    throw __call13013200_0(p0);
}
public static void h100132_1(moom.b7 p0) throws Throwable {
    throw __call13013201_0(p0);
}
public static void h100132_2(moom.b7 p0) throws Throwable {
    throw __call13013202_0(p0);
}
public static void h100132_3(moom.b7 p0) throws Throwable {
    throw __call13013203_0(p0);
}
public static void h100132_4(moom.b7 p0) throws Throwable {
    throw __call13013204_0(p0);
}
public static void h100132_5(moom.b7 p0) throws Throwable {
    throw __call13013205_0(p0);
}
public static void h100132_6(moom.b7 p0) throws Throwable {
    throw __call13013206_0(p0);
}
public static void h100132_7(moom.b7 p0) throws Throwable {
    throw __call13013207_0(p0);
}
public static void h100132_8(moom.b7 p0) throws Throwable {
    throw __call13013208_0(p0);
}
public static void h100132_9(moom.b7 p0) throws Throwable {
    throw __call13013209_0(p0);
}
public static void h100132_10(moom.b7 p0) throws Throwable {
    throw __call13013210_0(p0);
}
public static void h100132_11(moom.b7 p0) throws Throwable {
    throw __call13013211_0(p0);
}
public static void h100132_12(moom.b7 p0) throws Throwable {
    throw __call13013212_0(p0);
}
public static void h100132_13(moom.b7 p0) throws Throwable {
    throw __call13013213_0(p0);
}
public static void h100132_14(moom.b7 p0) throws Throwable {
    throw __call13013214_0(p0);
}
public static void h100132_15(moom.b7 p0) throws Throwable {
    throw __call13013215_0(p0);
}
public static void h100132_16(moom.b7 p0) throws Throwable {
    throw __call13013216_0(p0);
}
public static void h100132_17(moom.b7 p0) throws Throwable {
    throw __call13013217_0(p0);
}
public static void h100132_18(moom.b7 p0) throws Throwable {
    throw __call13013218_0(p0);
}
private static native long __fieldRead100132_0() throws Throwable;
private static native int __call100132_1() throws Throwable;
private static native net.minecraft.scoreboard.Scoreboard __call100132_2(moom.qy a0) throws Throwable;
private static native java.util.HashSet __call100132_3() throws Throwable;
private static native java.util.HashSet __call100132_4() throws Throwable;
private static native int __instanceOf100132_5(net.minecraft.command.ICommandSender a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __call100132_6(net.minecraft.command.ICommandSender a0) throws Throwable;
private static native java.lang.String __call100132_7(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native boolean __call100132_8(net.minecraft.scoreboard.Scoreboard a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native int __integerCategory100132_9(boolean value) throws Throwable;
private static native boolean __call100132_10(java.util.HashSet a0, java.lang.String a1) throws Throwable;
private static native boolean __call100132_11(java.util.HashSet a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory100132_12(boolean value) throws Throwable;
private static native void __discardScalar100132_13(int a0) throws Throwable;
private static native boolean __call100132_14(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory100132_15(boolean value) throws Throwable;
private static native java.util.List __call100132_16(net.minecraft.command.ICommandSender a0, java.lang.String a1) throws Throwable;
private static native java.util.Iterator __call100132_17(java.util.List a0) throws Throwable;
private static native boolean __call100132_18(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call100132_19(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.entity.Entity __cast100132_20(java.lang.Object a0) throws Throwable;
private static native java.util.UUID __call100132_21(net.minecraft.entity.Entity a0) throws Throwable;
private static native java.lang.String __call100132_22(java.util.UUID a0) throws Throwable;
private static native java.lang.String __call100132_23(net.minecraft.command.ICommandSender a0, java.lang.String a1) throws Throwable;
private static native boolean __call100132_24(net.minecraft.scoreboard.Scoreboard a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native int __integerCategory100132_25(boolean value) throws Throwable;
private static native int __integerCategory100132_26(boolean value) throws Throwable;
private static native boolean __call100132_27(java.util.HashSet a0, java.lang.String a1) throws Throwable;
private static native boolean __call100132_28(java.util.HashSet a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory100132_29(boolean value) throws Throwable;
private static native void __discardScalar100132_30(int a0) throws Throwable;
private static native java.lang.String __call100132_31(net.minecraft.command.ICommandSender a0, java.lang.String a1) throws Throwable;
private static native boolean __call100132_32(net.minecraft.scoreboard.Scoreboard a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native int __integerCategory100132_33(boolean value) throws Throwable;
private static native boolean __call100132_34(java.util.HashSet a0, java.lang.String a1) throws Throwable;
private static native boolean __call100132_35(java.util.HashSet a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory100132_36(boolean value) throws Throwable;
private static native void __discardScalar100132_37(int a0) throws Throwable;
private static native boolean __call100132_38(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory100132_39(boolean value) throws Throwable;
private static native java.util.List __call100132_40(net.minecraft.command.ICommandSender a0, java.lang.String a1) throws Throwable;
private static native java.util.Iterator __call100132_41(java.util.List a0) throws Throwable;
private static native boolean __call100132_42(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call100132_43(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.entity.Entity __cast100132_44(java.lang.Object a0) throws Throwable;
private static native java.util.UUID __call100132_45(net.minecraft.entity.Entity a0) throws Throwable;
private static native java.lang.String __call100132_46(java.util.UUID a0) throws Throwable;
private static native java.lang.String __call100132_47(net.minecraft.command.ICommandSender a0, java.lang.String a1) throws Throwable;
private static native boolean __call100132_48(net.minecraft.scoreboard.Scoreboard a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native int __integerCategory100132_49(boolean value) throws Throwable;
private static native int __integerCategory100132_50(boolean value) throws Throwable;
private static native boolean __call100132_51(java.util.HashSet a0, java.lang.String a1) throws Throwable;
private static native boolean __call100132_52(java.util.HashSet a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory100132_53(boolean value) throws Throwable;
private static native void __discardScalar100132_54(int a0) throws Throwable;
private static native java.lang.String __call100132_55(net.minecraft.command.ICommandSender a0, java.lang.String a1) throws Throwable;
private static native boolean __call100132_56(net.minecraft.scoreboard.Scoreboard a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native int __integerCategory100132_57(boolean value) throws Throwable;
private static native boolean __call100132_58(java.util.HashSet a0, java.lang.String a1) throws Throwable;
private static native boolean __call100132_59(java.util.HashSet a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory100132_60(boolean value) throws Throwable;
private static native void __discardScalar100132_61(int a0) throws Throwable;
private static native boolean __call100132_62(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory100132_63(boolean value) throws Throwable;
private static native java.util.List __call100132_64(net.minecraft.command.ICommandSender a0, java.lang.String a1) throws Throwable;
private static native java.util.Iterator __call100132_65(java.util.List a0) throws Throwable;
private static native boolean __call100132_66(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call100132_67(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.entity.Entity __cast100132_68(java.lang.Object a0) throws Throwable;
private static native java.util.UUID __call100132_69(net.minecraft.entity.Entity a0) throws Throwable;
private static native java.lang.String __call100132_70(java.util.UUID a0) throws Throwable;
private static native java.lang.String __call100132_71(net.minecraft.command.ICommandSender a0, java.lang.String a1) throws Throwable;
private static native boolean __call100132_72(net.minecraft.scoreboard.Scoreboard a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native int __integerCategory100132_73(boolean value) throws Throwable;
private static native int __integerCategory100132_74(boolean value) throws Throwable;
private static native boolean __call100132_75(java.util.HashSet a0, java.lang.String a1) throws Throwable;
private static native boolean __call100132_76(java.util.HashSet a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory100132_77(boolean value) throws Throwable;
private static native void __discardScalar100132_78(int a0) throws Throwable;
private static native java.lang.String __call100132_79(net.minecraft.command.ICommandSender a0, java.lang.String a1) throws Throwable;
private static native boolean __call100132_80(net.minecraft.scoreboard.Scoreboard a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native int __integerCategory100132_81(boolean value) throws Throwable;
private static native boolean __call100132_82(java.util.HashSet a0, java.lang.String a1) throws Throwable;
private static native boolean __call100132_83(java.util.HashSet a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory100132_84(boolean value) throws Throwable;
private static native void __discardScalar100132_85(int a0) throws Throwable;
private static native boolean __call100132_86(java.util.HashSet a0) throws Throwable;
private static native int __integerCategory100132_87(boolean value) throws Throwable;
private static native net.minecraft.command.CommandResultStats$Type __fieldRead100132_88() throws Throwable;
private static native int __call100132_89(java.util.HashSet a0) throws Throwable;
private static native void __call100132_90(net.minecraft.command.ICommandSender a0, net.minecraft.command.CommandResultStats$Type a1, int a2) throws Throwable;
private static native int __call100132_92(java.util.HashSet a0) throws Throwable;
private static native java.lang.Integer __call100132_93(int a0) throws Throwable;
private static native java.lang.Object[] __call100132_96(java.util.HashSet a0, java.lang.String[] a1) throws Throwable;
private static native java.lang.String __call100132_97(java.lang.Object[] a0) throws Throwable;
private static native void __call100132_98(net.minecraft.command.ICommandSender a0, moom.qy a1, java.lang.String a2, java.lang.Object[] a3) throws Throwable;
private static native boolean __call100132_99(java.util.HashSet a0) throws Throwable;
private static native int __integerCategory100132_100(boolean value) throws Throwable;
private static native moom.b7 __sourceUninitializedNEW100132_101() throws Throwable;
private static native int __call100132_104(java.util.HashSet a0) throws Throwable;
private static native java.lang.Integer __call100132_105(int a0) throws Throwable;
private static native java.lang.Object[] __call100132_108(java.util.HashSet a0, java.lang.String[] a1) throws Throwable;
private static native java.lang.String __call100132_109(java.lang.Object[] a0) throws Throwable;
private static native void __explicitNewInit100132_110(moom.b7 a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native java.lang.Exception __call13013200_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013201_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013202_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013203_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013204_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013205_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013206_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013207_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013208_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013209_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013210_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013211_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013212_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013213_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013214_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013215_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013216_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013217_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013218_0(moom.b7 a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_7388922557981f2e8fb9(moom.qy a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2, int a3) throws E;
private static final class __SourceHandler_7388922557981f2e8fb9 {

public static void f100133(moom.qy receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1, int p2) throws Throwable {
    int forestValue100133_43_0;
    int forestValue100133_47_0;
    int forestValue100133_98_0;
    java.lang.String forestValue100133_106_0;
    int forestValue100133_122_0;
    int forestValue100133_126_0;
    int forestValue100133_177_0;
    java.lang.String forestValue100133_185_0;
    int forestValue100133_201_0;
    int forestValue100133_208_0;
    int forestValue100133_208_1;
    int forestValue100133_257_0;
    java.lang.String forestValue100133_265_0;
    int forestValue100133_281_0;
    int forestValue100133_286_0;
    int forestValue100133_291_0;
    int forestValue100133_321_0;
    int spill100133_0;
    int spill100133_1;
    int spill100133_2;
    int spill100133_3;
    boolean spill100133_4;
    java.lang.String spill100133_5;
    boolean spill100133_6;
    boolean spill100133_7;
    boolean spill100133_8;
    java.lang.String spill100133_9;
    boolean spill100133_10;
    boolean spill100133_11;
    boolean spill100133_12;
    int spill100133_13;
    java.lang.String spill100133_14;
    boolean spill100133_15;
    boolean spill100133_16;
    boolean spill100133_17;
    int spill100133_18;
    net.minecraft.command.ICommandSender spill100133_19;
    moom.qy spill100133_20;
    java.lang.String spill100133_21;
    java.lang.Object[] spill100133_22;
    java.lang.Object[] spill100133_23;
    moom.b7 spill100133_24;
    moom.b7 spill100133_25;
    java.lang.String spill100133_26;
    java.lang.Object[] spill100133_27;
    java.lang.Object[] spill100133_28;
    long life4_3;
    net.minecraft.scoreboard.Scoreboard life7_7;
    java.util.HashSet life8_9;
    java.util.HashSet life9_11;
    int life6_12;
    java.lang.String life10_34;
    java.lang.String life10_72;
    java.util.Iterator life11_90;
    net.minecraft.entity.Entity life12_99;
    java.lang.String life13_105;
    java.lang.String life11_142;
    java.lang.String life10_178;
    java.util.Iterator life11_196;
    net.minecraft.entity.Entity life12_205;
    java.lang.String life13_211;
    java.lang.String life11_248;
    java.lang.String life10_284;
    java.util.Iterator life11_302;
    net.minecraft.entity.Entity life12_311;
    java.lang.String life13_317;
    java.lang.String life11_354;
    forest_join_343: {
    forest_join_321: {
    forest_join_319: {
    forest_join_291: {
    forest_join_289: {
    forest_join_208: {
    forest_join_207: {
    forest_join_126: {
    forest_join_46: {
    forest_join_44: {
    forest_join_43: {
    forest_join_40: {
    life4_3 = (__fieldRead100133_0() ^ 38742273133679L);
    spill100133_0 = __call100133_1();
    life7_7 = __call100133_2(receiver);
    life8_9 = __call100133_3();
    life9_11 = __call100133_4();
    life6_12 = spill100133_0;
    spill100133_1 = __instanceOf100133_5(p0);
    if (!((life6_12 != 0))) {
        forestValue100133_126_0 = spill100133_1;
        break forest_join_126;
    }
    if (!((spill100133_1 != 0))) {
        break forest_join_46;
    }
    spill100133_2 = p2;
    spill100133_3 = (p1).length;
    if (!((life6_12 != 0))) {
        forestValue100133_208_0 = spill100133_2;
        forestValue100133_208_1 = spill100133_3;
        break forest_join_208;
    }
    if (!((spill100133_2 == spill100133_3))) {
        break forest_join_46;
    }
    life10_34 = __call100133_7(__call100133_6(p0));
    spill100133_4 = __call100133_8(life7_7, life10_34);
    if (!((life6_12 != 0))) {
        forestValue100133_43_0 = __integerCategory100133_9(spill100133_4);
        break forest_join_43;
    }
    if (!(spill100133_4)) {
        break forest_join_40;
    }
    __call100133_10(life8_9, life10_34);
    if (!((life6_12 == 0))) {
        break forest_join_44;
    }
    }
    forestValue100133_43_0 = __integerCategory100133_12(__call100133_11(life9_11, life10_34));
    }
    __discardScalar100133_13(forestValue100133_43_0);
    }
    if (!((life6_12 == 0))) {
        break forest_join_289;
    }
    }
    forest_cycle_46: while (true) {
    forest_join_123: {
    forest_join_122: {
    forest_join_119: {
    forest_join_106: {
    forest_join_103: {
    forest_join_101: {
    forestValue100133_47_0 = p2;
    forest_cycle_47: while (true) {
    if (!((forestValue100133_47_0 < (p1).length))) {
        break forest_join_289;
    }
    life10_72 = (p1)[(p2++)];
    spill100133_5 = life10_72;
    if (!((life6_12 != 0))) {
        forestValue100133_106_0 = spill100133_5;
        break forest_join_106;
    }
    spill100133_6 = __call100133_14(spill100133_5, "@");
    if (!((life6_12 != 0))) {
        forestValue100133_291_0 = __integerCategory100133_15(spill100133_6);
        break forest_join_291;
    }
    if (!(spill100133_6)) {
        break forest_join_103;
    }
    life11_90 = __call100133_17(__call100133_16(p0, life10_72));
    forest_cycle_68: while (true) {
    forest_join_99: {
    forest_join_98: {
    forest_join_95: {
    if (!(__call100133_18(life11_90))) {
        break forest_join_101;
    }
    life12_99 = __cast100133_20(__call100133_19(life11_90));
    life13_105 = __call100133_23(p0, __call100133_22(__call100133_21(life12_99)));
    spill100133_7 = __call100133_24(life7_7, life13_105);
    if (!((life6_12 != 0))) {
        forestValue100133_47_0 = __integerCategory100133_25(spill100133_7);
        continue forest_cycle_47;
    }
    if (!((life6_12 != 0))) {
        forestValue100133_98_0 = __integerCategory100133_26(spill100133_7);
        break forest_join_98;
    }
    if (!(spill100133_7)) {
        break forest_join_95;
    }
    __call100133_27(life8_9, life13_105);
    if (!((life6_12 == 0))) {
        break forest_join_99;
    }
    }
    forestValue100133_98_0 = __integerCategory100133_29(__call100133_28(life9_11, life13_105));
    }
    __discardScalar100133_30(forestValue100133_98_0);
    }
    if (!((life6_12 == 0))) {
        continue forest_cycle_68;
    }
    break forest_cycle_68;
    }
    break forest_cycle_47;
    }
    }
    if (!((life6_12 == 0))) {
        break forest_join_123;
    }
    }
    forestValue100133_106_0 = __call100133_31(p0, life10_72);
    }
    life11_142 = forestValue100133_106_0;
    spill100133_8 = __call100133_32(life7_7, life11_142);
    if (!((life6_12 != 0))) {
        forestValue100133_122_0 = __integerCategory100133_33(spill100133_8);
        break forest_join_122;
    }
    if (!(spill100133_8)) {
        break forest_join_119;
    }
    __call100133_34(life8_9, life11_142);
    if (!((life6_12 == 0))) {
        break forest_join_123;
    }
    }
    forestValue100133_122_0 = __integerCategory100133_36(__call100133_35(life9_11, life11_142));
    }
    __discardScalar100133_37(forestValue100133_122_0);
    }
    if (!((life6_12 == 0))) {
        continue forest_cycle_46;
    }
    break forest_cycle_46;
    }
    break forest_join_289;
    }
    forest_cycle_126: while (true) {
    forest_join_205: {
    forest_join_202: {
    forest_join_201: {
    forest_join_198: {
    forest_join_185: {
    forest_join_182: {
    forest_join_180: {
    if (!((forestValue100133_126_0 < (p1).length))) {
        break forest_join_289;
    }
    life10_178 = (p1)[(p2++)];
    spill100133_9 = life10_178;
    if (!((life6_12 != 0))) {
        forestValue100133_185_0 = spill100133_9;
        break forest_join_185;
    }
    spill100133_10 = __call100133_38(spill100133_9, "@");
    if (!((life6_12 != 0))) {
        forestValue100133_291_0 = __integerCategory100133_39(spill100133_10);
        break forest_join_291;
    }
    if (!(spill100133_10)) {
        break forest_join_182;
    }
    life11_196 = __call100133_41(__call100133_40(p0, life10_178));
    forest_cycle_147: while (true) {
    forest_join_178: {
    forest_join_177: {
    forest_join_174: {
    if (!(__call100133_42(life11_196))) {
        break forest_join_180;
    }
    life12_205 = __cast100133_44(__call100133_43(life11_196));
    life13_211 = __call100133_47(p0, __call100133_46(__call100133_45(life12_205)));
    spill100133_11 = __call100133_48(life7_7, life13_211);
    if (!((life6_12 != 0))) {
        forestValue100133_126_0 = __integerCategory100133_49(spill100133_11);
        continue forest_cycle_126;
    }
    if (!((life6_12 != 0))) {
        forestValue100133_177_0 = __integerCategory100133_50(spill100133_11);
        break forest_join_177;
    }
    if (!(spill100133_11)) {
        break forest_join_174;
    }
    __call100133_51(life8_9, life13_211);
    if (!((life6_12 == 0))) {
        break forest_join_178;
    }
    }
    forestValue100133_177_0 = __integerCategory100133_53(__call100133_52(life9_11, life13_211));
    }
    __discardScalar100133_54(forestValue100133_177_0);
    }
    if (!((life6_12 == 0))) {
        continue forest_cycle_147;
    }
    break forest_cycle_147;
    }
    }
    if (!((life6_12 == 0))) {
        break forest_join_202;
    }
    }
    forestValue100133_185_0 = __call100133_55(p0, life10_178);
    }
    life11_248 = forestValue100133_185_0;
    spill100133_12 = __call100133_56(life7_7, life11_248);
    if (!((life6_12 != 0))) {
        forestValue100133_201_0 = __integerCategory100133_57(spill100133_12);
        break forest_join_201;
    }
    if (!(spill100133_12)) {
        break forest_join_198;
    }
    __call100133_58(life8_9, life11_248);
    if (!((life6_12 == 0))) {
        break forest_join_202;
    }
    }
    forestValue100133_201_0 = __integerCategory100133_60(__call100133_59(life9_11, life11_248));
    }
    __discardScalar100133_61(forestValue100133_201_0);
    }
    if (!((life6_12 == 0))) {
        break forest_join_205;
    }
    break forest_join_207;
    }
    spill100133_13 = p2;
    forestValue100133_126_0 = spill100133_13;
    continue forest_cycle_126;
    }
    }
    break forest_join_289;
    }
    forest_cycle_208: while (true) {
    forest_join_286: {
    forest_join_285: {
    forest_join_282: {
    forest_join_281: {
    forest_join_278: {
    forest_join_265: {
    forest_join_262: {
    forest_join_260: {
    if (!((forestValue100133_208_0 < forestValue100133_208_1))) {
        break forest_join_289;
    }
    life10_284 = (p1)[(p2++)];
    spill100133_14 = life10_284;
    if (!((life6_12 != 0))) {
        forestValue100133_265_0 = spill100133_14;
        break forest_join_265;
    }
    spill100133_15 = __call100133_62(spill100133_14, "@");
    if (!((life6_12 != 0))) {
        forestValue100133_291_0 = __integerCategory100133_63(spill100133_15);
        break forest_join_291;
    }
    if (!(spill100133_15)) {
        break forest_join_262;
    }
    life11_302 = __call100133_65(__call100133_64(p0, life10_284));
    forest_cycle_227: while (true) {
    forest_join_258: {
    forest_join_257: {
    forest_join_254: {
    if (!(__call100133_66(life11_302))) {
        break forest_join_260;
    }
    life12_311 = __cast100133_68(__call100133_67(life11_302));
    life13_317 = __call100133_71(p0, __call100133_70(__call100133_69(life12_311)));
    spill100133_16 = __call100133_72(life7_7, life13_317);
    if (!((life6_12 != 0))) {
        forestValue100133_286_0 = __integerCategory100133_73(spill100133_16);
        break forest_join_286;
    }
    if (!((life6_12 != 0))) {
        forestValue100133_257_0 = __integerCategory100133_74(spill100133_16);
        break forest_join_257;
    }
    if (!(spill100133_16)) {
        break forest_join_254;
    }
    __call100133_75(life8_9, life13_317);
    if (!((life6_12 == 0))) {
        break forest_join_258;
    }
    }
    forestValue100133_257_0 = __integerCategory100133_77(__call100133_76(life9_11, life13_317));
    }
    __discardScalar100133_78(forestValue100133_257_0);
    }
    if (!((life6_12 == 0))) {
        continue forest_cycle_227;
    }
    break forest_cycle_227;
    }
    }
    if (!((life6_12 == 0))) {
        break forest_join_282;
    }
    }
    forestValue100133_265_0 = __call100133_79(p0, life10_284);
    }
    life11_354 = forestValue100133_265_0;
    spill100133_17 = __call100133_80(life7_7, life11_354);
    if (!((life6_12 != 0))) {
        forestValue100133_281_0 = __integerCategory100133_81(spill100133_17);
        break forest_join_281;
    }
    if (!(spill100133_17)) {
        break forest_join_278;
    }
    __call100133_82(life8_9, life11_354);
    if (!((life6_12 == 0))) {
        break forest_join_282;
    }
    }
    forestValue100133_281_0 = __integerCategory100133_84(__call100133_83(life9_11, life11_354));
    }
    __discardScalar100133_85(forestValue100133_281_0);
    }
    if (!((life6_12 == 0))) {
        break forest_join_285;
    }
    break forest_join_289;
    }
    forestValue100133_286_0 = p2;
    }
    spill100133_18 = (p1).length;
    forestValue100133_208_0 = forestValue100133_286_0;
    forestValue100133_208_1 = spill100133_18;
    continue forest_cycle_208;
    }
    }
    forestValue100133_291_0 = __integerCategory100133_87(__call100133_86(life8_9));
    }
    if (!((life6_12 != 0))) {
        forestValue100133_321_0 = forestValue100133_291_0;
        break forest_join_321;
    }
    if (!((forestValue100133_291_0 == 0))) {
        break forest_join_319;
    }
    __call100133_90(p0, __fieldRead100133_88(), __call100133_89(life8_9));
    spill100133_19 = p0;
    spill100133_20 = receiver;
    spill100133_21 = "commands.scoreboard.teams.leave.success";
    java.lang.Object[] __stackOp100133_91_0 = new java.lang.Object[2];
    spill100133_22 = __stackOp100133_91_0;
    (__stackOp100133_91_0)[0] = __call100133_93(__call100133_92(life8_9));
    java.lang.Object[] __stackOp100133_94_0 = spill100133_22;
    spill100133_23 = __stackOp100133_94_0;
    (__stackOp100133_94_0)[1] = __call100133_96(__call100133_95(life8_9, new java.lang.String[0]));
    __call100133_97(spill100133_19, spill100133_20, spill100133_21, spill100133_23);
    }
    forestValue100133_321_0 = __integerCategory100133_99(__call100133_98(life9_11));
    }
    if (!((forestValue100133_321_0 == 0))) {
        break forest_join_343;
    }
    moom.b7 __stackOp100133_101_0 = __sourceUninitializedNEW100133_100();
    spill100133_24 = __stackOp100133_101_0;
    spill100133_25 = __stackOp100133_101_0;
    spill100133_26 = "commands.scoreboard.teams.leave.failure";
    java.lang.Object[] __stackOp100133_102_0 = new java.lang.Object[2];
    spill100133_27 = __stackOp100133_102_0;
    (__stackOp100133_102_0)[0] = __call100133_104(__call100133_103(life9_11));
    java.lang.Object[] __stackOp100133_105_0 = spill100133_27;
    spill100133_28 = __stackOp100133_105_0;
    (__stackOp100133_105_0)[1] = __call100133_107(__call100133_106(life9_11, new java.lang.String[0]));
    __explicitNewInit100133_108(spill100133_25, spill100133_26, spill100133_28);
    throw spill100133_24;
    }
    return;
}
public static void h100133_0(moom.b7 p0) throws Throwable {
    throw __call13013300_0(p0);
}
public static void h100133_1(moom.b7 p0) throws Throwable {
    throw __call13013301_0(p0);
}
public static void h100133_2(moom.b7 p0) throws Throwable {
    throw __call13013302_0(p0);
}
public static void h100133_3(moom.b7 p0) throws Throwable {
    throw __call13013303_0(p0);
}
public static void h100133_4(moom.b7 p0) throws Throwable {
    throw __call13013304_0(p0);
}
public static void h100133_5(moom.b7 p0) throws Throwable {
    throw __call13013305_0(p0);
}
public static void h100133_6(moom.b7 p0) throws Throwable {
    throw __call13013306_0(p0);
}
public static void h100133_7(moom.b7 p0) throws Throwable {
    throw __call13013307_0(p0);
}
public static void h100133_8(moom.b7 p0) throws Throwable {
    throw __call13013308_0(p0);
}
public static void h100133_9(moom.b7 p0) throws Throwable {
    throw __call13013309_0(p0);
}
public static void h100133_10(moom.b7 p0) throws Throwable {
    throw __call13013310_0(p0);
}
public static void h100133_11(moom.b7 p0) throws Throwable {
    throw __call13013311_0(p0);
}
public static void h100133_12(moom.b7 p0) throws Throwable {
    throw __call13013312_0(p0);
}
public static void h100133_13(moom.b7 p0) throws Throwable {
    throw __call13013313_0(p0);
}
public static void h100133_14(moom.b7 p0) throws Throwable {
    throw __call13013314_0(p0);
}
public static void h100133_15(moom.b7 p0) throws Throwable {
    throw __call13013315_0(p0);
}
public static void h100133_16(moom.b7 p0) throws Throwable {
    throw __call13013316_0(p0);
}
public static void h100133_17(moom.b7 p0) throws Throwable {
    throw __call13013317_0(p0);
}
public static void h100133_18(moom.b7 p0) throws Throwable {
    throw __call13013318_0(p0);
}
private static native long __fieldRead100133_0() throws Throwable;
private static native int __call100133_1() throws Throwable;
private static native net.minecraft.scoreboard.Scoreboard __call100133_2(moom.qy a0) throws Throwable;
private static native java.util.HashSet __call100133_3() throws Throwable;
private static native java.util.HashSet __call100133_4() throws Throwable;
private static native int __instanceOf100133_5(net.minecraft.command.ICommandSender a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __call100133_6(net.minecraft.command.ICommandSender a0) throws Throwable;
private static native java.lang.String __call100133_7(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native boolean __call100133_8(net.minecraft.scoreboard.Scoreboard a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory100133_9(boolean value) throws Throwable;
private static native boolean __call100133_10(java.util.HashSet a0, java.lang.String a1) throws Throwable;
private static native boolean __call100133_11(java.util.HashSet a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory100133_12(boolean value) throws Throwable;
private static native void __discardScalar100133_13(int a0) throws Throwable;
private static native boolean __call100133_14(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory100133_15(boolean value) throws Throwable;
private static native java.util.List __call100133_16(net.minecraft.command.ICommandSender a0, java.lang.String a1) throws Throwable;
private static native java.util.Iterator __call100133_17(java.util.List a0) throws Throwable;
private static native boolean __call100133_18(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call100133_19(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.entity.Entity __cast100133_20(java.lang.Object a0) throws Throwable;
private static native java.util.UUID __call100133_21(net.minecraft.entity.Entity a0) throws Throwable;
private static native java.lang.String __call100133_22(java.util.UUID a0) throws Throwable;
private static native java.lang.String __call100133_23(net.minecraft.command.ICommandSender a0, java.lang.String a1) throws Throwable;
private static native boolean __call100133_24(net.minecraft.scoreboard.Scoreboard a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory100133_25(boolean value) throws Throwable;
private static native int __integerCategory100133_26(boolean value) throws Throwable;
private static native boolean __call100133_27(java.util.HashSet a0, java.lang.String a1) throws Throwable;
private static native boolean __call100133_28(java.util.HashSet a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory100133_29(boolean value) throws Throwable;
private static native void __discardScalar100133_30(int a0) throws Throwable;
private static native java.lang.String __call100133_31(net.minecraft.command.ICommandSender a0, java.lang.String a1) throws Throwable;
private static native boolean __call100133_32(net.minecraft.scoreboard.Scoreboard a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory100133_33(boolean value) throws Throwable;
private static native boolean __call100133_34(java.util.HashSet a0, java.lang.String a1) throws Throwable;
private static native boolean __call100133_35(java.util.HashSet a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory100133_36(boolean value) throws Throwable;
private static native void __discardScalar100133_37(int a0) throws Throwable;
private static native boolean __call100133_38(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory100133_39(boolean value) throws Throwable;
private static native java.util.List __call100133_40(net.minecraft.command.ICommandSender a0, java.lang.String a1) throws Throwable;
private static native java.util.Iterator __call100133_41(java.util.List a0) throws Throwable;
private static native boolean __call100133_42(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call100133_43(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.entity.Entity __cast100133_44(java.lang.Object a0) throws Throwable;
private static native java.util.UUID __call100133_45(net.minecraft.entity.Entity a0) throws Throwable;
private static native java.lang.String __call100133_46(java.util.UUID a0) throws Throwable;
private static native java.lang.String __call100133_47(net.minecraft.command.ICommandSender a0, java.lang.String a1) throws Throwable;
private static native boolean __call100133_48(net.minecraft.scoreboard.Scoreboard a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory100133_49(boolean value) throws Throwable;
private static native int __integerCategory100133_50(boolean value) throws Throwable;
private static native boolean __call100133_51(java.util.HashSet a0, java.lang.String a1) throws Throwable;
private static native boolean __call100133_52(java.util.HashSet a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory100133_53(boolean value) throws Throwable;
private static native void __discardScalar100133_54(int a0) throws Throwable;
private static native java.lang.String __call100133_55(net.minecraft.command.ICommandSender a0, java.lang.String a1) throws Throwable;
private static native boolean __call100133_56(net.minecraft.scoreboard.Scoreboard a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory100133_57(boolean value) throws Throwable;
private static native boolean __call100133_58(java.util.HashSet a0, java.lang.String a1) throws Throwable;
private static native boolean __call100133_59(java.util.HashSet a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory100133_60(boolean value) throws Throwable;
private static native void __discardScalar100133_61(int a0) throws Throwable;
private static native boolean __call100133_62(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory100133_63(boolean value) throws Throwable;
private static native java.util.List __call100133_64(net.minecraft.command.ICommandSender a0, java.lang.String a1) throws Throwable;
private static native java.util.Iterator __call100133_65(java.util.List a0) throws Throwable;
private static native boolean __call100133_66(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call100133_67(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.entity.Entity __cast100133_68(java.lang.Object a0) throws Throwable;
private static native java.util.UUID __call100133_69(net.minecraft.entity.Entity a0) throws Throwable;
private static native java.lang.String __call100133_70(java.util.UUID a0) throws Throwable;
private static native java.lang.String __call100133_71(net.minecraft.command.ICommandSender a0, java.lang.String a1) throws Throwable;
private static native boolean __call100133_72(net.minecraft.scoreboard.Scoreboard a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory100133_73(boolean value) throws Throwable;
private static native int __integerCategory100133_74(boolean value) throws Throwable;
private static native boolean __call100133_75(java.util.HashSet a0, java.lang.String a1) throws Throwable;
private static native boolean __call100133_76(java.util.HashSet a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory100133_77(boolean value) throws Throwable;
private static native void __discardScalar100133_78(int a0) throws Throwable;
private static native java.lang.String __call100133_79(net.minecraft.command.ICommandSender a0, java.lang.String a1) throws Throwable;
private static native boolean __call100133_80(net.minecraft.scoreboard.Scoreboard a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory100133_81(boolean value) throws Throwable;
private static native boolean __call100133_82(java.util.HashSet a0, java.lang.String a1) throws Throwable;
private static native boolean __call100133_83(java.util.HashSet a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory100133_84(boolean value) throws Throwable;
private static native void __discardScalar100133_85(int a0) throws Throwable;
private static native boolean __call100133_86(java.util.HashSet a0) throws Throwable;
private static native int __integerCategory100133_87(boolean value) throws Throwable;
private static native net.minecraft.command.CommandResultStats$Type __fieldRead100133_88() throws Throwable;
private static native int __call100133_89(java.util.HashSet a0) throws Throwable;
private static native void __call100133_90(net.minecraft.command.ICommandSender a0, net.minecraft.command.CommandResultStats$Type a1, int a2) throws Throwable;
private static native int __call100133_92(java.util.HashSet a0) throws Throwable;
private static native java.lang.Integer __call100133_93(int a0) throws Throwable;
private static native java.lang.Object[] __call100133_95(java.util.HashSet a0, java.lang.String[] a1) throws Throwable;
private static native java.lang.String __call100133_96(java.lang.Object[] a0) throws Throwable;
private static native void __call100133_97(net.minecraft.command.ICommandSender a0, moom.qy a1, java.lang.String a2, java.lang.Object[] a3) throws Throwable;
private static native boolean __call100133_98(java.util.HashSet a0) throws Throwable;
private static native int __integerCategory100133_99(boolean value) throws Throwable;
private static native moom.b7 __sourceUninitializedNEW100133_100() throws Throwable;
private static native int __call100133_103(java.util.HashSet a0) throws Throwable;
private static native java.lang.Integer __call100133_104(int a0) throws Throwable;
private static native java.lang.Object[] __call100133_106(java.util.HashSet a0, java.lang.String[] a1) throws Throwable;
private static native java.lang.String __call100133_107(java.lang.Object[] a0) throws Throwable;
private static native void __explicitNewInit100133_108(moom.b7 a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native java.lang.Exception __call13013300_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013301_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013302_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013303_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013304_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013305_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013306_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013307_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013308_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013309_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013310_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013311_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013312_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013313_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013314_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013315_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013316_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013317_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013318_0(moom.b7 a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_bac8fc9daa0150dd8d98(moom.qy a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2, int a3) throws E;
private static final class __SourceHandler_bac8fc9daa0150dd8d98 {

public static void f1217(moom.qy receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1, int p2) throws Throwable {
    moom.Bk lexicalValue1217_20_0;
    java.util.ArrayList lexicalValue1217_46_0;
    int spill1217_0;
    moom.Bk spill1217_1;
    java.util.ArrayList spill1217_2;
    long life4_3;
    net.minecraft.scoreboard.Scoreboard life7_7;
    moom.Bk life8_13;
    int life6_14;
    java.util.ArrayList life9_25;
    java.util.Iterator life10_55;
    java.lang.String life11_62;
    lexical_join_80: {
    lexical_join_63: {
    lexical_join_46: {
    lexical_join_45: {
    lexical_join_20: {
    life4_3 = (__fieldRead1217_0() ^ 14470445932862L);
    spill1217_0 = __call1217_1();
    life7_7 = __call1217_2(receiver);
    life8_13 = __call1217_3(receiver, (p1)[p2]);
    life6_14 = spill1217_0;
    spill1217_1 = life8_13;
    if (!((life6_14 != 0))) {
        lexicalValue1217_20_0 = spill1217_1;
        break lexical_join_20;
    }
    if (!((spill1217_1 != null))) {
        break lexical_join_80;
    }
    lexicalValue1217_20_0 = life8_13;
    }
    life9_25 = __call1217_5(__call1217_4(lexicalValue1217_20_0));
    __call1217_8(p0, __fieldRead1217_6(), __call1217_7(life9_25));
    spill1217_2 = life9_25;
    if (!((life6_14 != 0))) {
        lexicalValue1217_46_0 = spill1217_2;
        break lexical_join_46;
    }
    if (!(__call1217_9(spill1217_2))) {
        break lexical_join_45;
    }
    throw new moom.b7("commands.scoreboard.teams.empty.alreadyEmpty", new java.lang.Object[] {__call1217_10(life8_13)});
    }
    lexicalValue1217_46_0 = life9_25;
    }
    life10_55 = __call1217_11(lexicalValue1217_46_0);
    lexical_cycle_48: while (true) {
    if (!(__call1217_12(life10_55))) {
        break lexical_join_63;
    }
    life11_62 = __cast1217_14(__call1217_13(life10_55));
    __call1217_15(life7_7, life11_62, life8_13);
    if (!((life6_14 != 0))) {
        break lexical_join_80;
    }
    if (!((life6_14 == 0))) { continue lexical_cycle_48; }
    break lexical_cycle_48;
    }
    }
    __call1217_19(p0, receiver, "commands.scoreboard.teams.empty.success", new java.lang.Object[] {__call1217_17(__call1217_16(life9_25)), __call1217_18(life8_13)});
    }
    return;
}
public static void h1217_0(moom.b7 p0) throws Throwable {
    throw __call1121700_0(p0);
}
public static void h1217_1(moom.b7 p0) throws Throwable {
    throw __call1121701_0(p0);
}
public static void h1217_2(moom.b7 p0) throws Throwable {
    throw __call1121702_0(p0);
}
public static void h1217_3(moom.b7 p0) throws Throwable {
    throw __call1121703_0(p0);
}
private static native long __fieldRead1217_0() throws Throwable;
private static native int __call1217_1() throws Throwable;
private static native net.minecraft.scoreboard.Scoreboard __call1217_2(moom.qy a0) throws Throwable;
private static native moom.Bk __call1217_3(moom.qy a0, java.lang.String a1) throws Throwable;
private static native java.util.Collection __call1217_4(moom.Bk a0) throws Throwable;
private static native java.util.ArrayList __call1217_5(java.util.Collection a0) throws Throwable;
private static native net.minecraft.command.CommandResultStats$Type __fieldRead1217_6() throws Throwable;
private static native int __call1217_7(java.util.ArrayList a0) throws Throwable;
private static native void __call1217_8(net.minecraft.command.ICommandSender a0, net.minecraft.command.CommandResultStats$Type a1, int a2) throws Throwable;
private static native boolean __call1217_9(java.util.ArrayList a0) throws Throwable;
private static native java.lang.String __call1217_10(moom.Bk a0) throws Throwable;
private static native java.util.Iterator __call1217_11(java.util.ArrayList a0) throws Throwable;
private static native boolean __call1217_12(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1217_13(java.util.Iterator a0) throws Throwable;
private static native java.lang.String __cast1217_14(java.lang.Object a0) throws Throwable;
private static native void __call1217_15(net.minecraft.scoreboard.Scoreboard a0, java.lang.String a1, moom.Bk a2) throws Throwable;
private static native int __call1217_16(java.util.ArrayList a0) throws Throwable;
private static native java.lang.Integer __call1217_17(int a0) throws Throwable;
private static native java.lang.String __call1217_18(moom.Bk a0) throws Throwable;
private static native void __call1217_19(net.minecraft.command.ICommandSender a0, moom.qy a1, java.lang.String a2, java.lang.Object[] a3) throws Throwable;
private static native java.lang.Exception __call1121700_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1121701_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1121702_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1121703_0(moom.b7 a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_ce64ed53c4ce0a519bc3(moom.qy a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2, int a3) throws E;
private static final class __SourceHandler_ce64ed53c4ce0a519bc3 {

public static void f58(moom.qy receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1, int p2) throws Throwable {
    long life4_3;
    net.minecraft.scoreboard.Scoreboard life7_7;
    java.lang.String life8_12;
    int life6_13;
    int life9_16;
    net.minecraft.scoreboard.ScoreObjective life10_18;
    forward_join_80: {
    forward_join_69: {
    forward_join_67: {
    forward_join_43: {
    forward_join_30: {
    life4_3 = (__fieldRead58_0() ^ 130492176962724L);
    int spill58_0 = __call58_1();
    life7_7 = __call58_2(receiver);
    life8_12 = (p1)[(p2++)];
    life6_13 = spill58_0;
    life9_16 = __call58_3(life8_12);
    life10_18 = null;
    if (!(((p1).length == 4))) { break forward_join_30; }
    life10_18 = __call58_4(receiver, (p1)[p2], 0);
    }
    if (!((life9_16 < 0))) { break forward_join_43; }
    throw new moom.b7("commands.scoreboard.objectives.setdisplay.invalidSlot", new java.lang.Object[] {life8_12});
    }
    __call58_5(life7_7, life9_16, life10_18);
    if (!((life6_13 != 0))) { break forward_join_67; }
    if (!((life10_18 != null))) { break forward_join_69; }
    __call58_8(p0, receiver, "commands.scoreboard.objectives.setdisplay.successSet", new java.lang.Object[] {__call58_6(life9_16), __call58_7(life10_18)});
    }
    if (!((life6_13 == 0))) { break forward_join_80; }
    }
    __call58_10(p0, receiver, "commands.scoreboard.objectives.setdisplay.successCleared", new java.lang.Object[] {__call58_9(life9_16)});
    }
    return;
}
public static void h58_0(moom.b7 p0) throws Throwable {
    throw __call3005800_0(p0);
}
public static void h58_1(moom.b7 p0) throws Throwable {
    throw __call3005801_0(p0);
}
public static void h58_2(moom.b7 p0) throws Throwable {
    throw __call3005802_0(p0);
}
public static void h58_3(moom.b7 p0) throws Throwable {
    throw __call3005803_0(p0);
}
private static native long __fieldRead58_0() throws Throwable;
private static native int __call58_1() throws Throwable;
private static native net.minecraft.scoreboard.Scoreboard __call58_2(moom.qy a0) throws Throwable;
private static native int __call58_3(java.lang.String a0) throws Throwable;
private static native net.minecraft.scoreboard.ScoreObjective __call58_4(moom.qy a0, java.lang.String a1, int a2) throws Throwable;
private static native void __call58_5(net.minecraft.scoreboard.Scoreboard a0, int a1, net.minecraft.scoreboard.ScoreObjective a2) throws Throwable;
private static native java.lang.String __call58_6(int a0) throws Throwable;
private static native java.lang.String __call58_7(net.minecraft.scoreboard.ScoreObjective a0) throws Throwable;
private static native void __call58_8(net.minecraft.command.ICommandSender a0, moom.qy a1, java.lang.String a2, java.lang.Object[] a3) throws Throwable;
private static native java.lang.String __call58_9(int a0) throws Throwable;
private static native void __call58_10(net.minecraft.command.ICommandSender a0, moom.qy a1, java.lang.String a2, java.lang.Object[] a3) throws Throwable;
private static native java.lang.Exception __call3005800_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3005801_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3005802_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3005803_0(moom.b7 a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_68f42a7a30a10e6f827b(moom.qy a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2, int a3) throws E;
private static final class __SourceHandler_68f42a7a30a10e6f827b {

public static void f1218(moom.qy receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1, int p2) throws Throwable {
    int spill1218_0;
    long life4_3;
    net.minecraft.scoreboard.Scoreboard life7_7;
    int life6_8;
    java.lang.String life8_18;
    java.util.Map life9_22;
    moom.CN life10_60;
    java.util.Iterator life11_72;
    net.minecraft.scoreboard.Score life12_79;
    java.util.Collection life8_117;
    moom.CN life9_147;
    lexical_join_157: {
    lexical_join_128: {
    lexical_join_110: {
    lexical_join_108: {
    lexical_join_42: {
    life4_3 = (__fieldRead1218_0() ^ 136287734458594L);
    spill1218_0 = __call1218_1();
    life7_7 = __call1218_2(receiver);
    life6_8 = spill1218_0;
    if (!(((p1).length > p2))) {
        break lexical_join_110;
    }
    life8_18 = __call1218_3(p0, (p1)[p2]);
    life9_22 = __call1218_4(life7_7, life8_18);
    __call1218_7(p0, __fieldRead1218_5(), __call1218_6(life9_22));
    if (!((__call1218_8(life9_22) == 0))) {
        break lexical_join_42;
    }
    throw new moom.b7("commands.scoreboard.players.list.player.empty", new java.lang.Object[] {life8_18});
    }
    life10_60 = new moom.CN("commands.scoreboard.players.list.player.count", new java.lang.Object[] {__call1218_10(__call1218_9(life9_22)), life8_18});
    __call1218_13(__call1218_11(life10_60), __fieldRead1218_12());
    __call1218_14(p0, life10_60);
    life11_72 = __call1218_16(__call1218_15(life9_22));
    lexical_cycle_71: while (true) {
    if (!(__call1218_17(life11_72))) {
        break lexical_join_108;
    }
    life12_79 = __cast1218_19(__call1218_18(life11_72));
    __call1218_26(p0, new moom.CN("commands.scoreboard.players.list.player.entry", new java.lang.Object[] {__call1218_21(__call1218_20(life12_79)), __call1218_23(__call1218_22(life12_79)), __call1218_25(__call1218_24(life12_79))}));
    if (!((life6_8 != 0))) {
        break lexical_join_157;
    }
    if (!((life6_8 == 0))) { continue lexical_cycle_71; }
    break lexical_cycle_71;
    }
    }
    if (!((life6_8 == 0))) {
        break lexical_join_157;
    }
    }
    life8_117 = __call1218_27(life7_7);
    __call1218_30(p0, __fieldRead1218_28(), __call1218_29(life8_117));
    if (!((__call1218_31(life8_117) == 0))) {
        break lexical_join_128;
    }
    throw new moom.b7("commands.scoreboard.players.list.empty", new java.lang.Object[0]);
    }
    life9_147 = new moom.CN("commands.scoreboard.players.list.count", new java.lang.Object[] {__call1218_33(__call1218_32(life8_117))});
    __call1218_36(__call1218_34(life9_147), __fieldRead1218_35());
    __call1218_37(p0, life9_147);
    __call1218_40(p0, new moom.CM(__call1218_39(__call1218_38(life8_117))));
    }
    return;
}
public static void h1218_0(moom.b7 p0) throws Throwable {
    throw __call1121800_0(p0);
}
public static void h1218_1(moom.b7 p0) throws Throwable {
    throw __call1121801_0(p0);
}
public static void h1218_2(moom.b7 p0) throws Throwable {
    throw __call1121802_0(p0);
}
private static native long __fieldRead1218_0() throws Throwable;
private static native int __call1218_1() throws Throwable;
private static native net.minecraft.scoreboard.Scoreboard __call1218_2(moom.qy a0) throws Throwable;
private static native java.lang.String __call1218_3(net.minecraft.command.ICommandSender a0, java.lang.String a1) throws Throwable;
private static native java.util.Map __call1218_4(net.minecraft.scoreboard.Scoreboard a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.command.CommandResultStats$Type __fieldRead1218_5() throws Throwable;
private static native int __call1218_6(java.util.Map a0) throws Throwable;
private static native void __call1218_7(net.minecraft.command.ICommandSender a0, net.minecraft.command.CommandResultStats$Type a1, int a2) throws Throwable;
private static native int __call1218_8(java.util.Map a0) throws Throwable;
private static native int __call1218_9(java.util.Map a0) throws Throwable;
private static native java.lang.Integer __call1218_10(int a0) throws Throwable;
private static native moom.CO __call1218_11(moom.CN a0) throws Throwable;
private static native net.minecraft.util.EnumChatFormatting __fieldRead1218_12() throws Throwable;
private static native moom.CO __call1218_13(moom.CO a0, net.minecraft.util.EnumChatFormatting a1) throws Throwable;
private static native void __call1218_14(net.minecraft.command.ICommandSender a0, moom.CN a1) throws Throwable;
private static native java.util.Collection __call1218_15(java.util.Map a0) throws Throwable;
private static native java.util.Iterator __call1218_16(java.util.Collection a0) throws Throwable;
private static native boolean __call1218_17(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1218_18(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.scoreboard.Score __cast1218_19(java.lang.Object a0) throws Throwable;
private static native int __call1218_20(net.minecraft.scoreboard.Score a0) throws Throwable;
private static native java.lang.Integer __call1218_21(int a0) throws Throwable;
private static native net.minecraft.scoreboard.ScoreObjective __call1218_22(net.minecraft.scoreboard.Score a0) throws Throwable;
private static native java.lang.String __call1218_23(net.minecraft.scoreboard.ScoreObjective a0) throws Throwable;
private static native net.minecraft.scoreboard.ScoreObjective __call1218_24(net.minecraft.scoreboard.Score a0) throws Throwable;
private static native java.lang.String __call1218_25(net.minecraft.scoreboard.ScoreObjective a0) throws Throwable;
private static native void __call1218_26(net.minecraft.command.ICommandSender a0, moom.CN a1) throws Throwable;
private static native java.util.Collection __call1218_27(net.minecraft.scoreboard.Scoreboard a0) throws Throwable;
private static native net.minecraft.command.CommandResultStats$Type __fieldRead1218_28() throws Throwable;
private static native int __call1218_29(java.util.Collection a0) throws Throwable;
private static native void __call1218_30(net.minecraft.command.ICommandSender a0, net.minecraft.command.CommandResultStats$Type a1, int a2) throws Throwable;
private static native int __call1218_31(java.util.Collection a0) throws Throwable;
private static native int __call1218_32(java.util.Collection a0) throws Throwable;
private static native java.lang.Integer __call1218_33(int a0) throws Throwable;
private static native moom.CO __call1218_34(moom.CN a0) throws Throwable;
private static native net.minecraft.util.EnumChatFormatting __fieldRead1218_35() throws Throwable;
private static native moom.CO __call1218_36(moom.CO a0, net.minecraft.util.EnumChatFormatting a1) throws Throwable;
private static native void __call1218_37(net.minecraft.command.ICommandSender a0, moom.CN a1) throws Throwable;
private static native java.lang.Object[] __call1218_38(java.util.Collection a0) throws Throwable;
private static native java.lang.String __call1218_39(java.lang.Object[] a0) throws Throwable;
private static native void __call1218_40(net.minecraft.command.ICommandSender a0, moom.CM a1) throws Throwable;
private static native java.lang.Exception __call1121800_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1121801_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1121802_0(moom.b7 a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_b7214a62750f62b929d0(moom.qy a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2, int a3) throws E;
private static final class __SourceHandler_b7214a62750f62b929d0 {

public static void f154(moom.qy receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1, int p2) throws Throwable {
    java.lang.String forwardValue154_73_0;
    int forwardValue154_75_0;
    int forwardValue154_136_0;
    int spill154_0;
    java.lang.String spill154_1;
    boolean spill154_2;
    long life4_3;
    java.lang.String life7_10;
    int life8_12;
    java.lang.String life9_19;
    int life6_20;
    net.minecraft.scoreboard.ScoreObjective life10_58;
    int life11_82;
    net.minecraft.entity.Entity life12_92;
    net.minecraft.nbt.NBTTagCompound life13_97;
    net.minecraft.nbt.NBTTagCompound life14_101;
    net.minecraft.scoreboard.Scoreboard life12_139;
    net.minecraft.scoreboard.Score life13_144;
    forward_join_145: {
    forward_join_142: {
    forward_join_136: {
    forward_join_133: {
    forward_join_114: {
    forward_join_75: {
    forward_join_73: {
    forward_join_69: {
    forward_join_49: {
    life4_3 = (__fieldRead154_0() ^ 2138993388733L);
    spill154_0 = __call154_1();
    life7_10 = (p1)[(p2 - 1)];
    life8_12 = p2;
    life9_19 = __call154_2(p0, (p1)[(p2++)]);
    life6_20 = spill154_0;
    if (!((__call154_3(life9_19) > __invokedynamic154_4(4851, (7546451319967872007L ^ life4_3))))) {
        break forward_join_49;
    }
    throw new moom.cb("commands.scoreboard.players.name.tooLong", new java.lang.Object[] {life9_19, __call154_6(__invokedynamic154_5(31358, (1351271672645491845L ^ life4_3)))});
    }
    life10_58 = __call154_7(receiver, (p1)[(p2++)], 1);
    spill154_1 = life7_10;
    if (!((life6_20 == 0))) {
        forwardValue154_73_0 = spill154_1;
        break forward_join_73;
    }
    if (!(__call154_8(spill154_1, "set"))) {
        break forward_join_69;
    }
    forwardValue154_75_0 = __call154_9((p1)[(p2++)]);
    break forward_join_75;
    }
    forwardValue154_73_0 = (p1)[(p2++)];
    }
    forwardValue154_75_0 = __call154_10(forwardValue154_73_0, 0);
    }
    life11_82 = forwardValue154_75_0;
    if (!(((p1).length > p2))) {
        break forward_join_114;
    }
    life12_92 = __call154_11(p0, (p1)[life8_12]);
    life13_97 = __call154_13(__call154_12(p1, p2));
    life14_101 = new net.minecraft.nbt.NBTTagCompound();
    __call154_14(life12_92, life14_101);
    if (!((!__call154_15(life13_97, life14_101, 1)))) {
        break forward_join_114;
    }
    throw new moom.b7("commands.scoreboard.players.set.tagMismatch", new java.lang.Object[] {life9_19});
    }
    life12_139 = __call154_16(receiver);
    life13_144 = __call154_17(life12_139, life9_19, life10_58);
    spill154_2 = __call154_18(life7_10, "set");
    if (!((life6_20 == 0))) {
        forwardValue154_136_0 = __integerCategory154_19(spill154_2);
        break forward_join_136;
    }
    if (!(spill154_2)) {
        break forward_join_133;
    }
    __call154_20(life13_144, life11_82);
    if (!((life6_20 != 0))) {
        break forward_join_145;
    }
    }
    forwardValue154_136_0 = __integerCategory154_22(__call154_21(life7_10, "add"));
    }
    if (!((forwardValue154_136_0 != 0))) {
        break forward_join_142;
    }
    __call154_23(life13_144, life11_82);
    if (!((life6_20 != 0))) {
        break forward_join_145;
    }
    }
    __call154_24(life13_144, life11_82);
    }
    __call154_28(p0, receiver, "commands.scoreboard.players.set.success", new java.lang.Object[] {__call154_25(life10_58), life9_19, __call154_27(__call154_26(life13_144))});
    return;
}
public static void h154_0(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3015400_0(p0);
}
public static void h154_1(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3015401_0(p0);
}
public static void h154_2(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3015402_0(p0);
}
public static void h154_3(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3015403_0(p0);
}
public static void h154_4(net.minecraft.nbt.NBTException p0) throws Throwable {
    net.minecraft.nbt.NBTException life1_2;
    life1_2 = p0;
    throw new moom.b7("commands.scoreboard.players.set.tagError", new java.lang.Object[] {__call3015404_0(life1_2)});
}
public static void h154_5(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3015405_0(p0);
}
public static void h154_6(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3015406_0(p0);
}
public static void h154_7(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3015407_0(p0);
}
public static void h154_8(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3015408_0(p0);
}
public static void h154_9(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3015409_0(p0);
}
private static native long __fieldRead154_0() throws Throwable;
private static native int __call154_1() throws Throwable;
private static native java.lang.String __call154_2(net.minecraft.command.ICommandSender a0, java.lang.String a1) throws Throwable;
private static native int __call154_3(java.lang.String a0) throws Throwable;
private static native int __invokedynamic154_4(int a0, long a1) throws Throwable;
private static native int __invokedynamic154_5(int a0, long a1) throws Throwable;
private static native java.lang.Integer __call154_6(int a0) throws Throwable;
private static native net.minecraft.scoreboard.ScoreObjective __call154_7(moom.qy a0, java.lang.String a1, int a2) throws Throwable;
private static native boolean __call154_8(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __call154_9(java.lang.String a0) throws Throwable;
private static native int __call154_10(java.lang.String a0, int a1) throws Throwable;
private static native net.minecraft.entity.Entity __call154_11(net.minecraft.command.ICommandSender a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call154_12(java.lang.String[] a0, int a1) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call154_13(java.lang.String a0) throws Throwable;
private static native void __call154_14(net.minecraft.entity.Entity a0, net.minecraft.nbt.NBTTagCompound a1) throws Throwable;
private static native boolean __call154_15(net.minecraft.nbt.NBTTagCompound a0, net.minecraft.nbt.NBTTagCompound a1, int a2) throws Throwable;
private static native net.minecraft.scoreboard.Scoreboard __call154_16(moom.qy a0) throws Throwable;
private static native net.minecraft.scoreboard.Score __call154_17(net.minecraft.scoreboard.Scoreboard a0, java.lang.String a1, net.minecraft.scoreboard.ScoreObjective a2) throws Throwable;
private static native boolean __call154_18(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory154_19(boolean value) throws Throwable;
private static native void __call154_20(net.minecraft.scoreboard.Score a0, int a1) throws Throwable;
private static native boolean __call154_21(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory154_22(boolean value) throws Throwable;
private static native void __call154_23(net.minecraft.scoreboard.Score a0, int a1) throws Throwable;
private static native void __call154_24(net.minecraft.scoreboard.Score a0, int a1) throws Throwable;
private static native java.lang.String __call154_25(net.minecraft.scoreboard.ScoreObjective a0) throws Throwable;
private static native int __call154_26(net.minecraft.scoreboard.Score a0) throws Throwable;
private static native java.lang.Integer __call154_27(int a0) throws Throwable;
private static native void __call154_28(net.minecraft.command.ICommandSender a0, moom.qy a1, java.lang.String a2, java.lang.Object[] a3) throws Throwable;
private static native java.lang.Exception __call3015400_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3015401_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3015402_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3015403_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.String __call3015404_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3015405_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3015406_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3015407_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3015408_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3015409_0(net.minecraft.nbt.NBTException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_d4e95670ac4c2156357e(moom.qy a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2, int a3) throws E;
private static final class __SourceHandler_d4e95670ac4c2156357e {

public static void f435(moom.qy receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1, int p2) throws Throwable {
    long life4_3;
    net.minecraft.scoreboard.Scoreboard life7_6;
    java.lang.String life8_14;
    int life6_15;
    net.minecraft.scoreboard.ScoreObjective life9_32;
    forward_join_65: {
    forward_join_55: {
    forward_join_51: {
    life4_3 = (__fieldRead435_0() ^ 132979003910178L);
    life7_6 = __call435_1(receiver);
    int spill435_0 = __call435_2();
    life8_14 = __call435_3(p0, (p1)[(p2++)]);
    life6_15 = spill435_0;
    if (!((life6_15 != 0))) { break forward_join_55; }
    if (!(((p1).length > p2))) { break forward_join_51; }
    life9_32 = __call435_4(receiver, (p1)[(p2++)], 0);
    __call435_5(life7_6, life8_14, life9_32);
    net.minecraft.command.ICommandSender spill435_1 = p0;
    moom.qy spill435_2 = receiver;
    java.lang.String spill435_3 = "commands.scoreboard.players.resetscore.success";
    java.lang.Object[] __stackOp435_6_0 = new java.lang.Object[2];
    java.lang.Object[] spill435_4 = __stackOp435_6_0;
    (__stackOp435_6_0)[0] = __call435_7(life9_32);
    java.lang.Object[] __stackOp435_8_0 = spill435_4;
    java.lang.Object[] spill435_5 = __stackOp435_8_0;
    (__stackOp435_8_0)[1] = life8_14;
    __call435_9(spill435_1, spill435_2, spill435_3, spill435_5);
    if (!((life6_15 == 0))) { break forward_join_65; }
    }
    __call435_10(life7_6, life8_14, null);
    }
    net.minecraft.command.ICommandSender spill435_6 = p0;
    moom.qy spill435_7 = receiver;
    java.lang.String spill435_8 = "commands.scoreboard.players.reset.success";
    java.lang.Object[] __stackOp435_11_0 = new java.lang.Object[1];
    java.lang.Object[] spill435_9 = __stackOp435_11_0;
    (__stackOp435_11_0)[0] = life8_14;
    __call435_12(spill435_6, spill435_7, spill435_8, spill435_9);
    }
    return;
}
public static void h435_0(moom.b7 p0) throws Throwable {
    throw __call2043500_0(p0);
}
public static void h435_1(moom.b7 p0) throws Throwable {
    throw __call2043501_0(p0);
}
private static native long __fieldRead435_0() throws Throwable;
private static native net.minecraft.scoreboard.Scoreboard __call435_1(moom.qy a0) throws Throwable;
private static native int __call435_2() throws Throwable;
private static native java.lang.String __call435_3(net.minecraft.command.ICommandSender a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.scoreboard.ScoreObjective __call435_4(moom.qy a0, java.lang.String a1, int a2) throws Throwable;
private static native void __call435_5(net.minecraft.scoreboard.Scoreboard a0, java.lang.String a1, net.minecraft.scoreboard.ScoreObjective a2) throws Throwable;
private static native java.lang.String __call435_7(net.minecraft.scoreboard.ScoreObjective a0) throws Throwable;
private static native void __call435_9(net.minecraft.command.ICommandSender a0, moom.qy a1, java.lang.String a2, java.lang.Object[] a3) throws Throwable;
private static native void __call435_10(net.minecraft.scoreboard.Scoreboard a0, java.lang.String a1, java.lang.Object a2) throws Throwable;
private static native void __call435_12(net.minecraft.command.ICommandSender a0, moom.qy a1, java.lang.String a2, java.lang.Object[] a3) throws Throwable;
private static native java.lang.Exception __call2043500_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call2043501_0(moom.b7 a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_fe88faa8ef9ee1c7423f(moom.qy a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2, int a3) throws E;
private static final class __SourceHandler_fe88faa8ef9ee1c7423f {

public static void f63(moom.qy receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1, int p2) throws Throwable {
    long life4_3;
    net.minecraft.scoreboard.Scoreboard life6_6;
    java.lang.String life7_13;
    net.minecraft.scoreboard.ScoreObjective life8_50;
    net.minecraft.scoreboard.Score life9_73;
    life4_3 = (__fieldRead63_0() ^ 51548496257707L);
    life6_6 = __call63_1(receiver);
    life7_13 = __call63_2(p0, (p1)[(p2++)]);
    if ((__call63_3(life7_13) > __invokedynamic63_4(31358, (1351222263678702227L ^ life4_3)))) {
        throw new moom.cb("commands.scoreboard.players.name.tooLong", new java.lang.Object[] {life7_13, __call63_6(__invokedynamic63_5(31358, (1351222263678702227L ^ life4_3)))});
    }
    life8_50 = __call63_7(receiver, (p1)[p2], 0);
    if ((__call63_8(life8_50) != __fieldRead63_9())) {
        throw new moom.b7("commands.scoreboard.players.enable.noTrigger", new java.lang.Object[] {__call63_10(life8_50)});
    }
    life9_73 = __call63_11(life6_6, life7_13, life8_50);
    __call63_12(life9_73, 0);
    __call63_14(p0, receiver, "commands.scoreboard.players.enable.success", new java.lang.Object[] {__call63_13(life8_50), life7_13});
    return;
}
public static void h63_0(moom.b7 p0) throws Throwable {
    throw __call3006300_0(p0);
}
public static void h63_1(moom.b7 p0) throws Throwable {
    throw __call3006301_0(p0);
}
private static native long __fieldRead63_0() throws Throwable;
private static native net.minecraft.scoreboard.Scoreboard __call63_1(moom.qy a0) throws Throwable;
private static native java.lang.String __call63_2(net.minecraft.command.ICommandSender a0, java.lang.String a1) throws Throwable;
private static native int __call63_3(java.lang.String a0) throws Throwable;
private static native int __invokedynamic63_4(int a0, long a1) throws Throwable;
private static native int __invokedynamic63_5(int a0, long a1) throws Throwable;
private static native java.lang.Integer __call63_6(int a0) throws Throwable;
private static native net.minecraft.scoreboard.ScoreObjective __call63_7(moom.qy a0, java.lang.String a1, int a2) throws Throwable;
private static native net.minecraft.scoreboard.IScoreObjectiveCriteria __call63_8(net.minecraft.scoreboard.ScoreObjective a0) throws Throwable;
private static native net.minecraft.scoreboard.IScoreObjectiveCriteria __fieldRead63_9() throws Throwable;
private static native java.lang.String __call63_10(net.minecraft.scoreboard.ScoreObjective a0) throws Throwable;
private static native net.minecraft.scoreboard.Score __call63_11(net.minecraft.scoreboard.Scoreboard a0, java.lang.String a1, net.minecraft.scoreboard.ScoreObjective a2) throws Throwable;
private static native void __call63_12(net.minecraft.scoreboard.Score a0, int a1) throws Throwable;
private static native java.lang.String __call63_13(net.minecraft.scoreboard.ScoreObjective a0) throws Throwable;
private static native void __call63_14(net.minecraft.command.ICommandSender a0, moom.qy a1, java.lang.String a2, java.lang.Object[] a3) throws Throwable;
private static native java.lang.Exception __call3006300_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3006301_0(moom.b7 a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_068bd3d0a77e3f8d6665(moom.qy a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2, int a3) throws E;
private static final class __SourceHandler_068bd3d0a77e3f8d6665 {

public static void f61(moom.qy receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1, int p2) throws Throwable {
    int forwardValue61_82_0;
    java.lang.String forwardValue61_92_0;
    int forwardValue61_93_0;
    int forwardValue61_106_0;
    int forwardValue61_114_0;
    int forwardValue61_120_0;
    int forwardValue61_135_0;
    int forwardValue61_135_1;
    int spill61_0;
    boolean spill61_1;
    java.lang.String spill61_2;
    int spill61_3;
    int spill61_4;
    int spill61_5;
    long life4_3;
    net.minecraft.scoreboard.Scoreboard life7_7;
    java.lang.String life8_14;
    int life6_15;
    net.minecraft.scoreboard.ScoreObjective life9_53;
    int life10_105;
    int life11_144;
    net.minecraft.scoreboard.Score life12_149;
    forward_join_188: {
    forward_join_183: {
    forward_join_160: {
    forward_join_135: {
    forward_join_120: {
    forward_join_115: {
    forward_join_114: {
    forward_join_106: {
    forward_join_93: {
    forward_join_92: {
    forward_join_89: {
    forward_join_82: {
    forward_join_75: {
    forward_join_44: {
    life4_3 = (__fieldRead61_0() ^ 8546444989445L);
    spill61_0 = __call61_1();
    life7_7 = __call61_2(receiver);
    life8_14 = __call61_3(p0, (p1)[(p2++)]);
    life6_15 = spill61_0;
    if (!((__call61_4(life8_14) > __invokedynamic61_5(31358, (1351264995147818045L ^ life4_3))))) {
        break forward_join_44;
    }
    throw new moom.cb("commands.scoreboard.players.name.tooLong", new java.lang.Object[] {life8_14, __call61_7(__invokedynamic61_6(31358, (1351264995147818045L ^ life4_3)))});
    }
    life9_53 = __call61_8(receiver, (p1)[(p2++)], 0);
    spill61_1 = __call61_9(life7_7, life8_14, life9_53);
    if (!((life6_15 != 0))) {
        forwardValue61_82_0 = __integerCategory61_10(spill61_1);
        break forward_join_82;
    }
    if (!((!spill61_1))) {
        break forward_join_75;
    }
    throw new moom.b7("commands.scoreboard.players.test.notFound", new java.lang.Object[] {__call61_11(life9_53), life8_14});
    }
    spill61_2 = (p1)[p2];
    if (!((life6_15 != 0))) {
        forwardValue61_92_0 = spill61_2;
        break forward_join_92;
    }
    forwardValue61_82_0 = __integerCategory61_13(__call61_12(spill61_2, "*"));
    }
    if (!((forwardValue61_82_0 != 0))) {
        break forward_join_89;
    }
    forwardValue61_93_0 = __invokedynamic61_14(28350, (3282185588332245232L ^ life4_3));
    break forward_join_93;
    }
    forwardValue61_92_0 = (p1)[p2];
    }
    forwardValue61_93_0 = __call61_15(forwardValue61_92_0);
    }
    life10_105 = forwardValue61_93_0;
    p2 += 1;
    spill61_3 = p2;
    if (!((life6_15 != 0))) {
        forwardValue61_106_0 = spill61_3;
        break forward_join_106;
    }
    if (!((spill61_3 < (p1).length))) {
        break forward_join_115;
    }
    forwardValue61_106_0 = __integerCategory61_17(__call61_16((p1)[p2], "*"));
    }
    if (!((life6_15 != 0))) {
        forwardValue61_114_0 = forwardValue61_106_0;
        break forward_join_114;
    }
    if (!((forwardValue61_106_0 == 0))) {
        break forward_join_115;
    }
    forwardValue61_114_0 = __call61_18((p1)[p2], life10_105);
    }
    forwardValue61_120_0 = forwardValue61_114_0;
    break forward_join_120;
    }
    forwardValue61_120_0 = __invokedynamic61_19(31390, (7022567558449341654L ^ life4_3));
    }
    life11_144 = forwardValue61_120_0;
    life12_149 = __call61_20(life7_7, life8_14, life9_53);
    spill61_4 = __call61_21(life12_149);
    spill61_5 = life10_105;
    if (!((life6_15 != 0))) {
        forwardValue61_135_0 = spill61_4;
        forwardValue61_135_1 = spill61_5;
        break forward_join_135;
    }
    if (!((spill61_4 >= spill61_5))) {
        break forward_join_160;
    }
    forwardValue61_135_0 = __call61_22(life12_149);
    forwardValue61_135_1 = life11_144;
    }
    if (!((forwardValue61_135_0 <= forwardValue61_135_1))) {
        break forward_join_160;
    }
    __call61_27(p0, receiver, "commands.scoreboard.players.test.success", new java.lang.Object[] {__call61_24(__call61_23(life12_149)), __call61_25(life10_105), __call61_26(life11_144)});
    if (!((life6_15 == 0))) {
        break forward_join_183;
    }
    }
    throw new moom.b7("commands.scoreboard.players.test.failed", new java.lang.Object[] {__call61_29(__call61_28(life12_149)), __call61_30(life10_105), __call61_31(life11_144)});
    }
    if (!((__call61_32() != null))) {
        break forward_join_188;
    }
    life6_15 += 1;
    __call61_33(life6_15);
    }
    return;
}
public static void h61_0(moom.b7 p0) throws Throwable {
    throw __call3006100_0(p0);
}
public static void h61_1(moom.b7 p0) throws Throwable {
    throw __call3006101_0(p0);
}
public static void h61_2(moom.b7 p0) throws Throwable {
    throw __call3006102_0(p0);
}
public static void h61_3(moom.b7 p0) throws Throwable {
    throw __call3006103_0(p0);
}
public static void h61_4(moom.b7 p0) throws Throwable {
    throw __call3006104_0(p0);
}
public static void h61_5(moom.b7 p0) throws Throwable {
    throw __call3006105_0(p0);
}
public static void h61_6(moom.b7 p0) throws Throwable {
    throw __call3006106_0(p0);
}
public static void h61_7(moom.b7 p0) throws Throwable {
    throw __call3006107_0(p0);
}
public static void h61_8(moom.b7 p0) throws Throwable {
    throw __call3006108_0(p0);
}
public static void h61_9(moom.b7 p0) throws Throwable {
    throw __call3006109_0(p0);
}
public static void h61_10(moom.b7 p0) throws Throwable {
    throw __call3006110_0(p0);
}
public static void h61_11(moom.b7 p0) throws Throwable {
    throw __call3006111_0(p0);
}
public static void h61_12(moom.b7 p0) throws Throwable {
    throw __call3006112_0(p0);
}
public static void h61_13(moom.b7 p0) throws Throwable {
    throw __call3006113_0(p0);
}
private static native long __fieldRead61_0() throws Throwable;
private static native int __call61_1() throws Throwable;
private static native net.minecraft.scoreboard.Scoreboard __call61_2(moom.qy a0) throws Throwable;
private static native java.lang.String __call61_3(net.minecraft.command.ICommandSender a0, java.lang.String a1) throws Throwable;
private static native int __call61_4(java.lang.String a0) throws Throwable;
private static native int __invokedynamic61_5(int a0, long a1) throws Throwable;
private static native int __invokedynamic61_6(int a0, long a1) throws Throwable;
private static native java.lang.Integer __call61_7(int a0) throws Throwable;
private static native net.minecraft.scoreboard.ScoreObjective __call61_8(moom.qy a0, java.lang.String a1, int a2) throws Throwable;
private static native boolean __call61_9(net.minecraft.scoreboard.Scoreboard a0, java.lang.String a1, net.minecraft.scoreboard.ScoreObjective a2) throws Throwable;
private static native int __integerCategory61_10(boolean value) throws Throwable;
private static native java.lang.String __call61_11(net.minecraft.scoreboard.ScoreObjective a0) throws Throwable;
private static native boolean __call61_12(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory61_13(boolean value) throws Throwable;
private static native int __invokedynamic61_14(int a0, long a1) throws Throwable;
private static native int __call61_15(java.lang.String a0) throws Throwable;
private static native boolean __call61_16(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory61_17(boolean value) throws Throwable;
private static native int __call61_18(java.lang.String a0, int a1) throws Throwable;
private static native int __invokedynamic61_19(int a0, long a1) throws Throwable;
private static native net.minecraft.scoreboard.Score __call61_20(net.minecraft.scoreboard.Scoreboard a0, java.lang.String a1, net.minecraft.scoreboard.ScoreObjective a2) throws Throwable;
private static native int __call61_21(net.minecraft.scoreboard.Score a0) throws Throwable;
private static native int __call61_22(net.minecraft.scoreboard.Score a0) throws Throwable;
private static native int __call61_23(net.minecraft.scoreboard.Score a0) throws Throwable;
private static native java.lang.Integer __call61_24(int a0) throws Throwable;
private static native java.lang.Integer __call61_25(int a0) throws Throwable;
private static native java.lang.Integer __call61_26(int a0) throws Throwable;
private static native void __call61_27(net.minecraft.command.ICommandSender a0, moom.qy a1, java.lang.String a2, java.lang.Object[] a3) throws Throwable;
private static native int __call61_28(net.minecraft.scoreboard.Score a0) throws Throwable;
private static native java.lang.Integer __call61_29(int a0) throws Throwable;
private static native java.lang.Integer __call61_30(int a0) throws Throwable;
private static native java.lang.Integer __call61_31(int a0) throws Throwable;
private static native java.lang.String[] __call61_32() throws Throwable;
private static native void __call61_33(int a0) throws Throwable;
private static native java.lang.Exception __call3006100_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3006101_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3006102_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3006103_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3006104_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3006105_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3006106_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3006107_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3006108_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3006109_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3006110_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3006111_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3006112_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3006113_0(moom.b7 a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_0bce5e2927ea69f0c9b3(moom.qy a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2, int a3) throws E;
private static final class __SourceHandler_0bce5e2927ea69f0c9b3 {

public static void f64(moom.qy receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1, int p2) throws Throwable {
    int forwardValue64_80_0;
    int forwardValue64_80_1;
    net.minecraft.scoreboard.Scoreboard forwardValue64_132_0;
    java.lang.String forwardValue64_132_1;
    net.minecraft.scoreboard.ScoreObjective forwardValue64_132_2;
    int forwardValue64_152_0;
    int forwardValue64_167_0;
    int forwardValue64_182_0;
    net.minecraft.scoreboard.Score forwardValue64_191_0;
    int forwardValue64_202_0;
    net.minecraft.scoreboard.Score forwardValue64_211_0;
    int forwardValue64_222_0;
    int forwardValue64_234_0;
    int forwardValue64_249_0;
    int forwardValue64_264_0;
    int forwardValue64_280_0;
    int spill64_0;
    int spill64_1;
    int spill64_2;
    net.minecraft.scoreboard.Scoreboard spill64_3;
    java.lang.String spill64_4;
    net.minecraft.scoreboard.ScoreObjective spill64_5;
    boolean spill64_6;
    net.minecraft.scoreboard.Score spill64_7;
    net.minecraft.scoreboard.Score spill64_8;
    long life4_3;
    net.minecraft.scoreboard.Scoreboard life7_6;
    java.lang.String life8_14;
    int life6_15;
    net.minecraft.scoreboard.ScoreObjective life9_23;
    java.lang.String life10_28;
    java.lang.String life11_35;
    net.minecraft.scoreboard.ScoreObjective life12_42;
    net.minecraft.scoreboard.Score life13_112;
    net.minecraft.scoreboard.Score life14_145;
    int life15_381;
    forward_join_288: {
    forward_join_280: {
    forward_join_278: {
    forward_join_264: {
    forward_join_261: {
    forward_join_249: {
    forward_join_246: {
    forward_join_234: {
    forward_join_231: {
    forward_join_222: {
    forward_join_219: {
    forward_join_211: {
    forward_join_202: {
    forward_join_199: {
    forward_join_191: {
    forward_join_182: {
    forward_join_179: {
    forward_join_167: {
    forward_join_164: {
    forward_join_152: {
    forward_join_149: {
    forward_join_132: {
    forward_join_129: {
    forward_join_101: {
    forward_join_80: {
    forward_join_73: {
    life4_3 = (__fieldRead64_0() ^ 123181087350425L);
    life7_6 = __call64_1(receiver);
    spill64_0 = __call64_2();
    life8_14 = __call64_3(p0, (p1)[(p2++)]);
    life6_15 = spill64_0;
    life9_23 = __call64_4(receiver, (p1)[(p2++)], 1);
    life10_28 = (p1)[(p2++)];
    life11_35 = __call64_5(p0, (p1)[(p2++)]);
    life12_42 = __call64_6(receiver, (p1)[p2], 0);
    spill64_1 = __call64_7(life8_14);
    spill64_2 = __invokedynamic64_8(31358, (1351325728281570977L ^ life4_3));
    if (!((life6_15 != 0))) {
        forwardValue64_80_0 = spill64_1;
        forwardValue64_80_1 = spill64_2;
        break forward_join_80;
    }
    if (!((spill64_1 > spill64_2))) {
        break forward_join_73;
    }
    throw new moom.cb("commands.scoreboard.players.name.tooLong", new java.lang.Object[] {life8_14, __call64_10(__invokedynamic64_9(31358, (1351325728281570977L ^ life4_3)))});
    }
    forwardValue64_80_0 = __call64_11(life11_35);
    forwardValue64_80_1 = __invokedynamic64_12(31358, (1351325728281570977L ^ life4_3));
    }
    if (!((forwardValue64_80_0 > forwardValue64_80_1))) {
        break forward_join_101;
    }
    throw new moom.cb("commands.scoreboard.players.name.tooLong", new java.lang.Object[] {life11_35, __call64_14(__invokedynamic64_13(31358, (1351325728281570977L ^ life4_3)))});
    }
    life13_112 = __call64_15(life7_6, life8_14, life9_23);
    spill64_3 = life7_6;
    spill64_4 = life11_35;
    spill64_5 = life12_42;
    if (!((life6_15 != 0))) {
        forwardValue64_132_0 = spill64_3;
        forwardValue64_132_1 = spill64_4;
        forwardValue64_132_2 = spill64_5;
        break forward_join_132;
    }
    if (!((!__call64_16(spill64_3, spill64_4, spill64_5)))) {
        break forward_join_129;
    }
    throw new moom.b7("commands.scoreboard.players.operation.notFound", new java.lang.Object[] {__call64_17(life12_42), life11_35});
    }
    forwardValue64_132_0 = life7_6;
    forwardValue64_132_1 = life11_35;
    forwardValue64_132_2 = life12_42;
    }
    life14_145 = __call64_18(forwardValue64_132_0, forwardValue64_132_1, forwardValue64_132_2);
    spill64_6 = __call64_19(life10_28, "+=");
    if (!((life6_15 != 0))) {
        forwardValue64_152_0 = __integerCategory64_20(spill64_6);
        break forward_join_152;
    }
    if (!(spill64_6)) {
        break forward_join_149;
    }
    __call64_23(life13_112, (__call64_21(life13_112) + __call64_22(life14_145)));
    if (!((life6_15 == 0))) {
        break forward_join_288;
    }
    }
    forwardValue64_152_0 = __integerCategory64_25(__call64_24(life10_28, "-="));
    }
    if (!((life6_15 != 0))) {
        forwardValue64_167_0 = forwardValue64_152_0;
        break forward_join_167;
    }
    if (!((forwardValue64_152_0 != 0))) {
        break forward_join_164;
    }
    __call64_28(life13_112, (__call64_26(life13_112) - __call64_27(life14_145)));
    if (!((life6_15 == 0))) {
        break forward_join_288;
    }
    }
    forwardValue64_167_0 = __integerCategory64_30(__call64_29(life10_28, "*="));
    }
    if (!((life6_15 != 0))) {
        forwardValue64_182_0 = forwardValue64_167_0;
        break forward_join_182;
    }
    if (!((forwardValue64_167_0 != 0))) {
        break forward_join_179;
    }
    __call64_33(life13_112, (__call64_31(life13_112) * __call64_32(life14_145)));
    if (!((life6_15 == 0))) {
        break forward_join_288;
    }
    }
    forwardValue64_182_0 = __integerCategory64_35(__call64_34(life10_28, "/="));
    }
    if (!((life6_15 != 0))) {
        forwardValue64_202_0 = forwardValue64_182_0;
        break forward_join_202;
    }
    if (!((forwardValue64_182_0 != 0))) {
        break forward_join_199;
    }
    spill64_7 = life14_145;
    if (!((life6_15 != 0))) {
        forwardValue64_191_0 = spill64_7;
        break forward_join_191;
    }
    if (!((__call64_36(spill64_7) != 0))) {
        break forward_join_288;
    }
    forwardValue64_191_0 = life13_112;
    }
    __call64_39(forwardValue64_191_0, (__call64_37(life13_112) / __call64_38(life14_145)));
    if (!((life6_15 == 0))) {
        break forward_join_288;
    }
    }
    forwardValue64_202_0 = __integerCategory64_41(__call64_40(life10_28, "%="));
    }
    if (!((life6_15 != 0))) {
        forwardValue64_222_0 = forwardValue64_202_0;
        break forward_join_222;
    }
    if (!((forwardValue64_202_0 != 0))) {
        break forward_join_219;
    }
    spill64_8 = life14_145;
    if (!((life6_15 != 0))) {
        forwardValue64_211_0 = spill64_8;
        break forward_join_211;
    }
    if (!((__call64_42(spill64_8) != 0))) {
        break forward_join_288;
    }
    forwardValue64_211_0 = life13_112;
    }
    __call64_45(forwardValue64_211_0, (__call64_43(life13_112) % __call64_44(life14_145)));
    if (!((life6_15 == 0))) {
        break forward_join_288;
    }
    }
    forwardValue64_222_0 = __integerCategory64_47(__call64_46(life10_28, "="));
    }
    if (!((life6_15 != 0))) {
        forwardValue64_234_0 = forwardValue64_222_0;
        break forward_join_234;
    }
    if (!((forwardValue64_222_0 != 0))) {
        break forward_join_231;
    }
    __call64_49(life13_112, __call64_48(life14_145));
    if (!((life6_15 == 0))) {
        break forward_join_288;
    }
    }
    forwardValue64_234_0 = __integerCategory64_51(__call64_50(life10_28, "<"));
    }
    if (!((life6_15 != 0))) {
        forwardValue64_249_0 = forwardValue64_234_0;
        break forward_join_249;
    }
    if (!((forwardValue64_234_0 != 0))) {
        break forward_join_246;
    }
    __call64_55(life13_112, __call64_54(__call64_52(life13_112), __call64_53(life14_145)));
    if (!((life6_15 == 0))) {
        break forward_join_288;
    }
    }
    forwardValue64_249_0 = __integerCategory64_57(__call64_56(life10_28, ">"));
    }
    if (!((life6_15 != 0))) {
        forwardValue64_264_0 = forwardValue64_249_0;
        break forward_join_264;
    }
    if (!((forwardValue64_249_0 != 0))) {
        break forward_join_261;
    }
    __call64_61(life13_112, __call64_60(__call64_58(life13_112), __call64_59(life14_145)));
    if (!((life6_15 == 0))) {
        break forward_join_288;
    }
    }
    forwardValue64_264_0 = __integerCategory64_63(__call64_62(life10_28, "><"));
    }
    if (!((life6_15 != 0))) {
        forwardValue64_280_0 = forwardValue64_264_0;
        break forward_join_280;
    }
    if (!((forwardValue64_264_0 == 0))) {
        break forward_join_278;
    }
    throw new moom.b7("commands.scoreboard.players.operation.invalidOperation", new java.lang.Object[] {life10_28});
    }
    forwardValue64_280_0 = __call64_64(life13_112);
    }
    life15_381 = forwardValue64_280_0;
    __call64_66(life13_112, __call64_65(life14_145));
    __call64_67(life14_145, life15_381);
    }
    __call64_68(p0, receiver, "commands.scoreboard.players.operation.success", new java.lang.Object[0]);
    return;
}
public static void h64_0(moom.b7 p0) throws Throwable {
    throw __call3006400_0(p0);
}
public static void h64_1(moom.b7 p0) throws Throwable {
    throw __call3006401_0(p0);
}
public static void h64_2(moom.b7 p0) throws Throwable {
    throw __call3006402_0(p0);
}
public static void h64_3(moom.b7 p0) throws Throwable {
    throw __call3006403_0(p0);
}
public static void h64_4(moom.b7 p0) throws Throwable {
    throw __call3006404_0(p0);
}
public static void h64_5(moom.b7 p0) throws Throwable {
    throw __call3006405_0(p0);
}
public static void h64_6(moom.b7 p0) throws Throwable {
    throw __call3006406_0(p0);
}
public static void h64_7(moom.b7 p0) throws Throwable {
    throw __call3006407_0(p0);
}
public static void h64_8(moom.b7 p0) throws Throwable {
    throw __call3006408_0(p0);
}
public static void h64_9(moom.b7 p0) throws Throwable {
    throw __call3006409_0(p0);
}
public static void h64_10(moom.b7 p0) throws Throwable {
    throw __call3006410_0(p0);
}
public static void h64_11(moom.b7 p0) throws Throwable {
    throw __call3006411_0(p0);
}
public static void h64_12(moom.b7 p0) throws Throwable {
    throw __call3006412_0(p0);
}
public static void h64_13(moom.b7 p0) throws Throwable {
    throw __call3006413_0(p0);
}
public static void h64_14(moom.b7 p0) throws Throwable {
    throw __call3006414_0(p0);
}
public static void h64_15(moom.b7 p0) throws Throwable {
    throw __call3006415_0(p0);
}
public static void h64_16(moom.b7 p0) throws Throwable {
    throw __call3006416_0(p0);
}
public static void h64_17(moom.b7 p0) throws Throwable {
    throw __call3006417_0(p0);
}
public static void h64_18(moom.b7 p0) throws Throwable {
    throw __call3006418_0(p0);
}
public static void h64_19(moom.b7 p0) throws Throwable {
    throw __call3006419_0(p0);
}
public static void h64_20(moom.b7 p0) throws Throwable {
    throw __call3006420_0(p0);
}
public static void h64_21(moom.b7 p0) throws Throwable {
    throw __call3006421_0(p0);
}
public static void h64_22(moom.b7 p0) throws Throwable {
    throw __call3006422_0(p0);
}
public static void h64_23(moom.b7 p0) throws Throwable {
    throw __call3006423_0(p0);
}
public static void h64_24(moom.b7 p0) throws Throwable {
    throw __call3006424_0(p0);
}
public static void h64_25(moom.b7 p0) throws Throwable {
    throw __call3006425_0(p0);
}
public static void h64_26(moom.b7 p0) throws Throwable {
    throw __call3006426_0(p0);
}
public static void h64_27(moom.b7 p0) throws Throwable {
    throw __call3006427_0(p0);
}
public static void h64_28(moom.b7 p0) throws Throwable {
    throw __call3006428_0(p0);
}
public static void h64_29(moom.b7 p0) throws Throwable {
    throw __call3006429_0(p0);
}
public static void h64_30(moom.b7 p0) throws Throwable {
    throw __call3006430_0(p0);
}
public static void h64_31(moom.b7 p0) throws Throwable {
    throw __call3006431_0(p0);
}
public static void h64_32(moom.b7 p0) throws Throwable {
    throw __call3006432_0(p0);
}
public static void h64_33(moom.b7 p0) throws Throwable {
    throw __call3006433_0(p0);
}
public static void h64_34(moom.b7 p0) throws Throwable {
    throw __call3006434_0(p0);
}
private static native long __fieldRead64_0() throws Throwable;
private static native net.minecraft.scoreboard.Scoreboard __call64_1(moom.qy a0) throws Throwable;
private static native int __call64_2() throws Throwable;
private static native java.lang.String __call64_3(net.minecraft.command.ICommandSender a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.scoreboard.ScoreObjective __call64_4(moom.qy a0, java.lang.String a1, int a2) throws Throwable;
private static native java.lang.String __call64_5(net.minecraft.command.ICommandSender a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.scoreboard.ScoreObjective __call64_6(moom.qy a0, java.lang.String a1, int a2) throws Throwable;
private static native int __call64_7(java.lang.String a0) throws Throwable;
private static native int __invokedynamic64_8(int a0, long a1) throws Throwable;
private static native int __invokedynamic64_9(int a0, long a1) throws Throwable;
private static native java.lang.Integer __call64_10(int a0) throws Throwable;
private static native int __call64_11(java.lang.String a0) throws Throwable;
private static native int __invokedynamic64_12(int a0, long a1) throws Throwable;
private static native int __invokedynamic64_13(int a0, long a1) throws Throwable;
private static native java.lang.Integer __call64_14(int a0) throws Throwable;
private static native net.minecraft.scoreboard.Score __call64_15(net.minecraft.scoreboard.Scoreboard a0, java.lang.String a1, net.minecraft.scoreboard.ScoreObjective a2) throws Throwable;
private static native boolean __call64_16(net.minecraft.scoreboard.Scoreboard a0, java.lang.String a1, net.minecraft.scoreboard.ScoreObjective a2) throws Throwable;
private static native java.lang.String __call64_17(net.minecraft.scoreboard.ScoreObjective a0) throws Throwable;
private static native net.minecraft.scoreboard.Score __call64_18(net.minecraft.scoreboard.Scoreboard a0, java.lang.String a1, net.minecraft.scoreboard.ScoreObjective a2) throws Throwable;
private static native boolean __call64_19(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory64_20(boolean value) throws Throwable;
private static native int __call64_21(net.minecraft.scoreboard.Score a0) throws Throwable;
private static native int __call64_22(net.minecraft.scoreboard.Score a0) throws Throwable;
private static native void __call64_23(net.minecraft.scoreboard.Score a0, int a1) throws Throwable;
private static native boolean __call64_24(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory64_25(boolean value) throws Throwable;
private static native int __call64_26(net.minecraft.scoreboard.Score a0) throws Throwable;
private static native int __call64_27(net.minecraft.scoreboard.Score a0) throws Throwable;
private static native void __call64_28(net.minecraft.scoreboard.Score a0, int a1) throws Throwable;
private static native boolean __call64_29(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory64_30(boolean value) throws Throwable;
private static native int __call64_31(net.minecraft.scoreboard.Score a0) throws Throwable;
private static native int __call64_32(net.minecraft.scoreboard.Score a0) throws Throwable;
private static native void __call64_33(net.minecraft.scoreboard.Score a0, int a1) throws Throwable;
private static native boolean __call64_34(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory64_35(boolean value) throws Throwable;
private static native int __call64_36(net.minecraft.scoreboard.Score a0) throws Throwable;
private static native int __call64_37(net.minecraft.scoreboard.Score a0) throws Throwable;
private static native int __call64_38(net.minecraft.scoreboard.Score a0) throws Throwable;
private static native void __call64_39(net.minecraft.scoreboard.Score a0, int a1) throws Throwable;
private static native boolean __call64_40(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory64_41(boolean value) throws Throwable;
private static native int __call64_42(net.minecraft.scoreboard.Score a0) throws Throwable;
private static native int __call64_43(net.minecraft.scoreboard.Score a0) throws Throwable;
private static native int __call64_44(net.minecraft.scoreboard.Score a0) throws Throwable;
private static native void __call64_45(net.minecraft.scoreboard.Score a0, int a1) throws Throwable;
private static native boolean __call64_46(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory64_47(boolean value) throws Throwable;
private static native int __call64_48(net.minecraft.scoreboard.Score a0) throws Throwable;
private static native void __call64_49(net.minecraft.scoreboard.Score a0, int a1) throws Throwable;
private static native boolean __call64_50(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory64_51(boolean value) throws Throwable;
private static native int __call64_52(net.minecraft.scoreboard.Score a0) throws Throwable;
private static native int __call64_53(net.minecraft.scoreboard.Score a0) throws Throwable;
private static native int __call64_54(int a0, int a1) throws Throwable;
private static native void __call64_55(net.minecraft.scoreboard.Score a0, int a1) throws Throwable;
private static native boolean __call64_56(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory64_57(boolean value) throws Throwable;
private static native int __call64_58(net.minecraft.scoreboard.Score a0) throws Throwable;
private static native int __call64_59(net.minecraft.scoreboard.Score a0) throws Throwable;
private static native int __call64_60(int a0, int a1) throws Throwable;
private static native void __call64_61(net.minecraft.scoreboard.Score a0, int a1) throws Throwable;
private static native boolean __call64_62(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory64_63(boolean value) throws Throwable;
private static native int __call64_64(net.minecraft.scoreboard.Score a0) throws Throwable;
private static native int __call64_65(net.minecraft.scoreboard.Score a0) throws Throwable;
private static native void __call64_66(net.minecraft.scoreboard.Score a0, int a1) throws Throwable;
private static native void __call64_67(net.minecraft.scoreboard.Score a0, int a1) throws Throwable;
private static native void __call64_68(net.minecraft.command.ICommandSender a0, moom.qy a1, java.lang.String a2, java.lang.Object[] a3) throws Throwable;
private static native java.lang.Exception __call3006400_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3006401_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3006402_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3006403_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3006404_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3006405_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3006406_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3006407_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3006408_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3006409_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3006410_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3006411_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3006412_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3006413_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3006414_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3006415_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3006416_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3006417_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3006418_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3006419_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3006420_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3006421_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3006422_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3006423_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3006424_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3006425_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3006426_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3006427_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3006428_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3006429_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3006430_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3006431_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3006432_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3006433_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3006434_0(moom.b7 a0) throws Throwable;

}


protected void i(net.minecraft.command.ICommandSender p0, java.lang.String[] p1, int p2) throws moom.b7 { __sourceHandlerCall_ce64ed53c4ce0a519bc3(this, p0, p1, p2); }


protected void b(net.minecraft.command.ICommandSender p0, java.lang.String[] p1, int p2) throws moom.b7 { __sourceHandlerCall_cde3de7ea94634d4719f(this, p0, p1, p2); }


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8875_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/qy"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


protected java.util.List<java.lang.String> b__sourceReturn_3f0615080b() { return __sourceHandlerCall_4c5f44c0b266d3a6e742(this); }


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 22501;
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
            throw new RuntimeException("moom/qy", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         e[var3] = var15;
      }

      return e[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.qy.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


protected void e(net.minecraft.command.ICommandSender p0, java.lang.String[] p1, int p2) throws moom.b7 { __sourceHandlerCall_340ace8432982f975972(this, p0, p1, p2); }


protected void c(net.minecraft.command.ICommandSender p0, java.lang.String[] p1, int p2) throws moom.b7 { __sourceHandlerCall_e1ee3192cead96533b35(this, p0, p1, p2); }


protected void n(net.minecraft.command.ICommandSender p0, java.lang.String[] p1, int p2) throws moom.b7 { __sourceHandlerCall_068bd3d0a77e3f8d6665(this, p0, p1, p2); }


protected void h(net.minecraft.command.ICommandSender p0, java.lang.String[] p1, int p2) throws moom.b7 { __sourceHandlerCall_bac8fc9daa0150dd8d98(this, p0, p1, p2); }


protected void f(net.minecraft.command.ICommandSender p0, java.lang.String[] p1, int p2) throws moom.b7 { __sourceHandlerCall_d7bbb00a803617e4c142(this, p0, p1, p2); }


protected void l(net.minecraft.command.ICommandSender p0, java.lang.String[] p1, int p2) throws moom.b7 { __sourceHandlerCall_d4e95670ac4c2156357e(this, p0, p1, p2); }


protected void d(net.minecraft.command.ICommandSender p0, java.lang.String[] p1, int p2) throws moom.b7 { __sourceHandlerCall_2166eec5a57e8b6c283f(this, p0, p1, p2); }


public void a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws moom.b7 { __sourceHandlerCall_2265ab4080095ab77816(this, p0, p1); }


protected java.util.List<java.lang.String> a(boolean p0) { return __sourceHandlerCall_6d7f134604d3eb09c954(this, p0); }


public java.lang.String a__String() {
return "scoreboard";
}


public java.util.List<java.lang.String> a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1, moom.DT p2) { return __sourceHandlerCall_d52def4868c45e075ec7(this, p0, p1, p2); }


public int a() {
return 2;
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public java.lang.String a__sourceReturn_abea8daec3(net.minecraft.command.ICommandSender p0) {
return "commands.scoreboard.usage";
}


public boolean a__Boolean(java.lang.String[] p0, int p1) { return __sourceHandlerCall_989512cc2d3379ddfdaf(this, p0, p1); }


protected void a__sourceReturn_443e6ba040(net.minecraft.command.ICommandSender p0, java.lang.String[] p1, int p2) throws moom.b7 { __sourceHandlerCall_50ada76537afa6e57635(this, p0, p1, p2); }


private boolean a__Boolean(net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws moom.b7 { return __sourceHandlerCall_c61112026afdf1fbd1f8(this, p0, p1); }


protected void a__Void(net.minecraft.command.ICommandSender p0) throws moom.b7 { __sourceHandlerCall_9c509aa764b4190e76e0(this, p0); }


protected net.minecraft.scoreboard.ScoreObjective a(java.lang.String p0, boolean p1) throws moom.b7 { return __sourceHandlerCall_7620c9d551a85304e29c(this, p0, p1); }


protected moom.Bk a__sourceReturn_6cf5900665(java.lang.String p0) throws moom.b7 { return __sourceHandlerCall_862345544e99c5560f88(this, p0); }


protected void a__sourceReturn_69d7d9cb8c(net.minecraft.command.ICommandSender p0, java.lang.String p1) throws moom.b7 {
net.minecraft.scoreboard.Scoreboard local3 = ((moom.qy)(this)).a__Bh();
    net.minecraft.scoreboard.ScoreObjective local4 = ((moom.qy)(this)).a(((java.lang.String)(p1)), ((boolean)(false)));
    ((net.minecraft.scoreboard.Scoreboard)(local3)).a__Void(((net.minecraft.scoreboard.ScoreObjective)(local4)));
    moom.qy.a(((net.minecraft.command.ICommandSender)(p0)), ((net.minecraft.command.ICommand)(this)), ((java.lang.String)("commands.scoreboard.objectives.remove.success")), ((java.lang.Object[])(new java.lang.Object[] {p1})));
    return;
}


protected net.minecraft.scoreboard.Scoreboard a__Bh() {
return ((net.minecraft.world.WorldServer)(((moom.Bl)(moom.Bl.a__Bl())).a(((int)(0))))).a__Bh();
}


protected void m(net.minecraft.command.ICommandSender p0, java.lang.String[] p1, int p2) throws moom.b7 { __sourceHandlerCall_fe88faa8ef9ee1c7423f(this, p0, p1, p2); }


protected void o(net.minecraft.command.ICommandSender p0, java.lang.String[] p1, int p2) throws moom.b7 { __sourceHandlerCall_0bce5e2927ea69f0c9b3(this, p0, p1, p2); }


protected void k(net.minecraft.command.ICommandSender p0, java.lang.String[] p1, int p2) throws moom.b7 { __sourceHandlerCall_b7214a62750f62b929d0(this, p0, p1, p2); }


protected void g(net.minecraft.command.ICommandSender p0, java.lang.String[] p1, int p2) throws moom.b7 { __sourceHandlerCall_7388922557981f2e8fb9(this, p0, p1, p2); }


protected void j(net.minecraft.command.ICommandSender p0, java.lang.String[] p1, int p2) throws moom.b7 { __sourceHandlerCall_68f42a7a30a10e6f827b(this, p0, p1, p2); }


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8875_0() throws E;
}
