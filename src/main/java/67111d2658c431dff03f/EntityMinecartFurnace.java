package net.minecraft.entity.item;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class EntityMinecartFurnace extends net.minecraft.entity.item.EntityMinecart {

private int aQ;

public double aR;

public double aS;

private static final long bb;

private static final long[] db;

private static final java.lang.Integer[] ib;

private static final java.util.Map jb;

public EntityMinecartFurnace(net.minecraft.world.World p0) {
super(p0);
}


public EntityMinecartFurnace(net.minecraft.world.World p0, double p1, double p2, double p3) {
super(p0, p1, p2, p3);
}


static {
bb = ((long)(((moom._a)(moom._c.a(((long)(-2285871730501797754L)), ((long)(295837224821244437L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(119004215005107L)))));
    jb = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (net.minecraft.entity.item.EntityMinecartFurnace.bb ^ 138861459803937L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1865_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1865_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1865_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1865_14 = new byte[8];
    (__sourceSpill1865_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1865_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1865_16 = __sourceSpill1865_14;
    ((javax.crypto.Cipher)(__sourceSpill1865_11)).init(((int)(__sourceSpill1865_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1865_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1865_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[4];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "\021ô\"f0r!ÆIõ\002\027\016\023"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1865_25 = local6_life21;
        int __sourceSpill1865_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1865_25)).substring(((int)(__sourceSpill1865_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1865_30 = local8_life19;
        int __sourceSpill1865_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1865_33 = new byte[8];
        (__sourceSpill1865_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1865_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1865_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1865_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1865_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1865_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1865_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1865_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1865_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1865_34)).doFinal(((byte[])(__sourceSpill1865_33)));
        (__sourceSpill1865_30)[__sourceSpill1865_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "ô_VåsUmÓÊ»©/E»é"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1865_38 = local6_life21;
        int __sourceSpill1865_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1865_38)).substring(((int)(__sourceSpill1865_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1865_43 = local8_life19;
        int __sourceSpill1865_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1865_46 = new byte[8];
        (__sourceSpill1865_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1865_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1865_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1865_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1865_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1865_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1865_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1865_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1865_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1865_47)).doFinal(((byte[])(__sourceSpill1865_46)));
        (__sourceSpill1865_43)[__sourceSpill1865_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    db = ((long[])(local8_life19));
    ib = ((java.lang.Integer[])(new java.lang.Integer[4]));
}


protected void i(boolean p0) {
long life2_3;
    int life4_5;
    forward_join_56: {
    forward_join_32: {
    forward_join_30: {
    life2_3 = (net.minecraft.entity.item.EntityMinecartFurnace.bb ^ 128456704762996L);
    life4_5 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.c();
    if (!((life4_5 == 0))) { break forward_join_30; }
    if (!(p0)) { break forward_join_32; }
    ((net.minecraft.entity.DataWatcher)(((net.minecraft.entity.item.EntityMinecartFurnace)(this)).al)).b(((int)(__sourceIntrinsic_609c553b21ef_invokedynamic5745_3(432, (1875208018345617172L ^ life2_3)))), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(((byte) (((net.minecraft.entity.DataWatcher)(((net.minecraft.entity.item.EntityMinecartFurnace)(this)).al)).a(((int)(__sourceIntrinsic_609c553b21ef_invokedynamic5745_5(432, (1875208018345617172L ^ life2_3))))) | 1))))))));
    }
    if (!((life4_5 != 0))) { break forward_join_56; }
    }
    ((net.minecraft.entity.DataWatcher)(((net.minecraft.entity.item.EntityMinecartFurnace)(this)).al)).b(((int)(__sourceIntrinsic_609c553b21ef_invokedynamic5745_10(432, (1875208018345617172L ^ life2_3)))), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(((byte) (((net.minecraft.entity.DataWatcher)(((net.minecraft.entity.item.EntityMinecartFurnace)(this)).al)).a(((int)(__sourceIntrinsic_609c553b21ef_invokedynamic5745_12(432, (1875208018345617172L ^ life2_3))))) & __sourceIntrinsic_609c553b21ef_invokedynamic5745_14(17351, (1173647343290033504L ^ life2_3))))))))));
    }
    return;
}


public net.minecraft.block.state.IBlockState b__fE() {
long local1 = (net.minecraft.entity.item.EntityMinecartFurnace.bb ^ 56862555197483L);
    return ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(((__sourceIntrinsic_booleanComparison(((net.minecraft.entity.item.EntityMinecartFurnace)(this)).b__Boolean()) != 0) ? net.minecraft.init.Blocks.am : net.minecraft.init.Blocks.al))).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.c8.R)), ((java.lang.Comparable)(moom.bs.NORTH)));
}


