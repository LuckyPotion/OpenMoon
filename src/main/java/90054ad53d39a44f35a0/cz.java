package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

















import moom.DT;











import net.minecraft.block.BlockPlanks$EnumType;






import net.minecraft.world.World;



import net.minecraft.init.Blocks;


import moom.K;

import net.minecraft.block.state.IBlockState;
import java.util.Map;
public class cz extends moom.cu implements net.minecraft.block.IGrowable {

public static final moom.fw<net.minecraft.block.BlockDoublePlant$EnumPlantType> R;

public static final moom.fw<moom.K> S;

public static final moom.fw<moom.bs> T;

private static final long V;

private static final long[] W;

private static final java.lang.Integer[] X;

private static final java.util.Map Y;

public cz() {
super(moom.fn.l);
    (this).a__Void(((((this.M).a__fE()).a__fE(moom.cz.R, net.minecraft.block.BlockDoublePlant$EnumPlantType.SUNFLOWER)).a__fE(moom.cz.S, moom.K.LOWER)).a__fE(moom.cz.T, moom.bs.NORTH));
    (this).c(0x0.0p+0f);
    (this).a(moom.cz.h);
    (this).b("doublePlant");
}


static {
V = ((long)(((moom._a)(moom._c.a(((long)(6618701846064162539L)), ((long)(3015237207079721556L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(64711148490996L)))));
    Y = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.cz.V ^ 59371443871514L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1143_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1143_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1143_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1143_14 = new byte[8];
    (__sourceSpill1143_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1143_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1143_16 = __sourceSpill1143_14;
    ((javax.crypto.Cipher)(__sourceSpill1143_11)).init(((int)(__sourceSpill1143_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1143_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1143_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[4];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "tÑz¦\0244ÎJ\fû\026¬KiÞ"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1143_25 = local6_life21;
        int __sourceSpill1143_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1143_25)).substring(((int)(__sourceSpill1143_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1143_30 = local8_life19;
        int __sourceSpill1143_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1143_33 = new byte[8];
        (__sourceSpill1143_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1143_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1143_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1143_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1143_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1143_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1143_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1143_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1143_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1143_34)).doFinal(((byte[])(__sourceSpill1143_33)));
        (__sourceSpill1143_30)[__sourceSpill1143_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "+ßÓ´Ì,D¯8Z<ó×Ð"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1143_38 = local6_life21;
        int __sourceSpill1143_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1143_38)).substring(((int)(__sourceSpill1143_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1143_43 = local8_life19;
        int __sourceSpill1143_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1143_46 = new byte[8];
        (__sourceSpill1143_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1143_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1143_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1143_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1143_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1143_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1143_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1143_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1143_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1143_47)).doFinal(((byte[])(__sourceSpill1143_46)));
        (__sourceSpill1143_43)[__sourceSpill1143_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    W = ((long[])(local8_life19));
    X = ((java.lang.Integer[])(new java.lang.Integer[4]));
    R = ((moom.fw)(moom.fw.a(((java.lang.String)("variant")), ((java.lang.Class)(net.minecraft.block.BlockDoublePlant$EnumPlantType.class)))));
    S = ((moom.fw)(moom.fw.a(((java.lang.String)("half")), ((java.lang.Class)(moom.K.class)))));
    T = ((moom.fw)(net.minecraft.block.BlockDirectional.Q));
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7193_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/cz"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public net.minecraft.block.state.IBlockState b__fE(int p0) {
long local2 = (moom.cz.V ^ 70314779716761L);
    return (((p0 & __sourceIntrinsic_819466f05fee_invokedynamic7194_1(4077, (467850130491612334L ^ local2))) > 0) ? ((net.minecraft.block.state.IBlockState)(((moom.cz)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.cz.S)), ((java.lang.Comparable)(moom.K.UPPER))) : ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((moom.cz)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.cz.S)), ((java.lang.Comparable)(moom.K.LOWER))))).a__fE(((net.minecraft.block.properties.IProperty)(moom.cz.R)), ((java.lang.Comparable)(net.minecraft.block.BlockDoublePlant$EnumPlantType.a(((int)((p0 & __sourceIntrinsic_819466f05fee_invokedynamic7194_11(16672, (2641713599012098658L ^ local2))))))))));
}


public int b(net.minecraft.block.state.IBlockState p0) {
java.lang.Comparable forwardValue3174_28_0;
    int forwardValue3174_30_0;
    java.lang.Comparable spill3174_0;
    long life2_3;
    int[] life4_5;
    forward_join_30: {
    forward_join_28: {
    forward_join_25: {
    life2_3 = (moom.cz.V ^ 56381348501395L);
    life4_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3174_0 = ((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.cz.S)));
    if (!((life4_5 != null))) {
        forwardValue3174_28_0 = spill3174_0;
        break forward_join_28;
    }
    if (!((spill3174_0 == moom.K.UPPER))) {
        break forward_join_25;
    }
    forwardValue3174_30_0 = (__sourceIntrinsic_8db5871551d4_invokedynamic3174_5(24124, (3197755418850309750L ^ life2_3)) | ((moom.bs)(((moom.bs)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.cz.T))))))).b());
    break forward_join_30;
    }
    forwardValue3174_28_0 = ((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.cz.R)));
    }
    forwardValue3174_30_0 = ((net.minecraft.block.BlockDoublePlant$EnumPlantType)(((net.minecraft.block.BlockDoublePlant$EnumPlantType)(forwardValue3174_28_0)))).a();
    }
    return forwardValue3174_30_0;
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.cz.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 30861;
      if (X[var3] == null) {
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
         long var5 = W[var3];
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
         Object[] var9 = (Object[])Y.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               Y.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/cz", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         X[var3] = var15;
      }

