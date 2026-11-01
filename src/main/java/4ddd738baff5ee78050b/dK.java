package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class dK extends net.minecraft.block.Block {

public static final moom.fw<net.minecraft.block.BlockLever$EnumOrientation> Q;

public static final moom.fv R;

private static final long S;

private static final long[] T;

private static final java.lang.Integer[] U;

private static final java.util.Map V;

protected dK() {
super(moom.fn.q);
    (this).a__Void((((this.M).a__fE()).a__fE(moom.dK.Q, net.minecraft.block.BlockLever$EnumOrientation.NORTH)).a__fE(moom.dK.R, java.lang.Boolean.FALSE));
    (this).a(net.minecraft.creativetab.CreativeTabs.d);
}


static {
S = ((long)(((moom._a)(moom._c.a(((long)(6677108984657947446L)), ((long)(6536954204741494668L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(112658636336777L)))));
    V = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.dK.S ^ 116739856739512L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1153_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1153_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1153_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1153_14 = new byte[8];
    (__sourceSpill1153_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1153_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1153_16 = __sourceSpill1153_14;
    ((javax.crypto.Cipher)(__sourceSpill1153_11)).init(((int)(__sourceSpill1153_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1153_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1153_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[5];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "uªÞèHÿB\rc#îÓr.\007¸¿Áüð×$Ã"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1153_25 = local6_life21;
        int __sourceSpill1153_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1153_25)).substring(((int)(__sourceSpill1153_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1153_30 = local8_life19;
        int __sourceSpill1153_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1153_33 = new byte[8];
        (__sourceSpill1153_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1153_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1153_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1153_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1153_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1153_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1153_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1153_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1153_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1153_34)).doFinal(((byte[])(__sourceSpill1153_33)));
        (__sourceSpill1153_30)[__sourceSpill1153_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "TÜ4ûøûy«KÏe\035ð\000"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1153_38 = local6_life21;
        int __sourceSpill1153_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1153_38)).substring(((int)(__sourceSpill1153_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1153_43 = local8_life19;
        int __sourceSpill1153_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1153_46 = new byte[8];
        (__sourceSpill1153_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1153_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1153_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1153_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1153_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1153_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1153_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1153_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1153_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1153_47)).doFinal(((byte[])(__sourceSpill1153_46)));
        (__sourceSpill1153_43)[__sourceSpill1153_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    T = ((long[])(local8_life19));
    U = ((java.lang.Integer[])(new java.lang.Integer[5]));
    Q = ((moom.fw)(moom.fw.a(((java.lang.String)("facing")), ((java.lang.Class)(net.minecraft.block.BlockLever$EnumOrientation.class)))));
    R = ((moom.fv)(moom.fv.a(((java.lang.String)("powered")))));
}


public net.minecraft.block.state.IBlockState b__fE(int p0) {
net.minecraft.block.state.IBlockState forwardValue3260_30_0;
    moom.fv forwardValue3260_30_1;
    int forwardValue3260_30_2;
    net.minecraft.block.state.IBlockState forwardValue3260_31_0;
    moom.fv forwardValue3260_31_1;
    net.minecraft.block.state.IBlockState forwardValue3260_32_0;
    moom.fv forwardValue3260_32_1;
    int forwardValue3260_32_2;
    net.minecraft.block.state.IBlockState spill3260_0;
    moom.fv spill3260_1;
    int spill3260_2;
    long life2_3;
    int[] life4_5;
    forward_join_32: {
    forward_join_31: {
    forward_join_30: {
    life2_3 = (moom.dK.S ^ 12693901298746L);
    life4_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3260_0 = ((net.minecraft.block.state.IBlockState)(((moom.dK)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.dK.Q)), ((java.lang.Comparable)(net.minecraft.block.BlockLever$EnumOrientation.a(((int)((p0 & __sourceIntrinsic_819466f05fee_invokedynamic3260_4(25267, (6704111202126630820L ^ life2_3)))))))));
    spill3260_1 = moom.dK.R;
    spill3260_2 = (p0 & __sourceIntrinsic_819466f05fee_invokedynamic3260_8(26412, (869080850964482616L ^ life2_3)));
    if (!((life4_5 != null))) {
        forwardValue3260_30_0 = spill3260_0;
        forwardValue3260_30_1 = spill3260_1;
        forwardValue3260_30_2 = spill3260_2;
        break forward_join_30;
    }
    if (!((spill3260_2 > 0))) {
        forwardValue3260_31_0 = spill3260_0;
        forwardValue3260_31_1 = spill3260_1;
        break forward_join_31;
    }
    forwardValue3260_30_0 = spill3260_0;
    forwardValue3260_30_1 = spill3260_1;
    forwardValue3260_30_2 = 1;
    }
    forwardValue3260_32_0 = forwardValue3260_30_0;
    forwardValue3260_32_1 = forwardValue3260_30_1;
    forwardValue3260_32_2 = forwardValue3260_30_2;
    break forward_join_32;
    }
    forwardValue3260_32_0 = forwardValue3260_31_0;
    forwardValue3260_32_1 = forwardValue3260_31_1;
    forwardValue3260_32_2 = 0;
    }
    return ((net.minecraft.block.state.IBlockState)(forwardValue3260_32_0)).a__fE(((net.minecraft.block.properties.IProperty)(forwardValue3260_32_1)), ((java.lang.Comparable)(java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue3260_32_2)))))));
}


public int b(net.minecraft.world.IBlockAccess p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, moom.bs p3) {
java.lang.Comparable forwardValue3258_19_0;
    int forwardValue3258_30_0;
    java.lang.Boolean spill3258_0;
    long life5_3;
    int[] life7_5;
    forward_join_30: {
    forward_join_29: {
    forward_join_19: {
    forward_join_16: {
    life5_3 = (moom.dK.S ^ 81312437532759L);
    life7_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3258_0 = ((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.dK.R)))));
    if (!((life7_5 != null))) {
        forwardValue3258_19_0 = spill3258_0;
        break forward_join_19;
    }
    if (!((!((java.lang.Boolean)(spill3258_0)).booleanValue()))) {
        break forward_join_16;
    }
    forwardValue3258_30_0 = 0;
    break forward_join_30;
    }
    forwardValue3258_19_0 = ((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.dK.Q)));
    }
    if (!((((net.minecraft.block.BlockLever$EnumOrientation)(((net.minecraft.block.BlockLever$EnumOrientation)(forwardValue3258_19_0)))).a__bs() == p3))) {
        break forward_join_29;
    }
    forwardValue3258_30_0 = __sourceIntrinsic_b0b3991ff8d9_invokedynamic3258_10(4795, (427211525405494215L ^ life5_3));
    break forward_join_30;
    }
    forwardValue3258_30_0 = 0;
    }
    return forwardValue3258_30_0;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7297_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/dK"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public int b(net.minecraft.block.state.IBlockState p0) {
int forwardValue3257_33_0;
    int[] spill3257_0;
    boolean spill3257_1;
    long life2_3;
    int life5_5;
    int life5_14;
    int[] life4_15;
    forward_join_33: {
    forward_join_32: {
    life2_3 = (moom.dK.S ^ 7969952642864L);
    life5_5 = 0;
    spill3257_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life5_14 = (life5_5 | ((net.minecraft.block.BlockLever$EnumOrientation)(((net.minecraft.block.BlockLever$EnumOrientation)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.dK.Q))))))).a());
    life4_15 = spill3257_0;
    spill3257_1 = ((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.dK.R))))))).booleanValue();
    if (!((life4_15 != null))) {
        forwardValue3257_33_0 = ((spill3257_1) ? 1 : 0);
        break forward_join_33;
    }
    if (!(spill3257_1)) {
        break forward_join_32;
    }
    life5_14 = (life5_14 | __sourceIntrinsic_8db5871551d4_invokedynamic3257_11(8444, (5751614774687610595L ^ life2_3)));
    }
    forwardValue3257_33_0 = life5_14;
    }
    return forwardValue3257_33_0;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 1753;
      if (U[var3] == null) {
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
         long var5 = T[var3];
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
            throw new RuntimeException("moom/dK", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         U[var3] = var15;
      }

      return U[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.dK.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public boolean b__Boolean(net.minecraft.world.World p0, moom.DT p1) {
int lexicalValue1107_35_0;
    int[] spill1107_0;
    boolean spill1107_1;
    long life3_3;
    moom.bs[] life6_5;
    int life7_9;
    int life8_11;
    int[] life5_12;
    moom.bs life9_19;
    lexical_join_35: {
    lexical_join_34: {
    life3_3 = (moom.dK.S ^ 7043589526808L);
    life6_5 = moom.bs.values();
    spill1107_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life7_9 = (life6_5).length;
    life8_11 = 0;
    life5_12 = spill1107_0;
    lexical_cycle_13: while (true) {
    lexical_join_32: {
    lexical_join_31: {
    if (!((life8_11 < life7_9))) {
        break lexical_join_34;
    }
    life9_19 = (life6_5)[life8_11];
    if (!((life5_12 != null))) {
        break lexical_join_32;
    }
    spill1107_1 = moom.dK.b(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((moom.bs)(life9_19)));
    if (!((life5_12 != null))) {
        lexicalValue1107_35_0 = ((spill1107_1) ? 1 : 0);
        break lexical_join_35;
    }
    if (!(spill1107_1)) {
        break lexical_join_31;
    }
    return ((1) != 0);
    }
    life8_11 += 1;
    }
    if (!((life5_12 == null))) { continue lexical_cycle_13; }
    break lexical_cycle_13;
    }
    }
    lexicalValue1107_35_0 = 0;
    }
    return ((lexicalValue1107_35_0) != 0);
}


protected static boolean b(net.minecraft.world.World p0, moom.DT p1, moom.bs p2) {
return (__sourceIntrinsic_booleanComparison((moom.cJ.b(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((moom.bs)(p2))))) != 0);
}


public void c(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
long life4_3;
    int[] life6_5;
    moom.bs life7_26;
    life4_3 = (moom.dK.S ^ 85150068324494L);
    life6_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    if ((life6_5 != null)) {
        if (((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.dK.R))))))).booleanValue()) {
        ((net.minecraft.world.World)(p0)).b(((moom.DT)(p1)), ((net.minecraft.block.Block)(this)));
        life7_26 = ((net.minecraft.block.BlockLever$EnumOrientation)(((net.minecraft.block.BlockLever$EnumOrientation)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.dK.Q))))))).a__bs();
        ((net.minecraft.world.World)(p0)).b(((moom.DT)(((moom.DT)(p1)).a(((moom.bs)(((moom.bs)(life7_26)).a__bs()))))), ((net.minecraft.block.Block)(this)));
    }
        super.c(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)));
    }
    return;
}


