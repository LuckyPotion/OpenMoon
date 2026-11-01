package net.minecraft.world.gen.structure;


public class StructureNetherBridgePieces {

private static final moom.If[] a;

private static final moom.If[] b;

private static final long c;

public StructureNetherBridgePieces() {
super();
}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(3933451808294281240L)), ((long)(5552377515656787493L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(38203636758126L)))));
    long local11_life6 = (net.minecraft.world.gen.structure.StructureNetherBridgePieces.c ^ 92976787569032L);
    javax.crypto.Cipher local1_life8;
    javax.crypto.Cipher __sourceSpill1957_10 = (local1_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1957_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1957_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1957_13 = new byte[8];
    (__sourceSpill1957_13)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local2_life14 = 1;
    while ((local2_life14 < 8)) {
        (__sourceSpill1957_13)[local2_life14] = ((byte) ((int) ((local11_life6 << (local2_life14 * 8)) >>> 56)));
        local2_life14 += 1;
    }
    byte[] __sourcePreallocation1957_15 = __sourceSpill1957_13;
    ((javax.crypto.Cipher)(__sourceSpill1957_10)).init(((int)(__sourceSpill1957_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1957_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1957_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local0_life18 = new long[9];
    int local4_life19 = 0;
    java.lang.String local5_life20;
    int local6_life22 = ((java.lang.String)((local5_life20 = "-í;ìÈmÕ|ùûXÊ\033ÎÄ\022\030Äü°>yÎ%x\013·oo/5\036\021Üv;!¸ª\0225^ª"))).length();
    int local3_life23 = 0;
    do {
        java.lang.String __sourceSpill1957_24 = local5_life20;
        int __sourceSpill1957_25 = local3_life23;
        local3_life23 += 8;
        byte[] local7_life28 = ((java.lang.String)(((java.lang.String)(__sourceSpill1957_24)).substring(((int)(__sourceSpill1957_25)), ((int)(local3_life23))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1957_29 = local0_life18;
        int __sourceSpill1957_30 = local4_life19;
        local4_life19 += 1;
        long local8_life31 = (((((((((((long) (local7_life28)[0]) & 255L) << 56) | ((((long) (local7_life28)[1]) & 255L) << 48)) | ((((long) (local7_life28)[2]) & 255L) << 40)) | ((((long) (local7_life28)[3]) & 255L) << 32)) | ((((long) (local7_life28)[4]) & 255L) << 24)) | ((((long) (local7_life28)[5]) & 255L) << 16)) | ((((long) (local7_life28)[6]) & 255L) << 8)) | (((long) (local7_life28)[7]) & 255L));
        byte[] __sourceSpill1957_32 = new byte[8];
        (__sourceSpill1957_32)[0] = ((byte) ((int) (local8_life31 >>> 56)));
        (__sourceSpill1957_32)[1] = ((byte) ((int) (local8_life31 >>> 48)));
        (__sourceSpill1957_32)[2] = ((byte) ((int) (local8_life31 >>> 40)));
        (__sourceSpill1957_32)[3] = ((byte) ((int) (local8_life31 >>> 32)));
        (__sourceSpill1957_32)[4] = ((byte) ((int) (local8_life31 >>> 24)));
        (__sourceSpill1957_32)[5] = ((byte) ((int) (local8_life31 >>> 16)));
        (__sourceSpill1957_32)[6] = ((byte) ((int) (local8_life31 >>> 8)));
        (__sourceSpill1957_32)[7] = ((byte) ((int) local8_life31));
        javax.crypto.Cipher __sourceSpill1957_33 = local1_life8;
        byte[] local10_life35 = ((javax.crypto.Cipher)(__sourceSpill1957_33)).doFinal(((byte[])(__sourceSpill1957_32)));
        (__sourceSpill1957_29)[__sourceSpill1957_30] = (((((((((((long) (local10_life35)[0]) & 255L) << 56) | ((((long) (local10_life35)[1]) & 255L) << 48)) | ((((long) (local10_life35)[2]) & 255L) << 40)) | ((((long) (local10_life35)[3]) & 255L) << 32)) | ((((long) (local10_life35)[4]) & 255L) << 24)) | ((((long) (local10_life35)[5]) & 255L) << 16)) | ((((long) (local10_life35)[6]) & 255L) << 8)) | (((long) (local10_life35)[7]) & 255L));
    } while ((!(local3_life23 >= local6_life22)));
    local6_life22 = ((java.lang.String)((local5_life20 = "Ûð+\032J\006*åOo27F(Ü="))).length();
    local3_life23 = 0;
    do {
        java.lang.String __sourceSpill1957_37 = local5_life20;
        int __sourceSpill1957_38 = local3_life23;
        local3_life23 += 8;
        byte[] local7_life41 = ((java.lang.String)(((java.lang.String)(__sourceSpill1957_37)).substring(((int)(__sourceSpill1957_38)), ((int)(local3_life23))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1957_42 = local0_life18;
        int __sourceSpill1957_43 = local4_life19;
        local4_life19 += 1;
        long local8_life44 = (((((((((((long) (local7_life41)[0]) & 255L) << 56) | ((((long) (local7_life41)[1]) & 255L) << 48)) | ((((long) (local7_life41)[2]) & 255L) << 40)) | ((((long) (local7_life41)[3]) & 255L) << 32)) | ((((long) (local7_life41)[4]) & 255L) << 24)) | ((((long) (local7_life41)[5]) & 255L) << 16)) | ((((long) (local7_life41)[6]) & 255L) << 8)) | (((long) (local7_life41)[7]) & 255L));
        byte[] __sourceSpill1957_45 = new byte[8];
        (__sourceSpill1957_45)[0] = ((byte) ((int) (local8_life44 >>> 56)));
        (__sourceSpill1957_45)[1] = ((byte) ((int) (local8_life44 >>> 48)));
        (__sourceSpill1957_45)[2] = ((byte) ((int) (local8_life44 >>> 40)));
        (__sourceSpill1957_45)[3] = ((byte) ((int) (local8_life44 >>> 32)));
        (__sourceSpill1957_45)[4] = ((byte) ((int) (local8_life44 >>> 24)));
        (__sourceSpill1957_45)[5] = ((byte) ((int) (local8_life44 >>> 16)));
        (__sourceSpill1957_45)[6] = ((byte) ((int) (local8_life44 >>> 8)));
        (__sourceSpill1957_45)[7] = ((byte) ((int) local8_life44));
        javax.crypto.Cipher __sourceSpill1957_46 = local1_life8;
        byte[] local10_life48 = ((javax.crypto.Cipher)(__sourceSpill1957_46)).doFinal(((byte[])(__sourceSpill1957_45)));
        (__sourceSpill1957_42)[__sourceSpill1957_43] = (((((((((((long) (local10_life48)[0]) & 255L) << 56) | ((((long) (local10_life48)[1]) & 255L) << 48)) | ((((long) (local10_life48)[2]) & 255L) << 40)) | ((((long) (local10_life48)[3]) & 255L) << 32)) | ((((long) (local10_life48)[4]) & 255L) << 24)) | ((((long) (local10_life48)[5]) & 255L) << 16)) | ((((long) (local10_life48)[6]) & 255L) << 8)) | (((long) (local10_life48)[7]) & 255L));
    } while ((!(local3_life23 >= local6_life22)));
    moom.If[] __sourceSpill1957_50 = new moom.If[((int) (local0_life18)[3])];
    (__sourceSpill1957_50)[0] = new moom.If(moom.Hq.class, ((int) (local0_life18)[0]), 0, true);
    (__sourceSpill1957_50)[1] = new moom.If(moom.Hk.class, ((int) (local0_life18)[5]), 4);
    (__sourceSpill1957_50)[2] = new moom.If(moom.Hi.class, ((int) (local0_life18)[8]), 4);
    (__sourceSpill1957_50)[3] = new moom.If(moom.Hp.class, ((int) (local0_life18)[8]), 3);
    (__sourceSpill1957_50)[4] = new moom.If(moom.Hr.class, 5, 2);
    (__sourceSpill1957_50)[5] = new moom.If(moom.Hn.class, 5, 1);
    a = ((moom.If[])(__sourceSpill1957_50));
    moom.If[] __sourceSpill1957_58 = new moom.If[((int) (local0_life18)[7])];
    (__sourceSpill1957_58)[0] = new moom.If(moom.Hh.class, ((int) (local0_life18)[2]), 0, true);
    (__sourceSpill1957_58)[1] = new moom.If(moom.Hj.class, ((int) (local0_life18)[4]), 5);
    (__sourceSpill1957_58)[2] = new moom.If(moom.He.class, 5, ((int) (local0_life18)[8]));
    (__sourceSpill1957_58)[3] = new moom.If(moom.Hd.class, 5, ((int) (local0_life18)[8]));
    (__sourceSpill1957_58)[4] = new moom.If(moom.Hf.class, ((int) (local0_life18)[8]), 3, true);
    (__sourceSpill1957_58)[5] = new moom.If(moom.Hg.class, ((int) (local0_life18)[1]), 2);
    (__sourceSpill1957_58)[((int) (local0_life18)[6])] = new moom.If(moom.Ho.class, 5, 2);
    b = ((moom.If[])(__sourceSpill1957_58));
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static moom.Hc a(moom.If p0, java.util.List<moom.G4> p1, java.util.Random p2, int p3, int p4, int p5, moom.bs p6, int p7) {
java.lang.Class forestValue66_28_0;
    java.lang.Class forestValue66_28_1;
    java.lang.Class forestValue66_43_0;
    java.lang.Class forestValue66_43_1;
    java.lang.Class forestValue66_58_0;
    java.lang.Class forestValue66_58_1;
    java.lang.Class forestValue66_73_0;
    java.lang.Class forestValue66_73_1;
    java.lang.Class forestValue66_88_0;
    java.lang.Class forestValue66_88_1;
    java.lang.Class forestValue66_103_0;
    java.lang.Class forestValue66_103_1;
    java.lang.Class forestValue66_118_0;
    java.lang.Class forestValue66_118_1;
    java.lang.Class forestValue66_133_0;
    java.lang.Class forestValue66_133_1;
    java.lang.Class forestValue66_148_0;
    java.lang.Class forestValue66_148_1;
    java.lang.Class forestValue66_163_0;
    java.lang.Class forestValue66_163_1;
    java.lang.Class forestValue66_178_0;
    java.lang.Class forestValue66_178_1;
    java.lang.Class forestValue66_193_0;
    java.lang.Class forestValue66_193_1;
    net.minecraft.entity.Entity[] spill66_0;
    java.lang.Class spill66_1;
    java.lang.Class spill66_2;
    long life8_3;
    java.lang.Class life11_7;
    net.minecraft.entity.Entity[] life10_8;
    moom.Hc life12_10;
    forest_join_203: {
    forest_join_193: {
    forest_join_191: {
    forest_join_178: {
    forest_join_176: {
    forest_join_163: {
    forest_join_161: {
    forest_join_148: {
    forest_join_146: {
    forest_join_133: {
    forest_join_131: {
    forest_join_118: {
    forest_join_116: {
    forest_join_103: {
    forest_join_101: {
    forest_join_88: {
    forest_join_86: {
    forest_join_73: {
    forest_join_71: {
    forest_join_58: {
    forest_join_56: {
    forest_join_43: {
    forest_join_41: {
    forest_join_28: {
    forest_join_26: {
    life8_3 = (net.minecraft.world.gen.structure.StructureNetherBridgePieces.c ^ 94684987388649L);
    spill66_0 = moom.G4.b();
    life11_7 = ((moom.If)(p0)).a;
    life10_8 = spill66_0;
    life12_10 = null;
    spill66_1 = life11_7;
    spill66_2 = moom.Hq.class;
    if (!((life10_8 != null))) {
        forestValue66_28_0 = spill66_1;
        forestValue66_28_1 = spill66_2;
        break forest_join_28;
    }
    if (!((spill66_1 == spill66_2))) {
        break forest_join_26;
    }
    life12_10 = moom.Hq.a(((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)(p3)), ((int)(p4)), ((int)(p5)), ((moom.bs)(p6)), ((int)(p7)));
    break forest_join_203;
    }
    forestValue66_28_0 = life11_7;
    forestValue66_28_1 = moom.Hk.class;
    }
    if (!((life10_8 != null))) {
        forestValue66_43_0 = forestValue66_28_0;
        forestValue66_43_1 = forestValue66_28_1;
        break forest_join_43;
    }
    if (!((forestValue66_28_0 == forestValue66_28_1))) {
        break forest_join_41;
    }
    life12_10 = moom.Hk.a(((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)(p3)), ((int)(p4)), ((int)(p5)), ((moom.bs)(p6)), ((int)(p7)));
    break forest_join_203;
    }
    forestValue66_43_0 = life11_7;
    forestValue66_43_1 = moom.Hi.class;
    }
    if (!((life10_8 != null))) {
        forestValue66_58_0 = forestValue66_43_0;
        forestValue66_58_1 = forestValue66_43_1;
        break forest_join_58;
    }
    if (!((forestValue66_43_0 == forestValue66_43_1))) {
        break forest_join_56;
    }
    life12_10 = moom.Hi.a(((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)(p3)), ((int)(p4)), ((int)(p5)), ((moom.bs)(p6)), ((int)(p7)));
    break forest_join_203;
    }
    forestValue66_58_0 = life11_7;
    forestValue66_58_1 = moom.Hp.class;
    }
    if (!((life10_8 != null))) {
        forestValue66_73_0 = forestValue66_58_0;
        forestValue66_73_1 = forestValue66_58_1;
        break forest_join_73;
    }
    if (!((forestValue66_58_0 == forestValue66_58_1))) {
        break forest_join_71;
    }
    life12_10 = moom.Hp.a(((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)(p3)), ((int)(p4)), ((int)(p5)), ((int)(p7)), ((moom.bs)(p6)));
    break forest_join_203;
    }
    forestValue66_73_0 = life11_7;
    forestValue66_73_1 = moom.Hr.class;
    }
    if (!((life10_8 != null))) {
        forestValue66_88_0 = forestValue66_73_0;
        forestValue66_88_1 = forestValue66_73_1;
        break forest_join_88;
    }
    if (!((forestValue66_73_0 == forestValue66_73_1))) {
        break forest_join_86;
    }
    life12_10 = moom.Hr.a(((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)(p3)), ((int)(p4)), ((int)(p5)), ((int)(p7)), ((moom.bs)(p6)));
    break forest_join_203;
    }
    forestValue66_88_0 = life11_7;
    forestValue66_88_1 = moom.Hn.class;
    }
    if (!((life10_8 != null))) {
        forestValue66_103_0 = forestValue66_88_0;
        forestValue66_103_1 = forestValue66_88_1;
        break forest_join_103;
    }
    if (!((forestValue66_88_0 == forestValue66_88_1))) {
        break forest_join_101;
    }
    life12_10 = moom.Hn.a(((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)(p3)), ((int)(p4)), ((int)(p5)), ((moom.bs)(p6)), ((int)(p7)));
    break forest_join_203;
    }
    forestValue66_103_0 = life11_7;
    forestValue66_103_1 = moom.Hh.class;
    }
    if (!((life10_8 != null))) {
        forestValue66_118_0 = forestValue66_103_0;
        forestValue66_118_1 = forestValue66_103_1;
        break forest_join_118;
    }
    if (!((forestValue66_103_0 == forestValue66_103_1))) {
        break forest_join_116;
    }
    life12_10 = moom.Hh.a(((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)(p3)), ((int)(p4)), ((int)(p5)), ((moom.bs)(p6)), ((int)(p7)));
    break forest_join_203;
    }
    forestValue66_118_0 = life11_7;
    forestValue66_118_1 = moom.He.class;
    }
    if (!((life10_8 != null))) {
        forestValue66_133_0 = forestValue66_118_0;
        forestValue66_133_1 = forestValue66_118_1;
        break forest_join_133;
    }
    if (!((forestValue66_118_0 == forestValue66_118_1))) {
        break forest_join_131;
    }
    life12_10 = moom.He.a(((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)(p3)), ((int)(p4)), ((int)(p5)), ((moom.bs)(p6)), ((int)(p7)));
    break forest_join_203;
    }
    forestValue66_133_0 = life11_7;
    forestValue66_133_1 = moom.Hd.class;
    }
    if (!((life10_8 != null))) {
        forestValue66_148_0 = forestValue66_133_0;
        forestValue66_148_1 = forestValue66_133_1;
        break forest_join_148;
    }
    if (!((forestValue66_133_0 == forestValue66_133_1))) {
        break forest_join_146;
    }
    life12_10 = moom.Hd.a(((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)(p3)), ((int)(p4)), ((int)(p5)), ((moom.bs)(p6)), ((int)(p7)));
    break forest_join_203;
    }
    forestValue66_148_0 = life11_7;
    forestValue66_148_1 = moom.Hf.class;
    }
    if (!((life10_8 != null))) {
        forestValue66_163_0 = forestValue66_148_0;
        forestValue66_163_1 = forestValue66_148_1;
        break forest_join_163;
    }
    if (!((forestValue66_148_0 == forestValue66_148_1))) {
        break forest_join_161;
    }
    life12_10 = moom.Hf.a(((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)(p3)), ((int)(p4)), ((int)(p5)), ((moom.bs)(p6)), ((int)(p7)));
    break forest_join_203;
    }
    forestValue66_163_0 = life11_7;
    forestValue66_163_1 = moom.Hg.class;
    }
    if (!((life10_8 != null))) {
        forestValue66_178_0 = forestValue66_163_0;
        forestValue66_178_1 = forestValue66_163_1;
        break forest_join_178;
    }
    if (!((forestValue66_163_0 == forestValue66_163_1))) {
        break forest_join_176;
    }
    life12_10 = moom.Hg.a(((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)(p3)), ((int)(p4)), ((int)(p5)), ((moom.bs)(p6)), ((int)(p7)));
    break forest_join_203;
    }
    forestValue66_178_0 = life11_7;
    forestValue66_178_1 = moom.Hj.class;
    }
    if (!((life10_8 != null))) {
        forestValue66_193_0 = forestValue66_178_0;
        forestValue66_193_1 = forestValue66_178_1;
        break forest_join_193;
    }
    if (!((forestValue66_178_0 == forestValue66_178_1))) {
        break forest_join_191;
    }
    life12_10 = moom.Hj.a(((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)(p3)), ((int)(p4)), ((int)(p5)), ((moom.bs)(p6)), ((int)(p7)));
    break forest_join_203;
    }
    forestValue66_193_0 = life11_7;
    forestValue66_193_1 = moom.Ho.class;
    }
    if (!((forestValue66_193_0 == forestValue66_193_1))) {
        break forest_join_203;
    }
    life12_10 = moom.Ho.a(((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)(p3)), ((int)(p4)), ((int)(p5)), ((moom.bs)(p6)), ((int)(p7)));
    }
    return life12_10;
}


public static void a() {
moom.G1.b(((java.lang.Class)(moom.Hk.class)), ((java.lang.String)("NeBCr")));
    moom.G1.b(((java.lang.Class)(moom.Hm.class)), ((java.lang.String)("NeBEF")));
    moom.G1.b(((java.lang.Class)(moom.Hq.class)), ((java.lang.String)("NeBS")));
    moom.G1.b(((java.lang.Class)(moom.Hf.class)), ((java.lang.String)("NeCCS")));
    moom.G1.b(((java.lang.Class)(moom.Hg.class)), ((java.lang.String)("NeCTB")));
    moom.G1.b(((java.lang.Class)(moom.Hn.class)), ((java.lang.String)("NeCE")));
    moom.G1.b(((java.lang.Class)(moom.Hj.class)), ((java.lang.String)("NeSCSC")));
    moom.G1.b(((java.lang.Class)(moom.Hd.class)), ((java.lang.String)("NeSCLT")));
    moom.G1.b(((java.lang.Class)(moom.Hh.class)), ((java.lang.String)("NeSC")));
    moom.G1.b(((java.lang.Class)(moom.He.class)), ((java.lang.String)("NeSCRT")));
    moom.G1.b(((java.lang.Class)(moom.Ho.class)), ((java.lang.String)("NeCSR")));
    moom.G1.b(((java.lang.Class)(moom.Hr.class)), ((java.lang.String)("NeMT")));
    moom.G1.b(((java.lang.Class)(moom.Hi.class)), ((java.lang.String)("NeRC")));
    moom.G1.b(((java.lang.Class)(moom.Hp.class)), ((java.lang.String)("NeSR")));
    moom.G1.b(((java.lang.Class)(moom.Hl.class)), ((java.lang.String)("NeStart")));
    return;
}

}