      return X[var3];
}


public boolean b__Boolean(net.minecraft.world.World p0, moom.DT p1) {
int forwardValue3175_17_0;
    int forwardValue3175_21_0;
    int forwardValue3175_23_0;
    boolean spill3175_0;
    long life3_3;
    int[] life5_5;
    forward_join_23: {
    forward_join_22: {
    forward_join_21: {
    forward_join_17: {
    life3_3 = (moom.cz.V ^ 55109239911867L);
    life5_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3175_0 = super.b__Boolean(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)));
    if (!((life5_5 != null))) {
        forwardValue3175_17_0 = ((spill3175_0) ? 1 : 0);
        break forward_join_17;
    }
    if (!(spill3175_0)) {
        break forward_join_22;
    }
    forwardValue3175_17_0 = ((((net.minecraft.world.World)(p0)).a__Boolean(((moom.DT)(((moom.DT)(p1)).a__DT())))) ? 1 : 0);
    }
    if (!((life5_5 != null))) {
        forwardValue3175_21_0 = forwardValue3175_17_0;
        break forward_join_21;
    }
    if (!((forwardValue3175_17_0 != 0))) {
        break forward_join_22;
    }
    forwardValue3175_21_0 = 1;
    }
    forwardValue3175_23_0 = forwardValue3175_21_0;
    break forward_join_23;
    }
    forwardValue3175_23_0 = 0;
    }
    return ((forwardValue3175_23_0) != 0);
}


public int c(net.minecraft.block.state.IBlockState p0) {
java.lang.Comparable forwardValue3176_16_0;
    java.lang.Comparable forwardValue3176_23_0;
    int forwardValue3176_27_0;
    java.lang.Comparable spill3176_0;
    long life2_3;
    int[] life4_5;
    forward_join_27: {
    forward_join_26: {
    forward_join_23: {
    forward_join_16: {
    life2_3 = (moom.cz.V ^ 30009892079307L);
    life4_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3176_0 = ((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.cz.S)));
    if (!((life4_5 != null))) {
        forwardValue3176_16_0 = spill3176_0;
        break forward_join_16;
    }
    if (!((spill3176_0 != moom.K.UPPER))) {
        break forward_join_26;
    }
    forwardValue3176_16_0 = ((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.cz.R)));
    }
    if (!((life4_5 != null))) {
        forwardValue3176_23_0 = forwardValue3176_16_0;
        break forward_join_23;
    }
    if (!((forwardValue3176_16_0 != net.minecraft.block.BlockDoublePlant$EnumPlantType.GRASS))) {
        break forward_join_26;
    }
    forwardValue3176_23_0 = ((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.cz.R)));
    }
    forwardValue3176_27_0 = ((net.minecraft.block.BlockDoublePlant$EnumPlantType)(((net.minecraft.block.BlockDoublePlant$EnumPlantType)(forwardValue3176_23_0)))).a();
    break forward_join_27;
    }
    forwardValue3176_27_0 = 0;
    }
    return forwardValue3176_27_0;
}


protected void d(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
block4: {
            long l = moom.cz.V ^ 0x4C3DF94DB20DL;
            int[] nArray = BlockPlanks$EnumType.b__ArrayInt();
            if (this.a__Boolean(p0, p1, p2)) break block4;
            boolean bl = p2.a(moom.cz.S) == moom.K.UPPER;
            DT dT2 = bl ? p1 : p1.a__DT();
            DT dT3 = bl ? p1.b__DT() : p1;
            net.minecraft.block.Block cz2 = bl ? this : p0.a__fE(dT2).a__ch();
            net.minecraft.block.Block cz3 = bl ? p0.a__fE(dT3).a__ch() : this;
            net.minecraft.block.Block cz4 = cz2;
            net.minecraft.block.Block cz5 = this;
            if (nArray != null) {
                if (cz4 == cz5) {
                    p0.a(dT2, Blocks.a.a__fE(), 2);
                }
                cz4 = cz3;
                cz5 = this;
            }
            if (cz4 == cz5) {
                p0.a(dT3, Blocks.a.a__fE(), 3);
                if (!bl) {
                    this.a(p0, dT3, p2, 0);
                }
            }
        }
}


