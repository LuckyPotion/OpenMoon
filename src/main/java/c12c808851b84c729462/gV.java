package com.moon;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class gV extends com.moon.gU {

private static int[] d;

private int e;

private int f;

private com.moon.gX g;

private java.lang.Thread h;

private boolean i;

private net.minecraft.client.shader.Framebuffer j;

private com.moon.iu k;

private int l;

private int m;

private long n;

private com.moon.module.impl.ESP o;

private com.moon.module.impl.Effects p;

private static long q;

private static java.lang.String r;

private static long[] s;

private static java.lang.Integer[] t;

private static java.util.Map u;

private static long v;

public gV(net.minecraft.client.shader.Framebuffer p0, net.minecraft.client.shader.Framebuffer[] p1, int p2, int p3) { super((net.minecraft.client.shader.Framebuffer)null, (net.minecraft.client.shader.Framebuffer[])null); }


private static void __sourceConstructorBody_94abff97737a8569(com.moon.gV receiver, net.minecraft.client.shader.Framebuffer p0, net.minecraft.client.shader.Framebuffer[] p1, int p2, int p3) throws Throwable {

long local5_life1 = (com.moon.gV.q ^ 22764645000610L);

    com.moon.gV.__sourceConstructorInit_94abff97737a8569_0(((com.moon.gV)(receiver)), ((net.minecraft.client.shader.Framebuffer)(p0)), ((net.minecraft.client.shader.Framebuffer[])(p1)));

    ((com.moon.gV)(receiver)).g = ((com.moon.gX)(new com.moon.gX()));

    ((com.moon.gV)(receiver)).j = ((net.minecraft.client.shader.Framebuffer)(new net.minecraft.client.shader.Framebuffer(1, 1, false)));

    ((com.moon.gV)(receiver)).k = ((com.moon.iu)(new com.moon.iu(1, 1, false)));

    ((com.moon.gV)(receiver)).n = ((long)(java.lang.System.currentTimeMillis()));

    net.minecraft.entity.Entity[] __sourceSpill57_10 = com.moon.gX.b();

    ((com.moon.gV)(receiver)).e = ((int)(p2));

    ((com.moon.gV)(receiver)).f = ((int)(p3));

    ((com.moon.gV)(receiver)).h = ((java.lang.Thread)(new java.lang.Thread(__sourceIntrinsic_94abff97737a8569_originalDynamicSite57_12(receiver), com.moon.gV.r)));

    net.minecraft.entity.Entity[] local7_life15 = __sourceSpill57_10;

    ((java.lang.Thread)(((com.moon.gV)(receiver)).h)).start();

    if ((net.minecraft.entity.Entity.b__ArrayString() != null)) {

        com.moon.gX.b(((net.minecraft.entity.Entity[])(new net.minecraft.entity.Entity[5])));

    }

    return;

}



static {
q = ((long)(((moom._a)(moom._c.a(((long)(-758425582709147188L)), ((long)(-4767092985599272820L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(132481791096168L)))));
    long local19_life6 = (com.moon.gV.q ^ 21283941339011L);
    javax.crypto.Cipher local16_life8;
    javax.crypto.Cipher __sourceSpill112_10 = (local16_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill112_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill112_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill112_13 = new byte[8];
    (__sourceSpill112_13)[0] = ((byte) ((int) (local19_life6 >>> 56)));
    int local17_life14 = 1;
    while ((local17_life14 < 8)) {
        (__sourceSpill112_13)[local17_life14] = ((byte) ((int) ((local19_life6 << (local17_life14 * 8)) >>> 56)));
        local17_life14 += 1;
    }
    byte[] __sourcePreallocation112_15 = __sourceSpill112_13;
    ((javax.crypto.Cipher)(__sourceSpill112_10)).init(((int)(__sourceSpill112_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill112_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation112_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    byte[] __sourceSpill112_19 = ((java.lang.String)("O\\'ÕiÌ\007}Eú·ÕýLmÝ¤áð")).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __sourceSpill112_20 = local16_life8;
    byte[] local18_life22 = ((javax.crypto.Cipher)(__sourceSpill112_20)).doFinal(((byte[])(__sourceSpill112_19)));
    r = ((java.lang.String)(((java.lang.String)(com.moon.gV.a(((byte[])(local18_life22))))).intern()));
    u = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local5_life28;
    javax.crypto.Cipher __sourceSpill112_30 = (local5_life28 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill112_31 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill112_32 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill112_33 = new byte[8];
    (__sourceSpill112_33)[0] = ((byte) ((int) (local19_life6 >>> 56)));
    int local6_life34 = 1;
    while ((local6_life34 < 8)) {
        (__sourceSpill112_33)[local6_life34] = ((byte) ((int) ((local19_life6 << (local6_life34 * 8)) >>> 56)));
        local6_life34 += 1;
    }
    byte[] __sourcePreallocation112_35 = __sourceSpill112_33;
    ((javax.crypto.Cipher)(__sourceSpill112_30)).init(((int)(__sourceSpill112_31)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill112_32)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation112_35)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local11_life38 = new long[47];
    int local8_life39 = 0;
    java.lang.String local9_life40;
    int local10_life42 = ((java.lang.String)((local9_life40 = "õ}©pë ,n6\031hÒ\000¥ë#/y¦[¬Á\bñ×½y\020èD-_\t v\002fNX\\f+áèn\nO\005¶>q58kT·9Ê~[Åë{¸ø2y\0254¶_\031\000ä·!c[LèÆµÎ\030È¬ç|¦Å\017ñ£b\031\nÕ4âÞ¬t±ê·ëV\033Ì*X*¤ú\002@ä­ãê¶5í¡lXÆ°}jPR*.Ó\017¸ÃãÐs\017&.[\023ÂÄÛ¡÷ã½c<!PÊlkY\004`Ó/áA:\022\035g\024ñêzPzÐ½ãX\035ã2\020\007@¨²µûé[»£½Ö\027\nBH²\016\017\0329ãÜ_7gh\177GÜó`\f}mqÒÂ úÈ\024¦î\001\037ÞZO\fë\031Ñ5Ø³\004¾Üc0ke%§ü6DSá#°jÂ@¥}XÅÈù\001à« Ó\021Ò½þæ[ògÿ\000xn2wDlp\017A·xVPÈ-<®¼´©Ä\0337Mh]'@^w÷ÂG­nPzEêÆ"))).length();
    int local7_life43 = 0;
    do {
        java.lang.String __sourceSpill112_44 = local9_life40;
        int __sourceSpill112_45 = local7_life43;
        local7_life43 += 8;
        byte[] local12_life48 = ((java.lang.String)(((java.lang.String)(__sourceSpill112_44)).substring(((int)(__sourceSpill112_45)), ((int)(local7_life43))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill112_49 = local11_life38;
        int __sourceSpill112_50 = local8_life39;
        local8_life39 += 1;
        long local13_life51 = (((((((((((long) (local12_life48)[0]) & 255L) << 56) | ((((long) (local12_life48)[1]) & 255L) << 48)) | ((((long) (local12_life48)[2]) & 255L) << 40)) | ((((long) (local12_life48)[3]) & 255L) << 32)) | ((((long) (local12_life48)[4]) & 255L) << 24)) | ((((long) (local12_life48)[5]) & 255L) << 16)) | ((((long) (local12_life48)[6]) & 255L) << 8)) | (((long) (local12_life48)[7]) & 255L));
        byte[] __sourceSpill112_52 = new byte[8];
        (__sourceSpill112_52)[0] = ((byte) ((int) (local13_life51 >>> 56)));
        (__sourceSpill112_52)[1] = ((byte) ((int) (local13_life51 >>> 48)));
        (__sourceSpill112_52)[2] = ((byte) ((int) (local13_life51 >>> 40)));
        (__sourceSpill112_52)[3] = ((byte) ((int) (local13_life51 >>> 32)));
        (__sourceSpill112_52)[4] = ((byte) ((int) (local13_life51 >>> 24)));
        (__sourceSpill112_52)[5] = ((byte) ((int) (local13_life51 >>> 16)));
        (__sourceSpill112_52)[6] = ((byte) ((int) (local13_life51 >>> 8)));
        (__sourceSpill112_52)[7] = ((byte) ((int) local13_life51));
        javax.crypto.Cipher __sourceSpill112_53 = local5_life28;
        byte[] local15_life55 = ((javax.crypto.Cipher)(__sourceSpill112_53)).doFinal(((byte[])(__sourceSpill112_52)));
        (__sourceSpill112_49)[__sourceSpill112_50] = (((((((((((long) (local15_life55)[0]) & 255L) << 56) | ((((long) (local15_life55)[1]) & 255L) << 48)) | ((((long) (local15_life55)[2]) & 255L) << 40)) | ((((long) (local15_life55)[3]) & 255L) << 32)) | ((((long) (local15_life55)[4]) & 255L) << 24)) | ((((long) (local15_life55)[5]) & 255L) << 16)) | ((((long) (local15_life55)[6]) & 255L) << 8)) | (((long) (local15_life55)[7]) & 255L));
    } while ((!(local7_life43 >= local10_life42)));
    local10_life42 = ((java.lang.String)((local9_life40 = "iÈG^¯\t·Øùø9Â"))).length();
    local7_life43 = 0;
    do {
        java.lang.String __sourceSpill112_57 = local9_life40;
        int __sourceSpill112_58 = local7_life43;
        local7_life43 += 8;
        byte[] local12_life61 = ((java.lang.String)(((java.lang.String)(__sourceSpill112_57)).substring(((int)(__sourceSpill112_58)), ((int)(local7_life43))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill112_62 = local11_life38;
        int __sourceSpill112_63 = local8_life39;
        local8_life39 += 1;
        long local13_life64 = (((((((((((long) (local12_life61)[0]) & 255L) << 56) | ((((long) (local12_life61)[1]) & 255L) << 48)) | ((((long) (local12_life61)[2]) & 255L) << 40)) | ((((long) (local12_life61)[3]) & 255L) << 32)) | ((((long) (local12_life61)[4]) & 255L) << 24)) | ((((long) (local12_life61)[5]) & 255L) << 16)) | ((((long) (local12_life61)[6]) & 255L) << 8)) | (((long) (local12_life61)[7]) & 255L));
        byte[] __sourceSpill112_65 = new byte[8];
        (__sourceSpill112_65)[0] = ((byte) ((int) (local13_life64 >>> 56)));
        (__sourceSpill112_65)[1] = ((byte) ((int) (local13_life64 >>> 48)));
        (__sourceSpill112_65)[2] = ((byte) ((int) (local13_life64 >>> 40)));
        (__sourceSpill112_65)[3] = ((byte) ((int) (local13_life64 >>> 32)));
        (__sourceSpill112_65)[4] = ((byte) ((int) (local13_life64 >>> 24)));
        (__sourceSpill112_65)[5] = ((byte) ((int) (local13_life64 >>> 16)));
        (__sourceSpill112_65)[6] = ((byte) ((int) (local13_life64 >>> 8)));
        (__sourceSpill112_65)[7] = ((byte) ((int) local13_life64));
        javax.crypto.Cipher __sourceSpill112_66 = local5_life28;
        byte[] local15_life68 = ((javax.crypto.Cipher)(__sourceSpill112_66)).doFinal(((byte[])(__sourceSpill112_65)));
        (__sourceSpill112_62)[__sourceSpill112_63] = (((((((((((long) (local15_life68)[0]) & 255L) << 56) | ((((long) (local15_life68)[1]) & 255L) << 48)) | ((((long) (local15_life68)[2]) & 255L) << 40)) | ((((long) (local15_life68)[3]) & 255L) << 32)) | ((((long) (local15_life68)[4]) & 255L) << 24)) | ((((long) (local15_life68)[5]) & 255L) << 16)) | ((((long) (local15_life68)[6]) & 255L) << 8)) | (((long) (local15_life68)[7]) & 255L));
    } while ((!(local7_life43 >= local10_life42)));
    s = ((long[])(local11_life38));
    t = ((java.lang.Integer[])(new java.lang.Integer[47]));
    javax.crypto.Cipher local0_life72;
    javax.crypto.Cipher __sourceSpill112_74 = (local0_life72 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill112_75 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill112_76 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill112_77 = new byte[8];
    (__sourceSpill112_77)[0] = ((byte) ((int) (local19_life6 >>> 56)));
    int local1_life78 = 1;
    while ((local1_life78 < 8)) {
        (__sourceSpill112_77)[local1_life78] = ((byte) ((int) ((local19_life6 << (local1_life78 * 8)) >>> 56)));
        local1_life78 += 1;
    }
    byte[] __sourcePreallocation112_79 = __sourceSpill112_77;
    ((javax.crypto.Cipher)(__sourceSpill112_74)).init(((int)(__sourceSpill112_75)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill112_76)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation112_79)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local2_life82 = 4619654803311199542L;
    byte[] __sourceSpill112_83 = new byte[8];
    (__sourceSpill112_83)[0] = ((byte) ((int) (local2_life82 >>> 56)));
    (__sourceSpill112_83)[1] = ((byte) ((int) (local2_life82 >>> 48)));
    (__sourceSpill112_83)[2] = ((byte) ((int) (local2_life82 >>> 40)));
    (__sourceSpill112_83)[3] = ((byte) ((int) (local2_life82 >>> 32)));
    (__sourceSpill112_83)[4] = ((byte) ((int) (local2_life82 >>> 24)));
    (__sourceSpill112_83)[5] = ((byte) ((int) (local2_life82 >>> 16)));
    (__sourceSpill112_83)[6] = ((byte) ((int) (local2_life82 >>> 8)));
    (__sourceSpill112_83)[7] = ((byte) ((int) local2_life82));
    javax.crypto.Cipher __sourceSpill112_84 = local0_life72;
    byte[] local4_life86 = ((javax.crypto.Cipher)(__sourceSpill112_84)).doFinal(((byte[])(__sourceSpill112_83)));
    v = ((long)((((((((((((long) (local4_life86)[0]) & 255L) << 56) | ((((long) (local4_life86)[1]) & 255L) << 48)) | ((((long) (local4_life86)[2]) & 255L) << 40)) | ((((long) (local4_life86)[3]) & 255L) << 32)) | ((((long) (local4_life86)[4]) & 255L) << 24)) | ((((long) (local4_life86)[5]) & 255L) << 16)) | ((((long) (local4_life86)[6]) & 255L) << 8)) | (((long) (local4_life86)[7]) & 255L))));
    int[] __sourceSpill112_89 = new int[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite112_88(11634, (1928434448130656971L ^ local19_life6))];
    (__sourceSpill112_89)[0] = 2;
    (__sourceSpill112_89)[1] = 4;
    (__sourceSpill112_89)[2] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite112_90(22001, (4457174776583402107L ^ local19_life6));
    (__sourceSpill112_89)[3] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite112_91(26036, (8292148386964308537L ^ local19_life6));
    (__sourceSpill112_89)[4] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite112_92(28644, (2270741755744651339L ^ local19_life6));
    (__sourceSpill112_89)[5] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite112_93(30908, (4988714773773721372L ^ local19_life6));
    (__sourceSpill112_89)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite112_94(17220, (1897031332137247995L ^ local19_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite112_95(22463, (3004623779662082103L ^ local19_life6));
    (__sourceSpill112_89)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite112_96(26867, (2080046251240525685L ^ local19_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite112_97(12041, (5329163192455350411L ^ local19_life6));
    (__sourceSpill112_89)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite112_98(32643, (9202393961030785062L ^ local19_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite112_99(22064, (2046188266467570105L ^ local19_life6));
    (__sourceSpill112_89)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite112_100(21605, (6594694364380279750L ^ local19_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite112_101(22628, (150253855142100942L ^ local19_life6));
    (__sourceSpill112_89)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite112_102(1891, (1217577029531263184L ^ local19_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite112_103(2497, (5592528316987272807L ^ local19_life6));
    (__sourceSpill112_89)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite112_104(13511, (5819676462159909737L ^ local19_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite112_105(6680, (7316956201180396970L ^ local19_life6));
    d = ((int[])(__sourceSpill112_89));
}

private static native <E extends Throwable> void __sourceConstructorInit_94abff97737a8569_0(com.moon.gV a0, net.minecraft.client.shader.Framebuffer a1, net.minecraft.client.shader.Framebuffer[] a2) throws E;

public com.moon.gV b(int p0) {
this.f = ((int)(p0));
    return this;
}


private void b(int p0, net.minecraft.client.shader.Framebuffer p1, float p2) {
com.moon.jE forwardValue257_130_0;
    int forwardValue257_130_1;
    com.moon.jE forwardValue257_131_0;
    com.moon.jE forwardValue257_132_0;
    int forwardValue257_132_1;
    int forwardValue257_172_0;
    net.minecraft.entity.Entity[] spill257_0;
    int spill257_1;
    com.moon.jE spill257_2;
    int spill257_3;
    com.moon.jE spill257_4;
    int spill257_5;
    int spill257_6;
    long life4_3;
    com.moon.hW life7_9;
    com.moon.iw life8_12;
    net.minecraft.entity.Entity[] life6_13;
    com.moon.iF life9_24;
    forward_join_172: {
    forward_join_147: {
    forward_join_132: {
    forward_join_131: {
    forward_join_130: {
    life4_3 = (com.moon.gV.q ^ 96259972546760L);
    spill257_0 = com.moon.gX.b();
    life7_9 = ((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.KAWASE_UP))))).a();
    life8_12 = ((com.moon.hW)(life7_9)).a__iw();
    life6_13 = spill257_0;
    spill257_1 = ((life8_12 instanceof com.moon.iF) ? 1 : 0);
    if (!((life6_13 != null))) {
        forwardValue257_172_0 = spill257_1;
        break forward_join_172;
    }
    if (!((spill257_1 != 0))) {
        break forward_join_147;
    }
    life9_24 = ((com.moon.iF)(life8_12));
    ((com.moon.jD)(((com.moon.iF)(life9_24)).a__jD())).a__Void();
    ((net.minecraft.client.shader.Framebuffer)(p1)).a(((boolean)(true)));
    ((com.moon.jE)(((com.moon.iF)(life9_24)).g())).a__Void(((int)(__sourceIntrinsic_e5546304256f_invokedynamic257_13(19998, (1473718625790306034L ^ life4_3)))));
    org.lwjgl.opengl.GL13.glActiveTexture(((int)(__sourceIntrinsic_e5546304256f_invokedynamic257_15(19345, (5703959640102085460L ^ life4_3)))));
    moom.kZ.i(((int)(((com.moon.iu)(((com.moon.g5)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__g5())).a__iu())).g)));
    ((com.moon.jE)(((com.moon.iF)(life9_24)).h())).a__Void(((int)(__sourceIntrinsic_e5546304256f_invokedynamic257_23(5390, (188935147040800197L ^ life4_3)))));
    org.lwjgl.opengl.GL13.glActiveTexture(((int)(__sourceIntrinsic_e5546304256f_invokedynamic257_25(15539, (4303270317835113542L ^ life4_3)))));
    moom.kZ.i(((int)(((net.minecraft.client.shader.Framebuffer)(((net.minecraft.client.Minecraft)(com.moon.gV.a)).a__pA())).h)));
    ((com.moon.jE)(((com.moon.iF)(life9_24)).i())).a__Void(((int)(__sourceIntrinsic_e5546304256f_invokedynamic257_32(19256, (2724998694977938382L ^ life4_3)))));
    org.lwjgl.opengl.GL13.glActiveTexture(((int)(__sourceIntrinsic_e5546304256f_invokedynamic257_34(11494, (19982478783366172L ^ life4_3)))));
    moom.kZ.i(((int)(((net.minecraft.client.shader.Framebuffer)(this.b)).g)));
    spill257_2 = ((com.moon.iF)(life9_24)).c();
    spill257_3 = __sourceIntrinsic_e5546304256f_invokedynamic257_40(21692, (123252534048832607L ^ life4_3));
    if (!((life6_13 != null))) {
        forwardValue257_130_0 = spill257_2;
        forwardValue257_130_1 = spill257_3;
        break forward_join_130;
    }
    ((com.moon.jE)(spill257_2)).a__Void(((int)(spill257_3)));
    org.lwjgl.opengl.GL13.glActiveTexture(((int)(__sourceIntrinsic_e5546304256f_invokedynamic257_42(27013, (5684048890570178942L ^ life4_3)))));
    moom.kZ.i(((int)(p0)));
    ((com.moon.jE)(((com.moon.iF)(life9_24)).e())).a(((float)((0x1.0p0f / ((float) ((net.minecraft.client.shader.Framebuffer)(p1)).c)))), ((float)((0x1.0p0f / ((float) ((net.minecraft.client.shader.Framebuffer)(p1)).d)))));
    ((com.moon.jE)(((com.moon.iF)(life9_24)).d__sourceReturn_2220af9394())).a(((float)(p2)), ((float)(p2)));
    ((com.moon.jE)(((com.moon.iF)(life9_24)).f())).a(((float)(0x1.0p0f)));
    spill257_4 = ((com.moon.iF)(life9_24)).j();
    if (!((p1 == this.j))) {
        forwardValue257_131_0 = spill257_4;
        break forward_join_131;
    }
    forwardValue257_130_0 = spill257_4;
    forwardValue257_130_1 = 1;
    }
    forwardValue257_132_0 = forwardValue257_130_0;
    forwardValue257_132_1 = forwardValue257_130_1;
    break forward_join_132;
    }
    forwardValue257_132_0 = forwardValue257_131_0;
    forwardValue257_132_1 = 0;
    }
    ((com.moon.jE)(forwardValue257_132_0)).a(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue257_132_1))));
    ((com.moon.jE)(((com.moon.iF)(life9_24)).k())).a(((float)(((-(((float) ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.gV.a)).K)).S) + ((moom.DM)(((net.minecraft.client.Minecraft)(com.moon.gV.a)).l)).b)) * 0x1.0p1f))));
    }
    ((com.moon.hW)(life7_9)).b();
    org.lwjgl.opengl.GL13.glActiveTexture(((int)(__sourceIntrinsic_e5546304256f_invokedynamic257_65(5826, (3945047129810566662L ^ life4_3)))));
    spill257_5 = 27013;
    moom.kZ.i(((int)(0)));
    org.lwjgl.opengl.GL13.glActiveTexture(((int)(__sourceIntrinsic_e5546304256f_invokedynamic257_68(spill257_5, (5684048890570178942L ^ life4_3)))));
    spill257_6 = 26328;
    moom.kZ.i(((int)(0)));
    org.lwjgl.opengl.GL13.glActiveTexture(((int)(__sourceIntrinsic_e5546304256f_invokedynamic257_71(spill257_6, (121886193146039858L ^ life4_3)))));
    forwardValue257_172_0 = 0;
    }
    moom.kZ.i(((int)(forwardValue257_172_0)));
    return;
}


public int b() {
return this.m;
}


public void b__Void() {
int forwardValue258_40_0;
    boolean spill258_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    moom.ir life4_58;
    double life5_61;
    double life7_64;
    double life9_66;
    double life11_68;
    double life13_70;
    double life15_72;
    double life17_74;
    double life19_76;
    net.minecraft.client.renderer.Tessellator life21_92;
    moom.lw life22_95;
    forward_join_171: {
    forward_join_51: {
    forward_join_40: {
    life1_3 = (com.moon.gV.q ^ 44350502071489L);
    life3_5 = com.moon.gX.b();
    spill258_0 = ((com.moon.iu)(this.k)).a__Boolean(((int)(((net.minecraft.client.Minecraft)(com.moon.gV.a)).G)), ((int)(((net.minecraft.client.Minecraft)(com.moon.gV.a)).H)));
    if (!((life3_5 != null))) {
        forwardValue258_40_0 = ((spill258_0) ? 1 : 0);
        break forward_join_40;
    }
    if (!(spill258_0)) {
        break forward_join_51;
    }
    ((com.moon.iu)(this.k)).c();
    moom.kZ.b(((int)(__sourceIntrinsic_9bf881b104f5_invokedynamic258_11(3146, (1928619440671639728L ^ life1_3)))), ((int)(__sourceIntrinsic_9bf881b104f5_invokedynamic258_12(23849, (5188415564542843360L ^ life1_3)))), ((int)(__sourceIntrinsic_9bf881b104f5_invokedynamic258_13(5718, (7470885762368361105L ^ life1_3)))));
    forwardValue258_40_0 = __sourceIntrinsic_9bf881b104f5_invokedynamic258_15(13843, (7382908578715103965L ^ life1_3));
    }
    moom.kZ.b(((int)(forwardValue258_40_0)), ((int)(__sourceIntrinsic_9bf881b104f5_invokedynamic258_16(29373, (5612649696038336067L ^ life1_3)))), ((int)(__sourceIntrinsic_9bf881b104f5_invokedynamic258_17(350, (4683776178443994539L ^ life1_3)))));
    }
    life4_58 = com.moon.nS.a();
    life5_61 = ((moom.ir)(life4_58)).a();
    life7_64 = ((moom.ir)(life4_58)).b();
    life9_66 = 0x0.0p0d;
    life11_68 = 0x0.0p0d;
    life13_70 = 0x0.0p0d;
    life15_72 = 0x1.0p0d;
    life17_74 = 0x1.0p0d;
    life19_76 = 0x0.0p0d;
    moom.kZ.l();
    moom.kZ.d__Void();
    moom.kZ.u();
    moom.kZ.i(((int)(((net.minecraft.client.shader.Framebuffer)(((net.minecraft.client.Minecraft)(com.moon.gV.a)).a__pA())).h)));
    ((com.moon.iu)(this.k)).a(((boolean)(true)));
    ((com.moon.iu)(this.k)).e();
    life21_92 = net.minecraft.client.renderer.Tessellator.a();
    life22_95 = ((net.minecraft.client.renderer.Tessellator)(life21_92)).a__lw();
    ((moom.lw)(life22_95)).a(((int)(__sourceIntrinsic_9bf881b104f5_invokedynamic258_35(30831, (66947613044358313L ^ life1_3)))), ((moom.oD)(moom.oB.k)));
    ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(life22_95)).a(((double)(life9_66)), ((double)((life11_68 + life7_64))), ((double)(0x0.0p0d))))).a(((double)(life13_70)), ((double)(life19_76))))).a(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(life22_95)).a(((double)((life9_66 + life5_61))), ((double)((life11_68 + life7_64))), ((double)(0x0.0p0d))))).a(((double)(life15_72)), ((double)(life19_76))))).a(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(life22_95)).a(((double)((life9_66 + life5_61))), ((double)(life11_68)), ((double)(0x0.0p0d))))).a(((double)(life15_72)), ((double)(life17_74))))).a(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(life22_95)).a(((double)(life9_66)), ((double)(life11_68)), ((double)(0x0.0p0d))))).a(((double)(life13_70)), ((double)(life17_74))))).a(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f))))).c__Void();
    ((net.minecraft.client.renderer.Tessellator)(life21_92)).a__Void();
    super.b__Void();
    if (!((life3_5 == null))) {
        break forward_join_171;
    }
    net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[3])));
    }
    return;
}


