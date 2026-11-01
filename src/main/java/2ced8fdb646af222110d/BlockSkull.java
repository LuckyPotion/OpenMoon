package net.minecraft.block;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


























import moom.fD;









import net.minecraft.block.BlockPlanks$EnumType;






import net.minecraft.tileentity.TileEntitySkull;




import net.minecraft.init.Blocks;
import java.util.Map;
import net.minecraft.block.state.IBlockState;
public class BlockSkull extends moom.cT {

public static final moom.fx R;

public static final moom.fv S;

private static final com.google.common.base.Predicate<moom.fD> T;

private moom.fG U;

private moom.fG V;

private static final long X;

private static final long[] Y;

private static final java.lang.Integer[] Z;

private static final java.util.Map bb;

protected BlockSkull() {
super(moom.fn.q);
    (this).a__Void((((this.M).a__fE()).a__fE(net.minecraft.block.BlockSkull.R, moom.bs.NORTH)).a__fE(net.minecraft.block.BlockSkull.S, java.lang.Boolean.FALSE));
    (this).a(0x1.0000000000000p-2f, 0x0.0p+0f, 0x1.0000000000000p-2f, 0x1.8000000000000p-1f, 0x1.0000000000000p-1f, 0x1.8000000000000p-1f);
}


static {
X = ((long)(((moom._a)(moom._c.a(((long)(6972433386418806736L)), ((long)(-5673491404209157924L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(239789631803589L)))));
    bb = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (net.minecraft.block.BlockSkull.X ^ 26559567736366L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1758_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1758_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1758_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1758_14 = new byte[8];
    (__sourceSpill1758_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1758_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1758_16 = __sourceSpill1758_14;
    ((javax.crypto.Cipher)(__sourceSpill1758_11)).init(((int)(__sourceSpill1758_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1758_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1758_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[9];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "\001\0262_j!ÜNîW]\r^Üx<\\\030xtuyï|ÚeÒÜ£Å\031è\023T\017dÍ\r(²tìS*ÒÅyM)ä¬"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1758_25 = local6_life21;
        int __sourceSpill1758_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1758_25)).substring(((int)(__sourceSpill1758_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1758_30 = local8_life19;
        int __sourceSpill1758_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1758_33 = new byte[8];
        (__sourceSpill1758_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1758_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1758_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1758_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1758_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1758_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1758_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1758_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1758_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1758_34)).doFinal(((byte[])(__sourceSpill1758_33)));
        (__sourceSpill1758_30)[__sourceSpill1758_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "/¶Y4£ªdæ¶oj\005K"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1758_38 = local6_life21;
        int __sourceSpill1758_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1758_38)).substring(((int)(__sourceSpill1758_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1758_43 = local8_life19;
        int __sourceSpill1758_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1758_46 = new byte[8];
        (__sourceSpill1758_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1758_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1758_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1758_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1758_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1758_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1758_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1758_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1758_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1758_47)).doFinal(((byte[])(__sourceSpill1758_46)));
        (__sourceSpill1758_43)[__sourceSpill1758_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    Y = ((long[])(local8_life19));
    Z = ((java.lang.Integer[])(new java.lang.Integer[9]));
    R = ((moom.fx)(moom.fx.a(((java.lang.String)("facing")))));
    S = ((moom.fv)(moom.fv.a(((java.lang.String)("nodrop")))));
    T = ((com.google.common.base.Predicate)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1758_56()));
}


public int b(net.minecraft.block.state.IBlockState p0) {
int forwardValue4746_33_0;
    int[] spill4746_0;
    boolean spill4746_1;
    long life2_3;
    int life5_5;
    int life5_14;
    int[] life4_15;
    forward_join_33: {
    forward_join_32: {
    life2_3 = (net.minecraft.block.BlockSkull.X ^ 14762493503819L);
    life5_5 = 0;
    spill4746_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life5_14 = (life5_5 | ((moom.bs)(((moom.bs)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockSkull.R))))))).a());
    life4_15 = spill4746_0;
    spill4746_1 = ((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockSkull.S))))))).booleanValue();
    if (!((life4_15 != null))) {
        forwardValue4746_33_0 = ((spill4746_1) ? 1 : 0);
        break forward_join_33;
    }
    if (!(spill4746_1)) {
        break forward_join_32;
    }
    life5_14 = (life5_14 | __sourceIntrinsic_8db5871551d4_invokedynamic4746_11(17101, (5153822428824817150L ^ life2_3)));
    }
    forwardValue4746_33_0 = life5_14;
    }
    return forwardValue4746_33_0;
}


public net.minecraft.block.state.IBlockState b__fE(int p0) {
net.minecraft.block.state.IBlockState forwardValue4747_30_0;
    moom.fv forwardValue4747_30_1;
    int forwardValue4747_30_2;
    net.minecraft.block.state.IBlockState forwardValue4747_31_0;
    moom.fv forwardValue4747_31_1;
    net.minecraft.block.state.IBlockState forwardValue4747_32_0;
    moom.fv forwardValue4747_32_1;
    int forwardValue4747_32_2;
    net.minecraft.block.state.IBlockState spill4747_0;
    moom.fv spill4747_1;
    int spill4747_2;
    long life2_3;
    int[] life4_5;
    forward_join_32: {
    forward_join_31: {
    forward_join_30: {
    life2_3 = (net.minecraft.block.BlockSkull.X ^ 2031660438081L);
    life4_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill4747_0 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.BlockSkull)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockSkull.R)), ((java.lang.Comparable)(__sourceExactCall_e942200b9dad46(((int)((p0 & __sourceIntrinsic_819466f05fee_invokedynamic4747_4(20108, (2543022530568207025L ^ life2_3)))))))));
    spill4747_1 = net.minecraft.block.BlockSkull.S;
    spill4747_2 = (p0 & __sourceIntrinsic_819466f05fee_invokedynamic4747_8(27762, (5284449652494899272L ^ life2_3)));
    if (!((life4_5 != null))) {
        forwardValue4747_30_0 = spill4747_0;
        forwardValue4747_30_1 = spill4747_1;
        forwardValue4747_30_2 = spill4747_2;
        break forward_join_30;
    }
    if (!((spill4747_2 > 0))) {
        forwardValue4747_31_0 = spill4747_0;
        forwardValue4747_31_1 = spill4747_1;
        break forward_join_31;
    }
    forwardValue4747_30_0 = spill4747_0;
    forwardValue4747_30_1 = spill4747_1;
    forwardValue4747_30_2 = 1;
    }
    forwardValue4747_32_0 = forwardValue4747_30_0;
    forwardValue4747_32_1 = forwardValue4747_30_1;
    forwardValue4747_32_2 = forwardValue4747_30_2;
    break forward_join_32;
    }
    forwardValue4747_32_0 = forwardValue4747_31_0;
    forwardValue4747_32_1 = forwardValue4747_31_1;
    forwardValue4747_32_2 = 0;
    }
    return ((net.minecraft.block.state.IBlockState)(forwardValue4747_32_0)).a__fE(((net.minecraft.block.properties.IProperty)(forwardValue4747_32_1)), ((java.lang.Comparable)(java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue4747_32_2)))))));
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral10060_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/dg"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


