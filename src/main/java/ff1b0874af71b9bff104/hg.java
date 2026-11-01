package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public abstract class hg extends net.minecraft.client.gui.GuiScreen {

protected static moom.DD w;

protected int x;

protected int y;

public moom.v8 z;

protected int A;

protected int B;

private moom.wB C;

private moom.wB D;

private boolean E;

private net.minecraft.item.ItemStack F;

private int G;

private int H;

private moom.wB I;

private long J;

private net.minecraft.item.ItemStack K;

private moom.wB L;

private long M;

protected java.util.Set<moom.wB> N;

protected boolean O;

private int P;

private int Q;

private boolean R;

private int S;

private long T;

private moom.wB U;

private int V;

private boolean W;

private net.minecraft.item.ItemStack X;

private static net.minecraft.entity.Entity[] Y;

private static long eb;

private static long[] mb;

private static java.lang.Integer[] nb;

private static java.util.Map ob;

private static long[] vb;

private static java.lang.Long[] wb;

private static java.util.Map xb;

public hg(moom.v8 p0) { super(); }

private static void __sourceConstructorBody_8926718faf90e0d3(moom.hg receiver, moom.v8 p0) throws Throwable {
long local2 = (moom.hg.eb ^ 19177211785142L);
    moom.hg.__sourceConstructorInit_8926718faf90e0d3_0(((moom.hg)(receiver)));
    ((moom.hg)(receiver)).x = ((int)(__sourceIntrinsic_8926718faf90e0d3_originalDynamicSite2833_2(1343, (197174904163627093L ^ local2))));
    ((moom.hg)(receiver)).y = ((int)(__sourceIntrinsic_8926718faf90e0d3_originalDynamicSite2833_4(16345, (6171262862407125671L ^ local2))));
    ((moom.hg)(receiver)).N = ((java.util.Set)(com.google.common.collect.Sets.newHashSet()));
    ((moom.hg)(receiver)).z = ((moom.v8)(p0));
    ((moom.hg)(receiver)).R = ((boolean)(true));
    return;
}


static {
eb = ((long)(((moom._a)(moom._c.a(((long)(3329525841821054641L)), ((long)(6596878244443360981L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(261738217853040L)))));
    net.minecraft.entity.Entity[] __sourceSpill867_6 = new net.minecraft.entity.Entity[4];
    ob = ((java.util.Map)(new java.util.HashMap(13)));
    moom.hg.a(((net.minecraft.entity.Entity[])(__sourceSpill867_6)));
    long local11_life9 = (moom.hg.eb ^ 20762729929901L);
    javax.crypto.Cipher local13_life11;
    javax.crypto.Cipher __sourceSpill867_13 = (local13_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill867_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill867_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill867_16 = new byte[8];
    (__sourceSpill867_16)[0] = ((byte) ((int) (local11_life9 >>> 56)));
    int local14_life17 = 1;
    while ((local14_life17 < 8)) {
        (__sourceSpill867_16)[local14_life17] = ((byte) ((int) ((local11_life9 << (local14_life17 * 8)) >>> 56)));
        local14_life17 += 1;
    }
    byte[] __sourcePreallocation867_18 = __sourceSpill867_16;
    ((javax.crypto.Cipher)(__sourceSpill867_13)).init(((int)(__sourceSpill867_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill867_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation867_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local19_life21 = new long[27];
    int local16_life22 = 0;
    java.lang.String local17_life23;
    int local18_life25 = ((java.lang.String)((local17_life23 = "Ç+\025ÿ23÷fR/WÈüFo/\005§1J\bü+TE¼Í¸A.¶h\016ªt;ªå\021du\024!s!û¿}»Í ¬½1k§QÁZ\\,æ£©lì\nYºÁôSµË4Vsvë\003o:L%§2Ïm_\"CÇ<§]rkw\000BÅ\013­¦X8\000ÿä\rô\032\0250?[ó\006\177®s&9\013@-±Nç\\\021`ëß:§\016\b2\nçf\006Â(@ßæÞ!,¢ÚÇ8=Å\035=\177KBêm\b\022Cx\017ð§î"))).length();
    int local15_life26 = 0;
    do {
        java.lang.String __sourceSpill867_27 = local17_life23;
        int __sourceSpill867_28 = local15_life26;
        local15_life26 += 8;
        byte[] local20_life31 = ((java.lang.String)(((java.lang.String)(__sourceSpill867_27)).substring(((int)(__sourceSpill867_28)), ((int)(local15_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill867_32 = local19_life21;
        int __sourceSpill867_33 = local16_life22;
        local16_life22 += 1;
        long local21_life34 = (((((((((((long) (local20_life31)[0]) & 255L) << 56) | ((((long) (local20_life31)[1]) & 255L) << 48)) | ((((long) (local20_life31)[2]) & 255L) << 40)) | ((((long) (local20_life31)[3]) & 255L) << 32)) | ((((long) (local20_life31)[4]) & 255L) << 24)) | ((((long) (local20_life31)[5]) & 255L) << 16)) | ((((long) (local20_life31)[6]) & 255L) << 8)) | (((long) (local20_life31)[7]) & 255L));
        byte[] __sourceSpill867_35 = new byte[8];
        (__sourceSpill867_35)[0] = ((byte) ((int) (local21_life34 >>> 56)));
        (__sourceSpill867_35)[1] = ((byte) ((int) (local21_life34 >>> 48)));
        (__sourceSpill867_35)[2] = ((byte) ((int) (local21_life34 >>> 40)));
        (__sourceSpill867_35)[3] = ((byte) ((int) (local21_life34 >>> 32)));
        (__sourceSpill867_35)[4] = ((byte) ((int) (local21_life34 >>> 24)));
        (__sourceSpill867_35)[5] = ((byte) ((int) (local21_life34 >>> 16)));
        (__sourceSpill867_35)[6] = ((byte) ((int) (local21_life34 >>> 8)));
        (__sourceSpill867_35)[7] = ((byte) ((int) local21_life34));
        javax.crypto.Cipher __sourceSpill867_36 = local13_life11;
        byte[] local23_life38 = ((javax.crypto.Cipher)(__sourceSpill867_36)).doFinal(((byte[])(__sourceSpill867_35)));
        (__sourceSpill867_32)[__sourceSpill867_33] = (((((((((((long) (local23_life38)[0]) & 255L) << 56) | ((((long) (local23_life38)[1]) & 255L) << 48)) | ((((long) (local23_life38)[2]) & 255L) << 40)) | ((((long) (local23_life38)[3]) & 255L) << 32)) | ((((long) (local23_life38)[4]) & 255L) << 24)) | ((((long) (local23_life38)[5]) & 255L) << 16)) | ((((long) (local23_life38)[6]) & 255L) << 8)) | (((long) (local23_life38)[7]) & 255L));
    } while ((!(local15_life26 >= local18_life25)));
    local18_life25 = ((java.lang.String)((local17_life23 = "\026\004UOpé{­ea*YS"))).length();
    local15_life26 = 0;
    do {
        java.lang.String __sourceSpill867_40 = local17_life23;
        int __sourceSpill867_41 = local15_life26;
        local15_life26 += 8;
        byte[] local20_life44 = ((java.lang.String)(((java.lang.String)(__sourceSpill867_40)).substring(((int)(__sourceSpill867_41)), ((int)(local15_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill867_45 = local19_life21;
        int __sourceSpill867_46 = local16_life22;
        local16_life22 += 1;
        long local21_life47 = (((((((((((long) (local20_life44)[0]) & 255L) << 56) | ((((long) (local20_life44)[1]) & 255L) << 48)) | ((((long) (local20_life44)[2]) & 255L) << 40)) | ((((long) (local20_life44)[3]) & 255L) << 32)) | ((((long) (local20_life44)[4]) & 255L) << 24)) | ((((long) (local20_life44)[5]) & 255L) << 16)) | ((((long) (local20_life44)[6]) & 255L) << 8)) | (((long) (local20_life44)[7]) & 255L));
        byte[] __sourceSpill867_48 = new byte[8];
        (__sourceSpill867_48)[0] = ((byte) ((int) (local21_life47 >>> 56)));
        (__sourceSpill867_48)[1] = ((byte) ((int) (local21_life47 >>> 48)));
        (__sourceSpill867_48)[2] = ((byte) ((int) (local21_life47 >>> 40)));
        (__sourceSpill867_48)[3] = ((byte) ((int) (local21_life47 >>> 32)));
        (__sourceSpill867_48)[4] = ((byte) ((int) (local21_life47 >>> 24)));
        (__sourceSpill867_48)[5] = ((byte) ((int) (local21_life47 >>> 16)));
        (__sourceSpill867_48)[6] = ((byte) ((int) (local21_life47 >>> 8)));
        (__sourceSpill867_48)[7] = ((byte) ((int) local21_life47));
        javax.crypto.Cipher __sourceSpill867_49 = local13_life11;
        byte[] local23_life51 = ((javax.crypto.Cipher)(__sourceSpill867_49)).doFinal(((byte[])(__sourceSpill867_48)));
        (__sourceSpill867_45)[__sourceSpill867_46] = (((((((((((long) (local23_life51)[0]) & 255L) << 56) | ((((long) (local23_life51)[1]) & 255L) << 48)) | ((((long) (local23_life51)[2]) & 255L) << 40)) | ((((long) (local23_life51)[3]) & 255L) << 32)) | ((((long) (local23_life51)[4]) & 255L) << 24)) | ((((long) (local23_life51)[5]) & 255L) << 16)) | ((((long) (local23_life51)[6]) & 255L) << 8)) | (((long) (local23_life51)[7]) & 255L));
    } while ((!(local15_life26 >= local18_life25)));
    mb = ((long[])(local19_life21));
    nb = ((java.lang.Integer[])(new java.lang.Integer[27]));
    xb = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life56;
    javax.crypto.Cipher __sourceSpill867_58 = (local0_life56 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill867_59 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill867_60 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill867_61 = new byte[8];
    (__sourceSpill867_61)[0] = ((byte) ((int) (local11_life9 >>> 56)));
    int local1_life62 = 1;
    while ((local1_life62 < 8)) {
        (__sourceSpill867_61)[local1_life62] = ((byte) ((int) ((local11_life9 << (local1_life62 * 8)) >>> 56)));
        local1_life62 += 1;
    }
    byte[] __sourcePreallocation867_63 = __sourceSpill867_61;
    ((javax.crypto.Cipher)(__sourceSpill867_58)).init(((int)(__sourceSpill867_59)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill867_60)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation867_63)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life66 = new long[3];
    int local3_life67 = 0;
    java.lang.String local4_life68;
    int local5_life70 = ((java.lang.String)((local4_life68 = "CiÐ)R0_PÁöç\026²4\f\033ù\021Ø4ÛÙ"))).length();
    int local2_life71 = 0;
    do {
        java.lang.String __sourceSpill867_72 = local4_life68;
        int __sourceSpill867_73 = local2_life71;
        local2_life71 += 8;
        byte[] local7_life76 = ((java.lang.String)(((java.lang.String)(__sourceSpill867_72)).substring(((int)(__sourceSpill867_73)), ((int)(local2_life71))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill867_77 = local6_life66;
        int __sourceSpill867_78 = local3_life67;
        local3_life67 += 1;
        long local8_life79 = (((((((((((long) (local7_life76)[0]) & 255L) << 56) | ((((long) (local7_life76)[1]) & 255L) << 48)) | ((((long) (local7_life76)[2]) & 255L) << 40)) | ((((long) (local7_life76)[3]) & 255L) << 32)) | ((((long) (local7_life76)[4]) & 255L) << 24)) | ((((long) (local7_life76)[5]) & 255L) << 16)) | ((((long) (local7_life76)[6]) & 255L) << 8)) | (((long) (local7_life76)[7]) & 255L));
        byte[] __sourceSpill867_80 = new byte[8];
        (__sourceSpill867_80)[0] = ((byte) ((int) (local8_life79 >>> 56)));
        (__sourceSpill867_80)[1] = ((byte) ((int) (local8_life79 >>> 48)));
        (__sourceSpill867_80)[2] = ((byte) ((int) (local8_life79 >>> 40)));
        (__sourceSpill867_80)[3] = ((byte) ((int) (local8_life79 >>> 32)));
        (__sourceSpill867_80)[4] = ((byte) ((int) (local8_life79 >>> 24)));
        (__sourceSpill867_80)[5] = ((byte) ((int) (local8_life79 >>> 16)));
        (__sourceSpill867_80)[6] = ((byte) ((int) (local8_life79 >>> 8)));
        (__sourceSpill867_80)[7] = ((byte) ((int) local8_life79));
        javax.crypto.Cipher __sourceSpill867_81 = local0_life56;
        byte[] local10_life83 = ((javax.crypto.Cipher)(__sourceSpill867_81)).doFinal(((byte[])(__sourceSpill867_80)));
        (__sourceSpill867_77)[__sourceSpill867_78] = (((((((((((long) (local10_life83)[0]) & 255L) << 56) | ((((long) (local10_life83)[1]) & 255L) << 48)) | ((((long) (local10_life83)[2]) & 255L) << 40)) | ((((long) (local10_life83)[3]) & 255L) << 32)) | ((((long) (local10_life83)[4]) & 255L) << 24)) | ((((long) (local10_life83)[5]) & 255L) << 16)) | ((((long) (local10_life83)[6]) & 255L) << 8)) | (((long) (local10_life83)[7]) & 255L));
    } while ((!(local2_life71 >= local5_life70)));
    vb = ((long[])(local6_life66));
    wb = ((java.lang.Long[])(new java.lang.Long[3]));
    w = ((moom.DD)(new moom.DD("textures/gui/container/inventory.png")));
}

private static native <E extends Throwable> void __sourceConstructorInit_8926718faf90e0d3_0(moom.hg a0) throws E;
private static native <E extends Throwable> void __sourceHandlerCall_b29037ff9a23c6d0fa3b(moom.hg a0) throws E;
private static final class __SourceHandler_b29037ff9a23c6d0fa3b {

public static void f174(moom.hg receiver) throws Throwable {
    net.minecraft.item.ItemStack life1_5;
    java.util.Iterator life2_21;
    moom.wB life3_28;
    net.minecraft.item.ItemStack life4_31;
    int life5_42;
    life1_5 = __call174_3(__fieldRead174_2(__fieldRead174_1(__fieldRead174_0(receiver))));
    if ((life1_5 != null)) {
        if (__fieldRead174_4(receiver)) {
        __fieldWrite174_6(receiver, __fieldRead174_5(life1_5));
        life2_21 = __call174_8(__fieldRead174_7(receiver));
        loop_region_19: while (__call174_9(life2_21)) {
        life3_28 = __cast174_11(__call174_10(life2_21));
        life4_31 = __call174_12(life1_5);
        life5_42 = ((__call174_13(life3_28) == null) ? 0 : __fieldRead174_15(__call174_14(life3_28)));
        __call174_18(__fieldRead174_16(receiver), __fieldRead174_17(receiver), life4_31, life5_42);
        if ((__fieldRead174_19(life4_31) > __call174_20(life4_31))) {
        __fieldWrite174_22(life4_31, __call174_21(life4_31));
    }
        if ((__fieldRead174_23(life4_31) > __call174_24(life3_28, life4_31))) {
        __fieldWrite174_26(life4_31, __call174_25(life3_28, life4_31));
    }
        moom.hg __stackOp174_27_0 = receiver;
        __fieldWrite174_30(__stackOp174_27_0, (__fieldRead174_28(__stackOp174_27_0) - (__fieldRead174_29(life4_31) - life5_42)));
    }
    }
    }
    return;
}
public static void h174_0(moom.Oo p0) throws Throwable {
    throw __call1017400_0(p0);
}
public static void h174_1(moom.Oo p0) throws Throwable {
    throw __call1017401_0(p0);
}
public static void h174_2(moom.Oo p0) throws Throwable {
    throw __call1017402_0(p0);
}
public static void h174_3(moom.Oo p0) throws Throwable {
    throw __call1017403_0(p0);
}
private static native net.minecraft.client.Minecraft __fieldRead174_0(moom.hg a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead174_1(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.entity.player.InventoryPlayer __fieldRead174_2(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call174_3(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native boolean __fieldRead174_4(moom.hg a0) throws Throwable;
private static native int __fieldRead174_5(net.minecraft.item.ItemStack a0) throws Throwable;
private static native void __fieldWrite174_6(moom.hg a0, int a1) throws Throwable;
private static native java.util.Set __fieldRead174_7(moom.hg a0) throws Throwable;
private static native java.util.Iterator __call174_8(java.util.Set a0) throws Throwable;
private static native boolean __call174_9(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call174_10(java.util.Iterator a0) throws Throwable;
private static native moom.wB __cast174_11(java.lang.Object a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call174_12(net.minecraft.item.ItemStack a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call174_13(moom.wB a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call174_14(moom.wB a0) throws Throwable;
private static native int __fieldRead174_15(net.minecraft.item.ItemStack a0) throws Throwable;
private static native java.util.Set __fieldRead174_16(moom.hg a0) throws Throwable;
private static native int __fieldRead174_17(moom.hg a0) throws Throwable;
private static native void __call174_18(java.util.Set a0, int a1, net.minecraft.item.ItemStack a2, int a3) throws Throwable;
private static native int __fieldRead174_19(net.minecraft.item.ItemStack a0) throws Throwable;
private static native int __call174_20(net.minecraft.item.ItemStack a0) throws Throwable;
private static native int __call174_21(net.minecraft.item.ItemStack a0) throws Throwable;
private static native void __fieldWrite174_22(net.minecraft.item.ItemStack a0, int a1) throws Throwable;
private static native int __fieldRead174_23(net.minecraft.item.ItemStack a0) throws Throwable;
private static native int __call174_24(moom.wB a0, net.minecraft.item.ItemStack a1) throws Throwable;
private static native int __call174_25(moom.wB a0, net.minecraft.item.ItemStack a1) throws Throwable;
private static native void __fieldWrite174_26(net.minecraft.item.ItemStack a0, int a1) throws Throwable;
private static native int __fieldRead174_28(moom.hg a0) throws Throwable;
private static native int __fieldRead174_29(net.minecraft.item.ItemStack a0) throws Throwable;
private static native void __fieldWrite174_30(moom.hg a0, int a1) throws Throwable;
private static native java.lang.Exception __call1017400_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1017401_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1017402_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1017403_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_0b2bae1f71d76db1176e(moom.hg a0, char a1, int a2) throws E;
private static final class __SourceHandler_0b2bae1f71d76db1176e {

public static void f1050(moom.hg receiver, char p0, int p1) throws Throwable {
    moom.hg forwardValue1050_59_0;
    moom.wB forwardValue1050_59_1;
    int forwardValue1050_59_2;
    moom.hg forwardValue1050_60_0;
    moom.wB forwardValue1050_60_1;
    int forwardValue1050_60_2;
    int forwardValue1050_60_3;
    moom.hg spill1050_0;
    moom.wB spill1050_1;
    int spill1050_2;
    forward_join_62: {
    forward_join_60: {
    forward_join_59: {
    forward_join_42: {
    forward_join_14: {
    forward_join_10: {
    if (!((p1 != 1))) {
        break forward_join_10;
    }
    if (!((p1 == __call1050_3(__fieldRead1050_2(__fieldRead1050_1(__fieldRead1050_0(receiver))))))) {
        break forward_join_14;
    }
    }
    __call1050_6(__fieldRead1050_5(__fieldRead1050_4(receiver)));
    }
    __call1050_7(receiver, p1);
    if (!((__fieldRead1050_8(receiver) != null))) {
        break forward_join_62;
    }
    if (!(__call1050_10(__fieldRead1050_9(receiver)))) {
        break forward_join_62;
    }
    if (!((p1 == __call1050_14(__fieldRead1050_13(__fieldRead1050_12(__fieldRead1050_11(receiver))))))) {
        break forward_join_42;
    }
    __call1050_18(receiver, __fieldRead1050_15(receiver), __fieldRead1050_17(__fieldRead1050_16(receiver)), 0, 3);
    break forward_join_62;
    }
    if (!((p1 == __call1050_22(__fieldRead1050_21(__fieldRead1050_20(__fieldRead1050_19(receiver))))))) {
        break forward_join_62;
    }
    spill1050_0 = receiver;
    spill1050_1 = __fieldRead1050_23(receiver);
    spill1050_2 = __fieldRead1050_25(__fieldRead1050_24(receiver));
    if (!(__call1050_26())) {
        forwardValue1050_59_0 = spill1050_0;
        forwardValue1050_59_1 = spill1050_1;
        forwardValue1050_59_2 = spill1050_2;
        break forward_join_59;
    }
    forwardValue1050_60_0 = spill1050_0;
    forwardValue1050_60_1 = spill1050_1;
    forwardValue1050_60_2 = spill1050_2;
    forwardValue1050_60_3 = 1;
    break forward_join_60;
    }
    forwardValue1050_60_0 = forwardValue1050_59_0;
    forwardValue1050_60_1 = forwardValue1050_59_1;
    forwardValue1050_60_2 = forwardValue1050_59_2;
    forwardValue1050_60_3 = 0;
    }
    __call1050_27(forwardValue1050_60_0, forwardValue1050_60_1, forwardValue1050_60_2, forwardValue1050_60_3, 4);
    }
    return;
}
public static void h1050_0(java.io.IOException p0) throws Throwable {
    throw __call1105000_0(p0);
}
public static void h1050_1(java.io.IOException p0) throws Throwable {
    throw __call1105001_0(p0);
}
public static void h1050_2(java.io.IOException p0) throws Throwable {
    throw __call1105002_0(p0);
}
public static void h1050_3(java.io.IOException p0) throws Throwable {
    throw __call1105003_0(p0);
}
public static void h1050_4(java.io.IOException p0) throws Throwable {
    throw __call1105004_0(p0);
}
public static void h1050_5(java.io.IOException p0) throws Throwable {
    throw __call1105005_0(p0);
}
public static void h1050_6(java.io.IOException p0) throws Throwable {
    throw __call1105006_0(p0);
}
private static native net.minecraft.client.Minecraft __fieldRead1050_0(moom.hg a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead1050_1(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.pz __fieldRead1050_2(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native int __call1050_3(moom.pz a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1050_4(moom.hg a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead1050_5(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call1050_6(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native boolean __call1050_7(moom.hg a0, int a1) throws Throwable;
private static native moom.wB __fieldRead1050_8(moom.hg a0) throws Throwable;
private static native moom.wB __fieldRead1050_9(moom.hg a0) throws Throwable;
private static native boolean __call1050_10(moom.wB a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1050_11(moom.hg a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead1050_12(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.pz __fieldRead1050_13(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native int __call1050_14(moom.pz a0) throws Throwable;
private static native moom.wB __fieldRead1050_15(moom.hg a0) throws Throwable;
private static native moom.wB __fieldRead1050_16(moom.hg a0) throws Throwable;
private static native int __fieldRead1050_17(moom.wB a0) throws Throwable;
private static native void __call1050_18(moom.hg a0, moom.wB a1, int a2, int a3, int a4) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1050_19(moom.hg a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead1050_20(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.pz __fieldRead1050_21(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native int __call1050_22(moom.pz a0) throws Throwable;
private static native moom.wB __fieldRead1050_23(moom.hg a0) throws Throwable;
private static native moom.wB __fieldRead1050_24(moom.hg a0) throws Throwable;
private static native int __fieldRead1050_25(moom.wB a0) throws Throwable;
private static native boolean __call1050_26() throws Throwable;
private static native void __call1050_27(moom.hg a0, moom.wB a1, int a2, int a3, int a4) throws Throwable;
private static native java.lang.Exception __call1105000_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1105001_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1105002_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1105003_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1105004_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1105005_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1105006_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> moom.wB __sourceHandlerCall_bb598b86ee9e3165b313(moom.hg a0, int a1, int a2) throws E;
private static final class __SourceHandler_bb598b86ee9e3165b313 {

public static moom.wB f1779(moom.hg receiver, int p0, int p1) throws Throwable {
    int life3_1;
    moom.wB life4_14;
    life3_1 = 0;
    loop_region_2: while ((life3_1 < __call1779_2(__fieldRead1779_1(__fieldRead1779_0(receiver))))) {
        life4_14 = __cast1779_6(__call1779_5(__fieldRead1779_4(__fieldRead1779_3(receiver)), life3_1));
        if (__call1779_7(receiver, life4_14, p0, p1)) {
        return life4_14;
    }
        life3_1 += 1;
    }
    return null;
}
public static void h1779_0(moom.Oo p0) throws Throwable {
    throw __call1177900_0(p0);
}
private static native moom.v8 __fieldRead1779_0(moom.hg a0) throws Throwable;
private static native java.util.List __fieldRead1779_1(moom.v8 a0) throws Throwable;
private static native int __call1779_2(java.util.List a0) throws Throwable;
private static native moom.v8 __fieldRead1779_3(moom.hg a0) throws Throwable;
private static native java.util.List __fieldRead1779_4(moom.v8 a0) throws Throwable;
private static native java.lang.Object __call1779_5(java.util.List a0, int a1) throws Throwable;
private static native moom.wB __cast1779_6(java.lang.Object a0) throws Throwable;
private static native boolean __call1779_7(moom.hg a0, moom.wB a1, int a2, int a3) throws Throwable;
private static native java.lang.Exception __call1177900_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_64ccf1a16a71a6a1bced(moom.hg a0, int a1, int a2, float a3) throws E;
private static final class __SourceHandler_64ccf1a16a71a6a1bced {

public static void f1051(moom.hg receiver, int p0, int p1, float p2) throws Throwable {
    net.minecraft.item.ItemStack lexicalValue1051_165_0;
    int lexicalValue1051_188_0;
    long life4_3;
    int life6_8;
    int life7_11;
    int life8_48;
    int life9_54;
    int life10_67;
    moom.wB life11_80;
    int life12_103;
    int life13_106;
    net.minecraft.entity.player.InventoryPlayer life10_159;
    net.minecraft.item.ItemStack life11_170;
    int life12_178;
    int life13_195;
    java.lang.String life14_197;
    float life12_267;
    int life13_283;
    int life14_290;
    int life15_299;
    int life16_308;
    net.minecraft.item.ItemStack life12_336;
    lexical_join_323: {
    lexical_join_303: {
    lexical_join_264: {
    lexical_join_244: {
    lexical_join_230: {
    lexical_join_209: {
    lexical_join_188: {
    lexical_join_183: {
    lexical_join_165: {
    lexical_join_163: {
    lexical_join_146: {
    life4_3 = (__fieldRead1051_0() ^ 120733157077433L);
    __call1051_1(receiver);
    life6_8 = __fieldRead1051_2(receiver);
    life7_11 = __fieldRead1051_3(receiver);
    __call1051_4(receiver, p2, p0, p1);
    __call1051_5();
    __call1051_6();
    __call1051_7();
    __call1051_8();
    __call1051_9(receiver, p0, p1, p2);
    __call1051_10();
    __call1051_11();
    __call1051_12(((float) life6_8), ((float) life7_11), 0x0.0p0f);
    __call1051_13(0x1.0p0f, 0x1.0p0f, 0x1.0p0f, 0x1.0p0f);
    __call1051_14();
    __fieldWrite1051_15(receiver, null);
    life8_48 = __invokedynamic1051_16(31100, (4388568661558874639L ^ life4_3));
    life9_54 = __invokedynamic1051_17(2800, (2763692196951630231L ^ life4_3));
    __call1051_19(__fieldRead1051_18(), ((float) life8_48), ((float) life9_54));
    __call1051_20(0x1.0p0f, 0x1.0p0f, 0x1.0p0f, 0x1.0p0f);
    life10_67 = 0;
    lexical_cycle_68: while (true) {
    lexical_join_144: {
    if (!((life10_67 < __call1051_23(__fieldRead1051_22(__fieldRead1051_21(receiver)))))) {
        break lexical_join_146;
    }
    life11_80 = __cast1051_27(__call1051_26(__fieldRead1051_25(__fieldRead1051_24(receiver)), life10_67));
    __call1051_28(receiver, life11_80);
    if (!(__call1051_29(receiver, life11_80, p0, p1))) {
        break lexical_join_144;
    }
    if (!(__call1051_30(life11_80))) {
        break lexical_join_144;
    }
    __fieldWrite1051_31(receiver, life11_80);
    __call1051_32();
    __call1051_33();
    life12_103 = __fieldRead1051_34(life11_80);
    life13_106 = __fieldRead1051_35(life11_80);
    __call1051_36(1, 1, 1, 0);
    __call1051_41(receiver, life12_103, life13_106, (life12_103 + __invokedynamic1051_37(19167, (2447326291041280447L ^ life4_3))), (life13_106 + __invokedynamic1051_38(19167, (2447326291041280447L ^ life4_3))), __invokedynamic1051_39(18828, (7233575998213776104L ^ life4_3)), __invokedynamic1051_40(26229, (1525462453717552385L ^ life4_3)));
    __call1051_42(1, 1, 1, 1);
    __call1051_43();
    __call1051_44();
    }
    life10_67 += 1;
    continue lexical_cycle_68;
    }
    }
    __call1051_45();
    __call1051_46(receiver, p0, p1);
    __call1051_47();
    life10_159 = __fieldRead1051_50(__fieldRead1051_49(__fieldRead1051_48(receiver)));
    if (!((__fieldRead1051_51(receiver) == null))) {
        break lexical_join_163;
    }
    lexicalValue1051_165_0 = __call1051_52(life10_159);
    break lexical_join_165;
    }
    lexicalValue1051_165_0 = __fieldRead1051_53(receiver);
    }
    life11_170 = lexicalValue1051_165_0;
    if (!((life11_170 != null))) {
        break lexical_join_244;
    }
    life12_178 = __invokedynamic1051_54(15144, (5248210280993853515L ^ life4_3));
    if (!((__fieldRead1051_55(receiver) == null))) {
        break lexical_join_183;
    }
    lexicalValue1051_188_0 = __invokedynamic1051_56(20063, (8246673247524087085L ^ life4_3));
    break lexical_join_188;
    }
    lexicalValue1051_188_0 = __invokedynamic1051_57(19167, (2447326291041280447L ^ life4_3));
    }
    life13_195 = lexicalValue1051_188_0;
    life14_197 = null;
    if (!((__fieldRead1051_58(receiver) != null))) {
        break lexical_join_209;
    }
    if (!(__fieldRead1051_59(receiver))) {
        break lexical_join_209;
    }
    life11_170 = __call1051_60(life11_170);
    __fieldWrite1051_63(life11_170, __call1051_62((((float) __fieldRead1051_61(life11_170)) / 0x1.0p1f)));
    break lexical_join_230;
    }
    if (!(__fieldRead1051_64(receiver))) {
        break lexical_join_230;
    }
    if (!((__call1051_66(__fieldRead1051_65(receiver)) > 1))) {
        break lexical_join_230;
    }
    life11_170 = __call1051_67(life11_170);
    __fieldWrite1051_69(life11_170, __fieldRead1051_68(receiver));
    if (!((__fieldRead1051_70(life11_170) == 0))) {
        break lexical_join_230;
    }
    life14_197 = __invokedynamic1051_72(__fieldRead1051_71());
    }
    __call1051_73(receiver, life11_170, ((p0 - life6_8) - life12_178), ((p1 - life7_11) - life13_195), life14_197);
    }
    if (!((__fieldRead1051_74(receiver) != null))) {
        break lexical_join_303;
    }
    life12_267 = (((float) (__call1051_75() - __fieldRead1051_76(receiver))) / 0x1.9p6f);
    if (!((__numericCompare1051_77(life12_267, 0x1.0p0f) >= 0))) {
        break lexical_join_264;
    }
    life12_267 = 0x1.0p0f;
    __fieldWrite1051_78(receiver, null);
    }
    life13_283 = (__fieldRead1051_80(__fieldRead1051_79(receiver)) - __fieldRead1051_81(receiver));
    life14_290 = (__fieldRead1051_83(__fieldRead1051_82(receiver)) - __fieldRead1051_84(receiver));
    life15_299 = (__fieldRead1051_85(receiver) + ((int) (((float) life13_283) * life12_267)));
    life16_308 = (__fieldRead1051_86(receiver) + ((int) (((float) life14_290) * life12_267)));
    __call1051_88(receiver, __fieldRead1051_87(receiver), life15_299, life16_308, null);
    }
    __call1051_89();
    if (!((__call1051_90(life10_159) == null))) {
        break lexical_join_323;
    }
    if (!((__fieldRead1051_91(receiver) != null))) {
        break lexical_join_323;
    }
    if (!(__call1051_93(__fieldRead1051_92(receiver)))) {
        break lexical_join_323;
    }
    life12_336 = __call1051_95(__fieldRead1051_94(receiver));
    __call1051_96(receiver, life12_336, p0, p1);
    }
    __call1051_97();
    __call1051_98();
    __call1051_99();
    return;
}
public static void h1051_0(moom.Oo p0) throws Throwable {
    throw __call1105100_0(p0);
}
public static void h1051_1(moom.Oo p0) throws Throwable {
    throw __call1105101_0(p0);
}
public static void h1051_2(moom.Oo p0) throws Throwable {
    throw __call1105102_0(p0);
}
public static void h1051_3(moom.Oo p0) throws Throwable {
    throw __call1105103_0(p0);
}
public static void h1051_4(moom.Oo p0) throws Throwable {
    throw __call1105104_0(p0);
}
public static void h1051_5(moom.Oo p0) throws Throwable {
    throw __call1105105_0(p0);
}
public static void h1051_6(moom.Oo p0) throws Throwable {
    throw __call1105106_0(p0);
}
private static native long __fieldRead1051_0() throws Throwable;
private static native void __call1051_1(moom.hg a0) throws Throwable;
private static native int __fieldRead1051_2(moom.hg a0) throws Throwable;
private static native int __fieldRead1051_3(moom.hg a0) throws Throwable;
private static native void __call1051_4(moom.hg a0, float a1, int a2, int a3) throws Throwable;
private static native void __call1051_5() throws Throwable;
private static native void __call1051_6() throws Throwable;
private static native void __call1051_7() throws Throwable;
private static native void __call1051_8() throws Throwable;
private static native void __call1051_9(moom.hg a0, int a1, int a2, float a3) throws Throwable;
private static native void __call1051_10() throws Throwable;
private static native void __call1051_11() throws Throwable;
private static native void __call1051_12(float a0, float a1, float a2) throws Throwable;
private static native void __call1051_13(float a0, float a1, float a2, float a3) throws Throwable;
private static native void __call1051_14() throws Throwable;
private static native void __fieldWrite1051_15(moom.hg a0, java.lang.Object a1) throws Throwable;
private static native int __invokedynamic1051_16(int a0, long a1) throws Throwable;
private static native int __invokedynamic1051_17(int a0, long a1) throws Throwable;
private static native int __fieldRead1051_18() throws Throwable;
private static native void __call1051_19(int a0, float a1, float a2) throws Throwable;
private static native void __call1051_20(float a0, float a1, float a2, float a3) throws Throwable;
private static native moom.v8 __fieldRead1051_21(moom.hg a0) throws Throwable;
private static native java.util.List __fieldRead1051_22(moom.v8 a0) throws Throwable;
private static native int __call1051_23(java.util.List a0) throws Throwable;
private static native moom.v8 __fieldRead1051_24(moom.hg a0) throws Throwable;
private static native java.util.List __fieldRead1051_25(moom.v8 a0) throws Throwable;
private static native java.lang.Object __call1051_26(java.util.List a0, int a1) throws Throwable;
private static native moom.wB __cast1051_27(java.lang.Object a0) throws Throwable;
private static native void __call1051_28(moom.hg a0, moom.wB a1) throws Throwable;
private static native boolean __call1051_29(moom.hg a0, moom.wB a1, int a2, int a3) throws Throwable;
private static native boolean __call1051_30(moom.wB a0) throws Throwable;
private static native void __fieldWrite1051_31(moom.hg a0, moom.wB a1) throws Throwable;
private static native void __call1051_32() throws Throwable;
private static native void __call1051_33() throws Throwable;
private static native int __fieldRead1051_34(moom.wB a0) throws Throwable;
private static native int __fieldRead1051_35(moom.wB a0) throws Throwable;
private static native void __call1051_36(int a0, int a1, int a2, int a3) throws Throwable;
private static native int __invokedynamic1051_37(int a0, long a1) throws Throwable;
private static native int __invokedynamic1051_38(int a0, long a1) throws Throwable;
private static native int __invokedynamic1051_39(int a0, long a1) throws Throwable;
private static native int __invokedynamic1051_40(int a0, long a1) throws Throwable;
private static native void __call1051_41(moom.hg a0, int a1, int a2, int a3, int a4, int a5, int a6) throws Throwable;
private static native void __call1051_42(int a0, int a1, int a2, int a3) throws Throwable;
private static native void __call1051_43() throws Throwable;
private static native void __call1051_44() throws Throwable;
private static native void __call1051_45() throws Throwable;
private static native void __call1051_46(moom.hg a0, int a1, int a2) throws Throwable;
private static native void __call1051_47() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1051_48(moom.hg a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead1051_49(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.entity.player.InventoryPlayer __fieldRead1051_50(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native net.minecraft.item.ItemStack __fieldRead1051_51(moom.hg a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call1051_52(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native net.minecraft.item.ItemStack __fieldRead1051_53(moom.hg a0) throws Throwable;
private static native int __invokedynamic1051_54(int a0, long a1) throws Throwable;
private static native net.minecraft.item.ItemStack __fieldRead1051_55(moom.hg a0) throws Throwable;
private static native int __invokedynamic1051_56(int a0, long a1) throws Throwable;
private static native int __invokedynamic1051_57(int a0, long a1) throws Throwable;
private static native net.minecraft.item.ItemStack __fieldRead1051_58(moom.hg a0) throws Throwable;
private static native boolean __fieldRead1051_59(moom.hg a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call1051_60(net.minecraft.item.ItemStack a0) throws Throwable;
private static native int __fieldRead1051_61(net.minecraft.item.ItemStack a0) throws Throwable;
private static native int __call1051_62(float a0) throws Throwable;
private static native void __fieldWrite1051_63(net.minecraft.item.ItemStack a0, int a1) throws Throwable;
private static native boolean __fieldRead1051_64(moom.hg a0) throws Throwable;
private static native java.util.Set __fieldRead1051_65(moom.hg a0) throws Throwable;
private static native int __call1051_66(java.util.Set a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call1051_67(net.minecraft.item.ItemStack a0) throws Throwable;
private static native int __fieldRead1051_68(moom.hg a0) throws Throwable;
private static native void __fieldWrite1051_69(net.minecraft.item.ItemStack a0, int a1) throws Throwable;
private static native int __fieldRead1051_70(net.minecraft.item.ItemStack a0) throws Throwable;
private static native net.minecraft.util.EnumChatFormatting __fieldRead1051_71() throws Throwable;
private static native java.lang.String __invokedynamic1051_72(net.minecraft.util.EnumChatFormatting a0) throws Throwable;
private static native void __call1051_73(moom.hg a0, net.minecraft.item.ItemStack a1, int a2, int a3, java.lang.String a4) throws Throwable;
private static native net.minecraft.item.ItemStack __fieldRead1051_74(moom.hg a0) throws Throwable;
private static native long __call1051_75() throws Throwable;
private static native long __fieldRead1051_76(moom.hg a0) throws Throwable;
private static native int __numericCompare1051_77(float a0, float a1) throws Throwable;
private static native void __fieldWrite1051_78(moom.hg a0, java.lang.Object a1) throws Throwable;
private static native moom.wB __fieldRead1051_79(moom.hg a0) throws Throwable;
private static native int __fieldRead1051_80(moom.wB a0) throws Throwable;
private static native int __fieldRead1051_81(moom.hg a0) throws Throwable;
private static native moom.wB __fieldRead1051_82(moom.hg a0) throws Throwable;
private static native int __fieldRead1051_83(moom.wB a0) throws Throwable;
private static native int __fieldRead1051_84(moom.hg a0) throws Throwable;
private static native int __fieldRead1051_85(moom.hg a0) throws Throwable;
private static native int __fieldRead1051_86(moom.hg a0) throws Throwable;
private static native net.minecraft.item.ItemStack __fieldRead1051_87(moom.hg a0) throws Throwable;
private static native void __call1051_88(moom.hg a0, net.minecraft.item.ItemStack a1, int a2, int a3, java.lang.Object a4) throws Throwable;
private static native void __call1051_89() throws Throwable;
private static native net.minecraft.item.ItemStack __call1051_90(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native moom.wB __fieldRead1051_91(moom.hg a0) throws Throwable;
private static native moom.wB __fieldRead1051_92(moom.hg a0) throws Throwable;
private static native boolean __call1051_93(moom.wB a0) throws Throwable;
private static native moom.wB __fieldRead1051_94(moom.hg a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call1051_95(moom.wB a0) throws Throwable;
private static native void __call1051_96(moom.hg a0, net.minecraft.item.ItemStack a1, int a2, int a3) throws Throwable;
private static native void __call1051_97() throws Throwable;
private static native void __call1051_98() throws Throwable;
private static native void __call1051_99() throws Throwable;
private static native java.lang.Exception __call1105100_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1105101_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1105102_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1105103_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1105104_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1105105_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1105106_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_2ed05b48037029d2e76c(moom.hg a0, int a1, int a2, int a3) throws E;
private static final class __SourceHandler_2ed05b48037029d2e76c {

public static void f1052(moom.hg receiver, int p0, int p1, int p2) throws Throwable {
    int forwardValue1052_25_0;
    moom.hg forwardValue1052_55_0;
    moom.hg forwardValue1052_56_0;
    int forwardValue1052_56_1;
    int forwardValue1052_107_0;
    moom.hg forwardValue1052_166_0;
    moom.hg forwardValue1052_167_0;
    int forwardValue1052_167_1;
    int forwardValue1052_226_0;
    moom.hg forwardValue1052_240_0;
    moom.hg forwardValue1052_241_0;
    net.minecraft.item.ItemStack forwardValue1052_241_1;
    moom.hg spill1052_0;
    moom.hg spill1052_1;
    moom.hg spill1052_2;
    long life4_3;
    int life6_27;
    moom.wB life7_32;
    long life8_34;
    int life10_103;
    int life11_106;
    int life12_139;
    int life13_141;
    int life14_296;
    int life15_298;
    forward_join_306: {
    forward_join_286: {
    forward_join_279: {
    forward_join_264: {
    forward_join_260: {
    forward_join_254: {
    forward_join_245: {
    forward_join_241: {
    forward_join_240: {
    forward_join_226: {
    forward_join_225: {
    forward_join_223: {
    forward_join_202: {
    forward_join_173: {
    forward_join_169: {
    forward_join_167: {
    forward_join_166: {
    forward_join_141: {
    forward_join_123: {
    forward_join_115: {
    forward_join_107: {
    forward_join_106: {
    forward_join_104: {
    forward_join_80: {
    forward_join_73: {
    forward_join_56: {
    forward_join_55: {
    forward_join_25: {
    forward_join_24: {
    life4_3 = (__fieldRead1052_0() ^ 902959311525L);
    __call1052_1(receiver, p0, p1, p2);
    if (!((p2 == (__call1052_5(__fieldRead1052_4(__fieldRead1052_3(__fieldRead1052_2(receiver)))) + __invokedynamic1052_6(18641, (2620720618644601003L ^ life4_3)))))) {
        break forward_join_24;
    }
    forwardValue1052_25_0 = 1;
    break forward_join_25;
    }
    forwardValue1052_25_0 = 0;
    }
    life6_27 = forwardValue1052_25_0;
    life7_32 = __call1052_7(receiver, p0, p1);
    life8_34 = __call1052_8();
    spill1052_0 = receiver;
    if (!((__fieldRead1052_9(receiver) == life7_32))) {
        forwardValue1052_55_0 = spill1052_0;
        break forward_join_55;
    }
    if (!((__numericCompare1052_12((life8_34 - __fieldRead1052_10(receiver)), __invokedynamic1052_11(20165, (2649491637532458361L ^ life4_3))) < 0))) {
        forwardValue1052_55_0 = spill1052_0;
        break forward_join_55;
    }
    if (!((__fieldRead1052_13(receiver) == p2))) {
        forwardValue1052_55_0 = spill1052_0;
        break forward_join_55;
    }
    forwardValue1052_56_0 = spill1052_0;
    forwardValue1052_56_1 = 1;
    break forward_join_56;
    }
    forwardValue1052_56_0 = forwardValue1052_55_0;
    forwardValue1052_56_1 = 0;
    }
    __fieldWrite1052_14(forwardValue1052_56_0, forwardValue1052_56_1);
    __fieldWrite1052_15(receiver, 0);
    if (!(__call1052_17(receiver, (p2 - __invokedynamic1052_16(18641, (2620720618644601003L ^ life4_3)))))) {
        break forward_join_73;
    }
    if (!((life6_27 == 0))) {
        break forward_join_73;
    }
    return;
    }
    if (!((p2 != 0))) {
        break forward_join_80;
    }
    if (!((p2 != 1))) {
        break forward_join_80;
    }
    if (!((life6_27 != 0))) {
        break forward_join_306;
    }
    }
    life10_103 = __fieldRead1052_18(receiver);
    life11_106 = __fieldRead1052_19(receiver);
    if (!((p0 >= life10_103))) {
        break forward_join_104;
    }
    if (!((p1 >= life11_106))) {
        break forward_join_104;
    }
    if (!((p0 < (life10_103 + __fieldRead1052_20(receiver))))) {
        break forward_join_104;
    }
    if (!((p1 >= (life11_106 + __fieldRead1052_21(receiver))))) {
        break forward_join_106;
    }
    }
    forwardValue1052_107_0 = 1;
    break forward_join_107;
    }
    forwardValue1052_107_0 = 0;
    }
    life12_139 = forwardValue1052_107_0;
    life13_141 = -1;
    if (!((life7_32 != null))) {
        break forward_join_115;
    }
    life13_141 = __fieldRead1052_22(life7_32);
    }
    if (!((life12_139 != 0))) {
        break forward_join_123;
    }
    life13_141 = __invokedynamic1052_23(7752, (5885718340817694255L ^ life4_3));
    }
    if (!(__fieldRead1052_26(__fieldRead1052_25(__fieldRead1052_24(receiver))))) {
        break forward_join_141;
    }
    if (!((life12_139 != 0))) {
        break forward_join_141;
    }
    if (!((__call1052_30(__fieldRead1052_29(__fieldRead1052_28(__fieldRead1052_27(receiver)))) == null))) {
        break forward_join_141;
    }
    __call1052_32(__fieldRead1052_31(receiver), null);
    return;
    }
    if (!((life13_141 != -1))) {
        break forward_join_306;
    }
    if (!(__fieldRead1052_35(__fieldRead1052_34(__fieldRead1052_33(receiver))))) {
        break forward_join_173;
    }
    if (!((life7_32 != null))) {
        break forward_join_169;
    }
    if (!(__call1052_36(life7_32))) {
        break forward_join_169;
    }
    __fieldWrite1052_37(receiver, life7_32);
    __fieldWrite1052_38(receiver, null);
    spill1052_1 = receiver;
    if (!((p2 == 1))) {
        forwardValue1052_166_0 = spill1052_1;
        break forward_join_166;
    }
    forwardValue1052_167_0 = spill1052_1;
    forwardValue1052_167_1 = 1;
    break forward_join_167;
    }
    forwardValue1052_167_0 = forwardValue1052_166_0;
    forwardValue1052_167_1 = 0;
    }
    __fieldWrite1052_39(forwardValue1052_167_0, forwardValue1052_167_1);
    break forward_join_306;
    }
    __fieldWrite1052_40(receiver, null);
    break forward_join_306;
    }
    if (!((!__fieldRead1052_41(receiver)))) {
        break forward_join_306;
    }
    if (!((__call1052_45(__fieldRead1052_44(__fieldRead1052_43(__fieldRead1052_42(receiver)))) == null))) {
        break forward_join_264;
    }
    if (!((p2 == (__call1052_49(__fieldRead1052_48(__fieldRead1052_47(__fieldRead1052_46(receiver)))) + __invokedynamic1052_50(18641, (2620720618644601003L ^ life4_3)))))) {
        break forward_join_202;
    }
    __call1052_51(receiver, life7_32, life13_141, p2, 3);
    break forward_join_260;
    }
    if (!((life13_141 != __invokedynamic1052_52(7752, (5885718340817694255L ^ life4_3))))) {
        break forward_join_225;
    }
    if (!((!__call1052_54(__invokedynamic1052_53(15506, (5800626168330194167L ^ life4_3)))))) {
        break forward_join_223;
    }
    if (!(__call1052_56(__invokedynamic1052_55(10261, (2985607489751586937L ^ life4_3))))) {
        break forward_join_225;
    }
    }
    forwardValue1052_226_0 = 1;
    break forward_join_226;
    }
    forwardValue1052_226_0 = 0;
    }
    life14_296 = forwardValue1052_226_0;
    life15_298 = 0;
    if (!((life14_296 != 0))) {
        break forward_join_245;
    }
    spill1052_2 = receiver;
    if (!((life7_32 != null))) {
        forwardValue1052_240_0 = spill1052_2;
        break forward_join_240;
    }
    if (!(__call1052_57(life7_32))) {
        forwardValue1052_240_0 = spill1052_2;
        break forward_join_240;
    }
    forwardValue1052_241_0 = spill1052_2;
    forwardValue1052_241_1 = __call1052_58(life7_32);
    break forward_join_241;
    }
    forwardValue1052_241_0 = forwardValue1052_240_0;
    forwardValue1052_241_1 = null;
    }
    __fieldWrite1052_59(forwardValue1052_241_0, forwardValue1052_241_1);
    life15_298 = 1;
    break forward_join_254;
    }
    if (!((life13_141 == __invokedynamic1052_60(7752, (5885718340817694255L ^ life4_3))))) {
        break forward_join_254;
    }
    life15_298 = 4;
    }
    __call1052_61(receiver, life7_32, life13_141, p2, life15_298);
    }
    __fieldWrite1052_62(receiver, 1);
    break forward_join_306;
    }
    __fieldWrite1052_63(receiver, 1);
    __fieldWrite1052_64(receiver, p2);
    __call1052_66(__fieldRead1052_65(receiver));
    if (!((p2 == 0))) {
        break forward_join_279;
    }
    __fieldWrite1052_67(receiver, 0);
    break forward_join_306;
    }
    if (!((p2 == 1))) {
        break forward_join_286;
    }
    __fieldWrite1052_68(receiver, 1);
    break forward_join_306;
    }
    if (!((p2 == (__call1052_72(__fieldRead1052_71(__fieldRead1052_70(__fieldRead1052_69(receiver)))) + __invokedynamic1052_73(18641, (2620720618644601003L ^ life4_3)))))) {
        break forward_join_306;
    }
    __fieldWrite1052_75(receiver, __invokedynamic1052_74(46, (8278933778214727763L ^ life4_3)));
    }
    __fieldWrite1052_76(receiver, life7_32);
    __fieldWrite1052_77(receiver, life8_34);
    __fieldWrite1052_78(receiver, p2);
    return;
}
public static void h1052_0(java.io.IOException p0) throws Throwable {
    throw __call1105200_0(p0);
}
public static void h1052_1(java.io.IOException p0) throws Throwable {
    throw __call1105201_0(p0);
}
public static void h1052_2(java.io.IOException p0) throws Throwable {
    throw __call1105202_0(p0);
}
public static void h1052_3(java.io.IOException p0) throws Throwable {
    throw __call1105203_0(p0);
}
public static void h1052_4(java.io.IOException p0) throws Throwable {
    throw __call1105204_0(p0);
}
public static void h1052_5(java.io.IOException p0) throws Throwable {
    throw __call1105205_0(p0);
}
public static void h1052_6(java.io.IOException p0) throws Throwable {
    throw __call1105206_0(p0);
}
public static void h1052_7(java.io.IOException p0) throws Throwable {
    throw __call1105207_0(p0);
}
public static void h1052_8(java.io.IOException p0) throws Throwable {
    throw __call1105208_0(p0);
}
public static void h1052_9(java.io.IOException p0) throws Throwable {
    throw __call1105209_0(p0);
}
public static void h1052_10(java.io.IOException p0) throws Throwable {
    throw __call1105210_0(p0);
}
public static void h1052_11(java.io.IOException p0) throws Throwable {
    throw __call1105211_0(p0);
}
public static void h1052_12(java.io.IOException p0) throws Throwable {
    throw __call1105212_0(p0);
}
public static void h1052_13(java.io.IOException p0) throws Throwable {
    throw __call1105213_0(p0);
}
public static void h1052_14(java.io.IOException p0) throws Throwable {
    throw __call1105214_0(p0);
}
public static void h1052_15(java.io.IOException p0) throws Throwable {
    throw __call1105215_0(p0);
}
public static void h1052_16(java.io.IOException p0) throws Throwable {
    throw __call1105216_0(p0);
}
public static void h1052_17(java.io.IOException p0) throws Throwable {
    throw __call1105217_0(p0);
}
public static void h1052_18(java.io.IOException p0) throws Throwable {
    throw __call1105218_0(p0);
}
public static void h1052_19(java.io.IOException p0) throws Throwable {
    throw __call1105219_0(p0);
}
public static void h1052_20(java.io.IOException p0) throws Throwable {
    throw __call1105220_0(p0);
}
public static void h1052_21(java.io.IOException p0) throws Throwable {
    throw __call1105221_0(p0);
}
public static void h1052_22(java.io.IOException p0) throws Throwable {
    throw __call1105222_0(p0);
}
public static void h1052_23(java.io.IOException p0) throws Throwable {
    throw __call1105223_0(p0);
}
public static void h1052_24(java.io.IOException p0) throws Throwable {
    throw __call1105224_0(p0);
}
public static void h1052_25(java.io.IOException p0) throws Throwable {
    throw __call1105225_0(p0);
}
public static void h1052_26(java.io.IOException p0) throws Throwable {
    throw __call1105226_0(p0);
}
public static void h1052_27(java.io.IOException p0) throws Throwable {
    throw __call1105227_0(p0);
}
public static void h1052_28(java.io.IOException p0) throws Throwable {
    throw __call1105228_0(p0);
}
public static void h1052_29(java.io.IOException p0) throws Throwable {
    throw __call1105229_0(p0);
}
public static void h1052_30(java.io.IOException p0) throws Throwable {
    throw __call1105230_0(p0);
}
public static void h1052_31(java.io.IOException p0) throws Throwable {
    throw __call1105231_0(p0);
}
private static native long __fieldRead1052_0() throws Throwable;
private static native void __call1052_1(moom.hg a0, int a1, int a2, int a3) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1052_2(moom.hg a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead1052_3(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.pz __fieldRead1052_4(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native int __call1052_5(moom.pz a0) throws Throwable;
private static native int __invokedynamic1052_6(int a0, long a1) throws Throwable;
private static native moom.wB __call1052_7(moom.hg a0, int a1, int a2) throws Throwable;
private static native long __call1052_8() throws Throwable;
private static native moom.wB __fieldRead1052_9(moom.hg a0) throws Throwable;
private static native long __fieldRead1052_10(moom.hg a0) throws Throwable;
private static native long __invokedynamic1052_11(int a0, long a1) throws Throwable;
private static native int __numericCompare1052_12(long a0, long a1) throws Throwable;
private static native int __fieldRead1052_13(moom.hg a0) throws Throwable;
private static native void __fieldWrite1052_14(moom.hg a0, int a1) throws Throwable;
private static native void __fieldWrite1052_15(moom.hg a0, int a1) throws Throwable;
private static native int __invokedynamic1052_16(int a0, long a1) throws Throwable;
private static native boolean __call1052_17(moom.hg a0, int a1) throws Throwable;
private static native int __fieldRead1052_18(moom.hg a0) throws Throwable;
private static native int __fieldRead1052_19(moom.hg a0) throws Throwable;
private static native int __fieldRead1052_20(moom.hg a0) throws Throwable;
private static native int __fieldRead1052_21(moom.hg a0) throws Throwable;
private static native int __fieldRead1052_22(moom.wB a0) throws Throwable;
private static native int __invokedynamic1052_23(int a0, long a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1052_24(moom.hg a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead1052_25(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __fieldRead1052_26(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1052_27(moom.hg a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead1052_28(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.entity.player.InventoryPlayer __fieldRead1052_29(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call1052_30(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1052_31(moom.hg a0) throws Throwable;
private static native void __call1052_32(net.minecraft.client.Minecraft a0, java.lang.Object a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1052_33(moom.hg a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead1052_34(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __fieldRead1052_35(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native boolean __call1052_36(moom.wB a0) throws Throwable;
private static native void __fieldWrite1052_37(moom.hg a0, moom.wB a1) throws Throwable;
private static native void __fieldWrite1052_38(moom.hg a0, java.lang.Object a1) throws Throwable;
private static native void __fieldWrite1052_39(moom.hg a0, int a1) throws Throwable;
private static native void __fieldWrite1052_40(moom.hg a0, java.lang.Object a1) throws Throwable;
private static native boolean __fieldRead1052_41(moom.hg a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1052_42(moom.hg a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead1052_43(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.entity.player.InventoryPlayer __fieldRead1052_44(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call1052_45(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1052_46(moom.hg a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead1052_47(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.pz __fieldRead1052_48(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native int __call1052_49(moom.pz a0) throws Throwable;
private static native int __invokedynamic1052_50(int a0, long a1) throws Throwable;
private static native void __call1052_51(moom.hg a0, moom.wB a1, int a2, int a3, int a4) throws Throwable;
private static native int __invokedynamic1052_52(int a0, long a1) throws Throwable;
private static native int __invokedynamic1052_53(int a0, long a1) throws Throwable;
private static native boolean __call1052_54(int a0) throws Throwable;
private static native int __invokedynamic1052_55(int a0, long a1) throws Throwable;
private static native boolean __call1052_56(int a0) throws Throwable;
private static native boolean __call1052_57(moom.wB a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call1052_58(moom.wB a0) throws Throwable;
private static native void __fieldWrite1052_59(moom.hg a0, net.minecraft.item.ItemStack a1) throws Throwable;
private static native int __invokedynamic1052_60(int a0, long a1) throws Throwable;
private static native void __call1052_61(moom.hg a0, moom.wB a1, int a2, int a3, int a4) throws Throwable;
private static native void __fieldWrite1052_62(moom.hg a0, int a1) throws Throwable;
private static native void __fieldWrite1052_63(moom.hg a0, int a1) throws Throwable;
private static native void __fieldWrite1052_64(moom.hg a0, int a1) throws Throwable;
private static native java.util.Set __fieldRead1052_65(moom.hg a0) throws Throwable;
private static native void __call1052_66(java.util.Set a0) throws Throwable;
private static native void __fieldWrite1052_67(moom.hg a0, int a1) throws Throwable;
private static native void __fieldWrite1052_68(moom.hg a0, int a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1052_69(moom.hg a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead1052_70(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.pz __fieldRead1052_71(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native int __call1052_72(moom.pz a0) throws Throwable;
private static native int __invokedynamic1052_73(int a0, long a1) throws Throwable;
private static native int __invokedynamic1052_74(int a0, long a1) throws Throwable;
private static native void __fieldWrite1052_75(moom.hg a0, int a1) throws Throwable;
private static native void __fieldWrite1052_76(moom.hg a0, moom.wB a1) throws Throwable;
private static native void __fieldWrite1052_77(moom.hg a0, long a1) throws Throwable;
private static native void __fieldWrite1052_78(moom.hg a0, int a1) throws Throwable;
private static native java.lang.Exception __call1105200_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1105201_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1105202_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1105203_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1105204_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1105205_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1105206_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1105207_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1105208_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1105209_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1105210_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1105211_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1105212_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1105213_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1105214_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1105215_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1105216_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1105217_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1105218_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1105219_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1105220_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1105221_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1105222_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1105223_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1105224_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1105225_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1105226_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1105227_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1105228_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1105229_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1105230_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1105231_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_98fe3848dd16c8d24b6f(moom.hg a0, int a1, int a2, int a3, int a4, int a5, int a6) throws E;
private static final class __SourceHandler_98fe3848dd16c8d24b6f {

public static boolean f1053(moom.hg receiver, int p0, int p1, int p2, int p3, int p4, int p5) throws Throwable {
    int forwardValue1053_41_0;
    int life7_2;
    int life8_5;
    int life5_9;
    int life6_13;
    forward_join_41: {
    forward_join_40: {
    life7_2 = __fieldRead1053_0(receiver);
    life8_5 = __fieldRead1053_1(receiver);
    life5_9 = (p4 - life7_2);
    life6_13 = (p5 - life8_5);
    if (!((life5_9 >= (p0 - 1)))) {
        break forward_join_40;
    }
    if (!((life5_9 < ((p0 + p2) + 1)))) {
        break forward_join_40;
    }
    if (!((life6_13 >= (p1 - 1)))) {
        break forward_join_40;
    }
    if (!((life6_13 < ((p1 + p3) + 1)))) {
        break forward_join_40;
    }
    forwardValue1053_41_0 = 1;
    break forward_join_41;
    }
    forwardValue1053_41_0 = 0;
    }
    return __integerCategory1053_2(forwardValue1053_41_0);
}
public static void h1053_0(moom.Oo p0) throws Throwable {
    throw __call1105300_0(p0);
}
public static void h1053_1(moom.Oo p0) throws Throwable {
    throw __call1105301_0(p0);
}
public static void h1053_2(moom.Oo p0) throws Throwable {
    throw __call1105302_0(p0);
}
public static void h1053_3(moom.Oo p0) throws Throwable {
    throw __call1105303_0(p0);
}
private static native int __fieldRead1053_0(moom.hg a0) throws Throwable;
private static native int __fieldRead1053_1(moom.hg a0) throws Throwable;
private static native boolean __integerCategory1053_2(int value) throws Throwable;
private static native java.lang.Exception __call1105300_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1105301_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1105302_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1105303_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_55209c73d1245f8d6710(moom.hg a0, int a1, int a2, int a3, long a4) throws E;
private static final class __SourceHandler_55209c73d1245f8d6710 {

public static void f439(moom.hg receiver, int p0, int p1, int p2, long p3) throws Throwable {
    long life6_3;
    moom.wB life8_8;
    net.minecraft.item.ItemStack life9_14;
    long life10_68;
    forest_join_159: {
    forest_join_125: {
    forest_join_124: {
    forest_join_118: {
    forest_join_46: {
    forest_join_28: {
    life6_3 = (__fieldRead439_0() ^ 127927499580481L);
    life8_8 = __call439_1(receiver, p0, p1);
    life9_14 = __call439_5(__fieldRead439_4(__fieldRead439_3(__fieldRead439_2(receiver))));
    if (!((__fieldRead439_6(receiver) != null))) {
        break forest_join_125;
    }
    if (!(__fieldRead439_9(__fieldRead439_8(__fieldRead439_7(receiver))))) {
        break forest_join_125;
    }
    if (!((p2 != 0))) {
        break forest_join_28;
    }
    if (!((p2 == 1))) {
        break forest_join_159;
    }
    }
    if (!((__fieldRead439_10(receiver) == null))) {
        break forest_join_46;
    }
    if (!((life8_8 != __fieldRead439_11(receiver)))) {
        break forest_join_159;
    }
    if (!((__call439_13(__fieldRead439_12(receiver)) != null))) {
        break forest_join_159;
    }
    __fieldWrite439_17(receiver, __call439_16(__call439_15(__fieldRead439_14(receiver))));
    break forest_join_159;
    }
    if (!((__fieldRead439_19(__fieldRead439_18(receiver)) > 1))) {
        break forest_join_159;
    }
    if (!((life8_8 != null))) {
        break forest_join_159;
    }
    if (!(__call439_21(life8_8, __fieldRead439_20(receiver), 0))) {
        break forest_join_159;
    }
    life10_68 = __call439_22();
    if (!((__fieldRead439_23(receiver) == life8_8))) {
        break forest_join_118;
    }
    if (!((__numericCompare439_26((life10_68 - __fieldRead439_24(receiver)), __invokedynamic439_25(12554, (52229319936232528L ^ life6_3))) > 0))) {
        break forest_join_124;
    }
    __call439_30(receiver, __fieldRead439_27(receiver), __fieldRead439_29(__fieldRead439_28(receiver)), 0, 0);
    __call439_32(receiver, life8_8, __fieldRead439_31(life8_8), 1, 0);
    __call439_36(receiver, __fieldRead439_33(receiver), __fieldRead439_35(__fieldRead439_34(receiver)), 0, 0);
    __fieldWrite439_38(receiver, (life10_68 + __invokedynamic439_37(8268, (841870360606694679L ^ life6_3))));
    net.minecraft.item.ItemStack __stackOp439_40_0 = __fieldRead439_39(receiver);
    __fieldWrite439_42(__stackOp439_40_0, (__fieldRead439_41(__stackOp439_40_0) - 1));
    break forest_join_124;
    }
    __fieldWrite439_43(receiver, life8_8);
    __fieldWrite439_44(receiver, life10_68);
    }
    break forest_join_159;
    }
    if (!(__fieldRead439_45(receiver))) {
        break forest_join_159;
    }
    if (!((life8_8 != null))) {
        break forest_join_159;
    }
    if (!((life9_14 != null))) {
        break forest_join_159;
    }
    if (!((__fieldRead439_46(life9_14) > __call439_48(__fieldRead439_47(receiver))))) {
        break forest_join_159;
    }
    if (!(__call439_49(life8_8, life9_14, 1))) {
        break forest_join_159;
    }
    if (!(__call439_50(life8_8, life9_14))) {
        break forest_join_159;
    }
    if (!(__call439_52(__fieldRead439_51(receiver), life8_8))) {
        break forest_join_159;
    }
    __call439_54(__fieldRead439_53(receiver), life8_8);
    __call439_55(receiver);
    }
    return;
}
public static void h439_0(moom.Oo p0) throws Throwable {
    throw __call3043900_0(p0);
}
public static void h439_1(moom.Oo p0) throws Throwable {
    throw __call3043901_0(p0);
}
public static void h439_2(moom.Oo p0) throws Throwable {
    throw __call3043902_0(p0);
}
public static void h439_3(moom.Oo p0) throws Throwable {
    throw __call3043903_0(p0);
}
public static void h439_4(moom.Oo p0) throws Throwable {
    throw __call3043904_0(p0);
}
public static void h439_5(moom.Oo p0) throws Throwable {
    throw __call3043905_0(p0);
}
public static void h439_6(moom.Oo p0) throws Throwable {
    throw __call3043906_0(p0);
}
public static void h439_7(moom.Oo p0) throws Throwable {
    throw __call3043907_0(p0);
}
public static void h439_8(moom.Oo p0) throws Throwable {
    throw __call3043908_0(p0);
}
public static void h439_9(moom.Oo p0) throws Throwable {
    throw __call3043909_0(p0);
}
public static void h439_10(moom.Oo p0) throws Throwable {
    throw __call3043910_0(p0);
}
public static void h439_11(moom.Oo p0) throws Throwable {
    throw __call3043911_0(p0);
}
public static void h439_12(moom.Oo p0) throws Throwable {
    throw __call3043912_0(p0);
}
public static void h439_13(moom.Oo p0) throws Throwable {
    throw __call3043913_0(p0);
}
public static void h439_14(moom.Oo p0) throws Throwable {
    throw __call3043914_0(p0);
}
public static void h439_15(moom.Oo p0) throws Throwable {
    throw __call3043915_0(p0);
}
public static void h439_16(moom.Oo p0) throws Throwable {
    throw __call3043916_0(p0);
}
public static void h439_17(moom.Oo p0) throws Throwable {
    throw __call3043917_0(p0);
}
private static native long __fieldRead439_0() throws Throwable;
private static native moom.wB __call439_1(moom.hg a0, int a1, int a2) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead439_2(moom.hg a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead439_3(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.entity.player.InventoryPlayer __fieldRead439_4(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call439_5(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native moom.wB __fieldRead439_6(moom.hg a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead439_7(moom.hg a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead439_8(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __fieldRead439_9(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native net.minecraft.item.ItemStack __fieldRead439_10(moom.hg a0) throws Throwable;
private static native moom.wB __fieldRead439_11(moom.hg a0) throws Throwable;
private static native moom.wB __fieldRead439_12(moom.hg a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call439_13(moom.wB a0) throws Throwable;
private static native moom.wB __fieldRead439_14(moom.hg a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call439_15(moom.wB a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call439_16(net.minecraft.item.ItemStack a0) throws Throwable;
private static native void __fieldWrite439_17(moom.hg a0, net.minecraft.item.ItemStack a1) throws Throwable;
private static native net.minecraft.item.ItemStack __fieldRead439_18(moom.hg a0) throws Throwable;
private static native int __fieldRead439_19(net.minecraft.item.ItemStack a0) throws Throwable;
private static native net.minecraft.item.ItemStack __fieldRead439_20(moom.hg a0) throws Throwable;
private static native boolean __call439_21(moom.wB a0, net.minecraft.item.ItemStack a1, int a2) throws Throwable;
private static native long __call439_22() throws Throwable;
private static native moom.wB __fieldRead439_23(moom.hg a0) throws Throwable;
private static native long __fieldRead439_24(moom.hg a0) throws Throwable;
private static native long __invokedynamic439_25(int a0, long a1) throws Throwable;
private static native int __numericCompare439_26(long a0, long a1) throws Throwable;
private static native moom.wB __fieldRead439_27(moom.hg a0) throws Throwable;
private static native moom.wB __fieldRead439_28(moom.hg a0) throws Throwable;
private static native int __fieldRead439_29(moom.wB a0) throws Throwable;
private static native void __call439_30(moom.hg a0, moom.wB a1, int a2, int a3, int a4) throws Throwable;
private static native int __fieldRead439_31(moom.wB a0) throws Throwable;
private static native void __call439_32(moom.hg a0, moom.wB a1, int a2, int a3, int a4) throws Throwable;
private static native moom.wB __fieldRead439_33(moom.hg a0) throws Throwable;
private static native moom.wB __fieldRead439_34(moom.hg a0) throws Throwable;
private static native int __fieldRead439_35(moom.wB a0) throws Throwable;
private static native void __call439_36(moom.hg a0, moom.wB a1, int a2, int a3, int a4) throws Throwable;
private static native long __invokedynamic439_37(int a0, long a1) throws Throwable;
private static native void __fieldWrite439_38(moom.hg a0, long a1) throws Throwable;
private static native net.minecraft.item.ItemStack __fieldRead439_39(moom.hg a0) throws Throwable;
private static native int __fieldRead439_41(net.minecraft.item.ItemStack a0) throws Throwable;
private static native void __fieldWrite439_42(net.minecraft.item.ItemStack a0, int a1) throws Throwable;
private static native void __fieldWrite439_43(moom.hg a0, moom.wB a1) throws Throwable;
private static native void __fieldWrite439_44(moom.hg a0, long a1) throws Throwable;
private static native boolean __fieldRead439_45(moom.hg a0) throws Throwable;
private static native int __fieldRead439_46(net.minecraft.item.ItemStack a0) throws Throwable;
private static native java.util.Set __fieldRead439_47(moom.hg a0) throws Throwable;
private static native int __call439_48(java.util.Set a0) throws Throwable;
private static native boolean __call439_49(moom.wB a0, net.minecraft.item.ItemStack a1, int a2) throws Throwable;
private static native boolean __call439_50(moom.wB a0, net.minecraft.item.ItemStack a1) throws Throwable;
private static native moom.v8 __fieldRead439_51(moom.hg a0) throws Throwable;
private static native boolean __call439_52(moom.v8 a0, moom.wB a1) throws Throwable;
private static native java.util.Set __fieldRead439_53(moom.hg a0) throws Throwable;
private static native boolean __call439_54(java.util.Set a0, moom.wB a1) throws Throwable;
private static native void __call439_55(moom.hg a0) throws Throwable;
private static native java.lang.Exception __call3043900_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3043901_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3043902_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3043903_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3043904_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3043905_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3043906_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3043907_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3043908_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3043909_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3043910_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3043911_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3043912_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3043913_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3043914_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3043915_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3043916_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3043917_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_cd9e86d60cc08d35960a(moom.hg a0, moom.wB a1) throws E;
private static final class __SourceHandler_cd9e86d60cc08d35960a {

public static void f176(moom.hg receiver, moom.wB p0) throws Throwable {
    int forwardValue176_28_0;
    java.util.Set forwardValue176_100_0;
    int forwardValue176_100_1;
    net.minecraft.item.ItemStack forwardValue176_100_2;
    java.util.Set forwardValue176_103_0;
    int forwardValue176_103_1;
    net.minecraft.item.ItemStack forwardValue176_103_2;
    int forwardValue176_103_3;
    java.util.Set spill176_0;
    int spill176_1;
    net.minecraft.item.ItemStack spill176_2;
    long life2_3;
    int life4_6;
    int life5_9;
    net.minecraft.item.ItemStack life6_12;
    int life7_14;
    int life8_36;
    net.minecraft.item.ItemStack life9_42;
    java.lang.String life10_44;
    java.lang.String life11_187;
    net.minecraft.client.renderer.texture.TextureAtlasSprite life12_195;
    forward_join_229: {
    forward_join_213: {
    forward_join_187: {
    forward_join_143: {
    forward_join_136: {
    forward_join_118: {
    forward_join_103: {
    forward_join_100: {
    forward_join_75: {
    forward_join_59: {
    forward_join_28: {
    forward_join_27: {
    life2_3 = (__fieldRead176_0() ^ 6678414805481L);
    life4_6 = __fieldRead176_1(p0);
    life5_9 = __fieldRead176_2(p0);
    life6_12 = __call176_3(p0);
    life7_14 = 0;
    if (!((p0 == __fieldRead176_4(receiver)))) {
        break forward_join_27;
    }
    if (!((__fieldRead176_5(receiver) != null))) {
        break forward_join_27;
    }
    if (!((!__fieldRead176_6(receiver)))) {
        break forward_join_27;
    }
    forwardValue176_28_0 = 1;
    break forward_join_28;
    }
    forwardValue176_28_0 = 0;
    }
    life8_36 = forwardValue176_28_0;
    life9_42 = __call176_10(__fieldRead176_9(__fieldRead176_8(__fieldRead176_7(receiver))));
    life10_44 = null;
    if (!((p0 == __fieldRead176_11(receiver)))) {
        break forward_join_59;
    }
    if (!((__fieldRead176_12(receiver) != null))) {
        break forward_join_59;
    }
    if (!(__fieldRead176_13(receiver))) {
        break forward_join_59;
    }
    if (!((life6_12 != null))) {
        break forward_join_59;
    }
    life6_12 = __call176_14(life6_12);
    net.minecraft.item.ItemStack __stackOp176_15_0 = life6_12;
    __fieldWrite176_17(__stackOp176_15_0, (__fieldRead176_16(__stackOp176_15_0) / 2));
    break forward_join_143;
    }
    if (!(__fieldRead176_18(receiver))) {
        break forward_join_143;
    }
    if (!(__call176_20(__fieldRead176_19(receiver), p0))) {
        break forward_join_143;
    }
    if (!((life9_42 != null))) {
        break forward_join_143;
    }
    if (!((__call176_22(__fieldRead176_21(receiver)) == 1))) {
        break forward_join_75;
    }
    return;
    }
    if (!(__call176_23(p0, life9_42, 1))) {
        break forward_join_136;
    }
    if (!(__call176_25(__fieldRead176_24(receiver), p0))) {
        break forward_join_136;
    }
    life6_12 = __call176_26(life9_42);
    life7_14 = 1;
    spill176_0 = __fieldRead176_27(receiver);
    spill176_1 = __fieldRead176_28(receiver);
    spill176_2 = life6_12;
    if (!((__call176_29(p0) == null))) {
        forwardValue176_100_0 = spill176_0;
        forwardValue176_100_1 = spill176_1;
        forwardValue176_100_2 = spill176_2;
        break forward_join_100;
    }
    forwardValue176_103_0 = spill176_0;
    forwardValue176_103_1 = spill176_1;
    forwardValue176_103_2 = spill176_2;
    forwardValue176_103_3 = 0;
    break forward_join_103;
    }
    forwardValue176_103_0 = forwardValue176_100_0;
    forwardValue176_103_1 = forwardValue176_100_1;
    forwardValue176_103_2 = forwardValue176_100_2;
    forwardValue176_103_3 = __fieldRead176_31(__call176_30(p0));
    }
    __call176_32(forwardValue176_103_0, forwardValue176_103_1, forwardValue176_103_2, forwardValue176_103_3);
    if (!((__fieldRead176_33(life6_12) > __call176_34(life6_12)))) {
        break forward_join_118;
    }
    life10_44 = __invokedynamic176_37(__fieldRead176_35(), __call176_36(life6_12));
    __fieldWrite176_39(life6_12, __call176_38(life6_12));
    }
    if (!((__fieldRead176_40(life6_12) > __call176_41(p0, life6_12)))) {
        break forward_join_143;
    }
    life10_44 = __invokedynamic176_44(__fieldRead176_42(), __call176_43(p0, life6_12));
    __fieldWrite176_46(life6_12, __call176_45(p0, life6_12));
    break forward_join_143;
    }
    __call176_48(__fieldRead176_47(receiver), p0);
    __call176_49(receiver);
    }
    __fieldWrite176_50(receiver, 0x1.9p6f);
    __fieldWrite176_52(__fieldRead176_51(receiver), 0x1.9p6f);
    if (!((life6_12 == null))) {
        break forward_join_187;
    }
    life11_187 = __call176_53(p0);
    if (!((life11_187 != null))) {
        break forward_join_187;
    }
    life12_195 = __call176_56(__call176_55(__fieldRead176_54(receiver)), life11_187);
    __call176_57();
    __call176_61(__call176_59(__fieldRead176_58(receiver)), __fieldRead176_60());
    __call176_64(receiver, life4_6, life5_9, life12_195, __invokedynamic176_62(19167, (2447369495988607471L ^ life2_3)), __invokedynamic176_63(19167, (2447369495988607471L ^ life2_3)));
    __call176_65();
    life8_36 = 1;
    }
    if (!((life8_36 == 0))) {
        break forward_join_229;
    }
    if (!((life7_14 != 0))) {
        break forward_join_213;
    }
    __call176_69(life4_6, life5_9, (life4_6 + __invokedynamic176_66(19167, (2447369495988607471L ^ life2_3))), (life5_9 + __invokedynamic176_67(19167, (2447369495988607471L ^ life2_3))), __invokedynamic176_68(26229, (1525563417400554833L ^ life2_3)));
    }
    __call176_70();
    __call176_72(__fieldRead176_71(receiver), life6_12, life4_6, life5_9);
    __call176_75(__fieldRead176_73(receiver), __fieldRead176_74(receiver), life6_12, life4_6, life5_9, life10_44);
    }
    __fieldWrite176_77(__fieldRead176_76(receiver), 0x0.0p0f);
    __fieldWrite176_78(receiver, 0x0.0p0f);
    return;
}
public static void h176_0(moom.Oo p0) throws Throwable {
    throw __call1017600_0(p0);
}
public static void h176_1(moom.Oo p0) throws Throwable {
    throw __call1017601_0(p0);
}
public static void h176_2(moom.Oo p0) throws Throwable {
    throw __call1017602_0(p0);
}
public static void h176_3(moom.Oo p0) throws Throwable {
    throw __call1017603_0(p0);
}
public static void h176_4(moom.Oo p0) throws Throwable {
    throw __call1017604_0(p0);
}
public static void h176_5(moom.Oo p0) throws Throwable {
    throw __call1017605_0(p0);
}
public static void h176_6(moom.Oo p0) throws Throwable {
    throw __call1017606_0(p0);
}
public static void h176_7(moom.Oo p0) throws Throwable {
    throw __call1017607_0(p0);
}
public static void h176_8(moom.Oo p0) throws Throwable {
    throw __call1017608_0(p0);
}
public static void h176_9(moom.Oo p0) throws Throwable {
    throw __call1017609_0(p0);
}
public static void h176_10(moom.Oo p0) throws Throwable {
    throw __call1017610_0(p0);
}
public static void h176_11(moom.Oo p0) throws Throwable {
    throw __call1017611_0(p0);
}
public static void h176_12(moom.Oo p0) throws Throwable {
    throw __call1017612_0(p0);
}
public static void h176_13(moom.Oo p0) throws Throwable {
    throw __call1017613_0(p0);
}
private static native long __fieldRead176_0() throws Throwable;
private static native int __fieldRead176_1(moom.wB a0) throws Throwable;
private static native int __fieldRead176_2(moom.wB a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call176_3(moom.wB a0) throws Throwable;
private static native moom.wB __fieldRead176_4(moom.hg a0) throws Throwable;
private static native net.minecraft.item.ItemStack __fieldRead176_5(moom.hg a0) throws Throwable;
private static native boolean __fieldRead176_6(moom.hg a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead176_7(moom.hg a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead176_8(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.entity.player.InventoryPlayer __fieldRead176_9(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call176_10(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native moom.wB __fieldRead176_11(moom.hg a0) throws Throwable;
private static native net.minecraft.item.ItemStack __fieldRead176_12(moom.hg a0) throws Throwable;
private static native boolean __fieldRead176_13(moom.hg a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call176_14(net.minecraft.item.ItemStack a0) throws Throwable;
private static native int __fieldRead176_16(net.minecraft.item.ItemStack a0) throws Throwable;
private static native void __fieldWrite176_17(net.minecraft.item.ItemStack a0, int a1) throws Throwable;
private static native boolean __fieldRead176_18(moom.hg a0) throws Throwable;
private static native java.util.Set __fieldRead176_19(moom.hg a0) throws Throwable;
private static native boolean __call176_20(java.util.Set a0, moom.wB a1) throws Throwable;
private static native java.util.Set __fieldRead176_21(moom.hg a0) throws Throwable;
private static native int __call176_22(java.util.Set a0) throws Throwable;
private static native boolean __call176_23(moom.wB a0, net.minecraft.item.ItemStack a1, int a2) throws Throwable;
private static native moom.v8 __fieldRead176_24(moom.hg a0) throws Throwable;
private static native boolean __call176_25(moom.v8 a0, moom.wB a1) throws Throwable;
private static native net.minecraft.item.ItemStack __call176_26(net.minecraft.item.ItemStack a0) throws Throwable;
private static native java.util.Set __fieldRead176_27(moom.hg a0) throws Throwable;
private static native int __fieldRead176_28(moom.hg a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call176_29(moom.wB a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call176_30(moom.wB a0) throws Throwable;
private static native int __fieldRead176_31(net.minecraft.item.ItemStack a0) throws Throwable;
private static native void __call176_32(java.util.Set a0, int a1, net.minecraft.item.ItemStack a2, int a3) throws Throwable;
private static native int __fieldRead176_33(net.minecraft.item.ItemStack a0) throws Throwable;
private static native int __call176_34(net.minecraft.item.ItemStack a0) throws Throwable;
private static native net.minecraft.util.EnumChatFormatting __fieldRead176_35() throws Throwable;
private static native int __call176_36(net.minecraft.item.ItemStack a0) throws Throwable;
private static native java.lang.String __invokedynamic176_37(net.minecraft.util.EnumChatFormatting a0, int a1) throws Throwable;
private static native int __call176_38(net.minecraft.item.ItemStack a0) throws Throwable;
private static native void __fieldWrite176_39(net.minecraft.item.ItemStack a0, int a1) throws Throwable;
private static native int __fieldRead176_40(net.minecraft.item.ItemStack a0) throws Throwable;
private static native int __call176_41(moom.wB a0, net.minecraft.item.ItemStack a1) throws Throwable;
private static native net.minecraft.util.EnumChatFormatting __fieldRead176_42() throws Throwable;
private static native int __call176_43(moom.wB a0, net.minecraft.item.ItemStack a1) throws Throwable;
private static native java.lang.String __invokedynamic176_44(net.minecraft.util.EnumChatFormatting a0, int a1) throws Throwable;
private static native int __call176_45(moom.wB a0, net.minecraft.item.ItemStack a1) throws Throwable;
private static native void __fieldWrite176_46(net.minecraft.item.ItemStack a0, int a1) throws Throwable;
private static native java.util.Set __fieldRead176_47(moom.hg a0) throws Throwable;
private static native boolean __call176_48(java.util.Set a0, moom.wB a1) throws Throwable;
private static native void __call176_49(moom.hg a0) throws Throwable;
private static native void __fieldWrite176_50(moom.hg a0, float a1) throws Throwable;
private static native net.minecraft.client.renderer.entity.RenderItem __fieldRead176_51(moom.hg a0) throws Throwable;
private static native void __fieldWrite176_52(net.minecraft.client.renderer.entity.RenderItem a0, float a1) throws Throwable;
private static native java.lang.String __call176_53(moom.wB a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead176_54(moom.hg a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureMap __call176_55(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __call176_56(net.minecraft.client.renderer.texture.TextureMap a0, java.lang.String a1) throws Throwable;
private static native void __call176_57() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead176_58(moom.hg a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureManager __call176_59(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.DD __fieldRead176_60() throws Throwable;
private static native void __call176_61(net.minecraft.client.renderer.texture.TextureManager a0, moom.DD a1) throws Throwable;
private static native int __invokedynamic176_62(int a0, long a1) throws Throwable;
private static native int __invokedynamic176_63(int a0, long a1) throws Throwable;
private static native void __call176_64(moom.hg a0, int a1, int a2, net.minecraft.client.renderer.texture.TextureAtlasSprite a3, int a4, int a5) throws Throwable;
private static native void __call176_65() throws Throwable;
private static native int __invokedynamic176_66(int a0, long a1) throws Throwable;
private static native int __invokedynamic176_67(int a0, long a1) throws Throwable;
private static native int __invokedynamic176_68(int a0, long a1) throws Throwable;
private static native void __call176_69(int a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native void __call176_70() throws Throwable;
private static native net.minecraft.client.renderer.entity.RenderItem __fieldRead176_71(moom.hg a0) throws Throwable;
private static native void __call176_72(net.minecraft.client.renderer.entity.RenderItem a0, net.minecraft.item.ItemStack a1, int a2, int a3) throws Throwable;
private static native net.minecraft.client.renderer.entity.RenderItem __fieldRead176_73(moom.hg a0) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead176_74(moom.hg a0) throws Throwable;
private static native void __call176_75(net.minecraft.client.renderer.entity.RenderItem a0, net.minecraft.client.gui.FontRenderer a1, net.minecraft.item.ItemStack a2, int a3, int a4, java.lang.String a5) throws Throwable;
private static native net.minecraft.client.renderer.entity.RenderItem __fieldRead176_76(moom.hg a0) throws Throwable;
private static native void __fieldWrite176_77(net.minecraft.client.renderer.entity.RenderItem a0, float a1) throws Throwable;
private static native void __fieldWrite176_78(moom.hg a0, float a1) throws Throwable;
private static native java.lang.Exception __call1017600_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1017601_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1017602_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1017603_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1017604_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1017605_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1017606_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1017607_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1017608_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1017609_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1017610_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1017611_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1017612_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1017613_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_d772a4a4cd72269e24df(moom.hg a0, net.minecraft.item.ItemStack a1, int a2, int a3, java.lang.String a4) throws E;
private static final class __SourceHandler_d772a4a4cd72269e24df {

public static void f1785(moom.hg receiver, net.minecraft.item.ItemStack p0, int p1, int p2, java.lang.String p3) throws Throwable {
    long life5_3;
    life5_3 = (__fieldRead1785_0() ^ 16623182515581L);
    __call1785_1(0x0.0p0f, 0x0.0p0f, 0x1.0p5f);
    __fieldWrite1785_2(receiver, 0x1.9p7f);
    __fieldWrite1785_4(__fieldRead1785_3(receiver), 0x1.9p7f);
    __call1785_6(__fieldRead1785_5(receiver), p0, p1, p2);
    net.minecraft.client.renderer.entity.RenderItem spill1785_0 = __fieldRead1785_7(receiver);
    net.minecraft.client.gui.FontRenderer spill1785_1 = __fieldRead1785_8(receiver);
    net.minecraft.item.ItemStack spill1785_2 = p0;
    int spill1785_3 = p1;
    int spill1785_4 = p2;
    __call1785_11(spill1785_0, spill1785_1, spill1785_2, spill1785_3, (spill1785_4 - ((__fieldRead1785_9(receiver) == null) ? 0 : __invokedynamic1785_10(20063, (8246780793539582441L ^ life5_3)))), p3);
    __fieldWrite1785_12(receiver, 0x0.0p0f);
    __fieldWrite1785_14(__fieldRead1785_13(receiver), 0x0.0p0f);
    return;
}
public static void h1785_0(moom.Oo p0) throws Throwable {
    throw __call1178500_0(p0);
}
private static native long __fieldRead1785_0() throws Throwable;
private static native void __call1785_1(float a0, float a1, float a2) throws Throwable;
private static native void __fieldWrite1785_2(moom.hg a0, float a1) throws Throwable;
private static native net.minecraft.client.renderer.entity.RenderItem __fieldRead1785_3(moom.hg a0) throws Throwable;
private static native void __fieldWrite1785_4(net.minecraft.client.renderer.entity.RenderItem a0, float a1) throws Throwable;
private static native net.minecraft.client.renderer.entity.RenderItem __fieldRead1785_5(moom.hg a0) throws Throwable;
private static native void __call1785_6(net.minecraft.client.renderer.entity.RenderItem a0, net.minecraft.item.ItemStack a1, int a2, int a3) throws Throwable;
private static native net.minecraft.client.renderer.entity.RenderItem __fieldRead1785_7(moom.hg a0) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead1785_8(moom.hg a0) throws Throwable;
private static native net.minecraft.item.ItemStack __fieldRead1785_9(moom.hg a0) throws Throwable;
private static native int __invokedynamic1785_10(int a0, long a1) throws Throwable;
private static native void __call1785_11(net.minecraft.client.renderer.entity.RenderItem a0, net.minecraft.client.gui.FontRenderer a1, net.minecraft.item.ItemStack a2, int a3, int a4, java.lang.String a5) throws Throwable;
private static native void __fieldWrite1785_12(moom.hg a0, float a1) throws Throwable;
private static native net.minecraft.client.renderer.entity.RenderItem __fieldRead1785_13(moom.hg a0) throws Throwable;
private static native void __fieldWrite1785_14(net.minecraft.client.renderer.entity.RenderItem a0, float a1) throws Throwable;
private static native java.lang.Exception __call1178500_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_d99f6cdde97d437a4f75(moom.hg a0, moom.gc a1) throws E;
private static final class __SourceHandler_d99f6cdde97d437a4f75 {

public static void f372(moom.hg receiver, moom.gc p0) throws Throwable {
    forward_join_27: {
    forward_join_21: {
    forward_join_14: {
    forward_join_7: {
    if (!((__fieldRead372_0(p0) >= 2))) {
        break forward_join_27;
    }
    switch (__fieldRead372_1(p0)) {
case 2:
{
        break forward_join_7;
    }
case 3:
{
        break forward_join_14;
    }
case 4:
{
        break forward_join_21;
    }
default:
{
        break forward_join_27;
    }
}
    }
    __call372_6(__call372_5(__call372_3(__call372_2()), __classLiteral372_4()), 0);
    break forward_join_27;
    }
    __call372_11(__call372_10(__call372_8(__call372_7()), __classLiteral372_9()), 0);
    break forward_join_27;
    }
    __call372_16(__call372_15(__call372_13(__call372_12()), __classLiteral372_14()), 0);
    }
    __call372_17(receiver, p0);
    return;
}
public static void h372_0(java.io.IOException p0) throws Throwable {
    throw __call2037200_0(p0);
}
public static void h372_1(java.io.IOException p0) throws Throwable {
    throw __call2037201_0(p0);
}
private static native int __fieldRead372_0(moom.gc a0) throws Throwable;
private static native int __fieldRead372_1(moom.gc a0) throws Throwable;
private static native com.moon.runtime.ClientContext __call372_2() throws Throwable;
private static native com.moon.fU __call372_3(com.moon.runtime.ClientContext a0) throws Throwable;
private static native java.lang.Object __classLiteral372_4() throws Throwable;
private static native com.moon.module.Module __call372_5(com.moon.fU a0, java.lang.Object a1) throws Throwable;
private static native void __call372_6(com.moon.module.Module a0, int a1) throws Throwable;
private static native com.moon.runtime.ClientContext __call372_7() throws Throwable;
private static native com.moon.fU __call372_8(com.moon.runtime.ClientContext a0) throws Throwable;
private static native java.lang.Object __classLiteral372_9() throws Throwable;
private static native com.moon.module.Module __call372_10(com.moon.fU a0, java.lang.Object a1) throws Throwable;
private static native void __call372_11(com.moon.module.Module a0, int a1) throws Throwable;
private static native com.moon.runtime.ClientContext __call372_12() throws Throwable;
private static native com.moon.fU __call372_13(com.moon.runtime.ClientContext a0) throws Throwable;
private static native java.lang.Object __classLiteral372_14() throws Throwable;
private static native com.moon.module.Module __call372_15(com.moon.fU a0, java.lang.Object a1) throws Throwable;
private static native void __call372_16(com.moon.module.Module a0, int a1) throws Throwable;
private static native void __call372_17(moom.hg a0, moom.gc a1) throws Throwable;
private static native java.lang.Exception __call2037200_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2037201_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_3fce01955c7a2a8d2cf8(moom.hg a0, int a1, int a2, int a3) throws E;
private static final class __SourceHandler_3fce01955c7a2a8d2cf8 {

public static void f441(moom.hg receiver, int p0, int p1, int p2) throws Throwable {
    int forestValue441_36_0;
    int forestValue441_391_0;
    moom.hg forestValue441_403_0;
    moom.hg forestValue441_404_0;
    net.minecraft.item.ItemStack forestValue441_404_1;
    moom.hg forestValue441_413_0;
    moom.wB forestValue441_413_1;
    int forestValue441_413_2;
    int forestValue441_413_3;
    moom.hg forestValue441_414_0;
    moom.wB forestValue441_414_1;
    int forestValue441_414_2;
    int forestValue441_414_3;
    int forestValue441_414_4;
    moom.hg spill441_0;
    moom.hg spill441_1;
    moom.wB spill441_2;
    int spill441_3;
    int spill441_4;
    long life4_3;
    moom.wB life6_8;
    int life7_11;
    int life8_14;
    int life9_39;
    int life10_41;
    java.util.Iterator life11_89;
    moom.wB life12_96;
    int life11_211;
    java.util.Iterator life11_335;
    moom.wB life12_342;
    int life11_421;
    forest_join_424: {
    forest_join_415: {
    forest_join_414: {
    forest_join_413: {
    forest_join_405: {
    forest_join_404: {
    forest_join_403: {
    forest_join_391: {
    forest_join_390: {
    forest_join_388: {
    forest_join_367: {
    forest_join_341: {
    forest_join_327: {
    forest_join_285: {
    forest_join_278: {
    forest_join_254: {
    forest_join_250: {
    forest_join_184: {
    forest_join_172: {
    forest_join_159: {
    forest_join_152: {
    forest_join_135: {
    forest_join_128: {
    forest_join_118: {
    forest_join_117: {
    forest_join_52: {
    forest_join_44: {
    forest_join_36: {
    forest_join_35: {
    forest_join_33: {
    life4_3 = (__fieldRead441_0() ^ 82932521817273L);
    life6_8 = __call441_1(receiver, p0, p1);
    life7_11 = __fieldRead441_2(receiver);
    life8_14 = __fieldRead441_3(receiver);
    if (!((p0 >= life7_11))) {
        break forest_join_33;
    }
    if (!((p1 >= life8_14))) {
        break forest_join_33;
    }
    if (!((p0 < (life7_11 + __fieldRead441_4(receiver))))) {
        break forest_join_33;
    }
    if (!((p1 >= (life8_14 + __fieldRead441_5(receiver))))) {
        break forest_join_35;
    }
    }
    forestValue441_36_0 = 1;
    break forest_join_36;
    }
    forestValue441_36_0 = 0;
    }
    life9_39 = forestValue441_36_0;
    life10_41 = -1;
    if (!((life6_8 != null))) {
        break forest_join_44;
    }
    life10_41 = __fieldRead441_6(life6_8);
    }
    if (!((life9_39 != 0))) {
        break forest_join_52;
    }
    life10_41 = __invokedynamic441_7(16914, (6818411951902231675L ^ life4_3));
    }
    if (!(__fieldRead441_8(receiver))) {
        break forest_join_135;
    }
    if (!((life6_8 != null))) {
        break forest_join_135;
    }
    if (!((p2 == 0))) {
        break forest_join_135;
    }
    if (!(__call441_10(__fieldRead441_9(receiver), null, life6_8))) {
        break forest_join_135;
    }
    if (!(__call441_11())) {
        break forest_join_118;
    }
    if (!((life6_8 != null))) {
        break forest_join_128;
    }
    if (!((__fieldRead441_12(life6_8) != null))) {
        break forest_join_128;
    }
    if (!((__fieldRead441_13(receiver) != null))) {
        break forest_join_128;
    }
    life11_89 = __call441_16(__fieldRead441_15(__fieldRead441_14(receiver)));
    forest_cycle_80: while (true) {
    forest_join_116: {
    if (!(__call441_17(life11_89))) {
        break forest_join_117;
    }
    life12_96 = __cast441_19(__call441_18(life11_89));
    if (!((life12_96 != null))) {
        break forest_join_116;
    }
    if (!(__call441_22(life12_96, __fieldRead441_21(__fieldRead441_20(receiver))))) {
        break forest_join_116;
    }
    if (!(__call441_23(life12_96))) {
        break forest_join_116;
    }
    if (!((__fieldRead441_24(life12_96) == __fieldRead441_25(life6_8)))) {
        break forest_join_116;
    }
    if (!(__call441_27(life12_96, __fieldRead441_26(receiver), 1))) {
        break forest_join_116;
    }
    __call441_29(receiver, life12_96, __fieldRead441_28(life12_96), p2, 1);
    }
    continue forest_cycle_80;
    }
    }
    break forest_join_128;
    }
    __call441_31(receiver, life6_8, life10_41, p2, __invokedynamic441_30(31015, (691629290243209049L ^ life4_3)));
    }
    __fieldWrite441_32(receiver, 0);
    __fieldWrite441_33(receiver, 0L);
    break forest_join_415;
    }
    if (!(__fieldRead441_34(receiver))) {
        break forest_join_152;
    }
    if (!((__fieldRead441_35(receiver) != p2))) {
        break forest_join_152;
    }
    __fieldWrite441_36(receiver, 0);
    __call441_38(__fieldRead441_37(receiver));
    __fieldWrite441_39(receiver, 1);
    return;
    }
    if (!(__fieldRead441_40(receiver))) {
        break forest_join_159;
    }
    __fieldWrite441_41(receiver, 0);
    return;
    }
    if (!((__fieldRead441_42(receiver) != null))) {
        break forest_join_285;
    }
    if (!(__fieldRead441_45(__fieldRead441_44(__fieldRead441_43(receiver))))) {
        break forest_join_285;
    }
    if (!((p2 != 0))) {
        break forest_join_172;
    }
    if (!((p2 == 1))) {
        break forest_join_415;
    }
    }
    if (!((__fieldRead441_46(receiver) == null))) {
        break forest_join_184;
    }
    if (!((life6_8 != __fieldRead441_47(receiver)))) {
        break forest_join_184;
    }
    __fieldWrite441_50(receiver, __call441_49(__fieldRead441_48(receiver)));
    }
    life11_211 = __integerCategory441_53(__call441_52(life6_8, __fieldRead441_51(receiver), 0));
    if (!((life10_41 != -1))) {
        break forest_join_254;
    }
    if (!((__fieldRead441_54(receiver) != null))) {
        break forest_join_254;
    }
    if (!((life11_211 != 0))) {
        break forest_join_254;
    }
    __call441_58(receiver, __fieldRead441_55(receiver), __fieldRead441_57(__fieldRead441_56(receiver)), p2, 0);
    __call441_59(receiver, life6_8, life10_41, 0, 0);
    if (!((__call441_63(__fieldRead441_62(__fieldRead441_61(__fieldRead441_60(receiver)))) != null))) {
        break forest_join_250;
    }
    __call441_67(receiver, __fieldRead441_64(receiver), __fieldRead441_66(__fieldRead441_65(receiver)), p2, 0);
    __fieldWrite441_68(receiver, (p0 - life7_11));
    __fieldWrite441_69(receiver, (p1 - life8_14));
    __fieldWrite441_71(receiver, __fieldRead441_70(receiver));
    __fieldWrite441_73(receiver, __fieldRead441_72(receiver));
    __fieldWrite441_75(receiver, __call441_74());
    break forest_join_278;
    }
    __fieldWrite441_76(receiver, null);
    break forest_join_278;
    }
    if (!((__fieldRead441_77(receiver) != null))) {
        break forest_join_278;
    }
    __fieldWrite441_78(receiver, (p0 - life7_11));
    __fieldWrite441_79(receiver, (p1 - life8_14));
    __fieldWrite441_81(receiver, __fieldRead441_80(receiver));
    __fieldWrite441_83(receiver, __fieldRead441_82(receiver));
    __fieldWrite441_85(receiver, __call441_84());
    }
    __fieldWrite441_86(receiver, null);
    __fieldWrite441_87(receiver, null);
    break forest_join_415;
    }
    if (!(__fieldRead441_88(receiver))) {
        break forest_join_341;
    }
    if (!((!__call441_90(__fieldRead441_89(receiver))))) {
        break forest_join_341;
    }
    __call441_94(receiver, null, __invokedynamic441_91(7752, (5885657270794178611L ^ life4_3)), __call441_93(0, __fieldRead441_92(receiver)), 5);
    life11_335 = __call441_96(__fieldRead441_95(receiver));
    forest_cycle_309: while (true) {
    if (!(__call441_97(life11_335))) {
        break forest_join_327;
    }
    life12_342 = __cast441_99(__call441_98(life11_335));
    __call441_103(receiver, life12_342, __fieldRead441_100(life12_342), __call441_102(1, __fieldRead441_101(receiver)), 5);
    continue forest_cycle_309;
    }
    }
    __call441_107(receiver, null, __invokedynamic441_104(7752, (5885657270794178611L ^ life4_3)), __call441_106(2, __fieldRead441_105(receiver)), 5);
    break forest_join_415;
    }
    if (!((__call441_111(__fieldRead441_110(__fieldRead441_109(__fieldRead441_108(receiver)))) != null))) {
        break forest_join_415;
    }
    if (!((p2 == (__call441_115(__fieldRead441_114(__fieldRead441_113(__fieldRead441_112(receiver)))) + __invokedynamic441_116(28518, (9173034822748545305L ^ life4_3)))))) {
        break forest_join_367;
    }
    __call441_117(receiver, life6_8, life10_41, p2, 3);
    break forest_join_415;
    }
    if (!((life10_41 != __invokedynamic441_118(7752, (5885657270794178611L ^ life4_3))))) {
        break forest_join_390;
    }
    if (!((!__call441_120(__invokedynamic441_119(27251, (1683354315471463433L ^ life4_3)))))) {
        break forest_join_388;
    }
    if (!(__call441_122(__invokedynamic441_121(18805, (7180611729064068877L ^ life4_3))))) {
        break forest_join_390;
    }
    }
    forestValue441_391_0 = 1;
    break forest_join_391;
    }
    forestValue441_391_0 = 0;
    }
    life11_421 = forestValue441_391_0;
    if (!((life11_421 != 0))) {
        break forest_join_405;
    }
    spill441_0 = receiver;
    if (!((life6_8 != null))) {
        forestValue441_403_0 = spill441_0;
        break forest_join_403;
    }
    if (!(__call441_123(life6_8))) {
        forestValue441_403_0 = spill441_0;
        break forest_join_403;
    }
    forestValue441_404_0 = spill441_0;
    forestValue441_404_1 = __call441_124(life6_8);
    break forest_join_404;
    }
    forestValue441_404_0 = forestValue441_403_0;
    forestValue441_404_1 = null;
    }
    __fieldWrite441_125(forestValue441_404_0, forestValue441_404_1);
    }
    spill441_1 = receiver;
    spill441_2 = life6_8;
    spill441_3 = life10_41;
    spill441_4 = p2;
    if (!((life11_421 != 0))) {
        forestValue441_413_0 = spill441_1;
        forestValue441_413_1 = spill441_2;
        forestValue441_413_2 = spill441_3;
        forestValue441_413_3 = spill441_4;
        break forest_join_413;
    }
    forestValue441_414_0 = spill441_1;
    forestValue441_414_1 = spill441_2;
    forestValue441_414_2 = spill441_3;
    forestValue441_414_3 = spill441_4;
    forestValue441_414_4 = 1;
    break forest_join_414;
    }
    forestValue441_414_0 = forestValue441_413_0;
    forestValue441_414_1 = forestValue441_413_1;
    forestValue441_414_2 = forestValue441_413_2;
    forestValue441_414_3 = forestValue441_413_3;
    forestValue441_414_4 = 0;
    }
    __call441_126(forestValue441_414_0, forestValue441_414_1, forestValue441_414_2, forestValue441_414_3, forestValue441_414_4);
    }
    if (!((__call441_130(__fieldRead441_129(__fieldRead441_128(__fieldRead441_127(receiver)))) == null))) {
        break forest_join_424;
    }
    __fieldWrite441_131(receiver, 0L);
    }
    __fieldWrite441_132(receiver, 0);
    return;
}
public static void h441_0(moom.Oo p0) throws Throwable {
    throw __call3044100_0(p0);
}
public static void h441_1(moom.Oo p0) throws Throwable {
    throw __call3044101_0(p0);
}
public static void h441_2(moom.Oo p0) throws Throwable {
    throw __call3044102_0(p0);
}
public static void h441_3(moom.Oo p0) throws Throwable {
    throw __call3044103_0(p0);
}
public static void h441_4(moom.Oo p0) throws Throwable {
    throw __call3044104_0(p0);
}
public static void h441_5(moom.Oo p0) throws Throwable {
    throw __call3044105_0(p0);
}
public static void h441_6(moom.Oo p0) throws Throwable {
    throw __call3044106_0(p0);
}
public static void h441_7(moom.Oo p0) throws Throwable {
    throw __call3044107_0(p0);
}
public static void h441_8(moom.Oo p0) throws Throwable {
    throw __call3044108_0(p0);
}
public static void h441_9(moom.Oo p0) throws Throwable {
    throw __call3044109_0(p0);
}
public static void h441_10(moom.Oo p0) throws Throwable {
    throw __call3044110_0(p0);
}
public static void h441_11(moom.Oo p0) throws Throwable {
    throw __call3044111_0(p0);
}
public static void h441_12(moom.Oo p0) throws Throwable {
    throw __call3044112_0(p0);
}
public static void h441_13(moom.Oo p0) throws Throwable {
    throw __call3044113_0(p0);
}
public static void h441_14(moom.Oo p0) throws Throwable {
    throw __call3044114_0(p0);
}
public static void h441_15(moom.Oo p0) throws Throwable {
    throw __call3044115_0(p0);
}
public static void h441_16(moom.Oo p0) throws Throwable {
    throw __call3044116_0(p0);
}
public static void h441_17(moom.Oo p0) throws Throwable {
    throw __call3044117_0(p0);
}
public static void h441_18(moom.Oo p0) throws Throwable {
    throw __call3044118_0(p0);
}
public static void h441_19(moom.Oo p0) throws Throwable {
    throw __call3044119_0(p0);
}
public static void h441_20(moom.Oo p0) throws Throwable {
    throw __call3044120_0(p0);
}
public static void h441_21(moom.Oo p0) throws Throwable {
    throw __call3044121_0(p0);
}
public static void h441_22(moom.Oo p0) throws Throwable {
    throw __call3044122_0(p0);
}
public static void h441_23(moom.Oo p0) throws Throwable {
    throw __call3044123_0(p0);
}
public static void h441_24(moom.Oo p0) throws Throwable {
    throw __call3044124_0(p0);
}
public static void h441_25(moom.Oo p0) throws Throwable {
    throw __call3044125_0(p0);
}
public static void h441_26(moom.Oo p0) throws Throwable {
    throw __call3044126_0(p0);
}
public static void h441_27(moom.Oo p0) throws Throwable {
    throw __call3044127_0(p0);
}
public static void h441_28(moom.Oo p0) throws Throwable {
    throw __call3044128_0(p0);
}
public static void h441_29(moom.Oo p0) throws Throwable {
    throw __call3044129_0(p0);
}
public static void h441_30(moom.Oo p0) throws Throwable {
    throw __call3044130_0(p0);
}
public static void h441_31(moom.Oo p0) throws Throwable {
    throw __call3044131_0(p0);
}
public static void h441_32(moom.Oo p0) throws Throwable {
    throw __call3044132_0(p0);
}
public static void h441_33(moom.Oo p0) throws Throwable {
    throw __call3044133_0(p0);
}
public static void h441_34(moom.Oo p0) throws Throwable {
    throw __call3044134_0(p0);
}
public static void h441_35(moom.Oo p0) throws Throwable {
    throw __call3044135_0(p0);
}
public static void h441_36(moom.Oo p0) throws Throwable {
    throw __call3044136_0(p0);
}
public static void h441_37(moom.Oo p0) throws Throwable {
    throw __call3044137_0(p0);
}
public static void h441_38(moom.Oo p0) throws Throwable {
    throw __call3044138_0(p0);
}
public static void h441_39(moom.Oo p0) throws Throwable {
    throw __call3044139_0(p0);
}
public static void h441_40(moom.Oo p0) throws Throwable {
    throw __call3044140_0(p0);
}
private static native long __fieldRead441_0() throws Throwable;
private static native moom.wB __call441_1(moom.hg a0, int a1, int a2) throws Throwable;
private static native int __fieldRead441_2(moom.hg a0) throws Throwable;
private static native int __fieldRead441_3(moom.hg a0) throws Throwable;
private static native int __fieldRead441_4(moom.hg a0) throws Throwable;
private static native int __fieldRead441_5(moom.hg a0) throws Throwable;
private static native int __fieldRead441_6(moom.wB a0) throws Throwable;
private static native int __invokedynamic441_7(int a0, long a1) throws Throwable;
private static native boolean __fieldRead441_8(moom.hg a0) throws Throwable;
private static native moom.v8 __fieldRead441_9(moom.hg a0) throws Throwable;
private static native boolean __call441_10(moom.v8 a0, java.lang.Object a1, moom.wB a2) throws Throwable;
private static native boolean __call441_11() throws Throwable;
private static native net.minecraft.inventory.IInventory __fieldRead441_12(moom.wB a0) throws Throwable;
private static native net.minecraft.item.ItemStack __fieldRead441_13(moom.hg a0) throws Throwable;
private static native moom.v8 __fieldRead441_14(moom.hg a0) throws Throwable;
private static native java.util.List __fieldRead441_15(moom.v8 a0) throws Throwable;
private static native java.util.Iterator __call441_16(java.util.List a0) throws Throwable;
private static native boolean __call441_17(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call441_18(java.util.Iterator a0) throws Throwable;
private static native moom.wB __cast441_19(java.lang.Object a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead441_20(moom.hg a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead441_21(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __call441_22(moom.wB a0, net.minecraft.client.entity.EntityPlayerSP a1) throws Throwable;
private static native boolean __call441_23(moom.wB a0) throws Throwable;
private static native net.minecraft.inventory.IInventory __fieldRead441_24(moom.wB a0) throws Throwable;
private static native net.minecraft.inventory.IInventory __fieldRead441_25(moom.wB a0) throws Throwable;
private static native net.minecraft.item.ItemStack __fieldRead441_26(moom.hg a0) throws Throwable;
private static native boolean __call441_27(moom.wB a0, net.minecraft.item.ItemStack a1, int a2) throws Throwable;
private static native int __fieldRead441_28(moom.wB a0) throws Throwable;
private static native void __call441_29(moom.hg a0, moom.wB a1, int a2, int a3, int a4) throws Throwable;
private static native int __invokedynamic441_30(int a0, long a1) throws Throwable;
private static native void __call441_31(moom.hg a0, moom.wB a1, int a2, int a3, int a4) throws Throwable;
private static native void __fieldWrite441_32(moom.hg a0, int a1) throws Throwable;
private static native void __fieldWrite441_33(moom.hg a0, long a1) throws Throwable;
private static native boolean __fieldRead441_34(moom.hg a0) throws Throwable;
private static native int __fieldRead441_35(moom.hg a0) throws Throwable;
private static native void __fieldWrite441_36(moom.hg a0, int a1) throws Throwable;
private static native java.util.Set __fieldRead441_37(moom.hg a0) throws Throwable;
private static native void __call441_38(java.util.Set a0) throws Throwable;
private static native void __fieldWrite441_39(moom.hg a0, int a1) throws Throwable;
private static native boolean __fieldRead441_40(moom.hg a0) throws Throwable;
private static native void __fieldWrite441_41(moom.hg a0, int a1) throws Throwable;
private static native moom.wB __fieldRead441_42(moom.hg a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead441_43(moom.hg a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead441_44(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __fieldRead441_45(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native net.minecraft.item.ItemStack __fieldRead441_46(moom.hg a0) throws Throwable;
private static native moom.wB __fieldRead441_47(moom.hg a0) throws Throwable;
private static native moom.wB __fieldRead441_48(moom.hg a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call441_49(moom.wB a0) throws Throwable;
private static native void __fieldWrite441_50(moom.hg a0, net.minecraft.item.ItemStack a1) throws Throwable;
private static native net.minecraft.item.ItemStack __fieldRead441_51(moom.hg a0) throws Throwable;
private static native boolean __call441_52(moom.wB a0, net.minecraft.item.ItemStack a1, int a2) throws Throwable;
private static native int __integerCategory441_53(boolean value) throws Throwable;
private static native net.minecraft.item.ItemStack __fieldRead441_54(moom.hg a0) throws Throwable;
private static native moom.wB __fieldRead441_55(moom.hg a0) throws Throwable;
private static native moom.wB __fieldRead441_56(moom.hg a0) throws Throwable;
private static native int __fieldRead441_57(moom.wB a0) throws Throwable;
private static native void __call441_58(moom.hg a0, moom.wB a1, int a2, int a3, int a4) throws Throwable;
private static native void __call441_59(moom.hg a0, moom.wB a1, int a2, int a3, int a4) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead441_60(moom.hg a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead441_61(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.entity.player.InventoryPlayer __fieldRead441_62(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call441_63(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native moom.wB __fieldRead441_64(moom.hg a0) throws Throwable;
private static native moom.wB __fieldRead441_65(moom.hg a0) throws Throwable;
private static native int __fieldRead441_66(moom.wB a0) throws Throwable;
private static native void __call441_67(moom.hg a0, moom.wB a1, int a2, int a3, int a4) throws Throwable;
private static native void __fieldWrite441_68(moom.hg a0, int a1) throws Throwable;
private static native void __fieldWrite441_69(moom.hg a0, int a1) throws Throwable;
private static native moom.wB __fieldRead441_70(moom.hg a0) throws Throwable;
private static native void __fieldWrite441_71(moom.hg a0, moom.wB a1) throws Throwable;
private static native net.minecraft.item.ItemStack __fieldRead441_72(moom.hg a0) throws Throwable;
private static native void __fieldWrite441_73(moom.hg a0, net.minecraft.item.ItemStack a1) throws Throwable;
private static native long __call441_74() throws Throwable;
private static native void __fieldWrite441_75(moom.hg a0, long a1) throws Throwable;
private static native void __fieldWrite441_76(moom.hg a0, java.lang.Object a1) throws Throwable;
private static native net.minecraft.item.ItemStack __fieldRead441_77(moom.hg a0) throws Throwable;
private static native void __fieldWrite441_78(moom.hg a0, int a1) throws Throwable;
private static native void __fieldWrite441_79(moom.hg a0, int a1) throws Throwable;
private static native moom.wB __fieldRead441_80(moom.hg a0) throws Throwable;
private static native void __fieldWrite441_81(moom.hg a0, moom.wB a1) throws Throwable;
private static native net.minecraft.item.ItemStack __fieldRead441_82(moom.hg a0) throws Throwable;
private static native void __fieldWrite441_83(moom.hg a0, net.minecraft.item.ItemStack a1) throws Throwable;
private static native long __call441_84() throws Throwable;
private static native void __fieldWrite441_85(moom.hg a0, long a1) throws Throwable;
private static native void __fieldWrite441_86(moom.hg a0, java.lang.Object a1) throws Throwable;
private static native void __fieldWrite441_87(moom.hg a0, java.lang.Object a1) throws Throwable;
private static native boolean __fieldRead441_88(moom.hg a0) throws Throwable;
private static native java.util.Set __fieldRead441_89(moom.hg a0) throws Throwable;
private static native boolean __call441_90(java.util.Set a0) throws Throwable;
private static native int __invokedynamic441_91(int a0, long a1) throws Throwable;
private static native int __fieldRead441_92(moom.hg a0) throws Throwable;
private static native int __call441_93(int a0, int a1) throws Throwable;
private static native void __call441_94(moom.hg a0, java.lang.Object a1, int a2, int a3, int a4) throws Throwable;
private static native java.util.Set __fieldRead441_95(moom.hg a0) throws Throwable;
private static native java.util.Iterator __call441_96(java.util.Set a0) throws Throwable;
private static native boolean __call441_97(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call441_98(java.util.Iterator a0) throws Throwable;
private static native moom.wB __cast441_99(java.lang.Object a0) throws Throwable;
private static native int __fieldRead441_100(moom.wB a0) throws Throwable;
private static native int __fieldRead441_101(moom.hg a0) throws Throwable;
private static native int __call441_102(int a0, int a1) throws Throwable;
private static native void __call441_103(moom.hg a0, moom.wB a1, int a2, int a3, int a4) throws Throwable;
private static native int __invokedynamic441_104(int a0, long a1) throws Throwable;
private static native int __fieldRead441_105(moom.hg a0) throws Throwable;
private static native int __call441_106(int a0, int a1) throws Throwable;
private static native void __call441_107(moom.hg a0, java.lang.Object a1, int a2, int a3, int a4) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead441_108(moom.hg a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead441_109(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.entity.player.InventoryPlayer __fieldRead441_110(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call441_111(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead441_112(moom.hg a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead441_113(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.pz __fieldRead441_114(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native int __call441_115(moom.pz a0) throws Throwable;
private static native int __invokedynamic441_116(int a0, long a1) throws Throwable;
private static native void __call441_117(moom.hg a0, moom.wB a1, int a2, int a3, int a4) throws Throwable;
private static native int __invokedynamic441_118(int a0, long a1) throws Throwable;
private static native int __invokedynamic441_119(int a0, long a1) throws Throwable;
private static native boolean __call441_120(int a0) throws Throwable;
private static native int __invokedynamic441_121(int a0, long a1) throws Throwable;
private static native boolean __call441_122(int a0) throws Throwable;
private static native boolean __call441_123(moom.wB a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call441_124(moom.wB a0) throws Throwable;
private static native void __fieldWrite441_125(moom.hg a0, net.minecraft.item.ItemStack a1) throws Throwable;
private static native void __call441_126(moom.hg a0, moom.wB a1, int a2, int a3, int a4) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead441_127(moom.hg a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead441_128(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.entity.player.InventoryPlayer __fieldRead441_129(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call441_130(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native void __fieldWrite441_131(moom.hg a0, long a1) throws Throwable;
private static native void __fieldWrite441_132(moom.hg a0, int a1) throws Throwable;
private static native java.lang.Exception __call3044100_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3044101_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3044102_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3044103_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3044104_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3044105_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3044106_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3044107_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3044108_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3044109_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3044110_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3044111_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3044112_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3044113_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3044114_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3044115_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3044116_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3044117_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3044118_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3044119_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3044120_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3044121_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3044122_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3044123_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3044124_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3044125_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3044126_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3044127_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3044128_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3044129_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3044130_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3044131_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3044132_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3044133_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3044134_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3044135_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3044136_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3044137_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3044138_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3044139_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3044140_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_05e841b6bce708470280(moom.hg a0, int a1) throws E;
private static final class __SourceHandler_05e841b6bce708470280 {

public static boolean f1788(moom.hg receiver, int p0) throws Throwable {
    long life2_3;
    int life4_17;
    life2_3 = (__fieldRead1788_0() ^ 91835278209389L);
    if ((__call1788_4(__fieldRead1788_3(__fieldRead1788_2(__fieldRead1788_1(receiver)))) == null)) {
        if ((__fieldRead1788_5(receiver) != null)) {
        life4_17 = 0;
        loop_region_15: while ((life4_17 < __invokedynamic1788_6(11752, (748683244523652673L ^ life2_3)))) {
        if ((p0 == __call1788_10((__fieldRead1788_9(__fieldRead1788_8(__fieldRead1788_7(receiver))))[life4_17]))) {
        __call1788_14(receiver, __fieldRead1788_11(receiver), __fieldRead1788_13(__fieldRead1788_12(receiver)), life4_17, 2);
        return true;
    }
        life4_17 += 1;
    }
    }
    }
    return false;
}
public static void h1788_0(moom.Oo p0) throws Throwable {
    throw __call1178800_0(p0);
}
public static void h1788_1(moom.Oo p0) throws Throwable {
    throw __call1178801_0(p0);
}
public static void h1788_2(moom.Oo p0) throws Throwable {
    throw __call1178802_0(p0);
}
private static native long __fieldRead1788_0() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1788_1(moom.hg a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead1788_2(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.entity.player.InventoryPlayer __fieldRead1788_3(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call1788_4(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native moom.wB __fieldRead1788_5(moom.hg a0) throws Throwable;
private static native int __invokedynamic1788_6(int a0, long a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1788_7(moom.hg a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead1788_8(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.pz[] __fieldRead1788_9(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native int __call1788_10(moom.pz a0) throws Throwable;
private static native moom.wB __fieldRead1788_11(moom.hg a0) throws Throwable;
private static native moom.wB __fieldRead1788_12(moom.hg a0) throws Throwable;
private static native int __fieldRead1788_13(moom.wB a0) throws Throwable;
private static native void __call1788_14(moom.hg a0, moom.wB a1, int a2, int a3, int a4) throws Throwable;
private static native java.lang.Exception __call1178800_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1178801_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1178802_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_fe9ae0cbb7b4e6c24bfa(moom.hg a0) throws E;
private static final class __SourceHandler_fe9ae0cbb7b4e6c24bfa {

public static void f1057(moom.hg receiver) throws Throwable {
    forward_join_16: {
    forward_join_12: {
    __call1057_0(receiver);
    if (!(__call1057_3(__fieldRead1057_2(__fieldRead1057_1(receiver))))) { break forward_join_12; }
    if (!(__fieldRead1057_6(__fieldRead1057_5(__fieldRead1057_4(receiver))))) { break forward_join_16; }
    }
    __call1057_9(__fieldRead1057_8(__fieldRead1057_7(receiver)));
    }
    return;
}
public static void h1057_0(moom.Oo p0) throws Throwable {
    throw __call1105700_0(p0);
}
public static void h1057_1(moom.Oo p0) throws Throwable {
    throw __call1105701_0(p0);
}
private static native void __call1057_0(moom.hg a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1057_1(moom.hg a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead1057_2(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __call1057_3(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1057_4(moom.hg a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead1057_5(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __fieldRead1057_6(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1057_7(moom.hg a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead1057_8(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call1057_9(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native java.lang.Exception __call1105700_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1105701_0(moom.Oo a0) throws Throwable;

}


protected void b(int p0, int p1, int p2) { __sourceHandlerCall_3fce01955c7a2a8d2cf8(this, p0, p1, p2); }


public static net.minecraft.entity.Entity[] b() {
return moom.hg.Y;
}


protected void b(int p0, int p1) {
return;
}


protected boolean e(int p0) { return __sourceHandlerCall_05e841b6bce708470280(this, p0); }


public void c__Void() {
long local1 = (moom.hg.eb ^ 88591756768319L);
    super.c__Void();
    ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(this.i)).K)).bG = ((moom.v8)(this.z));
    this.A = ((int)(((this.k - this.x) / 2)));
    this.B = ((int)(((this.l - this.y) / 2)));
    ((java.util.List)(this.m)).add(((java.lang.Object)(new moom.gc(2, 2, 2, __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1489_13(15432, (964406914333512376L ^ local1)), __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1489_14(8185, (9161291163680354580L ^ local1)), "Disable Inventory Manager", true))));
    ((java.util.List)(this.m)).add(((java.lang.Object)(new moom.gc(3, 2, __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1489_17(3792, (6221216550804430883L ^ local1)), __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1489_18(15981, (2898980954689966236L ^ local1)), __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1489_19(13399, (6939606163802069689L ^ local1)), "Disable Chest Stealer", true))));
    ((java.util.List)(this.m)).add(((java.lang.Object)(new moom.gc(4, 2, __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1489_22(4688, (8327727043293363380L ^ local1)), __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1489_23(15981, (2898980954689966236L ^ local1)), __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1489_24(13399, (6939606163802069689L ^ local1)), "Disable Kill Aura", true))));
    return;
}


public void h() {
try {
        if ((((net.minecraft.client.Minecraft)(this.i)).K != null)) {
        ((moom.v8)(this.z)).a(((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.client.Minecraft)(this.i)).K)));
    }
    } catch (moom.Oo caught_rethrow_0) {
        throw moom.hg.a(((java.lang.Exception)(caught_rethrow_0)));
    }
    return;
}


private static long f(int p0, long p1) {
int life3_8;
    byte[] life4_77;
    long life5_81;
    byte[] life7_146;
    java.lang.Long life8_150;
    java.lang.Object[] life9_155;
    javax.crypto.spec.DESKeySpec life11_188;
    javax.crypto.SecretKey life12_195;
    javax.crypto.Cipher life13_200;
    byte[] life10_212;
    long life11_290;
    life3_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 32339);
    if (((moom.hg.wb)[life3_8] == null)) {
        life4_77 = new byte[] {((byte) ((int) (p1 >>> 56))), ((byte) ((int) (p1 >>> 48))), ((byte) ((int) (p1 >>> 40))), ((byte) ((int) (p1 >>> 32))), ((byte) ((int) (p1 >>> 24))), ((byte) ((int) (p1 >>> 16))), ((byte) ((int) (p1 >>> 8))), ((byte) ((int) p1))};
        life5_81 = (moom.hg.vb)[life3_8];
        life7_146 = new byte[] {((byte) ((int) (life5_81 >>> 56))), ((byte) ((int) (life5_81 >>> 48))), ((byte) ((int) (life5_81 >>> 40))), ((byte) ((int) (life5_81 >>> 32))), ((byte) ((int) (life5_81 >>> 24))), ((byte) ((int) (life5_81 >>> 16))), ((byte) ((int) (life5_81 >>> 8))), ((byte) ((int) life5_81))};
        life8_150 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life9_155 = ((java.lang.Object[])(((java.util.Map)(moom.hg.xb)).get(((java.lang.Object)(life8_150)))));
        try {
        if ((life9_155 == null)) {
        life9_155 = new java.lang.Object[3];
        (life9_155)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding")));
        (life9_155)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life9_155)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.hg.xb)).put(((java.lang.Object)(life8_150)), ((java.lang.Object)(life9_155)));
    }
        life11_188 = new javax.crypto.spec.DESKeySpec(life4_77);
        life12_195 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life9_155)[1])))).generateSecret(((java.security.spec.KeySpec)(life11_188)));
        life13_200 = ((javax.crypto.Cipher)((life9_155)[0]));
        ((javax.crypto.Cipher)(life13_200)).init(((int)(2)), ((java.security.Key)(life12_195)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life9_155)[2])))));
        life10_212 = ((javax.crypto.Cipher)(life13_200)).doFinal(((byte[])(life7_146)));
    } catch (java.lang.Exception life11_214) {
        throw new java.lang.RuntimeException("moom/hg", life11_214);
    }
        life11_290 = (((((((((((long) (life10_212)[0]) & 255L) << 56) | ((((long) (life10_212)[1]) & 255L) << 48)) | ((((long) (life10_212)[2]) & 255L) << 40)) | ((((long) (life10_212)[3]) & 255L) << 32)) | ((((long) (life10_212)[4]) & 255L) << 24)) | ((((long) (life10_212)[5]) & 255L) << 16)) | ((((long) (life10_212)[6]) & 255L) << 8)) | (((long) (life10_212)[7]) & 255L));
        (moom.hg.wb)[life3_8] = java.lang.Long.valueOf(((long)(life11_290)));
    }
    return ((java.lang.Long)((moom.hg.wb)[life3_8])).longValue();
}


private static java.lang.invoke.CallSite f(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_ec881c4a524b_methodHandleLiteral7907_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/hg"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static long f(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    long local7 = moom.hg.f(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local9 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Long.TYPE)), ((java.lang.Object)(java.lang.Long.valueOf(((long)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local9)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 32128;
      if (nb[var3] == null) {
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
         long var5 = mb[var3];
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
         Object[] var9 = (Object[])ob.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               ob.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/hg", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         nb[var3] = var15;
      }

      return nb[var3];
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


protected abstract void a(float p0, int p1, int p2);

public static void a(net.minecraft.entity.Entity[] p0) {
Y = ((net.minecraft.entity.Entity[])(p0));
    return;
}


private void a(moom.wB p0) { __sourceHandlerCall_cd9e86d60cc08d35960a(this, p0); }


protected void a(char p0, int p1) throws java.io.IOException { __sourceHandlerCall_0b2bae1f71d76db1176e(this, p0, p1); }


public void a(int p0, int p1, float p2) { __sourceHandlerCall_64ccf1a16a71a6a1bced(this, p0, p1, p2); }


private void a(net.minecraft.item.ItemStack p0, int p1, int p2, java.lang.String p3) { __sourceHandlerCall_d772a4a4cd72269e24df(this, p0, p1, p2, p3); }


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral7912_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/hg"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.hg.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


protected void a(int p0, int p1, int p2) throws java.io.IOException { __sourceHandlerCall_2ed05b48037029d2e76c(this, p0, p1, p2); }


protected void a(moom.wB p0, int p1, int p2, int p3) {
if ((p0 != null)) {
        p1 = ((moom.wB)(p0)).c;
    }
    ((moom.jI)(((net.minecraft.client.Minecraft)(this.i)).F)).a(((int)(((moom.v8)(this.z)).c)), ((int)(p1)), ((int)(p2)), ((int)(p3)), ((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.client.Minecraft)(this.i)).K)));
    return;
}


protected boolean a__sourceReturn_ec95eb92ba(int p0, int p1, int p2, int p3, int p4, int p5) { return __sourceHandlerCall_98fe3848dd16c8d24b6f(this, p0, p1, p2, p3, p4, p5); }


private boolean a(moom.wB p0, int p1, int p2) {
long local4 = (moom.hg.eb ^ 93056227968787L);
    return ((moom.hg)(this)).a__sourceReturn_ec95eb92ba(((int)(((moom.wB)(p0)).d)), ((int)(((moom.wB)(p0)).e)), ((int)(__sourceIntrinsic_928ce502f495_originalDynamicSite1490_3(11371, (2895609006109700541L ^ local4)))), ((int)(__sourceIntrinsic_928ce502f495_originalDynamicSite1490_4(19167, (2447318440149800725L ^ local4)))), ((int)(p1)), ((int)(p2)));
}


protected void a(int p0, int p1, int p2, long p3) { __sourceHandlerCall_55209c73d1245f8d6710(this, p0, p1, p2, p3); }


protected void a__Void(moom.gc p0) throws java.io.IOException { __sourceHandlerCall_d99f6cdde97d437a4f75(this, p0); }


public boolean a__Boolean() {
return ((0) != 0);
}


private void a() { __sourceHandlerCall_b29037ff9a23c6d0fa3b(this); }


private moom.wB a__sourceReturn_f13f07ac17(int p0, int p1) { return __sourceHandlerCall_bb598b86ee9e3165b313(this, p0, p1); }


public void g() { __sourceHandlerCall_fe9ae0cbb7b4e6c24bfa(this); }


private static native <E extends Throwable> int __sourceIntrinsic_8926718faf90e0d3_originalDynamicSite2833_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8926718faf90e0d3_originalDynamicSite2833_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral7912_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_928ce502f495_originalDynamicSite1490_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_928ce502f495_originalDynamicSite1490_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1489_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1489_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1489_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1489_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1489_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1489_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1489_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1489_24(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_ec881c4a524b_methodHandleLiteral7907_0() throws E;
}
