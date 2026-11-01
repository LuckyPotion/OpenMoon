package moom;


public class At implements moom.yK<moom.y2> {

private java.lang.String[] a;

private static final long b;

private static final long c;

public At() {
super();
}


public At(java.lang.String[] p0) {
super();
    this.a = p0;
}


static {
b = ((long)(((moom._a)(moom._c.a(((long)(-8726295772659908276L)), ((long)(5789989147315753193L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(205660890504975L)))));
    long local0_life6 = (moom.At.b ^ 53592473718552L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill480_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill480_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill480_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill480_13 = new byte[8];
    (__sourceSpill480_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill480_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation480_15 = __sourceSpill480_13;
    ((javax.crypto.Cipher)(__sourceSpill480_10)).init(((int)(__sourceSpill480_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill480_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation480_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = 3957784344035419905L;
    byte[] __sourceSpill480_19 = new byte[8];
    (__sourceSpill480_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill480_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill480_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill480_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill480_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill480_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill480_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill480_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill480_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill480_20)).doFinal(((byte[])(__sourceSpill480_19)));
    c = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


public void b(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
int[] spill491_0;
    long life2_3;
    java.lang.String[] life5_12;
    int life6_15;
    int life7_17;
    int[] life4_18;
    java.lang.String life8_25;
    lexical_join_33: {
    life2_3 = (moom.At.b ^ 56139270052671L);
    spill491_0 = moom.zN.b__ArrayInt();
    ((net.minecraft.network.PacketBuffer)(p0)).a__Void(((int)((this.a).length)));
    life5_12 = this.a;
    life6_15 = (life5_12).length;
    life7_17 = 0;
    life4_18 = spill491_0;
    lexical_cycle_19: while (true) {
    if (!((life7_17 < life6_15))) {
        break lexical_join_33;
    }
    life8_25 = (life5_12)[life7_17];
    ((net.minecraft.network.PacketBuffer)(p0)).a(((java.lang.String)(life8_25)));
    life7_17 += 1;
    if (!((life4_18 != null))) { continue lexical_cycle_19; }
    break lexical_cycle_19;
    }
    }
    return;
}


public void a(moom.y2 p0) {
((moom.y2)(p0)).a(((moom.At)(this)));
    return;
}


public void a__sourceBridge_691ab4d076(moom.yE p0) {
((moom.At)(this)).a(((moom.y2)(((moom.y2)(p0)))));
}


public java.lang.String[] a() {
return this.a;
}


public void a(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
int[] spill490_0;
    long life2_3;
    int[] life4_10;
    int life5_12;
    lexical_join_29: {
    life2_3 = (moom.At.b ^ 76806957729974L);
    spill490_0 = moom.zN.b__ArrayInt();
    this.a = ((java.lang.String[])(new java.lang.String[((net.minecraft.network.PacketBuffer)(p0)).a()]));
    life4_10 = spill490_0;
    life5_12 = 0;
    lexical_cycle_13: while (true) {
    if (!((life5_12 < (this.a).length))) {
        break lexical_join_29;
    }
    (this.a)[life5_12] = ((net.minecraft.network.PacketBuffer)(p0)).a__String(((int)(((int) moom.At.c))));
    life5_12 += 1;
    if (!((life4_10 != null))) { continue lexical_cycle_13; }
    break lexical_cycle_13;
    }
    }
    return;
}



}