public boolean l() {
return ((1) != 0);
}


protected moom.fA a__fA() {
return new moom.fA(this, new net.minecraft.block.properties.IProperty[] {moom.dK.Q, moom.dK.R});
}


public boolean a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.entity.player.EntityPlayer p3, moom.bs p4, float p5, float p6, float p7) {
net.minecraft.world.World forwardValue3254_47_0;
    double forwardValue3254_47_1;
    double forwardValue3254_47_2;
    double forwardValue3254_47_3;
    java.lang.String forwardValue3254_47_4;
    float forwardValue3254_47_5;
    net.minecraft.world.World forwardValue3254_48_0;
    double forwardValue3254_48_1;
    double forwardValue3254_48_2;
    double forwardValue3254_48_3;
    java.lang.String forwardValue3254_48_4;
    float forwardValue3254_48_5;
    float forwardValue3254_48_6;
    int forwardValue3254_67_0;
    boolean spill3254_0;
    net.minecraft.world.World spill3254_1;
    double spill3254_2;
    double spill3254_3;
    double spill3254_4;
    java.lang.String spill3254_5;
    float spill3254_6;
    long life9_3;
    int[] life11_5;
    net.minecraft.block.state.IBlockState life3_17;
    moom.bs life12_63;
    forward_join_67: {
    forward_join_66: {
    forward_join_48: {
    forward_join_47: {
    life9_3 = (moom.dK.S ^ 76631479195514L);
    life11_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3254_0 = ((net.minecraft.world.World)(p0)).G;
    if (!((life11_5 != null))) {
        forwardValue3254_67_0 = ((spill3254_0) ? 1 : 0);
        break forward_join_67;
    }
    if (!((!spill3254_0))) {
        break forward_join_66;
    }
    life3_17 = ((net.minecraft.block.state.IBlockState)(p2)).a__fE(((net.minecraft.block.properties.IProperty)(moom.dK.R)));
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(life3_17)), ((int)(3)));
    spill3254_1 = p0;
    spill3254_2 = (((double) ((moom.DT)(p1)).a()) + 0x1.0p-1d);
    spill3254_3 = (((double) ((moom.DT)(p1)).b()) + 0x1.0p-1d);
    spill3254_4 = (((double) ((moom.DT)(p1)).c()) + 0x1.0p-1d);
    spill3254_5 = "random.click";
    spill3254_6 = 0x1.333334p-2f;
    if (!(((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(life3_17)).a(((net.minecraft.block.properties.IProperty)(moom.dK.R))))))).booleanValue())) {
        forwardValue3254_47_0 = spill3254_1;
        forwardValue3254_47_1 = spill3254_2;
        forwardValue3254_47_2 = spill3254_3;
        forwardValue3254_47_3 = spill3254_4;
        forwardValue3254_47_4 = spill3254_5;
        forwardValue3254_47_5 = spill3254_6;
        break forward_join_47;
    }
    forwardValue3254_48_0 = spill3254_1;
    forwardValue3254_48_1 = spill3254_2;
    forwardValue3254_48_2 = spill3254_3;
    forwardValue3254_48_3 = spill3254_4;
    forwardValue3254_48_4 = spill3254_5;
    forwardValue3254_48_5 = spill3254_6;
    forwardValue3254_48_6 = 0x1.333334p-1f;
    break forward_join_48;
    }
    forwardValue3254_48_0 = forwardValue3254_47_0;
    forwardValue3254_48_1 = forwardValue3254_47_1;
    forwardValue3254_48_2 = forwardValue3254_47_2;
    forwardValue3254_48_3 = forwardValue3254_47_3;
    forwardValue3254_48_4 = forwardValue3254_47_4;
    forwardValue3254_48_5 = forwardValue3254_47_5;
    forwardValue3254_48_6 = 0x1.0p-1f;
    }
    ((net.minecraft.world.World)(forwardValue3254_48_0)).a(((double)(forwardValue3254_48_1)), ((double)(forwardValue3254_48_2)), ((double)(forwardValue3254_48_3)), ((java.lang.String)(forwardValue3254_48_4)), ((float)(forwardValue3254_48_5)), ((float)(forwardValue3254_48_6)));
    ((net.minecraft.world.World)(p0)).b(((moom.DT)(p1)), ((net.minecraft.block.Block)(this)));
    life12_63 = ((net.minecraft.block.BlockLever$EnumOrientation)(((net.minecraft.block.BlockLever$EnumOrientation)(((net.minecraft.block.state.IBlockState)(life3_17)).a(((net.minecraft.block.properties.IProperty)(moom.dK.Q))))))).a__bs();
    ((net.minecraft.world.World)(p0)).b(((moom.DT)(((moom.DT)(p1)).a(((moom.bs)(((moom.bs)(life12_63)).a__bs()))))), ((net.minecraft.block.Block)(this)));
    }
    forwardValue3254_67_0 = 1;
    }
    return ((forwardValue3254_67_0) != 0);
}


