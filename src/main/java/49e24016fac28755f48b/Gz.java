package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Gz extends moom.FY {

private final net.minecraft.block.state.IBlockState c;

private static final long d;

private static final long[] e;

private static final java.lang.Integer[] f;

private static final java.util.Map g;

public Gz(moom.ar p0) {
super();
    this.c = ((net.minecraft.init.Blocks.H).a__fE()).a__fE(moom.cI.R, p0);
}


static {
d = ((long)(((moom._a)(moom._c.a(((long)(-5164205732933335662L)), ((long)(490769825197512725L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(79623620794534L)))));
    g = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.Gz.d ^ 11085155317839L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill567_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill567_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill567_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill567_14 = new byte[8];
    (__sourceSpill567_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill567_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation567_16 = __sourceSpill567_14;
    ((javax.crypto.Cipher)(__sourceSpill567_11)).init(((int)(__sourceSpill567_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill567_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation567_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[3];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "FÑÐpx@ù\0255xpÌ\bE\030xùLGòI;ô="))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill567_25 = local6_life21;
        int __sourceSpill567_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill567_25)).substring(((int)(__sourceSpill567_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill567_30 = local8_life19;
        int __sourceSpill567_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill567_33 = new byte[8];
        (__sourceSpill567_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill567_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill567_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill567_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill567_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill567_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill567_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill567_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill567_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill567_34)).doFinal(((byte[])(__sourceSpill567_33)));
        (__sourceSpill567_30)[__sourceSpill567_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    e = ((long[])(local8_life19));
    f = ((java.lang.Integer[])(new java.lang.Integer[3]));
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral4707_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Gz"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.Gz.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 19288;
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
            throw new RuntimeException("moom/Gz", var14);
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
int lexicalValue723_30_0;
    int lexicalValue723_101_0;
    int lexicalValue723_106_0;
    int spill723_0;
    boolean spill723_1;
    boolean spill723_2;
    long life4_3;
    int[] life6_5;
    net.minecraft.block.Block life7_11;
    int life8_36;
    moom.DT life9_83;
    lexical_join_106: {
    lexical_join_105: {
    lexical_join_30: {
    lexical_join_29: {
    life4_3 = (moom.Gz.d ^ 111233705084400L);
    life6_5 = moom.FY.b();
    lexical_cycle_6: while (true) {
    lexical_join_19: {
    if (!((((net.minecraft.block.Block)((life7_11 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(p2))))).a__ch()))).a__fn() != moom.fn.a))) {
        break lexical_join_19;
    }
    if (!((((net.minecraft.block.Block)(life7_11)).a__fn() == moom.fn.j))) {
        break lexical_join_29;
    }
    }
    spill723_0 = ((moom.DT)(p2)).b();
    if (!((life6_5 != null))) {
        lexicalValue723_30_0 = spill723_0;
        break lexical_join_30;
    }
    if (!((spill723_0 > 0))) {
        break lexical_join_29;
    }
    p2 = ((moom.DT)(p2)).b__DT();
    if (!((life6_5 == null))) { continue lexical_cycle_6; }
    break lexical_cycle_6;
    }
    }
    lexicalValue723_30_0 = 0;
    }
    life8_36 = lexicalValue723_30_0;
    lexical_cycle_31: while (true) {
    lexical_join_103: {
    lexical_join_102: {
    lexical_join_101: {
    if (!((life8_36 < __sourceIntrinsic_e7ba66b54646_invokedynamic723_10(9327, (2715746210755373641L ^ life4_3))))) {
        break lexical_join_105;
    }
    life9_83 = ((moom.DT)(p2)).a(((int)((((java.util.Random)(p1)).nextInt(((int)(__sourceIntrinsic_e7ba66b54646_invokedynamic723_11(16763, (872720082055335774L ^ life4_3))))) - ((java.util.Random)(p1)).nextInt(((int)(__sourceIntrinsic_e7ba66b54646_invokedynamic723_13(22664, (1540960625486632623L ^ life4_3)))))))), ((int)((((java.util.Random)(p1)).nextInt(((int)(4))) - ((java.util.Random)(p1)).nextInt(((int)(4)))))), ((int)((((java.util.Random)(p1)).nextInt(((int)(__sourceIntrinsic_e7ba66b54646_invokedynamic723_17(22664, (1540960625486632623L ^ life4_3))))) - ((java.util.Random)(p1)).nextInt(((int)(__sourceIntrinsic_e7ba66b54646_invokedynamic723_19(22664, (1540960625486632623L ^ life4_3)))))))));
    if (!((life6_5 != null))) {
        break lexical_join_103;
    }
    spill723_1 = ((net.minecraft.world.World)(p0)).a__Boolean(((moom.DT)(life9_83)));
    if (!((life6_5 != null))) {
        lexicalValue723_106_0 = ((spill723_1) ? 1 : 0);
        break lexical_join_106;
    }
    if (!(spill723_1)) {
        break lexical_join_102;
    }
    spill723_2 = ((moom.cI)(net.minecraft.init.Blocks.H)).a__Boolean(((net.minecraft.world.World)(p0)), ((moom.DT)(life9_83)), ((net.minecraft.block.state.IBlockState)(this.c)));
    if (!((life6_5 != null))) {
        lexicalValue723_101_0 = ((spill723_2) ? 1 : 0);
        break lexical_join_101;
    }
    if (!(spill723_2)) {
        break lexical_join_102;
    }
    lexicalValue723_101_0 = ((((net.minecraft.world.World)(p0)).a(((moom.DT)(life9_83)), ((net.minecraft.block.state.IBlockState)(this.c)), ((int)(2)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(lexicalValue723_101_0);
    }
    life8_36 += 1;
    }
    if (!((life6_5 == null))) { continue lexical_cycle_31; }
    break lexical_cycle_31;
    }
    }
    lexicalValue723_106_0 = 1;
    }
    return ((lexicalValue723_106_0) != 0);
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral4707_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7ba66b54646_invokedynamic723_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7ba66b54646_invokedynamic723_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7ba66b54646_invokedynamic723_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7ba66b54646_invokedynamic723_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7ba66b54646_invokedynamic723_19(int a0, long a1) throws E;
}
