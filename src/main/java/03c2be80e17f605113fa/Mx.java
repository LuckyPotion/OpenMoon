package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Mx implements java.util.Iterator<moom.DT> {

private moom.My a;

private moom.DX b;

private int c;

private int d;

private int e;

private int f;

private static long g;

private static java.lang.String h;

private static long[] i;

private static java.lang.Integer[] j;

private static java.util.Map k;

public Mx(moom.DT p0, moom.DT p1, int p2, int p3) { super(); }


private static void __sourceConstructorBody_fc4277849203b222(moom.Mx receiver, moom.DT p0, moom.DT p1, int p2, int p3) throws Throwable {

int __initValue596_27_0;

    int __initValue596_29_0;

    int __initValue596_38_0;

    int __initValue596_40_0;

    int __initValue596_49_0;

    int __initValue596_51_0;

    moom.Mx __initValue596_72_0;

    int __initValue596_72_1;

    moom.Mx __initValue596_73_0;

    moom.Mx __initValue596_74_0;

    int __initValue596_74_1;

    moom.Mx __initValue596_81_0;

    int __initValue596_81_1;

    moom.Mx __initValue596_82_0;

    moom.Mx __initValue596_83_0;

    int __initValue596_83_1;

    moom.Mx __initValue596_90_0;

    int __initValue596_90_1;

    moom.Mx __initValue596_91_0;

    moom.Mx __initValue596_92_0;

    int __initValue596_92_1;

    int __initValue596_251_0;

    int __initValue596_257_0;

    long local5_life2;

    int local7_life8;

    int local8_life12;

    int local9_life16;

    int local10_life20;

    moom.DR local11_life38;

    moom.DR local12_life40;

    moom.DR local13_life41;

    double local14_life43;

    double local16_life45;

    moom.DR local18_life46;

    double local19_life48;

    double local21_life50;

    moom.DR local23_life51;

    double local24_life53;

    double local26_life55;

    moom.DT local28_life66;

    moom.DT local29_life70;

    int local30_life73;

    double local31_life76;

    double local33_life79;

    init_join_400: {

    init_join_330: {

    init_join_257: {

    init_join_251: {

    init_join_248: {

    init_join_92: {

    init_join_91: {

    init_join_90: {

    init_join_83: {

    init_join_82: {

    init_join_81: {

    init_join_74: {

    init_join_73: {

    init_join_72: {

    init_join_51: {

    init_join_50: {

    init_join_49: {

    init_join_40: {

    init_join_39: {

    init_join_38: {

    init_join_29: {

    init_join_28: {

    init_join_27: {

    local5_life2 = (moom.Mx.g ^ 59681558115601L);

    int __sourceSpill596_4 = moom.MS.c();

    moom.Mx.__sourceConstructorInit_fc4277849203b222_0(((moom.Mx)(receiver)));

    ((moom.Mx)(receiver)).b = ((moom.DX)(new moom.DX(0, 0, 0)));

    ((moom.Mx)(receiver)).c = ((int)(0));

    local7_life8 = __sourceSpill596_4;

    int __sourceSpill596_10 = ((moom.DT)(p0)).a();

    if (!((local7_life8 != 0))) {

        __initValue596_27_0 = __sourceSpill596_10;

        break init_join_27;

    }

    if (!((__sourceSpill596_10 > ((moom.DT)(p1)).a()))) {

        break init_join_28;

    }

    __initValue596_27_0 = 1;

    }

    __initValue596_29_0 = __initValue596_27_0;

    break init_join_29;

    }

    __initValue596_29_0 = 0;

    }

    local8_life12 = __initValue596_29_0;

    int __sourceSpill596_14 = ((moom.DT)(p0)).b();

    if (!((local7_life8 != 0))) {

        __initValue596_38_0 = __sourceSpill596_14;

        break init_join_38;

    }

    if (!((__sourceSpill596_14 > ((moom.DT)(p1)).b()))) {

        break init_join_39;

    }

    __initValue596_38_0 = 1;

    }

    __initValue596_40_0 = __initValue596_38_0;

    break init_join_40;

    }

    __initValue596_40_0 = 0;

    }

    local9_life16 = __initValue596_40_0;

    int __sourceSpill596_18 = ((moom.DT)(p0)).c();

    if (!((local7_life8 != 0))) {

        __initValue596_49_0 = __sourceSpill596_18;

        break init_join_49;

    }

    if (!((__sourceSpill596_18 > ((moom.DT)(p1)).c()))) {

        break init_join_50;

    }

    __initValue596_49_0 = 1;

    }

    __initValue596_51_0 = __initValue596_49_0;

    break init_join_51;

    }

    __initValue596_51_0 = 0;

    }

    local10_life20 = __initValue596_51_0;

    p0 = ((moom.Mx)(receiver)).a(((moom.DT)(p0)), ((boolean)__sourceIntrinsic_integerToBoolean((local8_life12))), ((boolean)__sourceIntrinsic_integerToBoolean((local9_life16))), ((boolean)__sourceIntrinsic_integerToBoolean((local10_life20))));

    p1 = ((moom.Mx)(receiver)).a(((moom.DT)(p1)), ((boolean)__sourceIntrinsic_integerToBoolean((local8_life12))), ((boolean)__sourceIntrinsic_integerToBoolean((local9_life16))), ((boolean)__sourceIntrinsic_integerToBoolean((local10_life20))));

    moom.Mx __sourceSpill596_23 = receiver;

    int __sourceSpill596_24 = local8_life12;

    if (!((local7_life8 != 0))) {

        __initValue596_72_0 = __sourceSpill596_23;

        __initValue596_72_1 = __sourceSpill596_24;

        break init_join_72;

    }

    if (!((__sourceSpill596_24 != 0))) {

        __initValue596_73_0 = __sourceSpill596_23;

        break init_join_73;

    }

    __initValue596_72_0 = __sourceSpill596_23;

    __initValue596_72_1 = -1;

    }

    __initValue596_74_0 = __initValue596_72_0;

    __initValue596_74_1 = __initValue596_72_1;

    break init_join_74;

    }

    __initValue596_74_0 = __initValue596_73_0;

    __initValue596_74_1 = 1;

    }

    ((moom.Mx)(__initValue596_74_0)).d = ((int)(__initValue596_74_1));

    moom.Mx __sourceSpill596_26 = receiver;

    int __sourceSpill596_27 = local9_life16;

    if (!((local7_life8 != 0))) {

        __initValue596_81_0 = __sourceSpill596_26;

        __initValue596_81_1 = __sourceSpill596_27;

        break init_join_81;

    }

    if (!((__sourceSpill596_27 != 0))) {

        __initValue596_82_0 = __sourceSpill596_26;

        break init_join_82;

    }

    __initValue596_81_0 = __sourceSpill596_26;

    __initValue596_81_1 = -1;

    }

    __initValue596_83_0 = __initValue596_81_0;

    __initValue596_83_1 = __initValue596_81_1;

    break init_join_83;

    }

    __initValue596_83_0 = __initValue596_82_0;

    __initValue596_83_1 = 1;

    }

    ((moom.Mx)(__initValue596_83_0)).e = ((int)(__initValue596_83_1));

    moom.Mx __sourceSpill596_29 = receiver;

    int __sourceSpill596_30 = local10_life20;

    if (!((local7_life8 != 0))) {

        __initValue596_90_0 = __sourceSpill596_29;

        __initValue596_90_1 = __sourceSpill596_30;

        break init_join_90;

    }

    if (!((__sourceSpill596_30 != 0))) {

        __initValue596_91_0 = __sourceSpill596_29;

        break init_join_91;

    }

    __initValue596_90_0 = __sourceSpill596_29;

    __initValue596_90_1 = -1;

    }

    __initValue596_92_0 = __initValue596_90_0;

    __initValue596_92_1 = __initValue596_90_1;

    break init_join_92;

    }

    __initValue596_92_0 = __initValue596_91_0;

    __initValue596_92_1 = 1;

    }

    ((moom.Mx)(__initValue596_92_0)).f = ((int)(__initValue596_92_1));

    local11_life38 = new moom.DR(((double) (((moom.DT)(p1)).a() - ((moom.DT)(p0)).a())), ((double) (((moom.DT)(p1)).b() - ((moom.DT)(p0)).b())), ((double) (((moom.DT)(p1)).c() - ((moom.DT)(p0)).c())));

    local12_life40 = ((moom.DR)(local11_life38)).a__DR();

    local13_life41 = new moom.DR(0x1.0p0d, 0x0.0p0d, 0x0.0p0d);

    local14_life43 = ((moom.DR)(local12_life40)).a(((moom.DR)(local13_life41)));

    local16_life45 = java.lang.Math.abs(((double)(local14_life43)));

    local18_life46 = new moom.DR(0x0.0p0d, 0x1.0p0d, 0x0.0p0d);

    local19_life48 = ((moom.DR)(local12_life40)).a(((moom.DR)(local18_life46)));

    local21_life50 = java.lang.Math.abs(((double)(local19_life48)));

    local23_life51 = new moom.DR(0x0.0p0d, 0x0.0p0d, 0x1.0p0d);

    local24_life53 = ((moom.DR)(local12_life40)).a(((moom.DR)(local23_life51)));

    local26_life55 = java.lang.Math.abs(((double)(local24_life53)));

    int __sourceSpill596_57 = recovery.source.CarrierOps.dcmpl(((double)(local26_life55)), ((double)(local21_life50)));

    if (!((local7_life8 != 0))) {

        __initValue596_251_0 = __sourceSpill596_57;

        break init_join_251;

    }

    if (!((__sourceSpill596_57 >= 0))) {

        break init_join_248;

    }

    int __sourceSpill596_59 = recovery.source.CarrierOps.dcmpl(((double)(local26_life55)), ((double)(local16_life45)));

    if (!((local7_life8 != 0))) {

        __initValue596_251_0 = __sourceSpill596_59;

        break init_join_251;

    }

    if (!((__sourceSpill596_59 >= 0))) {

        break init_join_248;

    }

    ((moom.Mx)(receiver)).c = ((int)(__sourceIntrinsic_fc4277849203b222_originalDynamicSite596_61(32276, (2008876668814221750L ^ local5_life2))));

    local28_life66 = new moom.DT(((moom.DT)(p0)).c(), (((moom.DT)(p0)).b() - p2), (((moom.DT)(p0)).a() - p3));

    local29_life70 = new moom.DT(((moom.DT)(p1)).c(), ((((moom.DT)(p0)).b() + p2) + 1), ((((moom.DT)(p0)).a() + p3) + 1));

    local30_life73 = (((moom.DT)(p1)).c() - ((moom.DT)(p0)).c());

    local31_life76 = (((double) (((moom.DT)(p1)).b() - ((moom.DT)(p0)).b())) / ((double) local30_life73));

    local33_life79 = (((double) (((moom.DT)(p1)).a() - ((moom.DT)(p0)).a())) / ((double) local30_life73));

    ((moom.Mx)(receiver)).a = ((moom.My)(new moom.My(local28_life66, local29_life70, local31_life76, local33_life79)));

    if (!((local7_life8 == 0))) {

        break init_join_400;

    }

    }

    __initValue596_251_0 = recovery.source.CarrierOps.dcmpl(((double)(local21_life50)), ((double)(local16_life45)));

    }

    int __sourceSpill596_82 = __initValue596_251_0;

    if (!((local7_life8 != 0))) {

        __initValue596_257_0 = __sourceSpill596_82;

        break init_join_257;

    }

    if (!((__sourceSpill596_82 >= 0))) {

        break init_join_330;

    }

    __initValue596_257_0 = recovery.source.CarrierOps.dcmpl(((double)(local21_life50)), ((double)(local26_life55)));

    }

    if (!((__initValue596_257_0 >= 0))) {

        break init_join_330;

    }

    ((moom.Mx)(receiver)).c = ((int)(1));

    local28_life66 = new moom.DT(((moom.DT)(p0)).b(), (((moom.DT)(p0)).a() - p2), (((moom.DT)(p0)).c() - p3));

    local29_life70 = new moom.DT(((moom.DT)(p1)).b(), ((((moom.DT)(p0)).a() + p2) + 1), ((((moom.DT)(p0)).c() + p3) + 1));

    local30_life73 = (((moom.DT)(p1)).b() - ((moom.DT)(p0)).b());

    local31_life76 = (((double) (((moom.DT)(p1)).a() - ((moom.DT)(p0)).a())) / ((double) local30_life73));

    local33_life79 = (((double) (((moom.DT)(p1)).c() - ((moom.DT)(p0)).c())) / ((double) local30_life73));

    ((moom.Mx)(receiver)).a = ((moom.My)(new moom.My(local28_life66, local29_life70, local31_life76, local33_life79)));

    if (!((local7_life8 == 0))) {

        break init_join_400;

    }

    }

    ((moom.Mx)(receiver)).c = ((int)(0));

    local28_life66 = new moom.DT(((moom.DT)(p0)).a(), (((moom.DT)(p0)).b() - p2), (((moom.DT)(p0)).c() - p3));

    local29_life70 = new moom.DT(((moom.DT)(p1)).a(), ((((moom.DT)(p0)).b() + p2) + 1), ((((moom.DT)(p0)).c() + p3) + 1));

    local30_life73 = (((moom.DT)(p1)).a() - ((moom.DT)(p0)).a());

    local31_life76 = (((double) (((moom.DT)(p1)).b() - ((moom.DT)(p0)).b())) / ((double) local30_life73));

    local33_life79 = (((double) (((moom.DT)(p1)).c() - ((moom.DT)(p0)).c())) / ((double) local30_life73));

    ((moom.Mx)(receiver)).a = ((moom.My)(new moom.My(local28_life66, local29_life70, local31_life76, local33_life79)));

    }

    return;

}



static {
g = ((long)(((moom._a)(moom._c.a(((long)(-358388410251808892L)), ((long)(4277758014507886705L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(182289595569661L)))));
    long local11_life6 = (moom.Mx.g ^ 25307976732080L);
    javax.crypto.Cipher local13_life8;
    javax.crypto.Cipher __sourceSpill711_10 = (local13_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill711_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill711_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill711_13 = new byte[8];
    (__sourceSpill711_13)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local14_life14 = 1;
    while ((local14_life14 < 8)) {
        (__sourceSpill711_13)[local14_life14] = ((byte) ((int) ((local11_life6 << (local14_life14 * 8)) >>> 56)));
        local14_life14 += 1;
    }
    byte[] __sourcePreallocation711_15 = __sourceSpill711_13;
    ((javax.crypto.Cipher)(__sourceSpill711_10)).init(((int)(__sourceSpill711_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill711_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation711_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    byte[] __sourceSpill711_19 = ((java.lang.String)("ð®\034kQiÍ4\000ugëuf¾")).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __sourceSpill711_20 = local13_life8;
    byte[] local15_life22 = ((javax.crypto.Cipher)(__sourceSpill711_20)).doFinal(((byte[])(__sourceSpill711_19)));
    h = ((java.lang.String)(((java.lang.String)(moom.Mx.a(((byte[])(local15_life22))))).intern()));
    k = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life28;
    javax.crypto.Cipher __sourceSpill711_30 = (local0_life28 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill711_31 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill711_32 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill711_33 = new byte[8];
    (__sourceSpill711_33)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local1_life34 = 1;
    while ((local1_life34 < 8)) {
        (__sourceSpill711_33)[local1_life34] = ((byte) ((int) ((local11_life6 << (local1_life34 * 8)) >>> 56)));
        local1_life34 += 1;
    }
    byte[] __sourcePreallocation711_35 = __sourceSpill711_33;
    ((javax.crypto.Cipher)(__sourceSpill711_30)).init(((int)(__sourceSpill711_31)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill711_32)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation711_35)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life38 = new long[7];
    int local3_life39 = 0;
    java.lang.String local4_life40;
    int local5_life42 = ((java.lang.String)((local4_life40 = "½VÌÈù@[s\f\035­ËÆr\177+Èjò:Ç$\021>uÒÇ<»Û ·"))).length();
    int local2_life43 = 0;
    do {
        java.lang.String __sourceSpill711_44 = local4_life40;
        int __sourceSpill711_45 = local2_life43;
        local2_life43 += 8;
        byte[] local7_life48 = ((java.lang.String)(((java.lang.String)(__sourceSpill711_44)).substring(((int)(__sourceSpill711_45)), ((int)(local2_life43))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill711_49 = local6_life38;
        int __sourceSpill711_50 = local3_life39;
        local3_life39 += 1;
        long local8_life51 = (((((((((((long) (local7_life48)[0]) & 255L) << 56) | ((((long) (local7_life48)[1]) & 255L) << 48)) | ((((long) (local7_life48)[2]) & 255L) << 40)) | ((((long) (local7_life48)[3]) & 255L) << 32)) | ((((long) (local7_life48)[4]) & 255L) << 24)) | ((((long) (local7_life48)[5]) & 255L) << 16)) | ((((long) (local7_life48)[6]) & 255L) << 8)) | (((long) (local7_life48)[7]) & 255L));
        byte[] __sourceSpill711_52 = new byte[8];
        (__sourceSpill711_52)[0] = ((byte) ((int) (local8_life51 >>> 56)));
        (__sourceSpill711_52)[1] = ((byte) ((int) (local8_life51 >>> 48)));
        (__sourceSpill711_52)[2] = ((byte) ((int) (local8_life51 >>> 40)));
        (__sourceSpill711_52)[3] = ((byte) ((int) (local8_life51 >>> 32)));
        (__sourceSpill711_52)[4] = ((byte) ((int) (local8_life51 >>> 24)));
        (__sourceSpill711_52)[5] = ((byte) ((int) (local8_life51 >>> 16)));
        (__sourceSpill711_52)[6] = ((byte) ((int) (local8_life51 >>> 8)));
        (__sourceSpill711_52)[7] = ((byte) ((int) local8_life51));
        javax.crypto.Cipher __sourceSpill711_53 = local0_life28;
        byte[] local10_life55 = ((javax.crypto.Cipher)(__sourceSpill711_53)).doFinal(((byte[])(__sourceSpill711_52)));
        (__sourceSpill711_49)[__sourceSpill711_50] = (((((((((((long) (local10_life55)[0]) & 255L) << 56) | ((((long) (local10_life55)[1]) & 255L) << 48)) | ((((long) (local10_life55)[2]) & 255L) << 40)) | ((((long) (local10_life55)[3]) & 255L) << 32)) | ((((long) (local10_life55)[4]) & 255L) << 24)) | ((((long) (local10_life55)[5]) & 255L) << 16)) | ((((long) (local10_life55)[6]) & 255L) << 8)) | (((long) (local10_life55)[7]) & 255L));
    } while ((!(local2_life43 >= local5_life42)));
    local5_life42 = ((java.lang.String)((local4_life40 = "_ñþpÎ6@1Ð\n\034\002£,"))).length();
    local2_life43 = 0;
    do {
        java.lang.String __sourceSpill711_57 = local4_life40;
        int __sourceSpill711_58 = local2_life43;
        local2_life43 += 8;
        byte[] local7_life61 = ((java.lang.String)(((java.lang.String)(__sourceSpill711_57)).substring(((int)(__sourceSpill711_58)), ((int)(local2_life43))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill711_62 = local6_life38;
        int __sourceSpill711_63 = local3_life39;
        local3_life39 += 1;
        long local8_life64 = (((((((((((long) (local7_life61)[0]) & 255L) << 56) | ((((long) (local7_life61)[1]) & 255L) << 48)) | ((((long) (local7_life61)[2]) & 255L) << 40)) | ((((long) (local7_life61)[3]) & 255L) << 32)) | ((((long) (local7_life61)[4]) & 255L) << 24)) | ((((long) (local7_life61)[5]) & 255L) << 16)) | ((((long) (local7_life61)[6]) & 255L) << 8)) | (((long) (local7_life61)[7]) & 255L));
        byte[] __sourceSpill711_65 = new byte[8];
        (__sourceSpill711_65)[0] = ((byte) ((int) (local8_life64 >>> 56)));
        (__sourceSpill711_65)[1] = ((byte) ((int) (local8_life64 >>> 48)));
        (__sourceSpill711_65)[2] = ((byte) ((int) (local8_life64 >>> 40)));
        (__sourceSpill711_65)[3] = ((byte) ((int) (local8_life64 >>> 32)));
        (__sourceSpill711_65)[4] = ((byte) ((int) (local8_life64 >>> 24)));
        (__sourceSpill711_65)[5] = ((byte) ((int) (local8_life64 >>> 16)));
        (__sourceSpill711_65)[6] = ((byte) ((int) (local8_life64 >>> 8)));
        (__sourceSpill711_65)[7] = ((byte) ((int) local8_life64));
        javax.crypto.Cipher __sourceSpill711_66 = local0_life28;
        byte[] local10_life68 = ((javax.crypto.Cipher)(__sourceSpill711_66)).doFinal(((byte[])(__sourceSpill711_65)));
        (__sourceSpill711_62)[__sourceSpill711_63] = (((((((((((long) (local10_life68)[0]) & 255L) << 56) | ((((long) (local10_life68)[1]) & 255L) << 48)) | ((((long) (local10_life68)[2]) & 255L) << 40)) | ((((long) (local10_life68)[3]) & 255L) << 32)) | ((((long) (local10_life68)[4]) & 255L) << 24)) | ((((long) (local10_life68)[5]) & 255L) << 16)) | ((((long) (local10_life68)[6]) & 255L) << 8)) | (((long) (local10_life68)[7]) & 255L));
    } while ((!(local2_life43 >= local5_life42)));
    i = ((long[])(local6_life38));
    j = ((java.lang.Integer[])(new java.lang.Integer[7]));
}

private static native <E extends Throwable> void __sourceConstructorInit_fc4277849203b222_0(moom.Mx a0) throws E;

public static void main(java.lang.String[] p0) {
int spill974_0;
    long life1_9;
    moom.DT life4_28;
    moom.DT life5_48;
    int life3_49;
    moom.Mx life6_57;
    moom.DT life7_63;
    lexical_join_70: {
    life1_9 = (((moom._a)(moom._c.a(((long)(4287537365912066788L)), ((long)(-3413385212936169279L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(245626175087524L))) ^ 61579522792876L);
    life4_28 = new moom.DT(__sourceIntrinsic_0809c461f4f8_invokedynamic974_4(31231, (5813352578870392167L ^ life1_9)), __sourceIntrinsic_0809c461f4f8_invokedynamic974_5(203, (68983510806645845L ^ life1_9)), __sourceIntrinsic_0809c461f4f8_invokedynamic974_6(29905, (7550539184783472716L ^ life1_9)));
    spill974_0 = moom.MS.b();
    life5_48 = new moom.DT(__sourceIntrinsic_0809c461f4f8_invokedynamic974_8(17572, (2388548328092207165L ^ life1_9)), __sourceIntrinsic_0809c461f4f8_invokedynamic974_9(19655, (1113671440846127197L ^ life1_9)), __sourceIntrinsic_0809c461f4f8_invokedynamic974_10(23314, (3085684654085052302L ^ life1_9)));
    life3_49 = spill974_0;
    life6_57 = new moom.Mx(life4_28, life5_48, 1, 1);
    lexical_cycle_58: while (true) {
    if (!(((moom.Mx)(life6_57)).hasNext())) {
        break lexical_join_70;
    }
    life7_63 = ((moom.Mx)(life6_57)).a();
    ((java.io.PrintStream)(java.lang.System.out)).println(((java.lang.String)(__sourceIntrinsic_0809c461f4f8_invokedynamic974_14(life7_63))));
    if (!((life3_49 != 0))) { continue lexical_cycle_58; }
    break lexical_cycle_58;
    }
    }
    return;
}


public void remove() {
long local1 = (moom.Mx.g ^ 8998811376942L);
    throw new java.lang.RuntimeException(moom.Mx.h);
}


public boolean hasNext() {
return (__sourceIntrinsic_booleanComparison((((moom.My)(this.a)).hasNext())) != 0);
}


private static java.lang.String a(byte[] p0) {
int life1_1;
    int life2_5;
    char[] life3_7;
    int life4_9;
    int life5_19;
    int life6_39;
    int life5_44;
    int life6_52;
    int life6_71;
    int life5_76;
    int life6_86;
    int life5_91;
    int life6_99;
    life1_1 = 0;
    life3_7 = new char[(life2_5 = (p0).length)];
    life4_9 = 0;
    loop_region_10: while ((life4_9 < life2_5)) {
        if (((life5_19 = (255 & (p0)[life4_9])) < 192)) {
        (life3_7)[(life1_1++)] = ((char) life5_19);
    } else {
        if ((life5_19 < 224)) {
        life6_39 = ((int)(((char) (((char) (life5_19 & 31)) << 6))));
        byte[] spill3258_0 = p0;
        life4_9 += 1;
        life5_44 = (spill3258_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill3258_1 = p0;
        life4_9 += 1;
        life5_76 = (spill3258_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill3258_2 = p0;
        life4_9 += 1;
        life5_91 = (spill3258_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static int a(int p0, long p1) {
int n4 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x38F3;
        if (j[n4] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = i[n4];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])k.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    k.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/Mx", exception);
            }
            int n8 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Mx.j[n4] = n8;
        }
        return j[n4];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.Mx.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral6487_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Mx"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.RuntimeException a(java.lang.RuntimeException p0) {
return p0;
}


private moom.DT a(moom.DT p0, boolean p1, boolean p2, boolean p3) {
int forwardValue2755_22_0;
    int forwardValue2755_37_0;
    boolean spill2755_0;
    long life5_3;
    int life7_5;
    forward_join_49: {
    forward_join_37: {
    forward_join_36: {
    forward_join_22: {
    forward_join_21: {
    life5_3 = (moom.Mx.g ^ 41796275043652L);
    life7_5 = moom.MS.b();
    spill2755_0 = p1;
    if (!((life7_5 == 0))) {
        forwardValue2755_22_0 = ((spill2755_0) ? 1 : 0);
        break forward_join_22;
    }
    if (!(spill2755_0)) {
        break forward_join_21;
    }
    p0 = new moom.DT((-((moom.DT)(p0)).a()), ((moom.DT)(p0)).b(), ((moom.DT)(p0)).c());
    }
    forwardValue2755_22_0 = ((p2) ? 1 : 0);
    }
    if (!((life7_5 == 0))) {
        forwardValue2755_37_0 = forwardValue2755_22_0;
        break forward_join_37;
    }
    if (!((forwardValue2755_22_0 != 0))) {
        break forward_join_36;
    }
    p0 = new moom.DT(((moom.DT)(p0)).a(), (-((moom.DT)(p0)).b()), ((moom.DT)(p0)).c());
    }
    forwardValue2755_37_0 = ((p3) ? 1 : 0);
    }
    if (!((forwardValue2755_37_0 != 0))) {
        break forward_join_49;
    }
    p0 = new moom.DT(((moom.DT)(p0)).a(), ((moom.DT)(p0)).b(), (-((moom.DT)(p0)).c()));
    }
    return p0;
}


public moom.DT a() {
moom.Mx forwardValue293_76_0;
    int spill293_0;
    moom.Mx spill293_1;
    long life1_3;
    moom.DT life4_8;
    int life3_9;
    forward_join_76: {
    forward_join_57: {
    forward_join_36: {
    forward_join_15: {
    life1_3 = (moom.Mx.g ^ 72053348751223L);
    spill293_0 = moom.MS.b();
    life4_8 = ((moom.My)(this.a)).a();
    life3_9 = spill293_0;
    spill293_1 = this;
    if (!((life3_9 == 0))) {
        forwardValue293_76_0 = spill293_1;
        break forward_join_76;
    }
    switch (((moom.Mx)(spill293_1)).c) {
case 1:
{
        break forward_join_15;
    }
case 2:
{
        break forward_join_36;
    }
default:
{
        break forward_join_57;
    }
}
    }
    ((moom.DX)(this.b)).a__Void(((int)((((moom.DT)(life4_8)).b() * this.d))), ((int)((((moom.DT)(life4_8)).a() * this.e))), ((int)((((moom.DT)(life4_8)).c() * this.f))));
    return this.b;
    }
    ((moom.DX)(this.b)).a__Void(((int)((((moom.DT)(life4_8)).c() * this.d))), ((int)((((moom.DT)(life4_8)).b() * this.e))), ((int)((((moom.DT)(life4_8)).a() * this.f))));
    return this.b;
    }
    ((moom.DX)(this.b)).a__Void(((int)((((moom.DT)(life4_8)).a() * this.d))), ((int)((((moom.DT)(life4_8)).b() * this.e))), ((int)((((moom.DT)(life4_8)).c() * this.f))));
    forwardValue293_76_0 = this;
    }
    return ((moom.Mx)(forwardValue293_76_0)).b;
}


private static native <E extends Throwable> int __sourceIntrinsic_fc4277849203b222_originalDynamicSite596_61(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral6487_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0809c461f4f8_invokedynamic974_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0809c461f4f8_invokedynamic974_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0809c461f4f8_invokedynamic974_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0809c461f4f8_invokedynamic974_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0809c461f4f8_invokedynamic974_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0809c461f4f8_invokedynamic974_10(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_0809c461f4f8_invokedynamic974_14(moom.DT a0) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native int __sourceIntrinsic_booleanComparison(boolean value);

public java.lang.Object next__sourceBridge_0502b11602() {
return ((moom.Mx)(this)).a();
}

public moom.DT next() { return ((moom.DT)(this.next__sourceBridge_0502b11602())); }
}
