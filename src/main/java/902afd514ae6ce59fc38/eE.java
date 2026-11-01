package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class eE extends net.minecraft.block.Block {

public static final moom.fx Q;

public static final moom.fv R;

public static final moom.fv S;

public static final moom.fv T;

private static final long U;

private static final long[] V;

private static final java.lang.Integer[] W;

private static final java.util.Map X;

public eE() {
super(moom.fn.q);
    (this).a__Void((((((this.M).a__fE()).a__fE(moom.eE.Q, moom.bs.NORTH)).a__fE(moom.eE.R, java.lang.Boolean.FALSE)).a__fE(moom.eE.S, java.lang.Boolean.FALSE)).a__fE(moom.eE.T, java.lang.Boolean.FALSE));
    (this).a(net.minecraft.creativetab.CreativeTabs.d);
    (this).a(true);
}


static {
U = ((long)(((moom._a)(moom._c.a(((long)(8674387470515551998L)), ((long)(7398943592562143964L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(191412023878581L)))));
    X = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.eE.U ^ 53626550527537L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1177_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1177_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1177_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1177_14 = new byte[8];
    (__sourceSpill1177_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1177_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1177_16 = __sourceSpill1177_14;
    ((javax.crypto.Cipher)(__sourceSpill1177_11)).init(((int)(__sourceSpill1177_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1177_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1177_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[6];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "\004\013¦cÅÀ®÷Å\004Ü1,ÚëÙ¶\024±z¡\020>Ë©>Í¯"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1177_25 = local6_life21;
        int __sourceSpill1177_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1177_25)).substring(((int)(__sourceSpill1177_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1177_30 = local8_life19;
        int __sourceSpill1177_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1177_33 = new byte[8];
        (__sourceSpill1177_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1177_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1177_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1177_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1177_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1177_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1177_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1177_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1177_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1177_34)).doFinal(((byte[])(__sourceSpill1177_33)));
        (__sourceSpill1177_30)[__sourceSpill1177_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "¢éZ*|KË\0364\024\t­ÿ\024§õ"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1177_38 = local6_life21;
        int __sourceSpill1177_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1177_38)).substring(((int)(__sourceSpill1177_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1177_43 = local8_life19;
        int __sourceSpill1177_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1177_46 = new byte[8];
        (__sourceSpill1177_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1177_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1177_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1177_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1177_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1177_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1177_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1177_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1177_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1177_47)).doFinal(((byte[])(__sourceSpill1177_46)));
        (__sourceSpill1177_43)[__sourceSpill1177_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    V = ((long[])(local8_life19));
    W = ((java.lang.Integer[])(new java.lang.Integer[6]));
    Q = ((moom.fx)(moom.fx.a(((java.lang.String)("facing")), ((com.google.common.base.Predicate)(net.minecraft.util.EnumFacing$Plane.HORIZONTAL)))));
    R = ((moom.fv)(moom.fv.a(((java.lang.String)("powered")))));
    S = ((moom.fv)(moom.fv.a(((java.lang.String)("attached")))));
    T = ((moom.fv)(moom.fv.a(((java.lang.String)("suspended")))));
}


public net.minecraft.block.state.IBlockState b__fE(int p0) {
net.minecraft.block.state.IBlockState forwardValue3430_26_0;
    moom.fv forwardValue3430_26_1;
    int forwardValue3430_26_2;
    net.minecraft.block.state.IBlockState forwardValue3430_27_0;
    moom.fv forwardValue3430_27_1;
    net.minecraft.block.state.IBlockState forwardValue3430_28_0;
    moom.fv forwardValue3430_28_1;
    int forwardValue3430_28_2;
    net.minecraft.block.state.IBlockState forwardValue3430_38_0;
    moom.fv forwardValue3430_38_1;
    int forwardValue3430_38_2;
    net.minecraft.block.state.IBlockState forwardValue3430_39_0;
    moom.fv forwardValue3430_39_1;
    net.minecraft.block.state.IBlockState forwardValue3430_40_0;
    moom.fv forwardValue3430_40_1;
    int forwardValue3430_40_2;
    net.minecraft.block.state.IBlockState spill3430_0;
    moom.fv spill3430_1;
    int spill3430_2;
    net.minecraft.block.state.IBlockState spill3430_3;
    moom.fv spill3430_4;
    int spill3430_5;
    long life2_3;
    int[] life4_5;
    forward_join_40: {
    forward_join_39: {
    forward_join_38: {
    forward_join_28: {
    forward_join_27: {
    forward_join_26: {
    life2_3 = (moom.eE.U ^ 71327899130788L);
    life4_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3430_0 = ((net.minecraft.block.state.IBlockState)(((moom.eE)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.eE.Q)), ((java.lang.Comparable)(moom.bs.b(((int)((p0 & 3)))))));
    spill3430_1 = moom.eE.R;
    spill3430_2 = (p0 & __sourceIntrinsic_819466f05fee_invokedynamic3430_7(4759, (7949573115786662410L ^ life2_3)));
    if (!((life4_5 != null))) {
        forwardValue3430_26_0 = spill3430_0;
        forwardValue3430_26_1 = spill3430_1;
        forwardValue3430_26_2 = spill3430_2;
        break forward_join_26;
    }
    if (!((spill3430_2 > 0))) {
        forwardValue3430_27_0 = spill3430_0;
        forwardValue3430_27_1 = spill3430_1;
        break forward_join_27;
    }
    forwardValue3430_26_0 = spill3430_0;
    forwardValue3430_26_1 = spill3430_1;
    forwardValue3430_26_2 = 1;
    }
    forwardValue3430_28_0 = forwardValue3430_26_0;
    forwardValue3430_28_1 = forwardValue3430_26_1;
    forwardValue3430_28_2 = forwardValue3430_26_2;
    break forward_join_28;
    }
    forwardValue3430_28_0 = forwardValue3430_27_0;
    forwardValue3430_28_1 = forwardValue3430_27_1;
    forwardValue3430_28_2 = 0;
    }
    spill3430_3 = ((net.minecraft.block.state.IBlockState)(forwardValue3430_28_0)).a__fE(((net.minecraft.block.properties.IProperty)(forwardValue3430_28_1)), ((java.lang.Comparable)(java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue3430_28_2)))))));
    spill3430_4 = moom.eE.S;
    spill3430_5 = (p0 & 4);
    if (!((life4_5 != null))) {
        forwardValue3430_38_0 = spill3430_3;
        forwardValue3430_38_1 = spill3430_4;
        forwardValue3430_38_2 = spill3430_5;
        break forward_join_38;
    }
    if (!((spill3430_5 > 0))) {
        forwardValue3430_39_0 = spill3430_3;
        forwardValue3430_39_1 = spill3430_4;
        break forward_join_39;
    }
    forwardValue3430_38_0 = spill3430_3;
    forwardValue3430_38_1 = spill3430_4;
    forwardValue3430_38_2 = 1;
    }
    forwardValue3430_40_0 = forwardValue3430_38_0;
    forwardValue3430_40_1 = forwardValue3430_38_1;
    forwardValue3430_40_2 = forwardValue3430_38_2;
    break forward_join_40;
    }
    forwardValue3430_40_0 = forwardValue3430_39_0;
    forwardValue3430_40_1 = forwardValue3430_39_1;
    forwardValue3430_40_2 = 0;
    }
    return ((net.minecraft.block.state.IBlockState)(forwardValue3430_40_0)).a__fE(((net.minecraft.block.properties.IProperty)(forwardValue3430_40_1)), ((java.lang.Comparable)(java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue3430_40_2)))))));
}


public int b(net.minecraft.world.IBlockAccess p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, moom.bs p3) {
java.lang.Comparable forwardValue3428_19_0;
    int forwardValue3428_28_0;
    java.lang.Boolean spill3428_0;
    long life5_3;
    int[] life7_5;
    forward_join_28: {
    forward_join_27: {
    forward_join_19: {
    forward_join_16: {
    life5_3 = (moom.eE.U ^ 2889768054729L);
    life7_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3428_0 = ((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.eE.R)))));
    if (!((life7_5 != null))) {
        forwardValue3428_19_0 = spill3428_0;
        break forward_join_19;
    }
    if (!((!((java.lang.Boolean)(spill3428_0)).booleanValue()))) {
        break forward_join_16;
    }
    forwardValue3428_28_0 = 0;
    break forward_join_28;
    }
    forwardValue3428_19_0 = ((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.eE.Q)));
    }
    if (!((forwardValue3428_19_0 == p3))) {
        break forward_join_27;
    }
    forwardValue3428_28_0 = __sourceIntrinsic_b0b3991ff8d9_invokedynamic3428_8(6316, (8954038778675539039L ^ life5_3));
    break forward_join_28;
    }
    forwardValue3428_28_0 = 0;
    }
    return forwardValue3428_28_0;
}