protected moom.fG b__sourceReturn_6e102d3166() {
moom.fG forwardValue4745_57_0;
    moom.fG spill4745_0;
    long life1_3;
    int[] life3_5;
    forward_join_57: {
    forward_join_55: {
    life1_3 = (net.minecraft.block.BlockSkull.X ^ 92609370190449L);
    life3_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill4745_0 = this.V;
    if (!((life3_5 != null))) {
        forwardValue4745_57_0 = spill4745_0;
        break forward_join_57;
    }
    if (!((spill4745_0 == null))) {
        break forward_join_55;
    }
    this.V = ((moom.fG)(((moom.fJ)(((moom.fJ)(((moom.fJ)(((moom.fJ)(((moom.fJ)(moom.fJ.a__fJ())).a(((java.lang.String[])(new java.lang.String[] {"^^^", "###", "~#~"}))))).a(((char)(__sourceIntrinsic_c6887d250758_invokedynamic4745_5(32266, (6337758806443125253L ^ life1_3)))), ((com.google.common.base.Predicate)(moom.fD.a(((com.google.common.base.Predicate)(__sourceExactCall_5dae44cbe9469e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aW))))))))))).a(((char)(__sourceIntrinsic_c6887d250758_invokedynamic4745_10(8347, (3470288382614320277L ^ life1_3)))), ((com.google.common.base.Predicate)(net.minecraft.block.BlockSkull.T))))).a(((char)(__sourceIntrinsic_c6887d250758_invokedynamic4745_13(21743, (7185438343353942244L ^ life1_3)))), ((com.google.common.base.Predicate)(moom.fD.a(((com.google.common.base.Predicate)(__sourceExactCall_5dae44cbe9469e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a))))))))))).a()));
    }
    forwardValue4745_57_0 = this.V;
    }
    return forwardValue4745_57_0;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 8182;
      if (Z[var3] == null) {
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
         long var5 = Y[var3];
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
         Object[] var9 = (Object[])bb.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               bb.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/dg", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         Z[var3] = var15;
      }

      return Z[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_67b3e10f0f71a7(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public void c(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
int forwardValue4748_16_0;
    net.minecraft.tileentity.TileEntity forwardValue4748_27_0;
    net.minecraft.tileentity.TileEntitySkull forwardValue4748_46_0;
    boolean spill4748_0;
    net.minecraft.tileentity.TileEntity spill4748_1;
    net.minecraft.tileentity.TileEntitySkull spill4748_2;
    long life4_3;
    int[] life6_5;
    net.minecraft.tileentity.TileEntity life7_26;
    net.minecraft.tileentity.TileEntitySkull life8_40;
    net.minecraft.item.ItemStack life9_50;
    net.minecraft.nbt.NBTTagCompound life10_74;
    forward_join_76: {
    forward_join_71: {
    forward_join_67: {
    forward_join_46: {
    forward_join_27: {
    forward_join_16: {
    life4_3 = (net.minecraft.block.BlockSkull.X ^ 78215725934325L);
    life6_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill4748_0 = ((net.minecraft.world.World)(p0)).G;
    if (!((life6_5 != null))) {
        forwardValue4748_16_0 = ((spill4748_0) ? 1 : 0);
        break forward_join_16;
    }
    if (!((!spill4748_0))) {
        break forward_join_76;
    }
    forwardValue4748_16_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockSkull.S))))))).booleanValue()) ? 1 : 0);
    }
    if (!((forwardValue4748_16_0 == 0))) {
        break forward_join_71;
    }
    life7_26 = ((net.minecraft.world.World)(p0)).a__B9(((moom.DT)(p1)));
    spill4748_1 = life7_26;
    if (!((life6_5 != null))) {
        forwardValue4748_27_0 = spill4748_1;
        break forward_join_27;
    }
    if (!((((spill4748_1 instanceof net.minecraft.tileentity.TileEntitySkull) ? 1 : 0) != 0))) {
        break forward_join_71;
    }
    forwardValue4748_27_0 = life7_26;
    }
    life8_40 = ((net.minecraft.tileentity.TileEntitySkull)(forwardValue4748_27_0));
    life9_50 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.bM, 1, ((net.minecraft.block.BlockSkull)(this)).a__Int(((net.minecraft.world.World)(p0)), ((moom.DT)(p1))));
    spill4748_2 = life8_40;
    if (!((life6_5 != null))) {
        forwardValue4748_46_0 = spill4748_2;
        break forward_join_46;
    }
    if (!((((net.minecraft.tileentity.TileEntitySkull)(spill4748_2)).a__sourceReturn_8abf5c6871() == 3))) {
        break forward_join_67;
    }
    forwardValue4748_46_0 = life8_40;
    }
    if (!((((net.minecraft.tileentity.TileEntitySkull)(forwardValue4748_46_0)).a__GameProfile() != null))) {
        break forward_join_67;
    }
    ((net.minecraft.item.ItemStack)(life9_50)).b(((net.minecraft.nbt.NBTTagCompound)(new net.minecraft.nbt.NBTTagCompound())));
    life10_74 = new net.minecraft.nbt.NBTTagCompound();
    moom.yD.a(((net.minecraft.nbt.NBTTagCompound)(life10_74)), ((com.mojang.authlib.GameProfile)(((net.minecraft.tileentity.TileEntitySkull)(life8_40)).a__GameProfile())));
    ((net.minecraft.nbt.NBTTagCompound)(((net.minecraft.item.ItemStack)(life9_50)).a__yw())).a(((java.lang.String)("SkullOwner")), ((net.minecraft.nbt.NBTBase)(life10_74)));
    }
    __sourceExactCall_db1d2fedabea60(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.item.ItemStack)(life9_50)));
    }
    super.c(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)));
    }
    return;
}