public boolean a__Boolean(net.minecraft.world.World p0, moom.DT p1, moom.bs p2) {
return (__sourceIntrinsic_booleanComparison((moom.dK.b(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((moom.bs)(((moom.bs)(p2)).a__bs()))))) != 0);
}


public moom.CA a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
return null;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.block.Block p3) {
int forwardValue3253_23_0;
    int forwardValue3253_35_0;
    boolean spill3253_0;
    long life5_3;
    int[] life7_5;
    forward_join_36: {
    forward_join_35: {
    forward_join_23: {
    life5_3 = (moom.dK.S ^ 52838573527660L);
    life7_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3253_0 = ((moom.dK)(this)).a__Boolean(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)));
    if (!((life7_5 != null))) {
        forwardValue3253_23_0 = ((spill3253_0) ? 1 : 0);
        break forward_join_23;
    }
    if (!(spill3253_0)) {
        break forward_join_36;
    }
    forwardValue3253_23_0 = ((moom.dK.b(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((moom.bs)(((moom.bs)(((net.minecraft.block.BlockLever$EnumOrientation)(((net.minecraft.block.BlockLever$EnumOrientation)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.dK.Q))))))).a__bs())).a__bs())))) ? 1 : 0);
    }
    if (!((life7_5 != null))) {
        forwardValue3253_35_0 = forwardValue3253_23_0;
        break forward_join_35;
    }
    if (!((forwardValue3253_23_0 == 0))) {
        break forward_join_36;
    }
    ((moom.dK)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((int)(0)));
    forwardValue3253_35_0 = ((((net.minecraft.world.World)(p0)).d__Boolean(((moom.DT)(p1)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue3253_35_0);
    }
    return;
}


private boolean a__Boolean(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
int forwardValue3255_26_0;
    boolean spill3255_0;
    long life4_3;
    int[] life6_5;
    forward_join_26: {
    forward_join_15: {
    life4_3 = (moom.dK.S ^ 75352570019365L);
    life6_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3255_0 = ((moom.dK)(this)).b__Boolean(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)));
    if (!((life6_5 != null))) {
        forwardValue3255_26_0 = ((spill3255_0) ? 1 : 0);
        break forward_join_26;
    }
    if (!(spill3255_0)) {
        break forward_join_15;
    }
    return ((1) != 0);
    }
    ((moom.dK)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((int)(0)));
    ((net.minecraft.world.World)(p0)).d__Boolean(((moom.DT)(p1)));
    forwardValue3255_26_0 = 0;
    }
    return ((forwardValue3255_26_0) != 0);
}


