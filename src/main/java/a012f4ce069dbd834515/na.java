package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class na extends com.moon.m5 {

private final com.moon.k5 n;

private boolean o;

private boolean p;

private boolean q;

private long r;

private static final long s;

private static final long[] t;

private static final java.lang.Integer[] u;

private static final java.util.Map v;

private static final long w;

public na(com.moon.nh p0, com.moon.k5 p1, float p2, float p3, float p4, float p5) {
super(p0, p2, p3, p4, p5);
    this.n = p1;
}


static {
s = ((long)(((moom._a)(moom._c.a(((long)(-5565747297689231052L)), ((long)(-7688236405756350679L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(260449916073901L)))));
    v = ((java.util.Map)(new java.util.HashMap(13)));
    long local5_life7 = (com.moon.na.s ^ 50699567986181L);
    javax.crypto.Cipher local7_life9;
    javax.crypto.Cipher __sourceSpill309_11 = (local7_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill309_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill309_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill309_14 = new byte[8];
    (__sourceSpill309_14)[0] = ((byte) ((int) (local5_life7 >>> 56)));
    int local8_life15 = 1;
    while ((local8_life15 < 8)) {
        (__sourceSpill309_14)[local8_life15] = ((byte) ((int) ((local5_life7 << (local8_life15 * 8)) >>> 56)));
        local8_life15 += 1;
    }
    byte[] __sourcePreallocation309_16 = __sourceSpill309_14;
    ((javax.crypto.Cipher)(__sourceSpill309_11)).init(((int)(__sourceSpill309_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill309_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation309_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local13_life19 = new long[5];
    int local10_life20 = 0;
    java.lang.String local11_life21;
    int local12_life23 = ((java.lang.String)((local11_life21 = "_Ó\021\037j\005Ó§ÜÇ±ó²I\020¡\031hÆÐä7"))).length();
    int local9_life24 = 0;
    do {
        java.lang.String __sourceSpill309_25 = local11_life21;
        int __sourceSpill309_26 = local9_life24;
        local9_life24 += 8;
        byte[] local14_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill309_25)).substring(((int)(__sourceSpill309_26)), ((int)(local9_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill309_30 = local13_life19;
        int __sourceSpill309_31 = local10_life20;
        local10_life20 += 1;
        long local15_life32 = (((((((((((long) (local14_life29)[0]) & 255L) << 56) | ((((long) (local14_life29)[1]) & 255L) << 48)) | ((((long) (local14_life29)[2]) & 255L) << 40)) | ((((long) (local14_life29)[3]) & 255L) << 32)) | ((((long) (local14_life29)[4]) & 255L) << 24)) | ((((long) (local14_life29)[5]) & 255L) << 16)) | ((((long) (local14_life29)[6]) & 255L) << 8)) | (((long) (local14_life29)[7]) & 255L));
        byte[] __sourceSpill309_33 = new byte[8];
        (__sourceSpill309_33)[0] = ((byte) ((int) (local15_life32 >>> 56)));
        (__sourceSpill309_33)[1] = ((byte) ((int) (local15_life32 >>> 48)));
        (__sourceSpill309_33)[2] = ((byte) ((int) (local15_life32 >>> 40)));
        (__sourceSpill309_33)[3] = ((byte) ((int) (local15_life32 >>> 32)));
        (__sourceSpill309_33)[4] = ((byte) ((int) (local15_life32 >>> 24)));
        (__sourceSpill309_33)[5] = ((byte) ((int) (local15_life32 >>> 16)));
        (__sourceSpill309_33)[6] = ((byte) ((int) (local15_life32 >>> 8)));
        (__sourceSpill309_33)[7] = ((byte) ((int) local15_life32));
        javax.crypto.Cipher __sourceSpill309_34 = local7_life9;
        byte[] local17_life36 = ((javax.crypto.Cipher)(__sourceSpill309_34)).doFinal(((byte[])(__sourceSpill309_33)));
        (__sourceSpill309_30)[__sourceSpill309_31] = (((((((((((long) (local17_life36)[0]) & 255L) << 56) | ((((long) (local17_life36)[1]) & 255L) << 48)) | ((((long) (local17_life36)[2]) & 255L) << 40)) | ((((long) (local17_life36)[3]) & 255L) << 32)) | ((((long) (local17_life36)[4]) & 255L) << 24)) | ((((long) (local17_life36)[5]) & 255L) << 16)) | ((((long) (local17_life36)[6]) & 255L) << 8)) | (((long) (local17_life36)[7]) & 255L));
    } while ((!(local9_life24 >= local12_life23)));
    local12_life23 = ((java.lang.String)((local11_life21 = "½ÊÕM§\036m·Õm\017Èm7ÿ"))).length();
    local9_life24 = 0;
    do {
        java.lang.String __sourceSpill309_38 = local11_life21;
        int __sourceSpill309_39 = local9_life24;
        local9_life24 += 8;
        byte[] local14_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill309_38)).substring(((int)(__sourceSpill309_39)), ((int)(local9_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill309_43 = local13_life19;
        int __sourceSpill309_44 = local10_life20;
        local10_life20 += 1;
        long local15_life45 = (((((((((((long) (local14_life42)[0]) & 255L) << 56) | ((((long) (local14_life42)[1]) & 255L) << 48)) | ((((long) (local14_life42)[2]) & 255L) << 40)) | ((((long) (local14_life42)[3]) & 255L) << 32)) | ((((long) (local14_life42)[4]) & 255L) << 24)) | ((((long) (local14_life42)[5]) & 255L) << 16)) | ((((long) (local14_life42)[6]) & 255L) << 8)) | (((long) (local14_life42)[7]) & 255L));
        byte[] __sourceSpill309_46 = new byte[8];
        (__sourceSpill309_46)[0] = ((byte) ((int) (local15_life45 >>> 56)));
        (__sourceSpill309_46)[1] = ((byte) ((int) (local15_life45 >>> 48)));
        (__sourceSpill309_46)[2] = ((byte) ((int) (local15_life45 >>> 40)));
        (__sourceSpill309_46)[3] = ((byte) ((int) (local15_life45 >>> 32)));
        (__sourceSpill309_46)[4] = ((byte) ((int) (local15_life45 >>> 24)));
        (__sourceSpill309_46)[5] = ((byte) ((int) (local15_life45 >>> 16)));
        (__sourceSpill309_46)[6] = ((byte) ((int) (local15_life45 >>> 8)));
        (__sourceSpill309_46)[7] = ((byte) ((int) local15_life45));
        javax.crypto.Cipher __sourceSpill309_47 = local7_life9;
        byte[] local17_life49 = ((javax.crypto.Cipher)(__sourceSpill309_47)).doFinal(((byte[])(__sourceSpill309_46)));
        (__sourceSpill309_43)[__sourceSpill309_44] = (((((((((((long) (local17_life49)[0]) & 255L) << 56) | ((((long) (local17_life49)[1]) & 255L) << 48)) | ((((long) (local17_life49)[2]) & 255L) << 40)) | ((((long) (local17_life49)[3]) & 255L) << 32)) | ((((long) (local17_life49)[4]) & 255L) << 24)) | ((((long) (local17_life49)[5]) & 255L) << 16)) | ((((long) (local17_life49)[6]) & 255L) << 8)) | (((long) (local17_life49)[7]) & 255L));
    } while ((!(local9_life24 >= local12_life23)));
    t = ((long[])(local13_life19));
    u = ((java.lang.Integer[])(new java.lang.Integer[5]));
    javax.crypto.Cipher local0_life53;
    javax.crypto.Cipher __sourceSpill309_55 = (local0_life53 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill309_56 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill309_57 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill309_58 = new byte[8];
    (__sourceSpill309_58)[0] = ((byte) ((int) (local5_life7 >>> 56)));
    int local1_life59 = 1;
    while ((local1_life59 < 8)) {
        (__sourceSpill309_58)[local1_life59] = ((byte) ((int) ((local5_life7 << (local1_life59 * 8)) >>> 56)));
        local1_life59 += 1;
    }
    byte[] __sourcePreallocation309_60 = __sourceSpill309_58;
    ((javax.crypto.Cipher)(__sourceSpill309_55)).init(((int)(__sourceSpill309_56)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill309_57)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation309_60)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local2_life63 = -1950200762819067687L;
    byte[] __sourceSpill309_64 = new byte[8];
    (__sourceSpill309_64)[0] = ((byte) ((int) (local2_life63 >>> 56)));
    (__sourceSpill309_64)[1] = ((byte) ((int) (local2_life63 >>> 48)));
    (__sourceSpill309_64)[2] = ((byte) ((int) (local2_life63 >>> 40)));
    (__sourceSpill309_64)[3] = ((byte) ((int) (local2_life63 >>> 32)));
    (__sourceSpill309_64)[4] = ((byte) ((int) (local2_life63 >>> 24)));
    (__sourceSpill309_64)[5] = ((byte) ((int) (local2_life63 >>> 16)));
    (__sourceSpill309_64)[6] = ((byte) ((int) (local2_life63 >>> 8)));
    (__sourceSpill309_64)[7] = ((byte) ((int) local2_life63));
    javax.crypto.Cipher __sourceSpill309_65 = local0_life53;
    byte[] local4_life67 = ((javax.crypto.Cipher)(__sourceSpill309_65)).doFinal(((byte[])(__sourceSpill309_64)));
    w = ((long)((((((((((((long) (local4_life67)[0]) & 255L) << 56) | ((((long) (local4_life67)[1]) & 255L) << 48)) | ((((long) (local4_life67)[2]) & 255L) << 40)) | ((((long) (local4_life67)[3]) & 255L) << 32)) | ((((long) (local4_life67)[4]) & 255L) << 24)) | ((((long) (local4_life67)[5]) & 255L) << 16)) | ((((long) (local4_life67)[6]) & 255L) << 8)) | (((long) (local4_life67)[7]) & 255L))));
}


public void b(int p0, int p1) {
super.b(((int)(p0)), ((int)(p1)));
    return;
}


public boolean c__Boolean() {
return (__sourceIntrinsic_booleanComparison((((com.moon.k5)(this.n)).isAvailable())) != 0);
}


public void c(int p0, int p1) {
com.moon.jm forwardValue1087_126_0;
    com.moon.hW forwardValue1087_126_1;
    java.lang.String forwardValue1087_126_2;
    float forwardValue1087_126_3;
    float forwardValue1087_126_4;
    float forwardValue1087_126_5;
    com.moon.jm forwardValue1087_127_0;
    com.moon.hW forwardValue1087_127_1;
    java.lang.String forwardValue1087_127_2;
    float forwardValue1087_127_3;
    float forwardValue1087_127_4;
    com.moon.jm forwardValue1087_128_0;
    com.moon.hW forwardValue1087_128_1;
    java.lang.String forwardValue1087_128_2;
    float forwardValue1087_128_3;
    float forwardValue1087_128_4;
    float forwardValue1087_128_5;
    int forwardValue1087_186_0;
    com.moon.na forwardValue1087_201_0;
    int forwardValue1087_201_1;
    com.moon.na forwardValue1087_202_0;
    com.moon.na forwardValue1087_203_0;
    int forwardValue1087_203_1;
    int forwardValue1087_231_0;
    com.moon.na forwardValue1087_259_0;
    net.minecraft.entity.Entity[] spill1087_0;
    com.moon.jm spill1087_1;
    com.moon.hW spill1087_2;
    java.lang.String spill1087_3;
    float spill1087_4;
    float spill1087_5;
    float spill1087_6;
    boolean spill1087_7;
    com.moon.na spill1087_8;
    com.moon.na spill1087_9;
    boolean spill1087_10;
    int spill1087_11;
    com.moon.na spill1087_12;
    long life3_3;
    float life6_8;
    float life7_13;
    float life8_18;
    com.moon.jm life9_23;
    com.moon.hW life10_28;
    com.moon.hW life11_36;
    com.moon.hW life12_43;
    com.moon.jC life13_59;
    net.minecraft.entity.Entity[] life5_60;
    float life14_91;
    float life15_97;
    float life16_169;
    float life16_231;
    float life17_237;
    forward_join_259: {
    forward_join_249: {
    forward_join_231: {
    forward_join_227: {
    forward_join_207: {
    forward_join_203: {
    forward_join_202: {
    forward_join_201: {
    forward_join_186: {
    forward_join_182: {
    forward_join_128: {
    forward_join_127: {
    forward_join_126: {
    life3_3 = (com.moon.na.s ^ 105480661318749L);
    life6_8 = (((com.moon.na)(this)).a() + 0x1.0p3f);
    life7_13 = (((com.moon.na)(this)).b() + 0x1.2p2f);
    life8_18 = (((com.moon.na)(this)).c() - 0x1.0p4f);
    life9_23 = ((com.moon.jo)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__jo())).a(((com.moon.ce)(com.moon.ce.INTER_MEDIUM)));
    life10_28 = ((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.ROUNDED_RECTANGLE))))).a();
    spill1087_0 = moom.lw.b__Arrayr3();
    life11_36 = ((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.MSDF))))).a(((com.moon.jm)(life9_23))))).a();
    life12_43 = ((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.MSDF))))).a(((com.moon.jm)(life9_23))))).a();
    life13_59 = com.moon.jC.a(((float)((life6_8 + 0x1.0p2f))), ((float)(((life7_13 + 0x1.0p0f) + ((com.moon.jm)(life9_23)).a(((float)(0x1.cp2f)))))), ((float)((life8_18 - 0x1.0p3f))), ((float)(0x1.1p4f)));
    life5_60 = spill1087_0;
    ((com.moon.hW)(life10_28)).a(((com.moon.iX)(com.moon.i3.a(((float)((life6_8 - 0x1.0p-1f))), ((float)(((life7_13 + 0x1.0p0f) + ((com.moon.jm)(life9_23)).a(((float)(0x1.cp2f)))))), ((float)((life8_18 + 0x1.0p0f))), ((float)(0x1.1p4f)), ((float)(0x1.8p1f)), ((int)(__sourceIntrinsic_505b8c2844d4_invokedynamic1087_26(17296, (8428047066829316110L ^ life3_3))))))));
    life14_91 = ((com.moon.jm)(life9_23)).a(((java.lang.String)(((java.lang.String)(((com.moon.k5)(this.n)).getValue())))), ((float)(0x1.cp2f)));
    life15_97 = ((life14_91 - life8_18) + 0x1.0p3f);
    ((com.moon.jm)(life9_23)).b(((com.moon.hW)(life11_36)), ((java.lang.String)(((com.moon.k5)(this.n)).getDisplayName())), ((float)(0x1.cp2f)), ((float)(life6_8)), ((float)(life7_13)), ((int)(-1)));
    spill1087_1 = life9_23;
    spill1087_2 = life12_43;
    spill1087_3 = ((java.lang.String)(((com.moon.k5)(this.n)).getValue()));
    spill1087_4 = 0x1.cp2f;
    spill1087_5 = (life6_8 + 0x1.0p2f);
    spill1087_6 = life15_97;
    if (!((life5_60 == null))) {
        forwardValue1087_126_0 = spill1087_1;
        forwardValue1087_126_1 = spill1087_2;
        forwardValue1087_126_2 = spill1087_3;
        forwardValue1087_126_3 = spill1087_4;
        forwardValue1087_126_4 = spill1087_5;
        forwardValue1087_126_5 = spill1087_6;
        break forward_join_126;
    }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(spill1087_6)), ((float)(0x0.0p0f))) > 0))) {
        forwardValue1087_127_0 = spill1087_1;
        forwardValue1087_127_1 = spill1087_2;
        forwardValue1087_127_2 = spill1087_3;
        forwardValue1087_127_3 = spill1087_4;
        forwardValue1087_127_4 = spill1087_5;
        break forward_join_127;
    }
    forwardValue1087_126_0 = spill1087_1;
    forwardValue1087_126_1 = spill1087_2;
    forwardValue1087_126_2 = spill1087_3;
    forwardValue1087_126_3 = spill1087_4;
    forwardValue1087_126_4 = spill1087_5;
    forwardValue1087_126_5 = (-life15_97);
    }
    forwardValue1087_128_0 = forwardValue1087_126_0;
    forwardValue1087_128_1 = forwardValue1087_126_1;
    forwardValue1087_128_2 = forwardValue1087_126_2;
    forwardValue1087_128_3 = forwardValue1087_126_3;
    forwardValue1087_128_4 = forwardValue1087_126_4;
    forwardValue1087_128_5 = forwardValue1087_126_5;
    break forward_join_128;
    }
    forwardValue1087_128_0 = forwardValue1087_127_0;
    forwardValue1087_128_1 = forwardValue1087_127_1;
    forwardValue1087_128_2 = forwardValue1087_127_2;
    forwardValue1087_128_3 = forwardValue1087_127_3;
    forwardValue1087_128_4 = forwardValue1087_127_4;
    forwardValue1087_128_5 = 0x0.0p0f;
    }
    ((com.moon.jm)(forwardValue1087_128_0)).b(((com.moon.hW)(forwardValue1087_128_1)), ((java.lang.String)(forwardValue1087_128_2)), ((float)(forwardValue1087_128_3)), ((float)((forwardValue1087_128_4 + forwardValue1087_128_5))), ((float)((((((life7_13 + 0x1.0p0f) + ((com.moon.jm)(life9_23)).a(((float)(0x1.cp2f)))) + 0x1.1p3f) - (((com.moon.jm)(life9_23)).a(((float)(0x1.cp2f))) / 0x1.0p1f)) + 0x1.0p-1f))), ((int)(-1)));
    spill1087_7 = this.q;
    if (!((life5_60 == null))) {
        forwardValue1087_186_0 = ((spill1087_7) ? 1 : 0);
        break forward_join_186;
    }
    if (!(spill1087_7)) {
        break forward_join_182;
    }
    life16_169 = java.lang.Math.min(((float)((life14_91 + 0x1.0p2f))), ((float)((life8_18 - 0x1.0p2f))));
    ((com.moon.hW)(life10_28)).a(((com.moon.iX)(com.moon.i3.a(((float)((life6_8 + 0x1.0p1f))), ((float)(((life7_13 + 0x1.8p1f) + ((com.moon.jm)(life9_23)).a(((float)(0x1.cp2f)))))), ((float)(life16_169)), ((float)(0x1.ap3f)), ((float)(0x1.0p1f)), ((int)(__sourceIntrinsic_505b8c2844d4_invokedynamic1087_47(15445, (5429534650495606729L ^ life3_3))))))));
    }
    spill1087_8 = this;
    if (!((life5_60 == null))) {
        forwardValue1087_259_0 = spill1087_8;
        break forward_join_259;
    }
    forwardValue1087_186_0 = ((((com.moon.na)(spill1087_8)).o) ? 1 : 0);
    }
    if (!((forwardValue1087_186_0 != 0))) {
        break forward_join_249;
    }
    if (!((recovery.source.CarrierOps.lcmp(((long)((java.lang.System.currentTimeMillis() - this.r))), ((long)(com.moon.na.w))) > 0))) {
        break forward_join_207;
    }
    spill1087_9 = this;
    spill1087_10 = this.p;
    if (!((life5_60 == null))) {
        forwardValue1087_201_0 = spill1087_9;
        forwardValue1087_201_1 = ((spill1087_10) ? 1 : 0);
        break forward_join_201;
    }
    if (!((!spill1087_10))) {
        forwardValue1087_202_0 = spill1087_9;
        break forward_join_202;
    }
    forwardValue1087_201_0 = spill1087_9;
    forwardValue1087_201_1 = 1;
    }
    forwardValue1087_203_0 = forwardValue1087_201_0;
    forwardValue1087_203_1 = forwardValue1087_201_1;
    break forward_join_203;
    }
    forwardValue1087_203_0 = forwardValue1087_202_0;
    forwardValue1087_203_1 = 0;
    }
    ((com.moon.na)(forwardValue1087_203_0)).p = ((boolean)__sourceIntrinsic_integerToBoolean((forwardValue1087_203_1)));
    this.r = ((long)(java.lang.System.currentTimeMillis()));
    }
    life16_231 = (life14_91 + 0x1.0p2f);
    life17_237 = ((life14_91 - life8_18) + 0x1.0p3f);
    spill1087_11 = recovery.source.CarrierOps.fcmpl(((float)(life17_237)), ((float)(0x0.0p0f)));
    if (!((life5_60 == null))) {
        forwardValue1087_231_0 = spill1087_11;
        break forward_join_231;
    }
    if (!((spill1087_11 > 0))) {
        break forward_join_227;
    }
    life16_231 = (life16_231 - life17_237);
    }
    spill1087_12 = this;
    if (!((life5_60 == null))) {
        forwardValue1087_259_0 = spill1087_12;
        break forward_join_259;
    }
    forwardValue1087_231_0 = ((((com.moon.na)(spill1087_12)).p) ? 1 : 0);
    }
    if (!((forwardValue1087_231_0 != 0))) {
        break forward_join_249;
    }
    ((com.moon.hW)(life10_28)).a(((com.moon.iX)(com.moon.i3.a(((float)((life6_8 + life16_231))), ((float)(((life7_13 + 0x1.0p2f) + ((com.moon.jm)(life9_23)).a(((float)(0x1.cp2f)))))), ((float)(0x1.0p1f)), ((float)(0x1.6p3f)), ((float)(0x1.0p-1f)), ((int)(-1))))));
    }
    ((com.moon.hW)(life10_28)).b();
    ((com.moon.hW)(life11_36)).b();
    ((com.moon.hW)(life12_43)).a(((com.moon.jA)(life13_59)));
    ((com.moon.hW)(life12_43)).b();
    forwardValue1087_259_0 = this;
    }
    __sourceIntrinsic_505b8c2844d4_call1087_71(forwardValue1087_259_0, p0, p1);
    return;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral2962_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/na"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(int p0, int p1) {
