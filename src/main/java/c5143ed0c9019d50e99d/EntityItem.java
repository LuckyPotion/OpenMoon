package net.minecraft.entity.item;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class EntityItem extends net.minecraft.entity.Entity {

private static org.apache.logging.log4j.Logger aE;

private int aF;

private int aG;

private int aH;

private java.lang.String aI;

private java.lang.String aJ;

public float aK;

private static long bb;

private static long[] cb;

private static java.lang.Integer[] db;

private static java.util.Map eb;

public EntityItem(net.minecraft.world.World p0) { super((net.minecraft.world.World)null); }


private static void __sourceConstructorBody_af2be633e6f84bc9(net.minecraft.entity.item.EntityItem receiver, net.minecraft.world.World p0) throws Throwable {

long local2 = (net.minecraft.entity.item.EntityItem.bb ^ 12564389654913L);

    net.minecraft.entity.item.EntityItem.__sourceConstructorInit_af2be633e6f84bc9_0(((net.minecraft.entity.item.EntityItem)(receiver)), ((net.minecraft.world.World)(p0)));

    ((net.minecraft.entity.item.EntityItem)(receiver)).aH = ((int)(__sourceIntrinsic_af2be633e6f84bc9_originalDynamicSite3844_2(20099, (6812614128889966192L ^ local2))));

    ((net.minecraft.entity.item.EntityItem)(receiver)).aK = ((float)(((float) ((java.lang.Math.random() * 0x1.921fb54442d18p1d) * 0x1.0p1d))));

    ((net.minecraft.entity.item.EntityItem)(receiver)).a__Void(((float)(0x1.0p-2f)), ((float)(0x1.0p-2f)));

    ((net.minecraft.entity.item.EntityItem)(receiver)).a(((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.a, 0))));

    return;

}



public EntityItem(net.minecraft.world.World p0, double p1, double p2, double p3, net.minecraft.item.ItemStack p4) {
this(((net.minecraft.world.World)(p0)), ((double)(p1)), ((double)(p2)), ((double)(p3)));
    ((net.minecraft.entity.item.EntityItem)(this)).a(((net.minecraft.item.ItemStack)(p4)));
    return;
}


public EntityItem(net.minecraft.world.World p0, double p1, double p2, double p3) { super((net.minecraft.world.World)null); }


private static void __sourceConstructorBody_70f69b65dad1f4b5(net.minecraft.entity.item.EntityItem receiver, net.minecraft.world.World p0, double p1, double p2, double p3) throws Throwable {

long local8 = (net.minecraft.entity.item.EntityItem.bb ^ 37669187956552L);

    net.minecraft.entity.item.EntityItem.__sourceConstructorInit_70f69b65dad1f4b5_0(((net.minecraft.entity.item.EntityItem)(receiver)), ((net.minecraft.world.World)(p0)));

    ((net.minecraft.entity.item.EntityItem)(receiver)).aH = ((int)(__sourceIntrinsic_70f69b65dad1f4b5_originalDynamicSite3846_2(9990, (4927720847795853621L ^ local8))));

    ((net.minecraft.entity.item.EntityItem)(receiver)).aK = ((float)(((float) ((java.lang.Math.random() * 0x1.921fb54442d18p1d) * 0x1.0p1d))));

    ((net.minecraft.entity.item.EntityItem)(receiver)).a__Void(((float)(0x1.0p-2f)), ((float)(0x1.0p-2f)));

    ((net.minecraft.entity.item.EntityItem)(receiver)).a__Void(((double)(p1)), ((double)(p2)), ((double)(p3)));

    ((net.minecraft.entity.item.EntityItem)(receiver)).w = ((float)(((float) (java.lang.Math.random() * 0x1.68p8d))));

    ((net.minecraft.entity.item.EntityItem)(receiver)).t = ((double)(((double) ((float) ((java.lang.Math.random() * 0x1.99999ap-3d) - 0x1.99999ap-4d)))));

    ((net.minecraft.entity.item.EntityItem)(receiver)).u = ((double)(0x1.99999ap-3d));

    ((net.minecraft.entity.item.EntityItem)(receiver)).v = ((double)(((double) ((float) ((java.lang.Math.random() * 0x1.99999ap-3d) - 0x1.99999ap-4d)))));

    return;

}