protected moom.fG a__fG() {
moom.fG forwardValue4744_50_0;
    moom.fG spill4744_0;
    long life1_3;
    int[] life3_5;
    forward_join_50: {
    forward_join_48: {
    life1_3 = (net.minecraft.block.BlockSkull.X ^ 123817776040096L);
    life3_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill4744_0 = this.U;
    if (!((life3_5 != null))) {
        forwardValue4744_50_0 = spill4744_0;
        break forward_join_50;
    }
    if (!((spill4744_0 == null))) {
        break forward_join_48;
    }
    this.U = ((moom.fG)(((moom.fJ)(((moom.fJ)(((moom.fJ)(((moom.fJ)(moom.fJ.a__fJ())).a(((java.lang.String[])(new java.lang.String[] {"   ", "###", "~#~"}))))).a(((char)(__sourceIntrinsic_6aaeda081082_invokedynamic4744_5(28472, (7655044135192871397L ^ life1_3)))), ((com.google.common.base.Predicate)(moom.fD.a(((com.google.common.base.Predicate)(__sourceExactCall_5dae44cbe9469e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aW))))))))))).a(((char)(__sourceIntrinsic_6aaeda081082_invokedynamic4744_10(24907, (5456268875144155026L ^ life1_3)))), ((com.google.common.base.Predicate)(moom.fD.a(((com.google.common.base.Predicate)(__sourceExactCall_5dae44cbe9469e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a))))))))))).a()));
    }
    forwardValue4744_50_0 = this.U;
    }
    return forwardValue4744_50_0;
}


