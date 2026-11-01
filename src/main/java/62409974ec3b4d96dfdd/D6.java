package moom;


public class D6 extends moom.D1 {

private final net.minecraft.item.ItemStack c;

private float d;

private boolean e;

private static final long f;

private static final long g;

public D6(net.minecraft.item.ItemStack p0, int p1) {
super(p1);
    this.c = p0;
}


static {
f = ((long)(((moom._a)(moom._c.a(((long)(7700244891501722532L)), ((long)(-45829076054142703L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(220555569736810L)))));
    long local0_life6 = (moom.D6.f ^ 44791946387528L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill509_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill509_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill509_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill509_13 = new byte[8];
    (__sourceSpill509_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill509_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation509_15 = __sourceSpill509_13;
    ((javax.crypto.Cipher)(__sourceSpill509_10)).init(((int)(__sourceSpill509_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill509_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation509_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -5017270657413612203L;
    byte[] __sourceSpill509_19 = new byte[8];
    (__sourceSpill509_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill509_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill509_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill509_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill509_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill509_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill509_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill509_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill509_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill509_20)).doFinal(((byte[])(__sourceSpill509_19)));
    g = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public moom.D6 a() {
this.e = ((boolean)(true));
    return this;
}


public moom.D6 a(float p0) {
this.d = ((float)(p0));
    return this;
}


public net.minecraft.item.ItemStack a(java.util.Random p0) {
int forwardValue1686_48_0;
    int forwardValue1686_48_1;
    int forwardValue1686_50_0;
    int forwardValue1686_56_0;
    boolean spill1686_0;
    int spill1686_1;
    int spill1686_2;
    int spill1686_3;
    int spill1686_4;
    long life2_3;
    net.minecraft.item.ItemStack life5_8;
    int life4_9;
    int life6_28;
    int life7_39;
    forward_join_63: {
    forward_join_56: {
    forward_join_54: {
    forward_join_51: {
    forward_join_50: {
    forward_join_48: {
    forward_join_44: {
    life2_3 = (moom.D6.f ^ 3546268320910L);
    spill1686_0 = moom.DS.b__Boolean();
    life5_8 = ((net.minecraft.item.ItemStack)(this.c)).a__xW();
    life4_9 = ((spill1686_0) ? 1 : 0);
    spill1686_1 = recovery.source.CarrierOps.fcmpl(((float)(this.d)), ((float)(0x0.0p0f)));
    if (!((life4_9 == 0))) {
        forwardValue1686_56_0 = spill1686_1;
        break forward_join_56;
    }
    if (!((spill1686_1 > 0))) {
        break forward_join_54;
    }
    life6_28 = ((int) (this.d * ((float) ((net.minecraft.item.ItemStack)(this.c)).d())));
    life7_39 = (((net.minecraft.item.ItemStack)(life5_8)).d() - ((java.util.Random)(p0)).nextInt(((int)((((java.util.Random)(p0)).nextInt(((int)(life6_28))) + 1)))));
    spill1686_2 = life7_39;
    spill1686_3 = life6_28;
    if (!((life4_9 == 0))) {
        forwardValue1686_48_0 = spill1686_2;
        forwardValue1686_48_1 = spill1686_3;
        break forward_join_48;
    }
    if (!((spill1686_2 > spill1686_3))) {
        break forward_join_44;
    }
    life7_39 = life6_28;
    }
    spill1686_4 = life7_39;
    if (!((life4_9 == 0))) {
        forwardValue1686_50_0 = spill1686_4;
        break forward_join_50;
    }
    forwardValue1686_48_0 = spill1686_4;
    forwardValue1686_48_1 = 1;
    }
    if (!((forwardValue1686_48_0 < forwardValue1686_48_1))) {
        break forward_join_51;
    }
    forwardValue1686_50_0 = 1;
    }
    life7_39 = forwardValue1686_50_0;
    }
    ((net.minecraft.item.ItemStack)(life5_8)).a__Void(((int)(life7_39)));
    }
    forwardValue1686_56_0 = ((this.e) ? 1 : 0);
    }
    if (!((forwardValue1686_56_0 != 0))) {
        break forward_join_63;
    }
    moom.rV.a__xW(((java.util.Random)(p0)), ((net.minecraft.item.ItemStack)(life5_8)), ((int)(((int) moom.D6.g))));
    }
    return life5_8;
}

}
