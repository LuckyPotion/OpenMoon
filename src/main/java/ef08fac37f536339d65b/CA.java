package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class CA {

public static final moom.CA a;

public final double b;

public final double c;

public final double d;

public final double e;

public final double f;

public final double g;

private static net.minecraft.entity.Entity[] h;

private static final long k;

private static final long[] m;

private static final java.lang.Integer[] n;

private static final java.util.Map o;

public CA(moom.DT p0, moom.DT p1) {
super();
    this.b = ((double) ((p0).a()));
    this.c = ((double) ((p0).b()));
    this.d = ((double) ((p0).c()));
    this.e = ((double) ((p1).a()));
    this.f = ((double) ((p1).b()));
    this.g = ((double) ((p1).c()));
}


public CA(double p0, double p1, double p2, double p3, double p4, double p5) {
super();
    this.b = java.lang.Math.min(p0, p3);
    this.c = java.lang.Math.min(p1, p4);
    this.d = java.lang.Math.min(p2, p5);
    this.e = java.lang.Math.max(p0, p3);
    this.f = java.lang.Math.max(p1, p4);
    this.g = java.lang.Math.max(p2, p5);
}


public CA(double p0, double p1, double p2) {
super();
    moom.CA __sourceSpill465_1 = this;
    moom.CA __stackOp465_2_0 = this;
    double __stackOp465_2_1 = p0;
    double __sourceSpill465_4 = __stackOp465_2_1;
    ((moom.CA)(__stackOp465_2_0)).e = ((double)(__stackOp465_2_1));
    ((moom.CA)(__sourceSpill465_1)).b = ((double)(__sourceSpill465_4));
    moom.CA __sourceSpill465_6 = this;
    moom.CA __stackOp465_7_0 = this;
    double __stackOp465_7_1 = p1;
    double __sourceSpill465_9 = __stackOp465_7_1;
    ((moom.CA)(__stackOp465_7_0)).f = ((double)(__stackOp465_7_1));
    ((moom.CA)(__sourceSpill465_6)).c = ((double)(__sourceSpill465_9));
    moom.CA __sourceSpill465_11 = this;
    moom.CA __stackOp465_12_0 = this;
    double __stackOp465_12_1 = p2;
    double __sourceSpill465_14 = __stackOp465_12_1;
    ((moom.CA)(__stackOp465_12_0)).g = ((double)(__stackOp465_12_1));
    ((moom.CA)(__sourceSpill465_11)).d = ((double)(__sourceSpill465_14));
    return;
}


static {
javax.crypto.Cipher forestValue382_39_0;
    int forestValue382_39_1;
    javax.crypto.SecretKeyFactory forestValue382_39_2;
    byte[] forestValue382_39_3;
    javax.crypto.Cipher forestValue382_56_0;
    int forestValue382_56_1;
    javax.crypto.SecretKeyFactory forestValue382_56_2;
    byte[] forestValue382_56_3;
    net.minecraft.entity.Entity[] spill382_0;
    javax.crypto.Cipher spill382_1;
    int spill382_2;
    javax.crypto.SecretKeyFactory spill382_3;
    byte[] spill382_4;
    byte[] spill382_5;
    java.lang.String spill382_6;
    int spill382_7;
    long[] spill382_8;
    int spill382_9;
    int spill382_10;
    long spill382_11;
    byte[] spill382_12;
    byte[] spill382_13;
    byte[] spill382_14;
    byte[] spill382_15;
    byte[] spill382_16;
    byte[] spill382_17;
    byte[] spill382_18;
    byte[] spill382_19;
    long spill382_20;
    int spill382_21;
    long life0_19;
    javax.crypto.Cipher life2_23;
    int life3_38;
    long[] life8_69;
    int life5_71;
    java.lang.String life6_74;
    int life7_76;
    int life4_78;
    byte[] life9_86;
    long life10_163;
    byte[] life12_231;
    forest_join_56: {
    k = ((long)(((moom._a)(moom._c.a(((long)(8075716333679471124L)), ((long)(-2103496163592932792L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(54058008392771L)))));
    spill382_0 = new net.minecraft.entity.Entity[2];
    o = ((java.util.Map)(new java.util.HashMap(13)));
    moom.CA.b(((net.minecraft.entity.Entity[])(spill382_0)));
    life0_19 = (moom.CA.k ^ 52096525277460L);
    spill382_1 = (life2_23 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    spill382_2 = 2;
    spill382_3 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp382_10_0 = new byte[8];
    spill382_4 = __stackOp382_10_0;
    (__stackOp382_10_0)[0] = ((byte) ((int) (life0_19 >>> 56)));
    life3_38 = 1;
    forestValue382_39_0 = spill382_1;
    forestValue382_39_1 = spill382_2;
    forestValue382_39_2 = spill382_3;
    forestValue382_39_3 = spill382_4;
    forest_cycle_39: while (true) {
    if (!((life3_38 < 8))) {
        forestValue382_56_0 = forestValue382_39_0;
        forestValue382_56_1 = forestValue382_39_1;
        forestValue382_56_2 = forestValue382_39_2;
        forestValue382_56_3 = forestValue382_39_3;
        break forest_join_56;
    }
    byte[] __stackOp382_11_0 = forestValue382_39_3;
    spill382_5 = __stackOp382_11_0;
    (__stackOp382_11_0)[life3_38] = ((byte) ((int) ((life0_19 << (life3_38 * 8)) >>> 56)));
    life3_38 += 1;
    forestValue382_39_3 = spill382_5;
    continue forest_cycle_39;
    }
    }
    ((javax.crypto.Cipher)(forestValue382_56_0)).init(((int)(forestValue382_56_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue382_56_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue382_56_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    life8_69 = new long[3];
    life5_71 = 0;
    life7_76 = ((java.lang.String)((life6_74 = ":16«\007Ù6¡ÕW\013{\037±\rø"))).length();
    life4_78 = 0;
    forest_cycle_79: while (true) {
    spill382_6 = life6_74;
    spill382_7 = life4_78;
    life4_78 += 8;
    life9_86 = ((java.lang.String)(((java.lang.String)(spill382_6)).substring(((int)(spill382_7)), ((int)(life4_78))))).getBytes(((java.lang.String)("ISO-8859-1")));
    spill382_8 = life8_69;
    spill382_9 = (life5_71++);
    long __stackOp382_17_0 = (((((((((((long) (life9_86)[0]) & 255L) << 56) | ((((long) (life9_86)[1]) & 255L) << 48)) | ((((long) (life9_86)[2]) & 255L) << 40)) | ((((long) (life9_86)[3]) & 255L) << 32)) | ((((long) (life9_86)[4]) & 255L) << 24)) | ((((long) (life9_86)[5]) & 255L) << 16)) | ((((long) (life9_86)[6]) & 255L) << 8)) | (((long) (life9_86)[7]) & 255L));
    int __stackOp382_17_1 = -1;
    spill382_10 = __stackOp382_17_1;
    spill382_11 = __stackOp382_17_0;
    recovery.source.CarrierOps.discard(__stackOp382_17_1);
    life10_163 = spill382_11;
    byte[] __stackOp382_19_0 = new byte[8];
    spill382_12 = __stackOp382_19_0;
    (__stackOp382_19_0)[0] = ((byte) ((int) (life10_163 >>> 56)));
    byte[] __stackOp382_20_0 = spill382_12;
    spill382_13 = __stackOp382_20_0;
    (__stackOp382_20_0)[1] = ((byte) ((int) (life10_163 >>> 48)));
    byte[] __stackOp382_21_0 = spill382_13;
    spill382_14 = __stackOp382_21_0;
    (__stackOp382_21_0)[2] = ((byte) ((int) (life10_163 >>> 40)));
    byte[] __stackOp382_22_0 = spill382_14;
    spill382_15 = __stackOp382_22_0;
    (__stackOp382_22_0)[3] = ((byte) ((int) (life10_163 >>> 32)));
    byte[] __stackOp382_23_0 = spill382_15;
    spill382_16 = __stackOp382_23_0;
    (__stackOp382_23_0)[4] = ((byte) ((int) (life10_163 >>> 24)));
    byte[] __stackOp382_24_0 = spill382_16;
    spill382_17 = __stackOp382_24_0;
    (__stackOp382_24_0)[5] = ((byte) ((int) (life10_163 >>> 16)));
    byte[] __stackOp382_25_0 = spill382_17;
    spill382_18 = __stackOp382_25_0;
    (__stackOp382_25_0)[6] = ((byte) ((int) (life10_163 >>> 8)));
    byte[] __stackOp382_26_0 = spill382_18;
    spill382_19 = __stackOp382_26_0;
    (__stackOp382_26_0)[7] = ((byte) ((int) life10_163));
    byte[] __stackOp382_27_0 = spill382_19;
    javax.crypto.Cipher __stackOp382_27_1 = life2_23;
    life12_231 = ((javax.crypto.Cipher)(__stackOp382_27_1)).doFinal(((byte[])(__stackOp382_27_0)));
    int __stackOp382_29_0 = spill382_10;
    long __stackOp382_29_1 = (((((((((((long) (life12_231)[0]) & 255L) << 56) | ((((long) (life12_231)[1]) & 255L) << 48)) | ((((long) (life12_231)[2]) & 255L) << 40)) | ((((long) (life12_231)[3]) & 255L) << 32)) | ((((long) (life12_231)[4]) & 255L) << 24)) | ((((long) (life12_231)[5]) & 255L) << 16)) | ((((long) (life12_231)[6]) & 255L) << 8)) | (((long) (life12_231)[7]) & 255L));
    spill382_20 = __stackOp382_29_1;
    spill382_21 = __stackOp382_29_0;
    recovery.source.CarrierOps.discard(__stackOp382_29_1);
    recovery.source.CarrierOps.discard(spill382_21);
    (spill382_8)[spill382_9] = spill382_20;
    if (!((life4_78 >= life7_76))) {
        continue forest_cycle_79;
    }
    break forest_cycle_79;
    }
    m = ((long[])(life8_69));
    n = ((java.lang.Integer[])(new java.lang.Integer[3]));
    a = ((moom.CA)(new moom.CA(__sourceIntrinsic_eb8803ad1f63_exactNonfiniteDoubleLiteral382_34(), __sourceIntrinsic_eb8803ad1f63_exactNonfiniteDoubleLiteral382_35(), __sourceIntrinsic_eb8803ad1f63_exactNonfiniteDoubleLiteral382_36(), __sourceIntrinsic_eb8803ad1f63_exactNonfiniteDoubleLiteral382_37(), __sourceIntrinsic_eb8803ad1f63_exactNonfiniteDoubleLiteral382_38(), __sourceIntrinsic_eb8803ad1f63_exactNonfiniteDoubleLiteral382_39())));
}


public java.lang.String toString() {
return __sourceIntrinsic_a86c261fcdee_originalDynamicSite1072_6(this.b, this.c, this.d, this.e, this.f, this.g);
}


private boolean b(moom.DR p0) {
moom.DR forwardValue1573_11_0;
    int forwardValue1573_23_0;
    int forwardValue1573_31_0;
    int forwardValue1573_39_0;
    int forwardValue1573_43_0;
    int forwardValue1573_45_0;
    moom.DR spill1573_0;
    int spill1573_1;
    long life2_3;
    int life4_5;
    forward_join_45: {
    forward_join_44: {
    forward_join_43: {
    forward_join_39: {
    forward_join_31: {
    forward_join_23: {
    forward_join_11: {
    life2_3 = (moom.CA.k ^ 134364161089297L);
    life4_5 = ((moom.DS.b__Boolean()) ? 1 : 0);
    spill1573_0 = p0;
    if (!((life4_5 == 0))) {
        forwardValue1573_11_0 = spill1573_0;
        break forward_join_11;
    }
    if (!((spill1573_0 != null))) {
        break forward_join_44;
    }
    forwardValue1573_11_0 = p0;
    }
    spill1573_1 = recovery.source.CarrierOps.dcmpl(((double)(((moom.DR)(forwardValue1573_11_0)).b)), ((double)(this.c)));
    if (!((life4_5 == 0))) {
        forwardValue1573_23_0 = spill1573_1;
        break forward_join_23;
    }
    if (!((spill1573_1 >= 0))) {
        break forward_join_44;
    }
    forwardValue1573_23_0 = recovery.source.CarrierOps.dcmpg(((double)(((moom.DR)(p0)).b)), ((double)(this.f)));
    }
    if (!((life4_5 == 0))) {
        forwardValue1573_31_0 = forwardValue1573_23_0;
        break forward_join_31;
    }
    if (!((forwardValue1573_23_0 <= 0))) {
        break forward_join_44;
    }
    forwardValue1573_31_0 = recovery.source.CarrierOps.dcmpl(((double)(((moom.DR)(p0)).c)), ((double)(this.d)));
    }
    if (!((life4_5 == 0))) {
        forwardValue1573_39_0 = forwardValue1573_31_0;
        break forward_join_39;
    }
    if (!((forwardValue1573_31_0 >= 0))) {
        break forward_join_44;
    }
    forwardValue1573_39_0 = recovery.source.CarrierOps.dcmpg(((double)(((moom.DR)(p0)).c)), ((double)(this.g)));
    }
    if (!((life4_5 == 0))) {
        forwardValue1573_43_0 = forwardValue1573_39_0;
        break forward_join_43;
    }
    if (!((forwardValue1573_39_0 <= 0))) {
        break forward_join_44;
    }
    forwardValue1573_43_0 = 1;
    }
    forwardValue1573_45_0 = forwardValue1573_43_0;
    break forward_join_45;
    }
    forwardValue1573_45_0 = 0;
    }
    return ((forwardValue1573_45_0) != 0);
}


public double b(moom.CA p0, double p1) {
double forwardValue1572_65_0;
    int forwardValue1572_73_0;
    double forwardValue1572_97_0;
    double spill1572_0;
    double spill1572_1;
    double spill1572_2;
    double spill1572_3;
    int spill1572_4;
    int spill1572_5;
    double spill1572_6;
    double spill1572_7;
    double spill1572_8;
    double spill1572_9;
    long life4_3;
    int life6_5;
    double life7_90;
    double life7_138;
    forward_join_97: {
    forward_join_96: {
    forward_join_73: {
    forward_join_68: {
    forward_join_66: {
    forward_join_65: {
    life4_3 = (moom.CA.k ^ 42558559502004L);
    life6_5 = ((moom.DS.c__Boolean()) ? 1 : 0);
    spill1572_0 = ((moom.CA)(p0)).e;
    if (!((life6_5 != 0))) {
        forwardValue1572_97_0 = spill1572_0;
        break forward_join_97;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(spill1572_0)), ((double)(this.b))) > 0))) {
        break forward_join_96;
    }
    spill1572_1 = ((moom.CA)(p0)).b;
    if (!((life6_5 != 0))) {
        forwardValue1572_97_0 = spill1572_1;
        break forward_join_97;
    }
    if (!((recovery.source.CarrierOps.dcmpg(((double)(spill1572_1)), ((double)(this.e))) < 0))) {
        break forward_join_96;
    }
    spill1572_2 = ((moom.CA)(p0)).g;
    if (!((life6_5 != 0))) {
        forwardValue1572_97_0 = spill1572_2;
        break forward_join_97;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(spill1572_2)), ((double)(this.d))) > 0))) {
        break forward_join_96;
    }
    spill1572_3 = ((moom.CA)(p0)).d;
    if (!((life6_5 != 0))) {
        forwardValue1572_97_0 = spill1572_3;
        break forward_join_97;
    }
    if (!((recovery.source.CarrierOps.dcmpg(((double)(spill1572_3)), ((double)(this.g))) < 0))) {
        break forward_join_96;
    }
    spill1572_4 = recovery.source.CarrierOps.dcmpl(((double)(p1)), ((double)(0x0.0p0d)));
    if (!((life6_5 != 0))) {
        forwardValue1572_73_0 = spill1572_4;
        break forward_join_73;
    }
    if (!((spill1572_4 > 0))) {
        break forward_join_68;
    }
    spill1572_5 = recovery.source.CarrierOps.dcmpg(((double)(((moom.CA)(p0)).f)), ((double)(this.c)));
    if (!((life6_5 != 0))) {
        forwardValue1572_73_0 = spill1572_5;
        break forward_join_73;
    }
    if (!((spill1572_5 <= 0))) {
        break forward_join_68;
    }
    life7_90 = (this.c - ((moom.CA)(p0)).f);
    spill1572_6 = life7_90;
    if (!((life6_5 != 0))) {
        forwardValue1572_65_0 = spill1572_6;
        break forward_join_65;
    }
    if (!((recovery.source.CarrierOps.dcmpg(((double)(spill1572_6)), ((double)(p1))) < 0))) {
        break forward_join_66;
    }
    forwardValue1572_65_0 = life7_90;
    }
    p1 = forwardValue1572_65_0;
    }
    if (!((life6_5 == 0))) {
        break forward_join_96;
    }
    }
    spill1572_7 = p1;
    if (!((life6_5 != 0))) {
        forwardValue1572_97_0 = spill1572_7;
        break forward_join_97;
    }
    forwardValue1572_73_0 = recovery.source.CarrierOps.dcmpg(((double)(spill1572_7)), ((double)(0x0.0p0d)));
    }
    if (!((forwardValue1572_73_0 < 0))) {
        break forward_join_96;
    }
    spill1572_8 = ((moom.CA)(p0)).c;
    if (!((life6_5 != 0))) {
        forwardValue1572_97_0 = spill1572_8;
        break forward_join_97;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(spill1572_8)), ((double)(this.f))) >= 0))) {
        break forward_join_96;
    }
    life7_138 = (this.f - ((moom.CA)(p0)).c);
    spill1572_9 = life7_138;
    if (!((life6_5 != 0))) {
        forwardValue1572_97_0 = spill1572_9;
        break forward_join_97;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(spill1572_9)), ((double)(p1))) > 0))) {
        break forward_join_96;
    }
    p1 = life7_138;
    }
    forwardValue1572_97_0 = p1;
    }
    return forwardValue1572_97_0;
}


