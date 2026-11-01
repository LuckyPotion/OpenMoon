package net.minecraft.entity;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class EntityTracker {

private static org.apache.logging.log4j.Logger a;

private net.minecraft.world.WorldServer b;

private java.util.Set<moom.t3> c;

private moom.Dd<moom.t3> d;

private int e;

private static long f;

private static long[] g;

private static java.lang.Integer[] h;

private static java.util.Map i;

public EntityTracker(net.minecraft.world.WorldServer p0) {
super();
    this.c = com.google.common.collect.Sets.newHashSet();
    this.d = new moom.Dd();
    this.b = p0;
    this.e = ((__sourceExactCall_c05be346191bb1((p0))).a__BA()).a();
}


static {
f = ((long)(((moom._a)(moom._c.a(((long)(5136400158194286541L)), ((long)(-2357398577205333875L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(134835693832249L)))));
    i = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (net.minecraft.entity.EntityTracker.f ^ 36143102943972L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1852_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1852_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1852_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1852_14 = new byte[8];
    (__sourceSpill1852_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1852_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1852_16 = __sourceSpill1852_14;
    ((javax.crypto.Cipher)(__sourceSpill1852_11)).init(((int)(__sourceSpill1852_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1852_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1852_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[14];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "Ö\013nt{\004±û&©ÈG(\005\030¸)V¦\006¥\031E°é¥\005\rMµ.î.ÆÖô\037ÎÐó20¼\rT÷\035w\030ö[|É\006ù]y0LEòKf{Þ0^wåê\032®GôIy>\"Èfó\007"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1852_25 = local6_life21;
        int __sourceSpill1852_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1852_25)).substring(((int)(__sourceSpill1852_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1852_30 = local8_life19;
        int __sourceSpill1852_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1852_33 = new byte[8];
        (__sourceSpill1852_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1852_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1852_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1852_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1852_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1852_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1852_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1852_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1852_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1852_34)).doFinal(((byte[])(__sourceSpill1852_33)));
        (__sourceSpill1852_30)[__sourceSpill1852_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "½IV\034°ý«·8íecÉË"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1852_38 = local6_life21;
        int __sourceSpill1852_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1852_38)).substring(((int)(__sourceSpill1852_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1852_43 = local8_life19;
        int __sourceSpill1852_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1852_46 = new byte[8];
        (__sourceSpill1852_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1852_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1852_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1852_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1852_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1852_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1852_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1852_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1852_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1852_47)).doFinal(((byte[])(__sourceSpill1852_46)));
        (__sourceSpill1852_43)[__sourceSpill1852_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    g = ((long[])(local8_life19));
    h = ((java.lang.Integer[])(new java.lang.Integer[14]));
    a = ((org.apache.logging.log4j.Logger)(org.apache.logging.log4j.LogManager.getLogger()));
}

private static native <E extends Throwable> void __sourceHandlerCall_47b682f9bf55bff2446f(net.minecraft.entity.EntityTracker a0) throws E;
private static final class __SourceHandler_47b682f9bf55bff2446f {

public static void f1107(net.minecraft.entity.EntityTracker receiver) throws Throwable {
    int forestValue1107_34_0;
    int forestValue1107_42_0;
    int forestValue1107_46_0;
    java.lang.Object forestValue1107_54_0;
    moom.t3 forestValue1107_76_0;
    int spill1107_0;
    boolean spill1107_1;
    moom.t3 spill1107_2;
    net.minecraft.entity.Entity spill1107_3;
    long life1_3;
    java.util.ArrayList life4_5;
    java.util.Iterator life5_10;
    int life3_11;
    moom.t3 life6_18;
    int life5_51;
    net.minecraft.entity.player.EntityPlayerMP life6_60;
    java.util.Iterator life7_64;
    moom.t3 life8_71;
    forest_join_83: {
    forest_join_46: {
    forest_join_45: {
    life1_3 = (__fieldRead1107_0() ^ 52713687787617L);
    life4_5 = __call1107_1();
    spill1107_0 = __call1107_2();
    life5_10 = __call1107_4(__fieldRead1107_3(receiver));
    life3_11 = spill1107_0;
    forest_cycle_12: while (true) {
    forest_join_43: {
    forest_join_42: {
    forest_join_34: {
    if (!(__call1107_5(life5_10))) {
        break forest_join_45;
    }
    life6_18 = __cast1107_7(__call1107_6(life5_10));
    __call1107_10(life6_18, __fieldRead1107_9(__fieldRead1107_8(receiver)));
    spill1107_1 = __fieldRead1107_11(life6_18);
    if (!((life3_11 == 0))) {
        forestValue1107_46_0 = __integerCategory1107_12(spill1107_1);
        break forest_join_46;
    }
    if (!((life3_11 == 0))) {
        forestValue1107_34_0 = __integerCategory1107_13(spill1107_1);
        break forest_join_34;
    }
    if (!(spill1107_1)) {
        break forest_join_43;
    }
    forestValue1107_34_0 = __instanceOf1107_15(__fieldRead1107_14(life6_18));
    }
    if (!((life3_11 == 0))) {
        forestValue1107_42_0 = forestValue1107_34_0;
        break forest_join_42;
    }
    if (!((forestValue1107_34_0 != 0))) {
        break forest_join_43;
    }
    forestValue1107_42_0 = __integerCategory1107_19(__call1107_18(life4_5, __cast1107_17(__fieldRead1107_16(life6_18))));
    }
    __discardScalar1107_20(forestValue1107_42_0);
    }
    if (!((life3_11 != 0))) {
        continue forest_cycle_12;
    }
    break forest_cycle_12;
    }
    }
    forestValue1107_46_0 = 0;
    }
    life5_51 = forestValue1107_46_0;
    forest_cycle_47: while (true) {
    forest_join_80: {
    if (!((life5_51 < __call1107_21(life4_5)))) {
        break forest_join_83;
    }
    forestValue1107_54_0 = __call1107_22(life4_5, life5_51);
    forest_cycle_54: while (true) {
    life6_60 = __cast1107_23(forestValue1107_54_0);
    life7_64 = __call1107_25(__fieldRead1107_24(receiver));
    forest_cycle_60: while (true) {
    forest_join_78: {
    forest_join_76: {
    if (!(__call1107_26(life7_64))) {
        break forest_join_80;
    }
    life8_71 = __cast1107_28(__call1107_27(life7_64));
    spill1107_2 = life8_71;
    if (!((life3_11 == 0))) {
        forestValue1107_76_0 = spill1107_2;
        break forest_join_76;
    }
    spill1107_3 = __fieldRead1107_29(spill1107_2);
    if (!((life3_11 == 0))) {
        forestValue1107_54_0 = spill1107_3;
        continue forest_cycle_54;
    }
    if (!((spill1107_3 != life6_60))) {
        break forest_join_78;
    }
    forestValue1107_76_0 = life8_71;
    }
    __call1107_30(forestValue1107_76_0, life6_60);
    }
    if (!((life3_11 != 0))) {
        continue forest_cycle_60;
    }
    break forest_cycle_60;
    }
    break forest_cycle_54;
    }
    }
    life5_51 += 1;
    if (!((life3_11 != 0))) {
        continue forest_cycle_47;
    }
    break forest_cycle_47;
    }
    }
    return;
}
public static void h1107_0(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3110700_0(p0);
}
public static void h1107_1(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3110701_0(p0);
}
public static void h1107_2(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3110702_0(p0);
}
public static void h1107_3(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3110703_0(p0);
}
public static void h1107_4(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3110704_0(p0);
}
public static void h1107_5(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3110705_0(p0);
}
public static void h1107_6(java.lang.IllegalStateException p0) throws Throwable {
    throw __call3110706_0(p0);
}
private static native long __fieldRead1107_0() throws Throwable;
private static native java.util.ArrayList __call1107_1() throws Throwable;
private static native int __call1107_2() throws Throwable;
private static native java.util.Set __fieldRead1107_3(net.minecraft.entity.EntityTracker a0) throws Throwable;
private static native java.util.Iterator __call1107_4(java.util.Set a0) throws Throwable;
private static native boolean __call1107_5(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1107_6(java.util.Iterator a0) throws Throwable;
private static native moom.t3 __cast1107_7(java.lang.Object a0) throws Throwable;
private static native net.minecraft.world.WorldServer __fieldRead1107_8(net.minecraft.entity.EntityTracker a0) throws Throwable;
private static native java.util.List __fieldRead1107_9(net.minecraft.world.WorldServer a0) throws Throwable;
private static native void __call1107_10(moom.t3 a0, java.util.List a1) throws Throwable;
private static native boolean __fieldRead1107_11(moom.t3 a0) throws Throwable;
private static native int __integerCategory1107_12(boolean value) throws Throwable;
private static native int __integerCategory1107_13(boolean value) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead1107_14(moom.t3 a0) throws Throwable;
private static native int __instanceOf1107_15(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead1107_16(moom.t3 a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __cast1107_17(net.minecraft.entity.Entity a0) throws Throwable;
private static native boolean __call1107_18(java.util.ArrayList a0, net.minecraft.entity.player.EntityPlayerMP a1) throws Throwable;
private static native int __integerCategory1107_19(boolean value) throws Throwable;
private static native void __discardScalar1107_20(int a0) throws Throwable;
private static native int __call1107_21(java.util.ArrayList a0) throws Throwable;
private static native java.lang.Object __call1107_22(java.util.ArrayList a0, int a1) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __cast1107_23(java.lang.Object a0) throws Throwable;
private static native java.util.Set __fieldRead1107_24(net.minecraft.entity.EntityTracker a0) throws Throwable;
private static native java.util.Iterator __call1107_25(java.util.Set a0) throws Throwable;
private static native boolean __call1107_26(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1107_27(java.util.Iterator a0) throws Throwable;
private static native moom.t3 __cast1107_28(java.lang.Object a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead1107_29(moom.t3 a0) throws Throwable;
private static native void __call1107_30(moom.t3 a0, net.minecraft.entity.player.EntityPlayerMP a1) throws Throwable;
private static native java.lang.Throwable __call3110700_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3110701_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3110702_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3110703_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3110704_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3110705_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call3110706_0(java.lang.IllegalStateException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_d1d1e02dbbbfa8dccd4d(net.minecraft.entity.EntityTracker a0, net.minecraft.entity.Entity a1) throws E;
private static final class __SourceHandler_d1d1e02dbbbfa8dccd4d {

public static void f1542(net.minecraft.entity.EntityTracker receiver, net.minecraft.entity.Entity p0) throws Throwable {
    moom.t3 lexicalValue1542_43_0;
    int lexicalValue1542_51_0;
    int lexicalValue1542_68_0;
    int lexicalValue1542_89_0;
    int lexicalValue1542_110_0;
    int lexicalValue1542_131_0;
    int lexicalValue1542_152_0;
    int lexicalValue1542_173_0;
    int lexicalValue1542_190_0;
    int lexicalValue1542_211_0;
    int lexicalValue1542_232_0;
    int lexicalValue1542_253_0;
    int lexicalValue1542_274_0;
    int lexicalValue1542_295_0;
    int lexicalValue1542_312_0;
    int lexicalValue1542_329_0;
    int lexicalValue1542_346_0;
    int lexicalValue1542_363_0;
    int lexicalValue1542_380_0;
    int lexicalValue1542_397_0;
    int lexicalValue1542_414_0;
    int lexicalValue1542_435_0;
    int lexicalValue1542_456_0;
    int lexicalValue1542_477_0;
    int lexicalValue1542_494_0;
    int lexicalValue1542_515_0;
    int spill1542_0;
    moom.t3 spill1542_1;
    long life2_3;
    int life4_5;
    net.minecraft.entity.player.EntityPlayerMP life5_16;
    java.util.Iterator life6_29;
    moom.t3 life7_36;
    lexical_join_530: {
    lexical_join_515: {
    lexical_join_513: {
    lexical_join_494: {
    lexical_join_492: {
    lexical_join_477: {
    lexical_join_475: {
    lexical_join_456: {
    lexical_join_454: {
    lexical_join_435: {
    lexical_join_433: {
    lexical_join_414: {
    lexical_join_412: {
    lexical_join_397: {
    lexical_join_395: {
    lexical_join_380: {
    lexical_join_378: {
    lexical_join_363: {
    lexical_join_361: {
    lexical_join_346: {
    lexical_join_344: {
    lexical_join_329: {
    lexical_join_327: {
    lexical_join_312: {
    lexical_join_310: {
    lexical_join_295: {
    lexical_join_293: {
    lexical_join_274: {
    lexical_join_272: {
    lexical_join_253: {
    lexical_join_251: {
    lexical_join_232: {
    lexical_join_230: {
    lexical_join_211: {
    lexical_join_209: {
    lexical_join_190: {
    lexical_join_188: {
    lexical_join_173: {
    lexical_join_171: {
    lexical_join_152: {
    lexical_join_150: {
    lexical_join_131: {
    lexical_join_129: {
    lexical_join_110: {
    lexical_join_108: {
    lexical_join_89: {
    lexical_join_87: {
    lexical_join_68: {
    lexical_join_66: {
    lexical_join_51: {
    lexical_join_49: {
    lexical_join_47: {
    life2_3 = (__fieldRead1542_0() ^ 102942097577200L);
    life4_5 = __call1542_1();
    spill1542_0 = __instanceOf1542_2(p0);
    if (!((life4_5 != 0))) {
        lexicalValue1542_51_0 = spill1542_0;
        break lexical_join_51;
    }
    if (!((spill1542_0 != 0))) {
        break lexical_join_49;
    }
    life5_16 = __cast1542_3(p0);
    __call1542_5(receiver, p0, __invokedynamic1542_4(7983, (4931291018384576523L ^ life2_3)), 2);
    life6_29 = __call1542_7(__fieldRead1542_6(receiver));
    lexical_cycle_27: while (true) {
    lexical_join_45: {
    lexical_join_43: {
    if (!(__call1542_8(life6_29))) {
        break lexical_join_47;
    }
    life7_36 = __cast1542_10(__call1542_9(life6_29));
    if (!((life4_5 != 0))) {
        break lexical_join_530;
    }
    spill1542_1 = life7_36;
    if (!((life4_5 != 0))) {
        lexicalValue1542_43_0 = spill1542_1;
        break lexical_join_43;
    }
    if (!((__fieldRead1542_11(spill1542_1) != life5_16))) {
        break lexical_join_45;
    }
    lexicalValue1542_43_0 = life7_36;
    }
    __call1542_12(lexicalValue1542_43_0, life5_16);
    }
    if (!((life4_5 == 0))) { continue lexical_cycle_27; }
    break lexical_cycle_27;
    }
    }
    if (!((life4_5 == 0))) {
        break lexical_join_530;
    }
    }
    lexicalValue1542_51_0 = __instanceOf1542_13(p0);
    }
    if (!((life4_5 != 0))) {
        lexicalValue1542_68_0 = lexicalValue1542_51_0;
        break lexical_join_68;
    }
    if (!((lexicalValue1542_51_0 != 0))) {
        break lexical_join_66;
    }
    __call1542_15(receiver, p0, __invokedynamic1542_14(3631, (8336266813404512517L ^ life2_3)), 5, 1);
    if (!((life4_5 == 0))) {
        break lexical_join_530;
    }
    }
    lexicalValue1542_68_0 = __instanceOf1542_16(p0);
    }
    if (!((life4_5 != 0))) {
        lexicalValue1542_89_0 = lexicalValue1542_68_0;
        break lexical_join_89;
    }
    if (!((lexicalValue1542_68_0 != 0))) {
        break lexical_join_87;
    }
    __call1542_19(receiver, p0, __invokedynamic1542_17(15589, (6421869077142614984L ^ life2_3)), __invokedynamic1542_18(299, (4230073922757103115L ^ life2_3)), 0);
    if (!((life4_5 == 0))) {
        break lexical_join_530;
    }
    }
    lexicalValue1542_89_0 = __instanceOf1542_20(p0);
    }
    if (!((life4_5 != 0))) {
        lexicalValue1542_110_0 = lexicalValue1542_89_0;
        break lexical_join_110;
    }
    if (!((lexicalValue1542_89_0 != 0))) {
        break lexical_join_108;
    }
    __call1542_23(receiver, p0, __invokedynamic1542_21(15589, (6421869077142614984L ^ life2_3)), __invokedynamic1542_22(2643, (6465731544477599094L ^ life2_3)), 0);
    if (!((life4_5 == 0))) {
        break lexical_join_530;
    }
    }
    lexicalValue1542_110_0 = __instanceOf1542_24(p0);
    }
    if (!((life4_5 != 0))) {
        lexicalValue1542_131_0 = lexicalValue1542_110_0;
        break lexical_join_131;
    }
    if (!((lexicalValue1542_110_0 != 0))) {
        break lexical_join_129;
    }
    __call1542_27(receiver, p0, __invokedynamic1542_25(15589, (6421869077142614984L ^ life2_3)), __invokedynamic1542_26(13035, (9046474435580411338L ^ life2_3)), 0);
    if (!((life4_5 == 0))) {
        break lexical_join_530;
    }
    }
    lexicalValue1542_131_0 = __instanceOf1542_28(p0);
    }
    if (!((life4_5 != 0))) {
        lexicalValue1542_152_0 = lexicalValue1542_131_0;
        break lexical_join_152;
    }
    if (!((lexicalValue1542_131_0 != 0))) {
        break lexical_join_150;
    }
    __call1542_31(receiver, p0, __invokedynamic1542_29(15589, (6421869077142614984L ^ life2_3)), __invokedynamic1542_30(13035, (9046474435580411338L ^ life2_3)), 1);
    if (!((life4_5 == 0))) {
        break lexical_join_530;
    }
    }
    lexicalValue1542_152_0 = __instanceOf1542_32(p0);
    }
    if (!((life4_5 != 0))) {
        lexicalValue1542_173_0 = lexicalValue1542_152_0;
        break lexical_join_173;
    }
    if (!((lexicalValue1542_152_0 != 0))) {
        break lexical_join_171;
    }
    __call1542_35(receiver, p0, __invokedynamic1542_33(15589, (6421869077142614984L ^ life2_3)), __invokedynamic1542_34(13035, (9046474435580411338L ^ life2_3)), 1);
    if (!((life4_5 == 0))) {
        break lexical_join_530;
    }
    }
    lexicalValue1542_173_0 = __instanceOf1542_36(p0);
    }
    if (!((life4_5 != 0))) {
        lexicalValue1542_190_0 = lexicalValue1542_173_0;
        break lexical_join_190;
    }
    if (!((lexicalValue1542_173_0 != 0))) {
        break lexical_join_188;
    }
    __call1542_38(receiver, p0, __invokedynamic1542_37(15589, (6421869077142614984L ^ life2_3)), 4, 1);
    if (!((life4_5 == 0))) {
        break lexical_join_530;
    }
    }
    lexicalValue1542_190_0 = __instanceOf1542_39(p0);
    }
    if (!((life4_5 != 0))) {
        lexicalValue1542_211_0 = lexicalValue1542_190_0;
        break lexical_join_211;
    }
    if (!((lexicalValue1542_190_0 != 0))) {
        break lexical_join_209;
    }
    __call1542_42(receiver, p0, __invokedynamic1542_40(15589, (6421869077142614984L ^ life2_3)), __invokedynamic1542_41(13035, (9046474435580411338L ^ life2_3)), 1);
    if (!((life4_5 == 0))) {
        break lexical_join_530;
    }
    }
    lexicalValue1542_211_0 = __instanceOf1542_43(p0);
    }
    if (!((life4_5 != 0))) {
        lexicalValue1542_232_0 = lexicalValue1542_211_0;
        break lexical_join_232;
    }
    if (!((lexicalValue1542_211_0 != 0))) {
        break lexical_join_230;
    }
    __call1542_46(receiver, p0, __invokedynamic1542_44(15589, (6421869077142614984L ^ life2_3)), __invokedynamic1542_45(13035, (9046474435580411338L ^ life2_3)), 1);
    if (!((life4_5 == 0))) {
        break lexical_join_530;
    }
    }
    lexicalValue1542_232_0 = __instanceOf1542_47(p0);
    }
    if (!((life4_5 != 0))) {
        lexicalValue1542_253_0 = lexicalValue1542_232_0;
        break lexical_join_253;
    }
    if (!((lexicalValue1542_232_0 != 0))) {
        break lexical_join_251;
    }
    __call1542_50(receiver, p0, __invokedynamic1542_48(15589, (6421869077142614984L ^ life2_3)), __invokedynamic1542_49(13035, (9046474435580411338L ^ life2_3)), 1);
    if (!((life4_5 == 0))) {
        break lexical_join_530;
    }
    }
    lexicalValue1542_253_0 = __instanceOf1542_51(p0);
    }
    if (!((life4_5 != 0))) {
        lexicalValue1542_274_0 = lexicalValue1542_253_0;
        break lexical_join_274;
    }
    if (!((lexicalValue1542_253_0 != 0))) {
        break lexical_join_272;
    }
    __call1542_54(receiver, p0, __invokedynamic1542_52(15589, (6421869077142614984L ^ life2_3)), __invokedynamic1542_53(13035, (9046474435580411338L ^ life2_3)), 1);
    if (!((life4_5 == 0))) {
        break lexical_join_530;
    }
    }
    lexicalValue1542_274_0 = __instanceOf1542_55(p0);
    }
    if (!((life4_5 != 0))) {
        lexicalValue1542_295_0 = lexicalValue1542_274_0;
        break lexical_join_295;
    }
    if (!((lexicalValue1542_274_0 != 0))) {
        break lexical_join_293;
    }
    __call1542_58(receiver, p0, __invokedynamic1542_56(15589, (6421869077142614984L ^ life2_3)), __invokedynamic1542_57(32149, (2442918132336390838L ^ life2_3)), 1);
    if (!((life4_5 == 0))) {
        break lexical_join_530;
    }
    }
    lexicalValue1542_295_0 = __instanceOf1542_59(p0);
    }
    if (!((life4_5 != 0))) {
        lexicalValue1542_312_0 = lexicalValue1542_295_0;
        break lexical_join_312;
    }
    if (!((lexicalValue1542_295_0 != 0))) {
        break lexical_join_310;
    }
    __call1542_61(receiver, p0, __invokedynamic1542_60(21667, (6060649825524407172L ^ life2_3)), 3, 1);
    if (!((life4_5 == 0))) {
        break lexical_join_530;
    }
    }
    lexicalValue1542_312_0 = __instanceOf1542_62(p0);
    }
    if (!((life4_5 != 0))) {
        lexicalValue1542_329_0 = lexicalValue1542_312_0;
        break lexical_join_329;
    }
    if (!((lexicalValue1542_312_0 != 0))) {
        break lexical_join_327;
    }
    __call1542_64(receiver, p0, __invokedynamic1542_63(30215, (2930505622364879144L ^ life2_3)), 3, 1);
    if (!((life4_5 == 0))) {
        break lexical_join_530;
    }
    }
    lexicalValue1542_329_0 = __instanceOf1542_65(p0);
    }
    if (!((life4_5 != 0))) {
        lexicalValue1542_346_0 = lexicalValue1542_329_0;
        break lexical_join_346;
    }
    if (!((lexicalValue1542_329_0 != 0))) {
        break lexical_join_344;
    }
    __call1542_67(receiver, p0, __invokedynamic1542_66(15589, (6421869077142614984L ^ life2_3)), 3, 1);
    if (!((life4_5 == 0))) {
        break lexical_join_530;
    }
    }
    lexicalValue1542_346_0 = __instanceOf1542_68(p0);
    }
    if (!((life4_5 != 0))) {
        lexicalValue1542_363_0 = lexicalValue1542_346_0;
        break lexical_join_363;
    }
    if (!((lexicalValue1542_346_0 != 0))) {
        break lexical_join_361;
    }
    __call1542_70(receiver, p0, __invokedynamic1542_69(30215, (2930505622364879144L ^ life2_3)), 3, 0);
    if (!((life4_5 == 0))) {
        break lexical_join_530;
    }
    }
    lexicalValue1542_363_0 = __instanceOf1542_71(p0);
    }
    if (!((life4_5 != 0))) {
        lexicalValue1542_380_0 = lexicalValue1542_363_0;
        break lexical_join_380;
    }
    if (!((lexicalValue1542_363_0 != 0))) {
        break lexical_join_378;
    }
    __call1542_73(receiver, p0, __invokedynamic1542_72(30215, (2930505622364879144L ^ life2_3)), 3, 0);
    if (!((life4_5 == 0))) {
        break lexical_join_530;
    }
    }
    lexicalValue1542_380_0 = __instanceOf1542_74(p0);
    }
    if (!((life4_5 != 0))) {
        lexicalValue1542_397_0 = lexicalValue1542_380_0;
        break lexical_join_397;
    }
    if (!((lexicalValue1542_380_0 != 0))) {
        break lexical_join_395;
    }
    __call1542_76(receiver, p0, __invokedynamic1542_75(10659, (9079541151037007489L ^ life2_3)), 3, 1);
    if (!((life4_5 == 0))) {
        break lexical_join_530;
    }
    }
    lexicalValue1542_397_0 = __instanceOf1542_77(p0);
    }
    if (!((life4_5 != 0))) {
        lexicalValue1542_414_0 = lexicalValue1542_397_0;
        break lexical_join_414;
    }
    if (!((lexicalValue1542_397_0 != 0))) {
        break lexical_join_412;
    }
    __call1542_79(receiver, p0, __invokedynamic1542_78(30215, (2930505622364879144L ^ life2_3)), 3, 1);
    if (!((life4_5 == 0))) {
        break lexical_join_530;
    }
    }
    lexicalValue1542_414_0 = __instanceOf1542_80(p0);
    }
    if (!((life4_5 != 0))) {
        lexicalValue1542_435_0 = lexicalValue1542_414_0;
        break lexical_join_435;
    }
    if (!((lexicalValue1542_414_0 != 0))) {
        break lexical_join_433;
    }
    __call1542_83(receiver, p0, __invokedynamic1542_81(21295, (6017362715311332353L ^ life2_3)), __invokedynamic1542_82(13035, (9046474435580411338L ^ life2_3)), 1);
    if (!((life4_5 == 0))) {
        break lexical_join_530;
    }
    }
    lexicalValue1542_435_0 = __instanceOf1542_84(p0);
    }
    if (!((life4_5 != 0))) {
        lexicalValue1542_456_0 = lexicalValue1542_435_0;
        break lexical_join_456;
    }
    if (!((lexicalValue1542_435_0 != 0))) {
        break lexical_join_454;
    }
    __call1542_87(receiver, p0, __invokedynamic1542_85(21295, (6017362715311332353L ^ life2_3)), __invokedynamic1542_86(32149, (2442918132336390838L ^ life2_3)), 1);
    if (!((life4_5 == 0))) {
        break lexical_join_530;
    }
    }
    lexicalValue1542_456_0 = __instanceOf1542_88(p0);
    }
    if (!((life4_5 != 0))) {
        lexicalValue1542_477_0 = lexicalValue1542_456_0;
        break lexical_join_477;
    }
    if (!((lexicalValue1542_456_0 != 0))) {
        break lexical_join_475;
    }
    __call1542_91(receiver, p0, __invokedynamic1542_89(21295, (6017362715311332353L ^ life2_3)), __invokedynamic1542_90(11435, (6383755083659780992L ^ life2_3)), 0);
    if (!((life4_5 == 0))) {
        break lexical_join_530;
    }
    }
    lexicalValue1542_477_0 = __instanceOf1542_92(p0);
    }
    if (!((life4_5 != 0))) {
        lexicalValue1542_494_0 = lexicalValue1542_477_0;
        break lexical_join_494;
    }
    if (!((lexicalValue1542_477_0 != 0))) {
        break lexical_join_492;
    }
    __call1542_94(receiver, p0, __invokedynamic1542_93(21295, (6017362715311332353L ^ life2_3)), 3, 1);
    if (!((life4_5 == 0))) {
        break lexical_join_530;
    }
    }
    lexicalValue1542_494_0 = __instanceOf1542_95(p0);
    }
    if (!((life4_5 != 0))) {
        lexicalValue1542_515_0 = lexicalValue1542_494_0;
        break lexical_join_515;
    }
    if (!((lexicalValue1542_494_0 != 0))) {
        break lexical_join_513;
    }
    __call1542_98(receiver, p0, __invokedynamic1542_96(21295, (6017362715311332353L ^ life2_3)), __invokedynamic1542_97(32149, (2442918132336390838L ^ life2_3)), 1);
    if (!((life4_5 == 0))) {
        break lexical_join_530;
    }
    }
    lexicalValue1542_515_0 = __instanceOf1542_99(p0);
    }
    if (!((lexicalValue1542_515_0 != 0))) {
        break lexical_join_530;
    }
    __call1542_102(receiver, p0, __invokedynamic1542_100(3243, (5164631578543620999L ^ life2_3)), __invokedynamic1542_101(21080, (3679462229598592382L ^ life2_3)), 0);
    }
    return;
}
public static void h1542_0(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1154200_0(p0);
}
public static void h1542_1(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1154201_0(p0);
}
public static void h1542_2(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1154202_0(p0);
}
public static void h1542_3(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1154203_0(p0);
}
public static void h1542_4(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1154204_0(p0);
}
public static void h1542_5(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1154205_0(p0);
}
public static void h1542_6(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1154206_0(p0);
}
public static void h1542_7(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1154207_0(p0);
}
public static void h1542_8(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1154208_0(p0);
}
public static void h1542_9(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1154209_0(p0);
}
public static void h1542_10(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1154210_0(p0);
}
public static void h1542_11(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1154211_0(p0);
}
public static void h1542_12(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1154212_0(p0);
}
public static void h1542_13(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1154213_0(p0);
}
public static void h1542_14(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1154214_0(p0);
}
public static void h1542_15(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1154215_0(p0);
}
public static void h1542_16(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1154216_0(p0);
}
public static void h1542_17(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1154217_0(p0);
}
public static void h1542_18(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1154218_0(p0);
}
public static void h1542_19(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1154219_0(p0);
}
public static void h1542_20(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1154220_0(p0);
}
public static void h1542_21(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1154221_0(p0);
}
public static void h1542_22(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1154222_0(p0);
}
public static void h1542_23(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1154223_0(p0);
}
public static void h1542_24(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1154224_0(p0);
}
public static void h1542_25(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1154225_0(p0);
}
public static void h1542_26(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1154226_0(p0);
}
public static void h1542_27(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1154227_0(p0);
}
public static void h1542_28(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1154228_0(p0);
}
public static void h1542_29(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1154229_0(p0);
}
public static void h1542_30(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1154230_0(p0);
}
public static void h1542_31(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1154231_0(p0);
}
public static void h1542_32(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1154232_0(p0);
}
public static void h1542_33(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1154233_0(p0);
}
public static void h1542_34(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1154234_0(p0);
}
public static void h1542_35(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1154235_0(p0);
}
public static void h1542_36(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1154236_0(p0);
}
public static void h1542_37(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1154237_0(p0);
}
public static void h1542_38(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1154238_0(p0);
}
public static void h1542_39(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1154239_0(p0);
}
public static void h1542_40(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1154240_0(p0);
}
public static void h1542_41(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1154241_0(p0);
}
public static void h1542_42(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1154242_0(p0);
}
public static void h1542_43(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1154243_0(p0);
}
public static void h1542_44(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1154244_0(p0);
}
public static void h1542_45(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1154245_0(p0);
}
public static void h1542_46(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1154246_0(p0);
}
public static void h1542_47(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1154247_0(p0);
}
public static void h1542_48(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1154248_0(p0);
}
public static void h1542_49(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1154249_0(p0);
}
public static void h1542_50(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1154250_0(p0);
}
public static void h1542_51(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1154251_0(p0);
}
public static void h1542_52(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1154252_0(p0);
}
public static void h1542_53(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1154253_0(p0);
}
public static void h1542_54(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1154254_0(p0);
}
public static void h1542_55(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1154255_0(p0);
}
public static void h1542_56(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1154256_0(p0);
}
public static void h1542_57(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1154257_0(p0);
}
public static void h1542_58(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1154258_0(p0);
}
public static void h1542_59(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1154259_0(p0);
}
public static void h1542_60(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1154260_0(p0);
}
public static void h1542_61(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1154261_0(p0);
}
public static void h1542_62(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1154262_0(p0);
}
public static void h1542_63(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1154263_0(p0);
}
public static void h1542_64(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1154264_0(p0);
}
public static void h1542_65(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1154265_0(p0);
}
public static void h1542_66(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1154266_0(p0);
}
public static void h1542_67(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1154267_0(p0);
}
public static void h1542_68(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1154268_0(p0);
}
public static void h1542_69(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1154269_0(p0);
}
public static void h1542_70(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1154270_0(p0);
}
public static void h1542_71(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1154271_0(p0);
}
public static void h1542_72(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1154272_0(p0);
}
public static void h1542_73(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1154273_0(p0);
}
public static void h1542_74(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1154274_0(p0);
}
public static void h1542_75(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1154275_0(p0);
}
public static void h1542_76(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1154276_0(p0);
}
public static void h1542_77(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1154277_0(p0);
}
private static native long __fieldRead1542_0() throws Throwable;
private static native int __call1542_1() throws Throwable;
private static native int __instanceOf1542_2(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __cast1542_3(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __invokedynamic1542_4(int a0, long a1) throws Throwable;
private static native void __call1542_5(net.minecraft.entity.EntityTracker a0, net.minecraft.entity.Entity a1, int a2, int a3) throws Throwable;
private static native java.util.Set __fieldRead1542_6(net.minecraft.entity.EntityTracker a0) throws Throwable;
private static native java.util.Iterator __call1542_7(java.util.Set a0) throws Throwable;
private static native boolean __call1542_8(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1542_9(java.util.Iterator a0) throws Throwable;
private static native moom.t3 __cast1542_10(java.lang.Object a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead1542_11(moom.t3 a0) throws Throwable;
private static native void __call1542_12(moom.t3 a0, net.minecraft.entity.player.EntityPlayerMP a1) throws Throwable;
private static native int __instanceOf1542_13(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __invokedynamic1542_14(int a0, long a1) throws Throwable;
private static native void __call1542_15(net.minecraft.entity.EntityTracker a0, net.minecraft.entity.Entity a1, int a2, int a3, int a4) throws Throwable;
private static native int __instanceOf1542_16(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __invokedynamic1542_17(int a0, long a1) throws Throwable;
private static native int __invokedynamic1542_18(int a0, long a1) throws Throwable;
private static native void __call1542_19(net.minecraft.entity.EntityTracker a0, net.minecraft.entity.Entity a1, int a2, int a3, int a4) throws Throwable;
private static native int __instanceOf1542_20(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __invokedynamic1542_21(int a0, long a1) throws Throwable;
private static native int __invokedynamic1542_22(int a0, long a1) throws Throwable;
private static native void __call1542_23(net.minecraft.entity.EntityTracker a0, net.minecraft.entity.Entity a1, int a2, int a3, int a4) throws Throwable;
private static native int __instanceOf1542_24(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __invokedynamic1542_25(int a0, long a1) throws Throwable;
private static native int __invokedynamic1542_26(int a0, long a1) throws Throwable;
private static native void __call1542_27(net.minecraft.entity.EntityTracker a0, net.minecraft.entity.Entity a1, int a2, int a3, int a4) throws Throwable;
private static native int __instanceOf1542_28(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __invokedynamic1542_29(int a0, long a1) throws Throwable;
private static native int __invokedynamic1542_30(int a0, long a1) throws Throwable;
private static native void __call1542_31(net.minecraft.entity.EntityTracker a0, net.minecraft.entity.Entity a1, int a2, int a3, int a4) throws Throwable;
private static native int __instanceOf1542_32(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __invokedynamic1542_33(int a0, long a1) throws Throwable;
private static native int __invokedynamic1542_34(int a0, long a1) throws Throwable;
private static native void __call1542_35(net.minecraft.entity.EntityTracker a0, net.minecraft.entity.Entity a1, int a2, int a3, int a4) throws Throwable;
private static native int __instanceOf1542_36(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __invokedynamic1542_37(int a0, long a1) throws Throwable;
private static native void __call1542_38(net.minecraft.entity.EntityTracker a0, net.minecraft.entity.Entity a1, int a2, int a3, int a4) throws Throwable;
private static native int __instanceOf1542_39(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __invokedynamic1542_40(int a0, long a1) throws Throwable;
private static native int __invokedynamic1542_41(int a0, long a1) throws Throwable;
private static native void __call1542_42(net.minecraft.entity.EntityTracker a0, net.minecraft.entity.Entity a1, int a2, int a3, int a4) throws Throwable;
private static native int __instanceOf1542_43(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __invokedynamic1542_44(int a0, long a1) throws Throwable;
private static native int __invokedynamic1542_45(int a0, long a1) throws Throwable;
private static native void __call1542_46(net.minecraft.entity.EntityTracker a0, net.minecraft.entity.Entity a1, int a2, int a3, int a4) throws Throwable;
private static native int __instanceOf1542_47(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __invokedynamic1542_48(int a0, long a1) throws Throwable;
private static native int __invokedynamic1542_49(int a0, long a1) throws Throwable;
private static native void __call1542_50(net.minecraft.entity.EntityTracker a0, net.minecraft.entity.Entity a1, int a2, int a3, int a4) throws Throwable;
private static native int __instanceOf1542_51(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __invokedynamic1542_52(int a0, long a1) throws Throwable;
private static native int __invokedynamic1542_53(int a0, long a1) throws Throwable;
private static native void __call1542_54(net.minecraft.entity.EntityTracker a0, net.minecraft.entity.Entity a1, int a2, int a3, int a4) throws Throwable;
private static native int __instanceOf1542_55(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __invokedynamic1542_56(int a0, long a1) throws Throwable;
private static native int __invokedynamic1542_57(int a0, long a1) throws Throwable;
private static native void __call1542_58(net.minecraft.entity.EntityTracker a0, net.minecraft.entity.Entity a1, int a2, int a3, int a4) throws Throwable;
private static native int __instanceOf1542_59(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __invokedynamic1542_60(int a0, long a1) throws Throwable;
private static native void __call1542_61(net.minecraft.entity.EntityTracker a0, net.minecraft.entity.Entity a1, int a2, int a3, int a4) throws Throwable;
private static native int __instanceOf1542_62(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __invokedynamic1542_63(int a0, long a1) throws Throwable;
private static native void __call1542_64(net.minecraft.entity.EntityTracker a0, net.minecraft.entity.Entity a1, int a2, int a3, int a4) throws Throwable;
private static native int __instanceOf1542_65(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __invokedynamic1542_66(int a0, long a1) throws Throwable;
private static native void __call1542_67(net.minecraft.entity.EntityTracker a0, net.minecraft.entity.Entity a1, int a2, int a3, int a4) throws Throwable;
private static native int __instanceOf1542_68(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __invokedynamic1542_69(int a0, long a1) throws Throwable;
private static native void __call1542_70(net.minecraft.entity.EntityTracker a0, net.minecraft.entity.Entity a1, int a2, int a3, int a4) throws Throwable;
private static native int __instanceOf1542_71(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __invokedynamic1542_72(int a0, long a1) throws Throwable;
private static native void __call1542_73(net.minecraft.entity.EntityTracker a0, net.minecraft.entity.Entity a1, int a2, int a3, int a4) throws Throwable;
private static native int __instanceOf1542_74(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __invokedynamic1542_75(int a0, long a1) throws Throwable;
private static native void __call1542_76(net.minecraft.entity.EntityTracker a0, net.minecraft.entity.Entity a1, int a2, int a3, int a4) throws Throwable;
private static native int __instanceOf1542_77(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __invokedynamic1542_78(int a0, long a1) throws Throwable;
private static native void __call1542_79(net.minecraft.entity.EntityTracker a0, net.minecraft.entity.Entity a1, int a2, int a3, int a4) throws Throwable;
private static native int __instanceOf1542_80(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __invokedynamic1542_81(int a0, long a1) throws Throwable;
private static native int __invokedynamic1542_82(int a0, long a1) throws Throwable;
private static native void __call1542_83(net.minecraft.entity.EntityTracker a0, net.minecraft.entity.Entity a1, int a2, int a3, int a4) throws Throwable;
private static native int __instanceOf1542_84(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __invokedynamic1542_85(int a0, long a1) throws Throwable;
private static native int __invokedynamic1542_86(int a0, long a1) throws Throwable;
private static native void __call1542_87(net.minecraft.entity.EntityTracker a0, net.minecraft.entity.Entity a1, int a2, int a3, int a4) throws Throwable;
private static native int __instanceOf1542_88(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __invokedynamic1542_89(int a0, long a1) throws Throwable;
private static native int __invokedynamic1542_90(int a0, long a1) throws Throwable;
private static native void __call1542_91(net.minecraft.entity.EntityTracker a0, net.minecraft.entity.Entity a1, int a2, int a3, int a4) throws Throwable;
private static native int __instanceOf1542_92(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __invokedynamic1542_93(int a0, long a1) throws Throwable;
private static native void __call1542_94(net.minecraft.entity.EntityTracker a0, net.minecraft.entity.Entity a1, int a2, int a3, int a4) throws Throwable;
private static native int __instanceOf1542_95(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __invokedynamic1542_96(int a0, long a1) throws Throwable;
private static native int __invokedynamic1542_97(int a0, long a1) throws Throwable;
private static native void __call1542_98(net.minecraft.entity.EntityTracker a0, net.minecraft.entity.Entity a1, int a2, int a3, int a4) throws Throwable;
private static native int __instanceOf1542_99(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __invokedynamic1542_100(int a0, long a1) throws Throwable;
private static native int __invokedynamic1542_101(int a0, long a1) throws Throwable;
private static native void __call1542_102(net.minecraft.entity.EntityTracker a0, net.minecraft.entity.Entity a1, int a2, int a3, int a4) throws Throwable;
private static native java.lang.Throwable __call1154200_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1154201_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1154202_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1154203_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1154204_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1154205_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1154206_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1154207_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1154208_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1154209_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1154210_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1154211_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1154212_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1154213_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1154214_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1154215_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1154216_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1154217_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1154218_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1154219_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1154220_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1154221_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1154222_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1154223_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1154224_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1154225_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1154226_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1154227_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1154228_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1154229_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1154230_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1154231_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1154232_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1154233_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1154234_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1154235_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1154236_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1154237_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1154238_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1154239_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1154240_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1154241_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1154242_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1154243_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1154244_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1154245_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1154246_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1154247_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1154248_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1154249_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1154250_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1154251_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1154252_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1154253_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1154254_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1154255_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1154256_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1154257_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1154258_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1154259_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1154260_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1154261_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1154262_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1154263_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1154264_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1154265_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1154266_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1154267_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1154268_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1154269_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1154270_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1154271_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1154272_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1154273_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1154274_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1154275_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1154276_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1154277_0(java.lang.IllegalStateException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_bb9e54da9dfcbe4032f9(net.minecraft.entity.EntityTracker a0, net.minecraft.entity.Entity a1, int a2, int a3, boolean a4) throws E;
private static final class __SourceHandler_bb9e54da9dfcbe4032f9 {

public static void f569(net.minecraft.entity.EntityTracker receiver, net.minecraft.entity.Entity p0, int p1, int p2, boolean p3) throws Throwable {
    int forwardValue569_20_0;
    int spill569_0;
    long life5_3;
    int life7_5;
    moom.t3 life8_38;
    forward_join_26: {
    forward_join_20: {
    forward_join_15: {
    life5_3 = (__fieldRead569_0() ^ 106543361466188L);
    life7_5 = __call569_1();
    spill569_0 = p1;
    if (!((life7_5 == 0))) {
        forwardValue569_20_0 = spill569_0;
        break forward_join_20;
    }
    if (!((spill569_0 > __fieldRead569_2(receiver)))) {
        break forward_join_15;
    }
    p1 = __fieldRead569_3(receiver);
    }
    forwardValue569_20_0 = __integerCategory569_7(__call569_6(__fieldRead569_4(receiver), __call569_5(p0)));
    }
    if (!((forwardValue569_20_0 != 0))) {
        break forward_join_26;
    }
    throw new java.lang.IllegalStateException("Entity is already tracked!");
    }
    life8_38 = new moom.t3(p0, p1, p2, p3);
    __call569_9(__fieldRead569_8(receiver), life8_38);
    __call569_12(__fieldRead569_10(receiver), __call569_11(p0), life8_38);
    __call569_15(life8_38, __fieldRead569_14(__fieldRead569_13(receiver)));
    return;
}
public static void h569_0(java.lang.Throwable p0) throws Throwable {
    throw __call2056900_0(p0);
}
public static void h569_1(java.lang.Throwable p0) throws Throwable {
    throw __call2056901_0(p0);
}
public static void h569_2(java.lang.Throwable p0, net.minecraft.entity.EntityTracker p1, net.minecraft.entity.Entity p2, int p3, int p4) throws Throwable {
    java.lang.Throwable local5 = p0;
    moom.qY local6 = __call2056902_0(local5, "Adding entity to track");
    moom.qZ local7 = __call2056902_1(local6, "Entity To Track");
    __call2056902_3(local7, "Tracking range", __invokedynamic2056902_2(p3));
    __call2056902_5(local7, "Update interval", __invokedynamic2056902_4(p4));
    __call2056902_6(p2, local7);
    moom.qZ local8 = __call2056902_7(local6, "Entity That Is Already Tracked");
    __call2056902_13(__fieldRead2056902_12(__cast2056902_11(__call2056902_10(__fieldRead2056902_8(p1), __call2056902_9(p2)))), local8);
    throw new moom.Oo(local6);
}
public static void h569_3(moom.Oo p0) throws Throwable {
    moom.Oo local1 = p0;
    __call2056903_1(__fieldRead2056903_0(), "\"Silently\" catching entity tracking error.", local1);
    return;
}
private static native long __fieldRead569_0() throws Throwable;
private static native int __call569_1() throws Throwable;
private static native int __fieldRead569_2(net.minecraft.entity.EntityTracker a0) throws Throwable;
private static native int __fieldRead569_3(net.minecraft.entity.EntityTracker a0) throws Throwable;
private static native moom.Dd __fieldRead569_4(net.minecraft.entity.EntityTracker a0) throws Throwable;
private static native int __call569_5(net.minecraft.entity.Entity a0) throws Throwable;
private static native boolean __call569_6(moom.Dd a0, int a1) throws Throwable;
private static native int __integerCategory569_7(boolean value) throws Throwable;
private static native java.util.Set __fieldRead569_8(net.minecraft.entity.EntityTracker a0) throws Throwable;
private static native boolean __call569_9(java.util.Set a0, moom.t3 a1) throws Throwable;
private static native moom.Dd __fieldRead569_10(net.minecraft.entity.EntityTracker a0) throws Throwable;
private static native int __call569_11(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call569_12(moom.Dd a0, int a1, moom.t3 a2) throws Throwable;
private static native net.minecraft.world.WorldServer __fieldRead569_13(net.minecraft.entity.EntityTracker a0) throws Throwable;
private static native java.util.List __fieldRead569_14(net.minecraft.world.WorldServer a0) throws Throwable;
private static native void __call569_15(moom.t3 a0, java.util.List a1) throws Throwable;
private static native java.lang.Throwable __call2056900_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2056901_0(java.lang.Throwable a0) throws Throwable;
private static native moom.qY __call2056902_0(java.lang.Throwable a0, java.lang.String a1) throws Throwable;
private static native moom.qZ __call2056902_1(moom.qY a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic2056902_2(int a0) throws Throwable;
private static native void __call2056902_3(moom.qZ a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native java.util.concurrent.Callable __invokedynamic2056902_4(int a0) throws Throwable;
private static native void __call2056902_5(moom.qZ a0, java.lang.String a1, java.util.concurrent.Callable a2) throws Throwable;
private static native void __call2056902_6(net.minecraft.entity.Entity a0, moom.qZ a1) throws Throwable;
private static native moom.qZ __call2056902_7(moom.qY a0, java.lang.String a1) throws Throwable;
private static native moom.Dd __fieldRead2056902_8(net.minecraft.entity.EntityTracker a0) throws Throwable;
private static native int __call2056902_9(net.minecraft.entity.Entity a0) throws Throwable;
private static native java.lang.Object __call2056902_10(moom.Dd a0, int a1) throws Throwable;
private static native moom.t3 __cast2056902_11(java.lang.Object a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead2056902_12(moom.t3 a0) throws Throwable;
private static native void __call2056902_13(net.minecraft.entity.Entity a0, moom.qZ a1) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead2056903_0() throws Throwable;
private static native void __call2056903_1(org.apache.logging.log4j.Logger a0, java.lang.String a1, moom.Oo a2) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_b4caef63823ddc745c40(net.minecraft.entity.EntityTracker a0, net.minecraft.entity.Entity a1, moom.yK a2) throws E;
private static final class __SourceHandler_b4caef63823ddc745c40 {

public static void f1543(net.minecraft.entity.EntityTracker receiver, net.minecraft.entity.Entity p0, moom.yK p1) throws Throwable {
    moom.t3 forwardValue1543_18_0;
    int spill1543_0;
    moom.t3 spill1543_1;
    long life3_3;
    moom.t3 life6_11;
    int life5_12;
    forward_join_20: {
    forward_join_18: {
    life3_3 = (__fieldRead1543_0() ^ 51344419849027L);
    spill1543_0 = __call1543_1();
    life6_11 = __cast1543_5(__call1543_4(__fieldRead1543_2(receiver), __call1543_3(p0)));
    life5_12 = spill1543_0;
    spill1543_1 = life6_11;
    if (!((life5_12 == 0))) {
        forwardValue1543_18_0 = spill1543_1;
        break forward_join_18;
    }
    if (!((spill1543_1 != null))) {
        break forward_join_20;
    }
    forwardValue1543_18_0 = life6_11;
    }
    __call1543_6(forwardValue1543_18_0, p1);
    }
    return;
}
public static void h1543_0(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1154300_0(p0);
}
private static native long __fieldRead1543_0() throws Throwable;
private static native int __call1543_1() throws Throwable;
private static native moom.Dd __fieldRead1543_2(net.minecraft.entity.EntityTracker a0) throws Throwable;
private static native int __call1543_3(net.minecraft.entity.Entity a0) throws Throwable;
private static native java.lang.Object __call1543_4(moom.Dd a0, int a1) throws Throwable;
private static native moom.t3 __cast1543_5(java.lang.Object a0) throws Throwable;
private static native void __call1543_6(moom.t3 a0, moom.yK a1) throws Throwable;
private static native java.lang.Throwable __call1154300_0(java.lang.IllegalStateException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_93e8baa2f07c9bf75237(net.minecraft.entity.EntityTracker a0, net.minecraft.entity.player.EntityPlayerMP a1) throws E;
private static final class __SourceHandler_93e8baa2f07c9bf75237 {

public static void f1544(net.minecraft.entity.EntityTracker receiver, net.minecraft.entity.player.EntityPlayerMP p0) throws Throwable {
    moom.t3 lexicalValue1544_31_0;
    int spill1544_0;
    moom.t3 spill1544_1;
    long life2_3;
    java.util.Iterator life5_8;
    int life4_9;
    moom.t3 life6_16;
    lexical_join_35: {
    life2_3 = (__fieldRead1544_0() ^ 113253938879023L);
    spill1544_0 = __call1544_1();
    life5_8 = __call1544_3(__fieldRead1544_2(receiver));
    life4_9 = spill1544_0;
    lexical_cycle_10: while (true) {
    lexical_join_33: {
    lexical_join_31: {
    lexical_join_30: {
    if (!(__call1544_4(life5_8))) {
        break lexical_join_35;
    }
    life6_16 = __cast1544_6(__call1544_5(life5_8));
    spill1544_1 = life6_16;
    if (!((life4_9 == 0))) {
        lexicalValue1544_31_0 = spill1544_1;
        break lexical_join_31;
    }
    if (!((__fieldRead1544_7(spill1544_1) == p0))) {
        break lexical_join_30;
    }
    __call1544_10(life6_16, __fieldRead1544_9(__fieldRead1544_8(receiver)));
    if (!((life4_9 != 0))) {
        break lexical_join_33;
    }
    }
    lexicalValue1544_31_0 = life6_16;
    }
    __call1544_11(lexicalValue1544_31_0, p0);
    }
    if (!((life4_9 != 0))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    return;
}
public static void h1544_0(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1154400_0(p0);
}
public static void h1544_1(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1154401_0(p0);
}
public static void h1544_2(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1154402_0(p0);
}
private static native long __fieldRead1544_0() throws Throwable;
private static native int __call1544_1() throws Throwable;
private static native java.util.Set __fieldRead1544_2(net.minecraft.entity.EntityTracker a0) throws Throwable;
private static native java.util.Iterator __call1544_3(java.util.Set a0) throws Throwable;
private static native boolean __call1544_4(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1544_5(java.util.Iterator a0) throws Throwable;
private static native moom.t3 __cast1544_6(java.lang.Object a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead1544_7(moom.t3 a0) throws Throwable;
private static native net.minecraft.world.WorldServer __fieldRead1544_8(net.minecraft.entity.EntityTracker a0) throws Throwable;
private static native java.util.List __fieldRead1544_9(net.minecraft.world.WorldServer a0) throws Throwable;
private static native void __call1544_10(moom.t3 a0, java.util.List a1) throws Throwable;
private static native void __call1544_11(moom.t3 a0, net.minecraft.entity.player.EntityPlayerMP a1) throws Throwable;
private static native java.lang.Throwable __call1154400_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1154401_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1154402_0(java.lang.IllegalStateException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_122c9e66d21fbeb9e56d(net.minecraft.entity.EntityTracker a0, net.minecraft.entity.player.EntityPlayerMP a1, net.minecraft.world.chunk.Chunk a2) throws E;
private static final class __SourceHandler_122c9e66d21fbeb9e56d {

public static void f1545(net.minecraft.entity.EntityTracker receiver, net.minecraft.entity.player.EntityPlayerMP p0, net.minecraft.world.chunk.Chunk p1) throws Throwable {
    net.minecraft.entity.Entity lexicalValue1545_25_0;
    int lexicalValue1545_38_0;
    int lexicalValue1545_38_1;
    moom.t3 lexicalValue1545_40_0;
    int spill1545_0;
    net.minecraft.entity.Entity spill1545_1;
    int spill1545_2;
    int spill1545_3;
    moom.t3 spill1545_4;
    long life3_3;
    java.util.Iterator life6_8;
    int life5_9;
    moom.t3 life7_16;
    lexical_join_44: {
    life3_3 = (__fieldRead1545_0() ^ 28458068947732L);
    spill1545_0 = __call1545_1();
    life6_8 = __call1545_3(__fieldRead1545_2(receiver));
    life5_9 = spill1545_0;
    lexical_cycle_10: while (true) {
    lexical_join_42: {
    lexical_join_40: {
    lexical_join_38: {
    lexical_join_25: {
    if (!(__call1545_4(life6_8))) {
        break lexical_join_44;
    }
    life7_16 = __cast1545_6(__call1545_5(life6_8));
    spill1545_1 = __fieldRead1545_7(life7_16);
    if (!((life5_9 == 0))) {
        lexicalValue1545_25_0 = spill1545_1;
        break lexical_join_25;
    }
    if (!((spill1545_1 != p0))) {
        break lexical_join_42;
    }
    lexicalValue1545_25_0 = __fieldRead1545_8(life7_16);
    }
    spill1545_2 = __fieldRead1545_9(lexicalValue1545_25_0);
    spill1545_3 = __fieldRead1545_10(p1);
    if (!((life5_9 == 0))) {
        lexicalValue1545_38_0 = spill1545_2;
        lexicalValue1545_38_1 = spill1545_3;
        break lexical_join_38;
    }
    if (!((spill1545_2 == spill1545_3))) {
        break lexical_join_42;
    }
    spill1545_4 = life7_16;
    if (!((life5_9 == 0))) {
        lexicalValue1545_40_0 = spill1545_4;
        break lexical_join_40;
    }
    lexicalValue1545_38_0 = __fieldRead1545_12(__fieldRead1545_11(spill1545_4));
    lexicalValue1545_38_1 = __fieldRead1545_13(p1);
    }
    if (!((lexicalValue1545_38_0 == lexicalValue1545_38_1))) {
        break lexical_join_42;
    }
    lexicalValue1545_40_0 = life7_16;
    }
    __call1545_14(lexicalValue1545_40_0, p0);
    }
    if (!((life5_9 != 0))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    return;
}
public static void h1545_0(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1154500_0(p0);
}
public static void h1545_1(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1154501_0(p0);
}
public static void h1545_2(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1154502_0(p0);
}
public static void h1545_3(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1154503_0(p0);
}
public static void h1545_4(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1154504_0(p0);
}
private static native long __fieldRead1545_0() throws Throwable;
private static native int __call1545_1() throws Throwable;
private static native java.util.Set __fieldRead1545_2(net.minecraft.entity.EntityTracker a0) throws Throwable;
private static native java.util.Iterator __call1545_3(java.util.Set a0) throws Throwable;
private static native boolean __call1545_4(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1545_5(java.util.Iterator a0) throws Throwable;
private static native moom.t3 __cast1545_6(java.lang.Object a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead1545_7(moom.t3 a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead1545_8(moom.t3 a0) throws Throwable;
private static native int __fieldRead1545_9(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __fieldRead1545_10(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead1545_11(moom.t3 a0) throws Throwable;
private static native int __fieldRead1545_12(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __fieldRead1545_13(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native void __call1545_14(moom.t3 a0, net.minecraft.entity.player.EntityPlayerMP a1) throws Throwable;
private static native java.lang.Throwable __call1154500_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1154501_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1154502_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1154503_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1154504_0(java.lang.IllegalStateException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_a6f2e5fa29fb0b60a8e1(net.minecraft.entity.EntityTracker a0, net.minecraft.entity.Entity a1) throws E;
private static final class __SourceHandler_a6f2e5fa29fb0b60a8e1 {

public static void f1546(net.minecraft.entity.EntityTracker receiver, net.minecraft.entity.Entity p0) throws Throwable {
    java.lang.Object lexicalValue1546_37_0;
    moom.t3 lexicalValue1546_38_0;
    moom.t3 lexicalValue1546_49_0;
    net.minecraft.entity.Entity spill1546_0;
    moom.t3 spill1546_1;
    moom.t3 spill1546_2;
    long life2_3;
    int life4_5;
    net.minecraft.entity.player.EntityPlayerMP life5_16;
    java.util.Iterator life6_20;
    moom.t3 life7_27;
    moom.t3 life5_44;
    lexical_join_50: {
    lexical_join_49: {
    lexical_join_38: {
    lexical_join_37: {
    lexical_join_32: {
    life2_3 = (__fieldRead1546_0() ^ 118155754226007L);
    life4_5 = __call1546_1();
    spill1546_0 = p0;
    if (!((life4_5 == 0))) {
        lexicalValue1546_37_0 = spill1546_0;
        break lexical_join_37;
    }
    if (!((__instanceOf1546_2(spill1546_0) != 0))) {
        break lexical_join_32;
    }
    life5_16 = __cast1546_3(p0);
    life6_20 = __call1546_5(__fieldRead1546_4(receiver));
    lexical_cycle_18: while (true) {
    if (!(__call1546_6(life6_20))) {
        break lexical_join_32;
    }
    life7_27 = __cast1546_8(__call1546_7(life6_20));
    spill1546_1 = life7_27;
    if (!((life4_5 == 0))) {
        lexicalValue1546_38_0 = spill1546_1;
        break lexical_join_38;
    }
    __call1546_9(spill1546_1, life5_16);
    if (!((life4_5 != 0))) { continue lexical_cycle_18; }
    break lexical_cycle_18;
    }
    }
    lexicalValue1546_37_0 = __call1546_12(__fieldRead1546_10(receiver), __call1546_11(p0));
    }
    lexicalValue1546_38_0 = __cast1546_13(lexicalValue1546_37_0);
    }
    life5_44 = lexicalValue1546_38_0;
    spill1546_2 = life5_44;
    if (!((life4_5 == 0))) {
        lexicalValue1546_49_0 = spill1546_2;
        break lexical_join_49;
    }
    if (!((spill1546_2 != null))) {
        break lexical_join_50;
    }
    __call1546_15(__fieldRead1546_14(receiver), life5_44);
    lexicalValue1546_49_0 = life5_44;
    }
    __call1546_16(lexicalValue1546_49_0);
    }
    return;
}
public static void h1546_0(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1154600_0(p0);
}
public static void h1546_1(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1154601_0(p0);
}
public static void h1546_2(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1154602_0(p0);
}
public static void h1546_3(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1154603_0(p0);
}
private static native long __fieldRead1546_0() throws Throwable;
private static native int __call1546_1() throws Throwable;
private static native int __instanceOf1546_2(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __cast1546_3(net.minecraft.entity.Entity a0) throws Throwable;
private static native java.util.Set __fieldRead1546_4(net.minecraft.entity.EntityTracker a0) throws Throwable;
private static native java.util.Iterator __call1546_5(java.util.Set a0) throws Throwable;
private static native boolean __call1546_6(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1546_7(java.util.Iterator a0) throws Throwable;
private static native moom.t3 __cast1546_8(java.lang.Object a0) throws Throwable;
private static native void __call1546_9(moom.t3 a0, net.minecraft.entity.player.EntityPlayerMP a1) throws Throwable;
private static native moom.Dd __fieldRead1546_10(net.minecraft.entity.EntityTracker a0) throws Throwable;
private static native int __call1546_11(net.minecraft.entity.Entity a0) throws Throwable;
private static native java.lang.Object __call1546_12(moom.Dd a0, int a1) throws Throwable;
private static native moom.t3 __cast1546_13(java.lang.Object a0) throws Throwable;
private static native java.util.Set __fieldRead1546_14(net.minecraft.entity.EntityTracker a0) throws Throwable;
private static native boolean __call1546_15(java.util.Set a0, moom.t3 a1) throws Throwable;
private static native void __call1546_16(moom.t3 a0) throws Throwable;
private static native java.lang.Throwable __call1154600_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1154601_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1154602_0(java.lang.IllegalStateException a0) throws Throwable;
private static native java.lang.Throwable __call1154603_0(java.lang.IllegalStateException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_1b90a029da980c7c6608(net.minecraft.entity.EntityTracker a0, net.minecraft.entity.Entity a1, moom.yK a2) throws E;
private static final class __SourceHandler_1b90a029da980c7c6608 {

public static void f1547(net.minecraft.entity.EntityTracker receiver, net.minecraft.entity.Entity p0, moom.yK p1) throws Throwable {
    moom.t3 forwardValue1547_18_0;
    int spill1547_0;
    moom.t3 spill1547_1;
    long life3_3;
    moom.t3 life6_11;
    int life5_12;
    forward_join_20: {
    forward_join_18: {
    life3_3 = (__fieldRead1547_0() ^ 73842237840832L);
    spill1547_0 = __call1547_1();
    life6_11 = __cast1547_5(__call1547_4(__fieldRead1547_2(receiver), __call1547_3(p0)));
    life5_12 = spill1547_0;
    spill1547_1 = life6_11;
    if (!((life5_12 != 0))) {
        forwardValue1547_18_0 = spill1547_1;
        break forward_join_18;
    }
    if (!((spill1547_1 != null))) {
        break forward_join_20;
    }
    forwardValue1547_18_0 = life6_11;
    }
    __call1547_6(forwardValue1547_18_0, p1);
    }
    return;
}
public static void h1547_0(java.lang.IllegalStateException p0) throws Throwable {
    throw __call1154700_0(p0);
}
private static native long __fieldRead1547_0() throws Throwable;
private static native int __call1547_1() throws Throwable;
private static native moom.Dd __fieldRead1547_2(net.minecraft.entity.EntityTracker a0) throws Throwable;
private static native int __call1547_3(net.minecraft.entity.Entity a0) throws Throwable;
private static native java.lang.Object __call1547_4(moom.Dd a0, int a1) throws Throwable;
private static native moom.t3 __cast1547_5(java.lang.Object a0) throws Throwable;
private static native void __call1547_6(moom.t3 a0, moom.yK a1) throws Throwable;
private static native java.lang.Throwable __call1154700_0(java.lang.IllegalStateException a0) throws Throwable;

}


public void b(net.minecraft.entity.Entity p0, moom.yK p1) { __sourceHandlerCall_1b90a029da980c7c6608(this, p0, p1); }


public void b(net.minecraft.entity.Entity p0) { __sourceHandlerCall_a6f2e5fa29fb0b60a8e1(this, p0); }


public void b(net.minecraft.entity.player.EntityPlayerMP p0) {
int spill1546_0;
    long life2_3;
    java.util.Iterator life5_8;
    int life4_9;
    moom.t3 life6_16;
    lexical_join_22: {
    life2_3 = (net.minecraft.entity.EntityTracker.f ^ 57858693484981L);
    spill1546_0 = net.minecraft.entity.SharedMonsterAttributes.b();
    life5_8 = ((java.util.Set)(this.c)).iterator();
    life4_9 = spill1546_0;
    lexical_cycle_10: while (true) {
    if (!(((java.util.Iterator)(life5_8)).hasNext())) {
        break lexical_join_22;
    }
    life6_16 = ((moom.t3)(((java.util.Iterator)(life5_8)).next()));
    ((moom.t3)(life6_16)).c(((net.minecraft.entity.player.EntityPlayerMP)(p0)));
    if (!((life4_9 != 0))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    return;
}


public void a(net.minecraft.entity.player.EntityPlayerMP p0, net.minecraft.world.chunk.Chunk p1) { __sourceHandlerCall_122c9e66d21fbeb9e56d(this, p0, p1); }


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral11255_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/t2"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(net.minecraft.entity.Entity p0) { __sourceHandlerCall_d1d1e02dbbbfa8dccd4d(this, p0); }


private static java.lang.Throwable a(java.lang.Throwable p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 24604;
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
            throw new RuntimeException("moom/t2", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         h[var3] = var15;
      }

      return h[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_61733276745592(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public void a() { __sourceHandlerCall_47b682f9bf55bff2446f(this); }


public void a(net.minecraft.entity.player.EntityPlayerMP p0) { __sourceHandlerCall_93e8baa2f07c9bf75237(this, p0); }


public void a(net.minecraft.entity.Entity p0, moom.yK p1) { __sourceHandlerCall_b4caef63823ddc745c40(this, p0, p1); }


public void a(net.minecraft.entity.Entity p0, int p1, int p2, boolean p3) { __sourceHandlerCall_bb9e54da9dfcbe4032f9(this, p0, p1, p2, p3); }


public void a(net.minecraft.entity.Entity p0, int p1, int p2) {
((net.minecraft.entity.EntityTracker)(this)).a(((net.minecraft.entity.Entity)(p0)), ((int)(p1)), ((int)(p2)), ((boolean)(false)));
    return;
}


private static java.lang.String lambda$addEntityToTracker$0(int p0) throws java.lang.Exception {
long local1 = (net.minecraft.entity.EntityTracker.f ^ 42146675860355L);
    java.lang.String local3 = __sourceIntrinsic_c876172f7959_invokedynamic11261_1(p0);
    if ((p0 == __sourceIntrinsic_c876172f7959_invokedynamic11261_2(21080, (3679555872595175949L ^ local1)))) {
        local3 = __sourceIntrinsic_c876172f7959_invokedynamic11261_3(local3);
    }
    return local3;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral11255_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c876172f7959_invokedynamic11261_1(int a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c876172f7959_invokedynamic11261_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c876172f7959_invokedynamic11261_3(java.lang.String a0) throws E;

private static native moom.Bl __sourceExactCall_c05be346191bb1(net.minecraft.world.WorldServer p0);
private static native int __sourceExactCall_61733276745592(int p0, long p1);
}
