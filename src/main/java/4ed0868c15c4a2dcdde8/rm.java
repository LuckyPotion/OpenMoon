package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
class rm extends moom.rd {

private boolean c;

private static final long d;

private static final long[] f;

private static final java.lang.Integer[] j;

private static final java.util.Map k;

rm() {
super();
    this.c = true;
}


static {
d = ((long)(((moom._a)(moom._c.a(((long)(-7863382340891874828L)), ((long)(-7669010802786217779L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(215100314580601L)))));
    k = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.rm.d ^ 83326898286799L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill999_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill999_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill999_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill999_14 = new byte[8];
    (__sourceSpill999_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill999_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation999_16 = __sourceSpill999_14;
    ((javax.crypto.Cipher)(__sourceSpill999_11)).init(((int)(__sourceSpill999_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill999_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation999_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "8?\031\tK')ºÂr\ræ\013"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill999_25 = local6_life21;
        int __sourceSpill999_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill999_25)).substring(((int)(__sourceSpill999_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill999_30 = local8_life19;
        int __sourceSpill999_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill999_33 = new byte[8];
        (__sourceSpill999_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill999_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill999_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill999_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill999_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill999_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill999_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill999_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill999_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill999_34)).doFinal(((byte[])(__sourceSpill999_33)));
        (__sourceSpill999_30)[__sourceSpill999_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    f = ((long[])(local8_life19));
    j = ((java.lang.Integer[])(new java.lang.Integer[2]));
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 12227;
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
            throw new RuntimeException("moom/rm", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         j[var3] = var15;
      }

      return j[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_ba0968a412a1c7(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8961_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/rm"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


protected net.minecraft.item.ItemStack b(moom.ry p0, net.minecraft.item.ItemStack p1) {
net.minecraft.world.World forwardValue3927_43_0;
    moom.DT forwardValue3927_43_1;
    net.minecraft.block.Block forwardValue3927_50_0;
    net.minecraft.item.ItemStack forwardValue3927_68_0;
    boolean spill3927_0;
    net.minecraft.world.World spill3927_1;
    moom.DT spill3927_2;
    net.minecraft.item.ItemStack spill3927_3;
    net.minecraft.block.Block spill3927_4;
    long life3_3;
    net.minecraft.world.World life6_7;
    int life5_8;
    moom.DT life7_15;
    forward_join_68: {
    forward_join_67: {
    forward_join_64: {
    forward_join_50: {
    forward_join_43: {
    forward_join_41: {
    life3_3 = (moom.rm.d ^ 120605357079676L);
    spill3927_0 = moom.v5.b__Boolean();
    life6_7 = ((moom.ry)(p0)).a__Eu();
    life5_8 = ((spill3927_0) ? 1 : 0);
    life7_15 = ((moom.DT)(((moom.ry)(p0)).a__DT())).a(((moom.bs)(__sourceExactCall_b9f266c58b58a2(((int)(((moom.ry)(p0)).a__Int()))))));
    spill3927_1 = life6_7;
    spill3927_2 = life7_15;
    if (!((life5_8 != 0))) {
        forwardValue3927_43_0 = spill3927_1;
        forwardValue3927_43_1 = spill3927_2;
        break forward_join_43;
    }
    if (!(((net.minecraft.world.World)(spill3927_1)).a__Boolean(((moom.DT)(spill3927_2))))) {
        break forward_join_41;
    }
    ((net.minecraft.world.World)(life6_7)).a(((moom.DT)(life7_15)), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_5292331d6ece3f(((net.minecraft.block.BlockFire)(net.minecraft.init.Blocks.ab))))));
    spill3927_3 = p1;
    if (!((life5_8 != 0))) {
        forwardValue3927_68_0 = spill3927_3;
        break forward_join_68;
    }
    if (!(((net.minecraft.item.ItemStack)(spill3927_3)).a(((int)(1)), ((java.util.Random)(((net.minecraft.world.World)(life6_7)).u))))) {
        break forward_join_67;
    }
    ((net.minecraft.item.ItemStack)(p1)).b = ((int)(0));
    if (!((life5_8 == 0))) {
        break forward_join_67;
    }
    }
    forwardValue3927_43_0 = life6_7;
    forwardValue3927_43_1 = life7_15;
    }
    spill3927_4 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(forwardValue3927_43_0)).a__fE(((moom.DT)(forwardValue3927_43_1))))).a__ch();
    if (!((life5_8 != 0))) {
        forwardValue3927_50_0 = spill3927_4;
        break forward_join_50;
    }
    if (!((spill3927_4 == net.minecraft.init.Blocks.W))) {
        break forward_join_64;
    }
    forwardValue3927_50_0 = net.minecraft.init.Blocks.W;
    }
    ((net.minecraft.block.Block)(forwardValue3927_50_0)).a__Void(((net.minecraft.world.World)(life6_7)), ((moom.DT)(life7_15)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.W))))).a__fE(((net.minecraft.block.properties.IProperty)(moom.ez.Q)), ((java.lang.Comparable)(java.lang.Boolean.TRUE))))));
    ((net.minecraft.world.World)(life6_7)).d__Boolean(((moom.DT)(life7_15)));
    if (!((life5_8 == 0))) {
        break forward_join_67;
    }
    }
    this.c = ((boolean)(false));
    }
    forwardValue3927_68_0 = p1;
    }
    return forwardValue3927_68_0;
}


protected void a(moom.ry p0) {
long life2_3;
    int life4_5;
    forward_join_35: {
    forward_join_24: {
    forward_join_22: {
    life2_3 = (moom.rm.d ^ 112322811025250L);
    life4_5 = ((moom.v5.c__Boolean()) ? 1 : 0);
    if (!((life4_5 == 0))) { break forward_join_22; }
    if (!(this.c)) { break forward_join_24; }
    ((net.minecraft.world.World)(((moom.ry)(p0)).a__Eu())).b(((int)(__sourceIntrinsic_278d39e339b3_invokedynamic4538_5(22902, (7224487048406152447L ^ life2_3)))), ((moom.DT)(((moom.ry)(p0)).a__DT())), ((int)(0)));
    }
    if (!((life4_5 != 0))) { break forward_join_35; }
    }
    ((net.minecraft.world.World)(((moom.ry)(p0)).a__Eu())).b(((int)(__sourceIntrinsic_278d39e339b3_invokedynamic4538_9(17512, (5143409675063339488L ^ life2_3)))), ((moom.DT)(((moom.ry)(p0)).a__DT())), ((int)(0)));
    }
    return;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8961_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_278d39e339b3_invokedynamic4538_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_278d39e339b3_invokedynamic4538_9(int a0, long a1) throws E;

private static native int __sourceExactCall_ba0968a412a1c7(int p0, long p1);
private static native moom.bs __sourceExactCall_b9f266c58b58a2(int p0);

private static native net.minecraft.block.state.IBlockState __sourceExactCall_5292331d6ece3f(net.minecraft.block.BlockFire p0);
private static native net.minecraft.block.state.IBlockState __sourceExactCall_7dba7f72a5b74e(net.minecraft.block.Block p0);
}