private static int a(int p0, long p1) {
int n6 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x2821;
        if (t[n6] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = s[n6];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])u.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    u.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/moon/gV", exception);
            }
            int n8 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            gV.t[n6] = n8;
        }
        return t[n6];
}


private static moom.Oo a(moom.Oo p0) {
return p0;
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
        byte[] spill401_0 = p0;
        life4_9 += 1;
        life5_44 = (spill401_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill401_1 = p0;
        life4_9 += 1;
        life5_76 = (spill401_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill401_2 = p0;
        life4_9 += 1;
        life5_91 = (spill401_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.gV.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral1251_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/gV"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private void a(int p0, net.minecraft.client.shader.Framebuffer p1, float p2) {
int forwardValue255_83_0;
    net.minecraft.entity.Entity[] spill255_0;
    int spill255_1;
    int spill255_2;
    long life4_3;
    com.moon.hW life7_9;
    net.minecraft.entity.Entity[] life6_10;
    com.moon.iw life8_13;
    com.moon.iC life9_24;
    forward_join_83: {
    forward_join_66: {
    life4_3 = (com.moon.gV.q ^ 13940195706583L);
    spill255_0 = com.moon.gX.b();
    life7_9 = ((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.KAWASE_DOWN))))).a();
    life6_10 = spill255_0;
    life8_13 = ((com.moon.hW)(life7_9)).a__iw();
    spill255_1 = ((life8_13 instanceof com.moon.iC) ? 1 : 0);
    if (!((life6_10 != null))) {
        forwardValue255_83_0 = spill255_1;
        break forward_join_83;
    }
    if (!((spill255_1 != 0))) {
        break forward_join_66;
    }
    life9_24 = ((com.moon.iC)(life8_13));
    ((com.moon.jD)(((com.moon.iC)(life9_24)).a__jD())).a__Void();
    ((net.minecraft.client.shader.Framebuffer)(p1)).a(((boolean)(true)));
    ((com.moon.jE)(((com.moon.iC)(life9_24)).c())).a__Void(((int)(__sourceIntrinsic_85c0a022aa6c_invokedynamic255_13(23709, (2415778555360752224L ^ life4_3)))));
    org.lwjgl.opengl.GL13.glActiveTexture(((int)(__sourceIntrinsic_85c0a022aa6c_invokedynamic255_15(32212, (8374057893592601403L ^ life4_3)))));
    moom.kZ.i(((int)(p0)));
    ((com.moon.jE)(((com.moon.iC)(life9_24)).e())).a(((float)((0x1.0p0f / ((float) ((net.minecraft.client.shader.Framebuffer)(p1)).c)))), ((float)((0x1.0p0f / ((float) ((net.minecraft.client.shader.Framebuffer)(p1)).d)))));
    ((com.moon.jE)(((com.moon.iC)(life9_24)).d__sourceReturn_2220af9394())).a(((float)(p2)), ((float)(p2)));
    ((com.moon.jE)(((com.moon.iC)(life9_24)).f())).a(((float)(0x1.0p0f)));
    }
    ((com.moon.hW)(life7_9)).b();
    org.lwjgl.opengl.GL13.glActiveTexture(((int)(__sourceIntrinsic_85c0a022aa6c_invokedynamic255_27(27013, (5683990747199702881L ^ life4_3)))));
    spill255_2 = 14396;
    moom.kZ.i(((int)(0)));
    org.lwjgl.opengl.GL13.glActiveTexture(((int)(__sourceIntrinsic_85c0a022aa6c_invokedynamic255_30(spill255_2, (7726072232323438301L ^ life4_3)))));
    forwardValue255_83_0 = 0;
    }
    moom.kZ.i(((int)(forwardValue255_83_0)));
    return;
}


