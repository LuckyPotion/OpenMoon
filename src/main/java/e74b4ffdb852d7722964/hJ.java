package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class hJ extends net.minecraft.client.gui.Gui {

private int f;

private net.minecraft.client.gui.FontRenderer g;

public int h;

public int i;

public int j;

public int k;

public java.lang.String l;

public int m;

public int n;

public boolean o;

public boolean p;

public boolean q;

public boolean r;

public int s;

public int t;

public int u;

public int v;

public int w;

public boolean x;

private moom.hX y;

private com.google.common.base.Predicate<java.lang.String> z;

private static long D;

private static long[] E;

private static java.lang.Integer[] F;

private static java.util.Map G;

public hJ(int p0, net.minecraft.client.gui.FontRenderer p1, int p2, int p3, int p4, int p5) { super(); }


private static void __sourceConstructorBody_8a9489f172ff95cb(moom.hJ receiver, int p0, net.minecraft.client.gui.FontRenderer p1, int p2, int p3, int p4, int p5) throws Throwable {

long local7 = (moom.hJ.D ^ 8936124186600L);

    moom.hJ.__sourceConstructorInit_8a9489f172ff95cb_0(((moom.hJ)(receiver)));

    ((moom.hJ)(receiver)).l = ((java.lang.String)(""));

    ((moom.hJ)(receiver)).m = ((int)(__sourceIntrinsic_8a9489f172ff95cb_originalDynamicSite2823_3(30328, (4927100722266026420L ^ local7))));

    ((moom.hJ)(receiver)).o = ((boolean)(true));

    ((moom.hJ)(receiver)).p = ((boolean)(true));

    ((moom.hJ)(receiver)).r = ((boolean)(true));

    ((moom.hJ)(receiver)).v = ((int)(__sourceIntrinsic_8a9489f172ff95cb_originalDynamicSite2823_8(14709, (5594421094440042161L ^ local7))));

    ((moom.hJ)(receiver)).w = ((int)(__sourceIntrinsic_8a9489f172ff95cb_originalDynamicSite2823_10(4162, (188490095064078221L ^ local7))));

    ((moom.hJ)(receiver)).x = ((boolean)(true));

    ((moom.hJ)(receiver)).z = ((com.google.common.base.Predicate)(com.google.common.base.Predicates.alwaysTrue()));

    ((moom.hJ)(receiver)).f = ((int)(p0));

    ((moom.hJ)(receiver)).g = ((net.minecraft.client.gui.FontRenderer)(p1));

    ((moom.hJ)(receiver)).h = ((int)(p2));

    ((moom.hJ)(receiver)).i = ((int)(p3));

    ((moom.hJ)(receiver)).j = ((int)(p4));

    ((moom.hJ)(receiver)).k = ((int)(p5));

    return;

}



static {
D = ((long)(((moom._a)(moom._c.a(((long)(966673627969768201L)), ((long)(-1145665033701948232L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(148593650555635L)))));
    G = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.hJ.D ^ 16818862913716L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1254_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1254_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1254_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1254_14 = new byte[8];
    (__sourceSpill1254_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1254_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1254_16 = __sourceSpill1254_14;
    ((javax.crypto.Cipher)(__sourceSpill1254_11)).init(((int)(__sourceSpill1254_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1254_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1254_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[12];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "÷A\027m\037õ@Ì%{\027£\023\032Ì\027²ÿ¥&3½B\034B³9'å·ø}§»ExuxDk^ÏM»¬ Ô»\000NþÝ\\}÷\036îòyïä\"ó#ÏÖ2F×"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1254_25 = local6_life21;
        int __sourceSpill1254_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1254_25)).substring(((int)(__sourceSpill1254_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1254_30 = local8_life19;
        int __sourceSpill1254_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1254_33 = new byte[8];
        (__sourceSpill1254_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1254_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1254_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1254_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1254_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1254_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1254_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1254_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1254_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1254_34)).doFinal(((byte[])(__sourceSpill1254_33)));
        (__sourceSpill1254_30)[__sourceSpill1254_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "¹Æ\006rAÚ½Óí$²Î¯"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1254_38 = local6_life21;
        int __sourceSpill1254_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1254_38)).substring(((int)(__sourceSpill1254_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1254_43 = local8_life19;
        int __sourceSpill1254_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1254_46 = new byte[8];
        (__sourceSpill1254_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1254_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1254_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1254_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1254_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1254_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1254_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1254_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1254_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1254_47)).doFinal(((byte[])(__sourceSpill1254_46)));
        (__sourceSpill1254_43)[__sourceSpill1254_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    E = ((long[])(local8_life19));
    F = ((java.lang.Integer[])(new java.lang.Integer[12]));
}

private static native <E extends Throwable> void __sourceConstructorInit_8a9489f172ff95cb_0(moom.hJ a0) throws E;

public void b(java.lang.String p0) {
java.lang.String local2 = "";
    java.lang.String local3 = moom.CH.a(((java.lang.String)(p0)));
    int local4 = java.lang.Math.min(((int)(this.t)), ((int)(this.u)));
    int local5 = java.lang.Math.max(((int)(this.t)), ((int)(this.u)));
    int local6 = ((this.m - ((java.lang.String)(this.l)).length()) - (local4 - local5));
    int local7 = 0;
    if ((((java.lang.String)(this.l)).length() > 0)) {
        local2 = __sourceIntrinsic_d1c1922d1ba0_invokedynamic6609_14(local2, ((java.lang.String)(this.l)).substring(((int)(0)), ((int)(local4))));
    }
    if ((local6 < ((java.lang.String)(local3)).length())) {
        local2 = __sourceIntrinsic_d1c1922d1ba0_invokedynamic6609_17(local2, ((java.lang.String)(local3)).substring(((int)(0)), ((int)(local6))));
        local7 = local6;
    } else {
        local2 = __sourceIntrinsic_d1c1922d1ba0_invokedynamic6609_18(local2, local3);
        local7 = ((java.lang.String)(local3)).length();
    }
    if ((((java.lang.String)(this.l)).length() > 0)) {
        if ((local5 < ((java.lang.String)(this.l)).length())) {
        local2 = __sourceIntrinsic_d1c1922d1ba0_invokedynamic6609_26(local2, ((java.lang.String)(this.l)).substring(((int)(local5))));
    }
    }
    if (((com.google.common.base.Predicate)(this.z)).apply(((java.lang.Object)(local2)))) {
        this.l = ((java.lang.String)(local2));
        ((moom.hJ)(this)).c(((int)(((local4 - this.u) + local7))));
        if ((this.y != null)) {
        ((moom.hX)(this.y)).a(((int)(this.f)), ((java.lang.String)(this.l)));
    }
    }
    return;
}


public boolean b__Boolean() {
return ((((this.q) ? 1 : 0)) != 0);
}


public void b(int p0) {
int life2_25;
    int life3_37;
    int life4_49;
    java.lang.String life5_51;
    if ((((java.lang.String)(this.l)).length() != 0)) {
        if ((this.u != this.t)) {
        ((moom.hJ)(this)).b(((java.lang.String)("")));
    } else {
        life2_25 = ((p0 < 0) ? 1 : 0);
        life3_37 = ((life2_25 != 0) ? (this.t + p0) : this.t);
        life4_49 = ((life2_25 != 0) ? this.t : (this.t + p0));
        life5_51 = "";
        if ((life3_37 >= 0)) {
        life5_51 = ((java.lang.String)(this.l)).substring(((int)(0)), ((int)(life3_37)));
    }
        if ((life4_49 < ((java.lang.String)(this.l)).length())) {
        life5_51 = __sourceIntrinsic_8dbec06774c4_invokedynamic6546_15(life5_51, ((java.lang.String)(this.l)).substring(((int)(life4_49))));
    }
        if (((com.google.common.base.Predicate)(this.z)).apply(((java.lang.Object)(life5_51)))) {
        this.l = ((java.lang.String)(life5_51));
        if ((life2_25 != 0)) {
        ((moom.hJ)(this)).c(((int)(p0)));
    }
        if ((this.y != null)) {
        ((moom.hX)(this.y)).a(((int)(this.f)), ((java.lang.String)(this.l)));
    }
    }
    }
    }
    return;
}


public void b(boolean p0) {
if ((__sourceIntrinsic_booleanComparison(p0) != 0)) {
        if ((((this.q) ? 1 : 0) == 0)) {
        this.n = ((int)(0));
    }
    }
    this.q = ((boolean)(p0));
    return;
}


public int b() {
return this.m;
}


public void b__Void() {
((moom.hJ)(this)).d(((int)(0)));
    return;
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public void e(int p0) {
this.m = ((int)(p0));
    if ((((java.lang.String)(this.l)).length() > p0)) {
        this.l = ((java.lang.String)(((java.lang.String)(this.l)).substring(((int)(0)), ((int)(p0)))));
    }
    return;
}


public void e(boolean p0) {
this.x = ((boolean)(p0));
    return;
}


public int e() {
long local1 = (moom.hJ.D ^ 48198622063402L);
    return (((moom.hJ)(this)).a__Boolean() ? (this.j - __sourceIntrinsic_c4b63a62bb23_invokedynamic7882_3(29739, (415394502527018799L ^ local1))) : this.j);
}


public void c(int p0, int p1, int p2, int p3) {
long life5_3;
    int life7_8;
    int life7_17;
    net.minecraft.client.renderer.Tessellator life7_49;
    moom.lw life8_53;
    life5_3 = (moom.hJ.D ^ 130192037309632L);
    if ((p0 < p2)) {
        life7_8 = p0;
        p0 = p2;
        p2 = life7_8;
    }
    if ((p1 < p3)) {
        life7_17 = p1;
        p1 = p3;
        p3 = life7_17;
    }
    if ((p2 > (this.h + this.j))) {
        p2 = (this.h + this.j);
    }
    if ((p0 > (this.h + this.j))) {
        p0 = (this.h + this.j);
    }
    life7_49 = net.minecraft.client.renderer.Tessellator.a();
    int spill6547_0 = 26459;
    life8_53 = ((net.minecraft.client.renderer.Tessellator)(life7_49)).a__lw();
    long spill6547_1 = (1747511498812928954L ^ life5_3);
    moom.kZ.c(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.fep7f)), ((float)(0x1.fep7f)));
    moom.kZ.v();
    moom.kZ.s();
    moom.kZ.f(((int)(__sourceIntrinsic_8f97abcbcfce_invokedynamic6547_14(spill6547_0, spill6547_1))));
    ((moom.lw)(life8_53)).a(((int)(__sourceIntrinsic_8f97abcbcfce_invokedynamic6547_16(11424, (775136320532281421L ^ life5_3)))), ((moom.oD)(moom.oB.g)));
    ((moom.lw)(((moom.lw)(life8_53)).a(((double)(((double) p0))), ((double)(((double) p3))), ((double)(0x0.0p0d))))).c__Void();
    ((moom.lw)(((moom.lw)(life8_53)).a(((double)(((double) p2))), ((double)(((double) p3))), ((double)(0x0.0p0d))))).c__Void();
    ((moom.lw)(((moom.lw)(life8_53)).a(((double)(((double) p2))), ((double)(((double) p1))), ((double)(0x0.0p0d))))).c__Void();
    ((moom.lw)(((moom.lw)(life8_53)).a(((double)(((double) p0))), ((double)(((double) p1))), ((double)(0x0.0p0d))))).c__Void();
    ((net.minecraft.client.renderer.Tessellator)(life7_49)).a__Void();
    moom.kZ.t();
    moom.kZ.u();
    return;
}


public void c(boolean p0) {
this.r = ((boolean)(p0));
    return;
}


public void c__Void() {
((moom.hJ)(this)).d(((int)(((java.lang.String)(this.l)).length())));
    return;
}


public boolean c__Boolean() {
return ((((this.x) ? 1 : 0)) != 0);
}


public int c() {
return this.t;
}


public void c(int p0) {
((moom.hJ)(this)).d(((int)((this.u + p0))));
    return;
}


public java.lang.String c__String() {
int local1 = java.lang.Math.min(((int)(this.t)), ((int)(this.u)));
    int local2 = java.lang.Math.max(((int)(this.t)), ((int)(this.u)));
    return ((java.lang.String)(this.l)).substring(((int)(local1)), ((int)(local2)));
}


public void h(int p0) {
int life2_3;
    int life3_34;
    java.lang.String life4_44;
    int life5_50;
    life2_3 = ((java.lang.String)(this.l)).length();
    if ((p0 > life2_3)) {
        p0 = life2_3;
    }
    if ((p0 < 0)) {
        p0 = 0;
    }
    this.u = ((int)(p0));
    if ((this.g != null)) {
        if ((this.s > life2_3)) {
        this.s = ((int)(life2_3));
    }
        life3_34 = ((moom.hJ)(this)).e();
        life4_44 = ((net.minecraft.client.gui.FontRenderer)(this.g)).a__String(((java.lang.String)(((java.lang.String)(this.l)).substring(((int)(this.s))))), ((int)(life3_34)));
        life5_50 = (((java.lang.String)(life4_44)).length() + this.s);
        if ((p0 == this.s)) {
        moom.hJ __stackOp3605_15_0 = this;
        ((moom.hJ)(__stackOp3605_15_0)).s = ((int)((((moom.hJ)(__stackOp3605_15_0)).s - ((java.lang.String)(((net.minecraft.client.gui.FontRenderer)(this.g)).a(((java.lang.String)(this.l)), ((int)(life3_34)), ((boolean)(true))))).length())));
    }
        if ((p0 > life5_50)) {
        moom.hJ __stackOp3605_22_0 = this;
        ((moom.hJ)(__stackOp3605_22_0)).s = ((int)((((moom.hJ)(__stackOp3605_22_0)).s + (p0 - life5_50))));
    } else {
        if ((p0 <= this.s)) {
        moom.hJ __stackOp3605_26_0 = this;
        ((moom.hJ)(__stackOp3605_26_0)).s = ((int)((((moom.hJ)(__stackOp3605_26_0)).s - (this.s - p0))));
    }
    }
        this.s = ((int)(moom.Dr.a(((int)(this.s)), ((int)(0)), ((int)(life2_3)))));
    }
    return;
}


public void f(int p0) {
this.v = ((int)(p0));
    return;
}


public void d(boolean p0) {
this.p = ((boolean)(p0));
    return;
}


public int d() {
return this.u;
}


public void d(int p0) {
this.t = ((int)(p0));
    int local2 = ((java.lang.String)(this.l)).length();
    this.t = ((int)(moom.Dr.a(((int)(this.t)), ((int)(0)), ((int)(local2)))));
    ((moom.hJ)(this)).h(((int)(this.t)));
    return;
}


public void d__Void() {
int forestValue900186_66_0;
    int forestValue900186_99_0;
    int forestValue900186_119_0;
    int forestValue900186_130_0;
    int forestValue900186_150_0;
    java.lang.String forestValue900186_171_0;
    int forestValue900186_197_0;
    int forestValue900186_210_0;
    long life1_3;
    int life3_72;
    int life4_78;
    int life5_84;
    java.lang.String life6_95;
    int life7_109;
    int life8_135;
    int life9_148;
    int life10_170;
    int life11_172;
    java.lang.String life12_197;
    int life12_228;
    int life13_230;
    int life11_281;
    int life14_335;
    forest_join_304: {
    forest_join_275: {
    forest_join_265: {
    forest_join_240: {
    forest_join_219: {
    forest_join_212: {
    forest_join_210: {
    forest_join_209: {
    forest_join_197: {
    forest_join_196: {
    forest_join_194: {
    forest_join_182: {
    forest_join_171: {
    forest_join_170: {
    forest_join_160: {
    forest_join_150: {
    forest_join_148: {
    forest_join_130: {
    forest_join_128: {
    forest_join_119: {
    forest_join_118: {
    forest_join_99: {
    forest_join_98: {
    forest_join_66: {
    forest_join_64: {
    forest_join_58: {
    life1_3 = (moom.hJ.D ^ 79712788605141L);
    if (!(((moom.hJ)(this)).c__Boolean())) {
        break forest_join_304;
    }
    if (!(((moom.hJ)(this)).a__Boolean())) {
        break forest_join_58;
    }
    moom.hJ.a(((int)((this.h - 1))), ((int)((this.i - 1))), ((int)(((this.h + this.j) + 1))), ((int)(((this.i + this.k) + 1))), ((int)(__sourceIntrinsic_a91ecd6db48f_invokedynamic900186_9(31928, (5836376538290236495L ^ life1_3)))));
    moom.hJ.a(((int)(this.h)), ((int)(this.i)), ((int)((this.h + this.j))), ((int)((this.i + this.k))), ((int)(__sourceIntrinsic_a91ecd6db48f_invokedynamic900186_17(18330, (7252145598982428524L ^ life1_3)))));
    }
    if (!(this.r)) {
        break forest_join_64;
    }
    forestValue900186_66_0 = this.v;
    break forest_join_66;
    }
    forestValue900186_66_0 = this.w;
    }
    life3_72 = forestValue900186_66_0;
    life4_78 = (this.t - this.s);
    life5_84 = (this.u - this.s);
    life6_95 = ((net.minecraft.client.gui.FontRenderer)(this.g)).a__String(((java.lang.String)(((java.lang.String)(this.l)).substring(((int)(this.s))))), ((int)(((moom.hJ)(this)).e())));
    if (!((life4_78 >= 0))) {
        break forest_join_98;
    }
    if (!((life4_78 <= ((java.lang.String)(life6_95)).length()))) {
        break forest_join_98;
    }
    forestValue900186_99_0 = 1;
    break forest_join_99;
    }
    forestValue900186_99_0 = 0;
    }
    life7_109 = forestValue900186_99_0;
    if (!(this.q)) {
        break forest_join_118;
    }
    if (!((((this.n / __sourceIntrinsic_a91ecd6db48f_invokedynamic900186_35(17061, (2839806683030655568L ^ life1_3))) % 2) == 0))) {
        break forest_join_118;
    }
    if (!((life7_109 != 0))) {
        break forest_join_118;
    }
    forestValue900186_119_0 = 1;
    break forest_join_119;
    }
    forestValue900186_119_0 = 0;
    }
    life8_135 = forestValue900186_119_0;
    if (!(this.o)) {
        break forest_join_128;
    }
    forestValue900186_130_0 = (this.h + 4);
    break forest_join_130;
    }
    forestValue900186_130_0 = this.h;
    }
    life9_148 = forestValue900186_130_0;
    if (!(this.o)) {
        break forest_join_148;
    }
    forestValue900186_150_0 = (this.i + ((this.k - __sourceIntrinsic_a91ecd6db48f_invokedynamic900186_42(5387, (6266625588753942011L ^ life1_3))) / 2));
    break forest_join_150;
    }
    forestValue900186_150_0 = this.i;
    }
    life10_170 = forestValue900186_150_0;
    life11_172 = life9_148;
    if (!((life5_84 > ((java.lang.String)(life6_95)).length()))) {
        break forest_join_160;
    }
    life5_84 = ((java.lang.String)(life6_95)).length();
    }
    if (!((((java.lang.String)(life6_95)).length() > 0))) {
        break forest_join_182;
    }
    if (!((life7_109 != 0))) {
        break forest_join_170;
    }
    forestValue900186_171_0 = ((java.lang.String)(life6_95)).substring(((int)(0)), ((int)(life4_78)));
    break forest_join_171;
    }
    forestValue900186_171_0 = life6_95;
    }
    life12_197 = forestValue900186_171_0;
    life11_172 = ((net.minecraft.client.gui.FontRenderer)(this.g)).a(((java.lang.String)(life12_197)), ((float)(((float) life9_148))), ((float)(((float) life10_170))), ((int)(life3_72)));
    }
    if (!((this.t >= ((java.lang.String)(this.l)).length()))) {
        break forest_join_194;
    }
    if (!((((java.lang.String)(this.l)).length() >= ((moom.hJ)(this)).b()))) {
        break forest_join_196;
    }
    }
    forestValue900186_197_0 = 1;
    break forest_join_197;
    }
    forestValue900186_197_0 = 0;
    }
    life12_228 = forestValue900186_197_0;
    life13_230 = life11_172;
    if (!((life7_109 == 0))) {
        break forest_join_212;
    }
    if (!((life4_78 > 0))) {
        break forest_join_209;
    }
    forestValue900186_210_0 = (life9_148 + this.j);
    break forest_join_210;
    }
    forestValue900186_210_0 = life9_148;
    }
    life13_230 = forestValue900186_210_0;
    break forest_join_219;
    }
    if (!((life12_228 != 0))) {
        break forest_join_219;
    }
    life13_230 = (life11_172 - 1);
    life11_172 += -1;
    }
    if (!((((java.lang.String)(life6_95)).length() > 0))) {
        break forest_join_240;
    }
    if (!((life7_109 != 0))) {
        break forest_join_240;
    }
    if (!((life4_78 < ((java.lang.String)(life6_95)).length()))) {
        break forest_join_240;
    }
    life11_281 = ((net.minecraft.client.gui.FontRenderer)(this.g)).a(((java.lang.String)(((java.lang.String)(life6_95)).substring(((int)(life4_78))))), ((float)(((float) life11_172))), ((float)(((float) life10_170))), ((int)(life3_72)));
    life11_281 = life11_281;
    }
    if (!((life8_135 != 0))) {
        break forest_join_275;
    }
    if (!((life12_228 != 0))) {
        break forest_join_265;
    }
    net.minecraft.client.gui.Gui.a(((int)(life13_230)), ((int)((life10_170 - 1))), ((int)((life13_230 + 1))), ((int)(((life10_170 + 1) + ((net.minecraft.client.gui.FontRenderer)(this.g)).c))), ((int)(__sourceIntrinsic_a91ecd6db48f_invokedynamic900186_64(30793, (7945339637473519802L ^ life1_3)))));
    break forest_join_275;
    }
    ((net.minecraft.client.gui.FontRenderer)(this.g)).a(((java.lang.String)("_")), ((float)(((float) life13_230))), ((float)(((float) life10_170))), ((int)(life3_72)));
    }
    if (!((life5_84 != life4_78))) {
        break forest_join_304;
    }
    life14_335 = (life9_148 + ((net.minecraft.client.gui.FontRenderer)(this.g)).a(((java.lang.String)(((java.lang.String)(life6_95)).substring(((int)(0)), ((int)(life5_84)))))));
    ((moom.hJ)(this)).c(((int)(life13_230)), ((int)((life10_170 - 1))), ((int)((life14_335 - 1))), ((int)(((life10_170 + 1) + ((net.minecraft.client.gui.FontRenderer)(this.g)).c))));
    }
    return;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.hJ.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral7886_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/hJ"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a__Void() {
this.n += 1;
    return;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 3541;
      if (F[var3] == null) {
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
         long var5 = E[var3];
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
         Object[] var9 = (Object[])G.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               G.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/hJ", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         F[var3] = var15;
      }

      return F[var3];
}


public void a(java.lang.String p0) {
if ((__sourceIntrinsic_booleanComparison(((com.google.common.base.Predicate)(this.z)).apply(((java.lang.Object)(p0)))) != 0)) {
        if ((((java.lang.String)(p0)).length() > this.m)) {
        this.l = ((java.lang.String)(((java.lang.String)(p0)).substring(((int)(0)), ((int)(this.m)))));
    } else {
        this.l = ((java.lang.String)(p0));
    }
        ((moom.hJ)(this)).c__Void();
    }
    return;
}


public java.lang.String a__String() {
return this.l;
}


public void a(moom.hX p0) {
this.y = ((moom.hX)(p0));
    return;
}


public boolean a__Boolean() {
return ((((this.o) ? 1 : 0)) != 0);
}


public int a(int p0) {
return ((moom.hJ)(this)).a(((int)(p0)), ((int)(((moom.hJ)(this)).c())));
}


public int a(int p0, int p1) {
return ((moom.hJ)(this)).a(((int)(p0)), ((int)(p1)), ((boolean)(true)));
}


public int a(int p0, int p1, boolean p2) {
int forestValue858_11_0;
    long life4_3;
    int life6_5;
    int life7_11;
    int life8_14;
    int life9_16;
    int life10_26;
    forest_join_96: {
    forest_join_11: {
    forest_join_10: {
    life4_3 = (moom.hJ.D ^ 124924662682663L);
    life6_5 = p1;
    if (!((p0 < 0))) {
        break forest_join_10;
    }
    forestValue858_11_0 = 1;
    break forest_join_11;
    }
    forestValue858_11_0 = 0;
    }
    life7_11 = forestValue858_11_0;
    life8_14 = java.lang.Math.abs(((int)(p0)));
    life9_16 = 0;
    forest_cycle_17: while (true) {
    forest_join_94: {
    forest_join_78: {
    forest_join_60: {
    forest_join_59: {
    forest_join_42: {
    if (!((life9_16 < life8_14))) {
        break forest_join_96;
    }
    if (!((life7_11 == 0))) {
        break forest_join_60;
    }
    life10_26 = ((java.lang.String)(this.l)).length();
    life6_5 = ((java.lang.String)(this.l)).indexOf(((int)(__sourceIntrinsic_f7c5abbf18cd_invokedynamic858_5(24001, (6878537690529198537L ^ life4_3)))), ((int)(life6_5)));
    if (!((life6_5 == -1))) {
        break forest_join_42;
    }
    life6_5 = life10_26;
    break forest_join_59;
    }
    forest_cycle_42: while (true) {
    if (!(p2)) {
        break forest_join_59;
    }
    if (!((life6_5 < life10_26))) {
        break forest_join_59;
    }
    if (!((((java.lang.String)(this.l)).charAt(((int)(life6_5))) == __sourceIntrinsic_f7c5abbf18cd_invokedynamic858_9(24001, (6878537690529198537L ^ life4_3))))) {
        break forest_join_59;
    }
    life6_5 += 1;
    continue forest_cycle_42;
    }
    }
    break forest_join_94;
    }
    forest_cycle_60: while (true) {
    if (!(p2)) {
        break forest_join_78;
    }
    if (!((life6_5 > 0))) {
        break forest_join_78;
    }
    if (!((((java.lang.String)(this.l)).charAt(((int)((life6_5 - 1)))) == __sourceIntrinsic_f7c5abbf18cd_invokedynamic858_12(24001, (6878537690529198537L ^ life4_3))))) {
        break forest_join_78;
    }
    life6_5 += -1;
    continue forest_cycle_60;
    }
    }
    forest_cycle_78: while (true) {
    if (!((life6_5 > 0))) {
        break forest_join_94;
    }
    if (!((((java.lang.String)(this.l)).charAt(((int)((life6_5 - 1)))) != __sourceIntrinsic_f7c5abbf18cd_invokedynamic858_15(24001, (6878537690529198537L ^ life4_3))))) {
        break forest_join_94;
    }
    life6_5 += -1;
    continue forest_cycle_78;
    }
    }
    life9_16 += 1;
    continue forest_cycle_17;
    }
    }
    return life6_5;
}


public void a(int p0, int p1, int p2) {
int forwardValue3602_25_0;
    int life4_36;
    int life5_63;
    java.lang.String life6_81;
    forward_join_70: {
    forward_join_48: {
    forward_join_32: {
    forward_join_25: {
    forward_join_24: {
    if (!((p0 >= this.h))) {
        break forward_join_24;
    }
    if (!((p0 < (this.h + this.j)))) {
        break forward_join_24;
    }
    if (!((p1 >= this.i))) {
        break forward_join_24;
    }
    if (!((p1 < (this.i + this.k)))) {
        break forward_join_24;
    }
    forwardValue3602_25_0 = 1;
    break forward_join_25;
    }
    forwardValue3602_25_0 = 0;
    }
    life4_36 = forwardValue3602_25_0;
    if (!(this.p)) {
        break forward_join_32;
    }
    ((moom.hJ)(this)).b(((boolean)__sourceIntrinsic_integerToBoolean((life4_36))));
    }
    if (!(this.q)) {
        break forward_join_70;
    }
    if (!((life4_36 != 0))) {
        break forward_join_70;
    }
    if (!((p2 == 0))) {
        break forward_join_70;
    }
    life5_63 = (p0 - this.h);
    if (!(this.o)) {
        break forward_join_48;
    }
    life5_63 += -4;
    }
    life6_81 = ((net.minecraft.client.gui.FontRenderer)(this.g)).a__String(((java.lang.String)(((java.lang.String)(this.l)).substring(((int)(this.s))))), ((int)(((moom.hJ)(this)).e())));
    ((moom.hJ)(this)).d(((int)((((java.lang.String)(((net.minecraft.client.gui.FontRenderer)(this.g)).a__String(((java.lang.String)(life6_81)), ((int)(life5_63))))).length() + this.s))));
    }
    return;
}


public boolean a(char p0, int p1) {
forward_join_182: {
    forward_join_180: {
    forward_join_170: {
    forward_join_168: {
    forward_join_162: {
    forward_join_153: {
    forward_join_151: {
    forward_join_149: {
    forward_join_141: {
    forward_join_139: {
    forward_join_136: {
    forward_join_128: {
    forward_join_121: {
    forward_join_109: {
    forward_join_107: {
    forward_join_104: {
    forward_join_96: {
    forward_join_89: {
    forward_join_77: {
    forward_join_75: {
    forward_join_73: {
    forward_join_67: {
    forward_join_65: {
    forward_join_59: {
    forward_join_50: {
    forward_join_48: {
    forward_join_46: {
    forward_join_34: {
    forward_join_32: {
    forward_join_23: {
    forward_join_15: {
    forward_join_5: {
    if (!((!this.q))) {
        break forward_join_5;
    }
    return ((0) != 0);
    }
    if (!(net.minecraft.client.gui.GuiScreen.d(((int)(p1))))) {
        break forward_join_15;
    }
    ((moom.hJ)(this)).c__Void();
    ((moom.hJ)(this)).h(((int)(0)));
    return ((1) != 0);
    }
    if (!(net.minecraft.client.gui.GuiScreen.c__Boolean(((int)(p1))))) {
        break forward_join_23;
    }
    net.minecraft.client.gui.GuiScreen.e(((java.lang.String)(((moom.hJ)(this)).c__String())));
    return ((1) != 0);
    }
    if (!(net.minecraft.client.gui.GuiScreen.b__Boolean(((int)(p1))))) {
        break forward_join_34;
    }
    if (!(this.r)) {
        break forward_join_32;
    }
    ((moom.hJ)(this)).b(((java.lang.String)(net.minecraft.client.gui.GuiScreen.a__StringStatic())));
    }
    return ((1) != 0);
    }
    if (!(net.minecraft.client.gui.GuiScreen.a(((int)(p1))))) {
        break forward_join_48;
    }
    net.minecraft.client.gui.GuiScreen.e(((java.lang.String)(((moom.hJ)(this)).c__String())));
    if (!(this.r)) {
        break forward_join_46;
    }
    ((moom.hJ)(this)).b(((java.lang.String)("")));
    }
    return ((1) != 0);
    }
    switch (p1) {
case 14:
{
        break forward_join_50;
    }
case 199:
{
        break forward_join_67;
    }
case 203:
{
        break forward_join_77;
    }
case 205:
{
        break forward_join_109;
    }
case 207:
{
        break forward_join_141;
    }
case 211:
{
        break forward_join_153;
    }
default:
{
        break forward_join_170;
    }
}
    }
    if (!(net.minecraft.client.gui.GuiScreen.b__BooleanStatic())) {
        break forward_join_59;
    }
    if (!(this.r)) {
        break forward_join_65;
    }
    ((moom.hJ)(this)).a__Void(((int)(-1)));
    break forward_join_65;
    }
    if (!(this.r)) {
        break forward_join_65;
    }
    ((moom.hJ)(this)).b(((int)(-1)));
    }
    return ((1) != 0);
    }
    if (!(net.minecraft.client.gui.GuiScreen.c__Boolean())) {
        break forward_join_73;
    }
    ((moom.hJ)(this)).h(((int)(0)));
    break forward_join_75;
    }
    ((moom.hJ)(this)).b__Void();
    }
    return ((1) != 0);
    }
    if (!(net.minecraft.client.gui.GuiScreen.c__Boolean())) {
        break forward_join_96;
    }
    if (!(net.minecraft.client.gui.GuiScreen.b__BooleanStatic())) {
        break forward_join_89;
    }
    ((moom.hJ)(this)).h(((int)(((moom.hJ)(this)).a(((int)(-1)), ((int)(((moom.hJ)(this)).d()))))));
    break forward_join_107;
    }
    ((moom.hJ)(this)).h(((int)((((moom.hJ)(this)).d() - 1))));
    break forward_join_107;
    }
    if (!(net.minecraft.client.gui.GuiScreen.b__BooleanStatic())) {
        break forward_join_104;
    }
    ((moom.hJ)(this)).d(((int)(((moom.hJ)(this)).a(((int)(-1))))));
    break forward_join_107;
    }
    ((moom.hJ)(this)).c(((int)(-1)));
    }
    return ((1) != 0);
    }
    if (!(net.minecraft.client.gui.GuiScreen.c__Boolean())) {
        break forward_join_128;
    }
    if (!(net.minecraft.client.gui.GuiScreen.b__BooleanStatic())) {
        break forward_join_121;
    }
    ((moom.hJ)(this)).h(((int)(((moom.hJ)(this)).a(((int)(1)), ((int)(((moom.hJ)(this)).d()))))));
    break forward_join_139;
    }
    ((moom.hJ)(this)).h(((int)((((moom.hJ)(this)).d() + 1))));
    break forward_join_139;
    }
    if (!(net.minecraft.client.gui.GuiScreen.b__BooleanStatic())) {
        break forward_join_136;
    }
    ((moom.hJ)(this)).d(((int)(((moom.hJ)(this)).a(((int)(1))))));
    break forward_join_139;
    }
    ((moom.hJ)(this)).c(((int)(1)));
    }
    return ((1) != 0);
    }
    if (!(net.minecraft.client.gui.GuiScreen.c__Boolean())) {
        break forward_join_149;
    }
    ((moom.hJ)(this)).h(((int)(((java.lang.String)(this.l)).length())));
    break forward_join_151;
    }
    ((moom.hJ)(this)).c__Void();
    }
    return ((1) != 0);
    }
    if (!(net.minecraft.client.gui.GuiScreen.b__BooleanStatic())) {
        break forward_join_162;
    }
    if (!(this.r)) {
        break forward_join_168;
    }
    ((moom.hJ)(this)).a__Void(((int)(1)));
    break forward_join_168;
    }
    if (!(this.r)) {
        break forward_join_168;
    }
    ((moom.hJ)(this)).b(((int)(1)));
    }
    return ((1) != 0);
    }
    if (!(moom.CH.a(((char)(p0))))) {
        break forward_join_182;
    }
    if (!(this.r)) {
        break forward_join_180;
    }
    ((moom.hJ)(this)).b(((java.lang.String)(java.lang.Character.toString(((char)(p0))))));
    }
    return ((1) != 0);
    }
    return ((0) != 0);
}


public void a(com.google.common.base.Predicate<java.lang.String> p0) {
this.z = ((com.google.common.base.Predicate)(p0));
    return;
}


public void a__Void(int p0) {
if ((((java.lang.String)(this.l)).length() != 0)) {
        if ((this.u != this.t)) {
        ((moom.hJ)(this)).b(((java.lang.String)("")));
    } else {
        ((moom.hJ)(this)).b(((int)((((moom.hJ)(this)).a(((int)(p0))) - this.t))));
    }
    }
    return;
}


public int a() {
return this.f;
}


public void a(boolean p0) {
this.o = ((boolean)(p0));
    return;
}


public void g(int p0) {
this.w = ((int)(p0));
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_8a9489f172ff95cb_originalDynamicSite2823_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8a9489f172ff95cb_originalDynamicSite2823_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8a9489f172ff95cb_originalDynamicSite2823_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f7c5abbf18cd_invokedynamic858_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f7c5abbf18cd_invokedynamic858_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f7c5abbf18cd_invokedynamic858_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f7c5abbf18cd_invokedynamic858_15(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral7886_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_8dbec06774c4_invokedynamic6546_15(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_d1c1922d1ba0_invokedynamic6609_14(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_d1c1922d1ba0_invokedynamic6609_17(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_d1c1922d1ba0_invokedynamic6609_18(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_d1c1922d1ba0_invokedynamic6609_26(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8f97abcbcfce_invokedynamic6547_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8f97abcbcfce_invokedynamic6547_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a91ecd6db48f_invokedynamic900186_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a91ecd6db48f_invokedynamic900186_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a91ecd6db48f_invokedynamic900186_35(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a91ecd6db48f_invokedynamic900186_42(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a91ecd6db48f_invokedynamic900186_64(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c4b63a62bb23_invokedynamic7882_3(int a0, long a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
