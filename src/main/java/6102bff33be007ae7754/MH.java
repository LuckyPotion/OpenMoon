package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class MH {

int a;

int b;

int c;

int d;

boolean e;

boolean f;

boolean g;

long[] h;

int i;

private static long j;

private static long[] k;

private static java.lang.Integer[] l;

private static java.util.Map m;

public MH() { super(); }


private static void __sourceConstructorBody_12b7fbf1b1e11295(moom.MH receiver) throws Throwable {

long local1 = (moom.MH.j ^ 118005294515463L);

    moom.MH.__sourceConstructorInit_12b7fbf1b1e11295_0(((moom.MH)(receiver)));

    ((moom.MH)(receiver)).h = ((long[])(new long[__sourceIntrinsic_12b7fbf1b1e11295_originalDynamicSite2420_2(12360, (4783889812152804599L ^ local1))]));

    ((moom.MH)(receiver)).i = ((int)(0));

    (((moom.MH)(receiver)).h)[((moom.MH)(receiver)).i] = 0L;

    return;

}



static {
j = ((long)(((moom._a)(moom._c.a(((long)(3377967971143640604L)), ((long)(-1920992344751618504L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(103024081107683L)))));
    m = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.MH.j ^ 94014627721496L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1001_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1001_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1001_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1001_14 = new byte[8];
    (__sourceSpill1001_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1001_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1001_16 = __sourceSpill1001_14;
    ((javax.crypto.Cipher)(__sourceSpill1001_11)).init(((int)(__sourceSpill1001_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1001_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1001_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[24];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "`úËÐ¾ÕìD\032ý\0235\020\020\177/\007«2ÖÒÅaÍ´0Æ§Õß­\022ó\r8\033\005êW)j,]R@¸¾TÎm\0041\020qM¾iÏ?üÌènD¦¾'sUÕqYye\034Û¨©h^¤H§&OÃ¥Er+¸ìCeýÒ¨&-$×Ì3@³\021¬\\FØÇJdlåë<ÕÑâ\016ÏÙe ®UdxüeØ¨®\177þ¬»ÍR*-\013§\nkÿÌ\034ÛÒ4Im¸"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1001_25 = local6_life21;
        int __sourceSpill1001_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1001_25)).substring(((int)(__sourceSpill1001_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1001_30 = local8_life19;
        int __sourceSpill1001_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1001_33 = new byte[8];
        (__sourceSpill1001_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1001_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1001_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1001_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1001_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1001_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1001_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1001_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1001_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1001_34)).doFinal(((byte[])(__sourceSpill1001_33)));
        (__sourceSpill1001_30)[__sourceSpill1001_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "\023-[\"Ï\001\001*µDYÏ'AM"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1001_38 = local6_life21;
        int __sourceSpill1001_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1001_38)).substring(((int)(__sourceSpill1001_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1001_43 = local8_life19;
        int __sourceSpill1001_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1001_46 = new byte[8];
        (__sourceSpill1001_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1001_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1001_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1001_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1001_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1001_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1001_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1001_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1001_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1001_47)).doFinal(((byte[])(__sourceSpill1001_46)));
        (__sourceSpill1001_43)[__sourceSpill1001_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    k = ((long[])(local8_life19));
    l = ((java.lang.Integer[])(new java.lang.Integer[24]));
}

private static native <E extends Throwable> void __sourceConstructorInit_12b7fbf1b1e11295_0(moom.MH a0) throws E;

public static void b(moom.lw p0) {
((moom.MH)(((moom.lw)(p0)).t)).a();
    return;
}


public static void e(moom.lw p0) {
int forwardValue2671_26_0;
    int forwardValue2671_26_1;
    int forwardValue2671_32_0;
    int forwardValue2671_32_1;
    int spill2671_0;
    int spill2671_1;
    int spill2671_2;
    long life1_3;
    moom.MH life4_7;
    int life3_8;
    long life5_64;
    int life7_79;
    forward_join_87: {
    forward_join_44: {
    forward_join_32: {
    forward_join_26: {
    life1_3 = (moom.MH.j ^ 42652192511802L);
    spill2671_0 = moom.MS.b();
    life4_7 = ((moom.lw)(p0)).t;
    life3_8 = spill2671_0;
    spill2671_1 = ((moom.MH)(life4_7)).a;
    spill2671_2 = __sourceIntrinsic_bea88ae45088_invokedynamic2671_4(6708, (1784826765803396259L ^ life1_3));
    if (!((life3_8 == 0))) {
        forwardValue2671_26_0 = spill2671_1;
        forwardValue2671_26_1 = spill2671_2;
        break forward_join_26;
    }
    if (!((spill2671_1 == spill2671_2))) {
        break forward_join_87;
    }
    forwardValue2671_26_0 = ((moom.lw)(p0)).i;
    forwardValue2671_26_1 = __sourceIntrinsic_bea88ae45088_invokedynamic2671_6(22017, (6853491174546067607L ^ life1_3));
    }
    if (!((life3_8 == 0))) {
        forwardValue2671_32_0 = forwardValue2671_26_0;
        forwardValue2671_32_1 = forwardValue2671_26_1;
        break forward_join_32;
    }
    if (!((forwardValue2671_26_0 == forwardValue2671_26_1))) {
        break forward_join_44;
    }
    forwardValue2671_32_0 = ((moom.lw)(p0)).e;
    forwardValue2671_32_1 = 4;
    }
    if (!(((forwardValue2671_32_0 % forwardValue2671_32_1) == 0))) {
        break forward_join_44;
    }
    ((moom.MH)(life4_7)).a(((moom.lw)(p0)), ((int)((((moom.lw)(p0)).a__Int() - (4 * ((moom.MH)(life4_7)).a)))));
    }
    life5_64 = (((moom.MH)(life4_7)).h)[((moom.MH)(life4_7)).i];
    life7_79 = ((((moom.lw)(p0)).a__Int() - __sourceIntrinsic_bea88ae45088_invokedynamic2671_14(6708, (1784826765803396259L ^ life1_3))) + __sourceIntrinsic_bea88ae45088_invokedynamic2671_15(9659, (6370687311306695466L ^ life1_3)));
    ((java.nio.IntBuffer)(((moom.lw)(p0)).b)).put(((int)(life7_79)), ((int)(((int) life5_64))));
    ((java.nio.IntBuffer)(((moom.lw)(p0)).b)).put(((int)((life7_79 + 1))), ((int)(((int) (life5_64 >> __sourceIntrinsic_bea88ae45088_invokedynamic2671_19(22355, (2866127290818908614L ^ life1_3)))))));
    }
    return;
}


public static void c(moom.lw p0) {
moom.MH forwardValue2669_41_0;
    int forwardValue2669_41_1;
    moom.MH forwardValue2669_42_0;
    moom.MH forwardValue2669_43_0;
    int forwardValue2669_43_1;
    moom.MH forwardValue2669_55_0;
    int forwardValue2669_55_1;
    moom.MH forwardValue2669_56_0;
    moom.MH forwardValue2669_57_0;
    int forwardValue2669_57_1;
    int spill2669_0;
    moom.MH spill2669_1;
    boolean spill2669_2;
    moom.MH spill2669_3;
    boolean spill2669_4;
    long life1_3;
    moom.MH life4_6;
    moom.oD life5_10;
    int life3_11;
    forward_join_57: {
    forward_join_56: {
    forward_join_55: {
    forward_join_43: {
    forward_join_42: {
    forward_join_41: {
    life1_3 = (moom.MH.j ^ 55856086533797L);
    life4_6 = ((moom.lw)(p0)).t;
    spill2669_0 = moom.MS.c();
    life5_10 = ((moom.lw)(p0)).a__oD();
    life3_11 = spill2669_0;
    ((moom.MH)(life4_6)).a = ((int)((((moom.oD)(life5_10)).d() / 4)));
    ((moom.MH)(life4_6)).e = ((boolean)(((moom.oD)(life5_10)).a__Boolean()));
    ((moom.MH)(life4_6)).f = ((boolean)(((moom.MH)(life4_6)).e));
    ((moom.MH)(life4_6)).g = ((boolean)(((moom.oD)(life5_10)).a__Boolean(((int)(0)))));
    spill2669_1 = life4_6;
    spill2669_2 = ((moom.MH)(life4_6)).e;
    if (!((life3_11 != 0))) {
        forwardValue2669_41_0 = spill2669_1;
        forwardValue2669_41_1 = ((spill2669_2) ? 1 : 0);
        break forward_join_41;
    }
    if (!(spill2669_2)) {
        forwardValue2669_42_0 = spill2669_1;
        break forward_join_42;
    }
    forwardValue2669_41_0 = spill2669_1;
    forwardValue2669_41_1 = (((moom.oD)(life5_10)).a() / 4);
    }
    forwardValue2669_43_0 = forwardValue2669_41_0;
    forwardValue2669_43_1 = forwardValue2669_41_1;
    break forward_join_43;
    }
    forwardValue2669_43_0 = forwardValue2669_42_0;
    forwardValue2669_43_1 = 0;
    }
    ((moom.MH)(forwardValue2669_43_0)).b = ((int)(forwardValue2669_43_1));
    spill2669_3 = life4_6;
    spill2669_4 = ((moom.MH)(life4_6)).g;
    if (!((life3_11 != 0))) {
        forwardValue2669_55_0 = spill2669_3;
        forwardValue2669_55_1 = ((spill2669_4) ? 1 : 0);
        break forward_join_55;
    }
    if (!(spill2669_4)) {
        forwardValue2669_56_0 = spill2669_3;
        break forward_join_56;
    }
    forwardValue2669_55_0 = spill2669_3;
    forwardValue2669_55_1 = (((moom.oD)(life5_10)).a(((int)(0))) / 4);
    }
    forwardValue2669_57_0 = forwardValue2669_55_0;
    forwardValue2669_57_1 = forwardValue2669_55_1;
    break forward_join_57;
    }
    forwardValue2669_57_0 = forwardValue2669_56_0;
    forwardValue2669_57_1 = 0;
    }
    ((moom.MH)(forwardValue2669_57_0)).c = ((int)(forwardValue2669_57_1));
    ((moom.MH)(life4_6)).d = ((int)(__sourceIntrinsic_3347870235bf_invokedynamic2669_20(8587, (4779850820582798992L ^ life1_3))));
    return;
}


public static void f(moom.lw p0) {
int forwardValue2672_26_0;
    int forwardValue2672_26_1;
    int forwardValue2672_32_0;
    int forwardValue2672_32_1;
    int spill2672_0;
    int spill2672_1;
    int spill2672_2;
    long life1_3;
    moom.MH life4_7;
    int life3_8;
    forward_join_44: {
    forward_join_32: {
    forward_join_26: {
    life1_3 = (moom.MH.j ^ 71113256235886L);
    spill2672_0 = moom.MS.b();
    life4_7 = ((moom.lw)(p0)).t;
    life3_8 = spill2672_0;
    spill2672_1 = ((moom.MH)(life4_7)).a;
    spill2672_2 = __sourceIntrinsic_212883504585_invokedynamic2672_4(6708, (1784722993566120183L ^ life1_3));
    if (!((life3_8 == 0))) {
        forwardValue2672_26_0 = spill2672_1;
        forwardValue2672_26_1 = spill2672_2;
        break forward_join_26;
    }
    if (!((spill2672_1 == spill2672_2))) {
        break forward_join_44;
    }
    forwardValue2672_26_0 = ((moom.lw)(p0)).i;
    forwardValue2672_26_1 = __sourceIntrinsic_212883504585_invokedynamic2672_6(17094, (3018050552969764864L ^ life1_3));
    }
    if (!((life3_8 == 0))) {
        forwardValue2672_32_0 = forwardValue2672_26_0;
        forwardValue2672_32_1 = forwardValue2672_26_1;
        break forward_join_32;
    }
    if (!((forwardValue2672_26_0 == forwardValue2672_26_1))) {
        break forward_join_44;
    }
    forwardValue2672_32_0 = ((moom.lw)(p0)).e;
    forwardValue2672_32_1 = 4;
    }
    if (!(((forwardValue2672_32_0 % forwardValue2672_32_1) == 0))) {
        break forward_join_44;
    }
    ((moom.MH)(life4_7)).a(((moom.lw)(p0)), ((int)((((moom.lw)(p0)).a__Int() - (4 * ((moom.MH)(life4_7)).a)))));
    }
    return;
}


public static void d(moom.lw p0) {
moom.lw forwardValue2670_12_0;
    moom.lw spill2670_0;
    long life1_3;
    int life3_5;
    forward_join_13: {
    forward_join_12: {
    life1_3 = (moom.MH.j ^ 121642863345551L);
    life3_5 = moom.MS.c();
    spill2670_0 = p0;
    if (!((life3_5 != 0))) {
        forwardValue2670_12_0 = spill2670_0;
        break forward_join_12;
    }
    if (!((((moom.lw)(spill2670_0)).e == 0))) {
        break forward_join_13;
    }
    forwardValue2670_12_0 = p0;
    }
    moom.MH.c(((moom.lw)(forwardValue2670_12_0)));
    }
    return;
}


public static void a(int p0, int p1, int p2, moom.lw p3) {
int forwardValue2664_107_0;
    int forwardValue2664_107_1;
    int spill2664_0;
    int spill2664_1;
    long life4_3;
    int life6_5;
    moom.oD life7_10;
    int life8_13;
    java.nio.ByteBuffer life9_28;
    forward_join_109: {
    forward_join_107: {
    forward_join_105: {
    life4_3 = (moom.MH.j ^ 90412326565538L);
    life6_5 = moom.MS.c();
    if (!((p2 != 0))) {
        break forward_join_109;
    }
    life7_10 = ((moom.lw)(p3)).a__oD();
    life8_13 = ((moom.oD)(life7_10)).d();
    spill2664_0 = life8_13;
    spill2664_1 = __sourceIntrinsic_d5bd3d318e7d_invokedynamic2664_4(24530, (4509608256936474839L ^ life4_3));
    if (!((life6_5 != 0))) {
        forwardValue2664_107_0 = spill2664_0;
        forwardValue2664_107_1 = spill2664_1;
        break forward_join_107;
    }
    if (!((spill2664_0 == spill2664_1))) {
        break forward_join_105;
    }
    life9_28 = ((moom.lw)(p3)).a__ByteBuffer();
    ((java.nio.ByteBuffer)(life9_28)).position(((int)(__sourceIntrinsic_d5bd3d318e7d_invokedynamic2664_6(22355, (2866245830468399198L ^ life4_3)))));
    org.lwjgl.opengl.GL20.glVertexAttribPointer(((int)(moom.MP.aB)), ((int)(2)), ((int)(__sourceIntrinsic_d5bd3d318e7d_invokedynamic2664_9(20617, (6788998324857403284L ^ life4_3)))), ((boolean)(false)), ((int)(life8_13)), ((java.nio.ByteBuffer)(life9_28)));
    ((java.nio.ByteBuffer)(life9_28)).position(((int)(__sourceIntrinsic_d5bd3d318e7d_invokedynamic2664_11(5821, (2367678087231025590L ^ life4_3)))));
    org.lwjgl.opengl.GL20.glVertexAttribPointer(((int)(moom.MP.aC)), ((int)(4)), ((int)(__sourceIntrinsic_d5bd3d318e7d_invokedynamic2664_14(19128, (5539734070841634238L ^ life4_3)))), ((boolean)(false)), ((int)(life8_13)), ((java.nio.ByteBuffer)(life9_28)));
    ((java.nio.ByteBuffer)(life9_28)).position(((int)(__sourceIntrinsic_d5bd3d318e7d_invokedynamic2664_16(1621, (9122644950574342489L ^ life4_3)))));
    org.lwjgl.opengl.GL20.glVertexAttribPointer(((int)(moom.MP.aA)), ((int)(3)), ((int)(__sourceIntrinsic_d5bd3d318e7d_invokedynamic2664_19(27310, (6741119576770399664L ^ life4_3)))), ((boolean)(false)), ((int)(life8_13)), ((java.nio.ByteBuffer)(life9_28)));
    ((java.nio.ByteBuffer)(life9_28)).position(((int)(0)));
    org.lwjgl.opengl.GL20.glEnableVertexAttribArray(((int)(moom.MP.aB)));
    org.lwjgl.opengl.GL20.glEnableVertexAttribArray(((int)(moom.MP.aC)));
    org.lwjgl.opengl.GL20.glEnableVertexAttribArray(((int)(moom.MP.aA)));
    moom.kZ.a__Void(((int)(p0)), ((int)(p1)), ((int)(p2)));
    org.lwjgl.opengl.GL20.glDisableVertexAttribArray(((int)(moom.MP.aB)));
    org.lwjgl.opengl.GL20.glDisableVertexAttribArray(((int)(moom.MP.aC)));
    org.lwjgl.opengl.GL20.glDisableVertexAttribArray(((int)(moom.MP.aA)));
    if (!((life6_5 == 0))) {
        break forward_join_109;
    }
    }
    forwardValue2664_107_0 = p0;
    forwardValue2664_107_1 = p1;
    }
    moom.kZ.a__Void(((int)(forwardValue2664_107_0)), ((int)(forwardValue2664_107_1)), ((int)(p2)));
    }
    return;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_704471783e3d86(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public void a(moom.lw p0, int p1) {
double forwardValue2665_279_0;
    double forwardValue2665_279_1;
    float forwardValue2665_283_0;
    float forwardValue2665_352_0;
    float forwardValue2665_352_1;
    float forwardValue2665_355_0;
    double forwardValue2665_439_0;
    double forwardValue2665_439_1;
    float forwardValue2665_443_0;
    double forwardValue2665_479_0;
    double forwardValue2665_479_1;
    float forwardValue2665_483_0;
    float forwardValue2665_537_0;
    float forwardValue2665_539_0;
    int spill2665_0;
    double spill2665_1;
    double spill2665_2;
    float spill2665_3;
    float spill2665_4;
    double spill2665_5;
    double spill2665_6;
    double spill2665_7;
    double spill2665_8;
    float spill2665_9;
    long life3_3;
    java.nio.FloatBuffer life6_6;
    java.nio.IntBuffer life7_9;
    int life8_12;
    float life9_16;
    float life10_22;
    float life11_28;
    float life12_35;
    float life13_44;
    float life14_52;
    float life15_61;
    float life16_70;
    float life17_80;
    float life18_92;
    float life19_101;
    float life20_112;
    float life21_123;
    float life22_135;
    float life23_149;
    float life24_158;
    float life25_169;
    float life26_180;
    float life27_192;
    int life5_193;
    float life28_207;
    float life29_211;
    float life30_215;
    float life31_219;
    float life32_223;
    float life33_227;
    float life34_231;
    float life35_239;
    float life36_247;
    float life37_255;
    float life38_267;
    float life39_289;
    float life35_293;
    float life36_297;
    float life37_301;
    float life29_305;
    float life30_309;
    float life31_313;
    float life40_317;
    float life41_321;
    float life32_325;
    float life33_329;
    float life34_333;
    float life42_337;
    float life43_341;
    float life44_349;
    float life45_367;
    float life46_377;
    float life47_387;
    float life48_397;
    float life49_407;
    float life50_417;
    float life51_427;
    float life38_439;
    float life39_461;
    float life46_465;
    float life47_469;
    float life48_473;
    float life38_485;
    float life39_507;
    float life49_511;
    float life50_515;
    float life51_519;
    float life52_527;
    float life53_535;
    float life54_543;
    float life55_569;
    int life56_580;
    int life57_591;
    int life58_602;
    int life59_620;
    int life60_693;
    int life61_721;
    float life62_853;
    float life63_863;
    forward_join_961: {
    forward_join_539: {
    forward_join_538: {
    forward_join_537: {
    forward_join_483: {
    forward_join_482: {
    forward_join_479: {
    forward_join_443: {
    forward_join_442: {
    forward_join_439: {
    forward_join_355: {
    forward_join_354: {
    forward_join_352: {
    forward_join_283: {
    forward_join_282: {
    forward_join_279: {
    life3_3 = (moom.MH.j ^ 137623408137567L);
    life6_6 = ((moom.lw)(p0)).d;
    life7_9 = ((moom.lw)(p0)).b;
    life8_12 = ((moom.lw)(p0)).a__Int();
    life9_16 = ((java.nio.FloatBuffer)(life6_6)).get(((int)(p1)));
    life10_22 = ((java.nio.FloatBuffer)(life6_6)).get(((int)((p1 + 1))));
    life11_28 = ((java.nio.FloatBuffer)(life6_6)).get(((int)((p1 + 2))));
    life12_35 = ((java.nio.FloatBuffer)(life6_6)).get(((int)((p1 + this.c))));
    life13_44 = ((java.nio.FloatBuffer)(life6_6)).get(((int)(((p1 + this.c) + 1))));
    spill2665_0 = moom.MS.b();
    life14_52 = ((java.nio.FloatBuffer)(life6_6)).get(((int)((p1 + this.a))));
    life15_61 = ((java.nio.FloatBuffer)(life6_6)).get(((int)(((p1 + this.a) + 1))));
    life16_70 = ((java.nio.FloatBuffer)(life6_6)).get(((int)(((p1 + this.a) + 2))));
    life17_80 = ((java.nio.FloatBuffer)(life6_6)).get(((int)(((p1 + this.a) + this.c))));
    life18_92 = ((java.nio.FloatBuffer)(life6_6)).get(((int)((((p1 + this.a) + this.c) + 1))));
    life19_101 = ((java.nio.FloatBuffer)(life6_6)).get(((int)((p1 + (2 * this.a)))));
    life20_112 = ((java.nio.FloatBuffer)(life6_6)).get(((int)(((p1 + (2 * this.a)) + 1))));
    life21_123 = ((java.nio.FloatBuffer)(life6_6)).get(((int)(((p1 + (2 * this.a)) + 2))));
    life22_135 = ((java.nio.FloatBuffer)(life6_6)).get(((int)(((p1 + (2 * this.a)) + this.c))));
    life23_149 = ((java.nio.FloatBuffer)(life6_6)).get(((int)((((p1 + (2 * this.a)) + this.c) + 1))));
    life24_158 = ((java.nio.FloatBuffer)(life6_6)).get(((int)((p1 + (3 * this.a)))));
    life25_169 = ((java.nio.FloatBuffer)(life6_6)).get(((int)(((p1 + (3 * this.a)) + 1))));
    life26_180 = ((java.nio.FloatBuffer)(life6_6)).get(((int)(((p1 + (3 * this.a)) + 2))));
    life27_192 = ((java.nio.FloatBuffer)(life6_6)).get(((int)(((p1 + (3 * this.a)) + this.c))));
    life5_193 = spill2665_0;
    life28_207 = ((java.nio.FloatBuffer)(life6_6)).get(((int)((((p1 + (3 * this.a)) + this.c) + 1))));
    life29_211 = (life19_101 - life9_16);
    life30_215 = (life20_112 - life10_22);
    life31_219 = (life21_123 - life11_28);
    life32_223 = (life24_158 - life14_52);
    life33_227 = (life25_169 - life15_61);
    life34_231 = (life26_180 - life16_70);
    life35_239 = ((life30_215 * life34_231) - (life33_227 * life31_219));
    life36_247 = ((life31_219 * life32_223) - (life34_231 * life29_211));
    life37_255 = ((life29_211 * life33_227) - (life32_223 * life30_215));
    life38_267 = (((life35_239 * life35_239) + (life36_247 * life36_247)) + (life37_255 * life37_255));
    spill2665_1 = ((double) life38_267);
    spill2665_2 = 0x0.0p0d;
    if (!((life5_193 == 0))) {
        forwardValue2665_279_0 = spill2665_1;
        forwardValue2665_279_1 = spill2665_2;
        break forward_join_279;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(spill2665_1)), ((double)(spill2665_2))) != 0))) {
        break forward_join_282;
    }
    forwardValue2665_279_0 = 0x1.0p0d;
    forwardValue2665_279_1 = java.lang.Math.sqrt(((double)(((double) life38_267))));
    }
    forwardValue2665_283_0 = ((float) (forwardValue2665_279_0 / forwardValue2665_279_1));
    break forward_join_283;
    }
    forwardValue2665_283_0 = 0x1.0p0f;
    }
    life39_289 = forwardValue2665_283_0;
    life35_293 = (life35_239 * life39_289);
    life36_297 = (life36_247 * life39_289);
    life37_301 = (life37_255 * life39_289);
    life29_305 = (life14_52 - life9_16);
    life30_309 = (life15_61 - life10_22);
    life31_313 = (life16_70 - life11_28);
    life40_317 = (life17_80 - life12_35);
    life41_321 = (life18_92 - life13_44);
    life32_325 = (life19_101 - life9_16);
    life33_329 = (life20_112 - life10_22);
    life34_333 = (life21_123 - life11_28);
    life42_337 = (life22_135 - life12_35);
    life43_341 = (life23_149 - life13_44);
    life44_349 = ((life40_317 * life43_341) - (life42_337 * life41_321));
    spill2665_3 = life44_349;
    spill2665_4 = 0x0.0p0f;
    if (!((life5_193 == 0))) {
        forwardValue2665_352_0 = spill2665_3;
        forwardValue2665_352_1 = spill2665_4;
        break forward_join_352;
    }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(spill2665_3)), ((float)(spill2665_4))) != 0))) {
        break forward_join_354;
    }
    forwardValue2665_352_0 = 0x1.0p0f;
    forwardValue2665_352_1 = life44_349;
    }
    forwardValue2665_355_0 = (forwardValue2665_352_0 / forwardValue2665_352_1);
    break forward_join_355;
    }
    forwardValue2665_355_0 = 0x1.0p0f;
    }
    life45_367 = forwardValue2665_355_0;
    life46_377 = (((life43_341 * life29_305) - (life41_321 * life32_325)) * life45_367);
    life47_387 = (((life43_341 * life30_309) - (life41_321 * life33_329)) * life45_367);
    life48_397 = (((life43_341 * life31_313) - (life41_321 * life34_333)) * life45_367);
    life49_407 = (((life40_317 * life32_325) - (life42_337 * life29_305)) * life45_367);
    life50_417 = (((life40_317 * life33_329) - (life42_337 * life30_309)) * life45_367);
    life51_427 = (((life40_317 * life34_333) - (life42_337 * life31_313)) * life45_367);
    life38_439 = (((life46_377 * life46_377) + (life47_387 * life47_387)) + (life48_397 * life48_397));
    spill2665_5 = ((double) life38_439);
    spill2665_6 = 0x0.0p0d;
    if (!((life5_193 == 0))) {
        forwardValue2665_439_0 = spill2665_5;
        forwardValue2665_439_1 = spill2665_6;
        break forward_join_439;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(spill2665_5)), ((double)(spill2665_6))) != 0))) {
        break forward_join_442;
    }
    forwardValue2665_439_0 = 0x1.0p0d;
    forwardValue2665_439_1 = java.lang.Math.sqrt(((double)(((double) life38_439))));
    }
    forwardValue2665_443_0 = ((float) (forwardValue2665_439_0 / forwardValue2665_439_1));
    break forward_join_443;
    }
    forwardValue2665_443_0 = 0x1.0p0f;
    }
    life39_461 = forwardValue2665_443_0;
    life46_465 = (life46_377 * life39_461);
    life47_469 = (life47_387 * life39_461);
    life48_473 = (life48_397 * life39_461);
    life38_485 = (((life49_407 * life49_407) + (life50_417 * life50_417)) + (life51_427 * life51_427));
    spill2665_7 = ((double) life38_485);
    spill2665_8 = 0x0.0p0d;
    if (!((life5_193 == 0))) {
        forwardValue2665_479_0 = spill2665_7;
        forwardValue2665_479_1 = spill2665_8;
        break forward_join_479;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(spill2665_7)), ((double)(spill2665_8))) != 0))) {
        break forward_join_482;
    }
    forwardValue2665_479_0 = 0x1.0p0d;
    forwardValue2665_479_1 = java.lang.Math.sqrt(((double)(((double) life38_485))));
    }
    forwardValue2665_483_0 = ((float) (forwardValue2665_479_0 / forwardValue2665_479_1));
    break forward_join_483;
    }
    forwardValue2665_483_0 = 0x1.0p0f;
    }
    life39_507 = forwardValue2665_483_0;
    life49_511 = (life49_407 * life39_507);
    life50_515 = (life50_417 * life39_507);
    life51_519 = (life51_427 * life39_507);
    life52_527 = ((life37_301 * life47_469) - (life36_297 * life48_473));
    life53_535 = ((life35_293 * life48_473) - (life37_301 * life46_465));
    life54_543 = ((life36_297 * life46_465) - (life35_293 * life47_469));
    spill2665_9 = (((life49_511 * life52_527) + (life50_515 * life53_535)) + (life51_519 * life54_543));
    if (!((life5_193 == 0))) {
        forwardValue2665_537_0 = spill2665_9;
        break forward_join_537;
    }
    if (!((recovery.source.CarrierOps.fcmpg(((float)(spill2665_9)), ((float)(0x0.0p0f))) < 0))) {
        break forward_join_538;
    }
    forwardValue2665_537_0 = -0x1.0p0f;
    }
    forwardValue2665_539_0 = forwardValue2665_537_0;
    break forward_join_539;
    }
    forwardValue2665_539_0 = 0x1.0p0f;
    }
    life55_569 = forwardValue2665_539_0;
    life56_580 = (((int) (life35_293 * 0x1.fcp6f)) & __sourceIntrinsic_73f78f7e3100_invokedynamic2665_56(31413, (2375909319294500432L ^ life3_3)));
    life57_591 = (((int) (life36_297 * 0x1.fcp6f)) & __sourceIntrinsic_73f78f7e3100_invokedynamic2665_57(17489, (5132977762946416819L ^ life3_3)));
    life58_602 = (((int) (life37_301 * 0x1.fcp6f)) & __sourceIntrinsic_73f78f7e3100_invokedynamic2665_58(17489, (5132977762946416819L ^ life3_3)));
    life59_620 = (((life58_602 << __sourceIntrinsic_73f78f7e3100_invokedynamic2665_59(2532, (3947835304977779985L ^ life3_3))) + (life57_591 << __sourceIntrinsic_73f78f7e3100_invokedynamic2665_60(26401, (476579960910193605L ^ life3_3)))) + life56_580);
    ((java.nio.IntBuffer)(life7_9)).put(((int)((p1 + this.b))), ((int)(life59_620)));
    ((java.nio.IntBuffer)(life7_9)).put(((int)(((p1 + this.a) + this.b))), ((int)(life59_620)));
    ((java.nio.IntBuffer)(life7_9)).put(((int)(((p1 + (2 * this.a)) + this.b))), ((int)(life59_620)));
    ((java.nio.IntBuffer)(life7_9)).put(((int)(((p1 + (3 * this.a)) + this.b))), ((int)(life59_620)));
    life60_693 = ((((int) (life46_465 * 0x1.fffcp14f)) & __sourceIntrinsic_73f78f7e3100_invokedynamic2665_72(30692, (4537670000031216386L ^ life3_3))) + ((((int) (life47_469 * 0x1.fffcp14f)) & __sourceIntrinsic_73f78f7e3100_invokedynamic2665_73(20466, (822516657794845452L ^ life3_3))) << __sourceIntrinsic_73f78f7e3100_invokedynamic2665_74(25119, (3104120555198621414L ^ life3_3))));
    life61_721 = ((((int) (life48_473 * 0x1.fffcp14f)) & __sourceIntrinsic_73f78f7e3100_invokedynamic2665_75(20466, (822516657794845452L ^ life3_3))) + ((((int) (life55_569 * 0x1.fffcp14f)) & __sourceIntrinsic_73f78f7e3100_invokedynamic2665_76(20466, (822516657794845452L ^ life3_3))) << __sourceIntrinsic_73f78f7e3100_invokedynamic2665_77(25119, (3104120555198621414L ^ life3_3))));
    ((java.nio.IntBuffer)(life7_9)).put(((int)((p1 + __sourceIntrinsic_73f78f7e3100_invokedynamic2665_78(22497, (1630458006850507549L ^ life3_3))))), ((int)(life60_693)));
    ((java.nio.IntBuffer)(life7_9)).put(((int)(((p1 + __sourceIntrinsic_73f78f7e3100_invokedynamic2665_80(12360, (4783909164370490543L ^ life3_3))) + 1))), ((int)(life61_721)));
    ((java.nio.IntBuffer)(life7_9)).put(((int)(((p1 + this.a) + __sourceIntrinsic_73f78f7e3100_invokedynamic2665_83(12360, (4783909164370490543L ^ life3_3))))), ((int)(life60_693)));
    ((java.nio.IntBuffer)(life7_9)).put(((int)((((p1 + this.a) + __sourceIntrinsic_73f78f7e3100_invokedynamic2665_86(12360, (4783909164370490543L ^ life3_3))) + 1))), ((int)(life61_721)));
    ((java.nio.IntBuffer)(life7_9)).put(((int)(((p1 + (2 * this.a)) + __sourceIntrinsic_73f78f7e3100_invokedynamic2665_89(12360, (4783909164370490543L ^ life3_3))))), ((int)(life60_693)));
    ((java.nio.IntBuffer)(life7_9)).put(((int)((((p1 + (2 * this.a)) + __sourceIntrinsic_73f78f7e3100_invokedynamic2665_92(12360, (4783909164370490543L ^ life3_3))) + 1))), ((int)(life61_721)));
    ((java.nio.IntBuffer)(life7_9)).put(((int)(((p1 + (3 * this.a)) + __sourceIntrinsic_73f78f7e3100_invokedynamic2665_95(12360, (4783909164370490543L ^ life3_3))))), ((int)(life60_693)));
    ((java.nio.IntBuffer)(life7_9)).put(((int)((((p1 + (3 * this.a)) + __sourceIntrinsic_73f78f7e3100_invokedynamic2665_98(12360, (4783909164370490543L ^ life3_3))) + 1))), ((int)(life61_721)));
    life62_853 = ((((life12_35 + life17_80) + life22_135) + life27_192) / 0x1.0p2f);
    life63_863 = ((((life13_44 + life18_92) + life23_149) + life28_207) / 0x1.0p2f);
    ((java.nio.FloatBuffer)(life6_6)).put(((int)((p1 + __sourceIntrinsic_73f78f7e3100_invokedynamic2665_100(8587, (4779795955331032426L ^ life3_3))))), ((float)(life62_853)));
    ((java.nio.FloatBuffer)(life6_6)).put(((int)(((p1 + __sourceIntrinsic_73f78f7e3100_invokedynamic2665_102(8587, (4779795955331032426L ^ life3_3))) + 1))), ((float)(life63_863)));
    ((java.nio.FloatBuffer)(life6_6)).put(((int)(((p1 + this.a) + __sourceIntrinsic_73f78f7e3100_invokedynamic2665_105(8587, (4779795955331032426L ^ life3_3))))), ((float)(life62_853)));
    ((java.nio.FloatBuffer)(life6_6)).put(((int)((((p1 + this.a) + __sourceIntrinsic_73f78f7e3100_invokedynamic2665_108(8587, (4779795955331032426L ^ life3_3))) + 1))), ((float)(life63_863)));
    ((java.nio.FloatBuffer)(life6_6)).put(((int)(((p1 + (2 * this.a)) + __sourceIntrinsic_73f78f7e3100_invokedynamic2665_111(8587, (4779795955331032426L ^ life3_3))))), ((float)(life62_853)));
    ((java.nio.FloatBuffer)(life6_6)).put(((int)((((p1 + (2 * this.a)) + __sourceIntrinsic_73f78f7e3100_invokedynamic2665_114(8587, (4779795955331032426L ^ life3_3))) + 1))), ((float)(life63_863)));
    ((java.nio.FloatBuffer)(life6_6)).put(((int)(((p1 + (3 * this.a)) + __sourceIntrinsic_73f78f7e3100_invokedynamic2665_117(8587, (4779795955331032426L ^ life3_3))))), ((float)(life62_853)));
    ((java.nio.FloatBuffer)(life6_6)).put(((int)((((p1 + (3 * this.a)) + __sourceIntrinsic_73f78f7e3100_invokedynamic2665_120(8587, (4779795955331032426L ^ life3_3))) + 1))), ((float)(life63_863)));
    if (!((net.minecraft.entity.Entity.b__ArrayString() != null))) {
        break forward_join_961;
    }
    life5_193 += 1;
    moom.MS.b__Void(((int)(life5_193)));
    }
    return;
}


