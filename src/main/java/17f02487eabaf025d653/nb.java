package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;






























































import net.minecraft.entity.Entity;
import java.util.Map;
import net.minecraft.util.EnumParticleTypes;
public class nb extends com.moon.m5 implements com.moon.nh {

private com.moon.nY n;

private java.util.List<com.moon.m5> o;

private com.moon.setting.SettingGroup p;

private boolean q;

private static long r;

private static long[] s;

private static java.lang.Integer[] t;

private static java.util.Map u;

private static long v;

public nb(com.moon.nh p0, com.moon.setting.SettingGroup p1, float p2, float p3, float p4, float p5) { super((com.moon.nh)null, 0.0F, 0.0F, 0.0F, 0.0F); }

private static void __sourceConstructorBody_33288cbb1a7e6cb0(com.moon.nb receiver, com.moon.nh p0, com.moon.setting.SettingGroup p1, float p2, float p3, float p4, float p5) throws Throwable {
long local7 = (com.moon.nb.r ^ 18726719776580L);
    com.moon.nb.__sourceConstructorInit_33288cbb1a7e6cb0_0(((com.moon.nb)(receiver)), ((com.moon.nh)(p0)), ((float)(p2)), ((float)(p3)), ((float)(p4)), ((float)(p5)));
    ((com.moon.nb)(receiver)).n = ((com.moon.nY)(new com.moon.nY(com.moon.nb.v, com.moon.cj.EASE_IN_OUT_CUBIC)));
    ((com.moon.nb)(receiver)).o = ((java.util.List)(new java.util.ArrayList()));
    ((com.moon.nb)(receiver)).p = ((com.moon.setting.SettingGroup)(p1));
    return;
}


static {
r = ((long)(((moom._a)(moom._c.a(((long)(4188845067513207852L)), ((long)(-3467447039997640860L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(107444222337663L)))));
    u = ((java.util.Map)(new java.util.HashMap(13)));
    long local5_life7 = (com.moon.nb.r ^ 118184106290385L);
    javax.crypto.Cipher local7_life9;
    javax.crypto.Cipher __sourceSpill310_11 = (local7_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill310_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill310_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill310_14 = new byte[8];
    (__sourceSpill310_14)[0] = ((byte) ((int) (local5_life7 >>> 56)));
    int local8_life15 = 1;
    while ((local8_life15 < 8)) {
        (__sourceSpill310_14)[local8_life15] = ((byte) ((int) ((local5_life7 << (local8_life15 * 8)) >>> 56)));
        local8_life15 += 1;
    }
    byte[] __sourcePreallocation310_16 = __sourceSpill310_14;
    ((javax.crypto.Cipher)(__sourceSpill310_11)).init(((int)(__sourceSpill310_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill310_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation310_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local13_life19 = new long[3];
    int local10_life20 = 0;
    java.lang.String local11_life21;
    int local12_life23 = ((java.lang.String)((local11_life21 = "~´«w*ãry$Ä¾Ð«¨ºénð²\004"))).length();
    int local9_life24 = 0;
    do {
        java.lang.String __sourceSpill310_25 = local11_life21;
        int __sourceSpill310_26 = local9_life24;
        local9_life24 += 8;
        byte[] local14_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill310_25)).substring(((int)(__sourceSpill310_26)), ((int)(local9_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill310_30 = local13_life19;
        int __sourceSpill310_31 = local10_life20;
        local10_life20 += 1;
        long local15_life32 = (((((((((((long) (local14_life29)[0]) & 255L) << 56) | ((((long) (local14_life29)[1]) & 255L) << 48)) | ((((long) (local14_life29)[2]) & 255L) << 40)) | ((((long) (local14_life29)[3]) & 255L) << 32)) | ((((long) (local14_life29)[4]) & 255L) << 24)) | ((((long) (local14_life29)[5]) & 255L) << 16)) | ((((long) (local14_life29)[6]) & 255L) << 8)) | (((long) (local14_life29)[7]) & 255L));
        byte[] __sourceSpill310_33 = new byte[8];
        (__sourceSpill310_33)[0] = ((byte) ((int) (local15_life32 >>> 56)));
        (__sourceSpill310_33)[1] = ((byte) ((int) (local15_life32 >>> 48)));
        (__sourceSpill310_33)[2] = ((byte) ((int) (local15_life32 >>> 40)));
        (__sourceSpill310_33)[3] = ((byte) ((int) (local15_life32 >>> 32)));
        (__sourceSpill310_33)[4] = ((byte) ((int) (local15_life32 >>> 24)));
        (__sourceSpill310_33)[5] = ((byte) ((int) (local15_life32 >>> 16)));
        (__sourceSpill310_33)[6] = ((byte) ((int) (local15_life32 >>> 8)));
        (__sourceSpill310_33)[7] = ((byte) ((int) local15_life32));
        javax.crypto.Cipher __sourceSpill310_34 = local7_life9;
        byte[] local17_life36 = ((javax.crypto.Cipher)(__sourceSpill310_34)).doFinal(((byte[])(__sourceSpill310_33)));
        (__sourceSpill310_30)[__sourceSpill310_31] = (((((((((((long) (local17_life36)[0]) & 255L) << 56) | ((((long) (local17_life36)[1]) & 255L) << 48)) | ((((long) (local17_life36)[2]) & 255L) << 40)) | ((((long) (local17_life36)[3]) & 255L) << 32)) | ((((long) (local17_life36)[4]) & 255L) << 24)) | ((((long) (local17_life36)[5]) & 255L) << 16)) | ((((long) (local17_life36)[6]) & 255L) << 8)) | (((long) (local17_life36)[7]) & 255L));
    } while ((!(local9_life24 >= local12_life23)));
    s = ((long[])(local13_life19));
    t = ((java.lang.Integer[])(new java.lang.Integer[3]));
    javax.crypto.Cipher local0_life40;
    javax.crypto.Cipher __sourceSpill310_42 = (local0_life40 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill310_43 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill310_44 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill310_45 = new byte[8];
    (__sourceSpill310_45)[0] = ((byte) ((int) (local5_life7 >>> 56)));
    int local1_life46 = 1;
    while ((local1_life46 < 8)) {
        (__sourceSpill310_45)[local1_life46] = ((byte) ((int) ((local5_life7 << (local1_life46 * 8)) >>> 56)));
        local1_life46 += 1;
    }
    byte[] __sourcePreallocation310_47 = __sourceSpill310_45;
    ((javax.crypto.Cipher)(__sourceSpill310_42)).init(((int)(__sourceSpill310_43)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill310_44)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation310_47)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local2_life50 = -7553961264576262855L;
    byte[] __sourceSpill310_51 = new byte[8];
    (__sourceSpill310_51)[0] = ((byte) ((int) (local2_life50 >>> 56)));
    (__sourceSpill310_51)[1] = ((byte) ((int) (local2_life50 >>> 48)));
    (__sourceSpill310_51)[2] = ((byte) ((int) (local2_life50 >>> 40)));
    (__sourceSpill310_51)[3] = ((byte) ((int) (local2_life50 >>> 32)));
    (__sourceSpill310_51)[4] = ((byte) ((int) (local2_life50 >>> 24)));
    (__sourceSpill310_51)[5] = ((byte) ((int) (local2_life50 >>> 16)));
    (__sourceSpill310_51)[6] = ((byte) ((int) (local2_life50 >>> 8)));
    (__sourceSpill310_51)[7] = ((byte) ((int) local2_life50));
    javax.crypto.Cipher __sourceSpill310_52 = local0_life40;
    byte[] local4_life54 = ((javax.crypto.Cipher)(__sourceSpill310_52)).doFinal(((byte[])(__sourceSpill310_51)));
    v = ((long)((((((((((((long) (local4_life54)[0]) & 255L) << 56) | ((((long) (local4_life54)[1]) & 255L) << 48)) | ((((long) (local4_life54)[2]) & 255L) << 40)) | ((((long) (local4_life54)[3]) & 255L) << 32)) | ((((long) (local4_life54)[4]) & 255L) << 24)) | ((((long) (local4_life54)[5]) & 255L) << 16)) | ((((long) (local4_life54)[6]) & 255L) << 8)) | (((long) (local4_life54)[7]) & 255L))));
}

private static native <E extends Throwable> void __sourceConstructorInit_33288cbb1a7e6cb0_0(com.moon.nb a0, com.moon.nh a1, float a2, float a3, float a4, float a5) throws E;

public void b(int p0, int p1) {
float lexicalValue304_47_0;
    int lexicalValue304_88_0;
    com.moon.m5 lexicalValue304_97_0;
    net.minecraft.entity.Entity[] spill304_0;
    float spill304_1;
    com.moon.m5 spill304_2;
    com.moon.m5 spill304_3;
    boolean spill304_4;
    com.moon.nb spill304_5;
    long life3_3;
    moom.ir life6_6;
    float life7_10;
    net.minecraft.entity.Entity[] life5_13;
    java.util.Iterator life8_17;
    com.moon.m5 life9_24;
    float life10_68;
    float life11_80;
    lexical_join_110: {
    lexical_join_100: {
    life3_3 = (com.moon.nb.r ^ 689344798298L);
    spill304_0 = net.minecraft.util.EnumParticleTypes.b__Arrayr3();
    life6_6 = com.moon.nS.a();
    life7_10 = ((float) ((moom.ir)(life6_6)).b__Int());
    ((com.moon.nb)(this)).d__sourceReturn_da8c82d5d4();
    life5_13 = spill304_0;
    life8_17 = ((java.util.List)(this.o)).iterator();
    lexical_cycle_18: while (true) {
    lexical_join_97: {
    lexical_join_96: {
    lexical_join_88: {
    lexical_join_80: {
    lexical_join_47: {
    lexical_join_46: {
    if (!(((java.util.Iterator)(life8_17)).hasNext())) {
        break lexical_join_100;
    }
    life9_24 = ((com.moon.m5)(((java.util.Iterator)(life8_17)).next()));
    if (!((life5_13 != null))) {
        break lexical_join_110;
    }
    spill304_1 = ((com.moon.m5)(life9_24)).e();
    if (!((life5_13 != null))) {
        lexicalValue304_47_0 = spill304_1;
        break lexical_join_47;
    }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(spill304_1)), ((float)(0x0.0p0f))) <= 0))) {
        break lexical_join_46;
    }
    spill304_2 = life9_24;
    if (!((life5_13 != null))) {
        lexicalValue304_97_0 = spill304_2;
        break lexical_join_97;
    }
    if (!(((com.moon.m5)(spill304_2)).c__Boolean())) {
        break lexical_join_96;
    }
    spill304_3 = life9_24;
    if (!((life5_13 != null))) {
        lexicalValue304_97_0 = spill304_3;
        break lexical_join_97;
    }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(((com.moon.m5)(spill304_3)).e())), ((float)(0x0.0p0f))) > 0))) {
        break lexical_join_96;
    }
    }
    lexicalValue304_47_0 = com.moon.m1.b;
    }
    life10_68 = lexicalValue304_47_0;
    life11_80 = ((((com.moon.m5)(life9_24)).b() / life7_10) * (life10_68 - (((com.moon.m5)(life9_24)).e() * life10_68)));
    spill304_4 = ((com.moon.nb)(this)).b__Boolean();
    if (!((life5_13 != null))) {
        lexicalValue304_88_0 = ((spill304_4) ? 1 : 0);
        break lexical_join_88;
    }
    if (!((!spill304_4))) {
        break lexical_join_80;
    }
    com.moon.hU.a(((float)(((com.moon.m5)(life9_24)).e())));
    com.moon.hU.a__Void();
    com.moon.hU.a(((float)(life10_68)), ((float)((((com.moon.m5)(life9_24)).e() * life10_68))), ((float)(0x1.0p0f)));
    com.moon.hU.b(((float)(0x0.0p0f)), ((float)(life11_80)), ((float)(0x0.0p0f)));
    }
    __sourceExactCall_e6c3ea18244f1b(((com.moon.m5)(life9_24)), ((int)(p0)), ((int)(p1)));
    spill304_5 = this;
    if (!((life5_13 != null))) {
        lexicalValue304_97_0 = spill304_5;
        break lexical_join_97;
    }
    lexicalValue304_88_0 = ((((com.moon.nb)(spill304_5)).b__Boolean()) ? 1 : 0);
    }
    if (!((lexicalValue304_88_0 == 0))) {
        break lexical_join_96;
    }
    com.moon.hU.d__Void();
    com.moon.hU.a__Void();
    com.moon.hU.a(((float)(life10_68)), ((float)(life10_68)), ((float)(0x1.0p0f)));
    com.moon.hU.b__Void();
    }
    lexicalValue304_97_0 = life9_24;
    }
    ((com.moon.m5)(lexicalValue304_97_0)).c__sourceReturn_da8c82d5d4();
    if (!((life5_13 == null))) { continue lexical_cycle_18; }
    break lexical_cycle_18;
    }
    }
    this.k = ((float)((0x1.5p4f + ((com.moon.nb)(this)).g())));
    __sourceExactCall_13d30826a82418(this, ((int)(p0)), ((int)(p1)));
    }
    return;
}


