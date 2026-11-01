package net.minecraft.entity.item;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class EntityFallingBlock extends net.minecraft.entity.Entity {

private net.minecraft.block.state.IBlockState aE;

public int aF;

public boolean aG;

private boolean aH;

private boolean aI;

private int aJ;

private float aK;

public net.minecraft.nbt.NBTTagCompound aL;

private static long bb;

private static long[] cb;

private static java.lang.Integer[] db;

private static java.util.Map eb;

public EntityFallingBlock(net.minecraft.world.World p0) { super((net.minecraft.world.World)null); }


private static void __sourceConstructorBody_997754b33a7a0fe0(net.minecraft.entity.item.EntityFallingBlock receiver, net.minecraft.world.World p0) throws Throwable {

long local2 = (net.minecraft.entity.item.EntityFallingBlock.bb ^ 40871650364084L);

    net.minecraft.entity.item.EntityFallingBlock.__sourceConstructorInit_997754b33a7a0fe0_0(((net.minecraft.entity.item.EntityFallingBlock)(receiver)), ((net.minecraft.world.World)(p0)));

    ((net.minecraft.entity.item.EntityFallingBlock)(receiver)).aG = ((boolean)(true));

    ((net.minecraft.entity.item.EntityFallingBlock)(receiver)).aJ = ((int)(__sourceIntrinsic_997754b33a7a0fe0_originalDynamicSite3839_3(814, (2056633631475712220L ^ local2))));

    ((net.minecraft.entity.item.EntityFallingBlock)(receiver)).aK = ((float)(0x1.0p1f));

    return;

}



public EntityFallingBlock(net.minecraft.world.World p0, double p1, double p2, double p3, net.minecraft.block.state.IBlockState p4) { super((net.minecraft.world.World)null); }


private static void __sourceConstructorBody_4691b4df56eef1e9(net.minecraft.entity.item.EntityFallingBlock receiver, net.minecraft.world.World p0, double p1, double p2, double p3, net.minecraft.block.state.IBlockState p4) throws Throwable {

long local9 = (net.minecraft.entity.item.EntityFallingBlock.bb ^ 54941319350885L);

    net.minecraft.entity.item.EntityFallingBlock.__sourceConstructorInit_4691b4df56eef1e9_0(((net.minecraft.entity.item.EntityFallingBlock)(receiver)), ((net.minecraft.world.World)(p0)));

    ((net.minecraft.entity.item.EntityFallingBlock)(receiver)).aG = ((boolean)(true));

    ((net.minecraft.entity.item.EntityFallingBlock)(receiver)).aJ = ((int)(__sourceIntrinsic_4691b4df56eef1e9_originalDynamicSite3840_3(21977, (6313206169744922352L ^ local9))));

    ((net.minecraft.entity.item.EntityFallingBlock)(receiver)).aK = ((float)(0x1.0p1f));

    ((net.minecraft.entity.item.EntityFallingBlock)(receiver)).aE = ((net.minecraft.block.state.IBlockState)(p4));

    ((net.minecraft.entity.item.EntityFallingBlock)(receiver)).e = ((boolean)(true));

    ((net.minecraft.entity.item.EntityFallingBlock)(receiver)).a__Void(((float)(0x1.f5c29p-1f)), ((float)(0x1.f5c29p-1f)));

    ((net.minecraft.entity.item.EntityFallingBlock)(receiver)).a__Void(((double)(p1)), ((double)(p2)), ((double)(p3)));

    ((net.minecraft.entity.item.EntityFallingBlock)(receiver)).t = ((double)(0x0.0p0d));

    ((net.minecraft.entity.item.EntityFallingBlock)(receiver)).u = ((double)(0x0.0p0d));

    ((net.minecraft.entity.item.EntityFallingBlock)(receiver)).v = ((double)(0x0.0p0d));

    ((net.minecraft.entity.item.EntityFallingBlock)(receiver)).k = ((double)(p1));

    ((net.minecraft.entity.item.EntityFallingBlock)(receiver)).l = ((double)(p2));

    ((net.minecraft.entity.item.EntityFallingBlock)(receiver)).m = ((double)(p3));

    return;

}



static {
bb = ((long)(((moom._a)(moom._c.a(((long)(-750055760953192298L)), ((long)(-8719889190002743380L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(128893873216378L)))));
    eb = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (net.minecraft.entity.item.EntityFallingBlock.bb ^ 124436910065557L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1859_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1859_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1859_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1859_14 = new byte[8];
    (__sourceSpill1859_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1859_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1859_16 = __sourceSpill1859_14;
    ((javax.crypto.Cipher)(__sourceSpill1859_11)).init(((int)(__sourceSpill1859_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1859_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1859_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[11];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "kÌ@¾AÏ]\026\027×»`{¬¸òün|\tã,7\006]<\020:u\036IT>\\ò3¯Òß5¾¼«Tc\034XJ\033ÆL|ÝÏè@§þ:9È3m\013"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1859_25 = local6_life21;
        int __sourceSpill1859_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1859_25)).substring(((int)(__sourceSpill1859_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1859_30 = local8_life19;
        int __sourceSpill1859_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1859_33 = new byte[8];
        (__sourceSpill1859_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1859_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1859_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1859_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1859_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1859_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1859_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1859_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1859_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1859_34)).doFinal(((byte[])(__sourceSpill1859_33)));
        (__sourceSpill1859_30)[__sourceSpill1859_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "äWõVÓåc»g-ÒæQ"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1859_38 = local6_life21;
        int __sourceSpill1859_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1859_38)).substring(((int)(__sourceSpill1859_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1859_43 = local8_life19;
        int __sourceSpill1859_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1859_46 = new byte[8];
        (__sourceSpill1859_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1859_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1859_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1859_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1859_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1859_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1859_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1859_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1859_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1859_47)).doFinal(((byte[])(__sourceSpill1859_46)));
        (__sourceSpill1859_43)[__sourceSpill1859_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    cb = ((long[])(local8_life19));
    db = ((java.lang.Integer[])(new java.lang.Integer[11]));
}

private static native <E extends Throwable> void __sourceConstructorInit_997754b33a7a0fe0_0(net.minecraft.entity.item.EntityFallingBlock a0, net.minecraft.world.World a1) throws E;
private static native <E extends Throwable> void __sourceConstructorInit_4691b4df56eef1e9_0(net.minecraft.entity.item.EntityFallingBlock a0, net.minecraft.world.World a1) throws E;

private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 19110;
      if (db[var3] == null) {
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
         long var5 = cb[var3];
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
         Object[] var9 = (Object[])eb.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               eb.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/ty", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         db[var3] = var15;
      }

      return db[var3];
}


public net.minecraft.world.World b__sourceReturn_818f27b2a7() {
return this.i;
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.entity.item.EntityFallingBlock.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral11337_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/ty"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


protected void c(net.minecraft.nbt.NBTTagCompound p0) {
int forwardValue5048_45_0;
    int forwardValue5048_143_0;
    net.minecraft.block.Block forwardValue5048_154_0;
    int spill5048_0;
    boolean spill5048_1;
    boolean spill5048_2;
    net.minecraft.block.Block spill5048_3;
    long life2_3;
    int life5_14;
    int life4_15;
    net.minecraft.block.Block life6_99;
    forward_join_161: {
    forward_join_157: {
    forward_join_154: {
    forward_join_149: {
    forward_join_143: {
    forward_join_135: {
    forward_join_119: {
    forward_join_113: {
    forward_join_111: {
    forward_join_70: {
    forward_join_56: {
    forward_join_45: {
    forward_join_37: {
    life2_3 = (net.minecraft.entity.item.EntityFallingBlock.bb ^ 8382983437684L);
    spill5048_0 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.b();
    life5_14 = (((net.minecraft.nbt.NBTTagCompound)(p0)).b__sourceReturn_d4c7a9581c(((java.lang.String)("Data"))) & __sourceIntrinsic_01f4e1cd062e_invokedynamic5048_3(4684, (4164358641459078781L ^ life2_3)));
    life4_15 = spill5048_0;
    spill5048_1 = ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Boolean(((java.lang.String)("Block")), ((int)(__sourceIntrinsic_01f4e1cd062e_invokedynamic5048_4(13598, (5446910305965080866L ^ life2_3)))));
    if (!((life4_15 != 0))) {
        forwardValue5048_45_0 = ((spill5048_1) ? 1 : 0);
        break forward_join_45;
    }
    if (!(spill5048_1)) {
        break forward_join_37;
    }
    this.aE = ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.block.Block.a(((java.lang.String)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__String(((java.lang.String)("Block")))))))).b__fE(((int)(life5_14)))));
    if (!((life4_15 == 0))) {
        break forward_join_70;
    }
    }
    forwardValue5048_45_0 = ((((net.minecraft.nbt.NBTTagCompound)(p0)).a__Boolean(((java.lang.String)("TileID")), ((int)(__sourceIntrinsic_01f4e1cd062e_invokedynamic5048_11(3158, (7161465123734829157L ^ life2_3)))))) ? 1 : 0);
    }
    if (!((forwardValue5048_45_0 != 0))) {
        break forward_join_56;
    }
    this.aE = ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.block.Block.a(((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Int(((java.lang.String)("TileID")))))))).b__fE(((int)(life5_14)))));
    if (!((life4_15 == 0))) {
        break forward_join_70;
    }
    }
    this.aE = ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.block.Block.a(((int)((((net.minecraft.nbt.NBTTagCompound)(p0)).b__sourceReturn_d4c7a9581c(((java.lang.String)("Tile"))) & __sourceIntrinsic_01f4e1cd062e_invokedynamic5048_19(32352, (6875868156443576923L ^ life2_3)))))))).b__fE(((int)(life5_14)))));
    }
    this.aF = ((int)((((net.minecraft.nbt.NBTTagCompound)(p0)).b__sourceReturn_d4c7a9581c(((java.lang.String)("Time"))) & __sourceIntrinsic_01f4e1cd062e_invokedynamic5048_24(32352, (6875868156443576923L ^ life2_3)))));
    life6_99 = ((net.minecraft.block.state.IBlockState)(this.aE)).a__ch();
    if (!((life4_15 != 0))) {
        break forward_join_111;
    }
    if (!(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Boolean(((java.lang.String)("HurtEntities")), ((int)(__sourceIntrinsic_01f4e1cd062e_invokedynamic5048_28(29216, (3805802264834917914L ^ life2_3))))))) {
        break forward_join_113;
    }
    this.aI = ((boolean)(((net.minecraft.nbt.NBTTagCompound)(p0)).b__Boolean(((java.lang.String)("HurtEntities")))));
    this.aK = ((float)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Float(((java.lang.String)("FallHurtAmount")))));
    this.aJ = ((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Int(((java.lang.String)("FallHurtMax")))));
    }
    if (!((life4_15 == 0))) {
        break forward_join_119;
    }
    }
    if (!((life6_99 == net.minecraft.init.Blocks.bU))) {
        break forward_join_119;
    }
    this.aI = ((boolean)(true));
    }
    spill5048_2 = ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Boolean(((java.lang.String)("DropItem")), ((int)(__sourceIntrinsic_01f4e1cd062e_invokedynamic5048_38(29216, (3805802264834917914L ^ life2_3)))));
    if (!((life4_15 != 0))) {
        forwardValue5048_143_0 = ((spill5048_2) ? 1 : 0);
        break forward_join_143;
    }
    if (!(spill5048_2)) {
        break forward_join_135;
    }
    this.aG = ((boolean)(((net.minecraft.nbt.NBTTagCompound)(p0)).b__Boolean(((java.lang.String)("DropItem")))));
    }
    forwardValue5048_143_0 = ((((net.minecraft.nbt.NBTTagCompound)(p0)).a__Boolean(((java.lang.String)("TileEntityData")), ((int)(__sourceIntrinsic_01f4e1cd062e_invokedynamic5048_43(5187, (2266715116708143229L ^ life2_3)))))) ? 1 : 0);
    }
    if (!((forwardValue5048_143_0 != 0))) {
        break forward_join_149;
    }
    this.aL = ((net.minecraft.nbt.NBTTagCompound)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__yw(((java.lang.String)("TileEntityData")))));
    }
    spill5048_3 = life6_99;
    if (!((life4_15 != 0))) {
        forwardValue5048_154_0 = spill5048_3;
        break forward_join_154;
    }
    if (!((spill5048_3 != null))) {
        break forward_join_157;
    }
    forwardValue5048_154_0 = life6_99;
    }
    if (!((((net.minecraft.block.Block)(forwardValue5048_154_0)).a__fn() == moom.fn.a))) {
        break forward_join_161;
    }
    }
    this.aE = ((net.minecraft.block.state.IBlockState)(((moom.dx)(net.minecraft.init.Blocks.m)).a__fE()));
    }
    return;
}