public static net.minecraft.entity.Entity[] b() {
return moom.CA.h;
}


public static void b(net.minecraft.entity.Entity[] p0) {
h = ((net.minecraft.entity.Entity[])(p0));
    return;
}


public moom.CA b(double p0, double p1, double p2) {
double local7 = (this.b - p0);
    double local9 = (this.c - p1);
    double local11 = (this.d - p2);
    double local13 = (this.e + p0);
    double local15 = (this.f + p1);
    double local17 = (this.g + p2);
    return new moom.CA(local7, local9, local11, local13, local15, local17);
}


private boolean c(moom.DR p0) {
moom.DR forwardValue1575_11_0;
    int forwardValue1575_23_0;
    int forwardValue1575_31_0;
    int forwardValue1575_39_0;
    int forwardValue1575_43_0;
    int forwardValue1575_45_0;
    moom.DR spill1575_0;
    int spill1575_1;
    long life2_3;
    int life4_5;
    forward_join_45: {
    forward_join_44: {
    forward_join_43: {
    forward_join_39: {
    forward_join_31: {
    forward_join_23: {
    forward_join_11: {
    life2_3 = (moom.CA.k ^ 108671923271408L);
    life4_5 = ((moom.DS.b__Boolean()) ? 1 : 0);
    spill1575_0 = p0;
    if (!((life4_5 == 0))) {
        forwardValue1575_11_0 = spill1575_0;
        break forward_join_11;
    }
    if (!((spill1575_0 != null))) {
        break forward_join_44;
    }
    forwardValue1575_11_0 = p0;
    }
    spill1575_1 = recovery.source.CarrierOps.dcmpl(((double)(((moom.DR)(forwardValue1575_11_0)).a)), ((double)(this.b)));
    if (!((life4_5 == 0))) {
        forwardValue1575_23_0 = spill1575_1;
        break forward_join_23;
    }
    if (!((spill1575_1 >= 0))) {
        break forward_join_44;
    }
    forwardValue1575_23_0 = recovery.source.CarrierOps.dcmpg(((double)(((moom.DR)(p0)).a)), ((double)(this.e)));
    }
    if (!((life4_5 == 0))) {
        forwardValue1575_31_0 = forwardValue1575_23_0;
        break forward_join_31;
    }
    if (!((forwardValue1575_23_0 <= 0))) {
        break forward_join_44;
    }
    forwardValue1575_31_0 = recovery.source.CarrierOps.dcmpl(((double)(((moom.DR)(p0)).c)), ((double)(this.d)));
    }
    if (!((life4_5 == 0))) {
        forwardValue1575_39_0 = forwardValue1575_31_0;
        break forward_join_39;
    }
    if (!((forwardValue1575_31_0 >= 0))) {
        break forward_join_44;
    }
    forwardValue1575_39_0 = recovery.source.CarrierOps.dcmpg(((double)(((moom.DR)(p0)).c)), ((double)(this.g)));
    }
    if (!((life4_5 == 0))) {
        forwardValue1575_43_0 = forwardValue1575_39_0;
        break forward_join_43;
    }
    if (!((forwardValue1575_39_0 <= 0))) {
        break forward_join_44;
    }
    forwardValue1575_43_0 = 1;
    }
    forwardValue1575_45_0 = forwardValue1575_43_0;
    break forward_join_45;
    }
    forwardValue1575_45_0 = 0;
    }
    return ((forwardValue1575_45_0) != 0);
}


