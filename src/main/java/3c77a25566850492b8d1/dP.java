package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class dP extends net.minecraft.block.Block {

public static final moom.fv Q;

private static final long R;

private static final long[] S;

private static final java.lang.Integer[] T;

private static final java.util.Map U;

protected dP() {
super(moom.fn.b, moom.fm.z);
    (this).a__Void(((this.M).a__fE()).a__fE(moom.dP.Q, java.lang.Boolean.FALSE));
    (this).a(true);
    (this).a(net.minecraft.creativetab.CreativeTabs.b);
}


static {
R = ((long)(((moom._a)(moom._c.a(((long)(-922979768839983078L)), ((long)(43722195953078453L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(270912122181620L)))));
    U = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.dP.R ^ 124484244862679L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill808_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill808_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill808_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill808_14 = new byte[8];
    (__sourceSpill808_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill808_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation808_16 = __sourceSpill808_14;
    ((javax.crypto.Cipher)(__sourceSpill808_11)).init(((int)(__sourceSpill808_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill808_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation808_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "Ùá¨T\004J\026ék òà\030é\037"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill808_25 = local6_life21;
        int __sourceSpill808_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill808_25)).substring(((int)(__sourceSpill808_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill808_30 = local8_life19;
        int __sourceSpill808_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill808_33 = new byte[8];
        (__sourceSpill808_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill808_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill808_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill808_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill808_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill808_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill808_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill808_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill808_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill808_34)).doFinal(((byte[])(__sourceSpill808_33)));
        (__sourceSpill808_30)[__sourceSpill808_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    S = ((long[])(local8_life19));
    T = ((java.lang.Integer[])(new java.lang.Integer[2]));
    Q = ((moom.fv)(moom.fv.a(((java.lang.String)("snowy")))));
}


public int b(net.minecraft.block.state.IBlockState p0) {
return 0;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7319_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/dP"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.dP.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 27810;
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
         Object[] var9 = (Object[])U.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               U.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/dP", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         T[var3] = var15;
      }

      return T[var3];
}


public void b(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, java.util.Random p3) {
int lexicalValue1113_15_0;
    int lexicalValue1113_51_0;
    int lexicalValue1113_51_1;
    int lexicalValue1113_53_0;
    int lexicalValue1113_109_0;
    int lexicalValue1113_109_1;
    int lexicalValue1113_115_0;
    boolean spill1113_0;
    int spill1113_1;
    int spill1113_2;
    int spill1113_3;
    int spill1113_4;
    int spill1113_5;
    int spill1113_6;
    int spill1113_7;
    long life5_3;
    int[] life7_5;
    int life8_77;
    moom.DT life9_98;
    net.minecraft.block.state.IBlockState life10_102;
    net.minecraft.block.Block life11_108;
    lexical_join_119: {
    lexical_join_53: {
    lexical_join_51: {
    lexical_join_40: {
    lexical_join_15: {
    life5_3 = (moom.dP.R ^ 67365128061188L);
    life7_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill1113_0 = ((net.minecraft.world.World)(p0)).G;
    if (!((life7_5 != null))) {
        lexicalValue1113_15_0 = ((spill1113_0) ? 1 : 0);
        break lexical_join_15;
    }
    if (!((!spill1113_0))) {
        break lexical_join_119;
    }
    lexicalValue1113_15_0 = ((net.minecraft.world.World)(p0)).b(((moom.DT)(((moom.DT)(p1)).a__DT())));
    }
    spill1113_1 = 4;
    if (!((life7_5 != null))) {
        lexicalValue1113_51_0 = lexicalValue1113_15_0;
        lexicalValue1113_51_1 = spill1113_1;
        break lexical_join_51;
    }
    if (!((lexicalValue1113_15_0 < spill1113_1))) {
        break lexical_join_40;
    }
    spill1113_2 = ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).a__DT()))))).a__ch())).a__Int();
    spill1113_3 = 2;
    if (!((life7_5 != null))) {
        lexicalValue1113_51_0 = spill1113_2;
        lexicalValue1113_51_1 = spill1113_3;
        break lexical_join_51;
    }
    if (!((spill1113_2 > spill1113_3))) {
        break lexical_join_40;
    }
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.d)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.dq.Q)), ((java.lang.Comparable)(net.minecraft.block.BlockDirt$DirtType.DIRT))))));
    if (!((life7_5 == null))) {
        break lexical_join_119;
    }
    }
    spill1113_4 = ((net.minecraft.world.World)(p0)).b(((moom.DT)(((moom.DT)(p1)).a__DT())));
    if (!((life7_5 != null))) {
        lexicalValue1113_53_0 = spill1113_4;
        break lexical_join_53;
    }
    lexicalValue1113_51_0 = spill1113_4;
    lexicalValue1113_51_1 = __sourceIntrinsic_b4b54c999db9_invokedynamic1113_18(2410, (6984744483444321490L ^ life5_3));
    }
    if (!((lexicalValue1113_51_0 >= lexicalValue1113_51_1))) {
        break lexical_join_119;
    }
    lexicalValue1113_53_0 = 0;
    }
    life8_77 = lexicalValue1113_53_0;
    lexical_cycle_54: while (true) {
    lexical_join_117: {
    lexical_join_116: {
    lexical_join_115: {
    lexical_join_109: {
    if (!((life8_77 < 4))) {
        break lexical_join_119;
    }
    life9_98 = ((moom.DT)(p1)).a(((int)((((java.util.Random)(p3)).nextInt(((int)(3))) - 1))), ((int)((((java.util.Random)(p3)).nextInt(((int)(5))) - 3))), ((int)((((java.util.Random)(p3)).nextInt(((int)(3))) - 1))));
    life10_102 = ((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life9_98)));
    life11_108 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(life9_98)).a__DT()))))).a__ch();
    if (!((life7_5 != null))) {
        break lexical_join_117;
    }
    if (!((((net.minecraft.block.state.IBlockState)(life10_102)).a__ch() == net.minecraft.init.Blocks.d))) {
        break lexical_join_116;
    }
    if (!((((net.minecraft.block.state.IBlockState)(life10_102)).a(((net.minecraft.block.properties.IProperty)(moom.dq.Q))) == net.minecraft.block.BlockDirt$DirtType.DIRT))) {
        break lexical_join_116;
    }
    spill1113_5 = ((net.minecraft.world.World)(p0)).b(((moom.DT)(((moom.DT)(life9_98)).a__DT())));
    spill1113_6 = 4;
    if (!((life7_5 != null))) {
        lexicalValue1113_109_0 = spill1113_5;
        lexicalValue1113_109_1 = spill1113_6;
        break lexical_join_109;
    }
    if (!((spill1113_5 >= spill1113_6))) {
        break lexical_join_116;
    }
    spill1113_7 = ((net.minecraft.block.Block)(life11_108)).a__Int();
    if (!((life7_5 != null))) {
        lexicalValue1113_115_0 = spill1113_7;
        break lexical_join_115;
    }
    lexicalValue1113_109_0 = spill1113_7;
    lexicalValue1113_109_1 = 2;
    }
    if (!((lexicalValue1113_109_0 <= lexicalValue1113_109_1))) {
        break lexical_join_116;
    }
    lexicalValue1113_115_0 = ((((net.minecraft.world.World)(p0)).a(((moom.DT)(life9_98)), ((net.minecraft.block.state.IBlockState)(((moom.dP)(this)).a__fE())))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(lexicalValue1113_115_0);
    }
    life8_77 += 1;
    }
    if (!((life7_5 == null))) { continue lexical_cycle_54; }
    break lexical_cycle_54;
    }
    }
    return;
}


