package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class ns extends com.moon.nr {

private com.moon.nX l;

private java.util.List<com.moon.m4> m;

private com.moon.module.ModuleCategory n;

private int o;

private static long p;

private static long[] r;

private static java.lang.Integer[] s;

private static java.util.Map t;

public ns(com.moon.module.ModuleCategory p0, float p1, float p2, float p3, float p4) { super(0.0F, 0.0F, 0.0F, 0.0F); }

private static void __sourceConstructorBody_dc7488ca67a2b43e(com.moon.ns receiver, com.moon.module.ModuleCategory p0, float p1, float p2, float p3, float p4) throws Throwable {
long local6_life2;
    float local9_life11;
    int[] local8_life12;
    java.util.List local10_life16;
    java.util.Iterator local11_life18;
    com.moon.module.Module local12_life22;
    com.moon.m4 local13_life26;
    moom.ir local11_life35;
    init_join_79: {
    init_join_72: {
    local6_life2 = (com.moon.ns.p ^ 86622479713739L);
    com.moon.ns.__sourceConstructorInit_dc7488ca67a2b43e_0(((com.moon.ns)(receiver)), ((float)(p1)), ((float)(p2)), ((float)(p3)), ((float)(p4)));
    int[] __sourceSpill206_6 = net.minecraft.entity.player.PlayerCapabilities.b__ArrayInt();
    ((com.moon.ns)(receiver)).l = ((com.moon.nX)(new com.moon.nX()));
    ((com.moon.ns)(receiver)).m = ((java.util.List)(new java.util.ArrayList()));
    ((com.moon.ns)(receiver)).n = ((com.moon.module.ModuleCategory)(p0));
    local9_life11 = (((com.moon.ns)(receiver)).b() + 0x1.c000000000000p+4F);
    local8_life12 = __sourceSpill206_6;
    local10_life16 = ((com.moon.fU)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__fU())).a(((com.moon.module.ModuleCategory)(p0)));
    local11_life18 = ((java.util.List)(local10_life16)).iterator();
    init_cycle_38: while (true) {
    if (!(((java.util.Iterator)(local11_life18)).hasNext())) {
        break init_join_72;
    }
    local12_life22 = ((com.moon.module.Module)(((java.util.Iterator)(local11_life18)).next()));
    local13_life26 = new com.moon.m4(receiver, local12_life22, ((com.moon.ns)(receiver)).a(), local9_life11, ((com.moon.ns)(receiver)).c(), 0x1.7000000000000p+4F);
    ((com.moon.m4)(local13_life26)).a__Void();
    ((java.util.List)(((com.moon.ns)(receiver)).m)).add(((java.lang.Object)(local13_life26)));
    local9_life11 = (local9_life11 + 0x1.7000000000000p+4F);
    if (!((local8_life12 == null))) {
        break init_join_79;
    }
    if (!((local8_life12 != null))) { continue init_cycle_38; }
    break init_cycle_38;
    }
    }
    ((com.moon.nX)(((com.moon.ns)(receiver)).l)).a(((float)(0x0.0p0f)));
    ((com.moon.ns)(receiver)).o = ((int)(0));
    }
    local11_life35 = com.moon.nS.a();
    ((com.moon.ns)(receiver)).d(((float)(java.lang.Math.min(((float)(((float) (((moom.ir)(local11_life35)).b__Int() - __sourceIntrinsic_dc7488ca67a2b43e_originalDynamicSite206_38(25415, (7042796249060429027L ^ local6_life2)))))), ((float)(java.lang.Math.min(((float)(0x1.1300000000000p+9F)), ((float)((((com.moon.ns)(receiver)).i() + 0x1.c000000000000p+4F))))))))));
    return;
}


