package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class kT extends moom.kR {

private double h;

private double i;

private double j;

private static final long k;

private static final long[] m;

private static final java.lang.Integer[] o;

private static final java.util.Map p;

private static final long[] q;

private static final java.lang.Long[] r;

private static final java.util.Map s;

public kT() {
super();
}


static {
k = ((long)(((moom._a)(moom._c.a(((long)(7497881507690004319L)), ((long)(6411755711255234889L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(200908586707383L)))));
    p = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (moom.kT.k ^ 64444735539278L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill909_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill909_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill909_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill909_14 = new byte[8];
    (__sourceSpill909_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill909_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation909_16 = __sourceSpill909_14;
    ((javax.crypto.Cipher)(__sourceSpill909_11)).init(((int)(__sourceSpill909_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill909_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation909_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local19_life19 = new long[10];
    int local16_life20 = 0;
    java.lang.String local17_life21;
    int local18_life23 = ((java.lang.String)((local17_life21 = "9ê;¾L\004Ò1»hÕ6\bã+Â*¸¡<DdÙUß@\177h\020%°¤§æfmräØUxueM6KÅ\003¤\003ëDf3ÖF¾"))).length();
    int local15_life24 = 0;
    do {
        java.lang.String __sourceSpill909_25 = local17_life21;
        int __sourceSpill909_26 = local15_life24;
        local15_life24 += 8;
        byte[] local20_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill909_25)).substring(((int)(__sourceSpill909_26)), ((int)(local15_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill909_30 = local19_life19;
        int __sourceSpill909_31 = local16_life20;
        local16_life20 += 1;
        long local21_life32 = (((((((((((long) (local20_life29)[0]) & 255L) << 56) | ((((long) (local20_life29)[1]) & 255L) << 48)) | ((((long) (local20_life29)[2]) & 255L) << 40)) | ((((long) (local20_life29)[3]) & 255L) << 32)) | ((((long) (local20_life29)[4]) & 255L) << 24)) | ((((long) (local20_life29)[5]) & 255L) << 16)) | ((((long) (local20_life29)[6]) & 255L) << 8)) | (((long) (local20_life29)[7]) & 255L));
        byte[] __sourceSpill909_33 = new byte[8];
        (__sourceSpill909_33)[0] = ((byte) ((int) (local21_life32 >>> 56)));
        (__sourceSpill909_33)[1] = ((byte) ((int) (local21_life32 >>> 48)));
        (__sourceSpill909_33)[2] = ((byte) ((int) (local21_life32 >>> 40)));
        (__sourceSpill909_33)[3] = ((byte) ((int) (local21_life32 >>> 32)));
        (__sourceSpill909_33)[4] = ((byte) ((int) (local21_life32 >>> 24)));
        (__sourceSpill909_33)[5] = ((byte) ((int) (local21_life32 >>> 16)));
        (__sourceSpill909_33)[6] = ((byte) ((int) (local21_life32 >>> 8)));
        (__sourceSpill909_33)[7] = ((byte) ((int) local21_life32));
        javax.crypto.Cipher __sourceSpill909_34 = local13_life9;
        byte[] local23_life36 = ((javax.crypto.Cipher)(__sourceSpill909_34)).doFinal(((byte[])(__sourceSpill909_33)));
        (__sourceSpill909_30)[__sourceSpill909_31] = (((((((((((long) (local23_life36)[0]) & 255L) << 56) | ((((long) (local23_life36)[1]) & 255L) << 48)) | ((((long) (local23_life36)[2]) & 255L) << 40)) | ((((long) (local23_life36)[3]) & 255L) << 32)) | ((((long) (local23_life36)[4]) & 255L) << 24)) | ((((long) (local23_life36)[5]) & 255L) << 16)) | ((((long) (local23_life36)[6]) & 255L) << 8)) | (((long) (local23_life36)[7]) & 255L));
    } while ((!(local15_life24 >= local18_life23)));
    local18_life23 = ((java.lang.String)((local17_life21 = "3\020¨à\026cd\177\000\004Ã0ô:\";"))).length();
    local15_life24 = 0;
    do {
        java.lang.String __sourceSpill909_38 = local17_life21;
        int __sourceSpill909_39 = local15_life24;
        local15_life24 += 8;
        byte[] local20_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill909_38)).substring(((int)(__sourceSpill909_39)), ((int)(local15_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill909_43 = local19_life19;
        int __sourceSpill909_44 = local16_life20;
        local16_life20 += 1;
        long local21_life45 = (((((((((((long) (local20_life42)[0]) & 255L) << 56) | ((((long) (local20_life42)[1]) & 255L) << 48)) | ((((long) (local20_life42)[2]) & 255L) << 40)) | ((((long) (local20_life42)[3]) & 255L) << 32)) | ((((long) (local20_life42)[4]) & 255L) << 24)) | ((((long) (local20_life42)[5]) & 255L) << 16)) | ((((long) (local20_life42)[6]) & 255L) << 8)) | (((long) (local20_life42)[7]) & 255L));
        byte[] __sourceSpill909_46 = new byte[8];
        (__sourceSpill909_46)[0] = ((byte) ((int) (local21_life45 >>> 56)));
        (__sourceSpill909_46)[1] = ((byte) ((int) (local21_life45 >>> 48)));
        (__sourceSpill909_46)[2] = ((byte) ((int) (local21_life45 >>> 40)));
        (__sourceSpill909_46)[3] = ((byte) ((int) (local21_life45 >>> 32)));
        (__sourceSpill909_46)[4] = ((byte) ((int) (local21_life45 >>> 24)));
        (__sourceSpill909_46)[5] = ((byte) ((int) (local21_life45 >>> 16)));
        (__sourceSpill909_46)[6] = ((byte) ((int) (local21_life45 >>> 8)));
        (__sourceSpill909_46)[7] = ((byte) ((int) local21_life45));
        javax.crypto.Cipher __sourceSpill909_47 = local13_life9;
        byte[] local23_life49 = ((javax.crypto.Cipher)(__sourceSpill909_47)).doFinal(((byte[])(__sourceSpill909_46)));
        (__sourceSpill909_43)[__sourceSpill909_44] = (((((((((((long) (local23_life49)[0]) & 255L) << 56) | ((((long) (local23_life49)[1]) & 255L) << 48)) | ((((long) (local23_life49)[2]) & 255L) << 40)) | ((((long) (local23_life49)[3]) & 255L) << 32)) | ((((long) (local23_life49)[4]) & 255L) << 24)) | ((((long) (local23_life49)[5]) & 255L) << 16)) | ((((long) (local23_life49)[6]) & 255L) << 8)) | (((long) (local23_life49)[7]) & 255L));
    } while ((!(local15_life24 >= local18_life23)));
    m = ((long[])(local19_life19));
    o = ((java.lang.Integer[])(new java.lang.Integer[10]));
    s = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life54;
    javax.crypto.Cipher __sourceSpill909_56 = (local0_life54 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill909_57 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill909_58 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill909_59 = new byte[8];
    (__sourceSpill909_59)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life60 = 1;
    while ((local1_life60 < 8)) {
        (__sourceSpill909_59)[local1_life60] = ((byte) ((int) ((local11_life7 << (local1_life60 * 8)) >>> 56)));
        local1_life60 += 1;
    }
    byte[] __sourcePreallocation909_61 = __sourceSpill909_59;
    ((javax.crypto.Cipher)(__sourceSpill909_56)).init(((int)(__sourceSpill909_57)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill909_58)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation909_61)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life64 = new long[3];
    int local3_life65 = 0;
    java.lang.String local4_life66;
    int local5_life68 = ((java.lang.String)((local4_life66 = "ÆÚÊNX9\001qäc\026R\031\006._¾\bnÂ"))).length();
    int local2_life69 = 0;
    do {
        java.lang.String __sourceSpill909_70 = local4_life66;
        int __sourceSpill909_71 = local2_life69;
        local2_life69 += 8;
        byte[] local7_life74 = ((java.lang.String)(((java.lang.String)(__sourceSpill909_70)).substring(((int)(__sourceSpill909_71)), ((int)(local2_life69))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill909_75 = local6_life64;
        int __sourceSpill909_76 = local3_life65;
        local3_life65 += 1;
        long local8_life77 = (((((((((((long) (local7_life74)[0]) & 255L) << 56) | ((((long) (local7_life74)[1]) & 255L) << 48)) | ((((long) (local7_life74)[2]) & 255L) << 40)) | ((((long) (local7_life74)[3]) & 255L) << 32)) | ((((long) (local7_life74)[4]) & 255L) << 24)) | ((((long) (local7_life74)[5]) & 255L) << 16)) | ((((long) (local7_life74)[6]) & 255L) << 8)) | (((long) (local7_life74)[7]) & 255L));
        byte[] __sourceSpill909_78 = new byte[8];
        (__sourceSpill909_78)[0] = ((byte) ((int) (local8_life77 >>> 56)));
        (__sourceSpill909_78)[1] = ((byte) ((int) (local8_life77 >>> 48)));
        (__sourceSpill909_78)[2] = ((byte) ((int) (local8_life77 >>> 40)));
        (__sourceSpill909_78)[3] = ((byte) ((int) (local8_life77 >>> 32)));
        (__sourceSpill909_78)[4] = ((byte) ((int) (local8_life77 >>> 24)));
        (__sourceSpill909_78)[5] = ((byte) ((int) (local8_life77 >>> 16)));
        (__sourceSpill909_78)[6] = ((byte) ((int) (local8_life77 >>> 8)));
        (__sourceSpill909_78)[7] = ((byte) ((int) local8_life77));
        javax.crypto.Cipher __sourceSpill909_79 = local0_life54;
        byte[] local10_life81 = ((javax.crypto.Cipher)(__sourceSpill909_79)).doFinal(((byte[])(__sourceSpill909_78)));
        (__sourceSpill909_75)[__sourceSpill909_76] = (((((((((((long) (local10_life81)[0]) & 255L) << 56) | ((((long) (local10_life81)[1]) & 255L) << 48)) | ((((long) (local10_life81)[2]) & 255L) << 40)) | ((((long) (local10_life81)[3]) & 255L) << 32)) | ((((long) (local10_life81)[4]) & 255L) << 24)) | ((((long) (local10_life81)[5]) & 255L) << 16)) | ((((long) (local10_life81)[6]) & 255L) << 8)) | (((long) (local10_life81)[7]) & 255L));
    } while ((!(local2_life69 >= local5_life68)));
    q = ((long[])(local6_life64));
    r = ((java.lang.Long[])(new java.lang.Long[3]));
}


private static long b(int p0, long p1) {
int life3_8;
    byte[] life4_77;
    long life5_81;
    byte[] life7_146;
    java.lang.Long life8_150;
    java.lang.Object[] life9_155;
    javax.crypto.spec.DESKeySpec life11_188;
    javax.crypto.SecretKey life12_195;
    javax.crypto.Cipher life13_200;
    byte[] life10_212;
    long life11_290;
    life3_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 2064);
    if (((moom.kT.r)[life3_8] == null)) {
        life4_77 = new byte[] {((byte) ((int) (p1 >>> 56))), ((byte) ((int) (p1 >>> 48))), ((byte) ((int) (p1 >>> 40))), ((byte) ((int) (p1 >>> 32))), ((byte) ((int) (p1 >>> 24))), ((byte) ((int) (p1 >>> 16))), ((byte) ((int) (p1 >>> 8))), ((byte) ((int) p1))};
        life5_81 = (moom.kT.q)[life3_8];
        life7_146 = new byte[] {((byte) ((int) (life5_81 >>> 56))), ((byte) ((int) (life5_81 >>> 48))), ((byte) ((int) (life5_81 >>> 40))), ((byte) ((int) (life5_81 >>> 32))), ((byte) ((int) (life5_81 >>> 24))), ((byte) ((int) (life5_81 >>> 16))), ((byte) ((int) (life5_81 >>> 8))), ((byte) ((int) life5_81))};
        life8_150 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life9_155 = ((java.lang.Object[])(((java.util.Map)(moom.kT.s)).get(((java.lang.Object)(life8_150)))));
        try {
        if ((life9_155 == null)) {
        life9_155 = new java.lang.Object[3];
        (life9_155)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding")));
        (life9_155)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life9_155)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.kT.s)).put(((java.lang.Object)(life8_150)), ((java.lang.Object)(life9_155)));
    }
        life11_188 = new javax.crypto.spec.DESKeySpec(life4_77);
        life12_195 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life9_155)[1])))).generateSecret(((java.security.spec.KeySpec)(life11_188)));
        life13_200 = ((javax.crypto.Cipher)((life9_155)[0]));
        ((javax.crypto.Cipher)(life13_200)).init(((int)(2)), ((java.security.Key)(life12_195)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life9_155)[2])))));
        life10_212 = ((javax.crypto.Cipher)(life13_200)).doFinal(((byte[])(life7_146)));
    } catch (java.lang.Exception life11_214) {
        throw new java.lang.RuntimeException("moom/kT", life11_214);
    }
        life11_290 = (((((((((((long) (life10_212)[0]) & 255L) << 56) | ((((long) (life10_212)[1]) & 255L) << 48)) | ((((long) (life10_212)[2]) & 255L) << 40)) | ((((long) (life10_212)[3]) & 255L) << 32)) | ((((long) (life10_212)[4]) & 255L) << 24)) | ((((long) (life10_212)[5]) & 255L) << 16)) | ((((long) (life10_212)[6]) & 255L) << 8)) | (((long) (life10_212)[7]) & 255L));
        (moom.kT.r)[life3_8] = java.lang.Long.valueOf(((long)(life11_290)));
    }
    return ((java.lang.Long)((moom.kT.r)[life3_8])).longValue();
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8232_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/kT"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static long b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    long local7 = moom.kT.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local9 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Long.TYPE)), ((java.lang.Object)(java.lang.Long.valueOf(((long)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local9)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral8233_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/kT"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(double p0, double p1, double p2) {
this.h = ((double)(p0));
    this.i = ((double)(p1));
    this.j = ((double)(p2));
    super.a(((double)(p0)), ((double)(p1)), ((double)(p2)));
    return;
}


public void a() {
long life1_3;
    life1_3 = (moom.kT.k ^ 414374937536L);
    if (moom.BU.ap()) {
        moom.MR.i();
    } else {
        org.lwjgl.opengl.GL11.glVertexPointer(((int)(3)), ((int)(__sourceIntrinsic_2c8ae721fed4_invokedynamic3710_3(17054, (3074647534619729535L ^ life1_3)))), ((int)(__sourceIntrinsic_2c8ae721fed4_invokedynamic3710_4(14397, (7813097773101475026L ^ life1_3)))), ((long)(0L)));
        org.lwjgl.opengl.GL11.glColorPointer(((int)(4)), ((int)(__sourceIntrinsic_2c8ae721fed4_invokedynamic3710_6(15004, (2820159985009845872L ^ life1_3)))), ((int)(__sourceIntrinsic_2c8ae721fed4_invokedynamic3710_7(14738, (1599930767650743676L ^ life1_3)))), ((long)(__sourceIntrinsic_2c8ae721fed4_invokedynamic3710_8(16071, (4926862501538533725L ^ life1_3)))));
        org.lwjgl.opengl.GL11.glTexCoordPointer(((int)(2)), ((int)(__sourceIntrinsic_2c8ae721fed4_invokedynamic3710_10(28463, (2853477084657497039L ^ life1_3)))), ((int)(__sourceIntrinsic_2c8ae721fed4_invokedynamic3710_11(14738, (1599930767650743676L ^ life1_3)))), ((long)(__sourceIntrinsic_2c8ae721fed4_invokedynamic3710_12(7918, (9043649136765481333L ^ life1_3)))));
        net.minecraft.client.renderer.OpenGlHelper.j(((int)(net.minecraft.client.renderer.OpenGlHelper.r)));
        org.lwjgl.opengl.GL11.glTexCoordPointer(((int)(2)), ((int)(__sourceIntrinsic_2c8ae721fed4_invokedynamic3710_16(30709, (2277840472599505693L ^ life1_3)))), ((int)(__sourceIntrinsic_2c8ae721fed4_invokedynamic3710_17(14738, (1599930767650743676L ^ life1_3)))), ((long)(__sourceIntrinsic_2c8ae721fed4_invokedynamic3710_18(30111, (2652212940401433095L ^ life1_3)))));
        net.minecraft.client.renderer.OpenGlHelper.j(((int)(net.minecraft.client.renderer.OpenGlHelper.q)));
    }
    return;
}


public void a(net.minecraft.util.EnumWorldBlockLayer p0) {
long life2_3;
    java.util.Iterator life4_13;
    moom.mp life5_20;
    moom.oC life6_25;
    int life4_51;
    int life5_57;
    moom.Mk life6_59;
    java.util.Iterator life7_63;
    moom.mp life8_70;
    moom.oC life9_75;
    moom.Mk life10_78;
    forest_join_126: {
    forest_join_119: {
    forest_join_112: {
    forest_join_45: {
    forest_join_44: {
    life2_3 = (moom.kT.k ^ 85835299154549L);
    if (!(((moom.kT)(this)).e)) {
        break forest_join_126;
    }
    if (!((!moom.BU.aD()))) {
        break forest_join_45;
    }
    life4_13 = ((java.util.List)(((moom.kT)(this)).d)).iterator();
    forest_cycle_13: while (true) {
    if (!(((java.util.Iterator)(life4_13)).hasNext())) {
        break forest_join_44;
    }
    life5_20 = ((moom.mp)(((java.util.Iterator)(life4_13)).next()));
    life6_25 = ((moom.mp)(life5_20)).a(((int)(((net.minecraft.util.EnumWorldBlockLayer)(p0)).ordinal())));
    moom.kZ.B();
    ((moom.kT)(this)).a(((moom.mp)(life5_20)));
    ((moom.mp)(life5_20)).c__Void();
    ((moom.oC)(life6_25)).a__Void();
    ((moom.kT)(this)).a();
    ((moom.oC)(life6_25)).a(((int)(__sourceIntrinsic_9ef2a47e018c_invokedynamic872_15(2716, (3333211013405900739L ^ life2_3)))));
    moom.kZ.C();
    continue forest_cycle_13;
    }
    }
    break forest_join_119;
    }
    life4_51 = __sourceIntrinsic_9ef2a47e018c_invokedynamic872_18(29553, (1574781726707975727L ^ life2_3));
    life5_57 = __sourceIntrinsic_9ef2a47e018c_invokedynamic872_19(32480, (5912261575283379132L ^ life2_3));
    life6_59 = null;
    life7_63 = ((java.util.List)(((moom.kT)(this)).d)).iterator();
    forest_cycle_63: while (true) {
    forest_join_104: {
    forest_join_96: {
    forest_join_89: {
    if (!(((java.util.Iterator)(life7_63)).hasNext())) {
        break forest_join_112;
    }
    life8_70 = ((moom.mp)(((java.util.Iterator)(life7_63)).next()));
    life9_75 = ((moom.mp)(life8_70)).a(((int)(((net.minecraft.util.EnumWorldBlockLayer)(p0)).ordinal())));
    life10_78 = ((moom.oC)(life9_75)).a__Mk();
    if (!((life10_78 == life6_59))) {
        break forest_join_89;
    }
    if (!((life4_51 == ((moom.mp)(life8_70)).v))) {
        break forest_join_89;
    }
    if (!((life5_57 != ((moom.mp)(life8_70)).w))) {
        break forest_join_104;
    }
    }
    if (!((life6_59 != null))) {
        break forest_join_96;
    }
    ((moom.kT)(this)).a(((int)(life4_51)), ((int)(life5_57)), ((moom.Mk)(life6_59)));
    }
    life4_51 = ((moom.mp)(life8_70)).v;
    life5_57 = ((moom.mp)(life8_70)).w;
    life6_59 = life10_78;
    }
    ((moom.oC)(life9_75)).a(((int)(__sourceIntrinsic_9ef2a47e018c_invokedynamic872_33(2240, (1929085684358839704L ^ life2_3)))));
    continue forest_cycle_63;
    }
    }
    if (!((life6_59 != null))) {
        break forest_join_119;
    }
    ((moom.kT)(this)).a(((int)(life4_51)), ((int)(life5_57)), ((moom.Mk)(life6_59)));
    }
    net.minecraft.client.renderer.OpenGlHelper.c(((int)(net.minecraft.client.renderer.OpenGlHelper.R)), ((int)(0)));
    moom.kZ.D();
    ((java.util.List)(((moom.kT)(this)).d)).clear();
    }
    return;
}


public void a(int p0, int p1, int p2) {
moom.kZ.b(((float)(((float) (((double) p0) - this.h)))), ((float)(((float) (((double) p1) - this.i)))), ((float)(((float) (((double) p2) - this.j)))));
    return;
}


private void a(int p0, int p1, moom.Mk p2) {
moom.kZ.B();
    ((moom.kT)(this)).a(((int)(p0)), ((int)(0)), ((int)(p1)));
    ((moom.Mk)(p2)).a(((moom.kT)(this)));
    moom.kZ.C();
    return;
}


private static int a(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x7B62;
        if (o[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l5 = m[n2];
            byte[] byArray3 = new byte[]{(byte)(l5 >>> 56), (byte)(l5 >>> 48), (byte)(l5 >>> 40), (byte)(l5 >>> 32), (byte)(l5 >>> 24), (byte)(l5 >>> 16), (byte)(l5 >>> 8), (byte)l5};
            Long l6 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])p.get(l6);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    p.put(l6, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/kT", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            kT.o[n2] = n4;
        }
        return o[n2];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.kT.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static native <E extends Throwable> int __sourceIntrinsic_2c8ae721fed4_invokedynamic3710_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2c8ae721fed4_invokedynamic3710_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2c8ae721fed4_invokedynamic3710_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2c8ae721fed4_invokedynamic3710_7(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_2c8ae721fed4_invokedynamic3710_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2c8ae721fed4_invokedynamic3710_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2c8ae721fed4_invokedynamic3710_11(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_2c8ae721fed4_invokedynamic3710_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2c8ae721fed4_invokedynamic3710_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2c8ae721fed4_invokedynamic3710_17(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_2c8ae721fed4_invokedynamic3710_18(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral8233_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9ef2a47e018c_invokedynamic872_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9ef2a47e018c_invokedynamic872_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9ef2a47e018c_invokedynamic872_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9ef2a47e018c_invokedynamic872_33(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8232_0() throws E;
}
