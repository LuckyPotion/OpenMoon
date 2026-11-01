package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class uk extends moom.uc {

private net.minecraft.entity.EntityLiving c;

private float d;

private float e;

private boolean f;

private int g;

private int h;

private static long i;

private static long[] j;

private static java.lang.Integer[] k;

private static java.util.Map l;

public uk(net.minecraft.entity.EntityLiving p0, float p1) { super(); }


private static void __sourceConstructorBody_0b35136582166dcf(moom.uk receiver, net.minecraft.entity.EntityLiving p0, float p1) throws Throwable {

long local3 = (moom.uk.i ^ 102710496684354L);

    moom.uk.__sourceConstructorInit_0b35136582166dcf_0(((moom.uk)(receiver)));

    ((moom.uk)(receiver)).c = ((net.minecraft.entity.EntityLiving)(p0));

    ((moom.uk)(receiver)).d = ((float)(p1));

    ((moom.uk)(receiver)).a(((int)(__sourceIntrinsic_0b35136582166dcf_originalDynamicSite3417_4(12825, (2062668498702827952L ^ local3)))));

    return;

}



static {
i = ((long)(((moom._a)(moom._c.a(((long)(-3613851119905030580L)), ((long)(4365577681949549184L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(230480530990984L)))));
    l = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.uk.i ^ 7750901812774L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1058_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1058_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1058_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1058_14 = new byte[8];
    (__sourceSpill1058_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1058_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1058_16 = __sourceSpill1058_14;
    ((javax.crypto.Cipher)(__sourceSpill1058_11)).init(((int)(__sourceSpill1058_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1058_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1058_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[3];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "äxñ×0\001eª\022û]q[á~ý\030è$¿¹"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1058_25 = local6_life21;
        int __sourceSpill1058_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1058_25)).substring(((int)(__sourceSpill1058_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1058_30 = local8_life19;
        int __sourceSpill1058_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1058_33 = new byte[8];
        (__sourceSpill1058_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1058_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1058_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1058_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1058_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1058_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1058_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1058_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1058_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1058_34)).doFinal(((byte[])(__sourceSpill1058_33)));
        (__sourceSpill1058_30)[__sourceSpill1058_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    j = ((long[])(local8_life19));
    k = ((java.lang.Integer[])(new java.lang.Integer[3]));
}

private static native <E extends Throwable> void __sourceConstructorInit_0b35136582166dcf_0(moom.uk a0) throws E;

public void b__Void() {
this.f = ((boolean)(false));
    this.e = ((float)(0x0.0p0f));
    return;
}


public void c() {
int forestValue510_36_0;
    int forestValue510_55_0;
    int forestValue510_75_0;
    int forestValue510_86_0;
    int forestValue510_114_0;
    moom.uk forestValue510_119_0;
    int forestValue510_119_1;
    net.minecraft.entity.EntityLiving forestValue510_147_0;
    int forestValue510_245_0;
    float forestValue510_255_0;
    int forestValue510_266_0;
    int forestValue510_280_0;
    int forestValue510_298_0;
    int forestValue510_340_0;
    int forestValue510_340_1;
    int forestValue510_380_0;
    int forestValue510_382_0;
    int forestValue510_454_0;
    int forestValue510_466_0;
    net.minecraft.item.ItemStack forestValue510_501_0;
    moom.uk forestValue510_521_0;
    net.minecraft.entity.EntityLiving forestValue510_522_0;
    boolean spill510_0;
    int spill510_1;
    boolean spill510_2;
    moom.uk spill510_3;
    int spill510_4;
    int spill510_5;
    net.minecraft.entity.EntityLiving spill510_6;
    int spill510_7;
    int spill510_8;
    float spill510_9;
    int spill510_10;
    int spill510_11;
    int spill510_12;
    boolean spill510_13;
    int spill510_14;
    int spill510_15;
    int spill510_16;
    int spill510_17;
    moom.uk spill510_18;
    net.minecraft.entity.EntityLiving spill510_19;
    moom.uk spill510_20;
    net.minecraft.item.ItemStack spill510_21;
    long life1_3;
    net.minecraft.entity.player.EntityPlayer life4_9;
    moom.sI life5_13;
    int life3_14;
    float life6_24;
    int life7_92;
    int life8_97;
    int life9_102;
    float life10_105;
    float life11_148;
    float life12_187;
    float life13_195;
    float life14_203;
    float life15_208;
    float life16_212;
    float life16_216;
    float life17_220;
    float life18_225;
    float life19_229;
    int life20_317;
    int life21_325;
    int life22_332;
    int life23_342;
    int life24_349;
    net.minecraft.block.Block life25_374;
    int life26_407;
    net.minecraft.item.ItemStack life25_523;
    net.minecraft.item.ItemStack life26_552;
    forest_join_525: {
    forest_join_522: {
    forest_join_521: {
    forest_join_520: {
    forest_join_501: {
    forest_join_466: {
    forest_join_454: {
    forest_join_451: {
    forest_join_382: {
    forest_join_381: {
    forest_join_380: {
    forest_join_379: {
    forest_join_341: {
    forest_join_340: {
    forest_join_298: {
    forest_join_291: {
    forest_join_280: {
    forest_join_277: {
    forest_join_266: {
    forest_join_261: {
    forest_join_255: {
    forest_join_254: {
    forest_join_245: {
    forest_join_240: {
    forest_join_168: {
    forest_join_147: {
    forest_join_137: {
    forest_join_120: {
    forest_join_119: {
    forest_join_114: {
    forest_join_86: {
    forest_join_82: {
    forest_join_75: {
    forest_join_70: {
    forest_join_55: {
    forest_join_41: {
    forest_join_36: {
    forest_join_33: {
    life1_3 = (moom.uk.i ^ 136305172539473L);
    spill510_0 = moom.uc.d();
    life4_9 = ((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.entity.EntityLiving)(this.c)).f));
    life5_13 = ((moom.sI)(this.c));
    life3_14 = ((spill510_0) ? 1 : 0);
    life6_24 = (moom.Dr.e(((float)((((net.minecraft.entity.player.EntityPlayer)(life4_9)).w - ((net.minecraft.entity.EntityLiving)(this.c)).w)))) * 0x1.0p-1f);
    spill510_1 = recovery.source.CarrierOps.fcmpl(((float)(life6_24)), ((float)(0x1.4p2f)));
    if (!((life3_14 != 0))) {
        forestValue510_36_0 = spill510_1;
        break forest_join_36;
    }
    if (!((spill510_1 > 0))) {
        break forest_join_33;
    }
    life6_24 = 0x1.4p2f;
    }
    forestValue510_36_0 = recovery.source.CarrierOps.fcmpg(((float)(life6_24)), ((float)(-0x1.4p2f)));
    }
    if (!((life3_14 != 0))) {
        forestValue510_55_0 = forestValue510_36_0;
        break forest_join_55;
    }
    if (!((forestValue510_36_0 < 0))) {
        break forest_join_41;
    }
    life6_24 = -0x1.4p2f;
    }
    ((net.minecraft.entity.EntityLiving)(this.c)).w = ((float)(moom.Dr.e(((float)((((net.minecraft.entity.EntityLiving)(this.c)).w + life6_24))))));
    forestValue510_55_0 = recovery.source.CarrierOps.fcmpg(((float)(this.e)), ((float)(this.d)));
    }
    if (!((life3_14 != 0))) {
        forestValue510_75_0 = forestValue510_55_0;
        break forest_join_75;
    }
    if (!((forestValue510_55_0 < 0))) {
        break forest_join_70;
    }
    moom.uk __stackOp510_22_0 = this;
    ((moom.uk)(__stackOp510_22_0)).e = ((float)((((moom.uk)(__stackOp510_22_0)).e + ((this.d - this.e) * 0x1.47ae14p-7f))));
    }
    forestValue510_75_0 = recovery.source.CarrierOps.fcmpl(((float)(this.e)), ((float)(this.d)));
    }
    if (!((life3_14 != 0))) {
        forestValue510_86_0 = forestValue510_75_0;
        break forest_join_86;
    }
    if (!((forestValue510_75_0 > 0))) {
        break forest_join_82;
    }
    this.e = ((float)(this.d));
    }
    forestValue510_86_0 = moom.Dr.b__Int(((double)(((net.minecraft.entity.EntityLiving)(this.c)).n)));
    }
    life7_92 = forestValue510_86_0;
    life8_97 = moom.Dr.b__Int(((double)(((net.minecraft.entity.EntityLiving)(this.c)).o)));
    life9_102 = moom.Dr.b__Int(((double)(((net.minecraft.entity.EntityLiving)(this.c)).p)));
    life10_105 = this.e;
    spill510_2 = this.f;
    if (!((life3_14 != 0))) {
        forestValue510_114_0 = ((spill510_2) ? 1 : 0);
        break forest_join_114;
    }
    if (!(spill510_2)) {
        break forest_join_137;
    }
    moom.uk __stackOp510_44_0 = this;
    spill510_3 = __stackOp510_44_0;
    spill510_4 = ((moom.uk)(__stackOp510_44_0)).g;
    if (!((life3_14 != 0))) {
        forestValue510_119_0 = spill510_3;
        forestValue510_119_1 = spill510_4;
        break forest_join_119;
    }
    moom.uk __stackOp510_46_0 = spill510_3;
    int __stackOp510_46_1 = spill510_4;
    spill510_5 = __stackOp510_46_1;
    ((moom.uk)(__stackOp510_46_0)).g = ((int)((__stackOp510_46_1 + 1)));
    forestValue510_114_0 = spill510_5;
    }
    if (!((forestValue510_114_0 > this.h))) {
        break forest_join_120;
    }
    forestValue510_119_0 = this;
    forestValue510_119_1 = 0;
    }
    ((moom.uk)(forestValue510_119_0)).f = ((boolean)__sourceIntrinsic_integerToBoolean((forestValue510_119_1)));
    }
    life10_105 = (life10_105 + ((life10_105 * 0x1.266666p0f) * moom.Dr.a(((float)(((((float) this.g) / ((float) this.h)) * 0x1.921fb6p1f))))));
    }
    life11_148 = 0x1.d1eb86p-1f;
    spill510_6 = this.c;
    if (!((life3_14 != 0))) {
        forestValue510_147_0 = spill510_6;
        break forest_join_147;
    }
    if (!(((net.minecraft.entity.EntityLiving)(spill510_6)).A)) {
        break forest_join_168;
    }
    forestValue510_147_0 = this.c;
    }
    life11_148 = (((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(((net.minecraft.entity.EntityLiving)(forestValue510_147_0)).i)).a__fE(((moom.DT)(new moom.DT(moom.Dr.a__Int(((float)(((float) life7_92)))), (moom.Dr.a__Int(((float)(((float) life8_97)))) - 1), moom.Dr.a__Int(((float)(((float) life9_102)))))))))).a__ch())).L * 0x1.d1eb86p-1f);
    }
    life12_187 = (0x1.4d5b12p-3f / ((life11_148 * life11_148) * life11_148));
    life13_195 = moom.Dr.a(((float)(((((moom.sI)(life5_13)).w * 0x1.921fb6p1f) / 0x1.68p7f))));
    life14_203 = moom.Dr.b(((float)(((((moom.sI)(life5_13)).w * 0x1.921fb6p1f) / 0x1.68p7f))));
    life15_208 = (((moom.sI)(life5_13)).i__sourceReturn_bc607678b6() * life12_187);
    life16_212 = java.lang.Math.max(((float)(life10_105)), ((float)(0x1.0p0f)));
    life16_216 = (life15_208 / life16_212);
    life17_220 = (life10_105 * life16_216);
    life18_225 = (-(life17_220 * life13_195));
    life19_229 = (life17_220 * life14_203);
    spill510_7 = recovery.source.CarrierOps.fcmpl(((float)(moom.Dr.d(((float)(life18_225))))), ((float)(moom.Dr.d(((float)(life19_229))))));
    if (!((life3_14 != 0))) {
        forestValue510_266_0 = spill510_7;
        break forest_join_266;
    }
    if (!((spill510_7 > 0))) {
        break forest_join_261;
    }
    spill510_8 = recovery.source.CarrierOps.fcmpg(((float)(life18_225)), ((float)(0x0.0p0f)));
    if (!((life3_14 != 0))) {
        forestValue510_245_0 = spill510_8;
        break forest_join_245;
    }
    if (!((spill510_8 < 0))) {
        break forest_join_240;
    }
    life18_225 = (life18_225 - (((net.minecraft.entity.EntityLiving)(this.c)).G / 0x1.0p1f));
    }
    spill510_9 = life18_225;
    if (!((life3_14 != 0))) {
        forestValue510_255_0 = spill510_9;
        break forest_join_255;
    }
    forestValue510_245_0 = recovery.source.CarrierOps.fcmpl(((float)(spill510_9)), ((float)(0x0.0p0f)));
    }
    if (!((forestValue510_245_0 > 0))) {
        break forest_join_254;
    }
    life18_225 = (life18_225 + (((net.minecraft.entity.EntityLiving)(this.c)).G / 0x1.0p1f));
    }
    forestValue510_255_0 = 0x0.0p0f;
    }
    life19_229 = forestValue510_255_0;
    if (!((life3_14 == 0))) {
        break forest_join_291;
    }
    net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[4])));
    }
    life18_225 = 0x0.0p0f;
    forestValue510_266_0 = recovery.source.CarrierOps.fcmpg(((float)(life19_229)), ((float)(0x0.0p0f)));
    }
    if (!((life3_14 != 0))) {
        forestValue510_280_0 = forestValue510_266_0;
        break forest_join_280;
    }
    if (!((forestValue510_266_0 < 0))) {
        break forest_join_277;
    }
    life19_229 = (life19_229 - (((net.minecraft.entity.EntityLiving)(this.c)).G / 0x1.0p1f));
    }
    forestValue510_280_0 = recovery.source.CarrierOps.fcmpl(((float)(life19_229)), ((float)(0x0.0p0f)));
    }
    if (!((life3_14 != 0))) {
        forestValue510_298_0 = forestValue510_280_0;
        break forest_join_298;
    }
    if (!((forestValue510_280_0 > 0))) {
        break forest_join_291;
    }
    life19_229 = (life19_229 + (((net.minecraft.entity.EntityLiving)(this.c)).G / 0x1.0p1f));
    }
    forestValue510_298_0 = moom.Dr.b__Int(((double)((((net.minecraft.entity.EntityLiving)(this.c)).n + ((double) life18_225)))));
    }
    life20_317 = forestValue510_298_0;
    life21_325 = moom.Dr.b__Int(((double)((((net.minecraft.entity.EntityLiving)(this.c)).p + ((double) life19_229)))));
    life22_332 = moom.Dr.a__Int(((float)((((net.minecraft.entity.EntityLiving)(this.c)).G + 0x1.0p0f))));
    life23_342 = moom.Dr.a__Int(((float)(((((net.minecraft.entity.EntityLiving)(this.c)).H + ((net.minecraft.entity.player.EntityPlayer)(life4_9)).H) + 0x1.0p0f))));
    life24_349 = moom.Dr.a__Int(((float)((((net.minecraft.entity.EntityLiving)(this.c)).G + 0x1.0p0f))));
    spill510_10 = life7_92;
    spill510_11 = life20_317;
    if (!((life3_14 != 0))) {
        forestValue510_340_0 = spill510_10;
        forestValue510_340_1 = spill510_11;
        break forest_join_340;
    }
    if (!((spill510_10 == spill510_11))) {
        break forest_join_341;
    }
    spill510_12 = life9_102;
    if (!((life3_14 != 0))) {
        forestValue510_454_0 = spill510_12;
        break forest_join_454;
    }
    forestValue510_340_0 = spill510_12;
    forestValue510_340_1 = life21_325;
    }
    if (!((forestValue510_340_0 != forestValue510_340_1))) {
        break forest_join_451;
    }
    }
    life25_374 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(((net.minecraft.entity.EntityLiving)(this.c)).i)).a__fE(((moom.DT)(new moom.DT(life7_92, life8_97, life9_102)))))).a__ch();
    if (!((!((moom.uk)(this)).a(((net.minecraft.block.Block)(life25_374)))))) {
        break forest_join_381;
    }
    if (!((((net.minecraft.block.Block)(life25_374)).a__fn() == moom.fn.a))) {
        break forest_join_379;
    }
    spill510_13 = ((moom.uk)(this)).a(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(((net.minecraft.entity.EntityLiving)(this.c)).i)).a__fE(((moom.DT)(new moom.DT(life7_92, (life8_97 - 1), life9_102)))))).a__ch())));
    if (!((life3_14 != 0))) {
        forestValue510_380_0 = ((spill510_13) ? 1 : 0);
        break forest_join_380;
    }
    if (!((!spill510_13))) {
        break forest_join_381;
    }
    }
    forestValue510_380_0 = 1;
    }
    forestValue510_382_0 = forestValue510_380_0;
    break forest_join_382;
    }
    forestValue510_382_0 = 0;
    }
    life26_407 = forestValue510_382_0;
    spill510_14 = life26_407;
    if (!((life3_14 != 0))) {
        forestValue510_454_0 = spill510_14;
        break forest_join_454;
    }
    if (!((spill510_14 != 0))) {
        break forest_join_451;
    }
    spill510_15 = 0;
    if (!((life3_14 != 0))) {
        forestValue510_454_0 = spill510_15;
        break forest_join_454;
    }
    if (!((spill510_15 == moom.II.a(((net.minecraft.world.IBlockAccess)(((net.minecraft.entity.EntityLiving)(this.c)).i)), ((net.minecraft.entity.Entity)(this.c)), ((int)(life20_317)), ((int)(life8_97)), ((int)(life21_325)), ((int)(life22_332)), ((int)(life23_342)), ((int)(life24_349)), ((boolean)(false)), ((boolean)(false)), ((boolean)(true)))))) {
        break forest_join_451;
    }
    spill510_16 = 1;
    if (!((life3_14 != 0))) {
        forestValue510_454_0 = spill510_16;
        break forest_join_454;
    }
    if (!((spill510_16 == moom.II.a(((net.minecraft.world.IBlockAccess)(((net.minecraft.entity.EntityLiving)(this.c)).i)), ((net.minecraft.entity.Entity)(this.c)), ((int)(life7_92)), ((int)((life8_97 + 1))), ((int)(life9_102)), ((int)(life22_332)), ((int)(life23_342)), ((int)(life24_349)), ((boolean)(false)), ((boolean)(false)), ((boolean)(true)))))) {
        break forest_join_451;
    }
    spill510_17 = 1;
    if (!((life3_14 != 0))) {
        forestValue510_454_0 = spill510_17;
        break forest_join_454;
    }
    if (!((spill510_17 == moom.II.a(((net.minecraft.world.IBlockAccess)(((net.minecraft.entity.EntityLiving)(this.c)).i)), ((net.minecraft.entity.Entity)(this.c)), ((int)(life20_317)), ((int)((life8_97 + 1))), ((int)(life21_325)), ((int)(life22_332)), ((int)(life23_342)), ((int)(life24_349)), ((boolean)(false)), ((boolean)(false)), ((boolean)(true)))))) {
        break forest_join_451;
    }
    ((net.minecraft.entity.ai.EntityJumpHelper)(((moom.sI)(life5_13)).a__vr())).a();
    }
    forestValue510_454_0 = ((((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.entity.player.EntityPlayer)(life4_9)).b1)).d) ? 1 : 0);
    }
    if (!((life3_14 != 0))) {
        forestValue510_466_0 = forestValue510_454_0;
        break forest_join_466;
    }
    if (!((forestValue510_454_0 == 0))) {
        break forest_join_520;
    }
    spill510_18 = this;
    if (!((life3_14 != 0))) {
        forestValue510_521_0 = spill510_18;
        break forest_join_521;
    }
    forestValue510_466_0 = recovery.source.CarrierOps.fcmpl(((float)(((moom.uk)(spill510_18)).e)), ((float)((this.d * 0x1.0p-1f))));
    }
    if (!((forestValue510_466_0 >= 0))) {
        break forest_join_520;
    }
    spill510_19 = this.c;
    if (!((life3_14 != 0))) {
        forestValue510_522_0 = spill510_19;
        break forest_join_522;
    }
    if (!((recovery.source.CarrierOps.fcmpg(((float)(((java.util.Random)(((net.minecraft.entity.EntityLiving)(spill510_19)).a__Random())).nextFloat())), ((float)(0x1.89374cp-8f))) < 0))) {
        break forest_join_520;
    }
    spill510_20 = this;
    if (!((life3_14 != 0))) {
        forestValue510_521_0 = spill510_20;
        break forest_join_521;
    }
    if (!((!((moom.uk)(spill510_20)).f))) {
        break forest_join_520;
    }
    life25_523 = ((net.minecraft.entity.player.EntityPlayer)(life4_9)).a__xW();
    if (!((life3_14 != 0))) {
        break forest_join_525;
    }
    if (!((life25_523 != null))) {
        break forest_join_520;
    }
    spill510_21 = life25_523;
    if (!((life3_14 != 0))) {
        forestValue510_501_0 = spill510_21;
        break forest_join_501;
    }
    if (!((((net.minecraft.item.ItemStack)(spill510_21)).a__wQ() == net.minecraft.init.Items.bN))) {
        break forest_join_520;
    }
    ((net.minecraft.item.ItemStack)(life25_523)).a(((int)(1)), ((net.minecraft.entity.EntityLivingBase)(life4_9)));
    if (!((life3_14 != 0))) {
        break forest_join_525;
    }
    forestValue510_501_0 = life25_523;
    }
    if (!((((net.minecraft.item.ItemStack)(forestValue510_501_0)).b == 0))) {
        break forest_join_520;
    }
    life26_552 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.aR);
    ((net.minecraft.item.ItemStack)(life26_552)).b(((net.minecraft.nbt.NBTTagCompound)(((net.minecraft.item.ItemStack)(life25_523)).a__yw())));
    (((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.entity.player.EntityPlayer)(life4_9)).bD)).a)[((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.entity.player.EntityPlayer)(life4_9)).bD)).c] = life26_552;
    }
    forestValue510_521_0 = this;
    }
    forestValue510_522_0 = ((moom.uk)(forestValue510_521_0)).c;
    }
    ((net.minecraft.entity.EntityLiving)(forestValue510_522_0)).e(((float)(0x0.0p0f)), ((float)(life10_105)));
    }
    return;
}


