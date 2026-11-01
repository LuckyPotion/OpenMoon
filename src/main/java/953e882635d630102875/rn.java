package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
class rn extends moom.rd {

private boolean c;

private static final long d;

private static final long[] f;

private static final java.lang.Integer[] j;

private static final java.util.Map k;

rn() {
super();
    this.c = true;
}


static {
d = ((long)(((moom._a)(moom._c.a(((long)(-7008039887864403774L)), ((long)(2901068446314059413L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(91074571874742L)))));
    k = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.rn.d ^ 101416212523262L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1000_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1000_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1000_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1000_14 = new byte[8];
    (__sourceSpill1000_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1000_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1000_16 = __sourceSpill1000_14;
    ((javax.crypto.Cipher)(__sourceSpill1000_11)).init(((int)(__sourceSpill1000_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1000_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1000_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[3];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "ìc|NF­\\oH§\001½a~·\031²c\t\r"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1000_25 = local6_life21;
        int __sourceSpill1000_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1000_25)).substring(((int)(__sourceSpill1000_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1000_30 = local8_life19;
        int __sourceSpill1000_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1000_33 = new byte[8];
        (__sourceSpill1000_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1000_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1000_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1000_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1000_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1000_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1000_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1000_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1000_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1000_34)).doFinal(((byte[])(__sourceSpill1000_33)));
        (__sourceSpill1000_30)[__sourceSpill1000_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    f = ((long[])(local8_life19));
    j = ((java.lang.Integer[])(new java.lang.Integer[3]));
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 20524;
      if (j[var3] == null) {
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
         long var5 = f[var3];
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
         Object[] var9 = (Object[])k.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               k.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/rn", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         j[var3] = var15;
      }

      return j[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_15ad394a7cf19d(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8964_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/rn"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


protected net.minecraft.item.ItemStack b(moom.ry p0, net.minecraft.item.ItemStack p1) {
int forwardValue3928_32_0;
    net.minecraft.world.World forwardValue3928_34_0;
    boolean spill3928_0;
    net.minecraft.world.World spill3928_1;
    long life3_3;
    int life5_5;
    net.minecraft.world.World life6_13;
    moom.DT life7_20;
    forward_join_49: {
    forward_join_47: {
    forward_join_44: {
    forward_join_34: {
    forward_join_32: {
    life3_3 = (moom.rn.d ^ 72478519278957L);
    life5_5 = ((moom.v5.c__Boolean()) ? 1 : 0);
    if (!((net.minecraft.item.EnumDyeColor.WHITE == net.minecraft.item.EnumDyeColor.a(((int)(((net.minecraft.item.ItemStack)(p1)).c())))))) {
        break forward_join_49;
    }
    life6_13 = ((moom.ry)(p0)).a__Eu();
    life7_20 = ((moom.DT)(((moom.ry)(p0)).a__DT())).a(((moom.bs)(__sourceExactCall_b9f266c58b58a2(((int)(((moom.ry)(p0)).a__Int()))))));
    spill3928_0 = __sourceExactCall_942daae3ec2433(((net.minecraft.item.ItemStack)(p1)), ((net.minecraft.world.World)(life6_13)), ((moom.DT)(life7_20)));
    if (!((life5_5 == 0))) {
        forwardValue3928_32_0 = ((spill3928_0) ? 1 : 0);
        break forward_join_32;
    }
    if (!(spill3928_0)) {
        break forward_join_44;
    }
    spill3928_1 = life6_13;
    if (!((life5_5 == 0))) {
        forwardValue3928_34_0 = spill3928_1;
        break forward_join_34;
    }
    forwardValue3928_32_0 = ((((net.minecraft.world.World)(spill3928_1)).G) ? 1 : 0);
    }
    if (!((forwardValue3928_32_0 == 0))) {
        break forward_join_47;
    }
    forwardValue3928_34_0 = life6_13;
    }
    ((net.minecraft.world.World)(forwardValue3928_34_0)).b(((int)(__sourceIntrinsic_defb6adcd4c8_invokedynamic3928_15(23513, (213614918352790178L ^ life3_3)))), ((moom.DT)(life7_20)), ((int)(0)));
    if (!((life5_5 != 0))) {
        break forward_join_47;
    }
    }
    this.c = ((boolean)(false));
    }
    return p1;
    }
    return super.b(((moom.ry)(p0)), ((net.minecraft.item.ItemStack)(p1)));
}


protected void a(moom.ry p0) {
long life2_3;
    int life4_5;
    forward_join_35: {
    forward_join_24: {
    forward_join_22: {
    life2_3 = (moom.rn.d ^ 81860303656563L);
    life4_5 = ((moom.v5.b__Boolean()) ? 1 : 0);
    if (!((life4_5 != 0))) { break forward_join_22; }
    if (!(this.c)) { break forward_join_24; }
    ((net.minecraft.world.World)(((moom.ry)(p0)).a__Eu())).b(((int)(__sourceIntrinsic_278d39e339b3_invokedynamic4540_5(25707, (6083690138122876428L ^ life2_3)))), ((moom.DT)(((moom.ry)(p0)).a__DT())), ((int)(0)));
    }
    if (!((life4_5 == 0))) { break forward_join_35; }
    }
    ((net.minecraft.world.World)(((moom.ry)(p0)).a__Eu())).b(((int)(__sourceIntrinsic_278d39e339b3_invokedynamic4540_9(31778, (6181171544324238916L ^ life2_3)))), ((moom.DT)(((moom.ry)(p0)).a__DT())), ((int)(0)));
    }
    return;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8964_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_defb6adcd4c8_invokedynamic3928_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_278d39e339b3_invokedynamic4540_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_278d39e339b3_invokedynamic4540_9(int a0, long a1) throws E;

private static native int __sourceExactCall_15ad394a7cf19d(int p0, long p1);
private static native moom.bs __sourceExactCall_b9f266c58b58a2(int p0);
private static native boolean __sourceExactCall_942daae3ec2433(net.minecraft.item.ItemStack p0, net.minecraft.world.World p1, moom.DT p2);
}
