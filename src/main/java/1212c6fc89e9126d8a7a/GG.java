package moom;


public class GG extends moom.GD {

private static final long f;

private static final long g;

public GG(long p0, moom.GD p1) {
super(p0);
    this.b = p1;
}


static {
f = ((long)(((moom._a)(moom._c.a(((long)(-8488484630633139540L)), ((long)(3127498680550152432L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(135690408101813L)))));
    long local0_life6 = (moom.GG.f ^ 5971064683801L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill550_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill550_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill550_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill550_13 = new byte[8];
    (__sourceSpill550_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill550_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation550_15 = __sourceSpill550_13;
    ((javax.crypto.Cipher)(__sourceSpill550_10)).init(((int)(__sourceSpill550_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill550_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation550_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = 6555263418694726245L;
    byte[] __sourceSpill550_19 = new byte[8];
    (__sourceSpill550_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill550_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill550_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill550_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill550_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill550_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill550_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill550_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill550_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill550_20)).doFinal(((byte[])(__sourceSpill550_19)));
    g = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


public int[] a__ArrayInt(int p0, int p1, int p2, int p3) {
int forestValue641_38_0;
    int forestValue641_87_0;
    int forestValue641_97_0;
    int forestValue641_106_0;
    net.minecraft.entity.Entity[] spill641_0;
    int spill641_1;
    int spill641_2;
    long life5_3;
    int life8_8;
    int life9_12;
    net.minecraft.entity.Entity[] life7_13;
    int life10_17;
    int life11_21;
    int[] life12_29;
    int[] life13_34;
    int life14_36;
    int life15_41;
    int life16_56;
    int life17_90;
    forest_join_121: {
    life5_3 = (moom.GG.f ^ 94140909489454L);
    spill641_0 = moom.GD.b();
    life8_8 = (p0 - 1);
    life9_12 = (p1 - 1);
    life7_13 = spill641_0;
    life10_17 = (p2 + 2);
    life11_21 = (p3 + 2);
    life12_29 = ((moom.GD)(((moom.GG)(this)).b)).a__ArrayInt(((int)(life8_8)), ((int)(life9_12)), ((int)(life10_17)), ((int)(life11_21)));
    life13_34 = moom.GY.a(((int)((p2 * p3))));
    life14_36 = 0;
    forest_cycle_37: while (true) {
    forest_join_118: {
    forestValue641_38_0 = life14_36;
    forest_cycle_38: while (true) {
    if (!((forestValue641_38_0 < p3))) {
        break forest_join_121;
    }
    life15_41 = 0;
    forest_cycle_42: while (true) {
    forest_join_115: {
    forest_join_107: {
    forest_join_106: {
    forest_join_105: {
    forest_join_97: {
    forest_join_96: {
    forest_join_87: {
    forest_join_83: {
    if (!((life15_41 < p2))) {
        break forest_join_118;
    }
    life16_56 = (life12_29)[((life15_41 + 1) + ((life14_36 + 1) * life10_17))];
    ((moom.GG)(this)).a(((long)(((long) (life15_41 + p0)))), ((long)(((long) (life14_36 + p1)))));
    spill641_1 = life16_56;
    if (!((life7_13 != null))) {
        forestValue641_38_0 = spill641_1;
        continue forest_cycle_38;
    }
    if (!((life7_13 != null))) {
        forestValue641_87_0 = spill641_1;
        break forest_join_87;
    }
    if (!((spill641_1 == 0))) {
        break forest_join_83;
    }
    (life13_34)[(life15_41 + (life14_36 * p2))] = 0;
    if (!((life7_13 == null))) {
        break forest_join_115;
    }
    }
    forestValue641_87_0 = ((moom.GG)(this)).a(((int)(((int) moom.GG.g))));
    }
    life17_90 = forestValue641_87_0;
    spill641_2 = life17_90;
    if (!((life7_13 != null))) {
        forestValue641_97_0 = spill641_2;
        break forest_join_97;
    }
    if (!((spill641_2 == 0))) {
        break forest_join_96;
    }
    life17_90 = 4;
    if (!((life7_13 == null))) {
        break forest_join_107;
    }
    }
    forestValue641_97_0 = life17_90;
    }
    if (!((life7_13 != null))) {
        forestValue641_106_0 = forestValue641_97_0;
        break forest_join_106;
    }
    if (!((forestValue641_97_0 <= 1))) {
        break forest_join_105;
    }
    life17_90 = 3;
    if (!((life7_13 == null))) {
        break forest_join_107;
    }
    }
    forestValue641_106_0 = 1;
    }
    life17_90 = forestValue641_106_0;
    }
    (life13_34)[(life15_41 + (life14_36 * p2))] = life17_90;
    }
    life15_41 += 1;
    if (!((life7_13 == null))) {
        continue forest_cycle_42;
    }
    break forest_cycle_42;
    }
    break forest_cycle_38;
    }
    }
    life14_36 += 1;
    if (!((life7_13 == null))) {
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
