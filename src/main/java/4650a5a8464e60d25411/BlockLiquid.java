package net.minecraft.block;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public abstract class BlockLiquid extends net.minecraft.block.Block {

public static final moom.fy Q;

private static final long T;

private static final long[] U;

private static final java.lang.Integer[] V;

private static final java.util.Map W;

protected BlockLiquid(moom.fn p0) {
super(p0);
    (this).a__Void(((this.M).a__fE()).a__fE(net.minecraft.block.BlockLiquid.Q, java.lang.Integer.valueOf(0)));
    (this).a(0x0.0p+0f, 0x0.0p+0f, 0x0.0p+0f, 0x1.0000000000000p+0f, 0x1.0000000000000p+0f, 0x1.0000000000000p+0f);
    (this).a(true);
}


static {
T = ((long)(((moom._a)(moom._c.a(((long)(-773931592846150679L)), ((long)(7550313577324591437L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(227509421291154L)))));
    long local11_life6 = (net.minecraft.block.BlockLiquid.T ^ 50441528387423L);
    W = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life9;
    javax.crypto.Cipher __sourceSpill1751_11 = (local0_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1751_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1751_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1751_14 = new byte[8];
    (__sourceSpill1751_14)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local1_life15 = 1;
    while ((local1_life15 < 8)) {
        (__sourceSpill1751_14)[local1_life15] = ((byte) ((int) ((local11_life6 << (local1_life15 * 8)) >>> 56)));
        local1_life15 += 1;
    }
    byte[] __sourcePreallocation1751_16 = __sourceSpill1751_14;
    ((javax.crypto.Cipher)(__sourceSpill1751_11)).init(((int)(__sourceSpill1751_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1751_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1751_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life19 = new long[14];
    int local3_life20 = 0;
    java.lang.String local4_life21;
    int local5_life23 = ((java.lang.String)((local4_life21 = "1­\n\002\"ñê+Å·Ý\037\032q^\023¦\024 Qò<º9kÑú,\\é¸~¤»Q1S;*a6=ÆY²Gý[·jïK£\030þf¾eÈíÃ#Æ\rö6çg\r~IUÀÖ¶\032\031ÈZçÊnÓ"))).length();
    int local2_life24 = 0;
    do {
        java.lang.String __sourceSpill1751_25 = local4_life21;
        int __sourceSpill1751_26 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1751_25)).substring(((int)(__sourceSpill1751_26)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1751_30 = local6_life19;
        int __sourceSpill1751_31 = local3_life20;
        local3_life20 += 1;
        long local8_life32 = (((((((((((long) (local7_life29)[0]) & 255L) << 56) | ((((long) (local7_life29)[1]) & 255L) << 48)) | ((((long) (local7_life29)[2]) & 255L) << 40)) | ((((long) (local7_life29)[3]) & 255L) << 32)) | ((((long) (local7_life29)[4]) & 255L) << 24)) | ((((long) (local7_life29)[5]) & 255L) << 16)) | ((((long) (local7_life29)[6]) & 255L) << 8)) | (((long) (local7_life29)[7]) & 255L));
        byte[] __sourceSpill1751_33 = new byte[8];
        (__sourceSpill1751_33)[0] = ((byte) ((int) (local8_life32 >>> 56)));
        (__sourceSpill1751_33)[1] = ((byte) ((int) (local8_life32 >>> 48)));
        (__sourceSpill1751_33)[2] = ((byte) ((int) (local8_life32 >>> 40)));
        (__sourceSpill1751_33)[3] = ((byte) ((int) (local8_life32 >>> 32)));
        (__sourceSpill1751_33)[4] = ((byte) ((int) (local8_life32 >>> 24)));
        (__sourceSpill1751_33)[5] = ((byte) ((int) (local8_life32 >>> 16)));
        (__sourceSpill1751_33)[6] = ((byte) ((int) (local8_life32 >>> 8)));
        (__sourceSpill1751_33)[7] = ((byte) ((int) local8_life32));
        javax.crypto.Cipher __sourceSpill1751_34 = local0_life9;
        byte[] local10_life36 = ((javax.crypto.Cipher)(__sourceSpill1751_34)).doFinal(((byte[])(__sourceSpill1751_33)));
        (__sourceSpill1751_30)[__sourceSpill1751_31] = (((((((((((long) (local10_life36)[0]) & 255L) << 56) | ((((long) (local10_life36)[1]) & 255L) << 48)) | ((((long) (local10_life36)[2]) & 255L) << 40)) | ((((long) (local10_life36)[3]) & 255L) << 32)) | ((((long) (local10_life36)[4]) & 255L) << 24)) | ((((long) (local10_life36)[5]) & 255L) << 16)) | ((((long) (local10_life36)[6]) & 255L) << 8)) | (((long) (local10_life36)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    local5_life23 = ((java.lang.String)((local4_life21 = "ß\036¦²!p¤½0ä~ügµA"))).length();
    local2_life24 = 0;
    do {
        java.lang.String __sourceSpill1751_38 = local4_life21;
        int __sourceSpill1751_39 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1751_38)).substring(((int)(__sourceSpill1751_39)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1751_43 = local6_life19;
        int __sourceSpill1751_44 = local3_life20;
        local3_life20 += 1;
        long local8_life45 = (((((((((((long) (local7_life42)[0]) & 255L) << 56) | ((((long) (local7_life42)[1]) & 255L) << 48)) | ((((long) (local7_life42)[2]) & 255L) << 40)) | ((((long) (local7_life42)[3]) & 255L) << 32)) | ((((long) (local7_life42)[4]) & 255L) << 24)) | ((((long) (local7_life42)[5]) & 255L) << 16)) | ((((long) (local7_life42)[6]) & 255L) << 8)) | (((long) (local7_life42)[7]) & 255L));
        byte[] __sourceSpill1751_46 = new byte[8];
        (__sourceSpill1751_46)[0] = ((byte) ((int) (local8_life45 >>> 56)));
        (__sourceSpill1751_46)[1] = ((byte) ((int) (local8_life45 >>> 48)));
        (__sourceSpill1751_46)[2] = ((byte) ((int) (local8_life45 >>> 40)));
        (__sourceSpill1751_46)[3] = ((byte) ((int) (local8_life45 >>> 32)));
        (__sourceSpill1751_46)[4] = ((byte) ((int) (local8_life45 >>> 24)));
        (__sourceSpill1751_46)[5] = ((byte) ((int) (local8_life45 >>> 16)));
        (__sourceSpill1751_46)[6] = ((byte) ((int) (local8_life45 >>> 8)));
        (__sourceSpill1751_46)[7] = ((byte) ((int) local8_life45));
        javax.crypto.Cipher __sourceSpill1751_47 = local0_life9;
        byte[] local10_life49 = ((javax.crypto.Cipher)(__sourceSpill1751_47)).doFinal(((byte[])(__sourceSpill1751_46)));
        (__sourceSpill1751_43)[__sourceSpill1751_44] = (((((((((((long) (local10_life49)[0]) & 255L) << 56) | ((((long) (local10_life49)[1]) & 255L) << 48)) | ((((long) (local10_life49)[2]) & 255L) << 40)) | ((((long) (local10_life49)[3]) & 255L) << 32)) | ((((long) (local10_life49)[4]) & 255L) << 24)) | ((((long) (local10_life49)[5]) & 255L) << 16)) | ((((long) (local10_life49)[6]) & 255L) << 8)) | (((long) (local10_life49)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    U = ((long[])(local6_life19));
    V = ((java.lang.Integer[])(new java.lang.Integer[14]));
    Q = ((moom.fy)(moom.fy.a(((java.lang.String)("level")), ((int)(0)), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1751_52(23352, (1700428183712125026L ^ local11_life6)))))));
}


protected void b__sourceReturn_bfedcc9a42(net.minecraft.world.World p0, moom.DT p1) {
int[] spill1466_0;
    long life3_3;
    double life6_8;
    double life8_12;
    int[] life5_13;
    double life10_17;
    int life12_43;
    lexical_join_71: {
    life3_3 = (net.minecraft.block.BlockLiquid.T ^ 71901589317367L);
    spill1466_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life6_8 = ((double) ((moom.DT)(p1)).a());
    life8_12 = ((double) ((moom.DT)(p1)).b());
    life5_13 = spill1466_0;
    life10_17 = ((double) ((moom.DT)(p1)).c());
    ((net.minecraft.world.World)(p0)).a(((double)((life6_8 + 0x1.0p-1d))), ((double)((life8_12 + 0x1.0p-1d))), ((double)((life10_17 + 0x1.0p-1d))), ((java.lang.String)("random.fizz")), ((float)(0x1.0p-1f)), ((float)((0x1.4cccccp1f + ((((java.util.Random)(((net.minecraft.world.World)(p0)).u)).nextFloat() - ((java.util.Random)(((net.minecraft.world.World)(p0)).u)).nextFloat()) * 0x1.99999ap-1f)))));
    life12_43 = 0;
    lexical_cycle_44: while (true) {
    if (!((life12_43 < __sourceIntrinsic_6d923203f1ab_invokedynamic1466_10(29328, (529629852082698342L ^ life3_3))))) {
        break lexical_join_71;
    }
    ((net.minecraft.world.World)(p0)).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.SMOKE_LARGE)), ((double)((life6_8 + java.lang.Math.random()))), ((double)((life8_12 + 0x1.3333333333333p0d))), ((double)((life10_17 + java.lang.Math.random()))), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((int[])(new int[0])));
    life12_43 += 1;
    if (!((life5_13 == null))) { continue lexical_cycle_44; }
    break lexical_cycle_44;
    }
    }
    return;
}


public void b__Void(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
((net.minecraft.block.BlockLiquid)(this)).a__Boolean(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)));
    return;
}


public boolean b__sourceReturn_b38f36a0de(net.minecraft.world.IBlockAccess p0, moom.DT p1) {
int lexicalValue1465_46_0;
    int lexicalValue1465_54_0;
    int[] spill1465_0;
    int spill1465_1;
    boolean spill1465_2;
    long life3_3;
    int life6_6;
    int[] life5_7;
    int life7_14;
    net.minecraft.block.state.IBlockState life8_25;
    net.minecraft.block.Block life9_28;
    moom.fn life10_31;
    lexical_join_54: {
    lexical_join_53: {
    life3_3 = (net.minecraft.block.BlockLiquid.T ^ 37378255053398L);
    spill1465_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life6_6 = -1;
    life5_7 = spill1465_0;
    lexical_cycle_8: while (true) {
    lexical_join_51: {
    lexical_join_50: {
    if (!((life6_6 <= 1))) {
        break lexical_join_53;
    }
    spill1465_1 = -1;
    if (!((life5_7 != null))) {
        lexicalValue1465_54_0 = spill1465_1;
        break lexical_join_54;
    }
    life7_14 = spill1465_1;
    lexical_cycle_15: while (true) {
    lexical_join_48: {
    lexical_join_47: {
    lexical_join_46: {
    if (!((life7_14 <= 1))) {
        break lexical_join_50;
    }
    life8_25 = ((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).a(((int)(life6_6)), ((int)(0)), ((int)(life7_14))))));
    life9_28 = ((net.minecraft.block.state.IBlockState)(life8_25)).a__ch();
    life10_31 = ((net.minecraft.block.Block)(life9_28)).a__fn();
    if (!((life5_7 != null))) {
        break lexical_join_51;
    }
    if (!((life5_7 != null))) {
        break lexical_join_48;
    }
    if (!((life10_31 != ((net.minecraft.block.BlockLiquid)(this)).J))) {
        break lexical_join_47;
    }
    spill1465_2 = ((net.minecraft.block.Block)(life9_28)).a__Boolean();
    if (!((life5_7 != null))) {
        lexicalValue1465_46_0 = ((spill1465_2) ? 1 : 0);
        break lexical_join_46;
    }
    if (!((!spill1465_2))) {
        break lexical_join_47;
    }
    lexicalValue1465_46_0 = 1;
    }
    return ((lexicalValue1465_46_0) != 0);
    }
    life7_14 += 1;
    }
    if (!((life5_7 == null))) { continue lexical_cycle_15; }
    break lexical_cycle_15;
    }
    }
    life6_6 += 1;
    }
    if (!((life5_7 == null))) { continue lexical_cycle_8; }
    break lexical_cycle_8;
    }
    }
    lexicalValue1465_54_0 = 0;
    }
    return ((lexicalValue1465_54_0) != 0);
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral10002_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/dL"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.block.BlockLiquid.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 8203;
      if (V[var3] == null) {
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
         long var5 = U[var3];
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
         Object[] var9 = (Object[])W.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               W.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/dL", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         V[var3] = var15;
      }

      return V[var3];
}


public int b(net.minecraft.block.state.IBlockState p0) {
return ((java.lang.Integer)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockLiquid.Q))))))).intValue();
}


public net.minecraft.block.state.IBlockState b__fE(int p0) {
return ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.BlockLiquid)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockLiquid.Q)), ((java.lang.Comparable)(java.lang.Integer.valueOf(((int)(p0))))));
}


