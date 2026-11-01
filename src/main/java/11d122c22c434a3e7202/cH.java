package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class cH extends moom.cu implements net.minecraft.block.IGrowable {

public static final moom.fy R;

public static final moom.fx S;

private final net.minecraft.block.Block T;

private static final long V;

private static final long[] W;

private static final java.lang.Integer[] X;

private static final java.util.Map Y;

protected cH(net.minecraft.block.Block p0) {
super();
    ((moom.cH)(this)).a__Void(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((moom.fA)(this.M)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.cH.R)), ((java.lang.Comparable)(java.lang.Integer.valueOf(((int)(0)))))))).a__fE(((net.minecraft.block.properties.IProperty)(moom.cH.S)), ((java.lang.Comparable)(moom.bs.UP))))));
    this.T = ((net.minecraft.block.Block)(p0));
    ((moom.cH)(this)).a(((boolean)(true)));
    float local2 = 0x1.0p-3f;
    ((moom.cH)(this)).a(((float)((0x1.0p-1f - local2))), ((float)(0x0.0p0f)), ((float)((0x1.0p-1f - local2))), ((float)((0x1.0p-1f + local2))), ((float)(0x1.0p-2f)), ((float)((0x1.0p-1f + local2))));
    ((moom.cH)(this)).a(((net.minecraft.creativetab.CreativeTabs)(null)));
    return;
}


