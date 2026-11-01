package moom;


public class GQ extends moom.GD {

private static final long f;

private static final long g;

public GQ(long p0, moom.GD p1) {
super(p0);
    this.b = p1;
}


static {
f = ((long)(((moom._a)(moom._c.a(((long)(4870552398939811353L)), ((long)(-2978650495192985871L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(197622457670694L)))));
    long local0_life6 = (moom.GQ.f ^ 12875356565199L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill553_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill553_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill553_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill553_13 = new byte[8];
    (__sourceSpill553_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill553_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation553_15 = __sourceSpill553_13;
    ((javax.crypto.Cipher)(__sourceSpill553_10)).init(((int)(__sourceSpill553_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill553_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation553_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -1871386270492214575L;
    byte[] __sourceSpill553_19 = new byte[8];
    (__sourceSpill553_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill553_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill553_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill553_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill553_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill553_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill553_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill553_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill553_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill553_20)).doFinal(((byte[])(__sourceSpill553_19)));
    g = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


public int[] a__ArrayInt(int p0, int p1, int p2, int p3) {
int[] lexicalValue692_63_0;
    int lexicalValue692_63_1;
    int lexicalValue692_63_2;
    int[] lexicalValue692_64_0;
    int lexicalValue692_64_1;
    int[] lexicalValue692_65_0;
    int lexicalValue692_65_1;
    int lexicalValue692_65_2;
    int[] lexicalValue692_73_0;
    net.minecraft.entity.Entity[] spill692_0;
    int[] spill692_1;
    int spill692_2;
    int spill692_3;
    long life5_3;
    int[] life8_11;
    int[] life9_17;
    int life10_19;
    net.minecraft.entity.Entity[] life7_20;
    int life11_25;
    lexical_join_73: {
    lexical_join_72: {
    life5_3 = (moom.GQ.f ^ 1368378024272L);
    life8_11 = ((moom.GD)(((moom.GQ)(this)).b)).a__ArrayInt(((int)(p0)), ((int)(p1)), ((int)(p2)), ((int)(p3)));
    spill692_0 = moom.GD.b();
    life9_17 = moom.GY.a(((int)((p2 * p3))));
    life10_19 = 0;
    life7_20 = spill692_0;
    lexical_cycle_21: while (true) {
    lexical_join_69: {
    if (!((life10_19 < p3))) {
        break lexical_join_72;
    }
    life11_25 = 0;
    lexical_cycle_26: while (true) {
    lexical_join_65: {
    lexical_join_64: {
    lexical_join_63: {
    if (!((life11_25 < p2))) {
        break lexical_join_69;
    }
    ((moom.GQ)(this)).a(((long)(((long) (life11_25 + p0)))), ((long)(((long) (life10_19 + p1)))));
    spill692_1 = life9_17;
    if (!((life7_20 != null))) {
        lexicalValue692_73_0 = spill692_1;
        break lexical_join_73;
    }
    spill692_2 = (life11_25 + (life10_19 * p2));
    spill692_3 = (life8_11)[(life11_25 + (life10_19 * p2))];
    if (!((life7_20 != null))) {
        lexicalValue692_63_0 = spill692_1;
        lexicalValue692_63_1 = spill692_2;
        lexicalValue692_63_2 = spill692_3;
        break lexical_join_63;
    }
    if (!((spill692_3 > 0))) {
        lexicalValue692_64_0 = spill692_1;
        lexicalValue692_64_1 = spill692_2;
        break lexical_join_64;
    }
    lexicalValue692_63_0 = spill692_1;
    lexicalValue692_63_1 = spill692_2;
    lexicalValue692_63_2 = (((moom.GQ)(this)).a(((int)(((int) moom.GQ.g)))) + 2);
    }
    lexicalValue692_65_0 = lexicalValue692_63_0;
    lexicalValue692_65_1 = lexicalValue692_63_1;
    lexicalValue692_65_2 = lexicalValue692_63_2;
    break lexical_join_65;
    }
    lexicalValue692_65_0 = lexicalValue692_64_0;
    lexicalValue692_65_1 = lexicalValue692_64_1;
    lexicalValue692_65_2 = 0;
    }
    (lexicalValue692_65_0)[lexicalValue692_65_1] = lexicalValue692_65_2;
    life11_25 += 1;
    if (!((life7_20 == null))) { continue lexical_cycle_26; }
    break lexical_cycle_26;
    }
    }
    life10_19 += 1;
    if (!((life7_20 == null))) { continue lexical_cycle_21; }
    break lexical_cycle_21;
    }
    }
    lexicalValue692_73_0 = life9_17;
    }
    return lexicalValue692_73_0;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}

}
