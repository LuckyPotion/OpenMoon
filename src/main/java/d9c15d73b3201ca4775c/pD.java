package com.moon;


public class pD extends java.util.logging.Logger {

private org.apache.logging.log4j.Logger a;

private static boolean b;

private static long c;

private static java.lang.String d;

public pD(org.apache.logging.log4j.Logger p0) { super((java.lang.String)null, (java.lang.String)null); }


private static void __sourceConstructorBody_6cb525419e2971fb(com.moon.pD receiver, org.apache.logging.log4j.Logger p0) throws Throwable {

long local2 = (com.moon.pD.c ^ 34704410483204L);

    com.moon.pD.__sourceConstructorInit_6cb525419e2971fb_0(((com.moon.pD)(receiver)), ((java.lang.String)(com.moon.pD.d)), ((java.lang.Object)(null)));

    ((com.moon.pD)(receiver)).a = ((org.apache.logging.log4j.Logger)(p0));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_6cb525419e2971fb_0(com.moon.pD a0, java.lang.String a1, java.lang.Object a2) throws E;

static {
c = ((long)(((moom._a)(moom._c.a(((long)(-3115786331573999548L)), ((long)(-1345236550115159239L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(224197095492345L)))));
    int __sourceSpill348_6 = 1;
    long local0_life7 = (com.moon.pD.c ^ 94562744754547L);
    com.moon.pD.b(((boolean)__sourceIntrinsic_integerToBoolean((__sourceSpill348_6))));
    javax.crypto.Cipher local2_life10;
    javax.crypto.Cipher __sourceSpill348_12 = (local2_life10 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill348_13 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill348_14 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill348_15 = new byte[8];
    (__sourceSpill348_15)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life16 = 1;
    while ((local3_life16 < 8)) {
        (__sourceSpill348_15)[local3_life16] = ((byte) ((int) ((local0_life7 << (local3_life16 * 8)) >>> 56)));
        local3_life16 += 1;
    }
    byte[] __sourcePreallocation348_17 = __sourceSpill348_15;
    ((javax.crypto.Cipher)(__sourceSpill348_12)).init(((int)(__sourceSpill348_13)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill348_14)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation348_17)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    byte[] __sourceSpill348_21 = ((java.lang.String)("ð9ÄKá\036\0226¸\021Á")).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __sourceSpill348_22 = local2_life10;
    byte[] local4_life24 = ((javax.crypto.Cipher)(__sourceSpill348_22)).doFinal(((byte[])(__sourceSpill348_21)));
    d = ((java.lang.String)(((java.lang.String)(com.moon.pD.a(((byte[])(local4_life24))))).intern()));
}


public void log(java.util.logging.Level p0, java.lang.String p1, java.lang.Object[] p2) {
((com.moon.pD)(this)).log(((java.util.logging.Level)(p0)), ((java.lang.String)(java.text.MessageFormat.format(((java.lang.String)(p1)), ((java.lang.Object[])(p2))))));
    return;
}


public void log(java.util.logging.Level p0, java.lang.String p1, java.lang.Throwable p2) {
java.util.logging.Level forwardValue1168_20_0;
    java.util.logging.Level forwardValue1168_20_1;
    java.util.logging.Level forwardValue1168_32_0;
    java.util.logging.Level forwardValue1168_32_1;
    java.util.logging.Level forwardValue1168_44_0;
    java.util.logging.Level forwardValue1168_44_1;
    java.util.logging.Level spill1168_0;
    java.util.logging.Level spill1168_1;
    long life4_3;
    int life6_5;
    forward_join_57: {
    forward_join_52: {
    forward_join_44: {
    forward_join_42: {
    forward_join_32: {
    forward_join_30: {
    forward_join_20: {
    forward_join_18: {
    life4_3 = (com.moon.pD.c ^ 34656615067317L);
    life6_5 = ((com.moon.pD.b()) ? 1 : 0);
    spill1168_0 = p0;
    spill1168_1 = java.util.logging.Level.FINE;
    if (!((life6_5 != 0))) {
        forwardValue1168_20_0 = spill1168_0;
        forwardValue1168_20_1 = spill1168_1;
        break forward_join_20;
    }
    if (!((spill1168_0 == spill1168_1))) {
        break forward_join_18;
    }
    ((org.apache.logging.log4j.Logger)(this.a)).debug(((java.lang.String)(p1)), ((java.lang.Throwable)(p2)));
    if (!((life6_5 == 0))) {
        break forward_join_57;
    }
    }
    forwardValue1168_20_0 = p0;
    forwardValue1168_20_1 = java.util.logging.Level.WARNING;
    }
    if (!((life6_5 != 0))) {
        forwardValue1168_32_0 = forwardValue1168_20_0;
        forwardValue1168_32_1 = forwardValue1168_20_1;
        break forward_join_32;
    }
    if (!((forwardValue1168_20_0 == forwardValue1168_20_1))) {
        break forward_join_30;
    }
    ((org.apache.logging.log4j.Logger)(this.a)).warn(((java.lang.String)(p1)), ((java.lang.Throwable)(p2)));
    if (!((life6_5 == 0))) {
        break forward_join_57;
    }
    }
    forwardValue1168_32_0 = p0;
    forwardValue1168_32_1 = java.util.logging.Level.SEVERE;
    }
    if (!((life6_5 != 0))) {
        forwardValue1168_44_0 = forwardValue1168_32_0;
        forwardValue1168_44_1 = forwardValue1168_32_1;
        break forward_join_44;
    }
    if (!((forwardValue1168_32_0 == forwardValue1168_32_1))) {
        break forward_join_42;
    }
    ((org.apache.logging.log4j.Logger)(this.a)).error(((java.lang.String)(p1)), ((java.lang.Throwable)(p2)));
    if (!((life6_5 == 0))) {
        break forward_join_57;
    }
    }
    forwardValue1168_44_0 = p0;
    forwardValue1168_44_1 = java.util.logging.Level.INFO;
    }
    if (!((forwardValue1168_44_0 == forwardValue1168_44_1))) {
        break forward_join_52;
    }
    ((org.apache.logging.log4j.Logger)(this.a)).info(((java.lang.String)(p1)), ((java.lang.Throwable)(p2)));
    if (!((life6_5 == 0))) {
        break forward_join_57;
    }
    }
    ((org.apache.logging.log4j.Logger)(this.a)).trace(((java.lang.String)(p1)), ((java.lang.Throwable)(p2)));
    }
    return;
}


public void log(java.util.logging.LogRecord p0) {
((com.moon.pD)(this)).log(((java.util.logging.Level)(((java.util.logging.LogRecord)(p0)).getLevel())), ((java.lang.String)(((java.util.logging.LogRecord)(p0)).getMessage())));
    return;
}


public void log(java.util.logging.Level p0, java.lang.String p1) {
java.util.logging.Level forwardValue1166_19_0;
    java.util.logging.Level forwardValue1166_19_1;
    java.util.logging.Level forwardValue1166_30_0;
    java.util.logging.Level forwardValue1166_30_1;
    java.util.logging.Level forwardValue1166_41_0;
    java.util.logging.Level forwardValue1166_41_1;
    java.util.logging.Level spill1166_0;
    java.util.logging.Level spill1166_1;
    long life3_3;
    int life5_5;
    forward_join_52: {
    forward_join_48: {
    forward_join_41: {
    forward_join_39: {
    forward_join_30: {
    forward_join_28: {
    forward_join_19: {
    forward_join_17: {
    life3_3 = (com.moon.pD.c ^ 43622006728559L);
    life5_5 = ((com.moon.pD.b()) ? 1 : 0);
    spill1166_0 = p0;
    spill1166_1 = java.util.logging.Level.FINE;
    if (!((life5_5 != 0))) {
        forwardValue1166_19_0 = spill1166_0;
        forwardValue1166_19_1 = spill1166_1;
        break forward_join_19;
    }
    if (!((spill1166_0 == spill1166_1))) {
        break forward_join_17;
    }
    ((org.apache.logging.log4j.Logger)(this.a)).debug(((java.lang.String)(p1)));
    if (!((life5_5 == 0))) {
        break forward_join_52;
    }
    }
    forwardValue1166_19_0 = p0;
    forwardValue1166_19_1 = java.util.logging.Level.WARNING;
    }
    if (!((life5_5 != 0))) {
        forwardValue1166_30_0 = forwardValue1166_19_0;
        forwardValue1166_30_1 = forwardValue1166_19_1;
        break forward_join_30;
    }
    if (!((forwardValue1166_19_0 == forwardValue1166_19_1))) {
        break forward_join_28;
    }
    ((org.apache.logging.log4j.Logger)(this.a)).warn(((java.lang.String)(p1)));
    if (!((life5_5 == 0))) {
        break forward_join_52;
    }
    }
    forwardValue1166_30_0 = p0;
    forwardValue1166_30_1 = java.util.logging.Level.SEVERE;
    }
    if (!((life5_5 != 0))) {
        forwardValue1166_41_0 = forwardValue1166_30_0;
        forwardValue1166_41_1 = forwardValue1166_30_1;
        break forward_join_41;
    }
    if (!((forwardValue1166_30_0 == forwardValue1166_30_1))) {
        break forward_join_39;
    }
    ((org.apache.logging.log4j.Logger)(this.a)).error(((java.lang.String)(p1)));
    if (!((life5_5 == 0))) {
        break forward_join_52;
    }
    }
    forwardValue1166_41_0 = p0;
    forwardValue1166_41_1 = java.util.logging.Level.INFO;
    }
    if (!((forwardValue1166_41_0 == forwardValue1166_41_1))) {
        break forward_join_48;
    }
    ((org.apache.logging.log4j.Logger)(this.a)).info(((java.lang.String)(p1)));
    if (!((life5_5 == 0))) {
        break forward_join_52;
    }
    }
    ((org.apache.logging.log4j.Logger)(this.a)).trace(((java.lang.String)(p1)));
    }
    return;
}


public void log(java.util.logging.Level p0, java.lang.String p1, java.lang.Object p2) {
java.util.logging.Level forwardValue1167_20_0;
    java.util.logging.Level forwardValue1167_20_1;
    java.util.logging.Level forwardValue1167_32_0;
    java.util.logging.Level forwardValue1167_32_1;
    java.util.logging.Level forwardValue1167_44_0;
    java.util.logging.Level forwardValue1167_44_1;
    java.util.logging.Level spill1167_0;
    java.util.logging.Level spill1167_1;
    long life4_3;
    int life6_5;
    forward_join_57: {
    forward_join_52: {
    forward_join_44: {
    forward_join_42: {
    forward_join_32: {
    forward_join_30: {
    forward_join_20: {
    forward_join_18: {
    life4_3 = (com.moon.pD.c ^ 123583369025532L);
    life6_5 = ((com.moon.pD.b()) ? 1 : 0);
    spill1167_0 = p0;
    spill1167_1 = java.util.logging.Level.FINE;
    if (!((life6_5 != 0))) {
        forwardValue1167_20_0 = spill1167_0;
        forwardValue1167_20_1 = spill1167_1;
        break forward_join_20;
    }
    if (!((spill1167_0 == spill1167_1))) {
        break forward_join_18;
    }
    ((org.apache.logging.log4j.Logger)(this.a)).debug(((java.lang.String)(p1)), ((java.lang.Object)(p2)));
    if (!((life6_5 == 0))) {
        break forward_join_57;
    }
    }
    forwardValue1167_20_0 = p0;
    forwardValue1167_20_1 = java.util.logging.Level.WARNING;
    }
    if (!((life6_5 != 0))) {
        forwardValue1167_32_0 = forwardValue1167_20_0;
        forwardValue1167_32_1 = forwardValue1167_20_1;
        break forward_join_32;
    }
    if (!((forwardValue1167_20_0 == forwardValue1167_20_1))) {
        break forward_join_30;
    }
    ((org.apache.logging.log4j.Logger)(this.a)).warn(((java.lang.String)(p1)), ((java.lang.Object)(p2)));
    if (!((life6_5 == 0))) {
        break forward_join_57;
    }
    }
    forwardValue1167_32_0 = p0;
    forwardValue1167_32_1 = java.util.logging.Level.SEVERE;
    }
    if (!((life6_5 != 0))) {
        forwardValue1167_44_0 = forwardValue1167_32_0;
        forwardValue1167_44_1 = forwardValue1167_32_1;
        break forward_join_44;
    }
    if (!((forwardValue1167_32_0 == forwardValue1167_32_1))) {
        break forward_join_42;
    }
    ((org.apache.logging.log4j.Logger)(this.a)).error(((java.lang.String)(p1)), ((java.lang.Object)(p2)));
    if (!((life6_5 == 0))) {
        break forward_join_57;
    }
    }
    forwardValue1167_44_0 = p0;
    forwardValue1167_44_1 = java.util.logging.Level.INFO;
    }
    if (!((forwardValue1167_44_0 == forwardValue1167_44_1))) {
        break forward_join_52;
    }
    ((org.apache.logging.log4j.Logger)(this.a)).info(((java.lang.String)(p1)), ((java.lang.Object)(p2)));
    if (!((life6_5 == 0))) {
        break forward_join_57;
    }
    }
    ((org.apache.logging.log4j.Logger)(this.a)).trace(((java.lang.String)(p1)), ((java.lang.Object)(p2)));
    }
    return;
}


public static boolean b() {
return ((((com.moon.pD.b) ? 1 : 0)) != 0);
}


public static void b(boolean p0) {
b = ((boolean)(p0));
    return;
}


public static boolean c() {
int local0 = __sourceIntrinsic_booleanToInteger(com.moon.pD.b());
    if ((local0 == 0)) {
        return ((1) != 0);
    }
    return ((0) != 0);
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
        byte[] spill1485_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1485_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1485_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1485_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1485_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1485_2)[life4_9];
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


private static native int __sourceIntrinsic_booleanToInteger(boolean value);
private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