public moom.CA c(double p0, double p1, double p2) {
return new moom.CA((this.b + p0), (this.c + p1), (this.d + p2), (this.e + p0), (this.f + p1), (this.g + p2));
}


public double c(moom.CA p0, double p1) {
double forwardValue1574_65_0;
    int forwardValue1574_73_0;
    double forwardValue1574_97_0;
    double spill1574_0;
    double spill1574_1;
    double spill1574_2;
    double spill1574_3;
    int spill1574_4;
    int spill1574_5;
    double spill1574_6;
    double spill1574_7;
    double spill1574_8;
    double spill1574_9;
    long life4_3;
    int life6_5;
    double life7_90;
    double life7_138;
    forward_join_97: {
    forward_join_96: {
    forward_join_73: {
    forward_join_68: {
    forward_join_66: {
    forward_join_65: {
    life4_3 = (moom.CA.k ^ 58334838111344L);
    life6_5 = ((moom.DS.b__Boolean()) ? 1 : 0);
    spill1574_0 = ((moom.CA)(p0)).e;
    if (!((life6_5 == 0))) {
        forwardValue1574_97_0 = spill1574_0;
        break forward_join_97;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(spill1574_0)), ((double)(this.b))) > 0))) {
        break forward_join_96;
    }
    spill1574_1 = ((moom.CA)(p0)).b;
    if (!((life6_5 == 0))) {
        forwardValue1574_97_0 = spill1574_1;
        break forward_join_97;
    }
    if (!((recovery.source.CarrierOps.dcmpg(((double)(spill1574_1)), ((double)(this.e))) < 0))) {
        break forward_join_96;
    }
    spill1574_2 = ((moom.CA)(p0)).f;
    if (!((life6_5 == 0))) {
        forwardValue1574_97_0 = spill1574_2;
        break forward_join_97;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(spill1574_2)), ((double)(this.c))) > 0))) {
        break forward_join_96;
    }
    spill1574_3 = ((moom.CA)(p0)).c;
    if (!((life6_5 == 0))) {
        forwardValue1574_97_0 = spill1574_3;
        break forward_join_97;
    }
    if (!((recovery.source.CarrierOps.dcmpg(((double)(spill1574_3)), ((double)(this.f))) < 0))) {
        break forward_join_96;
    }
    spill1574_4 = recovery.source.CarrierOps.dcmpl(((double)(p1)), ((double)(0x0.0p0d)));
    if (!((life6_5 == 0))) {
        forwardValue1574_73_0 = spill1574_4;
        break forward_join_73;
    }
    if (!((spill1574_4 > 0))) {
        break forward_join_68;
    }
    spill1574_5 = recovery.source.CarrierOps.dcmpg(((double)(((moom.CA)(p0)).g)), ((double)(this.d)));
    if (!((life6_5 == 0))) {
        forwardValue1574_73_0 = spill1574_5;
        break forward_join_73;
    }
    if (!((spill1574_5 <= 0))) {
        break forward_join_68;
    }
    life7_90 = (this.d - ((moom.CA)(p0)).g);
    spill1574_6 = life7_90;
    if (!((life6_5 == 0))) {
        forwardValue1574_65_0 = spill1574_6;
        break forward_join_65;
    }
    if (!((recovery.source.CarrierOps.dcmpg(((double)(spill1574_6)), ((double)(p1))) < 0))) {
        break forward_join_66;
    }
    forwardValue1574_65_0 = life7_90;
    }
    p1 = forwardValue1574_65_0;
    }
    if (!((life6_5 != 0))) {
        break forward_join_96;
    }
    }
    spill1574_7 = p1;
    if (!((life6_5 == 0))) {
        forwardValue1574_97_0 = spill1574_7;
        break forward_join_97;
    }
    forwardValue1574_73_0 = recovery.source.CarrierOps.dcmpg(((double)(spill1574_7)), ((double)(0x0.0p0d)));
    }
    if (!((forwardValue1574_73_0 < 0))) {
        break forward_join_96;
    }
    spill1574_8 = ((moom.CA)(p0)).d;
    if (!((life6_5 == 0))) {
        forwardValue1574_97_0 = spill1574_8;
        break forward_join_97;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(spill1574_8)), ((double)(this.g))) >= 0))) {
        break forward_join_96;
    }
    life7_138 = (this.g - ((moom.CA)(p0)).d);
    spill1574_9 = life7_138;
    if (!((life6_5 == 0))) {
        forwardValue1574_97_0 = spill1574_9;
        break forward_join_97;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(spill1574_9)), ((double)(p1))) > 0))) {
        break forward_join_96;
    }
    p1 = life7_138;
    }
    forwardValue1574_97_0 = p1;
    }
    return forwardValue1574_97_0;
}