public void b(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, java.util.Random p3) {
((moom.eE)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((boolean)(false)), ((boolean)(true)), ((int)(-1)), ((net.minecraft.block.state.IBlockState)(null)));
    return;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7493_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/eE"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public int b(net.minecraft.block.state.IBlockState p0) {
int forwardValue3427_37_0;
    int forwardValue3427_45_0;
    int[] spill3427_0;
    boolean spill3427_1;
    long life2_3;
    int life5_6;
    int life5_14;
    int[] life4_15;
    forward_join_45: {
    forward_join_44: {
    forward_join_37: {
    forward_join_32: {
    life2_3 = (moom.eE.U ^ 84024380842158L);
    spill3427_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life5_6 = 0;
    life5_14 = (life5_6 | ((moom.bs)(((moom.bs)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.eE.Q))))))).b());
    life4_15 = spill3427_0;
    spill3427_1 = ((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.eE.R))))))).booleanValue();
    if (!((life4_15 != null))) {
        forwardValue3427_37_0 = ((spill3427_1) ? 1 : 0);
        break forward_join_37;
    }
    if (!(spill3427_1)) {
        break forward_join_32;
    }
    life5_14 = (life5_14 | __sourceIntrinsic_8db5871551d4_invokedynamic3427_11(5639, (7815096167032876438L ^ life2_3)));
    }
    forwardValue3427_37_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.eE.S))))))).booleanValue()) ? 1 : 0);
    }
    if (!((life4_15 != null))) {
        forwardValue3427_45_0 = forwardValue3427_37_0;
        break forward_join_45;
    }
    if (!((forwardValue3427_37_0 != 0))) {
        break forward_join_44;
    }
    life5_14 = (life5_14 | 4);
    }
    forwardValue3427_45_0 = life5_14;
    }
    return forwardValue3427_45_0;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 27474;
      if (W[var3] == null) {
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
         long var5 = V[var3];
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
         Object[] var9 = (Object[])X.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               X.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/eE", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         W[var3] = var15;
      }

      return W[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_f0c18e2faf2423(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public boolean b__Boolean(net.minecraft.world.World p0, moom.DT p1) {
int lexicalValue1143_29_0;
    int lexicalValue1143_33_0;
    int[] spill1143_0;
    boolean spill1143_1;
    long life3_3;
    java.util.Iterator life6_7;
    int[] life5_8;
    moom.bs life7_15;
    lexical_join_33: {
    lexical_join_32: {
    life3_3 = (moom.eE.U ^ 84882039210630L);
    spill1143_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life6_7 = ((net.minecraft.util.EnumFacing$Plane)(net.minecraft.util.EnumFacing$Plane.HORIZONTAL)).iterator();
    life5_8 = spill1143_0;
    lexical_cycle_9: while (true) {
    lexical_join_30: {
    lexical_join_29: {
    if (!(((java.util.Iterator)(life6_7)).hasNext())) {
        break lexical_join_32;
    }
    life7_15 = ((moom.bs)(((java.util.Iterator)(life6_7)).next()));
    spill1143_1 = ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).a(((moom.bs)(life7_15)))))))).a__ch())).e__Boolean();
    if (!((life5_8 != null))) {
        lexicalValue1143_33_0 = ((spill1143_1) ? 1 : 0);
        break lexical_join_33;
    }
    if (!((life5_8 != null))) {
        lexicalValue1143_29_0 = ((spill1143_1) ? 1 : 0);
        break lexical_join_29;
    }
    if (!(spill1143_1)) {
        break lexical_join_30;
    }
    lexicalValue1143_29_0 = 1;
    }
    return ((lexicalValue1143_29_0) != 0);
    }
    if (!((life5_8 == null))) { continue lexical_cycle_9; }
    break lexical_cycle_9;
    }
    }
    lexicalValue1143_33_0 = 0;
    }
    return ((lexicalValue1143_33_0) != 0);
}


