package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class bp extends sourcebuild.EnumConstructor<com.moon.bp> implements com.moon.l8 {

public static com.moon.bp KEEPALIVE;

public static com.moon.bp TRANSACTION;

public static com.moon.bp VELOCITY;

public static com.moon.bp TELEPORT;

public static com.moon.bp ENTITIES;

public static com.moon.bp ENTITIES_STATUS;

public static com.moon.bp CHUNK;

public static com.moon.bp GAME_STATE;

private java.lang.String a;

private static com.moon.bp[] b;

private static long c;

private static long[] d;

private static java.lang.Integer[] e;

private static java.util.Map f;

private bp(java.lang.String p0, int p1, java.lang.String p2) {
super(p0, p1);
    this.a = p2;
}


private static void initialize() {
c = ((long)(((moom._a)(moom._c.a(((long)(-6809424437138577895L)), ((long)(-4159604894227447492L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(126039505202207L)))));
    long local20_life6 = (com.moon.bp.c ^ 115207422053378L);
    javax.crypto.Cipher local12_life8;
    javax.crypto.Cipher __sourceSpill26_10 = (local12_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill26_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill26_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill26_13 = new byte[8];
    (__sourceSpill26_13)[0] = ((byte) ((int) (local20_life6 >>> 56)));
    int local13_life14 = 1;
    while ((local13_life14 < 8)) {
        (__sourceSpill26_13)[local13_life14] = ((byte) ((int) ((local20_life6 << (local13_life14 * 8)) >>> 56)));
        local13_life14 += 1;
    }
    byte[] __sourcePreallocation26_15 = __sourceSpill26_13;
    ((javax.crypto.Cipher)(__sourceSpill26_10)).init(((int)(__sourceSpill26_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill26_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation26_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local11_life18 = new java.lang.String[16];
    int local17_life19 = 0;
    java.lang.String local16_life20;
    int local18_life22 = ((java.lang.String)((local16_life20 = "\026Ââ<ò|\020÷\177I0H%±\020À<\0317¢<ì;\020Þ«\007^®f3j¼\bÚÝ­\bNª«9\016tp\020 Ø8Bh\027\031§#GZÃ\020¡Æ7\003-qôÏ\024àåq5ã\020xgÝ\0019Z\nDQD`õe§\020>`F}ò?Ôägÿ\020jx3ÕötÕ\007\bG¼\001\013\006\020jx3ÕötÐuþÚøïÅÊ\0202ðÑÕØh\004Lll\007ë\004Ó\020w\037zcù\017\nóÿj\000F\031\013\020´0F¤¦hVuq#Þ¹dÝ\002\020\003÷R\030p\001pKÊû5lËí6"))).length();
    int local15_life23 = 8;
    int local14_life24 = -1;
    while (true) {
        local14_life24 += 1;
        byte[] __sourceSpill26_27 = ((java.lang.String)(((java.lang.String)(local16_life20)).substring(((int)(local14_life24)), ((int)((local14_life24 + local15_life23)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill26_28 = local12_life8;
        byte[] local19_life30 = ((javax.crypto.Cipher)(__sourceSpill26_28)).doFinal(((byte[])(__sourceSpill26_27)));
        java.lang.String __sourceSpill26_33 = ((java.lang.String)(com.moon.bp.a(((byte[])(local19_life30))))).intern();
        java.lang.String[] __sourceSpill26_34 = local11_life18;
        int __sourceSpill26_35 = local17_life19;
        local17_life19 += 1;
        (__sourceSpill26_34)[__sourceSpill26_35] = __sourceSpill26_33;
        if (!(((local14_life24 = (local14_life24 + local15_life23)) < local18_life22))) { break; }
        local15_life23 = ((java.lang.String)(local16_life20)).charAt(((int)(local14_life24)));
    }
    local18_life22 = ((java.lang.String)((local16_life20 = "ÅS?­I\t·R|I]rÇ\020 Ø8Bh3wµ^ÁÑq"))).length();
    local15_life23 = 16;
    local14_life24 = -1;
    while (true) {
        local14_life24 += 1;
        byte[] __sourceSpill26_40 = ((java.lang.String)(((java.lang.String)(local16_life20)).substring(((int)(local14_life24)), ((int)((local14_life24 + local15_life23)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill26_41 = local12_life8;
        byte[] local19_life43 = ((javax.crypto.Cipher)(__sourceSpill26_41)).doFinal(((byte[])(__sourceSpill26_40)));
        java.lang.String __sourceSpill26_46 = ((java.lang.String)(com.moon.bp.a(((byte[])(local19_life43))))).intern();
        java.lang.String[] __sourceSpill26_47 = local11_life18;
        int __sourceSpill26_48 = local17_life19;
        local17_life19 += 1;
        (__sourceSpill26_47)[__sourceSpill26_48] = __sourceSpill26_46;
        if (!(((local14_life24 = (local14_life24 + local15_life23)) < local18_life22))) { break; }
        local15_life23 = ((java.lang.String)(local16_life20)).charAt(((int)(local14_life24)));
    }
    f = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life52;
    javax.crypto.Cipher __sourceSpill26_54 = (local0_life52 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill26_55 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill26_56 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill26_57 = new byte[8];
    (__sourceSpill26_57)[0] = ((byte) ((int) (local20_life6 >>> 56)));
    int local1_life58 = 1;
    while ((local1_life58 < 8)) {
        (__sourceSpill26_57)[local1_life58] = ((byte) ((int) ((local20_life6 << (local1_life58 * 8)) >>> 56)));
        local1_life58 += 1;
    }
    byte[] __sourcePreallocation26_59 = __sourceSpill26_57;
    ((javax.crypto.Cipher)(__sourceSpill26_54)).init(((int)(__sourceSpill26_55)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill26_56)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation26_59)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life62 = new long[5];
    int local3_life63 = 0;
    java.lang.String local4_life64;
    int local5_life66 = ((java.lang.String)((local4_life64 = "cçò ¦çç±§\t\001b\013\\¿d}rý0÷"))).length();
    int local2_life67 = 0;
    do {
        java.lang.String __sourceSpill26_68 = local4_life64;
        int __sourceSpill26_69 = local2_life67;
        local2_life67 += 8;
        byte[] local7_life72 = ((java.lang.String)(((java.lang.String)(__sourceSpill26_68)).substring(((int)(__sourceSpill26_69)), ((int)(local2_life67))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill26_73 = local6_life62;
        int __sourceSpill26_74 = local3_life63;
        local3_life63 += 1;
        long local8_life75 = (((((((((((long) (local7_life72)[0]) & 255L) << 56) | ((((long) (local7_life72)[1]) & 255L) << 48)) | ((((long) (local7_life72)[2]) & 255L) << 40)) | ((((long) (local7_life72)[3]) & 255L) << 32)) | ((((long) (local7_life72)[4]) & 255L) << 24)) | ((((long) (local7_life72)[5]) & 255L) << 16)) | ((((long) (local7_life72)[6]) & 255L) << 8)) | (((long) (local7_life72)[7]) & 255L));
        byte[] __sourceSpill26_76 = new byte[8];
        (__sourceSpill26_76)[0] = ((byte) ((int) (local8_life75 >>> 56)));
        (__sourceSpill26_76)[1] = ((byte) ((int) (local8_life75 >>> 48)));
        (__sourceSpill26_76)[2] = ((byte) ((int) (local8_life75 >>> 40)));
        (__sourceSpill26_76)[3] = ((byte) ((int) (local8_life75 >>> 32)));
        (__sourceSpill26_76)[4] = ((byte) ((int) (local8_life75 >>> 24)));
        (__sourceSpill26_76)[5] = ((byte) ((int) (local8_life75 >>> 16)));
        (__sourceSpill26_76)[6] = ((byte) ((int) (local8_life75 >>> 8)));
        (__sourceSpill26_76)[7] = ((byte) ((int) local8_life75));
        javax.crypto.Cipher __sourceSpill26_77 = local0_life52;
        byte[] local10_life79 = ((javax.crypto.Cipher)(__sourceSpill26_77)).doFinal(((byte[])(__sourceSpill26_76)));
        (__sourceSpill26_73)[__sourceSpill26_74] = (((((((((((long) (local10_life79)[0]) & 255L) << 56) | ((((long) (local10_life79)[1]) & 255L) << 48)) | ((((long) (local10_life79)[2]) & 255L) << 40)) | ((((long) (local10_life79)[3]) & 255L) << 32)) | ((((long) (local10_life79)[4]) & 255L) << 24)) | ((((long) (local10_life79)[5]) & 255L) << 16)) | ((((long) (local10_life79)[6]) & 255L) << 8)) | (((long) (local10_life79)[7]) & 255L));
    } while ((!(local2_life67 >= local5_life66)));
    local5_life66 = ((java.lang.String)((local4_life64 = "ð³Ñ³Ê\002DÂÚ2Qµû80["))).length();
    local2_life67 = 0;
    do {
        java.lang.String __sourceSpill26_81 = local4_life64;
        int __sourceSpill26_82 = local2_life67;
        local2_life67 += 8;
        byte[] local7_life85 = ((java.lang.String)(((java.lang.String)(__sourceSpill26_81)).substring(((int)(__sourceSpill26_82)), ((int)(local2_life67))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill26_86 = local6_life62;
        int __sourceSpill26_87 = local3_life63;
        local3_life63 += 1;
        long local8_life88 = (((((((((((long) (local7_life85)[0]) & 255L) << 56) | ((((long) (local7_life85)[1]) & 255L) << 48)) | ((((long) (local7_life85)[2]) & 255L) << 40)) | ((((long) (local7_life85)[3]) & 255L) << 32)) | ((((long) (local7_life85)[4]) & 255L) << 24)) | ((((long) (local7_life85)[5]) & 255L) << 16)) | ((((long) (local7_life85)[6]) & 255L) << 8)) | (((long) (local7_life85)[7]) & 255L));
        byte[] __sourceSpill26_89 = new byte[8];
        (__sourceSpill26_89)[0] = ((byte) ((int) (local8_life88 >>> 56)));
        (__sourceSpill26_89)[1] = ((byte) ((int) (local8_life88 >>> 48)));
        (__sourceSpill26_89)[2] = ((byte) ((int) (local8_life88 >>> 40)));
        (__sourceSpill26_89)[3] = ((byte) ((int) (local8_life88 >>> 32)));
        (__sourceSpill26_89)[4] = ((byte) ((int) (local8_life88 >>> 24)));
        (__sourceSpill26_89)[5] = ((byte) ((int) (local8_life88 >>> 16)));
        (__sourceSpill26_89)[6] = ((byte) ((int) (local8_life88 >>> 8)));
        (__sourceSpill26_89)[7] = ((byte) ((int) local8_life88));
        javax.crypto.Cipher __sourceSpill26_90 = local0_life52;
        byte[] local10_life92 = ((javax.crypto.Cipher)(__sourceSpill26_90)).doFinal(((byte[])(__sourceSpill26_89)));
        (__sourceSpill26_86)[__sourceSpill26_87] = (((((((((((long) (local10_life92)[0]) & 255L) << 56) | ((((long) (local10_life92)[1]) & 255L) << 48)) | ((((long) (local10_life92)[2]) & 255L) << 40)) | ((((long) (local10_life92)[3]) & 255L) << 32)) | ((((long) (local10_life92)[4]) & 255L) << 24)) | ((((long) (local10_life92)[5]) & 255L) << 16)) | ((((long) (local10_life92)[6]) & 255L) << 8)) | (((long) (local10_life92)[7]) & 255L));
    } while ((!(local2_life67 >= local5_life66)));
    d = ((long[])(local6_life62));
    e = ((java.lang.Integer[])(new java.lang.Integer[5]));
    KEEPALIVE = ((com.moon.bp)(new com.moon.bp((local11_life18)[11], 0, (local11_life18)[10])));
    TRANSACTION = ((com.moon.bp)(new com.moon.bp((local11_life18)[5], 1, (local11_life18)[13])));
    VELOCITY = ((com.moon.bp)(new com.moon.bp((local11_life18)[7], 2, (local11_life18)[12])));
    TELEPORT = ((com.moon.bp)(new com.moon.bp((local11_life18)[14], 3, (local11_life18)[1])));
    ENTITIES = ((com.moon.bp)(new com.moon.bp((local11_life18)[15], 4, (local11_life18)[9])));
    ENTITIES_STATUS = ((com.moon.bp)(new com.moon.bp((local11_life18)[4], 5, (local11_life18)[8])));
    CHUNK = ((com.moon.bp)(new com.moon.bp((local11_life18)[3], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite26_101(21737, (7205297845426133395L ^ local20_life6)), (local11_life18)[0])));
    GAME_STATE = ((com.moon.bp)(new com.moon.bp((local11_life18)[6], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite26_103(21321, (8511732972662464050L ^ local20_life6)), (local11_life18)[2])));
    b = ((com.moon.bp[])(com.moon.bp.a__Arraybp()));
}


public static com.moon.bp[] values() {
return ((com.moon.bp[])(((com.moon.bp[])(com.moon.bp.b)).clone()));
}


public static com.moon.bp valueOf(java.lang.String p0) {
return ((com.moon.bp)(java.lang.Enum.valueOf(((java.lang.Class)(com.moon.bp.class)), ((java.lang.String)(p0)))));
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 3073;
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
            throw new RuntimeException("com/moon/bp", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         e[var3] = var15;
      }

      return e[var3];
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral713_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/bp"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.bp.a(((int)(local4)), ((long)(local5)));
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
        byte[] spill86_0 = p0;
        life4_9 += 1;
        life5_44 = (spill86_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill86_1 = p0;
        life4_9 += 1;
        life5_76 = (spill86_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill86_2 = p0;
        life4_9 += 1;
        life5_91 = (spill86_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static com.moon.bp[] a__Arraybp() {
long local0_life1 = (com.moon.bp.c ^ 23759594072289L);
    com.moon.bp[] __sourceSharedArray19_4 = new com.moon.bp[__sourceIntrinsic_e7921ea9f9de_originalDynamicSite19_2(25551, (1939374408656128597L ^ local0_life1))];
    __sourceSharedArray19_4[0] = com.moon.bp.KEEPALIVE;
    __sourceSharedArray19_4[1] = com.moon.bp.TRANSACTION;
    __sourceSharedArray19_4[2] = com.moon.bp.VELOCITY;
    __sourceSharedArray19_4[3] = com.moon.bp.TELEPORT;
    __sourceSharedArray19_4[4] = com.moon.bp.ENTITIES;
    __sourceSharedArray19_4[5] = com.moon.bp.ENTITIES_STATUS;
    __sourceSharedArray19_4[__sourceIntrinsic_e7921ea9f9de_originalDynamicSite19_10(4269, (2438238783151896886L ^ local0_life1))] = com.moon.bp.CHUNK;
    __sourceSharedArray19_4[__sourceIntrinsic_e7921ea9f9de_originalDynamicSite19_12(6881, (1284219372174635902L ^ local0_life1))] = com.moon.bp.GAME_STATE;
    return __sourceSharedArray19_4;
}


public java.lang.String a__String() {
return this.a;
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite26_101(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite26_103(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral713_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7921ea9f9de_originalDynamicSite19_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7921ea9f9de_originalDynamicSite19_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7921ea9f9de_originalDynamicSite19_12(int a0, long a1) throws E;
}