static {
javax.crypto.Cipher forestValue436_36_0;
    int forestValue436_36_1;
    javax.crypto.SecretKeyFactory forestValue436_36_2;
    byte[] forestValue436_36_3;
    javax.crypto.Cipher forestValue436_53_0;
    int forestValue436_53_1;
    javax.crypto.SecretKeyFactory forestValue436_53_2;
    byte[] forestValue436_53_3;
    long[] forestValue436_157_0;
    int forestValue436_157_1;
    long forestValue436_157_2;
    int forestValue436_157_3;
    long[] forestValue436_300_0;
    int forestValue436_300_1;
    long forestValue436_300_2;
    long[] forestValue436_312_0;
    int forestValue436_312_1;
    long forestValue436_312_2;
    javax.crypto.Cipher spill436_0;
    int spill436_1;
    javax.crypto.SecretKeyFactory spill436_2;
    byte[] spill436_3;
    byte[] spill436_4;
    java.lang.String spill436_5;
    int spill436_6;
    int spill436_7;
    long spill436_8;
    byte[] spill436_9;
    byte[] spill436_10;
    byte[] spill436_11;
    byte[] spill436_12;
    byte[] spill436_13;
    byte[] spill436_14;
    byte[] spill436_15;
    byte[] spill436_16;
    long spill436_17;
    int spill436_18;
    java.lang.String spill436_19;
    int spill436_20;
    long[] spill436_21;
    int spill436_22;
    long spill436_23;
    int spill436_24;
    long life11_11;
    javax.crypto.Cipher life0_20;
    int life1_35;
    long[] life6_66;
    int life3_68;
    java.lang.String life4_71;
    int life5_73;
    int life2_75;
    byte[] life7_83;
    long life8_160;
    byte[] life10_228;
    byte[] life7_325;
    forest_join_399: {
    forest_join_53: {
    V = ((long)(((moom._a)(moom._c.a(((long)(9167610344905181191L)), ((long)(-2422433820060713567L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(203493979235337L)))));
    life11_11 = (moom.cH.V ^ 128574312026839L);
    Y = ((java.util.Map)(new java.util.HashMap(13)));
    spill436_0 = (life0_20 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    spill436_1 = 2;
    spill436_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp436_9_0 = new byte[8];
    spill436_3 = __stackOp436_9_0;
    (__stackOp436_9_0)[0] = ((byte) ((int) (life11_11 >>> 56)));
    life1_35 = 1;
    forestValue436_36_0 = spill436_0;
    forestValue436_36_1 = spill436_1;
    forestValue436_36_2 = spill436_2;
    forestValue436_36_3 = spill436_3;
    forest_cycle_36: while (true) {
    if (!((life1_35 < 8))) {
        forestValue436_53_0 = forestValue436_36_0;
        forestValue436_53_1 = forestValue436_36_1;
        forestValue436_53_2 = forestValue436_36_2;
        forestValue436_53_3 = forestValue436_36_3;
        break forest_join_53;
    }
    byte[] __stackOp436_10_0 = forestValue436_36_3;
    spill436_4 = __stackOp436_10_0;
    (__stackOp436_10_0)[life1_35] = ((byte) ((int) ((life11_11 << (life1_35 * 8)) >>> 56)));
    life1_35 += 1;
    forestValue436_36_3 = spill436_4;
    continue forest_cycle_36;
    }
    }
    ((javax.crypto.Cipher)(forestValue436_53_0)).init(((int)(forestValue436_53_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue436_53_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue436_53_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    life6_66 = new long[9];
    life3_68 = 0;
    life5_73 = ((java.lang.String)((life4_71 = "ÐI\001Â¤ª`)åkZ\013\006&_\004µãåø\020ùB\003è°\tõÜþ·UrÉ¡wD½]Z9z]ªÉö¡"))).length();
    life2_75 = 0;
    forest_cycle_76: while (true) {
    spill436_5 = life4_71;
    spill436_6 = life2_75;
    life2_75 += 8;
    life7_83 = ((java.lang.String)(((java.lang.String)(spill436_5)).substring(((int)(spill436_6)), ((int)(life2_75))))).getBytes(((java.lang.String)("ISO-8859-1")));
    forestValue436_157_0 = life6_66;
    forestValue436_157_1 = (life3_68++);
    forestValue436_157_2 = (((((((((((long) (life7_83)[0]) & 255L) << 56) | ((((long) (life7_83)[1]) & 255L) << 48)) | ((((long) (life7_83)[2]) & 255L) << 40)) | ((((long) (life7_83)[3]) & 255L) << 32)) | ((((long) (life7_83)[4]) & 255L) << 24)) | ((((long) (life7_83)[5]) & 255L) << 16)) | ((((long) (life7_83)[6]) & 255L) << 8)) | (((long) (life7_83)[7]) & 255L));
    forestValue436_157_3 = -1;
    forest_cycle_157: while (true) {
    forest_join_317: {
    forest_join_312: {
    forest_join_300: {
    long __stackOp436_16_0 = forestValue436_157_2;
    int __stackOp436_16_1 = forestValue436_157_3;
    spill436_7 = __stackOp436_16_1;
    spill436_8 = __stackOp436_16_0;
    recovery.source.CarrierOps.discard(__stackOp436_16_1);
    life8_160 = spill436_8;
    byte[] __stackOp436_18_0 = new byte[8];
    spill436_9 = __stackOp436_18_0;
    (__stackOp436_18_0)[0] = ((byte) ((int) (life8_160 >>> 56)));
    byte[] __stackOp436_19_0 = spill436_9;
    spill436_10 = __stackOp436_19_0;
    (__stackOp436_19_0)[1] = ((byte) ((int) (life8_160 >>> 48)));
    byte[] __stackOp436_20_0 = spill436_10;
    spill436_11 = __stackOp436_20_0;
    (__stackOp436_20_0)[2] = ((byte) ((int) (life8_160 >>> 40)));
    byte[] __stackOp436_21_0 = spill436_11;
    spill436_12 = __stackOp436_21_0;
    (__stackOp436_21_0)[3] = ((byte) ((int) (life8_160 >>> 32)));
    byte[] __stackOp436_22_0 = spill436_12;
    spill436_13 = __stackOp436_22_0;
    (__stackOp436_22_0)[4] = ((byte) ((int) (life8_160 >>> 24)));
    byte[] __stackOp436_23_0 = spill436_13;
    spill436_14 = __stackOp436_23_0;
    (__stackOp436_23_0)[5] = ((byte) ((int) (life8_160 >>> 16)));
    byte[] __stackOp436_24_0 = spill436_14;
    spill436_15 = __stackOp436_24_0;
    (__stackOp436_24_0)[6] = ((byte) ((int) (life8_160 >>> 8)));
    byte[] __stackOp436_25_0 = spill436_15;
    spill436_16 = __stackOp436_25_0;
    (__stackOp436_25_0)[7] = ((byte) ((int) life8_160));
    byte[] __stackOp436_26_0 = spill436_16;
    javax.crypto.Cipher __stackOp436_26_1 = life0_20;
    life10_228 = ((javax.crypto.Cipher)(__stackOp436_26_1)).doFinal(((byte[])(__stackOp436_26_0)));
    int __stackOp436_28_0 = spill436_7;
    long __stackOp436_28_1 = (((((((((((long) (life10_228)[0]) & 255L) << 56) | ((((long) (life10_228)[1]) & 255L) << 48)) | ((((long) (life10_228)[2]) & 255L) << 40)) | ((((long) (life10_228)[3]) & 255L) << 32)) | ((((long) (life10_228)[4]) & 255L) << 24)) | ((((long) (life10_228)[5]) & 255L) << 16)) | ((((long) (life10_228)[6]) & 255L) << 8)) | (((long) (life10_228)[7]) & 255L));
    spill436_17 = __stackOp436_28_1;
    spill436_18 = __stackOp436_28_0;
    recovery.source.CarrierOps.discard(__stackOp436_28_1);
    switch (spill436_18) {
default:
{
        forestValue436_300_0 = forestValue436_157_0;
        forestValue436_300_1 = forestValue436_157_1;
        forestValue436_300_2 = spill436_17;
        break forest_join_300;
    }
case 0:
{
        forestValue436_312_0 = forestValue436_157_0;
        forestValue436_312_1 = forestValue436_157_1;
        forestValue436_312_2 = spill436_17;
        break forest_join_312;
    }
}
    }
    (forestValue436_300_0)[forestValue436_300_1] = forestValue436_300_2;
    if (!((life2_75 >= life5_73))) {
        continue forest_cycle_76;
    }
    life5_73 = ((java.lang.String)((life4_71 = "Üc\017.¿\tjjÆøÃtd4\020"))).length();
    life2_75 = 0;
    break forest_join_317;
    }
    (forestValue436_312_0)[forestValue436_312_1] = forestValue436_312_2;
    if (!((life2_75 >= life5_73))) {
        break forest_join_317;
    }
    break forest_join_399;
    }
    spill436_19 = life4_71;
    spill436_20 = life2_75;
    life2_75 += 8;
    life7_325 = ((java.lang.String)(((java.lang.String)(spill436_19)).substring(((int)(spill436_20)), ((int)(life2_75))))).getBytes(((java.lang.String)("ISO-8859-1")));
    spill436_21 = life6_66;
    spill436_22 = (life3_68++);
    spill436_23 = (((((((((((long) (life7_325)[0]) & 255L) << 56) | ((((long) (life7_325)[1]) & 255L) << 48)) | ((((long) (life7_325)[2]) & 255L) << 40)) | ((((long) (life7_325)[3]) & 255L) << 32)) | ((((long) (life7_325)[4]) & 255L) << 24)) | ((((long) (life7_325)[5]) & 255L) << 16)) | ((((long) (life7_325)[6]) & 255L) << 8)) | (((long) (life7_325)[7]) & 255L));
    spill436_24 = 0;
    forestValue436_157_0 = spill436_21;
    forestValue436_157_1 = spill436_22;
    forestValue436_157_2 = spill436_23;
    forestValue436_157_3 = spill436_24;
    continue forest_cycle_157;
    }
    }
    }
    W = ((long[])(life6_66));
    X = ((java.lang.Integer[])(new java.lang.Integer[9]));
    R = ((moom.fy)(moom.fy.a(((java.lang.String)("age")), ((int)(0)), ((int)(__sourceIntrinsic_eb8803ad1f63_invokedynamic436_35(31600, (2085033480450196655L ^ life11_11)))))));
    S = ((moom.fx)(moom.fx.a(((java.lang.String)("facing")), ((com.google.common.base.Predicate)(__sourceIntrinsic_eb8803ad1f63_invokedynamic436_38())))));
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7064_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/cH"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public net.minecraft.block.state.IBlockState b__fE(int p0) {
return ((net.minecraft.block.state.IBlockState)(((moom.cH)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.cH.R)), ((java.lang.Comparable)(java.lang.Integer.valueOf(((int)(p0))))));
}


public int b(net.minecraft.block.state.IBlockState p0) {
return ((java.lang.Integer)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.cH.R))))))).intValue();
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.cH.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 8008;
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
            throw new RuntimeException("moom/cH", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         X[var3] = var15;
      }

      return X[var3];
}


public void b(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, java.util.Random p3) {
moom.cH lexicalValue1072_27_0;
    net.minecraft.world.World lexicalValue1072_27_1;
    moom.DT lexicalValue1072_27_2;
    int lexicalValue1072_45_0;
    int lexicalValue1072_68_0;
    net.minecraft.block.Block lexicalValue1072_106_0;
    net.minecraft.block.Block lexicalValue1072_117_0;
    net.minecraft.block.Block lexicalValue1072_125_0;
    net.minecraft.block.Block lexicalValue1072_125_1;
    net.minecraft.block.Block lexicalValue1072_127_0;
    moom.cH spill1072_0;
    net.minecraft.world.World spill1072_1;
    moom.DT spill1072_2;
    int spill1072_3;
    int spill1072_4;
    net.minecraft.block.Block spill1072_5;
    net.minecraft.block.Block spill1072_6;
    net.minecraft.block.Block spill1072_7;
    net.minecraft.block.Block spill1072_8;
    long life5_3;
    int[] life7_5;
    float life8_34;
    int life9_57;
    net.minecraft.block.state.IBlockState life3_77;
    java.util.Iterator life10_88;
    moom.bs life11_95;
    net.minecraft.block.Block life10_126;
    lexical_join_136: {
    lexical_join_129: {
    lexical_join_127: {
    lexical_join_125: {
    lexical_join_117: {
    lexical_join_106: {
    lexical_join_95: {
    lexical_join_71: {
    lexical_join_68: {
    lexical_join_45: {
    lexical_join_27: {
    life5_3 = (moom.cH.V ^ 9702139935583L);
    life7_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill1072_0 = this;
    spill1072_1 = p0;
    spill1072_2 = p1;
    if (!((life7_5 != null))) {
        lexicalValue1072_27_0 = spill1072_0;
        lexicalValue1072_27_1 = spill1072_1;
        lexicalValue1072_27_2 = spill1072_2;
        break lexical_join_27;
    }
    __sourceIntrinsic_b4b54c999db9_call1072_2(spill1072_0, spill1072_1, spill1072_2, p2, p3);
    if (!((((net.minecraft.world.World)(p0)).b(((moom.DT)(((moom.DT)(p1)).a__DT()))) >= __sourceIntrinsic_b4b54c999db9_invokedynamic1072_5(7763, (7262393176838047749L ^ life5_3))))) {
        break lexical_join_136;
    }
    lexicalValue1072_27_0 = this;
    lexicalValue1072_27_1 = p0;
    lexicalValue1072_27_2 = p1;
    }
    life8_34 = moom.cv.a(((net.minecraft.block.Block)(lexicalValue1072_27_0)), ((net.minecraft.world.World)(lexicalValue1072_27_1)), ((moom.DT)(lexicalValue1072_27_2)));
    spill1072_3 = ((java.util.Random)(p3)).nextInt(((int)((((int) (0x1.9p4f / life8_34)) + 1))));
    if (!((life7_5 != null))) {
        lexicalValue1072_45_0 = spill1072_3;
        break lexical_join_45;
    }
    if (!((spill1072_3 == 0))) {
        break lexical_join_136;
    }
    lexicalValue1072_45_0 = ((java.lang.Integer)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.cH.R))))))).intValue();
    }
    life9_57 = lexicalValue1072_45_0;
    spill1072_4 = life9_57;
    if (!((life7_5 != null))) {
        lexicalValue1072_68_0 = spill1072_4;
        break lexical_join_68;
    }
    if (!((spill1072_4 < __sourceIntrinsic_b4b54c999db9_invokedynamic1072_12(31600, (2085160879559503143L ^ life5_3))))) {
        break lexical_join_71;
    }
    life3_77 = ((net.minecraft.block.state.IBlockState)(p2)).a__fE(((net.minecraft.block.properties.IProperty)(moom.cH.R)), ((java.lang.Comparable)(java.lang.Integer.valueOf(((int)((life9_57 + 1)))))));
    lexicalValue1072_68_0 = ((((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(life3_77)), ((int)(2)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(lexicalValue1072_68_0);
    if (!((life7_5 == null))) {
        break lexical_join_136;
    }
    }
    life10_88 = ((net.minecraft.util.EnumFacing$Plane)(net.minecraft.util.EnumFacing$Plane.HORIZONTAL)).iterator();
    lexical_cycle_74: while (true) {
    lexical_join_93: {
    if (!(((java.util.Iterator)(life10_88)).hasNext())) {
        break lexical_join_95;
    }
    life11_95 = ((moom.bs)(((java.util.Iterator)(life10_88)).next()));
    spill1072_5 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).a(((moom.bs)(life11_95)))))))).a__ch();
    if (!((life7_5 != null))) {
        lexicalValue1072_106_0 = spill1072_5;
        break lexical_join_106;
    }
    if (!((spill1072_5 == this.T))) {
        break lexical_join_93;
    }
    return;
    }
    if (!((life7_5 == null))) { continue lexical_cycle_74; }
    break lexical_cycle_74;
    }
    }
    p1 = ((moom.DT)(p1)).a(((moom.bs)(((net.minecraft.util.EnumFacing$Plane)(net.minecraft.util.EnumFacing$Plane.HORIZONTAL)).a(((java.util.Random)(p3))))));
    lexicalValue1072_106_0 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).b__DT()))))).a__ch();
    }
    life10_126 = lexicalValue1072_106_0;
    spill1072_6 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(p1))))).a__ch();
    if (!((life7_5 != null))) {
        lexicalValue1072_117_0 = spill1072_6;
        break lexical_join_117;
    }
    if (!((((net.minecraft.block.Block)(spill1072_6)).J == moom.fn.a))) {
        break lexical_join_136;
    }
    lexicalValue1072_117_0 = life10_126;
    }
    spill1072_7 = net.minecraft.init.Blocks.ak;
    if (!((life7_5 != null))) {
        lexicalValue1072_125_0 = lexicalValue1072_117_0;
        lexicalValue1072_125_1 = spill1072_7;
        break lexical_join_125;
    }
    if (!((lexicalValue1072_117_0 != spill1072_7))) {
        break lexical_join_129;
    }
    spill1072_8 = life10_126;
    if (!((life7_5 != null))) {
        lexicalValue1072_127_0 = spill1072_8;
        break lexical_join_127;
    }
    lexicalValue1072_125_0 = spill1072_8;
    lexicalValue1072_125_1 = net.minecraft.init.Blocks.d;
    }
    if (!((lexicalValue1072_125_0 != lexicalValue1072_125_1))) {
        break lexical_join_129;
    }
    lexicalValue1072_127_0 = life10_126;
    }
    if (!((lexicalValue1072_127_0 == net.minecraft.init.Blocks.c))) {
        break lexical_join_136;
    }
    }
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(this.T)).a__fE())));
    }
    return;
}


