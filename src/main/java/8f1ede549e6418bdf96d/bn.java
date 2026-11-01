package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class bn extends sourcebuild.EnumConstructor<com.moon.bn> implements com.moon.l8 {

public static com.moon.bn KEEPALIVE;

public static com.moon.bn TRANSACTION;

public static com.moon.bn VELOCITY;

public static com.moon.bn TELEPORT;

public static com.moon.bn ENTITIES;

public static com.moon.bn ENTITIES_STATUS;

public static com.moon.bn CHUNK;

public static com.moon.bn GAME_STATE;

private java.lang.String a;

private static com.moon.bn[] b;

private static long c;

private static long[] d;

private static java.lang.Integer[] e;

private static java.util.Map f;

private bn(java.lang.String p0, int p1, java.lang.String p2) {
super(p0, p1);
    this.a = p2;
}


private static void initialize() {
c = ((long)(((moom._a)(moom._c.a(((long)(8805750151340253040L)), ((long)(876136624482466832L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(72932803596127L)))));
    long local20_life6 = (com.moon.bn.c ^ 36901501577567L);
    javax.crypto.Cipher local12_life8;
    javax.crypto.Cipher __sourceSpill25_10 = (local12_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill25_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill25_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill25_13 = new byte[8];
    (__sourceSpill25_13)[0] = ((byte) ((int) (local20_life6 >>> 56)));
    int local13_life14 = 1;
    while ((local13_life14 < 8)) {
        (__sourceSpill25_13)[local13_life14] = ((byte) ((int) ((local20_life6 << (local13_life14 * 8)) >>> 56)));
        local13_life14 += 1;
    }
    byte[] __sourcePreallocation25_15 = __sourceSpill25_13;
    ((javax.crypto.Cipher)(__sourceSpill25_10)).init(((int)(__sourceSpill25_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill25_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation25_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local11_life18 = new java.lang.String[16];
    int local17_life19 = 0;
    java.lang.String local16_life20;
    int local18_life22 = ((java.lang.String)((local16_life20 = "B·\030|\t ºAdeöû_wÉ\020Í(Ñ¸¢\033¾Å`+ªS\016])\b\f\033¡ÜôOL\020ä~lö#Ï8E\177\004\rÐ9U\020Á}\022\022DðëÙy**¥\000S)h\020\\\036`\blÅð]Ùí¹]'Z\020ë@\b.o\022Õ\031ÃáiÐòý\b¤g\0308GTn\020\020\fF[säm\034ÚL\031mH\017-\020^\017Ç9`\000¸òö]Ï'\027y\020\\\036`\blÅð]4Õè&Ûì\020j¾\0020e\\VoßøyÇT[\020£Mê¡\t½Ýd¬U8)f!I\020m\002¬,`\beµ@°évÃñH"))).length();
    int local15_life23 = 16;
    int local14_life24 = -1;
    while (true) {
        local14_life24 += 1;
        byte[] __sourceSpill25_27 = ((java.lang.String)(((java.lang.String)(local16_life20)).substring(((int)(local14_life24)), ((int)((local14_life24 + local15_life23)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill25_28 = local12_life8;
        byte[] local19_life30 = ((javax.crypto.Cipher)(__sourceSpill25_28)).doFinal(((byte[])(__sourceSpill25_27)));
        java.lang.String __sourceSpill25_33 = ((java.lang.String)(com.moon.bn.a(((byte[])(local19_life30))))).intern();
        java.lang.String[] __sourceSpill25_34 = local11_life18;
        int __sourceSpill25_35 = local17_life19;
        local17_life19 += 1;
        (__sourceSpill25_34)[__sourceSpill25_35] = __sourceSpill25_33;
        if (!(((local14_life24 = (local14_life24 + local15_life23)) < local18_life22))) { break; }
        local15_life23 = ((java.lang.String)(local16_life20)).charAt(((int)(local14_life24)));
    }
    local18_life22 = ((java.lang.String)((local16_life20 = "ë@\b.o\022U¼Ú\007^áÉ\020ry?ð0NwËìQÔñV\007"))).length();
    local15_life23 = 16;
    local14_life24 = -1;
    while (true) {
        local14_life24 += 1;
        byte[] __sourceSpill25_40 = ((java.lang.String)(((java.lang.String)(local16_life20)).substring(((int)(local14_life24)), ((int)((local14_life24 + local15_life23)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill25_41 = local12_life8;
        byte[] local19_life43 = ((javax.crypto.Cipher)(__sourceSpill25_41)).doFinal(((byte[])(__sourceSpill25_40)));
        java.lang.String __sourceSpill25_46 = ((java.lang.String)(com.moon.bn.a(((byte[])(local19_life43))))).intern();
        java.lang.String[] __sourceSpill25_47 = local11_life18;
        int __sourceSpill25_48 = local17_life19;
        local17_life19 += 1;
        (__sourceSpill25_47)[__sourceSpill25_48] = __sourceSpill25_46;
        if (!(((local14_life24 = (local14_life24 + local15_life23)) < local18_life22))) { break; }
        local15_life23 = ((java.lang.String)(local16_life20)).charAt(((int)(local14_life24)));
    }
    f = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life52;
    javax.crypto.Cipher __sourceSpill25_54 = (local0_life52 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill25_55 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill25_56 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill25_57 = new byte[8];
    (__sourceSpill25_57)[0] = ((byte) ((int) (local20_life6 >>> 56)));
    int local1_life58 = 1;
    while ((local1_life58 < 8)) {
        (__sourceSpill25_57)[local1_life58] = ((byte) ((int) ((local20_life6 << (local1_life58 * 8)) >>> 56)));
        local1_life58 += 1;
    }
    byte[] __sourcePreallocation25_59 = __sourceSpill25_57;
    ((javax.crypto.Cipher)(__sourceSpill25_54)).init(((int)(__sourceSpill25_55)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill25_56)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation25_59)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life62 = new long[5];
    int local3_life63 = 0;
    java.lang.String local4_life64;
    int local5_life66 = ((java.lang.String)((local4_life64 = "ÔK¸ +Ù~ì7­LxÀ¥ßvY1"))).length();
    int local2_life67 = 0;
    do {
        java.lang.String __sourceSpill25_68 = local4_life64;
        int __sourceSpill25_69 = local2_life67;
        local2_life67 += 8;
        byte[] local7_life72 = ((java.lang.String)(((java.lang.String)(__sourceSpill25_68)).substring(((int)(__sourceSpill25_69)), ((int)(local2_life67))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill25_73 = local6_life62;
        int __sourceSpill25_74 = local3_life63;
        local3_life63 += 1;
        long local8_life75 = (((((((((((long) (local7_life72)[0]) & 255L) << 56) | ((((long) (local7_life72)[1]) & 255L) << 48)) | ((((long) (local7_life72)[2]) & 255L) << 40)) | ((((long) (local7_life72)[3]) & 255L) << 32)) | ((((long) (local7_life72)[4]) & 255L) << 24)) | ((((long) (local7_life72)[5]) & 255L) << 16)) | ((((long) (local7_life72)[6]) & 255L) << 8)) | (((long) (local7_life72)[7]) & 255L));
        byte[] __sourceSpill25_76 = new byte[8];
        (__sourceSpill25_76)[0] = ((byte) ((int) (local8_life75 >>> 56)));
        (__sourceSpill25_76)[1] = ((byte) ((int) (local8_life75 >>> 48)));
        (__sourceSpill25_76)[2] = ((byte) ((int) (local8_life75 >>> 40)));
        (__sourceSpill25_76)[3] = ((byte) ((int) (local8_life75 >>> 32)));
        (__sourceSpill25_76)[4] = ((byte) ((int) (local8_life75 >>> 24)));
        (__sourceSpill25_76)[5] = ((byte) ((int) (local8_life75 >>> 16)));
        (__sourceSpill25_76)[6] = ((byte) ((int) (local8_life75 >>> 8)));
        (__sourceSpill25_76)[7] = ((byte) ((int) local8_life75));
        javax.crypto.Cipher __sourceSpill25_77 = local0_life52;
        byte[] local10_life79 = ((javax.crypto.Cipher)(__sourceSpill25_77)).doFinal(((byte[])(__sourceSpill25_76)));
        (__sourceSpill25_73)[__sourceSpill25_74] = (((((((((((long) (local10_life79)[0]) & 255L) << 56) | ((((long) (local10_life79)[1]) & 255L) << 48)) | ((((long) (local10_life79)[2]) & 255L) << 40)) | ((((long) (local10_life79)[3]) & 255L) << 32)) | ((((long) (local10_life79)[4]) & 255L) << 24)) | ((((long) (local10_life79)[5]) & 255L) << 16)) | ((((long) (local10_life79)[6]) & 255L) << 8)) | (((long) (local10_life79)[7]) & 255L));
    } while ((!(local2_life67 >= local5_life66)));
    local5_life66 = ((java.lang.String)((local4_life64 = "µ÷ªöùôÇNKÉÅ\026å\023"))).length();
    local2_life67 = 0;
    do {
        java.lang.String __sourceSpill25_81 = local4_life64;
        int __sourceSpill25_82 = local2_life67;
        local2_life67 += 8;
        byte[] local7_life85 = ((java.lang.String)(((java.lang.String)(__sourceSpill25_81)).substring(((int)(__sourceSpill25_82)), ((int)(local2_life67))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill25_86 = local6_life62;
        int __sourceSpill25_87 = local3_life63;
        local3_life63 += 1;
        long local8_life88 = (((((((((((long) (local7_life85)[0]) & 255L) << 56) | ((((long) (local7_life85)[1]) & 255L) << 48)) | ((((long) (local7_life85)[2]) & 255L) << 40)) | ((((long) (local7_life85)[3]) & 255L) << 32)) | ((((long) (local7_life85)[4]) & 255L) << 24)) | ((((long) (local7_life85)[5]) & 255L) << 16)) | ((((long) (local7_life85)[6]) & 255L) << 8)) | (((long) (local7_life85)[7]) & 255L));
        byte[] __sourceSpill25_89 = new byte[8];
        (__sourceSpill25_89)[0] = ((byte) ((int) (local8_life88 >>> 56)));
        (__sourceSpill25_89)[1] = ((byte) ((int) (local8_life88 >>> 48)));
        (__sourceSpill25_89)[2] = ((byte) ((int) (local8_life88 >>> 40)));
        (__sourceSpill25_89)[3] = ((byte) ((int) (local8_life88 >>> 32)));
        (__sourceSpill25_89)[4] = ((byte) ((int) (local8_life88 >>> 24)));
        (__sourceSpill25_89)[5] = ((byte) ((int) (local8_life88 >>> 16)));
        (__sourceSpill25_89)[6] = ((byte) ((int) (local8_life88 >>> 8)));
        (__sourceSpill25_89)[7] = ((byte) ((int) local8_life88));
        javax.crypto.Cipher __sourceSpill25_90 = local0_life52;
        byte[] local10_life92 = ((javax.crypto.Cipher)(__sourceSpill25_90)).doFinal(((byte[])(__sourceSpill25_89)));
        (__sourceSpill25_86)[__sourceSpill25_87] = (((((((((((long) (local10_life92)[0]) & 255L) << 56) | ((((long) (local10_life92)[1]) & 255L) << 48)) | ((((long) (local10_life92)[2]) & 255L) << 40)) | ((((long) (local10_life92)[3]) & 255L) << 32)) | ((((long) (local10_life92)[4]) & 255L) << 24)) | ((((long) (local10_life92)[5]) & 255L) << 16)) | ((((long) (local10_life92)[6]) & 255L) << 8)) | (((long) (local10_life92)[7]) & 255L));
    } while ((!(local2_life67 >= local5_life66)));
    d = ((long[])(local6_life62));
    e = ((java.lang.Integer[])(new java.lang.Integer[5]));
    KEEPALIVE = ((com.moon.bn)(new com.moon.bn((local11_life18)[0], 0, (local11_life18)[13])));
    TRANSACTION = ((com.moon.bn)(new com.moon.bn((local11_life18)[4], 1, (local11_life18)[1])));
    VELOCITY = ((com.moon.bn)(new com.moon.bn((local11_life18)[12], 2, (local11_life18)[15])));
    TELEPORT = ((com.moon.bn)(new com.moon.bn((local11_life18)[9], 3, (local11_life18)[8])));
    ENTITIES = ((com.moon.bn)(new com.moon.bn((local11_life18)[14], 4, (local11_life18)[5])));
    ENTITIES_STATUS = ((com.moon.bn)(new com.moon.bn((local11_life18)[6], 5, (local11_life18)[10])));
    CHUNK = ((com.moon.bn)(new com.moon.bn((local11_life18)[7], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite25_101(8024, (6209074905318498163L ^ local20_life6)), (local11_life18)[2])));
    GAME_STATE = ((com.moon.bn)(new com.moon.bn((local11_life18)[3], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite25_103(585, (6469823145264415329L ^ local20_life6)), (local11_life18)[11])));
    b = ((com.moon.bn[])(com.moon.bn.a__Arraybn()));
}


public static com.moon.bn[] values() {
return ((com.moon.bn[])(((com.moon.bn[])(com.moon.bn.b)).clone()));
}


public static com.moon.bn valueOf(java.lang.String p0) {
return ((com.moon.bn)(java.lang.Enum.valueOf(((java.lang.Class)(com.moon.bn.class)), ((java.lang.String)(p0)))));
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 12429;
      if (e[var3] == null) {
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
         long var5 = d[var3];
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
         Object[] var9 = (Object[])f.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               f.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/moon/bn", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         e[var3] = var15;
      }

      return e[var3];
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral710_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/bn"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.bn.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
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
        byte[] spill84_0 = p0;
        life4_9 += 1;
        life5_44 = (spill84_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill84_1 = p0;
        life4_9 += 1;
        life5_76 = (spill84_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill84_2 = p0;
        life4_9 += 1;
        life5_91 = (spill84_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static com.moon.bn[] a__Arraybn() {
long local0_life1 = (com.moon.bn.c ^ 104908860844235L);
    com.moon.bn[] __sourceSharedArray18_4 = new com.moon.bn[__sourceIntrinsic_820d425bd579_originalDynamicSite18_2(26155, (6566663039124973459L ^ local0_life1))];
    __sourceSharedArray18_4[0] = com.moon.bn.KEEPALIVE;
    __sourceSharedArray18_4[1] = com.moon.bn.TRANSACTION;
    __sourceSharedArray18_4[2] = com.moon.bn.VELOCITY;
    __sourceSharedArray18_4[3] = com.moon.bn.TELEPORT;
    __sourceSharedArray18_4[4] = com.moon.bn.ENTITIES;
    __sourceSharedArray18_4[5] = com.moon.bn.ENTITIES_STATUS;
    __sourceSharedArray18_4[__sourceIntrinsic_820d425bd579_originalDynamicSite18_10(3627, (8261098389537312661L ^ local0_life1))] = com.moon.bn.CHUNK;
    __sourceSharedArray18_4[__sourceIntrinsic_820d425bd579_originalDynamicSite18_12(20829, (8317374115282850016L ^ local0_life1))] = com.moon.bn.GAME_STATE;
    return __sourceSharedArray18_4;
}


public java.lang.String a__String() {
return this.a;
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite25_101(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite25_103(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral710_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_820d425bd579_originalDynamicSite18_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_820d425bd579_originalDynamicSite18_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_820d425bd579_originalDynamicSite18_12(int a0, long a1) throws E;
}
