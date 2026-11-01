package moom;


public class zw implements moom.yK<moom.y2> {

private long a;

private long b;

private static long c;

private static long d;

public zw() {
super();
}


public zw(long p0, long p1, boolean p2) { super(); }


private static void __sourceConstructorBody_e23b741a458281c8(moom.zw receiver, long p0, long p1, boolean p2) throws Throwable {

int forwardValue522_29_0;

    moom.zw forwardValue522_31_0;

    int[] spill522_0;

    boolean spill522_1;

    moom.zw spill522_2;

    long life6_3;

    int[] life8_7;

    forward_join_33: {

    forward_join_31: {

    forward_join_29: {

    life6_3 = (moom.zw.c ^ 50024674549559L);

    spill522_0 = moom.zN.b__ArrayInt();

    moom.zw.__sourceConstructorInit_e23b741a458281c8_0(((moom.zw)(receiver)));

    life8_7 = spill522_0;

    ((moom.zw)(receiver)).a = ((long)(p0));

    ((moom.zw)(receiver)).b = ((long)(p1));

    spill522_1 = p2;

    if (!((life8_7 == null))) {

        forwardValue522_29_0 = ((spill522_1) ? 1 : 0);

        break forward_join_29;

    }

    if (!((!spill522_1))) {

        break forward_join_33;

    }

    ((moom.zw)(receiver)).b = ((long)((-((moom.zw)(receiver)).b)));

    spill522_2 = receiver;

    if (!((life8_7 == null))) {

        forwardValue522_31_0 = spill522_2;

        break forward_join_31;

    }

    forwardValue522_29_0 = recovery.source.CarrierOps.lcmp(((long)(((moom.zw)(spill522_2)).b)), ((long)(0L)));

    }

    if (!((forwardValue522_29_0 == 0))) {

        break forward_join_33;

    }

    forwardValue522_31_0 = receiver;

    }

    ((moom.zw)(forwardValue522_31_0)).b = ((long)(moom.zw.d));

    }

    return;

}



static {
c = ((long)(((moom._a)(moom._c.a(((long)(-7561927562723722987L)), ((long)(5168207699800875725L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(207528243468654L)))));
    long local0_life6 = (moom.zw.c ^ 32632818292360L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill1152_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1152_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1152_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1152_13 = new byte[8];
    (__sourceSpill1152_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill1152_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation1152_15 = __sourceSpill1152_13;
    ((javax.crypto.Cipher)(__sourceSpill1152_10)).init(((int)(__sourceSpill1152_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1152_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1152_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -4226439235013111555L;
    byte[] __sourceSpill1152_19 = new byte[8];
    (__sourceSpill1152_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill1152_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill1152_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill1152_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill1152_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill1152_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill1152_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill1152_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill1152_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill1152_20)).doFinal(((byte[])(__sourceSpill1152_19)));
    d = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}

private static native <E extends Throwable> void __sourceConstructorInit_e23b741a458281c8_0(moom.zw a0) throws E;

public long b() {
return this.b;
}


public void b(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
((net.minecraft.network.PacketBuffer)(p0)).writeLong(((long)(this.a)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeLong(((long)(this.b)));
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public long a() {
return this.a;
}


public void a(moom.y2 p0) {
((moom.y2)(p0)).a(((moom.zw)(this)));
    return;
}


public void a(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
this.a = ((long)(((net.minecraft.network.PacketBuffer)(p0)).readLong()));
    this.b = ((long)(((net.minecraft.network.PacketBuffer)(p0)).readLong()));
    return;
}

}
