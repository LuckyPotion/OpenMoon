package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
class gq extends moom.gc {

private moom.DD r;

private int s;

private int t;

private boolean u;

private static long z;

private static long[] E;

private static java.lang.Integer[] F;

private static java.util.Map G;

protected gq(int p0, int p1, int p2, moom.DD p3, int p4, int p5) { super(0, 0, 0, 0, 0, (java.lang.String)null); }


private static void __sourceConstructorBody_c2f2e7e150eef327(moom.gq receiver, int p0, int p1, int p2, moom.DD p3, int p4, int p5) throws Throwable {

long local7 = (moom.gq.z ^ 66632524474157L);

    moom.gq.__sourceConstructorInit_c2f2e7e150eef327_0(((moom.gq)(receiver)), ((int)(p0)), ((int)(p1)), ((int)(p2)), ((int)(__sourceIntrinsic_c2f2e7e150eef327_originalDynamicSite2785_1(24108, (7828900237983380699L ^ local7)))), ((int)(__sourceIntrinsic_c2f2e7e150eef327_originalDynamicSite2785_2(14638, (450876192705319899L ^ local7)))), ((java.lang.String)("")));

    ((moom.gq)(receiver)).r = ((moom.DD)(p3));

    ((moom.gq)(receiver)).s = ((int)(p4));

    ((moom.gq)(receiver)).t = ((int)(p5));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_c2f2e7e150eef327_0(moom.gq a0, int a1, int a2, int a3, int a4, int a5, java.lang.String a6) throws E;

static {
z = ((long)(((moom._a)(moom._c.a(((long)(8631393721460512395L)), ((long)(1973200502234145672L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(215891373904464L)))));
    G = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.gq.z ^ 96934636359700L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1232_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1232_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1232_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1232_14 = new byte[8];
    (__sourceSpill1232_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1232_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1232_16 = __sourceSpill1232_14;
    ((javax.crypto.Cipher)(__sourceSpill1232_11)).init(((int)(__sourceSpill1232_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1232_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1232_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[5];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "O¦\033Ó\007o\t+%§X)ä\026A)±¹y\fÒ"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1232_25 = local6_life21;
        int __sourceSpill1232_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1232_25)).substring(((int)(__sourceSpill1232_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1232_30 = local8_life19;
        int __sourceSpill1232_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1232_33 = new byte[8];
        (__sourceSpill1232_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1232_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1232_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1232_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1232_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1232_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1232_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1232_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1232_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1232_34)).doFinal(((byte[])(__sourceSpill1232_33)));
        (__sourceSpill1232_30)[__sourceSpill1232_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "ðxÁ\027áW¢ÈÁ°H#ÐfÙ"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1232_38 = local6_life21;
        int __sourceSpill1232_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1232_38)).substring(((int)(__sourceSpill1232_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1232_43 = local8_life19;
        int __sourceSpill1232_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1232_46 = new byte[8];
        (__sourceSpill1232_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1232_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1232_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1232_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1232_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1232_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1232_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1232_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1232_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1232_47)).doFinal(((byte[])(__sourceSpill1232_46)));
        (__sourceSpill1232_43)[__sourceSpill1232_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    E = ((long[])(local8_life19));
    F = ((java.lang.Integer[])(new java.lang.Integer[5]));
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public boolean b() {
return ((((this.u) ? 1 : 0)) != 0);
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral7775_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/gq"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.gq.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int c(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 22429;
      if (F[var3] == null) {
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
         long var5 = E[var3];
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
         Object[] var9 = (Object[])G.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               G.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/gq", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         F[var3] = var15;
      }

      return F[var3];
}


public void a(net.minecraft.client.Minecraft p0, int p1, int p2) {
moom.gq forwardValue3570_41_0;
    moom.gq forwardValue3570_42_0;
    int forwardValue3570_42_1;
    moom.gq spill3570_0;
    long life4_3;
    int life6_62;
    int life7_64;
    forward_join_127: {
    forward_join_103: {
    forward_join_81: {
    forward_join_71: {
    forward_join_62: {
    forward_join_42: {
    forward_join_41: {
    life4_3 = (moom.gq.z ^ 85097687632381L);
    if (!(this.n)) {
        break forward_join_127;
    }
    ((net.minecraft.client.renderer.texture.TextureManager)(((net.minecraft.client.Minecraft)(p0)).a__ok())).a__Void(((moom.DD)(net.minecraft.client.gui.inventory.GuiBeacon.aa)));
    moom.kZ.c(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    spill3570_0 = this;
    if (!((p1 >= this.i))) {
        forwardValue3570_41_0 = spill3570_0;
        break forward_join_41;
    }
    if (!((p2 >= this.j))) {
        forwardValue3570_41_0 = spill3570_0;
        break forward_join_41;
    }
    if (!((p1 < (this.i + this.g)))) {
        forwardValue3570_41_0 = spill3570_0;
        break forward_join_41;
    }
    if (!((p2 < (this.j + this.h)))) {
        forwardValue3570_41_0 = spill3570_0;
        break forward_join_41;
    }
    forwardValue3570_42_0 = spill3570_0;
    forwardValue3570_42_1 = 1;
    break forward_join_42;
    }
    forwardValue3570_42_0 = forwardValue3570_41_0;
    forwardValue3570_42_1 = 0;
    }
    ((moom.gq)(forwardValue3570_42_0)).o = ((boolean)__sourceIntrinsic_integerToBoolean((forwardValue3570_42_1)));
    life6_62 = __sourceIntrinsic_de1ba8f88103_invokedynamic3570_13(11233, (1262314488297123783L ^ life4_3));
    life7_64 = 0;
    if (!((!this.m))) {
        break forward_join_62;
    }
    life7_64 = (life7_64 + (this.g * 2));
    break forward_join_81;
    }
    if (!(this.u)) {
        break forward_join_71;
    }
    life7_64 = (life7_64 + this.g);
    break forward_join_81;
    }
    if (!(this.o)) {
        break forward_join_81;
    }
    life7_64 = (life7_64 + (this.g * 3));
    }
    ((moom.gq)(this)).b(((int)(this.i)), ((int)(this.j)), ((int)(life7_64)), ((int)(life6_62)), ((int)(this.g)), ((int)(this.h)));
    if (!((!((moom.DD)(net.minecraft.client.gui.inventory.GuiBeacon.aa)).equals(((java.lang.Object)(this.r)))))) {
        break forward_join_103;
    }
    ((net.minecraft.client.renderer.texture.TextureManager)(((net.minecraft.client.Minecraft)(p0)).a__ok())).a__Void(((moom.DD)(this.r)));
    }
    ((moom.gq)(this)).b(((int)((this.i + 2))), ((int)((this.j + 2))), ((int)(this.s)), ((int)(this.t)), ((int)(__sourceIntrinsic_de1ba8f88103_invokedynamic3570_35(30060, (8500448344450675016L ^ life4_3)))), ((int)(__sourceIntrinsic_de1ba8f88103_invokedynamic3570_36(6225, (1718050764405922929L ^ life4_3)))));
    }
    return;
}


public void a__sourceReturn_f633c984d8(boolean p0) {
this.u = ((boolean)(p0));
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_c2f2e7e150eef327_originalDynamicSite2785_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c2f2e7e150eef327_originalDynamicSite2785_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral7775_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_de1ba8f88103_invokedynamic3570_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_de1ba8f88103_invokedynamic3570_35(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_de1ba8f88103_invokedynamic3570_36(int a0, long a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
