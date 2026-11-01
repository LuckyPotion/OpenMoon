package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class lm {

private static final moom.DD a;

private static final moom.DD b;

private final net.minecraft.client.Minecraft c;

private net.minecraft.item.ItemStack d;

private float e;

private float f;

private final net.minecraft.client.renderer.entity.RenderManager g;

private final net.minecraft.client.renderer.entity.RenderItem h;

private int i;

private com.moon.module.impl.Animations j;

private static final long k;

private static final long[] l;

private static final java.lang.Integer[] m;

private static final java.util.Map n;

public lm(net.minecraft.client.Minecraft p0) {
super();
    this.i = -1;
    this.c = p0;
    this.g = (p0).a__nw();
    this.h = (p0).a__nv();
}


static {
k = ((long)(((moom._a)(moom._c.a(((long)(610257748886292625L)), ((long)(-5134353382800578955L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(84618029127728L)))));
    n = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.lm.k ^ 90326719580785L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1387_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1387_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1387_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1387_14 = new byte[8];
    (__sourceSpill1387_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1387_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1387_16 = __sourceSpill1387_14;
    ((javax.crypto.Cipher)(__sourceSpill1387_11)).init(((int)(__sourceSpill1387_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1387_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1387_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[11];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "ò¡­¡øl3;=\025Â×\037³\024\002íD¡Ï\023çñü.Ø\013£\fùÁãûÇ\0267ÐcO+áR9q^ò\004ÛÕ\037[;Ð_\022GMx{sÝ\021\000"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1387_25 = local6_life21;
        int __sourceSpill1387_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1387_25)).substring(((int)(__sourceSpill1387_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1387_30 = local8_life19;
        int __sourceSpill1387_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1387_33 = new byte[8];
        (__sourceSpill1387_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1387_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1387_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1387_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1387_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1387_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1387_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1387_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1387_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1387_34)).doFinal(((byte[])(__sourceSpill1387_33)));
        (__sourceSpill1387_30)[__sourceSpill1387_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "A\036\035²î{Z}\007L\000Ê\033\nøB"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1387_38 = local6_life21;
        int __sourceSpill1387_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1387_38)).substring(((int)(__sourceSpill1387_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1387_43 = local8_life19;
        int __sourceSpill1387_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1387_46 = new byte[8];
        (__sourceSpill1387_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1387_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1387_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1387_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1387_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1387_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1387_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1387_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1387_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1387_47)).doFinal(((byte[])(__sourceSpill1387_46)));
        (__sourceSpill1387_43)[__sourceSpill1387_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    l = ((long[])(local8_life19));
    m = ((java.lang.Integer[])(new java.lang.Integer[11]));
    a = ((moom.DD)(new moom.DD("textures/map/map_background.png")));
    b = ((moom.DD)(new moom.DD("textures/misc/underwater.png")));
}


private void b(moom.nr p0) {
moom.kZ.B();
    moom.kZ.b(((float)(0x1.7p6f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)));
    moom.kZ.b(((float)(0x1.68p5f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)));
    moom.kZ.b(((float)(0x1.48p5f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)));
    moom.kZ.b(((float)(-0x1.333334p-2f)), ((float)(-0x1.19999ap0f)), ((float)(0x1.ccccccp-2f)));
    ((moom.nr)(p0)).c(((moom.to)(((net.minecraft.client.Minecraft)(this.c)).K)));
    moom.kZ.C();
    return;
}


private void b(moom.to p0) {
((net.minecraft.client.renderer.texture.TextureManager)(((net.minecraft.client.Minecraft)(this.c)).a__ok())).a__Void(((moom.DD)(((moom.to)(p0)).a__DD())));
    java.lang.Object local2 = ((net.minecraft.client.renderer.entity.RenderManager)(this.g)).a(((net.minecraft.entity.Entity)(((net.minecraft.client.Minecraft)(this.c)).K)));
    java.lang.Object local3 = ((moom.nr)(local2));
    if ((__sourceIntrinsic_booleanComparison(((moom.to)(p0)).v__Boolean()) == 0)) {
        moom.kZ.p();
        this.a(((moom.nr)(local3)));
        this.b(((moom.nr)(local3)));
        moom.kZ.o();
    }
    return;
}


public void b() {
int forwardValue3758_35_0;
    float forwardValue3758_43_0;
    net.minecraft.client.entity.EntityPlayerSP life1_7;
    net.minecraft.item.ItemStack life2_11;
    int life3_13;
    float life4_48;
    float life5_56;
    float life6_65;
    forward_join_76: {
    forward_join_43: {
    forward_join_42: {
    forward_join_36: {
    forward_join_35: {
    forward_join_34: {
    forward_join_32: {
    forward_join_27: {
    this.f = ((float)(this.e));
    life1_7 = ((net.minecraft.client.Minecraft)(this.c)).K;
    life2_11 = ((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.entity.player.EntityPlayer)(life1_7)).bD)).b__xW();
    life3_13 = 0;
    if (!((this.d != null))) {
        break forward_join_27;
    }
    if (!((life2_11 != null))) {
        break forward_join_27;
    }
    if (!((!((net.minecraft.item.ItemStack)(this.d)).c(((net.minecraft.item.ItemStack)(life2_11)))))) {
        break forward_join_36;
    }
    life3_13 = 1;
    break forward_join_36;
    }
    if (!((this.d == null))) {
        break forward_join_32;
    }
    if (!((life2_11 != null))) {
        break forward_join_34;
    }
    }
    forwardValue3758_35_0 = 1;
    break forward_join_35;
    }
    forwardValue3758_35_0 = 0;
    }
    life3_13 = forwardValue3758_35_0;
    }
    life4_48 = 0x1.99999ap-2f;
    if (!((life3_13 != 0))) {
        break forward_join_42;
    }
    forwardValue3758_43_0 = 0x0.0p0f;
    break forward_join_43;
    }
    forwardValue3758_43_0 = 0x1.0p0f;
    }
    life5_56 = forwardValue3758_43_0;
    life6_65 = moom.Dr.a(((float)((life5_56 - this.e))), ((float)((-life4_48))), ((float)(life4_48)));
    moom.lm __stackOp3758_12_0 = this;
    ((moom.lm)(__stackOp3758_12_0)).e = ((float)((((moom.lm)(__stackOp3758_12_0)).e + life6_65)));
    if (!((recovery.source.CarrierOps.fcmpg(((float)(this.e)), ((float)(0x1.99999ap-4f))) < 0))) {
        break forward_join_76;
    }
    this.d = ((net.minecraft.item.ItemStack)(life2_11));
    this.i = ((int)(((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.entity.player.EntityPlayer)(life1_7)).bD)).c));
    if (!(moom.BU.ap())) {
        break forward_join_76;
    }
    moom.MP.a(((net.minecraft.item.ItemStack)(life2_11)));
    }
    return;
}


private void b(float p0, float p1) {
moom.kZ.b(((float)(0x1.1eb852p-1f)), ((float)(-0x1.0a3d7p-1f)), ((float)(-0x1.70a3d6p-1f)));
    moom.kZ.b(((float)(0x0.0p0f)), ((float)((p0 * -0x1.333334p-1f))), ((float)(0x0.0p0f)));
    moom.kZ.b(((float)(0x1.68p5f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)));
    float local3 = moom.Dr.a(((float)(((p1 * p1) * 0x1.921fb6p1f))));
    float local4 = moom.Dr.a(((float)((moom.Dr.c(((float)(p1))) * 0x1.921fb6p1f))));
    moom.kZ.b(((float)((local3 * -0x1.4p4f))), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)));
    moom.kZ.b(((float)((local4 * -0x1.4p4f))), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)));
    moom.kZ.b(((float)((local4 * -0x1.4p6f))), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)));
    moom.kZ.a(((float)(0x1.99999ap-2f)), ((float)(0x1.99999ap-2f)), ((float)(0x1.99999ap-2f)));
    return;
}


