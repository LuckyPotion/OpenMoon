package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class pd extends moom.gc {

private int r;

private int s;

private java.lang.String t;

public boolean u;

private float v;

private static long w;

private static java.lang.String x;

private static long[] z;

private static java.lang.Integer[] A;

private static java.util.Map E;

public pd(int p0, int p1, int p2, java.lang.String p3, int p4, int p5, float p6) { super(0, 0, 0, 0, 0, (java.lang.String)null); }


private static void __sourceConstructorBody_8ff1d37a80867434(com.moon.pd receiver, int p0, int p1, int p2, java.lang.String p3, int p4, int p5, float p6) throws Throwable {

long local8_life1 = (com.moon.pd.w ^ 70790972813561L);

    com.moon.pd.__sourceConstructorInit_8ff1d37a80867434_0(((com.moon.pd)(receiver)), ((int)(p0)), ((int)(p1)), ((int)(p2)), ((int)(__sourceIntrinsic_8ff1d37a80867434_originalDynamicSite312_2(31369, (7042039044700627261L ^ local8_life1)))), ((int)(__sourceIntrinsic_8ff1d37a80867434_originalDynamicSite312_3(9678, (7671227131579285116L ^ local8_life1)))), ((java.lang.String)("")));

    ((com.moon.pd)(receiver)).v = ((float)(0x1.0p0f));

    ((com.moon.pd)(receiver)).t = ((java.lang.String)(p3));

    net.minecraft.entity.Entity[] __sourceSpill312_9 = moom.cu.a__Arrayr3();

    ((com.moon.pd)(receiver)).r = ((int)(p4));

    ((com.moon.pd)(receiver)).s = ((int)(p5));

    ((com.moon.pd)(receiver)).v = ((float)(((p6 - ((float) p4)) / ((float) (p5 - p4)))));

    net.minecraft.entity.Entity[] local10_life12 = __sourceSpill312_9;

    ((com.moon.pd)(receiver)).k = ((java.lang.String)(((com.moon.pd)(receiver)).c()));

    if ((local10_life12 != null)) {

        net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[3])));

    }

    return;

}



