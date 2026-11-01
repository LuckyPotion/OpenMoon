package net.minecraft.client.gui;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class GuiMerchant extends moom.hg {

private static org.apache.logging.log4j.Logger Z;

private static moom.DD aa;

private net.minecraft.entity.IMerchant ab;

private moom.gh ac;

private moom.gh ad;

private int ae;

private net.minecraft.util.IChatComponent af;

private static long cb;

private static long[] fb;

private static java.lang.Integer[] pb;

private static java.util.Map qb;

public GuiMerchant(net.minecraft.entity.player.InventoryPlayer p0, net.minecraft.entity.IMerchant p1, net.minecraft.world.World p2) {
super(new moom.wi(p0, p1, p2));
    this.ab = p1;
    this.af = (p1).a__C5();
}


static {
cb = ((long)(((moom._a)(moom._c.a(((long)(1301545484121462427L)), ((long)(5028503440681309308L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(131745083650782L)))));
    qb = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (net.minecraft.client.gui.GuiMerchant.cb ^ 103532879801464L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1776_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1776_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1776_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1776_14 = new byte[8];
    (__sourceSpill1776_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1776_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1776_16 = __sourceSpill1776_14;
    ((javax.crypto.Cipher)(__sourceSpill1776_11)).init(((int)(__sourceSpill1776_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1776_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1776_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[25];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "^ôÆ¹à\036¬VJ¡îiÏÙ`¥\bxè WB\002\033&%\035'\\g[ö~ç*tê!ÀÿAñ|Ï¯¶¯\021ÅMP§\0208ðo!Æà\007Å\033ÛÇ9\030Òèø\nüÝ\b¼À0?)úN\005~¦Gmxëà¶ày((\005GµPW°\032Ùá\035HC!Í<ùËø\034\n¶Ò¼ý\"ÅL[\003 ÊZhÕÛá )÷rí4·Ù çl=Aj\024V+Îßxà\013üØ}\020Bò\rp5Zç\005°"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1776_25 = local6_life21;
        int __sourceSpill1776_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1776_25)).substring(((int)(__sourceSpill1776_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1776_30 = local8_life19;
        int __sourceSpill1776_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1776_33 = new byte[8];
        (__sourceSpill1776_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1776_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1776_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1776_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1776_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1776_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1776_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1776_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1776_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1776_34)).doFinal(((byte[])(__sourceSpill1776_33)));
        (__sourceSpill1776_30)[__sourceSpill1776_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "÷Û: ¥\0235~8¼/"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1776_38 = local6_life21;
        int __sourceSpill1776_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1776_38)).substring(((int)(__sourceSpill1776_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1776_43 = local8_life19;
        int __sourceSpill1776_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1776_46 = new byte[8];
        (__sourceSpill1776_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1776_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1776_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1776_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1776_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1776_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1776_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1776_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1776_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1776_47)).doFinal(((byte[])(__sourceSpill1776_46)));
        (__sourceSpill1776_43)[__sourceSpill1776_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    fb = ((long[])(local8_life19));
    pb = ((java.lang.Integer[])(new java.lang.Integer[25]));
    Z = ((org.apache.logging.log4j.Logger)(org.apache.logging.log4j.LogManager.getLogger()));
    aa = ((moom.DD)(new moom.DD("textures/gui/container/villager.png")));
}

private static native <E extends Throwable> void __sourceHandlerCall_2013fa3db12c3b7107b6(net.minecraft.client.gui.GuiMerchant a0, float a1, int a2, int a3) throws E;
private static final class __SourceHandler_2013fa3db12c3b7107b6 {

public static void f1313(net.minecraft.client.gui.GuiMerchant receiver, float p0, int p1, int p2) throws Throwable {
    long life4_3;
    int life6_21;
    int life7_29;
    moom.OF life8_46;
    int life9_57;
    net.minecraft.village.MerchantRecipe life10_74;
    forward_join_149: {
    forward_join_62: {
    forward_join_61: {
    life4_3 = (__fieldRead1313_0() ^ 140201925238349L);
    __call1313_1(0x1.0p0f, 0x1.0p0f, 0x1.0p0f, 0x1.0p0f);
    __call1313_5(__call1313_3(__fieldRead1313_2(receiver)), __fieldRead1313_4());
    life6_21 = ((__fieldRead1313_6(receiver) - __fieldRead1313_7(receiver)) / 2);
    life7_29 = ((__fieldRead1313_8(receiver) - __fieldRead1313_9(receiver)) / 2);
    __call1313_12(receiver, life6_21, life7_29, 0, 0, __fieldRead1313_10(receiver), __fieldRead1313_11(receiver));
    life8_46 = __call1313_16(__fieldRead1313_13(receiver), __fieldRead1313_15(__fieldRead1313_14(receiver)));
    if (!((life8_46 != null))) { break forward_join_149; }
    if (!((!__call1313_17(life8_46)))) { break forward_join_149; }
    life9_57 = __fieldRead1313_18(receiver);
    if (!((life9_57 >= 0))) { break forward_join_61; }
    if (!((life9_57 >= __call1313_19(life8_46)))) { break forward_join_62; }
    }
    return;
    }
    life10_74 = __cast1313_21(__call1313_20(life8_46, life9_57));
    if (!(__call1313_22(life10_74))) { break forward_join_149; }
    __call1313_26(__call1313_24(__fieldRead1313_23(receiver)), __fieldRead1313_25());
    __call1313_27(0x1.0p0f, 0x1.0p0f, 0x1.0p0f, 0x1.0p0f);
    __call1313_28();
    __call1313_36(receiver, (__fieldRead1313_29(receiver) + __invokedynamic1313_30(22476, (7405040243297479936L ^ life4_3))), (__fieldRead1313_31(receiver) + __invokedynamic1313_32(13581, (3867814775680176075L ^ life4_3))), __invokedynamic1313_33(32073, (1283473803164567427L ^ life4_3)), 0, __invokedynamic1313_34(14539, (2561061624135909897L ^ life4_3)), __invokedynamic1313_35(13581, (3867814775680176075L ^ life4_3)));
    __call1313_44(receiver, (__fieldRead1313_37(receiver) + __invokedynamic1313_38(22476, (7405040243297479936L ^ life4_3))), (__fieldRead1313_39(receiver) + __invokedynamic1313_40(7006, (7477890675468771729L ^ life4_3))), __invokedynamic1313_41(21666, (2069469824820899450L ^ life4_3)), 0, __invokedynamic1313_42(14539, (2561061624135909897L ^ life4_3)), __invokedynamic1313_43(13581, (3867814775680176075L ^ life4_3)));
    }
    return;
}
public static void h1313_0(moom.Oo p0) throws Throwable {
    throw __call1131300_0(p0);
}
public static void h1313_1(moom.Oo p0) throws Throwable {
    throw __call1131301_0(p0);
}
public static void h1313_2(moom.Oo p0) throws Throwable {
    throw __call1131302_0(p0);
}
public static void h1313_3(moom.Oo p0) throws Throwable {
    throw __call1131303_0(p0);
}
private static native long __fieldRead1313_0() throws Throwable;
private static native void __call1313_1(float a0, float a1, float a2, float a3) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1313_2(net.minecraft.client.gui.GuiMerchant a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureManager __call1313_3(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.DD __fieldRead1313_4() throws Throwable;
private static native void __call1313_5(net.minecraft.client.renderer.texture.TextureManager a0, moom.DD a1) throws Throwable;
private static native int __fieldRead1313_6(net.minecraft.client.gui.GuiMerchant a0) throws Throwable;
private static native int __fieldRead1313_7(net.minecraft.client.gui.GuiMerchant a0) throws Throwable;
private static native int __fieldRead1313_8(net.minecraft.client.gui.GuiMerchant a0) throws Throwable;
private static native int __fieldRead1313_9(net.minecraft.client.gui.GuiMerchant a0) throws Throwable;
private static native int __fieldRead1313_10(net.minecraft.client.gui.GuiMerchant a0) throws Throwable;
private static native int __fieldRead1313_11(net.minecraft.client.gui.GuiMerchant a0) throws Throwable;
private static native void __call1313_12(net.minecraft.client.gui.GuiMerchant a0, int a1, int a2, int a3, int a4, int a5, int a6) throws Throwable;
private static native net.minecraft.entity.IMerchant __fieldRead1313_13(net.minecraft.client.gui.GuiMerchant a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1313_14(net.minecraft.client.gui.GuiMerchant a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead1313_15(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.OF __call1313_16(net.minecraft.entity.IMerchant a0, net.minecraft.client.entity.EntityPlayerSP a1) throws Throwable;
private static native boolean __call1313_17(moom.OF a0) throws Throwable;
private static native int __fieldRead1313_18(net.minecraft.client.gui.GuiMerchant a0) throws Throwable;
private static native int __call1313_19(moom.OF a0) throws Throwable;
private static native java.lang.Object __call1313_20(moom.OF a0, int a1) throws Throwable;
private static native net.minecraft.village.MerchantRecipe __cast1313_21(java.lang.Object a0) throws Throwable;
private static native boolean __call1313_22(net.minecraft.village.MerchantRecipe a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1313_23(net.minecraft.client.gui.GuiMerchant a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureManager __call1313_24(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.DD __fieldRead1313_25() throws Throwable;
private static native void __call1313_26(net.minecraft.client.renderer.texture.TextureManager a0, moom.DD a1) throws Throwable;
private static native void __call1313_27(float a0, float a1, float a2, float a3) throws Throwable;
private static native void __call1313_28() throws Throwable;
private static native int __fieldRead1313_29(net.minecraft.client.gui.GuiMerchant a0) throws Throwable;
private static native int __invokedynamic1313_30(int a0, long a1) throws Throwable;
private static native int __fieldRead1313_31(net.minecraft.client.gui.GuiMerchant a0) throws Throwable;
private static native int __invokedynamic1313_32(int a0, long a1) throws Throwable;
private static native int __invokedynamic1313_33(int a0, long a1) throws Throwable;
private static native int __invokedynamic1313_34(int a0, long a1) throws Throwable;
private static native int __invokedynamic1313_35(int a0, long a1) throws Throwable;
private static native void __call1313_36(net.minecraft.client.gui.GuiMerchant a0, int a1, int a2, int a3, int a4, int a5, int a6) throws Throwable;
private static native int __fieldRead1313_37(net.minecraft.client.gui.GuiMerchant a0) throws Throwable;
private static native int __invokedynamic1313_38(int a0, long a1) throws Throwable;
private static native int __fieldRead1313_39(net.minecraft.client.gui.GuiMerchant a0) throws Throwable;
private static native int __invokedynamic1313_40(int a0, long a1) throws Throwable;
private static native int __invokedynamic1313_41(int a0, long a1) throws Throwable;
private static native int __invokedynamic1313_42(int a0, long a1) throws Throwable;
private static native int __invokedynamic1313_43(int a0, long a1) throws Throwable;
private static native void __call1313_44(net.minecraft.client.gui.GuiMerchant a0, int a1, int a2, int a3, int a4, int a5, int a6) throws Throwable;
private static native java.lang.Exception __call1131300_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1131301_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1131302_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1131303_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_4fea09f6101bdf3809cb(net.minecraft.client.gui.GuiMerchant a0, int a1, int a2, float a3) throws E;
private static final class __SourceHandler_4fea09f6101bdf3809cb {

public static void f1314(net.minecraft.client.gui.GuiMerchant receiver, int p0, int p1, float p2) throws Throwable {
    long life4_3;
    moom.OF life6_15;
    int life7_31;
    int life8_39;
    int life9_42;
    net.minecraft.village.MerchantRecipe life10_47;
    net.minecraft.item.ItemStack life11_50;
    net.minecraft.item.ItemStack life12_53;
    net.minecraft.item.ItemStack life13_56;
    forward_join_353: {
    forward_join_349: {
    forward_join_341: {
    forward_join_288: {
    forward_join_253: {
    forward_join_218: {
    forward_join_142: {
    life4_3 = (__fieldRead1314_0() ^ 36310371907015L);
    __call1314_1(receiver, p0, p1, p2);
    life6_15 = __call1314_5(__fieldRead1314_2(receiver), __fieldRead1314_4(__fieldRead1314_3(receiver)));
    if (!((life6_15 != null))) { break forward_join_353; }
    if (!((!__call1314_6(life6_15)))) { break forward_join_353; }
    life7_31 = ((__fieldRead1314_7(receiver) - __fieldRead1314_8(receiver)) / 2);
    life8_39 = ((__fieldRead1314_9(receiver) - __fieldRead1314_10(receiver)) / 2);
    life9_42 = __fieldRead1314_11(receiver);
    life10_47 = __cast1314_13(__call1314_12(life6_15, life9_42));
    life11_50 = __call1314_14(life10_47);
    life12_53 = __call1314_15(life10_47);
    life13_56 = __call1314_16(life10_47);
    __call1314_17();
    __call1314_18();
    __call1314_19();
    __call1314_20();
    __call1314_21();
    __call1314_22();
    __fieldWrite1314_24(__fieldRead1314_23(receiver), 0x1.9p6f);
    __call1314_28(__fieldRead1314_25(receiver), life11_50, (life7_31 + __invokedynamic1314_26(19752, (3785659445240011899L ^ life4_3))), (life8_39 + __invokedynamic1314_27(5854, (3949689812985497480L ^ life4_3))));
    __call1314_33(__fieldRead1314_29(receiver), __fieldRead1314_30(receiver), life11_50, (life7_31 + __invokedynamic1314_31(4708, (9200377148680586022L ^ life4_3))), (life8_39 + __invokedynamic1314_32(23587, (1757575019053583725L ^ life4_3))));
    if (!((life12_53 != null))) { break forward_join_142; }
    __call1314_37(__fieldRead1314_34(receiver), life12_53, (life7_31 + __invokedynamic1314_35(4949, (4090535126090629633L ^ life4_3))), (life8_39 + __invokedynamic1314_36(23587, (1757575019053583725L ^ life4_3))));
    __call1314_42(__fieldRead1314_38(receiver), __fieldRead1314_39(receiver), life12_53, (life7_31 + __invokedynamic1314_40(24614, (4453979679925743987L ^ life4_3))), (life8_39 + __invokedynamic1314_41(23587, (1757575019053583725L ^ life4_3))));
    }
    __call1314_46(__fieldRead1314_43(receiver), life13_56, (life7_31 + __invokedynamic1314_44(12451, (4775842926060724712L ^ life4_3))), (life8_39 + __invokedynamic1314_45(23587, (1757575019053583725L ^ life4_3))));
    __call1314_51(__fieldRead1314_47(receiver), __fieldRead1314_48(receiver), life13_56, (life7_31 + __invokedynamic1314_49(12356, (1236041653208178964L ^ life4_3))), (life8_39 + __invokedynamic1314_50(23587, (1757575019053583725L ^ life4_3))));
    __fieldWrite1314_53(__fieldRead1314_52(receiver), 0x0.0p0f);
    __call1314_54();
    if (!(__call1314_59(receiver, __invokedynamic1314_55(4708, (9200377148680586022L ^ life4_3)), __invokedynamic1314_56(23587, (1757575019053583725L ^ life4_3)), __invokedynamic1314_57(7019, (5856448891821869612L ^ life4_3)), __invokedynamic1314_58(19400, (1426809562760125068L ^ life4_3)), p0, p1))) { break forward_join_218; }
    if (!((life11_50 != null))) { break forward_join_218; }
    __call1314_60(receiver, life11_50, p0, p1);
    break forward_join_349;
    }
    if (!((life12_53 != null))) { break forward_join_253; }
    if (!(__call1314_65(receiver, __invokedynamic1314_61(24614, (4453979679925743987L ^ life4_3)), __invokedynamic1314_62(23587, (1757575019053583725L ^ life4_3)), __invokedynamic1314_63(19400, (1426809562760125068L ^ life4_3)), __invokedynamic1314_64(19400, (1426809562760125068L ^ life4_3)), p0, p1))) { break forward_join_253; }
    if (!((life12_53 != null))) { break forward_join_253; }
    __call1314_66(receiver, life12_53, p0, p1);
    break forward_join_349;
    }
    if (!((life13_56 != null))) { break forward_join_288; }
    if (!(__call1314_71(receiver, __invokedynamic1314_67(12356, (1236041653208178964L ^ life4_3)), __invokedynamic1314_68(23587, (1757575019053583725L ^ life4_3)), __invokedynamic1314_69(19400, (1426809562760125068L ^ life4_3)), __invokedynamic1314_70(19400, (1426809562760125068L ^ life4_3)), p0, p1))) { break forward_join_288; }
    if (!((life13_56 != null))) { break forward_join_288; }
    __call1314_72(receiver, life13_56, p0, p1);
    break forward_join_349;
    }
    if (!(__call1314_73(life10_47))) { break forward_join_349; }
    if (!((!__call1314_78(receiver, __invokedynamic1314_74(22774, (171571924260260279L ^ life4_3)), __invokedynamic1314_75(13173, (5883327414311739964L ^ life4_3)), __invokedynamic1314_76(2600, (7810153061249112959L ^ life4_3)), __invokedynamic1314_77(13581, (3867857119307785281L ^ life4_3)), p0, p1)))) { break forward_join_341; }
    if (!(__call1314_83(receiver, __invokedynamic1314_79(22476, (7404940725228734090L ^ life4_3)), __invokedynamic1314_80(32090, (5943534653744720921L ^ life4_3)), __invokedynamic1314_81(14539, (2561116069878262147L ^ life4_3)), __invokedynamic1314_82(13581, (3867857119307785281L ^ life4_3)), p0, p1))) { break forward_join_349; }
    }
    __call1314_85(receiver, __call1314_84("merchant.deprecated", new java.lang.Object[0]), p0, p1);
    }
    __call1314_86();
    __call1314_87();
    __call1314_88();
    __call1314_89();
    }
    return;
}
public static void h1314_0(moom.Oo p0) throws Throwable {
    throw __call1131400_0(p0);
}
public static void h1314_1(moom.Oo p0) throws Throwable {
    throw __call1131401_0(p0);
}
public static void h1314_2(moom.Oo p0) throws Throwable {
    throw __call1131402_0(p0);
}
public static void h1314_3(moom.Oo p0) throws Throwable {
    throw __call1131403_0(p0);
}
public static void h1314_4(moom.Oo p0) throws Throwable {
    throw __call1131404_0(p0);
}
public static void h1314_5(moom.Oo p0) throws Throwable {
    throw __call1131405_0(p0);
}
public static void h1314_6(moom.Oo p0) throws Throwable {
    throw __call1131406_0(p0);
}
public static void h1314_7(moom.Oo p0) throws Throwable {
    throw __call1131407_0(p0);
}
public static void h1314_8(moom.Oo p0) throws Throwable {
    throw __call1131408_0(p0);
}
public static void h1314_9(moom.Oo p0) throws Throwable {
    throw __call1131409_0(p0);
}
public static void h1314_10(moom.Oo p0) throws Throwable {
    throw __call1131410_0(p0);
}
public static void h1314_11(moom.Oo p0) throws Throwable {
    throw __call1131411_0(p0);
}
public static void h1314_12(moom.Oo p0) throws Throwable {
    throw __call1131412_0(p0);
}
private static native long __fieldRead1314_0() throws Throwable;
private static native void __call1314_1(net.minecraft.client.gui.GuiMerchant a0, int a1, int a2, float a3) throws Throwable;
private static native net.minecraft.entity.IMerchant __fieldRead1314_2(net.minecraft.client.gui.GuiMerchant a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1314_3(net.minecraft.client.gui.GuiMerchant a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead1314_4(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.OF __call1314_5(net.minecraft.entity.IMerchant a0, net.minecraft.client.entity.EntityPlayerSP a1) throws Throwable;
private static native boolean __call1314_6(moom.OF a0) throws Throwable;
private static native int __fieldRead1314_7(net.minecraft.client.gui.GuiMerchant a0) throws Throwable;
private static native int __fieldRead1314_8(net.minecraft.client.gui.GuiMerchant a0) throws Throwable;
private static native int __fieldRead1314_9(net.minecraft.client.gui.GuiMerchant a0) throws Throwable;
private static native int __fieldRead1314_10(net.minecraft.client.gui.GuiMerchant a0) throws Throwable;
private static native int __fieldRead1314_11(net.minecraft.client.gui.GuiMerchant a0) throws Throwable;
private static native java.lang.Object __call1314_12(moom.OF a0, int a1) throws Throwable;
private static native net.minecraft.village.MerchantRecipe __cast1314_13(java.lang.Object a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call1314_14(net.minecraft.village.MerchantRecipe a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call1314_15(net.minecraft.village.MerchantRecipe a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call1314_16(net.minecraft.village.MerchantRecipe a0) throws Throwable;
private static native void __call1314_17() throws Throwable;
private static native void __call1314_18() throws Throwable;
private static native void __call1314_19() throws Throwable;
private static native void __call1314_20() throws Throwable;
private static native void __call1314_21() throws Throwable;
private static native void __call1314_22() throws Throwable;
private static native net.minecraft.client.renderer.entity.RenderItem __fieldRead1314_23(net.minecraft.client.gui.GuiMerchant a0) throws Throwable;
private static native void __fieldWrite1314_24(net.minecraft.client.renderer.entity.RenderItem a0, float a1) throws Throwable;
private static native net.minecraft.client.renderer.entity.RenderItem __fieldRead1314_25(net.minecraft.client.gui.GuiMerchant a0) throws Throwable;
private static native int __invokedynamic1314_26(int a0, long a1) throws Throwable;
private static native int __invokedynamic1314_27(int a0, long a1) throws Throwable;
private static native void __call1314_28(net.minecraft.client.renderer.entity.RenderItem a0, net.minecraft.item.ItemStack a1, int a2, int a3) throws Throwable;
private static native net.minecraft.client.renderer.entity.RenderItem __fieldRead1314_29(net.minecraft.client.gui.GuiMerchant a0) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead1314_30(net.minecraft.client.gui.GuiMerchant a0) throws Throwable;
private static native int __invokedynamic1314_31(int a0, long a1) throws Throwable;
private static native int __invokedynamic1314_32(int a0, long a1) throws Throwable;
private static native void __call1314_33(net.minecraft.client.renderer.entity.RenderItem a0, net.minecraft.client.gui.FontRenderer a1, net.minecraft.item.ItemStack a2, int a3, int a4) throws Throwable;
private static native net.minecraft.client.renderer.entity.RenderItem __fieldRead1314_34(net.minecraft.client.gui.GuiMerchant a0) throws Throwable;
private static native int __invokedynamic1314_35(int a0, long a1) throws Throwable;
private static native int __invokedynamic1314_36(int a0, long a1) throws Throwable;
private static native void __call1314_37(net.minecraft.client.renderer.entity.RenderItem a0, net.minecraft.item.ItemStack a1, int a2, int a3) throws Throwable;
private static native net.minecraft.client.renderer.entity.RenderItem __fieldRead1314_38(net.minecraft.client.gui.GuiMerchant a0) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead1314_39(net.minecraft.client.gui.GuiMerchant a0) throws Throwable;
private static native int __invokedynamic1314_40(int a0, long a1) throws Throwable;
private static native int __invokedynamic1314_41(int a0, long a1) throws Throwable;
private static native void __call1314_42(net.minecraft.client.renderer.entity.RenderItem a0, net.minecraft.client.gui.FontRenderer a1, net.minecraft.item.ItemStack a2, int a3, int a4) throws Throwable;
private static native net.minecraft.client.renderer.entity.RenderItem __fieldRead1314_43(net.minecraft.client.gui.GuiMerchant a0) throws Throwable;
private static native int __invokedynamic1314_44(int a0, long a1) throws Throwable;
private static native int __invokedynamic1314_45(int a0, long a1) throws Throwable;
private static native void __call1314_46(net.minecraft.client.renderer.entity.RenderItem a0, net.minecraft.item.ItemStack a1, int a2, int a3) throws Throwable;
private static native net.minecraft.client.renderer.entity.RenderItem __fieldRead1314_47(net.minecraft.client.gui.GuiMerchant a0) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead1314_48(net.minecraft.client.gui.GuiMerchant a0) throws Throwable;
private static native int __invokedynamic1314_49(int a0, long a1) throws Throwable;
private static native int __invokedynamic1314_50(int a0, long a1) throws Throwable;
private static native void __call1314_51(net.minecraft.client.renderer.entity.RenderItem a0, net.minecraft.client.gui.FontRenderer a1, net.minecraft.item.ItemStack a2, int a3, int a4) throws Throwable;
private static native net.minecraft.client.renderer.entity.RenderItem __fieldRead1314_52(net.minecraft.client.gui.GuiMerchant a0) throws Throwable;
private static native void __fieldWrite1314_53(net.minecraft.client.renderer.entity.RenderItem a0, float a1) throws Throwable;
private static native void __call1314_54() throws Throwable;
private static native int __invokedynamic1314_55(int a0, long a1) throws Throwable;
private static native int __invokedynamic1314_56(int a0, long a1) throws Throwable;
private static native int __invokedynamic1314_57(int a0, long a1) throws Throwable;
private static native int __invokedynamic1314_58(int a0, long a1) throws Throwable;
private static native boolean __call1314_59(net.minecraft.client.gui.GuiMerchant a0, int a1, int a2, int a3, int a4, int a5, int a6) throws Throwable;
private static native void __call1314_60(net.minecraft.client.gui.GuiMerchant a0, net.minecraft.item.ItemStack a1, int a2, int a3) throws Throwable;
private static native int __invokedynamic1314_61(int a0, long a1) throws Throwable;
private static native int __invokedynamic1314_62(int a0, long a1) throws Throwable;
private static native int __invokedynamic1314_63(int a0, long a1) throws Throwable;
private static native int __invokedynamic1314_64(int a0, long a1) throws Throwable;
private static native boolean __call1314_65(net.minecraft.client.gui.GuiMerchant a0, int a1, int a2, int a3, int a4, int a5, int a6) throws Throwable;
private static native void __call1314_66(net.minecraft.client.gui.GuiMerchant a0, net.minecraft.item.ItemStack a1, int a2, int a3) throws Throwable;
private static native int __invokedynamic1314_67(int a0, long a1) throws Throwable;
private static native int __invokedynamic1314_68(int a0, long a1) throws Throwable;
private static native int __invokedynamic1314_69(int a0, long a1) throws Throwable;
private static native int __invokedynamic1314_70(int a0, long a1) throws Throwable;
private static native boolean __call1314_71(net.minecraft.client.gui.GuiMerchant a0, int a1, int a2, int a3, int a4, int a5, int a6) throws Throwable;
private static native void __call1314_72(net.minecraft.client.gui.GuiMerchant a0, net.minecraft.item.ItemStack a1, int a2, int a3) throws Throwable;
private static native boolean __call1314_73(net.minecraft.village.MerchantRecipe a0) throws Throwable;
private static native int __invokedynamic1314_74(int a0, long a1) throws Throwable;
private static native int __invokedynamic1314_75(int a0, long a1) throws Throwable;
private static native int __invokedynamic1314_76(int a0, long a1) throws Throwable;
private static native int __invokedynamic1314_77(int a0, long a1) throws Throwable;
private static native boolean __call1314_78(net.minecraft.client.gui.GuiMerchant a0, int a1, int a2, int a3, int a4, int a5, int a6) throws Throwable;
private static native int __invokedynamic1314_79(int a0, long a1) throws Throwable;
private static native int __invokedynamic1314_80(int a0, long a1) throws Throwable;
private static native int __invokedynamic1314_81(int a0, long a1) throws Throwable;
private static native int __invokedynamic1314_82(int a0, long a1) throws Throwable;
private static native boolean __call1314_83(net.minecraft.client.gui.GuiMerchant a0, int a1, int a2, int a3, int a4, int a5, int a6) throws Throwable;
private static native java.lang.String __call1314_84(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native void __call1314_85(net.minecraft.client.gui.GuiMerchant a0, java.lang.String a1, int a2, int a3) throws Throwable;
private static native void __call1314_86() throws Throwable;
private static native void __call1314_87() throws Throwable;
private static native void __call1314_88() throws Throwable;
private static native void __call1314_89() throws Throwable;
private static native java.lang.Exception __call1131400_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1131401_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1131402_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1131403_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1131404_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1131405_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1131406_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1131407_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1131408_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1131409_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1131410_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1131411_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1131412_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_fec6e21b698655713dfe(net.minecraft.client.gui.GuiMerchant a0, moom.gc a1) throws E;
private static final class __SourceHandler_fec6e21b698655713dfe {

public static void f205(net.minecraft.client.gui.GuiMerchant receiver, moom.gc p0) throws Throwable {
    int life2_1;
    moom.OF life3_18;
    net.minecraft.network.PacketBuffer life3_77;
    life2_1 = 0;
    if ((p0 == __fieldRead205_0(receiver))) {
        net.minecraft.client.gui.GuiMerchant __stackOp205_1_0 = receiver;
        __fieldWrite205_3(__stackOp205_1_0, (__fieldRead205_2(__stackOp205_1_0) + 1));
        life3_18 = __call205_7(__fieldRead205_4(receiver), __fieldRead205_6(__fieldRead205_5(receiver)));
        if ((life3_18 != null)) {
        if ((__fieldRead205_8(receiver) >= __call205_9(life3_18))) {
        __fieldWrite205_11(receiver, (__call205_10(life3_18) - 1));
    }
    }
        life2_1 = 1;
    } else {
        if ((p0 == __fieldRead205_12(receiver))) {
        net.minecraft.client.gui.GuiMerchant __stackOp205_13_0 = receiver;
        __fieldWrite205_15(__stackOp205_13_0, (__fieldRead205_14(__stackOp205_13_0) - 1));
        if ((__fieldRead205_16(receiver) < 0)) {
        __fieldWrite205_17(receiver, 0);
    }
        life2_1 = 1;
    }
    }
    if ((life2_1 != 0)) {
        __call205_21(__cast205_19(__fieldRead205_18(receiver)), __fieldRead205_20(receiver));
        life3_77 = new net.minecraft.network.PacketBuffer(__call205_22());
        __call205_24(life3_77, __fieldRead205_23(receiver));
        __call205_27(__call205_26(__fieldRead205_25(receiver)), new moom.zq("MC|TrSel", life3_77));
    }
    return;
}
public static void h205_0(java.io.IOException p0) throws Throwable {
    throw __call1020500_0(p0);
}
public static void h205_1(java.io.IOException p0) throws Throwable {
    throw __call1020501_0(p0);
}
public static void h205_2(java.io.IOException p0) throws Throwable {
    throw __call1020502_0(p0);
}
public static void h205_3(java.io.IOException p0) throws Throwable {
    throw __call1020503_0(p0);
}
private static native moom.gh __fieldRead205_0(net.minecraft.client.gui.GuiMerchant a0) throws Throwable;
private static native int __fieldRead205_2(net.minecraft.client.gui.GuiMerchant a0) throws Throwable;
private static native void __fieldWrite205_3(net.minecraft.client.gui.GuiMerchant a0, int a1) throws Throwable;
private static native net.minecraft.entity.IMerchant __fieldRead205_4(net.minecraft.client.gui.GuiMerchant a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead205_5(net.minecraft.client.gui.GuiMerchant a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead205_6(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.OF __call205_7(net.minecraft.entity.IMerchant a0, net.minecraft.client.entity.EntityPlayerSP a1) throws Throwable;
private static native int __fieldRead205_8(net.minecraft.client.gui.GuiMerchant a0) throws Throwable;
private static native int __call205_9(moom.OF a0) throws Throwable;
private static native int __call205_10(moom.OF a0) throws Throwable;
private static native void __fieldWrite205_11(net.minecraft.client.gui.GuiMerchant a0, int a1) throws Throwable;
private static native moom.gh __fieldRead205_12(net.minecraft.client.gui.GuiMerchant a0) throws Throwable;
private static native int __fieldRead205_14(net.minecraft.client.gui.GuiMerchant a0) throws Throwable;
private static native void __fieldWrite205_15(net.minecraft.client.gui.GuiMerchant a0, int a1) throws Throwable;
private static native int __fieldRead205_16(net.minecraft.client.gui.GuiMerchant a0) throws Throwable;
private static native void __fieldWrite205_17(net.minecraft.client.gui.GuiMerchant a0, int a1) throws Throwable;
private static native moom.v8 __fieldRead205_18(net.minecraft.client.gui.GuiMerchant a0) throws Throwable;
private static native moom.wi __cast205_19(moom.v8 a0) throws Throwable;
private static native int __fieldRead205_20(net.minecraft.client.gui.GuiMerchant a0) throws Throwable;
private static native void __call205_21(moom.wi a0, int a1) throws Throwable;
private static native io.netty.buffer.ByteBuf __call205_22() throws Throwable;
private static native int __fieldRead205_23(net.minecraft.client.gui.GuiMerchant a0) throws Throwable;
private static native io.netty.buffer.ByteBuf __call205_24(net.minecraft.network.PacketBuffer a0, int a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead205_25(net.minecraft.client.gui.GuiMerchant a0) throws Throwable;
private static native net.minecraft.client.network.NetHandlerPlayClient __call205_26(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call205_27(net.minecraft.client.network.NetHandlerPlayClient a0, moom.zq a1) throws Throwable;
private static native java.lang.Exception __call1020500_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1020501_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1020502_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1020503_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_840d75ef52a32fae5e06(net.minecraft.client.gui.GuiMerchant a0) throws E;
private static final class __SourceHandler_840d75ef52a32fae5e06 {

public static void f2260(net.minecraft.client.gui.GuiMerchant receiver) throws Throwable {
    moom.OF life1_8;
    __call2260_0(receiver);
    life1_8 = __call2260_4(__fieldRead2260_1(receiver), __fieldRead2260_3(__fieldRead2260_2(receiver)));
    if ((life1_8 != null)) {
        moom.gh spill2260_0 = __fieldRead2260_5(receiver);
        __fieldWrite2260_8(spill2260_0, ((__fieldRead2260_6(receiver) < (__call2260_7(life1_8) - 1)) ? 1 : 0));
        moom.gh spill2260_1 = __fieldRead2260_9(receiver);
        __fieldWrite2260_11(spill2260_1, ((__fieldRead2260_10(receiver) > 0) ? 1 : 0));
    }
    return;
}
public static void h2260_0(moom.Oo p0) throws Throwable {
    throw __call1226000_0(p0);
}
public static void h2260_1(moom.Oo p0) throws Throwable {
    throw __call1226001_0(p0);
}
public static void h2260_2(moom.Oo p0) throws Throwable {
    throw __call1226002_0(p0);
}
private static native void __call2260_0(net.minecraft.client.gui.GuiMerchant a0) throws Throwable;
private static native net.minecraft.entity.IMerchant __fieldRead2260_1(net.minecraft.client.gui.GuiMerchant a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2260_2(net.minecraft.client.gui.GuiMerchant a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead2260_3(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.OF __call2260_4(net.minecraft.entity.IMerchant a0, net.minecraft.client.entity.EntityPlayerSP a1) throws Throwable;
private static native moom.gh __fieldRead2260_5(net.minecraft.client.gui.GuiMerchant a0) throws Throwable;
private static native int __fieldRead2260_6(net.minecraft.client.gui.GuiMerchant a0) throws Throwable;
private static native int __call2260_7(moom.OF a0) throws Throwable;
private static native void __fieldWrite2260_8(moom.gh a0, int a1) throws Throwable;
private static native moom.gh __fieldRead2260_9(net.minecraft.client.gui.GuiMerchant a0) throws Throwable;
private static native int __fieldRead2260_10(net.minecraft.client.gui.GuiMerchant a0) throws Throwable;
private static native void __fieldWrite2260_11(moom.gh a0, int a1) throws Throwable;
private static native java.lang.Exception __call1226000_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1226001_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1226002_0(moom.Oo a0) throws Throwable;

}


protected void b(int p0, int p1) {
long local3 = (net.minecraft.client.gui.GuiMerchant.cb ^ 64504178012908L);
    java.lang.String local5 = ((net.minecraft.util.IChatComponent)(this.af)).b();
    ((net.minecraft.client.gui.FontRenderer)(this.p)).b(((java.lang.String)(local5)), ((float)(((float) ((this.x / 2) - (((net.minecraft.client.gui.FontRenderer)(this.p)).a(((java.lang.String)(local5))) / 2))))), ((float)(0x1.8p2f)), ((int)(__sourceIntrinsic_45fde0f4e55e_originalDynamicSite1783_7(29384, (5557580865323295913L ^ local3)))));
    ((net.minecraft.client.gui.FontRenderer)(this.p)).b(((java.lang.String)(moom.oO.a(((java.lang.String)("container.inventory")), ((java.lang.Object[])(new java.lang.Object[0]))))), ((float)(0x1.0p3f)), ((float)(((float) ((this.y - __sourceIntrinsic_45fde0f4e55e_originalDynamicSite1783_12(13932, (7369385854208778268L ^ local3))) + 2)))), ((int)(__sourceIntrinsic_45fde0f4e55e_originalDynamicSite1783_13(6710, (5667815250871782482L ^ local3)))));
    return;
}


private static java.lang.Exception c(java.lang.Exception p0) {
return p0;
}


public void c__Void() {
long life1_3;
    int life3_13;
    int life4_21;
    life1_3 = (net.minecraft.client.gui.GuiMerchant.cb ^ 31175725822017L);
    super.c__Void();
    life3_13 = ((this.k - this.x) / 2);
    life4_21 = ((this.l - this.y) / 2);
    java.util.List spill485_0 = this.m;
    net.minecraft.client.gui.GuiMerchant __stackOp485_10_0 = this;
    moom.gh __stackOp485_10_1 = new moom.gh(1, ((life3_13 + __sourceIntrinsic_7ac46ee229a8_invokedynamic485_7(12356, (1236079807562704018L ^ life1_3))) + __sourceIntrinsic_7ac46ee229a8_invokedynamic485_8(25996, (5369185487289463131L ^ life1_3))), ((life4_21 + __sourceIntrinsic_7ac46ee229a8_invokedynamic485_9(23587, (1757552253566945515L ^ life1_3))) - 1), true);
    moom.gh spill485_1 = __stackOp485_10_1;
    ((net.minecraft.client.gui.GuiMerchant)(__stackOp485_10_0)).ac = ((moom.gh)(__stackOp485_10_1));
    ((java.util.List)(spill485_0)).add(((java.lang.Object)(spill485_1)));
    java.util.List spill485_2 = this.m;
    net.minecraft.client.gui.GuiMerchant __stackOp485_17_0 = this;
    moom.gh __stackOp485_17_1 = new moom.gh(2, ((life3_13 + __sourceIntrinsic_7ac46ee229a8_invokedynamic485_14(4708, (9200417643775641248L ^ life1_3))) - __sourceIntrinsic_7ac46ee229a8_invokedynamic485_15(5835, (5901328971243831808L ^ life1_3))), ((life4_21 + __sourceIntrinsic_7ac46ee229a8_invokedynamic485_16(23587, (1757552253566945515L ^ life1_3))) - 1), false);
    moom.gh spill485_3 = __stackOp485_17_1;
    ((net.minecraft.client.gui.GuiMerchant)(__stackOp485_17_0)).ad = ((moom.gh)(__stackOp485_17_1));
    ((java.util.List)(spill485_2)).add(((java.lang.Object)(spill485_3)));
    ((moom.gh)(this.ac)).m = ((boolean)(false));
    ((moom.gh)(this.ad)).m = ((boolean)(false));
    return;
}


private static int d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.client.gui.GuiMerchant.d(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int d(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 1970;
      if (pb[var3] == null) {
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
         long var5 = fb[var3];
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
         Object[] var9 = (Object[])qb.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               qb.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/hj", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         pb[var3] = var15;
      }

      return pb[var3];
}


private static java.lang.invoke.CallSite d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral10288_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/hj"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(int p0, int p1, float p2) { __sourceHandlerCall_4fea09f6101bdf3809cb(this, p0, p1, p2); }


protected void a__Void(moom.gc p0) throws java.io.IOException { __sourceHandlerCall_fec6e21b698655713dfe(this, p0); }


protected void a(float p0, int p1, int p2) { __sourceHandlerCall_2013fa3db12c3b7107b6(this, p0, p1, p2); }


public net.minecraft.entity.IMerchant a() {
return this.ab;
}


public void g() { __sourceHandlerCall_840d75ef52a32fae5e06(this); }


private static native <E extends Throwable> int __sourceIntrinsic_45fde0f4e55e_originalDynamicSite1783_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_45fde0f4e55e_originalDynamicSite1783_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_45fde0f4e55e_originalDynamicSite1783_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic485_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic485_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic485_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic485_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic485_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic485_16(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral10288_0() throws E;
}
