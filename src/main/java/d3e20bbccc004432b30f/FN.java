package moom;


public class FN extends net.minecraft.world.gen.structure.MapGenStructure {

private double g;

private static long h;

private static long i;

public FN(java.util.Map<java.lang.String, java.lang.String> p0) { super(); }

private static void __sourceConstructorBody_c381449ff5532946(moom.FN receiver, java.util.Map p0) throws Throwable {
init_join_38: {
    long local2_life2 = (moom.FN.h ^ 30553981287335L);
    moom.FN.__sourceConstructorInit_c381449ff5532946_0(((moom.FN)(receiver)));
    ((moom.FN)(receiver)).g = ((double)(0x1.0624dd2f1a9fcp-8D));
    net.minecraft.entity.Entity[] __sourceSpill484_9 = moom.G4.b();
    java.util.Iterator local5_life10 = ((java.util.Set)(((java.util.Map)(p0)).entrySet())).iterator();
    net.minecraft.entity.Entity[] local4_life11 = __sourceSpill484_9;
    init_cycle_15: while (true) {
    init_join_36: {
    if (!(((java.util.Iterator)(local5_life10)).hasNext())) {
        break init_join_38;
    }
    java.util.Map.Entry local6_life15 = ((java.util.Map.Entry)(((java.util.Iterator)(local5_life10)).next()));
    if (!(((java.lang.String)(((java.lang.String)(((java.util.Map.Entry)(local6_life15)).getKey())))).equals(((java.lang.Object)("chance"))))) {
        break init_join_36;
    }
    ((moom.FN)(receiver)).g = ((double)(moom.Dr.a(((java.lang.String)(((java.lang.String)(((java.util.Map.Entry)(local6_life15)).getValue())))), ((double)(((moom.FN)(receiver)).g)))));
    }
    if (!((local4_life11 == null))) { continue init_cycle_15; }
    break init_cycle_15;
    }
    }
    return;
}


public FN() {
super();
    this.g = 0x1.0624dd2f1a9fcp-8d;
}


static {
h = ((long)(((moom._a)(moom._c.a(((long)(5286568682162573519L)), ((long)(5157874613413338297L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(260841016171886L)))));
    long local0_life6 = (moom.FN.h ^ 139379459225132L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill535_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill535_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill535_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill535_13 = new byte[8];
    (__sourceSpill535_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill535_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation535_15 = __sourceSpill535_13;
    ((javax.crypto.Cipher)(__sourceSpill535_10)).init(((int)(__sourceSpill535_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill535_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation535_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = 3948722190428942909L;
    byte[] __sourceSpill535_19 = new byte[8];
    (__sourceSpill535_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill535_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill535_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill535_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill535_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill535_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill535_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill535_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill535_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill535_20)).doFinal(((byte[])(__sourceSpill535_19)));
    i = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}

private static native <E extends Throwable> void __sourceConstructorInit_c381449ff5532946_0(moom.FN a0) throws E;

private static moom.Oo b(moom.Oo p0) {
return p0;
}


protected moom.Ir a(int p0, int p1) {
return new moom.Iw(this.c, this.b, p0, p1);
}


public java.lang.String a() {
return "Mineshaft";
}


protected boolean a__Boolean(int p0, int p1) {
int forwardValue1914_20_0;
    int forwardValue1914_29_0;
    int forwardValue1914_31_0;
    int spill1914_0;
    long life3_3;
    net.minecraft.entity.Entity[] life5_5;
    forward_join_31: {
    forward_join_30: {
    forward_join_29: {
    forward_join_20: {
    life3_3 = (moom.FN.h ^ 131075261949015L);
    life5_5 = moom.G4.b();
    spill1914_0 = recovery.source.CarrierOps.dcmpg(((double)(((java.util.Random)(this.b)).nextDouble())), ((double)(this.g)));
    if (!((life5_5 != null))) {
        forwardValue1914_20_0 = spill1914_0;
        break forward_join_20;
    }
    if (!((spill1914_0 < 0))) {
        break forward_join_30;
    }
    forwardValue1914_20_0 = ((java.util.Random)(this.b)).nextInt(((int)(((int) moom.FN.i))));
    }
    if (!((life5_5 != null))) {
        forwardValue1914_29_0 = forwardValue1914_20_0;
        break forward_join_29;
    }
    if (!((forwardValue1914_20_0 < java.lang.Math.max(((int)(java.lang.Math.abs(((int)(p0))))), ((int)(java.lang.Math.abs(((int)(p1))))))))) {
        break forward_join_30;
    }
    forwardValue1914_29_0 = 1;
    }
    forwardValue1914_31_0 = forwardValue1914_29_0;
    break forward_join_31;
    }
    forwardValue1914_31_0 = 0;
    }
    return ((forwardValue1914_31_0) != 0);
}

}
