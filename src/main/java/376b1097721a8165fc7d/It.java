package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class It extends moom.Ir {

private static long e;

private static long[] f;

private static java.lang.Integer[] g;

private static java.util.Map j;

public It() {
super();
}


public It(net.minecraft.world.World p0, java.util.Random p1, int p2, int p3) { super(0, 0); }


private static void __sourceConstructorBody_62a103afe07f49ad(moom.It receiver, net.minecraft.world.World p0, java.util.Random p1, int p2, int p3) throws Throwable {

net.minecraft.world.biome.BiomeGenBase __initValue513_50_0;

    net.minecraft.world.biome.BiomeGenBase __initValue513_50_1;

    net.minecraft.world.biome.BiomeGenBase __initValue513_55_0;

    net.minecraft.world.biome.BiomeGenBase __initValue513_55_1;

    net.minecraft.world.biome.BiomeGenBase __initValue513_86_0;

    net.minecraft.world.biome.BiomeGenBase __initValue513_86_1;

    net.minecraft.world.biome.BiomeGenBase __initValue513_91_0;

    net.minecraft.world.biome.BiomeGenBase __initValue513_91_1;

    long local5_life2;

    net.minecraft.entity.Entity[] local7_life6;

    net.minecraft.world.biome.BiomeGenBase local8_life16;

    moom.G8 local9_life30;

    net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid local9_life41;

    net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid local9_life48;

    init_join_142: {

    init_join_118: {

    init_join_92: {

    init_join_91: {

    init_join_86: {

    init_join_84: {

    init_join_55: {

    init_join_50: {

    local5_life2 = (moom.It.e ^ 97587527943479L);

    net.minecraft.entity.Entity[] __sourceSpill513_4 = moom.G4.b();

    moom.It.__sourceConstructorInit_62a103afe07f49ad_0(((moom.It)(receiver)), ((int)(p2)), ((int)(p3)));

    local7_life6 = __sourceSpill513_4;

    local8_life16 = ((net.minecraft.world.World)(p0)).a__ES(((moom.DT)(new moom.DT(((p2 * __sourceIntrinsic_62a103afe07f49ad_originalDynamicSite513_8(629, (3570653887089171395L ^ local5_life2))) + __sourceIntrinsic_62a103afe07f49ad_originalDynamicSite513_10(17341, (5669931874830719497L ^ local5_life2))), 0, ((p3 * __sourceIntrinsic_62a103afe07f49ad_originalDynamicSite513_12(10229, (7732660270464040514L ^ local5_life2))) + __sourceIntrinsic_62a103afe07f49ad_originalDynamicSite513_14(7396, (7570055036940928337L ^ local5_life2)))))));

    net.minecraft.world.biome.BiomeGenBase __sourceSpill513_18 = local8_life16;

    net.minecraft.world.biome.BiomeGenBase __sourceSpill513_19 = net.minecraft.world.biome.BiomeGenBase.M;

    if (!((local7_life6 != null))) {

        __initValue513_50_0 = __sourceSpill513_18;

        __initValue513_50_1 = __sourceSpill513_19;

        break init_join_50;

    }

    if (!((__sourceSpill513_18 != __sourceSpill513_19))) {

        break init_join_118;

    }

    __initValue513_50_0 = local8_life16;

    __initValue513_50_1 = net.minecraft.world.biome.BiomeGenBase.N;

    }

    net.minecraft.world.biome.BiomeGenBase __sourceSpill513_21 = __initValue513_50_0;

    net.minecraft.world.biome.BiomeGenBase __sourceSpill513_22 = __initValue513_50_1;

    if (!((local7_life6 != null))) {

        __initValue513_55_0 = __sourceSpill513_21;

        __initValue513_55_1 = __sourceSpill513_22;

        break init_join_55;

    }

    if (!((__sourceSpill513_21 != __sourceSpill513_22))) {

        break init_join_118;

    }

    __initValue513_55_0 = local8_life16;

    __initValue513_55_1 = net.minecraft.world.biome.BiomeGenBase.x;

    }

    net.minecraft.world.biome.BiomeGenBase __sourceSpill513_24 = __initValue513_55_0;

    net.minecraft.world.biome.BiomeGenBase __sourceSpill513_25 = __initValue513_55_1;

    if (!((local7_life6 != null))) {

        __initValue513_86_0 = __sourceSpill513_24;

        __initValue513_86_1 = __sourceSpill513_25;

        break init_join_86;

    }

    if (!((__sourceSpill513_24 == __sourceSpill513_25))) {

        break init_join_84;

    }

    local9_life30 = new moom.G8(p1, (p2 * __sourceIntrinsic_62a103afe07f49ad_originalDynamicSite513_27(10229, (7732660270464040514L ^ local5_life2))), (p3 * __sourceIntrinsic_62a103afe07f49ad_originalDynamicSite513_29(10229, (7732660270464040514L ^ local5_life2))));

    ((java.util.LinkedList)(((moom.It)(receiver)).a)).add(((java.lang.Object)(local9_life30)));

    if (!((local7_life6 == null))) {

        break init_join_142;

    }

    }

    __initValue513_86_0 = local8_life16;

    __initValue513_86_1 = net.minecraft.world.biome.BiomeGenBase.t;

    }

    net.minecraft.world.biome.BiomeGenBase __sourceSpill513_34 = __initValue513_86_0;

    net.minecraft.world.biome.BiomeGenBase __sourceSpill513_35 = __initValue513_86_1;

    if (!((local7_life6 != null))) {

        __initValue513_91_0 = __sourceSpill513_34;

        __initValue513_91_1 = __sourceSpill513_35;

        break init_join_91;

    }

    if (!((__sourceSpill513_34 != __sourceSpill513_35))) {

        break init_join_92;

    }

    __initValue513_91_0 = local8_life16;

    __initValue513_91_1 = net.minecraft.world.biome.BiomeGenBase.I;

    }

    if (!((__initValue513_91_0 == __initValue513_91_1))) {

        break init_join_142;

    }

    }

    local9_life41 = new net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid(p1, (p2 * __sourceIntrinsic_62a103afe07f49ad_originalDynamicSite513_38(10229, (7732660270464040514L ^ local5_life2))), (p3 * __sourceIntrinsic_62a103afe07f49ad_originalDynamicSite513_40(10229, (7732660270464040514L ^ local5_life2))));

    ((java.util.LinkedList)(((moom.It)(receiver)).a)).add(((java.lang.Object)(local9_life41)));

    if (!((local7_life6 == null))) {

        break init_join_142;

    }

    }

    local9_life48 = new net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid(p1, (p2 * __sourceIntrinsic_62a103afe07f49ad_originalDynamicSite513_45(10229, (7732660270464040514L ^ local5_life2))), (p3 * __sourceIntrinsic_62a103afe07f49ad_originalDynamicSite513_47(10229, (7732660270464040514L ^ local5_life2))));

    ((java.util.LinkedList)(((moom.It)(receiver)).a)).add(((java.lang.Object)(local9_life48)));

    }

    ((moom.It)(receiver)).a__Void();

    return;

}



static {
e = ((long)(((moom._a)(moom._c.a(((long)(6333799275396113041L)), ((long)(9108932437461215660L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(270788688541421L)))));
    j = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.It.e ^ 117820454045399L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill863_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill863_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill863_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill863_14 = new byte[8];
    (__sourceSpill863_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill863_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation863_16 = __sourceSpill863_14;
    ((javax.crypto.Cipher)(__sourceSpill863_11)).init(((int)(__sourceSpill863_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill863_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation863_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[4];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "9%G½.S=Â ¢Ý"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill863_25 = local6_life21;
        int __sourceSpill863_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill863_25)).substring(((int)(__sourceSpill863_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill863_30 = local8_life19;
        int __sourceSpill863_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill863_33 = new byte[8];
        (__sourceSpill863_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill863_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill863_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill863_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill863_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill863_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill863_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill863_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill863_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill863_34)).doFinal(((byte[])(__sourceSpill863_33)));
        (__sourceSpill863_30)[__sourceSpill863_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "?¶Ô6H\023\025ú\003\006æ!»"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill863_38 = local6_life21;
        int __sourceSpill863_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill863_38)).substring(((int)(__sourceSpill863_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill863_43 = local8_life19;
        int __sourceSpill863_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill863_46 = new byte[8];
        (__sourceSpill863_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill863_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill863_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill863_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill863_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill863_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill863_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill863_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill863_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill863_47)).doFinal(((byte[])(__sourceSpill863_46)));
        (__sourceSpill863_43)[__sourceSpill863_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    f = ((long[])(local8_life19));
    g = ((java.lang.Integer[])(new java.lang.Integer[4]));
}

private static native <E extends Throwable> void __sourceConstructorInit_62a103afe07f49ad_0(moom.It a0, int a1, int a2) throws E;

private static moom.Oo b(moom.Oo p0) {
return p0;
}


private static int a(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x506B;
        if (g[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = f[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])j.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    j.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/It", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            It.g[n2] = n3;
        }
        return g[n2];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.It.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral4969_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/It"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static native <E extends Throwable> int __sourceIntrinsic_62a103afe07f49ad_originalDynamicSite513_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_62a103afe07f49ad_originalDynamicSite513_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_62a103afe07f49ad_originalDynamicSite513_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_62a103afe07f49ad_originalDynamicSite513_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_62a103afe07f49ad_originalDynamicSite513_27(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_62a103afe07f49ad_originalDynamicSite513_29(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_62a103afe07f49ad_originalDynamicSite513_38(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_62a103afe07f49ad_originalDynamicSite513_40(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_62a103afe07f49ad_originalDynamicSite513_45(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_62a103afe07f49ad_originalDynamicSite513_47(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral4969_0() throws E;
}
