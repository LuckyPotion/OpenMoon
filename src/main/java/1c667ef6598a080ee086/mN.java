package com.moon;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class mN extends com.moon.mA {

private final com.moon.k5 h;

private boolean s;

private boolean t;

private boolean u;

private long v;

private static boolean w;

private static final long x;

private static final long[] y;

private static final java.lang.Integer[] z;

private static final java.util.Map A;

private static final long B;

public mN(com.moon.k5 p0, float p1, float p2, float p3, float p4) {
super();
    this.h = p0;
    this.e = p1;
    this.f = p2;
    this.g = p3;
    this.i = p4;
}


static {
x = ((long)(((moom._a)(moom._c.a(((long)(-7400863570777129944L)), ((long)(-25733921906648951L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(106870006293536L)))));
    A = ((java.util.Map)(new java.util.HashMap(13)));
    int __sourceSpill245_7 = 0;
    long local5_life8 = (com.moon.mN.x ^ 125789479137608L);
    com.moon.mN.b(((boolean)__sourceIntrinsic_integerToBoolean((__sourceSpill245_7))));
    javax.crypto.Cipher local7_life11;
    javax.crypto.Cipher __sourceSpill245_13 = (local7_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill245_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill245_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill245_16 = new byte[8];
    (__sourceSpill245_16)[0] = ((byte) ((int) (local5_life8 >>> 56)));
    int local8_life17 = 1;
    while ((local8_life17 < 8)) {
        (__sourceSpill245_16)[local8_life17] = ((byte) ((int) ((local5_life8 << (local8_life17 * 8)) >>> 56)));
        local8_life17 += 1;
    }
    byte[] __sourcePreallocation245_18 = __sourceSpill245_16;
    ((javax.crypto.Cipher)(__sourceSpill245_13)).init(((int)(__sourceSpill245_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill245_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation245_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local13_life21 = new long[2];
    int local10_life22 = 0;
    java.lang.String local11_life23;
    int local12_life25 = ((java.lang.String)((local11_life23 = "¤<\"æ\b]·§|îÆ\030\002"))).length();
    int local9_life26 = 0;
    do {
        java.lang.String __sourceSpill245_27 = local11_life23;
        int __sourceSpill245_28 = local9_life26;
        local9_life26 += 8;
        byte[] local14_life31 = ((java.lang.String)(((java.lang.String)(__sourceSpill245_27)).substring(((int)(__sourceSpill245_28)), ((int)(local9_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill245_32 = local13_life21;
        int __sourceSpill245_33 = local10_life22;
        local10_life22 += 1;
        long local15_life34 = (((((((((((long) (local14_life31)[0]) & 255L) << 56) | ((((long) (local14_life31)[1]) & 255L) << 48)) | ((((long) (local14_life31)[2]) & 255L) << 40)) | ((((long) (local14_life31)[3]) & 255L) << 32)) | ((((long) (local14_life31)[4]) & 255L) << 24)) | ((((long) (local14_life31)[5]) & 255L) << 16)) | ((((long) (local14_life31)[6]) & 255L) << 8)) | (((long) (local14_life31)[7]) & 255L));
        byte[] __sourceSpill245_35 = new byte[8];
        (__sourceSpill245_35)[0] = ((byte) ((int) (local15_life34 >>> 56)));
        (__sourceSpill245_35)[1] = ((byte) ((int) (local15_life34 >>> 48)));
        (__sourceSpill245_35)[2] = ((byte) ((int) (local15_life34 >>> 40)));
        (__sourceSpill245_35)[3] = ((byte) ((int) (local15_life34 >>> 32)));
        (__sourceSpill245_35)[4] = ((byte) ((int) (local15_life34 >>> 24)));
        (__sourceSpill245_35)[5] = ((byte) ((int) (local15_life34 >>> 16)));
        (__sourceSpill245_35)[6] = ((byte) ((int) (local15_life34 >>> 8)));
        (__sourceSpill245_35)[7] = ((byte) ((int) local15_life34));
        javax.crypto.Cipher __sourceSpill245_36 = local7_life11;
        byte[] local17_life38 = ((javax.crypto.Cipher)(__sourceSpill245_36)).doFinal(((byte[])(__sourceSpill245_35)));
        (__sourceSpill245_32)[__sourceSpill245_33] = (((((((((((long) (local17_life38)[0]) & 255L) << 56) | ((((long) (local17_life38)[1]) & 255L) << 48)) | ((((long) (local17_life38)[2]) & 255L) << 40)) | ((((long) (local17_life38)[3]) & 255L) << 32)) | ((((long) (local17_life38)[4]) & 255L) << 24)) | ((((long) (local17_life38)[5]) & 255L) << 16)) | ((((long) (local17_life38)[6]) & 255L) << 8)) | (((long) (local17_life38)[7]) & 255L));
    } while ((!(local9_life26 >= local12_life25)));
    y = ((long[])(local13_life21));
    z = ((java.lang.Integer[])(new java.lang.Integer[2]));
    javax.crypto.Cipher local0_life42;
    javax.crypto.Cipher __sourceSpill245_44 = (local0_life42 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill245_45 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill245_46 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill245_47 = new byte[8];
    (__sourceSpill245_47)[0] = ((byte) ((int) (local5_life8 >>> 56)));
    int local1_life48 = 1;
    while ((local1_life48 < 8)) {
        (__sourceSpill245_47)[local1_life48] = ((byte) ((int) ((local5_life8 << (local1_life48 * 8)) >>> 56)));
        local1_life48 += 1;
    }
    byte[] __sourcePreallocation245_49 = __sourceSpill245_47;
    ((javax.crypto.Cipher)(__sourceSpill245_44)).init(((int)(__sourceSpill245_45)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill245_46)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation245_49)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local2_life52 = -2007429713918539713L;
    byte[] __sourceSpill245_53 = new byte[8];
    (__sourceSpill245_53)[0] = ((byte) ((int) (local2_life52 >>> 56)));
    (__sourceSpill245_53)[1] = ((byte) ((int) (local2_life52 >>> 48)));
    (__sourceSpill245_53)[2] = ((byte) ((int) (local2_life52 >>> 40)));
    (__sourceSpill245_53)[3] = ((byte) ((int) (local2_life52 >>> 32)));
    (__sourceSpill245_53)[4] = ((byte) ((int) (local2_life52 >>> 24)));
    (__sourceSpill245_53)[5] = ((byte) ((int) (local2_life52 >>> 16)));
    (__sourceSpill245_53)[6] = ((byte) ((int) (local2_life52 >>> 8)));
    (__sourceSpill245_53)[7] = ((byte) ((int) local2_life52));
    javax.crypto.Cipher __sourceSpill245_54 = local0_life42;
    byte[] local4_life56 = ((javax.crypto.Cipher)(__sourceSpill245_54)).doFinal(((byte[])(__sourceSpill245_53)));
    B = ((long)((((((((((((long) (local4_life56)[0]) & 255L) << 56) | ((((long) (local4_life56)[1]) & 255L) << 48)) | ((((long) (local4_life56)[2]) & 255L) << 40)) | ((((long) (local4_life56)[3]) & 255L) << 32)) | ((((long) (local4_life56)[4]) & 255L) << 24)) | ((((long) (local4_life56)[5]) & 255L) << 16)) | ((((long) (local4_life56)[6]) & 255L) << 8)) | (((long) (local4_life56)[7]) & 255L))));
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public static void b(boolean p0) {
w = ((boolean)(p0));
    return;
}


public static boolean e__Boolean() {
int local0 = __sourceIntrinsic_booleanToInteger(com.moon.mN.d__Boolean());
    if ((local0 == 0)) {
        return ((1) != 0);
    }
    return ((0) != 0);
}


private void e__sourceReturn_da8c82d5d4() {
int forwardValue736_121_0;
    int forwardValue736_130_0;
    com.moon.mN forwardValue736_138_0;
    int forwardValue736_138_1;
    com.moon.mN forwardValue736_139_0;
    com.moon.mN forwardValue736_140_0;
    int forwardValue736_140_1;
    int forwardValue736_176_0;
    boolean spill736_0;
    boolean spill736_1;
    com.moon.mN spill736_2;
    boolean spill736_3;
    int spill736_4;
    long life1_3;
    com.moon.jC life4_13;
    com.moon.hW life5_18;
    float life6_23;
    float life7_33;
    int life3_34;
    float life8_80;
    float life9_88;
    float life8_162;
    float life9_174;
    float life10_178;
    forward_join_204: {
    forward_join_176: {
    forward_join_174: {
    forward_join_144: {
    forward_join_140: {
    forward_join_139: {
    forward_join_138: {
    forward_join_130: {
    forward_join_121: {
    forward_join_119: {
    life1_3 = (com.moon.mN.x ^ 124219203430388L);
    life4_13 = com.moon.jC.a(((float)(this.l)), ((float)(this.m)), ((float)(this.n)), ((float)(this.o)));
    life5_18 = ((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.ROUNDED_RECTANGLE))))).a();
    life6_23 = ((com.moon.jm)(this.a)).a(((float)(0x1.c428f6p2f)));
    spill736_0 = com.moon.mN.d__Boolean();
    life7_33 = ((com.moon.jm)(this.a)).a(((java.lang.String)(((java.lang.String)(((com.moon.k5)(this.h)).getValue())))), ((float)(0x1.0147acp3f)));
    life3_34 = ((spill736_0) ? 1 : 0);
    ((com.moon.hW)(life5_18)).a(((com.moon.iX)(com.moon.i3.a(((float)((this.e + this.k))), ((float)(((((com.moon.mN)(this)).a() + life6_23) + 0x1.0p1f))), ((float)((this.g - (this.k * 0x1.0p1f)))), ((float)(0x1.4p4f)), ((float)(0x1.4p2f)), ((int)(((com.v)(this.p)).u()))))));
    spill736_1 = this.u;
    if (!((life3_34 == 0))) {
        forwardValue736_121_0 = ((spill736_1) ? 1 : 0);
        break forward_join_121;
    }
    if (!(spill736_1)) {
        break forward_join_119;
    }
    life8_80 = (((this.g - (this.k * 0x1.0p1f)) - 0x1.0p1f) - 0x1.8p0f);
    life9_88 = (java.lang.Math.min(((float)((life7_33 + 0x1.0p2f))), ((float)(life8_80))) - 0x1.0p1f);
    ((com.moon.hW)(life5_18)).a(((com.moon.iX)(com.moon.i3.a(((float)(((this.e + this.k) + 0x1.0p1f))), ((float)(((((com.moon.mN)(this)).a() + life6_23) + 0x1.ap2f))), ((float)(life9_88)), ((float)((((com.moon.jm)(this.a)).a(((float)(0x1.0147acp3f))) + 0x1.0p-1f))), ((float)(0x0.0p0f)), ((int)(((com.moon.aO)(((com.moon.aO)(new com.moon.aO(((com.v)(this.p)).v()))).a(((float)(0x1.99999ap-3f))))).getRGB()))))));
    }
    forwardValue736_121_0 = ((this.s) ? 1 : 0);
    }
    if (!((life3_34 == 0))) {
        forwardValue736_130_0 = forwardValue736_121_0;
        break forward_join_130;
    }
    if (!((forwardValue736_121_0 != 0))) {
        break forward_join_204;
    }
    forwardValue736_130_0 = recovery.source.CarrierOps.lcmp(((long)((java.lang.System.currentTimeMillis() - this.v))), ((long)(com.moon.mN.B)));
    }
    if (!((forwardValue736_130_0 > 0))) {
        break forward_join_144;
    }
    spill736_2 = this;
    spill736_3 = this.t;
    if (!((life3_34 == 0))) {
        forwardValue736_138_0 = spill736_2;
        forwardValue736_138_1 = ((spill736_3) ? 1 : 0);
        break forward_join_138;
    }
    if (!((!spill736_3))) {
        forwardValue736_139_0 = spill736_2;
        break forward_join_139;
    }
    forwardValue736_138_0 = spill736_2;
    forwardValue736_138_1 = 1;
    }
    forwardValue736_140_0 = forwardValue736_138_0;
    forwardValue736_140_1 = forwardValue736_138_1;
    break forward_join_140;
    }
    forwardValue736_140_0 = forwardValue736_139_0;
    forwardValue736_140_1 = 0;
    }
    ((com.moon.mN)(forwardValue736_140_0)).t = ((boolean)__sourceIntrinsic_integerToBoolean((forwardValue736_140_1)));
    this.v = ((long)(java.lang.System.currentTimeMillis()));
    }
    life8_162 = (life7_33 + 0x1.8p1f);
    life9_174 = (((this.g - (this.k * 0x1.0p1f)) - 0x1.0p3f) - 0x1.8p0f);
    life10_178 = (life7_33 - life9_174);
    spill736_4 = recovery.source.CarrierOps.fcmpl(((float)(life10_178)), ((float)(0x0.0p0f)));
    if (!((life3_34 == 0))) {
        forwardValue736_176_0 = spill736_4;
        break forward_join_176;
    }
    if (!((spill736_4 > 0))) {
        break forward_join_174;
    }
    life8_162 = (life8_162 - life10_178);
    }
    forwardValue736_176_0 = ((this.t) ? 1 : 0);
    }
    if (!((forwardValue736_176_0 != 0))) {
        break forward_join_204;
    }
    ((com.moon.hW)(life5_18)).a(((com.moon.iX)(com.moon.i3.a(((float)(((this.e + this.k) + life8_162))), ((float)(((((com.moon.mN)(this)).a() + life6_23) + 0x1.ap2f))), ((float)(0x1.0p1f)), ((float)((((com.moon.jm)(this.a)).a(((float)(0x1.0147acp3f))) + 0x1.0p-1f))), ((float)(0x0.0p0f)), ((int)(((com.v)(this.p)).v()))))));
    }
    ((com.moon.hW)(life5_18)).a(((com.moon.jA)(life4_13)));
    ((com.moon.hW)(life5_18)).b();
    return;
}


private void f__sourceReturn_da8c82d5d4() {
com.moon.jm forwardValue737_78_0;
    com.moon.hW forwardValue737_78_1;
    java.lang.String forwardValue737_78_2;
    float forwardValue737_78_3;
    float forwardValue737_78_4;
    float forwardValue737_78_5;
    com.moon.jm forwardValue737_79_0;
    com.moon.hW forwardValue737_79_1;
    java.lang.String forwardValue737_79_2;
    float forwardValue737_79_3;
    float forwardValue737_79_4;
    com.moon.jm forwardValue737_80_0;
    com.moon.hW forwardValue737_80_1;
    java.lang.String forwardValue737_80_2;
    float forwardValue737_80_3;
    float forwardValue737_80_4;
    float forwardValue737_80_5;
    boolean spill737_0;
    com.moon.jm spill737_1;
    com.moon.hW spill737_2;
    java.lang.String spill737_3;
    float spill737_4;
    float spill737_5;
    float spill737_6;
    long life1_3;
    com.moon.jC life4_21;
    com.moon.hW life5_30;
    float life6_42;
    float life7_53;
    int life3_54;
    forward_join_80: {
    forward_join_79: {
    forward_join_78: {
    life1_3 = (com.moon.mN.x ^ 53332435013055L);
    life4_21 = com.moon.jC.a(((float)(java.lang.Math.max(((float)(this.l)), ((float)(((this.e + this.k) + 0x1.2p2f)))))), ((float)(this.m)), ((float)(this.n)), ((float)(this.o)));
    spill737_0 = com.moon.mN.d__Boolean();
    life5_30 = ((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.MSDF))))).a(((com.moon.jm)(this.a))))).a();
    life6_42 = (((this.g - (this.k * 0x1.0p1f)) - 0x1.0p3f) - 0x1.8p0f);
    life7_53 = (((com.moon.jm)(this.a)).a(((java.lang.String)(((java.lang.String)(((com.moon.k5)(this.h)).getValue())))), ((float)(0x1.0147acp3f))) - life6_42);
    life3_54 = ((spill737_0) ? 1 : 0);
    spill737_1 = this.a;
    spill737_2 = life5_30;
    spill737_3 = ((java.lang.String)(((com.moon.k5)(this.h)).getValue()));
    spill737_4 = 0x1.0147acp3f;
    spill737_5 = ((((com.moon.mN)(this)).b() + this.k) + 0x1.2p2f);
    spill737_6 = life7_53;
    if (!((life3_54 == 0))) {
        forwardValue737_78_0 = spill737_1;
        forwardValue737_78_1 = spill737_2;
        forwardValue737_78_2 = spill737_3;
        forwardValue737_78_3 = spill737_4;
        forwardValue737_78_4 = spill737_5;
        forwardValue737_78_5 = spill737_6;
        break forward_join_78;
    }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(spill737_6)), ((float)(0x0.0p0f))) > 0))) {
        forwardValue737_79_0 = spill737_1;
        forwardValue737_79_1 = spill737_2;
        forwardValue737_79_2 = spill737_3;
        forwardValue737_79_3 = spill737_4;
        forwardValue737_79_4 = spill737_5;
        break forward_join_79;
    }
    forwardValue737_78_0 = spill737_1;
    forwardValue737_78_1 = spill737_2;
    forwardValue737_78_2 = spill737_3;
    forwardValue737_78_3 = spill737_4;
    forwardValue737_78_4 = spill737_5;
    forwardValue737_78_5 = (-life7_53);
    }
    forwardValue737_80_0 = forwardValue737_78_0;
    forwardValue737_80_1 = forwardValue737_78_1;
    forwardValue737_80_2 = forwardValue737_78_2;
    forwardValue737_80_3 = forwardValue737_78_3;
    forwardValue737_80_4 = forwardValue737_78_4;
    forwardValue737_80_5 = forwardValue737_78_5;
    break forward_join_80;
    }
    forwardValue737_80_0 = forwardValue737_79_0;
    forwardValue737_80_1 = forwardValue737_79_1;
    forwardValue737_80_2 = forwardValue737_79_2;
    forwardValue737_80_3 = forwardValue737_79_3;
    forwardValue737_80_4 = forwardValue737_79_4;
    forwardValue737_80_5 = 0x0.0p0f;
    }
    ((com.moon.jm)(forwardValue737_80_0)).b(((com.moon.hW)(forwardValue737_80_1)), ((java.lang.String)(forwardValue737_80_2)), ((float)(forwardValue737_80_3)), ((float)((forwardValue737_80_4 + forwardValue737_80_5))), ((float)(((((com.moon.mN)(this)).a() + ((com.moon.jm)(this.a)).a(((float)(0x1.0p3f)))) + 0x1.ap2f))), ((int)(((com.v)(this.p)).v())));
    ((com.moon.hW)(life5_30)).a(((com.moon.jA)(life4_21)));
    ((com.moon.hW)(life5_30)).b();
    return;
}


public static boolean d__Boolean() {
return ((((com.moon.mN.w) ? 1 : 0)) != 0);
}


private void d__sourceReturn_da8c82d5d4() {
java.lang.Object local1 = com.moon.jC.a(((float)(this.l)), ((float)(this.m)), ((float)(this.n)), ((float)(this.o)));
    java.lang.Object local2 = ((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.MSDF))))).a(((com.moon.jm)(this.a))))).a();
    ((com.moon.jm)(this.a)).b(((com.moon.hW)(local2)), ((java.lang.String)(((com.moon.k5)(this.h)).getDisplayName())), ((float)(0x1.c428f6p2f)), ((float)(((((com.moon.mN)(this)).b() + this.k) + 0x1.0p0f))), ((float)(((com.moon.mN)(this)).a())), ((int)(((com.v)(this.p)).v())));
    ((com.moon.hW)(local2)).a(((com.moon.jA)(local1)));
    ((com.moon.hW)(local2)).b();
    return;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_71b9505b5846cc(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int n6 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x38AF;
        if (z[n6] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l3 = y[n6];
            byte[] byArray3 = new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3};
            Long l4 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])A.get(l4);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    A.put(l4, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/moon/mN", exception);
            }
            int n7 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            mN.z[n6] = n7;
        }
        return z[n6];
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral2238_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/mN"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(int p0, int p1) {
((com.moon.mN)(this)).c__Void();
    ((com.moon.mN)(this)).d__sourceReturn_da8c82d5d4();
    ((com.moon.mN)(this)).e__sourceReturn_da8c82d5d4();
    ((com.moon.mN)(this)).f__sourceReturn_da8c82d5d4();
    this.j = ((float)(0x1.0p5f));
    super.a(((int)(p0)), ((int)(p1)));
    return;
}