public void a__Void(net.minecraft.world.IBlockAccess p0, moom.DT p1) {
int[] spill327_0;
    long life3_3;
    float life6_6;
    int[] life5_7;
    float life6_103;
    float life6_123;
    forward_join_126: {
    forward_join_108: {
    forward_join_88: {
    forward_join_70: {
    forward_join_54: {
    forward_join_36: {
    forward_join_34: {
    forward_join_20: {
    life3_3 = (moom.dK.S ^ 3434058237109L);
    spill327_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life6_6 = 0x1.8p-3f;
    life5_7 = spill327_0;
    if (!((life5_7 != null))) {
        break forward_join_34;
    }
    switch ((moom.eY.b)[((net.minecraft.block.BlockLever$EnumOrientation)(((net.minecraft.block.BlockLever$EnumOrientation)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(p1))))).a(((net.minecraft.block.properties.IProperty)(moom.dK.Q))))))).ordinal()]) {
case 1:
{
        break forward_join_20;
    }
case 2:
{
        break forward_join_36;
    }
case 3:
{
        break forward_join_54;
    }
case 4:
{
        break forward_join_70;
    }
case 5:
case 6:
{
        break forward_join_88;
    }
case 7:
case 8:
{
        break forward_join_108;
    }
default:
{
        break forward_join_126;
    }
}
    }
    ((moom.dK)(this)).a(((float)(0x0.0p0f)), ((float)(0x1.99999ap-3f)), ((float)((0x1.0p-1f - life6_6))), ((float)((life6_6 * 0x1.0p1f))), ((float)(0x1.99999ap-1f)), ((float)((0x1.0p-1f + life6_6))));
    }
    if (!((life5_7 == null))) {
        break forward_join_126;
    }
    }
    ((moom.dK)(this)).a(((float)((0x1.0p0f - (life6_6 * 0x1.0p1f)))), ((float)(0x1.99999ap-3f)), ((float)((0x1.0p-1f - life6_6))), ((float)(0x1.0p0f)), ((float)(0x1.99999ap-1f)), ((float)((0x1.0p-1f + life6_6))));
    if (!((life5_7 == null))) {
        break forward_join_126;
    }
    }
    ((moom.dK)(this)).a(((float)((0x1.0p-1f - life6_6))), ((float)(0x1.99999ap-3f)), ((float)(0x0.0p0f)), ((float)((0x1.0p-1f + life6_6))), ((float)(0x1.99999ap-1f)), ((float)((life6_6 * 0x1.0p1f))));
    if (!((life5_7 == null))) {
        break forward_join_126;
    }
    }
    ((moom.dK)(this)).a(((float)((0x1.0p-1f - life6_6))), ((float)(0x1.99999ap-3f)), ((float)((0x1.0p0f - (life6_6 * 0x1.0p1f)))), ((float)((0x1.0p-1f + life6_6))), ((float)(0x1.99999ap-1f)), ((float)(0x1.0p0f)));
    if (!((life5_7 == null))) {
        break forward_join_126;
    }
    }
    life6_103 = 0x1.0p-2f;
    ((moom.dK)(this)).a(((float)((0x1.0p-1f - life6_103))), ((float)(0x0.0p0f)), ((float)((0x1.0p-1f - life6_103))), ((float)((0x1.0p-1f + life6_103))), ((float)(0x1.333334p-1f)), ((float)((0x1.0p-1f + life6_103))));
    if (!((life5_7 == null))) {
        break forward_join_126;
    }
    }
    life6_123 = 0x1.0p-2f;
    ((moom.dK)(this)).a(((float)((0x1.0p-1f - life6_123))), ((float)(0x1.99999ap-2f)), ((float)((0x1.0p-1f - life6_123))), ((float)((0x1.0p-1f + life6_123))), ((float)(0x1.0p0f)), ((float)((0x1.0p-1f + life6_123))));
    }
    return;
}


