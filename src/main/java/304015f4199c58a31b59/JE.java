package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class JE {

private net.minecraft.entity.Entity a;

private double b;

private double c;

private double d;

private double e;

private int f;

private boolean g;

private long h;

private java.util.Set<moom.DT> i;

private final moom.DU j;

private static final long k;

private static final java.lang.String[] l;

private static final java.lang.String[] m;

private static final java.util.Map n;

private static final long[] o;

private static final java.lang.Integer[] p;

private static final java.util.Map q;

private static final long r;

public JE(net.minecraft.entity.Entity p0) {
super();
    this.a = null;
    this.b = 0x0.0p+0d;
    this.c = -0x1.0000000000000p+31d;
    this.d = -0x1.0000000000000p+31d;
    this.e = -0x1.0000000000000p+31d;
    this.f = 0;
    this.g = false;
    this.h = 0L;
    this.i = new java.util.HashSet();
    this.j = new moom.DU();
    this.a = p0;
    this.b = ((double) ((p0).e__Float()));
}


static {
k = ((long)(((moom._a)(moom._c.a(((long)(-1443946995267712128L)), ((long)(7512872945054486929L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(194551822964818L)))));
    n = ((java.util.Map)(new java.util.HashMap(13)));
    long local16_life7 = (moom.JE.k ^ 32894366602302L);
    javax.crypto.Cipher local18_life9;
    javax.crypto.Cipher __sourceSpill593_11 = (local18_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill593_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill593_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill593_14 = new byte[8];
    (__sourceSpill593_14)[0] = ((byte) ((int) (local16_life7 >>> 56)));
    int local19_life15 = 1;
    while ((local19_life15 < 8)) {
        (__sourceSpill593_14)[local19_life15] = ((byte) ((int) ((local16_life7 << (local19_life15 * 8)) >>> 56)));
        local19_life15 += 1;
    }
    byte[] __sourcePreallocation593_16 = __sourceSpill593_14;
    ((javax.crypto.Cipher)(__sourceSpill593_11)).init(((int)(__sourceSpill593_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill593_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation593_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local25_life19 = new java.lang.String[2];
    int local23_life20 = 0;
    java.lang.String local22_life21;
    int local24_life23 = ((java.lang.String)((local22_life21 = "ôÀ]w«\000¨e$í\0071Ðë²\031 .u.\0300ðkÏ\030\nçÜp¶\n\033üªôÁ@Ý)ï<|"))).length();
    int local21_life24 = 24;
    int local20_life25 = -1;
    while (true) {
        local20_life25 += 1;
        byte[] __sourceSpill593_28 = ((java.lang.String)(((java.lang.String)(local22_life21)).substring(((int)(local20_life25)), ((int)((local20_life25 + local21_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill593_29 = local18_life9;
        byte[] local26_life31 = ((javax.crypto.Cipher)(__sourceSpill593_29)).doFinal(((byte[])(__sourceSpill593_28)));
        java.lang.String __sourceSpill593_34 = ((java.lang.String)(moom.JE.a(((byte[])(local26_life31))))).intern();
        java.lang.String[] __sourceSpill593_35 = local25_life19;
        int __sourceSpill593_36 = local23_life20;
        local23_life20 += 1;
        (__sourceSpill593_35)[__sourceSpill593_36] = __sourceSpill593_34;
        if (!(((local20_life25 = (local20_life25 + local21_life24)) < local24_life23))) { break; }
        local21_life24 = ((java.lang.String)(local22_life21)).charAt(((int)(local20_life25)));
    }
    l = ((java.lang.String[])(local25_life19));
    m = ((java.lang.String[])(new java.lang.String[2]));
    q = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local5_life42;
    javax.crypto.Cipher __sourceSpill593_44 = (local5_life42 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill593_45 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill593_46 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill593_47 = new byte[8];
    (__sourceSpill593_47)[0] = ((byte) ((int) (local16_life7 >>> 56)));
    int local6_life48 = 1;
    while ((local6_life48 < 8)) {
        (__sourceSpill593_47)[local6_life48] = ((byte) ((int) ((local16_life7 << (local6_life48 * 8)) >>> 56)));
        local6_life48 += 1;
    }
    byte[] __sourcePreallocation593_49 = __sourceSpill593_47;
    ((javax.crypto.Cipher)(__sourceSpill593_44)).init(((int)(__sourceSpill593_45)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill593_46)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation593_49)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local11_life52 = new long[5];
    int local8_life53 = 0;
    java.lang.String local9_life54;
    int local10_life56 = ((java.lang.String)((local9_life54 = "í&oùÜ]6²]\021u\\\016xSÖ6<BÒ"))).length();
    int local7_life57 = 0;
    do {
        java.lang.String __sourceSpill593_58 = local9_life54;
        int __sourceSpill593_59 = local7_life57;
        local7_life57 += 8;
        byte[] local12_life62 = ((java.lang.String)(((java.lang.String)(__sourceSpill593_58)).substring(((int)(__sourceSpill593_59)), ((int)(local7_life57))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill593_63 = local11_life52;
        int __sourceSpill593_64 = local8_life53;
        local8_life53 += 1;
        long local13_life65 = (((((((((((long) (local12_life62)[0]) & 255L) << 56) | ((((long) (local12_life62)[1]) & 255L) << 48)) | ((((long) (local12_life62)[2]) & 255L) << 40)) | ((((long) (local12_life62)[3]) & 255L) << 32)) | ((((long) (local12_life62)[4]) & 255L) << 24)) | ((((long) (local12_life62)[5]) & 255L) << 16)) | ((((long) (local12_life62)[6]) & 255L) << 8)) | (((long) (local12_life62)[7]) & 255L));
        byte[] __sourceSpill593_66 = new byte[8];
        (__sourceSpill593_66)[0] = ((byte) ((int) (local13_life65 >>> 56)));
        (__sourceSpill593_66)[1] = ((byte) ((int) (local13_life65 >>> 48)));
        (__sourceSpill593_66)[2] = ((byte) ((int) (local13_life65 >>> 40)));
        (__sourceSpill593_66)[3] = ((byte) ((int) (local13_life65 >>> 32)));
        (__sourceSpill593_66)[4] = ((byte) ((int) (local13_life65 >>> 24)));
        (__sourceSpill593_66)[5] = ((byte) ((int) (local13_life65 >>> 16)));
        (__sourceSpill593_66)[6] = ((byte) ((int) (local13_life65 >>> 8)));
        (__sourceSpill593_66)[7] = ((byte) ((int) local13_life65));
        javax.crypto.Cipher __sourceSpill593_67 = local5_life42;
        byte[] local15_life69 = ((javax.crypto.Cipher)(__sourceSpill593_67)).doFinal(((byte[])(__sourceSpill593_66)));
        (__sourceSpill593_63)[__sourceSpill593_64] = (((((((((((long) (local15_life69)[0]) & 255L) << 56) | ((((long) (local15_life69)[1]) & 255L) << 48)) | ((((long) (local15_life69)[2]) & 255L) << 40)) | ((((long) (local15_life69)[3]) & 255L) << 32)) | ((((long) (local15_life69)[4]) & 255L) << 24)) | ((((long) (local15_life69)[5]) & 255L) << 16)) | ((((long) (local15_life69)[6]) & 255L) << 8)) | (((long) (local15_life69)[7]) & 255L));
    } while ((!(local7_life57 >= local10_life56)));
    local10_life56 = ((java.lang.String)((local9_life54 = "MHHhjûCt/Ç¹k\027Î\035"))).length();
    local7_life57 = 0;
    do {
        java.lang.String __sourceSpill593_71 = local9_life54;
        int __sourceSpill593_72 = local7_life57;
        local7_life57 += 8;
        byte[] local12_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill593_71)).substring(((int)(__sourceSpill593_72)), ((int)(local7_life57))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill593_76 = local11_life52;
        int __sourceSpill593_77 = local8_life53;
        local8_life53 += 1;
        long local13_life78 = (((((((((((long) (local12_life75)[0]) & 255L) << 56) | ((((long) (local12_life75)[1]) & 255L) << 48)) | ((((long) (local12_life75)[2]) & 255L) << 40)) | ((((long) (local12_life75)[3]) & 255L) << 32)) | ((((long) (local12_life75)[4]) & 255L) << 24)) | ((((long) (local12_life75)[5]) & 255L) << 16)) | ((((long) (local12_life75)[6]) & 255L) << 8)) | (((long) (local12_life75)[7]) & 255L));
        byte[] __sourceSpill593_79 = new byte[8];
        (__sourceSpill593_79)[0] = ((byte) ((int) (local13_life78 >>> 56)));
        (__sourceSpill593_79)[1] = ((byte) ((int) (local13_life78 >>> 48)));
        (__sourceSpill593_79)[2] = ((byte) ((int) (local13_life78 >>> 40)));
        (__sourceSpill593_79)[3] = ((byte) ((int) (local13_life78 >>> 32)));
        (__sourceSpill593_79)[4] = ((byte) ((int) (local13_life78 >>> 24)));
        (__sourceSpill593_79)[5] = ((byte) ((int) (local13_life78 >>> 16)));
        (__sourceSpill593_79)[6] = ((byte) ((int) (local13_life78 >>> 8)));
        (__sourceSpill593_79)[7] = ((byte) ((int) local13_life78));
        javax.crypto.Cipher __sourceSpill593_80 = local5_life42;
        byte[] local15_life82 = ((javax.crypto.Cipher)(__sourceSpill593_80)).doFinal(((byte[])(__sourceSpill593_79)));
        (__sourceSpill593_76)[__sourceSpill593_77] = (((((((((((long) (local15_life82)[0]) & 255L) << 56) | ((((long) (local15_life82)[1]) & 255L) << 48)) | ((((long) (local15_life82)[2]) & 255L) << 40)) | ((((long) (local15_life82)[3]) & 255L) << 32)) | ((((long) (local15_life82)[4]) & 255L) << 24)) | ((((long) (local15_life82)[5]) & 255L) << 16)) | ((((long) (local15_life82)[6]) & 255L) << 8)) | (((long) (local15_life82)[7]) & 255L));
    } while ((!(local7_life57 >= local10_life56)));
    o = ((long[])(local11_life52));
    p = ((java.lang.Integer[])(new java.lang.Integer[5]));
    javax.crypto.Cipher local0_life86;
    javax.crypto.Cipher __sourceSpill593_88 = (local0_life86 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill593_89 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill593_90 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill593_91 = new byte[8];
    (__sourceSpill593_91)[0] = ((byte) ((int) (local16_life7 >>> 56)));
    int local1_life92 = 1;
    while ((local1_life92 < 8)) {
        (__sourceSpill593_91)[local1_life92] = ((byte) ((int) ((local16_life7 << (local1_life92 * 8)) >>> 56)));
        local1_life92 += 1;
    }
    byte[] __sourcePreallocation593_93 = __sourceSpill593_91;
    ((javax.crypto.Cipher)(__sourceSpill593_88)).init(((int)(__sourceSpill593_89)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill593_90)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation593_93)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local2_life96 = 188718875195062299L;
    byte[] __sourceSpill593_97 = new byte[8];
    (__sourceSpill593_97)[0] = ((byte) ((int) (local2_life96 >>> 56)));
    (__sourceSpill593_97)[1] = ((byte) ((int) (local2_life96 >>> 48)));
    (__sourceSpill593_97)[2] = ((byte) ((int) (local2_life96 >>> 40)));
    (__sourceSpill593_97)[3] = ((byte) ((int) (local2_life96 >>> 32)));
    (__sourceSpill593_97)[4] = ((byte) ((int) (local2_life96 >>> 24)));
    (__sourceSpill593_97)[5] = ((byte) ((int) (local2_life96 >>> 16)));
    (__sourceSpill593_97)[6] = ((byte) ((int) (local2_life96 >>> 8)));
    (__sourceSpill593_97)[7] = ((byte) ((int) local2_life96));
    javax.crypto.Cipher __sourceSpill593_98 = local0_life86;
    byte[] local4_life100 = ((javax.crypto.Cipher)(__sourceSpill593_98)).doFinal(((byte[])(__sourceSpill593_97)));
    r = ((long)((((((((((((long) (local4_life100)[0]) & 255L) << 56) | ((((long) (local4_life100)[1]) & 255L) << 48)) | ((((long) (local4_life100)[2]) & 255L) << 40)) | ((((long) (local4_life100)[3]) & 255L) << 32)) | ((((long) (local4_life100)[4]) & 255L) << 24)) | ((((long) (local4_life100)[5]) & 255L) << 16)) | ((((long) (local4_life100)[6]) & 255L) << 8)) | (((long) (local4_life100)[7]) & 255L))));
}


public java.lang.String toString() {
long local1 = (moom.JE.k ^ 124225973451370L);
    net.minecraft.entity.Entity __sourceSpill1693_3 = this.a;
    double local3 = this.b;
    net.minecraft.entity.Entity local5 = __sourceSpill1693_3;
    return __sourceIntrinsic_a86c261fcdee_originalDynamicSite1693_6(__sourceIntrinsic_a86c261fcdee_originalDynamicSite1693_4(29749, (8643575745005217660L ^ local1)), local5, __sourceIntrinsic_a86c261fcdee_originalDynamicSite1693_5(25229, (7877696401052463557L ^ local1)), local3);
}


public double b() {
return this.d;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral5079_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/JE"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x5933;
        if (p[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = o[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])q.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    q.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/JE", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            JE.p[n2] = n4;
        }
        return p[n2];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.JE.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public void b(net.minecraft.client.renderer.RenderGlobal p0) {
net.minecraft.entity.Entity[] spill826_0;
    long life2_3;
    java.util.Iterator life5_8;
    net.minecraft.entity.Entity[] life4_9;
    moom.DT life6_16;
    moom.mp life7_20;
    lexical_join_28: {
    life2_3 = (moom.JE.k ^ 108074912080247L);
    spill826_0 = moom.JM.b__Arrayr3();
    life5_8 = ((java.util.Set)(this.i)).iterator();
    life4_9 = spill826_0;
    lexical_cycle_10: while (true) {
    if (!(((java.util.Iterator)(life5_8)).hasNext())) {
        break lexical_join_28;
    }
    life6_16 = ((moom.DT)(((java.util.Iterator)(life5_8)).next()));
    life7_20 = ((net.minecraft.client.renderer.RenderGlobal)(p0)).a__mp(((moom.DT)(life6_16)));
    this.a(((moom.mp)(life7_20)), ((java.util.Set)(null)), ((java.util.Set)(null)));
    if (!((life4_9 == null))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    return;
}


public double c() {
return this.e;
}


public double d() {
return this.b;
}


private static java.lang.String a(int p0, long p1) {
int life5_8;
    java.lang.Long life3_16;
    java.lang.Object[] life4_21;
    byte[] life6_60;
    int life7_70;
    javax.crypto.spec.DESKeySpec life7_92;
    javax.crypto.SecretKey life8_99;
    byte[] life9_116;
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 7260);
    if (((moom.JE.m)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.JE.n)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.JE.n)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/JE", life9_51);
    }
        life6_60 = new byte[8];
        (life6_60)[0] = ((byte) ((int) (p1 >>> 56)));
        life7_70 = 1;
        loop_region_71: while ((life7_70 < 8)) {
        (life6_60)[life7_70] = ((byte) ((int) ((p1 << (life7_70 * 8)) >>> 56)));
        life7_70 += 1;
    }
        life7_92 = new javax.crypto.spec.DESKeySpec(life6_60);
        life8_99 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life4_21)[1])))).generateSecret(((java.security.spec.KeySpec)(life7_92)));
        ((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).init(((int)(2)), ((java.security.Key)(life8_99)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life4_21)[2])))));
        life9_116 = ((java.lang.String)((moom.JE.l)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.JE.m)[life5_8] = moom.JE.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.JE.m)[life5_8];
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral5082_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/JE"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.JE.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private moom.DT a(moom.mp p0, moom.DT p1, moom.bs p2) {
moom.mp forwardValue2278_11_0;
    moom.DT forwardValue2278_22_0;
    moom.mp spill2278_0;
    long life4_3;
    net.minecraft.entity.Entity[] life6_5;
    forward_join_22: {
    forward_join_14: {
    forward_join_11: {
    life4_3 = (moom.JE.k ^ 2982842667653L);
    life6_5 = moom.JM.b__Arrayr3();
    spill2278_0 = p0;
    if (!((life6_5 != null))) {
        forwardValue2278_11_0 = spill2278_0;
        break forward_join_11;
    }
    if (!((spill2278_0 != null))) {
        break forward_join_14;
    }
    forwardValue2278_11_0 = p0;
    }
    forwardValue2278_22_0 = ((moom.mp)(forwardValue2278_11_0)).a(((moom.bs)(p2)));
    break forward_join_22;
    }
    forwardValue2278_22_0 = ((moom.DT)(p1)).a(((moom.bs)(p2)), ((int)(__sourceIntrinsic_eb458d2741b9_invokedynamic2278_3(10544, (3501698648938813435L ^ life4_3)))));
    }
    return forwardValue2278_22_0;
}


public void a(net.minecraft.client.renderer.RenderGlobal p0) {
int forwardValue2279_81_0;
    int forwardValue2279_88_0;
    moom.JE forwardValue2279_103_0;
    net.minecraft.client.multiplayer.WorldClient forwardValue2279_123_0;
    moom.JE forwardValue2279_136_0;
    moom.JE forwardValue2279_137_0;
    int forwardValue2279_137_1;
    moom.bs forwardValue2279_163_0;
    moom.bs forwardValue2279_181_0;
    moom.bs forwardValue2279_199_0;
    int spill2279_0;
    moom.JE spill2279_1;
    net.minecraft.client.multiplayer.WorldClient spill2279_2;
    moom.JE spill2279_3;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    long life5_9;
    double life5_28;
    double life7_37;
    double life9_43;
    int life11_47;
    double life12_52;
    double life14_57;
    double life16_62;
    double life18_64;
    net.minecraft.client.multiplayer.WorldClient life20_133;
    net.minecraft.block.state.IBlockState life21_158;
    net.minecraft.block.Block life22_161;
    java.util.HashSet life21_175;
    moom.bs life22_205;
    moom.bs life23_225;
    moom.bs life24_245;
    moom.DT life25_252;
    moom.mp life26_256;
    moom.DT life27_262;
    moom.mp life28_266;
    moom.DT life29_272;
    moom.mp life30_276;
    moom.DT life31_282;
    moom.mp life32_286;
    moom.DT life33_292;
    moom.mp life34_296;
    moom.DT life35_302;
    moom.mp life36_306;
    moom.DT life37_312;
    moom.mp life38_316;
    moom.DT life39_322;
    moom.mp life40_326;
    forward_join_335: {
    forward_join_332: {
    forward_join_329: {
    forward_join_199: {
    forward_join_198: {
    forward_join_181: {
    forward_join_180: {
    forward_join_163: {
    forward_join_162: {
    forward_join_138: {
    forward_join_137: {
    forward_join_136: {
    forward_join_123: {
    forward_join_105: {
    forward_join_103: {
    forward_join_90: {
    forward_join_88: {
    forward_join_81: {
    forward_join_21: {
    forward_join_18: {
    life2_3 = (moom.JE.k ^ 85395078885723L);
    life4_5 = moom.JM.b__Arrayr3();
    if (!(moom.BU.az())) {
        break forward_join_21;
    }
    life5_9 = java.lang.System.currentTimeMillis();
    if (!((recovery.source.CarrierOps.lcmp(((long)(life5_9)), ((long)((this.h + moom.JE.r)))) < 0))) {
        break forward_join_18;
    }
    return;
    }
    this.h = ((long)(life5_9));
    }
    life5_28 = (((net.minecraft.entity.Entity)(this.a)).n - 0x1.0p-1d);
    life7_37 = ((((net.minecraft.entity.Entity)(this.a)).o - 0x1.0p-1d) + this.b);
    life9_43 = (((net.minecraft.entity.Entity)(this.a)).p - 0x1.0p-1d);
    life11_47 = moom.JF.a(((net.minecraft.entity.Entity)(this.a)));
    life12_52 = (life5_28 - this.c);
    life14_57 = (life7_37 - this.d);
    life16_62 = (life9_43 - this.e);
    life18_64 = 0x1.999999999999ap-4d;
    if (!((life4_5 != null))) {
        break forward_join_105;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(java.lang.Math.abs(((double)(life12_52))))), ((double)(life18_64))) <= 0))) {
        break forward_join_90;
    }
    spill2279_0 = recovery.source.CarrierOps.dcmpl(((double)(java.lang.Math.abs(((double)(life14_57))))), ((double)(life18_64)));
    if (!((life4_5 != null))) {
        forwardValue2279_81_0 = spill2279_0;
        break forward_join_81;
    }
    if (!((spill2279_0 <= 0))) {
        break forward_join_90;
    }
    forwardValue2279_81_0 = recovery.source.CarrierOps.dcmpl(((double)(java.lang.Math.abs(((double)(life16_62))))), ((double)(life18_64)));
    }
    if (!((life4_5 != null))) {
        forwardValue2279_88_0 = forwardValue2279_81_0;
        break forward_join_88;
    }
    if (!((forwardValue2279_81_0 <= 0))) {
        break forward_join_90;
    }
    spill2279_1 = this;
    if (!((life4_5 != null))) {
        forwardValue2279_103_0 = spill2279_1;
        break forward_join_103;
    }
    forwardValue2279_88_0 = ((moom.JE)(spill2279_1)).f;
    }
    if (!((forwardValue2279_88_0 != life11_47))) {
        break forward_join_335;
    }
    }
    this.c = ((double)(life5_28));
    this.d = ((double)(life7_37));
    this.e = ((double)(life9_43));
    this.f = ((int)(life11_47));
    forwardValue2279_103_0 = this;
    }
    ((moom.JE)(forwardValue2279_103_0)).g = ((boolean)(false));
    }
    life20_133 = ((net.minecraft.client.renderer.RenderGlobal)(p0)).a__Ev();
    spill2279_2 = life20_133;
    if (!((life4_5 != null))) {
        forwardValue2279_123_0 = spill2279_2;
        break forward_join_123;
    }
    if (!((spill2279_2 != null))) {
        break forward_join_138;
    }
    ((moom.DU)(this.j)).a(((int)(moom.Dr.b__Int(((double)(life5_28))))), ((int)(moom.Dr.b__Int(((double)(life7_37))))), ((int)(moom.Dr.b__Int(((double)(life9_43))))));
    forwardValue2279_123_0 = life20_133;
    }
    life21_158 = ((net.minecraft.world.World)(forwardValue2279_123_0)).a__fE(((moom.DT)(this.j)));
    life22_161 = ((net.minecraft.block.state.IBlockState)(life21_158)).a__ch();
    spill2279_3 = this;
    if (!((life22_161 == net.minecraft.init.Blocks.j))) {
        forwardValue2279_136_0 = spill2279_3;
        break forward_join_136;
    }
    forwardValue2279_137_0 = spill2279_3;
    forwardValue2279_137_1 = 1;
    break forward_join_137;
    }
    forwardValue2279_137_0 = forwardValue2279_136_0;
    forwardValue2279_137_1 = 0;
    }
    ((moom.JE)(forwardValue2279_137_0)).g = ((boolean)__sourceIntrinsic_integerToBoolean((forwardValue2279_137_1)));
    }
    life21_175 = new java.util.HashSet();
    if (!((life4_5 != null))) {
        break forward_join_332;
    }
    if (!((life11_47 > 0))) {
        break forward_join_329;
    }
    if (!(((moom.Dr.b__Int(((double)(life5_28))) & __sourceIntrinsic_123fa35c3119_invokedynamic2279_44(19137, (2042580887054899158L ^ life2_3))) >= __sourceIntrinsic_123fa35c3119_invokedynamic2279_45(5031, (8202708953222450867L ^ life2_3))))) {
        break forward_join_162;
    }
    forwardValue2279_163_0 = moom.bs.EAST;
    break forward_join_163;
    }
    forwardValue2279_163_0 = moom.bs.WEST;
    }
    life22_205 = forwardValue2279_163_0;
    if (!(((moom.Dr.b__Int(((double)(life7_37))) & __sourceIntrinsic_123fa35c3119_invokedynamic2279_49(28817, (586509014482677127L ^ life2_3))) >= __sourceIntrinsic_123fa35c3119_invokedynamic2279_50(5283, (3540518459244415408L ^ life2_3))))) {
        break forward_join_180;
    }
    forwardValue2279_181_0 = moom.bs.UP;
    break forward_join_181;
    }
    forwardValue2279_181_0 = moom.bs.DOWN;
    }
    life23_225 = forwardValue2279_181_0;
    if (!(((moom.Dr.b__Int(((double)(life9_43))) & __sourceIntrinsic_123fa35c3119_invokedynamic2279_54(28817, (586509014482677127L ^ life2_3))) >= __sourceIntrinsic_123fa35c3119_invokedynamic2279_55(5283, (3540518459244415408L ^ life2_3))))) {
        break forward_join_198;
    }
    forwardValue2279_199_0 = moom.bs.SOUTH;
    break forward_join_199;
    }
    forwardValue2279_199_0 = moom.bs.NORTH;
    }
    life24_245 = forwardValue2279_199_0;
    life25_252 = new moom.DT(life5_28, life7_37, life9_43);
    life26_256 = ((net.minecraft.client.renderer.RenderGlobal)(p0)).a__mp(((moom.DT)(life25_252)));
    life27_262 = this.a(((moom.mp)(life26_256)), ((moom.DT)(life25_252)), ((moom.bs)(life22_205)));
    life28_266 = ((net.minecraft.client.renderer.RenderGlobal)(p0)).a__mp(((moom.DT)(life27_262)));
    life29_272 = this.a(((moom.mp)(life26_256)), ((moom.DT)(life25_252)), ((moom.bs)(life24_245)));
    life30_276 = ((net.minecraft.client.renderer.RenderGlobal)(p0)).a__mp(((moom.DT)(life29_272)));
    life31_282 = this.a(((moom.mp)(life28_266)), ((moom.DT)(life27_262)), ((moom.bs)(life24_245)));
    life32_286 = ((net.minecraft.client.renderer.RenderGlobal)(p0)).a__mp(((moom.DT)(life31_282)));
    life33_292 = this.a(((moom.mp)(life26_256)), ((moom.DT)(life25_252)), ((moom.bs)(life23_225)));
    life34_296 = ((net.minecraft.client.renderer.RenderGlobal)(p0)).a__mp(((moom.DT)(life33_292)));
    life35_302 = this.a(((moom.mp)(life34_296)), ((moom.DT)(life33_292)), ((moom.bs)(life22_205)));
    life36_306 = ((net.minecraft.client.renderer.RenderGlobal)(p0)).a__mp(((moom.DT)(life35_302)));
    life37_312 = this.a(((moom.mp)(life34_296)), ((moom.DT)(life33_292)), ((moom.bs)(life24_245)));
    life38_316 = ((net.minecraft.client.renderer.RenderGlobal)(p0)).a__mp(((moom.DT)(life37_312)));
    life39_322 = this.a(((moom.mp)(life36_306)), ((moom.DT)(life35_302)), ((moom.bs)(life24_245)));
    life40_326 = ((net.minecraft.client.renderer.RenderGlobal)(p0)).a__mp(((moom.DT)(life39_322)));
    this.a(((moom.mp)(life26_256)), ((java.util.Set)(this.i)), ((java.util.Set)(life21_175)));
    this.a(((moom.mp)(life28_266)), ((java.util.Set)(this.i)), ((java.util.Set)(life21_175)));
    this.a(((moom.mp)(life30_276)), ((java.util.Set)(this.i)), ((java.util.Set)(life21_175)));
    this.a(((moom.mp)(life32_286)), ((java.util.Set)(this.i)), ((java.util.Set)(life21_175)));
    this.a(((moom.mp)(life34_296)), ((java.util.Set)(this.i)), ((java.util.Set)(life21_175)));
    this.a(((moom.mp)(life36_306)), ((java.util.Set)(this.i)), ((java.util.Set)(life21_175)));
    this.a(((moom.mp)(life38_316)), ((java.util.Set)(this.i)), ((java.util.Set)(life21_175)));
    this.a(((moom.mp)(life40_326)), ((java.util.Set)(this.i)), ((java.util.Set)(life21_175)));
    }
    this.b(((net.minecraft.client.renderer.RenderGlobal)(p0)));
    }
    this.i = ((java.util.Set)(life21_175));
    }
    return;
}


public double a() {
return this.c;
}


public int a__Int() {
return this.f;
}


public boolean a__Boolean() {
return ((((this.g) ? 1 : 0)) != 0);
}


public net.minecraft.entity.Entity a__r3() {
return this.a;
}


private void a(moom.mp p0, java.util.Set<moom.DT> p1, java.util.Set<moom.DT> p2) {
moom.mp forwardValue2277_11_0;
    net.minecraft.client.renderer.chunk.CompiledChunk forwardValue2277_18_0;
    java.util.Set forwardValue2277_35_0;
    java.util.Set forwardValue2277_39_0;
    moom.mp spill2277_0;
    net.minecraft.client.renderer.chunk.CompiledChunk spill2277_1;
    java.util.Set spill2277_2;
    long life4_3;
    net.minecraft.entity.Entity[] life6_5;
    net.minecraft.client.renderer.chunk.CompiledChunk life7_15;
    moom.DT life8_34;
    forward_join_42: {
    forward_join_39: {
    forward_join_35: {
    forward_join_34: {
    forward_join_23: {
    forward_join_18: {
    forward_join_11: {
    life4_3 = (moom.JE.k ^ 95778247503660L);
    life6_5 = moom.JM.b__Arrayr3();
    spill2277_0 = p0;
    if (!((life6_5 != null))) {
        forwardValue2277_11_0 = spill2277_0;
        break forward_join_11;
    }
    if (!((spill2277_0 != null))) {
        break forward_join_42;
    }
    forwardValue2277_11_0 = p0;
    }
    life7_15 = ((moom.mp)(forwardValue2277_11_0)).a__ml();
    spill2277_1 = life7_15;
    if (!((life6_5 != null))) {
        forwardValue2277_18_0 = spill2277_1;
        break forward_join_18;
    }
    if (!((spill2277_1 != null))) {
        break forward_join_23;
    }
    forwardValue2277_18_0 = life7_15;
    }
    if (!((!((net.minecraft.client.renderer.chunk.CompiledChunk)(forwardValue2277_18_0)).a__Boolean()))) {
        break forward_join_23;
    }
    ((moom.mp)(p0)).a(((boolean)(true)));
    }
    life8_34 = ((moom.mp)(p0)).a__DT();
    spill2277_2 = p1;
    if (!((life6_5 != null))) {
        forwardValue2277_35_0 = spill2277_2;
        break forward_join_35;
    }
    if (!((spill2277_2 != null))) {
        break forward_join_34;
    }
    ((java.util.Set)(p1)).remove(((java.lang.Object)(life8_34)));
    }
    forwardValue2277_35_0 = p2;
    }
    if (!((life6_5 != null))) {
        forwardValue2277_39_0 = forwardValue2277_35_0;
        break forward_join_39;
    }
    if (!((forwardValue2277_35_0 != null))) {
        break forward_join_42;
    }
    forwardValue2277_39_0 = p2;
    }
    ((java.util.Set)(forwardValue2277_39_0)).add(((java.lang.Object)(life8_34)));
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static java.lang.String a(byte[] p0) {
int life1_1;
    int life2_5;
    char[] life3_7;
    int life4_9;
    int life5_19;
    int life6_39;
    int life5_44;
    int life6_52;
    int life6_71;
    int life5_76;
    int life6_86;
    int life5_91;
    int life6_99;
    life1_1 = 0;
    life3_7 = new char[(life2_5 = (p0).length)];
    life4_9 = 0;
    loop_region_10: while ((life4_9 < life2_5)) {
        if (((life5_19 = (255 & (p0)[life4_9])) < 192)) {
        (life3_7)[(life1_1++)] = ((char) life5_19);
    } else {
        if ((life5_19 < 224)) {
        life6_39 = ((int)(((char) (((char) (life5_19 & 31)) << 6))));
        byte[] spill2638_0 = p0;
        life4_9 += 1;
        life5_44 = (spill2638_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill2638_1 = p0;
        life4_9 += 1;
        life5_76 = (spill2638_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill2638_2 = p0;
        life4_9 += 1;
        life5_91 = (spill2638_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral5082_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb458d2741b9_invokedynamic2278_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_123fa35c3119_invokedynamic2279_44(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_123fa35c3119_invokedynamic2279_45(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_123fa35c3119_invokedynamic2279_49(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_123fa35c3119_invokedynamic2279_50(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_123fa35c3119_invokedynamic2279_54(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_123fa35c3119_invokedynamic2279_55(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral5079_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite1693_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite1693_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite1693_6(java.lang.String a0, net.minecraft.entity.Entity a1, java.lang.String a2, double a3) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
