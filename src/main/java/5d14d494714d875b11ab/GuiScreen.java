package net.minecraft.client.gui;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public abstract class GuiScreen extends net.minecraft.client.gui.Gui implements net.minecraft.client.gui.GuiYesNoCallback {

private static org.apache.logging.log4j.Logger f;

private static java.util.Set<java.lang.String> g;

private static com.google.common.base.Splitter h;

protected net.minecraft.client.Minecraft i;

protected net.minecraft.client.renderer.entity.RenderItem j;

public int k;

public int l;

protected java.util.List<moom.gc> m;

protected java.util.List<moom.gA> n;

public boolean o;

protected net.minecraft.client.gui.FontRenderer p;

private moom.gc q;

private int r;

private long s;

private int t;

private java.net.URI u;

private static net.minecraft.entity.Entity[] v;

private static long db;

private static long[] jb;

private static java.lang.Integer[] kb;

private static java.util.Map lb;

public GuiScreen() {
super();
    this.m = com.google.common.collect.Lists.newArrayList();
    this.n = com.google.common.collect.Lists.newArrayList();
}


static {
db = ((long)(((moom._a)(moom._c.a(((long)(-7628178980966155271L)), ((long)(5223544672811325176L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(10346153447972L)))));
    long local11_life6 = (net.minecraft.client.gui.GuiScreen.db ^ 51732080619039L);
    net.minecraft.entity.Entity[] __sourceSpill1782_8 = new net.minecraft.entity.Entity[4];
    lb = ((java.util.Map)(new java.util.HashMap(13)));
    net.minecraft.client.gui.GuiScreen.b(((net.minecraft.entity.Entity[])(__sourceSpill1782_8)));
    javax.crypto.Cipher local0_life11;
    javax.crypto.Cipher __sourceSpill1782_13 = (local0_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1782_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1782_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1782_16 = new byte[8];
    (__sourceSpill1782_16)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local1_life17 = 1;
    while ((local1_life17 < 8)) {
        (__sourceSpill1782_16)[local1_life17] = ((byte) ((int) ((local11_life6 << (local1_life17 * 8)) >>> 56)));
        local1_life17 += 1;
    }
    byte[] __sourcePreallocation1782_18 = __sourceSpill1782_16;
    ((javax.crypto.Cipher)(__sourceSpill1782_13)).init(((int)(__sourceSpill1782_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1782_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1782_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life21 = new long[35];
    int local3_life22 = 0;
    java.lang.String local4_life23;
    int local5_life25 = ((java.lang.String)((local4_life23 = "¹U'ÃÌÞ3\017\t\006±)\177go\f²9?\177=bJÕÛ\016æÍÓïp\013»O²{«U{DXBà-õ§Úyê\025Æþ÷êMà&í\177l3ÍÚÈïGÜ¾hXÅÉ\016¥)·ôou{Äa½ê\"\b|!*Â\035÷Ù\017\007ZÁ\021æaü\035y&$E3bq«3ø`iOÍéNWí\025Z:\004\031nQöyÁñÓP\00582ÀÊ²à\tQ×ÕD¹£Ç@èè1µ\016©r~¥þC\030½\001*\033b¦qb°Q¼J©JÅòº(ÑI­U;dM[¯ÀÊ\016E=-Á\030\025Cl\027\013>w\nz­li/cZoKáè­J&ûU!ÇÒÒ\031±êc,úî(\002{"))).length();
    int local2_life26 = 0;
    do {
        java.lang.String __sourceSpill1782_27 = local4_life23;
        int __sourceSpill1782_28 = local2_life26;
        local2_life26 += 8;
        byte[] local7_life31 = ((java.lang.String)(((java.lang.String)(__sourceSpill1782_27)).substring(((int)(__sourceSpill1782_28)), ((int)(local2_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1782_32 = local6_life21;
        int __sourceSpill1782_33 = local3_life22;
        local3_life22 += 1;
        long local8_life34 = (((((((((((long) (local7_life31)[0]) & 255L) << 56) | ((((long) (local7_life31)[1]) & 255L) << 48)) | ((((long) (local7_life31)[2]) & 255L) << 40)) | ((((long) (local7_life31)[3]) & 255L) << 32)) | ((((long) (local7_life31)[4]) & 255L) << 24)) | ((((long) (local7_life31)[5]) & 255L) << 16)) | ((((long) (local7_life31)[6]) & 255L) << 8)) | (((long) (local7_life31)[7]) & 255L));
        byte[] __sourceSpill1782_35 = new byte[8];
        (__sourceSpill1782_35)[0] = ((byte) ((int) (local8_life34 >>> 56)));
        (__sourceSpill1782_35)[1] = ((byte) ((int) (local8_life34 >>> 48)));
        (__sourceSpill1782_35)[2] = ((byte) ((int) (local8_life34 >>> 40)));
        (__sourceSpill1782_35)[3] = ((byte) ((int) (local8_life34 >>> 32)));
        (__sourceSpill1782_35)[4] = ((byte) ((int) (local8_life34 >>> 24)));
        (__sourceSpill1782_35)[5] = ((byte) ((int) (local8_life34 >>> 16)));
        (__sourceSpill1782_35)[6] = ((byte) ((int) (local8_life34 >>> 8)));
        (__sourceSpill1782_35)[7] = ((byte) ((int) local8_life34));
        javax.crypto.Cipher __sourceSpill1782_36 = local0_life11;
        byte[] local10_life38 = ((javax.crypto.Cipher)(__sourceSpill1782_36)).doFinal(((byte[])(__sourceSpill1782_35)));
        (__sourceSpill1782_32)[__sourceSpill1782_33] = (((((((((((long) (local10_life38)[0]) & 255L) << 56) | ((((long) (local10_life38)[1]) & 255L) << 48)) | ((((long) (local10_life38)[2]) & 255L) << 40)) | ((((long) (local10_life38)[3]) & 255L) << 32)) | ((((long) (local10_life38)[4]) & 255L) << 24)) | ((((long) (local10_life38)[5]) & 255L) << 16)) | ((((long) (local10_life38)[6]) & 255L) << 8)) | (((long) (local10_life38)[7]) & 255L));
    } while ((!(local2_life26 >= local5_life25)));
    local5_life25 = ((java.lang.String)((local4_life23 = "(¦½©Duaj­\037°çÓ"))).length();
    local2_life26 = 0;
    do {
        java.lang.String __sourceSpill1782_40 = local4_life23;
        int __sourceSpill1782_41 = local2_life26;
        local2_life26 += 8;
        byte[] local7_life44 = ((java.lang.String)(((java.lang.String)(__sourceSpill1782_40)).substring(((int)(__sourceSpill1782_41)), ((int)(local2_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1782_45 = local6_life21;
        int __sourceSpill1782_46 = local3_life22;
        local3_life22 += 1;
        long local8_life47 = (((((((((((long) (local7_life44)[0]) & 255L) << 56) | ((((long) (local7_life44)[1]) & 255L) << 48)) | ((((long) (local7_life44)[2]) & 255L) << 40)) | ((((long) (local7_life44)[3]) & 255L) << 32)) | ((((long) (local7_life44)[4]) & 255L) << 24)) | ((((long) (local7_life44)[5]) & 255L) << 16)) | ((((long) (local7_life44)[6]) & 255L) << 8)) | (((long) (local7_life44)[7]) & 255L));
        byte[] __sourceSpill1782_48 = new byte[8];
        (__sourceSpill1782_48)[0] = ((byte) ((int) (local8_life47 >>> 56)));
        (__sourceSpill1782_48)[1] = ((byte) ((int) (local8_life47 >>> 48)));
        (__sourceSpill1782_48)[2] = ((byte) ((int) (local8_life47 >>> 40)));
        (__sourceSpill1782_48)[3] = ((byte) ((int) (local8_life47 >>> 32)));
        (__sourceSpill1782_48)[4] = ((byte) ((int) (local8_life47 >>> 24)));
        (__sourceSpill1782_48)[5] = ((byte) ((int) (local8_life47 >>> 16)));
        (__sourceSpill1782_48)[6] = ((byte) ((int) (local8_life47 >>> 8)));
        (__sourceSpill1782_48)[7] = ((byte) ((int) local8_life47));
        javax.crypto.Cipher __sourceSpill1782_49 = local0_life11;
        byte[] local10_life51 = ((javax.crypto.Cipher)(__sourceSpill1782_49)).doFinal(((byte[])(__sourceSpill1782_48)));
        (__sourceSpill1782_45)[__sourceSpill1782_46] = (((((((((((long) (local10_life51)[0]) & 255L) << 56) | ((((long) (local10_life51)[1]) & 255L) << 48)) | ((((long) (local10_life51)[2]) & 255L) << 40)) | ((((long) (local10_life51)[3]) & 255L) << 32)) | ((((long) (local10_life51)[4]) & 255L) << 24)) | ((((long) (local10_life51)[5]) & 255L) << 16)) | ((((long) (local10_life51)[6]) & 255L) << 8)) | (((long) (local10_life51)[7]) & 255L));
    } while ((!(local2_life26 >= local5_life25)));
    jb = ((long[])(local6_life21));
    kb = ((java.lang.Integer[])(new java.lang.Integer[35]));
    f = ((org.apache.logging.log4j.Logger)(org.apache.logging.log4j.LogManager.getLogger()));
    java.lang.String[] __sourceSpill1782_56 = new java.lang.String[2];
    (__sourceSpill1782_56)[0] = "http";
    (__sourceSpill1782_56)[1] = "https";
    g = ((java.util.Set)(com.google.common.collect.Sets.newHashSet(((java.lang.Object[])(__sourceSpill1782_56)))));
    h = ((com.google.common.base.Splitter)(com.google.common.base.Splitter.on(((char)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1782_59(15427, (1850654227402587027L ^ local11_life6)))))));
}

private static native <E extends Throwable> void __sourceHandlerCall_98ca93a1f823c7c2cfb4(net.minecraft.client.gui.GuiScreen a0, char a1, int a2) throws E;
private static final class __SourceHandler_98ca93a1f823c7c2cfb4 {

public static void f2280(net.minecraft.client.gui.GuiScreen receiver, char p0, int p1) throws Throwable {
    if ((p1 == 1)) {
        __call2280_1(__fieldRead2280_0(receiver), null);
        if ((__fieldRead2280_3(__fieldRead2280_2(receiver)) == null)) {
        __call2280_5(__fieldRead2280_4(receiver));
    }
    }
    return;
}
public static void h2280_0(java.io.IOException p0) throws Throwable {
    throw __call1228000_0(p0);
}
public static void h2280_1(java.io.IOException p0) throws Throwable {
    throw __call1228001_0(p0);
}
private static native net.minecraft.client.Minecraft __fieldRead2280_0(net.minecraft.client.gui.GuiScreen a0) throws Throwable;
private static native void __call2280_1(net.minecraft.client.Minecraft a0, java.lang.Object a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2280_2(net.minecraft.client.gui.GuiScreen a0) throws Throwable;
private static native net.minecraft.client.gui.GuiScreen __fieldRead2280_3(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2280_4(net.minecraft.client.gui.GuiScreen a0) throws Throwable;
private static native void __call2280_5(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.lang.Exception __call1228000_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1228001_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_b05e3405e1064ccaa1fb(int a0) throws E;
private static final class __SourceHandler_b05e3405e1064ccaa1fb {

public static boolean f1321(int p0) throws Throwable {
    int forwardValue1321_20_0;
    long life1_3;
    forward_join_20: {
    forward_join_19: {
    life1_3 = (__fieldRead1321_0() ^ 11013166000747L);
    if (!((p0 == __invokedynamic1321_1(13457, (2692423301463504675L ^ life1_3))))) {
        break forward_join_19;
    }
    if (!(__call1321_2())) {
        break forward_join_19;
    }
    if (!((!__call1321_3()))) {
        break forward_join_19;
    }
    if (!((!__call1321_4()))) {
        break forward_join_19;
    }
    forwardValue1321_20_0 = 1;
    break forward_join_20;
    }
    forwardValue1321_20_0 = 0;
    }
    return __integerCategory1321_5(forwardValue1321_20_0);
}
public static void h1321_0(moom.Oo p0) throws Throwable {
    throw __call1132100_0(p0);
}
public static void h1321_1(moom.Oo p0) throws Throwable {
    throw __call1132101_0(p0);
}
public static void h1321_2(moom.Oo p0) throws Throwable {
    throw __call1132102_0(p0);
}
public static void h1321_3(moom.Oo p0) throws Throwable {
    throw __call1132103_0(p0);
}
private static native long __fieldRead1321_0() throws Throwable;
private static native int __invokedynamic1321_1(int a0, long a1) throws Throwable;
private static native boolean __call1321_2() throws Throwable;
private static native boolean __call1321_3() throws Throwable;
private static native boolean __call1321_4() throws Throwable;
private static native boolean __integerCategory1321_5(int value) throws Throwable;
private static native java.lang.Exception __call1132100_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1132101_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1132102_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1132103_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_bc99138c00c7735df43e(net.minecraft.client.gui.GuiScreen a0, java.net.URI a1) throws E;
private static final class __SourceHandler_bc99138c00c7735df43e {

public static void f558(net.minecraft.client.gui.GuiScreen receiver, java.net.URI p0) throws Throwable {
    java.lang.Class spill558_0;
    java.lang.String spill558_1;
    java.lang.Class[] spill558_2;
    java.lang.reflect.Method spill558_3;
    java.lang.Object spill558_4;
    java.lang.Object[] spill558_5;
    java.lang.Class life2_2;
    java.lang.Object life3_12;
    life2_2 = __call558_0("java.awt.Desktop");
    life3_12 = __call558_2(__call558_1(life2_2, "getDesktop", new java.lang.Class[0]), null, new java.lang.Object[0]);
    spill558_0 = life2_2;
    spill558_1 = "browse";
    java.lang.Class[] __stackOp558_3_0 = new java.lang.Class[1];
    spill558_2 = __stackOp558_3_0;
    (__stackOp558_3_0)[0] = __classLiteral558_4();
    spill558_3 = __call558_5(spill558_0, spill558_1, spill558_2);
    spill558_4 = life3_12;
    java.lang.Object[] __stackOp558_6_0 = new java.lang.Object[1];
    spill558_5 = __stackOp558_6_0;
    (__stackOp558_6_0)[0] = p0;
    __call558_7(spill558_3, spill558_4, spill558_5);
    return;
}
public static void h558_0(java.lang.Throwable p0) throws Throwable {
    java.lang.Throwable life1_2;
    life1_2 = p0;
    __call3055800_1(__fieldRead3055800_0(), "Couldn't open link", life1_2);
    return;
}
private static native java.lang.Class __call558_0(java.lang.String a0) throws Throwable;
private static native java.lang.reflect.Method __call558_1(java.lang.Class a0, java.lang.String a1, java.lang.Class[] a2) throws Throwable;
private static native java.lang.Object __call558_2(java.lang.reflect.Method a0, java.lang.Object a1, java.lang.Object[] a2) throws Throwable;
private static native java.lang.Class __classLiteral558_4() throws Throwable;
private static native java.lang.reflect.Method __call558_5(java.lang.Class a0, java.lang.String a1, java.lang.Class[] a2) throws Throwable;
private static native java.lang.Object __call558_7(java.lang.reflect.Method a0, java.lang.Object a1, java.lang.Object[] a2) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead3055800_0() throws Throwable;
private static native void __call3055800_1(org.apache.logging.log4j.Logger a0, java.lang.String a1, java.lang.Throwable a2) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_cd02075a2313d7d266db(net.minecraft.client.gui.GuiScreen a0, java.util.List a1, int a2, int a3) throws E;
private static final class __SourceHandler_cd02075a2313d7d266db {

public static void f900205(net.minecraft.client.gui.GuiScreen receiver, java.util.List p0, int p1, int p2) throws Throwable {
    int spill900205_0;
    int spill900205_1;
    long spill900205_2;
    long life4_3;
    int life6_13;
    java.util.Iterator life7_16;
    java.lang.String life8_25;
    int life9_30;
    int life7_46;
    int life8_54;
    int life9_60;
    int life10_137;
    int life11_243;
    int life12_261;
    int life13_355;
    java.lang.String life14_366;
    forest_join_381: {
    forest_join_370: {
    forest_join_114: {
    forest_join_91: {
    forest_join_75: {
    forest_join_34: {
    life4_3 = (__fieldRead900205_0() ^ 55372925148332L);
    if (!((!__call900205_1(p0)))) {
        break forest_join_381;
    }
    __call900205_2();
    __call900205_3();
    __call900205_4();
    __call900205_5();
    life6_13 = 0;
    life7_16 = __call900205_6(p0);
    forest_cycle_16: while (true) {
    forest_join_33: {
    if (!(__call900205_7(life7_16))) {
        break forest_join_34;
    }
    life8_25 = __cast900205_9(__call900205_8(life7_16));
    life9_30 = __call900205_11(__fieldRead900205_10(receiver), life8_25);
    if (!((life9_30 > life6_13))) {
        break forest_join_33;
    }
    life6_13 = life9_30;
    }
    continue forest_cycle_16;
    }
    }
    life7_46 = (p1 + __invokedynamic900205_12(13209, (7499314503788725992L ^ life4_3)));
    life8_54 = (p2 - __invokedynamic900205_13(13103, (5519281796148758084L ^ life4_3)));
    life9_60 = __invokedynamic900205_14(30365, (4081246371499721723L ^ life4_3));
    if (!((__call900205_15(p0) > 1))) {
        break forest_join_75;
    }
    life9_60 = (life9_60 + (2 + ((__call900205_16(p0) - 1) * __invokedynamic900205_17(6537, (5328927189555096825L ^ life4_3)))));
    }
    if (!(((life7_46 + life6_13) > __fieldRead900205_18(receiver)))) {
        break forest_join_91;
    }
    life7_46 = (life7_46 - (__invokedynamic900205_19(10052, (3091490611246993966L ^ life4_3)) + life6_13));
    }
    if (!((((life8_54 + life9_60) + __invokedynamic900205_20(27083, (7295408330929364151L ^ life4_3))) > __fieldRead900205_21(receiver)))) {
        break forest_join_114;
    }
    life8_54 = ((__fieldRead900205_22(receiver) - life9_60) - __invokedynamic900205_23(1003, (853858219153569433L ^ life4_3)));
    }
    __fieldWrite900205_24(receiver, 0x1.2cp8f);
    spill900205_0 = 27351;
    __fieldWrite900205_26(__fieldRead900205_25(receiver), 0x1.2cp8f);
    life10_137 = __invokedynamic900205_27(spill900205_0, (9035587000784314275L ^ life4_3));
    spill900205_1 = 26414;
    __call900205_28(receiver, (life7_46 - 3), (life8_54 - 4), ((life7_46 + life6_13) + 3), (life8_54 - 3), life10_137, life10_137);
    spill900205_2 = (1725734198467285630L ^ life4_3);
    __call900205_29(receiver, (life7_46 - 3), ((life8_54 + life9_60) + 3), ((life7_46 + life6_13) + 3), ((life8_54 + life9_60) + 4), life10_137, life10_137);
    __call900205_30(receiver, (life7_46 - 3), (life8_54 - 3), ((life7_46 + life6_13) + 3), ((life8_54 + life9_60) + 3), life10_137, life10_137);
    __call900205_31(receiver, (life7_46 - 4), (life8_54 - 3), (life7_46 - 3), ((life8_54 + life9_60) + 3), life10_137, life10_137);
    __call900205_32(receiver, ((life7_46 + life6_13) + 3), (life8_54 - 3), ((life7_46 + life6_13) + 4), ((life8_54 + life9_60) + 3), life10_137, life10_137);
    life11_243 = __invokedynamic900205_33(spill900205_1, spill900205_2);
    life12_261 = (((life11_243 & __invokedynamic900205_34(30911, (6648102293648100822L ^ life4_3))) >> 1) | (life11_243 & __invokedynamic900205_35(5123, (2320556576597680491L ^ life4_3))));
    __call900205_36(receiver, (life7_46 - 3), ((life8_54 - 3) + 1), ((life7_46 - 3) + 1), (((life8_54 + life9_60) + 3) - 1), life11_243, life12_261);
    __call900205_37(receiver, ((life7_46 + life6_13) + 2), ((life8_54 - 3) + 1), ((life7_46 + life6_13) + 3), (((life8_54 + life9_60) + 3) - 1), life11_243, life12_261);
    __call900205_38(receiver, (life7_46 - 3), (life8_54 - 3), ((life7_46 + life6_13) + 3), ((life8_54 - 3) + 1), life11_243, life11_243);
    __call900205_39(receiver, (life7_46 - 3), ((life8_54 + life9_60) + 2), ((life7_46 + life6_13) + 3), ((life8_54 + life9_60) + 3), life12_261, life12_261);
    life13_355 = 0;
    forest_cycle_345: while (true) {
    forest_join_367: {
    if (!((life13_355 < __call900205_40(p0)))) {
        break forest_join_370;
    }
    life14_366 = __cast900205_42(__call900205_41(p0, life13_355));
    __call900205_44(__fieldRead900205_43(receiver), life14_366, ((float) life7_46), ((float) life8_54), -1);
    if (!((life13_355 == 0))) {
        break forest_join_367;
    }
    life8_54 += 2;
    }
    life8_54 += 10;
    life13_355 += 1;
    continue forest_cycle_345;
    }
    }
    __fieldWrite900205_45(receiver, 0x0.0p0f);
    __fieldWrite900205_47(__fieldRead900205_46(receiver), 0x0.0p0f);
    __call900205_48();
    __call900205_49();
    __call900205_50();
    __call900205_51();
    }
    return;
}
public static void h900205_0(moom.Oo p0) throws Throwable {
    throw __call93020500_0(p0);
}
private static native long __fieldRead900205_0() throws Throwable;
private static native boolean __call900205_1(java.util.List a0) throws Throwable;
private static native void __call900205_2() throws Throwable;
private static native void __call900205_3() throws Throwable;
private static native void __call900205_4() throws Throwable;
private static native void __call900205_5() throws Throwable;
private static native java.util.Iterator __call900205_6(java.util.List a0) throws Throwable;
private static native boolean __call900205_7(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call900205_8(java.util.Iterator a0) throws Throwable;
private static native java.lang.String __cast900205_9(java.lang.Object a0) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead900205_10(net.minecraft.client.gui.GuiScreen a0) throws Throwable;
private static native int __call900205_11(net.minecraft.client.gui.FontRenderer a0, java.lang.String a1) throws Throwable;
private static native int __invokedynamic900205_12(int a0, long a1) throws Throwable;
private static native int __invokedynamic900205_13(int a0, long a1) throws Throwable;
private static native int __invokedynamic900205_14(int a0, long a1) throws Throwable;
private static native int __call900205_15(java.util.List a0) throws Throwable;
private static native int __call900205_16(java.util.List a0) throws Throwable;
private static native int __invokedynamic900205_17(int a0, long a1) throws Throwable;
private static native int __fieldRead900205_18(net.minecraft.client.gui.GuiScreen a0) throws Throwable;
private static native int __invokedynamic900205_19(int a0, long a1) throws Throwable;
private static native int __invokedynamic900205_20(int a0, long a1) throws Throwable;
private static native int __fieldRead900205_21(net.minecraft.client.gui.GuiScreen a0) throws Throwable;
private static native int __fieldRead900205_22(net.minecraft.client.gui.GuiScreen a0) throws Throwable;
private static native int __invokedynamic900205_23(int a0, long a1) throws Throwable;
private static native void __fieldWrite900205_24(net.minecraft.client.gui.GuiScreen a0, float a1) throws Throwable;
private static native net.minecraft.client.renderer.entity.RenderItem __fieldRead900205_25(net.minecraft.client.gui.GuiScreen a0) throws Throwable;
private static native void __fieldWrite900205_26(net.minecraft.client.renderer.entity.RenderItem a0, float a1) throws Throwable;
private static native int __invokedynamic900205_27(int a0, long a1) throws Throwable;
private static native void __call900205_28(net.minecraft.client.gui.GuiScreen a0, int a1, int a2, int a3, int a4, int a5, int a6) throws Throwable;
private static native void __call900205_29(net.minecraft.client.gui.GuiScreen a0, int a1, int a2, int a3, int a4, int a5, int a6) throws Throwable;
private static native void __call900205_30(net.minecraft.client.gui.GuiScreen a0, int a1, int a2, int a3, int a4, int a5, int a6) throws Throwable;
private static native void __call900205_31(net.minecraft.client.gui.GuiScreen a0, int a1, int a2, int a3, int a4, int a5, int a6) throws Throwable;
private static native void __call900205_32(net.minecraft.client.gui.GuiScreen a0, int a1, int a2, int a3, int a4, int a5, int a6) throws Throwable;
private static native int __invokedynamic900205_33(int a0, long a1) throws Throwable;
private static native int __invokedynamic900205_34(int a0, long a1) throws Throwable;
private static native int __invokedynamic900205_35(int a0, long a1) throws Throwable;
private static native void __call900205_36(net.minecraft.client.gui.GuiScreen a0, int a1, int a2, int a3, int a4, int a5, int a6) throws Throwable;
private static native void __call900205_37(net.minecraft.client.gui.GuiScreen a0, int a1, int a2, int a3, int a4, int a5, int a6) throws Throwable;
private static native void __call900205_38(net.minecraft.client.gui.GuiScreen a0, int a1, int a2, int a3, int a4, int a5, int a6) throws Throwable;
private static native void __call900205_39(net.minecraft.client.gui.GuiScreen a0, int a1, int a2, int a3, int a4, int a5, int a6) throws Throwable;
private static native int __call900205_40(java.util.List a0) throws Throwable;
private static native java.lang.Object __call900205_41(java.util.List a0, int a1) throws Throwable;
private static native java.lang.String __cast900205_42(java.lang.Object a0) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead900205_43(net.minecraft.client.gui.GuiScreen a0) throws Throwable;
private static native int __call900205_44(net.minecraft.client.gui.FontRenderer a0, java.lang.String a1, float a2, float a3, int a4) throws Throwable;
private static native void __fieldWrite900205_45(net.minecraft.client.gui.GuiScreen a0, float a1) throws Throwable;
private static native net.minecraft.client.renderer.entity.RenderItem __fieldRead900205_46(net.minecraft.client.gui.GuiScreen a0) throws Throwable;
private static native void __fieldWrite900205_47(net.minecraft.client.renderer.entity.RenderItem a0, float a1) throws Throwable;
private static native void __call900205_48() throws Throwable;
private static native void __call900205_49() throws Throwable;
private static native void __call900205_50() throws Throwable;
private static native void __call900205_51() throws Throwable;
private static native java.lang.Exception __call93020500_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_02fedcf0f97d3e8ac0bc(net.minecraft.client.gui.GuiScreen a0, net.minecraft.item.ItemStack a1, int a2, int a3) throws E;
private static final class __SourceHandler_02fedcf0f97d3e8ac0bc {

public static void f2284(net.minecraft.client.gui.GuiScreen receiver, net.minecraft.item.ItemStack p0, int p1, int p2) throws Throwable {
    java.util.List life4_9;
    int life5_11;
    life4_9 = __call2284_5(p0, __fieldRead2284_1(__fieldRead2284_0(receiver)), __fieldRead2284_4(__fieldRead2284_3(__fieldRead2284_2(receiver))));
    life5_11 = 0;
    loop_region_12: while ((life5_11 < __call2284_6(life4_9))) {
        if ((life5_11 == 0)) {
        __call2284_12(life4_9, life5_11, __invokedynamic2284_11(__fieldRead2284_8(__call2284_7(p0)), __cast2284_10(__call2284_9(life4_9, life5_11))));
    } else {
        __call2284_17(life4_9, life5_11, __invokedynamic2284_16(__fieldRead2284_13(), __cast2284_15(__call2284_14(life4_9, life5_11))));
    }
        life5_11 += 1;
    }
    __call2284_18(receiver, life4_9, p1, p2);
    return;
}
public static void h2284_0(moom.Oo p0) throws Throwable {
    throw __call1228400_0(p0);
}
public static void h2284_1(moom.Oo p0) throws Throwable {
    throw __call1228401_0(p0);
}
private static native net.minecraft.client.Minecraft __fieldRead2284_0(net.minecraft.client.gui.GuiScreen a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead2284_1(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2284_2(net.minecraft.client.gui.GuiScreen a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead2284_3(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __fieldRead2284_4(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native java.util.List __call2284_5(net.minecraft.item.ItemStack a0, net.minecraft.client.entity.EntityPlayerSP a1, boolean a2) throws Throwable;
private static native int __call2284_6(java.util.List a0) throws Throwable;
private static native net.minecraft.item.EnumRarity __call2284_7(net.minecraft.item.ItemStack a0) throws Throwable;
private static native net.minecraft.util.EnumChatFormatting __fieldRead2284_8(net.minecraft.item.EnumRarity a0) throws Throwable;
private static native java.lang.Object __call2284_9(java.util.List a0, int a1) throws Throwable;
private static native java.lang.String __cast2284_10(java.lang.Object a0) throws Throwable;
private static native java.lang.String __invokedynamic2284_11(net.minecraft.util.EnumChatFormatting a0, java.lang.String a1) throws Throwable;
private static native java.lang.Object __call2284_12(java.util.List a0, int a1, java.lang.String a2) throws Throwable;
private static native net.minecraft.util.EnumChatFormatting __fieldRead2284_13() throws Throwable;
private static native java.lang.Object __call2284_14(java.util.List a0, int a1) throws Throwable;
private static native java.lang.String __cast2284_15(java.lang.Object a0) throws Throwable;
private static native java.lang.String __invokedynamic2284_16(net.minecraft.util.EnumChatFormatting a0, java.lang.String a1) throws Throwable;
private static native java.lang.Object __call2284_17(java.util.List a0, int a1, java.lang.String a2) throws Throwable;
private static native void __call2284_18(net.minecraft.client.gui.GuiScreen a0, java.util.List a1, int a2, int a3) throws Throwable;
private static native java.lang.Exception __call1228400_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1228401_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_7415552bf142d9c6a529(net.minecraft.client.gui.GuiScreen a0, net.minecraft.util.IChatComponent a1) throws E;
private static final class __SourceHandler_7415552bf142d9c6a529 {

public static boolean f900206(net.minecraft.client.gui.GuiScreen receiver, net.minecraft.util.IChatComponent p0) throws Throwable {
    long life2_3;
    moom.v2 life4_10;
    java.net.URI life5_50;
    java.lang.String life6_53;
    java.net.URI life5_120;
    forest_join_137: {
    forest_join_135: {
    forest_join_131: {
    forest_join_121: {
    forest_join_111: {
    forest_join_96: {
    forest_join_95: {
    forest_join_92: {
    forest_join_68: {
    forest_join_54: {
    forest_join_36: {
    forest_join_23: {
    life2_3 = (__fieldRead900206_0() ^ 90350052585669L);
    if (!((p0 != null))) {
        break forest_join_137;
    }
    life4_10 = __call900206_2(__call900206_1(p0));
    if (!(__call900206_3())) {
        break forest_join_23;
    }
    if (!((__call900206_5(__call900206_4(p0)) != null))) {
        break forest_join_137;
    }
    __call900206_8(receiver, __call900206_7(__call900206_6(p0)), 0);
    break forest_join_137;
    }
    if (!((life4_10 != null))) {
        break forest_join_137;
    }
    if (!((__call900206_9(life4_10) == __fieldRead900206_10()))) {
        break forest_join_96;
    }
    if (!((!__fieldRead900206_13(__fieldRead900206_12(__fieldRead900206_11(receiver)))))) {
        break forest_join_36;
    }
    return __integerCategory900206_14(0);
    }
    life5_50 = new java.net.URI(__call900206_15(life4_10));
    life6_53 = __call900206_16(life5_50);
    if (!((life6_53 == null))) {
        break forest_join_54;
    }
    throw new java.net.URISyntaxException(__call900206_17(life4_10), "Missing protocol");
    }
    if (!((!__call900206_20(__fieldRead900206_18(), __call900206_19(life6_53))))) {
        break forest_join_68;
    }
    throw new java.net.URISyntaxException(__call900206_21(life4_10), __invokedynamic900206_23(__call900206_22(life6_53)));
    }
    if (!(__fieldRead900206_26(__fieldRead900206_25(__fieldRead900206_24(receiver))))) {
        break forest_join_92;
    }
    __fieldWrite900206_27(receiver, life5_50);
    __call900206_31(__fieldRead900206_28(receiver), new net.minecraft.client.gui.GuiConfirmOpenLink(receiver, __call900206_29(life4_10), __invokedynamic900206_30(14332, (5664654518352588486L ^ life2_3)), false));
    break forest_join_95;
    }
    __call900206_32(receiver, life5_50);
    }
    break forest_join_135;
    }
    if (!((__call900206_33(life4_10) == __fieldRead900206_34()))) {
        break forest_join_111;
    }
    life5_120 = __call900206_36(new java.io.File(__call900206_35(life4_10)));
    __call900206_37(receiver, life5_120);
    break forest_join_135;
    }
    if (!((__call900206_38(life4_10) == __fieldRead900206_39()))) {
        break forest_join_121;
    }
    __call900206_41(receiver, __call900206_40(life4_10), 1);
    break forest_join_135;
    }
    if (!((__call900206_42(life4_10) == __fieldRead900206_43()))) {
        break forest_join_131;
    }
    __call900206_45(receiver, __call900206_44(life4_10), 0);
    break forest_join_135;
    }
    __call900206_48(__fieldRead900206_46(), __invokedynamic900206_47(life4_10));
    }
    return __integerCategory900206_49(1);
    }
    return __integerCategory900206_50(0);
}
public static boolean h900206_0(java.net.URISyntaxException p0) throws Throwable {
    throw __call93020600_0(p0);
}
public static boolean h900206_1(java.net.URISyntaxException p0) throws Throwable {
    throw __call93020601_0(p0);
}
public static boolean h900206_2(java.net.URISyntaxException p0) throws Throwable {
    throw __call93020602_0(p0);
}
public static boolean h900206_3(java.net.URISyntaxException p0) throws Throwable {
    throw __call93020603_0(p0);
}
public static boolean h900206_4(java.net.URISyntaxException p0) throws Throwable {
    throw __call93020604_0(p0);
}
public static boolean h900206_5(java.net.URISyntaxException p0) throws Throwable {
    throw __call93020605_0(p0);
}
public static boolean h900206_6(java.net.URISyntaxException p0) throws Throwable {
    throw __call93020606_0(p0);
}
public static boolean h900206_7(java.net.URISyntaxException p0) throws Throwable {
    throw __call93020607_0(p0);
}
public static boolean h900206_8(java.net.URISyntaxException p0, moom.v2 p1) throws Throwable {
    java.net.URISyntaxException life2_2;
    life2_2 = p0;
    __call93020608_2(__fieldRead93020608_0(), __invokedynamic93020608_1(p1), life2_2);
    return __integerCategory93020608_3(1);
}
public static boolean h900206_9(java.net.URISyntaxException p0) throws Throwable {
    throw __call93020609_0(p0);
}
public static boolean h900206_10(java.net.URISyntaxException p0) throws Throwable {
    throw __call93020610_0(p0);
}
private static native long __fieldRead900206_0() throws Throwable;
private static native moom.CO __call900206_1(net.minecraft.util.IChatComponent a0) throws Throwable;
private static native moom.v2 __call900206_2(moom.CO a0) throws Throwable;
private static native boolean __call900206_3() throws Throwable;
private static native moom.CO __call900206_4(net.minecraft.util.IChatComponent a0) throws Throwable;
private static native java.lang.String __call900206_5(moom.CO a0) throws Throwable;
private static native moom.CO __call900206_6(net.minecraft.util.IChatComponent a0) throws Throwable;
private static native java.lang.String __call900206_7(moom.CO a0) throws Throwable;
private static native void __call900206_8(net.minecraft.client.gui.GuiScreen a0, java.lang.String a1, int a2) throws Throwable;
private static native net.minecraft.event.ClickEvent$Action __call900206_9(moom.v2 a0) throws Throwable;
private static native net.minecraft.event.ClickEvent$Action __fieldRead900206_10() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead900206_11(net.minecraft.client.gui.GuiScreen a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead900206_12(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __fieldRead900206_13(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native boolean __integerCategory900206_14(int value) throws Throwable;
private static native java.lang.String __call900206_15(moom.v2 a0) throws Throwable;
private static native java.lang.String __call900206_16(java.net.URI a0) throws Throwable;
private static native java.lang.String __call900206_17(moom.v2 a0) throws Throwable;
private static native java.util.Set __fieldRead900206_18() throws Throwable;
private static native java.lang.String __call900206_19(java.lang.String a0) throws Throwable;
private static native boolean __call900206_20(java.util.Set a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call900206_21(moom.v2 a0) throws Throwable;
private static native java.lang.String __call900206_22(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic900206_23(java.lang.String a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead900206_24(net.minecraft.client.gui.GuiScreen a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead900206_25(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __fieldRead900206_26(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native void __fieldWrite900206_27(net.minecraft.client.gui.GuiScreen a0, java.net.URI a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead900206_28(net.minecraft.client.gui.GuiScreen a0) throws Throwable;
private static native java.lang.String __call900206_29(moom.v2 a0) throws Throwable;
private static native int __invokedynamic900206_30(int a0, long a1) throws Throwable;
private static native void __call900206_31(net.minecraft.client.Minecraft a0, net.minecraft.client.gui.GuiConfirmOpenLink a1) throws Throwable;
private static native void __call900206_32(net.minecraft.client.gui.GuiScreen a0, java.net.URI a1) throws Throwable;
private static native net.minecraft.event.ClickEvent$Action __call900206_33(moom.v2 a0) throws Throwable;
private static native net.minecraft.event.ClickEvent$Action __fieldRead900206_34() throws Throwable;
private static native java.lang.String __call900206_35(moom.v2 a0) throws Throwable;
private static native java.net.URI __call900206_36(java.io.File a0) throws Throwable;
private static native void __call900206_37(net.minecraft.client.gui.GuiScreen a0, java.net.URI a1) throws Throwable;
private static native net.minecraft.event.ClickEvent$Action __call900206_38(moom.v2 a0) throws Throwable;
private static native net.minecraft.event.ClickEvent$Action __fieldRead900206_39() throws Throwable;
private static native java.lang.String __call900206_40(moom.v2 a0) throws Throwable;
private static native void __call900206_41(net.minecraft.client.gui.GuiScreen a0, java.lang.String a1, int a2) throws Throwable;
private static native net.minecraft.event.ClickEvent$Action __call900206_42(moom.v2 a0) throws Throwable;
private static native net.minecraft.event.ClickEvent$Action __fieldRead900206_43() throws Throwable;
private static native java.lang.String __call900206_44(moom.v2 a0) throws Throwable;
private static native void __call900206_45(net.minecraft.client.gui.GuiScreen a0, java.lang.String a1, int a2) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead900206_46() throws Throwable;
private static native java.lang.String __invokedynamic900206_47(moom.v2 a0) throws Throwable;
private static native void __call900206_48(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native boolean __integerCategory900206_49(int value) throws Throwable;
private static native boolean __integerCategory900206_50(int value) throws Throwable;
private static native java.lang.Exception __call93020600_0(java.net.URISyntaxException a0) throws Throwable;
private static native java.lang.Exception __call93020601_0(java.net.URISyntaxException a0) throws Throwable;
private static native java.lang.Exception __call93020602_0(java.net.URISyntaxException a0) throws Throwable;
private static native java.lang.Exception __call93020603_0(java.net.URISyntaxException a0) throws Throwable;
private static native java.lang.Exception __call93020604_0(java.net.URISyntaxException a0) throws Throwable;
private static native java.lang.Exception __call93020605_0(java.net.URISyntaxException a0) throws Throwable;
private static native java.lang.Exception __call93020606_0(java.net.URISyntaxException a0) throws Throwable;
private static native java.lang.Exception __call93020607_0(java.net.URISyntaxException a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead93020608_0() throws Throwable;
private static native java.lang.String __invokedynamic93020608_1(moom.v2 a0) throws Throwable;
private static native void __call93020608_2(org.apache.logging.log4j.Logger a0, java.lang.String a1, java.net.URISyntaxException a2) throws Throwable;
private static native boolean __integerCategory93020608_3(int value) throws Throwable;
private static native java.lang.Exception __call93020609_0(java.net.URISyntaxException a0) throws Throwable;
private static native java.lang.Exception __call93020610_0(java.net.URISyntaxException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_63fa166fe13f7e1dceab(net.minecraft.client.gui.GuiScreen a0, net.minecraft.util.IChatComponent a1, int a2, int a3) throws E;
private static final class __SourceHandler_63fa166fe13f7e1dceab {

public static void f561(net.minecraft.client.gui.GuiScreen receiver, net.minecraft.util.IChatComponent p0, int p1, int p2) throws Throwable {
    moom.CN forestValue561_147_0;
    moom.CN forestValue561_147_1;
    moom.CN forestValue561_148_0;
    moom.CN forestValue561_148_1;
    java.lang.String forestValue561_148_2;
    java.lang.String forestValue561_166_0;
    moom.CN spill561_0;
    moom.CN spill561_1;
    java.lang.String[] spill561_2;
    java.lang.String[] spill561_3;
    long life4_3;
    moom.v3 life6_14;
    net.minecraft.item.ItemStack life7_20;
    net.minecraft.nbt.NBTTagCompound life8_25;
    net.minecraft.nbt.NBTTagCompound life7_61;
    net.minecraft.nbt.NBTTagCompound life8_67;
    java.util.ArrayList life9_69;
    java.lang.String life10_88;
    moom.BY life7_137;
    net.minecraft.util.IChatComponent life8_142;
    moom.CN life9_155;
    java.lang.String life10_169;
    java.util.ArrayList life11_183;
    forest_join_208: {
    forest_join_207: {
    forest_join_201: {
    forest_join_195: {
    forest_join_166: {
    forest_join_165: {
    forest_join_148: {
    forest_join_147: {
    forest_join_126: {
    forest_join_112: {
    forest_join_111: {
    forest_join_105: {
    forest_join_93: {
    forest_join_45: {
    forest_join_44: {
    forest_join_38: {
    forest_join_30: {
    life4_3 = (__fieldRead561_0() ^ 107569784964149L);
    if (!((p0 != null))) {
        break forest_join_208;
    }
    if (!((__call561_2(__call561_1(p0)) != null))) {
        break forest_join_208;
    }
    life6_14 = __call561_4(__call561_3(p0));
    if (!((__call561_5(life6_14) == __fieldRead561_6()))) {
        break forest_join_45;
    }
    life7_20 = null;
    life8_25 = __call561_9(__call561_8(__call561_7(life6_14)));
    if (!((life8_25 != null))) {
        break forest_join_30;
    }
    life7_20 = __call561_10(life8_25);
    }
    if (!((life7_20 != null))) {
        break forest_join_38;
    }
    __call561_11(receiver, life7_20, p1, p2);
    break forest_join_44;
    }
    __call561_14(receiver, __invokedynamic561_13(__fieldRead561_12()), p1, p2);
    }
    break forest_join_207;
    }
    if (!((__call561_15(life6_14) == __fieldRead561_16()))) {
        break forest_join_112;
    }
    if (!(__fieldRead561_19(__fieldRead561_18(__fieldRead561_17(receiver))))) {
        break forest_join_207;
    }
    life7_61 = __call561_22(__call561_21(__call561_20(life6_14)));
    if (!((__instanceOf561_23(life7_61) != 0))) {
        break forest_join_105;
    }
    life8_67 = __cast561_24(life7_61);
    life9_69 = __call561_25();
    __call561_27(life9_69, __call561_26(life8_67, "name"));
    if (!(__call561_29(life8_67, "type", __invokedynamic561_28(12933, (7595070522890444645L ^ life4_3))))) {
        break forest_join_93;
    }
    life10_88 = __call561_30(life8_67, "type");
    __call561_33(life9_69, __invokedynamic561_32(life10_88, __call561_31(life10_88)));
    }
    __call561_35(life9_69, __call561_34(life8_67, "id"));
    __call561_36(receiver, life9_69, p1, p2);
    break forest_join_111;
    }
    __call561_39(receiver, __invokedynamic561_38(__fieldRead561_37()), p1, p2);
    }
    break forest_join_207;
    }
    if (!((__call561_40(life6_14) == __fieldRead561_41()))) {
        break forest_join_126;
    }
    __call561_46(receiver, __call561_45(__fieldRead561_42(), __call561_44(__call561_43(life6_14))), p1, p2);
    break forest_join_207;
    }
    if (!((__call561_47(life6_14) == __fieldRead561_48()))) {
        break forest_join_207;
    }
    life7_137 = __call561_51(__call561_50(__call561_49(life6_14)));
    if (!((life7_137 != null))) {
        break forest_join_201;
    }
    life8_142 = __call561_52(life7_137);
    moom.CN __stackOp561_54_0 = __sourceUninitializedNEW561_53();
    spill561_0 = __stackOp561_54_0;
    spill561_1 = __stackOp561_54_0;
    if (!(__call561_55(life7_137))) {
        forestValue561_147_0 = spill561_0;
        forestValue561_147_1 = spill561_1;
        break forest_join_147;
    }
    forestValue561_148_0 = spill561_0;
    forestValue561_148_1 = spill561_1;
    forestValue561_148_2 = "achievement";
    break forest_join_148;
    }
    forestValue561_148_0 = forestValue561_147_0;
    forestValue561_148_1 = forestValue561_147_1;
    forestValue561_148_2 = "statistic";
    }
    __explicitNewInit561_57(forestValue561_148_1, __invokedynamic561_56(forestValue561_148_2), new java.lang.Object[0]);
    life9_155 = forestValue561_148_0;
    __call561_60(__call561_58(life9_155), __fieldRead561_59());
    if (!((__instanceOf561_61(life7_137) != 0))) {
        break forest_join_165;
    }
    forestValue561_166_0 = __call561_63(__cast561_62(life7_137));
    break forest_join_166;
    }
    forestValue561_166_0 = null;
    }
    life10_169 = forestValue561_166_0;
    java.lang.String[] __stackOp561_64_0 = new java.lang.String[2];
    spill561_2 = __stackOp561_64_0;
    (__stackOp561_64_0)[0] = __call561_65(life8_142);
    java.lang.String[] __stackOp561_66_0 = spill561_2;
    spill561_3 = __stackOp561_66_0;
    (__stackOp561_66_0)[1] = __call561_67(life9_155);
    life11_183 = __call561_68(spill561_3);
    if (!((life10_169 != null))) {
        break forest_join_195;
    }
    __call561_72(life11_183, __call561_71(__fieldRead561_69(receiver), life10_169, __invokedynamic561_70(18387, (8591172499648817716L ^ life4_3))));
    }
    __call561_73(receiver, life11_183, p1, p2);
    break forest_join_207;
    }
    __call561_76(receiver, __invokedynamic561_75(__fieldRead561_74()), p1, p2);
    }
    __call561_77();
    }
    return;
}
public static void h561_0(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3056100_0(p0);
}
public static void h561_1(net.minecraft.nbt.NBTException p0, net.minecraft.client.gui.GuiScreen p1, int p2, int p3, net.minecraft.item.ItemStack p4) throws Throwable {
    net.minecraft.nbt.NBTException life5_2;
    forest_join_16: {
    forest_join_10: {
    life5_2 = p0;
    if (!((p4 != null))) {
        break forest_join_10;
    }
    __call3056101_0(p1, p4, p2, p3);
    break forest_join_16;
    }
    __call3056101_3(p1, __invokedynamic3056101_2(__fieldRead3056101_1()), p2, p3);
    }
    __call3056101_4();
    return;
}
public static void h561_2(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3056102_0(p0);
}
public static void h561_3(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3056103_0(p0);
}
public static void h561_4(net.minecraft.nbt.NBTException p0, net.minecraft.client.gui.GuiScreen p1, int p2, int p3) throws Throwable {
    net.minecraft.nbt.NBTException life4_2;
    life4_2 = p0;
    __call3056104_2(p1, __invokedynamic3056104_1(__fieldRead3056104_0()), p2, p3);
    __call3056104_3();
    return;
}
public static void h561_5(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3056105_0(p0);
}
public static void h561_6(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3056106_0(p0);
}
public static void h561_7(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3056107_0(p0);
}
public static void h561_8(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3056108_0(p0);
}
private static native long __fieldRead561_0() throws Throwable;
private static native moom.CO __call561_1(net.minecraft.util.IChatComponent a0) throws Throwable;
private static native moom.v3 __call561_2(moom.CO a0) throws Throwable;
private static native moom.CO __call561_3(net.minecraft.util.IChatComponent a0) throws Throwable;
private static native moom.v3 __call561_4(moom.CO a0) throws Throwable;
private static native net.minecraft.event.HoverEvent$Action __call561_5(moom.v3 a0) throws Throwable;
private static native net.minecraft.event.HoverEvent$Action __fieldRead561_6() throws Throwable;
private static native net.minecraft.util.IChatComponent __call561_7(moom.v3 a0) throws Throwable;
private static native java.lang.String __call561_8(net.minecraft.util.IChatComponent a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call561_9(java.lang.String a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call561_10(net.minecraft.nbt.NBTTagCompound a0) throws Throwable;
private static native void __call561_11(net.minecraft.client.gui.GuiScreen a0, net.minecraft.item.ItemStack a1, int a2, int a3) throws Throwable;
private static native net.minecraft.util.EnumChatFormatting __fieldRead561_12() throws Throwable;
private static native java.lang.String __invokedynamic561_13(net.minecraft.util.EnumChatFormatting a0) throws Throwable;
private static native void __call561_14(net.minecraft.client.gui.GuiScreen a0, java.lang.String a1, int a2, int a3) throws Throwable;
private static native net.minecraft.event.HoverEvent$Action __call561_15(moom.v3 a0) throws Throwable;
private static native net.minecraft.event.HoverEvent$Action __fieldRead561_16() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead561_17(net.minecraft.client.gui.GuiScreen a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead561_18(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __fieldRead561_19(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native net.minecraft.util.IChatComponent __call561_20(moom.v3 a0) throws Throwable;
private static native java.lang.String __call561_21(net.minecraft.util.IChatComponent a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call561_22(java.lang.String a0) throws Throwable;
private static native int __instanceOf561_23(net.minecraft.nbt.NBTTagCompound a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __cast561_24(net.minecraft.nbt.NBTTagCompound a0) throws Throwable;
private static native java.util.ArrayList __call561_25() throws Throwable;
private static native java.lang.String __call561_26(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native boolean __call561_27(java.util.ArrayList a0, java.lang.String a1) throws Throwable;
private static native int __invokedynamic561_28(int a0, long a1) throws Throwable;
private static native boolean __call561_29(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native java.lang.String __call561_30(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native int __call561_31(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic561_32(java.lang.String a0, int a1) throws Throwable;
private static native boolean __call561_33(java.util.ArrayList a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call561_34(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native boolean __call561_35(java.util.ArrayList a0, java.lang.String a1) throws Throwable;
private static native void __call561_36(net.minecraft.client.gui.GuiScreen a0, java.util.ArrayList a1, int a2, int a3) throws Throwable;
private static native net.minecraft.util.EnumChatFormatting __fieldRead561_37() throws Throwable;
private static native java.lang.String __invokedynamic561_38(net.minecraft.util.EnumChatFormatting a0) throws Throwable;
private static native void __call561_39(net.minecraft.client.gui.GuiScreen a0, java.lang.String a1, int a2, int a3) throws Throwable;
private static native net.minecraft.event.HoverEvent$Action __call561_40(moom.v3 a0) throws Throwable;
private static native net.minecraft.event.HoverEvent$Action __fieldRead561_41() throws Throwable;
private static native com.google.common.base.Splitter __fieldRead561_42() throws Throwable;
private static native net.minecraft.util.IChatComponent __call561_43(moom.v3 a0) throws Throwable;
private static native java.lang.String __call561_44(net.minecraft.util.IChatComponent a0) throws Throwable;
private static native java.util.List __call561_45(com.google.common.base.Splitter a0, java.lang.String a1) throws Throwable;
private static native void __call561_46(net.minecraft.client.gui.GuiScreen a0, java.util.List a1, int a2, int a3) throws Throwable;
private static native net.minecraft.event.HoverEvent$Action __call561_47(moom.v3 a0) throws Throwable;
private static native net.minecraft.event.HoverEvent$Action __fieldRead561_48() throws Throwable;
private static native net.minecraft.util.IChatComponent __call561_49(moom.v3 a0) throws Throwable;
private static native java.lang.String __call561_50(net.minecraft.util.IChatComponent a0) throws Throwable;
private static native moom.BY __call561_51(java.lang.String a0) throws Throwable;
private static native net.minecraft.util.IChatComponent __call561_52(moom.BY a0) throws Throwable;
private static native moom.CN __sourceUninitializedNEW561_53() throws Throwable;
private static native boolean __call561_55(moom.BY a0) throws Throwable;
private static native java.lang.String __invokedynamic561_56(java.lang.String a0) throws Throwable;
private static native void __explicitNewInit561_57(moom.CN a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native moom.CO __call561_58(moom.CN a0) throws Throwable;
private static native java.lang.Boolean __fieldRead561_59() throws Throwable;
private static native moom.CO __call561_60(moom.CO a0, java.lang.Boolean a1) throws Throwable;
private static native int __instanceOf561_61(moom.BY a0) throws Throwable;
private static native moom.BZ __cast561_62(moom.BY a0) throws Throwable;
private static native java.lang.String __call561_63(moom.BZ a0) throws Throwable;
private static native java.lang.String __call561_65(net.minecraft.util.IChatComponent a0) throws Throwable;
private static native java.lang.String __call561_67(moom.CN a0) throws Throwable;
private static native java.util.ArrayList __call561_68(java.lang.String[] a0) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead561_69(net.minecraft.client.gui.GuiScreen a0) throws Throwable;
private static native int __invokedynamic561_70(int a0, long a1) throws Throwable;
private static native java.util.List __call561_71(net.minecraft.client.gui.FontRenderer a0, java.lang.String a1, int a2) throws Throwable;
private static native boolean __call561_72(java.util.ArrayList a0, java.util.List a1) throws Throwable;
private static native void __call561_73(net.minecraft.client.gui.GuiScreen a0, java.util.ArrayList a1, int a2, int a3) throws Throwable;
private static native net.minecraft.util.EnumChatFormatting __fieldRead561_74() throws Throwable;
private static native java.lang.String __invokedynamic561_75(net.minecraft.util.EnumChatFormatting a0) throws Throwable;
private static native void __call561_76(net.minecraft.client.gui.GuiScreen a0, java.lang.String a1, int a2, int a3) throws Throwable;
private static native void __call561_77() throws Throwable;
private static native java.lang.Exception __call3056100_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native void __call3056101_0(net.minecraft.client.gui.GuiScreen a0, net.minecraft.item.ItemStack a1, int a2, int a3) throws Throwable;
private static native net.minecraft.util.EnumChatFormatting __fieldRead3056101_1() throws Throwable;
private static native java.lang.String __invokedynamic3056101_2(net.minecraft.util.EnumChatFormatting a0) throws Throwable;
private static native void __call3056101_3(net.minecraft.client.gui.GuiScreen a0, java.lang.String a1, int a2, int a3) throws Throwable;
private static native void __call3056101_4() throws Throwable;
private static native java.lang.Exception __call3056102_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3056103_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native net.minecraft.util.EnumChatFormatting __fieldRead3056104_0() throws Throwable;
private static native java.lang.String __invokedynamic3056104_1(net.minecraft.util.EnumChatFormatting a0) throws Throwable;
private static native void __call3056104_2(net.minecraft.client.gui.GuiScreen a0, java.lang.String a1, int a2, int a3) throws Throwable;
private static native void __call3056104_3() throws Throwable;
private static native java.lang.Exception __call3056105_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3056106_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3056107_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3056108_0(net.minecraft.nbt.NBTException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_4af452f8448564ab9c3a(net.minecraft.client.gui.GuiScreen a0, boolean a1, int a2) throws E;
private static final class __SourceHandler_4af452f8448564ab9c3a {

public static void f2287(net.minecraft.client.gui.GuiScreen receiver, boolean p0, int p1) throws Throwable {
    long life3_3;
    life3_3 = (__fieldRead2287_0() ^ 99546614843140L);
    if ((p1 == __invokedynamic2287_1(30296, (691199689898170519L ^ life3_3)))) {
        if (p0) {
        __call2287_3(receiver, __fieldRead2287_2(receiver));
    }
        __fieldWrite2287_4(receiver, null);
        __call2287_6(__fieldRead2287_5(receiver), receiver);
    }
    return;
}
public static void h2287_0(moom.Oo p0) throws Throwable {
    throw __call1228700_0(p0);
}
public static void h2287_1(moom.Oo p0) throws Throwable {
    throw __call1228701_0(p0);
}
private static native long __fieldRead2287_0() throws Throwable;
private static native int __invokedynamic2287_1(int a0, long a1) throws Throwable;
private static native java.net.URI __fieldRead2287_2(net.minecraft.client.gui.GuiScreen a0) throws Throwable;
private static native void __call2287_3(net.minecraft.client.gui.GuiScreen a0, java.net.URI a1) throws Throwable;
private static native void __fieldWrite2287_4(net.minecraft.client.gui.GuiScreen a0, java.lang.Object a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2287_5(net.minecraft.client.gui.GuiScreen a0) throws Throwable;
private static native void __call2287_6(net.minecraft.client.Minecraft a0, net.minecraft.client.gui.GuiScreen a1) throws Throwable;
private static native java.lang.Exception __call1228700_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1228701_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_35129df433c3ce3119c2() throws E;
private static final class __SourceHandler_35129df433c3ce3119c2 {

public static java.lang.String f223() throws Throwable {
    java.awt.datatransfer.Transferable life0_4;
    life0_4 = __call223_2(__call223_1(__call223_0()), null);
    if ((life0_4 != null)) {
        if (__call223_4(life0_4, __fieldRead223_3())) {
        return __cast223_7(__call223_6(life0_4, __fieldRead223_5()));
    }
    }
    return "";
}
public static java.lang.String h223_0(java.lang.Exception p0) throws Throwable {
    throw __call2022300_0(p0);
}
public static java.lang.String h223_1(java.lang.Exception p0) throws Throwable {
    java.lang.Exception local1 = p0;
    return "";
}
private static native java.awt.Toolkit __call223_0() throws Throwable;
private static native java.awt.datatransfer.Clipboard __call223_1(java.awt.Toolkit a0) throws Throwable;
private static native java.awt.datatransfer.Transferable __call223_2(java.awt.datatransfer.Clipboard a0, java.lang.Object a1) throws Throwable;
private static native java.awt.datatransfer.DataFlavor __fieldRead223_3() throws Throwable;
private static native boolean __call223_4(java.awt.datatransfer.Transferable a0, java.awt.datatransfer.DataFlavor a1) throws Throwable;
private static native java.awt.datatransfer.DataFlavor __fieldRead223_5() throws Throwable;
private static native java.lang.Object __call223_6(java.awt.datatransfer.Transferable a0, java.awt.datatransfer.DataFlavor a1) throws Throwable;
private static native java.lang.String __cast223_7(java.lang.Object a0) throws Throwable;
private static native java.lang.Exception __call2022300_0(java.lang.Exception a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_ee263e61e210ca572e62(net.minecraft.client.gui.GuiScreen a0, int a1) throws E;
private static final class __SourceHandler_ee263e61e210ca572e62 {

public static void f2289(net.minecraft.client.gui.GuiScreen receiver, int p0) throws Throwable {
    long life2_3;
    life2_3 = (__fieldRead2289_0() ^ 40319433629133L);
    if ((__fieldRead2289_2(__fieldRead2289_1(receiver)) != null)) {
        __call2289_7(receiver, 0, 0, __fieldRead2289_3(receiver), __fieldRead2289_4(receiver), __invokedynamic2289_5(25846, (3550262039531327736L ^ life2_3)), __invokedynamic2289_6(25411, (1085178870418675527L ^ life2_3)));
    } else {
        __call2289_8(receiver, p0);
    }
    return;
}
public static void h2289_0(moom.Oo p0) throws Throwable {
    throw __call1228900_0(p0);
}
private static native long __fieldRead2289_0() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2289_1(net.minecraft.client.gui.GuiScreen a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead2289_2(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __fieldRead2289_3(net.minecraft.client.gui.GuiScreen a0) throws Throwable;
private static native int __fieldRead2289_4(net.minecraft.client.gui.GuiScreen a0) throws Throwable;
private static native int __invokedynamic2289_5(int a0, long a1) throws Throwable;
private static native int __invokedynamic2289_6(int a0, long a1) throws Throwable;
private static native void __call2289_7(net.minecraft.client.gui.GuiScreen a0, int a1, int a2, int a3, int a4, int a5, int a6) throws Throwable;
private static native void __call2289_8(net.minecraft.client.gui.GuiScreen a0, int a1) throws Throwable;
private static native java.lang.Exception __call1228900_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_82d0387b0bee872ab723(net.minecraft.client.gui.GuiScreen a0, int a1, int a2, int a3) throws E;
private static final class __SourceHandler_82d0387b0bee872ab723 {

public static void f2290(net.minecraft.client.gui.GuiScreen receiver, int p0, int p1, int p2) throws Throwable {
    if ((__fieldRead2290_0(receiver) != null)) {
        if ((p2 == 0)) {
        __call2290_2(__fieldRead2290_1(receiver), p0, p1);
        __fieldWrite2290_3(receiver, null);
    }
    }
    return;
}
public static void h2290_0(moom.Oo p0) throws Throwable {
    throw __call1229000_0(p0);
}
public static void h2290_1(moom.Oo p0) throws Throwable {
    throw __call1229001_0(p0);
}
private static native moom.gc __fieldRead2290_0(net.minecraft.client.gui.GuiScreen a0) throws Throwable;
private static native moom.gc __fieldRead2290_1(net.minecraft.client.gui.GuiScreen a0) throws Throwable;
private static native void __call2290_2(moom.gc a0, int a1, int a2) throws Throwable;
private static native void __fieldWrite2290_3(net.minecraft.client.gui.GuiScreen a0, java.lang.Object a1) throws Throwable;
private static native java.lang.Exception __call1229000_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1229001_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_959ee6eaa59c753d0279(int a0) throws E;
private static final class __SourceHandler_959ee6eaa59c753d0279 {

public static boolean f1322(int p0) throws Throwable {
    int forwardValue1322_20_0;
    long life1_3;
    forward_join_20: {
    forward_join_19: {
    life1_3 = (__fieldRead1322_0() ^ 34672302040172L);
    if (!((p0 == __invokedynamic1322_1(11713, (641384371835510864L ^ life1_3))))) {
        break forward_join_19;
    }
    if (!(__call1322_2())) {
        break forward_join_19;
    }
    if (!((!__call1322_3()))) {
        break forward_join_19;
    }
    if (!((!__call1322_4()))) {
        break forward_join_19;
    }
    forwardValue1322_20_0 = 1;
    break forward_join_20;
    }
    forwardValue1322_20_0 = 0;
    }
    return __integerCategory1322_5(forwardValue1322_20_0);
}
public static void h1322_0(moom.Oo p0) throws Throwable {
    throw __call1132200_0(p0);
}
public static void h1322_1(moom.Oo p0) throws Throwable {
    throw __call1132201_0(p0);
}
public static void h1322_2(moom.Oo p0) throws Throwable {
    throw __call1132202_0(p0);
}
public static void h1322_3(moom.Oo p0) throws Throwable {
    throw __call1132203_0(p0);
}
private static native long __fieldRead1322_0() throws Throwable;
private static native int __invokedynamic1322_1(int a0, long a1) throws Throwable;
private static native boolean __call1322_2() throws Throwable;
private static native boolean __call1322_3() throws Throwable;
private static native boolean __call1322_4() throws Throwable;
private static native boolean __integerCategory1322_5(int value) throws Throwable;
private static native java.lang.Exception __call1132200_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1132201_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1132202_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1132203_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_c5be45195131ce56ee46() throws E;
private static final class __SourceHandler_c5be45195131ce56ee46 {

public static boolean f1323() throws Throwable {
    int forwardValue1323_41_0;
    long life0_3;
    forward_join_41: {
    forward_join_40: {
    forward_join_38: {
    forward_join_24: {
    forward_join_22: {
    forward_join_20: {
    life0_3 = (__fieldRead1323_0() ^ 26314590321688L);
    if (!(__fieldRead1323_1())) {
        break forward_join_24;
    }
    if (!((!__call1323_3(__invokedynamic1323_2(21020, (6472838105363154889L ^ life0_3)))))) {
        break forward_join_20;
    }
    if (!(__call1323_5(__invokedynamic1323_4(17691, (4040596301628281052L ^ life0_3))))) {
        break forward_join_22;
    }
    }
    forwardValue1323_41_0 = 1;
    break forward_join_41;
    }
    forwardValue1323_41_0 = 0;
    break forward_join_41;
    }
    if (!((!__call1323_7(__invokedynamic1323_6(21082, (1685990103523690371L ^ life0_3)))))) {
        break forward_join_38;
    }
    if (!(__call1323_9(__invokedynamic1323_8(8541, (3061813894933214355L ^ life0_3))))) {
        break forward_join_40;
    }
    }
    forwardValue1323_41_0 = 1;
    break forward_join_41;
    }
    forwardValue1323_41_0 = 0;
    }
    return __integerCategory1323_10(forwardValue1323_41_0);
}
public static void h1323_0(moom.Oo p0) throws Throwable {
    throw __call1132300_0(p0);
}
public static void h1323_1(moom.Oo p0) throws Throwable {
    throw __call1132301_0(p0);
}
public static void h1323_2(moom.Oo p0) throws Throwable {
    throw __call1132302_0(p0);
}
public static void h1323_3(moom.Oo p0) throws Throwable {
    throw __call1132303_0(p0);
}
public static void h1323_4(moom.Oo p0) throws Throwable {
    throw __call1132304_0(p0);
}
private static native long __fieldRead1323_0() throws Throwable;
private static native boolean __fieldRead1323_1() throws Throwable;
private static native int __invokedynamic1323_2(int a0, long a1) throws Throwable;
private static native boolean __call1323_3(int a0) throws Throwable;
private static native int __invokedynamic1323_4(int a0, long a1) throws Throwable;
private static native boolean __call1323_5(int a0) throws Throwable;
private static native int __invokedynamic1323_6(int a0, long a1) throws Throwable;
private static native boolean __call1323_7(int a0) throws Throwable;
private static native int __invokedynamic1323_8(int a0, long a1) throws Throwable;
private static native boolean __call1323_9(int a0) throws Throwable;
private static native boolean __integerCategory1323_10(int value) throws Throwable;
private static native java.lang.Exception __call1132300_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1132301_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1132302_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1132303_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1132304_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_cadda67214a8c3c0d9b8() throws E;
private static final class __SourceHandler_cadda67214a8c3c0d9b8 {

public static boolean f1324() throws Throwable {
    int forwardValue1324_21_0;
    long life0_3;
    forward_join_21: {
    forward_join_20: {
    forward_join_18: {
    life0_3 = (__fieldRead1324_0() ^ 114096312799400L);
    if (!((!__call1324_2(__invokedynamic1324_1(4025, (8376462776047204032L ^ life0_3)))))) {
        break forward_join_18;
    }
    if (!(__call1324_4(__invokedynamic1324_3(13207, (5469377539408415468L ^ life0_3))))) {
        break forward_join_20;
    }
    }
    forwardValue1324_21_0 = 1;
    break forward_join_21;
    }
    forwardValue1324_21_0 = 0;
    }
    return __integerCategory1324_5(forwardValue1324_21_0);
}
public static void h1324_0(moom.Oo p0) throws Throwable {
    throw __call1132400_0(p0);
}
public static void h1324_1(moom.Oo p0) throws Throwable {
    throw __call1132401_0(p0);
}
private static native long __fieldRead1324_0() throws Throwable;
private static native int __invokedynamic1324_1(int a0, long a1) throws Throwable;
private static native boolean __call1324_2(int a0) throws Throwable;
private static native int __invokedynamic1324_3(int a0, long a1) throws Throwable;
private static native boolean __call1324_4(int a0) throws Throwable;
private static native boolean __integerCategory1324_5(int value) throws Throwable;
private static native java.lang.Exception __call1132400_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1132401_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_28080466cd6fa694ebef(int a0) throws E;
private static final class __SourceHandler_28080466cd6fa694ebef {

public static boolean f1325(int p0) throws Throwable {
    int forwardValue1325_20_0;
    long life1_3;
    forward_join_20: {
    forward_join_19: {
    life1_3 = (__fieldRead1325_0() ^ 8232967968480L);
    if (!((p0 == __invokedynamic1325_1(4634, (4965503441889045814L ^ life1_3))))) {
        break forward_join_19;
    }
    if (!(__call1325_2())) {
        break forward_join_19;
    }
    if (!((!__call1325_3()))) {
        break forward_join_19;
    }
    if (!((!__call1325_4()))) {
        break forward_join_19;
    }
    forwardValue1325_20_0 = 1;
    break forward_join_20;
    }
    forwardValue1325_20_0 = 0;
    }
    return __integerCategory1325_5(forwardValue1325_20_0);
}
public static void h1325_0(moom.Oo p0) throws Throwable {
    throw __call1132500_0(p0);
}
public static void h1325_1(moom.Oo p0) throws Throwable {
    throw __call1132501_0(p0);
}
public static void h1325_2(moom.Oo p0) throws Throwable {
    throw __call1132502_0(p0);
}
public static void h1325_3(moom.Oo p0) throws Throwable {
    throw __call1132503_0(p0);
}
private static native long __fieldRead1325_0() throws Throwable;
private static native int __invokedynamic1325_1(int a0, long a1) throws Throwable;
private static native boolean __call1325_2() throws Throwable;
private static native boolean __call1325_3() throws Throwable;
private static native boolean __call1325_4() throws Throwable;
private static native boolean __integerCategory1325_5(int value) throws Throwable;
private static native java.lang.Exception __call1132500_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1132501_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1132502_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1132503_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_43861d70b8329af33dc0(net.minecraft.client.gui.GuiScreen a0) throws E;
private static final class __SourceHandler_43861d70b8329af33dc0 {

public static void f100150(net.minecraft.client.gui.GuiScreen receiver) throws Throwable {
    forest_join_14: {
    forest_join_7: {
    if (!(__call100150_0())) {
        break forest_join_7;
    }
    forest_cycle_2: while (true) {
    if (!(__call100150_1())) {
        break forest_join_7;
    }
    __call100150_2(receiver);
    continue forest_cycle_2;
    }
    }
    if (!(__call100150_3())) {
        break forest_join_14;
    }
    forest_cycle_9: while (true) {
    if (!(__call100150_4())) {
        break forest_join_14;
    }
    __call100150_5(receiver);
    continue forest_cycle_9;
    }
    }
    return;
}
public static void h100150_0(java.io.IOException p0) throws Throwable {
    throw __call13015000_0(p0);
}
public static void h100150_1(java.io.IOException p0) throws Throwable {
    throw __call13015001_0(p0);
}
public static void h100150_2(java.io.IOException p0) throws Throwable {
    throw __call13015002_0(p0);
}
public static void h100150_3(java.io.IOException p0) throws Throwable {
    throw __call13015003_0(p0);
}
private static native boolean __call100150_0() throws Throwable;
private static native boolean __call100150_1() throws Throwable;
private static native void __call100150_2(net.minecraft.client.gui.GuiScreen a0) throws Throwable;
private static native boolean __call100150_3() throws Throwable;
private static native boolean __call100150_4() throws Throwable;
private static native void __call100150_5(net.minecraft.client.gui.GuiScreen a0) throws Throwable;
private static native java.lang.Exception __call13015000_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call13015001_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call13015002_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call13015003_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_314d39a331daf00bbd90(int a0) throws E;
private static final class __SourceHandler_314d39a331daf00bbd90 {

public static boolean f1326(int p0) throws Throwable {
    int forwardValue1326_20_0;
    long life1_3;
    forward_join_20: {
    forward_join_19: {
    life1_3 = (__fieldRead1326_0() ^ 128547906692428L);
    if (!((p0 == __invokedynamic1326_1(3913, (8637254614253306834L ^ life1_3))))) {
        break forward_join_19;
    }
    if (!(__call1326_2())) {
        break forward_join_19;
    }
    if (!((!__call1326_3()))) {
        break forward_join_19;
    }
    if (!((!__call1326_4()))) {
        break forward_join_19;
    }
    forwardValue1326_20_0 = 1;
    break forward_join_20;
    }
    forwardValue1326_20_0 = 0;
    }
    return __integerCategory1326_5(forwardValue1326_20_0);
}
public static void h1326_0(moom.Oo p0) throws Throwable {
    throw __call1132600_0(p0);
}
public static void h1326_1(moom.Oo p0) throws Throwable {
    throw __call1132601_0(p0);
}
public static void h1326_2(moom.Oo p0) throws Throwable {
    throw __call1132602_0(p0);
}
public static void h1326_3(moom.Oo p0) throws Throwable {
    throw __call1132603_0(p0);
}
private static native long __fieldRead1326_0() throws Throwable;
private static native int __invokedynamic1326_1(int a0, long a1) throws Throwable;
private static native boolean __call1326_2() throws Throwable;
private static native boolean __call1326_3() throws Throwable;
private static native boolean __call1326_4() throws Throwable;
private static native boolean __integerCategory1326_5(int value) throws Throwable;
private static native java.lang.Exception __call1132600_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1132601_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1132602_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1132603_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_7e497a6b097e37584d81() throws E;
private static final class __SourceHandler_7e497a6b097e37584d81 {

public static boolean f1327() throws Throwable {
    int forwardValue1327_21_0;
    long life0_3;
    forward_join_21: {
    forward_join_20: {
    forward_join_18: {
    life0_3 = (__fieldRead1327_0() ^ 12744048734867L);
    if (!((!__call1327_2(__invokedynamic1327_1(8269, (3556750946245180170L ^ life0_3)))))) {
        break forward_join_18;
    }
    if (!(__call1327_4(__invokedynamic1327_3(28422, (1512534090512348239L ^ life0_3))))) {
        break forward_join_20;
    }
    }
    forwardValue1327_21_0 = 1;
    break forward_join_21;
    }
    forwardValue1327_21_0 = 0;
    }
    return __integerCategory1327_5(forwardValue1327_21_0);
}
public static void h1327_0(moom.Oo p0) throws Throwable {
    throw __call1132700_0(p0);
}
public static void h1327_1(moom.Oo p0) throws Throwable {
    throw __call1132701_0(p0);
}
private static native long __fieldRead1327_0() throws Throwable;
private static native int __invokedynamic1327_1(int a0, long a1) throws Throwable;
private static native boolean __call1327_2(int a0) throws Throwable;
private static native int __invokedynamic1327_3(int a0, long a1) throws Throwable;
private static native boolean __call1327_4(int a0) throws Throwable;
private static native boolean __integerCategory1327_5(int value) throws Throwable;
private static native java.lang.Exception __call1132700_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1132701_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_56815c44bb1afc0f30aa(net.minecraft.client.gui.GuiScreen a0) throws E;
private static final class __SourceHandler_56815c44bb1afc0f30aa {

public static void f200008(net.minecraft.client.gui.GuiScreen receiver) throws Throwable {
    int spill200008_0;
    int spill200008_1;
    int life1_8;
    int life2_22;
    int life3_24;
    long life4_98;
    forest_join_101: {
    forest_join_80: {
    forest_join_71: {
    forest_join_54: {
    forest_join_41: {
    life1_8 = ((__call200008_0() * __fieldRead200008_1(receiver)) / __fieldRead200008_3(__fieldRead200008_2(receiver)));
    life2_22 = ((__fieldRead200008_4(receiver) - ((__call200008_5() * __fieldRead200008_6(receiver)) / __fieldRead200008_8(__fieldRead200008_7(receiver)))) - 1);
    life3_24 = __call200008_9();
    if (!(__call200008_10())) {
        break forest_join_54;
    }
    if (!(__fieldRead200008_13(__fieldRead200008_12(__fieldRead200008_11(receiver))))) {
        break forest_join_41;
    }
    net.minecraft.client.gui.GuiScreen __stackOp200008_14_0 = receiver;
    net.minecraft.client.gui.GuiScreen __stackOp200008_16_0 = __stackOp200008_14_0;
    int __stackOp200008_16_1 = __fieldRead200008_15(__stackOp200008_14_0);
    spill200008_0 = __stackOp200008_16_1;
    __fieldWrite200008_17(__stackOp200008_16_0, (__stackOp200008_16_1 + 1));
    if (!((spill200008_0 > 0))) {
        break forest_join_41;
    }
    return;
    }
    __fieldWrite200008_18(receiver, life3_24);
    __fieldWrite200008_20(receiver, __call200008_19());
    __call200008_22(receiver, life1_8, life2_22, __fieldRead200008_21(receiver));
    break forest_join_101;
    }
    if (!((life3_24 != -1))) {
        break forest_join_80;
    }
    if (!(__fieldRead200008_25(__fieldRead200008_24(__fieldRead200008_23(receiver))))) {
        break forest_join_71;
    }
    net.minecraft.client.gui.GuiScreen __stackOp200008_26_0 = receiver;
    net.minecraft.client.gui.GuiScreen __stackOp200008_28_0 = __stackOp200008_26_0;
    int __stackOp200008_28_1 = (__fieldRead200008_27(__stackOp200008_26_0) - 1);
    spill200008_1 = __stackOp200008_28_1;
    __fieldWrite200008_29(__stackOp200008_28_0, __stackOp200008_28_1);
    if (!((spill200008_1 > 0))) {
        break forest_join_71;
    }
    return;
    }
    __fieldWrite200008_30(receiver, -1);
    __call200008_31(receiver, life1_8, life2_22, life3_24);
    break forest_join_101;
    }
    if (!((__fieldRead200008_32(receiver) != -1))) {
        break forest_join_101;
    }
    if (!((__numericCompare200008_34(__fieldRead200008_33(receiver), 0L) > 0))) {
        break forest_join_101;
    }
    life4_98 = (__call200008_35() - __fieldRead200008_36(receiver));
    __call200008_38(receiver, life1_8, life2_22, __fieldRead200008_37(receiver), life4_98);
    }
    return;
}
public static void h200008_0(java.io.IOException p0) throws Throwable {
    throw __call23000800_0(p0);
}
public static void h200008_1(java.io.IOException p0) throws Throwable {
    throw __call23000801_0(p0);
}
public static void h200008_2(java.io.IOException p0) throws Throwable {
    throw __call23000802_0(p0);
}
public static void h200008_3(java.io.IOException p0) throws Throwable {
    throw __call23000803_0(p0);
}
public static void h200008_4(java.io.IOException p0) throws Throwable {
    throw __call23000804_0(p0);
}
public static void h200008_5(java.io.IOException p0) throws Throwable {
    throw __call23000805_0(p0);
}
public static void h200008_6(java.io.IOException p0) throws Throwable {
    throw __call23000806_0(p0);
}
private static native int __call200008_0() throws Throwable;
private static native int __fieldRead200008_1(net.minecraft.client.gui.GuiScreen a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead200008_2(net.minecraft.client.gui.GuiScreen a0) throws Throwable;
private static native int __fieldRead200008_3(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __fieldRead200008_4(net.minecraft.client.gui.GuiScreen a0) throws Throwable;
private static native int __call200008_5() throws Throwable;
private static native int __fieldRead200008_6(net.minecraft.client.gui.GuiScreen a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead200008_7(net.minecraft.client.gui.GuiScreen a0) throws Throwable;
private static native int __fieldRead200008_8(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __call200008_9() throws Throwable;
private static native boolean __call200008_10() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead200008_11(net.minecraft.client.gui.GuiScreen a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead200008_12(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __fieldRead200008_13(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native int __fieldRead200008_15(net.minecraft.client.gui.GuiScreen a0) throws Throwable;
private static native void __fieldWrite200008_17(net.minecraft.client.gui.GuiScreen a0, int a1) throws Throwable;
private static native void __fieldWrite200008_18(net.minecraft.client.gui.GuiScreen a0, int a1) throws Throwable;
private static native long __call200008_19() throws Throwable;
private static native void __fieldWrite200008_20(net.minecraft.client.gui.GuiScreen a0, long a1) throws Throwable;
private static native int __fieldRead200008_21(net.minecraft.client.gui.GuiScreen a0) throws Throwable;
private static native void __call200008_22(net.minecraft.client.gui.GuiScreen a0, int a1, int a2, int a3) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead200008_23(net.minecraft.client.gui.GuiScreen a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead200008_24(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __fieldRead200008_25(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native int __fieldRead200008_27(net.minecraft.client.gui.GuiScreen a0) throws Throwable;
private static native void __fieldWrite200008_29(net.minecraft.client.gui.GuiScreen a0, int a1) throws Throwable;
private static native void __fieldWrite200008_30(net.minecraft.client.gui.GuiScreen a0, int a1) throws Throwable;
private static native void __call200008_31(net.minecraft.client.gui.GuiScreen a0, int a1, int a2, int a3) throws Throwable;
private static native int __fieldRead200008_32(net.minecraft.client.gui.GuiScreen a0) throws Throwable;
private static native long __fieldRead200008_33(net.minecraft.client.gui.GuiScreen a0) throws Throwable;
private static native int __numericCompare200008_34(long a0, long a1) throws Throwable;
private static native long __call200008_35() throws Throwable;
private static native long __fieldRead200008_36(net.minecraft.client.gui.GuiScreen a0) throws Throwable;
private static native int __fieldRead200008_37(net.minecraft.client.gui.GuiScreen a0) throws Throwable;
private static native void __call200008_38(net.minecraft.client.gui.GuiScreen a0, int a1, int a2, int a3, long a4) throws Throwable;
private static native java.lang.Exception __call23000800_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call23000801_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call23000802_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call23000803_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call23000804_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call23000805_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call23000806_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_4d010be3cff0060018f4(java.lang.String a0) throws E;
private static final class __SourceHandler_4d010be3cff0060018f4 {

public static void f224(java.lang.String p0) throws Throwable {
    java.awt.datatransfer.StringSelection life1_7;
    if ((!__call224_0(p0))) {
        life1_7 = new java.awt.datatransfer.StringSelection(p0);
        __call224_3(__call224_2(__call224_1()), life1_7, null);
    }
    return;
}
public static void h224_0(java.lang.Exception p0) throws Throwable {
    java.lang.Exception local1 = p0;
    return;
}
private static native boolean __call224_0(java.lang.String a0) throws Throwable;
private static native java.awt.Toolkit __call224_1() throws Throwable;
private static native java.awt.datatransfer.Clipboard __call224_2(java.awt.Toolkit a0) throws Throwable;
private static native void __call224_3(java.awt.datatransfer.Clipboard a0, java.awt.datatransfer.StringSelection a1, java.lang.Object a2) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_da8e4d15fe4d54f13335(net.minecraft.client.gui.GuiScreen a0) throws E;
private static final class __SourceHandler_da8e4d15fe4d54f13335 {

public static void f100149(net.minecraft.client.gui.GuiScreen receiver) throws Throwable {
    forest_join_6: {
    if (!(__call100149_0())) {
        break forest_join_6;
    }
    __call100149_3(receiver, __call100149_1(), __call100149_2());
    }
    __call100149_5(__fieldRead100149_4(receiver));
    return;
}
public static void h100149_0(java.io.IOException p0) throws Throwable {
    throw __call13014900_0(p0);
}
private static native boolean __call100149_0() throws Throwable;
private static native char __call100149_1() throws Throwable;
private static native int __call100149_2() throws Throwable;
private static native void __call100149_3(net.minecraft.client.gui.GuiScreen a0, char a1, int a2) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead100149_4(net.minecraft.client.gui.GuiScreen a0) throws Throwable;
private static native void __call100149_5(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.lang.Exception __call13014900_0(java.io.IOException a0) throws Throwable;

}


public void i() {
((net.minecraft.client.gui.GuiScreen)(this)).b(((int)(0)));
    return;
}


public static boolean b__Boolean(int p0) { return __sourceHandlerCall_959ee6eaa59c753d0279(p0); }


public static boolean b__BooleanStatic() { return __sourceHandlerCall_c5be45195131ce56ee46(); }


public void b(java.lang.String p0, boolean p1) {
try {
        if (p1) {
        ((moom.gB)(((net.minecraft.client.gui.GuiIngame)(((net.minecraft.client.Minecraft)(this.i)).T)).a__gB())).a(((java.lang.String)(p0)));
    }
    } catch (moom.Oo caught_rethrow_0) {
        throw net.minecraft.client.gui.GuiScreen.b(((java.lang.Exception)(caught_rethrow_0)));
    }
    ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(this.i)).K)).b(((java.lang.String)(p0)));
    return;
}


public void b(int p0) { __sourceHandlerCall_ee263e61e210ca572e62(this, p0); }


protected void b(int p0, int p1, int p2) { __sourceHandlerCall_82d0387b0bee872ab723(this, p0, p1, p2); }


public static void b(net.minecraft.entity.Entity[] p0) {
v = ((net.minecraft.entity.Entity[])(p0));
    return;
}


public void b(net.minecraft.client.Minecraft p0, int p1, int p2) {
((net.minecraft.client.gui.GuiScreen)(this)).a(((net.minecraft.client.Minecraft)(p0)), ((int)(p1)), ((int)(p2)));
    return;
}


private static java.lang.Exception b(java.lang.Exception p0) {
return p0;
}


public void e() throws java.io.IOException { __sourceHandlerCall_56815c44bb1afc0f30aa(this); }


public static void e(java.lang.String p0) { __sourceHandlerCall_4d010be3cff0060018f4(p0); }


public void c__Void() {
return;
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral10338_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/gE"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.client.gui.GuiScreen.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int c(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 14657;
      if (kb[var3] == null) {
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
         long var5 = jb[var3];
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
         Object[] var9 = (Object[])lb.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               lb.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/gE", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         kb[var3] = var15;
      }

      return kb[var3];
}


public static boolean c__Boolean(int p0) { return __sourceHandlerCall_28080466cd6fa694ebef(p0); }


public static boolean c__Boolean() { return __sourceHandlerCall_cadda67214a8c3c0d9b8(); }


public void c(int p0) {
long local2 = (net.minecraft.client.gui.GuiScreen.db ^ 108755381709083L);
    moom.kZ.f();
    moom.kZ.n();
    net.minecraft.client.renderer.Tessellator local4 = net.minecraft.client.renderer.Tessellator.a();
    moom.lw local5 = ((net.minecraft.client.renderer.Tessellator)(local4)).a__lw();
    ((net.minecraft.client.renderer.texture.TextureManager)(((net.minecraft.client.Minecraft)(this.i)).a__ok())).a__Void(((moom.DD)(net.minecraft.client.gui.GuiScreen.a)));
    moom.kZ.c(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    float local6 = 0x1.0p5f;
    ((moom.lw)(local5)).a(((int)(__sourceIntrinsic_15c946d67bc3_originalDynamicSite1792_10(12363, (8299335865446035595L ^ local2)))), ((moom.oD)(moom.oB.k)));
    ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(local5)).a(((double)(0x0.0p0d)), ((double)(((double) this.l))), ((double)(0x0.0p0d))))).a(((double)(0x0.0p0d)), ((double)(((double) ((((float) this.l) / 0x1.0p5f) + ((float) p0)))))))).a(((int)(__sourceIntrinsic_15c946d67bc3_originalDynamicSite1792_17(8120, (1891059209445564269L ^ local2)))), ((int)(__sourceIntrinsic_15c946d67bc3_originalDynamicSite1792_18(18013, (6376347189695841926L ^ local2)))), ((int)(__sourceIntrinsic_15c946d67bc3_originalDynamicSite1792_19(18013, (6376347189695841926L ^ local2)))), ((int)(__sourceIntrinsic_15c946d67bc3_originalDynamicSite1792_20(19010, (8975656464059239057L ^ local2))))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(local5)).a(((double)(((double) this.k))), ((double)(((double) this.l))), ((double)(0x0.0p0d))))).a(((double)(((double) (((float) this.k) / 0x1.0p5f)))), ((double)(((double) ((((float) this.l) / 0x1.0p5f) + ((float) p0)))))))).a(((int)(__sourceIntrinsic_15c946d67bc3_originalDynamicSite1792_29(18013, (6376347189695841926L ^ local2)))), ((int)(__sourceIntrinsic_15c946d67bc3_originalDynamicSite1792_30(18013, (6376347189695841926L ^ local2)))), ((int)(__sourceIntrinsic_15c946d67bc3_originalDynamicSite1792_31(18013, (6376347189695841926L ^ local2)))), ((int)(__sourceIntrinsic_15c946d67bc3_originalDynamicSite1792_32(7838, (6099530939560484423L ^ local2))))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(local5)).a(((double)(((double) this.k))), ((double)(0x0.0p0d)), ((double)(0x0.0p0d))))).a(((double)(((double) (((float) this.k) / 0x1.0p5f)))), ((double)(((double) p0)))))).a(((int)(__sourceIntrinsic_15c946d67bc3_originalDynamicSite1792_39(18013, (6376347189695841926L ^ local2)))), ((int)(__sourceIntrinsic_15c946d67bc3_originalDynamicSite1792_40(18013, (6376347189695841926L ^ local2)))), ((int)(__sourceIntrinsic_15c946d67bc3_originalDynamicSite1792_41(18013, (6376347189695841926L ^ local2)))), ((int)(__sourceIntrinsic_15c946d67bc3_originalDynamicSite1792_42(7838, (6099530939560484423L ^ local2))))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(local5)).a(((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d))))).a(((double)(0x0.0p0d)), ((double)(((double) p0)))))).a(((int)(__sourceIntrinsic_15c946d67bc3_originalDynamicSite1792_47(18013, (6376347189695841926L ^ local2)))), ((int)(__sourceIntrinsic_15c946d67bc3_originalDynamicSite1792_48(18013, (6376347189695841926L ^ local2)))), ((int)(__sourceIntrinsic_15c946d67bc3_originalDynamicSite1792_49(18013, (6376347189695841926L ^ local2)))), ((int)(__sourceIntrinsic_15c946d67bc3_originalDynamicSite1792_50(7838, (6099530939560484423L ^ local2))))))).c__Void();
    ((net.minecraft.client.renderer.Tessellator)(local4)).a__Void();
    return;
}


public void h() {
return;
}


public void f(java.lang.String p0) {
((net.minecraft.client.gui.GuiScreen)(this)).b(((java.lang.String)(p0)), ((boolean)(true)));
    return;
}


public void f() throws java.io.IOException { __sourceHandlerCall_da8e4d15fe4d54f13335(this); }


public static boolean d__Boolean() { return __sourceHandlerCall_7e497a6b097e37584d81(); }


public static boolean d(int p0) { return __sourceHandlerCall_314d39a331daf00bbd90(p0); }


public void d() throws java.io.IOException { __sourceHandlerCall_43861d70b8329af33dc0(this); }


protected void a(java.lang.String p0, int p1, int p2) {
((net.minecraft.client.gui.GuiScreen)(this)).a(((java.util.List)(java.util.Collections.singletonList(((java.lang.Object)(p0))))), ((int)(p1)), ((int)(p2)));
    return;
}


protected void a(java.util.List<java.lang.String> p0, int p1, int p2) { __sourceHandlerCall_cd02075a2313d7d266db(this, p0, p1, p2); }


protected void a(java.lang.String p0, boolean p1) {
return;
}


protected void a(net.minecraft.util.IChatComponent p0, int p1, int p2) { __sourceHandlerCall_63fa166fe13f7e1dceab(this, p0, p1, p2); }


public void a(int p0, int p1, float p2) {
int life4_1;
    moom.gc life5_12;
    int life4_22;
    moom.gA life5_33;
    life4_1 = 0;
    while ((life4_1 < ((java.util.List)(this.m)).size())) {
        life5_12 = ((moom.gc)(((java.util.List)(this.m)).get(((int)(life4_1)))));
        ((moom.gc)(life5_12)).a(((net.minecraft.client.Minecraft)(this.i)), ((int)(p0)), ((int)(p1)));
        life4_1 += 1;
    }
    life4_22 = 0;
    while ((life4_22 < ((java.util.List)(this.n)).size())) {
        life5_33 = ((moom.gA)(((java.util.List)(this.n)).get(((int)(life4_22)))));
        ((moom.gA)(life5_33)).a(((net.minecraft.client.Minecraft)(this.i)), ((int)(p0)), ((int)(p1)));
        life4_22 += 1;
    }
    return;
}


protected void a(char p0, int p1) throws java.io.IOException { __sourceHandlerCall_98ca93a1f823c7c2cfb4(this, p0, p1); }


public static java.lang.String a__StringStatic() { return __sourceHandlerCall_35129df433c3ce3119c2(); }


public static net.minecraft.entity.Entity[] a__Arrayr3() {
return net.minecraft.client.gui.GuiScreen.v;
}


protected void a(net.minecraft.item.ItemStack p0, int p1, int p2) { __sourceHandlerCall_02fedcf0f97d3e8ac0bc(this, p0, p1, p2); }


public void a(boolean p0, int p1) { __sourceHandlerCall_4af452f8448564ab9c3a(this, p0, p1); }


public boolean a__Boolean() {
return ((1) != 0);
}


protected void a(int p0, int p1, int p2) throws java.io.IOException {
int life4_3;
    moom.gc life5_14;
    if ((p2 == 0)) {
        life4_3 = 0;
        loop_region_4: while ((life4_3 < ((java.util.List)(this.m)).size())) {
        life5_14 = ((moom.gc)(((java.util.List)(this.m)).get(((int)(life4_3)))));
        try {
        if (((moom.gc)(life5_14)).a__Boolean(((net.minecraft.client.Minecraft)(this.i)), ((int)(p0)), ((int)(p1)))) {
        this.q = ((moom.gc)(life5_14));
        ((moom.gc)(life5_14)).a(((net.minecraft.client.audio.SoundHandler)(((net.minecraft.client.Minecraft)(this.i)).a__f1())));
        ((net.minecraft.client.gui.GuiScreen)(this)).a__Void(((moom.gc)(life5_14)));
    }
    } catch (java.io.IOException caught_rethrow_0) {
        throw net.minecraft.client.gui.GuiScreen.b(((java.lang.Exception)(caught_rethrow_0)));
    }
        life4_3 += 1;
    }
    }
    return;
}


protected void a(int p0, int p1, int p2, long p3) {
return;
}


protected void a__Void(moom.gc p0) throws java.io.IOException {
return;
}


public static boolean a(int p0) { return __sourceHandlerCall_b05e3405e1064ccaa1fb(p0); }


public void a(int p0, int p1) {
this.k = ((int)(p0));
    this.l = ((int)(p1));
    return;
}


protected boolean a(net.minecraft.util.IChatComponent p0) { return __sourceHandlerCall_7415552bf142d9c6a529(this, p0); }


public void a(net.minecraft.client.Minecraft p0, int p1, int p2) {
this.i = ((net.minecraft.client.Minecraft)(p0));
    this.j = ((net.minecraft.client.renderer.entity.RenderItem)(((net.minecraft.client.Minecraft)(p0)).a__nv()));
    this.p = ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.Minecraft)(p0)).N));
    this.k = ((int)(p1));
    this.l = ((int)(p2));
    ((java.util.List)(this.m)).clear();
    ((net.minecraft.client.gui.GuiScreen)(this)).c__Void();
    return;
}


private void a(java.net.URI p0) { __sourceHandlerCall_bc99138c00c7735df43e(this, p0); }


public void g() {
return;
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1782_59(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_15c946d67bc3_originalDynamicSite1792_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_15c946d67bc3_originalDynamicSite1792_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_15c946d67bc3_originalDynamicSite1792_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_15c946d67bc3_originalDynamicSite1792_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_15c946d67bc3_originalDynamicSite1792_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_15c946d67bc3_originalDynamicSite1792_29(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_15c946d67bc3_originalDynamicSite1792_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_15c946d67bc3_originalDynamicSite1792_31(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_15c946d67bc3_originalDynamicSite1792_32(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_15c946d67bc3_originalDynamicSite1792_39(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_15c946d67bc3_originalDynamicSite1792_40(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_15c946d67bc3_originalDynamicSite1792_41(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_15c946d67bc3_originalDynamicSite1792_42(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_15c946d67bc3_originalDynamicSite1792_47(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_15c946d67bc3_originalDynamicSite1792_48(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_15c946d67bc3_originalDynamicSite1792_49(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_15c946d67bc3_originalDynamicSite1792_50(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral10338_0() throws E;
}
