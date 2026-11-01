package com.moon.module.impl;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Disabler extends com.moon.module.Module {

private com.moon.setting.EnumSetting<com.moon.bm> s;

private com.moon.setting.BooleanSetting t;

private com.moon.setting.BooleanSetting u;

private com.moon.setting.BooleanSetting v;

private com.moon.setting.IntegerSetting w;

private static long x;

private static java.lang.String[] y;

private static java.lang.String[] z;

private static java.util.Map A;

private static long[] B;

private static java.lang.Integer[] C;

private static java.util.Map D;

public Disabler(java.lang.String p0, java.lang.String p1, java.lang.String p2, com.moon.module.ModuleCategory p3) { super((java.lang.String)null, (java.lang.String)null, (java.lang.String)null, (com.moon.module.ModuleCategory)null); }


private static void __sourceConstructorBody_3a17667fae26c35a(com.moon.module.impl.Disabler receiver, java.lang.String p0, java.lang.String p1, java.lang.String p2, com.moon.module.ModuleCategory p3) throws Throwable {

long local5 = (com.moon.module.impl.Disabler.x ^ 26187495494006L);

    com.moon.module.impl.Disabler.__sourceConstructorInit_3a17667fae26c35a_0(((com.moon.module.impl.Disabler)(receiver)), ((java.lang.String)(p0)), ((java.lang.String)(p1)), ((java.lang.String)(p2)), ((com.moon.module.ModuleCategory)(p3)));

    ((com.moon.module.impl.Disabler)(receiver)).s = ((com.moon.setting.EnumSetting)(((com.moon.mg)(((com.moon.mg)(com.moon.setting.EnumSetting.builder(((java.lang.String)(__sourceIntrinsic_3a17667fae26c35a_originalDynamicSite1240_2(7272, (5868720330831715261L ^ local5)))), ((java.lang.Class)(com.moon.bm.class)), ((com.moon.module.Module)(receiver))))).a(((java.lang.String)(__sourceIntrinsic_3a17667fae26c35a_originalDynamicSite1240_5(31140, (5293264514413018751L ^ local5)))), ((java.lang.Enum)(com.moon.bm.SENTINEL))))).a()));

    ((com.moon.module.impl.Disabler)(receiver)).t = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_3a17667fae26c35a_originalDynamicSite1240_10(14616, (6233829103265578699L ^ local5))))))).a(((java.lang.String)(__sourceIntrinsic_3a17667fae26c35a_originalDynamicSite1240_12(17338, (7561287486348461166L ^ local5)))), ((boolean)(false))))).a(((java.util.function.Supplier)(__sourceIntrinsic_3a17667fae26c35a_originalDynamicSite1240_14(receiver)))))).a()));

    ((com.moon.module.impl.Disabler)(receiver)).u = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_3a17667fae26c35a_originalDynamicSite1240_18(9274, (5517952251817092072L ^ local5))))))).a(((java.lang.String)(__sourceIntrinsic_3a17667fae26c35a_originalDynamicSite1240_20(11682, (6869537291402209909L ^ local5)))), ((boolean)(false))))).a(((java.util.function.Supplier)(__sourceIntrinsic_3a17667fae26c35a_originalDynamicSite1240_22(receiver)))))).a()));

    ((com.moon.module.impl.Disabler)(receiver)).v = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_3a17667fae26c35a_originalDynamicSite1240_26(5102, (1801956583638324287L ^ local5))))))).a(((java.lang.String)(__sourceIntrinsic_3a17667fae26c35a_originalDynamicSite1240_28(5949, (5956027408139997419L ^ local5)))), ((boolean)(false))))).a(((java.util.function.Supplier)(__sourceIntrinsic_3a17667fae26c35a_originalDynamicSite1240_30(receiver)))))).a()));

    ((com.moon.module.impl.Disabler)(receiver)).w = ((com.moon.setting.IntegerSetting)(((com.moon.mf)(((com.moon.mf)(((com.moon.mf)(com.moon.setting.IntegerSetting.builder(((java.lang.String)(__sourceIntrinsic_3a17667fae26c35a_originalDynamicSite1240_34(15149, (80048978223004925L ^ local5))))))).a(((java.lang.String)(__sourceIntrinsic_3a17667fae26c35a_originalDynamicSite1240_36(18978, (6485230023982255608L ^ local5)))), ((int)(__sourceIntrinsic_3a17667fae26c35a_originalDynamicSite1240_37(427, (6240240117592897636L ^ local5)))), ((int)(2)), ((int)(__sourceIntrinsic_3a17667fae26c35a_originalDynamicSite1240_38(11821, (5628943853242292195L ^ local5)))), ((int)(1))))).a(((java.util.function.Supplier)(__sourceIntrinsic_3a17667fae26c35a_originalDynamicSite1240_40(receiver)))))).a()));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_3a17667fae26c35a_0(com.moon.module.impl.Disabler a0, java.lang.String a1, java.lang.String a2, java.lang.String a3, com.moon.module.ModuleCategory a4) throws E;