public void c(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
int forwardValue3431_23_0;
    int forwardValue3431_36_0;
    int[] spill3431_0;
    int spill3431_1;
    long life4_3;
    int life7_10;
    int life8_16;
    int[] life6_17;
    forward_join_51: {
    forward_join_36: {
    forward_join_35: {
    forward_join_26: {
    forward_join_23: {
    life4_3 = (moom.eE.U ^ 6757577289488L);
    spill3431_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life7_10 = ((((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.eE.S))))))).booleanValue()) ? 1 : 0);
    life8_16 = ((((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.eE.R))))))).booleanValue()) ? 1 : 0);
    life6_17 = spill3431_0;
    spill3431_1 = life7_10;
    if (!((life6_17 != null))) {
        forwardValue3431_23_0 = spill3431_1;
        break forward_join_23;
    }
    if (!((spill3431_1 == 0))) {
        break forward_join_26;
    }
    forwardValue3431_23_0 = life8_16;
    }
    if (!((life6_17 != null))) {
        forwardValue3431_36_0 = forwardValue3431_23_0;
        break forward_join_36;
    }
    if (!((forwardValue3431_23_0 != 0))) {
        break forward_join_35;
    }
    }
    ((moom.eE)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((boolean)(true)), ((boolean)(false)), ((int)(-1)), ((net.minecraft.block.state.IBlockState)(null)));
    }
    forwardValue3431_36_0 = life8_16;
    }
    if (!((forwardValue3431_36_0 != 0))) {
        break forward_join_51;
    }
    ((net.minecraft.world.World)(p0)).b(((moom.DT)(p1)), ((net.minecraft.block.Block)(this)));
    ((net.minecraft.world.World)(p0)).b(((moom.DT)(((moom.DT)(p1)).a(((moom.bs)(((moom.bs)(((moom.bs)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.eE.Q))))))).a__bs()))))), ((net.minecraft.block.Block)(this)));
    }
    super.c(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)));
    return;
}


public boolean l() {
return ((1) != 0);
}


public boolean a__Boolean(net.minecraft.world.World p0, moom.DT p1, moom.bs p2) {
int forwardValue3424_20_0;
    int forwardValue3424_24_0;
    int forwardValue3424_26_0;
    boolean spill3424_0;
    long life4_3;
    int[] life6_5;
    forward_join_26: {
    forward_join_25: {
    forward_join_24: {
    forward_join_20: {
    life4_3 = (moom.eE.U ^ 26045357654345L);
    life6_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3424_0 = ((net.minecraft.util.EnumFacing$Axis)(((moom.bs)(p2)).a__bt())).b__Boolean();
    if (!((life6_5 != null))) {
        forwardValue3424_20_0 = ((spill3424_0) ? 1 : 0);
        break forward_join_20;
    }
    if (!(spill3424_0)) {
        break forward_join_25;
    }
    forwardValue3424_20_0 = ((((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).a(((moom.bs)(((moom.bs)(p2)).a__bs())))))))).a__ch())).e__Boolean()) ? 1 : 0);
    }
    if (!((life6_5 != null))) {
        forwardValue3424_24_0 = forwardValue3424_20_0;
        break forward_join_24;
    }
    if (!((forwardValue3424_20_0 != 0))) {
        break forward_join_25;
    }
    forwardValue3424_24_0 = 1;
    }
    forwardValue3424_26_0 = forwardValue3424_24_0;
    break forward_join_26;
    }
    forwardValue3424_26_0 = 0;
    }
    return ((forwardValue3424_26_0) != 0);
}


public net.minecraft.util.EnumWorldBlockLayer a__bx() {
return net.minecraft.util.EnumWorldBlockLayer.CUTOUT_MIPPED;
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.block.Block p3) {
int forwardValue3421_40_0;
    boolean spill3421_0;
    long life5_3;
    int[] life7_5;
    moom.bs life8_22;
    forward_join_41: {
    forward_join_40: {
    life5_3 = (moom.eE.U ^ 135629246203378L);
    life7_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    if (!((p3 != this))) {
        break forward_join_41;
    }
    if (!(((moom.eE)(this)).a__Boolean(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2))))) {
        break forward_join_41;
    }
    life8_22 = ((moom.bs)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.eE.Q)))));
    spill3421_0 = ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).a(((moom.bs)(((moom.bs)(life8_22)).a__bs())))))))).a__ch())).e__Boolean();
    if (!((life7_5 != null))) {
        forwardValue3421_40_0 = ((spill3421_0) ? 1 : 0);
        break forward_join_40;
    }
    if (!((!spill3421_0))) {
        break forward_join_41;
    }
    ((moom.eE)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((int)(0)));
    forwardValue3421_40_0 = ((((net.minecraft.world.World)(p0)).d__Boolean(((moom.DT)(p1)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue3421_40_0);
    }
    return;
}


private boolean a__Boolean(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
int forwardValue3425_26_0;
    boolean spill3425_0;
    long life4_3;
    int[] life6_5;
    forward_join_26: {
    forward_join_25: {
    life4_3 = (moom.eE.U ^ 13339023000725L);
    life6_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3425_0 = ((moom.eE)(this)).b__Boolean(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)));
    if (!((life6_5 != null))) {
        forwardValue3425_26_0 = ((spill3425_0) ? 1 : 0);
        break forward_join_26;
    }
    if (!((!spill3425_0))) {
        break forward_join_25;
    }
    ((moom.eE)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((int)(0)));
    ((net.minecraft.world.World)(p0)).d__Boolean(((moom.DT)(p1)));
    return ((0) != 0);
    }
    forwardValue3425_26_0 = 1;
    }
    return ((forwardValue3425_26_0) != 0);
}