static {
bb = ((long)(((moom._a)(moom._c.a(((long)(-5631934902227940921L)), ((long)(5287446817242704729L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(258192649472219L)))));
    eb = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (net.minecraft.entity.item.EntityItem.bb ^ 118702547126315L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1861_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1861_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1861_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1861_14 = new byte[8];
    (__sourceSpill1861_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1861_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1861_16 = __sourceSpill1861_14;
    ((javax.crypto.Cipher)(__sourceSpill1861_11)).init(((int)(__sourceSpill1861_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1861_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1861_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[16];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "n7¼Wº®J´õ ct8Ä¿¨M\013ÆÞ\030\\d7²\020níº\032#sõ©·Ø\017\003ô)]UÒM\177fê<V:øFúé=(³aoh^P\020\037\006Ã\027$êþCù?Q\021ã\022ZªÈ@K\033\013 :l\\\030ÏP\013Þ2Î"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1861_25 = local6_life21;
        int __sourceSpill1861_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1861_25)).substring(((int)(__sourceSpill1861_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1861_30 = local8_life19;
        int __sourceSpill1861_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1861_33 = new byte[8];
        (__sourceSpill1861_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1861_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1861_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1861_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1861_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1861_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1861_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1861_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1861_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1861_34)).doFinal(((byte[])(__sourceSpill1861_33)));
        (__sourceSpill1861_30)[__sourceSpill1861_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "×ý»\002µEmÏR9ÑmY"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1861_38 = local6_life21;
        int __sourceSpill1861_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1861_38)).substring(((int)(__sourceSpill1861_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1861_43 = local8_life19;
        int __sourceSpill1861_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1861_46 = new byte[8];
        (__sourceSpill1861_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1861_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1861_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1861_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1861_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1861_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1861_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1861_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1861_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1861_47)).doFinal(((byte[])(__sourceSpill1861_46)));
        (__sourceSpill1861_43)[__sourceSpill1861_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    cb = ((long[])(local8_life19));
    db = ((java.lang.Integer[])(new java.lang.Integer[16]));
    aE = ((org.apache.logging.log4j.Logger)(org.apache.logging.log4j.LogManager.getLogger()));
}

private static native <E extends Throwable> void __sourceConstructorInit_af2be633e6f84bc9_0(net.minecraft.entity.item.EntityItem a0, net.minecraft.world.World a1) throws E;
private static native <E extends Throwable> void __sourceConstructorInit_70f69b65dad1f4b5_0(net.minecraft.entity.item.EntityItem a0, net.minecraft.world.World a1) throws E;

private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral11351_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/tA"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public java.lang.String b__sourceReturn_0e30dfc966() {
return this.aJ;
}


public void b(java.lang.String p0) {
this.aJ = ((java.lang.String)(p0));
    return;
}


public boolean b__Boolean() {
int forwardValue5063_12_0;
    int forwardValue5063_14_0;
    int spill5063_0;
    long life1_3;
    int life3_5;
    forward_join_14: {
    forward_join_13: {
    forward_join_12: {
    life1_3 = (net.minecraft.entity.item.EntityItem.bb ^ 53077082541410L);
    life3_5 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.b();
    spill5063_0 = this.aG;
    if (!((life3_5 != 0))) {
        forwardValue5063_12_0 = spill5063_0;
        break forward_join_12;
    }
    if (!((spill5063_0 > 0))) {
        break forward_join_13;
    }
    forwardValue5063_12_0 = 1;
    }
    forwardValue5063_14_0 = forwardValue5063_12_0;
    break forward_join_14;
    }
    forwardValue5063_14_0 = 0;
    }
    return ((forwardValue5063_14_0) != 0);
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.entity.item.EntityItem.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 18224;
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
            throw new RuntimeException("moom/tA", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         db[var3] = var15;
      }

      return db[var3];
}


public void b__Void() {
long local1 = (net.minecraft.entity.item.EntityItem.bb ^ 134024240775824L);
    this.aF = ((int)(__sourceIntrinsic_9bf881b104f5_originalDynamicSite1903_1(17236, (8884854384555987120L ^ local1))));
    return;
}


public void e(int p0) {
net.minecraft.entity.item.EntityItem forwardValue5067_16_0;
    int spill5067_0;
    net.minecraft.entity.item.EntityItem spill5067_1;
    long life2_3;
    int life4_8;
    forward_join_17: {
    forward_join_16: {
    life2_3 = (net.minecraft.entity.item.EntityItem.bb ^ 137022677928167L);
    spill5067_0 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.b();
    super.e(((int)(p0)));
    life4_8 = spill5067_0;
    spill5067_1 = this;
    if (!((life4_8 != 0))) {
        forwardValue5067_16_0 = spill5067_1;
        break forward_join_16;
    }
    if (!((!((net.minecraft.world.World)(((net.minecraft.entity.item.EntityItem)(spill5067_1)).i)).G))) {
        break forward_join_17;
    }
    forwardValue5067_16_0 = this;
    }
    ((net.minecraft.entity.item.EntityItem)(forwardValue5067_16_0)).a__Void();
    }
    return;
}


public boolean x__Boolean() {
return ((0) != 0);
}


public void x() {
this.aG = ((int)(0));
    return;
}


public java.lang.String c__sourceReturn_0e30dfc966() {
return this.aI;
}


public void c(java.lang.String p0) {
this.aI = ((java.lang.String)(p0));
    return;
}


public void c(net.minecraft.nbt.NBTTagCompound p0) {
int forwardValue5064_36_0;
    int forwardValue5064_49_0;
    net.minecraft.nbt.NBTTagCompound forwardValue5064_57_0;
    java.lang.String forwardValue5064_57_1;
    net.minecraft.entity.item.EntityItem forwardValue5064_69_0;
    int spill5064_0;
    boolean spill5064_1;
    net.minecraft.nbt.NBTTagCompound spill5064_2;
    java.lang.String spill5064_3;
    net.minecraft.entity.item.EntityItem spill5064_4;
    long life2_3;
    int life4_21;
    net.minecraft.nbt.NBTTagCompound life5_76;
    forward_join_70: {
    forward_join_69: {
    forward_join_57: {
    forward_join_55: {
    forward_join_49: {
    forward_join_44: {
    forward_join_36: {
    forward_join_33: {
    life2_3 = (net.minecraft.entity.item.EntityItem.bb ^ 114930743879894L);
    spill5064_0 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.b();
    this.aH = ((int)((((net.minecraft.nbt.NBTTagCompound)(p0)).a__Short(((java.lang.String)("Health"))) & __sourceIntrinsic_01f4e1cd062e_invokedynamic5064_3(22483, (2103784967533391472L ^ life2_3)))));
    this.aF = ((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Short(((java.lang.String)("Age")))));
    life4_21 = spill5064_0;
    spill5064_1 = ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Boolean(((java.lang.String)("PickupDelay")));
    if (!((life4_21 != 0))) {
        forwardValue5064_36_0 = ((spill5064_1) ? 1 : 0);
        break forward_join_36;
    }
    if (!(spill5064_1)) {
        break forward_join_33;
    }
    this.aG = ((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Short(((java.lang.String)("PickupDelay")))));
    }
    forwardValue5064_36_0 = ((((net.minecraft.nbt.NBTTagCompound)(p0)).a__Boolean(((java.lang.String)("Owner")))) ? 1 : 0);
    }
    if (!((life4_21 != 0))) {
        forwardValue5064_49_0 = forwardValue5064_36_0;
        break forward_join_49;
    }
    if (!((forwardValue5064_36_0 != 0))) {
        break forward_join_44;
    }
    this.aJ = ((java.lang.String)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__String(((java.lang.String)("Owner")))));
    }
    spill5064_2 = p0;
    spill5064_3 = "Thrower";
    if (!((life4_21 != 0))) {
        forwardValue5064_57_0 = spill5064_2;
        forwardValue5064_57_1 = spill5064_3;
        break forward_join_57;
    }
    forwardValue5064_49_0 = ((((net.minecraft.nbt.NBTTagCompound)(spill5064_2)).a__Boolean(((java.lang.String)(spill5064_3)))) ? 1 : 0);
    }
    if (!((forwardValue5064_49_0 != 0))) {
        break forward_join_55;
    }
    this.aI = ((java.lang.String)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__String(((java.lang.String)("Thrower")))));
    }
    forwardValue5064_57_0 = p0;
    forwardValue5064_57_1 = "Item";
    }
    life5_76 = ((net.minecraft.nbt.NBTTagCompound)(forwardValue5064_57_0)).a__yw(((java.lang.String)(forwardValue5064_57_1)));
    ((net.minecraft.entity.item.EntityItem)(this)).a(((net.minecraft.item.ItemStack)(net.minecraft.item.ItemStack.a(((net.minecraft.nbt.NBTTagCompound)(life5_76))))));
    spill5064_4 = this;
    if (!((life4_21 != 0))) {
        forwardValue5064_69_0 = spill5064_4;
        break forward_join_69;
    }
    if (!((((net.minecraft.entity.item.EntityItem)(spill5064_4)).a__xW() == null))) {
        break forward_join_70;
    }
    forwardValue5064_69_0 = this;
    }
    ((net.minecraft.entity.item.EntityItem)(forwardValue5064_69_0)).f__Void();
    }
    return;
}


protected void c(int p0) {
((net.minecraft.entity.item.EntityItem)(this)).a__Boolean(((net.minecraft.util.DamageSource)(net.minecraft.util.DamageSource.a)), ((float)(((float) p0))));
    return;
}


public void d(net.minecraft.nbt.NBTTagCompound p0) {
java.lang.String forwardValue5066_39_0;
    net.minecraft.entity.item.EntityItem forwardValue5066_46_0;
    int spill5066_0;
    java.lang.String spill5066_1;
    net.minecraft.entity.item.EntityItem spill5066_2;
    long life2_3;
    int life4_18;
    forward_join_57: {
    forward_join_46: {
    forward_join_45: {
    forward_join_39: {
    forward_join_35: {
    life2_3 = (net.minecraft.entity.item.EntityItem.bb ^ 94436000707549L);
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("Health")), ((short)(((short) ((byte) this.aH)))));
    spill5066_0 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.c();
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("Age")), ((short)(((short) this.aF))));
    life4_18 = spill5066_0;
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("PickupDelay")), ((short)(((short) this.aG))));
    spill5066_1 = ((net.minecraft.entity.item.EntityItem)(this)).c__sourceReturn_0e30dfc966();
    if (!((life4_18 == 0))) {
        forwardValue5066_39_0 = spill5066_1;
        break forward_join_39;
    }
    if (!((spill5066_1 != null))) {
        break forward_join_35;
    }
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("Thrower")), ((java.lang.String)(this.aI)));
    }
    spill5066_2 = this;
    if (!((life4_18 == 0))) {
        forwardValue5066_46_0 = spill5066_2;
        break forward_join_46;
    }
    forwardValue5066_39_0 = ((net.minecraft.entity.item.EntityItem)(spill5066_2)).b__sourceReturn_0e30dfc966();
    }
    if (!((forwardValue5066_39_0 != null))) {
        break forward_join_45;
    }
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("Owner")), ((java.lang.String)(this.aJ)));
    }
    forwardValue5066_46_0 = this;
    }
    if (!((((net.minecraft.entity.item.EntityItem)(forwardValue5066_46_0)).a__xW() != null))) {
        break forward_join_57;
    }
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("Item")), ((net.minecraft.nbt.NBTBase)(((net.minecraft.item.ItemStack)(((net.minecraft.entity.item.EntityItem)(this)).a__xW())).a__yw(((net.minecraft.nbt.NBTTagCompound)(new net.minecraft.nbt.NBTTagCompound()))))));
    }
    return;
}


