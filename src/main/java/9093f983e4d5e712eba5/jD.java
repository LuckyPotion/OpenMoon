package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class jD {

public float a;

public float b;

private int c;

private int d;

public float e;

public float f;

public float g;

public float h;

public float i;

public float j;

private boolean k;

private int l;

public boolean m;

public boolean n;

public boolean o;

public java.util.List<moom.jC> p;

public java.util.List<moom.jD> q;

public final java.lang.String r;

private final moom.iQ s;

public float t;

public float u;

public float v;

public java.util.List w;

public boolean x;

public float y;

public float z;

public float A;

private int B;

private moom.DD C;

private java.lang.String D;

private moom.Ld E;

private final net.minecraft.client.renderer.RenderGlobal F;

private com.moon.module.impl.Camera G;

private static java.lang.String[] H;

private static final long I;

private static final long[] J;

private static final java.lang.Integer[] K;

private static final java.util.Map L;

public jD(moom.iQ p0, int p1, int p2) {
this(p0);
    this.a(((int)(p1)), ((int)(p2)));
    return;
}


public jD(moom.iQ p0) {
this(p0, null);
}


public jD(moom.iQ p0, java.lang.String p1) {
super();
    this.w = new java.util.ArrayList();
    this.x = false;
    this.y = 0x1.0000000000000p+0f;
    this.z = 0x1.0000000000000p+0f;
    this.A = 0x1.0000000000000p+0f;
    this.C = null;
    this.D = null;
    this.F = moom.BU.a__lq();
    this.a = 0x1.0000000000000p+6f;
    this.b = 0x1.0000000000000p+5f;
    this.n = true;
    this.p = com.google.common.collect.Lists.newArrayList();
    this.s = p0;
    (p0.d).add(this);
    this.r = p1;
    (this).b(p0.f, p0.g);
}


static {
I = ((long)(((moom._a)(moom._c.a(((long)(-3818285957230795623L)), ((long)(-1873750005633962827L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(46337548055401L)))));
    java.lang.Object __sourceSpill889_6 = null;
    L = ((java.util.Map)(new java.util.HashMap(13)));
    moom.jD.b(((java.lang.String[])(__sourceSpill889_6)));
    long local0_life9 = (moom.jD.I ^ 120843865104079L);
    javax.crypto.Cipher local2_life11;
    javax.crypto.Cipher __sourceSpill889_13 = (local2_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill889_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill889_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill889_16 = new byte[8];
    (__sourceSpill889_16)[0] = ((byte) ((int) (local0_life9 >>> 56)));
    int local3_life17 = 1;
    while ((local3_life17 < 8)) {
        (__sourceSpill889_16)[local3_life17] = ((byte) ((int) ((local0_life9 << (local3_life17 * 8)) >>> 56)));
        local3_life17 += 1;
    }
    byte[] __sourcePreallocation889_18 = __sourceSpill889_16;
    ((javax.crypto.Cipher)(__sourceSpill889_13)).init(((int)(__sourceSpill889_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill889_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation889_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life21 = new long[2];
    int local5_life22 = 0;
    java.lang.String local6_life23;
    int local7_life25 = ((java.lang.String)((local6_life23 = "²\0250¶¼ã\026kxji\037\016GI"))).length();
    int local4_life26 = 0;
    do {
        java.lang.String __sourceSpill889_27 = local6_life23;
        int __sourceSpill889_28 = local4_life26;
        local4_life26 += 8;
        byte[] local9_life31 = ((java.lang.String)(((java.lang.String)(__sourceSpill889_27)).substring(((int)(__sourceSpill889_28)), ((int)(local4_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill889_32 = local8_life21;
        int __sourceSpill889_33 = local5_life22;
        local5_life22 += 1;
        long local10_life34 = (((((((((((long) (local9_life31)[0]) & 255L) << 56) | ((((long) (local9_life31)[1]) & 255L) << 48)) | ((((long) (local9_life31)[2]) & 255L) << 40)) | ((((long) (local9_life31)[3]) & 255L) << 32)) | ((((long) (local9_life31)[4]) & 255L) << 24)) | ((((long) (local9_life31)[5]) & 255L) << 16)) | ((((long) (local9_life31)[6]) & 255L) << 8)) | (((long) (local9_life31)[7]) & 255L));
        byte[] __sourceSpill889_35 = new byte[8];
        (__sourceSpill889_35)[0] = ((byte) ((int) (local10_life34 >>> 56)));
        (__sourceSpill889_35)[1] = ((byte) ((int) (local10_life34 >>> 48)));
        (__sourceSpill889_35)[2] = ((byte) ((int) (local10_life34 >>> 40)));
        (__sourceSpill889_35)[3] = ((byte) ((int) (local10_life34 >>> 32)));
        (__sourceSpill889_35)[4] = ((byte) ((int) (local10_life34 >>> 24)));
        (__sourceSpill889_35)[5] = ((byte) ((int) (local10_life34 >>> 16)));
        (__sourceSpill889_35)[6] = ((byte) ((int) (local10_life34 >>> 8)));
        (__sourceSpill889_35)[7] = ((byte) ((int) local10_life34));
        javax.crypto.Cipher __sourceSpill889_36 = local2_life11;
        byte[] local12_life38 = ((javax.crypto.Cipher)(__sourceSpill889_36)).doFinal(((byte[])(__sourceSpill889_35)));
        (__sourceSpill889_32)[__sourceSpill889_33] = (((((((((((long) (local12_life38)[0]) & 255L) << 56) | ((((long) (local12_life38)[1]) & 255L) << 48)) | ((((long) (local12_life38)[2]) & 255L) << 40)) | ((((long) (local12_life38)[3]) & 255L) << 32)) | ((((long) (local12_life38)[4]) & 255L) << 24)) | ((((long) (local12_life38)[5]) & 255L) << 16)) | ((((long) (local12_life38)[6]) & 255L) << 8)) | (((long) (local12_life38)[7]) & 255L));
    } while ((!(local4_life26 >= local7_life25)));
    J = ((long[])(local8_life21));
    K = ((java.lang.Integer[])(new java.lang.Integer[2]));
}


public java.lang.String toString() {
java.lang.String forwardValue3658_15_0;
    java.util.List forwardValue3658_15_1;
    java.lang.String forwardValue3658_18_0;
    java.lang.String forwardValue3658_19_0;
    java.lang.Integer forwardValue3658_19_1;
    java.lang.String forwardValue3658_26_0;
    java.lang.Integer forwardValue3658_26_1;
    java.util.List forwardValue3658_26_2;
    java.lang.String forwardValue3658_29_0;
    java.lang.Integer forwardValue3658_29_1;
    java.lang.String forwardValue3658_30_0;
    java.lang.Integer forwardValue3658_30_1;
    java.lang.Integer forwardValue3658_30_2;
    java.lang.String spill3658_0;
    java.util.List spill3658_1;
    java.util.List spill3658_2;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_30: {
    forward_join_29: {
    forward_join_26: {
    forward_join_19: {
    forward_join_18: {
    forward_join_15: {
    life1_3 = (moom.jD.I ^ 117342502391604L);
    life3_5 = moom.iQ.b();
    spill3658_0 = this.D;
    spill3658_1 = this.p;
    if (!((life3_5 != null))) {
        forwardValue3658_15_0 = spill3658_0;
        forwardValue3658_15_1 = spill3658_1;
        break forward_join_15;
    }
    if (!((spill3658_1 != null))) {
        forwardValue3658_18_0 = spill3658_0;
        break forward_join_18;
    }
    forwardValue3658_15_0 = spill3658_0;
    forwardValue3658_15_1 = this.p;
    }
    forwardValue3658_19_0 = forwardValue3658_15_0;
    forwardValue3658_19_1 = java.lang.Integer.valueOf(((int)(((java.util.List)(forwardValue3658_15_1)).size())));
    break forward_join_19;
    }
    forwardValue3658_19_0 = forwardValue3658_18_0;
    forwardValue3658_19_1 = null;
    }
    spill3658_2 = this.q;
    if (!((life3_5 != null))) {
        forwardValue3658_26_0 = forwardValue3658_19_0;
        forwardValue3658_26_1 = forwardValue3658_19_1;
        forwardValue3658_26_2 = spill3658_2;
        break forward_join_26;
    }
    if (!((spill3658_2 != null))) {
        forwardValue3658_29_0 = forwardValue3658_19_0;
        forwardValue3658_29_1 = forwardValue3658_19_1;
        break forward_join_29;
    }
    forwardValue3658_26_0 = forwardValue3658_19_0;
    forwardValue3658_26_1 = forwardValue3658_19_1;
    forwardValue3658_26_2 = this.q;
    }
    forwardValue3658_30_0 = forwardValue3658_26_0;
    forwardValue3658_30_1 = forwardValue3658_26_1;
    forwardValue3658_30_2 = java.lang.Integer.valueOf(((int)(((java.util.List)(forwardValue3658_26_2)).size())));
    break forward_join_30;
    }
    forwardValue3658_30_0 = forwardValue3658_29_0;
    forwardValue3658_30_1 = forwardValue3658_29_1;
    forwardValue3658_30_2 = null;
    }
    return __sourceIntrinsic_a86c261fcdee_invokedynamic3658_11(forwardValue3658_30_0, forwardValue3658_30_1, forwardValue3658_30_2);
}


public void b(float p0) {
int lexicalValue1210_13_0;
    int lexicalValue1210_20_0;
    int lexicalValue1210_27_0;
    int lexicalValue1210_47_0;
    moom.jD lexicalValue1210_53_0;
    moom.jD lexicalValue1210_61_0;
    int lexicalValue1210_82_0;
    int lexicalValue1210_84_0;
    int lexicalValue1210_118_0;
    int lexicalValue1210_133_0;
    int lexicalValue1210_145_0;
    int lexicalValue1210_157_0;
    int lexicalValue1210_187_0;
    boolean spill1210_0;
    moom.jD spill1210_1;
    moom.jD spill1210_2;
    boolean spill1210_3;
    int spill1210_4;
    int spill1210_5;
    int spill1210_6;
    int spill1210_7;
    int spill1210_8;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    int life5_45;
    int life6_138;
    java.util.Iterator life7_247;
    moom.jD life8_254;
    lexical_join_188: {
    lexical_join_187: {
    lexical_join_182: {
    lexical_join_181: {
    lexical_join_157: {
    lexical_join_155: {
    lexical_join_145: {
    lexical_join_144: {
    lexical_join_133: {
    lexical_join_129: {
    lexical_join_118: {
    lexical_join_114: {
    lexical_join_84: {
    lexical_join_83: {
    lexical_join_82: {
    lexical_join_81: {
    lexical_join_61: {
    lexical_join_60: {
    lexical_join_53: {
    lexical_join_52: {
    lexical_join_47: {
    lexical_join_46: {
    lexical_join_27: {
    lexical_join_26: {
    lexical_join_20: {
    lexical_join_13: {
    life2_3 = (moom.jD.I ^ 115260406640455L);
    life4_5 = moom.iQ.b();
    spill1210_0 = this.o;
    if (!((life4_5 != null))) {
        lexicalValue1210_13_0 = ((spill1210_0) ? 1 : 0);
        break lexical_join_13;
    }
    if (!((!spill1210_0))) {
        break lexical_join_188;
    }
    lexicalValue1210_13_0 = ((this.n) ? 1 : 0);
    }
    if (!((life4_5 != null))) {
        lexicalValue1210_20_0 = lexicalValue1210_13_0;
        break lexical_join_20;
    }
    if (!((lexicalValue1210_13_0 != 0))) {
        break lexical_join_188;
    }
    ((moom.jD)(this)).a__Void();
    lexicalValue1210_20_0 = ((this.k) ? 1 : 0);
    }
    if (!((life4_5 != null))) {
        lexicalValue1210_27_0 = lexicalValue1210_20_0;
        break lexical_join_27;
    }
    if (!((lexicalValue1210_20_0 == 0))) {
        break lexical_join_26;
    }
    this.d(((float)(p0)));
    }
    lexicalValue1210_27_0 = 0;
    }
    life5_45 = lexicalValue1210_27_0;
    spill1210_1 = this;
    if (!((life4_5 != null))) {
        lexicalValue1210_53_0 = spill1210_1;
        break lexical_join_53;
    }
    if (!((((moom.jD)(spill1210_1)).C != null))) {
        break lexical_join_52;
    }
    spill1210_2 = this;
    if (!((life4_5 != null))) {
        lexicalValue1210_53_0 = spill1210_2;
        break lexical_join_53;
    }
    if (!((!((net.minecraft.client.renderer.RenderGlobal)(((moom.jD)(spill1210_2)).F)).G))) {
        break lexical_join_52;
    }
    spill1210_3 = ((net.minecraft.client.renderer.RenderGlobal)(this.F)).H;
    if (!((life4_5 != null))) {
        lexicalValue1210_47_0 = ((spill1210_3) ? 1 : 0);
        break lexical_join_47;
    }
    if (!(spill1210_3)) {
        break lexical_join_46;
    }
    return;
    }
    lexicalValue1210_47_0 = moom.kZ.d();
    }
    life5_45 = lexicalValue1210_47_0;
    ((net.minecraft.client.renderer.texture.TextureManager)(moom.BU.a__ok())).a__Void(((moom.DD)(this.C)));
    }
    lexicalValue1210_53_0 = this;
    }
    if (!((life4_5 != null))) {
        lexicalValue1210_61_0 = lexicalValue1210_53_0;
        break lexical_join_61;
    }
    if (!((((moom.jD)(lexicalValue1210_53_0)).E != null))) {
        break lexical_join_60;
    }
    ((moom.Ld)(this.E)).a();
    }
    lexicalValue1210_61_0 = this;
    }
    spill1210_4 = recovery.source.CarrierOps.fcmpl(((float)(((moom.jD)(lexicalValue1210_61_0)).y)), ((float)(0x1.0p0f)));
    if (!((life4_5 != null))) {
        lexicalValue1210_82_0 = spill1210_4;
        break lexical_join_82;
    }
    if (!((spill1210_4 == 0))) {
        break lexical_join_81;
    }
    spill1210_5 = recovery.source.CarrierOps.fcmpl(((float)(this.z)), ((float)(0x1.0p0f)));
    if (!((life4_5 != null))) {
        lexicalValue1210_82_0 = spill1210_5;
        break lexical_join_82;
    }
    if (!((spill1210_5 == 0))) {
        break lexical_join_81;
    }
    spill1210_6 = recovery.source.CarrierOps.fcmpl(((float)(this.A)), ((float)(0x1.0p0f)));
    if (!((life4_5 != null))) {
        lexicalValue1210_82_0 = spill1210_6;
        break lexical_join_82;
    }
    if (!((spill1210_6 != 0))) {
        break lexical_join_83;
    }
    }
    lexicalValue1210_82_0 = 1;
    }
    lexicalValue1210_84_0 = lexicalValue1210_82_0;
    break lexical_join_84;
    }
    lexicalValue1210_84_0 = 0;
    }
    life6_138 = lexicalValue1210_84_0;
    moom.kZ.B();
    moom.kZ.b(((float)((this.e * p0))), ((float)((this.f * p0))), ((float)((this.g * p0))));
    spill1210_7 = recovery.source.CarrierOps.fcmpl(((float)(this.i)), ((float)(0x0.0p0f)));
    if (!((life4_5 != null))) {
        lexicalValue1210_118_0 = spill1210_7;
        break lexical_join_118;
    }
    if (!((spill1210_7 != 0))) {
        break lexical_join_114;
    }
    moom.kZ.b(((float)((this.i * 0x1.ca5dcp5f))), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)));
    }
    lexicalValue1210_118_0 = recovery.source.CarrierOps.fcmpl(((float)(this.h)), ((float)(0x0.0p0f)));
    }
    if (!((life4_5 != null))) {
        lexicalValue1210_133_0 = lexicalValue1210_118_0;
        break lexical_join_133;
    }
    if (!((lexicalValue1210_118_0 != 0))) {
        break lexical_join_129;
    }
    moom.kZ.b(((float)((this.h * 0x1.ca5dcp5f))), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)));
    }
    lexicalValue1210_133_0 = recovery.source.CarrierOps.fcmpl(((float)(this.j)), ((float)(0x0.0p0f)));
    }
    if (!((life4_5 != null))) {
        lexicalValue1210_145_0 = lexicalValue1210_133_0;
        break lexical_join_145;
    }
    if (!((lexicalValue1210_133_0 != 0))) {
        break lexical_join_144;
    }
    moom.kZ.b(((float)((this.j * 0x1.ca5dcp5f))), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)));
    }
    lexicalValue1210_145_0 = life6_138;
    }
    if (!((life4_5 != null))) {
        lexicalValue1210_157_0 = lexicalValue1210_145_0;
        break lexical_join_157;
    }
    if (!((lexicalValue1210_145_0 != 0))) {
        break lexical_join_155;
    }
    moom.kZ.a(((float)(this.y)), ((float)(this.z)), ((float)(this.A)));
    }
    lexicalValue1210_157_0 = this.l;
    }
    moom.kZ.p(((int)(lexicalValue1210_157_0)));
    if (!((life4_5 != null))) {
        break lexical_join_182;
    }
    if (!((this.q != null))) {
        break lexical_join_181;
    }
    life7_247 = ((java.util.List)(this.q)).iterator();
    lexical_cycle_167: while (true) {
    if (!(((java.util.Iterator)(life7_247)).hasNext())) {
        break lexical_join_181;
    }
    life8_254 = ((moom.jD)(((java.util.Iterator)(life7_247)).next()));
    ((moom.jD)(life8_254)).a(((float)(p0)));
    if (!((life4_5 != null))) {
        break lexical_join_182;
    }
    if (!((life4_5 == null))) { continue lexical_cycle_167; }
    break lexical_cycle_167;
    }
    }
    moom.kZ.C();
    }
    spill1210_8 = life5_45;
    if (!((life4_5 != null))) {
        lexicalValue1210_187_0 = spill1210_8;
        break lexical_join_187;
    }
    if (!((spill1210_8 != 0))) {
        break lexical_join_188;
    }
    lexicalValue1210_187_0 = life5_45;
    }
    moom.kZ.i(((int)(lexicalValue1210_187_0)));
    }
    return;
}


public static void b(java.lang.String[] p0) {
moom.jD.H = ((java.lang.String[])(p0));
    return;
}


public moom.jD b(int p0, int p1) {
this.a = ((float)(((float) p0)));
    this.b = ((float)(((float) p1)));
    return this;
}


public void b(float p0, float p1, float p2, int p3, int p4, int p5, float p6) {
((java.util.List)(this.w)).add(((java.lang.Object)(new moom.L0(this, this.c, this.d, p0, p1, p2, p3, p4, p5, p6))));
    return;
}


public moom.jD b(java.lang.String p0) {
moom.jD lexicalValue1211_21_0;
    java.util.List lexicalValue1211_27_0;
    moom.jD lexicalValue1211_45_0;
    moom.jD spill1211_0;
    java.util.List spill1211_1;
    moom.jD spill1211_2;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    moom.jD life5_15;
    java.util.Iterator life6_41;
    moom.jD life7_48;
    moom.jD life8_52;
    lexical_join_48: {
    lexical_join_27: {
    lexical_join_21: {
    lexical_join_20: {
    lexical_join_10: {
    life2_3 = (moom.jD.I ^ 87109099032019L);
    life4_5 = moom.iQ.b();
    if (!((p0 == null))) {
        break lexical_join_10;
    }
    return null;
    }
    life5_15 = this.a(((java.lang.String)(p0)));
    spill1211_0 = life5_15;
    if (!((life4_5 != null))) {
        lexicalValue1211_21_0 = spill1211_0;
        break lexical_join_21;
    }
    if (!((spill1211_0 != null))) {
        break lexical_join_20;
    }
    return life5_15;
    }
    lexicalValue1211_21_0 = this;
    }
    spill1211_1 = ((moom.jD)(lexicalValue1211_21_0)).q;
    if (!((life4_5 != null))) {
        lexicalValue1211_27_0 = spill1211_1;
        break lexical_join_27;
    }
    if (!((spill1211_1 != null))) {
        break lexical_join_48;
    }
    lexicalValue1211_27_0 = this.q;
    }
    life6_41 = ((java.util.List)(lexicalValue1211_27_0)).iterator();
    lexical_cycle_29: while (true) {
    lexical_join_46: {
    lexical_join_45: {
    if (!(((java.util.Iterator)(life6_41)).hasNext())) {
        break lexical_join_48;
    }
    life7_48 = ((moom.jD)(((java.util.Iterator)(life6_41)).next()));
    life8_52 = ((moom.jD)(life7_48)).b(((java.lang.String)(p0)));
    spill1211_2 = life8_52;
    if (!((life4_5 != null))) {
        lexicalValue1211_45_0 = spill1211_2;
        break lexical_join_45;
    }
    if (!((spill1211_2 != null))) {
        break lexical_join_46;
    }
    lexicalValue1211_45_0 = life8_52;
    }
    return lexicalValue1211_45_0;
    }
    if (!((life4_5 == null))) { continue lexical_cycle_29; }
    break lexical_cycle_29;
    }
    }
    return null;
}


public static java.lang.String[] b() {
return moom.jD.H;
}


public void c(float p0) {
int forwardValue3656_13_0;
    int forwardValue3656_20_0;
    int forwardValue3656_30_0;
    float forwardValue3656_76_0;
    float forwardValue3656_76_1;
    int forwardValue3656_100_0;
    int forwardValue3656_115_0;
    int forwardValue3656_132_0;
    float forwardValue3656_138_0;
    float forwardValue3656_138_1;
    boolean spill3656_0;
    int spill3656_1;
    int spill3656_2;
    float spill3656_3;
    float spill3656_4;
    float spill3656_5;
    float spill3656_6;
    float spill3656_7;
    float spill3656_8;
    float spill3656_9;
    float spill3656_10;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_141: {
    forward_join_138: {
    forward_join_132: {
    forward_join_126: {
    forward_join_115: {
    forward_join_111: {
    forward_join_100: {
    forward_join_83: {
    forward_join_76: {
    forward_join_68: {
    forward_join_30: {
    forward_join_26: {
    forward_join_20: {
    forward_join_13: {
    life2_3 = (moom.jD.I ^ 24528432074218L);
    life4_5 = moom.iQ.b();
    spill3656_0 = this.o;
    if (!((life4_5 != null))) {
        forwardValue3656_13_0 = ((spill3656_0) ? 1 : 0);
        break forward_join_13;
    }
    if (!((!spill3656_0))) {
        break forward_join_141;
    }
    forwardValue3656_13_0 = ((this.n) ? 1 : 0);
    }
    if (!((life4_5 != null))) {
        forwardValue3656_20_0 = forwardValue3656_13_0;
        break forward_join_20;
    }
    if (!((forwardValue3656_13_0 != 0))) {
        break forward_join_141;
    }
    ((moom.jD)(this)).a__Void();
    forwardValue3656_20_0 = ((this.k) ? 1 : 0);
    }
    if (!((life4_5 != null))) {
        forwardValue3656_30_0 = forwardValue3656_20_0;
        break forward_join_30;
    }
    if (!((forwardValue3656_20_0 == 0))) {
        break forward_join_26;
    }
    this.d(((float)(p0)));
    }
    forwardValue3656_30_0 = recovery.source.CarrierOps.fcmpl(((float)(this.h)), ((float)(0x0.0p0f)));
    }
    if (!((life4_5 != null))) {
        forwardValue3656_100_0 = forwardValue3656_30_0;
        break forward_join_100;
    }
    if (!((forwardValue3656_30_0 == 0))) {
        break forward_join_83;
    }
    spill3656_1 = recovery.source.CarrierOps.fcmpl(((float)(this.i)), ((float)(0x0.0p0f)));
    if (!((life4_5 != null))) {
        forwardValue3656_100_0 = spill3656_1;
        break forward_join_100;
    }
    if (!((spill3656_1 == 0))) {
        break forward_join_83;
    }
    spill3656_2 = recovery.source.CarrierOps.fcmpl(((float)(this.j)), ((float)(0x0.0p0f)));
    if (!((life4_5 != null))) {
        forwardValue3656_100_0 = spill3656_2;
        break forward_join_100;
    }
    if (!((spill3656_2 == 0))) {
        break forward_join_83;
    }
    spill3656_3 = this.e;
    spill3656_4 = 0x0.0p0f;
    if (!((life4_5 != null))) {
        forwardValue3656_76_0 = spill3656_3;
        forwardValue3656_76_1 = spill3656_4;
        break forward_join_76;
    }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(spill3656_3)), ((float)(spill3656_4))) == 0))) {
        break forward_join_68;
    }
    spill3656_5 = this.f;
    spill3656_6 = 0x0.0p0f;
    if (!((life4_5 != null))) {
        forwardValue3656_76_0 = spill3656_5;
        forwardValue3656_76_1 = spill3656_6;
        break forward_join_76;
    }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(spill3656_5)), ((float)(spill3656_6))) == 0))) {
        break forward_join_68;
    }
    spill3656_7 = this.g;
    spill3656_8 = 0x0.0p0f;
    if (!((life4_5 != null))) {
        forwardValue3656_76_0 = spill3656_7;
        forwardValue3656_76_1 = spill3656_8;
        break forward_join_76;
    }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(spill3656_7)), ((float)(spill3656_8))) != 0))) {
        break forward_join_141;
    }
    }
    forwardValue3656_76_0 = (this.e * p0);
    forwardValue3656_76_1 = (this.f * p0);
    }
    moom.kZ.b(((float)(forwardValue3656_76_0)), ((float)(forwardValue3656_76_1)), ((float)((this.g * p0))));
    if (!((life4_5 == null))) {
        break forward_join_141;
    }
    }
    moom.kZ.b(((float)((this.e * p0))), ((float)((this.f * p0))), ((float)((this.g * p0))));
    forwardValue3656_100_0 = recovery.source.CarrierOps.fcmpl(((float)(this.j)), ((float)(0x0.0p0f)));
    }
    if (!((life4_5 != null))) {
        forwardValue3656_115_0 = forwardValue3656_100_0;
        break forward_join_115;
    }
    if (!((forwardValue3656_100_0 != 0))) {
        break forward_join_111;
    }
    moom.kZ.b(((float)((this.j * 0x1.ca5dcp5f))), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)));
    }
    forwardValue3656_115_0 = recovery.source.CarrierOps.fcmpl(((float)(this.i)), ((float)(0x0.0p0f)));
    }
    if (!((life4_5 != null))) {
        forwardValue3656_132_0 = forwardValue3656_115_0;
        break forward_join_132;
    }
    if (!((forwardValue3656_115_0 != 0))) {
        break forward_join_126;
    }
    moom.kZ.b(((float)((this.i * 0x1.ca5dcp5f))), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)));
    }
    spill3656_9 = this.h;
    spill3656_10 = 0x0.0p0f;
    if (!((life4_5 != null))) {
        forwardValue3656_138_0 = spill3656_9;
        forwardValue3656_138_1 = spill3656_10;
        break forward_join_138;
    }
    forwardValue3656_132_0 = recovery.source.CarrierOps.fcmpl(((float)(spill3656_9)), ((float)(spill3656_10)));
    }
    if (!((forwardValue3656_132_0 != 0))) {
        break forward_join_141;
    }
    forwardValue3656_138_0 = (this.h * 0x1.ca5dcp5f);
    forwardValue3656_138_1 = 0x1.0p0f;
    }
    moom.kZ.b(((float)(forwardValue3656_138_0)), ((float)(forwardValue3656_138_1)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)));
    }
    return;
}