public void b(int p0, int p1, int p2) {
com.moon.m5 lexicalValue305_32_0;
    com.moon.nb lexicalValue305_39_0;
    com.moon.nb spill305_0;
    com.moon.m5 spill305_1;
    long life4_3;
    net.minecraft.entity.Entity[] life6_5;
    java.util.Iterator life7_17;
    com.moon.m5 life8_24;
    lexical_join_43: {
    lexical_join_39: {
    lexical_join_38: {
    life4_3 = (com.moon.nb.r ^ 93514073255097L);
    life6_5 = net.minecraft.util.EnumParticleTypes.b__Arrayr3();
    spill305_0 = this;
    if (!((life6_5 != null))) {
        lexicalValue305_39_0 = spill305_0;
        break lexical_join_39;
    }
    if (!(((com.moon.nb)(spill305_0)).q)) {
        break lexical_join_38;
    }
    life7_17 = ((java.util.List)(this.o)).iterator();
    lexical_cycle_15: while (true) {
    lexical_join_32: {
    lexical_join_31: {
    if (!(((java.util.Iterator)(life7_17)).hasNext())) {
        break lexical_join_38;
    }
    life8_24 = ((com.moon.m5)(((java.util.Iterator)(life7_17)).next()));
    if (!((life6_5 != null))) {
        break lexical_join_43;
    }
    spill305_1 = life8_24;
    if (!((life6_5 != null))) {
        lexicalValue305_32_0 = spill305_1;
        break lexical_join_32;
    }
    if (!((!((com.moon.m5)(spill305_1)).c__Boolean()))) {
        break lexical_join_31;
    }
    if (!((life6_5 == null))) { continue lexical_cycle_15; }
    }
    lexicalValue305_32_0 = life8_24;
    }
    __sourceExactCall_d2688b7bbb47bf(((com.moon.m5)(lexicalValue305_32_0)), ((int)(p0)), ((int)(p1)), ((int)(p2)));
    if (!((life6_5 == null))) { continue lexical_cycle_15; }
    break lexical_cycle_15;
    }
    }
    lexicalValue305_39_0 = this;
    }
    __sourceIntrinsic_d5f89f155b18_call305_10(lexicalValue305_39_0, p0, p1, p2);
    }
    return;
}


