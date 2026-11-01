package net.minecraft.entity.projectile;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public abstract class EntityFireball extends net.minecraft.entity.Entity {

private int aE;

private int aF;

private int aG;

private net.minecraft.block.Block aH;

private boolean aI;

public net.minecraft.entity.EntityLivingBase aJ;

private int aK;

private int aL;

public double aM;

public double aN;

public double aO;

private static long bb;

private static long[] db;

private static java.lang.Integer[] eb;

private static java.util.Map gb;

public EntityFireball(net.minecraft.world.World p0, net.minecraft.entity.EntityLivingBase p1, double p2, double p3, double p4) { super((net.minecraft.world.World)null); }


private static void __sourceConstructorBody_02001a566200f9e3(net.minecraft.entity.projectile.EntityFireball receiver, net.minecraft.world.World p0, net.minecraft.entity.EntityLivingBase p1, double p2, double p3, double p4) throws Throwable {

net.minecraft.entity.projectile.EntityFireball spill565_0;

    net.minecraft.entity.projectile.EntityFireball spill565_1;

    double spill565_2;

    double spill565_3;

    double life3_55;

    double life5_63;

    double life7_71;

    double life9_85;

    net.minecraft.entity.projectile.EntityFireball.__sourceConstructorInit_02001a566200f9e3_0(((net.minecraft.entity.projectile.EntityFireball)(receiver)), ((net.minecraft.world.World)(p0)));

    ((net.minecraft.entity.projectile.EntityFireball)(receiver)).aE = ((int)(-1));

    ((net.minecraft.entity.projectile.EntityFireball)(receiver)).aF = ((int)(-1));

    ((net.minecraft.entity.projectile.EntityFireball)(receiver)).aG = ((int)(-1));

    ((net.minecraft.entity.projectile.EntityFireball)(receiver)).aJ = ((net.minecraft.entity.EntityLivingBase)(p1));

    ((net.minecraft.entity.projectile.EntityFireball)(receiver)).a__Void(((float)(0x1.0p0f)), ((float)(0x1.0p0f)));

    ((net.minecraft.entity.projectile.EntityFireball)(receiver)).c(((double)(((net.minecraft.entity.EntityLivingBase)(p1)).n)), ((double)(((net.minecraft.entity.EntityLivingBase)(p1)).o)), ((double)(((net.minecraft.entity.EntityLivingBase)(p1)).p)), ((float)(((net.minecraft.entity.EntityLivingBase)(p1)).w)), ((float)(((net.minecraft.entity.EntityLivingBase)(p1)).x)));

    ((net.minecraft.entity.projectile.EntityFireball)(receiver)).a__Void(((double)(((net.minecraft.entity.projectile.EntityFireball)(receiver)).n)), ((double)(((net.minecraft.entity.projectile.EntityFireball)(receiver)).o)), ((double)(((net.minecraft.entity.projectile.EntityFireball)(receiver)).p)));

    spill565_0 = receiver;

    spill565_1 = receiver;

    net.minecraft.entity.projectile.EntityFireball __stackOp565_16_0 = receiver;

    double __stackOp565_16_1 = 0x0.0p0d;

    spill565_2 = __stackOp565_16_1;

    ((net.minecraft.entity.projectile.EntityFireball)(__stackOp565_16_0)).v = ((double)(__stackOp565_16_1));

    net.minecraft.entity.projectile.EntityFireball __stackOp565_18_0 = spill565_1;

    double __stackOp565_18_1 = spill565_2;

    spill565_3 = __stackOp565_18_1;

    ((net.minecraft.entity.projectile.EntityFireball)(__stackOp565_18_0)).u = ((double)(__stackOp565_18_1));

    ((net.minecraft.entity.projectile.EntityFireball)(spill565_0)).t = ((double)(spill565_3));

    life3_55 = (p2 + (((java.util.Random)(((net.minecraft.entity.projectile.EntityFireball)(receiver)).ah)).nextGaussian() * 0x1.999999999999ap-2d));

    life5_63 = (p3 + (((java.util.Random)(((net.minecraft.entity.projectile.EntityFireball)(receiver)).ah)).nextGaussian() * 0x1.999999999999ap-2d));

    life7_71 = (p4 + (((java.util.Random)(((net.minecraft.entity.projectile.EntityFireball)(receiver)).ah)).nextGaussian() * 0x1.999999999999ap-2d));

    life9_85 = ((double) moom.Dr.a__Float(((double)((((life3_55 * life3_55) + (life5_63 * life5_63)) + (life7_71 * life7_71))))));

    ((net.minecraft.entity.projectile.EntityFireball)(receiver)).aM = ((double)(((life3_55 / life9_85) * 0x1.999999999999ap-4d)));

    ((net.minecraft.entity.projectile.EntityFireball)(receiver)).aN = ((double)(((life5_63 / life9_85) * 0x1.999999999999ap-4d)));

    ((net.minecraft.entity.projectile.EntityFireball)(receiver)).aO = ((double)(((life7_71 / life9_85) * 0x1.999999999999ap-4d)));

    return;

}



public EntityFireball(net.minecraft.world.World p0, double p1, double p2, double p3, double p4, double p5, double p6) {
super(p0);
    this.aE = ((int)(-1));
    this.aF = ((int)(-1));
    this.aG = ((int)(-1));
    ((net.minecraft.entity.projectile.EntityFireball)(this)).a__Void(((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    ((net.minecraft.entity.projectile.EntityFireball)(this)).c(((double)(p1)), ((double)(p2)), ((double)(p3)), ((float)(this.w)), ((float)(this.x)));
    ((net.minecraft.entity.projectile.EntityFireball)(this)).a__Void(((double)(p1)), ((double)(p2)), ((double)(p3)));
    double local14 = ((double) moom.Dr.a__Float(((double)((((p4 * p4) + (p5 * p5)) + (p6 * p6))))));
    this.aM = ((double)(((p4 / local14) * 0x1.999999999999ap-4d)));
    this.aN = ((double)(((p5 / local14) * 0x1.999999999999ap-4d)));
    this.aO = ((double)(((p6 / local14) * 0x1.999999999999ap-4d)));
    return;
}


public EntityFireball(net.minecraft.world.World p0) {
super(p0);
    this.aE = -1;
    this.aF = -1;
    this.aG = -1;
    (this).a__Void(0x1.0000000000000p+0f, 0x1.0000000000000p+0f);
}


static {
bb = ((long)(((moom._a)(moom._c.a(((long)(-1842905324621451187L)), ((long)(5352949240051996237L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(155422615517584L)))));
    gb = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (net.minecraft.entity.projectile.EntityFireball.bb ^ 30108440124459L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1892_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1892_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1892_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1892_14 = new byte[8];
    (__sourceSpill1892_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1892_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1892_16 = __sourceSpill1892_14;
    ((javax.crypto.Cipher)(__sourceSpill1892_11)).init(((int)(__sourceSpill1892_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1892_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1892_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[7];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "9ò7u7j\016\nÆ\026­/cÑùRÅ\021\023Ô´¯q*q#Öo¥ïo\023pÜ4"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1892_25 = local6_life21;
        int __sourceSpill1892_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1892_25)).substring(((int)(__sourceSpill1892_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1892_30 = local8_life19;
        int __sourceSpill1892_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1892_33 = new byte[8];
        (__sourceSpill1892_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1892_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1892_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1892_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1892_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1892_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1892_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1892_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1892_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1892_34)).doFinal(((byte[])(__sourceSpill1892_33)));
        (__sourceSpill1892_30)[__sourceSpill1892_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "s\002u£Æ^£\016Éwø>ÖÐ"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1892_38 = local6_life21;
        int __sourceSpill1892_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1892_38)).substring(((int)(__sourceSpill1892_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1892_43 = local8_life19;
        int __sourceSpill1892_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1892_46 = new byte[8];
        (__sourceSpill1892_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1892_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1892_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1892_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1892_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1892_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1892_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1892_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1892_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1892_47)).doFinal(((byte[])(__sourceSpill1892_46)));
        (__sourceSpill1892_43)[__sourceSpill1892_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    db = ((long[])(local8_life19));
    eb = ((java.lang.Integer[])(new java.lang.Integer[7]));
}

private static native <E extends Throwable> void __sourceConstructorInit_02001a566200f9e3_0(net.minecraft.entity.projectile.EntityFireball a0, net.minecraft.world.World a1) throws E;

private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral11866_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/tN"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 29070;
      if (eb[var3] == null) {
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
         Object[] var9 = (Object[])gb.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               gb.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/tN", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         eb[var3] = var15;
      }

      return eb[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.entity.projectile.EntityFireball.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public float c() {
return 0x1.0p0f;
}


public void c(net.minecraft.nbt.NBTTagCompound p0) {
net.minecraft.entity.projectile.EntityFireball forwardValue5452_50_0;
    int forwardValue5452_50_1;
    net.minecraft.entity.projectile.EntityFireball forwardValue5452_61_0;
    int forwardValue5452_61_1;
    net.minecraft.entity.projectile.EntityFireball forwardValue5452_62_0;
    net.minecraft.entity.projectile.EntityFireball forwardValue5452_63_0;
    int forwardValue5452_63_1;
    net.minecraft.nbt.NBTTagCompound forwardValue5452_82_0;
    java.lang.String forwardValue5452_82_1;
    int forwardValue5452_82_2;
    int[] spill5452_0;
    net.minecraft.entity.projectile.EntityFireball spill5452_1;
    short spill5452_2;
    net.minecraft.entity.projectile.EntityFireball spill5452_3;
    byte spill5452_4;
    net.minecraft.nbt.NBTTagCompound spill5452_5;
    java.lang.String spill5452_6;
    int spill5452_7;
    long life2_3;
    int[] life4_15;
    net.minecraft.nbt.NBTTagList life5_104;
    forward_join_103: {
    forward_join_101: {
    forward_join_82: {
    forward_join_63: {
    forward_join_62: {
    forward_join_61: {
    forward_join_52: {
    forward_join_50: {
    forward_join_40: {
    life2_3 = (net.minecraft.entity.projectile.EntityFireball.bb ^ 23122611111435L);
    spill5452_0 = moom.h1.a__ArrayInt();
    this.aE = ((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Short(((java.lang.String)("xTile")))));
    this.aF = ((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Short(((java.lang.String)("yTile")))));
    life4_15 = spill5452_0;
    spill5452_1 = this;
    spill5452_2 = ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Short(((java.lang.String)("zTile")));
    if (!((life4_15 != null))) {
        forwardValue5452_50_0 = spill5452_1;
        forwardValue5452_50_1 = ((int)(spill5452_2));
        break forward_join_50;
    }
    ((net.minecraft.entity.projectile.EntityFireball)(spill5452_1)).aG = ((int)(spill5452_2));
    if (!(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Boolean(((java.lang.String)("inTile")), ((int)(__sourceIntrinsic_01f4e1cd062e_invokedynamic5452_9(5416, (4457087124803525177L ^ life2_3))))))) {
        break forward_join_40;
    }
    this.aH = ((net.minecraft.block.Block)(net.minecraft.block.Block.a(((java.lang.String)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__String(((java.lang.String)("inTile"))))))));
    if (!((life4_15 == null))) {
        break forward_join_52;
    }
    }
    forwardValue5452_50_0 = this;
    forwardValue5452_50_1 = (((net.minecraft.nbt.NBTTagCompound)(p0)).b__sourceReturn_d4c7a9581c(((java.lang.String)("inTile"))) & __sourceIntrinsic_01f4e1cd062e_invokedynamic5452_15(5265, (5163628575294430084L ^ life2_3)));
    }
    ((net.minecraft.entity.projectile.EntityFireball)(forwardValue5452_50_0)).aH = ((net.minecraft.block.Block)(net.minecraft.block.Block.a(((int)(forwardValue5452_50_1)))));
    }
    spill5452_3 = this;
    spill5452_4 = ((net.minecraft.nbt.NBTTagCompound)(p0)).b__sourceReturn_d4c7a9581c(((java.lang.String)("inGround")));
    if (!((life4_15 != null))) {
        forwardValue5452_61_0 = spill5452_3;
        forwardValue5452_61_1 = ((int)(spill5452_4));
        break forward_join_61;
    }
    if (!((spill5452_4 == 1))) {
        forwardValue5452_62_0 = spill5452_3;
        break forward_join_62;
    }
    forwardValue5452_61_0 = spill5452_3;
    forwardValue5452_61_1 = 1;
    }
    forwardValue5452_63_0 = forwardValue5452_61_0;
    forwardValue5452_63_1 = forwardValue5452_61_1;
    break forward_join_63;
    }
    forwardValue5452_63_0 = forwardValue5452_62_0;
    forwardValue5452_63_1 = 0;
    }
    ((net.minecraft.entity.projectile.EntityFireball)(forwardValue5452_63_0)).aI = ((boolean)__sourceIntrinsic_integerToBoolean((forwardValue5452_63_1)));
    spill5452_5 = p0;
    spill5452_6 = "direction";
    spill5452_7 = __sourceIntrinsic_01f4e1cd062e_invokedynamic5452_21(9052, (6484005844773710923L ^ life2_3));
    if (!((life4_15 != null))) {
        forwardValue5452_82_0 = spill5452_5;
        forwardValue5452_82_1 = spill5452_6;
        forwardValue5452_82_2 = spill5452_7;
        break forward_join_82;
    }
    if (!(((net.minecraft.nbt.NBTTagCompound)(spill5452_5)).a__Boolean(((java.lang.String)(spill5452_6)), ((int)(spill5452_7))))) {
        break forward_join_101;
    }
    forwardValue5452_82_0 = p0;
    forwardValue5452_82_1 = "direction";
    forwardValue5452_82_2 = __sourceIntrinsic_01f4e1cd062e_invokedynamic5452_23(19511, (390424333471466273L ^ life2_3));
    }
    life5_104 = ((net.minecraft.nbt.NBTTagCompound)(forwardValue5452_82_0)).a(((java.lang.String)(forwardValue5452_82_1)), ((int)(forwardValue5452_82_2)));
    this.t = ((double)(((net.minecraft.nbt.NBTTagList)(life5_104)).a(((int)(0)))));
    this.u = ((double)(((net.minecraft.nbt.NBTTagList)(life5_104)).a(((int)(1)))));
    this.v = ((double)(((net.minecraft.nbt.NBTTagList)(life5_104)).a(((int)(2)))));
    if (!((life4_15 == null))) {
        break forward_join_103;
    }
    }
    ((net.minecraft.entity.projectile.EntityFireball)(this)).f__Void();
    }
    return;
}


protected void d__Void() {
return;
}


public void d(net.minecraft.nbt.NBTTagCompound p0) {
net.minecraft.nbt.NBTTagCompound forwardValue5453_38_0;
    java.lang.String forwardValue5453_38_1;
    net.minecraft.nbt.NBTTagCompound forwardValue5453_39_0;
    java.lang.String forwardValue5453_39_1;
    moom.DD forwardValue5453_39_2;
    net.minecraft.nbt.NBTTagCompound forwardValue5453_40_0;
    java.lang.String forwardValue5453_40_1;
    java.lang.String forwardValue5453_40_2;
    net.minecraft.nbt.NBTTagCompound forwardValue5453_49_0;
    java.lang.String forwardValue5453_49_1;
    int forwardValue5453_49_2;
    net.minecraft.nbt.NBTTagCompound forwardValue5453_50_0;
    java.lang.String forwardValue5453_50_1;
    net.minecraft.nbt.NBTTagCompound forwardValue5453_51_0;
    java.lang.String forwardValue5453_51_1;
    int forwardValue5453_51_2;
    int[] spill5453_0;
    net.minecraft.nbt.NBTTagCompound spill5453_1;
    java.lang.String spill5453_2;
    moom.DD spill5453_3;
    net.minecraft.nbt.NBTTagCompound spill5453_4;
    java.lang.String spill5453_5;
    boolean spill5453_6;
    long life2_3;
    int[] life4_17;
    moom.DD life5_29;
    forward_join_51: {
    forward_join_50: {
    forward_join_49: {
    forward_join_40: {
    forward_join_39: {
    forward_join_38: {
    life2_3 = (net.minecraft.entity.projectile.EntityFireball.bb ^ 44407167032576L);
    spill5453_0 = moom.h1.a__ArrayInt();
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("xTile")), ((short)(((short) this.aE))));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("yTile")), ((short)(((short) this.aF))));
    life4_17 = spill5453_0;
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("zTile")), ((short)(((short) this.aG))));
    life5_29 = ((moom.DD)(((moom.DC)(net.minecraft.block.Block.b)).b(((java.lang.Object)(this.aH)))));
    spill5453_1 = p0;
    spill5453_2 = "inTile";
    spill5453_3 = life5_29;
    if (!((life4_17 != null))) {
        forwardValue5453_39_0 = spill5453_1;
        forwardValue5453_39_1 = spill5453_2;
        forwardValue5453_39_2 = spill5453_3;
        break forward_join_39;
    }
    if (!((spill5453_3 == null))) {
        forwardValue5453_38_0 = spill5453_1;
        forwardValue5453_38_1 = spill5453_2;
        break forward_join_38;
    }
    forwardValue5453_40_0 = spill5453_1;
    forwardValue5453_40_1 = spill5453_2;
    forwardValue5453_40_2 = "";
    break forward_join_40;
    }
    forwardValue5453_39_0 = forwardValue5453_38_0;
    forwardValue5453_39_1 = forwardValue5453_38_1;
    forwardValue5453_39_2 = life5_29;
    }
    forwardValue5453_40_0 = forwardValue5453_39_0;
    forwardValue5453_40_1 = forwardValue5453_39_1;
    forwardValue5453_40_2 = ((moom.DD)(forwardValue5453_39_2)).toString();
    }
    ((net.minecraft.nbt.NBTTagCompound)(forwardValue5453_40_0)).a(((java.lang.String)(forwardValue5453_40_1)), ((java.lang.String)(forwardValue5453_40_2)));
    spill5453_4 = p0;
    spill5453_5 = "inGround";
    spill5453_6 = this.aI;
    if (!((life4_17 != null))) {
        forwardValue5453_49_0 = spill5453_4;
        forwardValue5453_49_1 = spill5453_5;
        forwardValue5453_49_2 = ((spill5453_6) ? 1 : 0);
        break forward_join_49;
    }
    if (!(spill5453_6)) {
        forwardValue5453_50_0 = spill5453_4;
        forwardValue5453_50_1 = spill5453_5;
        break forward_join_50;
    }
    forwardValue5453_49_0 = spill5453_4;
    forwardValue5453_49_1 = spill5453_5;
    forwardValue5453_49_2 = 1;
    }
    forwardValue5453_51_0 = forwardValue5453_49_0;
    forwardValue5453_51_1 = forwardValue5453_49_1;
    forwardValue5453_51_2 = forwardValue5453_49_2;
    break forward_join_51;
    }
    forwardValue5453_51_0 = forwardValue5453_50_0;
    forwardValue5453_51_1 = forwardValue5453_50_1;
    forwardValue5453_51_2 = 0;
    }
    ((net.minecraft.nbt.NBTTagCompound)(forwardValue5453_51_0)).a(((java.lang.String)(forwardValue5453_51_1)), ((byte)(((byte) forwardValue5453_51_2))));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("direction")), ((net.minecraft.nbt.NBTBase)(((net.minecraft.entity.projectile.EntityFireball)(this)).a(((double[])(new double[] {this.t, this.u, this.v}))))));
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public int a__Int(float p0) {
long local2 = (net.minecraft.entity.projectile.EntityFireball.bb ^ 131741059416769L);
    return __sourceIntrinsic_dbecb07edf7c_originalDynamicSite2015_1(31459, (1290730905941274938L ^ local2));
}


public boolean a(double p0) {
int forwardValue5450_28_0;
    int forwardValue5450_32_0;
    int forwardValue5450_34_0;
    int[] spill5450_0;
    boolean spill5450_1;
    long life3_3;
    double life6_10;
    int[] life5_11;
    double life6_25;
    forward_join_34: {
    forward_join_33: {
    forward_join_32: {
    forward_join_28: {
    forward_join_19: {
    life3_3 = (net.minecraft.entity.projectile.EntityFireball.bb ^ 74916628804134L);
    spill5450_0 = moom.h1.a__ArrayInt();
    life6_10 = (((moom.CA)(((net.minecraft.entity.projectile.EntityFireball)(this)).b())).a() * 0x1.0p2d);
    life5_11 = spill5450_0;
    spill5450_1 = java.lang.Double.isNaN(((double)(life6_10)));
    if (!((life5_11 != null))) {
        forwardValue5450_28_0 = ((spill5450_1) ? 1 : 0);
        break forward_join_28;
    }
    if (!(spill5450_1)) {
        break forward_join_19;
    }
    life6_10 = 0x1.0p2d;
    }
    life6_25 = (life6_10 * 0x1.0p6d);
    forwardValue5450_28_0 = recovery.source.CarrierOps.dcmpg(((double)(p0)), ((double)((life6_25 * life6_25))));
    }
    if (!((life5_11 != null))) {
        forwardValue5450_32_0 = forwardValue5450_28_0;
        break forward_join_32;
    }
    if (!((forwardValue5450_28_0 < 0))) {
        break forward_join_33;
    }
    forwardValue5450_32_0 = 1;
    }
    forwardValue5450_34_0 = forwardValue5450_32_0;
    break forward_join_34;
    }
    forwardValue5450_34_0 = 0;
    }
    return ((forwardValue5450_34_0) != 0);
}


protected abstract void a(net.minecraft.util.MovingObjectPosition p0);

protected float a() {
return 0x1.e66666p-1f;
}


public boolean a__Boolean(net.minecraft.util.DamageSource p0, float p1) {
net.minecraft.entity.Entity forwardValue5451_18_0;
    net.minecraft.entity.Entity forwardValue5451_23_0;
    int forwardValue5451_71_0;
    net.minecraft.entity.projectile.EntityFireball spill5451_0;
    int spill5451_1;
    long life3_3;
    int[] life5_5;
    moom.DR life6_35;
    forward_join_72: {
    forward_join_71: {
    forward_join_70: {
    forward_join_59: {
    forward_join_53: {
    forward_join_23: {
    forward_join_18: {
    forward_join_14: {
    life3_3 = (net.minecraft.entity.projectile.EntityFireball.bb ^ 126237009184393L);
    life5_5 = moom.h1.a__ArrayInt();
    spill5451_0 = this;
    if (!((life5_5 != null))) {
        forwardValue5451_18_0 = spill5451_0;
        break forward_join_18;
    }
    if (!(((net.minecraft.entity.projectile.EntityFireball)(spill5451_0)).a(((net.minecraft.util.DamageSource)(p0))))) {
        break forward_join_14;
    }
    return ((0) != 0);
    }
    ((net.minecraft.entity.projectile.EntityFireball)(this)).q();
    forwardValue5451_18_0 = ((net.minecraft.util.DamageSource)(p0)).b__r3();
    }
    if (!((life5_5 != null))) {
        forwardValue5451_23_0 = forwardValue5451_18_0;
        break forward_join_23;
    }
    if (!((forwardValue5451_18_0 != null))) {
        break forward_join_72;
    }
    forwardValue5451_23_0 = ((net.minecraft.util.DamageSource)(p0)).b__r3();
    }
    life6_35 = ((net.minecraft.entity.Entity)(forwardValue5451_23_0)).b__DR();
    if (!((life5_5 != null))) {
        break forward_join_53;
    }
    if (!((life6_35 != null))) {
        break forward_join_59;
    }
    this.t = ((double)(((moom.DR)(life6_35)).a));
    this.u = ((double)(((moom.DR)(life6_35)).b));
    this.v = ((double)(((moom.DR)(life6_35)).c));
    this.aM = ((double)((this.t * 0x1.999999999999ap-4d)));
    this.aN = ((double)((this.u * 0x1.999999999999ap-4d)));
    }
    this.aO = ((double)((this.v * 0x1.999999999999ap-4d)));
    }
    spill5451_1 = ((((net.minecraft.util.DamageSource)(p0)).b__r3() instanceof net.minecraft.entity.EntityLivingBase) ? 1 : 0);
    if (!((life5_5 != null))) {
        forwardValue5451_71_0 = spill5451_1;
        break forward_join_71;
    }
    if (!((spill5451_1 != 0))) {
        break forward_join_70;
    }
    this.aJ = ((net.minecraft.entity.EntityLivingBase)(((net.minecraft.entity.EntityLivingBase)(((net.minecraft.util.DamageSource)(p0)).b__r3()))));
    }
    forwardValue5451_71_0 = 1;
    }
    return ((forwardValue5451_71_0) != 0);
    }
    return ((0) != 0);
}


public float a(float p0) {
return 0x1.0p0f;
}


public boolean m__Boolean() {
return ((1) != 0);
}


public void g__Void() {
net.minecraft.entity.projectile.EntityFireball lexicalValue1624_24_0;
    int lexicalValue1624_42_0;
    net.minecraft.entity.projectile.EntityFireball lexicalValue1624_78_0;
    net.minecraft.entity.projectile.EntityFireball lexicalValue1624_120_0;
    net.minecraft.entity.projectile.EntityFireball lexicalValue1624_125_0;
    moom.DR lexicalValue1624_210_0;
    int lexicalValue1624_254_0;
    int lexicalValue1624_259_0;
    double lexicalValue1624_304_0;
    net.minecraft.entity.Entity lexicalValue1624_308_0;
    net.minecraft.entity.projectile.EntityFireball lexicalValue1624_595_0;
    net.minecraft.entity.projectile.EntityFireball lexicalValue1624_605_0;
    boolean spill1624_0;
    net.minecraft.entity.projectile.EntityFireball spill1624_1;
    net.minecraft.entity.projectile.EntityFireball spill1624_2;
    net.minecraft.entity.projectile.EntityFireball spill1624_3;
    net.minecraft.entity.projectile.EntityFireball spill1624_4;
    net.minecraft.entity.projectile.EntityFireball spill1624_5;
    moom.DR spill1624_6;
    net.minecraft.entity.Entity spill1624_7;
    boolean spill1624_8;
    double spill1624_9;
    double spill1624_10;
    net.minecraft.entity.projectile.EntityFireball spill1624_11;
    long life1_3;
    int[] life3_5;
    moom.DR life4_184;
    moom.DR life5_203;
    net.minecraft.util.MovingObjectPosition life6_209;
    moom.DR life4_219;
    moom.DR life5_240;
    net.minecraft.entity.Entity life7_260;
    java.util.List life8_278;
    double life9_280;
    java.util.Iterator life11_283;
    net.minecraft.entity.Entity life12_290;
    float life13_329;
    moom.CA life14_339;
    net.minecraft.util.MovingObjectPosition life15_344;
    double life16_351;
    float life11_427;
    float life12_572;
    int life13_582;
    float life14_587;
    lexical_join_606: {
    lexical_join_605: {
    lexical_join_604: {
    lexical_join_602: {
    lexical_join_595: {
    lexical_join_535: {
    lexical_join_533: {
    lexical_join_477: {
    lexical_join_453: {
    lexical_join_435: {
    lexical_join_417: {
    lexical_join_399: {
    lexical_join_319: {
    lexical_join_314: {
    lexical_join_308: {
    lexical_join_307: {
    lexical_join_211: {
    lexical_join_210: {
    lexical_join_130: {
    lexical_join_125: {
    lexical_join_124: {
    lexical_join_120: {
    lexical_join_80: {
    lexical_join_79: {
    lexical_join_78: {
    lexical_join_42: {
    lexical_join_33: {
    lexical_join_24: {
    lexical_join_23: {
    life1_3 = (net.minecraft.entity.projectile.EntityFireball.bb ^ 37335727270271L);
    life3_5 = moom.h1.a__ArrayInt();
    spill1624_0 = ((net.minecraft.world.World)(this.i)).G;
    if (!((life3_5 != null))) {
        lexicalValue1624_42_0 = ((spill1624_0) ? 1 : 0);
        break lexical_join_42;
    }
    if (!((!spill1624_0))) {
        break lexical_join_33;
    }
    spill1624_1 = this;
    if (!((life3_5 != null))) {
        lexicalValue1624_24_0 = spill1624_1;
        break lexical_join_24;
    }
    if (!((((net.minecraft.entity.projectile.EntityFireball)(spill1624_1)).aJ != null))) {
        break lexical_join_23;
    }
    spill1624_2 = this;
    if (!((life3_5 != null))) {
        lexicalValue1624_605_0 = spill1624_2;
        break lexical_join_605;
    }
    if (!((!((net.minecraft.entity.EntityLivingBase)(((net.minecraft.entity.projectile.EntityFireball)(spill1624_2)).aJ)).F))) {
        break lexical_join_604;
    }
    }
    lexicalValue1624_24_0 = this;
    }
    if (!((life3_5 != null))) {
        lexicalValue1624_605_0 = lexicalValue1624_24_0;
        break lexical_join_605;
    }
    if (!(((net.minecraft.world.World)(((net.minecraft.entity.projectile.EntityFireball)(lexicalValue1624_24_0)).i)).c__Boolean(((moom.DT)(new moom.DT(this)))))) {
        break lexical_join_604;
    }
    }
    super.g__Void();
    ((net.minecraft.entity.projectile.EntityFireball)(this)).b(((int)(1)));
    spill1624_3 = this;
    if (!((life3_5 != null))) {
        lexicalValue1624_125_0 = spill1624_3;
        break lexical_join_125;
    }
    lexicalValue1624_42_0 = ((((net.minecraft.entity.projectile.EntityFireball)(spill1624_3)).aI) ? 1 : 0);
    }
    if (!((lexicalValue1624_42_0 != 0))) {
        break lexical_join_124;
    }
    spill1624_4 = this;
    if (!((life3_5 != null))) {
        lexicalValue1624_120_0 = spill1624_4;
        break lexical_join_120;
    }
    if (!((((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(((net.minecraft.entity.projectile.EntityFireball)(spill1624_4)).i)).a__fE(((moom.DT)(new moom.DT(this.aE, this.aF, this.aG)))))).a__ch() == this.aH))) {
        break lexical_join_80;
    }
    net.minecraft.entity.projectile.EntityFireball __stackOp1624_21_0 = this;
    ((net.minecraft.entity.projectile.EntityFireball)(__stackOp1624_21_0)).aK = ((int)((((net.minecraft.entity.projectile.EntityFireball)(__stackOp1624_21_0)).aK + 1)));
    spill1624_5 = this;
    if (!((life3_5 != null))) {
        lexicalValue1624_78_0 = spill1624_5;
        break lexical_join_78;
    }
    if (!((((net.minecraft.entity.projectile.EntityFireball)(spill1624_5)).aK == __sourceIntrinsic_736a66cda11e_invokedynamic1624_25(12372, (3648356306517938226L ^ life1_3))))) {
        break lexical_join_79;
    }
    lexicalValue1624_78_0 = this;
    }
    ((net.minecraft.entity.projectile.EntityFireball)(lexicalValue1624_78_0)).f__Void();
    }
    return;
    }
    this.aI = ((boolean)(false));
    net.minecraft.entity.projectile.EntityFireball __stackOp1624_28_0 = this;
    ((net.minecraft.entity.projectile.EntityFireball)(__stackOp1624_28_0)).t = ((double)((((net.minecraft.entity.projectile.EntityFireball)(__stackOp1624_28_0)).t * ((double) (((java.util.Random)(this.ah)).nextFloat() * 0x1.99999ap-3f)))));
    net.minecraft.entity.projectile.EntityFireball __stackOp1624_33_0 = this;
    ((net.minecraft.entity.projectile.EntityFireball)(__stackOp1624_33_0)).u = ((double)((((net.minecraft.entity.projectile.EntityFireball)(__stackOp1624_33_0)).u * ((double) (((java.util.Random)(this.ah)).nextFloat() * 0x1.99999ap-3f)))));
    net.minecraft.entity.projectile.EntityFireball __stackOp1624_38_0 = this;
    ((net.minecraft.entity.projectile.EntityFireball)(__stackOp1624_38_0)).v = ((double)((((net.minecraft.entity.projectile.EntityFireball)(__stackOp1624_38_0)).v * ((double) (((java.util.Random)(this.ah)).nextFloat() * 0x1.99999ap-3f)))));
    this.aK = ((int)(0));
    lexicalValue1624_120_0 = this;
    }
    ((net.minecraft.entity.projectile.EntityFireball)(lexicalValue1624_120_0)).aL = ((int)(0));
    if (!((life3_5 == null))) {
        break lexical_join_130;
    }
    }
    lexicalValue1624_125_0 = this;
    }
    net.minecraft.entity.projectile.EntityFireball __stackOp1624_45_0 = lexicalValue1624_125_0;
    ((net.minecraft.entity.projectile.EntityFireball)(__stackOp1624_45_0)).aL = ((int)((((net.minecraft.entity.projectile.EntityFireball)(__stackOp1624_45_0)).aL + 1)));
    }
    life4_184 = new moom.DR(this.n, this.o, this.p);
    life5_203 = new moom.DR((this.n + this.t), (this.o + this.u), (this.p + this.v));
    life6_209 = ((net.minecraft.world.World)(this.i)).a(((moom.DR)(life4_184)), ((moom.DR)(life5_203)));
    life4_219 = new moom.DR(this.n, this.o, this.p);
    spill1624_6 = new moom.DR((this.n + this.t), (this.o + this.u), (this.p + this.v));
    if (!((life3_5 != null))) {
        lexicalValue1624_210_0 = spill1624_6;
        break lexical_join_210;
    }
    life5_240 = spill1624_6;
    if (!((life6_209 != null))) {
        break lexical_join_211;
    }
    lexicalValue1624_210_0 = new moom.DR(((moom.DR)(((net.minecraft.util.MovingObjectPosition)(life6_209)).d)).a, ((moom.DR)(((net.minecraft.util.MovingObjectPosition)(life6_209)).d)).b, ((moom.DR)(((net.minecraft.util.MovingObjectPosition)(life6_209)).d)).c);
    }
    life5_240 = lexicalValue1624_210_0;
    }
    life7_260 = null;
    life8_278 = ((net.minecraft.world.World)(this.i)).b(((net.minecraft.entity.Entity)(this)), ((moom.CA)(((moom.CA)(((moom.CA)(((net.minecraft.entity.projectile.EntityFireball)(this)).b())).a(((double)(this.t)), ((double)(this.u)), ((double)(this.v))))).b(((double)(0x1.0p0d)), ((double)(0x1.0p0d)), ((double)(0x1.0p0d))))));
    life9_280 = 0x0.0p0d;
    life11_283 = ((java.util.List)(life8_278)).iterator();
    lexical_cycle_236: while (true) {
    lexical_join_305: {
    lexical_join_304: {
    lexical_join_301: {
    lexical_join_265: {
    lexical_join_259: {
    lexical_join_254: {
    if (!(((java.util.Iterator)(life11_283)).hasNext())) {
        break lexical_join_307;
    }
    life12_290 = ((net.minecraft.entity.Entity)(((java.util.Iterator)(life11_283)).next()));
    spill1624_7 = life12_290;
    if (!((life3_5 != null))) {
        lexicalValue1624_308_0 = spill1624_7;
        break lexical_join_308;
    }
    spill1624_8 = ((net.minecraft.entity.Entity)(spill1624_7)).m__Boolean();
    if (!((life3_5 != null))) {
        lexicalValue1624_254_0 = ((spill1624_8) ? 1 : 0);
        break lexical_join_254;
    }
    if (!(spill1624_8)) {
        break lexical_join_305;
    }
    lexicalValue1624_254_0 = ((((net.minecraft.entity.Entity)(life12_290)).a__Boolean(((net.minecraft.entity.Entity)(this.aJ)))) ? 1 : 0);
    }
    if (!((life3_5 != null))) {
        lexicalValue1624_259_0 = lexicalValue1624_254_0;
        break lexical_join_259;
    }
    if (!((lexicalValue1624_254_0 != 0))) {
        break lexical_join_265;
    }
    lexicalValue1624_259_0 = this.aL;
    }
    if (!((lexicalValue1624_259_0 >= __sourceIntrinsic_736a66cda11e_invokedynamic1624_92(6878, (3044496810653186746L ^ life1_3))))) {
        break lexical_join_305;
    }
    }
    life13_329 = 0x1.333334p-2f;
    life14_339 = ((moom.CA)(((net.minecraft.entity.Entity)(life12_290)).b())).b(((double)(((double) life13_329))), ((double)(((double) life13_329))), ((double)(((double) life13_329))));
    life15_344 = ((moom.CA)(life14_339)).a(((moom.DR)(life4_219)), ((moom.DR)(life5_240)));
    if (!((life15_344 != null))) {
        break lexical_join_305;
    }
    life16_351 = ((moom.DR)(life4_219)).c(((moom.DR)(((net.minecraft.util.MovingObjectPosition)(life15_344)).d)));
    spill1624_9 = life16_351;
    if (!((life3_5 != null))) {
        lexicalValue1624_304_0 = spill1624_9;
        break lexical_join_304;
    }
    if (!((recovery.source.CarrierOps.dcmpg(((double)(spill1624_9)), ((double)(life9_280))) >= 0))) {
        break lexical_join_301;
    }
    spill1624_10 = life9_280;
    if (!((life3_5 != null))) {
        lexicalValue1624_304_0 = spill1624_10;
        break lexical_join_304;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(spill1624_10)), ((double)(0x0.0p0d))) == 0))) {
        break lexical_join_305;
    }
    }
    life7_260 = life12_290;
    lexicalValue1624_304_0 = life16_351;
    }
    life9_280 = lexicalValue1624_304_0;
    }
    if (!((life3_5 == null))) { continue lexical_cycle_236; }
    break lexical_cycle_236;
    }
    }
    lexicalValue1624_308_0 = life7_260;
    }
    if (!((lexicalValue1624_308_0 != null))) {
        break lexical_join_314;
    }
    life6_209 = new net.minecraft.util.MovingObjectPosition(life7_260);
    }
    if (!((life6_209 != null))) {
        break lexical_join_319;
    }
    ((net.minecraft.entity.projectile.EntityFireball)(this)).a(((net.minecraft.util.MovingObjectPosition)(life6_209)));
    }
    net.minecraft.entity.projectile.EntityFireball __stackOp1624_101_0 = this;
    ((net.minecraft.entity.projectile.EntityFireball)(__stackOp1624_101_0)).n = ((double)((((net.minecraft.entity.projectile.EntityFireball)(__stackOp1624_101_0)).n + this.t)));
    net.minecraft.entity.projectile.EntityFireball __stackOp1624_105_0 = this;
    ((net.minecraft.entity.projectile.EntityFireball)(__stackOp1624_105_0)).o = ((double)((((net.minecraft.entity.projectile.EntityFireball)(__stackOp1624_105_0)).o + this.u)));
    net.minecraft.entity.projectile.EntityFireball __stackOp1624_109_0 = this;
    ((net.minecraft.entity.projectile.EntityFireball)(__stackOp1624_109_0)).p = ((double)((((net.minecraft.entity.projectile.EntityFireball)(__stackOp1624_109_0)).p + this.v)));
    life11_427 = moom.Dr.a__Float(((double)(((this.t * this.t) + (this.v * this.v)))));
    this.w = ((float)((((float) ((moom.Dr.b(((double)(this.v)), ((double)(this.t))) * 0x1.68p7d) / 0x1.921fb54442d18p1d)) + 0x1.68p6f)));
    this.x = ((float)((((float) ((moom.Dr.b(((double)(((double) life11_427))), ((double)(this.u))) * 0x1.68p7d) / 0x1.921fb54442d18p1d)) - 0x1.68p6f)));
    lexical_cycle_381: while (true) {
    if (!((recovery.source.CarrierOps.fcmpg(((float)((this.x - this.z))), ((float)(-0x1.68p7f))) < 0))) {
        break lexical_join_399;
    }
    net.minecraft.entity.projectile.EntityFireball __stackOp1624_128_0 = this;
    ((net.minecraft.entity.projectile.EntityFireball)(__stackOp1624_128_0)).z = ((float)((((net.minecraft.entity.projectile.EntityFireball)(__stackOp1624_128_0)).z - 0x1.68p8f)));
    if (!((life3_5 != null))) {
        break lexical_join_417;
    }
    if (!((life3_5 == null))) { continue lexical_cycle_381; }
    break lexical_cycle_381;
    }
    }
    lexical_cycle_399: while (true) {
    if (!((recovery.source.CarrierOps.fcmpl(((float)((this.x - this.z))), ((float)(0x1.68p7f))) >= 0))) {
        break lexical_join_417;
    }
    net.minecraft.entity.projectile.EntityFireball __stackOp1624_134_0 = this;
    ((net.minecraft.entity.projectile.EntityFireball)(__stackOp1624_134_0)).z = ((float)((((net.minecraft.entity.projectile.EntityFireball)(__stackOp1624_134_0)).z + 0x1.68p8f)));
    if (!((life3_5 != null))) {
        break lexical_join_435;
    }
    if (!((life3_5 == null))) { continue lexical_cycle_399; }
    break lexical_cycle_399;
    }
    }
    lexical_cycle_417: while (true) {
    if (!((recovery.source.CarrierOps.fcmpg(((float)((this.w - this.y))), ((float)(-0x1.68p7f))) < 0))) {
        break lexical_join_435;
    }
    net.minecraft.entity.projectile.EntityFireball __stackOp1624_140_0 = this;
    ((net.minecraft.entity.projectile.EntityFireball)(__stackOp1624_140_0)).y = ((float)((((net.minecraft.entity.projectile.EntityFireball)(__stackOp1624_140_0)).y - 0x1.68p8f)));
    if (!((life3_5 != null))) {
        break lexical_join_477;
    }
    if (!((life3_5 == null))) { continue lexical_cycle_417; }
    break lexical_cycle_417;
    }
    }
    lexical_cycle_435: while (true) {
    if (!((recovery.source.CarrierOps.fcmpl(((float)((this.w - this.y))), ((float)(0x1.68p7f))) >= 0))) {
        break lexical_join_453;
    }
    net.minecraft.entity.projectile.EntityFireball __stackOp1624_146_0 = this;
    ((net.minecraft.entity.projectile.EntityFireball)(__stackOp1624_146_0)).y = ((float)((((net.minecraft.entity.projectile.EntityFireball)(__stackOp1624_146_0)).y + 0x1.68p8f)));
    if (!((life3_5 != null))) {
        break lexical_join_477;
    }
    if (!((life3_5 == null))) { continue lexical_cycle_435; }
    break lexical_cycle_435;
    }
    }
    this.x = ((float)((this.z + ((this.x - this.z) * 0x1.99999ap-3f))));
    this.w = ((float)((this.y + ((this.w - this.y) * 0x1.99999ap-3f))));
    }
    life12_572 = ((net.minecraft.entity.projectile.EntityFireball)(this)).a();
    spill1624_11 = this;
    if (!((life3_5 != null))) {
        lexicalValue1624_595_0 = spill1624_11;
        break lexical_join_595;
    }
    if (!(((net.minecraft.entity.projectile.EntityFireball)(spill1624_11)).j__Boolean())) {
        break lexical_join_535;
    }
    life13_582 = 0;
    lexical_cycle_487: while (true) {
    if (!((life13_582 < 4))) {
        break lexical_join_533;
    }
    life14_587 = 0x1.0p-2f;
    ((net.minecraft.world.World)(this.i)).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.WATER_BUBBLE)), ((double)((this.n - (this.t * ((double) life14_587))))), ((double)((this.o - (this.u * ((double) life14_587))))), ((double)((this.p - (this.v * ((double) life14_587))))), ((double)(this.t)), ((double)(this.u)), ((double)(this.v)), ((int[])(new int[0])));
    life13_582 += 1;
    if (!((life3_5 != null))) {
        break lexical_join_602;
    }
    if (!((life3_5 == null))) { continue lexical_cycle_487; }
    break lexical_cycle_487;
    }
    }
    life12_572 = 0x1.99999ap-1f;
    }
    net.minecraft.entity.projectile.EntityFireball __stackOp1624_171_0 = this;
    ((net.minecraft.entity.projectile.EntityFireball)(__stackOp1624_171_0)).t = ((double)((((net.minecraft.entity.projectile.EntityFireball)(__stackOp1624_171_0)).t + this.aM)));
    net.minecraft.entity.projectile.EntityFireball __stackOp1624_175_0 = this;
    ((net.minecraft.entity.projectile.EntityFireball)(__stackOp1624_175_0)).u = ((double)((((net.minecraft.entity.projectile.EntityFireball)(__stackOp1624_175_0)).u + this.aN)));
    net.minecraft.entity.projectile.EntityFireball __stackOp1624_179_0 = this;
    ((net.minecraft.entity.projectile.EntityFireball)(__stackOp1624_179_0)).v = ((double)((((net.minecraft.entity.projectile.EntityFireball)(__stackOp1624_179_0)).v + this.aO)));
    net.minecraft.entity.projectile.EntityFireball __stackOp1624_183_0 = this;
    ((net.minecraft.entity.projectile.EntityFireball)(__stackOp1624_183_0)).t = ((double)((((net.minecraft.entity.projectile.EntityFireball)(__stackOp1624_183_0)).t * ((double) life12_572))));
    net.minecraft.entity.projectile.EntityFireball __stackOp1624_186_0 = this;
    ((net.minecraft.entity.projectile.EntityFireball)(__stackOp1624_186_0)).u = ((double)((((net.minecraft.entity.projectile.EntityFireball)(__stackOp1624_186_0)).u * ((double) life12_572))));
    net.minecraft.entity.projectile.EntityFireball __stackOp1624_189_0 = this;
    ((net.minecraft.entity.projectile.EntityFireball)(__stackOp1624_189_0)).v = ((double)((((net.minecraft.entity.projectile.EntityFireball)(__stackOp1624_189_0)).v * ((double) life12_572))));
    ((net.minecraft.world.World)(this.i)).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.SMOKE_NORMAL)), ((double)(this.n)), ((double)((this.o + 0x1.0p-1d))), ((double)(this.p)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((int[])(new int[0])));
    lexicalValue1624_595_0 = this;
    }
    ((net.minecraft.entity.projectile.EntityFireball)(lexicalValue1624_595_0)).a__Void(((double)(this.n)), ((double)(this.o)), ((double)(this.p)));
    }
    if (!((life3_5 == null))) {
        break lexical_join_606;
    }
    }
    lexicalValue1624_605_0 = this;
    }
    ((net.minecraft.entity.projectile.EntityFireball)(lexicalValue1624_605_0)).f__Void();
    }
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_dbecb07edf7c_originalDynamicSite2015_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral11866_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01f4e1cd062e_invokedynamic5452_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01f4e1cd062e_invokedynamic5452_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01f4e1cd062e_invokedynamic5452_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01f4e1cd062e_invokedynamic5452_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_736a66cda11e_invokedynamic1624_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_736a66cda11e_invokedynamic1624_92(int a0, long a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