public boolean a__Boolean(net.minecraft.world.World p0, moom.DT p1) {
net.minecraft.block.state.IBlockState forwardValue3171_23_0;
    net.minecraft.block.BlockDoublePlant$EnumPlantType forwardValue3171_34_0;
    net.minecraft.block.BlockDoublePlant$EnumPlantType forwardValue3171_34_1;
    int forwardValue3171_38_0;
    int[] spill3171_0;
    net.minecraft.block.state.IBlockState spill3171_1;
    net.minecraft.block.BlockDoublePlant$EnumPlantType spill3171_2;
    net.minecraft.block.BlockDoublePlant$EnumPlantType spill3171_3;
    long life3_3;
    net.minecraft.block.state.IBlockState life6_8;
    int[] life5_9;
    net.minecraft.block.BlockDoublePlant$EnumPlantType life7_31;
    forward_join_38: {
    forward_join_37: {
    forward_join_35: {
    forward_join_34: {
    forward_join_23: {
    forward_join_18: {
    life3_3 = (moom.cz.V ^ 12809762800930L);
    spill3171_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life6_8 = ((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(p1)));
    life5_9 = spill3171_0;
    spill3171_1 = life6_8;
    if (!((life5_9 != null))) {
        forwardValue3171_23_0 = spill3171_1;
        break forward_join_23;
    }
    if (!((((net.minecraft.block.state.IBlockState)(spill3171_1)).a__ch() != this))) {
        break forward_join_18;
    }
    return ((1) != 0);
    }
    forwardValue3171_23_0 = ((moom.cz)(this)).a(((net.minecraft.block.state.IBlockState)(life6_8)), ((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(p1)));
    }
    life7_31 = ((net.minecraft.block.BlockDoublePlant$EnumPlantType)(((net.minecraft.block.state.IBlockState)(forwardValue3171_23_0)).a(((net.minecraft.block.properties.IProperty)(moom.cz.R)))));
    spill3171_2 = life7_31;
    spill3171_3 = net.minecraft.block.BlockDoublePlant$EnumPlantType.FERN;
    if (!((life5_9 != null))) {
        forwardValue3171_34_0 = spill3171_2;
        forwardValue3171_34_1 = spill3171_3;
        break forward_join_34;
    }
    if (!((spill3171_2 != spill3171_3))) {
        break forward_join_35;
    }
    forwardValue3171_34_0 = life7_31;
    forwardValue3171_34_1 = net.minecraft.block.BlockDoublePlant$EnumPlantType.GRASS;
    }
    if (!((forwardValue3171_34_0 == forwardValue3171_34_1))) {
        break forward_join_37;
    }
    }
    forwardValue3171_38_0 = 1;
    break forward_join_38;
    }
    forwardValue3171_38_0 = 0;
    }
    return ((forwardValue3171_38_0) != 0);
}


protected moom.fA a__fA() {
return new moom.fA(this, new net.minecraft.block.properties.IProperty[] {moom.cz.S, moom.cz.R, moom.cz.T});
}


public net.minecraft.block.state.IBlockState a(net.minecraft.block.state.IBlockState p0, net.minecraft.world.IBlockAccess p1, moom.DT p2) {
net.minecraft.block.state.IBlockState forwardValue3164_33_0;
    net.minecraft.block.state.IBlockState spill3164_0;
    net.minecraft.block.state.IBlockState spill3164_1;
    long life4_3;
    int[] life6_5;
    net.minecraft.block.state.IBlockState life7_20;
    forward_join_33: {
    forward_join_32: {
    life4_3 = (moom.cz.V ^ 113264639186437L);
    life6_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3164_0 = p0;
    if (!((life6_5 != null))) {
        forwardValue3164_33_0 = spill3164_0;
        break forward_join_33;
    }
    if (!((((net.minecraft.block.state.IBlockState)(spill3164_0)).a(((net.minecraft.block.properties.IProperty)(moom.cz.S))) == moom.K.UPPER))) {
        break forward_join_32;
    }
    life7_20 = ((net.minecraft.world.IBlockAccess)(p1)).a__fE(((moom.DT)(((moom.DT)(p2)).b__DT())));
    spill3164_1 = life7_20;
    if (!((life6_5 != null))) {
        forwardValue3164_33_0 = spill3164_1;
        break forward_join_33;
    }
    if (!((((net.minecraft.block.state.IBlockState)(spill3164_1)).a__ch() == this))) {
        break forward_join_32;
    }
    p0 = ((net.minecraft.block.state.IBlockState)(p0)).a__fE(((net.minecraft.block.properties.IProperty)(moom.cz.R)), ((java.lang.Comparable)(((net.minecraft.block.BlockDoublePlant$EnumPlantType)(((net.minecraft.block.state.IBlockState)(life7_20)).a(((net.minecraft.block.properties.IProperty)(moom.cz.R))))))));
    }
    forwardValue3164_33_0 = p0;
    }
    return forwardValue3164_33_0;
}


public void a(net.minecraft.world.World p0, java.util.Random p1, moom.DT p2, net.minecraft.block.state.IBlockState p3) {
moom.cz.a(((net.minecraft.world.World)(p0)), ((moom.DT)(p2)), ((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(this, 1, ((net.minecraft.block.BlockDoublePlant$EnumPlantType)(((moom.cz)(this)).a__sourceReturn_dfe2360a0e(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(p2))))).a()))));
    return;
}