public void d(net.minecraft.entity.player.EntityPlayer p0) {
net.minecraft.entity.item.EntityItem forwardValue5065_13_0;
    net.minecraft.entity.item.EntityItem forwardValue5065_24_0;
    int forwardValue5065_54_0;
    net.minecraft.item.Item forwardValue5065_69_0;
    net.minecraft.item.Item forwardValue5065_69_1;
    net.minecraft.item.Item forwardValue5065_78_0;
    net.minecraft.item.Item forwardValue5065_78_1;
    net.minecraft.item.Item forwardValue5065_87_0;
    net.minecraft.item.Item forwardValue5065_87_1;
    net.minecraft.item.Item forwardValue5065_96_0;
    net.minecraft.item.Item forwardValue5065_96_1;
    net.minecraft.item.Item forwardValue5065_105_0;
    net.minecraft.item.Item forwardValue5065_105_1;
    net.minecraft.entity.player.EntityPlayer forwardValue5065_127_0;
    net.minecraft.entity.item.EntityItem forwardValue5065_130_0;
    int forwardValue5065_159_0;
    net.minecraft.entity.item.EntityItem spill5065_0;
    net.minecraft.entity.item.EntityItem spill5065_1;
    int spill5065_2;
    boolean spill5065_3;
    net.minecraft.item.Item spill5065_4;
    net.minecraft.item.Item spill5065_5;
    net.minecraft.entity.item.EntityItem spill5065_6;
    net.minecraft.entity.item.EntityItem spill5065_7;
    net.minecraft.entity.player.EntityPlayer spill5065_8;
    boolean spill5065_9;
    long life2_3;
    int life4_5;
    net.minecraft.item.ItemStack life5_20;
    int life6_23;
    net.minecraft.entity.player.EntityPlayer life7_187;
    forward_join_162: {
    forward_join_159: {
    forward_join_153: {
    forward_join_130: {
    forward_join_129: {
    forward_join_127: {
    forward_join_105: {
    forward_join_102: {
    forward_join_96: {
    forward_join_93: {
    forward_join_87: {
    forward_join_84: {
    forward_join_78: {
    forward_join_75: {
    forward_join_69: {
    forward_join_65: {
    forward_join_54: {
    forward_join_50: {
    forward_join_24: {
    forward_join_13: {
    life2_3 = (net.minecraft.entity.item.EntityItem.bb ^ 20445860508720L);
    life4_5 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.b();
    spill5065_0 = this;
    if (!((life4_5 != 0))) {
        forwardValue5065_13_0 = spill5065_0;
        break forward_join_13;
    }
    if (!((!((net.minecraft.world.World)(((net.minecraft.entity.item.EntityItem)(spill5065_0)).i)).G))) {
        break forward_join_162;
    }
    forwardValue5065_13_0 = this;
    }
    life5_20 = ((net.minecraft.entity.item.EntityItem)(forwardValue5065_13_0)).a__xW();
    life6_23 = ((net.minecraft.item.ItemStack)(life5_20)).b;
    spill5065_1 = this;
    if (!((life4_5 != 0))) {
        forwardValue5065_24_0 = spill5065_1;
        break forward_join_24;
    }
    if (!((((net.minecraft.entity.item.EntityItem)(spill5065_1)).aG == 0))) {
        break forward_join_162;
    }
    forwardValue5065_24_0 = this;
    }
    if (!((((net.minecraft.entity.item.EntityItem)(forwardValue5065_24_0)).aJ != null))) {
        break forward_join_50;
    }
    spill5065_2 = (__sourceIntrinsic_8bd60d12af02_invokedynamic5065_8(711, (1330080444998068111L ^ life2_3)) - this.aF);
    if (!((life4_5 != 0))) {
        forwardValue5065_54_0 = spill5065_2;
        break forward_join_54;
    }
    if (!((spill5065_2 > __sourceIntrinsic_8bd60d12af02_invokedynamic5065_10(31457, (3382026830681464750L ^ life2_3))))) {
        break forward_join_50;
    }
    spill5065_3 = ((java.lang.String)(this.aJ)).equals(((java.lang.Object)(((net.minecraft.entity.player.EntityPlayer)(p0)).a__String())));
    if (!((life4_5 != 0))) {
        forwardValue5065_54_0 = ((spill5065_3) ? 1 : 0);
        break forward_join_54;
    }
    if (!(spill5065_3)) {
        break forward_join_162;
    }
    }
    forwardValue5065_54_0 = ((((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.entity.player.EntityPlayer)(p0)).bD)).a__Boolean(((net.minecraft.item.ItemStack)(life5_20)))) ? 1 : 0);
    }
    if (!((forwardValue5065_54_0 != 0))) {
        break forward_join_162;
    }
    spill5065_4 = ((net.minecraft.item.ItemStack)(life5_20)).a__wQ();
    spill5065_5 = net.minecraft.item.Item.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.r)));
    if (!((life4_5 != 0))) {
        forwardValue5065_69_0 = spill5065_4;
        forwardValue5065_69_1 = spill5065_5;
        break forward_join_69;
    }
    if (!((spill5065_4 == spill5065_5))) {
        break forward_join_65;
    }
    ((net.minecraft.entity.player.EntityPlayer)(p0)).a(((moom.BY)(net.minecraft.stats.AchievementList.g)));
    }
    forwardValue5065_69_0 = ((net.minecraft.item.ItemStack)(life5_20)).a__wQ();
    forwardValue5065_69_1 = net.minecraft.item.Item.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.s)));
    }
    if (!((life4_5 != 0))) {
        forwardValue5065_78_0 = forwardValue5065_69_0;
        forwardValue5065_78_1 = forwardValue5065_69_1;
        break forward_join_78;
    }
    if (!((forwardValue5065_69_0 == forwardValue5065_69_1))) {
        break forward_join_75;
    }
    ((net.minecraft.entity.player.EntityPlayer)(p0)).a(((moom.BY)(net.minecraft.stats.AchievementList.g)));
    }
    forwardValue5065_78_0 = ((net.minecraft.item.ItemStack)(life5_20)).a__wQ();
    forwardValue5065_78_1 = net.minecraft.init.Items.aF;
    }
    if (!((life4_5 != 0))) {
        forwardValue5065_87_0 = forwardValue5065_78_0;
        forwardValue5065_87_1 = forwardValue5065_78_1;
        break forward_join_87;
    }
    if (!((forwardValue5065_78_0 == forwardValue5065_78_1))) {
        break forward_join_84;
    }
    ((net.minecraft.entity.player.EntityPlayer)(p0)).a(((moom.BY)(net.minecraft.stats.AchievementList.t)));
    }
    forwardValue5065_87_0 = ((net.minecraft.item.ItemStack)(life5_20)).a__wQ();
    forwardValue5065_87_1 = net.minecraft.init.Items.i;
    }
    if (!((life4_5 != 0))) {
        forwardValue5065_96_0 = forwardValue5065_87_0;
        forwardValue5065_96_1 = forwardValue5065_87_1;
        break forward_join_96;
    }
    if (!((forwardValue5065_87_0 == forwardValue5065_87_1))) {
        break forward_join_93;
    }
    ((net.minecraft.entity.player.EntityPlayer)(p0)).a(((moom.BY)(net.minecraft.stats.AchievementList.w)));
    }
    forwardValue5065_96_0 = ((net.minecraft.item.ItemStack)(life5_20)).a__wQ();
    forwardValue5065_96_1 = net.minecraft.init.Items.bk;
    }
    if (!((life4_5 != 0))) {
        forwardValue5065_105_0 = forwardValue5065_96_0;
        forwardValue5065_105_1 = forwardValue5065_96_1;
        break forward_join_105;
    }
    if (!((forwardValue5065_96_0 == forwardValue5065_96_1))) {
        break forward_join_102;
    }
    ((net.minecraft.entity.player.EntityPlayer)(p0)).a(((moom.BY)(net.minecraft.stats.AchievementList.A)));
    }
    forwardValue5065_105_0 = ((net.minecraft.item.ItemStack)(life5_20)).a__wQ();
    forwardValue5065_105_1 = net.minecraft.init.Items.i;
    }
    if (!((forwardValue5065_105_0 == forwardValue5065_105_1))) {
        break forward_join_129;
    }
    spill5065_6 = this;
    if (!((life4_5 != 0))) {
        forwardValue5065_130_0 = spill5065_6;
        break forward_join_130;
    }
    if (!((((net.minecraft.entity.item.EntityItem)(spill5065_6)).c__sourceReturn_0e30dfc966() != null))) {
        break forward_join_129;
    }
    spill5065_7 = this;
    if (!((life4_5 != 0))) {
        forwardValue5065_130_0 = spill5065_7;
        break forward_join_130;
    }
    life7_187 = ((net.minecraft.world.World)(((net.minecraft.entity.item.EntityItem)(spill5065_7)).i)).a__tn(((java.lang.String)(((net.minecraft.entity.item.EntityItem)(this)).c__sourceReturn_0e30dfc966())));
    if (!((life7_187 != null))) {
        break forward_join_129;
    }
    spill5065_8 = life7_187;
    if (!((life4_5 != 0))) {
        forwardValue5065_127_0 = spill5065_8;
        break forward_join_127;
    }
    if (!((spill5065_8 != p0))) {
        break forward_join_129;
    }
    forwardValue5065_127_0 = life7_187;
    }
    ((net.minecraft.entity.player.EntityPlayer)(forwardValue5065_127_0)).a(((moom.BY)(net.minecraft.stats.AchievementList.x)));
    }
    forwardValue5065_130_0 = this;
    }
    spill5065_9 = ((net.minecraft.entity.item.EntityItem)(forwardValue5065_130_0)).f__Boolean();
    if (!((life4_5 != 0))) {
        forwardValue5065_159_0 = ((spill5065_9) ? 1 : 0);
        break forward_join_159;
    }
    if (!((!spill5065_9))) {
        break forward_join_153;
    }
    ((net.minecraft.world.World)(this.i)).a(((net.minecraft.entity.Entity)(p0)), ((java.lang.String)("random.pop")), ((float)(0x1.99999ap-3f)), ((float)(((((((java.util.Random)(this.ah)).nextFloat() - ((java.util.Random)(this.ah)).nextFloat()) * 0x1.666666p-1f) + 0x1.0p0f) * 0x1.0p1f))));
    }
    ((net.minecraft.entity.player.EntityPlayer)(p0)).b(((net.minecraft.entity.Entity)(this)), ((int)(life6_23)));
    forwardValue5065_159_0 = ((net.minecraft.item.ItemStack)(life5_20)).b;
    }
    if (!((forwardValue5065_159_0 <= 0))) {
        break forward_join_162;
    }
    ((net.minecraft.entity.item.EntityItem)(this)).f__Void();
    }
    return;
}