public boolean c__Boolean() {
return (__sourceIntrinsic_booleanComparison((((com.moon.setting.SettingGroup)(this.p)).isAvailable())) != 0);
}


public void c(int p0, int p1) {
int lexicalValue306_292_0;
    float lexicalValue306_294_0;
    int lexicalValue306_335_0;
    net.minecraft.entity.Entity[] spill306_0;
    float spill306_1;
    boolean spill306_2;
    float spill306_3;
    boolean spill306_4;
    long life3_3;
    float life6_8;
    float life7_14;
    float life8_19;
    com.moon.jm life9_24;
    com.moon.hW life10_29;
    com.moon.hW life11_34;
    com.moon.hW life12_41;
    net.minecraft.entity.Entity[] life5_73;
    com.moon.i3 life13_90;
    float life14_107;
    float life15_113;
    org.lwjgl.util.vector.Vector2f life16_125;
    org.lwjgl.util.vector.Vector2f life17_141;
    org.lwjgl.util.vector.Vector2f life18_157;
    org.lwjgl.util.vector.Vector2f life19_169;
    org.lwjgl.util.vector.Vector2f life20_177;
    org.lwjgl.util.vector.Vector2f life21_185;
    org.lwjgl.util.vector.Vector2f life22_193;
    moom.ir life23_254;
    float life24_258;
    java.util.Iterator life25_264;
    com.moon.m5 life26_271;
    float life27_312;
    float life28_324;
    lexical_join_359: {
    lexical_join_348: {
    life3_3 = (com.moon.nb.r ^ 64699178183623L);
    life6_8 = (((com.moon.nb)(this)).a() + 0x1.0p3f);
    spill306_0 = net.minecraft.util.EnumParticleTypes.b__Arrayr3();
    life7_14 = (__sourceExactCall_91ab425e264383(((com.moon.nb)(this))) + 0x1.2p2f);
    life8_19 = (((com.moon.nb)(this)).c() - 0x1.0p4f);
    life9_24 = ((com.moon.jo)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__jo())).a(((com.moon.ce)(com.moon.ce.INTER_MEDIUM)));
    life10_29 = ((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.ROUNDED_RECTANGLE))))).a();
    life11_34 = ((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.TRIANGLE))))).a();
    life12_41 = ((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.MSDF))))).a(((com.moon.jm)(life9_24))))).a();
    ((com.moon.hW)(life10_29)).a(((com.moon.iX)(com.moon.i3.a(((float)((life6_8 - 0x1.0p-1f))), ((float)(life7_14)), ((float)((life8_19 + 0x1.0p0f))), ((float)(0x1.1p4f)), ((float)(0x1.8p1f)), ((int)(__sourceIntrinsic_505b8c2844d4_invokedynamic306_22(32312, (6820201865277281620L ^ life3_3))))))));
    ((com.moon.nb)(this)).a(((float)((((life6_8 + life8_19) - 0x1.1p4f) - 0x1.6p3f))), ((float)((life7_14 + 0x1.6p2f))), ((int)(p0)), ((int)(p1)));
    life5_73 = spill306_0;
    life13_90 = com.moon.i3.a(((float)(((life6_8 + life8_19) - 0x1.1p4f))), ((float)(life7_14)), ((float)(0x1.1p4f)), ((float)(0x1.1p4f)), ((float)(0x1.8p1f)), ((int)(((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.ColorSetting)(((com.moon.module.impl.ClickGUI)(((com.moon.nb)(this)).a__lS())).a__kX())).getValue())))).intValue())));
    ((com.moon.i3)(life13_90)).a(((boolean)(false)));
    ((com.moon.i3)(life13_90)).c(((boolean)(false)));
    ((com.moon.i3)(life13_90)).e(((boolean)(false)));
    ((com.moon.hW)(life10_29)).a(((com.moon.iX)(life13_90)));
    life14_107 = 0x1.4p2f;
    life15_113 = (-0x1.68p6f * ((com.moon.nY)(this.n)).c());
    life16_125 = new org.lwjgl.util.vector.Vector2f(((life6_8 + life8_19) - 0x1.1p3f), (life7_14 + 0x1.1p3f));
    life17_141 = new org.lwjgl.util.vector.Vector2f((((org.lwjgl.util.vector.Vector2f)(life16_125)).x + (life14_107 / 0x1.0p1f)), (((org.lwjgl.util.vector.Vector2f)(life16_125)).y + (life14_107 / 0x1.0p1f)));
    life18_157 = new org.lwjgl.util.vector.Vector2f((((org.lwjgl.util.vector.Vector2f)(life16_125)).x - (life14_107 / 0x1.0p1f)), (((org.lwjgl.util.vector.Vector2f)(life16_125)).y + (life14_107 / 0x1.0p1f)));
    life19_169 = new org.lwjgl.util.vector.Vector2f(((org.lwjgl.util.vector.Vector2f)(life16_125)).x, (((org.lwjgl.util.vector.Vector2f)(life16_125)).y - (life14_107 / 0x1.0p1f)));
    life20_177 = ((com.moon.nb)(this)).a(((org.lwjgl.util.vector.Vector2f)(life16_125)), ((org.lwjgl.util.vector.Vector2f)(life19_169)), ((float)((0x1.68p7f + life15_113))));
    life21_185 = ((com.moon.nb)(this)).a(((org.lwjgl.util.vector.Vector2f)(life16_125)), ((org.lwjgl.util.vector.Vector2f)(life18_157)), ((float)((0x1.68p7f + life15_113))));
    life22_193 = ((com.moon.nb)(this)).a(((org.lwjgl.util.vector.Vector2f)(life16_125)), ((org.lwjgl.util.vector.Vector2f)(life17_141)), ((float)((0x1.68p7f + life15_113))));
    ((com.moon.hW)(life11_34)).a(((com.moon.iX)(com.moon.i8.a(((float)(((org.lwjgl.util.vector.Vector2f)(life20_177)).x)), ((float)(((org.lwjgl.util.vector.Vector2f)(life20_177)).y)), ((float)(((org.lwjgl.util.vector.Vector2f)(life21_185)).x)), ((float)(((org.lwjgl.util.vector.Vector2f)(life21_185)).y)), ((float)(((org.lwjgl.util.vector.Vector2f)(life22_193)).x)), ((float)(((org.lwjgl.util.vector.Vector2f)(life22_193)).y)), ((int)(-1))))));
    ((com.moon.jm)(life9_24)).b(((com.moon.hW)(life12_41)), ((java.lang.String)(((com.moon.setting.SettingGroup)(this.p)).getDisplayName())), ((float)(0x1.cp2f)), ((float)((life6_8 + 0x1.0p2f))), ((float)((((life7_14 + 0x1.0p-1f) + 0x1.1p3f) - (((com.moon.jm)(life9_24)).b(((java.lang.String)(((com.moon.setting.SettingGroup)(this.p)).getDisplayName())), ((float)(0x1.cp2f))) / 0x1.0p1f)))), ((int)(-1)));
    __sourceExactCall_247fe3d2bc87d6(((com.moon.hW)(life10_29)));
    __sourceExactCall_247fe3d2bc87d6(((com.moon.hW)(life12_41)));
    org.lwjgl.opengl.GL11.glEnable(((int)(__sourceIntrinsic_505b8c2844d4_invokedynamic306_63(433, (4904295551419804382L ^ life3_3)))));
    __sourceExactCall_247fe3d2bc87d6(((com.moon.hW)(life11_34)));
    org.lwjgl.opengl.GL11.glDisable(((int)(__sourceIntrinsic_505b8c2844d4_invokedynamic306_66(12582, (6722248475459476040L ^ life3_3)))));
    life23_254 = com.moon.nS.a();
    life24_258 = ((float) ((moom.ir)(life23_254)).b__Int());
    ((com.moon.nb)(this)).d__sourceReturn_da8c82d5d4();
    life25_264 = ((java.util.List)(this.o)).iterator();
    lexical_cycle_265: while (true) {
    lexical_join_343: {
    lexical_join_342: {
    lexical_join_335: {
    lexical_join_327: {
    lexical_join_294: {
    lexical_join_293: {
    lexical_join_292: {
    if (!(((java.util.Iterator)(life25_264)).hasNext())) {
        break lexical_join_348;
    }
    life26_271 = ((com.moon.m5)(((java.util.Iterator)(life25_264)).next()));
    if (!((life5_73 != null))) {
        break lexical_join_359;
    }
    spill306_1 = ((com.moon.m5)(life26_271)).e();
    if (!((life5_73 != null))) {
        lexicalValue306_294_0 = spill306_1;
        break lexical_join_294;
    }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(spill306_1)), ((float)(0x0.0p0f))) <= 0))) {
        break lexical_join_293;
    }
    spill306_2 = ((com.moon.m5)(life26_271)).c__Boolean();
    if (!((life5_73 != null))) {
        lexicalValue306_292_0 = ((spill306_2) ? 1 : 0);
        break lexical_join_292;
    }
    if (!(spill306_2)) {
        break lexical_join_343;
    }
    spill306_3 = ((com.moon.m5)(life26_271)).e();
    if (!((life5_73 != null))) {
        lexicalValue306_294_0 = spill306_3;
        break lexical_join_294;
    }
    lexicalValue306_292_0 = recovery.source.CarrierOps.fcmpl(((float)(spill306_3)), ((float)(0x0.0p0f)));
    }
    if (!((lexicalValue306_292_0 > 0))) {
        break lexical_join_343;
    }
    }
    lexicalValue306_294_0 = com.moon.m1.b;
    }
    life27_312 = lexicalValue306_294_0;
    life28_324 = ((__sourceExactCall_47649f82fca094(((com.moon.m5)(life26_271))) / life24_258) * (life27_312 - (((com.moon.m5)(life26_271)).e() * life27_312)));
    spill306_4 = ((com.moon.nb)(this)).b__Boolean();
    if (!((life5_73 != null))) {
        lexicalValue306_335_0 = ((spill306_4) ? 1 : 0);
        break lexical_join_335;
    }
    if (!((!spill306_4))) {
        break lexical_join_327;
    }
    com.moon.hU.a(((float)(((com.moon.m5)(life26_271)).e())));
    com.moon.hU.a__Void();
    com.moon.hU.a(((float)(life27_312)), ((float)((((com.moon.m5)(life26_271)).e() * life27_312))), ((float)(0x1.0p0f)));
    com.moon.hU.b(((float)(0x0.0p0f)), ((float)(life28_324)), ((float)(0x0.0p0f)));
    }
    __sourceExactCall_7089b285ebcc3e(((com.moon.m5)(life26_271)), ((int)(p0)), ((int)(p1)));
    if (!((life5_73 != null))) {
        break lexical_join_342;
    }
    lexicalValue306_335_0 = ((((com.moon.nb)(this)).b__Boolean()) ? 1 : 0);
    }
    if (!((lexicalValue306_335_0 == 0))) {
        break lexical_join_343;
    }
    com.moon.hU.d__Void();
    com.moon.hU.a__Void();
    com.moon.hU.a(((float)(life27_312)), ((float)(life27_312)), ((float)(0x1.0p0f)));
    }
    com.moon.hU.b__Void();
    }
    if (!((life5_73 == null))) { continue lexical_cycle_265; }
    break lexical_cycle_265;
    }
    __sourceExactCall_6604345f74a40b(((java.lang.String[])(new java.lang.String[1])));
    }
    ((com.moon.nY)(this.n)).a(((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((boolean)(this.q)));
    __sourceExactCall_d25af89328684c(this, ((int)(p0)), ((int)(p1)));
    }
    return;
}