public moom.CA d(double p0, double p1, double p2) {
double local7 = (this.b + p0);
    double local9 = (this.c + p1);
    double local11 = (this.d + p2);
    double local13 = (this.e - p0);
    double local15 = (this.f - p1);
    double local17 = (this.g - p2);
    return new moom.CA(local7, local9, local11, local13, local15, local17);
}


private boolean d(moom.DR p0) {
moom.DR forwardValue1576_11_0;
    int forwardValue1576_23_0;
    int forwardValue1576_31_0;
    int forwardValue1576_39_0;
    int forwardValue1576_43_0;
    int forwardValue1576_45_0;
    moom.DR spill1576_0;
    int spill1576_1;
    long life2_3;
    int life4_5;
    forward_join_45: {
    forward_join_44: {
    forward_join_43: {
    forward_join_39: {
    forward_join_31: {
    forward_join_23: {
    forward_join_11: {
    life2_3 = (moom.CA.k ^ 3939814224755L);
    life4_5 = ((moom.DS.b__Boolean()) ? 1 : 0);
    spill1576_0 = p0;
    if (!((life4_5 == 0))) {
        forwardValue1576_11_0 = spill1576_0;
        break forward_join_11;
    }
    if (!((spill1576_0 != null))) {
        break forward_join_44;
    }
    forwardValue1576_11_0 = p0;
    }
    spill1576_1 = recovery.source.CarrierOps.dcmpl(((double)(((moom.DR)(forwardValue1576_11_0)).a)), ((double)(this.b)));
    if (!((life4_5 == 0))) {
        forwardValue1576_23_0 = spill1576_1;
        break forward_join_23;
    }
    if (!((spill1576_1 >= 0))) {
        break forward_join_44;
    }
    forwardValue1576_23_0 = recovery.source.CarrierOps.dcmpg(((double)(((moom.DR)(p0)).a)), ((double)(this.e)));
    }
    if (!((life4_5 == 0))) {
        forwardValue1576_31_0 = forwardValue1576_23_0;
        break forward_join_31;
    }
    if (!((forwardValue1576_23_0 <= 0))) {
        break forward_join_44;
    }
    forwardValue1576_31_0 = recovery.source.CarrierOps.dcmpl(((double)(((moom.DR)(p0)).b)), ((double)(this.c)));
    }
    if (!((life4_5 == 0))) {
        forwardValue1576_39_0 = forwardValue1576_31_0;
        break forward_join_39;
    }
    if (!((forwardValue1576_31_0 >= 0))) {
        break forward_join_44;
    }
    forwardValue1576_39_0 = recovery.source.CarrierOps.dcmpg(((double)(((moom.DR)(p0)).b)), ((double)(this.f)));
    }
    if (!((life4_5 == 0))) {
        forwardValue1576_43_0 = forwardValue1576_39_0;
        break forward_join_43;
    }
    if (!((forwardValue1576_39_0 <= 0))) {
        break forward_join_44;
    }
    forwardValue1576_43_0 = 1;
    }
    forwardValue1576_45_0 = forwardValue1576_43_0;
    break forward_join_45;
    }
    forwardValue1576_45_0 = 0;
    }
    return ((forwardValue1576_45_0) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public static moom.CA a(double p0, double p1, double p2, double p3, double p4, double p5) {
double local12 = java.lang.Math.min(((double)(p0)), ((double)(p3)));
    double local14 = java.lang.Math.min(((double)(p1)), ((double)(p4)));
    double local16 = java.lang.Math.min(((double)(p2)), ((double)(p5)));
    double local18 = java.lang.Math.max(((double)(p0)), ((double)(p3)));
    double local20 = java.lang.Math.max(((double)(p1)), ((double)(p4)));
    double local22 = java.lang.Math.max(((double)(p2)), ((double)(p5)));
    return new moom.CA(local12, local14, local16, local18, local20, local22);
}


public moom.CA a(double p0, double p1, double p2) {
int forwardValue1565_39_0;
    int forwardValue1565_49_0;
    int forwardValue1565_61_0;
    int forwardValue1565_71_0;
    int forwardValue1565_85_0;
    double forwardValue1565_88_0;
    double forwardValue1565_88_1;
    boolean spill1565_0;
    int spill1565_1;
    double spill1565_2;
    double spill1565_3;
    long life7_3;
    double life10_6;
    double life12_9;
    double life14_12;
    double life16_16;
    double life18_19;
    int life9_20;
    double life20_23;
    forward_join_90: {
    forward_join_88: {
    forward_join_85: {
    forward_join_80: {
    forward_join_71: {
    forward_join_68: {
    forward_join_61: {
    forward_join_58: {
    forward_join_49: {
    forward_join_46: {
    forward_join_39: {
    forward_join_36: {
    life7_3 = (moom.CA.k ^ 31952574580904L);
    life10_6 = this.b;
    life12_9 = this.c;
    life14_12 = this.d;
    spill1565_0 = moom.DS.b__Boolean();
    life16_16 = this.e;
    life18_19 = this.f;
    life9_20 = ((spill1565_0) ? 1 : 0);
    life20_23 = this.g;
    spill1565_1 = recovery.source.CarrierOps.dcmpg(((double)(p0)), ((double)(0x0.0p0d)));
    if (!((life9_20 == 0))) {
        forwardValue1565_39_0 = spill1565_1;
        break forward_join_39;
    }
    if (!((spill1565_1 < 0))) {
        break forward_join_36;
    }
    life10_6 = (life10_6 + p0);
    if (!((life9_20 != 0))) {
        break forward_join_46;
    }
    }
    forwardValue1565_39_0 = recovery.source.CarrierOps.dcmpl(((double)(p0)), ((double)(0x0.0p0d)));
    }
    if (!((life9_20 == 0))) {
        forwardValue1565_49_0 = forwardValue1565_39_0;
        break forward_join_49;
    }
    if (!((forwardValue1565_39_0 > 0))) {
        break forward_join_46;
    }
    life16_16 = (life16_16 + p0);
    }
    forwardValue1565_49_0 = recovery.source.CarrierOps.dcmpg(((double)(p1)), ((double)(0x0.0p0d)));
    }
    if (!((life9_20 == 0))) {
        forwardValue1565_61_0 = forwardValue1565_49_0;
        break forward_join_61;
    }
    if (!((forwardValue1565_49_0 < 0))) {
        break forward_join_58;
    }
    life12_9 = (life12_9 + p1);
    if (!((life9_20 != 0))) {
        break forward_join_68;
    }
    }
    forwardValue1565_61_0 = recovery.source.CarrierOps.dcmpl(((double)(p1)), ((double)(0x0.0p0d)));
    }
    if (!((life9_20 == 0))) {
        forwardValue1565_71_0 = forwardValue1565_61_0;
        break forward_join_71;
    }
    if (!((forwardValue1565_61_0 > 0))) {
        break forward_join_68;
    }
    life18_19 = (life18_19 + p1);
    }
    forwardValue1565_71_0 = recovery.source.CarrierOps.dcmpg(((double)(p2)), ((double)(0x0.0p0d)));
    }
    if (!((life9_20 == 0))) {
        forwardValue1565_85_0 = forwardValue1565_71_0;
        break forward_join_85;
    }
    if (!((forwardValue1565_71_0 < 0))) {
        break forward_join_80;
    }
    life14_12 = (life14_12 + p2);
    if (!((life9_20 != 0))) {
        break forward_join_90;
    }
    }
    spill1565_2 = p2;
    spill1565_3 = 0x0.0p0d;
    if (!((life9_20 == 0))) {
        forwardValue1565_88_0 = spill1565_2;
        forwardValue1565_88_1 = spill1565_3;
        break forward_join_88;
    }
    forwardValue1565_85_0 = recovery.source.CarrierOps.dcmpl(((double)(spill1565_2)), ((double)(spill1565_3)));
    }
    if (!((forwardValue1565_85_0 > 0))) {
        break forward_join_90;
    }
    forwardValue1565_88_0 = life20_23;
    forwardValue1565_88_1 = p2;
    }
    life20_23 = (forwardValue1565_88_0 + forwardValue1565_88_1);
    }
    return new moom.CA(life10_6, life12_9, life14_12, life16_16, life18_19, life20_23);
}


public moom.CA a(moom.CA p0) {
double local2 = java.lang.Math.min(((double)(this.b)), ((double)(((moom.CA)(p0)).b)));
    double local4 = java.lang.Math.min(((double)(this.c)), ((double)(((moom.CA)(p0)).c)));
    double local6 = java.lang.Math.min(((double)(this.d)), ((double)(((moom.CA)(p0)).d)));
    double local8 = java.lang.Math.max(((double)(this.e)), ((double)(((moom.CA)(p0)).e)));
    double local10 = java.lang.Math.max(((double)(this.f)), ((double)(((moom.CA)(p0)).f)));
    double local12 = java.lang.Math.max(((double)(this.g)), ((double)(((moom.CA)(p0)).g)));
    return new moom.CA(local2, local4, local6, local8, local10, local12);
}


private static int a(int p0, long p1) {
int n4 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x51EB;
        if (CA.n[n4] == null) {
            
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
                throw new RuntimeException("moom/CA", exception);
            }
            int n6 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CA.n[n4] = n6;
        }
        return CA.n[n4];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_9454b7f14439bf(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral4019_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/CA"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public boolean a__Boolean(moom.CA p0) {
int forwardValue1570_19_0;
    int forwardValue1570_27_0;
    int forwardValue1570_35_0;
    int forwardValue1570_43_0;
    int forwardValue1570_51_0;
    int forwardValue1570_55_0;
    int forwardValue1570_57_0;
    int spill1570_0;
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
    life2_3 = (moom.CA.k ^ 83231919099395L);
    life4_5 = ((moom.DS.b__Boolean()) ? 1 : 0);
    spill1570_0 = recovery.source.CarrierOps.dcmpl(((double)(((moom.CA)(p0)).e)), ((double)(this.b)));
    if (!((life4_5 == 0))) {
        forwardValue1570_19_0 = spill1570_0;
        break forward_join_19;
    }
    if (!((spill1570_0 > 0))) {
        break forward_join_56;
    }
    forwardValue1570_19_0 = recovery.source.CarrierOps.dcmpg(((double)(((moom.CA)(p0)).b)), ((double)(this.e)));
    }
    if (!((life4_5 == 0))) {
        forwardValue1570_27_0 = forwardValue1570_19_0;
        break forward_join_27;
    }
    if (!((forwardValue1570_19_0 < 0))) {
        break forward_join_56;
    }
    forwardValue1570_27_0 = recovery.source.CarrierOps.dcmpl(((double)(((moom.CA)(p0)).f)), ((double)(this.c)));
    }
    if (!((life4_5 == 0))) {
        forwardValue1570_35_0 = forwardValue1570_27_0;
        break forward_join_35;
    }
    if (!((forwardValue1570_27_0 > 0))) {
        break forward_join_56;
    }
    forwardValue1570_35_0 = recovery.source.CarrierOps.dcmpg(((double)(((moom.CA)(p0)).c)), ((double)(this.f)));
    }
    if (!((life4_5 == 0))) {
        forwardValue1570_43_0 = forwardValue1570_35_0;
        break forward_join_43;
    }
    if (!((forwardValue1570_35_0 < 0))) {
        break forward_join_56;
    }
    forwardValue1570_43_0 = recovery.source.CarrierOps.dcmpl(((double)(((moom.CA)(p0)).g)), ((double)(this.d)));
    }
    if (!((life4_5 == 0))) {
        forwardValue1570_51_0 = forwardValue1570_43_0;
        break forward_join_51;
    }
    if (!((forwardValue1570_43_0 > 0))) {
        break forward_join_56;
    }
    forwardValue1570_51_0 = recovery.source.CarrierOps.dcmpg(((double)(((moom.CA)(p0)).d)), ((double)(this.g)));
    }
    if (!((life4_5 == 0))) {
        forwardValue1570_55_0 = forwardValue1570_51_0;
        break forward_join_55;
    }
    if (!((forwardValue1570_51_0 < 0))) {
        break forward_join_56;
    }
    forwardValue1570_55_0 = 1;
    }
    forwardValue1570_57_0 = forwardValue1570_55_0;
    break forward_join_57;
    }
    forwardValue1570_57_0 = 0;
    }
    return ((forwardValue1570_57_0) != 0);
}


