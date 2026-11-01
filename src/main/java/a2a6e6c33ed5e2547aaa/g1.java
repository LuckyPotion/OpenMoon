package com.moon;


public class g1 extends com.moon.gZ {

private static net.minecraft.client.Minecraft c;

private com.moon.iu d;

private java.util.function.Predicate<net.minecraft.entity.Entity> e;

private com.moon.module.impl.StorageEsp f;

private static long g;

private static long h;

public g1(com.moon.module.impl.ESP p0, com.moon.module.impl.StorageEsp p1, java.util.function.Predicate<net.minecraft.entity.Entity> p2) { super((com.moon.module.impl.ESP)null); }


private static void __sourceConstructorBody_6c3b218e5f9cf8a7(com.moon.g1 receiver, com.moon.module.impl.ESP p0, com.moon.module.impl.StorageEsp p1, java.util.function.Predicate p2) throws Throwable {

long local4_life1 = (com.moon.g1.g ^ 97282503770939L);

    com.moon.g1.__sourceConstructorInit_6c3b218e5f9cf8a7_0(((com.moon.g1)(receiver)), ((com.moon.module.impl.ESP)(p0)));

    java.lang.String __sourceSpill48_5 = moom.gc.a__String();

    ((com.moon.g1)(receiver)).d = ((com.moon.iu)(new com.moon.iu(1, 1, false)));

    ((com.moon.g1)(receiver)).f = ((com.moon.module.impl.StorageEsp)(p1));

    java.lang.String local6_life7 = __sourceSpill48_5;

    ((com.moon.g1)(receiver)).e = ((java.util.function.Predicate)(p2));

    if ((net.minecraft.entity.Entity.b__ArrayString() != null)) {

        moom.gc.a(((java.lang.String)("vuE1Gb")));

    }

    return;

}



static {
g = ((long)(((moom._a)(moom._c.a(((long)(-1525219007943617745L)), ((long)(2989899438720033929L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(121258259454814L)))));
    long local0_life6 = (com.moon.g1.g ^ 20584872574609L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill105_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill105_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill105_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill105_13 = new byte[8];
    (__sourceSpill105_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill105_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation105_15 = __sourceSpill105_13;
    ((javax.crypto.Cipher)(__sourceSpill105_10)).init(((int)(__sourceSpill105_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill105_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation105_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = 3976880328100160106L;
    byte[] __sourceSpill105_19 = new byte[8];
    (__sourceSpill105_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill105_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill105_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill105_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill105_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill105_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill105_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill105_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill105_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill105_20)).doFinal(((byte[])(__sourceSpill105_19)));
    h = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
    c = ((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM()));
}

private static native <E extends Throwable> void __sourceConstructorInit_6c3b218e5f9cf8a7_0(com.moon.g1 a0, com.moon.module.impl.ESP a1) throws E;

public void b__Void() {
return;
}


public void c__Void() {
((com.moon.g1)(this)).d();
    return;
}


public void d() {
com.moon.iu lexicalValue39_70_0;
    int lexicalValue39_70_1;
    int lexicalValue39_89_0;
    int lexicalValue39_98_0;
    int lexicalValue39_126_0;
    int lexicalValue39_131_0;
    java.awt.Color lexicalValue39_148_0;
    int lexicalValue39_161_0;
    int lexicalValue39_170_0;
    int lexicalValue39_179_0;
    int lexicalValue39_203_0;
    int lexicalValue39_230_0;
    java.lang.String spill39_0;
    com.moon.iu spill39_1;
    int spill39_2;
    boolean spill39_3;
    boolean spill39_4;
    java.awt.Color spill39_5;
    boolean spill39_6;
    boolean spill39_7;
    long life1_3;
    int life4_21;
    java.lang.String life3_22;
    java.awt.Color life5_81;
    java.util.Iterator life6_121;
    net.minecraft.tileentity.TileEntity life7_128;
    java.awt.Color life8_171;
    java.util.Iterator life6_235;
    net.minecraft.entity.Entity life7_242;
    java.awt.Color life8_272;
    lexical_join_272: {
    lexical_join_233: {
    lexical_join_180: {
    lexical_join_179: {
    lexical_join_170: {
    lexical_join_161: {
    lexical_join_158: {
    lexical_join_99: {
    lexical_join_98: {
    lexical_join_89: {
    lexical_join_70: {
    lexical_join_67: {
    life1_3 = (com.moon.g1.g ^ 50024287318538L);
    moom.kZ.l();
    moom.kZ.i();
    spill39_0 = moom.gc.a__String();
    ((net.minecraft.client.renderer.EntityRenderer)(((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).R)).a(((float)(((moom.DM)(((net.minecraft.client.Minecraft)(com.moon.g1.c)).l)).b)), ((int)(0)));
    net.minecraft.client.renderer.OpenGlHelper.a(((int)(net.minecraft.client.renderer.OpenGlHelper.r)), ((float)(0x1.ep7f)), ((float)(0x1.ep7f)));
    life4_21 = ((((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(com.moon.g1.c)).W)).aj) ? 1 : 0);
    life3_22 = spill39_0;
    ((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(com.moon.g1.c)).W)).aj = ((boolean)(false));
    ((net.minecraft.client.renderer.entity.RenderManager)(((net.minecraft.client.Minecraft)(com.moon.g1.c)).a__nw())).a(((boolean)(true)));
    ((net.minecraft.client.renderer.entity.RenderManager)(((net.minecraft.client.Minecraft)(com.moon.g1.c)).a__nw())).b(((boolean)(false)));
    ((net.minecraft.client.renderer.entity.RenderManager)(((net.minecraft.client.Minecraft)(com.moon.g1.c)).a__nw())).c(((boolean)(false)));
    ((net.minecraft.client.renderer.entity.RenderManager)(((net.minecraft.client.Minecraft)(com.moon.g1.c)).a__nw())).d(((boolean)(false)));
    ((net.minecraft.client.renderer.entity.RenderManager)(((net.minecraft.client.Minecraft)(com.moon.g1.c)).a__nw())).e(((boolean)(true)));
    spill39_1 = this.d;
    spill39_2 = ((net.minecraft.client.Minecraft)(com.moon.g1.c)).G;
    if (!((life3_22 != null))) {
        lexicalValue39_70_0 = spill39_1;
        lexicalValue39_70_1 = spill39_2;
        break lexical_join_70;
    }
    if (!(((com.moon.iu)(spill39_1)).a__Boolean(((int)(spill39_2)), ((int)(((net.minecraft.client.Minecraft)(com.moon.g1.c)).H))))) {
        break lexical_join_67;
    }
    ((com.moon.iu)(this.d)).a(((int)(((int) com.moon.g1.h))));
    }
    lexicalValue39_70_0 = this.d;
    lexicalValue39_70_1 = 0;
    }
    ((com.moon.iu)(lexicalValue39_70_0)).a(((boolean)__sourceIntrinsic_integerToBoolean((lexicalValue39_70_1))));
    ((com.moon.iu)(this.d)).e();
    life5_81 = null;
    com.moon.nF.a();
    spill39_3 = ((com.moon.module.impl.StorageEsp)(this.f)).isEnabled();
    if (!((life3_22 != null))) {
        lexicalValue39_89_0 = ((spill39_3) ? 1 : 0);
        break lexical_join_89;
    }
    if (!(spill39_3)) {
        break lexical_join_158;
    }
    lexicalValue39_89_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.StorageEsp)(this.f)).f())).getValue())))).booleanValue()) ? 1 : 0);
    }
    if (!((life3_22 != null))) {
        lexicalValue39_98_0 = lexicalValue39_89_0;
        break lexical_join_98;
    }
    if (!((lexicalValue39_89_0 == 0))) {
        break lexical_join_99;
    }
    lexicalValue39_98_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.StorageEsp)(this.f)).g())).getValue())))).booleanValue()) ? 1 : 0);
    }
    if (!((lexicalValue39_98_0 != 0))) {
        break lexical_join_158;
    }
    }
    life6_121 = ((java.util.List)(((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(com.moon.g1.c)).I)).e)).iterator();
    lexical_cycle_104: while (true) {
    lexical_join_156: {
    lexical_join_149: {
    lexical_join_148: {
    lexical_join_132: {
    lexical_join_131: {
    lexical_join_126: {
    lexical_join_124: {
    if (!(((java.util.Iterator)(life6_121)).hasNext())) {
        break lexical_join_158;
    }
    life7_128 = ((net.minecraft.tileentity.TileEntity)(((java.util.Iterator)(life6_121)).next()));
    spill39_4 = com.moon.nG.a(((moom.CA)(((net.minecraft.tileentity.TileEntity)(life7_128)).a())));
    if (!((life3_22 != null))) {
        lexicalValue39_161_0 = ((spill39_4) ? 1 : 0);
        break lexical_join_161;
    }
    if (!((life3_22 != null))) {
        lexicalValue39_126_0 = ((spill39_4) ? 1 : 0);
        break lexical_join_126;
    }
    if (!((!spill39_4))) {
        break lexical_join_124;
    }
    if (!((life3_22 == null))) { continue lexical_cycle_104; }
    net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[4])));
    }
    lexicalValue39_126_0 = ((life7_128 instanceof net.minecraft.tileentity.TileEntityChest) ? 1 : 0);
    }
    if (!((life3_22 != null))) {
        lexicalValue39_131_0 = lexicalValue39_126_0;
        break lexical_join_131;
    }
    if (!((lexicalValue39_126_0 == 0))) {
        break lexical_join_132;
    }
    lexicalValue39_131_0 = ((life7_128 instanceof moom.Cg) ? 1 : 0);
    }
    if (!((lexicalValue39_131_0 != 0))) {
        break lexical_join_156;
    }
    }
    life8_171 = new java.awt.Color(((com.moon.g1)(this)).a(((net.minecraft.tileentity.TileEntity)(life7_128))));
    spill39_5 = life8_171;
    if (!((life3_22 != null))) {
        lexicalValue39_148_0 = spill39_5;
        break lexical_join_148;
    }
    if (!((!((java.awt.Color)(spill39_5)).equals(((java.lang.Object)(life5_81)))))) {
        break lexical_join_149;
    }
    com.moon.nF.a(((java.awt.Color)(life8_171)));
    lexicalValue39_148_0 = life8_171;
    }
    life5_81 = lexicalValue39_148_0;
    }
    ((moom.oo)(moom.oo.b)).a(((net.minecraft.tileentity.TileEntity)(life7_128)), ((float)(((moom.DM)(((net.minecraft.client.Minecraft)(com.moon.g1.c)).l)).b)), ((int)(-1)));
    }
    if (!((life3_22 == null))) { continue lexical_cycle_104; }
    break lexical_cycle_104;
    }
    }
    lexicalValue39_161_0 = ((((com.moon.module.impl.ESP)(((com.moon.g1)(this)).a())).isEnabled()) ? 1 : 0);
    }
    if (!((life3_22 != null))) {
        lexicalValue39_170_0 = lexicalValue39_161_0;
        break lexical_join_170;
    }
    if (!((lexicalValue39_161_0 != 0))) {
        break lexical_join_233;
    }
    lexicalValue39_170_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.ESP)(((com.moon.g1)(this)).a())).o())).getValue())))).booleanValue()) ? 1 : 0);
    }
    if (!((life3_22 != null))) {
        lexicalValue39_179_0 = lexicalValue39_170_0;
        break lexical_join_179;
    }
    if (!((lexicalValue39_170_0 == 0))) {
        break lexical_join_180;
    }
    lexicalValue39_179_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.ESP)(((com.moon.g1)(this)).a())).r())).getValue())))).booleanValue()) ? 1 : 0);
    }
    if (!((lexicalValue39_179_0 != 0))) {
        break lexical_join_233;
    }
    }
    life6_235 = ((java.util.List)(((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(com.moon.g1.c)).I)).c)).iterator();
    lexical_cycle_185: while (true) {
    lexical_join_230: {
    lexical_join_223: {
    lexical_join_206: {
    lexical_join_203: {
    if (!(((java.util.Iterator)(life6_235)).hasNext())) {
        break lexical_join_233;
    }
    life7_242 = ((net.minecraft.entity.Entity)(((java.util.Iterator)(life6_235)).next()));
    if (!((life3_22 != null))) {
        break lexical_join_272;
    }
    spill39_6 = ((java.util.function.Predicate)(this.e)).test(((java.lang.Object)(life7_242)));
    if (!((life3_22 != null))) {
        lexicalValue39_203_0 = ((spill39_6) ? 1 : 0);
        break lexical_join_203;
    }
    if (!(spill39_6)) { continue lexical_cycle_185; }
    lexicalValue39_203_0 = ((com.moon.nG.a(((net.minecraft.entity.Entity)(life7_242)))) ? 1 : 0);
    }
    if (!((lexicalValue39_203_0 == 0))) {
        break lexical_join_206;
    }
    if (!((life3_22 == null))) { continue lexical_cycle_185; }
    }
    life8_272 = new java.awt.Color(((com.moon.g1)(this)).a__sourceReturn_76fdd6cb4a(((net.minecraft.entity.Entity)(life7_242))));
    spill39_7 = ((java.awt.Color)(life8_272)).equals(((java.lang.Object)(life5_81)));
    if (!((life3_22 != null))) {
        lexicalValue39_230_0 = ((spill39_7) ? 1 : 0);
        break lexical_join_230;
    }
    if (!((!spill39_7))) {
        break lexical_join_223;
    }
    com.moon.nF.a(((java.awt.Color)(life8_272)));
    life5_81 = life8_272;
    }
    lexicalValue39_230_0 = ((((net.minecraft.client.renderer.entity.RenderManager)(((net.minecraft.client.Minecraft)(com.moon.g1.c)).a__nw())).a__Boolean(((net.minecraft.entity.Entity)(life7_242)), ((float)(((moom.DM)(((net.minecraft.client.Minecraft)(com.moon.g1.c)).l)).b)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(lexicalValue39_230_0);
    if (!((life3_22 == null))) { continue lexical_cycle_185; }
    break lexical_cycle_185;
    }
    }
    com.moon.nF.a();
    moom.kZ.j();
    moom.lt.a();
    ((net.minecraft.client.renderer.EntityRenderer)(((net.minecraft.client.Minecraft)(com.moon.g1.c)).R)).f();
    ((net.minecraft.client.renderer.entity.RenderManager)(((net.minecraft.client.Minecraft)(com.moon.g1.c)).a__nw())).a(((boolean)(false)));
    ((net.minecraft.client.renderer.entity.RenderManager)(((net.minecraft.client.Minecraft)(com.moon.g1.c)).a__nw())).b(((boolean)(true)));
    ((net.minecraft.client.renderer.entity.RenderManager)(((net.minecraft.client.Minecraft)(com.moon.g1.c)).a__nw())).c(((boolean)(true)));
    ((net.minecraft.client.renderer.entity.RenderManager)(((net.minecraft.client.Minecraft)(com.moon.g1.c)).a__nw())).d(((boolean)(true)));
    ((net.minecraft.client.renderer.entity.RenderManager)(((net.minecraft.client.Minecraft)(com.moon.g1.c)).a__nw())).e(((boolean)(false)));
    ((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(com.moon.g1.c)).W)).aj = ((boolean)__sourceIntrinsic_integerToBoolean((life4_21)));
    ((net.minecraft.client.shader.Framebuffer)(((net.minecraft.client.Minecraft)(com.moon.g1.c)).a__pA())).a(((boolean)(false)));
    }
    return;
}


public com.moon.iu a__sourceReturn_5e9ab4bfb0() {
return this.d;
}


public java.util.function.Predicate<net.minecraft.entity.Entity> a__Predicate() {
return this.e;
}


public com.moon.module.impl.StorageEsp a__l3() {
return this.f;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a__Void() {
return;
}


public boolean a__Boolean() {
return ((1) != 0);
}


public int a__sourceReturn_76fdd6cb4a(net.minecraft.entity.Entity p0) {
int forwardValue211_28_0;
    int forwardValue211_40_0;
    int forwardValue211_52_0;
    int forwardValue211_63_0;
    int spill211_0;
    int spill211_1;
    long life2_3;
    java.lang.String life4_5;
    net.minecraft.entity.EntityLivingBase life5_16;
    forward_join_63: {
    forward_join_62: {
    forward_join_52: {
    forward_join_50: {
    forward_join_40: {
    forward_join_38: {
    forward_join_28: {
    forward_join_26: {
    life2_3 = (com.moon.g1.g ^ 37426303686999L);
    life4_5 = moom.gc.a__String();
    spill211_0 = ((p0 instanceof net.minecraft.entity.EntityLivingBase) ? 1 : 0);
    if (!((life4_5 != null))) {
        forwardValue211_28_0 = spill211_0;
        break forward_join_28;
    }
    if (!((spill211_0 != 0))) {
        break forward_join_26;
    }
    life5_16 = ((net.minecraft.entity.EntityLivingBase)(p0));
    spill211_1 = ((net.minecraft.entity.EntityLivingBase)(life5_16)).aO;
    if (!((life4_5 != null))) {
        forwardValue211_28_0 = spill211_1;
        break forward_join_28;
    }
    if (!((spill211_1 > 0))) {
        break forward_join_26;
    }
    return ((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.ColorSetting)(((com.moon.module.impl.ESP)(((com.moon.g1)(this)).a())).k__kX())).getValue())))).intValue();
    }
    forwardValue211_28_0 = ((p0 instanceof moom.sZ) ? 1 : 0);
    }
    if (!((life4_5 != null))) {
        forwardValue211_40_0 = forwardValue211_28_0;
        break forward_join_40;
    }
    if (!((forwardValue211_28_0 != 0))) {
        break forward_join_38;
    }
    return ((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.ColorSetting)(((com.moon.module.impl.ESP)(((com.moon.g1)(this)).a())).j__kX())).getValue())))).intValue();
    }
    forwardValue211_40_0 = ((p0 instanceof moom.sK) ? 1 : 0);
    }
    if (!((life4_5 != null))) {
        forwardValue211_52_0 = forwardValue211_40_0;
        break forward_join_52;
    }
    if (!((forwardValue211_40_0 != 0))) {
        break forward_join_50;
    }
    return ((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.ColorSetting)(((com.moon.module.impl.ESP)(((com.moon.g1)(this)).a())).i__kX())).getValue())))).intValue();
    }
    forwardValue211_52_0 = ((p0 instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0);
    }
    if (!((life4_5 != null))) {
        forwardValue211_63_0 = forwardValue211_52_0;
        break forward_join_63;
    }
    if (!((forwardValue211_52_0 != 0))) {
        break forward_join_62;
    }
    return ((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.ColorSetting)(((com.moon.module.impl.ESP)(((com.moon.g1)(this)).a())).h__kX())).getValue())))).intValue();
    }
    forwardValue211_63_0 = -1;
    }
    return forwardValue211_63_0;
}


