package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class qU {

private static final java.util.regex.Pattern a;

private static final java.util.regex.Pattern b;

private static final java.util.regex.Pattern c;

private static final java.util.Set<java.lang.String> d;

private static final long e;

private static final long[] f;

private static final java.lang.Integer[] g;

private static final java.util.Map h;

public qU() {
super();
}


static {
e = ((long)(((moom._a)(moom._c.a(((long)(3811363178064194169L)), ((long)(-7249916794845347224L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(240921754249947L)))));
    long local11_life6 = (moom.qU.e ^ 19852936329745L);
    h = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life9;
    javax.crypto.Cipher __sourceSpill1474_11 = (local0_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1474_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1474_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1474_14 = new byte[8];
    (__sourceSpill1474_14)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local1_life15 = 1;
    while ((local1_life15 < 8)) {
        (__sourceSpill1474_14)[local1_life15] = ((byte) ((int) ((local11_life6 << (local1_life15 * 8)) >>> 56)));
        local1_life15 += 1;
    }
    byte[] __sourcePreallocation1474_16 = __sourceSpill1474_14;
    ((javax.crypto.Cipher)(__sourceSpill1474_11)).init(((int)(__sourceSpill1474_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1474_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1474_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life19 = new long[8];
    int local3_life20 = 0;
    java.lang.String local4_life21;
    int local5_life23 = ((java.lang.String)((local4_life21 = "\000Ç7\034Vh_¦\ru¶ðÖxÅ¶zÎÙâ&Q\0353jeT%ÿm^.ìIø³E]"))).length();
    int local2_life24 = 0;
    do {
        java.lang.String __sourceSpill1474_25 = local4_life21;
        int __sourceSpill1474_26 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1474_25)).substring(((int)(__sourceSpill1474_26)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1474_30 = local6_life19;
        int __sourceSpill1474_31 = local3_life20;
        local3_life20 += 1;
        long local8_life32 = (((((((((((long) (local7_life29)[0]) & 255L) << 56) | ((((long) (local7_life29)[1]) & 255L) << 48)) | ((((long) (local7_life29)[2]) & 255L) << 40)) | ((((long) (local7_life29)[3]) & 255L) << 32)) | ((((long) (local7_life29)[4]) & 255L) << 24)) | ((((long) (local7_life29)[5]) & 255L) << 16)) | ((((long) (local7_life29)[6]) & 255L) << 8)) | (((long) (local7_life29)[7]) & 255L));
        byte[] __sourceSpill1474_33 = new byte[8];
        (__sourceSpill1474_33)[0] = ((byte) ((int) (local8_life32 >>> 56)));
        (__sourceSpill1474_33)[1] = ((byte) ((int) (local8_life32 >>> 48)));
        (__sourceSpill1474_33)[2] = ((byte) ((int) (local8_life32 >>> 40)));
        (__sourceSpill1474_33)[3] = ((byte) ((int) (local8_life32 >>> 32)));
        (__sourceSpill1474_33)[4] = ((byte) ((int) (local8_life32 >>> 24)));
        (__sourceSpill1474_33)[5] = ((byte) ((int) (local8_life32 >>> 16)));
        (__sourceSpill1474_33)[6] = ((byte) ((int) (local8_life32 >>> 8)));
        (__sourceSpill1474_33)[7] = ((byte) ((int) local8_life32));
        javax.crypto.Cipher __sourceSpill1474_34 = local0_life9;
        byte[] local10_life36 = ((javax.crypto.Cipher)(__sourceSpill1474_34)).doFinal(((byte[])(__sourceSpill1474_33)));
        (__sourceSpill1474_30)[__sourceSpill1474_31] = (((((((((((long) (local10_life36)[0]) & 255L) << 56) | ((((long) (local10_life36)[1]) & 255L) << 48)) | ((((long) (local10_life36)[2]) & 255L) << 40)) | ((((long) (local10_life36)[3]) & 255L) << 32)) | ((((long) (local10_life36)[4]) & 255L) << 24)) | ((((long) (local10_life36)[5]) & 255L) << 16)) | ((((long) (local10_life36)[6]) & 255L) << 8)) | (((long) (local10_life36)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    local5_life23 = ((java.lang.String)((local4_life21 = "Ä\007Eø\\vr¯-fÓH¾D"))).length();
    local2_life24 = 0;
    do {
        java.lang.String __sourceSpill1474_38 = local4_life21;
        int __sourceSpill1474_39 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1474_38)).substring(((int)(__sourceSpill1474_39)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1474_43 = local6_life19;
        int __sourceSpill1474_44 = local3_life20;
        local3_life20 += 1;
        long local8_life45 = (((((((((((long) (local7_life42)[0]) & 255L) << 56) | ((((long) (local7_life42)[1]) & 255L) << 48)) | ((((long) (local7_life42)[2]) & 255L) << 40)) | ((((long) (local7_life42)[3]) & 255L) << 32)) | ((((long) (local7_life42)[4]) & 255L) << 24)) | ((((long) (local7_life42)[5]) & 255L) << 16)) | ((((long) (local7_life42)[6]) & 255L) << 8)) | (((long) (local7_life42)[7]) & 255L));
        byte[] __sourceSpill1474_46 = new byte[8];
        (__sourceSpill1474_46)[0] = ((byte) ((int) (local8_life45 >>> 56)));
        (__sourceSpill1474_46)[1] = ((byte) ((int) (local8_life45 >>> 48)));
        (__sourceSpill1474_46)[2] = ((byte) ((int) (local8_life45 >>> 40)));
        (__sourceSpill1474_46)[3] = ((byte) ((int) (local8_life45 >>> 32)));
        (__sourceSpill1474_46)[4] = ((byte) ((int) (local8_life45 >>> 24)));
        (__sourceSpill1474_46)[5] = ((byte) ((int) (local8_life45 >>> 16)));
        (__sourceSpill1474_46)[6] = ((byte) ((int) (local8_life45 >>> 8)));
        (__sourceSpill1474_46)[7] = ((byte) ((int) local8_life45));
        javax.crypto.Cipher __sourceSpill1474_47 = local0_life9;
        byte[] local10_life49 = ((javax.crypto.Cipher)(__sourceSpill1474_47)).doFinal(((byte[])(__sourceSpill1474_46)));
        (__sourceSpill1474_43)[__sourceSpill1474_44] = (((((((((((long) (local10_life49)[0]) & 255L) << 56) | ((((long) (local10_life49)[1]) & 255L) << 48)) | ((((long) (local10_life49)[2]) & 255L) << 40)) | ((((long) (local10_life49)[3]) & 255L) << 32)) | ((((long) (local10_life49)[4]) & 255L) << 24)) | ((((long) (local10_life49)[5]) & 255L) << 16)) | ((((long) (local10_life49)[6]) & 255L) << 8)) | (((long) (local10_life49)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    f = ((long[])(local6_life19));
    g = ((java.lang.Integer[])(new java.lang.Integer[8]));
    a = ((java.util.regex.Pattern)(java.util.regex.Pattern.compile(((java.lang.String)("^@([pare])(?:\\[([\\w=,!-]*)])?$")))));
    b = ((java.util.regex.Pattern)(java.util.regex.Pattern.compile(((java.lang.String)("\\G([-!]?[\\w-]*)(?:$|,)")))));
    c = ((java.util.regex.Pattern)(java.util.regex.Pattern.compile(((java.lang.String)("\\G(\\w+)=([-!]?[\\w-]*)(?:$|,)")))));
    java.lang.String[] __sourceSpill1474_59 = new java.lang.String[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1474_58(25424, (7847081957924364349L ^ local11_life6))];
    (__sourceSpill1474_59)[0] = "x";
    (__sourceSpill1474_59)[1] = "y";
    (__sourceSpill1474_59)[2] = "z";
    (__sourceSpill1474_59)[3] = "dx";
    (__sourceSpill1474_59)[4] = "dy";
    (__sourceSpill1474_59)[5] = "dz";
    (__sourceSpill1474_59)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1474_60(22748, (783915150258101174L ^ local11_life6))] = "rm";
    (__sourceSpill1474_59)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1474_61(25873, (5244267157852153466L ^ local11_life6))] = "r";
    d = ((java.util.Set)(com.google.common.collect.Sets.newHashSet(((java.lang.Object[])(__sourceSpill1474_59)))));
}


private static java.util.List<com.google.common.base.Predicate<net.minecraft.entity.Entity>> b(java.util.Map<java.lang.String, java.lang.String> p0) {
int forwardValue3868_24_0;
    boolean spill3868_0;
    int spill3868_1;
    long life1_3;
    java.util.ArrayList life4_6;
    int life3_7;
    int life5_13;
    forward_join_25: {
    forward_join_24: {
    life1_3 = (moom.qU.e ^ 104131214988233L);
    spill3868_0 = moom.b7.b();
    life4_6 = com.google.common.collect.Lists.newArrayList();
    life3_7 = ((spill3868_0) ? 1 : 0);
    life5_13 = moom.qU.a(((java.util.Map)(p0)), ((java.lang.String)("m")), ((int)(((net.minecraft.world.WorldSettings$GameType)(net.minecraft.world.WorldSettings$GameType.NOT_SET)).a())));
    spill3868_1 = life5_13;
    if (!((life3_7 == 0))) {
        forwardValue3868_24_0 = spill3868_1;
        break forward_join_24;
    }
    if (!((spill3868_1 != ((net.minecraft.world.WorldSettings$GameType)(net.minecraft.world.WorldSettings$GameType.NOT_SET)).a()))) {
        break forward_join_25;
    }
    forwardValue3868_24_0 = ((((java.util.List)(life4_6)).add(((java.lang.Object)(__sourceIntrinsic_8c092920b9e2_invokedynamic3868_9(life5_13))))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue3868_24_0);
    }
    return life4_6;
}


public static boolean b(java.lang.String p0) {
return (__sourceIntrinsic_booleanComparison((((java.util.regex.Matcher)(((java.util.regex.Pattern)(moom.qU.a)).matcher(((java.lang.CharSequence)(p0))))).matches())) != 0);
}


private static java.util.List<com.google.common.base.Predicate<net.minecraft.entity.Entity>> e(java.util.Map<java.lang.String, java.lang.String> p0) {
java.lang.String forwardValue3871_17_0;
    int forwardValue3871_23_0;
    int forwardValue3871_25_0;
    java.lang.String forwardValue3871_37_0;
    boolean spill3871_0;
    java.lang.String spill3871_1;
    boolean spill3871_2;
    java.lang.String spill3871_3;
    long life1_3;
    java.util.ArrayList life4_6;
    java.lang.String life5_10;
    int life3_11;
    int life6_31;
    java.lang.String life7_46;
    forward_join_44: {
    forward_join_37: {
    forward_join_32: {
    forward_join_25: {
    forward_join_24: {
    forward_join_23: {
    forward_join_17: {
    life1_3 = (moom.qU.e ^ 99690714540838L);
    spill3871_0 = moom.b7.b();
    life4_6 = com.google.common.collect.Lists.newArrayList();
    life5_10 = moom.qU.a(((java.util.Map)(p0)), ((java.lang.String)("name")));
    life3_11 = ((spill3871_0) ? 1 : 0);
    spill3871_1 = life5_10;
    if (!((life3_11 == 0))) {
        forwardValue3871_17_0 = spill3871_1;
        break forward_join_17;
    }
    if (!((spill3871_1 != null))) {
        break forward_join_24;
    }
    forwardValue3871_17_0 = life5_10;
    }
    spill3871_2 = ((java.lang.String)(forwardValue3871_17_0)).startsWith(((java.lang.String)("!")));
    if (!((life3_11 == 0))) {
        forwardValue3871_23_0 = ((spill3871_2) ? 1 : 0);
        break forward_join_23;
    }
    if (!(spill3871_2)) {
        break forward_join_24;
    }
    forwardValue3871_23_0 = 1;
    }
    forwardValue3871_25_0 = forwardValue3871_23_0;
    break forward_join_25;
    }
    forwardValue3871_25_0 = 0;
    }
    life6_31 = forwardValue3871_25_0;
    if (!((life6_31 != 0))) {
        break forward_join_32;
    }
    life5_10 = ((java.lang.String)(life5_10)).substring(((int)(1)));
    }
    spill3871_3 = life5_10;
    if (!((life3_11 == 0))) {
        forwardValue3871_37_0 = spill3871_3;
        break forward_join_37;
    }
    if (!((spill3871_3 != null))) {
        break forward_join_44;
    }
    forwardValue3871_37_0 = life5_10;
    }
    life7_46 = forwardValue3871_37_0;
    ((java.util.List)(life4_6)).add(((java.lang.Object)(__sourceIntrinsic_9566c341ad2e_invokedynamic3871_8(life7_46, life6_31))));
    }
    return life4_6;
}


private static java.util.List<com.google.common.base.Predicate<net.minecraft.entity.Entity>> c(java.util.Map<java.lang.String, java.lang.String> p0) {
java.lang.String forwardValue3869_17_0;
    int forwardValue3869_23_0;
    int forwardValue3869_25_0;
    java.lang.String forwardValue3869_37_0;
    boolean spill3869_0;
    java.lang.String spill3869_1;
    boolean spill3869_2;
    java.lang.String spill3869_3;
    long life1_3;
    java.util.ArrayList life4_6;
    java.lang.String life5_10;
    int life3_11;
    int life6_31;
    java.lang.String life7_46;
    forward_join_44: {
    forward_join_37: {
    forward_join_32: {
    forward_join_25: {
    forward_join_24: {
    forward_join_23: {
    forward_join_17: {
    life1_3 = (moom.qU.e ^ 89350684982274L);
    spill3869_0 = moom.b7.c();
    life4_6 = com.google.common.collect.Lists.newArrayList();
    life5_10 = moom.qU.a(((java.util.Map)(p0)), ((java.lang.String)("team")));
    life3_11 = ((spill3869_0) ? 1 : 0);
    spill3869_1 = life5_10;
    if (!((life3_11 != 0))) {
        forwardValue3869_17_0 = spill3869_1;
        break forward_join_17;
    }
    if (!((spill3869_1 != null))) {
        break forward_join_24;
    }
    forwardValue3869_17_0 = life5_10;
    }
    spill3869_2 = ((java.lang.String)(forwardValue3869_17_0)).startsWith(((java.lang.String)("!")));
    if (!((life3_11 != 0))) {
        forwardValue3869_23_0 = ((spill3869_2) ? 1 : 0);
        break forward_join_23;
    }
    if (!(spill3869_2)) {
        break forward_join_24;
    }
    forwardValue3869_23_0 = 1;
    }
    forwardValue3869_25_0 = forwardValue3869_23_0;
    break forward_join_25;
    }
    forwardValue3869_25_0 = 0;
    }
    life6_31 = forwardValue3869_25_0;
    if (!((life6_31 != 0))) {
        break forward_join_32;
    }
    life5_10 = ((java.lang.String)(life5_10)).substring(((int)(1)));
    }
    spill3869_3 = life5_10;
    if (!((life3_11 != 0))) {
        forwardValue3869_37_0 = spill3869_3;
        break forward_join_37;
    }
    if (!((spill3869_3 != null))) {
        break forward_join_44;
    }
    forwardValue3869_37_0 = life5_10;
    }
    life7_46 = forwardValue3869_37_0;
    ((java.util.List)(life4_6)).add(((java.lang.Object)(__sourceIntrinsic_0fbd59225012_invokedynamic3869_8(life7_46, life6_31))));
    }
    return life4_6;
}


private static java.util.List<com.google.common.base.Predicate<net.minecraft.entity.Entity>> f(java.util.Map<java.lang.String, java.lang.String> p0) {
int forwardValue3872_25_0;
    int forwardValue3872_45_0;
    int forwardValue3872_59_0;
    boolean spill3872_0;
    boolean spill3872_1;
    boolean spill3872_2;
    boolean spill3872_3;
    long life1_3;
    java.util.ArrayList life4_6;
    int life3_7;
    int life5_37;
    int life6_47;
    int life5_83;
    int life6_93;
    forward_join_76: {
    forward_join_59: {
    forward_join_54: {
    forward_join_45: {
    forward_join_42: {
    forward_join_25: {
    forward_join_20: {
    life1_3 = (moom.qU.e ^ 132235880774880L);
    spill3872_0 = moom.b7.b();
    life4_6 = com.google.common.collect.Lists.newArrayList();
    life3_7 = ((spill3872_0) ? 1 : 0);
    spill3872_1 = ((java.util.Map)(p0)).containsKey(((java.lang.Object)("rym")));
    if (!((life3_7 == 0))) {
        forwardValue3872_25_0 = ((spill3872_1) ? 1 : 0);
        break forward_join_25;
    }
    if (!((!spill3872_1))) {
        break forward_join_20;
    }
    spill3872_2 = ((java.util.Map)(p0)).containsKey(((java.lang.Object)("ry")));
    if (!((life3_7 == 0))) {
        forwardValue3872_45_0 = ((spill3872_2) ? 1 : 0);
        break forward_join_45;
    }
    if (!(spill3872_2)) {
        break forward_join_42;
    }
    }
    forwardValue3872_25_0 = moom.qU.a(((int)(moom.qU.a(((java.util.Map)(p0)), ((java.lang.String)("rym")), ((int)(0))))));
    }
    life5_37 = forwardValue3872_25_0;
    life6_47 = moom.qU.a(((int)(moom.qU.a(((java.util.Map)(p0)), ((java.lang.String)("ry")), ((int)(__sourceIntrinsic_68fc434e2277_invokedynamic3872_10(23685, (2557163569001978136L ^ life1_3))))))));
    ((java.util.List)(life4_6)).add(((java.lang.Object)(__sourceIntrinsic_68fc434e2277_invokedynamic3872_13(life5_37, life6_47))));
    }
    forwardValue3872_45_0 = ((((java.util.Map)(p0)).containsKey(((java.lang.Object)("rxm")))) ? 1 : 0);
    }
    if (!((life3_7 == 0))) {
        forwardValue3872_59_0 = forwardValue3872_45_0;
        break forward_join_59;
    }
    if (!((forwardValue3872_45_0 == 0))) {
        break forward_join_54;
    }
    spill3872_3 = ((java.util.Map)(p0)).containsKey(((java.lang.Object)("rx")));
    if (!((life3_7 == 0))) {
        forwardValue3872_59_0 = ((spill3872_3) ? 1 : 0);
        break forward_join_59;
    }
    if (!(spill3872_3)) {
        break forward_join_76;
    }
    }
    forwardValue3872_59_0 = moom.qU.a(((int)(moom.qU.a(((java.util.Map)(p0)), ((java.lang.String)("rxm")), ((int)(0))))));
    }
    life5_83 = forwardValue3872_59_0;
    life6_93 = moom.qU.a(((int)(moom.qU.a(((java.util.Map)(p0)), ((java.lang.String)("rx")), ((int)(__sourceIntrinsic_68fc434e2277_invokedynamic3872_21(293, (6130114687417713851L ^ life1_3))))))));
    ((java.util.List)(life4_6)).add(((java.lang.Object)(__sourceIntrinsic_68fc434e2277_invokedynamic3872_24(life5_83, life6_93))));
    }
    return life4_6;
}


private static java.util.List<com.google.common.base.Predicate<net.minecraft.entity.Entity>> d(java.util.Map<java.lang.String, java.lang.String> p0) {
java.util.Map forwardValue3870_16_0;
    int forwardValue3870_24_0;
    boolean spill3870_0;
    java.util.Map spill3870_1;
    int spill3870_2;
    long life1_3;
    java.util.ArrayList life4_5;
    java.util.Map life5_9;
    int life3_10;
    forward_join_25: {
    forward_join_24: {
    forward_join_16: {
    life1_3 = (moom.qU.e ^ 117553424654257L);
    life4_5 = com.google.common.collect.Lists.newArrayList();
    spill3870_0 = moom.b7.b();
    life5_9 = moom.qU.a__Map(((java.util.Map)(p0)));
    life3_10 = ((spill3870_0) ? 1 : 0);
    spill3870_1 = life5_9;
    if (!((life3_10 == 0))) {
        forwardValue3870_16_0 = spill3870_1;
        break forward_join_16;
    }
    if (!((spill3870_1 != null))) {
        break forward_join_25;
    }
    forwardValue3870_16_0 = life5_9;
    }
    spill3870_2 = ((java.util.Map)(forwardValue3870_16_0)).size();
    if (!((life3_10 == 0))) {
        forwardValue3870_24_0 = spill3870_2;
        break forward_join_24;
    }
    if (!((spill3870_2 > 0))) {
        break forward_join_25;
    }
    forwardValue3870_24_0 = ((((java.util.List)(life4_5)).add(((java.lang.Object)(__sourceIntrinsic_3fba42583c74_invokedynamic3870_6(life5_9))))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue3870_24_0);
    }
    return life4_5;
}


private static java.lang.String a(java.util.Map<java.lang.String, java.lang.String> p0, java.lang.String p1) {
return ((java.lang.String)(((java.util.Map)(p0)).get(((java.lang.Object)(p1)))));
}


public static java.util.Map<java.lang.String, java.lang.Integer> a__Map(java.util.Map<java.lang.String, java.lang.String> p0) {
int lexicalValue1279_29_0;
    java.lang.Object lexicalValue1279_45_0;
    boolean spill1279_0;
    boolean spill1279_1;
    java.lang.String spill1279_2;
    long life1_3;
    java.util.HashMap life4_6;
    int life3_7;
    java.util.Iterator life5_11;
    java.lang.String life6_18;
    lexical_join_48: {
    life1_3 = (moom.qU.e ^ 101234841511379L);
    spill1279_0 = moom.b7.b();
    life4_6 = com.google.common.collect.Maps.newHashMap();
    life3_7 = ((spill1279_0) ? 1 : 0);
    life5_11 = ((java.util.Set)(((java.util.Map)(p0)).keySet())).iterator();
    lexical_cycle_12: while (true) {
    lexical_join_46: {
    lexical_join_45: {
    lexical_join_29: {
    if (!(((java.util.Iterator)(life5_11)).hasNext())) {
        break lexical_join_48;
    }
    life6_18 = ((java.lang.String)(((java.util.Iterator)(life5_11)).next()));
    spill1279_1 = ((java.lang.String)(life6_18)).startsWith(((java.lang.String)("score_")));
    if (!((life3_7 == 0))) {
        lexicalValue1279_29_0 = ((spill1279_1) ? 1 : 0);
        break lexical_join_29;
    }
    if (!(spill1279_1)) {
        break lexical_join_46;
    }
    spill1279_2 = life6_18;
    if (!((life3_7 == 0))) {
        lexicalValue1279_45_0 = spill1279_2;
        break lexical_join_45;
    }
    lexicalValue1279_29_0 = ((java.lang.String)(spill1279_2)).length();
    }
    if (!((lexicalValue1279_29_0 > ((java.lang.String)("score_")).length()))) {
        break lexical_join_46;
    }
    lexicalValue1279_45_0 = ((java.util.Map)(life4_6)).put(((java.lang.Object)(((java.lang.String)(life6_18)).substring(((int)(((java.lang.String)("score_")).length()))))), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(moom.Dr.a(((java.lang.String)(((java.lang.String)(((java.util.Map)(p0)).get(((java.lang.Object)(life6_18))))))), ((int)(1)))))))));
    }
    recovery.source.CarrierOps.discard(lexicalValue1279_45_0);
    }
    if (!((life3_7 != 0))) { continue lexical_cycle_12; }
    break lexical_cycle_12;
    }
    }
    return life4_6;
}


private static moom.DT a__DT(java.util.Map<java.lang.String, java.lang.String> p0, moom.DT p1) {
return new moom.DT(moom.qU.a(((java.util.Map)(p0)), ((java.lang.String)("x")), ((int)(((moom.DT)(p1)).a()))), moom.qU.a(((java.util.Map)(p0)), ((java.lang.String)("y")), ((int)(((moom.DT)(p1)).b()))), moom.qU.a(((java.util.Map)(p0)), ((java.lang.String)("z")), ((int)(((moom.DT)(p1)).c()))));
}


private static boolean a__Boolean(java.util.Map<java.lang.String, java.lang.String> p0) {
int lexicalValue1278_25_0;
    int lexicalValue1278_29_0;
    boolean spill1278_0;
    boolean spill1278_1;
    long life1_3;
    java.util.Iterator life4_7;
    int life3_8;
    java.lang.String life5_15;
    lexical_join_29: {
    lexical_join_28: {
    life1_3 = (moom.qU.e ^ 135177588269933L);
    spill1278_0 = moom.b7.b();
    life4_7 = ((java.util.Set)(moom.qU.d)).iterator();
    life3_8 = ((spill1278_0) ? 1 : 0);
    lexical_cycle_9: while (true) {
    lexical_join_26: {
    lexical_join_25: {
    if (!(((java.util.Iterator)(life4_7)).hasNext())) {
        break lexical_join_28;
    }
    life5_15 = ((java.lang.String)(((java.util.Iterator)(life4_7)).next()));
    spill1278_1 = ((java.util.Map)(p0)).containsKey(((java.lang.Object)(life5_15)));
    if (!((life3_8 == 0))) {
        lexicalValue1278_29_0 = ((spill1278_1) ? 1 : 0);
        break lexical_join_29;
    }
    if (!((life3_8 == 0))) {
        lexicalValue1278_25_0 = ((spill1278_1) ? 1 : 0);
        break lexical_join_25;
    }
    if (!(spill1278_1)) {
        break lexical_join_26;
    }
    lexicalValue1278_25_0 = 1;
    }
    return ((lexicalValue1278_25_0) != 0);
    }
    if (!((life3_8 != 0))) { continue lexical_cycle_9; }
    break lexical_cycle_9;
    }
    }
    lexicalValue1278_29_0 = 0;
    }
    return ((lexicalValue1278_29_0) != 0);
}


private static int a(java.util.Map<java.lang.String, java.lang.String> p0, java.lang.String p1, int p2) {
int forwardValue3856_18_0;
    int forwardValue3856_20_0;
    boolean spill3856_0;
    long life3_3;
    int life5_5;
    forward_join_20: {
    forward_join_19: {
    forward_join_18: {
    life3_3 = (moom.qU.e ^ 125793330516320L);
    life5_5 = ((moom.b7.b()) ? 1 : 0);
    spill3856_0 = ((java.util.Map)(p0)).containsKey(((java.lang.Object)(p1)));
    if (!((life5_5 == 0))) {
        forwardValue3856_18_0 = ((spill3856_0) ? 1 : 0);
        break forward_join_18;
    }
    if (!(spill3856_0)) {
        break forward_join_19;
    }
    forwardValue3856_18_0 = moom.Dr.a(((java.lang.String)(((java.lang.String)(((java.util.Map)(p0)).get(((java.lang.Object)(p1))))))), ((int)(p2)));
    }
    forwardValue3856_20_0 = forwardValue3856_18_0;
    break forward_join_20;
    }
    forwardValue3856_20_0 = p2;
    }
    return forwardValue3856_20_0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 9572;
      if (g[var3] == null) {
         byte[] var4 = new byte[]{
            (byte)(p1 >>> 56),
            (byte)(p1 >>> 48),
            (byte)(p1 >>> 40),
            (byte)(p1 >>> 32),
            (byte)(p1 >>> 24),
            (byte)(p1 >>> 16),
            (byte)(p1 >>> 8),
            (byte)p1
         };
         long var5 = f[var3];
         byte[] var7 = new byte[]{
            (byte)(var5 >>> 56),
            (byte)(var5 >>> 48),
            (byte)(var5 >>> 40),
            (byte)(var5 >>> 32),
            (byte)(var5 >>> 24),
            (byte)(var5 >>> 16),
            (byte)(var5 >>> 8),
            (byte)var5
         };
         Long var8 = Thread.currentThread().getId();
         Object[] var9 = (Object[])h.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               h.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/qU", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         g[var3] = var15;
      }

      return g[var3];
}


private static java.util.Map<java.lang.String, java.lang.String> a(java.lang.String p0) {
java.lang.String forestValue493_46_0;
    int forestValue493_59_0;
    int forestValue493_63_0;
    java.util.regex.Pattern forestValue493_72_0;
    java.util.regex.Pattern forestValue493_75_0;
    java.lang.String forestValue493_75_1;
    java.util.HashMap forestValue493_94_0;
    boolean spill493_0;
    int spill493_1;
    java.lang.String spill493_2;
    int spill493_3;
    java.util.regex.Pattern spill493_4;
    java.util.HashMap spill493_5;
    long life1_3;
    java.util.HashMap life4_6;
    int life3_7;
    int life5_11;
    int life6_13;
    java.util.regex.Matcher life7_17;
    java.lang.String life8_22;
    java.util.regex.Matcher life7_81;
    forest_join_94: {
    forest_join_93: {
    forest_join_75: {
    forest_join_72: {
    forest_join_63: {
    forest_join_62: {
    life1_3 = (moom.qU.e ^ 76753102475577L);
    spill493_0 = moom.b7.b();
    life4_6 = com.google.common.collect.Maps.newHashMap();
    life3_7 = ((spill493_0) ? 1 : 0);
    if (!((p0 != null))) {
        break forest_join_93;
    }
    life5_11 = 0;
    life6_13 = -1;
    life7_17 = ((java.util.regex.Pattern)(moom.qU.b)).matcher(((java.lang.CharSequence)(p0)));
    forest_cycle_18: while (true) {
    forest_join_59: {
    forest_join_57: {
    forest_join_46: {
    forest_join_39: {
    forest_join_37: {
    forest_join_34: {
    forest_join_31: {
    forest_join_28: {
    if (!(((java.util.regex.Matcher)(life7_17)).find())) {
        break forest_join_62;
    }
    life8_22 = null;
    spill493_1 = (life5_11++);
    if (!((life3_7 == 0))) {
        forestValue493_63_0 = spill493_1;
        break forest_join_63;
    }
    switch (spill493_1) {
case 0:
{
        break forest_join_28;
    }
case 1:
{
        break forest_join_31;
    }
case 2:
{
        break forest_join_34;
    }
case 3:
{
        break forest_join_37;
    }
default:
{
        break forest_join_39;
    }
}
    }
    life8_22 = "x";
    break forest_join_39;
    }
    life8_22 = "y";
    break forest_join_39;
    }
    life8_22 = "z";
    break forest_join_39;
    }
    life8_22 = "r";
    }
    spill493_2 = life8_22;
    if (!((life3_7 == 0))) {
        forestValue493_46_0 = spill493_2;
        break forest_join_46;
    }
    if (!((spill493_2 != null))) {
        break forest_join_57;
    }
    forestValue493_46_0 = ((java.util.regex.Matcher)(life7_17)).group(((int)(1)));
    }
    spill493_3 = ((java.lang.String)(forestValue493_46_0)).length();
    if (!((life3_7 == 0))) {
        forestValue493_59_0 = spill493_3;
        break forest_join_59;
    }
    if (!((spill493_3 > 0))) {
        break forest_join_57;
    }
    ((java.util.Map)(life4_6)).put(((java.lang.Object)(life8_22)), ((java.lang.Object)(((java.util.regex.Matcher)(life7_17)).group(((int)(1))))));
    }
    forestValue493_59_0 = ((java.util.regex.Matcher)(life7_17)).end();
    }
    life6_13 = forestValue493_59_0;
    if (!((life3_7 != 0))) {
        continue forest_cycle_18;
    }
    break forest_cycle_18;
    }
    }
    forestValue493_63_0 = life6_13;
    }
    if (!((forestValue493_63_0 < ((java.lang.String)(p0)).length()))) {
        break forest_join_93;
    }
    spill493_4 = moom.qU.c;
    if (!((life6_13 == -1))) {
        forestValue493_72_0 = spill493_4;
        break forest_join_72;
    }
    forestValue493_75_0 = spill493_4;
    forestValue493_75_1 = p0;
    break forest_join_75;
    }
    forestValue493_75_0 = forestValue493_72_0;
    forestValue493_75_1 = ((java.lang.String)(p0)).substring(((int)(life6_13)));
    }
    life7_81 = ((java.util.regex.Pattern)(forestValue493_75_0)).matcher(((java.lang.CharSequence)(forestValue493_75_1)));
    forest_cycle_77: while (true) {
    if (!(((java.util.regex.Matcher)(life7_81)).find())) {
        break forest_join_93;
    }
    spill493_5 = life4_6;
    if (!((life3_7 == 0))) {
        forestValue493_94_0 = spill493_5;
        break forest_join_94;
    }
    ((java.util.Map)(spill493_5)).put(((java.lang.Object)(((java.util.regex.Matcher)(life7_81)).group(((int)(1))))), ((java.lang.Object)(((java.util.regex.Matcher)(life7_81)).group(((int)(2))))));
    if (!((life3_7 != 0))) {
        continue forest_cycle_77;
    }
    break forest_cycle_77;
    }
    }
    forestValue493_94_0 = life4_6;
    }
    return forestValue493_94_0;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.qU.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public static boolean a__Boolean(java.lang.String p0) {
java.util.regex.Matcher forwardValue3862_18_0;
    int forwardValue3862_35_0;
    int forwardValue3862_39_0;
    int forwardValue3862_41_0;
    int forwardValue3862_51_0;
    int forwardValue3862_53_0;
    boolean spill3862_0;
    java.util.regex.Matcher spill3862_1;
    boolean spill3862_2;
    int spill3862_3;
    long life1_3;
    java.util.regex.Matcher life4_8;
    int life3_9;
    java.util.Map life5_26;
    java.lang.String life6_30;
    int life7_55;
    forward_join_53: {
    forward_join_52: {
    forward_join_51: {
    forward_join_41: {
    forward_join_40: {
    forward_join_39: {
    forward_join_35: {
    forward_join_18: {
    forward_join_17: {
    life1_3 = (moom.qU.e ^ 118579134142838L);
    spill3862_0 = moom.b7.b();
    life4_8 = ((java.util.regex.Pattern)(moom.qU.a)).matcher(((java.lang.CharSequence)(p0)));
    life3_9 = ((spill3862_0) ? 1 : 0);
    spill3862_1 = life4_8;
    if (!((life3_9 == 0))) {
        forwardValue3862_18_0 = spill3862_1;
        break forward_join_18;
    }
    if (!((!((java.util.regex.Matcher)(spill3862_1)).matches()))) {
        break forward_join_17;
    }
    return ((0) != 0);
    }
    forwardValue3862_18_0 = life4_8;
    }
    life5_26 = moom.qU.a(((java.lang.String)(((java.util.regex.Matcher)(forwardValue3862_18_0)).group(((int)(2))))));
    life6_30 = ((java.util.regex.Matcher)(life4_8)).group(((int)(1)));
    spill3862_2 = ((java.lang.String)("a")).equals(((java.lang.Object)(life6_30)));
    if (!((life3_9 == 0))) {
        forwardValue3862_35_0 = ((spill3862_2) ? 1 : 0);
        break forward_join_35;
    }
    if (!((!spill3862_2))) {
        break forward_join_40;
    }
    forwardValue3862_35_0 = ((((java.lang.String)("e")).equals(((java.lang.Object)(life6_30)))) ? 1 : 0);
    }
    if (!((life3_9 == 0))) {
        forwardValue3862_39_0 = forwardValue3862_35_0;
        break forward_join_39;
    }
    if (!((forwardValue3862_35_0 == 0))) {
        break forward_join_40;
    }
    forwardValue3862_39_0 = 1;
    }
    forwardValue3862_41_0 = forwardValue3862_39_0;
    break forward_join_41;
    }
    forwardValue3862_41_0 = 0;
    }
    life7_55 = forwardValue3862_41_0;
    spill3862_3 = moom.qU.a(((java.util.Map)(life5_26)), ((java.lang.String)("c")), ((int)(life7_55)));
    if (!((life3_9 == 0))) {
        forwardValue3862_51_0 = spill3862_3;
        break forward_join_51;
    }
    if (!((spill3862_3 != 1))) {
        break forward_join_52;
    }
    forwardValue3862_51_0 = 1;
    }
    forwardValue3862_53_0 = forwardValue3862_51_0;
    break forward_join_53;
    }
    forwardValue3862_53_0 = 0;
    }
    return ((forwardValue3862_53_0) != 0);
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral8768_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/qU"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static java.util.List<net.minecraft.world.World> a(net.minecraft.command.ICommandSender p0, java.util.Map<java.lang.String, java.lang.String> p1) {
int forwardValue3861_24_0;
    boolean spill3861_0;
    boolean spill3861_1;
    long life2_3;
    java.util.ArrayList life5_6;
    int life4_7;
    forward_join_25: {
    forward_join_24: {
    forward_join_20: {
    life2_3 = (moom.qU.e ^ 126594202492711L);
    spill3861_0 = moom.b7.c();
    life5_6 = com.google.common.collect.Lists.newArrayList();
    life4_7 = ((spill3861_0) ? 1 : 0);
    spill3861_1 = moom.qU.a__Boolean(((java.util.Map)(p1)));
    if (!((life4_7 != 0))) {
        forwardValue3861_24_0 = ((spill3861_1) ? 1 : 0);
        break forward_join_24;
    }
    if (!(spill3861_1)) {
        break forward_join_20;
    }
    ((java.util.List)(life5_6)).add(((java.lang.Object)(((net.minecraft.command.ICommandSender)(p0)).a__Eu())));
    if (!((life4_7 == 0))) {
        break forward_join_25;
    }
    }
    forwardValue3861_24_0 = ((java.util.Collections.addAll(((java.util.Collection)(life5_6)), ((java.lang.Object[])(((moom.Bl)(moom.Bl.a__Bl())).n)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue3861_24_0);
    }
    return life5_6;
}


public static net.minecraft.entity.player.EntityPlayerMP a__tr(net.minecraft.command.ICommandSender p0, java.lang.String p1) {
return ((net.minecraft.entity.player.EntityPlayerMP)(moom.qU.a__r3(((net.minecraft.command.ICommandSender)(p0)), ((java.lang.String)(p1)), ((java.lang.Class)(net.minecraft.entity.player.EntityPlayerMP.class)))));
}


private static <T extends net.minecraft.entity.Entity> boolean a__Boolean(net.minecraft.command.ICommandSender p0, java.util.Map<java.lang.String, java.lang.String> p1) {
java.lang.String forwardValue3864_15_0;
    java.lang.String forwardValue3864_23_0;
    java.lang.String forwardValue3864_25_0;
    java.lang.String forwardValue3864_31_0;
    int forwardValue3864_57_0;
    boolean spill3864_0;
    java.lang.String spill3864_1;
    java.lang.String spill3864_2;
    boolean spill3864_3;
    long life2_3;
    java.lang.String life5_8;
    int life4_9;
    java.lang.String life5_34;
    moom.CN life6_60;
    forward_join_57: {
    forward_join_56: {
    forward_join_31: {
    forward_join_25: {
    forward_join_24: {
    forward_join_23: {
    forward_join_15: {
    life2_3 = (moom.qU.e ^ 121982632406889L);
    spill3864_0 = moom.b7.b();
    life5_8 = moom.qU.a(((java.util.Map)(p1)), ((java.lang.String)("type")));
    life4_9 = ((spill3864_0) ? 1 : 0);
    spill3864_1 = life5_8;
    if (!((life4_9 == 0))) {
        forwardValue3864_15_0 = spill3864_1;
        break forward_join_15;
    }
    if (!((spill3864_1 != null))) {
        break forward_join_24;
    }
    forwardValue3864_15_0 = life5_8;
    }
    if (!((life4_9 == 0))) {
        forwardValue3864_23_0 = forwardValue3864_15_0;
        break forward_join_23;
    }
    if (!(((java.lang.String)(forwardValue3864_15_0)).startsWith(((java.lang.String)("!"))))) {
        break forward_join_24;
    }
    forwardValue3864_23_0 = ((java.lang.String)(life5_8)).substring(((int)(1)));
    }
    forwardValue3864_25_0 = forwardValue3864_23_0;
    break forward_join_25;
    }
    forwardValue3864_25_0 = life5_8;
    }
    life5_34 = forwardValue3864_25_0;
    spill3864_2 = life5_34;
    if (!((life4_9 == 0))) {
        forwardValue3864_31_0 = spill3864_2;
        break forward_join_31;
    }
    if (!((spill3864_2 != null))) {
        break forward_join_56;
    }
    forwardValue3864_31_0 = life5_34;
    }
    spill3864_3 = net.minecraft.entity.EntityList.a__Boolean(((java.lang.String)(forwardValue3864_31_0)));
    if (!((life4_9 == 0))) {
        forwardValue3864_57_0 = ((spill3864_3) ? 1 : 0);
        break forward_join_57;
    }
    if (!((!spill3864_3))) {
        break forward_join_56;
    }
    life6_60 = new moom.CN("commands.generic.entity.invalidType", new java.lang.Object[] {life5_34});
    ((moom.CO)(((moom.CN)(life6_60)).a__CO())).a(((net.minecraft.util.EnumChatFormatting)(net.minecraft.util.EnumChatFormatting.RED)));
    ((net.minecraft.command.ICommandSender)(p0)).a(((net.minecraft.util.IChatComponent)(life6_60)));
    return ((0) != 0);
    }
    forwardValue3864_57_0 = 1;
    }
    return ((forwardValue3864_57_0) != 0);
}


private static java.util.List<com.google.common.base.Predicate<net.minecraft.entity.Entity>> a__List(java.util.Map<java.lang.String, java.lang.String> p0, java.lang.String p1) {
java.lang.String forwardValue3865_17_0;
    int forwardValue3865_23_0;
    int forwardValue3865_25_0;
    int forwardValue3865_37_0;
    int forwardValue3865_41_0;
    int forwardValue3865_43_0;
    java.lang.String forwardValue3865_51_0;
    int forwardValue3865_55_0;
    java.lang.String forwardValue3865_61_0;
    int forwardValue3865_71_0;
    int forwardValue3865_77_0;
    java.lang.String forwardValue3865_81_0;
    boolean spill3865_0;
    java.lang.String spill3865_1;
    boolean spill3865_2;
    int spill3865_3;
    java.lang.String spill3865_4;
    java.lang.String spill3865_5;
    int spill3865_6;
    long life2_3;
    java.util.ArrayList life5_6;
    int life4_7;
    java.lang.String life6_11;
    int life7_31;
    int life8_55;
    int life9_75;
    java.lang.String life10_122;
    forward_join_88: {
    forward_join_81: {
    forward_join_80: {
    forward_join_77: {
    forward_join_71: {
    forward_join_66: {
    forward_join_61: {
    forward_join_55: {
    forward_join_54: {
    forward_join_51: {
    forward_join_43: {
    forward_join_42: {
    forward_join_41: {
    forward_join_37: {
    forward_join_34: {
    forward_join_25: {
    forward_join_24: {
    forward_join_23: {
    forward_join_17: {
    life2_3 = (moom.qU.e ^ 73550616617417L);
    spill3865_0 = moom.b7.b();
    life5_6 = com.google.common.collect.Lists.newArrayList();
    life4_7 = ((spill3865_0) ? 1 : 0);
    life6_11 = moom.qU.a(((java.util.Map)(p0)), ((java.lang.String)("type")));
    spill3865_1 = life6_11;
    if (!((life4_7 == 0))) {
        forwardValue3865_17_0 = spill3865_1;
        break forward_join_17;
    }
    if (!((spill3865_1 != null))) {
        break forward_join_24;
    }
    forwardValue3865_17_0 = life6_11;
    }
    spill3865_2 = ((java.lang.String)(forwardValue3865_17_0)).startsWith(((java.lang.String)("!")));
    if (!((life4_7 == 0))) {
        forwardValue3865_23_0 = ((spill3865_2) ? 1 : 0);
        break forward_join_23;
    }
    if (!(spill3865_2)) {
        break forward_join_24;
    }
    forwardValue3865_23_0 = 1;
    }
    forwardValue3865_25_0 = forwardValue3865_23_0;
    break forward_join_25;
    }
    forwardValue3865_25_0 = 0;
    }
    life7_31 = forwardValue3865_25_0;
    spill3865_3 = life7_31;
    if (!((life4_7 == 0))) {
        forwardValue3865_37_0 = spill3865_3;
        break forward_join_37;
    }
    if (!((spill3865_3 != 0))) {
        break forward_join_34;
    }
    life6_11 = ((java.lang.String)(life6_11)).substring(((int)(1)));
    }
    forwardValue3865_37_0 = ((((java.lang.String)(p1)).equals(((java.lang.Object)("e")))) ? 1 : 0);
    }
    if (!((life4_7 == 0))) {
        forwardValue3865_41_0 = forwardValue3865_37_0;
        break forward_join_41;
    }
    if (!((forwardValue3865_37_0 == 0))) {
        break forward_join_42;
    }
    forwardValue3865_41_0 = 1;
    }
    forwardValue3865_43_0 = forwardValue3865_41_0;
    break forward_join_43;
    }
    forwardValue3865_43_0 = 0;
    }
    life8_55 = forwardValue3865_43_0;
    spill3865_4 = p1;
    if (!((life4_7 == 0))) {
        forwardValue3865_51_0 = spill3865_4;
        break forward_join_51;
    }
    if (!(((java.lang.String)(spill3865_4)).equals(((java.lang.Object)("r"))))) {
        break forward_join_54;
    }
    forwardValue3865_51_0 = life6_11;
    }
    if (!((forwardValue3865_51_0 != null))) {
        break forward_join_54;
    }
    forwardValue3865_55_0 = 1;
    break forward_join_55;
    }
    forwardValue3865_55_0 = 0;
    }
    life9_75 = forwardValue3865_55_0;
    spill3865_5 = life6_11;
    if (!((life4_7 == 0))) {
        forwardValue3865_61_0 = spill3865_5;
        break forward_join_61;
    }
    if (!((spill3865_5 != null))) {
        break forward_join_66;
    }
    forwardValue3865_61_0 = p1;
    }
    if (!((life4_7 == 0))) {
        forwardValue3865_81_0 = forwardValue3865_61_0;
        break forward_join_81;
    }
    if (!((!((java.lang.String)(forwardValue3865_61_0)).equals(((java.lang.Object)("e")))))) {
        break forward_join_80;
    }
    }
    spill3865_6 = life9_75;
    if (!((life4_7 == 0))) {
        forwardValue3865_71_0 = spill3865_6;
        break forward_join_71;
    }
    if (!((spill3865_6 == 0))) {
        break forward_join_80;
    }
    forwardValue3865_71_0 = life8_55;
    }
    if (!((life4_7 == 0))) {
        forwardValue3865_77_0 = forwardValue3865_71_0;
        break forward_join_77;
    }
    if (!((forwardValue3865_71_0 != 0))) {
        break forward_join_88;
    }
    forwardValue3865_77_0 = ((((java.util.List)(life5_6)).add(((java.lang.Object)(__sourceIntrinsic_91730bedfb75_invokedynamic3865_12())))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue3865_77_0);
    if (!((life4_7 != 0))) {
        break forward_join_88;
    }
    }
    forwardValue3865_81_0 = life6_11;
    }
    life10_122 = forwardValue3865_81_0;
    ((java.util.List)(life5_6)).add(((java.lang.Object)(__sourceIntrinsic_91730bedfb75_invokedynamic3865_16(life10_122, life7_31))));
    }
    return life5_6;
}


public static <T extends net.minecraft.entity.Entity> java.util.List<T> a(net.minecraft.command.ICommandSender p0, java.lang.String p1, java.lang.Class<? extends T> p2) {
int lexicalValue1277_19_0;
    boolean spill1277_0;
    boolean spill1277_1;
    long life3_3;
    java.util.regex.Matcher life6_8;
    int life5_9;
    java.util.Map life7_30;
    java.lang.String life8_42;
    moom.DT life9_47;
    java.util.List life10_51;
    java.util.ArrayList life11_53;
    java.util.Iterator life12_56;
    net.minecraft.world.World life13_63;
    java.util.ArrayList life14_67;
    lexical_join_122: {
    lexical_join_114: {
    lexical_join_31: {
    lexical_join_19: {
    life3_3 = (moom.qU.e ^ 49229527480589L);
    spill1277_0 = moom.b7.b();
    life6_8 = ((java.util.regex.Pattern)(moom.qU.a)).matcher(((java.lang.CharSequence)(p1)));
    life5_9 = ((spill1277_0) ? 1 : 0);
    spill1277_1 = ((java.util.regex.Matcher)(life6_8)).matches();
    if (!((life5_9 == 0))) {
        lexicalValue1277_19_0 = ((spill1277_1) ? 1 : 0);
        break lexical_join_19;
    }
    if (!(spill1277_1)) {
        break lexical_join_122;
    }
    lexicalValue1277_19_0 = ((((net.minecraft.command.ICommandSender)(p0)).a(((int)(1)), ((java.lang.String)("@")))) ? 1 : 0);
    }
    if (!((lexicalValue1277_19_0 != 0))) {
        break lexical_join_122;
    }
    life7_30 = moom.qU.a(((java.lang.String)(((java.util.regex.Matcher)(life6_8)).group(((int)(2))))));
    if (!((!moom.qU.a__Boolean(((net.minecraft.command.ICommandSender)(p0)), ((java.util.Map)(life7_30)))))) {
        break lexical_join_31;
    }
    return java.util.Collections.emptyList();
    }
    life8_42 = ((java.util.regex.Matcher)(life6_8)).group(((int)(1)));
    life9_47 = moom.qU.a__DT(((java.util.Map)(life7_30)), ((moom.DT)(((net.minecraft.command.ICommandSender)(p0)).a__DT())));
    life10_51 = moom.qU.a(((net.minecraft.command.ICommandSender)(p0)), ((java.util.Map)(life7_30)));
    life11_53 = com.google.common.collect.Lists.newArrayList();
    life12_56 = ((java.util.List)(life10_51)).iterator();
    lexical_cycle_49: while (true) {
    lexical_join_112: {
    if (!(((java.util.Iterator)(life12_56)).hasNext())) {
        break lexical_join_114;
    }
    life13_63 = ((net.minecraft.world.World)(((java.util.Iterator)(life12_56)).next()));
    if (!((life13_63 != null))) {
        break lexical_join_112;
    }
    life14_67 = com.google.common.collect.Lists.newArrayList();
    ((java.util.List)(life14_67)).addAll(((java.util.Collection)(moom.qU.a__List(((java.util.Map)(life7_30)), ((java.lang.String)(life8_42))))));
    ((java.util.List)(life14_67)).addAll(((java.util.Collection)(moom.qU.a(((java.util.Map)(life7_30))))));
    ((java.util.List)(life14_67)).addAll(((java.util.Collection)(moom.qU.b(((java.util.Map)(life7_30))))));
    ((java.util.List)(life14_67)).addAll(((java.util.Collection)(moom.qU.c(((java.util.Map)(life7_30))))));
    ((java.util.List)(life14_67)).addAll(((java.util.Collection)(moom.qU.d(((java.util.Map)(life7_30))))));
    ((java.util.List)(life14_67)).addAll(((java.util.Collection)(moom.qU.e(((java.util.Map)(life7_30))))));
    ((java.util.List)(life14_67)).addAll(((java.util.Collection)(moom.qU.a(((java.util.Map)(life7_30)), ((moom.DT)(life9_47))))));
    ((java.util.List)(life14_67)).addAll(((java.util.Collection)(moom.qU.f(((java.util.Map)(life7_30))))));
    ((java.util.List)(life11_53)).addAll(((java.util.Collection)(moom.qU.a(((java.util.Map)(life7_30)), ((java.lang.Class)(p2)), ((java.util.List)(life14_67)), ((java.lang.String)(life8_42)), ((net.minecraft.world.World)(life13_63)), ((moom.DT)(life9_47))))));
    }
    if (!((life5_9 != 0))) { continue lexical_cycle_49; }
    break lexical_cycle_49;
    }
    }
    return moom.qU.a(((java.util.List)(life11_53)), ((java.util.Map)(life7_30)), ((net.minecraft.command.ICommandSender)(p0)), ((java.lang.Class)(p2)), ((java.lang.String)(life8_42)), ((moom.DT)(life9_47)));
    }
    return java.util.Collections.emptyList();
}


public static net.minecraft.util.IChatComponent a(net.minecraft.command.ICommandSender p0, java.lang.String p1) {
java.util.ArrayList lexicalValue1276_38_0;
    boolean spill1276_0;
    java.util.ArrayList spill1276_1;
    long life2_3;
    java.util.List life5_9;
    int life4_10;
    java.util.ArrayList life6_19;
    java.util.Iterator life7_22;
    net.minecraft.entity.Entity life8_29;
    lexical_join_38: {
    lexical_join_37: {
    lexical_join_16: {
    life2_3 = (moom.qU.e ^ 125388683389452L);
    spill1276_0 = moom.b7.c();
    life5_9 = moom.qU.a(((net.minecraft.command.ICommandSender)(p0)), ((java.lang.String)(p1)), ((java.lang.Class)(net.minecraft.entity.Entity.class)));
    life4_10 = ((spill1276_0) ? 1 : 0);
    if (!(((java.util.List)(life5_9)).isEmpty())) {
        break lexical_join_16;
    }
    return null;
    }
    life6_19 = com.google.common.collect.Lists.newArrayList();
    life7_22 = ((java.util.List)(life5_9)).iterator();
    lexical_cycle_21: while (true) {
    if (!(((java.util.Iterator)(life7_22)).hasNext())) {
        break lexical_join_37;
    }
    life8_29 = ((net.minecraft.entity.Entity)(((java.util.Iterator)(life7_22)).next()));
    spill1276_1 = life6_19;
    if (!((life4_10 != 0))) {
        lexicalValue1276_38_0 = spill1276_1;
        break lexical_join_38;
    }
    ((java.util.List)(spill1276_1)).add(((java.lang.Object)(((net.minecraft.entity.Entity)(life8_29)).a__C5())));
    if (!((life4_10 == 0))) { continue lexical_cycle_21; }
    break lexical_cycle_21;
    }
    }
    lexicalValue1276_38_0 = life6_19;
    }
    return __sourceExactCall_d76f098e050eba(((java.util.List)(lexicalValue1276_38_0)));
}


public static <T extends net.minecraft.entity.Entity> T a__r3(net.minecraft.command.ICommandSender p0, java.lang.String p1, java.lang.Class<? extends T> p2) {
java.lang.Object forwardValue3867_20_0;
    net.minecraft.entity.Entity forwardValue3867_23_0;
    boolean spill3867_0;
    java.util.List spill3867_1;
    long life3_3;
    java.util.List life6_9;
    int life5_10;
    forward_join_23: {
    forward_join_22: {
    forward_join_20: {
    life3_3 = (moom.qU.e ^ 87322703544318L);
    spill3867_0 = moom.b7.c();
    life6_9 = moom.qU.a(((net.minecraft.command.ICommandSender)(p0)), ((java.lang.String)(p1)), ((java.lang.Class)(p2)));
    life5_10 = ((spill3867_0) ? 1 : 0);
    spill3867_1 = life6_9;
    if (!((life5_10 != 0))) {
        forwardValue3867_20_0 = spill3867_1;
        break forward_join_20;
    }
    if (!((((java.util.List)(spill3867_1)).size() == 1))) {
        break forward_join_22;
    }
    forwardValue3867_20_0 = ((java.util.List)(life6_9)).get(((int)(0)));
    }
    forwardValue3867_23_0 = ((net.minecraft.entity.Entity)(forwardValue3867_20_0));
    break forward_join_23;
    }
    forwardValue3867_23_0 = null;
    }
    return ((T)(forwardValue3867_23_0));
}


private static moom.CA a(moom.DT p0, int p1, int p2, int p3) {
int forwardValue3858_11_0;
    int forwardValue3858_13_0;
    int forwardValue3858_19_0;
    int forwardValue3858_21_0;
    int forwardValue3858_27_0;
    int forwardValue3858_29_0;
    int forwardValue3858_37_0;
    int forwardValue3858_37_1;
    int forwardValue3858_38_0;
    int forwardValue3858_39_0;
    int forwardValue3858_39_1;
    int forwardValue3858_48_0;
    int forwardValue3858_48_1;
    int forwardValue3858_49_0;
    int forwardValue3858_50_0;
    int forwardValue3858_50_1;
    int forwardValue3858_59_0;
    int forwardValue3858_59_1;
    int forwardValue3858_60_0;
    int forwardValue3858_61_0;
    int forwardValue3858_61_1;
    int forwardValue3858_70_0;
    int forwardValue3858_70_1;
    int forwardValue3858_71_0;
    int forwardValue3858_72_0;
    int forwardValue3858_72_1;
    int forwardValue3858_83_0;
    int forwardValue3858_83_1;
    int forwardValue3858_84_0;
    int forwardValue3858_85_0;
    int forwardValue3858_85_1;
    int forwardValue3858_96_0;
    int forwardValue3858_96_1;
    int forwardValue3858_97_0;
    int forwardValue3858_98_0;
    int forwardValue3858_98_1;
    int spill3858_0;
    int spill3858_1;
    int spill3858_2;
    int spill3858_3;
    int spill3858_4;
    int spill3858_5;
    int spill3858_6;
    int spill3858_7;
    int spill3858_8;
    int spill3858_9;
    int spill3858_10;
    int spill3858_11;
    int spill3858_12;
    int spill3858_13;
    int spill3858_14;
    long life4_3;
    int life6_5;
    int life7_16;
    int life8_27;
    int life9_38;
    int life10_52;
    int life11_66;
    int life12_80;
    int life13_96;
    int life14_112;
    int life15_128;
    forward_join_98: {
    forward_join_97: {
    forward_join_96: {
    forward_join_85: {
    forward_join_84: {
    forward_join_83: {
    forward_join_72: {
    forward_join_71: {
    forward_join_70: {
    forward_join_61: {
    forward_join_60: {
    forward_join_59: {
    forward_join_50: {
    forward_join_49: {
    forward_join_48: {
    forward_join_39: {
    forward_join_38: {
    forward_join_37: {
    forward_join_29: {
    forward_join_28: {
    forward_join_27: {
    forward_join_21: {
    forward_join_20: {
    forward_join_19: {
    forward_join_13: {
    forward_join_12: {
    forward_join_11: {
    life4_3 = (moom.qU.e ^ 67652423078057L);
    life6_5 = ((moom.b7.c()) ? 1 : 0);
    spill3858_0 = p1;
    if (!((life6_5 != 0))) {
        forwardValue3858_11_0 = spill3858_0;
        break forward_join_11;
    }
    if (!((spill3858_0 < 0))) {
        break forward_join_12;
    }
    forwardValue3858_11_0 = 1;
    }
    forwardValue3858_13_0 = forwardValue3858_11_0;
    break forward_join_13;
    }
    forwardValue3858_13_0 = 0;
    }
    life7_16 = forwardValue3858_13_0;
    spill3858_1 = p2;
    if (!((life6_5 != 0))) {
        forwardValue3858_19_0 = spill3858_1;
        break forward_join_19;
    }
    if (!((spill3858_1 < 0))) {
        break forward_join_20;
    }
    forwardValue3858_19_0 = 1;
    }
    forwardValue3858_21_0 = forwardValue3858_19_0;
    break forward_join_21;
    }
    forwardValue3858_21_0 = 0;
    }
    life8_27 = forwardValue3858_21_0;
    spill3858_2 = p3;
    if (!((life6_5 != 0))) {
        forwardValue3858_27_0 = spill3858_2;
        break forward_join_27;
    }
    if (!((spill3858_2 < 0))) {
        break forward_join_28;
    }
    forwardValue3858_27_0 = 1;
    }
    forwardValue3858_29_0 = forwardValue3858_27_0;
    break forward_join_29;
    }
    forwardValue3858_29_0 = 0;
    }
    life9_38 = forwardValue3858_29_0;
    spill3858_3 = ((moom.DT)(p0)).a();
    spill3858_4 = life7_16;
    if (!((life6_5 != 0))) {
        forwardValue3858_37_0 = spill3858_3;
        forwardValue3858_37_1 = spill3858_4;
        break forward_join_37;
    }
    if (!((spill3858_4 != 0))) {
        forwardValue3858_38_0 = spill3858_3;
        break forward_join_38;
    }
    forwardValue3858_37_0 = spill3858_3;
    forwardValue3858_37_1 = p1;
    }
    forwardValue3858_39_0 = forwardValue3858_37_0;
    forwardValue3858_39_1 = forwardValue3858_37_1;
    break forward_join_39;
    }
    forwardValue3858_39_0 = forwardValue3858_38_0;
    forwardValue3858_39_1 = 0;
    }
    life10_52 = (forwardValue3858_39_0 + forwardValue3858_39_1);
    spill3858_5 = ((moom.DT)(p0)).b();
    spill3858_6 = life8_27;
    if (!((life6_5 != 0))) {
        forwardValue3858_48_0 = spill3858_5;
        forwardValue3858_48_1 = spill3858_6;
        break forward_join_48;
    }
    if (!((spill3858_6 != 0))) {
        forwardValue3858_49_0 = spill3858_5;
        break forward_join_49;
    }
    forwardValue3858_48_0 = spill3858_5;
    forwardValue3858_48_1 = p2;
    }
    forwardValue3858_50_0 = forwardValue3858_48_0;
    forwardValue3858_50_1 = forwardValue3858_48_1;
    break forward_join_50;
    }
    forwardValue3858_50_0 = forwardValue3858_49_0;
    forwardValue3858_50_1 = 0;
    }
    life11_66 = (forwardValue3858_50_0 + forwardValue3858_50_1);
    spill3858_7 = ((moom.DT)(p0)).c();
    spill3858_8 = life9_38;
    if (!((life6_5 != 0))) {
        forwardValue3858_59_0 = spill3858_7;
        forwardValue3858_59_1 = spill3858_8;
        break forward_join_59;
    }
    if (!((spill3858_8 != 0))) {
        forwardValue3858_60_0 = spill3858_7;
        break forward_join_60;
    }
    forwardValue3858_59_0 = spill3858_7;
    forwardValue3858_59_1 = p3;
    }
    forwardValue3858_61_0 = forwardValue3858_59_0;
    forwardValue3858_61_1 = forwardValue3858_59_1;
    break forward_join_61;
    }
    forwardValue3858_61_0 = forwardValue3858_60_0;
    forwardValue3858_61_1 = 0;
    }
    life12_80 = (forwardValue3858_61_0 + forwardValue3858_61_1);
    spill3858_9 = ((moom.DT)(p0)).a();
    spill3858_10 = life7_16;
    if (!((life6_5 != 0))) {
        forwardValue3858_70_0 = spill3858_9;
        forwardValue3858_70_1 = spill3858_10;
        break forward_join_70;
    }
    if (!((spill3858_10 != 0))) {
        forwardValue3858_71_0 = spill3858_9;
        break forward_join_71;
    }
    forwardValue3858_70_0 = spill3858_9;
    forwardValue3858_70_1 = 0;
    }
    forwardValue3858_72_0 = forwardValue3858_70_0;
    forwardValue3858_72_1 = forwardValue3858_70_1;
    break forward_join_72;
    }
    forwardValue3858_72_0 = forwardValue3858_71_0;
    forwardValue3858_72_1 = p1;
    }
    life13_96 = ((forwardValue3858_72_0 + forwardValue3858_72_1) + 1);
    spill3858_11 = ((moom.DT)(p0)).b();
    spill3858_12 = life8_27;
    if (!((life6_5 != 0))) {
        forwardValue3858_83_0 = spill3858_11;
        forwardValue3858_83_1 = spill3858_12;
        break forward_join_83;
    }
    if (!((spill3858_12 != 0))) {
        forwardValue3858_84_0 = spill3858_11;
        break forward_join_84;
    }
    forwardValue3858_83_0 = spill3858_11;
    forwardValue3858_83_1 = 0;
    }
    forwardValue3858_85_0 = forwardValue3858_83_0;
    forwardValue3858_85_1 = forwardValue3858_83_1;
    break forward_join_85;
    }
    forwardValue3858_85_0 = forwardValue3858_84_0;
    forwardValue3858_85_1 = p2;
    }
    life14_112 = ((forwardValue3858_85_0 + forwardValue3858_85_1) + 1);
    spill3858_13 = ((moom.DT)(p0)).c();
    spill3858_14 = life9_38;
    if (!((life6_5 != 0))) {
        forwardValue3858_96_0 = spill3858_13;
        forwardValue3858_96_1 = spill3858_14;
        break forward_join_96;
    }
    if (!((spill3858_14 != 0))) {
        forwardValue3858_97_0 = spill3858_13;
        break forward_join_97;
    }
    forwardValue3858_96_0 = spill3858_13;
    forwardValue3858_96_1 = 0;
    }
    forwardValue3858_98_0 = forwardValue3858_96_0;
    forwardValue3858_98_1 = forwardValue3858_96_1;
    break forward_join_98;
    }
    forwardValue3858_98_0 = forwardValue3858_97_0;
    forwardValue3858_98_1 = p3;
    }
    life15_128 = ((forwardValue3858_98_0 + forwardValue3858_98_1) + 1);
    return new moom.CA(((double) life10_52), ((double) life11_66), ((double) life12_80), ((double) life13_96), ((double) life14_112), ((double) life15_128));
}


private static <T extends net.minecraft.entity.Entity> java.util.List<T> a(java.util.List<T> p0, java.util.Map<java.lang.String, java.lang.String> p1, net.minecraft.command.ICommandSender p2, java.lang.Class<? extends T> p3, java.lang.String p4, moom.DT p5) {
java.util.Map forestValue17_17_0;
    java.lang.String forestValue17_17_1;
    int forestValue17_17_2;
    java.util.Map forestValue17_21_0;
    java.lang.String forestValue17_21_1;
    int forestValue17_21_2;
    java.util.Map forestValue17_22_0;
    java.lang.String forestValue17_22_1;
    java.util.Map forestValue17_23_0;
    java.lang.String forestValue17_23_1;
    int forestValue17_23_2;
    int forestValue17_34_0;
    int forestValue17_40_0;
    int forestValue17_46_0;
    int forestValue17_95_0;
    int forestValue17_99_0;
    java.util.Map spill17_0;
    java.lang.String spill17_1;
    boolean spill17_2;
    boolean spill17_3;
    boolean spill17_4;
    int spill17_5;
    boolean spill17_6;
    boolean spill17_7;
    net.minecraft.entity.Entity[] spill17_8;
    long life6_3;
    int life8_5;
    int life9_33;
    net.minecraft.entity.Entity life10_86;
    forest_join_111: {
    forest_join_102: {
    forest_join_99: {
    forest_join_95: {
    forest_join_94: {
    forest_join_57: {
    forest_join_51: {
    forest_join_46: {
    forest_join_40: {
    forest_join_34: {
    forest_join_23: {
    forest_join_22: {
    forest_join_21: {
    forest_join_17: {
    life6_3 = (moom.qU.e ^ 60232598581668L);
    life8_5 = ((moom.b7.c()) ? 1 : 0);
    spill17_0 = p1;
    spill17_1 = "c";
    spill17_2 = ((java.lang.String)(p4)).equals(((java.lang.Object)("a")));
    if (!((life8_5 != 0))) {
        forestValue17_17_0 = spill17_0;
        forestValue17_17_1 = spill17_1;
        forestValue17_17_2 = ((spill17_2) ? 1 : 0);
        break forest_join_17;
    }
    if (!((!spill17_2))) {
        forestValue17_22_0 = spill17_0;
        forestValue17_22_1 = spill17_1;
        break forest_join_22;
    }
    forestValue17_17_0 = spill17_0;
    forestValue17_17_1 = spill17_1;
    forestValue17_17_2 = ((((java.lang.String)(p4)).equals(((java.lang.Object)("e")))) ? 1 : 0);
    }
    if (!((life8_5 != 0))) {
        forestValue17_21_0 = forestValue17_17_0;
        forestValue17_21_1 = forestValue17_17_1;
        forestValue17_21_2 = forestValue17_17_2;
        break forest_join_21;
    }
    if (!((forestValue17_17_2 == 0))) {
        forestValue17_22_0 = forestValue17_17_0;
        forestValue17_22_1 = forestValue17_17_1;
        break forest_join_22;
    }
    forestValue17_21_0 = forestValue17_17_0;
    forestValue17_21_1 = forestValue17_17_1;
    forestValue17_21_2 = 1;
    }
    forestValue17_23_0 = forestValue17_21_0;
    forestValue17_23_1 = forestValue17_21_1;
    forestValue17_23_2 = forestValue17_21_2;
    break forest_join_23;
    }
    forestValue17_23_0 = forestValue17_22_0;
    forestValue17_23_1 = forestValue17_22_1;
    forestValue17_23_2 = 0;
    }
    life9_33 = moom.qU.a(((java.util.Map)(forestValue17_23_0)), ((java.lang.String)(forestValue17_23_1)), ((int)(forestValue17_23_2)));
    spill17_3 = ((java.lang.String)(p4)).equals(((java.lang.Object)("p")));
    if (!((life8_5 != 0))) {
        forestValue17_34_0 = ((spill17_3) ? 1 : 0);
        break forest_join_34;
    }
    if (!((!spill17_3))) {
        break forest_join_51;
    }
    forestValue17_34_0 = ((((java.lang.String)(p4)).equals(((java.lang.Object)("a")))) ? 1 : 0);
    }
    if (!((life8_5 != 0))) {
        forestValue17_40_0 = forestValue17_34_0;
        break forest_join_40;
    }
    if (!((forestValue17_34_0 == 0))) {
        break forest_join_51;
    }
    forestValue17_40_0 = ((((java.lang.String)(p4)).equals(((java.lang.Object)("e")))) ? 1 : 0);
    }
    if (!((life8_5 != 0))) {
        forestValue17_46_0 = forestValue17_40_0;
        break forest_join_46;
    }
    if (!((forestValue17_40_0 == 0))) {
        break forest_join_51;
    }
    forestValue17_46_0 = ((((java.lang.String)(p4)).equals(((java.lang.Object)("r")))) ? 1 : 0);
    }
    if (!((forestValue17_46_0 != 0))) {
        break forest_join_57;
    }
    java.util.Collections.shuffle(((java.util.List)(p0)));
    if (!((life8_5 == 0))) {
        break forest_join_57;
    }
    }
    if (!((p5 != null))) {
        break forest_join_57;
    }
    ((java.util.List)(p0)).sort(((java.util.Comparator)(__sourceIntrinsic_2b7b1814c7af_invokedynamic17_17(p5))));
    }
    life10_86 = ((net.minecraft.command.ICommandSender)(p2)).a__r3();
    if (!((life10_86 != null))) {
        break forest_join_94;
    }
    spill17_4 = ((java.lang.Class)(p3)).isAssignableFrom(((java.lang.Class)(((java.lang.Object)(life10_86)).getClass())));
    if (!((life8_5 != 0))) {
        forestValue17_95_0 = ((spill17_4) ? 1 : 0);
        break forest_join_95;
    }
    if (!(spill17_4)) {
        break forest_join_94;
    }
    spill17_5 = life9_33;
    if (!((life8_5 != 0))) {
        forestValue17_95_0 = spill17_5;
        break forest_join_95;
    }
    if (!((spill17_5 == 1))) {
        break forest_join_94;
    }
    spill17_6 = ((java.util.List)(p0)).contains(((java.lang.Object)(life10_86)));
    if (!((life8_5 != 0))) {
        forestValue17_95_0 = ((spill17_6) ? 1 : 0);
        break forest_join_95;
    }
    if (!(spill17_6)) {
        break forest_join_94;
    }
    spill17_7 = ((java.lang.String)("r")).equals(((java.lang.Object)(p4)));
    if (!((life8_5 != 0))) {
        forestValue17_95_0 = ((spill17_7) ? 1 : 0);
        break forest_join_95;
    }
    if (!((!spill17_7))) {
        break forest_join_94;
    }
    net.minecraft.entity.Entity[] __stackOp17_27_0 = new net.minecraft.entity.Entity[1];
    spill17_8 = __stackOp17_27_0;
    (__stackOp17_27_0)[0] = life10_86;
    p0 = com.google.common.collect.Lists.newArrayList(((T[])(spill17_8)));
    }
    forestValue17_95_0 = life9_33;
    }
    if (!((life8_5 != 0))) {
        forestValue17_99_0 = forestValue17_95_0;
        break forest_join_99;
    }
    if (!((forestValue17_95_0 != 0))) {
        break forest_join_111;
    }
    forestValue17_99_0 = life9_33;
    }
    if (!((forestValue17_99_0 < 0))) {
        break forest_join_102;
    }
    java.util.Collections.reverse(((java.util.List)(p0)));
    }
    p0 = ((java.util.List)(p0)).subList(((int)(0)), ((int)(java.lang.Math.min(((int)(java.lang.Math.abs(((int)(life9_33))))), ((int)(((java.util.List)(p0)).size()))))));
    }
    return p0;
}


private static java.util.List<com.google.common.base.Predicate<net.minecraft.entity.Entity>> a(java.util.Map<java.lang.String, java.lang.String> p0, moom.DT p1) {
int forwardValue3857_31_0;
    boolean spill3857_0;
    int spill3857_1;
    int spill3857_2;
    long life2_3;
    java.util.ArrayList life5_5;
    int life6_11;
    int life7_16;
    int life4_17;
    int life8_46;
    int life9_50;
    forward_join_45: {
    forward_join_31: {
    forward_join_28: {
    life2_3 = (moom.qU.e ^ 24928938025457L);
    life5_5 = com.google.common.collect.Lists.newArrayList();
    spill3857_0 = moom.b7.c();
    life6_11 = moom.qU.a(((java.util.Map)(p0)), ((java.lang.String)("rm")), ((int)(-1)));
    life7_16 = moom.qU.a(((java.util.Map)(p0)), ((java.lang.String)("r")), ((int)(-1)));
    life4_17 = ((spill3857_0) ? 1 : 0);
    if (!((p1 != null))) {
        break forward_join_45;
    }
    spill3857_1 = life6_11;
    if (!((life4_17 != 0))) {
        forwardValue3857_31_0 = spill3857_1;
        break forward_join_31;
    }
    if (!((spill3857_1 < 0))) {
        break forward_join_28;
    }
    spill3857_2 = life7_16;
    if (!((life4_17 != 0))) {
        forwardValue3857_31_0 = spill3857_2;
        break forward_join_31;
    }
    if (!((spill3857_2 >= 0))) {
        break forward_join_45;
    }
    }
    forwardValue3857_31_0 = (life6_11 * life6_11);
    }
    life8_46 = forwardValue3857_31_0;
    life9_50 = (life7_16 * life7_16);
    ((java.util.List)(life5_5)).add(((java.lang.Object)(__sourceIntrinsic_07f0f7b984aa_invokedynamic3857_6(p1, life6_11, life8_46, life7_16, life9_50))));
    }
    return life5_5;
}


private static <T extends net.minecraft.entity.Entity> java.util.List<T> a(java.util.Map<java.lang.String, java.lang.String> p0, java.lang.Class<? extends T> p1, java.util.List<com.google.common.base.Predicate<net.minecraft.entity.Entity>> p2, java.lang.String p3, net.minecraft.world.World p4, moom.DT p5) {
java.lang.String forwardValue3855_17_0;
    java.lang.String forwardValue3855_25_0;
    java.lang.String forwardValue3855_27_0;
    int forwardValue3855_35_0;
    int forwardValue3855_37_0;
    java.lang.String forwardValue3855_45_0;
    int forwardValue3855_49_0;
    int forwardValue3855_99_0;
    int forwardValue3855_101_0;
    int forwardValue3855_111_0;
    int forwardValue3855_117_0;
    int forwardValue3855_121_0;
    int forwardValue3855_192_0;
    int forwardValue3855_198_0;
    int forwardValue3855_213_0;
    int forwardValue3855_232_0;
    int forwardValue3855_241_0;
    int forwardValue3855_283_0;
    int forwardValue3855_304_0;
    int forwardValue3855_323_0;
    int forwardValue3855_332_0;
    boolean spill3855_0;
    java.lang.String spill3855_1;
    boolean spill3855_2;
    java.lang.String spill3855_3;
    int spill3855_4;
    boolean spill3855_5;
    int spill3855_6;
    int spill3855_7;
    int spill3855_8;
    boolean spill3855_9;
    int spill3855_10;
    int spill3855_11;
    int spill3855_12;
    int spill3855_13;
    boolean spill3855_14;
    boolean spill3855_15;
    int spill3855_16;
    long life6_3;
    java.util.ArrayList life9_6;
    java.lang.String life10_10;
    int life8_11;
    java.lang.String life10_36;
    int life11_49;
    int life12_69;
    int life13_74;
    int life14_79;
    int life15_84;
    int life16_89;
    com.google.common.base.Predicate life17_92;
    com.google.common.base.Predicate life18_96;
    int life19_102;
    int life20_106;
    int life21_127;
    moom.CA life22_207;
    moom.CA life22_347;
    com.google.common.base.Predicate life23_377;
    forward_join_333: {
    forward_join_332: {
    forward_join_326: {
    forward_join_323: {
    forward_join_317: {
    forward_join_304: {
    forward_join_301: {
    forward_join_286: {
    forward_join_284: {
    forward_join_283: {
    forward_join_276: {
    forward_join_244: {
    forward_join_241: {
    forward_join_235: {
    forward_join_232: {
    forward_join_226: {
    forward_join_213: {
    forward_join_210: {
    forward_join_198: {
    forward_join_195: {
    forward_join_193: {
    forward_join_192: {
    forward_join_185: {
    forward_join_121: {
    forward_join_117: {
    forward_join_111: {
    forward_join_101: {
    forward_join_100: {
    forward_join_99: {
    forward_join_49: {
    forward_join_48: {
    forward_join_45: {
    forward_join_37: {
    forward_join_36: {
    forward_join_35: {
    forward_join_27: {
    forward_join_26: {
    forward_join_25: {
    forward_join_17: {
    life6_3 = (moom.qU.e ^ 126970856583517L);
    spill3855_0 = moom.b7.b();
    life9_6 = com.google.common.collect.Lists.newArrayList();
    life10_10 = moom.qU.a(((java.util.Map)(p0)), ((java.lang.String)("type")));
    life8_11 = ((spill3855_0) ? 1 : 0);
    spill3855_1 = life10_10;
    if (!((life8_11 == 0))) {
        forwardValue3855_17_0 = spill3855_1;
        break forward_join_17;
    }
    if (!((spill3855_1 != null))) {
        break forward_join_26;
    }
    forwardValue3855_17_0 = life10_10;
    }
    if (!((life8_11 == 0))) {
        forwardValue3855_25_0 = forwardValue3855_17_0;
        break forward_join_25;
    }
    if (!(((java.lang.String)(forwardValue3855_17_0)).startsWith(((java.lang.String)("!"))))) {
        break forward_join_26;
    }
    forwardValue3855_25_0 = ((java.lang.String)(life10_10)).substring(((int)(1)));
    }
    forwardValue3855_27_0 = forwardValue3855_25_0;
    break forward_join_27;
    }
    forwardValue3855_27_0 = life10_10;
    }
    life10_36 = forwardValue3855_27_0;
    spill3855_2 = ((java.lang.String)(p3)).equals(((java.lang.Object)("e")));
    if (!((life8_11 == 0))) {
        forwardValue3855_35_0 = ((spill3855_2) ? 1 : 0);
        break forward_join_35;
    }
    if (!((!spill3855_2))) {
        break forward_join_36;
    }
    forwardValue3855_35_0 = 1;
    }
    forwardValue3855_37_0 = forwardValue3855_35_0;
    break forward_join_37;
    }
    forwardValue3855_37_0 = 0;
    }
    life11_49 = forwardValue3855_37_0;
    spill3855_3 = p3;
    if (!((life8_11 == 0))) {
        forwardValue3855_45_0 = spill3855_3;
        break forward_join_45;
    }
    if (!(((java.lang.String)(spill3855_3)).equals(((java.lang.Object)("r"))))) {
        break forward_join_48;
    }
    forwardValue3855_45_0 = life10_36;
    }
    if (!((forwardValue3855_45_0 != null))) {
        break forward_join_48;
    }
    forwardValue3855_49_0 = 1;
    break forward_join_49;
    }
    forwardValue3855_49_0 = 0;
    }
    life12_69 = forwardValue3855_49_0;
    life13_74 = moom.qU.a(((java.util.Map)(p0)), ((java.lang.String)("dx")), ((int)(0)));
    life14_79 = moom.qU.a(((java.util.Map)(p0)), ((java.lang.String)("dy")), ((int)(0)));
    life15_84 = moom.qU.a(((java.util.Map)(p0)), ((java.lang.String)("dz")), ((int)(0)));
    life16_89 = moom.qU.a(((java.util.Map)(p0)), ((java.lang.String)("r")), ((int)(-1)));
    life17_92 = com.google.common.base.Predicates.and(((java.lang.Iterable)(p2)));
    life18_96 = com.google.common.base.Predicates.and(((com.google.common.base.Predicate)(moom.CY.a)), ((com.google.common.base.Predicate)(life17_92)));
    if (!((p5 != null))) {
        break forward_join_286;
    }
    life19_102 = ((java.util.List)(((net.minecraft.world.World)(p4)).i)).size();
    life20_106 = ((java.util.List)(((net.minecraft.world.World)(p4)).c)).size();
    spill3855_4 = life19_102;
    if (!((life8_11 == 0))) {
        forwardValue3855_99_0 = spill3855_4;
        break forward_join_99;
    }
    if (!((spill3855_4 < (life20_106 / __sourceIntrinsic_aff5706064ab_invokedynamic3855_21(4941, (4998473409428003689L ^ life6_3)))))) {
        break forward_join_100;
    }
    forwardValue3855_99_0 = 1;
    }
    forwardValue3855_101_0 = forwardValue3855_99_0;
    break forward_join_101;
    }
    forwardValue3855_101_0 = 0;
    }
    life21_127 = forwardValue3855_101_0;
    spill3855_5 = ((java.util.Map)(p0)).containsKey(((java.lang.Object)("dx")));
    if (!((life8_11 == 0))) {
        forwardValue3855_111_0 = ((spill3855_5) ? 1 : 0);
        break forward_join_111;
    }
    if (!((!spill3855_5))) {
        break forward_join_244;
    }
    forwardValue3855_111_0 = ((((java.util.Map)(p0)).containsKey(((java.lang.Object)("dy")))) ? 1 : 0);
    }
    if (!((life8_11 == 0))) {
        forwardValue3855_117_0 = forwardValue3855_111_0;
        break forward_join_117;
    }
    if (!((forwardValue3855_111_0 == 0))) {
        break forward_join_244;
    }
    forwardValue3855_117_0 = ((((java.util.Map)(p0)).containsKey(((java.lang.Object)("dz")))) ? 1 : 0);
    }
    if (!((life8_11 == 0))) {
        forwardValue3855_121_0 = forwardValue3855_117_0;
        break forward_join_121;
    }
    if (!((forwardValue3855_117_0 == 0))) {
        break forward_join_244;
    }
    forwardValue3855_121_0 = life16_89;
    }
    if (!((life8_11 == 0))) {
        forwardValue3855_198_0 = forwardValue3855_121_0;
        break forward_join_198;
    }
    if (!((forwardValue3855_121_0 >= 0))) {
        break forward_join_195;
    }
    life22_207 = new moom.CA(((double) (((moom.DT)(p5)).a() - life16_89)), ((double) (((moom.DT)(p5)).b() - life16_89)), ((double) (((moom.DT)(p5)).c() - life16_89)), ((double) ((((moom.DT)(p5)).a() + life16_89) + 1)), ((double) ((((moom.DT)(p5)).b() + life16_89) + 1)), ((double) ((((moom.DT)(p5)).c() + life16_89) + 1)));
    spill3855_6 = life11_49;
    if (!((life8_11 == 0))) {
        forwardValue3855_192_0 = spill3855_6;
        break forward_join_192;
    }
    if (!((spill3855_6 != 0))) {
        break forward_join_185;
    }
    spill3855_7 = life21_127;
    if (!((life8_11 == 0))) {
        forwardValue3855_192_0 = spill3855_7;
        break forward_join_192;
    }
    if (!((spill3855_7 != 0))) {
        break forward_join_185;
    }
    spill3855_8 = life12_69;
    if (!((life8_11 == 0))) {
        forwardValue3855_192_0 = spill3855_8;
        break forward_join_192;
    }
    if (!((spill3855_8 == 0))) {
        break forward_join_185;
    }
    ((java.util.List)(life9_6)).addAll(((java.util.Collection)(((net.minecraft.world.World)(p4)).b(((java.lang.Class)(p1)), ((com.google.common.base.Predicate)(life18_96))))));
    if (!((life8_11 != 0))) {
        break forward_join_193;
    }
    }
    forwardValue3855_192_0 = ((((java.util.List)(life9_6)).addAll(((java.util.Collection)(((net.minecraft.world.World)(p4)).a(((java.lang.Class)(p1)), ((moom.CA)(life22_207)), ((com.google.common.base.Predicate)(life18_96))))))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue3855_192_0);
    }
    if (!((life8_11 != 0))) {
        break forward_join_284;
    }
    }
    forwardValue3855_198_0 = ((((java.lang.String)(p3)).equals(((java.lang.Object)("a")))) ? 1 : 0);
    }
    if (!((life8_11 == 0))) {
        forwardValue3855_213_0 = forwardValue3855_198_0;
        break forward_join_213;
    }
    if (!((forwardValue3855_198_0 != 0))) {
        break forward_join_210;
    }
    ((java.util.List)(life9_6)).addAll(((java.util.Collection)(((net.minecraft.world.World)(p4)).b(((java.lang.Class)(p1)), ((com.google.common.base.Predicate)(life17_92))))));
    if (!((life8_11 != 0))) {
        break forward_join_284;
    }
    }
    forwardValue3855_213_0 = ((((java.lang.String)(p3)).equals(((java.lang.Object)("p")))) ? 1 : 0);
    }
    if (!((life8_11 == 0))) {
        forwardValue3855_241_0 = forwardValue3855_213_0;
        break forward_join_241;
    }
    if (!((forwardValue3855_213_0 == 0))) {
        break forward_join_235;
    }
    spill3855_9 = ((java.lang.String)(p3)).equals(((java.lang.Object)("r")));
    if (!((life8_11 == 0))) {
        forwardValue3855_232_0 = ((spill3855_9) ? 1 : 0);
        break forward_join_232;
    }
    if (!(spill3855_9)) {
        break forward_join_226;
    }
    spill3855_10 = life12_69;
    if (!((life8_11 == 0))) {
        forwardValue3855_241_0 = spill3855_10;
        break forward_join_241;
    }
    if (!((spill3855_10 != 0))) {
        break forward_join_235;
    }
    }
    forwardValue3855_232_0 = ((((java.util.List)(life9_6)).addAll(((java.util.Collection)(((net.minecraft.world.World)(p4)).a(((java.lang.Class)(p1)), ((com.google.common.base.Predicate)(life18_96))))))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue3855_232_0);
    if (!((life8_11 != 0))) {
        break forward_join_284;
    }
    }
    forwardValue3855_241_0 = ((((java.util.List)(life9_6)).addAll(((java.util.Collection)(((net.minecraft.world.World)(p4)).b(((java.lang.Class)(p1)), ((com.google.common.base.Predicate)(life18_96))))))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue3855_241_0);
    if (!((life8_11 != 0))) {
        break forward_join_284;
    }
    }
    life22_347 = moom.qU.a(((moom.DT)(p5)), ((int)(life13_74)), ((int)(life14_79)), ((int)(life15_84)));
    spill3855_11 = life11_49;
    if (!((life8_11 == 0))) {
        forwardValue3855_283_0 = spill3855_11;
        break forward_join_283;
    }
    if (!((spill3855_11 != 0))) {
        break forward_join_276;
    }
    spill3855_12 = life21_127;
    if (!((life8_11 == 0))) {
        forwardValue3855_283_0 = spill3855_12;
        break forward_join_283;
    }
    if (!((spill3855_12 != 0))) {
        break forward_join_276;
    }
    spill3855_13 = life12_69;
    if (!((life8_11 == 0))) {
        forwardValue3855_283_0 = spill3855_13;
        break forward_join_283;
    }
    if (!((spill3855_13 == 0))) {
        break forward_join_276;
    }
    life23_377 = __sourceIntrinsic_aff5706064ab_invokedynamic3855_57(life22_347);
    ((java.util.List)(life9_6)).addAll(((java.util.Collection)(((net.minecraft.world.World)(p4)).b(((java.lang.Class)(p1)), ((com.google.common.base.Predicate)(com.google.common.base.Predicates.and(((com.google.common.base.Predicate)(life18_96)), ((com.google.common.base.Predicate)(life23_377)))))))));
    if (!((life8_11 != 0))) {
        break forward_join_284;
    }
    }
    forwardValue3855_283_0 = ((((java.util.List)(life9_6)).addAll(((java.util.Collection)(((net.minecraft.world.World)(p4)).a(((java.lang.Class)(p1)), ((moom.CA)(life22_347)), ((com.google.common.base.Predicate)(life18_96))))))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue3855_283_0);
    }
    if (!((life8_11 != 0))) {
        break forward_join_333;
    }
    }
    spill3855_14 = ((java.lang.String)(p3)).equals(((java.lang.Object)("a")));
    if (!((life8_11 == 0))) {
        forwardValue3855_304_0 = ((spill3855_14) ? 1 : 0);
        break forward_join_304;
    }
    if (!(spill3855_14)) {
        break forward_join_301;
    }
    ((java.util.List)(life9_6)).addAll(((java.util.Collection)(((net.minecraft.world.World)(p4)).b(((java.lang.Class)(p1)), ((com.google.common.base.Predicate)(life17_92))))));
    if (!((life8_11 != 0))) {
        break forward_join_333;
    }
    }
    forwardValue3855_304_0 = ((((java.lang.String)(p3)).equals(((java.lang.Object)("p")))) ? 1 : 0);
    }
    if (!((life8_11 == 0))) {
        forwardValue3855_332_0 = forwardValue3855_304_0;
        break forward_join_332;
    }
    if (!((forwardValue3855_304_0 == 0))) {
        break forward_join_326;
    }
    spill3855_15 = ((java.lang.String)(p3)).equals(((java.lang.Object)("r")));
    if (!((life8_11 == 0))) {
        forwardValue3855_323_0 = ((spill3855_15) ? 1 : 0);
        break forward_join_323;
    }
    if (!(spill3855_15)) {
        break forward_join_317;
    }
    spill3855_16 = life12_69;
    if (!((life8_11 == 0))) {
        forwardValue3855_332_0 = spill3855_16;
        break forward_join_332;
    }
    if (!((spill3855_16 != 0))) {
        break forward_join_326;
    }
    }
    forwardValue3855_323_0 = ((((java.util.List)(life9_6)).addAll(((java.util.Collection)(((net.minecraft.world.World)(p4)).a(((java.lang.Class)(p1)), ((com.google.common.base.Predicate)(life18_96))))))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue3855_323_0);
    if (!((life8_11 != 0))) {
        break forward_join_333;
    }
    }
    forwardValue3855_332_0 = ((((java.util.List)(life9_6)).addAll(((java.util.Collection)(((net.minecraft.world.World)(p4)).b(((java.lang.Class)(p1)), ((com.google.common.base.Predicate)(life18_96))))))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue3855_332_0);
    }
    return life9_6;
}


private static java.util.List<com.google.common.base.Predicate<net.minecraft.entity.Entity>> a(java.util.Map<java.lang.String, java.lang.String> p0) {
int forwardValue3854_33_0;
    boolean spill3854_0;
    int spill3854_1;
    int spill3854_2;
    long life1_3;
    java.util.ArrayList life4_5;
    int life5_11;
    int life6_16;
    int life3_17;
    forward_join_34: {
    forward_join_33: {
    forward_join_28: {
    life1_3 = (moom.qU.e ^ 130242763997576L);
    life4_5 = com.google.common.collect.Lists.newArrayList();
    spill3854_0 = moom.b7.c();
    life5_11 = moom.qU.a(((java.util.Map)(p0)), ((java.lang.String)("lm")), ((int)(-1)));
    life6_16 = moom.qU.a(((java.util.Map)(p0)), ((java.lang.String)("l")), ((int)(-1)));
    life3_17 = ((spill3854_0) ? 1 : 0);
    spill3854_1 = life5_11;
    if (!((life3_17 != 0))) {
        forwardValue3854_33_0 = spill3854_1;
        break forward_join_33;
    }
    if (!((spill3854_1 <= -1))) {
        break forward_join_28;
    }
    spill3854_2 = life6_16;
    if (!((life3_17 != 0))) {
        forwardValue3854_33_0 = spill3854_2;
        break forward_join_33;
    }
    if (!((spill3854_2 > -1))) {
        break forward_join_34;
    }
    }
    forwardValue3854_33_0 = ((((java.util.List)(life4_5)).add(((java.lang.Object)(__sourceIntrinsic_97f9ddba53ee_invokedynamic3854_6(life5_11, life6_16))))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue3854_33_0);
    }
    return life4_5;
}


public static int a(int p0) {
int forwardValue3851_25_0;
    int forwardValue3851_30_0;
    boolean spill3851_0;
    int spill3851_1;
    long life1_3;
    int life0_12;
    int life3_13;
    forward_join_30: {
    forward_join_29: {
    forward_join_25: {
    forward_join_24: {
    life1_3 = (moom.qU.e ^ 26500383468156L);
    spill3851_0 = moom.b7.c();
    life0_12 = (p0 % __sourceIntrinsic_5c51e7cdc795_invokedynamic3851_2(19741, (5485614791689969177L ^ life1_3)));
    life3_13 = ((spill3851_0) ? 1 : 0);
    spill3851_1 = life0_12;
    if (!((life3_13 != 0))) {
        forwardValue3851_25_0 = spill3851_1;
        break forward_join_25;
    }
    if (!((spill3851_1 >= __sourceIntrinsic_5c51e7cdc795_invokedynamic3851_4(26002, (8114409048548914833L ^ life1_3))))) {
        break forward_join_24;
    }
    life0_12 += -360;
    }
    forwardValue3851_25_0 = life0_12;
    }
    if (!((life3_13 != 0))) {
        forwardValue3851_30_0 = forwardValue3851_25_0;
        break forward_join_30;
    }
    if (!((forwardValue3851_25_0 < 0))) {
        break forward_join_29;
    }
    life0_12 += 360;
    }
    forwardValue3851_30_0 = life0_12;
    }
    return forwardValue3851_30_0;
}


private static boolean lambda$getScorePredicates$5(java.util.Map p0, net.minecraft.entity.Entity p1) {
int lexicalValue1280_38_0;
    int lexicalValue1280_43_0;
    net.minecraft.entity.Entity lexicalValue1280_69_0;
    java.lang.String lexicalValue1280_71_0;
    net.minecraft.scoreboard.Scoreboard lexicalValue1280_84_0;
    java.lang.String lexicalValue1280_84_1;
    net.minecraft.scoreboard.ScoreObjective lexicalValue1280_84_2;
    int lexicalValue1280_104_0;
    int lexicalValue1280_110_0;
    int lexicalValue1280_110_1;
    int lexicalValue1280_112_0;
    int lexicalValue1280_116_0;
    int lexicalValue1280_120_0;
    boolean spill1280_0;
    boolean spill1280_1;
    net.minecraft.entity.Entity spill1280_2;
    net.minecraft.scoreboard.Scoreboard spill1280_3;
    java.lang.String spill1280_4;
    net.minecraft.scoreboard.ScoreObjective spill1280_5;
    int spill1280_6;
    int spill1280_7;
    int spill1280_8;
    long life2_3;
    net.minecraft.scoreboard.Scoreboard life5_8;
    java.util.Iterator life6_13;
    int life4_14;
    java.util.Map.Entry life7_21;
    java.lang.String life8_25;
    int life9_27;
    net.minecraft.scoreboard.ScoreObjective life10_70;
    java.lang.String life11_93;
    net.minecraft.scoreboard.Score life12_112;
    int life13_115;
    lexical_join_120: {
    lexical_join_119: {
    life2_3 = (moom.qU.e ^ 20235703942710L);
    life5_8 = ((net.minecraft.world.WorldServer)(((moom.Bl)(moom.Bl.a__Bl())).a(((int)(0))))).a__Bh();
    spill1280_0 = moom.b7.b();
    life6_13 = ((java.util.Set)(((java.util.Map)(p0)).entrySet())).iterator();
    life4_14 = ((spill1280_0) ? 1 : 0);
    lexical_cycle_15: while (true) {
    lexical_join_117: {
    lexical_join_116: {
    lexical_join_112: {
    lexical_join_110: {
    lexical_join_104: {
    lexical_join_103: {
    lexical_join_84: {
    lexical_join_81: {
    lexical_join_71: {
    lexical_join_69: {
    lexical_join_68: {
    lexical_join_60: {
    lexical_join_52: {
    lexical_join_43: {
    lexical_join_38: {
    if (!(((java.util.Iterator)(life6_13)).hasNext())) {
        break lexical_join_119;
    }
    life7_21 = ((java.util.Map.Entry)(((java.util.Iterator)(life6_13)).next()));
    life8_25 = ((java.lang.String)(((java.util.Map.Entry)(life7_21)).getKey()));
    life9_27 = 0;
    spill1280_1 = ((java.lang.String)(life8_25)).endsWith(((java.lang.String)("_min")));
    if (!((life4_14 == 0))) {
        lexicalValue1280_120_0 = ((spill1280_1) ? 1 : 0);
        break lexical_join_120;
    }
    if (!((life4_14 == 0))) {
        lexicalValue1280_38_0 = ((spill1280_1) ? 1 : 0);
        break lexical_join_38;
    }
    if (!(spill1280_1)) {
        break lexical_join_52;
    }
    lexicalValue1280_38_0 = ((java.lang.String)(life8_25)).length();
    }
    if (!((life4_14 == 0))) {
        lexicalValue1280_43_0 = lexicalValue1280_38_0;
        break lexical_join_43;
    }
    if (!((lexicalValue1280_38_0 > 4))) {
        break lexical_join_52;
    }
    lexicalValue1280_43_0 = 1;
    }
    life9_27 = lexicalValue1280_43_0;
    life8_25 = ((java.lang.String)(life8_25)).substring(((int)(0)), ((int)((((java.lang.String)(life8_25)).length() - 4))));
    }
    life10_70 = ((net.minecraft.scoreboard.Scoreboard)(life5_8)).a__Bg(((java.lang.String)(life8_25)));
    if (!((life10_70 == null))) {
        break lexical_join_60;
    }
    return ((0) != 0);
    }
    spill1280_2 = p1;
    if (!((life4_14 == 0))) {
        lexicalValue1280_69_0 = spill1280_2;
        break lexical_join_69;
    }
    if (!((((spill1280_2 instanceof net.minecraft.entity.player.EntityPlayerMP) ? 1 : 0) != 0))) {
        break lexical_join_68;
    }
    lexicalValue1280_71_0 = ((net.minecraft.entity.Entity)(p1)).a__String();
    break lexical_join_71;
    }
    lexicalValue1280_69_0 = p1;
    }
    lexicalValue1280_71_0 = ((java.util.UUID)(((net.minecraft.entity.Entity)(lexicalValue1280_69_0)).a__UUID())).toString();
    }
    life11_93 = lexicalValue1280_71_0;
    spill1280_3 = life5_8;
    spill1280_4 = life11_93;
    spill1280_5 = life10_70;
    if (!((life4_14 == 0))) {
        lexicalValue1280_84_0 = spill1280_3;
        lexicalValue1280_84_1 = spill1280_4;
        lexicalValue1280_84_2 = spill1280_5;
        break lexical_join_84;
    }
    if (!((!((net.minecraft.scoreboard.Scoreboard)(spill1280_3)).a__Boolean(((java.lang.String)(spill1280_4)), ((net.minecraft.scoreboard.ScoreObjective)(spill1280_5)))))) {
        break lexical_join_81;
    }
    return ((0) != 0);
    }
    lexicalValue1280_84_0 = life5_8;
    lexicalValue1280_84_1 = life11_93;
    lexicalValue1280_84_2 = life10_70;
    }
    life12_112 = ((net.minecraft.scoreboard.Scoreboard)(lexicalValue1280_84_0)).a(((java.lang.String)(lexicalValue1280_84_1)), ((net.minecraft.scoreboard.ScoreObjective)(lexicalValue1280_84_2)));
    life13_115 = ((net.minecraft.scoreboard.Score)(life12_112)).a();
    spill1280_6 = life13_115;
    spill1280_7 = ((java.lang.Integer)(((java.lang.Integer)(((java.util.Map.Entry)(life7_21)).getValue())))).intValue();
    if (!((life4_14 == 0))) {
        lexicalValue1280_110_0 = spill1280_6;
        lexicalValue1280_110_1 = spill1280_7;
        break lexical_join_110;
    }
    if (!((spill1280_6 < spill1280_7))) {
        break lexical_join_103;
    }
    spill1280_8 = life9_27;
    if (!((life4_14 == 0))) {
        lexicalValue1280_104_0 = spill1280_8;
        break lexical_join_104;
    }
    if (!((spill1280_8 != 0))) {
        break lexical_join_103;
    }
    return ((0) != 0);
    }
    lexicalValue1280_104_0 = life13_115;
    }
    if (!((life4_14 == 0))) {
        lexicalValue1280_112_0 = lexicalValue1280_104_0;
        break lexical_join_112;
    }
    lexicalValue1280_110_0 = lexicalValue1280_104_0;
    lexicalValue1280_110_1 = ((java.lang.Integer)(((java.lang.Integer)(((java.util.Map.Entry)(life7_21)).getValue())))).intValue();
    }
    if (!((lexicalValue1280_110_0 > lexicalValue1280_110_1))) {
        break lexical_join_117;
    }
    lexicalValue1280_112_0 = life9_27;
    }
    if (!((life4_14 == 0))) {
        lexicalValue1280_116_0 = lexicalValue1280_112_0;
        break lexical_join_116;
    }
    if (!((lexicalValue1280_112_0 == 0))) {
        break lexical_join_117;
    }
    lexicalValue1280_116_0 = 0;
    }
    return ((lexicalValue1280_116_0) != 0);
    }
    if (!((life4_14 != 0))) { continue lexical_cycle_15; }
    break lexical_cycle_15;
    }
    }
    lexicalValue1280_120_0 = 1;
    }
    return ((lexicalValue1280_120_0) != 0);
}


private static boolean lambda$filterResults$10(moom.CA p0, net.minecraft.entity.Entity p1) {
int forwardValue3873_19_0;
    int forwardValue3873_27_0;
    int forwardValue3873_35_0;
    int forwardValue3873_43_0;
    int forwardValue3873_51_0;
    int forwardValue3873_55_0;
    int forwardValue3873_57_0;
    int spill3873_0;
    long life2_3;
    int life4_5;
    forward_join_57: {
    forward_join_56: {
    forward_join_55: {
    forward_join_51: {
    forward_join_43: {
    forward_join_35: {
    forward_join_27: {
    forward_join_19: {
    life2_3 = (moom.qU.e ^ 120851099603746L);
    life4_5 = ((moom.b7.c()) ? 1 : 0);
    spill3873_0 = recovery.source.CarrierOps.dcmpl(((double)(((net.minecraft.entity.Entity)(p1)).n)), ((double)(((moom.CA)(p0)).b)));
    if (!((life4_5 != 0))) {
        forwardValue3873_19_0 = spill3873_0;
        break forward_join_19;
    }
    if (!((spill3873_0 >= 0))) {
        break forward_join_56;
    }
    forwardValue3873_19_0 = recovery.source.CarrierOps.dcmpl(((double)(((net.minecraft.entity.Entity)(p1)).o)), ((double)(((moom.CA)(p0)).c)));
    }
    if (!((life4_5 != 0))) {
        forwardValue3873_27_0 = forwardValue3873_19_0;
        break forward_join_27;
    }
    if (!((forwardValue3873_19_0 >= 0))) {
        break forward_join_56;
    }
    forwardValue3873_27_0 = recovery.source.CarrierOps.dcmpl(((double)(((net.minecraft.entity.Entity)(p1)).p)), ((double)(((moom.CA)(p0)).d)));
    }
    if (!((life4_5 != 0))) {
        forwardValue3873_35_0 = forwardValue3873_27_0;
        break forward_join_35;
    }
    if (!((forwardValue3873_27_0 >= 0))) {
        break forward_join_56;
    }
    forwardValue3873_35_0 = recovery.source.CarrierOps.dcmpg(((double)(((net.minecraft.entity.Entity)(p1)).n)), ((double)(((moom.CA)(p0)).e)));
    }
    if (!((life4_5 != 0))) {
        forwardValue3873_43_0 = forwardValue3873_35_0;
        break forward_join_43;
    }
    if (!((forwardValue3873_35_0 < 0))) {
        break forward_join_56;
    }
    forwardValue3873_43_0 = recovery.source.CarrierOps.dcmpg(((double)(((net.minecraft.entity.Entity)(p1)).o)), ((double)(((moom.CA)(p0)).f)));
    }
    if (!((life4_5 != 0))) {
        forwardValue3873_51_0 = forwardValue3873_43_0;
        break forward_join_51;
    }
    if (!((forwardValue3873_43_0 < 0))) {
        break forward_join_56;
    }
    forwardValue3873_51_0 = recovery.source.CarrierOps.dcmpg(((double)(((net.minecraft.entity.Entity)(p1)).p)), ((double)(((moom.CA)(p0)).g)));
    }
    if (!((life4_5 != 0))) {
        forwardValue3873_55_0 = forwardValue3873_51_0;
        break forward_join_55;
    }
    if (!((forwardValue3873_51_0 < 0))) {
        break forward_join_56;
    }
    forwardValue3873_55_0 = 1;
    }
    forwardValue3873_57_0 = forwardValue3873_55_0;
    break forward_join_57;
    }
    forwardValue3873_57_0 = 0;
    }
    return ((forwardValue3873_57_0) != 0);
}


private static boolean lambda$getNamePredicates$6(java.lang.String p0, boolean p1, net.minecraft.entity.Entity p2) {
int forwardValue3877_15_0;
    int forwardValue3877_17_0;
    boolean spill3877_0;
    long life3_3;
    int life5_5;
    forward_join_17: {
    forward_join_16: {
    forward_join_15: {
    life3_3 = (moom.qU.e ^ 52280728783538L);
    life5_5 = ((moom.b7.c()) ? 1 : 0);
    spill3877_0 = ((java.lang.String)(((net.minecraft.entity.Entity)(p2)).a__String())).equals(((java.lang.Object)(p0)));
    if (!((life5_5 != 0))) {
        forwardValue3877_15_0 = ((spill3877_0) ? 1 : 0);
        break forward_join_15;
    }
    if (!((spill3877_0 != p1))) {
        break forward_join_16;
    }
    forwardValue3877_15_0 = 1;
    }
    forwardValue3877_17_0 = forwardValue3877_15_0;
    break forward_join_17;
    }
    forwardValue3877_17_0 = 0;
    }
    return ((forwardValue3877_17_0) != 0);
}


private static boolean lambda$getXpLevelPredicates$2(int p0, int p1, net.minecraft.entity.Entity p2) {
int forwardValue3882_17_0;
    int forwardValue3882_33_0;
    int forwardValue3882_33_1;
    int forwardValue3882_41_0;
    int forwardValue3882_43_0;
    int spill3882_0;
    int spill3882_1;
    int spill3882_2;
    int spill3882_3;
    int spill3882_4;
    int spill3882_5;
    int spill3882_6;
    long life3_3;
    int life5_5;
    net.minecraft.entity.player.EntityPlayerMP life6_16;
    forward_join_43: {
    forward_join_42: {
    forward_join_41: {
    forward_join_40: {
    forward_join_33: {
    forward_join_29: {
    forward_join_18: {
    forward_join_17: {
    forward_join_16: {
    life3_3 = (moom.qU.e ^ 53124080581407L);
    life5_5 = ((moom.b7.c()) ? 1 : 0);
    spill3882_0 = ((p2 instanceof net.minecraft.entity.player.EntityPlayerMP) ? 1 : 0);
    if (!((life5_5 != 0))) {
        forwardValue3882_17_0 = spill3882_0;
        break forward_join_17;
    }
    if (!((spill3882_0 != 0))) {
        break forward_join_16;
    }
    life6_16 = ((net.minecraft.entity.player.EntityPlayerMP)(p2));
    if (!((life5_5 == 0))) {
        break forward_join_18;
    }
    }
    forwardValue3882_17_0 = 0;
    }
    return ((forwardValue3882_17_0) != 0);
    }
    spill3882_1 = p0;
    spill3882_2 = -1;
    if (!((life5_5 != 0))) {
        forwardValue3882_33_0 = spill3882_1;
        forwardValue3882_33_1 = spill3882_2;
        break forward_join_33;
    }
    if (!((spill3882_1 > spill3882_2))) {
        break forward_join_29;
    }
    spill3882_3 = ((net.minecraft.entity.player.EntityPlayerMP)(life6_16)).b2;
    spill3882_4 = p0;
    if (!((life5_5 != 0))) {
        forwardValue3882_33_0 = spill3882_3;
        forwardValue3882_33_1 = spill3882_4;
        break forward_join_33;
    }
    if (!((spill3882_3 >= spill3882_4))) {
        break forward_join_42;
    }
    }
    spill3882_5 = p1;
    if (!((life5_5 != 0))) {
        forwardValue3882_41_0 = spill3882_5;
        break forward_join_41;
    }
    forwardValue3882_33_0 = spill3882_5;
    forwardValue3882_33_1 = -1;
    }
    if (!((forwardValue3882_33_0 > forwardValue3882_33_1))) {
        break forward_join_40;
    }
    spill3882_6 = ((net.minecraft.entity.player.EntityPlayerMP)(life6_16)).b2;
    if (!((life5_5 != 0))) {
        forwardValue3882_41_0 = spill3882_6;
        break forward_join_41;
    }
    if (!((spill3882_6 <= p1))) {
        break forward_join_42;
    }
    }
    forwardValue3882_41_0 = 1;
    }
    forwardValue3882_43_0 = forwardValue3882_41_0;
    break forward_join_43;
    }
    forwardValue3882_43_0 = 0;
    }
    return ((forwardValue3882_43_0) != 0);
}


private static boolean lambda$getTeamPredicates$4(java.lang.String p0, boolean p1, net.minecraft.entity.Entity p2) {
int forwardValue3881_17_0;
    moom.Bj forwardValue3881_28_0;
    java.lang.String forwardValue3881_29_0;
    int forwardValue3881_38_0;
    int forwardValue3881_40_0;
    int spill3881_0;
    moom.Bj spill3881_1;
    boolean spill3881_2;
    long life3_3;
    int life5_5;
    net.minecraft.entity.EntityLivingBase life6_16;
    moom.Bj life7_26;
    java.lang.String life8_40;
    forward_join_40: {
    forward_join_39: {
    forward_join_38: {
    forward_join_29: {
    forward_join_28: {
    forward_join_27: {
    forward_join_18: {
    forward_join_17: {
    forward_join_16: {
    life3_3 = (moom.qU.e ^ 71328089407955L);
    life5_5 = ((moom.b7.b()) ? 1 : 0);
    spill3881_0 = ((p2 instanceof net.minecraft.entity.EntityLivingBase) ? 1 : 0);
    if (!((life5_5 == 0))) {
        forwardValue3881_17_0 = spill3881_0;
        break forward_join_17;
    }
    if (!((spill3881_0 != 0))) {
        break forward_join_16;
    }
    life6_16 = ((net.minecraft.entity.EntityLivingBase)(p2));
    if (!((life5_5 != 0))) {
        break forward_join_18;
    }
    }
    forwardValue3881_17_0 = 0;
    }
    return ((forwardValue3881_17_0) != 0);
    }
    life7_26 = ((net.minecraft.entity.EntityLivingBase)(life6_16)).a__Bj();
    spill3881_1 = life7_26;
    if (!((life5_5 == 0))) {
        forwardValue3881_28_0 = spill3881_1;
        break forward_join_28;
    }
    if (!((spill3881_1 == null))) {
        break forward_join_27;
    }
    forwardValue3881_29_0 = "";
    break forward_join_29;
    }
    forwardValue3881_28_0 = life7_26;
    }
    forwardValue3881_29_0 = ((moom.Bj)(forwardValue3881_28_0)).a__String();
    }
    life8_40 = forwardValue3881_29_0;
    spill3881_2 = ((java.lang.String)(life8_40)).equals(((java.lang.Object)(p0)));
    if (!((life5_5 == 0))) {
        forwardValue3881_38_0 = ((spill3881_2) ? 1 : 0);
        break forward_join_38;
    }
    if (!((spill3881_2 != p1))) {
        break forward_join_39;
    }
    forwardValue3881_38_0 = 1;
    }
    forwardValue3881_40_0 = forwardValue3881_38_0;
    break forward_join_40;
    }
    forwardValue3881_40_0 = 0;
    }
    return ((forwardValue3881_40_0) != 0);
}


private static boolean lambda$getGamemodePredicates$3(int p0, net.minecraft.entity.Entity p1) {
int forwardValue3876_17_0;
    int forwardValue3876_27_0;
    int forwardValue3876_29_0;
    int spill3876_0;
    int spill3876_1;
    long life2_3;
    int life4_5;
    net.minecraft.entity.player.EntityPlayerMP life5_16;
    forward_join_29: {
    forward_join_28: {
    forward_join_27: {
    forward_join_18: {
    forward_join_17: {
    forward_join_16: {
    life2_3 = (moom.qU.e ^ 23572896393554L);
    life4_5 = ((moom.b7.b()) ? 1 : 0);
    spill3876_0 = ((p1 instanceof net.minecraft.entity.player.EntityPlayerMP) ? 1 : 0);
    if (!((life4_5 == 0))) {
        forwardValue3876_17_0 = spill3876_0;
        break forward_join_17;
    }
    if (!((spill3876_0 != 0))) {
        break forward_join_16;
    }
    life5_16 = ((net.minecraft.entity.player.EntityPlayerMP)(p1));
    if (!((life4_5 != 0))) {
        break forward_join_18;
    }
    }
    forwardValue3876_17_0 = 0;
    }
    return ((forwardValue3876_17_0) != 0);
    }
    spill3876_1 = ((net.minecraft.world.WorldSettings$GameType)(((moom.Bo)(((net.minecraft.entity.player.EntityPlayerMP)(life5_16)).ci)).a())).a();
    if (!((life4_5 == 0))) {
        forwardValue3876_27_0 = spill3876_1;
        break forward_join_27;
    }
    if (!((spill3876_1 == p0))) {
        break forward_join_28;
    }
    forwardValue3876_27_0 = 1;
    }
    forwardValue3876_29_0 = forwardValue3876_27_0;
    break forward_join_29;
    }
    forwardValue3876_29_0 = 0;
    }
    return ((forwardValue3876_29_0) != 0);
}


private static boolean lambda$getRotationsPredicates$8(int p0, int p1, net.minecraft.entity.Entity p2) {
int forwardValue3878_29_0;
    int forwardValue3878_31_0;
    int forwardValue3878_34_0;
    int forwardValue3878_34_1;
    int forwardValue3878_41_0;
    int forwardValue3878_41_1;
    int forwardValue3878_43_0;
    int forwardValue3878_45_0;
    boolean spill3878_0;
    int spill3878_1;
    int spill3878_2;
    int spill3878_3;
    int spill3878_4;
    int spill3878_5;
    long life3_3;
    int life6_11;
    int life5_12;
    forward_join_45: {
    forward_join_44: {
    forward_join_43: {
    forward_join_41: {
    forward_join_34: {
    forward_join_32: {
    forward_join_31: {
    forward_join_30: {
    forward_join_29: {
    forward_join_28: {
    life3_3 = (moom.qU.e ^ 57157691634497L);
    spill3878_0 = moom.b7.b();
    life6_11 = moom.qU.a(((int)(((int) java.lang.Math.floor(((double)(((double) ((net.minecraft.entity.Entity)(p2)).w))))))));
    life5_12 = ((spill3878_0) ? 1 : 0);
    spill3878_1 = p0;
    spill3878_2 = p1;
    if (!((life5_12 == 0))) {
        forwardValue3878_34_0 = spill3878_1;
        forwardValue3878_34_1 = spill3878_2;
        break forward_join_34;
    }
    if (!((spill3878_1 > spill3878_2))) {
        break forward_join_32;
    }
    spill3878_3 = life6_11;
    if (!((life5_12 == 0))) {
        forwardValue3878_29_0 = spill3878_3;
        break forward_join_29;
    }
    if (!((spill3878_3 < p0))) {
        break forward_join_28;
    }
    spill3878_4 = life6_11;
    if (!((life5_12 == 0))) {
        forwardValue3878_31_0 = spill3878_4;
        break forward_join_31;
    }
    if (!((spill3878_4 <= p1))) {
        break forward_join_30;
    }
    }
    forwardValue3878_29_0 = 1;
    }
    forwardValue3878_45_0 = forwardValue3878_29_0;
    break forward_join_45;
    }
    forwardValue3878_31_0 = 0;
    }
    forwardValue3878_45_0 = forwardValue3878_31_0;
    break forward_join_45;
    }
    forwardValue3878_34_0 = life6_11;
    forwardValue3878_34_1 = p0;
    }
    if (!((life5_12 == 0))) {
        forwardValue3878_41_0 = forwardValue3878_34_0;
        forwardValue3878_41_1 = forwardValue3878_34_1;
        break forward_join_41;
    }
    if (!((forwardValue3878_34_0 >= forwardValue3878_34_1))) {
        break forward_join_44;
    }
    spill3878_5 = life6_11;
    if (!((life5_12 == 0))) {
        forwardValue3878_43_0 = spill3878_5;
        break forward_join_43;
    }
    forwardValue3878_41_0 = spill3878_5;
    forwardValue3878_41_1 = p1;
    }
    if (!((forwardValue3878_41_0 <= forwardValue3878_41_1))) {
        break forward_join_44;
    }
    forwardValue3878_43_0 = 1;
    }
    forwardValue3878_45_0 = forwardValue3878_43_0;
    break forward_join_45;
    }
    forwardValue3878_45_0 = 0;
    }
    return ((forwardValue3878_45_0) != 0);
}


private static boolean lambda$getRotationsPredicates$9(int p0, int p1, net.minecraft.entity.Entity p2) {
int forwardValue3879_29_0;
    int forwardValue3879_31_0;
    int forwardValue3879_34_0;
    int forwardValue3879_34_1;
    int forwardValue3879_41_0;
    int forwardValue3879_41_1;
    int forwardValue3879_43_0;
    int forwardValue3879_45_0;
    boolean spill3879_0;
    int spill3879_1;
    int spill3879_2;
    int spill3879_3;
    int spill3879_4;
    int spill3879_5;
    long life3_3;
    int life6_11;
    int life5_12;
    forward_join_45: {
    forward_join_44: {
    forward_join_43: {
    forward_join_41: {
    forward_join_34: {
    forward_join_32: {
    forward_join_31: {
    forward_join_30: {
    forward_join_29: {
    forward_join_28: {
    life3_3 = (moom.qU.e ^ 19218053949614L);
    spill3879_0 = moom.b7.c();
    life6_11 = moom.qU.a(((int)(((int) java.lang.Math.floor(((double)(((double) ((net.minecraft.entity.Entity)(p2)).x))))))));
    life5_12 = ((spill3879_0) ? 1 : 0);
    spill3879_1 = p0;
    spill3879_2 = p1;
    if (!((life5_12 != 0))) {
        forwardValue3879_34_0 = spill3879_1;
        forwardValue3879_34_1 = spill3879_2;
        break forward_join_34;
    }
    if (!((spill3879_1 > spill3879_2))) {
        break forward_join_32;
    }
    spill3879_3 = life6_11;
    if (!((life5_12 != 0))) {
        forwardValue3879_29_0 = spill3879_3;
        break forward_join_29;
    }
    if (!((spill3879_3 < p0))) {
        break forward_join_28;
    }
    spill3879_4 = life6_11;
    if (!((life5_12 != 0))) {
        forwardValue3879_31_0 = spill3879_4;
        break forward_join_31;
    }
    if (!((spill3879_4 <= p1))) {
        break forward_join_30;
    }
    }
    forwardValue3879_29_0 = 1;
    }
    forwardValue3879_45_0 = forwardValue3879_29_0;
    break forward_join_45;
    }
    forwardValue3879_31_0 = 0;
    }
    forwardValue3879_45_0 = forwardValue3879_31_0;
    break forward_join_45;
    }
    forwardValue3879_34_0 = life6_11;
    forwardValue3879_34_1 = p0;
    }
    if (!((life5_12 != 0))) {
        forwardValue3879_41_0 = forwardValue3879_34_0;
        forwardValue3879_41_1 = forwardValue3879_34_1;
        break forward_join_41;
    }
    if (!((forwardValue3879_34_0 >= forwardValue3879_34_1))) {
        break forward_join_44;
    }
    spill3879_5 = life6_11;
    if (!((life5_12 != 0))) {
        forwardValue3879_43_0 = spill3879_5;
        break forward_join_43;
    }
    forwardValue3879_41_0 = spill3879_5;
    forwardValue3879_41_1 = p1;
    }
    if (!((forwardValue3879_41_0 <= forwardValue3879_41_1))) {
        break forward_join_44;
    }
    forwardValue3879_43_0 = 1;
    }
    forwardValue3879_45_0 = forwardValue3879_43_0;
    break forward_join_45;
    }
    forwardValue3879_45_0 = 0;
    }
    return ((forwardValue3879_45_0) != 0);
}


private static boolean lambda$func_180698_a$7(moom.DT p0, int p1, int p2, int p3, int p4, net.minecraft.entity.Entity p5) {
int forwardValue3875_21_0;
    int forwardValue3875_30_0;
    int forwardValue3875_32_0;
    boolean spill3875_0;
    int spill3875_1;
    int spill3875_2;
    int spill3875_3;
    long life6_3;
    int life9_9;
    int life8_10;
    forward_join_32: {
    forward_join_31: {
    forward_join_30: {
    forward_join_29: {
    forward_join_21: {
    forward_join_20: {
    life6_3 = (moom.qU.e ^ 49491403842461L);
    spill3875_0 = moom.b7.b();
    life9_9 = ((int) ((net.minecraft.entity.Entity)(p5)).b(((moom.DT)(p0))));
    life8_10 = ((spill3875_0) ? 1 : 0);
    spill3875_1 = p1;
    if (!((life8_10 == 0))) {
        forwardValue3875_21_0 = spill3875_1;
        break forward_join_21;
    }
    if (!((spill3875_1 >= 0))) {
        break forward_join_20;
    }
    spill3875_2 = life9_9;
    if (!((life8_10 == 0))) {
        forwardValue3875_21_0 = spill3875_2;
        break forward_join_21;
    }
    if (!((spill3875_2 >= p2))) {
        break forward_join_31;
    }
    }
    forwardValue3875_21_0 = p3;
    }
    if (!((life8_10 == 0))) {
        forwardValue3875_30_0 = forwardValue3875_21_0;
        break forward_join_30;
    }
    if (!((forwardValue3875_21_0 >= 0))) {
        break forward_join_29;
    }
    spill3875_3 = life9_9;
    if (!((life8_10 == 0))) {
        forwardValue3875_30_0 = spill3875_3;
        break forward_join_30;
    }
    if (!((spill3875_3 <= p4))) {
        break forward_join_31;
    }
    }
    forwardValue3875_30_0 = 1;
    }
    forwardValue3875_32_0 = forwardValue3875_30_0;
    break forward_join_32;
    }
    forwardValue3875_32_0 = 0;
    }
    return ((forwardValue3875_32_0) != 0);
}


private static boolean lambda$func_179663_a$0(net.minecraft.entity.Entity p0) {
return ((((p0 instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0)) != 0);
}


private static boolean lambda$func_179663_a$1(java.lang.String p0, boolean p1, net.minecraft.entity.Entity p2) {
int forwardValue3874_14_0;
    int forwardValue3874_16_0;
    boolean spill3874_0;
    long life3_3;
    int life5_5;
    forward_join_16: {
    forward_join_15: {
    forward_join_14: {
    life3_3 = (moom.qU.e ^ 85595678462784L);
    life5_5 = ((moom.b7.c()) ? 1 : 0);
    spill3874_0 = net.minecraft.entity.EntityList.a(((net.minecraft.entity.Entity)(p2)), ((java.lang.String)(p0)));
    if (!((life5_5 != 0))) {
        forwardValue3874_14_0 = ((spill3874_0) ? 1 : 0);
        break forward_join_14;
    }
    if (!((spill3874_0 != p1))) {
        break forward_join_15;
    }
    forwardValue3874_14_0 = 1;
    }
    forwardValue3874_16_0 = forwardValue3874_14_0;
    break forward_join_16;
    }
    forwardValue3874_16_0 = 0;
    }
    return ((forwardValue3874_16_0) != 0);
}


private static int lambda$func_179658_a$11(moom.DT p0, net.minecraft.entity.Entity p1, net.minecraft.entity.Entity p2) {
return ((com.google.common.collect.ComparisonChain)(((com.google.common.collect.ComparisonChain)(com.google.common.collect.ComparisonChain.start())).compare(((double)(((net.minecraft.entity.Entity)(p1)).a(((moom.DT)(p0))))), ((double)(((net.minecraft.entity.Entity)(p2)).a(((moom.DT)(p0)))))))).result();
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1474_58(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1474_60(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1474_61(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5c51e7cdc795_invokedynamic3851_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5c51e7cdc795_invokedynamic3851_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral8768_0() throws E;

private static native <E extends Throwable> java.util.Comparator __sourceIntrinsic_2b7b1814c7af_invokedynamic17_17(moom.DT a0) throws E;

private static native <E extends Throwable> com.google.common.base.Predicate __sourceIntrinsic_97f9ddba53ee_invokedynamic3854_6(int a0, int a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_aff5706064ab_invokedynamic3855_21(int a0, long a1) throws E;

private static native <E extends Throwable> com.google.common.base.Predicate __sourceIntrinsic_aff5706064ab_invokedynamic3855_57(moom.CA a0) throws E;

private static native <E extends Throwable> com.google.common.base.Predicate __sourceIntrinsic_07f0f7b984aa_invokedynamic3857_6(moom.DT a0, int a1, int a2, int a3, int a4) throws E;

private static native <E extends Throwable> com.google.common.base.Predicate __sourceIntrinsic_91730bedfb75_invokedynamic3865_12() throws E;

private static native <E extends Throwable> com.google.common.base.Predicate __sourceIntrinsic_91730bedfb75_invokedynamic3865_16(java.lang.String a0, int a1) throws E;

private static native <E extends Throwable> com.google.common.base.Predicate __sourceIntrinsic_8c092920b9e2_invokedynamic3868_9(int a0) throws E;

private static native <E extends Throwable> com.google.common.base.Predicate __sourceIntrinsic_0fbd59225012_invokedynamic3869_8(java.lang.String a0, int a1) throws E;

private static native <E extends Throwable> com.google.common.base.Predicate __sourceIntrinsic_3fba42583c74_invokedynamic3870_6(java.util.Map a0) throws E;

private static native <E extends Throwable> com.google.common.base.Predicate __sourceIntrinsic_9566c341ad2e_invokedynamic3871_8(java.lang.String a0, int a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_68fc434e2277_invokedynamic3872_10(int a0, long a1) throws E;

private static native <E extends Throwable> com.google.common.base.Predicate __sourceIntrinsic_68fc434e2277_invokedynamic3872_13(int a0, int a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_68fc434e2277_invokedynamic3872_21(int a0, long a1) throws E;

private static native <E extends Throwable> com.google.common.base.Predicate __sourceIntrinsic_68fc434e2277_invokedynamic3872_24(int a0, int a1) throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);

private static native net.minecraft.util.IChatComponent __sourceExactCall_d76f098e050eba(java.util.List p0);
}
