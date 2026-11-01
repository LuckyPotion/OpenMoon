package com.moon;


public class jJ {

private static java.lang.String[] b;

private static long a;

private static java.lang.String[] c;

private static java.lang.String[] d;

private static java.util.Map e;

private static long f;

public jJ() {
super();
}


static {
a = ((long)(((moom._a)(moom._c.a(((long)(3974111423326379836L)), ((long)(-956641620427208647L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(131972635782910L)))));
    java.lang.String[] __sourceSpill184_6 = new java.lang.String[1];
    e = ((java.util.Map)(new java.util.HashMap(13)));
    long local5_life8 = (com.moon.jJ.a ^ 107713104359485L);
    com.moon.jJ.b(((java.lang.String[])(__sourceSpill184_6)));
    javax.crypto.Cipher local7_life11;
    javax.crypto.Cipher __sourceSpill184_13 = (local7_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill184_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill184_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill184_16 = new byte[8];
    (__sourceSpill184_16)[0] = ((byte) ((int) (local5_life8 >>> 56)));
    int local8_life17 = 1;
    while ((local8_life17 < 8)) {
        (__sourceSpill184_16)[local8_life17] = ((byte) ((int) ((local5_life8 << (local8_life17 * 8)) >>> 56)));
        local8_life17 += 1;
    }
    byte[] __sourcePreallocation184_18 = __sourceSpill184_16;
    ((javax.crypto.Cipher)(__sourceSpill184_13)).init(((int)(__sourceSpill184_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill184_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation184_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local14_life21 = new java.lang.String[43];
    int local12_life22 = 0;
    java.lang.String local11_life23;
    int local13_life25 = ((java.lang.String)((local11_life23 = "d¥o\002Ù\017AÓ\033)Z32(ô\023[\035!\000\002n_Ißzì4ÊÐ2P!#\025Ë¹QdDk\023\026®Hb'\021\020òªc³ðd¯ê7É©aûd\020¤ÿúAY%\"Ë±~\n¶Ôq-\020^5hø\006Ï1 øv´øßo\030N\000»<_i¯+°X¾ÿñ±ÝÄ{\035\016z\016S(­Saae5«4ÄÔé\025Z_Eî\r3)Ê¬u\027y4ªt¤\003¬xãbZ ´øFóôìº\032¤Aìøúç6 «'#ÄÏ£/¶\006¡_0%jäÅ\b)¡×¡GÐm©DÛ­¼¼%zb\021¡®Ëo-Iu\002Tîi%}\\>B@Ýü,ü×\020ÎÅÝÂBSÈ®Ù\\\032Bð4>é\020qT7VëZ6éA\032fá8×\030e\037Q¬Àoe6Ý·\002\bU­v-Äqø6ç\020ÙÚË\177ªAÎþ:UJ%L\020Ïéæò`Rï2Å\016AA\006S\030×;Z\027\022$6q<ÌÉ\003/¨¯À\027åº¢å ¹Üµ3Öí{\r<é§ú|\031×²ø9Ê¹X\002&Ô±òX\020×&\026\021Z$|RàÑ\002t\030ô\020 éÂSlò%'ð,\016èÄ\020»ó*F`09¿_Üv2]\020\027Au>Ê-[PmûÊaÆ\020\\èÆ2\nÜ\017GÔZÆ¨Ê@\030\020\004(Ã¤·fEÒE¿jFM#å\n6T.\037\020`ãð|\005óæUó\030\037Ï\020R\037ý\177|Þ3òa\020\031ô«VöÅ¦[wíó#¬\030\r5÷´w)n,FQFA,ûV\006\022Æ \030=3s|PC\033i' \016-þßsQ\001cPlºÎä\020Òb\bNßrºÌá;ø*V'æ ¨JNv·870q\0016²\016´Xç¢)Îü4Aº,1Ù¯_\020\fóù^\013nÌê¡øl>ô*\0204-\024à¶DÏCè0>ÜÖÈ=\020\031\006yz8[âiðà'ú\032d\020ê\0024¾\006^mú,TW\032\\Êª )Á¹\tÒdû­O¾¿Ç>,hc:!§#ì|ZYlb\031\030à.ó\033z#2è\035\033Î»¡cå1\003Fý»Zw?\020¸\024\027%÷ç\034¿¥ôàp\t\020{«=)TgÇ\000hI\016-¦¨4\020I\034u/C#r}\\ë¥á:\024o\020hóV\002\003©;ÒLÐ\b/e²\020¸¦SûÆ©\006ÐX\013\013V\020\033ïÞ±µÁÏEø\fVmÚ3\037"))).length();
    int local10_life26 = 16;
    int local9_life27 = -1;
    while (true) {
        local9_life27 += 1;
        byte[] __sourceSpill184_30 = ((java.lang.String)(((java.lang.String)(local11_life23)).substring(((int)(local9_life27)), ((int)((local9_life27 + local10_life26)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill184_31 = local7_life11;
        byte[] local15_life33 = ((javax.crypto.Cipher)(__sourceSpill184_31)).doFinal(((byte[])(__sourceSpill184_30)));
        java.lang.String __sourceSpill184_36 = ((java.lang.String)(com.moon.jJ.a(((byte[])(local15_life33))))).intern();
        java.lang.String[] __sourceSpill184_37 = local14_life21;
        int __sourceSpill184_38 = local12_life22;
        local12_life22 += 1;
        (__sourceSpill184_37)[__sourceSpill184_38] = __sourceSpill184_36;
        if (!(((local9_life27 = (local9_life27 + local10_life26)) < local13_life25))) { break; }
        local10_life26 = ((java.lang.String)(local11_life23)).charAt(((int)(local9_life27)));
    }
    local13_life25 = ((java.lang.String)((local11_life23 = "^TÏÜ\t­=\004~±\033Øª{(40Ë\036VºbQ±\016Ø1¡\023Ú)\rr!Ç\030Sæ\026\021Zþayöt*C"))).length();
    local10_life26 = 16;
    local9_life27 = -1;
    while (true) {
        local9_life27 += 1;
        byte[] __sourceSpill184_43 = ((java.lang.String)(((java.lang.String)(local11_life23)).substring(((int)(local9_life27)), ((int)((local9_life27 + local10_life26)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill184_44 = local7_life11;
        byte[] local15_life46 = ((javax.crypto.Cipher)(__sourceSpill184_44)).doFinal(((byte[])(__sourceSpill184_43)));
        java.lang.String __sourceSpill184_49 = ((java.lang.String)(com.moon.jJ.a(((byte[])(local15_life46))))).intern();
        java.lang.String[] __sourceSpill184_50 = local14_life21;
        int __sourceSpill184_51 = local12_life22;
        local12_life22 += 1;
        (__sourceSpill184_50)[__sourceSpill184_51] = __sourceSpill184_49;
        if (!(((local9_life27 = (local9_life27 + local10_life26)) < local13_life25))) { break; }
        local10_life26 = ((java.lang.String)(local11_life23)).charAt(((int)(local9_life27)));
    }
    c = ((java.lang.String[])(local14_life21));
    d = ((java.lang.String[])(new java.lang.String[43]));
    javax.crypto.Cipher local0_life56;
    javax.crypto.Cipher __sourceSpill184_58 = (local0_life56 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill184_59 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill184_60 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill184_61 = new byte[8];
    (__sourceSpill184_61)[0] = ((byte) ((int) (local5_life8 >>> 56)));
    int local1_life62 = 1;
    while ((local1_life62 < 8)) {
        (__sourceSpill184_61)[local1_life62] = ((byte) ((int) ((local5_life8 << (local1_life62 * 8)) >>> 56)));
        local1_life62 += 1;
    }
    byte[] __sourcePreallocation184_63 = __sourceSpill184_61;
    ((javax.crypto.Cipher)(__sourceSpill184_58)).init(((int)(__sourceSpill184_59)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill184_60)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation184_63)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local2_life66 = -4005988218680388492L;
    byte[] __sourceSpill184_67 = new byte[8];
    (__sourceSpill184_67)[0] = ((byte) ((int) (local2_life66 >>> 56)));
    (__sourceSpill184_67)[1] = ((byte) ((int) (local2_life66 >>> 48)));
    (__sourceSpill184_67)[2] = ((byte) ((int) (local2_life66 >>> 40)));
    (__sourceSpill184_67)[3] = ((byte) ((int) (local2_life66 >>> 32)));
    (__sourceSpill184_67)[4] = ((byte) ((int) (local2_life66 >>> 24)));
    (__sourceSpill184_67)[5] = ((byte) ((int) (local2_life66 >>> 16)));
    (__sourceSpill184_67)[6] = ((byte) ((int) (local2_life66 >>> 8)));
    (__sourceSpill184_67)[7] = ((byte) ((int) local2_life66));
    javax.crypto.Cipher __sourceSpill184_68 = local0_life56;
    byte[] local4_life70 = ((javax.crypto.Cipher)(__sourceSpill184_68)).doFinal(((byte[])(__sourceSpill184_67)));
    f = ((long)((((((((((((long) (local4_life70)[0]) & 255L) << 56) | ((((long) (local4_life70)[1]) & 255L) << 48)) | ((((long) (local4_life70)[2]) & 255L) << 40)) | ((((long) (local4_life70)[3]) & 255L) << 32)) | ((((long) (local4_life70)[4]) & 255L) << 24)) | ((((long) (local4_life70)[5]) & 255L) << 16)) | ((((long) (local4_life70)[6]) & 255L) << 8)) | (((long) (local4_life70)[7]) & 255L))));
}

private static native <E extends Throwable> org.luaj.vm2.LuaTable __sourceHandlerCall_408c634077d1d1876c91(com.moon.jJ a0) throws E;
private static final class __SourceHandler_408c634077d1d1876c91 {

public static org.luaj.vm2.LuaTable f85(com.moon.jJ receiver) throws Throwable {
    org.luaj.vm2.LuaTable spill85_0;
    long life1_3;
    org.luaj.vm2.LuaTable life3_7;
    life1_3 = (__fieldRead85_0() ^ 125301238278965L);
    org.luaj.vm2.LuaTable __stackOp85_2_0 = __sourceUninitializedNEW85_1();
    spill85_0 = __stackOp85_2_0;
    __explicitNewInit85_3(__stackOp85_2_0);
    life3_7 = spill85_0;
    __call85_6(life3_7, __invokedynamic85_4(27592, (1726130863198168560L ^ life1_3)), __call85_5(receiver));
    __call85_9(life3_7, __invokedynamic85_7(22038, (5007543438125389871L ^ life1_3)), __call85_8(receiver));
    __call85_12(life3_7, __invokedynamic85_10(3976, (4355645063890534823L ^ life1_3)), __call85_11(receiver));
    __call85_15(life3_7, __invokedynamic85_13(4412, (2167470418956066583L ^ life1_3)), __call85_14(receiver));
    __call85_18(life3_7, __invokedynamic85_16(19032, (9122113628488025202L ^ life1_3)), __call85_17(receiver));
    __call85_21(life3_7, __invokedynamic85_19(5450, (4082192749221845870L ^ life1_3)), __call85_20(receiver));
    return life3_7;
}
private static native long __fieldRead85_0() throws Throwable;
private static native org.luaj.vm2.LuaTable __sourceUninitializedNEW85_1() throws Throwable;
private static native void __explicitNewInit85_3(org.luaj.vm2.LuaTable a0) throws Throwable;
private static native java.lang.String __invokedynamic85_4(int a0, long a1) throws Throwable;
private static native org.luaj.vm2.LuaTable __call85_5(com.moon.jJ a0) throws Throwable;
private static native void __call85_6(org.luaj.vm2.LuaTable a0, java.lang.String a1, org.luaj.vm2.LuaTable a2) throws Throwable;
private static native java.lang.String __invokedynamic85_7(int a0, long a1) throws Throwable;
private static native org.luaj.vm2.LuaTable __call85_8(com.moon.jJ a0) throws Throwable;
private static native void __call85_9(org.luaj.vm2.LuaTable a0, java.lang.String a1, org.luaj.vm2.LuaTable a2) throws Throwable;
private static native java.lang.String __invokedynamic85_10(int a0, long a1) throws Throwable;
private static native org.luaj.vm2.LuaTable __call85_11(com.moon.jJ a0) throws Throwable;
private static native void __call85_12(org.luaj.vm2.LuaTable a0, java.lang.String a1, org.luaj.vm2.LuaTable a2) throws Throwable;
private static native java.lang.String __invokedynamic85_13(int a0, long a1) throws Throwable;
private static native org.luaj.vm2.LuaTable __call85_14(com.moon.jJ a0) throws Throwable;
private static native void __call85_15(org.luaj.vm2.LuaTable a0, java.lang.String a1, org.luaj.vm2.LuaTable a2) throws Throwable;
private static native java.lang.String __invokedynamic85_16(int a0, long a1) throws Throwable;
private static native org.luaj.vm2.LuaTable __call85_17(com.moon.jJ a0) throws Throwable;
private static native void __call85_18(org.luaj.vm2.LuaTable a0, java.lang.String a1, org.luaj.vm2.LuaTable a2) throws Throwable;
private static native java.lang.String __invokedynamic85_19(int a0, long a1) throws Throwable;
private static native org.luaj.vm2.LuaTable __call85_20(com.moon.jJ a0) throws Throwable;
private static native void __call85_21(org.luaj.vm2.LuaTable a0, java.lang.String a1, org.luaj.vm2.LuaTable a2) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_77ebb498d8b716cb5c4f(com.moon.jJ a0, com.moon.jI a1) throws E;
private static final class __SourceHandler_77ebb498d8b716cb5c4f {

public static void f100011(com.moon.jJ receiver, com.moon.jI p0) throws Throwable {
    int forestValue100011_61_0;
    com.moon.module.Module forestValue100011_63_0;
    java.lang.String[] spill100011_0;
    boolean spill100011_1;
    com.moon.module.Module spill100011_2;
    long life2_3;
    com.moon.fU life5_6;
    java.util.ArrayList life6_14;
    java.lang.String[] life4_15;
    org.luaj.vm2.Globals life7_19;
    org.luaj.vm2.LuaValue life8_31;
    java.util.Iterator life8_40;
    com.moon.module.Module life9_47;
    com.moon.module.impl.Script life10_69;
    forest_join_80: {
    forest_join_76: {
    life2_3 = (__fieldRead100011_0() ^ 39324063573313L);
    life5_6 = __call100011_2(__call100011_1());
    spill100011_0 = __call100011_3();
    life6_14 = new java.util.ArrayList(__call100011_5(__call100011_4(life5_6)));
    life4_15 = spill100011_0;
    life7_19 = new org.luaj.vm2.Globals();
    __call100011_6(receiver, life7_19);
    __call100011_7(life7_19);
    __call100011_8(life7_19);
    life8_31 = __call100011_10(life7_19, __call100011_9(p0));
    __call100011_11(life8_31);
    life8_40 = __call100011_14(__call100011_13(__call100011_12(life5_6)));
    forest_cycle_40: while (true) {
    forest_join_74: {
    forest_join_63: {
    forest_join_61: {
    forest_join_57: {
    if (!(__call100011_15(life8_40))) {
        break forest_join_76;
    }
    life9_47 = __cast100011_17(__call100011_16(life8_40));
    if (!((life4_15 != null))) {
        break forest_join_80;
    }
    spill100011_1 = __call100011_18(life6_14, life9_47);
    if (!((life4_15 != null))) {
        forestValue100011_61_0 = __integerCategory100011_19(spill100011_1);
        break forest_join_61;
    }
    if (!(spill100011_1)) {
        break forest_join_57;
    }
    if (!((life4_15 == null))) {
        continue forest_cycle_40;
    }
    }
    spill100011_2 = life9_47;
    if (!((life4_15 != null))) {
        forestValue100011_63_0 = spill100011_2;
        break forest_join_63;
    }
    forestValue100011_61_0 = __instanceOf100011_20(spill100011_2);
    }
    if (!((forestValue100011_61_0 != 0))) {
        break forest_join_74;
    }
    forestValue100011_63_0 = life9_47;
    }
    life10_69 = __cast100011_21(forestValue100011_63_0);
    __call100011_22(life10_69, p0);
    __call100011_24(__call100011_23(p0), life10_69);
    }
    if (!((life4_15 == null))) {
        continue forest_cycle_40;
    }
    break forest_cycle_40;
    }
    }
    __call100011_25(p0, 1);
    }
    return;
}
public static void h100011_0(org.luaj.vm2.LuaError p0, com.moon.jI p1, long p2, java.lang.String[] p3, com.moon.fU p4, java.util.ArrayList p5) throws Throwable {
    int forestValue13001100_38_0;
    com.moon.module.Module forestValue13001100_40_0;
    boolean spill13001100_0;
    com.moon.module.Module spill13001100_1;
    org.luaj.vm2.LuaError life7_2;
    java.util.Iterator life7_17;
    com.moon.module.Module life8_24;
    com.moon.module.impl.Script life9_46;
    forest_join_57: {
    forest_join_53: {
    life7_2 = p0;
    java.lang.String __stackOp13001100_2_0 = __call13001100_0(life7_2);
    java.lang.String __stackOp13001100_2_1 = __invokedynamic13001100_1(7709, (1516144439905689173L ^ p2));
    __call13001100_4(__invokedynamic13001100_3(__stackOp13001100_2_1, __stackOp13001100_2_0));
    life7_17 = __call13001100_7(__call13001100_6(__call13001100_5(p4)));
    forest_cycle_17: while (true) {
    forest_join_51: {
    forest_join_40: {
    forest_join_38: {
    forest_join_34: {
    if (!(__call13001100_8(life7_17))) {
        break forest_join_53;
    }
    life8_24 = __cast13001100_10(__call13001100_9(life7_17));
    if (!((p3 != null))) {
        break forest_join_57;
    }
    spill13001100_0 = __call13001100_11(p5, life8_24);
    if (!((p3 != null))) {
        forestValue13001100_38_0 = __integerCategory13001100_12(spill13001100_0);
        break forest_join_38;
    }
    if (!(spill13001100_0)) {
        break forest_join_34;
    }
    if (!((p3 == null))) {
        continue forest_cycle_17;
    }
    }
    spill13001100_1 = life8_24;
    if (!((p3 != null))) {
        forestValue13001100_40_0 = spill13001100_1;
        break forest_join_40;
    }
    forestValue13001100_38_0 = __instanceOf13001100_13(spill13001100_1);
    }
    if (!((forestValue13001100_38_0 != 0))) {
        break forest_join_51;
    }
    forestValue13001100_40_0 = life8_24;
    }
    life9_46 = __cast13001100_14(forestValue13001100_40_0);
    __call13001100_15(life9_46, p1);
    __call13001100_17(__call13001100_16(p1), life9_46);
    }
    if (!((p3 == null))) {
        continue forest_cycle_17;
    }
    break forest_cycle_17;
    }
    }
    __call13001100_18(p1, 1);
    }
    return;
}
public static void h100011_1(org.luaj.vm2.LuaError p0) throws Throwable {
    throw __call13001101_0(p0);
}
public static void h100011_2(org.luaj.vm2.LuaError p0) throws Throwable {
    throw __call13001102_0(p0);
}
public static void h100011_3(org.luaj.vm2.LuaError p0) throws Throwable {
    throw __call13001103_0(p0);
}
public static void h100011_4(org.luaj.vm2.LuaError p0) throws Throwable {
    throw __call13001104_0(p0);
}
private static native long __fieldRead100011_0() throws Throwable;
private static native com.moon.runtime.ClientContext __call100011_1() throws Throwable;
private static native com.moon.fU __call100011_2(com.moon.runtime.ClientContext a0) throws Throwable;
private static native java.lang.String[] __call100011_3() throws Throwable;
private static native com.moon.fV __call100011_4(com.moon.fU a0) throws Throwable;
private static native java.util.Collection __call100011_5(com.moon.fV a0) throws Throwable;
private static native void __call100011_6(com.moon.jJ a0, org.luaj.vm2.Globals a1) throws Throwable;
private static native void __call100011_7(org.luaj.vm2.Globals a0) throws Throwable;
private static native void __call100011_8(org.luaj.vm2.Globals a0) throws Throwable;
private static native java.lang.String __call100011_9(com.moon.jI a0) throws Throwable;
private static native org.luaj.vm2.LuaValue __call100011_10(org.luaj.vm2.Globals a0, java.lang.String a1) throws Throwable;
private static native org.luaj.vm2.LuaValue __call100011_11(org.luaj.vm2.LuaValue a0) throws Throwable;
private static native com.moon.fV __call100011_12(com.moon.fU a0) throws Throwable;
private static native java.util.Collection __call100011_13(com.moon.fV a0) throws Throwable;
private static native java.util.Iterator __call100011_14(java.util.Collection a0) throws Throwable;
private static native boolean __call100011_15(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call100011_16(java.util.Iterator a0) throws Throwable;
private static native com.moon.module.Module __cast100011_17(java.lang.Object a0) throws Throwable;
private static native boolean __call100011_18(java.util.ArrayList a0, com.moon.module.Module a1) throws Throwable;
private static native int __integerCategory100011_19(boolean value) throws Throwable;
private static native int __instanceOf100011_20(com.moon.module.Module a0) throws Throwable;
private static native com.moon.module.impl.Script __cast100011_21(com.moon.module.Module a0) throws Throwable;
private static native com.moon.module.impl.Script __call100011_22(com.moon.module.impl.Script a0, com.moon.jI a1) throws Throwable;
private static native java.util.List __call100011_23(com.moon.jI a0) throws Throwable;
private static native boolean __call100011_24(java.util.List a0, com.moon.module.impl.Script a1) throws Throwable;
private static native com.moon.jI __call100011_25(com.moon.jI a0, int a1) throws Throwable;
private static native java.lang.String __call13001100_0(org.luaj.vm2.LuaError a0) throws Throwable;
private static native java.lang.String __invokedynamic13001100_1(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic13001100_3(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call13001100_4(java.lang.String a0) throws Throwable;
private static native com.moon.fV __call13001100_5(com.moon.fU a0) throws Throwable;
private static native java.util.Collection __call13001100_6(com.moon.fV a0) throws Throwable;
private static native java.util.Iterator __call13001100_7(java.util.Collection a0) throws Throwable;
private static native boolean __call13001100_8(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call13001100_9(java.util.Iterator a0) throws Throwable;
private static native com.moon.module.Module __cast13001100_10(java.lang.Object a0) throws Throwable;
private static native boolean __call13001100_11(java.util.ArrayList a0, com.moon.module.Module a1) throws Throwable;
private static native int __integerCategory13001100_12(boolean value) throws Throwable;
private static native int __instanceOf13001100_13(com.moon.module.Module a0) throws Throwable;
private static native com.moon.module.impl.Script __cast13001100_14(com.moon.module.Module a0) throws Throwable;
private static native com.moon.module.impl.Script __call13001100_15(com.moon.module.impl.Script a0, com.moon.jI a1) throws Throwable;
private static native java.util.List __call13001100_16(com.moon.jI a0) throws Throwable;
private static native boolean __call13001100_17(java.util.List a0, com.moon.module.impl.Script a1) throws Throwable;
private static native com.moon.jI __call13001100_18(com.moon.jI a0, int a1) throws Throwable;
private static native org.luaj.vm2.LuaError __call13001101_0(org.luaj.vm2.LuaError a0) throws Throwable;
private static native org.luaj.vm2.LuaError __call13001102_0(org.luaj.vm2.LuaError a0) throws Throwable;
private static native org.luaj.vm2.LuaError __call13001103_0(org.luaj.vm2.LuaError a0) throws Throwable;
private static native org.luaj.vm2.LuaError __call13001104_0(org.luaj.vm2.LuaError a0) throws Throwable;

}

private static native <E extends Throwable> org.luaj.vm2.LuaTable __sourceHandlerCall_1f3dbb7a04d3add96356(com.moon.jJ a0) throws E;
private static final class __SourceHandler_1f3dbb7a04d3add96356 {

public static org.luaj.vm2.LuaTable f86(com.moon.jJ receiver) throws Throwable {
    org.luaj.vm2.LuaTable spill86_0;
    org.luaj.vm2.LuaTable spill86_1;
    java.lang.String spill86_2;
    com.moon.qW spill86_3;
    long life1_3;
    org.luaj.vm2.LuaTable life3_7;
    life1_3 = (__fieldRead86_0() ^ 123904606499374L);
    org.luaj.vm2.LuaTable __stackOp86_2_0 = __sourceUninitializedNEW86_1();
    spill86_0 = __stackOp86_2_0;
    __explicitNewInit86_3(__stackOp86_2_0);
    life3_7 = spill86_0;
    spill86_1 = life3_7;
    spill86_2 = __invokedynamic86_4(4166, (485081391365801848L ^ life1_3));
    com.moon.qW __stackOp86_6_0 = __sourceUninitializedNEW86_5();
    spill86_3 = __stackOp86_6_0;
    __explicitNewInit86_7(__stackOp86_6_0, receiver);
    __call86_8(spill86_1, spill86_2, spill86_3);
    return life3_7;
}
private static native long __fieldRead86_0() throws Throwable;
private static native org.luaj.vm2.LuaTable __sourceUninitializedNEW86_1() throws Throwable;
private static native void __explicitNewInit86_3(org.luaj.vm2.LuaTable a0) throws Throwable;
private static native java.lang.String __invokedynamic86_4(int a0, long a1) throws Throwable;
private static native com.moon.qW __sourceUninitializedNEW86_5() throws Throwable;
private static native void __explicitNewInit86_7(com.moon.qW a0, com.moon.jJ a1) throws Throwable;
private static native void __call86_8(org.luaj.vm2.LuaTable a0, java.lang.String a1, com.moon.qW a2) throws Throwable;

}

private static native <E extends Throwable> org.luaj.vm2.LuaValue __sourceHandlerCall_12dc14c7610af9d96e9c(com.moon.jJ a0) throws E;
private static final class __SourceHandler_12dc14c7610af9d96e9c {

public static org.luaj.vm2.LuaValue f87(com.moon.jJ receiver) throws Throwable {
    org.luaj.vm2.LuaTable spill87_0;
    long life1_3;
    org.luaj.vm2.LuaTable life3_7;
    life1_3 = (__fieldRead87_0() ^ 2604866951090L);
    org.luaj.vm2.LuaTable __stackOp87_2_0 = __sourceUninitializedNEW87_1();
    spill87_0 = __stackOp87_2_0;
    __explicitNewInit87_3(__stackOp87_2_0);
    life3_7 = spill87_0;
    __call87_6(life3_7, __invokedynamic87_4(1444, (5593050294012311358L ^ life1_3)), __call87_5(receiver));
    __call87_9(life3_7, __invokedynamic87_7(15106, (766310014285203895L ^ life1_3)), __call87_8(receiver));
    __call87_12(life3_7, __invokedynamic87_10(8063, (2524322645360700880L ^ life1_3)), __call87_11(receiver));
    __call87_15(life3_7, __invokedynamic87_13(23455, (3776725268550854966L ^ life1_3)), __call87_14(receiver));
    __call87_18(life3_7, __invokedynamic87_16(13326, (7933426512865380025L ^ life1_3)), __call87_17(receiver));
    return life3_7;
}
private static native long __fieldRead87_0() throws Throwable;
private static native org.luaj.vm2.LuaTable __sourceUninitializedNEW87_1() throws Throwable;
private static native void __explicitNewInit87_3(org.luaj.vm2.LuaTable a0) throws Throwable;
private static native java.lang.String __invokedynamic87_4(int a0, long a1) throws Throwable;
private static native org.luaj.vm2.LuaTable __call87_5(com.moon.jJ a0) throws Throwable;
private static native void __call87_6(org.luaj.vm2.LuaTable a0, java.lang.String a1, org.luaj.vm2.LuaTable a2) throws Throwable;
private static native java.lang.String __invokedynamic87_7(int a0, long a1) throws Throwable;
private static native org.luaj.vm2.LuaTable __call87_8(com.moon.jJ a0) throws Throwable;
private static native void __call87_9(org.luaj.vm2.LuaTable a0, java.lang.String a1, org.luaj.vm2.LuaTable a2) throws Throwable;
private static native java.lang.String __invokedynamic87_10(int a0, long a1) throws Throwable;
private static native org.luaj.vm2.LuaTable __call87_11(com.moon.jJ a0) throws Throwable;
private static native void __call87_12(org.luaj.vm2.LuaTable a0, java.lang.String a1, org.luaj.vm2.LuaTable a2) throws Throwable;
private static native java.lang.String __invokedynamic87_13(int a0, long a1) throws Throwable;
private static native org.luaj.vm2.LuaTable __call87_14(com.moon.jJ a0) throws Throwable;
private static native void __call87_15(org.luaj.vm2.LuaTable a0, java.lang.String a1, org.luaj.vm2.LuaTable a2) throws Throwable;
private static native java.lang.String __invokedynamic87_16(int a0, long a1) throws Throwable;
private static native org.luaj.vm2.LuaTable __call87_17(com.moon.jJ a0) throws Throwable;
private static native void __call87_18(org.luaj.vm2.LuaTable a0, java.lang.String a1, org.luaj.vm2.LuaTable a2) throws Throwable;

}

private static native <E extends Throwable> org.luaj.vm2.LuaTable __sourceHandlerCall_b54a3541d03f85892854(com.moon.jJ a0) throws E;
private static final class __SourceHandler_b54a3541d03f85892854 {

public static org.luaj.vm2.LuaTable f88(com.moon.jJ receiver) throws Throwable {
    org.luaj.vm2.LuaTable spill88_0;
    org.luaj.vm2.LuaTable spill88_1;
    java.lang.String spill88_2;
    com.moon.q0 spill88_3;
    long life1_3;
    org.luaj.vm2.LuaTable life3_7;
    life1_3 = (__fieldRead88_0() ^ 26510987733924L);
    org.luaj.vm2.LuaTable __stackOp88_2_0 = __sourceUninitializedNEW88_1();
    spill88_0 = __stackOp88_2_0;
    __explicitNewInit88_3(__stackOp88_2_0);
    life3_7 = spill88_0;
    spill88_1 = life3_7;
    spill88_2 = __invokedynamic88_4(4166, (485036741825994482L ^ life1_3));
    com.moon.q0 __stackOp88_6_0 = __sourceUninitializedNEW88_5();
    spill88_3 = __stackOp88_6_0;
    __explicitNewInit88_7(__stackOp88_6_0, receiver);
    __call88_8(spill88_1, spill88_2, spill88_3);
    return life3_7;
}
private static native long __fieldRead88_0() throws Throwable;
private static native org.luaj.vm2.LuaTable __sourceUninitializedNEW88_1() throws Throwable;
private static native void __explicitNewInit88_3(org.luaj.vm2.LuaTable a0) throws Throwable;
private static native java.lang.String __invokedynamic88_4(int a0, long a1) throws Throwable;
private static native com.moon.q0 __sourceUninitializedNEW88_5() throws Throwable;
private static native void __explicitNewInit88_7(com.moon.q0 a0, com.moon.jJ a1) throws Throwable;
private static native void __call88_8(org.luaj.vm2.LuaTable a0, java.lang.String a1, com.moon.q0 a2) throws Throwable;

}

private static native <E extends Throwable> org.luaj.vm2.LuaTable __sourceHandlerCall_1d83fc71a290b60a8721(com.moon.jJ a0) throws E;
private static final class __SourceHandler_1d83fc71a290b60a8721 {

public static org.luaj.vm2.LuaTable f89(com.moon.jJ receiver) throws Throwable {
    org.luaj.vm2.LuaTable spill89_0;
    org.luaj.vm2.LuaTable spill89_1;
    java.lang.String spill89_2;
    com.moon.q1 spill89_3;
    long life1_3;
    org.luaj.vm2.LuaTable life3_7;
    life1_3 = (__fieldRead89_0() ^ 82026601481283L);
    org.luaj.vm2.LuaTable __stackOp89_2_0 = __sourceUninitializedNEW89_1();
    spill89_0 = __stackOp89_2_0;
    __explicitNewInit89_3(__stackOp89_2_0);
    life3_7 = spill89_0;
    spill89_1 = life3_7;
    spill89_2 = __invokedynamic89_4(4166, (485087891873935637L ^ life1_3));
    com.moon.q1 __stackOp89_6_0 = __sourceUninitializedNEW89_5();
    spill89_3 = __stackOp89_6_0;
    __explicitNewInit89_7(__stackOp89_6_0, receiver);
    __call89_8(spill89_1, spill89_2, spill89_3);
    return life3_7;
}
private static native long __fieldRead89_0() throws Throwable;
private static native org.luaj.vm2.LuaTable __sourceUninitializedNEW89_1() throws Throwable;
private static native void __explicitNewInit89_3(org.luaj.vm2.LuaTable a0) throws Throwable;
private static native java.lang.String __invokedynamic89_4(int a0, long a1) throws Throwable;
private static native com.moon.q1 __sourceUninitializedNEW89_5() throws Throwable;
private static native void __explicitNewInit89_7(com.moon.q1 a0, com.moon.jJ a1) throws Throwable;
private static native void __call89_8(org.luaj.vm2.LuaTable a0, java.lang.String a1, com.moon.q1 a2) throws Throwable;

}

private static native <E extends Throwable> org.luaj.vm2.LuaTable __sourceHandlerCall_3f8ef379e79814bd36e7(com.moon.jJ a0) throws E;
private static final class __SourceHandler_3f8ef379e79814bd36e7 {

public static org.luaj.vm2.LuaTable f90(com.moon.jJ receiver) throws Throwable {
    org.luaj.vm2.LuaTable spill90_0;
    org.luaj.vm2.LuaTable spill90_1;
    java.lang.String spill90_2;
    com.moon.q2 spill90_3;
    long life1_3;
    org.luaj.vm2.LuaTable life3_7;
    life1_3 = (__fieldRead90_0() ^ 135946482866582L);
    org.luaj.vm2.LuaTable __stackOp90_2_0 = __sourceUninitializedNEW90_1();
    spill90_0 = __stackOp90_2_0;
    __explicitNewInit90_3(__stackOp90_2_0);
    life3_7 = spill90_0;
    spill90_1 = life3_7;
    spill90_2 = __invokedynamic90_4(4166, (485071411016985792L ^ life1_3));
    com.moon.q2 __stackOp90_6_0 = __sourceUninitializedNEW90_5();
    spill90_3 = __stackOp90_6_0;
    __explicitNewInit90_7(__stackOp90_6_0, receiver);
    __call90_8(spill90_1, spill90_2, spill90_3);
    return life3_7;
}
private static native long __fieldRead90_0() throws Throwable;
private static native org.luaj.vm2.LuaTable __sourceUninitializedNEW90_1() throws Throwable;
private static native void __explicitNewInit90_3(org.luaj.vm2.LuaTable a0) throws Throwable;
private static native java.lang.String __invokedynamic90_4(int a0, long a1) throws Throwable;
private static native com.moon.q2 __sourceUninitializedNEW90_5() throws Throwable;
private static native void __explicitNewInit90_7(com.moon.q2 a0, com.moon.jJ a1) throws Throwable;
private static native void __call90_8(org.luaj.vm2.LuaTable a0, java.lang.String a1, com.moon.q2 a2) throws Throwable;

}

private static native <E extends Throwable> org.luaj.vm2.LuaTable __sourceHandlerCall_056487d12418910865bf(com.moon.jJ a0) throws E;
private static final class __SourceHandler_056487d12418910865bf {

public static org.luaj.vm2.LuaTable f91(com.moon.jJ receiver) throws Throwable {
    org.luaj.vm2.LuaTable spill91_0;
    org.luaj.vm2.LuaTable spill91_1;
    java.lang.String spill91_2;
    com.moon.q3 spill91_3;
    long life1_3;
    org.luaj.vm2.LuaTable life3_7;
    life1_3 = (__fieldRead91_0() ^ 31005375619566L);
    org.luaj.vm2.LuaTable __stackOp91_2_0 = __sourceUninitializedNEW91_1();
    spill91_0 = __stackOp91_2_0;
    __explicitNewInit91_3(__stackOp91_2_0);
    life3_7 = spill91_0;
    spill91_1 = life3_7;
    spill91_2 = __invokedynamic91_4(4166, (485041271110030520L ^ life1_3));
    com.moon.q3 __stackOp91_6_0 = __sourceUninitializedNEW91_5();
    spill91_3 = __stackOp91_6_0;
    __explicitNewInit91_7(__stackOp91_6_0, receiver);
    __call91_8(spill91_1, spill91_2, spill91_3);
    return life3_7;
}
private static native long __fieldRead91_0() throws Throwable;
private static native org.luaj.vm2.LuaTable __sourceUninitializedNEW91_1() throws Throwable;
private static native void __explicitNewInit91_3(org.luaj.vm2.LuaTable a0) throws Throwable;
private static native java.lang.String __invokedynamic91_4(int a0, long a1) throws Throwable;
private static native com.moon.q3 __sourceUninitializedNEW91_5() throws Throwable;
private static native void __explicitNewInit91_7(com.moon.q3 a0, com.moon.jJ a1) throws Throwable;
private static native void __call91_8(org.luaj.vm2.LuaTable a0, java.lang.String a1, com.moon.q3 a2) throws Throwable;

}

private static native <E extends Throwable> org.luaj.vm2.LuaTable __sourceHandlerCall_225336c41d70e194ae1b(com.moon.jJ a0) throws E;
private static final class __SourceHandler_225336c41d70e194ae1b {

public static org.luaj.vm2.LuaTable f92(com.moon.jJ receiver) throws Throwable {
    org.luaj.vm2.LuaTable spill92_0;
    org.luaj.vm2.LuaTable spill92_1;
    java.lang.String spill92_2;
    com.moon.q4 spill92_3;
    long life1_3;
    org.luaj.vm2.LuaTable life3_7;
    life1_3 = (__fieldRead92_0() ^ 131197800720361L);
    org.luaj.vm2.LuaTable __stackOp92_2_0 = __sourceUninitializedNEW92_1();
    spill92_0 = __stackOp92_2_0;
    __explicitNewInit92_3(__stackOp92_2_0);
    life3_7 = spill92_0;
    spill92_1 = life3_7;
    spill92_2 = __invokedynamic92_4(4166, (485083736220766911L ^ life1_3));
    com.moon.q4 __stackOp92_6_0 = __sourceUninitializedNEW92_5();
    spill92_3 = __stackOp92_6_0;
    __explicitNewInit92_7(__stackOp92_6_0, receiver);
    __call92_8(spill92_1, spill92_2, spill92_3);
    return life3_7;
}
private static native long __fieldRead92_0() throws Throwable;
private static native org.luaj.vm2.LuaTable __sourceUninitializedNEW92_1() throws Throwable;
private static native void __explicitNewInit92_3(org.luaj.vm2.LuaTable a0) throws Throwable;
private static native java.lang.String __invokedynamic92_4(int a0, long a1) throws Throwable;
private static native com.moon.q4 __sourceUninitializedNEW92_5() throws Throwable;
private static native void __explicitNewInit92_7(com.moon.q4 a0, com.moon.jJ a1) throws Throwable;
private static native void __call92_8(org.luaj.vm2.LuaTable a0, java.lang.String a1, com.moon.q4 a2) throws Throwable;

}


private org.luaj.vm2.LuaTable i() {
long life1_3;
    org.luaj.vm2.LuaTable life3_7;
    life1_3 = (com.moon.jJ.a ^ 105820729850804L);
    life3_7 = new org.luaj.vm2.LuaTable();
    ((org.luaj.vm2.LuaTable)(life3_7)).set(((java.lang.String)(__sourceIntrinsic_9eadaf50037f_invokedynamic100009_1(32025, (7947098539868742565L ^ life1_3)))), ((org.luaj.vm2.LuaValue)(new com.moon.rt(this))));
    ((org.luaj.vm2.LuaTable)(life3_7)).set(((java.lang.String)(__sourceIntrinsic_9eadaf50037f_invokedynamic100009_3(4166, (485063273097432802L ^ life1_3)))), ((org.luaj.vm2.LuaValue)(new com.moon.qX(this))));
    return life3_7;
}


private org.luaj.vm2.LuaTable b() { return __sourceHandlerCall_1f3dbb7a04d3add96356(this); }


public static java.lang.String[] b__ArrayString() {
return com.moon.jJ.b;
}


private org.luaj.vm2.LuaValue b__LuaValue() { return __sourceHandlerCall_12dc14c7610af9d96e9c(this); }


public static void b(java.lang.String[] p0) {
b = ((java.lang.String[])(p0));
    return;
}


private org.luaj.vm2.LuaTable e() { return __sourceHandlerCall_3f8ef379e79814bd36e7(this); }


private org.luaj.vm2.LuaTable c() { return __sourceHandlerCall_b54a3541d03f85892854(this); }


private org.luaj.vm2.LuaTable h() {
long life1_3;
    org.luaj.vm2.LuaTable life3_7;
    life1_3 = (com.moon.jJ.a ^ 3535972249238L);
    life3_7 = new org.luaj.vm2.LuaTable();
    ((org.luaj.vm2.LuaTable)(life3_7)).set(((java.lang.String)(__sourceIntrinsic_80910f55e773_invokedynamic100010_1(3079, (4721198552061478845L ^ life1_3)))), ((org.luaj.vm2.LuaValue)(new com.moon.rs(this))));
    ((org.luaj.vm2.LuaTable)(life3_7)).set(((java.lang.String)(__sourceIntrinsic_80910f55e773_invokedynamic100010_3(26304, (4538104891382000970L ^ life1_3)))), ((org.luaj.vm2.LuaValue)(new com.moon.q5(this))));
    return life3_7;
}


private org.luaj.vm2.LuaTable f() { return __sourceHandlerCall_056487d12418910865bf(this); }


private org.luaj.vm2.LuaTable d() { return __sourceHandlerCall_1d83fc71a290b60a8721(this); }


public void a(com.moon.jI p0) { __sourceHandlerCall_77ebb498d8b716cb5c4f(this, p0); }


private static org.luaj.vm2.LuaError a(org.luaj.vm2.LuaError p0) {
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
        byte[] spill575_0 = p0;
        life4_9 += 1;
        life5_44 = (spill575_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill575_1 = p0;
        life4_9 += 1;
        life5_76 = (spill575_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill575_2 = p0;
        life4_9 += 1;
        life5_91 = (spill575_2)[life4_9];
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 15698);
    if (((com.moon.jJ.d)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.jJ.e)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.jJ.e)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/jJ", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.jJ.c)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.jJ.d)[life5_8] = com.moon.jJ.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.jJ.d)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.jJ.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral1898_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/jJ"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private org.luaj.vm2.LuaTable a() { return __sourceHandlerCall_408c634077d1d1876c91(this); }


private org.luaj.vm2.LuaValue a__LuaValue() {
long life1_3;
    org.luaj.vm2.LuaTable life3_7;
    life1_3 = (com.moon.jJ.a ^ 59631327252789L);
    life3_7 = new org.luaj.vm2.LuaTable();
    ((org.luaj.vm2.LuaTable)(life3_7)).set(((java.lang.String)(__sourceIntrinsic_b64b34b3de76_invokedynamic100012_1(14541, (1384876106369273050L ^ life1_3)))), ((org.luaj.vm2.LuaValue)(org.luaj.vm2.lib.jse.CoerceJavaToLua.coerce(((java.lang.Object)(com.moon.scripting.api.enums.Facing.class))))));
    ((org.luaj.vm2.LuaTable)(life3_7)).set(((java.lang.String)(__sourceIntrinsic_b64b34b3de76_invokedynamic100012_5(12394, (8636262083079373940L ^ life1_3)))), ((org.luaj.vm2.LuaValue)(org.luaj.vm2.lib.jse.CoerceJavaToLua.coerce(((java.lang.Object)(com.moon.scripting.api.enums.HitType.class))))));
    ((org.luaj.vm2.LuaTable)(life3_7)).set(((java.lang.String)(__sourceIntrinsic_b64b34b3de76_invokedynamic100012_9(21450, (4975628245424564223L ^ life1_3)))), ((org.luaj.vm2.LuaValue)(org.luaj.vm2.lib.jse.CoerceJavaToLua.coerce(((java.lang.Object)(com.moon.scripting.api.enums.DiggingActions.class))))));
    ((org.luaj.vm2.LuaTable)(life3_7)).set(((java.lang.String)(__sourceIntrinsic_b64b34b3de76_invokedynamic100012_13(30725, (1564435063509601342L ^ life1_3)))), ((org.luaj.vm2.LuaValue)(org.luaj.vm2.lib.jse.CoerceJavaToLua.coerce(((java.lang.Object)(com.moon.scripting.api.enums.EntityAction.class))))));
    ((org.luaj.vm2.LuaTable)(life3_7)).set(((java.lang.String)(__sourceIntrinsic_b64b34b3de76_invokedynamic100012_17(11886, (8376753117742897786L ^ life1_3)))), ((org.luaj.vm2.LuaValue)(org.luaj.vm2.lib.jse.CoerceJavaToLua.coerce(((java.lang.Object)(com.moon.scripting.api.enums.InteractActions.class))))));
    ((org.luaj.vm2.LuaTable)(life3_7)).set(((java.lang.String)(__sourceIntrinsic_b64b34b3de76_invokedynamic100012_21(11576, (6562229970217081095L ^ life1_3)))), ((org.luaj.vm2.LuaValue)(org.luaj.vm2.lib.jse.CoerceJavaToLua.coerce(((java.lang.Object)(com.moon.scripting.api.enums.CustomFontType.class))))));
    ((org.luaj.vm2.LuaTable)(life3_7)).set(((java.lang.String)(__sourceIntrinsic_b64b34b3de76_invokedynamic100012_25(20036, (5579613122504292955L ^ life1_3)))), ((org.luaj.vm2.LuaValue)(org.luaj.vm2.lib.jse.CoerceJavaToLua.coerce(((java.lang.Object)(com.moon.scripting.api.enums.TemplateType.class))))));
    ((org.luaj.vm2.LuaTable)(life3_7)).set(((java.lang.String)(__sourceIntrinsic_b64b34b3de76_invokedynamic100012_29(27490, (4390583269355806548L ^ life1_3)))), ((org.luaj.vm2.LuaValue)(org.luaj.vm2.lib.jse.CoerceJavaToLua.coerce(((java.lang.Object)(com.moon.scripting.api.enums.ClientStatusActions.class))))));
    return life3_7;
}


private void a(org.luaj.vm2.Globals p0) {
org.luaj.vm2.LuaTable forestValue100013_244_0;
    java.lang.String[] spill100013_0;
    com.moon.jN[] spill100013_1;
    com.moon.jN[] spill100013_2;
    com.moon.jN[] spill100013_3;
    com.moon.jN[] spill100013_4;
    com.moon.jN[] spill100013_5;
    com.moon.jN[] spill100013_6;
    org.luaj.vm2.Globals spill100013_7;
    long life2_3;
    com.moon.jN[] life5_208;
    java.lang.String[] life4_209;
    com.moon.jN[] life6_211;
    int life7_214;
    int life8_216;
    com.moon.jN life9_223;
    org.luaj.vm2.LuaTable life10_227;
    org.luaj.vm2.LuaTable life6_245;
    com.moon.jR life7_249;
    org.luaj.vm2.LuaTable life8_253;
    com.moon.jO life9_268;
    org.luaj.vm2.LuaTable life10_272;
    com.moon.jV life11_287;
    org.luaj.vm2.LuaTable life12_291;
    forest_join_244: {
    forest_join_241: {
    life2_3 = (com.moon.jJ.a ^ 21195087414805L);
    ((org.luaj.vm2.Globals)(p0)).load(((org.luaj.vm2.LuaValue)(new org.luaj.vm2.lib.jse.JseBaseLib())));
    ((org.luaj.vm2.Globals)(p0)).load(((org.luaj.vm2.LuaValue)(new org.luaj.vm2.lib.PackageLib())));
    ((org.luaj.vm2.Globals)(p0)).load(((org.luaj.vm2.LuaValue)(new org.luaj.vm2.lib.Bit32Lib())));
    ((org.luaj.vm2.Globals)(p0)).load(((org.luaj.vm2.LuaValue)(new org.luaj.vm2.lib.TableLib())));
    ((org.luaj.vm2.Globals)(p0)).load(((org.luaj.vm2.LuaValue)(new org.luaj.vm2.lib.StringLib())));
    ((org.luaj.vm2.Globals)(p0)).load(((org.luaj.vm2.LuaValue)(new org.luaj.vm2.lib.CoroutineLib())));
    ((org.luaj.vm2.Globals)(p0)).load(((org.luaj.vm2.LuaValue)(new org.luaj.vm2.lib.jse.JseMathLib())));
    ((org.luaj.vm2.Globals)(p0)).load(((org.luaj.vm2.LuaValue)(new org.luaj.vm2.lib.jse.JseIoLib())));
    ((org.luaj.vm2.Globals)(p0)).load(((org.luaj.vm2.LuaValue)(new org.luaj.vm2.lib.jse.JseOsLib())));
    ((org.luaj.vm2.Globals)(p0)).load(((org.luaj.vm2.LuaValue)(new org.luaj.vm2.lib.jse.LuajavaLib())));
    ((org.luaj.vm2.Globals)(p0)).set(((java.lang.String)(__sourceIntrinsic_1b2b8d52634a_invokedynamic100013_11(8696, (2767170160846930628L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(org.luaj.vm2.LuaValue.NIL)));
    ((org.luaj.vm2.Globals)(p0)).set(((java.lang.String)(__sourceIntrinsic_1b2b8d52634a_invokedynamic100013_14(25395, (3661385931722440713L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(org.luaj.vm2.LuaValue.NIL)));
    ((org.luaj.vm2.Globals)(p0)).set(((java.lang.String)(__sourceIntrinsic_1b2b8d52634a_invokedynamic100013_17(15164, (2529563111538038829L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(org.luaj.vm2.LuaValue.NIL)));
    ((org.luaj.vm2.Globals)(p0)).set(((java.lang.String)(__sourceIntrinsic_1b2b8d52634a_invokedynamic100013_20(12071, (6607221703522487338L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(org.luaj.vm2.LuaValue.NIL)));
    ((org.luaj.vm2.Globals)(p0)).set(((java.lang.String)(__sourceIntrinsic_1b2b8d52634a_invokedynamic100013_23(2581, (5598457563081451777L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(org.luaj.vm2.LuaValue.NIL)));
    ((org.luaj.vm2.Globals)(p0)).set(((java.lang.String)(__sourceIntrinsic_1b2b8d52634a_invokedynamic100013_26(1616, (2780616143471715655L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(org.luaj.vm2.LuaValue.NIL)));
    ((org.luaj.vm2.Globals)(p0)).set(((java.lang.String)(__sourceIntrinsic_1b2b8d52634a_invokedynamic100013_29(15609, (466086813514964929L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(org.luaj.vm2.LuaValue.NIL)));
    ((org.luaj.vm2.Globals)(p0)).set(((java.lang.String)(__sourceIntrinsic_1b2b8d52634a_invokedynamic100013_32(11487, (4016624677220093918L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(org.luaj.vm2.LuaValue.NIL)));
    ((org.luaj.vm2.Globals)(p0)).set(((java.lang.String)(__sourceIntrinsic_1b2b8d52634a_invokedynamic100013_35(9063, (5609119525824528465L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(org.luaj.vm2.LuaValue.NIL)));
    ((org.luaj.vm2.Globals)(p0)).set(((java.lang.String)(__sourceIntrinsic_1b2b8d52634a_invokedynamic100013_38(21287, (2576087036840669245L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(org.luaj.vm2.LuaValue.NIL)));
    ((org.luaj.vm2.Globals)(p0)).set(((java.lang.String)(__sourceIntrinsic_1b2b8d52634a_invokedynamic100013_41(16636, (8064636444281431024L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(org.luaj.vm2.LuaValue.NIL)));
    ((org.luaj.vm2.Globals)(p0)).set(((java.lang.String)(__sourceIntrinsic_1b2b8d52634a_invokedynamic100013_44(6688, (6216360652142917922L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(org.luaj.vm2.LuaValue.NIL)));
    ((org.luaj.vm2.Globals)(p0)).set(((java.lang.String)(__sourceIntrinsic_1b2b8d52634a_invokedynamic100013_47(16737, (2279715662122279527L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(org.luaj.vm2.LuaValue.NIL)));
    spill100013_0 = com.moon.jJ.b__ArrayString();
    com.moon.jN[] __stackOp100013_52_0 = new com.moon.jN[((int) com.moon.jJ.f)];
    spill100013_1 = __stackOp100013_52_0;
    (__stackOp100013_52_0)[0] = new com.moon.jP();
    com.moon.jN[] __stackOp100013_53_0 = spill100013_1;
    spill100013_2 = __stackOp100013_53_0;
    (__stackOp100013_53_0)[1] = new com.moon.jT();
    com.moon.jN[] __stackOp100013_54_0 = spill100013_2;
    spill100013_3 = __stackOp100013_54_0;
    (__stackOp100013_54_0)[2] = new com.moon.jW();
    com.moon.jN[] __stackOp100013_55_0 = spill100013_3;
    spill100013_4 = __stackOp100013_55_0;
    (__stackOp100013_55_0)[3] = new com.moon.jU();
    com.moon.jN[] __stackOp100013_56_0 = spill100013_4;
    spill100013_5 = __stackOp100013_56_0;
    (__stackOp100013_56_0)[4] = new com.moon.jS();
    com.moon.jN[] __stackOp100013_57_0 = spill100013_5;
    spill100013_6 = __stackOp100013_57_0;
    (__stackOp100013_57_0)[5] = new com.moon.jQ();
    life5_208 = spill100013_6;
    life4_209 = spill100013_0;
    life6_211 = life5_208;
    life7_214 = (life6_211).length;
    life8_216 = 0;
    forest_cycle_217: while (true) {
    if (!((life8_216 < life7_214))) {
        break forest_join_241;
    }
    life9_223 = (life6_211)[life8_216];
    life10_227 = new org.luaj.vm2.LuaTable();
    ((com.moon.jN)(life9_223)).a(((org.luaj.vm2.LuaTable)(life10_227)));
    spill100013_7 = p0;
    if (!((life4_209 != null))) {
        forestValue100013_244_0 = spill100013_7;
        break forest_join_244;
    }
    ((org.luaj.vm2.Globals)(spill100013_7)).set(((java.lang.String)(((com.moon.jN)(life9_223)).a())), ((org.luaj.vm2.LuaValue)(life10_227)));
    life8_216 += 1;
    if (!((life4_209 == null))) {
        continue forest_cycle_217;
    }
    break forest_cycle_217;
    }
    }
    forestValue100013_244_0 = new org.luaj.vm2.LuaTable();
    }
    life6_245 = forestValue100013_244_0;
    life7_249 = new com.moon.jR();
    life8_253 = new org.luaj.vm2.LuaTable();
    ((com.moon.jR)(life7_249)).a(((org.luaj.vm2.LuaTable)(life8_253)));
    ((org.luaj.vm2.LuaTable)(life6_245)).set(((java.lang.String)(__sourceIntrinsic_1b2b8d52634a_invokedynamic100013_62(31011, (6665889096057051684L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(life8_253)));
    life9_268 = new com.moon.jO();
    life10_272 = new org.luaj.vm2.LuaTable();
    ((com.moon.jO)(life9_268)).a(((org.luaj.vm2.LuaTable)(life10_272)));
    ((org.luaj.vm2.LuaTable)(life6_245)).set(((java.lang.String)(__sourceIntrinsic_1b2b8d52634a_invokedynamic100013_65(4774, (4366341093426082229L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(life10_272)));
    life11_287 = new com.moon.jV();
    life12_291 = new org.luaj.vm2.LuaTable();
    ((com.moon.jV)(life11_287)).a(((org.luaj.vm2.LuaTable)(life12_291)));
    ((org.luaj.vm2.LuaTable)(life6_245)).set(((java.lang.String)(__sourceIntrinsic_1b2b8d52634a_invokedynamic100013_68(17984, (4669871353809593694L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(life12_291)));
    ((org.luaj.vm2.Globals)(p0)).set(((java.lang.String)(__sourceIntrinsic_1b2b8d52634a_invokedynamic100013_70(29894, (6769974578939942909L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(life6_245)));
    ((org.luaj.vm2.Globals)(p0)).set(((java.lang.String)(__sourceIntrinsic_1b2b8d52634a_invokedynamic100013_72(30904, (5803328137497140155L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(((com.moon.jJ)(this)).a__LuaValue())));
    ((org.luaj.vm2.Globals)(p0)).set(((java.lang.String)(__sourceIntrinsic_1b2b8d52634a_invokedynamic100013_75(15068, (6644811977596180956L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(((com.moon.jJ)(this)).b__LuaValue())));
    return;
}


private org.luaj.vm2.LuaTable k() {
long life1_3;
    org.luaj.vm2.LuaTable life3_7;
    life1_3 = (com.moon.jJ.a ^ 27909600021806L);
    life3_7 = new org.luaj.vm2.LuaTable();
    ((org.luaj.vm2.LuaTable)(life3_7)).set(((java.lang.String)(__sourceIntrinsic_184ec7702e11_invokedynamic100014_1(32025, (7947091204421604671L ^ life1_3)))), ((org.luaj.vm2.LuaValue)(new com.moon.rr(this))));
    ((org.luaj.vm2.LuaTable)(life3_7)).set(((java.lang.String)(__sourceIntrinsic_184ec7702e11_invokedynamic100014_3(4166, (485037624990840952L ^ life1_3)))), ((org.luaj.vm2.LuaValue)(new com.moon.qZ(this))));
    return life3_7;
}


private org.luaj.vm2.LuaTable g() { return __sourceHandlerCall_225336c41d70e194ae1b(this); }


private org.luaj.vm2.LuaTable j() {
long life1_3;
    org.luaj.vm2.LuaTable life3_7;
    life1_3 = (com.moon.jJ.a ^ 60071422900273L);
    life3_7 = new org.luaj.vm2.LuaTable();
    ((org.luaj.vm2.LuaTable)(life3_7)).set(((java.lang.String)(__sourceIntrinsic_43b73610d3d6_invokedynamic100015_1(32025, (7947044199259922464L ^ life1_3)))), ((org.luaj.vm2.LuaValue)(new com.moon.rq(this))));
    ((org.luaj.vm2.LuaTable)(life3_7)).set(((java.lang.String)(__sourceIntrinsic_43b73610d3d6_invokedynamic100015_3(4166, (485013159818431847L ^ life1_3)))), ((org.luaj.vm2.LuaValue)(new com.moon.qY(this))));
    return life3_7;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral1898_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_1b2b8d52634a_invokedynamic100013_11(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_1b2b8d52634a_invokedynamic100013_14(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_1b2b8d52634a_invokedynamic100013_17(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_1b2b8d52634a_invokedynamic100013_20(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_1b2b8d52634a_invokedynamic100013_23(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_1b2b8d52634a_invokedynamic100013_26(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_1b2b8d52634a_invokedynamic100013_29(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_1b2b8d52634a_invokedynamic100013_32(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_1b2b8d52634a_invokedynamic100013_35(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_1b2b8d52634a_invokedynamic100013_38(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_1b2b8d52634a_invokedynamic100013_41(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_1b2b8d52634a_invokedynamic100013_44(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_1b2b8d52634a_invokedynamic100013_47(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_1b2b8d52634a_invokedynamic100013_62(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_1b2b8d52634a_invokedynamic100013_65(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_1b2b8d52634a_invokedynamic100013_68(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_1b2b8d52634a_invokedynamic100013_70(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_1b2b8d52634a_invokedynamic100013_72(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_1b2b8d52634a_invokedynamic100013_75(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b64b34b3de76_invokedynamic100012_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b64b34b3de76_invokedynamic100012_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b64b34b3de76_invokedynamic100012_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b64b34b3de76_invokedynamic100012_13(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b64b34b3de76_invokedynamic100012_17(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b64b34b3de76_invokedynamic100012_21(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b64b34b3de76_invokedynamic100012_25(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b64b34b3de76_invokedynamic100012_29(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_80910f55e773_invokedynamic100010_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_80910f55e773_invokedynamic100010_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9eadaf50037f_invokedynamic100009_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9eadaf50037f_invokedynamic100009_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_43b73610d3d6_invokedynamic100015_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_43b73610d3d6_invokedynamic100015_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_184ec7702e11_invokedynamic100014_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_184ec7702e11_invokedynamic100014_3(int a0, long a1) throws E;
}