public void a(net.minecraft.item.Item p0, net.minecraft.creativetab.CreativeTabs p1, java.util.List<net.minecraft.item.ItemStack> p2) {
int[] spill1092_0;
    long life4_3;
    net.minecraft.block.BlockDoublePlant$EnumPlantType[] life7_6;
    int life8_9;
    int life9_11;
    int[] life6_12;
    net.minecraft.block.BlockDoublePlant$EnumPlantType life10_19;
    lexical_join_33: {
    life4_3 = (moom.cz.V ^ 70114886847172L);
    spill1092_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life7_6 = net.minecraft.block.BlockDoublePlant$EnumPlantType.values();
    life8_9 = (life7_6).length;
    life9_11 = 0;
    life6_12 = spill1092_0;
    lexical_cycle_13: while (true) {
    if (!((life9_11 < life8_9))) {
        break lexical_join_33;
    }
    life10_19 = (life7_6)[life9_11];
    ((java.util.List)(p2)).add(((java.lang.Object)(new net.minecraft.item.ItemStack(p0, 1, ((net.minecraft.block.BlockDoublePlant$EnumPlantType)(life10_19)).a()))));
    life9_11 += 1;
    if (!((life6_12 == null))) { continue lexical_cycle_13; }
    break lexical_cycle_13;
    }
    }
    return;
}


public void a__Void(net.minecraft.world.IBlockAccess p0, moom.DT p1) {
((moom.cz)(this)).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    return;
}


