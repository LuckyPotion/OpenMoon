package net.minecraft.client.gui;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class GuiSnooper extends net.minecraft.client.gui.GuiScreen {

private net.minecraft.client.gui.GuiScreen w;

private net.minecraft.client.settings.GameSettings x;

private java.util.List<java.lang.String> y;

private java.util.List<java.lang.String> z;

private java.lang.String A;

private java.lang.String[] B;

private moom.ie C;

private moom.gc D;

private static long E;

private static long[] F;

private static java.lang.Integer[] G;

private static java.util.Map H;

public GuiSnooper(net.minecraft.client.gui.GuiScreen p0, net.minecraft.client.settings.GameSettings p1) {
super();
    this.y = com.google.common.collect.Lists.newArrayList();
    this.z = com.google.common.collect.Lists.newArrayList();
    this.w = p0;
    this.x = p1;
}


static {
E = ((long)(((moom._a)(moom._c.a(((long)(6739976312105053147L)), ((long)(8309116556320715413L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(66562418862098L)))));
    H = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (net.minecraft.client.gui.GuiSnooper.E ^ 41957653654701L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1788_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1788_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1788_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1788_14 = new byte[8];
    (__sourceSpill1788_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1788_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1788_16 = __sourceSpill1788_14;
    ((javax.crypto.Cipher)(__sourceSpill1788_11)).init(((int)(__sourceSpill1788_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1788_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1788_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[13];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "lQ´e$®hÈìzÞ0@_{Kì®7gO9ív=\177Óæ\002\036\026'~[\005½!õt\"ôAÕ|°y!rKH¬\025z±ÞJ%\räßLU\003\017yÒ\002Ûl÷$õð\031ÑZ"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1788_25 = local6_life21;
        int __sourceSpill1788_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1788_25)).substring(((int)(__sourceSpill1788_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1788_30 = local8_life19;
        int __sourceSpill1788_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1788_33 = new byte[8];
        (__sourceSpill1788_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1788_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1788_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1788_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1788_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1788_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1788_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1788_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1788_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1788_34)).doFinal(((byte[])(__sourceSpill1788_33)));
        (__sourceSpill1788_30)[__sourceSpill1788_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "$ÿÔ5ª}ë\024¿r49ù"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1788_38 = local6_life21;
        int __sourceSpill1788_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1788_38)).substring(((int)(__sourceSpill1788_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1788_43 = local8_life19;
        int __sourceSpill1788_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1788_46 = new byte[8];
        (__sourceSpill1788_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1788_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1788_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1788_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1788_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1788_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1788_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1788_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1788_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1788_47)).doFinal(((byte[])(__sourceSpill1788_46)));
        (__sourceSpill1788_43)[__sourceSpill1788_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    F = ((long[])(local8_life19));
    G = ((java.lang.Integer[])(new java.lang.Integer[13]));
}

private static native <E extends Throwable> void __sourceHandlerCall_e0778114c45f040bdb7c(net.minecraft.client.gui.GuiSnooper a0, moom.gc a1) throws E;
private static final class __SourceHandler_e0778114c45f040bdb7c {

public static void f2323(net.minecraft.client.gui.GuiSnooper receiver, moom.gc p0) throws Throwable {
    if (__fieldRead2323_0(p0)) {
        if ((__fieldRead2323_1(p0) == 2)) {
        __call2323_3(__fieldRead2323_2(receiver));
        __call2323_5(__fieldRead2323_4(receiver));
        __call2323_8(__fieldRead2323_6(receiver), __fieldRead2323_7(receiver));
    }
        if ((__fieldRead2323_9(p0) == 1)) {
        __call2323_12(__fieldRead2323_10(receiver), __fieldRead2323_11(), 1);
        __fieldWrite2323_17(__fieldRead2323_13(receiver), __call2323_16(__fieldRead2323_14(receiver), __fieldRead2323_15()));
    }
    }
    return;
}
public static void h2323_0(java.io.IOException p0) throws Throwable {
    throw __call1232300_0(p0);
}
public static void h2323_1(java.io.IOException p0) throws Throwable {
    throw __call1232301_0(p0);
}
public static void h2323_2(java.io.IOException p0) throws Throwable {
    throw __call1232302_0(p0);
}
private static native boolean __fieldRead2323_0(moom.gc a0) throws Throwable;
private static native int __fieldRead2323_1(moom.gc a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead2323_2(net.minecraft.client.gui.GuiSnooper a0) throws Throwable;
private static native void __call2323_3(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead2323_4(net.minecraft.client.gui.GuiSnooper a0) throws Throwable;
private static native void __call2323_5(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2323_6(net.minecraft.client.gui.GuiSnooper a0) throws Throwable;
private static native net.minecraft.client.gui.GuiScreen __fieldRead2323_7(net.minecraft.client.gui.GuiSnooper a0) throws Throwable;
private static native void __call2323_8(net.minecraft.client.Minecraft a0, net.minecraft.client.gui.GuiScreen a1) throws Throwable;
private static native int __fieldRead2323_9(moom.gc a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead2323_10(net.minecraft.client.gui.GuiSnooper a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings$Options __fieldRead2323_11() throws Throwable;
private static native void __call2323_12(net.minecraft.client.settings.GameSettings a0, net.minecraft.client.settings.GameSettings$Options a1, int a2) throws Throwable;
private static native moom.gc __fieldRead2323_13(net.minecraft.client.gui.GuiSnooper a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead2323_14(net.minecraft.client.gui.GuiSnooper a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings$Options __fieldRead2323_15() throws Throwable;
private static native java.lang.String __call2323_16(net.minecraft.client.settings.GameSettings a0, net.minecraft.client.settings.GameSettings$Options a1) throws Throwable;
private static native void __fieldWrite2323_17(moom.gc a0, java.lang.String a1) throws Throwable;
private static native java.lang.Exception __call1232300_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1232301_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1232302_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_17b272d2d37fbfacb94b(net.minecraft.client.gui.GuiSnooper a0) throws E;
private static final class __SourceHandler_17b272d2d37fbfacb94b {

public static void f211(net.minecraft.client.gui.GuiSnooper receiver) throws Throwable {
    int lexicalValue211_136_0;
    java.util.List lexicalValue211_160_0;
    java.util.List lexicalValue211_161_0;
    java.lang.String lexicalValue211_161_1;
    java.util.List spill211_0;
    moom.gc spill211_1;
    java.util.List spill211_2;
    long life1_3;
    java.lang.String life3_14;
    java.util.ArrayList life4_16;
    int life5_141;
    java.util.Iterator life6_151;
    java.util.Map.Entry life7_158;
    java.util.Iterator life6_205;
    java.util.Map.Entry life7_212;
    lexical_join_233: {
    lexical_join_186: {
    lexical_join_136: {
    lexical_join_135: {
    life1_3 = (__fieldRead211_0() ^ 5246948070449L);
    __fieldWrite211_2(receiver, __call211_1("options.snooper.title", new java.lang.Object[0]));
    life3_14 = __call211_3("options.snooper.desc", new java.lang.Object[0]);
    life4_16 = __call211_4();
    __call211_9(life4_16, __call211_8(__fieldRead211_5(receiver), life3_14, (__fieldRead211_6(receiver) - __invokedynamic211_7(27979, (8753230083408658149L ^ life1_3)))));
    __fieldWrite211_12(receiver, __cast211_11(__call211_10(life4_16, new java.lang.String[0])));
    __call211_14(__fieldRead211_13(receiver));
    __call211_16(__fieldRead211_15(receiver));
    spill211_0 = __fieldRead211_17(receiver);
    net.minecraft.client.gui.GuiSnooper __stackOp211_27_0 = receiver;
    moom.gc __stackOp211_27_1 = new moom.gc(1, ((__fieldRead211_18(receiver) / 2) - __invokedynamic211_19(8843, (812962191380295970L ^ life1_3))), (__fieldRead211_20(receiver) - __invokedynamic211_21(25712, (120150529500280792L ^ life1_3))), __invokedynamic211_22(19380, (6601066081323112469L ^ life1_3)), __invokedynamic211_23(22006, (7421537140033963605L ^ life1_3)), __call211_26(__fieldRead211_24(receiver), __fieldRead211_25()));
    spill211_1 = __stackOp211_27_1;
    __fieldWrite211_28(__stackOp211_27_0, __stackOp211_27_1);
    __call211_29(spill211_0, spill211_1);
    __call211_37(__fieldRead211_30(receiver), new moom.gc(2, ((__fieldRead211_31(receiver) / 2) + 2), (__fieldRead211_32(receiver) - __invokedynamic211_33(25712, (120150529500280792L ^ life1_3))), __invokedynamic211_34(15367, (6288214020296650663L ^ life1_3)), __invokedynamic211_35(12317, (1033266135048496055L ^ life1_3)), __call211_36("gui.done", new java.lang.Object[0])));
    if (!((__call211_39(__fieldRead211_38(receiver)) != null))) {
        break lexical_join_135;
    }
    if (!((__call211_42(__call211_41(__fieldRead211_40(receiver))) != null))) {
        break lexical_join_135;
    }
    lexicalValue211_136_0 = 1;
    break lexical_join_136;
    }
    lexicalValue211_136_0 = 0;
    }
    life5_141 = lexicalValue211_136_0;
    life6_151 = __call211_47(__call211_46(new java.util.TreeMap(__call211_45(__call211_44(__fieldRead211_43(receiver))))));
    lexical_cycle_147: while (true) {
    lexical_join_161: {
    lexical_join_160: {
    if (!(__call211_48(life6_151))) {
        break lexical_join_186;
    }
    life7_158 = __cast211_50(__call211_49(life6_151));
    spill211_2 = __fieldRead211_51(receiver);
    if (!((life5_141 != 0))) {
        lexicalValue211_160_0 = spill211_2;
        break lexical_join_160;
    }
    lexicalValue211_161_0 = spill211_2;
    lexicalValue211_161_1 = "C ";
    break lexical_join_161;
    }
    lexicalValue211_161_0 = lexicalValue211_160_0;
    lexicalValue211_161_1 = "";
    }
    __call211_55(lexicalValue211_161_0, __invokedynamic211_54(lexicalValue211_161_1, __cast211_53(__call211_52(life7_158))));
    __call211_63(__fieldRead211_56(receiver), __call211_62(__fieldRead211_57(receiver), __cast211_59(__call211_58(life7_158)), (__fieldRead211_60(receiver) - __invokedynamic211_61(23795, (63345522506813271L ^ life1_3)))));
    continue lexical_cycle_147;
    }
    }
    if (!((life5_141 != 0))) {
        break lexical_join_233;
    }
    life6_205 = __call211_69(__call211_68(new java.util.TreeMap(__call211_67(__call211_66(__call211_65(__fieldRead211_64(receiver)))))));
    lexical_cycle_199: while (true) {
    if (!(__call211_70(life6_205))) {
        break lexical_join_233;
    }
    life7_212 = __cast211_72(__call211_71(life6_205));
    __call211_77(__fieldRead211_73(receiver), __invokedynamic211_76(__cast211_75(__call211_74(life7_212))));
    __call211_85(__fieldRead211_78(receiver), __call211_84(__fieldRead211_79(receiver), __cast211_81(__call211_80(life7_212)), (__fieldRead211_82(receiver) - __invokedynamic211_83(10277, (3591864504511544200L ^ life1_3)))));
    continue lexical_cycle_199;
    }
    }
    __fieldWrite211_86(receiver, new moom.ie(receiver));
    return;
}
public static void h211_0(moom.Oo p0) throws Throwable {
    throw __call1021100_0(p0);
}
public static void h211_1(moom.Oo p0) throws Throwable {
    throw __call1021101_0(p0);
}
public static void h211_2(moom.Oo p0) throws Throwable {
    throw __call1021102_0(p0);
}
private static native long __fieldRead211_0() throws Throwable;
private static native java.lang.String __call211_1(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native void __fieldWrite211_2(net.minecraft.client.gui.GuiSnooper a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call211_3(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native java.util.ArrayList __call211_4() throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead211_5(net.minecraft.client.gui.GuiSnooper a0) throws Throwable;
private static native int __fieldRead211_6(net.minecraft.client.gui.GuiSnooper a0) throws Throwable;
private static native int __invokedynamic211_7(int a0, long a1) throws Throwable;
private static native java.util.List __call211_8(net.minecraft.client.gui.FontRenderer a0, java.lang.String a1, int a2) throws Throwable;
private static native boolean __call211_9(java.util.ArrayList a0, java.util.List a1) throws Throwable;
private static native java.lang.Object[] __call211_10(java.util.ArrayList a0, java.lang.String[] a1) throws Throwable;
private static native java.lang.String[] __cast211_11(java.lang.Object[] a0) throws Throwable;
private static native void __fieldWrite211_12(net.minecraft.client.gui.GuiSnooper a0, java.lang.String[] a1) throws Throwable;
private static native java.util.List __fieldRead211_13(net.minecraft.client.gui.GuiSnooper a0) throws Throwable;
private static native void __call211_14(java.util.List a0) throws Throwable;
private static native java.util.List __fieldRead211_15(net.minecraft.client.gui.GuiSnooper a0) throws Throwable;
private static native void __call211_16(java.util.List a0) throws Throwable;
private static native java.util.List __fieldRead211_17(net.minecraft.client.gui.GuiSnooper a0) throws Throwable;
private static native int __fieldRead211_18(net.minecraft.client.gui.GuiSnooper a0) throws Throwable;
private static native int __invokedynamic211_19(int a0, long a1) throws Throwable;
private static native int __fieldRead211_20(net.minecraft.client.gui.GuiSnooper a0) throws Throwable;
private static native int __invokedynamic211_21(int a0, long a1) throws Throwable;
private static native int __invokedynamic211_22(int a0, long a1) throws Throwable;
private static native int __invokedynamic211_23(int a0, long a1) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead211_24(net.minecraft.client.gui.GuiSnooper a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings$Options __fieldRead211_25() throws Throwable;
private static native java.lang.String __call211_26(net.minecraft.client.settings.GameSettings a0, net.minecraft.client.settings.GameSettings$Options a1) throws Throwable;
private static native void __fieldWrite211_28(net.minecraft.client.gui.GuiSnooper a0, moom.gc a1) throws Throwable;
private static native boolean __call211_29(java.util.List a0, moom.gc a1) throws Throwable;
private static native java.util.List __fieldRead211_30(net.minecraft.client.gui.GuiSnooper a0) throws Throwable;
private static native int __fieldRead211_31(net.minecraft.client.gui.GuiSnooper a0) throws Throwable;
private static native int __fieldRead211_32(net.minecraft.client.gui.GuiSnooper a0) throws Throwable;
private static native int __invokedynamic211_33(int a0, long a1) throws Throwable;
private static native int __invokedynamic211_34(int a0, long a1) throws Throwable;
private static native int __invokedynamic211_35(int a0, long a1) throws Throwable;
private static native java.lang.String __call211_36(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native boolean __call211_37(java.util.List a0, moom.gc a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead211_38(net.minecraft.client.gui.GuiSnooper a0) throws Throwable;
private static native net.minecraft.server.integrated.IntegratedServer __call211_39(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead211_40(net.minecraft.client.gui.GuiSnooper a0) throws Throwable;
private static native net.minecraft.server.integrated.IntegratedServer __call211_41(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.profiler.PlayerUsageSnooper __call211_42(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead211_43(net.minecraft.client.gui.GuiSnooper a0) throws Throwable;
private static native net.minecraft.profiler.PlayerUsageSnooper __call211_44(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.util.Map __call211_45(net.minecraft.profiler.PlayerUsageSnooper a0) throws Throwable;
private static native java.util.Set __call211_46(java.util.TreeMap a0) throws Throwable;
private static native java.util.Iterator __call211_47(java.util.Set a0) throws Throwable;
private static native boolean __call211_48(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call211_49(java.util.Iterator a0) throws Throwable;
private static native java.util.Map.Entry __cast211_50(java.lang.Object a0) throws Throwable;
private static native java.util.List __fieldRead211_51(net.minecraft.client.gui.GuiSnooper a0) throws Throwable;
private static native java.lang.Object __call211_52(java.util.Map.Entry a0) throws Throwable;
private static native java.lang.String __cast211_53(java.lang.Object a0) throws Throwable;
private static native java.lang.String __invokedynamic211_54(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native boolean __call211_55(java.util.List a0, java.lang.String a1) throws Throwable;
private static native java.util.List __fieldRead211_56(net.minecraft.client.gui.GuiSnooper a0) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead211_57(net.minecraft.client.gui.GuiSnooper a0) throws Throwable;
private static native java.lang.Object __call211_58(java.util.Map.Entry a0) throws Throwable;
private static native java.lang.String __cast211_59(java.lang.Object a0) throws Throwable;
private static native int __fieldRead211_60(net.minecraft.client.gui.GuiSnooper a0) throws Throwable;
private static native int __invokedynamic211_61(int a0, long a1) throws Throwable;
private static native java.lang.String __call211_62(net.minecraft.client.gui.FontRenderer a0, java.lang.String a1, int a2) throws Throwable;
private static native boolean __call211_63(java.util.List a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead211_64(net.minecraft.client.gui.GuiSnooper a0) throws Throwable;
private static native net.minecraft.server.integrated.IntegratedServer __call211_65(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.profiler.PlayerUsageSnooper __call211_66(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native java.util.Map __call211_67(net.minecraft.profiler.PlayerUsageSnooper a0) throws Throwable;
private static native java.util.Set __call211_68(java.util.TreeMap a0) throws Throwable;
private static native java.util.Iterator __call211_69(java.util.Set a0) throws Throwable;
private static native boolean __call211_70(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call211_71(java.util.Iterator a0) throws Throwable;
private static native java.util.Map.Entry __cast211_72(java.lang.Object a0) throws Throwable;
private static native java.util.List __fieldRead211_73(net.minecraft.client.gui.GuiSnooper a0) throws Throwable;
private static native java.lang.Object __call211_74(java.util.Map.Entry a0) throws Throwable;
private static native java.lang.String __cast211_75(java.lang.Object a0) throws Throwable;
private static native java.lang.String __invokedynamic211_76(java.lang.String a0) throws Throwable;
private static native boolean __call211_77(java.util.List a0, java.lang.String a1) throws Throwable;
private static native java.util.List __fieldRead211_78(net.minecraft.client.gui.GuiSnooper a0) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead211_79(net.minecraft.client.gui.GuiSnooper a0) throws Throwable;
private static native java.lang.Object __call211_80(java.util.Map.Entry a0) throws Throwable;
private static native java.lang.String __cast211_81(java.lang.Object a0) throws Throwable;
private static native int __fieldRead211_82(net.minecraft.client.gui.GuiSnooper a0) throws Throwable;
private static native int __invokedynamic211_83(int a0, long a1) throws Throwable;
private static native java.lang.String __call211_84(net.minecraft.client.gui.FontRenderer a0, java.lang.String a1, int a2) throws Throwable;
private static native boolean __call211_85(java.util.List a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite211_86(net.minecraft.client.gui.GuiSnooper a0, moom.ie a1) throws Throwable;
private static native java.lang.Exception __call1021100_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1021101_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1021102_0(moom.Oo a0) throws Throwable;

}


public void e() throws java.io.IOException {
super.e();
    ((moom.ie)(this.C)).c__Void();
    return;
}


public void c__Void() { __sourceHandlerCall_17b272d2d37fbfacb94b(this); }


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 16607;
      if (G[var3] == null) {
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
         long var5 = F[var3];
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
         Object[] var9 = (Object[])H.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               H.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/g_", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         G[var3] = var15;
      }

      return G[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.client.gui.GuiSnooper.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral10388_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/g_"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public void a(int p0, int p1, float p2) {
long local4 = (net.minecraft.client.gui.GuiSnooper.E ^ 63329942393271L);
    ((net.minecraft.client.gui.GuiSnooper)(this)).i();
    ((moom.ie)(this.C)).a(((int)(p0)), ((int)(p1)), ((float)(p2)));
    ((net.minecraft.client.gui.GuiSnooper)(this)).a(((net.minecraft.client.gui.FontRenderer)(this.p)), ((java.lang.String)(this.A)), ((int)((this.k / 2))), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic8655_7(7198, (6174542578444339764L ^ local4)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic8655_8(29139, (8734471593972197374L ^ local4)))));
    int local6 = __sourceIntrinsic_95e4e99d9b0c_invokedynamic8655_10(27664, (2505091872649902649L ^ local4));
    java.lang.String[] local7 = this.B;
    int local8 = (local7).length;
    int local9 = 0;
    while ((local9 < local8)) {
        java.lang.String local10 = (local7)[local9];
        ((net.minecraft.client.gui.GuiSnooper)(this)).a(((net.minecraft.client.gui.FontRenderer)(this.p)), ((java.lang.String)(local10)), ((int)((this.k / 2))), ((int)(local6)), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic8655_14(26203, (2815933211859120255L ^ local4)))));
        local6 = (local6 + ((net.minecraft.client.gui.FontRenderer)(this.p)).c);
        local9 += 1;
    }
    super.a(((int)(p0)), ((int)(p1)), ((float)(p2)));
    return;
}


protected void a__Void(moom.gc p0) throws java.io.IOException { __sourceHandlerCall_e0778114c45f040bdb7c(this, p0); }


private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic8655_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic8655_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic8655_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic8655_14(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral10388_0() throws E;
}
