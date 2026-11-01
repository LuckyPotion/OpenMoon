package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class cD extends moom.cu {

private static final long R;

private static final long[] S;

private static final java.lang.Integer[] T;

private static final java.util.Map V;

protected cD() {
super();
    float local1 = 0x1.0p-1f;
    float local2 = 0x1.0p-6f;
    ((moom.cD)(this)).a(((float)((0x1.0p-1f - local1))), ((float)(0x0.0p0f)), ((float)((0x1.0p-1f - local1))), ((float)((0x1.0p-1f + local1))), ((float)(local2)), ((float)((0x1.0p-1f + local1))));
    ((moom.cD)(this)).a(((net.minecraft.creativetab.CreativeTabs)(net.minecraft.creativetab.CreativeTabs.c)));
    return;
}


static {
R = ((long)(((moom._a)(moom._c.a(((long)(-8556841342612975829L)), ((long)(-1960142854816403687L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(189234099070819L)))));
    V = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.cD.R ^ 117339591923892L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1121_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1121_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1121_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1121_14 = new byte[8];
    (__sourceSpill1121_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1121_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1121_16 = __sourceSpill1121_14;
    ((javax.crypto.Cipher)(__sourceSpill1121_11)).init(((int)(__sourceSpill1121_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1121_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1121_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[4];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "±7Á)Áÿdÿ{\005\036\r\b\002aÜ"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1121_25 = local6_life21;
        int __sourceSpill1121_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1121_25)).substring(((int)(__sourceSpill1121_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1121_30 = local8_life19;
        int __sourceSpill1121_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1121_33 = new byte[8];
        (__sourceSpill1121_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1121_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1121_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1121_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1121_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1121_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1121_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1121_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1121_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1121_34)).doFinal(((byte[])(__sourceSpill1121_33)));
        (__sourceSpill1121_30)[__sourceSpill1121_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "âç\027æõÜ\026¶§ÇIÏÖs?"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1121_38 = local6_life21;
        int __sourceSpill1121_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1121_38)).substring(((int)(__sourceSpill1121_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1121_43 = local8_life19;
        int __sourceSpill1121_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1121_46 = new byte[8];
        (__sourceSpill1121_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1121_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1121_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1121_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1121_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1121_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1121_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1121_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1121_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1121_47)).doFinal(((byte[])(__sourceSpill1121_46)));
        (__sourceSpill1121_43)[__sourceSpill1121_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    S = ((long[])(local8_life19));
    T = ((java.lang.Integer[])(new java.lang.Integer[4]));
}


protected boolean b(net.minecraft.block.Block p0) {
long local2 = (moom.cD.R ^ 83553332608042L);
    return ((((p0 == net.minecraft.init.Blocks.j) ? 1 : 0)) != 0);
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7046_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/cD"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public int b(net.minecraft.block.state.IBlockState p0) {
return 0;
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.cD.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 29603;
      if (T[var3] == null) {
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
         long var5 = S[var3];
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
         Object[] var9 = (Object[])V.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               V.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/cD", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         T[var3] = var15;
      }

      return T[var3];
}


public int d__Int() {
long local1 = (moom.cD.R ^ 110661430982612L);
    return __sourceIntrinsic_c8a36ae237a7_originalDynamicSite1396_1(27444, (8183532491154943340L ^ local1));
}


public int d(net.minecraft.block.state.IBlockState p0) {
long local2 = (moom.cD.R ^ 127435115493986L);
    return __sourceIntrinsic_ba4ebd9c343f_originalDynamicSite1397_1(5912, (5815089266864545012L ^ local2));
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, moom.CA p3, java.util.List<moom.CA> p4, net.minecraft.entity.Entity p5) {
long local7 = (moom.cD.R ^ 29953006890573L);
    if ((((p5 instanceof moom.tv) ? 1 : 0) == 0)) {
        super.a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((moom.CA)(p3)), ((java.util.List)(p4)), ((net.minecraft.entity.Entity)(p5)));
    }
    return;
}


public moom.CA a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
return new moom.CA((((double) ((moom.DT)(p1)).a()) + ((moom.cD)(this)).B), (((double) ((moom.DT)(p1)).b()) + ((moom.cD)(this)).C), (((double) ((moom.DT)(p1)).c()) + ((moom.cD)(this)).D), (((double) ((moom.DT)(p1)).a()) + ((moom.cD)(this)).E), (((double) ((moom.DT)(p1)).b()) + ((moom.cD)(this)).F), (((double) ((moom.DT)(p1)).c()) + ((moom.cD)(this)).G));
}


public boolean a__Boolean(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
net.minecraft.block.state.IBlockState forwardValue3035_34_0;
    int forwardValue3035_42_0;
    int forwardValue3035_44_0;
    int forwardValue3035_46_0;
    int spill3035_0;
    int spill3035_1;
    net.minecraft.block.state.IBlockState spill3035_2;
    int spill3035_3;
    long life4_3;
    int[] life6_5;
    net.minecraft.block.state.IBlockState life7_34;
    forward_join_46: {
    forward_join_45: {
    forward_join_44: {
    forward_join_43: {
    forward_join_42: {
    forward_join_34: {
    life4_3 = (moom.cD.R ^ 96203706902551L);
    life6_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3035_0 = ((moom.DT)(p1)).b();
    if (!((life6_5 != null))) {
        forwardValue3035_46_0 = spill3035_0;
        break forward_join_46;
    }
    if (!((spill3035_0 >= 0))) {
        break forward_join_45;
    }
    spill3035_1 = ((moom.DT)(p1)).b();
    if (!((life6_5 != null))) {
        forwardValue3035_46_0 = spill3035_1;
        break forward_join_46;
    }
    if (!((spill3035_1 < __sourceIntrinsic_43cd2316f2c9_invokedynamic3035_4(12354, (4400658245313735128L ^ life4_3))))) {
        break forward_join_45;
    }
    life7_34 = ((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).b__DT())));
    spill3035_2 = life7_34;
    if (!((life6_5 != null))) {
        forwardValue3035_34_0 = spill3035_2;
        break forward_join_34;
    }
    if (!((((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(spill3035_2)).a__ch())).a__fn() == moom.fn.h))) {
        break forward_join_43;
    }
    forwardValue3035_34_0 = life7_34;
    }
    spill3035_3 = ((java.lang.Integer)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(forwardValue3035_34_0)).a(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockLiquid.Q))))))).intValue();
    if (!((life6_5 != null))) {
        forwardValue3035_42_0 = spill3035_3;
        break forward_join_42;
    }
    if (!((spill3035_3 == 0))) {
        break forward_join_43;
    }
    forwardValue3035_42_0 = 1;
    }
    forwardValue3035_44_0 = forwardValue3035_42_0;
    break forward_join_44;
    }
    forwardValue3035_44_0 = 0;
    }
    return ((forwardValue3035_44_0) != 0);
    }
    forwardValue3035_46_0 = 0;
    }
    return ((forwardValue3035_46_0) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public int a(net.minecraft.world.IBlockAccess p0, moom.DT p1, int p2) {
long local4 = (moom.cD.R ^ 82929330771836L);
    return __sourceIntrinsic_cdd8da66b4ba_originalDynamicSite1398_1(17328, (2378233809020331331L ^ local4));
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7046_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c8a36ae237a7_originalDynamicSite1396_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ba4ebd9c343f_originalDynamicSite1397_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_43cd2316f2c9_invokedynamic3035_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_cdd8da66b4ba_originalDynamicSite1398_1(int a0, long a1) throws E;
}
