package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Ec implements net.minecraft.world.IBlockAccess {

protected int a;

protected int b;

protected net.minecraft.world.chunk.Chunk[][] c;

protected boolean d;

protected net.minecraft.world.World e;

private static long n;

private static long[] o;

private static java.lang.Integer[] p;

private static java.util.Map q;

public Ec(net.minecraft.world.World p0, moom.DT p1, moom.DT p2, int p3) { super(); __sourceHandlerCall_6af9360e6ff3422548be(this, p0, p1, p2, p3); }


static {
n = ((long)(((moom._a)(moom._c.a(((long)(-1702650810466961948L)), ((long)(8925569989391513400L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(47636602026921L)))));
    q = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.Ec.n ^ 118019399498728L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill718_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill718_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill718_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill718_14 = new byte[8];
    (__sourceSpill718_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill718_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation718_16 = __sourceSpill718_14;
    ((javax.crypto.Cipher)(__sourceSpill718_11)).init(((int)(__sourceSpill718_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill718_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation718_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[4];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "zß}\005Op\032\t©I\026ö\b9bF"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill718_25 = local6_life21;
        int __sourceSpill718_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill718_25)).substring(((int)(__sourceSpill718_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill718_30 = local8_life19;
        int __sourceSpill718_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill718_33 = new byte[8];
        (__sourceSpill718_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill718_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill718_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill718_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill718_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill718_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill718_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill718_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill718_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill718_34)).doFinal(((byte[])(__sourceSpill718_33)));
        (__sourceSpill718_30)[__sourceSpill718_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "ôJ-m\017hSÝKWï¶·\027E"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill718_38 = local6_life21;
        int __sourceSpill718_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill718_38)).substring(((int)(__sourceSpill718_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill718_43 = local8_life19;
        int __sourceSpill718_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill718_46 = new byte[8];
        (__sourceSpill718_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill718_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill718_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill718_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill718_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill718_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill718_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill718_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill718_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill718_47)).doFinal(((byte[])(__sourceSpill718_46)));
        (__sourceSpill718_43)[__sourceSpill718_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    o = ((long[])(local8_life19));
    p = ((java.lang.Integer[])(new java.lang.Integer[4]));
}

private static native <E extends Throwable> void __sourceHandlerCall_6af9360e6ff3422548be(moom.Ec a0, net.minecraft.world.World a1, moom.DT a2, moom.DT a3, int a4) throws E;
private static final class __SourceHandler_6af9360e6ff3422548be {

public static void f481(moom.Ec receiver, net.minecraft.world.World p0, moom.DT p1, moom.DT p2, int p3) throws Throwable {
    int __initValue481_101_0;
    long local5_life2;
    int local8_life12;
    int local9_life14;
    int local10_life21;
    java.lang.String local7_life22;
    int local11_life25;
    net.minecraft.world.chunk.Chunk local12_life37;
    init_join_154: {
    init_join_101: {
    init_join_97: {
    local5_life2 = (__fieldRead481_0() ^ __originalNumericLdc481_1());
    __directSuperInit481_3(receiver);
    java.lang.String __sourceSpill481_6 = __call481_4();
    __fieldWrite481_5(receiver, p0);
    __fieldWrite481_8(receiver, ((__call481_7(p1) - p3) >> 4));
    __fieldWrite481_10(receiver, ((__call481_9(p1) - p3) >> 4));
    local8_life12 = ((__call481_11(p2) + p3) >> 4);
    local9_life14 = ((__call481_13(p2) + p3) >> 4);
    __fieldWrite481_18(receiver, __multiArray481_17(((local8_life12 - __fieldRead481_15(receiver)) + 1), ((local9_life14 - __fieldRead481_16(receiver)) + 1)));
    __fieldWrite481_19(receiver, 1);
    local10_life21 = __fieldRead481_20(receiver);
    local7_life22 = __sourceSpill481_6;
    init_cycle_62: while (true) {
    init_join_95: {
    init_join_94: {
    if (!((local10_life21 <= local8_life12))) {
        break init_join_97;
    }
    int __sourceSpill481_24 = __fieldRead481_23(receiver);
    if (!((local7_life22 == null))) {
        __initValue481_101_0 = __sourceSpill481_24;
        break init_join_101;
    }
    local11_life25 = __sourceSpill481_24;
    init_cycle_70: while (true) {
    if (!((local11_life25 <= local9_life14))) {
        break init_join_94;
    }
    ((__fieldRead481_26(receiver))[(local10_life21 - __fieldRead481_27(receiver))])[(local11_life25 - __fieldRead481_28(receiver))] = __call481_29(p0, local10_life21, local11_life25);
    local11_life25 += 1;
    if (!((local7_life22 == null))) {
        break init_join_95;
    }
    if (!((local7_life22 != null))) { continue init_cycle_70; }
    break init_cycle_70;
    }
    }
    local10_life21 += 1;
    }
    if (!((local7_life22 != null))) { continue init_cycle_62; }
    break init_cycle_62;
    }
    }
    __initValue481_101_0 = (__call481_30(p1) >> 4);
    }
    local10_life21 = __initValue481_101_0;
    init_cycle_102: while (true) {
    init_join_152: {
    init_join_151: {
    if (!((local10_life21 <= (__call481_31(p2) >> 4)))) {
        break init_join_154;
    }
    local11_life25 = (__call481_32(p1) >> 4);
    init_cycle_113: while (true) {
    init_join_149: {
    init_join_148: {
    if (!((local11_life25 <= (__call481_33(p2) >> 4)))) {
        break init_join_151;
    }
    local12_life37 = ((__fieldRead481_34(receiver))[(local10_life21 - __fieldRead481_35(receiver))])[(local11_life25 - __fieldRead481_36(receiver))];
    if (!((local7_life22 == null))) {
        break init_join_152;
    }
    if (!((local7_life22 == null))) {
        break init_join_149;
    }
    if (!((local12_life37 != null))) {
        break init_join_148;
    }
    if (!((!__call481_40(local12_life37, __call481_38(p1), __call481_39(p2))))) {
        break init_join_148;
    }
    __fieldWrite481_41(receiver, 0);
    }
    local11_life25 += 1;
    }
    if (!((local7_life22 != null))) { continue init_cycle_113; }
    break init_cycle_113;
    }
    }
    local10_life21 += 1;
    }
    if (!((local7_life22 != null))) { continue init_cycle_102; }
    break init_cycle_102;
    }
    }
    return;
}
private static native long __fieldRead481_0() throws Throwable;
private static native long __originalNumericLdc481_1() throws Throwable;
private static native void __directSuperInit481_3(moom.Ec a0) throws Throwable;
private static native java.lang.String __call481_4() throws Throwable;
private static native void __fieldWrite481_5(moom.Ec a0, net.minecraft.world.World a1) throws Throwable;
private static native int __call481_7(moom.DT a0) throws Throwable;
private static native void __fieldWrite481_8(moom.Ec a0, int a1) throws Throwable;
private static native int __call481_9(moom.DT a0) throws Throwable;
private static native void __fieldWrite481_10(moom.Ec a0, int a1) throws Throwable;
private static native int __call481_11(moom.DT a0) throws Throwable;
private static native int __call481_13(moom.DT a0) throws Throwable;
private static native int __fieldRead481_15(moom.Ec a0) throws Throwable;
private static native int __fieldRead481_16(moom.Ec a0) throws Throwable;
private static native net.minecraft.world.chunk.Chunk[][] __multiArray481_17(int a0, int a1) throws Throwable;
private static native void __fieldWrite481_18(moom.Ec a0, net.minecraft.world.chunk.Chunk[][] a1) throws Throwable;
private static native void __fieldWrite481_19(moom.Ec a0, int a1) throws Throwable;
private static native int __fieldRead481_20(moom.Ec a0) throws Throwable;
private static native int __fieldRead481_23(moom.Ec a0) throws Throwable;
private static native net.minecraft.world.chunk.Chunk[][] __fieldRead481_26(moom.Ec a0) throws Throwable;
private static native int __fieldRead481_27(moom.Ec a0) throws Throwable;
private static native int __fieldRead481_28(moom.Ec a0) throws Throwable;
private static native net.minecraft.world.chunk.Chunk __call481_29(net.minecraft.world.World a0, int a1, int a2) throws Throwable;
private static native int __call481_30(moom.DT a0) throws Throwable;
private static native int __call481_31(moom.DT a0) throws Throwable;
private static native int __call481_32(moom.DT a0) throws Throwable;
private static native int __call481_33(moom.DT a0) throws Throwable;
private static native net.minecraft.world.chunk.Chunk[][] __fieldRead481_34(moom.Ec a0) throws Throwable;
private static native int __fieldRead481_35(moom.Ec a0) throws Throwable;
private static native int __fieldRead481_36(moom.Ec a0) throws Throwable;
private static native int __call481_38(moom.DT a0) throws Throwable;
private static native int __call481_39(moom.DT a0) throws Throwable;
private static native boolean __call481_40(net.minecraft.world.chunk.Chunk a0, int a1, int a2) throws Throwable;
private static native void __fieldWrite481_41(moom.Ec a0, int a1) throws Throwable;

}


public int b(net.minecraft.world.EnumSkyBlock p0, moom.DT p1) {
int forwardValue1832_49_0;
    int spill1832_0;
    int spill1832_1;
    long life3_3;
    java.lang.String life5_5;
    int life6_37;
    int life7_45;
    forward_join_49: {
    forward_join_47: {
    life3_3 = (moom.Ec.n ^ 25015369824969L);
    life5_5 = net.minecraft.world.World.c__String();
    spill1832_0 = ((moom.DT)(p1)).b();
    if (!((life5_5 == null))) {
        forwardValue1832_49_0 = spill1832_0;
        break forward_join_49;
    }
    if (!((spill1832_0 >= 0))) {
        break forward_join_47;
    }
    spill1832_1 = ((moom.DT)(p1)).b();
    if (!((life5_5 == null))) {
        forwardValue1832_49_0 = spill1832_1;
        break forward_join_49;
    }
    if (!((spill1832_1 < __sourceIntrinsic_19a0e23efef9_invokedynamic1832_4(6735, (6219839383340996155L ^ life3_3))))) {
        break forward_join_47;
    }
    life6_37 = ((((moom.DT)(p1)).a() >> 4) - this.a);
    life7_45 = ((((moom.DT)(p1)).c() >> 4) - this.b);
    return ((net.minecraft.world.chunk.Chunk)(((this.c)[life6_37])[life7_45])).a(((net.minecraft.world.EnumSkyBlock)(p0)), ((moom.DT)(p1)));
    }
    forwardValue1832_49_0 = ((net.minecraft.world.EnumSkyBlock)(p0)).defaultLightValue;
    }
    return forwardValue1832_49_0;
}


public boolean d__Boolean() {
return ((((this.d) ? 1 : 0)) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public int a(moom.DT p0, moom.bs p1) {
java.lang.Object local3 = ((moom.Ec)(this)).a__fE(((moom.DT)(p0)));
    return ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(local3)).a__ch())).b(((net.minecraft.world.IBlockAccess)(this)), ((moom.DT)(p0)), ((net.minecraft.block.state.IBlockState)(local3)), ((moom.bs)(p1)));
}


public net.minecraft.world.WorldType a__EL() {
return ((net.minecraft.world.World)(this.e)).a__EL();
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 7948;
      if (p[var3] == null) {
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
         long var5 = o[var3];
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
         Object[] var9 = (Object[])q.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               q.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/Ec", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         p[var3] = var15;
      }

      return p[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.Ec.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral4362_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Ec"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public int a(moom.DT p0, int p1) {
int forwardValue1829_33_0;
    int forwardValue1829_33_1;
    java.lang.String spill1829_0;
    int spill1829_1;
    int spill1829_2;
    long life3_3;
    int life6_8;
    int life7_14;
    java.lang.String life5_15;
    forward_join_33: {
    forward_join_23: {
    life3_3 = (moom.Ec.n ^ 88990171404842L);
    life6_8 = ((moom.Ec)(this)).a(((net.minecraft.world.EnumSkyBlock)(net.minecraft.world.EnumSkyBlock.SKY)), ((moom.DT)(p0)));
    spill1829_0 = net.minecraft.world.World.c__String();
    life7_14 = ((moom.Ec)(this)).a(((net.minecraft.world.EnumSkyBlock)(net.minecraft.world.EnumSkyBlock.BLOCK)), ((moom.DT)(p0)));
    life5_15 = spill1829_0;
    spill1829_1 = life7_14;
    spill1829_2 = p1;
    if (!((life5_15 == null))) {
        forwardValue1829_33_0 = spill1829_1;
        forwardValue1829_33_1 = spill1829_2;
        break forward_join_33;
    }
    if (!((spill1829_1 < spill1829_2))) {
        break forward_join_23;
    }
    life7_14 = p1;
    }
    forwardValue1829_33_0 = (life6_8 << __sourceIntrinsic_9da13ac3d70e_invokedynamic1829_6(10465, (1205112858629080181L ^ life3_3)));
    forwardValue1829_33_1 = (life7_14 << 4);
    }
    return (forwardValue1829_33_0 | forwardValue1829_33_1);
}


public net.minecraft.block.state.IBlockState a__fE(moom.DT p0) {
int forwardValue1831_13_0;
    int forwardValue1831_27_0;
    int forwardValue1831_27_1;
    int forwardValue1831_42_0;
    int forwardValue1831_49_0;
    int forwardValue1831_53_0;
    net.minecraft.world.chunk.Chunk forwardValue1831_71_0;
    int spill1831_0;
    int spill1831_1;
    int spill1831_2;
    net.minecraft.world.chunk.Chunk spill1831_3;
    long life2_3;
    java.lang.String life4_5;
    int life5_40;
    int life6_48;
    net.minecraft.world.chunk.Chunk life7_89;
    forward_join_74: {
    forward_join_71: {
    forward_join_53: {
    forward_join_49: {
    forward_join_42: {
    forward_join_27: {
    forward_join_13: {
    life2_3 = (moom.Ec.n ^ 27837078176324L);
    life4_5 = net.minecraft.world.World.c__String();
    spill1831_0 = ((moom.DT)(p0)).b();
    if (!((life4_5 == null))) {
        forwardValue1831_13_0 = spill1831_0;
        break forward_join_13;
    }
    if (!((spill1831_0 >= 0))) {
        break forward_join_74;
    }
    forwardValue1831_13_0 = ((moom.DT)(p0)).b();
    }
    spill1831_1 = __sourceIntrinsic_afcfc4fb74ad_invokedynamic1831_4(5375, (1814964117335220231L ^ life2_3));
    if (!((life4_5 == null))) {
        forwardValue1831_27_0 = forwardValue1831_13_0;
        forwardValue1831_27_1 = spill1831_1;
        break forward_join_27;
    }
    if (!((forwardValue1831_13_0 < spill1831_1))) {
        break forward_join_74;
    }
    forwardValue1831_27_0 = (((moom.DT)(p0)).a() >> 4);
    forwardValue1831_27_1 = this.a;
    }
    life5_40 = (forwardValue1831_27_0 - forwardValue1831_27_1);
    life6_48 = ((((moom.DT)(p0)).c() >> 4) - this.b);
    spill1831_2 = life5_40;
    if (!((life4_5 == null))) {
        forwardValue1831_42_0 = spill1831_2;
        break forward_join_42;
    }
    if (!((spill1831_2 >= 0))) {
        break forward_join_74;
    }
    forwardValue1831_42_0 = life5_40;
    }
    if (!((life4_5 == null))) {
        forwardValue1831_49_0 = forwardValue1831_42_0;
        break forward_join_49;
    }
    if (!((forwardValue1831_42_0 < (this.c).length))) {
        break forward_join_74;
    }
    forwardValue1831_49_0 = life6_48;
    }
    if (!((life4_5 == null))) {
        forwardValue1831_53_0 = forwardValue1831_49_0;
        break forward_join_53;
    }
    if (!((forwardValue1831_49_0 >= 0))) {
        break forward_join_74;
    }
    forwardValue1831_53_0 = life6_48;
    }
    if (!((forwardValue1831_53_0 < ((this.c)[life5_40]).length))) {
        break forward_join_74;
    }
    life7_89 = ((this.c)[life5_40])[life6_48];
    spill1831_3 = life7_89;
    if (!((life4_5 == null))) {
        forwardValue1831_71_0 = spill1831_3;
        break forward_join_71;
    }
    if (!((spill1831_3 != null))) {
        break forward_join_74;
    }
    forwardValue1831_71_0 = life7_89;
    }
    return ((net.minecraft.world.chunk.Chunk)(forwardValue1831_71_0)).a__fE(((moom.DT)(p0)));
    }
    return ((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE();
}


public net.minecraft.world.biome.BiomeGenBase a__ES(moom.DT p0) {
return ((net.minecraft.world.World)(this.e)).a__ES(((moom.DT)(p0)));
}


private int a(net.minecraft.world.EnumSkyBlock p0, moom.DT p1) {
int lexicalValue596_20_0;
    int lexicalValue596_81_0;
    int lexicalValue596_81_1;
    int lexicalValue596_83_0;
    int lexicalValue596_88_0;
    int lexicalValue596_96_0;
    int lexicalValue596_117_0;
    boolean spill596_0;
    int spill596_1;
    boolean spill596_2;
    int spill596_3;
    int spill596_4;
    int spill596_5;
    long life3_3;
    java.lang.String life5_5;
    int life6_65;
    moom.bs[] life7_67;
    int life8_70;
    int life9_72;
    moom.bs life10_79;
    int life11_86;
    int life6_128;
    int life7_136;
    lexical_join_117: {
    lexical_join_115: {
    lexical_join_96: {
    lexical_join_89: {
    lexical_join_88: {
    lexical_join_87: {
    lexical_join_20: {
    lexical_join_18: {
    life3_3 = (moom.Ec.n ^ 133258889193582L);
    life5_5 = net.minecraft.world.World.c__String();
    if (!((p0 == net.minecraft.world.EnumSkyBlock.SKY))) {
        break lexical_join_18;
    }
    spill596_0 = ((moom.EA)(((net.minecraft.world.World)(this.e)).v)).e();
    if (!((life5_5 == null))) {
        lexicalValue596_20_0 = ((spill596_0) ? 1 : 0);
        break lexical_join_20;
    }
    if (!(spill596_0)) {
        break lexical_join_18;
    }
    return 0;
    }
    lexicalValue596_20_0 = ((moom.DT)(p1)).b();
    }
    if (!((life5_5 == null))) {
        lexicalValue596_117_0 = lexicalValue596_20_0;
        break lexical_join_117;
    }
    if (!((lexicalValue596_20_0 >= 0))) {
        break lexical_join_115;
    }
    spill596_1 = ((moom.DT)(p1)).b();
    if (!((life5_5 == null))) {
        lexicalValue596_117_0 = spill596_1;
        break lexical_join_117;
    }
    if (!((spill596_1 < __sourceIntrinsic_61d14642532e_invokedynamic596_9(5375, (1815069793132235309L ^ life3_3))))) {
        break lexical_join_115;
    }
    spill596_2 = ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((moom.Ec)(this)).a__fE(((moom.DT)(p1))))).a__ch())).c__Boolean();
    if (!((life5_5 == null))) {
        lexicalValue596_96_0 = ((spill596_2) ? 1 : 0);
        break lexical_join_96;
    }
    if (!(spill596_2)) {
        break lexical_join_89;
    }
    life6_65 = 0;
    life7_67 = moom.bs.values();
    life8_70 = (life7_67).length;
    life9_72 = 0;
    lexical_cycle_50: while (true) {
    lexical_join_84: {
    lexical_join_83: {
    lexical_join_81: {
    lexical_join_73: {
    if (!((life9_72 < life8_70))) {
        break lexical_join_87;
    }
    life10_79 = (life7_67)[life9_72];
    life11_86 = ((moom.Ec)(this)).b(((net.minecraft.world.EnumSkyBlock)(p0)), ((moom.DT)(((moom.DT)(p1)).a(((moom.bs)(life10_79))))));
    spill596_3 = life11_86;
    if (!((life5_5 == null))) {
        lexicalValue596_88_0 = spill596_3;
        break lexical_join_88;
    }
    spill596_4 = life6_65;
    if (!((life5_5 == null))) {
        lexicalValue596_81_0 = spill596_3;
        lexicalValue596_81_1 = spill596_4;
        break lexical_join_81;
    }
    if (!((spill596_3 > spill596_4))) {
        break lexical_join_73;
    }
    life6_65 = life11_86;
    }
    spill596_5 = life6_65;
    if (!((life5_5 == null))) {
        lexicalValue596_83_0 = spill596_5;
        break lexical_join_83;
    }
    lexicalValue596_81_0 = spill596_5;
    lexicalValue596_81_1 = __sourceIntrinsic_61d14642532e_invokedynamic596_17(28877, (7156731626674925084L ^ life3_3));
    }
    if (!((lexicalValue596_81_0 >= lexicalValue596_81_1))) {
        break lexical_join_84;
    }
    lexicalValue596_83_0 = life6_65;
    }
    return lexicalValue596_83_0;
    }
    life9_72 += 1;
    if (!((life5_5 != null))) { continue lexical_cycle_50; }
    break lexical_cycle_50;
    }
    }
    lexicalValue596_88_0 = life6_65;
    }
    return lexicalValue596_88_0;
    }
    lexicalValue596_96_0 = ((((moom.DT)(p1)).a() >> 4) - this.a);
    }
    life6_128 = lexicalValue596_96_0;
    life7_136 = ((((moom.DT)(p1)).c() >> 4) - this.b);
    return ((net.minecraft.world.chunk.Chunk)(((this.c)[life6_128])[life7_136])).a(((net.minecraft.world.EnumSkyBlock)(p0)), ((moom.DT)(p1)));
    }
    lexicalValue596_117_0 = ((net.minecraft.world.EnumSkyBlock)(p0)).defaultLightValue;
    }
    return lexicalValue596_117_0;
}


public boolean a__Boolean(moom.DT p0) {
long local2 = (moom.Ec.n ^ 46138574132761L);
    return ((((((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((moom.Ec)(this)).a__fE(((moom.DT)(p0))))).a__ch())).a__fn() == moom.fn.a) ? 1 : 0)) != 0);
}


public net.minecraft.tileentity.TileEntity a__B9(moom.DT p0) {
int local2 = ((((moom.DT)(p0)).a() >> 4) - this.a);
    int local3 = ((((moom.DT)(p0)).c() >> 4) - this.b);
    return ((net.minecraft.world.chunk.Chunk)(((this.c)[local2])[local3])).a(((moom.DT)(p0)), ((net.minecraft.world.chunk.Chunk$EnumCreateEntityType)(net.minecraft.world.chunk.Chunk$EnumCreateEntityType.IMMEDIATE)));
}


private static native <E extends Throwable> net.minecraft.world.chunk.Chunk[][] __sourceIntrinsic_921920150eaa_multiArray481_17(int a0, int a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral4362_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9da13ac3d70e_invokedynamic1829_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_61d14642532e_invokedynamic596_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_61d14642532e_invokedynamic596_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_afcfc4fb74ad_invokedynamic1831_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_19a0e23efef9_invokedynamic1832_4(int a0, long a1) throws E;
}