public boolean b(net.minecraft.world.IBlockAccess p0, moom.DT p1, moom.bs p2) {
int forwardValue4700_31_0;
    int forwardValue4700_33_0;
    int[] spill4700_0;
    boolean spill4700_1;
    long life4_3;
    moom.fn life7_10;
    int[] life6_11;
    forward_join_33: {
    forward_join_32: {
    forward_join_31: {
    forward_join_30: {
    life4_3 = (net.minecraft.block.BlockLiquid.T ^ 73522791196008L);
    spill4700_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life7_10 = ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(p1))))).a__ch())).a__fn();
    life6_11 = spill4700_0;
    if (!((life7_10 != ((net.minecraft.block.BlockLiquid)(this)).J))) {
        break forward_join_32;
    }
    if (!((p2 != moom.bs.UP))) {
        break forward_join_30;
    }
    if (!((life7_10 != moom.fn.w))) {
        break forward_join_32;
    }
    spill4700_1 = super.b(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(p1)), ((moom.bs)(p2)));
    if (!((life6_11 != null))) {
        forwardValue4700_31_0 = ((spill4700_1) ? 1 : 0);
        break forward_join_31;
    }
    if (!(spill4700_1)) {
        break forward_join_32;
    }
    }
    forwardValue4700_31_0 = 1;
    }
    forwardValue4700_33_0 = forwardValue4700_31_0;
    break forward_join_33;
    }
    forwardValue4700_33_0 = 0;
    }
    return ((forwardValue4700_33_0) != 0);
}


