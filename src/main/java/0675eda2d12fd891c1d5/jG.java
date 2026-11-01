package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class jG {

public moom.jE[] a;

public int b;

private boolean c;

private com.moon.module.impl.Camera d;

private static final long e;

private static final long[] f;

private static final java.lang.Integer[] g;

private static final java.util.Map h;

public jG(moom.jE[] p0) {
super();
    this.a = p0;
    this.b = (p0).length;
}


public jG(moom.jE[] p0, int p1, int p2, int p3, int p4, float p5, float p6) {
this(p0);
    float local8 = (0x0.0p0f / p5);
    float local9 = (0x0.0p0f / p6);
    (p0)[0] = ((moom.jE)((p0)[0])).a(((float)(((((float) p3) / p5) - local8))), ((float)(((((float) p2) / p6) + local9))));
    (p0)[1] = ((moom.jE)((p0)[1])).a(((float)(((((float) p1) / p5) + local8))), ((float)(((((float) p2) / p6) + local9))));
    (p0)[2] = ((moom.jE)((p0)[2])).a(((float)(((((float) p1) / p5) + local8))), ((float)(((((float) p4) / p6) - local9))));
    (p0)[3] = ((moom.jE)((p0)[3])).a(((float)(((((float) p3) / p5) - local8))), ((float)(((((float) p4) / p6) - local9))));
    return;
}


static {
e = ((long)(((moom._a)(moom._c.a(((long)(3806579657700715384L)), ((long)(-3520268741848273604L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(92729235655916L)))));
    h = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.jG.e ^ 115183776766502L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill890_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill890_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill890_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill890_14 = new byte[8];
    (__sourceSpill890_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill890_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation890_16 = __sourceSpill890_14;
    ((javax.crypto.Cipher)(__sourceSpill890_11)).init(((int)(__sourceSpill890_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill890_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation890_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "ÿ\003ó\025~®öµ·Ì$"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill890_25 = local6_life21;
        int __sourceSpill890_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill890_25)).substring(((int)(__sourceSpill890_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill890_30 = local8_life19;
        int __sourceSpill890_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill890_33 = new byte[8];
        (__sourceSpill890_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill890_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill890_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill890_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill890_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill890_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill890_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill890_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill890_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill890_34)).doFinal(((byte[])(__sourceSpill890_33)));
        (__sourceSpill890_30)[__sourceSpill890_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    f = ((long[])(local8_life19));
    g = ((java.lang.Integer[])(new java.lang.Integer[2]));
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral8107_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/jG"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.jG.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int n4 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x5701;
        if (g[n4] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = f[n4];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])h.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    h.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/jG", exception);
            }
            int n6 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            jG.g[n4] = n6;
        }
        return g[n4];
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a() {
long local1 = (moom.jG.e ^ 29923060859397L);
    moom.jE[] local3 = new moom.jE[(this.a).length];
    int local4 = 0;
    while ((local4 < (this.a).length)) {
        (local3)[local4] = (this.a)[(((this.a).length - local4) - 1)];
        local4 += 1;
    }
    this.a = ((moom.jE[])(local3));
    return;
}


public void a(moom.lw p0, float p1) {
moom.jG lexicalValue1213_19_0;
    int lexicalValue1213_76_0;
    int lexicalValue1213_89_0;
    int lexicalValue1213_109_0;
    int lexicalValue1213_167_0;
    moom.jG spill1213_0;
    boolean spill1213_1;
    boolean spill1213_2;
    boolean spill1213_3;
    long life3_3;
    net.minecraft.entity.Entity[] life5_5;
    moom.DR life6_35;
    moom.DR life7_47;
    moom.DR life8_52;
    float life9_56;
    float life10_60;
    float life11_64;
    int life12_133;
    moom.jE life13_141;
    lexical_join_170: {
    lexical_join_168: {
    lexical_join_167: {
    lexical_join_155: {
    lexical_join_109: {
    lexical_join_108: {
    lexical_join_100: {
    lexical_join_89: {
    lexical_join_88: {
    lexical_join_76: {
    lexical_join_73: {
    lexical_join_19: {
    lexical_join_18: {
    life3_3 = (moom.jG.e ^ 115559911167791L);
    life5_5 = moom.iQ.b();
    spill1213_0 = this;
    if (!((life5_5 != null))) {
        lexicalValue1213_19_0 = spill1213_0;
        break lexical_join_19;
    }
    if (!((((moom.jG)(spill1213_0)).d == null))) {
        break lexical_join_18;
    }
    this.d = ((com.moon.module.impl.Camera)(((com.moon.module.impl.Camera)(((com.moon.fU)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__fU())).a(((java.lang.Class)(com.moon.module.impl.Camera.class)))))));
    }
    lexicalValue1213_19_0 = this;
    }
    life6_35 = ((moom.DR)(((moom.jE)((((moom.jG)(lexicalValue1213_19_0)).a)[1])).a)).a__DR(((moom.DR)(((moom.jE)((this.a)[0])).a)));
    life7_47 = ((moom.DR)(((moom.jE)((this.a)[1])).a)).a__DR(((moom.DR)(((moom.jE)((this.a)[2])).a)));
    life8_52 = ((moom.DR)(((moom.DR)(life7_47)).b__DR(((moom.DR)(life6_35))))).a__DR();
    life9_56 = ((float) ((moom.DR)(life8_52)).a);
    life10_60 = ((float) ((moom.DR)(life8_52)).b);
    life11_64 = ((float) ((moom.DR)(life8_52)).c);
    spill1213_1 = this.c;
    if (!((life5_5 != null))) {
        lexicalValue1213_76_0 = ((spill1213_1) ? 1 : 0);
        break lexical_join_76;
    }
    if (!(spill1213_1)) {
        break lexical_join_73;
    }
    life9_56 = (-life9_56);
    life10_60 = (-life10_60);
    life11_64 = (-life11_64);
    }
    lexicalValue1213_76_0 = ((((com.moon.module.impl.Camera)(this.d)).isEnabled()) ? 1 : 0);
    }
    if (!((life5_5 != null))) {
        lexicalValue1213_89_0 = lexicalValue1213_76_0;
        break lexical_join_89;
    }
    if (!((lexicalValue1213_76_0 != 0))) {
        break lexical_join_88;
    }
    spill1213_2 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.Camera)(this.d)).u)).getValue())))).booleanValue();
    if (!((life5_5 != null))) {
        lexicalValue1213_109_0 = ((spill1213_2) ? 1 : 0);
        break lexical_join_109;
    }
    if (!((!spill1213_2))) {
        break lexical_join_108;
    }
    }
    lexicalValue1213_89_0 = ((moom.BU.ap()) ? 1 : 0);
    }
    if (!((lexicalValue1213_89_0 != 0))) {
        break lexical_join_100;
    }
    ((moom.lw)(p0)).a(((int)(__sourceIntrinsic_285e46f00d75_invokedynamic1213_37(7701, (39805257700977765L ^ life3_3)))), ((moom.oD)(moom.MI.a)));
    if (!((life5_5 == null))) {
        break lexical_join_108;
    }
    }
    ((moom.lw)(p0)).a(((int)(__sourceIntrinsic_285e46f00d75_invokedynamic1213_40(20114, (3747358911266290915L ^ life3_3)))), ((moom.oD)(moom.oB.e)));
    }
    lexicalValue1213_109_0 = 0;
    }
    life12_133 = lexicalValue1213_109_0;
    lexical_cycle_110: while (true) {
    if (!((life12_133 < 4))) {
        break lexical_join_155;
    }
    life13_141 = (this.a)[life12_133];
    ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(p0)).a(((double)((((moom.DR)(((moom.jE)(life13_141)).a)).a * ((double) p1)))), ((double)((((moom.DR)(((moom.jE)(life13_141)).a)).b * ((double) p1)))), ((double)((((moom.DR)(((moom.jE)(life13_141)).a)).c * ((double) p1))))))).a(((double)(((double) ((moom.jE)(life13_141)).b))), ((double)(((double) ((moom.jE)(life13_141)).c)))))).a(((float)(life9_56)), ((float)(life10_60)), ((float)(life11_64))))).c__Void();
    life12_133 += 1;
    if (!((life5_5 != null))) {
        break lexical_join_168;
    }
    if (!((life5_5 == null))) { continue lexical_cycle_110; }
    break lexical_cycle_110;
    }
    }
    spill1213_3 = ((com.moon.module.impl.Camera)(this.d)).isEnabled();
    if (!((life5_5 != null))) {
        lexicalValue1213_167_0 = ((spill1213_3) ? 1 : 0);
        break lexical_join_167;
    }
    if (!(spill1213_3)) {
        break lexical_join_168;
    }
    lexicalValue1213_167_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.Camera)(this.d)).u)).getValue())))).booleanValue()) ? 1 : 0);
    }
    if (!((lexicalValue1213_167_0 == 0))) {
        break lexical_join_170;
    }
    }
    ((net.minecraft.client.renderer.Tessellator)(net.minecraft.client.renderer.Tessellator.a())).a__Void();
    }
    return;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral8107_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_285e46f00d75_invokedynamic1213_37(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_285e46f00d75_invokedynamic1213_40(int a0, long a1) throws E;
}