static {
p = ((long)(((moom._a)(moom._c.a(((long)(1065612125970043074L)), ((long)(-6177010410037131411L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(108241610961733L)))));
    t = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.ns.p ^ 76351249183338L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill474_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill474_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill474_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill474_14 = new byte[8];
    (__sourceSpill474_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill474_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation474_16 = __sourceSpill474_14;
    ((javax.crypto.Cipher)(__sourceSpill474_11)).init(((int)(__sourceSpill474_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill474_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation474_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[10];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "] ¶íHÕ>©Êý!õUÚ_s»»èP\bâÝàÎMr6ËeÈà':QãýnLKn^ß®Lì\fvw3"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill474_25 = local6_life21;
        int __sourceSpill474_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill474_25)).substring(((int)(__sourceSpill474_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill474_30 = local8_life19;
        int __sourceSpill474_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill474_33 = new byte[8];
        (__sourceSpill474_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill474_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill474_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill474_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill474_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill474_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill474_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill474_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill474_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill474_34)).doFinal(((byte[])(__sourceSpill474_33)));
        (__sourceSpill474_30)[__sourceSpill474_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "Éä*=ÜH\b¿ÖXÇdpQå<"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill474_38 = local6_life21;
        int __sourceSpill474_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill474_38)).substring(((int)(__sourceSpill474_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill474_43 = local8_life19;
        int __sourceSpill474_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill474_46 = new byte[8];
        (__sourceSpill474_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill474_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill474_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill474_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill474_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill474_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill474_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill474_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill474_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill474_47)).doFinal(((byte[])(__sourceSpill474_46)));
        (__sourceSpill474_43)[__sourceSpill474_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    r = ((long[])(local8_life19));
    s = ((java.lang.Integer[])(new java.lang.Integer[10]));
}

private static native <E extends Throwable> void __sourceConstructorInit_dc7488ca67a2b43e_0(com.moon.ns a0, float a1, float a2, float a3, float a4) throws E;

private float i() {
float lexicalValue328_13_0;
    float lexicalValue328_35_0;
    float spill328_0;
    long life1_3;
    int[] life3_5;
    float life4_15;
    java.util.Iterator life5_19;
    com.moon.m4 life6_26;
    lexical_join_35: {
    lexical_join_34: {
    lexical_join_13: {
    lexical_join_12: {
    life1_3 = (com.moon.ns.p ^ 16026643296197L);
    life3_5 = net.minecraft.entity.player.PlayerCapabilities.b__ArrayInt();
    if (!((((java.util.List)(this.m)).size() > 0))) {
        break lexical_join_12;
    }
    lexicalValue328_13_0 = 0x1.0p0f;
    break lexical_join_13;
    }
    lexicalValue328_13_0 = 0x0.0p0f;
    }
    life4_15 = lexicalValue328_13_0;
    life5_19 = ((java.util.List)(this.m)).iterator();
    lexical_cycle_18: while (true) {
    if (!(((java.util.Iterator)(life5_19)).hasNext())) {
        break lexical_join_34;
    }
    life6_26 = ((com.moon.m4)(((java.util.Iterator)(life5_19)).next()));
    spill328_0 = (life4_15 + ((com.moon.m4)(life6_26)).d());
    if (!((life3_5 == null))) {
        lexicalValue328_35_0 = spill328_0;
        break lexical_join_35;
    }
    life4_15 = spill328_0;
    if (!((life3_5 != null))) { continue lexical_cycle_18; }
    break lexical_cycle_18;
    }
    }
    lexicalValue328_35_0 = life4_15;
    }
    return lexicalValue328_35_0;
}


public void b(int p0, int p1) {
int[] spill323_0;
    long life3_3;
    com.moon.hW life6_11;
    int[] life5_12;
    com.moon.i3 life7_32;
    java.util.Iterator life8_55;
    com.moon.m4 life9_62;
    moom.ir life8_76;
    lexical_join_108: {
    lexical_join_72: {
    lexical_join_71: {
    life3_3 = (com.moon.ns.p ^ 103262195558037L);
    spill323_0 = net.minecraft.entity.player.PlayerCapabilities.b__ArrayInt();
    com.moon.nU.a(((boolean)(false)));
    life6_11 = ((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.ROUNDED_RECTANGLE))))).a();
    life5_12 = spill323_0;
    life7_32 = com.moon.i3.a(((float)((((com.moon.ns)(this)).a() + 0x1.0p-1f))), ((float)((((com.moon.ns)(this)).b() + 0x1.cp4f))), ((float)((((com.moon.ns)(this)).c() - 0x1.0p0f))), ((float)((((com.moon.ns)(this)).d() - 0x1.c8p4f))), ((float)(0x1.ap3f)), ((int)(-1)));
    ((com.moon.i3)(life7_32)).a(((boolean)(false)));
    ((com.moon.i3)(life7_32)).b(((boolean)(false)));
    ((com.moon.i3)(life7_32)).e(((boolean)(false)));
    ((com.moon.hW)(life6_11)).a(((com.moon.iX)(life7_32)));
    ((com.moon.hW)(life6_11)).b();
    com.moon.nU.b(((boolean)(true)));
    life8_55 = ((java.util.List)(this.m)).iterator();
    lexical_cycle_56: while (true) {
    if (!(((java.util.Iterator)(life8_55)).hasNext())) {
        break lexical_join_71;
    }
    life9_62 = ((com.moon.m4)(((java.util.Iterator)(life8_55)).next()));
    ((com.moon.m4)(life9_62)).b(((int)(p0)), ((int)(p1)));
    if (!((life5_12 == null))) {
        break lexical_join_72;
    }
    if (!((life5_12 != null))) { continue lexical_cycle_56; }
    break lexical_cycle_56;
    }
    }
    com.moon.nU.a();
    }
    life8_76 = com.moon.nS.a();
    ((com.moon.ns)(this)).d(((float)(java.lang.Math.min(((float)(((float) java.lang.Math.max(((int)((((moom.ir)(life8_76)).b__Int() - __sourceIntrinsic_45fde0f4e55e_invokedynamic323_27(6563, (7153211200492639575L ^ life3_3))))), ((int)(__sourceIntrinsic_45fde0f4e55e_invokedynamic323_28(26966, (3632753657451177384L ^ life3_3)))))))), ((float)(java.lang.Math.min(((float)(0x1.13p9f)), ((float)((((com.moon.ns)(this)).i() + 0x1.cp4f))))))))));
    super.b(((int)(p0)), ((int)(p1)));
    if (!((net.minecraft.entity.Entity.b__ArrayString() != null))) {
        break lexical_join_108;
    }
    net.minecraft.entity.player.PlayerCapabilities.b(((int[])(new int[2])));
    }
    return;
}


public void b(int p0, int p1, int p2) {
int[] spill324_0;
    long life4_3;
    java.util.Iterator life7_8;
    int[] life6_9;
    com.moon.m4 life8_16;
    lexical_join_31: {
    lexical_join_26: {
    life4_3 = (com.moon.ns.p ^ 138121464051056L);
    spill324_0 = net.minecraft.entity.player.PlayerCapabilities.b__ArrayInt();
    life7_8 = ((java.util.List)(this.m)).iterator();
    life6_9 = spill324_0;
    lexical_cycle_10: while (true) {
    if (!(((java.util.Iterator)(life7_8)).hasNext())) {
        break lexical_join_26;
    }
    life8_16 = ((com.moon.m4)(((java.util.Iterator)(life7_8)).next()));
    ((com.moon.m4)(life8_16)).b(((int)(p0)), ((int)(p1)), ((int)(p2)));
    if (!((life6_9 == null))) {
        break lexical_join_31;
    }
    if (!((life6_9 != null))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    super.b(((int)(p0)), ((int)(p1)), ((int)(p2)));
    }
    return;
}


public void b__Void() {
com.moon.nr forwardValue1125_67_0;
    com.moon.ns forwardValue1125_69_0;
    com.moon.ns spill1125_0;
    com.moon.ns spill1125_1;
    com.moon.ns spill1125_2;
    com.moon.ns spill1125_3;
    long life1_3;
    int[] life3_5;
    forward_join_69: {
    forward_join_68: {
    forward_join_67: {
    forward_join_38: {
    life1_3 = (com.moon.ns.p ^ 53921299015671L);
    life3_5 = net.minecraft.entity.player.PlayerCapabilities.b__ArrayInt();
    spill1125_0 = this;
    if (!((life3_5 == null))) {
        forwardValue1125_67_0 = spill1125_0;
        break forward_join_67;
    }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(((com.moon.ns)(spill1125_0)).e())), ((float)(((com.moon.ns)(this)).a()))) == 0))) {
        break forward_join_38;
    }
    spill1125_1 = this;
    if (!((life3_5 == null))) {
        forwardValue1125_67_0 = spill1125_1;
        break forward_join_67;
    }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(((com.moon.ns)(spill1125_1)).f())), ((float)(((com.moon.ns)(this)).b()))) == 0))) {
        break forward_join_38;
    }
    spill1125_2 = this;
    if (!((life3_5 == null))) {
        forwardValue1125_67_0 = spill1125_2;
        break forward_join_67;
    }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(((com.moon.ns)(spill1125_2)).g())), ((float)(((com.moon.ns)(this)).c()))) == 0))) {
        break forward_join_38;
    }
    spill1125_3 = this;
    if (!((life3_5 == null))) {
        forwardValue1125_69_0 = spill1125_3;
        break forward_join_69;
    }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(((com.moon.ns)(spill1125_3)).h())), ((float)(((com.moon.ns)(this)).d()))) != 0))) {
        break forward_join_68;
    }
    }
    ((com.moon.gV)(((com.moon.module.impl.Effects)(((com.moon.ns)(this)).a__lU())).a())).a(((boolean)(true)));
    ((com.moon.gW)(((com.moon.module.impl.Effects)(((com.moon.ns)(this)).a__lU())).a__gW())).c();
    ((com.moon.ns)(this)).e(((float)(((com.moon.ns)(this)).a())));
    ((com.moon.ns)(this)).f(((float)(((com.moon.ns)(this)).b())));
    ((com.moon.ns)(this)).g(((float)(((com.moon.ns)(this)).c())));
    forwardValue1125_67_0 = ((com.moon.ns)(this)).h(((float)(((com.moon.ns)(this)).d())));
    }
    recovery.source.CarrierOps.discard(forwardValue1125_67_0);
    }
    forwardValue1125_69_0 = this;
    }
    __sourceIntrinsic_9bf881b104f5_call1125_29(forwardValue1125_69_0);
    return;
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


