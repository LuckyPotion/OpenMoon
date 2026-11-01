package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class iX extends moom.iT {

public moom.jD t;

public moom.jD u;

public moom.jD v;

public moom.jD w;

public moom.jD x;

private moom.jD y;

private moom.jD z;

private boolean A;

private static long C;

private static long[] G;

private static java.lang.Integer[] H;

private static java.util.Map I;

public iX(float p0, boolean p1) { super(0.0F, 0.0F, 0, 0); }


private static void __sourceConstructorBody_5a0e6b85fbdca4bc(moom.iX receiver, float p0, boolean p1) throws Throwable {

long local3_life2;

    net.minecraft.entity.Entity[] local5_life23;

    forward_join_359: {

    forward_join_353: {

    forward_join_247: {

    local3_life2 = (moom.iX.C ^ 23197898057649L);

    moom.iX.__sourceConstructorInit_5a0e6b85fbdca4bc_0(((moom.iX)(receiver)), ((float)(p0)), ((float)(0x0.0p0f)), ((int)(__sourceIntrinsic_5a0e6b85fbdca4bc_originalDynamicSite425_4(22903, (4419711276598938358L ^ local3_life2)))), ((int)(__sourceIntrinsic_5a0e6b85fbdca4bc_originalDynamicSite425_6(14814, (5265203341884828249L ^ local3_life2)))));

    ((moom.iX)(receiver)).A = ((boolean)(p1));

    net.minecraft.entity.Entity[] __sourceSpill425_13 = moom.iQ.b();

    ((moom.iX)(receiver)).z = ((moom.jD)(new moom.jD(((moom.iQ) receiver), __sourceIntrinsic_5a0e6b85fbdca4bc_originalDynamicSite425_11(2196, (7182680095168076574L ^ local3_life2)), 0)));

    ((moom.jD)(((moom.iX)(receiver)).z)).a(((float)(-1069547520)), ((float)(-1061158912)), ((float)(-1082130432)), ((int)(__sourceIntrinsic_5a0e6b85fbdca4bc_originalDynamicSite425_19(6176, (2919608452001303465L ^ local3_life2)))), ((int)(__sourceIntrinsic_5a0e6b85fbdca4bc_originalDynamicSite425_21(20361, (2373160664448490507L ^ local3_life2)))), ((int)(1)), ((float)(p0)));

    local5_life23 = __sourceSpill425_13;

    ((moom.iX)(receiver)).y = ((moom.jD)(new moom.jD(((moom.iQ) receiver), 0, 0)));

    ((moom.jD)(((moom.iX)(receiver)).y)).b(((int)(__sourceIntrinsic_5a0e6b85fbdca4bc_originalDynamicSite425_27(14814, (5265203341884828249L ^ local3_life2)))), ((int)(__sourceIntrinsic_5a0e6b85fbdca4bc_originalDynamicSite425_29(22933, (4879764166828542493L ^ local3_life2)))));

    ((moom.jD)(((moom.iX)(receiver)).y)).a(((float)(-1063256064)), ((float)(0x0.0p0f)), ((float)(-1082130432)), ((int)(__sourceIntrinsic_5a0e6b85fbdca4bc_originalDynamicSite425_35(18857, (3291401506180356642L ^ local3_life2)))), ((int)(__sourceIntrinsic_5a0e6b85fbdca4bc_originalDynamicSite425_37(12177, (5797893431554325535L ^ local3_life2)))), ((int)(1)), ((float)(p0)));

    if (!((local5_life23 != null))) { break forward_join_353; }

    if (!(p1)) { break forward_join_247; }

    ((moom.iX)(receiver)).m = ((moom.jD)(new moom.jD(((moom.iQ) receiver), __sourceIntrinsic_5a0e6b85fbdca4bc_originalDynamicSite425_40(4352, (5931008975550481055L ^ local3_life2)), __sourceIntrinsic_5a0e6b85fbdca4bc_originalDynamicSite425_42(27593, (7388665953848948813L ^ local3_life2)))));

    ((moom.jD)(((moom.iX)(receiver)).m)).a(((float)(-1082130432)), ((float)(-1073741824)), ((float)(-1073741824)), ((int)(3)), ((int)(__sourceIntrinsic_5a0e6b85fbdca4bc_originalDynamicSite425_49(13805, (6693295796986259048L ^ local3_life2)))), ((int)(4)), ((float)(p0)));

    ((moom.jD)(((moom.iX)(receiver)).m)).a(((float)(1084227584)), ((float)(1075838976)), ((float)(0x0.0p0f)));

    ((moom.iX)(receiver)).l = ((moom.jD)(new moom.jD(((moom.iQ) receiver), __sourceIntrinsic_5a0e6b85fbdca4bc_originalDynamicSite425_56(29969, (390710322024539794L ^ local3_life2)), __sourceIntrinsic_5a0e6b85fbdca4bc_originalDynamicSite425_58(11587, (64515485474242252L ^ local3_life2)))));

    ((moom.jD)(((moom.iX)(receiver)).l)).a(((float)(-1073741824)), ((float)(-1073741824)), ((float)(-1073741824)), ((int)(3)), ((int)(__sourceIntrinsic_5a0e6b85fbdca4bc_originalDynamicSite425_65(2032, (8681016775628592252L ^ local3_life2)))), ((int)(4)), ((float)(p0)));

    ((moom.jD)(((moom.iX)(receiver)).l)).a(((float)(-1063256064)), ((float)(1075838976)), ((float)(0x0.0p0f)));

    ((moom.iX)(receiver)).t = ((moom.jD)(new moom.jD(((moom.iQ) receiver), __sourceIntrinsic_5a0e6b85fbdca4bc_originalDynamicSite425_72(4334, (7114805745941381998L ^ local3_life2)), __sourceIntrinsic_5a0e6b85fbdca4bc_originalDynamicSite425_74(4334, (7114805745941381998L ^ local3_life2)))));

    ((moom.jD)(((moom.iX)(receiver)).t)).a(((float)(-1082130432)), ((float)(-1073741824)), ((float)(-1073741824)), ((int)(3)), ((int)(__sourceIntrinsic_5a0e6b85fbdca4bc_originalDynamicSite425_81(2032, (8681016775628592252L ^ local3_life2)))), ((int)(4)), ((float)((p0 + 1048576000))));

    ((moom.jD)(((moom.iX)(receiver)).t)).a(((float)(1084227584)), ((float)(1075838976)), ((float)(0x0.0p0f)));

    ((moom.iX)(receiver)).u = ((moom.jD)(new moom.jD(((moom.iQ) receiver), __sourceIntrinsic_5a0e6b85fbdca4bc_originalDynamicSite425_89(31047, (8627443376587500225L ^ local3_life2)), __sourceIntrinsic_5a0e6b85fbdca4bc_originalDynamicSite425_91(4352, (5931008975550481055L ^ local3_life2)))));

    ((moom.jD)(((moom.iX)(receiver)).u)).a(((float)(-1073741824)), ((float)(-1073741824)), ((float)(-1073741824)), ((int)(3)), ((int)(__sourceIntrinsic_5a0e6b85fbdca4bc_originalDynamicSite425_98(2032, (8681016775628592252L ^ local3_life2)))), ((int)(4)), ((float)((p0 + 1048576000))));

    ((moom.jD)(((moom.iX)(receiver)).u)).a(((float)(-1063256064)), ((float)(1075838976)), ((float)(1092616192)));

    if (!((local5_life23 == null))) { break forward_join_359; }

    }

    ((moom.iX)(receiver)).m = ((moom.jD)(new moom.jD(((moom.iQ) receiver), __sourceIntrinsic_5a0e6b85fbdca4bc_originalDynamicSite425_107(4352, (5931008975550481055L ^ local3_life2)), __sourceIntrinsic_5a0e6b85fbdca4bc_originalDynamicSite425_109(4334, (7114805745941381998L ^ local3_life2)))));

    ((moom.jD)(((moom.iX)(receiver)).m)).a(((float)(-1082130432)), ((float)(-1073741824)), ((float)(-1073741824)), ((int)(4)), ((int)(__sourceIntrinsic_5a0e6b85fbdca4bc_originalDynamicSite425_116(2032, (8681016775628592252L ^ local3_life2)))), ((int)(4)), ((float)(p0)));

    ((moom.jD)(((moom.iX)(receiver)).m)).a(((float)(1084227584)), ((float)(0x1.0p1f)), ((float)(0x0.0p0f)));

    ((moom.iX)(receiver)).t = ((moom.jD)(new moom.jD(((moom.iQ) receiver), __sourceIntrinsic_5a0e6b85fbdca4bc_originalDynamicSite425_122(4334, (7114805745941381998L ^ local3_life2)), __sourceIntrinsic_5a0e6b85fbdca4bc_originalDynamicSite425_124(4334, (7114805745941381998L ^ local3_life2)))));

    ((moom.jD)(((moom.iX)(receiver)).t)).a(((float)(-1082130432)), ((float)(-1073741824)), ((float)(-1073741824)), ((int)(4)), ((int)(__sourceIntrinsic_5a0e6b85fbdca4bc_originalDynamicSite425_131(2032, (8681016775628592252L ^ local3_life2)))), ((int)(4)), ((float)((p0 + 1048576000))));

    ((moom.jD)(((moom.iX)(receiver)).t)).a(((float)(1084227584)), ((float)(0x1.0p1f)), ((float)(0x0.0p0f)));

    ((moom.iX)(receiver)).u = ((moom.jD)(new moom.jD(((moom.iQ) receiver), __sourceIntrinsic_5a0e6b85fbdca4bc_originalDynamicSite425_138(31047, (8627443376587500225L ^ local3_life2)), __sourceIntrinsic_5a0e6b85fbdca4bc_originalDynamicSite425_140(4352, (5931008975550481055L ^ local3_life2)))));

    ((moom.jD)(((moom.iX)(receiver)).u)).a(((float)(-1069547520)), ((float)(-1073741824)), ((float)(-1073741824)), ((int)(4)), ((int)(__sourceIntrinsic_5a0e6b85fbdca4bc_originalDynamicSite425_147(2032, (8681016775628592252L ^ local3_life2)))), ((int)(4)), ((float)((p0 + 1048576000))));

    }

    ((moom.jD)(((moom.iX)(receiver)).u)).a(((float)(-1063256064)), ((float)(0x1.0p1f)), ((float)(1092616192)));

    }

    ((moom.iX)(receiver)).o = ((moom.jD)(new moom.jD(((moom.iQ) receiver), __sourceIntrinsic_5a0e6b85fbdca4bc_originalDynamicSite425_155(11587, (64515485474242252L ^ local3_life2)), __sourceIntrinsic_5a0e6b85fbdca4bc_originalDynamicSite425_157(4334, (7114805745941381998L ^ local3_life2)))));

    ((moom.jD)(((moom.iX)(receiver)).o)).a(((float)(-1073741824)), ((float)(0x0.0p0f)), ((float)(-1073741824)), ((int)(4)), ((int)(__sourceIntrinsic_5a0e6b85fbdca4bc_originalDynamicSite425_163(2032, (8681016775628592252L ^ local3_life2)))), ((int)(4)), ((float)(p0)));

    ((moom.jD)(((moom.iX)(receiver)).o)).a(((float)(1072902963)), ((float)(1094713344)), ((float)(0x0.0p0f)));

    ((moom.iX)(receiver)).v = ((moom.jD)(new moom.jD(((moom.iQ) receiver), 0, __sourceIntrinsic_5a0e6b85fbdca4bc_originalDynamicSite425_170(4334, (7114805745941381998L ^ local3_life2)))));

    ((moom.jD)(((moom.iX)(receiver)).v)).a(((float)(-1073741824)), ((float)(0x0.0p0f)), ((float)(-1073741824)), ((int)(4)), ((int)(__sourceIntrinsic_5a0e6b85fbdca4bc_originalDynamicSite425_176(2032, (8681016775628592252L ^ local3_life2)))), ((int)(4)), ((float)((p0 + 1048576000))));

    ((moom.jD)(((moom.iX)(receiver)).v)).a(((float)(1072902963)), ((float)(1094713344)), ((float)(0x0.0p0f)));

    ((moom.iX)(receiver)).w = ((moom.jD)(new moom.jD(((moom.iQ) receiver), 0, __sourceIntrinsic_5a0e6b85fbdca4bc_originalDynamicSite425_184(4352, (5931008975550481055L ^ local3_life2)))));

    ((moom.jD)(((moom.iX)(receiver)).w)).a(((float)(-1073741824)), ((float)(0x0.0p0f)), ((float)(-1073741824)), ((int)(4)), ((int)(__sourceIntrinsic_5a0e6b85fbdca4bc_originalDynamicSite425_190(2032, (8681016775628592252L ^ local3_life2)))), ((int)(4)), ((float)((p0 + 1048576000))));

    ((moom.jD)(((moom.iX)(receiver)).w)).a(((float)(-1074580685)), ((float)(1094713344)), ((float)(0x0.0p0f)));

    ((moom.iX)(receiver)).x = ((moom.jD)(new moom.jD(((moom.iQ) receiver), __sourceIntrinsic_5a0e6b85fbdca4bc_originalDynamicSite425_198(11587, (64515485474242252L ^ local3_life2)), __sourceIntrinsic_5a0e6b85fbdca4bc_originalDynamicSite425_200(4352, (5931008975550481055L ^ local3_life2)))));

    ((moom.jD)(((moom.iX)(receiver)).x)).a(((float)(-1065353216)), ((float)(0x0.0p0f)), ((float)(-1073741824)), ((int)(__sourceIntrinsic_5a0e6b85fbdca4bc_originalDynamicSite425_206(3009, (8074661703074224204L ^ local3_life2)))), ((int)(__sourceIntrinsic_5a0e6b85fbdca4bc_originalDynamicSite425_208(2032, (8681016775628592252L ^ local3_life2)))), ((int)(4)), ((float)((p0 + 1048576000))));

    ((moom.jD)(((moom.iX)(receiver)).x)).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)));

    return;

}