public void b(float p0) {
float life2_29;
    net.minecraft.client.entity.EntityPlayerSP life3_33;
    float life4_37;
    float life5_48;
    float life6_59;
    com.moon.eL life7_79;
    moom.a1 life8_133;
    double life9_181;
    float life11_184;
    float life12_223;
    float life12_261;
    float life13_269;
    float life12_300;
    float life12_341;
    float life12_382;
    forest_join_435: {
    forest_join_432: {
    forest_join_424: {
    forest_join_417: {
    forest_join_410: {
    forest_join_409: {
    forest_join_401: {
    forest_join_394: {
    forest_join_393: {
    forest_join_369: {
    forest_join_328: {
    forest_join_287: {
    forest_join_239: {
    forest_join_202: {
    forest_join_193: {
    forest_join_186: {
    forest_join_172: {
    forest_join_147: {
    forest_join_138: {
    forest_join_133: {
    forest_join_124: {
    forest_join_118: {
    forest_join_106: {
    forest_join_14: {
    forest_join_4: {
    if (!(moom.BU.ap())) {
        break forest_join_4;
    }
    if (!((!moom.MP.p__Boolean()))) {
        break forest_join_435;
    }
    }
    if (!((this.j == null))) {
        break forest_join_14;
    }
    this.j = ((com.moon.module.impl.Animations)(((com.moon.module.impl.Animations)(((com.moon.fU)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__fU())).a(((java.lang.Class)(com.moon.module.impl.Animations.class)))))));
    }
    life2_29 = (0x1.0p0f - (this.f + ((this.e - this.f) * p0)));
    life3_33 = ((net.minecraft.client.Minecraft)(this.c)).K;
    life4_37 = ((net.minecraft.client.entity.EntityPlayerSP)(life3_33)).b__sourceReturn_f6c4892e39(((float)(p0)));
    life5_48 = (((net.minecraft.client.entity.EntityPlayerSP)(life3_33)).z + ((((net.minecraft.client.entity.EntityPlayerSP)(life3_33)).x - ((net.minecraft.client.entity.EntityPlayerSP)(life3_33)).z) * p0));
    life6_59 = (((net.minecraft.client.entity.EntityPlayerSP)(life3_33)).y + ((((net.minecraft.client.entity.EntityPlayerSP)(life3_33)).w - ((net.minecraft.client.entity.EntityPlayerSP)(life3_33)).y) * p0));
    this.a(((float)(life5_48)), ((float)(life6_59)));
    this.a(((moom.to)(life3_33)));
    this.a(((net.minecraft.client.entity.EntityPlayerSP)(life3_33)), ((float)(p0)));
    moom.kZ.y();
    moom.kZ.B();
    if (!((this.d != null))) {
        break forest_join_424;
    }
    life7_79 = new com.moon.eL();
    ((com.moon.events.EventBus)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).getEventBus())).publish(((java.lang.Object)(life7_79)));
    if (!(((com.moon.module.impl.Animations)(this.j)).isEnabled())) {
        break forest_join_106;
    }
    if (!(((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.Animations)(this.j)).b())).getValue())))).booleanValue())) {
        break forest_join_106;
    }
    moom.kZ.b(((float)(((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(((com.moon.module.impl.Animations)(this.j)).a__kZ())).getValue())))).floatValue())), ((float)(((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(((com.moon.module.impl.Animations)(this.j)).b__kZ())).getValue())))).floatValue())), ((float)(0x0.0p0f)));
    }
    if (!((((((net.minecraft.item.ItemStack)(this.d)).a__wQ() instanceof moom.xA) ? 1 : 0) != 0))) {
        break forest_join_118;
    }
    this.a(((moom.to)(life3_33)), ((float)(life5_48)), ((float)(life2_29)), ((float)(life4_37)));
    break forest_join_417;
    }
    if (!((((net.minecraft.client.entity.EntityPlayerSP)(life3_33)).l__Int() <= 0))) {
        break forest_join_124;
    }
    if (!(((com.moon.eL)(life7_79)).a())) {
        break forest_join_410;
    }
    }
    life8_133 = ((net.minecraft.item.ItemStack)(this.d)).a__a1();
    switch ((moom.ln.b)[((moom.a1)(life8_133)).ordinal()]) {
case 1:
{
        break forest_join_133;
    }
case 2:
case 3:
{
        break forest_join_138;
    }
case 4:
{
        break forest_join_147;
    }
case 5:
{
        break forest_join_401;
    }
default:
{
        break forest_join_409;
    }
}
    }
    this.b(((float)(life2_29)), ((float)(0x0.0p0f)));
    break forest_join_409;
    }
    this.a(((moom.to)(life3_33)), ((float)(p0)));
    this.b(((float)(life2_29)), ((float)(0x0.0p0f)));
    break forest_join_409;
    }
    if (!(((com.moon.module.impl.Animations)(this.j)).isEnabled())) {
        break forest_join_394;
    }
    if (!((!((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.Animations)(this.j)).b())).getValue())))).booleanValue()))) {
        break forest_join_172;
    }
    moom.kZ.b(((float)(((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(((com.moon.module.impl.Animations)(this.j)).a__kZ())).getValue())))).floatValue())), ((float)(((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(((com.moon.module.impl.Animations)(this.j)).b__kZ())).getValue())))).floatValue())), ((float)(0x0.0p0f)));
    }
    life9_181 = 0x1.921fb54442d18p1d;
    life11_184 = ((float) life9_181);
    switch ((moom.ln.a)[((com.moon.bM)(((com.moon.bM)(((com.moon.setting.ModeSetting)(((com.moon.module.impl.Animations)(this.j)).a__kY())).getValue())))).ordinal()]) {
case 1:
{
        break forest_join_186;
    }
case 2:
{
        break forest_join_193;
    }
case 3:
{
        break forest_join_202;
    }
case 4:
{
        break forest_join_239;
    }
case 5:
{
        break forest_join_287;
    }
case 6:
{
        break forest_join_328;
    }
case 7:
{
        break forest_join_369;
    }
default:
{
        break forest_join_393;
    }
}
    }
    this.b(((float)(life2_29)), ((float)(0x0.0p0f)));
    this.a();
    break forest_join_393;
    }
    this.b(((float)((life2_29 - 0x1.333334p-2f))), ((float)(life4_37)));
    this.a();
    break forest_join_393;
    }
    this.b(((float)(0x0.0p0f)), ((float)(0x0.0p0f)));
    this.a();
    life12_223 = moom.Dr.a(((float)(((float) (((double) moom.Dr.c(((float)(life4_37)))) * life9_181)))));
    moom.kZ.b(((float)(-0x1.99999ap-5f)), ((float)(-0x0.0p0f)), ((float)(0x1.666666p-2f)));
    moom.kZ.b(((float)((((-life12_223) * 0x1.ep5f) / 0x1.0p1f))), ((float)(-0x1.ep3f)), ((float)(-0x0.0p0f)), ((float)(0x1.2p3f)));
    moom.kZ.b(((float)(((-life12_223) * 0x1.18p6f))), ((float)(0x1.0p0f)), ((float)(-0x1.99999ap-2f)), ((float)(-0x0.0p0f)));
    break forest_join_393;
    }
    this.b(((float)(life2_29)), ((float)(0x0.0p0f)));
    this.a();
    life12_261 = moom.Dr.a(((float)(((float) (((double) (life4_37 * life4_37)) * life9_181)))));
    life13_269 = moom.Dr.a(((float)(((float) (((double) moom.Dr.c(((float)(life4_37)))) * life9_181)))));
    moom.kZ.b(((float)(((-life12_261) * 0x1.4p4f))), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)));
    moom.kZ.b(((float)(((-life13_269) * 0x1.4p4f))), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)));
    moom.kZ.b(((float)(((-life13_269) * 0x1.4p6f))), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)));
    break forest_join_393;
    }
    life12_300 = moom.Dr.a(((float)((moom.Dr.c(((float)(life4_37))) * life11_184))));
    org.lwjgl.opengl.GL11.glTranslated(((double)(-0x1.999999999999ap-4d)), ((double)(0x1.3333333333333p-3d)), ((double)(0x0.0p0d)));
    this.b(((float)((life2_29 / 0x1.0p1f))), ((float)(0x0.0p0f)));
    moom.kZ.b(((float)((((-life12_300) * 0x1.68p5f) / 0x1.8p0f))), ((float)((life12_300 / 0x1.8p0f))), ((float)(-0x0.0p0f)), ((float)(0x1.2p3f)));
    moom.kZ.b(((float)(((-life12_300) * 0x1.b8p5f))), ((float)(0x1.0p0f)), ((float)((life12_300 / 0x1.0p1f))), ((float)(-0x0.0p0f)));
    this.a();
    break forest_join_393;
    }
    life12_341 = moom.Dr.a(((float)((moom.Dr.c(((float)(life4_37))) * life11_184))));
    org.lwjgl.opengl.GL11.glTranslated(((double)(-0x1.999999999999ap-4d)), ((double)(0x1.999999999999ap-4d)), ((double)(0x0.0p0d)));
    this.b(((float)((life2_29 / 0x1.0p1f))), ((float)(0x0.0p0f)));
    moom.kZ.b(((float)((((-life12_341) * 0x1.4p5f) / 0x1.0p1f))), ((float)((life12_341 / 0x1.0p1f))), ((float)(-0x0.0p0f)), ((float)(0x1.2p3f)));
    moom.kZ.b(((float)(((-life12_341) * 0x1.ep4f))), ((float)(0x1.0p0f)), ((float)((life12_341 / 0x1.0p1f))), ((float)(-0x0.0p0f)));
    this.a();
    break forest_join_393;
    }
    life12_382 = moom.Dr.a(((float)((moom.Dr.c(((float)(life4_37))) * life11_184))));
    moom.kZ.b(((float)(0x1.99999ap-4f)), ((float)(0x1.99999ap-4f)), ((float)(0x1.99999ap-4f)));
    moom.kZ.b(((float)(((-life12_382) * 0x1.ep4f))), ((float)(-0x1.0p3f)), ((float)(-0x1.99999ap-3f)), ((float)(0x1.2p3f)));
    this.b(((float)(life2_29)), ((float)(life4_37)));
    this.a();
    }
    break forest_join_409;
    }
    this.b(((float)(life2_29)), ((float)(0x0.0p0f)));
    this.a();
    break forest_join_409;
    }
    this.b(((float)(life2_29)), ((float)(0x0.0p0f)));
    this.a(((float)(p0)), ((moom.to)(life3_33)));
    }
    break forest_join_417;
    }
    ((moom.lm)(this)).a__Void(((float)(life4_37)));
    this.b(((float)(life2_29)), ((float)(life4_37)));
    }
    this.a(((net.minecraft.entity.EntityLivingBase)(life3_33)), ((net.minecraft.item.ItemStack)(this.d)), ((net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType)(net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType.FIRST_PERSON)));
    break forest_join_432;
    }
    if (!((!((net.minecraft.client.entity.EntityPlayerSP)(life3_33)).v__Boolean()))) {
        break forest_join_432;
    }
    this.a(((moom.to)(life3_33)), ((float)(life2_29)), ((float)(life4_37)));
    }
    moom.kZ.C();
    moom.kZ.z();
    moom.lt.a();
    }
    return;
}