static {
x = ((long)(((moom._a)(moom._c.a(((long)(6563949098142297713L)), ((long)(9002593921637734533L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(164439374791342L)))));
    A = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (com.moon.module.impl.Disabler.x ^ 14741439100969L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill269_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill269_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill269_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill269_14 = new byte[8];
    (__sourceSpill269_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill269_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation269_16 = __sourceSpill269_14;
    ((javax.crypto.Cipher)(__sourceSpill269_11)).init(((int)(__sourceSpill269_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill269_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation269_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local20_life19 = new java.lang.String[10];
    int local18_life20 = 0;
    java.lang.String local17_life21;
    int local19_life23 = ((java.lang.String)((local17_life21 = "Û\tDò6_Ð¹Ö)³ÞU\tm5ä\013(Ð¤oR0þ³S/=\036Aþ§´j§Mü,\034þÆ{«ÎøÜ`4P=lÎ+ÅÑDú)R\025ö\007E³îD'a× [¦Ø\025â.mïWc4»¯ªAò[ÙyÕ\026¯\025a%§LD\030àm+Lmãï\034ÕÅæ\036×¶¯*Òo\003\024\016g*8 :W\027ycW×<\022¼Äy\004\027±4èW¢»Ä3n\002\016Ò\bq(7Â,y¨x÷:\024\005äþq§q\027Ë3å¼nßÓQ Ð,ÀÄ7ºÓ¡èa\022\025(\033?ç÷îªÑùtW2½øð:¾²-yµ­ëä\t\001¤w¢.\020Óe¶\016<\f~§Y\0002Q"))).length();
    int local16_life24 = 24;
    int local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill269_28 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill269_29 = local13_life9;
        byte[] local21_life31 = ((javax.crypto.Cipher)(__sourceSpill269_29)).doFinal(((byte[])(__sourceSpill269_28)));
        java.lang.String __sourceSpill269_34 = ((java.lang.String)(com.moon.module.impl.Disabler.c(((byte[])(local21_life31))))).intern();
        java.lang.String[] __sourceSpill269_35 = local20_life19;
        int __sourceSpill269_36 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill269_35)[__sourceSpill269_36] = __sourceSpill269_34;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    local19_life23 = ((java.lang.String)((local17_life21 = "Z\0351w\"Fíìs\nXò!çC\0208\023}wîØ·\007þo\024P|"))).length();
    local16_life24 = 16;
    local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill269_41 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill269_42 = local13_life9;
        byte[] local21_life44 = ((javax.crypto.Cipher)(__sourceSpill269_42)).doFinal(((byte[])(__sourceSpill269_41)));
        java.lang.String __sourceSpill269_47 = ((java.lang.String)(com.moon.module.impl.Disabler.c(((byte[])(local21_life44))))).intern();
        java.lang.String[] __sourceSpill269_48 = local20_life19;
        int __sourceSpill269_49 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill269_48)[__sourceSpill269_49] = __sourceSpill269_47;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    y = ((java.lang.String[])(local20_life19));
    z = ((java.lang.String[])(new java.lang.String[10]));
    D = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life55;
    javax.crypto.Cipher __sourceSpill269_57 = (local0_life55 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill269_58 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill269_59 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill269_60 = new byte[8];
    (__sourceSpill269_60)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life61 = 1;
    while ((local1_life61 < 8)) {
        (__sourceSpill269_60)[local1_life61] = ((byte) ((int) ((local11_life7 << (local1_life61 * 8)) >>> 56)));
        local1_life61 += 1;
    }
    byte[] __sourcePreallocation269_62 = __sourceSpill269_60;
    ((javax.crypto.Cipher)(__sourceSpill269_57)).init(((int)(__sourceSpill269_58)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill269_59)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation269_62)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life65 = new long[2];
    int local3_life66 = 0;
    java.lang.String local4_life67;
    int local5_life69 = ((java.lang.String)((local4_life67 = "\b\nz\035\006ÂAÃfyzìf{Fe"))).length();
    int local2_life70 = 0;
    do {
        java.lang.String __sourceSpill269_71 = local4_life67;
        int __sourceSpill269_72 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill269_71)).substring(((int)(__sourceSpill269_72)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill269_76 = local6_life65;
        int __sourceSpill269_77 = local3_life66;
        local3_life66 += 1;
        long local8_life78 = (((((((((((long) (local7_life75)[0]) & 255L) << 56) | ((((long) (local7_life75)[1]) & 255L) << 48)) | ((((long) (local7_life75)[2]) & 255L) << 40)) | ((((long) (local7_life75)[3]) & 255L) << 32)) | ((((long) (local7_life75)[4]) & 255L) << 24)) | ((((long) (local7_life75)[5]) & 255L) << 16)) | ((((long) (local7_life75)[6]) & 255L) << 8)) | (((long) (local7_life75)[7]) & 255L));
        byte[] __sourceSpill269_79 = new byte[8];
        (__sourceSpill269_79)[0] = ((byte) ((int) (local8_life78 >>> 56)));
        (__sourceSpill269_79)[1] = ((byte) ((int) (local8_life78 >>> 48)));
        (__sourceSpill269_79)[2] = ((byte) ((int) (local8_life78 >>> 40)));
        (__sourceSpill269_79)[3] = ((byte) ((int) (local8_life78 >>> 32)));
        (__sourceSpill269_79)[4] = ((byte) ((int) (local8_life78 >>> 24)));
        (__sourceSpill269_79)[5] = ((byte) ((int) (local8_life78 >>> 16)));
        (__sourceSpill269_79)[6] = ((byte) ((int) (local8_life78 >>> 8)));
        (__sourceSpill269_79)[7] = ((byte) ((int) local8_life78));
        javax.crypto.Cipher __sourceSpill269_80 = local0_life55;
        byte[] local10_life82 = ((javax.crypto.Cipher)(__sourceSpill269_80)).doFinal(((byte[])(__sourceSpill269_79)));
        (__sourceSpill269_76)[__sourceSpill269_77] = (((((((((((long) (local10_life82)[0]) & 255L) << 56) | ((((long) (local10_life82)[1]) & 255L) << 48)) | ((((long) (local10_life82)[2]) & 255L) << 40)) | ((((long) (local10_life82)[3]) & 255L) << 32)) | ((((long) (local10_life82)[4]) & 255L) << 24)) | ((((long) (local10_life82)[5]) & 255L) << 16)) | ((((long) (local10_life82)[6]) & 255L) << 8)) | (((long) (local10_life82)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    B = ((long[])(local6_life65));
    C = ((java.lang.Integer[])(new java.lang.Integer[2]));
}


public com.moon.setting.BooleanSetting b() {
return this.u;
}


private static java.lang.Object c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.module.impl.Disabler.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.String c(int p0, long p1) {
int life5_8;
    java.lang.Long life3_16;
    java.lang.Object[] life4_21;
    byte[] life6_60;
    int life7_70;
    javax.crypto.spec.DESKeySpec life7_92;
    javax.crypto.SecretKey life8_99;
    byte[] life9_116;
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 12986);
    if (((com.moon.module.impl.Disabler.z)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.module.impl.Disabler.A)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.module.impl.Disabler.A)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/li", life9_51);
    }
        life6_60 = new byte[8];
        (life6_60)[0] = ((byte) ((int) (p1 >>> 56)));
        life7_70 = 1;
        loop_region_71: while ((life7_70 < 8)) {
        (life6_60)[life7_70] = ((byte) ((int) ((p1 << (life7_70 * 8)) >>> 56)));
        life7_70 += 1;
    }
        life7_92 = new javax.crypto.spec.DESKeySpec(life6_60);
        life8_99 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life4_21)[1])))).generateSecret(((java.security.spec.KeySpec)(life7_92)));
        ((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).init(((int)(2)), ((java.security.Key)(life8_99)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life4_21)[2])))));
        life9_116 = ((java.lang.String)((com.moon.module.impl.Disabler.y)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.module.impl.Disabler.z)[life5_8] = com.moon.module.impl.Disabler.c(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.module.impl.Disabler.z)[life5_8];
}


private static java.lang.String c(byte[] p0) {
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
        byte[] spill1080_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1080_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1080_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1080_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1080_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1080_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


public com.moon.setting.BooleanSetting c() {
return this.v;
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral2456_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/li"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.module.impl.Disabler.d(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral2457_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/li"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int d(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 19622;
      if (C[var3] == null) {
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
         long var5 = B[var3];
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
         Object[] var9 = (Object[])D.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               D.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/moon/li", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         C[var3] = var15;
      }

      return C[var3];
}


public com.moon.setting.BooleanSetting a__kV() {
return this.t;
}


public com.moon.setting.EnumSetting<com.moon.bm> a__k2() {
return this.s;
}


public void a(com.moon.event.TickEvent p0) {
long local2 = (com.moon.module.impl.Disabler.x ^ 122315466158068L);
    if ((((com.moon.event.TickEvent)(p0)).getPhase() == com.moon.event.TickPhase.PRE)) {
        ((com.moon.module.impl.Disabler)(this)).setSuffix(((java.lang.String)(((com.moon.bm)(((com.moon.bm)(((com.moon.setting.EnumSetting)(this.s)).getValue())))).a__String())));
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public com.moon.setting.IntegerSetting a() {
return this.w;
}


private java.lang.Boolean lambda$new$0() {
long local1 = (com.moon.module.impl.Disabler.x ^ 100060570353064L);
    return java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((((((com.moon.setting.EnumSetting)(this.s)).getValue() == com.moon.bm.VULCAN) ? 1 : 0)))));
}


private java.lang.Boolean lambda$new$1() {
long local1 = (com.moon.module.impl.Disabler.x ^ 129553723914616L);
    return java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((((((com.moon.setting.EnumSetting)(this.s)).getValue() == com.moon.bm.VULCAN) ? 1 : 0)))));
}


private java.lang.Boolean lambda$new$3() {
long local1 = (com.moon.module.impl.Disabler.x ^ 2915206574550L);
    return java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((((((com.moon.setting.EnumSetting)(this.s)).getValue() == com.moon.bm.TELEPORT) ? 1 : 0)))));
}