protected moom.fA a__fA() {
return new moom.fA(this, new net.minecraft.block.properties.IProperty[] {net.minecraft.block.BlockSkull.R, net.minecraft.block.BlockSkull.S});
}


public moom.CA a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
((net.minecraft.block.BlockSkull)(this)).a__Void(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(p1)));
    return super.a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)));
}


public net.minecraft.block.state.IBlockState a(net.minecraft.world.World p0, moom.DT p1, moom.bs p2, float p3, float p4, float p5, int p6, net.minecraft.entity.EntityLivingBase p7) {
return ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.BlockSkull)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockSkull.R)), ((java.lang.Comparable)(((net.minecraft.entity.EntityLivingBase)(p7)).b__bs()))))).a__fE(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockSkull.S)), ((java.lang.Comparable)(java.lang.Boolean.FALSE)));
}


public java.lang.String a__String() {
return net.minecraft.util.StatCollector.a(((java.lang.String)("tile.skull.skeleton.name")));
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a__Void(net.minecraft.world.IBlockAccess p0, moom.DT p1) {
long life3_3;
    int[] life5_5;
    forward_join_66: {
    forward_join_58: {
    forward_join_48: {
    forward_join_38: {
    forward_join_28: {
    forward_join_26: {
    forward_join_18: {
    life3_3 = (net.minecraft.block.BlockSkull.X ^ 10226364193486L);
    life5_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    if (!((life5_5 != null))) {
        break forward_join_26;
    }
    switch ((moom.fc.a)[((moom.bs)(((moom.bs)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(p1))))).a(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockSkull.R))))))).ordinal()]) {
case 1:
default:
{
        break forward_join_18;
    }
case 2:
{
        break forward_join_28;
    }
case 3:
{
        break forward_join_38;
    }
case 4:
{
        break forward_join_48;
    }
case 5:
{
        break forward_join_58;
    }
}
    }
    ((net.minecraft.block.BlockSkull)(this)).a(((float)(0x1.0p-2f)), ((float)(0x0.0p0f)), ((float)(0x1.0p-2f)), ((float)(0x1.8p-1f)), ((float)(0x1.0p-1f)), ((float)(0x1.8p-1f)));
    }
    if (!((life5_5 == null))) {
        break forward_join_66;
    }
    }
    ((net.minecraft.block.BlockSkull)(this)).a(((float)(0x1.0p-2f)), ((float)(0x1.0p-2f)), ((float)(0x1.0p-1f)), ((float)(0x1.8p-1f)), ((float)(0x1.8p-1f)), ((float)(0x1.0p0f)));
    if (!((life5_5 == null))) {
        break forward_join_66;
    }
    }
    ((net.minecraft.block.BlockSkull)(this)).a(((float)(0x1.0p-2f)), ((float)(0x1.0p-2f)), ((float)(0x0.0p0f)), ((float)(0x1.8p-1f)), ((float)(0x1.8p-1f)), ((float)(0x1.0p-1f)));
    if (!((life5_5 == null))) {
        break forward_join_66;
    }
    }
    ((net.minecraft.block.BlockSkull)(this)).a(((float)(0x1.0p-1f)), ((float)(0x1.0p-2f)), ((float)(0x1.0p-2f)), ((float)(0x1.0p0f)), ((float)(0x1.8p-1f)), ((float)(0x1.8p-1f)));
    if (!((life5_5 == null))) {
        break forward_join_66;
    }
    }
    ((net.minecraft.block.BlockSkull)(this)).a(((float)(0x0.0p0f)), ((float)(0x1.0p-2f)), ((float)(0x1.0p-2f)), ((float)(0x1.0p-1f)), ((float)(0x1.8p-1f)), ((float)(0x1.8p-1f)));
    }
    return;
}