protected void d__Void() {
long local1 = (net.minecraft.entity.item.EntityItem.bb ^ 31389845836933L);
    ((net.minecraft.entity.DataWatcher)(((net.minecraft.entity.item.EntityItem)(this)).a__r1())).a(((int)(__sourceIntrinsic_a91ecd6db48f_originalDynamicSite1904_2(5122, (8799565691562611193L ^ local1)))), ((int)(5)));
    return;
}


private void a__Void() {
int spill1576_0;
    long life1_3;
    java.util.Iterator life4_16;
    int life3_17;
    net.minecraft.entity.item.EntityItem life5_24;
    lexical_join_31: {
    life1_3 = (net.minecraft.entity.item.EntityItem.bb ^ 108849893158467L);
    spill1576_0 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.c();
    life4_16 = ((java.util.List)(((net.minecraft.world.World)(this.i)).a(((java.lang.Class)(net.minecraft.entity.item.EntityItem.class)), ((moom.CA)(((moom.CA)(((net.minecraft.entity.item.EntityItem)(this)).b())).b(((double)(0x1.0p-1d)), ((double)(0x0.0p0d)), ((double)(0x1.0p-1d)))))))).iterator();
    life3_17 = spill1576_0;
    lexical_cycle_18: while (true) {
    if (!(((java.util.Iterator)(life4_16)).hasNext())) {
        break lexical_join_31;
    }
    life5_24 = ((net.minecraft.entity.item.EntityItem)(((java.util.Iterator)(life4_16)).next()));
    ((net.minecraft.entity.item.EntityItem)(this)).a(((net.minecraft.entity.item.EntityItem)(life5_24)));
    if (!((life3_17 != 0))) { continue lexical_cycle_18; }
    break lexical_cycle_18;
    }
    }
    return;
}


public java.lang.String a__String() {
net.minecraft.entity.item.EntityItem forwardValue5060_15_0;
    java.lang.String forwardValue5060_19_0;
    net.minecraft.entity.item.EntityItem spill5060_0;
    long life1_3;
    int life3_5;
    forward_join_19: {
    forward_join_15: {
    forward_join_14: {
    life1_3 = (net.minecraft.entity.item.EntityItem.bb ^ 87539625762609L);
    life3_5 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.c();
    spill5060_0 = this;
    if (!((life3_5 == 0))) {
        forwardValue5060_15_0 = spill5060_0;
        break forward_join_15;
    }
    if (!(((net.minecraft.entity.item.EntityItem)(spill5060_0)).e__Boolean())) {
        break forward_join_14;
    }
    forwardValue5060_19_0 = ((net.minecraft.entity.item.EntityItem)(this)).g__String();
    break forward_join_19;
    }
    forwardValue5060_15_0 = this;
    }
    forwardValue5060_19_0 = net.minecraft.util.StatCollector.a(((java.lang.String)(__sourceIntrinsic_64ccfb84e285_invokedynamic5060_6(((net.minecraft.item.ItemStack)(((net.minecraft.entity.item.EntityItem)(forwardValue5060_15_0)).a__xW())).a__String()))));
    }
    return forwardValue5060_19_0;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public net.minecraft.item.ItemStack a__xW() {
net.minecraft.item.ItemStack forwardValue5062_33_0;
    int spill5062_0;
    net.minecraft.item.ItemStack spill5062_1;
    long life1_3;
    net.minecraft.item.ItemStack life4_13;
    int life3_14;
    forward_join_33: {
    forward_join_32: {
    forward_join_27: {
    life1_3 = (net.minecraft.entity.item.EntityItem.bb ^ 39257789156323L);
    spill5062_0 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.c();
    life4_13 = ((net.minecraft.entity.DataWatcher)(((net.minecraft.entity.item.EntityItem)(this)).a__r1())).a__xW(((int)(__sourceIntrinsic_e82a5b067497_invokedynamic5062_3(28368, (1887376835303879748L ^ life1_3)))));
    life3_14 = spill5062_0;
    spill5062_1 = life4_13;
    if (!((life3_14 == 0))) {
        forwardValue5062_33_0 = spill5062_1;
        break forward_join_33;
    }
    if (!((spill5062_1 == null))) {
        break forward_join_32;
    }
    if (!((this.i != null))) {
        break forward_join_27;
    }
    ((org.apache.logging.log4j.Logger)(net.minecraft.entity.item.EntityItem.aE)).error(((java.lang.String)(__sourceIntrinsic_e82a5b067497_invokedynamic5062_8(((net.minecraft.entity.item.EntityItem)(this)).e__Int()))));
    }
    return new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.b);
    }
    forwardValue5062_33_0 = life4_13;
    }
    return forwardValue5062_33_0;
}


public void a(net.minecraft.item.ItemStack p0) {
long local2 = (net.minecraft.entity.item.EntityItem.bb ^ 59492910116590L);
    ((net.minecraft.entity.DataWatcher)(((net.minecraft.entity.item.EntityItem)(this)).a__r1())).b(((int)(__sourceIntrinsic_5f56e65a234d_originalDynamicSite1905_2(28368, (1887389314015514953L ^ local2)))), ((java.lang.Object)(p0)));
    ((net.minecraft.entity.DataWatcher)(((net.minecraft.entity.item.EntityItem)(this)).a__r1())).a__Void(((int)(__sourceIntrinsic_5f56e65a234d_originalDynamicSite1905_5(28368, (1887389314015514953L ^ local2)))));
    return;
}