protected int c(net.minecraft.world.IBlockAccess p0, moom.DT p1) {
net.minecraft.block.state.IBlockState forwardValue4702_19_0;
    int forwardValue4702_25_0;
    net.minecraft.block.state.IBlockState spill4702_0;
    long life3_3;
    int[] life5_5;
    forward_join_25: {
    forward_join_24: {
    forward_join_19: {
    life3_3 = (net.minecraft.block.BlockLiquid.T ^ 19403291953735L);
    life5_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill4702_0 = ((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(p1)));
    if (!((life5_5 != null))) {
        forwardValue4702_19_0 = spill4702_0;
        break forward_join_19;
    }
    if (!((((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(spill4702_0)).a__ch())).a__fn() == ((net.minecraft.block.BlockLiquid)(this)).J))) {
        break forward_join_24;
    }
    forwardValue4702_19_0 = ((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(p1)));
    }
    forwardValue4702_25_0 = ((java.lang.Integer)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(forwardValue4702_19_0)).a(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockLiquid.Q))))))).intValue();
    break forward_join_25;
    }
    forwardValue4702_25_0 = -1;
    }
    return forwardValue4702_25_0;
}


public int c__Int() {
return 1;
}


public void c(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, java.util.Random p3) {
int forwardValue4703_83_0;
    moom.fn forwardValue4703_110_0;
    moom.fn forwardValue4703_110_1;
    moom.fn forwardValue4703_122_0;
    moom.fn forwardValue4703_122_1;
    net.minecraft.block.Block forwardValue4703_128_0;
    int forwardValue4703_196_0;
    int forwardValue4703_225_0;
    int forwardValue4703_234_0;
    net.minecraft.world.World forwardValue4703_239_0;
    moom.DT forwardValue4703_239_1;
    int forwardValue4703_250_0;
    int[] spill4703_0;
    moom.fn spill4703_1;
    moom.fn spill4703_2;
    int spill4703_3;
    int spill4703_4;
    net.minecraft.block.Block spill4703_5;
    boolean spill4703_6;
    int spill4703_7;
    net.minecraft.world.World spill4703_8;
    moom.DT spill4703_9;
    boolean spill4703_10;
    long life5_3;
    double life8_8;
    int[] life7_9;
    double life10_13;
    double life12_17;
    int life14_32;
    double life14_192;
    double life16_197;
    double life18_203;
    moom.fn life14_305;
    double life15_325;
    double life17_329;
    double life19_335;
    forward_join_297: {
    forward_join_286: {
    forward_join_284: {
    forward_join_250: {
    forward_join_239: {
    forward_join_234: {
    forward_join_225: {
    forward_join_218: {
    forward_join_196: {
    forward_join_189: {
    forward_join_128: {
    forward_join_122: {
    forward_join_110: {
    forward_join_107: {
    forward_join_83: {
    forward_join_76: {
    life5_3 = (net.minecraft.block.BlockLiquid.T ^ 42672706384764L);
    spill4703_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life8_8 = ((double) ((moom.DT)(p1)).a());
    life7_9 = spill4703_0;
    life10_13 = ((double) ((moom.DT)(p1)).b());
    life12_17 = ((double) ((moom.DT)(p1)).c());
    spill4703_1 = ((net.minecraft.block.BlockLiquid)(this)).J;
    spill4703_2 = moom.fn.h;
    if (!((life7_9 != null))) {
        forwardValue4703_110_0 = spill4703_1;
        forwardValue4703_110_1 = spill4703_2;
        break forward_join_110;
    }
    if (!((spill4703_1 == spill4703_2))) {
        break forward_join_107;
    }
    life14_32 = ((java.lang.Integer)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockLiquid.Q))))))).intValue();
    spill4703_3 = life14_32;
    if (!((life7_9 != null))) {
        forwardValue4703_83_0 = spill4703_3;
        break forward_join_83;
    }
    if (!((spill4703_3 > 0))) {
        break forward_join_76;
    }
    spill4703_4 = life14_32;
    if (!((life7_9 != null))) {
        forwardValue4703_83_0 = spill4703_4;
        break forward_join_83;
    }
    if (!((spill4703_4 < __sourceIntrinsic_79fa39d0e3aa_invokedynamic4703_11(29328, (529727248537038317L ^ life5_3))))) {
        break forward_join_76;
    }
    if (!((((java.util.Random)(p3)).nextInt(((int)(__sourceIntrinsic_79fa39d0e3aa_invokedynamic4703_12(29645, (2852795781865188533L ^ life5_3))))) == 0))) {
        break forward_join_107;
    }
    ((net.minecraft.world.World)(p0)).a(((double)((life8_8 + 0x1.0p-1d))), ((double)((life10_13 + 0x1.0p-1d))), ((double)((life12_17 + 0x1.0p-1d))), ((java.lang.String)("liquid.water")), ((float)(((((java.util.Random)(p3)).nextFloat() * 0x1.0p-2f) + 0x1.8p-1f))), ((float)((((java.util.Random)(p3)).nextFloat() + 0x1.0p-1f))), ((boolean)(false)));
    if (!((life7_9 == null))) {
        break forward_join_107;
    }
    }
    forwardValue4703_83_0 = ((java.util.Random)(p3)).nextInt(((int)(__sourceIntrinsic_79fa39d0e3aa_invokedynamic4703_17(11205, (1796592693504767161L ^ life5_3)))));
    }
    if (!((forwardValue4703_83_0 == 0))) {
        break forward_join_107;
    }
    ((net.minecraft.world.World)(p0)).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.SUSPENDED)), ((double)((life8_8 + ((double) ((java.util.Random)(p3)).nextFloat())))), ((double)((life10_13 + ((double) ((java.util.Random)(p3)).nextFloat())))), ((double)((life12_17 + ((double) ((java.util.Random)(p3)).nextFloat())))), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((int[])(new int[0])));
    }
    forwardValue4703_110_0 = ((net.minecraft.block.BlockLiquid)(this)).J;
    forwardValue4703_110_1 = moom.fn.i;
    }
    if (!((life7_9 != null))) {
        forwardValue4703_122_0 = forwardValue4703_110_0;
        forwardValue4703_122_1 = forwardValue4703_110_1;
        break forward_join_122;
    }
    if (!((forwardValue4703_110_0 == forwardValue4703_110_1))) {
        break forward_join_218;
    }
    spill4703_5 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).a__DT()))))).a__ch();
    if (!((life7_9 != null))) {
        forwardValue4703_128_0 = spill4703_5;
        break forward_join_128;
    }
    forwardValue4703_122_0 = ((net.minecraft.block.Block)(spill4703_5)).a__fn();
    forwardValue4703_122_1 = moom.fn.a;
    }
    if (!((forwardValue4703_122_0 == forwardValue4703_122_1))) {
        break forward_join_218;
    }
    forwardValue4703_128_0 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).a__DT()))))).a__ch();
    }
    spill4703_6 = ((net.minecraft.block.Block)(forwardValue4703_128_0)).j();
    if (!((life7_9 != null))) {
        forwardValue4703_225_0 = ((spill4703_6) ? 1 : 0);
        break forward_join_225;
    }
    if (!((!spill4703_6))) {
        break forward_join_218;
    }
    spill4703_7 = ((java.util.Random)(p3)).nextInt(((int)(__sourceIntrinsic_79fa39d0e3aa_invokedynamic4703_36(18134, (7577447891547855276L ^ life5_3)))));
    if (!((life7_9 != null))) {
        forwardValue4703_196_0 = spill4703_7;
        break forward_join_196;
    }
    if (!((spill4703_7 == 0))) {
        break forward_join_189;
    }
    life14_192 = (life8_8 + ((double) ((java.util.Random)(p3)).nextFloat()));
    life16_197 = (life10_13 + ((net.minecraft.block.BlockLiquid)(this)).F);
    life18_203 = (life12_17 + ((double) ((java.util.Random)(p3)).nextFloat()));
    ((net.minecraft.world.World)(p0)).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.LAVA)), ((double)(life14_192)), ((double)(life16_197)), ((double)(life18_203)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((int[])(new int[0])));
    ((net.minecraft.world.World)(p0)).a(((double)(life14_192)), ((double)(life16_197)), ((double)(life18_203)), ((java.lang.String)("liquid.lavapop")), ((float)((0x1.99999ap-3f + (((java.util.Random)(p3)).nextFloat() * 0x1.99999ap-3f)))), ((float)((0x1.ccccccp-1f + (((java.util.Random)(p3)).nextFloat() * 0x1.333334p-3f)))), ((boolean)(false)));
    }
    forwardValue4703_196_0 = ((java.util.Random)(p3)).nextInt(((int)(__sourceIntrinsic_79fa39d0e3aa_invokedynamic4703_46(12274, (592553197914157193L ^ life5_3)))));
    }
    if (!((life7_9 != null))) {
        forwardValue4703_225_0 = forwardValue4703_196_0;
        break forward_join_225;
    }
    if (!((forwardValue4703_196_0 == 0))) {
        break forward_join_218;
    }
    ((net.minecraft.world.World)(p0)).a(((double)(life8_8)), ((double)(life10_13)), ((double)(life12_17)), ((java.lang.String)("liquid.lava")), ((float)((0x1.99999ap-3f + (((java.util.Random)(p3)).nextFloat() * 0x1.99999ap-3f)))), ((float)((0x1.ccccccp-1f + (((java.util.Random)(p3)).nextFloat() * 0x1.333334p-3f)))), ((boolean)(false)));
    }
    forwardValue4703_225_0 = ((java.util.Random)(p3)).nextInt(((int)(__sourceIntrinsic_79fa39d0e3aa_invokedynamic4703_51(11205, (1796592693504767161L ^ life5_3)))));
    }
    if (!((life7_9 != null))) {
        forwardValue4703_234_0 = forwardValue4703_225_0;
        break forward_join_234;
    }
    if (!((forwardValue4703_225_0 == 0))) {
        break forward_join_297;
    }
    spill4703_8 = p0;
    spill4703_9 = ((moom.DT)(p1)).b__DT();
    if (!((life7_9 != null))) {
        forwardValue4703_239_0 = spill4703_8;
        forwardValue4703_239_1 = spill4703_9;
        break forward_join_239;
    }
    forwardValue4703_234_0 = ((net.minecraft.world.World.a(((net.minecraft.world.IBlockAccess)(spill4703_8)), ((moom.DT)(spill4703_9)))) ? 1 : 0);
    }
    if (!((forwardValue4703_234_0 != 0))) {
        break forward_join_297;
    }
    forwardValue4703_239_0 = p0;
    forwardValue4703_239_1 = ((moom.DT)(p1)).b(((int)(2)));
    }
    life14_305 = ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(forwardValue4703_239_0)).a__fE(((moom.DT)(forwardValue4703_239_1))))).a__ch())).a__fn();
    spill4703_10 = ((moom.fn)(life14_305)).d__Boolean();
    if (!((life7_9 != null))) {
        forwardValue4703_250_0 = ((spill4703_10) ? 1 : 0);
        break forward_join_250;
    }
    if (!((!spill4703_10))) {
        break forward_join_297;
    }
    forwardValue4703_250_0 = ((((moom.fn)(life14_305)).a__Boolean()) ? 1 : 0);
    }
    if (!((forwardValue4703_250_0 == 0))) {
        break forward_join_297;
    }
    life15_325 = (life8_8 + ((double) ((java.util.Random)(p3)).nextFloat()));
    life17_329 = (life10_13 - 0x1.0cccccccccccdp0d);
    life19_335 = (life12_17 + ((double) ((java.util.Random)(p3)).nextFloat()));
    if (!((life7_9 != null))) {
        break forward_join_284;
    }
    if (!((((net.minecraft.block.BlockLiquid)(this)).J == moom.fn.h))) {
        break forward_join_286;
    }
    ((net.minecraft.world.World)(p0)).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.DRIP_WATER)), ((double)(life15_325)), ((double)(life17_329)), ((double)(life19_335)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((int[])(new int[0])));
    }
    if (!((life7_9 == null))) {
        break forward_join_297;
    }
    }
    ((net.minecraft.world.World)(p0)).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.DRIP_LAVA)), ((double)(life15_325)), ((double)(life17_329)), ((double)(life19_335)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((int[])(new int[0])));
    }
    return;
}