public boolean b__Boolean(net.minecraft.entity.player.EntityPlayer p0) {
int forwardValue5102_31_0;
    int spill5102_0;
    boolean spill5102_1;
    int spill5102_2;
    long life2_3;
    net.minecraft.item.ItemStack life5_8;
    int life4_9;
    forward_join_63: {
    forward_join_49: {
    forward_join_39: {
    forward_join_31: {
    life2_3 = (net.minecraft.entity.item.EntityMinecartFurnace.bb ^ 56203613740218L);
    spill5102_0 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.b();
    life5_8 = ((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.entity.player.EntityPlayer)(p0)).bD)).a__xW();
    life4_9 = spill5102_0;
    if (!((life4_9 != 0))) {
        break forward_join_63;
    }
    if (!((life5_8 != null))) {
        break forward_join_49;
    }
    if (!((((net.minecraft.item.ItemStack)(life5_8)).a__wQ() == net.minecraft.init.Items.h))) {
        break forward_join_49;
    }
    spill5102_1 = ((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.entity.player.EntityPlayer)(p0)).b1)).d;
    if (!((life4_9 != 0))) {
        forwardValue5102_31_0 = ((spill5102_1) ? 1 : 0);
        break forward_join_31;
    }
    if (!((!spill5102_1))) {
        break forward_join_39;
    }
    net.minecraft.item.ItemStack __stackOp5102_9_0 = life5_8;
    net.minecraft.item.ItemStack __stackOp5102_11_0 = __stackOp5102_9_0;
    int __stackOp5102_11_1 = (((net.minecraft.item.ItemStack)(__stackOp5102_9_0)).b - 1);
    spill5102_2 = __stackOp5102_11_1;
    ((net.minecraft.item.ItemStack)(__stackOp5102_11_0)).b = ((int)(__stackOp5102_11_1));
    forwardValue5102_31_0 = spill5102_2;
    }
    if (!((forwardValue5102_31_0 == 0))) {
        break forward_join_39;
    }
    ((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.entity.player.EntityPlayer)(p0)).bD)).a__Void(((int)(((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.entity.player.EntityPlayer)(p0)).bD)).c)), ((net.minecraft.item.ItemStack)(null)));
    }
    net.minecraft.entity.item.EntityMinecartFurnace __stackOp5102_17_0 = this;
    ((net.minecraft.entity.item.EntityMinecartFurnace)(__stackOp5102_17_0)).aQ = ((int)((((net.minecraft.entity.item.EntityMinecartFurnace)(__stackOp5102_17_0)).aQ + __sourceIntrinsic_f3b5a13f4a2d_invokedynamic5102_19(22875, (4584919855766669107L ^ life2_3)))));
    }
    this.aR = ((double)((((net.minecraft.entity.item.EntityMinecartFurnace)(this)).n - ((net.minecraft.entity.player.EntityPlayer)(p0)).n)));
    this.aS = ((double)((((net.minecraft.entity.item.EntityMinecartFurnace)(this)).p - ((net.minecraft.entity.player.EntityPlayer)(p0)).p)));
    }
    return ((1) != 0);
}