public void h(boolean p0) {
this.aI = ((boolean)(p0));
    return;
}


protected void d(net.minecraft.nbt.NBTTagCompound p0) {
net.minecraft.block.state.IBlockState forwardValue5050_13_0;
    net.minecraft.block.Block forwardValue5050_16_0;
    net.minecraft.nbt.NBTTagCompound forwardValue5050_30_0;
    java.lang.String forwardValue5050_30_1;
    net.minecraft.nbt.NBTTagCompound forwardValue5050_31_0;
    java.lang.String forwardValue5050_31_1;
    moom.DD forwardValue5050_31_2;
    net.minecraft.nbt.NBTTagCompound forwardValue5050_32_0;
    java.lang.String forwardValue5050_32_1;
    java.lang.String forwardValue5050_32_2;
    net.minecraft.nbt.NBTTagCompound forwardValue5050_73_0;
    net.minecraft.block.state.IBlockState spill5050_0;
    net.minecraft.nbt.NBTTagCompound spill5050_1;
    java.lang.String spill5050_2;
    moom.DD spill5050_3;
    net.minecraft.nbt.NBTTagCompound spill5050_4;
    long life2_3;
    int life4_5;
    net.minecraft.block.Block life5_22;
    moom.DD life6_27;
    forward_join_77: {
    forward_join_73: {
    forward_join_32: {
    forward_join_31: {
    forward_join_30: {
    forward_join_16: {
    forward_join_15: {
    forward_join_13: {
    life2_3 = (net.minecraft.entity.item.EntityFallingBlock.bb ^ 64850496644735L);
    life4_5 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.c();
    spill5050_0 = this.aE;
    if (!((life4_5 == 0))) {
        forwardValue5050_13_0 = spill5050_0;
        break forward_join_13;
    }
    if (!((spill5050_0 != null))) {
        break forward_join_15;
    }
    forwardValue5050_13_0 = this.aE;
    }
    forwardValue5050_16_0 = ((net.minecraft.block.state.IBlockState)(forwardValue5050_13_0)).a__ch();
    break forward_join_16;
    }
    forwardValue5050_16_0 = net.minecraft.init.Blocks.a;
    }
    life5_22 = forwardValue5050_16_0;
    life6_27 = ((moom.DD)(((moom.DC)(net.minecraft.block.Block.b)).b(((java.lang.Object)(life5_22)))));
    spill5050_1 = p0;
    spill5050_2 = "Block";
    spill5050_3 = life6_27;
    if (!((life4_5 == 0))) {
        forwardValue5050_31_0 = spill5050_1;
        forwardValue5050_31_1 = spill5050_2;
        forwardValue5050_31_2 = spill5050_3;
        break forward_join_31;
    }
    if (!((spill5050_3 == null))) {
        forwardValue5050_30_0 = spill5050_1;
        forwardValue5050_30_1 = spill5050_2;
        break forward_join_30;
    }
    forwardValue5050_32_0 = spill5050_1;
    forwardValue5050_32_1 = spill5050_2;
    forwardValue5050_32_2 = "";
    break forward_join_32;
    }
    forwardValue5050_31_0 = forwardValue5050_30_0;
    forwardValue5050_31_1 = forwardValue5050_30_1;
    forwardValue5050_31_2 = life6_27;
    }
    forwardValue5050_32_0 = forwardValue5050_31_0;
    forwardValue5050_32_1 = forwardValue5050_31_1;
    forwardValue5050_32_2 = ((moom.DD)(forwardValue5050_31_2)).toString();
    }
    ((net.minecraft.nbt.NBTTagCompound)(forwardValue5050_32_0)).a(((java.lang.String)(forwardValue5050_32_1)), ((java.lang.String)(forwardValue5050_32_2)));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("Data")), ((byte)(((byte) ((net.minecraft.block.Block)(life5_22)).b(((net.minecraft.block.state.IBlockState)(this.aE)))))));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("Time")), ((byte)(((byte) this.aF))));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("DropItem")), ((boolean)(this.aG)));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("HurtEntities")), ((boolean)(this.aI)));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("FallHurtAmount")), ((float)(this.aK)));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Void(((java.lang.String)("FallHurtMax")), ((int)(this.aJ)));
    spill5050_4 = this.aL;
    if (!((life4_5 == 0))) {
        forwardValue5050_73_0 = spill5050_4;
        break forward_join_73;
    }
    if (!((spill5050_4 != null))) {
        break forward_join_77;
    }
    forwardValue5050_73_0 = p0;
    }
    ((net.minecraft.nbt.NBTTagCompound)(forwardValue5050_73_0)).a(((java.lang.String)("TileEntityData")), ((net.minecraft.nbt.NBTBase)(this.aL)));
    }
    return;
}