public net.minecraft.block.BlockDoublePlant$EnumPlantType a__sourceReturn_dfe2360a0e(net.minecraft.world.IBlockAccess p0, moom.DT p1) {
net.minecraft.block.state.IBlockState forwardValue3166_23_0;
    int[] spill3166_0;
    net.minecraft.block.state.IBlockState spill3166_1;
    long life3_3;
    net.minecraft.block.state.IBlockState life6_8;
    int[] life5_9;
    net.minecraft.block.state.IBlockState life6_24;
    forward_join_27: {
    forward_join_23: {
    life3_3 = (moom.cz.V ^ 101305049374314L);
    spill3166_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life6_8 = ((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(p1)));
    life5_9 = spill3166_0;
    spill3166_1 = life6_8;
    if (!((life5_9 != null))) {
        forwardValue3166_23_0 = spill3166_1;
        break forward_join_23;
    }
    if (!((((net.minecraft.block.state.IBlockState)(spill3166_1)).a__ch() == this))) {
        break forward_join_27;
    }
    life6_24 = ((moom.cz)(this)).a(((net.minecraft.block.state.IBlockState)(life6_8)), ((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(p1)));
    forwardValue3166_23_0 = life6_24;
    }
    return ((net.minecraft.block.BlockDoublePlant$EnumPlantType)(((net.minecraft.block.state.IBlockState)(forwardValue3166_23_0)).a(((net.minecraft.block.properties.IProperty)(moom.cz.R)))));
    }
    return net.minecraft.block.BlockDoublePlant$EnumPlantType.FERN;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public moom.F a__F() {
return moom.F.XZ;
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.entity.player.EntityPlayer p3) {
net.minecraft.block.state.IBlockState forwardValue3168_17_0;
    net.minecraft.block.BlockDoublePlant$EnumPlantType forwardValue3168_43_0;
    net.minecraft.block.BlockDoublePlant$EnumPlantType forwardValue3168_43_1;
    net.minecraft.item.ItemStack forwardValue3168_64_0;
    int forwardValue3168_93_0;
    int forwardValue3168_100_0;
    net.minecraft.world.World forwardValue3168_119_0;
    moom.DT forwardValue3168_119_1;
    net.minecraft.block.state.IBlockState spill3168_0;
    boolean spill3168_1;
    net.minecraft.block.BlockDoublePlant$EnumPlantType spill3168_2;
    net.minecraft.block.BlockDoublePlant$EnumPlantType spill3168_3;
    boolean spill3168_4;
    net.minecraft.item.ItemStack spill3168_5;
    net.minecraft.world.World spill3168_6;
    moom.DT spill3168_7;
    long life5_3;
    int[] life7_5;
    net.minecraft.block.state.IBlockState life8_42;
    net.minecraft.block.BlockDoublePlant$EnumPlantType life9_47;
    forward_join_124: {
    forward_join_119: {
    forward_join_103: {
    forward_join_100: {
    forward_join_96: {
    forward_join_94: {
    forward_join_93: {
    forward_join_89: {
    forward_join_81: {
    forward_join_64: {
    forward_join_52: {
    forward_join_43: {
    forward_join_17: {
    life5_3 = (moom.cz.V ^ 112210787608043L);
    life7_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3168_0 = p2;
    if (!((life7_5 != null))) {
        forwardValue3168_17_0 = spill3168_0;
        break forward_join_17;
    }
    if (!((((net.minecraft.block.state.IBlockState)(spill3168_0)).a(((net.minecraft.block.properties.IProperty)(moom.cz.S))) == moom.K.UPPER))) {
        break forward_join_103;
    }
    forwardValue3168_17_0 = ((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).b__DT())));
    }
    if (!((((net.minecraft.block.state.IBlockState)(forwardValue3168_17_0)).a__ch() == this))) {
        break forward_join_124;
    }
    spill3168_1 = ((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.entity.player.EntityPlayer)(p3)).b1)).d;
    if (!((life7_5 != null))) {
        forwardValue3168_100_0 = ((spill3168_1) ? 1 : 0);
        break forward_join_100;
    }
    if (!((!spill3168_1))) {
        break forward_join_96;
    }
    life8_42 = ((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).b__DT())));
    life9_47 = ((net.minecraft.block.BlockDoublePlant$EnumPlantType)(((net.minecraft.block.state.IBlockState)(life8_42)).a(((net.minecraft.block.properties.IProperty)(moom.cz.R)))));
    spill3168_2 = life9_47;
    spill3168_3 = net.minecraft.block.BlockDoublePlant$EnumPlantType.FERN;
    if (!((life7_5 != null))) {
        forwardValue3168_43_0 = spill3168_2;
        forwardValue3168_43_1 = spill3168_3;
        break forward_join_43;
    }
    if (!((spill3168_2 != spill3168_3))) {
        break forward_join_52;
    }
    forwardValue3168_43_0 = life9_47;
    forwardValue3168_43_1 = net.minecraft.block.BlockDoublePlant$EnumPlantType.GRASS;
    }
    if (!((forwardValue3168_43_0 != forwardValue3168_43_1))) {
        break forward_join_52;
    }
    ((net.minecraft.world.World)(p0)).b(((moom.DT)(((moom.DT)(p1)).b__DT())), ((boolean)(true)));
    if (!((life7_5 == null))) {
        break forward_join_94;
    }
    }
    spill3168_4 = ((net.minecraft.world.World)(p0)).G;
    if (!((life7_5 != null))) {
        forwardValue3168_93_0 = ((spill3168_4) ? 1 : 0);
        break forward_join_93;
    }
    if (!((!spill3168_4))) {
        break forward_join_89;
    }
    spill3168_5 = ((net.minecraft.entity.player.EntityPlayer)(p3)).c__xW();
    if (!((life7_5 != null))) {
        forwardValue3168_64_0 = spill3168_5;
        break forward_join_64;
    }
    if (!((spill3168_5 != null))) {
        break forward_join_81;
    }
    forwardValue3168_64_0 = ((net.minecraft.entity.player.EntityPlayer)(p3)).c__xW();
    }
    if (!((((net.minecraft.item.ItemStack)(forwardValue3168_64_0)).a__wQ() == net.minecraft.init.Items.a4))) {
        break forward_join_81;
    }
    ((moom.cz)(this)).a__Boolean(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(life8_42)), ((net.minecraft.entity.player.EntityPlayer)(p3)));
    ((net.minecraft.world.World)(p0)).d__Boolean(((moom.DT)(((moom.DT)(p1)).b__DT())));
    if (!((life7_5 == null))) {
        break forward_join_94;
    }
    }
    ((net.minecraft.world.World)(p0)).b(((moom.DT)(((moom.DT)(p1)).b__DT())), ((boolean)(true)));
    if (!((life7_5 == null))) {
        break forward_join_94;
    }
    }
    forwardValue3168_93_0 = ((((net.minecraft.world.World)(p0)).d__Boolean(((moom.DT)(((moom.DT)(p1)).b__DT())))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue3168_93_0);
    }
    if (!((life7_5 == null))) {
        break forward_join_124;
    }
    }
    forwardValue3168_100_0 = ((((net.minecraft.world.World)(p0)).d__Boolean(((moom.DT)(((moom.DT)(p1)).b__DT())))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue3168_100_0);
    if (!((life7_5 == null))) {
        break forward_join_124;
    }
    }
    if (!(((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.entity.player.EntityPlayer)(p3)).b1)).d)) {
        break forward_join_124;
    }
    spill3168_6 = p0;
    spill3168_7 = ((moom.DT)(p1)).a__DT();
    if (!((life7_5 != null))) {
        forwardValue3168_119_0 = spill3168_6;
        forwardValue3168_119_1 = spill3168_7;
        break forward_join_119;
    }
    if (!((((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(spill3168_6)).a__fE(((moom.DT)(spill3168_7))))).a__ch() == this))) {
        break forward_join_124;
    }
    forwardValue3168_119_0 = p0;
    forwardValue3168_119_1 = ((moom.DT)(p1)).a__DT();
    }
    ((net.minecraft.world.World)(forwardValue3168_119_0)).a(((moom.DT)(forwardValue3168_119_1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((int)(2)));
    }
    super.a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((net.minecraft.entity.player.EntityPlayer)(p3)));
    return;
}