private void e__sourceReturn_da8c82d5d4() {
int forwardValue1128_25_0;
    int forwardValue1128_27_0;
    com.moon.ns forwardValue1128_40_0;
    int forwardValue1128_40_1;
    int forwardValue1128_40_2;
    com.moon.ns forwardValue1128_41_0;
    int forwardValue1128_41_1;
    com.moon.ns forwardValue1128_46_0;
    int forwardValue1128_46_1;
    int forwardValue1128_46_2;
    int[] spill1128_0;
    int spill1128_1;
    com.moon.ns spill1128_2;
    int spill1128_3;
    int spill1128_4;
    long life1_3;
    int life4_6;
    int[] life3_7;
    com.moon.module.impl.ClickGUI life5_15;
    int life6_33;
    forward_join_48: {
    forward_join_46: {
    forward_join_41: {
    forward_join_40: {
    forward_join_27: {
    forward_join_26: {
    forward_join_25: {
    life1_3 = (com.moon.ns.p ^ 124733025625335L);
    spill1128_0 = net.minecraft.entity.player.PlayerCapabilities.b__ArrayInt();
    life4_6 = org.lwjgl.input.Mouse.getDWheel();
    life3_7 = spill1128_0;
    if (!((life4_6 != 0))) {
        break forward_join_48;
    }
    life5_15 = ((com.moon.module.impl.ClickGUI)(((com.moon.fU)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__fU())).a(((java.lang.Class)(com.moon.module.impl.ClickGUI.class)))));
    if (!((((com.moon.pk)(((com.moon.module.impl.ClickGUI)(life5_15)).a__pk())).a__nk() == null))) {
        break forward_join_48;
    }
    spill1128_1 = life4_6;
    if (!((life3_7 == null))) {
        forwardValue1128_25_0 = spill1128_1;
        break forward_join_25;
    }
    if (!((spill1128_1 > 0))) {
        break forward_join_26;
    }
    forwardValue1128_25_0 = 1;
    }
    forwardValue1128_27_0 = forwardValue1128_25_0;
    break forward_join_27;
    }
    forwardValue1128_27_0 = 0;
    }
    life6_33 = forwardValue1128_27_0;
    com.moon.ns __stackOp1128_10_0 = this;
    spill1128_2 = __stackOp1128_10_0;
    spill1128_3 = ((com.moon.ns)(__stackOp1128_10_0)).o;
    spill1128_4 = life6_33;
    if (!((life3_7 == null))) {
        forwardValue1128_40_0 = spill1128_2;
        forwardValue1128_40_1 = spill1128_3;
        forwardValue1128_40_2 = spill1128_4;
        break forward_join_40;
    }
    if (!((spill1128_4 != 0))) {
        forwardValue1128_41_0 = spill1128_2;
        forwardValue1128_41_1 = spill1128_3;
        break forward_join_41;
    }
    forwardValue1128_40_0 = spill1128_2;
    forwardValue1128_40_1 = spill1128_3;
    forwardValue1128_40_2 = __sourceIntrinsic_85f1dd884e89_invokedynamic1128_12(5275, (4324538721158502917L ^ life1_3));
    }
    forwardValue1128_46_0 = forwardValue1128_40_0;
    forwardValue1128_46_1 = forwardValue1128_40_1;
    forwardValue1128_46_2 = forwardValue1128_40_2;
    break forward_join_46;
    }
    forwardValue1128_46_0 = forwardValue1128_41_0;
    forwardValue1128_46_1 = forwardValue1128_41_1;
    forwardValue1128_46_2 = __sourceIntrinsic_85f1dd884e89_invokedynamic1128_13(5558, (1249566600754731821L ^ life1_3));
    }
    ((com.moon.ns)(forwardValue1128_46_0)).o = ((int)((forwardValue1128_46_1 + forwardValue1128_46_2)));
    }
    return;
}


