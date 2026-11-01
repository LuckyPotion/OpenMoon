package moom;


public class AU {

private moom.AS a;

private moom.AZ[] b;

private net.minecraft.world.pathfinder.NodeProcessor c;

private static long d;

private static long e;

public AU(net.minecraft.world.pathfinder.NodeProcessor p0) { super(); }


private static void __sourceConstructorBody_75ed5ecd018934cd(moom.AU receiver, net.minecraft.world.pathfinder.NodeProcessor p0) throws Throwable {

long local2 = (moom.AU.d ^ 115880761860389L);

    moom.AU.__sourceConstructorInit_75ed5ecd018934cd_0(((moom.AU)(receiver)));

    ((moom.AU)(receiver)).a = ((moom.AS)(new moom.AS()));

    ((moom.AU)(receiver)).b = ((moom.AZ[])(new moom.AZ[((int) moom.AU.e)]));

    ((moom.AU)(receiver)).c = ((net.minecraft.world.pathfinder.NodeProcessor)(p0));

    return;

}



static {
d = ((long)(((moom._a)(moom._c.a(((long)(-8084161356927181995L)), ((long)(-3854589036357579452L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(99021878446557L)))));
    long local0_life6 = (moom.AU.d ^ 133985906808806L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill470_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill470_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill470_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill470_13 = new byte[8];
    (__sourceSpill470_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill470_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation470_15 = __sourceSpill470_13;
    ((javax.crypto.Cipher)(__sourceSpill470_10)).init(((int)(__sourceSpill470_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill470_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation470_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = 6469743120802399715L;
    byte[] __sourceSpill470_19 = new byte[8];
    (__sourceSpill470_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill470_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill470_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill470_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill470_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill470_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill470_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill470_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill470_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill470_20)).doFinal(((byte[])(__sourceSpill470_19)));
    e = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}

private static native <E extends Throwable> void __sourceConstructorInit_75ed5ecd018934cd_0(moom.AU a0) throws E;

private static moom.Oo a(moom.Oo p0) {
return p0;
}


private moom.AT a(moom.AZ p0, moom.AZ p1) {
int[] spill470_0;
    long life3_3;
    int life6_6;
    int[] life5_7;
    moom.AZ life7_9;
    moom.AZ[] life7_21;
    moom.AZ life8_23;
    lexical_join_42: {
    lexical_join_19: {
    life3_3 = (moom.AU.d ^ 25245093879384L);
    spill470_0 = moom.AV.b__ArrayInt();
    life6_6 = 1;
    life5_7 = spill470_0;
    life7_9 = p1;
    lexical_cycle_10: while (true) {
    if (!((((moom.AZ)(life7_9)).i != null))) {
        break lexical_join_19;
    }
    life6_6 += 1;
    life7_9 = ((moom.AZ)(life7_9)).i;
    if (!((life5_7 == null))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    life7_21 = new moom.AZ[life6_6];
    life8_23 = p1;
    life6_6 += -1;
    (life7_21)[life6_6] = p1;
    lexical_cycle_29: while (true) {
    if (!((((moom.AZ)(life8_23)).i != null))) {
        break lexical_join_42;
    }
    life8_23 = ((moom.AZ)(life8_23)).i;
    life6_6 += -1;
    (life7_21)[life6_6] = life8_23;
    if (!((life5_7 == null))) { continue lexical_cycle_29; }
    break lexical_cycle_29;
    }
    }
    return new moom.AT(life7_21);
}


private moom.AT a(net.minecraft.entity.Entity p0, moom.AZ p1, moom.AZ p2, float p3) {
int forestValue580_31_0;
    int forestValue580_52_0;
    int forestValue580_69_0;
    int forestValue580_124_0;
    moom.AZ forestValue580_147_0;
    moom.AZ forestValue580_161_0;
    moom.AZ forestValue580_161_1;
    int[] spill580_0;
    moom.AZ spill580_1;
    moom.AZ spill580_2;
    boolean spill580_3;
    int spill580_4;
    boolean spill580_5;
    int spill580_6;
    moom.AZ spill580_7;
    long life5_3;
    int[] life7_20;
    moom.AZ life8_27;
    moom.AZ life9_35;
    int life10_71;
    int life11_73;
    moom.AZ life12_81;
    float life13_88;
    forest_join_164: {
    forest_join_161: {
    forest_join_159: {
    forest_join_154: {
    life5_3 = (moom.AU.d ^ 55835491138741L);
    ((moom.AZ)(p1)).f = ((float)(0x0.0p0f));
    ((moom.AZ)(p1)).g = ((float)(((moom.AZ)(p1)).b(((moom.AZ)(p2)))));
    spill580_0 = moom.AV.b__ArrayInt();
    ((moom.AZ)(p1)).h = ((float)(((moom.AZ)(p1)).g));
    ((moom.AS)(this.a)).a__Void();
    life7_20 = spill580_0;
    ((moom.AS)(this.a)).a(((moom.AZ)(p1)));
    life8_27 = p1;
    forest_cycle_28: while (true) {
    forest_join_151: {
    forestValue580_31_0 = ((((moom.AS)(this.a)).a__Boolean()) ? 1 : 0);
    forest_cycle_31: while (true) {
    forest_join_69: {
    forest_join_57: {
    forest_join_52: {
    forest_join_45: {
    if (!((forestValue580_31_0 == 0))) {
        break forest_join_159;
    }
    life9_35 = ((moom.AS)(this.a)).a();
    spill580_1 = life9_35;
    spill580_2 = p2;
    if (!((life7_20 != null))) {
        forestValue580_161_0 = spill580_1;
        forestValue580_161_1 = spill580_2;
        break forest_join_161;
    }
    spill580_3 = ((moom.AZ)(spill580_1)).equals(((java.lang.Object)(spill580_2)));
    if (!((life7_20 != null))) {
        forestValue580_52_0 = ((spill580_3) ? 1 : 0);
        break forest_join_52;
    }
    if (!(spill580_3)) {
        break forest_join_45;
    }
    break forest_join_154;
    }
    forestValue580_52_0 = recovery.source.CarrierOps.fcmpg(((float)(((moom.AZ)(life9_35)).b(((moom.AZ)(p2))))), ((float)(((moom.AZ)(life8_27)).b(((moom.AZ)(p2))))));
    }
    if (!((life7_20 != null))) {
        forestValue580_69_0 = forestValue580_52_0;
        break forest_join_69;
    }
    if (!((forestValue580_52_0 < 0))) {
        break forest_join_57;
    }
    life8_27 = life9_35;
    }
    ((moom.AZ)(life9_35)).j = ((boolean)(true));
    forestValue580_69_0 = ((net.minecraft.world.pathfinder.NodeProcessor)(this.c)).a(((moom.AZ[])(this.b)), ((net.minecraft.entity.Entity)(p0)), ((moom.AZ)(life9_35)), ((moom.AZ)(p2)), ((float)(p3)));
    }
    life10_71 = forestValue580_69_0;
    life11_73 = 0;
    forest_cycle_72: while (true) {
    forest_join_149: {
    forest_join_148: {
    forest_join_147: {
    forest_join_136: {
    forest_join_124: {
    forest_join_109: {
    if (!((life11_73 < life10_71))) {
        break forest_join_151;
    }
    life12_81 = (this.b)[life11_73];
    life13_88 = (((moom.AZ)(life9_35)).f + ((moom.AZ)(life9_35)).b(((moom.AZ)(life12_81))));
    if (!((life7_20 != null))) {
        break forest_join_149;
    }
    spill580_4 = recovery.source.CarrierOps.fcmpg(((float)(life13_88)), ((float)((p3 * 0x1.0p1f))));
    if (!((life7_20 != null))) {
        forestValue580_31_0 = spill580_4;
        continue forest_cycle_31;
    }
    if (!((spill580_4 < 0))) {
        break forest_join_148;
    }
    spill580_5 = ((moom.AZ)(life12_81)).a();
    if (!((life7_20 != null))) {
        forestValue580_124_0 = ((spill580_5) ? 1 : 0);
        break forest_join_124;
    }
    if (!(spill580_5)) {
        break forest_join_109;
    }
    spill580_6 = recovery.source.CarrierOps.fcmpg(((float)(life13_88)), ((float)(((moom.AZ)(life12_81)).f)));
    if (!((life7_20 != null))) {
        forestValue580_124_0 = spill580_6;
        break forest_join_124;
    }
    if (!((spill580_6 < 0))) {
        break forest_join_148;
    }
    }
    ((moom.AZ)(life12_81)).i = ((moom.AZ)(life9_35));
    ((moom.AZ)(life12_81)).f = ((float)(life13_88));
    ((moom.AZ)(life12_81)).g = ((float)(((moom.AZ)(life12_81)).b(((moom.AZ)(p2)))));
    spill580_7 = life12_81;
    if (!((life7_20 != null))) {
        forestValue580_147_0 = spill580_7;
        break forest_join_147;
    }
    forestValue580_124_0 = ((((moom.AZ)(spill580_7)).a()) ? 1 : 0);
    }
    if (!((forestValue580_124_0 != 0))) {
        break forest_join_136;
    }
    ((moom.AS)(this.a)).a(((moom.AZ)(life12_81)), ((float)((((moom.AZ)(life12_81)).f + ((moom.AZ)(life12_81)).g))));
    if (!((life7_20 == null))) {
        break forest_join_148;
    }
    }
    ((moom.AZ)(life12_81)).h = ((float)((((moom.AZ)(life12_81)).f + ((moom.AZ)(life12_81)).g)));
    forestValue580_147_0 = ((moom.AS)(this.a)).a(((moom.AZ)(life12_81)));
    }
    recovery.source.CarrierOps.discard(forestValue580_147_0);
    }
    life11_73 += 1;
    }
    if (!((life7_20 == null))) {
        continue forest_cycle_72;
    }
    break forest_cycle_72;
    }
    break forest_cycle_31;
    }
    }
    if (!((life7_20 == null))) {
        continue forest_cycle_28;
    }
    break forest_cycle_28;
    }
    break forest_join_159;
    }
    return ((moom.AU)(this)).a(((moom.AZ)(p1)), ((moom.AZ)(p2)));
    }
    forestValue580_161_0 = life8_27;
    forestValue580_161_1 = p1;
    }
    if (!((forestValue580_161_0 == forestValue580_161_1))) {
        break forest_join_164;
    }
    return null;
    }
    return ((moom.AU)(this)).a(((moom.AZ)(p1)), ((moom.AZ)(life8_27)));
}


private moom.AT a(net.minecraft.world.IBlockAccess p0, net.minecraft.entity.Entity p1, double p2, double p3, double p4, float p5) {
((moom.AS)(this.a)).a__Void();
    ((net.minecraft.world.pathfinder.NodeProcessor)(this.c)).a(((net.minecraft.world.IBlockAccess)(p0)), ((net.minecraft.entity.Entity)(p1)));
    java.lang.Object local10 = ((net.minecraft.world.pathfinder.NodeProcessor)(this.c)).a(((net.minecraft.entity.Entity)(p1)));
    java.lang.Object local11 = ((net.minecraft.world.pathfinder.NodeProcessor)(this.c)).a(((net.minecraft.entity.Entity)(p1)), ((double)(p2)), ((double)(p3)), ((double)(p4)));
    java.lang.Object local12 = ((moom.AU)(this)).a(((net.minecraft.entity.Entity)(p1)), ((moom.AZ)(local10)), ((moom.AZ)(local11)), ((float)(p5)));
    ((net.minecraft.world.pathfinder.NodeProcessor)(this.c)).a();
    return ((moom.AT)(local12));
}


public moom.AT a(net.minecraft.world.IBlockAccess p0, net.minecraft.entity.Entity p1, moom.DT p2, float p3) {
return ((moom.AU)(this)).a(((net.minecraft.world.IBlockAccess)(p0)), ((net.minecraft.entity.Entity)(p1)), ((double)(((double) (((float) ((moom.DT)(p2)).a()) + 0x1.0p-1f)))), ((double)(((double) (((float) ((moom.DT)(p2)).b()) + 0x1.0p-1f)))), ((double)(((double) (((float) ((moom.DT)(p2)).c()) + 0x1.0p-1f)))), ((float)(p3)));
}


public moom.AT a(net.minecraft.world.IBlockAccess p0, net.minecraft.entity.Entity p1, net.minecraft.entity.Entity p2, float p3) {
return ((moom.AU)(this)).a(((net.minecraft.world.IBlockAccess)(p0)), ((net.minecraft.entity.Entity)(p1)), ((double)(((net.minecraft.entity.Entity)(p2)).n)), ((double)(((moom.CA)(((net.minecraft.entity.Entity)(p2)).b())).c)), ((double)(((net.minecraft.entity.Entity)(p2)).p)), ((float)(p3)));
}

}
