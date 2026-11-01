package moom;


public class uW<T extends net.minecraft.entity.EntityLivingBase> extends moom.uV {

private moom.sS n;

private static long o;

private static long p;

public uW(moom.sS p0, java.lang.Class<T> p1, boolean p2, com.google.common.base.Predicate<? super T> p3) { super((moom.sI)null, (java.lang.Class)null, 0, false, false, (com.google.common.base.Predicate)null); }


private static void __sourceConstructorBody_e7a1480d25c5cd77(moom.uW receiver, moom.sS p0, java.lang.Class p1, boolean p2, com.google.common.base.Predicate p3) throws Throwable {

long local5 = (moom.uW.o ^ 120818974898855L);

    moom.uW.__sourceConstructorInit_e7a1480d25c5cd77_0(((moom.uW)(receiver)), ((moom.sS)(p0)), ((java.lang.Class)(p1)), ((int)(((int) moom.uW.p))), ((boolean)(p2)), ((int)(0)), ((com.google.common.base.Predicate)(p3)));

    ((moom.uW)(receiver)).n = ((moom.sS)(p0));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_e7a1480d25c5cd77_0(moom.uW a0, moom.sS a1, java.lang.Class a2, int a3, boolean a4, int a5, com.google.common.base.Predicate a6) throws E;

static {
o = ((long)(((moom._a)(moom._c.a(((long)(2183976058922154978L)), ((long)(-4217631044193474407L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(70842288083300L)))));
    long local0_life6 = (moom.uW.o ^ 116684406360855L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill1052_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1052_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1052_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1052_13 = new byte[8];
    (__sourceSpill1052_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill1052_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation1052_15 = __sourceSpill1052_13;
    ((javax.crypto.Cipher)(__sourceSpill1052_10)).init(((int)(__sourceSpill1052_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1052_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1052_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -5573227225638084584L;
    byte[] __sourceSpill1052_19 = new byte[8];
    (__sourceSpill1052_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill1052_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill1052_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill1052_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill1052_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill1052_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill1052_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill1052_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill1052_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill1052_20)).doFinal(((byte[])(__sourceSpill1052_19)));
    p = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


private static moom.Oo c(moom.Oo p0) {
return p0;
}


public boolean a__Boolean() {
int forwardValue4188_14_0;
    int forwardValue4188_18_0;
    int forwardValue4188_20_0;
    boolean spill4188_0;
    long life1_3;
    int life3_5;
    forward_join_20: {
    forward_join_19: {
    forward_join_18: {
    forward_join_14: {
    life1_3 = (moom.uW.o ^ 67071031425091L);
    life3_5 = ((moom.uc.e()) ? 1 : 0);
    spill4188_0 = ((moom.sS)(this.n)).ae();
    if (!((life3_5 == 0))) {
        forwardValue4188_14_0 = ((spill4188_0) ? 1 : 0);
        break forward_join_14;
    }
    if (!((!spill4188_0))) {
        break forward_join_19;
    }
    forwardValue4188_14_0 = ((super.a__Boolean()) ? 1 : 0);
    }
    if (!((life3_5 == 0))) {
        forwardValue4188_18_0 = forwardValue4188_14_0;
        break forward_join_18;
    }
    if (!((forwardValue4188_14_0 != 0))) {
        break forward_join_19;
    }
    forwardValue4188_18_0 = 1;
    }
    forwardValue4188_20_0 = forwardValue4188_18_0;
    break forward_join_20;
    }
    forwardValue4188_20_0 = 0;
    }
    return ((forwardValue4188_20_0) != 0);
}

}