protected boolean b__Boolean() {
int forwardValue5101_20_0;
    int forwardValue5101_22_0;
    int spill5101_0;
    long life1_3;
    int life3_5;
    forward_join_22: {
    forward_join_21: {
    forward_join_20: {
    life1_3 = (net.minecraft.entity.item.EntityMinecartFurnace.bb ^ 22191890434292L);
    life3_5 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.c();
    spill5101_0 = (((net.minecraft.entity.DataWatcher)(((net.minecraft.entity.item.EntityMinecartFurnace)(this)).al)).a(((int)(__sourceIntrinsic_74e88f4b4822_invokedynamic5101_3(432, (1875312995283422100L ^ life1_3))))) & 1);
    if (!((life3_5 == 0))) {
        forwardValue5101_20_0 = spill5101_0;
        break forward_join_20;
    }
    if (!((spill5101_0 != 0))) {
        break forward_join_21;
    }
    forwardValue5101_20_0 = 1;
    }
    forwardValue5101_22_0 = forwardValue5101_20_0;
    break forward_join_22;
    }
    forwardValue5101_22_0 = 0;
    }
    return ((forwardValue5101_22_0) != 0);
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


protected void x() {
long life1_3;
    double life4_16;
    int life3_17;
    double life4_30;
    double life6_44;
    forward_join_98: {
    forward_join_92: {
    forward_join_80: {
    life1_3 = (net.minecraft.entity.item.EntityMinecartFurnace.bb ^ 20690676999842L);
    int spill5104_0 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.c();
    life4_16 = ((this.aR * this.aR) + (this.aS * this.aS));
    life3_17 = spill5104_0;
    if (!((life3_17 == 0))) { break forward_join_92; }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(life4_16)), ((double)(0x1.a36e2eb1c432dp-14d))) > 0))) { break forward_join_80; }
    life4_30 = ((double) moom.Dr.a__Float(((double)(life4_16))));
    net.minecraft.entity.item.EntityMinecartFurnace __stackOp5104_8_0 = this;
    ((net.minecraft.entity.item.EntityMinecartFurnace)(__stackOp5104_8_0)).aR = ((double)((((net.minecraft.entity.item.EntityMinecartFurnace)(__stackOp5104_8_0)).aR / life4_30)));
    net.minecraft.entity.item.EntityMinecartFurnace __stackOp5104_11_0 = this;
    ((net.minecraft.entity.item.EntityMinecartFurnace)(__stackOp5104_11_0)).aS = ((double)((((net.minecraft.entity.item.EntityMinecartFurnace)(__stackOp5104_11_0)).aS / life4_30)));
    life6_44 = 0x1.0p0d;
    net.minecraft.entity.item.EntityMinecartFurnace __stackOp5104_14_0 = this;
    ((net.minecraft.entity.item.EntityMinecartFurnace)(__stackOp5104_14_0)).t = ((double)((((net.minecraft.entity.item.EntityMinecartFurnace)(__stackOp5104_14_0)).t * 0x1.99999ap-1d)));
    net.minecraft.entity.item.EntityMinecartFurnace __stackOp5104_17_0 = this;
    ((net.minecraft.entity.item.EntityMinecartFurnace)(__stackOp5104_17_0)).u = ((double)((((net.minecraft.entity.item.EntityMinecartFurnace)(__stackOp5104_17_0)).u * 0x0.0p0d)));
    net.minecraft.entity.item.EntityMinecartFurnace __stackOp5104_20_0 = this;
    ((net.minecraft.entity.item.EntityMinecartFurnace)(__stackOp5104_20_0)).v = ((double)((((net.minecraft.entity.item.EntityMinecartFurnace)(__stackOp5104_20_0)).v * 0x1.99999ap-1d)));
    net.minecraft.entity.item.EntityMinecartFurnace __stackOp5104_23_0 = this;
    ((net.minecraft.entity.item.EntityMinecartFurnace)(__stackOp5104_23_0)).t = ((double)((((net.minecraft.entity.item.EntityMinecartFurnace)(__stackOp5104_23_0)).t + (this.aR * life6_44))));
    net.minecraft.entity.item.EntityMinecartFurnace __stackOp5104_27_0 = this;
    ((net.minecraft.entity.item.EntityMinecartFurnace)(__stackOp5104_27_0)).v = ((double)((((net.minecraft.entity.item.EntityMinecartFurnace)(__stackOp5104_27_0)).v + (this.aS * life6_44))));
    if (!((life3_17 != 0))) { break forward_join_98; }
    }
    net.minecraft.entity.item.EntityMinecartFurnace __stackOp5104_31_0 = this;
    ((net.minecraft.entity.item.EntityMinecartFurnace)(__stackOp5104_31_0)).t = ((double)((((net.minecraft.entity.item.EntityMinecartFurnace)(__stackOp5104_31_0)).t * 0x1.f5c29p-1d)));
    net.minecraft.entity.item.EntityMinecartFurnace __stackOp5104_34_0 = this;
    ((net.minecraft.entity.item.EntityMinecartFurnace)(__stackOp5104_34_0)).u = ((double)((((net.minecraft.entity.item.EntityMinecartFurnace)(__stackOp5104_34_0)).u * 0x0.0p0d)));
    }
    net.minecraft.entity.item.EntityMinecartFurnace __stackOp5104_37_0 = this;
    ((net.minecraft.entity.item.EntityMinecartFurnace)(__stackOp5104_37_0)).v = ((double)((((net.minecraft.entity.item.EntityMinecartFurnace)(__stackOp5104_37_0)).v * 0x1.f5c29p-1d)));
    }
    super.x();
    return;
}


