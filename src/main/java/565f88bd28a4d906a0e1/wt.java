package moom;


class wt extends moom.wq {

moom.we f;

private static long g;

private static long h;

wt(moom.we p0, java.lang.String p1, boolean p2, int p3) { super((java.lang.String)null, false, 0); }


private static void __sourceConstructorBody_39e25d9532ae7b27(moom.wt receiver, moom.we p0, java.lang.String p1, boolean p2, int p3) throws Throwable {

((moom.wt)(receiver)).f = ((moom.we)(p0));

    moom.wt.__sourceConstructorInit_39e25d9532ae7b27_0(((moom.wt)(receiver)), ((java.lang.String)(p1)), ((boolean)(p2)), ((int)(p3)));

    return;

}



static {
g = ((long)(((moom._a)(moom._c.a(((long)(-1827240384310629826L)), ((long)(-5098201985266593348L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(51467741829589L)))));
    long local0_life6 = (moom.wt.g ^ 46986503664172L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill1091_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1091_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1091_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1091_13 = new byte[8];
    (__sourceSpill1091_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill1091_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation1091_15 = __sourceSpill1091_13;
    ((javax.crypto.Cipher)(__sourceSpill1091_10)).init(((int)(__sourceSpill1091_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1091_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1091_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -72614846922216690L;
    byte[] __sourceSpill1091_19 = new byte[8];
    (__sourceSpill1091_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill1091_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill1091_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill1091_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill1091_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill1091_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill1091_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill1091_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill1091_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill1091_20)).doFinal(((byte[])(__sourceSpill1091_19)));
    h = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}

private static native <E extends Throwable> void __sourceConstructorInit_39e25d9532ae7b27_0(moom.wt a0, java.lang.String a1, boolean a2, int a3) throws E;

public int c__Int() {
long local1 = (moom.wt.g ^ 53724424109584L);
    return ((int) moom.wt.h);
}


public void a__Void() {
super.a__Void();
    ((moom.we)(this.f)).a__Void(((net.minecraft.inventory.IInventory)(this)));
    return;
}

}