public void c(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, java.util.Random p3) {
long local5 = (moom.dP.R ^ 127683050911588L);
    super.c(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((java.util.Random)(p3)));
    if ((((java.util.Random)(p3)).nextInt(((int)(__sourceIntrinsic_79fa39d0e3aa_invokedynamic7321_2(16143, (1087756996541852886L ^ local5))))) == 0)) {
        ((net.minecraft.world.World)(p0)).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.TOWN_AURA)), ((double)(((double) (((float) ((moom.DT)(p1)).a()) + ((java.util.Random)(p3)).nextFloat())))), ((double)(((double) (((float) ((moom.DT)(p1)).b()) + 0x1.19999ap0f)))), ((double)(((double) (((float) ((moom.DT)(p1)).c()) + ((java.util.Random)(p3)).nextFloat())))), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((int[])(new int[0])));
    }
    return;
}


public net.minecraft.block.state.IBlockState a(net.minecraft.block.state.IBlockState p0, net.minecraft.world.IBlockAccess p1, moom.DT p2) {
net.minecraft.block.state.IBlockState forwardValue3271_21_0;
    moom.fv forwardValue3271_21_1;
    net.minecraft.block.Block forwardValue3271_21_2;
    net.minecraft.block.Block forwardValue3271_21_3;
    net.minecraft.block.state.IBlockState forwardValue3271_22_0;
    moom.fv forwardValue3271_22_1;
    net.minecraft.block.state.IBlockState forwardValue3271_24_0;
    moom.fv forwardValue3271_24_1;
    net.minecraft.block.state.IBlockState forwardValue3271_25_0;
    moom.fv forwardValue3271_25_1;
    int forwardValue3271_25_2;
    int[] spill3271_0;
    net.minecraft.block.state.IBlockState spill3271_1;
    moom.fv spill3271_2;
    net.minecraft.block.Block spill3271_3;
    net.minecraft.block.Block spill3271_4;
    long life4_3;
    net.minecraft.block.Block life7_10;
    int[] life6_11;
    forward_join_25: {
    forward_join_24: {
    forward_join_22: {
    forward_join_21: {
    life4_3 = (moom.dP.R ^ 82761613973839L);
    spill3271_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life7_10 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.IBlockAccess)(p1)).a__fE(((moom.DT)(((moom.DT)(p2)).a__DT()))))).a__ch();
    life6_11 = spill3271_0;
    spill3271_1 = p0;
    spill3271_2 = moom.dP.Q;
    spill3271_3 = life7_10;
    spill3271_4 = net.minecraft.init.Blocks.aJ;
    if (!((life6_11 != null))) {
        forwardValue3271_21_0 = spill3271_1;
        forwardValue3271_21_1 = spill3271_2;
        forwardValue3271_21_2 = spill3271_3;
        forwardValue3271_21_3 = spill3271_4;
        break forward_join_21;
    }
    if (!((spill3271_3 != spill3271_4))) {
        forwardValue3271_22_0 = spill3271_1;
        forwardValue3271_22_1 = spill3271_2;
        break forward_join_22;
    }
    forwardValue3271_21_0 = spill3271_1;
    forwardValue3271_21_1 = spill3271_2;
    forwardValue3271_21_2 = life7_10;
    forwardValue3271_21_3 = net.minecraft.init.Blocks.aH;
    }
    if (!((forwardValue3271_21_2 == forwardValue3271_21_3))) {
        forwardValue3271_24_0 = forwardValue3271_21_0;
        forwardValue3271_24_1 = forwardValue3271_21_1;
        break forward_join_24;
    }
    forwardValue3271_22_0 = forwardValue3271_21_0;
    forwardValue3271_22_1 = forwardValue3271_21_1;
    }
    forwardValue3271_25_0 = forwardValue3271_22_0;
    forwardValue3271_25_1 = forwardValue3271_22_1;
    forwardValue3271_25_2 = 1;
    break forward_join_25;
    }
    forwardValue3271_25_0 = forwardValue3271_24_0;
    forwardValue3271_25_1 = forwardValue3271_24_1;
    forwardValue3271_25_2 = 0;
    }
    return ((net.minecraft.block.state.IBlockState)(forwardValue3271_25_0)).a__fE(((net.minecraft.block.properties.IProperty)(forwardValue3271_25_1)), ((java.lang.Comparable)(java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue3271_25_2)))))));
}


protected moom.fA a__fA() {
return new moom.fA(this, new net.minecraft.block.properties.IProperty[] {moom.dP.Q});
}


public net.minecraft.item.Item a(net.minecraft.block.state.IBlockState p0, java.util.Random p1, int p2) {
return ((net.minecraft.block.Block)(net.minecraft.init.Blocks.d)).a(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.d)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.dq.Q)), ((java.lang.Comparable)(net.minecraft.block.BlockDirt$DirtType.DIRT))))), ((java.util.Random)(p1)), ((int)(p2)));
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7319_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b4b54c999db9_invokedynamic1113_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_79fa39d0e3aa_invokedynamic7321_2(int a0, long a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
