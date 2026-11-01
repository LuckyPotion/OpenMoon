package net.minecraft.util;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class FoodStats {

private int a;

private float b;

private float c;

private int d;

private int e;

private static long f;

private static long[] g;

private static java.lang.Integer[] h;

private static java.util.Map i;

public FoodStats() { super(); }


private static void __sourceConstructorBody_add4132dc46092f5(net.minecraft.util.FoodStats receiver) throws Throwable {

long local1 = (net.minecraft.util.FoodStats.f ^ 71079875137495L);

    net.minecraft.util.FoodStats.__sourceConstructorInit_add4132dc46092f5_0(((net.minecraft.util.FoodStats)(receiver)));

    ((net.minecraft.util.FoodStats)(receiver)).a = ((int)(__sourceIntrinsic_add4132dc46092f5_originalDynamicSite3988_2(21119, (3668681629803060085L ^ local1))));

    ((net.minecraft.util.FoodStats)(receiver)).b = ((float)(0x1.4p2f));

    ((net.minecraft.util.FoodStats)(receiver)).e = ((int)(__sourceIntrinsic_add4132dc46092f5_originalDynamicSite3988_5(21119, (3668681629803060085L ^ local1))));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_add4132dc46092f5_0(net.minecraft.util.FoodStats a0) throws E;

static {
f = ((long)(((moom._a)(moom._c.a(((long)(-1150483688665131044L)), ((long)(-99407525664065576L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(167666611642301L)))));
    i = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (net.minecraft.util.FoodStats.f ^ 124739385465601L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1934_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1934_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1934_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1934_14 = new byte[8];
    (__sourceSpill1934_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1934_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1934_16 = __sourceSpill1934_14;
    ((javax.crypto.Cipher)(__sourceSpill1934_11)).init(((int)(__sourceSpill1934_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1934_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1934_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[6];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "\b¨=Úô\037Ò4¾`ð)è(\035äçu\t±b3ÛeYÎI\031Í"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1934_25 = local6_life21;
        int __sourceSpill1934_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1934_25)).substring(((int)(__sourceSpill1934_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1934_30 = local8_life19;
        int __sourceSpill1934_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1934_33 = new byte[8];
        (__sourceSpill1934_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1934_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1934_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1934_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1934_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1934_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1934_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1934_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1934_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1934_34)).doFinal(((byte[])(__sourceSpill1934_33)));
        (__sourceSpill1934_30)[__sourceSpill1934_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "YXú\025Ç\035­þÂ:Ç&¨º°"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1934_38 = local6_life21;
        int __sourceSpill1934_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1934_38)).substring(((int)(__sourceSpill1934_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1934_43 = local8_life19;
        int __sourceSpill1934_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1934_46 = new byte[8];
        (__sourceSpill1934_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1934_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1934_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1934_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1934_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1934_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1934_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1934_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1934_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1934_47)).doFinal(((byte[])(__sourceSpill1934_46)));
        (__sourceSpill1934_43)[__sourceSpill1934_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    g = ((long[])(local8_life19));
    h = ((java.lang.Integer[])(new java.lang.Integer[6]));
}


public void b(net.minecraft.nbt.NBTTagCompound p0) {
((net.minecraft.nbt.NBTTagCompound)(p0)).a__Void(((java.lang.String)("foodLevel")), ((int)(this.a)));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Void(((java.lang.String)("foodTickTimer")), ((int)(this.d)));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("foodSaturationLevel")), ((float)(this.b)));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("foodExhaustionLevel")), ((float)(this.c)));
    return;
}


public int b() {
return this.e;
}


public void b(float p0) {
this.b = ((float)(p0));
    return;
}


public float a() {
return this.b;
}


public void a(int p0) {
this.a = ((int)(p0));
    return;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral12371_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/C2"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.util.FoodStats.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 3620;
      if (h[var3] == null) {
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
         long var5 = g[var3];
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
         Object[] var9 = (Object[])i.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               i.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/C2", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         h[var3] = var15;
      }

      return h[var3];
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(net.minecraft.nbt.NBTTagCompound p0) {
long life2_3;
    int life4_5;
    forward_join_37: {
    forward_join_32: {
    life2_3 = (net.minecraft.util.FoodStats.f ^ 15071394991618L);
    life4_5 = ((moom.DS.c__Boolean()) ? 1 : 0);
    if (!((life4_5 != 0))) { break forward_join_32; }
    if (!(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Boolean(((java.lang.String)("foodLevel")), ((int)(__sourceIntrinsic_658b606e7852_invokedynamic6408_3(14001, (2622465782996287085L ^ life2_3))))))) { break forward_join_37; }
    this.a = ((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Int(((java.lang.String)("foodLevel")))));
    this.d = ((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Int(((java.lang.String)("foodTickTimer")))));
    this.b = ((float)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Float(((java.lang.String)("foodSaturationLevel")))));
    }
    this.c = ((float)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Float(((java.lang.String)("foodExhaustionLevel")))));
    }
    return;
}


public void a(net.minecraft.entity.player.EntityPlayer p0) {
net.minecraft.util.FoodStats forwardValue5745_35_0;
    int forwardValue5745_60_0;
    net.minecraft.util.FoodStats forwardValue5745_101_0;
    int forwardValue5745_109_0;
    int forwardValue5745_130_0;
    int forwardValue5745_148_0;
    net.minecraft.util.FoodStats forwardValue5745_155_0;
    boolean spill5745_0;
    int spill5745_1;
    net.minecraft.util.FoodStats spill5745_2;
    int spill5745_3;
    boolean spill5745_4;
    net.minecraft.util.FoodStats spill5745_5;
    net.minecraft.util.FoodStats spill5745_6;
    int spill5745_7;
    long life2_3;
    net.minecraft.world.EnumDifficulty life5_8;
    int life4_9;
    forward_join_157: {
    forward_join_155: {
    forward_join_154: {
    forward_join_149: {
    forward_join_148: {
    forward_join_144: {
    forward_join_130: {
    forward_join_109: {
    forward_join_105: {
    forward_join_101: {
    forward_join_60: {
    forward_join_55: {
    forward_join_44: {
    forward_join_35: {
    life2_3 = (net.minecraft.util.FoodStats.f ^ 46262727100712L);
    spill5745_0 = moom.DS.c__Boolean();
    life5_8 = ((net.minecraft.world.World)(((net.minecraft.entity.player.EntityPlayer)(p0)).i)).a__bB();
    life4_9 = ((spill5745_0) ? 1 : 0);
    this.e = ((int)(this.a));
    spill5745_1 = recovery.source.CarrierOps.fcmpl(((float)(this.c)), ((float)(0x1.0p2f)));
    if (!((life4_9 != 0))) {
        forwardValue5745_60_0 = spill5745_1;
        break forward_join_60;
    }
    if (!((spill5745_1 > 0))) {
        break forward_join_55;
    }
    net.minecraft.util.FoodStats __stackOp5745_9_0 = this;
    ((net.minecraft.util.FoodStats)(__stackOp5745_9_0)).c = ((float)((((net.minecraft.util.FoodStats)(__stackOp5745_9_0)).c - 0x1.0p2f)));
    spill5745_2 = this;
    if (!((life4_9 != 0))) {
        forwardValue5745_35_0 = spill5745_2;
        break forward_join_35;
    }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(((net.minecraft.util.FoodStats)(spill5745_2)).b)), ((float)(0x0.0p0f))) > 0))) {
        break forward_join_44;
    }
    forwardValue5745_35_0 = this;
    }
    ((net.minecraft.util.FoodStats)(forwardValue5745_35_0)).b = ((float)(java.lang.Math.max(((float)((this.b - 0x1.0p0f))), ((float)(0x0.0p0f)))));
    if (!((life4_9 == 0))) {
        break forward_join_55;
    }
    }
    if (!((life5_8 != net.minecraft.world.EnumDifficulty.PEACEFUL))) {
        break forward_join_55;
    }
    this.a = ((int)(java.lang.Math.max(((int)((this.a - 1))), ((int)(0)))));
    }
    forwardValue5745_60_0 = ((((net.minecraft.world.GameRules)(((net.minecraft.world.World)(((net.minecraft.entity.player.EntityPlayer)(p0)).i)).a__Ej())).a__Boolean(((java.lang.String)("naturalRegeneration")))) ? 1 : 0);
    }
    if (!((life4_9 != 0))) {
        forwardValue5745_109_0 = forwardValue5745_60_0;
        break forward_join_109;
    }
    if (!((forwardValue5745_60_0 != 0))) {
        break forward_join_105;
    }
    spill5745_3 = this.a;
    if (!((life4_9 != 0))) {
        forwardValue5745_109_0 = spill5745_3;
        break forward_join_109;
    }
    if (!((spill5745_3 >= __sourceIntrinsic_62126deb9d7d_invokedynamic5745_26(2710, (6886245829708629345L ^ life2_3))))) {
        break forward_join_105;
    }
    spill5745_4 = ((net.minecraft.entity.player.EntityPlayer)(p0)).S__Boolean();
    if (!((life4_9 != 0))) {
        forwardValue5745_109_0 = ((spill5745_4) ? 1 : 0);
        break forward_join_109;
    }
    if (!(spill5745_4)) {
        break forward_join_105;
    }
    net.minecraft.util.FoodStats __stackOp5745_29_0 = this;
    ((net.minecraft.util.FoodStats)(__stackOp5745_29_0)).d = ((int)((((net.minecraft.util.FoodStats)(__stackOp5745_29_0)).d + 1)));
    spill5745_5 = this;
    if (!((life4_9 != 0))) {
        forwardValue5745_101_0 = spill5745_5;
        break forward_join_101;
    }
    if (!((((net.minecraft.util.FoodStats)(spill5745_5)).d >= __sourceIntrinsic_62126deb9d7d_invokedynamic5745_33(26414, (6103631666766325983L ^ life2_3))))) {
        break forward_join_157;
    }
    ((net.minecraft.entity.player.EntityPlayer)(p0)).c(((float)(0x1.0p0f)));
    ((net.minecraft.util.FoodStats)(this)).a(((float)(0x1.8p1f)));
    forwardValue5745_101_0 = this;
    }
    ((net.minecraft.util.FoodStats)(forwardValue5745_101_0)).d = ((int)(0));
    if (!((life4_9 == 0))) {
        break forward_join_157;
    }
    }
    spill5745_6 = this;
    if (!((life4_9 != 0))) {
        forwardValue5745_155_0 = spill5745_6;
        break forward_join_155;
    }
    forwardValue5745_109_0 = ((net.minecraft.util.FoodStats)(spill5745_6)).a;
    }
    if (!((forwardValue5745_109_0 <= 0))) {
        break forward_join_154;
    }
    net.minecraft.util.FoodStats __stackOp5745_38_0 = this;
    ((net.minecraft.util.FoodStats)(__stackOp5745_38_0)).d = ((int)((((net.minecraft.util.FoodStats)(__stackOp5745_38_0)).d + 1)));
    spill5745_7 = this.d;
    if (!((life4_9 != 0))) {
        forwardValue5745_130_0 = spill5745_7;
        break forward_join_130;
    }
    if (!((spill5745_7 >= __sourceIntrinsic_62126deb9d7d_invokedynamic5745_42(30016, (8963028006278970032L ^ life2_3))))) {
        break forward_join_157;
    }
    forwardValue5745_130_0 = recovery.source.CarrierOps.fcmpl(((float)(((net.minecraft.entity.player.EntityPlayer)(p0)).b__sourceReturn_bc607678b6())), ((float)(0x1.4p3f)));
    }
    if (!((life4_9 != 0))) {
        forwardValue5745_148_0 = forwardValue5745_130_0;
        break forward_join_148;
    }
    if (!((forwardValue5745_130_0 <= 0))) {
        break forward_join_144;
    }
    if (!((life5_8 != net.minecraft.world.EnumDifficulty.HARD))) {
        break forward_join_144;
    }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(((net.minecraft.entity.player.EntityPlayer)(p0)).b__sourceReturn_bc607678b6())), ((float)(0x1.0p0f))) > 0))) {
        break forward_join_149;
    }
    if (!((life5_8 == net.minecraft.world.EnumDifficulty.NORMAL))) {
        break forward_join_149;
    }
    }
    forwardValue5745_148_0 = ((((net.minecraft.entity.player.EntityPlayer)(p0)).a__Boolean(((net.minecraft.util.DamageSource)(net.minecraft.util.DamageSource.g)), ((float)(0x1.0p0f)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue5745_148_0);
    }
    this.d = ((int)(0));
    if (!((life4_9 == 0))) {
        break forward_join_157;
    }
    }
    forwardValue5745_155_0 = this;
    }
    ((net.minecraft.util.FoodStats)(forwardValue5745_155_0)).d = ((int)(0));
    }
    return;
}


public void a(moom.xp p0, net.minecraft.item.ItemStack p1) {
((net.minecraft.util.FoodStats)(this)).a(((int)(((moom.xp)(p0)).b(((net.minecraft.item.ItemStack)(p1))))), ((float)(((moom.xp)(p0)).a(((net.minecraft.item.ItemStack)(p1))))));
    return;
}


public void a(int p0, float p1) {
long local3 = (net.minecraft.util.FoodStats.f ^ 14623864397095L);
    this.a = ((int)(java.lang.Math.min(((int)((p0 + this.a))), ((int)(__sourceIntrinsic_02e1fabb0e78_originalDynamicSite2053_2(17831, (961072683756052060L ^ local3)))))));
    this.b = ((float)(java.lang.Math.min(((float)((this.b + ((((float) p0) * p1) * 0x1.0p1f)))), ((float)(((float) this.a))))));
    return;
}


public int a__Int() {
return this.a;
}


public boolean a__Boolean() {
int forwardValue5746_17_0;
    int forwardValue5746_19_0;
    int spill5746_0;
    long life1_3;
    int life3_5;
    forward_join_19: {
    forward_join_18: {
    forward_join_17: {
    life1_3 = (net.minecraft.util.FoodStats.f ^ 63783822296922L);
    life3_5 = ((moom.DS.b__Boolean()) ? 1 : 0);
    spill5746_0 = this.a;
    if (!((life3_5 == 0))) {
        forwardValue5746_17_0 = spill5746_0;
        break forward_join_17;
    }
    if (!((spill5746_0 < __sourceIntrinsic_1a14968dced5_invokedynamic5746_4(21119, (3668670244958688248L ^ life1_3))))) {
        break forward_join_18;
    }
    forwardValue5746_17_0 = 1;
    }
    forwardValue5746_19_0 = forwardValue5746_17_0;
    break forward_join_19;
    }
    forwardValue5746_19_0 = 0;
    }
    return ((forwardValue5746_19_0) != 0);
}


public void a(float p0) {
this.c = ((float)(java.lang.Math.min(((float)((this.c + p0))), ((float)(0x1.4p5f)))));
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_add4132dc46092f5_originalDynamicSite3988_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_add4132dc46092f5_originalDynamicSite3988_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral12371_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_658b606e7852_invokedynamic6408_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_62126deb9d7d_invokedynamic5745_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_62126deb9d7d_invokedynamic5745_33(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_62126deb9d7d_invokedynamic5745_42(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_02e1fabb0e78_originalDynamicSite2053_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1a14968dced5_invokedynamic5746_4(int a0, long a1) throws E;
}
