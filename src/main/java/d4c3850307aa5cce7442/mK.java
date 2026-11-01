package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class mK<T extends net.minecraft.entity.item.EntityMinecart> extends net.minecraft.client.renderer.entity.Render<T> {

private static final moom.DD h;

public moom.iQ i;

private static final long j;

private static final long[] l;

private static final java.lang.Integer[] m;

private static final java.util.Map n;

private static final long[] r;

private static final java.lang.Long[] s;

private static final java.util.Map t;

public mK(net.minecraft.client.renderer.entity.RenderManager p0) {
super(p0);
    this.i = new moom.jg();
    this.c = 0x1.0000000000000p-1f;
}


static {
j = ((long)(((moom._a)(moom._c.a(((long)(-835652082480641759L)), ((long)(-6349342659824548840L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(64030540321947L)))));
    n = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (moom.mK.j ^ 817253040490L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill1080_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1080_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1080_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1080_14 = new byte[8];
    (__sourceSpill1080_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill1080_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation1080_16 = __sourceSpill1080_14;
    ((javax.crypto.Cipher)(__sourceSpill1080_11)).init(((int)(__sourceSpill1080_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1080_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1080_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local19_life19 = new long[4];
    int local16_life20 = 0;
    java.lang.String local17_life21;
    int local18_life23 = ((java.lang.String)((local17_life21 = "êÐ\r¸IÎòIá\013\búT«Õ"))).length();
    int local15_life24 = 0;
    do {
        java.lang.String __sourceSpill1080_25 = local17_life21;
        int __sourceSpill1080_26 = local15_life24;
        local15_life24 += 8;
        byte[] local20_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1080_25)).substring(((int)(__sourceSpill1080_26)), ((int)(local15_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1080_30 = local19_life19;
        int __sourceSpill1080_31 = local16_life20;
        local16_life20 += 1;
        long local21_life32 = (((((((((((long) (local20_life29)[0]) & 255L) << 56) | ((((long) (local20_life29)[1]) & 255L) << 48)) | ((((long) (local20_life29)[2]) & 255L) << 40)) | ((((long) (local20_life29)[3]) & 255L) << 32)) | ((((long) (local20_life29)[4]) & 255L) << 24)) | ((((long) (local20_life29)[5]) & 255L) << 16)) | ((((long) (local20_life29)[6]) & 255L) << 8)) | (((long) (local20_life29)[7]) & 255L));
        byte[] __sourceSpill1080_33 = new byte[8];
        (__sourceSpill1080_33)[0] = ((byte) ((int) (local21_life32 >>> 56)));
        (__sourceSpill1080_33)[1] = ((byte) ((int) (local21_life32 >>> 48)));
        (__sourceSpill1080_33)[2] = ((byte) ((int) (local21_life32 >>> 40)));
        (__sourceSpill1080_33)[3] = ((byte) ((int) (local21_life32 >>> 32)));
        (__sourceSpill1080_33)[4] = ((byte) ((int) (local21_life32 >>> 24)));
        (__sourceSpill1080_33)[5] = ((byte) ((int) (local21_life32 >>> 16)));
        (__sourceSpill1080_33)[6] = ((byte) ((int) (local21_life32 >>> 8)));
        (__sourceSpill1080_33)[7] = ((byte) ((int) local21_life32));
        javax.crypto.Cipher __sourceSpill1080_34 = local13_life9;
        byte[] local23_life36 = ((javax.crypto.Cipher)(__sourceSpill1080_34)).doFinal(((byte[])(__sourceSpill1080_33)));
        (__sourceSpill1080_30)[__sourceSpill1080_31] = (((((((((((long) (local23_life36)[0]) & 255L) << 56) | ((((long) (local23_life36)[1]) & 255L) << 48)) | ((((long) (local23_life36)[2]) & 255L) << 40)) | ((((long) (local23_life36)[3]) & 255L) << 32)) | ((((long) (local23_life36)[4]) & 255L) << 24)) | ((((long) (local23_life36)[5]) & 255L) << 16)) | ((((long) (local23_life36)[6]) & 255L) << 8)) | (((long) (local23_life36)[7]) & 255L));
    } while ((!(local15_life24 >= local18_life23)));
    local18_life23 = ((java.lang.String)((local17_life21 = "E\037[Ä*øéÀ%ÿË[³÷P*"))).length();
    local15_life24 = 0;
    do {
        java.lang.String __sourceSpill1080_38 = local17_life21;
        int __sourceSpill1080_39 = local15_life24;
        local15_life24 += 8;
        byte[] local20_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1080_38)).substring(((int)(__sourceSpill1080_39)), ((int)(local15_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1080_43 = local19_life19;
        int __sourceSpill1080_44 = local16_life20;
        local16_life20 += 1;
        long local21_life45 = (((((((((((long) (local20_life42)[0]) & 255L) << 56) | ((((long) (local20_life42)[1]) & 255L) << 48)) | ((((long) (local20_life42)[2]) & 255L) << 40)) | ((((long) (local20_life42)[3]) & 255L) << 32)) | ((((long) (local20_life42)[4]) & 255L) << 24)) | ((((long) (local20_life42)[5]) & 255L) << 16)) | ((((long) (local20_life42)[6]) & 255L) << 8)) | (((long) (local20_life42)[7]) & 255L));
        byte[] __sourceSpill1080_46 = new byte[8];
        (__sourceSpill1080_46)[0] = ((byte) ((int) (local21_life45 >>> 56)));
        (__sourceSpill1080_46)[1] = ((byte) ((int) (local21_life45 >>> 48)));
        (__sourceSpill1080_46)[2] = ((byte) ((int) (local21_life45 >>> 40)));
        (__sourceSpill1080_46)[3] = ((byte) ((int) (local21_life45 >>> 32)));
        (__sourceSpill1080_46)[4] = ((byte) ((int) (local21_life45 >>> 24)));
        (__sourceSpill1080_46)[5] = ((byte) ((int) (local21_life45 >>> 16)));
        (__sourceSpill1080_46)[6] = ((byte) ((int) (local21_life45 >>> 8)));
        (__sourceSpill1080_46)[7] = ((byte) ((int) local21_life45));
        javax.crypto.Cipher __sourceSpill1080_47 = local13_life9;
        byte[] local23_life49 = ((javax.crypto.Cipher)(__sourceSpill1080_47)).doFinal(((byte[])(__sourceSpill1080_46)));
        (__sourceSpill1080_43)[__sourceSpill1080_44] = (((((((((((long) (local23_life49)[0]) & 255L) << 56) | ((((long) (local23_life49)[1]) & 255L) << 48)) | ((((long) (local23_life49)[2]) & 255L) << 40)) | ((((long) (local23_life49)[3]) & 255L) << 32)) | ((((long) (local23_life49)[4]) & 255L) << 24)) | ((((long) (local23_life49)[5]) & 255L) << 16)) | ((((long) (local23_life49)[6]) & 255L) << 8)) | (((long) (local23_life49)[7]) & 255L));
    } while ((!(local15_life24 >= local18_life23)));
    l = ((long[])(local19_life19));
    m = ((java.lang.Integer[])(new java.lang.Integer[4]));
    t = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life54;
    javax.crypto.Cipher __sourceSpill1080_56 = (local0_life54 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1080_57 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1080_58 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1080_59 = new byte[8];
    (__sourceSpill1080_59)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life60 = 1;
    while ((local1_life60 < 8)) {
        (__sourceSpill1080_59)[local1_life60] = ((byte) ((int) ((local11_life7 << (local1_life60 * 8)) >>> 56)));
        local1_life60 += 1;
    }
    byte[] __sourcePreallocation1080_61 = __sourceSpill1080_59;
    ((javax.crypto.Cipher)(__sourceSpill1080_56)).init(((int)(__sourceSpill1080_57)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1080_58)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1080_61)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life64 = new long[5];
    int local3_life65 = 0;
    java.lang.String local4_life66;
    int local5_life68 = ((java.lang.String)((local4_life66 = "hÛ\007ãG»vDibYm\002¾Ô\025`ºÈä"))).length();
    int local2_life69 = 0;
    do {
        java.lang.String __sourceSpill1080_70 = local4_life66;
        int __sourceSpill1080_71 = local2_life69;
        local2_life69 += 8;
        byte[] local7_life74 = ((java.lang.String)(((java.lang.String)(__sourceSpill1080_70)).substring(((int)(__sourceSpill1080_71)), ((int)(local2_life69))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1080_75 = local6_life64;
        int __sourceSpill1080_76 = local3_life65;
        local3_life65 += 1;
        long local8_life77 = (((((((((((long) (local7_life74)[0]) & 255L) << 56) | ((((long) (local7_life74)[1]) & 255L) << 48)) | ((((long) (local7_life74)[2]) & 255L) << 40)) | ((((long) (local7_life74)[3]) & 255L) << 32)) | ((((long) (local7_life74)[4]) & 255L) << 24)) | ((((long) (local7_life74)[5]) & 255L) << 16)) | ((((long) (local7_life74)[6]) & 255L) << 8)) | (((long) (local7_life74)[7]) & 255L));
        byte[] __sourceSpill1080_78 = new byte[8];
        (__sourceSpill1080_78)[0] = ((byte) ((int) (local8_life77 >>> 56)));
        (__sourceSpill1080_78)[1] = ((byte) ((int) (local8_life77 >>> 48)));
        (__sourceSpill1080_78)[2] = ((byte) ((int) (local8_life77 >>> 40)));
        (__sourceSpill1080_78)[3] = ((byte) ((int) (local8_life77 >>> 32)));
        (__sourceSpill1080_78)[4] = ((byte) ((int) (local8_life77 >>> 24)));
        (__sourceSpill1080_78)[5] = ((byte) ((int) (local8_life77 >>> 16)));
        (__sourceSpill1080_78)[6] = ((byte) ((int) (local8_life77 >>> 8)));
        (__sourceSpill1080_78)[7] = ((byte) ((int) local8_life77));
        javax.crypto.Cipher __sourceSpill1080_79 = local0_life54;
        byte[] local10_life81 = ((javax.crypto.Cipher)(__sourceSpill1080_79)).doFinal(((byte[])(__sourceSpill1080_78)));
        (__sourceSpill1080_75)[__sourceSpill1080_76] = (((((((((((long) (local10_life81)[0]) & 255L) << 56) | ((((long) (local10_life81)[1]) & 255L) << 48)) | ((((long) (local10_life81)[2]) & 255L) << 40)) | ((((long) (local10_life81)[3]) & 255L) << 32)) | ((((long) (local10_life81)[4]) & 255L) << 24)) | ((((long) (local10_life81)[5]) & 255L) << 16)) | ((((long) (local10_life81)[6]) & 255L) << 8)) | (((long) (local10_life81)[7]) & 255L));
    } while ((!(local2_life69 >= local5_life68)));
    local5_life68 = ((java.lang.String)((local4_life66 = "/b©\001ÉU,\013c³sNÌv"))).length();
    local2_life69 = 0;
    do {
        java.lang.String __sourceSpill1080_83 = local4_life66;
        int __sourceSpill1080_84 = local2_life69;
        local2_life69 += 8;
        byte[] local7_life87 = ((java.lang.String)(((java.lang.String)(__sourceSpill1080_83)).substring(((int)(__sourceSpill1080_84)), ((int)(local2_life69))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1080_88 = local6_life64;
        int __sourceSpill1080_89 = local3_life65;
        local3_life65 += 1;
        long local8_life90 = (((((((((((long) (local7_life87)[0]) & 255L) << 56) | ((((long) (local7_life87)[1]) & 255L) << 48)) | ((((long) (local7_life87)[2]) & 255L) << 40)) | ((((long) (local7_life87)[3]) & 255L) << 32)) | ((((long) (local7_life87)[4]) & 255L) << 24)) | ((((long) (local7_life87)[5]) & 255L) << 16)) | ((((long) (local7_life87)[6]) & 255L) << 8)) | (((long) (local7_life87)[7]) & 255L));
        byte[] __sourceSpill1080_91 = new byte[8];
        (__sourceSpill1080_91)[0] = ((byte) ((int) (local8_life90 >>> 56)));
        (__sourceSpill1080_91)[1] = ((byte) ((int) (local8_life90 >>> 48)));
        (__sourceSpill1080_91)[2] = ((byte) ((int) (local8_life90 >>> 40)));
        (__sourceSpill1080_91)[3] = ((byte) ((int) (local8_life90 >>> 32)));
        (__sourceSpill1080_91)[4] = ((byte) ((int) (local8_life90 >>> 24)));
        (__sourceSpill1080_91)[5] = ((byte) ((int) (local8_life90 >>> 16)));
        (__sourceSpill1080_91)[6] = ((byte) ((int) (local8_life90 >>> 8)));
        (__sourceSpill1080_91)[7] = ((byte) ((int) local8_life90));
        javax.crypto.Cipher __sourceSpill1080_92 = local0_life54;
        byte[] local10_life94 = ((javax.crypto.Cipher)(__sourceSpill1080_92)).doFinal(((byte[])(__sourceSpill1080_91)));
        (__sourceSpill1080_88)[__sourceSpill1080_89] = (((((((((((long) (local10_life94)[0]) & 255L) << 56) | ((((long) (local10_life94)[1]) & 255L) << 48)) | ((((long) (local10_life94)[2]) & 255L) << 40)) | ((((long) (local10_life94)[3]) & 255L) << 32)) | ((((long) (local10_life94)[4]) & 255L) << 24)) | ((((long) (local10_life94)[5]) & 255L) << 16)) | ((((long) (local10_life94)[6]) & 255L) << 8)) | (((long) (local10_life94)[7]) & 255L));
    } while ((!(local2_life69 >= local5_life68)));
    r = ((long[])(local6_life64));
    s = ((java.lang.Long[])(new java.lang.Long[5]));
    h = ((moom.DD)(new moom.DD("textures/entity/minecart.png")));
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.mK.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 134;
      if (m[var3] == null) {
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
         long var5 = l[var3];
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
         Object[] var9 = (Object[])n.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               n.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/mK", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         m[var3] = var15;
      }

      return m[var3];
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8387_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/mK"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.invoke.CallSite d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral8388_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/mK"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static long d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    long local7 = moom.mK.d(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local9 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Long.TYPE)), ((java.lang.Object)(java.lang.Long.valueOf(((long)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local9)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static long d(int p0, long p1) {
int life3_8;
    byte[] life4_77;
    long life5_81;
    byte[] life7_146;
    java.lang.Long life8_150;
    java.lang.Object[] life9_155;
    javax.crypto.spec.DESKeySpec life11_188;
    javax.crypto.SecretKey life12_195;
    javax.crypto.Cipher life13_200;
    byte[] life10_212;
    long life11_290;
    life3_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 3835);
    if (((moom.mK.s)[life3_8] == null)) {
        life4_77 = new byte[] {((byte) ((int) (p1 >>> 56))), ((byte) ((int) (p1 >>> 48))), ((byte) ((int) (p1 >>> 40))), ((byte) ((int) (p1 >>> 32))), ((byte) ((int) (p1 >>> 24))), ((byte) ((int) (p1 >>> 16))), ((byte) ((int) (p1 >>> 8))), ((byte) ((int) p1))};
        life5_81 = (moom.mK.r)[life3_8];
        life7_146 = new byte[] {((byte) ((int) (life5_81 >>> 56))), ((byte) ((int) (life5_81 >>> 48))), ((byte) ((int) (life5_81 >>> 40))), ((byte) ((int) (life5_81 >>> 32))), ((byte) ((int) (life5_81 >>> 24))), ((byte) ((int) (life5_81 >>> 16))), ((byte) ((int) (life5_81 >>> 8))), ((byte) ((int) life5_81))};
        life8_150 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life9_155 = ((java.lang.Object[])(((java.util.Map)(moom.mK.t)).get(((java.lang.Object)(life8_150)))));
        try {
        if ((life9_155 == null)) {
        life9_155 = new java.lang.Object[3];
        (life9_155)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding")));
        (life9_155)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life9_155)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.mK.t)).put(((java.lang.Object)(life8_150)), ((java.lang.Object)(life9_155)));
    }
        life11_188 = new javax.crypto.spec.DESKeySpec(life4_77);
        life12_195 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life9_155)[1])))).generateSecret(((java.security.spec.KeySpec)(life11_188)));
        life13_200 = ((javax.crypto.Cipher)((life9_155)[0]));
        ((javax.crypto.Cipher)(life13_200)).init(((int)(2)), ((java.security.Key)(life12_195)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life9_155)[2])))));
        life10_212 = ((javax.crypto.Cipher)(life13_200)).doFinal(((byte[])(life7_146)));
    } catch (java.lang.Exception life11_214) {
        throw new java.lang.RuntimeException("moom/mK", life11_214);
    }
        life11_290 = (((((((((((long) (life10_212)[0]) & 255L) << 56) | ((((long) (life10_212)[1]) & 255L) << 48)) | ((((long) (life10_212)[2]) & 255L) << 40)) | ((((long) (life10_212)[3]) & 255L) << 32)) | ((((long) (life10_212)[4]) & 255L) << 24)) | ((((long) (life10_212)[5]) & 255L) << 16)) | ((((long) (life10_212)[6]) & 255L) << 8)) | (((long) (life10_212)[7]) & 255L));
        (moom.mK.s)[life3_8] = java.lang.Long.valueOf(((long)(life11_290)));
    }
    return ((java.lang.Long)((moom.mK.s)[life3_8])).longValue();
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(T p0, double p1, double p2, double p3, float p4, float p5) {
long life10_3;
    long life12_18;
    long life12_36;
    float life14_59;
    float life15_82;
    float life16_105;
    double life17_121;
    double life19_133;
    double life21_145;
    double life23_147;
    moom.DR life25_153;
    float life26_164;
    moom.DR life27_173;
    moom.DR life28_181;
    moom.DR life29_227;
    moom.DR life29_235;
    float life27_281;
    float life28_286;
    int life29_318;
    net.minecraft.block.state.IBlockState life30_321;
    float life31_332;
    life10_3 = (moom.mK.j ^ 134983564443099L);
    moom.kZ.B();
    ((moom.mK)(this)).b(((net.minecraft.entity.Entity)(p0)));
    life12_18 = (((long) ((net.minecraft.entity.item.EntityMinecart)(p0)).e__Int()) * __sourceIntrinsic_c4b8ec35cd63_invokedynamic6854_4(18832, (9178678903294855063L ^ life10_3)));
    life12_36 = (((life12_18 * life12_18) * __sourceIntrinsic_c4b8ec35cd63_invokedynamic6854_5(10597, (8384182553354626916L ^ life10_3))) + (life12_18 * __sourceIntrinsic_c4b8ec35cd63_invokedynamic6854_6(1898, (3403458139891943785L ^ life10_3))));
    life14_59 = ((((((float) ((life12_36 >> __sourceIntrinsic_c4b8ec35cd63_invokedynamic6854_7(31116, (5461582427793537520L ^ life10_3))) & __sourceIntrinsic_c4b8ec35cd63_invokedynamic6854_8(3574, (3969353596081521654L ^ life10_3)))) + 0x1.0p-1f) / 0x1.0p3f) - 0x1.0p-1f) * 0x1.0624dep-8f);
    life15_82 = ((((((float) ((life12_36 >> __sourceIntrinsic_c4b8ec35cd63_invokedynamic6854_9(8422, (2981371106057379993L ^ life10_3))) & __sourceIntrinsic_c4b8ec35cd63_invokedynamic6854_10(15673, (3501836506413003579L ^ life10_3)))) + 0x1.0p-1f) / 0x1.0p3f) - 0x1.0p-1f) * 0x1.0624dep-8f);
    life16_105 = ((((((float) ((life12_36 >> __sourceIntrinsic_c4b8ec35cd63_invokedynamic6854_11(9877, (9053059793664272104L ^ life10_3))) & __sourceIntrinsic_c4b8ec35cd63_invokedynamic6854_12(15673, (3501836506413003579L ^ life10_3)))) + 0x1.0p-1f) / 0x1.0p3f) - 0x1.0p-1f) * 0x1.0624dep-8f);
    moom.kZ.b(((float)(life14_59)), ((float)(life15_82)), ((float)(life16_105)));
    life17_121 = (((net.minecraft.entity.item.EntityMinecart)(p0)).M + ((((net.minecraft.entity.item.EntityMinecart)(p0)).n - ((net.minecraft.entity.item.EntityMinecart)(p0)).M) * ((double) p5)));
    life19_133 = (((net.minecraft.entity.item.EntityMinecart)(p0)).N + ((((net.minecraft.entity.item.EntityMinecart)(p0)).o - ((net.minecraft.entity.item.EntityMinecart)(p0)).N) * ((double) p5)));
    life21_145 = (((net.minecraft.entity.item.EntityMinecart)(p0)).O + ((((net.minecraft.entity.item.EntityMinecart)(p0)).p - ((net.minecraft.entity.item.EntityMinecart)(p0)).O) * ((double) p5)));
    life23_147 = 0x1.333334p-2d;
    life25_153 = ((net.minecraft.entity.item.EntityMinecart)(p0)).a__sourceReturn_ec3967a824(((double)(life17_121)), ((double)(life19_133)), ((double)(life21_145)));
    life26_164 = (((net.minecraft.entity.item.EntityMinecart)(p0)).z + ((((net.minecraft.entity.item.EntityMinecart)(p0)).x - ((net.minecraft.entity.item.EntityMinecart)(p0)).z) * p5));
    if ((life25_153 != null)) {
        life27_173 = __sourceExactCall_4a1a142f7959b2(((net.minecraft.entity.item.EntityMinecart)(p0)), ((double)(life17_121)), ((double)(life19_133)), ((double)(life21_145)), ((double)(life23_147)));
        life28_181 = __sourceExactCall_4a1a142f7959b2(((net.minecraft.entity.item.EntityMinecart)(p0)), ((double)(life17_121)), ((double)(life19_133)), ((double)(life21_145)), ((double)((-life23_147))));
        if ((life27_173 == null)) {
        life27_173 = life25_153;
    }
        if ((life28_181 == null)) {
        life28_181 = life25_153;
    }
        p1 = (p1 + (((moom.DR)(life25_153)).a - life17_121));
        p2 = (p2 + (((((moom.DR)(life27_173)).b + ((moom.DR)(life28_181)).b) / 0x1.0p1d) - life19_133));
        p3 = (p3 + (((moom.DR)(life25_153)).c - life21_145));
        life29_227 = ((moom.DR)(life28_181)).b(((double)((-((moom.DR)(life27_173)).a))), ((double)((-((moom.DR)(life27_173)).b))), ((double)((-((moom.DR)(life27_173)).c))));
        if ((__sourceExactCall_ab505880ddd882(((moom.DR)(life29_227))) != 0x0.0p0d)) {
        life29_235 = ((moom.DR)(life29_227)).a__DR();
        p4 = ((float) ((java.lang.Math.atan2(((double)(((moom.DR)(life29_235)).c)), ((double)(((moom.DR)(life29_235)).a))) * 0x1.68p7d) / 0x1.921fb54442d18p1d));
        life26_164 = ((float) (java.lang.Math.atan(((double)(((moom.DR)(life29_235)).b))) * 0x1.24p6d));
    }
    }
    moom.kZ.b(((float)(((float) p1))), ((float)((((float) p2) + 0x1.8p-2f))), ((float)(((float) p3))));
    moom.kZ.b(((float)((0x1.68p7f - p4))), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)));
    moom.kZ.b(((float)((-life26_164))), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)));
    life27_281 = (((float) ((net.minecraft.entity.item.EntityMinecart)(p0)).j__sourceReturn_8abf5c6871()) - p5);
    life28_286 = (__sourceExactCall_08fb34de8f84bd(((net.minecraft.entity.item.EntityMinecart)(p0))) - p5);
    if ((life28_286 < 0x0.0p0f)) {
        life28_286 = 0x0.0p0f;
    }
    if ((life27_281 > 0x0.0p0f)) {
        moom.kZ.b(((float)(((((__sourceExactCall_91a54ea3c9ba57(((float)(life27_281))) * life27_281) * life28_286) / 0x1.4p3f) * ((float) ((net.minecraft.entity.item.EntityMinecart)(p0)).k())))), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)));
    }
    life29_318 = ((net.minecraft.entity.item.EntityMinecart)(p0)).l();
    life30_321 = ((net.minecraft.entity.item.EntityMinecart)(p0)).a__fE();
    if ((((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(life30_321)).a__ch())).c__Int() != -1)) {
        moom.kZ.B();
        ((moom.mK)(this)).b(((moom.DD)(net.minecraft.client.renderer.texture.TextureMap.k)));
        life31_332 = 0x1.8p-1f;
        __sourceExactCall_c87cfdff997c62(((float)(life31_332)), ((float)(life31_332)), ((float)(life31_332)));
        moom.kZ.b(((float)(-0x1.0p-1f)), ((float)((((float) (life29_318 - __sourceIntrinsic_c4b8ec35cd63_invokedynamic6854_60(12231, (3926897214446071737L ^ life10_3)))) / 0x1.0p4f))), ((float)(0x1.0p-1f)));
        __sourceExactCall_8743fbfcf39f4b(((moom.mK)(this)), ((net.minecraft.entity.item.EntityMinecart)(p0)), ((float)(p5)), ((net.minecraft.block.state.IBlockState)(life30_321)));
        moom.kZ.C();
        moom.kZ.c(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
        ((moom.mK)(this)).b(((net.minecraft.entity.Entity)(p0)));
    }
    __sourceExactCall_c87cfdff997c62(((float)(-0x1.0p0f)), ((float)(-0x1.0p0f)), ((float)(0x1.0p0f)));
    __sourceExactCall_f8da34d2aa6235(((moom.iQ)(this.i)), ((net.minecraft.entity.Entity)(p0)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(-0x1.99999ap-4f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p-4f)));
    moom.kZ.C();
    __sourceExactCall_76ed68570395ae(this, ((net.minecraft.entity.Entity)(p0)), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((float)(p4)), ((float)(p5)));
    return;
}


protected moom.DD a(T p0) {
return moom.mK.h;
}


protected void a(T p0, float p1, net.minecraft.block.state.IBlockState p2) {
moom.kZ.B();
    ((net.minecraft.client.renderer.BlockRendererDispatcher)(((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).a__kP())).a(((net.minecraft.block.state.IBlockState)(p2)), ((float)(((net.minecraft.entity.item.EntityMinecart)(p0)).a(((float)(p1))))));
    moom.kZ.C();
    return;
}


protected moom.DD a__sourceBridge_fb93f4301e(net.minecraft.entity.Entity p0) {
return ((moom.mK)(this)).a(((net.minecraft.entity.item.EntityMinecart)(((net.minecraft.entity.item.EntityMinecart)(p0)))));
}


public void a__sourceBridge_01f3c9ade5(net.minecraft.entity.Entity p0, double p1, double p2, double p3, float p4, float p5) {
((moom.mK)(this)).a(((net.minecraft.entity.item.EntityMinecart)(((net.minecraft.entity.item.EntityMinecart)(p0)))), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((float)(p4)), ((float)(p5)));
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8387_0() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral8388_0() throws E;

private static native <E extends Throwable> long __sourceIntrinsic_c4b8ec35cd63_invokedynamic6854_4(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_c4b8ec35cd63_invokedynamic6854_5(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_c4b8ec35cd63_invokedynamic6854_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c4b8ec35cd63_invokedynamic6854_7(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_c4b8ec35cd63_invokedynamic6854_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c4b8ec35cd63_invokedynamic6854_9(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_c4b8ec35cd63_invokedynamic6854_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c4b8ec35cd63_invokedynamic6854_11(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_c4b8ec35cd63_invokedynamic6854_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c4b8ec35cd63_invokedynamic6854_60(int a0, long a1) throws E;



private static native moom.DR __sourceExactCall_4a1a142f7959b2(net.minecraft.entity.item.EntityMinecart p0, double p1, double p2, double p3, double p4);
private static native double __sourceExactCall_ab505880ddd882(moom.DR p0);
private static native float __sourceExactCall_08fb34de8f84bd(net.minecraft.entity.item.EntityMinecart p0);
private static native float __sourceExactCall_91a54ea3c9ba57(float p0);
private static native void __sourceExactCall_c87cfdff997c62(float p0, float p1, float p2);
private static native void __sourceExactCall_8743fbfcf39f4b(moom.mK p0, net.minecraft.entity.item.EntityMinecart p1, float p2, net.minecraft.block.state.IBlockState p3);
private static native void __sourceExactCall_f8da34d2aa6235(moom.iQ p0, net.minecraft.entity.Entity p1, float p2, float p3, float p4, float p5, float p6, float p7);
private static native void __sourceExactCall_76ed68570395ae(net.minecraft.client.renderer.entity.Render p0, net.minecraft.entity.Entity p1, double p2, double p3, double p4, float p5, float p6);
}
