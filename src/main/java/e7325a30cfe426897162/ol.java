package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class ol {

private static org.apache.logging.log4j.Logger a;

private static java.nio.IntBuffer b;

public static moom.n3 c;

public static int[] d;

private static int[] e;

private static int[] f;

private static long g;

private static long[] h;

private static java.lang.Integer[] i;

private static java.util.Map j;

public ol() {
super();
}


static { __sourceHandlerCall_ad347990d7c9ab8ff4e7(); }

private static native <E extends Throwable> void __sourceHandlerCall_ad347990d7c9ab8ff4e7() throws E;
private static final class __SourceHandler_ad347990d7c9ab8ff4e7 {

public static void f490() throws Throwable {
    javax.crypto.Cipher forestValue490_36_0;
    int forestValue490_36_1;
    javax.crypto.SecretKeyFactory forestValue490_36_2;
    byte[] forestValue490_36_3;
    javax.crypto.Cipher forestValue490_53_0;
    int forestValue490_53_1;
    javax.crypto.SecretKeyFactory forestValue490_53_2;
    byte[] forestValue490_53_3;
    long[] forestValue490_157_0;
    int forestValue490_157_1;
    long forestValue490_157_2;
    int forestValue490_157_3;
    long[] forestValue490_300_0;
    int forestValue490_300_1;
    long forestValue490_300_2;
    long[] forestValue490_312_0;
    int forestValue490_312_1;
    long forestValue490_312_2;
    int[] forestValue490_625_0;
    int[] forestValue490_642_0;
    javax.crypto.Cipher spill490_0;
    int spill490_1;
    javax.crypto.SecretKeyFactory spill490_2;
    byte[] spill490_3;
    byte[] spill490_4;
    java.lang.String spill490_5;
    int spill490_6;
    int spill490_7;
    long spill490_8;
    byte[] spill490_9;
    byte[] spill490_10;
    byte[] spill490_11;
    byte[] spill490_12;
    byte[] spill490_13;
    byte[] spill490_14;
    byte[] spill490_15;
    byte[] spill490_16;
    long spill490_17;
    int spill490_18;
    java.lang.String spill490_19;
    int spill490_20;
    long[] spill490_21;
    int spill490_22;
    long spill490_23;
    int spill490_24;
    int[] spill490_25;
    int[] spill490_26;
    int[] spill490_27;
    int[] spill490_28;
    int[] spill490_29;
    int[] spill490_30;
    int[] spill490_31;
    int[] spill490_32;
    int[] spill490_33;
    int[] spill490_34;
    int[] spill490_35;
    int[] spill490_36;
    int[] spill490_37;
    int[] spill490_38;
    int[] spill490_39;
    int[] spill490_40;
    long life11_11;
    javax.crypto.Cipher life0_20;
    int life1_35;
    long[] life6_66;
    int life3_68;
    java.lang.String life4_71;
    int life5_73;
    int life2_75;
    byte[] life7_83;
    long life8_160;
    byte[] life10_228;
    byte[] life7_325;
    int life13_444;
    int life14_450;
    int[] life15_529;
    int[] life16_608;
    int life17_611;
    int life18_613;
    forest_join_657: {
    forest_join_399: {
    forest_join_53: {
    __fieldWrite490_4(__call490_3(__call490_2(6580070474058700804L, 8181454588938057033L, __call490_1(__call490_0())), 31198184007279L));
    life11_11 = (__fieldRead490_5() ^ 53882538188861L);
    __fieldWrite490_6(new java.util.HashMap(13));
    spill490_0 = (life0_20 = __call490_7("DES/CBC/NoPadding"));
    spill490_1 = 2;
    spill490_2 = __call490_8("DES");
    byte[] __stackOp490_9_0 = new byte[8];
    spill490_3 = __stackOp490_9_0;
    (__stackOp490_9_0)[0] = ((byte) ((int) (life11_11 >>> 56)));
    life1_35 = 1;
    forestValue490_36_0 = spill490_0;
    forestValue490_36_1 = spill490_1;
    forestValue490_36_2 = spill490_2;
    forestValue490_36_3 = spill490_3;
    forest_cycle_36: while (true) {
    if (!((life1_35 < 8))) {
        forestValue490_53_0 = forestValue490_36_0;
        forestValue490_53_1 = forestValue490_36_1;
        forestValue490_53_2 = forestValue490_36_2;
        forestValue490_53_3 = forestValue490_36_3;
        break forest_join_53;
    }
    byte[] __stackOp490_10_0 = forestValue490_36_3;
    spill490_4 = __stackOp490_10_0;
    (__stackOp490_10_0)[life1_35] = ((byte) ((int) ((life11_11 << (life1_35 * 8)) >>> 56)));
    life1_35 += 1;
    forestValue490_36_3 = spill490_4;
    continue forest_cycle_36;
    }
    }
    __call490_12(forestValue490_53_0, forestValue490_53_1, __call490_11(forestValue490_53_2, new javax.crypto.spec.DESKeySpec(forestValue490_53_3)), new javax.crypto.spec.IvParameterSpec(new byte[8]));
    life6_66 = new long[54];
    life3_68 = 0;
    life5_73 = __call490_13((life4_71 = "j©|ëéø7\030\bFð\003I\\[ èzÿ¬ä\016*ø 8ohÒ÷\030V^îC7Þuy´¡\004»\022e\037iN\031¼»\020Lû\034\001q ]ÞèA)\0232_4H±w'ì\0069\024\bXXu-ç°rqÍÔ\t)\177\r¤£Ah)m}/ù&S5¨öaÆTnt±¬ßµî_BhY\034=^\003çw±\003Xàp:³(ëã\0354\034ØMëH\037\nBêo{Íì+§eúËÊ±§®¿M¬ª&\rK]/é¡¥¤ªó#½K¬nP\b¨\tÕgU4yM#Qh¼&çÎDÏ£¼¥ÎIÇ6Xuå\022¶ç\001V0>¯»R\017d\035XàôÇ0åQ´²åoK\027V\021\022ËNÝ\016\\º×í´(pÅO\006ÌQUf¡í;à³¨JX&;Å\0238Xáÿ`8w3]¯{Öðb¥<Üà!+ówHÔT3G\017\007g9!·H\t\017Vb\004î3´â\007ªÌ\b¬ÒÈv\021\021;\n\r2geµ\037£ì¬w0U\177y ¼Nr,ÏÀÊSUÆËtþ=2\001à CQ­N_&;ÝÖ\032¡65½À\036ºÝ&ä\n<"));
    life2_75 = 0;
    forest_cycle_76: while (true) {
    spill490_5 = life4_71;
    spill490_6 = life2_75;
    life2_75 += 8;
    life7_83 = __call490_15(__call490_14(spill490_5, spill490_6, life2_75), "ISO-8859-1");
    forestValue490_157_0 = life6_66;
    forestValue490_157_1 = (life3_68++);
    forestValue490_157_2 = (((((((((((long) (life7_83)[0]) & 255L) << 56) | ((((long) (life7_83)[1]) & 255L) << 48)) | ((((long) (life7_83)[2]) & 255L) << 40)) | ((((long) (life7_83)[3]) & 255L) << 32)) | ((((long) (life7_83)[4]) & 255L) << 24)) | ((((long) (life7_83)[5]) & 255L) << 16)) | ((((long) (life7_83)[6]) & 255L) << 8)) | (((long) (life7_83)[7]) & 255L));
    forestValue490_157_3 = -1;
    forest_cycle_157: while (true) {
    forest_join_317: {
    forest_join_312: {
    forest_join_300: {
    long __stackOp490_16_0 = forestValue490_157_2;
    int __stackOp490_16_1 = forestValue490_157_3;
    spill490_7 = __stackOp490_16_1;
    spill490_8 = __stackOp490_16_0;
    __discardScalar490_17(__stackOp490_16_1);
    life8_160 = spill490_8;
    byte[] __stackOp490_18_0 = new byte[8];
    spill490_9 = __stackOp490_18_0;
    (__stackOp490_18_0)[0] = ((byte) ((int) (life8_160 >>> 56)));
    byte[] __stackOp490_19_0 = spill490_9;
    spill490_10 = __stackOp490_19_0;
    (__stackOp490_19_0)[1] = ((byte) ((int) (life8_160 >>> 48)));
    byte[] __stackOp490_20_0 = spill490_10;
    spill490_11 = __stackOp490_20_0;
    (__stackOp490_20_0)[2] = ((byte) ((int) (life8_160 >>> 40)));
    byte[] __stackOp490_21_0 = spill490_11;
    spill490_12 = __stackOp490_21_0;
    (__stackOp490_21_0)[3] = ((byte) ((int) (life8_160 >>> 32)));
    byte[] __stackOp490_22_0 = spill490_12;
    spill490_13 = __stackOp490_22_0;
    (__stackOp490_22_0)[4] = ((byte) ((int) (life8_160 >>> 24)));
    byte[] __stackOp490_23_0 = spill490_13;
    spill490_14 = __stackOp490_23_0;
    (__stackOp490_23_0)[5] = ((byte) ((int) (life8_160 >>> 16)));
    byte[] __stackOp490_24_0 = spill490_14;
    spill490_15 = __stackOp490_24_0;
    (__stackOp490_24_0)[6] = ((byte) ((int) (life8_160 >>> 8)));
    byte[] __stackOp490_25_0 = spill490_15;
    spill490_16 = __stackOp490_25_0;
    (__stackOp490_25_0)[7] = ((byte) ((int) life8_160));
    byte[] __stackOp490_26_0 = spill490_16;
    javax.crypto.Cipher __stackOp490_26_1 = life0_20;
    life10_228 = __call490_27(__stackOp490_26_1, __stackOp490_26_0);
    int __stackOp490_28_0 = spill490_7;
    long __stackOp490_28_1 = (((((((((((long) (life10_228)[0]) & 255L) << 56) | ((((long) (life10_228)[1]) & 255L) << 48)) | ((((long) (life10_228)[2]) & 255L) << 40)) | ((((long) (life10_228)[3]) & 255L) << 32)) | ((((long) (life10_228)[4]) & 255L) << 24)) | ((((long) (life10_228)[5]) & 255L) << 16)) | ((((long) (life10_228)[6]) & 255L) << 8)) | (((long) (life10_228)[7]) & 255L));
    spill490_17 = __stackOp490_28_1;
    spill490_18 = __stackOp490_28_0;
    __discardWide490_29(__stackOp490_28_1);
    switch (spill490_18) {
default:
{
        forestValue490_300_0 = forestValue490_157_0;
        forestValue490_300_1 = forestValue490_157_1;
        forestValue490_300_2 = spill490_17;
        break forest_join_300;
    }
case 0:
{
        forestValue490_312_0 = forestValue490_157_0;
        forestValue490_312_1 = forestValue490_157_1;
        forestValue490_312_2 = spill490_17;
        break forest_join_312;
    }
}
    }
    (forestValue490_300_0)[forestValue490_300_1] = forestValue490_300_2;
    if (!((life2_75 >= life5_73))) {
        continue forest_cycle_76;
    }
    life5_73 = __call490_30((life4_71 = "P²u¬IZ|è4â>¬ä>"));
    life2_75 = 0;
    break forest_join_317;
    }
    (forestValue490_312_0)[forestValue490_312_1] = forestValue490_312_2;
    if (!((life2_75 >= life5_73))) {
        break forest_join_317;
    }
    break forest_join_399;
    }
    spill490_19 = life4_71;
    spill490_20 = life2_75;
    life2_75 += 8;
    life7_325 = __call490_32(__call490_31(spill490_19, spill490_20, life2_75), "ISO-8859-1");
    spill490_21 = life6_66;
    spill490_22 = (life3_68++);
    spill490_23 = (((((((((((long) (life7_325)[0]) & 255L) << 56) | ((((long) (life7_325)[1]) & 255L) << 48)) | ((((long) (life7_325)[2]) & 255L) << 40)) | ((((long) (life7_325)[3]) & 255L) << 32)) | ((((long) (life7_325)[4]) & 255L) << 24)) | ((((long) (life7_325)[5]) & 255L) << 16)) | ((((long) (life7_325)[6]) & 255L) << 8)) | (((long) (life7_325)[7]) & 255L));
    spill490_24 = 0;
    forestValue490_157_0 = spill490_21;
    forestValue490_157_1 = spill490_22;
    forestValue490_157_2 = spill490_23;
    forestValue490_157_3 = spill490_24;
    continue forest_cycle_157;
    }
    }
    }
    __fieldWrite490_33(life6_66);
    __fieldWrite490_34(new java.lang.Integer[54]);
    __fieldWrite490_36(__call490_35());
    __fieldWrite490_39(__call490_38(__invokedynamic490_37(216, (1239573407531947526L ^ life11_11))));
    __fieldWrite490_42(new moom.n3(__invokedynamic490_40(777, (8514947778916603334L ^ life11_11)), __invokedynamic490_41(777, (8514947778916603334L ^ life11_11))));
    __fieldWrite490_45(__call490_44(__fieldRead490_43()));
    __fieldWrite490_47(new int[__invokedynamic490_46(216, (1239573407531947526L ^ life11_11))]);
    life13_444 = __invokedynamic490_48(715, (4518060183119188994L ^ life11_11));
    life14_450 = __invokedynamic490_49(9810, (1001264294057603244L ^ life11_11));
    int[] __stackOp490_51_0 = new int[__invokedynamic490_50(23095, (2441369519056522495L ^ life11_11))];
    spill490_25 = __stackOp490_51_0;
    (__stackOp490_51_0)[0] = __invokedynamic490_52(11865, (6779815752291481742L ^ life11_11));
    int[] __stackOp490_53_0 = spill490_25;
    spill490_26 = __stackOp490_53_0;
    (__stackOp490_53_0)[1] = __invokedynamic490_54(11865, (6779815752291481742L ^ life11_11));
    int[] __stackOp490_55_0 = spill490_26;
    spill490_27 = __stackOp490_55_0;
    (__stackOp490_55_0)[2] = __invokedynamic490_56(11865, (6779815752291481742L ^ life11_11));
    int[] __stackOp490_57_0 = spill490_27;
    spill490_28 = __stackOp490_57_0;
    (__stackOp490_57_0)[3] = __invokedynamic490_58(11865, (6779815752291481742L ^ life11_11));
    int[] __stackOp490_59_0 = spill490_28;
    spill490_29 = __stackOp490_59_0;
    (__stackOp490_59_0)[4] = __invokedynamic490_60(11865, (6779815752291481742L ^ life11_11));
    int[] __stackOp490_61_0 = spill490_29;
    spill490_30 = __stackOp490_61_0;
    (__stackOp490_61_0)[5] = __invokedynamic490_62(11865, (6779815752291481742L ^ life11_11));
    int[] __stackOp490_63_0 = spill490_30;
    spill490_31 = __stackOp490_63_0;
    (__stackOp490_63_0)[__invokedynamic490_64(9620, (7860995778245882697L ^ life11_11))] = __invokedynamic490_65(11865, (6779815752291481742L ^ life11_11));
    int[] __stackOp490_66_0 = spill490_31;
    spill490_32 = __stackOp490_66_0;
    (__stackOp490_66_0)[__invokedynamic490_67(29061, (5236315220125394790L ^ life11_11))] = __invokedynamic490_68(11865, (6779815752291481742L ^ life11_11));
    life15_529 = spill490_32;
    int[] __stackOp490_70_0 = new int[__invokedynamic490_69(23095, (2441369519056522495L ^ life11_11))];
    spill490_33 = __stackOp490_70_0;
    (__stackOp490_70_0)[0] = __invokedynamic490_71(29368, (9152726655314895977L ^ life11_11));
    int[] __stackOp490_72_0 = spill490_33;
    spill490_34 = __stackOp490_72_0;
    (__stackOp490_72_0)[1] = __invokedynamic490_73(29368, (9152726655314895977L ^ life11_11));
    int[] __stackOp490_74_0 = spill490_34;
    spill490_35 = __stackOp490_74_0;
    (__stackOp490_74_0)[2] = __invokedynamic490_75(29368, (9152726655314895977L ^ life11_11));
    int[] __stackOp490_76_0 = spill490_35;
    spill490_36 = __stackOp490_76_0;
    (__stackOp490_76_0)[3] = __invokedynamic490_77(29368, (9152726655314895977L ^ life11_11));
    int[] __stackOp490_78_0 = spill490_36;
    spill490_37 = __stackOp490_78_0;
    (__stackOp490_78_0)[4] = __invokedynamic490_79(29368, (9152726655314895977L ^ life11_11));
    int[] __stackOp490_80_0 = spill490_37;
    spill490_38 = __stackOp490_80_0;
    (__stackOp490_80_0)[5] = __invokedynamic490_81(29368, (9152726655314895977L ^ life11_11));
    int[] __stackOp490_82_0 = spill490_38;
    spill490_39 = __stackOp490_82_0;
    (__stackOp490_82_0)[__invokedynamic490_83(9896, (5732507477820665932L ^ life11_11))] = __invokedynamic490_84(29368, (9152726655314895977L ^ life11_11));
    int[] __stackOp490_85_0 = spill490_39;
    spill490_40 = __stackOp490_85_0;
    (__stackOp490_85_0)[__invokedynamic490_86(13137, (2659598499791824264L ^ life11_11))] = __invokedynamic490_87(29368, (9152726655314895977L ^ life11_11));
    life16_608 = spill490_40;
    life17_611 = (life15_529).length;
    life18_613 = 0;
    forest_cycle_612: while (true) {
    forest_join_642: {
    forest_join_641: {
    forest_join_625: {
    forest_join_624: {
    if (!((life18_613 < __invokedynamic490_88(777, (8514947778916603334L ^ life11_11))))) {
        break forest_join_657;
    }
    if (!((life18_613 < life17_611))) {
        break forest_join_624;
    }
    forestValue490_625_0 = life15_529;
    break forest_join_625;
    }
    forestValue490_625_0 = life16_608;
    }
    __call490_91(forestValue490_625_0, 0, __fieldRead490_89(), (__invokedynamic490_90(777, (8514947778916603334L ^ life11_11)) * life18_613), life17_611);
    if (!((life18_613 < life17_611))) {
        break forest_join_641;
    }
    forestValue490_642_0 = life16_608;
    break forest_join_642;
    }
    forestValue490_642_0 = life15_529;
    }
    __call490_94(forestValue490_642_0, 0, __fieldRead490_92(), ((__invokedynamic490_93(777, (8514947778916603334L ^ life11_11)) * life18_613) + life17_611), life17_611);
    life18_613 += 1;
    continue forest_cycle_612;
    }
    }
    __call490_96(__fieldRead490_95());
    __fieldWrite490_97(new int[4]);
    return;
}
public static void h490_0(moom.Oo p0) throws Throwable {
    throw __call3049000_0(p0);
}
public static void h490_1(moom.Oo p0) throws Throwable {
    throw __call3049001_0(p0);
}
public static void h490_2(moom.Oo p0) throws Throwable {
    throw __call3049002_0(p0);
}
private static native java.lang.invoke.MethodHandles.Lookup __call490_0() throws Throwable;
private static native java.lang.Class __call490_1(java.lang.invoke.MethodHandles.Lookup a0) throws Throwable;
private static native moom._a __call490_2(long a0, long a1, java.lang.Class a2) throws Throwable;
private static native long __call490_3(moom._a a0, long a1) throws Throwable;
private static native void __fieldWrite490_4(long a0) throws Throwable;
private static native long __fieldRead490_5() throws Throwable;
private static native void __fieldWrite490_6(java.util.HashMap a0) throws Throwable;
private static native javax.crypto.Cipher __call490_7(java.lang.String a0) throws Throwable;
private static native javax.crypto.SecretKeyFactory __call490_8(java.lang.String a0) throws Throwable;
private static native javax.crypto.SecretKey __call490_11(javax.crypto.SecretKeyFactory a0, javax.crypto.spec.DESKeySpec a1) throws Throwable;
private static native void __call490_12(javax.crypto.Cipher a0, int a1, javax.crypto.SecretKey a2, javax.crypto.spec.IvParameterSpec a3) throws Throwable;
private static native int __call490_13(java.lang.String a0) throws Throwable;
private static native java.lang.String __call490_14(java.lang.String a0, int a1, int a2) throws Throwable;
private static native byte[] __call490_15(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __discardScalar490_17(int a0) throws Throwable;
private static native byte[] __call490_27(javax.crypto.Cipher a0, byte[] a1) throws Throwable;
private static native void __discardWide490_29(long a0) throws Throwable;
private static native int __call490_30(java.lang.String a0) throws Throwable;
private static native java.lang.String __call490_31(java.lang.String a0, int a1, int a2) throws Throwable;
private static native byte[] __call490_32(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite490_33(long[] a0) throws Throwable;
private static native void __fieldWrite490_34(java.lang.Integer[] a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __call490_35() throws Throwable;
private static native void __fieldWrite490_36(org.apache.logging.log4j.Logger a0) throws Throwable;
private static native int __invokedynamic490_37(int a0, long a1) throws Throwable;
private static native java.nio.IntBuffer __call490_38(int a0) throws Throwable;
private static native void __fieldWrite490_39(java.nio.IntBuffer a0) throws Throwable;
private static native int __invokedynamic490_40(int a0, long a1) throws Throwable;
private static native int __invokedynamic490_41(int a0, long a1) throws Throwable;
private static native void __fieldWrite490_42(moom.n3 a0) throws Throwable;
private static native moom.n3 __fieldRead490_43() throws Throwable;
private static native int[] __call490_44(moom.n3 a0) throws Throwable;
private static native void __fieldWrite490_45(int[] a0) throws Throwable;
private static native int __invokedynamic490_46(int a0, long a1) throws Throwable;
private static native void __fieldWrite490_47(int[] a0) throws Throwable;
private static native int __invokedynamic490_48(int a0, long a1) throws Throwable;
private static native int __invokedynamic490_49(int a0, long a1) throws Throwable;
private static native int __invokedynamic490_50(int a0, long a1) throws Throwable;
private static native int __invokedynamic490_52(int a0, long a1) throws Throwable;
private static native int __invokedynamic490_54(int a0, long a1) throws Throwable;
private static native int __invokedynamic490_56(int a0, long a1) throws Throwable;
private static native int __invokedynamic490_58(int a0, long a1) throws Throwable;
private static native int __invokedynamic490_60(int a0, long a1) throws Throwable;
private static native int __invokedynamic490_62(int a0, long a1) throws Throwable;
private static native int __invokedynamic490_64(int a0, long a1) throws Throwable;
private static native int __invokedynamic490_65(int a0, long a1) throws Throwable;
private static native int __invokedynamic490_67(int a0, long a1) throws Throwable;
private static native int __invokedynamic490_68(int a0, long a1) throws Throwable;
private static native int __invokedynamic490_69(int a0, long a1) throws Throwable;
private static native int __invokedynamic490_71(int a0, long a1) throws Throwable;
private static native int __invokedynamic490_73(int a0, long a1) throws Throwable;
private static native int __invokedynamic490_75(int a0, long a1) throws Throwable;
private static native int __invokedynamic490_77(int a0, long a1) throws Throwable;
private static native int __invokedynamic490_79(int a0, long a1) throws Throwable;
private static native int __invokedynamic490_81(int a0, long a1) throws Throwable;
private static native int __invokedynamic490_83(int a0, long a1) throws Throwable;
private static native int __invokedynamic490_84(int a0, long a1) throws Throwable;
private static native int __invokedynamic490_86(int a0, long a1) throws Throwable;
private static native int __invokedynamic490_87(int a0, long a1) throws Throwable;
private static native int __invokedynamic490_88(int a0, long a1) throws Throwable;
private static native int[] __fieldRead490_89() throws Throwable;
private static native int __invokedynamic490_90(int a0, long a1) throws Throwable;
private static native void __call490_91(int[] a0, int a1, int[] a2, int a3, int a4) throws Throwable;
private static native int[] __fieldRead490_92() throws Throwable;
private static native int __invokedynamic490_93(int a0, long a1) throws Throwable;
private static native void __call490_94(int[] a0, int a1, int[] a2, int a3, int a4) throws Throwable;
private static native moom.n3 __fieldRead490_95() throws Throwable;
private static native void __call490_96(moom.n3 a0) throws Throwable;
private static native void __fieldWrite490_97(int[] a0) throws Throwable;
private static native java.lang.Exception __call3049000_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3049001_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3049002_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_d4239d21c02716c8b7bc(int a0, int a1, int a2, int a3) throws E;
private static final class __SourceHandler_d4239d21c02716c8b7bc {

public static void f475(int p0, int p1, int p2, int p3) throws Throwable {
    long life4_3;
    java.lang.Class life6_5;
    java.lang.Class life7_8;
    int life7_70;
    forest_join_105: {
    forest_join_67: {
    life4_3 = (__fieldRead475_0() ^ 38644766787592L);
    life6_5 = __classLiteral475_1();
    __monitorEnter475_2((life7_8 = life6_5));
    __call475_3(p0);
    __call475_4(p0);
    __monitorExit475_5(life7_8);
    if (!((p1 >= 0))) {
        break forest_join_67;
    }
    __call475_8(__invokedynamic475_6(17067, (4606672603480636486L ^ life4_3)), __invokedynamic475_7(29210, (9170818495486725360L ^ life4_3)), p1);
    __call475_11(__invokedynamic475_9(17067, (4606672603480636486L ^ life4_3)), __invokedynamic475_10(30128, (5796091600824699742L ^ life4_3)), 0x0.0p0f);
    __call475_14(__invokedynamic475_12(17067, (4606672603480636486L ^ life4_3)), __invokedynamic475_13(27752, (8870111721431765663L ^ life4_3)), ((float) p1));
    __call475_17(__invokedynamic475_15(17067, (4606672603480636486L ^ life4_3)), __invokedynamic475_16(25388, (5595627138313133528L ^ life4_3)), 0x0.0p0f);
    }
    life7_70 = 0;
    forest_cycle_69: while (true) {
    if (!((life7_70 <= p1))) {
        break forest_join_105;
    }
    __call475_23(__invokedynamic475_18(17067, (4606672603480636486L ^ life4_3)), life7_70, __invokedynamic475_19(6990, (8230975497337726365L ^ life4_3)), (p2 >> life7_70), (p3 >> life7_70), 0, __invokedynamic475_20(9276, (4646981078541851376L ^ life4_3)), __invokedynamic475_21(22721, (2574348668220057099L ^ life4_3)), __cast475_22(null));
    life7_70 += 1;
    continue forest_cycle_69;
    }
    }
    return;
}
public static void h475_0(java.lang.Throwable p0, java.lang.Class p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __monitorExit3047500_0(p1);
    throw life2_2;
}
public static void h475_1(moom.Oo p0) throws Throwable {
    throw __call3047501_0(p0);
}
public static void h475_2(moom.Oo p0) throws Throwable {
    throw __call3047502_0(p0);
}
private static native long __fieldRead475_0() throws Throwable;
private static native java.lang.Class __classLiteral475_1() throws Throwable;
private static native void __monitorEnter475_2(java.lang.Class a0) throws Throwable;
private static native void __call475_3(int a0) throws Throwable;
private static native void __call475_4(int a0) throws Throwable;
private static native void __monitorExit475_5(java.lang.Class a0) throws Throwable;
private static native int __invokedynamic475_6(int a0, long a1) throws Throwable;
private static native int __invokedynamic475_7(int a0, long a1) throws Throwable;
private static native void __call475_8(int a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic475_9(int a0, long a1) throws Throwable;
private static native int __invokedynamic475_10(int a0, long a1) throws Throwable;
private static native void __call475_11(int a0, int a1, float a2) throws Throwable;
private static native int __invokedynamic475_12(int a0, long a1) throws Throwable;
private static native int __invokedynamic475_13(int a0, long a1) throws Throwable;
private static native void __call475_14(int a0, int a1, float a2) throws Throwable;
private static native int __invokedynamic475_15(int a0, long a1) throws Throwable;
private static native int __invokedynamic475_16(int a0, long a1) throws Throwable;
private static native void __call475_17(int a0, int a1, float a2) throws Throwable;
private static native int __invokedynamic475_18(int a0, long a1) throws Throwable;
private static native int __invokedynamic475_19(int a0, long a1) throws Throwable;
private static native int __invokedynamic475_20(int a0, long a1) throws Throwable;
private static native int __invokedynamic475_21(int a0, long a1) throws Throwable;
private static native java.nio.ByteBuffer __cast475_22(java.lang.Object a0) throws Throwable;
private static native void __call475_23(int a0, int a1, int a2, int a3, int a4, int a5, int a6, int a7, java.nio.ByteBuffer a8) throws Throwable;
private static native void __monitorExit3047500_0(java.lang.Class a0) throws Throwable;
private static native java.lang.Exception __call3047501_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3047502_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> int[][] __sourceHandlerCall_f2c273679bd0637f7d5f(int a0, int a1, int[][] a2) throws E;
private static final class __SourceHandler_f2c273679bd0637f7d5f {

public static int[][] f1888(int p0, int p1, int[][] p2) throws Throwable {
    long life3_3;
    int[][] life5_8;
    int life6_18;
    int life7_20;
    int life7_48;
    int[] life8_73;
    int[] life9_79;
    int life10_83;
    int life11_88;
    int life12_92;
    int life13_94;
    int life14_99;
    int life15_110;
    life3_3 = (__fieldRead1888_0() ^ 70817761238028L);
    life5_8 = new int[(p0 + 1)][];
    (life5_8)[0] = (p2)[0];
    if ((p0 > 0)) {
        life6_18 = 0;
        life7_20 = 0;
        loop_region_21: while ((life7_20 < ((p2)[0]).length)) {
        if (((((p2)[0])[life7_20] >> __invokedynamic1888_1(18626, (3393925249921376831L ^ life3_3))) == 0)) {
        life6_18 = 1;
        break loop_region_21;
    }
        life7_20 += 1;
    }
        life7_48 = 1;
        loop_region_46: while ((life7_48 <= p0)) {
        if (((p2)[life7_48] != null)) {
        (life5_8)[life7_48] = (p2)[life7_48];
    } else {
        life8_73 = (life5_8)[(life7_48 - 1)];
        life9_79 = new int[((life8_73).length >> 2)];
        life10_83 = (p1 >> life7_48);
        life11_88 = ((life9_79).length / life10_83);
        life12_92 = (life10_83 << 1);
        life13_94 = 0;
        loop_region_87: while ((life13_94 < life10_83)) {
        life14_99 = 0;
        loop_region_92: while ((life14_99 < life11_88)) {
        life15_110 = (2 * (life13_94 + (life14_99 * life12_92)));
        (life9_79)[(life13_94 + (life14_99 * life10_83))] = __call1888_2((life8_73)[life15_110], (life8_73)[(life15_110 + 1)], (life8_73)[(life15_110 + life12_92)], (life8_73)[((life15_110 + 1) + life12_92)], life6_18);
        life14_99 += 1;
    }
        life13_94 += 1;
    }
        (life5_8)[life7_48] = life9_79;
    }
        life7_48 += 1;
    }
    }
    return life5_8;
}
public static void h1888_0(moom.Oo p0) throws Throwable {
    throw __call1188800_0(p0);
}
public static void h1888_1(moom.Oo p0) throws Throwable {
    throw __call1188801_0(p0);
}
public static void h1888_2(moom.Oo p0) throws Throwable {
    throw __call1188802_0(p0);
}
private static native long __fieldRead1888_0() throws Throwable;
private static native int __invokedynamic1888_1(int a0, long a1) throws Throwable;
private static native int __call1888_2(int a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native java.lang.Exception __call1188800_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1188801_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1188802_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> java.awt.image.BufferedImage __sourceHandlerCall_f17f86040d8d7f8bbb4d(java.io.InputStream a0) throws E;
private static final class __SourceHandler_f17f86040d8d7f8bbb4d {

public static java.awt.image.BufferedImage f476(java.io.InputStream p0) throws Throwable {
    java.awt.image.BufferedImage life1_6;
    forest_join_4: {
    if (!((p0 == null))) {
        break forest_join_4;
    }
    return null;
    }
    life1_6 = __call476_0(p0);
    __call476_1(p0);
    return life1_6;
}
public static java.awt.image.BufferedImage h476_0(java.io.IOException p0) throws Throwable {
    throw __call3047600_0(p0);
}
public static java.awt.image.BufferedImage h476_1(java.lang.Throwable p0, java.io.InputStream p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __call3047601_0(p1);
    throw life2_2;
}
private static native java.awt.image.BufferedImage __call476_0(java.io.InputStream a0) throws Throwable;
private static native void __call476_1(java.io.InputStream a0) throws Throwable;
private static native java.lang.Exception __call3047600_0(java.io.IOException a0) throws Throwable;
private static native void __call3047601_0(java.io.InputStream a0) throws Throwable;

}

private static native <E extends Throwable> int[] __sourceHandlerCall_6623ad7ac88cdc91576c(moom.oR a0, moom.DD a1) throws E;
private static final class __SourceHandler_6623ad7ac88cdc91576c {

public static int[] f1890(moom.oR p0, moom.DD p1) throws Throwable {
    java.awt.image.BufferedImage life2_5;
    int life3_14;
    int life4_17;
    int[] life5_22;
    life2_5 = __call1890_2(__call1890_1(__call1890_0(p0, p1)));
    if ((life2_5 == null)) {
        return null;
    }
    life3_14 = __call1890_3(life2_5);
    life4_17 = __call1890_4(life2_5);
    life5_22 = new int[(life3_14 * life4_17)];
    __call1890_5(life2_5, 0, 0, life3_14, life4_17, life5_22, 0, life3_14);
    return life5_22;
}
public static void h1890_0(java.io.IOException p0) throws Throwable {
    throw __call1189000_0(p0);
}
private static native net.minecraft.client.resources.IResource __call1890_0(moom.oR a0, moom.DD a1) throws Throwable;
private static native java.io.InputStream __call1890_1(net.minecraft.client.resources.IResource a0) throws Throwable;
private static native java.awt.image.BufferedImage __call1890_2(java.io.InputStream a0) throws Throwable;
private static native int __call1890_3(java.awt.image.BufferedImage a0) throws Throwable;
private static native int __call1890_4(java.awt.image.BufferedImage a0) throws Throwable;
private static native int[] __call1890_5(java.awt.image.BufferedImage a0, int a1, int a2, int a3, int a4, int[] a5, int a6, int a7) throws Throwable;
private static native java.lang.Exception __call1189000_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_2f5c6f04b5d9579ab7b1(boolean a0) throws E;
private static final class __SourceHandler_2f5c6f04b5d9579ab7b1 {

public static void f100125(boolean p0) throws Throwable {
    long life1_3;
    forest_join_71: {
    forest_join_39: {
    life1_3 = (__fieldRead100125_0() ^ 31177218277085L);
    if (!(p0)) {
        break forest_join_39;
    }
    __call100125_4(__invokedynamic100125_1(17067, (4606636158861003411L ^ life1_3)), __invokedynamic100125_2(12898, (913545905876974181L ^ life1_3)), __invokedynamic100125_3(26221, (6016268842682871398L ^ life1_3)));
    __call100125_8(__invokedynamic100125_5(17067, (4606636158861003411L ^ life1_3)), __invokedynamic100125_6(28755, (7322538546943490173L ^ life1_3)), __invokedynamic100125_7(22380, (8708233598154334051L ^ life1_3)));
    break forest_join_71;
    }
    __call100125_12(__invokedynamic100125_9(17067, (4606636158861003411L ^ life1_3)), __invokedynamic100125_10(25573, (8385910937042086864L ^ life1_3)), __invokedynamic100125_11(341, (6772172301810043241L ^ life1_3)));
    __call100125_16(__invokedynamic100125_13(17067, (4606636158861003411L ^ life1_3)), __invokedynamic100125_14(350, (2161011374213663044L ^ life1_3)), __invokedynamic100125_15(14345, (6310342029914648581L ^ life1_3)));
    }
    return;
}
public static void h100125_0(moom.Oo p0) throws Throwable {
    throw __call13012500_0(p0);
}
private static native long __fieldRead100125_0() throws Throwable;
private static native int __invokedynamic100125_1(int a0, long a1) throws Throwable;
private static native int __invokedynamic100125_2(int a0, long a1) throws Throwable;
private static native int __invokedynamic100125_3(int a0, long a1) throws Throwable;
private static native void __call100125_4(int a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic100125_5(int a0, long a1) throws Throwable;
private static native int __invokedynamic100125_6(int a0, long a1) throws Throwable;
private static native int __invokedynamic100125_7(int a0, long a1) throws Throwable;
private static native void __call100125_8(int a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic100125_9(int a0, long a1) throws Throwable;
private static native int __invokedynamic100125_10(int a0, long a1) throws Throwable;
private static native int __invokedynamic100125_11(int a0, long a1) throws Throwable;
private static native void __call100125_12(int a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic100125_13(int a0, long a1) throws Throwable;
private static native int __invokedynamic100125_14(int a0, long a1) throws Throwable;
private static native int __invokedynamic100125_15(int a0, long a1) throws Throwable;
private static native void __call100125_16(int a0, int a1, int a2) throws Throwable;
private static native java.lang.Exception __call13012500_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_512a73c6438280e420e3(boolean a0, boolean a1) throws E;
private static final class __SourceHandler_512a73c6438280e420e3 {

public static void f412(boolean p0, boolean p1) throws Throwable {
    long life2_3;
    int life4_53;
    life2_3 = (__fieldRead412_0() ^ 26990822530068L);
    if (p0) {
        int spill412_0 = __invokedynamic412_1(17067, (4606632640354183258L ^ life2_3));
        int spill412_1 = __invokedynamic412_2(10408, (5024961109854880367L ^ life2_3));
        __call412_5(spill412_0, spill412_1, (p1 ? __invokedynamic412_3(5119, (7462951629100005636L ^ life2_3)) : __invokedynamic412_4(19570, (5460288042611533490L ^ life2_3))));
        __call412_9(__invokedynamic412_6(17067, (4606632640354183258L ^ life2_3)), __invokedynamic412_7(2290, (4637876717476749846L ^ life2_3)), __invokedynamic412_8(9864, (9112201861997464652L ^ life2_3)));
    } else {
        life4_53 = __call412_10();
        int spill412_2 = __invokedynamic412_11(17067, (4606632640354183258L ^ life2_3));
        int spill412_3 = __invokedynamic412_12(537, (125440434243840240L ^ life2_3));
        __call412_14(spill412_2, spill412_3, (p1 ? life4_53 : __invokedynamic412_13(9610, (8559428810289811302L ^ life2_3))));
        __call412_18(__invokedynamic412_15(17067, (4606632640354183258L ^ life2_3)), __invokedynamic412_16(14864, (1071328251835519193L ^ life2_3)), __invokedynamic412_17(15735, (6084067105623709627L ^ life2_3)));
    }
    return;
}
public static void h412_0(moom.Oo p0) throws Throwable {
    throw __call2041200_0(p0);
}
public static void h412_1(moom.Oo p0) throws Throwable {
    throw __call2041201_0(p0);
}
public static void h412_2(moom.Oo p0) throws Throwable {
    throw __call2041202_0(p0);
}
private static native long __fieldRead412_0() throws Throwable;
private static native int __invokedynamic412_1(int a0, long a1) throws Throwable;
private static native int __invokedynamic412_2(int a0, long a1) throws Throwable;
private static native int __invokedynamic412_3(int a0, long a1) throws Throwable;
private static native int __invokedynamic412_4(int a0, long a1) throws Throwable;
private static native void __call412_5(int a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic412_6(int a0, long a1) throws Throwable;
private static native int __invokedynamic412_7(int a0, long a1) throws Throwable;
private static native int __invokedynamic412_8(int a0, long a1) throws Throwable;
private static native void __call412_9(int a0, int a1, int a2) throws Throwable;
private static native int __call412_10() throws Throwable;
private static native int __invokedynamic412_11(int a0, long a1) throws Throwable;
private static native int __invokedynamic412_12(int a0, long a1) throws Throwable;
private static native int __invokedynamic412_13(int a0, long a1) throws Throwable;
private static native void __call412_14(int a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic412_15(int a0, long a1) throws Throwable;
private static native int __invokedynamic412_16(int a0, long a1) throws Throwable;
private static native int __invokedynamic412_17(int a0, long a1) throws Throwable;
private static native void __call412_18(int a0, int a1, int a2) throws Throwable;
private static native java.lang.Exception __call2041200_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call2041201_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call2041202_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> int[] __sourceHandlerCall_76276cf28ddf777f3b79(int[] a0) throws E;
private static final class __SourceHandler_76276cf28ddf777f3b79 {

public static int[] f1893(int[] p0) throws Throwable {
    int[] life1_3;
    int life2_5;
    life1_3 = new int[(p0).length];
    life2_5 = 0;
    loop_region_6: while ((life2_5 < (p0).length)) {
        (life1_3)[life2_5] = __call1893_0((p0)[life2_5]);
        life2_5 += 1;
    }
    return life1_3;
}
public static void h1893_0(moom.Oo p0) throws Throwable {
    throw __call1189300_0(p0);
}
private static native int __call1893_0(int a0) throws Throwable;
private static native java.lang.Exception __call1189300_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_dc514411685646d190e4(int[][] a0, int a1, int a2, int a3, int a4, boolean a5, boolean a6) throws E;
private static final class __SourceHandler_dc514411685646d190e4 {

public static void f1894(int[][] p0, int p1, int p2, int p3, int p4, boolean p5, boolean p6) throws Throwable {
    int life7_1;
    int[] life8_9;
    life7_1 = 0;
    loop_region_2: while ((life7_1 < (p0).length)) {
        life8_9 = (p0)[life7_1];
        int spill1894_0 = life7_1;
        int[] spill1894_1 = life8_9;
        int spill1894_2 = (p1 >> life7_1);
        int spill1894_3 = (p2 >> life7_1);
        int spill1894_4 = (p3 >> life7_1);
        int spill1894_5 = (p4 >> life7_1);
        boolean spill1894_6 = p5;
        boolean spill1894_7 = p6;
        __call1894_0(spill1894_0, spill1894_1, spill1894_2, spill1894_3, spill1894_4, spill1894_5, spill1894_6, spill1894_7, (((p0).length > 1) ? 1 : 0));
        life7_1 += 1;
    }
    return;
}
public static void h1894_0(moom.Oo p0) throws Throwable {
    throw __call1189400_0(p0);
}
private static native void __call1894_0(int a0, int[] a1, int a2, int a3, int a4, int a5, boolean a6, boolean a7, int a8) throws Throwable;
private static native java.lang.Exception __call1189400_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_d62f0e6f9a363ee28a7b(int[] a0, int a1, int a2) throws E;
private static final class __SourceHandler_d62f0e6f9a363ee28a7b {

public static void f1895(int[] p0, int p1, int p2) throws Throwable {
    int[] life3_2;
    int life4_6;
    int life5_8;
    life3_2 = new int[p1];
    life4_6 = (p2 / 2);
    life5_8 = 0;
    loop_region_9: while ((life5_8 < life4_6)) {
        __call1895_0(p0, (life5_8 * p1), life3_2, 0, p1);
        __call1895_1(p0, (((p2 - 1) - life5_8) * p1), p0, (life5_8 * p1), p1);
        __call1895_2(life3_2, 0, p0, (((p2 - 1) - life5_8) * p1), p1);
        life5_8 += 1;
    }
    return;
}
public static void h1895_0(moom.Oo p0) throws Throwable {
    throw __call1189500_0(p0);
}
private static native void __call1895_0(int[] a0, int a1, int[] a2, int a3, int a4) throws Throwable;
private static native void __call1895_1(int[] a0, int a1, int[] a2, int a3, int a4) throws Throwable;
private static native void __call1895_2(int[] a0, int a1, int[] a2, int a3, int a4) throws Throwable;
private static native java.lang.Exception __call1189500_0(moom.Oo a0) throws Throwable;

}


static void b(int p0) {
moom.kZ.i(((int)(p0)));
    return;
}


public static void b(int[] p0, int p1, int p2) { __sourceHandlerCall_d62f0e6f9a363ee28a7b(p0, p1, p2); }


private static void b(boolean p0) {
moom.ol.a(((boolean)(p0)), ((boolean)(false)));
    return;
}


public static int[] a(moom.oR p0, moom.DD p1) throws java.io.IOException { return __sourceHandlerCall_6623ad7ac88cdc91576c(p0, p1); }


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral8592_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/ol"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static void a(int[] p0, int p1, int p2) {
int[] local3 = p0;
    if ((((((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).W)).p) ? 1 : 0) != 0)) {
        local3 = moom.ol.a(((int[])(p0)));
    }
    ((java.nio.IntBuffer)(moom.ol.b)).clear();
    ((java.nio.IntBuffer)(moom.ol.b)).put(((int[])(local3)), ((int)(p1)), ((int)(p2)));
    ((java.nio.IntBuffer)(((java.nio.IntBuffer)(moom.ol.b)).position(((int)(0))))).limit(((int)(p2)));
    return;
}


private static void a(int[] p0, int p1) {
moom.ol.a(((int[])(p0)), ((int)(0)), ((int)(p1)));
    return;
}


public static void a(boolean p0, boolean p1) { __sourceHandlerCall_512a73c6438280e420e3(p0, p1); }


public static int[] a(int[] p0) { return __sourceHandlerCall_76276cf28ddf777f3b79(p0); }


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 8061;
      if (i[var3] == null) {
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
         long var5 = h[var3];
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
         Object[] var9 = (Object[])j.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               j.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/ol", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         i[var3] = var15;
      }

      return i[var3];
}


public static int a(int p0) {
long local1 = (moom.ol.g ^ 69617537943320L);
    int local3 = ((p0 >> __sourceIntrinsic_5c51e7cdc795_originalDynamicSite1580_1(6095, (2057041327266211388L ^ local1))) & __sourceIntrinsic_5c51e7cdc795_originalDynamicSite1580_2(7595, (8706895953371343966L ^ local1)));
    int local4 = ((p0 >> __sourceIntrinsic_5c51e7cdc795_originalDynamicSite1580_3(1026, (650794942587942341L ^ local1))) & __sourceIntrinsic_5c51e7cdc795_originalDynamicSite1580_4(7595, (8706895953371343966L ^ local1)));
    int local5 = ((p0 >> __sourceIntrinsic_5c51e7cdc795_originalDynamicSite1580_5(29963, (2579016542715561173L ^ local1))) & __sourceIntrinsic_5c51e7cdc795_originalDynamicSite1580_6(7595, (8706895953371343966L ^ local1)));
    int local6 = (p0 & __sourceIntrinsic_5c51e7cdc795_originalDynamicSite1580_7(7595, (8706895953371343966L ^ local1)));
    int local7 = ((((local4 * __sourceIntrinsic_5c51e7cdc795_originalDynamicSite1580_8(29697, (5514561508477060592L ^ local1))) + (local5 * __sourceIntrinsic_5c51e7cdc795_originalDynamicSite1580_9(8576, (1726688769312559215L ^ local1)))) + (local6 * __sourceIntrinsic_5c51e7cdc795_originalDynamicSite1580_10(17606, (886250701168768313L ^ local1)))) / __sourceIntrinsic_5c51e7cdc795_originalDynamicSite1580_11(14545, (2987239557181901068L ^ local1)));
    int local8 = (((local4 * __sourceIntrinsic_5c51e7cdc795_originalDynamicSite1580_12(7795, (6578006599845162909L ^ local1))) + (local5 * __sourceIntrinsic_5c51e7cdc795_originalDynamicSite1580_13(11521, (2018695205770697954L ^ local1)))) / __sourceIntrinsic_5c51e7cdc795_originalDynamicSite1580_14(535, (7815525065539793909L ^ local1)));
    int local9 = (((local4 * __sourceIntrinsic_5c51e7cdc795_originalDynamicSite1580_15(7795, (6578006599845162909L ^ local1))) + (local6 * __sourceIntrinsic_5c51e7cdc795_originalDynamicSite1580_16(6884, (2693477490279131906L ^ local1)))) / __sourceIntrinsic_5c51e7cdc795_originalDynamicSite1580_17(535, (7815525065539793909L ^ local1)));
    return ((((local3 << __sourceIntrinsic_5c51e7cdc795_originalDynamicSite1580_18(18626, (3393983701960685867L ^ local1))) | (local7 << __sourceIntrinsic_5c51e7cdc795_originalDynamicSite1580_19(777, (8514940977952174819L ^ local1)))) | (local8 << __sourceIntrinsic_5c51e7cdc795_originalDynamicSite1580_20(23095, (2441358865808649178L ^ local1)))) | local9);
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.ol.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public static java.awt.image.BufferedImage a(java.io.InputStream p0) throws java.io.IOException { return __sourceHandlerCall_f17f86040d8d7f8bbb4d(p0); }


public static int[][] a(int p0, int p1, int[][] p2) { return __sourceHandlerCall_f2c273679bd0637f7d5f(p0, p1, p2); }


private static int a(int p0, int p1, int p2, int p3, boolean p4) {
return moom.JQ.a(((int)(p0)), ((int)(p1)), ((int)(p2)), ((int)(p3)));
}


private static int a(int p0, int p1, int p2, int p3, int p4) {
long local5 = (moom.ol.g ^ 107401508033696L);
    float local7 = ((float) java.lang.Math.pow(((double)(((double) (((float) ((p0 >> p4) & __sourceIntrinsic_49648ccffeb1_originalDynamicSite1581_1(7929, (8334781932323355831L ^ local5)))) / 0x1.fep7f)))), ((double)(0x1.199999999999ap1d))));
    float local8 = ((float) java.lang.Math.pow(((double)(((double) (((float) ((p1 >> p4) & __sourceIntrinsic_49648ccffeb1_originalDynamicSite1581_3(7595, (8706941605583437798L ^ local5)))) / 0x1.fep7f)))), ((double)(0x1.199999999999ap1d))));
    float local9 = ((float) java.lang.Math.pow(((double)(((double) (((float) ((p2 >> p4) & __sourceIntrinsic_49648ccffeb1_originalDynamicSite1581_5(7595, (8706941605583437798L ^ local5)))) / 0x1.fep7f)))), ((double)(0x1.199999999999ap1d))));
    float local10 = ((float) java.lang.Math.pow(((double)(((double) (((float) ((p3 >> p4) & __sourceIntrinsic_49648ccffeb1_originalDynamicSite1581_7(7595, (8706941605583437798L ^ local5)))) / 0x1.fep7f)))), ((double)(0x1.199999999999ap1d))));
    float local11 = ((float) java.lang.Math.pow(((double)((((double) (((local7 + local8) + local9) + local10)) * 0x1.0p-2d))), ((double)(0x1.d1745d1745d17p-2d))));
    return ((int) (((double) local11) * 0x1.fep7d));
}


public static void a(int[][] p0, int p1, int p2, int p3, int p4, boolean p5, boolean p6) { __sourceHandlerCall_dc514411685646d190e4(p0, p1, p2, p3, p4, p5, p6); }


public static int a() {
return moom.kZ.a();
}


public static void a__Void(int p0) {
moom.kZ.h(((int)(p0)));
    return;
}


public static int a(int p0, java.awt.image.BufferedImage p1) {
return moom.ol.a(((int)(p0)), ((java.awt.image.BufferedImage)(p1)), ((boolean)(false)), ((boolean)(false)));
}


public static void a(int p0, int[] p1, int p2, int p3) {
moom.ol.b(((int)(p0)));
    moom.ol.a(((int)(0)), ((int[])(p1)), ((int)(p2)), ((int)(p3)), ((int)(0)), ((int)(0)), ((boolean)(false)), ((boolean)(false)), ((boolean)(false)));
    return;
}


public static void a(int p0, int p1, int p2, int p3) { __sourceHandlerCall_d4239d21c02716c8b7bc(p0, p1, p2, p3); }


public static int a(int p0, java.awt.image.BufferedImage p1, int p2, int p3, boolean p4, boolean p5) {
moom.ol.b(((int)(p0)));
    moom.ol.a(((java.awt.image.BufferedImage)(p1)), ((int)(p2)), ((int)(p3)), ((boolean)(p4)), ((boolean)(p5)));
    return p0;
}


private static void a(java.awt.image.BufferedImage p0, int p1, int p2, boolean p3, boolean p4) {
long life5_3;
    int life7_6;
    int life8_9;
    int life9_17;
    int[] life10_19;
    int life11_25;
    int life12_34;
    int life13_41;
    int life14_48;
    life5_3 = (moom.ol.g ^ 78034281842748L);
    life7_6 = ((java.awt.image.BufferedImage)(p0)).getWidth();
    life8_9 = ((java.awt.image.BufferedImage)(p0)).getHeight();
    life9_17 = (__sourceIntrinsic_9c1d95e3c1c1_invokedynamic3821_3(216, (1239526234763591175L ^ life5_3)) / life7_6);
    life10_19 = moom.ol.f;
    moom.ol.b(((boolean)(p3)));
    moom.ol.a(((boolean)(p4)));
    life11_25 = 0;
    loop_region_26: while ((life11_25 < (life7_6 * life8_9))) {
        life12_34 = (life11_25 / life7_6);
        int spill3821_0 = 17067;
        life13_41 = java.lang.Math.min(((int)(life9_17)), ((int)((life8_9 - life12_34))));
        long spill3821_1 = (4606713538105457778L ^ life5_3);
        life14_48 = (life7_6 * life13_41);
        ((java.awt.image.BufferedImage)(p0)).getRGB(((int)(0)), ((int)(life12_34)), ((int)(life7_6)), ((int)(life13_41)), ((int[])(life10_19)), ((int)(0)), ((int)(life7_6)));
        moom.ol.a(((int[])(life10_19)), ((int)(life14_48)));
        org.lwjgl.opengl.GL11.glTexSubImage2D(((int)(__sourceIntrinsic_9c1d95e3c1c1_invokedynamic3821_10(spill3821_0, spill3821_1))), ((int)(0)), ((int)(p1)), ((int)((p2 + life12_34))), ((int)(life7_6)), ((int)(life13_41)), ((int)(__sourceIntrinsic_9c1d95e3c1c1_invokedynamic3821_11(9276, (4646872001033296580L ^ life5_3)))), ((int)(__sourceIntrinsic_9c1d95e3c1c1_invokedynamic3821_12(22721, (2574239999545255487L ^ life5_3)))), ((java.nio.IntBuffer)(moom.ol.b)));
        life11_25 = (life11_25 + (life7_6 * life9_17));
    }
    return;
}


public static void a(boolean p0) { __sourceHandlerCall_2f5c6f04b5d9579ab7b1(p0); }


public static void a(int p0, int p1, int p2) {
moom.ol.a(((int)(p0)), ((int)(0)), ((int)(p1)), ((int)(p2)));
    return;
}


public static int a(int p0, java.awt.image.BufferedImage p1, boolean p2, boolean p3) {
moom.ol.a(((int)(p0)), ((int)(((java.awt.image.BufferedImage)(p1)).getWidth())), ((int)(((java.awt.image.BufferedImage)(p1)).getHeight())));
    return moom.ol.a(((int)(p0)), ((java.awt.image.BufferedImage)(p1)), ((int)(0)), ((int)(0)), ((boolean)(p2)), ((boolean)(p3)));
}


private static void a(int p0, int[] p1, int p2, int p3, int p4, int p5, boolean p6, boolean p7, boolean p8) {
long life9_3;
    int life11_11;
    int life13_18;
    int life14_27;
    int life12_34;
    int life15_41;
    life9_3 = (moom.ol.g ^ 24407495809188L);
    life11_11 = (__sourceIntrinsic_c846ad6ab026_invokedynamic3820_1(5924, (4040327837343660380L ^ life9_3)) / p2);
    moom.ol.a(((boolean)(p6)), ((boolean)(p8)));
    moom.ol.a(((boolean)(p7)));
    life13_18 = 0;
    loop_region_19: while ((life13_18 < (p2 * p3))) {
        life14_27 = (life13_18 / p2);
        int spill3820_0 = 2451;
        life12_34 = java.lang.Math.min(((int)(life11_11)), ((int)((p3 - life14_27))));
        long spill3820_1 = (4394764649493080014L ^ life9_3);
        life15_41 = (p2 * life12_34);
        moom.ol.a(((int[])(p1)), ((int)(life13_18)), ((int)(life15_41)));
        org.lwjgl.opengl.GL11.glTexSubImage2D(((int)(__sourceIntrinsic_c846ad6ab026_invokedynamic3820_6(spill3820_0, spill3820_1))), ((int)(p0)), ((int)(p4)), ((int)((p5 + life14_27))), ((int)(p2)), ((int)(life12_34)), ((int)(__sourceIntrinsic_c846ad6ab026_invokedynamic3820_7(9088, (4208387505964977649L ^ life9_3)))), ((int)(__sourceIntrinsic_c846ad6ab026_invokedynamic3820_8(16543, (3953733554372636396L ^ life9_3)))), ((java.nio.IntBuffer)(moom.ol.b)));
        life13_18 = (life13_18 + (p2 * life12_34));
    }
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_5c51e7cdc795_originalDynamicSite1580_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5c51e7cdc795_originalDynamicSite1580_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5c51e7cdc795_originalDynamicSite1580_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5c51e7cdc795_originalDynamicSite1580_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5c51e7cdc795_originalDynamicSite1580_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5c51e7cdc795_originalDynamicSite1580_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5c51e7cdc795_originalDynamicSite1580_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5c51e7cdc795_originalDynamicSite1580_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5c51e7cdc795_originalDynamicSite1580_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5c51e7cdc795_originalDynamicSite1580_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5c51e7cdc795_originalDynamicSite1580_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5c51e7cdc795_originalDynamicSite1580_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5c51e7cdc795_originalDynamicSite1580_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5c51e7cdc795_originalDynamicSite1580_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5c51e7cdc795_originalDynamicSite1580_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5c51e7cdc795_originalDynamicSite1580_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5c51e7cdc795_originalDynamicSite1580_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5c51e7cdc795_originalDynamicSite1580_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5c51e7cdc795_originalDynamicSite1580_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5c51e7cdc795_originalDynamicSite1580_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_49648ccffeb1_originalDynamicSite1581_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_49648ccffeb1_originalDynamicSite1581_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_49648ccffeb1_originalDynamicSite1581_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_49648ccffeb1_originalDynamicSite1581_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c846ad6ab026_invokedynamic3820_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c846ad6ab026_invokedynamic3820_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c846ad6ab026_invokedynamic3820_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c846ad6ab026_invokedynamic3820_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9c1d95e3c1c1_invokedynamic3821_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9c1d95e3c1c1_invokedynamic3821_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9c1d95e3c1c1_invokedynamic3821_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9c1d95e3c1c1_invokedynamic3821_12(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral8592_0() throws E;
}
