package net.minecraft.item;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class ItemBow extends net.minecraft.item.Item {

public static java.lang.String[] n;

private static long o;

private static long[] p;

private static java.lang.Integer[] q;

private static java.util.Map r;

public ItemBow() { super(); }


private static void __sourceConstructorBody_4b09e6f2c0af172c(net.minecraft.item.ItemBow receiver) throws Throwable {

long local1 = (net.minecraft.item.ItemBow.o ^ 61879792502794L);

    net.minecraft.item.ItemBow.__sourceConstructorInit_4b09e6f2c0af172c_0(((net.minecraft.item.ItemBow)(receiver)));

    ((net.minecraft.item.ItemBow)(receiver)).f = ((int)(1));

    ((net.minecraft.item.ItemBow)(receiver)).c(((int)(__sourceIntrinsic_4b09e6f2c0af172c_originalDynamicSite3918_3(4294, (5423962296880099108L ^ local1)))));

    ((net.minecraft.item.ItemBow)(receiver)).a(((net.minecraft.creativetab.CreativeTabs)(net.minecraft.creativetab.CreativeTabs.j)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_4b09e6f2c0af172c_0(net.minecraft.item.ItemBow a0) throws E;

static {
o = ((long)(((moom._a)(moom._c.a(((long)(-7408481894243195608L)), ((long)(-6012242819483923500L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(131576633848292L)))));
    r = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (net.minecraft.item.ItemBow.o ^ 91708595564067L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1899_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1899_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1899_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1899_14 = new byte[8];
    (__sourceSpill1899_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1899_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1899_16 = __sourceSpill1899_14;
    ((javax.crypto.Cipher)(__sourceSpill1899_11)).init(((int)(__sourceSpill1899_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1899_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1899_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[4];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "nq?\177\003Z\rV®~ j@¥WM"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1899_25 = local6_life21;
        int __sourceSpill1899_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1899_25)).substring(((int)(__sourceSpill1899_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1899_30 = local8_life19;
        int __sourceSpill1899_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1899_33 = new byte[8];
        (__sourceSpill1899_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1899_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1899_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1899_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1899_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1899_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1899_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1899_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1899_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1899_34)).doFinal(((byte[])(__sourceSpill1899_33)));
        (__sourceSpill1899_30)[__sourceSpill1899_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "\032®L(]­\002à}\020Ù\\\017í\n"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1899_38 = local6_life21;
        int __sourceSpill1899_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1899_38)).substring(((int)(__sourceSpill1899_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1899_43 = local8_life19;
        int __sourceSpill1899_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1899_46 = new byte[8];
        (__sourceSpill1899_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1899_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1899_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1899_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1899_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1899_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1899_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1899_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1899_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1899_47)).doFinal(((byte[])(__sourceSpill1899_46)));
        (__sourceSpill1899_43)[__sourceSpill1899_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    p = ((long[])(local8_life19));
    q = ((java.lang.Integer[])(new java.lang.Integer[4]));
    java.lang.String[] __sourceSpill1899_52 = new java.lang.String[3];
    (__sourceSpill1899_52)[0] = "pulling_0";
    (__sourceSpill1899_52)[1] = "pulling_1";
    (__sourceSpill1899_52)[2] = "pulling_2";
    n = ((java.lang.String[])(__sourceSpill1899_52));
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral11912_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/w8"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 21620;
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
            throw new RuntimeException("moom/w8", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         q[var3] = var15;
      }

      return q[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.item.ItemBow.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public net.minecraft.item.ItemStack b(net.minecraft.item.ItemStack p0, net.minecraft.world.World p1, net.minecraft.entity.player.EntityPlayer p2) {
return p0;
}


public int c() {
return 1;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public static float a__sourceReturn_d4116ae163(int p0) {
float forwardValue5472_30_0;
    boolean spill5472_0;
    float spill5472_1;
    long life1_3;
    float life4_9;
    float life4_19;
    int life3_20;
    forward_join_30: {
    forward_join_29: {
    life1_3 = (net.minecraft.item.ItemBow.o ^ 86277580313739L);
    spill5472_0 = net.minecraft.item.ItemStack.m();
    life4_9 = (((float) p0) / 0x1.4p4f);
    life4_19 = (((life4_9 * life4_9) + (life4_9 * 0x1.0p1f)) / 0x1.8p1f);
    life3_20 = ((spill5472_0) ? 1 : 0);
    spill5472_1 = life4_19;
    if (!((life3_20 != 0))) {
        forwardValue5472_30_0 = spill5472_1;
        break forward_join_30;
    }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(spill5472_1)), ((float)(0x1.0p0f))) > 0))) {
        break forward_join_29;
    }
    life4_19 = 0x1.0p0f;
    }
    forwardValue5472_30_0 = life4_19;
    }
    return forwardValue5472_30_0;
}


public void a(net.minecraft.item.ItemStack p0, net.minecraft.world.World p1, net.minecraft.entity.player.EntityPlayer p2, int p3) {
int forwardValue5474_20_0;
    int forwardValue5474_22_0;
    int forwardValue5474_39_0;
    int forwardValue5474_68_0;
    float forwardValue5474_70_0;
    int forwardValue5474_93_0;
    int forwardValue5474_113_0;
    int forwardValue5474_125_0;
    int forwardValue5474_157_0;
    int forwardValue5474_173_0;
    int forwardValue5474_188_0;
    boolean spill5474_0;
    int spill5474_1;
    int spill5474_2;
    boolean spill5474_3;
    int spill5474_4;
    float spill5474_5;
    int spill5474_6;
    int spill5474_7;
    int spill5474_8;
    boolean spill5474_9;
    long life5_3;
    int life7_5;
    int life8_31;
    int life9_60;
    float life10_65;
    float life10_75;
    net.minecraft.entity.projectile.EntityArrow life11_106;
    int life12_126;
    int life13_152;
    forward_join_189: {
    forward_join_188: {
    forward_join_174: {
    forward_join_173: {
    forward_join_169: {
    forward_join_157: {
    forward_join_135: {
    forward_join_125: {
    forward_join_121: {
    forward_join_113: {
    forward_join_109: {
    forward_join_93: {
    forward_join_89: {
    forward_join_71: {
    forward_join_70: {
    forward_join_68: {
    forward_join_63: {
    forward_join_39: {
    forward_join_34: {
    forward_join_22: {
    forward_join_21: {
    forward_join_20: {
    forward_join_19: {
    life5_3 = (net.minecraft.item.ItemBow.o ^ 82426110541091L);
    life7_5 = ((net.minecraft.item.ItemStack.m()) ? 1 : 0);
    spill5474_0 = ((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.entity.player.EntityPlayer)(p2)).b1)).d;
    if (!((life7_5 != 0))) {
        forwardValue5474_20_0 = ((spill5474_0) ? 1 : 0);
        break forward_join_20;
    }
    if (!((!spill5474_0))) {
        break forward_join_19;
    }
    spill5474_1 = moom.rV.a(((int)(((net.minecraft.enchantment.Enchantment)(net.minecraft.enchantment.Enchantment.z)).C)), ((net.minecraft.item.ItemStack)(p0)));
    if (!((life7_5 != 0))) {
        forwardValue5474_20_0 = spill5474_1;
        break forward_join_20;
    }
    if (!((spill5474_1 > 0))) {
        break forward_join_21;
    }
    }
    forwardValue5474_20_0 = 1;
    }
    forwardValue5474_22_0 = forwardValue5474_20_0;
    break forward_join_22;
    }
    forwardValue5474_22_0 = 0;
    }
    life8_31 = forwardValue5474_22_0;
    spill5474_2 = life8_31;
    if (!((life7_5 != 0))) {
        forwardValue5474_39_0 = spill5474_2;
        break forward_join_39;
    }
    if (!((spill5474_2 == 0))) {
        break forward_join_34;
    }
    spill5474_3 = ((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.entity.player.EntityPlayer)(p2)).bD)).b(((net.minecraft.item.Item)(net.minecraft.init.Items.g)));
    if (!((life7_5 != 0))) {
        forwardValue5474_39_0 = ((spill5474_3) ? 1 : 0);
        break forward_join_39;
    }
    if (!(spill5474_3)) {
        break forward_join_189;
    }
    }
    forwardValue5474_39_0 = (((net.minecraft.item.ItemBow)(this)).a__Int(((net.minecraft.item.ItemStack)(p0))) - p3);
    }
    life9_60 = forwardValue5474_39_0;
    life10_65 = (((float) life9_60) / 0x1.4p4f);
    life10_75 = (((life10_65 * life10_65) + (life10_65 * 0x1.0p1f)) / 0x1.8p1f);
    spill5474_4 = recovery.source.CarrierOps.dcmpg(((double)(((double) life10_75))), ((double)(0x1.999999999999ap-4d)));
    if (!((life7_5 != 0))) {
        forwardValue5474_68_0 = spill5474_4;
        break forward_join_68;
    }
    if (!((spill5474_4 < 0))) {
        break forward_join_63;
    }
    return;
    }
    spill5474_5 = life10_75;
    if (!((life7_5 != 0))) {
        forwardValue5474_70_0 = spill5474_5;
        break forward_join_70;
    }
    forwardValue5474_68_0 = recovery.source.CarrierOps.fcmpl(((float)(spill5474_5)), ((float)(0x1.0p0f)));
    }
    if (!((forwardValue5474_68_0 > 0))) {
        break forward_join_71;
    }
    forwardValue5474_70_0 = 0x1.0p0f;
    }
    life10_75 = forwardValue5474_70_0;
    }
    life11_106 = new net.minecraft.entity.projectile.EntityArrow(p1, p2, (life10_75 * 0x1.0p1f));
    spill5474_6 = recovery.source.CarrierOps.fcmpl(((float)(life10_75)), ((float)(0x1.0p0f)));
    if (!((life7_5 != 0))) {
        forwardValue5474_93_0 = spill5474_6;
        break forward_join_93;
    }
    if (!((spill5474_6 == 0))) {
        break forward_join_89;
    }
    ((net.minecraft.entity.projectile.EntityArrow)(life11_106)).h(((boolean)(true)));
    }
    forwardValue5474_93_0 = moom.rV.a(((int)(((net.minecraft.enchantment.Enchantment)(net.minecraft.enchantment.Enchantment.w)).C)), ((net.minecraft.item.ItemStack)(p0)));
    }
    life12_126 = forwardValue5474_93_0;
    spill5474_7 = life12_126;
    if (!((life7_5 != 0))) {
        forwardValue5474_113_0 = spill5474_7;
        break forward_join_113;
    }
    if (!((spill5474_7 > 0))) {
        break forward_join_109;
    }
    ((net.minecraft.entity.projectile.EntityArrow)(life11_106)).a__sourceReturn_2c20cf5948(((double)(((((net.minecraft.entity.projectile.EntityArrow)(life11_106)).a() + (((double) life12_126) * 0x1.0p-1d)) + 0x1.0p-1d))));
    }
    forwardValue5474_113_0 = moom.rV.a(((int)(((net.minecraft.enchantment.Enchantment)(net.minecraft.enchantment.Enchantment.x)).C)), ((net.minecraft.item.ItemStack)(p0)));
    }
    life13_152 = forwardValue5474_113_0;
    spill5474_8 = life13_152;
    if (!((life7_5 != 0))) {
        forwardValue5474_125_0 = spill5474_8;
        break forward_join_125;
    }
    if (!((spill5474_8 > 0))) {
        break forward_join_121;
    }
    ((net.minecraft.entity.projectile.EntityArrow)(life11_106)).g(((int)(life13_152)));
    }
    forwardValue5474_125_0 = moom.rV.a(((int)(((net.minecraft.enchantment.Enchantment)(net.minecraft.enchantment.Enchantment.y)).C)), ((net.minecraft.item.ItemStack)(p0)));
    }
    if (!((life7_5 != 0))) {
        forwardValue5474_157_0 = forwardValue5474_125_0;
        break forward_join_157;
    }
    if (!((forwardValue5474_125_0 > 0))) {
        break forward_join_135;
    }
    ((net.minecraft.entity.projectile.EntityArrow)(life11_106)).b(((int)(__sourceIntrinsic_471201c500cd_invokedynamic5474_30(12746, (1848394534979746562L ^ life5_3)))));
    }
    ((net.minecraft.item.ItemStack)(p0)).a(((int)(1)), ((net.minecraft.entity.EntityLivingBase)(p2)));
    ((net.minecraft.world.World)(p1)).a(((net.minecraft.entity.Entity)(p2)), ((java.lang.String)("random.bow")), ((float)(0x1.0p0f)), ((float)(((0x1.0p0f / ((((java.util.Random)(net.minecraft.item.ItemBow.e)).nextFloat() * 0x1.99999ap-2f) + 0x1.333334p0f)) + (life10_75 * 0x1.0p-1f)))));
    forwardValue5474_157_0 = life8_31;
    }
    if (!((life7_5 != 0))) {
        forwardValue5474_173_0 = forwardValue5474_157_0;
        break forward_join_173;
    }
    if (!((forwardValue5474_157_0 != 0))) {
        break forward_join_169;
    }
    ((net.minecraft.entity.projectile.EntityArrow)(life11_106)).aK = ((int)(__sourceIntrinsic_471201c500cd_invokedynamic5474_36(16056, (578336698539160690L ^ life5_3))));
    if (!((life7_5 == 0))) {
        break forward_join_174;
    }
    }
    forwardValue5474_173_0 = ((((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.entity.player.EntityPlayer)(p2)).bD)).a__Boolean(((net.minecraft.item.Item)(net.minecraft.init.Items.g)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue5474_173_0);
    }
    ((net.minecraft.entity.player.EntityPlayer)(p2)).a(((moom.BY)((net.minecraft.stats.StatList.ad)[net.minecraft.item.Item.a(((net.minecraft.item.Item)(this)))])));
    spill5474_9 = ((net.minecraft.world.World)(p1)).G;
    if (!((life7_5 != 0))) {
        forwardValue5474_188_0 = ((spill5474_9) ? 1 : 0);
        break forward_join_188;
    }
    if (!((!spill5474_9))) {
        break forward_join_189;
    }
    forwardValue5474_188_0 = ((((net.minecraft.world.World)(p1)).b__Boolean(((net.minecraft.entity.Entity)(life11_106)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue5474_188_0);
    }
    return;
}


public int a__Int(net.minecraft.item.ItemStack p0) {
long local2 = (net.minecraft.item.ItemBow.o ^ 82524530566625L);
    return __sourceIntrinsic_43fb644d1c12_originalDynamicSite2024_1(18276, (2301320339116119407L ^ local2));
}


public moom.a1 a__a1(net.minecraft.item.ItemStack p0) {
return moom.a1.BOW;
}


public net.minecraft.item.ItemStack a(net.minecraft.item.ItemStack p0, net.minecraft.world.World p1, net.minecraft.entity.player.EntityPlayer p2) {
net.minecraft.entity.player.EntityPlayer forwardValue5473_20_0;
    net.minecraft.entity.player.EntityPlayer spill5473_0;
    net.minecraft.entity.player.EntityPlayer spill5473_1;
    long life4_3;
    int life6_5;
    forward_join_25: {
    forward_join_20: {
    forward_join_19: {
    life4_3 = (net.minecraft.item.ItemBow.o ^ 87268488606529L);
    life6_5 = ((net.minecraft.item.ItemStack.l()) ? 1 : 0);
    spill5473_0 = p2;
    if (!((life6_5 == 0))) {
        forwardValue5473_20_0 = spill5473_0;
        break forward_join_20;
    }
    if (!((!((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.entity.player.EntityPlayer)(spill5473_0)).b1)).d))) {
        break forward_join_19;
    }
    spill5473_1 = p2;
    if (!((life6_5 == 0))) {
        forwardValue5473_20_0 = spill5473_1;
        break forward_join_20;
    }
    if (!(((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.entity.player.EntityPlayer)(spill5473_1)).bD)).b(((net.minecraft.item.Item)(net.minecraft.init.Items.g))))) {
        break forward_join_25;
    }
    }
    forwardValue5473_20_0 = p2;
    }
    ((net.minecraft.entity.player.EntityPlayer)(forwardValue5473_20_0)).b(((net.minecraft.item.ItemStack)(p0)), ((int)(((net.minecraft.item.ItemBow)(this)).a__Int(((net.minecraft.item.ItemStack)(p0))))));
    }
    return p0;
}


private static native <E extends Throwable> int __sourceIntrinsic_4b09e6f2c0af172c_originalDynamicSite3918_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral11912_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_471201c500cd_invokedynamic5474_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_471201c500cd_invokedynamic5474_36(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_43fb644d1c12_originalDynamicSite2024_1(int a0, long a1) throws E;
}
