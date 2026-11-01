package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public abstract class tk extends net.minecraft.entity.EntityLiving implements net.minecraft.entity.passive.IAnimals {

private static final long db;

private static final long[] eb;

private static final java.lang.Integer[] ib;

private static final java.util.Map jb;

public tk(net.minecraft.world.World p0) {
super(p0);
}


static {
db = ((long)(((moom._a)(moom._c.a(((long)(1604573564701547169L)), ((long)(-7267511549476943659L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(204115804410161L)))));
    jb = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.tk.db ^ 126837147062518L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1035_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1035_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1035_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1035_14 = new byte[8];
    (__sourceSpill1035_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1035_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1035_16 = __sourceSpill1035_14;
    ((javax.crypto.Cipher)(__sourceSpill1035_11)).init(((int)(__sourceSpill1035_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1035_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1035_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[3];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "ÉÇÍQ·Kd¢_~\002ö:%[I`ojåè"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1035_25 = local6_life21;
        int __sourceSpill1035_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1035_25)).substring(((int)(__sourceSpill1035_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1035_30 = local8_life19;
        int __sourceSpill1035_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1035_33 = new byte[8];
        (__sourceSpill1035_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1035_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1035_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1035_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1035_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1035_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1035_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1035_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1035_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1035_34)).doFinal(((byte[])(__sourceSpill1035_33)));
        (__sourceSpill1035_30)[__sourceSpill1035_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    eb = ((long[])(local8_life19));
    ib = ((java.lang.Integer[])(new java.lang.Integer[3]));
}


public boolean b__Boolean() {
return ((1) != 0);
}


public void h__Void() {
int forwardValue4091_42_0;
    moom.tk forwardValue4091_46_0;
    int spill4091_0;
    moom.tk spill4091_1;
    moom.tk spill4091_2;
    int spill4091_3;
    long life1_3;
    int life4_7;
    int life3_10;
    forward_join_52: {
    forward_join_46: {
    forward_join_45: {
    forward_join_42: {
    life1_3 = (moom.tk.db ^ 132820899207504L);
    spill4091_0 = moom.vR.c();
    life4_7 = ((moom.tk)(this)).h();
    super.h__Void();
    life3_10 = spill4091_0;
    spill4091_1 = this;
    if (!((life3_10 == 0))) {
        forwardValue4091_46_0 = spill4091_1;
        break forward_join_46;
    }
    if (!(((moom.tk)(spill4091_1)).p__Boolean())) {
        break forward_join_45;
    }
    spill4091_2 = this;
    if (!((life3_10 == 0))) {
        forwardValue4091_46_0 = spill4091_2;
        break forward_join_46;
    }
    if (!((!((moom.tk)(spill4091_2)).j__Boolean()))) {
        break forward_join_45;
    }
    life4_7 += -1;
    ((moom.tk)(this)).d(((int)(life4_7)));
    spill4091_3 = ((moom.tk)(this)).h();
    if (!((life3_10 == 0))) {
        forwardValue4091_42_0 = spill4091_3;
        break forward_join_42;
    }
    if (!((spill4091_3 == __sourceIntrinsic_455b93f512d4_invokedynamic4091_8(11515, (3180802335792606631L ^ life1_3))))) {
        break forward_join_52;
    }
    ((moom.tk)(this)).d(((int)(0)));
    forwardValue4091_42_0 = ((((moom.tk)(this)).a__Boolean(((net.minecraft.util.DamageSource)(net.minecraft.util.DamageSource.f)), ((float)(0x1.0p1f)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue4091_42_0);
    if (!((life3_10 != 0))) {
        break forward_join_52;
    }
    }
    forwardValue4091_46_0 = this;
    }
    ((moom.tk)(forwardValue4091_46_0)).d(((int)(__sourceIntrinsic_455b93f512d4_invokedynamic4091_14(16653, (1517682863562244178L ^ life1_3)))));
    }
    return;
}


public int l() {
long local1 = (moom.tk.db ^ 14974620867178L);
    return __sourceIntrinsic_d0e131a72963_originalDynamicSite1655_1(27002, (7672224340721363741L ^ local1));
}


private static java.lang.invoke.CallSite d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral9198_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/tk"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int d(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 13362;
      if (ib[var3] == null) {
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
         long var5 = eb[var3];
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
         Object[] var9 = (Object[])jb.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               jb.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/tk", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         ib[var3] = var15;
      }

      return ib[var3];
}


private static int d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.tk.d(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


protected int a(net.minecraft.entity.player.EntityPlayer p0) {
return (1 + ((java.util.Random)(((net.minecraft.world.World)(((moom.tk)(this)).i)).u)).nextInt(((int)(3))));
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public boolean A__sourceReturn_aae029aa0a() {
return ((0) != 0);
}


public boolean N__Boolean() {
return ((1) != 0);
}


protected boolean M() {
return ((1) != 0);
}


public boolean O__Boolean() {
return (__sourceIntrinsic_booleanComparison((((net.minecraft.world.World)(((moom.tk)(this)).i)).a(((moom.CA)(((moom.tk)(this)).b())), ((net.minecraft.entity.Entity)(this))))) != 0);
}


private static native <E extends Throwable> int __sourceIntrinsic_455b93f512d4_invokedynamic4091_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_455b93f512d4_invokedynamic4091_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d0e131a72963_originalDynamicSite1655_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral9198_0() throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
