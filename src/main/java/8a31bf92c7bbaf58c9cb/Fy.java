package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Fy implements moom.Fn {

private java.util.Random a;

private moom.FV b;

private moom.FV c;

private moom.FV d;

public moom.FV e;

public moom.FV f;

private net.minecraft.world.World g;

private double[] h;

private net.minecraft.world.biome.BiomeGenBase[] i;

double[] j;

double[] k;

double[] l;

double[] m;

double[] n;

private static long o;

private static long[] p;

private static java.lang.Integer[] q;

private static java.util.Map r;

private static long[] s;

private static java.lang.Long[] t;

private static java.util.Map u;

public Fy(net.minecraft.world.World p0, long p1) { super(); }


private static void __sourceConstructorBody_e61dea92caeadbd2(moom.Fy receiver, net.minecraft.world.World p0, long p1) throws Throwable {

long local4 = (moom.Fy.o ^ 54045829333964L);

    moom.Fy.__sourceConstructorInit_e61dea92caeadbd2_0(((moom.Fy)(receiver)));

    ((moom.Fy)(receiver)).g = ((net.minecraft.world.World)(p0));

    ((moom.Fy)(receiver)).a = ((java.util.Random)(new java.util.Random(p1)));

    ((moom.Fy)(receiver)).b = ((moom.FV)(new moom.FV(((moom.Fy)(receiver)).a, __sourceIntrinsic_e61dea92caeadbd2_originalDynamicSite2052_5(13156, (4951046929004633214L ^ local4)))));

    ((moom.Fy)(receiver)).c = ((moom.FV)(new moom.FV(((moom.Fy)(receiver)).a, __sourceIntrinsic_e61dea92caeadbd2_originalDynamicSite2052_8(13156, (4951046929004633214L ^ local4)))));

    ((moom.Fy)(receiver)).d = ((moom.FV)(new moom.FV(((moom.Fy)(receiver)).a, __sourceIntrinsic_e61dea92caeadbd2_originalDynamicSite2052_11(23247, (14215349595108817L ^ local4)))));

    ((moom.Fy)(receiver)).e = ((moom.FV)(new moom.FV(((moom.Fy)(receiver)).a, __sourceIntrinsic_e61dea92caeadbd2_originalDynamicSite2052_14(28275, (3548191311821095276L ^ local4)))));

    ((moom.Fy)(receiver)).f = ((moom.FV)(new moom.FV(((moom.Fy)(receiver)).a, __sourceIntrinsic_e61dea92caeadbd2_originalDynamicSite2052_17(13156, (4951046929004633214L ^ local4)))));

    return;

}



static {
o = ((long)(((moom._a)(moom._c.a(((long)(9035769143410725745L)), ((long)(-62898123300864524L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(22567295510089L)))));
    r = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (moom.Fy.o ^ 131676120293411L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill543_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill543_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill543_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill543_14 = new byte[8];
    (__sourceSpill543_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill543_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation543_16 = __sourceSpill543_14;
    ((javax.crypto.Cipher)(__sourceSpill543_11)).init(((int)(__sourceSpill543_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill543_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation543_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local19_life19 = new long[8];
    int local16_life20 = 0;
    java.lang.String local17_life21;
    int local18_life23 = ((java.lang.String)((local17_life21 = "Ó\rÈ<^g\020JQ2±Û Jo\013x³rÅHôv#ÇdP\034\000\035àÝZ¢¯_¹kU<\006"))).length();
    int local15_life24 = 0;
    do {
        java.lang.String __sourceSpill543_25 = local17_life21;
        int __sourceSpill543_26 = local15_life24;
        local15_life24 += 8;
        byte[] local20_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill543_25)).substring(((int)(__sourceSpill543_26)), ((int)(local15_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill543_30 = local19_life19;
        int __sourceSpill543_31 = local16_life20;
        local16_life20 += 1;
        long local21_life32 = (((((((((((long) (local20_life29)[0]) & 255L) << 56) | ((((long) (local20_life29)[1]) & 255L) << 48)) | ((((long) (local20_life29)[2]) & 255L) << 40)) | ((((long) (local20_life29)[3]) & 255L) << 32)) | ((((long) (local20_life29)[4]) & 255L) << 24)) | ((((long) (local20_life29)[5]) & 255L) << 16)) | ((((long) (local20_life29)[6]) & 255L) << 8)) | (((long) (local20_life29)[7]) & 255L));
        byte[] __sourceSpill543_33 = new byte[8];
        (__sourceSpill543_33)[0] = ((byte) ((int) (local21_life32 >>> 56)));
        (__sourceSpill543_33)[1] = ((byte) ((int) (local21_life32 >>> 48)));
        (__sourceSpill543_33)[2] = ((byte) ((int) (local21_life32 >>> 40)));
        (__sourceSpill543_33)[3] = ((byte) ((int) (local21_life32 >>> 32)));
        (__sourceSpill543_33)[4] = ((byte) ((int) (local21_life32 >>> 24)));
        (__sourceSpill543_33)[5] = ((byte) ((int) (local21_life32 >>> 16)));
        (__sourceSpill543_33)[6] = ((byte) ((int) (local21_life32 >>> 8)));
        (__sourceSpill543_33)[7] = ((byte) ((int) local21_life32));
        javax.crypto.Cipher __sourceSpill543_34 = local13_life9;
        byte[] local23_life36 = ((javax.crypto.Cipher)(__sourceSpill543_34)).doFinal(((byte[])(__sourceSpill543_33)));
        (__sourceSpill543_30)[__sourceSpill543_31] = (((((((((((long) (local23_life36)[0]) & 255L) << 56) | ((((long) (local23_life36)[1]) & 255L) << 48)) | ((((long) (local23_life36)[2]) & 255L) << 40)) | ((((long) (local23_life36)[3]) & 255L) << 32)) | ((((long) (local23_life36)[4]) & 255L) << 24)) | ((((long) (local23_life36)[5]) & 255L) << 16)) | ((((long) (local23_life36)[6]) & 255L) << 8)) | (((long) (local23_life36)[7]) & 255L));
    } while ((!(local15_life24 >= local18_life23)));
    local18_life23 = ((java.lang.String)((local17_life21 = "\"¥¨¶Åµ57ziÌßáöz"))).length();
    local15_life24 = 0;
    do {
        java.lang.String __sourceSpill543_38 = local17_life21;
        int __sourceSpill543_39 = local15_life24;
        local15_life24 += 8;
        byte[] local20_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill543_38)).substring(((int)(__sourceSpill543_39)), ((int)(local15_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill543_43 = local19_life19;
        int __sourceSpill543_44 = local16_life20;
        local16_life20 += 1;
        long local21_life45 = (((((((((((long) (local20_life42)[0]) & 255L) << 56) | ((((long) (local20_life42)[1]) & 255L) << 48)) | ((((long) (local20_life42)[2]) & 255L) << 40)) | ((((long) (local20_life42)[3]) & 255L) << 32)) | ((((long) (local20_life42)[4]) & 255L) << 24)) | ((((long) (local20_life42)[5]) & 255L) << 16)) | ((((long) (local20_life42)[6]) & 255L) << 8)) | (((long) (local20_life42)[7]) & 255L));
        byte[] __sourceSpill543_46 = new byte[8];
        (__sourceSpill543_46)[0] = ((byte) ((int) (local21_life45 >>> 56)));
        (__sourceSpill543_46)[1] = ((byte) ((int) (local21_life45 >>> 48)));
        (__sourceSpill543_46)[2] = ((byte) ((int) (local21_life45 >>> 40)));
        (__sourceSpill543_46)[3] = ((byte) ((int) (local21_life45 >>> 32)));
        (__sourceSpill543_46)[4] = ((byte) ((int) (local21_life45 >>> 24)));
        (__sourceSpill543_46)[5] = ((byte) ((int) (local21_life45 >>> 16)));
        (__sourceSpill543_46)[6] = ((byte) ((int) (local21_life45 >>> 8)));
        (__sourceSpill543_46)[7] = ((byte) ((int) local21_life45));
        javax.crypto.Cipher __sourceSpill543_47 = local13_life9;
        byte[] local23_life49 = ((javax.crypto.Cipher)(__sourceSpill543_47)).doFinal(((byte[])(__sourceSpill543_46)));
        (__sourceSpill543_43)[__sourceSpill543_44] = (((((((((((long) (local23_life49)[0]) & 255L) << 56) | ((((long) (local23_life49)[1]) & 255L) << 48)) | ((((long) (local23_life49)[2]) & 255L) << 40)) | ((((long) (local23_life49)[3]) & 255L) << 32)) | ((((long) (local23_life49)[4]) & 255L) << 24)) | ((((long) (local23_life49)[5]) & 255L) << 16)) | ((((long) (local23_life49)[6]) & 255L) << 8)) | (((long) (local23_life49)[7]) & 255L));
    } while ((!(local15_life24 >= local18_life23)));
    p = ((long[])(local19_life19));
    q = ((java.lang.Integer[])(new java.lang.Integer[8]));
    u = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life54;
    javax.crypto.Cipher __sourceSpill543_56 = (local0_life54 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill543_57 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill543_58 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill543_59 = new byte[8];
    (__sourceSpill543_59)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life60 = 1;
    while ((local1_life60 < 8)) {
        (__sourceSpill543_59)[local1_life60] = ((byte) ((int) ((local11_life7 << (local1_life60 * 8)) >>> 56)));
        local1_life60 += 1;
    }
    byte[] __sourcePreallocation543_61 = __sourceSpill543_59;
    ((javax.crypto.Cipher)(__sourceSpill543_56)).init(((int)(__sourceSpill543_57)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill543_58)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation543_61)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life64 = new long[2];
    int local3_life65 = 0;
    java.lang.String local4_life66;
    int local5_life68 = ((java.lang.String)((local4_life66 = "{GÑÔ÷¨\027aÿ§öÚ¿\001"))).length();
    int local2_life69 = 0;
    do {
        java.lang.String __sourceSpill543_70 = local4_life66;
        int __sourceSpill543_71 = local2_life69;
        local2_life69 += 8;
        byte[] local7_life74 = ((java.lang.String)(((java.lang.String)(__sourceSpill543_70)).substring(((int)(__sourceSpill543_71)), ((int)(local2_life69))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill543_75 = local6_life64;
        int __sourceSpill543_76 = local3_life65;
        local3_life65 += 1;
        long local8_life77 = (((((((((((long) (local7_life74)[0]) & 255L) << 56) | ((((long) (local7_life74)[1]) & 255L) << 48)) | ((((long) (local7_life74)[2]) & 255L) << 40)) | ((((long) (local7_life74)[3]) & 255L) << 32)) | ((((long) (local7_life74)[4]) & 255L) << 24)) | ((((long) (local7_life74)[5]) & 255L) << 16)) | ((((long) (local7_life74)[6]) & 255L) << 8)) | (((long) (local7_life74)[7]) & 255L));
        byte[] __sourceSpill543_78 = new byte[8];
        (__sourceSpill543_78)[0] = ((byte) ((int) (local8_life77 >>> 56)));
        (__sourceSpill543_78)[1] = ((byte) ((int) (local8_life77 >>> 48)));
        (__sourceSpill543_78)[2] = ((byte) ((int) (local8_life77 >>> 40)));
        (__sourceSpill543_78)[3] = ((byte) ((int) (local8_life77 >>> 32)));
        (__sourceSpill543_78)[4] = ((byte) ((int) (local8_life77 >>> 24)));
        (__sourceSpill543_78)[5] = ((byte) ((int) (local8_life77 >>> 16)));
        (__sourceSpill543_78)[6] = ((byte) ((int) (local8_life77 >>> 8)));
        (__sourceSpill543_78)[7] = ((byte) ((int) local8_life77));
        javax.crypto.Cipher __sourceSpill543_79 = local0_life54;
        byte[] local10_life81 = ((javax.crypto.Cipher)(__sourceSpill543_79)).doFinal(((byte[])(__sourceSpill543_78)));
        (__sourceSpill543_75)[__sourceSpill543_76] = (((((((((((long) (local10_life81)[0]) & 255L) << 56) | ((((long) (local10_life81)[1]) & 255L) << 48)) | ((((long) (local10_life81)[2]) & 255L) << 40)) | ((((long) (local10_life81)[3]) & 255L) << 32)) | ((((long) (local10_life81)[4]) & 255L) << 24)) | ((((long) (local10_life81)[5]) & 255L) << 16)) | ((((long) (local10_life81)[6]) & 255L) << 8)) | (((long) (local10_life81)[7]) & 255L));
    } while ((!(local2_life69 >= local5_life68)));
    s = ((long[])(local6_life64));
    t = ((java.lang.Long[])(new java.lang.Long[2]));
}

private static native <E extends Throwable> void __sourceConstructorInit_e61dea92caeadbd2_0(moom.Fy a0) throws E;

public boolean b__Boolean() {
return ((1) != 0);
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4577_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Fy"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static long b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    long local7 = moom.Fy.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local9 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Long.TYPE)), ((java.lang.Object)(java.lang.Long.valueOf(((long)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local9)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
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
    life3_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 18313);
    if (((moom.Fy.t)[life3_8] == null)) {
        life4_77 = new byte[] {((byte) ((int) (p1 >>> 56))), ((byte) ((int) (p1 >>> 48))), ((byte) ((int) (p1 >>> 40))), ((byte) ((int) (p1 >>> 32))), ((byte) ((int) (p1 >>> 24))), ((byte) ((int) (p1 >>> 16))), ((byte) ((int) (p1 >>> 8))), ((byte) ((int) p1))};
        life5_81 = (moom.Fy.s)[life3_8];
        life7_146 = new byte[] {((byte) ((int) (life5_81 >>> 56))), ((byte) ((int) (life5_81 >>> 48))), ((byte) ((int) (life5_81 >>> 40))), ((byte) ((int) (life5_81 >>> 32))), ((byte) ((int) (life5_81 >>> 24))), ((byte) ((int) (life5_81 >>> 16))), ((byte) ((int) (life5_81 >>> 8))), ((byte) ((int) life5_81))};
        life8_150 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life9_155 = ((java.lang.Object[])(((java.util.Map)(moom.Fy.u)).get(((java.lang.Object)(life8_150)))));
        try {
        if ((life9_155 == null)) {
        life9_155 = new java.lang.Object[3];
        (life9_155)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding")));
        (life9_155)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life9_155)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.Fy.u)).put(((java.lang.Object)(life8_150)), ((java.lang.Object)(life9_155)));
    }
        life11_188 = new javax.crypto.spec.DESKeySpec(life4_77);
        life12_195 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life9_155)[1])))).generateSecret(((java.security.spec.KeySpec)(life11_188)));
        life13_200 = ((javax.crypto.Cipher)((life9_155)[0]));
        ((javax.crypto.Cipher)(life13_200)).init(((int)(2)), ((java.security.Key)(life12_195)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life9_155)[2])))));
        life10_212 = ((javax.crypto.Cipher)(life13_200)).doFinal(((byte[])(life7_146)));
    } catch (java.lang.Exception life11_214) {
        throw new java.lang.RuntimeException("moom/Fy", life11_214);
    }
        life11_290 = (((((((((((long) (life10_212)[0]) & 255L) << 56) | ((((long) (life10_212)[1]) & 255L) << 48)) | ((((long) (life10_212)[2]) & 255L) << 40)) | ((((long) (life10_212)[3]) & 255L) << 32)) | ((((long) (life10_212)[4]) & 255L) << 24)) | ((((long) (life10_212)[5]) & 255L) << 16)) | ((((long) (life10_212)[6]) & 255L) << 8)) | (((long) (life10_212)[7]) & 255L));
        (moom.Fy.t)[life3_8] = java.lang.Long.valueOf(((long)(life11_290)));
    }
    return ((java.lang.Long)((moom.Fy.t)[life3_8])).longValue();
}


private static int a(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x5428;
        if (q[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = p[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])r.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    r.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/Fy", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Fy.q[n2] = n3;
        }
        return q[n2];
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public net.minecraft.world.chunk.Chunk a(int p0, int p1) {
java.lang.String[] spill661_0;
    long life3_3;
    moom.Fm life6_28;
    java.lang.String[] life5_29;
    net.minecraft.world.chunk.Chunk life7_78;
    byte[] life8_81;
    int life9_83;
    lexical_join_104: {
    lexical_join_102: {
    life3_3 = (moom.Fy.o ^ 32536715625914L);
    ((java.util.Random)(this.a)).setSeed(((long)(((((long) p0) * __sourceIntrinsic_a55be857de7c_invokedynamic661_2(3076, (4752961908255635148L ^ life3_3))) + (((long) p1) * __sourceIntrinsic_a55be857de7c_invokedynamic661_3(14556, (4867947636150829589L ^ life3_3)))))));
    spill661_0 = moom.FI.b();
    life6_28 = new moom.Fm();
    life5_29 = spill661_0;
    this.i = ((net.minecraft.world.biome.BiomeGenBase[])(((net.minecraft.world.biome.WorldChunkManager)(((net.minecraft.world.World)(this.g)).a__Ff())).b(((net.minecraft.world.biome.BiomeGenBase[])(this.i)), ((int)((p0 * __sourceIntrinsic_a55be857de7c_invokedynamic661_9(13156, (4951015386545461768L ^ life3_3))))), ((int)((p1 * __sourceIntrinsic_a55be857de7c_invokedynamic661_10(13156, (4951015386545461768L ^ life3_3))))), ((int)(__sourceIntrinsic_a55be857de7c_invokedynamic661_11(13156, (4951015386545461768L ^ life3_3)))), ((int)(__sourceIntrinsic_a55be857de7c_invokedynamic661_12(13156, (4951015386545461768L ^ life3_3)))))));
    ((moom.Fy)(this)).a(((int)(p0)), ((int)(p1)), ((moom.Fm)(life6_28)));
    ((moom.Fy)(this)).a(((moom.Fm)(life6_28)));
    life7_78 = new net.minecraft.world.chunk.Chunk(this.g, life6_28, p0, p1);
    life8_81 = ((net.minecraft.world.chunk.Chunk)(life7_78)).a__ArrayByte();
    life9_83 = 0;
    lexical_cycle_84: while (true) {
    if (!((life9_83 < (life8_81).length))) {
        break lexical_join_102;
    }
    (life8_81)[life9_83] = ((byte) ((net.minecraft.world.biome.BiomeGenBase)((this.i)[life9_83])).aB);
    life9_83 += 1;
    if (!((life5_29 != null))) {
        break lexical_join_104;
    }
    if (!((life5_29 == null))) { continue lexical_cycle_84; }
    break lexical_cycle_84;
    }
    }
    ((net.minecraft.world.chunk.Chunk)(life7_78)).b__Void();
    }
    return life7_78;
}


public net.minecraft.world.chunk.Chunk a(moom.DT p0) {
return ((moom.Fy)(this)).a(((int)((((moom.DT)(p0)).a() >> 4))), ((int)((((moom.DT)(p0)).c() >> 4))));
}


public void a(net.minecraft.world.chunk.Chunk p0, int p1, int p2) {
return;
}


public java.util.List<moom.D7> a(net.minecraft.entity.EnumCreatureType p0, moom.DT p1) {
return ((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.World)(this.g)).a__ES(((moom.DT)(p1))))).a(((net.minecraft.entity.EnumCreatureType)(p0)));
}


public void a(int p0, int p1, moom.Fm p2) {
int forestValue629_41_0;
    int forestValue629_46_0;
    int forestValue629_53_0;
    int forestValue629_210_0;
    int forestValue629_235_0;
    java.lang.String[] spill629_0;
    int spill629_1;
    int spill629_2;
    int spill629_3;
    int spill629_4;
    int spill629_5;
    long life4_3;
    int life7_5;
    int life8_9;
    int life9_15;
    int life10_20;
    java.lang.String[] life6_37;
    int life11_39;
    int life12_44;
    int life13_51;
    double life14_60;
    double life16_73;
    double life18_88;
    double life20_103;
    double life22_120;
    double life24_139;
    double life26_160;
    double life28_181;
    double life30_204;
    int life32_208;
    double life33_213;
    double life35_215;
    double life37_217;
    double life39_223;
    double life41_229;
    int life43_233;
    double life44_242;
    double life46_244;
    double life48_250;
    int life50_254;
    net.minecraft.block.state.IBlockState life51_263;
    int life52_282;
    int life53_288;
    int life54_298;
    forest_join_351: {
    life4_3 = (moom.Fy.o ^ 62269925745671L);
    life7_5 = 2;
    life8_9 = (life7_5 + 1);
    life9_15 = __sourceIntrinsic_273b4708c739_invokedynamic629_1(3617, (971627891238258417L ^ life4_3));
    spill629_0 = moom.FI.b();
    life10_20 = (life7_5 + 1);
    this.h = ((double[])(((moom.Fy)(this)).a(((double[])(this.h)), ((int)((p0 * life7_5))), ((int)(0)), ((int)((p1 * life7_5))), ((int)(life8_9)), ((int)(life9_15)), ((int)(life10_20)))));
    life6_37 = spill629_0;
    life11_39 = 0;
    forest_cycle_40: while (true) {
    forest_join_348: {
    forestValue629_41_0 = life11_39;
    forest_cycle_41: while (true) {
    if (!((forestValue629_41_0 < life7_5))) {
        break forest_join_351;
    }
    life12_44 = 0;
    forest_cycle_45: while (true) {
    forest_join_345: {
    forestValue629_46_0 = life12_44;
    forest_cycle_46: while (true) {
    if (!((forestValue629_46_0 < life7_5))) {
        break forest_join_348;
    }
    spill629_1 = 0;
    if (!((life6_37 != null))) {
        forestValue629_41_0 = spill629_1;
        continue forest_cycle_41;
    }
    life13_51 = spill629_1;
    forest_cycle_52: while (true) {
    forest_join_342: {
    forestValue629_53_0 = life13_51;
    forest_cycle_53: while (true) {
    if (!((forestValue629_53_0 < __sourceIntrinsic_273b4708c739_invokedynamic629_6(32302, (8381855933309269756L ^ life4_3))))) {
        break forest_join_345;
    }
    life14_60 = 0x1.0p-2d;
    life16_73 = (this.h)[((((life11_39 * life10_20) + life12_44) * life9_15) + life13_51)];
    life18_88 = (this.h)[(((((life11_39 * life10_20) + life12_44) + 1) * life9_15) + life13_51)];
    life20_103 = (this.h)[(((((life11_39 + 1) * life10_20) + life12_44) * life9_15) + life13_51)];
    life22_120 = (this.h)[((((((life11_39 + 1) * life10_20) + life12_44) + 1) * life9_15) + life13_51)];
    life24_139 = (((this.h)[(((((life11_39 * life10_20) + life12_44) * life9_15) + life13_51) + 1)] - life16_73) * life14_60);
    life26_160 = (((this.h)[((((((life11_39 * life10_20) + life12_44) + 1) * life9_15) + life13_51) + 1)] - life18_88) * life14_60);
    life28_181 = (((this.h)[((((((life11_39 + 1) * life10_20) + life12_44) * life9_15) + life13_51) + 1)] - life20_103) * life14_60);
    life30_204 = (((this.h)[(((((((life11_39 + 1) * life10_20) + life12_44) + 1) * life9_15) + life13_51) + 1)] - life22_120) * life14_60);
    spill629_2 = 0;
    if (!((life6_37 != null))) {
        forestValue629_46_0 = spill629_2;
        continue forest_cycle_46;
    }
    life32_208 = spill629_2;
    forest_cycle_209: while (true) {
    forest_join_323: {
    forestValue629_210_0 = life32_208;
    forest_cycle_210: while (true) {
    if (!((forestValue629_210_0 < 4))) {
        break forest_join_342;
    }
    life33_213 = 0x1.0p-3d;
    life35_215 = life16_73;
    life37_217 = life18_88;
    life39_223 = ((life20_103 - life16_73) * life33_213);
    life41_229 = ((life22_120 - life18_88) * life33_213);
    spill629_3 = 0;
    if (!((life6_37 != null))) {
        forestValue629_53_0 = spill629_3;
        continue forest_cycle_53;
    }
    life43_233 = spill629_3;
    forest_cycle_234: while (true) {
    forest_join_312: {
    forestValue629_235_0 = life43_233;
    forest_cycle_235: while (true) {
    if (!((forestValue629_235_0 < __sourceIntrinsic_273b4708c739_invokedynamic629_15(23247, (14224713182155290L ^ life4_3))))) {
        break forest_join_323;
    }
    life44_242 = 0x1.0p-3d;
    life46_244 = life35_215;
    life48_250 = ((life37_217 - life35_215) * life44_242);
    spill629_4 = 0;
    if (!((life6_37 != null))) {
        forestValue629_210_0 = spill629_4;
        continue forest_cycle_210;
    }
    life50_254 = spill629_4;
    forest_cycle_255: while (true) {
    forest_join_273: {
    if (!((life50_254 < __sourceIntrinsic_273b4708c739_invokedynamic629_16(23247, (14224713182155290L ^ life4_3))))) {
        break forest_join_312;
    }
    life51_263 = null;
    spill629_5 = recovery.source.CarrierOps.dcmpl(((double)(life46_244)), ((double)(0x0.0p0d)));
    if (!((life6_37 != null))) {
        forestValue629_235_0 = spill629_5;
        continue forest_cycle_235;
    }
    if (!((spill629_5 > 0))) {
        break forest_join_273;
    }
    life51_263 = ((net.minecraft.block.Block)(net.minecraft.init.Blocks.bw)).a__fE();
    }
    life52_282 = (life43_233 + (life11_39 * __sourceIntrinsic_273b4708c739_invokedynamic629_20(23247, (14224713182155290L ^ life4_3))));
    life53_288 = (life32_208 + (life13_51 * 4));
    life54_298 = (life50_254 + (life12_44 * __sourceIntrinsic_273b4708c739_invokedynamic629_21(23247, (14224713182155290L ^ life4_3))));
    ((moom.Fm)(p2)).a(((int)(life52_282)), ((int)(life53_288)), ((int)(life54_298)), ((net.minecraft.block.state.IBlockState)(life51_263)));
    life46_244 = (life46_244 + life48_250);
    life50_254 += 1;
    if (!((life6_37 == null))) {
        continue forest_cycle_255;
    }
    break forest_cycle_255;
    }
    break forest_cycle_235;
    }
    }
    life35_215 = (life35_215 + life39_223);
    life37_217 = (life37_217 + life41_229);
    life43_233 += 1;
    if (!((life6_37 == null))) {
        continue forest_cycle_234;
    }
    break forest_cycle_234;
    }
    break forest_cycle_210;
    }
    }
    life16_73 = (life16_73 + life24_139);
    life18_88 = (life18_88 + life26_160);
    life20_103 = (life20_103 + life28_181);
    life22_120 = (life22_120 + life30_204);
    life32_208 += 1;
    if (!((life6_37 == null))) {
        continue forest_cycle_209;
    }
    break forest_cycle_209;
    }
    break forest_cycle_53;
    }
    }
    life13_51 += 1;
    if (!((life6_37 == null))) {
        continue forest_cycle_52;
    }
    break forest_cycle_52;
    }
    break forest_cycle_46;
    }
    }
    life12_44 += 1;
    if (!((life6_37 == null))) {
        continue forest_cycle_45;
    }
    break forest_cycle_45;
    }
    break forest_cycle_41;
    }
    }
    life11_39 += 1;
    if (!((life6_37 == null))) {
        continue forest_cycle_40;
    }
    break forest_cycle_40;
    }
    }
    return;
}


public void a(moom.Fm p0) {
int forestValue630_9_0;
    net.minecraft.block.Block forestValue630_32_0;
    net.minecraft.block.Block forestValue630_65_0;
    int forestValue630_87_0;
    int forestValue630_105_0;
    java.lang.String[] spill630_0;
    int spill630_1;
    net.minecraft.block.Block spill630_2;
    int spill630_3;
    int spill630_4;
    long life2_3;
    int life5_6;
    java.lang.String[] life4_7;
    int life6_16;
    int life7_25;
    int life8_27;
    net.minecraft.block.state.IBlockState life9_30;
    net.minecraft.block.state.IBlockState life10_33;
    int life11_41;
    net.minecraft.block.state.IBlockState life12_49;
    forest_join_122: {
    life2_3 = (moom.Fy.o ^ 20522616622536L);
    spill630_0 = moom.FI.b();
    life5_6 = 0;
    life4_7 = spill630_0;
    forest_cycle_8: while (true) {
    forest_join_119: {
    forestValue630_9_0 = life5_6;
    forest_cycle_9: while (true) {
    if (!((forestValue630_9_0 < __sourceIntrinsic_e148408df0fc_invokedynamic630_2(81, (5329211680901439821L ^ life2_3))))) {
        break forest_join_122;
    }
    life6_16 = 0;
    forest_cycle_17: while (true) {
    forest_join_116: {
    if (!((life6_16 < __sourceIntrinsic_e148408df0fc_invokedynamic630_3(13156, (4951010145614140026L ^ life2_3))))) {
        break forest_join_119;
    }
    life7_25 = 1;
    life8_27 = -1;
    life9_30 = ((net.minecraft.block.Block)(net.minecraft.init.Blocks.bw)).a__fE();
    forestValue630_32_0 = net.minecraft.init.Blocks.bw;
    forest_cycle_32: while (true) {
    life10_33 = ((net.minecraft.block.Block)(forestValue630_32_0)).a__fE();
    spill630_1 = __sourceIntrinsic_e148408df0fc_invokedynamic630_8(20366, (4067237037020507799L ^ life2_3));
    if (!((life4_7 != null))) {
        forestValue630_9_0 = spill630_1;
        continue forest_cycle_9;
    }
    life11_41 = spill630_1;
    forest_cycle_42: while (true) {
    forest_join_113: {
    forest_join_105: {
    forest_join_104: {
    forest_join_102: {
    forest_join_96: {
    forest_join_87: {
    forest_join_82: {
    forest_join_65: {
    forest_join_63: {
    if (!((life11_41 >= 0))) {
        break forest_join_116;
    }
    life12_49 = ((moom.Fm)(p0)).a(((int)(life5_6)), ((int)(life11_41)), ((int)(life6_16)));
    spill630_2 = ((net.minecraft.block.state.IBlockState)(life12_49)).a__ch();
    if (!((life4_7 != null))) {
        forestValue630_32_0 = spill630_2;
        continue forest_cycle_32;
    }
    if (!((life4_7 != null))) {
        forestValue630_65_0 = spill630_2;
        break forest_join_65;
    }
    if (!((((net.minecraft.block.Block)(spill630_2)).a__fn() == moom.fn.a))) {
        break forest_join_63;
    }
    life8_27 = -1;
    if (!((life4_7 == null))) {
        break forest_join_113;
    }
    }
    forestValue630_65_0 = ((net.minecraft.block.state.IBlockState)(life12_49)).a__ch();
    }
    if (!((forestValue630_65_0 == net.minecraft.init.Blocks.b))) {
        break forest_join_113;
    }
    spill630_3 = life8_27;
    if (!((life4_7 != null))) {
        forestValue630_105_0 = spill630_3;
        break forest_join_105;
    }
    if (!((spill630_3 == -1))) {
        break forest_join_104;
    }
    spill630_4 = life7_25;
    if (!((life4_7 != null))) {
        forestValue630_87_0 = spill630_4;
        break forest_join_87;
    }
    if (!((spill630_4 <= 0))) {
        break forest_join_82;
    }
    life9_30 = ((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE();
    life10_33 = ((net.minecraft.block.Block)(net.minecraft.init.Blocks.bw)).a__fE();
    }
    life8_27 = life7_25;
    if (!((life4_7 != null))) {
        break forest_join_102;
    }
    forestValue630_87_0 = life11_41;
    }
    if (!((forestValue630_87_0 >= 0))) {
        break forest_join_96;
    }
    ((moom.Fm)(p0)).a(((int)(life5_6)), ((int)(life11_41)), ((int)(life6_16)), ((net.minecraft.block.state.IBlockState)(life9_30)));
    if (!((life4_7 == null))) {
        break forest_join_113;
    }
    }
    ((moom.Fm)(p0)).a(((int)(life5_6)), ((int)(life11_41)), ((int)(life6_16)), ((net.minecraft.block.state.IBlockState)(life10_33)));
    }
    if (!((life4_7 == null))) {
        break forest_join_113;
    }
    }
    forestValue630_105_0 = life8_27;
    }
    if (!((forestValue630_105_0 > 0))) {
        break forest_join_113;
    }
    life8_27 += -1;
    ((moom.Fm)(p0)).a(((int)(life5_6)), ((int)(life11_41)), ((int)(life6_16)), ((net.minecraft.block.state.IBlockState)(life10_33)));
    }
    life11_41 += -1;
    if (!((life4_7 == null))) {
        continue forest_cycle_42;
    }
    break forest_cycle_42;
    }
    break forest_cycle_32;
    }
    }
    life6_16 += 1;
    if (!((life4_7 == null))) {
        continue forest_cycle_17;
    }
    break forest_cycle_17;
    }
    break forest_cycle_9;
    }
    }
    life5_6 += 1;
    if (!((life4_7 == null))) {
        continue forest_cycle_8;
    }
    break forest_cycle_8;
    }
    }
    return;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral4582_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Fy"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.Fy.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public boolean a__Boolean() {
return ((0) != 0);
}


public void a__Void() {
return;
}


public boolean a(boolean p0, net.minecraft.util.IProgressUpdate p1) {
return ((1) != 0);
}


public boolean a(moom.Fn p0, net.minecraft.world.chunk.Chunk p1, int p2, int p3) {
return ((0) != 0);
}


public void a(moom.Fn p0, int p1, int p2) {
long local4 = (moom.Fy.o ^ 31525366014803L);
    moom.du.Q = ((boolean)(true));
    moom.DT local6 = new moom.DT((p1 * __sourceIntrinsic_74e94bd4fdf5_originalDynamicSite1160_2(13156, (4951016715725552865L ^ local4))), 0, (p2 * __sourceIntrinsic_74e94bd4fdf5_originalDynamicSite1160_3(13156, (4951016715725552865L ^ local4))));
    ((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.World)(this.g)).a__ES(((moom.DT)(((moom.DT)(local6)).a(((int)(__sourceIntrinsic_74e94bd4fdf5_originalDynamicSite1160_5(13156, (4951016715725552865L ^ local4)))), ((int)(0)), ((int)(__sourceIntrinsic_74e94bd4fdf5_originalDynamicSite1160_6(13156, (4951016715725552865L ^ local4)))))))))).a(((net.minecraft.world.World)(this.g)), ((java.util.Random)(((net.minecraft.world.World)(this.g)).u)), ((moom.DT)(local6)));
    moom.du.Q = ((boolean)(false));
    return;
}


public int a() {
return 0;
}


public moom.DT a(net.minecraft.world.World p0, java.lang.String p1, moom.DT p2) {
return null;
}


private double[] a(double[] p0, int p1, int p2, int p3, int p4, int p5, int p6) {
double[] forestValue261_16_0;
    int forestValue261_112_0;
    int forestValue261_117_0;
    int forestValue261_155_0;
    int forestValue261_161_0;
    int forestValue261_209_0;
    double forestValue261_220_0;
    double forestValue261_220_1;
    int forestValue261_279_0;
    int forestValue261_279_1;
    double[] spill261_0;
    int spill261_1;
    int spill261_2;
    double spill261_3;
    double spill261_4;
    int spill261_5;
    int spill261_6;
    long life8_3;
    java.lang.String[] life10_5;
    double life11_20;
    double life13_22;
    double life11_54;
    int life15_110;
    int life16_112;
    int life17_117;
    float life18_125;
    float life19_130;
    float life20_143;
    int life21_165;
    double life22_170;
    double life24_177;
    double life26_184;
    double life28_195;
    double life22_206;
    double life22_233;
    double life22_238;
    int life30_240;
    double life31_262;
    double life31_267;
    double life31_300;
    forest_join_315: {
    forest_join_17: {
    forest_join_16: {
    life8_3 = (moom.Fy.o ^ 40766058916428L);
    life10_5 = moom.FI.b();
    spill261_0 = p0;
    if (!((life10_5 != null))) {
        forestValue261_16_0 = spill261_0;
        break forest_join_16;
    }
    if (!((spill261_0 == null))) {
        break forest_join_17;
    }
    forestValue261_16_0 = new double[((p4 * p5) * p6)];
    }
    p0 = forestValue261_16_0;
    }
    life11_20 = 0x1.5634bc6a7ef9ep9d;
    life13_22 = 0x1.5634bc6a7ef9ep9d;
    this.m = ((double[])(((moom.FV)(this.e)).a(((double[])(this.m)), ((int)(p1)), ((int)(p3)), ((int)(p4)), ((int)(p6)), ((double)(0x1.1ef9db22d0e56p0d)), ((double)(0x1.1ef9db22d0e56p0d)), ((double)(0x1.0p-1d)))));
    this.n = ((double[])(((moom.FV)(this.f)).a(((double[])(this.n)), ((int)(p1)), ((int)(p3)), ((int)(p4)), ((int)(p6)), ((double)(0x1.9p7d)), ((double)(0x1.9p7d)), ((double)(0x1.0p-1d)))));
    life11_54 = (life11_20 * 0x1.0p1d);
    this.j = ((double[])(((moom.FV)(this.d)).a(((double[])(this.j)), ((int)(p1)), ((int)(p2)), ((int)(p3)), ((int)(p4)), ((int)(p5)), ((int)(p6)), ((double)((life11_54 / 0x1.4p6d))), ((double)((life13_22 / 0x1.4p7d))), ((double)((life11_54 / 0x1.4p6d))))));
    this.k = ((double[])(((moom.FV)(this.b)).a(((double[])(this.k)), ((int)(p1)), ((int)(p2)), ((int)(p3)), ((int)(p4)), ((int)(p5)), ((int)(p6)), ((double)(life11_54)), ((double)(life13_22)), ((double)(life11_54)))));
    this.l = ((double[])(((moom.FV)(this.c)).a(((double[])(this.l)), ((int)(p1)), ((int)(p2)), ((int)(p3)), ((int)(p4)), ((int)(p5)), ((int)(p6)), ((double)(life11_54)), ((double)(life13_22)), ((double)(life11_54)))));
    life15_110 = 0;
    life16_112 = 0;
    forest_cycle_111: while (true) {
    forest_join_312: {
    forestValue261_112_0 = life16_112;
    forest_cycle_112: while (true) {
    if (!((forestValue261_112_0 < p4))) {
        break forest_join_315;
    }
    life17_117 = 0;
    forest_cycle_116: while (true) {
    forest_join_309: {
    forestValue261_117_0 = life17_117;
    forest_cycle_117: while (true) {
    forest_join_161: {
    forest_join_160: {
    forest_join_155: {
    forest_join_152: {
    if (!((forestValue261_117_0 < p6))) {
        break forest_join_312;
    }
    life18_125 = ((float) (life16_112 + p1));
    life19_130 = ((float) (life17_117 + p3));
    life20_143 = (0x1.9p6f - (moom.Dr.c(((float)(((life18_125 * life18_125) + (life19_130 * life19_130))))) * 0x1.0p3f));
    spill261_1 = recovery.source.CarrierOps.fcmpl(((float)(life20_143)), ((float)(0x1.4p6f)));
    if (!((life10_5 != null))) {
        forestValue261_112_0 = spill261_1;
        continue forest_cycle_112;
    }
    if (!((life10_5 != null))) {
        forestValue261_155_0 = spill261_1;
        break forest_join_155;
    }
    if (!((spill261_1 > 0))) {
        break forest_join_152;
    }
    life20_143 = 0x1.4p6f;
    }
    forestValue261_155_0 = recovery.source.CarrierOps.fcmpg(((float)(life20_143)), ((float)(-0x1.9p6f)));
    }
    if (!((life10_5 != null))) {
        forestValue261_161_0 = forestValue261_155_0;
        break forest_join_161;
    }
    if (!((forestValue261_155_0 < 0))) {
        break forest_join_160;
    }
    life20_143 = -0x1.9p6f;
    }
    forestValue261_161_0 = 0;
    }
    life21_165 = forestValue261_161_0;
    forest_cycle_162: while (true) {
    forest_join_307: {
    forest_join_301: {
    forest_join_279: {
    forest_join_269: {
    forest_join_222: {
    forest_join_220: {
    forest_join_214: {
    forest_join_209: {
    forest_join_204: {
    if (!((life21_165 < p5))) {
        break forest_join_309;
    }
    life22_170 = 0x0.0p0d;
    life24_177 = ((this.k)[life15_110] / 0x1.0p9d);
    life26_184 = ((this.l)[life15_110] / 0x1.0p9d);
    life28_195 = ((((this.j)[life15_110] / 0x1.4p3d) + 0x1.0p0d) / 0x1.0p1d);
    spill261_2 = recovery.source.CarrierOps.dcmpg(((double)(life28_195)), ((double)(0x0.0p0d)));
    if (!((life10_5 != null))) {
        forestValue261_117_0 = spill261_2;
        continue forest_cycle_117;
    }
    if (!((life10_5 != null))) {
        forestValue261_209_0 = spill261_2;
        break forest_join_209;
    }
    if (!((spill261_2 < 0))) {
        break forest_join_204;
    }
    life22_206 = life24_177;
    if (!((life10_5 == null))) {
        break forest_join_222;
    }
    }
    spill261_3 = life28_195;
    spill261_4 = 0x1.0p0d;
    if (!((life10_5 != null))) {
        forestValue261_220_0 = spill261_3;
        forestValue261_220_1 = spill261_4;
        break forest_join_220;
    }
    forestValue261_209_0 = recovery.source.CarrierOps.dcmpl(((double)(spill261_3)), ((double)(spill261_4)));
    }
    if (!((forestValue261_209_0 > 0))) {
        break forest_join_214;
    }
    life22_206 = life26_184;
    if (!((life10_5 == null))) {
        break forest_join_222;
    }
    }
    forestValue261_220_0 = life24_177;
    forestValue261_220_1 = ((life26_184 - life24_177) * life28_195);
    }
    life22_206 = (forestValue261_220_0 + forestValue261_220_1);
    }
    life22_233 = (life22_206 - 0x1.0p3d);
    life22_238 = (life22_233 + ((double) life20_143));
    life30_240 = 2;
    spill261_5 = life21_165;
    spill261_6 = ((p5 / 2) - life30_240);
    if (!((life10_5 != null))) {
        forestValue261_279_0 = spill261_5;
        forestValue261_279_1 = spill261_6;
        break forest_join_279;
    }
    if (!((spill261_5 > spill261_6))) {
        break forest_join_269;
    }
    life31_262 = ((double) (((float) (life21_165 - ((p5 / 2) - life30_240))) / 0x1.0p6f));
    life31_267 = moom.Dr.a(((double)(life31_262)), ((double)(0x0.0p0d)), ((double)(0x1.0p0d)));
    life22_238 = ((life22_238 * (0x1.0p0d - life31_267)) + (-0x1.77p11d * life31_267));
    }
    life30_240 = __sourceIntrinsic_557326e59e47_invokedynamic261_31(24541, (6193385763970586945L ^ life8_3));
    if (!((life10_5 != null))) {
        break forest_join_307;
    }
    forestValue261_279_0 = life21_165;
    forestValue261_279_1 = life30_240;
    }
    if (!((forestValue261_279_0 < forestValue261_279_1))) {
        break forest_join_301;
    }
    life31_300 = ((double) (((float) (life30_240 - life21_165)) / (((float) life30_240) - 0x1.0p0f)));
    life22_238 = ((life22_238 * (0x1.0p0d - life31_300)) + (-0x1.ep4d * life31_300));
    }
    (p0)[life15_110] = life22_238;
    life15_110 += 1;
    life21_165 += 1;
    }
    if (!((life10_5 == null))) {
        continue forest_cycle_162;
    }
    break forest_cycle_162;
    }
    break forest_cycle_117;
    }
    }
    life17_117 += 1;
    if (!((life10_5 == null))) {
        continue forest_cycle_116;
    }
    break forest_cycle_116;
    }
    break forest_cycle_112;
    }
    }
    life16_112 += 1;
    if (!((life10_5 == null))) {
        continue forest_cycle_111;
    }
    break forest_cycle_111;
    }
    }
    return p0;
}


public java.lang.String a__String() {
return "RandomLevelSource";
}


public boolean a__Boolean(int p0, int p1) {
return ((1) != 0);
}


private static native <E extends Throwable> int __sourceIntrinsic_e61dea92caeadbd2_originalDynamicSite2052_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e61dea92caeadbd2_originalDynamicSite2052_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e61dea92caeadbd2_originalDynamicSite2052_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e61dea92caeadbd2_originalDynamicSite2052_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e61dea92caeadbd2_originalDynamicSite2052_17(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_a55be857de7c_invokedynamic661_2(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_a55be857de7c_invokedynamic661_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a55be857de7c_invokedynamic661_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a55be857de7c_invokedynamic661_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a55be857de7c_invokedynamic661_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a55be857de7c_invokedynamic661_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_273b4708c739_invokedynamic629_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_273b4708c739_invokedynamic629_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_273b4708c739_invokedynamic629_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_273b4708c739_invokedynamic629_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_273b4708c739_invokedynamic629_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_273b4708c739_invokedynamic629_21(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral4582_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e148408df0fc_invokedynamic630_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e148408df0fc_invokedynamic630_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e148408df0fc_invokedynamic630_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_originalDynamicSite1160_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_originalDynamicSite1160_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_originalDynamicSite1160_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_originalDynamicSite1160_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_557326e59e47_invokedynamic261_31(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4577_0() throws E;
}
