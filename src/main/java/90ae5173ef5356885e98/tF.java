package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class tF extends moom.tE {

private static final long bb;

private static final long[] ob;

private static final java.lang.Integer[] pb;

private static final java.util.Map qb;

public tF(net.minecraft.world.World p0) {
super(p0);
}


public tF(net.minecraft.world.World p0, double p1, double p2, double p3) {
super(p0, p1, p2, p3);
}


static {
bb = ((long)(((moom._a)(moom._c.a(((long)(3566975070964875008L)), ((long)(-8307087123744188151L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(100739300442777L)))));
    qb = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.tF.bb ^ 124659375008705L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1025_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1025_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1025_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1025_14 = new byte[8];
    (__sourceSpill1025_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1025_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1025_16 = __sourceSpill1025_14;
    ((javax.crypto.Cipher)(__sourceSpill1025_11)).init(((int)(__sourceSpill1025_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1025_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1025_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "V\033§\021ÔÇ¨\017ßäÌe4\031"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1025_25 = local6_life21;
        int __sourceSpill1025_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1025_25)).substring(((int)(__sourceSpill1025_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1025_30 = local8_life19;
        int __sourceSpill1025_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1025_33 = new byte[8];
        (__sourceSpill1025_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1025_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1025_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1025_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1025_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1025_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1025_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1025_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1025_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1025_34)).doFinal(((byte[])(__sourceSpill1025_33)));
        (__sourceSpill1025_30)[__sourceSpill1025_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    ob = ((long[])(local8_life19));
    pb = ((java.lang.Integer[])(new java.lang.Integer[2]));
}


public net.minecraft.block.state.IBlockState b__fE() {
return ((net.minecraft.block.state.IBlockState)(((moom.cZ)(net.minecraft.init.Blocks.ae)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.cZ.R)), ((java.lang.Comparable)(moom.bs.NORTH)));
}


public int b__Int() {
long local1 = (moom.tF.bb ^ 139723570079578L);
    return __sourceIntrinsic_a63cd0a8780c_originalDynamicSite1649_1(9115, (8079813559920283064L ^ local1));
}


private static moom.Oo c(moom.Oo p0) {
return p0;
}


public java.lang.String c__String() {
return "minecraft:chest";
}


private static int d(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 11296;
      if (pb[var3] == null) {
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
         long var5 = ob[var3];
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
         Object[] var9 = (Object[])qb.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               qb.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/tF", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         pb[var3] = var15;
      }

      return pb[var3];
}


private static int d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_9e565c7c0b5f9d(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral9130_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/tF"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a__sourceReturn_7889e8f768(net.minecraft.util.DamageSource p0) {
moom.tF forwardValue4036_18_0;
    int spill4036_0;
    moom.tF spill4036_1;
    long life2_3;
    int life4_8;
    forward_join_24: {
    forward_join_18: {
    life2_3 = (moom.tF.bb ^ 103334274674303L);
    spill4036_0 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.b();
    super.a__sourceReturn_7889e8f768(((net.minecraft.util.DamageSource)(p0)));
    life4_8 = spill4036_0;
    spill4036_1 = this;
    if (!((life4_8 != 0))) {
        forwardValue4036_18_0 = spill4036_1;
        break forward_join_18;
    }
    if (!(((net.minecraft.world.GameRules)(((net.minecraft.world.World)(((moom.tF)(spill4036_1)).i)).a__Ej())).a__Boolean(((java.lang.String)("doEntityDrops"))))) {
        break forward_join_24;
    }
    forwardValue4036_18_0 = this;
    }
    ((moom.tF)(forwardValue4036_18_0)).a(((net.minecraft.item.Item)(__sourceExactCall_42e37b9acc15b0(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ae))))), ((int)(1)), ((float)(0x0.0p0f)));
    }
    return;
}


public net.minecraft.entity.item.EntityMinecart$EnumMinecartType a__aT() {
return net.minecraft.entity.item.EntityMinecart$EnumMinecartType.CHEST;
}


public moom.v8 a(net.minecraft.entity.player.InventoryPlayer p0, net.minecraft.entity.player.EntityPlayer p1) {
return new moom.wc(p0, this, p1);
}


public int m__sourceReturn_8abf5c6871() {
long local1 = (moom.tF.bb ^ 39284055403096L);
    return __sourceIntrinsic_7fc77bc14dde_originalDynamicSite1650_1(9449, (8058025959837910985L ^ local1));
}


private static native <E extends Throwable> int __sourceIntrinsic_a63cd0a8780c_originalDynamicSite1649_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral9130_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7fc77bc14dde_originalDynamicSite1650_1(int a0, long a1) throws E;

private static native int __sourceExactCall_9e565c7c0b5f9d(int p0, long p1);
private static native net.minecraft.item.Item __sourceExactCall_42e37b9acc15b0(net.minecraft.block.Block p0);
}
