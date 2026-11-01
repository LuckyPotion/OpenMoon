package com.moon;


class rm extends org.luaj.vm2.lib.VarArgFunction {

com.moon.jU a;

private static long b;

private static java.lang.String[] c;

private static java.lang.String[] d;

private static java.util.Map e;

public org.luaj.vm2.Varargs invoke(org.luaj.vm2.Varargs p0) {
org.luaj.vm2.LuaValue forestValue100067_42_0;
    int forestValue100067_47_0;
    org.luaj.vm2.LuaValue forestValue100067_64_0;
    int forestValue100067_69_0;
    org.luaj.vm2.LuaValue forestValue100067_86_0;
    int forestValue100067_91_0;
    org.luaj.vm2.LuaValue forestValue100067_108_0;
    int forestValue100067_127_0;
    int spill100067_0;
    org.luaj.vm2.LuaValue spill100067_1;
    boolean spill100067_2;
    org.luaj.vm2.LuaValue spill100067_3;
    boolean spill100067_4;
    org.luaj.vm2.LuaValue spill100067_5;
    boolean spill100067_6;
    org.luaj.vm2.LuaValue spill100067_7;
    boolean spill100067_8;
    long life2_3;
    org.luaj.vm2.LuaValue life5_8;
    org.luaj.vm2.LuaValue life6_12;
    int life4_13;
    org.luaj.vm2.LuaValue life7_17;
    org.luaj.vm2.LuaValue life8_21;
    forest_join_127: {
    forest_join_109: {
    forest_join_108: {
    forest_join_98: {
    forest_join_91: {
    forest_join_87: {
    forest_join_86: {
    forest_join_76: {
    forest_join_69: {
    forest_join_65: {
    forest_join_64: {
    forest_join_54: {
    forest_join_47: {
    forest_join_43: {
    forest_join_42: {
    forest_join_32: {
    life2_3 = (com.moon.rm.b ^ 34435288969904L);
    spill100067_0 = com.moon.jN.c();
    life5_8 = ((org.luaj.vm2.Varargs)(p0)).arg(((int)(1)));
    life6_12 = ((org.luaj.vm2.Varargs)(p0)).arg(((int)(2)));
    life4_13 = spill100067_0;
    life7_17 = ((org.luaj.vm2.Varargs)(p0)).arg(((int)(3)));
    life8_21 = ((org.luaj.vm2.Varargs)(p0)).arg(((int)(4)));
    spill100067_1 = life5_8;
    if (!((life4_13 == 0))) {
        forestValue100067_42_0 = spill100067_1;
        break forest_join_42;
    }
    if (!((!((org.luaj.vm2.LuaValue)(spill100067_1)).isnil()))) {
        break forest_join_32;
    }
    spill100067_2 = ((org.luaj.vm2.LuaValue)(life5_8)).isnumber();
    if (!((life4_13 == 0))) {
        forestValue100067_47_0 = ((spill100067_2) ? 1 : 0);
        break forest_join_47;
    }
    if (!((!spill100067_2))) {
        break forest_join_43;
    }
    }
    java.lang.String __stackOp100067_11_0 = ((org.luaj.vm2.LuaValue)(life5_8)).typename();
    java.lang.String __stackOp100067_11_1 = __sourceIntrinsic_c0e7e14c9556_invokedynamic100067_10(15287, (3260202130370504922L ^ life2_3));
    forestValue100067_42_0 = org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_c0e7e14c9556_invokedynamic100067_12(__stackOp100067_11_1, __stackOp100067_11_0))));
    }
    return forestValue100067_42_0;
    }
    spill100067_3 = life6_12;
    if (!((life4_13 == 0))) {
        forestValue100067_64_0 = spill100067_3;
        break forest_join_64;
    }
    forestValue100067_47_0 = ((((org.luaj.vm2.LuaValue)(spill100067_3)).isnil()) ? 1 : 0);
    }
    if (!((forestValue100067_47_0 == 0))) {
        break forest_join_54;
    }
    spill100067_4 = ((org.luaj.vm2.LuaValue)(life6_12)).isuserdata(((java.lang.Class)(com.moon.scripting.api.types.Vec3i.class)));
    if (!((life4_13 == 0))) {
        forestValue100067_69_0 = ((spill100067_4) ? 1 : 0);
        break forest_join_69;
    }
    if (!((!spill100067_4))) {
        break forest_join_65;
    }
    }
    java.lang.String __stackOp100067_21_0 = ((org.luaj.vm2.LuaValue)(life6_12)).typename();
    java.lang.String __stackOp100067_21_1 = __sourceIntrinsic_c0e7e14c9556_invokedynamic100067_20(22730, (811774050383776677L ^ life2_3));
    forestValue100067_64_0 = org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_c0e7e14c9556_invokedynamic100067_22(__stackOp100067_21_1, __stackOp100067_21_0))));
    }
    return forestValue100067_64_0;
    }
    spill100067_5 = life7_17;
    if (!((life4_13 == 0))) {
        forestValue100067_86_0 = spill100067_5;
        break forest_join_86;
    }
    forestValue100067_69_0 = ((((org.luaj.vm2.LuaValue)(spill100067_5)).isnil()) ? 1 : 0);
    }
    if (!((forestValue100067_69_0 == 0))) {
        break forest_join_76;
    }
    spill100067_6 = ((org.luaj.vm2.LuaValue)(life7_17)).isuserdata(((java.lang.Class)(com.moon.scripting.api.types.Vec3d.class)));
    if (!((life4_13 == 0))) {
        forestValue100067_91_0 = ((spill100067_6) ? 1 : 0);
        break forest_join_91;
    }
    if (!((!spill100067_6))) {
        break forest_join_87;
    }
    }
    java.lang.String __stackOp100067_31_0 = ((org.luaj.vm2.LuaValue)(life7_17)).typename();
    java.lang.String __stackOp100067_31_1 = __sourceIntrinsic_c0e7e14c9556_invokedynamic100067_30(22555, (143628257667042165L ^ life2_3));
    forestValue100067_86_0 = org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_c0e7e14c9556_invokedynamic100067_32(__stackOp100067_31_1, __stackOp100067_31_0))));
    }
    return forestValue100067_86_0;
    }
    spill100067_7 = life8_21;
    if (!((life4_13 == 0))) {
        forestValue100067_108_0 = spill100067_7;
        break forest_join_108;
    }
    forestValue100067_91_0 = ((((org.luaj.vm2.LuaValue)(spill100067_7)).isnil()) ? 1 : 0);
    }
    if (!((forestValue100067_91_0 == 0))) {
        break forest_join_98;
    }
    spill100067_8 = ((org.luaj.vm2.LuaValue)(life8_21)).isuserdata(((java.lang.Class)(com.moon.scripting.api.enums.Facing.class)));
    if (!((life4_13 == 0))) {
        forestValue100067_127_0 = ((spill100067_8) ? 1 : 0);
        break forest_join_127;
    }
    if (!((!spill100067_8))) {
        break forest_join_109;
    }
    }
    java.lang.String __stackOp100067_41_0 = ((org.luaj.vm2.LuaValue)(life8_21)).typename();
    java.lang.String __stackOp100067_41_1 = __sourceIntrinsic_c0e7e14c9556_invokedynamic100067_40(24494, (5749931530397830338L ^ life2_3));
    forestValue100067_108_0 = org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_c0e7e14c9556_invokedynamic100067_42(__stackOp100067_41_1, __stackOp100067_41_0))));
    }
    return forestValue100067_108_0;
    }
    forestValue100067_127_0 = ((((com.moon.j3)(((com.moon.jU)(this.a)).c)).place_block(((int)(((org.luaj.vm2.LuaValue)(life5_8)).toint())), ((com.moon.scripting.api.types.Vec3i)(((com.moon.scripting.api.types.Vec3i)(((org.luaj.vm2.LuaValue)(life6_12)).touserdata(((java.lang.Class)(com.moon.scripting.api.types.Vec3i.class))))))), ((com.moon.scripting.api.types.Vec3d)(((com.moon.scripting.api.types.Vec3d)(((org.luaj.vm2.LuaValue)(life7_17)).touserdata(((java.lang.Class)(com.moon.scripting.api.types.Vec3d.class))))))), ((com.moon.scripting.api.enums.Facing)(((com.moon.scripting.api.enums.Facing)(((org.luaj.vm2.LuaValue)(life8_21)).touserdata(((java.lang.Class)(com.moon.scripting.api.enums.Facing.class))))))))) ? 1 : 0);
    }
    return org.luaj.vm2.LuaValue.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forestValue100067_127_0))));
}


