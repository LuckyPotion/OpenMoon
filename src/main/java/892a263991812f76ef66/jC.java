package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class jC {

private moom.jE[] a;

private moom.jG[] b;

public float c;

public float d;

public float e;

public float f;

public float g;

public float h;

public java.lang.String i;

private static long j;

private static long[] k;

private static java.lang.Integer[] l;

private static java.util.Map m;

public jC(moom.jD p0, int p1, int p2, float p3, float p4, float p5, int p6, int p7, int p8, float p9, boolean p10) { super(); }


private static void __sourceConstructorBody_55546db037cf8fc1(moom.jC receiver, moom.jD p0, int p1, int p2, float p3, float p4, float p5, int p6, int p7, int p8, float p9, boolean p10) throws Throwable {

long life12_3;

    float life14_53;

    float life15_58;

    float life16_63;

    float life4_67;

    float life5_71;

    float life6_75;

    float life14_79;

    float life15_83;

    float life16_87;

    float life17_91;

    moom.jE life17_104;

    moom.jE life18_113;

    moom.jE life19_122;

    moom.jE life20_131;

    moom.jE life21_140;

    moom.jE life22_149;

    moom.jE life23_158;

    moom.jE life24_167;

    moom.jG[] life25_494;

    int life26_497;

    int life27_499;

    moom.jG life28_506;

    life12_3 = (moom.jC.j ^ 107840192172535L);

    moom.jC.__sourceConstructorInit_55546db037cf8fc1_0(((moom.jC)(receiver)));

    ((moom.jC)(receiver)).c = ((float)(p3));

    ((moom.jC)(receiver)).d = ((float)(p4));

    ((moom.jC)(receiver)).e = ((float)(p5));

    ((moom.jC)(receiver)).f = ((float)((p3 + ((float) p6))));

    ((moom.jC)(receiver)).g = ((float)((p4 + ((float) p7))));

    ((moom.jC)(receiver)).h = ((float)((p5 + ((float) p8))));

    ((moom.jC)(receiver)).a = ((moom.jE[])(new moom.jE[__sourceIntrinsic_55546db037cf8fc1_invokedynamic16_8(29860, (8633285734796016174L ^ life12_3))]));

    ((moom.jC)(receiver)).b = ((moom.jG[])(new moom.jG[__sourceIntrinsic_55546db037cf8fc1_invokedynamic16_10(4836, (3572414591654026346L ^ life12_3))]));

    life14_53 = (p3 + ((float) p6));

    life15_58 = (p4 + ((float) p7));

    life16_63 = (p5 + ((float) p8));

    life4_67 = (p3 - p9);

    life5_71 = (p4 - p9);

    life6_75 = (p5 - p9);

    life14_79 = (life14_53 + p9);

    life15_83 = (life15_58 + p9);

    life16_87 = (life16_63 + p9);

    if (p10) {

        life17_91 = life14_79;

        life14_79 = life4_67;

        life4_67 = life17_91;

    } else {

        

    }

    life17_104 = new moom.jE(life4_67, life5_71, life6_75, 0x0.0p0f, 0x0.0p0f);

    life18_113 = new moom.jE(life14_79, life5_71, life6_75, 0x0.0p0f, 0x1.0p3f);

    life19_122 = new moom.jE(life14_79, life15_83, life6_75, 0x1.0p3f, 0x1.0p3f);

    life20_131 = new moom.jE(life4_67, life15_83, life6_75, 0x1.0p3f, 0x0.0p0f);

    life21_140 = new moom.jE(life4_67, life5_71, life16_87, 0x0.0p0f, 0x0.0p0f);

    life22_149 = new moom.jE(life14_79, life5_71, life16_87, 0x0.0p0f, 0x1.0p3f);

    life23_158 = new moom.jE(life14_79, life15_83, life16_87, 0x1.0p3f, 0x1.0p3f);

    life24_167 = new moom.jE(life4_67, life15_83, life16_87, 0x1.0p3f, 0x0.0p0f);

    (((moom.jC)(receiver)).a)[0] = life17_104;

    (((moom.jC)(receiver)).a)[1] = life18_113;

    (((moom.jC)(receiver)).a)[2] = life19_122;

    (((moom.jC)(receiver)).a)[3] = life20_131;

    (((moom.jC)(receiver)).a)[4] = life21_140;

    (((moom.jC)(receiver)).a)[5] = life22_149;

    (((moom.jC)(receiver)).a)[__sourceIntrinsic_55546db037cf8fc1_invokedynamic16_19(1584, (5568776635182762175L ^ life12_3))] = life23_158;

    (((moom.jC)(receiver)).a)[__sourceIntrinsic_55546db037cf8fc1_invokedynamic16_21(17537, (5991518949322394125L ^ life12_3))] = life24_167;

    (((moom.jC)(receiver)).b)[0] = new moom.jG(new moom.jE[] {life22_149, life18_113, life19_122, life23_158}, ((p1 + p8) + p6), (p2 + p8), (((p1 + p8) + p6) + p8), ((p2 + p8) + p7), ((moom.jD)(p0)).a, ((moom.jD)(p0)).b);

    (((moom.jC)(receiver)).b)[1] = new moom.jG(new moom.jE[] {life17_104, life21_140, life24_167, life20_131}, p1, (p2 + p8), (p1 + p8), ((p2 + p8) + p7), ((moom.jD)(p0)).a, ((moom.jD)(p0)).b);

    (((moom.jC)(receiver)).b)[2] = new moom.jG(new moom.jE[] {life22_149, life21_140, life17_104, life18_113}, (p1 + p8), p2, ((p1 + p8) + p6), (p2 + p8), ((moom.jD)(p0)).a, ((moom.jD)(p0)).b);

    (((moom.jC)(receiver)).b)[3] = new moom.jG(new moom.jE[] {life19_122, life20_131, life24_167, life23_158}, ((p1 + p8) + p6), (p2 + p8), (((p1 + p8) + p6) + p6), p2, ((moom.jD)(p0)).a, ((moom.jD)(p0)).b);

    (((moom.jC)(receiver)).b)[4] = new moom.jG(new moom.jE[] {life18_113, life17_104, life20_131, life19_122}, (p1 + p8), (p2 + p8), ((p1 + p8) + p6), ((p2 + p8) + p7), ((moom.jD)(p0)).a, ((moom.jD)(p0)).b);

    (((moom.jC)(receiver)).b)[5] = new moom.jG(new moom.jE[] {life21_140, life22_149, life23_158, life24_167}, (((p1 + p8) + p6) + p8), (p2 + p8), ((((p1 + p8) + p6) + p8) + p6), ((p2 + p8) + p7), ((moom.jD)(p0)).a, ((moom.jD)(p0)).b);

    if (p10) {

        life25_494 = ((moom.jC)(receiver)).b;

        life26_497 = (life25_494).length;

        life27_499 = 0;

        loop_region_500: while ((life27_499 < life26_497)) {

        life28_506 = (life25_494)[life27_499];

        ((moom.jG)(life28_506)).a();

        life27_499 += 1;

    }

    } else {

        

    }

    return;

}



public jC(moom.jD p0, int[][] p1, float p2, float p3, float p4, float p5, float p6, float p7, float p8, boolean p9) { super(); }


private static void __sourceConstructorBody_24f72086002e4086(moom.jC receiver, moom.jD p0, int[][] p1, float p2, float p3, float p4, float p5, float p6, float p7, float p8, boolean p9) throws Throwable {

float __initValue678_89_0;

    moom.jG[] __initValue678_412_0;

    long local11_life2;

    net.minecraft.entity.Entity[] local13_life9;

    float local14_life19;

    float local15_life20;

    float local16_life21;

    float local17_life23;

    moom.jE local17_life24;

    moom.jE local18_life26;

    moom.jE local19_life29;

    moom.jE local20_life31;

    moom.jE local21_life32;

    moom.jE local22_life34;

    moom.jE local23_life37;

    moom.jE local24_life39;

    moom.jG[] local25_life143;

    int local26_life144;

    int local27_life145;

    moom.jG local28_life146;

    init_join_430: {

    init_join_412: {

    init_join_94: {

    init_join_89: {

    local11_life2 = (moom.jC.j ^ 5039068570941L);

    moom.jC.__sourceConstructorInit_24f72086002e4086_0(((moom.jC)(receiver)));

    net.minecraft.entity.Entity[] __sourceSpill678_6 = moom.iQ.b();

    ((moom.jC)(receiver)).c = ((float)(p2));

    ((moom.jC)(receiver)).d = ((float)(p3));

    ((moom.jC)(receiver)).e = ((float)(p4));

    local13_life9 = __sourceSpill678_6;

    ((moom.jC)(receiver)).f = ((float)((p2 + p5)));

    ((moom.jC)(receiver)).g = ((float)((p3 + p6)));

    ((moom.jC)(receiver)).h = ((float)((p4 + p7)));

    ((moom.jC)(receiver)).a = ((moom.jE[])(new moom.jE[__sourceIntrinsic_24f72086002e4086_originalDynamicSite678_14(19022, (3113613185636446217L ^ local11_life2))]));

    ((moom.jC)(receiver)).b = ((moom.jG[])(new moom.jG[__sourceIntrinsic_24f72086002e4086_originalDynamicSite678_17(1584, (5568738708819868789L ^ local11_life2))]));

    local14_life19 = (p2 + p5);

    local15_life20 = (p3 + p6);

    local16_life21 = (p4 + p7);

    p2 = (p2 - p8);

    p3 = (p3 - p8);

    p4 = (p4 - p8);

    local14_life19 = (local14_life19 + p8);

    local15_life20 = (local15_life20 + p8);

    float __sourceSpill678_22 = (local16_life21 + p8);

    if (!((local13_life9 != null))) {

        __initValue678_89_0 = __sourceSpill678_22;

        break init_join_89;

    }

    local16_life21 = __sourceSpill678_22;

    if (!(p9)) {

        break init_join_94;

    }

    __initValue678_89_0 = local14_life19;

    }

    local17_life23 = __initValue678_89_0;

    local14_life19 = p2;

    p2 = local17_life23;

    }

    local17_life24 = new moom.jE(p2, p3, p4, 0x0.0p0f, 0x0.0p0f);

    local18_life26 = new moom.jE(local14_life19, p3, p4, 0x0.0p0f, 1090519040);

    local19_life29 = new moom.jE(local14_life19, local15_life20, p4, 1090519040, 1090519040);

    local20_life31 = new moom.jE(p2, local15_life20, p4, 1090519040, 0x0.0p0f);

    local21_life32 = new moom.jE(p2, p3, local16_life21, 0x0.0p0f, 0x0.0p0f);

    local22_life34 = new moom.jE(local14_life19, p3, local16_life21, 0x0.0p0f, 1090519040);

    local23_life37 = new moom.jE(local14_life19, local15_life20, local16_life21, 1090519040, 1090519040);

    local24_life39 = new moom.jE(p2, local15_life20, local16_life21, 1090519040, 0x0.0p0f);

    (((moom.jC)(receiver)).a)[0] = local17_life24;

    (((moom.jC)(receiver)).a)[1] = local18_life26;

    (((moom.jC)(receiver)).a)[2] = local19_life29;

    (((moom.jC)(receiver)).a)[3] = local20_life31;

    (((moom.jC)(receiver)).a)[4] = local21_life32;

    (((moom.jC)(receiver)).a)[5] = local22_life34;

    (((moom.jC)(receiver)).a)[__sourceIntrinsic_24f72086002e4086_originalDynamicSite678_48(1584, (5568738708819868789L ^ local11_life2))] = local23_life37;

    (((moom.jC)(receiver)).a)[__sourceIntrinsic_24f72086002e4086_originalDynamicSite678_51(17572, (3342662829829734117L ^ local11_life2))] = local24_life39;

    moom.jG[] __sourceSpill678_53 = ((moom.jC)(receiver)).b;

    int __sourceSpill678_54 = 0;

    moom.jC __sourceSpill678_55 = receiver;

    moom.jE[] __stackOp678_56_0 = new moom.jE[4];

    moom.jE[] __sourceSpill678_57 = __stackOp678_56_0;

    (__stackOp678_56_0)[0] = local22_life34;

    moom.jE[] __stackOp678_58_0 = __sourceSpill678_57;

    moom.jE[] __sourceSpill678_59 = __stackOp678_58_0;

    (__stackOp678_58_0)[1] = local18_life26;

    moom.jE[] __stackOp678_60_0 = __sourceSpill678_59;

    moom.jE[] __sourceSpill678_61 = __stackOp678_60_0;

    (__stackOp678_60_0)[2] = local19_life29;

    moom.jE[] __stackOp678_62_0 = __sourceSpill678_61;

    moom.jE[] __sourceSpill678_63 = __stackOp678_62_0;

    (__stackOp678_62_0)[3] = local23_life37;

    (__sourceSpill678_53)[__sourceSpill678_54] = ((moom.jC)(__sourceSpill678_55)).a(((moom.jE[])(__sourceSpill678_63)), ((int[])((p1)[4])), ((boolean)(false)), ((float)(((moom.jD)(p0)).a)), ((float)(((moom.jD)(p0)).b)));

    moom.jG[] __sourceSpill678_68 = ((moom.jC)(receiver)).b;

    int __sourceSpill678_69 = 1;

    moom.jC __sourceSpill678_70 = receiver;

    moom.jE[] __stackOp678_71_0 = new moom.jE[4];

    moom.jE[] __sourceSpill678_72 = __stackOp678_71_0;

    (__stackOp678_71_0)[0] = local17_life24;

    moom.jE[] __stackOp678_73_0 = __sourceSpill678_72;

    moom.jE[] __sourceSpill678_74 = __stackOp678_73_0;

    (__stackOp678_73_0)[1] = local21_life32;

    moom.jE[] __stackOp678_75_0 = __sourceSpill678_74;

    moom.jE[] __sourceSpill678_76 = __stackOp678_75_0;

    (__stackOp678_75_0)[2] = local24_life39;

    moom.jE[] __stackOp678_77_0 = __sourceSpill678_76;

    moom.jE[] __sourceSpill678_78 = __stackOp678_77_0;

    (__stackOp678_77_0)[3] = local20_life31;

    (__sourceSpill678_68)[__sourceSpill678_69] = ((moom.jC)(__sourceSpill678_70)).a(((moom.jE[])(__sourceSpill678_78)), ((int[])((p1)[5])), ((boolean)(false)), ((float)(((moom.jD)(p0)).a)), ((float)(((moom.jD)(p0)).b)));

    moom.jG[] __sourceSpill678_83 = ((moom.jC)(receiver)).b;

    int __sourceSpill678_84 = 2;

    moom.jC __sourceSpill678_85 = receiver;

    moom.jE[] __stackOp678_86_0 = new moom.jE[4];

    moom.jE[] __sourceSpill678_87 = __stackOp678_86_0;

    (__stackOp678_86_0)[0] = local22_life34;

    moom.jE[] __stackOp678_88_0 = __sourceSpill678_87;

    moom.jE[] __sourceSpill678_89 = __stackOp678_88_0;

    (__stackOp678_88_0)[1] = local21_life32;

    moom.jE[] __stackOp678_90_0 = __sourceSpill678_89;

    moom.jE[] __sourceSpill678_91 = __stackOp678_90_0;

    (__stackOp678_90_0)[2] = local17_life24;

    moom.jE[] __stackOp678_92_0 = __sourceSpill678_91;

    moom.jE[] __sourceSpill678_93 = __stackOp678_92_0;

    (__stackOp678_92_0)[3] = local18_life26;

    (__sourceSpill678_83)[__sourceSpill678_84] = ((moom.jC)(__sourceSpill678_85)).a(((moom.jE[])(__sourceSpill678_93)), ((int[])((p1)[1])), ((boolean)(true)), ((float)(((moom.jD)(p0)).a)), ((float)(((moom.jD)(p0)).b)));

    moom.jG[] __sourceSpill678_98 = ((moom.jC)(receiver)).b;

    int __sourceSpill678_99 = 3;

    moom.jC __sourceSpill678_100 = receiver;

    moom.jE[] __stackOp678_101_0 = new moom.jE[4];

    moom.jE[] __sourceSpill678_102 = __stackOp678_101_0;

    (__stackOp678_101_0)[0] = local19_life29;

    moom.jE[] __stackOp678_103_0 = __sourceSpill678_102;

    moom.jE[] __sourceSpill678_104 = __stackOp678_103_0;

    (__stackOp678_103_0)[1] = local20_life31;

    moom.jE[] __stackOp678_105_0 = __sourceSpill678_104;

    moom.jE[] __sourceSpill678_106 = __stackOp678_105_0;

    (__stackOp678_105_0)[2] = local24_life39;

    moom.jE[] __stackOp678_107_0 = __sourceSpill678_106;

    moom.jE[] __sourceSpill678_108 = __stackOp678_107_0;

    (__stackOp678_107_0)[3] = local23_life37;

    (__sourceSpill678_98)[__sourceSpill678_99] = ((moom.jC)(__sourceSpill678_100)).a(((moom.jE[])(__sourceSpill678_108)), ((int[])((p1)[0])), ((boolean)(true)), ((float)(((moom.jD)(p0)).a)), ((float)(((moom.jD)(p0)).b)));

    moom.jG[] __sourceSpill678_113 = ((moom.jC)(receiver)).b;

    int __sourceSpill678_114 = 4;

    moom.jC __sourceSpill678_115 = receiver;

    moom.jE[] __stackOp678_116_0 = new moom.jE[4];

    moom.jE[] __sourceSpill678_117 = __stackOp678_116_0;

    (__stackOp678_116_0)[0] = local18_life26;

    moom.jE[] __stackOp678_118_0 = __sourceSpill678_117;

    moom.jE[] __sourceSpill678_119 = __stackOp678_118_0;

    (__stackOp678_118_0)[1] = local17_life24;

    moom.jE[] __stackOp678_120_0 = __sourceSpill678_119;

    moom.jE[] __sourceSpill678_121 = __stackOp678_120_0;

    (__stackOp678_120_0)[2] = local20_life31;

    moom.jE[] __stackOp678_122_0 = __sourceSpill678_121;

    moom.jE[] __sourceSpill678_123 = __stackOp678_122_0;

    (__stackOp678_122_0)[3] = local19_life29;

    (__sourceSpill678_113)[__sourceSpill678_114] = ((moom.jC)(__sourceSpill678_115)).a(((moom.jE[])(__sourceSpill678_123)), ((int[])((p1)[2])), ((boolean)(false)), ((float)(((moom.jD)(p0)).a)), ((float)(((moom.jD)(p0)).b)));

    moom.jG[] __sourceSpill678_128 = ((moom.jC)(receiver)).b;

    if (!((local13_life9 != null))) {

        __initValue678_412_0 = __sourceSpill678_128;

        break init_join_412;

    }

    int __sourceSpill678_129 = 5;

    moom.jC __sourceSpill678_130 = receiver;

    moom.jE[] __stackOp678_131_0 = new moom.jE[4];

    moom.jE[] __sourceSpill678_132 = __stackOp678_131_0;

    (__stackOp678_131_0)[0] = local21_life32;

    moom.jE[] __stackOp678_133_0 = __sourceSpill678_132;

    moom.jE[] __sourceSpill678_134 = __stackOp678_133_0;

    (__stackOp678_133_0)[1] = local22_life34;

    moom.jE[] __stackOp678_135_0 = __sourceSpill678_134;

    moom.jE[] __sourceSpill678_136 = __stackOp678_135_0;

    (__stackOp678_135_0)[2] = local23_life37;

    moom.jE[] __stackOp678_137_0 = __sourceSpill678_136;

    moom.jE[] __sourceSpill678_138 = __stackOp678_137_0;

    (__stackOp678_137_0)[3] = local24_life39;

    (__sourceSpill678_128)[__sourceSpill678_129] = ((moom.jC)(__sourceSpill678_130)).a(((moom.jE[])(__sourceSpill678_138)), ((int[])((p1)[3])), ((boolean)(false)), ((float)(((moom.jD)(p0)).a)), ((float)(((moom.jD)(p0)).b)));

    if (!(p9)) {

        break init_join_430;

    }

    __initValue678_412_0 = ((moom.jC)(receiver)).b;

    }

    local25_life143 = __initValue678_412_0;

    local26_life144 = (local25_life143).length;

    local27_life145 = 0;

    init_cycle_418: while (true) {

    if (!((local27_life145 < local26_life144))) {

        break init_join_430;

    }

    local28_life146 = (local25_life143)[local27_life145];

    ((moom.jG)(local28_life146)).a();

    local27_life145 += 1;

    if (!((local13_life9 == null))) { continue init_cycle_418; }

    break init_cycle_418;

    }

    }

    return;

}



public jC(moom.jD p0, int p1, int p2, float p3, float p4, float p5, int p6, int p7, int p8, float p9) {
this(((moom.jD)(p0)), ((int)(p1)), ((int)(p2)), ((float)(p3)), ((float)(p4)), ((float)(p5)), ((int)(p6)), ((int)(p7)), ((int)(p8)), ((float)(p9)), ((boolean)(((moom.jD)(p0)).m)));
    return;
}


static {
j = ((long)(((moom._a)(moom._c.a(((long)(3678350677316677024L)), ((long)(-1282519971965610419L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(244532053112668L)))));
    m = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.jC.j ^ 63306550739020L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1320_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1320_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1320_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1320_14 = new byte[8];
    (__sourceSpill1320_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1320_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1320_16 = __sourceSpill1320_14;
    ((javax.crypto.Cipher)(__sourceSpill1320_11)).init(((int)(__sourceSpill1320_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1320_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1320_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[6];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "ÌßÑÙ\nL¬\\ÃÉûîU\003ìàÚ\001\017ùØãAxôj'ú"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1320_25 = local6_life21;
        int __sourceSpill1320_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1320_25)).substring(((int)(__sourceSpill1320_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1320_30 = local8_life19;
        int __sourceSpill1320_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1320_33 = new byte[8];
        (__sourceSpill1320_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1320_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1320_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1320_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1320_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1320_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1320_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1320_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1320_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1320_34)).doFinal(((byte[])(__sourceSpill1320_33)));
        (__sourceSpill1320_30)[__sourceSpill1320_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "(j¬M$&æ.!4G°Á_"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1320_38 = local6_life21;
        int __sourceSpill1320_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1320_38)).substring(((int)(__sourceSpill1320_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1320_43 = local8_life19;
        int __sourceSpill1320_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1320_46 = new byte[8];
        (__sourceSpill1320_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1320_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1320_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1320_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1320_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1320_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1320_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1320_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1320_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1320_47)).doFinal(((byte[])(__sourceSpill1320_46)));
        (__sourceSpill1320_43)[__sourceSpill1320_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    k = ((long[])(local8_life19));
    l = ((java.lang.Integer[])(new java.lang.Integer[6]));
}

private static native <E extends Throwable> void __sourceConstructorInit_55546db037cf8fc1_0(moom.jC a0) throws E;
private static native <E extends Throwable> void __sourceConstructorInit_24f72086002e4086_0(moom.jC a0) throws E;

private static int a(int p0, long p1) {
int n4 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x7D10;
        if (jC.l[n4] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = k[n4];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])m.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    m.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/jC", exception);
            }
            int n6 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            jC.l[n4] = n6;
        }
        return jC.l[n4];
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_42f03e3701b2d0(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral8094_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/jC"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public moom.jC a(java.lang.String p0) {
this.i = ((java.lang.String)(p0));
    return this;
}


public void a(moom.lw p0, float p1) {
net.minecraft.entity.Entity[] spill1207_0;
    long life3_3;
    moom.jG[] life6_7;
    net.minecraft.entity.Entity[] life5_8;
    int life7_11;
    int life8_13;
    moom.jG life9_20;
    lexical_join_32: {
    life3_3 = (moom.jC.j ^ 63481396579648L);
    spill1207_0 = moom.iQ.b();
    life6_7 = this.b;
    life5_8 = spill1207_0;
    life7_11 = (life6_7).length;
    life8_13 = 0;
    lexical_cycle_14: while (true) {
    lexical_join_30: {
    lexical_join_29: {
    if (!((life8_13 < life7_11))) {
        break lexical_join_32;
    }
    life9_20 = (life6_7)[life8_13];
    if (!((life5_8 != null))) {
        break lexical_join_30;
    }
    if (!((life9_20 != null))) {
        break lexical_join_29;
    }
    ((moom.jG)(life9_20)).a(((moom.lw)(p0)), ((float)(p1)));
    }
    life8_13 += 1;
    }
    if (!((life5_8 == null))) { continue lexical_cycle_14; }
    break lexical_cycle_14;
    }
    }
    return;
}


private moom.jG a(moom.jE[] p0, int[] p1, boolean p2, float p3, float p4) {
long local6 = (moom.jC.j ^ 23623897049168L);
    return ((p1 == null) ? null : (p2 ? new moom.jG(p0, (p1)[2], (p1)[3], (p1)[0], (p1)[1], p3, p4) : new moom.jG(p0, (p1)[0], (p1)[1], (p1)[2], (p1)[3], p3, p4)));
}


private static native <E extends Throwable> int __sourceIntrinsic_55546db037cf8fc1_invokedynamic16_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_55546db037cf8fc1_invokedynamic16_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_55546db037cf8fc1_invokedynamic16_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_55546db037cf8fc1_invokedynamic16_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_24f72086002e4086_originalDynamicSite678_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_24f72086002e4086_originalDynamicSite678_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_24f72086002e4086_originalDynamicSite678_48(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_24f72086002e4086_originalDynamicSite678_51(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral8094_0() throws E;

private static native int __sourceExactCall_42f03e3701b2d0(int p0, long p1);
}
