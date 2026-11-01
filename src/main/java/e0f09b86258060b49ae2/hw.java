package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class hw extends net.minecraft.client.gui.GuiScreen {

private static java.util.concurrent.atomic.AtomicInteger w;

private static org.apache.logging.log4j.Logger x;

private net.minecraft.network.NetworkManager y;

private boolean z;

private net.minecraft.client.gui.GuiScreen A;

private static long B;

private static long[] C;

private static java.lang.Integer[] D;

private static java.util.Map E;

public hw(net.minecraft.client.gui.GuiScreen p0, net.minecraft.client.Minecraft p1, moom.jL p2) {
super();
    this.i = ((net.minecraft.client.Minecraft)(p1));
    this.A = ((net.minecraft.client.gui.GuiScreen)(p0));
    moom.jK local4 = moom.jK.a(((java.lang.String)(((moom.jL)(p2)).b)));
    ((net.minecraft.client.Minecraft)(p1)).a(((net.minecraft.client.multiplayer.WorldClient)(null)));
    ((net.minecraft.client.Minecraft)(p1)).a(((moom.jL)(p2)));
    ((moom.hw)(this)).a(((java.lang.String)(((moom.jK)(local4)).a__String())), ((int)(((moom.jK)(local4)).a())));
    return;
}

private static native <E extends Throwable> void __sourceHandlerCall_839daee2df59d8dd5773(moom.hw a0, moom.gc a1) throws E;
private static final class __SourceHandler_839daee2df59d8dd5773 {

public static void f1065(moom.hw receiver, moom.gc p0) throws Throwable {
    moom.hw forwardValue1065_27_0;
    moom.hw spill1065_0;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_31: {
    forward_join_27: {
    forward_join_26: {
    forward_join_14: {
    life2_3 = (__fieldRead1065_0() ^ 58909481297308L);
    life4_5 = __call1065_1();
    if (!((life4_5 == null))) {
        break forward_join_14;
    }
    if (!((__fieldRead1065_2(p0) == 0))) {
        break forward_join_31;
    }
    __fieldWrite1065_3(receiver, 1);
    }
    spill1065_0 = receiver;
    if (!((life4_5 == null))) {
        forwardValue1065_27_0 = spill1065_0;
        break forward_join_27;
    }
    if (!((__fieldRead1065_4(spill1065_0) != null))) {
        break forward_join_26;
    }
    __call1065_6(__fieldRead1065_5(receiver), new moom.CM("Aborted"));
    }
    forwardValue1065_27_0 = receiver;
    }
    __call1065_9(__fieldRead1065_7(forwardValue1065_27_0), __fieldRead1065_8(receiver));
    }
    return;
}
public static void h1065_0(java.io.IOException p0) throws Throwable {
    throw __call1106500_0(p0);
}
public static void h1065_1(java.io.IOException p0) throws Throwable {
    throw __call1106501_0(p0);
}
public static void h1065_2(java.io.IOException p0) throws Throwable {
    throw __call1106502_0(p0);
}
public static void h1065_3(java.io.IOException p0) throws Throwable {
    throw __call1106503_0(p0);
}
private static native long __fieldRead1065_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call1065_1() throws Throwable;
private static native int __fieldRead1065_2(moom.gc a0) throws Throwable;
private static native void __fieldWrite1065_3(moom.hw a0, int a1) throws Throwable;
private static native net.minecraft.network.NetworkManager __fieldRead1065_4(moom.hw a0) throws Throwable;
private static native net.minecraft.network.NetworkManager __fieldRead1065_5(moom.hw a0) throws Throwable;
private static native void __call1065_6(net.minecraft.network.NetworkManager a0, moom.CM a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1065_7(moom.hw a0) throws Throwable;
private static native net.minecraft.client.gui.GuiScreen __fieldRead1065_8(moom.hw a0) throws Throwable;
private static native void __call1065_9(net.minecraft.client.Minecraft a0, net.minecraft.client.gui.GuiScreen a1) throws Throwable;
private static native java.lang.Exception __call1106500_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1106501_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1106502_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1106503_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_b6971867807b5c91fab2(moom.hw a0, int a1, int a2, float a3) throws E;
private static final class __SourceHandler_b6971867807b5c91fab2 {

public static void f1064(moom.hw receiver, int p0, int p1, float p2) throws Throwable {
    moom.hw forwardValue1064_43_0;
    net.minecraft.entity.Entity[] spill1064_0;
    moom.hw spill1064_1;
    long life4_3;
    net.minecraft.entity.Entity[] life6_7;
    forward_join_69: {
    forward_join_43: {
    forward_join_42: {
    life4_3 = (__fieldRead1064_0() ^ 82752273052155L);
    spill1064_0 = __call1064_1();
    __call1064_2(receiver);
    life6_7 = spill1064_0;
    spill1064_1 = receiver;
    if (!((life6_7 == null))) {
        forwardValue1064_43_0 = spill1064_1;
        break forward_join_43;
    }
    if (!((__fieldRead1064_3(spill1064_1) == null))) {
        break forward_join_42;
    }
    __call1064_10(receiver, __fieldRead1064_4(receiver), __call1064_5("connect.connecting", new java.lang.Object[0]), (__fieldRead1064_6(receiver) / 2), ((__fieldRead1064_7(receiver) / 2) - __invokedynamic1064_8(23898, (1208365487245867011L ^ life4_3))), __invokedynamic1064_9(1215, (1059294521050718693L ^ life4_3)));
    if (!((life6_7 != null))) {
        break forward_join_69;
    }
    }
    forwardValue1064_43_0 = receiver;
    }
    __call1064_17(forwardValue1064_43_0, __fieldRead1064_11(receiver), __call1064_12("connect.authorizing", new java.lang.Object[0]), (__fieldRead1064_13(receiver) / 2), ((__fieldRead1064_14(receiver) / 2) - __invokedynamic1064_15(10438, (8455856463429225886L ^ life4_3))), __invokedynamic1064_16(12884, (1719195034984273679L ^ life4_3)));
    }
    __call1064_18(receiver, p0, p1, p2);
    return;
}
public static void h1064_0(moom.Oo p0) throws Throwable {
    throw __call1106400_0(p0);
}
public static void h1064_1(moom.Oo p0) throws Throwable {
    throw __call1106401_0(p0);
}
public static void h1064_2(moom.Oo p0) throws Throwable {
    throw __call1106402_0(p0);
}
private static native long __fieldRead1064_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call1064_1() throws Throwable;
private static native void __call1064_2(moom.hw a0) throws Throwable;
private static native net.minecraft.network.NetworkManager __fieldRead1064_3(moom.hw a0) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead1064_4(moom.hw a0) throws Throwable;
private static native java.lang.String __call1064_5(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native int __fieldRead1064_6(moom.hw a0) throws Throwable;
private static native int __fieldRead1064_7(moom.hw a0) throws Throwable;
private static native int __invokedynamic1064_8(int a0, long a1) throws Throwable;
private static native int __invokedynamic1064_9(int a0, long a1) throws Throwable;
private static native void __call1064_10(moom.hw a0, net.minecraft.client.gui.FontRenderer a1, java.lang.String a2, int a3, int a4, int a5) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead1064_11(moom.hw a0) throws Throwable;
private static native java.lang.String __call1064_12(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native int __fieldRead1064_13(moom.hw a0) throws Throwable;
private static native int __fieldRead1064_14(moom.hw a0) throws Throwable;
private static native int __invokedynamic1064_15(int a0, long a1) throws Throwable;
private static native int __invokedynamic1064_16(int a0, long a1) throws Throwable;
private static native void __call1064_17(moom.hw a0, net.minecraft.client.gui.FontRenderer a1, java.lang.String a2, int a3, int a4, int a5) throws Throwable;
private static native void __call1064_18(moom.hw a0, int a1, int a2, float a3) throws Throwable;
private static native java.lang.Exception __call1106400_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1106401_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1106402_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_cb3df9d17b43d876d6bd(moom.hw a0) throws E;
private static final class __SourceHandler_cb3df9d17b43d876d6bd {

public static void f1066(moom.hw receiver) throws Throwable {
    net.minecraft.network.NetworkManager forwardValue1066_13_0;
    net.minecraft.network.NetworkManager forwardValue1066_24_0;
    net.minecraft.network.NetworkManager spill1066_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_25: {
    forward_join_24: {
    forward_join_22: {
    forward_join_13: {
    life1_3 = (__fieldRead1066_0() ^ 34213126615766L);
    life3_5 = __call1066_1();
    spill1066_0 = __fieldRead1066_2(receiver);
    if (!((life3_5 == null))) {
        forwardValue1066_13_0 = spill1066_0;
        break forward_join_13;
    }
    if (!((spill1066_0 != null))) {
        break forward_join_25;
    }
    forwardValue1066_13_0 = __fieldRead1066_3(receiver);
    }
    if (!((life3_5 == null))) {
        forwardValue1066_24_0 = forwardValue1066_13_0;
        break forward_join_24;
    }
    if (!(__call1066_4(forwardValue1066_13_0))) {
        break forward_join_22;
    }
    __call1066_6(__fieldRead1066_5(receiver));
    if (!((life3_5 != null))) {
        break forward_join_25;
    }
    }
    forwardValue1066_24_0 = __fieldRead1066_7(receiver);
    }
    __call1066_8(forwardValue1066_24_0);
    }
    return;
}
public static void h1066_0(moom.Oo p0) throws Throwable {
    throw __call1106600_0(p0);
}
public static void h1066_1(moom.Oo p0) throws Throwable {
    throw __call1106601_0(p0);
}
public static void h1066_2(moom.Oo p0) throws Throwable {
    throw __call1106602_0(p0);
}
public static void h1066_3(moom.Oo p0) throws Throwable {
    throw __call1106603_0(p0);
}
public static void h1066_4(moom.Oo p0) throws Throwable {
    throw __call1106604_0(p0);
}
private static native long __fieldRead1066_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call1066_1() throws Throwable;
private static native net.minecraft.network.NetworkManager __fieldRead1066_2(moom.hw a0) throws Throwable;
private static native net.minecraft.network.NetworkManager __fieldRead1066_3(moom.hw a0) throws Throwable;
private static native boolean __call1066_4(net.minecraft.network.NetworkManager a0) throws Throwable;
private static native net.minecraft.network.NetworkManager __fieldRead1066_5(moom.hw a0) throws Throwable;
private static native void __call1066_6(net.minecraft.network.NetworkManager a0) throws Throwable;
private static native net.minecraft.network.NetworkManager __fieldRead1066_7(moom.hw a0) throws Throwable;
private static native void __call1066_8(net.minecraft.network.NetworkManager a0) throws Throwable;
private static native java.lang.Exception __call1106600_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1106601_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1106602_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1106603_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1106604_0(moom.Oo a0) throws Throwable;

}


public hw(net.minecraft.client.gui.GuiScreen p0, net.minecraft.client.Minecraft p1, java.lang.String p2, int p3) {
super();
    this.i = p1;
    this.A = p0;
    (p1).a((net.minecraft.client.multiplayer.WorldClient)null);
    (this).a(p2, p3);
}


static {
B = ((long)(__sourceExactCall_93409fc8361486(((moom._a)(__sourceExactCall_41bab94bc4b1bd(((long)(-679485647965691849L)), ((long)(1451917888124550085L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))), ((long)(164628600420840L)))));
    E = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.hw.B ^ 120368625636978L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1271_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1271_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1271_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1271_14 = new byte[8];
    (__sourceSpill1271_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1271_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1271_16 = __sourceSpill1271_14;
    ((javax.crypto.Cipher)(__sourceSpill1271_11)).init(((int)(__sourceSpill1271_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1271_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1271_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[7];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "?\001^\013ñÈ®³¦¯ø\035¿BÃLrÆ\0039Xù¿\000±(\013\0319òz\002°ô¹"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1271_25 = local6_life21;
        int __sourceSpill1271_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1271_25)).substring(((int)(__sourceSpill1271_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1271_30 = local8_life19;
        int __sourceSpill1271_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1271_33 = new byte[8];
        (__sourceSpill1271_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1271_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1271_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1271_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1271_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1271_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1271_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1271_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1271_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1271_34)).doFinal(((byte[])(__sourceSpill1271_33)));
        (__sourceSpill1271_30)[__sourceSpill1271_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "nPèÞÄQ,bT\t³e=v"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1271_38 = local6_life21;
        int __sourceSpill1271_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1271_38)).substring(((int)(__sourceSpill1271_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1271_43 = local8_life19;
        int __sourceSpill1271_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1271_46 = new byte[8];
        (__sourceSpill1271_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1271_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1271_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1271_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1271_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1271_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1271_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1271_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1271_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1271_47)).doFinal(((byte[])(__sourceSpill1271_46)));
        (__sourceSpill1271_43)[__sourceSpill1271_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    C = ((long[])(local8_life19));
    D = ((java.lang.Integer[])(new java.lang.Integer[7]));
    w = ((java.util.concurrent.atomic.AtomicInteger)(new java.util.concurrent.atomic.AtomicInteger(0)));
    x = ((org.apache.logging.log4j.Logger)(org.apache.logging.log4j.LogManager.getLogger()));
}


static net.minecraft.client.Minecraft b(moom.hw p0) {
return ((moom.hw)(p0)).i;
}


static net.minecraft.client.Minecraft e(moom.hw p0) {
return ((moom.hw)(p0)).i;
}


static net.minecraft.client.Minecraft c(moom.hw p0) {
return ((moom.hw)(p0)).i;
}


public void c__Void() {
long local1 = (moom.hw.B ^ 129878789158013L);
    ((java.util.List)(this.m)).clear();
    ((java.util.List)(this.m)).add(((java.lang.Object)(new moom.gc(0, ((this.k / 2) - __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1504_5(22663, (3997598830529755229L ^ local1))), (((this.l / 4) + __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1504_7(21722, (7076629708615595010L ^ local1))) + __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1504_8(24599, (8198599984454795468L ^ local1))), moom.oO.a(((java.lang.String)("gui.cancel")), ((java.lang.Object[])(new java.lang.Object[0])))))));
    return;
}


static net.minecraft.client.Minecraft d(moom.hw p0) {
return ((moom.hw)(p0)).i;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 13225;
      if (D[var3] == null) {
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
         long var5 = C[var3];
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
         Object[] var9 = (Object[])E.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               E.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/hw", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         D[var3] = var15;
      }

      return D[var3];
}


private void a(java.lang.String p0, int p1) {
((org.apache.logging.log4j.Logger)(moom.hw.x)).info(((java.lang.String)(__sourceIntrinsic_b3e4ccfc83ba_originalDynamicSite1505_1(p0, p1))));
    ((com.moon.events.EventBus)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).getEventBus())).publish(((java.lang.Object)(new com.moon.ev(p0, false))));
    ((moom.Or)(new moom.Or(this, __sourceIntrinsic_b3e4ccfc83ba_originalDynamicSite1505_8(((java.util.concurrent.atomic.AtomicInteger)(moom.hw.w)).incrementAndGet()), p0, p1))).start();
    return;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral7962_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/hw"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_5890730ffffc71(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


protected void a__Void(moom.gc p0) throws java.io.IOException { __sourceHandlerCall_839daee2df59d8dd5773(this, p0); }


public void a(int p0, int p1, float p2) { __sourceHandlerCall_b6971867807b5c91fab2(this, p0, p1, p2); }


static net.minecraft.client.Minecraft a(moom.hw p0) {
return ((moom.hw)(p0)).i;
}


protected void a(char p0, int p1) throws java.io.IOException {
return;
}


public void g() { __sourceHandlerCall_cb3df9d17b43d876d6bd(this); }


private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1504_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1504_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1504_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b3e4ccfc83ba_originalDynamicSite1505_1(java.lang.String a0, int a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b3e4ccfc83ba_originalDynamicSite1505_8(int a0) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral7962_0() throws E;

private static native int __sourceExactCall_5890730ffffc71(int p0, long p1);

private static native long __sourceExactCall_93409fc8361486(moom._a p0, long p1);
private static native moom._a __sourceExactCall_41bab94bc4b1bd(long p0, long p1, java.lang.Object p2);
}
