package moom;


public class lA extends moom.lz {

private moom.oC a;

private static final long b;

private static final long g;

public lA() {
super();
    this.a = null;
}


static {
b = ((long)(((moom._a)(moom._c.a(((long)(8940984906521370002L)), ((long)(-670267607039516591L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(76043940913678L)))));
    long local0_life6 = (moom.lA.b ^ 109809119305461L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill915_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill915_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill915_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill915_13 = new byte[8];
    (__sourceSpill915_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill915_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation915_15 = __sourceSpill915_13;
    ((javax.crypto.Cipher)(__sourceSpill915_10)).init(((int)(__sourceSpill915_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill915_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation915_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = 263167886309398632L;
    byte[] __sourceSpill915_19 = new byte[8];
    (__sourceSpill915_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill915_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill915_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill915_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill915_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill915_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill915_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill915_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill915_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill915_20)).doFinal(((byte[])(__sourceSpill915_19)));
    g = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(moom.oC p0) {
this.a = ((moom.oC)(p0));
    return;
}


public void a(moom.lw p0) {
long local2 = (moom.lA.b ^ 66281533348375L);
    if ((((moom.lw)(p0)).c__Int() == ((int) moom.lA.g))) {
        if ((__sourceIntrinsic_booleanComparison(moom.BU.aI()) != 0)) {
        ((moom.lw)(p0)).g();
        ((moom.oC)(this.a)).b(((int)(((moom.lw)(p0)).c__Int())));
    }
    }
    ((moom.oC)(this.a)).a(((java.nio.ByteBuffer)(((moom.lw)(p0)).a__ByteBuffer())));
    ((moom.lw)(p0)).a__Void();
    return;
}


private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