private static int a(int p0, long p1) {
int n4 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x6207;
        if (MH.l[n4] == null) {
            
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
                throw new RuntimeException("moom/MH", exception);
            }
            int n6 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            MH.l[n4] = n6;
        }
        return MH.l[n4];
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral6098_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/MH"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public static void a(net.minecraft.block.state.IBlockState p0, moom.DT p1, net.minecraft.world.IBlockAccess p2, moom.lw p3) {
int forwardValue2668_27_0;
    int forwardValue2668_44_0;
    int spill2668_0;
    int spill2668_1;
    int spill2668_2;
    long life4_3;
    net.minecraft.block.Block life7_7;
    int life6_8;
    moom.fB life10_19;
    int life8_22;
    int life9_25;
    int life10_41;
    int life11_53;
    int life12_75;
    int life13_83;
    forward_join_44: {
    forward_join_42: {
    forward_join_32: {
    forward_join_27: {
    forward_join_25: {
    life4_3 = (moom.MH.j ^ 95537128750388L);
    spill2668_0 = moom.MS.b();
    life7_7 = ((net.minecraft.block.state.IBlockState)(p0)).a__ch();
    life6_8 = spill2668_0;
    spill2668_1 = ((p0 instanceof moom.fB) ? 1 : 0);
    if (!((life6_8 == 0))) {
        forwardValue2668_27_0 = spill2668_1;
        break forward_join_27;
    }
    if (!((spill2668_1 != 0))) {
        break forward_join_25;
    }
    life10_19 = ((moom.fB)(p0));
    life8_22 = ((moom.fB)(life10_19)).a__sourceReturn_8abf5c6871();
    life9_25 = ((moom.fB)(life10_19)).c();
    if (!((life6_8 != 0))) {
        break forward_join_32;
    }
    }
    forwardValue2668_27_0 = __sourceExactCall_4be9acdbe11525(((net.minecraft.block.Block)(life7_7)));
    }
    life8_22 = forwardValue2668_27_0;
    life9_25 = ((net.minecraft.block.Block)(life7_7)).b(((net.minecraft.block.state.IBlockState)(p0)));
    }
    life10_41 = moom.Mm.a(((int)(life8_22)), ((int)(life9_25)));
    spill2668_2 = life10_41;
    if (!((life6_8 == 0))) {
        forwardValue2668_44_0 = spill2668_2;
        break forward_join_44;
    }
    if (!((spill2668_2 >= 0))) {
        break forward_join_42;
    }
    life8_22 = life10_41;
    }
    forwardValue2668_44_0 = ((net.minecraft.block.Block)(life7_7)).c__Int();
    }
    life11_53 = forwardValue2668_44_0;
    life12_75 = (((life11_53 & __sourceIntrinsic_064d04aca215_invokedynamic2668_11(20466, (822471272770429799L ^ life4_3))) << __sourceIntrinsic_064d04aca215_invokedynamic2668_12(25119, (3104148906173255309L ^ life4_3))) + (life8_22 & __sourceIntrinsic_064d04aca215_invokedynamic2668_13(20466, (822471272770429799L ^ life4_3))));
    life13_83 = (life9_25 & __sourceIntrinsic_064d04aca215_invokedynamic2668_14(20466, (822471272770429799L ^ life4_3)));
    ((moom.MH)(((moom.lw)(p3)).t)).a(((long)(((((long) life13_83) << __sourceIntrinsic_064d04aca215_invokedynamic2668_16(22355, (2866250602613570504L ^ life4_3))) + ((long) life12_75)))));
    return;
}