protected boolean b(net.minecraft.block.Block p0) {
long local2 = (moom.cH.V ^ 116532744670272L);
    return ((((p0 == net.minecraft.init.Blocks.ak) ? 1 : 0)) != 0);
}


public void e(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
long local4 = (moom.cH.V ^ 28464379552256L);
    int local6 = (((java.lang.Integer)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.cH.R))))))).intValue() + moom.Dr.a(((java.util.Random)(((net.minecraft.world.World)(p0)).u)), ((int)(2)), ((int)(5))));
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(p2)).a__fE(((net.minecraft.block.properties.IProperty)(moom.cH.R)), ((java.lang.Comparable)(java.lang.Integer.valueOf(((int)(java.lang.Math.min(((int)(__sourceIntrinsic_9003fcba2468_originalDynamicSite1401_8(31600, (2085144586238211192L ^ local4)))), ((int)(local6))))))))))), ((int)(2)));
    return;
}


public int d(net.minecraft.block.state.IBlockState p0) {
net.minecraft.block.state.IBlockState forwardValue342_17_0;
    net.minecraft.block.state.IBlockState spill342_0;
    long life2_3;
    int[] life4_5;
    int life5_26;
    int life6_34;
    int life7_48;
    int life8_52;
    forward_join_17: {
    forward_join_16: {
    life2_3 = (moom.cH.V ^ 90054435670536L);
    life4_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill342_0 = p0;
    if (!((life4_5 != null))) {
        forwardValue342_17_0 = spill342_0;
        break forward_join_17;
    }
    if (!((((net.minecraft.block.state.IBlockState)(spill342_0)).a__ch() != this))) {
        break forward_join_16;
    }
    return super.d(((net.minecraft.block.state.IBlockState)(p0)));
    }
    forwardValue342_17_0 = p0;
    }
    life5_26 = ((java.lang.Integer)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(forwardValue342_17_0)).a(((net.minecraft.block.properties.IProperty)(moom.cH.R))))))).intValue();
    life6_34 = (life5_26 * __sourceIntrinsic_ba4ebd9c343f_invokedynamic342_8(24156, (7463252980066351454L ^ life2_3)));
    life7_48 = (__sourceIntrinsic_ba4ebd9c343f_invokedynamic342_9(5721, (707350208305508703L ^ life2_3)) - (life5_26 * __sourceIntrinsic_ba4ebd9c343f_invokedynamic342_10(20862, (4771459755870746237L ^ life2_3))));
    life8_52 = (life5_26 * 4);
    return (((life6_34 << __sourceIntrinsic_ba4ebd9c343f_invokedynamic342_11(3159, (3944375274848496466L ^ life2_3))) | (life7_48 << __sourceIntrinsic_ba4ebd9c343f_invokedynamic342_12(11352, (4531593011861621599L ^ life2_3)))) | life8_52);
}