private static int c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.entity.item.EntityMinecartFurnace.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


protected void c(net.minecraft.nbt.NBTTagCompound p0) {
super.c(((net.minecraft.nbt.NBTTagCompound)(p0)));
    this.aR = ((double)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Double(((java.lang.String)("PushX")))));
    this.aS = ((double)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Double(((java.lang.String)("PushZ")))));
    this.aQ = ((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Short(((java.lang.String)("Fuel")))));
    return;
}


private static int c(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 26766;
      if (ib[var3] == null) {
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
         long var5 = db[var3];
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
         Object[] var9 = (Object[])jb.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               jb.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/tI", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         ib[var3] = var15;
      }

      return ib[var3];
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral11402_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/tI"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


protected double f__sourceReturn_fedcb3e4d3() {
return 0x1.999999999999ap-3d;
}


protected void d__Void() {
long local1 = (net.minecraft.entity.item.EntityMinecartFurnace.bb ^ 60611983354001L);
    super.d__Void();
    ((net.minecraft.entity.DataWatcher)(((net.minecraft.entity.item.EntityMinecartFurnace)(this)).al)).a(((int)(__sourceIntrinsic_a91ecd6db48f_originalDynamicSite1928_3(16915, (847528418246207571L ^ local1)))), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(0))))));
    return;
}


protected void d(net.minecraft.nbt.NBTTagCompound p0) {
super.d(((net.minecraft.nbt.NBTTagCompound)(p0)));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("PushX")), ((double)(this.aR)));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("PushZ")), ((double)(this.aS)));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("Fuel")), ((short)(((short) this.aQ))));
    return;
}


public net.minecraft.entity.item.EntityMinecart$EnumMinecartType a__aT() {
return net.minecraft.entity.item.EntityMinecart$EnumMinecartType.FURNACE;
}


