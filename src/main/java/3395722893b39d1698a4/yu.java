package moom;


public class yu extends net.minecraft.nbt.NBTBase$NBTPrimitive {

private short c;

private static final long d;

private static final long e;

private static final long g;

public yu() {
super();
}


public yu(short p0) {
super();
    this.c = p0;
}


static {
d = ((long)(((moom._a)(moom._c.a(((long)(2621221385985045757L)), ((long)(-2724743111265419243L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(106554200700471L)))));
    long local5_life6 = (moom.yu.d ^ 118571408412932L);
    javax.crypto.Cipher local7_life8;
    javax.crypto.Cipher __sourceSpill1136_10 = (local7_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1136_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1136_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1136_13 = new byte[8];
    (__sourceSpill1136_13)[0] = ((byte) ((int) (local5_life6 >>> 56)));
    int local8_life14 = 1;
    while ((local8_life14 < 8)) {
        (__sourceSpill1136_13)[local8_life14] = ((byte) ((int) ((local5_life6 << (local8_life14 * 8)) >>> 56)));
        local8_life14 += 1;
    }
    byte[] __sourcePreallocation1136_15 = __sourceSpill1136_13;
    ((javax.crypto.Cipher)(__sourceSpill1136_10)).init(((int)(__sourceSpill1136_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1136_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1136_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local9_life18 = 8990953530643530203L;
    byte[] __sourceSpill1136_19 = new byte[8];
    (__sourceSpill1136_19)[0] = ((byte) ((int) (local9_life18 >>> 56)));
    (__sourceSpill1136_19)[1] = ((byte) ((int) (local9_life18 >>> 48)));
    (__sourceSpill1136_19)[2] = ((byte) ((int) (local9_life18 >>> 40)));
    (__sourceSpill1136_19)[3] = ((byte) ((int) (local9_life18 >>> 32)));
    (__sourceSpill1136_19)[4] = ((byte) ((int) (local9_life18 >>> 24)));
    (__sourceSpill1136_19)[5] = ((byte) ((int) (local9_life18 >>> 16)));
    (__sourceSpill1136_19)[6] = ((byte) ((int) (local9_life18 >>> 8)));
    (__sourceSpill1136_19)[7] = ((byte) ((int) local9_life18));
    javax.crypto.Cipher __sourceSpill1136_20 = local7_life8;
    byte[] local11_life22 = ((javax.crypto.Cipher)(__sourceSpill1136_20)).doFinal(((byte[])(__sourceSpill1136_19)));
    e = ((long)((((((((((((long) (local11_life22)[0]) & 255L) << 56) | ((((long) (local11_life22)[1]) & 255L) << 48)) | ((((long) (local11_life22)[2]) & 255L) << 40)) | ((((long) (local11_life22)[3]) & 255L) << 32)) | ((((long) (local11_life22)[4]) & 255L) << 24)) | ((((long) (local11_life22)[5]) & 255L) << 16)) | ((((long) (local11_life22)[6]) & 255L) << 8)) | (((long) (local11_life22)[7]) & 255L))));
    javax.crypto.Cipher local0_life25;
    javax.crypto.Cipher __sourceSpill1136_27 = (local0_life25 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1136_28 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1136_29 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1136_30 = new byte[8];
    (__sourceSpill1136_30)[0] = ((byte) ((int) (local5_life6 >>> 56)));
    int local1_life31 = 1;
    while ((local1_life31 < 8)) {
        (__sourceSpill1136_30)[local1_life31] = ((byte) ((int) ((local5_life6 << (local1_life31 * 8)) >>> 56)));
        local1_life31 += 1;
    }
    byte[] __sourcePreallocation1136_32 = __sourceSpill1136_30;
    ((javax.crypto.Cipher)(__sourceSpill1136_27)).init(((int)(__sourceSpill1136_28)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1136_29)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1136_32)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local2_life35 = 1239348984437226489L;
    byte[] __sourceSpill1136_36 = new byte[8];
    (__sourceSpill1136_36)[0] = ((byte) ((int) (local2_life35 >>> 56)));
    (__sourceSpill1136_36)[1] = ((byte) ((int) (local2_life35 >>> 48)));
    (__sourceSpill1136_36)[2] = ((byte) ((int) (local2_life35 >>> 40)));
    (__sourceSpill1136_36)[3] = ((byte) ((int) (local2_life35 >>> 32)));
    (__sourceSpill1136_36)[4] = ((byte) ((int) (local2_life35 >>> 24)));
    (__sourceSpill1136_36)[5] = ((byte) ((int) (local2_life35 >>> 16)));
    (__sourceSpill1136_36)[6] = ((byte) ((int) (local2_life35 >>> 8)));
    (__sourceSpill1136_36)[7] = ((byte) ((int) local2_life35));
    javax.crypto.Cipher __sourceSpill1136_37 = local0_life25;
    byte[] local4_life39 = ((javax.crypto.Cipher)(__sourceSpill1136_37)).doFinal(((byte[])(__sourceSpill1136_36)));
    g = ((long)((((((((((((long) (local4_life39)[0]) & 255L) << 56) | ((((long) (local4_life39)[1]) & 255L) << 48)) | ((((long) (local4_life39)[2]) & 255L) << 40)) | ((((long) (local4_life39)[3]) & 255L) << 32)) | ((((long) (local4_life39)[4]) & 255L) << 24)) | ((((long) (local4_life39)[5]) & 255L) << 16)) | ((((long) (local4_life39)[6]) & 255L) << 8)) | (((long) (local4_life39)[7]) & 255L))));
}


public boolean equals(java.lang.Object p0) {
int forwardValue4582_23_0;
    int forwardValue4582_25_0;
    int forwardValue4582_27_0;
    boolean spill4582_0;
    short spill4582_1;
    long life2_3;
    java.lang.String life4_5;
    moom.yu life5_17;
    forward_join_27: {
    forward_join_26: {
    forward_join_25: {
    forward_join_24: {
    forward_join_23: {
    life2_3 = (moom.yu.d ^ 44093773846659L);
    life4_5 = net.minecraft.nbt.NBTBase.b();
    spill4582_0 = super.equals(((java.lang.Object)(p0)));
    if (!((life4_5 == null))) {
        forwardValue4582_27_0 = ((spill4582_0) ? 1 : 0);
        break forward_join_27;
    }
    if (!(spill4582_0)) {
        break forward_join_26;
    }
    life5_17 = ((moom.yu)(p0));
    spill4582_1 = this.c;
    if (!((life4_5 == null))) {
        forwardValue4582_23_0 = ((int)(spill4582_1));
        break forward_join_23;
    }
    if (!((spill4582_1 == ((moom.yu)(life5_17)).c))) {
        break forward_join_24;
    }
    forwardValue4582_23_0 = 1;
    }
    forwardValue4582_25_0 = forwardValue4582_23_0;
    break forward_join_25;
    }
    forwardValue4582_25_0 = 0;
    }
    return ((forwardValue4582_25_0) != 0);
    }
    forwardValue4582_27_0 = 0;
    }
    return ((forwardValue4582_27_0) != 0);
}


public java.lang.String toString() {
return __sourceIntrinsic_a86c261fcdee_originalDynamicSite1727_1(this.c);
}


public int hashCode() {
return (super.hashCode() ^ this.c);
}


public byte b__sourceReturn_7d493934e8() {
long local1 = (moom.yu.d ^ 25112599045610L);
    return ((byte) (this.c & ((int) moom.yu.e)));
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public float a__Float() {
return ((float) this.c);
}


public double a__Double() {
return ((double) this.c);
}


public net.minecraft.nbt.NBTBase a__yn() {
return new moom.yu(this.c);
}


void a(java.io.DataOutput p0) throws java.io.IOException {
((java.io.DataOutput)(p0)).writeShort(((int)(this.c)));
    return;
}


public byte a() {
return 2;
}


void a(java.io.DataInput p0, int p1, moom.yB p2) throws java.io.IOException {
long local4 = (moom.yu.d ^ 26231812382304L);
    ((moom.yB)(p2)).a(((long)(moom.yu.g)));
    this.c = ((short)(((java.io.DataInput)(p0)).readShort()));
    return;
}


public long a__Long() {
return ((long) this.c);
}


public int a__Int() {
return this.c;
}


public short a__Short() {
return this.c;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite1727_1(short a0) throws E;
}
