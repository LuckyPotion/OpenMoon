package moom;


class Bn implements net.minecraft.util.IProgressUpdate {

private long a;

moom.Bl b;

private static long c;

private static long d;

Bn(moom.Bl p0) { super(); }


private static void __sourceConstructorBody_c8156d2854332f69(moom.Bn receiver, moom.Bl p0) throws Throwable {

((moom.Bn)(receiver)).b = ((moom.Bl)(p0));

    moom.Bn.__sourceConstructorInit_c8156d2854332f69_0(((moom.Bn)(receiver)));

    ((moom.Bn)(receiver)).a = ((long)(java.lang.System.currentTimeMillis()));

    return;

}



static {
c = ((long)(((moom._a)(moom._c.a(((long)(1575582375465697709L)), ((long)(-3727982409267971643L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(10837792417387L)))));
    long local0_life6 = (moom.Bn.c ^ 93073100699108L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill491_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill491_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill491_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill491_13 = new byte[8];
    (__sourceSpill491_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill491_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation491_15 = __sourceSpill491_13;
    ((javax.crypto.Cipher)(__sourceSpill491_10)).init(((int)(__sourceSpill491_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill491_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation491_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -2481985649598068263L;
    byte[] __sourceSpill491_19 = new byte[8];
    (__sourceSpill491_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill491_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill491_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill491_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill491_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill491_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill491_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill491_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill491_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill491_20)).doFinal(((byte[])(__sourceSpill491_19)));
    d = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}

private static native <E extends Throwable> void __sourceConstructorInit_c8156d2854332f69_0(moom.Bn a0) throws E;

public void b() {
return;
}


public void b(java.lang.String p0) {
return;
}


public void c(java.lang.String p0) {
return;
}


public void a(java.lang.String p0) {
return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a__sourceReturn_d00df7729d(int p0) {
long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_22: {
    forward_join_18: {
    life2_3 = (moom.Bn.c ^ 70842658313894L);
    life4_5 = moom.Bl.b__Arrayr3();
    if (!((life4_5 == null))) { break forward_join_18; }
    if (!((recovery.source.CarrierOps.lcmp(((long)((java.lang.System.currentTimeMillis() - this.a))), ((long)(moom.Bn.d))) >= 0))) { break forward_join_22; }
    this.a = ((long)(java.lang.System.currentTimeMillis()));
    }
    ((org.apache.logging.log4j.Logger)(moom.Bl.a)).info(((java.lang.String)(__sourceIntrinsic_b4a3d886a4d9_invokedynamic1871_9(p0))));
    }
    return;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b4a3d886a4d9_invokedynamic1871_9(int a0) throws E;
}