rm(com.moon.jU p0) { super(); }

private static void __sourceConstructorBody_b4b55eea35fbc1e8(com.moon.rm receiver, com.moon.jU p0) throws Throwable {
((com.moon.rm)(receiver)).a = ((com.moon.jU)(p0));
    com.moon.rm.__sourceConstructorInit_b4b55eea35fbc1e8_0(((com.moon.rm)(receiver)));
    return;
}


static {
javax.crypto.Cipher forestValue315_36_0;
    int forestValue315_36_1;
    javax.crypto.SecretKeyFactory forestValue315_36_2;
    byte[] forestValue315_36_3;
    javax.crypto.Cipher forestValue315_53_0;
    int forestValue315_53_1;
    javax.crypto.SecretKeyFactory forestValue315_53_2;
    byte[] forestValue315_53_3;
    java.lang.String forestValue315_86_0;
    int forestValue315_86_1;
    java.lang.String forestValue315_98_0;
    java.lang.String forestValue315_122_0;
    javax.crypto.Cipher spill315_0;
    int spill315_1;
    javax.crypto.SecretKeyFactory spill315_2;
    byte[] spill315_3;
    byte[] spill315_4;
    java.lang.String spill315_5;
    int spill315_6;
    java.lang.String spill315_7;
    java.lang.String[] spill315_8;
    java.lang.String[] spill315_9;
    java.lang.String spill315_10;
    java.lang.String spill315_11;
    int spill315_12;
    long life0_16;
    javax.crypto.Cipher life2_20;
    int life3_35;
    java.lang.String[] life9_66;
    int life7_68;
    java.lang.String life6_71;
    int life8_73;
    int life5_75;
    int life4_77;
    byte[] life10_93;
    forest_join_153: {
    forest_join_53: {
    b = ((long)(((moom._a)(moom._c.a(((long)(-2612624552616723134L)), ((long)(-3860565075214362307L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(260613132918455L)))));
    e = ((java.util.Map)(new java.util.HashMap(13)));
    life0_16 = (com.moon.rm.b ^ 84153481551655L);
    spill315_0 = (life2_20 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    spill315_1 = 2;
    spill315_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp315_9_0 = new byte[8];
    spill315_3 = __stackOp315_9_0;
    (__stackOp315_9_0)[0] = ((byte) ((int) (life0_16 >>> 56)));
    life3_35 = 1;
    forestValue315_36_0 = spill315_0;
    forestValue315_36_1 = spill315_1;
    forestValue315_36_2 = spill315_2;
    forestValue315_36_3 = spill315_3;
    forest_cycle_36: while (true) {
    if (!((life3_35 < 8))) {
        forestValue315_53_0 = forestValue315_36_0;
        forestValue315_53_1 = forestValue315_36_1;
        forestValue315_53_2 = forestValue315_36_2;
        forestValue315_53_3 = forestValue315_36_3;
        break forest_join_53;
    }
    byte[] __stackOp315_10_0 = forestValue315_36_3;
    spill315_4 = __stackOp315_10_0;
    (__stackOp315_10_0)[life3_35] = ((byte) ((int) ((life0_16 << (life3_35 * 8)) >>> 56)));
    life3_35 += 1;
    forestValue315_36_3 = spill315_4;
    continue forest_cycle_36;
    }
    }
    ((javax.crypto.Cipher)(forestValue315_53_0)).init(((int)(forestValue315_53_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue315_53_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue315_53_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    life9_66 = new java.lang.String[4];
    life7_68 = 0;
    life8_73 = ((java.lang.String)((life6_71 = "+dÊ®ÕÃ4`ü.é`ØXIý¡\ný²ÀÇ+¯²\001o»ªÃ6`&]¦\nlHÙ\024¢²/0\021 Î*_¥#(±öRéºÀ.|*Ò¯\030¬RÚþúËQ®µ%±Êêv±\037!\023Õo:¦×á"))).length();
    life5_75 = 48;
    life4_77 = -1;
    forest_cycle_78: while (true) {
    forest_join_148: {
    life4_77 += 1;
    spill315_5 = life6_71;
    int __stackOp315_14_0 = life4_77;
    forestValue315_86_0 = ((java.lang.String)(spill315_5)).substring(((int)(__stackOp315_14_0)), ((int)((__stackOp315_14_0 + life5_75))));
    forestValue315_86_1 = -1;
    forest_cycle_86: while (true) {
    forest_join_139: {
    forest_join_122: {
    forest_join_112: {
    forest_join_98: {
    java.lang.String __stackOp315_16_0 = forestValue315_86_0;
    int __stackOp315_16_1 = forestValue315_86_1;
    spill315_6 = __stackOp315_16_1;
    byte[] __stackOp315_18_0 = ((java.lang.String)(__stackOp315_16_0)).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __stackOp315_18_1 = life2_20;
    life10_93 = ((javax.crypto.Cipher)(__stackOp315_18_1)).doFinal(((byte[])(__stackOp315_18_0)));
    int __stackOp315_22_0 = spill315_6;
    java.lang.String __stackOp315_22_1 = ((java.lang.String)(com.moon.rm.a(((byte[])(life10_93))))).intern();
    spill315_7 = __stackOp315_22_1;
    switch (__stackOp315_22_0) {
default:
{
        forestValue315_98_0 = spill315_7;
        break forest_join_98;
    }
case 0:
{
        forestValue315_122_0 = spill315_7;
        break forest_join_122;
    }
}
    }
    java.lang.String __stackOp315_23_0 = forestValue315_98_0;
    java.lang.String[] __stackOp315_23_1 = life9_66;
    spill315_8 = __stackOp315_23_1;
    java.lang.String __stackOp315_24_0 = __stackOp315_23_0;
    int __stackOp315_24_1 = (life7_68++);
    (spill315_8)[__stackOp315_24_1] = __stackOp315_24_0;
    if (!(((life4_77 = (life4_77 + life5_75)) < life8_73))) {
        break forest_join_112;
    }
    break forest_join_148;
    }
    life8_73 = ((java.lang.String)((life6_71 = "ÝÌy\006éMÏäíÜó@5ÆwºÞå\\Qþèc4È\fN¬P'Ì\026-$¹wÉ¾0\r¤\0270Ç×íb 6'\001Ò¹Ó&ùF\026\013R\027\007è\027\r¾\007\0162)<.V²8,!_:2cEÓ·c"))).length();
    life5_75 = 48;
    life4_77 = -1;
    break forest_join_139;
    }
    java.lang.String __stackOp315_26_0 = forestValue315_122_0;
    java.lang.String[] __stackOp315_26_1 = life9_66;
    spill315_9 = __stackOp315_26_1;
    java.lang.String __stackOp315_27_0 = __stackOp315_26_0;
    int __stackOp315_27_1 = (life7_68++);
    (spill315_9)[__stackOp315_27_1] = __stackOp315_27_0;
    if (!(((life4_77 = (life4_77 + life5_75)) < life8_73))) {
        break forest_join_153;
    }
    life5_75 = ((int)(((java.lang.String)(life6_71)).charAt(((int)(life4_77)))));
    }
    life4_77 += 1;
    spill315_10 = life6_71;
    int __stackOp315_30_0 = life4_77;
    spill315_11 = ((java.lang.String)(spill315_10)).substring(((int)(__stackOp315_30_0)), ((int)((__stackOp315_30_0 + life5_75))));
    spill315_12 = 0;
    forestValue315_86_0 = spill315_11;
    forestValue315_86_1 = spill315_12;
    continue forest_cycle_86;
    }
    }
    life5_75 = ((int)(((java.lang.String)(life6_71)).charAt(((int)(life4_77)))));
    continue forest_cycle_78;
    }
    }
    c = ((java.lang.String[])(life9_66));
    d = ((java.lang.String[])(new java.lang.String[4]));
}

private static native <E extends Throwable> void __sourceConstructorInit_b4b55eea35fbc1e8_0(com.moon.rm a0) throws E;
private static native <E extends Throwable> java.lang.String __sourceHandlerCall_4452d3abd36ca85301aa(int a0, long a1) throws E;
private static final class __SourceHandler_4452d3abd36ca85301aa {

public static java.lang.String f207(int p0, long p1) throws Throwable {
    int life5_8;
    java.lang.Long life3_16;
    java.lang.Object[] life4_21;
    byte[] life6_60;
    int life7_70;
    javax.crypto.spec.DESKeySpec life7_92;
    javax.crypto.SecretKey life8_99;
    byte[] life9_116;
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 1499);
    if (((__fieldRead207_0())[life5_8] == null)) {
        life3_16 = __call207_3(__call207_2(__call207_1()));
        life4_21 = __cast207_6(__call207_5(__fieldRead207_4(), life3_16));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = __call207_7("DES/CBC/PKCS5Padding");
        (life4_21)[1] = __call207_8("DES");
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        __call207_10(__fieldRead207_9(), life3_16, life4_21);
    }
        life6_60 = new byte[8];
        (life6_60)[0] = ((byte) ((int) (p1 >>> 56)));
        life7_70 = 1;
        loop_region_63: while ((life7_70 < 8)) {
        (life6_60)[life7_70] = ((byte) ((int) ((p1 << (life7_70 * 8)) >>> 56)));
        life7_70 += 1;
    }
        life7_92 = new javax.crypto.spec.DESKeySpec(life6_60);
        life8_99 = __call207_12(__cast207_11((life4_21)[1]), life7_92);
        __call207_15(__cast207_13((life4_21)[0]), 2, life8_99, __cast207_14((life4_21)[2]));
        life9_116 = __call207_17((__fieldRead207_16())[life5_8], "ISO-8859-1");
        (__fieldRead207_18())[life5_8] = __call207_21(__call207_20(__cast207_19((life4_21)[0]), life9_116));
    }
    return (__fieldRead207_22())[life5_8];
}
public static java.lang.String h207_0(java.lang.Exception p0) throws Throwable {
    java.lang.Exception local1 = p0;
    throw new java.lang.RuntimeException("com/moon/rm", local1);
}
private static native java.lang.String[] __fieldRead207_0() throws Throwable;
private static native java.lang.Thread __call207_1() throws Throwable;
private static native long __call207_2(java.lang.Thread a0) throws Throwable;
private static native java.lang.Long __call207_3(long a0) throws Throwable;
private static native java.util.Map __fieldRead207_4() throws Throwable;
private static native java.lang.Object __call207_5(java.util.Map a0, java.lang.Long a1) throws Throwable;
private static native java.lang.Object[] __cast207_6(java.lang.Object a0) throws Throwable;
private static native javax.crypto.Cipher __call207_7(java.lang.String a0) throws Throwable;
private static native javax.crypto.SecretKeyFactory __call207_8(java.lang.String a0) throws Throwable;
private static native java.util.Map __fieldRead207_9() throws Throwable;
private static native java.lang.Object __call207_10(java.util.Map a0, java.lang.Long a1, java.lang.Object[] a2) throws Throwable;
private static native javax.crypto.SecretKeyFactory __cast207_11(java.lang.Object a0) throws Throwable;
private static native javax.crypto.SecretKey __call207_12(javax.crypto.SecretKeyFactory a0, javax.crypto.spec.DESKeySpec a1) throws Throwable;
private static native javax.crypto.Cipher __cast207_13(java.lang.Object a0) throws Throwable;
private static native javax.crypto.spec.IvParameterSpec __cast207_14(java.lang.Object a0) throws Throwable;
private static native void __call207_15(javax.crypto.Cipher a0, int a1, javax.crypto.SecretKey a2, javax.crypto.spec.IvParameterSpec a3) throws Throwable;
private static native java.lang.String[] __fieldRead207_16() throws Throwable;
private static native byte[] __call207_17(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String[] __fieldRead207_18() throws Throwable;
private static native javax.crypto.Cipher __cast207_19(java.lang.Object a0) throws Throwable;
private static native byte[] __call207_20(javax.crypto.Cipher a0, byte[] a1) throws Throwable;
private static native java.lang.String __call207_21(byte[] a0) throws Throwable;
private static native java.lang.String[] __fieldRead207_22() throws Throwable;

}

private static native <E extends Throwable> java.lang.invoke.CallSite __sourceHandlerCall_cf25b79461654ff5676e(java.lang.invoke.MethodHandles.Lookup a0, java.lang.String a1, java.lang.invoke.MethodType a2) throws E;
private static final class __SourceHandler_cf25b79461654ff5676e {

public static java.lang.invoke.CallSite f208(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) throws Throwable {
    java.lang.invoke.MutableCallSite life3_4;
    life3_4 = new java.lang.invoke.MutableCallSite(p2);
    java.lang.invoke.MutableCallSite spill208_0 = life3_4;
    java.lang.invoke.MethodHandle spill208_1 = __call208_3(__methodHandleLiteral208_0(), __classLiteral208_1(), __call208_2(p2));
    int spill208_2 = 0;
    java.lang.Object[] __stackOp208_4_0 = new java.lang.Object[3];
    java.lang.Object[] spill208_3 = __stackOp208_4_0;
    (__stackOp208_4_0)[0] = p0;
    java.lang.Object[] __stackOp208_5_0 = spill208_3;
    java.lang.Object[] spill208_4 = __stackOp208_5_0;
    (__stackOp208_5_0)[1] = life3_4;
    java.lang.Object[] __stackOp208_6_0 = spill208_4;
    java.lang.Object[] spill208_5 = __stackOp208_6_0;
    (__stackOp208_6_0)[2] = p1;
    __call208_9(spill208_0, __call208_8(__call208_7(spill208_1, spill208_2, spill208_5), p2));
    return life3_4;
}
public static java.lang.invoke.CallSite h208_0(java.lang.Exception p0, java.lang.String p1, java.lang.invoke.MethodType p2) throws Throwable {
    java.lang.Exception local3 = p0;
    throw new java.lang.RuntimeException(__call2020800_6(__call2020800_5(__call2020800_3(__call2020800_2(__call2020800_1(__call2020800_0(new java.lang.StringBuilder(), "com/moon/rm"), " : "), p1), " : "), __call2020800_4(p2))), local3);
}
private static native java.lang.invoke.MethodHandle __methodHandleLiteral208_0() throws Throwable;
private static native java.lang.Object __classLiteral208_1() throws Throwable;
private static native int __call208_2(java.lang.invoke.MethodType a0) throws Throwable;
private static native java.lang.invoke.MethodHandle __call208_3(java.lang.invoke.MethodHandle a0, java.lang.Object a1, int a2) throws Throwable;
private static native java.lang.invoke.MethodHandle __call208_7(java.lang.invoke.MethodHandle a0, int a1, java.lang.Object[] a2) throws Throwable;
private static native java.lang.invoke.MethodHandle __call208_8(java.lang.invoke.MethodHandle a0, java.lang.invoke.MethodType a1) throws Throwable;
private static native void __call208_9(java.lang.invoke.MutableCallSite a0, java.lang.invoke.MethodHandle a1) throws Throwable;
private static native java.lang.StringBuilder __call2020800_0(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2020800_1(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2020800_2(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2020800_3(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call2020800_4(java.lang.invoke.MethodType a0) throws Throwable;
private static native java.lang.StringBuilder __call2020800_5(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call2020800_6(java.lang.StringBuilder a0) throws Throwable;

}


private static java.lang.String a(int p0, long p1) { return __sourceHandlerCall_4452d3abd36ca85301aa(p0, p1); }


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.rm.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) { return __sourceHandlerCall_cf25b79461654ff5676e(p0, p1, p2); }


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
        byte[] spill1380_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1380_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1380_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1380_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1380_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1380_2)[life4_9];
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


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100067_10(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100067_12(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100067_20(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100067_22(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100067_30(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100067_32(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100067_40(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100067_42(java.lang.String a0, java.lang.String a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