private void d__sourceReturn_da8c82d5d4() {
net.minecraft.entity.Entity[] spill307_0;
    long life1_3;
    float life4_11;
    float life5_13;
    java.util.Iterator life6_17;
    net.minecraft.entity.Entity[] life3_18;
    com.moon.m5 life7_25;
    lexical_join_53: {
    life1_3 = (com.moon.nb.r ^ 128253824936468L);
    spill307_0 = net.minecraft.util.EnumParticleTypes.b__Arrayr3();
    life4_11 = ((((com.moon.nb)(this)).b() + 0x1.2p2f) + 0x1.1p4f);
    life5_13 = 0x1.0p2f;
    life6_17 = ((java.util.List)(this.o)).iterator();
    life3_18 = spill307_0;
    lexical_cycle_19: while (true) {
    if (!(((java.util.Iterator)(life6_17)).hasNext())) {
        break lexical_join_53;
    }
    life7_25 = ((com.moon.m5)(((java.util.Iterator)(life6_17)).next()));
    ((com.moon.m5)(life7_25)).a(((float)((((com.moon.nb)(this)).a() + life5_13))));
    ((com.moon.m5)(life7_25)).c(((float)((((com.moon.nb)(this)).c() - (life5_13 * 0x1.0p1f)))));
    ((com.moon.m5)(life7_25)).b(((float)(life4_11)));
    life4_11 = (life4_11 + ((com.moon.m5)(life7_25)).d());
    if (!((life3_18 == null))) { continue lexical_cycle_19; }
    break lexical_cycle_19;
    }
    }
    return;
}