public static int a(moom.bs p0) {
int forwardValue326_26_0;
    int spill326_0;
    long life1_3;
    int[] life3_5;
    forward_join_26: {
    forward_join_25: {
    forward_join_23: {
    forward_join_21: {
    forward_join_19: {
    forward_join_17: {
    forward_join_15: {
    forward_join_13: {
    life1_3 = (moom.dK.S ^ 101670545000698L);
    life3_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill326_0 = (moom.eY.a)[((moom.bs)(p0)).ordinal()];
    if (!((life3_5 != null))) {
        forwardValue326_26_0 = spill326_0;
        break forward_join_26;
    }
    switch (spill326_0) {
case 1:
{
        break forward_join_13;
    }
case 2:
{
        break forward_join_15;
    }
case 3:
{
        break forward_join_17;
    }
case 4:
{
        break forward_join_19;
    }
case 5:
{
        break forward_join_21;
    }
case 6:
{
        break forward_join_23;
    }
default:
{
        break forward_join_25;
    }
}
    }
    return 0;
    }
    return 5;
    }
    return 4;
    }
    return 3;
    }
    return 2;
    }
    return 1;
    }
    forwardValue326_26_0 = -1;
    }
    return forwardValue326_26_0;
}


public net.minecraft.block.state.IBlockState a(net.minecraft.world.World p0, moom.DT p1, moom.bs p2, float p3, float p4, float p5, int p6, net.minecraft.entity.EntityLivingBase p7) {
int[] spill1106_0;
    long life9_3;
    net.minecraft.block.state.IBlockState life12_10;
    int[] life11_11;
    java.util.Iterator life13_30;
    moom.bs life14_37;
    lexical_join_70: {
    lexical_join_57: {
    lexical_join_26: {
    life9_3 = (moom.dK.S ^ 48104476291751L);
    spill1106_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life12_10 = ((net.minecraft.block.state.IBlockState)(((moom.dK)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.dK.R)), ((java.lang.Comparable)(java.lang.Boolean.FALSE)));
    life11_11 = spill1106_0;
    if (!(moom.dK.b(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((moom.bs)(((moom.bs)(p2)).a__bs()))))) {
        break lexical_join_26;
    }
    return ((net.minecraft.block.state.IBlockState)(life12_10)).a__fE(((net.minecraft.block.properties.IProperty)(moom.dK.Q)), ((java.lang.Comparable)(net.minecraft.block.BlockLever$EnumOrientation.a(((moom.bs)(p2)), ((moom.bs)(((net.minecraft.entity.EntityLivingBase)(p7)).b__bs()))))));
    }
    life13_30 = ((net.minecraft.util.EnumFacing$Plane)(net.minecraft.util.EnumFacing$Plane.HORIZONTAL)).iterator();
    lexical_cycle_29: while (true) {
    lexical_join_55: {
    if (!(((java.util.Iterator)(life13_30)).hasNext())) {
        break lexical_join_57;
    }
    life14_37 = ((moom.bs)(((java.util.Iterator)(life13_30)).next()));
    if (!((life11_11 != null))) {
        break lexical_join_70;
    }
    if (!((life14_37 != p2))) {
        break lexical_join_55;
    }
    if (!(moom.dK.b(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((moom.bs)(((moom.bs)(life14_37)).a__bs()))))) {
        break lexical_join_55;
    }
    return ((net.minecraft.block.state.IBlockState)(life12_10)).a__fE(((net.minecraft.block.properties.IProperty)(moom.dK.Q)), ((java.lang.Comparable)(net.minecraft.block.BlockLever$EnumOrientation.a(((moom.bs)(life14_37)), ((moom.bs)(((net.minecraft.entity.EntityLivingBase)(p7)).b__bs()))))));
    }
    if (!((life11_11 == null))) { continue lexical_cycle_29; }
    break lexical_cycle_29;
    }
    }
    if (!(net.minecraft.world.World.a(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(((moom.DT)(p1)).b__DT()))))) {
        break lexical_join_70;
    }
    return ((net.minecraft.block.state.IBlockState)(life12_10)).a__fE(((net.minecraft.block.properties.IProperty)(moom.dK.Q)), ((java.lang.Comparable)(net.minecraft.block.BlockLever$EnumOrientation.a(((moom.bs)(moom.bs.UP)), ((moom.bs)(((net.minecraft.entity.EntityLivingBase)(p7)).b__bs()))))));
    }
    return life12_10;
}


