package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public abstract class EA {

public static float[] a;

protected net.minecraft.world.World b;

private net.minecraft.world.WorldType c;

private java.lang.String d;

protected net.minecraft.world.biome.WorldChunkManager e;

protected boolean f;

protected boolean g;

protected float[] h;

protected int i;

private float[] j;

private static long k;

private static long[] m;

private static java.lang.Integer[] n;

private static java.util.Map o;

private static long[] s;

private static java.lang.Long[] t;

private static java.util.Map u;

public EA() { super(); }


private static void __sourceConstructorBody_93d96bd3140afadc(moom.EA receiver) throws Throwable {

long local1 = (moom.EA.k ^ 81827986237954L);

    moom.EA.__sourceConstructorInit_93d96bd3140afadc_0(((moom.EA)(receiver)));

    ((moom.EA)(receiver)).h = ((float[])(new float[__sourceIntrinsic_93d96bd3140afadc_originalDynamicSite1943_2(5555, (4670965319748210433L ^ local1))]));

    ((moom.EA)(receiver)).j = ((float[])(new float[4]));

    return;

}



static {
k = ((long)(((moom._a)(moom._c.a(((long)(-4296505077941067544L)), ((long)(7429199334607322157L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(60654227454806L)))));

    long local22_life6 = (moom.EA.k ^ 77230064699749L);

    o = ((java.util.Map)(new java.util.HashMap(13)));

    javax.crypto.Cipher local11_life9;

    javax.crypto.Cipher __sourceSpill635_11 = (local11_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));

    int __sourceSpill635_12 = 2;

    javax.crypto.SecretKeyFactory __sourceSpill635_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));

    byte[] __sourceSpill635_14 = new byte[8];

    (__sourceSpill635_14)[0] = ((byte) ((int) (local22_life6 >>> 56)));

    int local12_life15 = 1;

    while ((local12_life15 < 8)) {

        (__sourceSpill635_14)[local12_life15] = ((byte) ((int) ((local22_life6 << (local12_life15 * 8)) >>> 56)));

        local12_life15 += 1;

    }

    byte[] __sourcePreallocation635_16 = __sourceSpill635_14;

    ((javax.crypto.Cipher)(__sourceSpill635_11)).init(((int)(__sourceSpill635_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill635_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation635_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));

    long[] local17_life19 = new long[6];

    int local14_life20 = 0;

    java.lang.String local15_life21;

    int local16_life23 = ((java.lang.String)((local15_life21 = "ÄÍ¬·\031MÑ\027¬Ä\001§lç_Ù\030bº\1774ÒkåI)o"))).length();

    int local13_life24 = 0;

    do {

        java.lang.String __sourceSpill635_25 = local15_life21;

        int __sourceSpill635_26 = local13_life24;

        local13_life24 += 8;

        byte[] local18_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill635_25)).substring(((int)(__sourceSpill635_26)), ((int)(local13_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));

        long[] __sourceSpill635_30 = local17_life19;

        int __sourceSpill635_31 = local14_life20;

        local14_life20 += 1;

        long local19_life32 = (((((((((((long) (local18_life29)[0]) & 255L) << 56) | ((((long) (local18_life29)[1]) & 255L) << 48)) | ((((long) (local18_life29)[2]) & 255L) << 40)) | ((((long) (local18_life29)[3]) & 255L) << 32)) | ((((long) (local18_life29)[4]) & 255L) << 24)) | ((((long) (local18_life29)[5]) & 255L) << 16)) | ((((long) (local18_life29)[6]) & 255L) << 8)) | (((long) (local18_life29)[7]) & 255L));

        byte[] __sourceSpill635_33 = new byte[8];

        (__sourceSpill635_33)[0] = ((byte) ((int) (local19_life32 >>> 56)));

        (__sourceSpill635_33)[1] = ((byte) ((int) (local19_life32 >>> 48)));

        (__sourceSpill635_33)[2] = ((byte) ((int) (local19_life32 >>> 40)));

        (__sourceSpill635_33)[3] = ((byte) ((int) (local19_life32 >>> 32)));

        (__sourceSpill635_33)[4] = ((byte) ((int) (local19_life32 >>> 24)));

        (__sourceSpill635_33)[5] = ((byte) ((int) (local19_life32 >>> 16)));

        (__sourceSpill635_33)[6] = ((byte) ((int) (local19_life32 >>> 8)));

        (__sourceSpill635_33)[7] = ((byte) ((int) local19_life32));

        javax.crypto.Cipher __sourceSpill635_34 = local11_life9;

        byte[] local21_life36 = ((javax.crypto.Cipher)(__sourceSpill635_34)).doFinal(((byte[])(__sourceSpill635_33)));

        (__sourceSpill635_30)[__sourceSpill635_31] = (((((((((((long) (local21_life36)[0]) & 255L) << 56) | ((((long) (local21_life36)[1]) & 255L) << 48)) | ((((long) (local21_life36)[2]) & 255L) << 40)) | ((((long) (local21_life36)[3]) & 255L) << 32)) | ((((long) (local21_life36)[4]) & 255L) << 24)) | ((((long) (local21_life36)[5]) & 255L) << 16)) | ((((long) (local21_life36)[6]) & 255L) << 8)) | (((long) (local21_life36)[7]) & 255L));

    } while ((!(local13_life24 >= local16_life23)));

    local16_life23 = ((java.lang.String)((local15_life21 = "¥ùÉÖ\r%?b«¡Ô6J"))).length();

    local13_life24 = 0;

    do {

        java.lang.String __sourceSpill635_38 = local15_life21;

        int __sourceSpill635_39 = local13_life24;

        local13_life24 += 8;

        byte[] local18_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill635_38)).substring(((int)(__sourceSpill635_39)), ((int)(local13_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));

        long[] __sourceSpill635_43 = local17_life19;

        int __sourceSpill635_44 = local14_life20;

        local14_life20 += 1;

        long local19_life45 = (((((((((((long) (local18_life42)[0]) & 255L) << 56) | ((((long) (local18_life42)[1]) & 255L) << 48)) | ((((long) (local18_life42)[2]) & 255L) << 40)) | ((((long) (local18_life42)[3]) & 255L) << 32)) | ((((long) (local18_life42)[4]) & 255L) << 24)) | ((((long) (local18_life42)[5]) & 255L) << 16)) | ((((long) (local18_life42)[6]) & 255L) << 8)) | (((long) (local18_life42)[7]) & 255L));

        byte[] __sourceSpill635_46 = new byte[8];

        (__sourceSpill635_46)[0] = ((byte) ((int) (local19_life45 >>> 56)));

        (__sourceSpill635_46)[1] = ((byte) ((int) (local19_life45 >>> 48)));

        (__sourceSpill635_46)[2] = ((byte) ((int) (local19_life45 >>> 40)));

        (__sourceSpill635_46)[3] = ((byte) ((int) (local19_life45 >>> 32)));

        (__sourceSpill635_46)[4] = ((byte) ((int) (local19_life45 >>> 24)));

        (__sourceSpill635_46)[5] = ((byte) ((int) (local19_life45 >>> 16)));

        (__sourceSpill635_46)[6] = ((byte) ((int) (local19_life45 >>> 8)));

        (__sourceSpill635_46)[7] = ((byte) ((int) local19_life45));

        javax.crypto.Cipher __sourceSpill635_47 = local11_life9;

        byte[] local21_life49 = ((javax.crypto.Cipher)(__sourceSpill635_47)).doFinal(((byte[])(__sourceSpill635_46)));

        (__sourceSpill635_43)[__sourceSpill635_44] = (((((((((((long) (local21_life49)[0]) & 255L) << 56) | ((((long) (local21_life49)[1]) & 255L) << 48)) | ((((long) (local21_life49)[2]) & 255L) << 40)) | ((((long) (local21_life49)[3]) & 255L) << 32)) | ((((long) (local21_life49)[4]) & 255L) << 24)) | ((((long) (local21_life49)[5]) & 255L) << 16)) | ((((long) (local21_life49)[6]) & 255L) << 8)) | (((long) (local21_life49)[7]) & 255L));

    } while ((!(local13_life24 >= local16_life23)));

    m = ((long[])(local17_life19));

    n = ((java.lang.Integer[])(new java.lang.Integer[6]));

    u = ((java.util.Map)(new java.util.HashMap(13)));

    javax.crypto.Cipher local0_life54;

    javax.crypto.Cipher __sourceSpill635_56 = (local0_life54 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));

    int __sourceSpill635_57 = 2;

    javax.crypto.SecretKeyFactory __sourceSpill635_58 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));

    byte[] __sourceSpill635_59 = new byte[8];

    (__sourceSpill635_59)[0] = ((byte) ((int) (local22_life6 >>> 56)));

    int local1_life60 = 1;

    while ((local1_life60 < 8)) {

        (__sourceSpill635_59)[local1_life60] = ((byte) ((int) ((local22_life6 << (local1_life60 * 8)) >>> 56)));

        local1_life60 += 1;

    }

    byte[] __sourcePreallocation635_61 = __sourceSpill635_59;

    ((javax.crypto.Cipher)(__sourceSpill635_56)).init(((int)(__sourceSpill635_57)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill635_58)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation635_61)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));

    long[] local6_life64 = new long[4];

    int local3_life65 = 0;

    java.lang.String local4_life66;

    int local5_life68 = ((java.lang.String)((local4_life66 = "·p[èo£\bjÏ\bV}="))).length();

    int local2_life69 = 0;

    do {

        java.lang.String __sourceSpill635_70 = local4_life66;

        int __sourceSpill635_71 = local2_life69;

        local2_life69 += 8;

        byte[] local7_life74 = ((java.lang.String)(((java.lang.String)(__sourceSpill635_70)).substring(((int)(__sourceSpill635_71)), ((int)(local2_life69))))).getBytes(((java.lang.String)("ISO-8859-1")));

        long[] __sourceSpill635_75 = local6_life64;

        int __sourceSpill635_76 = local3_life65;

        local3_life65 += 1;

        long local8_life77 = (((((((((((long) (local7_life74)[0]) & 255L) << 56) | ((((long) (local7_life74)[1]) & 255L) << 48)) | ((((long) (local7_life74)[2]) & 255L) << 40)) | ((((long) (local7_life74)[3]) & 255L) << 32)) | ((((long) (local7_life74)[4]) & 255L) << 24)) | ((((long) (local7_life74)[5]) & 255L) << 16)) | ((((long) (local7_life74)[6]) & 255L) << 8)) | (((long) (local7_life74)[7]) & 255L));

        byte[] __sourceSpill635_78 = new byte[8];

        (__sourceSpill635_78)[0] = ((byte) ((int) (local8_life77 >>> 56)));

        (__sourceSpill635_78)[1] = ((byte) ((int) (local8_life77 >>> 48)));

        (__sourceSpill635_78)[2] = ((byte) ((int) (local8_life77 >>> 40)));

        (__sourceSpill635_78)[3] = ((byte) ((int) (local8_life77 >>> 32)));

        (__sourceSpill635_78)[4] = ((byte) ((int) (local8_life77 >>> 24)));

        (__sourceSpill635_78)[5] = ((byte) ((int) (local8_life77 >>> 16)));

        (__sourceSpill635_78)[6] = ((byte) ((int) (local8_life77 >>> 8)));

        (__sourceSpill635_78)[7] = ((byte) ((int) local8_life77));

        javax.crypto.Cipher __sourceSpill635_79 = local0_life54;

        byte[] local10_life81 = ((javax.crypto.Cipher)(__sourceSpill635_79)).doFinal(((byte[])(__sourceSpill635_78)));

        (__sourceSpill635_75)[__sourceSpill635_76] = (((((((((((long) (local10_life81)[0]) & 255L) << 56) | ((((long) (local10_life81)[1]) & 255L) << 48)) | ((((long) (local10_life81)[2]) & 255L) << 40)) | ((((long) (local10_life81)[3]) & 255L) << 32)) | ((((long) (local10_life81)[4]) & 255L) << 24)) | ((((long) (local10_life81)[5]) & 255L) << 16)) | ((((long) (local10_life81)[6]) & 255L) << 8)) | (((long) (local10_life81)[7]) & 255L));

    } while ((!(local2_life69 >= local5_life68)));

    local5_life68 = ((java.lang.String)((local4_life66 = "\023\034ßÀ.h3Á\013VÑØg"))).length();

    local2_life69 = 0;

    do {

        java.lang.String __sourceSpill635_83 = local4_life66;

        int __sourceSpill635_84 = local2_life69;

        local2_life69 += 8;

        byte[] local7_life87 = ((java.lang.String)(((java.lang.String)(__sourceSpill635_83)).substring(((int)(__sourceSpill635_84)), ((int)(local2_life69))))).getBytes(((java.lang.String)("ISO-8859-1")));

        long[] __sourceSpill635_88 = local6_life64;

        int __sourceSpill635_89 = local3_life65;

        local3_life65 += 1;

        long local8_life90 = (((((((((((long) (local7_life87)[0]) & 255L) << 56) | ((((long) (local7_life87)[1]) & 255L) << 48)) | ((((long) (local7_life87)[2]) & 255L) << 40)) | ((((long) (local7_life87)[3]) & 255L) << 32)) | ((((long) (local7_life87)[4]) & 255L) << 24)) | ((((long) (local7_life87)[5]) & 255L) << 16)) | ((((long) (local7_life87)[6]) & 255L) << 8)) | (((long) (local7_life87)[7]) & 255L));

        byte[] __sourceSpill635_91 = new byte[8];

        (__sourceSpill635_91)[0] = ((byte) ((int) (local8_life90 >>> 56)));

        (__sourceSpill635_91)[1] = ((byte) ((int) (local8_life90 >>> 48)));

        (__sourceSpill635_91)[2] = ((byte) ((int) (local8_life90 >>> 40)));

        (__sourceSpill635_91)[3] = ((byte) ((int) (local8_life90 >>> 32)));

        (__sourceSpill635_91)[4] = ((byte) ((int) (local8_life90 >>> 24)));

        (__sourceSpill635_91)[5] = ((byte) ((int) (local8_life90 >>> 16)));

        (__sourceSpill635_91)[6] = ((byte) ((int) (local8_life90 >>> 8)));

        (__sourceSpill635_91)[7] = ((byte) ((int) local8_life90));

        javax.crypto.Cipher __sourceSpill635_92 = local0_life54;

        byte[] local10_life94 = ((javax.crypto.Cipher)(__sourceSpill635_92)).doFinal(((byte[])(__sourceSpill635_91)));

        (__sourceSpill635_88)[__sourceSpill635_89] = (((((((((((long) (local10_life94)[0]) & 255L) << 56) | ((((long) (local10_life94)[1]) & 255L) << 48)) | ((((long) (local10_life94)[2]) & 255L) << 40)) | ((((long) (local10_life94)[3]) & 255L) << 32)) | ((((long) (local10_life94)[4]) & 255L) << 24)) | ((((long) (local10_life94)[5]) & 255L) << 16)) | ((((long) (local10_life94)[6]) & 255L) << 8)) | (((long) (local10_life94)[7]) & 255L));

    } while ((!(local2_life69 >= local5_life68)));

    s = ((long[])(local6_life64));

    t = ((java.lang.Long[])(new java.lang.Long[4]));

    float[] __sourceSpill635_98 = new float[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite635_97(12839, (8966868716075551731L ^ local22_life6))];

    (__sourceSpill635_98)[0] = 0x1.0p0f;

    (__sourceSpill635_98)[1] = 0x1.8p-1f;

    (__sourceSpill635_98)[2] = 0x1.0p-1f;

    (__sourceSpill635_98)[3] = 0x1.0p-2f;

    (__sourceSpill635_98)[4] = 0x0.0p0f;

    (__sourceSpill635_98)[5] = 0x1.0p-2f;

    (__sourceSpill635_98)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite635_99(28585, (8500997235360847486L ^ local22_life6))] = 0x1.0p-1f;

    (__sourceSpill635_98)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite635_100(28483, (8025677427170465426L ^ local22_life6))] = 0x1.8p-1f;

    a = ((float[])(__sourceSpill635_98));
}

