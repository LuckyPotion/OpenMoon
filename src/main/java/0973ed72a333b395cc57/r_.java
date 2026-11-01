package moom;


public class r_ extends net.minecraft.client.particle.EntityFX {

float aV;

private static long bb;

private static long hb;

protected r_(net.minecraft.world.World p0, double p1, double p2, double p3, double p4, double p5, double p6) {
this(((net.minecraft.world.World)(p0)), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((double)(p4)), ((double)(p5)), ((double)(p6)), ((float)(0x1.0p0f)));
    return;
}


protected r_(net.minecraft.world.World p0, double p1, double p2, double p3, double p4, double p5, double p6, float p7) { super((net.minecraft.world.World)null, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D); }


private static void __sourceConstructorBody_6d326092aaa9f5d3(moom.r_ receiver, net.minecraft.world.World p0, double p1, double p2, double p3, double p4, double p5, double p6, float p7) throws Throwable {

moom.r_ spill494_0;

    moom.r_ spill494_1;

    float spill494_2;

    float spill494_3;

    long life15_3;

    life15_3 = (moom.r_.bb ^ 77278903739405L);

    moom.r_.__sourceConstructorInit_6d326092aaa9f5d3_0(((moom.r_)(receiver)), ((net.minecraft.world.World)(p0)), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)));

    moom.r_ __stackOp494_2_0 = receiver;

    ((moom.r_)(__stackOp494_2_0)).t = ((double)((((moom.r_)(__stackOp494_2_0)).t * 0x1.99999ap-4d)));

    moom.r_ __stackOp494_5_0 = receiver;

    ((moom.r_)(__stackOp494_5_0)).u = ((double)((((moom.r_)(__stackOp494_5_0)).u * 0x1.99999ap-4d)));

    moom.r_ __stackOp494_8_0 = receiver;

    ((moom.r_)(__stackOp494_8_0)).v = ((double)((((moom.r_)(__stackOp494_8_0)).v * 0x1.99999ap-4d)));

    moom.r_ __stackOp494_11_0 = receiver;

    ((moom.r_)(__stackOp494_11_0)).t = ((double)((((moom.r_)(__stackOp494_11_0)).t + (p4 * 0x1.999999999999ap-2d))));

    moom.r_ __stackOp494_14_0 = receiver;

    ((moom.r_)(__stackOp494_14_0)).u = ((double)((((moom.r_)(__stackOp494_14_0)).u + (p5 * 0x1.999999999999ap-2d))));

    moom.r_ __stackOp494_17_0 = receiver;

    ((moom.r_)(__stackOp494_17_0)).v = ((double)((((moom.r_)(__stackOp494_17_0)).v + (p6 * 0x1.999999999999ap-2d))));

    spill494_0 = receiver;

    spill494_1 = receiver;

    moom.r_ __stackOp494_21_0 = receiver;

    float __stackOp494_21_1 = ((float) ((java.lang.Math.random() * 0x1.333334p-2d) + 0x1.333334p-1d));

    spill494_2 = __stackOp494_21_1;

    ((moom.r_)(__stackOp494_21_0)).aO = ((float)(__stackOp494_21_1));

    moom.r_ __stackOp494_23_0 = spill494_1;

    float __stackOp494_23_1 = spill494_2;

    spill494_3 = __stackOp494_23_1;

    ((moom.r_)(__stackOp494_23_0)).aN = ((float)(__stackOp494_23_1));

    ((moom.r_)(spill494_0)).aM = ((float)(spill494_3));

    moom.r_ __stackOp494_26_0 = receiver;

    ((moom.r_)(__stackOp494_26_0)).aK = ((float)((((moom.r_)(__stackOp494_26_0)).aK * 0x1.8p-1f)));

    moom.r_ __stackOp494_29_0 = receiver;

    ((moom.r_)(__stackOp494_29_0)).aK = ((float)((((moom.r_)(__stackOp494_29_0)).aK * p7)));

    ((moom.r_)(receiver)).aV = ((float)(((moom.r_)(receiver)).aK));

    ((moom.r_)(receiver)).aJ = ((int)(((int) (0x1.8p2d / ((java.lang.Math.random() * 0x1.999999999999ap-1d) + 0x1.3333333333333p-1d)))));

    ((moom.r_)(receiver)).aJ = ((int)(((int) (((float) ((moom.r_)(receiver)).aJ) * p7))));

    ((moom.r_)(receiver)).Q = ((boolean)(false));

    ((moom.r_)(receiver)).g(((int)(((int) moom.r_.hb))));

    ((moom.r_)(receiver)).g__Void();

    return;

}