public net.minecraft.item.Item a(net.minecraft.block.state.IBlockState p0, java.util.Random p1, int p2) {
return net.minecraft.init.Items.bM;
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.entity.player.EntityPlayer p3) {
long local5 = (net.minecraft.block.BlockSkull.X ^ 96913709013811L);
    int[] local7 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    if ((local7 != null)) {
        if ((((((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.entity.player.EntityPlayer)(p3)).b1)).d) ? 1 : 0) != 0)) {
        p2 = ((net.minecraft.block.state.IBlockState)(p2)).a__fE(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockSkull.S)), ((java.lang.Comparable)(java.lang.Boolean.TRUE)));
        ((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((int)(4)));
    }
        super.a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((net.minecraft.entity.player.EntityPlayer)(p3)));
    }
    return;
}


public net.minecraft.item.Item a__wQ(net.minecraft.world.World p0, moom.DT p1) {
return net.minecraft.init.Items.bM;
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, float p3, int p4) {
return;
}


public int a__Int(net.minecraft.world.World p0, moom.DT p1) {
int forwardValue4742_18_0;
    int forwardValue4742_23_0;
    int[] spill4742_0;
    int spill4742_1;
    long life3_3;
    net.minecraft.tileentity.TileEntity life6_8;
    int[] life5_9;
    forward_join_23: {
    forward_join_19: {
    forward_join_18: {
    life3_3 = (net.minecraft.block.BlockSkull.X ^ 48857737866557L);
    spill4742_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life6_8 = ((net.minecraft.world.World)(p0)).a__B9(((moom.DT)(p1)));
    life5_9 = spill4742_0;
    spill4742_1 = ((life6_8 instanceof net.minecraft.tileentity.TileEntitySkull) ? 1 : 0);
    if (!((life5_9 != null))) {
        forwardValue4742_18_0 = spill4742_1;
        break forward_join_18;
    }
    if (!((spill4742_1 != 0))) {
        break forward_join_19;
    }
    forwardValue4742_18_0 = ((net.minecraft.tileentity.TileEntitySkull)(((net.minecraft.tileentity.TileEntitySkull)(life6_8)))).a__sourceReturn_8abf5c6871();
    }
    forwardValue4742_23_0 = forwardValue4742_18_0;
    break forward_join_23;
    }
    forwardValue4742_23_0 = super.a__Int(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)));
    }
    return forwardValue4742_23_0;
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.tileentity.TileEntitySkull p2) {
int lexicalValue1470_15_0;
    int lexicalValue1470_15_1;
    net.minecraft.world.World lexicalValue1470_23_0;
    net.minecraft.entity.boss.EntityWither lexicalValue1470_140_0;
    double lexicalValue1470_140_1;
    double lexicalValue1470_140_2;
    double lexicalValue1470_140_3;
    net.minecraft.entity.boss.EntityWither lexicalValue1470_141_0;
    double lexicalValue1470_141_1;
    double lexicalValue1470_141_2;
    double lexicalValue1470_141_3;
    float lexicalValue1470_141_4;
    net.minecraft.entity.boss.EntityWither lexicalValue1470_151_0;
    net.minecraft.entity.boss.EntityWither lexicalValue1470_152_0;
    float lexicalValue1470_152_1;
    int spill1470_0;
    int spill1470_1;
    net.minecraft.world.World spill1470_2;
    net.minecraft.entity.boss.EntityWither spill1470_3;
    double spill1470_4;
    double spill1470_5;
    double spill1470_6;
    net.minecraft.entity.boss.EntityWither spill1470_7;
    long life4_3;
    int[] life6_5;
    moom.fG life7_42;
    moom.fH life8_47;
    int life9_51;
    moom.fD life10_60;
    int life10_92;
    moom.fD life11_102;
    moom.DT life9_128;
    net.minecraft.entity.boss.EntityWither life10_133;
    moom.DT life11_140;
    java.util.Iterator life12_193;
    net.minecraft.entity.player.EntityPlayer life13_200;
    int life12_216;
    int life13_272;
    moom.fD life14_282;
    lexical_join_262: {
    lexical_join_233: {
    lexical_join_231: {
    lexical_join_184: {
    lexical_join_180: {
    lexical_join_152: {
    lexical_join_151: {
    lexical_join_141: {
    lexical_join_140: {
    lexical_join_98: {
    lexical_join_64: {
    lexical_join_62: {
    lexical_join_23: {
    lexical_join_15: {
    life4_3 = (net.minecraft.block.BlockSkull.X ^ 68421962730446L);
    life6_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill1470_0 = ((net.minecraft.tileentity.TileEntitySkull)(p2)).a__sourceReturn_8abf5c6871();
    spill1470_1 = 1;
    if (!((life6_5 != null))) {
        lexicalValue1470_15_0 = spill1470_0;
        lexicalValue1470_15_1 = spill1470_1;
        break lexical_join_15;
    }
    if (!((spill1470_0 == spill1470_1))) {
        break lexical_join_262;
    }
    lexicalValue1470_15_0 = ((moom.DT)(p1)).b();
    lexicalValue1470_15_1 = 2;
    }
    if (!((lexicalValue1470_15_0 >= lexicalValue1470_15_1))) {
        break lexical_join_262;
    }
    spill1470_2 = p0;
    if (!((life6_5 != null))) {
        lexicalValue1470_23_0 = spill1470_2;
        break lexical_join_23;
    }
    if (!((((net.minecraft.world.World)(spill1470_2)).a__bB() != net.minecraft.world.EnumDifficulty.PEACEFUL))) {
        break lexical_join_262;
    }
    lexicalValue1470_23_0 = p0;
    }
    if (!((!((net.minecraft.world.World)(lexicalValue1470_23_0)).G))) {
        break lexical_join_262;
    }
    life7_42 = ((net.minecraft.block.BlockSkull)(this)).b__sourceReturn_6e102d3166();
    life8_47 = ((moom.fG)(life7_42)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)));
    if (!((life8_47 != null))) {
        break lexical_join_262;
    }
    life9_51 = 0;
    lexical_cycle_37: while (true) {
    if (!((life9_51 < 3))) {
        break lexical_join_62;
    }
    life10_60 = ((moom.fH)(life8_47)).a(((int)(life9_51)), ((int)(0)), ((int)(0)));
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(((moom.fD)(life10_60)).a__DT())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((moom.fD)(life10_60)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockSkull.S)), ((java.lang.Comparable)(java.lang.Boolean.TRUE))))), ((int)(2)));
    life9_51 += 1;
    if (!((life6_5 != null))) {
        break lexical_join_64;
    }
    if (!((life6_5 == null))) { continue lexical_cycle_37; }
    break lexical_cycle_37;
    }
    }
    life9_51 = 0;
    }
    lexical_cycle_64: while (true) {
    lexical_join_96: {
    lexical_join_95: {
    if (!((life9_51 < ((moom.fG)(life7_42)).b()))) {
        break lexical_join_98;
    }
    if (!((life6_5 != null))) {
        break lexical_join_262;
    }
    life10_92 = 0;
    lexical_cycle_72: while (true) {
    if (!((life10_92 < ((moom.fG)(life7_42)).a()))) {
        break lexical_join_95;
    }
    life11_102 = ((moom.fH)(life8_47)).a(((int)(life9_51)), ((int)(life10_92)), ((int)(0)));
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(((moom.fD)(life11_102)).a__DT())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((int)(2)));
    life10_92 += 1;
    if (!((life6_5 != null))) {
        break lexical_join_96;
    }
    if (!((life6_5 == null))) { continue lexical_cycle_72; }
    break lexical_cycle_72;
    }
    }
    life9_51 += 1;
    }
    if (!((life6_5 == null))) { continue lexical_cycle_64; }
    break lexical_cycle_64;
    }
    }
    life9_128 = ((moom.fD)(((moom.fH)(life8_47)).a(((int)(1)), ((int)(0)), ((int)(0))))).a__DT();
    life10_133 = new net.minecraft.entity.boss.EntityWither(p0);
    life11_140 = ((moom.fD)(((moom.fH)(life8_47)).a(((int)(1)), ((int)(2)), ((int)(0))))).a__DT();
    spill1470_3 = life10_133;
    spill1470_4 = (((double) ((moom.DT)(life11_140)).a()) + 0x1.0p-1d);
    spill1470_5 = (((double) ((moom.DT)(life11_140)).b()) + 0x1.199999999999ap-1d);
    spill1470_6 = (((double) ((moom.DT)(life11_140)).c()) + 0x1.0p-1d);
    if (!((((moom.bs)(((moom.fH)(life8_47)).a__bs())).a__bt() == net.minecraft.util.EnumFacing$Axis.X))) {
        lexicalValue1470_140_0 = spill1470_3;
        lexicalValue1470_140_1 = spill1470_4;
        lexicalValue1470_140_2 = spill1470_5;
        lexicalValue1470_140_3 = spill1470_6;
        break lexical_join_140;
    }
    lexicalValue1470_141_0 = spill1470_3;
    lexicalValue1470_141_1 = spill1470_4;
    lexicalValue1470_141_2 = spill1470_5;
    lexicalValue1470_141_3 = spill1470_6;
    lexicalValue1470_141_4 = 0x0.0p0f;
    break lexical_join_141;
    }
    lexicalValue1470_141_0 = lexicalValue1470_140_0;
    lexicalValue1470_141_1 = lexicalValue1470_140_1;
    lexicalValue1470_141_2 = lexicalValue1470_140_2;
    lexicalValue1470_141_3 = lexicalValue1470_140_3;
    lexicalValue1470_141_4 = 0x1.68p6f;
    }
    ((net.minecraft.entity.boss.EntityWither)(lexicalValue1470_141_0)).c(((double)(lexicalValue1470_141_1)), ((double)(lexicalValue1470_141_2)), ((double)(lexicalValue1470_141_3)), ((float)(lexicalValue1470_141_4)), ((float)(0x0.0p0f)));
    spill1470_7 = life10_133;
    if (!((((moom.bs)(((moom.fH)(life8_47)).a__bs())).a__bt() == net.minecraft.util.EnumFacing$Axis.X))) {
        lexicalValue1470_151_0 = spill1470_7;
        break lexical_join_151;
    }
    lexicalValue1470_152_0 = spill1470_7;
    lexicalValue1470_152_1 = 0x0.0p0f;
    break lexical_join_152;
    }
    lexicalValue1470_152_0 = lexicalValue1470_151_0;
    lexicalValue1470_152_1 = 0x1.68p6f;
    }
    ((net.minecraft.entity.boss.EntityWither)(lexicalValue1470_152_0)).a2 = ((float)(lexicalValue1470_152_1));
    ((net.minecraft.entity.boss.EntityWither)(life10_133)).X__sourceReturn_da8c82d5d4();
    life12_193 = ((java.util.List)(((net.minecraft.world.World)(p0)).a(((java.lang.Class)(net.minecraft.entity.player.EntityPlayer.class)), ((moom.CA)(((moom.CA)(((net.minecraft.entity.boss.EntityWither)(life10_133)).b())).b(((double)(0x1.9p5d)), ((double)(0x1.9p5d)), ((double)(0x1.9p5d)))))))).iterator();
    lexical_cycle_166: while (true) {
    if (!(((java.util.Iterator)(life12_193)).hasNext())) {
        break lexical_join_180;
    }
    life13_200 = ((net.minecraft.entity.player.EntityPlayer)(((java.util.Iterator)(life12_193)).next()));
    ((net.minecraft.entity.player.EntityPlayer)(life13_200)).a(((moom.BY)(net.minecraft.stats.AchievementList.I)));
    if (!((life6_5 != null))) {
        break lexical_join_184;
    }
    if (!((life6_5 == null))) { continue lexical_cycle_166; }
    break lexical_cycle_166;
    }
    }
    ((net.minecraft.world.World)(p0)).b__Boolean(((net.minecraft.entity.Entity)(life10_133)));
    }
    life12_216 = 0;
    lexical_cycle_186: while (true) {
    if (!((life12_216 < __sourceIntrinsic_9a9e3db506cf_invokedynamic1470_50(24229, (6064437956316607256L ^ life4_3))))) {
        break lexical_join_231;
    }
    ((net.minecraft.world.World)(p0)).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.SNOWBALL)), ((double)((((double) ((moom.DT)(life9_128)).a()) + ((java.util.Random)(((net.minecraft.world.World)(p0)).u)).nextDouble()))), ((double)((((double) (((moom.DT)(life9_128)).b() - 2)) + (((java.util.Random)(((net.minecraft.world.World)(p0)).u)).nextDouble() * 0x1.f333333333333p1d)))), ((double)((((double) ((moom.DT)(life9_128)).c()) + ((java.util.Random)(((net.minecraft.world.World)(p0)).u)).nextDouble()))), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((int[])(new int[0])));
    life12_216 += 1;
    if (!((life6_5 != null))) {
        break lexical_join_233;
    }
    if (!((life6_5 == null))) { continue lexical_cycle_186; }
    break lexical_cycle_186;
    }
    }
    life12_216 = 0;
    }
    lexical_cycle_233: while (true) {
    lexical_join_260: {
    lexical_join_259: {
    if (!((life12_216 < ((moom.fG)(life7_42)).b()))) {
        break lexical_join_262;
    }
    life13_272 = 0;
    lexical_cycle_239: while (true) {
    if (!((life13_272 < ((moom.fG)(life7_42)).a()))) {
        break lexical_join_259;
    }
    life14_282 = ((moom.fH)(life8_47)).a(((int)(life12_216)), ((int)(life13_272)), ((int)(0)));
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(((moom.fD)(life14_282)).a__DT())), ((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)));
    life13_272 += 1;
    if (!((life6_5 != null))) {
        break lexical_join_260;
    }
    if (!((life6_5 == null))) { continue lexical_cycle_239; }
    break lexical_cycle_239;
    }
    }
    life12_216 += 1;
    }
    if (!((life6_5 == null))) { continue lexical_cycle_233; }
    break lexical_cycle_233;
    }
    }
    return;
}