public void a() {
(this.h)[this.i] = 0L;
    this.i -= 1;
    return;
}


public void a(long p0) {
this.i += 1;
    (this.h)[this.i] = p0;
    return;
}


public static void a(moom.lw p0) {
((moom.lw)(p0)).t = ((moom.MH)(new moom.MH()));
    return;
}


public static void a(moom.lw p0, java.nio.ByteBuffer p1) {
moom.lw lexicalValue954_14_0;
    moom.MH lexicalValue954_27_0;
    moom.lw spill954_0;
    moom.MH spill954_1;
    int spill954_2;
    long life2_3;
    int life4_5;
    moom.MH life5_21;
    long life6_43;
    int life8_49;
    int life9_54;
    int life10_62;
    int life11_71;
    lexical_join_79: {
    lexical_join_27: {
    lexical_join_14: {
    lexical_join_13: {
    life2_3 = (moom.MH.j ^ 88324318938077L);
    life4_5 = moom.MS.c();
    spill954_0 = p0;
    if (!((life4_5 != 0))) {
        lexicalValue954_14_0 = spill954_0;
        break lexical_join_14;
    }
    if (!((((moom.lw)(spill954_0)).e == 0))) {
        break lexical_join_13;
    }
    moom.MH.c(((moom.lw)(p0)));
    }
    lexicalValue954_14_0 = p0;
    }
    life5_21 = ((moom.lw)(lexicalValue954_14_0)).t;
    spill954_1 = life5_21;
    if (!((life4_5 != 0))) {
        lexicalValue954_27_0 = spill954_1;
        break lexical_join_27;
    }
    if (!((((moom.MH)(spill954_1)).a == __sourceIntrinsic_e9724f5dbe55_invokedynamic954_6(29275, (3397620448087121955L ^ life2_3))))) {
        break lexical_join_79;
    }
    lexicalValue954_27_0 = life5_21;
    }
    life6_43 = (((moom.MH)(lexicalValue954_27_0)).h)[((moom.MH)(life5_21)).i];
    spill954_2 = 14118;
    life8_49 = (((java.nio.ByteBuffer)(p1)).limit() / 4);
    life9_54 = __sourceIntrinsic_e9724f5dbe55_invokedynamic954_10(spill954_2, (7737623756611183963L ^ life2_3));
    lexical_cycle_43: while (true) {
    if (!(((life9_54 + 1) < life8_49))) {
        break lexical_join_79;
    }
    life10_62 = ((int) life6_43);
    life11_71 = ((int) (life6_43 >> __sourceIntrinsic_e9724f5dbe55_invokedynamic954_11(21505, (5010725753462097534L ^ life2_3))));
    ((java.nio.ByteBuffer)(p1)).putInt(((int)((life9_54 * 4))), ((int)(life10_62)));
    ((java.nio.ByteBuffer)(p1)).putInt(((int)(((life9_54 + 1) * 4))), ((int)(life11_71)));
    life9_54 += 14;
    if (!((life4_5 == 0))) { continue lexical_cycle_43; }
    break lexical_cycle_43;
    }
    }
    return;
}


