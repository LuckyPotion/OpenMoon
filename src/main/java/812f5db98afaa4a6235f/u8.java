package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class u8 extends moom.uc {

protected net.minecraft.entity.EntityLiving c;

protected net.minecraft.entity.Entity d;

protected float e;

private int f;

private final float g;

protected java.lang.Class<? extends net.minecraft.entity.Entity> h;

private static final long l;

private static final long[] m;

private static final java.lang.Integer[] n;

private static final java.util.Map o;

public u8(net.minecraft.entity.EntityLiving p0, java.lang.Class<? extends net.minecraft.entity.Entity> p1, float p2) {
super();
    this.c = p0;
    this.h = p1;
    this.e = p2;
    this.g = 0x1.47ae140000000p-6f;
    (this).a(2);
}


public u8(net.minecraft.entity.EntityLiving p0, java.lang.Class<? extends net.minecraft.entity.Entity> p1, float p2, float p3) {
super();
    this.c = p0;
    this.h = p1;
    this.e = p2;
    this.g = p3;
    (this).a(2);
}


static {
l = ((long)(((moom._a)(moom._c.a(((long)(-5290037642235670131L)), ((long)(691930268640386152L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(5296237193871L)))));
    o = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.u8.l ^ 139004436488188L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1041_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1041_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1041_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1041_14 = new byte[8];
    (__sourceSpill1041_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1041_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1041_16 = __sourceSpill1041_14;
    ((javax.crypto.Cipher)(__sourceSpill1041_11)).init(((int)(__sourceSpill1041_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1041_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1041_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "X\030·¯ì\020¿ö\0067\025ÝDÓ"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1041_25 = local6_life21;
        int __sourceSpill1041_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1041_25)).substring(((int)(__sourceSpill1041_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1041_30 = local8_life19;
        int __sourceSpill1041_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1041_33 = new byte[8];
        (__sourceSpill1041_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1041_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1041_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1041_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1041_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1041_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1041_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1041_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1041_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1041_34)).doFinal(((byte[])(__sourceSpill1041_33)));
        (__sourceSpill1041_30)[__sourceSpill1041_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    m = ((long[])(local8_life19));
    n = ((java.lang.Integer[])(new java.lang.Integer[2]));
}


public void b__Void() {
this.d = ((net.minecraft.entity.Entity)(null));
    return;
}


public boolean b__Boolean() {
int forwardValue4131_24_0;
    int forwardValue4131_29_0;
    int forwardValue4131_33_0;
    int forwardValue4131_35_0;
    boolean spill4131_0;
    long life1_3;
    int life3_5;
    forward_join_35: {
    forward_join_34: {
    forward_join_33: {
    forward_join_29: {
    forward_join_24: {
    life1_3 = (moom.u8.l ^ 137739280716046L);
    life3_5 = ((moom.uc.d()) ? 1 : 0);
    spill4131_0 = ((net.minecraft.entity.Entity)(this.d)).p__Boolean();
    if (!((life3_5 != 0))) {
        forwardValue4131_24_0 = ((spill4131_0) ? 1 : 0);
        break forward_join_24;
    }
    if (!(spill4131_0)) {
        break forward_join_34;
    }
    forwardValue4131_24_0 = recovery.source.CarrierOps.dcmpl(((double)(((net.minecraft.entity.EntityLiving)(this.c)).a(((net.minecraft.entity.Entity)(this.d))))), ((double)(((double) (this.e * this.e)))));
    }
    if (!((life3_5 != 0))) {
        forwardValue4131_29_0 = forwardValue4131_24_0;
        break forward_join_29;
    }
    if (!((forwardValue4131_24_0 <= 0))) {
        break forward_join_34;
    }
    forwardValue4131_29_0 = this.f;
    }
    if (!((life3_5 != 0))) {
        forwardValue4131_33_0 = forwardValue4131_29_0;
        break forward_join_33;
    }
    if (!((forwardValue4131_29_0 > 0))) {
        break forward_join_34;
    }
    forwardValue4131_33_0 = 1;
    }
    forwardValue4131_35_0 = forwardValue4131_33_0;
    break forward_join_35;
    }
    forwardValue4131_35_0 = 0;
    }
    return ((forwardValue4131_35_0) != 0);
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public void c() {
((net.minecraft.entity.ai.EntityLookHelper)(((net.minecraft.entity.EntityLiving)(this.c)).a__vt())).a(((double)(((net.minecraft.entity.Entity)(this.d)).n)), ((double)((((net.minecraft.entity.Entity)(this.d)).o + ((double) ((net.minecraft.entity.Entity)(this.d)).e__Float())))), ((double)(((net.minecraft.entity.Entity)(this.d)).p)), ((float)(0x1.4p3f)), ((float)(((float) ((net.minecraft.entity.EntityLiving)(this.c)).m__Int()))));
    this.f -= 1;
    return;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral9265_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/u8"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.u8.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 16473;
      if (n[var3] == null) {
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
         long var5 = m[var3];
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
         Object[] var9 = (Object[])o.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               o.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/u8", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         n[var3] = var15;
      }

      return n[var3];
}


public boolean a__Boolean() {
net.minecraft.entity.EntityLivingBase forwardValue4130_23_0;
    moom.u8 forwardValue4130_30_0;
    moom.u8 forwardValue4130_49_0;
    int forwardValue4130_75_0;
    net.minecraft.entity.EntityLiving spill4130_0;
    moom.u8 spill4130_1;
    long life1_3;
    int life3_5;
    forward_join_75: {
    forward_join_74: {
    forward_join_69: {
    forward_join_49: {
    forward_join_48: {
    forward_join_30: {
    forward_join_29: {
    forward_join_23: {
    forward_join_18: {
    life1_3 = (moom.u8.l ^ 24148933409183L);
    life3_5 = ((moom.uc.e()) ? 1 : 0);
    spill4130_0 = this.c;
    if (!((life3_5 == 0))) {
        forwardValue4130_23_0 = spill4130_0;
        break forward_join_23;
    }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(((java.util.Random)(((net.minecraft.entity.EntityLiving)(spill4130_0)).a__Random())).nextFloat())), ((float)(this.g))) >= 0))) {
        break forward_join_18;
    }
    return ((0) != 0);
    }
    spill4130_1 = this;
    if (!((life3_5 == 0))) {
        forwardValue4130_30_0 = spill4130_1;
        break forward_join_30;
    }
    forwardValue4130_23_0 = ((net.minecraft.entity.EntityLiving)(((moom.u8)(spill4130_1)).c)).d__sourceReturn_d30556f370();
    }
    if (!((forwardValue4130_23_0 != null))) {
        break forward_join_29;
    }
    this.d = ((net.minecraft.entity.Entity)(((net.minecraft.entity.EntityLiving)(this.c)).d__sourceReturn_d30556f370()));
    }
    forwardValue4130_30_0 = this;
    }
    if (!((life3_5 == 0))) {
        forwardValue4130_49_0 = forwardValue4130_30_0;
        break forward_join_49;
    }
    if (!((((moom.u8)(forwardValue4130_30_0)).h == net.minecraft.entity.player.EntityPlayer.class))) {
        break forward_join_48;
    }
    this.d = ((net.minecraft.entity.Entity)(((net.minecraft.world.World)(((net.minecraft.entity.EntityLiving)(this.c)).i)).a(((net.minecraft.entity.Entity)(this.c)), ((double)(((double) this.e))))));
    if (!((life3_5 != 0))) {
        break forward_join_69;
    }
    }
    forwardValue4130_49_0 = this;
    }
    ((moom.u8)(forwardValue4130_49_0)).d = ((net.minecraft.entity.Entity)(((net.minecraft.world.World)(((net.minecraft.entity.EntityLiving)(this.c)).i)).a(((java.lang.Class)(this.h)), ((moom.CA)(((moom.CA)(((net.minecraft.entity.EntityLiving)(this.c)).b())).b(((double)(((double) this.e))), ((double)(0x1.8p1d)), ((double)(((double) this.e)))))), ((net.minecraft.entity.Entity)(this.c)))));
    }
    if (!((this.d != null))) {
        break forward_join_74;
    }
    forwardValue4130_75_0 = 1;
    break forward_join_75;
    }
    forwardValue4130_75_0 = 0;
    }
    return ((forwardValue4130_75_0) != 0);
}


public void a__Void() {
long local1 = (moom.u8.l ^ 21830837879203L);
    this.f = ((int)((__sourceIntrinsic_b82a5b29b709_originalDynamicSite1671_1(1024, (8417687582916969618L ^ local1)) + ((java.util.Random)(((net.minecraft.entity.EntityLiving)(this.c)).a__Random())).nextInt(((int)(__sourceIntrinsic_b82a5b29b709_originalDynamicSite1671_4(2342, (2954490348909857205L ^ local1))))))));
    return;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral9265_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_originalDynamicSite1671_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_originalDynamicSite1671_4(int a0, long a1) throws E;
}