protected moom.fA a__fA() {
return new moom.fA(this, new net.minecraft.block.properties.IProperty[] {moom.cH.R, moom.cH.S});
}


public void a__Void() {
float local1 = 0x1.0p-3f;
    ((moom.cH)(this)).a(((float)((0x1.0p-1f - local1))), ((float)(0x0.0p0f)), ((float)((0x1.0p-1f - local1))), ((float)((0x1.0p-1f + local1))), ((float)(0x1.0p-2f)), ((float)((0x1.0p-1f + local1))));
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public net.minecraft.block.state.IBlockState a(net.minecraft.block.state.IBlockState p0, net.minecraft.world.IBlockAccess p1, moom.DT p2) {
net.minecraft.block.state.IBlockState lexicalValue1070_38_0;
    net.minecraft.block.state.IBlockState lexicalValue1070_44_0;
    int[] spill1070_0;
    net.minecraft.block.state.IBlockState spill1070_1;
    long life4_3;
    net.minecraft.block.state.IBlockState life1_9;
    int[] life6_10;
    java.util.Iterator life7_13;
    moom.bs life8_20;
    lexical_join_44: {
    lexical_join_43: {
    life4_3 = (moom.cH.V ^ 139445483856660L);
    spill1070_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life1_9 = ((net.minecraft.block.state.IBlockState)(p0)).a__fE(((net.minecraft.block.properties.IProperty)(moom.cH.S)), ((java.lang.Comparable)(moom.bs.UP)));
    life6_10 = spill1070_0;
    life7_13 = ((net.minecraft.util.EnumFacing$Plane)(net.minecraft.util.EnumFacing$Plane.HORIZONTAL)).iterator();
    lexical_cycle_14: while (true) {
    lexical_join_41: {
    lexical_join_38: {
    if (!(((java.util.Iterator)(life7_13)).hasNext())) {
        break lexical_join_43;
    }
    life8_20 = ((moom.bs)(((java.util.Iterator)(life7_13)).next()));
    spill1070_1 = ((net.minecraft.world.IBlockAccess)(p1)).a__fE(((moom.DT)(((moom.DT)(p2)).a(((moom.bs)(life8_20))))));
    if (!((life6_10 != null))) {
        lexicalValue1070_44_0 = spill1070_1;
        break lexical_join_44;
    }
    if (!((life6_10 != null))) {
        lexicalValue1070_38_0 = spill1070_1;
        break lexical_join_38;
    }
    if (!((((net.minecraft.block.state.IBlockState)(spill1070_1)).a__ch() == this.T))) {
        break lexical_join_41;
    }
    lexicalValue1070_38_0 = ((net.minecraft.block.state.IBlockState)(life1_9)).a__fE(((net.minecraft.block.properties.IProperty)(moom.cH.S)), ((java.lang.Comparable)(life8_20)));
    }
    life1_9 = lexicalValue1070_38_0;
    if (!((life6_10 == null))) {
        break lexical_join_43;
    }
    }
    if (!((life6_10 == null))) { continue lexical_cycle_14; }
    break lexical_cycle_14;
    }
    }
    lexicalValue1070_44_0 = life1_9;
    }
    return lexicalValue1070_44_0;
}


public net.minecraft.item.Item a__wQ(net.minecraft.world.World p0, moom.DT p1) {
return ((moom.cH)(this)).a__wQ();
}


public int a(net.minecraft.world.IBlockAccess p0, moom.DT p1, int p2) {
return ((moom.cH)(this)).d(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(p1))))));
}


