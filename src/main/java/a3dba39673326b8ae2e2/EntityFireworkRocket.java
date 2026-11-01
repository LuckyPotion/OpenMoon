package net.minecraft.entity.item;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class EntityFireworkRocket extends net.minecraft.entity.Entity {

private int aE;

private int aF;

private static long bb;

private static long[] cb;

private static java.lang.Integer[] db;

private static java.util.Map eb;

public EntityFireworkRocket(net.minecraft.world.World p0, double p1, double p2, double p3, net.minecraft.item.ItemStack p4) { super((net.minecraft.world.World)null); }

private static void __sourceConstructorBody_ac18fb94f76afd8b(net.minecraft.entity.item.EntityFireworkRocket receiver, net.minecraft.world.World p0, double p1, double p2, double p3, net.minecraft.item.ItemStack p4) throws Throwable {
net.minecraft.item.ItemStack __initValue837_42_0;
    long local9_life2;
    int local11_life6;
    int local12_life12;
    net.minecraft.nbt.NBTTagCompound local13_life20;
    net.minecraft.nbt.NBTTagCompound local14_life22;
    init_join_102: {
    init_join_58: {
    init_join_42: {
    local9_life2 = (net.minecraft.entity.item.EntityFireworkRocket.bb ^ 118867227543769L);
    int __sourceSpill837_4 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.b();
    net.minecraft.entity.item.EntityFireworkRocket.__sourceConstructorInit_ac18fb94f76afd8b_0(((net.minecraft.entity.item.EntityFireworkRocket)(receiver)), ((net.minecraft.world.World)(p0)));
    local11_life6 = __sourceSpill837_4;
    ((net.minecraft.entity.item.EntityFireworkRocket)(receiver)).aE = ((int)(0));
    ((net.minecraft.entity.item.EntityFireworkRocket)(receiver)).a__Void(((float)(0x1.0000000000000p-2F)), ((float)(0x1.0000000000000p-2F)));
    ((net.minecraft.entity.item.EntityFireworkRocket)(receiver)).a__Void(((double)(p1)), ((double)(p2)), ((double)(p3)));
    local12_life12 = 1;
    if (!((local11_life6 != 0))) {
        break init_join_102;
    }
    if (!((p4 != null))) {
        break init_join_58;
    }
    net.minecraft.item.ItemStack __sourceSpill837_13 = p4;
    if (!((local11_life6 != 0))) {
        __initValue837_42_0 = __sourceSpill837_13;
        break init_join_42;
    }
    if (!(((net.minecraft.item.ItemStack)(__sourceSpill837_13)).e__Boolean())) {
        break init_join_58;
    }
    ((net.minecraft.entity.DataWatcher)(((net.minecraft.entity.item.EntityFireworkRocket)(receiver)).al)).b(((int)(__sourceIntrinsic_ac18fb94f76afd8b_originalDynamicSite837_17(12373, (2286651308867034730L ^ local9_life2)))), ((java.lang.Object)(p4)));
    __initValue837_42_0 = p4;
    }
    local13_life20 = ((net.minecraft.item.ItemStack)(__initValue837_42_0)).a__yw();
    local14_life22 = ((net.minecraft.nbt.NBTTagCompound)(local13_life20)).a__yw(((java.lang.String)("Fireworks")));
    if (!((local11_life6 != 0))) {
        break init_join_102;
    }
    if (!((local14_life22 != null))) {
        break init_join_58;
    }
    local12_life12 = (local12_life12 + __sourceExactCall_f99951980aa424(((net.minecraft.nbt.NBTTagCompound)(local14_life22)), ((java.lang.String)("Flight"))));
    }
    ((net.minecraft.entity.item.EntityFireworkRocket)(receiver)).t = ((double)((((java.util.Random)(((net.minecraft.entity.item.EntityFireworkRocket)(receiver)).ah)).nextGaussian() * 0x1.0624dd2f1a9fcp-10D)));
    ((net.minecraft.entity.item.EntityFireworkRocket)(receiver)).v = ((double)((((java.util.Random)(((net.minecraft.entity.item.EntityFireworkRocket)(receiver)).ah)).nextGaussian() * 0x1.0624dd2f1a9fcp-10D)));
    ((net.minecraft.entity.item.EntityFireworkRocket)(receiver)).u = ((double)(0x1.999999999999ap-5D));
    ((net.minecraft.entity.item.EntityFireworkRocket)(receiver)).aF = ((int)((((__sourceIntrinsic_ac18fb94f76afd8b_originalDynamicSite837_35(20350, (4621994906520838468L ^ local9_life2)) * local12_life12) + ((java.util.Random)(((net.minecraft.entity.item.EntityFireworkRocket)(receiver)).ah)).nextInt(((int)(__sourceIntrinsic_ac18fb94f76afd8b_originalDynamicSite837_38(321, (4463497966539321210L ^ local9_life2)))))) + ((java.util.Random)(((net.minecraft.entity.item.EntityFireworkRocket)(receiver)).ah)).nextInt(((int)(__sourceIntrinsic_ac18fb94f76afd8b_originalDynamicSite837_42(4813, (4597674072199249137L ^ local9_life2))))))));
    }
    return;
}


public EntityFireworkRocket(net.minecraft.world.World p0) {
super(p0);
    (this).a__Void(0x1.0000000000000p-2f, 0x1.0000000000000p-2f);
}


static {
bb = ((long)(((moom._a)(moom._c.a(((long)(-3741157169997262158L)), ((long)(231150188860021177L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(41924679139407L)))));
    eb = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (net.minecraft.entity.item.EntityFireworkRocket.bb ^ 99227195117519L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1860_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1860_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1860_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1860_14 = new byte[8];
    (__sourceSpill1860_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1860_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1860_16 = __sourceSpill1860_14;
    ((javax.crypto.Cipher)(__sourceSpill1860_11)).init(((int)(__sourceSpill1860_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1860_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1860_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[7];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "î@gR¿âù£\020¾/Ç\0367I\027íFÌ©ß÷Ø¸\005\034\tû&ýr²X"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1860_25 = local6_life21;
        int __sourceSpill1860_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1860_25)).substring(((int)(__sourceSpill1860_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1860_30 = local8_life19;
        int __sourceSpill1860_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1860_33 = new byte[8];
        (__sourceSpill1860_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1860_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1860_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1860_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1860_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1860_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1860_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1860_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1860_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1860_34)).doFinal(((byte[])(__sourceSpill1860_33)));
        (__sourceSpill1860_30)[__sourceSpill1860_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "_É\006\nu\\vÿ°ä\023ß"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1860_38 = local6_life21;
        int __sourceSpill1860_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1860_38)).substring(((int)(__sourceSpill1860_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1860_43 = local8_life19;
        int __sourceSpill1860_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1860_46 = new byte[8];
        (__sourceSpill1860_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1860_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1860_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1860_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1860_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1860_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1860_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1860_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1860_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1860_47)).doFinal(((byte[])(__sourceSpill1860_46)));
        (__sourceSpill1860_43)[__sourceSpill1860_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    cb = ((long[])(local8_life19));
    db = ((java.lang.Integer[])(new java.lang.Integer[7]));
}

private static native <E extends Throwable> void __sourceConstructorInit_ac18fb94f76afd8b_0(net.minecraft.entity.item.EntityFireworkRocket a0, net.minecraft.world.World a1) throws E;

private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral11344_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/tz"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_c8f4d5a2df1a81(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 21258;
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
            throw new RuntimeException("moom/tz", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         db[var3] = var15;
      }

      return db[var3];
}


public boolean x__Boolean() {
return ((0) != 0);
}


public void c(net.minecraft.nbt.NBTTagCompound p0) {
net.minecraft.nbt.NBTTagCompound forwardValue5055_25_0;
    int spill5055_0;
    net.minecraft.nbt.NBTTagCompound spill5055_1;
    long life2_3;
    int life4_15;
    net.minecraft.nbt.NBTTagCompound life5_19;
    net.minecraft.item.ItemStack life6_29;
    forward_join_38: {
    forward_join_25: {
    life2_3 = (net.minecraft.entity.item.EntityFireworkRocket.bb ^ 28753198222193L);
    spill5055_0 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.b();
    this.aE = ((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Int(((java.lang.String)("Life")))));
    this.aF = ((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Int(((java.lang.String)("LifeTime")))));
    life4_15 = spill5055_0;
    life5_19 = ((net.minecraft.nbt.NBTTagCompound)(p0)).a__yw(((java.lang.String)("FireworksItem")));
    spill5055_1 = life5_19;
    if (!((life4_15 != 0))) {
        forwardValue5055_25_0 = spill5055_1;
        break forward_join_25;
    }
    if (!((spill5055_1 != null))) {
        break forward_join_38;
    }
    forwardValue5055_25_0 = life5_19;
    }
    life6_29 = __sourceExactCall_b20cc06766c170(((net.minecraft.nbt.NBTTagCompound)(forwardValue5055_25_0)));
    if (!((life6_29 != null))) {
        break forward_join_38;
    }
    ((net.minecraft.entity.DataWatcher)(this.al)).b(((int)(__sourceIntrinsic_01f4e1cd062e_invokedynamic5055_9(12373, (2286605392220167618L ^ life2_3)))), ((java.lang.Object)(life6_29)));
    }
    return;
}


public void d(net.minecraft.nbt.NBTTagCompound p0) {
long life2_3;
    net.minecraft.item.ItemStack life4_22;
    net.minecraft.nbt.NBTTagCompound life5_28;
    life2_3 = (net.minecraft.entity.item.EntityFireworkRocket.bb ^ 43166002942074L);
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Void(((java.lang.String)("Life")), ((int)(this.aE)));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Void(((java.lang.String)("LifeTime")), ((int)(this.aF)));
    life4_22 = ((net.minecraft.entity.DataWatcher)(this.al)).a__xW(((int)(__sourceIntrinsic_458405b53cd1_invokedynamic9309_6(1289, (8415838554471281555L ^ life2_3)))));
    if ((life4_22 != null)) {
        life5_28 = new net.minecraft.nbt.NBTTagCompound();
        ((net.minecraft.item.ItemStack)(life4_22)).a__yw(((net.minecraft.nbt.NBTTagCompound)(life5_28)));
        ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("FireworksItem")), ((net.minecraft.nbt.NBTBase)(life5_28)));
    }
    return;
}


protected void d__Void() {
long local1 = (net.minecraft.entity.item.EntityFireworkRocket.bb ^ 121140670330658L);
    ((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_a91ecd6db48f_originalDynamicSite1902_2(12373, (2286653742305730961L ^ local1)))), ((int)(5)));
    return;
}


public void d(double p0, double p1, double p2) {
int forwardValue5056_28_0;
    float forwardValue5056_37_0;
    int spill5056_0;
    int spill5056_1;
    float spill5056_2;
    net.minecraft.entity.item.EntityFireworkRocket spill5056_3;
    float spill5056_4;
    net.minecraft.entity.item.EntityFireworkRocket spill5056_5;
    float spill5056_6;
    long life7_3;
    int life9_8;
    float life10_49;
    forward_join_65: {
    forward_join_37: {
    forward_join_28: {
    life7_3 = (net.minecraft.entity.item.EntityFireworkRocket.bb ^ 42989709905603L);
    spill5056_0 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.b();
    this.t = ((double)(p0));
    life9_8 = spill5056_0;
    this.u = ((double)(p1));
    this.v = ((double)(p2));
    spill5056_1 = recovery.source.CarrierOps.fcmpl(((float)(this.z)), ((float)(0x0.0p0f)));
    if (!((life9_8 != 0))) {
        forwardValue5056_28_0 = spill5056_1;
        break forward_join_28;
    }
    if (!((spill5056_1 == 0))) {
        break forward_join_65;
    }
    spill5056_2 = this.y;
    if (!((life9_8 != 0))) {
        forwardValue5056_37_0 = spill5056_2;
        break forward_join_37;
    }
    forwardValue5056_28_0 = recovery.source.CarrierOps.fcmpl(((float)(spill5056_2)), ((float)(0x0.0p0f)));
    }
    if (!((forwardValue5056_28_0 == 0))) {
        break forward_join_65;
    }
    forwardValue5056_37_0 = moom.Dr.a__Float(((double)(((p0 * p0) + (p2 * p2)))));
    }
    life10_49 = forwardValue5056_37_0;
    spill5056_3 = this;
    net.minecraft.entity.item.EntityFireworkRocket __stackOp5056_11_0 = this;
    float __stackOp5056_11_1 = ((float) ((moom.Dr.b(((double)(p0)), ((double)(p2))) * 0x1.68p7d) / 0x1.921fb54442d18p1d));
    spill5056_4 = __stackOp5056_11_1;
    ((net.minecraft.entity.item.EntityFireworkRocket)(__stackOp5056_11_0)).w = ((float)(__stackOp5056_11_1));
    ((net.minecraft.entity.item.EntityFireworkRocket)(spill5056_3)).y = ((float)(spill5056_4));
    spill5056_5 = this;
    net.minecraft.entity.item.EntityFireworkRocket __stackOp5056_15_0 = this;
    float __stackOp5056_15_1 = ((float) ((moom.Dr.b(((double)(p1)), ((double)(((double) life10_49)))) * 0x1.68p7d) / 0x1.921fb54442d18p1d));
    spill5056_6 = __stackOp5056_15_1;
    ((net.minecraft.entity.item.EntityFireworkRocket)(__stackOp5056_15_0)).x = ((float)(__stackOp5056_15_1));
    ((net.minecraft.entity.item.EntityFireworkRocket)(spill5056_5)).z = ((float)(spill5056_6));
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public boolean a(double p0) {
int forwardValue5054_13_0;
    int forwardValue5054_15_0;
    int spill5054_0;
    long life3_3;
    int life5_5;
    forward_join_15: {
    forward_join_14: {
    forward_join_13: {
    life3_3 = (net.minecraft.entity.item.EntityFireworkRocket.bb ^ 82480084500316L);
    life5_5 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.b();
    spill5054_0 = recovery.source.CarrierOps.dcmpg(((double)(p0)), ((double)(0x1.0p12d)));
    if (!((life5_5 != 0))) {
        forwardValue5054_13_0 = spill5054_0;
        break forward_join_13;
    }
    if (!((spill5054_0 < 0))) {
        break forward_join_14;
    }
    forwardValue5054_13_0 = 1;
    }
    forwardValue5054_15_0 = forwardValue5054_13_0;
    break forward_join_15;
    }
    forwardValue5054_15_0 = 0;
    }
    return ((forwardValue5054_15_0) != 0);
}


public float a(float p0) {
return super.a(((float)(p0)));
}


public int a__Int(float p0) {
return super.a__Int(((float)(p0)));
}


public void a(byte p0) {
net.minecraft.item.ItemStack forwardValue5053_37_0;
    net.minecraft.item.ItemStack forwardValue5053_42_0;
    net.minecraft.entity.item.EntityFireworkRocket forwardValue5053_63_0;
    net.minecraft.entity.item.EntityFireworkRocket spill5053_0;
    net.minecraft.item.ItemStack spill5053_1;
    long life2_3;
    int life4_5;
    net.minecraft.item.ItemStack life5_38;
    net.minecraft.nbt.NBTTagCompound life6_40;
    forward_join_65: {
    forward_join_63: {
    forward_join_62: {
    forward_join_46: {
    forward_join_42: {
    forward_join_37: {
    life2_3 = (net.minecraft.entity.item.EntityFireworkRocket.bb ^ 9299177643808L);
    life4_5 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.c();
    if (!((life4_5 == 0))) {
        break forward_join_65;
    }
    if (!((p0 == __sourceIntrinsic_6121ff5511c4_invokedynamic5053_2(23567, (7100709331472180680L ^ life2_3))))) {
        break forward_join_62;
    }
    spill5053_0 = this;
    if (!((life4_5 == 0))) {
        forwardValue5053_63_0 = spill5053_0;
        break forward_join_63;
    }
    if (!(((net.minecraft.world.World)(((net.minecraft.entity.item.EntityFireworkRocket)(spill5053_0)).i)).G)) {
        break forward_join_62;
    }
    life5_38 = ((net.minecraft.entity.DataWatcher)(this.al)).a__xW(((int)(__sourceIntrinsic_6121ff5511c4_invokedynamic5053_6(12373, (2286620448261278099L ^ life2_3)))));
    life6_40 = null;
    spill5053_1 = life5_38;
    if (!((life4_5 == 0))) {
        forwardValue5053_37_0 = spill5053_1;
        break forward_join_37;
    }
    if (!((spill5053_1 != null))) {
        break forward_join_46;
    }
    forwardValue5053_37_0 = life5_38;
    }
    if (!((life4_5 == 0))) {
        forwardValue5053_42_0 = forwardValue5053_37_0;
        break forward_join_42;
    }
    if (!(((net.minecraft.item.ItemStack)(forwardValue5053_37_0)).e__Boolean())) {
        break forward_join_46;
    }
    forwardValue5053_42_0 = life5_38;
    }
    life6_40 = ((net.minecraft.nbt.NBTTagCompound)(((net.minecraft.item.ItemStack)(forwardValue5053_42_0)).a__yw())).a__yw(((java.lang.String)("Fireworks")));
    }
    ((net.minecraft.world.World)(this.i)).a(((double)(this.n)), ((double)(this.o)), ((double)(this.p)), ((double)(this.t)), ((double)(this.u)), ((double)(this.v)), ((net.minecraft.nbt.NBTTagCompound)(life6_40)));
    }
    forwardValue5053_63_0 = this;
    }
    __sourceIntrinsic_6121ff5511c4_call5053_19(forwardValue5053_63_0, p0);
    }
    return;
}


public void g__Void() {
int lexicalValue1575_205_0;
    int lexicalValue1575_248_0;
    int lexicalValue1575_255_0;
    net.minecraft.entity.item.EntityFireworkRocket lexicalValue1575_268_0;
    int spill1575_0;
    int spill1575_1;
    boolean spill1575_2;
    int spill1575_3;
    net.minecraft.entity.item.EntityFireworkRocket spill1575_4;
    long life1_3;
    int life3_19;
    float life4_58;
    lexical_join_274: {
    lexical_join_269: {
    lexical_join_268: {
    lexical_join_255: {
    lexical_join_248: {
    lexical_join_245: {
    lexical_join_205: {
    lexical_join_196: {
    lexical_join_179: {
    lexical_join_155: {
    lexical_join_137: {
    lexical_join_119: {
    lexical_join_101: {
    life1_3 = (net.minecraft.entity.item.EntityFireworkRocket.bb ^ 51496153375749L);
    this.M = ((double)(this.n));
    spill1575_0 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.c();
    this.N = ((double)(this.o));
    this.O = ((double)(this.p));
    super.g__Void();
    life3_19 = spill1575_0;
    net.minecraft.entity.item.EntityFireworkRocket __stackOp1575_9_0 = this;
    ((net.minecraft.entity.item.EntityFireworkRocket)(__stackOp1575_9_0)).t = ((double)((((net.minecraft.entity.item.EntityFireworkRocket)(__stackOp1575_9_0)).t * 0x1.2666666666666p0d)));
    net.minecraft.entity.item.EntityFireworkRocket __stackOp1575_12_0 = this;
    ((net.minecraft.entity.item.EntityFireworkRocket)(__stackOp1575_12_0)).v = ((double)((((net.minecraft.entity.item.EntityFireworkRocket)(__stackOp1575_12_0)).v * 0x1.2666666666666p0d)));
    net.minecraft.entity.item.EntityFireworkRocket __stackOp1575_15_0 = this;
    ((net.minecraft.entity.item.EntityFireworkRocket)(__stackOp1575_15_0)).u = ((double)((((net.minecraft.entity.item.EntityFireworkRocket)(__stackOp1575_15_0)).u + 0x1.47ae147ae147bp-5d)));
    ((net.minecraft.entity.item.EntityFireworkRocket)(this)).b__Void(((double)(this.t)), ((double)(this.u)), ((double)(this.v)));
    life4_58 = moom.Dr.a__Float(((double)(((this.t * this.t) + (this.v * this.v)))));
    this.w = ((float)(((float) ((moom.Dr.b(((double)(this.t)), ((double)(this.v))) * 0x1.68p7d) / 0x1.921fb54442d18p1d))));
    this.x = ((float)(((float) ((moom.Dr.b(((double)(this.u)), ((double)(((double) life4_58)))) * 0x1.68p7d) / 0x1.921fb54442d18p1d))));
    lexical_cycle_83: while (true) {
    if (!((recovery.source.CarrierOps.fcmpg(((float)((this.x - this.z))), ((float)(-0x1.68p7f))) < 0))) {
        break lexical_join_101;
    }
    net.minecraft.entity.item.EntityFireworkRocket __stackOp1575_37_0 = this;
    ((net.minecraft.entity.item.EntityFireworkRocket)(__stackOp1575_37_0)).z = ((float)((((net.minecraft.entity.item.EntityFireworkRocket)(__stackOp1575_37_0)).z - 0x1.68p8f)));
    if (!((life3_19 == 0))) {
        break lexical_join_119;
    }
    if (!((life3_19 != 0))) { continue lexical_cycle_83; }
    break lexical_cycle_83;
    }
    }
    lexical_cycle_101: while (true) {
    if (!((recovery.source.CarrierOps.fcmpl(((float)((this.x - this.z))), ((float)(0x1.68p7f))) >= 0))) {
        break lexical_join_119;
    }
    net.minecraft.entity.item.EntityFireworkRocket __stackOp1575_43_0 = this;
    ((net.minecraft.entity.item.EntityFireworkRocket)(__stackOp1575_43_0)).z = ((float)((((net.minecraft.entity.item.EntityFireworkRocket)(__stackOp1575_43_0)).z + 0x1.68p8f)));
    if (!((life3_19 == 0))) {
        break lexical_join_137;
    }
    if (!((life3_19 != 0))) { continue lexical_cycle_101; }
    break lexical_cycle_101;
    }
    }
    lexical_cycle_119: while (true) {
    if (!((recovery.source.CarrierOps.fcmpg(((float)((this.w - this.y))), ((float)(-0x1.68p7f))) < 0))) {
        break lexical_join_137;
    }
    net.minecraft.entity.item.EntityFireworkRocket __stackOp1575_49_0 = this;
    ((net.minecraft.entity.item.EntityFireworkRocket)(__stackOp1575_49_0)).y = ((float)((((net.minecraft.entity.item.EntityFireworkRocket)(__stackOp1575_49_0)).y - 0x1.68p8f)));
    if (!((life3_19 == 0))) {
        break lexical_join_179;
    }
    if (!((life3_19 != 0))) { continue lexical_cycle_119; }
    break lexical_cycle_119;
    }
    }
    lexical_cycle_137: while (true) {
    if (!((recovery.source.CarrierOps.fcmpl(((float)((this.w - this.y))), ((float)(0x1.68p7f))) >= 0))) {
        break lexical_join_155;
    }
    net.minecraft.entity.item.EntityFireworkRocket __stackOp1575_55_0 = this;
    ((net.minecraft.entity.item.EntityFireworkRocket)(__stackOp1575_55_0)).y = ((float)((((net.minecraft.entity.item.EntityFireworkRocket)(__stackOp1575_55_0)).y + 0x1.68p8f)));
    if (!((life3_19 == 0))) {
        break lexical_join_179;
    }
    if (!((life3_19 != 0))) { continue lexical_cycle_137; }
    break lexical_cycle_137;
    }
    }
    this.x = ((float)((this.z + ((this.x - this.z) * 0x1.99999ap-3f))));
    this.w = ((float)((this.y + ((this.w - this.y) * 0x1.99999ap-3f))));
    }
    spill1575_1 = this.aE;
    if (!((life3_19 == 0))) {
        lexicalValue1575_205_0 = spill1575_1;
        break lexical_join_205;
    }
    if (!((spill1575_1 == 0))) {
        break lexical_join_196;
    }
    spill1575_2 = ((net.minecraft.entity.item.EntityFireworkRocket)(this)).f__Boolean();
    if (!((life3_19 == 0))) {
        lexicalValue1575_205_0 = ((spill1575_2) ? 1 : 0);
        break lexical_join_205;
    }
    if (!((!spill1575_2))) {
        break lexical_join_196;
    }
    ((net.minecraft.world.World)(this.i)).a(((net.minecraft.entity.Entity)(this)), ((java.lang.String)("fireworks.launch")), ((float)(0x1.8p1f)), ((float)(0x1.0p0f)));
    }
    net.minecraft.entity.item.EntityFireworkRocket __stackOp1575_71_0 = this;
    ((net.minecraft.entity.item.EntityFireworkRocket)(__stackOp1575_71_0)).aE = ((int)((((net.minecraft.entity.item.EntityFireworkRocket)(__stackOp1575_71_0)).aE + 1)));
    lexicalValue1575_205_0 = ((((net.minecraft.world.World)(this.i)).G) ? 1 : 0);
    }
    if (!((life3_19 == 0))) {
        lexicalValue1575_248_0 = lexicalValue1575_205_0;
        break lexical_join_248;
    }
    if (!((lexicalValue1575_205_0 != 0))) {
        break lexical_join_245;
    }
    spill1575_3 = (this.aE % 2);
    if (!((life3_19 == 0))) {
        lexicalValue1575_248_0 = spill1575_3;
        break lexical_join_248;
    }
    if (!((spill1575_3 < 2))) {
        break lexical_join_245;
    }
    ((net.minecraft.world.World)(this.i)).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.FIREWORKS_SPARK)), ((double)(this.n)), ((double)((this.o - 0x1.3333333333333p-2d))), ((double)(this.p)), ((double)((((java.util.Random)(this.ah)).nextGaussian() * 0x1.999999999999ap-5d))), ((double)(((-this.u) * 0x1.0p-1d))), ((double)((((java.util.Random)(this.ah)).nextGaussian() * 0x1.999999999999ap-5d))), ((int[])(new int[0])));
    }
    lexicalValue1575_248_0 = ((((net.minecraft.world.World)(this.i)).G) ? 1 : 0);
    }
    if (!((life3_19 == 0))) {
        lexicalValue1575_255_0 = lexicalValue1575_248_0;
        break lexical_join_255;
    }
    if (!((lexicalValue1575_248_0 == 0))) {
        break lexical_join_269;
    }
    spill1575_4 = this;
    if (!((life3_19 == 0))) {
        lexicalValue1575_268_0 = spill1575_4;
        break lexical_join_268;
    }
    lexicalValue1575_255_0 = ((net.minecraft.entity.item.EntityFireworkRocket)(spill1575_4)).aE;
    }
    if (!((lexicalValue1575_255_0 > this.aF))) {
        break lexical_join_269;
    }
    ((net.minecraft.world.World)(this.i)).a(((net.minecraft.entity.Entity)(this)), ((byte)(__sourceIntrinsic_736a66cda11e_invokedynamic1575_95(9887, (1508374543111873662L ^ life1_3)))));
    lexicalValue1575_268_0 = this;
    }
    ((net.minecraft.entity.item.EntityFireworkRocket)(lexicalValue1575_268_0)).f__Void();
    }
    if (!((net.minecraft.entity.Entity.b__ArrayString() != null))) {
        break lexical_join_274;
    }
    life3_19 += 1;
    net.minecraft.entity.item.EntityMinecart$EnumMinecartType.b(((int)(life3_19)));
    }
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_ac18fb94f76afd8b_originalDynamicSite837_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ac18fb94f76afd8b_originalDynamicSite837_35(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ac18fb94f76afd8b_originalDynamicSite837_38(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ac18fb94f76afd8b_originalDynamicSite837_42(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6121ff5511c4_invokedynamic5053_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6121ff5511c4_invokedynamic5053_6(int a0, long a1) throws E;

private static native <E extends Throwable> void __sourceIntrinsic_6121ff5511c4_call5053_19(net.minecraft.entity.item.EntityFireworkRocket a0, byte a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral11344_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01f4e1cd062e_invokedynamic5055_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_458405b53cd1_invokedynamic9309_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a91ecd6db48f_originalDynamicSite1902_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_736a66cda11e_invokedynamic1575_95(int a0, long a1) throws E;

private static native int __sourceExactCall_c8f4d5a2df1a81(int p0, long p1);
private static native net.minecraft.item.ItemStack __sourceExactCall_b20cc06766c170(net.minecraft.nbt.NBTTagCompound p0);

private static native byte __sourceExactCall_f99951980aa424(net.minecraft.nbt.NBTTagCompound p0, java.lang.String p1);
}
