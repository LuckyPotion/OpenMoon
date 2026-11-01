package com.moon;


public class pi extends net.minecraft.client.gui.GuiScreen {

private static boolean w;

private imgui.glfw.ImGuiImplGlfw x;

private imgui.gl3.ImGuiImplGl3 y;

private com.moon.module.ModuleCategory z;

private java.util.Map<com.moon.module.ModuleCategory, java.util.List<com.moon.mo>> A;

private static long B;

private static java.lang.String[] C;

private static java.lang.String[] D;

private static java.util.Map E;

private static long F;

public pi() {
super();
    this.x = ((imgui.glfw.ImGuiImplGlfw)(new imgui.glfw.ImGuiImplGlfw()));
    this.y = ((imgui.gl3.ImGuiImplGl3)(new imgui.gl3.ImGuiImplGl3()));
    this.z = ((com.moon.module.ModuleCategory)(com.moon.module.ModuleCategory.COMBAT));
    this.A = ((java.util.Map)(new java.util.HashMap()));
    return;
}


static {
B = ((long)(((moom._a)(moom._c.a(((long)(1575889126687459149L)), ((long)(-7099081820481269643L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(104784052230736L)))));
    E = ((java.util.Map)(new java.util.HashMap(13)));
    long local5_life7 = (com.moon.pi.B ^ 96305027658394L);
    javax.crypto.Cipher local7_life9;
    javax.crypto.Cipher __sourceSpill375_11 = (local7_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill375_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill375_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill375_14 = new byte[8];
    (__sourceSpill375_14)[0] = ((byte) ((int) (local5_life7 >>> 56)));
    int local8_life15 = 1;
    while ((local8_life15 < 8)) {
        (__sourceSpill375_14)[local8_life15] = ((byte) ((int) ((local5_life7 << (local8_life15 * 8)) >>> 56)));
        local8_life15 += 1;
    }
    byte[] __sourcePreallocation375_16 = __sourceSpill375_14;
    ((javax.crypto.Cipher)(__sourceSpill375_11)).init(((int)(__sourceSpill375_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill375_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation375_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local14_life19 = new java.lang.String[4];
    int local12_life20 = 0;
    java.lang.String local11_life21;
    int local13_life23 = ((java.lang.String)((local11_life21 = "çâ\fÄ!¶\030±3ÞðÑ;AGË»Þ-G»x<\033áçY\032Å\020\035xSG\026\006ÜÙ\002n¦##»Þ"))).length();
    int local10_life24 = 32;
    int local9_life25 = -1;
    while (true) {
        local9_life25 += 1;
        byte[] __sourceSpill375_28 = ((java.lang.String)(((java.lang.String)(local11_life21)).substring(((int)(local9_life25)), ((int)((local9_life25 + local10_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill375_29 = local7_life9;
        byte[] local15_life31 = ((javax.crypto.Cipher)(__sourceSpill375_29)).doFinal(((byte[])(__sourceSpill375_28)));
        java.lang.String __sourceSpill375_34 = ((java.lang.String)(com.moon.pi.a(((byte[])(local15_life31))))).intern();
        java.lang.String[] __sourceSpill375_35 = local14_life19;
        int __sourceSpill375_36 = local12_life20;
        local12_life20 += 1;
        (__sourceSpill375_35)[__sourceSpill375_36] = __sourceSpill375_34;
        if (!(((local9_life25 = (local9_life25 + local10_life24)) < local13_life23))) { break; }
        local10_life24 = ((java.lang.String)(local11_life21)).charAt(((int)(local9_life25)));
    }
    local13_life23 = ((java.lang.String)((local11_life21 = "\003®Òô á§Fw9F\"ä_ÔÙ\017} \005ð\017\032Ò\rQÊF¯7'[ÚJ|'\002\b(õ\004ú\020±m¢ç\033"))).length();
    local10_life24 = 24;
    local9_life25 = -1;
    while (true) {
        local9_life25 += 1;
        byte[] __sourceSpill375_41 = ((java.lang.String)(((java.lang.String)(local11_life21)).substring(((int)(local9_life25)), ((int)((local9_life25 + local10_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill375_42 = local7_life9;
        byte[] local15_life44 = ((javax.crypto.Cipher)(__sourceSpill375_42)).doFinal(((byte[])(__sourceSpill375_41)));
        java.lang.String __sourceSpill375_47 = ((java.lang.String)(com.moon.pi.a(((byte[])(local15_life44))))).intern();
        java.lang.String[] __sourceSpill375_48 = local14_life19;
        int __sourceSpill375_49 = local12_life20;
        local12_life20 += 1;
        (__sourceSpill375_48)[__sourceSpill375_49] = __sourceSpill375_47;
        if (!(((local9_life25 = (local9_life25 + local10_life24)) < local13_life23))) { break; }
        local10_life24 = ((java.lang.String)(local11_life21)).charAt(((int)(local9_life25)));
    }
    C = ((java.lang.String[])(local14_life19));
    D = ((java.lang.String[])(new java.lang.String[4]));
    javax.crypto.Cipher local0_life54;
    javax.crypto.Cipher __sourceSpill375_56 = (local0_life54 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill375_57 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill375_58 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill375_59 = new byte[8];
    (__sourceSpill375_59)[0] = ((byte) ((int) (local5_life7 >>> 56)));
    int local1_life60 = 1;
    while ((local1_life60 < 8)) {
        (__sourceSpill375_59)[local1_life60] = ((byte) ((int) ((local5_life7 << (local1_life60 * 8)) >>> 56)));
        local1_life60 += 1;
    }
    byte[] __sourcePreallocation375_61 = __sourceSpill375_59;
    ((javax.crypto.Cipher)(__sourceSpill375_56)).init(((int)(__sourceSpill375_57)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill375_58)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation375_61)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local2_life64 = 5714448110017580901L;
    byte[] __sourceSpill375_65 = new byte[8];
    (__sourceSpill375_65)[0] = ((byte) ((int) (local2_life64 >>> 56)));
    (__sourceSpill375_65)[1] = ((byte) ((int) (local2_life64 >>> 48)));
    (__sourceSpill375_65)[2] = ((byte) ((int) (local2_life64 >>> 40)));
    (__sourceSpill375_65)[3] = ((byte) ((int) (local2_life64 >>> 32)));
    (__sourceSpill375_65)[4] = ((byte) ((int) (local2_life64 >>> 24)));
    (__sourceSpill375_65)[5] = ((byte) ((int) (local2_life64 >>> 16)));
    (__sourceSpill375_65)[6] = ((byte) ((int) (local2_life64 >>> 8)));
    (__sourceSpill375_65)[7] = ((byte) ((int) local2_life64));
    javax.crypto.Cipher __sourceSpill375_66 = local0_life54;
    byte[] local4_life68 = ((javax.crypto.Cipher)(__sourceSpill375_66)).doFinal(((byte[])(__sourceSpill375_65)));
    F = ((long)((((((((((((long) (local4_life68)[0]) & 255L) << 56) | ((((long) (local4_life68)[1]) & 255L) << 48)) | ((((long) (local4_life68)[2]) & 255L) << 40)) | ((((long) (local4_life68)[3]) & 255L) << 32)) | ((((long) (local4_life68)[4]) & 255L) << 24)) | ((((long) (local4_life68)[5]) & 255L) << 16)) | ((((long) (local4_life68)[6]) & 255L) << 8)) | (((long) (local4_life68)[7]) & 255L))));
}

private static native <E extends Throwable> byte[] __sourceHandlerCall_b308af9e65ad1720053d(com.moon.pi a0, java.lang.String a1) throws E;
private static final class __SourceHandler_b308af9e65ad1720053d {

public static byte[] f81(com.moon.pi receiver, java.lang.String p0) throws Throwable {
    return __call81_4(__call81_3(__call81_2(__call81_1(__call81_0(receiver), p0))));
}
public static byte[] h81_0(java.lang.Exception p0) throws Throwable {
    java.lang.Exception local1 = p0;
    throw new java.lang.RuntimeException(local1);
}
private static native java.lang.Class __call81_0(com.moon.pi a0) throws Throwable;
private static native java.net.URL __call81_1(java.lang.Class a0, java.lang.String a1) throws Throwable;
private static native java.net.URI __call81_2(java.net.URL a0) throws Throwable;
private static native java.nio.file.Path __call81_3(java.net.URI a0) throws Throwable;
private static native byte[] __call81_4(java.nio.file.Path a0) throws Throwable;

}


private void b() {
long local1_life2 = (com.moon.pi.B ^ 129157821645531L);
    imgui.ImGui.createContext();
    imgui.ImGuiIO local3_life5 = imgui.ImGui.getIO();
    ((imgui.ImFontAtlas)(((imgui.ImGuiIO)(local3_life5)).getFonts())).addFontFromMemoryTTF(((byte[])(((com.moon.pi)(this)).a(((java.lang.String)(__sourceIntrinsic_938da207dded_originalDynamicSite266_8(12818, (8116261420631003478L ^ local1_life2))))))), ((float)(0x1.e000000000000p+3F)));
    ((imgui.ImFontAtlas)(((imgui.ImGuiIO)(local3_life5)).getFonts())).build();
    ((imgui.glfw.ImGuiImplGlfw)(this.x)).init(((long)(org.lwjgl.opengl.Display.getWindow())), ((boolean)(true)));
    ((imgui.gl3.ImGuiImplGl3)(this.y)).init(((java.lang.String)(__sourceIntrinsic_938da207dded_originalDynamicSite266_19(15036, (2572052297125272059L ^ local1_life2)))));
    return;
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
        byte[] spill1552_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1552_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1552_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1552_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1552_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1552_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static java.lang.RuntimeException a(java.lang.RuntimeException p0) {
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 22647);
    if (((com.moon.pi.D)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.pi.E)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.pi.E)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/pi", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.pi.C)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.pi.D)[life5_8] = __sourceExactCall_f4238a9ea5f26d(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.pi.D)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = __sourceExactCall_1bbdf56edb22aa(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public void a() {
int lexicalValue370_13_0;
    boolean spill370_0;
    long life1_3;
    int[] life3_5;
    imgui.ImGuiStyle life4_21;
    com.moon.module.ModuleCategory[] life5_48;
    int life6_51;
    int life7_53;
    com.moon.module.ModuleCategory life8_60;
    lexical_join_71: {
    lexical_join_66: {
    lexical_join_14: {
    lexical_join_13: {
    life1_3 = (com.moon.pi.B ^ 92865659734989L);
    life3_5 = com.moon.e2.b__ArrayInt();
    spill370_0 = com.moon.pi.w;
    if (!((life3_5 != null))) {
        lexicalValue370_13_0 = ((spill370_0) ? 1 : 0);
        break lexical_join_13;
    }
    if (!((!spill370_0))) {
        break lexical_join_14;
    }
    ((com.moon.pi)(this)).b();
    lexicalValue370_13_0 = 1;
    }
    w = ((boolean)__sourceIntrinsic_integerToBoolean((lexicalValue370_13_0)));
    }
    life4_21 = imgui.ImGui.getStyle();
    ((imgui.ImGuiStyle)(life4_21)).setWindowMinSize(((float)(0x1.13p9f)), ((float)(0x1.2cp9f)));
    ((imgui.ImGuiStyle)(life4_21)).setFrameRounding(((float)(0x1.0p1f)));
    ((imgui.ImGuiStyle)(life4_21)).setWindowRounding(((float)(0x1.0p3f)));
    ((imgui.ImGuiStyle)(life4_21)).setWindowBorderSize(((float)(0x0.0p0f)));
    ((imgui.ImGuiStyle)(life4_21)).setPopupBorderSize(((float)(0x0.0p0f)));
    ((imgui.ImGuiStyle)(life4_21)).setAntiAliasedFill(((boolean)(true)));
    ((imgui.ImGuiStyle)(life4_21)).setAntiAliasedLines(((boolean)(true)));
    ((java.util.Map)(this.A)).clear();
    life5_48 = com.moon.module.ModuleCategory.values();
    life6_51 = (life5_48).length;
    life7_53 = 0;
    lexical_cycle_48: while (true) {
    if (!((life7_53 < life6_51))) {
        break lexical_join_66;
    }
    life8_60 = (life5_48)[life7_53];
    ((java.util.List)(((com.moon.fU)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__fU())).a(((com.moon.module.ModuleCategory)(life8_60))))).forEach(((java.util.function.Consumer)(__sourceIntrinsic_2c8ae721fed4_invokedynamic370_20(this, life8_60))));
    life7_53 += 1;
    if (!((life3_5 == null))) { continue lexical_cycle_48; }
    break lexical_cycle_48;
    }
    }
    if (!((net.minecraft.entity.Entity.b__ArrayString() != null))) {
        break lexical_join_71;
    }
    com.moon.e2.b(((int[])(new int[1])));
    }
    return;
}


private byte[] a(java.lang.String p0) { return __sourceHandlerCall_b308af9e65ad1720053d(this, p0); }


public void a(int p0, int p1, float p2) {
java.lang.Object lexicalValue371_73_0;
    int[] spill371_0;
    java.lang.String spill371_1;
    long life4_3;
    int[] life6_8;
    com.moon.module.ModuleCategory[] life7_28;
    int life8_31;
    int life9_33;
    com.moon.module.ModuleCategory life10_40;
    java.util.List life7_86;
    java.util.Iterator life8_96;
    com.moon.mo life9_103;
    lexical_join_102: {
    lexical_join_95: {
    lexical_join_73: {
    lexical_join_67: {
    life4_3 = (com.moon.pi.B ^ 131622502526745L);
    moom.kZ.u();
    spill371_0 = com.moon.e2.b__ArrayInt();
    moom.kZ.l();
    moom.kZ.c__Void();
    life6_8 = spill371_0;
    ((imgui.glfw.ImGuiImplGlfw)(this.x)).newFrame();
    imgui.ImGui.newFrame();
    imgui.ImGui.begin(((java.lang.String)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic371_8(32069, (4430819219132380098L ^ life4_3)))));
    imgui.ImGui.beginTabBar(((java.lang.String)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic371_10(19095, (1840703177307309075L ^ life4_3)))));
    life7_28 = com.moon.module.ModuleCategory.values();
    life8_31 = (life7_28).length;
    life9_33 = 0;
    lexical_cycle_34: while (true) {
    lexical_join_62: {
    lexical_join_60: {
    lexical_join_59: {
    if (!((life9_33 < life8_31))) {
        break lexical_join_67;
    }
    life10_40 = (life7_28)[life9_33];
    imgui.ImGui.pushID(((java.lang.String)(((com.moon.module.ModuleCategory)(life10_40)).name())));
    if (!((life6_8 != null))) {
        break lexical_join_62;
    }
    spill371_1 = ((com.moon.module.ModuleCategory)(life10_40)).b();
    if (!((life6_8 != null))) {
        lexicalValue371_73_0 = spill371_1;
        break lexical_join_73;
    }
    if (!(imgui.ImGui.beginTabItem(((java.lang.String)(spill371_1)), ((int)(((int) com.moon.pi.F)))))) {
        break lexical_join_60;
    }
    if (!(imgui.ImGui.isItemActive())) {
        break lexical_join_59;
    }
    this.z = ((com.moon.module.ModuleCategory)(life10_40));
    }
    imgui.ImGui.endTabItem();
    }
    imgui.ImGui.popID();
    life9_33 += 1;
    }
    if (!((life6_8 == null))) { continue lexical_cycle_34; }
    break lexical_cycle_34;
    }
    __sourceExactCall_6604345f74a40b(((java.lang.String[])(new java.lang.String[4])));
    }
    imgui.ImGui.endTabBar();
    lexicalValue371_73_0 = ((java.util.Map)(this.A)).get(((java.lang.Object)(this.z)));
    }
    life7_86 = ((java.util.List)(lexicalValue371_73_0));
    if (!((life6_8 != null))) {
        break lexical_join_102;
    }
    if (!((life7_86 != null))) {
        break lexical_join_95;
    }
    life8_96 = ((java.util.List)(life7_86)).iterator();
    lexical_cycle_82: while (true) {
    if (!(((java.util.Iterator)(life8_96)).hasNext())) {
        break lexical_join_95;
    }
    life9_103 = ((com.moon.mo)(((java.util.Iterator)(life8_96)).next()));
    ((com.moon.mo)(life9_103)).b();
    if (!((life6_8 != null))) {
        break lexical_join_102;
    }
    if (!((life6_8 == null))) { continue lexical_cycle_82; }
    break lexical_cycle_82;
    }
    }
    imgui.ImGui.end();
    imgui.ImGui.render();
    ((imgui.gl3.ImGuiImplGl3)(this.y)).renderDrawData(((imgui.ImDrawData)(imgui.ImGui.getDrawData())));
    moom.kZ.d__Void();
    }
    return;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral3249_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/pi"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private void lambda$init$1(com.moon.module.ModuleCategory p0, com.moon.module.Module p1) {
com.moon.mw local3 = new com.moon.mw(p1);
    ((com.moon.mo)(local3)).a();
    ((java.util.List)(((java.util.List)(((java.util.Map)(this.A)).computeIfAbsent(((java.lang.Object)(p0)), ((java.util.function.Function)(__sourceIntrinsic_6ad57f1b19b0_originalDynamicSite614_2()))))))).add(((java.lang.Object)(local3)));
    return;
}


private static java.util.List lambda$init$0(com.moon.module.ModuleCategory p0) {
return new java.util.ArrayList();
}


private static native <E extends Throwable> java.util.function.Consumer __sourceIntrinsic_2c8ae721fed4_invokedynamic370_20(com.moon.pi a0, com.moon.module.ModuleCategory a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_95e4e99d9b0c_invokedynamic371_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_95e4e99d9b0c_invokedynamic371_10(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral3249_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_938da207dded_originalDynamicSite266_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_938da207dded_originalDynamicSite266_19(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Function __sourceIntrinsic_6ad57f1b19b0_originalDynamicSite614_2() throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native java.lang.String __sourceExactCall_f4238a9ea5f26d(byte[] p0);
private static native java.lang.String __sourceExactCall_1bbdf56edb22aa(int p0, long p1);
private static native void __sourceExactCall_6604345f74a40b(java.lang.String[] p0);
}