public void c(int p0, int p1) {
int lexicalValue325_226_0;
    int lexicalValue325_228_0;
    int lexicalValue325_255_0;
    com.moon.nX lexicalValue325_282_0;
    int lexicalValue325_282_1;
    com.moon.nX lexicalValue325_284_0;
    com.moon.nX lexicalValue325_285_0;
    float lexicalValue325_285_1;
    com.moon.ns lexicalValue325_311_0;
    int[] spill325_0;
    int spill325_1;
    boolean spill325_2;
    int spill325_3;
    com.moon.nX spill325_4;
    int spill325_5;
    com.moon.ns spill325_6;
    long life3_3;
    int life6_10;
    com.moon.jm life7_15;
    int[] life5_16;
    com.moon.jm life8_21;
    com.moon.hW life9_26;
    com.moon.hW life10_33;
    com.moon.hW life11_40;
    com.moon.hW life12_115;
    com.moon.i3 life13_135;
    java.util.Iterator life14_160;
    com.moon.m4 life15_167;
    com.moon.hW life14_187;
    float life15_218;
    int life16_234;
    lexical_join_311: {
    lexical_join_310: {
    lexical_join_285: {
    lexical_join_284: {
    lexical_join_282: {
    lexical_join_274: {
    lexical_join_255: {
    lexical_join_254: {
    lexical_join_228: {
    lexical_join_227: {
    lexical_join_226: {
    lexical_join_180: {
    lexical_join_179: {
    life3_3 = (com.moon.ns.p ^ 14385194217294L);
    spill325_0 = net.minecraft.entity.player.PlayerCapabilities.b__ArrayInt();
    life6_10 = __sourceIntrinsic_505b8c2844d4_invokedynamic325_2(1480, (8982296638448763115L ^ life3_3));
    life7_15 = ((com.moon.jo)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__jo())).a(((com.moon.ce)(com.moon.ce.INTER_SEMI_BOLD)));
    life5_16 = spill325_0;
    life8_21 = ((com.moon.jo)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__jo())).a(((com.moon.ce)(com.moon.ce.MATERIAL_ICONS)));
    life9_26 = ((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.ROUNDED_RECTANGLE))))).a();
    life10_33 = ((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.MSDF))))).a(((com.moon.jm)(life7_15))))).a();
    life11_40 = ((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.MSDF))))).a(((com.moon.jm)(life8_21))))).a();
    ((com.moon.hW)(life9_26)).a(((com.moon.iX)(com.moon.i3.a(((float)(((com.moon.ns)(this)).a())), ((float)(((com.moon.ns)(this)).b())), ((float)(((com.moon.ns)(this)).c())), ((float)(((com.moon.ns)(this)).d())), ((float)(0x1.ap3f)), ((int)(life6_10))))));
    ((com.moon.jm)(life8_21)).b(((com.moon.hW)(life11_40)), ((java.lang.String)(((com.moon.module.ModuleCategory)(this.n)).c())), ((float)(0x1.8p3f)), ((float)((((com.moon.ns)(this)).a() + 0x1.4p3f))), ((float)((((com.moon.ns)(this)).b() + 0x1.5p3f))), ((int)(__sourceIntrinsic_505b8c2844d4_invokedynamic325_35(9592, (9164937320320278620L ^ life3_3)))));
    ((com.moon.jm)(life7_15)).b(((com.moon.hW)(life10_33)), ((java.lang.String)(((com.moon.module.ModuleCategory)(this.n)).b())), ((float)(0x1.8p3f)), ((float)((((((com.moon.ns)(this)).a() + 0x1.4p3f) + ((com.moon.jm)(life8_21)).a(((java.lang.String)(((com.moon.module.ModuleCategory)(this.n)).c())), ((float)(0x1.8p3f)))) + 0x1.8p2f))), ((float)((((com.moon.ns)(this)).b() + 0x1.1p3f))), ((int)(__sourceIntrinsic_505b8c2844d4_invokedynamic325_44(28015, (8191122327417251919L ^ life3_3)))));
    ((com.moon.hW)(life9_26)).b();
    ((com.moon.hW)(life11_40)).b();
    ((com.moon.hW)(life10_33)).b();
    com.moon.nU.a(((boolean)(false)));
    life12_115 = ((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.ROUNDED_RECTANGLE))))).a();
    life13_135 = com.moon.i3.a(((float)((((com.moon.ns)(this)).a() + 0x1.0p-1f))), ((float)((((com.moon.ns)(this)).b() + 0x1.cp4f))), ((float)((((com.moon.ns)(this)).c() - 0x1.0p0f))), ((float)((((com.moon.ns)(this)).d() - 0x1.c8p4f))), ((float)(0x1.ap3f)), ((int)(-1)));
    ((com.moon.i3)(life13_135)).a(((boolean)(false)));
    ((com.moon.i3)(life13_135)).b(((boolean)(false)));
    ((com.moon.i3)(life13_135)).e(((boolean)(false)));
    ((com.moon.hW)(life12_115)).a(((com.moon.iX)(life13_135)));
    ((com.moon.hW)(life12_115)).b();
    com.moon.nU.b(((boolean)(true)));
    ((com.moon.ns)(this)).f__sourceReturn_da8c82d5d4();
    life14_160 = ((java.util.List)(this.m)).iterator();
    lexical_cycle_161: while (true) {
    if (!(((java.util.Iterator)(life14_160)).hasNext())) {
        break lexical_join_179;
    }
    life15_167 = ((com.moon.m4)(((java.util.Iterator)(life14_160)).next()));
    ((com.moon.m4)(life15_167)).c(((int)(p0)), ((int)(p1)));
    if (!((life5_16 == null))) {
        break lexical_join_180;
    }
    if (!((life5_16 != null))) { continue lexical_cycle_161; }
    break lexical_cycle_161;
    }
    net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[4])));
    }
    com.moon.nU.a();
    }
    life14_187 = ((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.OUTLINE_ROUNDED_RECTANGLE))))).a();
    ((com.moon.hW)(life14_187)).a(((com.moon.iX)(com.moon.i1.a(((float)((((com.moon.ns)(this)).a() - 0x1.0p-1f))), ((float)((((com.moon.ns)(this)).b() - 0x1.0p-1f))), ((float)((((com.moon.ns)(this)).c() + 0x1.0p0f))), ((float)((((com.moon.ns)(this)).d() + 0x1.0p0f))), ((float)(0x1.ap3f)), ((float)(0x1.0p-2f)), ((int)(__sourceIntrinsic_505b8c2844d4_invokedynamic325_82(1830, (5036998362482672128L ^ life3_3))))))));
    ((com.moon.hW)(life14_187)).b();
    life15_218 = ((com.moon.ns)(this)).i();
    spill325_1 = recovery.source.CarrierOps.fcmpl(((float)(life15_218)), ((float)((((com.moon.ns)(this)).d() - 0x1.cp4f))));
    if (!((life5_16 == null))) {
        lexicalValue325_226_0 = spill325_1;
        break lexical_join_226;
    }
    if (!((spill325_1 > 0))) {
        break lexical_join_227;
    }
    lexicalValue325_226_0 = 1;
    }
    lexicalValue325_228_0 = lexicalValue325_226_0;
    break lexical_join_228;
    }
    lexicalValue325_228_0 = 0;
    }
    life16_234 = lexicalValue325_228_0;
    spill325_2 = ((com.moon.ns)(this)).a(((int)(p0)), ((int)(p1)), ((float)(((com.moon.ns)(this)).a())), ((float)((((com.moon.ns)(this)).b() + 0x1.cp4f))), ((float)(((com.moon.ns)(this)).c())), ((float)((((com.moon.ns)(this)).d() - 0x1.cp4f))));
    if (!((life5_16 == null))) {
        lexicalValue325_255_0 = ((spill325_2) ? 1 : 0);
        break lexical_join_255;
    }
    if (!(spill325_2)) {
        break lexical_join_254;
    }
    spill325_3 = life16_234;
    if (!((life5_16 == null))) {
        lexicalValue325_255_0 = spill325_3;
        break lexical_join_255;
    }
    if (!((spill325_3 != 0))) {
        break lexical_join_254;
    }
    ((com.moon.ns)(this)).e__sourceReturn_da8c82d5d4();
    }
    lexicalValue325_255_0 = life16_234;
    }
    if (!((lexicalValue325_255_0 != 0))) {
        break lexical_join_274;
    }
    this.o = ((int)(java.lang.Math.max(((int)(this.o)), ((int)(0)))));
    this.o = ((int)(java.lang.Math.min(((int)(this.o)), ((int)(((int) ((life15_218 - ((com.moon.ns)(this)).d()) + 0x1.cp4f)))))));
    }
    spill325_4 = this.l;
    spill325_5 = life16_234;
    if (!((life5_16 == null))) {
        lexicalValue325_282_0 = spill325_4;
        lexicalValue325_282_1 = spill325_5;
        break lexical_join_282;
    }
    if (!((spill325_5 != 0))) {
        lexicalValue325_284_0 = spill325_4;
        break lexical_join_284;
    }
    lexicalValue325_282_0 = spill325_4;
    lexicalValue325_282_1 = this.o;
    }
    lexicalValue325_285_0 = lexicalValue325_282_0;
    lexicalValue325_285_1 = ((float) lexicalValue325_282_1);
    break lexical_join_285;
    }
    lexicalValue325_285_0 = lexicalValue325_284_0;
    lexicalValue325_285_1 = 0x0.0p0f;
    }
    ((com.moon.nX)(lexicalValue325_285_0)).a(((float)(lexicalValue325_285_1)), ((double)(0x1.99999ap-2d)));
    spill325_6 = this;
    if (!((life5_16 == null))) {
        lexicalValue325_311_0 = spill325_6;
        break lexical_join_311;
    }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(((com.moon.nX)(((com.moon.ns)(spill325_6)).l)).b())), ((float)(((float) this.o)))) > 0))) {
        break lexical_join_310;
    }
    ((com.moon.nX)(this.l)).a(((float)(java.lang.Math.min(((float)(((com.moon.nX)(this.l)).b())), ((float)(((life15_218 - ((com.moon.ns)(this)).d()) + 0x1.cp4f)))))));
    }
    lexicalValue325_311_0 = this;
    }
    __sourceIntrinsic_505b8c2844d4_call325_116(lexicalValue325_311_0, p0, p1);
    return;
}