private void e(float p0) {
long life2_3;
    net.minecraft.client.renderer.Tessellator life4_5;
    moom.lw life5_8;
    float life6_37;
    int life7_39;
    net.minecraft.client.renderer.texture.TextureAtlasSprite life8_49;
    float life9_57;
    float life10_60;
    float life11_63;
    float life12_66;
    float life13_72;
    float life14_76;
    float life15_82;
    float life16_86;
    float life17_88;
    life2_3 = (moom.lm.k ^ 30183145191154L);
    life4_5 = net.minecraft.client.renderer.Tessellator.a();
    life5_8 = ((net.minecraft.client.renderer.Tessellator)(life4_5)).a__lw();
    moom.kZ.c(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.ccccccp-1f)));
    moom.kZ.c(((int)(__sourceIntrinsic_aa67223d85b5_invokedynamic6812_4(27748, (8363214483135748580L ^ life2_3)))));
    moom.kZ.a(((boolean)(false)));
    moom.kZ.l();
    moom.kZ.a(((int)(__sourceIntrinsic_aa67223d85b5_invokedynamic6812_8(24841, (1390777020913669262L ^ life2_3)))), ((int)(__sourceIntrinsic_aa67223d85b5_invokedynamic6812_9(1631, (8119522768937268185L ^ life2_3)))), ((int)(1)), ((int)(0)));
    life6_37 = 0x1.0p0f;
    life7_39 = 0;
    while ((life7_39 < 2)) {
        moom.kZ.B();
        life8_49 = ((net.minecraft.client.renderer.texture.TextureMap)(((net.minecraft.client.Minecraft)(this.c)).a__n8())).a(((java.lang.String)("minecraft:blocks/fire_layer_1")));
        ((net.minecraft.client.renderer.texture.TextureManager)(((net.minecraft.client.Minecraft)(this.c)).a__ok())).a__Void(((moom.DD)(net.minecraft.client.renderer.texture.TextureMap.k)));
        life9_57 = ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(life8_49)).a();
        life10_60 = ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(life8_49)).b();
        life11_63 = ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(life8_49)).c();
        life12_66 = ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(life8_49)).d();
        life13_72 = ((0x0.0p0f - life6_37) / 0x1.0p1f);
        life14_76 = (life13_72 + life6_37);
        life15_82 = (0x0.0p0f - (life6_37 / 0x1.0p1f));
        life16_86 = (life15_82 + life6_37);
        life17_88 = -0x1.0p-1f;
        moom.kZ.b(((float)((((float) (-((life7_39 * 2) - 1))) * 0x1.eb851ep-3f))), ((float)(-0x1.333334p-2f)), ((float)(0x0.0p0f)));
        moom.kZ.b(((float)((((float) ((life7_39 * 2) - 1)) * 0x1.4p3f))), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)));
        ((moom.lw)(life5_8)).a(((int)(__sourceIntrinsic_aa67223d85b5_invokedynamic6812_25(13578, (7443511886389936267L ^ life2_3)))), ((moom.oD)(moom.oB.i)));
        ((moom.lw)(life5_8)).b(((net.minecraft.client.renderer.texture.TextureAtlasSprite)(life8_49)));
        ((moom.lw)(((moom.lw)(((moom.lw)(life5_8)).a(((double)(((double) life13_72))), ((double)(((double) life15_82))), ((double)(((double) life17_88)))))).a(((double)(((double) life10_60))), ((double)(((double) life12_66)))))).c__Void();
        ((moom.lw)(((moom.lw)(((moom.lw)(life5_8)).a(((double)(((double) life14_76))), ((double)(((double) life15_82))), ((double)(((double) life17_88)))))).a(((double)(((double) life9_57))), ((double)(((double) life12_66)))))).c__Void();
        ((moom.lw)(((moom.lw)(((moom.lw)(life5_8)).a(((double)(((double) life14_76))), ((double)(((double) life16_86))), ((double)(((double) life17_88)))))).a(((double)(((double) life9_57))), ((double)(((double) life11_63)))))).c__Void();
        ((moom.lw)(((moom.lw)(((moom.lw)(life5_8)).a(((double)(((double) life13_72))), ((double)(((double) life16_86))), ((double)(((double) life17_88)))))).a(((double)(((double) life10_60))), ((double)(((double) life11_63)))))).c__Void();
        ((net.minecraft.client.renderer.Tessellator)(life4_5)).a__Void();
        moom.kZ.C();
        life7_39 += 1;
    }
    moom.kZ.c(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    int spill6812_0 = 23501;
    moom.kZ.k();
    long spill6812_1 = (6312164074926698053L ^ life2_3);
    moom.kZ.a(((boolean)(true)));
    moom.kZ.c(((int)(__sourceIntrinsic_aa67223d85b5_invokedynamic6812_46(spill6812_0, spill6812_1))));
    return;
}