public net.minecraft.item.Item a(net.minecraft.block.state.IBlockState p0, java.util.Random p1, int p2) {
return null;
}


protected net.minecraft.item.Item a__wQ() {
net.minecraft.block.Block forwardValue341_17_0;
    net.minecraft.block.Block forwardValue341_17_1;
    net.minecraft.item.Item forwardValue341_21_0;
    net.minecraft.block.Block spill341_0;
    net.minecraft.block.Block spill341_1;
    long life1_3;
    int[] life3_5;
    forward_join_21: {
    forward_join_20: {
    forward_join_17: {
    forward_join_14: {
    life1_3 = (moom.cH.V ^ 89092412111035L);
    life3_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill341_0 = this.T;
    spill341_1 = net.minecraft.init.Blocks.aU;
    if (!((life3_5 != null))) {
        forwardValue341_17_0 = spill341_0;
        forwardValue341_17_1 = spill341_1;
        break forward_join_17;
    }
    if (!((spill341_0 == spill341_1))) {
        break forward_join_14;
    }
    forwardValue341_21_0 = net.minecraft.init.Items.a6;
    break forward_join_21;
    }
    forwardValue341_17_0 = this.T;
    forwardValue341_17_1 = net.minecraft.init.Blocks.a_;
    }
    if (!((forwardValue341_17_0 == forwardValue341_17_1))) {
        break forward_join_20;
    }
    forwardValue341_21_0 = net.minecraft.init.Items.a7;
    break forward_join_21;
    }
    forwardValue341_21_0 = null;
    }
    return forwardValue341_21_0;
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, float p3, int p4) {
moom.cH lexicalValue1071_19_0;
    net.minecraft.world.World lexicalValue1071_47_0;
    moom.cH spill1071_0;
    net.minecraft.world.World spill1071_1;
    long life6_3;
    int[] life8_5;
    net.minecraft.item.Item life9_26;
    int life10_34;
    int life11_36;
    lexical_join_56: {
    lexical_join_19: {
    life6_3 = (moom.cH.V ^ 4079330842235L);
    life8_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill1071_0 = this;
    if (!((life8_5 != null))) {
        lexicalValue1071_19_0 = spill1071_0;
        break lexical_join_19;
    }
    __sourceIntrinsic_205edd9df212_call1071_2(spill1071_0, p0, p1, p2, p3, p4);
    if (!((!((net.minecraft.world.World)(p0)).G))) {
        break lexical_join_56;
    }
    lexicalValue1071_19_0 = this;
    }
    life9_26 = ((moom.cH)(lexicalValue1071_19_0)).a__wQ();
    if (!((life9_26 != null))) {
        break lexical_join_56;
    }
    life10_34 = ((java.lang.Integer)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.cH.R))))))).intValue();
    life11_36 = 0;
    lexical_cycle_31: while (true) {
    lexical_join_53: {
    lexical_join_47: {
    if (!((life11_36 < 3))) {
        break lexical_join_56;
    }
    spill1071_1 = p0;
    if (!((life8_5 != null))) {
        lexicalValue1071_47_0 = spill1071_1;
        break lexical_join_47;
    }
    if (!((((java.util.Random)(((net.minecraft.world.World)(spill1071_1)).u)).nextInt(((int)(__sourceIntrinsic_205edd9df212_invokedynamic1071_10(14072, (8442049686395374991L ^ life6_3))))) <= life10_34))) {
        break lexical_join_53;
    }
    lexicalValue1071_47_0 = p0;
    }
    moom.cH.a(((net.minecraft.world.World)(lexicalValue1071_47_0)), ((moom.DT)(p1)), ((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(life9_26))));
    }
    life11_36 += 1;
    if (!((life8_5 == null))) { continue lexical_cycle_31; }
    break lexical_cycle_31;
    }
    }
    return;
}