public void a__Void() {
com.moon.setting.Setting forestValue0_38_0;
    net.minecraft.entity.Entity[] spill0_0;
    com.moon.setting.Setting spill0_1;
    long life1_3;
    float life4_11;
    net.minecraft.entity.Entity[] life3_12;
    float life5_14;
    java.util.List life6_19;
    java.util.Iterator life7_22;
    com.moon.setting.Setting life8_31;
    com.moon.m5 life9_56;
    forest_join_263: {
    forest_join_261: {
    life1_3 = (com.moon.nb.r ^ 109381195610711L);
    spill0_0 = net.minecraft.util.EnumParticleTypes.b__Arrayr3();
    life4_11 = ((((com.moon.nb)(this)).b() + 0x1.2p2f) + 0x1.1p4f);
    life3_12 = spill0_0;
    life5_14 = 0x1.0p2f;
    life6_19 = ((java.util.List)(((com.moon.setting.SettingGroup)(this.p)).getValue()));
    life7_22 = ((java.util.List)(life6_19)).iterator();
    forest_cycle_23: while (true) {
    forest_join_259: {
    forest_join_231: {
    forest_join_219: {
    forest_join_206: {
    forest_join_192: {
    forest_join_178: {
    forest_join_164: {
    forest_join_150: {
    forest_join_136: {
    forest_join_122: {
    forest_join_108: {
    forest_join_94: {
    forest_join_80: {
    forest_join_66: {
    forest_join_52: {
    forest_join_44: {
    forest_join_38: {
    if (!(((java.util.Iterator)(life7_22)).hasNext())) {
        break forest_join_261;
    }
    life8_31 = ((com.moon.setting.Setting)(((java.util.Iterator)(life7_22)).next()));
    if (!((life3_12 != null))) {
        break forest_join_263;
    }
    spill0_1 = life8_31;
    if (!((life3_12 != null))) {
        forestValue0_38_0 = spill0_1;
        break forest_join_38;
    }
    if (!(((com.moon.setting.Setting)(spill0_1)).isGrouped())) {
        break forest_join_44;
    }
    forestValue0_38_0 = life8_31;
    }
    if (!((((com.moon.setting.Setting)(forestValue0_38_0)).getGroup() != this.p))) {
        break forest_join_44;
    }
    if (!((life3_12 == null))) {
        continue forest_cycle_23;
    }
    }
    life9_56 = null;
    switch ((com.moon.nj.a)[((com.moon.cf)(((com.moon.setting.Setting)(life8_31)).getType())).ordinal()]) {
case 1:
{
        break forest_join_52;
    }
case 2:
{
        break forest_join_66;
    }
case 3:
{
        break forest_join_80;
    }
case 4:
{
        break forest_join_94;
    }
case 5:
{
        break forest_join_108;
    }
case 6:
{
        break forest_join_122;
    }
case 7:
{
        break forest_join_136;
    }
case 8:
{
        break forest_join_150;
    }
case 9:
{
        break forest_join_164;
    }
case 10:
{
        break forest_join_178;
    }
case 11:
{
        break forest_join_192;
    }
case 12:
{
        break forest_join_206;
    }
default:
{
        break forest_join_219;
    }
}
    }
    life9_56 = new com.moon.m7(this, ((com.moon.setting.BooleanSetting)(life8_31)), ((com.moon.nb)(this)).a(), life4_11, ((com.moon.nb)(this)).c(), 0x1.28p4f);
    break forest_join_219;
    }
    life9_56 = new com.moon.ng(this, ((com.moon.setting.IntegerSetting)(life8_31)), ((com.moon.nb)(this)).a(), life4_11, ((com.moon.nb)(this)).c(), 0x1.6p4f);
    break forest_join_219;
    }
    life9_56 = new com.moon.nf(this, ((com.moon.setting.FloatSetting)(life8_31)), ((com.moon.nb)(this)).a(), life4_11, ((com.moon.nb)(this)).c(), 0x1.6p4f);
    break forest_join_219;
    }
    life9_56 = new com.moon.nd(this, ((com.moon.setting.EnumSetting)(life8_31)), ((com.moon.nb)(this)).a(), life4_11, ((com.moon.nb)(this)).c(), 0x1.3p5f);
    break forest_join_219;
    }
    life9_56 = new com.moon.nc(this, ((com.moon.setting.ModeSetting)(life8_31)), ((com.moon.nb)(this)).a(), life4_11, ((com.moon.nb)(this)).c(), 0x1.3p5f);
    break forest_join_219;
    }
    life9_56 = new com.moon.nb(this, ((com.moon.setting.SettingGroup)(life8_31)), ((com.moon.nb)(this)).a(), life4_11, ((com.moon.nb)(this)).c(), 0x1.78p4f);
    break forest_join_219;
    }
    life9_56 = new com.moon.ne(this, ((com.moon.setting.MultiSelectSetting)(life8_31)), ((com.moon.nb)(this)).a(), life4_11, ((com.moon.nb)(this)).c(), 0x1.9p4f);
    break forest_join_219;
    }
    life9_56 = new com.moon.m9(this, ((com.moon.setting.ColorSetting)(life8_31)), ((com.moon.nb)(this)).a(), life4_11, ((com.moon.nb)(this)).c(), 0x1.6p4f);
    break forest_join_219;
    }
    life9_56 = new com.moon.na(this, ((com.moon.k5)(life8_31)), ((com.moon.nb)(this)).a(), life4_11, ((com.moon.nb)(this)).c(), 0x1.f8p4f);
    break forest_join_219;
    }
    life9_56 = new com.moon.m8(this, ((com.moon.setting.ButtonSetting)(life8_31)), ((com.moon.nb)(this)).a(), life4_11, ((com.moon.nb)(this)).c(), 0x1.6p4f);
    break forest_join_219;
    }
    life9_56 = new com.moon.m6(this, ((com.moon.setting.BezierSetting)(life8_31)), ((com.moon.nb)(this)).a(), life4_11, ((com.moon.nb)(this)).c(), 0x1.6p4f);
    break forest_join_219;
    }
    life9_56 = new com.moon.m_(this, ((com.moon.setting.StringListSetting)(life8_31)), ((com.moon.nb)(this)).a(), life4_11, ((com.moon.nb)(this)).c(), 0x1.3p5f);
    }
    if (!((life9_56 != null))) {
        break forest_join_259;
    }
    if (!((((com.moon.setting.Setting)(life8_31)).getDescription() != null))) {
        break forest_join_231;
    }
    ((com.moon.m5)(life9_56)).a(((com.moon.nv)(new com.moon.nv(life9_56))));
    }
    __sourceExactCall_c6ef380092c67d(((com.moon.m5)(life9_56)));
    ((com.moon.m5)(life9_56)).a(((float)((((com.moon.nb)(this)).a() + life5_14))));
    ((com.moon.m5)(life9_56)).c(((float)((((com.moon.nb)(this)).c() - (life5_14 * 0x1.0p1f)))));
    ((java.util.List)(this.o)).add(((java.lang.Object)(life9_56)));
    life4_11 = (life4_11 + ((com.moon.m5)(life9_56)).f());
    }
    if (!((life3_12 == null))) {
        continue forest_cycle_23;
    }
    break forest_cycle_23;
    }
    }
    __sourceExactCall_f580c5ed0e17ed(this);
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private org.lwjgl.util.vector.Vector2f a(org.lwjgl.util.vector.Vector2f p0, org.lwjgl.util.vector.Vector2f p1, float p2) {
double local4_life1 = java.lang.Math.toRadians(((double)(((double) p2))));
    float local6_life3 = ((float) java.lang.Math.cos(((double)(local4_life1))));
    float local7_life5 = ((float) java.lang.Math.sin(((double)(local4_life1))));
    return new org.lwjgl.util.vector.Vector2f(((((org.lwjgl.util.vector.Vector2f)(p0)).x + ((((org.lwjgl.util.vector.Vector2f)(p1)).x - ((org.lwjgl.util.vector.Vector2f)(p0)).x) * local6_life3)) - ((((org.lwjgl.util.vector.Vector2f)(p1)).y - ((org.lwjgl.util.vector.Vector2f)(p0)).y) * local7_life5)), ((((org.lwjgl.util.vector.Vector2f)(p0)).y + ((((org.lwjgl.util.vector.Vector2f)(p1)).x - ((org.lwjgl.util.vector.Vector2f)(p0)).x) * local7_life5)) + ((((org.lwjgl.util.vector.Vector2f)(p1)).y - ((org.lwjgl.util.vector.Vector2f)(p0)).y) * local6_life3)));
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 31355;
      if (t[var3] == null) {
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
         long var5 = s[var3];
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
         Object[] var9 = (Object[])u.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               u.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/moon/nb", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         t[var3] = var15;
      }

      return t[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_e31a57bd7e78f6(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral2971_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/nb"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(char p0, int p1) {
com.moon.m5 lexicalValue300_32_0;
    com.moon.nb lexicalValue300_38_0;
    com.moon.nb spill300_0;
    com.moon.m5 spill300_1;
    long life3_3;
    net.minecraft.entity.Entity[] life5_5;
    java.util.Iterator life6_17;
    com.moon.m5 life7_24;
    lexical_join_41: {
    lexical_join_38: {
    lexical_join_37: {
    life3_3 = (com.moon.nb.r ^ 134690923638177L);
    life5_5 = net.minecraft.util.EnumParticleTypes.b__Arrayr3();
    spill300_0 = this;
    if (!((life5_5 != null))) {
        lexicalValue300_38_0 = spill300_0;
        break lexical_join_38;
    }
    if (!(((com.moon.nb)(spill300_0)).q)) {
        break lexical_join_37;
    }
    life6_17 = ((java.util.List)(this.o)).iterator();
    lexical_cycle_15: while (true) {
    lexical_join_32: {
    lexical_join_31: {
    if (!(((java.util.Iterator)(life6_17)).hasNext())) {
        break lexical_join_37;
    }
    life7_24 = ((com.moon.m5)(((java.util.Iterator)(life6_17)).next()));
    if (!((life5_5 != null))) {
        break lexical_join_41;
    }
    spill300_1 = life7_24;
    if (!((life5_5 != null))) {
        lexicalValue300_32_0 = spill300_1;
        break lexical_join_32;
    }
    if (!((!((com.moon.m5)(spill300_1)).c__Boolean()))) {
        break lexical_join_31;
    }
    if (!((life5_5 == null))) { continue lexical_cycle_15; }
    }
    lexicalValue300_32_0 = life7_24;
    }
    __sourceExactCall_c80114f36e01b4(((com.moon.m5)(lexicalValue300_32_0)), ((char)(p0)), ((int)(p1)));
    if (!((life5_5 == null))) { continue lexical_cycle_15; }
    break lexical_cycle_15;
    }
    }
    lexicalValue300_38_0 = this;
    }
    __sourceIntrinsic_f7d59ba1def0_call300_10(lexicalValue300_38_0, p0, p1);
    }
    return;
}


public boolean a__Boolean() {
long l = com.moon.nb.r ^ 0xB01485D0E24L;
        Entity[] entityArray = EnumParticleTypes.b__Arrayr3();
        boolean bl = this.q;
        if (entityArray != null) {
            if (!bl) return false;
            bl = this.d__sourceReturn_aae029aa0a();
        }
        if (entityArray == null) return bl;
        if (!bl) return false;
        return true;
}


public void a(int p0, int p1) {
int lexicalValue301_43_0;
    float lexicalValue301_45_0;
    int lexicalValue301_86_0;
    net.minecraft.entity.Entity[] spill301_0;
    float spill301_1;
    boolean spill301_2;
    float spill301_3;
    boolean spill301_4;
    long life3_3;
    moom.ir life6_5;
    float life7_10;
    java.util.Iterator life8_14;
    net.minecraft.entity.Entity[] life5_15;
    com.moon.m5 life9_22;
    float life10_63;
    float life11_75;
    lexical_join_100: {
    lexical_join_96: {
    life3_3 = (com.moon.nb.r ^ 120471177653725L);
    life6_5 = com.moon.nS.a();
    spill301_0 = net.minecraft.util.EnumParticleTypes.b__Arrayr3();
    life7_10 = ((float) ((moom.ir)(life6_5)).b__Int());
    life8_14 = ((java.util.List)(this.o)).iterator();
    life5_15 = spill301_0;
    lexical_cycle_16: while (true) {
    lexical_join_94: {
    lexical_join_93: {
    lexical_join_86: {
    lexical_join_78: {
    lexical_join_45: {
    lexical_join_44: {
    lexical_join_43: {
    if (!(((java.util.Iterator)(life8_14)).hasNext())) {
        break lexical_join_96;
    }
    life9_22 = ((com.moon.m5)(((java.util.Iterator)(life8_14)).next()));
    if (!((life5_15 != null))) {
        break lexical_join_100;
    }
    spill301_1 = ((com.moon.m5)(life9_22)).e();
    if (!((life5_15 != null))) {
        lexicalValue301_45_0 = spill301_1;
        break lexical_join_45;
    }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(spill301_1)), ((float)(0x0.0p0f))) <= 0))) {
        break lexical_join_44;
    }
    spill301_2 = ((com.moon.m5)(life9_22)).c__Boolean();
    if (!((life5_15 != null))) {
        lexicalValue301_43_0 = ((spill301_2) ? 1 : 0);
        break lexical_join_43;
    }
    if (!(spill301_2)) {
        break lexical_join_94;
    }
    spill301_3 = ((com.moon.m5)(life9_22)).e();
    if (!((life5_15 != null))) {
        lexicalValue301_45_0 = spill301_3;
        break lexical_join_45;
    }
    lexicalValue301_43_0 = recovery.source.CarrierOps.fcmpl(((float)(spill301_3)), ((float)(0x0.0p0f)));
    }
    if (!((lexicalValue301_43_0 > 0))) {
        break lexical_join_94;
    }
    }
    lexicalValue301_45_0 = com.moon.m1.b;
    }
    life10_63 = lexicalValue301_45_0;
    life11_75 = ((((com.moon.m5)(life9_22)).b() / life7_10) * (life10_63 - (((com.moon.m5)(life9_22)).e() * life10_63)));
    spill301_4 = ((com.moon.nb)(this)).b__Boolean();
    if (!((life5_15 != null))) {
        lexicalValue301_86_0 = ((spill301_4) ? 1 : 0);
        break lexical_join_86;
    }
    if (!((!spill301_4))) {
        break lexical_join_78;
    }
    com.moon.hU.a(((float)(((com.moon.m5)(life9_22)).e())));
    com.moon.hU.a__Void();
    com.moon.hU.a(((float)(life10_63)), ((float)((((com.moon.m5)(life9_22)).e() * life10_63))), ((float)(0x1.0p0f)));
    com.moon.hU.b(((float)(0x0.0p0f)), ((float)(life11_75)), ((float)(0x0.0p0f)));
    }
    __sourceExactCall_a6296ffde223f5(((com.moon.m5)(life9_22)), ((int)(p0)), ((int)(p1)));
    if (!((life5_15 != null))) {
        break lexical_join_93;
    }
    lexicalValue301_86_0 = ((((com.moon.nb)(this)).b__Boolean()) ? 1 : 0);
    }
    if (!((lexicalValue301_86_0 == 0))) {
        break lexical_join_94;
    }
    com.moon.hU.d__Void();
    com.moon.hU.a__Void();
    com.moon.hU.a(((float)(life10_63)), ((float)(life10_63)), ((float)(0x1.0p0f)));
    }
    com.moon.hU.b__Void();
    }
    if (!((life5_15 == null))) { continue lexical_cycle_16; }
    break lexical_cycle_16;
    }
    }
    __sourceExactCall_8f7c7495fd239a(this, ((int)(p0)), ((int)(p1)));
    }
    return;
}