super.a(((int)(p0)), ((int)(p1)));
    return;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 12936;
      if (u[var3] == null) {
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
         long var5 = t[var3];
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
         Object[] var9 = (Object[])v.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               v.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/moon/na", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         u[var3] = var15;
      }

      return u[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_9174b7470d7cad(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public void a(int p0, int p1, int p2) {
com.moon.na forwardValue1086_45_0;
    int forwardValue1086_45_1;
    com.moon.na forwardValue1086_49_0;
    int forwardValue1086_49_1;
    com.moon.na forwardValue1086_50_0;
    com.moon.na forwardValue1086_51_0;
    int forwardValue1086_51_1;
    com.moon.na forwardValue1086_61_0;
    net.minecraft.entity.Entity[] spill1086_0;
    com.moon.na spill1086_1;
    boolean spill1086_2;
    com.moon.na spill1086_3;
    long life4_3;
    float life7_8;
    float life8_14;
    float life9_19;
    net.minecraft.entity.Entity[] life6_20;
    com.moon.jm life10_25;
    forward_join_61: {
    forward_join_60: {
    forward_join_51: {
    forward_join_50: {
    forward_join_49: {
    forward_join_45: {
    life4_3 = (com.moon.na.s ^ 128247195694083L);
    life7_8 = (((com.moon.na)(this)).a() + 0x1.0p3f);
    spill1086_0 = moom.lw.b__Arrayr3();
    life8_14 = (((com.moon.na)(this)).b() + 0x1.2p2f);
    life9_19 = (((com.moon.na)(this)).c() - 0x1.0p4f);
    life6_20 = spill1086_0;
    life10_25 = ((com.moon.jo)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__jo())).a(((com.moon.ce)(com.moon.ce.INTER_MEDIUM)));
    spill1086_1 = this;
    spill1086_2 = ((com.moon.na)(this)).a(((int)(p0)), ((int)(p1)), ((float)(life7_8)), ((float)(((life8_14 + 0x1.0p0f) + ((com.moon.jm)(life10_25)).a(((float)(0x1.cp2f)))))), ((float)(life9_19)), ((float)(0x1.1p4f)));
    if (!((life6_20 == null))) {
        forwardValue1086_45_0 = spill1086_1;
        forwardValue1086_45_1 = ((spill1086_2) ? 1 : 0);
        break forward_join_45;
    }
    if (!(spill1086_2)) {
        forwardValue1086_50_0 = spill1086_1;
        break forward_join_50;
    }
    forwardValue1086_45_0 = spill1086_1;
    forwardValue1086_45_1 = p2;
    }
    if (!((life6_20 == null))) {
        forwardValue1086_49_0 = forwardValue1086_45_0;
        forwardValue1086_49_1 = forwardValue1086_45_1;
        break forward_join_49;
    }
    if (!((forwardValue1086_45_1 == 0))) {
        forwardValue1086_50_0 = forwardValue1086_45_0;
        break forward_join_50;
    }
    forwardValue1086_49_0 = forwardValue1086_45_0;
    forwardValue1086_49_1 = 1;
    }
    forwardValue1086_51_0 = forwardValue1086_49_0;
    forwardValue1086_51_1 = forwardValue1086_49_1;
    break forward_join_51;
    }
    forwardValue1086_51_0 = forwardValue1086_50_0;
    forwardValue1086_51_1 = 0;
    }
    ((com.moon.na)(forwardValue1086_51_0)).o = ((boolean)__sourceIntrinsic_integerToBoolean((forwardValue1086_51_1)));
    spill1086_3 = this;
    if (!((life6_20 == null))) {
        forwardValue1086_61_0 = spill1086_3;
        break forward_join_61;
    }
    if (!((!((com.moon.na)(spill1086_3)).o))) {
        break forward_join_60;
    }
    this.q = ((boolean)(false));
    }
    forwardValue1086_61_0 = this;
    }
    __sourceIntrinsic_e4d4f5a69301_call1086_15(forwardValue1086_61_0, p0, p1, p2);
    return;
}


public void a(char p0, int p1) {
int forwardValue1084_23_0;
    int forwardValue1084_48_0;
    int forwardValue1084_48_1;
    int forwardValue1084_58_0;
    com.moon.k5 forwardValue1084_68_0;
    com.moon.k5 forwardValue1084_71_0;
    java.lang.Object forwardValue1084_71_1;
    com.moon.k5 forwardValue1084_83_0;
    java.lang.String forwardValue1084_83_1;
    int forwardValue1084_90_0;
    com.moon.na forwardValue1084_106_0;
    int forwardValue1084_115_0;
    com.moon.na forwardValue1084_117_0;
    com.moon.na spill1084_0;
    boolean spill1084_1;
    int spill1084_2;
    int spill1084_3;
    boolean spill1084_4;
    com.moon.k5 spill1084_5;
    com.moon.na spill1084_6;
    com.moon.na spill1084_7;
    long life3_3;
    net.minecraft.entity.Entity[] life5_5;
    forward_join_117: {
    forward_join_116: {
    forward_join_115: {
    forward_join_114: {
    forward_join_106: {
    forward_join_105: {
    forward_join_90: {
    forward_join_88: {
    forward_join_87: {
    forward_join_83: {
    forward_join_71: {
    forward_join_68: {
    forward_join_58: {
    forward_join_48: {
    forward_join_40: {
    forward_join_23: {
    forward_join_22: {
    life3_3 = (com.moon.na.s ^ 34879403801147L);
    life5_5 = moom.lw.b__Arrayr3();
    spill1084_0 = this;
    if (!((life5_5 == null))) {
        forwardValue1084_117_0 = spill1084_0;
        break forward_join_117;
    }
    if (!(((com.moon.na)(spill1084_0)).o)) {
        break forward_join_116;
    }
    spill1084_1 = __sourceExactCall_c29b98e3de0c5c(((int)(p1)));
    if (!((life5_5 == null))) {
        forwardValue1084_23_0 = ((spill1084_1) ? 1 : 0);
        break forward_join_23;
    }
    if (!(spill1084_1)) {
        break forward_join_22;
    }
    org.lwjgl.input.Keyboard.enableRepeatEvents(((boolean)(false)));
    this.q = ((boolean)(true));
    return;
    }
    forwardValue1084_23_0 = p1;
    }
    spill1084_2 = __sourceIntrinsic_f7d59ba1def0_invokedynamic1084_7(1034, (1819259093954011633L ^ life3_3));
    if (!((life5_5 == null))) {
        forwardValue1084_48_0 = forwardValue1084_23_0;
        forwardValue1084_48_1 = spill1084_2;
        break forward_join_48;
    }
    if (!((forwardValue1084_23_0 == spill1084_2))) {
        break forward_join_40;
    }
    this.o = ((boolean)(false));
    this.q = ((boolean)(false));
    org.lwjgl.input.Keyboard.enableRepeatEvents(((boolean)(false)));
    return;
    }
    spill1084_3 = p1;
    if (!((life5_5 == null))) {
        forwardValue1084_90_0 = spill1084_3;
        break forward_join_90;
    }
    forwardValue1084_48_0 = spill1084_3;
    forwardValue1084_48_1 = __sourceIntrinsic_f7d59ba1def0_invokedynamic1084_11(32444, (9220611034642963267L ^ life3_3));
    }
    if (!((forwardValue1084_48_0 == forwardValue1084_48_1))) {
        break forward_join_88;
    }
    spill1084_4 = ((java.lang.String)(((java.lang.String)(((com.moon.k5)(this.n)).getValue())))).isEmpty();
    if (!((life5_5 == null))) {
        forwardValue1084_58_0 = ((spill1084_4) ? 1 : 0);
        break forward_join_58;
    }
    if (!((!spill1084_4))) {
        break forward_join_87;
    }
    forwardValue1084_58_0 = 1;
    }
    org.lwjgl.input.Keyboard.enableRepeatEvents(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue1084_58_0))));
    spill1084_5 = this.n;
    spill1084_6 = this;
    if (!((life5_5 == null))) {
        forwardValue1084_71_0 = spill1084_5;
        forwardValue1084_71_1 = spill1084_6;
        break forward_join_71;
    }
    if (!(((com.moon.na)(spill1084_6)).q)) {
        forwardValue1084_68_0 = spill1084_5;
        break forward_join_68;
    }
    forwardValue1084_83_0 = spill1084_5;
    forwardValue1084_83_1 = "";
    break forward_join_83;
    }
    forwardValue1084_71_0 = forwardValue1084_68_0;
    forwardValue1084_71_1 = ((com.moon.k5)(this.n)).getValue();
    }
    forwardValue1084_83_0 = forwardValue1084_71_0;
    forwardValue1084_83_1 = ((java.lang.String)(((java.lang.String)(forwardValue1084_71_1)))).substring(((int)(0)), ((int)(java.lang.Math.max(((int)((((java.lang.String)(((java.lang.String)(((com.moon.k5)(this.n)).getValue())))).length() - 1))), ((int)(0))))));
    }
    ((com.moon.k5)(forwardValue1084_83_0)).setValue(((forwardValue1084_83_1)));
    this.q = ((boolean)(false));
    }
    return;
    }
    forwardValue1084_90_0 = ((moom.CH.a(((char)(p0)))) ? 1 : 0);
    }
    if (!((life5_5 == null))) {
        forwardValue1084_115_0 = forwardValue1084_90_0;
        break forward_join_115;
    }
    if (!((forwardValue1084_90_0 != 0))) {
        break forward_join_114;
    }
    spill1084_7 = this;
    if (!((life5_5 == null))) {
        forwardValue1084_106_0 = spill1084_7;
        break forward_join_106;
    }
    if (!(((com.moon.na)(spill1084_7)).q)) {
        break forward_join_105;
    }
    ((com.moon.k5)(this.n)).setValue((("")));
    this.q = ((boolean)(false));
    }
    forwardValue1084_106_0 = this;
    }
    ((com.moon.k5)(((com.moon.na)(forwardValue1084_106_0)).n)).setValue(((__sourceIntrinsic_f7d59ba1def0_invokedynamic1084_41(((java.lang.String)(((com.moon.k5)(this.n)).getValue())), p0))));
    }
    forwardValue1084_115_0 = 0;
    }
    org.lwjgl.input.Keyboard.enableRepeatEvents(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue1084_115_0))));
    }
    forwardValue1084_117_0 = this;
    }
    __sourceIntrinsic_f7d59ba1def0_call1084_44(forwardValue1084_117_0, p0, p1);
    return;
}