protected void d__Void() {
return;
}


public void d(float p0, float p1) {
int lexicalValue1573_19_0;
    int lexicalValue1573_36_0;
    net.minecraft.util.DamageSource lexicalValue1573_42_0;
    int lexicalValue1573_86_0;
    int lexicalValue1573_95_0;
    int spill1573_0;
    boolean spill1573_1;
    int spill1573_2;
    long life3_3;
    net.minecraft.block.Block life6_8;
    int life5_9;
    int life7_25;
    java.util.ArrayList life8_35;
    int life9_44;
    net.minecraft.util.DamageSource life10_52;
    java.util.Iterator life11_55;
    net.minecraft.entity.Entity life12_62;
    int life11_120;
    lexical_join_115: {
    lexical_join_107: {
    lexical_join_105: {
    lexical_join_95: {
    lexical_join_86: {
    lexical_join_71: {
    lexical_join_42: {
    lexical_join_41: {
    lexical_join_36: {
    lexical_join_35: {
    lexical_join_19: {
    life3_3 = (net.minecraft.entity.item.EntityFallingBlock.bb ^ 103733626622348L);
    spill1573_0 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.b();
    life6_8 = ((net.minecraft.block.state.IBlockState)(this.aE)).a__ch();
    life5_9 = spill1573_0;
    spill1573_1 = this.aI;
    if (!((life5_9 != 0))) {
        lexicalValue1573_19_0 = ((spill1573_1) ? 1 : 0);
        break lexical_join_19;
    }
    if (!(spill1573_1)) {
        break lexical_join_115;
    }
    lexicalValue1573_19_0 = moom.Dr.b__Int(((float)((p0 - 0x1.0p0f))));
    }
    life7_25 = lexicalValue1573_19_0;
    if (!((life7_25 > 0))) {
        break lexical_join_115;
    }
    life8_35 = com.google.common.collect.Lists.newArrayList(((java.lang.Iterable)(((net.minecraft.world.World)(this.i)).b(((net.minecraft.entity.Entity)(this)), ((moom.CA)(((net.minecraft.entity.item.EntityFallingBlock)(this)).b()))))));
    if (!((life6_8 == net.minecraft.init.Blocks.bU))) {
        break lexical_join_35;
    }
    lexicalValue1573_36_0 = 1;
    break lexical_join_36;
    }
    lexicalValue1573_36_0 = 0;
    }
    life9_44 = lexicalValue1573_36_0;
    if (!((life9_44 != 0))) {
        break lexical_join_41;
    }
    lexicalValue1573_42_0 = net.minecraft.util.DamageSource.n;
    break lexical_join_42;
    }
    lexicalValue1573_42_0 = net.minecraft.util.DamageSource.o;
    }
    life10_52 = lexicalValue1573_42_0;
    life11_55 = ((java.util.List)(life8_35)).iterator();
    lexical_cycle_46: while (true) {
    if (!(((java.util.Iterator)(life11_55)).hasNext())) {
        break lexical_join_71;
    }
    life12_62 = ((net.minecraft.entity.Entity)(((java.util.Iterator)(life11_55)).next()));
    ((net.minecraft.entity.Entity)(life12_62)).a__Boolean(((net.minecraft.util.DamageSource)(life10_52)), ((float)(((float) java.lang.Math.min(((int)(moom.Dr.a__Int(((float)((((float) life7_25) * this.aK)))))), ((int)(this.aJ)))))));
    if (!((life5_9 != 0))) {
        break lexical_join_115;
    }
    if (!((life5_9 == 0))) { continue lexical_cycle_46; }
    break lexical_cycle_46;
    }
    }
    spill1573_2 = life9_44;
    if (!((life5_9 != 0))) {
        lexicalValue1573_86_0 = spill1573_2;
        break lexical_join_86;
    }
    if (!((spill1573_2 != 0))) {
        break lexical_join_115;
    }
    lexicalValue1573_86_0 = recovery.source.CarrierOps.dcmpg(((double)(((double) ((java.util.Random)(this.ah)).nextFloat()))), ((double)((0x1.99999ap-5d + (((double) life7_25) * 0x1.999999999999ap-5d)))));
    }
    if (!((life5_9 != 0))) {
        lexicalValue1573_95_0 = lexicalValue1573_86_0;
        break lexical_join_95;
    }
    if (!((lexicalValue1573_86_0 < 0))) {
        break lexical_join_115;
    }
    lexicalValue1573_95_0 = ((java.lang.Integer)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(this.aE)).a(((net.minecraft.block.properties.IProperty)(moom.dv.S))))))).intValue();
    }
    life11_120 = lexicalValue1573_95_0;
    life11_120 += 1;
    if (!((life5_9 != 0))) {
        break lexical_join_105;
    }
    if (!((life11_120 > 2))) {
        break lexical_join_107;
    }
    this.aH = ((boolean)(true));
    }
    if (!((life5_9 == 0))) {
        break lexical_join_115;
    }
    }
    this.aE = ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(this.aE)).a__fE(((net.minecraft.block.properties.IProperty)(moom.dv.S)), ((java.lang.Comparable)(java.lang.Integer.valueOf(((int)(life11_120))))))));
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public net.minecraft.block.state.IBlockState a() {
return this.aE;
}


