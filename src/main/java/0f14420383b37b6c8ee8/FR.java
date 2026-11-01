package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class FR extends net.minecraft.world.gen.structure.MapGenStructure {

public static java.util.List<net.minecraft.world.biome.BiomeGenBase> g;

private int h;

private int i;

private int j;

private static long k;

private static long[] m;

private static java.lang.Integer[] s;

private static java.util.Map t;

public FR() { super(); }


private static void __sourceConstructorBody_6b9268d30940315c(moom.FR receiver) throws Throwable {

long local1 = (moom.FR.k ^ 95027697298931L);

    moom.FR.__sourceConstructorInit_6b9268d30940315c_0(((moom.FR)(receiver)));

    ((moom.FR)(receiver)).i = ((int)(__sourceIntrinsic_6b9268d30940315c_originalDynamicSite2016_2(25673, (4091916598832776064L ^ local1))));

    ((moom.FR)(receiver)).j = ((int)(__sourceIntrinsic_6b9268d30940315c_originalDynamicSite2016_4(9517, (859386397872521955L ^ local1))));

    return;

}



public FR(java.util.Map<java.lang.String, java.lang.String> p0) { this(); }


private static void __sourceConstructorBody_6a09061cb6b94e1a(moom.FR receiver, java.util.Map p0) throws Throwable {

boolean __initValue488_43_0;

    long local2_life2;

    java.util.Iterator local5_life8;

    net.minecraft.entity.Entity[] local4_life9;

    java.util.Map.Entry local6_life13;

    init_join_58: {

    local2_life2 = (moom.FR.k ^ 60838789266114L);

    net.minecraft.entity.Entity[] __sourceSpill488_4 = moom.G4.b();

    moom.FR.__sourceConstructorInit_6a09061cb6b94e1a_0(((moom.FR)(receiver)));

    local5_life8 = ((java.util.Set)(((java.util.Map)(p0)).entrySet())).iterator();

    local4_life9 = __sourceSpill488_4;

    init_cycle_12: while (true) {

    init_join_56: {

    init_join_43: {

    init_join_38: {

    if (!(((java.util.Iterator)(local5_life8)).hasNext())) {

        break init_join_58;

    }

    local6_life13 = ((java.util.Map.Entry)(((java.util.Iterator)(local5_life8)).next()));

    boolean __sourceSpill488_17 = ((java.lang.String)(((java.lang.String)(((java.util.Map.Entry)(local6_life13)).getKey())))).equals(((java.lang.Object)("size")));

    if (!((local4_life9 != null))) {

        __initValue488_43_0 = __sourceSpill488_17;

        break init_join_43;

    }

    if (!(__sourceSpill488_17)) {

        break init_join_38;

    }

    ((moom.FR)(receiver)).h = ((int)(moom.Dr.a(((java.lang.String)(((java.lang.String)(((java.util.Map.Entry)(local6_life13)).getValue())))), ((int)(((moom.FR)(receiver)).h)), ((int)(0)))));

    if (!((local4_life9 == null))) {

        break init_join_56;

    }

    }

    __initValue488_43_0 = ((java.lang.String)(((java.lang.String)(((java.util.Map.Entry)(local6_life13)).getKey())))).equals(((java.lang.Object)("distance")));

    }

    if (!(__initValue488_43_0)) {

        break init_join_56;

    }

    ((moom.FR)(receiver)).i = ((int)(moom.Dr.a(((java.lang.String)(((java.lang.String)(((java.util.Map.Entry)(local6_life13)).getValue())))), ((int)(((moom.FR)(receiver)).i)), ((int)((((moom.FR)(receiver)).j + 1))))));

    }

    if (!((local4_life9 == null))) { continue init_cycle_12; }

    break init_cycle_12;

    }

    }

    return;

}



static {
k = ((long)(((moom._a)(moom._c.a(((long)(5079582799982647365L)), ((long)(-4524821923078475508L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(60416889428489L)))));
    t = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.FR.k ^ 136619071343776L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill748_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill748_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill748_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill748_14 = new byte[8];
    (__sourceSpill748_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill748_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation748_16 = __sourceSpill748_14;
    ((javax.crypto.Cipher)(__sourceSpill748_11)).init(((int)(__sourceSpill748_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill748_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation748_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[6];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "Q\004]7@Ý\036¶9(RØ\nÉêR¾Hr©-_þ¡¸\025.¾"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill748_25 = local6_life21;
        int __sourceSpill748_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill748_25)).substring(((int)(__sourceSpill748_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill748_30 = local8_life19;
        int __sourceSpill748_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill748_33 = new byte[8];
        (__sourceSpill748_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill748_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill748_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill748_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill748_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill748_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill748_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill748_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill748_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill748_34)).doFinal(((byte[])(__sourceSpill748_33)));
        (__sourceSpill748_30)[__sourceSpill748_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "\0130É\027ù\037KÁ\003Âw/"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill748_38 = local6_life21;
        int __sourceSpill748_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill748_38)).substring(((int)(__sourceSpill748_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill748_43 = local8_life19;
        int __sourceSpill748_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill748_46 = new byte[8];
        (__sourceSpill748_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill748_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill748_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill748_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill748_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill748_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill748_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill748_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill748_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill748_47)).doFinal(((byte[])(__sourceSpill748_46)));
        (__sourceSpill748_43)[__sourceSpill748_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    m = ((long[])(local8_life19));
    s = ((java.lang.Integer[])(new java.lang.Integer[6]));
    net.minecraft.world.biome.BiomeGenBase[] __sourceSpill748_53 = new net.minecraft.world.biome.BiomeGenBase[3];
    (__sourceSpill748_53)[0] = net.minecraft.world.biome.BiomeGenBase.s;
    (__sourceSpill748_53)[1] = net.minecraft.world.biome.BiomeGenBase.t;
    (__sourceSpill748_53)[2] = net.minecraft.world.biome.BiomeGenBase.aa;
    g = ((java.util.List)(java.util.Arrays.asList(((java.lang.Object[])(__sourceSpill748_53)))));
}

private static native <E extends Throwable> void __sourceConstructorInit_6b9268d30940315c_0(moom.FR a0) throws E;
private static native <E extends Throwable> void __sourceConstructorInit_6a09061cb6b94e1a_0(moom.FR a0) throws E;

private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.FR.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x2A37;
        if (s[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = m[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])t.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    t.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/FR", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            FR.s[n2] = n3;
        }
        return s[n2];
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4508_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/FR"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


protected boolean a__Boolean(int p0, int p1) {
int forwardValue1921_22_0;
    int forwardValue1921_36_0;
    int forwardValue1921_127_0;
    net.minecraft.entity.Entity[] spill1921_0;
    int spill1921_1;
    int spill1921_2;
    int spill1921_3;
    long life3_3;
    int life6_6;
    net.minecraft.entity.Entity[] life5_7;
    int life7_9;
    int life8_42;
    int life9_47;
    java.util.Random life10_58;
    int life8_63;
    int life9_68;
    int life8_78;
    int life9_88;
    forward_join_127: {
    forward_join_126: {
    forward_join_36: {
    forward_join_32: {
    forward_join_22: {
    forward_join_21: {
    life3_3 = (moom.FR.k ^ 42389657091070L);
    spill1921_0 = moom.G4.b();
    life6_6 = p0;
    life5_7 = spill1921_0;
    life7_9 = p1;
    spill1921_1 = p0;
    if (!((life5_7 != null))) {
        forwardValue1921_22_0 = spill1921_1;
        break forward_join_22;
    }
    if (!((spill1921_1 < 0))) {
        break forward_join_21;
    }
    p0 = (p0 - (this.i - 1));
    }
    forwardValue1921_22_0 = p1;
    }
    if (!((life5_7 != null))) {
        forwardValue1921_36_0 = forwardValue1921_22_0;
        break forward_join_36;
    }
    if (!((forwardValue1921_22_0 < 0))) {
        break forward_join_32;
    }
    p1 = (p1 - (this.i - 1));
    }
    forwardValue1921_36_0 = (p0 / this.i);
    }
    life8_42 = forwardValue1921_36_0;
    life9_47 = (p1 / this.i);
    life10_58 = ((net.minecraft.world.World)(this.c)).a(((int)(life8_42)), ((int)(life9_47)), ((int)(__sourceIntrinsic_c86802429962_invokedynamic1921_7(17326, (4103414608717689449L ^ life3_3)))));
    life8_63 = (life8_42 * this.i);
    life9_68 = (life9_47 * this.i);
    life8_78 = (life8_63 + ((java.util.Random)(life10_58)).nextInt(((int)((this.i - this.j)))));
    life9_88 = (life9_68 + ((java.util.Random)(life10_58)).nextInt(((int)((this.i - this.j)))));
    spill1921_2 = life6_6;
    if (!((life5_7 != null))) {
        forwardValue1921_127_0 = spill1921_2;
        break forward_join_127;
    }
    if (!((spill1921_2 == life8_78))) {
        break forward_join_126;
    }
    spill1921_3 = life7_9;
    if (!((life5_7 != null))) {
        forwardValue1921_127_0 = spill1921_3;
        break forward_join_127;
    }
    if (!((spill1921_3 == life9_88))) {
        break forward_join_126;
    }
    return ((net.minecraft.world.biome.WorldChunkManager)(((net.minecraft.world.World)(this.c)).a__Ff())).a(((int)(((life6_6 * __sourceIntrinsic_c86802429962_invokedynamic1921_19(22299, (2487544399246632670L ^ life3_3))) + __sourceIntrinsic_c86802429962_invokedynamic1921_20(18321, (7959248405819209299L ^ life3_3))))), ((int)(((life7_9 * __sourceIntrinsic_c86802429962_invokedynamic1921_21(6707, (5112204200823811061L ^ life3_3))) + __sourceIntrinsic_c86802429962_invokedynamic1921_22(9517, (859439315085251822L ^ life3_3))))), ((int)(0)), ((java.util.List)(moom.FR.g)));
    }
    forwardValue1921_127_0 = 0;
    }
    return ((forwardValue1921_127_0) != 0);
}


public java.lang.String a() {
return "Village";
}


protected moom.Ir a(int p0, int p1) {
return new moom.Iv(this.c, this.b, p0, p1, this.h);
}


private static native <E extends Throwable> int __sourceIntrinsic_6b9268d30940315c_originalDynamicSite2016_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6b9268d30940315c_originalDynamicSite2016_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c86802429962_invokedynamic1921_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c86802429962_invokedynamic1921_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c86802429962_invokedynamic1921_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c86802429962_invokedynamic1921_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c86802429962_invokedynamic1921_22(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4508_0() throws E;
}