private void d(float p0) {
moom.jD lexicalValue1212_19_0;
    int lexicalValue1212_29_0;
    moom.jD lexicalValue1212_63_0;
    moom.jD lexicalValue1212_121_0;
    moom.jD spill1212_0;
    int spill1212_1;
    moom.jD spill1212_2;
    moom.jD spill1212_3;
    moom.jD spill1212_4;
    moom.jD spill1212_5;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    moom.lw life5_49;
    java.util.Iterator life6_89;
    moom.jC life7_96;
    java.lang.Object life7_117;
    moom.L0 life8_120;
    lexical_join_123: {
    lexical_join_121: {
    lexical_join_119: {
    lexical_join_102: {
    lexical_join_85: {
    lexical_join_81: {
    lexical_join_63: {
    lexical_join_62: {
    lexical_join_29: {
    lexical_join_27: {
    lexical_join_19: {
    lexical_join_18: {
    life2_3 = (moom.jD.I ^ 106731790569160L);
    life4_5 = moom.iQ.b();
    spill1212_0 = this;
    if (!((life4_5 != null))) {
        lexicalValue1212_19_0 = spill1212_0;
        break lexical_join_19;
    }
    if (!((((moom.jD)(spill1212_0)).G == null))) {
        break lexical_join_18;
    }
    this.G = ((com.moon.module.impl.Camera)(((com.moon.module.impl.Camera)(((com.moon.fU)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__fU())).a(((java.lang.Class)(com.moon.module.impl.Camera.class)))))));
    }
    lexicalValue1212_19_0 = this;
    }
    spill1212_1 = ((moom.jD)(lexicalValue1212_19_0)).l;
    if (!((life4_5 != null))) {
        lexicalValue1212_29_0 = spill1212_1;
        break lexical_join_29;
    }
    if (!((spill1212_1 == 0))) {
        break lexical_join_27;
    }
    this.l = ((int)(net.minecraft.client.renderer.GLAllocation.a(((int)(1)))));
    }
    lexicalValue1212_29_0 = this.l;
    }
    org.lwjgl.opengl.GL11.glNewList(((int)(lexicalValue1212_29_0)), ((int)(__sourceIntrinsic_2b75f634baf5_invokedynamic1212_13(12649, (6092266760183400984L ^ life2_3)))));
    life5_49 = ((net.minecraft.client.renderer.Tessellator)(net.minecraft.client.renderer.Tessellator.a())).a__lw();
    spill1212_2 = this;
    if (!((life4_5 != null))) {
        lexicalValue1212_63_0 = spill1212_2;
        break lexical_join_63;
    }
    if (!(((com.moon.module.impl.Camera)(((moom.jD)(spill1212_2)).G)).isEnabled())) {
        break lexical_join_62;
    }
    spill1212_3 = this;
    if (!((life4_5 != null))) {
        lexicalValue1212_63_0 = spill1212_3;
        break lexical_join_63;
    }
    if (!(((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.Camera)(((moom.jD)(spill1212_3)).G)).u)).getValue())))).booleanValue())) {
        break lexical_join_62;
    }
    ((moom.lw)(((net.minecraft.client.renderer.Tessellator)(net.minecraft.client.renderer.Tessellator.a())).a__lw())).a(((int)(__sourceIntrinsic_2b75f634baf5_invokedynamic1212_26(10074, (2266457477071133738L ^ life2_3)))), ((moom.oD)(moom.oB.e)));
    }
    lexicalValue1212_63_0 = this;
    }
    life6_89 = ((java.util.List)(((moom.jD)(lexicalValue1212_63_0)).p)).iterator();
    lexical_cycle_66: while (true) {
    if (!(((java.util.Iterator)(life6_89)).hasNext())) {
        break lexical_join_81;
    }
    life7_96 = ((moom.jC)(((java.util.Iterator)(life6_89)).next()));
    ((moom.jC)(life7_96)).a(((moom.lw)(life5_49)), ((float)(p0)));
    if (!((life4_5 != null))) {
        break lexical_join_85;
    }
    if (!((life4_5 == null))) { continue lexical_cycle_66; }
    break lexical_cycle_66;
    }
    }
    life6_89 = ((java.util.List)(this.w)).iterator();
    }
    lexical_cycle_85: while (true) {
    if (!(((java.util.Iterator)(life6_89)).hasNext())) {
        break lexical_join_102;
    }
    life7_117 = ((java.util.Iterator)(life6_89)).next();
    life8_120 = ((moom.L0)(life7_117));
    ((moom.L0)(life8_120)).a(((net.minecraft.client.renderer.Tessellator)(net.minecraft.client.renderer.Tessellator.a())), ((float)(p0)));
    if (!((life4_5 != null))) {
        break lexical_join_123;
    }
    if (!((life4_5 == null))) { continue lexical_cycle_85; }
    break lexical_cycle_85;
    }
    }
    spill1212_4 = this;
    if (!((life4_5 != null))) {
        lexicalValue1212_121_0 = spill1212_4;
        break lexical_join_121;
    }
    if (!(((com.moon.module.impl.Camera)(((moom.jD)(spill1212_4)).G)).isEnabled())) {
        break lexical_join_119;
    }
    spill1212_5 = this;
    if (!((life4_5 != null))) {
        lexicalValue1212_121_0 = spill1212_5;
        break lexical_join_121;
    }
    if (!(((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.Camera)(((moom.jD)(spill1212_5)).G)).u)).getValue())))).booleanValue())) {
        break lexical_join_119;
    }
    ((net.minecraft.client.renderer.Tessellator)(net.minecraft.client.renderer.Tessellator.a())).a__Void();
    }
    org.lwjgl.opengl.GL11.glEndList();
    lexicalValue1212_121_0 = this;
    }
    ((moom.jD)(lexicalValue1212_121_0)).k = ((boolean)(true));
    }
    return;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral8102_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/jD"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public moom.jD a(java.lang.String p0) {
