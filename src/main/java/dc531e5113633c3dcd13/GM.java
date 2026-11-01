package moom;


public class GM extends moom.GD {

private static final long f;

private static final long g;

public GM(long p0) {
super(p0);
}


static {
f = ((long)(((moom._a)(moom._c.a(((long)(-9007534723895276000L)), ((long)(-2815254832332892011L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(276730967811772L)))));
    long local0_life6 = (moom.GM.f ^ 40182051551648L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill551_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill551_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill551_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill551_13 = new byte[8];
    (__sourceSpill551_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill551_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation551_15 = __sourceSpill551_13;
    ((javax.crypto.Cipher)(__sourceSpill551_10)).init(((int)(__sourceSpill551_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill551_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation551_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -2770303054642889003L;
    byte[] __sourceSpill551_19 = new byte[8];
    (__sourceSpill551_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill551_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill551_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill551_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill551_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill551_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill551_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill551_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill551_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill551_20)).doFinal(((byte[])(__sourceSpill551_19)));
    g = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


public int[] a__ArrayInt(int p0, int p1, int p2, int p3) {
int[] lexicalValue688_49_0;
    int lexicalValue688_49_1;
    int lexicalValue688_49_2;
    int[] lexicalValue688_50_0;
    int lexicalValue688_50_1;
    int[] lexicalValue688_51_0;
    int lexicalValue688_51_1;
    int lexicalValue688_51_2;
    int lexicalValue688_59_0;
    int lexicalValue688_65_0;
    int lexicalValue688_69_0;
    int lexicalValue688_75_0;
    int[] lexicalValue688_85_0;
    int lexicalValue688_85_1;
    int lexicalValue688_85_2;
    net.minecraft.entity.Entity[] spill688_0;
    int spill688_1;
    int[] spill688_2;
    int spill688_3;
    int spill688_4;
    long life5_3;
    int[] life8_9;
    net.minecraft.entity.Entity[] life7_10;
    int life9_12;
    int life10_19;
    lexical_join_86: {
    lexical_join_85: {
    lexical_join_75: {
    lexical_join_69: {
    lexical_join_65: {
    lexical_join_59: {
    lexical_join_58: {
    life5_3 = (moom.GM.f ^ 2088596401716L);
    spill688_0 = moom.GD.b();
    life8_9 = moom.GY.a(((int)((p2 * p3))));
    life7_10 = spill688_0;
    life9_12 = 0;
    lexical_cycle_13: while (true) {
    lexical_join_55: {
    if (!((life9_12 < p3))) {
        break lexical_join_58;
    }
    spill688_1 = 0;
    if (!((life7_10 != null))) {
        lexicalValue688_59_0 = spill688_1;
        break lexical_join_59;
    }
    life10_19 = spill688_1;
    lexical_cycle_20: while (true) {
    lexical_join_51: {
    lexical_join_50: {
    lexical_join_49: {
    if (!((life10_19 < p2))) {
        break lexical_join_55;
    }
    ((moom.GM)(this)).a(((long)(((long) (p0 + life10_19)))), ((long)(((long) (p1 + life9_12)))));
    spill688_2 = life8_9;
    spill688_3 = (life10_19 + (life9_12 * p2));
    spill688_4 = ((moom.GM)(this)).a(((int)(((int) moom.GM.g))));
    if (!((life7_10 != null))) {
        lexicalValue688_85_0 = spill688_2;
        lexicalValue688_85_1 = spill688_3;
        lexicalValue688_85_2 = spill688_4;
        break lexical_join_85;
    }
    if (!((life7_10 != null))) {
        lexicalValue688_49_0 = spill688_2;
        lexicalValue688_49_1 = spill688_3;
        lexicalValue688_49_2 = spill688_4;
        break lexical_join_49;
    }
    if (!((spill688_4 == 0))) {
        lexicalValue688_50_0 = spill688_2;
        lexicalValue688_50_1 = spill688_3;
        break lexical_join_50;
    }
    lexicalValue688_49_0 = spill688_2;
    lexicalValue688_49_1 = spill688_3;
    lexicalValue688_49_2 = 1;
    }
    lexicalValue688_51_0 = lexicalValue688_49_0;
    lexicalValue688_51_1 = lexicalValue688_49_1;
    lexicalValue688_51_2 = lexicalValue688_49_2;
    break lexical_join_51;
    }
    lexicalValue688_51_0 = lexicalValue688_50_0;
    lexicalValue688_51_1 = lexicalValue688_50_1;
    lexicalValue688_51_2 = 0;
    }
    (lexicalValue688_51_0)[lexicalValue688_51_1] = lexicalValue688_51_2;
    life10_19 += 1;
    if (!((life7_10 == null))) { continue lexical_cycle_20; }
    break lexical_cycle_20;
    }
    }
    life9_12 += 1;
    if (!((life7_10 == null))) { continue lexical_cycle_13; }
    break lexical_cycle_13;
    }
    }
    lexicalValue688_59_0 = p0;
    }
    if (!((life7_10 != null))) {
        lexicalValue688_65_0 = lexicalValue688_59_0;
        break lexical_join_65;
    }
    if (!((lexicalValue688_59_0 > (-p2)))) {
        break lexical_join_86;
    }
    lexicalValue688_65_0 = p0;
    }
    if (!((life7_10 != null))) {
        lexicalValue688_69_0 = lexicalValue688_65_0;
        break lexical_join_69;
    }
    if (!((lexicalValue688_65_0 <= 0))) {
        break lexical_join_86;
    }
    lexicalValue688_69_0 = p1;
    }
    if (!((life7_10 != null))) {
        lexicalValue688_75_0 = lexicalValue688_69_0;
        break lexical_join_75;
    }
    if (!((lexicalValue688_69_0 > (-p3)))) {
        break lexical_join_86;
    }
    lexicalValue688_75_0 = p1;
    }
    if (!((lexicalValue688_75_0 <= 0))) {
        break lexical_join_86;
    }
    lexicalValue688_85_0 = life8_9;
    lexicalValue688_85_1 = ((-p0) + ((-p1) * p2));
    lexicalValue688_85_2 = 1;
    }
    (lexicalValue688_85_0)[lexicalValue688_85_1] = lexicalValue688_85_2;
    }
    return life8_9;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}

}
