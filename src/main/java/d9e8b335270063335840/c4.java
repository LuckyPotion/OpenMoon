package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class c4 extends moom.cT {

private static final long R;

private static final long[] S;

private static final java.lang.Integer[] T;

private static final java.util.Map U;

protected c4() {
super(moom.fn.e, moom.fm.D);
    (this).a(0x0.0p+0f, 0x0.0p+0f, 0x0.0p+0f, 0x1.0000000000000p+0f, 0x1.8000000000000p-1f, 0x1.0000000000000p+0f);
    (this).b(0);
    (this).a(net.minecraft.creativetab.CreativeTabs.c);
}


static {
R = ((long)(((moom._a)(moom._c.a(((long)(-8477340215463076462L)), ((long)(2895013227651224965L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(175155655215127L)))));
    U = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.c4.R ^ 127375147281613L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill780_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill780_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill780_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill780_14 = new byte[8];
    (__sourceSpill780_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill780_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation780_16 = __sourceSpill780_14;
    ((javax.crypto.Cipher)(__sourceSpill780_11)).init(((int)(__sourceSpill780_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill780_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation780_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[3];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "ríñ¾Õ´\\¤¶ÐâJ(|#*¹\n­q"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill780_25 = local6_life21;
        int __sourceSpill780_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill780_25)).substring(((int)(__sourceSpill780_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill780_30 = local8_life19;
        int __sourceSpill780_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill780_33 = new byte[8];
        (__sourceSpill780_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill780_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill780_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill780_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill780_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill780_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill780_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill780_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill780_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill780_34)).doFinal(((byte[])(__sourceSpill780_33)));
        (__sourceSpill780_30)[__sourceSpill780_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    S = ((long[])(local8_life19));
    T = ((java.lang.Integer[])(new java.lang.Integer[3]));
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7020_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/c4"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 3145;
      if (T[var3] == null) {
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
         long var5 = S[var3];
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
         Object[] var9 = (Object[])U.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               U.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/c4", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         T[var3] = var15;
      }

      return T[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.c4.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public void c(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, java.util.Random p3) {
int forestValue822_20_0;
    int forestValue822_20_1;
    int forestValue822_60_0;
    int forestValue822_64_0;
    net.minecraft.world.World forestValue822_101_0;
    int[] spill822_0;
    int spill822_1;
    int spill822_2;
    int spill822_3;
    int spill822_4;
    net.minecraft.world.World spill822_5;
    long life5_3;
    int[] life7_11;
    int life8_17;
    int life9_26;
    int life10_70;
    moom.DT life11_79;
    forest_join_153: {
    life5_3 = (moom.c4.R ^ 49682982061973L);
    spill822_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    super.c(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((java.util.Random)(p3)));
    life7_11 = spill822_0;
    life8_17 = __sourceIntrinsic_79fa39d0e3aa_invokedynamic822_3(28943, (2186491483118404156L ^ life5_3));
    forest_cycle_18: while (true) {
    forest_join_150: {
    forestValue822_20_0 = life8_17;
    forestValue822_20_1 = 2;
    forest_cycle_20: while (true) {
    if (!((forestValue822_20_0 <= forestValue822_20_1))) {
        break forest_join_153;
    }
    life9_26 = __sourceIntrinsic_79fa39d0e3aa_invokedynamic822_4(13284, (6317598132896252116L ^ life5_3));
    forest_cycle_27: while (true) {
    forest_join_148: {
    forest_join_147: {
    forest_join_64: {
    forest_join_60: {
    forest_join_53: {
    if (!((life9_26 <= 2))) {
        break forest_join_150;
    }
    spill822_1 = life8_17;
    if (!((life7_11 != null))) {
        forestValue822_60_0 = spill822_1;
        break forest_join_60;
    }
    spill822_2 = __sourceIntrinsic_79fa39d0e3aa_invokedynamic822_5(13284, (6317598132896252116L ^ life5_3));
    if (!((life7_11 != null))) {
        forestValue822_20_0 = spill822_1;
        forestValue822_20_1 = spill822_2;
        continue forest_cycle_20;
    }
    if (!((spill822_1 > spill822_2))) {
        break forest_join_53;
    }
    spill822_3 = life8_17;
    if (!((life7_11 != null))) {
        forestValue822_60_0 = spill822_3;
        break forest_join_60;
    }
    if (!((spill822_3 < 2))) {
        break forest_join_53;
    }
    spill822_4 = life9_26;
    if (!((life7_11 != null))) {
        forestValue822_60_0 = spill822_4;
        break forest_join_60;
    }
    if (!((spill822_4 == -1))) {
        break forest_join_53;
    }
    life9_26 = 2;
    }
    forestValue822_60_0 = ((java.util.Random)(p3)).nextInt(((int)(__sourceIntrinsic_79fa39d0e3aa_invokedynamic822_6(18296, (8249641279206995018L ^ life5_3)))));
    }
    if (!((life7_11 != null))) {
        forestValue822_64_0 = forestValue822_60_0;
        break forest_join_64;
    }
    if (!((forestValue822_60_0 == 0))) {
        break forest_join_147;
    }
    forestValue822_64_0 = 0;
    }
    life10_70 = forestValue822_64_0;
    forest_cycle_65: while (true) {
    forest_join_145: {
    forest_join_144: {
    forest_join_101: {
    forest_join_100: {
    if (!((life10_70 <= 1))) {
        break forest_join_147;
    }
    life11_79 = ((moom.DT)(p1)).a(((int)(life8_17)), ((int)(life10_70)), ((int)(life9_26)));
    if (!((life7_11 != null))) {
        break forest_join_148;
    }
    if (!((life7_11 != null))) {
        break forest_join_145;
    }
    if (!((((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life11_79))))).a__ch() == net.minecraft.init.Blocks.X))) {
        break forest_join_144;
    }
    spill822_5 = p0;
    if (!((life7_11 != null))) {
        forestValue822_101_0 = spill822_5;
        break forest_join_101;
    }
    if (!((!((net.minecraft.world.World)(spill822_5)).a__Boolean(((moom.DT)(((moom.DT)(p1)).a(((int)((life8_17 / 2))), ((int)(0)), ((int)((life9_26 / 2)))))))))) {
        break forest_join_100;
    }
    if (!((life7_11 == null))) {
        break forest_join_147;
    }
    }
    forestValue822_101_0 = p0;
    }
    ((net.minecraft.world.World)(forestValue822_101_0)).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.ENCHANTMENT_TABLE)), ((double)((((double) ((moom.DT)(p1)).a()) + 0x1.0p-1d))), ((double)((((double) ((moom.DT)(p1)).b()) + 0x1.0p1d))), ((double)((((double) ((moom.DT)(p1)).c()) + 0x1.0p-1d))), ((double)((((double) (((float) life8_17) + ((java.util.Random)(p3)).nextFloat())) - 0x1.0p-1d))), ((double)(((double) ((((float) life10_70) - ((java.util.Random)(p3)).nextFloat()) - 0x1.0p0f)))), ((double)((((double) (((float) life9_26) + ((java.util.Random)(p3)).nextFloat())) - 0x1.0p-1d))), ((int[])(new int[0])));
    }
    life10_70 += 1;
    }
    if (!((life7_11 == null))) {
        continue forest_cycle_65;
    }
    break forest_cycle_65;
    }
    }
    life9_26 += 1;
    }
    if (!((life7_11 == null))) {
        continue forest_cycle_27;
    }
    break forest_cycle_27;
    }
    break forest_cycle_20;
    }
    }
    life8_17 += 1;
    if (!((life7_11 == null))) {
        continue forest_cycle_18;
    }
    break forest_cycle_18;
    }
    }
    return;
}


public int c__Int() {
return 3;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public boolean a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.entity.player.EntityPlayer p3, moom.bs p4, float p5, float p6, float p7) {
int forwardValue3015_25_0;
    boolean spill3015_0;
    int spill3015_1;
    long life9_3;
    int[] life11_5;
    net.minecraft.tileentity.TileEntity life12_17;
    forward_join_25: {
    forward_join_24: {
    life9_3 = (moom.c4.R ^ 4964789323874L);
    life11_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3015_0 = ((net.minecraft.world.World)(p0)).G;
    if (!((life11_5 != null))) {
        forwardValue3015_25_0 = ((spill3015_0) ? 1 : 0);
        break forward_join_25;
    }
    if (!((!spill3015_0))) {
        break forward_join_24;
    }
    life12_17 = ((net.minecraft.world.World)(p0)).a__B9(((moom.DT)(p1)));
    spill3015_1 = ((life12_17 instanceof moom.Ce) ? 1 : 0);
    if (!((life11_5 != null))) {
        forwardValue3015_25_0 = spill3015_1;
        break forward_join_25;
    }
    if (!((spill3015_1 != 0))) {
        break forward_join_24;
    }
    ((net.minecraft.entity.player.EntityPlayer)(p3)).a(((net.minecraft.world.IInteractionObject)(((moom.Ce)(life12_17)))));
    }
    forwardValue3015_25_0 = 1;
    }
    return ((forwardValue3015_25_0) != 0);
}


public net.minecraft.tileentity.TileEntity a(net.minecraft.world.World p0, int p1) {
return new moom.Ce();
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.entity.EntityLivingBase p3, net.minecraft.item.ItemStack p4) {
net.minecraft.tileentity.TileEntity forwardValue3014_26_0;
    int[] spill3014_0;
    net.minecraft.tileentity.TileEntity spill3014_1;
    long life6_3;
    int[] life8_12;
    net.minecraft.tileentity.TileEntity life9_19;
    forward_join_30: {
    forward_join_26: {
    life6_3 = (moom.c4.R ^ 33582747139505L);
    spill3014_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    super.a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((net.minecraft.entity.EntityLivingBase)(p3)), ((net.minecraft.item.ItemStack)(p4)));
    life8_12 = spill3014_0;
    if (!(((net.minecraft.item.ItemStack)(p4)).f__Boolean())) {
        break forward_join_30;
    }
    life9_19 = ((net.minecraft.world.World)(p0)).a__B9(((moom.DT)(p1)));
    spill3014_1 = life9_19;
    if (!((life8_12 != null))) {
        forwardValue3014_26_0 = spill3014_1;
        break forward_join_26;
    }
    if (!((((spill3014_1 instanceof moom.Ce) ? 1 : 0) != 0))) {
        break forward_join_30;
    }
    forwardValue3014_26_0 = life9_19;
    }
    ((moom.Ce)(((moom.Ce)(forwardValue3014_26_0)))).a(((java.lang.String)(((net.minecraft.item.ItemStack)(p4)).b__String())));
    }
    return;
}


public boolean g() {
return ((0) != 0);
}


public boolean j() {
return ((0) != 0);
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7020_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_79fa39d0e3aa_invokedynamic822_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_79fa39d0e3aa_invokedynamic822_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_79fa39d0e3aa_invokedynamic822_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_79fa39d0e3aa_invokedynamic822_6(int a0, long a1) throws E;
}
