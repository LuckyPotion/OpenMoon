package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class hN implements moom.hO {

private moom.pz a;

private java.lang.String b;

private moom.gc c;

private moom.gc d;

moom.h6 e;

private static long f;

private static long[] g;

private static java.lang.Integer[] h;

private static java.util.Map i;

private hN(moom.h6 p0, moom.pz p1) { super(); }


private static void __sourceConstructorBody_02b50305c069e035(moom.hN receiver, moom.h6 p0, moom.pz p1) throws Throwable {

long local3 = (moom.hN.f ^ 71494403627828L);

    ((moom.hN)(receiver)).e = ((moom.h6)(p0));

    moom.hN.__sourceConstructorInit_02b50305c069e035_0(((moom.hN)(receiver)));

    ((moom.hN)(receiver)).a = ((moom.pz)(p1));

    ((moom.hN)(receiver)).b = ((java.lang.String)(moom.oO.a(((java.lang.String)(((moom.pz)(p1)).b__String())), ((java.lang.Object[])(new java.lang.Object[0])))));

    ((moom.hN)(receiver)).c = ((moom.gc)(new moom.gc(0, 0, 0, __sourceIntrinsic_02b50305c069e035_originalDynamicSite2357_7(20415, (5704374696773767034L ^ local3)), __sourceIntrinsic_02b50305c069e035_originalDynamicSite2357_8(4114, (6698791802534727893L ^ local3)), moom.oO.a(((java.lang.String)(((moom.pz)(p1)).b__String())), ((java.lang.Object[])(new java.lang.Object[0]))))));

    ((moom.hN)(receiver)).d = ((moom.gc)(new moom.gc(0, 0, 0, __sourceIntrinsic_02b50305c069e035_originalDynamicSite2357_12(8317, (8889935189446435003L ^ local3)), __sourceIntrinsic_02b50305c069e035_originalDynamicSite2357_13(30747, (2556832932936743131L ^ local3)), moom.oO.a(((java.lang.String)("controls.reset")), ((java.lang.Object[])(new java.lang.Object[0]))))));

    return;

}



static {
f = ((long)(((moom._a)(moom._c.a(((long)(-2278678075805204331L)), ((long)(-2782329791572408935L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(202022481320516L)))));
    i = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.hN.f ^ 126553996284278L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1257_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1257_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1257_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1257_14 = new byte[8];
    (__sourceSpill1257_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1257_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1257_16 = __sourceSpill1257_14;
    ((javax.crypto.Cipher)(__sourceSpill1257_11)).init(((int)(__sourceSpill1257_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1257_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1257_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[8];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "Ð\013qÒmÆ\01737\013,¹ÑSç2Äº#\023 x\000nsßa3`\006ÂÅÚ\007t¤¦ªST.´"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1257_25 = local6_life21;
        int __sourceSpill1257_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1257_25)).substring(((int)(__sourceSpill1257_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1257_30 = local8_life19;
        int __sourceSpill1257_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1257_33 = new byte[8];
        (__sourceSpill1257_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1257_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1257_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1257_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1257_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1257_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1257_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1257_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1257_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1257_34)).doFinal(((byte[])(__sourceSpill1257_33)));
        (__sourceSpill1257_30)[__sourceSpill1257_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "Ù\023\030¤\007Úo\t§.ÕËl"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1257_38 = local6_life21;
        int __sourceSpill1257_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1257_38)).substring(((int)(__sourceSpill1257_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1257_43 = local8_life19;
        int __sourceSpill1257_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1257_46 = new byte[8];
        (__sourceSpill1257_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1257_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1257_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1257_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1257_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1257_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1257_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1257_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1257_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1257_47)).doFinal(((byte[])(__sourceSpill1257_46)));
        (__sourceSpill1257_43)[__sourceSpill1257_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    g = ((long[])(local8_life19));
    h = ((java.lang.Integer[])(new java.lang.Integer[8]));
}

private static native <E extends Throwable> void __sourceConstructorInit_02b50305c069e035_0(moom.hN a0) throws E;

private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static int a(int p0, long p1) {
int n4 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x568C;
        if (h[n4] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = g[n4];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])i.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    i.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/hN", exception);
            }
            int n6 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            hN.h[n4] = n6;
        }
        return h[n4];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.hN.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral7892_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/hN"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public boolean a__Boolean(int p0, int p1, int p2, int p3, int p4, int p5) {
if ((__sourceIntrinsic_booleanComparison(((moom.gc)(this.c)).a__Boolean(((net.minecraft.client.Minecraft)(((moom.h6)(this.e)).z)), ((int)(p1)), ((int)(p2)))) != 0)) {
        ((net.minecraft.client.gui.GuiControls)(((moom.h6)(this.e)).y)).A = ((moom.pz)(this.a));
        return ((1) != 0);
    }
    if ((__sourceIntrinsic_booleanComparison(((moom.gc)(this.d)).a__Boolean(((net.minecraft.client.Minecraft)(((moom.h6)(this.e)).z)), ((int)(p1)), ((int)(p2)))) != 0)) {
        ((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(((moom.h6)(this.e)).z)).W)).a(((moom.pz)(this.a)), ((int)(((moom.pz)(this.a)).a())));
        moom.pz.b__Void();
        return ((1) != 0);
    }
    return ((0) != 0);
}


public void a(int p0, int p1, int p2, int p3, int p4, int p5) {
((moom.gc)(this.c)).a(((int)(p1)), ((int)(p2)));
    ((moom.gc)(this.d)).a(((int)(p1)), ((int)(p2)));
    return;
}


public void a(int p0, int p1, int p2) {
return;
}


public void a(int p0, int p1, int p2, int p3, int p4, int p5, int p6, boolean p7) {
long life9_3;
    int life11_16;
    int life12_115;
    moom.pz[] life13_125;
    int life14_128;
    int life15_130;
    moom.pz life16_137;
    life9_3 = (moom.hN.f ^ 70572102871243L);
    life11_16 = ((((net.minecraft.client.gui.GuiControls)(((moom.h6)(this.e)).y)).A == this.a) ? 1 : 0);
    ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.Minecraft)(((moom.h6)(this.e)).z)).N)).b(((java.lang.String)(this.b)), ((float)(((float) ((p1 + __sourceIntrinsic_2d4ccdd22af0_invokedynamic6405_9(31930, (8985015925530234758L ^ life9_3))) - ((moom.h6)(this.e)).B)))), ((float)(((float) ((p2 + (p4 / 2)) - (((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.Minecraft)(((moom.h6)(this.e)).z)).N)).c / 2))))), ((int)(__sourceIntrinsic_2d4ccdd22af0_invokedynamic6405_16(15832, (1873494423715532518L ^ life9_3)))));
    ((moom.gc)(this.d)).i = ((int)((p1 + __sourceIntrinsic_2d4ccdd22af0_invokedynamic6405_19(30890, (538055531064494993L ^ life9_3)))));
    ((moom.gc)(this.d)).j = ((int)(p2));
    moom.gc spill6405_0 = this.d;
    ((moom.gc)(spill6405_0)).m = ((boolean)__sourceIntrinsic_integerToBoolean((((((moom.pz)(this.a)).b() != ((moom.pz)(this.a)).a()) ? 1 : 0))));
    ((moom.gc)(this.d)).a(((net.minecraft.client.Minecraft)(((moom.h6)(this.e)).z)), ((int)(p5)), ((int)(p6)));
    ((moom.gc)(this.c)).i = ((int)((p1 + __sourceIntrinsic_2d4ccdd22af0_invokedynamic6405_34(4349, (7134215667172893632L ^ life9_3)))));
    ((moom.gc)(this.c)).j = ((int)(p2));
    ((moom.gc)(this.c)).k = ((java.lang.String)(net.minecraft.client.settings.GameSettings.a(((int)(((moom.pz)(this.a)).b())))));
    life12_115 = 0;
    if ((((moom.pz)(this.a)).b() != 0)) {
        life13_125 = ((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(((moom.h6)(this.e)).z)).W)).aK;
        life14_128 = (life13_125).length;
        life15_130 = 0;
        loop_region_127: while ((life15_130 < life14_128)) {
        life16_137 = (life13_125)[life15_130];
        if ((life16_137 != this.a)) {
        if ((((moom.pz)(life16_137)).b() == ((moom.pz)(this.a)).b())) {
        life12_115 = 1;
        break loop_region_127;
    }
    }
        life15_130 += 1;
    }
    }
    if ((life11_16 != 0)) {
        ((moom.gc)(this.c)).k = ((java.lang.String)(__sourceIntrinsic_2d4ccdd22af0_invokedynamic6405_59(net.minecraft.util.EnumChatFormatting.WHITE, net.minecraft.util.EnumChatFormatting.YELLOW, ((moom.gc)(this.c)).k, net.minecraft.util.EnumChatFormatting.WHITE)));
    } else {
        if ((life12_115 != 0)) {
        ((moom.gc)(this.c)).k = ((java.lang.String)(__sourceIntrinsic_2d4ccdd22af0_invokedynamic6405_65(net.minecraft.util.EnumChatFormatting.RED, ((moom.gc)(this.c)).k)));
    }
    }
    ((moom.gc)(this.c)).a(((net.minecraft.client.Minecraft)(((moom.h6)(this.e)).z)), ((int)(p5)), ((int)(p6)));
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_02b50305c069e035_originalDynamicSite2357_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_02b50305c069e035_originalDynamicSite2357_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_02b50305c069e035_originalDynamicSite2357_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_02b50305c069e035_originalDynamicSite2357_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2d4ccdd22af0_invokedynamic6405_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2d4ccdd22af0_invokedynamic6405_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2d4ccdd22af0_invokedynamic6405_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2d4ccdd22af0_invokedynamic6405_34(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2d4ccdd22af0_invokedynamic6405_59(net.minecraft.util.EnumChatFormatting a0, net.minecraft.util.EnumChatFormatting a1, java.lang.String a2, net.minecraft.util.EnumChatFormatting a3) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2d4ccdd22af0_invokedynamic6405_65(net.minecraft.util.EnumChatFormatting a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral7892_0() throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
