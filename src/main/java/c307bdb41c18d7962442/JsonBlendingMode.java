package net.minecraft.client.util;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class JsonBlendingMode {

private static net.minecraft.client.util.JsonBlendingMode a;

private int b;

private int c;

private int d;

private int e;

private int f;

private boolean g;

private boolean h;

private static long i;

private static long[] j;

private static java.lang.Integer[] k;

private static java.util.Map l;

public JsonBlendingMode(int p0, int p1, int p2, int p3, int p4) {
this(true, false, p0, p1, p2, p3, p4);
}


public JsonBlendingMode(int p0, int p1, int p2) {
this(false, false, p0, p1, p0, p1, p2);
}


public JsonBlendingMode() { this(false, false, 0, 0, 0, 0, 0); }


private static void __sourceConstructorBody_f24eb552473ec166(net.minecraft.client.util.JsonBlendingMode receiver) throws Throwable {

long local1_life1 = (net.minecraft.client.util.JsonBlendingMode.i ^ 121379361859901L);

    net.minecraft.client.util.JsonBlendingMode.__sourceConstructorInit_f24eb552473ec166_0(((net.minecraft.client.util.JsonBlendingMode)(receiver)), ((int)(0)), ((int)(1)), ((int)(1)), ((int)(0)), ((int)(1)), ((int)(0)), ((int)(__sourceIntrinsic_f24eb552473ec166_originalDynamicSite1093_2(28975, (796596760105976128L ^ local1_life1)))));

    return;

}



private JsonBlendingMode(boolean p0, boolean p1, int p2, int p3, int p4, int p5, int p6) {
super();
    this.g = p0;
    this.b = p2;
    this.d = p3;
    this.c = p4;
    this.e = p5;
    this.h = p1;
    this.f = p6;
}


static {
i = ((long)(((moom._a)(moom._c.a(((long)(5496335536008225937L)), ((long)(9203019584953843216L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(258332432872401L)))));
    l = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (net.minecraft.client.util.JsonBlendingMode.i ^ 92085377304132L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1839_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1839_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1839_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1839_14 = new byte[8];
    (__sourceSpill1839_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1839_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1839_16 = __sourceSpill1839_14;
    ((javax.crypto.Cipher)(__sourceSpill1839_11)).init(((int)(__sourceSpill1839_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1839_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1839_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[17];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "r²_¬\001h@\016ç±\"v\f_;?\177ÿ8ÈÿÑt\002ûc\022ØTëu©E\016å\037Á¹Å±ZÁQ %H\000C-è¼WbÈãg\035+É\013Þfì+|(¤2^\0068êúãK¨\036µÂ£Økô_VIÅw\026\007¼úT#Ã°Ûò\027ôù\031æ«Ì \fÎ$M¸"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1839_25 = local6_life21;
        int __sourceSpill1839_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1839_25)).substring(((int)(__sourceSpill1839_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1839_30 = local8_life19;
        int __sourceSpill1839_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1839_33 = new byte[8];
        (__sourceSpill1839_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1839_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1839_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1839_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1839_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1839_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1839_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1839_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1839_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1839_34)).doFinal(((byte[])(__sourceSpill1839_33)));
        (__sourceSpill1839_30)[__sourceSpill1839_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "\033Ëd\021Ä¤\b_ñíþ\fd\004\n"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1839_38 = local6_life21;
        int __sourceSpill1839_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1839_38)).substring(((int)(__sourceSpill1839_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1839_43 = local8_life19;
        int __sourceSpill1839_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1839_46 = new byte[8];
        (__sourceSpill1839_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1839_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1839_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1839_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1839_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1839_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1839_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1839_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1839_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1839_47)).doFinal(((byte[])(__sourceSpill1839_46)));
        (__sourceSpill1839_43)[__sourceSpill1839_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    j = ((long[])(local8_life19));
    k = ((java.lang.Integer[])(new java.lang.Integer[17]));
    a = ((net.minecraft.client.util.JsonBlendingMode)(null));
}

private static native <E extends Throwable> void __sourceConstructorInit_f24eb552473ec166_0(net.minecraft.client.util.JsonBlendingMode a0, int a1, int a2, int a3, int a4, int a5, int a6, int a7) throws E;

public boolean equals(java.lang.Object p0) {
java.lang.Object forwardValue4868_14_0;
    int forwardValue4868_24_0;
    int forwardValue4868_36_0;
    int forwardValue4868_36_1;
    int forwardValue4868_43_0;
    int forwardValue4868_43_1;
    int forwardValue4868_50_0;
    int forwardValue4868_50_1;
    int forwardValue4868_57_0;
    int forwardValue4868_57_1;
    int forwardValue4868_64_0;
    int forwardValue4868_64_1;
    int forwardValue4868_73_0;
    int forwardValue4868_73_1;
    int forwardValue4868_75_0;
    int forwardValue4868_77_0;
    net.minecraft.client.util.JsonBlendingMode spill4868_0;
    int spill4868_1;
    int spill4868_2;
    int spill4868_3;
    int spill4868_4;
    long life2_3;
    int[] life4_5;
    net.minecraft.client.util.JsonBlendingMode life5_28;
    forward_join_77: {
    forward_join_76: {
    forward_join_75: {
    forward_join_73: {
    forward_join_64: {
    forward_join_57: {
    forward_join_50: {
    forward_join_43: {
    forward_join_36: {
    forward_join_25: {
    forward_join_24: {
    forward_join_23: {
    forward_join_14: {
    forward_join_13: {
    life2_3 = (net.minecraft.client.util.JsonBlendingMode.i ^ 53375223677390L);
    life4_5 = moom.D.b();
    spill4868_0 = this;
    if (!((life4_5 == null))) {
        forwardValue4868_14_0 = spill4868_0;
        break forward_join_14;
    }
    if (!((spill4868_0 == p0))) {
        break forward_join_13;
    }
    return ((1) != 0);
    }
    forwardValue4868_14_0 = p0;
    }
    spill4868_1 = ((forwardValue4868_14_0 instanceof net.minecraft.client.util.JsonBlendingMode) ? 1 : 0);
    if (!((life4_5 == null))) {
        forwardValue4868_24_0 = spill4868_1;
        break forward_join_24;
    }
    if (!((spill4868_1 != 0))) {
        break forward_join_23;
    }
    life5_28 = ((net.minecraft.client.util.JsonBlendingMode)(p0));
    if (!((life4_5 != null))) {
        break forward_join_25;
    }
    }
    forwardValue4868_24_0 = 0;
    }
    return ((forwardValue4868_24_0) != 0);
    }
    spill4868_2 = this.f;
    spill4868_3 = ((net.minecraft.client.util.JsonBlendingMode)(life5_28)).f;
    if (!((life4_5 == null))) {
        forwardValue4868_36_0 = spill4868_2;
        forwardValue4868_36_1 = spill4868_3;
        break forward_join_36;
    }
    if (!((spill4868_2 == spill4868_3))) {
        break forward_join_76;
    }
    forwardValue4868_36_0 = this.e;
    forwardValue4868_36_1 = ((net.minecraft.client.util.JsonBlendingMode)(life5_28)).e;
    }
    if (!((life4_5 == null))) {
        forwardValue4868_43_0 = forwardValue4868_36_0;
        forwardValue4868_43_1 = forwardValue4868_36_1;
        break forward_join_43;
    }
    if (!((forwardValue4868_36_0 == forwardValue4868_36_1))) {
        break forward_join_76;
    }
    forwardValue4868_43_0 = this.d;
    forwardValue4868_43_1 = ((net.minecraft.client.util.JsonBlendingMode)(life5_28)).d;
    }
    if (!((life4_5 == null))) {
        forwardValue4868_50_0 = forwardValue4868_43_0;
        forwardValue4868_50_1 = forwardValue4868_43_1;
        break forward_join_50;
    }
    if (!((forwardValue4868_43_0 == forwardValue4868_43_1))) {
        break forward_join_76;
    }
    forwardValue4868_50_0 = ((this.h) ? 1 : 0);
    forwardValue4868_50_1 = ((((net.minecraft.client.util.JsonBlendingMode)(life5_28)).h) ? 1 : 0);
    }
    if (!((life4_5 == null))) {
        forwardValue4868_57_0 = forwardValue4868_50_0;
        forwardValue4868_57_1 = forwardValue4868_50_1;
        break forward_join_57;
    }
    if (!((forwardValue4868_50_0 == forwardValue4868_50_1))) {
        break forward_join_76;
    }
    forwardValue4868_57_0 = ((this.g) ? 1 : 0);
    forwardValue4868_57_1 = ((((net.minecraft.client.util.JsonBlendingMode)(life5_28)).g) ? 1 : 0);
    }
    if (!((life4_5 == null))) {
        forwardValue4868_64_0 = forwardValue4868_57_0;
        forwardValue4868_64_1 = forwardValue4868_57_1;
        break forward_join_64;
    }
    if (!((forwardValue4868_57_0 == forwardValue4868_57_1))) {
        break forward_join_76;
    }
    forwardValue4868_64_0 = this.c;
    forwardValue4868_64_1 = ((net.minecraft.client.util.JsonBlendingMode)(life5_28)).c;
    }
    if (!((life4_5 == null))) {
        forwardValue4868_73_0 = forwardValue4868_64_0;
        forwardValue4868_73_1 = forwardValue4868_64_1;
        break forward_join_73;
    }
    if (!((forwardValue4868_64_0 == forwardValue4868_64_1))) {
        break forward_join_76;
    }
    spill4868_4 = this.b;
    if (!((life4_5 == null))) {
        forwardValue4868_75_0 = spill4868_4;
        break forward_join_75;
    }
    forwardValue4868_73_0 = spill4868_4;
    forwardValue4868_73_1 = ((net.minecraft.client.util.JsonBlendingMode)(life5_28)).b;
    }
    if (!((forwardValue4868_73_0 == forwardValue4868_73_1))) {
        break forward_join_76;
    }
    forwardValue4868_75_0 = 1;
    }
    forwardValue4868_77_0 = forwardValue4868_75_0;
    break forward_join_77;
    }
    forwardValue4868_77_0 = 0;
    }
    return ((forwardValue4868_77_0) != 0);
}


public int hashCode() {
int forwardValue4869_66_0;
    int forwardValue4869_66_1;
    int forwardValue4869_67_0;
    int forwardValue4869_68_0;
    int forwardValue4869_68_1;
    int forwardValue4869_83_0;
    int forwardValue4869_83_1;
    int forwardValue4869_84_0;
    int forwardValue4869_85_0;
    int forwardValue4869_85_1;
    int forwardValue4869_93_0;
    int[] spill4869_0;
    int spill4869_1;
    boolean spill4869_2;
    int spill4869_3;
    boolean spill4869_4;
    int spill4869_5;
    long life1_3;
    int life4_6;
    int life4_18;
    int life4_29;
    int[] life3_30;
    int life4_41;
    int life4_52;
    int life4_72;
    int life4_92;
    forward_join_93: {
    forward_join_85: {
    forward_join_84: {
    forward_join_83: {
    forward_join_68: {
    forward_join_67: {
    forward_join_66: {
    life1_3 = (net.minecraft.client.util.JsonBlendingMode.i ^ 104580300855739L);
    life4_6 = this.b;
    spill4869_0 = moom.D.b();
    life4_18 = ((__sourceIntrinsic_1861091996aa_invokedynamic4869_3(20273, (7183618919377358800L ^ life1_3)) * life4_6) + this.c);
    life4_29 = ((__sourceIntrinsic_1861091996aa_invokedynamic4869_5(22793, (6671216998337468908L ^ life1_3)) * life4_18) + this.d);
    life3_30 = spill4869_0;
    life4_41 = ((__sourceIntrinsic_1861091996aa_invokedynamic4869_7(22793, (6671216998337468908L ^ life1_3)) * life4_29) + this.e);
    life4_52 = ((__sourceIntrinsic_1861091996aa_invokedynamic4869_9(22793, (6671216998337468908L ^ life1_3)) * life4_41) + this.f);
    spill4869_1 = (__sourceIntrinsic_1861091996aa_invokedynamic4869_11(22793, (6671216998337468908L ^ life1_3)) * life4_52);
    spill4869_2 = this.g;
    if (!((life3_30 == null))) {
        forwardValue4869_66_0 = spill4869_1;
        forwardValue4869_66_1 = ((spill4869_2) ? 1 : 0);
        break forward_join_66;
    }
    if (!(spill4869_2)) {
        forwardValue4869_67_0 = spill4869_1;
        break forward_join_67;
    }
    forwardValue4869_66_0 = spill4869_1;
    forwardValue4869_66_1 = 1;
    }
    forwardValue4869_68_0 = forwardValue4869_66_0;
    forwardValue4869_68_1 = forwardValue4869_66_1;
    break forward_join_68;
    }
    forwardValue4869_68_0 = forwardValue4869_67_0;
    forwardValue4869_68_1 = 0;
    }
    life4_72 = (forwardValue4869_68_0 + forwardValue4869_68_1);
    spill4869_3 = (__sourceIntrinsic_1861091996aa_invokedynamic4869_14(22793, (6671216998337468908L ^ life1_3)) * life4_72);
    spill4869_4 = this.h;
    if (!((life3_30 == null))) {
        forwardValue4869_83_0 = spill4869_3;
        forwardValue4869_83_1 = ((spill4869_4) ? 1 : 0);
        break forward_join_83;
    }
    if (!(spill4869_4)) {
        forwardValue4869_84_0 = spill4869_3;
        break forward_join_84;
    }
    forwardValue4869_83_0 = spill4869_3;
    forwardValue4869_83_1 = 1;
    }
    forwardValue4869_85_0 = forwardValue4869_83_0;
    forwardValue4869_85_1 = forwardValue4869_83_1;
    break forward_join_85;
    }
    forwardValue4869_85_0 = forwardValue4869_84_0;
    forwardValue4869_85_1 = 0;
    }
    life4_92 = (forwardValue4869_85_0 + forwardValue4869_85_1);
    spill4869_5 = life4_92;
    if (!((life3_30 != null))) {
        forwardValue4869_93_0 = spill4869_5;
        break forward_join_93;
    }
    net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[2])));
    forwardValue4869_93_0 = spill4869_5;
    }
    return forwardValue4869_93_0;
}


private static int b(java.lang.String p0) {
int forwardValue4867_41_0;
    int forwardValue4867_49_0;
    int forwardValue4867_61_0;
    int forwardValue4867_73_0;
    int forwardValue4867_85_0;
    int forwardValue4867_97_0;
    int forwardValue4867_109_0;
    int forwardValue4867_121_0;
    int forwardValue4867_133_0;
    int forwardValue4867_141_0;
    int forwardValue4867_143_0;
    int[] spill4867_0;
    boolean spill4867_1;
    long life1_3;
    java.lang.String life4_7;
    java.lang.String life4_13;
    java.lang.String life4_18;
    int[] life3_19;
    java.lang.String life4_24;
    java.lang.String life4_29;
    forward_join_143: {
    forward_join_142: {
    forward_join_141: {
    forward_join_133: {
    forward_join_130: {
    forward_join_121: {
    forward_join_118: {
    forward_join_109: {
    forward_join_106: {
    forward_join_97: {
    forward_join_94: {
    forward_join_85: {
    forward_join_82: {
    forward_join_73: {
    forward_join_70: {
    forward_join_61: {
    forward_join_58: {
    forward_join_49: {
    forward_join_46: {
    forward_join_41: {
    forward_join_38: {
    life1_3 = (net.minecraft.client.util.JsonBlendingMode.i ^ 110524722822023L);
    life4_7 = ((java.lang.String)(((java.lang.String)(p0)).trim())).toLowerCase();
    spill4867_0 = moom.D.b();
    life4_13 = ((java.lang.String)(life4_7)).replaceAll(((java.lang.String)("_")), ((java.lang.String)("")));
    life4_18 = ((java.lang.String)(life4_13)).replaceAll(((java.lang.String)("one")), ((java.lang.String)("1")));
    life3_19 = spill4867_0;
    life4_24 = ((java.lang.String)(life4_18)).replaceAll(((java.lang.String)("zero")), ((java.lang.String)("0")));
    life4_29 = ((java.lang.String)(life4_24)).replaceAll(((java.lang.String)("minus")), ((java.lang.String)("-")));
    spill4867_1 = ((java.lang.String)(life4_29)).equals(((java.lang.Object)("0")));
    if (!((life3_19 == null))) {
        forwardValue4867_41_0 = ((spill4867_1) ? 1 : 0);
        break forward_join_41;
    }
    if (!(spill4867_1)) {
        break forward_join_38;
    }
    forwardValue4867_143_0 = 0;
    break forward_join_143;
    }
    forwardValue4867_41_0 = ((((java.lang.String)(life4_29)).equals(((java.lang.Object)("1")))) ? 1 : 0);
    }
    if (!((life3_19 == null))) {
        forwardValue4867_49_0 = forwardValue4867_41_0;
        break forward_join_49;
    }
    if (!((forwardValue4867_41_0 != 0))) {
        break forward_join_46;
    }
    forwardValue4867_143_0 = 1;
    break forward_join_143;
    }
    forwardValue4867_49_0 = ((((java.lang.String)(life4_29)).equals(((java.lang.Object)("srccolor")))) ? 1 : 0);
    }
    if (!((life3_19 == null))) {
        forwardValue4867_61_0 = forwardValue4867_49_0;
        break forward_join_61;
    }
    if (!((forwardValue4867_49_0 != 0))) {
        break forward_join_58;
    }
    forwardValue4867_143_0 = __sourceIntrinsic_a9b1eb8ac462_invokedynamic4867_14(14132, (4082150847140189675L ^ life1_3));
    break forward_join_143;
    }
    forwardValue4867_61_0 = ((((java.lang.String)(life4_29)).equals(((java.lang.Object)("1-srccolor")))) ? 1 : 0);
    }
    if (!((life3_19 == null))) {
        forwardValue4867_73_0 = forwardValue4867_61_0;
        break forward_join_73;
    }
    if (!((forwardValue4867_61_0 != 0))) {
        break forward_join_70;
    }
    forwardValue4867_143_0 = __sourceIntrinsic_a9b1eb8ac462_invokedynamic4867_17(4426, (1003568583478113182L ^ life1_3));
    break forward_join_143;
    }
    forwardValue4867_73_0 = ((((java.lang.String)(life4_29)).equals(((java.lang.Object)("dstcolor")))) ? 1 : 0);
    }
    if (!((life3_19 == null))) {
        forwardValue4867_85_0 = forwardValue4867_73_0;
        break forward_join_85;
    }
    if (!((forwardValue4867_73_0 != 0))) {
        break forward_join_82;
    }
    forwardValue4867_143_0 = __sourceIntrinsic_a9b1eb8ac462_invokedynamic4867_20(20025, (727079342734847203L ^ life1_3));
    break forward_join_143;
    }
    forwardValue4867_85_0 = ((((java.lang.String)(life4_29)).equals(((java.lang.Object)("1-dstcolor")))) ? 1 : 0);
    }
    if (!((life3_19 == null))) {
        forwardValue4867_97_0 = forwardValue4867_85_0;
        break forward_join_97;
    }
    if (!((forwardValue4867_85_0 != 0))) {
        break forward_join_94;
    }
    forwardValue4867_143_0 = __sourceIntrinsic_a9b1eb8ac462_invokedynamic4867_23(17535, (3209989205148870319L ^ life1_3));
    break forward_join_143;
    }
    forwardValue4867_97_0 = ((((java.lang.String)(life4_29)).equals(((java.lang.Object)("srcalpha")))) ? 1 : 0);
    }
    if (!((life3_19 == null))) {
        forwardValue4867_109_0 = forwardValue4867_97_0;
        break forward_join_109;
    }
    if (!((forwardValue4867_97_0 != 0))) {
        break forward_join_106;
    }
    forwardValue4867_143_0 = __sourceIntrinsic_a9b1eb8ac462_invokedynamic4867_26(4733, (6184589109660807333L ^ life1_3));
    break forward_join_143;
    }
    forwardValue4867_109_0 = ((((java.lang.String)(life4_29)).equals(((java.lang.Object)("1-srcalpha")))) ? 1 : 0);
    }
    if (!((life3_19 == null))) {
        forwardValue4867_121_0 = forwardValue4867_109_0;
        break forward_join_121;
    }
    if (!((forwardValue4867_109_0 != 0))) {
        break forward_join_118;
    }
    forwardValue4867_143_0 = __sourceIntrinsic_a9b1eb8ac462_invokedynamic4867_29(16589, (6686911213641441820L ^ life1_3));
    break forward_join_143;
    }
    forwardValue4867_121_0 = ((((java.lang.String)(life4_29)).equals(((java.lang.Object)("dstalpha")))) ? 1 : 0);
    }
    if (!((life3_19 == null))) {
        forwardValue4867_133_0 = forwardValue4867_121_0;
        break forward_join_133;
    }
    if (!((forwardValue4867_121_0 != 0))) {
        break forward_join_130;
    }
    forwardValue4867_143_0 = __sourceIntrinsic_a9b1eb8ac462_invokedynamic4867_32(2458, (2939645322699664201L ^ life1_3));
    break forward_join_143;
    }
    forwardValue4867_133_0 = ((((java.lang.String)(life4_29)).equals(((java.lang.Object)("1-dstalpha")))) ? 1 : 0);
    }
    if (!((life3_19 == null))) {
        forwardValue4867_141_0 = forwardValue4867_133_0;
        break forward_join_141;
    }
    if (!((forwardValue4867_133_0 != 0))) {
        break forward_join_142;
    }
    forwardValue4867_141_0 = __sourceIntrinsic_a9b1eb8ac462_invokedynamic4867_35(11508, (7343624661245054506L ^ life1_3));
    }
    forwardValue4867_143_0 = forwardValue4867_141_0;
    break forward_join_143;
    }
    forwardValue4867_143_0 = -1;
    }
    return forwardValue4867_143_0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 17674;
      if (k[var3] == null) {
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
         long var5 = j[var3];
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
         Object[] var9 = (Object[])l.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               l.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/pI", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         k[var3] = var15;
      }

      return k[var3];
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral11000_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/pI"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.client.util.JsonBlendingMode.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public void a() {
net.minecraft.client.util.JsonBlendingMode forwardValue4864_13_0;
    net.minecraft.client.util.JsonBlendingMode forwardValue4864_28_0;
    int forwardValue4864_38_0;
    int forwardValue4864_54_0;
    net.minecraft.client.util.JsonBlendingMode spill4864_0;
    boolean spill4864_1;
    long life1_3;
    int[] life3_5;
    forward_join_57: {
    forward_join_54: {
    forward_join_52: {
    forward_join_38: {
    forward_join_33: {
    forward_join_32: {
    forward_join_31: {
    forward_join_28: {
    forward_join_23: {
    forward_join_13: {
    life1_3 = (net.minecraft.client.util.JsonBlendingMode.i ^ 80170156433195L);
    life3_5 = moom.D.b();
    spill4864_0 = this;
    if (!((life3_5 == null))) {
        forwardValue4864_13_0 = spill4864_0;
        break forward_join_13;
    }
    if (!((!((net.minecraft.client.util.JsonBlendingMode)(spill4864_0)).equals(((java.lang.Object)(net.minecraft.client.util.JsonBlendingMode.a)))))) {
        break forward_join_57;
    }
    forwardValue4864_13_0 = net.minecraft.client.util.JsonBlendingMode.a;
    }
    if (!((life3_5 == null))) {
        forwardValue4864_28_0 = forwardValue4864_13_0;
        break forward_join_28;
    }
    if (!((forwardValue4864_13_0 != null))) {
        break forward_join_23;
    }
    spill4864_1 = this.h;
    if (!((life3_5 == null))) {
        forwardValue4864_38_0 = ((spill4864_1) ? 1 : 0);
        break forward_join_38;
    }
    if (!((spill4864_1 != ((net.minecraft.client.util.JsonBlendingMode)(net.minecraft.client.util.JsonBlendingMode.a)).a__Boolean()))) {
        break forward_join_33;
    }
    }
    a = ((net.minecraft.client.util.JsonBlendingMode)(this));
    if (!((life3_5 == null))) {
        break forward_join_31;
    }
    forwardValue4864_28_0 = this;
    }
    if (!(((net.minecraft.client.util.JsonBlendingMode)(forwardValue4864_28_0)).h)) {
        break forward_join_32;
    }
    moom.kZ.k();
    }
    return;
    }
    moom.kZ.l();
    }
    org.lwjgl.opengl.GL14.glBlendEquation(((int)(this.f)));
    forwardValue4864_38_0 = ((this.g) ? 1 : 0);
    }
    if (!((life3_5 == null))) {
        forwardValue4864_54_0 = forwardValue4864_38_0;
        break forward_join_54;
    }
    if (!((forwardValue4864_38_0 != 0))) {
        break forward_join_52;
    }
    moom.kZ.a(((int)(this.b)), ((int)(this.d)), ((int)(this.c)), ((int)(this.e)));
    if (!((life3_5 != null))) {
        break forward_join_57;
    }
    }
    forwardValue4864_54_0 = this.b;
    }
    moom.kZ.b(((int)(forwardValue4864_54_0)), ((int)(this.d)));
    }
    return;
}


public boolean a__Boolean() {
return ((((this.h) ? 1 : 0)) != 0);
}


public static net.minecraft.client.util.JsonBlendingMode a(com.google.gson.JsonObject p0) {
int forwardValue4865_56_0;
    int forwardValue4865_75_0;
    int forwardValue4865_93_0;
    int forwardValue4865_110_0;
    int forwardValue4865_114_0;
    int forwardValue4865_130_0;
    int forwardValue4865_132_0;
    int forwardValue4865_140_0;
    net.minecraft.client.util.JsonBlendingMode forwardValue4865_156_0;
    boolean spill4865_0;
    int spill4865_1;
    int spill4865_2;
    int spill4865_3;
    int spill4865_4;
    int spill4865_5;
    long life1_3;
    int[] life3_5;
    int life4_19;
    int life5_21;
    int life6_23;
    int life7_25;
    int life8_27;
    int life9_29;
    int life10_31;
    forward_join_156: {
    forward_join_150: {
    forward_join_140: {
    forward_join_139: {
    forward_join_132: {
    forward_join_131: {
    forward_join_130: {
    forward_join_129: {
    forward_join_114: {
    forward_join_111: {
    forward_join_110: {
    forward_join_109: {
    forward_join_93: {
    forward_join_90: {
    forward_join_75: {
    forward_join_72: {
    forward_join_56: {
    forward_join_53: {
    forward_join_12: {
    life1_3 = (net.minecraft.client.util.JsonBlendingMode.i ^ 48102673953738L);
    life3_5 = moom.D.b();
    if (!((p0 == null))) {
        break forward_join_12;
    }
    return new net.minecraft.client.util.JsonBlendingMode();
    }
    life4_19 = __sourceIntrinsic_a48eb1be07fb_invokedynamic4865_2(28975, (796663602897230775L ^ life1_3));
    life5_21 = 1;
    life6_23 = 0;
    life7_25 = 1;
    life8_27 = 0;
    life9_29 = 1;
    life10_31 = 0;
    spill4865_0 = moom.Dg.a__Boolean(((com.google.gson.JsonObject)(p0)), ((java.lang.String)("func")));
    if (!((life3_5 == null))) {
        forwardValue4865_56_0 = ((spill4865_0) ? 1 : 0);
        break forward_join_56;
    }
    if (!(spill4865_0)) {
        break forward_join_53;
    }
    life4_19 = net.minecraft.client.util.JsonBlendingMode.a(((java.lang.String)(((com.google.gson.JsonElement)(((com.google.gson.JsonObject)(p0)).get(((java.lang.String)("func"))))).getAsString())));
    spill4865_1 = life4_19;
    if (!((life3_5 == null))) {
        forwardValue4865_56_0 = spill4865_1;
        break forward_join_56;
    }
    if (!((spill4865_1 != __sourceIntrinsic_a48eb1be07fb_invokedynamic4865_8(28975, (796663602897230775L ^ life1_3))))) {
        break forward_join_53;
    }
    life9_29 = 0;
    }
    forwardValue4865_56_0 = ((moom.Dg.a__Boolean(((com.google.gson.JsonObject)(p0)), ((java.lang.String)("srcrgb")))) ? 1 : 0);
    }
    if (!((life3_5 == null))) {
        forwardValue4865_75_0 = forwardValue4865_56_0;
        break forward_join_75;
    }
    if (!((forwardValue4865_56_0 != 0))) {
        break forward_join_72;
    }
    life5_21 = net.minecraft.client.util.JsonBlendingMode.b(((java.lang.String)(((com.google.gson.JsonElement)(((com.google.gson.JsonObject)(p0)).get(((java.lang.String)("srcrgb"))))).getAsString())));
    spill4865_2 = life5_21;
    if (!((life3_5 == null))) {
        forwardValue4865_75_0 = spill4865_2;
        break forward_join_75;
    }
    if (!((spill4865_2 != 1))) {
        break forward_join_72;
    }
    life9_29 = 0;
    }
    forwardValue4865_75_0 = ((moom.Dg.a__Boolean(((com.google.gson.JsonObject)(p0)), ((java.lang.String)("dstrgb")))) ? 1 : 0);
    }
    if (!((life3_5 == null))) {
        forwardValue4865_93_0 = forwardValue4865_75_0;
        break forward_join_93;
    }
    if (!((forwardValue4865_75_0 != 0))) {
        break forward_join_90;
    }
    life6_23 = net.minecraft.client.util.JsonBlendingMode.b(((java.lang.String)(((com.google.gson.JsonElement)(((com.google.gson.JsonObject)(p0)).get(((java.lang.String)("dstrgb"))))).getAsString())));
    spill4865_3 = life6_23;
    if (!((life3_5 == null))) {
        forwardValue4865_93_0 = spill4865_3;
        break forward_join_93;
    }
    if (!((spill4865_3 != 0))) {
        break forward_join_90;
    }
    life9_29 = 0;
    }
    forwardValue4865_93_0 = ((moom.Dg.a__Boolean(((com.google.gson.JsonObject)(p0)), ((java.lang.String)("srcalpha")))) ? 1 : 0);
    }
    if (!((life3_5 == null))) {
        forwardValue4865_114_0 = forwardValue4865_93_0;
        break forward_join_114;
    }
    if (!((forwardValue4865_93_0 != 0))) {
        break forward_join_111;
    }
    life7_25 = net.minecraft.client.util.JsonBlendingMode.b(((java.lang.String)(((com.google.gson.JsonElement)(((com.google.gson.JsonObject)(p0)).get(((java.lang.String)("srcalpha"))))).getAsString())));
    spill4865_4 = life7_25;
    if (!((life3_5 == null))) {
        forwardValue4865_110_0 = spill4865_4;
        break forward_join_110;
    }
    if (!((spill4865_4 != 1))) {
        break forward_join_109;
    }
    life9_29 = 0;
    }
    forwardValue4865_110_0 = 1;
    }
    life10_31 = forwardValue4865_110_0;
    }
    forwardValue4865_114_0 = ((moom.Dg.a__Boolean(((com.google.gson.JsonObject)(p0)), ((java.lang.String)("dstalpha")))) ? 1 : 0);
    }
    if (!((life3_5 == null))) {
        forwardValue4865_132_0 = forwardValue4865_114_0;
        break forward_join_132;
    }
    if (!((forwardValue4865_114_0 != 0))) {
        break forward_join_131;
    }
    life8_27 = net.minecraft.client.util.JsonBlendingMode.b(((java.lang.String)(((com.google.gson.JsonElement)(((com.google.gson.JsonObject)(p0)).get(((java.lang.String)("dstalpha"))))).getAsString())));
    spill4865_5 = life8_27;
    if (!((life3_5 == null))) {
        forwardValue4865_130_0 = spill4865_5;
        break forward_join_130;
    }
    if (!((spill4865_5 != 0))) {
        break forward_join_129;
    }
    life9_29 = 0;
    }
    forwardValue4865_130_0 = 1;
    }
    life10_31 = forwardValue4865_130_0;
    }
    forwardValue4865_132_0 = life9_29;
    }
    if (!((life3_5 == null))) {
        forwardValue4865_140_0 = forwardValue4865_132_0;
        break forward_join_140;
    }
    if (!((forwardValue4865_132_0 != 0))) {
        break forward_join_139;
    }
    forwardValue4865_156_0 = new net.minecraft.client.util.JsonBlendingMode();
    break forward_join_156;
    }
    forwardValue4865_140_0 = life10_31;
    }
    if (!((forwardValue4865_140_0 != 0))) {
        break forward_join_150;
    }
    forwardValue4865_156_0 = new net.minecraft.client.util.JsonBlendingMode(life5_21, life6_23, life7_25, life8_27, life4_19);
    break forward_join_156;
    }
    forwardValue4865_156_0 = new net.minecraft.client.util.JsonBlendingMode(life5_21, life6_23, life4_19);
    }
    return forwardValue4865_156_0;
}


private static int a(java.lang.String p0) {
int forwardValue4866_25_0;
    int forwardValue4866_37_0;
    int forwardValue4866_49_0;
    int forwardValue4866_61_0;
    int forwardValue4866_73_0;
    int forwardValue4866_81_0;
    int forwardValue4866_87_0;
    int[] spill4866_0;
    boolean spill4866_1;
    long life1_3;
    java.lang.String life4_8;
    int[] life3_9;
    forward_join_87: {
    forward_join_82: {
    forward_join_81: {
    forward_join_73: {
    forward_join_70: {
    forward_join_61: {
    forward_join_58: {
    forward_join_49: {
    forward_join_46: {
    forward_join_37: {
    forward_join_34: {
    forward_join_25: {
    forward_join_22: {
    life1_3 = (net.minecraft.client.util.JsonBlendingMode.i ^ 82483742508398L);
    spill4866_0 = moom.D.b();
    life4_8 = ((java.lang.String)(((java.lang.String)(p0)).trim())).toLowerCase();
    life3_9 = spill4866_0;
    spill4866_1 = ((java.lang.String)(life4_8)).equals(((java.lang.Object)("add")));
    if (!((life3_9 == null))) {
        forwardValue4866_25_0 = ((spill4866_1) ? 1 : 0);
        break forward_join_25;
    }
    if (!(spill4866_1)) {
        break forward_join_22;
    }
    forwardValue4866_87_0 = __sourceIntrinsic_599c5f800586_invokedynamic4866_6(15628, (7804828851109028146L ^ life1_3));
    break forward_join_87;
    }
    forwardValue4866_25_0 = ((((java.lang.String)(life4_8)).equals(((java.lang.Object)("subtract")))) ? 1 : 0);
    }
    if (!((life3_9 == null))) {
        forwardValue4866_37_0 = forwardValue4866_25_0;
        break forward_join_37;
    }
    if (!((forwardValue4866_25_0 != 0))) {
        break forward_join_34;
    }
    forwardValue4866_87_0 = __sourceIntrinsic_599c5f800586_invokedynamic4866_9(23915, (8997718109677584724L ^ life1_3));
    break forward_join_87;
    }
    forwardValue4866_37_0 = ((((java.lang.String)(life4_8)).equals(((java.lang.Object)("reversesubtract")))) ? 1 : 0);
    }
    if (!((life3_9 == null))) {
        forwardValue4866_49_0 = forwardValue4866_37_0;
        break forward_join_49;
    }
    if (!((forwardValue4866_37_0 != 0))) {
        break forward_join_46;
    }
    forwardValue4866_87_0 = __sourceIntrinsic_599c5f800586_invokedynamic4866_12(23687, (1022565676811911339L ^ life1_3));
    break forward_join_87;
    }
    forwardValue4866_49_0 = ((((java.lang.String)(life4_8)).equals(((java.lang.Object)("reverse_subtract")))) ? 1 : 0);
    }
    if (!((life3_9 == null))) {
        forwardValue4866_61_0 = forwardValue4866_49_0;
        break forward_join_61;
    }
    if (!((forwardValue4866_49_0 != 0))) {
        break forward_join_58;
    }
    forwardValue4866_87_0 = __sourceIntrinsic_599c5f800586_invokedynamic4866_15(12848, (3071878782060097035L ^ life1_3));
    break forward_join_87;
    }
    forwardValue4866_61_0 = ((((java.lang.String)(life4_8)).equals(((java.lang.Object)("min")))) ? 1 : 0);
    }
    if (!((life3_9 == null))) {
        forwardValue4866_73_0 = forwardValue4866_61_0;
        break forward_join_73;
    }
    if (!((forwardValue4866_61_0 != 0))) {
        break forward_join_70;
    }
    forwardValue4866_87_0 = __sourceIntrinsic_599c5f800586_invokedynamic4866_18(3896, (522849146715034378L ^ life1_3));
    break forward_join_87;
    }
    forwardValue4866_73_0 = ((((java.lang.String)(life4_8)).equals(((java.lang.Object)("max")))) ? 1 : 0);
    }
    if (!((life3_9 == null))) {
        forwardValue4866_81_0 = forwardValue4866_73_0;
        break forward_join_81;
    }
    if (!((forwardValue4866_73_0 != 0))) {
        break forward_join_82;
    }
    forwardValue4866_81_0 = __sourceIntrinsic_599c5f800586_invokedynamic4866_21(30308, (3077690191155243601L ^ life1_3));
    }
    forwardValue4866_87_0 = forwardValue4866_81_0;
    break forward_join_87;
    }
    forwardValue4866_87_0 = __sourceIntrinsic_599c5f800586_invokedynamic4866_22(28975, (796629056740863251L ^ life1_3));
    }
    return forwardValue4866_87_0;
}


private static native <E extends Throwable> int __sourceIntrinsic_f24eb552473ec166_originalDynamicSite1093_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a48eb1be07fb_invokedynamic4865_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a48eb1be07fb_invokedynamic4865_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_599c5f800586_invokedynamic4866_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_599c5f800586_invokedynamic4866_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_599c5f800586_invokedynamic4866_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_599c5f800586_invokedynamic4866_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_599c5f800586_invokedynamic4866_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_599c5f800586_invokedynamic4866_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_599c5f800586_invokedynamic4866_22(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral11000_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a9b1eb8ac462_invokedynamic4867_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a9b1eb8ac462_invokedynamic4867_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a9b1eb8ac462_invokedynamic4867_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a9b1eb8ac462_invokedynamic4867_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a9b1eb8ac462_invokedynamic4867_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a9b1eb8ac462_invokedynamic4867_29(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a9b1eb8ac462_invokedynamic4867_32(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a9b1eb8ac462_invokedynamic4867_35(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_invokedynamic4869_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_invokedynamic4869_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_invokedynamic4869_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_invokedynamic4869_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_invokedynamic4869_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_invokedynamic4869_14(int a0, long a1) throws E;
}