public void a(moom.qZ p0) {
net.minecraft.block.state.IBlockState forwardValue5047_16_0;
    int spill5047_0;
    net.minecraft.block.state.IBlockState spill5047_1;
    long life2_3;
    int life4_8;
    net.minecraft.block.Block life5_23;
    forward_join_32: {
    forward_join_16: {
    life2_3 = (net.minecraft.entity.item.EntityFallingBlock.bb ^ 5054627691573L);
    spill5047_0 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.b();
    super.a(((moom.qZ)(p0)));
    life4_8 = spill5047_0;
    spill5047_1 = this.aE;
    if (!((life4_8 != 0))) {
        forwardValue5047_16_0 = spill5047_1;
        break forward_join_16;
    }
    if (!((spill5047_1 != null))) {
        break forward_join_32;
    }
    forwardValue5047_16_0 = this.aE;
    }
    life5_23 = ((net.minecraft.block.state.IBlockState)(forwardValue5047_16_0)).a__ch();
    ((moom.qZ)(p0)).a(((java.lang.String)("Immitating block ID")), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(net.minecraft.block.Block.a(((net.minecraft.block.Block)(life5_23)))))))));
    ((moom.qZ)(p0)).a(((java.lang.String)("Immitating block data")), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(((net.minecraft.block.Block)(life5_23)).b(((net.minecraft.block.state.IBlockState)(this.aE)))))))));
    }
    return;
}


