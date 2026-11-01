package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class gv extends moom.gc {

private static long r;

private static java.lang.String s;

private static long[] t;

private static java.lang.Integer[] u;

private static java.util.Map v;

public gv(int p0, int p1, int p2) { super(0, 0, 0, 0, 0, (java.lang.String)null); }

private static void __sourceConstructorBody_b1de962f281c7554(moom.gv receiver, int p0, int p1, int p2) throws Throwable {
long local4 = (moom.gv.r ^ 7466130726706L);
    moom.gv.__sourceConstructorInit_b1de962f281c7554_0(((moom.gv)(receiver)), ((int)(p0)), ((int)(p1)), ((int)(p2)), ((int)(__sourceIntrinsic_b1de962f281c7554_originalDynamicSite2793_1(32385, (3662738406928054835L ^ local4)))), ((int)(__sourceIntrinsic_b1de962f281c7554_originalDynamicSite2793_2(24731, (8094567266136613928L ^ local4)))), ((java.lang.String)("")));
    return;
}

private static native <E extends Throwable> void __sourceConstructorInit_b1de962f281c7554_0(moom.gv a0, int a1, int a2, int a3, int a4, int a5, java.lang.String a6) throws E;

static {
r = ((long)(((moom._a)(moom._c.a(((long)(4235451600749293895L)), ((long)(2896124341066399357L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(61395481485117L)))));
    long local11_life6 = (moom.gv.r ^ 123244929533710L);
    javax.crypto.Cipher local13_life8;
    javax.crypto.Cipher __sourceSpill855_10 = (local13_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill855_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill855_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill855_13 = new byte[8];
    (__sourceSpill855_13)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local14_life14 = 1;
    while ((local14_life14 < 8)) {
        (__sourceSpill855_13)[local14_life14] = ((byte) ((int) ((local11_life6 << (local14_life14 * 8)) >>> 56)));
        local14_life14 += 1;
    }
    byte[] __sourcePreallocation855_15 = __sourceSpill855_13;
    ((javax.crypto.Cipher)(__sourceSpill855_10)).init(((int)(__sourceSpill855_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill855_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation855_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    byte[] __sourceSpill855_19 = ((java.lang.String)("äfÌôÙ*ðÙe/Rv§´º2Y$%£÷\002úbÂ^Y¨¦")).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __sourceSpill855_20 = local13_life8;
    byte[] local15_life22 = ((javax.crypto.Cipher)(__sourceSpill855_20)).doFinal(((byte[])(__sourceSpill855_19)));
    s = ((java.lang.String)(((java.lang.String)(moom.gv.a(((byte[])(local15_life22))))).intern()));
    v = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life28;
    javax.crypto.Cipher __sourceSpill855_30 = (local0_life28 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill855_31 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill855_32 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill855_33 = new byte[8];
    (__sourceSpill855_33)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local1_life34 = 1;
    while ((local1_life34 < 8)) {
        (__sourceSpill855_33)[local1_life34] = ((byte) ((int) ((local11_life6 << (local1_life34 * 8)) >>> 56)));
        local1_life34 += 1;
    }
    byte[] __sourcePreallocation855_35 = __sourceSpill855_33;
    ((javax.crypto.Cipher)(__sourceSpill855_30)).init(((int)(__sourceSpill855_31)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill855_32)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation855_35)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life38 = new long[4];
    int local3_life39 = 0;
    java.lang.String local4_life40;
    int local5_life42 = ((java.lang.String)((local4_life40 = "U\030A^ñOÓç¾x\004H\036\025"))).length();
    int local2_life43 = 0;
    do {
        java.lang.String __sourceSpill855_44 = local4_life40;
        int __sourceSpill855_45 = local2_life43;
        local2_life43 += 8;
        byte[] local7_life48 = ((java.lang.String)(((java.lang.String)(__sourceSpill855_44)).substring(((int)(__sourceSpill855_45)), ((int)(local2_life43))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill855_49 = local6_life38;
        int __sourceSpill855_50 = local3_life39;
        local3_life39 += 1;
        long local8_life51 = (((((((((((long) (local7_life48)[0]) & 255L) << 56) | ((((long) (local7_life48)[1]) & 255L) << 48)) | ((((long) (local7_life48)[2]) & 255L) << 40)) | ((((long) (local7_life48)[3]) & 255L) << 32)) | ((((long) (local7_life48)[4]) & 255L) << 24)) | ((((long) (local7_life48)[5]) & 255L) << 16)) | ((((long) (local7_life48)[6]) & 255L) << 8)) | (((long) (local7_life48)[7]) & 255L));
        byte[] __sourceSpill855_52 = new byte[8];
        (__sourceSpill855_52)[0] = ((byte) ((int) (local8_life51 >>> 56)));
        (__sourceSpill855_52)[1] = ((byte) ((int) (local8_life51 >>> 48)));
        (__sourceSpill855_52)[2] = ((byte) ((int) (local8_life51 >>> 40)));
        (__sourceSpill855_52)[3] = ((byte) ((int) (local8_life51 >>> 32)));
        (__sourceSpill855_52)[4] = ((byte) ((int) (local8_life51 >>> 24)));
        (__sourceSpill855_52)[5] = ((byte) ((int) (local8_life51 >>> 16)));
        (__sourceSpill855_52)[6] = ((byte) ((int) (local8_life51 >>> 8)));
        (__sourceSpill855_52)[7] = ((byte) ((int) local8_life51));
        javax.crypto.Cipher __sourceSpill855_53 = local0_life28;
        byte[] local10_life55 = ((javax.crypto.Cipher)(__sourceSpill855_53)).doFinal(((byte[])(__sourceSpill855_52)));
        (__sourceSpill855_49)[__sourceSpill855_50] = (((((((((((long) (local10_life55)[0]) & 255L) << 56) | ((((long) (local10_life55)[1]) & 255L) << 48)) | ((((long) (local10_life55)[2]) & 255L) << 40)) | ((((long) (local10_life55)[3]) & 255L) << 32)) | ((((long) (local10_life55)[4]) & 255L) << 24)) | ((((long) (local10_life55)[5]) & 255L) << 16)) | ((((long) (local10_life55)[6]) & 255L) << 8)) | (((long) (local10_life55)[7]) & 255L));
    } while ((!(local2_life43 >= local5_life42)));
    local5_life42 = ((java.lang.String)((local4_life40 = "xì!²pÈ-½GqÏN"))).length();
    local2_life43 = 0;
    do {
        java.lang.String __sourceSpill855_57 = local4_life40;
        int __sourceSpill855_58 = local2_life43;
        local2_life43 += 8;
        byte[] local7_life61 = ((java.lang.String)(((java.lang.String)(__sourceSpill855_57)).substring(((int)(__sourceSpill855_58)), ((int)(local2_life43))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill855_62 = local6_life38;
        int __sourceSpill855_63 = local3_life39;
        local3_life39 += 1;
        long local8_life64 = (((((((((((long) (local7_life61)[0]) & 255L) << 56) | ((((long) (local7_life61)[1]) & 255L) << 48)) | ((((long) (local7_life61)[2]) & 255L) << 40)) | ((((long) (local7_life61)[3]) & 255L) << 32)) | ((((long) (local7_life61)[4]) & 255L) << 24)) | ((((long) (local7_life61)[5]) & 255L) << 16)) | ((((long) (local7_life61)[6]) & 255L) << 8)) | (((long) (local7_life61)[7]) & 255L));
        byte[] __sourceSpill855_65 = new byte[8];
        (__sourceSpill855_65)[0] = ((byte) ((int) (local8_life64 >>> 56)));
        (__sourceSpill855_65)[1] = ((byte) ((int) (local8_life64 >>> 48)));
        (__sourceSpill855_65)[2] = ((byte) ((int) (local8_life64 >>> 40)));
        (__sourceSpill855_65)[3] = ((byte) ((int) (local8_life64 >>> 32)));
        (__sourceSpill855_65)[4] = ((byte) ((int) (local8_life64 >>> 24)));
        (__sourceSpill855_65)[5] = ((byte) ((int) (local8_life64 >>> 16)));
        (__sourceSpill855_65)[6] = ((byte) ((int) (local8_life64 >>> 8)));
        (__sourceSpill855_65)[7] = ((byte) ((int) local8_life64));
        javax.crypto.Cipher __sourceSpill855_66 = local0_life28;
        byte[] local10_life68 = ((javax.crypto.Cipher)(__sourceSpill855_66)).doFinal(((byte[])(__sourceSpill855_65)));
        (__sourceSpill855_62)[__sourceSpill855_63] = (((((((((((long) (local10_life68)[0]) & 255L) << 56) | ((((long) (local10_life68)[1]) & 255L) << 48)) | ((((long) (local10_life68)[2]) & 255L) << 40)) | ((((long) (local10_life68)[3]) & 255L) << 32)) | ((((long) (local10_life68)[4]) & 255L) << 24)) | ((((long) (local10_life68)[5]) & 255L) << 16)) | ((((long) (local10_life68)[6]) & 255L) << 8)) | (((long) (local10_life68)[7]) & 255L));
    } while ((!(local2_life43 >= local5_life42)));
    t = ((long[])(local6_life38));
    u = ((java.lang.Integer[])(new java.lang.Integer[4]));
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


private static int c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.gv.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int c(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 31639;
      if (u[var3] == null) {
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
         long var5 = t[var3];
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
         Object[] var9 = (Object[])v.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               v.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/gv", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         u[var3] = var15;
      }

      return u[var3];
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral7781_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/gv"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(net.minecraft.client.Minecraft p0, int p1, int p2) {
moom.gv forwardValue3571_12_0;
    moom.gv spill3571_0;
    long life4_3;
    net.minecraft.entity.Entity[] life6_5;
    moom.DD life7_26;
    forward_join_52: {
    forward_join_12: {
    life4_3 = (moom.gv.r ^ 128940485620655L);
    life6_5 = net.minecraft.potion.Potion.b__Arrayr3();
    spill3571_0 = this;
    if (!((life6_5 == null))) {
        forwardValue3571_12_0 = spill3571_0;
        break forward_join_12;
    }
    if (!(((moom.gv)(spill3571_0)).n)) {
        break forward_join_52;
    }
    forwardValue3571_12_0 = this;
    }
    __sourceIntrinsic_de1ba8f88103_call3571_3(forwardValue3571_12_0, p0, p1, p2);
    life7_26 = new moom.DD(moom.gv.s);
    ((net.minecraft.client.renderer.texture.TextureManager)(((net.minecraft.client.Minecraft)(p0)).a__ok())).a__Void(((moom.DD)(life7_26)));
    moom.kZ.c(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    ((moom.gv)(this)).b(((int)((this.i + 3))), ((int)((this.j + 2))), ((int)(0)), ((int)(0)), ((int)(__sourceIntrinsic_de1ba8f88103_invokedynamic3571_10(18502, (3805802589007257707L ^ life4_3)))), ((int)(__sourceIntrinsic_de1ba8f88103_invokedynamic3571_11(17601, (6925397258961661165L ^ life4_3)))));
    }
    return;
}


private static java.lang.String a(byte[] p0) {
int life1_1;
    int life2_5;
    char[] life3_7;
    int life4_9;
    int life5_19;
    int life6_39;
    int life5_44;
    int life6_52;
    int life6_71;
    int life5_76;
    int life6_86;
    int life5_91;
    int life6_99;
    life1_1 = 0;
    life3_7 = new char[(life2_5 = (p0).length)];
    life4_9 = 0;
    loop_region_10: while ((life4_9 < life2_5)) {
        if (((life5_19 = (255 & (p0)[life4_9])) < 192)) {
        (life3_7)[(life1_1++)] = ((char) life5_19);
    } else {
        if ((life5_19 < 224)) {
        life6_39 = ((int)(((char) (((char) (life5_19 & 31)) << 6))));
        byte[] spill4138_0 = p0;
        life4_9 += 1;
        life5_44 = (spill4138_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill4138_1 = p0;
        life4_9 += 1;
        life5_76 = (spill4138_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill4138_2 = p0;
        life4_9 += 1;
        life5_91 = (spill4138_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static native <E extends Throwable> int __sourceIntrinsic_b1de962f281c7554_originalDynamicSite2793_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b1de962f281c7554_originalDynamicSite2793_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral7781_0() throws E;

private static native <E extends Throwable> void __sourceIntrinsic_de1ba8f88103_call3571_3(moom.gv a0, net.minecraft.client.Minecraft a1, int a2, int a3) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_de1ba8f88103_invokedynamic3571_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_de1ba8f88103_invokedynamic3571_11(int a0, long a1) throws E;
}