private void f__sourceReturn_da8c82d5d4() {
int[] spill327_0;
    long life1_3;
    float life4_12;
    java.util.Iterator life5_17;
    int[] life3_18;
    com.moon.m4 life6_25;
    lexical_join_42: {
    life1_3 = (com.moon.ns.p ^ 35302796002201L);
    life4_12 = ((((com.moon.ns)(this)).b() + 0x1.cp4f) - ((com.moon.nX)(this.l)).b());
    spill327_0 = net.minecraft.entity.player.PlayerCapabilities.b__ArrayInt();
    life5_17 = ((java.util.List)(this.m)).iterator();
    life3_18 = spill327_0;
    lexical_cycle_19: while (true) {
    if (!(((java.util.Iterator)(life5_17)).hasNext())) {
        break lexical_join_42;
    }
    life6_25 = ((com.moon.m4)(((java.util.Iterator)(life5_17)).next()));
    ((com.moon.m4)(life6_25)).a(((float)(((com.moon.ns)(this)).a())));
    ((com.moon.m4)(life6_25)).b(((float)(life4_12)));
    life4_12 = (life4_12 + ((com.moon.m4)(life6_25)).d());
    if (!((life3_18 != null))) { continue lexical_cycle_19; }
    break lexical_cycle_19;
    }
    }
    return;
}