protected int d(net.minecraft.world.IBlockAccess p0, moom.DT p1) {
int forwardValue4704_21_0;
    int forwardValue4704_23_0;
    int[] spill4704_0;
    int spill4704_1;
    long life3_3;
    int life6_9;
    int[] life5_10;
    forward_join_23: {
    forward_join_22: {
    forward_join_21: {
    life3_3 = (net.minecraft.block.BlockLiquid.T ^ 26585663605821L);
    spill4704_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life6_9 = ((net.minecraft.block.BlockLiquid)(this)).c(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(p1)));
    life5_10 = spill4704_0;
    spill4704_1 = life6_9;
    if (!((life5_10 != null))) {
        forwardValue4704_21_0 = spill4704_1;
        break forward_join_21;
    }
    if (!((spill4704_1 >= __sourceIntrinsic_24e56a92b006_invokedynamic4704_3(29328, (529672968967377580L ^ life3_3))))) {
        break forward_join_22;
    }
    forwardValue4704_21_0 = 0;
    }
    forwardValue4704_23_0 = forwardValue4704_21_0;
    break forward_join_23;
    }
    forwardValue4704_23_0 = life6_9;
    }
    return forwardValue4704_23_0;
}


protected moom.fA a__fA() {
return new moom.fA(this, new net.minecraft.block.properties.IProperty[] {net.minecraft.block.BlockLiquid.Q});
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.block.Block p3) {
((net.minecraft.block.BlockLiquid)(this)).a__Boolean(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)));
    return;
}


