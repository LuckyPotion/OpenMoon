package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class aD extends sourcebuild.EnumConstructor<moom.aD> {

public static moom.aD DOWN;

public static moom.aD UP;

public static moom.aD NORTH;

public static moom.aD SOUTH;

public static moom.aD WEST;

public static moom.aD EAST;

private static moom.aD[] a;

private moom.kX[] b;

private static moom.aD[] c;

private static long d;

private static long[] e;

private static java.lang.Integer[] f;

private static java.util.Map g;

private aD(java.lang.String p0, int p1, moom.kX[] p2) {
super(p0, p1);
    this.b = p2;
}


private static void initialize() {
javax.crypto.Cipher forestValue400012_36_0;
    int forestValue400012_36_1;
    javax.crypto.SecretKeyFactory forestValue400012_36_2;
    byte[] forestValue400012_36_3;
    javax.crypto.Cipher forestValue400012_53_0;
    int forestValue400012_53_1;
    javax.crypto.SecretKeyFactory forestValue400012_53_2;
    byte[] forestValue400012_53_3;
    javax.crypto.Cipher spill400012_0;
    int spill400012_1;
    javax.crypto.SecretKeyFactory spill400012_2;
    byte[] spill400012_3;
    byte[] spill400012_4;
    java.lang.String spill400012_5;
    int spill400012_6;
    long[] spill400012_7;
    int spill400012_8;
    int spill400012_9;
    long spill400012_10;
    long spill400012_11;
    int spill400012_12;
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
    forest_join_53: {
    d = ((long)(((moom._a)(moom._c.a(((long)(-9181402320805384931L)), ((long)(-6204437681591552595L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(253664951053791L)))));
    life11_11 = (moom.aD.d ^ 19669421023063L);
    g = ((java.util.Map)(new java.util.HashMap(13)));
    spill400012_0 = (life0_20 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    spill400012_1 = 2;
    spill400012_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp400012_9_0 = new byte[8];
    spill400012_3 = __stackOp400012_9_0;
    (__stackOp400012_9_0)[0] = ((byte) ((int) (life11_11 >>> 56)));
    life1_35 = 1;
    forestValue400012_36_0 = spill400012_0;
    forestValue400012_36_1 = spill400012_1;
    forestValue400012_36_2 = spill400012_2;
    forestValue400012_36_3 = spill400012_3;
    forest_cycle_36: while (true) {
    if (!((life1_35 < 8))) {
        forestValue400012_53_0 = forestValue400012_36_0;
        forestValue400012_53_1 = forestValue400012_36_1;
        forestValue400012_53_2 = forestValue400012_36_2;
        forestValue400012_53_3 = forestValue400012_36_3;
        break forest_join_53;
    }
    byte[] __stackOp400012_10_0 = forestValue400012_36_3;
    spill400012_4 = __stackOp400012_10_0;
    (__stackOp400012_10_0)[life1_35] = ((byte) ((int) ((life11_11 << (life1_35 * 8)) >>> 56)));
    life1_35 += 1;
    forestValue400012_36_3 = spill400012_4;
    continue forest_cycle_36;
    }
    }
    ((javax.crypto.Cipher)(forestValue400012_53_0)).init(((int)(forestValue400012_53_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue400012_53_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue400012_53_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    life6_66 = new long[2];
    life3_68 = 0;
    life5_73 = ((java.lang.String)((life4_71 = "Ï¶Àf\003ð«[°º{WðEÀ"))).length();
    life2_75 = 0;
    forest_cycle_76: while (true) {
    spill400012_5 = life4_71;
    spill400012_6 = life2_75;
    life2_75 += 8;
    life7_83 = ((java.lang.String)(((java.lang.String)(spill400012_5)).substring(((int)(spill400012_6)), ((int)(life2_75))))).getBytes(((java.lang.String)("ISO-8859-1")));
    spill400012_7 = life6_66;
    spill400012_8 = (life3_68++);
    long __stackOp400012_16_0 = (((((((((((long) (life7_83)[0]) & 255L) << 56) | ((((long) (life7_83)[1]) & 255L) << 48)) | ((((long) (life7_83)[2]) & 255L) << 40)) | ((((long) (life7_83)[3]) & 255L) << 32)) | ((((long) (life7_83)[4]) & 255L) << 24)) | ((((long) (life7_83)[5]) & 255L) << 16)) | ((((long) (life7_83)[6]) & 255L) << 8)) | (((long) (life7_83)[7]) & 255L));
    int __stackOp400012_16_1 = -1;
    spill400012_9 = __stackOp400012_16_1;
    spill400012_10 = __stackOp400012_16_0;
    recovery.source.CarrierOps.discard(__stackOp400012_16_1);
    life8_160 = spill400012_10;
    byte[] __stackOp400012_18_0 = new byte[] {((byte) ((int) (life8_160 >>> 56))), ((byte) ((int) (life8_160 >>> 48))), ((byte) ((int) (life8_160 >>> 40))), ((byte) ((int) (life8_160 >>> 32))), ((byte) ((int) (life8_160 >>> 24))), ((byte) ((int) (life8_160 >>> 16))), ((byte) ((int) (life8_160 >>> 8))), ((byte) ((int) life8_160))};
    javax.crypto.Cipher __stackOp400012_18_1 = life0_20;
    life10_228 = ((javax.crypto.Cipher)(__stackOp400012_18_1)).doFinal(((byte[])(__stackOp400012_18_0)));
    int __stackOp400012_20_0 = spill400012_9;
    long __stackOp400012_20_1 = (((((((((((long) (life10_228)[0]) & 255L) << 56) | ((((long) (life10_228)[1]) & 255L) << 48)) | ((((long) (life10_228)[2]) & 255L) << 40)) | ((((long) (life10_228)[3]) & 255L) << 32)) | ((((long) (life10_228)[4]) & 255L) << 24)) | ((((long) (life10_228)[5]) & 255L) << 16)) | ((((long) (life10_228)[6]) & 255L) << 8)) | (((long) (life10_228)[7]) & 255L));
    spill400012_11 = __stackOp400012_20_1;
    spill400012_12 = __stackOp400012_20_0;
    recovery.source.CarrierOps.discard(__stackOp400012_20_1);
    recovery.source.CarrierOps.discard(spill400012_12);
    (spill400012_7)[spill400012_8] = spill400012_11;
    if (!((life2_75 >= life5_73))) {
        continue forest_cycle_76;
    }
    break forest_cycle_76;
    }
    e = ((long[])(life6_66));
    f = ((java.lang.Integer[])(new java.lang.Integer[2]));
    DOWN = ((moom.aD)(new moom.aD("DOWN", 0, new moom.kX[] {new moom.kX(moom.kW.f, moom.kW.e, moom.kW.a), new moom.kX(moom.kW.f, moom.kW.e, moom.kW.d), new moom.kX(moom.kW.c, moom.kW.e, moom.kW.d), new moom.kX(moom.kW.c, moom.kW.e, moom.kW.a)})));
    UP = ((moom.aD)(new moom.aD("UP", 1, new moom.kX[] {new moom.kX(moom.kW.f, moom.kW.b, moom.kW.d), new moom.kX(moom.kW.f, moom.kW.b, moom.kW.a), new moom.kX(moom.kW.c, moom.kW.b, moom.kW.a), new moom.kX(moom.kW.c, moom.kW.b, moom.kW.d)})));
    NORTH = ((moom.aD)(new moom.aD("NORTH", 2, new moom.kX[] {new moom.kX(moom.kW.c, moom.kW.b, moom.kW.d), new moom.kX(moom.kW.c, moom.kW.e, moom.kW.d), new moom.kX(moom.kW.f, moom.kW.e, moom.kW.d), new moom.kX(moom.kW.f, moom.kW.b, moom.kW.d)})));
    SOUTH = ((moom.aD)(new moom.aD("SOUTH", 3, new moom.kX[] {new moom.kX(moom.kW.f, moom.kW.b, moom.kW.a), new moom.kX(moom.kW.f, moom.kW.e, moom.kW.a), new moom.kX(moom.kW.c, moom.kW.e, moom.kW.a), new moom.kX(moom.kW.c, moom.kW.b, moom.kW.a)})));
    WEST = ((moom.aD)(new moom.aD("WEST", 4, new moom.kX[] {new moom.kX(moom.kW.f, moom.kW.b, moom.kW.d), new moom.kX(moom.kW.f, moom.kW.e, moom.kW.d), new moom.kX(moom.kW.f, moom.kW.e, moom.kW.a), new moom.kX(moom.kW.f, moom.kW.b, moom.kW.a)})));
    EAST = ((moom.aD)(new moom.aD("EAST", 5, new moom.kX[] {new moom.kX(moom.kW.c, moom.kW.b, moom.kW.a), new moom.kX(moom.kW.c, moom.kW.e, moom.kW.a), new moom.kX(moom.kW.c, moom.kW.e, moom.kW.d), new moom.kX(moom.kW.c, moom.kW.b, moom.kW.d)})));
    c = ((moom.aD[])(moom.aD.a()));
    a = ((moom.aD[])(new moom.aD[__sourceIntrinsic_eb8803ad1f63_invokedynamic400012_105(411, (9184250513716151156L ^ life11_11))]));
    (moom.aD.a)[moom.kW.e] = moom.aD.DOWN;
    (moom.aD.a)[moom.kW.b] = moom.aD.UP;
    (moom.aD.a)[moom.kW.d] = moom.aD.NORTH;
    (moom.aD.a)[moom.kW.a] = moom.aD.SOUTH;
    (moom.aD.a)[moom.kW.f] = moom.aD.WEST;
    (moom.aD.a)[moom.kW.c] = moom.aD.EAST;
}


public static moom.aD[] values() {
return ((moom.aD[])(((moom.aD[])(moom.aD.c)).clone()));
}


public static moom.aD valueOf(java.lang.String p0) {
return ((moom.aD)(java.lang.Enum.valueOf(((java.lang.Class)(moom.aD.class)), ((java.lang.String)(p0)))));
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 29017;
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
            throw new RuntimeException("moom/aD", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f[var3] = var15;
      }

      return f[var3];
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral6903_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/aD"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.aD.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static moom.aD[] a() {
long local0_life1 = (moom.aD.d ^ 113008164670313L);
    moom.aD[] __sourceSharedArray746_4 = new moom.aD[__sourceIntrinsic_90bd24d3b65c_originalDynamicSite746_2(20133, (2890592862356478069L ^ local0_life1))];
    __sourceSharedArray746_4[0] = moom.aD.DOWN;
    __sourceSharedArray746_4[1] = moom.aD.UP;
    __sourceSharedArray746_4[2] = moom.aD.NORTH;
    __sourceSharedArray746_4[3] = moom.aD.SOUTH;
    __sourceSharedArray746_4[4] = moom.aD.WEST;
    __sourceSharedArray746_4[5] = moom.aD.EAST;
    return __sourceSharedArray746_4;
}


public moom.kX a(int p0) {
return (this.b)[p0];
}


public static moom.aD a(moom.bs p0) {
return (moom.aD.a)[((moom.bs)(p0)).a()];
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400012_105(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_90bd24d3b65c_originalDynamicSite746_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral6903_0() throws E;
}