java.util.List lexicalValue1209_15_0;
    java.util.List spill1209_0;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    java.util.Iterator life5_25;
    moom.jD life6_32;
    lexical_join_33: {
    lexical_join_15: {
    life2_3 = (moom.jD.I ^ 115601270785443L);
    life4_5 = moom.iQ.b();
    if (!((p0 != null))) {
        break lexical_join_33;
    }
    spill1209_0 = this.q;
    if (!((life4_5 != null))) {
        lexicalValue1209_15_0 = spill1209_0;
        break lexical_join_15;
    }
    if (!((spill1209_0 != null))) {
        break lexical_join_33;
    }
    lexicalValue1209_15_0 = this.q;
    }
    life5_25 = ((java.util.List)(lexicalValue1209_15_0)).iterator();
    lexical_cycle_17: while (true) {
    lexical_join_31: {
    if (!(((java.util.Iterator)(life5_25)).hasNext())) {
        break lexical_join_33;
    }
    life6_32 = ((moom.jD)(((java.util.Iterator)(life5_25)).next()));
    if (!(((java.lang.String)(p0)).equals(((java.lang.Object)(((moom.jD)(life6_32)).a__String()))))) {
        break lexical_join_31;
    }
    return life6_32;
    }
    if (!((life4_5 == null))) { continue lexical_cycle_17; }
    break lexical_cycle_17;
    }
    }
    return null;
}


