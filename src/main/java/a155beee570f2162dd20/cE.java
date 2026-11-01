package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class cE extends moom.cu implements net.minecraft.block.IGrowable {

private static final long R;

private static final long[] S;

private static final java.lang.Integer[] T;

private static final java.util.Map V;

protected cE() {
super();
    float local1 = 0x1.99999ap-3f;
    ((moom.cE)(this)).a(((float)((0x1.0p-1f - local1))), ((float)(0x0.0p0f)), ((float)((0x1.0p-1f - local1))), ((float)((0x1.0p-1f + local1))), ((float)((local1 * 0x1.0p1f))), ((float)((0x1.0p-1f + local1))));
    ((moom.cE)(this)).a(((boolean)(true)));
    return;
}


static {
R = ((long)(((moom._a)(moom._c.a(((long)(7383310029233918284L)), ((long)(-3678691747070783219L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(122814347419805L)))));
    V = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.cE.R ^ 14825913717114L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1122_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1122_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1122_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1122_14 = new byte[8];
    (__sourceSpill1122_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1122_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1122_16 = __sourceSpill1122_14;
    ((javax.crypto.Cipher)(__sourceSpill1122_11)).init(((int)(__sourceSpill1122_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1122_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1122_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[5];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "\001µ^ªõ¹¼ý¾~\022sMÔ:\022ÞuÃ\027A\b"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1122_25 = local6_life21;
        int __sourceSpill1122_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1122_25)).substring(((int)(__sourceSpill1122_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1122_30 = local8_life19;
        int __sourceSpill1122_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1122_33 = new byte[8];
        (__sourceSpill1122_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1122_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1122_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1122_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1122_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1122_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1122_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1122_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1122_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1122_34)).doFinal(((byte[])(__sourceSpill1122_33)));
        (__sourceSpill1122_30)[__sourceSpill1122_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "^»S\003î·Óëùt¿Lâ."))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1122_38 = local6_life21;
        int __sourceSpill1122_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1122_38)).substring(((int)(__sourceSpill1122_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1122_43 = local8_life19;
        int __sourceSpill1122_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1122_46 = new byte[8];
        (__sourceSpill1122_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1122_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1122_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1122_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1122_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1122_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1122_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1122_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1122_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1122_47)).doFinal(((byte[])(__sourceSpill1122_46)));
        (__sourceSpill1122_43)[__sourceSpill1122_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    S = ((long[])(local8_life19));
    T = ((java.lang.Integer[])(new java.lang.Integer[5]));
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7048_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/cE"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 2259;
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
            throw new RuntimeException("moom/cE", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         T[var3] = var15;
      }

      return T[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.cE.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public boolean b__Boolean(net.minecraft.world.World p0, moom.DT p1) {
int forwardValue3040_19_0;
    int forwardValue3040_23_0;
    int forwardValue3040_25_0;
    boolean spill3040_0;
    long life3_3;
    int[] life5_5;
    forward_join_25: {
    forward_join_24: {
    forward_join_23: {
    forward_join_19: {
    life3_3 = (moom.cE.R ^ 60326128933144L);
    life5_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3040_0 = super.b__Boolean(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)));
    if (!((life5_5 != null))) {
        forwardValue3040_19_0 = ((spill3040_0) ? 1 : 0);
        break forward_join_19;
    }
    if (!(spill3040_0)) {
        break forward_join_24;
    }
    forwardValue3040_19_0 = ((((moom.cE)(this)).a__Boolean(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(((moom.cE)(this)).a__fE())))) ? 1 : 0);
    }
    if (!((life5_5 != null))) {
        forwardValue3040_23_0 = forwardValue3040_19_0;
        break forward_join_23;
    }
    if (!((forwardValue3040_19_0 != 0))) {
        break forward_join_24;
    }
    forwardValue3040_23_0 = 1;
    }
    forwardValue3040_25_0 = forwardValue3040_23_0;
    break forward_join_25;
    }
    forwardValue3040_25_0 = 0;
    }
    return ((forwardValue3040_25_0) != 0);
}


public void b(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, java.util.Random p3) {
int lexicalValue1066_17_0;
    int lexicalValue1066_103_0;
    int lexicalValue1066_132_0;
    int lexicalValue1066_141_0;
    int lexicalValue1066_150_0;
    int spill1066_0;
    boolean spill1066_1;
    long life5_3;
    int[] life7_5;
    int life8_20;
    int life9_22;
    java.util.Iterator life10_43;
    moom.DT life11_50;
    moom.DT life10_97;
    int life11_99;
    lexical_join_151: {
    lexical_join_150: {
    lexical_join_141: {
    lexical_join_132: {
    lexical_join_129: {
    lexical_join_64: {
    lexical_join_17: {
    life5_3 = (moom.cE.R ^ 23916447769325L);
    life7_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill1066_0 = ((java.util.Random)(p3)).nextInt(((int)(__sourceIntrinsic_b4b54c999db9_invokedynamic1066_2(10315, (8685914950818408833L ^ life5_3)))));
    if (!((life7_5 != null))) {
        lexicalValue1066_17_0 = spill1066_0;
        break lexical_join_17;
    }
    if (!((spill1066_0 == 0))) {
        break lexical_join_151;
    }
    lexicalValue1066_17_0 = 5;
    }
    life8_20 = lexicalValue1066_17_0;
    life9_22 = 4;
    life10_43 = ((java.lang.Iterable)(moom.DT.b(((moom.DT)(((moom.DT)(p1)).a(((int)(__sourceIntrinsic_b4b54c999db9_invokedynamic1066_4(11591, (1446476567960464524L ^ life5_3)))), ((int)(-1)), ((int)(__sourceIntrinsic_b4b54c999db9_invokedynamic1066_5(24944, (9206387445669224636L ^ life5_3))))))), ((moom.DT)(((moom.DT)(p1)).a(((int)(4)), ((int)(1)), ((int)(4)))))))).iterator();
    lexical_cycle_41: while (true) {
    lexical_join_62: {
    lexical_join_59: {
    if (!(((java.util.Iterator)(life10_43)).hasNext())) {
        break lexical_join_64;
    }
    life11_50 = ((moom.DT)(((java.util.Iterator)(life10_43)).next()));
    if (!((life7_5 != null))) {
        break lexical_join_151;
    }
    if (!((life7_5 != null))) {
        break lexical_join_59;
    }
    if (!((((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life11_50))))).a__ch() == this))) {
        break lexical_join_62;
    }
    life8_20 += -1;
    }
    if (!((life8_20 <= 0))) {
        break lexical_join_62;
    }
    return;
    }
    if (!((life7_5 == null))) { continue lexical_cycle_41; }
    break lexical_cycle_41;
    }
    }
    life10_97 = ((moom.DT)(p1)).a(((int)((((java.util.Random)(p3)).nextInt(((int)(3))) - 1))), ((int)((((java.util.Random)(p3)).nextInt(((int)(2))) - ((java.util.Random)(p3)).nextInt(((int)(2)))))), ((int)((((java.util.Random)(p3)).nextInt(((int)(3))) - 1))));
    life11_99 = 0;
    lexical_cycle_86: while (true) {
    lexical_join_106: {
    lexical_join_103: {
    if (!((life11_99 < 4))) {
        break lexical_join_129;
    }
    spill1066_1 = ((net.minecraft.world.World)(p0)).a__Boolean(((moom.DT)(life10_97)));
    if (!((life7_5 != null))) {
        lexicalValue1066_132_0 = ((spill1066_1) ? 1 : 0);
        break lexical_join_132;
    }
    if (!((life7_5 != null))) {
        lexicalValue1066_103_0 = ((spill1066_1) ? 1 : 0);
        break lexical_join_103;
    }
    if (!(spill1066_1)) {
        break lexical_join_106;
    }
    lexicalValue1066_103_0 = ((((moom.cE)(this)).a__Boolean(((net.minecraft.world.World)(p0)), ((moom.DT)(life10_97)), ((net.minecraft.block.state.IBlockState)(((moom.cE)(this)).a__fE())))) ? 1 : 0);
    }
    if (!((lexicalValue1066_103_0 != 0))) {
        break lexical_join_106;
    }
    p1 = life10_97;
    }
    life10_97 = ((moom.DT)(p1)).a(((int)((((java.util.Random)(p3)).nextInt(((int)(3))) - 1))), ((int)((((java.util.Random)(p3)).nextInt(((int)(2))) - ((java.util.Random)(p3)).nextInt(((int)(2)))))), ((int)((((java.util.Random)(p3)).nextInt(((int)(3))) - 1))));
    life11_99 += 1;
    if (!((life7_5 == null))) { continue lexical_cycle_86; }
    break lexical_cycle_86;
    }
    }
    lexicalValue1066_132_0 = ((((net.minecraft.world.World)(p0)).a__Boolean(((moom.DT)(life10_97)))) ? 1 : 0);
    }
    if (!((life7_5 != null))) {
        lexicalValue1066_141_0 = lexicalValue1066_132_0;
        break lexical_join_141;
    }
    if (!((lexicalValue1066_132_0 != 0))) {
        break lexical_join_151;
    }
    lexicalValue1066_141_0 = ((((moom.cE)(this)).a__Boolean(((net.minecraft.world.World)(p0)), ((moom.DT)(life10_97)), ((net.minecraft.block.state.IBlockState)(((moom.cE)(this)).a__fE())))) ? 1 : 0);
    }
    if (!((life7_5 != null))) {
        lexicalValue1066_150_0 = lexicalValue1066_141_0;
        break lexical_join_150;
    }
    if (!((lexicalValue1066_141_0 != 0))) {
        break lexical_join_151;
    }
    lexicalValue1066_150_0 = ((((net.minecraft.world.World)(p0)).a(((moom.DT)(life10_97)), ((net.minecraft.block.state.IBlockState)(((moom.cE)(this)).a__fE())), ((int)(2)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(lexicalValue1066_150_0);
    }
    return;
}


protected boolean b(net.minecraft.block.Block p0) {
return (__sourceIntrinsic_booleanComparison((((net.minecraft.block.Block)(p0)).a__Boolean())) != 0);
}


public boolean a__Boolean(net.minecraft.world.World p0, java.util.Random p1, moom.DT p2, net.minecraft.block.state.IBlockState p3) {
int forwardValue3037_15_0;
    int forwardValue3037_17_0;
    int spill3037_0;
    long life5_3;
    int[] life7_5;
    forward_join_17: {
    forward_join_16: {
    forward_join_15: {
    life5_3 = (moom.cE.R ^ 119115362265718L);
    life7_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3037_0 = recovery.source.CarrierOps.dcmpg(((double)(((double) ((java.util.Random)(p1)).nextFloat()))), ((double)(0x1.999999999999ap-2d)));
    if (!((life7_5 != null))) {
        forwardValue3037_15_0 = spill3037_0;
        break forward_join_15;
    }
    if (!((spill3037_0 < 0))) {
        break forward_join_16;
    }
    forwardValue3037_15_0 = 1;
    }
    forwardValue3037_17_0 = forwardValue3037_15_0;
    break forward_join_17;
    }
    forwardValue3037_17_0 = 0;
    }
    return ((forwardValue3037_17_0) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public boolean a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, boolean p3) {
return ((1) != 0);
}


public boolean a__Boolean(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
net.minecraft.block.Block forwardValue3038_37_0;
    net.minecraft.block.Block forwardValue3038_37_1;
    net.minecraft.block.state.IBlockState forwardValue3038_39_0;
    int forwardValue3038_58_0;
    int forwardValue3038_62_0;
    int forwardValue3038_64_0;
    int forwardValue3038_66_0;
    int spill3038_0;
    int spill3038_1;
    net.minecraft.block.Block spill3038_2;
    moom.dP spill3038_3;
    net.minecraft.block.state.IBlockState spill3038_4;
    int spill3038_5;
    long life4_3;
    int[] life6_5;
    net.minecraft.block.state.IBlockState life7_34;
    forward_join_66: {
    forward_join_65: {
    forward_join_64: {
    forward_join_63: {
    forward_join_62: {
    forward_join_61: {
    forward_join_58: {
    forward_join_43: {
    forward_join_39: {
    forward_join_37: {
    life4_3 = (moom.cE.R ^ 114813173744079L);
    life6_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3038_0 = ((moom.DT)(p1)).b();
    if (!((life6_5 != null))) {
        forwardValue3038_66_0 = spill3038_0;
        break forward_join_66;
    }
    if (!((spill3038_0 >= 0))) {
        break forward_join_65;
    }
    spill3038_1 = ((moom.DT)(p1)).b();
    if (!((life6_5 != null))) {
        forwardValue3038_66_0 = spill3038_1;
        break forward_join_66;
    }
    if (!((spill3038_1 < __sourceIntrinsic_43cd2316f2c9_invokedynamic3038_4(26336, (264979437874414603L ^ life4_3))))) {
        break forward_join_65;
    }
    life7_34 = ((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).b__DT())));
    spill3038_2 = ((net.minecraft.block.state.IBlockState)(life7_34)).a__ch();
    spill3038_3 = net.minecraft.init.Blocks.bl;
    if (!((life6_5 != null))) {
        forwardValue3038_37_0 = spill3038_2;
        forwardValue3038_37_1 = spill3038_3;
        break forward_join_37;
    }
    if (!((spill3038_2 != spill3038_3))) {
        break forward_join_61;
    }
    spill3038_4 = life7_34;
    if (!((life6_5 != null))) {
        forwardValue3038_39_0 = spill3038_4;
        break forward_join_39;
    }
    forwardValue3038_37_0 = ((net.minecraft.block.state.IBlockState)(spill3038_4)).a__ch();
    forwardValue3038_37_1 = net.minecraft.init.Blocks.d;
    }
    if (!((forwardValue3038_37_0 == forwardValue3038_37_1))) {
        break forward_join_43;
    }
    forwardValue3038_39_0 = life7_34;
    }
    if (!((((net.minecraft.block.state.IBlockState)(forwardValue3038_39_0)).a(((net.minecraft.block.properties.IProperty)(moom.dq.Q))) != net.minecraft.block.BlockDirt$DirtType.PODZOL))) {
        break forward_join_61;
    }
    }
    spill3038_5 = ((net.minecraft.world.World)(p0)).a__Int(((moom.DT)(p1)));
    if (!((life6_5 != null))) {
        forwardValue3038_58_0 = spill3038_5;
        break forward_join_58;
    }
    if (!((spill3038_5 < __sourceIntrinsic_43cd2316f2c9_invokedynamic3038_15(17014, (7542661118139015324L ^ life4_3))))) {
        break forward_join_63;
    }
    forwardValue3038_58_0 = ((((moom.cE)(this)).b(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(life7_34)).a__ch())))) ? 1 : 0);
    }
    if (!((life6_5 != null))) {
        forwardValue3038_62_0 = forwardValue3038_58_0;
        break forward_join_62;
    }
    if (!((forwardValue3038_58_0 != 0))) {
        break forward_join_63;
    }
    }
    forwardValue3038_62_0 = 1;
    }
    forwardValue3038_64_0 = forwardValue3038_62_0;
    break forward_join_64;
    }
    forwardValue3038_64_0 = 0;
    }
    return ((forwardValue3038_64_0) != 0);
    }
    forwardValue3038_66_0 = 0;
    }
    return ((forwardValue3038_66_0) != 0);
}


public void a(net.minecraft.world.World p0, java.util.Random p1, moom.DT p2, net.minecraft.block.state.IBlockState p3) {
((moom.cE)(this)).a__sourceReturn_98cb3c3cb0(((net.minecraft.world.World)(p0)), ((moom.DT)(p2)), ((net.minecraft.block.state.IBlockState)(p3)), ((java.util.Random)(p1)));
    return;
}


public boolean a__sourceReturn_98cb3c3cb0(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, java.util.Random p3) {
moom.cE forwardValue3036_25_0;
    moom.cu forwardValue3036_25_1;
    moom.Gc forwardValue3036_36_0;
    int forwardValue3036_52_0;
    int[] spill3036_0;
    moom.cE spill3036_1;
    moom.cu spill3036_2;
    moom.Gc spill3036_3;
    boolean spill3036_4;
    long life5_3;
    int[] life7_9;
    moom.Gc life8_11;
    forward_join_52: {
    forward_join_45: {
    forward_join_36: {
    forward_join_31: {
    forward_join_25: {
    forward_join_23: {
    life5_3 = (moom.cE.R ^ 35064618703891L);
    spill3036_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    ((net.minecraft.world.World)(p0)).d__Boolean(((moom.DT)(p1)));
    life7_9 = spill3036_0;
    life8_11 = null;
    spill3036_1 = this;
    spill3036_2 = net.minecraft.init.Blocks.P;
    if (!((life7_9 != null))) {
        forwardValue3036_25_0 = spill3036_1;
        forwardValue3036_25_1 = spill3036_2;
        break forward_join_25;
    }
    if (!((spill3036_1 == spill3036_2))) {
        break forward_join_23;
    }
    life8_11 = new moom.Gc(net.minecraft.init.Blocks.a6);
    break forward_join_31;
    }
    forwardValue3036_25_0 = this;
    forwardValue3036_25_1 = net.minecraft.init.Blocks.Q;
    }
    if (!((forwardValue3036_25_0 == forwardValue3036_25_1))) {
        break forward_join_31;
    }
    life8_11 = new moom.Gc(net.minecraft.init.Blocks.a7);
    }
    spill3036_3 = life8_11;
    if (!((life7_9 != null))) {
        forwardValue3036_36_0 = spill3036_3;
        break forward_join_36;
    }
    if (!((spill3036_3 != null))) {
        break forward_join_45;
    }
    forwardValue3036_36_0 = life8_11;
    }
    spill3036_4 = ((moom.FY)(forwardValue3036_36_0)).a__Boolean(((net.minecraft.world.World)(p0)), ((java.util.Random)(p3)), ((moom.DT)(p1)));
    if (!((life7_9 != null))) {
        forwardValue3036_52_0 = ((spill3036_4) ? 1 : 0);
        break forward_join_52;
    }
    if (!(spill3036_4)) {
        break forward_join_45;
    }
    return ((1) != 0);
    }
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((int)(3)));
    forwardValue3036_52_0 = 0;
    }
    return ((forwardValue3036_52_0) != 0);
}


private static native <E extends Throwable> int __sourceIntrinsic_43cd2316f2c9_invokedynamic3038_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_43cd2316f2c9_invokedynamic3038_15(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7048_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b4b54c999db9_invokedynamic1066_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b4b54c999db9_invokedynamic1066_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b4b54c999db9_invokedynamic1066_5(int a0, long a1) throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
