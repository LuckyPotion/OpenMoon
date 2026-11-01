package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class ht extends net.minecraft.client.renderer.InventoryEffectRenderer {

private static moom.DD aa;

private static moom.wq ab;

private static int ac;

private float ad;

private boolean ae;

private boolean af;

private moom.hJ ag;

private java.util.List<moom.wB> ah;

private moom.wB ai;

private boolean aj;

private moom.iv ak;

private static long cb;

private static long[] sb;

private static java.lang.Integer[] tb;

private static java.util.Map ub;

public ht(net.minecraft.entity.player.EntityPlayer p0) { super((moom.v8)null); }

private static void __sourceConstructorBody_84eb2f054341b621(moom.ht receiver, net.minecraft.entity.player.EntityPlayer p0) throws Throwable {
long local2_life1 = (moom.ht.cb ^ 108337085850709L);
    moom.ht.__sourceConstructorInit_84eb2f054341b621_0(((moom.ht)(receiver)), ((moom.v9)(new moom.v9(p0))));
    ((net.minecraft.entity.player.EntityPlayer)(p0)).bG = ((moom.v8)(((moom.ht)(receiver)).z));
    ((moom.ht)(receiver)).o = ((boolean)(true));
    ((moom.ht)(receiver)).y = ((int)(__sourceIntrinsic_84eb2f054341b621_originalDynamicSite810_6(12762, (6579774505491637719L ^ local2_life1))));
    ((moom.ht)(receiver)).x = ((int)(__sourceIntrinsic_84eb2f054341b621_originalDynamicSite810_8(18710, (2416346913921850647L ^ local2_life1))));
    return;
}


static {
cb = ((long)(((moom._a)(moom._c.a(((long)(-4178367898404217827L)), ((long)(-1228889613796221300L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(136648159545863L)))));
    long local11_life6 = (moom.ht.cb ^ 48794416471019L);
    ub = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life9;
    javax.crypto.Cipher __sourceSpill1268_11 = (local0_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1268_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1268_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1268_14 = new byte[8];
    (__sourceSpill1268_14)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local1_life15 = 1;
    while ((local1_life15 < 8)) {
        (__sourceSpill1268_14)[local1_life15] = ((byte) ((int) ((local11_life6 << (local1_life15 * 8)) >>> 56)));
        local1_life15 += 1;
    }
    byte[] __sourcePreallocation1268_16 = __sourceSpill1268_14;
    ((javax.crypto.Cipher)(__sourceSpill1268_11)).init(((int)(__sourceSpill1268_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1268_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1268_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life19 = new long[48];
    int local3_life20 = 0;
    java.lang.String local4_life21;
    int local5_life23 = ((java.lang.String)((local4_life21 = "¡àã ¦L\021Uy¬6Õb«RÕfH[¦Ä2%jÙfq\n/_f:Ò\f\030*\035\031@(Gný\tI?FÊ%<G\b³ð£ô\022\t¶\r\177úþD2\177&Ã\024öDOó\023Ó}S¶\030\0353üOQK÷ÇP>-\006ÃÉOn'\033É]LÚòH\007«äÙ#`\016ÉHÕÒv8·©Øó\023?¿cÔìI$ÛóDõ¬\034·ö@\034\030K\037ÙÓ6§\0008QØQøsÊ(ÅT5\020¢\013\035VÌÿhª«úö\027\rmIÉ<¬O5;\031sß0hIM½\022ÈÐÇ#g\n ZG\030& °M{8<^Å \030Í5\025àì¨5lriØ¨$Õ±äîg\021ÒÍÛÚ PP¿gS7³>¡ÞÿÚPÅ¼\032X½dÕo°1Jo5ä\023ãøNÚD¾m\r»}àf½¤YaÀi\005s©Äxj7j§;ÂØüMÉð²nIæG1ÜË¹ª\031Ã¬ûBôTFÄU\017\025F¤ÜÌF;ä­\bI\t"))).length();
    int local2_life24 = 0;
    do {
        java.lang.String __sourceSpill1268_25 = local4_life21;
        int __sourceSpill1268_26 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1268_25)).substring(((int)(__sourceSpill1268_26)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1268_30 = local6_life19;
        int __sourceSpill1268_31 = local3_life20;
        local3_life20 += 1;
        long local8_life32 = (((((((((((long) (local7_life29)[0]) & 255L) << 56) | ((((long) (local7_life29)[1]) & 255L) << 48)) | ((((long) (local7_life29)[2]) & 255L) << 40)) | ((((long) (local7_life29)[3]) & 255L) << 32)) | ((((long) (local7_life29)[4]) & 255L) << 24)) | ((((long) (local7_life29)[5]) & 255L) << 16)) | ((((long) (local7_life29)[6]) & 255L) << 8)) | (((long) (local7_life29)[7]) & 255L));
        byte[] __sourceSpill1268_33 = new byte[8];
        (__sourceSpill1268_33)[0] = ((byte) ((int) (local8_life32 >>> 56)));
        (__sourceSpill1268_33)[1] = ((byte) ((int) (local8_life32 >>> 48)));
        (__sourceSpill1268_33)[2] = ((byte) ((int) (local8_life32 >>> 40)));
        (__sourceSpill1268_33)[3] = ((byte) ((int) (local8_life32 >>> 32)));
        (__sourceSpill1268_33)[4] = ((byte) ((int) (local8_life32 >>> 24)));
        (__sourceSpill1268_33)[5] = ((byte) ((int) (local8_life32 >>> 16)));
        (__sourceSpill1268_33)[6] = ((byte) ((int) (local8_life32 >>> 8)));
        (__sourceSpill1268_33)[7] = ((byte) ((int) local8_life32));
        javax.crypto.Cipher __sourceSpill1268_34 = local0_life9;
        byte[] local10_life36 = ((javax.crypto.Cipher)(__sourceSpill1268_34)).doFinal(((byte[])(__sourceSpill1268_33)));
        (__sourceSpill1268_30)[__sourceSpill1268_31] = (((((((((((long) (local10_life36)[0]) & 255L) << 56) | ((((long) (local10_life36)[1]) & 255L) << 48)) | ((((long) (local10_life36)[2]) & 255L) << 40)) | ((((long) (local10_life36)[3]) & 255L) << 32)) | ((((long) (local10_life36)[4]) & 255L) << 24)) | ((((long) (local10_life36)[5]) & 255L) << 16)) | ((((long) (local10_life36)[6]) & 255L) << 8)) | (((long) (local10_life36)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    local5_life23 = ((java.lang.String)((local4_life21 = ".§\002û\bM\020±Âêû Ö\002un"))).length();
    local2_life24 = 0;
    do {
        java.lang.String __sourceSpill1268_38 = local4_life21;
        int __sourceSpill1268_39 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1268_38)).substring(((int)(__sourceSpill1268_39)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1268_43 = local6_life19;
        int __sourceSpill1268_44 = local3_life20;
        local3_life20 += 1;
        long local8_life45 = (((((((((((long) (local7_life42)[0]) & 255L) << 56) | ((((long) (local7_life42)[1]) & 255L) << 48)) | ((((long) (local7_life42)[2]) & 255L) << 40)) | ((((long) (local7_life42)[3]) & 255L) << 32)) | ((((long) (local7_life42)[4]) & 255L) << 24)) | ((((long) (local7_life42)[5]) & 255L) << 16)) | ((((long) (local7_life42)[6]) & 255L) << 8)) | (((long) (local7_life42)[7]) & 255L));
        byte[] __sourceSpill1268_46 = new byte[8];
        (__sourceSpill1268_46)[0] = ((byte) ((int) (local8_life45 >>> 56)));
        (__sourceSpill1268_46)[1] = ((byte) ((int) (local8_life45 >>> 48)));
        (__sourceSpill1268_46)[2] = ((byte) ((int) (local8_life45 >>> 40)));
        (__sourceSpill1268_46)[3] = ((byte) ((int) (local8_life45 >>> 32)));
        (__sourceSpill1268_46)[4] = ((byte) ((int) (local8_life45 >>> 24)));
        (__sourceSpill1268_46)[5] = ((byte) ((int) (local8_life45 >>> 16)));
        (__sourceSpill1268_46)[6] = ((byte) ((int) (local8_life45 >>> 8)));
        (__sourceSpill1268_46)[7] = ((byte) ((int) local8_life45));
        javax.crypto.Cipher __sourceSpill1268_47 = local0_life9;
        byte[] local10_life49 = ((javax.crypto.Cipher)(__sourceSpill1268_47)).doFinal(((byte[])(__sourceSpill1268_46)));
        (__sourceSpill1268_43)[__sourceSpill1268_44] = (((((((((((long) (local10_life49)[0]) & 255L) << 56) | ((((long) (local10_life49)[1]) & 255L) << 48)) | ((((long) (local10_life49)[2]) & 255L) << 40)) | ((((long) (local10_life49)[3]) & 255L) << 32)) | ((((long) (local10_life49)[4]) & 255L) << 24)) | ((((long) (local10_life49)[5]) & 255L) << 16)) | ((((long) (local10_life49)[6]) & 255L) << 8)) | (((long) (local10_life49)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    sb = ((long[])(local6_life19));
    tb = ((java.lang.Integer[])(new java.lang.Integer[48]));
    aa = ((moom.DD)(new moom.DD("textures/gui/container/creative_inventory/tabs.png")));
    ab = ((moom.wq)(new moom.wq("tmp", true, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1268_53(23669, (5319089813269559261L ^ local11_life6)))));
    ac = ((int)(((net.minecraft.creativetab.CreativeTabs)(net.minecraft.creativetab.CreativeTabs.b)).a()));
}

private static native <E extends Throwable> void __sourceConstructorInit_84eb2f054341b621_0(moom.ht a0, moom.v9 a1) throws E;
private static native <E extends Throwable> void __sourceHandlerCall_6869e2a51125878ea158(moom.ht a0, char a1, int a2) throws E;
private static final class __SourceHandler_6869e2a51125878ea158 {

public static void f1058(moom.ht receiver, char p0, int p1) throws Throwable {
    forward_join_46: {
    forward_join_42: {
    forward_join_29: {
    forward_join_19: {
    forward_join_14: {
    if (!((__fieldRead1058_0() != __call1058_2(__fieldRead1058_1())))) { break forward_join_19; }
    if (!(__call1058_6(__fieldRead1058_5(__fieldRead1058_4(__fieldRead1058_3(receiver)))))) { break forward_join_14; }
    __call1058_8(receiver, __fieldRead1058_7());
    break forward_join_46;
    }
    __call1058_9(receiver, p0, p1);
    break forward_join_46;
    }
    if (!(__fieldRead1058_10(receiver))) { break forward_join_29; }
    __fieldWrite1058_11(receiver, 0);
    __call1058_13(__fieldRead1058_12(receiver), "");
    }
    if (!((!__call1058_14(receiver, p1)))) { break forward_join_46; }
    if (!(__call1058_16(__fieldRead1058_15(receiver), p0, p1))) { break forward_join_42; }
    __call1058_17(receiver);
    break forward_join_46;
    }
    __call1058_18(receiver, p0, p1);
    }
    return;
}
public static void h1058_0(java.io.IOException p0) throws Throwable {
    throw __call1105800_0(p0);
}
public static void h1058_1(java.io.IOException p0) throws Throwable {
    throw __call1105801_0(p0);
}
public static void h1058_2(java.io.IOException p0) throws Throwable {
    throw __call1105802_0(p0);
}
public static void h1058_3(java.io.IOException p0) throws Throwable {
    throw __call1105803_0(p0);
}
public static void h1058_4(java.io.IOException p0) throws Throwable {
    throw __call1105804_0(p0);
}
private static native int __fieldRead1058_0() throws Throwable;
private static native net.minecraft.creativetab.CreativeTabs __fieldRead1058_1() throws Throwable;
private static native int __call1058_2(net.minecraft.creativetab.CreativeTabs a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1058_3(moom.ht a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead1058_4(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.pz __fieldRead1058_5(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native boolean __call1058_6(moom.pz a0) throws Throwable;
private static native net.minecraft.creativetab.CreativeTabs __fieldRead1058_7() throws Throwable;
private static native void __call1058_8(moom.ht a0, net.minecraft.creativetab.CreativeTabs a1) throws Throwable;
private static native void __call1058_9(moom.ht a0, char a1, int a2) throws Throwable;
private static native boolean __fieldRead1058_10(moom.ht a0) throws Throwable;
private static native void __fieldWrite1058_11(moom.ht a0, int a1) throws Throwable;
private static native moom.hJ __fieldRead1058_12(moom.ht a0) throws Throwable;
private static native void __call1058_13(moom.hJ a0, java.lang.String a1) throws Throwable;
private static native boolean __call1058_14(moom.ht a0, int a1) throws Throwable;
private static native moom.hJ __fieldRead1058_15(moom.ht a0) throws Throwable;
private static native boolean __call1058_16(moom.hJ a0, char a1, int a2) throws Throwable;
private static native void __call1058_17(moom.ht a0) throws Throwable;
private static native void __call1058_18(moom.ht a0, char a1, int a2) throws Throwable;
private static native java.lang.Exception __call1105800_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1105801_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1105802_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1105803_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1105804_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_361edecc554b5a367bdc(moom.ht a0, float a1, int a2, int a3) throws E;
private static final class __SourceHandler_361edecc554b5a367bdc {

public static void f1791(moom.ht receiver, float p0, int p1, int p2) throws Throwable {
    long life4_3;
    net.minecraft.creativetab.CreativeTabs life6_13;
    net.minecraft.creativetab.CreativeTabs[] life7_15;
    int life8_18;
    int life9_20;
    net.minecraft.creativetab.CreativeTabs life10_27;
    int life7_83;
    int life8_92;
    int life9_100;
    life4_3 = (__fieldRead1791_0() ^ 138627808940164L);
    __call1791_1(0x1.0p0f, 0x1.0p0f, 0x1.0p0f, 0x1.0p0f);
    __call1791_2();
    life6_13 = (__fieldRead1791_3())[__fieldRead1791_4()];
    life7_15 = __fieldRead1791_5();
    life8_18 = (life7_15).length;
    life9_20 = 0;
    loop_region_21: while ((life9_20 < life8_18)) {
        life10_27 = (life7_15)[life9_20];
        __call1791_9(__call1791_7(__fieldRead1791_6(receiver)), __fieldRead1791_8());
        if ((__call1791_10(life10_27) != __fieldRead1791_11())) {
        __call1791_12(receiver, life10_27);
    }
        life9_20 += 1;
    }
    __call1791_17(__call1791_14(__fieldRead1791_13(receiver)), new moom.DD(__invokedynamic1791_16(__call1791_15(life6_13))));
    __call1791_22(receiver, __fieldRead1791_18(receiver), __fieldRead1791_19(receiver), 0, 0, __fieldRead1791_20(receiver), __fieldRead1791_21(receiver));
    __call1791_24(__fieldRead1791_23(receiver));
    __call1791_25(0x1.0p0f, 0x1.0p0f, 0x1.0p0f, 0x1.0p0f);
    life7_83 = (__fieldRead1791_26(receiver) + __invokedynamic1791_27(12718, (4233454491191234880L ^ life4_3)));
    life8_92 = (__fieldRead1791_28(receiver) + __invokedynamic1791_29(1795, (1460074082950113228L ^ life4_3)));
    life9_100 = (life8_92 + __invokedynamic1791_30(26256, (3852913001375303246L ^ life4_3)));
    __call1791_34(__call1791_32(__fieldRead1791_31(receiver)), __fieldRead1791_33());
    if (__call1791_35(life6_13)) {
        moom.ht spill1791_0 = receiver;
        int spill1791_1 = life7_83;
        int spill1791_2 = (life8_92 + ((int) (((float) ((life9_100 - life8_92) - __invokedynamic1791_36(27981, (7620424924124876161L ^ life4_3)))) * __fieldRead1791_37(receiver))));
        int spill1791_3 = __invokedynamic1791_38(10090, (5365486305510180779L ^ life4_3));
        __call1791_43(spill1791_0, spill1791_1, spill1791_2, (spill1791_3 + (__call1791_39(receiver) ? 0 : __invokedynamic1791_40(26027, (6033491305910109556L ^ life4_3)))), 0, __invokedynamic1791_41(9806, (7845682608100492931L ^ life4_3)), __invokedynamic1791_42(13573, (8167277981580973539L ^ life4_3)));
    }
    __call1791_44(receiver, life6_13);
    if ((life6_13 == __fieldRead1791_45())) {
        __call1791_58((__fieldRead1791_46(receiver) + __invokedynamic1791_47(14872, (4692514142185970373L ^ life4_3))), (__fieldRead1791_48(receiver) + __invokedynamic1791_49(23669, (5319145287477247154L ^ life4_3))), __invokedynamic1791_50(24245, (6843394717483253329L ^ life4_3)), ((float) ((__fieldRead1791_51(receiver) + __invokedynamic1791_52(15034, (4367454185456786032L ^ life4_3))) - p1)), ((float) (((__fieldRead1791_53(receiver) + __invokedynamic1791_54(23669, (5319145287477247154L ^ life4_3))) - __invokedynamic1791_55(21551, (3619610723555816644L ^ life4_3))) - p2)), __fieldRead1791_57(__fieldRead1791_56(receiver)));
    }
    return;
}
public static void h1791_0(moom.Oo p0) throws Throwable {
    throw __call1179100_0(p0);
}
public static void h1791_1(moom.Oo p0) throws Throwable {
    throw __call1179101_0(p0);
}
public static void h1791_2(moom.Oo p0) throws Throwable {
    throw __call1179102_0(p0);
}
public static void h1791_3(moom.Oo p0) throws Throwable {
    throw __call1179103_0(p0);
}
private static native long __fieldRead1791_0() throws Throwable;
private static native void __call1791_1(float a0, float a1, float a2, float a3) throws Throwable;
private static native void __call1791_2() throws Throwable;
private static native net.minecraft.creativetab.CreativeTabs[] __fieldRead1791_3() throws Throwable;
private static native int __fieldRead1791_4() throws Throwable;
private static native net.minecraft.creativetab.CreativeTabs[] __fieldRead1791_5() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1791_6(moom.ht a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureManager __call1791_7(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.DD __fieldRead1791_8() throws Throwable;
private static native void __call1791_9(net.minecraft.client.renderer.texture.TextureManager a0, moom.DD a1) throws Throwable;
private static native int __call1791_10(net.minecraft.creativetab.CreativeTabs a0) throws Throwable;
private static native int __fieldRead1791_11() throws Throwable;
private static native void __call1791_12(moom.ht a0, net.minecraft.creativetab.CreativeTabs a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1791_13(moom.ht a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureManager __call1791_14(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.lang.String __call1791_15(net.minecraft.creativetab.CreativeTabs a0) throws Throwable;
private static native java.lang.String __invokedynamic1791_16(java.lang.String a0) throws Throwable;
private static native void __call1791_17(net.minecraft.client.renderer.texture.TextureManager a0, moom.DD a1) throws Throwable;
private static native int __fieldRead1791_18(moom.ht a0) throws Throwable;
private static native int __fieldRead1791_19(moom.ht a0) throws Throwable;
private static native int __fieldRead1791_20(moom.ht a0) throws Throwable;
private static native int __fieldRead1791_21(moom.ht a0) throws Throwable;
private static native void __call1791_22(moom.ht a0, int a1, int a2, int a3, int a4, int a5, int a6) throws Throwable;
private static native moom.hJ __fieldRead1791_23(moom.ht a0) throws Throwable;
private static native void __call1791_24(moom.hJ a0) throws Throwable;
private static native void __call1791_25(float a0, float a1, float a2, float a3) throws Throwable;
private static native int __fieldRead1791_26(moom.ht a0) throws Throwable;
private static native int __invokedynamic1791_27(int a0, long a1) throws Throwable;
private static native int __fieldRead1791_28(moom.ht a0) throws Throwable;
private static native int __invokedynamic1791_29(int a0, long a1) throws Throwable;
private static native int __invokedynamic1791_30(int a0, long a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1791_31(moom.ht a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureManager __call1791_32(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.DD __fieldRead1791_33() throws Throwable;
private static native void __call1791_34(net.minecraft.client.renderer.texture.TextureManager a0, moom.DD a1) throws Throwable;
private static native boolean __call1791_35(net.minecraft.creativetab.CreativeTabs a0) throws Throwable;
private static native int __invokedynamic1791_36(int a0, long a1) throws Throwable;
private static native float __fieldRead1791_37(moom.ht a0) throws Throwable;
private static native int __invokedynamic1791_38(int a0, long a1) throws Throwable;
private static native boolean __call1791_39(moom.ht a0) throws Throwable;
private static native int __invokedynamic1791_40(int a0, long a1) throws Throwable;
private static native int __invokedynamic1791_41(int a0, long a1) throws Throwable;
private static native int __invokedynamic1791_42(int a0, long a1) throws Throwable;
private static native void __call1791_43(moom.ht a0, int a1, int a2, int a3, int a4, int a5, int a6) throws Throwable;
private static native void __call1791_44(moom.ht a0, net.minecraft.creativetab.CreativeTabs a1) throws Throwable;
private static native net.minecraft.creativetab.CreativeTabs __fieldRead1791_45() throws Throwable;
private static native int __fieldRead1791_46(moom.ht a0) throws Throwable;
private static native int __invokedynamic1791_47(int a0, long a1) throws Throwable;
private static native int __fieldRead1791_48(moom.ht a0) throws Throwable;
private static native int __invokedynamic1791_49(int a0, long a1) throws Throwable;
private static native int __invokedynamic1791_50(int a0, long a1) throws Throwable;
private static native int __fieldRead1791_51(moom.ht a0) throws Throwable;
private static native int __invokedynamic1791_52(int a0, long a1) throws Throwable;
private static native int __fieldRead1791_53(moom.ht a0) throws Throwable;
private static native int __invokedynamic1791_54(int a0, long a1) throws Throwable;
private static native int __invokedynamic1791_55(int a0, long a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1791_56(moom.ht a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead1791_57(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call1791_58(int a0, int a1, int a2, float a3, float a4, net.minecraft.client.entity.EntityPlayerSP a5) throws Throwable;
private static native java.lang.Exception __call1179100_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1179101_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1179102_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1179103_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_32dfe6fc399a34ac38f9(moom.ht a0, int a1, int a2, float a3) throws E;
private static final class __SourceHandler_32dfe6fc399a34ac38f9 {

public static void f100116(moom.ht receiver, int p0, int p1, float p2) throws Throwable {
    long life4_3;
    int life6_6;
    int life7_9;
    int life8_12;
    int life9_20;
    int life10_28;
    int life11_36;
    int life12_44;
    net.minecraft.creativetab.CreativeTabs[] life13_119;
    int life14_122;
    int life15_124;
    net.minecraft.creativetab.CreativeTabs life16_131;
    forest_join_169: {
    forest_join_133: {
    forest_join_105: {
    forest_join_71: {
    forest_join_66: {
    life4_3 = (__fieldRead100116_0() ^ 35810001566478L);
    life6_6 = __integerCategory100116_2(__call100116_1(0));
    life7_9 = __fieldRead100116_3(receiver);
    life8_12 = __fieldRead100116_4(receiver);
    life9_20 = (life7_9 + __invokedynamic100116_5(4729, (9165852087969913128L ^ life4_3)));
    life10_28 = (life8_12 + __invokedynamic100116_6(27617, (5244117253148500157L ^ life4_3)));
    life11_36 = (life9_20 + __invokedynamic100116_7(12229, (8890683004958647437L ^ life4_3)));
    life12_44 = (life10_28 + __invokedynamic100116_8(26617, (5995167521537256595L ^ life4_3)));
    if (!((!__fieldRead100116_9(receiver)))) {
        break forest_join_66;
    }
    if (!((life6_6 != 0))) {
        break forest_join_66;
    }
    if (!((p0 >= life9_20))) {
        break forest_join_66;
    }
    if (!((p1 >= life10_28))) {
        break forest_join_66;
    }
    if (!((p0 < life11_36))) {
        break forest_join_66;
    }
    if (!((p1 < life12_44))) {
        break forest_join_66;
    }
    __fieldWrite100116_11(receiver, __call100116_10(receiver));
    }
    if (!((life6_6 == 0))) {
        break forest_join_71;
    }
    __fieldWrite100116_12(receiver, 0);
    }
    __fieldWrite100116_13(receiver, life6_6);
    if (!(__fieldRead100116_14(receiver))) {
        break forest_join_105;
    }
    __fieldWrite100116_15(receiver, ((((float) (p1 - life10_28)) - 0x1.ep2f) / (((float) (life12_44 - life10_28)) - 0x1.ep3f)));
    __fieldWrite100116_18(receiver, __call100116_17(__fieldRead100116_16(receiver), 0x0.0p0f, 0x1.0p0f));
    __call100116_22(__cast100116_20(__fieldRead100116_19(receiver)), __fieldRead100116_21(receiver));
    }
    __call100116_23(receiver, p0, p1, p2);
    life13_119 = __fieldRead100116_24();
    life14_122 = (life13_119).length;
    life15_124 = 0;
    forest_cycle_117: while (true) {
    forest_join_131: {
    if (!((life15_124 < life14_122))) {
        break forest_join_133;
    }
    life16_131 = (life13_119)[life15_124];
    if (!(__call100116_25(receiver, life16_131, p0, p1))) {
        break forest_join_131;
    }
    break forest_join_133;
    }
    life15_124 += 1;
    continue forest_cycle_117;
    }
    }
    if (!((__fieldRead100116_26(receiver) != null))) {
        break forest_join_169;
    }
    if (!((__fieldRead100116_27() == __call100116_29(__fieldRead100116_28())))) {
        break forest_join_169;
    }
    if (!(__call100116_36(receiver, __fieldRead100116_31(__fieldRead100116_30(receiver)), __fieldRead100116_33(__fieldRead100116_32(receiver)), __invokedynamic100116_34(26794, (3077619643275862979L ^ life4_3)), __invokedynamic100116_35(14474, (1768201778294535122L ^ life4_3)), p0, p1))) {
        break forest_join_169;
    }
    __call100116_38(receiver, __call100116_37("inventory.binSlot", new java.lang.Object[0]), p0, p1);
    }
    __call100116_39(0x1.0p0f, 0x1.0p0f, 0x1.0p0f, 0x1.0p0f);
    __call100116_40();
    return;
}
public static void h100116_0(moom.Oo p0) throws Throwable {
    throw __call13011600_0(p0);
}
public static void h100116_1(moom.Oo p0) throws Throwable {
    throw __call13011601_0(p0);
}
public static void h100116_2(moom.Oo p0) throws Throwable {
    throw __call13011602_0(p0);
}
public static void h100116_3(moom.Oo p0) throws Throwable {
    throw __call13011603_0(p0);
}
public static void h100116_4(moom.Oo p0) throws Throwable {
    throw __call13011604_0(p0);
}
public static void h100116_5(moom.Oo p0) throws Throwable {
    throw __call13011605_0(p0);
}
public static void h100116_6(moom.Oo p0) throws Throwable {
    throw __call13011606_0(p0);
}
public static void h100116_7(moom.Oo p0) throws Throwable {
    throw __call13011607_0(p0);
}
public static void h100116_8(moom.Oo p0) throws Throwable {
    throw __call13011608_0(p0);
}
public static void h100116_9(moom.Oo p0) throws Throwable {
    throw __call13011609_0(p0);
}
public static void h100116_10(moom.Oo p0) throws Throwable {
    throw __call13011610_0(p0);
}
public static void h100116_11(moom.Oo p0) throws Throwable {
    throw __call13011611_0(p0);
}
private static native long __fieldRead100116_0() throws Throwable;
private static native boolean __call100116_1(int a0) throws Throwable;
private static native int __integerCategory100116_2(boolean value) throws Throwable;
private static native int __fieldRead100116_3(moom.ht a0) throws Throwable;
private static native int __fieldRead100116_4(moom.ht a0) throws Throwable;
private static native int __invokedynamic100116_5(int a0, long a1) throws Throwable;
private static native int __invokedynamic100116_6(int a0, long a1) throws Throwable;
private static native int __invokedynamic100116_7(int a0, long a1) throws Throwable;
private static native int __invokedynamic100116_8(int a0, long a1) throws Throwable;
private static native boolean __fieldRead100116_9(moom.ht a0) throws Throwable;
private static native boolean __call100116_10(moom.ht a0) throws Throwable;
private static native void __fieldWrite100116_11(moom.ht a0, boolean a1) throws Throwable;
private static native void __fieldWrite100116_12(moom.ht a0, int a1) throws Throwable;
private static native void __fieldWrite100116_13(moom.ht a0, int a1) throws Throwable;
private static native boolean __fieldRead100116_14(moom.ht a0) throws Throwable;
private static native void __fieldWrite100116_15(moom.ht a0, float a1) throws Throwable;
private static native float __fieldRead100116_16(moom.ht a0) throws Throwable;
private static native float __call100116_17(float a0, float a1, float a2) throws Throwable;
private static native void __fieldWrite100116_18(moom.ht a0, float a1) throws Throwable;
private static native moom.v8 __fieldRead100116_19(moom.ht a0) throws Throwable;
private static native moom.v9 __cast100116_20(moom.v8 a0) throws Throwable;
private static native float __fieldRead100116_21(moom.ht a0) throws Throwable;
private static native void __call100116_22(moom.v9 a0, float a1) throws Throwable;
private static native void __call100116_23(moom.ht a0, int a1, int a2, float a3) throws Throwable;
private static native net.minecraft.creativetab.CreativeTabs[] __fieldRead100116_24() throws Throwable;
private static native boolean __call100116_25(moom.ht a0, net.minecraft.creativetab.CreativeTabs a1, int a2, int a3) throws Throwable;
private static native moom.wB __fieldRead100116_26(moom.ht a0) throws Throwable;
private static native int __fieldRead100116_27() throws Throwable;
private static native net.minecraft.creativetab.CreativeTabs __fieldRead100116_28() throws Throwable;
private static native int __call100116_29(net.minecraft.creativetab.CreativeTabs a0) throws Throwable;
private static native moom.wB __fieldRead100116_30(moom.ht a0) throws Throwable;
private static native int __fieldRead100116_31(moom.wB a0) throws Throwable;
private static native moom.wB __fieldRead100116_32(moom.ht a0) throws Throwable;
private static native int __fieldRead100116_33(moom.wB a0) throws Throwable;
private static native int __invokedynamic100116_34(int a0, long a1) throws Throwable;
private static native int __invokedynamic100116_35(int a0, long a1) throws Throwable;
private static native boolean __call100116_36(moom.ht a0, int a1, int a2, int a3, int a4, int a5, int a6) throws Throwable;
private static native java.lang.String __call100116_37(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native void __call100116_38(moom.ht a0, java.lang.String a1, int a2, int a3) throws Throwable;
private static native void __call100116_39(float a0, float a1, float a2, float a3) throws Throwable;
private static native void __call100116_40() throws Throwable;
private static native java.lang.Exception __call13011600_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call13011601_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call13011602_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call13011603_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call13011604_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call13011605_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call13011606_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call13011607_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call13011608_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call13011609_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call13011610_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call13011611_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_463d6086090accd0ebfc(moom.ht a0, int a1, int a2, int a3) throws E;
private static final class __SourceHandler_463d6086090accd0ebfc {

public static void f1793(moom.ht receiver, int p0, int p1, int p2) throws Throwable {
    int life4_6;
    int life5_11;
    net.minecraft.creativetab.CreativeTabs[] life6_13;
    int life7_16;
    int life8_18;
    net.minecraft.creativetab.CreativeTabs life9_25;
    if ((p2 == 0)) {
        life4_6 = (p0 - __fieldRead1793_0(receiver));
        life5_11 = (p1 - __fieldRead1793_1(receiver));
        life6_13 = __fieldRead1793_2();
        life7_16 = (life6_13).length;
        life8_18 = 0;
        loop_region_19: while ((life8_18 < life7_16)) {
        life9_25 = (life6_13)[life8_18];
        if (__call1793_3(receiver, life9_25, life4_6, life5_11)) {
        return;
    }
        life8_18 += 1;
    }
    }
    __call1793_4(receiver, p0, p1, p2);
    return;
}
public static void h1793_0(java.io.IOException p0) throws Throwable {
    throw __call1179300_0(p0);
}
private static native int __fieldRead1793_0(moom.ht a0) throws Throwable;
private static native int __fieldRead1793_1(moom.ht a0) throws Throwable;
private static native net.minecraft.creativetab.CreativeTabs[] __fieldRead1793_2() throws Throwable;
private static native boolean __call1793_3(moom.ht a0, net.minecraft.creativetab.CreativeTabs a1, int a2, int a3) throws Throwable;
private static native void __call1793_4(moom.ht a0, int a1, int a2, int a3) throws Throwable;
private static native java.lang.Exception __call1179300_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_934afcc272c71041ee0a(moom.ht a0, moom.wB a1, int a2, int a3, int a4) throws E;
private static final class __SourceHandler_934afcc272c71041ee0a {

public static void f442(moom.ht receiver, moom.wB p0, int p1, int p2, int p3) throws Throwable {
    int forestValue442_13_0;
    int forestValue442_26_0;
    moom.wB forestValue442_144_0;
    moom.wB forestValue442_147_0;
    int forestValue442_147_1;
    moom.v8 forestValue442_206_0;
    moom.v8 forestValue442_210_0;
    int forestValue442_210_1;
    net.minecraft.item.ItemStack forestValue442_309_0;
    net.minecraft.item.ItemStack forestValue442_311_0;
    int forestValue442_311_1;
    moom.v8 forestValue442_395_0;
    moom.v8 forestValue442_397_0;
    int forestValue442_397_1;
    moom.wB spill442_0;
    moom.v8 spill442_1;
    net.minecraft.item.ItemStack spill442_2;
    moom.v8 spill442_3;
    long life5_3;
    int life7_13;
    int life4_27;
    net.minecraft.entity.player.InventoryPlayer life8_43;
    net.minecraft.item.ItemStack life9_75;
    int life8_105;
    net.minecraft.item.ItemStack life8_159;
    net.minecraft.entity.player.InventoryPlayer life8_247;
    net.minecraft.item.ItemStack life9_250;
    net.minecraft.item.ItemStack life10_253;
    net.minecraft.item.ItemStack life11_273;
    net.minecraft.item.ItemStack life11_305;
    net.minecraft.item.ItemStack life11_322;
    net.minecraft.item.ItemStack life9_400;
    int life8_432;
    net.minecraft.item.ItemStack life8_473;
    forest_join_475: {
    forest_join_442: {
    forest_join_441: {
    forest_join_397: {
    forest_join_395: {
    forest_join_389: {
    forest_join_388: {
    forest_join_385: {
    forest_join_367: {
    forest_join_360: {
    forest_join_352: {
    forest_join_340: {
    forest_join_325: {
    forest_join_324: {
    forest_join_311: {
    forest_join_309: {
    forest_join_296: {
    forest_join_295: {
    forest_join_275: {
    forest_join_274: {
    forest_join_223: {
    forest_join_210: {
    forest_join_206: {
    forest_join_198: {
    forest_join_162: {
    forest_join_147: {
    forest_join_144: {
    forest_join_131: {
    forest_join_116: {
    forest_join_115: {
    forest_join_91: {
    forest_join_90: {
    forest_join_63: {
    forest_join_26: {
    forest_join_25: {
    forest_join_13: {
    forest_join_12: {
    life5_3 = (__fieldRead442_0() ^ 13434607259787L);
    __fieldWrite442_1(receiver, 1);
    if (!((p3 == 1))) {
        break forest_join_12;
    }
    forestValue442_13_0 = 1;
    break forest_join_13;
    }
    forestValue442_13_0 = 0;
    }
    life7_13 = forestValue442_13_0;
    if (!((p1 == __invokedynamic442_2(30121, (3473596172412228991L ^ life5_3))))) {
        break forest_join_25;
    }
    if (!((p3 == 0))) {
        break forest_join_25;
    }
    forestValue442_26_0 = 4;
    break forest_join_26;
    }
    forestValue442_26_0 = p3;
    }
    life4_27 = forestValue442_26_0;
    if (!((p0 == null))) {
        break forest_join_91;
    }
    if (!((__fieldRead442_3() != __call442_5(__fieldRead442_4())))) {
        break forest_join_91;
    }
    if (!((life4_27 != 5))) {
        break forest_join_91;
    }
    life8_43 = __fieldRead442_8(__fieldRead442_7(__fieldRead442_6(receiver)));
    if (!((__call442_9(life8_43) != null))) {
        break forest_join_90;
    }
    if (!((p2 == 0))) {
        break forest_join_63;
    }
    __call442_13(__fieldRead442_11(__fieldRead442_10(receiver)), __call442_12(life8_43), 1);
    __call442_17(__fieldRead442_15(__fieldRead442_14(receiver)), __call442_16(life8_43));
    __call442_18(life8_43, null);
    }
    if (!((p2 == 1))) {
        break forest_join_90;
    }
    life9_75 = __call442_20(__call442_19(life8_43), 1);
    __call442_23(__fieldRead442_22(__fieldRead442_21(receiver)), life9_75, 1);
    __call442_26(__fieldRead442_25(__fieldRead442_24(receiver)), life9_75);
    if (!((__fieldRead442_28(__call442_27(life8_43)) == 0))) {
        break forest_join_90;
    }
    __call442_29(life8_43, null);
    }
    break forest_join_475;
    }
    if (!((p0 == __fieldRead442_30(receiver)))) {
        break forest_join_116;
    }
    if (!((life7_13 != 0))) {
        break forest_join_116;
    }
    life8_105 = 0;
    forest_cycle_99: while (true) {
    if (!((life8_105 < __call442_35(__call442_34(__fieldRead442_33(__fieldRead442_32(__fieldRead442_31(receiver)))))))) {
        break forest_join_115;
    }
    __call442_38(__fieldRead442_37(__fieldRead442_36(receiver)), null, life8_105);
    life8_105 += 1;
    continue forest_cycle_99;
    }
    }
    break forest_join_475;
    }
    if (!((__fieldRead442_39() == __call442_41(__fieldRead442_40())))) {
        break forest_join_223;
    }
    if (!((p0 == __fieldRead442_42(receiver)))) {
        break forest_join_131;
    }
    __call442_46(__fieldRead442_45(__fieldRead442_44(__fieldRead442_43(receiver))), null);
    break forest_join_475;
    }
    if (!((life4_27 == 4))) {
        break forest_join_162;
    }
    if (!((p0 != null))) {
        break forest_join_162;
    }
    if (!(__call442_47(p0))) {
        break forest_join_162;
    }
    spill442_0 = p0;
    if (!((p2 == 0))) {
        forestValue442_144_0 = spill442_0;
        break forest_join_144;
    }
    forestValue442_147_0 = spill442_0;
    forestValue442_147_1 = 1;
    break forest_join_147;
    }
    forestValue442_147_0 = forestValue442_144_0;
    forestValue442_147_1 = __call442_49(__call442_48(p0));
    }
    life8_159 = __call442_50(forestValue442_147_0, forestValue442_147_1);
    __call442_53(__fieldRead442_52(__fieldRead442_51(receiver)), life8_159, 1);
    __call442_56(__fieldRead442_55(__fieldRead442_54(receiver)), life8_159);
    break forest_join_475;
    }
    if (!((life4_27 == 4))) {
        break forest_join_198;
    }
    if (!((__call442_60(__fieldRead442_59(__fieldRead442_58(__fieldRead442_57(receiver)))) != null))) {
        break forest_join_198;
    }
    __call442_67(__fieldRead442_62(__fieldRead442_61(receiver)), __call442_66(__fieldRead442_65(__fieldRead442_64(__fieldRead442_63(receiver)))), 1);
    __call442_74(__fieldRead442_69(__fieldRead442_68(receiver)), __call442_73(__fieldRead442_72(__fieldRead442_71(__fieldRead442_70(receiver)))));
    __call442_78(__fieldRead442_77(__fieldRead442_76(__fieldRead442_75(receiver))), null);
    break forest_join_475;
    }
    spill442_1 = __fieldRead442_81(__fieldRead442_80(__fieldRead442_79(receiver)));
    if (!((p0 == null))) {
        forestValue442_206_0 = spill442_1;
        break forest_join_206;
    }
    forestValue442_210_0 = spill442_1;
    forestValue442_210_1 = p1;
    break forest_join_210;
    }
    forestValue442_210_0 = forestValue442_206_0;
    forestValue442_210_1 = __fieldRead442_84(__fieldRead442_83(__cast442_82(p0)));
    }
    __call442_87(forestValue442_210_0, forestValue442_210_1, p2, life4_27, __fieldRead442_86(__fieldRead442_85(receiver)));
    __call442_91(__fieldRead442_90(__fieldRead442_89(__fieldRead442_88(receiver))));
    break forest_join_475;
    }
    if (!((life4_27 != 5))) {
        break forest_join_389;
    }
    if (!((__fieldRead442_92(p0) == __fieldRead442_93()))) {
        break forest_join_389;
    }
    life8_247 = __fieldRead442_96(__fieldRead442_95(__fieldRead442_94(receiver)));
    life9_250 = __call442_97(life8_247);
    life10_253 = __call442_98(p0);
    if (!((life4_27 == 2))) {
        break forest_join_275;
    }
    if (!((life10_253 != null))) {
        break forest_join_274;
    }
    if (!((p2 >= 0))) {
        break forest_join_274;
    }
    if (!((p2 < __invokedynamic442_99(14552, (6270401938994255930L ^ life5_3))))) {
        break forest_join_274;
    }
    life11_273 = __call442_100(life10_253);
    __fieldWrite442_102(life11_273, __call442_101(life11_273));
    __call442_106(__fieldRead442_105(__fieldRead442_104(__fieldRead442_103(receiver))), p2, life11_273);
    __call442_110(__fieldRead442_109(__fieldRead442_108(__fieldRead442_107(receiver))));
    }
    return;
    }
    if (!((life4_27 == 3))) {
        break forest_join_296;
    }
    if (!((__call442_111(life8_247) == null))) {
        break forest_join_295;
    }
    if (!(__call442_112(p0))) {
        break forest_join_295;
    }
    life11_305 = __call442_114(__call442_113(p0));
    __fieldWrite442_116(life11_305, __call442_115(life11_305));
    __call442_117(life8_247, life11_305);
    }
    return;
    }
    if (!((life4_27 == 4))) {
        break forest_join_325;
    }
    if (!((life10_253 != null))) {
        break forest_join_324;
    }
    life11_322 = __call442_118(life10_253);
    spill442_2 = life11_322;
    if (!((p2 == 0))) {
        forestValue442_309_0 = spill442_2;
        break forest_join_309;
    }
    forestValue442_311_0 = spill442_2;
    forestValue442_311_1 = 1;
    break forest_join_311;
    }
    forestValue442_311_0 = forestValue442_309_0;
    forestValue442_311_1 = __call442_119(life11_322);
    }
    __fieldWrite442_120(forestValue442_311_0, forestValue442_311_1);
    __call442_123(__fieldRead442_122(__fieldRead442_121(receiver)), life11_322, 1);
    __call442_126(__fieldRead442_125(__fieldRead442_124(receiver)), life11_322);
    }
    return;
    }
    if (!((life9_250 != null))) {
        break forest_join_367;
    }
    if (!(__call442_127(life9_250, life10_253))) {
        break forest_join_367;
    }
    if (!((p2 == 0))) {
        break forest_join_352;
    }
    if (!((life7_13 != 0))) {
        break forest_join_340;
    }
    __fieldWrite442_129(life9_250, __call442_128(life9_250));
    break forest_join_388;
    }
    if (!((__fieldRead442_130(life9_250) < __call442_131(life9_250)))) {
        break forest_join_388;
    }
    net.minecraft.item.ItemStack __stackOp442_132_0 = life9_250;
    __fieldWrite442_134(__stackOp442_132_0, (__fieldRead442_133(__stackOp442_132_0) + 1));
    break forest_join_388;
    }
    if (!((__fieldRead442_135(life9_250) <= 1))) {
        break forest_join_360;
    }
    __call442_136(life8_247, null);
    break forest_join_388;
    }
    net.minecraft.item.ItemStack __stackOp442_137_0 = life9_250;
    __fieldWrite442_139(__stackOp442_137_0, (__fieldRead442_138(__stackOp442_137_0) - 1));
    break forest_join_388;
    }
    if (!((life10_253 != null))) {
        break forest_join_385;
    }
    if (!((life9_250 == null))) {
        break forest_join_385;
    }
    __call442_141(life8_247, __call442_140(life10_253));
    life9_400 = __call442_142(life8_247);
    if (!((life7_13 != 0))) {
        break forest_join_388;
    }
    __fieldWrite442_144(life9_400, __call442_143(life9_400));
    break forest_join_388;
    }
    __call442_145(life8_247, null);
    }
    break forest_join_475;
    }
    spill442_3 = __fieldRead442_146(receiver);
    if (!((p0 == null))) {
        forestValue442_395_0 = spill442_3;
        break forest_join_395;
    }
    forestValue442_397_0 = spill442_3;
    forestValue442_397_1 = p1;
    break forest_join_397;
    }
    forestValue442_397_0 = forestValue442_395_0;
    forestValue442_397_1 = __fieldRead442_147(p0);
    }
    __call442_150(forestValue442_397_0, forestValue442_397_1, p2, life4_27, __fieldRead442_149(__fieldRead442_148(receiver)));
    if (!((__call442_151(p2) == 2))) {
        break forest_join_442;
    }
    life8_432 = 0;
    forest_cycle_410: while (true) {
    if (!((life8_432 < __invokedynamic442_152(28576, (7959522885135306618L ^ life5_3))))) {
        break forest_join_441;
    }
    __call442_160(__fieldRead442_154(__fieldRead442_153(receiver)), __call442_158(__call442_157(__fieldRead442_155(receiver), (__invokedynamic442_156(6272, (8033699287266981976L ^ life5_3)) + life8_432))), (__invokedynamic442_159(20148, (8820299272068542051L ^ life5_3)) + life8_432));
    life8_432 += 1;
    continue forest_cycle_410;
    }
    }
    break forest_join_475;
    }
    if (!((p0 != null))) {
        break forest_join_475;
    }
    life8_473 = __call442_164(__call442_163(__fieldRead442_161(receiver), __fieldRead442_162(p0)));
    __call442_173(__fieldRead442_166(__fieldRead442_165(receiver)), life8_473, (((__fieldRead442_167(p0) - __call442_170(__fieldRead442_169(__fieldRead442_168(receiver)))) + __invokedynamic442_171(28576, (7959522885135306618L ^ life5_3))) + __invokedynamic442_172(18772, (6158568349561923978L ^ life5_3))));
    }
    return;
}
public static void h442_0(moom.Oo p0) throws Throwable {
    throw __call3044200_0(p0);
}
public static void h442_1(moom.Oo p0) throws Throwable {
    throw __call3044201_0(p0);
}
public static void h442_2(moom.Oo p0) throws Throwable {
    throw __call3044202_0(p0);
}
public static void h442_3(moom.Oo p0) throws Throwable {
    throw __call3044203_0(p0);
}
public static void h442_4(moom.Oo p0) throws Throwable {
    throw __call3044204_0(p0);
}
public static void h442_5(moom.Oo p0) throws Throwable {
    throw __call3044205_0(p0);
}
public static void h442_6(moom.Oo p0) throws Throwable {
    throw __call3044206_0(p0);
}
public static void h442_7(moom.Oo p0) throws Throwable {
    throw __call3044207_0(p0);
}
public static void h442_8(moom.Oo p0) throws Throwable {
    throw __call3044208_0(p0);
}
public static void h442_9(moom.Oo p0) throws Throwable {
    throw __call3044209_0(p0);
}
public static void h442_10(moom.Oo p0) throws Throwable {
    throw __call3044210_0(p0);
}
public static void h442_11(moom.Oo p0) throws Throwable {
    throw __call3044211_0(p0);
}
public static void h442_12(moom.Oo p0) throws Throwable {
    throw __call3044212_0(p0);
}
public static void h442_13(moom.Oo p0) throws Throwable {
    throw __call3044213_0(p0);
}
public static void h442_14(moom.Oo p0) throws Throwable {
    throw __call3044214_0(p0);
}
public static void h442_15(moom.Oo p0) throws Throwable {
    throw __call3044215_0(p0);
}
public static void h442_16(moom.Oo p0) throws Throwable {
    throw __call3044216_0(p0);
}
public static void h442_17(moom.Oo p0) throws Throwable {
    throw __call3044217_0(p0);
}
public static void h442_18(moom.Oo p0) throws Throwable {
    throw __call3044218_0(p0);
}
public static void h442_19(moom.Oo p0) throws Throwable {
    throw __call3044219_0(p0);
}
public static void h442_20(moom.Oo p0) throws Throwable {
    throw __call3044220_0(p0);
}
public static void h442_21(moom.Oo p0) throws Throwable {
    throw __call3044221_0(p0);
}
public static void h442_22(moom.Oo p0) throws Throwable {
    throw __call3044222_0(p0);
}
public static void h442_23(moom.Oo p0) throws Throwable {
    throw __call3044223_0(p0);
}
public static void h442_24(moom.Oo p0) throws Throwable {
    throw __call3044224_0(p0);
}
public static void h442_25(moom.Oo p0) throws Throwable {
    throw __call3044225_0(p0);
}
public static void h442_26(moom.Oo p0) throws Throwable {
    throw __call3044226_0(p0);
}
public static void h442_27(moom.Oo p0) throws Throwable {
    throw __call3044227_0(p0);
}
public static void h442_28(moom.Oo p0) throws Throwable {
    throw __call3044228_0(p0);
}
public static void h442_29(moom.Oo p0) throws Throwable {
    throw __call3044229_0(p0);
}
public static void h442_30(moom.Oo p0) throws Throwable {
    throw __call3044230_0(p0);
}
public static void h442_31(moom.Oo p0) throws Throwable {
    throw __call3044231_0(p0);
}
public static void h442_32(moom.Oo p0) throws Throwable {
    throw __call3044232_0(p0);
}
public static void h442_33(moom.Oo p0) throws Throwable {
    throw __call3044233_0(p0);
}
public static void h442_34(moom.Oo p0) throws Throwable {
    throw __call3044234_0(p0);
}
public static void h442_35(moom.Oo p0) throws Throwable {
    throw __call3044235_0(p0);
}
public static void h442_36(moom.Oo p0) throws Throwable {
    throw __call3044236_0(p0);
}
private static native long __fieldRead442_0() throws Throwable;
private static native void __fieldWrite442_1(moom.ht a0, int a1) throws Throwable;
private static native int __invokedynamic442_2(int a0, long a1) throws Throwable;
private static native int __fieldRead442_3() throws Throwable;
private static native net.minecraft.creativetab.CreativeTabs __fieldRead442_4() throws Throwable;
private static native int __call442_5(net.minecraft.creativetab.CreativeTabs a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead442_6(moom.ht a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead442_7(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.entity.player.InventoryPlayer __fieldRead442_8(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call442_9(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead442_10(moom.ht a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead442_11(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call442_12(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native net.minecraft.entity.item.EntityItem __call442_13(net.minecraft.client.entity.EntityPlayerSP a0, net.minecraft.item.ItemStack a1, int a2) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead442_14(moom.ht a0) throws Throwable;
private static native moom.jI __fieldRead442_15(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call442_16(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native void __call442_17(moom.jI a0, net.minecraft.item.ItemStack a1) throws Throwable;
private static native void __call442_18(net.minecraft.entity.player.InventoryPlayer a0, java.lang.Object a1) throws Throwable;
private static native net.minecraft.item.ItemStack __call442_19(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call442_20(net.minecraft.item.ItemStack a0, int a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead442_21(moom.ht a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead442_22(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.entity.item.EntityItem __call442_23(net.minecraft.client.entity.EntityPlayerSP a0, net.minecraft.item.ItemStack a1, int a2) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead442_24(moom.ht a0) throws Throwable;
private static native moom.jI __fieldRead442_25(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call442_26(moom.jI a0, net.minecraft.item.ItemStack a1) throws Throwable;
private static native net.minecraft.item.ItemStack __call442_27(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native int __fieldRead442_28(net.minecraft.item.ItemStack a0) throws Throwable;
private static native void __call442_29(net.minecraft.entity.player.InventoryPlayer a0, java.lang.Object a1) throws Throwable;
private static native moom.wB __fieldRead442_30(moom.ht a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead442_31(moom.ht a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead442_32(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.v8 __fieldRead442_33(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native java.util.List __call442_34(moom.v8 a0) throws Throwable;
private static native int __call442_35(java.util.List a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead442_36(moom.ht a0) throws Throwable;
private static native moom.jI __fieldRead442_37(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call442_38(moom.jI a0, java.lang.Object a1, int a2) throws Throwable;
private static native int __fieldRead442_39() throws Throwable;
private static native net.minecraft.creativetab.CreativeTabs __fieldRead442_40() throws Throwable;
private static native int __call442_41(net.minecraft.creativetab.CreativeTabs a0) throws Throwable;
private static native moom.wB __fieldRead442_42(moom.ht a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead442_43(moom.ht a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead442_44(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.entity.player.InventoryPlayer __fieldRead442_45(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native void __call442_46(net.minecraft.entity.player.InventoryPlayer a0, java.lang.Object a1) throws Throwable;
private static native boolean __call442_47(moom.wB a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call442_48(moom.wB a0) throws Throwable;
private static native int __call442_49(net.minecraft.item.ItemStack a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call442_50(moom.wB a0, int a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead442_51(moom.ht a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead442_52(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.entity.item.EntityItem __call442_53(net.minecraft.client.entity.EntityPlayerSP a0, net.minecraft.item.ItemStack a1, int a2) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead442_54(moom.ht a0) throws Throwable;
private static native moom.jI __fieldRead442_55(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call442_56(moom.jI a0, net.minecraft.item.ItemStack a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead442_57(moom.ht a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead442_58(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.entity.player.InventoryPlayer __fieldRead442_59(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call442_60(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead442_61(moom.ht a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead442_62(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead442_63(moom.ht a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead442_64(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.entity.player.InventoryPlayer __fieldRead442_65(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call442_66(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native net.minecraft.entity.item.EntityItem __call442_67(net.minecraft.client.entity.EntityPlayerSP a0, net.minecraft.item.ItemStack a1, int a2) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead442_68(moom.ht a0) throws Throwable;
private static native moom.jI __fieldRead442_69(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead442_70(moom.ht a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead442_71(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.entity.player.InventoryPlayer __fieldRead442_72(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call442_73(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native void __call442_74(moom.jI a0, net.minecraft.item.ItemStack a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead442_75(moom.ht a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead442_76(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.entity.player.InventoryPlayer __fieldRead442_77(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native void __call442_78(net.minecraft.entity.player.InventoryPlayer a0, java.lang.Object a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead442_79(moom.ht a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead442_80(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.v8 __fieldRead442_81(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native moom.wC __cast442_82(moom.wB a0) throws Throwable;
private static native moom.wB __fieldRead442_83(moom.wC a0) throws Throwable;
private static native int __fieldRead442_84(moom.wB a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead442_85(moom.ht a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead442_86(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call442_87(moom.v8 a0, int a1, int a2, int a3, net.minecraft.client.entity.EntityPlayerSP a4) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead442_88(moom.ht a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead442_89(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.v8 __fieldRead442_90(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native void __call442_91(moom.v8 a0) throws Throwable;
private static native net.minecraft.inventory.IInventory __fieldRead442_92(moom.wB a0) throws Throwable;
private static native moom.wq __fieldRead442_93() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead442_94(moom.ht a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead442_95(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.entity.player.InventoryPlayer __fieldRead442_96(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call442_97(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call442_98(moom.wB a0) throws Throwable;
private static native int __invokedynamic442_99(int a0, long a1) throws Throwable;
private static native net.minecraft.item.ItemStack __call442_100(net.minecraft.item.ItemStack a0) throws Throwable;
private static native int __call442_101(net.minecraft.item.ItemStack a0) throws Throwable;
private static native void __fieldWrite442_102(net.minecraft.item.ItemStack a0, int a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead442_103(moom.ht a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead442_104(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.entity.player.InventoryPlayer __fieldRead442_105(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native void __call442_106(net.minecraft.entity.player.InventoryPlayer a0, int a1, net.minecraft.item.ItemStack a2) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead442_107(moom.ht a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead442_108(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.v8 __fieldRead442_109(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native void __call442_110(moom.v8 a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call442_111(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native boolean __call442_112(moom.wB a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call442_113(moom.wB a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call442_114(net.minecraft.item.ItemStack a0) throws Throwable;
private static native int __call442_115(net.minecraft.item.ItemStack a0) throws Throwable;
private static native void __fieldWrite442_116(net.minecraft.item.ItemStack a0, int a1) throws Throwable;
private static native void __call442_117(net.minecraft.entity.player.InventoryPlayer a0, net.minecraft.item.ItemStack a1) throws Throwable;
private static native net.minecraft.item.ItemStack __call442_118(net.minecraft.item.ItemStack a0) throws Throwable;
private static native int __call442_119(net.minecraft.item.ItemStack a0) throws Throwable;
private static native void __fieldWrite442_120(net.minecraft.item.ItemStack a0, int a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead442_121(moom.ht a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead442_122(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.entity.item.EntityItem __call442_123(net.minecraft.client.entity.EntityPlayerSP a0, net.minecraft.item.ItemStack a1, int a2) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead442_124(moom.ht a0) throws Throwable;
private static native moom.jI __fieldRead442_125(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call442_126(moom.jI a0, net.minecraft.item.ItemStack a1) throws Throwable;
private static native boolean __call442_127(net.minecraft.item.ItemStack a0, net.minecraft.item.ItemStack a1) throws Throwable;
private static native int __call442_128(net.minecraft.item.ItemStack a0) throws Throwable;
private static native void __fieldWrite442_129(net.minecraft.item.ItemStack a0, int a1) throws Throwable;
private static native int __fieldRead442_130(net.minecraft.item.ItemStack a0) throws Throwable;
private static native int __call442_131(net.minecraft.item.ItemStack a0) throws Throwable;
private static native int __fieldRead442_133(net.minecraft.item.ItemStack a0) throws Throwable;
private static native void __fieldWrite442_134(net.minecraft.item.ItemStack a0, int a1) throws Throwable;
private static native int __fieldRead442_135(net.minecraft.item.ItemStack a0) throws Throwable;
private static native void __call442_136(net.minecraft.entity.player.InventoryPlayer a0, java.lang.Object a1) throws Throwable;
private static native int __fieldRead442_138(net.minecraft.item.ItemStack a0) throws Throwable;
private static native void __fieldWrite442_139(net.minecraft.item.ItemStack a0, int a1) throws Throwable;
private static native net.minecraft.item.ItemStack __call442_140(net.minecraft.item.ItemStack a0) throws Throwable;
private static native void __call442_141(net.minecraft.entity.player.InventoryPlayer a0, net.minecraft.item.ItemStack a1) throws Throwable;
private static native net.minecraft.item.ItemStack __call442_142(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native int __call442_143(net.minecraft.item.ItemStack a0) throws Throwable;
private static native void __fieldWrite442_144(net.minecraft.item.ItemStack a0, int a1) throws Throwable;
private static native void __call442_145(net.minecraft.entity.player.InventoryPlayer a0, java.lang.Object a1) throws Throwable;
private static native moom.v8 __fieldRead442_146(moom.ht a0) throws Throwable;
private static native int __fieldRead442_147(moom.wB a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead442_148(moom.ht a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead442_149(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call442_150(moom.v8 a0, int a1, int a2, int a3, net.minecraft.client.entity.EntityPlayerSP a4) throws Throwable;
private static native int __call442_151(int a0) throws Throwable;
private static native int __invokedynamic442_152(int a0, long a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead442_153(moom.ht a0) throws Throwable;
private static native moom.jI __fieldRead442_154(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.v8 __fieldRead442_155(moom.ht a0) throws Throwable;
private static native int __invokedynamic442_156(int a0, long a1) throws Throwable;
private static native moom.wB __call442_157(moom.v8 a0, int a1) throws Throwable;
private static native net.minecraft.item.ItemStack __call442_158(moom.wB a0) throws Throwable;
private static native int __invokedynamic442_159(int a0, long a1) throws Throwable;
private static native void __call442_160(moom.jI a0, net.minecraft.item.ItemStack a1, int a2) throws Throwable;
private static native moom.v8 __fieldRead442_161(moom.ht a0) throws Throwable;
private static native int __fieldRead442_162(moom.wB a0) throws Throwable;
private static native moom.wB __call442_163(moom.v8 a0, int a1) throws Throwable;
private static native net.minecraft.item.ItemStack __call442_164(moom.wB a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead442_165(moom.ht a0) throws Throwable;
private static native moom.jI __fieldRead442_166(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __fieldRead442_167(moom.wB a0) throws Throwable;
private static native moom.v8 __fieldRead442_168(moom.ht a0) throws Throwable;
private static native java.util.List __fieldRead442_169(moom.v8 a0) throws Throwable;
private static native int __call442_170(java.util.List a0) throws Throwable;
private static native int __invokedynamic442_171(int a0, long a1) throws Throwable;
private static native int __invokedynamic442_172(int a0, long a1) throws Throwable;
private static native void __call442_173(moom.jI a0, net.minecraft.item.ItemStack a1, int a2) throws Throwable;
private static native java.lang.Exception __call3044200_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3044201_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3044202_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3044203_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3044204_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3044205_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3044206_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3044207_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3044208_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3044209_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3044210_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3044211_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3044212_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3044213_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3044214_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3044215_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3044216_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3044217_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3044218_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3044219_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3044220_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3044221_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3044222_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3044223_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3044224_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3044225_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3044226_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3044227_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3044228_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3044229_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3044230_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3044231_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3044232_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3044233_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3044234_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3044235_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3044236_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_e349000015b5bafb965f(moom.ht a0, net.minecraft.creativetab.CreativeTabs a1) throws E;
private static final class __SourceHandler_e349000015b5bafb965f {

public static void f1060(moom.ht receiver, net.minecraft.creativetab.CreativeTabs p0) throws Throwable {
    long life2_3;
    int life4_5;
    moom.v9 life5_12;
    moom.v8 life6_30;
    int life7_45;
    moom.wC life8_60;
    int life9_82;
    int life10_86;
    int life11_90;
    int life9_159;
    int life10_167;
    int life11_175;
    lexical_join_284: {
    lexical_join_272: {
    lexical_join_247: {
    lexical_join_236: {
    lexical_join_212: {
    lexical_join_38: {
    life2_3 = (__fieldRead1060_0() ^ 70487288603570L);
    life4_5 = __fieldRead1060_1();
    __fieldWrite1060_3(__call1060_2(p0));
    life5_12 = __cast1060_5(__fieldRead1060_4(receiver));
    __call1060_7(__fieldRead1060_6(receiver));
    __call1060_9(__fieldRead1060_8(life5_12));
    __call1060_11(p0, __fieldRead1060_10(life5_12));
    if (!((p0 == __fieldRead1060_12()))) {
        break lexical_join_236;
    }
    life6_30 = __fieldRead1060_15(__fieldRead1060_14(__fieldRead1060_13(receiver)));
    if (!((__fieldRead1060_16(receiver) == null))) {
        break lexical_join_38;
    }
    __fieldWrite1060_18(receiver, __fieldRead1060_17(life5_12));
    }
    __fieldWrite1060_20(life5_12, __call1060_19());
    life7_45 = 0;
    lexical_cycle_43: while (true) {
    lexical_join_210: {
    lexical_join_195: {
    lexical_join_136: {
    lexical_join_116: {
    if (!((life7_45 < __call1060_22(__fieldRead1060_21(life6_30))))) {
        break lexical_join_212;
    }
    life8_60 = new moom.wC(__cast1060_25(__call1060_24(__fieldRead1060_23(life6_30), life7_45)), life7_45);
    __call1060_27(__fieldRead1060_26(life5_12), life8_60);
    if (!((life7_45 >= 5))) {
        break lexical_join_116;
    }
    if (!((life7_45 < __invokedynamic1060_28(28576, (7959456795740027971L ^ life2_3))))) {
        break lexical_join_116;
    }
    life9_82 = (life7_45 - 5);
    life10_86 = (life9_82 / 2);
    life11_90 = (life9_82 % 2);
    __fieldWrite1060_31(life8_60, (__invokedynamic1060_29(28576, (7959456795740027971L ^ life2_3)) + (life10_86 * __invokedynamic1060_30(7294, (6439461264207859631L ^ life2_3)))));
    __fieldWrite1060_34(life8_60, (__invokedynamic1060_32(22317, (2296667741155263681L ^ life2_3)) + (life11_90 * __invokedynamic1060_33(14227, (4478580348798067821L ^ life2_3)))));
    break lexical_join_210;
    }
    if (!((life7_45 >= 0))) {
        break lexical_join_136;
    }
    if (!((life7_45 < 5))) {
        break lexical_join_136;
    }
    __fieldWrite1060_36(life8_60, __invokedynamic1060_35(17934, (69641058896778704L ^ life2_3)));
    __fieldWrite1060_38(life8_60, __invokedynamic1060_37(28546, (8392109103537831025L ^ life2_3)));
    break lexical_join_210;
    }
    if (!((life7_45 < __call1060_40(__fieldRead1060_39(life6_30))))) {
        break lexical_join_210;
    }
    life9_159 = (life7_45 - __invokedynamic1060_41(28576, (7959456795740027971L ^ life2_3)));
    life10_167 = (life9_159 % __invokedynamic1060_42(28576, (7959456795740027971L ^ life2_3)));
    life11_175 = (life9_159 / __invokedynamic1060_43(28576, (7959456795740027971L ^ life2_3)));
    __fieldWrite1060_46(life8_60, (__invokedynamic1060_44(28576, (7959456795740027971L ^ life2_3)) + (life10_167 * __invokedynamic1060_45(27617, (5244081475255121921L ^ life2_3)))));
    if (!((life7_45 >= __invokedynamic1060_47(18772, (6158652032252648115L ^ life2_3))))) {
        break lexical_join_195;
    }
    __fieldWrite1060_49(life8_60, __invokedynamic1060_48(26617, (5995273598897468463L ^ life2_3)));
    break lexical_join_210;
    }
    __fieldWrite1060_52(life8_60, (__invokedynamic1060_50(25750, (8036972934956234575L ^ life2_3)) + (life11_175 * __invokedynamic1060_51(27617, (5244081475255121921L ^ life2_3)))));
    }
    life7_45 += 1;
    continue lexical_cycle_43;
    }
    }
    __fieldWrite1060_56(receiver, new moom.wB(__fieldRead1060_53(), 0, __invokedynamic1060_54(1400, (6225268294715561607L ^ life2_3)), __invokedynamic1060_55(26617, (5995273598897468463L ^ life2_3))));
    __call1060_59(__fieldRead1060_57(life5_12), __fieldRead1060_58(receiver));
    break lexical_join_247;
    }
    if (!((life4_5 == __call1060_61(__fieldRead1060_60())))) {
        break lexical_join_247;
    }
    __fieldWrite1060_63(life5_12, __fieldRead1060_62(receiver));
    __fieldWrite1060_64(receiver, null);
    }
    if (!((__fieldRead1060_65(receiver) != null))) {
        break lexical_join_284;
    }
    if (!((p0 == __fieldRead1060_66()))) {
        break lexical_join_272;
    }
    __call1060_68(__fieldRead1060_67(receiver), 1);
    __call1060_70(__fieldRead1060_69(receiver), 0);
    __call1060_72(__fieldRead1060_71(receiver), 1);
    __call1060_74(__fieldRead1060_73(receiver), "");
    __call1060_75(receiver);
    break lexical_join_284;
    }
    __call1060_77(__fieldRead1060_76(receiver), 0);
    __call1060_79(__fieldRead1060_78(receiver), 1);
    __call1060_81(__fieldRead1060_80(receiver), 0);
    }
    __fieldWrite1060_82(receiver, 0x0.0p0f);
    __call1060_83(life5_12, 0x0.0p0f);
    return;
}
public static void h1060_0(moom.Oo p0) throws Throwable {
    throw __call1106000_0(p0);
}
public static void h1060_1(moom.Oo p0) throws Throwable {
    throw __call1106001_0(p0);
}
public static void h1060_2(moom.Oo p0) throws Throwable {
    throw __call1106002_0(p0);
}
public static void h1060_3(moom.Oo p0) throws Throwable {
    throw __call1106003_0(p0);
}
public static void h1060_4(moom.Oo p0) throws Throwable {
    throw __call1106004_0(p0);
}
public static void h1060_5(moom.Oo p0) throws Throwable {
    throw __call1106005_0(p0);
}
public static void h1060_6(moom.Oo p0) throws Throwable {
    throw __call1106006_0(p0);
}
public static void h1060_7(moom.Oo p0) throws Throwable {
    throw __call1106007_0(p0);
}
private static native long __fieldRead1060_0() throws Throwable;
private static native int __fieldRead1060_1() throws Throwable;
private static native int __call1060_2(net.minecraft.creativetab.CreativeTabs a0) throws Throwable;
private static native void __fieldWrite1060_3(int a0) throws Throwable;
private static native moom.v8 __fieldRead1060_4(moom.ht a0) throws Throwable;
private static native moom.v9 __cast1060_5(moom.v8 a0) throws Throwable;
private static native java.util.Set __fieldRead1060_6(moom.ht a0) throws Throwable;
private static native void __call1060_7(java.util.Set a0) throws Throwable;
private static native java.util.List __fieldRead1060_8(moom.v9 a0) throws Throwable;
private static native void __call1060_9(java.util.List a0) throws Throwable;
private static native java.util.List __fieldRead1060_10(moom.v9 a0) throws Throwable;
private static native void __call1060_11(net.minecraft.creativetab.CreativeTabs a0, java.util.List a1) throws Throwable;
private static native net.minecraft.creativetab.CreativeTabs __fieldRead1060_12() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1060_13(moom.ht a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead1060_14(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.v8 __fieldRead1060_15(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native java.util.List __fieldRead1060_16(moom.ht a0) throws Throwable;
private static native java.util.List __fieldRead1060_17(moom.v9 a0) throws Throwable;
private static native void __fieldWrite1060_18(moom.ht a0, java.util.List a1) throws Throwable;
private static native java.util.ArrayList __call1060_19() throws Throwable;
private static native void __fieldWrite1060_20(moom.v9 a0, java.util.ArrayList a1) throws Throwable;
private static native java.util.List __fieldRead1060_21(moom.v8 a0) throws Throwable;
private static native int __call1060_22(java.util.List a0) throws Throwable;
private static native java.util.List __fieldRead1060_23(moom.v8 a0) throws Throwable;
private static native java.lang.Object __call1060_24(java.util.List a0, int a1) throws Throwable;
private static native moom.wB __cast1060_25(java.lang.Object a0) throws Throwable;
private static native java.util.List __fieldRead1060_26(moom.v9 a0) throws Throwable;
private static native boolean __call1060_27(java.util.List a0, moom.wC a1) throws Throwable;
private static native int __invokedynamic1060_28(int a0, long a1) throws Throwable;
private static native int __invokedynamic1060_29(int a0, long a1) throws Throwable;
private static native int __invokedynamic1060_30(int a0, long a1) throws Throwable;
private static native void __fieldWrite1060_31(moom.wC a0, int a1) throws Throwable;
private static native int __invokedynamic1060_32(int a0, long a1) throws Throwable;
private static native int __invokedynamic1060_33(int a0, long a1) throws Throwable;
private static native void __fieldWrite1060_34(moom.wC a0, int a1) throws Throwable;
private static native int __invokedynamic1060_35(int a0, long a1) throws Throwable;
private static native void __fieldWrite1060_36(moom.wC a0, int a1) throws Throwable;
private static native int __invokedynamic1060_37(int a0, long a1) throws Throwable;
private static native void __fieldWrite1060_38(moom.wC a0, int a1) throws Throwable;
private static native java.util.List __fieldRead1060_39(moom.v8 a0) throws Throwable;
private static native int __call1060_40(java.util.List a0) throws Throwable;
private static native int __invokedynamic1060_41(int a0, long a1) throws Throwable;
private static native int __invokedynamic1060_42(int a0, long a1) throws Throwable;
private static native int __invokedynamic1060_43(int a0, long a1) throws Throwable;
private static native int __invokedynamic1060_44(int a0, long a1) throws Throwable;
private static native int __invokedynamic1060_45(int a0, long a1) throws Throwable;
private static native void __fieldWrite1060_46(moom.wC a0, int a1) throws Throwable;
private static native int __invokedynamic1060_47(int a0, long a1) throws Throwable;
private static native int __invokedynamic1060_48(int a0, long a1) throws Throwable;
private static native void __fieldWrite1060_49(moom.wC a0, int a1) throws Throwable;
private static native int __invokedynamic1060_50(int a0, long a1) throws Throwable;
private static native int __invokedynamic1060_51(int a0, long a1) throws Throwable;
private static native void __fieldWrite1060_52(moom.wC a0, int a1) throws Throwable;
private static native moom.wq __fieldRead1060_53() throws Throwable;
private static native int __invokedynamic1060_54(int a0, long a1) throws Throwable;
private static native int __invokedynamic1060_55(int a0, long a1) throws Throwable;
private static native void __fieldWrite1060_56(moom.ht a0, moom.wB a1) throws Throwable;
private static native java.util.List __fieldRead1060_57(moom.v9 a0) throws Throwable;
private static native moom.wB __fieldRead1060_58(moom.ht a0) throws Throwable;
private static native boolean __call1060_59(java.util.List a0, moom.wB a1) throws Throwable;
private static native net.minecraft.creativetab.CreativeTabs __fieldRead1060_60() throws Throwable;
private static native int __call1060_61(net.minecraft.creativetab.CreativeTabs a0) throws Throwable;
private static native java.util.List __fieldRead1060_62(moom.ht a0) throws Throwable;
private static native void __fieldWrite1060_63(moom.v9 a0, java.util.List a1) throws Throwable;
private static native void __fieldWrite1060_64(moom.ht a0, java.lang.Object a1) throws Throwable;
private static native moom.hJ __fieldRead1060_65(moom.ht a0) throws Throwable;
private static native net.minecraft.creativetab.CreativeTabs __fieldRead1060_66() throws Throwable;
private static native moom.hJ __fieldRead1060_67(moom.ht a0) throws Throwable;
private static native void __call1060_68(moom.hJ a0, int a1) throws Throwable;
private static native moom.hJ __fieldRead1060_69(moom.ht a0) throws Throwable;
private static native void __call1060_70(moom.hJ a0, int a1) throws Throwable;
private static native moom.hJ __fieldRead1060_71(moom.ht a0) throws Throwable;
private static native void __call1060_72(moom.hJ a0, int a1) throws Throwable;
private static native moom.hJ __fieldRead1060_73(moom.ht a0) throws Throwable;
private static native void __call1060_74(moom.hJ a0, java.lang.String a1) throws Throwable;
private static native void __call1060_75(moom.ht a0) throws Throwable;
private static native moom.hJ __fieldRead1060_76(moom.ht a0) throws Throwable;
private static native void __call1060_77(moom.hJ a0, int a1) throws Throwable;
private static native moom.hJ __fieldRead1060_78(moom.ht a0) throws Throwable;
private static native void __call1060_79(moom.hJ a0, int a1) throws Throwable;
private static native moom.hJ __fieldRead1060_80(moom.ht a0) throws Throwable;
private static native void __call1060_81(moom.hJ a0, int a1) throws Throwable;
private static native void __fieldWrite1060_82(moom.ht a0, float a1) throws Throwable;
private static native void __call1060_83(moom.v9 a0, float a1) throws Throwable;
private static native java.lang.Exception __call1106000_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1106001_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1106002_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1106003_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1106004_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1106005_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1106006_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1106007_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_f0731ddcd40ab666ca7a(moom.ht a0, net.minecraft.creativetab.CreativeTabs a1, int a2, int a3) throws E;
private static final class __SourceHandler_f0731ddcd40ab666ca7a {

public static boolean f1061(moom.ht receiver, net.minecraft.creativetab.CreativeTabs p0, int p1, int p2) throws Throwable {
    int forwardValue1061_82_0;
    long life4_3;
    int life6_6;
    int life7_14;
    int life8_16;
    int life8_48;
    forward_join_82: {
    forward_join_81: {
    forward_join_55: {
    forward_join_50: {
    forward_join_38: {
    forward_join_32: {
    life4_3 = (__fieldRead1061_0() ^ 17959845095137L);
    life6_6 = __call1061_1(p0);
    life7_14 = (__invokedynamic1061_2(14756, (8902575284467527445L ^ life4_3)) * life6_6);
    life8_16 = 0;
    if (!((life6_6 == 5))) {
        break forward_join_32;
    }
    life7_14 = ((__fieldRead1061_3(receiver) - __invokedynamic1061_4(29556, (2880201833508939217L ^ life4_3))) + 2);
    break forward_join_38;
    }
    if (!((life6_6 > 0))) {
        break forward_join_38;
    }
    life7_14 = (life7_14 + life6_6);
    }
    if (!(__call1061_5(p0))) {
        break forward_join_50;
    }
    life8_48 = (life8_16 - __invokedynamic1061_6(11165, (398164076164087069L ^ life4_3)));
    break forward_join_55;
    }
    life8_48 = (life8_16 + __fieldRead1061_7(receiver));
    }
    if (!((p1 >= life7_14))) {
        break forward_join_81;
    }
    if (!((p1 <= (life7_14 + __invokedynamic1061_8(29556, (2880201833508939217L ^ life4_3)))))) {
        break forward_join_81;
    }
    if (!((p2 >= life8_48))) {
        break forward_join_81;
    }
    if (!((p2 <= (life8_48 + __invokedynamic1061_9(27936, (6817704934858963854L ^ life4_3)))))) {
        break forward_join_81;
    }
    forwardValue1061_82_0 = 1;
    break forward_join_82;
    }
    forwardValue1061_82_0 = 0;
    }
    return __integerCategory1061_10(forwardValue1061_82_0);
}
public static void h1061_0(moom.Oo p0) throws Throwable {
    throw __call1106100_0(p0);
}
public static void h1061_1(moom.Oo p0) throws Throwable {
    throw __call1106101_0(p0);
}
public static void h1061_2(moom.Oo p0) throws Throwable {
    throw __call1106102_0(p0);
}
public static void h1061_3(moom.Oo p0) throws Throwable {
    throw __call1106103_0(p0);
}
private static native long __fieldRead1061_0() throws Throwable;
private static native int __call1061_1(net.minecraft.creativetab.CreativeTabs a0) throws Throwable;
private static native int __invokedynamic1061_2(int a0, long a1) throws Throwable;
private static native int __fieldRead1061_3(moom.ht a0) throws Throwable;
private static native int __invokedynamic1061_4(int a0, long a1) throws Throwable;
private static native boolean __call1061_5(net.minecraft.creativetab.CreativeTabs a0) throws Throwable;
private static native int __invokedynamic1061_6(int a0, long a1) throws Throwable;
private static native int __fieldRead1061_7(moom.ht a0) throws Throwable;
private static native int __invokedynamic1061_8(int a0, long a1) throws Throwable;
private static native int __invokedynamic1061_9(int a0, long a1) throws Throwable;
private static native boolean __integerCategory1061_10(int value) throws Throwable;
private static native java.lang.Exception __call1106100_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1106101_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1106102_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1106103_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_78cdd63c1b0531c9aaa5(moom.ht a0, net.minecraft.item.ItemStack a1, int a2, int a3) throws E;
private static final class __SourceHandler_78cdd63c1b0531c9aaa5 {

public static void f1797(moom.ht receiver, net.minecraft.item.ItemStack p0, int p1, int p2) throws Throwable {
    java.util.List life4_13;
    net.minecraft.creativetab.CreativeTabs life5_17;
    java.util.Map life6_29;
    net.minecraft.enchantment.Enchantment life7_41;
    net.minecraft.creativetab.CreativeTabs[] life8_43;
    int life9_46;
    int life10_48;
    net.minecraft.creativetab.CreativeTabs life11_55;
    int life6_83;
    if ((__fieldRead1797_0() == __call1797_2(__fieldRead1797_1()))) {
        life4_13 = __call1797_8(p0, __fieldRead1797_4(__fieldRead1797_3(receiver)), __fieldRead1797_7(__fieldRead1797_6(__fieldRead1797_5(receiver))));
        life5_17 = __call1797_10(__call1797_9(p0));
        if ((life5_17 == null)) {
        if ((__call1797_11(p0) == __fieldRead1797_12())) {
        life6_29 = __call1797_13(p0);
        if ((__call1797_14(life6_29) == 1)) {
        life7_41 = __call1797_20(__call1797_19(__cast1797_18(__call1797_17(__call1797_16(__call1797_15(life6_29))))));
        life8_43 = __fieldRead1797_21();
        life9_46 = (life8_43).length;
        life10_48 = 0;
        loop_region_46: while ((life10_48 < life9_46)) {
        life11_55 = (life8_43)[life10_48];
        if (__call1797_23(life11_55, __fieldRead1797_22(life7_41))) {
        life5_17 = life11_55;
        break loop_region_46;
    }
        life10_48 += 1;
    }
    }
    }
    }
        if ((life5_17 != null)) {
        __call1797_29(life4_13, 1, __invokedynamic1797_28(__fieldRead1797_24(), __fieldRead1797_25(), __call1797_27(__call1797_26(life5_17), new java.lang.Object[0])));
    }
        life6_83 = 0;
        loop_region_78: while ((life6_83 < __call1797_30(life4_13))) {
        if ((life6_83 == 0)) {
        __call1797_36(life4_13, life6_83, __invokedynamic1797_35(__fieldRead1797_32(__call1797_31(p0)), __cast1797_34(__call1797_33(life4_13, life6_83))));
    } else {
        __call1797_41(life4_13, life6_83, __invokedynamic1797_40(__fieldRead1797_37(), __cast1797_39(__call1797_38(life4_13, life6_83))));
    }
        life6_83 += 1;
    }
        __call1797_42(receiver, life4_13, p1, p2);
    } else {
        __call1797_43(receiver, p0, p1, p2);
    }
    return;
}
public static void h1797_0(moom.Oo p0) throws Throwable {
    throw __call1179700_0(p0);
}
public static void h1797_1(moom.Oo p0) throws Throwable {
    throw __call1179701_0(p0);
}
public static void h1797_2(moom.Oo p0) throws Throwable {
    throw __call1179702_0(p0);
}
public static void h1797_3(moom.Oo p0) throws Throwable {
    throw __call1179703_0(p0);
}
private static native int __fieldRead1797_0() throws Throwable;
private static native net.minecraft.creativetab.CreativeTabs __fieldRead1797_1() throws Throwable;
private static native int __call1797_2(net.minecraft.creativetab.CreativeTabs a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1797_3(moom.ht a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead1797_4(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1797_5(moom.ht a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead1797_6(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __fieldRead1797_7(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native java.util.List __call1797_8(net.minecraft.item.ItemStack a0, net.minecraft.client.entity.EntityPlayerSP a1, boolean a2) throws Throwable;
private static native net.minecraft.item.Item __call1797_9(net.minecraft.item.ItemStack a0) throws Throwable;
private static native net.minecraft.creativetab.CreativeTabs __call1797_10(net.minecraft.item.Item a0) throws Throwable;
private static native net.minecraft.item.Item __call1797_11(net.minecraft.item.ItemStack a0) throws Throwable;
private static native moom.xg __fieldRead1797_12() throws Throwable;
private static native java.util.Map __call1797_13(net.minecraft.item.ItemStack a0) throws Throwable;
private static native int __call1797_14(java.util.Map a0) throws Throwable;
private static native java.util.Set __call1797_15(java.util.Map a0) throws Throwable;
private static native java.util.Iterator __call1797_16(java.util.Set a0) throws Throwable;
private static native java.lang.Object __call1797_17(java.util.Iterator a0) throws Throwable;
private static native java.lang.Integer __cast1797_18(java.lang.Object a0) throws Throwable;
private static native int __call1797_19(java.lang.Integer a0) throws Throwable;
private static native net.minecraft.enchantment.Enchantment __call1797_20(int a0) throws Throwable;
private static native net.minecraft.creativetab.CreativeTabs[] __fieldRead1797_21() throws Throwable;
private static native net.minecraft.enchantment.EnumEnchantmentType __fieldRead1797_22(net.minecraft.enchantment.Enchantment a0) throws Throwable;
private static native boolean __call1797_23(net.minecraft.creativetab.CreativeTabs a0, net.minecraft.enchantment.EnumEnchantmentType a1) throws Throwable;
private static native net.minecraft.util.EnumChatFormatting __fieldRead1797_24() throws Throwable;
private static native net.minecraft.util.EnumChatFormatting __fieldRead1797_25() throws Throwable;
private static native java.lang.String __call1797_26(net.minecraft.creativetab.CreativeTabs a0) throws Throwable;
private static native java.lang.String __call1797_27(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native java.lang.String __invokedynamic1797_28(net.minecraft.util.EnumChatFormatting a0, net.minecraft.util.EnumChatFormatting a1, java.lang.String a2) throws Throwable;
private static native void __call1797_29(java.util.List a0, int a1, java.lang.String a2) throws Throwable;
private static native int __call1797_30(java.util.List a0) throws Throwable;
private static native net.minecraft.item.EnumRarity __call1797_31(net.minecraft.item.ItemStack a0) throws Throwable;
private static native net.minecraft.util.EnumChatFormatting __fieldRead1797_32(net.minecraft.item.EnumRarity a0) throws Throwable;
private static native java.lang.Object __call1797_33(java.util.List a0, int a1) throws Throwable;
private static native java.lang.String __cast1797_34(java.lang.Object a0) throws Throwable;
private static native java.lang.String __invokedynamic1797_35(net.minecraft.util.EnumChatFormatting a0, java.lang.String a1) throws Throwable;
private static native java.lang.Object __call1797_36(java.util.List a0, int a1, java.lang.String a2) throws Throwable;
private static native net.minecraft.util.EnumChatFormatting __fieldRead1797_37() throws Throwable;
private static native java.lang.Object __call1797_38(java.util.List a0, int a1) throws Throwable;
private static native java.lang.String __cast1797_39(java.lang.Object a0) throws Throwable;
private static native java.lang.String __invokedynamic1797_40(net.minecraft.util.EnumChatFormatting a0, java.lang.String a1) throws Throwable;
private static native java.lang.Object __call1797_41(java.util.List a0, int a1, java.lang.String a2) throws Throwable;
private static native void __call1797_42(moom.ht a0, java.util.List a1, int a2, int a3) throws Throwable;
private static native void __call1797_43(moom.ht a0, net.minecraft.item.ItemStack a1, int a2, int a3) throws Throwable;
private static native java.lang.Exception __call1179700_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1179701_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1179702_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1179703_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_e3fde0a8c995457c0c54(moom.ht a0) throws E;
private static final class __SourceHandler_e3fde0a8c995457c0c54 {

public static void f1798(moom.ht receiver) throws Throwable {
    long life1_3;
    int life3_6;
    life1_3 = (__fieldRead1798_0() ^ 41211554528805L);
    life3_6 = __fieldRead1798_1(receiver);
    __call1798_2(receiver);
    if ((__fieldRead1798_3(receiver) != null)) {
        if ((__fieldRead1798_4(receiver) != life3_6)) {
        __fieldWrite1798_8(__fieldRead1798_5(receiver), (__fieldRead1798_6(receiver) + __invokedynamic1798_7(32581, (4010095656924295432L ^ life1_3))));
    }
    }
    return;
}
public static void h1798_0(moom.Oo p0) throws Throwable {
    throw __call1179800_0(p0);
}
public static void h1798_1(moom.Oo p0) throws Throwable {
    throw __call1179801_0(p0);
}
private static native long __fieldRead1798_0() throws Throwable;
private static native int __fieldRead1798_1(moom.ht a0) throws Throwable;
private static native void __call1798_2(moom.ht a0) throws Throwable;
private static native moom.hJ __fieldRead1798_3(moom.ht a0) throws Throwable;
private static native int __fieldRead1798_4(moom.ht a0) throws Throwable;
private static native moom.hJ __fieldRead1798_5(moom.ht a0) throws Throwable;
private static native int __fieldRead1798_6(moom.ht a0) throws Throwable;
private static native int __invokedynamic1798_7(int a0, long a1) throws Throwable;
private static native void __fieldWrite1798_8(moom.hJ a0, int a1) throws Throwable;
private static native java.lang.Exception __call1179800_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1179801_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_c084fe6716265d4fb62c(moom.ht a0, int a1, int a2, int a3) throws E;
private static final class __SourceHandler_c084fe6716265d4fb62c {

public static void f1799(moom.ht receiver, int p0, int p1, int p2) throws Throwable {
    int life4_6;
    int life5_11;
    net.minecraft.creativetab.CreativeTabs[] life6_13;
    int life7_16;
    int life8_18;
    net.minecraft.creativetab.CreativeTabs life9_25;
    if ((p2 == 0)) {
        life4_6 = (p0 - __fieldRead1799_0(receiver));
        life5_11 = (p1 - __fieldRead1799_1(receiver));
        life6_13 = __fieldRead1799_2();
        life7_16 = (life6_13).length;
        life8_18 = 0;
        loop_region_19: while ((life8_18 < life7_16)) {
        life9_25 = (life6_13)[life8_18];
        if (__call1799_3(receiver, life9_25, life4_6, life5_11)) {
        __call1799_4(receiver, life9_25);
        return;
    }
        life8_18 += 1;
    }
    }
    __call1799_5(receiver, p0, p1, p2);
    return;
}
public static void h1799_0(moom.Oo p0) throws Throwable {
    throw __call1179900_0(p0);
}
private static native int __fieldRead1799_0(moom.ht a0) throws Throwable;
private static native int __fieldRead1799_1(moom.ht a0) throws Throwable;
private static native net.minecraft.creativetab.CreativeTabs[] __fieldRead1799_2() throws Throwable;
private static native boolean __call1799_3(moom.ht a0, net.minecraft.creativetab.CreativeTabs a1, int a2, int a3) throws Throwable;
private static native void __call1799_4(moom.ht a0, net.minecraft.creativetab.CreativeTabs a1) throws Throwable;
private static native void __call1799_5(moom.ht a0, int a1, int a2, int a3) throws Throwable;
private static native java.lang.Exception __call1179900_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_ed73f98857c35fb2447c(moom.ht a0, net.minecraft.creativetab.CreativeTabs a1) throws E;
private static final class __SourceHandler_ed73f98857c35fb2447c {

public static void f1800(moom.ht receiver, net.minecraft.creativetab.CreativeTabs p0) throws Throwable {
    long life2_3;
    int life4_13;
    int life5_16;
    int life6_19;
    int life7_27;
    int life8_29;
    int life9_40;
    int life10_44;
    int life11_49;
    int life10_87;
    int life9_124;
    int life10_140;
    net.minecraft.item.ItemStack life12_145;
    life2_3 = (__fieldRead1800_0() ^ 85442151516770L);
    life4_13 = ((__call1800_1(p0) == __fieldRead1800_2()) ? 1 : 0);
    life5_16 = __integerCategory1800_4(__call1800_3(p0));
    life6_19 = __call1800_5(p0);
    life7_27 = (life6_19 * __invokedynamic1800_6(29556, (2880286907831568722L ^ life2_3)));
    life8_29 = 0;
    life9_40 = (__fieldRead1800_7(receiver) + (__invokedynamic1800_8(29556, (2880286907831568722L ^ life2_3)) * life6_19));
    int spill1800_0 = 27936;
    life10_44 = __fieldRead1800_9(receiver);
    life11_49 = __invokedynamic1800_10(spill1800_0, (6817613537767773965L ^ life2_3));
    if ((life4_13 != 0)) {
        life8_29 += 32;
    }
    if ((life6_19 == 5)) {
        life9_40 = ((__fieldRead1800_11(receiver) + __fieldRead1800_12(receiver)) - __invokedynamic1800_13(29556, (2880286907831568722L ^ life2_3)));
    } else {
        if ((life6_19 > 0)) {
        life9_40 = (life9_40 + life6_19);
    }
    }
    if ((life5_16 != 0)) {
        life10_87 = (life10_44 - __invokedynamic1800_14(29556, (2880286907831568722L ^ life2_3)));
    } else {
        life8_29 += 64;
        life10_87 = (life10_44 + (__fieldRead1800_15(receiver) - 4));
    }
    __call1800_16();
    __call1800_18(receiver, life9_40, life10_87, life7_27, life8_29, __invokedynamic1800_17(29556, (2880286907831568722L ^ life2_3)), life11_49);
    __fieldWrite1800_19(receiver, 0x1.9p6f);
    __fieldWrite1800_21(__fieldRead1800_20(receiver), 0x1.9p6f);
    life9_124 = (life9_40 + __invokedynamic1800_22(22317, (2296671477974691089L ^ life2_3)));
    int spill1800_1 = (life10_87 + __invokedynamic1800_23(9385, (3705242455167737510L ^ life2_3)));
    life10_140 = (spill1800_1 + ((life5_16 != 0) ? 1 : -1));
    __call1800_24();
    __call1800_25();
    life12_145 = __call1800_26(p0);
    __call1800_28(__fieldRead1800_27(receiver), life12_145, life9_124, life10_140);
    __call1800_31(__fieldRead1800_29(receiver), __fieldRead1800_30(receiver), life12_145, life9_124, life10_140);
    __call1800_32();
    __fieldWrite1800_34(__fieldRead1800_33(receiver), 0x0.0p0f);
    __fieldWrite1800_35(receiver, 0x0.0p0f);
    return;
}
public static void h1800_0(moom.Oo p0) throws Throwable {
    throw __call1180000_0(p0);
}
public static void h1800_1(moom.Oo p0) throws Throwable {
    throw __call1180001_0(p0);
}
public static void h1800_2(moom.Oo p0) throws Throwable {
    throw __call1180002_0(p0);
}
private static native long __fieldRead1800_0() throws Throwable;
private static native int __call1800_1(net.minecraft.creativetab.CreativeTabs a0) throws Throwable;
private static native int __fieldRead1800_2() throws Throwable;
private static native boolean __call1800_3(net.minecraft.creativetab.CreativeTabs a0) throws Throwable;
private static native int __integerCategory1800_4(boolean value) throws Throwable;
private static native int __call1800_5(net.minecraft.creativetab.CreativeTabs a0) throws Throwable;
private static native int __invokedynamic1800_6(int a0, long a1) throws Throwable;
private static native int __fieldRead1800_7(moom.ht a0) throws Throwable;
private static native int __invokedynamic1800_8(int a0, long a1) throws Throwable;
private static native int __fieldRead1800_9(moom.ht a0) throws Throwable;
private static native int __invokedynamic1800_10(int a0, long a1) throws Throwable;
private static native int __fieldRead1800_11(moom.ht a0) throws Throwable;
private static native int __fieldRead1800_12(moom.ht a0) throws Throwable;
private static native int __invokedynamic1800_13(int a0, long a1) throws Throwable;
private static native int __invokedynamic1800_14(int a0, long a1) throws Throwable;
private static native int __fieldRead1800_15(moom.ht a0) throws Throwable;
private static native void __call1800_16() throws Throwable;
private static native int __invokedynamic1800_17(int a0, long a1) throws Throwable;
private static native void __call1800_18(moom.ht a0, int a1, int a2, int a3, int a4, int a5, int a6) throws Throwable;
private static native void __fieldWrite1800_19(moom.ht a0, float a1) throws Throwable;
private static native net.minecraft.client.renderer.entity.RenderItem __fieldRead1800_20(moom.ht a0) throws Throwable;
private static native void __fieldWrite1800_21(net.minecraft.client.renderer.entity.RenderItem a0, float a1) throws Throwable;
private static native int __invokedynamic1800_22(int a0, long a1) throws Throwable;
private static native int __invokedynamic1800_23(int a0, long a1) throws Throwable;
private static native void __call1800_24() throws Throwable;
private static native void __call1800_25() throws Throwable;
private static native net.minecraft.item.ItemStack __call1800_26(net.minecraft.creativetab.CreativeTabs a0) throws Throwable;
private static native net.minecraft.client.renderer.entity.RenderItem __fieldRead1800_27(moom.ht a0) throws Throwable;
private static native void __call1800_28(net.minecraft.client.renderer.entity.RenderItem a0, net.minecraft.item.ItemStack a1, int a2, int a3) throws Throwable;
private static native net.minecraft.client.renderer.entity.RenderItem __fieldRead1800_29(moom.ht a0) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead1800_30(moom.ht a0) throws Throwable;
private static native void __call1800_31(net.minecraft.client.renderer.entity.RenderItem a0, net.minecraft.client.gui.FontRenderer a1, net.minecraft.item.ItemStack a2, int a3, int a4) throws Throwable;
private static native void __call1800_32() throws Throwable;
private static native net.minecraft.client.renderer.entity.RenderItem __fieldRead1800_33(moom.ht a0) throws Throwable;
private static native void __fieldWrite1800_34(net.minecraft.client.renderer.entity.RenderItem a0, float a1) throws Throwable;
private static native void __fieldWrite1800_35(moom.ht a0, float a1) throws Throwable;
private static native java.lang.Exception __call1180000_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1180001_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1180002_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_f89130c3fc63cd3c005f(moom.ht a0, net.minecraft.creativetab.CreativeTabs a1, int a2, int a3) throws E;
private static final class __SourceHandler_f89130c3fc63cd3c005f {

public static boolean f1801(moom.ht receiver, net.minecraft.creativetab.CreativeTabs p0, int p1, int p2) throws Throwable {
    long life4_3;
    int life6_6;
    int life7_14;
    int life8_16;
    int life8_48;
    life4_3 = (__fieldRead1801_0() ^ 87055684394853L);
    life6_6 = __call1801_1(p0);
    life7_14 = (__invokedynamic1801_2(29556, (2880288589146594389L ^ life4_3)) * life6_6);
    life8_16 = 0;
    if ((life6_6 == 5)) {
        life7_14 = ((__fieldRead1801_3(receiver) - __invokedynamic1801_4(29556, (2880288589146594389L ^ life4_3))) + 2);
    } else {
        if ((life6_6 > 0)) {
        life7_14 = (life7_14 + life6_6);
    }
    }
    if (__call1801_5(p0)) {
        life8_48 = (life8_16 - __invokedynamic1801_6(27936, (6817611993360957962L ^ life4_3)));
    } else {
        life8_48 = (life8_16 + __fieldRead1801_7(receiver));
    }
    if (__call1801_10(receiver, (life7_14 + 3), (life8_48 + 3), __invokedynamic1801_8(11004, (4564174696688076254L ^ life4_3)), __invokedynamic1801_9(2270, (1588395469616801785L ^ life4_3)), p1, p2)) {
        __call1801_13(receiver, __call1801_12(__call1801_11(p0), new java.lang.Object[0]), p1, p2);
        return true;
    }
    return false;
}
public static void h1801_0(moom.Oo p0) throws Throwable {
    throw __call1180100_0(p0);
}
private static native long __fieldRead1801_0() throws Throwable;
private static native int __call1801_1(net.minecraft.creativetab.CreativeTabs a0) throws Throwable;
private static native int __invokedynamic1801_2(int a0, long a1) throws Throwable;
private static native int __fieldRead1801_3(moom.ht a0) throws Throwable;
private static native int __invokedynamic1801_4(int a0, long a1) throws Throwable;
private static native boolean __call1801_5(net.minecraft.creativetab.CreativeTabs a0) throws Throwable;
private static native int __invokedynamic1801_6(int a0, long a1) throws Throwable;
private static native int __fieldRead1801_7(moom.ht a0) throws Throwable;
private static native int __invokedynamic1801_8(int a0, long a1) throws Throwable;
private static native int __invokedynamic1801_9(int a0, long a1) throws Throwable;
private static native boolean __call1801_10(moom.ht a0, int a1, int a2, int a3, int a4, int a5, int a6) throws Throwable;
private static native java.lang.String __call1801_11(net.minecraft.creativetab.CreativeTabs a0) throws Throwable;
private static native java.lang.String __call1801_12(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native void __call1801_13(moom.ht a0, java.lang.String a1, int a2, int a3) throws Throwable;
private static native java.lang.Exception __call1180100_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_efd39d8e12d6c3b0633a(moom.ht a0) throws E;
private static final class __SourceHandler_efd39d8e12d6c3b0633a {

public static void f100114(moom.ht receiver) throws Throwable {
    long life1_3;
    int life3_7;
    int life4_27;
    forest_join_60: {
    forest_join_35: {
    forest_join_31: {
    life1_3 = (__fieldRead100114_0() ^ 103139172047834L);
    __call100114_1(receiver);
    life3_7 = __call100114_2();
    if (!((life3_7 != 0))) {
        break forest_join_60;
    }
    if (!(__call100114_3(receiver))) {
        break forest_join_60;
    }
    life4_27 = ((__call100114_7(__fieldRead100114_6(__cast100114_5(__fieldRead100114_4(receiver)))) / __invokedynamic100114_8(28576, (7959468158817731627L ^ life1_3))) - 5);
    if (!((life3_7 > 0))) {
        break forest_join_31;
    }
    life3_7 = 1;
    }
    if (!((life3_7 < 0))) {
        break forest_join_35;
    }
    life3_7 = -1;
    }
    __fieldWrite100114_10(receiver, ((float) (((double) __fieldRead100114_9(receiver)) - (((double) life3_7) / ((double) life4_27)))));
    __fieldWrite100114_13(receiver, __call100114_12(__fieldRead100114_11(receiver), 0x0.0p0f, 0x1.0p0f));
    __call100114_17(__cast100114_15(__fieldRead100114_14(receiver)), __fieldRead100114_16(receiver));
    }
    return;
}
public static void h100114_0(java.io.IOException p0) throws Throwable {
    throw __call13011400_0(p0);
}
private static native long __fieldRead100114_0() throws Throwable;
private static native void __call100114_1(moom.ht a0) throws Throwable;
private static native int __call100114_2() throws Throwable;
private static native boolean __call100114_3(moom.ht a0) throws Throwable;
private static native moom.v8 __fieldRead100114_4(moom.ht a0) throws Throwable;
private static native moom.v9 __cast100114_5(moom.v8 a0) throws Throwable;
private static native java.util.List __fieldRead100114_6(moom.v9 a0) throws Throwable;
private static native int __call100114_7(java.util.List a0) throws Throwable;
private static native int __invokedynamic100114_8(int a0, long a1) throws Throwable;
private static native float __fieldRead100114_9(moom.ht a0) throws Throwable;
private static native void __fieldWrite100114_10(moom.ht a0, float a1) throws Throwable;
private static native float __fieldRead100114_11(moom.ht a0) throws Throwable;
private static native float __call100114_12(float a0, float a1, float a2) throws Throwable;
private static native void __fieldWrite100114_13(moom.ht a0, float a1) throws Throwable;
private static native moom.v8 __fieldRead100114_14(moom.ht a0) throws Throwable;
private static native moom.v9 __cast100114_15(moom.v8 a0) throws Throwable;
private static native float __fieldRead100114_16(moom.ht a0) throws Throwable;
private static native void __call100114_17(moom.v9 a0, float a1) throws Throwable;
private static native java.lang.Exception __call13011400_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_ca7ec04f5d33dccb7028(moom.ht a0) throws E;
private static final class __SourceHandler_ca7ec04f5d33dccb7028 {

public static boolean f1062(moom.ht receiver) throws Throwable {
    int forwardValue1062_17_0;
    forward_join_17: {
    forward_join_16: {
    if (!((__fieldRead1062_0() != __call1062_2(__fieldRead1062_1())))) {
        break forward_join_16;
    }
    if (!(__call1062_5((__fieldRead1062_3())[__fieldRead1062_4()]))) {
        break forward_join_16;
    }
    if (!(__call1062_8(__cast1062_7(__fieldRead1062_6(receiver))))) {
        break forward_join_16;
    }
    forwardValue1062_17_0 = 1;
    break forward_join_17;
    }
    forwardValue1062_17_0 = 0;
    }
    return __integerCategory1062_9(forwardValue1062_17_0);
}
public static void h1062_0(moom.Oo p0) throws Throwable {
    throw __call1106200_0(p0);
}
public static void h1062_1(moom.Oo p0) throws Throwable {
    throw __call1106201_0(p0);
}
public static void h1062_2(moom.Oo p0) throws Throwable {
    throw __call1106202_0(p0);
}
private static native int __fieldRead1062_0() throws Throwable;
private static native net.minecraft.creativetab.CreativeTabs __fieldRead1062_1() throws Throwable;
private static native int __call1062_2(net.minecraft.creativetab.CreativeTabs a0) throws Throwable;
private static native net.minecraft.creativetab.CreativeTabs[] __fieldRead1062_3() throws Throwable;
private static native int __fieldRead1062_4() throws Throwable;
private static native boolean __call1062_5(net.minecraft.creativetab.CreativeTabs a0) throws Throwable;
private static native moom.v8 __fieldRead1062_6(moom.ht a0) throws Throwable;
private static native moom.v9 __cast1062_7(moom.v8 a0) throws Throwable;
private static native boolean __call1062_8(moom.v9 a0) throws Throwable;
private static native boolean __integerCategory1062_9(int value) throws Throwable;
private static native java.lang.Exception __call1106200_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1106201_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1106202_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_ba7ac1b3782fab4f981d(moom.ht a0) throws E;
private static final class __SourceHandler_ba7ac1b3782fab4f981d {

public static void f100115(moom.ht receiver) throws Throwable {
    forest_join_18: {
    __call100115_0(receiver);
    if (!((__fieldRead100115_2(__fieldRead100115_1(receiver)) != null))) {
        break forest_join_18;
    }
    if (!((__fieldRead100115_5(__fieldRead100115_4(__fieldRead100115_3(receiver))) != null))) {
        break forest_join_18;
    }
    __call100115_10(__fieldRead100115_8(__fieldRead100115_7(__fieldRead100115_6(receiver))), __fieldRead100115_9(receiver));
    }
    __call100115_11(0);
    return;
}
public static void h100115_0(moom.Oo p0) throws Throwable {
    throw __call13011500_0(p0);
}
public static void h100115_1(moom.Oo p0) throws Throwable {
    throw __call13011501_0(p0);
}
private static native void __call100115_0(moom.ht a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead100115_1(moom.ht a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead100115_2(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead100115_3(moom.ht a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead100115_4(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.entity.player.InventoryPlayer __fieldRead100115_5(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead100115_6(moom.ht a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead100115_7(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.v8 __fieldRead100115_8(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native moom.iv __fieldRead100115_9(moom.ht a0) throws Throwable;
private static native void __call100115_10(moom.v8 a0, moom.iv a1) throws Throwable;
private static native void __call100115_11(int a0) throws Throwable;
private static native java.lang.Exception __call13011500_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call13011501_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_19394722f09d35118437(moom.ht a0) throws E;
private static final class __SourceHandler_19394722f09d35118437 {

public static void f443(moom.ht receiver) throws Throwable {
    moom.v9 life1_3;
    java.util.Iterator life2_9;
    net.minecraft.item.Item life3_16;
    net.minecraft.enchantment.Enchantment[] life2_32;
    int life3_35;
    int life4_37;
    net.minecraft.enchantment.Enchantment life5_44;
    java.util.Iterator life2_62;
    java.lang.String life3_67;
    net.minecraft.item.ItemStack life4_74;
    int life5_76;
    java.util.Iterator life6_87;
    java.lang.String life7_94;
    forest_join_106: {
    forest_join_55: {
    forest_join_29: {
    life1_3 = __cast443_1(__fieldRead443_0(receiver));
    __call443_3(__fieldRead443_2(life1_3));
    life2_9 = __call443_5(__fieldRead443_4());
    forest_cycle_10: while (true) {
    forest_join_28: {
    if (!(__call443_6(life2_9))) {
        break forest_join_29;
    }
    life3_16 = __cast443_8(__call443_7(life2_9));
    if (!((life3_16 != null))) {
        break forest_join_28;
    }
    if (!((__call443_9(life3_16) != null))) {
        break forest_join_28;
    }
    __call443_11(life3_16, life3_16, null, __fieldRead443_10(life1_3));
    }
    continue forest_cycle_10;
    }
    }
    life2_32 = __fieldRead443_12();
    life3_35 = (life2_32).length;
    life4_37 = 0;
    forest_cycle_36: while (true) {
    forest_join_53: {
    if (!((life4_37 < life3_35))) {
        break forest_join_55;
    }
    life5_44 = (life2_32)[life4_37];
    if (!((life5_44 != null))) {
        break forest_join_53;
    }
    if (!((__fieldRead443_13(life5_44) != null))) {
        break forest_join_53;
    }
    __call443_16(__fieldRead443_14(), life5_44, __fieldRead443_15(life1_3));
    }
    life4_37 += 1;
    continue forest_cycle_36;
    }
    }
    life2_62 = __call443_18(__fieldRead443_17(life1_3));
    life3_67 = __call443_21(__call443_20(__fieldRead443_19(receiver)));
    forest_cycle_64: while (true) {
    forest_join_105: {
    forest_join_101: {
    forest_join_99: {
    if (!(__call443_22(life2_62))) {
        break forest_join_106;
    }
    life4_74 = __cast443_24(__call443_23(life2_62));
    life5_76 = 0;
    life6_87 = __call443_31(__call443_30(life4_74, __fieldRead443_26(__fieldRead443_25(receiver)), __fieldRead443_29(__fieldRead443_28(__fieldRead443_27(receiver)))));
    forest_cycle_84: while (true) {
    forest_join_98: {
    if (!(__call443_32(life6_87))) {
        break forest_join_101;
    }
    life7_94 = __cast443_34(__call443_33(life6_87));
    if (!(__call443_37(__call443_36(__call443_35(life7_94)), life3_67))) {
        break forest_join_98;
    }
    break forest_join_99;
    }
    continue forest_cycle_84;
    }
    }
    life5_76 = 1;
    }
    if (!((life5_76 == 0))) {
        break forest_join_105;
    }
    __call443_38(life2_62);
    }
    continue forest_cycle_64;
    }
    }
    __fieldWrite443_39(receiver, 0x0.0p0f);
    __call443_40(life1_3, 0x0.0p0f);
    return;
}
public static void h443_0(moom.Oo p0) throws Throwable {
    throw __call3044300_0(p0);
}
public static void h443_1(moom.Oo p0) throws Throwable {
    throw __call3044301_0(p0);
}
public static void h443_2(moom.Oo p0) throws Throwable {
    throw __call3044302_0(p0);
}
public static void h443_3(moom.Oo p0) throws Throwable {
    throw __call3044303_0(p0);
}
public static void h443_4(moom.Oo p0) throws Throwable {
    throw __call3044304_0(p0);
}
private static native moom.v8 __fieldRead443_0(moom.ht a0) throws Throwable;
private static native moom.v9 __cast443_1(moom.v8 a0) throws Throwable;
private static native java.util.List __fieldRead443_2(moom.v9 a0) throws Throwable;
private static native void __call443_3(java.util.List a0) throws Throwable;
private static native moom.DB __fieldRead443_4() throws Throwable;
private static native java.util.Iterator __call443_5(moom.DB a0) throws Throwable;
private static native boolean __call443_6(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call443_7(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.item.Item __cast443_8(java.lang.Object a0) throws Throwable;
private static native net.minecraft.creativetab.CreativeTabs __call443_9(net.minecraft.item.Item a0) throws Throwable;
private static native java.util.List __fieldRead443_10(moom.v9 a0) throws Throwable;
private static native void __call443_11(net.minecraft.item.Item a0, net.minecraft.item.Item a1, java.lang.Object a2, java.util.List a3) throws Throwable;
private static native net.minecraft.enchantment.Enchantment[] __fieldRead443_12() throws Throwable;
private static native net.minecraft.enchantment.EnumEnchantmentType __fieldRead443_13(net.minecraft.enchantment.Enchantment a0) throws Throwable;
private static native moom.xg __fieldRead443_14() throws Throwable;
private static native java.util.List __fieldRead443_15(moom.v9 a0) throws Throwable;
private static native void __call443_16(moom.xg a0, net.minecraft.enchantment.Enchantment a1, java.util.List a2) throws Throwable;
private static native java.util.List __fieldRead443_17(moom.v9 a0) throws Throwable;
private static native java.util.Iterator __call443_18(java.util.List a0) throws Throwable;
private static native moom.hJ __fieldRead443_19(moom.ht a0) throws Throwable;
private static native java.lang.String __call443_20(moom.hJ a0) throws Throwable;
private static native java.lang.String __call443_21(java.lang.String a0) throws Throwable;
private static native boolean __call443_22(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call443_23(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.item.ItemStack __cast443_24(java.lang.Object a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead443_25(moom.ht a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead443_26(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead443_27(moom.ht a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead443_28(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __fieldRead443_29(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native java.util.List __call443_30(net.minecraft.item.ItemStack a0, net.minecraft.client.entity.EntityPlayerSP a1, boolean a2) throws Throwable;
private static native java.util.Iterator __call443_31(java.util.List a0) throws Throwable;
private static native boolean __call443_32(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call443_33(java.util.Iterator a0) throws Throwable;
private static native java.lang.String __cast443_34(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call443_35(java.lang.String a0) throws Throwable;
private static native java.lang.String __call443_36(java.lang.String a0) throws Throwable;
private static native boolean __call443_37(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call443_38(java.util.Iterator a0) throws Throwable;
private static native void __fieldWrite443_39(moom.ht a0, float a1) throws Throwable;
private static native void __call443_40(moom.v9 a0, float a1) throws Throwable;
private static native java.lang.Exception __call3044300_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3044301_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3044302_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3044303_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3044304_0(moom.Oo a0) throws Throwable;

}


protected boolean b(net.minecraft.creativetab.CreativeTabs p0, int p1, int p2) { return __sourceHandlerCall_f89130c3fc63cd3c005f(this, p0, p1, p2); }


protected void b(net.minecraft.creativetab.CreativeTabs p0) { __sourceHandlerCall_ed73f98857c35fb2447c(this, p0); }


protected void b(int p0, int p1, int p2) { __sourceHandlerCall_c084fe6716265d4fb62c(this, p0, p1, p2); }


protected void b(int p0, int p1) {
long life3_3;
    net.minecraft.creativetab.CreativeTabs life5_7;
    life3_3 = (moom.ht.cb ^ 65133382499365L);
    life5_7 = (net.minecraft.creativetab.CreativeTabs.a)[moom.ht.ac];
    try {
        if (((net.minecraft.creativetab.CreativeTabs)(life5_7)).a__Boolean()) {
        moom.kZ.k();
        ((net.minecraft.client.gui.FontRenderer)(this.p)).b(((java.lang.String)(moom.oO.a(((java.lang.String)(((net.minecraft.creativetab.CreativeTabs)(life5_7)).b__String())), ((java.lang.Object[])(new java.lang.Object[0]))))), ((float)(0x1.0p3f)), ((float)(0x1.8p2f)), ((int)(__sourceIntrinsic_45fde0f4e55e_invokedynamic1831_8(10552, (5288286170552001879L ^ life3_3)))));
    }
    } catch (moom.Oo caught_rethrow_0) {
        throw moom.ht.c(((java.lang.Exception)(caught_rethrow_0)));
    }
    return;
}


protected void b__sourceReturn_da8c82d5d4() { __sourceHandlerCall_e3fde0a8c995457c0c54(this); }


public void e() throws java.io.IOException { __sourceHandlerCall_efd39d8e12d6c3b0633a(this); }


private static java.lang.invoke.CallSite e(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_5c8d2e4b3bac_methodHandleLiteral7938_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/ht"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private boolean e__Boolean() { return __sourceHandlerCall_ca7ec04f5d33dccb7028(this); }


private static int e(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.ht.e(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int e(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 23984;
      if (tb[var3] == null) {
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
         long var5 = sb[var3];
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
         Object[] var9 = (Object[])ub.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               ub.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/ht", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         tb[var3] = var15;
      }

      return tb[var3];
}


private static java.lang.Exception c(java.lang.Exception p0) {
return p0;
}


public void c__Void() {
long life1_3;
    int life3_73;
    life1_3 = (moom.ht.cb ^ 32767021530760L);
    if (((moom.jI)(((net.minecraft.client.Minecraft)(this.i)).F)).e()) {
        super.c__Void();
        ((java.util.List)(this.m)).clear();
        org.lwjgl.input.Keyboard.enableRepeatEvents(((boolean)(true)));
        this.ag = ((moom.hJ)(new moom.hJ(0, this.p, (this.A + __sourceIntrinsic_7ac46ee229a8_invokedynamic3610_10(27927, (6391169800557978617L ^ life1_3))), (this.B + __sourceIntrinsic_7ac46ee229a8_invokedynamic3610_12(29421, (8773240851703987200L ^ life1_3))), __sourceIntrinsic_7ac46ee229a8_invokedynamic3610_13(11264, (3137218861728801480L ^ life1_3)), ((net.minecraft.client.gui.FontRenderer)(this.p)).c)));
        ((moom.hJ)(this.ag)).e(((int)(__sourceIntrinsic_7ac46ee229a8_invokedynamic3610_18(10699, (7663691305891079981L ^ life1_3)))));
        ((moom.hJ)(this.ag)).a(((boolean)(false)));
        ((moom.hJ)(this.ag)).e(((boolean)(false)));
        ((moom.hJ)(this.ag)).f(((int)(__sourceIntrinsic_7ac46ee229a8_invokedynamic3610_25(4527, (4057079908597047152L ^ life1_3)))));
        life3_73 = moom.ht.ac;
        ac = ((int)(-1));
        ((moom.ht)(this)).a(((net.minecraft.creativetab.CreativeTabs)((net.minecraft.creativetab.CreativeTabs.a)[life3_73])));
        this.ak = ((moom.iv)(new moom.iv(this.i)));
        ((moom.v8)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(this.i)).K)).bF)).a(((net.minecraft.inventory.ICrafting)(this.ak)));
    } else {
        ((net.minecraft.client.Minecraft)(this.i)).a(((net.minecraft.client.gui.GuiScreen)(new moom.hu(((net.minecraft.client.Minecraft)(this.i)).K))));
    }
    return;
}


public void h() { __sourceHandlerCall_ba7ac1b3782fab4f981d(this); }


protected void a(char p0, int p1) throws java.io.IOException { __sourceHandlerCall_6869e2a51125878ea158(this, p0, p1); }


protected void a__Void(moom.gc p0) throws java.io.IOException {
try {
        if ((((moom.gc)(p0)).l == 0)) {
        ((net.minecraft.client.Minecraft)(this.i)).a(((net.minecraft.client.gui.GuiScreen)(new net.minecraft.client.gui.achievement.GuiAchievements(this, ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(this.i)).K)).a__sourceReturn_d483ce8cb5()))));
    }
    } catch (java.io.IOException caught_rethrow_0) {
        throw moom.ht.c(((java.lang.Exception)(caught_rethrow_0)));
    }
    try {
        if ((((moom.gc)(p0)).l == 1)) {
        ((net.minecraft.client.Minecraft)(this.i)).a(((net.minecraft.client.gui.GuiScreen)(new net.minecraft.client.gui.achievement.GuiStats(this, ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(this.i)).K)).a__sourceReturn_d483ce8cb5()))));
    }
    } catch (java.io.IOException caught_rethrow_1) {
        throw moom.ht.c(((java.lang.Exception)(caught_rethrow_1)));
    }
    return;
}


public int a() {
return moom.ht.ac;
}


protected void a(moom.wB p0, int p1, int p2, int p3) { __sourceHandlerCall_934afcc272c71041ee0a(this, p0, p1, p2, p3); }


protected void a(int p0, int p1, int p2) throws java.io.IOException { __sourceHandlerCall_463d6086090accd0ebfc(this, p0, p1, p2); }


private void a(net.minecraft.creativetab.CreativeTabs p0) { __sourceHandlerCall_e349000015b5bafb965f(this, p0); }


protected void a(net.minecraft.item.ItemStack p0, int p1, int p2) { __sourceHandlerCall_78cdd63c1b0531c9aaa5(this, p0, p1, p2); }


protected void a(float p0, int p1, int p2) { __sourceHandlerCall_361edecc554b5a367bdc(this, p0, p1, p2); }


protected boolean a(net.minecraft.creativetab.CreativeTabs p0, int p1, int p2) { return __sourceHandlerCall_f0731ddcd40ab666ca7a(this, p0, p1, p2); }


public void a(int p0, int p1, float p2) { __sourceHandlerCall_32dfe6fc399a34ac38f9(this, p0, p1, p2); }


private void k() { __sourceHandlerCall_19394722f09d35118437(this); }


public void g() {
try {
        if ((!((moom.jI)(((net.minecraft.client.Minecraft)(this.i)).F)).e())) {
        ((net.minecraft.client.Minecraft)(this.i)).a(((net.minecraft.client.gui.GuiScreen)(new moom.hu(((net.minecraft.client.Minecraft)(this.i)).K))));
    }
    } catch (moom.Oo caught_rethrow_0) {
        throw moom.ht.c(((java.lang.Exception)(caught_rethrow_0)));
    }
    ((moom.ht)(this)).b__sourceReturn_da8c82d5d4();
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1268_53(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_84eb2f054341b621_originalDynamicSite810_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_84eb2f054341b621_originalDynamicSite810_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_45fde0f4e55e_invokedynamic1831_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic3610_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic3610_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic3610_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic3610_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic3610_25(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_5c8d2e4b3bac_methodHandleLiteral7938_0() throws E;
}