protected void a(moom.DT p0, net.minecraft.block.state.IBlockState p1) {
int forwardValue5099_41_0;
    int forwardValue5099_75_0;
    double forwardValue5099_87_0;
    double forwardValue5099_87_1;
    int spill5099_0;
    int spill5099_1;
    double spill5099_2;
    double spill5099_3;
    long life3_3;
    int life5_9;
    double life6_21;
    double life8_106;
    forward_join_101: {
    forward_join_87: {
    forward_join_84: {
    forward_join_75: {
    forward_join_41: {
    life3_3 = (net.minecraft.entity.item.EntityMinecartFurnace.bb ^ 108443704162817L);
    spill5099_0 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.b();
    super.a(((moom.DT)(p0)), ((net.minecraft.block.state.IBlockState)(p1)));
    life5_9 = spill5099_0;
    life6_21 = ((this.aR * this.aR) + (this.aS * this.aS));
    spill5099_1 = recovery.source.CarrierOps.dcmpl(((double)(life6_21)), ((double)(0x1.a36e2eb1c432dp-14d)));
    if (!((life5_9 != 0))) {
        forwardValue5099_41_0 = spill5099_1;
        break forward_join_41;
    }
    if (!((spill5099_1 > 0))) {
        break forward_join_101;
    }
    forwardValue5099_41_0 = recovery.source.CarrierOps.dcmpl(((double)(((((net.minecraft.entity.item.EntityMinecartFurnace)(this)).t * ((net.minecraft.entity.item.EntityMinecartFurnace)(this)).t) + (((net.minecraft.entity.item.EntityMinecartFurnace)(this)).v * ((net.minecraft.entity.item.EntityMinecartFurnace)(this)).v)))), ((double)(0x1.0624dd2f1a9fcp-10d)));
    }
    if (!((life5_9 != 0))) {
        forwardValue5099_75_0 = forwardValue5099_41_0;
        break forward_join_75;
    }
    if (!((forwardValue5099_41_0 > 0))) {
        break forward_join_101;
    }
    life6_21 = ((double) moom.Dr.a__Float(((double)(life6_21))));
    net.minecraft.entity.item.EntityMinecartFurnace __stackOp5099_14_0 = this;
    ((net.minecraft.entity.item.EntityMinecartFurnace)(__stackOp5099_14_0)).aR = ((double)((((net.minecraft.entity.item.EntityMinecartFurnace)(__stackOp5099_14_0)).aR / life6_21)));
    net.minecraft.entity.item.EntityMinecartFurnace __stackOp5099_17_0 = this;
    ((net.minecraft.entity.item.EntityMinecartFurnace)(__stackOp5099_17_0)).aS = ((double)((((net.minecraft.entity.item.EntityMinecartFurnace)(__stackOp5099_17_0)).aS / life6_21)));
    spill5099_2 = ((this.aR * ((net.minecraft.entity.item.EntityMinecartFurnace)(this)).t) + (this.aS * ((net.minecraft.entity.item.EntityMinecartFurnace)(this)).v));
    spill5099_3 = 0x0.0p0d;
    if (!((life5_9 != 0))) {
        forwardValue5099_87_0 = spill5099_2;
        forwardValue5099_87_1 = spill5099_3;
        break forward_join_87;
    }
    forwardValue5099_75_0 = recovery.source.CarrierOps.dcmpg(((double)(spill5099_2)), ((double)(spill5099_3)));
    }
    if (!((forwardValue5099_75_0 < 0))) {
        break forward_join_84;
    }
    this.aR = ((double)(0x0.0p0d));
    this.aS = ((double)(0x0.0p0d));
    if (!((life5_9 == 0))) {
        break forward_join_101;
    }
    }
    forwardValue5099_87_0 = life6_21;
    forwardValue5099_87_1 = ((net.minecraft.entity.item.EntityMinecartFurnace)(this)).f__sourceReturn_fedcb3e4d3();
    }
    life8_106 = (forwardValue5099_87_0 / forwardValue5099_87_1);
    net.minecraft.entity.item.EntityMinecartFurnace __stackOp5099_28_0 = this;
    ((net.minecraft.entity.item.EntityMinecartFurnace)(__stackOp5099_28_0)).aR = ((double)((((net.minecraft.entity.item.EntityMinecartFurnace)(__stackOp5099_28_0)).aR * life8_106)));
    net.minecraft.entity.item.EntityMinecartFurnace __stackOp5099_31_0 = this;
    ((net.minecraft.entity.item.EntityMinecartFurnace)(__stackOp5099_31_0)).aS = ((double)((((net.minecraft.entity.item.EntityMinecartFurnace)(__stackOp5099_31_0)).aS * life8_106)));
    }
    return;
}