public void a(net.minecraft.world.World p0, net.minecraft.entity.player.EntityPlayer p1, moom.DT p2, net.minecraft.block.state.IBlockState p3, net.minecraft.tileentity.TileEntity p4) {
net.minecraft.item.ItemStack forwardValue3170_16_0;
    moom.cz forwardValue3170_35_0;
    net.minecraft.world.World forwardValue3170_35_1;
    net.minecraft.item.ItemStack spill3170_0;
    moom.cz spill3170_1;
    net.minecraft.world.World spill3170_2;
    long life6_3;
    int[] life8_5;
    forward_join_40: {
    forward_join_35: {
    forward_join_33: {
    forward_join_16: {
    life6_3 = (moom.cz.V ^ 119193447468546L);
    life8_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    if (!((!((net.minecraft.world.World)(p0)).G))) {
        break forward_join_33;
    }
    spill3170_0 = ((net.minecraft.entity.player.EntityPlayer)(p1)).c__xW();
    if (!((life8_5 != null))) {
        forwardValue3170_16_0 = spill3170_0;
        break forward_join_16;
    }
    if (!((spill3170_0 != null))) {
        break forward_join_33;
    }
    forwardValue3170_16_0 = ((net.minecraft.entity.player.EntityPlayer)(p1)).c__xW();
    }
    if (!((((net.minecraft.item.ItemStack)(forwardValue3170_16_0)).a__wQ() == net.minecraft.init.Items.a4))) {
        break forward_join_33;
    }
    if (!((((net.minecraft.block.state.IBlockState)(p3)).a(((net.minecraft.block.properties.IProperty)(moom.cz.S))) == moom.K.LOWER))) {
        break forward_join_33;
    }
    spill3170_1 = this;
    spill3170_2 = p0;
    if (!((life8_5 != null))) {
        forwardValue3170_35_0 = spill3170_1;
        forwardValue3170_35_1 = spill3170_2;
        break forward_join_35;
    }
    if (!((!((moom.cz)(spill3170_1)).a__Boolean(((net.minecraft.world.World)(spill3170_2)), ((moom.DT)(p2)), ((net.minecraft.block.state.IBlockState)(p3)), ((net.minecraft.entity.player.EntityPlayer)(p1)))))) {
        break forward_join_40;
    }
    }
    forwardValue3170_35_0 = this;
    forwardValue3170_35_1 = p0;
    }
    __sourceIntrinsic_2dd0c74d84c0_call3170_11(forwardValue3170_35_0, forwardValue3170_35_1, p1, p2, p3, p4);
    }
    return;
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.entity.EntityLivingBase p3, net.minecraft.item.ItemStack p4) {
((net.minecraft.world.World)(p0)).a(((moom.DT)(((moom.DT)(p1)).a__DT())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((moom.cz)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.cz.S)), ((java.lang.Comparable)(moom.K.UPPER))))), ((int)(2)));
    return;
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.BlockDoublePlant$EnumPlantType p2, int p3) {
((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((moom.cz)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.cz.S)), ((java.lang.Comparable)(moom.K.LOWER))))).a__fE(((net.minecraft.block.properties.IProperty)(moom.cz.R)), ((java.lang.Comparable)(p2))))), ((int)(p3)));
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(((moom.DT)(p1)).a__DT())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((moom.cz)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.cz.S)), ((java.lang.Comparable)(moom.K.UPPER))))), ((int)(p3)));
    return;
}


public int a(net.minecraft.world.IBlockAccess p0, moom.DT p1, int p2) {
net.minecraft.block.BlockDoublePlant$EnumPlantType forwardValue3167_18_0;
    net.minecraft.block.BlockDoublePlant$EnumPlantType forwardValue3167_18_1;
    int forwardValue3167_28_0;
    int[] spill3167_0;
    net.minecraft.block.BlockDoublePlant$EnumPlantType spill3167_1;
    net.minecraft.block.BlockDoublePlant$EnumPlantType spill3167_2;
    long life4_3;
    net.minecraft.block.BlockDoublePlant$EnumPlantType life7_9;
    int[] life6_10;
    forward_join_28: {
    forward_join_25: {
    forward_join_18: {
    life4_3 = (moom.cz.V ^ 123959386526215L);
    spill3167_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life7_9 = ((moom.cz)(this)).a__sourceReturn_dfe2360a0e(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(p1)));
    life6_10 = spill3167_0;
    spill3167_1 = life7_9;
    spill3167_2 = net.minecraft.block.BlockDoublePlant$EnumPlantType.GRASS;
    if (!((life6_10 != null))) {
        forwardValue3167_18_0 = spill3167_1;
        forwardValue3167_18_1 = spill3167_2;
        break forward_join_18;
    }
    if (!((spill3167_1 != spill3167_2))) {
        break forward_join_25;
    }
    forwardValue3167_18_0 = life7_9;
    forwardValue3167_18_1 = net.minecraft.block.BlockDoublePlant$EnumPlantType.FERN;
    }
    if (!((forwardValue3167_18_0 != forwardValue3167_18_1))) {
        break forward_join_25;
    }
    forwardValue3167_28_0 = __sourceIntrinsic_cdd8da66b4ba_invokedynamic3167_5(21070, (1025710651593965457L ^ life4_3));
    break forward_join_28;
    }
    forwardValue3167_28_0 = moom.EO.a(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(p1)));
    }
    return forwardValue3167_28_0;
}


