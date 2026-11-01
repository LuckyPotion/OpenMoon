package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class yc {

private final java.lang.String[][] a;

private final java.lang.Object[][] b;

private static final long c;

private static final long[] d;

private static final java.lang.Integer[] e;

private static final java.util.Map f;

public yc() {
super();
    this.a = ((java.lang.String[][])(new java.lang.String[][] {new java.lang.String[] {"XXX", " # ", " # "}, new java.lang.String[] {"X", "#", "#"}, new java.lang.String[] {"XX", "X#", " #"}, new java.lang.String[] {"XX", " #", " #"}}));
    this.b = ((java.lang.Object[][])(new java.lang.Object[][] {new java.lang.Object[] {net.minecraft.init.Blocks.f, net.minecraft.init.Blocks.e, net.minecraft.init.Items.j, net.minecraft.init.Items.i, net.minecraft.init.Items.k}, new java.lang.Object[] {net.minecraft.init.Items.o, net.minecraft.init.Items.s, net.minecraft.init.Items.b, net.minecraft.init.Items.w, net.minecraft.init.Items.D}, new java.lang.Object[] {net.minecraft.init.Items.n, net.minecraft.init.Items.r, net.minecraft.init.Items.a, net.minecraft.init.Items.v, net.minecraft.init.Items.C}, new java.lang.Object[] {net.minecraft.init.Items.p, net.minecraft.init.Items.t, net.minecraft.init.Items.c, net.minecraft.init.Items.x, net.minecraft.init.Items.E}, new java.lang.Object[] {net.minecraft.init.Items.I, net.minecraft.init.Items.J, net.minecraft.init.Items.K, net.minecraft.init.Items.L, net.minecraft.init.Items.M}}));
    return;
}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(5478272690178360488L)), ((long)(-9095209264851412716L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(235914089648663L)))));
    f = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.yc.c ^ 68918672859732L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1127_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1127_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1127_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1127_14 = new byte[8];
    (__sourceSpill1127_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1127_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1127_16 = __sourceSpill1127_14;
    ((javax.crypto.Cipher)(__sourceSpill1127_11)).init(((int)(__sourceSpill1127_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1127_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1127_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[3];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "@x.8¦îÚæyv§v(a\007\017?£\b\"áàÚ"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1127_25 = local6_life21;
        int __sourceSpill1127_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1127_25)).substring(((int)(__sourceSpill1127_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1127_30 = local8_life19;
        int __sourceSpill1127_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1127_33 = new byte[8];
        (__sourceSpill1127_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1127_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1127_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1127_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1127_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1127_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1127_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1127_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1127_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1127_34)).doFinal(((byte[])(__sourceSpill1127_33)));
        (__sourceSpill1127_30)[__sourceSpill1127_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    d = ((long[])(local8_life19));
    e = ((java.lang.Integer[])(new java.lang.Integer[3]));
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral9809_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/yc"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.yc.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 2642;
      if (e[var3] == null) {
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
         long var5 = d[var3];
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
         Object[] var9 = (Object[])f.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               f.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/yc", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         e[var3] = var15;
      }

      return e[var3];
}


public void a(net.minecraft.item.crafting.CraftingManager p0) {
long local2 = (moom.yc.c ^ 103488522743479L);
    int local4 = 0;
    while ((local4 < ((this.b)[0]).length)) {
        java.lang.Object local5 = ((this.b)[0])[local4];
        int local6 = 0;
        while ((local6 < ((this.b).length - 1))) {
        net.minecraft.item.Item local7 = ((net.minecraft.item.Item)(((this.b)[(local6 + 1)])[local4]));
        ((net.minecraft.item.crafting.CraftingManager)(p0)).a(((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(local7))), ((java.lang.Object[])(new java.lang.Object[] {(this.a)[local6], java.lang.Character.valueOf(((char)(__sourceIntrinsic_396de9353eae_invokedynamic8156_7(20613, (6301907803694561735L ^ local2))))), net.minecraft.init.Items.y, java.lang.Character.valueOf(((char)(__sourceIntrinsic_396de9353eae_invokedynamic8156_10(17769, (6389822801861995561L ^ local2))))), local5})));
        local6 += 1;
    }
        local4 += 1;
    }
    ((net.minecraft.item.crafting.CraftingManager)(p0)).a(((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(net.minecraft.init.Items.a4))), ((java.lang.Object[])(new java.lang.Object[] {" #", "# ", java.lang.Character.valueOf(((char)(__sourceIntrinsic_396de9353eae_invokedynamic8156_14(27807, (897621251938764254L ^ local2))))), net.minecraft.init.Items.j})));
    return;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral9809_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic8156_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic8156_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic8156_14(int a0, long a1) throws E;
}