public boolean f() {
return ((((this.f) ? 1 : 0)) != 0);
}


public void d__sourceReturn_da8c82d5d4() {
long local1 = (moom.uk.i ^ 9536855805594L);
    this.f = ((boolean)(true));
    this.g = ((int)(0));
    this.h = ((int)((((java.util.Random)(((net.minecraft.entity.EntityLiving)(this.c)).a__Random())).nextInt(((int)(__sourceIntrinsic_6cce62949456_originalDynamicSite1676_5(15903, (6979393399607814764L ^ local1))))) + __sourceIntrinsic_6cce62949456_originalDynamicSite1676_7(2277, (4237450073962830997L ^ local1)))));
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 16511;
      if (k[var3] == null) {
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
         long var5 = j[var3];
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
         Object[] var9 = (Object[])l.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               l.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/uk", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         k[var3] = var15;
      }

      return k[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.uk.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral9360_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/uk"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private boolean a(net.minecraft.block.Block p0) {
int forwardValue4208_17_0;
    int forwardValue4208_19_0;
    int spill4208_0;
    int spill4208_1;
    long life2_3;
    int life4_5;
    forward_join_19: {
    forward_join_18: {
    forward_join_17: {
    forward_join_16: {
    life2_3 = (moom.uk.i ^ 38804406691704L);
    life4_5 = ((moom.uc.e()) ? 1 : 0);
    spill4208_0 = ((p0 instanceof moom.ew) ? 1 : 0);
    if (!((life4_5 == 0))) {
        forwardValue4208_17_0 = spill4208_0;
        break forward_join_17;
    }
    if (!((spill4208_0 == 0))) {
        break forward_join_16;
    }
    spill4208_1 = ((p0 instanceof moom.ei) ? 1 : 0);
    if (!((life4_5 == 0))) {
        forwardValue4208_17_0 = spill4208_1;
        break forward_join_17;
    }
    if (!((spill4208_1 != 0))) {
        break forward_join_18;
    }
    }
    forwardValue4208_17_0 = 1;
    }
    forwardValue4208_19_0 = forwardValue4208_17_0;
    break forward_join_19;
    }
    forwardValue4208_19_0 = 0;
    }
    return ((forwardValue4208_19_0) != 0);
}


public boolean a__Boolean() {
net.minecraft.entity.Entity forwardValue4209_15_0;
    net.minecraft.entity.Entity forwardValue4209_21_0;
    int forwardValue4209_27_0;
    int forwardValue4209_37_0;
    int forwardValue4209_39_0;
    net.minecraft.entity.EntityLiving spill4209_0;
    int spill4209_1;
    boolean spill4209_2;
    long life1_3;
    int life3_5;
    forward_join_39: {
    forward_join_38: {
    forward_join_37: {
    forward_join_36: {
    forward_join_27: {
    forward_join_21: {
    forward_join_15: {
    life1_3 = (moom.uk.i ^ 77311744074339L);
    life3_5 = ((moom.uc.d()) ? 1 : 0);
    spill4209_0 = this.c;
    if (!((life3_5 != 0))) {
        forwardValue4209_15_0 = spill4209_0;
        break forward_join_15;
    }
    if (!(((net.minecraft.entity.EntityLiving)(spill4209_0)).p__Boolean())) {
        break forward_join_38;
    }
    forwardValue4209_15_0 = ((net.minecraft.entity.EntityLiving)(this.c)).f;
    }
    if (!((life3_5 != 0))) {
        forwardValue4209_21_0 = forwardValue4209_15_0;
        break forward_join_21;
    }
    if (!((forwardValue4209_15_0 != null))) {
        break forward_join_38;
    }
    forwardValue4209_21_0 = ((net.minecraft.entity.EntityLiving)(this.c)).f;
    }
    spill4209_1 = ((forwardValue4209_21_0 instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0);
    if (!((life3_5 != 0))) {
        forwardValue4209_27_0 = spill4209_1;
        break forward_join_27;
    }
    if (!((spill4209_1 != 0))) {
        break forward_join_38;
    }
    forwardValue4209_27_0 = ((this.f) ? 1 : 0);
    }
    if (!((life3_5 != 0))) {
        forwardValue4209_37_0 = forwardValue4209_27_0;
        break forward_join_37;
    }
    if (!((forwardValue4209_27_0 == 0))) {
        break forward_join_36;
    }
    spill4209_2 = ((net.minecraft.entity.EntityLiving)(this.c)).P__Boolean();
    if (!((life3_5 != 0))) {
        forwardValue4209_37_0 = ((spill4209_2) ? 1 : 0);
        break forward_join_37;
    }
    if (!(spill4209_2)) {
        break forward_join_38;
    }
    }
    forwardValue4209_37_0 = 1;
    }
    forwardValue4209_39_0 = forwardValue4209_37_0;
    break forward_join_39;
    }
    forwardValue4209_39_0 = 0;
    }
    return ((forwardValue4209_39_0) != 0);
}


public void a__Void() {
this.e = ((float)(0x0.0p0f));
    return;
}


public boolean g() {
int forwardValue4211_18_0;
    int forwardValue4211_22_0;
    int forwardValue4211_24_0;
    boolean spill4211_0;
    long life1_3;
    int life3_5;
    forward_join_24: {
    forward_join_23: {
    forward_join_22: {
    forward_join_18: {
    life1_3 = (moom.uk.i ^ 18737772779624L);
    life3_5 = ((moom.uc.e()) ? 1 : 0);
    spill4211_0 = ((moom.uk)(this)).f();
    if (!((life3_5 == 0))) {
        forwardValue4211_18_0 = ((spill4211_0) ? 1 : 0);
        break forward_join_18;
    }
    if (!((!spill4211_0))) {
        break forward_join_23;
    }
    forwardValue4211_18_0 = recovery.source.CarrierOps.fcmpl(((float)(this.e)), ((float)((this.d * 0x1.333334p-2f))));
    }
    if (!((life3_5 == 0))) {
        forwardValue4211_22_0 = forwardValue4211_18_0;
        break forward_join_22;
    }
    if (!((forwardValue4211_18_0 > 0))) {
        break forward_join_23;
    }
    forwardValue4211_22_0 = 1;
    }
    forwardValue4211_24_0 = forwardValue4211_22_0;
    break forward_join_24;
    }
    forwardValue4211_24_0 = 0;
    }
    return ((forwardValue4211_24_0) != 0);
}


private static native <E extends Throwable> int __sourceIntrinsic_0b35136582166dcf_originalDynamicSite3417_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral9360_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6cce62949456_originalDynamicSite1676_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6cce62949456_originalDynamicSite1676_7(int a0, long a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