private static native <E extends Throwable> void __sourceConstructorInit_93d96bd3140afadc_0(moom.EA a0) throws E;

public int b() {
return this.i;
}


public boolean b__Boolean() {
return ((1) != 0);
}


public abstract java.lang.String b__String();

public boolean b(int p0, int p1) {
return ((0) != 0);
}


protected void b__Void() {
net.minecraft.world.WorldType forwardValue1789_36_0;
    net.minecraft.world.WorldType forwardValue1789_36_1;
    java.lang.String spill1789_0;
    net.minecraft.world.WorldType spill1789_1;
    net.minecraft.world.WorldType spill1789_2;
    long life1_3;
    net.minecraft.world.WorldType life4_9;
    java.lang.String life3_10;
    moom.FG life5_24;
    forward_join_53: {
    forward_join_46: {
    forward_join_36: {
    forward_join_34: {
    life1_3 = (moom.EA.k ^ 124475835040706L);
    spill1789_0 = net.minecraft.world.World.c__String();
    life4_9 = ((net.minecraft.world.storage.WorldInfo)(((net.minecraft.world.World)(this.b)).a__IX())).a__EL();
    life3_10 = spill1789_0;
    spill1789_1 = life4_9;
    spill1789_2 = net.minecraft.world.WorldType.c;
    if (!((life3_10 == null))) {
        forwardValue1789_36_0 = spill1789_1;
        forwardValue1789_36_1 = spill1789_2;
        break forward_join_36;
    }
    if (!((spill1789_1 == spill1789_2))) {
        break forward_join_34;
    }
    life5_24 = __sourceExactCall_25850b1cde76ff(((java.lang.String)(((net.minecraft.world.storage.WorldInfo)(((net.minecraft.world.World)(this.b)).a__IX())).b__String())));
    this.e = ((net.minecraft.world.biome.WorldChunkManager)(new moom.Fg(__sourceExactCall_67e2754ad05106(((int)(((moom.FG)(life5_24)).a())), ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.af))), 0x1.0p-1f)));
    if (!((life3_10 != null))) {
        break forward_join_53;
    }
    }
    forwardValue1789_36_0 = life4_9;
    forwardValue1789_36_1 = net.minecraft.world.WorldType.g;
    }
    if (!((forwardValue1789_36_0 == forwardValue1789_36_1))) {
        break forward_join_46;
    }
    this.e = ((net.minecraft.world.biome.WorldChunkManager)(new moom.Fg(net.minecraft.world.biome.BiomeGenBase.s, 0x0.0p0f)));
    if (!((life3_10 != null))) {
        break forward_join_53;
    }
    }
    this.e = ((net.minecraft.world.biome.WorldChunkManager)(new net.minecraft.world.biome.WorldChunkManager(this.b)));
    }
    return;
}


