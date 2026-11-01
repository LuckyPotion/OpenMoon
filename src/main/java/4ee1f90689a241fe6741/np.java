package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class np {

public static final com.moon.np a;

private final com.moon.jm b;

private final java.lang.String c;

private final com.moon.ch d;

private final java.util.function.Consumer<java.lang.Void> e;

public float f;

public float g;

public float h;

public float i;

private static final long j;

private static final long[] k;

private static final java.lang.Integer[] l;

private static final java.util.Map m;

public np(java.lang.String p0, com.moon.ch p1, java.util.function.Consumer<java.lang.Void> p2) {
super();
    this.b = ((com.moon.runtime.ClientContext.getInstance()).a__jo()).a(com.moon.ce.ROBOTO_MEDIUM);
    this.c = p0;
    this.d = p1;
    this.e = p2;
}


static {
j = ((long)(((moom._a)(moom._c.a(((long)(-7754949825596723811L)), ((long)(-1595616585353875964L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(145610218797718L)))));
    long local15_life6 = (com.moon.np.j ^ 68835569026281L);
    javax.crypto.Cipher local12_life8;
    javax.crypto.Cipher __sourceSpill317_10 = (local12_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill317_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill317_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill317_13 = new byte[8];
    (__sourceSpill317_13)[0] = ((byte) ((int) (local15_life6 >>> 56)));
    int local13_life14 = 1;
    while ((local13_life14 < 8)) {
        (__sourceSpill317_13)[local13_life14] = ((byte) ((int) ((local15_life6 << (local13_life14 * 8)) >>> 56)));
        local13_life14 += 1;
    }
    byte[] __sourcePreallocation317_15 = __sourceSpill317_13;
    ((javax.crypto.Cipher)(__sourceSpill317_10)).init(((int)(__sourceSpill317_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill317_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation317_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    byte[] __sourceSpill317_19 = ((java.lang.String)("\017»î²?¶Ì")).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __sourceSpill317_20 = local12_life8;
    byte[] local14_life22 = ((javax.crypto.Cipher)(__sourceSpill317_20)).doFinal(((byte[])(__sourceSpill317_19)));
    java.lang.String local11_life25 = ((java.lang.String)(com.moon.np.a(((byte[])(local14_life22))))).intern();
    m = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life28;
    javax.crypto.Cipher __sourceSpill317_30 = (local0_life28 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill317_31 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill317_32 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill317_33 = new byte[8];
    (__sourceSpill317_33)[0] = ((byte) ((int) (local15_life6 >>> 56)));
    int local1_life34 = 1;
    while ((local1_life34 < 8)) {
        (__sourceSpill317_33)[local1_life34] = ((byte) ((int) ((local15_life6 << (local1_life34 * 8)) >>> 56)));
        local1_life34 += 1;
    }
    byte[] __sourcePreallocation317_35 = __sourceSpill317_33;
    ((javax.crypto.Cipher)(__sourceSpill317_30)).init(((int)(__sourceSpill317_31)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill317_32)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation317_35)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life38 = new long[2];
    int local3_life39 = 0;
    java.lang.String local4_life40;
    int local5_life42 = ((java.lang.String)((local4_life40 = "K]ùÁeN·2N)R$\036~p"))).length();
    int local2_life43 = 0;
    do {
        java.lang.String __sourceSpill317_44 = local4_life40;
        int __sourceSpill317_45 = local2_life43;
        local2_life43 += 8;
        byte[] local7_life48 = ((java.lang.String)(((java.lang.String)(__sourceSpill317_44)).substring(((int)(__sourceSpill317_45)), ((int)(local2_life43))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill317_49 = local6_life38;
        int __sourceSpill317_50 = local3_life39;
        local3_life39 += 1;
        long local8_life51 = (((((((((((long) (local7_life48)[0]) & 255L) << 56) | ((((long) (local7_life48)[1]) & 255L) << 48)) | ((((long) (local7_life48)[2]) & 255L) << 40)) | ((((long) (local7_life48)[3]) & 255L) << 32)) | ((((long) (local7_life48)[4]) & 255L) << 24)) | ((((long) (local7_life48)[5]) & 255L) << 16)) | ((((long) (local7_life48)[6]) & 255L) << 8)) | (((long) (local7_life48)[7]) & 255L));
        byte[] __sourceSpill317_52 = new byte[8];
        (__sourceSpill317_52)[0] = ((byte) ((int) (local8_life51 >>> 56)));
        (__sourceSpill317_52)[1] = ((byte) ((int) (local8_life51 >>> 48)));
        (__sourceSpill317_52)[2] = ((byte) ((int) (local8_life51 >>> 40)));
        (__sourceSpill317_52)[3] = ((byte) ((int) (local8_life51 >>> 32)));
        (__sourceSpill317_52)[4] = ((byte) ((int) (local8_life51 >>> 24)));
        (__sourceSpill317_52)[5] = ((byte) ((int) (local8_life51 >>> 16)));
        (__sourceSpill317_52)[6] = ((byte) ((int) (local8_life51 >>> 8)));
        (__sourceSpill317_52)[7] = ((byte) ((int) local8_life51));
        javax.crypto.Cipher __sourceSpill317_53 = local0_life28;
        byte[] local10_life55 = ((javax.crypto.Cipher)(__sourceSpill317_53)).doFinal(((byte[])(__sourceSpill317_52)));
        (__sourceSpill317_49)[__sourceSpill317_50] = (((((((((((long) (local10_life55)[0]) & 255L) << 56) | ((((long) (local10_life55)[1]) & 255L) << 48)) | ((((long) (local10_life55)[2]) & 255L) << 40)) | ((((long) (local10_life55)[3]) & 255L) << 32)) | ((((long) (local10_life55)[4]) & 255L) << 24)) | ((((long) (local10_life55)[5]) & 255L) << 16)) | ((((long) (local10_life55)[6]) & 255L) << 8)) | (((long) (local10_life55)[7]) & 255L));
    } while ((!(local2_life43 >= local5_life42)));
    k = ((long[])(local6_life38));
    l = ((java.lang.Integer[])(new java.lang.Integer[2]));
    a = ((com.moon.np)(new com.moon.np(local11_life25, com.moon.ch.ERROR, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite317_59())));
}


public com.moon.np b(float p0) {
this.g = ((float)(p0));
    return this;
}


public float b() {
return this.g;
}


public float c() {
return this.h;
}


public com.moon.np c(float p0) {
this.h = ((float)(p0));
    return this;
}


public float d() {
return this.i;
}


public com.moon.np d(float p0) {
this.i = ((float)(p0));
    return this;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.np.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 24667;
      if (l[var3] == null) {
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
         long var5 = k[var3];
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
         Object[] var9 = (Object[])m.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               m.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/moon/np", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         l[var3] = var15;
      }

      return l[var3];
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
        byte[] spill1421_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1421_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1421_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1421_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1421_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1421_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral3018_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/np"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public com.moon.ch a__ch() {
return this.d;
}


public java.lang.String a__String() {
return this.c;
}


public com.moon.jm a__jm() {
return this.b;
}


public boolean a(float p0, float p1) {
int forwardValue1115_20_0;
    int forwardValue1115_27_0;
    int forwardValue1115_37_0;
    int forwardValue1115_41_0;
    int forwardValue1115_43_0;
    int spill1115_0;
    long life3_3;
    java.lang.String life5_5;
    forward_join_43: {
    forward_join_42: {
    forward_join_41: {
    forward_join_37: {
    forward_join_27: {
    forward_join_20: {
    life3_3 = (com.moon.np.j ^ 95111802167983L);
    life5_5 = com.moon.ch.b();
    spill1115_0 = recovery.source.CarrierOps.fcmpl(((float)(p0)), ((float)(this.f)));
    if (!((life5_5 == null))) {
        forwardValue1115_20_0 = spill1115_0;
        break forward_join_20;
    }
    if (!((spill1115_0 >= 0))) {
        break forward_join_42;
    }
    forwardValue1115_20_0 = recovery.source.CarrierOps.fcmpg(((float)(p0)), ((float)((this.f + this.h))));
    }
    if (!((life5_5 == null))) {
        forwardValue1115_27_0 = forwardValue1115_20_0;
        break forward_join_27;
    }
    if (!((forwardValue1115_20_0 <= 0))) {
        break forward_join_42;
    }
    forwardValue1115_27_0 = recovery.source.CarrierOps.fcmpl(((float)(p1)), ((float)(this.g)));
    }
    if (!((life5_5 == null))) {
        forwardValue1115_37_0 = forwardValue1115_27_0;
        break forward_join_37;
    }
    if (!((forwardValue1115_27_0 >= 0))) {
        break forward_join_42;
    }
    forwardValue1115_37_0 = recovery.source.CarrierOps.fcmpg(((float)(p1)), ((float)((this.g + this.i))));
    }
    if (!((life5_5 == null))) {
        forwardValue1115_41_0 = forwardValue1115_37_0;
        break forward_join_41;
    }
    if (!((forwardValue1115_37_0 <= 0))) {
        break forward_join_42;
    }
    forwardValue1115_41_0 = 1;
    }
    forwardValue1115_43_0 = forwardValue1115_41_0;
    break forward_join_43;
    }
    forwardValue1115_43_0 = 0;
    }
    return ((forwardValue1115_43_0) != 0);
}


public void a(com.moon.hW p0, com.moon.hW p1, com.moon.module.impl.ClickGUI p2) {
java.lang.Object forestValue253_33_0;
    int forestValue253_35_0;
    int[] spill253_0;
    long life4_3;
    java.lang.String life6_5;
    int life7_35;
    int life8_37;
    forest_join_72: {
    forest_join_35: {
    forest_join_33: {
    forest_join_30: {
    forest_join_24: {
    forest_join_18: {
    forest_join_14: {
    life4_3 = (com.moon.np.j ^ 7272495276606L);
    life6_5 = com.moon.ch.b();
    spill253_0 = com.moon.nq.a;
    if (!((life6_5 == null))) {
        forestValue253_33_0 = spill253_0;
        break forest_join_33;
    }
    switch ((spill253_0)[((com.moon.ch)(this.d)).ordinal()]) {
default:
{
        break forest_join_14;
    }
case 1:
{
        break forest_join_18;
    }
case 2:
{
        break forest_join_24;
    }
case 3:
{
        break forest_join_30;
    }
}
    }
    throw new java.lang.IncompatibleClassChangeError();
    }
    forestValue253_35_0 = __sourceIntrinsic_4464a398e3e3_invokedynamic253_5(4018, (5407041072102792662L ^ life4_3));
    break forest_join_35;
    }
    forestValue253_35_0 = __sourceIntrinsic_4464a398e3e3_invokedynamic253_6(17393, (8518024593057157524L ^ life4_3));
    break forest_join_35;
    }
    forestValue253_33_0 = ((com.moon.setting.ColorSetting)(((com.moon.module.impl.ClickGUI)(p2)).a__kX())).getValue();
    }
    forestValue253_35_0 = ((java.lang.Integer)(((java.lang.Integer)(forestValue253_33_0)))).intValue();
    }
    life7_35 = forestValue253_35_0;
    life8_37 = -1;
    ((com.moon.hW)(p0)).a(((com.moon.iX)(com.moon.i3.a(((float)(this.f)), ((float)(this.g)), ((float)(this.h)), ((float)(this.i)), ((float)(0x1.8p2f)), ((int)(life7_35))))));
    ((com.moon.jm)(this.b)).b(((com.moon.hW)(p1)), ((java.lang.String)(this.c)), ((float)(0x1.0p3f)), ((float)((this.f + 0x1.8p1f))), ((float)((this.g + 0x1.cp1f))), ((int)(life8_37)));
    if (!((life6_5 != null))) {
        break forest_join_72;
    }
    net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[4])));
    }
    return;
}


public com.moon.np a(float p0) {
this.f = ((float)(p0));
    return this;
}


public void a__Void() {
long local1 = (com.moon.np.j ^ 12213503686188L);
    java.lang.String spill2533_0 = com.moon.ch.b();
    this.h = ((float)((((com.moon.jm)(this.b)).a(((java.lang.String)(this.c)), ((float)(0x1.0p3f))) + 0x1.8p2f)));
    this.i = ((float)((((com.moon.jm)(this.b)).a(((float)(0x1.0p3f))) + 0x1.8p2f)));
    java.lang.String local3 = spill2533_0;
    if ((net.minecraft.entity.Entity.b__ArrayString() != null)) {
        com.moon.ch.b(((java.lang.String)("BYLkib")));
    }
    return;
}


public float a() {
return this.f;
}


public java.util.function.Consumer<java.lang.Void> a__Consumer() {
return this.e;
}


private static void lambda$static$0(java.lang.Void p0) {
java.lang.Object local1 = ((com.moon.module.impl.ClickGUI)(((com.moon.fU)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__fU())).a(((java.lang.Class)(com.moon.module.impl.ClickGUI.class)))));
    ((com.moon.pk)(((com.moon.module.impl.ClickGUI)(local1)).a__pk())).a(((com.moon.nk)(null)));
    return;
}


private static native <E extends Throwable> java.util.function.Consumer __sourceIntrinsic_eb8803ad1f63_originalDynamicSite317_59() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4464a398e3e3_invokedynamic253_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4464a398e3e3_invokedynamic253_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral3018_0() throws E;
}
