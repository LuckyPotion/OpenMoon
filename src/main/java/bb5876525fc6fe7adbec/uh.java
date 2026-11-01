package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class uh<T extends net.minecraft.entity.Entity> extends moom.uc {

private final com.google.common.base.Predicate<net.minecraft.entity.Entity> c;

protected moom.sI d;

private final double e;

private final double f;

protected T g;

private final float h;

private moom.AT i;

private final moom.AV j;

private final java.lang.Class<T> k;

private final com.google.common.base.Predicate<? super T> l;

private static final long n;

private static final long[] o;

private static final java.lang.Integer[] p;

private static final java.util.Map q;

public uh(moom.sI p0, java.lang.Class<T> p1, float p2, double p3, double p4) {
this(((moom.sI)(p0)), ((java.lang.Class)(p1)), ((com.google.common.base.Predicate)(com.google.common.base.Predicates.alwaysTrue())), ((float)(p2)), ((double)(p3)), ((double)(p4)));
    return;
}


public uh(moom.sI p0, java.lang.Class<T> p1, com.google.common.base.Predicate<? super T> p2, float p3, double p4, double p5) {
super();
    this.c = ((com.google.common.base.Predicate)(__sourceIntrinsic_9a9ac862315e_originalDynamicSite5032_0(this)));
    this.d = ((moom.sI)(p0));
    this.k = ((java.lang.Class)(p1));
    this.l = ((com.google.common.base.Predicate)(p2));
    this.h = ((float)(p3));
    this.e = ((double)(p4));
    this.f = ((double)(p5));
    this.j = ((moom.AV)(__sourceExactCall_61e3a024849730(((moom.sI)(p0)))));
    ((moom.uh)(this)).a(((int)(1)));
    return;
}


static {
n = ((long)(((moom._a)(moom._c.a(((long)(914934571400838880L)), ((long)(2122726584172658545L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(9476599930350L)))));
    q = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.uh.n ^ 98237922641900L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1056_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1056_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1056_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1056_14 = new byte[8];
    (__sourceSpill1056_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1056_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1056_16 = __sourceSpill1056_14;
    ((javax.crypto.Cipher)(__sourceSpill1056_11)).init(((int)(__sourceSpill1056_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1056_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1056_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "@Ï*sÕóùI l'§\000"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1056_25 = local6_life21;
        int __sourceSpill1056_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1056_25)).substring(((int)(__sourceSpill1056_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1056_30 = local8_life19;
        int __sourceSpill1056_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1056_33 = new byte[8];
        (__sourceSpill1056_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1056_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1056_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1056_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1056_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1056_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1056_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1056_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1056_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1056_34)).doFinal(((byte[])(__sourceSpill1056_33)));
        (__sourceSpill1056_30)[__sourceSpill1056_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    o = ((long[])(local8_life19));
    p = ((java.lang.Integer[])(new java.lang.Integer[2]));
}


public void b__Void() {
this.g = (((T)((net.minecraft.entity.Entity)(null))));
    return;
}


public boolean b__Boolean() {
int forwardValue4202_13_0;
    int forwardValue4202_15_0;
    boolean spill4202_0;
    long life1_3;
    int life3_5;
    forward_join_15: {
    forward_join_14: {
    forward_join_13: {
    life1_3 = (moom.uh.n ^ 129565538456529L);
    life3_5 = ((moom.uc.e()) ? 1 : 0);
    spill4202_0 = ((moom.AV)(this.j)).a__Boolean();
    if (!((life3_5 == 0))) {
        forwardValue4202_13_0 = ((spill4202_0) ? 1 : 0);
        break forward_join_13;
    }
    if (!((!spill4202_0))) {
        break forward_join_14;
    }
    forwardValue4202_13_0 = 1;
    }
    forwardValue4202_15_0 = forwardValue4202_13_0;
    break forward_join_15;
    }
    forwardValue4202_15_0 = 0;
    }
    return ((forwardValue4202_15_0) != 0);
}


public void c() {
moom.sI forwardValue4203_26_0;
    moom.sI spill4203_0;
    long life1_3;
    int life3_5;
    forward_join_30: {
    forward_join_26: {
    forward_join_24: {
    life1_3 = (moom.uh.n ^ 36065611280754L);
    life3_5 = ((moom.uc.d()) ? 1 : 0);
    spill4203_0 = this.d;
    if (!((life3_5 != 0))) {
        forwardValue4203_26_0 = spill4203_0;
        break forward_join_26;
    }
    if (!((recovery.source.CarrierOps.dcmpg(((double)(((moom.sI)(spill4203_0)).a(((net.minecraft.entity.Entity)(this.g))))), ((double)(0x1.88p5d))) < 0))) {
        break forward_join_24;
    }
    ((moom.AV)(((moom.sI)(this.d)).a__sourceReturn_407923443b())).a(((double)(this.f)));
    if (!((life3_5 == 0))) {
        break forward_join_30;
    }
    }
    forwardValue4203_26_0 = this.d;
    }
    ((moom.AV)(((moom.sI)(forwardValue4203_26_0)).a__sourceReturn_407923443b())).a(((double)(this.e)));
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 11280;
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
            throw new RuntimeException("moom/uh", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         p[var3] = var15;
      }

      return p[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.uh.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral9352_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/uh"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public boolean a__Boolean() {
moom.uh forwardValue4201_116_0;
    moom.AT forwardValue4201_122_0;
    int forwardValue4201_128_0;
    int forwardValue4201_130_0;
    boolean spill4201_0;
    moom.uh spill4201_1;
    moom.AT spill4201_2;
    boolean spill4201_3;
    long life1_3;
    java.util.List life4_39;
    int life3_40;
    moom.DR life5_84;
    forward_join_130: {
    forward_join_129: {
    forward_join_128: {
    forward_join_122: {
    forward_join_116: {
    forward_join_104: {
    forward_join_84: {
    forward_join_54: {
    forward_join_48: {
    life1_3 = (moom.uh.n ^ 32322373811008L);
    spill4201_0 = moom.uc.e();
    life4_39 = ((net.minecraft.world.World)(((moom.sI)(this.d)).i)).a(((java.lang.Class)(this.k)), ((moom.CA)(((moom.CA)(((moom.sI)(this.d)).b())).b(((double)(((double) this.h))), ((double)(0x1.8p1d)), ((double)(((double) this.h)))))), ((com.google.common.base.Predicate)(com.google.common.base.Predicates.and(((com.google.common.base.Predicate[])(new com.google.common.base.Predicate[] {moom.CY.d, this.c, this.l}))))));
    life3_40 = ((spill4201_0) ? 1 : 0);
    if (!((life3_40 == 0))) {
        break forward_join_54;
    }
    if (!(((java.util.List)(life4_39)).isEmpty())) {
        break forward_join_48;
    }
    return ((0) != 0);
    }
    this.g = (((T)((net.minecraft.entity.Entity)(((net.minecraft.entity.Entity)(((java.util.List)(life4_39)).get(((int)(0)))))))));
    }
    life5_84 = moom.vA.b(((moom.sI)(this.d)), ((int)(__sourceIntrinsic_1a14968dced5_invokedynamic4201_22(18609, (432196628273601622L ^ life1_3)))), ((int)(__sourceIntrinsic_1a14968dced5_invokedynamic4201_23(31383, (5159920784998411889L ^ life1_3)))), ((moom.DR)(new moom.DR(((net.minecraft.entity.Entity)(this.g)).n, ((net.minecraft.entity.Entity)(this.g)).o, ((net.minecraft.entity.Entity)(this.g)).p))));
    if (!((life5_84 == null))) {
        break forward_join_84;
    }
    return ((0) != 0);
    }
    spill4201_1 = this;
    if (!((life3_40 == 0))) {
        forwardValue4201_116_0 = spill4201_1;
        break forward_join_116;
    }
    if (!((recovery.source.CarrierOps.dcmpg(((double)(((net.minecraft.entity.Entity)(((moom.uh)(spill4201_1)).g)).a(((double)(((moom.DR)(life5_84)).a)), ((double)(((moom.DR)(life5_84)).b)), ((double)(((moom.DR)(life5_84)).c))))), ((double)(((net.minecraft.entity.Entity)(this.g)).a(((net.minecraft.entity.Entity)(this.d)))))) < 0))) {
        break forward_join_104;
    }
    return ((0) != 0);
    }
    this.i = ((moom.AT)(((moom.AV)(this.j)).a(((double)(((moom.DR)(life5_84)).a)), ((double)(((moom.DR)(life5_84)).b)), ((double)(((moom.DR)(life5_84)).c)))));
    forwardValue4201_116_0 = this;
    }
    spill4201_2 = ((moom.uh)(forwardValue4201_116_0)).i;
    if (!((life3_40 == 0))) {
        forwardValue4201_122_0 = spill4201_2;
        break forward_join_122;
    }
    if (!((spill4201_2 != null))) {
        break forward_join_129;
    }
    forwardValue4201_122_0 = this.i;
    }
    spill4201_3 = ((moom.AT)(forwardValue4201_122_0)).a(((moom.DR)(life5_84)));
    if (!((life3_40 == 0))) {
        forwardValue4201_128_0 = ((spill4201_3) ? 1 : 0);
        break forward_join_128;
    }
    if (!(spill4201_3)) {
        break forward_join_129;
    }
    forwardValue4201_128_0 = 1;
    }
    forwardValue4201_130_0 = forwardValue4201_128_0;
    break forward_join_130;
    }
    forwardValue4201_130_0 = 0;
    }
    return ((forwardValue4201_130_0) != 0);
}


public void a__Void() {
((moom.AV)(this.j)).a(((moom.AT)(this.i)), ((double)(this.e)));
    return;
}


private boolean lambda$new$0(net.minecraft.entity.Entity p0) {
int forwardValue4204_16_0;
    int forwardValue4204_20_0;
    int forwardValue4204_22_0;
    boolean spill4204_0;
    long life2_3;
    int life4_5;
    forward_join_22: {
    forward_join_21: {
    forward_join_20: {
    forward_join_16: {
    life2_3 = (moom.uh.n ^ 116656480109605L);
    life4_5 = ((moom.uc.d()) ? 1 : 0);
    spill4204_0 = ((net.minecraft.entity.Entity)(p0)).p__Boolean();
    if (!((life4_5 != 0))) {
        forwardValue4204_16_0 = ((spill4204_0) ? 1 : 0);
        break forward_join_16;
    }
    if (!(spill4204_0)) {
        break forward_join_21;
    }
    forwardValue4204_16_0 = ((((net.minecraft.entity.ai.EntitySenses)(((moom.sI)(this.d)).a__vz())).a(((net.minecraft.entity.Entity)(p0)))) ? 1 : 0);
    }
    if (!((life4_5 != 0))) {
        forwardValue4204_20_0 = forwardValue4204_16_0;
        break forward_join_20;
    }
    if (!((forwardValue4204_16_0 != 0))) {
        break forward_join_21;
    }
    forwardValue4204_20_0 = 1;
    }
    forwardValue4204_22_0 = forwardValue4204_20_0;
    break forward_join_22;
    }
    forwardValue4204_22_0 = 0;
    }
    return ((forwardValue4204_22_0) != 0);
}


private static native <E extends Throwable> com.google.common.base.Predicate __sourceIntrinsic_9a9ac862315e_originalDynamicSite5032_0(moom.uh a0) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral9352_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1a14968dced5_invokedynamic4201_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1a14968dced5_invokedynamic4201_23(int a0, long a1) throws E;

private static native moom.AV __sourceExactCall_61e3a024849730(moom.sI p0);
}
