package net.minecraft.item;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class ItemArmor extends net.minecraft.item.Item {

private static final int[] n;

public static final java.lang.String[] o;

private static final moom.rx p;

public final int q;

public final int r;

public final int s;

private final net.minecraft.item.ItemArmor$ArmorMaterial t;

private static final long u;

private static final long[] v;

private static final java.lang.Integer[] w;

private static final java.util.Map x;

public ItemArmor(net.minecraft.item.ItemArmor$ArmorMaterial p0, int p1, int p2) {
super();
    this.t = p0;
    this.q = p2;
    this.s = p1;
    this.r = (p0).b(p2);
    (this).c((p0).a(p2));
    this.f = 1;
    (this).a(net.minecraft.creativetab.CreativeTabs.j);
    (moom.c2.T).a(this, net.minecraft.item.ItemArmor.p);
}


static {
u = ((long)(((moom._a)(moom._c.a(((long)(-5011896571889489173L)), ((long)(9136617645471060569L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(221006790367500L)))));
    long local11_life6 = (net.minecraft.item.ItemArmor.u ^ 83741871406480L);
    x = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life9;
    javax.crypto.Cipher __sourceSpill1897_11 = (local0_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1897_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1897_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1897_14 = new byte[8];
    (__sourceSpill1897_14)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local1_life15 = 1;
    while ((local1_life15 < 8)) {
        (__sourceSpill1897_14)[local1_life15] = ((byte) ((int) ((local11_life6 << (local1_life15 * 8)) >>> 56)));
        local1_life15 += 1;
    }
    byte[] __sourcePreallocation1897_16 = __sourceSpill1897_14;
    ((javax.crypto.Cipher)(__sourceSpill1897_11)).init(((int)(__sourceSpill1897_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1897_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1897_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life19 = new long[9];
    int local3_life20 = 0;
    java.lang.String local4_life21;
    int local5_life23 = ((java.lang.String)((local4_life21 = "\031\027PYØ\nõ\nÌ®4üaÏå\nÿåH-\036;H\001ì\036×yé»\026ò\037è\032ÎÉ½~RÿªÏñÜõ¡i"))).length();
    int local2_life24 = 0;
    do {
        java.lang.String __sourceSpill1897_25 = local4_life21;
        int __sourceSpill1897_26 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1897_25)).substring(((int)(__sourceSpill1897_26)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1897_30 = local6_life19;
        int __sourceSpill1897_31 = local3_life20;
        local3_life20 += 1;
        long local8_life32 = (((((((((((long) (local7_life29)[0]) & 255L) << 56) | ((((long) (local7_life29)[1]) & 255L) << 48)) | ((((long) (local7_life29)[2]) & 255L) << 40)) | ((((long) (local7_life29)[3]) & 255L) << 32)) | ((((long) (local7_life29)[4]) & 255L) << 24)) | ((((long) (local7_life29)[5]) & 255L) << 16)) | ((((long) (local7_life29)[6]) & 255L) << 8)) | (((long) (local7_life29)[7]) & 255L));
        byte[] __sourceSpill1897_33 = new byte[8];
        (__sourceSpill1897_33)[0] = ((byte) ((int) (local8_life32 >>> 56)));
        (__sourceSpill1897_33)[1] = ((byte) ((int) (local8_life32 >>> 48)));
        (__sourceSpill1897_33)[2] = ((byte) ((int) (local8_life32 >>> 40)));
        (__sourceSpill1897_33)[3] = ((byte) ((int) (local8_life32 >>> 32)));
        (__sourceSpill1897_33)[4] = ((byte) ((int) (local8_life32 >>> 24)));
        (__sourceSpill1897_33)[5] = ((byte) ((int) (local8_life32 >>> 16)));
        (__sourceSpill1897_33)[6] = ((byte) ((int) (local8_life32 >>> 8)));
        (__sourceSpill1897_33)[7] = ((byte) ((int) local8_life32));
        javax.crypto.Cipher __sourceSpill1897_34 = local0_life9;
        byte[] local10_life36 = ((javax.crypto.Cipher)(__sourceSpill1897_34)).doFinal(((byte[])(__sourceSpill1897_33)));
        (__sourceSpill1897_30)[__sourceSpill1897_31] = (((((((((((long) (local10_life36)[0]) & 255L) << 56) | ((((long) (local10_life36)[1]) & 255L) << 48)) | ((((long) (local10_life36)[2]) & 255L) << 40)) | ((((long) (local10_life36)[3]) & 255L) << 32)) | ((((long) (local10_life36)[4]) & 255L) << 24)) | ((((long) (local10_life36)[5]) & 255L) << 16)) | ((((long) (local10_life36)[6]) & 255L) << 8)) | (((long) (local10_life36)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    local5_life23 = ((java.lang.String)((local4_life21 = "È\021-V(kQú\027Æ2Ç"))).length();
    local2_life24 = 0;
    do {
        java.lang.String __sourceSpill1897_38 = local4_life21;
        int __sourceSpill1897_39 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1897_38)).substring(((int)(__sourceSpill1897_39)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1897_43 = local6_life19;
        int __sourceSpill1897_44 = local3_life20;
        local3_life20 += 1;
        long local8_life45 = (((((((((((long) (local7_life42)[0]) & 255L) << 56) | ((((long) (local7_life42)[1]) & 255L) << 48)) | ((((long) (local7_life42)[2]) & 255L) << 40)) | ((((long) (local7_life42)[3]) & 255L) << 32)) | ((((long) (local7_life42)[4]) & 255L) << 24)) | ((((long) (local7_life42)[5]) & 255L) << 16)) | ((((long) (local7_life42)[6]) & 255L) << 8)) | (((long) (local7_life42)[7]) & 255L));
        byte[] __sourceSpill1897_46 = new byte[8];
        (__sourceSpill1897_46)[0] = ((byte) ((int) (local8_life45 >>> 56)));
        (__sourceSpill1897_46)[1] = ((byte) ((int) (local8_life45 >>> 48)));
        (__sourceSpill1897_46)[2] = ((byte) ((int) (local8_life45 >>> 40)));
        (__sourceSpill1897_46)[3] = ((byte) ((int) (local8_life45 >>> 32)));
        (__sourceSpill1897_46)[4] = ((byte) ((int) (local8_life45 >>> 24)));
        (__sourceSpill1897_46)[5] = ((byte) ((int) (local8_life45 >>> 16)));
        (__sourceSpill1897_46)[6] = ((byte) ((int) (local8_life45 >>> 8)));
        (__sourceSpill1897_46)[7] = ((byte) ((int) local8_life45));
        javax.crypto.Cipher __sourceSpill1897_47 = local0_life9;
        byte[] local10_life49 = ((javax.crypto.Cipher)(__sourceSpill1897_47)).doFinal(((byte[])(__sourceSpill1897_46)));
        (__sourceSpill1897_43)[__sourceSpill1897_44] = (((((((((((long) (local10_life49)[0]) & 255L) << 56) | ((((long) (local10_life49)[1]) & 255L) << 48)) | ((((long) (local10_life49)[2]) & 255L) << 40)) | ((((long) (local10_life49)[3]) & 255L) << 32)) | ((((long) (local10_life49)[4]) & 255L) << 24)) | ((((long) (local10_life49)[5]) & 255L) << 16)) | ((((long) (local10_life49)[6]) & 255L) << 8)) | (((long) (local10_life49)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    v = ((long[])(local6_life19));
    w = ((java.lang.Integer[])(new java.lang.Integer[9]));
    int[] __sourceSpill1897_53 = new int[4];
    (__sourceSpill1897_53)[0] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1897_52(14413, (4656800875571997582L ^ local11_life6));
    (__sourceSpill1897_53)[1] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1897_54(4896, (8456466144376373480L ^ local11_life6));
    (__sourceSpill1897_53)[2] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1897_55(26072, (8399968831574226453L ^ local11_life6));
    (__sourceSpill1897_53)[3] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1897_56(32767, (7922310339219958832L ^ local11_life6));
    n = ((int[])(__sourceSpill1897_53));
    java.lang.String[] __sourceSpill1897_58 = new java.lang.String[4];
    (__sourceSpill1897_58)[0] = "minecraft:items/empty_armor_slot_helmet";
    (__sourceSpill1897_58)[1] = "minecraft:items/empty_armor_slot_chestplate";
    (__sourceSpill1897_58)[2] = "minecraft:items/empty_armor_slot_leggings";
    (__sourceSpill1897_58)[3] = "minecraft:items/empty_armor_slot_boots";
    o = ((java.lang.String[])(__sourceSpill1897_58));
    p = ((moom.rx)(new moom.rv()));
}


public int b(net.minecraft.item.ItemStack p0) {
net.minecraft.nbt.NBTTagCompound forwardValue5469_22_0;
    net.minecraft.nbt.NBTTagCompound forwardValue5469_28_0;
    int forwardValue5469_43_0;
    net.minecraft.nbt.NBTTagCompound spill5469_0;
    net.minecraft.nbt.NBTTagCompound spill5469_1;
    boolean spill5469_2;
    long life2_3;
    int life4_5;
    net.minecraft.nbt.NBTTagCompound life5_16;
    net.minecraft.nbt.NBTTagCompound life6_30;
    forward_join_43: {
    forward_join_38: {
    forward_join_28: {
    forward_join_22: {
    forward_join_12: {
    life2_3 = (net.minecraft.item.ItemArmor.u ^ 135061066539872L);
    life4_5 = ((net.minecraft.item.ItemStack.l()) ? 1 : 0);
    if (!((this.t != net.minecraft.item.ItemArmor$ArmorMaterial.LEATHER))) {
        break forward_join_12;
    }
    return -1;
    }
    life5_16 = ((net.minecraft.item.ItemStack)(p0)).a__yw();
    spill5469_0 = life5_16;
    if (!((life4_5 == 0))) {
        forwardValue5469_22_0 = spill5469_0;
        break forward_join_22;
    }
    if (!((spill5469_0 != null))) {
        break forward_join_38;
    }
    forwardValue5469_22_0 = ((net.minecraft.nbt.NBTTagCompound)(life5_16)).a__yw(((java.lang.String)("display")));
    }
    life6_30 = forwardValue5469_22_0;
    spill5469_1 = life6_30;
    if (!((life4_5 == 0))) {
        forwardValue5469_28_0 = spill5469_1;
        break forward_join_28;
    }
    if (!((spill5469_1 != null))) {
        break forward_join_38;
    }
    forwardValue5469_28_0 = life6_30;
    }
    spill5469_2 = ((net.minecraft.nbt.NBTTagCompound)(forwardValue5469_28_0)).a__Boolean(((java.lang.String)("color")), ((int)(3)));
    if (!((life4_5 == 0))) {
        forwardValue5469_43_0 = ((spill5469_2) ? 1 : 0);
        break forward_join_43;
    }
    if (!(spill5469_2)) {
        break forward_join_38;
    }
    return ((net.minecraft.nbt.NBTTagCompound)(life6_30)).a__Int(((java.lang.String)("color")));
    }
    forwardValue5469_43_0 = __sourceIntrinsic_9dbdbdfe5e0e_invokedynamic5469_10(7851, (5112803629085643669L ^ life2_3));
    }
    return forwardValue5469_43_0;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral11905_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/wR"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.item.ItemArmor.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 21422;
      if (w[var3] == null) {
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
         long var5 = v[var3];
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
         Object[] var9 = (Object[])x.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               x.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/wR", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         w[var3] = var15;
      }

      return w[var3];
}


public int c() {
return ((net.minecraft.item.ItemArmor$ArmorMaterial)(this.t)).a();
}


public boolean d__sourceReturn_2aed085586(net.minecraft.item.ItemStack p0) {
int forwardValue5470_24_0;
    int forwardValue5470_34_0;
    int forwardValue5470_38_0;
    int forwardValue5470_40_0;
    boolean spill5470_0;
    long life2_3;
    int life4_5;
    forward_join_40: {
    forward_join_39: {
    forward_join_38: {
    forward_join_34: {
    forward_join_24: {
    life2_3 = (net.minecraft.item.ItemArmor.u ^ 130058217713230L);
    life4_5 = ((net.minecraft.item.ItemStack.l()) ? 1 : 0);
    if (!((this.t == net.minecraft.item.ItemArmor$ArmorMaterial.LEATHER))) {
        break forward_join_39;
    }
    spill5470_0 = ((net.minecraft.item.ItemStack)(p0)).e__Boolean();
    if (!((life4_5 == 0))) {
        forwardValue5470_24_0 = ((spill5470_0) ? 1 : 0);
        break forward_join_24;
    }
    if (!(spill5470_0)) {
        break forward_join_39;
    }
    forwardValue5470_24_0 = ((((net.minecraft.nbt.NBTTagCompound)(((net.minecraft.item.ItemStack)(p0)).a__yw())).a__Boolean(((java.lang.String)("display")), ((int)(__sourceIntrinsic_7269f9a4f8a9_invokedynamic5470_8(27121, (7246080586303875557L ^ life2_3)))))) ? 1 : 0);
    }
    if (!((life4_5 == 0))) {
        forwardValue5470_34_0 = forwardValue5470_24_0;
        break forward_join_34;
    }
    if (!((forwardValue5470_24_0 != 0))) {
        break forward_join_39;
    }
    forwardValue5470_34_0 = ((((net.minecraft.nbt.NBTTagCompound)(((net.minecraft.nbt.NBTTagCompound)(((net.minecraft.item.ItemStack)(p0)).a__yw())).a__yw(((java.lang.String)("display"))))).a__Boolean(((java.lang.String)("color")), ((int)(3)))) ? 1 : 0);
    }
    if (!((life4_5 == 0))) {
        forwardValue5470_38_0 = forwardValue5470_34_0;
        break forward_join_38;
    }
    if (!((forwardValue5470_34_0 != 0))) {
        break forward_join_39;
    }
    forwardValue5470_38_0 = 1;
    }
    forwardValue5470_40_0 = forwardValue5470_38_0;
    break forward_join_40;
    }
    forwardValue5470_40_0 = 0;
    }
    return ((forwardValue5470_40_0) != 0);
}


private static java.lang.UnsupportedOperationException a(java.lang.UnsupportedOperationException p0) {
return p0;
}


public int a(net.minecraft.item.ItemStack p0, int p1) {
int forwardValue5465_19_0;
    int forwardValue5465_31_0;
    int spill5465_0;
    int spill5465_1;
    long life3_3;
    int life5_5;
    int life6_24;
    forward_join_31: {
    forward_join_30: {
    forward_join_19: {
    forward_join_16: {
    life3_3 = (net.minecraft.item.ItemArmor.u ^ 113979525328289L);
    life5_5 = ((net.minecraft.item.ItemStack.l()) ? 1 : 0);
    spill5465_0 = p1;
    if (!((life5_5 == 0))) {
        forwardValue5465_19_0 = spill5465_0;
        break forward_join_19;
    }
    if (!((spill5465_0 > 0))) {
        break forward_join_16;
    }
    return __sourceIntrinsic_3a92510638ee_invokedynamic5465_3(32297, (4023950190033190356L ^ life3_3));
    }
    forwardValue5465_19_0 = ((net.minecraft.item.ItemArmor)(this)).b(((net.minecraft.item.ItemStack)(p0)));
    }
    life6_24 = forwardValue5465_19_0;
    spill5465_1 = life6_24;
    if (!((life5_5 == 0))) {
        forwardValue5465_31_0 = spill5465_1;
        break forward_join_31;
    }
    if (!((spill5465_1 < 0))) {
        break forward_join_30;
    }
    life6_24 = __sourceIntrinsic_3a92510638ee_invokedynamic5465_5(15633, (4744924345558105835L ^ life3_3));
    }
    forwardValue5465_31_0 = life6_24;
    }
    return forwardValue5465_31_0;
}


public void a__Void(net.minecraft.item.ItemStack p0, int p1) {
net.minecraft.nbt.NBTTagCompound forwardValue5468_32_0;
    net.minecraft.nbt.NBTTagCompound forwardValue5468_51_0;
    java.lang.String forwardValue5468_51_1;
    int forwardValue5468_51_2;
    net.minecraft.nbt.NBTTagCompound spill5468_0;
    net.minecraft.nbt.NBTTagCompound spill5468_1;
    java.lang.String spill5468_2;
    int spill5468_3;
    long life3_3;
    int life5_5;
    net.minecraft.nbt.NBTTagCompound life6_19;
    net.minecraft.nbt.NBTTagCompound life7_37;
    forward_join_51: {
    forward_join_48: {
    forward_join_32: {
    forward_join_29: {
    forward_join_15: {
    life3_3 = (net.minecraft.item.ItemArmor.u ^ 110523712259612L);
    life5_5 = ((net.minecraft.item.ItemStack.m()) ? 1 : 0);
    if (!((this.t != net.minecraft.item.ItemArmor$ArmorMaterial.LEATHER))) {
        break forward_join_15;
    }
    throw new java.lang.UnsupportedOperationException("Can't dye non-leather!");
    }
    life6_19 = ((net.minecraft.item.ItemStack)(p0)).a__yw();
    spill5468_0 = life6_19;
    if (!((life5_5 != 0))) {
        forwardValue5468_32_0 = spill5468_0;
        break forward_join_32;
    }
    if (!((spill5468_0 == null))) {
        break forward_join_29;
    }
    life6_19 = new net.minecraft.nbt.NBTTagCompound();
    ((net.minecraft.item.ItemStack)(p0)).b(((net.minecraft.nbt.NBTTagCompound)(life6_19)));
    }
    forwardValue5468_32_0 = ((net.minecraft.nbt.NBTTagCompound)(life6_19)).a__yw(((java.lang.String)("display")));
    }
    life7_37 = forwardValue5468_32_0;
    spill5468_1 = life6_19;
    spill5468_2 = "display";
    spill5468_3 = __sourceIntrinsic_34ef93192094_invokedynamic5468_8(31891, (6617090781022393558L ^ life3_3));
    if (!((life5_5 != 0))) {
        forwardValue5468_51_0 = spill5468_1;
        forwardValue5468_51_1 = spill5468_2;
        forwardValue5468_51_2 = spill5468_3;
        break forward_join_51;
    }
    if (!((!((net.minecraft.nbt.NBTTagCompound)(spill5468_1)).a__Boolean(((java.lang.String)(spill5468_2)), ((int)(spill5468_3)))))) {
        break forward_join_48;
    }
    ((net.minecraft.nbt.NBTTagCompound)(life6_19)).a(((java.lang.String)("display")), ((net.minecraft.nbt.NBTBase)(life7_37)));
    }
    forwardValue5468_51_0 = life7_37;
    forwardValue5468_51_1 = "color";
    forwardValue5468_51_2 = p1;
    }
    ((net.minecraft.nbt.NBTTagCompound)(forwardValue5468_51_0)).a__Void(((java.lang.String)(forwardValue5468_51_1)), ((int)(forwardValue5468_51_2)));
    return;
}


public void a(net.minecraft.item.ItemStack p0) {
net.minecraft.nbt.NBTTagCompound forwardValue5464_20_0;
    net.minecraft.nbt.NBTTagCompound forwardValue5464_29_0;
    java.lang.String forwardValue5464_29_1;
    net.minecraft.nbt.NBTTagCompound spill5464_0;
    net.minecraft.nbt.NBTTagCompound spill5464_1;
    java.lang.String spill5464_2;
    long life2_3;
    int life4_5;
    net.minecraft.nbt.NBTTagCompound life5_12;
    net.minecraft.nbt.NBTTagCompound life6_26;
    forward_join_30: {
    forward_join_29: {
    forward_join_20: {
    life2_3 = (net.minecraft.item.ItemArmor.u ^ 95156889702998L);
    life4_5 = ((net.minecraft.item.ItemStack.m()) ? 1 : 0);
    if (!((this.t == net.minecraft.item.ItemArmor$ArmorMaterial.LEATHER))) {
        break forward_join_30;
    }
    life5_12 = ((net.minecraft.item.ItemStack)(p0)).a__yw();
    spill5464_0 = life5_12;
    if (!((life4_5 != 0))) {
        forwardValue5464_20_0 = spill5464_0;
        break forward_join_20;
    }
    if (!((spill5464_0 != null))) {
        break forward_join_30;
    }
    forwardValue5464_20_0 = ((net.minecraft.nbt.NBTTagCompound)(life5_12)).a__yw(((java.lang.String)("display")));
    }
    life6_26 = forwardValue5464_20_0;
    spill5464_1 = life6_26;
    spill5464_2 = "color";
    if (!((life4_5 != 0))) {
        forwardValue5464_29_0 = spill5464_1;
        forwardValue5464_29_1 = spill5464_2;
        break forward_join_29;
    }
    if (!(((net.minecraft.nbt.NBTTagCompound)(spill5464_1)).a__Boolean(((java.lang.String)(spill5464_2))))) {
        break forward_join_30;
    }
    forwardValue5464_29_0 = life6_26;
    forwardValue5464_29_1 = "color";
    }
    ((net.minecraft.nbt.NBTTagCompound)(forwardValue5464_29_0)).a__Void(((java.lang.String)(forwardValue5464_29_1)));
    }
    return;
}


public boolean a(net.minecraft.item.ItemStack p0, net.minecraft.item.ItemStack p1) {
net.minecraft.item.ItemArmor forwardValue5466_15_0;
    int forwardValue5466_22_0;
    int forwardValue5466_24_0;
    net.minecraft.item.ItemArmor spill5466_0;
    boolean spill5466_1;
    long life3_3;
    int life5_5;
    forward_join_24: {
    forward_join_23: {
    forward_join_22: {
    forward_join_21: {
    forward_join_15: {
    life3_3 = (net.minecraft.item.ItemArmor.u ^ 49802344105455L);
    life5_5 = ((net.minecraft.item.ItemStack.m()) ? 1 : 0);
    spill5466_0 = this;
    if (!((life5_5 != 0))) {
        forwardValue5466_15_0 = spill5466_0;
        break forward_join_15;
    }
    if (!((((net.minecraft.item.ItemArmor$ArmorMaterial)(((net.minecraft.item.ItemArmor)(spill5466_0)).t)).a__wQ() != ((net.minecraft.item.ItemStack)(p1)).a__wQ()))) {
        break forward_join_21;
    }
    forwardValue5466_15_0 = this;
    }
    spill5466_1 = __sourceIntrinsic_0603dfbbc4ad_call5466_6(forwardValue5466_15_0, p0, p1);
    if (!((life5_5 != 0))) {
        forwardValue5466_22_0 = ((spill5466_1) ? 1 : 0);
        break forward_join_22;
    }
    if (!(spill5466_1)) {
        break forward_join_23;
    }
    }
    forwardValue5466_22_0 = 1;
    }
    forwardValue5466_24_0 = forwardValue5466_22_0;
    break forward_join_24;
    }
    forwardValue5466_24_0 = 0;
    }
    return ((forwardValue5466_24_0) != 0);
}


public net.minecraft.item.ItemStack a(net.minecraft.item.ItemStack p0, net.minecraft.world.World p1, net.minecraft.entity.player.EntityPlayer p2) {
net.minecraft.item.ItemStack forwardValue5467_28_0;
    boolean spill5467_0;
    net.minecraft.item.ItemStack spill5467_1;
    long life4_3;
    int life7_9;
    net.minecraft.item.ItemStack life8_13;
    int life6_14;
    forward_join_28: {
    forward_join_27: {
    life4_3 = (net.minecraft.item.ItemArmor.u ^ 101651703967019L);
    spill5467_0 = net.minecraft.item.ItemStack.l();
    life7_9 = (net.minecraft.entity.EntityLiving.a(((net.minecraft.item.ItemStack)(p0))) - 1);
    life8_13 = ((net.minecraft.entity.player.EntityPlayer)(p2)).b__sourceReturn_7f6f0b7f03(((int)(life7_9)));
    life6_14 = ((spill5467_0) ? 1 : 0);
    spill5467_1 = life8_13;
    if (!((life6_14 == 0))) {
        forwardValue5467_28_0 = spill5467_1;
        break forward_join_28;
    }
    if (!((spill5467_1 == null))) {
        break forward_join_27;
    }
    ((net.minecraft.entity.player.EntityPlayer)(p2)).b(((int)(life7_9)), ((net.minecraft.item.ItemStack)(((net.minecraft.item.ItemStack)(p0)).a__xW())));
    ((net.minecraft.item.ItemStack)(p0)).b = ((int)(0));
    }
    forwardValue5467_28_0 = p0;
    }
    return forwardValue5467_28_0;
}


public net.minecraft.item.ItemArmor$ArmorMaterial a__sourceReturn_2ce8a48aa6() {
return this.t;
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1897_52(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1897_54(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1897_55(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1897_56(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3a92510638ee_invokedynamic5465_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3a92510638ee_invokedynamic5465_5(int a0, long a1) throws E;

private static native <E extends Throwable> boolean __sourceIntrinsic_0603dfbbc4ad_call5466_6(net.minecraft.item.ItemArmor a0, net.minecraft.item.ItemStack a1, net.minecraft.item.ItemStack a2) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_34ef93192094_invokedynamic5468_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral11905_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9dbdbdfe5e0e_invokedynamic5469_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7269f9a4f8a9_invokedynamic5470_8(int a0, long a1) throws E;
}
