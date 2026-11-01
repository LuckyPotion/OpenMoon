package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Nm implements moom.Lz {

private java.util.Map<java.lang.String, moom.Lu> a;

private static long b;

private static java.lang.String[] c;

private static java.lang.String[] d;

private static java.util.Map e;

private static long[] f;

private static java.lang.Integer[] g;

private static java.util.Map h;

public Nm(java.util.Map<java.lang.String, moom.Lu> p0) { super(); }


private static void __sourceConstructorBody_3473a9e7c25db27e(moom.Nm receiver, java.util.Map p0) throws Throwable {

init_join_38: {

    long local2_life2 = (moom.Nm.b ^ 53295629854432L);

    java.lang.String __sourceSpill609_4 = moom.Nq.b__String();

    moom.Nm.__sourceConstructorInit_3473a9e7c25db27e_0(((moom.Nm)(receiver)));

    ((moom.Nm)(receiver)).a = ((java.util.Map)(new java.util.HashMap()));

    java.lang.String local4_life7 = __sourceSpill609_4;

    ((moom.Nm)(receiver)).a();

    java.util.Iterator local5_life11 = ((java.util.Set)(((java.util.Map)(p0)).keySet())).iterator();

    init_cycle_19: while (true) {

    if (!(((java.util.Iterator)(local5_life11)).hasNext())) {

        break init_join_38;

    }

    java.lang.String local6_life15 = ((java.lang.String)(((java.util.Iterator)(local5_life11)).next()));

    moom.Lu local7_life18 = ((moom.Lu)(((java.util.Map)(p0)).get(((java.lang.Object)(local6_life15)))));

    ((moom.Nm)(receiver)).a(((java.lang.String)(local6_life15)), ((moom.Lu)(local7_life18)));

    if (!((local4_life7 == null))) { continue init_cycle_19; }

    break init_cycle_19;

    }

    }

    return;

}



static {
b = ((long)(((moom._a)(moom._c.a(((long)(-1118290018015515195L)), ((long)(-4959837089543367524L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(105001681357285L)))));
    e = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (moom.Nm.b ^ 27599832687910L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill733_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill733_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill733_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill733_14 = new byte[8];
    (__sourceSpill733_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill733_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation733_16 = __sourceSpill733_14;
    ((javax.crypto.Cipher)(__sourceSpill733_11)).init(((int)(__sourceSpill733_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill733_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation733_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local20_life19 = new java.lang.String[2];
    int local18_life20 = 0;
    java.lang.String local17_life21;
    int local19_life23 = ((java.lang.String)((local17_life21 = "hñ\thS,áühTÿT\024Nã\023¿GÙËB¤\\múQÃÏÁ-\021¥&L\006äÞFX§\biÙû³\031hó\020)ó¨HLp*\026½\013D-ýÚF"))).length();
    int local16_life24 = 48;
    int local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill733_28 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill733_29 = local13_life9;
        byte[] local21_life31 = ((javax.crypto.Cipher)(__sourceSpill733_29)).doFinal(((byte[])(__sourceSpill733_28)));
        java.lang.String __sourceSpill733_34 = ((java.lang.String)(moom.Nm.a(((byte[])(local21_life31))))).intern();
        java.lang.String[] __sourceSpill733_35 = local20_life19;
        int __sourceSpill733_36 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill733_35)[__sourceSpill733_36] = __sourceSpill733_34;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    c = ((java.lang.String[])(local20_life19));
    d = ((java.lang.String[])(new java.lang.String[2]));
    h = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life42;
    javax.crypto.Cipher __sourceSpill733_44 = (local0_life42 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill733_45 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill733_46 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill733_47 = new byte[8];
    (__sourceSpill733_47)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life48 = 1;
    while ((local1_life48 < 8)) {
        (__sourceSpill733_47)[local1_life48] = ((byte) ((int) ((local11_life7 << (local1_life48 * 8)) >>> 56)));
        local1_life48 += 1;
    }
    byte[] __sourcePreallocation733_49 = __sourceSpill733_47;
    ((javax.crypto.Cipher)(__sourceSpill733_44)).init(((int)(__sourceSpill733_45)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill733_46)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation733_49)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life52 = new long[2];
    int local3_life53 = 0;
    java.lang.String local4_life54;
    int local5_life56 = ((java.lang.String)((local4_life54 = "¥ÂÁny@ ÏùìJÏWé\\"))).length();
    int local2_life57 = 0;
    do {
        java.lang.String __sourceSpill733_58 = local4_life54;
        int __sourceSpill733_59 = local2_life57;
        local2_life57 += 8;
        byte[] local7_life62 = ((java.lang.String)(((java.lang.String)(__sourceSpill733_58)).substring(((int)(__sourceSpill733_59)), ((int)(local2_life57))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill733_63 = local6_life52;
        int __sourceSpill733_64 = local3_life53;
        local3_life53 += 1;
        long local8_life65 = (((((((((((long) (local7_life62)[0]) & 255L) << 56) | ((((long) (local7_life62)[1]) & 255L) << 48)) | ((((long) (local7_life62)[2]) & 255L) << 40)) | ((((long) (local7_life62)[3]) & 255L) << 32)) | ((((long) (local7_life62)[4]) & 255L) << 24)) | ((((long) (local7_life62)[5]) & 255L) << 16)) | ((((long) (local7_life62)[6]) & 255L) << 8)) | (((long) (local7_life62)[7]) & 255L));
        byte[] __sourceSpill733_66 = new byte[8];
        (__sourceSpill733_66)[0] = ((byte) ((int) (local8_life65 >>> 56)));
        (__sourceSpill733_66)[1] = ((byte) ((int) (local8_life65 >>> 48)));
        (__sourceSpill733_66)[2] = ((byte) ((int) (local8_life65 >>> 40)));
        (__sourceSpill733_66)[3] = ((byte) ((int) (local8_life65 >>> 32)));
        (__sourceSpill733_66)[4] = ((byte) ((int) (local8_life65 >>> 24)));
        (__sourceSpill733_66)[5] = ((byte) ((int) (local8_life65 >>> 16)));
        (__sourceSpill733_66)[6] = ((byte) ((int) (local8_life65 >>> 8)));
        (__sourceSpill733_66)[7] = ((byte) ((int) local8_life65));
        javax.crypto.Cipher __sourceSpill733_67 = local0_life42;
        byte[] local10_life69 = ((javax.crypto.Cipher)(__sourceSpill733_67)).doFinal(((byte[])(__sourceSpill733_66)));
        (__sourceSpill733_63)[__sourceSpill733_64] = (((((((((((long) (local10_life69)[0]) & 255L) << 56) | ((((long) (local10_life69)[1]) & 255L) << 48)) | ((((long) (local10_life69)[2]) & 255L) << 40)) | ((((long) (local10_life69)[3]) & 255L) << 32)) | ((((long) (local10_life69)[4]) & 255L) << 24)) | ((((long) (local10_life69)[5]) & 255L) << 16)) | ((((long) (local10_life69)[6]) & 255L) << 8)) | (((long) (local10_life69)[7]) & 255L));
    } while ((!(local2_life57 >= local5_life56)));
    f = ((long[])(local6_life52));
    g = ((java.lang.Integer[])(new java.lang.Integer[2]));
}

private static native <E extends Throwable> void __sourceConstructorInit_3473a9e7c25db27e_0(moom.Nm a0) throws E;

private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.Nm.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral6729_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Nm"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x7BE9;
        if (g[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = f[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])h.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    h.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/Nm", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Nm.g[n2] = n4;
        }
        return g[n2];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.Nm.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral6730_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Nm"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private void a(java.util.Map<java.lang.String, moom.Lu> p0, moom.bY p1) {
java.lang.Object lexicalValue1014_21_0;
    java.lang.Object lexicalValue1014_52_0;
    java.lang.String spill1014_0;
    java.lang.String[] spill1014_1;
    java.lang.String[] spill1014_2;
    long life3_3;
    java.lang.String[] life6_7;
    java.lang.String life5_8;
    int life7_31;
    java.lang.String life8_39;
    java.lang.String[] life9_42;
    int life10_68;
    java.lang.String life11_76;
    lexical_join_87: {
    lexical_join_24: {
    lexical_join_21: {
    life3_3 = (moom.Nm.b ^ 123275875819841L);
    spill1014_0 = moom.Nq.b__String();
    life6_7 = ((moom.bY)(p1)).a__ArrayString();
    life5_8 = spill1014_0;
    spill1014_1 = life6_7;
    if (!((life5_8 != null))) {
        lexicalValue1014_21_0 = spill1014_1;
        break lexical_join_21;
    }
    if (!((spill1014_1 == null))) {
        break lexical_join_24;
    }
    lexicalValue1014_21_0 = ((java.util.Map)(p0)).put(((java.lang.Object)(((moom.bY)(p1)).a())), ((java.lang.Object)(new moom.Np(p1))));
    }
    recovery.source.CarrierOps.discard(lexicalValue1014_21_0);
    if (!((life5_8 == null))) {
        break lexical_join_87;
    }
    }
    life7_31 = 0;
    lexical_cycle_26: while (true) {
    lexical_join_85: {
    lexical_join_84: {
    lexical_join_55: {
    lexical_join_52: {
    if (!((life7_31 < (life6_7).length))) {
        break lexical_join_87;
    }
    life8_39 = (life6_7)[life7_31];
    life9_42 = ((moom.bY)(p1)).b();
    spill1014_2 = life9_42;
    if (!((life5_8 != null))) {
        lexicalValue1014_52_0 = spill1014_2;
        break lexical_join_52;
    }
    if (!((spill1014_2 == null))) {
        break lexical_join_55;
    }
    lexicalValue1014_52_0 = ((java.util.Map)(p0)).put(((java.lang.Object)(__sourceIntrinsic_49def62a7e3f_invokedynamic1014_8(((moom.bY)(p1)).a(), life8_39))), ((java.lang.Object)(new moom.Np(p1, life7_31))));
    }
    recovery.source.CarrierOps.discard(lexicalValue1014_52_0);
    if (!((life5_8 == null))) {
        break lexical_join_84;
    }
    }
    life10_68 = 0;
    lexical_cycle_57: while (true) {
    if (!((life10_68 < (life9_42).length))) {
        break lexical_join_84;
    }
    life11_76 = (life9_42)[life10_68];
    ((java.util.Map)(p0)).put(((java.lang.Object)(__sourceIntrinsic_49def62a7e3f_invokedynamic1014_12(((moom.bY)(p1)).a(), life8_39, life11_76))), ((java.lang.Object)(new moom.Np(p1, life7_31, life10_68))));
    life10_68 += 1;
    if (!((life5_8 != null))) {
        break lexical_join_85;
    }
    if (!((life5_8 == null))) { continue lexical_cycle_57; }
    break lexical_cycle_57;
    }
    }
    life7_31 += 1;
    }
    if (!((life5_8 == null))) { continue lexical_cycle_26; }
    break lexical_cycle_26;
    }
    }
    return;
}


private void a() {
java.util.Map lexicalValue1013_59_0;
    java.lang.String spill1013_0;
    java.util.Map spill1013_1;
    long life1_3;
    moom.bY[] life4_5;
    moom.bY[] life5_7;
    int life6_10;
    int life7_13;
    java.lang.String life3_14;
    moom.bY life8_21;
    moom.bX[] life5_31;
    moom.bX[] life6_33;
    int life7_36;
    int life8_38;
    moom.bX life9_45;
    java.util.Iterator life6_64;
    net.minecraft.world.biome.BiomeGenBase life7_71;
    java.lang.String life8_75;
    java.lang.String life8_96;
    int life9_99;
    moom.Ll life10_105;
    lexical_join_110: {
    lexical_join_59: {
    lexical_join_58: {
    lexical_join_30: {
    life1_3 = (moom.Nm.b ^ 17991804738247L);
    life4_5 = moom.bY.values();
    life5_7 = life4_5;
    life6_10 = (life5_7).length;
    spill1013_0 = moom.Nq.b__String();
    life7_13 = 0;
    life3_14 = spill1013_0;
    lexical_cycle_15: while (true) {
    if (!((life7_13 < life6_10))) {
        break lexical_join_30;
    }
    life8_21 = (life5_7)[life7_13];
    ((moom.Nm)(this)).a(((java.util.Map)(this.a)), ((moom.bY)(life8_21)));
    life7_13 += 1;
    if (!((life3_14 == null))) { continue lexical_cycle_15; }
    break lexical_cycle_15;
    }
    }
    life5_31 = moom.bX.values();
    life6_33 = life5_31;
    life7_36 = (life6_33).length;
    life8_38 = 0;
    lexical_cycle_39: while (true) {
    if (!((life8_38 < life7_36))) {
        break lexical_join_58;
    }
    life9_45 = (life6_33)[life8_38];
    spill1013_1 = this.a;
    if (!((life3_14 != null))) {
        lexicalValue1013_59_0 = spill1013_1;
        break lexical_join_59;
    }
    ((java.util.Map)(spill1013_1)).put(((java.lang.Object)(((moom.bX)(life9_45)).a())), ((java.lang.Object)(life9_45)));
    life8_38 += 1;
    if (!((life3_14 == null))) { continue lexical_cycle_39; }
    break lexical_cycle_39;
    }
    }
    lexicalValue1013_59_0 = net.minecraft.world.biome.BiomeGenBase.q;
    }
    life6_64 = ((java.util.Collection)(((java.util.Map)(lexicalValue1013_59_0)).values())).iterator();
    lexical_cycle_62: while (true) {
    if (!(((java.util.Iterator)(life6_64)).hasNext())) {
        break lexical_join_110;
    }
    life7_71 = ((net.minecraft.world.biome.BiomeGenBase)(((java.util.Iterator)(life6_64)).next()));
    life8_75 = ((java.lang.String)(((net.minecraft.world.biome.BiomeGenBase)(life7_71)).aj)).trim();
    java.lang.String __stackOp1013_22_0 = ((java.lang.String)(((java.lang.String)(life8_75)).toUpperCase())).replace(((char)(__sourceIntrinsic_2c8ae721fed4_invokedynamic1013_18(9615, (8140361503333130582L ^ life1_3)))), ((char)(__sourceIntrinsic_2c8ae721fed4_invokedynamic1013_19(10047, (4124257048188691431L ^ life1_3)))));
    java.lang.String __stackOp1013_22_1 = __sourceIntrinsic_2c8ae721fed4_invokedynamic1013_21(11602, (7939443957650867028L ^ life1_3));
    life8_96 = __sourceIntrinsic_2c8ae721fed4_invokedynamic1013_23(__stackOp1013_22_1, __stackOp1013_22_0);
    life9_99 = ((net.minecraft.world.biome.BiomeGenBase)(life7_71)).aB;
    life10_105 = new moom.Ll(((float) life9_99));
    ((moom.Nm)(this)).a(((java.lang.String)(life8_96)), ((moom.Lu)(life10_105)));
    if (!((life3_14 == null))) { continue lexical_cycle_62; }
    break lexical_cycle_62;
    }
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public boolean a__Boolean(java.lang.String p0) {
return (__sourceIntrinsic_booleanComparison((((java.util.Map)(this.a)).containsKey(((java.lang.Object)(p0))))) != 0);
}


public moom.Lu a__Lu(java.lang.String p0) {
return ((moom.Lu)(((java.util.Map)(this.a)).get(((java.lang.Object)(p0)))));
}


public boolean a(java.lang.String p0, moom.Lu p1) {
int forwardValue2862_31_0;
    boolean spill2862_0;
    long life3_3;
    java.lang.String life5_5;
    forward_join_31: {
    forward_join_24: {
    life3_3 = (moom.Nm.b ^ 20282294047109L);
    life5_5 = moom.Nq.b__String();
    spill2862_0 = ((java.util.Map)(this.a)).containsKey(((java.lang.Object)(p0)));
    if (!((life5_5 != null))) {
        forwardValue2862_31_0 = ((spill2862_0) ? 1 : 0);
        break forward_join_31;
    }
    if (!(spill2862_0)) {
        break forward_join_24;
    }
    java.lang.String __stackOp2862_6_0 = p0;
    java.lang.String __stackOp2862_6_1 = __sourceIntrinsic_aad034dddd01_invokedynamic2862_5(5878, (4010440725315302323L ^ life3_3));
    moom.ME.b(((java.lang.String)(__sourceIntrinsic_aad034dddd01_invokedynamic2862_7(__stackOp2862_6_1, __stackOp2862_6_0))));
    return ((0) != 0);
    }
    ((java.util.Map)(this.a)).put(((java.lang.Object)(p0)), ((java.lang.Object)(p1)));
    forwardValue2862_31_0 = 1;
    }
    return ((forwardValue2862_31_0) != 0);
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
        byte[] spill3391_0 = p0;
        life4_9 += 1;
        life5_44 = (spill3391_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill3391_1 = p0;
        life4_9 += 1;
        life5_76 = (spill3391_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill3391_2 = p0;
        life4_9 += 1;
        life5_91 = (spill3391_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static java.lang.String a(int p0, long p1) {
int life5_8;
    java.lang.Long life3_16;
    java.lang.Object[] life4_21;
    byte[] life6_60;
    int life7_70;
    javax.crypto.spec.DESKeySpec life7_92;
    javax.crypto.SecretKey life8_99;
    byte[] life9_116;
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 4407);
    if (((moom.Nm.d)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.Nm.e)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.Nm.e)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/Nm", life9_51);
    }
        life6_60 = new byte[8];
        (life6_60)[0] = ((byte) ((int) (p1 >>> 56)));
        life7_70 = 1;
        loop_region_71: while ((life7_70 < 8)) {
        (life6_60)[life7_70] = ((byte) ((int) ((p1 << (life7_70 * 8)) >>> 56)));
        life7_70 += 1;
    }
        life7_92 = new javax.crypto.spec.DESKeySpec(life6_60);
        life8_99 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life4_21)[1])))).generateSecret(((java.security.spec.KeySpec)(life7_92)));
        ((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).init(((int)(2)), ((java.security.Key)(life8_99)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life4_21)[2])))));
        life9_116 = ((java.lang.String)((moom.Nm.c)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.Nm.d)[life5_8] = moom.Nm.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.Nm.d)[life5_8];
}


private static native <E extends Throwable> int __sourceIntrinsic_2c8ae721fed4_invokedynamic1013_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2c8ae721fed4_invokedynamic1013_19(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2c8ae721fed4_invokedynamic1013_21(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2c8ae721fed4_invokedynamic1013_23(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_aad034dddd01_invokedynamic2862_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_aad034dddd01_invokedynamic2862_7(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral6730_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_49def62a7e3f_invokedynamic1014_8(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_49def62a7e3f_invokedynamic1014_12(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral6729_0() throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
