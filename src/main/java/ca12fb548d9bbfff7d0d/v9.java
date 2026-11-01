package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
class v9 extends moom.v8 {

public java.util.List<net.minecraft.item.ItemStack> k;

private static long l;

private static long[] m;

private static java.lang.Integer[] n;

private static java.util.Map o;

public v9(net.minecraft.entity.player.EntityPlayer p0) { super(); }


private static void __sourceConstructorBody_262a6e92c427d3f1(moom.v9 receiver, net.minecraft.entity.player.EntityPlayer p0) throws Throwable {

long local2_life1 = (moom.v9.l ^ 61706565500876L);

    moom.v9.__sourceConstructorInit_262a6e92c427d3f1_0(((moom.v9)(receiver)));

    ((moom.v9)(receiver)).k = ((java.util.List)(com.google.common.collect.Lists.newArrayList()));

    net.minecraft.entity.player.InventoryPlayer local4_life6 = ((net.minecraft.entity.player.EntityPlayer)(p0)).bD;

    int local5_life7 = 0;

    while ((local5_life7 < 5)) {

        int local6_life8 = 0;

        while ((local6_life8 < __sourceIntrinsic_262a6e92c427d3f1_originalDynamicSite828_9(2262, (8250937201341340371L ^ local2_life1)))) {

        ((moom.v9)(receiver)).a(((moom.wB)(new moom.wB(moom.ht.ab, ((local5_life7 * __sourceIntrinsic_262a6e92c427d3f1_originalDynamicSite828_11(434, (8084445245864186805L ^ local2_life1))) + local6_life8), (__sourceIntrinsic_262a6e92c427d3f1_originalDynamicSite828_12(434, (8084445245864186805L ^ local2_life1)) + (local6_life8 * __sourceIntrinsic_262a6e92c427d3f1_originalDynamicSite828_13(24251, (4586854285865864381L ^ local2_life1)))), (__sourceIntrinsic_262a6e92c427d3f1_originalDynamicSite828_14(21130, (4978161235831963784L ^ local2_life1)) + (local5_life7 * __sourceIntrinsic_262a6e92c427d3f1_originalDynamicSite828_15(21130, (4978161235831963784L ^ local2_life1))))))));

        local6_life8 += 1;

    }

        local5_life7 += 1;

    }

    local5_life7 = 0;

    while ((local5_life7 < __sourceIntrinsic_262a6e92c427d3f1_originalDynamicSite828_17(434, (8084445245864186805L ^ local2_life1)))) {

        ((moom.v9)(receiver)).a(((moom.wB)(new moom.wB(local4_life6, local5_life7, (__sourceIntrinsic_262a6e92c427d3f1_originalDynamicSite828_18(434, (8084445245864186805L ^ local2_life1)) + (local5_life7 * __sourceIntrinsic_262a6e92c427d3f1_originalDynamicSite828_19(21130, (4978161235831963784L ^ local2_life1)))), __sourceIntrinsic_262a6e92c427d3f1_originalDynamicSite828_20(14436, (2363486431058209376L ^ local2_life1))))));

        local5_life7 += 1;

    }

    ((moom.v9)(receiver)).a(((float)(0x0.0p0f)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_262a6e92c427d3f1_0(moom.v9 a0) throws E;

static {
l = ((long)(((moom._a)(moom._c.a(((long)(8319359625687766521L)), ((long)(3469402655123144656L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(32831324506906L)))));
    o = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.v9.l ^ 104369589476420L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1616_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1616_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1616_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1616_14 = new byte[8];
    (__sourceSpill1616_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1616_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1616_16 = __sourceSpill1616_14;
    ((javax.crypto.Cipher)(__sourceSpill1616_11)).init(((int)(__sourceSpill1616_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1616_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1616_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[9];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "àób®±V¶\030jp³ËkÕä`.cIMâ\bñÂÌZIQèQ\177PØ\021y\035u\024\006x©Ré^éåío§"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1616_25 = local6_life21;
        int __sourceSpill1616_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1616_25)).substring(((int)(__sourceSpill1616_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1616_30 = local8_life19;
        int __sourceSpill1616_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1616_33 = new byte[8];
        (__sourceSpill1616_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1616_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1616_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1616_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1616_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1616_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1616_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1616_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1616_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1616_34)).doFinal(((byte[])(__sourceSpill1616_33)));
        (__sourceSpill1616_30)[__sourceSpill1616_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "wôMªeê¯|é95\026i"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1616_38 = local6_life21;
        int __sourceSpill1616_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1616_38)).substring(((int)(__sourceSpill1616_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1616_43 = local8_life19;
        int __sourceSpill1616_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1616_46 = new byte[8];
        (__sourceSpill1616_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1616_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1616_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1616_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1616_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1616_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1616_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1616_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1616_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1616_47)).doFinal(((byte[])(__sourceSpill1616_46)));
        (__sourceSpill1616_43)[__sourceSpill1616_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    m = ((long[])(local8_life19));
    n = ((java.lang.Integer[])(new java.lang.Integer[9]));
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral9442_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/v9"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 27942;
      if (n[var3] == null) {
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
         long var5 = m[var3];
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
         Object[] var9 = (Object[])o.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               o.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/v9", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         n[var3] = var15;
      }

      return n[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.v9.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public boolean b(net.minecraft.entity.player.EntityPlayer p0) {
return ((1) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(float p0) {
long life2_3;
    int life4_23;
    int life5_32;
    int life6_38;
    int life7_43;
    int life8_62;
    lexical_join_103: {
    lexical_join_37: {
    life2_3 = (moom.v9.l ^ 118196893718368L);
    life4_23 = ((((((java.util.List)(this.k)).size() + __sourceIntrinsic_c6b9ded72a2a_invokedynamic1349_3(434, (8084501736194259737L ^ life2_3))) - 1) / __sourceIntrinsic_c6b9ded72a2a_invokedynamic1349_4(434, (8084501736194259737L ^ life2_3))) - 5);
    life5_32 = ((int) (((double) (p0 * ((float) life4_23))) + 0x1.0p-1d));
    if (!((life5_32 < 0))) {
        break lexical_join_37;
    }
    life5_32 = 0;
    }
    life6_38 = 0;
    lexical_cycle_39: while (true) {
    lexical_join_101: {
    if (!((life6_38 < 5))) {
        break lexical_join_103;
    }
    life7_43 = 0;
    lexical_cycle_44: while (true) {
    lexical_join_99: {
    lexical_join_87: {
    if (!((life7_43 < __sourceIntrinsic_c6b9ded72a2a_invokedynamic1349_5(434, (8084501736194259737L ^ life2_3))))) {
        break lexical_join_101;
    }
    life8_62 = (life7_43 + ((life6_38 + life5_32) * __sourceIntrinsic_c6b9ded72a2a_invokedynamic1349_6(434, (8084501736194259737L ^ life2_3))));
    if (!((life8_62 >= 0))) {
        break lexical_join_87;
    }
    if (!((life8_62 < ((java.util.List)(this.k)).size()))) {
        break lexical_join_87;
    }
    ((moom.wq)(moom.ht.ab)).a__Void(((int)((life7_43 + (life6_38 * __sourceIntrinsic_c6b9ded72a2a_invokedynamic1349_10(434, (8084501736194259737L ^ life2_3)))))), ((net.minecraft.item.ItemStack)(((net.minecraft.item.ItemStack)(((java.util.List)(this.k)).get(((int)(life8_62))))))));
    break lexical_join_99;
    }
    ((moom.wq)(moom.ht.ab)).a__Void(((int)((life7_43 + (life6_38 * __sourceIntrinsic_c6b9ded72a2a_invokedynamic1349_16(434, (8084501736194259737L ^ life2_3)))))), ((net.minecraft.item.ItemStack)(null)));
    }
    life7_43 += 1;
    continue lexical_cycle_44;
    }
    }
    life6_38 += 1;
    continue lexical_cycle_39;
    }
    }
    return;
}


public boolean a(net.minecraft.item.ItemStack p0, moom.wB p1) {
long local3 = (moom.v9.l ^ 63904227998317L);
    return ((((moom.wB)(p1)).e > __sourceIntrinsic_197fc889b8c5_invokedynamic9444_2(1582, (6247177742859407756L ^ local3))) ? true : false);
}


public net.minecraft.item.ItemStack a(net.minecraft.entity.player.EntityPlayer p0, int p1) {
long life3_3;
    moom.wB life5_28;
    life3_3 = (moom.v9.l ^ 55446684435635L);
    if ((p1 >= (((java.util.List)(this.b)).size() - __sourceIntrinsic_245d151687c8_invokedynamic7682_3(434, (8084438985982617802L ^ life3_3))))) {
        if ((p1 < ((java.util.List)(this.b)).size())) {
        life5_28 = ((moom.wB)(((java.util.List)(this.b)).get(((int)(p1)))));
        if ((life5_28 != null)) {
        if (((moom.wB)(life5_28)).a__Boolean()) {
        ((moom.wB)(life5_28)).b(((net.minecraft.item.ItemStack)(null)));
    }
    }
    }
    }
    return null;
}


protected void a(int p0, int p1, boolean p2, net.minecraft.entity.player.EntityPlayer p3) {
return;
}


public boolean a__Boolean(moom.wB p0) {
int forwardValue4282_27_0;
    long life2_3;
    forward_join_27: {
    forward_join_26: {
    forward_join_24: {
    life2_3 = (moom.v9.l ^ 82822675931652L);
    if (!((((((moom.wB)(p0)).b instanceof net.minecraft.entity.player.InventoryPlayer) ? 1 : 0) == 0))) {
        break forward_join_24;
    }
    if (!((((moom.wB)(p0)).e > __sourceIntrinsic_c3e14ca7533d_invokedynamic4282_4(9419, (8537487733274258179L ^ life2_3))))) {
        break forward_join_26;
    }
    if (!((((moom.wB)(p0)).d <= __sourceIntrinsic_c3e14ca7533d_invokedynamic4282_6(3794, (7888296977935434011L ^ life2_3))))) {
        break forward_join_26;
    }
    }
    forwardValue4282_27_0 = 1;
    break forward_join_27;
    }
    forwardValue4282_27_0 = 0;
    }
    return ((forwardValue4282_27_0) != 0);
}


public boolean a__sourceReturn_aae029aa0a() {
long local1 = (moom.v9.l ^ 56083487549107L);
    return ((((java.util.List)(this.k)).size() > __sourceIntrinsic_e98bd92abdf5_invokedynamic9447_3(8006, (3115558776819209271L ^ local1))) ? true : false);
}


private static native <E extends Throwable> int __sourceIntrinsic_262a6e92c427d3f1_originalDynamicSite828_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_262a6e92c427d3f1_originalDynamicSite828_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_262a6e92c427d3f1_originalDynamicSite828_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_262a6e92c427d3f1_originalDynamicSite828_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_262a6e92c427d3f1_originalDynamicSite828_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_262a6e92c427d3f1_originalDynamicSite828_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_262a6e92c427d3f1_originalDynamicSite828_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_262a6e92c427d3f1_originalDynamicSite828_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_262a6e92c427d3f1_originalDynamicSite828_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_262a6e92c427d3f1_originalDynamicSite828_20(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral9442_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c6b9ded72a2a_invokedynamic1349_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c6b9ded72a2a_invokedynamic1349_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c6b9ded72a2a_invokedynamic1349_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c6b9ded72a2a_invokedynamic1349_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c6b9ded72a2a_invokedynamic1349_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c6b9ded72a2a_invokedynamic1349_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_197fc889b8c5_invokedynamic9444_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_245d151687c8_invokedynamic7682_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c3e14ca7533d_invokedynamic4282_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c3e14ca7533d_invokedynamic4282_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e98bd92abdf5_invokedynamic9447_3(int a0, long a1) throws E;
}