public void c() {
this.e = ((float)(0x0.0p0f));
    return;
}


public void c(float p0) {
long life2_3;
    net.minecraft.block.state.IBlockState life4_21;
    moom.DT life5_28;
    net.minecraft.client.entity.EntityPlayerSP life6_32;
    int life7_34;
    double life8_59;
    double life10_74;
    double life12_92;
    moom.DT life14_103;
    net.minecraft.block.state.IBlockState life15_109;
    moom.DT life5_118;
    forest_join_153: {
    forest_join_145: {
    forest_join_131: {
    forest_join_117: {
    life2_3 = (moom.lm.k ^ 13879702849117L);
    moom.kZ.c__Void();
    if (!(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(this.c)).K)).q__Boolean())) {
        break forest_join_131;
    }
    life4_21 = ((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(this.c)).I)).a__fE(((moom.DT)(new moom.DT(((net.minecraft.client.Minecraft)(this.c)).K))));
    life5_28 = new moom.DT(((net.minecraft.client.Minecraft)(this.c)).K);
    life6_32 = ((net.minecraft.client.Minecraft)(this.c)).K;
    life7_34 = 0;
    forest_cycle_34: while (true) {
    forest_join_115: {
    if (!((life7_34 < __sourceIntrinsic_c0891f2beaed_invokedynamic900191_14(11031, (928127999071530557L ^ life2_3))))) {
        break forest_join_117;
    }
    life8_59 = (((net.minecraft.entity.player.EntityPlayer)(life6_32)).n + ((double) (((((float) (life7_34 % 2)) - 0x1.0p-1f) * ((net.minecraft.entity.player.EntityPlayer)(life6_32)).G) * 0x1.99999ap-1f)));
    life10_74 = (((net.minecraft.entity.player.EntityPlayer)(life6_32)).o + ((double) ((((float) ((life7_34 >> 1) % 2)) - 0x1.0p-1f) * 0x1.99999ap-4f)));
    life12_92 = (((net.minecraft.entity.player.EntityPlayer)(life6_32)).p + ((double) (((((float) ((life7_34 >> 2) % 2)) - 0x1.0p-1f) * ((net.minecraft.entity.player.EntityPlayer)(life6_32)).G) * 0x1.99999ap-1f)));
    life14_103 = new moom.DT(life8_59, (life10_74 + ((double) ((net.minecraft.entity.player.EntityPlayer)(life6_32)).e__Float())), life12_92);
    life15_109 = ((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(this.c)).I)).a__fE(((moom.DT)(life14_103)));
    if (!(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(life15_109)).a__ch())).f__Boolean())) {
        break forest_join_115;
    }
    life4_21 = life15_109;
    life5_118 = life14_103;
    life5_118 = life5_118;
    }
    life7_34 += 1;
    continue forest_cycle_34;
    }
    }
    if (!((((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(life4_21)).a__ch())).c__Int() != -1))) {
        break forest_join_131;
    }
    this.a(((float)(p0)), ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(((net.minecraft.client.renderer.BlockModelShapes)(((net.minecraft.client.renderer.BlockRendererDispatcher)(((net.minecraft.client.Minecraft)(this.c)).a__kP())).a__kN())).a(((net.minecraft.block.state.IBlockState)(life4_21))))));
    }
    if (!((!((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(this.c)).K)).U__Boolean()))) {
        break forest_join_153;
    }
    if (!(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(this.c)).K)).a(((moom.fn)(moom.fn.h))))) {
        break forest_join_145;
    }
    this.d(((float)(p0)));
    }
    if (!(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(this.c)).K)).r__Boolean())) {
        break forest_join_153;
    }
    this.e(((float)(p0)));
    }
    moom.kZ.d__Void();
    return;
}