public boolean a__Boolean(int p0, int p1, int p2) {
this.s = ((boolean)(((com.moon.mN)(this)).a(((int)(p0)), ((int)(p1)), ((float)((this.e + this.k))), ((float)(((((com.moon.mN)(this)).a() + ((com.moon.jm)(this.a)).a(((float)(0x1.c428f6p2f)))) + 0x1.0p1f))), ((float)((this.g - (this.k * 0x1.0p1f)))), ((float)(0x1.4p4f)))));
    return (__sourceIntrinsic_booleanComparison((super.a__Boolean(((int)(p0)), ((int)(p1)), ((int)(p2))))) != 0);
}


public void a(char p0, int p1) {
int forwardValue734_23_0;
    int forwardValue734_40_0;
    com.moon.k5 forwardValue734_50_0;
    com.moon.k5 forwardValue734_53_0;
    java.lang.Object forwardValue734_53_1;
    com.moon.k5 forwardValue734_65_0;
    java.lang.String forwardValue734_65_1;
    int forwardValue734_72_0;
    com.moon.mN forwardValue734_88_0;
    int forwardValue734_97_0;
    com.moon.mN forwardValue734_99_0;
    com.moon.mN spill734_0;
    boolean spill734_1;
    boolean spill734_2;
    com.moon.k5 spill734_3;
    com.moon.mN spill734_4;
    com.moon.mN spill734_5;
    long life3_3;
    int life5_5;
    forward_join_99: {
    forward_join_98: {
    forward_join_97: {
    forward_join_96: {
    forward_join_88: {
    forward_join_87: {
    forward_join_72: {
    forward_join_70: {
    forward_join_69: {
    forward_join_65: {
    forward_join_53: {
    forward_join_50: {
    forward_join_40: {
    forward_join_23: {
    forward_join_22: {
    life3_3 = (com.moon.mN.x ^ 116211819795711L);
    life5_5 = ((com.moon.mN.d__Boolean()) ? 1 : 0);
    spill734_0 = this;
    if (!((life5_5 == 0))) {
        forwardValue734_99_0 = spill734_0;
        break forward_join_99;
    }
    if (!(((com.moon.mN)(spill734_0)).s)) {
        break forward_join_98;
    }
    spill734_1 = __sourceExactCall_82b03e1268f439(((int)(p1)));
    if (!((life5_5 == 0))) {
        forwardValue734_23_0 = ((spill734_1) ? 1 : 0);
        break forward_join_23;
    }
    if (!(spill734_1)) {
        break forward_join_22;
    }
    org.lwjgl.input.Keyboard.enableRepeatEvents(((boolean)(false)));
    this.u = ((boolean)(true));
    return;
    }
    forwardValue734_23_0 = p1;
    }
    if (!((life5_5 == 0))) {
        forwardValue734_72_0 = forwardValue734_23_0;
        break forward_join_72;
    }
    if (!((forwardValue734_23_0 == __sourceIntrinsic_f7d59ba1def0_invokedynamic734_8(5977, (2693493085554441491L ^ life3_3))))) {
        break forward_join_70;
    }
    spill734_2 = ((java.lang.String)(((java.lang.String)(((com.moon.k5)(this.h)).getValue())))).isEmpty();
    if (!((life5_5 == 0))) {
        forwardValue734_40_0 = ((spill734_2) ? 1 : 0);
        break forward_join_40;
    }
    if (!((!spill734_2))) {
        break forward_join_69;
    }
    forwardValue734_40_0 = 1;
    }
    org.lwjgl.input.Keyboard.enableRepeatEvents(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue734_40_0))));
    spill734_3 = this.h;
    spill734_4 = this;
    if (!((life5_5 == 0))) {
        forwardValue734_53_0 = spill734_3;
        forwardValue734_53_1 = spill734_4;
        break forward_join_53;
    }
    if (!(((com.moon.mN)(spill734_4)).u)) {
        forwardValue734_50_0 = spill734_3;
        break forward_join_50;
    }
    forwardValue734_65_0 = spill734_3;
    forwardValue734_65_1 = "";
    break forward_join_65;
    }
    forwardValue734_53_0 = forwardValue734_50_0;
    forwardValue734_53_1 = ((com.moon.k5)(this.h)).getValue();
    }
    forwardValue734_65_0 = forwardValue734_53_0;
    forwardValue734_65_1 = ((java.lang.String)(((java.lang.String)(forwardValue734_53_1)))).substring(((int)(0)), ((int)(java.lang.Math.max(((int)((((java.lang.String)(((java.lang.String)(((com.moon.k5)(this.h)).getValue())))).length() - 1))), ((int)(0))))));
    }
    ((com.moon.k5)(forwardValue734_65_0)).setValue(((forwardValue734_65_1)));
    this.u = ((boolean)(false));
    }
    return;
    }
    forwardValue734_72_0 = ((moom.CH.a(((char)(p0)))) ? 1 : 0);
    }
    if (!((life5_5 == 0))) {
        forwardValue734_97_0 = forwardValue734_72_0;
        break forward_join_97;
    }
    if (!((forwardValue734_72_0 != 0))) {
        break forward_join_96;
    }
    spill734_5 = this;
    if (!((life5_5 == 0))) {
        forwardValue734_88_0 = spill734_5;
        break forward_join_88;
    }
    if (!(((com.moon.mN)(spill734_5)).u)) {
        break forward_join_87;
    }
    ((com.moon.k5)(this.h)).setValue((("")));
    this.u = ((boolean)(false));
    }
    forwardValue734_88_0 = this;
    }
    ((com.moon.k5)(((com.moon.mN)(forwardValue734_88_0)).h)).setValue(((__sourceIntrinsic_f7d59ba1def0_invokedynamic734_38(((java.lang.String)(((com.moon.k5)(this.h)).getValue())), p0))));
    }
    forwardValue734_97_0 = 0;
    }
    org.lwjgl.input.Keyboard.enableRepeatEvents(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue734_97_0))));
    }
    forwardValue734_99_0 = this;
    }
    __sourceIntrinsic_f7d59ba1def0_call734_41(forwardValue734_99_0, p0, p1);
    return;
}