private boolean a(net.minecraft.entity.item.EntityItem p0) {
net.minecraft.entity.item.EntityItem forwardValue5058_14_0;
    net.minecraft.item.ItemStack forwardValue5058_79_0;
    int forwardValue5058_92_0;
    net.minecraft.item.ItemStack forwardValue5058_104_0;
    net.minecraft.item.Item forwardValue5058_112_0;
    int forwardValue5058_127_0;
    int forwardValue5058_129_0;
    int forwardValue5058_129_1;
    int forwardValue5058_145_0;
    int forwardValue5058_145_1;
    int forwardValue5058_175_0;
    int forwardValue5058_177_0;
    int forwardValue5058_179_0;
    int forwardValue5058_181_0;
    net.minecraft.entity.item.EntityItem spill5058_0;
    boolean spill5058_1;
    boolean spill5058_2;
    int spill5058_3;
    int spill5058_4;
    int spill5058_5;
    int spill5058_6;
    net.minecraft.item.ItemStack spill5058_7;
    int spill5058_8;
    net.minecraft.item.ItemStack spill5058_9;
    net.minecraft.item.ItemStack spill5058_10;
    net.minecraft.item.Item spill5058_11;
    boolean spill5058_12;
    int spill5058_13;
    int spill5058_14;
    int spill5058_15;
    long life2_3;
    int life4_5;
    net.minecraft.item.ItemStack life5_39;
    net.minecraft.item.ItemStack life6_42;
    forward_join_181: {
    forward_join_180: {
    forward_join_179: {
    forward_join_178: {
    forward_join_177: {
    forward_join_176: {
    forward_join_175: {
    forward_join_148: {
    forward_join_145: {
    forward_join_136: {
    forward_join_129: {
    forward_join_127: {
    forward_join_125: {
    forward_join_112: {
    forward_join_110: {
    forward_join_104: {
    forward_join_103: {
    forward_join_92: {
    forward_join_88: {
    forward_join_79: {
    forward_join_78: {
    forward_join_14: {
    forward_join_13: {
    life2_3 = (net.minecraft.entity.item.EntityItem.bb ^ 87677704089801L);
    life4_5 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.c();
    spill5058_0 = p0;
    if (!((life4_5 == 0))) {
        forwardValue5058_14_0 = spill5058_0;
        break forward_join_14;
    }
    if (!((spill5058_0 == this))) {
        break forward_join_13;
    }
    return ((0) != 0);
    }
    forwardValue5058_14_0 = p0;
    }
    spill5058_1 = ((net.minecraft.entity.item.EntityItem)(forwardValue5058_14_0)).p__Boolean();
    if (!((life4_5 == 0))) {
        forwardValue5058_181_0 = ((spill5058_1) ? 1 : 0);
        break forward_join_181;
    }
    if (!(spill5058_1)) {
        break forward_join_180;
    }
    spill5058_2 = ((net.minecraft.entity.item.EntityItem)(this)).p__Boolean();
    if (!((life4_5 == 0))) {
        forwardValue5058_181_0 = ((spill5058_2) ? 1 : 0);
        break forward_join_181;
    }
    if (!(spill5058_2)) {
        break forward_join_180;
    }
    life5_39 = ((net.minecraft.entity.item.EntityItem)(this)).a__xW();
    life6_42 = ((net.minecraft.entity.item.EntityItem)(p0)).a__xW();
    spill5058_3 = this.aG;
    if (!((life4_5 == 0))) {
        forwardValue5058_179_0 = spill5058_3;
        break forward_join_179;
    }
    if (!((spill5058_3 != __sourceIntrinsic_d37dc8eac5f9_invokedynamic5058_10(182, (7258524224233185548L ^ life2_3))))) {
        break forward_join_178;
    }
    spill5058_4 = ((net.minecraft.entity.item.EntityItem)(p0)).aG;
    if (!((life4_5 == 0))) {
        forwardValue5058_179_0 = spill5058_4;
        break forward_join_179;
    }
    if (!((spill5058_4 != __sourceIntrinsic_d37dc8eac5f9_invokedynamic5058_12(182, (7258524224233185548L ^ life2_3))))) {
        break forward_join_178;
    }
    spill5058_5 = this.aF;
    if (!((life4_5 == 0))) {
        forwardValue5058_177_0 = spill5058_5;
        break forward_join_177;
    }
    if (!((spill5058_5 != __sourceIntrinsic_d37dc8eac5f9_invokedynamic5058_14(12878, (4924152995645395959L ^ life2_3))))) {
        break forward_join_176;
    }
    spill5058_6 = ((net.minecraft.entity.item.EntityItem)(p0)).aF;
    if (!((life4_5 == 0))) {
        forwardValue5058_177_0 = spill5058_6;
        break forward_join_177;
    }
    if (!((spill5058_6 != __sourceIntrinsic_d37dc8eac5f9_invokedynamic5058_16(12878, (4924152995645395959L ^ life2_3))))) {
        break forward_join_176;
    }
    spill5058_7 = life6_42;
    if (!((life4_5 == 0))) {
        forwardValue5058_79_0 = spill5058_7;
        break forward_join_79;
    }
    if (!((((net.minecraft.item.ItemStack)(spill5058_7)).a__wQ() != ((net.minecraft.item.ItemStack)(life5_39)).a__wQ()))) {
        break forward_join_78;
    }
    return ((0) != 0);
    }
    forwardValue5058_79_0 = life6_42;
    }
    spill5058_8 = (((((net.minecraft.item.ItemStack)(forwardValue5058_79_0)).e__Boolean()) ? 1 : 0) ^ ((((net.minecraft.item.ItemStack)(life5_39)).e__Boolean()) ? 1 : 0));
    if (!((life4_5 == 0))) {
        forwardValue5058_92_0 = spill5058_8;
        break forward_join_92;
    }
    if (!((spill5058_8 != 0))) {
        break forward_join_88;
    }
    return ((0) != 0);
    }
    spill5058_9 = life6_42;
    if (!((life4_5 == 0))) {
        forwardValue5058_104_0 = spill5058_9;
        break forward_join_104;
    }
    forwardValue5058_92_0 = ((((net.minecraft.item.ItemStack)(spill5058_9)).e__Boolean()) ? 1 : 0);
    }
    if (!((forwardValue5058_92_0 != 0))) {
        break forward_join_103;
    }
    spill5058_10 = life6_42;
    if (!((life4_5 == 0))) {
        forwardValue5058_104_0 = spill5058_10;
        break forward_join_104;
    }
    if (!((!((net.minecraft.nbt.NBTTagCompound)(((net.minecraft.item.ItemStack)(spill5058_10)).a__yw())).equals(((java.lang.Object)(((net.minecraft.item.ItemStack)(life5_39)).a__yw())))))) {
        break forward_join_103;
    }
    return ((0) != 0);
    }
    forwardValue5058_104_0 = life6_42;
    }
    spill5058_11 = ((net.minecraft.item.ItemStack)(forwardValue5058_104_0)).a__wQ();
    if (!((life4_5 == 0))) {
        forwardValue5058_112_0 = spill5058_11;
        break forward_join_112;
    }
    if (!((spill5058_11 == null))) {
        break forward_join_110;
    }
    return ((0) != 0);
    }
    forwardValue5058_112_0 = ((net.minecraft.item.ItemStack)(life6_42)).a__wQ();
    }
    spill5058_12 = ((net.minecraft.item.Item)(forwardValue5058_112_0)).a__Boolean();
    if (!((life4_5 == 0))) {
        forwardValue5058_127_0 = ((spill5058_12) ? 1 : 0);
        break forward_join_127;
    }
    if (!(spill5058_12)) {
        break forward_join_125;
    }
    spill5058_13 = ((net.minecraft.item.ItemStack)(life6_42)).c();
    spill5058_14 = ((net.minecraft.item.ItemStack)(life5_39)).c();
    if (!((life4_5 == 0))) {
        forwardValue5058_129_0 = spill5058_13;
        forwardValue5058_129_1 = spill5058_14;
        break forward_join_129;
    }
    if (!((spill5058_13 != spill5058_14))) {
        break forward_join_125;
    }
    return ((0) != 0);
    }
    forwardValue5058_127_0 = ((net.minecraft.item.ItemStack)(life6_42)).b;
    }
    forwardValue5058_129_0 = forwardValue5058_127_0;
    forwardValue5058_129_1 = ((net.minecraft.item.ItemStack)(life5_39)).b;
    }
    if (!((life4_5 == 0))) {
        forwardValue5058_145_0 = forwardValue5058_129_0;
        forwardValue5058_145_1 = forwardValue5058_129_1;
        break forward_join_145;
    }
    if (!((forwardValue5058_129_0 < forwardValue5058_129_1))) {
        break forward_join_136;
    }
    return ((net.minecraft.entity.item.EntityItem)(p0)).a(((net.minecraft.entity.item.EntityItem)(this)));
    }
    spill5058_15 = (((net.minecraft.item.ItemStack)(life6_42)).b + ((net.minecraft.item.ItemStack)(life5_39)).b);
    if (!((life4_5 == 0))) {
        forwardValue5058_175_0 = spill5058_15;
        break forward_join_175;
    }
    forwardValue5058_145_0 = spill5058_15;
    forwardValue5058_145_1 = ((net.minecraft.item.ItemStack)(life6_42)).a();
    }
    if (!((forwardValue5058_145_0 > forwardValue5058_145_1))) {
        break forward_join_148;
    }
    return ((0) != 0);
    }
    net.minecraft.item.ItemStack __stackOp5058_44_0 = life6_42;
    ((net.minecraft.item.ItemStack)(__stackOp5058_44_0)).b = ((int)((((net.minecraft.item.ItemStack)(__stackOp5058_44_0)).b + ((net.minecraft.item.ItemStack)(life5_39)).b)));
    ((net.minecraft.entity.item.EntityItem)(p0)).aG = ((int)(java.lang.Math.max(((int)(((net.minecraft.entity.item.EntityItem)(p0)).aG)), ((int)(this.aG)))));
    ((net.minecraft.entity.item.EntityItem)(p0)).aF = ((int)(java.lang.Math.min(((int)(((net.minecraft.entity.item.EntityItem)(p0)).aF)), ((int)(this.aF)))));
    ((net.minecraft.entity.item.EntityItem)(p0)).a(((net.minecraft.item.ItemStack)(life6_42)));
    ((net.minecraft.entity.item.EntityItem)(this)).f__Void();
    forwardValue5058_175_0 = 1;
    }
    return ((forwardValue5058_175_0) != 0);
    }
    forwardValue5058_177_0 = 0;
    }
    return ((forwardValue5058_177_0) != 0);
    }
    forwardValue5058_179_0 = 0;
    }
    return ((forwardValue5058_179_0) != 0);
    }
    forwardValue5058_181_0 = 0;
    }
    return ((forwardValue5058_181_0) != 0);
}