private void d(float p0) {
long life2_3;
    net.minecraft.client.renderer.Tessellator life4_18;
    moom.lw life5_24;
    float life6_30;
    float life7_48;
    float life8_50;
    float life9_52;
    float life10_54;
    float life11_56;
    float life12_58;
    float life13_66;
    float life14_73;
    forward_join_148: {
    forward_join_8: {
    life2_3 = (moom.lm.k ^ 4594819967659L);
    if (!(moom.BU.ap())) { break forward_join_8; }
    if (!(moom.MP.e__Boolean())) { break forward_join_148; }
    }
    ((net.minecraft.client.renderer.texture.TextureManager)(((net.minecraft.client.Minecraft)(this.c)).a__ok())).a__Void(((moom.DD)(moom.lm.b)));
    int spill4351_0 = 3330;
    life4_18 = net.minecraft.client.renderer.Tessellator.a();
    long spill4351_1 = (5035282762659341520L ^ life2_3);
    life5_24 = ((net.minecraft.client.renderer.Tessellator)(life4_18)).a__lw();
    life6_30 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(this.c)).K)).a(((float)(p0)));
    moom.kZ.c(((float)(life6_30)), ((float)(life6_30)), ((float)(life6_30)), ((float)(0x1.0p-1f)));
    moom.kZ.l();
    moom.kZ.a(((int)(__sourceIntrinsic_2b75f634baf5_invokedynamic4351_14(spill4351_0, spill4351_1))), ((int)(__sourceIntrinsic_2b75f634baf5_invokedynamic4351_15(28258, (897484387943106489L ^ life2_3)))), ((int)(1)), ((int)(0)));
    moom.kZ.B();
    life7_48 = 0x1.0p2f;
    life8_50 = -0x1.0p0f;
    life9_52 = 0x1.0p0f;
    life10_54 = -0x1.0p0f;
    life11_56 = 0x1.0p0f;
    life12_58 = -0x1.0p-1f;
    life13_66 = ((-((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(this.c)).K)).w) / 0x1.0p6f);
    life14_73 = (((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(this.c)).K)).x / 0x1.0p6f);
    ((moom.lw)(life5_24)).a(((int)(__sourceIntrinsic_2b75f634baf5_invokedynamic4351_24(13578, (7443524128202726610L ^ life2_3)))), ((moom.oD)(moom.oB.i)));
    ((moom.lw)(((moom.lw)(((moom.lw)(life5_24)).a(((double)(-0x1.0p0d)), ((double)(-0x1.0p0d)), ((double)(-0x1.0p-1d))))).a(((double)(((double) (0x1.0p2f + life13_66)))), ((double)(((double) (0x1.0p2f + life14_73))))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(life5_24)).a(((double)(0x1.0p0d)), ((double)(-0x1.0p0d)), ((double)(-0x1.0p-1d))))).a(((double)(((double) (0x0.0p0f + life13_66)))), ((double)(((double) (0x1.0p2f + life14_73))))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(life5_24)).a(((double)(0x1.0p0d)), ((double)(0x1.0p0d)), ((double)(-0x1.0p-1d))))).a(((double)(((double) (0x0.0p0f + life13_66)))), ((double)(((double) (0x0.0p0f + life14_73))))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(life5_24)).a(((double)(-0x1.0p0d)), ((double)(0x1.0p0d)), ((double)(-0x1.0p-1d))))).a(((double)(((double) (0x1.0p2f + life13_66)))), ((double)(((double) (0x0.0p0f + life14_73))))))).c__Void();
    ((net.minecraft.client.renderer.Tessellator)(life4_18)).a__Void();
    moom.kZ.C();
    moom.kZ.c(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    moom.kZ.k();
    }
    return;
}


public void d() {
this.e = ((float)(0x0.0p0f));
    return;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral8325_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/lm"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.lm.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private void a(float p0, net.minecraft.client.renderer.texture.TextureAtlasSprite p1) {
long local3 = (moom.lm.k ^ 62031789431628L);
    ((net.minecraft.client.renderer.texture.TextureManager)(((net.minecraft.client.Minecraft)(this.c)).a__ok())).a__Void(((moom.DD)(net.minecraft.client.renderer.texture.TextureMap.k)));
    net.minecraft.client.renderer.Tessellator local5 = net.minecraft.client.renderer.Tessellator.a();
    moom.lw local6 = ((net.minecraft.client.renderer.Tessellator)(local5)).a__lw();
    float local7 = 0x1.99999ap-4f;
    moom.kZ.c(((float)(0x1.99999ap-4f)), ((float)(0x1.99999ap-4f)), ((float)(0x1.99999ap-4f)), ((float)(0x1.0p-1f)));
    moom.kZ.B();
    float local8 = -0x1.0p0f;
    float local9 = 0x1.0p0f;
    float local10 = -0x1.0p0f;
    float local11 = 0x1.0p0f;
    float local12 = -0x1.0p-1f;
    float local13 = ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(p1)).a();
    float local14 = ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(p1)).b();
    float local15 = ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(p1)).c();
    float local16 = ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(p1)).d();
    ((moom.lw)(local6)).a(((int)(__sourceIntrinsic_6426444c8b3e_originalDynamicSite1547_13(28736, (5293161861872412788L ^ local3)))), ((moom.oD)(moom.oB.i)));
    ((moom.lw)(((moom.lw)(((moom.lw)(local6)).a(((double)(-0x1.0p0d)), ((double)(-0x1.0p0d)), ((double)(-0x1.0p-1d))))).a(((double)(((double) local14))), ((double)(((double) local16)))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(local6)).a(((double)(0x1.0p0d)), ((double)(-0x1.0p0d)), ((double)(-0x1.0p-1d))))).a(((double)(((double) local13))), ((double)(((double) local16)))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(local6)).a(((double)(0x1.0p0d)), ((double)(0x1.0p0d)), ((double)(-0x1.0p-1d))))).a(((double)(((double) local13))), ((double)(((double) local15)))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(local6)).a(((double)(-0x1.0p0d)), ((double)(0x1.0p0d)), ((double)(-0x1.0p-1d))))).a(((double)(((double) local14))), ((double)(((double) local15)))))).c__Void();
    ((net.minecraft.client.renderer.Tessellator)(local5)).a__Void();
    moom.kZ.C();
    moom.kZ.c(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 26324;
      if (m[var3] == null) {
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
         long var5 = l[var3];
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
         Object[] var9 = (Object[])n.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               n.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/lm", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         m[var3] = var15;
      }

      return m[var3];
}