private java.lang.Boolean lambda$new$2() {
long local1 = (com.moon.module.impl.Disabler.x ^ 63889792915265L);
    return java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((((((com.moon.setting.EnumSetting)(this.s)).getValue() == com.moon.bm.VULCAN) ? 1 : 0)))));
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3a17667fae26c35a_originalDynamicSite1240_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3a17667fae26c35a_originalDynamicSite1240_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3a17667fae26c35a_originalDynamicSite1240_10(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3a17667fae26c35a_originalDynamicSite1240_12(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_3a17667fae26c35a_originalDynamicSite1240_14(com.moon.module.impl.Disabler a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3a17667fae26c35a_originalDynamicSite1240_18(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3a17667fae26c35a_originalDynamicSite1240_20(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_3a17667fae26c35a_originalDynamicSite1240_22(com.moon.module.impl.Disabler a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3a17667fae26c35a_originalDynamicSite1240_26(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3a17667fae26c35a_originalDynamicSite1240_28(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_3a17667fae26c35a_originalDynamicSite1240_30(com.moon.module.impl.Disabler a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3a17667fae26c35a_originalDynamicSite1240_34(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3a17667fae26c35a_originalDynamicSite1240_36(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3a17667fae26c35a_originalDynamicSite1240_37(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3a17667fae26c35a_originalDynamicSite1240_38(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_3a17667fae26c35a_originalDynamicSite1240_40(com.moon.module.impl.Disabler a0) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral2456_0() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral2457_0() throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
