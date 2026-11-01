package moom;


public class xS extends net.minecraft.item.ItemTool {

private static final java.util.Set<net.minecraft.block.Block> r;

private static final long s;

protected xS(moom.a4 p0) {
super(0x1.0000000000000p+1f, p0, moom.xS.r);
}


static {
s = ((long)(((moom._a)(moom._c.a(((long)(2746124441395988805L)), ((long)(-760243647956797867L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(93208054154359L)))));
    long local11_life6 = (moom.xS.s ^ 98294586708038L);
    javax.crypto.Cipher local1_life8;
    javax.crypto.Cipher __sourceSpill1678_10 = (local1_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1678_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1678_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1678_13 = new byte[8];
    (__sourceSpill1678_13)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local2_life14 = 1;
    while ((local2_life14 < 8)) {
        (__sourceSpill1678_13)[local2_life14] = ((byte) ((int) ((local11_life6 << (local2_life14 * 8)) >>> 56)));
        local2_life14 += 1;
    }
    byte[] __sourcePreallocation1678_15 = __sourceSpill1678_13;
    ((javax.crypto.Cipher)(__sourceSpill1678_10)).init(((int)(__sourceSpill1678_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1678_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1678_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local0_life18 = new long[20];
    int local4_life19 = 0;
    java.lang.String local5_life20;
    int local6_life22 = ((java.lang.String)((local5_life20 = "\ft[©å}î=Öü\"?Ï£èÅ.r;\004+»È:o°±Ïl\001.u\024ÀOèø²\0325ZJö»\bÄlÎ-u²«;¦°Ç¦ø\006¢½Îc&³Ï?Iwôì5&¢|xµÐ{kS\f\033å\027\001Õþ­lP4<©kBYE²:Ò^ÕJh®~'7`3)',0á\004\027"))).length();
    int local3_life23 = 0;
    do {
        java.lang.String __sourceSpill1678_24 = local5_life20;
        int __sourceSpill1678_25 = local3_life23;
        local3_life23 += 8;
        byte[] local7_life28 = ((java.lang.String)(((java.lang.String)(__sourceSpill1678_24)).substring(((int)(__sourceSpill1678_25)), ((int)(local3_life23))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1678_29 = local0_life18;
        int __sourceSpill1678_30 = local4_life19;
        local4_life19 += 1;
        long local8_life31 = (((((((((((long) (local7_life28)[0]) & 255L) << 56) | ((((long) (local7_life28)[1]) & 255L) << 48)) | ((((long) (local7_life28)[2]) & 255L) << 40)) | ((((long) (local7_life28)[3]) & 255L) << 32)) | ((((long) (local7_life28)[4]) & 255L) << 24)) | ((((long) (local7_life28)[5]) & 255L) << 16)) | ((((long) (local7_life28)[6]) & 255L) << 8)) | (((long) (local7_life28)[7]) & 255L));
        byte[] __sourceSpill1678_32 = new byte[8];
        (__sourceSpill1678_32)[0] = ((byte) ((int) (local8_life31 >>> 56)));
        (__sourceSpill1678_32)[1] = ((byte) ((int) (local8_life31 >>> 48)));
        (__sourceSpill1678_32)[2] = ((byte) ((int) (local8_life31 >>> 40)));
        (__sourceSpill1678_32)[3] = ((byte) ((int) (local8_life31 >>> 32)));
        (__sourceSpill1678_32)[4] = ((byte) ((int) (local8_life31 >>> 24)));
        (__sourceSpill1678_32)[5] = ((byte) ((int) (local8_life31 >>> 16)));
        (__sourceSpill1678_32)[6] = ((byte) ((int) (local8_life31 >>> 8)));
        (__sourceSpill1678_32)[7] = ((byte) ((int) local8_life31));
        javax.crypto.Cipher __sourceSpill1678_33 = local1_life8;
        byte[] local10_life35 = ((javax.crypto.Cipher)(__sourceSpill1678_33)).doFinal(((byte[])(__sourceSpill1678_32)));
        (__sourceSpill1678_29)[__sourceSpill1678_30] = (((((((((((long) (local10_life35)[0]) & 255L) << 56) | ((((long) (local10_life35)[1]) & 255L) << 48)) | ((((long) (local10_life35)[2]) & 255L) << 40)) | ((((long) (local10_life35)[3]) & 255L) << 32)) | ((((long) (local10_life35)[4]) & 255L) << 24)) | ((((long) (local10_life35)[5]) & 255L) << 16)) | ((((long) (local10_life35)[6]) & 255L) << 8)) | (((long) (local10_life35)[7]) & 255L));
    } while ((!(local3_life23 >= local6_life22)));
    local6_life22 = ((java.lang.String)((local5_life20 = "ßHIàiÇÕý®|÷@«&P"))).length();
    local3_life23 = 0;
    do {
        java.lang.String __sourceSpill1678_37 = local5_life20;
        int __sourceSpill1678_38 = local3_life23;
        local3_life23 += 8;
        byte[] local7_life41 = ((java.lang.String)(((java.lang.String)(__sourceSpill1678_37)).substring(((int)(__sourceSpill1678_38)), ((int)(local3_life23))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1678_42 = local0_life18;
        int __sourceSpill1678_43 = local4_life19;
        local4_life19 += 1;
        long local8_life44 = (((((((((((long) (local7_life41)[0]) & 255L) << 56) | ((((long) (local7_life41)[1]) & 255L) << 48)) | ((((long) (local7_life41)[2]) & 255L) << 40)) | ((((long) (local7_life41)[3]) & 255L) << 32)) | ((((long) (local7_life41)[4]) & 255L) << 24)) | ((((long) (local7_life41)[5]) & 255L) << 16)) | ((((long) (local7_life41)[6]) & 255L) << 8)) | (((long) (local7_life41)[7]) & 255L));
        byte[] __sourceSpill1678_45 = new byte[8];
        (__sourceSpill1678_45)[0] = ((byte) ((int) (local8_life44 >>> 56)));
        (__sourceSpill1678_45)[1] = ((byte) ((int) (local8_life44 >>> 48)));
        (__sourceSpill1678_45)[2] = ((byte) ((int) (local8_life44 >>> 40)));
        (__sourceSpill1678_45)[3] = ((byte) ((int) (local8_life44 >>> 32)));
        (__sourceSpill1678_45)[4] = ((byte) ((int) (local8_life44 >>> 24)));
        (__sourceSpill1678_45)[5] = ((byte) ((int) (local8_life44 >>> 16)));
        (__sourceSpill1678_45)[6] = ((byte) ((int) (local8_life44 >>> 8)));
        (__sourceSpill1678_45)[7] = ((byte) ((int) local8_life44));
        javax.crypto.Cipher __sourceSpill1678_46 = local1_life8;
        byte[] local10_life48 = ((javax.crypto.Cipher)(__sourceSpill1678_46)).doFinal(((byte[])(__sourceSpill1678_45)));
        (__sourceSpill1678_42)[__sourceSpill1678_43] = (((((((((((long) (local10_life48)[0]) & 255L) << 56) | ((((long) (local10_life48)[1]) & 255L) << 48)) | ((((long) (local10_life48)[2]) & 255L) << 40)) | ((((long) (local10_life48)[3]) & 255L) << 32)) | ((((long) (local10_life48)[4]) & 255L) << 24)) | ((((long) (local10_life48)[5]) & 255L) << 16)) | ((((long) (local10_life48)[6]) & 255L) << 8)) | (((long) (local10_life48)[7]) & 255L));
    } while ((!(local3_life23 >= local6_life22)));
    net.minecraft.block.Block[] __sourceSpill1678_50 = new net.minecraft.block.Block[((int) (local0_life18)[0])];
    (__sourceSpill1678_50)[0] = net.minecraft.init.Blocks.b7;
    (__sourceSpill1678_50)[1] = net.minecraft.init.Blocks.q;
    (__sourceSpill1678_50)[2] = net.minecraft.init.Blocks.e;
    (__sourceSpill1678_50)[3] = net.minecraft.init.Blocks.E;
    (__sourceSpill1678_50)[4] = net.minecraft.init.Blocks.ah;
    (__sourceSpill1678_50)[5] = net.minecraft.init.Blocks.ag;
    (__sourceSpill1678_50)[((int) (local0_life18)[5])] = net.minecraft.init.Blocks.T;
    (__sourceSpill1678_50)[((int) (local0_life18)[8])] = net.minecraft.init.Blocks.D;
    (__sourceSpill1678_50)[((int) (local0_life18)[15])] = net.minecraft.init.Blocks.R;
    (__sourceSpill1678_50)[((int) (local0_life18)[18])] = net.minecraft.init.Blocks.o;
    (__sourceSpill1678_50)[((int) (local0_life18)[1])] = net.minecraft.init.Blocks.aI;
    (__sourceSpill1678_50)[((int) (local0_life18)[12])] = net.minecraft.init.Blocks.S;
    (__sourceSpill1678_50)[((int) (local0_life18)[13])] = net.minecraft.init.Blocks.p;
    (__sourceSpill1678_50)[((int) (local0_life18)[9])] = net.minecraft.init.Blocks.y;
    (__sourceSpill1678_50)[((int) (local0_life18)[17])] = net.minecraft.init.Blocks.x;
    (__sourceSpill1678_50)[((int) (local0_life18)[6])] = net.minecraft.init.Blocks.aD;
    (__sourceSpill1678_50)[((int) (local0_life18)[11])] = net.minecraft.init.Blocks.Y;
    (__sourceSpill1678_50)[((int) (local0_life18)[10])] = net.minecraft.init.Blocks.aV;
    (__sourceSpill1678_50)[((int) (local0_life18)[19])] = net.minecraft.init.Blocks.cf;
    (__sourceSpill1678_50)[((int) (local0_life18)[4])] = net.minecraft.init.Blocks.av;
    (__sourceSpill1678_50)[((int) (local0_life18)[16])] = net.minecraft.init.Blocks.aC;
    (__sourceSpill1678_50)[((int) (local0_life18)[2])] = net.minecraft.init.Blocks.A;
    (__sourceSpill1678_50)[((int) (local0_life18)[7])] = net.minecraft.init.Blocks.cq;
    (__sourceSpill1678_50)[((int) (local0_life18)[14])] = net.minecraft.init.Blocks.b;
    (__sourceSpill1678_50)[((int) (local0_life18)[3])] = net.minecraft.init.Blocks.U;
    r = ((java.util.Set)(com.google.common.collect.Sets.newHashSet(((java.lang.Object[])(__sourceSpill1678_50)))));
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public boolean a__Boolean(net.minecraft.block.Block p0) {
int forwardValue4501_21_0;
    net.minecraft.block.Block forwardValue4501_24_0;
    net.minecraft.block.Block forwardValue4501_24_1;
    net.minecraft.block.Block forwardValue4501_29_0;
    net.minecraft.block.Block forwardValue4501_29_1;
    net.minecraft.block.Block forwardValue4501_34_0;
    net.minecraft.block.Block forwardValue4501_34_1;
    net.minecraft.block.Block forwardValue4501_39_0;
    net.minecraft.block.Block forwardValue4501_39_1;
    net.minecraft.block.Block forwardValue4501_44_0;
    net.minecraft.block.Block forwardValue4501_44_1;
    net.minecraft.block.Block forwardValue4501_49_0;
    net.minecraft.block.Block forwardValue4501_49_1;
    net.minecraft.block.Block forwardValue4501_54_0;
    net.minecraft.block.Block forwardValue4501_54_1;
    net.minecraft.block.Block forwardValue4501_59_0;
    net.minecraft.block.Block forwardValue4501_59_1;
    net.minecraft.block.Block forwardValue4501_64_0;
    net.minecraft.block.Block forwardValue4501_64_1;
    net.minecraft.block.Block forwardValue4501_69_0;
    net.minecraft.block.Block forwardValue4501_69_1;
    net.minecraft.block.Block forwardValue4501_74_0;
    net.minecraft.block.Block forwardValue4501_74_1;
    net.minecraft.block.Block forwardValue4501_81_0;
    net.minecraft.block.Block forwardValue4501_81_1;
    net.minecraft.block.Block forwardValue4501_83_0;
    moom.fn forwardValue4501_91_0;
    moom.fn forwardValue4501_91_1;
    moom.fn forwardValue4501_97_0;
    moom.fn forwardValue4501_97_1;
    int forwardValue4501_112_0;
    int forwardValue4501_123_0;
    int forwardValue4501_134_0;
    int forwardValue4501_145_0;
    int forwardValue4501_156_0;
    int forwardValue4501_165_0;
    int forwardValue4501_167_0;
    net.minecraft.block.Block spill4501_0;
    net.minecraft.block.Block spill4501_1;
    int spill4501_2;
    net.minecraft.block.Block spill4501_3;
    moom.fn spill4501_4;
    moom.fn spill4501_5;
    int spill4501_6;
    int spill4501_7;
    int spill4501_8;
    int spill4501_9;
    int spill4501_10;
    int spill4501_11;
    long life2_3;
    int life4_5;
    forward_join_167: {
    forward_join_166: {
    forward_join_165: {
    forward_join_157: {
    forward_join_156: {
    forward_join_155: {
    forward_join_146: {
    forward_join_145: {
    forward_join_144: {
    forward_join_135: {
    forward_join_134: {
    forward_join_133: {
    forward_join_124: {
    forward_join_123: {
    forward_join_122: {
    forward_join_113: {
    forward_join_112: {
    forward_join_111: {
    forward_join_102: {
    forward_join_100: {
    forward_join_98: {
    forward_join_97: {
    forward_join_91: {
    forward_join_83: {
    forward_join_81: {
    forward_join_74: {
    forward_join_69: {
    forward_join_64: {
    forward_join_59: {
    forward_join_54: {
    forward_join_49: {
    forward_join_44: {
    forward_join_39: {
    forward_join_34: {
    forward_join_29: {
    forward_join_24: {
    forward_join_22: {
    forward_join_21: {
    forward_join_20: {
    life2_3 = (moom.xS.s ^ 30527790010242L);
    life4_5 = ((net.minecraft.item.ItemStack.l()) ? 1 : 0);
    spill4501_0 = p0;
    spill4501_1 = net.minecraft.init.Blocks.Z;
    if (!((life4_5 == 0))) {
        forwardValue4501_24_0 = spill4501_0;
        forwardValue4501_24_1 = spill4501_1;
        break forward_join_24;
    }
    if (!((spill4501_0 == spill4501_1))) {
        break forward_join_22;
    }
    spill4501_2 = ((moom.a4)(((moom.xS)(this)).q)).b__Int();
    if (!((life4_5 == 0))) {
        forwardValue4501_21_0 = spill4501_2;
        break forward_join_21;
    }
    if (!((spill4501_2 == 3))) {
        break forward_join_20;
    }
    forwardValue4501_167_0 = 1;
    break forward_join_167;
    }
    forwardValue4501_21_0 = 0;
    }
    forwardValue4501_167_0 = forwardValue4501_21_0;
    break forward_join_167;
    }
    forwardValue4501_24_0 = p0;
    forwardValue4501_24_1 = net.minecraft.init.Blocks.ah;
    }
    if (!((life4_5 == 0))) {
        forwardValue4501_29_0 = forwardValue4501_24_0;
        forwardValue4501_29_1 = forwardValue4501_24_1;
        break forward_join_29;
    }
    if (!((forwardValue4501_24_0 != forwardValue4501_24_1))) {
        break forward_join_157;
    }
    forwardValue4501_29_0 = p0;
    forwardValue4501_29_1 = net.minecraft.init.Blocks.ag;
    }
    if (!((life4_5 == 0))) {
        forwardValue4501_34_0 = forwardValue4501_29_0;
        forwardValue4501_34_1 = forwardValue4501_29_1;
        break forward_join_34;
    }
    if (!((forwardValue4501_29_0 != forwardValue4501_29_1))) {
        break forward_join_157;
    }
    forwardValue4501_34_0 = p0;
    forwardValue4501_34_1 = net.minecraft.init.Blocks.bE;
    }
    if (!((life4_5 == 0))) {
        forwardValue4501_39_0 = forwardValue4501_34_0;
        forwardValue4501_39_1 = forwardValue4501_34_1;
        break forward_join_39;
    }
    if (!((forwardValue4501_34_0 != forwardValue4501_34_1))) {
        break forward_join_146;
    }
    forwardValue4501_39_0 = p0;
    forwardValue4501_39_1 = net.minecraft.init.Blocks.bI;
    }
    if (!((life4_5 == 0))) {
        forwardValue4501_44_0 = forwardValue4501_39_0;
        forwardValue4501_44_1 = forwardValue4501_39_1;
        break forward_join_44;
    }
    if (!((forwardValue4501_39_0 != forwardValue4501_39_1))) {
        break forward_join_146;
    }
    forwardValue4501_44_0 = p0;
    forwardValue4501_44_1 = net.minecraft.init.Blocks.R;
    }
    if (!((life4_5 == 0))) {
        forwardValue4501_49_0 = forwardValue4501_44_0;
        forwardValue4501_49_1 = forwardValue4501_44_1;
        break forward_join_49;
    }
    if (!((forwardValue4501_44_0 != forwardValue4501_44_1))) {
        break forward_join_135;
    }
    forwardValue4501_49_0 = p0;
    forwardValue4501_49_1 = net.minecraft.init.Blocks.o;
    }
    if (!((life4_5 == 0))) {
        forwardValue4501_54_0 = forwardValue4501_49_0;
        forwardValue4501_54_1 = forwardValue4501_49_1;
        break forward_join_54;
    }
    if (!((forwardValue4501_49_0 != forwardValue4501_49_1))) {
        break forward_join_135;
    }
    forwardValue4501_54_0 = p0;
    forwardValue4501_54_1 = net.minecraft.init.Blocks.S;
    }
    if (!((life4_5 == 0))) {
        forwardValue4501_59_0 = forwardValue4501_54_0;
        forwardValue4501_59_1 = forwardValue4501_54_1;
        break forward_join_59;
    }
    if (!((forwardValue4501_54_0 != forwardValue4501_54_1))) {
        break forward_join_124;
    }
    forwardValue4501_59_0 = p0;
    forwardValue4501_59_1 = net.minecraft.init.Blocks.p;
    }
    if (!((life4_5 == 0))) {
        forwardValue4501_64_0 = forwardValue4501_59_0;
        forwardValue4501_64_1 = forwardValue4501_59_1;
        break forward_join_64;
    }
    if (!((forwardValue4501_59_0 != forwardValue4501_59_1))) {
        break forward_join_124;
    }
    forwardValue4501_64_0 = p0;
    forwardValue4501_64_1 = net.minecraft.init.Blocks.y;
    }
    if (!((life4_5 == 0))) {
        forwardValue4501_69_0 = forwardValue4501_64_0;
        forwardValue4501_69_1 = forwardValue4501_64_1;
        break forward_join_69;
    }
    if (!((forwardValue4501_64_0 != forwardValue4501_64_1))) {
        break forward_join_113;
    }
    forwardValue4501_69_0 = p0;
    forwardValue4501_69_1 = net.minecraft.init.Blocks.x;
    }
    if (!((life4_5 == 0))) {
        forwardValue4501_74_0 = forwardValue4501_69_0;
        forwardValue4501_74_1 = forwardValue4501_69_1;
        break forward_join_74;
    }
    if (!((forwardValue4501_69_0 != forwardValue4501_69_1))) {
        break forward_join_113;
    }
    forwardValue4501_74_0 = p0;
    forwardValue4501_74_1 = net.minecraft.init.Blocks.aC;
    }
    if (!((life4_5 == 0))) {
        forwardValue4501_81_0 = forwardValue4501_74_0;
        forwardValue4501_81_1 = forwardValue4501_74_1;
        break forward_join_81;
    }
    if (!((forwardValue4501_74_0 != forwardValue4501_74_1))) {
        break forward_join_102;
    }
    spill4501_3 = p0;
    if (!((life4_5 == 0))) {
        forwardValue4501_83_0 = spill4501_3;
        break forward_join_83;
    }
    forwardValue4501_81_0 = spill4501_3;
    forwardValue4501_81_1 = net.minecraft.init.Blocks.aD;
    }
    if (!((forwardValue4501_81_0 != forwardValue4501_81_1))) {
        break forward_join_102;
    }
    forwardValue4501_83_0 = p0;
    }
    spill4501_4 = ((net.minecraft.block.Block)(forwardValue4501_83_0)).a__fn();
    spill4501_5 = moom.fn.e;
    if (!((life4_5 == 0))) {
        forwardValue4501_91_0 = spill4501_4;
        forwardValue4501_91_1 = spill4501_5;
        break forward_join_91;
    }
    if (!((spill4501_4 != spill4501_5))) {
        break forward_join_98;
    }
    forwardValue4501_91_0 = ((net.minecraft.block.Block)(p0)).a__fn();
    forwardValue4501_91_1 = moom.fn.f;
    }
    if (!((life4_5 == 0))) {
        forwardValue4501_97_0 = forwardValue4501_91_0;
        forwardValue4501_97_1 = forwardValue4501_91_1;
        break forward_join_97;
    }
    if (!((forwardValue4501_91_0 != forwardValue4501_91_1))) {
        break forward_join_98;
    }
    forwardValue4501_97_0 = ((net.minecraft.block.Block)(p0)).a__fn();
    forwardValue4501_97_1 = moom.fn.g;
    }
    if (!((forwardValue4501_97_0 == forwardValue4501_97_1))) {
        break forward_join_100;
    }
    }
    forwardValue4501_167_0 = 1;
    break forward_join_167;
    }
    forwardValue4501_167_0 = 0;
    break forward_join_167;
    }
    spill4501_6 = ((moom.a4)(((moom.xS)(this)).q)).b__Int();
    if (!((life4_5 == 0))) {
        forwardValue4501_112_0 = spill4501_6;
        break forward_join_112;
    }
    if (!((spill4501_6 >= 2))) {
        break forward_join_111;
    }
    forwardValue4501_167_0 = 1;
    break forward_join_167;
    }
    forwardValue4501_112_0 = 0;
    }
    forwardValue4501_167_0 = forwardValue4501_112_0;
    break forward_join_167;
    }
    spill4501_7 = ((moom.a4)(((moom.xS)(this)).q)).b__Int();
    if (!((life4_5 == 0))) {
        forwardValue4501_123_0 = spill4501_7;
        break forward_join_123;
    }
    if (!((spill4501_7 >= 1))) {
        break forward_join_122;
    }
    forwardValue4501_167_0 = 1;
    break forward_join_167;
    }
    forwardValue4501_123_0 = 0;
    }
    forwardValue4501_167_0 = forwardValue4501_123_0;
    break forward_join_167;
    }
    spill4501_8 = ((moom.a4)(((moom.xS)(this)).q)).b__Int();
    if (!((life4_5 == 0))) {
        forwardValue4501_134_0 = spill4501_8;
        break forward_join_134;
    }
    if (!((spill4501_8 >= 1))) {
        break forward_join_133;
    }
    forwardValue4501_167_0 = 1;
    break forward_join_167;
    }
    forwardValue4501_134_0 = 0;
    }
    forwardValue4501_167_0 = forwardValue4501_134_0;
    break forward_join_167;
    }
    spill4501_9 = ((moom.a4)(((moom.xS)(this)).q)).b__Int();
    if (!((life4_5 == 0))) {
        forwardValue4501_145_0 = spill4501_9;
        break forward_join_145;
    }
    if (!((spill4501_9 >= 2))) {
        break forward_join_144;
    }
    forwardValue4501_167_0 = 1;
    break forward_join_167;
    }
    forwardValue4501_145_0 = 0;
    }
    forwardValue4501_167_0 = forwardValue4501_145_0;
    break forward_join_167;
    }
    spill4501_10 = ((moom.a4)(((moom.xS)(this)).q)).b__Int();
    if (!((life4_5 == 0))) {
        forwardValue4501_156_0 = spill4501_10;
        break forward_join_156;
    }
    if (!((spill4501_10 >= 2))) {
        break forward_join_155;
    }
    forwardValue4501_167_0 = 1;
    break forward_join_167;
    }
    forwardValue4501_156_0 = 0;
    }
    forwardValue4501_167_0 = forwardValue4501_156_0;
    break forward_join_167;
    }
    spill4501_11 = ((moom.a4)(((moom.xS)(this)).q)).b__Int();
    if (!((life4_5 == 0))) {
        forwardValue4501_165_0 = spill4501_11;
        break forward_join_165;
    }
    if (!((spill4501_11 >= 2))) {
        break forward_join_166;
    }
    forwardValue4501_165_0 = 1;
    }
    forwardValue4501_167_0 = forwardValue4501_165_0;
    break forward_join_167;
    }
    forwardValue4501_167_0 = 0;
    }
    return ((forwardValue4501_167_0) != 0);
}


public float a(net.minecraft.item.ItemStack p0, net.minecraft.block.Block p1) {
moom.fn forwardValue4500_15_0;
    moom.fn forwardValue4500_15_1;
    moom.fn forwardValue4500_21_0;
    moom.fn forwardValue4500_21_1;
    float forwardValue4500_29_0;
    moom.fn spill4500_0;
    moom.fn spill4500_1;
    long life3_3;
    int life5_5;
    forward_join_29: {
    forward_join_27: {
    forward_join_21: {
    forward_join_15: {
    life3_3 = (moom.xS.s ^ 50946836040254L);
    life5_5 = ((net.minecraft.item.ItemStack.l()) ? 1 : 0);
    spill4500_0 = ((net.minecraft.block.Block)(p1)).a__fn();
    spill4500_1 = moom.fn.f;
    if (!((life5_5 == 0))) {
        forwardValue4500_15_0 = spill4500_0;
        forwardValue4500_15_1 = spill4500_1;
        break forward_join_15;
    }
    if (!((spill4500_0 != spill4500_1))) {
        break forward_join_27;
    }
    forwardValue4500_15_0 = ((net.minecraft.block.Block)(p1)).a__fn();
    forwardValue4500_15_1 = moom.fn.g;
    }
    if (!((life5_5 == 0))) {
        forwardValue4500_21_0 = forwardValue4500_15_0;
        forwardValue4500_21_1 = forwardValue4500_15_1;
        break forward_join_21;
    }
    if (!((forwardValue4500_15_0 != forwardValue4500_15_1))) {
        break forward_join_27;
    }
    forwardValue4500_21_0 = ((net.minecraft.block.Block)(p1)).a__fn();
    forwardValue4500_21_1 = moom.fn.e;
    }
    if (!((forwardValue4500_21_0 != forwardValue4500_21_1))) {
        break forward_join_27;
    }
    forwardValue4500_29_0 = super.a(((net.minecraft.item.ItemStack)(p0)), ((net.minecraft.block.Block)(p1)));
    break forward_join_29;
    }
    forwardValue4500_29_0 = ((moom.xS)(this)).o;
    }
    return forwardValue4500_29_0;
}

}