public int a(net.minecraft.world.IBlockAccess p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, moom.bs p3) {
int forwardValue3251_19_0;
    int forwardValue3251_21_0;
    boolean spill3251_0;
    long life5_3;
    int[] life7_5;
    forward_join_21: {
    forward_join_20: {
    forward_join_19: {
    life5_3 = (moom.dK.S ^ 101790834426978L);
    life7_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3251_0 = ((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.dK.R))))))).booleanValue();
    if (!((life7_5 != null))) {
        forwardValue3251_19_0 = ((spill3251_0) ? 1 : 0);
        break forward_join_19;
    }
    if (!(spill3251_0)) {
        break forward_join_20;
    }
    forwardValue3251_19_0 = __sourceIntrinsic_0beb55581d70_invokedynamic3251_7(18138, (1397802713525019540L ^ life5_3));
    }
    forwardValue3251_21_0 = forwardValue3251_19_0;
    break forward_join_21;
    }
    forwardValue3251_21_0 = 0;
    }
    return forwardValue3251_21_0;
}


public boolean g() {
return ((0) != 0);
}


public boolean j() {
return ((0) != 0);
}


private static native <E extends Throwable> int __sourceIntrinsic_0beb55581d70_invokedynamic3251_7(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7297_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8db5871551d4_invokedynamic3257_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b0b3991ff8d9_invokedynamic3258_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_819466f05fee_invokedynamic3260_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_819466f05fee_invokedynamic3260_8(int a0, long a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
