package moom;


public class xR extends net.minecraft.item.ItemTool {

private static final java.util.Set<net.minecraft.block.Block> r;

private static final long s;

protected xR(moom.a4 p0) {
super(0x1.8000000000000p+1f, p0, moom.xR.r);
}


static {
s = ((long)(((moom._a)(moom._c.a(((long)(4094080636705465045L)), ((long)(9188625165901765556L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(79706005073179L)))));
    long local11_life6 = (moom.xR.s ^ 135399881504328L);
    javax.crypto.Cipher local1_life8;
    javax.crypto.Cipher __sourceSpill1677_10 = (local1_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1677_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1677_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1677_13 = new byte[8];
    (__sourceSpill1677_13)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local2_life14 = 1;
    while ((local2_life14 < 8)) {
        (__sourceSpill1677_13)[local2_life14] = ((byte) ((int) ((local11_life6 << (local2_life14 * 8)) >>> 56)));
        local2_life14 += 1;
    }
    byte[] __sourcePreallocation1677_15 = __sourceSpill1677_13;
    ((javax.crypto.Cipher)(__sourceSpill1677_10)).init(((int)(__sourceSpill1677_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1677_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1677_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local0_life18 = new long[4];
    int local4_life19 = 0;
    java.lang.String local5_life20;
    int local6_life22 = ((java.lang.String)((local5_life20 = "­õIx½àO6å·ky¶"))).length();
    int local3_life23 = 0;
    do {
        java.lang.String __sourceSpill1677_24 = local5_life20;
        int __sourceSpill1677_25 = local3_life23;
        local3_life23 += 8;
        byte[] local7_life28 = ((java.lang.String)(((java.lang.String)(__sourceSpill1677_24)).substring(((int)(__sourceSpill1677_25)), ((int)(local3_life23))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1677_29 = local0_life18;
        int __sourceSpill1677_30 = local4_life19;
        local4_life19 += 1;
        long local8_life31 = (((((((((((long) (local7_life28)[0]) & 255L) << 56) | ((((long) (local7_life28)[1]) & 255L) << 48)) | ((((long) (local7_life28)[2]) & 255L) << 40)) | ((((long) (local7_life28)[3]) & 255L) << 32)) | ((((long) (local7_life28)[4]) & 255L) << 24)) | ((((long) (local7_life28)[5]) & 255L) << 16)) | ((((long) (local7_life28)[6]) & 255L) << 8)) | (((long) (local7_life28)[7]) & 255L));
        byte[] __sourceSpill1677_32 = new byte[8];
        (__sourceSpill1677_32)[0] = ((byte) ((int) (local8_life31 >>> 56)));
        (__sourceSpill1677_32)[1] = ((byte) ((int) (local8_life31 >>> 48)));
        (__sourceSpill1677_32)[2] = ((byte) ((int) (local8_life31 >>> 40)));
        (__sourceSpill1677_32)[3] = ((byte) ((int) (local8_life31 >>> 32)));
        (__sourceSpill1677_32)[4] = ((byte) ((int) (local8_life31 >>> 24)));
        (__sourceSpill1677_32)[5] = ((byte) ((int) (local8_life31 >>> 16)));
        (__sourceSpill1677_32)[6] = ((byte) ((int) (local8_life31 >>> 8)));
        (__sourceSpill1677_32)[7] = ((byte) ((int) local8_life31));
        javax.crypto.Cipher __sourceSpill1677_33 = local1_life8;
        byte[] local10_life35 = ((javax.crypto.Cipher)(__sourceSpill1677_33)).doFinal(((byte[])(__sourceSpill1677_32)));
        (__sourceSpill1677_29)[__sourceSpill1677_30] = (((((((((((long) (local10_life35)[0]) & 255L) << 56) | ((((long) (local10_life35)[1]) & 255L) << 48)) | ((((long) (local10_life35)[2]) & 255L) << 40)) | ((((long) (local10_life35)[3]) & 255L) << 32)) | ((((long) (local10_life35)[4]) & 255L) << 24)) | ((((long) (local10_life35)[5]) & 255L) << 16)) | ((((long) (local10_life35)[6]) & 255L) << 8)) | (((long) (local10_life35)[7]) & 255L));
    } while ((!(local3_life23 >= local6_life22)));
    local6_life22 = ((java.lang.String)((local5_life20 = "ÇWæ%»\022!\"\001çÝúÕü"))).length();
    local3_life23 = 0;
    do {
        java.lang.String __sourceSpill1677_37 = local5_life20;
        int __sourceSpill1677_38 = local3_life23;
        local3_life23 += 8;
        byte[] local7_life41 = ((java.lang.String)(((java.lang.String)(__sourceSpill1677_37)).substring(((int)(__sourceSpill1677_38)), ((int)(local3_life23))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1677_42 = local0_life18;
        int __sourceSpill1677_43 = local4_life19;
        local4_life19 += 1;
        long local8_life44 = (((((((((((long) (local7_life41)[0]) & 255L) << 56) | ((((long) (local7_life41)[1]) & 255L) << 48)) | ((((long) (local7_life41)[2]) & 255L) << 40)) | ((((long) (local7_life41)[3]) & 255L) << 32)) | ((((long) (local7_life41)[4]) & 255L) << 24)) | ((((long) (local7_life41)[5]) & 255L) << 16)) | ((((long) (local7_life41)[6]) & 255L) << 8)) | (((long) (local7_life41)[7]) & 255L));
        byte[] __sourceSpill1677_45 = new byte[8];
        (__sourceSpill1677_45)[0] = ((byte) ((int) (local8_life44 >>> 56)));
        (__sourceSpill1677_45)[1] = ((byte) ((int) (local8_life44 >>> 48)));
        (__sourceSpill1677_45)[2] = ((byte) ((int) (local8_life44 >>> 40)));
        (__sourceSpill1677_45)[3] = ((byte) ((int) (local8_life44 >>> 32)));
        (__sourceSpill1677_45)[4] = ((byte) ((int) (local8_life44 >>> 24)));
        (__sourceSpill1677_45)[5] = ((byte) ((int) (local8_life44 >>> 16)));
        (__sourceSpill1677_45)[6] = ((byte) ((int) (local8_life44 >>> 8)));
        (__sourceSpill1677_45)[7] = ((byte) ((int) local8_life44));
        javax.crypto.Cipher __sourceSpill1677_46 = local1_life8;
        byte[] local10_life48 = ((javax.crypto.Cipher)(__sourceSpill1677_46)).doFinal(((byte[])(__sourceSpill1677_45)));
        (__sourceSpill1677_42)[__sourceSpill1677_43] = (((((((((((long) (local10_life48)[0]) & 255L) << 56) | ((((long) (local10_life48)[1]) & 255L) << 48)) | ((((long) (local10_life48)[2]) & 255L) << 40)) | ((((long) (local10_life48)[3]) & 255L) << 32)) | ((((long) (local10_life48)[4]) & 255L) << 24)) | ((((long) (local10_life48)[5]) & 255L) << 16)) | ((((long) (local10_life48)[6]) & 255L) << 8)) | (((long) (local10_life48)[7]) & 255L));
    } while ((!(local3_life23 >= local6_life22)));
    net.minecraft.block.Block[] __sourceSpill1677_50 = new net.minecraft.block.Block[((int) (local0_life18)[1])];
    (__sourceSpill1677_50)[0] = net.minecraft.init.Blocks.f;
    (__sourceSpill1677_50)[1] = net.minecraft.init.Blocks.X;
    (__sourceSpill1677_50)[2] = net.minecraft.init.Blocks.r;
    (__sourceSpill1677_50)[3] = net.minecraft.init.Blocks.s;
    (__sourceSpill1677_50)[4] = net.minecraft.init.Blocks.ae;
    (__sourceSpill1677_50)[5] = net.minecraft.init.Blocks.aU;
    (__sourceSpill1677_50)[((int) (local0_life18)[2])] = net.minecraft.init.Blocks.aZ;
    (__sourceSpill1677_50)[((int) (local0_life18)[3])] = net.minecraft.init.Blocks.a_;
    (__sourceSpill1677_50)[((int) (local0_life18)[0])] = net.minecraft.init.Blocks.au;
    r = ((java.util.Set)(com.google.common.collect.Sets.newHashSet(((java.lang.Object[])(__sourceSpill1677_50)))));
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public float a(net.minecraft.item.ItemStack p0, net.minecraft.block.Block p1) {
moom.fn forwardValue4499_15_0;
    moom.fn forwardValue4499_15_1;
    moom.fn forwardValue4499_21_0;
    moom.fn forwardValue4499_21_1;
    float forwardValue4499_29_0;
    moom.fn spill4499_0;
    moom.fn spill4499_1;
    long life3_3;
    int life5_5;
    forward_join_29: {
    forward_join_27: {
    forward_join_21: {
    forward_join_15: {
    life3_3 = (moom.xR.s ^ 127952498898003L);
    life5_5 = ((net.minecraft.item.ItemStack.m()) ? 1 : 0);
    spill4499_0 = ((net.minecraft.block.Block)(p1)).a__fn();
    spill4499_1 = moom.fn.d;
    if (!((life5_5 != 0))) {
        forwardValue4499_15_0 = spill4499_0;
        forwardValue4499_15_1 = spill4499_1;
        break forward_join_15;
    }
    if (!((spill4499_0 != spill4499_1))) {
        break forward_join_27;
    }
    forwardValue4499_15_0 = ((net.minecraft.block.Block)(p1)).a__fn();
    forwardValue4499_15_1 = moom.fn.k;
    }
    if (!((life5_5 != 0))) {
        forwardValue4499_21_0 = forwardValue4499_15_0;
        forwardValue4499_21_1 = forwardValue4499_15_1;
        break forward_join_21;
    }
    if (!((forwardValue4499_15_0 != forwardValue4499_15_1))) {
        break forward_join_27;
    }
    forwardValue4499_21_0 = ((net.minecraft.block.Block)(p1)).a__fn();
    forwardValue4499_21_1 = moom.fn.l;
    }
    if (!((forwardValue4499_21_0 != forwardValue4499_21_1))) {
        break forward_join_27;
    }
    forwardValue4499_29_0 = super.a(((net.minecraft.item.ItemStack)(p0)), ((net.minecraft.block.Block)(p1)));
    break forward_join_29;
    }
    forwardValue4499_29_0 = ((moom.xR)(this)).o;
    }
    return forwardValue4499_29_0;
}

}