public void a(int[][] p0, float p1, float p2, float p3, float p4, float p5, float p6, float p7) {
((java.util.List)(this.p)).add(((java.lang.Object)(new moom.jC(this, p0, p1, p2, p3, p4, p5, p6, p7, this.m))));
    return;
}


public void a__Void(java.lang.String p0) {
this.D = ((java.lang.String)(p0));
    return;
}


public java.lang.String a__String() {
return this.D;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 30864;
      if (K[var3] == null) {
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
         long var5 = J[var3];
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
         Object[] var9 = (Object[])L.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               L.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/jD", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         K[var3] = var15;
      }

      return K[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.jD.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public void a(moom.Ld p0) {
this.E = ((moom.Ld)(p0));
    return;
}


public moom.jD a(float p0, float p1, float p2, int p3, int p4, int p5) {
((java.util.List)(this.p)).add(((java.lang.Object)(new moom.jC(this, this.c, this.d, p0, p1, p2, p3, p4, p5, 0x0.0p0f))));
    return this;
}


public moom.jD a(float p0, float p1, float p2, int p3, int p4, int p5, boolean p6) {
((java.util.List)(this.p)).add(((java.lang.Object)(new moom.jC(this, this.c, this.d, p0, p1, p2, p3, p4, p5, 0x0.0p0f, p6))));
    return this;
}


public void a(float p0, float p1, float p2, int p3, int p4, int p5, float p6) {
((java.util.List)(this.p)).add(((java.lang.Object)(new moom.jC(this, this.c, this.d, p0, p1, p2, p3, p4, p5, p6))));
    return;
}


public void a(float p0, float p1, float p2) {
this.e = ((float)(p0));
    this.f = ((float)(p1));
    this.g = ((float)(p2));
    return;
}


public moom.jD a(java.lang.String p0, float p1, float p2, float p3, int p4, int p5, int p6) {
p0 = __sourceIntrinsic_a5c5ed3151cb_originalDynamicSite1528_1(this.r, p0);
    moom.jF local8 = ((moom.iQ)(this.s)).a(((java.lang.String)(p0)));
    this.a(((int)(((moom.jF)(local8)).a)), ((int)(((moom.jF)(local8)).b)));
    ((java.util.List)(this.p)).add(((java.lang.Object)(((moom.jC)(new moom.jC(this, this.c, this.d, p1, p2, p3, p4, p5, p6, 0x0.0p0f))).a(((java.lang.String)(p0))))));
    return this;
}


public moom.jD a(int p0, int p1) {
this.c = ((int)(p0));
    this.d = ((int)(p1));
    return this;
}


public void a(moom.jD p0) {
java.util.List forwardValue3652_16_0;
    java.util.List spill3652_0;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_16: {
    forward_join_14: {
    life2_3 = (moom.jD.I ^ 11399996586543L);
    life4_5 = moom.iQ.b();
    spill3652_0 = this.q;
    if (!((life4_5 != null))) {
        forwardValue3652_16_0 = spill3652_0;
        break forward_join_16;
    }
    if (!((spill3652_0 == null))) {
        break forward_join_14;
    }
    this.q = ((java.util.List)(com.google.common.collect.Lists.newArrayList()));
    }
    forwardValue3652_16_0 = this.q;
    }
    ((java.util.List)(forwardValue3652_16_0)).add(((java.lang.Object)(p0)));
    return;
}


public void a(moom.DD p0) {
this.C = ((moom.DD)(p0));
    return;
}


public moom.DD a__DD() {
return this.C;
}


private void a__Void() {
moom.jD forwardValue3653_16_0;
    moom.jD spill3653_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_18: {
    forward_join_16: {
    life1_3 = (moom.jD.I ^ 62095359561981L);
    life3_5 = moom.iQ.b();
    spill3653_0 = this;
    if (!((life3_5 != null))) {
        forwardValue3653_16_0 = spill3653_0;
        break forward_join_16;
    }
    if (!((((moom.jD)(spill3653_0)).B != moom.MP.j))) {
        break forward_join_18;
    }
    this.k = ((boolean)(false));
    forwardValue3653_16_0 = this;
    }
    ((moom.jD)(forwardValue3653_16_0)).B = ((int)(moom.MP.j));
    }
    return;
}


public int a() {
return this.l;
}


public boolean a__Boolean() {
return ((((this.k) ? 1 : 0)) != 0);
}


public void a(float p0) {
int lexicalValue1208_13_0;
    int lexicalValue1208_20_0;
    int lexicalValue1208_27_0;
    int lexicalValue1208_47_0;
    moom.jD lexicalValue1208_53_0;
    moom.jD lexicalValue1208_61_0;
    int lexicalValue1208_82_0;
    int lexicalValue1208_84_0;
    int lexicalValue1208_147_0;
    int lexicalValue1208_172_0;
    int lexicalValue1208_204_0;
    int lexicalValue1208_216_0;
    int lexicalValue1208_241_0;
    int lexicalValue1208_291_0;
    int lexicalValue1208_306_0;
    int lexicalValue1208_321_0;
    int lexicalValue1208_333_0;
    int lexicalValue1208_345_0;
    java.util.List lexicalValue1208_353_0;
    int lexicalValue1208_381_0;
    int lexicalValue1208_385_0;
    boolean spill1208_0;
    moom.jD spill1208_1;
    moom.jD spill1208_2;
    boolean spill1208_3;
    int spill1208_4;
    int spill1208_5;
    int spill1208_6;
    int spill1208_7;
    int spill1208_8;
    int spill1208_9;
    int spill1208_10;
    int spill1208_11;
    int spill1208_12;
    int spill1208_13;
    java.util.List spill1208_14;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    int life5_45;
    int life6_138;
    java.util.Iterator life7_255;
    moom.jD life8_262;
    java.util.Iterator life7_345;
    moom.jD life8_352;
    java.util.Iterator life7_513;
    moom.jD life8_520;
    lexical_join_386: {
    lexical_join_385: {
    lexical_join_381: {
    lexical_join_380: {
    lexical_join_370: {
    lexical_join_369: {
    lexical_join_353: {
    lexical_join_345: {
    lexical_join_343: {
    lexical_join_333: {
    lexical_join_332: {
    lexical_join_321: {
    lexical_join_317: {
    lexical_join_306: {
    lexical_join_302: {
    lexical_join_291: {
    lexical_join_273: {
    lexical_join_271: {
    lexical_join_255: {
    lexical_join_241: {
    lexical_join_240: {
    lexical_join_216: {
    lexical_join_214: {
    lexical_join_204: {
    lexical_join_190: {
    lexical_join_172: {
    lexical_join_171: {
    lexical_join_147: {
    lexical_join_145: {
    lexical_join_84: {
    lexical_join_83: {
    lexical_join_82: {
    lexical_join_81: {
    lexical_join_61: {
    lexical_join_60: {
    lexical_join_53: {
    lexical_join_52: {
    lexical_join_47: {
    lexical_join_46: {
    lexical_join_27: {
    lexical_join_26: {
    lexical_join_20: {
    lexical_join_13: {
    life2_3 = (moom.jD.I ^ 78778801845713L);
    life4_5 = moom.iQ.b();
    spill1208_0 = this.o;
    if (!((life4_5 != null))) {
        lexicalValue1208_13_0 = ((spill1208_0) ? 1 : 0);
        break lexical_join_13;
    }
    if (!((!spill1208_0))) {
        break lexical_join_386;
    }
    lexicalValue1208_13_0 = ((this.n) ? 1 : 0);
    }
    if (!((life4_5 != null))) {
        lexicalValue1208_20_0 = lexicalValue1208_13_0;
        break lexical_join_20;
    }
    if (!((lexicalValue1208_13_0 != 0))) {
        break lexical_join_386;
    }
    ((moom.jD)(this)).a__Void();
    lexicalValue1208_20_0 = ((this.k) ? 1 : 0);
    }
    if (!((life4_5 != null))) {
        lexicalValue1208_27_0 = lexicalValue1208_20_0;
        break lexical_join_27;
    }
    if (!((lexicalValue1208_20_0 == 0))) {
        break lexical_join_26;
    }
    this.d(((float)(p0)));
    }
    lexicalValue1208_27_0 = 0;
    }
    life5_45 = lexicalValue1208_27_0;
    spill1208_1 = this;
    if (!((life4_5 != null))) {
        lexicalValue1208_53_0 = spill1208_1;
        break lexical_join_53;
    }
    if (!((((moom.jD)(spill1208_1)).C != null))) {
        break lexical_join_52;
    }
    spill1208_2 = this;
    if (!((life4_5 != null))) {
        lexicalValue1208_53_0 = spill1208_2;
        break lexical_join_53;
    }
    if (!((!((net.minecraft.client.renderer.RenderGlobal)(((moom.jD)(spill1208_2)).F)).G))) {
        break lexical_join_52;
    }
    spill1208_3 = ((net.minecraft.client.renderer.RenderGlobal)(this.F)).H;
    if (!((life4_5 != null))) {
        lexicalValue1208_47_0 = ((spill1208_3) ? 1 : 0);
        break lexical_join_47;
    }
    if (!(spill1208_3)) {
        break lexical_join_46;
    }
    return;
    }
    lexicalValue1208_47_0 = moom.kZ.d();
    }
    life5_45 = lexicalValue1208_47_0;
    ((net.minecraft.client.renderer.texture.TextureManager)(moom.BU.a__ok())).a__Void(((moom.DD)(this.C)));
    }
    lexicalValue1208_53_0 = this;
    }
    if (!((life4_5 != null))) {
        lexicalValue1208_61_0 = lexicalValue1208_53_0;
        break lexical_join_61;
    }
    if (!((((moom.jD)(lexicalValue1208_53_0)).E != null))) {
        break lexical_join_60;
    }
    ((moom.Ld)(this.E)).a();
    }
    lexicalValue1208_61_0 = this;
    }
    spill1208_4 = recovery.source.CarrierOps.fcmpl(((float)(((moom.jD)(lexicalValue1208_61_0)).y)), ((float)(0x1.0p0f)));
    if (!((life4_5 != null))) {
        lexicalValue1208_82_0 = spill1208_4;
        break lexical_join_82;
    }
    if (!((spill1208_4 == 0))) {
        break lexical_join_81;
    }
    spill1208_5 = recovery.source.CarrierOps.fcmpl(((float)(this.z)), ((float)(0x1.0p0f)));
    if (!((life4_5 != null))) {
        lexicalValue1208_82_0 = spill1208_5;
        break lexical_join_82;
    }
    if (!((spill1208_5 == 0))) {
        break lexical_join_81;
    }
    spill1208_6 = recovery.source.CarrierOps.fcmpl(((float)(this.A)), ((float)(0x1.0p0f)));
    if (!((life4_5 != null))) {
        lexicalValue1208_82_0 = spill1208_6;
        break lexical_join_82;
    }
    if (!((spill1208_6 != 0))) {
        break lexical_join_83;
    }
    }
    lexicalValue1208_82_0 = 1;
    }
    lexicalValue1208_84_0 = lexicalValue1208_82_0;
    break lexical_join_84;
    }
    lexicalValue1208_84_0 = 0;
    }
    life6_138 = lexicalValue1208_84_0;
    moom.kZ.b(((float)(this.t)), ((float)(this.u)), ((float)(this.v)));
    spill1208_7 = recovery.source.CarrierOps.fcmpl(((float)(this.h)), ((float)(0x0.0p0f)));
    if (!((life4_5 != null))) {
        lexicalValue1208_291_0 = spill1208_7;
        break lexical_join_291;
    }
    if (!((spill1208_7 == 0))) {
        break lexical_join_273;
    }
    spill1208_8 = recovery.source.CarrierOps.fcmpl(((float)(this.i)), ((float)(0x0.0p0f)));
    if (!((life4_5 != null))) {
        lexicalValue1208_291_0 = spill1208_8;
        break lexical_join_291;
    }
    if (!((spill1208_8 == 0))) {
        break lexical_join_273;
    }
    spill1208_9 = recovery.source.CarrierOps.fcmpl(((float)(this.j)), ((float)(0x0.0p0f)));
    if (!((life4_5 != null))) {
        lexicalValue1208_291_0 = spill1208_9;
        break lexical_join_291;
    }
    if (!((spill1208_9 == 0))) {
        break lexical_join_273;
    }
    spill1208_10 = recovery.source.CarrierOps.fcmpl(((float)(this.e)), ((float)(0x0.0p0f)));
    if (!((life4_5 != null))) {
        lexicalValue1208_204_0 = spill1208_10;
        break lexical_join_204;
    }
    if (!((spill1208_10 == 0))) {
        break lexical_join_190;
    }
    spill1208_11 = recovery.source.CarrierOps.fcmpl(((float)(this.f)), ((float)(0x0.0p0f)));
    if (!((life4_5 != null))) {
        lexicalValue1208_204_0 = spill1208_11;
        break lexical_join_204;
    }
    if (!((spill1208_11 == 0))) {
        break lexical_join_190;
    }
    spill1208_12 = recovery.source.CarrierOps.fcmpl(((float)(this.g)), ((float)(0x0.0p0f)));
    if (!((life4_5 != null))) {
        lexicalValue1208_204_0 = spill1208_12;
        break lexical_join_204;
    }
    if (!((spill1208_12 == 0))) {
        break lexical_join_190;
    }
    spill1208_13 = life6_138;
    if (!((life4_5 != null))) {
        lexicalValue1208_147_0 = spill1208_13;
        break lexical_join_147;
    }
    if (!((spill1208_13 != 0))) {
        break lexical_join_145;
    }
    moom.kZ.a(((float)(this.y)), ((float)(this.z)), ((float)(this.A)));
    }
    lexicalValue1208_147_0 = this.l;
    }
    if (!((life4_5 != null))) {
        lexicalValue1208_172_0 = lexicalValue1208_147_0;
        break lexical_join_172;
    }
    moom.kZ.p(((int)(lexicalValue1208_147_0)));
    if (!((this.q != null))) {
        break lexical_join_171;
    }
    life7_255 = ((java.util.List)(this.q)).iterator();
    lexical_cycle_157: while (true) {
    if (!(((java.util.Iterator)(life7_255)).hasNext())) {
        break lexical_join_171;
    }
    life8_262 = ((moom.jD)(((java.util.Iterator)(life7_255)).next()));
    ((moom.jD)(life8_262)).a(((float)(p0)));
    if (!((life4_5 != null))) {
        break lexical_join_380;
    }
    if (!((life4_5 == null))) { continue lexical_cycle_157; }
    break lexical_cycle_157;
    }
    }
    lexicalValue1208_172_0 = life6_138;
    }
    if (!((life4_5 != null))) {
        lexicalValue1208_381_0 = lexicalValue1208_172_0;
        break lexical_join_381;
    }
    if (!((lexicalValue1208_172_0 != 0))) {
        break lexical_join_370;
    }
    moom.kZ.a(((float)((0x1.0p0f / this.y))), ((float)((0x1.0p0f / this.z))), ((float)((0x1.0p0f / this.A))));
    if (!((life4_5 == null))) {
        break lexical_join_370;
    }
    }
    moom.kZ.b(((float)((this.e * p0))), ((float)((this.f * p0))), ((float)((this.g * p0))));
    lexicalValue1208_204_0 = life6_138;
    }
    if (!((life4_5 != null))) {
        lexicalValue1208_216_0 = lexicalValue1208_204_0;
        break lexical_join_216;
    }
    if (!((lexicalValue1208_204_0 != 0))) {
        break lexical_join_214;
    }
    moom.kZ.a(((float)(this.y)), ((float)(this.z)), ((float)(this.A)));
    }
    lexicalValue1208_216_0 = this.l;
    }
    if (!((life4_5 != null))) {
        lexicalValue1208_241_0 = lexicalValue1208_216_0;
        break lexical_join_241;
    }
    moom.kZ.p(((int)(lexicalValue1208_216_0)));
    if (!((this.q != null))) {
        break lexical_join_240;
    }
    life7_345 = ((java.util.List)(this.q)).iterator();
    lexical_cycle_226: while (true) {
    if (!(((java.util.Iterator)(life7_345)).hasNext())) {
        break lexical_join_240;
    }
    life8_352 = ((moom.jD)(((java.util.Iterator)(life7_345)).next()));
    ((moom.jD)(life8_352)).a(((float)(p0)));
    if (!((life4_5 != null))) {
        break lexical_join_271;
    }
    if (!((life4_5 == null))) { continue lexical_cycle_226; }
    break lexical_cycle_226;
    }
    }
    lexicalValue1208_241_0 = life6_138;
    }
    if (!((lexicalValue1208_241_0 != 0))) {
        break lexical_join_255;
    }
    moom.kZ.a(((float)((0x1.0p0f / this.y))), ((float)((0x1.0p0f / this.z))), ((float)((0x1.0p0f / this.A))));
    }
    moom.kZ.b(((float)(((-this.e) * p0))), ((float)(((-this.f) * p0))), ((float)(((-this.g) * p0))));
    }
    if (!((life4_5 == null))) {
        break lexical_join_370;
    }
    }
    moom.kZ.B();
    moom.kZ.b(((float)((this.e * p0))), ((float)((this.f * p0))), ((float)((this.g * p0))));
    lexicalValue1208_291_0 = recovery.source.CarrierOps.fcmpl(((float)(this.j)), ((float)(0x0.0p0f)));
    }
    if (!((life4_5 != null))) {
        lexicalValue1208_306_0 = lexicalValue1208_291_0;
        break lexical_join_306;
    }
    if (!((lexicalValue1208_291_0 != 0))) {
        break lexical_join_302;
    }
    moom.kZ.b(((float)((this.j * 0x1.ca5dcp5f))), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)));
    }
    lexicalValue1208_306_0 = recovery.source.CarrierOps.fcmpl(((float)(this.i)), ((float)(0x0.0p0f)));
    }
    if (!((life4_5 != null))) {
        lexicalValue1208_321_0 = lexicalValue1208_306_0;
        break lexical_join_321;
    }
    if (!((lexicalValue1208_306_0 != 0))) {
        break lexical_join_317;
    }
    moom.kZ.b(((float)((this.i * 0x1.ca5dcp5f))), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)));
    }
    lexicalValue1208_321_0 = recovery.source.CarrierOps.fcmpl(((float)(this.h)), ((float)(0x0.0p0f)));
    }
    if (!((life4_5 != null))) {
        lexicalValue1208_333_0 = lexicalValue1208_321_0;
        break lexical_join_333;
    }
    if (!((lexicalValue1208_321_0 != 0))) {
        break lexical_join_332;
    }
    moom.kZ.b(((float)((this.h * 0x1.ca5dcp5f))), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)));
    }
    lexicalValue1208_333_0 = life6_138;
    }
    if (!((life4_5 != null))) {
        lexicalValue1208_345_0 = lexicalValue1208_333_0;
        break lexical_join_345;
    }
    if (!((lexicalValue1208_333_0 != 0))) {
        break lexical_join_343;
    }
    moom.kZ.a(((float)(this.y)), ((float)(this.z)), ((float)(this.A)));
    }
    lexicalValue1208_345_0 = this.l;
    }
    moom.kZ.p(((int)(lexicalValue1208_345_0)));
    spill1208_14 = this.q;
    if (!((life4_5 != null))) {
        lexicalValue1208_353_0 = spill1208_14;
        break lexical_join_353;
    }
    if (!((spill1208_14 != null))) {
        break lexical_join_369;
    }
    lexicalValue1208_353_0 = this.q;
    }
    life7_513 = ((java.util.List)(lexicalValue1208_353_0)).iterator();
    lexical_cycle_355: while (true) {
    if (!(((java.util.Iterator)(life7_513)).hasNext())) {
        break lexical_join_369;
    }
    life8_520 = ((moom.jD)(((java.util.Iterator)(life7_513)).next()));
    ((moom.jD)(life8_520)).a(((float)(p0)));
    if (!((life4_5 != null))) {
        break lexical_join_380;
    }
    if (!((life4_5 == null))) { continue lexical_cycle_355; }
    break lexical_cycle_355;
    }
    }
    moom.kZ.C();
    }
    moom.kZ.b(((float)((-this.t))), ((float)((-this.u))), ((float)((-this.v))));
    }
    lexicalValue1208_381_0 = life5_45;
    }
    if (!((life4_5 != null))) {
        lexicalValue1208_385_0 = lexicalValue1208_381_0;
        break lexical_join_385;
    }
    if (!((lexicalValue1208_381_0 != 0))) {
        break lexical_join_386;
    }
    lexicalValue1208_385_0 = life5_45;
    }
    moom.kZ.i(((int)(lexicalValue1208_385_0)));
    }
    return;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a5c5ed3151cb_originalDynamicSite1528_1(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral8102_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2b75f634baf5_invokedynamic1212_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2b75f634baf5_invokedynamic1212_26(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_invokedynamic3658_11(java.lang.String a0, java.lang.Integer a1, java.lang.Integer a2) throws E;
}