public boolean a__Boolean(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
java.lang.Comparable lexicalValue1463_56_0;
    int lexicalValue1463_77_0;
    int lexicalValue1463_94_0;
    moom.bs spill1463_0;
    int spill1463_1;
    int spill1463_2;
    long life4_3;
    int[] life6_5;
    int life7_11;
    moom.bs[] life8_13;
    int life9_16;
    int life10_18;
    moom.bs life11_25;
    java.lang.Integer life8_75;
    lexical_join_94: {
    lexical_join_93: {
    lexical_join_77: {
    lexical_join_75: {
    lexical_join_56: {
    lexical_join_49: {
    life4_3 = (net.minecraft.block.BlockLiquid.T ^ 44642826077698L);
    life6_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    if (!((((net.minecraft.block.BlockLiquid)(this)).J == moom.fn.i))) {
        break lexical_join_93;
    }
    life7_11 = 0;
    life8_13 = moom.bs.values();
    life9_16 = (life8_13).length;
    life10_18 = 0;
    lexical_cycle_19: while (true) {
    lexical_join_47: {
    lexical_join_46: {
    if (!((life10_18 < life9_16))) {
        break lexical_join_49;
    }
    life11_25 = (life8_13)[life10_18];
    if (!((life6_5 != null))) {
        break lexical_join_47;
    }
    spill1463_0 = life11_25;
    if (!((life6_5 != null))) {
        lexicalValue1463_56_0 = spill1463_0;
        break lexical_join_56;
    }
    if (!((spill1463_0 != moom.bs.DOWN))) {
        break lexical_join_46;
    }
    if (!((((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).a(((moom.bs)(life11_25)))))))).a__ch())).a__fn() == moom.fn.h))) {
        break lexical_join_46;
    }
    life7_11 = 1;
    if (!((life6_5 == null))) {
        break lexical_join_49;
    }
    }
    life10_18 += 1;
    }
    if (!((life6_5 == null))) { continue lexical_cycle_19; }
    break lexical_cycle_19;
    }
    }
    spill1463_1 = life7_11;
    if (!((life6_5 != null))) {
        lexicalValue1463_94_0 = spill1463_1;
        break lexical_join_94;
    }
    if (!((spill1463_1 != 0))) {
        break lexical_join_93;
    }
    lexicalValue1463_56_0 = ((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockLiquid.Q)));
    }
    life8_75 = ((java.lang.Integer)(lexicalValue1463_56_0));
    spill1463_2 = ((java.lang.Integer)(life8_75)).intValue();
    if (!((life6_5 != null))) {
        lexicalValue1463_77_0 = spill1463_2;
        break lexical_join_77;
    }
    if (!((spill1463_2 == 0))) {
        break lexical_join_75;
    }
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.Z)).a__fE())));
    ((net.minecraft.block.BlockLiquid)(this)).b__sourceReturn_bfedcc9a42(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)));
    return ((1) != 0);
    }
    lexicalValue1463_77_0 = ((java.lang.Integer)(life8_75)).intValue();
    }
    if (!((life6_5 != null))) {
        lexicalValue1463_94_0 = lexicalValue1463_77_0;
        break lexical_join_94;
    }
    if (!((lexicalValue1463_77_0 <= 4))) {
        break lexical_join_93;
    }
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())));
    ((net.minecraft.block.BlockLiquid)(this)).b__sourceReturn_bfedcc9a42(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)));
    return ((1) != 0);
    }
    lexicalValue1463_94_0 = 0;
    }
    return ((lexicalValue1463_94_0) != 0);
}


public boolean a__Boolean(net.minecraft.world.IBlockAccess p0, moom.DT p1) {
long local3 = (net.minecraft.block.BlockLiquid.T ^ 42952078232659L);
    return ((((((net.minecraft.block.BlockLiquid)(this)).J != moom.fn.i) ? 1 : 0)) != 0);
}


public int a(net.minecraft.world.IBlockAccess p0, moom.DT p1, int p2) {
long local4 = (net.minecraft.block.BlockLiquid.T ^ 15481282566485L);
    return ((((net.minecraft.block.BlockLiquid)(this)).J == moom.fn.h) ? moom.EO.c(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(p1))) : __sourceIntrinsic_cdd8da66b4ba_invokedynamic10008_4(3970, (7216215179879922396L ^ local4)));
}


private static java.lang.IllegalArgumentException a(java.lang.IllegalArgumentException p0) {
return p0;
}


public static float a__sourceReturn_d4116ae163(int p0) {
int forwardValue4690_19_0;
    int forwardValue4690_19_1;
    int spill4690_0;
    int spill4690_1;
    long life1_3;
    int[] life3_5;
    forward_join_19: {
    forward_join_17: {
    life1_3 = (net.minecraft.block.BlockLiquid.T ^ 114566968225082L);
    life3_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill4690_0 = p0;
    spill4690_1 = __sourceIntrinsic_687ebe585bc8_invokedynamic4690_2(29328, (529655491699536811L ^ life1_3));
    if (!((life3_5 != null))) {
        forwardValue4690_19_0 = spill4690_0;
        forwardValue4690_19_1 = spill4690_1;
        break forward_join_19;
    }
    if (!((spill4690_0 >= spill4690_1))) {
        break forward_join_17;
    }
    p0 = 0;
    }
    forwardValue4690_19_0 = p0;
    forwardValue4690_19_1 = 1;
    }
    return (((float) (forwardValue4690_19_0 + forwardValue4690_19_1)) / 0x1.2p3f);
}


