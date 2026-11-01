package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Oz extends java.lang.Thread {

private moom.LQ a;

private static java.nio.charset.Charset b;

private static long c;

private static java.lang.String[] d;

private static java.lang.String[] e;

private static java.util.Map f;

private static long[] g;

private static java.lang.Integer[] h;

private static java.util.Map i;

public Oz(moom.LQ p0) { super((java.lang.String)null); }

private static void __sourceConstructorBody_d9157aebca4ae5d8(moom.Oz receiver, moom.LQ p0) throws Throwable {
long local2 = (moom.Oz.c ^ 83635084554957L);
    moom.Oz.__sourceConstructorInit_d9157aebca4ae5d8_0(((moom.Oz)(receiver)), ((java.lang.String)(__sourceIntrinsic_d9157aebca4ae5d8_originalDynamicSite2550_1(30338, (5094227215050980440L ^ local2)))));
    ((moom.Oz)(receiver)).a = ((moom.LQ)(null));
    ((moom.Oz)(receiver)).a = ((moom.LQ)(p0));
    return;
}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(3128618716843459536L)), ((long)(7046117902138276720L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(12396831256769L)))));
    f = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (moom.Oz.c ^ 81798481868222L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill755_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill755_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill755_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill755_14 = new byte[8];
    (__sourceSpill755_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill755_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation755_16 = __sourceSpill755_14;
    ((javax.crypto.Cipher)(__sourceSpill755_11)).init(((int)(__sourceSpill755_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill755_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation755_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local20_life19 = new java.lang.String[6];
    int local18_life20 = 0;
    java.lang.String local17_life21;
    int local19_life23 = ((java.lang.String)((local17_life21 = "MWß§ºù¾T\034\025°è'H\tÁu'\"OúÃ\003pÙ3(Ø\022RÑj'$¤Ø-Ü\026\177Ó6ý\017_Ýº\024\037¯G'§4\023vAç9P\020ÆfPçÌ©â\021Ë(\034¹¡7(UçÿCð0\027\030¶k§ÒÒ\005\007eOò;Á\020ñéc\016Ah¸\005.jü^øH\016\004¶K\002"))).length();
    int local16_life24 = 32;
    int local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill755_28 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill755_29 = local13_life9;
        byte[] local21_life31 = ((javax.crypto.Cipher)(__sourceSpill755_29)).doFinal(((byte[])(__sourceSpill755_28)));
        java.lang.String __sourceSpill755_34 = ((java.lang.String)(moom.Oz.a(((byte[])(local21_life31))))).intern();
        java.lang.String[] __sourceSpill755_35 = local20_life19;
        int __sourceSpill755_36 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill755_35)[__sourceSpill755_36] = __sourceSpill755_34;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    local19_life23 = ((java.lang.String)((local17_life21 = ")\023^üÀ1\027Eø0L¨|\017\023;ùÅÜ\027\177â&/\031\030È67\037MÓ#©\020\034£9¾¤'×Úx×\023ÚU?æ"))).length();
    local16_life24 = 40;
    local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill755_41 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill755_42 = local13_life9;
        byte[] local21_life44 = ((javax.crypto.Cipher)(__sourceSpill755_42)).doFinal(((byte[])(__sourceSpill755_41)));
        java.lang.String __sourceSpill755_47 = ((java.lang.String)(moom.Oz.a(((byte[])(local21_life44))))).intern();
        java.lang.String[] __sourceSpill755_48 = local20_life19;
        int __sourceSpill755_49 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill755_48)[__sourceSpill755_49] = __sourceSpill755_47;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    d = ((java.lang.String[])(local20_life19));
    e = ((java.lang.String[])(new java.lang.String[6]));
    i = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life55;
    javax.crypto.Cipher __sourceSpill755_57 = (local0_life55 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill755_58 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill755_59 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill755_60 = new byte[8];
    (__sourceSpill755_60)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life61 = 1;
    while ((local1_life61 < 8)) {
        (__sourceSpill755_60)[local1_life61] = ((byte) ((int) ((local11_life7 << (local1_life61 * 8)) >>> 56)));
        local1_life61 += 1;
    }
    byte[] __sourcePreallocation755_62 = __sourceSpill755_60;
    ((javax.crypto.Cipher)(__sourceSpill755_57)).init(((int)(__sourceSpill755_58)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill755_59)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation755_62)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life65 = new long[3];
    int local3_life66 = 0;
    java.lang.String local4_life67;
    int local5_life69 = ((java.lang.String)((local4_life67 = "½\022}hx\034^_oS8ZR7Ü/Pl7ë\035"))).length();
    int local2_life70 = 0;
    do {
        java.lang.String __sourceSpill755_71 = local4_life67;
        int __sourceSpill755_72 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill755_71)).substring(((int)(__sourceSpill755_72)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill755_76 = local6_life65;
        int __sourceSpill755_77 = local3_life66;
        local3_life66 += 1;
        long local8_life78 = (((((((((((long) (local7_life75)[0]) & 255L) << 56) | ((((long) (local7_life75)[1]) & 255L) << 48)) | ((((long) (local7_life75)[2]) & 255L) << 40)) | ((((long) (local7_life75)[3]) & 255L) << 32)) | ((((long) (local7_life75)[4]) & 255L) << 24)) | ((((long) (local7_life75)[5]) & 255L) << 16)) | ((((long) (local7_life75)[6]) & 255L) << 8)) | (((long) (local7_life75)[7]) & 255L));
        byte[] __sourceSpill755_79 = new byte[8];
        (__sourceSpill755_79)[0] = ((byte) ((int) (local8_life78 >>> 56)));
        (__sourceSpill755_79)[1] = ((byte) ((int) (local8_life78 >>> 48)));
        (__sourceSpill755_79)[2] = ((byte) ((int) (local8_life78 >>> 40)));
        (__sourceSpill755_79)[3] = ((byte) ((int) (local8_life78 >>> 32)));
        (__sourceSpill755_79)[4] = ((byte) ((int) (local8_life78 >>> 24)));
        (__sourceSpill755_79)[5] = ((byte) ((int) (local8_life78 >>> 16)));
        (__sourceSpill755_79)[6] = ((byte) ((int) (local8_life78 >>> 8)));
        (__sourceSpill755_79)[7] = ((byte) ((int) local8_life78));
        javax.crypto.Cipher __sourceSpill755_80 = local0_life55;
        byte[] local10_life82 = ((javax.crypto.Cipher)(__sourceSpill755_80)).doFinal(((byte[])(__sourceSpill755_79)));
        (__sourceSpill755_76)[__sourceSpill755_77] = (((((((((((long) (local10_life82)[0]) & 255L) << 56) | ((((long) (local10_life82)[1]) & 255L) << 48)) | ((((long) (local10_life82)[2]) & 255L) << 40)) | ((((long) (local10_life82)[3]) & 255L) << 32)) | ((((long) (local10_life82)[4]) & 255L) << 24)) | ((((long) (local10_life82)[5]) & 255L) << 16)) | ((((long) (local10_life82)[6]) & 255L) << 8)) | (((long) (local10_life82)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    g = ((long[])(local6_life65));
    h = ((java.lang.Integer[])(new java.lang.Integer[3]));
    b = ((java.nio.charset.Charset)(java.nio.charset.StandardCharsets.US_ASCII));
}

private static native <E extends Throwable> void __sourceConstructorInit_d9157aebca4ae5d8_0(moom.Oz a0, java.lang.String a1) throws E;
private static native <E extends Throwable> moom.LT __sourceHandlerCall_a79d5f37fdf14f19d1f6(moom.Oz a0, java.io.InputStream a1) throws E;
private static final class __SourceHandler_a79d5f37fdf14f19d1f6 {

public static moom.LT f135(moom.Oz receiver, java.io.InputStream p0) throws Throwable {
    java.lang.String[] cycleValue135_33_0;
    int cycleValue135_83_0;
    java.lang.String cycleValue135_98_0;
    java.lang.String cycleValue135_120_0;
    net.minecraft.entity.Entity[] spill135_0;
    java.lang.String[] spill135_1;
    java.lang.String spill135_2;
    int spill135_3;
    long life2_3;
    java.lang.String life5_8;
    net.minecraft.entity.Entity[] life4_9;
    java.lang.String[] life6_13;
    java.lang.String life7_40;
    int life8_46;
    java.lang.String life9_50;
    java.util.LinkedHashMap life10_54;
    java.lang.String life11_58;
    byte[] life12_63;
    java.lang.String life13_72;
    int life14_88;
    java.lang.String life14_112;
    int life12_136;
    java.lang.String life13_144;
    java.lang.String life14_151;
    cycle_join_33: {
    cycle_join_32: {
    life2_3 = (__fieldRead135_0() ^ 19402345238004L);
    spill135_0 = __call135_1();
    life5_8 = __call135_2(receiver, p0);
    life4_9 = spill135_0;
    life6_13 = __call135_3(life5_8, " ");
    spill135_1 = life6_13;
    if (!((life4_9 != null))) {
        cycleValue135_33_0 = spill135_1;
        break cycle_join_33;
    }
    if (!(((spill135_1).length < 3))) {
        break cycle_join_32;
    }
    java.lang.Object __inlineStack135_5Token;
    throw new java.io.IOException(__invokedynamic135_6(__inlineStack135_5Output0((__inlineStack135_5Token = __inlineStack135_5Pack(life5_8, __invokedynamic135_4(952, (5439850816529135193L ^ life2_3))))), __inlineStack135_5Output1(__inlineStack135_5Token)));
    }
    cycleValue135_33_0 = life6_13;
    }
    life7_40 = (cycleValue135_33_0)[0];
    life8_46 = __call135_7((life6_13)[1], 0);
    life9_50 = (life6_13)[2];
    life10_54 = new java.util.LinkedHashMap();
    terminal_cycle_50: while (true) {
        cycle_join_143: {
        cycle_join_120: {
        cycle_join_119: {
        cycle_join_111: {
        cycle_join_98: {
        cycle_join_90: {
        cycle_join_89: {
        cycle_join_83: {
        life11_58 = __call135_8(receiver, p0);
        if (!((__call135_9(life11_58) == 0))) {
        break cycle_join_119;
    }
        life12_63 = null;
        life13_72 = __cast135_12(__call135_11(life10_54, __invokedynamic135_10(9803, (2776131285347685291L ^ life2_3))));
        spill135_2 = life13_72;
        if (!((life4_9 != null))) {
        cycleValue135_120_0 = spill135_2;
        break cycle_join_120;
    }
        if (!((life4_9 != null))) {
        cycleValue135_98_0 = spill135_2;
        break cycle_join_98;
    }
        if (!((spill135_2 != null))) {
        break cycle_join_90;
    }
        life14_88 = __call135_13(life13_72, -1);
        spill135_3 = life14_88;
        if (!((life4_9 != null))) {
        cycleValue135_83_0 = spill135_3;
        break cycle_join_83;
    }
        if (!((spill135_3 > 0))) {
        break cycle_join_89;
    }
        cycleValue135_83_0 = life14_88;
        }
        life12_63 = new byte[cycleValue135_83_0];
        __call135_14(receiver, life12_63, p0);
        }
        break cycle_join_111;
        }
        cycleValue135_98_0 = __cast135_17(__call135_16(life10_54, __invokedynamic135_15(27012, (7879828516796079200L ^ life2_3))));
        }
        life14_112 = cycleValue135_98_0;
        if (!(__call135_19(life14_112, __invokedynamic135_18(7047, (6639951277872868965L ^ life2_3))))) {
        break cycle_join_111;
    }
        life12_63 = __call135_20(receiver, p0);
        }
        return new moom.LT(life8_46, life5_8, life10_54, life12_63);
        }
        cycleValue135_120_0 = life11_58;
        }
        life12_136 = __call135_21(cycleValue135_120_0, ":");
        if (!((life12_136 > 0))) {
        break cycle_join_143;
    }
        life13_144 = __call135_23(__call135_22(life11_58, 0, life12_136));
        life14_151 = __call135_25(__call135_24(life11_58, (life12_136 + 1)));
        __call135_26(life10_54, life13_144, life14_151);
        }
        continue terminal_cycle_50;
    }
}
private static native long __fieldRead135_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call135_1() throws Throwable;
private static native java.lang.String __call135_2(moom.Oz a0, java.io.InputStream a1) throws Throwable;
private static native java.lang.String[] __call135_3(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic135_4(int a0, long a1) throws Throwable;
private static native java.lang.Object __inlineStack135_5Pack(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __inlineStack135_5Output0(java.lang.Object token) throws Throwable;
private static native java.lang.String __inlineStack135_5Output1(java.lang.Object token) throws Throwable;
private static native java.lang.String __invokedynamic135_6(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __call135_7(java.lang.String a0, int a1) throws Throwable;
private static native java.lang.String __call135_8(moom.Oz a0, java.io.InputStream a1) throws Throwable;
private static native int __call135_9(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic135_10(int a0, long a1) throws Throwable;
private static native java.lang.Object __call135_11(java.util.LinkedHashMap a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __cast135_12(java.lang.Object a0) throws Throwable;
private static native int __call135_13(java.lang.String a0, int a1) throws Throwable;
private static native void __call135_14(moom.Oz a0, byte[] a1, java.io.InputStream a2) throws Throwable;
private static native java.lang.String __invokedynamic135_15(int a0, long a1) throws Throwable;
private static native java.lang.Object __call135_16(java.util.LinkedHashMap a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __cast135_17(java.lang.Object a0) throws Throwable;
private static native java.lang.String __invokedynamic135_18(int a0, long a1) throws Throwable;
private static native boolean __call135_19(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native byte[] __call135_20(moom.Oz a0, java.io.InputStream a1) throws Throwable;
private static native int __call135_21(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call135_22(java.lang.String a0, int a1, int a2) throws Throwable;
private static native java.lang.String __call135_23(java.lang.String a0) throws Throwable;
private static native java.lang.String __call135_24(java.lang.String a0, int a1) throws Throwable;
private static native java.lang.String __call135_25(java.lang.String a0) throws Throwable;
private static native java.lang.Object __call135_26(java.util.LinkedHashMap a0, java.lang.String a1, java.lang.String a2) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_0ab67b9a4b12d0d52093(moom.Oz a0) throws E;
private static final class __SourceHandler_0ab67b9a4b12d0d52093 {

public static void f100106(moom.Oz receiver) throws Throwable {
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    java.lang.Object life4_9;
    moom.LR life4_13;
    java.io.InputStream life5_17;
    moom.LT life6_21;
    forest_join_29: {
    life1_3 = (__fieldRead100106_0() ^ 122153317474230L);
    life3_5 = __call100106_1();
    forest_cycle_6: while (true) {
    if (!((!__call100106_2()))) {
        break forest_join_29;
    }
    life4_9 = null;
    life4_13 = __call100106_4(__fieldRead100106_3(receiver));
    life5_17 = __call100106_6(__fieldRead100106_5(receiver));
    life6_21 = __call100106_7(receiver, life5_17);
    __call100106_9(__fieldRead100106_8(receiver), life4_13, life6_21);
    if (!((life3_5 == null))) {
        continue forest_cycle_6;
    }
    break forest_cycle_6;
    }
    }
    return;
}
public static void h100106_0(java.lang.InterruptedException p0) throws Throwable {
    java.lang.InterruptedException life1_2;
    life1_2 = p0;
    return;
}
public static void h100106_1(java.lang.Exception p0, moom.Oz p1, net.minecraft.entity.Entity[] p2, moom.LR p3) throws Throwable {
    java.lang.Exception life4_2;
    java.lang.Object life3_14;
    moom.LR life3_18;
    java.io.InputStream life4_22;
    moom.LT life5_26;
    forest_join_32: {
    life4_2 = p0;
    __call13010601_1(__fieldRead13010601_0(p1), p3, life4_2);
    forest_cycle_7: while (true) {
    forest_join_10: {
    if (!((p2 == null))) {
        break forest_join_10;
    }
    break forest_join_32;
    }
    if (!((!__call13010601_2()))) {
        break forest_join_32;
    }
    life3_14 = null;
    life3_18 = __call13010601_4(__fieldRead13010601_3(p1));
    life4_22 = __call13010601_6(__fieldRead13010601_5(p1));
    life5_26 = __call13010601_7(p1, life4_22);
    __call13010601_9(__fieldRead13010601_8(p1), life3_18, life5_26);
    continue forest_cycle_7;
    }
    }
    return;
}
private static native long __fieldRead100106_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call100106_1() throws Throwable;
private static native boolean __call100106_2() throws Throwable;
private static native moom.LQ __fieldRead100106_3(moom.Oz a0) throws Throwable;
private static native moom.LR __call100106_4(moom.LQ a0) throws Throwable;
private static native moom.LQ __fieldRead100106_5(moom.Oz a0) throws Throwable;
private static native java.io.InputStream __call100106_6(moom.LQ a0) throws Throwable;
private static native moom.LT __call100106_7(moom.Oz a0, java.io.InputStream a1) throws Throwable;
private static native moom.LQ __fieldRead100106_8(moom.Oz a0) throws Throwable;
private static native void __call100106_9(moom.LQ a0, moom.LR a1, moom.LT a2) throws Throwable;
private static native moom.LQ __fieldRead13010601_0(moom.Oz a0) throws Throwable;
private static native void __call13010601_1(moom.LQ a0, moom.LR a1, java.lang.Exception a2) throws Throwable;
private static native boolean __call13010601_2() throws Throwable;
private static native moom.LQ __fieldRead13010601_3(moom.Oz a0) throws Throwable;
private static native moom.LR __call13010601_4(moom.LQ a0) throws Throwable;
private static native moom.LQ __fieldRead13010601_5(moom.Oz a0) throws Throwable;
private static native java.io.InputStream __call13010601_6(moom.LQ a0) throws Throwable;
private static native moom.LT __call13010601_7(moom.Oz a0, java.io.InputStream a1) throws Throwable;
private static native moom.LQ __fieldRead13010601_8(moom.Oz a0) throws Throwable;
private static native void __call13010601_9(moom.LQ a0, moom.LR a1, moom.LT a2) throws Throwable;

}


public void run() { __sourceHandlerCall_0ab67b9a4b12d0d52093(this); }


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 30077;
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
            throw new RuntimeException("moom/Oz", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         h[var3] = var15;
      }

      return h[var3];
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral6880_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Oz"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.Oz.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.Oz.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral6881_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Oz"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private byte[] a__ArrayByte(java.io.InputStream p0) throws java.io.IOException {
net.minecraft.entity.Entity[] spill1047_0;
    long life2_3;
    java.io.ByteArrayOutputStream life5_8;
    net.minecraft.entity.Entity[] life4_9;
    java.lang.String life6_13;
    java.lang.String[] life7_21;
    int life8_31;
    byte[] life9_34;
    lexical_join_52: {
    life2_3 = (moom.Oz.c ^ 116655065503255L);
    spill1047_0 = moom.LT.b();
    life5_8 = new java.io.ByteArrayOutputStream();
    life4_9 = spill1047_0;
    lexical_cycle_10: while (true) {
    lexical_join_50: {
    life6_13 = ((moom.Oz)(this)).a(((java.io.InputStream)(p0)));
    life7_21 = moom.BU.a__ArrayString(((java.lang.String)(life6_13)), ((java.lang.String)(__sourceIntrinsic_71a9052e22ee_invokedynamic1047_3(27149, (3194464253946119179L ^ life2_3)))));
    life8_31 = java.lang.Integer.parseInt(((java.lang.String)((life7_21)[0])), ((int)(__sourceIntrinsic_71a9052e22ee_invokedynamic1047_5(31999, (3741005257834013689L ^ life2_3)))));
    life9_34 = new byte[life8_31];
    ((moom.Oz)(this)).a(((byte[])(life9_34)), ((java.io.InputStream)(p0)));
    ((java.io.ByteArrayOutputStream)(life5_8)).write(((byte[])(life9_34)));
    ((moom.Oz)(this)).a(((java.io.InputStream)(p0)));
    if (!((life8_31 == 0))) {
        break lexical_join_50;
    }
    if (!((life4_9 == null))) {
        break lexical_join_52;
    }
    }
    if (!((life4_9 == null))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    return ((java.io.ByteArrayOutputStream)(life5_8)).toByteArray();
}


private moom.LT a__LT(java.io.InputStream p0) throws java.io.IOException { return __sourceHandlerCall_a79d5f37fdf14f19d1f6(this, p0); }


private static java.io.IOException a(java.io.IOException p0) {
return p0;
}


private java.lang.String a(java.io.InputStream p0) throws java.io.IOException {
int lexicalValue1045_49_0;
    net.minecraft.entity.Entity[] spill1045_0;
    int spill1045_1;
    int spill1045_2;
    long life2_3;
    java.io.ByteArrayOutputStream life5_8;
    int life6_10;
    net.minecraft.entity.Entity[] life4_11;
    int life7_13;
    int life8_16;
    java.lang.String life8_73;
    lexical_join_66: {
    lexical_join_52: {
    life2_3 = (moom.Oz.c ^ 46545529170270L);
    spill1045_0 = moom.LT.b();
    life5_8 = new java.io.ByteArrayOutputStream();
    life6_10 = -1;
    life4_11 = spill1045_0;
    life7_13 = 0;
    lexical_cycle_14: while (true) {
    lexical_join_49: {
    lexical_join_48: {
    lexical_join_26: {
    lexical_join_23: {
    life8_16 = ((java.io.InputStream)(p0)).read();
    if (!((life8_16 < 0))) {
        break lexical_join_23;
    }
    if (!((life4_11 != null))) {
        break lexical_join_26;
    }
    if (!((life4_11 == null))) {
        break lexical_join_52;
    }
    }
    ((java.io.ByteArrayOutputStream)(life5_8)).write(((int)(life8_16)));
    }
    spill1045_1 = life6_10;
    if (!((life4_11 != null))) {
        lexicalValue1045_49_0 = spill1045_1;
        break lexical_join_49;
    }
    if (!((spill1045_1 == __sourceIntrinsic_20325bb95532_invokedynamic1045_4(6914, (9016958165228731212L ^ life2_3))))) {
        break lexical_join_48;
    }
    spill1045_2 = life8_16;
    if (!((life4_11 != null))) {
        lexicalValue1045_49_0 = spill1045_2;
        break lexical_join_49;
    }
    if (!((spill1045_2 == __sourceIntrinsic_20325bb95532_invokedynamic1045_5(20168, (1374997488360484484L ^ life2_3))))) {
        break lexical_join_48;
    }
    life7_13 = 1;
    if (!((life4_11 == null))) {
        break lexical_join_52;
    }
    }
    lexicalValue1045_49_0 = life8_16;
    }
    life6_10 = lexicalValue1045_49_0;
    if (!((life4_11 == null))) { continue lexical_cycle_14; }
    break lexical_cycle_14;
    }
    }
    life8_73 = ((java.io.ByteArrayOutputStream)(life5_8)).toString(((java.nio.charset.Charset)(moom.Oz.b)));
    if (!((life7_13 != 0))) {
        break lexical_join_66;
    }
    life8_73 = ((java.lang.String)(life8_73)).substring(((int)(0)), ((int)((((java.lang.String)(life8_73)).length() - 2))));
    }
    return life8_73;
}


private void a(byte[] p0, java.io.InputStream p1) throws java.io.IOException {
int lexicalValue1046_32_0;
    net.minecraft.entity.Entity[] spill1046_0;
    int spill1046_1;
    long life3_3;
    int life7_6;
    net.minecraft.entity.Entity[] life5_7;
    int life6_20;
    lexical_join_35: {
    life3_3 = (moom.Oz.c ^ 62103247623205L);
    spill1046_0 = moom.LT.b();
    life7_6 = 0;
    life5_7 = spill1046_0;
    lexical_cycle_8: while (true) {
    lexical_join_32: {
    lexical_join_29: {
    if (!((life7_6 < (p0).length))) {
        break lexical_join_35;
    }
    life6_20 = ((java.io.InputStream)(p1)).read(((byte[])(p0)), ((int)(life7_6)), ((int)(((p0).length - life7_6))));
    spill1046_1 = life6_20;
    if (!((life5_7 != null))) {
        lexicalValue1046_32_0 = spill1046_1;
        break lexical_join_32;
    }
    if (!((spill1046_1 < 0))) {
        break lexical_join_29;
    }
    throw new java.io.EOFException();
    }
    lexicalValue1046_32_0 = (life7_6 + life6_20);
    }
    life7_6 = lexicalValue1046_32_0;
    if (!((life5_7 == null))) { continue lexical_cycle_8; }
    break lexical_cycle_8;
    }
    }
    return;
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
        byte[] spill3480_0 = p0;
        life4_9 += 1;
        life5_44 = (spill3480_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill3480_1 = p0;
        life4_9 += 1;
        life5_76 = (spill3480_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill3480_2 = p0;
        life4_9 += 1;
        life5_91 = (spill3480_2)[life4_9];
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 1145);
    if (((moom.Oz.e)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.Oz.f)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.Oz.f)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/Oz", life9_51);
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
        life9_116 = ((java.lang.String)((moom.Oz.d)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.Oz.e)[life5_8] = moom.Oz.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.Oz.e)[life5_8];
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_d9157aebca4ae5d8_originalDynamicSite2550_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_20325bb95532_invokedynamic1045_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_20325bb95532_invokedynamic1045_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral6881_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_71a9052e22ee_invokedynamic1047_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_71a9052e22ee_invokedynamic1047_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_6ef56ae16307_invokedynamic135_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral6880_0() throws E;
}