public boolean e() {
return ((((this.g) ? 1 : 0)) != 0);
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral4291_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/EA"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public boolean c() {
return ((1) != 0);
}


private static long c(int p0, long p1) {
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
    life3_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 15148);
    if (((moom.EA.t)[life3_8] == null)) {
        life4_77 = new byte[] {((byte) ((int) (p1 >>> 56))), ((byte) ((int) (p1 >>> 48))), ((byte) ((int) (p1 >>> 40))), ((byte) ((int) (p1 >>> 32))), ((byte) ((int) (p1 >>> 24))), ((byte) ((int) (p1 >>> 16))), ((byte) ((int) (p1 >>> 8))), ((byte) ((int) p1))};
        life5_81 = (moom.EA.s)[life3_8];
        life7_146 = new byte[] {((byte) ((int) (life5_81 >>> 56))), ((byte) ((int) (life5_81 >>> 48))), ((byte) ((int) (life5_81 >>> 40))), ((byte) ((int) (life5_81 >>> 32))), ((byte) ((int) (life5_81 >>> 24))), ((byte) ((int) (life5_81 >>> 16))), ((byte) ((int) (life5_81 >>> 8))), ((byte) ((int) life5_81))};
        life8_150 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life9_155 = ((java.lang.Object[])(((java.util.Map)(moom.EA.u)).get(((java.lang.Object)(life8_150)))));
        try {
        if ((life9_155 == null)) {
        life9_155 = new java.lang.Object[3];
        (life9_155)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding")));
        (life9_155)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life9_155)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.EA.u)).put(((java.lang.Object)(life8_150)), ((java.lang.Object)(life9_155)));
    }
        life11_188 = new javax.crypto.spec.DESKeySpec(life4_77);
        life12_195 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life9_155)[1])))).generateSecret(((java.security.spec.KeySpec)(life11_188)));
        life13_200 = ((javax.crypto.Cipher)((life9_155)[0]));
        ((javax.crypto.Cipher)(life13_200)).init(((int)(2)), ((java.security.Key)(life12_195)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life9_155)[2])))));
        life10_212 = ((javax.crypto.Cipher)(life13_200)).doFinal(((byte[])(life7_146)));
    } catch (java.lang.Exception life11_214) {
        throw new java.lang.RuntimeException("moom/EA", life11_214);
    }
        life11_290 = (((((((((((long) (life10_212)[0]) & 255L) << 56) | ((((long) (life10_212)[1]) & 255L) << 48)) | ((((long) (life10_212)[2]) & 255L) << 40)) | ((((long) (life10_212)[3]) & 255L) << 32)) | ((((long) (life10_212)[4]) & 255L) << 24)) | ((((long) (life10_212)[5]) & 255L) << 16)) | ((((long) (life10_212)[6]) & 255L) << 8)) | (((long) (life10_212)[7]) & 255L));
        (moom.EA.t)[life3_8] = java.lang.Long.valueOf(((long)(life11_290)));
    }
    return ((java.lang.Long)((moom.EA.t)[life3_8])).longValue();
}