public static void a(moom.lw p0, int[] p1) {
moom.lw lexicalValue955_14_0;
    moom.MH lexicalValue955_27_0;
    moom.lw spill955_0;
    moom.MH spill955_1;
    long life2_3;
    int life4_5;
    moom.MH life5_21;
    long life6_43;
    int life8_49;
    lexical_join_65: {
    lexical_join_27: {
    lexical_join_14: {
    lexical_join_13: {
    life2_3 = (moom.MH.j ^ 41254439654680L);
    life4_5 = moom.MS.c();
    spill955_0 = p0;
    if (!((life4_5 != 0))) {
        lexicalValue955_14_0 = spill955_0;
        break lexical_join_14;
    }
    if (!((((moom.lw)(spill955_0)).e == 0))) {
        break lexical_join_13;
    }
    moom.MH.c(((moom.lw)(p0)));
    }
    lexicalValue955_14_0 = p0;
    }
    life5_21 = ((moom.lw)(lexicalValue955_14_0)).t;
    spill955_1 = life5_21;
    if (!((life4_5 != 0))) {
        lexicalValue955_27_0 = spill955_1;
        break lexical_join_27;
    }
    if (!((((moom.MH)(spill955_1)).a == __sourceIntrinsic_ff25e38bd0a6_invokedynamic955_6(6708, (1784825350885351041L ^ life2_3))))) {
        break lexical_join_65;
    }
    lexicalValue955_27_0 = life5_21;
    }
    life6_43 = (((moom.MH)(lexicalValue955_27_0)).h)[((moom.MH)(life5_21)).i];
    life8_49 = __sourceIntrinsic_ff25e38bd0a6_invokedynamic955_9(9659, (6370685909267259656L ^ life2_3));
    lexical_cycle_38: while (true) {
    if (!(((life8_49 + 1) < (p1).length))) {
        break lexical_join_65;
    }
    (p1)[life8_49] = ((int) life6_43);
    (p1)[(life8_49 + 1)] = ((int) (life6_43 >> __sourceIntrinsic_ff25e38bd0a6_invokedynamic955_10(22355, (2866124285152351204L ^ life2_3))));
    life8_49 += 14;
    if (!((life4_5 == 0))) { continue lexical_cycle_38; }
    break lexical_cycle_38;
    }
    }
    return;
}


