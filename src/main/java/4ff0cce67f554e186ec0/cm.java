package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class cm extends moom.ck {

public static final moom.fy Q;

private final int R;

private static final long T;

private static final long[] V;

private static final java.lang.Integer[] W;

private static final java.util.Map X;

protected cm(moom.fn p0, int p1) {
this(p0, p1, (p0).a__fm());
}


protected cm(moom.fn p0, int p1, moom.fm p2) {
super(p0, p2);
    (this).a__Void(((this.M).a__fE()).a__fE(moom.cm.Q, java.lang.Integer.valueOf(0)));
    this.R = p1;
}


static {
T = ((long)(((moom._a)(moom._c.a(((long)(-6158296959180138710L)), ((long)(135776558861993936L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(147953138801433L)))));
    long local11_life6 = (moom.cm.T ^ 71061911388245L);
    X = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life9;
    javax.crypto.Cipher __sourceSpill796_11 = (local0_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill796_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill796_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill796_14 = new byte[8];
    (__sourceSpill796_14)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local1_life15 = 1;
    while ((local1_life15 < 8)) {
        (__sourceSpill796_14)[local1_life15] = ((byte) ((int) ((local11_life6 << (local1_life15 * 8)) >>> 56)));
        local1_life15 += 1;
    }
    byte[] __sourcePreallocation796_16 = __sourceSpill796_14;
    ((javax.crypto.Cipher)(__sourceSpill796_11)).init(((int)(__sourceSpill796_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill796_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation796_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life19 = new long[2];
    int local3_life20 = 0;
    java.lang.String local4_life21;
    int local5_life23 = ((java.lang.String)((local4_life21 = "´azñFò0Ë/P \t[8"))).length();
    int local2_life24 = 0;
    do {
        java.lang.String __sourceSpill796_25 = local4_life21;
        int __sourceSpill796_26 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill796_25)).substring(((int)(__sourceSpill796_26)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill796_30 = local6_life19;
        int __sourceSpill796_31 = local3_life20;
        local3_life20 += 1;
        long local8_life32 = (((((((((((long) (local7_life29)[0]) & 255L) << 56) | ((((long) (local7_life29)[1]) & 255L) << 48)) | ((((long) (local7_life29)[2]) & 255L) << 40)) | ((((long) (local7_life29)[3]) & 255L) << 32)) | ((((long) (local7_life29)[4]) & 255L) << 24)) | ((((long) (local7_life29)[5]) & 255L) << 16)) | ((((long) (local7_life29)[6]) & 255L) << 8)) | (((long) (local7_life29)[7]) & 255L));
        byte[] __sourceSpill796_33 = new byte[8];
        (__sourceSpill796_33)[0] = ((byte) ((int) (local8_life32 >>> 56)));
        (__sourceSpill796_33)[1] = ((byte) ((int) (local8_life32 >>> 48)));
        (__sourceSpill796_33)[2] = ((byte) ((int) (local8_life32 >>> 40)));
        (__sourceSpill796_33)[3] = ((byte) ((int) (local8_life32 >>> 32)));
        (__sourceSpill796_33)[4] = ((byte) ((int) (local8_life32 >>> 24)));
        (__sourceSpill796_33)[5] = ((byte) ((int) (local8_life32 >>> 16)));
        (__sourceSpill796_33)[6] = ((byte) ((int) (local8_life32 >>> 8)));
        (__sourceSpill796_33)[7] = ((byte) ((int) local8_life32));
        javax.crypto.Cipher __sourceSpill796_34 = local0_life9;
        byte[] local10_life36 = ((javax.crypto.Cipher)(__sourceSpill796_34)).doFinal(((byte[])(__sourceSpill796_33)));
        (__sourceSpill796_30)[__sourceSpill796_31] = (((((((((((long) (local10_life36)[0]) & 255L) << 56) | ((((long) (local10_life36)[1]) & 255L) << 48)) | ((((long) (local10_life36)[2]) & 255L) << 40)) | ((((long) (local10_life36)[3]) & 255L) << 32)) | ((((long) (local10_life36)[4]) & 255L) << 24)) | ((((long) (local10_life36)[5]) & 255L) << 16)) | ((((long) (local10_life36)[6]) & 255L) << 8)) | (((long) (local10_life36)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    V = ((long[])(local6_life19));
    W = ((java.lang.Integer[])(new java.lang.Integer[2]));
    Q = ((moom.fy)(moom.fy.a(((java.lang.String)("power")), ((int)(0)), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite796_39(3959, (8030148097682763325L ^ local11_life6)))))));
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public int b__sourceReturn_0a30135bee(net.minecraft.block.state.IBlockState p0) {
return ((java.lang.Integer)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.cm.Q))))))).intValue();
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 31073;
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
            throw new RuntimeException("moom/cm", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         W[var3] = var15;
      }

      return W[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.cm.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7157_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/cm"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public net.minecraft.block.state.IBlockState b__fE(int p0) {
return ((net.minecraft.block.state.IBlockState)(((moom.cm)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.cm.Q)), ((java.lang.Comparable)(java.lang.Integer.valueOf(((int)(p0))))));
}


protected int e(net.minecraft.block.state.IBlockState p0) {
return ((java.lang.Integer)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.cm.Q))))))).intValue();
}


protected int c(net.minecraft.world.World p0, moom.DT p1) {
int forwardValue3133_37_0;
    int[] spill3133_0;
    int spill3133_1;
    long life3_3;
    int life6_15;
    int[] life5_16;
    float life7_33;
    forward_join_37: {
    forward_join_36: {
    life3_3 = (moom.cm.T ^ 100742716285231L);
    spill3133_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life6_15 = java.lang.Math.min(((int)(((java.util.List)(((net.minecraft.world.World)(p0)).a(((java.lang.Class)(net.minecraft.entity.Entity.class)), ((moom.CA)(((moom.cm)(this)).a(((moom.DT)(p1)))))))).size())), ((int)(this.R)));
    life5_16 = spill3133_0;
    spill3133_1 = life6_15;
    if (!((life5_16 != null))) {
        forwardValue3133_37_0 = spill3133_1;
        break forward_join_37;
    }
    if (!((spill3133_1 > 0))) {
        break forward_join_36;
    }
    life7_33 = (((float) java.lang.Math.min(((int)(this.R)), ((int)(life6_15)))) / ((float) this.R));
    return moom.Dr.b__Int(((float)((life7_33 * 0x1.ep3f))));
    }
    forwardValue3133_37_0 = 0;
    }
    return forwardValue3133_37_0;
}


protected moom.fA a__fA() {
return new moom.fA(this, new net.minecraft.block.properties.IProperty[] {moom.cm.Q});
}


protected net.minecraft.block.state.IBlockState a(net.minecraft.block.state.IBlockState p0, int p1) {
return ((net.minecraft.block.state.IBlockState)(p0)).a__fE(((net.minecraft.block.properties.IProperty)(moom.cm.Q)), ((java.lang.Comparable)(java.lang.Integer.valueOf(((int)(p1))))));
}


public int a(net.minecraft.world.World p0) {
long local2 = (moom.cm.T ^ 80365869576010L);
    return __sourceIntrinsic_a3a6e3090437_originalDynamicSite1404_1(24674, (1148778194109197878L ^ local2));
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite796_39(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7157_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a3a6e3090437_originalDynamicSite1404_1(int a0, long a1) throws E;
}