public net.minecraft.item.Item a(net.minecraft.block.state.IBlockState p0, java.util.Random p1, int p2) {
java.lang.Comparable forwardValue3163_18_0;
    net.minecraft.block.BlockDoublePlant$EnumPlantType forwardValue3163_29_0;
    net.minecraft.block.BlockDoublePlant$EnumPlantType forwardValue3163_29_1;
    net.minecraft.item.Item forwardValue3163_44_0;
    java.lang.Comparable spill3163_0;
    net.minecraft.block.BlockDoublePlant$EnumPlantType spill3163_1;
    net.minecraft.block.BlockDoublePlant$EnumPlantType spill3163_2;
    long life4_3;
    int[] life6_5;
    net.minecraft.block.BlockDoublePlant$EnumPlantType life7_24;
    forward_join_44: {
    forward_join_42: {
    forward_join_40: {
    forward_join_29: {
    forward_join_27: {
    forward_join_18: {
    forward_join_15: {
    life4_3 = (moom.cz.V ^ 119387654566146L);
    life6_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3163_0 = ((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.cz.S)));
    if (!((life6_5 != null))) {
        forwardValue3163_18_0 = spill3163_0;
        break forward_join_18;
    }
    if (!((spill3163_0 == moom.K.UPPER))) {
        break forward_join_15;
    }
    return null;
    }
    forwardValue3163_18_0 = ((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.cz.R)));
    }
    life7_24 = ((net.minecraft.block.BlockDoublePlant$EnumPlantType)(forwardValue3163_18_0));
    spill3163_1 = life7_24;
    spill3163_2 = net.minecraft.block.BlockDoublePlant$EnumPlantType.FERN;
    if (!((life6_5 != null))) {
        forwardValue3163_29_0 = spill3163_1;
        forwardValue3163_29_1 = spill3163_2;
        break forward_join_29;
    }
    if (!((spill3163_1 == spill3163_2))) {
        break forward_join_27;
    }
    forwardValue3163_44_0 = null;
    break forward_join_44;
    }
    forwardValue3163_29_0 = life7_24;
    forwardValue3163_29_1 = net.minecraft.block.BlockDoublePlant$EnumPlantType.GRASS;
    }
    if (!((forwardValue3163_29_0 == forwardValue3163_29_1))) {
        break forward_join_42;
    }
    if (!((((java.util.Random)(p1)).nextInt(((int)(__sourceIntrinsic_0611ab0e6a18_invokedynamic3163_10(24124, (3197813357229199591L ^ life4_3))))) == 0))) {
        break forward_join_40;
    }
    forwardValue3163_44_0 = net.minecraft.init.Items.N;
    break forward_join_44;
    }
    forwardValue3163_44_0 = null;
    break forward_join_44;
    }
    forwardValue3163_44_0 = net.minecraft.item.Item.a(((net.minecraft.block.Block)(this)));
    }
    return forwardValue3163_44_0;
}


public boolean a__Boolean(net.minecraft.world.World p0, java.util.Random p1, moom.DT p2, net.minecraft.block.state.IBlockState p3) {
return ((1) != 0);
}


public boolean a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, boolean p3) {
net.minecraft.block.BlockDoublePlant$EnumPlantType forwardValue3169_18_0;
    net.minecraft.block.BlockDoublePlant$EnumPlantType forwardValue3169_18_1;
    int forwardValue3169_22_0;
    int[] spill3169_0;
    net.minecraft.block.BlockDoublePlant$EnumPlantType spill3169_1;
    net.minecraft.block.BlockDoublePlant$EnumPlantType spill3169_2;
    long life5_3;
    net.minecraft.block.BlockDoublePlant$EnumPlantType life8_9;
    int[] life7_10;
    forward_join_22: {
    forward_join_21: {
    forward_join_18: {
    life5_3 = (moom.cz.V ^ 101107134232212L);
    spill3169_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life8_9 = ((moom.cz)(this)).a__sourceReturn_dfe2360a0e(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(p1)));
    life7_10 = spill3169_0;
    spill3169_1 = life8_9;
    spill3169_2 = net.minecraft.block.BlockDoublePlant$EnumPlantType.GRASS;
    if (!((life7_10 != null))) {
        forwardValue3169_18_0 = spill3169_1;
        forwardValue3169_18_1 = spill3169_2;
        break forward_join_18;
    }
    if (!((spill3169_1 != spill3169_2))) {
        break forward_join_21;
    }
    forwardValue3169_18_0 = life8_9;
    forwardValue3169_18_1 = net.minecraft.block.BlockDoublePlant$EnumPlantType.FERN;
    }
    if (!((forwardValue3169_18_0 != forwardValue3169_18_1))) {
        break forward_join_21;
    }
    forwardValue3169_22_0 = 1;
    break forward_join_22;
    }
    forwardValue3169_22_0 = 0;
    }
    return ((forwardValue3169_22_0) != 0);
}


public int a__Int(net.minecraft.world.World p0, moom.DT p1) {
return ((net.minecraft.block.BlockDoublePlant$EnumPlantType)(((moom.cz)(this)).a__sourceReturn_dfe2360a0e(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(p1))))).a();
}