public static boolean a(boolean p0, moom.lw p1) {
((moom.MH)(((moom.lw)(p1)).t)).a();
    return (__sourceIntrinsic_booleanComparison((p0)) != 0);
}


public static void g(moom.lw p0) {
int lexicalValue956_14_0;
    int lexicalValue956_27_0;
    int lexicalValue956_27_1;
    moom.lw lexicalValue956_30_0;
    boolean spill956_0;
    int spill956_1;
    moom.lw spill956_2;
    long life1_3;
    int life3_5;
    moom.MH life4_49;
    int life5_57;
    int life6_59;
    lexical_join_58: {
    lexical_join_30: {
    lexical_join_27: {
    lexical_join_14: {
    life1_3 = (moom.MH.j ^ 26137947096674L);
    life3_5 = moom.MS.b();
    spill956_0 = ((moom.oD)(((moom.lw)(p0)).a__oD())).a__Boolean();
    if (!((life3_5 == 0))) {
        lexicalValue956_14_0 = ((spill956_0) ? 1 : 0);
        break lexical_join_14;
    }
    if (!(spill956_0)) {
        break lexical_join_58;
    }
    lexicalValue956_14_0 = ((moom.lw)(p0)).i;
    }
    spill956_1 = __sourceIntrinsic_9f0cec365d9d_invokedynamic956_6(17094, (3017996227682899212L ^ life1_3));
    if (!((life3_5 == 0))) {
        lexicalValue956_27_0 = lexicalValue956_14_0;
        lexicalValue956_27_1 = spill956_1;
        break lexical_join_27;
    }
    if (!((lexicalValue956_14_0 == spill956_1))) {
        break lexical_join_58;
    }
    spill956_2 = p0;
    if (!((life3_5 == 0))) {
        lexicalValue956_30_0 = spill956_2;
        break lexical_join_30;
    }
    lexicalValue956_27_0 = ((moom.lw)(spill956_2)).e;
    lexicalValue956_27_1 = 4;
    }
    if (!(((lexicalValue956_27_0 % lexicalValue956_27_1) == 0))) {
        break lexical_join_58;
    }
    lexicalValue956_30_0 = p0;
    }
    life4_49 = ((moom.lw)(lexicalValue956_30_0)).t;
    moom.MH.c(((moom.lw)(p0)));
    life5_57 = (((moom.lw)(p0)).e * ((moom.MH)(life4_49)).a);
    life6_59 = 0;
    lexical_cycle_42: while (true) {
    if (!((life6_59 < life5_57))) {
        break lexical_join_58;
    }
    ((moom.MH)(life4_49)).a(((moom.lw)(p0)), ((int)(life6_59)));
    life6_59 = (life6_59 + (((moom.MH)(life4_49)).a * 4));
    if (!((life3_5 != 0))) { continue lexical_cycle_42; }
    break lexical_cycle_42;
    }
    }
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_12b7fbf1b1e11295_originalDynamicSite2420_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d5bd3d318e7d_invokedynamic2664_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d5bd3d318e7d_invokedynamic2664_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d5bd3d318e7d_invokedynamic2664_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d5bd3d318e7d_invokedynamic2664_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d5bd3d318e7d_invokedynamic2664_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d5bd3d318e7d_invokedynamic2664_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d5bd3d318e7d_invokedynamic2664_19(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral6098_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_73f78f7e3100_invokedynamic2665_56(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_73f78f7e3100_invokedynamic2665_57(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_73f78f7e3100_invokedynamic2665_58(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_73f78f7e3100_invokedynamic2665_59(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_73f78f7e3100_invokedynamic2665_60(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_73f78f7e3100_invokedynamic2665_72(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_73f78f7e3100_invokedynamic2665_73(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_73f78f7e3100_invokedynamic2665_74(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_73f78f7e3100_invokedynamic2665_75(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_73f78f7e3100_invokedynamic2665_76(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_73f78f7e3100_invokedynamic2665_77(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_73f78f7e3100_invokedynamic2665_78(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_73f78f7e3100_invokedynamic2665_80(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_73f78f7e3100_invokedynamic2665_83(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_73f78f7e3100_invokedynamic2665_86(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_73f78f7e3100_invokedynamic2665_89(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_73f78f7e3100_invokedynamic2665_92(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_73f78f7e3100_invokedynamic2665_95(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_73f78f7e3100_invokedynamic2665_98(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_73f78f7e3100_invokedynamic2665_100(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_73f78f7e3100_invokedynamic2665_102(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_73f78f7e3100_invokedynamic2665_105(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_73f78f7e3100_invokedynamic2665_108(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_73f78f7e3100_invokedynamic2665_111(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_73f78f7e3100_invokedynamic2665_114(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_73f78f7e3100_invokedynamic2665_117(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_73f78f7e3100_invokedynamic2665_120(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e9724f5dbe55_invokedynamic954_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e9724f5dbe55_invokedynamic954_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e9724f5dbe55_invokedynamic954_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ff25e38bd0a6_invokedynamic955_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ff25e38bd0a6_invokedynamic955_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ff25e38bd0a6_invokedynamic955_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_064d04aca215_invokedynamic2668_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_064d04aca215_invokedynamic2668_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_064d04aca215_invokedynamic2668_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_064d04aca215_invokedynamic2668_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_064d04aca215_invokedynamic2668_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3347870235bf_invokedynamic2669_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bea88ae45088_invokedynamic2671_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bea88ae45088_invokedynamic2671_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bea88ae45088_invokedynamic2671_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bea88ae45088_invokedynamic2671_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bea88ae45088_invokedynamic2671_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_212883504585_invokedynamic2672_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_212883504585_invokedynamic2672_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9f0cec365d9d_invokedynamic956_6(int a0, long a1) throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);

private static native int __sourceExactCall_704471783e3d86(int p0, long p1);
private static native int __sourceExactCall_4be9acdbe11525(net.minecraft.block.Block p0);
}