public net.minecraft.block.state.IBlockState a(net.minecraft.block.state.IBlockState p0, net.minecraft.world.IBlockAccess p1, moom.DT p2) {
net.minecraft.block.state.IBlockState forwardValue3419_16_0;
    moom.fv forwardValue3419_16_1;
    int forwardValue3419_16_2;
    net.minecraft.block.state.IBlockState forwardValue3419_17_0;
    moom.fv forwardValue3419_17_1;
    net.minecraft.block.state.IBlockState forwardValue3419_18_0;
    moom.fv forwardValue3419_18_1;
    int forwardValue3419_18_2;
    net.minecraft.block.state.IBlockState spill3419_0;
    moom.fv spill3419_1;
    boolean spill3419_2;
    long life4_3;
    int[] life6_5;
    forward_join_18: {
    forward_join_17: {
    forward_join_16: {
    life4_3 = (moom.eE.U ^ 26591349776696L);
    life6_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3419_0 = p0;
    spill3419_1 = moom.eE.T;
    spill3419_2 = __sourceExactCall_fafaf58231f9bd(((net.minecraft.world.IBlockAccess)(p1)), ((moom.DT)(((moom.DT)(p2)).b__DT())));
    if (!((life6_5 != null))) {
        forwardValue3419_16_0 = spill3419_0;
        forwardValue3419_16_1 = spill3419_1;
        forwardValue3419_16_2 = ((spill3419_2) ? 1 : 0);
        break forward_join_16;
    }
    if (!((!spill3419_2))) {
        forwardValue3419_17_0 = spill3419_0;
        forwardValue3419_17_1 = spill3419_1;
        break forward_join_17;
    }
    forwardValue3419_16_0 = spill3419_0;
    forwardValue3419_16_1 = spill3419_1;
    forwardValue3419_16_2 = 1;
    }
    forwardValue3419_18_0 = forwardValue3419_16_0;
    forwardValue3419_18_1 = forwardValue3419_16_1;
    forwardValue3419_18_2 = forwardValue3419_16_2;
    break forward_join_18;
    }
    forwardValue3419_18_0 = forwardValue3419_17_0;
    forwardValue3419_18_1 = forwardValue3419_17_1;
    forwardValue3419_18_2 = 0;
    }
    return ((net.minecraft.block.state.IBlockState)(forwardValue3419_18_0)).a__fE(((net.minecraft.block.properties.IProperty)(forwardValue3419_18_1)), ((java.lang.Comparable)(java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue3419_18_2)))))));
}


public moom.CA a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
return null;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


protected moom.fA a__fA() {
return new moom.fA(this, new net.minecraft.block.properties.IProperty[] {moom.eE.Q, moom.eE.R, moom.eE.S, moom.eE.T});
}


