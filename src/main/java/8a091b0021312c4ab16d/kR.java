package moom;


public abstract class kR {

private double a;

private double b;

private double c;

protected java.util.List<moom.mp> d;

protected boolean e;

private java.util.BitSet f;

private java.util.BitSet g;

private static long l;

private static long n;

public kR() { super(); }


private static void __sourceConstructorBody_43c84c7c85ef196c(moom.kR receiver) throws Throwable {

long local1 = (moom.kR.l ^ 131485736590661L);

    moom.kR.__sourceConstructorInit_43c84c7c85ef196c_0(((moom.kR)(receiver)));

    ((moom.kR)(receiver)).d = ((java.util.List)(com.google.common.collect.Lists.newArrayListWithCapacity(((int)(((int) moom.kR.n))))));

    ((moom.kR)(receiver)).g = ((java.util.BitSet)(new java.util.BitSet()));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_43c84c7c85ef196c_0(moom.kR a0) throws E;

static {
l = ((long)(((moom._a)(moom._c.a(((long)(6574049770756768361L)), ((long)(4627400637513040144L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(54289640646391L)))));
    long local0_life6 = (moom.kR.l ^ 125162927780684L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill907_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill907_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill907_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill907_13 = new byte[8];
    (__sourceSpill907_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill907_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation907_15 = __sourceSpill907_13;
    ((javax.crypto.Cipher)(__sourceSpill907_10)).init(((int)(__sourceSpill907_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill907_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation907_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -9198455025751990389L;
    byte[] __sourceSpill907_19 = new byte[8];
    (__sourceSpill907_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill907_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill907_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill907_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill907_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill907_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill907_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill907_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill907_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill907_20)).doFinal(((byte[])(__sourceSpill907_19)));
    n = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public abstract void a(net.minecraft.util.EnumWorldBlockLayer p0);

public void a(moom.mp p0, net.minecraft.util.EnumWorldBlockLayer p1) {
java.util.BitSet life3_12;
    ((java.util.List)(this.d)).add(((java.lang.Object)(p0)));
    if ((this.f != null)) {
        life3_12 = ((net.minecraft.client.renderer.chunk.CompiledChunk)(((moom.mp)(p0)).e)).a(((net.minecraft.util.EnumWorldBlockLayer)(p1)));
        if ((life3_12 != null)) {
        ((java.util.BitSet)(this.f)).or(((java.util.BitSet)(life3_12)));
    }
    }
    return;
}


public void a(moom.mp p0) {
java.lang.Object local2 = ((moom.mp)(p0)).a__DT();
    moom.kZ.b(((float)(((float) (((double) ((moom.DT)(local2)).a()) - this.a)))), ((float)(((float) (((double) ((moom.DT)(local2)).b()) - this.b)))), ((float)(((float) (((double) ((moom.DT)(local2)).c()) - this.c)))));
    return;
}


public void a(double p0, double p1, double p2) {
this.e = ((boolean)(true));
    ((java.util.List)(this.d)).clear();
    this.a = ((double)(p0));
    this.b = ((double)(p1));
    this.c = ((double)(p2));
    if ((__sourceIntrinsic_booleanComparison(moom.JY.a__Boolean()) != 0)) {
        if ((this.f != null)) {
        moom.JY.a(((java.util.BitSet)(this.f)));
    } else {
        this.f = ((java.util.BitSet)(this.g));
    }
        ((java.util.BitSet)(this.f)).clear();
    } else {
        if ((this.f != null)) {
        moom.JY.a(((java.util.BitSet)(this.f)));
        this.f = ((java.util.BitSet)(null));
    }
    }
    return;
}


private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
