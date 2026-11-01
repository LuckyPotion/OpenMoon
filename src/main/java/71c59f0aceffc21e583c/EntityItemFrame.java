package net.minecraft.entity.item;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class EntityItemFrame extends net.minecraft.entity.EntityHanging {

private float aH;

private static final long cb;

private static final long[] hb;

private static final java.lang.Integer[] ib;

private static final java.util.Map jb;

public EntityItemFrame(net.minecraft.world.World p0) {
super(p0);
    this.aH = 0x1.0000000000000p+0f;
}


public EntityItemFrame(net.minecraft.world.World p0, moom.DT p1, moom.bs p2) {
super(p0, p1);
    this.aH = 0x1.0000000000000p+0f;
    (this).a(p2);
}


static {
cb = ((long)(((moom._a)(moom._c.a(((long)(7676489264866975414L)), ((long)(8841877915786797020L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(30780392286679L)))));
    jb = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (net.minecraft.entity.item.EntityItemFrame.cb ^ 12416580275821L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1862_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1862_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1862_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1862_14 = new byte[8];
    (__sourceSpill1862_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1862_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1862_16 = __sourceSpill1862_14;
    ((javax.crypto.Cipher)(__sourceSpill1862_11)).init(((int)(__sourceSpill1862_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1862_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1862_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[7];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "4YKÓH×Hî¦sý4íAvûc<lKÙ\r\007Ñ¼Û\017\177\0025²\035~fü=å"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1862_25 = local6_life21;
        int __sourceSpill1862_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1862_25)).substring(((int)(__sourceSpill1862_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1862_30 = local8_life19;
        int __sourceSpill1862_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1862_33 = new byte[8];
        (__sourceSpill1862_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1862_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1862_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1862_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1862_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1862_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1862_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1862_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1862_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1862_34)).doFinal(((byte[])(__sourceSpill1862_33)));
        (__sourceSpill1862_30)[__sourceSpill1862_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "?Ã\007CEq}N÷?\037c\004"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1862_38 = local6_life21;
        int __sourceSpill1862_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1862_38)).substring(((int)(__sourceSpill1862_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1862_43 = local8_life19;
        int __sourceSpill1862_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1862_46 = new byte[8];
        (__sourceSpill1862_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1862_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1862_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1862_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1862_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1862_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1862_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1862_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1862_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1862_47)).doFinal(((byte[])(__sourceSpill1862_46)));
        (__sourceSpill1862_43)[__sourceSpill1862_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    hb = ((long[])(local8_life19));
    ib = ((java.lang.Integer[])(new java.lang.Integer[7]));
}


public boolean b__Boolean(net.minecraft.entity.player.EntityPlayer p0) {
int forwardValue5076_28_0;
    int forwardValue5076_38_0;
    net.minecraft.entity.item.EntityItemFrame forwardValue5076_49_0;
    int forwardValue5076_61_0;
    net.minecraft.entity.item.EntityItemFrame spill5076_0;
    boolean spill5076_1;
    int spill5076_2;
    boolean spill5076_3;
    long life2_3;
    int life4_5;
    net.minecraft.item.ItemStack life5_16;
    forward_join_61: {
    forward_join_60: {
    forward_join_49: {
    forward_join_48: {
    forward_join_46: {
    forward_join_38: {
    forward_join_28: {
    life2_3 = (net.minecraft.entity.item.EntityItemFrame.cb ^ 81246917817518L);
    life4_5 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.c();
    spill5076_0 = this;
    if (!((life4_5 == 0))) {
        forwardValue5076_49_0 = spill5076_0;
        break forward_join_49;
    }
    if (!((((net.minecraft.entity.item.EntityItemFrame)(spill5076_0)).a__xW() == null))) {
        break forward_join_48;
    }
    life5_16 = ((net.minecraft.entity.player.EntityPlayer)(p0)).a__xW();
    if (!((life5_16 != null))) {
        break forward_join_46;
    }
    spill5076_1 = ((net.minecraft.world.World)(this.i)).G;
    if (!((life4_5 == 0))) {
        forwardValue5076_28_0 = ((spill5076_1) ? 1 : 0);
        break forward_join_28;
    }
    if (!((!spill5076_1))) {
        break forward_join_46;
    }
    ((net.minecraft.entity.item.EntityItemFrame)(this)).b(((net.minecraft.item.ItemStack)(life5_16)));
    forwardValue5076_28_0 = ((((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.entity.player.EntityPlayer)(p0)).b1)).d) ? 1 : 0);
    }
    if (!((life4_5 == 0))) {
        forwardValue5076_38_0 = forwardValue5076_28_0;
        break forward_join_38;
    }
    if (!((forwardValue5076_28_0 == 0))) {
        break forward_join_46;
    }
    net.minecraft.item.ItemStack __stackOp5076_11_0 = life5_16;
    net.minecraft.item.ItemStack __stackOp5076_13_0 = __stackOp5076_11_0;
    int __stackOp5076_13_1 = (((net.minecraft.item.ItemStack)(__stackOp5076_11_0)).b - 1);
    spill5076_2 = __stackOp5076_13_1;
    ((net.minecraft.item.ItemStack)(__stackOp5076_13_0)).b = ((int)(__stackOp5076_13_1));
    forwardValue5076_38_0 = spill5076_2;
    }
    if (!((forwardValue5076_38_0 <= 0))) {
        break forward_join_46;
    }
    ((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.entity.player.EntityPlayer)(p0)).bD)).a__Void(((int)(((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.entity.player.EntityPlayer)(p0)).bD)).c)), ((net.minecraft.item.ItemStack)(null)));
    }
    if (!((life4_5 != 0))) {
        break forward_join_60;
    }
    }
    forwardValue5076_49_0 = this;
    }
    spill5076_3 = ((net.minecraft.world.World)(((net.minecraft.entity.item.EntityItemFrame)(forwardValue5076_49_0)).i)).G;
    if (!((life4_5 == 0))) {
        forwardValue5076_61_0 = ((spill5076_3) ? 1 : 0);
        break forward_join_61;
    }
    if (!((!spill5076_3))) {
        break forward_join_60;
    }
    ((net.minecraft.entity.item.EntityItemFrame)(this)).g(((int)((((net.minecraft.entity.item.EntityItemFrame)(this)).c__Int() + 1))));
    }
    forwardValue5076_61_0 = 1;
    }
    return ((forwardValue5076_61_0) != 0);
}


public int b__sourceReturn_8abf5c6871() {
long local1 = (net.minecraft.entity.item.EntityItemFrame.cb ^ 64758975847002L);
    return __sourceIntrinsic_e1958f95391c_originalDynamicSite1910_1(14173, (4749977528604964063L ^ local1));
}


private void b(int p0, boolean p1) {
net.minecraft.entity.item.EntityItemFrame forwardValue5075_28_0;
    net.minecraft.entity.item.EntityItemFrame forwardValue5075_33_0;
    net.minecraft.entity.item.EntityItemFrame spill5075_0;
    long life3_3;
    int life5_5;
    forward_join_38: {
    forward_join_33: {
    forward_join_28: {
    life3_3 = (net.minecraft.entity.item.EntityItemFrame.cb ^ 97601314378187L);
    life5_5 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.b();
    spill5075_0 = this;
    if (!((life5_5 != 0))) {
        forwardValue5075_28_0 = spill5075_0;
        break forward_join_28;
    }
    ((net.minecraft.entity.DataWatcher)(((net.minecraft.entity.item.EntityItemFrame)(spill5075_0)).a__r1())).b(((int)(__sourceIntrinsic_7cf220b54d33_invokedynamic5075_3(24143, (4313151279097534040L ^ life3_3)))), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(((byte) (p0 % __sourceIntrinsic_7cf220b54d33_invokedynamic5075_4(7433, (8562696387281687839L ^ life3_3))))))))));
    if (!(p1)) {
        break forward_join_38;
    }
    forwardValue5075_28_0 = this;
    }
    if (!((life5_5 != 0))) {
        forwardValue5075_33_0 = forwardValue5075_28_0;
        break forward_join_33;
    }
    if (!((((net.minecraft.entity.item.EntityItemFrame)(forwardValue5075_28_0)).aF != null))) {
        break forward_join_38;
    }
    forwardValue5075_33_0 = this;
    }
    ((net.minecraft.world.World)(((net.minecraft.entity.item.EntityItemFrame)(forwardValue5075_33_0)).i)).d(((moom.DT)(this.aF)), ((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)));
    }
    return;
}


public void b(net.minecraft.item.ItemStack p0) {
((net.minecraft.entity.item.EntityItemFrame)(this)).a(((net.minecraft.item.ItemStack)(p0)), ((boolean)(true)));
    return;
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public int c__Int() {
long local1 = (net.minecraft.entity.item.EntityItemFrame.cb ^ 4476826338982L);
    return ((net.minecraft.entity.DataWatcher)(((net.minecraft.entity.item.EntityItemFrame)(this)).a__r1())).a(((int)(__sourceIntrinsic_240e736e888e_originalDynamicSite1911_2(7638, (4192213345942471342L ^ local1)))));
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral11366_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/sE"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.entity.item.EntityItemFrame.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int c(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 7061;
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
         long var5 = hb[var3];
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
            throw new RuntimeException("moom/sE", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         ib[var3] = var15;
      }

      return ib[var3];
}


public void c(net.minecraft.nbt.NBTTagCompound p0) {
int forwardValue5077_38_0;
    int forwardValue5077_49_0;
    int spill5077_0;
    boolean spill5077_1;
    long life2_3;
    net.minecraft.nbt.NBTTagCompound life5_8;
    int life4_9;
    forward_join_60: {
    forward_join_57: {
    forward_join_49: {
    forward_join_46: {
    forward_join_38: {
    life2_3 = (net.minecraft.entity.item.EntityItemFrame.cb ^ 63576669371606L);
    spill5077_0 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.b();
    life5_8 = ((net.minecraft.nbt.NBTTagCompound)(p0)).a__yw(((java.lang.String)("Item")));
    life4_9 = spill5077_0;
    if (!((life4_9 != 0))) {
        break forward_join_60;
    }
    if (!((life5_8 != null))) {
        break forward_join_57;
    }
    spill5077_1 = ((net.minecraft.nbt.NBTTagCompound)(life5_8)).a__Boolean();
    if (!((life4_9 != 0))) {
        forwardValue5077_38_0 = ((spill5077_1) ? 1 : 0);
        break forward_join_38;
    }
    if (!((!spill5077_1))) {
        break forward_join_57;
    }
    ((net.minecraft.entity.item.EntityItemFrame)(this)).a(((net.minecraft.item.ItemStack)(net.minecraft.item.ItemStack.a(((net.minecraft.nbt.NBTTagCompound)(life5_8))))), ((boolean)(false)));
    ((net.minecraft.entity.item.EntityItemFrame)(this)).b(((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).b__sourceReturn_d4c7a9581c(((java.lang.String)("ItemRotation"))))), ((boolean)(false)));
    forwardValue5077_38_0 = ((((net.minecraft.nbt.NBTTagCompound)(p0)).a__Boolean(((java.lang.String)("ItemDropChance")), ((int)(__sourceIntrinsic_01f4e1cd062e_invokedynamic5077_9(12231, (7409698709132430026L ^ life2_3)))))) ? 1 : 0);
    }
    if (!((life4_9 != 0))) {
        forwardValue5077_49_0 = forwardValue5077_38_0;
        break forward_join_49;
    }
    if (!((forwardValue5077_38_0 != 0))) {
        break forward_join_46;
    }
    this.aH = ((float)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Float(((java.lang.String)("ItemDropChance")))));
    }
    forwardValue5077_49_0 = ((((net.minecraft.nbt.NBTTagCompound)(p0)).a__Boolean(((java.lang.String)("Direction")))) ? 1 : 0);
    }
    if (!((forwardValue5077_49_0 != 0))) {
        break forward_join_57;
    }
    ((net.minecraft.entity.item.EntityItemFrame)(this)).b(((int)((((net.minecraft.entity.item.EntityItemFrame)(this)).c__Int() * 2))), ((boolean)(false)));
    }
    super.c(((net.minecraft.nbt.NBTTagCompound)(p0)));
    }
    return;
}