static {
w = ((long)(((moom._a)(moom._c.a(((long)(-7767022829107985463L)), ((long)(-8423408018750066924L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(44786897797258L)))));
    long local11_life6 = (com.moon.pd.w ^ 8403370432921L);
    javax.crypto.Cipher local13_life8;
    javax.crypto.Cipher __sourceSpill370_10 = (local13_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill370_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill370_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill370_13 = new byte[8];
    (__sourceSpill370_13)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local14_life14 = 1;
    while ((local14_life14 < 8)) {
        (__sourceSpill370_13)[local14_life14] = ((byte) ((int) ((local11_life6 << (local14_life14 * 8)) >>> 56)));
        local14_life14 += 1;
    }
    byte[] __sourcePreallocation370_15 = __sourceSpill370_13;
    ((javax.crypto.Cipher)(__sourceSpill370_10)).init(((int)(__sourceSpill370_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill370_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation370_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    byte[] __sourceSpill370_19 = ((java.lang.String)("Q¹ºÝ\004¦kE\004uó\\ã\"¶¹|.|fø ")).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __sourceSpill370_20 = local13_life8;
    byte[] local15_life22 = ((javax.crypto.Cipher)(__sourceSpill370_20)).doFinal(((byte[])(__sourceSpill370_19)));
    x = ((java.lang.String)(((java.lang.String)(com.moon.pd.a(((byte[])(local15_life22))))).intern()));
    E = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life28;
    javax.crypto.Cipher __sourceSpill370_30 = (local0_life28 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill370_31 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill370_32 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill370_33 = new byte[8];
    (__sourceSpill370_33)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local1_life34 = 1;
    while ((local1_life34 < 8)) {
        (__sourceSpill370_33)[local1_life34] = ((byte) ((int) ((local11_life6 << (local1_life34 * 8)) >>> 56)));
        local1_life34 += 1;
    }
    byte[] __sourcePreallocation370_35 = __sourceSpill370_33;
    ((javax.crypto.Cipher)(__sourceSpill370_30)).init(((int)(__sourceSpill370_31)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill370_32)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation370_35)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life38 = new long[8];
    int local3_life39 = 0;
    java.lang.String local4_life40;
    int local5_life42 = ((java.lang.String)((local4_life40 = "¦©GTüdi\026þZ\035¤çÄzOj\037¡ª§çfBO\037ÀqÇ\030+ð×~»¯b×>þ=0"))).length();
    int local2_life43 = 0;
    do {
        java.lang.String __sourceSpill370_44 = local4_life40;
        int __sourceSpill370_45 = local2_life43;
        local2_life43 += 8;
        byte[] local7_life48 = ((java.lang.String)(((java.lang.String)(__sourceSpill370_44)).substring(((int)(__sourceSpill370_45)), ((int)(local2_life43))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill370_49 = local6_life38;
        int __sourceSpill370_50 = local3_life39;
        local3_life39 += 1;
        long local8_life51 = (((((((((((long) (local7_life48)[0]) & 255L) << 56) | ((((long) (local7_life48)[1]) & 255L) << 48)) | ((((long) (local7_life48)[2]) & 255L) << 40)) | ((((long) (local7_life48)[3]) & 255L) << 32)) | ((((long) (local7_life48)[4]) & 255L) << 24)) | ((((long) (local7_life48)[5]) & 255L) << 16)) | ((((long) (local7_life48)[6]) & 255L) << 8)) | (((long) (local7_life48)[7]) & 255L));
        byte[] __sourceSpill370_52 = new byte[8];
        (__sourceSpill370_52)[0] = ((byte) ((int) (local8_life51 >>> 56)));
        (__sourceSpill370_52)[1] = ((byte) ((int) (local8_life51 >>> 48)));
        (__sourceSpill370_52)[2] = ((byte) ((int) (local8_life51 >>> 40)));
        (__sourceSpill370_52)[3] = ((byte) ((int) (local8_life51 >>> 32)));
        (__sourceSpill370_52)[4] = ((byte) ((int) (local8_life51 >>> 24)));
        (__sourceSpill370_52)[5] = ((byte) ((int) (local8_life51 >>> 16)));
        (__sourceSpill370_52)[6] = ((byte) ((int) (local8_life51 >>> 8)));
        (__sourceSpill370_52)[7] = ((byte) ((int) local8_life51));
        javax.crypto.Cipher __sourceSpill370_53 = local0_life28;
        byte[] local10_life55 = ((javax.crypto.Cipher)(__sourceSpill370_53)).doFinal(((byte[])(__sourceSpill370_52)));
        (__sourceSpill370_49)[__sourceSpill370_50] = (((((((((((long) (local10_life55)[0]) & 255L) << 56) | ((((long) (local10_life55)[1]) & 255L) << 48)) | ((((long) (local10_life55)[2]) & 255L) << 40)) | ((((long) (local10_life55)[3]) & 255L) << 32)) | ((((long) (local10_life55)[4]) & 255L) << 24)) | ((((long) (local10_life55)[5]) & 255L) << 16)) | ((((long) (local10_life55)[6]) & 255L) << 8)) | (((long) (local10_life55)[7]) & 255L));
    } while ((!(local2_life43 >= local5_life42)));
    local5_life42 = ((java.lang.String)((local4_life40 = "\016¸\032áý7\021Ë|ýjò\002"))).length();
    local2_life43 = 0;
    do {
        java.lang.String __sourceSpill370_57 = local4_life40;
        int __sourceSpill370_58 = local2_life43;
        local2_life43 += 8;
        byte[] local7_life61 = ((java.lang.String)(((java.lang.String)(__sourceSpill370_57)).substring(((int)(__sourceSpill370_58)), ((int)(local2_life43))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill370_62 = local6_life38;
        int __sourceSpill370_63 = local3_life39;
        local3_life39 += 1;
        long local8_life64 = (((((((((((long) (local7_life61)[0]) & 255L) << 56) | ((((long) (local7_life61)[1]) & 255L) << 48)) | ((((long) (local7_life61)[2]) & 255L) << 40)) | ((((long) (local7_life61)[3]) & 255L) << 32)) | ((((long) (local7_life61)[4]) & 255L) << 24)) | ((((long) (local7_life61)[5]) & 255L) << 16)) | ((((long) (local7_life61)[6]) & 255L) << 8)) | (((long) (local7_life61)[7]) & 255L));
        byte[] __sourceSpill370_65 = new byte[8];
        (__sourceSpill370_65)[0] = ((byte) ((int) (local8_life64 >>> 56)));
        (__sourceSpill370_65)[1] = ((byte) ((int) (local8_life64 >>> 48)));
        (__sourceSpill370_65)[2] = ((byte) ((int) (local8_life64 >>> 40)));
        (__sourceSpill370_65)[3] = ((byte) ((int) (local8_life64 >>> 32)));
        (__sourceSpill370_65)[4] = ((byte) ((int) (local8_life64 >>> 24)));
        (__sourceSpill370_65)[5] = ((byte) ((int) (local8_life64 >>> 16)));
        (__sourceSpill370_65)[6] = ((byte) ((int) (local8_life64 >>> 8)));
        (__sourceSpill370_65)[7] = ((byte) ((int) local8_life64));
        javax.crypto.Cipher __sourceSpill370_66 = local0_life28;
        byte[] local10_life68 = ((javax.crypto.Cipher)(__sourceSpill370_66)).doFinal(((byte[])(__sourceSpill370_65)));
        (__sourceSpill370_62)[__sourceSpill370_63] = (((((((((((long) (local10_life68)[0]) & 255L) << 56) | ((((long) (local10_life68)[1]) & 255L) << 48)) | ((((long) (local10_life68)[2]) & 255L) << 40)) | ((((long) (local10_life68)[3]) & 255L) << 32)) | ((((long) (local10_life68)[4]) & 255L) << 24)) | ((((long) (local10_life68)[5]) & 255L) << 16)) | ((((long) (local10_life68)[6]) & 255L) << 8)) | (((long) (local10_life68)[7]) & 255L));
    } while ((!(local2_life43 >= local5_life42)));
    z = ((long[])(local6_life38));
    A = ((java.lang.Integer[])(new java.lang.Integer[8]));
}

private static native <E extends Throwable> void __sourceConstructorInit_8ff1d37a80867434_0(com.moon.pd a0, int a1, int a2, int a3, int a4, int a5, java.lang.String a6) throws E;

protected void b(net.minecraft.client.Minecraft p0, int p1, int p2) {
int forwardValue1222_15_0;
    int forwardValue1222_51_0;
    com.moon.pd forwardValue1222_56_0;
    com.moon.pd forwardValue1222_97_0;
    boolean spill1222_0;
    com.moon.pd spill1222_1;
    int spill1222_2;
    com.moon.pd spill1222_3;
    long life4_3;
    net.minecraft.entity.Entity[] life6_5;
    forward_join_134: {
    forward_join_97: {
    forward_join_59: {
    forward_join_56: {
    forward_join_55: {
    forward_join_51: {
    forward_join_45: {
    forward_join_15: {
    life4_3 = (com.moon.pd.w ^ 31574354231244L);
    life6_5 = moom.cu.a__Arrayr3();
    spill1222_0 = this.n;
    if (!((life6_5 == null))) {
        forwardValue1222_15_0 = ((spill1222_0) ? 1 : 0);
        break forward_join_15;
    }
    if (!(spill1222_0)) {
        break forward_join_134;
    }
    spill1222_1 = this;
    if (!((life6_5 == null))) {
        forwardValue1222_97_0 = spill1222_1;
        break forward_join_97;
    }
    forwardValue1222_15_0 = ((((com.moon.pd)(spill1222_1)).u) ? 1 : 0);
    }
    if (!((forwardValue1222_15_0 != 0))) {
        break forward_join_59;
    }
    this.v = ((float)((((float) (p1 - (this.i + 4))) / ((float) (this.g - __sourceIntrinsic_a66803e36708_invokedynamic1222_8(24430, (4618322481287072748L ^ life4_3)))))));
    spill1222_2 = recovery.source.CarrierOps.fcmpg(((float)(this.v)), ((float)(0x0.0p0f)));
    if (!((life6_5 == null))) {
        forwardValue1222_51_0 = spill1222_2;
        break forward_join_51;
    }
    if (!((spill1222_2 < 0))) {
        break forward_join_45;
    }
    this.v = ((float)(0x0.0p0f));
    }
    spill1222_3 = this;
    if (!((life6_5 == null))) {
        forwardValue1222_56_0 = spill1222_3;
        break forward_join_56;
    }
    forwardValue1222_51_0 = recovery.source.CarrierOps.fcmpl(((float)(((com.moon.pd)(spill1222_3)).v)), ((float)(0x1.0p0f)));
    }
    if (!((forwardValue1222_51_0 > 0))) {
        break forward_join_55;
    }
    this.v = ((float)(0x1.0p0f));
    }
    forwardValue1222_56_0 = this;
    }
    ((com.moon.pd)(forwardValue1222_56_0)).k = ((java.lang.String)(((com.moon.pd)(this)).c()));
    }
    moom.kZ.c(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    ((com.moon.pd)(this)).b(((int)((this.i + ((int) (this.v * ((float) (this.g - __sourceIntrinsic_a66803e36708_invokedynamic1222_22(20860, (7481009974762341884L ^ life4_3))))))))), ((int)(this.j)), ((int)(0)), ((int)(__sourceIntrinsic_a66803e36708_invokedynamic1222_24(22335, (8479722718182409145L ^ life4_3)))), ((int)(4)), ((int)(__sourceIntrinsic_a66803e36708_invokedynamic1222_25(29378, (5480585298402977345L ^ life4_3)))));
    forwardValue1222_97_0 = this;
    }
    ((com.moon.pd)(forwardValue1222_97_0)).b(((int)(((this.i + ((int) (this.v * ((float) (this.g - __sourceIntrinsic_a66803e36708_invokedynamic1222_30(20860, (7481009974762341884L ^ life4_3))))))) + 4))), ((int)(this.j)), ((int)(__sourceIntrinsic_a66803e36708_invokedynamic1222_32(1343, (7733628888435216826L ^ life4_3)))), ((int)(__sourceIntrinsic_a66803e36708_invokedynamic1222_33(24466, (2642393725411166998L ^ life4_3)))), ((int)(4)), ((int)(__sourceIntrinsic_a66803e36708_invokedynamic1222_34(9678, (7671302228895625545L ^ life4_3)))));
    }
    return;
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public float b() {
return this.v;
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral3203_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/pd"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.pd.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int c(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 28509;
      if (A[var3] == null) {
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
         long var5 = z[var3];
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
         Object[] var9 = (Object[])E.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               E.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/moon/pd", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         A[var3] = var15;
      }

      return A[var3];
}


private java.lang.String c() {
com.moon.cl forwardValue1223_27_0;
    com.moon.o4 forwardValue1223_37_0;
    net.minecraft.entity.Entity[] spill1223_0;
    com.moon.cl spill1223_1;
    com.moon.o4 spill1223_2;
    long life1_3;
    java.util.List life4_6;
    int life5_11;
    com.moon.cl life6_20;
    net.minecraft.entity.Entity[] life3_21;
    int life7_32;
    forward_join_43: {
    forward_join_39: {
    forward_join_37: {
    forward_join_27: {
    life1_3 = (com.moon.pd.w ^ 27791601743126L);
    life4_6 = java.util.Arrays.asList(((java.lang.Object[])(com.moon.cl.values())));
    spill1223_0 = moom.cu.a__Arrayr3();
    life5_11 = java.lang.Math.round(((float)(((com.moon.pd)(this)).a__sourceReturn_bc607678b6())));
    life6_20 = (com.moon.cl.values())[(((com.moon.cl.values()).length - 1) - life5_11)];
    life3_21 = spill1223_0;
    spill1223_1 = life6_20;
    if (!((life3_21 == null))) {
        forwardValue1223_27_0 = spill1223_1;
        break forward_join_27;
    }
    if (!((spill1223_1 != null))) {
        break forward_join_43;
    }
    forwardValue1223_27_0 = life6_20;
    }
    life7_32 = ((com.viaversion.viaversion.api.protocol.version.ProtocolVersion)(((com.moon.cl)(forwardValue1223_27_0)).a())).getVersion();
    spill1223_2 = com.moon.o4.a__o4();
    if (!((life3_21 == null))) {
        forwardValue1223_37_0 = spill1223_2;
        break forward_join_37;
    }
    if (!((((com.moon.o4)(spill1223_2)).b() != life7_32))) {
        break forward_join_39;
    }
    forwardValue1223_37_0 = com.moon.o4.a__o4();
    }
    ((com.moon.o4)(forwardValue1223_37_0)).a(((int)(life7_32)));
    }
    return ((com.viaversion.viaversion.api.protocol.version.ProtocolVersion)(((com.moon.cl)(life6_20)).a())).getName();
    }
    return com.moon.pd.x;
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
        byte[] spill1542_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1542_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1542_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1542_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1542_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1542_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


public void a(float p0, boolean p1) {
this.v = ((float)(((p0 - ((float) this.r)) / ((float) (this.s - this.r)))));
    this.k = ((java.lang.String)(((com.moon.pd)(this)).c()));
    return;
}


public float a__sourceReturn_bc607678b6() {
return (((float) this.r) + (((float) (this.s - this.r)) * this.v));
}


public boolean a__Boolean(net.minecraft.client.Minecraft p0, int p1, int p2) {
int forwardValue1221_47_0;
    int forwardValue1221_61_0;
    int forwardValue1221_63_0;
    boolean spill1221_0;
    int spill1221_1;
    long life4_3;
    net.minecraft.entity.Entity[] life6_5;
    forward_join_63: {
    forward_join_62: {
    forward_join_61: {
    forward_join_53: {
    forward_join_47: {
    forward_join_43: {
    life4_3 = (com.moon.pd.w ^ 116581747068452L);
    life6_5 = moom.cu.a__Arrayr3();
    spill1221_0 = super.a__Boolean(((net.minecraft.client.Minecraft)(p0)), ((int)(p1)), ((int)(p2)));
    if (!((life6_5 == null))) {
        forwardValue1221_63_0 = ((spill1221_0) ? 1 : 0);
        break forward_join_63;
    }
    if (!(spill1221_0)) {
        break forward_join_62;
    }
    this.v = ((float)((((float) (p1 - (this.i + 4))) / ((float) (this.g - __sourceIntrinsic_fe3ccd2239af_invokedynamic1221_6(20860, (7480923592543761428L ^ life4_3)))))));
    spill1221_1 = recovery.source.CarrierOps.fcmpg(((float)(this.v)), ((float)(0x0.0p0f)));
    if (!((life6_5 == null))) {
        forwardValue1221_47_0 = spill1221_1;
        break forward_join_47;
    }
    if (!((spill1221_1 < 0))) {
        break forward_join_43;
    }
    this.v = ((float)(0x0.0p0f));
    }
    forwardValue1221_47_0 = recovery.source.CarrierOps.fcmpl(((float)(this.v)), ((float)(0x1.0p0f)));
    }
    if (!((life6_5 == null))) {
        forwardValue1221_61_0 = forwardValue1221_47_0;
        break forward_join_61;
    }
    if (!((forwardValue1221_47_0 > 0))) {
        break forward_join_53;
    }
    this.v = ((float)(0x1.0p0f));
    }
    this.k = ((java.lang.String)(((com.moon.pd)(this)).c()));
    this.u = ((boolean)(true));
    forwardValue1221_61_0 = 1;
    }
    return ((forwardValue1221_61_0) != 0);
    }
    forwardValue1221_63_0 = 0;
    }
    return ((forwardValue1221_63_0) != 0);
}


protected int a(boolean p0) {
return 0;
}


public void a(int p0, int p1) {
this.u = ((boolean)(false));
    return;
}


public void a(float p0) {
this.v = ((float)(p0));
    this.k = ((java.lang.String)(((com.moon.pd)(this)).c()));
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_8ff1d37a80867434_originalDynamicSite312_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8ff1d37a80867434_originalDynamicSite312_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fe3ccd2239af_invokedynamic1221_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a66803e36708_invokedynamic1222_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a66803e36708_invokedynamic1222_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a66803e36708_invokedynamic1222_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a66803e36708_invokedynamic1222_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a66803e36708_invokedynamic1222_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a66803e36708_invokedynamic1222_32(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a66803e36708_invokedynamic1222_33(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a66803e36708_invokedynamic1222_34(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral3203_0() throws E;
}
