package moom;


public class Aw implements moom.yK<moom.y2> {

private int a;

private java.lang.String b;

private static long c;

private static long d;

public Aw() {
super();
}


public Aw(int p0, net.minecraft.scoreboard.ScoreObjective p1) { super(); }


private static void __sourceConstructorBody_c113098c74fa068c(moom.Aw receiver, int p0, net.minecraft.scoreboard.ScoreObjective p1) throws Throwable {

moom.Aw __initValue457_21_0;

    init_join_24: {

    init_join_21: {

    init_join_20: {

    long local3_life2 = (moom.Aw.c ^ 52860862423239L);

    int[] __sourceSpill457_4 = moom.zN.b__ArrayInt();

    moom.Aw.__sourceConstructorInit_c113098c74fa068c_0(((moom.Aw)(receiver)));

    int[] local5_life6 = __sourceSpill457_4;

    moom.Aw __sourceSpill457_7 = receiver;

    if (!((local5_life6 == null))) {

        __initValue457_21_0 = __sourceSpill457_7;

        break init_join_21;

    }

    ((moom.Aw)(__sourceSpill457_7)).a = ((int)(p0));

    if (!((p1 == null))) {

        break init_join_20;

    }

    ((moom.Aw)(receiver)).b = ((java.lang.String)(""));

    if (!((local5_life6 != null))) {

        break init_join_24;

    }

    }

    __initValue457_21_0 = receiver;

    }

    ((moom.Aw)(__initValue457_21_0)).b = ((java.lang.String)(((net.minecraft.scoreboard.ScoreObjective)(p1)).a()));

    }

    return;

}



static {
c = ((long)(((moom._a)(moom._c.a(((long)(-3833450226817857047L)), ((long)(567504043984234785L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(97080664439017L)))));
    long local0_life6 = (moom.Aw.c ^ 138629857338281L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill483_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill483_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill483_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill483_13 = new byte[8];
    (__sourceSpill483_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill483_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation483_15 = __sourceSpill483_13;
    ((javax.crypto.Cipher)(__sourceSpill483_10)).init(((int)(__sourceSpill483_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill483_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation483_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = 6720740007958477689L;
    byte[] __sourceSpill483_19 = new byte[8];
    (__sourceSpill483_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill483_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill483_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill483_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill483_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill483_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill483_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill483_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill483_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill483_20)).doFinal(((byte[])(__sourceSpill483_19)));
    d = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}

private static native <E extends Throwable> void __sourceConstructorInit_c113098c74fa068c_0(moom.Aw a0) throws E;

public void b(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
((net.minecraft.network.PacketBuffer)(p0)).writeByte(((int)(this.a)));
    ((net.minecraft.network.PacketBuffer)(p0)).a(((java.lang.String)(this.b)));
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public java.lang.String a__String() {
return this.b;
}


public int a() {
return this.a;
}


public void a(moom.y2 p0) {
((moom.y2)(p0)).a(((moom.Aw)(this)));
    return;
}


public void a(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
long local2 = (moom.Aw.c ^ 88598664683086L);
    this.a = ((int)(((net.minecraft.network.PacketBuffer)(p0)).readByte()));
    this.b = ((java.lang.String)(((net.minecraft.network.PacketBuffer)(p0)).a__String(((int)(((int) moom.Aw.d))))));
    return;
}

}
