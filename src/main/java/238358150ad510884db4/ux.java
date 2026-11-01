package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class ux extends moom.uc {

private final net.minecraft.entity.monster.EntityIronGolem c;

private net.minecraft.entity.passive.EntityVillager d;

private int e;

private static final long f;

private static final long[] g;

private static final java.lang.Integer[] h;

private static final java.util.Map i;

public ux(net.minecraft.entity.monster.EntityIronGolem p0) {
super();
    this.c = p0;
    (this).a(3);
}


static {
f = ((long)(((moom._a)(moom._c.a(((long)(3446227818021724881L)), ((long)(5305532244682445072L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(180386918869356L)))));
    i = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.ux.f ^ 66302179969106L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1063_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1063_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1063_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1063_14 = new byte[8];
    (__sourceSpill1063_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1063_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1063_16 = __sourceSpill1063_14;
    ((javax.crypto.Cipher)(__sourceSpill1063_11)).init(((int)(__sourceSpill1063_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1063_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1063_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "\030á\021AÌÕz%âûÔsõê"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1063_25 = local6_life21;
        int __sourceSpill1063_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1063_25)).substring(((int)(__sourceSpill1063_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1063_30 = local8_life19;
        int __sourceSpill1063_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1063_33 = new byte[8];
        (__sourceSpill1063_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1063_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1063_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1063_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1063_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1063_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1063_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1063_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1063_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1063_34)).doFinal(((byte[])(__sourceSpill1063_33)));
        (__sourceSpill1063_30)[__sourceSpill1063_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    g = ((long[])(local8_life19));
    h = ((java.lang.Integer[])(new java.lang.Integer[2]));
}


public void b__Void() {
((net.minecraft.entity.monster.EntityIronGolem)(this.c)).l(((boolean)(false)));
    this.d = ((net.minecraft.entity.passive.EntityVillager)(null));
    return;
}


public boolean b__Boolean() {
int forwardValue4250_12_0;
    int forwardValue4250_14_0;
    int spill4250_0;
    long life1_3;
    int life3_5;
    forward_join_14: {
    forward_join_13: {
    forward_join_12: {
    life1_3 = (moom.ux.f ^ 39367280849986L);
    life3_5 = ((moom.uc.e()) ? 1 : 0);
    spill4250_0 = this.e;
    if (!((life3_5 == 0))) {
        forwardValue4250_12_0 = spill4250_0;
        break forward_join_12;
    }
    if (!((spill4250_0 > 0))) {
        break forward_join_13;
    }
    forwardValue4250_12_0 = 1;
    }
    forwardValue4250_14_0 = forwardValue4250_12_0;
    break forward_join_14;
    }
    forwardValue4250_14_0 = 0;
    }
    return ((forwardValue4250_14_0) != 0);
}


public void c() {
((net.minecraft.entity.ai.EntityLookHelper)(((net.minecraft.entity.monster.EntityIronGolem)(this.c)).a__vt())).a(((net.minecraft.entity.Entity)(this.d)), ((float)(0x1.ep4f)), ((float)(0x1.ep4f)));
    this.e -= 1;
    return;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral9406_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/ux"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.ux.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 25174;
      if (h[var3] == null) {
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
         long var5 = g[var3];
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
         Object[] var9 = (Object[])i.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               i.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/ux", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         h[var3] = var15;
      }

      return h[var3];
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public boolean a__Boolean() {
int forwardValue4249_26_0;
    moom.ux forwardValue4249_47_0;
    int forwardValue4249_52_0;
    boolean spill4249_0;
    moom.ux spill4249_1;
    long life1_3;
    int life3_5;
    forward_join_52: {
    forward_join_51: {
    forward_join_47: {
    forward_join_29: {
    forward_join_26: {
    forward_join_15: {
    life1_3 = (moom.ux.f ^ 83007099935955L);
    life3_5 = ((moom.uc.d()) ? 1 : 0);
    spill4249_0 = ((net.minecraft.world.World)(((net.minecraft.entity.monster.EntityIronGolem)(this.c)).i)).e__Boolean();
    if (!((life3_5 != 0))) {
        forwardValue4249_26_0 = ((spill4249_0) ? 1 : 0);
        break forward_join_26;
    }
    if (!((!spill4249_0))) {
        break forward_join_15;
    }
    return ((0) != 0);
    }
    spill4249_1 = this;
    if (!((life3_5 != 0))) {
        forwardValue4249_47_0 = spill4249_1;
        break forward_join_47;
    }
    forwardValue4249_26_0 = ((java.util.Random)(((net.minecraft.entity.monster.EntityIronGolem)(((moom.ux)(spill4249_1)).c)).a__Random())).nextInt(((int)(__sourceIntrinsic_1a14968dced5_invokedynamic4249_10(13687, (1856360506519007190L ^ life1_3)))));
    }
    if (!((forwardValue4249_26_0 != 0))) {
        break forward_join_29;
    }
    return ((0) != 0);
    }
    this.d = ((net.minecraft.entity.passive.EntityVillager)(((net.minecraft.entity.passive.EntityVillager)(((net.minecraft.world.World)(((net.minecraft.entity.monster.EntityIronGolem)(this.c)).i)).a(((java.lang.Class)(net.minecraft.entity.passive.EntityVillager.class)), ((moom.CA)(((moom.CA)(((net.minecraft.entity.monster.EntityIronGolem)(this.c)).b())).b(((double)(0x1.8p2d)), ((double)(0x1.0p1d)), ((double)(0x1.8p2d))))), ((net.minecraft.entity.Entity)(this.c)))))));
    forwardValue4249_47_0 = this;
    }
    if (!((((moom.ux)(forwardValue4249_47_0)).d != null))) {
        break forward_join_51;
    }
    forwardValue4249_52_0 = 1;
    break forward_join_52;
    }
    forwardValue4249_52_0 = 0;
    }
    return ((forwardValue4249_52_0) != 0);
}


public void a__Void() {
long local1 = (moom.ux.f ^ 85018466198767L);
    this.e = ((int)(__sourceIntrinsic_b82a5b29b709_originalDynamicSite1680_1(27596, (8993141893309843792L ^ local1))));
    ((net.minecraft.entity.monster.EntityIronGolem)(this.c)).l(((boolean)(true)));
    return;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral9406_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1a14968dced5_invokedynamic4249_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_originalDynamicSite1680_1(int a0, long a1) throws E;
}