public void a__Void() {
com.moon.gV lexicalValue49_12_0;
    int lexicalValue49_30_0;
    int lexicalValue49_46_0;
    int lexicalValue49_61_0;
    int lexicalValue49_91_0;
    int lexicalValue49_175_0;
    int lexicalValue49_190_0;
    com.moon.gV lexicalValue49_205_0;
    int lexicalValue49_205_1;
    com.moon.gV lexicalValue49_206_0;
    com.moon.gV lexicalValue49_211_0;
    int lexicalValue49_211_1;
    com.moon.gV lexicalValue49_243_0;
    int lexicalValue49_243_1;
    com.moon.gV lexicalValue49_249_0;
    int lexicalValue49_249_1;
    net.minecraft.client.shader.Framebuffer lexicalValue49_249_2;
    com.moon.gV lexicalValue49_258_0;
    int lexicalValue49_258_1;
    int lexicalValue49_274_0;
    java.lang.Object lexicalValue49_304_0;
    int lexicalValue49_376_0;
    int lexicalValue49_466_0;
    com.moon.gV spill49_0;
    boolean spill49_1;
    boolean spill49_2;
    boolean spill49_3;
    int spill49_4;
    com.moon.gV spill49_5;
    int spill49_6;
    com.moon.gV spill49_7;
    int spill49_8;
    int spill49_9;
    long spill49_10;
    com.moon.module.impl.Effects spill49_11;
    int spill49_12;
    int spill49_13;
    int spill49_14;
    int spill49_15;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    int life4_124;
    int life5_133;
    net.minecraft.client.shader.Framebuffer life6_138;
    com.moon.ej life4_191;
    net.minecraft.client.gui.GuiScreen life7_198;
    com.moon.pj life5_209;
    com.moon.pk life6_228;
    int life5_238;
    int life5_283;
    com.moon.hW life4_382;
    com.moon.iw life5_385;
    com.moon.iD life6_396;
    com.moon.hW life4_464;
    com.moon.iw life5_467;
    com.moon.iE life6_478;
    lexical_join_466: {
    lexical_join_443: {
    lexical_join_386: {
    lexical_join_379: {
    lexical_join_376: {
    lexical_join_371: {
    lexical_join_304: {
    lexical_join_294: {
    lexical_join_274: {
    lexical_join_259: {
    lexical_join_258: {
    lexical_join_256: {
    lexical_join_224: {
    lexical_join_190: {
    lexical_join_184: {
    lexical_join_175: {
    lexical_join_170: {
    lexical_join_138: {
    lexical_join_91: {
    lexical_join_90: {
    lexical_join_61: {
    lexical_join_59: {
    lexical_join_46: {
    lexical_join_40: {
    lexical_join_30: {
    lexical_join_23: {
    lexical_join_18: {
    lexical_join_12: {
    life1_3 = (com.moon.gV.q ^ 89721468093147L);
    life3_5 = com.moon.gX.b();
    spill49_0 = this;
    if (!((life3_5 != null))) {
        lexicalValue49_12_0 = spill49_0;
        break lexical_join_12;
    }
    if (!((((com.moon.gV)(spill49_0)).o == null))) {
        break lexical_join_18;
    }
    lexicalValue49_12_0 = this;
    }
    ((com.moon.gV)(lexicalValue49_12_0)).o = ((com.moon.module.impl.ESP)(((com.moon.module.impl.ESP)(((com.moon.fU)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__fU())).a(((java.lang.Class)(com.moon.module.impl.ESP.class)))))));
    }
    spill49_1 = org.lwjgl.opengl.Display.isVisible();
    if (!((life3_5 != null))) {
        lexicalValue49_30_0 = ((spill49_1) ? 1 : 0);
        break lexical_join_30;
    }
    if (!((!spill49_1))) {
        break lexical_join_23;
    }
    return;
    }
    lexicalValue49_30_0 = ((((net.minecraft.client.shader.Framebuffer)(this.j)).a__Boolean(((int)(((net.minecraft.client.Minecraft)(com.moon.gV.a)).G)), ((int)(((net.minecraft.client.Minecraft)(com.moon.gV.a)).H)))) ? 1 : 0);
    }
    if (!((life3_5 != null))) {
        lexicalValue49_46_0 = lexicalValue49_30_0;
        break lexical_join_46;
    }
    if (!((lexicalValue49_30_0 != 0))) {
        break lexical_join_40;
    }
    ((net.minecraft.client.shader.Framebuffer)(this.j)).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)));
    }
    lexicalValue49_46_0 = recovery.source.CarrierOps.lcmp(((long)((java.lang.System.currentTimeMillis() - this.n))), ((long)(com.moon.gV.v)));
    }
    if (!((life3_5 != null))) {
        lexicalValue49_61_0 = lexicalValue49_46_0;
        break lexical_join_61;
    }
    if (!((lexicalValue49_46_0 >= 0))) {
        break lexical_join_59;
    }
    this.m = ((int)(this.l));
    this.l = ((int)(0));
    this.n = ((long)(java.lang.System.currentTimeMillis()));
    }
    lexicalValue49_61_0 = ((this.i) ? 1 : 0);
    }
    if (!((life3_5 != null))) {
        lexicalValue49_274_0 = lexicalValue49_61_0;
        break lexical_join_274;
    }
    if (!((lexicalValue49_61_0 != 0))) {
        break lexical_join_259;
    }
    com.moon.gV __stackOp49_31_0 = this;
    ((com.moon.gV)(__stackOp49_31_0)).l = ((int)((((com.moon.gV)(__stackOp49_31_0)).l + 1)));
    ((net.minecraft.client.shader.Framebuffer)(this.j)).f();
    spill49_2 = ((net.minecraft.client.shader.Framebuffer)(this.b)).a__Boolean(((int)(((net.minecraft.client.Minecraft)(com.moon.gV.a)).G)), ((int)(((net.minecraft.client.Minecraft)(com.moon.gV.a)).H)));
    if (!((life3_5 != null))) {
        lexicalValue49_91_0 = ((spill49_2) ? 1 : 0);
        break lexical_join_91;
    }
    if (!(spill49_2)) {
        break lexical_join_90;
    }
    ((net.minecraft.client.shader.Framebuffer)(this.b)).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)));
    }
    lexicalValue49_91_0 = 0;
    }
    life4_124 = lexicalValue49_91_0;
    lexical_cycle_92: while (true) {
    lexical_join_136: {
    lexical_join_135: {
    if (!((life4_124 < (this.c).length))) {
        break lexical_join_138;
    }
    life5_133 = (com.moon.gV.d)[life4_124];
    life6_138 = (this.c)[life4_124];
    if (!((life3_5 != null))) {
        break lexical_join_136;
    }
    spill49_3 = ((net.minecraft.client.shader.Framebuffer)(life6_138)).a__Boolean(((int)((((net.minecraft.client.Minecraft)(com.moon.gV.a)).G / life5_133))), ((int)((((net.minecraft.client.Minecraft)(com.moon.gV.a)).H / life5_133))));
    if (!((life3_5 != null))) {
        lexicalValue49_274_0 = ((spill49_3) ? 1 : 0);
        break lexical_join_274;
    }
    if (!(spill49_3)) {
        break lexical_join_135;
    }
    ((net.minecraft.client.shader.Framebuffer)(life6_138)).a(((int)(__sourceIntrinsic_b82a5b29b709_invokedynamic49_54(28866, (2163276120921332279L ^ life1_3)))));
    ((net.minecraft.client.shader.Framebuffer)(life6_138)).b(((int)(__sourceIntrinsic_b82a5b29b709_invokedynamic49_56(10249, (4958461111866163957L ^ life1_3)))));
    }
    life4_124 += 1;
    }
    if (!((life3_5 == null))) { continue lexical_cycle_92; }
    break lexical_cycle_92;
    }
    }
    ((net.minecraft.client.shader.Framebuffer)(this.b)).a(((boolean)(false)));
    ((net.minecraft.client.shader.Framebuffer)(this.b)).g();
    life4_191 = new com.moon.ej(false);
    ((com.moon.events.EventBus)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).getEventBus())).publish(((java.lang.Object)(life4_191)));
    life7_198 = ((net.minecraft.client.Minecraft)(com.moon.gV.a)).P;
    spill49_4 = ((life7_198 instanceof com.moon.pj) ? 1 : 0);
    if (!((life3_5 != null))) {
        lexicalValue49_175_0 = spill49_4;
        break lexical_join_175;
    }
    if (!((spill49_4 != 0))) {
        break lexical_join_170;
    }
    life5_209 = ((com.moon.pj)(life7_198));
    ((com.moon.pj)(life5_209)).a(((com.moon.ej)(life4_191)));
    if (!((life3_5 == null))) {
        break lexical_join_184;
    }
    }
    life7_198 = ((net.minecraft.client.Minecraft)(com.moon.gV.a)).P;
    lexicalValue49_175_0 = ((life7_198 instanceof com.moon.pk) ? 1 : 0);
    }
    if (!((life3_5 != null))) {
        lexicalValue49_190_0 = lexicalValue49_175_0;
        break lexical_join_190;
    }
    if (!((lexicalValue49_175_0 != 0))) {
        break lexical_join_184;
    }
    life6_228 = ((com.moon.pk)(life7_198));
    ((com.moon.pk)(life6_228)).a(((com.moon.ej)(life4_191)));
    }
    moom.kZ.a(((int)(1)), ((int)(0)), ((int)(1)), ((int)(0)));
    lexicalValue49_190_0 = 0;
    }
    life5_238 = lexicalValue49_190_0;
    lexical_cycle_191: while (true) {
    lexical_join_211: {
    lexical_join_206: {
    lexical_join_205: {
    if (!((life5_238 < this.e))) {
        break lexical_join_224;
    }
    spill49_5 = this;
    spill49_6 = life5_238;
    if (!((life3_5 != null))) {
        lexicalValue49_258_0 = spill49_5;
        lexicalValue49_258_1 = spill49_6;
        break lexical_join_258;
    }
    if (!((life3_5 != null))) {
        lexicalValue49_205_0 = spill49_5;
        lexicalValue49_205_1 = spill49_6;
        break lexical_join_205;
    }
    if (!((spill49_6 == 0))) {
        lexicalValue49_206_0 = spill49_5;
        break lexical_join_206;
    }
    lexicalValue49_205_0 = spill49_5;
    lexicalValue49_205_1 = ((net.minecraft.client.shader.Framebuffer)(((net.minecraft.client.Minecraft)(com.moon.gV.a)).a__pA())).g;
    }
    lexicalValue49_211_0 = lexicalValue49_205_0;
    lexicalValue49_211_1 = lexicalValue49_205_1;
    break lexical_join_211;
    }
    lexicalValue49_211_0 = lexicalValue49_206_0;
    lexicalValue49_211_1 = ((net.minecraft.client.shader.Framebuffer)((this.c)[life5_238])).g;
    }
    ((com.moon.gV)(lexicalValue49_211_0)).a(((int)(lexicalValue49_211_1)), ((net.minecraft.client.shader.Framebuffer)((this.c)[(life5_238 + 1)])), ((float)(((float) this.f))));
    life5_238 += 1;
    if (!((life3_5 == null))) { continue lexical_cycle_191; }
    break lexical_cycle_191;
    }
    }
    life5_283 = this.e;
    lexical_cycle_227: while (true) {
    lexical_join_249: {
    lexical_join_243: {
    if (!((life5_283 > 0))) {
        break lexical_join_256;
    }
    spill49_7 = this;
    spill49_8 = ((net.minecraft.client.shader.Framebuffer)((this.c)[life5_283])).g;
    if (!((life3_5 != null))) {
        lexicalValue49_258_0 = spill49_7;
        lexicalValue49_258_1 = spill49_8;
        break lexical_join_258;
    }
    if (!((life5_283 == 1))) {
        lexicalValue49_243_0 = spill49_7;
        lexicalValue49_243_1 = spill49_8;
        break lexical_join_243;
    }
    lexicalValue49_249_0 = spill49_7;
    lexicalValue49_249_1 = spill49_8;
    lexicalValue49_249_2 = this.j;
    break lexical_join_249;
    }
    lexicalValue49_249_0 = lexicalValue49_243_0;
    lexicalValue49_249_1 = lexicalValue49_243_1;
    lexicalValue49_249_2 = (this.c)[(life5_283 - 1)];
    }
    ((com.moon.gV)(lexicalValue49_249_0)).b(((int)(lexicalValue49_249_1)), ((net.minecraft.client.shader.Framebuffer)(lexicalValue49_249_2)), ((float)(((float) this.f))));
    life5_283 += -1;
    if (!((life3_5 == null))) { continue lexical_cycle_227; }
    break lexical_cycle_227;
    }
    }
    lexicalValue49_258_0 = this;
    lexicalValue49_258_1 = 0;
    }
    ((com.moon.gV)(lexicalValue49_258_0)).i = ((boolean)__sourceIntrinsic_integerToBoolean((lexicalValue49_258_1)));
    }
    moom.kZ.l();
    spill49_9 = 28572;
    moom.kZ.d__Void();
    spill49_10 = (7788196436667057520L ^ life1_3);
    moom.kZ.u();
    moom.kZ.a(((int)(__sourceIntrinsic_b82a5b29b709_invokedynamic49_96(spill49_9, spill49_10))), ((float)(0x0.0p0f)));
    lexicalValue49_274_0 = __sourceIntrinsic_b82a5b29b709_invokedynamic49_98(7080, (2204121836514554186L ^ life1_3));
    }
    moom.kZ.a(((int)(lexicalValue49_274_0)), ((int)(__sourceIntrinsic_b82a5b29b709_invokedynamic49_99(2833, (9214962533256274411L ^ life1_3)))), ((int)(1)), ((int)(0)));
    spill49_11 = this.p;
    if (!((life3_5 != null))) {
        lexicalValue49_304_0 = spill49_11;
        break lexical_join_304;
    }
    if (!((spill49_11 == null))) {
        break lexical_join_294;
    }
    this.p = ((com.moon.module.impl.Effects)(((com.moon.module.impl.Effects)(((com.moon.fU)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__fU())).a(((java.lang.Class)(com.moon.module.impl.Effects.class)))))));
    }
    ((net.minecraft.client.shader.Framebuffer)(((net.minecraft.client.Minecraft)(com.moon.gV.a)).a__pA())).a(((boolean)(true)));
    if (!((life3_5 != null))) {
        break lexical_join_386;
    }
    lexicalValue49_304_0 = ((com.moon.setting.BooleanSetting)(((com.moon.module.impl.Effects)(this.p)).a__kV())).getValue();
    }
    if (!(((java.lang.Boolean)(((java.lang.Boolean)(lexicalValue49_304_0)))).booleanValue())) {
        break lexical_join_379;
    }
    life4_382 = ((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.KAWASE_FOG))))).a();
    life5_385 = ((com.moon.hW)(life4_382)).a__iw();
    spill49_12 = ((life5_385 instanceof com.moon.iD) ? 1 : 0);
    if (!((life3_5 != null))) {
        lexicalValue49_376_0 = spill49_12;
        break lexical_join_376;
    }
    if (!((spill49_12 != 0))) {
        break lexical_join_371;
    }
    life6_396 = ((com.moon.iD)(life5_385));
    ((com.moon.jD)(((com.moon.iD)(life6_396)).a__jD())).a__Void();
    ((com.moon.jE)(((com.moon.iD)(life6_396)).i())).a(((float)(((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(((com.moon.module.impl.Effects)(this.p)).a__kZ())).getValue())))).floatValue())));
    ((com.moon.jE)(((com.moon.iD)(life6_396)).g())).a__Void(((int)(__sourceIntrinsic_b82a5b29b709_invokedynamic49_133(32441, (7921783499343713367L ^ life1_3)))));
    org.lwjgl.opengl.GL13.glActiveTexture(((int)(__sourceIntrinsic_b82a5b29b709_invokedynamic49_135(28131, (4897285627857094456L ^ life1_3)))));
    moom.kZ.i(((int)(((com.moon.iu)(this.k)).g)));
    ((com.moon.jE)(((com.moon.iD)(life6_396)).h())).a__Void(((int)(__sourceIntrinsic_b82a5b29b709_invokedynamic49_141(19993, (96416430305928384L ^ life1_3)))));
    org.lwjgl.opengl.GL13.glActiveTexture(((int)(__sourceIntrinsic_b82a5b29b709_invokedynamic49_143(5826, (3945040452701142037L ^ life1_3)))));
    moom.kZ.i(((int)(((net.minecraft.client.shader.Framebuffer)(this.j)).g)));
    }
    lexicalValue49_376_0 = __sourceIntrinsic_b82a5b29b709_invokedynamic49_148(26328, (121879546998475809L ^ life1_3));
    }
    org.lwjgl.opengl.GL13.glActiveTexture(((int)(lexicalValue49_376_0)));
    ((com.moon.hW)(life4_382)).b();
    }
    ((com.moon.events.EventBus)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).getEventBus())).publish(((java.lang.Object)(new com.moon.event.Render3DEvent())));
    moom.kZ.l();
    }
    life4_464 = ((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.KAWASE_STENCIL))))).a();
    life5_467 = ((com.moon.hW)(life4_464)).a__iw();
    spill49_13 = ((life5_467 instanceof com.moon.iE) ? 1 : 0);
    if (!((life3_5 != null))) {
        lexicalValue49_466_0 = spill49_13;
        break lexical_join_466;
    }
    if (!((spill49_13 != 0))) {
        break lexical_join_443;
    }
    life6_478 = ((com.moon.iE)(life5_467));
    ((com.moon.jD)(((com.moon.iE)(life6_478)).a__jD())).a__Void();
    ((com.moon.jE)(((com.moon.iE)(life6_478)).g())).a__Void(((int)(__sourceIntrinsic_b82a5b29b709_invokedynamic49_165(32441, (7921783499343713367L ^ life1_3)))));
    org.lwjgl.opengl.GL13.glActiveTexture(((int)(__sourceIntrinsic_b82a5b29b709_invokedynamic49_167(28131, (4897285627857094456L ^ life1_3)))));
    moom.kZ.i(((int)(((net.minecraft.client.shader.Framebuffer)(this.b)).g)));
    ((com.moon.jE)(((com.moon.iE)(life6_478)).h())).a__Void(((int)(__sourceIntrinsic_b82a5b29b709_invokedynamic49_173(19993, (96416430305928384L ^ life1_3)))));
    org.lwjgl.opengl.GL13.glActiveTexture(((int)(__sourceIntrinsic_b82a5b29b709_invokedynamic49_175(5826, (3945040452701142037L ^ life1_3)))));
    moom.kZ.i(((int)(((net.minecraft.client.shader.Framebuffer)(this.j)).g)));
    org.lwjgl.opengl.GL20.glUseProgram(((int)(0)));
    }
    ((com.moon.hW)(life4_464)).b();
    org.lwjgl.opengl.GL13.glActiveTexture(((int)(__sourceIntrinsic_b82a5b29b709_invokedynamic49_182(28131, (4897285627857094456L ^ life1_3)))));
    spill49_14 = 5826;
    moom.kZ.i(((int)(0)));
    org.lwjgl.opengl.GL13.glActiveTexture(((int)(__sourceIntrinsic_b82a5b29b709_invokedynamic49_185(spill49_14, (3945040452701142037L ^ life1_3)))));
    spill49_15 = 26328;
    moom.kZ.i(((int)(0)));
    lexicalValue49_466_0 = __sourceIntrinsic_b82a5b29b709_invokedynamic49_188(spill49_15, (121879546998475809L ^ life1_3));
    }
    org.lwjgl.opengl.GL13.glActiveTexture(((int)(lexicalValue49_466_0)));
    return;
}


