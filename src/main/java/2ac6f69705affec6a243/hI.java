package com.moon;


public class hI {

private java.util.List<com.moon.hM> a;

private com.moon.hM b;

private com.moon.hM c;

private com.moon.hM d;

private com.moon.hJ e;

private static java.lang.String f;

private static long g;

private static java.lang.String[] h;

private static java.lang.String[] i;

private static java.util.Map j;

public hI() { super(); }


private static void __sourceConstructorBody_33fa0eb2a16644e0(com.moon.hI receiver) throws Throwable {

long local1_life1 = (com.moon.hI.g ^ 74492091709398L);

    java.lang.String __sourceSpill70_3 = com.moon.hI.b__String();

    com.moon.hI.__sourceConstructorInit_33fa0eb2a16644e0_0(((com.moon.hI)(receiver)));

    ((com.moon.hI)(receiver)).a = ((java.util.List)(new java.util.ArrayList()));

    ((com.moon.hI)(receiver)).b = ((com.moon.hM)(com.moon.hM.a(((java.lang.String)(__sourceIntrinsic_33fa0eb2a16644e0_originalDynamicSite70_6(4033, (3822315197464847210L ^ local1_life1)))), ((java.lang.String)(__sourceIntrinsic_33fa0eb2a16644e0_originalDynamicSite70_7(8981, (4146742066083729335L ^ local1_life1)))))));

    java.lang.String local3_life10 = __sourceSpill70_3;

    ((com.moon.hI)(receiver)).c = ((com.moon.hM)(com.moon.hM.a(((java.lang.String)(__sourceIntrinsic_33fa0eb2a16644e0_originalDynamicSite70_11(12657, (1467945614862949842L ^ local1_life1)))), ((java.lang.String)(__sourceIntrinsic_33fa0eb2a16644e0_originalDynamicSite70_12(17937, (5696229235997764277L ^ local1_life1)))))));

    ((com.moon.hI)(receiver)).d = ((com.moon.hM)(com.moon.hM.a(((java.lang.String)(__sourceIntrinsic_33fa0eb2a16644e0_originalDynamicSite70_15(17824, (1392691117095184649L ^ local1_life1)))), ((java.lang.String)(__sourceIntrinsic_33fa0eb2a16644e0_originalDynamicSite70_16(22223, (5627107111950514806L ^ local1_life1)))))));

    ((com.moon.hI)(receiver)).e = ((com.moon.hJ)(com.moon.hJ.a(((java.lang.String)(__sourceIntrinsic_33fa0eb2a16644e0_originalDynamicSite70_19(11744, (1399603797713518917L ^ local1_life1)))), ((java.lang.String)(__sourceIntrinsic_33fa0eb2a16644e0_originalDynamicSite70_20(16883, (1294818946017553740L ^ local1_life1)))))));

    if ((net.minecraft.entity.Entity.b__ArrayString() != null)) {

        com.moon.hI.b(((java.lang.String)("LeMUE")));

    }

    return;

}



static {
g = ((long)(((moom._a)(moom._c.a(((long)(5027513604889932897L)), ((long)(1057417958525568725L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(116249726754026L)))));

    java.lang.Object __sourceSpill192_6 = null;

    j = ((java.util.Map)(new java.util.HashMap(13)));

    long local0_life8 = (com.moon.hI.g ^ 138833147819701L);

    com.moon.hI.b(((java.lang.String)(__sourceSpill192_6)));

    javax.crypto.Cipher local2_life11;

    javax.crypto.Cipher __sourceSpill192_13 = (local2_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));

    int __sourceSpill192_14 = 2;

    javax.crypto.SecretKeyFactory __sourceSpill192_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));

    byte[] __sourceSpill192_16 = new byte[8];

    (__sourceSpill192_16)[0] = ((byte) ((int) (local0_life8 >>> 56)));

    int local3_life17 = 1;

    while ((local3_life17 < 8)) {

        (__sourceSpill192_16)[local3_life17] = ((byte) ((int) ((local0_life8 << (local3_life17 * 8)) >>> 56)));

        local3_life17 += 1;

    }

    byte[] __sourcePreallocation192_18 = __sourceSpill192_16;

    ((javax.crypto.Cipher)(__sourceSpill192_13)).init(((int)(__sourceSpill192_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill192_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation192_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));

    java.lang.String[] local9_life21 = new java.lang.String[28];

    int local7_life22 = 0;

    java.lang.String local6_life23;

    int local8_life25 = ((java.lang.String)((local6_life23 = "1ØÕ#Dl­uV±Óþr¼\020Ò×ó¼(fFmÌ\003í\022h²²\030Ä$È\"wØúùX\035~Ým*0#\032¿4y \021wæ\017\026àÄ\baeÚ¯\033è>s ½É÷h½\016õ¢¨.\020z\r zûÈ=3\023ûDKz±õ\030sÀ\021n+Ü¿ì\031?\025²\016\003%´ÜãK\017 B'p XÈ»áçÜzµê^?\0177êX\027ÒÒ\003´_tü$\004\030Ïú²JuWvX^_\035WÃ§V\002ñ¾g\000 1\177?í ±\nJUË©t{2ÊjÅnñ­&ÃN<;Í|à\020+°Äüïäb¼âÍVRy$\tË\020Rÿ¤\000ðý<lä{5CTsí\030¦\røF!`=Óª\007EØ°\032ÕZt½\027\fê æ P´ï?\177U[\022¡U\\\023i`\fG<Ø¹æ\016²Ï^èGÆ,\020\td¡\001Õß?\003Jdæ>o8p» çAÓ\037ÛºZµã\033óÀdµÜ²B\b\021«Ì¾nr`Õ×\005\177 ­\\¢Y\034ë¼sjãÊÖ6)µMÈu\017 Òø½ÇUÜï$0;\036\020`²Æ÷Cz}F\0033\035 üÿ{ \fÙ\\S\013_z\002ª ÌòI~/*T¦¹âü®H¢÷âWPÝ\003 ]\027íÞÈ ã\013ñÊ\007\0249Å\003Û¨ák\tV«ì·&9 n0G5\020K|Æs(âÖNÊæâ\024dLr8¹b/!\025\025i\030AÝ_á\177CVEÁÕÌün,ÒO´ìh aZï ÇÃS«¸U¼\rZ.âT¦$Î¾Þ\"*Üµ\030\023\033¬JÃ±Å\030\034\177|±w\\¢K\001ÎÃeé¥äôpÚmeè$2\020dã\032Ôè°\nan'u½Ê÷\036\020Ä\r\002>,(\035°ÛâÑh­©\020\baimÊ8J ºeî_îb\007X\020zeä:\034\nOx@\031ÑÑ\036G?K"))).length();

    int local5_life26 = 32;

    int local4_life27 = -1;

    while (true) {

        local4_life27 += 1;

        byte[] __sourceSpill192_30 = ((java.lang.String)(((java.lang.String)(local6_life23)).substring(((int)(local4_life27)), ((int)((local4_life27 + local5_life26)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill192_31 = local2_life11;

        byte[] local10_life33 = ((javax.crypto.Cipher)(__sourceSpill192_31)).doFinal(((byte[])(__sourceSpill192_30)));

        java.lang.String __sourceSpill192_36 = ((java.lang.String)(com.moon.hI.a(((byte[])(local10_life33))))).intern();

        java.lang.String[] __sourceSpill192_37 = local9_life21;

        int __sourceSpill192_38 = local7_life22;

        local7_life22 += 1;

        (__sourceSpill192_37)[__sourceSpill192_38] = __sourceSpill192_36;

        if (!(((local4_life27 = (local4_life27 + local5_life26)) < local8_life25))) { break; }

        local5_life26 = ((java.lang.String)(local6_life23)).charAt(((int)(local4_life27)));

    }

    local8_life25 = ((java.lang.String)((local6_life23 = "è!JW³NµÓ³áÐî\020Ì\023Ãsº\006ÜVFo¸£¡b Îi\024¾Ä\037lLuµ\\=\017µN´ªcAö®\004¥r5÷g\r"))).length();

    local5_life26 = 32;

    local4_life27 = -1;

    while (true) {

        local4_life27 += 1;

        byte[] __sourceSpill192_44 = ((java.lang.String)(((java.lang.String)(local6_life23)).substring(((int)(local4_life27)), ((int)((local4_life27 + local5_life26)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill192_45 = local2_life11;

        byte[] local10_life47 = ((javax.crypto.Cipher)(__sourceSpill192_45)).doFinal(((byte[])(__sourceSpill192_44)));

        java.lang.String __sourceSpill192_50 = ((java.lang.String)(com.moon.hI.a(((byte[])(local10_life47))))).intern();

        java.lang.String[] __sourceSpill192_51 = local9_life21;

        int __sourceSpill192_52 = local7_life22;

        local7_life22 += 1;

        (__sourceSpill192_51)[__sourceSpill192_52] = __sourceSpill192_50;

        if (!(((local4_life27 = (local4_life27 + local5_life26)) < local8_life25))) { break; }

        local5_life26 = ((java.lang.String)(local6_life23)).charAt(((int)(local4_life27)));

    }

    h = ((java.lang.String[])(local9_life21));

    i = ((java.lang.String[])(new java.lang.String[28]));
}

private static native <E extends Throwable> void __sourceConstructorInit_33fa0eb2a16644e0_0(com.moon.hI a0) throws E;

public static void b(java.lang.String p0) {
f = ((java.lang.String)(p0));
    return;
}


public com.moon.hM b() {
return this.c;
}


public static java.lang.String b__String() {
return com.moon.hI.f;
}


public void b__Void() {
java.lang.String spill62_0;
    long life1_3;
    java.util.Iterator life4_8;
    java.lang.String life3_9;
    com.moon.hM life5_16;
    lexical_join_26: {
    lexical_join_23: {
    life1_3 = (com.moon.hI.g ^ 137553410548399L);
    spill62_0 = com.moon.hI.b__String();
    life4_8 = ((java.util.List)(this.a)).iterator();
    life3_9 = spill62_0;
    lexical_cycle_10: while (true) {
    if (!(((java.util.Iterator)(life4_8)).hasNext())) {
        break lexical_join_23;
    }
    life5_16 = ((com.moon.hM)(((java.util.Iterator)(life4_8)).next()));
    ((com.moon.hM)(life5_16)).a__Void();
    if (!((life3_9 == null))) {
        break lexical_join_26;
    }
    if (!((life3_9 != null))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    ((com.moon.hJ)(this.e)).a__Void();
    }
    return;
}


public com.moon.hM c() {
return this.d;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
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
        byte[] spill472_0 = p0;
        life4_9 += 1;
        life5_44 = (spill472_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill472_1 = p0;
        life4_9 += 1;
        life5_76 = (spill472_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill472_2 = p0;
        life4_9 += 1;
        life5_91 = (spill472_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static java.lang.String a(int p0, long p1) {
int life5_8;
    java.lang.Long life3_16;
    java.lang.Object[] life4_21;
    byte[] life6_60;
    int life7_70;
    javax.crypto.spec.DESKeySpec life7_92;
    javax.crypto.SecretKey life8_99;
    byte[] life9_116;
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 13874);
    if (((com.moon.hI.i)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.hI.j)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.hI.j)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/hI", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.hI.h)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.hI.i)[life5_8] = com.moon.hI.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.hI.i)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.hI.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral1377_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/hI"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public com.moon.hM a__hM() {
return this.b;
}


public com.moon.hJ a() {
return this.e;
}


public java.util.List<com.moon.hM> a__List() {
return this.a;
}


public void a__Void() {
long local1 = (com.moon.hI.g ^ 114251033313900L);
    java.lang.String spill1205_0 = com.moon.hI.b__String();
    ((com.moon.hM)(this.b)).a(((com.moon.hK)(com.moon.hK.a(((java.lang.String)(__sourceIntrinsic_b82a5b29b709_invokedynamic1205_3(26969, (1959736853117333570L ^ local1)))), ((java.lang.String)(__sourceIntrinsic_b82a5b29b709_invokedynamic1205_4(993, (8230385487690472165L ^ local1))))))));
    java.lang.String local3 = spill1205_0;
    ((com.moon.hM)(this.b)).a(((com.moon.hK)(com.moon.hK.a(((java.lang.String)(__sourceIntrinsic_b82a5b29b709_invokedynamic1205_8(9366, (7480333825066941853L ^ local1)))), ((java.lang.String)(__sourceIntrinsic_b82a5b29b709_invokedynamic1205_9(4556, (6326368003466823883L ^ local1))))))));
    ((com.moon.hM)(this.b)).a(((com.moon.hK)(com.moon.hK.a(((java.lang.String)(__sourceIntrinsic_b82a5b29b709_invokedynamic1205_13(9366, (484565663727533440L ^ local1)))), ((java.lang.String)(__sourceIntrinsic_b82a5b29b709_invokedynamic1205_14(32456, (1657980902841182175L ^ local1))))))));
    ((com.moon.hM)(this.b)).a(((com.moon.hK)(com.moon.hK.a(((java.lang.String)(__sourceIntrinsic_b82a5b29b709_invokedynamic1205_18(10790, (4435258495068877606L ^ local1)))), ((java.lang.String)(__sourceIntrinsic_b82a5b29b709_invokedynamic1205_19(210, (7357621130753645006L ^ local1))))))));
    ((com.moon.hM)(this.b)).a(((com.moon.hK)(com.moon.hK.a(((java.lang.String)(__sourceIntrinsic_b82a5b29b709_invokedynamic1205_23(1819, (1625660145906097682L ^ local1)))), ((java.lang.String)(__sourceIntrinsic_b82a5b29b709_invokedynamic1205_24(19953, (5776074141127660773L ^ local1))))))));
    ((com.moon.hM)(this.b)).a(((com.moon.hK)(com.moon.hK.a(((java.lang.String)(__sourceIntrinsic_b82a5b29b709_invokedynamic1205_28(27765, (2669076641691530615L ^ local1)))), ((java.lang.String)(__sourceIntrinsic_b82a5b29b709_invokedynamic1205_29(5706, (1760162999610281815L ^ local1))))))));
    ((java.util.List)(this.a)).add(((java.lang.Object)(this.b)));
    ((com.moon.hM)(this.c)).a(((com.moon.hK)(com.moon.hK.a(((java.lang.String)(__sourceIntrinsic_b82a5b29b709_invokedynamic1205_36(12669, (1228638145715775592L ^ local1)))), ((java.lang.String)(__sourceIntrinsic_b82a5b29b709_invokedynamic1205_37(21529, (3103659565617597713L ^ local1))))))));
    ((com.moon.hM)(this.c)).a(((com.moon.hK)(com.moon.hK.a(((java.lang.String)(__sourceIntrinsic_b82a5b29b709_invokedynamic1205_41(14824, (8545237546407502057L ^ local1)))), ((java.lang.String)(__sourceIntrinsic_b82a5b29b709_invokedynamic1205_42(19196, (536429334224458746L ^ local1))))))));
    ((java.util.List)(this.a)).add(((java.lang.Object)(this.c)));
    ((com.moon.hM)(this.d)).a(((com.moon.hK)(com.moon.hK.a(((java.lang.String)(__sourceIntrinsic_b82a5b29b709_invokedynamic1205_49(6197, (3381442429481156911L ^ local1)))), ((java.lang.String)(__sourceIntrinsic_b82a5b29b709_invokedynamic1205_50(7987, (9089684107049960995L ^ local1))))))));
    ((com.moon.hM)(this.d)).a(((com.moon.hK)(com.moon.hK.a(((java.lang.String)(__sourceIntrinsic_b82a5b29b709_invokedynamic1205_54(24057, (8735393197881246963L ^ local1)))), ((java.lang.String)(__sourceIntrinsic_b82a5b29b709_invokedynamic1205_55(8127, (5982256645174494893L ^ local1))))))));
    ((java.util.List)(this.a)).add(((java.lang.Object)(this.d)));
    if ((local3 != null)) {
        net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[2])));
    }
    return;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_33fa0eb2a16644e0_originalDynamicSite70_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_33fa0eb2a16644e0_originalDynamicSite70_7(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_33fa0eb2a16644e0_originalDynamicSite70_11(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_33fa0eb2a16644e0_originalDynamicSite70_12(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_33fa0eb2a16644e0_originalDynamicSite70_15(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_33fa0eb2a16644e0_originalDynamicSite70_16(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_33fa0eb2a16644e0_originalDynamicSite70_19(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_33fa0eb2a16644e0_originalDynamicSite70_20(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral1377_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b82a5b29b709_invokedynamic1205_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b82a5b29b709_invokedynamic1205_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b82a5b29b709_invokedynamic1205_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b82a5b29b709_invokedynamic1205_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b82a5b29b709_invokedynamic1205_13(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b82a5b29b709_invokedynamic1205_14(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b82a5b29b709_invokedynamic1205_18(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b82a5b29b709_invokedynamic1205_19(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b82a5b29b709_invokedynamic1205_23(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b82a5b29b709_invokedynamic1205_24(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b82a5b29b709_invokedynamic1205_28(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b82a5b29b709_invokedynamic1205_29(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b82a5b29b709_invokedynamic1205_36(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b82a5b29b709_invokedynamic1205_37(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b82a5b29b709_invokedynamic1205_41(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b82a5b29b709_invokedynamic1205_42(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b82a5b29b709_invokedynamic1205_49(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b82a5b29b709_invokedynamic1205_50(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b82a5b29b709_invokedynamic1205_54(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b82a5b29b709_invokedynamic1205_55(int a0, long a1) throws E;
}