private void a(moom.to p0) {
long local2 = (moom.lm.k ^ 78001980096445L);
    int local4 = ((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(this.c)).I)).a(((moom.DT)(new moom.DT(((moom.to)(p0)).n, (((moom.to)(p0)).o + ((double) ((moom.to)(p0)).e__Float())), ((moom.to)(p0)).p))), ((int)(0)));
    if (moom.BU.ay()) {
        local4 = moom.JF.a(((net.minecraft.entity.Entity)(((net.minecraft.client.Minecraft)(this.c)).a__r3())), ((int)(local4)));
    }
    float local5 = ((float) (local4 & __sourceIntrinsic_6b3152fcce6a_invokedynamic8326_12(26103, (4457233432294119739L ^ local2))));
    float local6 = ((float) (local4 >> __sourceIntrinsic_6b3152fcce6a_invokedynamic8326_13(19537, (6809021250806378650L ^ local2))));
    net.minecraft.client.renderer.OpenGlHelper.a(((int)(net.minecraft.client.renderer.OpenGlHelper.r)), ((float)(local5)), ((float)(local6)));
    return;
}


private void a(net.minecraft.client.entity.EntityPlayerSP p0, float p1) {
float local3 = (((net.minecraft.client.entity.EntityPlayerSP)(p0)).ct + ((((net.minecraft.client.entity.EntityPlayerSP)(p0)).cr - ((net.minecraft.client.entity.EntityPlayerSP)(p0)).ct) * p1));
    float local4 = (((net.minecraft.client.entity.EntityPlayerSP)(p0)).cs + ((((net.minecraft.client.entity.EntityPlayerSP)(p0)).cq - ((net.minecraft.client.entity.EntityPlayerSP)(p0)).cs) * p1));
    moom.kZ.b(((float)(((((net.minecraft.client.entity.EntityPlayerSP)(p0)).x - local3) * 0x1.99999ap-4f))), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)));
    moom.kZ.b(((float)(((((net.minecraft.client.entity.EntityPlayerSP)(p0)).w - local4) * 0x1.99999ap-4f))), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)));
    return;
}


private float a(float p0) {
float local2 = ((0x1.0p0f - (p0 / 0x1.68p5f)) + 0x1.99999ap-4f);
    local2 = moom.Dr.a(((float)(local2)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)));
    local2 = (((-moom.Dr.b(((float)((local2 * 0x1.921fb6p1f))))) * 0x1.0p-1f) + 0x1.0p-1f);
    return local2;
}


private void a(moom.nr p0) {
moom.kZ.B();
    moom.kZ.b(((float)(0x1.bp5f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)));
    moom.kZ.b(((float)(0x1.0p6f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)));
    moom.kZ.b(((float)(-0x1.fp5f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)));
    moom.kZ.b(((float)(0x1.0p-2f)), ((float)(-0x1.b33334p-1f)), ((float)(0x1.8p-1f)));
    ((moom.nr)(p0)).b__sourceReturn_3624bf56ed(((moom.to)(((net.minecraft.client.Minecraft)(this.c)).K)));
    moom.kZ.C();
    return;
}


private void a(float p0, float p1) {
moom.kZ.B();
    moom.kZ.b(((float)(p0)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)));
    moom.kZ.b(((float)(p1)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)));
    moom.lt.b();
    moom.kZ.C();
    return;
}


private boolean a(net.minecraft.block.Block p0) {
int forwardValue3757_9_0;
    forward_join_9: {
    forward_join_8: {
    if (!((p0 != null))) {
        break forward_join_8;
    }
    if (!((((net.minecraft.block.Block)(p0)).a__bx() == net.minecraft.util.EnumWorldBlockLayer.TRANSLUCENT))) {
        break forward_join_8;
    }
    forwardValue3757_9_0 = 1;
    break forward_join_9;
    }
    forwardValue3757_9_0 = 0;
    }
    return ((forwardValue3757_9_0) != 0);
}


public void a(net.minecraft.entity.EntityLivingBase p0, net.minecraft.item.ItemStack p1, net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType p2) {
net.minecraft.item.Item life4_4;
    net.minecraft.block.Block life5_7;
    float life6_69;
    forward_join_70: {
    forward_join_69: {
    forward_join_57: {
    forward_join_39: {
    forward_join_29: {
    forward_join_26: {
    if (!((p1 != null))) { break forward_join_70; }
    life4_4 = ((net.minecraft.item.ItemStack)(p1)).a__wQ();
    life5_7 = net.minecraft.block.Block.a(((net.minecraft.item.Item)(life4_4)));
    moom.kZ.B();
    if (!(((net.minecraft.client.renderer.entity.RenderItem)(this.h)).a__Boolean(((net.minecraft.item.ItemStack)(p1))))) { break forward_join_29; }
    moom.kZ.a(((float)(0x1.0p1f)), ((float)(0x1.0p1f)), ((float)(0x1.0p1f)));
    if (!(this.a(((net.minecraft.block.Block)(life5_7))))) { break forward_join_57; }
    if (!(moom.BU.ap())) { break forward_join_26; }
    if (!((!moom.MP.A))) { break forward_join_57; }
    }
    moom.kZ.a(((boolean)(false)));
    break forward_join_57;
    }
    if (!((this.j == null))) { break forward_join_39; }
    this.j = ((com.moon.module.impl.Animations)(((com.moon.module.impl.Animations)(((com.moon.fU)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__fU())).a(((java.lang.Class)(com.moon.module.impl.Animations.class)))))));
    }
    if (!(((com.moon.module.impl.Animations)(this.j)).isEnabled())) { break forward_join_57; }
    if (!((p2 == net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType.FIRST_PERSON))) { break forward_join_57; }
    life6_69 = ((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(((com.moon.module.impl.Animations)(this.j)).c())).getValue())))).floatValue();
    moom.kZ.a(((float)(life6_69)), ((float)(life6_69)), ((float)(life6_69)));
    }
    ((net.minecraft.client.renderer.entity.RenderItem)(this.h)).a(((net.minecraft.item.ItemStack)(p1)), ((net.minecraft.entity.EntityLivingBase)(p0)), ((net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType)(p2)));
    if (!(this.a(((net.minecraft.block.Block)(life5_7))))) { break forward_join_69; }
    moom.kZ.a(((boolean)(true)));
    }
    moom.kZ.C();
    }
    return;
}


