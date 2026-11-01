package moom;


public class GF extends moom.GD {

private static final long f;

private static final long g;

public GF(long p0, moom.GD p1) {
super(p0);
    this.b = p1;
}


static {
f = ((long)(((moom._a)(moom._c.a(((long)(-8142561429054888250L)), ((long)(-961014208698967660L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(174335190694639L)))));
    long local0_life6 = (moom.GF.f ^ 69509855816814L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill549_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill549_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill549_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill549_13 = new byte[8];
    (__sourceSpill549_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill549_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation549_15 = __sourceSpill549_13;
    ((javax.crypto.Cipher)(__sourceSpill549_10)).init(((int)(__sourceSpill549_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill549_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation549_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -9124183924684108395L;
    byte[] __sourceSpill549_19 = new byte[8];
    (__sourceSpill549_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill549_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill549_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill549_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill549_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill549_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill549_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill549_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill549_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill549_20)).doFinal(((byte[])(__sourceSpill549_19)));
    g = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


public int[] a__ArrayInt(int p0, int p1, int p2, int p3) {
int forestValue640_38_0;
    int forestValue640_114_0;
    int forestValue640_118_0;
    int forestValue640_122_0;
    int forestValue640_126_0;
    int forestValue640_133_0;
    net.minecraft.entity.Entity[] spill640_0;
    int spill640_1;
    long life5_3;
    int life8_8;
    net.minecraft.entity.Entity[] life7_9;
    int life9_13;
    int life10_17;
    int life11_21;
    int[] life12_29;
    int[] life13_34;
    int life14_36;
    int life15_41;
    int life16_52;
    int life17_62;
    int life18_72;
    int life19_84;
    int life20_96;
    forest_join_159: {
    life5_3 = (moom.GF.f ^ 13338492323695L);
    spill640_0 = moom.GD.b();
    life8_8 = (p0 - 1);
    life7_9 = spill640_0;
    life9_13 = (p1 - 1);
    life10_17 = (p2 + 2);
    life11_21 = (p3 + 2);
    life12_29 = ((moom.GD)(((moom.GF)(this)).b)).a__ArrayInt(((int)(life8_8)), ((int)(life9_13)), ((int)(life10_17)), ((int)(life11_21)));
    life13_34 = moom.GY.a(((int)((p2 * p3))));
    life14_36 = 0;
    forest_cycle_37: while (true) {
    forest_join_156: {
    forestValue640_38_0 = life14_36;
    forest_cycle_38: while (true) {
    if (!((forestValue640_38_0 < p3))) {
        break forest_join_159;
    }
    life15_41 = 0;
    forest_cycle_42: while (true) {
    forest_join_153: {
    forest_join_145: {
    forest_join_133: {
    forest_join_126: {
    forest_join_122: {
    forest_join_118: {
    forest_join_114: {
    if (!((life15_41 < p2))) {
        break forest_join_156;
    }
    life16_52 = (life12_29)[(life15_41 + (life14_36 * life10_17))];
    life17_62 = (life12_29)[((life15_41 + 2) + (life14_36 * life10_17))];
    life18_72 = (life12_29)[(life15_41 + ((life14_36 + 2) * life10_17))];
    life19_84 = (life12_29)[((life15_41 + 2) + ((life14_36 + 2) * life10_17))];
    life20_96 = (life12_29)[((life15_41 + 1) + ((life14_36 + 1) * life10_17))];
    ((moom.GF)(this)).a(((long)(((long) (life15_41 + p0)))), ((long)(((long) (life14_36 + p1)))));
    spill640_1 = life20_96;
    if (!((life7_9 != null))) {
        forestValue640_38_0 = spill640_1;
        continue forest_cycle_38;
    }
    if (!((life7_9 != null))) {
        forestValue640_114_0 = spill640_1;
        break forest_join_114;
    }
    if (!((spill640_1 == 0))) {
        break forest_join_145;
    }
    forestValue640_114_0 = life16_52;
    }
    if (!((life7_9 != null))) {
        forestValue640_118_0 = forestValue640_114_0;
        break forest_join_118;
    }
    if (!((forestValue640_114_0 == 0))) {
        break forest_join_145;
    }
    forestValue640_118_0 = life17_62;
    }
    if (!((life7_9 != null))) {
        forestValue640_122_0 = forestValue640_118_0;
        break forest_join_122;
    }
    if (!((forestValue640_118_0 == 0))) {
        break forest_join_145;
    }
    forestValue640_122_0 = life18_72;
    }
    if (!((life7_9 != null))) {
        forestValue640_126_0 = forestValue640_122_0;
        break forest_join_126;
    }
    if (!((forestValue640_122_0 == 0))) {
        break forest_join_145;
    }
    forestValue640_126_0 = life19_84;
    }
    if (!((life7_9 != null))) {
        forestValue640_133_0 = forestValue640_126_0;
        break forest_join_133;
    }
    if (!((forestValue640_126_0 == 0))) {
        break forest_join_145;
    }
    forestValue640_133_0 = ((moom.GF)(this)).a(((int)(((int) moom.GF.g))));
    }
    if (!((forestValue640_133_0 == 0))) {
        break forest_join_145;
    }
    (life13_34)[(life15_41 + (life14_36 * p2))] = ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.F)).aB;
    if (!((life7_9 == null))) {
        break forest_join_153;
    }
    }
    (life13_34)[(life15_41 + (life14_36 * p2))] = life20_96;
    }
    life15_41 += 1;
    if (!((life7_9 == null))) {
        continue forest_cycle_42;
    }
    break forest_cycle_42;
    }
    break forest_cycle_38;
    }
    }
    life14_36 += 1;
    if (!((life7_9 == null))) {
        continue forest_cycle_37;
    }
    break forest_cycle_37;
    }
    }
    return life13_34;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}

}
