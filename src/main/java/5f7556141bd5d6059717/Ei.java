package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Ei {

private final boolean a;

private final boolean b;

private final java.util.Random c;

private final net.minecraft.world.World d;

private final double e;

private final double f;

private final double g;

private final net.minecraft.entity.Entity h;

private final float i;

private final java.util.List<moom.DT> j;

private final java.util.Map<net.minecraft.entity.player.EntityPlayer, moom.DR> k;

private static final long l;

private static final long[] m;

private static final java.lang.Integer[] n;

private static final java.util.Map o;

public Ei(net.minecraft.world.World p0, net.minecraft.entity.Entity p1, double p2, double p3, double p4, float p5, boolean p6, boolean p7) {
super();
    this.c = new java.util.Random();
    this.j = com.google.common.collect.Lists.newArrayList();
    this.k = com.google.common.collect.Maps.newHashMap();
    this.d = p0;
    this.h = p1;
    this.i = p5;
    this.e = p2;
    this.f = p3;
    this.g = p4;
    this.a = p6;
    this.b = p7;
}


public Ei(net.minecraft.world.World p0, net.minecraft.entity.Entity p1, double p2, double p3, double p4, float p5, boolean p6, boolean p7, java.util.List<moom.DT> p8) {
this(p0, p1, p2, p3, p4, p5, p6, p7);
    (this.j).addAll(p8);
}


public Ei(net.minecraft.world.World p0, net.minecraft.entity.Entity p1, double p2, double p3, double p4, float p5, java.util.List<moom.DT> p6) {
this(p0, p1, p2, p3, p4, p5, false, true, p6);
    return;
}


static {
l = ((long)(((moom._a)(moom._c.a(((long)(-4628587558970791059L)), ((long)(-5184883436446634196L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(178061746593783L)))));
    o = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.Ei.l ^ 92711041082578L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill723_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill723_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill723_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill723_14 = new byte[8];
    (__sourceSpill723_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill723_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation723_16 = __sourceSpill723_14;
    ((javax.crypto.Cipher)(__sourceSpill723_11)).init(((int)(__sourceSpill723_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill723_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation723_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[4];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "Æ\036l6gàÝC\006\016+¿¾í"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill723_25 = local6_life21;
        int __sourceSpill723_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill723_25)).substring(((int)(__sourceSpill723_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill723_30 = local8_life19;
        int __sourceSpill723_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill723_33 = new byte[8];
        (__sourceSpill723_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill723_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill723_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill723_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill723_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill723_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill723_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill723_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill723_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill723_34)).doFinal(((byte[])(__sourceSpill723_33)));
        (__sourceSpill723_30)[__sourceSpill723_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "ï/\034Vù\024éùê¾¸ óò"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill723_38 = local6_life21;
        int __sourceSpill723_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill723_38)).substring(((int)(__sourceSpill723_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill723_43 = local8_life19;
        int __sourceSpill723_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill723_46 = new byte[8];
        (__sourceSpill723_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill723_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill723_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill723_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill723_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill723_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill723_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill723_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill723_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill723_47)).doFinal(((byte[])(__sourceSpill723_46)));
        (__sourceSpill723_43)[__sourceSpill723_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    m = ((long[])(local8_life19));
    n = ((java.lang.Integer[])(new java.lang.Integer[4]));
}


public void b() {
((java.util.List)(this.j)).clear();
    return;
}


public void a__Void() {
int forestValue604_17_0;
    int forestValue604_28_0;
    int forestValue604_87_0;
    net.minecraft.entity.Entity forestValue604_194_0;
    float forestValue604_205_0;
    net.minecraft.entity.Entity forestValue604_227_0;
    int forestValue604_240_0;
    float forestValue604_261_0;
    float forestValue604_261_1;
    int forestValue604_278_0;
    net.minecraft.entity.Entity forestValue604_385_0;
    double forestValue604_406_0;
    double forestValue604_406_1;
    double forestValue604_454_0;
    double forestValue604_454_1;
    int forestValue604_530_0;
    java.lang.Object forestValue604_548_0;
    java.lang.String spill604_0;
    int spill604_1;
    int spill604_2;
    int spill604_3;
    int spill604_4;
    int spill604_5;
    int spill604_6;
    int spill604_7;
    int spill604_8;
    net.minecraft.entity.Entity spill604_9;
    float spill604_10;
    float spill604_11;
    net.minecraft.entity.Entity spill604_12;
    boolean spill604_13;
    net.minecraft.entity.Entity spill604_14;
    double spill604_15;
    double spill604_16;
    double spill604_17;
    double spill604_18;
    int spill604_19;
    net.minecraft.entity.player.PlayerCapabilities spill604_20;
    long life1_3;
    java.util.HashSet life4_6;
    java.lang.String life3_7;
    int life5_13;
    int life6_15;
    int life7_26;
    int life8_37;
    double life9_107;
    double life11_117;
    double life13_127;
    double life15_140;
    double life9_144;
    double life11_148;
    double life13_152;
    float life17_164;
    double life18_167;
    double life20_170;
    double life22_173;
    float life24_175;
    moom.DT life25_186;
    net.minecraft.block.state.IBlockState life26_191;
    float life27_221;
    float life6_305;
    int life7_314;
    int life8_323;
    int life9_332;
    int life10_341;
    int life11_350;
    int life12_359;
    java.util.List life13_380;
    moom.DR life14_390;
    java.util.Iterator life15_393;
    net.minecraft.entity.Entity life16_400;
    double life17_419;
    double life19_433;
    double life21_443;
    double life23_449;
    double life25_463;
    double life23_482;
    double life27_490;
    double life29_496;
    double life31_521;
    forest_join_551: {
    forest_join_278: {
    forest_join_274: {
    life1_3 = (moom.Ei.l ^ 23785624856894L);
    spill604_0 = net.minecraft.world.World.c__String();
    life4_6 = com.google.common.collect.Sets.newHashSet();
    life3_7 = spill604_0;
    life5_13 = __sourceIntrinsic_b82a5b29b709_invokedynamic604_3(21665, (7837763407466912417L ^ life1_3));
    life6_15 = 0;
    forest_cycle_16: while (true) {
    forest_join_271: {
    forestValue604_17_0 = life6_15;
    forest_cycle_17: while (true) {
    if (!((forestValue604_17_0 < __sourceIntrinsic_b82a5b29b709_invokedynamic604_4(27884, (8376321953900323566L ^ life1_3))))) {
        break forest_join_274;
    }
    spill604_1 = 0;
    if (!((life3_7 == null))) {
        forestValue604_278_0 = spill604_1;
        break forest_join_278;
    }
    life7_26 = spill604_1;
    forest_cycle_27: while (true) {
    forest_join_268: {
    forestValue604_28_0 = life7_26;
    forest_cycle_28: while (true) {
    if (!((forestValue604_28_0 < __sourceIntrinsic_b82a5b29b709_invokedynamic604_5(27884, (8376321953900323566L ^ life1_3))))) {
        break forest_join_271;
    }
    spill604_2 = 0;
    if (!((life3_7 == null))) {
        forestValue604_17_0 = spill604_2;
        continue forest_cycle_17;
    }
    life8_37 = spill604_2;
    forest_cycle_38: while (true) {
    forest_join_266: {
    forest_join_265: {
    forest_join_87: {
    forest_join_86: {
    if (!((life8_37 < __sourceIntrinsic_b82a5b29b709_invokedynamic604_6(27884, (8376321953900323566L ^ life1_3))))) {
        break forest_join_268;
    }
    spill604_3 = life6_15;
    if (!((life3_7 == null))) {
        forestValue604_28_0 = spill604_3;
        continue forest_cycle_28;
    }
    if (!((life3_7 == null))) {
        forestValue604_87_0 = spill604_3;
        break forest_join_87;
    }
    if (!((spill604_3 != 0))) {
        break forest_join_86;
    }
    spill604_4 = life6_15;
    if (!((life3_7 == null))) {
        forestValue604_87_0 = spill604_4;
        break forest_join_87;
    }
    if (!((spill604_4 != __sourceIntrinsic_b82a5b29b709_invokedynamic604_7(27733, (6989041879671628374L ^ life1_3))))) {
        break forest_join_86;
    }
    spill604_5 = life7_26;
    if (!((life3_7 == null))) {
        forestValue604_87_0 = spill604_5;
        break forest_join_87;
    }
    if (!((spill604_5 != 0))) {
        break forest_join_86;
    }
    spill604_6 = life7_26;
    if (!((life3_7 == null))) {
        forestValue604_87_0 = spill604_6;
        break forest_join_87;
    }
    if (!((spill604_6 != __sourceIntrinsic_b82a5b29b709_invokedynamic604_8(8741, (5374103529920998436L ^ life1_3))))) {
        break forest_join_86;
    }
    spill604_7 = life8_37;
    if (!((life3_7 == null))) {
        forestValue604_87_0 = spill604_7;
        break forest_join_87;
    }
    if (!((spill604_7 != 0))) {
        break forest_join_86;
    }
    spill604_8 = life8_37;
    if (!((life3_7 == null))) {
        forestValue604_87_0 = spill604_8;
        break forest_join_87;
    }
    if (!((spill604_8 == __sourceIntrinsic_b82a5b29b709_invokedynamic604_9(8741, (5374103529920998436L ^ life1_3))))) {
        break forest_join_265;
    }
    }
    forestValue604_87_0 = life6_15;
    }
    life9_107 = ((double) (((((float) forestValue604_87_0) / 0x1.ep3f) * 0x1.0p1f) - 0x1.0p0f));
    life11_117 = ((double) (((((float) life7_26) / 0x1.ep3f) * 0x1.0p1f) - 0x1.0p0f));
    life13_127 = ((double) (((((float) life8_37) / 0x1.ep3f) * 0x1.0p1f) - 0x1.0p0f));
    life15_140 = java.lang.Math.sqrt(((double)((((life9_107 * life9_107) + (life11_117 * life11_117)) + (life13_127 * life13_127)))));
    life9_144 = (life9_107 / life15_140);
    life11_148 = (life11_117 / life15_140);
    life13_152 = (life13_127 / life15_140);
    life17_164 = (this.i * (0x1.666666p-1f + (((java.util.Random)(((net.minecraft.world.World)(this.d)).u)).nextFloat() * 0x1.333334p-1f)));
    life18_167 = this.e;
    life20_170 = this.f;
    life22_173 = this.g;
    life24_175 = 0x1.333334p-2f;
    forest_cycle_164: while (true) {
    forest_join_261: {
    forest_join_241: {
    forest_join_240: {
    forest_join_237: {
    forest_join_227: {
    forest_join_214: {
    forest_join_205: {
    forest_join_201: {
    forest_join_194: {
    if (!((recovery.source.CarrierOps.fcmpl(((float)(life17_164)), ((float)(0x0.0p0f))) > 0))) {
        break forest_join_265;
    }
    life25_186 = new moom.DT(life18_167, life20_170, life22_173);
    life26_191 = ((net.minecraft.world.World)(this.d)).a__fE(((moom.DT)(life25_186)));
    if (!((life3_7 == null))) {
        break forest_join_266;
    }
    if (!((((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(life26_191)).a__ch())).a__fn() != moom.fn.a))) {
        break forest_join_214;
    }
    spill604_9 = this.h;
    if (!((life3_7 == null))) {
        forestValue604_194_0 = spill604_9;
        break forest_join_194;
    }
    if (!((spill604_9 != null))) {
        break forest_join_201;
    }
    forestValue604_194_0 = this.h;
    }
    forestValue604_205_0 = ((net.minecraft.entity.Entity)(forestValue604_194_0)).a(((moom.Ei)(this)), ((net.minecraft.world.World)(this.d)), ((moom.DT)(life25_186)), ((net.minecraft.block.state.IBlockState)(life26_191)));
    break forest_join_205;
    }
    forestValue604_205_0 = ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(life26_191)).a__ch())).a(((net.minecraft.entity.Entity)(null)));
    }
    life27_221 = forestValue604_205_0;
    life17_164 = (life17_164 - ((life27_221 + 0x1.333334p-2f) * 0x1.333334p-2f));
    }
    spill604_10 = life17_164;
    spill604_11 = 0x0.0p0f;
    if (!((life3_7 == null))) {
        forestValue604_261_0 = spill604_10;
        forestValue604_261_1 = spill604_11;
        break forest_join_261;
    }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(spill604_10)), ((float)(spill604_11))) > 0))) {
        break forest_join_241;
    }
    spill604_12 = this.h;
    if (!((life3_7 == null))) {
        forestValue604_227_0 = spill604_12;
        break forest_join_227;
    }
    if (!((spill604_12 != null))) {
        break forest_join_237;
    }
    forestValue604_227_0 = this.h;
    }
    spill604_13 = ((net.minecraft.entity.Entity)(forestValue604_227_0)).a(((moom.Ei)(this)), ((net.minecraft.world.World)(this.d)), ((moom.DT)(life25_186)), ((net.minecraft.block.state.IBlockState)(life26_191)), ((float)(life17_164)));
    if (!((life3_7 == null))) {
        forestValue604_240_0 = ((spill604_13) ? 1 : 0);
        break forest_join_240;
    }
    if (!(spill604_13)) {
        break forest_join_241;
    }
    }
    forestValue604_240_0 = ((((java.util.Set)(life4_6)).add(((java.lang.Object)(life25_186)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forestValue604_240_0);
    }
    life18_167 = (life18_167 + (life9_144 * 0x1.333334p-2d));
    life20_170 = (life20_170 + (life11_148 * 0x1.333334p-2d));
    life22_173 = (life22_173 + (life13_152 * 0x1.333334p-2d));
    forestValue604_261_0 = life17_164;
    forestValue604_261_1 = 0x1.cccccep-3f;
    }
    life17_164 = (forestValue604_261_0 - forestValue604_261_1);
    if (!((life3_7 != null))) {
        continue forest_cycle_164;
    }
    break forest_cycle_164;
    }
    }
    life8_37 += 1;
    }
    if (!((life3_7 != null))) {
        continue forest_cycle_38;
    }
    break forest_cycle_38;
    }
    break forest_cycle_28;
    }
    }
    life7_26 += 1;
    if (!((life3_7 != null))) {
        continue forest_cycle_27;
    }
    break forest_cycle_27;
    }
    break forest_cycle_17;
    }
    }
    life6_15 += 1;
    if (!((life3_7 != null))) {
        continue forest_cycle_16;
    }
    break forest_cycle_16;
    }
    }
    forestValue604_278_0 = ((((java.util.List)(this.j)).addAll(((java.util.Collection)(life4_6)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forestValue604_278_0);
    life6_305 = (this.i * 0x1.0p1f);
    life7_314 = moom.Dr.b__Int(((double)(((this.e - ((double) life6_305)) - 0x1.0p0d))));
    life8_323 = moom.Dr.b__Int(((double)(((this.e + ((double) life6_305)) + 0x1.0p0d))));
    life9_332 = moom.Dr.b__Int(((double)(((this.f - ((double) life6_305)) - 0x1.0p0d))));
    life10_341 = moom.Dr.b__Int(((double)(((this.f + ((double) life6_305)) + 0x1.0p0d))));
    life11_350 = moom.Dr.b__Int(((double)(((this.g - ((double) life6_305)) - 0x1.0p0d))));
    life12_359 = moom.Dr.b__Int(((double)(((this.g + ((double) life6_305)) + 0x1.0p0d))));
    life13_380 = ((net.minecraft.world.World)(this.d)).b(((net.minecraft.entity.Entity)(this.h)), ((moom.CA)(new moom.CA(((double) life7_314), ((double) life9_332), ((double) life11_350), ((double) life8_323), ((double) life10_341), ((double) life12_359)))));
    life14_390 = new moom.DR(this.e, this.f, this.g);
    life15_393 = ((java.util.List)(life13_380)).iterator();
    forest_cycle_372: while (true) {
    forest_join_549: {
    forest_join_548: {
    forest_join_530: {
    forest_join_454: {
    forest_join_406: {
    forest_join_385: {
    if (!(((java.util.Iterator)(life15_393)).hasNext())) {
        break forest_join_551;
    }
    life16_400 = ((net.minecraft.entity.Entity)(((java.util.Iterator)(life15_393)).next()));
    spill604_14 = life16_400;
    if (!((life3_7 == null))) {
        forestValue604_385_0 = spill604_14;
        break forest_join_385;
    }
    if (!((!((net.minecraft.entity.Entity)(spill604_14)).E()))) {
        break forest_join_549;
    }
    forestValue604_385_0 = life16_400;
    }
    life17_419 = (((net.minecraft.entity.Entity)(forestValue604_385_0)).b(((double)(this.e)), ((double)(this.f)), ((double)(this.g))) / ((double) life6_305));
    spill604_15 = life17_419;
    spill604_16 = 0x1.0p0d;
    if (!((life3_7 == null))) {
        forestValue604_406_0 = spill604_15;
        forestValue604_406_1 = spill604_16;
        break forest_join_406;
    }
    if (!((recovery.source.CarrierOps.dcmpg(((double)(spill604_15)), ((double)(spill604_16))) <= 0))) {
        break forest_join_549;
    }
    forestValue604_406_0 = ((net.minecraft.entity.Entity)(life16_400)).n;
    forestValue604_406_1 = this.e;
    }
    life19_433 = (forestValue604_406_0 - forestValue604_406_1);
    life21_443 = ((((net.minecraft.entity.Entity)(life16_400)).o + ((double) ((net.minecraft.entity.Entity)(life16_400)).e__Float())) - this.f);
    life23_449 = (((net.minecraft.entity.Entity)(life16_400)).p - this.g);
    life25_463 = ((double) moom.Dr.a__Float(((double)((((life19_433 * life19_433) + (life21_443 * life21_443)) + (life23_449 * life23_449))))));
    spill604_17 = life25_463;
    spill604_18 = 0x0.0p0d;
    if (!((life3_7 == null))) {
        forestValue604_454_0 = spill604_17;
        forestValue604_454_1 = spill604_18;
        break forest_join_454;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(spill604_17)), ((double)(spill604_18))) != 0))) {
        break forest_join_549;
    }
    life19_433 = (life19_433 / life25_463);
    life21_443 = (life21_443 / life25_463);
    forestValue604_454_0 = life23_449;
    forestValue604_454_1 = life25_463;
    }
    life23_482 = (forestValue604_454_0 / forestValue604_454_1);
    life27_490 = ((double) ((net.minecraft.world.World)(this.d)).a(((moom.DR)(life14_390)), ((moom.CA)(((net.minecraft.entity.Entity)(life16_400)).b()))));
    life29_496 = ((0x1.0p0d - life17_419) * life27_490);
    ((net.minecraft.entity.Entity)(life16_400)).a__Boolean(((net.minecraft.util.DamageSource)(__sourceExactCall_c4aa3d32e9e90d(((moom.Ei)(this))))), ((float)(((float) ((int) ((((((life29_496 * life29_496) + life29_496) / 0x1.0p1d) * 0x1.0p3d) * ((double) life6_305)) + 0x1.0p0d))))));
    life31_521 = __sourceExactCall_b4ac994efa3f39(((net.minecraft.entity.Entity)(life16_400)), ((double)(life29_496)));
    net.minecraft.entity.Entity __stackOp604_87_0 = life16_400;
    ((net.minecraft.entity.Entity)(__stackOp604_87_0)).t = ((double)((((net.minecraft.entity.Entity)(__stackOp604_87_0)).t + (life19_433 * life31_521))));
    net.minecraft.entity.Entity __stackOp604_90_0 = life16_400;
    ((net.minecraft.entity.Entity)(__stackOp604_90_0)).u = ((double)((((net.minecraft.entity.Entity)(__stackOp604_90_0)).u + (life21_443 * life31_521))));
    net.minecraft.entity.Entity __stackOp604_93_0 = life16_400;
    ((net.minecraft.entity.Entity)(__stackOp604_93_0)).v = ((double)((((net.minecraft.entity.Entity)(__stackOp604_93_0)).v + (life23_482 * life31_521))));
    spill604_19 = ((life16_400 instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0);
    if (!((life3_7 == null))) {
        forestValue604_530_0 = spill604_19;
        break forest_join_530;
    }
    if (!((spill604_19 != 0))) {
        break forest_join_549;
    }
    spill604_20 = ((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.entity.player.EntityPlayer)(life16_400)))).b1;
    if (!((life3_7 == null))) {
        forestValue604_548_0 = spill604_20;
        break forest_join_548;
    }
    forestValue604_530_0 = ((((net.minecraft.entity.player.PlayerCapabilities)(spill604_20)).a) ? 1 : 0);
    }
    if (!((forestValue604_530_0 == 0))) {
        break forest_join_549;
    }
    forestValue604_548_0 = ((java.util.Map)(this.k)).put(((java.lang.Object)(((net.minecraft.entity.player.EntityPlayer)(life16_400)))), ((java.lang.Object)(new moom.DR((life19_433 * life29_496), (life21_443 * life29_496), (life23_482 * life29_496)))));
    }
    recovery.source.CarrierOps.discard(forestValue604_548_0);
    }
    if (!((life3_7 != null))) {
        continue forest_cycle_372;
    }
    break forest_cycle_372;
    }
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static int a(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x3A9D;
        if (Ei.n[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = m[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])o.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    o.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/Ei", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Ei.n[n2] = n4;
        }
        return Ei.n[n2];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.Ei.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral4382_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Ei"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public java.util.Map<net.minecraft.entity.player.EntityPlayer, moom.DR> a__Map() {
return this.k;
}


public net.minecraft.entity.EntityLivingBase a__sG() {
net.minecraft.entity.Entity forwardValue1840_15_0;
    int forwardValue1840_29_0;
    net.minecraft.entity.Entity forwardValue1840_32_0;
    net.minecraft.entity.EntityLivingBase forwardValue1840_35_0;
    net.minecraft.entity.Entity spill1840_0;
    int spill1840_1;
    net.minecraft.entity.Entity spill1840_2;
    long life1_3;
    java.lang.String life3_5;
    forward_join_35: {
    forward_join_34: {
    forward_join_32: {
    forward_join_29: {
    forward_join_24: {
    forward_join_15: {
    forward_join_13: {
    life1_3 = (moom.Ei.l ^ 127184961206713L);
    life3_5 = net.minecraft.world.World.c__String();
    spill1840_0 = this.h;
    if (!((life3_5 == null))) {
        forwardValue1840_15_0 = spill1840_0;
        break forward_join_15;
    }
    if (!((spill1840_0 == null))) {
        break forward_join_13;
    }
    forwardValue1840_35_0 = null;
    break forward_join_35;
    }
    forwardValue1840_15_0 = this.h;
    }
    spill1840_1 = ((forwardValue1840_15_0 instanceof moom.tK) ? 1 : 0);
    if (!((life3_5 == null))) {
        forwardValue1840_29_0 = spill1840_1;
        break forward_join_29;
    }
    if (!((spill1840_1 != 0))) {
        break forward_join_24;
    }
    forwardValue1840_35_0 = ((moom.tK)(((moom.tK)(this.h)))).a();
    break forward_join_35;
    }
    spill1840_2 = this.h;
    if (!((life3_5 == null))) {
        forwardValue1840_32_0 = spill1840_2;
        break forward_join_32;
    }
    forwardValue1840_29_0 = ((spill1840_2 instanceof net.minecraft.entity.EntityLivingBase) ? 1 : 0);
    }
    if (!((forwardValue1840_29_0 != 0))) {
        break forward_join_34;
    }
    forwardValue1840_32_0 = this.h;
    }
    forwardValue1840_35_0 = ((net.minecraft.entity.EntityLivingBase)(forwardValue1840_32_0));
    break forward_join_35;
    }
    forwardValue1840_35_0 = null;
    }
    return forwardValue1840_35_0;
}


public void a(boolean p0) {
moom.Ei lexicalValue597_62_0;
    int lexicalValue597_106_0;
    net.minecraft.block.Block lexicalValue597_258_0;
    int lexicalValue597_284_0;
    int lexicalValue597_297_0;
    moom.Ei lexicalValue597_299_0;
    net.minecraft.block.Block lexicalValue597_325_0;
    int lexicalValue597_333_0;
    int lexicalValue597_342_0;
    java.lang.String spill597_0;
    moom.Ei spill597_1;
    moom.Ei spill597_2;
    boolean spill597_3;
    boolean spill597_4;
    net.minecraft.block.Block spill597_5;
    boolean spill597_6;
    moom.Ei spill597_7;
    net.minecraft.block.Block spill597_8;
    boolean spill597_9;
    long life2_3;
    java.lang.String life4_31;
    java.util.Iterator life5_102;
    moom.DT life6_109;
    net.minecraft.block.Block life7_115;
    double life8_140;
    double life10_150;
    double life12_160;
    double life14_165;
    double life16_170;
    double life18_175;
    double life20_189;
    double life14_193;
    double life16_197;
    double life18_201;
    double life22_211;
    double life22_226;
    double life14_230;
    double life16_234;
    double life18_238;
    java.util.Iterator life5_343;
    moom.DT life6_350;
    lexical_join_345: {
    lexical_join_299: {
    lexical_join_297: {
    lexical_join_293: {
    lexical_join_76: {
    lexical_join_62: {
    lexical_join_61: {
    life2_3 = (moom.Ei.l ^ 12273702207240L);
    spill597_0 = net.minecraft.world.World.c__String();
    ((net.minecraft.world.World)(this.d)).a(((double)(this.e)), ((double)(this.f)), ((double)(this.g)), ((java.lang.String)("random.explode")), ((float)(0x1.0p2f)), ((float)(((0x1.0p0f + ((((java.util.Random)(((net.minecraft.world.World)(this.d)).u)).nextFloat() - ((java.util.Random)(((net.minecraft.world.World)(this.d)).u)).nextFloat()) * 0x1.99999ap-3f)) * 0x1.666666p-1f))));
    life4_31 = spill597_0;
    spill597_1 = this;
    if (!((life4_31 == null))) {
        lexicalValue597_62_0 = spill597_1;
        break lexical_join_62;
    }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(((moom.Ei)(spill597_1)).i)), ((float)(0x1.0p1f))) >= 0))) {
        break lexical_join_61;
    }
    spill597_2 = this;
    if (!((life4_31 == null))) {
        lexicalValue597_62_0 = spill597_2;
        break lexical_join_62;
    }
    if (!(((moom.Ei)(spill597_2)).b)) {
        break lexical_join_61;
    }
    ((net.minecraft.world.World)(this.d)).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.EXPLOSION_HUGE)), ((double)(this.e)), ((double)(this.f)), ((double)(this.g)), ((double)(0x1.0p0d)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((int[])(new int[0])));
    if (!((life4_31 != null))) {
        break lexical_join_76;
    }
    }
    lexicalValue597_62_0 = this;
    }
    ((net.minecraft.world.World)(((moom.Ei)(lexicalValue597_62_0)).d)).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.EXPLOSION_LARGE)), ((double)(this.e)), ((double)(this.f)), ((double)(this.g)), ((double)(0x1.0p0d)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((int[])(new int[0])));
    }
    spill597_3 = this.b;
    if (!((life4_31 == null))) {
        lexicalValue597_297_0 = ((spill597_3) ? 1 : 0);
        break lexical_join_297;
    }
    if (!(spill597_3)) {
        break lexical_join_293;
    }
    life5_102 = ((java.util.List)(this.j)).iterator();
    lexical_cycle_85: while (true) {
    lexical_join_291: {
    lexical_join_284: {
    lexical_join_277: {
    lexical_join_258: {
    lexical_join_251: {
    lexical_join_106: {
    if (!(((java.util.Iterator)(life5_102)).hasNext())) {
        break lexical_join_293;
    }
    life6_109 = ((moom.DT)(((java.util.Iterator)(life5_102)).next()));
    life7_115 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(this.d)).a__fE(((moom.DT)(life6_109))))).a__ch();
    spill597_4 = p0;
    if (!((life4_31 == null))) {
        lexicalValue597_297_0 = ((spill597_4) ? 1 : 0);
        break lexical_join_297;
    }
    if (!((life4_31 == null))) {
        lexicalValue597_106_0 = ((spill597_4) ? 1 : 0);
        break lexical_join_106;
    }
    if (!(spill597_4)) {
        break lexical_join_251;
    }
    lexicalValue597_106_0 = ((moom.DT)(life6_109)).a();
    }
    life8_140 = ((double) (((float) lexicalValue597_106_0) + ((java.util.Random)(((net.minecraft.world.World)(this.d)).u)).nextFloat()));
    life10_150 = ((double) (((float) __sourceExactCall_83272ff1cb0754(((moom.DT)(life6_109)))) + ((java.util.Random)(((net.minecraft.world.World)(this.d)).u)).nextFloat()));
    life12_160 = ((double) (((float) ((moom.DT)(life6_109)).c()) + ((java.util.Random)(((net.minecraft.world.World)(this.d)).u)).nextFloat()));
    life14_165 = (life8_140 - this.e);
    life16_170 = (life10_150 - this.f);
    life18_175 = (life12_160 - this.g);
    life20_189 = ((double) moom.Dr.a__Float(((double)((((life14_165 * life14_165) + (life16_170 * life16_170)) + (life18_175 * life18_175))))));
    life14_193 = (life14_165 / life20_189);
    life16_197 = (life16_170 / life20_189);
    life18_201 = (life18_175 / life20_189);
    life22_211 = (0x1.0p-1d / ((life20_189 / ((double) this.i)) + 0x1.999999999999ap-4d));
    life22_226 = (life22_211 * ((double) ((((java.util.Random)(((net.minecraft.world.World)(this.d)).u)).nextFloat() * ((java.util.Random)(((net.minecraft.world.World)(this.d)).u)).nextFloat()) + 0x1.333334p-2f)));
    life14_230 = (life14_193 * life22_226);
    life16_234 = (life16_197 * life22_226);
    life18_238 = (life18_201 * life22_226);
    ((net.minecraft.world.World)(this.d)).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.EXPLOSION_NORMAL)), ((double)(((life8_140 + this.e) / 0x1.0p1d))), ((double)(((life10_150 + this.f) / 0x1.0p1d))), ((double)(((life12_160 + this.g) / 0x1.0p1d))), ((double)(life14_230)), ((double)(life16_234)), ((double)(life18_238)), ((int[])(new int[0])));
    ((net.minecraft.world.World)(this.d)).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.SMOKE_NORMAL)), ((double)(life8_140)), ((double)(life10_150)), ((double)(life12_160)), ((double)(life14_230)), ((double)(life16_234)), ((double)(life18_238)), ((int[])(new int[0])));
    }
    spill597_5 = life7_115;
    if (!((life4_31 == null))) {
        lexicalValue597_258_0 = spill597_5;
        break lexical_join_258;
    }
    if (!((((net.minecraft.block.Block)(spill597_5)).a__fn() != moom.fn.a))) {
        break lexical_join_291;
    }
    lexicalValue597_258_0 = life7_115;
    }
    spill597_6 = ((net.minecraft.block.Block)(lexicalValue597_258_0)).a(((moom.Ei)(this)));
    if (!((life4_31 == null))) {
        lexicalValue597_284_0 = ((spill597_6) ? 1 : 0);
        break lexical_join_284;
    }
    if (!(spill597_6)) {
        break lexical_join_277;
    }
    ((net.minecraft.block.Block)(life7_115)).a(((net.minecraft.world.World)(this.d)), ((moom.DT)(life6_109)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(this.d)).a__fE(((moom.DT)(life6_109))))), ((float)((0x1.0p0f / this.i))), ((int)(0)));
    }
    lexicalValue597_284_0 = ((((net.minecraft.world.World)(this.d)).a(((moom.DT)(life6_109)), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a))))), ((int)(3)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(lexicalValue597_284_0);
    ((net.minecraft.block.Block)(life7_115)).a(((net.minecraft.world.World)(this.d)), ((moom.DT)(life6_109)), ((moom.Ei)(this)));
    }
    if (!((life4_31 != null))) { continue lexical_cycle_85; }
    break lexical_cycle_85;
    }
    }
    spill597_7 = this;
    if (!((life4_31 == null))) {
        lexicalValue597_299_0 = spill597_7;
        break lexical_join_299;
    }
    lexicalValue597_297_0 = ((((moom.Ei)(spill597_7)).a) ? 1 : 0);
    }
    if (!((lexicalValue597_297_0 != 0))) {
        break lexical_join_345;
    }
    lexicalValue597_299_0 = this;
    }
    life5_343 = ((java.util.List)(((moom.Ei)(lexicalValue597_299_0)).j)).iterator();
    lexical_cycle_302: while (true) {
    lexical_join_343: {
    lexical_join_342: {
    lexical_join_333: {
    lexical_join_325: {
    if (!(((java.util.Iterator)(life5_343)).hasNext())) {
        break lexical_join_345;
    }
    life6_350 = ((moom.DT)(((java.util.Iterator)(life5_343)).next()));
    spill597_8 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(this.d)).a__fE(((moom.DT)(life6_350))))).a__ch();
    if (!((life4_31 == null))) {
        lexicalValue597_325_0 = spill597_8;
        break lexical_join_325;
    }
    if (!((((net.minecraft.block.Block)(spill597_8)).a__fn() == moom.fn.a))) {
        break lexical_join_343;
    }
    lexicalValue597_325_0 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(this.d)).a__fE(((moom.DT)(((moom.DT)(life6_350)).b__DT()))))).a__ch();
    }
    spill597_9 = ((net.minecraft.block.Block)(lexicalValue597_325_0)).a__Boolean();
    if (!((life4_31 == null))) {
        lexicalValue597_333_0 = ((spill597_9) ? 1 : 0);
        break lexical_join_333;
    }
    if (!(spill597_9)) {
        break lexical_join_343;
    }
    lexicalValue597_333_0 = ((java.util.Random)(this.c)).nextInt(((int)(3)));
    }
    if (!((life4_31 == null))) {
        lexicalValue597_342_0 = lexicalValue597_333_0;
        break lexical_join_342;
    }
    if (!((lexicalValue597_333_0 == 0))) {
        break lexical_join_343;
    }
    lexicalValue597_342_0 = ((((net.minecraft.world.World)(this.d)).a(((moom.DT)(life6_350)), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_5292331d6ece3f(((net.minecraft.block.BlockFire)(net.minecraft.init.Blocks.ab))))))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(lexicalValue597_342_0);
    }
    if (!((life4_31 != null))) { continue lexical_cycle_302; }
    break lexical_cycle_302;
    }
    }
    return;
}


public java.util.List<moom.DT> a() {
return this.j;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral4382_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic604_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic604_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic604_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic604_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic604_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic604_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic604_9(int a0, long a1) throws E;

private static native net.minecraft.util.DamageSource __sourceExactCall_c4aa3d32e9e90d(moom.Ei p0);
private static native double __sourceExactCall_b4ac994efa3f39(net.minecraft.entity.Entity p0, double p1);

private static native int __sourceExactCall_83272ff1cb0754(moom.DT p0);
private static native net.minecraft.block.state.IBlockState __sourceExactCall_7dba7f72a5b74e(net.minecraft.block.Block p0);
private static native net.minecraft.block.state.IBlockState __sourceExactCall_5292331d6ece3f(net.minecraft.block.BlockFire p0);
}