public static boolean a(int p0) {
int forwardValue1085_16_0;
    int forwardValue1085_20_0;
    int forwardValue1085_24_0;
    int forwardValue1085_28_0;
    int forwardValue1085_30_0;
    int spill1085_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_30: {
    forward_join_29: {
    forward_join_28: {
    forward_join_24: {
    forward_join_20: {
    forward_join_16: {
    life1_3 = (com.moon.na.s ^ 10805455093022L);
    life3_5 = moom.lw.b__Arrayr3();
    spill1085_0 = p0;
    if (!((life3_5 == null))) {
        forwardValue1085_16_0 = spill1085_0;
        break forward_join_16;
    }
    if (!((spill1085_0 == __sourceIntrinsic_f3a7748b91d1_invokedynamic1085_2(29157, (2468450973347451705L ^ life1_3))))) {
        break forward_join_29;
    }
    forwardValue1085_16_0 = ((net.minecraft.client.gui.GuiScreen.b__BooleanStatic()) ? 1 : 0);
    }
    if (!((life3_5 == null))) {
        forwardValue1085_20_0 = forwardValue1085_16_0;
        break forward_join_20;
    }
    if (!((forwardValue1085_16_0 != 0))) {
        break forward_join_29;
    }
    forwardValue1085_20_0 = ((net.minecraft.client.gui.GuiScreen.c__Boolean()) ? 1 : 0);
    }
    if (!((life3_5 == null))) {
        forwardValue1085_24_0 = forwardValue1085_20_0;
        break forward_join_24;
    }
    if (!((forwardValue1085_20_0 == 0))) {
        break forward_join_29;
    }
    forwardValue1085_24_0 = ((net.minecraft.client.gui.GuiScreen.d__Boolean()) ? 1 : 0);
    }
    if (!((life3_5 == null))) {
        forwardValue1085_28_0 = forwardValue1085_24_0;
        break forward_join_28;
    }
    if (!((forwardValue1085_24_0 == 0))) {
        break forward_join_29;
    }
    forwardValue1085_28_0 = 1;
    }
    forwardValue1085_30_0 = forwardValue1085_28_0;
    break forward_join_30;
    }
    forwardValue1085_30_0 = 0;
    }
    return ((forwardValue1085_30_0) != 0);
}


public com.moon.setting.Setting a__sourceReturn_7d3c444d39() {
return this.n;
}


private static native <E extends Throwable> int __sourceIntrinsic_f7d59ba1def0_invokedynamic1084_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f7d59ba1def0_invokedynamic1084_11(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_f7d59ba1def0_invokedynamic1084_41(java.lang.String a0, char a1) throws E;

private static native <E extends Throwable> void __sourceIntrinsic_f7d59ba1def0_call1084_44(com.moon.na a0, char a1, int a2) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f3a7748b91d1_invokedynamic1085_2(int a0, long a1) throws E;

private static native <E extends Throwable> void __sourceIntrinsic_e4d4f5a69301_call1086_15(com.moon.na a0, int a1, int a2, int a3) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral2962_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_505b8c2844d4_invokedynamic1087_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_505b8c2844d4_invokedynamic1087_47(int a0, long a1) throws E;

private static native <E extends Throwable> void __sourceIntrinsic_505b8c2844d4_call1087_71(com.moon.na a0, int a1, int a2) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native int __sourceIntrinsic_booleanComparison(boolean value);

private static native int __sourceExactCall_9174b7470d7cad(int p0, long p1);
private static native boolean __sourceExactCall_c29b98e3de0c5c(int p0);
}