public boolean a__Boolean(net.minecraft.util.DamageSource p0, float p1) {
net.minecraft.entity.item.EntityItem forwardValue5059_15_0;
    net.minecraft.entity.item.EntityItem forwardValue5059_44_0;
    int forwardValue5059_45_0;
    int forwardValue5059_51_0;
    net.minecraft.entity.item.EntityItem spill5059_0;
    net.minecraft.entity.item.EntityItem spill5059_1;
    boolean spill5059_2;
    long life3_3;
    int life5_5;
    forward_join_51: {
    forward_join_50: {
    forward_join_45: {
    forward_join_44: {
    forward_join_33: {
    forward_join_15: {
    forward_join_14: {
    life3_3 = (net.minecraft.entity.item.EntityItem.bb ^ 16832400140372L);
    life5_5 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.b();
    spill5059_0 = this;
    if (!((life5_5 != 0))) {
        forwardValue5059_15_0 = spill5059_0;
        break forward_join_15;
    }
    if (!(((net.minecraft.entity.item.EntityItem)(spill5059_0)).a(((net.minecraft.util.DamageSource)(p0))))) {
        break forward_join_14;
    }
    return ((0) != 0);
    }
    forwardValue5059_15_0 = this;
    }
    if (!((life5_5 != 0))) {
        forwardValue5059_44_0 = forwardValue5059_15_0;
        break forward_join_44;
    }
    if (!((((net.minecraft.entity.item.EntityItem)(forwardValue5059_15_0)).a__xW() != null))) {
        break forward_join_33;
    }
    spill5059_1 = this;
    if (!((life5_5 != 0))) {
        forwardValue5059_44_0 = spill5059_1;
        break forward_join_44;
    }
    if (!((((net.minecraft.item.ItemStack)(((net.minecraft.entity.item.EntityItem)(spill5059_1)).a__xW())).a__wQ() == net.minecraft.init.Items.bO))) {
        break forward_join_33;
    }
    spill5059_2 = ((net.minecraft.util.DamageSource)(p0)).b__Boolean();
    if (!((life5_5 != 0))) {
        forwardValue5059_45_0 = ((spill5059_2) ? 1 : 0);
        break forward_join_45;
    }
    if (!(spill5059_2)) {
        break forward_join_33;
    }
    return ((0) != 0);
    }
    ((net.minecraft.entity.item.EntityItem)(this)).q();
    this.aH = ((int)(((int) (((float) this.aH) - p1))));
    forwardValue5059_44_0 = this;
    }
    forwardValue5059_45_0 = ((net.minecraft.entity.item.EntityItem)(forwardValue5059_44_0)).aH;
    }
    if (!((life5_5 != 0))) {
        forwardValue5059_51_0 = forwardValue5059_45_0;
        break forward_join_51;
    }
    if (!((forwardValue5059_45_0 <= 0))) {
        break forward_join_50;
    }
    ((net.minecraft.entity.item.EntityItem)(this)).f__Void();
    }
    forwardValue5059_51_0 = 0;
    }
    return ((forwardValue5059_51_0) != 0);
}


public int a() {
return this.aF;
}


public boolean k__Boolean() {
net.minecraft.entity.item.EntityItem forwardValue5069_29_0;
    net.minecraft.entity.item.EntityItem forwardValue5069_34_0;
    net.minecraft.entity.item.EntityItem spill5069_0;
    net.minecraft.entity.item.EntityItem spill5069_1;
    net.minecraft.entity.item.EntityItem spill5069_2;
    long life1_3;
    int life3_5;
    forward_join_36: {
    forward_join_34: {
    forward_join_33: {
    forward_join_29: {
    forward_join_28: {
    life1_3 = (net.minecraft.entity.item.EntityItem.bb ^ 122821291749184L);
    life3_5 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.b();
    spill5069_0 = this;
    if (!((life3_5 != 0))) {
        forwardValue5069_34_0 = spill5069_0;
        break forward_join_34;
    }
    if (!(((net.minecraft.world.World)(((net.minecraft.entity.item.EntityItem)(spill5069_0)).i)).a(((moom.CA)(((net.minecraft.entity.item.EntityItem)(this)).b())), ((moom.fn)(moom.fn.h)), ((net.minecraft.entity.Entity)(this))))) {
        break forward_join_33;
    }
    spill5069_1 = this;
    if (!((life3_5 != 0))) {
        forwardValue5069_29_0 = spill5069_1;
        break forward_join_29;
    }
    if (!((!((net.minecraft.entity.item.EntityItem)(spill5069_1)).ai))) {
        break forward_join_28;
    }
    spill5069_2 = this;
    if (!((life3_5 != 0))) {
        forwardValue5069_29_0 = spill5069_2;
        break forward_join_29;
    }
    if (!((!((net.minecraft.entity.item.EntityItem)(spill5069_2)).aj))) {
        break forward_join_28;
    }
    ((net.minecraft.entity.item.EntityItem)(this)).n__Void();
    }
    forwardValue5069_29_0 = this;
    }
    ((net.minecraft.entity.item.EntityItem)(forwardValue5069_29_0)).ai = ((boolean)(true));
    if (!((life3_5 == 0))) {
        break forward_join_36;
    }
    }
    forwardValue5069_34_0 = this;
    }
    ((net.minecraft.entity.item.EntityItem)(forwardValue5069_34_0)).ai = ((boolean)(false));
    }
    return this.ai;
}