public static moom.dN a__dN(moom.fn p0) {
moom.fn forwardValue4698_15_0;
    moom.fn forwardValue4698_15_1;
    moom.fn spill4698_0;
    moom.fn spill4698_1;
    long life1_3;
    int[] life3_5;
    forward_join_18: {
    forward_join_15: {
    forward_join_13: {
    life1_3 = (net.minecraft.block.BlockLiquid.T ^ 94972691534161L);
    life3_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill4698_0 = p0;
    spill4698_1 = moom.fn.h;
    if (!((life3_5 != null))) {
        forwardValue4698_15_0 = spill4698_0;
        forwardValue4698_15_1 = spill4698_1;
        break forward_join_15;
    }
    if (!((spill4698_0 == spill4698_1))) {
        break forward_join_13;
    }
    return net.minecraft.init.Blocks.j;
    }
    forwardValue4698_15_0 = p0;
    forwardValue4698_15_1 = moom.fn.i;
    }
    if (!((forwardValue4698_15_0 == forwardValue4698_15_1))) {
        break forward_join_18;
    }
    return net.minecraft.init.Blocks.l;
    }
    throw new java.lang.IllegalArgumentException("Invalid material");
}


public static moom.dM a(moom.fn p0) {
moom.fn forwardValue4691_15_0;
    moom.fn forwardValue4691_15_1;
    moom.fn spill4691_0;
    moom.fn spill4691_1;
    long life1_3;
    int[] life3_5;
    forward_join_18: {
    forward_join_15: {
    forward_join_13: {
    life1_3 = (net.minecraft.block.BlockLiquid.T ^ 95182934776522L);
    life3_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill4691_0 = p0;
    spill4691_1 = moom.fn.h;
    if (!((life3_5 != null))) {
        forwardValue4691_15_0 = spill4691_0;
        forwardValue4691_15_1 = spill4691_1;
        break forward_join_15;
    }
    if (!((spill4691_0 == spill4691_1))) {
        break forward_join_13;
    }
    return net.minecraft.init.Blocks.i;
    }
    forwardValue4691_15_0 = p0;
    forwardValue4691_15_1 = moom.fn.i;
    }
    if (!((forwardValue4691_15_0 == forwardValue4691_15_1))) {
        break forward_join_18;
    }
    return net.minecraft.init.Blocks.k;
    }
    throw new java.lang.IllegalArgumentException("Invalid material");
}


public moom.DR a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.entity.Entity p2, moom.DR p3) {
return ((moom.DR)(p3)).d(((moom.DR)(((net.minecraft.block.BlockLiquid)(this)).a__DR(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(p1))))));
}


protected moom.DR a__DR(net.minecraft.world.IBlockAccess p0, moom.DT p1) {
int lexicalValue1464_59_0;
    int lexicalValue1464_71_0;
    int lexicalValue1464_102_0;
    int lexicalValue1464_108_0;
    int lexicalValue1464_145_0;
    int[] spill1464_0;
    int spill1464_1;
    boolean spill1464_2;
    long life3_3;
    moom.DR life6_11;
    int[] life5_12;
    int life7_17;
    java.util.Iterator life8_20;
    moom.bs life9_27;
    moom.DT life10_31;
    int life11_36;
    int life12_89;
    int life12_135;
    java.util.Iterator life8_180;
    moom.bs life9_187;
    moom.DT life10_191;
    lexical_join_191: {
    lexical_join_145: {
    lexical_join_138: {
    life3_3 = (net.minecraft.block.BlockLiquid.T ^ 82801290113960L);
    spill1464_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life6_11 = new moom.DR(0x0.0p0d, 0x0.0p0d, 0x0.0p0d);
    life5_12 = spill1464_0;
    life7_17 = ((net.minecraft.block.BlockLiquid)(this)).d(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(p1)));
    life8_20 = ((net.minecraft.util.EnumFacing$Plane)(net.minecraft.util.EnumFacing$Plane.HORIZONTAL)).iterator();
    lexical_cycle_21: while (true) {
    lexical_join_136: {
    lexical_join_108: {
    lexical_join_102: {
    lexical_join_101: {
    lexical_join_71: {
    lexical_join_59: {
    if (!(((java.util.Iterator)(life8_20)).hasNext())) {
        break lexical_join_138;
    }
    life9_27 = ((moom.bs)(((java.util.Iterator)(life8_20)).next()));
    life10_31 = ((moom.DT)(p1)).a(((moom.bs)(life9_27)));
    life11_36 = ((net.minecraft.block.BlockLiquid)(this)).d(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(life10_31)));
    spill1464_1 = life11_36;
    if (!((life5_12 != null))) {
        lexicalValue1464_145_0 = spill1464_1;
        break lexical_join_145;
    }
    if (!((life5_12 != null))) {
        lexicalValue1464_102_0 = spill1464_1;
        break lexical_join_102;
    }
    if (!((spill1464_1 < 0))) {
        break lexical_join_101;
    }
    spill1464_2 = ((moom.fn)(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(life10_31))))).a__ch())).a__fn())).d__Boolean();
    if (!((life5_12 != null))) {
        lexicalValue1464_59_0 = ((spill1464_2) ? 1 : 0);
        break lexical_join_59;
    }
    if (!((!spill1464_2))) {
        break lexical_join_136;
    }
    life11_36 = ((net.minecraft.block.BlockLiquid)(this)).d(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(((moom.DT)(life10_31)).b__DT())));
    lexicalValue1464_59_0 = life11_36;
    }
    if (!((life5_12 != null))) {
        lexicalValue1464_71_0 = lexicalValue1464_59_0;
        break lexical_join_71;
    }
    if (!((lexicalValue1464_59_0 >= 0))) {
        break lexical_join_136;
    }
    lexicalValue1464_71_0 = (life11_36 - (life7_17 - __sourceIntrinsic_becf66df4199_invokedynamic1464_17(10208, (8161866022332823617L ^ life3_3))));
    }
    life12_89 = lexicalValue1464_71_0;
    life6_11 = ((moom.DR)(life6_11)).b(((double)(((double) ((((moom.DT)(life10_31)).a() - ((moom.DT)(p1)).a()) * life12_89)))), ((double)(((double) ((((moom.DT)(life10_31)).b() - ((moom.DT)(p1)).b()) * life12_89)))), ((double)(((double) ((((moom.DT)(life10_31)).c() - ((moom.DT)(p1)).c()) * life12_89)))));
    if (!((life5_12 == null))) {
        break lexical_join_136;
    }
    }
    lexicalValue1464_102_0 = life11_36;
    }
    if (!((life5_12 != null))) {
        lexicalValue1464_108_0 = lexicalValue1464_102_0;
        break lexical_join_108;
    }
    if (!((lexicalValue1464_102_0 >= 0))) {
        break lexical_join_136;
    }
    lexicalValue1464_108_0 = (life11_36 - life7_17);
    }
    life12_135 = lexicalValue1464_108_0;
    life6_11 = ((moom.DR)(life6_11)).b(((double)(((double) ((((moom.DT)(life10_31)).a() - ((moom.DT)(p1)).a()) * life12_135)))), ((double)(((double) ((((moom.DT)(life10_31)).b() - ((moom.DT)(p1)).b()) * life12_135)))), ((double)(((double) ((((moom.DT)(life10_31)).c() - ((moom.DT)(p1)).c()) * life12_135)))));
    }
    if (!((life5_12 == null))) { continue lexical_cycle_21; }
    break lexical_cycle_21;
    }
    }
    lexicalValue1464_145_0 = ((java.lang.Integer)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(p1))))).a(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockLiquid.Q))))))).intValue();
    }
    if (!((lexicalValue1464_145_0 >= __sourceIntrinsic_becf66df4199_invokedynamic1464_37(29328, (529618950219083065L ^ life3_3))))) {
        break lexical_join_191;
    }
    life8_180 = ((net.minecraft.util.EnumFacing$Plane)(net.minecraft.util.EnumFacing$Plane.HORIZONTAL)).iterator();
    lexical_cycle_154: while (true) {
    lexical_join_189: {
    lexical_join_187: {
    lexical_join_180: {
    if (!(((java.util.Iterator)(life8_180)).hasNext())) {
        break lexical_join_191;
    }
    life9_187 = ((moom.bs)(((java.util.Iterator)(life8_180)).next()));
    life10_191 = ((moom.DT)(p1)).a(((moom.bs)(life9_187)));
    if (!((life5_12 != null))) {
        break lexical_join_187;
    }
    if (!((!((net.minecraft.block.BlockLiquid)(this)).b(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(life10_191)), ((moom.bs)(life9_187)))))) {
        break lexical_join_180;
    }
    if (!(((net.minecraft.block.BlockLiquid)(this)).b(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(((moom.DT)(life10_191)).a__DT())), ((moom.bs)(life9_187))))) {
        break lexical_join_189;
    }
    }
    life6_11 = ((moom.DR)(((moom.DR)(life6_11)).a__DR())).b(((double)(0x0.0p0d)), ((double)(-0x1.8p2d)), ((double)(0x0.0p0d)));
    }
    if (!((life5_12 == null))) {
        break lexical_join_191;
    }
    }
    if (!((life5_12 == null))) { continue lexical_cycle_154; }
    break lexical_cycle_154;
    }
    }
    return ((moom.DR)(life6_11)).a__DR();
}