public float c() {
return 0x0.0p0f;
}


public void f(net.minecraft.entity.Entity p0) {
((net.minecraft.entity.item.EntityItemFrame)(this)).a(((net.minecraft.entity.Entity)(p0)), ((boolean)(true)));
    return;
}


public int d__sourceReturn_8abf5c6871() {
net.minecraft.entity.item.EntityItemFrame forwardValue5078_14_0;
    int forwardValue5078_23_0;
    net.minecraft.entity.item.EntityItemFrame spill5078_0;
    long life1_3;
    int life3_5;
    forward_join_23: {
    forward_join_14: {
    forward_join_13: {
    life1_3 = (net.minecraft.entity.item.EntityItemFrame.cb ^ 95793558480895L);
    life3_5 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.b();
    spill5078_0 = this;
    if (!((life3_5 != 0))) {
        forwardValue5078_14_0 = spill5078_0;
        break forward_join_14;
    }
    if (!((((net.minecraft.entity.item.EntityItemFrame)(spill5078_0)).a__xW() == null))) {
        break forward_join_13;
    }
    forwardValue5078_23_0 = 0;
    break forward_join_23;
    }
    forwardValue5078_14_0 = this;
    }
    forwardValue5078_23_0 = ((((net.minecraft.entity.item.EntityItemFrame)(forwardValue5078_14_0)).c__Int() % __sourceIntrinsic_e0f64934fe3a_invokedynamic5078_4(7433, (8562681154012455723L ^ life1_3))) + 1);
    }
    return forwardValue5078_23_0;
}


