package net.minecraft.world.border;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class WorldBorder {

private java.util.List<net.minecraft.world.border.IBorderListener> a;

private double b;

private double c;

private double d;

private double e;

private long f;

private long g;

private int h;

private double i;

private double j;

private int k;

private int l;

private static net.minecraft.entity.Entity[] m;

private static long o;

private static long[] p;

private static java.lang.Integer[] q;

private static java.util.Map r;

public WorldBorder() { super(); }


private static void __sourceConstructorBody_3915359f59e73ac1(net.minecraft.world.border.WorldBorder receiver) throws Throwable {

long local1_life1 = (net.minecraft.world.border.WorldBorder.o ^ 3917662982488L);

    net.minecraft.entity.Entity[] __sourceSpill978_3 = net.minecraft.world.border.WorldBorder.b__Arrayr3();

    net.minecraft.world.border.WorldBorder.__sourceConstructorInit_3915359f59e73ac1_0(((net.minecraft.world.border.WorldBorder)(receiver)));

    ((net.minecraft.world.border.WorldBorder)(receiver)).a = ((java.util.List)(com.google.common.collect.Lists.newArrayList()));

    net.minecraft.entity.Entity[] local3_life7 = __sourceSpill978_3;

    ((net.minecraft.world.border.WorldBorder)(receiver)).b = ((double)(0x0.0p0d));

    ((net.minecraft.world.border.WorldBorder)(receiver)).c = ((double)(0x0.0p0d));

    ((net.minecraft.world.border.WorldBorder)(receiver)).d = ((double)(0x1.c9c38p25d));

    ((net.minecraft.world.border.WorldBorder)(receiver)).e = ((double)(((net.minecraft.world.border.WorldBorder)(receiver)).d));

    ((net.minecraft.world.border.WorldBorder)(receiver)).h = ((int)(__sourceIntrinsic_3915359f59e73ac1_originalDynamicSite978_13(27446, (6917975647697507797L ^ local1_life1))));

    ((net.minecraft.world.border.WorldBorder)(receiver)).i = ((double)(0x1.999999999999ap-3d));

    ((net.minecraft.world.border.WorldBorder)(receiver)).j = ((double)(0x1.4p2d));

    ((net.minecraft.world.border.WorldBorder)(receiver)).k = ((int)(__sourceIntrinsic_3915359f59e73ac1_originalDynamicSite978_17(21588, (5046912695833930422L ^ local1_life1))));

    ((net.minecraft.world.border.WorldBorder)(receiver)).l = ((int)(__sourceIntrinsic_3915359f59e73ac1_originalDynamicSite978_19(13128, (631765821711011241L ^ local1_life1))));

    if ((local3_life7 == null)) {

        net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[5])));

    }

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_3915359f59e73ac1_0(net.minecraft.world.border.WorldBorder a0) throws E;

