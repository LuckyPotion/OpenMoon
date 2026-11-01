package moom;


public class GR extends moom.GD {

private final moom.GD f;

private final moom.GD g;

private static final long h;

private static final long i;

public GR(long p0, moom.GD p1, moom.GD p2) {
super(p0);
    this.f = p1;
    this.g = p2;
}


static {
h = ((long)(((moom._a)(moom._c.a(((long)(6395540361295455909L)), ((long)(605198490249613289L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(260385312701641L)))));
    long local0_life6 = (moom.GR.h ^ 128607206109402L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill554_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill554_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill554_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill554_13 = new byte[8];
    (__sourceSpill554_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill554_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation554_15 = __sourceSpill554_13;
    ((javax.crypto.Cipher)(__sourceSpill554_10)).init(((int)(__sourceSpill554_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill554_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation554_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = 8659281440495732820L;
    byte[] __sourceSpill554_19 = new byte[8];
    (__sourceSpill554_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill554_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill554_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill554_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill554_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill554_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill554_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill554_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill554_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill554_20)).doFinal(((byte[])(__sourceSpill554_19)));
    i = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public int[] a__ArrayInt(int p0, int p1, int p2, int p3) {
int lexicalValue693_82_0;
    int lexicalValue693_82_1;
    int[] lexicalValue693_104_0;
    int lexicalValue693_104_1;
    int[] lexicalValue693_111_0;
    int lexicalValue693_111_1;
    int[] lexicalValue693_119_0;
    int lexicalValue693_119_1;
    int[] lexicalValue693_127_0;
    net.minecraft.entity.Entity[] spill693_0;
    int[] spill693_1;
    int spill693_2;
    int[] spill693_3;
    int spill693_4;
    int[] spill693_5;
    int spill693_6;
    int spill693_7;
    int spill693_8;
    int[] spill693_9;
    int spill693_10;
    int[] spill693_11;
    int spill693_12;
    long life5_3;
    int[] life8_12;
    int[] life9_20;
    int[] life10_25;
    net.minecraft.entity.Entity[] life7_26;
    int life11_28;
    lexical_join_127: {
    lexical_join_126: {
    life5_3 = (moom.GR.h ^ 88381141498401L);
    spill693_0 = moom.GD.b();
    life8_12 = ((moom.GD)(this.f)).a__ArrayInt(((int)(p0)), ((int)(p1)), ((int)(p2)), ((int)(p3)));
    life9_20 = ((moom.GD)(this.g)).a__ArrayInt(((int)(p0)), ((int)(p1)), ((int)(p2)), ((int)(p3)));
    life10_25 = moom.GY.a(((int)((p2 * p3))));
    life7_26 = spill693_0;
    life11_28 = 0;
    lexical_cycle_29: while (true) {
    lexical_join_123: {
    lexical_join_119: {
    lexical_join_117: {
    lexical_join_111: {
    lexical_join_109: {
    lexical_join_104: {
    lexical_join_102: {
    lexical_join_82: {
    lexical_join_75: {
    if (!((life11_28 < (p2 * p3)))) {
        break lexical_join_126;
    }
    spill693_1 = life8_12;
    if (!((life7_26 != null))) {
        lexicalValue693_127_0 = spill693_1;
        break lexical_join_127;
    }
    spill693_2 = life11_28;
    if (!((life7_26 != null))) {
        lexicalValue693_119_0 = spill693_1;
        lexicalValue693_119_1 = spill693_2;
        break lexical_join_119;
    }
    if (!(((spill693_1)[spill693_2] != ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.r)).aB))) {
        break lexical_join_117;
    }
    spill693_3 = life8_12;
    spill693_4 = life11_28;
    if (!((life7_26 != null))) {
        lexicalValue693_119_0 = spill693_3;
        lexicalValue693_119_1 = spill693_4;
        break lexical_join_119;
    }
    if (!(((spill693_3)[spill693_4] != ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.P)).aB))) {
        break lexical_join_117;
    }
    spill693_5 = life9_20;
    spill693_6 = life11_28;
    if (!((life7_26 != null))) {
        lexicalValue693_111_0 = spill693_5;
        lexicalValue693_111_1 = spill693_6;
        break lexical_join_111;
    }
    if (!(((spill693_5)[spill693_6] == ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.y)).aB))) {
        break lexical_join_109;
    }
    spill693_7 = (life8_12)[life11_28];
    spill693_8 = ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.D)).aB;
    if (!((life7_26 != null))) {
        lexicalValue693_82_0 = spill693_7;
        lexicalValue693_82_1 = spill693_8;
        break lexical_join_82;
    }
    if (!((spill693_7 == spill693_8))) {
        break lexical_join_75;
    }
    (life10_25)[life11_28] = ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.C)).aB;
    if (!((life7_26 == null))) {
        break lexical_join_123;
    }
    }
    spill693_9 = life8_12;
    spill693_10 = life11_28;
    if (!((life7_26 != null))) {
        lexicalValue693_104_0 = spill693_9;
        lexicalValue693_104_1 = spill693_10;
        break lexical_join_104;
    }
    lexicalValue693_82_0 = (spill693_9)[spill693_10];
    lexicalValue693_82_1 = ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.F)).aB;
    }
    if (!((lexicalValue693_82_0 != lexicalValue693_82_1))) {
        break lexical_join_102;
    }
    spill693_11 = life8_12;
    spill693_12 = life11_28;
    if (!((life7_26 != null))) {
        lexicalValue693_104_0 = spill693_11;
        lexicalValue693_104_1 = spill693_12;
        break lexical_join_104;
    }
    if (!(((spill693_11)[spill693_12] != ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.G)).aB))) {
        break lexical_join_102;
    }
    (life10_25)[life11_28] = ((life9_20)[life11_28] & ((int) moom.GR.i));
    if (!((life7_26 == null))) {
        break lexical_join_123;
    }
    }
    lexicalValue693_104_0 = life10_25;
    lexicalValue693_104_1 = life11_28;
    }
    (lexicalValue693_104_0)[lexicalValue693_104_1] = ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.G)).aB;
    if (!((life7_26 == null))) {
        break lexical_join_123;
    }
    }
    lexicalValue693_111_0 = life10_25;
    lexicalValue693_111_1 = life11_28;
    }
    (lexicalValue693_111_0)[lexicalValue693_111_1] = (life8_12)[life11_28];
    if (!((life7_26 == null))) {
        break lexical_join_123;
    }
    }
    lexicalValue693_119_0 = life10_25;
    lexicalValue693_119_1 = life11_28;
    }
    (lexicalValue693_119_0)[lexicalValue693_119_1] = (life8_12)[life11_28];
    }
    life11_28 += 1;
    if (!((life7_26 == null))) { continue lexical_cycle_29; }
    break lexical_cycle_29;
    }
    }
    lexicalValue693_127_0 = life10_25;
    }
    return lexicalValue693_127_0;
}


public void a(long p0) {
((moom.GD)(this.f)).a(((long)(p0)));
    ((moom.GD)(this.g)).a(((long)(p0)));
    super.a(((long)(p0)));
    return;
}

}