public com.moon.gV a(int p0) {
this.e = ((int)(p0));
    return this;
}


public com.moon.gV a(boolean p0) {
this.i = ((boolean)(p0));
    return this;
}


private int a() {
int forwardValue254_17_0;
    int forwardValue254_17_1;
    int forwardValue254_23_0;
    int forwardValue254_29_0;
    int spill254_0;
    int spill254_1;
    int spill254_2;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_29: {
    forward_join_24: {
    forward_join_23: {
    forward_join_17: {
    life1_3 = (com.moon.gV.q ^ 128154545010007L);
    life3_5 = com.moon.gX.b();
    spill254_0 = this.e;
    spill254_1 = 3;
    if (!((life3_5 != null))) {
        forwardValue254_17_0 = spill254_0;
        forwardValue254_17_1 = spill254_1;
        break forward_join_17;
    }
    if (!((spill254_0 >= spill254_1))) {
        break forward_join_24;
    }
    spill254_2 = this.f;
    if (!((life3_5 != null))) {
        forwardValue254_23_0 = spill254_2;
        break forward_join_23;
    }
    forwardValue254_17_0 = spill254_2;
    forwardValue254_17_1 = 3;
    }
    if (!((forwardValue254_17_0 > forwardValue254_17_1))) {
        break forward_join_24;
    }
    forwardValue254_23_0 = __sourceIntrinsic_8aebf151eadb_invokedynamic254_4(8183, (3894831548597502607L ^ life1_3));
    }
    forwardValue254_29_0 = forwardValue254_23_0;
    break forward_join_29;
    }
    forwardValue254_29_0 = __sourceIntrinsic_8aebf151eadb_invokedynamic254_5(447, (4746470090431044800L ^ life1_3));
    }
    return forwardValue254_29_0;
}


