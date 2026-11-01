package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class CO {

private moom.CO a;

private net.minecraft.util.EnumChatFormatting b;

private java.lang.Boolean c;

private java.lang.Boolean d;

private java.lang.Boolean e;

private java.lang.Boolean f;

private java.lang.Boolean g;

private moom.v2 h;

private moom.v3 i;

private java.lang.String j;

private static final moom.CO k;

private static final long l;

private static final long[] m;

private static final java.lang.Integer[] n;

private static final java.util.Map o;

public CO() {
super();
}


static {
l = ((long)(((moom._a)(moom._c.a(((long)(-5462387796665896660L)), ((long)(8229203365625812272L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(204953025040577L)))));
    o = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.CO.l ^ 125227023999593L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill503_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill503_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill503_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill503_14 = new byte[8];
    (__sourceSpill503_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill503_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation503_16 = __sourceSpill503_14;
    ((javax.crypto.Cipher)(__sourceSpill503_11)).init(((int)(__sourceSpill503_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill503_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation503_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "n´ýï\002þ`Ò7Ò'Ñ¾\024¦"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill503_25 = local6_life21;
        int __sourceSpill503_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill503_25)).substring(((int)(__sourceSpill503_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill503_30 = local8_life19;
        int __sourceSpill503_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill503_33 = new byte[8];
        (__sourceSpill503_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill503_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill503_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill503_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill503_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill503_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill503_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill503_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill503_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill503_34)).doFinal(((byte[])(__sourceSpill503_33)));
        (__sourceSpill503_30)[__sourceSpill503_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    m = ((long[])(local8_life19));
    n = ((java.lang.Integer[])(new java.lang.Integer[2]));
    k = ((moom.CO)(new moom.CP()));
}


public boolean equals(java.lang.Object p0) {
java.lang.Object forwardValue1605_14_0;
    java.lang.Object forwardValue1605_21_0;
    moom.CO forwardValue1605_38_0;
    moom.v2 forwardValue1605_84_0;
    moom.CO forwardValue1605_88_0;
    moom.v3 forwardValue1605_106_0;
    moom.CO forwardValue1605_110_0;
    java.lang.String forwardValue1605_126_0;
    int forwardValue1605_130_0;
    moom.CO spill1605_0;
    boolean spill1605_1;
    moom.CO spill1605_2;
    boolean spill1605_3;
    boolean spill1605_4;
    boolean spill1605_5;
    boolean spill1605_6;
    moom.v2 spill1605_7;
    moom.CO spill1605_8;
    moom.CO spill1605_9;
    moom.v3 spill1605_10;
    moom.CO spill1605_11;
    moom.CO spill1605_12;
    java.lang.String spill1605_13;
    boolean spill1605_14;
    long life2_3;
    int life4_5;
    moom.CO life6_32;
    int life5_245;
    int life5_249;
    forward_join_133: {
    forward_join_130: {
    forward_join_129: {
    forward_join_126: {
    forward_join_124: {
    forward_join_110: {
    forward_join_109: {
    forward_join_106: {
    forward_join_102: {
    forward_join_88: {
    forward_join_87: {
    forward_join_84: {
    forward_join_80: {
    forward_join_38: {
    forward_join_21: {
    forward_join_20: {
    forward_join_14: {
    forward_join_13: {
    life2_3 = (moom.CO.l ^ 43792523643365L);
    life4_5 = ((moom.DS.c__Boolean()) ? 1 : 0);
    spill1605_0 = this;
    if (!((life4_5 != 0))) {
        forwardValue1605_14_0 = spill1605_0;
        break forward_join_14;
    }
    if (!((spill1605_0 == p0))) {
        break forward_join_13;
    }
    return ((1) != 0);
    }
    forwardValue1605_14_0 = p0;
    }
    if (!((life4_5 != 0))) {
        forwardValue1605_21_0 = forwardValue1605_14_0;
        break forward_join_21;
    }
    if (!((((forwardValue1605_14_0 instanceof moom.CO) ? 1 : 0) == 0))) {
        break forward_join_20;
    }
    return ((0) != 0);
    }
    forwardValue1605_21_0 = p0;
    }
    life6_32 = ((moom.CO)(forwardValue1605_21_0));
    spill1605_1 = ((moom.CO)(this)).a__Boolean();
    if (!((life4_5 != 0))) {
        forwardValue1605_130_0 = ((spill1605_1) ? 1 : 0);
        break forward_join_130;
    }
    if (!((spill1605_1 == ((moom.CO)(life6_32)).a__Boolean()))) {
        break forward_join_129;
    }
    spill1605_2 = this;
    if (!((life4_5 != 0))) {
        forwardValue1605_38_0 = spill1605_2;
        break forward_join_38;
    }
    if (!((((moom.CO)(spill1605_2)).a__br() == ((moom.CO)(life6_32)).a__br()))) {
        break forward_join_129;
    }
    forwardValue1605_38_0 = this;
    }
    spill1605_3 = ((moom.CO)(forwardValue1605_38_0)).b__Boolean();
    if (!((life4_5 != 0))) {
        forwardValue1605_130_0 = ((spill1605_3) ? 1 : 0);
        break forward_join_130;
    }
    if (!((spill1605_3 == ((moom.CO)(life6_32)).b__Boolean()))) {
        break forward_join_129;
    }
    spill1605_4 = this.e();
    if (!((life4_5 != 0))) {
        forwardValue1605_130_0 = ((spill1605_4) ? 1 : 0);
        break forward_join_130;
    }
    if (!((spill1605_4 == ((moom.CO)(life6_32)).e()))) {
        break forward_join_129;
    }
    spill1605_5 = ((moom.CO)(this)).c__Boolean();
    if (!((life4_5 != 0))) {
        forwardValue1605_130_0 = ((spill1605_5) ? 1 : 0);
        break forward_join_130;
    }
    if (!((spill1605_5 == ((moom.CO)(life6_32)).c__Boolean()))) {
        break forward_join_129;
    }
    spill1605_6 = this.d();
    if (!((life4_5 != 0))) {
        forwardValue1605_130_0 = ((spill1605_6) ? 1 : 0);
        break forward_join_130;
    }
    if (!((spill1605_6 == ((moom.CO)(life6_32)).d()))) {
        break forward_join_129;
    }
    spill1605_7 = ((moom.CO)(this)).a__v2();
    if (!((life4_5 != 0))) {
        forwardValue1605_84_0 = spill1605_7;
        break forward_join_84;
    }
    if (!((spill1605_7 != null))) {
        break forward_join_80;
    }
    spill1605_8 = this;
    if (!((life4_5 != 0))) {
        forwardValue1605_88_0 = spill1605_8;
        break forward_join_88;
    }
    if (!((!((moom.v2)(((moom.CO)(spill1605_8)).a__v2())).equals(((java.lang.Object)(((moom.CO)(life6_32)).a__v2())))))) {
        break forward_join_87;
    }
    if (!((life4_5 == 0))) {
        break forward_join_129;
    }
    }
    spill1605_9 = life6_32;
    if (!((life4_5 != 0))) {
        forwardValue1605_88_0 = spill1605_9;
        break forward_join_88;
    }
    forwardValue1605_84_0 = ((moom.CO)(spill1605_9)).a__v2();
    }
    if (!((forwardValue1605_84_0 != null))) {
        break forward_join_87;
    }
    if (!((life4_5 == 0))) {
        break forward_join_129;
    }
    }
    forwardValue1605_88_0 = this;
    }
    spill1605_10 = ((moom.CO)(forwardValue1605_88_0)).a__v3();
    if (!((life4_5 != 0))) {
        forwardValue1605_106_0 = spill1605_10;
        break forward_join_106;
    }
    if (!((spill1605_10 != null))) {
        break forward_join_102;
    }
    spill1605_11 = this;
    if (!((life4_5 != 0))) {
        forwardValue1605_110_0 = spill1605_11;
        break forward_join_110;
    }
    if (!((!((moom.v3)(((moom.CO)(spill1605_11)).a__v3())).equals(((java.lang.Object)(((moom.CO)(life6_32)).a__v3())))))) {
        break forward_join_109;
    }
    if (!((life4_5 == 0))) {
        break forward_join_129;
    }
    }
    spill1605_12 = life6_32;
    if (!((life4_5 != 0))) {
        forwardValue1605_110_0 = spill1605_12;
        break forward_join_110;
    }
    forwardValue1605_106_0 = ((moom.CO)(spill1605_12)).a__v3();
    }
    if (!((forwardValue1605_106_0 != null))) {
        break forward_join_109;
    }
    if (!((life4_5 == 0))) {
        break forward_join_129;
    }
    }
    forwardValue1605_110_0 = this;
    }
    spill1605_13 = ((moom.CO)(forwardValue1605_110_0)).a();
    if (!((life4_5 != 0))) {
        forwardValue1605_126_0 = spill1605_13;
        break forward_join_126;
    }
    if (!((spill1605_13 != null))) {
        break forward_join_124;
    }
    spill1605_14 = ((java.lang.String)(this.a())).equals(((java.lang.Object)(((moom.CO)(life6_32)).a())));
    if (!((life4_5 != 0))) {
        forwardValue1605_130_0 = ((spill1605_14) ? 1 : 0);
        break forward_join_130;
    }
    if (!(spill1605_14)) {
        break forward_join_129;
    }
    if (!((life4_5 == 0))) {
        break forward_join_133;
    }
    }
    forwardValue1605_126_0 = ((moom.CO)(life6_32)).a();
    }
    if (!((forwardValue1605_126_0 == null))) {
        break forward_join_129;
    }
    if (!((life4_5 == 0))) {
        break forward_join_133;
    }
    }
    forwardValue1605_130_0 = 0;
    }
    life5_245 = forwardValue1605_130_0;
    return ((life5_245) != 0);
    }
    life5_249 = 1;
    return ((life5_249) != 0);
}


public java.lang.String toString() {
long local1 = (moom.CO.l ^ 963301083470L);
    return __sourceIntrinsic_a86c261fcdee_invokedynamic4056_10(((this.a != null) ? 1 : 0), this.b, this.c, this.d, this.e, this.g, ((moom.CO)(this)).a__v2(), ((moom.CO)(this)).a__v3(), this.a());
}


public int hashCode() {
long local1 = (moom.CO.l ^ 121787006049341L);
    int local3 = ((net.minecraft.util.EnumChatFormatting)(this.b)).hashCode();
    local3 = ((__sourceIntrinsic_1861091996aa_originalDynamicSite1080_3(5709, (4628867912599101825L ^ local1)) * local3) + ((java.lang.Boolean)(this.c)).hashCode());
    local3 = ((__sourceIntrinsic_1861091996aa_originalDynamicSite1080_6(28657, (6522780952124954684L ^ local1)) * local3) + ((java.lang.Boolean)(this.d)).hashCode());
    local3 = ((__sourceIntrinsic_1861091996aa_originalDynamicSite1080_9(28657, (6522780952124954684L ^ local1)) * local3) + ((java.lang.Boolean)(this.e)).hashCode());
    local3 = ((__sourceIntrinsic_1861091996aa_originalDynamicSite1080_12(28657, (6522780952124954684L ^ local1)) * local3) + ((java.lang.Boolean)(this.f)).hashCode());
    local3 = ((__sourceIntrinsic_1861091996aa_originalDynamicSite1080_15(28657, (6522780952124954684L ^ local1)) * local3) + ((java.lang.Boolean)(this.g)).hashCode());
    local3 = ((__sourceIntrinsic_1861091996aa_originalDynamicSite1080_18(28657, (6522780952124954684L ^ local1)) * local3) + ((moom.v2)(this.h)).hashCode());
    local3 = ((__sourceIntrinsic_1861091996aa_originalDynamicSite1080_21(28657, (6522780952124954684L ^ local1)) * local3) + ((moom.v3)(this.i)).hashCode());
    local3 = ((__sourceIntrinsic_1861091996aa_originalDynamicSite1080_24(28657, (6522780952124954684L ^ local1)) * local3) + ((java.lang.String)(this.j)).hashCode());
    return local3;
}


public java.lang.String b() {
moom.CO forwardValue1600_13_0;
    moom.CO forwardValue1600_18_0;
    java.lang.String forwardValue1600_21_0;
    moom.CO forwardValue1600_37_0;
    int forwardValue1600_47_0;
    int forwardValue1600_56_0;
    int forwardValue1600_65_0;
    int forwardValue1600_74_0;
    moom.CO spill1600_0;
    moom.CO spill1600_1;
    boolean spill1600_2;
    long life1_3;
    int life3_5;
    java.lang.StringBuilder life4_37;
    forward_join_79: {
    forward_join_74: {
    forward_join_72: {
    forward_join_65: {
    forward_join_63: {
    forward_join_56: {
    forward_join_54: {
    forward_join_47: {
    forward_join_45: {
    forward_join_37: {
    forward_join_36: {
    forward_join_22: {
    forward_join_21: {
    forward_join_20: {
    forward_join_18: {
    forward_join_13: {
    life1_3 = (moom.CO.l ^ 46264262121484L);
    life3_5 = ((moom.DS.b__Boolean()) ? 1 : 0);
    spill1600_0 = this;
    if (!((life3_5 == 0))) {
        forwardValue1600_13_0 = spill1600_0;
        break forward_join_13;
    }
    if (!(((moom.CO)(spill1600_0)).f())) {
        break forward_join_22;
    }
    forwardValue1600_13_0 = this.a;
    }
    if (!((life3_5 == 0))) {
        forwardValue1600_18_0 = forwardValue1600_13_0;
        break forward_join_18;
    }
    if (!((forwardValue1600_13_0 != null))) {
        break forward_join_20;
    }
    forwardValue1600_18_0 = this.a;
    }
    forwardValue1600_21_0 = ((moom.CO)(forwardValue1600_18_0)).b();
    break forward_join_21;
    }
    forwardValue1600_21_0 = "";
    }
    return forwardValue1600_21_0;
    }
    life4_37 = new java.lang.StringBuilder();
    spill1600_1 = this;
    if (!((life3_5 == 0))) {
        forwardValue1600_37_0 = spill1600_1;
        break forward_join_37;
    }
    if (!((((moom.CO)(spill1600_1)).a__br() != null))) {
        break forward_join_36;
    }
    ((java.lang.StringBuilder)(life4_37)).append(((java.lang.Object)(((moom.CO)(this)).a__br())));
    }
    forwardValue1600_37_0 = this;
    }
    spill1600_2 = ((moom.CO)(forwardValue1600_37_0)).a__Boolean();
    if (!((life3_5 == 0))) {
        forwardValue1600_47_0 = ((spill1600_2) ? 1 : 0);
        break forward_join_47;
    }
    if (!(spill1600_2)) {
        break forward_join_45;
    }
    ((java.lang.StringBuilder)(life4_37)).append(((java.lang.Object)(net.minecraft.util.EnumChatFormatting.BOLD)));
    }
    forwardValue1600_47_0 = ((((moom.CO)(this)).b__Boolean()) ? 1 : 0);
    }
    if (!((life3_5 == 0))) {
        forwardValue1600_56_0 = forwardValue1600_47_0;
        break forward_join_56;
    }
    if (!((forwardValue1600_47_0 != 0))) {
        break forward_join_54;
    }
    ((java.lang.StringBuilder)(life4_37)).append(((java.lang.Object)(net.minecraft.util.EnumChatFormatting.ITALIC)));
    }
    forwardValue1600_56_0 = ((this.d()) ? 1 : 0);
    }
    if (!((life3_5 == 0))) {
        forwardValue1600_65_0 = forwardValue1600_56_0;
        break forward_join_65;
    }
    if (!((forwardValue1600_56_0 != 0))) {
        break forward_join_63;
    }
    ((java.lang.StringBuilder)(life4_37)).append(((java.lang.Object)(net.minecraft.util.EnumChatFormatting.UNDERLINE)));
    }
    forwardValue1600_65_0 = ((this.e()) ? 1 : 0);
    }
    if (!((life3_5 == 0))) {
        forwardValue1600_74_0 = forwardValue1600_65_0;
        break forward_join_74;
    }
    if (!((forwardValue1600_65_0 != 0))) {
        break forward_join_72;
    }
    ((java.lang.StringBuilder)(life4_37)).append(((java.lang.Object)(net.minecraft.util.EnumChatFormatting.OBFUSCATED)));
    }
    forwardValue1600_74_0 = ((((moom.CO)(this)).c__Boolean()) ? 1 : 0);
    }
    if (!((forwardValue1600_74_0 != 0))) {
        break forward_join_79;
    }
    ((java.lang.StringBuilder)(life4_37)).append(((java.lang.Object)(net.minecraft.util.EnumChatFormatting.STRIKETHROUGH)));
    }
    return ((java.lang.StringBuilder)(life4_37)).toString();
}


public moom.CO b(java.lang.Boolean p0) {
this.d = ((java.lang.Boolean)(p0));
    return this;
}


public boolean b__Boolean() {
java.lang.Boolean forwardValue1601_17_0;
    int forwardValue1601_18_0;
    java.lang.Boolean spill1601_0;
    long life1_3;
    int life3_5;
    forward_join_18: {
    forward_join_17: {
    forward_join_15: {
    life1_3 = (moom.CO.l ^ 56262544709791L);
    life3_5 = ((moom.DS.c__Boolean()) ? 1 : 0);
    spill1601_0 = this.d;
    if (!((life3_5 != 0))) {
        forwardValue1601_17_0 = spill1601_0;
        break forward_join_17;
    }
    if (!((spill1601_0 == null))) {
        break forward_join_15;
    }
    forwardValue1601_18_0 = ((((moom.CO)(((moom.CO)(this)).a__CO())).b__Boolean()) ? 1 : 0);
    break forward_join_18;
    }
    forwardValue1601_17_0 = this.d;
    }
    forwardValue1601_18_0 = ((((java.lang.Boolean)(forwardValue1601_17_0)).booleanValue()) ? 1 : 0);
    }
    return ((forwardValue1601_18_0) != 0);
}


public moom.CO b__CO() {
moom.CO local1 = new moom.CO();
    ((moom.CO)(local1)).c = ((java.lang.Boolean)(this.c));
    ((moom.CO)(local1)).d = ((java.lang.Boolean)(this.d));
    ((moom.CO)(local1)).f = ((java.lang.Boolean)(this.f));
    ((moom.CO)(local1)).e = ((java.lang.Boolean)(this.e));
    ((moom.CO)(local1)).g = ((java.lang.Boolean)(this.g));
    ((moom.CO)(local1)).b = ((net.minecraft.util.EnumChatFormatting)(this.b));
    ((moom.CO)(local1)).h = ((moom.v2)(this.h));
    ((moom.CO)(local1)).i = ((moom.v3)(this.i));
    ((moom.CO)(local1)).a = ((moom.CO)(this.a));
    ((moom.CO)(local1)).j = ((java.lang.String)(this.j));
    return local1;
}


public moom.CO e(java.lang.Boolean p0) {
this.g = ((java.lang.Boolean)(p0));
    return this;
}


public boolean e() {
java.lang.Boolean forwardValue1604_17_0;
    int forwardValue1604_18_0;
    java.lang.Boolean spill1604_0;
    long life1_3;
    int life3_5;
    forward_join_18: {
    forward_join_17: {
    forward_join_15: {
    life1_3 = (moom.CO.l ^ 19730037622892L);
    life3_5 = ((moom.DS.b__Boolean()) ? 1 : 0);
    spill1604_0 = this.g;
    if (!((life3_5 == 0))) {
        forwardValue1604_17_0 = spill1604_0;
        break forward_join_17;
    }
    if (!((spill1604_0 == null))) {
        break forward_join_15;
    }
    forwardValue1604_18_0 = ((((moom.CO)(((moom.CO)(this)).a__CO())).e()) ? 1 : 0);
    break forward_join_18;
    }
    forwardValue1604_17_0 = this.g;
    }
    forwardValue1604_18_0 = ((((java.lang.Boolean)(forwardValue1604_17_0)).booleanValue()) ? 1 : 0);
    }
    return ((forwardValue1604_18_0) != 0);
}


public moom.CO c(java.lang.Boolean p0) {
this.f = ((java.lang.Boolean)(p0));
    return this;
}


public moom.CO c() {
moom.CO local1 = new moom.CO();
    ((moom.CO)(local1)).a(((java.lang.Boolean)(java.lang.Boolean.valueOf(((boolean)(((moom.CO)(this)).a__Boolean()))))));
    ((moom.CO)(local1)).b(((java.lang.Boolean)(java.lang.Boolean.valueOf(((boolean)(((moom.CO)(this)).b__Boolean()))))));
    ((moom.CO)(local1)).c(((java.lang.Boolean)(java.lang.Boolean.valueOf(((boolean)(((moom.CO)(this)).c__Boolean()))))));
    ((moom.CO)(local1)).d(((java.lang.Boolean)(java.lang.Boolean.valueOf(((boolean)(this.d()))))));
    ((moom.CO)(local1)).e(((java.lang.Boolean)(java.lang.Boolean.valueOf(((boolean)(this.e()))))));
    ((moom.CO)(local1)).a(((net.minecraft.util.EnumChatFormatting)(((moom.CO)(this)).a__br())));
    ((moom.CO)(local1)).a(((moom.v2)(((moom.CO)(this)).a__v2())));
    ((moom.CO)(local1)).a(((moom.v3)(((moom.CO)(this)).a__v3())));
    ((moom.CO)(local1)).a(((java.lang.String)(this.a())));
    return local1;
}


public boolean c__Boolean() {
java.lang.Boolean forwardValue1602_17_0;
    int forwardValue1602_18_0;
    java.lang.Boolean spill1602_0;
    long life1_3;
    int life3_5;
    forward_join_18: {
    forward_join_17: {
    forward_join_15: {
    life1_3 = (moom.CO.l ^ 72207781722428L);
    life3_5 = ((moom.DS.b__Boolean()) ? 1 : 0);
    spill1602_0 = this.f;
    if (!((life3_5 == 0))) {
        forwardValue1602_17_0 = spill1602_0;
        break forward_join_17;
    }
    if (!((spill1602_0 == null))) {
        break forward_join_15;
    }
    forwardValue1602_18_0 = ((((moom.CO)(((moom.CO)(this)).a__CO())).c__Boolean()) ? 1 : 0);
    break forward_join_18;
    }
    forwardValue1602_17_0 = this.f;
    }
    forwardValue1602_18_0 = ((((java.lang.Boolean)(forwardValue1602_17_0)).booleanValue()) ? 1 : 0);
    }
    return ((forwardValue1602_18_0) != 0);
}


public boolean f() {
java.lang.Boolean forwardValue1606_13_0;
    java.lang.Boolean forwardValue1606_18_0;
    java.lang.Boolean forwardValue1606_23_0;
    java.lang.Boolean forwardValue1606_30_0;
    moom.CO forwardValue1606_32_0;
    moom.CO forwardValue1606_37_0;
    moom.CO forwardValue1606_42_0;
    int forwardValue1606_47_0;
    java.lang.Boolean spill1606_0;
    moom.CO spill1606_1;
    long life1_3;
    int life3_5;
    forward_join_47: {
    forward_join_46: {
    forward_join_42: {
    forward_join_37: {
    forward_join_32: {
    forward_join_30: {
    forward_join_23: {
    forward_join_18: {
    forward_join_13: {
    life1_3 = (moom.CO.l ^ 79582363362842L);
    life3_5 = ((moom.DS.c__Boolean()) ? 1 : 0);
    spill1606_0 = this.c;
    if (!((life3_5 != 0))) {
        forwardValue1606_13_0 = spill1606_0;
        break forward_join_13;
    }
    if (!((spill1606_0 == null))) {
        break forward_join_46;
    }
    forwardValue1606_13_0 = this.d;
    }
    if (!((life3_5 != 0))) {
        forwardValue1606_18_0 = forwardValue1606_13_0;
        break forward_join_18;
    }
    if (!((forwardValue1606_13_0 == null))) {
        break forward_join_46;
    }
    forwardValue1606_18_0 = this.f;
    }
    if (!((life3_5 != 0))) {
        forwardValue1606_23_0 = forwardValue1606_18_0;
        break forward_join_23;
    }
    if (!((forwardValue1606_18_0 == null))) {
        break forward_join_46;
    }
    forwardValue1606_23_0 = this.e;
    }
    if (!((life3_5 != 0))) {
        forwardValue1606_30_0 = forwardValue1606_23_0;
        break forward_join_30;
    }
    if (!((forwardValue1606_23_0 == null))) {
        break forward_join_46;
    }
    spill1606_1 = this;
    if (!((life3_5 != 0))) {
        forwardValue1606_32_0 = spill1606_1;
        break forward_join_32;
    }
    forwardValue1606_30_0 = ((moom.CO)(spill1606_1)).g;
    }
    if (!((forwardValue1606_30_0 == null))) {
        break forward_join_46;
    }
    forwardValue1606_32_0 = this;
    }
    if (!((life3_5 != 0))) {
        forwardValue1606_37_0 = forwardValue1606_32_0;
        break forward_join_37;
    }
    if (!((((moom.CO)(forwardValue1606_32_0)).b == null))) {
        break forward_join_46;
    }
    forwardValue1606_37_0 = this;
    }
    if (!((life3_5 != 0))) {
        forwardValue1606_42_0 = forwardValue1606_37_0;
        break forward_join_42;
    }
    if (!((((moom.CO)(forwardValue1606_37_0)).h == null))) {
        break forward_join_46;
    }
    forwardValue1606_42_0 = this;
    }
    if (!((((moom.CO)(forwardValue1606_42_0)).i == null))) {
        break forward_join_46;
    }
    forwardValue1606_47_0 = 1;
    break forward_join_47;
    }
    forwardValue1606_47_0 = 0;
    }
    return ((forwardValue1606_47_0) != 0);
}


public boolean d() {
java.lang.Boolean forwardValue1603_17_0;
    int forwardValue1603_18_0;
    java.lang.Boolean spill1603_0;
    long life1_3;
    int life3_5;
    forward_join_18: {
    forward_join_17: {
    forward_join_15: {
    life1_3 = (moom.CO.l ^ 93956291956349L);
    life3_5 = ((moom.DS.b__Boolean()) ? 1 : 0);
    spill1603_0 = this.e;
    if (!((life3_5 == 0))) {
        forwardValue1603_17_0 = spill1603_0;
        break forward_join_17;
    }
    if (!((spill1603_0 == null))) {
        break forward_join_15;
    }
    forwardValue1603_18_0 = ((((moom.CO)(((moom.CO)(this)).a__CO())).d()) ? 1 : 0);
    break forward_join_18;
    }
    forwardValue1603_17_0 = this.e;
    }
    forwardValue1603_18_0 = ((((java.lang.Boolean)(forwardValue1603_17_0)).booleanValue()) ? 1 : 0);
    }
    return ((forwardValue1603_18_0) != 0);
}


public moom.CO d(java.lang.Boolean p0) {
this.e = ((java.lang.Boolean)(p0));
    return this;
}


public boolean a__Boolean() {
java.lang.Boolean forwardValue1595_17_0;
    int forwardValue1595_18_0;
    java.lang.Boolean spill1595_0;
    long life1_3;
    int life3_5;
    forward_join_18: {
    forward_join_17: {
    forward_join_15: {
    life1_3 = (moom.CO.l ^ 8428094669323L);
    life3_5 = ((moom.DS.c__Boolean()) ? 1 : 0);
    spill1595_0 = this.c;
    if (!((life3_5 != 0))) {
        forwardValue1595_17_0 = spill1595_0;
        break forward_join_17;
    }
    if (!((spill1595_0 == null))) {
        break forward_join_15;
    }
    forwardValue1595_18_0 = ((((moom.CO)(((moom.CO)(this)).a__CO())).a__Boolean()) ? 1 : 0);
    break forward_join_18;
    }
    forwardValue1595_17_0 = this.c;
    }
    forwardValue1595_18_0 = ((((java.lang.Boolean)(forwardValue1595_17_0)).booleanValue()) ? 1 : 0);
    }
    return ((forwardValue1595_18_0) != 0);
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral4064_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/CO"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.CO.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public net.minecraft.util.EnumChatFormatting a__br() {
moom.CO forwardValue1597_16_0;
    net.minecraft.util.EnumChatFormatting forwardValue1597_17_0;
    moom.CO spill1597_0;
    long life1_3;
    int life3_5;
    forward_join_17: {
    forward_join_16: {
    forward_join_15: {
    life1_3 = (moom.CO.l ^ 119910165410900L);
    life3_5 = ((moom.DS.b__Boolean()) ? 1 : 0);
    spill1597_0 = this;
    if (!((life3_5 == 0))) {
        forwardValue1597_16_0 = spill1597_0;
        break forward_join_16;
    }
    if (!((((moom.CO)(spill1597_0)).b == null))) {
        break forward_join_15;
    }
    forwardValue1597_17_0 = ((moom.CO)(((moom.CO)(this)).a__CO())).a__br();
    break forward_join_17;
    }
    forwardValue1597_16_0 = this;
    }
    forwardValue1597_17_0 = ((moom.CO)(forwardValue1597_16_0)).b;
    }
    return forwardValue1597_17_0;
}


private static int a(int p0, long p1) {
int n4 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0xCFE;
        if (CO.n[n4] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = m[n4];
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
                throw new RuntimeException("moom/CO", exception);
            }
            int n6 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CO.n[n4] = n6;
        }
        return CO.n[n4];
}


public moom.CO a(moom.v2 p0) {
this.h = ((moom.v2)(p0));
    return this;
}


public moom.v2 a__v2() {
moom.CO forwardValue1598_16_0;
    moom.v2 forwardValue1598_17_0;
    moom.CO spill1598_0;
    long life1_3;
    int life3_5;
    forward_join_17: {
    forward_join_16: {
    forward_join_15: {
    life1_3 = (moom.CO.l ^ 84868385498542L);
    life3_5 = ((moom.DS.b__Boolean()) ? 1 : 0);
    spill1598_0 = this;
    if (!((life3_5 == 0))) {
        forwardValue1598_16_0 = spill1598_0;
        break forward_join_16;
    }
    if (!((((moom.CO)(spill1598_0)).h == null))) {
        break forward_join_15;
    }
    forwardValue1598_17_0 = ((moom.CO)(((moom.CO)(this)).a__CO())).a__v2();
    break forward_join_17;
    }
    forwardValue1598_16_0 = this;
    }
    forwardValue1598_17_0 = ((moom.CO)(forwardValue1598_16_0)).h;
    }
    return forwardValue1598_17_0;
}


public moom.v3 a__v3() {
moom.CO forwardValue1599_16_0;
    moom.v3 forwardValue1599_17_0;
    moom.CO spill1599_0;
    long life1_3;
    int life3_5;
    forward_join_17: {
    forward_join_16: {
    forward_join_15: {
    life1_3 = (moom.CO.l ^ 45264441070043L);
    life3_5 = ((moom.DS.b__Boolean()) ? 1 : 0);
    spill1599_0 = this;
    if (!((life3_5 == 0))) {
        forwardValue1599_16_0 = spill1599_0;
        break forward_join_16;
    }
    if (!((((moom.CO)(spill1599_0)).i == null))) {
        break forward_join_15;
    }
    forwardValue1599_17_0 = ((moom.CO)(((moom.CO)(this)).a__CO())).a__v3();
    break forward_join_17;
    }
    forwardValue1599_16_0 = this;
    }
    forwardValue1599_17_0 = ((moom.CO)(forwardValue1599_16_0)).i;
    }
    return forwardValue1599_17_0;
}


public moom.CO a(java.lang.Boolean p0) {
this.c = ((java.lang.Boolean)(p0));
    return this;
}


public moom.CO a(net.minecraft.util.EnumChatFormatting p0) {
this.b = ((net.minecraft.util.EnumChatFormatting)(p0));
    return this;
}


private moom.CO a__CO() {
moom.CO forwardValue1596_14_0;
    moom.CO forwardValue1596_15_0;
    moom.CO spill1596_0;
    long life1_3;
    int life3_5;
    forward_join_15: {
    forward_join_14: {
    forward_join_13: {
    life1_3 = (moom.CO.l ^ 7423506196780L);
    life3_5 = ((moom.DS.c__Boolean()) ? 1 : 0);
    spill1596_0 = this.a;
    if (!((life3_5 != 0))) {
        forwardValue1596_14_0 = spill1596_0;
        break forward_join_14;
    }
    if (!((spill1596_0 == null))) {
        break forward_join_13;
    }
    forwardValue1596_15_0 = moom.CO.k;
    break forward_join_15;
    }
    forwardValue1596_14_0 = this;
    }
    forwardValue1596_15_0 = ((moom.CO)(forwardValue1596_14_0)).a;
    }
    return forwardValue1596_15_0;
}


public java.lang.String a() {
moom.CO forwardValue1594_16_0;
    java.lang.String forwardValue1594_17_0;
    moom.CO spill1594_0;
    long life1_3;
    int life3_5;
    forward_join_17: {
    forward_join_16: {
    forward_join_15: {
    life1_3 = (moom.CO.l ^ 50843742004469L);
    life3_5 = ((moom.DS.c__Boolean()) ? 1 : 0);
    spill1594_0 = this;
    if (!((life3_5 != 0))) {
        forwardValue1594_16_0 = spill1594_0;
        break forward_join_16;
    }
    if (!((((moom.CO)(spill1594_0)).j == null))) {
        break forward_join_15;
    }
    forwardValue1594_17_0 = ((moom.CO)(((moom.CO)(this)).a__CO())).a();
    break forward_join_17;
    }
    forwardValue1594_16_0 = this;
    }
    forwardValue1594_17_0 = ((moom.CO)(forwardValue1594_16_0)).j;
    }
    return forwardValue1594_17_0;
}


public moom.CO a(moom.CO p0) {
this.a = ((moom.CO)(p0));
    return this;
}


public moom.CO a(java.lang.String p0) {
this.j = ((java.lang.String)(p0));
    return this;
}


public moom.CO a(moom.v3 p0) {
this.i = ((moom.v3)(p0));
    return this;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_invokedynamic4056_10(int a0, net.minecraft.util.EnumChatFormatting a1, java.lang.Boolean a2, java.lang.Boolean a3, java.lang.Boolean a4, java.lang.Boolean a5, moom.v2 a6, moom.v3 a7, java.lang.String a8) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_originalDynamicSite1080_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_originalDynamicSite1080_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_originalDynamicSite1080_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_originalDynamicSite1080_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_originalDynamicSite1080_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_originalDynamicSite1080_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_originalDynamicSite1080_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_originalDynamicSite1080_24(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral4064_0() throws E;
}