private void a() {
moom.kZ.b(((float)(-0x1.0p-1f)), ((float)(0x1.99999ap-3f)), ((float)(0x0.0p0f)));
    moom.kZ.b(((float)(0x1.ep4f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)));
    moom.kZ.b(((float)(-0x1.4p6f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)));
    moom.kZ.b(((float)(0x1.ep5f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)));
    return;
}


private void a(float p0, moom.to p1) {
float life3_31;
    float life4_35;
    float life4_45;
    float life5_62;
    float life6_66;
    float life7_70;
    moom.kZ.b(((float)(-0x1.2p4f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)));
    moom.kZ.b(((float)(-0x1.8p3f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)));
    moom.kZ.b(((float)(-0x1.0p3f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)));
    moom.kZ.b(((float)(-0x1.ccccccp-1f)), ((float)(0x1.99999ap-3f)), ((float)(0x0.0p0f)));
    life3_31 = (((float) ((net.minecraft.item.ItemStack)(this.d)).e()) - ((((float) ((moom.to)(p1)).l__Int()) - p0) + 0x1.0p0f));
    life4_35 = (life3_31 / 0x1.4p4f);
    life4_45 = (((life4_35 * life4_35) + (life4_35 * 0x1.0p1f)) / 0x1.8p1f);
    if ((life4_45 > 0x1.0p0f)) {
        life4_45 = 0x1.0p0f;
    }
    if ((life4_45 > 0x1.99999ap-4f)) {
        life5_62 = moom.Dr.a(((float)(((life3_31 - 0x1.99999ap-4f) * 0x1.4cccccp0f))));
        life6_66 = (life4_45 - 0x1.99999ap-4f);
        life7_70 = (life5_62 * life6_66);
        moom.kZ.b(((float)((life7_70 * 0x0.0p0f))), ((float)((life7_70 * 0x1.47ae14p-7f))), ((float)((life7_70 * 0x0.0p0f))));
    }
    moom.kZ.b(((float)((life4_45 * 0x0.0p0f))), ((float)((life4_45 * 0x0.0p0f))), ((float)((life4_45 * 0x1.99999ap-4f))));
    moom.kZ.a(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)((0x1.0p0f + (life4_45 * 0x1.99999ap-3f)))));
    return;
}


private void a(moom.to p0, float p1) {
float local3 = ((((float) ((moom.to)(p0)).l__Int()) - p1) + 0x1.0p0f);
    float local4 = (local3 / ((float) ((net.minecraft.item.ItemStack)(this.d)).e()));
    float local5 = moom.Dr.d(((float)((moom.Dr.b(((float)(((local3 / 0x1.0p2f) * 0x1.921fb6p1f)))) * 0x1.99999ap-4f))));
    if ((local4 >= 0x1.99999ap-1f)) {
        local5 = 0x0.0p0f;
    }
    moom.kZ.b(((float)(0x0.0p0f)), ((float)(local5)), ((float)(0x0.0p0f)));
    float local6 = (0x1.0p0f - ((float) java.lang.Math.pow(((double)(((double) local4))), ((double)(0x1.bp4d)))));
    moom.kZ.b(((float)((local6 * 0x1.333334p-1f))), ((float)((local6 * -0x1.0p-1f))), ((float)((local6 * 0x0.0p0f))));
    moom.kZ.b(((float)((local6 * 0x1.68p6f))), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)));
    moom.kZ.b(((float)((local6 * 0x1.4p3f))), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)));
    moom.kZ.b(((float)((local6 * 0x1.ep4f))), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)));
    return;
}


private void a__Void(float p0) {
float local2 = (-0x1.99999ap-2f * moom.Dr.a(((float)((moom.Dr.c(((float)(p0))) * 0x1.921fb6p1f)))));
    float local3 = (0x1.99999ap-3f * moom.Dr.a(((float)(((moom.Dr.c(((float)(p0))) * 0x1.921fb6p1f) * 0x1.0p1f)))));
    float local4 = (-0x1.99999ap-3f * moom.Dr.a(((float)((p0 * 0x1.921fb6p1f)))));
    moom.kZ.b(((float)(local2)), ((float)(local3)), ((float)(local4)));
    return;
}


private void a(moom.to p0, float p1, float p2) {
float local4 = (-0x1.333334p-2f * moom.Dr.a(((float)((moom.Dr.c(((float)(p2))) * 0x1.921fb6p1f)))));
    float local5 = (0x1.99999ap-2f * moom.Dr.a(((float)(((moom.Dr.c(((float)(p2))) * 0x1.921fb6p1f) * 0x1.0p1f)))));
    float local6 = (-0x1.99999ap-2f * moom.Dr.a(((float)((p2 * 0x1.921fb6p1f)))));
    moom.kZ.b(((float)(local4)), ((float)(local5)), ((float)(local6)));
    moom.kZ.b(((float)(0x1.47ae16p-1f)), ((float)(-0x1.333334p-1f)), ((float)(-0x1.70a3d6p-1f)));
    moom.kZ.b(((float)(0x0.0p0f)), ((float)((p1 * -0x1.333334p-1f))), ((float)(0x0.0p0f)));
    moom.kZ.b(((float)(0x1.68p5f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)));
    float local7 = moom.Dr.a(((float)(((p2 * p2) * 0x1.921fb6p1f))));
    float local8 = moom.Dr.a(((float)((moom.Dr.c(((float)(p2))) * 0x1.921fb6p1f))));
    moom.kZ.b(((float)((local8 * 0x1.18p6f))), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)));
    moom.kZ.b(((float)((local7 * -0x1.4p4f))), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)));
    ((net.minecraft.client.renderer.texture.TextureManager)(((net.minecraft.client.Minecraft)(this.c)).a__ok())).a__Void(((moom.DD)(((moom.to)(p0)).a__DD())));
    moom.kZ.b(((float)(-0x1.0p0f)), ((float)(0x1.ccccccp1f)), ((float)(0x1.cp1f)));
    moom.kZ.b(((float)(0x1.ep6f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)));
    moom.kZ.b(((float)(0x1.9p7f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)));
    moom.kZ.b(((float)(-0x1.0ep7f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)));
    moom.kZ.a(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    moom.kZ.b(((float)(0x1.666666p2f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)));
    java.lang.Object local9 = ((net.minecraft.client.renderer.entity.RenderManager)(this.g)).a(((net.minecraft.entity.Entity)(((net.minecraft.client.Minecraft)(this.c)).K)));
    moom.kZ.p();
    java.lang.Object local10 = ((moom.nr)(local9));
    ((moom.nr)(local10)).b__sourceReturn_3624bf56ed(((moom.to)(((net.minecraft.client.Minecraft)(this.c)).K)));
    moom.kZ.o();
    return;
}