public boolean a(moom.DR p0) {
int forwardValue1567_19_0;
    int forwardValue1567_27_0;
    int forwardValue1567_35_0;
    int forwardValue1567_43_0;
    int forwardValue1567_51_0;
    int forwardValue1567_55_0;
    int forwardValue1567_57_0;
    int spill1567_0;
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
    life2_3 = (moom.CA.k ^ 132668464124366L);
    life4_5 = ((moom.DS.c__Boolean()) ? 1 : 0);
    spill1567_0 = recovery.source.CarrierOps.dcmpl(((double)(((moom.DR)(p0)).a)), ((double)(this.b)));
    if (!((life4_5 != 0))) {
        forwardValue1567_19_0 = spill1567_0;
        break forward_join_19;
    }
    if (!((spill1567_0 > 0))) {
        break forward_join_56;
    }
    forwardValue1567_19_0 = recovery.source.CarrierOps.dcmpg(((double)(((moom.DR)(p0)).a)), ((double)(this.e)));
    }
    if (!((life4_5 != 0))) {
        forwardValue1567_27_0 = forwardValue1567_19_0;
        break forward_join_27;
    }
    if (!((forwardValue1567_19_0 < 0))) {
        break forward_join_56;
    }
    forwardValue1567_27_0 = recovery.source.CarrierOps.dcmpl(((double)(((moom.DR)(p0)).b)), ((double)(this.c)));
    }
    if (!((life4_5 != 0))) {
        forwardValue1567_35_0 = forwardValue1567_27_0;
        break forward_join_35;
    }
    if (!((forwardValue1567_27_0 > 0))) {
        break forward_join_56;
    }
    forwardValue1567_35_0 = recovery.source.CarrierOps.dcmpg(((double)(((moom.DR)(p0)).b)), ((double)(this.f)));
    }
    if (!((life4_5 != 0))) {
        forwardValue1567_43_0 = forwardValue1567_35_0;
        break forward_join_43;
    }
    if (!((forwardValue1567_35_0 < 0))) {
        break forward_join_56;
    }
    forwardValue1567_43_0 = recovery.source.CarrierOps.dcmpl(((double)(((moom.DR)(p0)).c)), ((double)(this.d)));
    }
    if (!((life4_5 != 0))) {
        forwardValue1567_51_0 = forwardValue1567_43_0;
        break forward_join_51;
    }
    if (!((forwardValue1567_43_0 > 0))) {
        break forward_join_56;
    }
    forwardValue1567_51_0 = recovery.source.CarrierOps.dcmpg(((double)(((moom.DR)(p0)).c)), ((double)(this.g)));
    }
    if (!((life4_5 != 0))) {
        forwardValue1567_55_0 = forwardValue1567_51_0;
        break forward_join_55;
    }
    if (!((forwardValue1567_51_0 < 0))) {
        break forward_join_56;
    }
    forwardValue1567_55_0 = 1;
    }
    forwardValue1567_57_0 = forwardValue1567_55_0;
    break forward_join_57;
    }
    forwardValue1567_57_0 = 0;
    }
    return ((forwardValue1567_57_0) != 0);
}


public double a() {
double local1 = (this.e - this.b);
    double local3 = (this.f - this.c);
    double local5 = (this.g - this.d);
    return (((local1 + local3) + local5) / 0x1.8p1d);
}


