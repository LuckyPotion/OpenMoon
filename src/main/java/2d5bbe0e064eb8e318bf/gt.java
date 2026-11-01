package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
class gt extends moom.gq {

private int v;

private int w;

net.minecraft.client.gui.inventory.GuiBeacon x;

private static long A;

private static long[] H;

private static java.lang.Integer[] I;

private static java.util.Map J;

public gt(net.minecraft.client.gui.inventory.GuiBeacon p0, int p1, int p2, int p3, int p4, int p5) { super(0, 0, 0, (moom.DD)null, 0, 0); }


private static void __sourceConstructorBody_0c2289bde9fa2c12(moom.gt receiver, net.minecraft.client.gui.inventory.GuiBeacon p0, int p1, int p2, int p3, int p4, int p5) throws Throwable {

long local7 = (moom.gt.A ^ 14069061704597L);

    ((moom.gt)(receiver)).x = ((net.minecraft.client.gui.inventory.GuiBeacon)(p0));

    moom.gt.__sourceConstructorInit_0c2289bde9fa2c12_0(((moom.gt)(receiver)), ((int)(p1)), ((int)(p2)), ((int)(p3)), ((moom.DD)(moom.hg.w)), ((int)(((((net.minecraft.potion.Potion)((net.minecraft.potion.Potion.a)[p4])).b() % __sourceIntrinsic_0c2289bde9fa2c12_originalDynamicSite2323_5(12533, (5384260494619000861L ^ local7))) * __sourceIntrinsic_0c2289bde9fa2c12_originalDynamicSite2323_6(22635, (7018616705594402946L ^ local7))))), ((int)((__sourceIntrinsic_0c2289bde9fa2c12_originalDynamicSite2323_7(10564, (6798521494875429295L ^ local7)) + ((((net.minecraft.potion.Potion)((net.minecraft.potion.Potion.a)[p4])).b() / __sourceIntrinsic_0c2289bde9fa2c12_originalDynamicSite2323_10(31209, (3198314387983730947L ^ local7))) * __sourceIntrinsic_0c2289bde9fa2c12_originalDynamicSite2323_11(27724, (1841878208487759008L ^ local7)))))));

    ((moom.gt)(receiver)).v = ((int)(p4));

    ((moom.gt)(receiver)).w = ((int)(p5));

    return;

}



static {
A = ((long)(((moom._a)(moom._c.a(((long)(-824825442987046235L)), ((long)(-9120270937512733780L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(85180610948739L)))));
    J = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.gt.A ^ 125011202284228L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1235_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1235_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1235_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1235_14 = new byte[8];
    (__sourceSpill1235_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1235_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1235_16 = __sourceSpill1235_14;
    ((javax.crypto.Cipher)(__sourceSpill1235_11)).init(((int)(__sourceSpill1235_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1235_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1235_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[5];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "%3[\\y)~\006ú\177\003åý¼Âj=d\004¹ckã"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1235_25 = local6_life21;
        int __sourceSpill1235_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1235_25)).substring(((int)(__sourceSpill1235_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1235_30 = local8_life19;
        int __sourceSpill1235_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1235_33 = new byte[8];
        (__sourceSpill1235_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1235_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1235_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1235_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1235_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1235_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1235_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1235_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1235_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1235_34)).doFinal(((byte[])(__sourceSpill1235_33)));
        (__sourceSpill1235_30)[__sourceSpill1235_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "GÝ)[÷-b\033÷S¨Øµf"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1235_38 = local6_life21;
        int __sourceSpill1235_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1235_38)).substring(((int)(__sourceSpill1235_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1235_43 = local8_life19;
        int __sourceSpill1235_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1235_46 = new byte[8];
        (__sourceSpill1235_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1235_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1235_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1235_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1235_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1235_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1235_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1235_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1235_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1235_47)).doFinal(((byte[])(__sourceSpill1235_46)));
        (__sourceSpill1235_43)[__sourceSpill1235_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    H = ((long[])(local8_life19));
    I = ((java.lang.Integer[])(new java.lang.Integer[5]));
}

private static native <E extends Throwable> void __sourceConstructorInit_0c2289bde9fa2c12_0(moom.gt a0, int a1, int a2, int a3, moom.DD a4, int a5, int a6) throws E;

public void b(int p0, int p1) {
java.lang.String local3 = moom.oO.a(((java.lang.String)(((net.minecraft.potion.Potion)((net.minecraft.potion.Potion.a)[this.v])).a__String())), ((java.lang.Object[])(new java.lang.Object[0])));
    if ((this.w >= 3)) {
        if ((this.v != ((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.m)).I)) {
        local3 = __sourceIntrinsic_45fde0f4e55e_invokedynamic7779_8(local3);
    }
    }
    net.minecraft.client.gui.inventory.GuiBeacon.c(((net.minecraft.client.gui.inventory.GuiBeacon)(this.x)), ((java.lang.String)(local3)), ((int)(p0)), ((int)(p1)));
    return;
}


private static moom.Oo c(moom.Oo p0) {
return p0;
}


private static int d(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 25192;
      if (I[var3] == null) {
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
         long var5 = H[var3];
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
         Object[] var9 = (Object[])J.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               J.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/gt", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         I[var3] = var15;
      }

      return I[var3];
}


private static int d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.gt.d(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral7780_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/gt"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static native <E extends Throwable> int __sourceIntrinsic_0c2289bde9fa2c12_originalDynamicSite2323_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0c2289bde9fa2c12_originalDynamicSite2323_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0c2289bde9fa2c12_originalDynamicSite2323_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0c2289bde9fa2c12_originalDynamicSite2323_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0c2289bde9fa2c12_originalDynamicSite2323_11(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_45fde0f4e55e_invokedynamic7779_8(java.lang.String a0) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral7780_0() throws E;
}