private void lambda$new$0() {
terminal_cycle_0: while (true) {
        this.i = ((boolean)(true));
        ((com.moon.gX)(this.g)).a(((int)(((com.moon.gV)(this)).a())));
        continue terminal_cycle_0;
    }
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite112_88(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite112_90(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite112_91(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite112_92(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite112_93(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite112_94(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite112_95(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite112_96(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite112_97(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite112_98(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite112_99(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite112_100(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite112_101(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite112_102(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite112_103(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite112_104(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite112_105(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.Runnable __sourceIntrinsic_94abff97737a8569_originalDynamicSite57_12(com.moon.gV a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8aebf151eadb_invokedynamic254_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8aebf151eadb_invokedynamic254_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_85c0a022aa6c_invokedynamic255_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_85c0a022aa6c_invokedynamic255_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_85c0a022aa6c_invokedynamic255_27(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_85c0a022aa6c_invokedynamic255_30(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral1251_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic49_54(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic49_56(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic49_96(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic49_98(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic49_99(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic49_133(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic49_135(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic49_141(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic49_143(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic49_148(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic49_165(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic49_167(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic49_173(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic49_175(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic49_182(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic49_185(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic49_188(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e5546304256f_invokedynamic257_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e5546304256f_invokedynamic257_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e5546304256f_invokedynamic257_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e5546304256f_invokedynamic257_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e5546304256f_invokedynamic257_32(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e5546304256f_invokedynamic257_34(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e5546304256f_invokedynamic257_40(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e5546304256f_invokedynamic257_42(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e5546304256f_invokedynamic257_65(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e5546304256f_invokedynamic257_68(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e5546304256f_invokedynamic257_71(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9bf881b104f5_invokedynamic258_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9bf881b104f5_invokedynamic258_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9bf881b104f5_invokedynamic258_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9bf881b104f5_invokedynamic258_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9bf881b104f5_invokedynamic258_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9bf881b104f5_invokedynamic258_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9bf881b104f5_invokedynamic258_35(int a0, long a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