public void d(net.minecraft.nbt.NBTTagCompound p0) {
net.minecraft.entity.item.EntityItemFrame forwardValue5079_32_0;
    net.minecraft.entity.item.EntityItemFrame spill5079_0;
    long life2_3;
    int life4_5;
    forward_join_32: {
    forward_join_31: {
    life2_3 = (net.minecraft.entity.item.EntityItemFrame.cb ^ 5181452593117L);
    life4_5 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.b();
    spill5079_0 = this;
    if (!((life4_5 != 0))) {
        forwardValue5079_32_0 = spill5079_0;
        break forward_join_32;
    }
    if (!((((net.minecraft.entity.item.EntityItemFrame)(spill5079_0)).a__xW() != null))) {
        break forward_join_31;
    }
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("Item")), ((net.minecraft.nbt.NBTBase)(((net.minecraft.item.ItemStack)(((net.minecraft.entity.item.EntityItemFrame)(this)).a__xW())).a__yw(((net.minecraft.nbt.NBTTagCompound)(new net.minecraft.nbt.NBTTagCompound()))))));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("ItemRotation")), ((byte)(((byte) ((net.minecraft.entity.item.EntityItemFrame)(this)).c__Int()))));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("ItemDropChance")), ((float)(this.aH)));
    }
    forwardValue5079_32_0 = this;
    }
    __sourceIntrinsic_458405b53cd1_call5079_10(forwardValue5079_32_0, p0);
    return;
}