public com.moon.setting.Setting a__sourceReturn_7d3c444d39() {
return this.p;
}


public void a(int p0, int p1, int p2) {
com.moon.nY lexicalValue302_45_0;
    com.moon.nY lexicalValue302_46_0;
    float lexicalValue302_46_1;
    com.moon.nb lexicalValue302_54_0;
    int lexicalValue302_54_1;
    com.moon.nb lexicalValue302_55_0;
    com.moon.nb lexicalValue302_56_0;
    int lexicalValue302_56_1;
    int lexicalValue302_61_0;
    com.moon.m5 lexicalValue302_83_0;
    com.moon.nb lexicalValue302_90_0;
    net.minecraft.entity.Entity[] spill302_0;
    boolean spill302_1;
    com.moon.nY spill302_2;
    com.moon.nb spill302_3;
    boolean spill302_4;
    com.moon.nb spill302_5;
    com.moon.m5 spill302_6;
    long life4_3;
    float life7_9;
    float life8_14;
    float life9_19;
    net.minecraft.entity.Entity[] life6_20;
    java.util.Iterator life10_79;
    com.moon.m5 life11_86;
    lexical_join_99: {
    lexical_join_94: {
    lexical_join_90: {
    lexical_join_89: {
    lexical_join_61: {
    lexical_join_57: {
    lexical_join_56: {
    lexical_join_55: {
    lexical_join_54: {
    lexical_join_46: {
    lexical_join_45: {
    life4_3 = (com.moon.nb.r ^ 19358262469529L);
    spill302_0 = net.minecraft.util.EnumParticleTypes.b__Arrayr3();
    life7_9 = (((com.moon.nb)(this)).a() + 0x1.0p3f);
    life8_14 = (((com.moon.nb)(this)).b() + 0x1.2p2f);
    life9_19 = (((com.moon.nb)(this)).c() - 0x1.0p4f);
    life6_20 = spill302_0;
    spill302_1 = ((com.moon.nb)(this)).a(((int)(p0)), ((int)(p1)), ((float)((life7_9 - 0x1.0p-1f))), ((float)((life8_14 + 0x1.8p0f))), ((float)((life9_19 + 0x1.0p0f))), ((float)(0x1.1p4f)));
    if (!((life6_20 != null))) {
        lexicalValue302_61_0 = ((spill302_1) ? 1 : 0);
        break lexical_join_61;
    }
    if (!(spill302_1)) {
        break lexical_join_57;
    }
    spill302_2 = this.n;
    if (!(this.q)) {
        lexicalValue302_45_0 = spill302_2;
        break lexical_join_45;
    }
    lexicalValue302_46_0 = spill302_2;
    lexicalValue302_46_1 = 0x1.0p0f;
    break lexical_join_46;
    }
    lexicalValue302_46_0 = lexicalValue302_45_0;
    lexicalValue302_46_1 = 0x0.0p0f;
    }
    ((com.moon.nY)(lexicalValue302_46_0)).a(((float)(lexicalValue302_46_1)));
    spill302_3 = this;
    spill302_4 = this.q;
    if (!((life6_20 != null))) {
        lexicalValue302_54_0 = spill302_3;
        lexicalValue302_54_1 = ((spill302_4) ? 1 : 0);
        break lexical_join_54;
    }
    if (!((!spill302_4))) {
        lexicalValue302_55_0 = spill302_3;
        break lexical_join_55;
    }
    lexicalValue302_54_0 = spill302_3;
    lexicalValue302_54_1 = 1;
    }
    lexicalValue302_56_0 = lexicalValue302_54_0;
    lexicalValue302_56_1 = lexicalValue302_54_1;
    break lexical_join_56;
    }
    lexicalValue302_56_0 = lexicalValue302_55_0;
    lexicalValue302_56_1 = 0;
    }
    ((com.moon.nb)(lexicalValue302_56_0)).q = ((boolean)__sourceIntrinsic_integerToBoolean((lexicalValue302_56_1)));
    }
    spill302_5 = this;
    if (!((life6_20 != null))) {
        lexicalValue302_90_0 = spill302_5;
        break lexical_join_90;
    }
    lexicalValue302_61_0 = ((((com.moon.nb)(spill302_5)).q) ? 1 : 0);
    }
    if (!((lexicalValue302_61_0 != 0))) {
        break lexical_join_89;
    }
    life10_79 = ((java.util.List)(this.o)).iterator();
    lexical_cycle_66: while (true) {
    lexical_join_83: {
    lexical_join_82: {
    if (!(((java.util.Iterator)(life10_79)).hasNext())) {
        break lexical_join_89;
    }
    life11_86 = ((com.moon.m5)(((java.util.Iterator)(life10_79)).next()));
    if (!((life6_20 != null))) {
        break lexical_join_94;
    }
    spill302_6 = life11_86;
    if (!((life6_20 != null))) {
        lexicalValue302_83_0 = spill302_6;
        break lexical_join_83;
    }
    if (!((!((com.moon.m5)(spill302_6)).c__Boolean()))) {
        break lexical_join_82;
    }
    if (!((life6_20 == null))) { continue lexical_cycle_66; }
    }
    lexicalValue302_83_0 = life11_86;
    }
    __sourceExactCall_dc2e49b252372c(((com.moon.m5)(lexicalValue302_83_0)), ((int)(p0)), ((int)(p1)), ((int)(p2)));
    if (!((life6_20 == null))) { continue lexical_cycle_66; }
    break lexical_cycle_66;
    }
    }
    lexicalValue302_90_0 = this;
    }
    __sourceIntrinsic_e4d4f5a69301_call302_22(lexicalValue302_90_0, p0, p1, p2);
    }
    if (!((net.minecraft.entity.Entity.b__ArrayString() != null))) {
        break lexical_join_99;
    }
    net.minecraft.util.EnumParticleTypes.b(((net.minecraft.entity.Entity[])(new net.minecraft.entity.Entity[5])));
    }
    return;
}