public void g__Void() {
net.minecraft.entity.item.EntityItem forwardValue5068_18_0;
    int forwardValue5068_84_0;
    int forwardValue5068_89_0;
    int forwardValue5068_89_1;
    int forwardValue5068_109_0;
    int forwardValue5068_111_0;
    int forwardValue5068_126_0;
    net.minecraft.entity.item.EntityItem forwardValue5068_128_0;
    net.minecraft.world.World forwardValue5068_182_0;
    net.minecraft.entity.item.EntityItem forwardValue5068_185_0;
    int forwardValue5068_238_0;
    int forwardValue5068_249_0;
    int forwardValue5068_269_0;
    int forwardValue5068_276_0;
    net.minecraft.entity.item.EntityItem forwardValue5068_283_0;
    net.minecraft.entity.item.EntityItem spill5068_0;
    int spill5068_1;
    int spill5068_2;
    int spill5068_3;
    int spill5068_4;
    int spill5068_5;
    int spill5068_6;
    net.minecraft.entity.item.EntityItem spill5068_7;
    net.minecraft.world.World spill5068_8;
    net.minecraft.entity.item.EntityItem spill5068_9;
    boolean spill5068_10;
    net.minecraft.entity.item.EntityItem spill5068_11;
    long life1_3;
    int life3_5;
    int life4_150;
    float life5_244;
    forward_join_284: {
    forward_join_283: {
    forward_join_276: {
    forward_join_269: {
    forward_join_263: {
    forward_join_249: {
    forward_join_247: {
    forward_join_238: {
    forward_join_216: {
    forward_join_186: {
    forward_join_185: {
    forward_join_182: {
    forward_join_178: {
    forward_join_128: {
    forward_join_127: {
    forward_join_126: {
    forward_join_111: {
    forward_join_110: {
    forward_join_109: {
    forward_join_108: {
    forward_join_89: {
    forward_join_84: {
    forward_join_38: {
    forward_join_18: {
    forward_join_15: {
    life1_3 = (net.minecraft.entity.item.EntityItem.bb ^ 101653955921826L);
    life3_5 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.c();
    spill5068_0 = this;
    if (!((life3_5 == 0))) {
        forwardValue5068_18_0 = spill5068_0;
        break forward_join_18;
    }
    if (!((((net.minecraft.entity.item.EntityItem)(spill5068_0)).a__xW() == null))) {
        break forward_join_15;
    }
    ((net.minecraft.entity.item.EntityItem)(this)).f__Void();
    if (!((life3_5 != 0))) {
        break forward_join_284;
    }
    }
    super.g__Void();
    forwardValue5068_18_0 = this;
    }
    spill5068_1 = ((net.minecraft.entity.item.EntityItem)(forwardValue5068_18_0)).aG;
    if (!((life3_5 == 0))) {
        forwardValue5068_84_0 = spill5068_1;
        break forward_join_84;
    }
    if (!((spill5068_1 > 0))) {
        break forward_join_38;
    }
    spill5068_2 = this.aG;
    spill5068_3 = __sourceIntrinsic_736a66cda11e_invokedynamic5068_7(17819, (1767202264272442176L ^ life1_3));
    if (!((life3_5 == 0))) {
        forwardValue5068_89_0 = spill5068_2;
        forwardValue5068_89_1 = spill5068_3;
        break forward_join_89;
    }
    if (!((spill5068_2 != spill5068_3))) {
        break forward_join_38;
    }
    net.minecraft.entity.item.EntityItem __stackOp5068_8_0 = this;
    ((net.minecraft.entity.item.EntityItem)(__stackOp5068_8_0)).aG = ((int)((((net.minecraft.entity.item.EntityItem)(__stackOp5068_8_0)).aG - 1)));
    }
    this.k = ((double)(this.n));
    this.l = ((double)(this.o));
    this.m = ((double)(this.p));
    net.minecraft.entity.item.EntityItem __stackOp5068_17_0 = this;
    ((net.minecraft.entity.item.EntityItem)(__stackOp5068_17_0)).u = ((double)((((net.minecraft.entity.item.EntityItem)(__stackOp5068_17_0)).u - 0x1.47ae14p-5d)));
    this.Q = ((boolean)(((net.minecraft.entity.item.EntityItem)(this)).c__Boolean(((double)(this.n)), ((double)(((((moom.CA)(((net.minecraft.entity.item.EntityItem)(this)).b())).c + ((moom.CA)(((net.minecraft.entity.item.EntityItem)(this)).b())).f) / 0x1.0p1d))), ((double)(this.p)))));
    ((net.minecraft.entity.item.EntityItem)(this)).b__Void(((double)(this.t)), ((double)(this.u)), ((double)(this.v)));
    forwardValue5068_84_0 = ((int) this.k);
    }
    if (!((life3_5 == 0))) {
        forwardValue5068_109_0 = forwardValue5068_84_0;
        break forward_join_109;
    }
    forwardValue5068_89_0 = forwardValue5068_84_0;
    forwardValue5068_89_1 = ((int) this.n);
    }
    if (!((forwardValue5068_89_0 == forwardValue5068_89_1))) {
        break forward_join_108;
    }
    spill5068_4 = ((int) this.l);
    if (!((life3_5 == 0))) {
        forwardValue5068_109_0 = spill5068_4;
        break forward_join_109;
    }
    if (!((spill5068_4 == ((int) this.o)))) {
        break forward_join_108;
    }
    spill5068_5 = ((int) this.m);
    if (!((life3_5 == 0))) {
        forwardValue5068_109_0 = spill5068_5;
        break forward_join_109;
    }
    if (!((spill5068_5 != ((int) this.p)))) {
        break forward_join_110;
    }
    }
    forwardValue5068_109_0 = 1;
    }
    forwardValue5068_111_0 = forwardValue5068_109_0;
    break forward_join_111;
    }
    forwardValue5068_111_0 = 0;
    }
    life4_150 = forwardValue5068_111_0;
    spill5068_6 = life4_150;
    if (!((life3_5 == 0))) {
        forwardValue5068_126_0 = spill5068_6;
        break forward_join_126;
    }
    if (!((spill5068_6 == 0))) {
        break forward_join_127;
    }
    spill5068_7 = this;
    if (!((life3_5 == 0))) {
        forwardValue5068_128_0 = spill5068_7;
        break forward_join_128;
    }
    forwardValue5068_126_0 = (((net.minecraft.entity.item.EntityItem)(spill5068_7)).S % __sourceIntrinsic_736a66cda11e_invokedynamic5068_39(10308, (5132181661577477776L ^ life1_3)));
    }
    if (!((forwardValue5068_126_0 == 0))) {
        break forward_join_186;
    }
    }
    forwardValue5068_128_0 = this;
    }
    spill5068_8 = ((net.minecraft.entity.item.EntityItem)(forwardValue5068_128_0)).i;
    if (!((life3_5 == 0))) {
        forwardValue5068_182_0 = spill5068_8;
        break forward_join_182;
    }
    if (!((((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(spill5068_8)).a__fE(((moom.DT)(new moom.DT(this)))))).a__ch())).a__fn() == moom.fn.i))) {
        break forward_join_178;
    }
    this.u = ((double)(0x1.99999ap-3d));
    this.t = ((double)(((double) ((((java.util.Random)(this.ah)).nextFloat() - ((java.util.Random)(this.ah)).nextFloat()) * 0x1.99999ap-3f))));
    this.v = ((double)(((double) ((((java.util.Random)(this.ah)).nextFloat() - ((java.util.Random)(this.ah)).nextFloat()) * 0x1.99999ap-3f))));
    ((net.minecraft.entity.item.EntityItem)(this)).a(((java.lang.String)("random.fizz")), ((float)(0x1.99999ap-2f)), ((float)((0x1.0p1f + (((java.util.Random)(this.ah)).nextFloat() * 0x1.99999ap-2f)))));
    }
    spill5068_9 = this;
    if (!((life3_5 == 0))) {
        forwardValue5068_185_0 = spill5068_9;
        break forward_join_185;
    }
    forwardValue5068_182_0 = ((net.minecraft.entity.item.EntityItem)(spill5068_9)).i;
    }
    if (!((!((net.minecraft.world.World)(forwardValue5068_182_0)).G))) {
        break forward_join_186;
    }
    forwardValue5068_185_0 = this;
    }
    ((net.minecraft.entity.item.EntityItem)(forwardValue5068_185_0)).a__Void();
    }
    life5_244 = 0x1.f5c29p-1f;
    spill5068_10 = this.A;
    if (!((life3_5 == 0))) {
        forwardValue5068_238_0 = ((spill5068_10) ? 1 : 0);
        break forward_join_238;
    }
    if (!(spill5068_10)) {
        break forward_join_216;
    }
    life5_244 = (((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(this.i)).a__fE(((moom.DT)(new moom.DT(moom.Dr.b__Int(((double)(this.n))), (moom.Dr.b__Int(((double)(((moom.CA)(((net.minecraft.entity.item.EntityItem)(this)).b())).c))) - 1), moom.Dr.b__Int(((double)(this.p))))))))).a__ch())).L * 0x1.f5c29p-1f);
    }
    net.minecraft.entity.item.EntityItem __stackOp5068_75_0 = this;
    ((net.minecraft.entity.item.EntityItem)(__stackOp5068_75_0)).t = ((double)((((net.minecraft.entity.item.EntityItem)(__stackOp5068_75_0)).t * ((double) life5_244))));
    net.minecraft.entity.item.EntityItem __stackOp5068_78_0 = this;
    ((net.minecraft.entity.item.EntityItem)(__stackOp5068_78_0)).u = ((double)((((net.minecraft.entity.item.EntityItem)(__stackOp5068_78_0)).u * 0x1.f5c29p-1d)));
    net.minecraft.entity.item.EntityItem __stackOp5068_81_0 = this;
    ((net.minecraft.entity.item.EntityItem)(__stackOp5068_81_0)).v = ((double)((((net.minecraft.entity.item.EntityItem)(__stackOp5068_81_0)).v * ((double) life5_244))));
    forwardValue5068_238_0 = ((this.A) ? 1 : 0);
    }
    if (!((life3_5 == 0))) {
        forwardValue5068_249_0 = forwardValue5068_238_0;
        break forward_join_249;
    }
    if (!((forwardValue5068_238_0 != 0))) {
        break forward_join_247;
    }
    net.minecraft.entity.item.EntityItem __stackOp5068_86_0 = this;
    ((net.minecraft.entity.item.EntityItem)(__stackOp5068_86_0)).u = ((double)((((net.minecraft.entity.item.EntityItem)(__stackOp5068_86_0)).u * -0x1.0p-1d)));
    }
    forwardValue5068_249_0 = this.aF;
    }
    if (!((life3_5 == 0))) {
        forwardValue5068_269_0 = forwardValue5068_249_0;
        break forward_join_269;
    }
    if (!((forwardValue5068_249_0 != __sourceIntrinsic_736a66cda11e_invokedynamic5068_90(19039, (6898537520169491591L ^ life1_3))))) {
        break forward_join_263;
    }
    net.minecraft.entity.item.EntityItem __stackOp5068_91_0 = this;
    ((net.minecraft.entity.item.EntityItem)(__stackOp5068_91_0)).aF = ((int)((((net.minecraft.entity.item.EntityItem)(__stackOp5068_91_0)).aF + 1)));
    }
    ((net.minecraft.entity.item.EntityItem)(this)).k__Boolean();
    forwardValue5068_269_0 = ((((net.minecraft.world.World)(this.i)).G) ? 1 : 0);
    }
    if (!((life3_5 == 0))) {
        forwardValue5068_276_0 = forwardValue5068_269_0;
        break forward_join_276;
    }
    if (!((forwardValue5068_269_0 == 0))) {
        break forward_join_284;
    }
    spill5068_11 = this;
    if (!((life3_5 == 0))) {
        forwardValue5068_283_0 = spill5068_11;
        break forward_join_283;
    }
    forwardValue5068_276_0 = ((net.minecraft.entity.item.EntityItem)(spill5068_11)).aF;
    }
    if (!((forwardValue5068_276_0 >= __sourceIntrinsic_736a66cda11e_invokedynamic5068_99(2495, (4612133719848017772L ^ life1_3))))) {
        break forward_join_284;
    }
    forwardValue5068_283_0 = this;
    }
    ((net.minecraft.entity.item.EntityItem)(forwardValue5068_283_0)).f__Void();
    }
    return;
}


