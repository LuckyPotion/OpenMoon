package moom;


public class EC extends moom.EA {

private static final long l;

private static final long p;

public EC() {
super();
}


static {
l = ((long)(((moom._a)(moom._c.a(((long)(-391203533188562675L)), ((long)(-5946711573315542600L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(176671489912718L)))));
    long local0_life6 = (moom.EC.l ^ 124344056023113L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill520_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill520_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill520_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill520_13 = new byte[8];
    (__sourceSpill520_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill520_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation520_15 = __sourceSpill520_13;
    ((javax.crypto.Cipher)(__sourceSpill520_10)).init(((int)(__sourceSpill520_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill520_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation520_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -4658910121026174698L;
    byte[] __sourceSpill520_19 = new byte[8];
    (__sourceSpill520_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill520_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill520_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill520_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill520_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill520_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill520_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill520_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill520_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill520_20)).doFinal(((byte[])(__sourceSpill520_19)));
    p = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


public boolean b(int p0, int p1) {
return ((1) != 0);
}


public void b__Void() {
((moom.EC)(this)).e = ((net.minecraft.world.biome.WorldChunkManager)(new moom.Fg(net.minecraft.world.biome.BiomeGenBase.z, 0x0.0p0f)));
    ((moom.EC)(this)).f = ((boolean)(true));
    ((moom.EC)(this)).g = ((boolean)(true));
    ((moom.EC)(this)).i = ((int)(-1));
    return;
}


public java.lang.String b__String() {
return "_nether";
}


public boolean b__Boolean() {
return ((0) != 0);
}


public net.minecraft.world.border.WorldBorder a__Fi() {
return new net.minecraft.world.WorldProviderHell$1(this);
}


public float a(long p0, float p1) {
return 0x1.0p-1f;
}


public java.lang.String a__String() {
return "Nether";
}


protected void a__Void() {
java.lang.String spill575_0;
    long life1_3;
    float life4_6;
    java.lang.String life3_7;
    int life5_9;
    float life6_20;
    lexical_join_43: {
    life1_3 = (moom.EC.l ^ 2601286794749L);
    spill575_0 = net.minecraft.world.World.c__String();
    life4_6 = 0x1.99999ap-4f;
    life3_7 = spill575_0;
    life5_9 = 0;
    lexical_cycle_10: while (true) {
    if (!((life5_9 <= ((int) moom.EC.p)))) {
        break lexical_join_43;
    }
    life6_20 = (0x1.0p0f - (((float) life5_9) / 0x1.ep3f));
    (((moom.EC)(this)).h)[life5_9] = ((((0x1.0p0f - life6_20) / ((life6_20 * 0x1.8p1f) + 0x1.0p0f)) * (0x1.0p0f - life4_6)) + life4_6);
    life5_9 += 1;
    if (!((life3_7 != null))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    return;
}


public moom.Fn a__Fn() {
return new moom.FB(((moom.EC)(this)).b, ((net.minecraft.world.storage.WorldInfo)(((net.minecraft.world.World)(((moom.EC)(this)).b)).a__IX())).c__Boolean(), ((net.minecraft.world.World)(((moom.EC)(this)).b)).a__Long());
}


public boolean a__Boolean() {
return ((0) != 0);
}


public boolean a(int p0, int p1) {
return ((0) != 0);
}


public moom.DR a(float p0, float p1) {
return new moom.DR(0x1.99999ap-3d, 0x1.eb851ep-6d, 0x1.eb851ep-6d);
}

}