private void a(net.minecraft.world.World p0, moom.DT p1, moom.bs p2) {
((net.minecraft.world.World)(p0)).b(((moom.DT)(p1)), ((net.minecraft.block.Block)(this)));
    ((net.minecraft.world.World)(p0)).b(((moom.DT)(((moom.DT)(p1)).a(((moom.bs)(((moom.bs)(p2)).a__bs()))))), ((net.minecraft.block.Block)(this)));
    return;
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, boolean p3, boolean p4, int p5, net.minecraft.block.state.IBlockState p6) {
int lexicalValue1142_31_0;
    int lexicalValue1142_33_0;
    int lexicalValue1142_39_0;
    int lexicalValue1142_41_0;
    net.minecraft.block.Block lexicalValue1142_92_0;
    net.minecraft.block.Block lexicalValue1142_92_1;
    int lexicalValue1142_110_0;
    int lexicalValue1142_110_1;
    int lexicalValue1142_121_0;
    int lexicalValue1142_125_0;
    int lexicalValue1142_127_0;
    int lexicalValue1142_147_0;
    int lexicalValue1142_147_1;
    int lexicalValue1142_148_0;
    int lexicalValue1142_149_0;
    int lexicalValue1142_149_1;
    int lexicalValue1142_157_0;
    int lexicalValue1142_157_1;
    int lexicalValue1142_161_0;
    int lexicalValue1142_161_1;
    int lexicalValue1142_162_0;
    int lexicalValue1142_163_0;
    int lexicalValue1142_163_1;
    int lexicalValue1142_195_0;
    int lexicalValue1142_195_1;
    int lexicalValue1142_196_0;
    int lexicalValue1142_197_0;
    int lexicalValue1142_197_1;
    net.minecraft.block.state.IBlockState lexicalValue1142_213_0;
    int lexicalValue1142_257_0;
    int lexicalValue1142_279_0;
    int lexicalValue1142_284_0;
    net.minecraft.world.World lexicalValue1142_311_0;
    moom.DT lexicalValue1142_311_1;
    int[] spill1142_0;
    boolean spill1142_1;
    boolean spill1142_2;
    int spill1142_3;
    long spill1142_4;
    net.minecraft.block.state.IBlockState spill1142_5;
    net.minecraft.block.Block spill1142_6;
    moom.eE spill1142_7;
    int spill1142_8;
    int spill1142_9;
    int spill1142_10;
    int spill1142_11;
    int spill1142_12;
    int spill1142_13;
    int spill1142_14;
    int spill1142_15;
    int spill1142_16;
    int spill1142_17;
    boolean spill1142_18;
    net.minecraft.world.World spill1142_19;
    moom.DT spill1142_20;
    long life8_3;
    moom.bs life11_8;
    int life12_15;
    int[] life10_16;
    int life13_22;
    int life14_36;
    int life15_47;
    int life16_50;
    int life17_55;
    net.minecraft.block.state.IBlockState[] life18_58;
    int life19_60;
    moom.DT life20_72;
    net.minecraft.block.state.IBlockState life21_76;
    int life22_160;
    int life23_166;
    int life24_172;
    net.minecraft.block.state.IBlockState life19_267;
    moom.DT life20_279;
    moom.bs life21_282;
    int life20_359;
    moom.DT life21_367;
    net.minecraft.block.state.IBlockState life22_371;
    lexical_join_322: {
    lexical_join_284: {
    lexical_join_279: {
    lexical_join_278: {
    lexical_join_257: {
    lexical_join_248: {
    lexical_join_213: {
    lexical_join_197: {
    lexical_join_196: {
    lexical_join_195: {
    lexical_join_188: {
    lexical_join_41: {
    lexical_join_40: {
    lexical_join_39: {
    lexical_join_33: {
    lexical_join_32: {
    lexical_join_31: {
    life8_3 = (moom.eE.U ^ 58333966950107L);
    life11_8 = ((moom.bs)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.eE.Q)))));
    spill1142_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life12_15 = ((((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.eE.S))))))).booleanValue()) ? 1 : 0);
    life10_16 = spill1142_0;
    life13_22 = ((((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.eE.R))))))).booleanValue()) ? 1 : 0);
    spill1142_1 = __sourceExactCall_fafaf58231f9bd(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(((moom.DT)(p1)).b__DT())));
    if (!((life10_16 != null))) {
        lexicalValue1142_31_0 = ((spill1142_1) ? 1 : 0);
        break lexical_join_31;
    }
    if (!((!spill1142_1))) {
        break lexical_join_32;
    }
    lexicalValue1142_31_0 = 1;
    }
    lexicalValue1142_33_0 = lexicalValue1142_31_0;
    break lexical_join_33;
    }
    lexicalValue1142_33_0 = 0;
    }
    life14_36 = lexicalValue1142_33_0;
    spill1142_2 = p3;
    if (!((life10_16 != null))) {
        lexicalValue1142_39_0 = ((spill1142_2) ? 1 : 0);
        break lexical_join_39;
    }
    if (!((!spill1142_2))) {
        break lexical_join_40;
    }
    lexicalValue1142_39_0 = 1;
    }
    lexicalValue1142_41_0 = lexicalValue1142_39_0;
    break lexical_join_41;
    }
    lexicalValue1142_41_0 = 0;
    }
    life15_47 = lexicalValue1142_41_0;
    spill1142_3 = 4739;
    life16_50 = 0;
    spill1142_4 = (7671584268942399331L ^ life8_3);
    life17_55 = 0;
    life18_58 = new net.minecraft.block.state.IBlockState[__sourceIntrinsic_10edd25e8db5_invokedynamic1142_19(spill1142_3, spill1142_4)];
    life19_60 = 1;
    lexical_cycle_55: while (true) {
    lexical_join_186: {
    lexical_join_185: {
    lexical_join_163: {
    lexical_join_162: {
    lexical_join_161: {
    lexical_join_157: {
    lexical_join_149: {
    lexical_join_148: {
    lexical_join_147: {
    lexical_join_127: {
    lexical_join_126: {
    lexical_join_125: {
    lexical_join_121: {
    lexical_join_116: {
    lexical_join_110: {
    lexical_join_106: {
    lexical_join_92: {
    lexical_join_89: {
    if (!((life19_60 < __sourceIntrinsic_10edd25e8db5_invokedynamic1142_20(29965, (1963546046700564712L ^ life8_3))))) {
        break lexical_join_188;
    }
    life20_72 = ((moom.DT)(p1)).a(((moom.bs)(life11_8)), ((int)(life19_60)));
    life21_76 = ((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life20_72)));
    spill1142_5 = life21_76;
    if (!((life10_16 != null))) {
        lexicalValue1142_213_0 = spill1142_5;
        break lexical_join_213;
    }
    spill1142_6 = ((net.minecraft.block.state.IBlockState)(spill1142_5)).a__ch();
    spill1142_7 = net.minecraft.init.Blocks.bG;
    if (!((life10_16 != null))) {
        lexicalValue1142_92_0 = spill1142_6;
        lexicalValue1142_92_1 = spill1142_7;
        break lexical_join_92;
    }
    if (!((spill1142_6 == spill1142_7))) {
        break lexical_join_89;
    }
    if (!((((net.minecraft.block.state.IBlockState)(life21_76)).a(((net.minecraft.block.properties.IProperty)(moom.eE.Q))) == ((moom.bs)(life11_8)).a__bs()))) {
        break lexical_join_188;
    }
    life17_55 = life19_60;
    if (!((life10_16 == null))) {
        break lexical_join_188;
    }
    }
    lexicalValue1142_92_0 = ((net.minecraft.block.state.IBlockState)(life21_76)).a__ch();
    lexicalValue1142_92_1 = net.minecraft.init.Blocks.bH;
    }
    if (!((lexicalValue1142_92_0 != lexicalValue1142_92_1))) {
        break lexical_join_106;
    }
    spill1142_8 = life19_60;
    spill1142_9 = p5;
    if (!((life10_16 != null))) {
        lexicalValue1142_110_0 = spill1142_8;
        lexicalValue1142_110_1 = spill1142_9;
        break lexical_join_110;
    }
    if (!((spill1142_8 != spill1142_9))) {
        break lexical_join_106;
    }
    (life18_58)[life19_60] = null;
    life15_47 = 0;
    if (!((life10_16 == null))) {
        break lexical_join_185;
    }
    }
    spill1142_10 = life19_60;
    if (!((life10_16 != null))) {
        lexicalValue1142_121_0 = spill1142_10;
        break lexical_join_121;
    }
    lexicalValue1142_110_0 = spill1142_10;
    lexicalValue1142_110_1 = p5;
    }
    if (!((lexicalValue1142_110_0 == lexicalValue1142_110_1))) {
        break lexical_join_116;
    }
    life21_76 = ((net.minecraft.block.state.IBlockState)(com.google.common.base.MoreObjects.firstNonNull(((java.lang.Object)(p6)), ((java.lang.Object)(life21_76)))));
    }
    lexicalValue1142_121_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(life21_76)).a(((net.minecraft.block.properties.IProperty)(moom.eD.T))))))).booleanValue()) ? 1 : 0);
    }
    if (!((life10_16 != null))) {
        lexicalValue1142_125_0 = lexicalValue1142_121_0;
        break lexical_join_125;
    }
    if (!((lexicalValue1142_121_0 == 0))) {
        break lexical_join_126;
    }
    lexicalValue1142_125_0 = 1;
    }
    lexicalValue1142_127_0 = lexicalValue1142_125_0;
    break lexical_join_127;
    }
    lexicalValue1142_127_0 = 0;
    }
    life22_160 = lexicalValue1142_127_0;
    life23_166 = ((((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(life21_76)).a(((net.minecraft.block.properties.IProperty)(moom.eD.Q))))))).booleanValue()) ? 1 : 0);
    life24_172 = ((((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(life21_76)).a(((net.minecraft.block.properties.IProperty)(moom.eD.R))))))).booleanValue()) ? 1 : 0);
    spill1142_11 = life15_47;
    spill1142_12 = life24_172;
    if (!((life10_16 != null))) {
        lexicalValue1142_147_0 = spill1142_11;
        lexicalValue1142_147_1 = spill1142_12;
        break lexical_join_147;
    }
    if (!((spill1142_12 == life14_36))) {
        lexicalValue1142_148_0 = spill1142_11;
        break lexical_join_148;
    }
    lexicalValue1142_147_0 = spill1142_11;
    lexicalValue1142_147_1 = 1;
    }
    lexicalValue1142_149_0 = lexicalValue1142_147_0;
    lexicalValue1142_149_1 = lexicalValue1142_147_1;
    break lexical_join_149;
    }
    lexicalValue1142_149_0 = lexicalValue1142_148_0;
    lexicalValue1142_149_1 = 0;
    }
    life15_47 = (lexicalValue1142_149_0 & lexicalValue1142_149_1);
    spill1142_13 = life16_50;
    spill1142_14 = life22_160;
    if (!((life10_16 != null))) {
        lexicalValue1142_157_0 = spill1142_13;
        lexicalValue1142_157_1 = spill1142_14;
        break lexical_join_157;
    }
    if (!((spill1142_14 != 0))) {
        lexicalValue1142_162_0 = spill1142_13;
        break lexical_join_162;
    }
    lexicalValue1142_157_0 = spill1142_13;
    lexicalValue1142_157_1 = life23_166;
    }
    if (!((life10_16 != null))) {
        lexicalValue1142_161_0 = lexicalValue1142_157_0;
        lexicalValue1142_161_1 = lexicalValue1142_157_1;
        break lexical_join_161;
    }
    if (!((lexicalValue1142_157_1 != 0))) {
        lexicalValue1142_162_0 = lexicalValue1142_157_0;
        break lexical_join_162;
    }
    lexicalValue1142_161_0 = lexicalValue1142_157_0;
    lexicalValue1142_161_1 = 1;
    }
    lexicalValue1142_163_0 = lexicalValue1142_161_0;
    lexicalValue1142_163_1 = lexicalValue1142_161_1;
    break lexical_join_163;
    }
    lexicalValue1142_163_0 = lexicalValue1142_162_0;
    lexicalValue1142_163_1 = 0;
    }
    life16_50 = (lexicalValue1142_163_0 | lexicalValue1142_163_1);
    (life18_58)[life19_60] = life21_76;
    if (!((life10_16 != null))) {
        break lexical_join_186;
    }
    if (!((life19_60 == p5))) {
        break lexical_join_185;
    }
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.Block)(this)), ((int)(((moom.eE)(this)).a(((net.minecraft.world.World)(p0))))));
    life15_47 = (life15_47 & life22_160);
    }
    life19_60 += 1;
    }
    if (!((life10_16 == null))) { continue lexical_cycle_55; }
    break lexical_cycle_55;
    }
    }
    spill1142_15 = life15_47;
    spill1142_16 = life17_55;
    if (!((life10_16 != null))) {
        lexicalValue1142_195_0 = spill1142_15;
        lexicalValue1142_195_1 = spill1142_16;
        break lexical_join_195;
    }
    if (!((spill1142_16 > 1))) {
        lexicalValue1142_196_0 = spill1142_15;
        break lexical_join_196;
    }
    lexicalValue1142_195_0 = spill1142_15;
    lexicalValue1142_195_1 = 1;
    }
    lexicalValue1142_197_0 = lexicalValue1142_195_0;
    lexicalValue1142_197_1 = lexicalValue1142_195_1;
    break lexical_join_197;
    }
    lexicalValue1142_197_0 = lexicalValue1142_196_0;
    lexicalValue1142_197_1 = 0;
    }
    life15_47 = (lexicalValue1142_197_0 & lexicalValue1142_197_1);
    life16_50 = (life16_50 & life15_47);
    lexicalValue1142_213_0 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((moom.eE)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.eE.S)), ((java.lang.Comparable)(java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((life15_47))))))))).a__fE(((net.minecraft.block.properties.IProperty)(moom.eE.R)), ((java.lang.Comparable)(java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((life16_50)))))));
    }
    life19_267 = lexicalValue1142_213_0;
    spill1142_17 = life17_55;
    if (!((life10_16 != null))) {
        lexicalValue1142_257_0 = spill1142_17;
        break lexical_join_257;
    }
    if (!((spill1142_17 > 0))) {
        break lexical_join_248;
    }
    life20_279 = ((moom.DT)(p1)).a(((moom.bs)(life11_8)), ((int)(life17_55)));
    life21_282 = ((moom.bs)(life11_8)).a__bs();
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(life20_279)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(life19_267)).a__fE(((net.minecraft.block.properties.IProperty)(moom.eE.Q)), ((java.lang.Comparable)(life21_282))))), ((int)(3)));
    ((moom.eE)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(life20_279)), ((moom.bs)(life21_282)));
    ((moom.eE)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(life20_279)), ((boolean)__sourceIntrinsic_integerToBoolean((life15_47))), ((boolean)__sourceIntrinsic_integerToBoolean((life16_50))), ((boolean)__sourceIntrinsic_integerToBoolean((life12_15))), ((boolean)__sourceIntrinsic_integerToBoolean((life13_22))));
    }
    ((moom.eE)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((boolean)__sourceIntrinsic_integerToBoolean((life15_47))), ((boolean)__sourceIntrinsic_integerToBoolean((life16_50))), ((boolean)__sourceIntrinsic_integerToBoolean((life12_15))), ((boolean)__sourceIntrinsic_integerToBoolean((life13_22))));
    lexicalValue1142_257_0 = ((p3) ? 1 : 0);
    }
    if (!((life10_16 != null))) {
        lexicalValue1142_279_0 = lexicalValue1142_257_0;
        break lexical_join_279;
    }
    if (!((lexicalValue1142_257_0 == 0))) {
        break lexical_join_278;
    }
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(life19_267)).a__fE(((net.minecraft.block.properties.IProperty)(moom.eE.Q)), ((java.lang.Comparable)(life11_8))))), ((int)(3)));
    spill1142_18 = p4;
    if (!((life10_16 != null))) {
        lexicalValue1142_279_0 = ((spill1142_18) ? 1 : 0);
        break lexical_join_279;
    }
    if (!(spill1142_18)) {
        break lexical_join_278;
    }
    ((moom.eE)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((moom.bs)(life11_8)));
    }
    lexicalValue1142_279_0 = life12_15;
    }
    if (!((life10_16 != null))) {
        lexicalValue1142_284_0 = lexicalValue1142_279_0;
        break lexical_join_284;
    }
    if (!((lexicalValue1142_279_0 != life15_47))) {
        break lexical_join_322;
    }
    lexicalValue1142_284_0 = 1;
    }
    life20_359 = lexicalValue1142_284_0;
    lexical_cycle_285: while (true) {
    lexical_join_320: {
    lexical_join_319: {
    lexical_join_311: {
    if (!((life20_359 < life17_55))) {
        break lexical_join_322;
    }
    life21_367 = ((moom.DT)(p1)).a(((moom.bs)(life11_8)), ((int)(life20_359)));
    life22_371 = (life18_58)[life20_359];
    if (!((life10_16 != null))) {
        break lexical_join_320;
    }
    if (!((life22_371 != null))) {
        break lexical_join_319;
    }
    spill1142_19 = p0;
    spill1142_20 = life21_367;
    if (!((life10_16 != null))) {
        lexicalValue1142_311_0 = spill1142_19;
        lexicalValue1142_311_1 = spill1142_20;
        break lexical_join_311;
    }
    if (!((((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(spill1142_19)).a__fE(((moom.DT)(spill1142_20))))).a__ch() != net.minecraft.init.Blocks.a))) {
        break lexical_join_319;
    }
    lexicalValue1142_311_0 = p0;
    lexicalValue1142_311_1 = life21_367;
    }
    ((net.minecraft.world.World)(lexicalValue1142_311_0)).a(((moom.DT)(lexicalValue1142_311_1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(life22_371)).a__fE(((net.minecraft.block.properties.IProperty)(moom.eE.S)), ((java.lang.Comparable)(java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((life15_47))))))))), ((int)(3)));
    }
    life20_359 += 1;
    }
    if (!((life10_16 == null))) { continue lexical_cycle_285; }
    break lexical_cycle_285;
    }
    }
    return;
}