protected void d__Void() {
long local1 = (net.minecraft.entity.item.EntityItemFrame.cb ^ 85596458369157L);
    ((net.minecraft.entity.DataWatcher)(((net.minecraft.entity.item.EntityItemFrame)(this)).a__r1())).a(((int)(__sourceIntrinsic_a91ecd6db48f_originalDynamicSite1912_2(7433, (8562710558109893713L ^ local1)))), ((int)(5)));
    ((net.minecraft.entity.DataWatcher)(((net.minecraft.entity.item.EntityItemFrame)(this)).a__r1())).a(((int)(__sourceIntrinsic_a91ecd6db48f_originalDynamicSite1912_5(24143, (4313165457184245526L ^ local1)))), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(0))))));
    return;
}


public int a() {
long local1 = (net.minecraft.entity.item.EntityItemFrame.cb ^ 113364526504205L);
    return __sourceIntrinsic_8aebf151eadb_originalDynamicSite1913_1(7077, (5123452861283916658L ^ local1));
}


private void a(net.minecraft.item.ItemStack p0, boolean p1) {
net.minecraft.entity.item.EntityItemFrame forwardValue5073_41_0;
    net.minecraft.entity.item.EntityItemFrame forwardValue5073_46_0;
    net.minecraft.entity.item.EntityItemFrame spill5073_0;
    long life3_3;
    int life5_5;
    forward_join_51: {
    forward_join_46: {
    forward_join_41: {
    forward_join_38: {
    forward_join_19: {
    life3_3 = (net.minecraft.entity.item.EntityItemFrame.cb ^ 128968245572285L);
    life5_5 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.b();
    if (!((life5_5 != 0))) {
        break forward_join_38;
    }
    if (!((p0 != null))) {
        break forward_join_19;
    }
    p0 = ((net.minecraft.item.ItemStack)(p0)).a__xW();
    ((net.minecraft.item.ItemStack)(p0)).b = ((int)(1));
    ((net.minecraft.item.ItemStack)(p0)).a(((net.minecraft.entity.item.EntityItemFrame)(this)));
    }
    ((net.minecraft.entity.DataWatcher)(((net.minecraft.entity.item.EntityItemFrame)(this)).a__r1())).b(((int)(__sourceIntrinsic_4e1d47afaa97_invokedynamic5073_6(7433, (8562718862027044457L ^ life3_3)))), ((java.lang.Object)(p0)));
    spill5073_0 = this;
    if (!((life5_5 != 0))) {
        forwardValue5073_41_0 = spill5073_0;
        break forward_join_41;
    }
    ((net.minecraft.entity.DataWatcher)(((net.minecraft.entity.item.EntityItemFrame)(spill5073_0)).a__r1())).a__Void(((int)(__sourceIntrinsic_4e1d47afaa97_invokedynamic5073_9(7433, (8562718862027044457L ^ life3_3)))));
    }
    if (!(p1)) {
        break forward_join_51;
    }
    forwardValue5073_41_0 = this;
    }
    if (!((life5_5 != 0))) {
        forwardValue5073_46_0 = forwardValue5073_41_0;
        break forward_join_46;
    }
    if (!((((net.minecraft.entity.item.EntityItemFrame)(forwardValue5073_41_0)).aF != null))) {
        break forward_join_51;
    }
    forwardValue5073_46_0 = this;
    }
    ((net.minecraft.world.World)(((net.minecraft.entity.item.EntityItemFrame)(forwardValue5073_46_0)).i)).d(((moom.DT)(this.aF)), ((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)));
    }
    return;
}