public void a__Void(net.minecraft.world.IBlockAccess p0, moom.DT p1) {
this.F = ((double)(((double) (((float) ((((java.lang.Integer)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(p1))))).a(((net.minecraft.block.properties.IProperty)(moom.cH.R))))))).intValue() * 2) + 2)) / 0x1.0p4f))));
    float local3 = 0x1.0p-3f;
    ((moom.cH)(this)).a(((float)((0x1.0p-1f - local3))), ((float)(0x0.0p0f)), ((float)((0x1.0p-1f - local3))), ((float)((0x1.0p-1f + local3))), ((float)(((float) this.F))), ((float)((0x1.0p-1f + local3))));
    return;
}


public void a(net.minecraft.world.World p0, java.util.Random p1, moom.DT p2, net.minecraft.block.state.IBlockState p3) {
((moom.cH)(this)).e(((net.minecraft.world.World)(p0)), ((moom.DT)(p2)), ((net.minecraft.block.state.IBlockState)(p3)));
    return;
}


public boolean a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, boolean p3) {
int forwardValue340_20_0;
    int forwardValue340_22_0;
    int spill340_0;
    long life5_3;
    int[] life7_5;
    forward_join_22: {
    forward_join_21: {
    forward_join_20: {
    life5_3 = (moom.cH.V ^ 72724580107141L);
    life7_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill340_0 = ((java.lang.Integer)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.cH.R))))))).intValue();
    if (!((life7_5 != null))) {
        forwardValue340_20_0 = spill340_0;
        break forward_join_20;
    }
    if (!((spill340_0 != __sourceIntrinsic_fc9aca05ccba_invokedynamic340_6(3877, (95155194852712868L ^ life5_3))))) {
        break forward_join_21;
    }
    forwardValue340_20_0 = 1;
    }
    forwardValue340_22_0 = forwardValue340_20_0;
    break forward_join_22;
    }
    forwardValue340_22_0 = 0;
    }
    return ((forwardValue340_22_0) != 0);
}