public net.minecraft.util.MovingObjectPosition a(moom.DR p0, moom.DR p1) {
int forwardValue1568_53_0;
    int forwardValue1568_61_0;
    int forwardValue1568_69_0;
    int forwardValue1568_77_0;
    int forwardValue1568_85_0;
    moom.DR forwardValue1568_95_0;
    moom.DR forwardValue1568_115_0;
    moom.DR forwardValue1568_117_0;
    moom.DR forwardValue1568_135_0;
    moom.DR forwardValue1568_137_0;
    moom.DR forwardValue1568_155_0;
    moom.DR forwardValue1568_157_0;
    moom.DR forwardValue1568_175_0;
    moom.DR forwardValue1568_177_0;
    moom.DR forwardValue1568_195_0;
    moom.DR forwardValue1568_197_0;
    moom.DR forwardValue1568_212_0;
    moom.DR forwardValue1568_212_1;
    moom.DR forwardValue1568_220_0;
    moom.DR forwardValue1568_220_1;
    moom.DR forwardValue1568_228_0;
    moom.DR forwardValue1568_228_1;
    moom.DR forwardValue1568_236_0;
    moom.DR forwardValue1568_236_1;
    boolean spill1568_0;
    boolean spill1568_1;
    moom.DR spill1568_2;
    moom.DR spill1568_3;
    moom.DR spill1568_4;
    moom.DR spill1568_5;
    moom.DR spill1568_6;
    moom.DR spill1568_7;
    moom.DR spill1568_8;
    moom.DR spill1568_9;
    moom.DR spill1568_10;
    moom.DR spill1568_11;
    moom.DR spill1568_12;
    moom.DR spill1568_13;
    moom.DR spill1568_14;
    moom.DR spill1568_15;
    long life3_3;
    moom.DR life6_9;
    moom.DR life7_15;
    moom.DR life8_21;
    moom.DR life9_27;
    moom.DR life10_34;
    moom.DR life11_40;
    int life5_41;
    moom.DR life12_104;
    java.lang.Object life13_311;
    moom.bs life13_321;
    forward_join_242: {
    forward_join_240: {
    forward_join_236: {
    forward_join_234: {
    forward_join_228: {
    forward_join_226: {
    forward_join_220: {
    forward_join_218: {
    forward_join_212: {
    forward_join_210: {
    forward_join_200: {
    forward_join_197: {
    forward_join_196: {
    forward_join_195: {
    forward_join_194: {
    forward_join_177: {
    forward_join_176: {
    forward_join_175: {
    forward_join_174: {
    forward_join_157: {
    forward_join_156: {
    forward_join_155: {
    forward_join_154: {
    forward_join_137: {
    forward_join_136: {
    forward_join_135: {
    forward_join_134: {
    forward_join_117: {
    forward_join_116: {
    forward_join_115: {
    forward_join_114: {
    forward_join_96: {
    forward_join_95: {
    forward_join_88: {
    forward_join_85: {
    forward_join_82: {
    forward_join_77: {
    forward_join_74: {
    forward_join_69: {
    forward_join_66: {
    forward_join_61: {
    forward_join_58: {
    forward_join_53: {
    forward_join_50: {
    life3_3 = (moom.CA.k ^ 35054465814924L);
    life6_9 = ((moom.DR)(p0)).a(((moom.DR)(p1)), ((double)(this.b)));
    life7_15 = ((moom.DR)(p0)).a(((moom.DR)(p1)), ((double)(this.e)));
    life8_21 = ((moom.DR)(p0)).b(((moom.DR)(p1)), ((double)(this.c)));
    life9_27 = ((moom.DR)(p0)).b(((moom.DR)(p1)), ((double)(this.f)));
    spill1568_0 = moom.DS.c__Boolean();
    life10_34 = ((moom.DR)(p0)).c(((moom.DR)(p1)), ((double)(this.d)));
    life11_40 = ((moom.DR)(p0)).c(((moom.DR)(p1)), ((double)(this.g)));
    life5_41 = ((spill1568_0) ? 1 : 0);
    spill1568_1 = ((moom.CA)(this)).b(((moom.DR)(life6_9)));
    if (!((life5_41 != 0))) {
        forwardValue1568_53_0 = ((spill1568_1) ? 1 : 0);
        break forward_join_53;
    }
    if (!((!spill1568_1))) {
        break forward_join_50;
    }
    life6_9 = null;
    }
    forwardValue1568_53_0 = ((((moom.CA)(this)).b(((moom.DR)(life7_15)))) ? 1 : 0);
    }
    if (!((life5_41 != 0))) {
        forwardValue1568_61_0 = forwardValue1568_53_0;
        break forward_join_61;
    }
    if (!((forwardValue1568_53_0 == 0))) {
        break forward_join_58;
    }
    life7_15 = null;
    }
    forwardValue1568_61_0 = ((((moom.CA)(this)).c(((moom.DR)(life8_21)))) ? 1 : 0);
    }
    if (!((life5_41 != 0))) {
        forwardValue1568_69_0 = forwardValue1568_61_0;
        break forward_join_69;
    }
    if (!((forwardValue1568_61_0 == 0))) {
        break forward_join_66;
    }
    life8_21 = null;
    }
    forwardValue1568_69_0 = ((((moom.CA)(this)).c(((moom.DR)(life9_27)))) ? 1 : 0);
    }
    if (!((life5_41 != 0))) {
        forwardValue1568_77_0 = forwardValue1568_69_0;
        break forward_join_77;
    }
    if (!((forwardValue1568_69_0 == 0))) {
        break forward_join_74;
    }
    life9_27 = null;
    }
    forwardValue1568_77_0 = ((((moom.CA)(this)).d(((moom.DR)(life10_34)))) ? 1 : 0);
    }
    if (!((life5_41 != 0))) {
        forwardValue1568_85_0 = forwardValue1568_77_0;
        break forward_join_85;
    }
    if (!((forwardValue1568_77_0 == 0))) {
        break forward_join_82;
    }
    life10_34 = null;
    }
    forwardValue1568_85_0 = ((((moom.CA)(this)).d(((moom.DR)(life11_40)))) ? 1 : 0);
    }
    if (!((forwardValue1568_85_0 == 0))) {
        break forward_join_88;
    }
    life11_40 = null;
    }
    life12_104 = null;
    spill1568_2 = life6_9;
    if (!((life5_41 != 0))) {
        forwardValue1568_95_0 = spill1568_2;
        break forward_join_95;
    }
    if (!((spill1568_2 != null))) {
        break forward_join_96;
    }
    forwardValue1568_95_0 = life6_9;
    }
    life12_104 = forwardValue1568_95_0;
    }
    spill1568_3 = life7_15;
    if (!((life5_41 != 0))) {
        forwardValue1568_117_0 = spill1568_3;
        break forward_join_117;
    }
    if (!((spill1568_3 != null))) {
        break forward_join_116;
    }
    spill1568_4 = life12_104;
    if (!((life5_41 != 0))) {
        forwardValue1568_115_0 = spill1568_4;
        break forward_join_115;
    }
    if (!((spill1568_4 != null))) {
        break forward_join_114;
    }
    spill1568_5 = p0;
    if (!((life5_41 != 0))) {
        forwardValue1568_117_0 = spill1568_5;
        break forward_join_117;
    }
    if (!((recovery.source.CarrierOps.dcmpg(((double)(((moom.DR)(spill1568_5)).c(((moom.DR)(life7_15))))), ((double)(((moom.DR)(p0)).c(((moom.DR)(life12_104)))))) < 0))) {
        break forward_join_116;
    }
    }
    forwardValue1568_115_0 = life7_15;
    }
    life12_104 = forwardValue1568_115_0;
    }
    forwardValue1568_117_0 = life8_21;
    }
    if (!((life5_41 != 0))) {
        forwardValue1568_137_0 = forwardValue1568_117_0;
        break forward_join_137;
    }
    if (!((forwardValue1568_117_0 != null))) {
        break forward_join_136;
    }
    spill1568_6 = life12_104;
    if (!((life5_41 != 0))) {
        forwardValue1568_135_0 = spill1568_6;
        break forward_join_135;
    }
    if (!((spill1568_6 != null))) {
        break forward_join_134;
    }
    spill1568_7 = p0;
    if (!((life5_41 != 0))) {
        forwardValue1568_137_0 = spill1568_7;
        break forward_join_137;
    }
    if (!((recovery.source.CarrierOps.dcmpg(((double)(((moom.DR)(spill1568_7)).c(((moom.DR)(life8_21))))), ((double)(((moom.DR)(p0)).c(((moom.DR)(life12_104)))))) < 0))) {
        break forward_join_136;
    }
    }
    forwardValue1568_135_0 = life8_21;
    }
    life12_104 = forwardValue1568_135_0;
    }
    forwardValue1568_137_0 = life9_27;
    }
    if (!((life5_41 != 0))) {
        forwardValue1568_157_0 = forwardValue1568_137_0;
        break forward_join_157;
    }
    if (!((forwardValue1568_137_0 != null))) {
        break forward_join_156;
    }
    spill1568_8 = life12_104;
    if (!((life5_41 != 0))) {
        forwardValue1568_155_0 = spill1568_8;
        break forward_join_155;
    }
    if (!((spill1568_8 != null))) {
        break forward_join_154;
    }
    spill1568_9 = p0;
    if (!((life5_41 != 0))) {
        forwardValue1568_157_0 = spill1568_9;
        break forward_join_157;
    }
    if (!((recovery.source.CarrierOps.dcmpg(((double)(((moom.DR)(spill1568_9)).c(((moom.DR)(life9_27))))), ((double)(((moom.DR)(p0)).c(((moom.DR)(life12_104)))))) < 0))) {
        break forward_join_156;
    }
    }
    forwardValue1568_155_0 = life9_27;
    }
    life12_104 = forwardValue1568_155_0;
    }
    forwardValue1568_157_0 = life10_34;
    }
    if (!((life5_41 != 0))) {
        forwardValue1568_177_0 = forwardValue1568_157_0;
        break forward_join_177;
    }
    if (!((forwardValue1568_157_0 != null))) {
        break forward_join_176;
    }
    spill1568_10 = life12_104;
    if (!((life5_41 != 0))) {
        forwardValue1568_175_0 = spill1568_10;
        break forward_join_175;
    }
    if (!((spill1568_10 != null))) {
        break forward_join_174;
    }
    spill1568_11 = p0;
    if (!((life5_41 != 0))) {
        forwardValue1568_177_0 = spill1568_11;
        break forward_join_177;
    }
    if (!((recovery.source.CarrierOps.dcmpg(((double)(((moom.DR)(spill1568_11)).c(((moom.DR)(life10_34))))), ((double)(((moom.DR)(p0)).c(((moom.DR)(life12_104)))))) < 0))) {
        break forward_join_176;
    }
    }
    forwardValue1568_175_0 = life10_34;
    }
    life12_104 = forwardValue1568_175_0;
    }
    forwardValue1568_177_0 = life11_40;
    }
    if (!((life5_41 != 0))) {
        forwardValue1568_197_0 = forwardValue1568_177_0;
        break forward_join_197;
    }
    if (!((forwardValue1568_177_0 != null))) {
        break forward_join_196;
    }
    spill1568_12 = life12_104;
    if (!((life5_41 != 0))) {
        forwardValue1568_195_0 = spill1568_12;
        break forward_join_195;
    }
    if (!((spill1568_12 != null))) {
        break forward_join_194;
    }
    spill1568_13 = p0;
    if (!((life5_41 != 0))) {
        forwardValue1568_197_0 = spill1568_13;
        break forward_join_197;
    }
    if (!((recovery.source.CarrierOps.dcmpg(((double)(((moom.DR)(spill1568_13)).c(((moom.DR)(life11_40))))), ((double)(((moom.DR)(p0)).c(((moom.DR)(life12_104)))))) < 0))) {
        break forward_join_196;
    }
    }
    forwardValue1568_195_0 = life11_40;
    }
    life12_104 = forwardValue1568_195_0;
    }
    forwardValue1568_197_0 = life12_104;
    }
    if (!((forwardValue1568_197_0 == null))) {
        break forward_join_200;
    }
    return null;
    }
    life13_311 = null;
    spill1568_14 = life12_104;
    spill1568_15 = life6_9;
    if (!((life5_41 != 0))) {
        forwardValue1568_212_0 = spill1568_14;
        forwardValue1568_212_1 = spill1568_15;
        break forward_join_212;
    }
    if (!((spill1568_14 == spill1568_15))) {
        break forward_join_210;
    }
    life13_321 = moom.bs.WEST;
    break forward_join_242;
    }
    forwardValue1568_212_0 = life12_104;
    forwardValue1568_212_1 = life7_15;
    }
    if (!((life5_41 != 0))) {
        forwardValue1568_220_0 = forwardValue1568_212_0;
        forwardValue1568_220_1 = forwardValue1568_212_1;
        break forward_join_220;
    }
    if (!((forwardValue1568_212_0 == forwardValue1568_212_1))) {
        break forward_join_218;
    }
    life13_321 = moom.bs.EAST;
    break forward_join_242;
    }
    forwardValue1568_220_0 = life12_104;
    forwardValue1568_220_1 = life8_21;
    }
    if (!((life5_41 != 0))) {
        forwardValue1568_228_0 = forwardValue1568_220_0;
        forwardValue1568_228_1 = forwardValue1568_220_1;
        break forward_join_228;
    }
    if (!((forwardValue1568_220_0 == forwardValue1568_220_1))) {
        break forward_join_226;
    }
    life13_321 = moom.bs.DOWN;
    break forward_join_242;
    }
    forwardValue1568_228_0 = life12_104;
    forwardValue1568_228_1 = life9_27;
    }
    if (!((life5_41 != 0))) {
        forwardValue1568_236_0 = forwardValue1568_228_0;
        forwardValue1568_236_1 = forwardValue1568_228_1;
        break forward_join_236;
    }
    if (!((forwardValue1568_228_0 == forwardValue1568_228_1))) {
        break forward_join_234;
    }
    life13_321 = moom.bs.UP;
    break forward_join_242;
    }
    forwardValue1568_236_0 = life12_104;
    forwardValue1568_236_1 = life10_34;
    }
    if (!((forwardValue1568_236_0 == forwardValue1568_236_1))) {
        break forward_join_240;
    }
    life13_321 = moom.bs.NORTH;
    break forward_join_242;
    }
    life13_321 = moom.bs.SOUTH;
    }
    return new net.minecraft.util.MovingObjectPosition(life12_104, life13_321);
}