static {
C = ((long)(((moom._a)(moom._c.a(((long)(-5765880860221459997L)), ((long)(-7083836371027425068L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(102806496644312L)))));
    I = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.iX.C ^ 127979178336029L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1299_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1299_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1299_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1299_14 = new byte[8];
    (__sourceSpill1299_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1299_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1299_16 = __sourceSpill1299_14;
    ((javax.crypto.Cipher)(__sourceSpill1299_11)).init(((int)(__sourceSpill1299_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1299_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1299_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[17];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "L5¦Ý\021\006+f5È@â´¸D¨ýªTvC\024ìét\033\035Ñáà~µ*[dæT\177¹Í¬õÑ/}ä>¡µãçË\016%¸\0262°÷=´49µ¦ª Ó\nÐeùØ%!6NXqu\035­Ý!¹a+äºJUdümqµ.~£"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1299_25 = local6_life21;
        int __sourceSpill1299_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1299_25)).substring(((int)(__sourceSpill1299_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1299_30 = local8_life19;
        int __sourceSpill1299_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1299_33 = new byte[8];
        (__sourceSpill1299_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1299_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1299_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1299_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1299_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1299_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1299_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1299_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1299_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1299_34)).doFinal(((byte[])(__sourceSpill1299_33)));
        (__sourceSpill1299_30)[__sourceSpill1299_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "§¨ØÒ\031K­f:ï'}Ä"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1299_38 = local6_life21;
        int __sourceSpill1299_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1299_38)).substring(((int)(__sourceSpill1299_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1299_43 = local8_life19;
        int __sourceSpill1299_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1299_46 = new byte[8];
        (__sourceSpill1299_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1299_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1299_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1299_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1299_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1299_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1299_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1299_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1299_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1299_47)).doFinal(((byte[])(__sourceSpill1299_46)));
        (__sourceSpill1299_43)[__sourceSpill1299_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    G = ((long[])(local8_life19));
    H = ((java.lang.Integer[])(new java.lang.Integer[17]));
}

private static native <E extends Throwable> void __sourceConstructorInit_5a0e6b85fbdca4bc_0(moom.iX a0, float a1, float a2, int a3, int a4) throws E;

public void b__sourceReturn_da8c82d5d4() {
((moom.jD)(this.m)).a(((float)(0x1.0p-4f)));
    ((moom.jD)(this.t)).a(((float)(0x1.0p-4f)));
    return;
}


public void b(float p0) {
moom.iX.a(((moom.jD)(this.i)), ((moom.jD)(this.z)));
    ((moom.jD)(this.z)).e = ((float)(0x0.0p0f));
    ((moom.jD)(this.z)).f = ((float)(0x0.0p0f));
    ((moom.jD)(this.z)).a(((float)(p0)));
    return;
}


private static int c(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x17DE;
        if (H[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = G[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])I.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    I.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/iX", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            iX.H[n2] = n4;
        }
        return H[n2];
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral8030_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/iX"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.iX.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public void c(float p0) {
((moom.jD)(this.y)).a(((float)(p0)));
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(boolean p0) {
super.a(((boolean)(p0)));
    ((moom.jD)(this.t)).n = ((boolean)(p0));
    ((moom.jD)(this.u)).n = ((boolean)(p0));
    ((moom.jD)(this.v)).n = ((boolean)(p0));
    ((moom.jD)(this.w)).n = ((boolean)(p0));
    ((moom.jD)(this.x)).n = ((boolean)(p0));
    ((moom.jD)(this.y)).n = ((boolean)(p0));
    ((moom.jD)(this.z)).n = ((boolean)(p0));
    return;
}


public void a(net.minecraft.entity.Entity p0, float p1, float p2, float p3, float p4, float p5, float p6) {
int forwardValue3633_43_0;
    net.minecraft.entity.Entity[] spill3633_0;
    boolean spill3633_1;
    long life8_3;
    net.minecraft.entity.Entity[] life10_14;
    float life11_25;
    forward_join_48: {
    forward_join_43: {
    forward_join_41: {
    life8_3 = (moom.iX.C ^ 33979662916186L);
    spill3633_0 = moom.iQ.b();
    super.a(((net.minecraft.entity.Entity)(p0)), ((float)(p1)), ((float)(p2)), ((float)(p3)), ((float)(p4)), ((float)(p5)), ((float)(p6)));
    life10_14 = spill3633_0;
    moom.kZ.B();
    spill3633_1 = this.c;
    if (!((life10_14 != null))) {
        forwardValue3633_43_0 = ((spill3633_1) ? 1 : 0);
        break forward_join_43;
    }
    if (!(spill3633_1)) {
        break forward_join_41;
    }
    life11_25 = 0x1.0p1f;
    moom.kZ.a(((float)((0x1.0p0f / life11_25))), ((float)((0x1.0p0f / life11_25))), ((float)((0x1.0p0f / life11_25))));
    moom.kZ.b(((float)(0x0.0p0f)), ((float)((0x1.8p4f * p6))), ((float)(0x0.0p0f)));
    if (!((life10_14 == null))) {
        break forward_join_48;
    }
    }
    forwardValue3633_43_0 = ((((net.minecraft.entity.Entity)(p0)).t__Boolean()) ? 1 : 0);
    }
    if (!((forwardValue3633_43_0 != 0))) {
        break forward_join_48;
    }
    moom.kZ.b(((float)(0x0.0p0f)), ((float)(0x1.99999ap-3f)), ((float)(0x0.0p0f)));
    }
    ((moom.jD)(this.v)).a(((float)(p6)));
    ((moom.jD)(this.w)).a(((float)(p6)));
    ((moom.jD)(this.t)).a(((float)(p6)));
    ((moom.jD)(this.u)).a(((float)(p6)));
    ((moom.jD)(this.x)).a(((float)(p6)));
    moom.kZ.C();
    return;
}


public void a(float p0, float p1, float p2, float p3, float p4, float p5, net.minecraft.entity.Entity p6) {
super.a(((float)(p0)), ((float)(p1)), ((float)(p2)), ((float)(p3)), ((float)(p4)), ((float)(p5)), ((net.minecraft.entity.Entity)(p6)));
    moom.iX.a(((moom.jD)(this.o)), ((moom.jD)(this.v)));
    moom.iX.a(((moom.jD)(this.n)), ((moom.jD)(this.w)));
    moom.iX.a(((moom.jD)(this.m)), ((moom.jD)(this.t)));
    moom.iX.a(((moom.jD)(this.l)), ((moom.jD)(this.u)));
    moom.iX.a(((moom.jD)(this.k)), ((moom.jD)(this.x)));
    return;
}


public void a(float p0) {
moom.iX forwardValue3632_32_0;
    moom.iX spill3632_0;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_35: {
    forward_join_32: {
    forward_join_31: {
    life2_3 = (moom.iX.C ^ 127067491956073L);
    life4_5 = moom.iQ.b();
    spill3632_0 = this;
    if (!((life4_5 != null))) {
        forwardValue3632_32_0 = spill3632_0;
        break forward_join_32;
    }
    if (!(((moom.iX)(spill3632_0)).A)) {
        break forward_join_31;
    }
    moom.jD __stackOp3632_4_0 = this.l;
    ((moom.jD)(__stackOp3632_4_0)).e = ((float)((((moom.jD)(__stackOp3632_4_0)).e + 0x1.0p0f)));
    ((moom.jD)(this.l)).c(((float)(p0)));
    moom.jD __stackOp3632_10_0 = this.l;
    ((moom.jD)(__stackOp3632_10_0)).e = ((float)((((moom.jD)(__stackOp3632_10_0)).e - 0x1.0p0f)));
    if (!((life4_5 == null))) {
        break forward_join_35;
    }
    }
    forwardValue3632_32_0 = this;
    }
    ((moom.jD)(((moom.iX)(forwardValue3632_32_0)).l)).c(((float)(p0)));
    }
    return;
}


public void a() {
((moom.jD)(this.l)).a(((float)(0x1.0p-4f)));
    ((moom.jD)(this.u)).a(((float)(0x1.0p-4f)));
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_5a0e6b85fbdca4bc_originalDynamicSite425_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5a0e6b85fbdca4bc_originalDynamicSite425_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5a0e6b85fbdca4bc_originalDynamicSite425_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5a0e6b85fbdca4bc_originalDynamicSite425_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5a0e6b85fbdca4bc_originalDynamicSite425_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5a0e6b85fbdca4bc_originalDynamicSite425_27(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5a0e6b85fbdca4bc_originalDynamicSite425_29(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5a0e6b85fbdca4bc_originalDynamicSite425_35(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5a0e6b85fbdca4bc_originalDynamicSite425_37(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5a0e6b85fbdca4bc_originalDynamicSite425_40(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5a0e6b85fbdca4bc_originalDynamicSite425_42(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5a0e6b85fbdca4bc_originalDynamicSite425_49(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5a0e6b85fbdca4bc_originalDynamicSite425_56(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5a0e6b85fbdca4bc_originalDynamicSite425_58(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5a0e6b85fbdca4bc_originalDynamicSite425_65(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5a0e6b85fbdca4bc_originalDynamicSite425_72(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5a0e6b85fbdca4bc_originalDynamicSite425_74(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5a0e6b85fbdca4bc_originalDynamicSite425_81(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5a0e6b85fbdca4bc_originalDynamicSite425_89(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5a0e6b85fbdca4bc_originalDynamicSite425_91(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5a0e6b85fbdca4bc_originalDynamicSite425_98(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5a0e6b85fbdca4bc_originalDynamicSite425_107(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5a0e6b85fbdca4bc_originalDynamicSite425_109(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5a0e6b85fbdca4bc_originalDynamicSite425_116(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5a0e6b85fbdca4bc_originalDynamicSite425_122(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5a0e6b85fbdca4bc_originalDynamicSite425_124(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5a0e6b85fbdca4bc_originalDynamicSite425_131(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5a0e6b85fbdca4bc_originalDynamicSite425_138(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5a0e6b85fbdca4bc_originalDynamicSite425_140(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5a0e6b85fbdca4bc_originalDynamicSite425_147(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5a0e6b85fbdca4bc_originalDynamicSite425_155(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5a0e6b85fbdca4bc_originalDynamicSite425_157(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5a0e6b85fbdca4bc_originalDynamicSite425_163(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5a0e6b85fbdca4bc_originalDynamicSite425_170(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5a0e6b85fbdca4bc_originalDynamicSite425_176(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5a0e6b85fbdca4bc_originalDynamicSite425_184(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5a0e6b85fbdca4bc_originalDynamicSite425_190(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5a0e6b85fbdca4bc_originalDynamicSite425_198(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5a0e6b85fbdca4bc_originalDynamicSite425_200(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5a0e6b85fbdca4bc_originalDynamicSite425_206(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5a0e6b85fbdca4bc_originalDynamicSite425_208(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral8030_0() throws E;
}
