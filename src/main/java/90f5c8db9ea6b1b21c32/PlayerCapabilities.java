package net.minecraft.entity.player;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class PlayerCapabilities {

public boolean a;

public boolean b;

public boolean c;

public boolean d;

public boolean e;

private float f;

private float g;

private static int[] h;

private static final long i;

private static final long[] j;

private static final java.lang.Integer[] k;

private static final java.util.Map l;

public PlayerCapabilities() {
super();
    this.e = true;
    this.f = 0x1.99999a0000000p-5f;
    this.g = 0x1.99999a0000000p-4f;
}


static {
i = ((long)(((moom._a)(moom._c.a(((long)(8703121901769210697L)), ((long)(-2884585790985662356L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(134584691797890L)))));
    java.lang.Object __sourceSpill1197_6 = null;
    l = ((java.util.Map)(new java.util.HashMap(13)));
    net.minecraft.entity.player.PlayerCapabilities.b(((int[])(__sourceSpill1197_6)));
    long local0_life9 = (net.minecraft.entity.player.PlayerCapabilities.i ^ 116979627560777L);
    javax.crypto.Cipher local2_life11;
    javax.crypto.Cipher __sourceSpill1197_13 = (local2_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1197_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1197_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1197_16 = new byte[8];
    (__sourceSpill1197_16)[0] = ((byte) ((int) (local0_life9 >>> 56)));
    int local3_life17 = 1;
    while ((local3_life17 < 8)) {
        (__sourceSpill1197_16)[local3_life17] = ((byte) ((int) ((local0_life9 << (local3_life17 * 8)) >>> 56)));
        local3_life17 += 1;
    }
    byte[] __sourcePreallocation1197_18 = __sourceSpill1197_16;
    ((javax.crypto.Cipher)(__sourceSpill1197_13)).init(((int)(__sourceSpill1197_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1197_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1197_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life21 = new long[2];
    int local5_life22 = 0;
    java.lang.String local6_life23;
    int local7_life25 = ((java.lang.String)((local6_life23 = "\r¥ó\005 rµ·\005|Ì\\\024X»^"))).length();
    int local4_life26 = 0;
    do {
        java.lang.String __sourceSpill1197_27 = local6_life23;
        int __sourceSpill1197_28 = local4_life26;
        local4_life26 += 8;
        byte[] local9_life31 = ((java.lang.String)(((java.lang.String)(__sourceSpill1197_27)).substring(((int)(__sourceSpill1197_28)), ((int)(local4_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1197_32 = local8_life21;
        int __sourceSpill1197_33 = local5_life22;
        local5_life22 += 1;
        long local10_life34 = (((((((((((long) (local9_life31)[0]) & 255L) << 56) | ((((long) (local9_life31)[1]) & 255L) << 48)) | ((((long) (local9_life31)[2]) & 255L) << 40)) | ((((long) (local9_life31)[3]) & 255L) << 32)) | ((((long) (local9_life31)[4]) & 255L) << 24)) | ((((long) (local9_life31)[5]) & 255L) << 16)) | ((((long) (local9_life31)[6]) & 255L) << 8)) | (((long) (local9_life31)[7]) & 255L));
        byte[] __sourceSpill1197_35 = new byte[8];
        (__sourceSpill1197_35)[0] = ((byte) ((int) (local10_life34 >>> 56)));
        (__sourceSpill1197_35)[1] = ((byte) ((int) (local10_life34 >>> 48)));
        (__sourceSpill1197_35)[2] = ((byte) ((int) (local10_life34 >>> 40)));
        (__sourceSpill1197_35)[3] = ((byte) ((int) (local10_life34 >>> 32)));
        (__sourceSpill1197_35)[4] = ((byte) ((int) (local10_life34 >>> 24)));
        (__sourceSpill1197_35)[5] = ((byte) ((int) (local10_life34 >>> 16)));
        (__sourceSpill1197_35)[6] = ((byte) ((int) (local10_life34 >>> 8)));
        (__sourceSpill1197_35)[7] = ((byte) ((int) local10_life34));
        javax.crypto.Cipher __sourceSpill1197_36 = local2_life11;
        byte[] local12_life38 = ((javax.crypto.Cipher)(__sourceSpill1197_36)).doFinal(((byte[])(__sourceSpill1197_35)));
        (__sourceSpill1197_32)[__sourceSpill1197_33] = (((((((((((long) (local12_life38)[0]) & 255L) << 56) | ((((long) (local12_life38)[1]) & 255L) << 48)) | ((((long) (local12_life38)[2]) & 255L) << 40)) | ((((long) (local12_life38)[3]) & 255L) << 32)) | ((((long) (local12_life38)[4]) & 255L) << 24)) | ((((long) (local12_life38)[5]) & 255L) << 16)) | ((((long) (local12_life38)[6]) & 255L) << 8)) | (((long) (local12_life38)[7]) & 255L));
    } while ((!(local4_life26 >= local7_life25)));
    j = ((long[])(local8_life21));
    k = ((java.lang.Integer[])(new java.lang.Integer[2]));
}


public void b(float p0) {
this.g = ((float)(p0));
    return;
}


public float b() {
return this.g;
}


public static void b(int[] p0) {
net.minecraft.entity.player.PlayerCapabilities.h = ((int[])(p0));
    return;
}


public static int[] b__ArrayInt() {
return net.minecraft.entity.player.PlayerCapabilities.h;
}


public void b(net.minecraft.nbt.NBTTagCompound p0) {
net.minecraft.nbt.NBTTagCompound forwardValue5442_19_0;
    java.lang.String forwardValue5442_19_1;
    int forwardValue5442_66_0;
    net.minecraft.nbt.NBTTagCompound spill5442_0;
    java.lang.String spill5442_1;
    boolean spill5442_2;
    long life2_3;
    int life4_5;
    net.minecraft.nbt.NBTTagCompound life5_26;
    forward_join_72: {
    forward_join_66: {
    forward_join_62: {
    forward_join_19: {
    life2_3 = (net.minecraft.entity.player.PlayerCapabilities.i ^ 130000083193603L);
    life4_5 = ((net.minecraft.entity.player.InventoryPlayer.b__Boolean()) ? 1 : 0);
    spill5442_0 = p0;
    spill5442_1 = "abilities";
    if (!((life4_5 != 0))) {
        forwardValue5442_19_0 = spill5442_0;
        forwardValue5442_19_1 = spill5442_1;
        break forward_join_19;
    }
    if (!(((net.minecraft.nbt.NBTTagCompound)(spill5442_0)).a__Boolean(((java.lang.String)(spill5442_1)), ((int)(__sourceIntrinsic_ac4a479fad6b_invokedynamic5442_3(8790, (6949800268942245728L ^ life2_3))))))) {
        break forward_join_72;
    }
    forwardValue5442_19_0 = p0;
    forwardValue5442_19_1 = "abilities";
    }
    life5_26 = ((net.minecraft.nbt.NBTTagCompound)(forwardValue5442_19_0)).a__yw(((java.lang.String)(forwardValue5442_19_1)));
    this.a = ((boolean)(((net.minecraft.nbt.NBTTagCompound)(life5_26)).b__Boolean(((java.lang.String)("invulnerable")))));
    this.b = ((boolean)(((net.minecraft.nbt.NBTTagCompound)(life5_26)).b__Boolean(((java.lang.String)("flying")))));
    this.c = ((boolean)(((net.minecraft.nbt.NBTTagCompound)(life5_26)).b__Boolean(((java.lang.String)("mayfly")))));
    this.d = ((boolean)(((net.minecraft.nbt.NBTTagCompound)(life5_26)).b__Boolean(((java.lang.String)("instabuild")))));
    spill5442_2 = ((net.minecraft.nbt.NBTTagCompound)(life5_26)).a__Boolean(((java.lang.String)("flySpeed")), ((int)(__sourceIntrinsic_ac4a479fad6b_invokedynamic5442_14(11796, (6984899165770347299L ^ life2_3)))));
    if (!((life4_5 != 0))) {
        forwardValue5442_66_0 = ((spill5442_2) ? 1 : 0);
        break forward_join_66;
    }
    if (!(spill5442_2)) {
        break forward_join_62;
    }
    this.f = ((float)(((net.minecraft.nbt.NBTTagCompound)(life5_26)).a__Float(((java.lang.String)("flySpeed")))));
    this.g = ((float)(((net.minecraft.nbt.NBTTagCompound)(life5_26)).a__Float(((java.lang.String)("walkSpeed")))));
    }
    forwardValue5442_66_0 = ((((net.minecraft.nbt.NBTTagCompound)(life5_26)).a__Boolean(((java.lang.String)("mayBuild")), ((int)(1)))) ? 1 : 0);
    }
    if (!((forwardValue5442_66_0 != 0))) {
        break forward_join_72;
    }
    this.e = ((boolean)(((net.minecraft.nbt.NBTTagCompound)(life5_26)).b__Boolean(((java.lang.String)("mayBuild")))));
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 11627;
      if (k[var3] == null) {
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
         long var5 = j[var3];
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
         Object[] var9 = (Object[])l.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               l.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/v1", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         k[var3] = var15;
      }

      return k[var3];
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral11856_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/v1"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.entity.player.PlayerCapabilities.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public void a(net.minecraft.nbt.NBTTagCompound p0) {
net.minecraft.nbt.NBTTagCompound local2 = new net.minecraft.nbt.NBTTagCompound();
    ((net.minecraft.nbt.NBTTagCompound)(local2)).a(((java.lang.String)("invulnerable")), ((boolean)(this.a)));
    ((net.minecraft.nbt.NBTTagCompound)(local2)).a(((java.lang.String)("flying")), ((boolean)(this.b)));
    ((net.minecraft.nbt.NBTTagCompound)(local2)).a(((java.lang.String)("mayfly")), ((boolean)(this.c)));
    ((net.minecraft.nbt.NBTTagCompound)(local2)).a(((java.lang.String)("instabuild")), ((boolean)(this.d)));
    ((net.minecraft.nbt.NBTTagCompound)(local2)).a(((java.lang.String)("mayBuild")), ((boolean)(this.e)));
    ((net.minecraft.nbt.NBTTagCompound)(local2)).a(((java.lang.String)("flySpeed")), ((float)(this.f)));
    ((net.minecraft.nbt.NBTTagCompound)(local2)).a(((java.lang.String)("walkSpeed")), ((float)(this.g)));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("abilities")), ((net.minecraft.nbt.NBTBase)(local2)));
    return;
}


public float a() {
return this.f;
}


public void a(float p0) {
this.f = ((float)(p0));
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_ac4a479fad6b_invokedynamic5442_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ac4a479fad6b_invokedynamic5442_14(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral11856_0() throws E;
}
