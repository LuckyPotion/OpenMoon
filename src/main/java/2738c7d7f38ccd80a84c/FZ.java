package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class FZ extends moom.FY {

private final moom.cu c;

private static final long d;

private static final long[] e;

private static final java.lang.Integer[] f;

private static final java.util.Map g;

public FZ(moom.cu p0) {
super();
    this.c = p0;
}


static {
d = ((long)(((moom._a)(moom._c.a(((long)(-5958660753635861587L)), ((long)(2951754660053170233L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(81201506079894L)))));
    g = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.FZ.d ^ 126303629365321L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill753_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill753_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill753_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill753_14 = new byte[8];
    (__sourceSpill753_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill753_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation753_16 = __sourceSpill753_14;
    ((javax.crypto.Cipher)(__sourceSpill753_11)).init(((int)(__sourceSpill753_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill753_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation753_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[4];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "Öþé;i/ï ãÖ[\177f"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill753_25 = local6_life21;
        int __sourceSpill753_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill753_25)).substring(((int)(__sourceSpill753_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill753_30 = local8_life19;
        int __sourceSpill753_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill753_33 = new byte[8];
        (__sourceSpill753_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill753_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill753_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill753_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill753_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill753_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill753_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill753_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill753_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill753_34)).doFinal(((byte[])(__sourceSpill753_33)));
        (__sourceSpill753_30)[__sourceSpill753_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "mB\021û\rnù+Ñ\006p\023ý\tN"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill753_38 = local6_life21;
        int __sourceSpill753_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill753_38)).substring(((int)(__sourceSpill753_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill753_43 = local8_life19;
        int __sourceSpill753_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill753_46 = new byte[8];
        (__sourceSpill753_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill753_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill753_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill753_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill753_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill753_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill753_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill753_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill753_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill753_47)).doFinal(((byte[])(__sourceSpill753_46)));
        (__sourceSpill753_43)[__sourceSpill753_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    e = ((long[])(local8_life19));
    f = ((java.lang.Integer[])(new java.lang.Integer[4]));
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral4524_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/FZ"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.FZ.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 8712;
      if (f[var3] == null) {
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
         long var5 = e[var3];
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
         Object[] var9 = (Object[])g.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               g.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/FZ", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f[var3] = var15;
      }

      return f[var3];
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public boolean a__Boolean(net.minecraft.world.World p0, java.util.Random p1, moom.DT p2) {
int lexicalValue654_87_0;
    int lexicalValue654_97_0;
    int lexicalValue654_102_0;
    java.lang.String[] spill654_0;
    boolean spill654_1;
    boolean spill654_2;
    int spill654_3;
    long life4_3;
    int life7_6;
    java.lang.String[] life6_7;
    moom.DT life8_54;
    lexical_join_102: {
    lexical_join_101: {
    life4_3 = (moom.FZ.d ^ 119765500644138L);
    spill654_0 = moom.FI.b();
    life7_6 = 0;
    life6_7 = spill654_0;
    lexical_cycle_8: while (true) {
    lexical_join_99: {
    lexical_join_98: {
    lexical_join_97: {
    lexical_join_87: {
    lexical_join_79: {
    if (!((life7_6 < __sourceIntrinsic_e7ba66b54646_invokedynamic654_2(20044, (1517706326147197240L ^ life4_3))))) {
        break lexical_join_101;
    }
    life8_54 = ((moom.DT)(p2)).a(((int)((((java.util.Random)(p1)).nextInt(((int)(__sourceIntrinsic_e7ba66b54646_invokedynamic654_3(2614, (2571074148951010624L ^ life4_3))))) - ((java.util.Random)(p1)).nextInt(((int)(__sourceIntrinsic_e7ba66b54646_invokedynamic654_5(30037, (1638113325719343650L ^ life4_3)))))))), ((int)((((java.util.Random)(p1)).nextInt(((int)(4))) - ((java.util.Random)(p1)).nextInt(((int)(4)))))), ((int)((((java.util.Random)(p1)).nextInt(((int)(__sourceIntrinsic_e7ba66b54646_invokedynamic654_9(30037, (1638113325719343650L ^ life4_3))))) - ((java.util.Random)(p1)).nextInt(((int)(__sourceIntrinsic_e7ba66b54646_invokedynamic654_11(30037, (1638113325719343650L ^ life4_3)))))))));
    if (!((life6_7 != null))) {
        break lexical_join_99;
    }
    spill654_1 = ((net.minecraft.world.World)(p0)).a__Boolean(((moom.DT)(life8_54)));
    if (!((life6_7 != null))) {
        lexicalValue654_102_0 = ((spill654_1) ? 1 : 0);
        break lexical_join_102;
    }
    if (!(spill654_1)) {
        break lexical_join_98;
    }
    spill654_2 = ((moom.EA)(((net.minecraft.world.World)(p0)).v)).e();
    if (!((life6_7 != null))) {
        lexicalValue654_87_0 = ((spill654_2) ? 1 : 0);
        break lexical_join_87;
    }
    if (!(spill654_2)) {
        break lexical_join_79;
    }
    spill654_3 = ((moom.DT)(life8_54)).b();
    if (!((life6_7 != null))) {
        lexicalValue654_87_0 = spill654_3;
        break lexical_join_87;
    }
    if (!((spill654_3 < __sourceIntrinsic_e7ba66b54646_invokedynamic654_20(26224, (6521508681838313733L ^ life4_3))))) {
        break lexical_join_98;
    }
    }
    lexicalValue654_87_0 = ((((moom.cu)(this.c)).a__Boolean(((net.minecraft.world.World)(p0)), ((moom.DT)(life8_54)), ((net.minecraft.block.state.IBlockState)(((moom.cu)(this.c)).a__fE())))) ? 1 : 0);
    }
    if (!((life6_7 != null))) {
        lexicalValue654_97_0 = lexicalValue654_87_0;
        break lexical_join_97;
    }
    if (!((lexicalValue654_87_0 != 0))) {
        break lexical_join_98;
    }
    lexicalValue654_97_0 = ((((net.minecraft.world.World)(p0)).a(((moom.DT)(life8_54)), ((net.minecraft.block.state.IBlockState)(((moom.cu)(this.c)).a__fE())), ((int)(2)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(lexicalValue654_97_0);
    }
    life7_6 += 1;
    }
    if (!((life6_7 == null))) { continue lexical_cycle_8; }
    break lexical_cycle_8;
    }
    }
    lexicalValue654_102_0 = 1;
    }
    return ((lexicalValue654_102_0) != 0);
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral4524_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7ba66b54646_invokedynamic654_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7ba66b54646_invokedynamic654_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7ba66b54646_invokedynamic654_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7ba66b54646_invokedynamic654_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7ba66b54646_invokedynamic654_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7ba66b54646_invokedynamic654_20(int a0, long a1) throws E;
}