public void a__sourceReturn_7889e8f768(net.minecraft.util.DamageSource p0) {
int forwardValue5100_21_0;
    net.minecraft.entity.item.EntityMinecartFurnace forwardValue5100_23_0;
    int spill5100_0;
    boolean spill5100_1;
    net.minecraft.entity.item.EntityMinecartFurnace spill5100_2;
    long life2_3;
    int life4_8;
    forward_join_31: {
    forward_join_23: {
    forward_join_21: {
    life2_3 = (net.minecraft.entity.item.EntityMinecartFurnace.bb ^ 81228101984633L);
    spill5100_0 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.b();
    super.a__sourceReturn_7889e8f768(((net.minecraft.util.DamageSource)(p0)));
    life4_8 = spill5100_0;
    spill5100_1 = ((net.minecraft.util.DamageSource)(p0)).b__Boolean();
    if (!((life4_8 != 0))) {
        forwardValue5100_21_0 = ((spill5100_1) ? 1 : 0);
        break forward_join_21;
    }
    if (!((!spill5100_1))) {
        break forward_join_31;
    }
    spill5100_2 = this;
    if (!((life4_8 != 0))) {
        forwardValue5100_23_0 = spill5100_2;
        break forward_join_23;
    }
    forwardValue5100_21_0 = ((((net.minecraft.world.GameRules)(((net.minecraft.world.World)(((net.minecraft.entity.item.EntityMinecartFurnace)(spill5100_2)).i)).a__Ej())).a__Boolean(((java.lang.String)("doEntityDrops")))) ? 1 : 0);
    }
    if (!((forwardValue5100_21_0 != 0))) {
        break forward_join_31;
    }
    forwardValue5100_23_0 = this;
    }
    ((net.minecraft.entity.item.EntityMinecartFurnace)(forwardValue5100_23_0)).a(((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.al, 1))), ((float)(0x0.0p0f)));
    }
    return;
}