public int a(java.util.Random p0) {
return 0;
}


public net.minecraft.item.Item a(net.minecraft.block.state.IBlockState p0, java.util.Random p1, int p2) {
return null;
}


public moom.CA a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
return null;
}


public boolean a__Boolean(net.minecraft.world.IBlockAccess p0, moom.DT p1, moom.bs p2) {
int forwardValue4695_26_0;
    int forwardValue4695_28_0;
    boolean spill4695_0;
    long life4_3;
    int[] life6_5;
    forward_join_28: {
    forward_join_27: {
    forward_join_26: {
    forward_join_25: {
    life4_3 = (net.minecraft.block.BlockLiquid.T ^ 129328734375016L);
    life6_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    if (!((((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(p1))))).a__ch())).a__fn() != ((net.minecraft.block.BlockLiquid)(this)).J))) {
        break forward_join_27;
    }
    if (!((p2 != moom.bs.UP))) {
        break forward_join_25;
    }
    spill4695_0 = super.a__Boolean(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(p1)), ((moom.bs)(p2)));
    if (!((life6_5 != null))) {
        forwardValue4695_26_0 = ((spill4695_0) ? 1 : 0);
        break forward_join_26;
    }
    if (!(spill4695_0)) {
        break forward_join_27;
    }
    }
    forwardValue4695_26_0 = 1;
    }
    forwardValue4695_28_0 = forwardValue4695_26_0;
    break forward_join_28;
    }
    forwardValue4695_28_0 = 0;
    }
    return ((forwardValue4695_28_0) != 0);
}


public static double a(net.minecraft.world.IBlockAccess p0, moom.DT p1, moom.fn p2) {
double forwardValue4693_34_0;
    double forwardValue4693_34_1;
    double forwardValue4693_35_0;
    int[] spill4693_0;
    double spill4693_1;
    double spill4693_2;
    double spill4693_3;
    double spill4693_4;
    long life3_3;
    moom.DR life6_10;
    int[] life5_11;
    forward_join_35: {
    forward_join_34: {
    forward_join_28: {
    life3_3 = (net.minecraft.block.BlockLiquid.T ^ 35215391700631L);
    spill4693_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life6_10 = ((moom.dM)(net.minecraft.block.BlockLiquid.a(((moom.fn)(p2))))).a__DR(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(p1)));
    life5_11 = spill4693_0;
    spill4693_1 = ((moom.DR)(life6_10)).a;
    spill4693_2 = 0x0.0p0d;
    if (!((life5_11 != null))) {
        forwardValue4693_34_0 = spill4693_1;
        forwardValue4693_34_1 = spill4693_2;
        break forward_join_34;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(spill4693_1)), ((double)(spill4693_2))) == 0))) {
        break forward_join_28;
    }
    spill4693_3 = ((moom.DR)(life6_10)).c;
    spill4693_4 = 0x0.0p0d;
    if (!((life5_11 != null))) {
        forwardValue4693_34_0 = spill4693_3;
        forwardValue4693_34_1 = spill4693_4;
        break forward_join_34;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(spill4693_3)), ((double)(spill4693_4))) == 0))) {
        break forward_join_28;
    }
    forwardValue4693_35_0 = -0x1.f4p9d;
    break forward_join_35;
    }
    forwardValue4693_34_0 = moom.Dr.b(((double)(((moom.DR)(life6_10)).c)), ((double)(((moom.DR)(life6_10)).a)));
    forwardValue4693_34_1 = 0x1.921fb54442d18p0d;
    }
    forwardValue4693_35_0 = (forwardValue4693_34_0 - forwardValue4693_34_1);
    }
    return forwardValue4693_35_0;
}