static {
o = ((long)(((moom._a)(moom._c.a(((long)(-697046583246180219L)), ((long)(3745040965053575617L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(206036912827128L)))));
    net.minecraft.entity.Entity[] __sourceSpill1217_6 = new net.minecraft.entity.Entity[5];
    r = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life8 = (net.minecraft.world.border.WorldBorder.o ^ 114210527145760L);
    net.minecraft.world.border.WorldBorder.b(((net.minecraft.entity.Entity[])(__sourceSpill1217_6)));
    javax.crypto.Cipher local2_life11;
    javax.crypto.Cipher __sourceSpill1217_13 = (local2_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1217_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1217_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1217_16 = new byte[8];
    (__sourceSpill1217_16)[0] = ((byte) ((int) (local0_life8 >>> 56)));
    int local3_life17 = 1;
    while ((local3_life17 < 8)) {
        (__sourceSpill1217_16)[local3_life17] = ((byte) ((int) ((local0_life8 << (local3_life17 * 8)) >>> 56)));
        local3_life17 += 1;
    }
    byte[] __sourcePreallocation1217_18 = __sourceSpill1217_16;
    ((javax.crypto.Cipher)(__sourceSpill1217_13)).init(((int)(__sourceSpill1217_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1217_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1217_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life21 = new long[3];
    int local5_life22 = 0;
    java.lang.String local6_life23;
    int local7_life25 = ((java.lang.String)((local6_life23 = " P.x3Béé\030\013 'mÍ/y\036\"ï"))).length();
    int local4_life26 = 0;
    do {
        java.lang.String __sourceSpill1217_27 = local6_life23;
        int __sourceSpill1217_28 = local4_life26;
        local4_life26 += 8;
        byte[] local9_life31 = ((java.lang.String)(((java.lang.String)(__sourceSpill1217_27)).substring(((int)(__sourceSpill1217_28)), ((int)(local4_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1217_32 = local8_life21;
        int __sourceSpill1217_33 = local5_life22;
        local5_life22 += 1;
        long local10_life34 = (((((((((((long) (local9_life31)[0]) & 255L) << 56) | ((((long) (local9_life31)[1]) & 255L) << 48)) | ((((long) (local9_life31)[2]) & 255L) << 40)) | ((((long) (local9_life31)[3]) & 255L) << 32)) | ((((long) (local9_life31)[4]) & 255L) << 24)) | ((((long) (local9_life31)[5]) & 255L) << 16)) | ((((long) (local9_life31)[6]) & 255L) << 8)) | (((long) (local9_life31)[7]) & 255L));
        byte[] __sourceSpill1217_35 = new byte[8];
        (__sourceSpill1217_35)[0] = ((byte) ((int) (local10_life34 >>> 56)));
        (__sourceSpill1217_35)[1] = ((byte) ((int) (local10_life34 >>> 48)));
        (__sourceSpill1217_35)[2] = ((byte) ((int) (local10_life34 >>> 40)));
        (__sourceSpill1217_35)[3] = ((byte) ((int) (local10_life34 >>> 32)));
        (__sourceSpill1217_35)[4] = ((byte) ((int) (local10_life34 >>> 24)));
        (__sourceSpill1217_35)[5] = ((byte) ((int) (local10_life34 >>> 16)));
        (__sourceSpill1217_35)[6] = ((byte) ((int) (local10_life34 >>> 8)));
        (__sourceSpill1217_35)[7] = ((byte) ((int) local10_life34));
        javax.crypto.Cipher __sourceSpill1217_36 = local2_life11;
        byte[] local12_life38 = ((javax.crypto.Cipher)(__sourceSpill1217_36)).doFinal(((byte[])(__sourceSpill1217_35)));
        (__sourceSpill1217_32)[__sourceSpill1217_33] = (((((((((((long) (local12_life38)[0]) & 255L) << 56) | ((((long) (local12_life38)[1]) & 255L) << 48)) | ((((long) (local12_life38)[2]) & 255L) << 40)) | ((((long) (local12_life38)[3]) & 255L) << 32)) | ((((long) (local12_life38)[4]) & 255L) << 24)) | ((((long) (local12_life38)[5]) & 255L) << 16)) | ((((long) (local12_life38)[6]) & 255L) << 8)) | (((long) (local12_life38)[7]) & 255L));
    } while ((!(local4_life26 >= local7_life25)));
    p = ((long[])(local8_life21));
    q = ((java.lang.Integer[])(new java.lang.Integer[3]));
}


public double i() {
return this.j;
}


public double b() {
double forwardValue5819_29_0;
    net.minecraft.entity.Entity[] spill5819_0;
    double spill5819_1;
    long life1_3;
    double life4_12;
    net.minecraft.entity.Entity[] life3_13;
    forward_join_29: {
    forward_join_28: {
    life1_3 = (net.minecraft.world.border.WorldBorder.o ^ 13876375436428L);
    spill5819_0 = net.minecraft.world.border.WorldBorder.b__Arrayr3();
    life4_12 = (((net.minecraft.world.border.WorldBorder)(this)).f() - (((net.minecraft.world.border.WorldBorder)(this)).g() / 0x1.0p1d));
    life3_13 = spill5819_0;
    spill5819_1 = life4_12;
    if (!((life3_13 != null))) {
        forwardValue5819_29_0 = spill5819_1;
        break forward_join_29;
    }
    if (!((recovery.source.CarrierOps.dcmpg(((double)(spill5819_1)), ((double)(((double) (-this.h))))) < 0))) {
        break forward_join_28;
    }
    life4_12 = ((double) (-this.h));
    }
    forwardValue5819_29_0 = life4_12;
    }
    return forwardValue5819_29_0;
}


public static net.minecraft.entity.Entity[] b__Arrayr3() {
return net.minecraft.world.border.WorldBorder.m;
}


public static void b(net.minecraft.entity.Entity[] p0) {
m = ((net.minecraft.entity.Entity[])(p0));
    return;
}


public void b(double p0) {
net.minecraft.entity.Entity[] spill1748_0;
    long life3_3;
    java.util.Iterator life6_11;
    net.minecraft.entity.Entity[] life5_12;
    net.minecraft.world.border.IBorderListener life7_19;
    lexical_join_26: {
    life3_3 = (net.minecraft.world.border.WorldBorder.o ^ 113175865397934L);
    spill1748_0 = net.minecraft.world.border.WorldBorder.b__Arrayr3();
    this.j = ((double)(p0));
    life6_11 = ((java.util.List)(((net.minecraft.world.border.WorldBorder)(this)).a__List())).iterator();
    life5_12 = spill1748_0;
    lexical_cycle_13: while (true) {
    if (!(((java.util.Iterator)(life6_11)).hasNext())) {
        break lexical_join_26;
    }
    life7_19 = ((net.minecraft.world.border.IBorderListener)(((java.util.Iterator)(life6_11)).next()));
    ((net.minecraft.world.border.IBorderListener)(life7_19)).c(((net.minecraft.world.border.WorldBorder)(this)), ((double)(p0)));
    if (!((life5_12 == null))) { continue lexical_cycle_13; }
    break lexical_cycle_13;
    }
    }
    return;
}


public int b__Int() {
return this.k;
}


public void b(int p0) {
net.minecraft.entity.Entity[] spill1749_0;
    long life2_3;
    java.util.Iterator life5_11;
    net.minecraft.entity.Entity[] life4_12;
    net.minecraft.world.border.IBorderListener life6_19;
    lexical_join_26: {
    life2_3 = (net.minecraft.world.border.WorldBorder.o ^ 1218762248757L);
    spill1749_0 = net.minecraft.world.border.WorldBorder.b__Arrayr3();
    this.k = ((int)(p0));
    life5_11 = ((java.util.List)(((net.minecraft.world.border.WorldBorder)(this)).a__List())).iterator();
    life4_12 = spill1749_0;
    lexical_cycle_13: while (true) {
    if (!(((java.util.Iterator)(life5_11)).hasNext())) {
        break lexical_join_26;
    }
    life6_19 = ((net.minecraft.world.border.IBorderListener)(((java.util.Iterator)(life5_11)).next()));
    ((net.minecraft.world.border.IBorderListener)(life6_19)).a(((net.minecraft.world.border.WorldBorder)(this)), ((int)(p0)));
    if (!((life4_12 == null))) { continue lexical_cycle_13; }
    break lexical_cycle_13;
    }
    }
    return;
}


public double e() {
return this.b;
}


public int c__Int() {
return this.l;
}


public void c(double p0) {
net.minecraft.entity.Entity[] spill1750_0;
    long life3_3;
    java.util.Iterator life6_11;
    net.minecraft.entity.Entity[] life5_12;
    net.minecraft.world.border.IBorderListener life7_19;
    lexical_join_26: {
    life3_3 = (net.minecraft.world.border.WorldBorder.o ^ 69645863082734L);
    spill1750_0 = net.minecraft.world.border.WorldBorder.b__Arrayr3();
    this.i = ((double)(p0));
    life6_11 = ((java.util.List)(((net.minecraft.world.border.WorldBorder)(this)).a__List())).iterator();
    life5_12 = spill1750_0;
    lexical_cycle_13: while (true) {
    if (!(((java.util.Iterator)(life6_11)).hasNext())) {
        break lexical_join_26;
    }
    life7_19 = ((net.minecraft.world.border.IBorderListener)(((java.util.Iterator)(life6_11)).next()));
    ((net.minecraft.world.border.IBorderListener)(life7_19)).b(((net.minecraft.world.border.WorldBorder)(this)), ((double)(p0)));
    if (!((life5_12 == null))) { continue lexical_cycle_13; }
    break lexical_cycle_13;
    }
    }
    return;
}


public double c() {
double forwardValue5822_27_0;
    net.minecraft.entity.Entity[] spill5822_0;
    double spill5822_1;
    long life1_3;
    double life4_12;
    net.minecraft.entity.Entity[] life3_13;
    forward_join_27: {
    forward_join_26: {
    life1_3 = (net.minecraft.world.border.WorldBorder.o ^ 172979726543L);
    spill5822_0 = net.minecraft.world.border.WorldBorder.b__Arrayr3();
    life4_12 = (((net.minecraft.world.border.WorldBorder)(this)).e() + (((net.minecraft.world.border.WorldBorder)(this)).g() / 0x1.0p1d));
    life3_13 = spill5822_0;
    spill5822_1 = life4_12;
    if (!((life3_13 != null))) {
        forwardValue5822_27_0 = spill5822_1;
        break forward_join_27;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(spill5822_1)), ((double)(((double) this.h)))) > 0))) {
        break forward_join_26;
    }
    life4_12 = ((double) this.h);
    }
    forwardValue5822_27_0 = life4_12;
    }
    return forwardValue5822_27_0;
}


public void c(int p0) {
net.minecraft.entity.Entity[] spill1751_0;
    long life2_3;
    java.util.Iterator life5_11;
    net.minecraft.entity.Entity[] life4_12;
    net.minecraft.world.border.IBorderListener life6_19;
    lexical_join_26: {
    life2_3 = (net.minecraft.world.border.WorldBorder.o ^ 70062785850356L);
    this.l = ((int)(p0));
    spill1751_0 = net.minecraft.world.border.WorldBorder.b__Arrayr3();
    life5_11 = ((java.util.List)(((net.minecraft.world.border.WorldBorder)(this)).a__List())).iterator();
    life4_12 = spill1751_0;
    lexical_cycle_13: while (true) {
    if (!(((java.util.Iterator)(life5_11)).hasNext())) {
        break lexical_join_26;
    }
    life6_19 = ((net.minecraft.world.border.IBorderListener)(((java.util.Iterator)(life5_11)).next()));
    ((net.minecraft.world.border.IBorderListener)(life6_19)).b(((net.minecraft.world.border.WorldBorder)(this)), ((int)(p0)));
    if (!((life4_12 == null))) { continue lexical_cycle_13; }
    break lexical_cycle_13;
    }
    }
    return;
}


public double h() {
return this.e;
}


public double f() {
return this.c;
}


public double d() {
double forwardValue5825_27_0;
    net.minecraft.entity.Entity[] spill5825_0;
    double spill5825_1;
    long life1_3;
    double life4_12;
    net.minecraft.entity.Entity[] life3_13;
    forward_join_27: {
    forward_join_26: {
    life1_3 = (net.minecraft.world.border.WorldBorder.o ^ 139833427508694L);
    spill5825_0 = net.minecraft.world.border.WorldBorder.b__Arrayr3();
    life4_12 = (((net.minecraft.world.border.WorldBorder)(this)).f() + (((net.minecraft.world.border.WorldBorder)(this)).g() / 0x1.0p1d));
    life3_13 = spill5825_0;
    spill5825_1 = life4_12;
    if (!((life3_13 != null))) {
        forwardValue5825_27_0 = spill5825_1;
        break forward_join_27;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(spill5825_1)), ((double)(((double) this.h)))) > 0))) {
        break forward_join_26;
    }
    life4_12 = ((double) this.h);
    }
    forwardValue5825_27_0 = life4_12;
    }
    return forwardValue5825_27_0;
}


public int a__Int() {
return this.h;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral12606_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Fi"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.world.border.WorldBorder.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 21780;
      if (q[var3] == null) {
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
         long var5 = p[var3];
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
         Object[] var9 = (Object[])r.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               r.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/Fi", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         q[var3] = var15;
      }

      return q[var3];
}


public net.minecraft.world.border.EnumBorderStatus a__bG() {
int forwardValue5818_21_0;
    net.minecraft.world.border.EnumBorderStatus forwardValue5818_25_0;
    int spill5818_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_25: {
    forward_join_24: {
    forward_join_21: {
    forward_join_16: {
    life1_3 = (net.minecraft.world.border.WorldBorder.o ^ 137524515337644L);
    life3_5 = net.minecraft.world.border.WorldBorder.b__Arrayr3();
    spill5818_0 = recovery.source.CarrierOps.dcmpg(((double)(this.e)), ((double)(this.d)));
    if (!((life3_5 != null))) {
        forwardValue5818_21_0 = spill5818_0;
        break forward_join_21;
    }
    if (!((spill5818_0 < 0))) {
        break forward_join_16;
    }
    forwardValue5818_25_0 = net.minecraft.world.border.EnumBorderStatus.SHRINKING;
    break forward_join_25;
    }
    forwardValue5818_21_0 = recovery.source.CarrierOps.dcmpl(((double)(this.e)), ((double)(this.d)));
    }
    if (!((forwardValue5818_21_0 > 0))) {
        break forward_join_24;
    }
    forwardValue5818_25_0 = net.minecraft.world.border.EnumBorderStatus.GROWING;
    break forward_join_25;
    }
    forwardValue5818_25_0 = net.minecraft.world.border.EnumBorderStatus.STATIONARY;
    }
    return forwardValue5818_25_0;
}


public double a() {
double forwardValue5810_29_0;
    net.minecraft.entity.Entity[] spill5810_0;
    double spill5810_1;
    long life1_3;
    double life4_12;
    net.minecraft.entity.Entity[] life3_13;
    forward_join_29: {
    forward_join_28: {
    life1_3 = (net.minecraft.world.border.WorldBorder.o ^ 78515996109312L);
    spill5810_0 = net.minecraft.world.border.WorldBorder.b__Arrayr3();
    life4_12 = (((net.minecraft.world.border.WorldBorder)(this)).e() - (((net.minecraft.world.border.WorldBorder)(this)).g() / 0x1.0p1d));
    life3_13 = spill5810_0;
    spill5810_1 = life4_12;
    if (!((life3_13 != null))) {
        forwardValue5810_29_0 = spill5810_1;
        break forward_join_29;
    }
    if (!((recovery.source.CarrierOps.dcmpg(((double)(spill5810_1)), ((double)(((double) (-this.h))))) < 0))) {
        break forward_join_28;
    }
    life4_12 = ((double) (-this.h));
    }
    forwardValue5810_29_0 = life4_12;
    }
    return forwardValue5810_29_0;
}


public void a__Void(double p0, double p1) {
net.minecraft.entity.Entity[] spill1747_0;
    long life5_3;
    java.util.Iterator life8_14;
    net.minecraft.entity.Entity[] life7_15;
    net.minecraft.world.border.IBorderListener life9_22;
    lexical_join_30: {
    life5_3 = (net.minecraft.world.border.WorldBorder.o ^ 100505123196471L);
    this.b = ((double)(p0));
    this.c = ((double)(p1));
    spill1747_0 = net.minecraft.world.border.WorldBorder.b__Arrayr3();
    life8_14 = ((java.util.List)(((net.minecraft.world.border.WorldBorder)(this)).a__List())).iterator();
    life7_15 = spill1747_0;
    lexical_cycle_16: while (true) {
    if (!(((java.util.Iterator)(life8_14)).hasNext())) {
        break lexical_join_30;
    }
    life9_22 = ((net.minecraft.world.border.IBorderListener)(((java.util.Iterator)(life8_14)).next()));
    ((net.minecraft.world.border.IBorderListener)(life9_22)).a(((net.minecraft.world.border.WorldBorder)(this)), ((double)(p0)), ((double)(p1)));
    if (!((life7_15 == null))) { continue lexical_cycle_16; }
    break lexical_cycle_16;
    }
    }
    return;
}


public boolean a(moom.DT p0) {
int forwardValue5814_23_0;
    int forwardValue5814_34_0;
    int forwardValue5814_43_0;
    int forwardValue5814_47_0;
    int forwardValue5814_49_0;
    int spill5814_0;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_49: {
    forward_join_48: {
    forward_join_47: {
    forward_join_43: {
    forward_join_34: {
    forward_join_23: {
    life2_3 = (net.minecraft.world.border.WorldBorder.o ^ 16626665416314L);
    life4_5 = net.minecraft.world.border.WorldBorder.b__Arrayr3();
    spill5814_0 = recovery.source.CarrierOps.dcmpl(((double)(((double) (((moom.DT)(p0)).a() + 1)))), ((double)(((net.minecraft.world.border.WorldBorder)(this)).a())));
    if (!((life4_5 != null))) {
        forwardValue5814_23_0 = spill5814_0;
        break forward_join_23;
    }
    if (!((spill5814_0 > 0))) {
        break forward_join_48;
    }
    forwardValue5814_23_0 = recovery.source.CarrierOps.dcmpg(((double)(((double) ((moom.DT)(p0)).a()))), ((double)(((net.minecraft.world.border.WorldBorder)(this)).c())));
    }
    if (!((life4_5 != null))) {
        forwardValue5814_34_0 = forwardValue5814_23_0;
        break forward_join_34;
    }
    if (!((forwardValue5814_23_0 < 0))) {
        break forward_join_48;
    }
    forwardValue5814_34_0 = recovery.source.CarrierOps.dcmpl(((double)(((double) (((moom.DT)(p0)).c() + 1)))), ((double)(((net.minecraft.world.border.WorldBorder)(this)).b())));
    }
    if (!((life4_5 != null))) {
        forwardValue5814_43_0 = forwardValue5814_34_0;
        break forward_join_43;
    }
    if (!((forwardValue5814_34_0 > 0))) {
        break forward_join_48;
    }
    forwardValue5814_43_0 = recovery.source.CarrierOps.dcmpg(((double)(((double) ((moom.DT)(p0)).c()))), ((double)(((net.minecraft.world.border.WorldBorder)(this)).d())));
    }
    if (!((life4_5 != null))) {
        forwardValue5814_47_0 = forwardValue5814_43_0;
        break forward_join_47;
    }
    if (!((forwardValue5814_43_0 < 0))) {
        break forward_join_48;
    }
    forwardValue5814_47_0 = 1;
    }
    forwardValue5814_49_0 = forwardValue5814_47_0;
    break forward_join_49;
    }
    forwardValue5814_49_0 = 0;
    }
    return ((forwardValue5814_49_0) != 0);
}


public boolean a(moom.Ee p0) {
int forwardValue5815_21_0;
    int forwardValue5815_30_0;
    int forwardValue5815_39_0;
    int forwardValue5815_43_0;
    int forwardValue5815_45_0;
    int spill5815_0;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_45: {
    forward_join_44: {
    forward_join_43: {
    forward_join_39: {
    forward_join_30: {
    forward_join_21: {
    life2_3 = (net.minecraft.world.border.WorldBorder.o ^ 74464877225215L);
    life4_5 = net.minecraft.world.border.WorldBorder.b__Arrayr3();
    spill5815_0 = recovery.source.CarrierOps.dcmpl(((double)(((double) ((moom.Ee)(p0)).e()))), ((double)(((net.minecraft.world.border.WorldBorder)(this)).a())));
    if (!((life4_5 != null))) {
        forwardValue5815_21_0 = spill5815_0;
        break forward_join_21;
    }
    if (!((spill5815_0 > 0))) {
        break forward_join_44;
    }
    forwardValue5815_21_0 = recovery.source.CarrierOps.dcmpg(((double)(((double) ((moom.Ee)(p0)).c()))), ((double)(((net.minecraft.world.border.WorldBorder)(this)).c())));
    }
    if (!((life4_5 != null))) {
        forwardValue5815_30_0 = forwardValue5815_21_0;
        break forward_join_30;
    }
    if (!((forwardValue5815_21_0 < 0))) {
        break forward_join_44;
    }
    forwardValue5815_30_0 = recovery.source.CarrierOps.dcmpl(((double)(((double) ((moom.Ee)(p0)).f()))), ((double)(((net.minecraft.world.border.WorldBorder)(this)).b())));
    }
    if (!((life4_5 != null))) {
        forwardValue5815_39_0 = forwardValue5815_30_0;
        break forward_join_39;
    }
    if (!((forwardValue5815_30_0 > 0))) {
        break forward_join_44;
    }
    forwardValue5815_39_0 = recovery.source.CarrierOps.dcmpg(((double)(((double) ((moom.Ee)(p0)).d()))), ((double)(((net.minecraft.world.border.WorldBorder)(this)).d())));
    }
    if (!((life4_5 != null))) {
        forwardValue5815_43_0 = forwardValue5815_39_0;
        break forward_join_43;
    }
    if (!((forwardValue5815_39_0 < 0))) {
        break forward_join_44;
    }
    forwardValue5815_43_0 = 1;
    }
    forwardValue5815_45_0 = forwardValue5815_43_0;
    break forward_join_45;
    }
    forwardValue5815_45_0 = 0;
    }
    return ((forwardValue5815_45_0) != 0);
}


public boolean a(moom.CA p0) {
int forwardValue5813_19_0;
    int forwardValue5813_27_0;
    int forwardValue5813_35_0;
    int forwardValue5813_39_0;
    int forwardValue5813_41_0;
    int spill5813_0;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_41: {
    forward_join_40: {
    forward_join_39: {
    forward_join_35: {
    forward_join_27: {
    forward_join_19: {
    life2_3 = (net.minecraft.world.border.WorldBorder.o ^ 131294245029509L);
    life4_5 = net.minecraft.world.border.WorldBorder.b__Arrayr3();
    spill5813_0 = recovery.source.CarrierOps.dcmpl(((double)(((moom.CA)(p0)).e)), ((double)(((net.minecraft.world.border.WorldBorder)(this)).a())));
    if (!((life4_5 != null))) {
        forwardValue5813_19_0 = spill5813_0;
        break forward_join_19;
    }
    if (!((spill5813_0 > 0))) {
        break forward_join_40;
    }
    forwardValue5813_19_0 = recovery.source.CarrierOps.dcmpg(((double)(((moom.CA)(p0)).b)), ((double)(((net.minecraft.world.border.WorldBorder)(this)).c())));
    }
    if (!((life4_5 != null))) {
        forwardValue5813_27_0 = forwardValue5813_19_0;
        break forward_join_27;
    }
    if (!((forwardValue5813_19_0 < 0))) {
        break forward_join_40;
    }
    forwardValue5813_27_0 = recovery.source.CarrierOps.dcmpl(((double)(((moom.CA)(p0)).g)), ((double)(((net.minecraft.world.border.WorldBorder)(this)).b())));
    }
    if (!((life4_5 != null))) {
        forwardValue5813_35_0 = forwardValue5813_27_0;
        break forward_join_35;
    }
    if (!((forwardValue5813_27_0 > 0))) {
        break forward_join_40;
    }
    forwardValue5813_35_0 = recovery.source.CarrierOps.dcmpg(((double)(((moom.CA)(p0)).d)), ((double)(((net.minecraft.world.border.WorldBorder)(this)).d())));
    }
    if (!((life4_5 != null))) {
        forwardValue5813_39_0 = forwardValue5813_35_0;
        break forward_join_39;
    }
    if (!((forwardValue5813_35_0 < 0))) {
        break forward_join_40;
    }
    forwardValue5813_39_0 = 1;
    }
    forwardValue5813_41_0 = forwardValue5813_39_0;
    break forward_join_41;
    }
    forwardValue5813_41_0 = 0;
    }
    return ((forwardValue5813_41_0) != 0);
}


public double a(net.minecraft.entity.Entity p0) {
return ((net.minecraft.world.border.WorldBorder)(this)).a(((double)(((net.minecraft.entity.Entity)(p0)).n)), ((double)(((net.minecraft.entity.Entity)(p0)).p)));
}


public double a(double p0, double p1) {
long life5_3;
    double life8_8;
    double life10_13;
    double life12_18;
    double life14_23;
    double life16_27;
    double life16_32;
    net.minecraft.entity.Entity[] life7_33;
    life5_3 = (net.minecraft.world.border.WorldBorder.o ^ 139189731786916L);
    life8_8 = (p1 - ((net.minecraft.world.border.WorldBorder)(this)).b());
    life10_13 = (((net.minecraft.world.border.WorldBorder)(this)).d() - p1);
    life12_18 = (p0 - ((net.minecraft.world.border.WorldBorder)(this)).a());
    life14_23 = (((net.minecraft.world.border.WorldBorder)(this)).c() - p0);
    life16_27 = java.lang.Math.min(((double)(life12_18)), ((double)(life14_23)));
    net.minecraft.entity.Entity[] spill10468_0 = net.minecraft.world.border.WorldBorder.b__Arrayr3();
    life16_32 = java.lang.Math.min(((double)(life16_27)), ((double)(life8_8)));
    life7_33 = spill10468_0;
    double spill10468_1 = java.lang.Math.min(((double)(life16_32)), ((double)(life10_13)));
    if ((net.minecraft.entity.Entity.b__ArrayString() != null)) {
        net.minecraft.world.border.WorldBorder.b(((net.minecraft.entity.Entity[])(new net.minecraft.entity.Entity[5])));
    }
    return spill10468_1;
}


public void a(double p0, double p1, long p2) {
net.minecraft.entity.Entity[] spill1746_0;
    long life7_3;
    java.util.Iterator life10_23;
    net.minecraft.entity.Entity[] life9_24;
    net.minecraft.world.border.IBorderListener life11_31;
    lexical_join_40: {
    life7_3 = (net.minecraft.world.border.WorldBorder.o ^ 70800395874504L);
    this.d = ((double)(p0));
    this.e = ((double)(p1));
    this.g = ((long)(java.lang.System.currentTimeMillis()));
    this.f = ((long)((this.g + p2)));
    spill1746_0 = net.minecraft.world.border.WorldBorder.b__Arrayr3();
    life10_23 = ((java.util.List)(((net.minecraft.world.border.WorldBorder)(this)).a__List())).iterator();
    life9_24 = spill1746_0;
    lexical_cycle_25: while (true) {
    if (!(((java.util.Iterator)(life10_23)).hasNext())) {
        break lexical_join_40;
    }
    life11_31 = ((net.minecraft.world.border.IBorderListener)(((java.util.Iterator)(life10_23)).next()));
    ((net.minecraft.world.border.IBorderListener)(life11_31)).a(((net.minecraft.world.border.WorldBorder)(this)), ((double)(p0)), ((double)(p1)), ((long)(p2)));
    if (!((life9_24 == null))) { continue lexical_cycle_25; }
    break lexical_cycle_25;
    }
    }
    return;
}


public void a(int p0) {
this.h = ((int)(p0));
    return;
}


protected java.util.List<net.minecraft.world.border.IBorderListener> a__List() {
return com.google.common.collect.Lists.newArrayList(((java.lang.Iterable)(this.a)));
}


public void a(net.minecraft.world.border.IBorderListener p0) {
((java.util.List)(this.a)).add(((java.lang.Object)(p0)));
    return;
}


public void a(double p0) {
net.minecraft.entity.Entity[] spill1745_0;
    long life3_3;
    net.minecraft.entity.Entity[] life5_8;
    java.util.Iterator life6_22;
    net.minecraft.world.border.IBorderListener life7_29;
    lexical_join_36: {
    life3_3 = (net.minecraft.world.border.WorldBorder.o ^ 93828419941257L);
    spill1745_0 = net.minecraft.world.border.WorldBorder.b__Arrayr3();
    this.d = ((double)(p0));
    life5_8 = spill1745_0;
    this.e = ((double)(p0));
    this.f = ((long)(java.lang.System.currentTimeMillis()));
    this.g = ((long)(this.f));
    life6_22 = ((java.util.List)(((net.minecraft.world.border.WorldBorder)(this)).a__List())).iterator();
    lexical_cycle_23: while (true) {
    if (!(((java.util.Iterator)(life6_22)).hasNext())) {
        break lexical_join_36;
    }
    life7_29 = ((net.minecraft.world.border.IBorderListener)(((java.util.Iterator)(life6_22)).next()));
    ((net.minecraft.world.border.IBorderListener)(life7_29)).a(((net.minecraft.world.border.WorldBorder)(this)), ((double)(p0)));
    if (!((life5_8 == null))) { continue lexical_cycle_23; }
    break lexical_cycle_23;
    }
    }
    return;
}


public long a__Long() {
net.minecraft.world.border.WorldBorder forwardValue5816_13_0;
    long forwardValue5816_18_0;
    net.minecraft.world.border.WorldBorder spill5816_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_18: {
    forward_join_17: {
    forward_join_13: {
    life1_3 = (net.minecraft.world.border.WorldBorder.o ^ 79836458826035L);
    life3_5 = net.minecraft.world.border.WorldBorder.b__Arrayr3();
    spill5816_0 = this;
    if (!((life3_5 != null))) {
        forwardValue5816_13_0 = spill5816_0;
        break forward_join_13;
    }
    if (!((((net.minecraft.world.border.WorldBorder)(spill5816_0)).a__bG() != net.minecraft.world.border.EnumBorderStatus.STATIONARY))) {
        break forward_join_17;
    }
    forwardValue5816_13_0 = this;
    }
    forwardValue5816_18_0 = (((net.minecraft.world.border.WorldBorder)(forwardValue5816_13_0)).f - java.lang.System.currentTimeMillis());
    break forward_join_18;
    }
    forwardValue5816_18_0 = 0L;
    }
    return forwardValue5816_18_0;
}


public double k() {
net.minecraft.world.border.WorldBorder forwardValue5827_17_0;
    double forwardValue5827_29_0;
    net.minecraft.world.border.WorldBorder spill5827_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_29: {
    forward_join_17: {
    forward_join_16: {
    life1_3 = (net.minecraft.world.border.WorldBorder.o ^ 111532942756170L);
    life3_5 = net.minecraft.world.border.WorldBorder.b__Arrayr3();
    spill5827_0 = this;
    if (!((life3_5 != null))) {
        forwardValue5827_17_0 = spill5827_0;
        break forward_join_17;
    }
    if (!((recovery.source.CarrierOps.lcmp(((long)(((net.minecraft.world.border.WorldBorder)(spill5827_0)).f)), ((long)(this.g))) == 0))) {
        break forward_join_16;
    }
    forwardValue5827_29_0 = 0x0.0p0d;
    break forward_join_29;
    }
    forwardValue5827_17_0 = this;
    }
    forwardValue5827_29_0 = (java.lang.Math.abs(((double)((((net.minecraft.world.border.WorldBorder)(forwardValue5827_17_0)).d - this.e)))) / ((double) (this.f - this.g)));
    }
    return forwardValue5827_29_0;
}


public double g() {
double forwardValue5826_41_0;
    double forwardValue5826_41_1;
    net.minecraft.world.border.WorldBorder forwardValue5826_48_0;
    net.minecraft.world.border.WorldBorder spill5826_0;
    double spill5826_1;
    double spill5826_2;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    double life4_28;
    forward_join_48: {
    forward_join_47: {
    forward_join_43: {
    forward_join_41: {
    life1_3 = (net.minecraft.world.border.WorldBorder.o ^ 101486635099019L);
    life3_5 = net.minecraft.world.border.WorldBorder.b__Arrayr3();
    spill5826_0 = this;
    if (!((life3_5 != null))) {
        forwardValue5826_48_0 = spill5826_0;
        break forward_join_48;
    }
    if (!((((net.minecraft.world.border.WorldBorder)(spill5826_0)).a__bG() != net.minecraft.world.border.EnumBorderStatus.STATIONARY))) {
        break forward_join_47;
    }
    life4_28 = ((double) (((float) (java.lang.System.currentTimeMillis() - this.g)) / ((float) (this.f - this.g))));
    spill5826_1 = life4_28;
    spill5826_2 = 0x1.0p0d;
    if (!((life3_5 != null))) {
        forwardValue5826_41_0 = spill5826_1;
        forwardValue5826_41_1 = spill5826_2;
        break forward_join_41;
    }
    if (!((recovery.source.CarrierOps.dcmpg(((double)(spill5826_1)), ((double)(spill5826_2))) < 0))) {
        break forward_join_43;
    }
    forwardValue5826_41_0 = this.d;
    forwardValue5826_41_1 = ((this.e - this.d) * life4_28);
    }
    return (forwardValue5826_41_0 + forwardValue5826_41_1);
    }
    ((net.minecraft.world.border.WorldBorder)(this)).a(((double)(this.e)));
    }
    forwardValue5826_48_0 = this;
    }
    return ((net.minecraft.world.border.WorldBorder)(forwardValue5826_48_0)).d;
}


public double j() {
return this.i;
}


private static native <E extends Throwable> int __sourceIntrinsic_3915359f59e73ac1_originalDynamicSite978_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3915359f59e73ac1_originalDynamicSite978_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3915359f59e73ac1_originalDynamicSite978_19(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral12606_0() throws E;
}