public boolean a__Boolean(net.minecraft.util.DamageSource p0, float p1) {
int forwardValue5074_16_0;
    int forwardValue5074_39_0;
    net.minecraft.entity.item.EntityItemFrame forwardValue5074_41_0;
    int forwardValue5074_44_0;
    boolean spill5074_0;
    net.minecraft.entity.item.EntityItemFrame spill5074_1;
    boolean spill5074_2;
    long life3_3;
    int life5_5;
    forward_join_44: {
    forward_join_41: {
    forward_join_40: {
    forward_join_39: {
    forward_join_38: {
    forward_join_16: {
    forward_join_14: {
    life3_3 = (net.minecraft.entity.item.EntityItemFrame.cb ^ 103469651967060L);
    life5_5 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.c();
    spill5074_0 = ((net.minecraft.entity.item.EntityItemFrame)(this)).a(((net.minecraft.util.DamageSource)(p0)));
    if (!((life5_5 == 0))) {
        forwardValue5074_16_0 = ((spill5074_0) ? 1 : 0);
        break forward_join_16;
    }
    if (!(spill5074_0)) {
        break forward_join_14;
    }
    return ((0) != 0);
    }
    forwardValue5074_16_0 = ((((net.minecraft.util.DamageSource)(p0)).b__Boolean()) ? 1 : 0);
    }
    if (!((life5_5 == 0))) {
        forwardValue5074_44_0 = forwardValue5074_16_0;
        break forward_join_44;
    }
    if (!((forwardValue5074_16_0 == 0))) {
        break forward_join_40;
    }
    spill5074_1 = this;
    if (!((life5_5 == 0))) {
        forwardValue5074_41_0 = spill5074_1;
        break forward_join_41;
    }
    if (!((((net.minecraft.entity.item.EntityItemFrame)(spill5074_1)).a__xW() != null))) {
        break forward_join_40;
    }
    spill5074_2 = ((net.minecraft.world.World)(this.i)).G;
    if (!((life5_5 == 0))) {
        forwardValue5074_39_0 = ((spill5074_2) ? 1 : 0);
        break forward_join_39;
    }
    if (!((!spill5074_2))) {
        break forward_join_38;
    }
    ((net.minecraft.entity.item.EntityItemFrame)(this)).a(((net.minecraft.entity.Entity)(((net.minecraft.util.DamageSource)(p0)).b__r3())), ((boolean)(false)));
    ((net.minecraft.entity.item.EntityItemFrame)(this)).b(((net.minecraft.item.ItemStack)(null)));
    }
    forwardValue5074_39_0 = 1;
    }
    return ((forwardValue5074_39_0) != 0);
    }
    forwardValue5074_41_0 = this;
    }
    forwardValue5074_44_0 = ((__sourceIntrinsic_153a193fc182_call5074_15(forwardValue5074_41_0, p0, p1)) ? 1 : 0);
    }
    return ((forwardValue5074_44_0) != 0);
}


