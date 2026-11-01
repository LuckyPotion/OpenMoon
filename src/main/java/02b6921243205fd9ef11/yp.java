package moom;


public class yp extends net.minecraft.nbt.NBTBase$NBTPrimitive {

private byte c;

private static final long d;

private static final long e;

yp() {
super();
}


public yp(byte p0) {
super();
    this.c = p0;
}


static {
d = ((long)(((moom._a)(moom._c.a(((long)(-6729334170864813320L)), ((long)(-8491860279910956316L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(55295145702748L)))));
    long local0_life6 = (moom.yp.d ^ 18735358024065L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill1131_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1131_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1131_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1131_13 = new byte[8];
    (__sourceSpill1131_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill1131_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation1131_15 = __sourceSpill1131_13;
    ((javax.crypto.Cipher)(__sourceSpill1131_10)).init(((int)(__sourceSpill1131_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1131_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1131_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = 5169891740790178098L;
    byte[] __sourceSpill1131_19 = new byte[8];
    (__sourceSpill1131_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill1131_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill1131_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill1131_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill1131_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill1131_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill1131_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill1131_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill1131_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill1131_20)).doFinal(((byte[])(__sourceSpill1131_19)));
    e = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


public boolean equals(java.lang.Object p0) {
int forwardValue4577_23_0;
    int forwardValue4577_25_0;
    int forwardValue4577_27_0;
    boolean spill4577_0;
    byte spill4577_1;
    long life2_3;
    java.lang.String life4_5;
    moom.yp life5_17;
    forward_join_27: {
    forward_join_26: {
    forward_join_25: {
    forward_join_24: {
    forward_join_23: {
    life2_3 = (moom.yp.d ^ 99168479157058L);
    life4_5 = net.minecraft.nbt.NBTBase.b();
    spill4577_0 = super.equals(((java.lang.Object)(p0)));
    if (!((life4_5 == null))) {
        forwardValue4577_27_0 = ((spill4577_0) ? 1 : 0);
        break forward_join_27;
    }
    if (!(spill4577_0)) {
        break forward_join_26;
    }
    life5_17 = ((moom.yp)(p0));
    spill4577_1 = this.c;
    if (!((life4_5 == null))) {
        forwardValue4577_23_0 = ((int)(spill4577_1));
        break forward_join_23;
    }
    if (!((spill4577_1 == ((moom.yp)(life5_17)).c))) {
        break forward_join_24;
    }
    forwardValue4577_23_0 = 1;
    }
    forwardValue4577_25_0 = forwardValue4577_23_0;
    break forward_join_25;
    }
    forwardValue4577_25_0 = 0;
    }
    return ((forwardValue4577_25_0) != 0);
    }
    forwardValue4577_27_0 = 0;
    }
    return ((forwardValue4577_27_0) != 0);
}


public java.lang.String toString() {
return __sourceIntrinsic_a86c261fcdee_originalDynamicSite1711_1(this.c);
}


public int hashCode() {
return (super.hashCode() ^ this.c);
}


public byte b__sourceReturn_7d493934e8() {
return this.c;
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
return new moom.yp(this.c);
}


void a(java.io.DataOutput p0) throws java.io.IOException {
((java.io.DataOutput)(p0)).writeByte(((int)(this.c)));
    return;
}


public byte a() {
return 1;
}


void a(java.io.DataInput p0, int p1, moom.yB p2) throws java.io.IOException {
long local4 = (moom.yp.d ^ 103659743354894L);
    ((moom.yB)(p2)).a(((long)(moom.yp.e)));
    this.c = ((byte)(((java.io.DataInput)(p0)).readByte()));
    return;
}


public long a__Long() {
return ((long) this.c);
}


public int a__Int() {
return this.c;
}


public short a__Short() {
return ((short) this.c);
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite1711_1(byte a0) throws E;
}