public int a(net.minecraft.tileentity.TileEntity p0) {
int forwardValue212_33_0;
    int forwardValue212_36_0;
    int forwardValue212_47_0;
    int spill212_0;
    int spill212_1;
    long life2_3;
    java.lang.String life4_5;
    net.minecraft.tileentity.TileEntityChest life5_16;
    forward_join_47: {
    forward_join_46: {
    forward_join_36: {
    forward_join_34: {
    forward_join_33: {
    forward_join_27: {
    life2_3 = (com.moon.g1.g ^ 69916168518509L);
    life4_5 = moom.gc.a__String();
    spill212_0 = ((p0 instanceof net.minecraft.tileentity.TileEntityChest) ? 1 : 0);
    if (!((life4_5 != null))) {
        forwardValue212_36_0 = spill212_0;
        break forward_join_36;
    }
    if (!((spill212_0 != 0))) {
        break forward_join_34;
    }
    life5_16 = ((net.minecraft.tileentity.TileEntityChest)(p0));
    spill212_1 = ((net.minecraft.tileentity.TileEntityChest)(life5_16)).h();
    if (!((life4_5 != null))) {
        forwardValue212_33_0 = spill212_1;
        break forward_join_33;
    }
    if (!((spill212_1 == 1))) {
        break forward_join_27;
    }
    return ((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.ColorSetting)(((com.moon.module.impl.StorageEsp)(this.f)).e__kX())).getValue())))).intValue();
    }
    forwardValue212_33_0 = ((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.ColorSetting)(((com.moon.module.impl.StorageEsp)(this.f)).d__kX())).getValue())))).intValue();
    }
    return forwardValue212_33_0;
    }
    forwardValue212_36_0 = ((p0 instanceof moom.Cg) ? 1 : 0);
    }
    if (!((life4_5 != null))) {
        forwardValue212_47_0 = forwardValue212_36_0;
        break forward_join_47;
    }
    if (!((forwardValue212_36_0 != 0))) {
        break forward_join_46;
    }
    return ((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.ColorSetting)(((com.moon.module.impl.StorageEsp)(this.f)).f__kX())).getValue())))).intValue();
    }
    forwardValue212_47_0 = -1;
    }
    return forwardValue212_47_0;
}


private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