private void a(net.minecraft.item.ItemStack p0) {
net.minecraft.item.ItemStack forwardValue5072_11_0;
    net.minecraft.item.ItemStack forwardValue5072_32_0;
    net.minecraft.item.ItemStack spill5072_0;
    long life2_3;
    int life4_5;
    net.minecraft.world.storage.MapData life5_29;
    forward_join_34: {
    forward_join_32: {
    forward_join_31: {
    forward_join_11: {
    life2_3 = (net.minecraft.entity.item.EntityItemFrame.cb ^ 106996157999042L);
    life4_5 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.c();
    spill5072_0 = p0;
    if (!((life4_5 == 0))) {
        forwardValue5072_11_0 = spill5072_0;
        break forward_join_11;
    }
    if (!((spill5072_0 != null))) {
        break forward_join_34;
    }
    forwardValue5072_11_0 = p0;
    }
    if (!((life4_5 == 0))) {
        forwardValue5072_32_0 = forwardValue5072_11_0;
        break forward_join_32;
    }
    if (!((((net.minecraft.item.ItemStack)(forwardValue5072_11_0)).a__wQ() == net.minecraft.init.Items.a3))) {
        break forward_join_31;
    }
    life5_29 = ((moom.xA)(((moom.xA)(((net.minecraft.item.ItemStack)(p0)).a__wQ())))).a(((net.minecraft.item.ItemStack)(p0)), ((net.minecraft.world.World)(this.i)));
    ((java.util.Map)(((net.minecraft.world.storage.MapData)(life5_29)).j)).remove(((java.lang.Object)(__sourceIntrinsic_5f56e65a234d_invokedynamic5072_10(((net.minecraft.entity.item.EntityItemFrame)(this)).e__Int()))));
    }
    forwardValue5072_32_0 = p0;
    }
    ((net.minecraft.item.ItemStack)(forwardValue5072_32_0)).a(((net.minecraft.entity.item.EntityItemFrame)(null)));
    }
    return;
}


public net.minecraft.item.ItemStack a__xW() {
long local1 = (net.minecraft.entity.item.EntityItemFrame.cb ^ 103692519031406L);
    return ((net.minecraft.entity.DataWatcher)(((net.minecraft.entity.item.EntityItemFrame)(this)).a__r1())).a__xW(((int)(__sourceIntrinsic_e82a5b067497_originalDynamicSite1914_2(14889, (1575214744850833816L ^ local1)))));
}


public void a(net.minecraft.entity.Entity p0, boolean p1) {
net.minecraft.entity.item.EntityItemFrame forwardValue5071_15_0;
    int forwardValue5071_36_0;
    net.minecraft.entity.item.EntityItemFrame forwardValue5071_63_0;
    net.minecraft.entity.item.EntityItemFrame spill5071_0;
    int spill5071_1;
    boolean spill5071_2;
    net.minecraft.entity.item.EntityItemFrame spill5071_3;
    long life3_3;
    int life5_5;
    net.minecraft.item.ItemStack life6_22;
    net.minecraft.entity.player.EntityPlayer life7_33;
    forward_join_67: {
    forward_join_63: {
    forward_join_45: {
    forward_join_36: {
    forward_join_35: {
    forward_join_15: {
    life3_3 = (net.minecraft.entity.item.EntityItemFrame.cb ^ 38683641216289L);
    life5_5 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.c();
    spill5071_0 = this;
    if (!((life5_5 == 0))) {
        forwardValue5071_15_0 = spill5071_0;
        break forward_join_15;
    }
    if (!(((net.minecraft.world.GameRules)(((net.minecraft.world.World)(((net.minecraft.entity.item.EntityItemFrame)(spill5071_0)).i)).a__Ej())).a__Boolean(((java.lang.String)("doEntityDrops"))))) {
        break forward_join_67;
    }
    forwardValue5071_15_0 = this;
    }
    life6_22 = ((net.minecraft.entity.item.EntityItemFrame)(forwardValue5071_15_0)).a__xW();
    spill5071_1 = ((p0 instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0);
    if (!((life5_5 == 0))) {
        forwardValue5071_36_0 = spill5071_1;
        break forward_join_36;
    }
    if (!((spill5071_1 != 0))) {
        break forward_join_35;
    }
    life7_33 = ((net.minecraft.entity.player.EntityPlayer)(p0));
    spill5071_2 = ((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.entity.player.EntityPlayer)(life7_33)).b1)).d;
    if (!((life5_5 == 0))) {
        forwardValue5071_36_0 = ((spill5071_2) ? 1 : 0);
        break forward_join_36;
    }
    if (!(spill5071_2)) {
        break forward_join_35;
    }
    ((net.minecraft.entity.item.EntityItemFrame)(this)).a(((net.minecraft.item.ItemStack)(life6_22)));
    return;
    }
    forwardValue5071_36_0 = ((p1) ? 1 : 0);
    }
    if (!((forwardValue5071_36_0 != 0))) {
        break forward_join_45;
    }
    ((net.minecraft.entity.item.EntityItemFrame)(this)).a(((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(net.minecraft.init.Items.bE))), ((float)(0x0.0p0f)));
    }
    if (!((life6_22 != null))) {
        break forward_join_67;
    }
    spill5071_3 = this;
    if (!((life5_5 == 0))) {
        forwardValue5071_63_0 = spill5071_3;
        break forward_join_63;
    }
    if (!((recovery.source.CarrierOps.fcmpg(((float)(((java.util.Random)(((net.minecraft.entity.item.EntityItemFrame)(spill5071_3)).ah)).nextFloat())), ((float)(this.aH))) < 0))) {
        break forward_join_67;
    }
    life6_22 = ((net.minecraft.item.ItemStack)(life6_22)).a__xW();
    ((net.minecraft.entity.item.EntityItemFrame)(this)).a(((net.minecraft.item.ItemStack)(life6_22)));
    forwardValue5071_63_0 = this;
    }
    ((net.minecraft.entity.item.EntityItemFrame)(forwardValue5071_63_0)).a(((net.minecraft.item.ItemStack)(life6_22)), ((float)(0x0.0p0f)));
    }
    return;
}