static {
bb = ((long)(((moom._a)(moom._c.a(((long)(-6426348529150408570L)), ((long)(8696333309484626028L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(261152958322796L)))));
    long local0_life6 = (moom.r_.bb ^ 82574976311392L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill996_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill996_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill996_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill996_13 = new byte[8];
    (__sourceSpill996_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill996_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation996_15 = __sourceSpill996_13;
    ((javax.crypto.Cipher)(__sourceSpill996_10)).init(((int)(__sourceSpill996_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill996_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation996_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = 257510268683617483L;
    byte[] __sourceSpill996_19 = new byte[8];
    (__sourceSpill996_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill996_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill996_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill996_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill996_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill996_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill996_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill996_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill996_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill996_20)).doFinal(((byte[])(__sourceSpill996_19)));
    hb = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}

private static native <E extends Throwable> void __sourceConstructorInit_6d326092aaa9f5d3_0(moom.r_ a0, net.minecraft.world.World a1, double a2, double a3, double a4, double a5, double a6, double a7) throws E;

public boolean b__Boolean() {
return ((1) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(moom.lw p0, net.minecraft.entity.Entity p1, float p2, float p3, float p4, float p5, float p6, float p7) {
float local9 = (((((float) this.aI) + p2) / ((float) this.aJ)) * 0x1.0p5f);
    local9 = moom.Dr.a(((float)(local9)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)));
    this.aK = ((float)((this.aV * local9)));
    super.a(((moom.lw)(p0)), ((net.minecraft.entity.Entity)(p1)), ((float)(p2)), ((float)(p3)), ((float)(p4)), ((float)(p5)), ((float)(p6)), ((float)(p7)));
    return;
}


public void g__Void() {
this.k = ((double)(this.n));
    this.l = ((double)(this.o));
    this.m = ((double)(this.p));
    moom.r_ __stackOp3924_6_0 = this;
    moom.r_ __stackOp3924_8_0 = __stackOp3924_6_0;
    int __stackOp3924_8_1 = ((moom.r_)(__stackOp3924_6_0)).aI;
    int spill3924_0 = __stackOp3924_8_1;
    ((moom.r_)(__stackOp3924_8_0)).aI = ((int)((__stackOp3924_8_1 + 1)));
    if ((spill3924_0 >= this.aJ)) {
        ((moom.r_)(this)).f__Void();
    }
    ((moom.r_)(this)).b__Void(((double)(this.t)), ((double)(this.u)), ((double)(this.v)));
    this.aN = ((float)(((float) (((double) this.aN) * 0x1.eb851eb851eb8p-1d))));
    this.aO = ((float)(((float) (((double) this.aO) * 0x1.ccccccccccccdp-1d))));
    moom.r_ __stackOp3924_20_0 = this;
    ((moom.r_)(__stackOp3924_20_0)).t = ((double)((((moom.r_)(__stackOp3924_20_0)).t * 0x1.666666p-1d)));
    moom.r_ __stackOp3924_23_0 = this;
    ((moom.r_)(__stackOp3924_23_0)).u = ((double)((((moom.r_)(__stackOp3924_23_0)).u * 0x1.666666p-1d)));
    moom.r_ __stackOp3924_26_0 = this;
    ((moom.r_)(__stackOp3924_26_0)).v = ((double)((((moom.r_)(__stackOp3924_26_0)).v * 0x1.666666p-1d)));
    moom.r_ __stackOp3924_29_0 = this;
    ((moom.r_)(__stackOp3924_29_0)).u = ((double)((((moom.r_)(__stackOp3924_29_0)).u - 0x1.47ae14p-6d)));
    if (this.A) {
        moom.r_ __stackOp3924_33_0 = this;
        ((moom.r_)(__stackOp3924_33_0)).t = ((double)((((moom.r_)(__stackOp3924_33_0)).t * 0x1.666666p-1d)));
        moom.r_ __stackOp3924_36_0 = this;
        ((moom.r_)(__stackOp3924_36_0)).v = ((double)((((moom.r_)(__stackOp3924_36_0)).v * 0x1.666666p-1d)));
    }
    return;
}

}
