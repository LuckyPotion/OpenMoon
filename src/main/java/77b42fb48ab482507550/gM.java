package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class gM extends net.minecraft.client.gui.GuiScreen {

private net.minecraft.client.gui.GuiScreen w;

private java.lang.String x;

private static long y;

private static long[] z;

private static java.lang.Integer[] A;

private static java.util.Map B;

public gM(net.minecraft.client.gui.GuiScreen p0) {
super();
    this.w = p0;
}

private static native <E extends Throwable> void __sourceHandlerCall_b27c487d4271c4345992(moom.gM a0, moom.gc a1) throws E;
private static final class __SourceHandler_b27c487d4271c4345992 {

public static void f1742(moom.gM receiver, moom.gc p0) throws Throwable {
    long life2_3;
    net.minecraft.entity.player.EnumPlayerModelParts life4_54;
    life2_3 = (__fieldRead1742_0() ^ 73785142477182L);
    if (__fieldRead1742_1(p0)) {
        if ((__fieldRead1742_2(p0) == __invokedynamic1742_3(19404, (2033807696454813970L ^ life2_3)))) {
        __call1742_5(__fieldRead1742_4(receiver), new moom.hF(receiver));
    }
        if ((__fieldRead1742_6(p0) == __invokedynamic1742_7(29734, (877348393585030908L ^ life2_3)))) {
        __call1742_10(__fieldRead1742_9(__fieldRead1742_8(receiver)));
        __call1742_13(__fieldRead1742_11(receiver), __fieldRead1742_12(receiver));
    } else {
        if ((__instanceOf1742_14(p0) != 0)) {
        life4_54 = __fieldRead1742_16(__cast1742_15(p0));
        __call1742_19(__fieldRead1742_18(__fieldRead1742_17(receiver)), life4_54);
        __fieldWrite1742_21(p0, __call1742_20(receiver, life4_54));
    }
    }
    }
    return;
}
public static void h1742_0(java.io.IOException p0) throws Throwable {
    throw __call1174200_0(p0);
}
public static void h1742_1(java.io.IOException p0) throws Throwable {
    throw __call1174201_0(p0);
}
public static void h1742_2(java.io.IOException p0) throws Throwable {
    throw __call1174202_0(p0);
}
private static native long __fieldRead1742_0() throws Throwable;
private static native boolean __fieldRead1742_1(moom.gc a0) throws Throwable;
private static native int __fieldRead1742_2(moom.gc a0) throws Throwable;
private static native int __invokedynamic1742_3(int a0, long a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1742_4(moom.gM a0) throws Throwable;
private static native void __call1742_5(net.minecraft.client.Minecraft a0, moom.hF a1) throws Throwable;
private static native int __fieldRead1742_6(moom.gc a0) throws Throwable;
private static native int __invokedynamic1742_7(int a0, long a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1742_8(moom.gM a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead1742_9(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call1742_10(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1742_11(moom.gM a0) throws Throwable;
private static native net.minecraft.client.gui.GuiScreen __fieldRead1742_12(moom.gM a0) throws Throwable;
private static native void __call1742_13(net.minecraft.client.Minecraft a0, net.minecraft.client.gui.GuiScreen a1) throws Throwable;
private static native int __instanceOf1742_14(moom.gc a0) throws Throwable;
private static native moom.ge __cast1742_15(moom.gc a0) throws Throwable;
private static native net.minecraft.entity.player.EnumPlayerModelParts __fieldRead1742_16(moom.ge a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1742_17(moom.gM a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead1742_18(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call1742_19(net.minecraft.client.settings.GameSettings a0, net.minecraft.entity.player.EnumPlayerModelParts a1) throws Throwable;
private static native java.lang.String __call1742_20(moom.gM a0, net.minecraft.entity.player.EnumPlayerModelParts a1) throws Throwable;
private static native void __fieldWrite1742_21(moom.gc a0, java.lang.String a1) throws Throwable;
private static native java.lang.Exception __call1174200_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1174201_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1174202_0(java.io.IOException a0) throws Throwable;

}


static {
y = ((long)(((moom._a)(moom._c.a(((long)(-1868303737646738753L)), ((long)(-282649328104273431L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(114843783282353L)))));
    B = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.gM.y ^ 27032056554829L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1214_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1214_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1214_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1214_14 = new byte[8];
    (__sourceSpill1214_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1214_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1214_16 = __sourceSpill1214_14;
    ((javax.crypto.Cipher)(__sourceSpill1214_11)).init(((int)(__sourceSpill1214_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1214_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1214_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[16];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "Âô)¤Ã¶²\027ÙoÎ!LsP0ë'n\035«¯h0|®åvÓþÂ³\021ùµ\034N·¦³\177teá\001÷³ \023µ\n÷öñ½ásñ\023}~Y\023D|¡\004ûZð¶F\013ö'íw°KÃE\r+XëÜ<[¢á\rñ\005Uê("))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1214_25 = local6_life21;
        int __sourceSpill1214_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1214_25)).substring(((int)(__sourceSpill1214_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1214_30 = local8_life19;
        int __sourceSpill1214_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1214_33 = new byte[8];
        (__sourceSpill1214_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1214_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1214_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1214_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1214_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1214_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1214_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1214_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1214_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1214_34)).doFinal(((byte[])(__sourceSpill1214_33)));
        (__sourceSpill1214_30)[__sourceSpill1214_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "»Nn ¬ä~Ø£,ëbJ©\f"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1214_38 = local6_life21;
        int __sourceSpill1214_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1214_38)).substring(((int)(__sourceSpill1214_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1214_43 = local8_life19;
        int __sourceSpill1214_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1214_46 = new byte[8];
        (__sourceSpill1214_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1214_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1214_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1214_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1214_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1214_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1214_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1214_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1214_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1214_47)).doFinal(((byte[])(__sourceSpill1214_46)));
        (__sourceSpill1214_43)[__sourceSpill1214_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    z = ((long[])(local8_life19));
    A = ((java.lang.Integer[])(new java.lang.Integer[16]));
}


public void c__Void() {
long life1_3;
    int life3_5;
    net.minecraft.entity.player.EnumPlayerModelParts[] life4_13;
    int life5_16;
    int life6_18;
    net.minecraft.entity.player.EnumPlayerModelParts life7_25;
    int life3_144;
    life1_3 = (moom.gM.y ^ 650093432991L);
    life3_5 = 0;
    this.x = ((java.lang.String)(moom.oO.a(((java.lang.String)("options.skinCustomisation.title")), ((java.lang.Object[])(new java.lang.Object[0])))));
    life4_13 = net.minecraft.entity.player.EnumPlayerModelParts.values();
    life5_16 = (life4_13).length;
    life6_18 = 0;
    loop_region_19: while ((life6_18 < life5_16)) {
        life7_25 = (life4_13)[life6_18];
        ((java.util.List)(this.m)).add(((java.lang.Object)(new moom.ge(this, ((net.minecraft.entity.player.EnumPlayerModelParts)(life7_25)).b(), (((this.k / 2) - __sourceIntrinsic_7ac46ee229a8_invokedynamic1769_7(7881, (4610741979828506103L ^ life1_3))) + ((life3_5 % 2) * __sourceIntrinsic_7ac46ee229a8_invokedynamic1769_8(27880, (5259508715623366612L ^ life1_3)))), ((this.l / __sourceIntrinsic_7ac46ee229a8_invokedynamic1769_10(24459, (4796460149251312829L ^ life1_3))) + (__sourceIntrinsic_7ac46ee229a8_invokedynamic1769_11(6750, (1567345140152748390L ^ life1_3)) * (life3_5 >> 1))), __sourceIntrinsic_7ac46ee229a8_invokedynamic1769_12(4708, (227923576772772182L ^ life1_3)), __sourceIntrinsic_7ac46ee229a8_invokedynamic1769_13(2241, (1553706429780745211L ^ life1_3)), life7_25))));
        life3_5 += 1;
        life6_18 += 1;
    }
    try {
        if (((life3_5 % 2) == 1)) {
        life3_5 += 1;
    }
    } catch (moom.Oo caught_rethrow_0) {
        throw moom.gM.a(((java.lang.Exception)(caught_rethrow_0)));
    }
    ((java.util.List)(this.m)).add(((java.lang.Object)(new moom.gu(__sourceIntrinsic_7ac46ee229a8_invokedynamic1769_17(18224, (8580783134914712576L ^ life1_3)), ((this.k / 2) - __sourceIntrinsic_7ac46ee229a8_invokedynamic1769_19(762, (2931323153520120269L ^ life1_3))), ((this.l / __sourceIntrinsic_7ac46ee229a8_invokedynamic1769_21(29042, (1849182824957485638L ^ life1_3))) + (__sourceIntrinsic_7ac46ee229a8_invokedynamic1769_22(5558, (3050615606018426507L ^ life1_3)) * (life3_5 >> 1))), moom.oO.a(((java.lang.String)("of.options.skinCustomisation.ofCape")), ((java.lang.Object[])(new java.lang.Object[0])))))));
    life3_144 = (life3_5 + 2);
    ((java.util.List)(this.m)).add(((java.lang.Object)(new moom.gc(__sourceIntrinsic_7ac46ee229a8_invokedynamic1769_26(16482, (18801278232630107L ^ life1_3)), ((this.k / 2) - __sourceIntrinsic_7ac46ee229a8_invokedynamic1769_28(16804, (182949582575506065L ^ life1_3))), ((this.l / __sourceIntrinsic_7ac46ee229a8_invokedynamic1769_30(29042, (1849182824957485638L ^ life1_3))) + (__sourceIntrinsic_7ac46ee229a8_invokedynamic1769_31(5558, (3050615606018426507L ^ life1_3)) * (life3_144 >> 1))), moom.oO.a(((java.lang.String)("gui.done")), ((java.lang.Object[])(new java.lang.Object[0])))))));
    return;
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


private static int a(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x40;
        if (A[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = z[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])B.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    B.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/gM", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            gM.A[n2] = n4;
        }
        return A[n2];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.gM.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral7713_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/gM"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private java.lang.String a(net.minecraft.entity.player.EnumPlayerModelParts p0) {
java.lang.String local2;
    if (((java.util.Set)(((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(this.i)).W)).a__Set())).contains(((java.lang.Object)(p0)))) {
        local2 = moom.oO.a(((java.lang.String)("options.on")), ((java.lang.Object[])(new java.lang.Object[0])));
    } else {
        local2 = moom.oO.a(((java.lang.String)("options.off")), ((java.lang.Object[])(new java.lang.Object[0])));
    }
    return __sourceIntrinsic_90ebcbee2c53_invokedynamic6560_8(((net.minecraft.util.IChatComponent)(((net.minecraft.entity.player.EnumPlayerModelParts)(p0)).a__C5())).c(), local2);
}


public void a(int p0, int p1, float p2) {
long local4 = (moom.gM.y ^ 67945784349977L);
    ((moom.gM)(this)).i();
    ((moom.gM)(this)).a(((net.minecraft.client.gui.FontRenderer)(this.p)), ((java.lang.String)(this.x)), ((int)((this.k / 2))), ((int)(__sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1450_5(10432, (7399757309331832437L ^ local4)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1450_6(11641, (4478869979882519502L ^ local4)))));
    super.a(((int)(p0)), ((int)(p1)), ((float)(p2)));
    return;
}


protected void a__Void(moom.gc p0) throws java.io.IOException { __sourceHandlerCall_b27c487d4271c4345992(this, p0); }


private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1769_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1769_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1769_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1769_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1769_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1769_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1769_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1769_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1769_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1769_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1769_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1769_28(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1769_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1769_31(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral7713_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_90ebcbee2c53_invokedynamic6560_8(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1450_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1450_6(int a0, long a1) throws E;
}