public net.minecraft.tileentity.TileEntity a(net.minecraft.world.World p0, int p1) {
return new net.minecraft.tileentity.TileEntitySkull();
}


public boolean a__sourceReturn_fab76ee80a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.item.ItemStack p2) {
int forwardValue4740_15_0;
    int forwardValue4740_15_1;
    net.minecraft.world.World forwardValue4740_23_0;
    int forwardValue4740_34_0;
    int spill4740_0;
    int spill4740_1;
    net.minecraft.world.World spill4740_2;
    long life4_3;
    int[] life6_5;
    forward_join_34: {
    forward_join_33: {
    forward_join_23: {
    forward_join_15: {
    life4_3 = (net.minecraft.block.BlockSkull.X ^ 11366046117707L);
    life6_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill4740_0 = ((net.minecraft.item.ItemStack)(p2)).c();
    spill4740_1 = 1;
    if (!((life6_5 != null))) {
        forwardValue4740_15_0 = spill4740_0;
        forwardValue4740_15_1 = spill4740_1;
        break forward_join_15;
    }
    if (!((spill4740_0 == spill4740_1))) {
        break forward_join_33;
    }
    forwardValue4740_15_0 = ((moom.DT)(p1)).b();
    forwardValue4740_15_1 = 2;
    }
    if (!((forwardValue4740_15_0 >= forwardValue4740_15_1))) {
        break forward_join_33;
    }
    spill4740_2 = p0;
    if (!((life6_5 != null))) {
        forwardValue4740_23_0 = spill4740_2;
        break forward_join_23;
    }
    if (!((((net.minecraft.world.World)(spill4740_2)).a__bB() != net.minecraft.world.EnumDifficulty.PEACEFUL))) {
        break forward_join_33;
    }
    forwardValue4740_23_0 = p0;
    }
    if (!((!((net.minecraft.world.World)(forwardValue4740_23_0)).G))) {
        break forward_join_33;
    }
    if (!((((moom.fG)(((net.minecraft.block.BlockSkull)(this)).a__fG())).a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1))) != null))) {
        break forward_join_33;
    }
    forwardValue4740_34_0 = 1;
    break forward_join_34;
    }
    forwardValue4740_34_0 = 0;
    }
    return ((forwardValue4740_34_0) != 0);
}


