package moom;


public class JH {

private static java.lang.String a;

private static java.lang.String b;

private static boolean c;

private static boolean d;

private static boolean e;

private static boolean f;

private static float g;

private static float h;

private static moom.DD i;

private static long j;

private static java.lang.String[] k;

private static java.lang.String[] l;

private static java.util.Map m;

public JH() {
super();
}


static {
j = ((long)(((moom._a)(moom._c.a(((long)(-2643908661594955652L)), ((long)(8945652868276740180L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(91393588229466L)))));
    long local9_life6 = (moom.JH.j ^ 102936662305972L);
    m = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life9;
    javax.crypto.Cipher __sourceSpill710_11 = (local0_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill710_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill710_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill710_14 = new byte[8];
    (__sourceSpill710_14)[0] = ((byte) ((int) (local9_life6 >>> 56)));
    int local1_life15 = 1;
    while ((local1_life15 < 8)) {
        (__sourceSpill710_14)[local1_life15] = ((byte) ((int) ((local9_life6 << (local1_life15 * 8)) >>> 56)));
        local1_life15 += 1;
    }
    byte[] __sourcePreallocation710_16 = __sourceSpill710_14;
    ((javax.crypto.Cipher)(__sourceSpill710_11)).init(((int)(__sourceSpill710_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill710_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation710_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local7_life19 = new java.lang.String[8];
    int local5_life20 = 0;
    java.lang.String local4_life21;
    int local6_life23 = ((java.lang.String)((local4_life21 = "íJ \000ý¾Z\030\013\016%°0'¹µèÍ=¹²óþ,q\n\021kVL\177íGåkÒ8ìÌóZúÇ8¥j°-³N\177\\j\017\021óv²p3\017É×Õ¶V0¦aÏôÛÉ-ðtb\027ÄHtÙ­ÿ\030ñ\"\033 \016r\025+´Óo:ÊÅ\005\021»\030È+Èu\023pT\032YëÈ\nÖWÌR\020\034Ýmn©2_8ö©nm_Ðç xÓJ\001S*\"|5Á\007\032e\177?ævà6ô\033\003D9\020¥ÞjZ, ¦ZùßòÙ2°"))).length();
    int local3_life24 = 40;
    int local2_life25 = -1;
    while (true) {
        local2_life25 += 1;
        byte[] __sourceSpill710_28 = ((java.lang.String)(((java.lang.String)(local4_life21)).substring(((int)(local2_life25)), ((int)((local2_life25 + local3_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill710_29 = local0_life9;
        byte[] local8_life31 = ((javax.crypto.Cipher)(__sourceSpill710_29)).doFinal(((byte[])(__sourceSpill710_28)));
        java.lang.String __sourceSpill710_34 = ((java.lang.String)(moom.JH.a(((byte[])(local8_life31))))).intern();
        java.lang.String[] __sourceSpill710_35 = local7_life19;
        int __sourceSpill710_36 = local5_life20;
        local5_life20 += 1;
        (__sourceSpill710_35)[__sourceSpill710_36] = __sourceSpill710_34;
        if (!(((local2_life25 = (local2_life25 + local3_life24)) < local6_life23))) { break; }
        local3_life24 = ((java.lang.String)(local4_life21)).charAt(((int)(local2_life25)));
    }
    local6_life23 = ((java.lang.String)((local4_life21 = ")$%ÅÏÒØÏ\002Î\013dã=ôr(ÚÏiWG);s©ÁéqìCîM\0048¼x¼\035P÷ÁØ{LÖ{¾´ãC~o]ê¹jñcã£9ð.[£9\025ûÓÕÏ\025cPRgêEa[-Új"))).length();
    local3_life24 = 40;
    local2_life25 = -1;
    while (true) {
        local2_life25 += 1;
        byte[] __sourceSpill710_42 = ((java.lang.String)(((java.lang.String)(local4_life21)).substring(((int)(local2_life25)), ((int)((local2_life25 + local3_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill710_43 = local0_life9;
        byte[] local8_life45 = ((javax.crypto.Cipher)(__sourceSpill710_43)).doFinal(((byte[])(__sourceSpill710_42)));
        java.lang.String __sourceSpill710_48 = ((java.lang.String)(moom.JH.a(((byte[])(local8_life45))))).intern();
        java.lang.String[] __sourceSpill710_49 = local7_life19;
        int __sourceSpill710_50 = local5_life20;
        local5_life20 += 1;
        (__sourceSpill710_49)[__sourceSpill710_50] = __sourceSpill710_48;
        if (!(((local2_life25 = (local2_life25 + local3_life24)) < local6_life23))) { break; }
        local3_life24 = ((java.lang.String)(local4_life21)).charAt(((int)(local2_life25)));
    }
    k = ((java.lang.String[])(local7_life19));
    l = ((java.lang.String[])(new java.lang.String[8]));
    a = ((java.lang.String)(null));
    b = ((java.lang.String)(null));
    c = ((boolean)(false));
    d = ((boolean)(false));
    e = ((boolean)(false));
    f = ((boolean)(false));
    i = ((moom.DD)(new moom.DD(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite710_61(16454, (6553377155299727235L ^ local9_life6)))));
}

private static native <E extends Throwable> boolean __sourceHandlerCall_75eef30638cfb4f3d924(moom.DD a0) throws E;
private static final class __SourceHandler_75eef30638cfb4f3d924 {

public static boolean f661(moom.DD p0) throws Throwable {
    java.lang.String forwardValue661_12_0;
    int forwardValue661_18_0;
    int forwardValue661_20_0;
    java.lang.String spill661_0;
    boolean spill661_1;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_20: {
    forward_join_19: {
    forward_join_18: {
    forward_join_12: {
    life1_3 = (__fieldRead661_0() ^ 34104652841366L);
    life3_5 = __call661_1();
    spill661_0 = __fieldRead661_2();
    if (!((life3_5 != null))) {
        forwardValue661_12_0 = spill661_0;
        break forward_join_12;
    }
    if (!((spill661_0 != null))) {
        break forward_join_19;
    }
    forwardValue661_12_0 = __call661_3(p0);
    }
    spill661_1 = __call661_5(forwardValue661_12_0, __fieldRead661_4());
    if (!((life3_5 != null))) {
        forwardValue661_18_0 = __integerCategory661_6(spill661_1);
        break forward_join_18;
    }
    if (!(spill661_1)) {
        break forward_join_19;
    }
    forwardValue661_18_0 = 1;
    }
    forwardValue661_20_0 = forwardValue661_18_0;
    break forward_join_20;
    }
    forwardValue661_20_0 = 0;
    }
    return __integerCategory661_7(forwardValue661_20_0);
}
public static void h661_0(moom.Oo p0) throws Throwable {
    throw __call1066100_0(p0);
}
public static void h661_1(moom.Oo p0) throws Throwable {
    throw __call1066101_0(p0);
}
public static void h661_2(moom.Oo p0) throws Throwable {
    throw __call1066102_0(p0);
}
private static native long __fieldRead661_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call661_1() throws Throwable;
private static native java.lang.String __fieldRead661_2() throws Throwable;
private static native java.lang.String __call661_3(moom.DD a0) throws Throwable;
private static native java.lang.String __fieldRead661_4() throws Throwable;
private static native boolean __call661_5(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory661_6(boolean value) throws Throwable;
private static native boolean __integerCategory661_7(int value) throws Throwable;
private static native java.lang.Exception __call1066100_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1066101_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1066102_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_0a734fc91b7b5d935153(moom.DD a0, moom.n6 a1) throws E;
private static final class __SourceHandler_0a734fc91b7b5d935153 {

public static void f662(moom.DD p0, moom.n6 p1) throws Throwable {
    moom.n6 forwardValue662_16_0;
    java.lang.String forwardValue662_24_0;
    int forwardValue662_40_0;
    java.lang.String forwardValue662_59_0;
    java.lang.String forwardValue662_59_1;
    moom.n6 spill662_0;
    java.lang.String spill662_1;
    boolean spill662_2;
    java.lang.String spill662_3;
    java.lang.String spill662_4;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    java.lang.String life5_39;
    java.lang.String life6_90;
    moom.DD life7_97;
    forward_join_74: {
    forward_join_59: {
    forward_join_46: {
    forward_join_40: {
    forward_join_24: {
    forward_join_16: {
    life2_3 = (__fieldRead662_0() ^ 39114222686434L);
    life4_5 = __call662_1();
    if (!((p0 != null))) {
        break forward_join_74;
    }
    spill662_0 = p1;
    if (!((life4_5 != null))) {
        forwardValue662_16_0 = spill662_0;
        break forward_join_16;
    }
    if (!((spill662_0 != null))) {
        break forward_join_74;
    }
    __fieldWrite662_2(p1, 0);
    forwardValue662_16_0 = p1;
    }
    __fieldWrite662_3(forwardValue662_16_0, null);
    spill662_1 = __fieldRead662_4();
    if (!((life4_5 != null))) {
        forwardValue662_24_0 = spill662_1;
        break forward_join_24;
    }
    if (!((spill662_1 != null))) {
        break forward_join_74;
    }
    forwardValue662_24_0 = __call662_5(p0);
    }
    life5_39 = forwardValue662_24_0;
    spill662_2 = __call662_7(life5_39, __invokedynamic662_6(743, (1821571155571157360L ^ life2_3)));
    if (!((life4_5 != null))) {
        forwardValue662_40_0 = __integerCategory662_8(spill662_2);
        break forward_join_40;
    }
    if (!(spill662_2)) {
        break forward_join_74;
    }
    spill662_3 = life5_39;
    spill662_4 = __fieldRead662_9();
    if (!((life4_5 != null))) {
        forwardValue662_59_0 = spill662_3;
        forwardValue662_59_1 = spill662_4;
        break forward_join_59;
    }
    forwardValue662_40_0 = __integerCategory662_11(__call662_10(spill662_3, spill662_4));
    }
    if (!((forwardValue662_40_0 != 0))) {
        break forward_join_46;
    }
    __fieldWrite662_12(p1, 1);
    if (!((life4_5 == null))) {
        break forward_join_74;
    }
    }
    forwardValue662_59_0 = __call662_16(life5_39, 0, (__call662_13(life5_39) - __call662_15(__invokedynamic662_14(4905, (6434641944420464824L ^ life2_3)))));
    forwardValue662_59_1 = __fieldRead662_17();
    }
    life6_90 = __invokedynamic662_18(forwardValue662_59_0, forwardValue662_59_1);
    life7_97 = new moom.DD(__call662_19(p0), life6_90);
    if (!(__call662_20(life7_97))) {
        break forward_join_74;
    }
    __fieldWrite662_21(p1, life7_97);
    }
    return;
}
public static void h662_0(moom.Oo p0) throws Throwable {
    throw __call1066200_0(p0);
}
public static void h662_1(moom.Oo p0) throws Throwable {
    throw __call1066201_0(p0);
}
public static void h662_2(moom.Oo p0) throws Throwable {
    throw __call1066202_0(p0);
}
public static void h662_3(moom.Oo p0) throws Throwable {
    throw __call1066203_0(p0);
}
public static void h662_4(moom.Oo p0) throws Throwable {
    throw __call1066204_0(p0);
}
public static void h662_5(moom.Oo p0) throws Throwable {
    throw __call1066205_0(p0);
}
public static void h662_6(moom.Oo p0) throws Throwable {
    throw __call1066206_0(p0);
}
public static void h662_7(moom.Oo p0) throws Throwable {
    throw __call1066207_0(p0);
}
public static void h662_8(moom.Oo p0) throws Throwable {
    throw __call1066208_0(p0);
}
public static void h662_9(moom.Oo p0) throws Throwable {
    throw __call1066209_0(p0);
}
public static void h662_10(moom.Oo p0) throws Throwable {
    throw __call1066210_0(p0);
}
private static native long __fieldRead662_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call662_1() throws Throwable;
private static native void __fieldWrite662_2(moom.n6 a0, int a1) throws Throwable;
private static native void __fieldWrite662_3(moom.n6 a0, java.lang.Object a1) throws Throwable;
private static native java.lang.String __fieldRead662_4() throws Throwable;
private static native java.lang.String __call662_5(moom.DD a0) throws Throwable;
private static native java.lang.String __invokedynamic662_6(int a0, long a1) throws Throwable;
private static native boolean __call662_7(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory662_8(boolean value) throws Throwable;
private static native java.lang.String __fieldRead662_9() throws Throwable;
private static native boolean __call662_10(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory662_11(boolean value) throws Throwable;
private static native void __fieldWrite662_12(moom.n6 a0, int a1) throws Throwable;
private static native int __call662_13(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic662_14(int a0, long a1) throws Throwable;
private static native int __call662_15(java.lang.String a0) throws Throwable;
private static native java.lang.String __call662_16(java.lang.String a0, int a1, int a2) throws Throwable;
private static native java.lang.String __fieldRead662_17() throws Throwable;
private static native java.lang.String __invokedynamic662_18(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call662_19(moom.DD a0) throws Throwable;
private static native boolean __call662_20(moom.DD a0) throws Throwable;
private static native void __fieldWrite662_21(moom.n6 a0, moom.DD a1) throws Throwable;
private static native java.lang.Exception __call1066200_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1066201_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1066202_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1066203_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1066204_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1066205_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1066206_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1066207_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1066208_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1066209_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1066210_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.client.renderer.texture.ITextureObject __sourceHandlerCall_218de6c69bc56f2ed0fe(net.minecraft.client.renderer.texture.ITextureObject a0, java.util.Map a1) throws E;
private static final class __SourceHandler_218de6c69bc56f2ed0fe {

public static net.minecraft.client.renderer.texture.ITextureObject f36(net.minecraft.client.renderer.texture.ITextureObject p0, java.util.Map p1) throws Throwable {
    int forestValue36_16_0;
    net.minecraft.client.renderer.texture.ITextureObject forestValue36_23_0;
    java.lang.Object forestValue36_44_0;
    net.minecraft.client.renderer.texture.ITextureObject forestValue36_63_0;
    boolean spill36_0;
    net.minecraft.client.renderer.texture.ITextureObject spill36_1;
    moom.DD spill36_2;
    net.minecraft.client.renderer.texture.ITextureObject spill36_3;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    moom.n6 life5_25;
    moom.DD life6_34;
    net.minecraft.client.renderer.texture.ITextureObject life7_62;
    net.minecraft.client.renderer.texture.TextureManager life8_76;
    forest_join_63: {
    forest_join_62: {
    forest_join_44: {
    forest_join_41: {
    forest_join_35: {
    forest_join_33: {
    forest_join_24: {
    forest_join_23: {
    forest_join_22: {
    forest_join_16: {
    forest_join_12: {
    life2_3 = (__fieldRead36_0() ^ 123451215066104L);
    life4_5 = __call36_1();
    spill36_0 = __fieldRead36_2();
    if (!((life4_5 != null))) {
        forestValue36_16_0 = __integerCategory36_3(spill36_0);
        break forest_join_16;
    }
    if (!((!spill36_0))) {
        break forest_join_12;
    }
    return p0;
    }
    spill36_1 = p0;
    if (!((life4_5 != null))) {
        forestValue36_23_0 = spill36_1;
        break forest_join_23;
    }
    forestValue36_16_0 = __instanceOf36_4(spill36_1);
    }
    if (!((forestValue36_16_0 != 0))) {
        break forest_join_22;
    }
    life5_25 = __cast36_5(p0);
    if (!((life4_5 == null))) {
        break forest_join_24;
    }
    }
    forestValue36_23_0 = p0;
    }
    return forestValue36_23_0;
    }
    life6_34 = __fieldRead36_6(life5_25);
    if (!((!__fieldRead36_7()))) {
        break forest_join_35;
    }
    if (!((life6_34 != null))) {
        break forest_join_33;
    }
    __fieldWrite36_8(1);
    }
    return p0;
    }
    spill36_2 = life6_34;
    if (!((life4_5 != null))) {
        forestValue36_44_0 = spill36_2;
        break forest_join_44;
    }
    if (!((spill36_2 == null))) {
        break forest_join_41;
    }
    life6_34 = __fieldRead36_9();
    }
    forestValue36_44_0 = __call36_10(p1, life6_34);
    }
    life7_62 = __cast36_11(forestValue36_44_0);
    spill36_3 = life7_62;
    if (!((life4_5 != null))) {
        forestValue36_63_0 = spill36_3;
        break forest_join_63;
    }
    if (!((spill36_3 == null))) {
        break forest_join_62;
    }
    life7_62 = new moom.n6(life6_34);
    life8_76 = __call36_12();
    __call36_13(life8_76, life6_34, life7_62);
    }
    forestValue36_63_0 = life7_62;
    }
    return forestValue36_63_0;
}
public static net.minecraft.client.renderer.texture.ITextureObject h36_0(moom.Oo p0) throws Throwable {
    throw __call3003600_0(p0);
}
public static net.minecraft.client.renderer.texture.ITextureObject h36_1(moom.Oo p0) throws Throwable {
    throw __call3003601_0(p0);
}
public static net.minecraft.client.renderer.texture.ITextureObject h36_2(moom.Oo p0) throws Throwable {
    throw __call3003602_0(p0);
}
public static net.minecraft.client.renderer.texture.ITextureObject h36_3(moom.Oo p0) throws Throwable {
    throw __call3003603_0(p0);
}
public static net.minecraft.client.renderer.texture.ITextureObject h36_4(moom.Oo p0) throws Throwable {
    throw __call3003604_0(p0);
}
public static net.minecraft.client.renderer.texture.ITextureObject h36_5(moom.Oo p0) throws Throwable {
    throw __call3003605_0(p0);
}
public static net.minecraft.client.renderer.texture.ITextureObject h36_6(moom.Oo p0) throws Throwable {
    throw __call3003606_0(p0);
}
public static net.minecraft.client.renderer.texture.ITextureObject h36_7(moom.Oo p0) throws Throwable {
    throw __call3003607_0(p0);
}
private static native long __fieldRead36_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call36_1() throws Throwable;
private static native boolean __fieldRead36_2() throws Throwable;
private static native int __integerCategory36_3(boolean value) throws Throwable;
private static native int __instanceOf36_4(net.minecraft.client.renderer.texture.ITextureObject a0) throws Throwable;
private static native moom.n6 __cast36_5(net.minecraft.client.renderer.texture.ITextureObject a0) throws Throwable;
private static native moom.DD __fieldRead36_6(moom.n6 a0) throws Throwable;
private static native boolean __fieldRead36_7() throws Throwable;
private static native void __fieldWrite36_8(int a0) throws Throwable;
private static native moom.DD __fieldRead36_9() throws Throwable;
private static native java.lang.Object __call36_10(java.util.Map a0, moom.DD a1) throws Throwable;
private static native net.minecraft.client.renderer.texture.ITextureObject __cast36_11(java.lang.Object a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureManager __call36_12() throws Throwable;
private static native boolean __call36_13(net.minecraft.client.renderer.texture.TextureManager a0, moom.DD a1, net.minecraft.client.renderer.texture.ITextureObject a2) throws Throwable;
private static native java.lang.Exception __call3003600_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3003601_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3003602_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3003603_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3003604_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3003605_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3003606_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3003607_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_bc3d258655456e45cc40() throws E;
private static final class __SourceHandler_bc3d258655456e45cc40 {

public static void f295() throws Throwable {
    net.minecraft.entity.Entity[] spill295_0;
    java.lang.String spill295_1;
    java.lang.String joinValue295_2_0;
    long life0_3;
    net.minecraft.entity.Entity[] life2_11;
    java.lang.String life3_19;
    moom.DD life4_24;
    java.io.InputStream life5_27;
    moom.OH life6_48;
    life0_3 = (__fieldRead295_0() ^ 17833297366882L);
    __fieldWrite295_1(0);
    __fieldWrite295_2(null);
    spill295_0 = __call295_3();
    __fieldWrite295_4(null);
    life2_11 = spill295_0;
    if (__call295_5()) {
        life3_19 = __invokedynamic295_6(8689, (8596547610194482660L ^ life0_3));
        life4_24 = new moom.DD(life3_19);
        life5_27 = __call295_7(life4_24);
        if ((life2_11 != null)) {
        if ((life5_27 == null)) {
        return;
    }
        java.lang.String __stackOp295_9_0 = life3_19;
        java.lang.String __stackOp295_9_1 = __invokedynamic295_8(4275, (4639731995301455011L ^ life0_3));
        __call295_11(__invokedynamic295_10(__stackOp295_9_1, __stackOp295_9_0));
    } else {
        
    }
        life6_48 = new moom.OH();
        __call295_12(life6_48, life5_27);
        __call295_13(life5_27);
        __fieldWrite295_16(__call295_15(life6_48, __invokedynamic295_14(10514, (1155219316443880708L ^ life0_3))));
        spill295_1 = __fieldRead295_17();
        if ((life2_11 != null)) {
        if ((spill295_1 != null)) {
        __fieldWrite295_21(__invokedynamic295_20(__fieldRead295_18(), __invokedynamic295_19(4905, (6434592095587084088L ^ life0_3))));
    } else {
        
    }
        joinValue295_2_0 = __fieldRead295_22();
    } else {
        joinValue295_2_0 = spill295_1;
    }
        __fieldWrite295_23(((joinValue295_2_0 != null) ? 1 : 0));
    } else {
        
    }
    return;
}
public static void h295_0(java.io.FileNotFoundException p0) throws Throwable {
    throw __call3029500_0(p0);
}
public static void h295_1(java.io.FileNotFoundException p0) throws Throwable {
    throw __call3029501_0(p0);
}
public static void h295_2(java.io.FileNotFoundException p0) throws Throwable {
    throw __call3029502_0(p0);
}
public static void h295_3(java.io.FileNotFoundException p0) throws Throwable {
    throw __call3029503_0(p0);
}
public static void h295_4(java.io.FileNotFoundException p0, java.lang.String p1) throws Throwable {
    java.io.FileNotFoundException life1_2;
    life1_2 = p0;
    return;
}
public static void h295_5(java.io.IOException p0, java.lang.String p1) throws Throwable {
    java.io.IOException life1_2;
    life1_2 = p0;
    __call3029505_0(life1_2);
    return;
}
private static native long __fieldRead295_0() throws Throwable;
private static native void __fieldWrite295_1(int a0) throws Throwable;
private static native void __fieldWrite295_2(java.lang.Object a0) throws Throwable;
private static native net.minecraft.entity.Entity[] __call295_3() throws Throwable;
private static native void __fieldWrite295_4(java.lang.Object a0) throws Throwable;
private static native boolean __call295_5() throws Throwable;
private static native java.lang.String __invokedynamic295_6(int a0, long a1) throws Throwable;
private static native java.io.InputStream __call295_7(moom.DD a0) throws Throwable;
private static native java.lang.String __invokedynamic295_8(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic295_10(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call295_11(java.lang.String a0) throws Throwable;
private static native void __call295_12(moom.OH a0, java.io.InputStream a1) throws Throwable;
private static native void __call295_13(java.io.InputStream a0) throws Throwable;
private static native java.lang.String __invokedynamic295_14(int a0, long a1) throws Throwable;
private static native java.lang.String __call295_15(moom.OH a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite295_16(java.lang.String a0) throws Throwable;
private static native java.lang.String __fieldRead295_17() throws Throwable;
private static native java.lang.String __fieldRead295_18() throws Throwable;
private static native java.lang.String __invokedynamic295_19(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic295_20(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite295_21(java.lang.String a0) throws Throwable;
private static native java.lang.String __fieldRead295_22() throws Throwable;
private static native void __fieldWrite295_23(int a0) throws Throwable;
private static native java.lang.Exception __call3029500_0(java.io.FileNotFoundException a0) throws Throwable;
private static native java.lang.Exception __call3029501_0(java.io.FileNotFoundException a0) throws Throwable;
private static native java.lang.Exception __call3029502_0(java.io.FileNotFoundException a0) throws Throwable;
private static native java.lang.Exception __call3029503_0(java.io.FileNotFoundException a0) throws Throwable;
private static native void __call3029505_0(java.io.IOException a0) throws Throwable;

}


public static void b() {
g = ((float)(net.minecraft.client.renderer.OpenGlHelper.T));
    h = ((float)(net.minecraft.client.renderer.OpenGlHelper.U));
    net.minecraft.client.renderer.OpenGlHelper.a(((int)(net.minecraft.client.renderer.OpenGlHelper.r)), ((float)(0x1.ep7f)), ((float)(moom.JH.h)));
    f = ((boolean)(true));
    return;
}


public static boolean b__Boolean() {
return ((((moom.JH.e) ? 1 : 0)) != 0);
}


private static void b(java.lang.String p0) {
long local1_life2 = (moom.JH.j ^ 85583565781155L);
    java.lang.String __stackOp521_5_0 = p0;
    java.lang.String __stackOp521_5_1 = __sourceIntrinsic_d1c1922d1ba0_originalDynamicSite521_4(11227, (2510718995706783752L ^ local1_life2));
    moom.BU.c(((java.lang.String)(__sourceIntrinsic_d1c1922d1ba0_originalDynamicSite521_6(__stackOp521_5_1, __stackOp521_5_0))));
    return;
}


public static void e() { __sourceHandlerCall_bc3d258655456e45cc40(); }


public static void c() {
f = ((boolean)(false));
    net.minecraft.client.renderer.OpenGlHelper.a(((int)(net.minecraft.client.renderer.OpenGlHelper.r)), ((float)(moom.JH.g)), ((float)(moom.JH.h)));
    return;
}


public static void d() {
d = ((boolean)(false));
    e = ((boolean)(false));
    return;
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.JH.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral5107_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/JH"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public static void a(moom.DD p0, moom.n6 p1) { __sourceHandlerCall_0a734fc91b7b5d935153(p0, p1); }


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 3758);
    if (((moom.JH.l)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.JH.m)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.JH.m)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/JH", life9_51);
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
        life9_116 = ((java.lang.String)((moom.JH.k)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.JH.l)[life5_8] = moom.JH.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.JH.l)[life5_8];
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
        byte[] spill2649_0 = p0;
        life4_9 += 1;
        life5_44 = (spill2649_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill2649_1 = p0;
        life4_9 += 1;
        life5_76 = (spill2649_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill2649_2 = p0;
        life4_9 += 1;
        life5_91 = (spill2649_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


public static boolean a__Boolean() {
return ((((moom.JH.c) ? 1 : 0)) != 0);
}


public static java.lang.String a() {
return moom.JH.a;
}


public static void a__Void() {
d = ((boolean)(true));
    e = ((boolean)(false));
    return;
}


public static net.minecraft.client.renderer.texture.ITextureObject a(net.minecraft.client.renderer.texture.ITextureObject p0, java.util.Map<moom.DD, net.minecraft.client.renderer.texture.ITextureObject> p1) { return __sourceHandlerCall_218de6c69bc56f2ed0fe(p0, p1); }


private static void a(java.lang.String p0) {
long local1_life2 = (moom.JH.j ^ 79073047143175L);
    java.lang.String __stackOp520_5_0 = p0;
    java.lang.String __stackOp520_5_1 = __sourceIntrinsic_474b89cf9bbb_originalDynamicSite520_4(20376, (3386619111004137L ^ local1_life2));
    moom.BU.b__Void(((java.lang.String)(__sourceIntrinsic_474b89cf9bbb_originalDynamicSite520_6(__stackOp520_5_1, __stackOp520_5_0))));
    return;
}


public static boolean a(moom.DD p0) { return __sourceHandlerCall_75eef30638cfb4f3d924(p0); }


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite710_61(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_474b89cf9bbb_originalDynamicSite520_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_474b89cf9bbb_originalDynamicSite520_6(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral5107_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_d1c1922d1ba0_originalDynamicSite521_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_d1c1922d1ba0_originalDynamicSite521_6(java.lang.String a0, java.lang.String a1) throws E;
}