public boolean a(double p0) {
int forwardValue5070_24_0;
    int forwardValue5070_26_0;
    int spill5070_0;
    int spill5070_1;
    long life3_3;
    double life6_6;
    double life6_13;
    int life5_14;
    forward_join_26: {
    forward_join_25: {
    forward_join_24: {
    life3_3 = (net.minecraft.entity.item.EntityItemFrame.cb ^ 115413769947387L);
    spill5070_0 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.c();
    life6_6 = 0x1.0p4d;
    life6_13 = ((life6_6 * 0x1.0p6d) * this.d);
    life5_14 = spill5070_0;
    spill5070_1 = recovery.source.CarrierOps.dcmpg(((double)(p0)), ((double)((life6_13 * life6_13))));
    if (!((life5_14 == 0))) {
        forwardValue5070_24_0 = spill5070_1;
        break forward_join_24;
    }
    if (!((spill5070_1 < 0))) {
        break forward_join_25;
    }
    forwardValue5070_24_0 = 1;
    }
    forwardValue5070_26_0 = forwardValue5070_24_0;
    break forward_join_26;
    }
    forwardValue5070_26_0 = 0;
    }
    return ((forwardValue5070_26_0) != 0);
}


public void g(int p0) {
((net.minecraft.entity.item.EntityItemFrame)(this)).b(((int)(p0)), ((boolean)(true)));
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_8aebf151eadb_originalDynamicSite1913_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_5f56e65a234d_invokedynamic5072_10(int a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4e1d47afaa97_invokedynamic5073_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4e1d47afaa97_invokedynamic5073_9(int a0, long a1) throws E;

private static native <E extends Throwable> boolean __sourceIntrinsic_153a193fc182_call5074_15(net.minecraft.entity.item.EntityItemFrame a0, net.minecraft.util.DamageSource a1, float a2) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e82a5b067497_originalDynamicSite1914_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e1958f95391c_originalDynamicSite1910_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7cf220b54d33_invokedynamic5075_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7cf220b54d33_invokedynamic5075_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral11366_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01f4e1cd062e_invokedynamic5077_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_240e736e888e_originalDynamicSite1911_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e0f64934fe3a_invokedynamic5078_4(int a0, long a1) throws E;

private static native <E extends Throwable> void __sourceIntrinsic_458405b53cd1_call5079_10(net.minecraft.entity.item.EntityItemFrame a0, net.minecraft.nbt.NBTTagCompound a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a91ecd6db48f_originalDynamicSite1912_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a91ecd6db48f_originalDynamicSite1912_5(int a0, long a1) throws E;
}
