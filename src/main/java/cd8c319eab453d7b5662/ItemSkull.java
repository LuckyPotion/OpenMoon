package net.minecraft.item;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class ItemSkull extends net.minecraft.item.Item {

private static final java.lang.String[] n;

private static final long o;

private static final long[] p;

private static final java.lang.Integer[] q;

private static final java.util.Map r;

public ItemSkull() {
super();
    (this).a(net.minecraft.creativetab.CreativeTabs.c);
    (this).c(0);
    (this).a(true);
}


static {
o = ((long)(((moom._a)(moom._c.a(((long)(-8021165919442286835L)), ((long)(5435793391246282416L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(221682166992694L)))));
    r = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (net.minecraft.item.ItemSkull.o ^ 105787878042999L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1902_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1902_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1902_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1902_14 = new byte[8];
    (__sourceSpill1902_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1902_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1902_16 = __sourceSpill1902_14;
    ((javax.crypto.Cipher)(__sourceSpill1902_11)).init(((int)(__sourceSpill1902_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1902_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1902_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[5];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "\\([ô¶È>3=\001[9.\"n§ýÂÊ"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1902_25 = local6_life21;
        int __sourceSpill1902_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1902_25)).substring(((int)(__sourceSpill1902_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1902_30 = local8_life19;
        int __sourceSpill1902_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1902_33 = new byte[8];
        (__sourceSpill1902_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1902_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1902_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1902_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1902_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1902_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1902_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1902_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1902_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1902_34)).doFinal(((byte[])(__sourceSpill1902_33)));
        (__sourceSpill1902_30)[__sourceSpill1902_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "8g\002`ù7\0028Ú\033T\001n\\"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1902_38 = local6_life21;
        int __sourceSpill1902_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1902_38)).substring(((int)(__sourceSpill1902_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1902_43 = local8_life19;
        int __sourceSpill1902_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1902_46 = new byte[8];
        (__sourceSpill1902_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1902_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1902_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1902_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1902_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1902_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1902_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1902_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1902_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1902_47)).doFinal(((byte[])(__sourceSpill1902_46)));
        (__sourceSpill1902_43)[__sourceSpill1902_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    p = ((long[])(local8_life19));
    q = ((java.lang.Integer[])(new java.lang.Integer[5]));
    java.lang.String[] __sourceSpill1902_52 = new java.lang.String[5];
    (__sourceSpill1902_52)[0] = "skeleton";
    (__sourceSpill1902_52)[1] = "wither";
    (__sourceSpill1902_52)[2] = "zombie";
    (__sourceSpill1902_52)[3] = "char";
    (__sourceSpill1902_52)[4] = "creeper";
    n = ((java.lang.String[])(__sourceSpill1902_52));
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral11930_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/xN"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 16503;
      if (q[var3] == null) {
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
         long var5 = p[var3];
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
         Object[] var9 = (Object[])r.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               r.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/xN", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         q[var3] = var15;
      }

      return q[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.item.ItemSkull.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public java.lang.String b__String(net.minecraft.item.ItemStack p0) {
int forwardValue5491_20_0;
    boolean spill5491_0;
    int spill5491_1;
    int spill5491_2;
    long life2_3;
    int life5_7;
    int life4_8;
    forward_join_21: {
    forward_join_20: {
    forward_join_19: {
    life2_3 = (net.minecraft.item.ItemSkull.o ^ 98905951760550L);
    spill5491_0 = net.minecraft.item.ItemStack.l();
    life5_7 = ((net.minecraft.item.ItemStack)(p0)).c();
    life4_8 = ((spill5491_0) ? 1 : 0);
    spill5491_1 = life5_7;
    if (!((life4_8 == 0))) {
        forwardValue5491_20_0 = spill5491_1;
        break forward_join_20;
    }
    if (!((spill5491_1 >= 0))) {
        break forward_join_19;
    }
    spill5491_2 = life5_7;
    if (!((life4_8 == 0))) {
        forwardValue5491_20_0 = spill5491_2;
        break forward_join_20;
    }
    if (!((spill5491_2 >= (net.minecraft.item.ItemSkull.n).length))) {
        break forward_join_21;
    }
    }
    forwardValue5491_20_0 = 0;
    }
    life5_7 = forwardValue5491_20_0;
    }
    return __sourceIntrinsic_33df8f166dd6_invokedynamic5491_7(super.a__String(), (net.minecraft.item.ItemSkull.n)[life5_7]);
}


public java.lang.String d(net.minecraft.item.ItemStack p0) {
int forwardValue5492_14_0;
    int forwardValue5492_26_0;
    int forwardValue5492_52_0;
    net.minecraft.nbt.NBTTagCompound forwardValue5492_56_0;
    java.lang.String forwardValue5492_56_1;
    int spill5492_0;
    net.minecraft.nbt.NBTTagCompound spill5492_1;
    java.lang.String spill5492_2;
    long life2_3;
    int life4_5;
    net.minecraft.nbt.NBTTagCompound life5_80;
    forward_join_78: {
    forward_join_56: {
    forward_join_52: {
    forward_join_41: {
    forward_join_26: {
    forward_join_14: {
    life2_3 = (net.minecraft.item.ItemSkull.o ^ 137088680083711L);
    life4_5 = ((net.minecraft.item.ItemStack.m()) ? 1 : 0);
    spill5492_0 = ((net.minecraft.item.ItemStack)(p0)).c();
    if (!((life4_5 != 0))) {
        forwardValue5492_14_0 = spill5492_0;
        break forward_join_14;
    }
    if (!((spill5492_0 == 3))) {
        break forward_join_78;
    }
    forwardValue5492_14_0 = ((((net.minecraft.item.ItemStack)(p0)).e__Boolean()) ? 1 : 0);
    }
    if (!((life4_5 != 0))) {
        forwardValue5492_26_0 = forwardValue5492_14_0;
        break forward_join_26;
    }
    if (!((forwardValue5492_14_0 != 0))) {
        break forward_join_78;
    }
    forwardValue5492_26_0 = ((((net.minecraft.nbt.NBTTagCompound)(((net.minecraft.item.ItemStack)(p0)).a__yw())).a__Boolean(((java.lang.String)("SkullOwner")), ((int)(__sourceIntrinsic_480a975002ff_invokedynamic5492_7(25403, (8114210740318263900L ^ life2_3)))))) ? 1 : 0);
    }
    if (!((life4_5 != 0))) {
        forwardValue5492_52_0 = forwardValue5492_26_0;
        break forward_join_52;
    }
    if (!((forwardValue5492_26_0 != 0))) {
        break forward_join_41;
    }
    return net.minecraft.util.StatCollector.a(((java.lang.String)("item.skull.player.name")), ((java.lang.Object[])(new java.lang.Object[] {((net.minecraft.nbt.NBTTagCompound)(((net.minecraft.item.ItemStack)(p0)).a__yw())).a__String(((java.lang.String)("SkullOwner")))})));
    }
    spill5492_1 = ((net.minecraft.item.ItemStack)(p0)).a__yw();
    spill5492_2 = "SkullOwner";
    if (!((life4_5 != 0))) {
        forwardValue5492_56_0 = spill5492_1;
        forwardValue5492_56_1 = spill5492_2;
        break forward_join_56;
    }
    forwardValue5492_52_0 = ((((net.minecraft.nbt.NBTTagCompound)(spill5492_1)).a__Boolean(((java.lang.String)(spill5492_2)), ((int)(__sourceIntrinsic_480a975002ff_invokedynamic5492_14(20418, (7176768820419098279L ^ life2_3)))))) ? 1 : 0);
    }
    if (!((forwardValue5492_52_0 != 0))) {
        break forward_join_78;
    }
    forwardValue5492_56_0 = ((net.minecraft.item.ItemStack)(p0)).a__yw();
    forwardValue5492_56_1 = "SkullOwner";
    }
    life5_80 = ((net.minecraft.nbt.NBTTagCompound)(forwardValue5492_56_0)).a__yw(((java.lang.String)(forwardValue5492_56_1)));
    if (!(((net.minecraft.nbt.NBTTagCompound)(life5_80)).a__Boolean(((java.lang.String)("Name")), ((int)(__sourceIntrinsic_480a975002ff_invokedynamic5492_19(25403, (8114210740318263900L ^ life2_3))))))) {
        break forward_join_78;
    }
    return net.minecraft.util.StatCollector.a(((java.lang.String)("item.skull.player.name")), ((java.lang.Object[])(new java.lang.Object[] {((net.minecraft.nbt.NBTTagCompound)(life5_80)).a__String(((java.lang.String)("Name")))})));
    }
    return super.d(((net.minecraft.item.ItemStack)(p0)));
}


public boolean a(net.minecraft.item.ItemStack p0, net.minecraft.entity.player.EntityPlayer p1, net.minecraft.world.World p2, moom.DT p3, moom.bs p4, float p5, float p6, float p7) {
int forwardValue5489_37_0;
    int forwardValue5489_47_0;
    int forwardValue5489_56_0;
    int forwardValue5489_63_0;
    net.minecraft.tileentity.TileEntity forwardValue5489_108_0;
    net.minecraft.item.ItemStack forwardValue5489_122_0;
    int forwardValue5489_149_0;
    int forwardValue5489_156_0;
    int forwardValue5489_189_0;
    int spill5489_0;
    boolean spill5489_1;
    net.minecraft.tileentity.TileEntity spill5489_2;
    net.minecraft.item.ItemStack spill5489_3;
    boolean spill5489_4;
    long life9_3;
    int life11_5;
    net.minecraft.block.state.IBlockState life12_16;
    net.minecraft.block.Block life13_19;
    int life14_24;
    int life15_101;
    net.minecraft.tileentity.TileEntity life16_125;
    net.minecraft.tileentity.TileEntitySkull life17_139;
    com.mojang.authlib.GameProfile life18_145;
    net.minecraft.nbt.NBTTagCompound life19_159;
    forward_join_189: {
    forward_join_188: {
    forward_join_182: {
    forward_join_174: {
    forward_join_170: {
    forward_join_165: {
    forward_join_156: {
    forward_join_149: {
    forward_join_141: {
    forward_join_122: {
    forward_join_108: {
    forward_join_98: {
    forward_join_63: {
    forward_join_61: {
    forward_join_56: {
    forward_join_52: {
    forward_join_47: {
    forward_join_42: {
    forward_join_38: {
    forward_join_37: {
    forward_join_11: {
    life9_3 = (net.minecraft.item.ItemSkull.o ^ 23334722718089L);
    life11_5 = ((net.minecraft.item.ItemStack.m()) ? 1 : 0);
    if (!((p4 == moom.bs.DOWN))) {
        break forward_join_11;
    }
    return ((0) != 0);
    }
    life12_16 = ((net.minecraft.world.World)(p2)).a__fE(((moom.DT)(p3)));
    life13_19 = ((net.minecraft.block.state.IBlockState)(life12_16)).a__ch();
    life14_24 = ((((net.minecraft.block.Block)(life13_19)).a__Boolean(((net.minecraft.world.World)(p2)), ((moom.DT)(p3)))) ? 1 : 0);
    spill5489_0 = life14_24;
    if (!((life11_5 != 0))) {
        forwardValue5489_47_0 = spill5489_0;
        break forward_join_47;
    }
    if (!((spill5489_0 == 0))) {
        break forward_join_42;
    }
    spill5489_1 = ((moom.fn)(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p2)).a__fE(((moom.DT)(p3))))).a__ch())).a__fn())).b__Boolean();
    if (!((life11_5 != 0))) {
        forwardValue5489_37_0 = ((spill5489_1) ? 1 : 0);
        break forward_join_37;
    }
    if (!((!spill5489_1))) {
        break forward_join_38;
    }
    forwardValue5489_37_0 = 0;
    }
    return ((forwardValue5489_37_0) != 0);
    }
    p3 = ((moom.DT)(p3)).a(((moom.bs)(p4)));
    }
    forwardValue5489_47_0 = ((((net.minecraft.entity.player.EntityPlayer)(p1)).a(((moom.DT)(p3)), ((moom.bs)(p4)), ((net.minecraft.item.ItemStack)(p0)))) ? 1 : 0);
    }
    if (!((life11_5 != 0))) {
        forwardValue5489_56_0 = forwardValue5489_47_0;
        break forward_join_56;
    }
    if (!((forwardValue5489_47_0 == 0))) {
        break forward_join_52;
    }
    return ((0) != 0);
    }
    forwardValue5489_56_0 = ((((net.minecraft.block.BlockSkull)(net.minecraft.init.Blocks.bT)).b__Boolean(((net.minecraft.world.World)(p2)), ((moom.DT)(p3)))) ? 1 : 0);
    }
    if (!((life11_5 != 0))) {
        forwardValue5489_63_0 = forwardValue5489_56_0;
        break forward_join_63;
    }
    if (!((forwardValue5489_56_0 == 0))) {
        break forward_join_61;
    }
    return ((0) != 0);
    }
    forwardValue5489_63_0 = ((((net.minecraft.world.World)(p2)).G) ? 1 : 0);
    }
    if (!((life11_5 != 0))) {
        forwardValue5489_189_0 = forwardValue5489_63_0;
        break forward_join_189;
    }
    if (!((forwardValue5489_63_0 == 0))) {
        break forward_join_188;
    }
    ((net.minecraft.world.World)(p2)).a(((moom.DT)(p3)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.BlockSkull)(net.minecraft.init.Blocks.bT)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockSkull.R)), ((java.lang.Comparable)(p4))))), ((int)(3)));
    life15_101 = 0;
    if (!((p4 == moom.bs.UP))) {
        break forward_join_98;
    }
    life15_101 = (moom.Dr.b__Int(((double)((((double) ((((net.minecraft.entity.player.EntityPlayer)(p1)).w * 0x1.0p4f) / 0x1.68p8f)) + 0x1.0p-1d)))) & __sourceIntrinsic_e8125218b12d_invokedynamic5489_33(31149, (8908073411692644795L ^ life9_3)));
    }
    life16_125 = ((net.minecraft.world.World)(p2)).a__B9(((moom.DT)(p3)));
    spill5489_2 = life16_125;
    if (!((life11_5 != 0))) {
        forwardValue5489_108_0 = spill5489_2;
        break forward_join_108;
    }
    if (!((((spill5489_2 instanceof net.minecraft.tileentity.TileEntitySkull) ? 1 : 0) != 0))) {
        break forward_join_182;
    }
    forwardValue5489_108_0 = life16_125;
    }
    life17_139 = ((net.minecraft.tileentity.TileEntitySkull)(forwardValue5489_108_0));
    if (!((((net.minecraft.item.ItemStack)(p0)).c() == 3))) {
        break forward_join_170;
    }
    life18_145 = null;
    spill5489_3 = p0;
    if (!((life11_5 != 0))) {
        forwardValue5489_122_0 = spill5489_3;
        break forward_join_122;
    }
    if (!(((net.minecraft.item.ItemStack)(spill5489_3)).e__Boolean())) {
        break forward_join_165;
    }
    forwardValue5489_122_0 = p0;
    }
    life19_159 = ((net.minecraft.item.ItemStack)(forwardValue5489_122_0)).a__yw();
    spill5489_4 = ((net.minecraft.nbt.NBTTagCompound)(life19_159)).a__Boolean(((java.lang.String)("SkullOwner")), ((int)(__sourceIntrinsic_e8125218b12d_invokedynamic5489_40(17864, (4816747601624626648L ^ life9_3)))));
    if (!((life11_5 != 0))) {
        forwardValue5489_149_0 = ((spill5489_4) ? 1 : 0);
        break forward_join_149;
    }
    if (!(spill5489_4)) {
        break forward_join_141;
    }
    life18_145 = moom.yD.a(((net.minecraft.nbt.NBTTagCompound)(((net.minecraft.nbt.NBTTagCompound)(life19_159)).a__yw(((java.lang.String)("SkullOwner"))))));
    break forward_join_165;
    }
    forwardValue5489_149_0 = ((((net.minecraft.nbt.NBTTagCompound)(life19_159)).a__Boolean(((java.lang.String)("SkullOwner")), ((int)(__sourceIntrinsic_e8125218b12d_invokedynamic5489_45(23460, (4766974167747029942L ^ life9_3)))))) ? 1 : 0);
    }
    if (!((life11_5 != 0))) {
        forwardValue5489_156_0 = forwardValue5489_149_0;
        break forward_join_156;
    }
    if (!((forwardValue5489_149_0 != 0))) {
        break forward_join_165;
    }
    forwardValue5489_156_0 = ((java.lang.String)(((net.minecraft.nbt.NBTTagCompound)(life19_159)).a__String(((java.lang.String)("SkullOwner"))))).length();
    }
    if (!((forwardValue5489_156_0 > 0))) {
        break forward_join_165;
    }
    life18_145 = new com.mojang.authlib.GameProfile(null, ((net.minecraft.nbt.NBTTagCompound)(life19_159)).a__String(((java.lang.String)("SkullOwner"))));
    }
    ((net.minecraft.tileentity.TileEntitySkull)(life17_139)).a__Void(((com.mojang.authlib.GameProfile)(life18_145)));
    if (!((life11_5 == 0))) {
        break forward_join_174;
    }
    }
    ((net.minecraft.tileentity.TileEntitySkull)(life17_139)).a(((int)(((net.minecraft.item.ItemStack)(p0)).c())));
    }
    ((net.minecraft.tileentity.TileEntitySkull)(life17_139)).c(((int)(life15_101)));
    ((net.minecraft.block.BlockSkull)(net.minecraft.init.Blocks.bT)).a(((net.minecraft.world.World)(p2)), ((moom.DT)(p3)), ((net.minecraft.tileentity.TileEntitySkull)(life17_139)));
    }
    net.minecraft.item.ItemStack __stackOp5489_57_0 = p0;
    ((net.minecraft.item.ItemStack)(__stackOp5489_57_0)).b = ((int)((((net.minecraft.item.ItemStack)(__stackOp5489_57_0)).b - 1)));
    }
    forwardValue5489_189_0 = 1;
    }
    return ((forwardValue5489_189_0) != 0);
}


public void a(net.minecraft.item.Item p0, net.minecraft.creativetab.CreativeTabs p1, java.util.List<net.minecraft.item.ItemStack> p2) {
boolean spill1631_0;
    long life4_3;
    int life7_6;
    int life6_7;
    lexical_join_24: {
    life4_3 = (net.minecraft.item.ItemSkull.o ^ 101905452571577L);
    spill1631_0 = net.minecraft.item.ItemStack.m();
    life7_6 = 0;
    life6_7 = ((spill1631_0) ? 1 : 0);
    lexical_cycle_8: while (true) {
    if (!((life7_6 < (net.minecraft.item.ItemSkull.n).length))) {
        break lexical_join_24;
    }
    ((java.util.List)(p2)).add(((java.lang.Object)(new net.minecraft.item.ItemStack(p0, 1, life7_6))));
    life7_6 += 1;
    if (!((life6_7 == 0))) { continue lexical_cycle_8; }
    break lexical_cycle_8;
    }
    }
    return;
}


public boolean a(net.minecraft.nbt.NBTTagCompound p0) {
int forwardValue5490_50_0;
    boolean spill5490_0;
    boolean spill5490_1;
    int spill5490_2;
    long life2_3;
    int life4_9;
    com.mojang.authlib.GameProfile life5_44;
    com.mojang.authlib.GameProfile life5_47;
    forward_join_50: {
    forward_join_49: {
    life2_3 = (net.minecraft.item.ItemSkull.o ^ 44727117038232L);
    spill5490_0 = net.minecraft.item.ItemStack.m();
    super.a(((net.minecraft.nbt.NBTTagCompound)(p0)));
    life4_9 = ((spill5490_0) ? 1 : 0);
    spill5490_1 = ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Boolean(((java.lang.String)("SkullOwner")), ((int)(__sourceIntrinsic_9cf14f2b9b73_invokedynamic5490_4(25403, (8114118387303209019L ^ life2_3)))));
    if (!((life4_9 != 0))) {
        forwardValue5490_50_0 = ((spill5490_1) ? 1 : 0);
        break forward_join_50;
    }
    if (!(spill5490_1)) {
        break forward_join_49;
    }
    spill5490_2 = ((java.lang.String)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__String(((java.lang.String)("SkullOwner"))))).length();
    if (!((life4_9 != 0))) {
        forwardValue5490_50_0 = spill5490_2;
        break forward_join_50;
    }
    if (!((spill5490_2 > 0))) {
        break forward_join_49;
    }
    life5_44 = new com.mojang.authlib.GameProfile(null, ((net.minecraft.nbt.NBTTagCompound)(p0)).a__String(((java.lang.String)("SkullOwner"))));
    life5_47 = net.minecraft.tileentity.TileEntitySkull.a(((com.mojang.authlib.GameProfile)(life5_44)));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("SkullOwner")), ((net.minecraft.nbt.NBTBase)(moom.yD.a(((net.minecraft.nbt.NBTTagCompound)(new net.minecraft.nbt.NBTTagCompound())), ((com.mojang.authlib.GameProfile)(life5_47))))));
    return ((1) != 0);
    }
    forwardValue5490_50_0 = 0;
    }
    return ((forwardValue5490_50_0) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public int a(int p0) {
return p0;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral11930_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_33df8f166dd6_invokedynamic5491_7(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_480a975002ff_invokedynamic5492_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_480a975002ff_invokedynamic5492_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_480a975002ff_invokedynamic5492_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e8125218b12d_invokedynamic5489_33(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e8125218b12d_invokedynamic5489_40(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e8125218b12d_invokedynamic5489_45(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9cf14f2b9b73_invokedynamic5490_4(int a0, long a1) throws E;
}