public static boolean a(int p0) {
int forwardValue735_16_0;
    int forwardValue735_20_0;
    int forwardValue735_24_0;
    int forwardValue735_28_0;
    int forwardValue735_30_0;
    int spill735_0;
    long life1_3;
    int life3_5;
    forward_join_30: {
    forward_join_29: {
    forward_join_28: {
    forward_join_24: {
    forward_join_20: {
    forward_join_16: {
    life1_3 = (com.moon.mN.x ^ 122975861438678L);
    life3_5 = ((com.moon.mN.e__Boolean()) ? 1 : 0);
    spill735_0 = p0;
    if (!((life3_5 != 0))) {
        forwardValue735_16_0 = spill735_0;
        break forward_join_16;
    }
    if (!((spill735_0 == __sourceIntrinsic_f3a7748b91d1_invokedynamic735_3(17679, (7826611915931517805L ^ life1_3))))) {
        break forward_join_29;
    }
    forwardValue735_16_0 = ((net.minecraft.client.gui.GuiScreen.b__BooleanStatic()) ? 1 : 0);
    }
    if (!((life3_5 != 0))) {
        forwardValue735_20_0 = forwardValue735_16_0;
        break forward_join_20;
    }
    if (!((forwardValue735_16_0 != 0))) {
        break forward_join_29;
    }
    forwardValue735_20_0 = ((net.minecraft.client.gui.GuiScreen.c__Boolean()) ? 1 : 0);
    }
    if (!((life3_5 != 0))) {
        forwardValue735_24_0 = forwardValue735_20_0;
        break forward_join_24;
    }
    if (!((forwardValue735_20_0 == 0))) {
        break forward_join_29;
    }
    forwardValue735_24_0 = ((net.minecraft.client.gui.GuiScreen.d__Boolean()) ? 1 : 0);
    }
    if (!((life3_5 != 0))) {
        forwardValue735_28_0 = forwardValue735_24_0;
        break forward_join_28;
    }
    if (!((forwardValue735_24_0 == 0))) {
        break forward_join_29;
    }
    forwardValue735_28_0 = 1;
    }
    forwardValue735_30_0 = forwardValue735_28_0;
    break forward_join_30;
    }
    forwardValue735_30_0 = 0;
    }
    return ((forwardValue735_30_0) != 0);
}


public boolean a__Boolean() {
return (__sourceIntrinsic_booleanComparison((((com.moon.k5)(this.h)).isAvailable())) != 0);
}


private static native <E extends Throwable> int __sourceIntrinsic_f7d59ba1def0_invokedynamic734_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_f7d59ba1def0_invokedynamic734_38(java.lang.String a0, char a1) throws E;

private static native <E extends Throwable> void __sourceIntrinsic_f7d59ba1def0_call734_41(com.moon.mN a0, char a1, int a2) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f3a7748b91d1_invokedynamic735_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral2238_0() throws E;

private static native int __sourceIntrinsic_booleanToInteger(boolean value);
private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native int __sourceIntrinsic_booleanComparison(boolean value);

private static native int __sourceExactCall_71b9505b5846cc(int p0, long p1);
private static native boolean __sourceExactCall_82b03e1268f439(int p0);
}