private float g() {
float lexicalValue308_31_0;
    net.minecraft.entity.Entity[] spill308_0;
    float spill308_1;
    long life1_3;
    float life4_5;
    java.util.Iterator life5_10;
    net.minecraft.entity.Entity[] life3_11;
    com.moon.m5 life6_18;
    lexical_join_31: {
    lexical_join_28: {
    life1_3 = (com.moon.nb.r ^ 33121505624625L);
    life4_5 = 0x0.0p0f;
    spill308_0 = net.minecraft.util.EnumParticleTypes.b__Arrayr3();
    life5_10 = ((java.util.List)(this.o)).iterator();
    life3_11 = spill308_0;
    lexical_cycle_12: while (true) {
    if (!(((java.util.Iterator)(life5_10)).hasNext())) {
        break lexical_join_28;
    }
    life6_18 = ((com.moon.m5)(((java.util.Iterator)(life5_10)).next()));
    spill308_1 = (life4_5 + ((com.moon.m5)(life6_18)).d());
    if (!((life3_11 != null))) {
        lexicalValue308_31_0 = spill308_1;
        break lexical_join_31;
    }
    life4_5 = spill308_1;
    if (!((life3_11 == null))) { continue lexical_cycle_12; }
    break lexical_cycle_12;
    }
    }
    lexicalValue308_31_0 = java.lang.Math.max(((float)(life4_5)), ((float)(0x0.0p0f)));
    }
    return lexicalValue308_31_0;
}


