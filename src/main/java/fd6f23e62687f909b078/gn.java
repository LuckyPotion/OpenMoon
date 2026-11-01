package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
class gn extends moom.gc {

private boolean r;

private static long s;

private static long[] t;

private static java.lang.Integer[] u;

private static java.util.Map v;

public gn(int p0, int p1, int p2, boolean p3) { super(0, 0, 0, 0, 0, (java.lang.String)null); }


private static void __sourceConstructorBody_d13f99923d50eb18(moom.gn receiver, int p0, int p1, int p2, boolean p3) throws Throwable {

long local5 = (moom.gn.s ^ 15744226845345L);

    moom.gn.__sourceConstructorInit_d13f99923d50eb18_0(((moom.gn)(receiver)), ((int)(p0)), ((int)(p1)), ((int)(p2)), ((int)(__sourceIntrinsic_d13f99923d50eb18_originalDynamicSite2779_1(31208, (3650247524230449789L ^ local5)))), ((int)(__sourceIntrinsic_d13f99923d50eb18_originalDynamicSite2779_2(26183, (4372632288454956501L ^ local5)))), ((java.lang.String)("")));

    ((moom.gn)(receiver)).r = ((boolean)(p3));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_d13f99923d50eb18_0(moom.gn a0, int a1, int a2, int a3, int a4, int a5, java.lang.String a6) throws E;

static {
s = ((long)(((moom._a)(moom._c.a(((long)(-7104917418188191239L)), ((long)(-2601427651370380951L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(92070971500826L)))));
    v = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.gn.s ^ 78490296494809L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1229_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1229_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1229_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1229_14 = new byte[8];
    (__sourceSpill1229_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1229_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1229_16 = __sourceSpill1229_14;
    ((javax.crypto.Cipher)(__sourceSpill1229_11)).init(((int)(__sourceSpill1229_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1229_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1229_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[5];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "5\034|_ãä¦Ý\013æ\01362êvO3"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1229_25 = local6_life21;
        int __sourceSpill1229_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1229_25)).substring(((int)(__sourceSpill1229_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1229_30 = local8_life19;
        int __sourceSpill1229_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1229_33 = new byte[8];
        (__sourceSpill1229_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1229_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1229_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1229_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1229_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1229_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1229_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1229_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1229_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1229_34)).doFinal(((byte[])(__sourceSpill1229_33)));
        (__sourceSpill1229_30)[__sourceSpill1229_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "süÛ<ÓÎs­g\013/;íâ"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1229_38 = local6_life21;
        int __sourceSpill1229_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1229_38)).substring(((int)(__sourceSpill1229_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1229_43 = local8_life19;
        int __sourceSpill1229_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1229_46 = new byte[8];
        (__sourceSpill1229_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1229_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1229_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1229_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1229_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1229_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1229_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1229_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1229_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1229_47)).doFinal(((byte[])(__sourceSpill1229_46)));
        (__sourceSpill1229_43)[__sourceSpill1229_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    t = ((long[])(local8_life19));
    u = ((java.lang.Integer[])(new java.lang.Integer[5]));
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral7765_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/gn"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int c(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 12489;
      if (u[var3] == null) {
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
         long var5 = t[var3];
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
         Object[] var9 = (Object[])v.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               v.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/gn", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         u[var3] = var15;
      }

      return u[var3];
}


private static int c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.gn.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public void a(net.minecraft.client.Minecraft p0, int p1, int p2) {
int forwardValue3569_32_0;
    int spill3569_0;
    long spill3569_1;
    long life4_3;
    int life6_46;
    int life7_61;
    int life8_63;
    forward_join_75: {
    forward_join_57: {
    forward_join_53: {
    forward_join_32: {
    forward_join_31: {
    life4_3 = (moom.gn.s ^ 86599532376647L);
    if (!(this.n)) {
        break forward_join_75;
    }
    if (!((p1 >= this.i))) {
        break forward_join_31;
    }
    if (!((p2 >= this.j))) {
        break forward_join_31;
    }
    if (!((p1 < (this.i + this.g)))) {
        break forward_join_31;
    }
    if (!((p2 < (this.j + this.h)))) {
        break forward_join_31;
    }
    forwardValue3569_32_0 = 1;
    break forward_join_32;
    }
    forwardValue3569_32_0 = 0;
    }
    life6_46 = forwardValue3569_32_0;
    spill3569_0 = 12712;
    moom.kZ.c(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    spill3569_1 = (3199097472277189336L ^ life4_3);
    ((net.minecraft.client.renderer.texture.TextureManager)(((net.minecraft.client.Minecraft)(p0)).a__ok())).a__Void(((moom.DD)(net.minecraft.client.gui.GuiScreenBook.x)));
    life7_61 = 0;
    life8_63 = __sourceIntrinsic_de1ba8f88103_invokedynamic3569_12(spill3569_0, spill3569_1);
    if (!((life6_46 != 0))) {
        break forward_join_53;
    }
    life7_61 += 23;
    }
    if (!((!this.r))) {
        break forward_join_57;
    }
    life8_63 += 13;
    }
    ((moom.gn)(this)).b(((int)(this.i)), ((int)(this.j)), ((int)(life7_61)), ((int)(life8_63)), ((int)(__sourceIntrinsic_de1ba8f88103_invokedynamic3569_16(26300, (2919983954623120846L ^ life4_3)))), ((int)(__sourceIntrinsic_de1ba8f88103_invokedynamic3569_17(31401, (6901914755983170008L ^ life4_3)))));
    }
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_d13f99923d50eb18_originalDynamicSite2779_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d13f99923d50eb18_originalDynamicSite2779_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral7765_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_de1ba8f88103_invokedynamic3569_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_de1ba8f88103_invokedynamic3569_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_de1ba8f88103_invokedynamic3569_17(int a0, long a1) throws E;
}
