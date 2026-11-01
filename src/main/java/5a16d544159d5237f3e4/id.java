package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
class id extends moom.h1 {

net.minecraft.client.gui.GuiSelectWorld y;

private static long z;

private static long[] A;

private static java.lang.Integer[] B;

private static java.util.Map C;

public id(net.minecraft.client.gui.GuiSelectWorld p0, net.minecraft.client.Minecraft p1) { super((net.minecraft.client.Minecraft)null, 0, 0, 0, 0, 0); }


private static void __sourceConstructorBody_14470b01c194a1e7(moom.id receiver, net.minecraft.client.gui.GuiSelectWorld p0, net.minecraft.client.Minecraft p1) throws Throwable {

long local3 = (moom.id.z ^ 75114154062286L);

    ((moom.id)(receiver)).y = ((net.minecraft.client.gui.GuiSelectWorld)(p0));

    moom.id.__sourceConstructorInit_14470b01c194a1e7_0(((moom.id)(receiver)), ((net.minecraft.client.Minecraft)(p1)), ((int)(((net.minecraft.client.gui.GuiSelectWorld)(p0)).k)), ((int)(((net.minecraft.client.gui.GuiSelectWorld)(p0)).l)), ((int)(__sourceIntrinsic_14470b01c194a1e7_originalDynamicSite2436_4(481, (8893059039125747422L ^ local3)))), ((int)((((net.minecraft.client.gui.GuiSelectWorld)(p0)).l - __sourceIntrinsic_14470b01c194a1e7_originalDynamicSite2436_6(3361, (144188755963066901L ^ local3))))), ((int)(__sourceIntrinsic_14470b01c194a1e7_originalDynamicSite2436_7(3688, (2311770145040841051L ^ local3)))));

    return;

}



static {
z = ((long)(((moom._a)(moom._c.a(((long)(-130068972417029893L)), ((long)(-5981379103872129160L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(49595660973345L)))));
    C = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.id.z ^ 16226395407958L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1305_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1305_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1305_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1305_14 = new byte[8];
    (__sourceSpill1305_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1305_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1305_16 = __sourceSpill1305_14;
    ((javax.crypto.Cipher)(__sourceSpill1305_11)).init(((int)(__sourceSpill1305_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1305_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1305_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[10];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "n*©\020©Ì,¶ÈUÀ\b\021gå\\\007á¶\"\"Ã(<_Æn\023\n+ßS|7\r\037­Æ!Cº|j\016\\\177ÁÉjÚÒÇ²çk"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1305_25 = local6_life21;
        int __sourceSpill1305_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1305_25)).substring(((int)(__sourceSpill1305_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1305_30 = local8_life19;
        int __sourceSpill1305_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1305_33 = new byte[8];
        (__sourceSpill1305_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1305_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1305_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1305_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1305_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1305_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1305_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1305_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1305_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1305_34)).doFinal(((byte[])(__sourceSpill1305_33)));
        (__sourceSpill1305_30)[__sourceSpill1305_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "õ0\017qg\031<RKOçËø×"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1305_38 = local6_life21;
        int __sourceSpill1305_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1305_38)).substring(((int)(__sourceSpill1305_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1305_43 = local8_life19;
        int __sourceSpill1305_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1305_46 = new byte[8];
        (__sourceSpill1305_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1305_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1305_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1305_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1305_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1305_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1305_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1305_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1305_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1305_47)).doFinal(((byte[])(__sourceSpill1305_46)));
        (__sourceSpill1305_43)[__sourceSpill1305_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    A = ((long[])(local8_life19));
    B = ((java.lang.Integer[])(new java.lang.Integer[10]));
}

private static native <E extends Throwable> void __sourceConstructorInit_14470b01c194a1e7_0(moom.id a0, net.minecraft.client.Minecraft a1, int a2, int a3, int a4, int a5, int a6) throws E;

protected int b() {
long local1 = (moom.id.z ^ 8297624429983L);
    return (((java.util.List)(((net.minecraft.client.gui.GuiSelectWorld)(this.y)).C)).size() * __sourceIntrinsic_e1958f95391c_originalDynamicSite1519_4(30891, (9161603451591941068L ^ local1)));
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 10375;
      if (B[var3] == null) {
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
         long var5 = A[var3];
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
         Object[] var9 = (Object[])C.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               C.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/id", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         B[var3] = var15;
      }

      return B[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.id.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral8043_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/id"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


protected int a() {
return ((java.util.List)(((net.minecraft.client.gui.GuiSelectWorld)(this.y)).C)).size();
}


protected void a(int p0, boolean p1, int p2, int p3) {
int forwardValue3637_17_0;
    int life5_22;
    forward_join_46: {
    forward_join_17: {
    forward_join_16: {
    ((net.minecraft.client.gui.GuiSelectWorld)(this.y)).B = ((int)(p0));
    if (!((((net.minecraft.client.gui.GuiSelectWorld)(this.y)).B >= 0))) {
        break forward_join_16;
    }
    if (!((((net.minecraft.client.gui.GuiSelectWorld)(this.y)).B < ((moom.id)(this)).a()))) {
        break forward_join_16;
    }
    forwardValue3637_17_0 = 1;
    break forward_join_17;
    }
    forwardValue3637_17_0 = 0;
    }
    life5_22 = forwardValue3637_17_0;
    ((moom.gc)(((net.minecraft.client.gui.GuiSelectWorld)(this.y)).J)).m = ((boolean)__sourceIntrinsic_integerToBoolean((life5_22)));
    ((moom.gc)(((net.minecraft.client.gui.GuiSelectWorld)(this.y)).I)).m = ((boolean)__sourceIntrinsic_integerToBoolean((life5_22)));
    ((moom.gc)(((net.minecraft.client.gui.GuiSelectWorld)(this.y)).K)).m = ((boolean)__sourceIntrinsic_integerToBoolean((life5_22)));
    ((moom.gc)(((net.minecraft.client.gui.GuiSelectWorld)(this.y)).L)).m = ((boolean)__sourceIntrinsic_integerToBoolean((life5_22)));
    if (!(p1)) {
        break forward_join_46;
    }
    if (!((life5_22 != 0))) {
        break forward_join_46;
    }
    ((net.minecraft.client.gui.GuiSelectWorld)(this.y)).a__Void(((int)(p0)));
    }
    return;
}


protected boolean a__Boolean(int p0) {
return ((((p0 == ((net.minecraft.client.gui.GuiSelectWorld)(this.y)).B) ? 1 : 0)) != 0);
}


protected void a__Void() {
((net.minecraft.client.gui.GuiSelectWorld)(this.y)).i();
    return;
}


protected void a(int p0, int p1, int p2, int p3, int p4, int p5) {
long local7 = (moom.id.z ^ 136970459273390L);
    moom.IQ local9 = ((moom.IQ)(((java.util.List)(((net.minecraft.client.gui.GuiSelectWorld)(this.y)).C)).get(((int)(p0)))));
    java.lang.String local10 = ((moom.IQ)(local9)).b__String();
    if (org.apache.commons.lang3.StringUtils.isEmpty(((java.lang.CharSequence)(local10)))) {
        local10 = __sourceIntrinsic_499f7b7391d8_invokedynamic6710_9(((net.minecraft.client.gui.GuiSelectWorld)(this.y)).E, (p0 + 1));
    }
    java.lang.String local11 = ((moom.IQ)(local9)).a__String();
    local11 = __sourceIntrinsic_499f7b7391d8_invokedynamic6710_15(local11, ((java.text.DateFormat)(((net.minecraft.client.gui.GuiSelectWorld)(this.y)).x)).format(((java.util.Date)(new java.util.Date(((moom.IQ)(local9)).b())))));
    local11 = __sourceIntrinsic_499f7b7391d8_invokedynamic6710_16(local11);
    java.lang.String local12 = "";
    if (((moom.IQ)(local9)).a__Boolean()) {
        local12 = __sourceIntrinsic_499f7b7391d8_invokedynamic6710_20(((net.minecraft.client.gui.GuiSelectWorld)(this.y)).F, local12);
    } else {
        local12 = (((net.minecraft.client.gui.GuiSelectWorld)(this.y)).G)[((net.minecraft.world.WorldSettings$GameType)(((moom.IQ)(local9)).a__bE())).a()];
        if (((moom.IQ)(local9)).b__Boolean()) {
        local12 = __sourceIntrinsic_499f7b7391d8_invokedynamic6710_29(net.minecraft.util.EnumChatFormatting.DARK_RED, moom.oO.a(((java.lang.String)("gameMode.hardcore")), ((java.lang.Object[])(new java.lang.Object[0]))), net.minecraft.util.EnumChatFormatting.RESET);
    }
        if (((moom.IQ)(local9)).c()) {
        local12 = __sourceIntrinsic_499f7b7391d8_invokedynamic6710_32(local12, moom.oO.a(((java.lang.String)("selectWorld.cheats")), ((java.lang.Object[])(new java.lang.Object[0]))));
    }
    }
    ((net.minecraft.client.gui.GuiSelectWorld)(this.y)).b(((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.gui.GuiSelectWorld)(this.y)).p)), ((java.lang.String)(local10)), ((int)((p1 + 2))), ((int)((p2 + 1))), ((int)(__sourceIntrinsic_499f7b7391d8_invokedynamic6710_36(18977, (2622169199326942335L ^ local7)))));
    ((net.minecraft.client.gui.GuiSelectWorld)(this.y)).b(((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.gui.GuiSelectWorld)(this.y)).p)), ((java.lang.String)(local11)), ((int)((p1 + 2))), ((int)((p2 + __sourceIntrinsic_499f7b7391d8_invokedynamic6710_41(24493, (6359530984284373498L ^ local7))))), ((int)(__sourceIntrinsic_499f7b7391d8_invokedynamic6710_42(30281, (5585380487577233433L ^ local7)))));
    ((net.minecraft.client.gui.GuiSelectWorld)(this.y)).b(((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.gui.GuiSelectWorld)(this.y)).p)), ((java.lang.String)(local12)), ((int)((p1 + 2))), ((int)(((p2 + __sourceIntrinsic_499f7b7391d8_invokedynamic6710_47(23402, (6339860696469652792L ^ local7))) + __sourceIntrinsic_499f7b7391d8_invokedynamic6710_48(25676, (1833735916631915037L ^ local7))))), ((int)(__sourceIntrinsic_499f7b7391d8_invokedynamic6710_49(1025, (5933485074124315220L ^ local7)))));
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_14470b01c194a1e7_originalDynamicSite2436_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_14470b01c194a1e7_originalDynamicSite2436_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_14470b01c194a1e7_originalDynamicSite2436_7(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_499f7b7391d8_invokedynamic6710_9(java.lang.String a0, int a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_499f7b7391d8_invokedynamic6710_15(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_499f7b7391d8_invokedynamic6710_16(java.lang.String a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_499f7b7391d8_invokedynamic6710_20(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_499f7b7391d8_invokedynamic6710_29(net.minecraft.util.EnumChatFormatting a0, java.lang.String a1, net.minecraft.util.EnumChatFormatting a2) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_499f7b7391d8_invokedynamic6710_32(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_499f7b7391d8_invokedynamic6710_36(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_499f7b7391d8_invokedynamic6710_41(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_499f7b7391d8_invokedynamic6710_42(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_499f7b7391d8_invokedynamic6710_47(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_499f7b7391d8_invokedynamic6710_48(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_499f7b7391d8_invokedynamic6710_49(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral8043_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e1958f95391c_originalDynamicSite1519_4(int a0, long a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