public boolean a__Boolean(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
int forwardValue3172_23_0;
    net.minecraft.block.state.IBlockState forwardValue3172_28_0;
    int forwardValue3172_42_0;
    int forwardValue3172_44_0;
    net.minecraft.block.state.IBlockState spill3172_0;
    boolean spill3172_1;
    long life4_3;
    int[] life6_5;
    net.minecraft.block.state.IBlockState life7_36;
    forward_join_44: {
    forward_join_43: {
    forward_join_42: {
    forward_join_28: {
    forward_join_24: {
    forward_join_23: {
    forward_join_22: {
    life4_3 = (moom.cz.V ^ 119498299977068L);
    life6_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3172_0 = p2;
    if (!((life6_5 != null))) {
        forwardValue3172_28_0 = spill3172_0;
        break forward_join_28;
    }
    if (!((((net.minecraft.block.state.IBlockState)(spill3172_0)).a(((net.minecraft.block.properties.IProperty)(moom.cz.S))) == moom.K.UPPER))) {
        break forward_join_24;
    }
    if (!((((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).b__DT()))))).a__ch() == this))) {
        break forward_join_22;
    }
    forwardValue3172_23_0 = 1;
    break forward_join_23;
    }
    forwardValue3172_23_0 = 0;
    }
    return ((forwardValue3172_23_0) != 0);
    }
    forwardValue3172_28_0 = ((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).a__DT())));
    }
    life7_36 = forwardValue3172_28_0;
    if (!((((net.minecraft.block.state.IBlockState)(life7_36)).a__ch() == this))) {
        break forward_join_43;
    }
    spill3172_1 = super.a__Boolean(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(life7_36)));
    if (!((life6_5 != null))) {
        forwardValue3172_42_0 = ((spill3172_1) ? 1 : 0);
        break forward_join_42;
    }
    if (!(spill3172_1)) {
        break forward_join_43;
    }
    forwardValue3172_42_0 = 1;
    }
    forwardValue3172_44_0 = forwardValue3172_42_0;
    break forward_join_44;
    }
    forwardValue3172_44_0 = 0;
    }
    return ((forwardValue3172_44_0) != 0);
}


private boolean a__Boolean(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.entity.player.EntityPlayer p3) {
net.minecraft.block.BlockDoublePlant$EnumPlantType forwardValue3173_31_0;
    net.minecraft.block.BlockDoublePlant$EnumPlantType forwardValue3173_31_1;
    moom.ar forwardValue3173_35_0;
    int[] spill3173_0;
    net.minecraft.block.BlockDoublePlant$EnumPlantType spill3173_1;
    net.minecraft.block.BlockDoublePlant$EnumPlantType spill3173_2;
    net.minecraft.block.BlockDoublePlant$EnumPlantType spill3173_3;
    net.minecraft.block.BlockDoublePlant$EnumPlantType spill3173_4;
    long life5_3;
    net.minecraft.block.BlockDoublePlant$EnumPlantType life8_9;
    int[] life7_10;
    int life9_49;
    forward_join_35: {
    forward_join_34: {
    forward_join_31: {
    forward_join_23: {
    life5_3 = (moom.cz.V ^ 110351758891547L);
    spill3173_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life8_9 = ((net.minecraft.block.BlockDoublePlant$EnumPlantType)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.cz.R)))));
    life7_10 = spill3173_0;
    spill3173_1 = life8_9;
    spill3173_2 = net.minecraft.block.BlockDoublePlant$EnumPlantType.FERN;
    if (!((life7_10 != null))) {
        forwardValue3173_31_0 = spill3173_1;
        forwardValue3173_31_1 = spill3173_2;
        break forward_join_31;
    }
    if (!((spill3173_1 != spill3173_2))) {
        break forward_join_23;
    }
    spill3173_3 = life8_9;
    spill3173_4 = net.minecraft.block.BlockDoublePlant$EnumPlantType.GRASS;
    if (!((life7_10 != null))) {
        forwardValue3173_31_0 = spill3173_3;
        forwardValue3173_31_1 = spill3173_4;
        break forward_join_31;
    }
    if (!((spill3173_3 != spill3173_4))) {
        break forward_join_23;
    }
    return ((0) != 0);
    }
    ((net.minecraft.entity.player.EntityPlayer)(p3)).a(((moom.BY)((net.minecraft.stats.StatList.ab)[net.minecraft.block.Block.a(((net.minecraft.block.Block)(this)))])));
    forwardValue3173_31_0 = life8_9;
    forwardValue3173_31_1 = net.minecraft.block.BlockDoublePlant$EnumPlantType.GRASS;
    }
    if (!((forwardValue3173_31_0 == forwardValue3173_31_1))) {
        break forward_join_34;
    }
    forwardValue3173_35_0 = moom.ar.GRASS;
    break forward_join_35;
    }
    forwardValue3173_35_0 = moom.ar.FERN;
    }
    life9_49 = ((moom.ar)(forwardValue3173_35_0)).a();
    moom.cz.a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.H, 2, life9_49))));
    return ((1) != 0);
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7193_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_819466f05fee_invokedynamic7194_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_819466f05fee_invokedynamic7194_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8db5871551d4_invokedynamic3174_5(int a0, long a1) throws E;

private static native <E extends Throwable> void __sourceIntrinsic_2dd0c74d84c0_call3170_11(moom.cz a0, net.minecraft.world.World a1, net.minecraft.entity.player.EntityPlayer a2, moom.DT a3, net.minecraft.block.state.IBlockState a4, net.minecraft.tileentity.TileEntity a5) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_cdd8da66b4ba_invokedynamic3167_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0611ab0e6a18_invokedynamic3163_10(int a0, long a1) throws E;
}