public boolean a__Boolean(net.minecraft.world.World p0, java.util.Random p1, moom.DT p2, net.minecraft.block.state.IBlockState p3) {
return ((1) != 0);
}


private static boolean lambda$static$0(moom.bs p0) {
long local1 = (moom.cH.V ^ 6271615596286L);
    return ((((p0 != moom.bs.DOWN) ? 1 : 0)) != 0);
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic436_35(int a0, long a1) throws E;

private static native <E extends Throwable> com.google.common.base.Predicate __sourceIntrinsic_eb8803ad1f63_invokedynamic436_38() throws E;

private static native <E extends Throwable> void __sourceIntrinsic_205edd9df212_call1071_2(moom.cH a0, net.minecraft.world.World a1, moom.DT a2, net.minecraft.block.state.IBlockState a3, float a4, int a5) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_205edd9df212_invokedynamic1071_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fc9aca05ccba_invokedynamic340_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7064_0() throws E;

private static native <E extends Throwable> void __sourceIntrinsic_b4b54c999db9_call1072_2(moom.cH a0, net.minecraft.world.World a1, moom.DT a2, net.minecraft.block.state.IBlockState a3, java.util.Random a4) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b4b54c999db9_invokedynamic1072_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b4b54c999db9_invokedynamic1072_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ba4ebd9c343f_invokedynamic342_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ba4ebd9c343f_invokedynamic342_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ba4ebd9c343f_invokedynamic342_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ba4ebd9c343f_invokedynamic342_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ba4ebd9c343f_invokedynamic342_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9003fcba2468_originalDynamicSite1401_8(int a0, long a1) throws E;
}
