package moom;


public class FI {

protected int a;

protected java.util.Random b;

protected net.minecraft.world.World c;

private static java.lang.String[] d;

private static long l;

private static long o;

public FI() { super(); }


private static void __sourceConstructorBody_5d67e54aae2ad622(moom.FI receiver) throws Throwable {

long local1 = (moom.FI.l ^ 49697535593971L);

    moom.FI.__sourceConstructorInit_5d67e54aae2ad622_0(((moom.FI)(receiver)));

    ((moom.FI)(receiver)).a = ((int)(((int) moom.FI.o)));

    ((moom.FI)(receiver)).b = ((java.util.Random)(new java.util.Random()));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_5d67e54aae2ad622_0(moom.FI a0) throws E;

static {
l = ((long)(((moom._a)(moom._c.a(((long)(375645574272625701L)), ((long)(-6991699223491609879L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(19394017878823L)))));
    java.lang.String[] __sourceSpill534_6 = new java.lang.String[5];
    long local0_life7 = (moom.FI.l ^ 22741878369137L);
    moom.FI.b(((java.lang.String[])(__sourceSpill534_6)));
    javax.crypto.Cipher local2_life10;
    javax.crypto.Cipher __sourceSpill534_12 = (local2_life10 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill534_13 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill534_14 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill534_15 = new byte[8];
    (__sourceSpill534_15)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life16 = 1;
    while ((local3_life16 < 8)) {
        (__sourceSpill534_15)[local3_life16] = ((byte) ((int) ((local0_life7 << (local3_life16 * 8)) >>> 56)));
        local3_life16 += 1;
    }
    byte[] __sourcePreallocation534_17 = __sourceSpill534_15;
    ((javax.crypto.Cipher)(__sourceSpill534_12)).init(((int)(__sourceSpill534_13)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill534_14)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation534_17)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life20 = -3405318852917526475L;
    byte[] __sourceSpill534_21 = new byte[8];
    (__sourceSpill534_21)[0] = ((byte) ((int) (local4_life20 >>> 56)));
    (__sourceSpill534_21)[1] = ((byte) ((int) (local4_life20 >>> 48)));
    (__sourceSpill534_21)[2] = ((byte) ((int) (local4_life20 >>> 40)));
    (__sourceSpill534_21)[3] = ((byte) ((int) (local4_life20 >>> 32)));
    (__sourceSpill534_21)[4] = ((byte) ((int) (local4_life20 >>> 24)));
    (__sourceSpill534_21)[5] = ((byte) ((int) (local4_life20 >>> 16)));
    (__sourceSpill534_21)[6] = ((byte) ((int) (local4_life20 >>> 8)));
    (__sourceSpill534_21)[7] = ((byte) ((int) local4_life20));
    javax.crypto.Cipher __sourceSpill534_22 = local2_life10;
    byte[] local6_life24 = ((javax.crypto.Cipher)(__sourceSpill534_22)).doFinal(((byte[])(__sourceSpill534_21)));
    o = ((long)((((((((((((long) (local6_life24)[0]) & 255L) << 56) | ((((long) (local6_life24)[1]) & 255L) << 48)) | ((((long) (local6_life24)[2]) & 255L) << 40)) | ((((long) (local6_life24)[3]) & 255L) << 32)) | ((((long) (local6_life24)[4]) & 255L) << 24)) | ((((long) (local6_life24)[5]) & 255L) << 16)) | ((((long) (local6_life24)[6]) & 255L) << 8)) | (((long) (local6_life24)[7]) & 255L))));
}


public static void b(java.lang.String[] p0) {
d = ((java.lang.String[])(p0));
    return;
}


public static java.lang.String[] b() {
return moom.FI.d;
}


protected void a(net.minecraft.world.World p0, int p1, int p2, int p3, int p4, moom.Fm p5) {
return;
}


public void a(moom.Fn p0, net.minecraft.world.World p1, int p2, int p3, moom.Fm p4) {
java.lang.String[] spill638_0;
    long life6_3;
    int life9_6;
    long life10_19;
    long life12_23;
    java.lang.String[] life8_24;
    int life14_28;
    int life15_37;
    long life16_47;
    long life18_52;
    lexical_join_78: {
    life6_3 = (moom.FI.l ^ 78733603988764L);
    life9_6 = this.a;
    this.c = ((net.minecraft.world.World)(p1));
    spill638_0 = moom.FI.b();
    ((java.util.Random)(this.b)).setSeed(((long)(((net.minecraft.world.World)(p1)).a__Long())));
    life10_19 = ((java.util.Random)(this.b)).nextLong();
    life12_23 = ((java.util.Random)(this.b)).nextLong();
    life8_24 = spill638_0;
    life14_28 = (p2 - life9_6);
    lexical_cycle_29: while (true) {
    lexical_join_76: {
    lexical_join_75: {
    if (!((life14_28 <= (p2 + life9_6)))) {
        break lexical_join_78;
    }
    life15_37 = (p3 - life9_6);
    lexical_cycle_38: while (true) {
    if (!((life15_37 <= (p3 + life9_6)))) {
        break lexical_join_75;
    }
    life16_47 = (((long) life14_28) * life10_19);
    life18_52 = (((long) life15_37) * life12_23);
    ((java.util.Random)(this.b)).setSeed(((long)(((life16_47 ^ life18_52) ^ ((net.minecraft.world.World)(p1)).a__Long()))));
    ((moom.FI)(this)).a(((net.minecraft.world.World)(p1)), ((int)(life14_28)), ((int)(life15_37)), ((int)(p2)), ((int)(p3)), ((moom.Fm)(p4)));
    life15_37 += 1;
    if (!((life8_24 != null))) {
        break lexical_join_76;
    }
    if (!((life8_24 == null))) { continue lexical_cycle_38; }
    break lexical_cycle_38;
    }
    }
    life14_28 += 1;
    }
    if (!((life8_24 == null))) { continue lexical_cycle_29; }
    break lexical_cycle_29;
    }
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}

}