private void a(net.minecraft.world.World p0, moom.DT p1, boolean p2, boolean p3, boolean p4, boolean p5) {
int forwardValue3423_37_0;
    int forwardValue3423_67_0;
    int forwardValue3423_97_0;
    int forwardValue3423_101_0;
    boolean spill3423_0;
    boolean spill3423_1;
    boolean spill3423_2;
    boolean spill3423_3;
    long life7_3;
    int[] life9_5;
    forward_join_130: {
    forward_join_101: {
    forward_join_97: {
    forward_join_96: {
    forward_join_67: {
    forward_join_66: {
    forward_join_37: {
    forward_join_36: {
    life7_3 = (moom.eE.U ^ 97541078175295L);
    life9_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3423_0 = p3;
    if (!((life9_5 != null))) {
        forwardValue3423_37_0 = ((spill3423_0) ? 1 : 0);
        break forward_join_37;
    }
    if (!(spill3423_0)) {
        break forward_join_36;
    }
    spill3423_1 = p5;
    if (!((life9_5 != null))) {
        forwardValue3423_37_0 = ((spill3423_1) ? 1 : 0);
        break forward_join_37;
    }
    if (!((!spill3423_1))) {
        break forward_join_36;
    }
    ((net.minecraft.world.World)(p0)).a(((double)((((double) ((moom.DT)(p1)).a()) + 0x1.0p-1d))), ((double)((((double) ((moom.DT)(p1)).b()) + 0x1.999999999999ap-4d))), ((double)((((double) ((moom.DT)(p1)).c()) + 0x1.0p-1d))), ((java.lang.String)("random.click")), ((float)(0x1.99999ap-2f)), ((float)(0x1.333334p-1f)));
    if (!((life9_5 == null))) {
        break forward_join_130;
    }
    }
    forwardValue3423_37_0 = ((p3) ? 1 : 0);
    }
    if (!((life9_5 != null))) {
        forwardValue3423_67_0 = forwardValue3423_37_0;
        break forward_join_67;
    }
    if (!((forwardValue3423_37_0 == 0))) {
        break forward_join_66;
    }
    spill3423_2 = p5;
    if (!((life9_5 != null))) {
        forwardValue3423_67_0 = ((spill3423_2) ? 1 : 0);
        break forward_join_67;
    }
    if (!(spill3423_2)) {
        break forward_join_66;
    }
    ((net.minecraft.world.World)(p0)).a(((double)((((double) ((moom.DT)(p1)).a()) + 0x1.0p-1d))), ((double)((((double) ((moom.DT)(p1)).b()) + 0x1.999999999999ap-4d))), ((double)((((double) ((moom.DT)(p1)).c()) + 0x1.0p-1d))), ((java.lang.String)("random.click")), ((float)(0x1.99999ap-2f)), ((float)(0x1.0p-1f)));
    if (!((life9_5 == null))) {
        break forward_join_130;
    }
    }
    forwardValue3423_67_0 = ((p2) ? 1 : 0);
    }
    if (!((life9_5 != null))) {
        forwardValue3423_97_0 = forwardValue3423_67_0;
        break forward_join_97;
    }
    if (!((forwardValue3423_67_0 != 0))) {
        break forward_join_96;
    }
    spill3423_3 = p4;
    if (!((life9_5 != null))) {
        forwardValue3423_97_0 = ((spill3423_3) ? 1 : 0);
        break forward_join_97;
    }
    if (!((!spill3423_3))) {
        break forward_join_96;
    }
    ((net.minecraft.world.World)(p0)).a(((double)((((double) ((moom.DT)(p1)).a()) + 0x1.0p-1d))), ((double)((((double) ((moom.DT)(p1)).b()) + 0x1.999999999999ap-4d))), ((double)((((double) ((moom.DT)(p1)).c()) + 0x1.0p-1d))), ((java.lang.String)("random.click")), ((float)(0x1.99999ap-2f)), ((float)(0x1.666666p-1f)));
    if (!((life9_5 == null))) {
        break forward_join_130;
    }
    }
    forwardValue3423_97_0 = ((p2) ? 1 : 0);
    }
    if (!((life9_5 != null))) {
        forwardValue3423_101_0 = forwardValue3423_97_0;
        break forward_join_101;
    }
    if (!((forwardValue3423_97_0 == 0))) {
        break forward_join_130;
    }
    forwardValue3423_101_0 = ((p4) ? 1 : 0);
    }
    if (!((forwardValue3423_101_0 != 0))) {
        break forward_join_130;
    }
    ((net.minecraft.world.World)(p0)).a(((double)((((double) ((moom.DT)(p1)).a()) + 0x1.0p-1d))), ((double)((((double) ((moom.DT)(p1)).b()) + 0x1.999999999999ap-4d))), ((double)((((double) ((moom.DT)(p1)).c()) + 0x1.0p-1d))), ((java.lang.String)("random.bowhit")), ((float)(0x1.99999ap-2f)), ((float)((0x1.333334p0f / ((((java.util.Random)(((net.minecraft.world.World)(p0)).u)).nextFloat() * 0x1.99999ap-3f) + 0x1.ccccccp-1f)))));
    }
    return;
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.entity.EntityLivingBase p3, net.minecraft.item.ItemStack p4) {
((moom.eE)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((boolean)(false)), ((boolean)(false)), ((int)(-1)), ((net.minecraft.block.state.IBlockState)(null)));
    return;
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, java.util.Random p3) {
return;
}


