package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class on {

public static moom.on a;

private final net.minecraft.tileentity.TileEntityChest b;

private final net.minecraft.tileentity.TileEntityChest c;

private final moom.Cg d;

private final moom.Ca e;

private final net.minecraft.tileentity.TileEntitySkull f;

private static final long g;

private static final long[] h;

private static final java.lang.Integer[] i;

private static final java.util.Map j;

public on() {
super();
    this.b = new net.minecraft.tileentity.TileEntityChest(0);
    this.c = new net.minecraft.tileentity.TileEntityChest(1);
    this.d = new moom.Cg();
    this.e = new moom.Ca();
    this.f = new net.minecraft.tileentity.TileEntitySkull();
}


static {
g = ((long)(((moom._a)(moom._c.a(((long)(-2162814945021014091L)), ((long)(8424916455597202441L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(219298306675527L)))));
    j = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.on.g ^ 51898495254738L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill955_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill955_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill955_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill955_14 = new byte[8];
    (__sourceSpill955_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill955_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation955_16 = __sourceSpill955_14;
    ((javax.crypto.Cipher)(__sourceSpill955_11)).init(((int)(__sourceSpill955_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill955_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation955_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "­E>ãôj^¼p¬Å^"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill955_25 = local6_life21;
        int __sourceSpill955_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill955_25)).substring(((int)(__sourceSpill955_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill955_30 = local8_life19;
        int __sourceSpill955_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill955_33 = new byte[8];
        (__sourceSpill955_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill955_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill955_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill955_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill955_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill955_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill955_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill955_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill955_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill955_34)).doFinal(((byte[])(__sourceSpill955_33)));
        (__sourceSpill955_30)[__sourceSpill955_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    h = ((long[])(local8_life19));
    i = ((java.lang.Integer[])(new java.lang.Integer[2]));
    a = ((moom.on)(new moom.on()));
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral8602_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/on"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.on.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 1388;
      if (i[var3] == null) {
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
         long var5 = h[var3];
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
         Object[] var9 = (Object[])j.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               j.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/on", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         i[var3] = var15;
      }

      return i[var3];
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(net.minecraft.item.ItemStack p0) {
long life2_3;
    com.mojang.authlib.GameProfile life4_26;
    net.minecraft.nbt.NBTTagCompound life5_32;
    com.mojang.authlib.GameProfile life4_70;
    net.minecraft.block.Block life4_115;
    forest_join_146: {
    forest_join_138: {
    forest_join_126: {
    forest_join_110: {
    forest_join_109: {
    forest_join_84: {
    forest_join_48: {
    forest_join_21: {
    life2_3 = (moom.on.g ^ 30847565106691L);
    if (!((((net.minecraft.item.ItemStack)(p0)).a__wQ() == net.minecraft.init.Items.ci))) {
        break forest_join_21;
    }
    ((moom.Ca)(this.e)).a__Void(((net.minecraft.item.ItemStack)(p0)));
    ((moom.oo)(moom.oo.b)).a(((net.minecraft.tileentity.TileEntity)(this.e)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((float)(0x0.0p0f)));
    break forest_join_146;
    }
    if (!((((net.minecraft.item.ItemStack)(p0)).a__wQ() == net.minecraft.init.Items.bM))) {
        break forest_join_110;
    }
    life4_26 = null;
    if (!(((net.minecraft.item.ItemStack)(p0)).e__Boolean())) {
        break forest_join_84;
    }
    life5_32 = ((net.minecraft.item.ItemStack)(p0)).a__yw();
    if (!(((net.minecraft.nbt.NBTTagCompound)(life5_32)).a__Boolean(((java.lang.String)("SkullOwner")), ((int)(__sourceIntrinsic_5f56e65a234d_invokedynamic912_12(28394, (5196690688282770025L ^ life2_3))))))) {
        break forest_join_48;
    }
    life4_26 = moom.yD.a(((net.minecraft.nbt.NBTTagCompound)(((net.minecraft.nbt.NBTTagCompound)(life5_32)).a__yw(((java.lang.String)("SkullOwner"))))));
    break forest_join_84;
    }
    if (!(((net.minecraft.nbt.NBTTagCompound)(life5_32)).a__Boolean(((java.lang.String)("SkullOwner")), ((int)(__sourceIntrinsic_5f56e65a234d_invokedynamic912_16(352, (2131186941479245282L ^ life2_3))))))) {
        break forest_join_84;
    }
    if (!((((java.lang.String)(((net.minecraft.nbt.NBTTagCompound)(life5_32)).a__String(((java.lang.String)("SkullOwner"))))).length() > 0))) {
        break forest_join_84;
    }
    life4_70 = new com.mojang.authlib.GameProfile(null, ((net.minecraft.nbt.NBTTagCompound)(life5_32)).a__String(((java.lang.String)("SkullOwner"))));
    life4_26 = net.minecraft.tileentity.TileEntitySkull.a(((com.mojang.authlib.GameProfile)(life4_70)));
    ((net.minecraft.nbt.NBTTagCompound)(life5_32)).a__Void(((java.lang.String)("SkullOwner")));
    ((net.minecraft.nbt.NBTTagCompound)(life5_32)).a(((java.lang.String)("SkullOwner")), ((net.minecraft.nbt.NBTBase)(moom.yD.a(((net.minecraft.nbt.NBTTagCompound)(new net.minecraft.nbt.NBTTagCompound())), ((com.mojang.authlib.GameProfile)(life4_26))))));
    }
    if (!((moom.oA.j != null))) {
        break forest_join_109;
    }
    moom.kZ.B();
    moom.kZ.b(((float)(-0x1.0p-1f)), ((float)(0x0.0p0f)), ((float)(-0x1.0p-1f)));
    moom.kZ.a(((float)(0x1.0p1f)), ((float)(0x1.0p1f)), ((float)(0x1.0p1f)));
    moom.kZ.p();
    ((moom.oA)(moom.oA.j)).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((moom.bs)(moom.bs.UP)), ((float)(0x0.0p0f)), ((int)(((net.minecraft.item.ItemStack)(p0)).c())), ((com.mojang.authlib.GameProfile)(life4_26)), ((int)(-1)));
    moom.kZ.o();
    moom.kZ.C();
    }
    break forest_join_146;
    }
    life4_115 = net.minecraft.block.Block.a(((net.minecraft.item.Item)(((net.minecraft.item.ItemStack)(p0)).a__wQ())));
    if (!((life4_115 == net.minecraft.init.Blocks.bF))) {
        break forest_join_126;
    }
    ((moom.oo)(moom.oo.b)).a(((net.minecraft.tileentity.TileEntity)(this.d)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((float)(0x0.0p0f)));
    break forest_join_146;
    }
    if (!((life4_115 == net.minecraft.init.Blocks.bV))) {
        break forest_join_138;
    }
    ((moom.oo)(moom.oo.b)).a(((net.minecraft.tileentity.TileEntity)(this.c)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((float)(0x0.0p0f)));
    break forest_join_146;
    }
    ((moom.oo)(moom.oo.b)).a(((net.minecraft.tileentity.TileEntity)(this.b)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((float)(0x0.0p0f)));
    }
    return;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral8602_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5f56e65a234d_invokedynamic912_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5f56e65a234d_invokedynamic912_16(int a0, long a1) throws E;
}