private static long c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    long local7 = moom.EA.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local9 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Long.TYPE)), ((java.lang.Object)(java.lang.Long.valueOf(((long)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local9)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public boolean d() {
return ((((this.f) ? 1 : 0)) != 0);
}


public net.minecraft.world.border.WorldBorder a__Fi() {
return new net.minecraft.world.border.WorldBorder();
}


public moom.Fn a__Fn() {
net.minecraft.world.WorldType forestValue910003_30_0;
    net.minecraft.world.WorldType forestValue910003_30_1;
    moom.Fn forestValue910003_51_0;
    net.minecraft.world.WorldType spill910003_0;
    net.minecraft.world.WorldType spill910003_1;
    long life1_3;
    java.lang.String life3_5;
    forest_join_51: {
    forest_join_37: {
    forest_join_30: {
    forest_join_27: {
    life1_3 = (moom.EA.k ^ 9624517049014L);
    life3_5 = net.minecraft.world.World.c__String();
    spill910003_0 = this.c;
    spill910003_1 = net.minecraft.world.WorldType.c;
    if (!((life3_5 == null))) {
        forestValue910003_30_0 = spill910003_0;
        forestValue910003_30_1 = spill910003_1;
        break forest_join_30;
    }
    if (!((spill910003_0 == spill910003_1))) {
        break forest_join_27;
    }
    forestValue910003_51_0 = new net.minecraft.world.gen.ChunkProviderFlat(this.b, ((net.minecraft.world.World)(this.b)).a__Long(), ((net.minecraft.world.storage.WorldInfo)(((net.minecraft.world.World)(this.b)).a__IX())).c__Boolean(), this.d);
    break forest_join_51;
    }
    forestValue910003_30_0 = this.c;
    forestValue910003_30_1 = net.minecraft.world.WorldType.g;
    }
    if (!((forestValue910003_30_0 == forestValue910003_30_1))) {
        break forest_join_37;
    }
    forestValue910003_51_0 = new moom.Fx(this.b);
    break forest_join_51;
    }
    forestValue910003_51_0 = new moom.FA(this.b, ((net.minecraft.world.World)(this.b)).a__Long(), ((net.minecraft.world.storage.WorldInfo)(((net.minecraft.world.World)(this.b)).a__IX())).c__Boolean(), this.d);
    }
    return forestValue910003_51_0;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public boolean a(int p0, int p1) {
long local3 = (moom.EA.k ^ 106580061870721L);
    return ((((net.minecraft.world.World)(this.b)).a__ch(((moom.DT)(new moom.DT(p0, 0, p1)))) == net.minecraft.init.Blocks.c) ? true : false);
}


public float[] a__ArrayFloat() {
return this.h;
}


public double a() {
long local1 = (moom.EA.k ^ 108203142448932L);
    return ((this.c == net.minecraft.world.WorldType.c) ? 0x1.0p0d : 0x1.0p-5d);
}


public final void a(net.minecraft.world.World p0) {
this.b = ((net.minecraft.world.World)(p0));
    this.c = ((net.minecraft.world.WorldType)(((net.minecraft.world.storage.WorldInfo)(((net.minecraft.world.World)(p0)).a__IX())).a__EL()));
    this.d = ((java.lang.String)(((net.minecraft.world.storage.WorldInfo)(((net.minecraft.world.World)(p0)).a__IX())).b__String()));
    ((moom.EA)(this)).b__Void();
    ((moom.EA)(this)).a__Void();
    return;
}


protected void a__Void() {
java.lang.String spill574_0;
    long life1_3;
    float life4_6;
    java.lang.String life3_7;
    int life5_9;
    float life6_23;
    lexical_join_46: {
    life1_3 = (moom.EA.k ^ 81645703212794L);
    spill574_0 = net.minecraft.world.World.c__String();
    life4_6 = 0x0.0p0f;
    life3_7 = spill574_0;
    life5_9 = 0;
    lexical_cycle_10: while (true) {
    if (!((life5_9 <= __sourceIntrinsic_b82a5b29b709_invokedynamic574_2(13174, (8576993760591326527L ^ life1_3))))) {
        break lexical_join_46;
    }
    life6_23 = (0x1.0p0f - (((float) life5_9) / 0x1.ep3f));
    (this.h)[life5_9] = ((((0x1.0p0f - life6_23) / ((life6_23 * 0x1.8p1f) + 0x1.0p0f)) * (0x1.0p0f - life4_6)) + life4_6);
    life5_9 += 1;
    if (!((life3_7 != null))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    return;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral4296_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/EA"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_28415693f82cf2(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x661B;
        if (EA.n[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = m[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])o.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    o.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/EA", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            EA.n[n2] = n4;
        }
        return EA.n[n2];
}


public float[] a__ArrayFloat(float p0, float p1) {
int forwardValue1785_34_0;
    float forwardValue1785_43_0;
    float forwardValue1785_43_1;
    java.lang.String spill1785_0;
    int spill1785_1;
    float spill1785_2;
    float spill1785_3;
    long life3_3;
    float life6_6;
    java.lang.String life5_7;
    float life7_16;
    float life8_18;
    float life9_56;
    float life10_67;
    float life10_71;
    forward_join_99: {
    forward_join_43: {
    forward_join_34: {
    life3_3 = (moom.EA.k ^ 112576784907731L);
    spill1785_0 = net.minecraft.world.World.c__String();
    life6_6 = 0x1.99999ap-2f;
    life5_7 = spill1785_0;
    life7_16 = (moom.Dr.b(((float)(((p0 * 0x1.921fb6p1f) * 0x1.0p1f)))) - 0x0.0p0f);
    life8_18 = -0x0.0p0f;
    spill1785_1 = recovery.source.CarrierOps.fcmpl(((float)(life7_16)), ((float)((life8_18 - life6_6))));
    if (!((life5_7 == null))) {
        forwardValue1785_34_0 = spill1785_1;
        break forward_join_34;
    }
    if (!((spill1785_1 >= 0))) {
        break forward_join_99;
    }
    spill1785_2 = life7_16;
    spill1785_3 = (life8_18 + life6_6);
    if (!((life5_7 == null))) {
        forwardValue1785_43_0 = spill1785_2;
        forwardValue1785_43_1 = spill1785_3;
        break forward_join_43;
    }
    forwardValue1785_34_0 = recovery.source.CarrierOps.fcmpg(((float)(spill1785_2)), ((float)(spill1785_3)));
    }
    if (!((forwardValue1785_34_0 <= 0))) {
        break forward_join_99;
    }
    forwardValue1785_43_0 = (((life7_16 - life8_18) / life6_6) * 0x1.0p-1f);
    forwardValue1785_43_1 = 0x1.0p-1f;
    }
    life9_56 = (forwardValue1785_43_0 + forwardValue1785_43_1);
    life10_67 = (0x1.0p0f - ((0x1.0p0f - moom.Dr.a(((float)((life9_56 * 0x1.921fb6p1f))))) * 0x1.fae148p-1f));
    life10_71 = (life10_67 * life10_67);
    (this.j)[0] = ((life9_56 * 0x1.333334p-2f) + 0x1.666666p-1f);
    (this.j)[1] = (((life9_56 * life9_56) * 0x1.666666p-1f) + 0x1.99999ap-3f);
    (this.j)[2] = (((life9_56 * life9_56) * 0x0.0p0f) + 0x1.99999ap-3f);
    (this.j)[3] = life10_71;
    return this.j;
    }
    return null;
}


public int a__Int() {
moom.EA forwardValue1787_15_0;
    int forwardValue1787_19_0;
    moom.EA spill1787_0;
    long life1_3;
    java.lang.String life3_5;
    forward_join_19: {
    forward_join_15: {
    forward_join_14: {
    life1_3 = (moom.EA.k ^ 90793803280036L);
    life3_5 = net.minecraft.world.World.c__String();
    spill1787_0 = this;
    if (!((life3_5 == null))) {
        forwardValue1787_15_0 = spill1787_0;
        break forward_join_15;
    }
    if (!((((moom.EA)(spill1787_0)).c == net.minecraft.world.WorldType.c))) {
        break forward_join_14;
    }
    forwardValue1787_19_0 = 4;
    break forward_join_19;
    }
    forwardValue1787_15_0 = this;
    }
    forwardValue1787_19_0 = (((net.minecraft.world.World)(((moom.EA)(forwardValue1787_15_0)).b)).c() + 1);
    }
    return forwardValue1787_19_0;
}


public moom.DT a__DT() {
return null;
}


public moom.DR a(float p0, float p1) {
float local3 = ((moom.Dr.b(((float)(((p0 * 0x1.921fb6p1f) * 0x1.0p1f)))) * 0x1.0p1f) + 0x1.0p-1f);
    local3 = moom.Dr.a(((float)(local3)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)));
    float local4 = 0x1.818182p-1f;
    float local5 = 0x1.b1b1b2p-1f;
    float local6 = 0x1.0p0f;
    local4 = (local4 * ((local3 * 0x1.e147aep-1f) + 0x1.eb851ep-5f));
    local5 = (local5 * ((local3 * 0x1.e147aep-1f) + 0x1.eb851ep-5f));
    local6 = (local6 * ((local3 * 0x1.d1eb86p-1f) + 0x1.70a3d8p-4f));
    return new moom.DR(((double) local4), ((double) local5), ((double) local6));
}


public float a__Float() {
return 0x1.0p7f;
}


public static moom.EA a(int p0) {
int forwardValue1783_16_0;
    int forwardValue1783_24_0;
    moom.EA forwardValue1783_31_0;
    int spill1783_0;
    long life1_3;
    java.lang.String life3_5;
    forward_join_31: {
    forward_join_30: {
    forward_join_24: {
    forward_join_23: {
    forward_join_16: {
    forward_join_15: {
    life1_3 = (moom.EA.k ^ 46427799242396L);
    life3_5 = net.minecraft.world.World.c__String();
    spill1783_0 = p0;
    if (!((life3_5 == null))) {
        forwardValue1783_16_0 = spill1783_0;
        break forward_join_16;
    }
    if (!((spill1783_0 == -1))) {
        break forward_join_15;
    }
    forwardValue1783_31_0 = new moom.EC();
    break forward_join_31;
    }
    forwardValue1783_16_0 = p0;
    }
    if (!((life3_5 == null))) {
        forwardValue1783_24_0 = forwardValue1783_16_0;
        break forward_join_24;
    }
    if (!((forwardValue1783_16_0 == 0))) {
        break forward_join_23;
    }
    forwardValue1783_31_0 = new moom.ED();
    break forward_join_31;
    }
    forwardValue1783_24_0 = p0;
    }
    if (!((forwardValue1783_24_0 == 1))) {
        break forward_join_30;
    }
    forwardValue1783_31_0 = new moom.EB();
    break forward_join_31;
    }
    forwardValue1783_31_0 = null;
    }
    return forwardValue1783_31_0;
}


public float a(long p0, float p1) {
int forwardValue1784_39_0;
    float forwardValue1784_59_0;
    float forwardValue1784_59_1;
    java.lang.String spill1784_0;
    int spill1784_1;
    float spill1784_2;
    float spill1784_3;
    long life4_3;
    int life7_12;
    float life8_22;
    java.lang.String life6_23;
    float life8_62;
    float life8_66;
    forward_join_59: {
    forward_join_44: {
    forward_join_39: {
    forward_join_34: {
    life4_3 = (moom.EA.k ^ 24044324065587L);
    life7_12 = ((int) (p0 % __sourceIntrinsic_62e60d6e314c_invokedynamic1784_1(22061, (3577898931658369691L ^ life4_3))));
    spill1784_0 = net.minecraft.world.World.c__String();
    life8_22 = (((((float) life7_12) + p1) / 0x1.77p14f) - 0x1.0p-2f);
    life6_23 = spill1784_0;
    spill1784_1 = recovery.source.CarrierOps.fcmpg(((float)(life8_22)), ((float)(0x0.0p0f)));
    if (!((life6_23 == null))) {
        forwardValue1784_39_0 = spill1784_1;
        break forward_join_39;
    }
    if (!((spill1784_1 < 0))) {
        break forward_join_34;
    }
    life8_22 = (life8_22 + 0x1.0p0f);
    }
    spill1784_2 = life8_22;
    spill1784_3 = 0x1.0p0f;
    if (!((life6_23 == null))) {
        forwardValue1784_59_0 = spill1784_2;
        forwardValue1784_59_1 = spill1784_3;
        break forward_join_59;
    }
    forwardValue1784_39_0 = recovery.source.CarrierOps.fcmpl(((float)(spill1784_2)), ((float)(spill1784_3)));
    }
    if (!((forwardValue1784_39_0 > 0))) {
        break forward_join_44;
    }
    life8_22 = (life8_22 - 0x1.0p0f);
    }
    life8_62 = (0x1.0p0f - ((float) ((java.lang.Math.cos(((double)((((double) life8_22) * 0x1.921fb54442d18p1d)))) + 0x1.0p0d) / 0x1.0p1d)));
    forwardValue1784_59_0 = life8_62;
    forwardValue1784_59_1 = 0x0.0p0f;
    }
    life8_66 = (forwardValue1784_59_0 + forwardValue1784_59_1);
    return life8_66;
}


public net.minecraft.world.biome.WorldChunkManager a__Ff() {
return this.e;
}


public int a(long p0) {
long local3 = (moom.EA.k ^ 77408460728014L);
    return (((int) (((p0 / __sourceIntrinsic_17f83508ed96_originalDynamicSite1124_1(12665, (1766002546347588147L ^ local3))) % __sourceIntrinsic_17f83508ed96_originalDynamicSite1124_2(17592, (996410404276916209L ^ local3))) + __sourceIntrinsic_17f83508ed96_originalDynamicSite1124_3(26478, (2503500232020519974L ^ local3)))) % __sourceIntrinsic_17f83508ed96_originalDynamicSite1124_4(24378, (2869435548967733569L ^ local3)));
}


public abstract java.lang.String a__String();

public boolean a__Boolean() {
return ((1) != 0);
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite635_97(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite635_99(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite635_100(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_93d96bd3140afadc_originalDynamicSite1943_2(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_17f83508ed96_originalDynamicSite1124_1(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_17f83508ed96_originalDynamicSite1124_2(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_17f83508ed96_originalDynamicSite1124_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_17f83508ed96_originalDynamicSite1124_4(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_62e60d6e314c_invokedynamic1784_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral4296_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic574_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral4291_0() throws E;

private static native moom.FG __sourceExactCall_25850b1cde76ff(java.lang.String p0);
private static native net.minecraft.world.biome.BiomeGenBase __sourceExactCall_67e2754ad05106(int p0, net.minecraft.world.biome.BiomeGenBase p1);
private static native int __sourceExactCall_28415693f82cf2(int p0, long p1);
}