public int a(net.minecraft.world.World p0) {
moom.fn forwardValue4694_17_0;
    moom.fn forwardValue4694_17_1;
    int forwardValue4694_35_0;
    int forwardValue4694_37_0;
    moom.fn spill4694_0;
    moom.fn spill4694_1;
    boolean spill4694_2;
    long life2_3;
    int[] life4_5;
    forward_join_37: {
    forward_join_36: {
    forward_join_35: {
    forward_join_30: {
    forward_join_17: {
    forward_join_14: {
    life2_3 = (net.minecraft.block.BlockLiquid.T ^ 115175609006898L);
    life4_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill4694_0 = ((net.minecraft.block.BlockLiquid)(this)).J;
    spill4694_1 = moom.fn.h;
    if (!((life4_5 != null))) {
        forwardValue4694_17_0 = spill4694_0;
        forwardValue4694_17_1 = spill4694_1;
        break forward_join_17;
    }
    if (!((spill4694_0 == spill4694_1))) {
        break forward_join_14;
    }
    forwardValue4694_37_0 = 5;
    break forward_join_37;
    }
    forwardValue4694_17_0 = ((net.minecraft.block.BlockLiquid)(this)).J;
    forwardValue4694_17_1 = moom.fn.i;
    }
    if (!((forwardValue4694_17_0 == forwardValue4694_17_1))) {
        break forward_join_36;
    }
    spill4694_2 = ((moom.EA)(((net.minecraft.world.World)(p0)).v)).e();
    if (!((life4_5 != null))) {
        forwardValue4694_35_0 = ((spill4694_2) ? 1 : 0);
        break forward_join_35;
    }
    if (!(spill4694_2)) {
        break forward_join_30;
    }
    forwardValue4694_37_0 = __sourceIntrinsic_a3a6e3090437_invokedynamic4694_9(16899, (5713206211661632830L ^ life2_3));
    break forward_join_37;
    }
    forwardValue4694_35_0 = __sourceIntrinsic_a3a6e3090437_invokedynamic4694_10(29874, (7514635940668253069L ^ life2_3));
    }
    forwardValue4694_37_0 = forwardValue4694_35_0;
    break forward_join_37;
    }
    forwardValue4694_37_0 = 0;
    }
    return forwardValue4694_37_0;
}


public net.minecraft.util.EnumWorldBlockLayer a__bx() {
long local1 = (net.minecraft.block.BlockLiquid.T ^ 20516464580144L);
    return ((((net.minecraft.block.BlockLiquid)(this)).J == moom.fn.h) ? net.minecraft.util.EnumWorldBlockLayer.TRANSLUCENT : net.minecraft.util.EnumWorldBlockLayer.SOLID);
}


public int a(net.minecraft.world.IBlockAccess p0, moom.DT p1) {
long local3 = (net.minecraft.block.BlockLiquid.T ^ 1853493904322L);
    int local5 = ((net.minecraft.world.IBlockAccess)(p0)).a(((moom.DT)(p1)), ((int)(0)));
    int local6 = ((net.minecraft.world.IBlockAccess)(p0)).a(((moom.DT)(((moom.DT)(p1)).a__DT())), ((int)(0)));
    int local7 = (local5 & __sourceIntrinsic_8b2fa91b2e4f_originalDynamicSite1756_4(7190, (9091030770339886046L ^ local3)));
    int local8 = (local6 & __sourceIntrinsic_8b2fa91b2e4f_originalDynamicSite1756_5(21494, (4260022405786139708L ^ local3)));
    int local9 = ((local5 >> __sourceIntrinsic_8b2fa91b2e4f_originalDynamicSite1756_6(12676, (2738239702141378120L ^ local3))) & __sourceIntrinsic_8b2fa91b2e4f_originalDynamicSite1756_7(21494, (4260022405786139708L ^ local3)));
    int local10 = ((local6 >> __sourceIntrinsic_8b2fa91b2e4f_originalDynamicSite1756_8(5714, (6725767643735832988L ^ local3))) & __sourceIntrinsic_8b2fa91b2e4f_originalDynamicSite1756_9(21494, (4260022405786139708L ^ local3)));
    return (java.lang.Math.max(((int)(local7)), ((int)(local8))) | (java.lang.Math.max(((int)(local9)), ((int)(local10))) << __sourceIntrinsic_8b2fa91b2e4f_originalDynamicSite1756_12(5714, (6725767643735832988L ^ local3))));
}


public boolean a(net.minecraft.block.state.IBlockState p0, boolean p1) {
int forwardValue4692_15_0;
    int forwardValue4692_19_0;
    int forwardValue4692_21_0;
    boolean spill4692_0;
    long life3_3;
    int[] life5_5;
    forward_join_21: {
    forward_join_20: {
    forward_join_19: {
    forward_join_15: {
    life3_3 = (net.minecraft.block.BlockLiquid.T ^ 120081332630274L);
    life5_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill4692_0 = p1;
    if (!((life5_5 != null))) {
        forwardValue4692_15_0 = ((spill4692_0) ? 1 : 0);
        break forward_join_15;
    }
    if (!(spill4692_0)) {
        break forward_join_20;
    }
    forwardValue4692_15_0 = ((java.lang.Integer)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockLiquid.Q))))))).intValue();
    }
    if (!((life5_5 != null))) {
        forwardValue4692_19_0 = forwardValue4692_15_0;
        break forward_join_19;
    }
    if (!((forwardValue4692_15_0 == 0))) {
        break forward_join_20;
    }
    forwardValue4692_19_0 = 1;
    }
    forwardValue4692_21_0 = forwardValue4692_19_0;
    break forward_join_21;
    }
    forwardValue4692_21_0 = 0;
    }
    return ((forwardValue4692_21_0) != 0);
}


public boolean g() {
return ((0) != 0);
}


public boolean j() {
return ((0) != 0);
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1751_52(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6d923203f1ab_invokedynamic1466_10(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral10002_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_79fa39d0e3aa_invokedynamic4703_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_79fa39d0e3aa_invokedynamic4703_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_79fa39d0e3aa_invokedynamic4703_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_79fa39d0e3aa_invokedynamic4703_36(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_79fa39d0e3aa_invokedynamic4703_46(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_79fa39d0e3aa_invokedynamic4703_51(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_24e56a92b006_invokedynamic4704_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_cdd8da66b4ba_invokedynamic10008_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_687ebe585bc8_invokedynamic4690_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_becf66df4199_invokedynamic1464_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_becf66df4199_invokedynamic1464_37(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a3a6e3090437_invokedynamic4694_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a3a6e3090437_invokedynamic4694_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8b2fa91b2e4f_originalDynamicSite1756_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8b2fa91b2e4f_originalDynamicSite1756_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8b2fa91b2e4f_originalDynamicSite1756_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8b2fa91b2e4f_originalDynamicSite1756_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8b2fa91b2e4f_originalDynamicSite1756_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8b2fa91b2e4f_originalDynamicSite1756_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8b2fa91b2e4f_originalDynamicSite1756_12(int a0, long a1) throws E;
}