public double a(moom.CA p0, double p1) {
double forwardValue1566_65_0;
    int forwardValue1566_73_0;
    double forwardValue1566_97_0;
    double spill1566_0;
    double spill1566_1;
    double spill1566_2;
    double spill1566_3;
    int spill1566_4;
    int spill1566_5;
    double spill1566_6;
    double spill1566_7;
    double spill1566_8;
    double spill1566_9;
    long life4_3;
    int life6_5;
    double life7_90;
    double life7_138;
    forward_join_97: {
    forward_join_96: {
    forward_join_73: {
    forward_join_68: {
    forward_join_66: {
    forward_join_65: {
    life4_3 = (moom.CA.k ^ 131714758412856L);
    life6_5 = ((moom.DS.b__Boolean()) ? 1 : 0);
    spill1566_0 = ((moom.CA)(p0)).f;
    if (!((life6_5 == 0))) {
        forwardValue1566_97_0 = spill1566_0;
        break forward_join_97;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(spill1566_0)), ((double)(this.c))) > 0))) {
        break forward_join_96;
    }
    spill1566_1 = ((moom.CA)(p0)).c;
    if (!((life6_5 == 0))) {
        forwardValue1566_97_0 = spill1566_1;
        break forward_join_97;
    }
    if (!((recovery.source.CarrierOps.dcmpg(((double)(spill1566_1)), ((double)(this.f))) < 0))) {
        break forward_join_96;
    }
    spill1566_2 = ((moom.CA)(p0)).g;
    if (!((life6_5 == 0))) {
        forwardValue1566_97_0 = spill1566_2;
        break forward_join_97;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(spill1566_2)), ((double)(this.d))) > 0))) {
        break forward_join_96;
    }
    spill1566_3 = ((moom.CA)(p0)).d;
    if (!((life6_5 == 0))) {
        forwardValue1566_97_0 = spill1566_3;
        break forward_join_97;
    }
    if (!((recovery.source.CarrierOps.dcmpg(((double)(spill1566_3)), ((double)(this.g))) < 0))) {
        break forward_join_96;
    }
    spill1566_4 = recovery.source.CarrierOps.dcmpl(((double)(p1)), ((double)(0x0.0p0d)));
    if (!((life6_5 == 0))) {
        forwardValue1566_73_0 = spill1566_4;
        break forward_join_73;
    }
    if (!((spill1566_4 > 0))) {
        break forward_join_68;
    }
    spill1566_5 = recovery.source.CarrierOps.dcmpg(((double)(((moom.CA)(p0)).e)), ((double)(this.b)));
    if (!((life6_5 == 0))) {
        forwardValue1566_73_0 = spill1566_5;
        break forward_join_73;
    }
    if (!((spill1566_5 <= 0))) {
        break forward_join_68;
    }
    life7_90 = (this.b - ((moom.CA)(p0)).e);
    spill1566_6 = life7_90;
    if (!((life6_5 == 0))) {
        forwardValue1566_65_0 = spill1566_6;
        break forward_join_65;
    }
    if (!((recovery.source.CarrierOps.dcmpg(((double)(spill1566_6)), ((double)(p1))) < 0))) {
        break forward_join_66;
    }
    forwardValue1566_65_0 = life7_90;
    }
    p1 = forwardValue1566_65_0;
    }
    if (!((life6_5 != 0))) {
        break forward_join_96;
    }
    }
    spill1566_7 = p1;
    if (!((life6_5 == 0))) {
        forwardValue1566_97_0 = spill1566_7;
        break forward_join_97;
    }
    forwardValue1566_73_0 = recovery.source.CarrierOps.dcmpg(((double)(spill1566_7)), ((double)(0x0.0p0d)));
    }
    if (!((forwardValue1566_73_0 < 0))) {
        break forward_join_96;
    }
    spill1566_8 = ((moom.CA)(p0)).b;
    if (!((life6_5 == 0))) {
        forwardValue1566_97_0 = spill1566_8;
        break forward_join_97;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(spill1566_8)), ((double)(this.e))) >= 0))) {
        break forward_join_96;
    }
    life7_138 = (this.e - ((moom.CA)(p0)).b);
    spill1566_9 = life7_138;
    if (!((life6_5 == 0))) {
        forwardValue1566_97_0 = spill1566_9;
        break forward_join_97;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(spill1566_9)), ((double)(p1))) > 0))) {
        break forward_join_96;
    }
    p1 = life7_138;
    }
    forwardValue1566_97_0 = p1;
    }
    return forwardValue1566_97_0;
}