protected boolean g__Boolean() {
return ((0) != 0);
}


public void g(int p0) {
this.aG = ((int)(p0));
    return;
}


public void z__sourceReturn_da8c82d5d4() {
long local1 = (net.minecraft.entity.item.EntityItem.bb ^ 15648640698689L);
    this.aF = ((int)(__sourceIntrinsic_c7890660159c_originalDynamicSite1906_1(6740, (4304098142414930537L ^ local1))));
    return;
}


public void w__sourceReturn_da8c82d5d4() {
long local1 = (net.minecraft.entity.item.EntityItem.bb ^ 84164699335888L);
    this.aG = ((int)(__sourceIntrinsic_d7016c0856b9_originalDynamicSite1907_1(28368, (1887324916437799799L ^ local1))));
    return;
}


public void y__sourceReturn_da8c82d5d4() {
long local1 = (net.minecraft.entity.item.EntityItem.bb ^ 41374844800521L);
    this.aG = ((int)(__sourceIntrinsic_96328f2ab0ba_originalDynamicSite1908_1(182, (7258429636797390796L ^ local1))));
    return;
}


public void A__sourceReturn_da8c82d5d4() {
long local1 = (net.minecraft.entity.item.EntityItem.bb ^ 45250778854673L);
    ((net.minecraft.entity.item.EntityItem)(this)).y__sourceReturn_da8c82d5d4();
    this.aF = ((int)(__sourceIntrinsic_875d4064fb42_originalDynamicSite1909_2(9123, (1063458883355625423L ^ local1))));
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_af2be633e6f84bc9_originalDynamicSite3844_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_70f69b65dad1f4b5_originalDynamicSite3846_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_875d4064fb42_originalDynamicSite1909_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d37dc8eac5f9_invokedynamic5058_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d37dc8eac5f9_invokedynamic5058_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d37dc8eac5f9_invokedynamic5058_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d37dc8eac5f9_invokedynamic5058_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5f56e65a234d_originalDynamicSite1905_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5f56e65a234d_originalDynamicSite1905_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_64ccfb84e285_invokedynamic5060_6(java.lang.String a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e82a5b067497_invokedynamic5062_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e82a5b067497_invokedynamic5062_8(int a0) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral11351_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9bf881b104f5_originalDynamicSite1903_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01f4e1cd062e_invokedynamic5064_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8bd60d12af02_invokedynamic5065_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8bd60d12af02_invokedynamic5065_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a91ecd6db48f_originalDynamicSite1904_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_736a66cda11e_invokedynamic5068_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_736a66cda11e_invokedynamic5068_39(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_736a66cda11e_invokedynamic5068_90(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_736a66cda11e_invokedynamic5068_99(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d7016c0856b9_originalDynamicSite1907_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_96328f2ab0ba_originalDynamicSite1908_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c7890660159c_originalDynamicSite1906_1(int a0, long a1) throws E;
}