public void d__sourceReturn_da8c82d5d4() {
int[] spill326_0;
    long life1_3;
    int[] life3_8;
    float life4_13;
    java.util.List life5_19;
    java.util.Iterator life6_22;
    com.moon.module.Module life7_29;
    com.moon.m4 life8_41;
    moom.ir life6_68;
    lexical_join_64: {
    lexical_join_57: {
    life1_3 = (com.moon.ns.p ^ 116816467138990L);
    spill326_0 = net.minecraft.entity.player.PlayerCapabilities.b__ArrayInt();
    ((java.util.List)(this.m)).clear();
    life3_8 = spill326_0;
    life4_13 = (((com.moon.ns)(this)).b() + 0x1.cp4f);
    life5_19 = ((com.moon.fU)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__fU())).a(((com.moon.module.ModuleCategory)(this.n)));
    life6_22 = ((java.util.List)(life5_19)).iterator();
    lexical_cycle_23: while (true) {
    if (!(((java.util.Iterator)(life6_22)).hasNext())) {
        break lexical_join_57;
    }
    life7_29 = ((com.moon.module.Module)(((java.util.Iterator)(life6_22)).next()));
    life8_41 = new com.moon.m4(this, life7_29, ((com.moon.ns)(this)).a(), life4_13, ((com.moon.ns)(this)).c(), 0x1.7p4f);
    ((com.moon.m4)(life8_41)).a__Void();
    ((java.util.List)(this.m)).add(((java.lang.Object)(life8_41)));
    life4_13 = (life4_13 + 0x1.7p4f);
    if (!((life3_8 == null))) {
        break lexical_join_64;
    }
    if (!((life3_8 != null))) { continue lexical_cycle_23; }
    break lexical_cycle_23;
    }
    }
    ((com.moon.nX)(this.l)).a(((float)(0x0.0p0f)));
    this.o = ((int)(0));
    }
    life6_68 = com.moon.nS.a();
    ((com.moon.ns)(this)).d(((float)(java.lang.Math.min(((float)(((float) (((moom.ir)(life6_68)).b__Int() - __sourceIntrinsic_6cce62949456_invokedynamic326_23(6563, (7153255958046485100L ^ life1_3)))))), ((float)(java.lang.Math.min(((float)(0x1.13p9f)), ((float)((((com.moon.ns)(this)).i() + 0x1.cp4f))))))))));
    return;
}