public boolean a__Boolean() {
int forwardValue1569_43_0;
    int forwardValue1569_45_0;
    boolean spill1569_0;
    boolean spill1569_1;
    boolean spill1569_2;
    boolean spill1569_3;
    boolean spill1569_4;
    boolean spill1569_5;
    long life1_3;
    int life3_5;
    forward_join_45: {
    forward_join_44: {
    forward_join_43: {
    forward_join_42: {
    life1_3 = (moom.CA.k ^ 111123705807129L);
    life3_5 = ((moom.DS.b__Boolean()) ? 1 : 0);
    spill1569_0 = java.lang.Double.isNaN(((double)(this.b)));
    if (!((life3_5 == 0))) {
        forwardValue1569_43_0 = ((spill1569_0) ? 1 : 0);
        break forward_join_43;
    }
    if (!((!spill1569_0))) {
        break forward_join_42;
    }
    spill1569_1 = java.lang.Double.isNaN(((double)(this.c)));
    if (!((life3_5 == 0))) {
        forwardValue1569_43_0 = ((spill1569_1) ? 1 : 0);
        break forward_join_43;
    }
    if (!((!spill1569_1))) {
        break forward_join_42;
    }
    spill1569_2 = java.lang.Double.isNaN(((double)(this.d)));
    if (!((life3_5 == 0))) {
        forwardValue1569_43_0 = ((spill1569_2) ? 1 : 0);
        break forward_join_43;
    }
    if (!((!spill1569_2))) {
        break forward_join_42;
    }
    spill1569_3 = java.lang.Double.isNaN(((double)(this.e)));
    if (!((life3_5 == 0))) {
        forwardValue1569_43_0 = ((spill1569_3) ? 1 : 0);
        break forward_join_43;
    }
    if (!((!spill1569_3))) {
        break forward_join_42;
    }
    spill1569_4 = java.lang.Double.isNaN(((double)(this.f)));
    if (!((life3_5 == 0))) {
        forwardValue1569_43_0 = ((spill1569_4) ? 1 : 0);
        break forward_join_43;
    }
    if (!((!spill1569_4))) {
        break forward_join_42;
    }
    spill1569_5 = java.lang.Double.isNaN(((double)(this.g)));
    if (!((life3_5 == 0))) {
        forwardValue1569_43_0 = ((spill1569_5) ? 1 : 0);
        break forward_join_43;
    }
    if (!(spill1569_5)) {
        break forward_join_44;
    }
    }
    forwardValue1569_43_0 = 1;
    }
    forwardValue1569_45_0 = forwardValue1569_43_0;
    break forward_join_45;
    }
    forwardValue1569_45_0 = 0;
    }
    return ((forwardValue1569_45_0) != 0);
}


public java.util.List<moom.DR> a__List() {
long life1_3;
    int life3_5;
    life1_3 = (moom.CA.k ^ 100327903299390L);
    life3_5 = ((moom.DS.c__Boolean()) ? 1 : 0);
    moom.DR[] __stackOp1571_4_0 = new moom.DR[__sourceIntrinsic_4b3d0be45f41_invokedynamic1571_3(2967, (924296414369541201L ^ life1_3))];
    moom.DR[] spill1571_0 = __stackOp1571_4_0;
    (__stackOp1571_4_0)[0] = new moom.DR(this.b, this.c, this.d);
    moom.DR[] __stackOp1571_8_0 = spill1571_0;
    moom.DR[] spill1571_1 = __stackOp1571_8_0;
    (__stackOp1571_8_0)[1] = new moom.DR(this.b, this.c, this.g);
    moom.DR[] __stackOp1571_12_0 = spill1571_1;
    moom.DR[] spill1571_2 = __stackOp1571_12_0;
    (__stackOp1571_12_0)[2] = new moom.DR(this.e, this.c, this.d);
    moom.DR[] __stackOp1571_16_0 = spill1571_2;
    moom.DR[] spill1571_3 = __stackOp1571_16_0;
    (__stackOp1571_16_0)[3] = new moom.DR(this.e, this.c, this.g);
    moom.DR[] __stackOp1571_20_0 = spill1571_3;
    moom.DR[] spill1571_4 = __stackOp1571_20_0;
    (__stackOp1571_20_0)[4] = new moom.DR(this.b, this.f, this.d);
    moom.DR[] __stackOp1571_24_0 = spill1571_4;
    moom.DR[] spill1571_5 = __stackOp1571_24_0;
    (__stackOp1571_24_0)[5] = new moom.DR(this.b, this.f, this.g);
    moom.DR[] __stackOp1571_28_0 = spill1571_5;
    moom.DR[] spill1571_6 = __stackOp1571_28_0;
    (__stackOp1571_28_0)[__sourceIntrinsic_4b3d0be45f41_invokedynamic1571_29(6913, (7297487952221011140L ^ life1_3))] = new moom.DR(this.e, this.f, this.d);
    moom.DR[] __stackOp1571_33_0 = spill1571_6;
    moom.DR[] spill1571_7 = __stackOp1571_33_0;
    (__stackOp1571_33_0)[__sourceIntrinsic_4b3d0be45f41_invokedynamic1571_34(5706, (8357146172736696718L ^ life1_3))] = new moom.DR(this.e, this.f, this.g);
    java.util.ArrayList spill1571_8 = com.google.common.collect.Lists.newArrayList(((java.lang.Object[])(spill1571_7)));
    if ((net.minecraft.entity.Entity.b__ArrayString() != null)) {
        moom.DS.b(((boolean)__sourceIntrinsic_integerToBoolean((((life3_5 != 0) ? 0 : 1)))));
    }
    return spill1571_8;
}


private static native <E extends Throwable> double __sourceIntrinsic_eb8803ad1f63_exactNonfiniteDoubleLiteral382_34() throws E;

private static native <E extends Throwable> double __sourceIntrinsic_eb8803ad1f63_exactNonfiniteDoubleLiteral382_35() throws E;

private static native <E extends Throwable> double __sourceIntrinsic_eb8803ad1f63_exactNonfiniteDoubleLiteral382_36() throws E;

private static native <E extends Throwable> double __sourceIntrinsic_eb8803ad1f63_exactNonfiniteDoubleLiteral382_37() throws E;

private static native <E extends Throwable> double __sourceIntrinsic_eb8803ad1f63_exactNonfiniteDoubleLiteral382_38() throws E;

private static native <E extends Throwable> double __sourceIntrinsic_eb8803ad1f63_exactNonfiniteDoubleLiteral382_39() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral4019_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4b3d0be45f41_invokedynamic1571_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4b3d0be45f41_invokedynamic1571_29(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4b3d0be45f41_invokedynamic1571_34(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite1072_6(double a0, double a1, double a2, double a3, double a4, double a5) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native int __sourceExactCall_9454b7f14439bf(int p0, long p1);
}