public void g__Void() {
int forwardValue5103_23_0;
    net.minecraft.entity.item.EntityMinecartFurnace forwardValue5103_31_0;
    net.minecraft.entity.item.EntityMinecartFurnace forwardValue5103_37_0;
    int forwardValue5103_37_1;
    net.minecraft.entity.item.EntityMinecartFurnace forwardValue5103_38_0;
    net.minecraft.entity.item.EntityMinecartFurnace forwardValue5103_39_0;
    int forwardValue5103_39_1;
    int forwardValue5103_51_0;
    net.minecraft.entity.item.EntityMinecartFurnace forwardValue5103_53_0;
    int spill5103_0;
    int spill5103_1;
    net.minecraft.entity.item.EntityMinecartFurnace spill5103_2;
    net.minecraft.entity.item.EntityMinecartFurnace spill5103_3;
    double spill5103_4;
    int spill5103_5;
    boolean spill5103_6;
    net.minecraft.entity.item.EntityMinecartFurnace spill5103_7;
    long life1_3;
    int life3_7;
    forward_join_69: {
    forward_join_53: {
    forward_join_51: {
    forward_join_39: {
    forward_join_38: {
    forward_join_37: {
    forward_join_31: {
    forward_join_30: {
    forward_join_23: {
    forward_join_19: {
    life1_3 = (net.minecraft.entity.item.EntityMinecartFurnace.bb ^ 131773636688822L);
    spill5103_0 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.b();
    super.g__Void();
    life3_7 = spill5103_0;
    spill5103_1 = this.aQ;
    if (!((life3_7 != 0))) {
        forwardValue5103_23_0 = spill5103_1;
        break forward_join_23;
    }
    if (!((spill5103_1 > 0))) {
        break forward_join_19;
    }
    net.minecraft.entity.item.EntityMinecartFurnace __stackOp5103_4_0 = this;
    ((net.minecraft.entity.item.EntityMinecartFurnace)(__stackOp5103_4_0)).aQ = ((int)((((net.minecraft.entity.item.EntityMinecartFurnace)(__stackOp5103_4_0)).aQ - 1)));
    }
    spill5103_2 = this;
    if (!((life3_7 != 0))) {
        forwardValue5103_31_0 = spill5103_2;
        break forward_join_31;
    }
    forwardValue5103_23_0 = ((net.minecraft.entity.item.EntityMinecartFurnace)(spill5103_2)).aQ;
    }
    if (!((forwardValue5103_23_0 <= 0))) {
        break forward_join_30;
    }
    spill5103_3 = this;
    net.minecraft.entity.item.EntityMinecartFurnace __stackOp5103_8_0 = this;
    double __stackOp5103_8_1 = 0x0.0p0d;
    spill5103_4 = __stackOp5103_8_1;
    ((net.minecraft.entity.item.EntityMinecartFurnace)(__stackOp5103_8_0)).aS = ((double)(__stackOp5103_8_1));
    ((net.minecraft.entity.item.EntityMinecartFurnace)(spill5103_3)).aR = ((double)(spill5103_4));
    }
    forwardValue5103_31_0 = this;
    }
    spill5103_5 = this.aQ;
    if (!((life3_7 != 0))) {
        forwardValue5103_37_0 = forwardValue5103_31_0;
        forwardValue5103_37_1 = spill5103_5;
        break forward_join_37;
    }
    if (!((spill5103_5 > 0))) {
        forwardValue5103_38_0 = forwardValue5103_31_0;
        break forward_join_38;
    }
    forwardValue5103_37_0 = forwardValue5103_31_0;
    forwardValue5103_37_1 = 1;
    }
    forwardValue5103_39_0 = forwardValue5103_37_0;
    forwardValue5103_39_1 = forwardValue5103_37_1;
    break forward_join_39;
    }
    forwardValue5103_39_0 = forwardValue5103_38_0;
    forwardValue5103_39_1 = 0;
    }
    ((net.minecraft.entity.item.EntityMinecartFurnace)(forwardValue5103_39_0)).i(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue5103_39_1))));
    spill5103_6 = ((net.minecraft.entity.item.EntityMinecartFurnace)(this)).b__Boolean();
    if (!((life3_7 != 0))) {
        forwardValue5103_51_0 = ((spill5103_6) ? 1 : 0);
        break forward_join_51;
    }
    if (!(spill5103_6)) {
        break forward_join_69;
    }
    spill5103_7 = this;
    if (!((life3_7 != 0))) {
        forwardValue5103_53_0 = spill5103_7;
        break forward_join_53;
    }
    forwardValue5103_51_0 = ((java.util.Random)(((net.minecraft.entity.item.EntityMinecartFurnace)(spill5103_7)).ah)).nextInt(((int)(4)));
    }
    if (!((forwardValue5103_51_0 == 0))) {
        break forward_join_69;
    }
    forwardValue5103_53_0 = this;
    }
    ((net.minecraft.world.World)(((net.minecraft.entity.item.EntityMinecartFurnace)(forwardValue5103_53_0)).i)).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.SMOKE_LARGE)), ((double)(((net.minecraft.entity.item.EntityMinecartFurnace)(this)).n)), ((double)((((net.minecraft.entity.item.EntityMinecartFurnace)(this)).o + 0x1.999999999999ap-1d))), ((double)(((net.minecraft.entity.item.EntityMinecartFurnace)(this)).p)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((int[])(new int[0])));
    }
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_74e88f4b4822_invokedynamic5101_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f3b5a13f4a2d_invokedynamic5102_19(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral11402_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a91ecd6db48f_originalDynamicSite1928_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_609c553b21ef_invokedynamic5745_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_609c553b21ef_invokedynamic5745_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_609c553b21ef_invokedynamic5745_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_609c553b21ef_invokedynamic5745_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_609c553b21ef_invokedynamic5745_14(int a0, long a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