public void a__Void(boolean p0) {
com.moon.hW forwardValue1122_30_0;
    float forwardValue1122_30_1;
    float forwardValue1122_30_2;
    float forwardValue1122_30_3;
    float forwardValue1122_30_4;
    float forwardValue1122_30_5;
    int forwardValue1122_30_6;
    com.moon.hW forwardValue1122_31_0;
    float forwardValue1122_31_1;
    float forwardValue1122_31_2;
    float forwardValue1122_31_3;
    float forwardValue1122_31_4;
    float forwardValue1122_31_5;
    com.moon.hW forwardValue1122_32_0;
    float forwardValue1122_32_1;
    float forwardValue1122_32_2;
    float forwardValue1122_32_3;
    float forwardValue1122_32_4;
    float forwardValue1122_32_5;
    int forwardValue1122_32_6;
    int[] spill1122_0;
    com.moon.hW spill1122_1;
    float spill1122_2;
    float spill1122_3;
    float spill1122_4;
    float spill1122_5;
    float spill1122_6;
    boolean spill1122_7;
    long life2_3;
    com.moon.hW life5_9;
    int[] life4_10;
    forward_join_32: {
    forward_join_31: {
    forward_join_30: {
    life2_3 = (com.moon.ns.p ^ 47492258644535L);
    spill1122_0 = net.minecraft.entity.player.PlayerCapabilities.b__ArrayInt();
    life5_9 = ((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.ROUNDED_RECTANGLE))))).a();
    life4_10 = spill1122_0;
    spill1122_1 = life5_9;
    spill1122_2 = ((com.moon.ns)(this)).a();
    spill1122_3 = ((com.moon.ns)(this)).b();
    spill1122_4 = ((com.moon.ns)(this)).c();
    spill1122_5 = ((com.moon.ns)(this)).d();
    spill1122_6 = 0x1.ap3f;
    spill1122_7 = p0;
    if (!((life4_10 == null))) {
        forwardValue1122_30_0 = spill1122_1;
        forwardValue1122_30_1 = spill1122_2;
        forwardValue1122_30_2 = spill1122_3;
        forwardValue1122_30_3 = spill1122_4;
        forwardValue1122_30_4 = spill1122_5;
        forwardValue1122_30_5 = spill1122_6;
        forwardValue1122_30_6 = ((spill1122_7) ? 1 : 0);
        break forward_join_30;
    }
    if (!(spill1122_7)) {
        forwardValue1122_31_0 = spill1122_1;
        forwardValue1122_31_1 = spill1122_2;
        forwardValue1122_31_2 = spill1122_3;
        forwardValue1122_31_3 = spill1122_4;
        forwardValue1122_31_4 = spill1122_5;
        forwardValue1122_31_5 = spill1122_6;
        break forward_join_31;
    }
    forwardValue1122_30_0 = spill1122_1;
    forwardValue1122_30_1 = spill1122_2;
    forwardValue1122_30_2 = spill1122_3;
    forwardValue1122_30_3 = spill1122_4;
    forwardValue1122_30_4 = spill1122_5;
    forwardValue1122_30_5 = spill1122_6;
    forwardValue1122_30_6 = __sourceIntrinsic_ca7dbe5e1dac_invokedynamic1122_11(21891, (5427882435329572308L ^ life2_3));
    }
    forwardValue1122_32_0 = forwardValue1122_30_0;
    forwardValue1122_32_1 = forwardValue1122_30_1;
    forwardValue1122_32_2 = forwardValue1122_30_2;
    forwardValue1122_32_3 = forwardValue1122_30_3;
    forwardValue1122_32_4 = forwardValue1122_30_4;
    forwardValue1122_32_5 = forwardValue1122_30_5;
    forwardValue1122_32_6 = forwardValue1122_30_6;
    break forward_join_32;
    }
    forwardValue1122_32_0 = forwardValue1122_31_0;
    forwardValue1122_32_1 = forwardValue1122_31_1;
    forwardValue1122_32_2 = forwardValue1122_31_2;
    forwardValue1122_32_3 = forwardValue1122_31_3;
    forwardValue1122_32_4 = forwardValue1122_31_4;
    forwardValue1122_32_5 = forwardValue1122_31_5;
    forwardValue1122_32_6 = -1;
    }
    ((com.moon.hW)(forwardValue1122_32_0)).a(((com.moon.iX)(com.moon.i3.a(((float)(forwardValue1122_32_1)), ((float)(forwardValue1122_32_2)), ((float)(forwardValue1122_32_3)), ((float)(forwardValue1122_32_4)), ((float)(forwardValue1122_32_5)), ((int)(forwardValue1122_32_6))))));
    ((com.moon.hW)(life5_9)).b();
    return;
}


