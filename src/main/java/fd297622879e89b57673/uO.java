package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class uO extends moom.uc {

private final net.minecraft.entity.passive.EntityHorse c;

private final double d;

private double e;

private double f;

private double g;

private static final long h;

private static final long[] i;

private static final java.lang.Integer[] j;

private static final java.util.Map k;

public uO(net.minecraft.entity.passive.EntityHorse p0, double p1) {
super();
    this.c = p0;
    this.d = p1;
    (this).a(1);
}


static {
h = ((long)(((moom._a)(moom._c.a(((long)(8397252600155602196L)), ((long)(-1428444597843565955L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(55615160071079L)))));
    k = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.uO.h ^ 32925281773841L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1048_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1048_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1048_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1048_14 = new byte[8];
    (__sourceSpill1048_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1048_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1048_16 = __sourceSpill1048_14;
    ((javax.crypto.Cipher)(__sourceSpill1048_11)).init(((int)(__sourceSpill1048_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1048_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1048_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[3];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "S4àp\007\006\fAY>\026æyC­ tÖJø¶\\"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1048_25 = local6_life21;
        int __sourceSpill1048_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1048_25)).substring(((int)(__sourceSpill1048_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1048_30 = local8_life19;
        int __sourceSpill1048_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1048_33 = new byte[8];
        (__sourceSpill1048_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1048_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1048_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1048_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1048_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1048_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1048_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1048_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1048_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1048_34)).doFinal(((byte[])(__sourceSpill1048_33)));
        (__sourceSpill1048_30)[__sourceSpill1048_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    i = ((long[])(local8_life19));
    j = ((java.lang.Integer[])(new java.lang.Integer[3]));
}


public boolean b__Boolean() {
net.minecraft.entity.Entity forwardValue4172_16_0;
    int forwardValue4172_20_0;
    net.minecraft.entity.passive.EntityHorse spill4172_0;
    long life1_3;
    int life3_5;
    forward_join_20: {
    forward_join_19: {
    forward_join_16: {
    life1_3 = (moom.uO.h ^ 72202480955339L);
    life3_5 = ((moom.uc.e()) ? 1 : 0);
    spill4172_0 = this.c;
    if (!((life3_5 == 0))) {
        forwardValue4172_16_0 = spill4172_0;
        break forward_join_16;
    }
    if (!((!((moom.AV)(((net.minecraft.entity.passive.EntityHorse)(spill4172_0)).a__sourceReturn_407923443b())).a__Boolean()))) {
        break forward_join_19;
    }
    forwardValue4172_16_0 = ((net.minecraft.entity.passive.EntityHorse)(this.c)).f;
    }
    if (!((forwardValue4172_16_0 != null))) {
        break forward_join_19;
    }
    forwardValue4172_20_0 = 1;
    break forward_join_20;
    }
    forwardValue4172_20_0 = 0;
    }
    return ((forwardValue4172_20_0) != 0);
}


public void c() {
int forwardValue4173_24_0;
    int forwardValue4173_70_0;
    net.minecraft.entity.Entity forwardValue4173_74_0;
    int spill4173_0;
    net.minecraft.entity.Entity spill4173_1;
    int spill4173_2;
    int spill4173_3;
    long life1_3;
    int life3_5;
    int life4_37;
    int life5_41;
    forward_join_94: {
    forward_join_74: {
    forward_join_71: {
    forward_join_70: {
    forward_join_66: {
    forward_join_24: {
    life1_3 = (moom.uO.h ^ 22750662839656L);
    life3_5 = ((moom.uc.d()) ? 1 : 0);
    spill4173_0 = ((java.util.Random)(((net.minecraft.entity.passive.EntityHorse)(this.c)).a__Random())).nextInt(((int)(__sourceIntrinsic_5b7380e7aa7c_invokedynamic4173_5(30737, (8350459075450270348L ^ life1_3)))));
    if (!((life3_5 != 0))) {
        forwardValue4173_24_0 = spill4173_0;
        break forward_join_24;
    }
    if (!((spill4173_0 == 0))) {
        break forward_join_94;
    }
    spill4173_1 = ((net.minecraft.entity.passive.EntityHorse)(this.c)).f;
    if (!((life3_5 != 0))) {
        forwardValue4173_74_0 = spill4173_1;
        break forward_join_74;
    }
    forwardValue4173_24_0 = ((spill4173_1 instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0);
    }
    if (!((forwardValue4173_24_0 != 0))) {
        break forward_join_71;
    }
    life4_37 = ((net.minecraft.entity.passive.EntityHorse)(this.c)).w__sourceReturn_8abf5c6871();
    life5_41 = ((net.minecraft.entity.passive.EntityHorse)(this.c)).y__sourceReturn_8abf5c6871();
    spill4173_2 = life5_41;
    if (!((life3_5 != 0))) {
        forwardValue4173_70_0 = spill4173_2;
        break forward_join_70;
    }
    if (!((spill4173_2 > 0))) {
        break forward_join_66;
    }
    spill4173_3 = ((java.util.Random)(((net.minecraft.entity.passive.EntityHorse)(this.c)).a__Random())).nextInt(((int)(life5_41)));
    if (!((life3_5 != 0))) {
        forwardValue4173_70_0 = spill4173_3;
        break forward_join_70;
    }
    if (!((spill4173_3 < life4_37))) {
        break forward_join_66;
    }
    ((net.minecraft.entity.passive.EntityHorse)(this.c)).d__sourceReturn_55ee61ea68(((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.entity.passive.EntityHorse)(this.c)).f)))));
    ((net.minecraft.world.World)(((net.minecraft.entity.passive.EntityHorse)(this.c)).i)).a(((net.minecraft.entity.Entity)(this.c)), ((byte)(__sourceIntrinsic_5b7380e7aa7c_invokedynamic4173_25(26103, (3723215184736481128L ^ life1_3)))));
    return;
    }
    forwardValue4173_70_0 = ((net.minecraft.entity.passive.EntityHorse)(this.c)).b__sourceReturn_0f7a48eca2(((int)(5)));
    }
    recovery.source.CarrierOps.discard(forwardValue4173_70_0);
    }
    forwardValue4173_74_0 = ((net.minecraft.entity.passive.EntityHorse)(this.c)).f;
    }
    ((net.minecraft.entity.Entity)(forwardValue4173_74_0)).b(((net.minecraft.entity.Entity)(null)));
    ((net.minecraft.entity.passive.EntityHorse)(this.c)).f = ((net.minecraft.entity.Entity)(null));
    ((net.minecraft.entity.passive.EntityHorse)(this.c)).ai();
    ((net.minecraft.world.World)(((net.minecraft.entity.passive.EntityHorse)(this.c)).i)).a(((net.minecraft.entity.Entity)(this.c)), ((byte)(__sourceIntrinsic_5b7380e7aa7c_invokedynamic4173_40(2200, (6325280209104208390L ^ life1_3)))));
    }
    return;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.uO.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 30810;
      if (j[var3] == null) {
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
         long var5 = i[var3];
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
         Object[] var9 = (Object[])k.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               k.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/uO", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         j[var3] = var15;
      }

      return j[var3];
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral9317_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/uO"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public boolean a__Boolean() {
net.minecraft.entity.passive.EntityHorse forwardValue4171_20_0;
    int forwardValue4171_45_0;
    boolean spill4171_0;
    net.minecraft.entity.passive.EntityHorse spill4171_1;
    long life1_3;
    int life3_5;
    moom.DR life4_35;
    forward_join_45: {
    forward_join_44: {
    forward_join_42: {
    forward_join_30: {
    forward_join_20: {
    life1_3 = (moom.uO.h ^ 45189553211226L);
    life3_5 = ((moom.uc.d()) ? 1 : 0);
    spill4171_0 = ((net.minecraft.entity.passive.EntityHorse)(this.c)).af__Boolean();
    if (!((life3_5 != 0))) {
        forwardValue4171_45_0 = ((spill4171_0) ? 1 : 0);
        break forward_join_45;
    }
    if (!((!spill4171_0))) {
        break forward_join_44;
    }
    spill4171_1 = this.c;
    if (!((life3_5 != 0))) {
        forwardValue4171_20_0 = spill4171_1;
        break forward_join_20;
    }
    if (!((((net.minecraft.entity.passive.EntityHorse)(spill4171_1)).f != null))) {
        break forward_join_44;
    }
    forwardValue4171_20_0 = this.c;
    }
    life4_35 = moom.vA.a(((moom.sI)(forwardValue4171_20_0)), ((int)(5)), ((int)(4)));
    if (!((life3_5 != 0))) {
        break forward_join_42;
    }
    if (!((life4_35 == null))) {
        break forward_join_30;
    }
    return ((0) != 0);
    }
    this.e = ((double)(((moom.DR)(life4_35)).a));
    this.f = ((double)(((moom.DR)(life4_35)).b));
    this.g = ((double)(((moom.DR)(life4_35)).c));
    }
    return ((1) != 0);
    }
    forwardValue4171_45_0 = 0;
    }
    return ((forwardValue4171_45_0) != 0);
}


public void a__Void() {
((moom.AV)(((net.minecraft.entity.passive.EntityHorse)(this.c)).a__sourceReturn_407923443b())).a(((double)(this.e)), ((double)(this.f)), ((double)(this.g)), ((double)(this.d)));
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_5b7380e7aa7c_invokedynamic4173_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b7380e7aa7c_invokedynamic4173_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b7380e7aa7c_invokedynamic4173_40(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral9317_0() throws E;
}