public boolean m__Boolean() {
int forwardValue5052_12_0;
    int forwardValue5052_14_0;
    boolean spill5052_0;
    long life1_3;
    int life3_5;
    forward_join_14: {
    forward_join_13: {
    forward_join_12: {
    life1_3 = (net.minecraft.entity.item.EntityFallingBlock.bb ^ 7613581866084L);
    life3_5 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.c();
    spill5052_0 = this.F;
    if (!((life3_5 == 0))) {
        forwardValue5052_12_0 = ((spill5052_0) ? 1 : 0);
        break forward_join_12;
    }
    if (!((!spill5052_0))) {
        break forward_join_13;
    }
    forwardValue5052_12_0 = 1;
    }
    forwardValue5052_14_0 = forwardValue5052_12_0;
    break forward_join_14;
    }
    forwardValue5052_14_0 = 0;
    }
    return ((forwardValue5052_14_0) != 0);
}


protected boolean g__Boolean() {
return ((0) != 0);
}


public void g__Void() {
net.minecraft.world.World lexicalValue1574_65_0;
    int lexicalValue1574_107_0;
    net.minecraft.entity.item.EntityFallingBlock lexicalValue1574_148_0;
    int lexicalValue1574_161_0;
    net.minecraft.block.Block lexicalValue1574_188_0;
    int lexicalValue1574_241_0;
    int lexicalValue1574_247_0;
    int lexicalValue1574_264_0;
    int lexicalValue1574_274_0;
    net.minecraft.entity.item.EntityFallingBlock lexicalValue1574_276_0;
    int lexicalValue1574_292_0;
    int lexicalValue1574_324_0;
    int lexicalValue1574_331_0;
    int lexicalValue1574_331_1;
    int lexicalValue1574_336_0;
    net.minecraft.entity.item.EntityFallingBlock lexicalValue1574_359_0;
    int spill1574_0;
    int spill1574_1;
    net.minecraft.world.World spill1574_2;
    boolean spill1574_3;
    boolean spill1574_4;
    net.minecraft.entity.item.EntityFallingBlock spill1574_5;
    boolean spill1574_6;
    boolean spill1574_7;
    boolean spill1574_8;
    net.minecraft.block.Block spill1574_9;
    boolean spill1574_10;
    net.minecraft.entity.item.EntityFallingBlock spill1574_11;
    int spill1574_12;
    boolean spill1574_13;
    int spill1574_14;
    int spill1574_15;
    net.minecraft.entity.item.EntityFallingBlock spill1574_16;
    net.minecraft.entity.item.EntityFallingBlock spill1574_17;
    long life1_3;
    net.minecraft.block.Block life4_8;
    int life3_9;
    moom.DT life5_58;
    moom.DT life5_138;
    net.minecraft.tileentity.TileEntity life6_274;
    net.minecraft.nbt.NBTTagCompound life7_280;
    java.util.Iterator life8_288;
    java.lang.String life9_295;
    net.minecraft.nbt.NBTBase life10_300;
    lexical_join_360: {
    lexical_join_359: {
    lexical_join_358: {
    lexical_join_336: {
    lexical_join_332: {
    lexical_join_331: {
    lexical_join_324: {
    lexical_join_322: {
    lexical_join_292: {
    lexical_join_290: {
    lexical_join_276: {
    lexical_join_274: {
    lexical_join_264: {
    lexical_join_262: {
    lexical_join_260: {
    lexical_join_258: {
    lexical_join_255: {
    lexical_join_193: {
    lexical_join_188: {
    lexical_join_161: {
    lexical_join_148: {
    lexical_join_107: {
    lexical_join_72: {
    lexical_join_65: {
    lexical_join_63: {
    lexical_join_32: {
    lexical_join_20: {
    life1_3 = (net.minecraft.entity.item.EntityFallingBlock.bb ^ 56541390082560L);
    spill1574_0 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.c();
    life4_8 = ((net.minecraft.block.state.IBlockState)(this.aE)).a__ch();
    life3_9 = spill1574_0;
    if (!((life3_9 == 0))) {
        break lexical_join_32;
    }
    if (!((((net.minecraft.block.Block)(life4_8)).a__fn() == moom.fn.a))) {
        break lexical_join_20;
    }
    ((net.minecraft.entity.item.EntityFallingBlock)(this)).f__Void();
    if (!((life3_9 != 0))) {
        break lexical_join_360;
    }
    }
    this.k = ((double)(this.n));
    this.l = ((double)(this.o));
    this.m = ((double)(this.p));
    }
    net.minecraft.entity.item.EntityFallingBlock __stackOp1574_13_0 = this;
    net.minecraft.entity.item.EntityFallingBlock __stackOp1574_15_0 = __stackOp1574_13_0;
    int __stackOp1574_15_1 = ((net.minecraft.entity.item.EntityFallingBlock)(__stackOp1574_13_0)).aF;
    spill1574_1 = __stackOp1574_15_1;
    ((net.minecraft.entity.item.EntityFallingBlock)(__stackOp1574_15_0)).aF = ((int)((__stackOp1574_15_1 + 1)));
    if (!((life3_9 == 0))) {
        lexicalValue1574_107_0 = spill1574_1;
        break lexical_join_107;
    }
    if (!((spill1574_1 == 0))) {
        break lexical_join_72;
    }
    life5_58 = new moom.DT(this);
    spill1574_2 = this.i;
    if (!((life3_9 == 0))) {
        lexicalValue1574_65_0 = spill1574_2;
        break lexical_join_65;
    }
    if (!((((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(spill1574_2)).a__fE(((moom.DT)(life5_58))))).a__ch() == life4_8))) {
        break lexical_join_63;
    }
    ((net.minecraft.world.World)(this.i)).d__Boolean(((moom.DT)(life5_58)));
    if (!((life3_9 != 0))) {
        break lexical_join_72;
    }
    }
    lexicalValue1574_65_0 = this.i;
    }
    spill1574_3 = ((net.minecraft.world.World)(lexicalValue1574_65_0)).G;
    if (!((life3_9 == 0))) {
        lexicalValue1574_107_0 = ((spill1574_3) ? 1 : 0);
        break lexical_join_107;
    }
    if (!((!spill1574_3))) {
        break lexical_join_72;
    }
    ((net.minecraft.entity.item.EntityFallingBlock)(this)).f__Void();
    return;
    }
    net.minecraft.entity.item.EntityFallingBlock __stackOp1574_26_0 = this;
    ((net.minecraft.entity.item.EntityFallingBlock)(__stackOp1574_26_0)).u = ((double)((((net.minecraft.entity.item.EntityFallingBlock)(__stackOp1574_26_0)).u - 0x1.47ae14p-5d)));
    ((net.minecraft.entity.item.EntityFallingBlock)(this)).b__Void(((double)(this.t)), ((double)(this.u)), ((double)(this.v)));
    net.minecraft.entity.item.EntityFallingBlock __stackOp1574_33_0 = this;
    ((net.minecraft.entity.item.EntityFallingBlock)(__stackOp1574_33_0)).t = ((double)((((net.minecraft.entity.item.EntityFallingBlock)(__stackOp1574_33_0)).t * 0x1.f5c29p-1d)));
    net.minecraft.entity.item.EntityFallingBlock __stackOp1574_36_0 = this;
    ((net.minecraft.entity.item.EntityFallingBlock)(__stackOp1574_36_0)).u = ((double)((((net.minecraft.entity.item.EntityFallingBlock)(__stackOp1574_36_0)).u * 0x1.f5c29p-1d)));
    net.minecraft.entity.item.EntityFallingBlock __stackOp1574_39_0 = this;
    ((net.minecraft.entity.item.EntityFallingBlock)(__stackOp1574_39_0)).v = ((double)((((net.minecraft.entity.item.EntityFallingBlock)(__stackOp1574_39_0)).v * 0x1.f5c29p-1d)));
    lexicalValue1574_107_0 = ((((net.minecraft.world.World)(this.i)).G) ? 1 : 0);
    }
    if (!((lexicalValue1574_107_0 == 0))) {
        break lexical_join_360;
    }
    life5_138 = new moom.DT(this);
    spill1574_4 = this.A;
    if (!((life3_9 == 0))) {
        lexicalValue1574_292_0 = ((spill1574_4) ? 1 : 0);
        break lexical_join_292;
    }
    if (!(spill1574_4)) {
        break lexical_join_290;
    }
    net.minecraft.entity.item.EntityFallingBlock __stackOp1574_47_0 = this;
    ((net.minecraft.entity.item.EntityFallingBlock)(__stackOp1574_47_0)).t = ((double)((((net.minecraft.entity.item.EntityFallingBlock)(__stackOp1574_47_0)).t * 0x1.666666p-1d)));
    net.minecraft.entity.item.EntityFallingBlock __stackOp1574_50_0 = this;
    ((net.minecraft.entity.item.EntityFallingBlock)(__stackOp1574_50_0)).v = ((double)((((net.minecraft.entity.item.EntityFallingBlock)(__stackOp1574_50_0)).v * 0x1.666666p-1d)));
    net.minecraft.entity.item.EntityFallingBlock __stackOp1574_53_0 = this;
    ((net.minecraft.entity.item.EntityFallingBlock)(__stackOp1574_53_0)).u = ((double)((((net.minecraft.entity.item.EntityFallingBlock)(__stackOp1574_53_0)).u * -0x1.0p-1d)));
    spill1574_5 = this;
    if (!((life3_9 == 0))) {
        lexicalValue1574_148_0 = spill1574_5;
        break lexical_join_148;
    }
    if (!((((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(((net.minecraft.entity.item.EntityFallingBlock)(spill1574_5)).i)).a__fE(((moom.DT)(life5_138))))).a__ch() != net.minecraft.init.Blocks.M))) {
        break lexical_join_360;
    }
    ((net.minecraft.entity.item.EntityFallingBlock)(this)).f__Void();
    lexicalValue1574_148_0 = this;
    }
    spill1574_6 = ((net.minecraft.entity.item.EntityFallingBlock)(lexicalValue1574_148_0)).aH;
    if (!((life3_9 == 0))) {
        lexicalValue1574_161_0 = ((spill1574_6) ? 1 : 0);
        break lexical_join_161;
    }
    if (!((!spill1574_6))) {
        break lexical_join_360;
    }
    lexicalValue1574_161_0 = ((((net.minecraft.world.World)(this.i)).a(((net.minecraft.block.Block)(life4_8)), ((moom.DT)(life5_138)), ((boolean)(true)), ((moom.bs)(moom.bs.UP)), ((net.minecraft.entity.Entity)(null)), ((net.minecraft.item.ItemStack)(null)))) ? 1 : 0);
    }
    if (!((life3_9 == 0))) {
        lexicalValue1574_264_0 = lexicalValue1574_161_0;
        break lexical_join_264;
    }
    if (!((lexicalValue1574_161_0 != 0))) {
        break lexical_join_262;
    }
    spill1574_7 = moom.du.c__Boolean(((net.minecraft.world.World)(this.i)), ((moom.DT)(((moom.DT)(life5_138)).b__DT())));
    if (!((life3_9 == 0))) {
        lexicalValue1574_264_0 = ((spill1574_7) ? 1 : 0);
        break lexical_join_264;
    }
    if (!((!spill1574_7))) {
        break lexical_join_262;
    }
    spill1574_8 = ((net.minecraft.world.World)(this.i)).a(((moom.DT)(life5_138)), ((net.minecraft.block.state.IBlockState)(this.aE)), ((int)(3)));
    if (!((life3_9 == 0))) {
        lexicalValue1574_264_0 = ((spill1574_8) ? 1 : 0);
        break lexical_join_264;
    }
    if (!(spill1574_8)) {
        break lexical_join_262;
    }
    spill1574_9 = life4_8;
    if (!((life3_9 == 0))) {
        lexicalValue1574_188_0 = spill1574_9;
        break lexical_join_188;
    }
    if (!((((spill1574_9 instanceof moom.du) ? 1 : 0) != 0))) {
        break lexical_join_193;
    }
    lexicalValue1574_188_0 = life4_8;
    }
    ((moom.du)(((moom.du)(lexicalValue1574_188_0)))).c(((net.minecraft.world.World)(this.i)), ((moom.DT)(life5_138)));
    }
    if (!((this.aL != null))) {
        break lexical_join_360;
    }
    if (!((((life4_8 instanceof net.minecraft.block.ITileEntityProvider) ? 1 : 0) != 0))) {
        break lexical_join_360;
    }
    life6_274 = ((net.minecraft.world.World)(this.i)).a__B9(((moom.DT)(life5_138)));
    if (!((life6_274 != null))) {
        break lexical_join_260;
    }
    life7_280 = new net.minecraft.nbt.NBTTagCompound();
    ((net.minecraft.tileentity.TileEntity)(life6_274)).b(((net.minecraft.nbt.NBTTagCompound)(life7_280)));
    life8_288 = ((java.util.Set)(((net.minecraft.nbt.NBTTagCompound)(this.aL)).a__Set())).iterator();
    lexical_cycle_218: while (true) {
    lexical_join_253: {
    lexical_join_247: {
    lexical_join_241: {
    if (!(((java.util.Iterator)(life8_288)).hasNext())) {
        break lexical_join_255;
    }
    life9_295 = ((java.lang.String)(((java.util.Iterator)(life8_288)).next()));
    life10_300 = ((net.minecraft.nbt.NBTTagCompound)(this.aL)).a__yn(((java.lang.String)(life9_295)));
    if (!((life3_9 == 0))) {
        break lexical_join_258;
    }
    spill1574_10 = ((java.lang.String)(life9_295)).equals(((java.lang.Object)("x")));
    if (!((life3_9 == 0))) {
        lexicalValue1574_241_0 = ((spill1574_10) ? 1 : 0);
        break lexical_join_241;
    }
    if (!((!spill1574_10))) {
        break lexical_join_253;
    }
    lexicalValue1574_241_0 = ((((java.lang.String)(life9_295)).equals(((java.lang.Object)("y")))) ? 1 : 0);
    }
    if (!((life3_9 == 0))) {
        lexicalValue1574_247_0 = lexicalValue1574_241_0;
        break lexical_join_247;
    }
    if (!((lexicalValue1574_241_0 == 0))) {
        break lexical_join_253;
    }
    lexicalValue1574_247_0 = ((((java.lang.String)(life9_295)).equals(((java.lang.Object)("z")))) ? 1 : 0);
    }
    if (!((lexicalValue1574_247_0 == 0))) {
        break lexical_join_253;
    }
    ((net.minecraft.nbt.NBTTagCompound)(life7_280)).a(((java.lang.String)(life9_295)), ((net.minecraft.nbt.NBTBase)(((net.minecraft.nbt.NBTBase)(life10_300)).a__yn())));
    }
    if (!((life3_9 != 0))) { continue lexical_cycle_218; }
    break lexical_cycle_218;
    }
    }
    ((net.minecraft.tileentity.TileEntity)(life6_274)).a__Void(((net.minecraft.nbt.NBTTagCompound)(life7_280)));
    }
    ((net.minecraft.tileentity.TileEntity)(life6_274)).a__Void();
    }
    if (!((life3_9 != 0))) {
        break lexical_join_360;
    }
    }
    lexicalValue1574_264_0 = ((this.aG) ? 1 : 0);
    }
    if (!((life3_9 == 0))) {
        lexicalValue1574_274_0 = lexicalValue1574_264_0;
        break lexical_join_274;
    }
    if (!((lexicalValue1574_264_0 != 0))) {
        break lexical_join_360;
    }
    spill1574_11 = this;
    if (!((life3_9 == 0))) {
        lexicalValue1574_276_0 = spill1574_11;
        break lexical_join_276;
    }
    lexicalValue1574_274_0 = ((((net.minecraft.world.GameRules)(((net.minecraft.world.World)(((net.minecraft.entity.item.EntityFallingBlock)(spill1574_11)).i)).a__Ej())).a__Boolean(((java.lang.String)("doEntityDrops")))) ? 1 : 0);
    }
    if (!((lexicalValue1574_274_0 != 0))) {
        break lexical_join_360;
    }
    lexicalValue1574_276_0 = this;
    }
    ((net.minecraft.entity.item.EntityFallingBlock)(lexicalValue1574_276_0)).a(((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(life4_8, 1, ((net.minecraft.block.Block)(life4_8)).c(((net.minecraft.block.state.IBlockState)(this.aE)))))), ((float)(0x0.0p0f)));
    if (!((life3_9 != 0))) {
        break lexical_join_360;
    }
    }
    lexicalValue1574_292_0 = this.aF;
    }
    spill1574_12 = __sourceIntrinsic_736a66cda11e_invokedynamic1574_112(625, (8981447678645918010L ^ life1_3));
    if (!((life3_9 == 0))) {
        lexicalValue1574_331_0 = lexicalValue1574_292_0;
        lexicalValue1574_331_1 = spill1574_12;
        break lexical_join_331;
    }
    if (!((lexicalValue1574_292_0 > spill1574_12))) {
        break lexical_join_322;
    }
    spill1574_13 = ((net.minecraft.world.World)(this.i)).G;
    if (!((life3_9 == 0))) {
        lexicalValue1574_324_0 = ((spill1574_13) ? 1 : 0);
        break lexical_join_324;
    }
    if (!((!spill1574_13))) {
        break lexical_join_322;
    }
    spill1574_14 = ((moom.DT)(life5_138)).b();
    if (!((life3_9 == 0))) {
        lexicalValue1574_336_0 = spill1574_14;
        break lexical_join_336;
    }
    if (!((spill1574_14 >= 1))) {
        break lexical_join_332;
    }
    spill1574_15 = ((moom.DT)(life5_138)).b();
    if (!((life3_9 == 0))) {
        lexicalValue1574_336_0 = spill1574_15;
        break lexical_join_336;
    }
    if (!((spill1574_15 <= __sourceIntrinsic_736a66cda11e_invokedynamic1574_118(1104, (1250637946004594461L ^ life1_3))))) {
        break lexical_join_332;
    }
    }
    lexicalValue1574_324_0 = this.aF;
    }
    if (!((life3_9 == 0))) {
        lexicalValue1574_336_0 = lexicalValue1574_324_0;
        break lexical_join_336;
    }
    lexicalValue1574_331_0 = lexicalValue1574_324_0;
    lexicalValue1574_331_1 = __sourceIntrinsic_736a66cda11e_invokedynamic1574_120(22843, (4568343814466011762L ^ life1_3));
    }
    if (!((lexicalValue1574_331_0 > lexicalValue1574_331_1))) {
        break lexical_join_360;
    }
    }
    spill1574_16 = this;
    if (!((life3_9 == 0))) {
        lexicalValue1574_359_0 = spill1574_16;
        break lexical_join_359;
    }
    lexicalValue1574_336_0 = ((((net.minecraft.entity.item.EntityFallingBlock)(spill1574_16)).aG) ? 1 : 0);
    }
    if (!((lexicalValue1574_336_0 != 0))) {
        break lexical_join_358;
    }
    spill1574_17 = this;
    if (!((life3_9 == 0))) {
        lexicalValue1574_359_0 = spill1574_17;
        break lexical_join_359;
    }
    if (!(((net.minecraft.world.GameRules)(((net.minecraft.world.World)(((net.minecraft.entity.item.EntityFallingBlock)(spill1574_17)).i)).a__Ej())).a__Boolean(((java.lang.String)("doEntityDrops"))))) {
        break lexical_join_358;
    }
    ((net.minecraft.entity.item.EntityFallingBlock)(this)).a(((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(life4_8, 1, ((net.minecraft.block.Block)(life4_8)).c(((net.minecraft.block.state.IBlockState)(this.aE)))))), ((float)(0x0.0p0f)));
    }
    lexicalValue1574_359_0 = this;
    }
    ((net.minecraft.entity.item.EntityFallingBlock)(lexicalValue1574_359_0)).f__Void();
    }
    return;
}


public boolean z() {
return ((0) != 0);
}


private static native <E extends Throwable> int __sourceIntrinsic_997754b33a7a0fe0_originalDynamicSite3839_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4691b4df56eef1e9_originalDynamicSite3840_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral11337_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01f4e1cd062e_invokedynamic5048_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01f4e1cd062e_invokedynamic5048_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01f4e1cd062e_invokedynamic5048_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01f4e1cd062e_invokedynamic5048_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01f4e1cd062e_invokedynamic5048_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01f4e1cd062e_invokedynamic5048_28(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01f4e1cd062e_invokedynamic5048_38(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01f4e1cd062e_invokedynamic5048_43(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_736a66cda11e_invokedynamic1574_112(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_736a66cda11e_invokedynamic1574_118(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_736a66cda11e_invokedynamic1574_120(int a0, long a1) throws E;
}