public int a__sourceReturn_8abf5c6871() {
return this.o;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral3033_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/ns"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 20155;
      if (s[var3] == null) {
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
         long var5 = r[var3];
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
         Object[] var9 = (Object[])t.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               t.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/moon/ns", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         s[var3] = var15;
      }

      return s[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.ns.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public void a(int p0, int p1, int p2) {
int[] spill322_0;
    long life4_3;
    java.util.Iterator life7_8;
    int[] life6_9;
    com.moon.m4 life8_16;
    lexical_join_31: {
    lexical_join_26: {
    life4_3 = (com.moon.ns.p ^ 36768921699623L);
    spill322_0 = net.minecraft.entity.player.PlayerCapabilities.b__ArrayInt();
    life7_8 = ((java.util.List)(this.m)).iterator();
    life6_9 = spill322_0;
    lexical_cycle_10: while (true) {
    if (!(((java.util.Iterator)(life7_8)).hasNext())) {
        break lexical_join_26;
    }
    life8_16 = ((com.moon.m4)(((java.util.Iterator)(life7_8)).next()));
    ((com.moon.m4)(life8_16)).a(((int)(p0)), ((int)(p1)), ((int)(p2)));
    if (!((life6_9 == null))) {
        break lexical_join_31;
    }
    if (!((life6_9 != null))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    super.a(((int)(p0)), ((int)(p1)), ((int)(p2)));
    }
    return;
}


public void a(char p0, int p1) {
int[] spill320_0;
    long life3_3;
    java.util.Iterator life6_8;
    int[] life5_9;
    com.moon.m4 life7_16;
    lexical_join_29: {
    lexical_join_25: {
    life3_3 = (com.moon.ns.p ^ 113037557809930L);
    spill320_0 = net.minecraft.entity.player.PlayerCapabilities.b__ArrayInt();
    life6_8 = ((java.util.List)(this.m)).iterator();
    life5_9 = spill320_0;
    lexical_cycle_10: while (true) {
    if (!(((java.util.Iterator)(life6_8)).hasNext())) {
        break lexical_join_25;
    }
    life7_16 = ((com.moon.m4)(((java.util.Iterator)(life6_8)).next()));
    ((com.moon.m4)(life7_16)).a(((char)(p0)), ((int)(p1)));
    if (!((life5_9 == null))) {
        break lexical_join_29;
    }
    if (!((life5_9 != null))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    super.a(((char)(p0)), ((int)(p1)));
    }
    return;
}


public void a(int p0, int p1) {
int[] spill321_0;
    long life3_3;
    com.moon.hW life6_11;
    com.moon.i3 life7_31;
    int[] life5_32;
    java.util.Iterator life8_55;
    com.moon.m4 life9_62;
    lexical_join_76: {
    lexical_join_71: {
    life3_3 = (com.moon.ns.p ^ 30117123104016L);
    spill321_0 = net.minecraft.entity.player.PlayerCapabilities.b__ArrayInt();
    com.moon.nU.a(((boolean)(false)));
    life6_11 = ((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.ROUNDED_RECTANGLE))))).a();
    life7_31 = com.moon.i3.a(((float)((((com.moon.ns)(this)).a() + 0x1.0p-1f))), ((float)((((com.moon.ns)(this)).b() + 0x1.cp4f))), ((float)((((com.moon.ns)(this)).c() - 0x1.0p0f))), ((float)((((com.moon.ns)(this)).d() - 0x1.c8p4f))), ((float)(0x1.ap3f)), ((int)(-1)));
    life5_32 = spill321_0;
    ((com.moon.i3)(life7_31)).a(((boolean)(false)));
    ((com.moon.i3)(life7_31)).b(((boolean)(false)));
    ((com.moon.i3)(life7_31)).e(((boolean)(false)));
    ((com.moon.hW)(life6_11)).a(((com.moon.iX)(life7_31)));
    ((com.moon.hW)(life6_11)).b();
    com.moon.nU.b(((boolean)(true)));
    life8_55 = ((java.util.List)(this.m)).iterator();
    lexical_cycle_56: while (true) {
    if (!(((java.util.Iterator)(life8_55)).hasNext())) {
        break lexical_join_71;
    }
    life9_62 = ((com.moon.m4)(((java.util.Iterator)(life8_55)).next()));
    ((com.moon.m4)(life9_62)).a(((int)(p0)), ((int)(p1)));
    if (!((life5_32 == null))) {
        break lexical_join_76;
    }
    if (!((life5_32 != null))) { continue lexical_cycle_56; }
    break lexical_cycle_56;
    }
    }
    com.moon.nU.a();
    super.a(((int)(p0)), ((int)(p1)));
    }
    return;
}


public com.moon.nX a__nX() {
return this.l;
}


public java.util.List<com.moon.m4> a__List() {
return this.m;
}


public com.moon.module.ModuleCategory a__a5() {
return this.n;
}


private static native <E extends Throwable> int __sourceIntrinsic_dc7488ca67a2b43e_originalDynamicSite206_38(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral3033_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ca7dbe5e1dac_invokedynamic1122_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_45fde0f4e55e_invokedynamic323_27(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_45fde0f4e55e_invokedynamic323_28(int a0, long a1) throws E;

private static native <E extends Throwable> void __sourceIntrinsic_9bf881b104f5_call1125_29(com.moon.ns a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_505b8c2844d4_invokedynamic325_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_505b8c2844d4_invokedynamic325_35(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_505b8c2844d4_invokedynamic325_44(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_505b8c2844d4_invokedynamic325_82(int a0, long a1) throws E;

private static native <E extends Throwable> void __sourceIntrinsic_505b8c2844d4_call325_116(com.moon.ns a0, int a1, int a2) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6cce62949456_invokedynamic326_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_85f1dd884e89_invokedynamic1128_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_85f1dd884e89_invokedynamic1128_13(int a0, long a1) throws E;
}