public boolean g() {
return ((0) != 0);
}


public boolean j() {
return ((0) != 0);
}


private static boolean lambda$static$0(moom.fD p0) {
fD fD3;
        int[] nArray;
        block5: {
            IBlockState iBlockState;
            block4: {
                long l = net.minecraft.block.BlockSkull.X ^ 0x2AB7861901D1L;
                nArray = BlockPlanks$EnumType.b__ArrayInt();
                iBlockState = p0.a__fE();
                if (nArray == null) break block4;
                if (iBlockState == null) return 0 != 0;
                fD3 = p0;
                if (nArray == null) break block5;
                iBlockState = fD3.a__fE();
            }
            if (iBlockState.a__ch() != Blocks.bT) return 0 != 0;
            fD3 = p0;
        }
        int n = (fD3.a() instanceof TileEntitySkull ? 1 : 0);
        if (nArray != null) {
            if (n == 0) return 0 != 0;
            n = ((TileEntitySkull)p0.a()).a__sourceReturn_8abf5c6871();
        }
        if (nArray == null) return n != 0;
        if (n != 1) return 0 != 0;
        return 1 != 0;
}


private static native <E extends Throwable> com.google.common.base.Predicate __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1758_56() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9a9e3db506cf_invokedynamic1470_50(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6aaeda081082_invokedynamic4744_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6aaeda081082_invokedynamic4744_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c6887d250758_invokedynamic4745_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c6887d250758_invokedynamic4745_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c6887d250758_invokedynamic4745_13(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral10060_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8db5871551d4_invokedynamic4746_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_819466f05fee_invokedynamic4747_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_819466f05fee_invokedynamic4747_8(int a0, long a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native moom.bs __sourceExactCall_e942200b9dad46(int p0);
private static native moom.fI __sourceExactCall_5dae44cbe9469e(net.minecraft.block.Block p0);
private static native int __sourceExactCall_67b3e10f0f71a7(int p0, long p1);
private static native void __sourceExactCall_db1d2fedabea60(net.minecraft.world.World p0, moom.DT p1, net.minecraft.item.ItemStack p2);
}
