package moom;


public class Iw extends moom.Ir {

private static long e;

private static long f;

public Iw() {
super();
}

private static native <E extends Throwable> void __sourceConstructorInit_b698b70d876a8612_0(moom.Iw a0, int a1, int a2) throws E;

public Iw(net.minecraft.world.World p0, java.util.Random p1, int p2, int p3) { super(0, 0); }


private static void __sourceConstructorBody_b698b70d876a8612(moom.Iw receiver, net.minecraft.world.World p0, java.util.Random p1, int p2, int p3) throws Throwable {

long local5 = (moom.Iw.e ^ 56848232439670L);

    moom.Iw.__sourceConstructorInit_b698b70d876a8612_0(((moom.Iw)(receiver)), ((int)(p2)), ((int)(p3)));

    moom.Ha local7 = new moom.Ha(0, p1, ((p2 << 4) + 2), ((p3 << 4) + 2));

    ((java.util.LinkedList)(((moom.Iw)(receiver)).a)).add(((java.lang.Object)(local7)));

    ((moom.Ha)(local7)).a(((moom.G4)(local7)), ((java.util.List)(((moom.Iw)(receiver)).a)), ((java.util.Random)(p1)));

    ((moom.Iw)(receiver)).a__Void();

    ((moom.Iw)(receiver)).a(((net.minecraft.world.World)(p0)), ((java.util.Random)(p1)), ((int)(((int) moom.Iw.f))));

    return;

}



static {
e = ((long)(((moom._a)(moom._c.a(((long)(847644838300256309L)), ((long)(-6838355173986394275L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(206019954246671L)))));
    long local0_life6 = (moom.Iw.e ^ 36308624812415L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill585_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill585_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill585_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill585_13 = new byte[8];
    (__sourceSpill585_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill585_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation585_15 = __sourceSpill585_13;
    ((javax.crypto.Cipher)(__sourceSpill585_10)).init(((int)(__sourceSpill585_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill585_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation585_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -2872445735687129317L;
    byte[] __sourceSpill585_19 = new byte[8];
    (__sourceSpill585_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill585_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill585_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill585_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill585_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill585_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill585_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill585_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill585_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill585_20)).doFinal(((byte[])(__sourceSpill585_19)));
    f = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}

}
