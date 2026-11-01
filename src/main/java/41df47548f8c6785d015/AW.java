package moom;


public class AW extends moom.AV {

protected moom.II l;

private boolean m;

private static final long q;

private static final long s;

public AW(net.minecraft.entity.EntityLiving p0, net.minecraft.world.World p1) {
super(p0, p1);
}


static {
q = ((long)(((moom._a)(moom._c.a(((long)(-5874465103573741757L)), ((long)(-8967445051766201584L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(124821858629987L)))));
    long local0_life6 = (moom.AW.q ^ 89376334315678L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill472_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill472_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill472_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill472_13 = new byte[8];
    (__sourceSpill472_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill472_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation472_15 = __sourceSpill472_13;
    ((javax.crypto.Cipher)(__sourceSpill472_10)).init(((int)(__sourceSpill472_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill472_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation472_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = 217234603372737732L;
    byte[] __sourceSpill472_19 = new byte[8];
    (__sourceSpill472_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill472_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill472_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill472_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill472_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill472_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill472_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill472_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill472_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill472_20)).doFinal(((byte[])(__sourceSpill472_19)));
    s = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


private boolean b(int p0, int p1, int p2, int p3, int p4, int p5, moom.DR p6, double p7, double p8) {
int lexicalValue477_85_0;
    int lexicalValue477_89_0;
    int[] spill477_0;
    int spill477_1;
    boolean spill477_2;
    long life12_3;
    java.util.Iterator life15_31;
    int[] life14_32;
    moom.DT life16_39;
    double life17_48;
    double life19_57;
    net.minecraft.block.Block life21_78;
    lexical_join_89: {
    lexical_join_88: {
    life12_3 = (moom.AW.q ^ 125676209325883L);
    spill477_0 = moom.AV.b__ArrayInt();
    life15_31 = ((java.lang.Iterable)(moom.DT.a(((moom.DT)(new moom.DT(p0, p1, p2))), ((moom.DT)(new moom.DT(((p0 + p3) - 1), ((p1 + p4) - 1), ((p2 + p5) - 1))))))).iterator();
    life14_32 = spill477_0;
    lexical_cycle_33: while (true) {
    lexical_join_86: {
    lexical_join_85: {
    if (!(((java.util.Iterator)(life15_31)).hasNext())) {
        break lexical_join_88;
    }
    life16_39 = ((moom.DT)(((java.util.Iterator)(life15_31)).next()));
    life17_48 = ((((double) ((moom.DT)(life16_39)).a()) + 0x1.0p-1d) - ((moom.DR)(p6)).a);
    life19_57 = ((((double) ((moom.DT)(life16_39)).c()) + 0x1.0p-1d) - ((moom.DR)(p6)).c);
    spill477_1 = recovery.source.CarrierOps.dcmpl(((double)(((life17_48 * p7) + (life19_57 * p8)))), ((double)(0x0.0p0d)));
    if (!((life14_32 != null))) {
        lexicalValue477_89_0 = spill477_1;
        break lexical_join_89;
    }
    if (!((spill477_1 >= 0))) {
        break lexical_join_86;
    }
    life21_78 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(((moom.AW)(this)).b)).a__fE(((moom.DT)(life16_39))))).a__ch();
    spill477_2 = ((net.minecraft.block.Block)(life21_78)).a__Boolean(((net.minecraft.world.IBlockAccess)(((moom.AW)(this)).b)), ((moom.DT)(life16_39)));
    if (!((life14_32 != null))) {
        lexicalValue477_85_0 = ((spill477_2) ? 1 : 0);
        break lexical_join_85;
    }
    if (!((!spill477_2))) {
        break lexical_join_86;
    }
    lexicalValue477_85_0 = 0;
    }
    return ((lexicalValue477_85_0) != 0);
    }
    if (!((life14_32 == null))) { continue lexical_cycle_33; }
    break lexical_cycle_33;
    }
    }
    lexicalValue477_89_0 = 1;
    }
    return ((lexicalValue477_89_0) != 0);
}


public void b(boolean p0) {
((moom.II)(this.l)).b(((boolean)(p0)));
    return;
}


protected boolean b__Boolean() {
int forwardValue1450_25_0;
    int forwardValue1450_31_0;
    int forwardValue1450_38_0;
    int forwardValue1450_42_0;
    int forwardValue1450_44_0;
    boolean spill1450_0;
    boolean spill1450_1;
    boolean spill1450_2;
    long life1_3;
    int[] life3_5;
    forward_join_44: {
    forward_join_43: {
    forward_join_42: {
    forward_join_41: {
    forward_join_38: {
    forward_join_31: {
    forward_join_25: {
    forward_join_22: {
    life1_3 = (moom.AW.q ^ 49240389944927L);
    life3_5 = moom.AV.b__ArrayInt();
    spill1450_0 = ((net.minecraft.entity.EntityLiving)(((moom.AW)(this)).a)).A;
    if (!((life3_5 != null))) {
        forwardValue1450_42_0 = ((spill1450_0) ? 1 : 0);
        break forward_join_42;
    }
    if (!((!spill1450_0))) {
        break forward_join_41;
    }
    spill1450_1 = ((moom.AW)(this)).f();
    if (!((life3_5 != null))) {
        forwardValue1450_25_0 = ((spill1450_1) ? 1 : 0);
        break forward_join_25;
    }
    if (!(spill1450_1)) {
        break forward_join_22;
    }
    spill1450_2 = ((moom.AW)(this)).c__Boolean();
    if (!((life3_5 != null))) {
        forwardValue1450_42_0 = ((spill1450_2) ? 1 : 0);
        break forward_join_42;
    }
    if (!((!spill1450_2))) {
        break forward_join_41;
    }
    }
    forwardValue1450_25_0 = ((((net.minecraft.entity.EntityLiving)(((moom.AW)(this)).a)).s__Boolean()) ? 1 : 0);
    }
    if (!((life3_5 != null))) {
        forwardValue1450_31_0 = forwardValue1450_25_0;
        break forward_join_31;
    }
    if (!((forwardValue1450_25_0 != 0))) {
        break forward_join_43;
    }
    forwardValue1450_31_0 = ((((moom.AW)(this)).a instanceof net.minecraft.entity.monster.EntityZombie) ? 1 : 0);
    }
    if (!((life3_5 != null))) {
        forwardValue1450_38_0 = forwardValue1450_31_0;
        break forward_join_38;
    }
    if (!((forwardValue1450_31_0 != 0))) {
        break forward_join_43;
    }
    forwardValue1450_38_0 = ((((net.minecraft.entity.EntityLiving)(((moom.AW)(this)).a)).g instanceof net.minecraft.entity.passive.EntityChicken) ? 1 : 0);
    }
    if (!((life3_5 != null))) {
        forwardValue1450_42_0 = forwardValue1450_38_0;
        break forward_join_42;
    }
    if (!((forwardValue1450_38_0 != 0))) {
        break forward_join_43;
    }
    }
    forwardValue1450_42_0 = 1;
    }
    forwardValue1450_44_0 = forwardValue1450_42_0;
    break forward_join_44;
    }
    forwardValue1450_44_0 = 0;
    }
    return ((forwardValue1450_44_0) != 0);
}


public boolean e() {
return (__sourceIntrinsic_booleanComparison((((moom.II)(this.l)).a__Boolean())) != 0);
}


public void e(boolean p0) {
this.m = ((boolean)(p0));
    return;
}


public void c(boolean p0) {
((moom.II)(this.l)).a(((boolean)(p0)));
    return;
}


public boolean f() {
return (__sourceIntrinsic_booleanComparison((((moom.II)(this.l)).b__sourceReturn_aae029aa0a())) != 0);
}


protected void d() {
int lexicalValue478_34_0;
    int lexicalValue478_39_0;
    int[] spill478_0;
    boolean spill478_1;
    long life1_3;
    int[] life3_7;
    int life4_48;
    moom.AZ life5_58;
    lexical_join_75: {
    lexical_join_39: {
    lexical_join_38: {
    lexical_join_34: {
    life1_3 = (moom.AW.q ^ 17349338419910L);
    spill478_0 = moom.AV.b__ArrayInt();
    super.d();
    life3_7 = spill478_0;
    spill478_1 = this.m;
    if (!((life3_7 != null))) {
        lexicalValue478_34_0 = ((spill478_1) ? 1 : 0);
        break lexical_join_34;
    }
    if (!(spill478_1)) {
        break lexical_join_75;
    }
    lexicalValue478_34_0 = ((((net.minecraft.world.World)(((moom.AW)(this)).b)).e(((moom.DT)(new moom.DT(moom.Dr.b__Int(((double)(((net.minecraft.entity.EntityLiving)(((moom.AW)(this)).a)).n))), ((int) (((moom.CA)(((net.minecraft.entity.EntityLiving)(((moom.AW)(this)).a)).b())).c + 0x1.0p-1d)), moom.Dr.b__Int(((double)(((net.minecraft.entity.EntityLiving)(((moom.AW)(this)).a)).p)))))))) ? 1 : 0);
    }
    if (!((life3_7 != null))) {
        lexicalValue478_39_0 = lexicalValue478_34_0;
        break lexical_join_39;
    }
    if (!((lexicalValue478_34_0 != 0))) {
        break lexical_join_38;
    }
    return;
    }
    lexicalValue478_39_0 = 0;
    }
    life4_48 = lexicalValue478_39_0;
    lexical_cycle_40: while (true) {
    lexical_join_73: {
    lexical_join_72: {
    if (!((life4_48 < ((moom.AT)(((moom.AW)(this)).c)).a()))) {
        break lexical_join_75;
    }
    life5_58 = ((moom.AT)(((moom.AW)(this)).c)).a(((int)(life4_48)));
    if (!((life3_7 != null))) {
        break lexical_join_73;
    }
    if (!(((net.minecraft.world.World)(((moom.AW)(this)).b)).e(((moom.DT)(new moom.DT(((moom.AZ)(life5_58)).a, ((moom.AZ)(life5_58)).b, ((moom.AZ)(life5_58)).c)))))) {
        break lexical_join_72;
    }
    ((moom.AT)(((moom.AW)(this)).c)).a__Void(((int)((life4_48 - 1))));
    return;
    }
    life4_48 += 1;
    }
    if (!((life3_7 == null))) { continue lexical_cycle_40; }
    break lexical_cycle_40;
    }
    }
    return;
}


public void d(boolean p0) {
((moom.II)(this.l)).d(((boolean)(p0)));
    return;
}


public boolean d__Boolean() {
return (__sourceIntrinsic_booleanComparison((((moom.II)(this.l)).c())) != 0);
}


protected boolean a(moom.DR p0, moom.DR p1, int p2, int p3, int p4) {
double forestValue900065_45_0;
    double forestValue900065_45_1;
    int forestValue900065_88_0;
    int forestValue900065_124_0;
    int forestValue900065_142_0;
    int forestValue900065_146_0;
    int forestValue900065_148_0;
    int forestValue900065_156_0;
    int forestValue900065_158_0;
    int forestValue900065_182_0;
    int forestValue900065_216_0;
    int forestValue900065_266_0;
    int forestValue900065_285_0;
    int forestValue900065_290_0;
    int forestValue900065_291_0;
    int[] spill900065_0;
    double spill900065_1;
    double spill900065_2;
    boolean spill900065_3;
    int spill900065_4;
    int spill900065_5;
    int spill900065_6;
    int spill900065_7;
    int spill900065_8;
    int spill900065_9;
    long life6_3;
    int life9_7;
    int life10_11;
    double life11_18;
    double life13_24;
    int[] life8_25;
    double life15_33;
    double life17_50;
    double life11_54;
    double life13_58;
    int life3_62;
    int life5_66;
    int life5_96;
    double life19_101;
    double life21_106;
    double life23_112;
    double life25_118;
    int life27_171;
    int life28_186;
    int life29_190;
    int life30_194;
    int life31_198;
    int life32_202;
    forest_join_291: {
    forest_join_290: {
    forest_join_289: {
    forest_join_158: {
    forest_join_157: {
    forest_join_156: {
    forest_join_148: {
    forest_join_147: {
    forest_join_146: {
    forest_join_142: {
    forest_join_131: {
    forest_join_124: {
    forest_join_121: {
    forest_join_88: {
    forest_join_81: {
    forest_join_45: {
    forest_join_42: {
    life6_3 = (moom.AW.q ^ 15598492092850L);
    life9_7 = moom.Dr.b__Int(((double)(((moom.DR)(p0)).a)));
    life10_11 = moom.Dr.b__Int(((double)(((moom.DR)(p0)).c)));
    spill900065_0 = moom.AV.b__ArrayInt();
    life11_18 = (((moom.DR)(p1)).a - ((moom.DR)(p0)).a);
    life13_24 = (((moom.DR)(p1)).c - ((moom.DR)(p0)).c);
    life8_25 = spill900065_0;
    life15_33 = ((life11_18 * life11_18) + (life13_24 * life13_24));
    spill900065_1 = life15_33;
    spill900065_2 = 0x1.5798ee2308c3ap-27d;
    if (!((life8_25 != null))) {
        forestValue900065_45_0 = spill900065_1;
        forestValue900065_45_1 = spill900065_2;
        break forest_join_45;
    }
    if (!((recovery.source.CarrierOps.dcmpg(((double)(spill900065_1)), ((double)(spill900065_2))) < 0))) {
        break forest_join_42;
    }
    return ((0) != 0);
    }
    forestValue900065_45_0 = 0x1.0p0d;
    forestValue900065_45_1 = java.lang.Math.sqrt(((double)(life15_33)));
    }
    life17_50 = (forestValue900065_45_0 / forestValue900065_45_1);
    life11_54 = (life11_18 * life17_50);
    life13_58 = (life13_24 * life17_50);
    life3_62 = (p2 + 2);
    life5_66 = (p4 + 2);
    spill900065_3 = ((moom.AW)(this)).a(((int)(life9_7)), ((int)(((int) ((moom.DR)(p0)).b))), ((int)(life10_11)), ((int)(life3_62)), ((int)(p3)), ((int)(life5_66)), ((moom.DR)(p0)), ((double)(life11_54)), ((double)(life13_58)));
    if (!((life8_25 != null))) {
        forestValue900065_88_0 = ((spill900065_3) ? 1 : 0);
        break forest_join_88;
    }
    if (!((!spill900065_3))) {
        break forest_join_81;
    }
    return ((0) != 0);
    }
    life3_62 = (life3_62 - 2);
    forestValue900065_88_0 = (life5_66 - 2);
    }
    life5_96 = forestValue900065_88_0;
    life19_101 = (0x1.0p0d / java.lang.Math.abs(((double)(life11_54))));
    life21_106 = (0x1.0p0d / java.lang.Math.abs(((double)(life13_58))));
    life23_112 = (((double) life9_7) - ((moom.DR)(p0)).a);
    life25_118 = (((double) life10_11) - ((moom.DR)(p0)).c);
    spill900065_4 = recovery.source.CarrierOps.dcmpl(((double)(life11_54)), ((double)(0x0.0p0d)));
    if (!((life8_25 != null))) {
        forestValue900065_124_0 = spill900065_4;
        break forest_join_124;
    }
    if (!((spill900065_4 >= 0))) {
        break forest_join_121;
    }
    life23_112 = (life23_112 + 0x1.0p0d);
    }
    forestValue900065_124_0 = recovery.source.CarrierOps.dcmpl(((double)(life13_58)), ((double)(0x0.0p0d)));
    }
    if (!((life8_25 != null))) {
        forestValue900065_142_0 = forestValue900065_124_0;
        break forest_join_142;
    }
    if (!((forestValue900065_124_0 >= 0))) {
        break forest_join_131;
    }
    life25_118 = (life25_118 + 0x1.0p0d);
    }
    life23_112 = (life23_112 / life11_54);
    life25_118 = (life25_118 / life13_58);
    forestValue900065_142_0 = recovery.source.CarrierOps.dcmpg(((double)(life11_54)), ((double)(0x0.0p0d)));
    }
    if (!((life8_25 != null))) {
        forestValue900065_146_0 = forestValue900065_142_0;
        break forest_join_146;
    }
    if (!((forestValue900065_142_0 < 0))) {
        break forest_join_147;
    }
    forestValue900065_146_0 = -1;
    }
    forestValue900065_148_0 = forestValue900065_146_0;
    break forest_join_148;
    }
    forestValue900065_148_0 = 1;
    }
    life27_171 = forestValue900065_148_0;
    spill900065_5 = recovery.source.CarrierOps.dcmpg(((double)(life13_58)), ((double)(0x0.0p0d)));
    if (!((life8_25 != null))) {
        forestValue900065_156_0 = spill900065_5;
        break forest_join_156;
    }
    if (!((spill900065_5 < 0))) {
        break forest_join_157;
    }
    forestValue900065_156_0 = -1;
    }
    forestValue900065_158_0 = forestValue900065_156_0;
    break forest_join_158;
    }
    forestValue900065_158_0 = 1;
    }
    life28_186 = forestValue900065_158_0;
    life29_190 = moom.Dr.b__Int(((double)(((moom.DR)(p1)).a)));
    life30_194 = moom.Dr.b__Int(((double)(((moom.DR)(p1)).c)));
    life31_198 = (life29_190 - life9_7);
    life32_202 = (life30_194 - life10_11);
    forest_cycle_175: while (true) {
    forest_join_235: {
    if (!(((life31_198 * life27_171) <= 0))) {
        break forest_join_235;
    }
    forestValue900065_182_0 = (life32_202 * life28_186);
    forest_cycle_182: while (true) {
    forest_join_217: {
    forest_join_216: {
    forest_join_205: {
    if (!((life8_25 != null))) {
        forestValue900065_290_0 = forestValue900065_182_0;
        break forest_join_290;
    }
    if (!((forestValue900065_182_0 > 0))) {
        break forest_join_289;
    }
    spill900065_6 = recovery.source.CarrierOps.dcmpg(((double)(life23_112)), ((double)(life25_118)));
    if (!((life8_25 != null))) {
        forestValue900065_216_0 = spill900065_6;
        break forest_join_216;
    }
    if (!((spill900065_6 < 0))) {
        break forest_join_205;
    }
    life23_112 = (life23_112 + life19_101);
    life9_7 = (life9_7 + life27_171);
    life31_198 = (life29_190 - life9_7);
    if (!((life8_25 == null))) {
        break forest_join_217;
    }
    }
    life25_118 = (life25_118 + life21_106);
    life10_11 = (life10_11 + life28_186);
    forestValue900065_216_0 = (life30_194 - life10_11);
    }
    life32_202 = forestValue900065_216_0;
    }
    if (!((!((moom.AW)(this)).a(((int)(life9_7)), ((int)(((int) ((moom.DR)(p0)).b))), ((int)(life10_11)), ((int)(life3_62)), ((int)(p3)), ((int)(life5_96)), ((moom.DR)(p0)), ((double)(life11_54)), ((double)(life13_58)))))) {
        continue forest_cycle_175;
    }
    spill900065_7 = 0;
    if (!((life8_25 != null))) {
        forestValue900065_182_0 = spill900065_7;
        continue forest_cycle_182;
    }
    break forest_cycle_182;
    }
    forestValue900065_291_0 = spill900065_7;
    break forest_join_291;
    }
    forest_cycle_235: while (true) {
    forest_join_285: {
    forest_join_267: {
    forest_join_266: {
    forest_join_255: {
    spill900065_8 = recovery.source.CarrierOps.dcmpg(((double)(life23_112)), ((double)(life25_118)));
    if (!((life8_25 != null))) {
        forestValue900065_266_0 = spill900065_8;
        break forest_join_266;
    }
    if (!((spill900065_8 < 0))) {
        break forest_join_255;
    }
    life23_112 = (life23_112 + life19_101);
    life9_7 = (life9_7 + life27_171);
    life31_198 = (life29_190 - life9_7);
    if (!((life8_25 == null))) {
        break forest_join_267;
    }
    }
    life25_118 = (life25_118 + life21_106);
    life10_11 = (life10_11 + life28_186);
    forestValue900065_266_0 = (life30_194 - life10_11);
    }
    life32_202 = forestValue900065_266_0;
    }
    if (!((!((moom.AW)(this)).a(((int)(life9_7)), ((int)(((int) ((moom.DR)(p0)).b))), ((int)(life10_11)), ((int)(life3_62)), ((int)(p3)), ((int)(life5_96)), ((moom.DR)(p0)), ((double)(life11_54)), ((double)(life13_58)))))) {
        continue forest_cycle_175;
    }
    spill900065_9 = 0;
    if (!((life8_25 != null))) {
        forestValue900065_285_0 = spill900065_9;
        break forest_join_285;
    }
    forestValue900065_291_0 = spill900065_9;
    break forest_join_291;
    }
    if (!((life8_25 != null))) {
        forestValue900065_290_0 = forestValue900065_285_0;
        break forest_join_290;
    }
    if (!((forestValue900065_285_0 > 0))) {
        break forest_join_289;
    }
    continue forest_cycle_235;
    }
    }
    }
    forestValue900065_290_0 = 1;
    }
    return ((forestValue900065_290_0) != 0);
    }
    return ((forestValue900065_291_0) != 0);
}


protected moom.AU a__AU() {
this.l = ((moom.II)(new moom.II()));
    ((moom.II)(this.l)).a(((boolean)(true)));
    return new moom.AU(this.l);
}


public void a(boolean p0) {
((moom.II)(this.l)).c(((boolean)(p0)));
    return;
}


private boolean a(int p0, int p1, int p2, int p3, int p4, int p5, moom.DR p6, double p7, double p8) {
int forestValue582_35_0;
    int forestValue582_37_0;
    moom.fn forestValue582_104_0;
    moom.fn forestValue582_104_1;
    moom.fn forestValue582_116_0;
    moom.fn forestValue582_116_1;
    int forestValue582_128_0;
    int forestValue582_132_0;
    int[] spill582_0;
    boolean spill582_1;
    int spill582_2;
    int spill582_3;
    moom.fn spill582_4;
    moom.fn spill582_5;
    boolean spill582_6;
    long life12_3;
    int life15_9;
    int life16_16;
    int[] life14_17;
    int life17_36;
    int life18_45;
    double life19_58;
    double life21_66;
    net.minecraft.block.Block life23_94;
    moom.fn life24_97;
    forest_join_132: {
    forest_join_131: {
    forest_join_129: {
    forest_join_128: {
    forest_join_127: {
    forest_join_125: {
    forest_join_35: {
    forest_join_34: {
    life12_3 = (moom.AW.q ^ 32518523610434L);
    life15_9 = (p0 - (p3 / 2));
    spill582_0 = moom.AV.b__ArrayInt();
    life16_16 = (p2 - (p5 / 2));
    life14_17 = spill582_0;
    spill582_1 = ((moom.AW)(this)).b(((int)(life15_9)), ((int)(p1)), ((int)(life16_16)), ((int)(p3)), ((int)(p4)), ((int)(p5)), ((moom.DR)(p6)), ((double)(p7)), ((double)(p8)));
    if (!((life14_17 != null))) {
        forestValue582_35_0 = ((spill582_1) ? 1 : 0);
        break forest_join_35;
    }
    if (!((!spill582_1))) {
        break forest_join_34;
    }
    return ((0) != 0);
    }
    forestValue582_35_0 = life15_9;
    }
    life17_36 = forestValue582_35_0;
    forest_cycle_36: while (true) {
    forest_join_121: {
    forestValue582_37_0 = life17_36;
    forest_cycle_37: while (true) {
    if (!((forestValue582_37_0 < (life15_9 + p3)))) {
        break forest_join_131;
    }
    spill582_2 = life16_16;
    if (!((life14_17 != null))) {
        forestValue582_132_0 = spill582_2;
        break forest_join_132;
    }
    life18_45 = spill582_2;
    forest_cycle_45: while (true) {
    forest_join_119: {
    forest_join_118: {
    forest_join_116: {
    forest_join_114: {
    forest_join_104: {
    forest_join_102: {
    if (!((life18_45 < (life16_16 + p5)))) {
        break forest_join_121;
    }
    life19_58 = ((((double) life17_36) + 0x1.0p-1d) - ((moom.DR)(p6)).a);
    life21_66 = ((((double) life18_45) + 0x1.0p-1d) - ((moom.DR)(p6)).c);
    if (!((life14_17 != null))) {
        break forest_join_119;
    }
    spill582_3 = recovery.source.CarrierOps.dcmpl(((double)(((life19_58 * p7) + (life21_66 * p8)))), ((double)(0x0.0p0d)));
    if (!((life14_17 != null))) {
        forestValue582_37_0 = spill582_3;
        continue forest_cycle_37;
    }
    if (!((spill582_3 >= 0))) {
        break forest_join_118;
    }
    life23_94 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(((moom.AW)(this)).b)).a__fE(((moom.DT)(new moom.DT(life17_36, (p1 - 1), life18_45)))))).a__ch();
    life24_97 = ((net.minecraft.block.Block)(life23_94)).a__fn();
    spill582_4 = life24_97;
    spill582_5 = moom.fn.a;
    if (!((life14_17 != null))) {
        forestValue582_104_0 = spill582_4;
        forestValue582_104_1 = spill582_5;
        break forest_join_104;
    }
    if (!((spill582_4 == spill582_5))) {
        break forest_join_102;
    }
    break forest_join_125;
    }
    forestValue582_104_0 = life24_97;
    forestValue582_104_1 = moom.fn.h;
    }
    if (!((life14_17 != null))) {
        forestValue582_116_0 = forestValue582_104_0;
        forestValue582_116_1 = forestValue582_104_1;
        break forest_join_116;
    }
    if (!((forestValue582_104_0 == forestValue582_104_1))) {
        break forest_join_114;
    }
    spill582_6 = ((net.minecraft.entity.EntityLiving)(((moom.AW)(this)).a)).j__Boolean();
    if (!((life14_17 != null))) {
        forestValue582_128_0 = ((spill582_6) ? 1 : 0);
        break forest_join_128;
    }
    if (!((!spill582_6))) {
        break forest_join_114;
    }
    break forest_join_127;
    }
    forestValue582_116_0 = life24_97;
    forestValue582_116_1 = moom.fn.i;
    }
    if (!((forestValue582_116_0 == forestValue582_116_1))) {
        break forest_join_118;
    }
    break forest_join_129;
    }
    life18_45 += 1;
    }
    if (!((life14_17 == null))) {
        continue forest_cycle_45;
    }
    break forest_cycle_45;
    }
    break forest_cycle_37;
    }
    }
    life17_36 += 1;
    if (!((life14_17 == null))) {
        continue forest_cycle_36;
    }
    break forest_cycle_36;
    }
    break forest_join_131;
    }
    return ((0) != 0);
    }
    forestValue582_128_0 = 0;
    }
    return ((forestValue582_128_0) != 0);
    }
    return ((0) != 0);
    }
    forestValue582_132_0 = 1;
    }
    return ((forestValue582_132_0) != 0);
}


private int a__sourceReturn_8abf5c6871() {
net.minecraft.block.Block lexicalValue474_67_0;
    int lexicalValue474_82_0;
    int lexicalValue474_90_0;
    boolean spill474_0;
    boolean spill474_1;
    net.minecraft.block.Block spill474_2;
    int spill474_3;
    long life1_3;
    int[] life3_5;
    int life4_31;
    net.minecraft.block.Block life5_48;
    int life6_50;
    lexical_join_90: {
    lexical_join_83: {
    lexical_join_82: {
    lexical_join_81: {
    life1_3 = (moom.AW.q ^ 114117351722155L);
    life3_5 = moom.AV.b__ArrayInt();
    spill474_0 = ((net.minecraft.entity.EntityLiving)(((moom.AW)(this)).a)).j__Boolean();
    if (!((life3_5 != null))) {
        lexicalValue474_90_0 = ((spill474_0) ? 1 : 0);
        break lexical_join_90;
    }
    if (!(spill474_0)) {
        break lexical_join_83;
    }
    spill474_1 = ((moom.AW)(this)).f();
    if (!((life3_5 != null))) {
        lexicalValue474_90_0 = ((spill474_1) ? 1 : 0);
        break lexical_join_90;
    }
    if (!(spill474_1)) {
        break lexical_join_83;
    }
    life4_31 = ((int) ((moom.CA)(((net.minecraft.entity.EntityLiving)(((moom.AW)(this)).a)).b())).c);
    life5_48 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(((moom.AW)(this)).b)).a__fE(((moom.DT)(new moom.DT(moom.Dr.b__Int(((double)(((net.minecraft.entity.EntityLiving)(((moom.AW)(this)).a)).n))), life4_31, moom.Dr.b__Int(((double)(((net.minecraft.entity.EntityLiving)(((moom.AW)(this)).a)).p))))))))).a__ch();
    life6_50 = 0;
    lexical_cycle_42: while (true) {
    lexical_join_67: {
    lexical_join_50: {
    if (!((life5_48 != net.minecraft.init.Blocks.i))) {
        break lexical_join_50;
    }
    spill474_2 = life5_48;
    if (!((life3_5 != null))) {
        lexicalValue474_67_0 = spill474_2;
        break lexical_join_67;
    }
    if (!((spill474_2 == net.minecraft.init.Blocks.j))) {
        break lexical_join_81;
    }
    }
    life4_31 += 1;
    lexicalValue474_67_0 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(((moom.AW)(this)).b)).a__fE(((moom.DT)(new moom.DT(moom.Dr.b__Int(((double)(((net.minecraft.entity.EntityLiving)(((moom.AW)(this)).a)).n))), life4_31, moom.Dr.b__Int(((double)(((net.minecraft.entity.EntityLiving)(((moom.AW)(this)).a)).p))))))))).a__ch();
    }
    life5_48 = lexicalValue474_67_0;
    life6_50 += 1;
    if (!((life6_50 > ((int) moom.AW.s)))) { continue lexical_cycle_42; }
    break lexical_cycle_42;
    }
    spill474_3 = ((int) ((moom.CA)(((net.minecraft.entity.EntityLiving)(((moom.AW)(this)).a)).b())).c);
    if (!((life3_5 != null))) {
        lexicalValue474_82_0 = spill474_3;
        break lexical_join_82;
    }
    return spill474_3;
    }
    lexicalValue474_82_0 = life4_31;
    }
    return lexicalValue474_82_0;
    }
    lexicalValue474_90_0 = ((int) (((moom.CA)(((net.minecraft.entity.EntityLiving)(((moom.AW)(this)).a)).b())).c + 0x1.0p-1d));
    }
    return lexicalValue474_90_0;
}


protected moom.DR a__DR() {
return new moom.DR(((net.minecraft.entity.EntityLiving)(((moom.AW)(this)).a)).n, ((double) ((moom.AW)(this)).a__sourceReturn_8abf5c6871()), ((net.minecraft.entity.EntityLiving)(((moom.AW)(this)).a)).p);
}


private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