private static native <E extends Throwable> void __sourceIntrinsic_f7d59ba1def0_call300_10(com.moon.nb a0, char a1, int a2) throws E;

private static native <E extends Throwable> void __sourceIntrinsic_e4d4f5a69301_call302_22(com.moon.nb a0, int a1, int a2, int a3) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral2971_0() throws E;

private static native <E extends Throwable> void __sourceIntrinsic_d5f89f155b18_call305_10(com.moon.nb a0, int a1, int a2, int a3) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_505b8c2844d4_invokedynamic306_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_505b8c2844d4_invokedynamic306_63(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_505b8c2844d4_invokedynamic306_66(int a0, long a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native int __sourceIntrinsic_booleanComparison(boolean value);

private static native void __sourceExactCall_6604345f74a40b(java.lang.String[] p0);
private static native int __sourceExactCall_e31a57bd7e78f6(int p0, long p1);

private static native void __sourceExactCall_e6c3ea18244f1b(com.moon.m5 p0, int p1, int p2);
private static native void __sourceExactCall_13d30826a82418(com.moon.m5 p0, int p1, int p2);
private static native void __sourceExactCall_d2688b7bbb47bf(com.moon.m5 p0, int p1, int p2, int p3);
private static native float __sourceExactCall_91ab425e264383(com.moon.nb p0);
private static native void __sourceExactCall_247fe3d2bc87d6(com.moon.hW p0);
private static native float __sourceExactCall_47649f82fca094(com.moon.m5 p0);
private static native void __sourceExactCall_7089b285ebcc3e(com.moon.m5 p0, int p1, int p2);
private static native void __sourceExactCall_d25af89328684c(com.moon.m5 p0, int p1, int p2);
private static native void __sourceExactCall_c6ef380092c67d(com.moon.m5 p0);
private static native void __sourceExactCall_f580c5ed0e17ed(com.moon.m5 p0);
private static native void __sourceExactCall_c80114f36e01b4(com.moon.m5 p0, char p1, int p2);
private static native void __sourceExactCall_a6296ffde223f5(com.moon.m5 p0, int p1, int p2);
private static native void __sourceExactCall_8f7c7495fd239a(com.moon.m5 p0, int p1, int p2);
private static native void __sourceExactCall_dc2e49b252372c(com.moon.m5 p0, int p1, int p2, int p3);
}
