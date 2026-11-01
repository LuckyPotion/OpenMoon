package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public abstract class tE extends net.minecraft.entity.item.EntityMinecart implements net.minecraft.world.ILockableContainer {

private net.minecraft.item.ItemStack[] aQ;

private boolean aR;

private static long db;

private static long[] ib;

private static java.lang.Integer[] jb;

private static java.util.Map kb;

public tE(net.minecraft.world.World p0) { super((net.minecraft.world.World)null); }

private static void __sourceConstructorBody_0fc4993a64e142aa(moom.tE receiver, net.minecraft.world.World p0) throws Throwable {
long local2 = (moom.tE.db ^ 101950624814402L);
    moom.tE.__sourceConstructorInit_0fc4993a64e142aa_0(((moom.tE)(receiver)), ((net.minecraft.world.World)(p0)));
    ((moom.tE)(receiver)).aQ = ((net.minecraft.item.ItemStack[])(new net.minecraft.item.ItemStack[__sourceIntrinsic_0fc4993a64e142aa_originalDynamicSite3341_2(20376, (2437398633065085392L ^ local2))]));
    ((moom.tE)(receiver)).aR = ((boolean)(true));
    return;
}

private static native <E extends Throwable> void __sourceConstructorInit_0fc4993a64e142aa_0(moom.tE a0, net.minecraft.world.World a1) throws E;
private static native <E extends Throwable> void __sourceConstructorInit_cbd2bc23c8937616_0(moom.tE a0, net.minecraft.world.World a1, double a2, double a3, double a4) throws E;

public tE(net.minecraft.world.World p0, double p1, double p2, double p3) { super((net.minecraft.world.World)null, 0.0D, 0.0D, 0.0D); }

private static void __sourceConstructorBody_cbd2bc23c8937616(moom.tE receiver, net.minecraft.world.World p0, double p1, double p2, double p3) throws Throwable {
long local8 = (moom.tE.db ^ 25109241469501L);
    moom.tE.__sourceConstructorInit_cbd2bc23c8937616_0(((moom.tE)(receiver)), ((net.minecraft.world.World)(p0)), ((double)(p1)), ((double)(p2)), ((double)(p3)));
    ((moom.tE)(receiver)).aQ = ((net.minecraft.item.ItemStack[])(new net.minecraft.item.ItemStack[__sourceIntrinsic_cbd2bc23c8937616_originalDynamicSite3342_2(10667, (687399571805360285L ^ local8))]));
    ((moom.tE)(receiver)).aR = ((boolean)(true));
    return;
}


static {
db = ((long)(((moom._a)(moom._c.a(((long)(-4075069682141224301L)), ((long)(-7905806725803192492L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(240491180436491L)))));
    kb = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.tE.db ^ 55475665811425L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1552_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1552_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1552_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1552_14 = new byte[8];
    (__sourceSpill1552_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1552_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1552_16 = __sourceSpill1552_14;
    ((javax.crypto.Cipher)(__sourceSpill1552_11)).init(((int)(__sourceSpill1552_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1552_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1552_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[6];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "79\021\024\004¿+ð8\037Nbc\001\n¤2ÆÄêþ×-$5\f³\027"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1552_25 = local6_life21;
        int __sourceSpill1552_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1552_25)).substring(((int)(__sourceSpill1552_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1552_30 = local8_life19;
        int __sourceSpill1552_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1552_33 = new byte[8];
        (__sourceSpill1552_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1552_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1552_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1552_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1552_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1552_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1552_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1552_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1552_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1552_34)).doFinal(((byte[])(__sourceSpill1552_33)));
        (__sourceSpill1552_30)[__sourceSpill1552_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "nÓ\000ºÖ-?Îi7\"·WÀµ"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1552_38 = local6_life21;
        int __sourceSpill1552_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1552_38)).substring(((int)(__sourceSpill1552_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1552_43 = local8_life19;
        int __sourceSpill1552_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1552_46 = new byte[8];
        (__sourceSpill1552_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1552_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1552_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1552_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1552_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1552_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1552_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1552_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1552_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1552_47)).doFinal(((byte[])(__sourceSpill1552_46)));
        (__sourceSpill1552_43)[__sourceSpill1552_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    ib = ((long[])(local8_life19));
    jb = ((java.lang.Integer[])(new java.lang.Integer[6]));
}


public boolean b__Boolean(net.minecraft.entity.player.EntityPlayer p0) {
int forwardValue4031_16_0;
    boolean spill4031_0;
    long life2_3;
    int life4_5;
    forward_join_16: {
    forward_join_15: {
    life2_3 = (moom.tE.db ^ 125480494862111L);
    life4_5 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.c();
    spill4031_0 = ((net.minecraft.world.World)(this.i)).G;
    if (!((life4_5 == 0))) {
        forwardValue4031_16_0 = ((spill4031_0) ? 1 : 0);
        break forward_join_16;
    }
    if (!((!spill4031_0))) {
        break forward_join_15;
    }
    ((net.minecraft.entity.player.EntityPlayer)(p0)).a(((net.minecraft.inventory.IInventory)(this)));
    }
    forwardValue4031_16_0 = 1;
    }
    return ((forwardValue4031_16_0) != 0);
}


public void b__Void() {
java.util.Arrays.fill(((java.lang.Object[])(this.aQ)), ((java.lang.Object)(null)));
    return;
}


public void b(net.minecraft.entity.player.EntityPlayer p0) {
return;
}


public net.minecraft.item.ItemStack b__xW(int p0) {
net.minecraft.item.ItemStack forwardValue4032_17_0;
    net.minecraft.item.ItemStack spill4032_0;
    long life2_3;
    int life4_5;
    net.minecraft.item.ItemStack life5_23;
    forward_join_25: {
    forward_join_17: {
    life2_3 = (moom.tE.db ^ 68837450753317L);
    life4_5 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.b();
    spill4032_0 = (this.aQ)[p0];
    if (!((life4_5 != 0))) {
        forwardValue4032_17_0 = spill4032_0;
        break forward_join_17;
    }
    if (!((spill4032_0 != null))) {
        break forward_join_25;
    }
    forwardValue4032_17_0 = (this.aQ)[p0];
    }
    life5_23 = forwardValue4032_17_0;
    (this.aQ)[p0] = null;
    return life5_23;
    }
    return null;
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public void e(int p0) {
this.aR = ((boolean)(false));
    super.e(((int)(p0)));
    return;
}


protected void x() {
long local1_life1 = (moom.tE.db ^ 92166580860167L);
    int local3_life4 = (__sourceIntrinsic_1ae1eecf7172_originalDynamicSite941_2(4516, (4862627549816391597L ^ local1_life1)) - __sourceExactCall_c4077a9018116e(((net.minecraft.inventory.IInventory)(this))));
    float local4_life5 = (0x1.f5c29p-1f + (((float) local3_life4) * 0x1.0624dep-10f));
    this.t *= ((double) local4_life5);
    this.u *= 0x0.0p0d;
    this.v *= ((double) local4_life5);
    return;
}


private static int c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_e01a56aae9feee(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral9121_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/tE"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


protected void c(net.minecraft.nbt.NBTTagCompound p0) {
int spill1311_0;
    long life2_3;
    net.minecraft.nbt.NBTTagList life5_15;
    int life6_23;
    int life4_24;
    net.minecraft.nbt.NBTTagCompound life7_32;
    int life8_42;
    lexical_join_61: {
    life2_3 = (moom.tE.db ^ 2379029497703L);
    super.c(((net.minecraft.nbt.NBTTagCompound)(p0)));
    life5_15 = ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("Items")), ((int)(__sourceIntrinsic_01f4e1cd062e_invokedynamic1311_2(1947, (5314438135316227057L ^ life2_3)))));
    this.aQ = ((net.minecraft.item.ItemStack[])(new net.minecraft.item.ItemStack[((moom.tE)(this)).b__Int()]));
    spill1311_0 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.c();
    life6_23 = 0;
    life4_24 = spill1311_0;
    lexical_cycle_25: while (true) {
    lexical_join_59: {
    lexical_join_58: {
    if (!((life6_23 < ((net.minecraft.nbt.NBTTagList)(life5_15)).a__Int()))) {
        break lexical_join_61;
    }
    life7_32 = ((net.minecraft.nbt.NBTTagList)(life5_15)).a__yw(((int)(life6_23)));
    life8_42 = (((net.minecraft.nbt.NBTTagCompound)(life7_32)).b__sourceReturn_d4c7a9581c(((java.lang.String)("Slot"))) & __sourceIntrinsic_01f4e1cd062e_invokedynamic1311_10(14082, (1444130561758663529L ^ life2_3)));
    if (!((life4_24 == 0))) {
        break lexical_join_59;
    }
    if (!((life8_42 >= 0))) {
        break lexical_join_58;
    }
    if (!((life8_42 < (this.aQ).length))) {
        break lexical_join_58;
    }
    (this.aQ)[life8_42] = __sourceExactCall_b20cc06766c170(((net.minecraft.nbt.NBTTagCompound)(life7_32)));
    }
    life6_23 += 1;
    }
    if (!((life4_24 != 0))) { continue lexical_cycle_25; }
    break lexical_cycle_25;
    }
    }
    return;
}


private static int c(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 23284;
      if (jb[var3] == null) {
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
         long var5 = ib[var3];
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
         Object[] var9 = (Object[])kb.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               kb.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/tE", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         jb[var3] = var15;
      }

      return jb[var3];
}


public void c__sourceReturn_aecb585720(net.minecraft.entity.player.EntityPlayer p0) {
return;
}


public int c__Int() {
long local1 = (moom.tE.db ^ 135815733287949L);
    return __sourceIntrinsic_240e736e888e_originalDynamicSite1648_1(29408, (6205898782656237026L ^ local1));
}


public void f__Void() {
moom.tE forwardValue4035_17_0;
    moom.tE spill4035_0;
    long life1_3;
    int life3_5;
    forward_join_17: {
    forward_join_16: {
    life1_3 = (moom.tE.db ^ 28800547777737L);
    life3_5 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.b();
    spill4035_0 = this;
    if (!((life3_5 != 0))) {
        forwardValue4035_17_0 = spill4035_0;
        break forward_join_17;
    }
    if (!(((moom.tE)(spill4035_0)).aR)) {
        break forward_join_16;
    }
    moom.wy.a(((net.minecraft.world.World)(this.i)), ((net.minecraft.entity.Entity)(this)), ((net.minecraft.inventory.IInventory)(this)));
    }
    forwardValue4035_17_0 = this;
    }
    __sourceIntrinsic_93a5090229a0_call4035_5(forwardValue4035_17_0);
    return;
}


public int d__Int() {
return 0;
}


public boolean d__Boolean() {
return ((0) != 0);
}


protected void d(net.minecraft.nbt.NBTTagCompound p0) {
int spill1312_0;
    long life2_3;
    net.minecraft.nbt.NBTTagList life5_11;
    int life6_13;
    int life4_14;
    net.minecraft.nbt.NBTTagCompound life7_33;
    lexical_join_53: {
    lexical_join_49: {
    life2_3 = (moom.tE.db ^ 69600336829548L);
    super.d(((net.minecraft.nbt.NBTTagCompound)(p0)));
    spill1312_0 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.b();
    life5_11 = new net.minecraft.nbt.NBTTagList();
    life6_13 = 0;
    life4_14 = spill1312_0;
    lexical_cycle_15: while (true) {
    lexical_join_46: {
    if (!((life6_13 < (this.aQ).length))) {
        break lexical_join_49;
    }
    if (!((life4_14 != 0))) {
        break lexical_join_53;
    }
    if (!(((this.aQ)[life6_13] != null))) {
        break lexical_join_46;
    }
    life7_33 = new net.minecraft.nbt.NBTTagCompound();
    ((net.minecraft.nbt.NBTTagCompound)(life7_33)).a(((java.lang.String)("Slot")), ((byte)(((byte) life6_13))));
    ((net.minecraft.item.ItemStack)((this.aQ)[life6_13])).a__yw(((net.minecraft.nbt.NBTTagCompound)(life7_33)));
    ((net.minecraft.nbt.NBTTagList)(life5_11)).a(((net.minecraft.nbt.NBTBase)(life7_33)));
    }
    life6_13 += 1;
    if (!((life4_14 == 0))) { continue lexical_cycle_15; }
    break lexical_cycle_15;
    }
    }
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("Items")), ((net.minecraft.nbt.NBTBase)(life5_11)));
    }
    return;
}


public void a__Void() {
return;
}


public void a__Void(int p0, net.minecraft.item.ItemStack p1) {
net.minecraft.item.ItemStack forwardValue4030_16_0;
    net.minecraft.item.ItemStack forwardValue4030_23_0;
    int spill4030_0;
    net.minecraft.item.ItemStack spill4030_1;
    long life3_3;
    int life5_10;
    forward_join_26: {
    forward_join_23: {
    forward_join_16: {
    life3_3 = (moom.tE.db ^ 135778841168990L);
    spill4030_0 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.b();
    (this.aQ)[p0] = p1;
    life5_10 = spill4030_0;
    spill4030_1 = p1;
    if (!((life5_10 != 0))) {
        forwardValue4030_16_0 = spill4030_1;
        break forward_join_16;
    }
    if (!((spill4030_1 != null))) {
        break forward_join_26;
    }
    forwardValue4030_16_0 = p1;
    }
    if (!((life5_10 != 0))) {
        forwardValue4030_23_0 = forwardValue4030_16_0;
        break forward_join_23;
    }
    if (!((((net.minecraft.item.ItemStack)(forwardValue4030_16_0)).b > ((moom.tE)(this)).c__Int()))) {
        break forward_join_26;
    }
    forwardValue4030_23_0 = p1;
    }
    ((net.minecraft.item.ItemStack)(forwardValue4030_23_0)).b = ((int)(((moom.tE)(this)).c__Int()));
    }
    return;
}


public net.minecraft.item.ItemStack a(int p0, int p1) {
net.minecraft.item.ItemStack forwardValue4026_17_0;
    net.minecraft.item.ItemStack forwardValue4026_40_0;
    net.minecraft.item.ItemStack forwardValue4026_55_0;
    net.minecraft.item.ItemStack spill4026_0;
    net.minecraft.item.ItemStack spill4026_1;
    long life3_3;
    int life5_5;
    net.minecraft.item.ItemStack life6_35;
    net.minecraft.item.ItemStack life6_49;
    forward_join_56: {
    forward_join_55: {
    forward_join_54: {
    forward_join_40: {
    forward_join_34: {
    forward_join_17: {
    life3_3 = (moom.tE.db ^ 94716194301037L);
    life5_5 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.c();
    spill4026_0 = (this.aQ)[p0];
    if (!((life5_5 == 0))) {
        forwardValue4026_17_0 = spill4026_0;
        break forward_join_17;
    }
    if (!((spill4026_0 != null))) {
        break forward_join_56;
    }
    forwardValue4026_17_0 = (this.aQ)[p0];
    }
    if (!((life5_5 == 0))) {
        forwardValue4026_40_0 = forwardValue4026_17_0;
        break forward_join_40;
    }
    if (!((((net.minecraft.item.ItemStack)(forwardValue4026_17_0)).b <= p1))) {
        break forward_join_34;
    }
    life6_35 = (this.aQ)[p0];
    (this.aQ)[p0] = null;
    return life6_35;
    }
    forwardValue4026_40_0 = ((net.minecraft.item.ItemStack)((this.aQ)[p0])).a(((int)(p1)));
    }
    life6_49 = forwardValue4026_40_0;
    spill4026_1 = (this.aQ)[p0];
    if (!((life5_5 == 0))) {
        forwardValue4026_55_0 = spill4026_1;
        break forward_join_55;
    }
    if (!((((net.minecraft.item.ItemStack)(spill4026_1)).b == 0))) {
        break forward_join_54;
    }
    (this.aQ)[p0] = null;
    }
    forwardValue4026_55_0 = life6_49;
    }
    return forwardValue4026_55_0;
    }
    return null;
}


public net.minecraft.item.ItemStack a__xW(int p0) {
return (this.aQ)[p0];
}


public void a__sourceReturn_7889e8f768(net.minecraft.util.DamageSource p0) {
net.minecraft.world.World forwardValue4028_19_0;
    int spill4028_0;
    net.minecraft.world.World spill4028_1;
    long life2_3;
    int life4_8;
    forward_join_22: {
    forward_join_19: {
    life2_3 = (moom.tE.db ^ 9767763718876L);
    spill4028_0 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.c();
    super.a__sourceReturn_7889e8f768(((net.minecraft.util.DamageSource)(p0)));
    life4_8 = spill4028_0;
    spill4028_1 = this.i;
    if (!((life4_8 == 0))) {
        forwardValue4028_19_0 = spill4028_1;
        break forward_join_19;
    }
    if (!(((net.minecraft.world.GameRules)(((net.minecraft.world.World)(spill4028_1)).a__Ej())).a__Boolean(((java.lang.String)("doEntityDrops"))))) {
        break forward_join_22;
    }
    forwardValue4028_19_0 = this.i;
    }
    moom.wy.a(((net.minecraft.world.World)(forwardValue4028_19_0)), ((net.minecraft.entity.Entity)(this)), ((net.minecraft.inventory.IInventory)(this)));
    }
    return;
}


public java.lang.String a__String() {
moom.tE forwardValue4029_12_0;
    java.lang.String forwardValue4029_15_0;
    moom.tE spill4029_0;
    long life1_3;
    int life3_5;
    forward_join_15: {
    forward_join_14: {
    forward_join_12: {
    life1_3 = (moom.tE.db ^ 40902706917504L);
    life3_5 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.b();
    spill4029_0 = this;
    if (!((life3_5 != 0))) {
        forwardValue4029_12_0 = spill4029_0;
        break forward_join_12;
    }
    if (!(((moom.tE)(spill4029_0)).e__Boolean())) {
        break forward_join_14;
    }
    forwardValue4029_12_0 = this;
    }
    forwardValue4029_15_0 = ((moom.tE)(forwardValue4029_12_0)).g__String();
    break forward_join_15;
    }
    forwardValue4029_15_0 = "container.minecart";
    }
    return forwardValue4029_15_0;
}


public int a__sourceReturn_0f7a48eca2(int p0) {
return 0;
}


public void a__Void(int p0, int p1) {
return;
}


public boolean a(net.minecraft.entity.player.EntityPlayer p0) {
int forwardValue4027_16_0;
    int forwardValue4027_20_0;
    int forwardValue4027_22_0;
    boolean spill4027_0;
    long life2_3;
    int life4_5;
    forward_join_22: {
    forward_join_21: {
    forward_join_20: {
    forward_join_16: {
    life2_3 = (moom.tE.db ^ 5508189734609L);
    life4_5 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.c();
    spill4027_0 = this.F;
    if (!((life4_5 == 0))) {
        forwardValue4027_16_0 = ((spill4027_0) ? 1 : 0);
        break forward_join_16;
    }
    if (!((!spill4027_0))) {
        break forward_join_21;
    }
    forwardValue4027_16_0 = recovery.source.CarrierOps.dcmpg(((double)(((net.minecraft.entity.player.EntityPlayer)(p0)).a(((net.minecraft.entity.Entity)(this))))), ((double)(0x1.0p6d)));
    }
    if (!((life4_5 == 0))) {
        forwardValue4027_20_0 = forwardValue4027_16_0;
        break forward_join_20;
    }
    if (!((forwardValue4027_16_0 <= 0))) {
        break forward_join_21;
    }
    forwardValue4027_20_0 = 1;
    }
    forwardValue4027_22_0 = forwardValue4027_20_0;
    break forward_join_22;
    }
    forwardValue4027_22_0 = 0;
    }
    return ((forwardValue4027_22_0) != 0);
}


public boolean a__Boolean(int p0, net.minecraft.item.ItemStack p1) {
return ((1) != 0);
}


public void a(moom.Eq p0) {
return;
}


public moom.Eq a__Eq() {
return moom.Eq.a;
}


private static native <E extends Throwable> int __sourceIntrinsic_0fc4993a64e142aa_originalDynamicSite3341_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_cbd2bc23c8937616_originalDynamicSite3342_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1ae1eecf7172_originalDynamicSite941_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral9121_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01f4e1cd062e_invokedynamic1311_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01f4e1cd062e_invokedynamic1311_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_240e736e888e_originalDynamicSite1648_1(int a0, long a1) throws E;

private static native <E extends Throwable> void __sourceIntrinsic_93a5090229a0_call4035_5(moom.tE a0) throws E;

private static native int __sourceExactCall_c4077a9018116e(net.minecraft.inventory.IInventory p0);
private static native int __sourceExactCall_e01a56aae9feee(int p0, long p1);
private static native net.minecraft.item.ItemStack __sourceExactCall_b20cc06766c170(net.minecraft.nbt.NBTTagCompound p0);
}
