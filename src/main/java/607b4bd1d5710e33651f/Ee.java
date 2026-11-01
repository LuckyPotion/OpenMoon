package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Ee {

public final int a;

public final int b;

private int c;

private static final long d;

private static final long[] e;

private static final java.lang.Integer[] f;

private static final java.util.Map g;

private static final long[] h;

private static final java.lang.Long[] i;

private static final java.util.Map j;

public Ee(int p0, int p1) {
super();
    this.c = 0;
    this.a = p0;
    this.b = p1;
}


static {
d = ((long)(((moom._a)(moom._c.a(((long)(-1658188327670236768L)), ((long)(1978033694666449561L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(37746284010972L)))));
    g = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (moom.Ee.d ^ 138396930041827L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill523_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill523_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill523_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill523_14 = new byte[8];
    (__sourceSpill523_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill523_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation523_16 = __sourceSpill523_14;
    ((javax.crypto.Cipher)(__sourceSpill523_11)).init(((int)(__sourceSpill523_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill523_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation523_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local19_life19 = new long[10];
    int local16_life20 = 0;
    java.lang.String local17_life21;
    int local18_life23 = ((java.lang.String)((local17_life21 = "\\2/t6(ºÖ\tP\021å^RT\034´¢¢ø)®Ø¹£ðuWþÉâ#õw\\\021Õ¯ôü«.Ê?Ë¡Ö\006\177\004°yË."))).length();
    int local15_life24 = 0;
    do {
        java.lang.String __sourceSpill523_25 = local17_life21;
        int __sourceSpill523_26 = local15_life24;
        local15_life24 += 8;
        byte[] local20_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill523_25)).substring(((int)(__sourceSpill523_26)), ((int)(local15_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill523_30 = local19_life19;
        int __sourceSpill523_31 = local16_life20;
        local16_life20 += 1;
        long local21_life32 = (((((((((((long) (local20_life29)[0]) & 255L) << 56) | ((((long) (local20_life29)[1]) & 255L) << 48)) | ((((long) (local20_life29)[2]) & 255L) << 40)) | ((((long) (local20_life29)[3]) & 255L) << 32)) | ((((long) (local20_life29)[4]) & 255L) << 24)) | ((((long) (local20_life29)[5]) & 255L) << 16)) | ((((long) (local20_life29)[6]) & 255L) << 8)) | (((long) (local20_life29)[7]) & 255L));
        byte[] __sourceSpill523_33 = new byte[8];
        (__sourceSpill523_33)[0] = ((byte) ((int) (local21_life32 >>> 56)));
        (__sourceSpill523_33)[1] = ((byte) ((int) (local21_life32 >>> 48)));
        (__sourceSpill523_33)[2] = ((byte) ((int) (local21_life32 >>> 40)));
        (__sourceSpill523_33)[3] = ((byte) ((int) (local21_life32 >>> 32)));
        (__sourceSpill523_33)[4] = ((byte) ((int) (local21_life32 >>> 24)));
        (__sourceSpill523_33)[5] = ((byte) ((int) (local21_life32 >>> 16)));
        (__sourceSpill523_33)[6] = ((byte) ((int) (local21_life32 >>> 8)));
        (__sourceSpill523_33)[7] = ((byte) ((int) local21_life32));
        javax.crypto.Cipher __sourceSpill523_34 = local13_life9;
        byte[] local23_life36 = ((javax.crypto.Cipher)(__sourceSpill523_34)).doFinal(((byte[])(__sourceSpill523_33)));
        (__sourceSpill523_30)[__sourceSpill523_31] = (((((((((((long) (local23_life36)[0]) & 255L) << 56) | ((((long) (local23_life36)[1]) & 255L) << 48)) | ((((long) (local23_life36)[2]) & 255L) << 40)) | ((((long) (local23_life36)[3]) & 255L) << 32)) | ((((long) (local23_life36)[4]) & 255L) << 24)) | ((((long) (local23_life36)[5]) & 255L) << 16)) | ((((long) (local23_life36)[6]) & 255L) << 8)) | (((long) (local23_life36)[7]) & 255L));
    } while ((!(local15_life24 >= local18_life23)));
    local18_life23 = ((java.lang.String)((local17_life21 = "-O\024m£¨|(Qá\fnÑ¹"))).length();
    local15_life24 = 0;
    do {
        java.lang.String __sourceSpill523_38 = local17_life21;
        int __sourceSpill523_39 = local15_life24;
        local15_life24 += 8;
        byte[] local20_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill523_38)).substring(((int)(__sourceSpill523_39)), ((int)(local15_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill523_43 = local19_life19;
        int __sourceSpill523_44 = local16_life20;
        local16_life20 += 1;
        long local21_life45 = (((((((((((long) (local20_life42)[0]) & 255L) << 56) | ((((long) (local20_life42)[1]) & 255L) << 48)) | ((((long) (local20_life42)[2]) & 255L) << 40)) | ((((long) (local20_life42)[3]) & 255L) << 32)) | ((((long) (local20_life42)[4]) & 255L) << 24)) | ((((long) (local20_life42)[5]) & 255L) << 16)) | ((((long) (local20_life42)[6]) & 255L) << 8)) | (((long) (local20_life42)[7]) & 255L));
        byte[] __sourceSpill523_46 = new byte[8];
        (__sourceSpill523_46)[0] = ((byte) ((int) (local21_life45 >>> 56)));
        (__sourceSpill523_46)[1] = ((byte) ((int) (local21_life45 >>> 48)));
        (__sourceSpill523_46)[2] = ((byte) ((int) (local21_life45 >>> 40)));
        (__sourceSpill523_46)[3] = ((byte) ((int) (local21_life45 >>> 32)));
        (__sourceSpill523_46)[4] = ((byte) ((int) (local21_life45 >>> 24)));
        (__sourceSpill523_46)[5] = ((byte) ((int) (local21_life45 >>> 16)));
        (__sourceSpill523_46)[6] = ((byte) ((int) (local21_life45 >>> 8)));
        (__sourceSpill523_46)[7] = ((byte) ((int) local21_life45));
        javax.crypto.Cipher __sourceSpill523_47 = local13_life9;
        byte[] local23_life49 = ((javax.crypto.Cipher)(__sourceSpill523_47)).doFinal(((byte[])(__sourceSpill523_46)));
        (__sourceSpill523_43)[__sourceSpill523_44] = (((((((((((long) (local23_life49)[0]) & 255L) << 56) | ((((long) (local23_life49)[1]) & 255L) << 48)) | ((((long) (local23_life49)[2]) & 255L) << 40)) | ((((long) (local23_life49)[3]) & 255L) << 32)) | ((((long) (local23_life49)[4]) & 255L) << 24)) | ((((long) (local23_life49)[5]) & 255L) << 16)) | ((((long) (local23_life49)[6]) & 255L) << 8)) | (((long) (local23_life49)[7]) & 255L));
    } while ((!(local15_life24 >= local18_life23)));
    e = ((long[])(local19_life19));
    f = ((java.lang.Integer[])(new java.lang.Integer[10]));
    j = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life54;
    javax.crypto.Cipher __sourceSpill523_56 = (local0_life54 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill523_57 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill523_58 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill523_59 = new byte[8];
    (__sourceSpill523_59)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life60 = 1;
    while ((local1_life60 < 8)) {
        (__sourceSpill523_59)[local1_life60] = ((byte) ((int) ((local11_life7 << (local1_life60 * 8)) >>> 56)));
        local1_life60 += 1;
    }
    byte[] __sourcePreallocation523_61 = __sourceSpill523_59;
    ((javax.crypto.Cipher)(__sourceSpill523_56)).init(((int)(__sourceSpill523_57)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill523_58)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation523_61)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life64 = new long[2];
    int local3_life65 = 0;
    java.lang.String local4_life66;
    int local5_life68 = ((java.lang.String)((local4_life66 = "(í:^DI9û=ÏÆ\\\002³"))).length();
    int local2_life69 = 0;
    do {
        java.lang.String __sourceSpill523_70 = local4_life66;
        int __sourceSpill523_71 = local2_life69;
        local2_life69 += 8;
        byte[] local7_life74 = ((java.lang.String)(((java.lang.String)(__sourceSpill523_70)).substring(((int)(__sourceSpill523_71)), ((int)(local2_life69))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill523_75 = local6_life64;
        int __sourceSpill523_76 = local3_life65;
        local3_life65 += 1;
        long local8_life77 = (((((((((((long) (local7_life74)[0]) & 255L) << 56) | ((((long) (local7_life74)[1]) & 255L) << 48)) | ((((long) (local7_life74)[2]) & 255L) << 40)) | ((((long) (local7_life74)[3]) & 255L) << 32)) | ((((long) (local7_life74)[4]) & 255L) << 24)) | ((((long) (local7_life74)[5]) & 255L) << 16)) | ((((long) (local7_life74)[6]) & 255L) << 8)) | (((long) (local7_life74)[7]) & 255L));
        byte[] __sourceSpill523_78 = new byte[8];
        (__sourceSpill523_78)[0] = ((byte) ((int) (local8_life77 >>> 56)));
        (__sourceSpill523_78)[1] = ((byte) ((int) (local8_life77 >>> 48)));
        (__sourceSpill523_78)[2] = ((byte) ((int) (local8_life77 >>> 40)));
        (__sourceSpill523_78)[3] = ((byte) ((int) (local8_life77 >>> 32)));
        (__sourceSpill523_78)[4] = ((byte) ((int) (local8_life77 >>> 24)));
        (__sourceSpill523_78)[5] = ((byte) ((int) (local8_life77 >>> 16)));
        (__sourceSpill523_78)[6] = ((byte) ((int) (local8_life77 >>> 8)));
        (__sourceSpill523_78)[7] = ((byte) ((int) local8_life77));
        javax.crypto.Cipher __sourceSpill523_79 = local0_life54;
        byte[] local10_life81 = ((javax.crypto.Cipher)(__sourceSpill523_79)).doFinal(((byte[])(__sourceSpill523_78)));
        (__sourceSpill523_75)[__sourceSpill523_76] = (((((((((((long) (local10_life81)[0]) & 255L) << 56) | ((((long) (local10_life81)[1]) & 255L) << 48)) | ((((long) (local10_life81)[2]) & 255L) << 40)) | ((((long) (local10_life81)[3]) & 255L) << 32)) | ((((long) (local10_life81)[4]) & 255L) << 24)) | ((((long) (local10_life81)[5]) & 255L) << 16)) | ((((long) (local10_life81)[6]) & 255L) << 8)) | (((long) (local10_life81)[7]) & 255L));
    } while ((!(local2_life69 >= local5_life68)));
    h = ((long[])(local6_life64));
    i = ((java.lang.Long[])(new java.lang.Long[2]));
}


public boolean equals(java.lang.Object p0) {
java.lang.Object forwardValue1833_14_0;
    int forwardValue1833_24_0;
    int forwardValue1833_38_0;
    int forwardValue1833_38_1;
    int forwardValue1833_40_0;
    int forwardValue1833_42_0;
    moom.Ee spill1833_0;
    int spill1833_1;
    int spill1833_2;
    int spill1833_3;
    int spill1833_4;
    long life2_3;
    java.lang.String life4_5;
    moom.Ee life5_28;
    forward_join_42: {
    forward_join_41: {
    forward_join_40: {
    forward_join_38: {
    forward_join_25: {
    forward_join_24: {
    forward_join_23: {
    forward_join_14: {
    forward_join_13: {
    life2_3 = (moom.Ee.d ^ 45041391045937L);
    life4_5 = net.minecraft.world.World.c__String();
    spill1833_0 = this;
    if (!((life4_5 == null))) {
        forwardValue1833_14_0 = spill1833_0;
        break forward_join_14;
    }
    if (!((spill1833_0 == p0))) {
        break forward_join_13;
    }
    return ((1) != 0);
    }
    forwardValue1833_14_0 = p0;
    }
    spill1833_1 = ((forwardValue1833_14_0 instanceof moom.Ee) ? 1 : 0);
    if (!((life4_5 == null))) {
        forwardValue1833_24_0 = spill1833_1;
        break forward_join_24;
    }
    if (!((spill1833_1 != 0))) {
        break forward_join_23;
    }
    life5_28 = ((moom.Ee)(p0));
    if (!((life4_5 != null))) {
        break forward_join_25;
    }
    }
    forwardValue1833_24_0 = 0;
    }
    return ((forwardValue1833_24_0) != 0);
    }
    spill1833_2 = this.a;
    spill1833_3 = ((moom.Ee)(life5_28)).a;
    if (!((life4_5 == null))) {
        forwardValue1833_38_0 = spill1833_2;
        forwardValue1833_38_1 = spill1833_3;
        break forward_join_38;
    }
    if (!((spill1833_2 == spill1833_3))) {
        break forward_join_41;
    }
    spill1833_4 = this.b;
    if (!((life4_5 == null))) {
        forwardValue1833_40_0 = spill1833_4;
        break forward_join_40;
    }
    forwardValue1833_38_0 = spill1833_4;
    forwardValue1833_38_1 = ((moom.Ee)(life5_28)).b;
    }
    if (!((forwardValue1833_38_0 == forwardValue1833_38_1))) {
        break forward_join_41;
    }
    forwardValue1833_40_0 = 1;
    }
    forwardValue1833_42_0 = forwardValue1833_40_0;
    break forward_join_42;
    }
    forwardValue1833_42_0 = 0;
    }
    return ((forwardValue1833_42_0) != 0);
}


public java.lang.String toString() {
return __sourceIntrinsic_a86c261fcdee_originalDynamicSite1134_2(this.a, this.b);
}


public int hashCode() {
int forwardValue1834_54_0;
    int spill1834_0;
    long life1_3;
    java.lang.String life3_5;
    int life4_28;
    int life5_49;
    forward_join_54: {
    forward_join_52: {
    life1_3 = (moom.Ee.d ^ 79810634835378L);
    life3_5 = net.minecraft.world.World.c__String();
    spill1834_0 = this.c;
    if (!((life3_5 == null))) {
        forwardValue1834_54_0 = spill1834_0;
        break forward_join_54;
    }
    if (!((spill1834_0 == 0))) {
        break forward_join_52;
    }
    life4_28 = ((__sourceIntrinsic_1861091996aa_invokedynamic1834_3(16736, (7815649174535187317L ^ life1_3)) * this.a) + __sourceIntrinsic_1861091996aa_invokedynamic1834_5(12247, (3510977300800685507L ^ life1_3)));
    life5_49 = ((__sourceIntrinsic_1861091996aa_invokedynamic1834_6(29932, (6039533519731105530L ^ life1_3)) * (this.b ^ __sourceIntrinsic_1861091996aa_invokedynamic1834_8(11727, (6792433041081944019L ^ life1_3)))) + __sourceIntrinsic_1861091996aa_invokedynamic1834_9(15520, (8101479686052665011L ^ life1_3)));
    this.c = ((int)((life4_28 ^ life5_49)));
    }
    forwardValue1834_54_0 = this.c;
    }
    return forwardValue1834_54_0;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4373_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Ee"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
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
    life3_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 14891);
    if (((moom.Ee.i)[life3_8] == null)) {
        life4_77 = new byte[] {((byte) ((int) (p1 >>> 56))), ((byte) ((int) (p1 >>> 48))), ((byte) ((int) (p1 >>> 40))), ((byte) ((int) (p1 >>> 32))), ((byte) ((int) (p1 >>> 24))), ((byte) ((int) (p1 >>> 16))), ((byte) ((int) (p1 >>> 8))), ((byte) ((int) p1))};
        life5_81 = (moom.Ee.h)[life3_8];
        life7_146 = new byte[] {((byte) ((int) (life5_81 >>> 56))), ((byte) ((int) (life5_81 >>> 48))), ((byte) ((int) (life5_81 >>> 40))), ((byte) ((int) (life5_81 >>> 32))), ((byte) ((int) (life5_81 >>> 24))), ((byte) ((int) (life5_81 >>> 16))), ((byte) ((int) (life5_81 >>> 8))), ((byte) ((int) life5_81))};
        life8_150 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life9_155 = ((java.lang.Object[])(((java.util.Map)(moom.Ee.j)).get(((java.lang.Object)(life8_150)))));
        try {
        if ((life9_155 == null)) {
        life9_155 = new java.lang.Object[3];
        (life9_155)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding")));
        (life9_155)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life9_155)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.Ee.j)).put(((java.lang.Object)(life8_150)), ((java.lang.Object)(life9_155)));
    }
        life11_188 = new javax.crypto.spec.DESKeySpec(life4_77);
        life12_195 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life9_155)[1])))).generateSecret(((java.security.spec.KeySpec)(life11_188)));
        life13_200 = ((javax.crypto.Cipher)((life9_155)[0]));
        ((javax.crypto.Cipher)(life13_200)).init(((int)(2)), ((java.security.Key)(life12_195)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life9_155)[2])))));
        life10_212 = ((javax.crypto.Cipher)(life13_200)).doFinal(((byte[])(life7_146)));
    } catch (java.lang.Exception life11_214) {
        throw new java.lang.RuntimeException("moom/Ee", life11_214);
    }
        life11_290 = (((((((((((long) (life10_212)[0]) & 255L) << 56) | ((((long) (life10_212)[1]) & 255L) << 48)) | ((((long) (life10_212)[2]) & 255L) << 40)) | ((((long) (life10_212)[3]) & 255L) << 32)) | ((((long) (life10_212)[4]) & 255L) << 24)) | ((((long) (life10_212)[5]) & 255L) << 16)) | ((((long) (life10_212)[6]) & 255L) << 8)) | (((long) (life10_212)[7]) & 255L));
        (moom.Ee.i)[life3_8] = java.lang.Long.valueOf(((long)(life11_290)));
    }
    return ((java.lang.Long)((moom.Ee.i)[life3_8])).longValue();
}


private static long b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    long local7 = moom.Ee.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local9 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Long.TYPE)), ((java.lang.Object)(java.lang.Long.valueOf(((long)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local9)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public int b() {
long local1 = (moom.Ee.d ^ 11484446015219L);
    return ((this.b << 4) + __sourceIntrinsic_e1958f95391c_originalDynamicSite1135_2(2373, (6877154641515919380L ^ local1)));
}


public int e() {
long local1 = (moom.Ee.d ^ 83597333420267L);
    return ((this.a << 4) + __sourceIntrinsic_c4b63a62bb23_originalDynamicSite1136_2(28550, (1930011070730221774L ^ local1)));
}


public int c() {
return (this.a << 4);
}


public int f() {
long local1 = (moom.Ee.d ^ 2541846416723L);
    return ((this.b << 4) + __sourceIntrinsic_d5f736cb4191_originalDynamicSite1137_2(26243, (2621029698622465136L ^ local1)));
}


public int d() {
return (this.b << 4);
}


public int a() {
long local1 = (moom.Ee.d ^ 20204934901600L);
    return ((this.a << 4) + __sourceIntrinsic_8aebf151eadb_originalDynamicSite1138_2(30080, (2507702668702602565L ^ local1)));
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral4375_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Ee"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public static long a(int p0, int p1) {
long local2 = (moom.Ee.d ^ 83310242219308L);
    return ((((long) p0) & __sourceIntrinsic_137ba12f5377_originalDynamicSite1139_1(23383, (7915314712010233646L ^ local2))) | ((((long) p1) & __sourceIntrinsic_137ba12f5377_originalDynamicSite1139_2(13860, (4952800764937173596L ^ local2))) << __sourceIntrinsic_137ba12f5377_originalDynamicSite1139_3(18805, (6338071826035016694L ^ local2))));
}


public moom.DT a(int p0, int p1, int p2) {
return new moom.DT(((this.a << 4) + p0), p1, ((this.b << 4) + p2));
}


public moom.DT a(int p0) {
return new moom.DT(this.a(), p0, this.b());
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static int a(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x3CD8;
        if (f[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = e[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])g.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    g.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/Ee", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Ee.f[n2] = n4;
        }
        return f[n2];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.Ee.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite1134_2(int a0, int a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_invokedynamic1834_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_invokedynamic1834_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_invokedynamic1834_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_invokedynamic1834_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_invokedynamic1834_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4373_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e1958f95391c_originalDynamicSite1135_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c4b63a62bb23_originalDynamicSite1136_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d5f736cb4191_originalDynamicSite1137_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8aebf151eadb_originalDynamicSite1138_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral4375_0() throws E;

private static native <E extends Throwable> long __sourceIntrinsic_137ba12f5377_originalDynamicSite1139_1(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_137ba12f5377_originalDynamicSite1139_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_137ba12f5377_originalDynamicSite1139_3(int a0, long a1) throws E;
}