public void a__Void(net.minecraft.world.IBlockAccess p0, moom.DT p1) {
int[] spill348_0;
    long life3_3;
    float life6_6;
    int[] life5_7;
    forward_join_86: {
    forward_join_70: {
    forward_join_54: {
    forward_join_36: {
    forward_join_34: {
    forward_join_20: {
    life3_3 = (moom.eE.U ^ 79488448664363L);
    spill348_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life6_6 = 0x1.8p-3f;
    life5_7 = spill348_0;
    if (!((life5_7 != null))) {
        break forward_join_34;
    }
    switch ((moom.fg.a)[((moom.bs)(((moom.bs)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(p1))))).a(((net.minecraft.block.properties.IProperty)(moom.eE.Q))))))).ordinal()]) {
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
default:
{
        break forward_join_86;
    }
}
    }
    ((moom.eE)(this)).a(((float)(0x0.0p0f)), ((float)(0x1.99999ap-3f)), ((float)((0x1.0p-1f - life6_6))), ((float)((life6_6 * 0x1.0p1f))), ((float)(0x1.99999ap-1f)), ((float)((0x1.0p-1f + life6_6))));
    }
    if (!((life5_7 == null))) {
        break forward_join_86;
    }
    }
    ((moom.eE)(this)).a(((float)((0x1.0p0f - (life6_6 * 0x1.0p1f)))), ((float)(0x1.99999ap-3f)), ((float)((0x1.0p-1f - life6_6))), ((float)(0x1.0p0f)), ((float)(0x1.99999ap-1f)), ((float)((0x1.0p-1f + life6_6))));
    if (!((life5_7 == null))) {
        break forward_join_86;
    }
    }
    ((moom.eE)(this)).a(((float)((0x1.0p-1f - life6_6))), ((float)(0x1.99999ap-3f)), ((float)(0x0.0p0f)), ((float)((0x1.0p-1f + life6_6))), ((float)(0x1.99999ap-1f)), ((float)((life6_6 * 0x1.0p1f))));
    if (!((life5_7 == null))) {
        break forward_join_86;
    }
    }
    ((moom.eE)(this)).a(((float)((0x1.0p-1f - life6_6))), ((float)(0x1.99999ap-3f)), ((float)((0x1.0p0f - (life6_6 * 0x1.0p1f)))), ((float)((0x1.0p-1f + life6_6))), ((float)(0x1.99999ap-1f)), ((float)(0x1.0p0f)));
    }
    return;
}