private void a(moom.to p0, float p1, float p2, float p3) {
long life5_3;
    float life7_11;
    float life8_21;
    float life9_28;
    float life10_36;
    float life11_79;
    float life12_85;
    net.minecraft.client.renderer.Tessellator life13_140;
    moom.lw life14_143;
    net.minecraft.world.storage.MapData life15_201;
    life5_3 = (moom.lm.k ^ 69883010632140L);
    life7_11 = (-0x1.99999ap-2f * moom.Dr.a(((float)((moom.Dr.c(((float)(p3))) * 0x1.921fb6p1f)))));
    life8_21 = (0x1.99999ap-3f * moom.Dr.a(((float)(((moom.Dr.c(((float)(p3))) * 0x1.921fb6p1f) * 0x1.0p1f)))));
    life9_28 = (-0x1.99999ap-3f * moom.Dr.a(((float)((p3 * 0x1.921fb6p1f)))));
    moom.kZ.b(((float)(life7_11)), ((float)(life8_21)), ((float)(life9_28)));
    life10_36 = this.a(((float)(p1)));
    moom.kZ.b(((float)(0x0.0p0f)), ((float)(0x1.47ae14p-5f)), ((float)(-0x1.70a3d8p-1f)));
    moom.kZ.b(((float)(0x0.0p0f)), ((float)((p2 * -0x1.333334p0f))), ((float)(0x0.0p0f)));
    moom.kZ.b(((float)(0x0.0p0f)), ((float)((life10_36 * -0x1.0p-1f))), ((float)(0x0.0p0f)));
    moom.kZ.b(((float)(0x1.68p6f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)));
    moom.kZ.b(((float)((life10_36 * -0x1.54p6f))), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)));
    moom.kZ.b(((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)));
    this.b(((moom.to)(p0)));
    life11_79 = moom.Dr.a(((float)(((p3 * p3) * 0x1.921fb6p1f))));
    life12_85 = moom.Dr.a(((float)((moom.Dr.c(((float)(p3))) * 0x1.921fb6p1f))));
    moom.kZ.b(((float)((life11_79 * -0x1.4p4f))), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)));
    moom.kZ.b(((float)((life12_85 * -0x1.4p4f))), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)));
    moom.kZ.b(((float)((life12_85 * -0x1.4p6f))), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)));
    moom.kZ.a(((float)(0x1.851eb8p-2f)), ((float)(0x1.851eb8p-2f)), ((float)(0x1.851eb8p-2f)));
    moom.kZ.b(((float)(0x1.68p6f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)));
    moom.kZ.b(((float)(0x1.68p7f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)));
    moom.kZ.b(((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)));
    moom.kZ.b(((float)(-0x1.0p0f)), ((float)(-0x1.0p0f)), ((float)(0x0.0p0f)));
    moom.kZ.a(((float)(0x1.0p-6f)), ((float)(0x1.0p-6f)), ((float)(0x1.0p-6f)));
    ((net.minecraft.client.renderer.texture.TextureManager)(((net.minecraft.client.Minecraft)(this.c)).a__ok())).a__Void(((moom.DD)(moom.lm.a)));
    life13_140 = net.minecraft.client.renderer.Tessellator.a();
    life14_143 = ((net.minecraft.client.renderer.Tessellator)(life13_140)).a__lw();
    org.lwjgl.opengl.GL11.glNormal3f(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(-0x1.0p0f)));
    ((moom.lw)(life14_143)).a(((int)(__sourceIntrinsic_4f1f4bfc1493_invokedynamic3756_34(13578, (7443480839620951989L ^ life5_3)))), ((moom.oD)(moom.oB.i)));
    ((moom.lw)(((moom.lw)(((moom.lw)(life14_143)).a(((double)(-0x1.cp2d)), ((double)(0x1.0ep7d)), ((double)(0x0.0p0d))))).a(((double)(0x0.0p0d)), ((double)(0x1.0p0d))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(life14_143)).a(((double)(0x1.0ep7d)), ((double)(0x1.0ep7d)), ((double)(0x0.0p0d))))).a(((double)(0x1.0p0d)), ((double)(0x1.0p0d))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(life14_143)).a(((double)(0x1.0ep7d)), ((double)(-0x1.cp2d)), ((double)(0x0.0p0d))))).a(((double)(0x1.0p0d)), ((double)(0x0.0p0d))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(life14_143)).a(((double)(-0x1.cp2d)), ((double)(-0x1.cp2d)), ((double)(0x0.0p0d))))).a(((double)(0x0.0p0d)), ((double)(0x0.0p0d))))).c__Void();
    ((net.minecraft.client.renderer.Tessellator)(life13_140)).a__Void();
    life15_201 = ((moom.xA)(net.minecraft.init.Items.a3)).a(((net.minecraft.item.ItemStack)(this.d)), ((net.minecraft.world.World)(((net.minecraft.client.Minecraft)(this.c)).I)));
    if ((life15_201 != null)) {
        ((net.minecraft.client.gui.MapItemRenderer)(((net.minecraft.client.renderer.EntityRenderer)(((net.minecraft.client.Minecraft)(this.c)).R)).a__ip())).a(((net.minecraft.world.storage.MapData)(life15_201)), ((boolean)(false)));
    }
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_6426444c8b3e_originalDynamicSite1547_13(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral8325_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6b3152fcce6a_invokedynamic8326_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6b3152fcce6a_invokedynamic8326_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4f1f4bfc1493_invokedynamic3756_34(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c0891f2beaed_invokedynamic900191_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2b75f634baf5_invokedynamic4351_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2b75f634baf5_invokedynamic4351_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2b75f634baf5_invokedynamic4351_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_aa67223d85b5_invokedynamic6812_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_aa67223d85b5_invokedynamic6812_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_aa67223d85b5_invokedynamic6812_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_aa67223d85b5_invokedynamic6812_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_aa67223d85b5_invokedynamic6812_46(int a0, long a1) throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
