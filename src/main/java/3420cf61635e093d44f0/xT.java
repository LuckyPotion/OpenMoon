package moom;


public class xT extends net.minecraft.item.ItemTool {

private static final java.util.Set<net.minecraft.block.Block> r;

private static final long s;

public xT(moom.a4 p0) {
super(0x1.0000000000000p+0f, p0, moom.xT.r);
}


static {
s = ((long)(((moom._a)(moom._c.a(((long)(-8350303651628900871L)), ((long)(-3198946716331442656L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(217468302506995L)))));
    long local11_life6 = (moom.xT.s ^ 83470697955789L);
    javax.crypto.Cipher local1_life8;
    javax.crypto.Cipher __sourceSpill1679_10 = (local1_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1679_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1679_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1679_13 = new byte[8];
    (__sourceSpill1679_13)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local2_life14 = 1;
    while ((local2_life14 < 8)) {
        (__sourceSpill1679_13)[local2_life14] = ((byte) ((int) ((local11_life6 << (local2_life14 * 8)) >>> 56)));
        local2_life14 += 1;
    }
    byte[] __sourcePreallocation1679_15 = __sourceSpill1679_13;
    ((javax.crypto.Cipher)(__sourceSpill1679_10)).init(((int)(__sourceSpill1679_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1679_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1679_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local0_life18 = new long[5];
    int local4_life19 = 0;
    java.lang.String local5_life20;
    int local6_life22 = ((java.lang.String)((local5_life20 = "Ö÷\026]<UN\016\031\027ñ¤è§¹ U½°*t"))).length();
    int local3_life23 = 0;
    do {
        java.lang.String __sourceSpill1679_24 = local5_life20;
        int __sourceSpill1679_25 = local3_life23;
        local3_life23 += 8;
        byte[] local7_life28 = ((java.lang.String)(((java.lang.String)(__sourceSpill1679_24)).substring(((int)(__sourceSpill1679_25)), ((int)(local3_life23))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1679_29 = local0_life18;
        int __sourceSpill1679_30 = local4_life19;
        local4_life19 += 1;
        long local8_life31 = (((((((((((long) (local7_life28)[0]) & 255L) << 56) | ((((long) (local7_life28)[1]) & 255L) << 48)) | ((((long) (local7_life28)[2]) & 255L) << 40)) | ((((long) (local7_life28)[3]) & 255L) << 32)) | ((((long) (local7_life28)[4]) & 255L) << 24)) | ((((long) (local7_life28)[5]) & 255L) << 16)) | ((((long) (local7_life28)[6]) & 255L) << 8)) | (((long) (local7_life28)[7]) & 255L));
        byte[] __sourceSpill1679_32 = new byte[8];
        (__sourceSpill1679_32)[0] = ((byte) ((int) (local8_life31 >>> 56)));
        (__sourceSpill1679_32)[1] = ((byte) ((int) (local8_life31 >>> 48)));
        (__sourceSpill1679_32)[2] = ((byte) ((int) (local8_life31 >>> 40)));
        (__sourceSpill1679_32)[3] = ((byte) ((int) (local8_life31 >>> 32)));
        (__sourceSpill1679_32)[4] = ((byte) ((int) (local8_life31 >>> 24)));
        (__sourceSpill1679_32)[5] = ((byte) ((int) (local8_life31 >>> 16)));
        (__sourceSpill1679_32)[6] = ((byte) ((int) (local8_life31 >>> 8)));
        (__sourceSpill1679_32)[7] = ((byte) ((int) local8_life31));
        javax.crypto.Cipher __sourceSpill1679_33 = local1_life8;
        byte[] local10_life35 = ((javax.crypto.Cipher)(__sourceSpill1679_33)).doFinal(((byte[])(__sourceSpill1679_32)));
        (__sourceSpill1679_29)[__sourceSpill1679_30] = (((((((((((long) (local10_life35)[0]) & 255L) << 56) | ((((long) (local10_life35)[1]) & 255L) << 48)) | ((((long) (local10_life35)[2]) & 255L) << 40)) | ((((long) (local10_life35)[3]) & 255L) << 32)) | ((((long) (local10_life35)[4]) & 255L) << 24)) | ((((long) (local10_life35)[5]) & 255L) << 16)) | ((((long) (local10_life35)[6]) & 255L) << 8)) | (((long) (local10_life35)[7]) & 255L));
    } while ((!(local3_life23 >= local6_life22)));
    local6_life22 = ((java.lang.String)((local5_life20 = "gb\007á#nÄµ´WÉ7Â¯æç"))).length();
    local3_life23 = 0;
    do {
        java.lang.String __sourceSpill1679_37 = local5_life20;
        int __sourceSpill1679_38 = local3_life23;
        local3_life23 += 8;
        byte[] local7_life41 = ((java.lang.String)(((java.lang.String)(__sourceSpill1679_37)).substring(((int)(__sourceSpill1679_38)), ((int)(local3_life23))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1679_42 = local0_life18;
        int __sourceSpill1679_43 = local4_life19;
        local4_life19 += 1;
        long local8_life44 = (((((((((((long) (local7_life41)[0]) & 255L) << 56) | ((((long) (local7_life41)[1]) & 255L) << 48)) | ((((long) (local7_life41)[2]) & 255L) << 40)) | ((((long) (local7_life41)[3]) & 255L) << 32)) | ((((long) (local7_life41)[4]) & 255L) << 24)) | ((((long) (local7_life41)[5]) & 255L) << 16)) | ((((long) (local7_life41)[6]) & 255L) << 8)) | (((long) (local7_life41)[7]) & 255L));
        byte[] __sourceSpill1679_45 = new byte[8];
        (__sourceSpill1679_45)[0] = ((byte) ((int) (local8_life44 >>> 56)));
        (__sourceSpill1679_45)[1] = ((byte) ((int) (local8_life44 >>> 48)));
        (__sourceSpill1679_45)[2] = ((byte) ((int) (local8_life44 >>> 40)));
        (__sourceSpill1679_45)[3] = ((byte) ((int) (local8_life44 >>> 32)));
        (__sourceSpill1679_45)[4] = ((byte) ((int) (local8_life44 >>> 24)));
        (__sourceSpill1679_45)[5] = ((byte) ((int) (local8_life44 >>> 16)));
        (__sourceSpill1679_45)[6] = ((byte) ((int) (local8_life44 >>> 8)));
        (__sourceSpill1679_45)[7] = ((byte) ((int) local8_life44));
        javax.crypto.Cipher __sourceSpill1679_46 = local1_life8;
        byte[] local10_life48 = ((javax.crypto.Cipher)(__sourceSpill1679_46)).doFinal(((byte[])(__sourceSpill1679_45)));
        (__sourceSpill1679_42)[__sourceSpill1679_43] = (((((((((((long) (local10_life48)[0]) & 255L) << 56) | ((((long) (local10_life48)[1]) & 255L) << 48)) | ((((long) (local10_life48)[2]) & 255L) << 40)) | ((((long) (local10_life48)[3]) & 255L) << 32)) | ((((long) (local10_life48)[4]) & 255L) << 24)) | ((((long) (local10_life48)[5]) & 255L) << 16)) | ((((long) (local10_life48)[6]) & 255L) << 8)) | (((long) (local10_life48)[7]) & 255L));
    } while ((!(local3_life23 >= local6_life22)));
    net.minecraft.block.Block[] __sourceSpill1679_50 = new net.minecraft.block.Block[((int) (local0_life18)[3])];
    (__sourceSpill1679_50)[0] = net.minecraft.init.Blocks.aL;
    (__sourceSpill1679_50)[1] = net.minecraft.init.Blocks.d;
    (__sourceSpill1679_50)[2] = net.minecraft.init.Blocks.ak;
    (__sourceSpill1679_50)[3] = net.minecraft.init.Blocks.c;
    (__sourceSpill1679_50)[4] = net.minecraft.init.Blocks.n;
    (__sourceSpill1679_50)[5] = net.minecraft.init.Blocks.bl;
    (__sourceSpill1679_50)[((int) (local0_life18)[4])] = net.minecraft.init.Blocks.m;
    (__sourceSpill1679_50)[((int) (local0_life18)[1])] = net.minecraft.init.Blocks.aJ;
    (__sourceSpill1679_50)[((int) (local0_life18)[2])] = net.minecraft.init.Blocks.aH;
    (__sourceSpill1679_50)[((int) (local0_life18)[0])] = net.minecraft.init.Blocks.aW;
    r = ((java.util.Set)(com.google.common.collect.Sets.newHashSet(((java.lang.Object[])(__sourceSpill1679_50)))));
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public boolean a__Boolean(net.minecraft.block.Block p0) {
net.minecraft.block.Block forwardValue4502_13_0;
    net.minecraft.block.Block forwardValue4502_13_1;
    int forwardValue4502_17_0;
    net.minecraft.block.Block spill4502_0;
    net.minecraft.block.Block spill4502_1;
    long life2_3;
    int life4_5;
    forward_join_17: {
    forward_join_16: {
    forward_join_14: {
    forward_join_13: {
    life2_3 = (moom.xT.s ^ 5909317807159L);
    life4_5 = ((net.minecraft.item.ItemStack.m()) ? 1 : 0);
    spill4502_0 = p0;
    spill4502_1 = net.minecraft.init.Blocks.aH;
    if (!((life4_5 != 0))) {
        forwardValue4502_13_0 = spill4502_0;
        forwardValue4502_13_1 = spill4502_1;
        break forward_join_13;
    }
    if (!((spill4502_0 != spill4502_1))) {
        break forward_join_14;
    }
    forwardValue4502_13_0 = p0;
    forwardValue4502_13_1 = net.minecraft.init.Blocks.aJ;
    }
    if (!((forwardValue4502_13_0 == forwardValue4502_13_1))) {
        break forward_join_16;
    }
    }
    forwardValue4502_17_0 = 1;
    break forward_join_17;
    }
    forwardValue4502_17_0 = 0;
    }
    return ((forwardValue4502_17_0) != 0);
}

}