public net.minecraft.block.state.IBlockState a(net.minecraft.world.World p0, moom.DT p1, moom.bs p2, float p3, float p4, float p5, int p6, net.minecraft.entity.EntityLivingBase p7) {
long local9 = (moom.eE.U ^ 106192652592441L);
    java.lang.Object local11 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((moom.eE)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.eE.R)), ((java.lang.Comparable)(java.lang.Boolean.FALSE))))).a__fE(((net.minecraft.block.properties.IProperty)(moom.eE.S)), ((java.lang.Comparable)(java.lang.Boolean.FALSE))))).a__fE(((net.minecraft.block.properties.IProperty)(moom.eE.T)), ((java.lang.Comparable)(java.lang.Boolean.FALSE)));
    if ((__sourceIntrinsic_booleanComparison(((net.minecraft.util.EnumFacing$Axis)(((moom.bs)(p2)).a__bt())).b__Boolean()) != 0)) {
        local11 = ((net.minecraft.block.state.IBlockState)(local11)).a__fE(((net.minecraft.block.properties.IProperty)(moom.eE.Q)), ((java.lang.Comparable)(p2)));
    }
    return ((net.minecraft.block.state.IBlockState)(local11));
}


public int a(net.minecraft.world.IBlockAccess p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, moom.bs p3) {
int forwardValue3420_19_0;
    int forwardValue3420_21_0;
    boolean spill3420_0;
    long life5_3;
    int[] life7_5;
    forward_join_21: {
    forward_join_20: {
    forward_join_19: {
    life5_3 = (moom.eE.U ^ 26116956509180L);
    life7_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3420_0 = ((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.eE.R))))))).booleanValue();
    if (!((life7_5 != null))) {
        forwardValue3420_19_0 = ((spill3420_0) ? 1 : 0);
        break forward_join_19;
    }
    if (!(spill3420_0)) {
        break forward_join_20;
    }
    forwardValue3420_19_0 = __sourceIntrinsic_0beb55581d70_invokedynamic3420_7(173, (8927390402008402025L ^ life5_3));
    }
    forwardValue3420_21_0 = forwardValue3420_19_0;
    break forward_join_21;
    }
    forwardValue3420_21_0 = 0;
    }
    return forwardValue3420_21_0;
}


public boolean g() {
return ((0) != 0);
}


public boolean j() {
return ((0) != 0);
}


private static native <E extends Throwable> int __sourceIntrinsic_0beb55581d70_invokedynamic3420_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_10edd25e8db5_invokedynamic1142_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_10edd25e8db5_invokedynamic1142_20(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7493_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8db5871551d4_invokedynamic3427_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b0b3991ff8d9_invokedynamic3428_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_819466f05fee_invokedynamic3430_7(int a0, long a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native int __sourceIntrinsic_booleanComparison(boolean value);

private static native int __sourceExactCall_f0c18e2faf2423(int p0, long p1);
private static native boolean __sourceExactCall_fafaf58231f9bd(net.minecraft.world.IBlockAccess p0, moom.DT p1);
}
