package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class gD extends net.minecraft.client.gui.Gui {

private static final com.google.common.collect.Ordering<moom.jX> f;

private final net.minecraft.client.Minecraft g;

private final net.minecraft.client.gui.GuiIngame h;

private net.minecraft.util.IChatComponent i;

private net.minecraft.util.IChatComponent j;

private long k;

private boolean l;

private com.moon.module.impl.Camera m;

private static final long n;

private static final long[] o;

private static final java.lang.Integer[] p;

private static final java.util.Map q;

private static final long[] r;

private static final java.lang.Long[] s;

private static final java.util.Map t;

public gD(net.minecraft.client.Minecraft p0, net.minecraft.client.gui.GuiIngame p1) {
super();
    this.g = p0;
    this.h = p1;
}


static {
n = ((long)(((moom._a)(moom._c.a(((long)(1818345804304745783L)), ((long)(-5892749343987856660L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(186478441476360L)))));
    q = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (moom.gD.n ^ 4132091709612L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill845_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill845_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill845_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill845_14 = new byte[8];
    (__sourceSpill845_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill845_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation845_16 = __sourceSpill845_14;
    ((javax.crypto.Cipher)(__sourceSpill845_11)).init(((int)(__sourceSpill845_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill845_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation845_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local19_life19 = new long[39];
    int local16_life20 = 0;
    java.lang.String local17_life21;
    int local18_life23 = ((java.lang.String)((local17_life21 = "2°aª&Ev>\031\026 cø;î÷uÀÎ`ðC'cFpØõ\nÂX[7\006.q÷\ti\020NÎí^Z\020GN«Ô2ÕIÛ\022¹!Æd*í?Ò \024Ðìp\005,Þ\022Ëñ´TkÇØ¤güÕ0Ëzî\036Ü,ý>r¸+Ha¬@æ¨n\bC\022öî¨:T96<>\005ú\027Gï¤vA¯ènQ0t\022¶x}¿­>u\002X7rp¹kæf\003\017íº¸üTB¹\023\035\035\0305í+e\020íXªdû)[l\036Ü\023¤+ÁQ|¡ID¾k¦\034Õµ\001mQj\023ºÎÓp8L=Ä||%?éÓ\004\rêxÿáDCéedT8µ¡|¬¸n«Mñ·J'\177\0219õÏnYhuVÿ\023D\027¹\013¸Þ\037\013÷üÜ9®è~Í;4äy"))).length();
    int local15_life24 = 0;
    do {
        java.lang.String __sourceSpill845_25 = local17_life21;
        int __sourceSpill845_26 = local15_life24;
        local15_life24 += 8;
        byte[] local20_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill845_25)).substring(((int)(__sourceSpill845_26)), ((int)(local15_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill845_30 = local19_life19;
        int __sourceSpill845_31 = local16_life20;
        local16_life20 += 1;
        long local21_life32 = (((((((((((long) (local20_life29)[0]) & 255L) << 56) | ((((long) (local20_life29)[1]) & 255L) << 48)) | ((((long) (local20_life29)[2]) & 255L) << 40)) | ((((long) (local20_life29)[3]) & 255L) << 32)) | ((((long) (local20_life29)[4]) & 255L) << 24)) | ((((long) (local20_life29)[5]) & 255L) << 16)) | ((((long) (local20_life29)[6]) & 255L) << 8)) | (((long) (local20_life29)[7]) & 255L));
        byte[] __sourceSpill845_33 = new byte[8];
        (__sourceSpill845_33)[0] = ((byte) ((int) (local21_life32 >>> 56)));
        (__sourceSpill845_33)[1] = ((byte) ((int) (local21_life32 >>> 48)));
        (__sourceSpill845_33)[2] = ((byte) ((int) (local21_life32 >>> 40)));
        (__sourceSpill845_33)[3] = ((byte) ((int) (local21_life32 >>> 32)));
        (__sourceSpill845_33)[4] = ((byte) ((int) (local21_life32 >>> 24)));
        (__sourceSpill845_33)[5] = ((byte) ((int) (local21_life32 >>> 16)));
        (__sourceSpill845_33)[6] = ((byte) ((int) (local21_life32 >>> 8)));
        (__sourceSpill845_33)[7] = ((byte) ((int) local21_life32));
        javax.crypto.Cipher __sourceSpill845_34 = local13_life9;
        byte[] local23_life36 = ((javax.crypto.Cipher)(__sourceSpill845_34)).doFinal(((byte[])(__sourceSpill845_33)));
        (__sourceSpill845_30)[__sourceSpill845_31] = (((((((((((long) (local23_life36)[0]) & 255L) << 56) | ((((long) (local23_life36)[1]) & 255L) << 48)) | ((((long) (local23_life36)[2]) & 255L) << 40)) | ((((long) (local23_life36)[3]) & 255L) << 32)) | ((((long) (local23_life36)[4]) & 255L) << 24)) | ((((long) (local23_life36)[5]) & 255L) << 16)) | ((((long) (local23_life36)[6]) & 255L) << 8)) | (((long) (local23_life36)[7]) & 255L));
    } while ((!(local15_life24 >= local18_life23)));
    local18_life23 = ((java.lang.String)((local17_life21 = "«wà%Mø¤bÞO£úÿF"))).length();
    local15_life24 = 0;
    do {
        java.lang.String __sourceSpill845_38 = local17_life21;
        int __sourceSpill845_39 = local15_life24;
        local15_life24 += 8;
        byte[] local20_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill845_38)).substring(((int)(__sourceSpill845_39)), ((int)(local15_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill845_43 = local19_life19;
        int __sourceSpill845_44 = local16_life20;
        local16_life20 += 1;
        long local21_life45 = (((((((((((long) (local20_life42)[0]) & 255L) << 56) | ((((long) (local20_life42)[1]) & 255L) << 48)) | ((((long) (local20_life42)[2]) & 255L) << 40)) | ((((long) (local20_life42)[3]) & 255L) << 32)) | ((((long) (local20_life42)[4]) & 255L) << 24)) | ((((long) (local20_life42)[5]) & 255L) << 16)) | ((((long) (local20_life42)[6]) & 255L) << 8)) | (((long) (local20_life42)[7]) & 255L));
        byte[] __sourceSpill845_46 = new byte[8];
        (__sourceSpill845_46)[0] = ((byte) ((int) (local21_life45 >>> 56)));
        (__sourceSpill845_46)[1] = ((byte) ((int) (local21_life45 >>> 48)));
        (__sourceSpill845_46)[2] = ((byte) ((int) (local21_life45 >>> 40)));
        (__sourceSpill845_46)[3] = ((byte) ((int) (local21_life45 >>> 32)));
        (__sourceSpill845_46)[4] = ((byte) ((int) (local21_life45 >>> 24)));
        (__sourceSpill845_46)[5] = ((byte) ((int) (local21_life45 >>> 16)));
        (__sourceSpill845_46)[6] = ((byte) ((int) (local21_life45 >>> 8)));
        (__sourceSpill845_46)[7] = ((byte) ((int) local21_life45));
        javax.crypto.Cipher __sourceSpill845_47 = local13_life9;
        byte[] local23_life49 = ((javax.crypto.Cipher)(__sourceSpill845_47)).doFinal(((byte[])(__sourceSpill845_46)));
        (__sourceSpill845_43)[__sourceSpill845_44] = (((((((((((long) (local23_life49)[0]) & 255L) << 56) | ((((long) (local23_life49)[1]) & 255L) << 48)) | ((((long) (local23_life49)[2]) & 255L) << 40)) | ((((long) (local23_life49)[3]) & 255L) << 32)) | ((((long) (local23_life49)[4]) & 255L) << 24)) | ((((long) (local23_life49)[5]) & 255L) << 16)) | ((((long) (local23_life49)[6]) & 255L) << 8)) | (((long) (local23_life49)[7]) & 255L));
    } while ((!(local15_life24 >= local18_life23)));
    o = ((long[])(local19_life19));
    p = ((java.lang.Integer[])(new java.lang.Integer[39]));
    t = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life54;
    javax.crypto.Cipher __sourceSpill845_56 = (local0_life54 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill845_57 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill845_58 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill845_59 = new byte[8];
    (__sourceSpill845_59)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life60 = 1;
    while ((local1_life60 < 8)) {
        (__sourceSpill845_59)[local1_life60] = ((byte) ((int) ((local11_life7 << (local1_life60 * 8)) >>> 56)));
        local1_life60 += 1;
    }
    byte[] __sourcePreallocation845_61 = __sourceSpill845_59;
    ((javax.crypto.Cipher)(__sourceSpill845_56)).init(((int)(__sourceSpill845_57)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill845_58)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation845_61)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life64 = new long[3];
    int local3_life65 = 0;
    java.lang.String local4_life66;
    int local5_life68 = ((java.lang.String)((local4_life66 = "!´°Y\001\b\030Tdö\034¨çïI^=Äô¬"))).length();
    int local2_life69 = 0;
    do {
        java.lang.String __sourceSpill845_70 = local4_life66;
        int __sourceSpill845_71 = local2_life69;
        local2_life69 += 8;
        byte[] local7_life74 = ((java.lang.String)(((java.lang.String)(__sourceSpill845_70)).substring(((int)(__sourceSpill845_71)), ((int)(local2_life69))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill845_75 = local6_life64;
        int __sourceSpill845_76 = local3_life65;
        local3_life65 += 1;
        long local8_life77 = (((((((((((long) (local7_life74)[0]) & 255L) << 56) | ((((long) (local7_life74)[1]) & 255L) << 48)) | ((((long) (local7_life74)[2]) & 255L) << 40)) | ((((long) (local7_life74)[3]) & 255L) << 32)) | ((((long) (local7_life74)[4]) & 255L) << 24)) | ((((long) (local7_life74)[5]) & 255L) << 16)) | ((((long) (local7_life74)[6]) & 255L) << 8)) | (((long) (local7_life74)[7]) & 255L));
        byte[] __sourceSpill845_78 = new byte[8];
        (__sourceSpill845_78)[0] = ((byte) ((int) (local8_life77 >>> 56)));
        (__sourceSpill845_78)[1] = ((byte) ((int) (local8_life77 >>> 48)));
        (__sourceSpill845_78)[2] = ((byte) ((int) (local8_life77 >>> 40)));
        (__sourceSpill845_78)[3] = ((byte) ((int) (local8_life77 >>> 32)));
        (__sourceSpill845_78)[4] = ((byte) ((int) (local8_life77 >>> 24)));
        (__sourceSpill845_78)[5] = ((byte) ((int) (local8_life77 >>> 16)));
        (__sourceSpill845_78)[6] = ((byte) ((int) (local8_life77 >>> 8)));
        (__sourceSpill845_78)[7] = ((byte) ((int) local8_life77));
        javax.crypto.Cipher __sourceSpill845_79 = local0_life54;
        byte[] local10_life81 = ((javax.crypto.Cipher)(__sourceSpill845_79)).doFinal(((byte[])(__sourceSpill845_78)));
        (__sourceSpill845_75)[__sourceSpill845_76] = (((((((((((long) (local10_life81)[0]) & 255L) << 56) | ((((long) (local10_life81)[1]) & 255L) << 48)) | ((((long) (local10_life81)[2]) & 255L) << 40)) | ((((long) (local10_life81)[3]) & 255L) << 32)) | ((((long) (local10_life81)[4]) & 255L) << 24)) | ((((long) (local10_life81)[5]) & 255L) << 16)) | ((((long) (local10_life81)[6]) & 255L) << 8)) | (((long) (local10_life81)[7]) & 255L));
    } while ((!(local2_life69 >= local5_life68)));
    r = ((long[])(local6_life64));
    s = ((java.lang.Long[])(new java.lang.Long[3]));
    f = ((com.google.common.collect.Ordering)(com.google.common.collect.Ordering.from(((java.util.Comparator)(new net.minecraft.client.gui.GuiPlayerTabOverlay$PlayerComparator())))));
}


public void b(net.minecraft.util.IChatComponent p0) {
this.j = ((net.minecraft.util.IChatComponent)(p0));
    return;
}


private static long c(int p0, long p1) {
int life3_8;
    byte[] life4_77;
    long life5_81;
    byte[] life7_146;
    java.lang.Long life8_150;
    java.lang.Object[] life9_155;
    javax.crypto.spec.DESKeySpec life11_188;
    javax.crypto.SecretKey life12_195;
    javax.crypto.Cipher life13_200;
    byte[] life10_212;
    long life11_290;
    life3_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 20557);
    if (((moom.gD.s)[life3_8] == null)) {
        life4_77 = new byte[] {((byte) ((int) (p1 >>> 56))), ((byte) ((int) (p1 >>> 48))), ((byte) ((int) (p1 >>> 40))), ((byte) ((int) (p1 >>> 32))), ((byte) ((int) (p1 >>> 24))), ((byte) ((int) (p1 >>> 16))), ((byte) ((int) (p1 >>> 8))), ((byte) ((int) p1))};
        life5_81 = (moom.gD.r)[life3_8];
        life7_146 = new byte[] {((byte) ((int) (life5_81 >>> 56))), ((byte) ((int) (life5_81 >>> 48))), ((byte) ((int) (life5_81 >>> 40))), ((byte) ((int) (life5_81 >>> 32))), ((byte) ((int) (life5_81 >>> 24))), ((byte) ((int) (life5_81 >>> 16))), ((byte) ((int) (life5_81 >>> 8))), ((byte) ((int) life5_81))};
        life8_150 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life9_155 = ((java.lang.Object[])(((java.util.Map)(moom.gD.t)).get(((java.lang.Object)(life8_150)))));
        try {
        if ((life9_155 == null)) {
        life9_155 = new java.lang.Object[3];
        (life9_155)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding")));
        (life9_155)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life9_155)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.gD.t)).put(((java.lang.Object)(life8_150)), ((java.lang.Object)(life9_155)));
    }
        life11_188 = new javax.crypto.spec.DESKeySpec(life4_77);
        life12_195 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life9_155)[1])))).generateSecret(((java.security.spec.KeySpec)(life11_188)));
        life13_200 = ((javax.crypto.Cipher)((life9_155)[0]));
        ((javax.crypto.Cipher)(life13_200)).init(((int)(2)), ((java.security.Key)(life12_195)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life9_155)[2])))));
        life10_212 = ((javax.crypto.Cipher)(life13_200)).doFinal(((byte[])(life7_146)));
    } catch (java.lang.Exception life11_214) {
        throw new java.lang.RuntimeException("moom/gD", life11_214);
    }
        life11_290 = (((((((((((long) (life10_212)[0]) & 255L) << 56) | ((((long) (life10_212)[1]) & 255L) << 48)) | ((((long) (life10_212)[2]) & 255L) << 40)) | ((((long) (life10_212)[3]) & 255L) << 32)) | ((((long) (life10_212)[4]) & 255L) << 24)) | ((((long) (life10_212)[5]) & 255L) << 16)) | ((((long) (life10_212)[6]) & 255L) << 8)) | (((long) (life10_212)[7]) & 255L));
        (moom.gD.s)[life3_8] = java.lang.Long.valueOf(((long)(life11_290)));
    }
    return ((java.lang.Long)((moom.gD.s)[life3_8])).longValue();
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral7687_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/gD"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static long c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    long local7 = moom.gD.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local9 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Long.TYPE)), ((java.lang.Object)(java.lang.Long.valueOf(((long)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local9)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x5DA2;
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
                throw new RuntimeException("moom/gD", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            gD.p[n2] = n4;
        }
        return p[n2];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.gD.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral7688_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/gD"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(boolean p0) {
if ((__sourceIntrinsic_booleanComparison(p0) != 0)) {
        if ((((this.l) ? 1 : 0) == 0)) {
        this.k = ((long)(net.minecraft.client.Minecraft.a__Long()));
    }
    }
    this.l = ((boolean)(p0));
    return;
}


public java.lang.String a(moom.jX p0) {
java.lang.Object local2 = ((((moom.jX)(p0)).a__C5() != null) ? ((net.minecraft.util.IChatComponent)(((moom.jX)(p0)).a__C5())).c() : moom.Bk.a(((moom.Bj)(((moom.jX)(p0)).a__Bk())), ((java.lang.String)(((com.mojang.authlib.GameProfile)(((moom.jX)(p0)).a__GameProfile())).getName()))));
    return ((com.moon.oj)(((com.moon.og)(((com.moon.od)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__od())).a__og())).a__oj())).a(((java.lang.String)(local2)));
}


public void a() {
this.j = ((net.minecraft.util.IChatComponent)(null));
    this.i = ((net.minecraft.util.IChatComponent)(null));
    return;
}


public void a(net.minecraft.util.IChatComponent p0) {
this.i = ((net.minecraft.util.IChatComponent)(p0));
    return;
}


private void a(net.minecraft.scoreboard.ScoreObjective p0, int p1, java.lang.String p2, int p3, int p4, moom.jX p5) {
int forestValue845_159_0;
    moom.gD forestValue845_201_0;
    float forestValue845_201_1;
    float forestValue845_201_2;
    moom.gD forestValue845_206_0;
    float forestValue845_206_1;
    float forestValue845_206_2;
    int forestValue845_206_3;
    moom.gD forestValue845_243_0;
    float forestValue845_243_1;
    float forestValue845_243_2;
    moom.gD forestValue845_248_0;
    float forestValue845_248_1;
    float forestValue845_248_2;
    int forestValue845_248_3;
    moom.gD forestValue845_362_0;
    float forestValue845_362_1;
    float forestValue845_362_2;
    moom.gD forestValue845_367_0;
    float forestValue845_367_1;
    float forestValue845_367_2;
    int forestValue845_367_3;
    moom.gD forestValue845_409_0;
    float forestValue845_409_1;
    float forestValue845_409_2;
    moom.gD forestValue845_414_0;
    float forestValue845_414_1;
    float forestValue845_414_2;
    int forestValue845_414_3;
    moom.gD spill845_0;
    float spill845_1;
    float spill845_2;
    moom.gD spill845_3;
    float spill845_4;
    float spill845_5;
    moom.gD spill845_6;
    float spill845_7;
    float spill845_8;
    moom.gD spill845_9;
    float spill845_10;
    float spill845_11;
    long life7_3;
    int life9_10;
    int life10_111;
    int life11_130;
    int life12_165;
    float life13_179;
    int life14_185;
    int life14_228;
    float life14_449;
    int life15_473;
    java.lang.String life16_479;
    java.lang.String life10_520;
    forest_join_529: {
    forest_join_504: {
    forest_join_503: {
    forest_join_480: {
    forest_join_429: {
    forest_join_428: {
    forest_join_220: {
    forest_join_159: {
    forest_join_158: {
    forest_join_91: {
    forest_join_82: {
    forest_join_65: {
    forest_join_46: {
    life7_3 = (moom.gD.n ^ 132473213863946L);
    life9_10 = ((net.minecraft.scoreboard.Score)(((net.minecraft.scoreboard.Scoreboard)(((net.minecraft.scoreboard.ScoreObjective)(p0)).a__Bh())).a(((java.lang.String)(p2)), ((net.minecraft.scoreboard.ScoreObjective)(p0))))).a();
    if (!((((net.minecraft.scoreboard.ScoreObjective)(p0)).a__bn() == moom.bn.HEARTS))) {
        break forest_join_504;
    }
    ((net.minecraft.client.renderer.texture.TextureManager)(((net.minecraft.client.Minecraft)(this.g)).a__ok())).a__Void(((moom.DD)(moom.gD.c)));
    if (!((recovery.source.CarrierOps.lcmp(((long)(this.k)), ((long)(((moom.jX)(p5)).c__Long()))) == 0))) {
        break forest_join_65;
    }
    if (!((life9_10 < ((moom.jX)(p5)).b()))) {
        break forest_join_46;
    }
    ((moom.jX)(p5)).a(((long)(net.minecraft.client.Minecraft.a__Long())));
    ((moom.jX)(p5)).b(((long)(((long) (((net.minecraft.client.gui.GuiIngame)(this.h)).a() + __sourceIntrinsic_01156e59c2bb_invokedynamic845_18(20265, (204434258155441705L ^ life7_3)))))));
    break forest_join_65;
    }
    if (!((life9_10 > ((moom.jX)(p5)).b()))) {
        break forest_join_65;
    }
    ((moom.jX)(p5)).a(((long)(net.minecraft.client.Minecraft.a__Long())));
    ((moom.jX)(p5)).b(((long)(((long) (((net.minecraft.client.gui.GuiIngame)(this.h)).a() + __sourceIntrinsic_01156e59c2bb_invokedynamic845_25(20516, (4192579877007036724L ^ life7_3)))))));
    }
    if (!((recovery.source.CarrierOps.lcmp(((long)((net.minecraft.client.Minecraft.a__Long() - ((moom.jX)(p5)).a__Long()))), ((long)(__sourceIntrinsic_01156e59c2bb_invokedynamic845_29(345, (7447325648183152062L ^ life7_3))))) <= 0))) {
        break forest_join_82;
    }
    if (!((recovery.source.CarrierOps.lcmp(((long)(this.k)), ((long)(((moom.jX)(p5)).c__Long()))) != 0))) {
        break forest_join_91;
    }
    }
    ((moom.jX)(p5)).b(((int)(life9_10)));
    ((moom.jX)(p5)).c(((int)(life9_10)));
    ((moom.jX)(p5)).a(((long)(net.minecraft.client.Minecraft.a__Long())));
    }
    ((moom.jX)(p5)).c(((long)(this.k)));
    ((moom.jX)(p5)).b(((int)(life9_10)));
    life10_111 = moom.Dr.b__Int(((float)((((float) java.lang.Math.max(((int)(life9_10)), ((int)(((moom.jX)(p5)).c())))) / 0x1.0p1f))));
    life11_130 = java.lang.Math.max(((int)(moom.Dr.b__Int(((float)(((float) (life9_10 / 2))))))), ((int)(java.lang.Math.max(((int)(moom.Dr.b__Int(((float)(((float) (((moom.jX)(p5)).c() / 2))))))), ((int)(__sourceIntrinsic_01156e59c2bb_invokedynamic845_47(20516, (4192579877007036724L ^ life7_3))))))));
    if (!((recovery.source.CarrierOps.lcmp(((long)(((moom.jX)(p5)).b__Long())), ((long)(((long) ((net.minecraft.client.gui.GuiIngame)(this.h)).a())))) > 0))) {
        break forest_join_158;
    }
    if (!((recovery.source.CarrierOps.lcmp(((long)((((((moom.jX)(p5)).b__Long() - ((long) ((net.minecraft.client.gui.GuiIngame)(this.h)).a())) / __sourceIntrinsic_01156e59c2bb_invokedynamic845_57(5817, (1473426675068951133L ^ life7_3))) % __sourceIntrinsic_01156e59c2bb_invokedynamic845_58(2809, (7916671060170229276L ^ life7_3))))), ((long)(1L))) == 0))) {
        break forest_join_158;
    }
    forestValue845_159_0 = 1;
    break forest_join_159;
    }
    forestValue845_159_0 = 0;
    }
    life12_165 = forestValue845_159_0;
    if (!((life10_111 > 0))) {
        break forest_join_503;
    }
    life13_179 = java.lang.Math.min(((float)((((float) ((p4 - p3) - 4)) / ((float) life11_130)))), ((float)(0x1.2p3f)));
    if (!((recovery.source.CarrierOps.fcmpl(((float)(life13_179)), ((float)(0x1.8p1f))) > 0))) {
        break forest_join_429;
    }
    life14_185 = life10_111;
    forest_cycle_180: while (true) {
    forest_join_206: {
    forest_join_201: {
    if (!((life14_185 < life11_130))) {
        break forest_join_220;
    }
    spill845_0 = this;
    spill845_1 = (((float) p3) + (((float) life14_185) * life13_179));
    spill845_2 = ((float) p1);
    if (!((life12_165 != 0))) {
        forestValue845_201_0 = spill845_0;
        forestValue845_201_1 = spill845_1;
        forestValue845_201_2 = spill845_2;
        break forest_join_201;
    }
    forestValue845_206_0 = spill845_0;
    forestValue845_206_1 = spill845_1;
    forestValue845_206_2 = spill845_2;
    forestValue845_206_3 = __sourceIntrinsic_01156e59c2bb_invokedynamic845_62(5089, (56514715744195272L ^ life7_3));
    break forest_join_206;
    }
    forestValue845_206_0 = forestValue845_201_0;
    forestValue845_206_1 = forestValue845_201_1;
    forestValue845_206_2 = forestValue845_201_2;
    forestValue845_206_3 = __sourceIntrinsic_01156e59c2bb_invokedynamic845_63(11465, (4327954509927935425L ^ life7_3));
    }
    ((moom.gD)(forestValue845_206_0)).a(((float)(forestValue845_206_1)), ((float)(forestValue845_206_2)), ((int)(forestValue845_206_3)), ((int)(0)), ((int)(__sourceIntrinsic_01156e59c2bb_invokedynamic845_64(12476, (8499505927569011091L ^ life7_3)))), ((int)(__sourceIntrinsic_01156e59c2bb_invokedynamic845_65(12476, (8499505927569011091L ^ life7_3)))));
    life14_185 += 1;
    continue forest_cycle_180;
    }
    }
    life14_228 = 0;
    forest_cycle_222: while (true) {
    forest_join_426: {
    forest_join_414: {
    forest_join_409: {
    forest_join_379: {
    forest_join_367: {
    forest_join_362: {
    forest_join_332: {
    forest_join_297: {
    forest_join_248: {
    forest_join_243: {
    if (!((life14_228 < life10_111))) {
        break forest_join_428;
    }
    spill845_3 = this;
    spill845_4 = (((float) p3) + (((float) life14_228) * life13_179));
    spill845_5 = ((float) p1);
    if (!((life12_165 != 0))) {
        forestValue845_243_0 = spill845_3;
        forestValue845_243_1 = spill845_4;
        forestValue845_243_2 = spill845_5;
        break forest_join_243;
    }
    forestValue845_248_0 = spill845_3;
    forestValue845_248_1 = spill845_4;
    forestValue845_248_2 = spill845_5;
    forestValue845_248_3 = __sourceIntrinsic_01156e59c2bb_invokedynamic845_67(25311, (467883108514571230L ^ life7_3));
    break forest_join_248;
    }
    forestValue845_248_0 = forestValue845_243_0;
    forestValue845_248_1 = forestValue845_243_1;
    forestValue845_248_2 = forestValue845_243_2;
    forestValue845_248_3 = __sourceIntrinsic_01156e59c2bb_invokedynamic845_68(28218, (1854923509375938350L ^ life7_3));
    }
    ((moom.gD)(forestValue845_248_0)).a(((float)(forestValue845_248_1)), ((float)(forestValue845_248_2)), ((int)(forestValue845_248_3)), ((int)(0)), ((int)(__sourceIntrinsic_01156e59c2bb_invokedynamic845_69(12476, (8499505927569011091L ^ life7_3)))), ((int)(__sourceIntrinsic_01156e59c2bb_invokedynamic845_70(12476, (8499505927569011091L ^ life7_3)))));
    if (!((life12_165 != 0))) {
        break forest_join_332;
    }
    if (!((((life14_228 * 2) + 1) < ((moom.jX)(p5)).c()))) {
        break forest_join_297;
    }
    ((moom.gD)(this)).a(((float)((((float) p3) + (((float) life14_228) * life13_179)))), ((float)(((float) p1))), ((int)(__sourceIntrinsic_01156e59c2bb_invokedynamic845_73(22677, (5410609712529971641L ^ life7_3)))), ((int)(0)), ((int)(__sourceIntrinsic_01156e59c2bb_invokedynamic845_74(12476, (8499505927569011091L ^ life7_3)))), ((int)(__sourceIntrinsic_01156e59c2bb_invokedynamic845_75(12476, (8499505927569011091L ^ life7_3)))));
    }
    if (!((((life14_228 * 2) + 1) == ((moom.jX)(p5)).c()))) {
        break forest_join_332;
    }
    ((moom.gD)(this)).a(((float)((((float) p3) + (((float) life14_228) * life13_179)))), ((float)(((float) p1))), ((int)(__sourceIntrinsic_01156e59c2bb_invokedynamic845_78(10303, (6787572760002652465L ^ life7_3)))), ((int)(0)), ((int)(__sourceIntrinsic_01156e59c2bb_invokedynamic845_79(12476, (8499505927569011091L ^ life7_3)))), ((int)(__sourceIntrinsic_01156e59c2bb_invokedynamic845_80(12476, (8499505927569011091L ^ life7_3)))));
    }
    if (!((((life14_228 * 2) + 1) < life9_10))) {
        break forest_join_379;
    }
    spill845_6 = this;
    spill845_7 = (((float) p3) + (((float) life14_228) * life13_179));
    spill845_8 = ((float) p1);
    if (!((life14_228 >= __sourceIntrinsic_01156e59c2bb_invokedynamic845_82(20516, (4192579877007036724L ^ life7_3))))) {
        forestValue845_362_0 = spill845_6;
        forestValue845_362_1 = spill845_7;
        forestValue845_362_2 = spill845_8;
        break forest_join_362;
    }
    forestValue845_367_0 = spill845_6;
    forestValue845_367_1 = spill845_7;
    forestValue845_367_2 = spill845_8;
    forestValue845_367_3 = __sourceIntrinsic_01156e59c2bb_invokedynamic845_83(8990, (1173150129954841141L ^ life7_3));
    break forest_join_367;
    }
    forestValue845_367_0 = forestValue845_362_0;
    forestValue845_367_1 = forestValue845_362_1;
    forestValue845_367_2 = forestValue845_362_2;
    forestValue845_367_3 = __sourceIntrinsic_01156e59c2bb_invokedynamic845_84(22585, (255128172257384736L ^ life7_3));
    }
    ((moom.gD)(forestValue845_367_0)).a(((float)(forestValue845_367_1)), ((float)(forestValue845_367_2)), ((int)(forestValue845_367_3)), ((int)(0)), ((int)(__sourceIntrinsic_01156e59c2bb_invokedynamic845_85(12476, (8499505927569011091L ^ life7_3)))), ((int)(__sourceIntrinsic_01156e59c2bb_invokedynamic845_86(12476, (8499505927569011091L ^ life7_3)))));
    }
    if (!((((life14_228 * 2) + 1) == life9_10))) {
        break forest_join_426;
    }
    spill845_9 = this;
    spill845_10 = (((float) p3) + (((float) life14_228) * life13_179));
    spill845_11 = ((float) p1);
    if (!((life14_228 >= __sourceIntrinsic_01156e59c2bb_invokedynamic845_88(20516, (4192579877007036724L ^ life7_3))))) {
        forestValue845_409_0 = spill845_9;
        forestValue845_409_1 = spill845_10;
        forestValue845_409_2 = spill845_11;
        break forest_join_409;
    }
    forestValue845_414_0 = spill845_9;
    forestValue845_414_1 = spill845_10;
    forestValue845_414_2 = spill845_11;
    forestValue845_414_3 = __sourceIntrinsic_01156e59c2bb_invokedynamic845_89(10132, (851948239744657086L ^ life7_3));
    break forest_join_414;
    }
    forestValue845_414_0 = forestValue845_409_0;
    forestValue845_414_1 = forestValue845_409_1;
    forestValue845_414_2 = forestValue845_409_2;
    forestValue845_414_3 = __sourceIntrinsic_01156e59c2bb_invokedynamic845_90(20464, (8939719101840461528L ^ life7_3));
    }
    ((moom.gD)(forestValue845_414_0)).a(((float)(forestValue845_414_1)), ((float)(forestValue845_414_2)), ((int)(forestValue845_414_3)), ((int)(0)), ((int)(__sourceIntrinsic_01156e59c2bb_invokedynamic845_91(12476, (8499505927569011091L ^ life7_3)))), ((int)(__sourceIntrinsic_01156e59c2bb_invokedynamic845_92(12476, (8499505927569011091L ^ life7_3)))));
    }
    life14_228 += 1;
    continue forest_cycle_222;
    }
    }
    break forest_join_503;
    }
    life14_449 = moom.Dr.a(((float)((((float) life9_10) / 0x1.4p4f))), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)));
    life15_473 = ((((int) ((0x1.0p0f - life14_449) * 0x1.fep7f)) << __sourceIntrinsic_01156e59c2bb_invokedynamic845_95(28218, (1854923509375938350L ^ life7_3))) | (((int) (life14_449 * 0x1.fep7f)) << __sourceIntrinsic_01156e59c2bb_invokedynamic845_96(28266, (8624063392500658016L ^ life7_3))));
    life16_479 = __sourceIntrinsic_01156e59c2bb_invokedynamic845_97((((float) life9_10) / 0x1.0p1f));
    if (!(((p4 - ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.Minecraft)(this.g)).N)).a(((java.lang.String)(__sourceIntrinsic_01156e59c2bb_invokedynamic845_100(life16_479))))) >= p3))) {
        break forest_join_480;
    }
    life16_479 = __sourceIntrinsic_01156e59c2bb_invokedynamic845_102(life16_479);
    }
    ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.Minecraft)(this.g)).N)).a(((java.lang.String)(life16_479)), ((float)(((float) (((p4 + p3) / 2) - (((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.Minecraft)(this.g)).N)).a(((java.lang.String)(life16_479))) / 2))))), ((float)(((float) p1))), ((int)(life15_473)));
    }
    break forest_join_529;
    }
    life10_520 = __sourceIntrinsic_01156e59c2bb_invokedynamic845_110(net.minecraft.util.EnumChatFormatting.YELLOW, life9_10);
    ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.Minecraft)(this.g)).N)).a(((java.lang.String)(life10_520)), ((float)(((float) (p4 - ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.Minecraft)(this.g)).N)).a(((java.lang.String)(life10_520))))))), ((float)(((float) p1))), ((int)(__sourceIntrinsic_01156e59c2bb_invokedynamic845_116(10443, (2498617543124445644L ^ life7_3)))));
    }
    return;
}


protected void a(int p0, int p1, int p2, moom.jX p3) {
long life5_3;
    int life7_15;
    int life8_17;
    int life8_22;
    life5_3 = (moom.gD.n ^ 19187826599003L);
    moom.kZ.c(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    ((net.minecraft.client.renderer.texture.TextureManager)(((net.minecraft.client.Minecraft)(this.g)).a__ok())).a__Void(((moom.DD)(moom.gD.c)));
    life7_15 = 0;
    life8_17 = 0;
    if ((((moom.jX)(p3)).a() < 0)) {
        life8_22 = 5;
    } else {
        if ((((moom.jX)(p3)).a() < __sourceIntrinsic_76ad672d0c54_invokedynamic3557_8(2327, (3453321182555972691L ^ life5_3)))) {
        life8_22 = 0;
    } else {
        if ((((moom.jX)(p3)).a() < __sourceIntrinsic_76ad672d0c54_invokedynamic3557_10(2098, (4718764090986308960L ^ life5_3)))) {
        life8_22 = 1;
    } else {
        if ((((moom.jX)(p3)).a() < __sourceIntrinsic_76ad672d0c54_invokedynamic3557_12(23913, (673431260592173102L ^ life5_3)))) {
        life8_22 = 2;
    } else {
        if ((((moom.jX)(p3)).a() < __sourceIntrinsic_76ad672d0c54_invokedynamic3557_14(12708, (5826296506958585064L ^ life5_3)))) {
        life8_22 = 3;
    } else {
        life8_22 = 4;
    }
    }
    }
    }
    }
    moom.gD __stackOp3557_15_0 = this;
    ((moom.gD)(__stackOp3557_15_0)).d = ((float)((((moom.gD)(__stackOp3557_15_0)).d + 0x1.9p6f)));
    ((moom.gD)(this)).b(((int)(((p1 + p0) - __sourceIntrinsic_76ad672d0c54_invokedynamic3557_18(31482, (7512943038996109223L ^ life5_3))))), ((int)(p2)), ((int)((life7_15 * __sourceIntrinsic_76ad672d0c54_invokedynamic3557_19(20491, (7094731209692052828L ^ life5_3))))), ((int)((__sourceIntrinsic_76ad672d0c54_invokedynamic3557_20(14069, (6942375265283054497L ^ life5_3)) + (life8_22 * __sourceIntrinsic_76ad672d0c54_invokedynamic3557_21(12627, (8040989338885692432L ^ life5_3)))))), ((int)(__sourceIntrinsic_76ad672d0c54_invokedynamic3557_22(20516, (4192675498796055909L ^ life5_3)))), ((int)(__sourceIntrinsic_76ad672d0c54_invokedynamic3557_23(28266, (8624035939888382769L ^ life5_3)))));
    moom.gD __stackOp3557_25_0 = this;
    ((moom.gD)(__stackOp3557_25_0)).d = ((float)((((moom.gD)(__stackOp3557_25_0)).d - 0x1.9p6f)));
    return;
}


public void a(int p0, net.minecraft.scoreboard.Scoreboard p1, net.minecraft.scoreboard.ScoreObjective p2) {
int forestValue846_123_0;
    int forestValue846_151_0;
    int forestValue846_152_0;
    int forestValue846_152_1;
    int forestValue846_472_0;
    int forestValue846_472_1;
    int forestValue846_472_2;
    int forestValue846_472_3;
    int forestValue846_477_0;
    int forestValue846_477_1;
    int forestValue846_477_2;
    int forestValue846_477_3;
    int forestValue846_477_4;
    int forestValue846_542_0;
    int forestValue846_562_0;
    int forestValue846_563_0;
    int forestValue846_563_1;
    int forestValue846_574_0;
    int forestValue846_575_0;
    int forestValue846_575_1;
    int forestValue846_620_0;
    int forestValue846_621_0;
    int forestValue846_621_1;
    int forestValue846_632_0;
    int forestValue846_633_0;
    int forestValue846_633_1;
    moom.gD forestValue846_736_0;
    int forestValue846_736_1;
    int forestValue846_736_2;
    moom.gD forestValue846_737_0;
    int forestValue846_737_1;
    int forestValue846_737_2;
    int forestValue846_737_3;
    int spill846_0;
    int spill846_1;
    int spill846_2;
    int spill846_3;
    int spill846_4;
    int spill846_5;
    int spill846_6;
    long spill846_7;
    int spill846_8;
    int spill846_9;
    int spill846_10;
    int spill846_11;
    moom.gD spill846_12;
    int spill846_13;
    int spill846_14;
    long life4_3;
    net.minecraft.client.network.NetHandlerPlayClient life6_19;
    java.util.List life7_24;
    int life8_26;
    int life9_28;
    java.util.Iterator life10_31;
    moom.jX life11_38;
    int life12_46;
    int life12_70;
    java.util.List life7_87;
    int life10_90;
    int life11_92;
    int life12_94;
    int life13_126;
    int life14_139;
    int life15_177;
    int life16_194;
    int life17_199;
    int life18_209;
    java.util.List life19_211;
    java.util.List life20_213;
    java.util.Iterator life21_234;
    java.lang.String life22_241;
    java.util.Iterator life21_271;
    java.lang.String life22_278;
    java.util.Iterator life21_328;
    java.lang.String life22_335;
    int life23_341;
    int life21_405;
    int life22_412;
    int life23_416;
    int life24_426;
    int life25_436;
    moom.jX life26_510;
    java.lang.String life27_514;
    com.mojang.authlib.GameProfile life28_517;
    net.minecraft.entity.player.EntityPlayer life29_526;
    int life30_549;
    int life31_571;
    int life32_583;
    int life33_631;
    int life34_643;
    java.lang.String life27_676;
    int life29_716;
    int life30_720;
    int life17_767;
    java.util.Iterator life21_806;
    java.lang.String life22_813;
    int life23_819;
    forest_join_834: {
    forest_join_743: {
    forest_join_364: {
    forest_join_363: {
    forest_join_284: {
    forest_join_247: {
    forest_join_152: {
    forest_join_151: {
    forest_join_142: {
    forest_join_140: {
    forest_join_137: {
    forest_join_123: {
    forest_join_122: {
    forest_join_120: {
    forest_join_110: {
    forest_join_74: {
    forest_join_14: {
    life4_3 = (moom.gD.n ^ 45014467410313L);
    if (!((this.m == null))) {
        break forest_join_14;
    }
    this.m = ((com.moon.module.impl.Camera)(((com.moon.module.impl.Camera)(((com.moon.fU)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__fU())).a(((java.lang.Class)(com.moon.module.impl.Camera.class)))))));
    }
    life6_19 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(this.g)).K)).cm;
    life7_24 = ((com.google.common.collect.Ordering)(moom.gD.f)).sortedCopy(((java.lang.Iterable)(((net.minecraft.client.network.NetHandlerPlayClient)(life6_19)).a__Collection())));
    life8_26 = 0;
    life9_28 = 0;
    life10_31 = ((java.util.List)(life7_24)).iterator();
    forest_cycle_31: while (true) {
    forest_join_73: {
    if (!(((java.util.Iterator)(life10_31)).hasNext())) {
        break forest_join_74;
    }
    life11_38 = ((moom.jX)(((java.util.Iterator)(life10_31)).next()));
    life12_46 = ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.Minecraft)(this.g)).N)).a(((java.lang.String)(((moom.gD)(this)).a(((moom.jX)(life11_38))))));
    life8_26 = java.lang.Math.max(((int)(life8_26)), ((int)(life12_46)));
    if (!((p2 != null))) {
        break forest_join_73;
    }
    if (!((((net.minecraft.scoreboard.ScoreObjective)(p2)).a__bn() != moom.bn.HEARTS))) {
        break forest_join_73;
    }
    life12_70 = ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.Minecraft)(this.g)).N)).a(((java.lang.String)(__sourceIntrinsic_be919a6e83ba_invokedynamic846_31(((net.minecraft.scoreboard.Score)(((net.minecraft.scoreboard.Scoreboard)(p1)).a(((java.lang.String)(((com.mojang.authlib.GameProfile)(((moom.jX)(life11_38)).a__GameProfile())).getName())), ((net.minecraft.scoreboard.ScoreObjective)(p2))))).a()))));
    life9_28 = java.lang.Math.max(((int)(life9_28)), ((int)(life12_70)));
    }
    continue forest_cycle_31;
    }
    }
    life7_87 = ((java.util.List)(life7_24)).subList(((int)(0)), ((int)(java.lang.Math.min(((int)(((java.util.List)(life7_24)).size())), ((int)(__sourceIntrinsic_be919a6e83ba_invokedynamic846_35(32242, (6683725084086078844L ^ life4_3))))))));
    life10_90 = ((java.util.List)(life7_87)).size();
    life11_92 = life10_90;
    life12_94 = 1;
    forest_cycle_93: while (true) {
    if (!((life11_92 > __sourceIntrinsic_be919a6e83ba_invokedynamic846_39(16130, (125695603709267843L ^ life4_3))))) {
        break forest_join_110;
    }
    life12_94 += 1;
    life11_92 = (((life10_90 + life12_94) - 1) / life12_94);
    continue forest_cycle_93;
    }
    }
    if (!((!((net.minecraft.client.Minecraft)(this.g)).j__Boolean()))) {
        break forest_join_120;
    }
    if (!(((net.minecraft.network.NetworkManager)(((net.minecraft.client.network.NetHandlerPlayClient)(((net.minecraft.client.Minecraft)(this.g)).a__jS())).a__r())).b__Boolean())) {
        break forest_join_122;
    }
    }
    forestValue846_123_0 = 1;
    break forest_join_123;
    }
    forestValue846_123_0 = 0;
    }
    life13_126 = forestValue846_123_0;
    if (!((p2 != null))) {
        break forest_join_140;
    }
    if (!((((net.minecraft.scoreboard.ScoreObjective)(p2)).a__bn() == moom.bn.HEARTS))) {
        break forest_join_137;
    }
    life14_139 = __sourceIntrinsic_be919a6e83ba_invokedynamic846_48(3910, (1128298151741095903L ^ life4_3));
    break forest_join_142;
    }
    life14_139 = life9_28;
    break forest_join_142;
    }
    life14_139 = 0;
    }
    spill846_0 = life12_94;
    if (!((life13_126 != 0))) {
        forestValue846_151_0 = spill846_0;
        break forest_join_151;
    }
    forestValue846_152_0 = spill846_0;
    forestValue846_152_1 = __sourceIntrinsic_be919a6e83ba_invokedynamic846_49(19351, (8270841483818810120L ^ life4_3));
    break forest_join_152;
    }
    forestValue846_152_0 = forestValue846_151_0;
    forestValue846_152_1 = 0;
    }
    life15_177 = (java.lang.Math.min(((int)((forestValue846_152_0 * (((forestValue846_152_1 + life8_26) + life14_139) + __sourceIntrinsic_be919a6e83ba_invokedynamic846_50(14251, (2502374144234932022L ^ life4_3)))))), ((int)((p0 - __sourceIntrinsic_be919a6e83ba_invokedynamic846_51(30784, (2248580788998342875L ^ life4_3)))))) / life12_94);
    spill846_1 = 20516;
    life16_194 = ((p0 / 2) - (((life15_177 * life12_94) + ((life12_94 - 1) * 5)) / 2));
    life17_199 = __sourceIntrinsic_be919a6e83ba_invokedynamic846_53(spill846_1, (4192668339970547895L ^ life4_3));
    life18_209 = ((life15_177 * life12_94) + ((life12_94 - 1) * 5));
    life19_211 = null;
    life20_213 = null;
    if (!((this.j != null))) {
        break forest_join_247;
    }
    life19_211 = ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.Minecraft)(this.g)).N)).a__List(((java.lang.String)(((net.minecraft.util.IChatComponent)(this.j)).c())), ((int)((p0 - __sourceIntrinsic_be919a6e83ba_invokedynamic846_59(5338, (1613261552379126850L ^ life4_3))))));
    life21_234 = ((java.util.List)(life19_211)).iterator();
    forest_cycle_231: while (true) {
    if (!(((java.util.Iterator)(life21_234)).hasNext())) {
        break forest_join_247;
    }
    life22_241 = ((java.lang.String)(((java.util.Iterator)(life21_234)).next()));
    life18_209 = java.lang.Math.max(((int)(life18_209)), ((int)(((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.Minecraft)(this.g)).N)).a(((java.lang.String)(life22_241))))));
    continue forest_cycle_231;
    }
    }
    if (!((this.i != null))) {
        break forest_join_284;
    }
    life20_213 = ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.Minecraft)(this.g)).N)).a__List(((java.lang.String)(((net.minecraft.util.IChatComponent)(this.i)).c())), ((int)((p0 - __sourceIntrinsic_be919a6e83ba_invokedynamic846_74(5338, (1613261552379126850L ^ life4_3))))));
    life21_271 = ((java.util.List)(life20_213)).iterator();
    forest_cycle_268: while (true) {
    if (!(((java.util.Iterator)(life21_271)).hasNext())) {
        break forest_join_284;
    }
    life22_278 = ((java.lang.String)(((java.util.Iterator)(life21_271)).next()));
    life18_209 = java.lang.Math.max(((int)(life18_209)), ((int)(((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.Minecraft)(this.g)).N)).a(((java.lang.String)(life22_278))))));
    continue forest_cycle_268;
    }
    }
    if (!((life19_211 != null))) {
        break forest_join_364;
    }
    moom.gD.a(((int)((((p0 / 2) - (life18_209 / 2)) - 1))), ((int)((life17_199 - 1))), ((int)((((p0 / 2) + (life18_209 / 2)) + 1))), ((int)((life17_199 + (((java.util.List)(life19_211)).size() * ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.Minecraft)(this.g)).N)).c)))), ((int)(__sourceIntrinsic_be919a6e83ba_invokedynamic846_88(8080, (7148878018070310660L ^ life4_3)))));
    life21_328 = ((java.util.List)(life19_211)).iterator();
    forest_cycle_325: while (true) {
    if (!(((java.util.Iterator)(life21_328)).hasNext())) {
        break forest_join_363;
    }
    life22_335 = ((java.lang.String)(((java.util.Iterator)(life21_328)).next()));
    life23_341 = ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.Minecraft)(this.g)).N)).a(((java.lang.String)(life22_335)));
    ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.Minecraft)(this.g)).N)).a(((java.lang.String)(life22_335)), ((float)(((float) ((p0 / 2) - (life23_341 / 2))))), ((float)(((float) life17_199))), ((int)(-1)));
    life17_199 = (life17_199 + ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.Minecraft)(this.g)).N)).c);
    continue forest_cycle_325;
    }
    }
    life17_199 += 1;
    }
    moom.gD.a(((int)((((p0 / 2) - (life18_209 / 2)) - 1))), ((int)((life17_199 - 1))), ((int)((((p0 / 2) + (life18_209 / 2)) + 1))), ((int)((life17_199 + (life11_92 * __sourceIntrinsic_be919a6e83ba_invokedynamic846_103(12476, (8499452553398829072L ^ life4_3)))))), ((int)(__sourceIntrinsic_be919a6e83ba_invokedynamic846_104(21494, (2461289981680067452L ^ life4_3)))));
    life21_405 = 0;
    forest_cycle_402: while (true) {
    forest_join_741: {
    forest_join_737: {
    forest_join_736: {
    forest_join_725: {
    forest_join_695: {
    forest_join_684: {
    forest_join_660: {
    forest_join_659: {
    forest_join_633: {
    forest_join_632: {
    forest_join_621: {
    forest_join_620: {
    forest_join_575: {
    forest_join_574: {
    forest_join_563: {
    forest_join_562: {
    forest_join_542: {
    forest_join_541: {
    forest_join_539: {
    forest_join_477: {
    forest_join_472: {
    if (!((life21_405 < life10_90))) {
        break forest_join_743;
    }
    life22_412 = (life21_405 / life11_92);
    life23_416 = (life21_405 % life11_92);
    life24_426 = ((life16_194 + (life22_412 * life15_177)) + (life22_412 * 5));
    life25_436 = (life17_199 + (life23_416 * __sourceIntrinsic_be919a6e83ba_invokedynamic846_106(12476, (8499452553398829072L ^ life4_3))));
    moom.kZ.l();
    moom.kZ.a(((int)(__sourceIntrinsic_be919a6e83ba_invokedynamic846_108(6333, (1478824975572494369L ^ life4_3)))), ((int)(__sourceIntrinsic_be919a6e83ba_invokedynamic846_109(4267, (5977784497396637740L ^ life4_3)))), ((int)(1)), ((int)(0)));
    spill846_2 = life24_426;
    spill846_3 = life25_436;
    spill846_4 = (life24_426 + life15_177);
    spill846_5 = (life25_436 + __sourceIntrinsic_be919a6e83ba_invokedynamic846_111(28266, (8623974913583062755L ^ life4_3)));
    if (!(((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.Camera)(this.m)).t)).getValue())))).booleanValue())) {
        forestValue846_472_0 = spill846_2;
        forestValue846_472_1 = spill846_3;
        forestValue846_472_2 = spill846_4;
        forestValue846_472_3 = spill846_5;
        break forest_join_472;
    }
    forestValue846_477_0 = spill846_2;
    forestValue846_477_1 = spill846_3;
    forestValue846_477_2 = spill846_4;
    forestValue846_477_3 = spill846_5;
    forestValue846_477_4 = __sourceIntrinsic_be919a6e83ba_invokedynamic846_117(27062, (5450164413850917178L ^ life4_3));
    break forest_join_477;
    }
    forestValue846_477_0 = forestValue846_472_0;
    forestValue846_477_1 = forestValue846_472_1;
    forestValue846_477_2 = forestValue846_472_2;
    forestValue846_477_3 = forestValue846_472_3;
    forestValue846_477_4 = __sourceIntrinsic_be919a6e83ba_invokedynamic846_118(27272, (6258813656411478565L ^ life4_3));
    }
    moom.gD.a(((int)(forestValue846_477_0)), ((int)(forestValue846_477_1)), ((int)(forestValue846_477_2)), ((int)(forestValue846_477_3)), ((int)(forestValue846_477_4)));
    spill846_6 = 15898;
    moom.kZ.c(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    spill846_7 = (4039872398552419978L ^ life4_3);
    moom.kZ.d__Void();
    moom.kZ.l();
    moom.kZ.a(((int)(__sourceIntrinsic_be919a6e83ba_invokedynamic846_123(spill846_6, spill846_7))), ((int)(__sourceIntrinsic_be919a6e83ba_invokedynamic846_124(20769, (4705099134518075817L ^ life4_3)))), ((int)(1)), ((int)(0)));
    if (!((life21_405 < ((java.util.List)(life7_87)).size()))) {
        break forest_join_741;
    }
    life26_510 = ((moom.jX)(((java.util.List)(life7_87)).get(((int)(life21_405)))));
    life27_514 = ((moom.gD)(this)).a(((moom.jX)(life26_510)));
    life28_517 = ((moom.jX)(life26_510)).a__GameProfile();
    if (!((life13_126 != 0))) {
        break forest_join_660;
    }
    life29_526 = ((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(this.g)).I)).a(((java.util.UUID)(((com.mojang.authlib.GameProfile)(life28_517)).getId())));
    if (!((life29_526 != null))) {
        break forest_join_541;
    }
    if (!(((net.minecraft.entity.player.EntityPlayer)(life29_526)).a(((net.minecraft.entity.player.EnumPlayerModelParts)(net.minecraft.entity.player.EnumPlayerModelParts.CAPE))))) {
        break forest_join_541;
    }
    if (!((!((java.lang.String)(((com.mojang.authlib.GameProfile)(life28_517)).getName())).equals(((java.lang.Object)("Dinnerbone")))))) {
        break forest_join_539;
    }
    if (!(((java.lang.String)(((com.mojang.authlib.GameProfile)(life28_517)).getName())).equals(((java.lang.Object)("Grumm"))))) {
        break forest_join_541;
    }
    }
    forestValue846_542_0 = 1;
    break forest_join_542;
    }
    forestValue846_542_0 = 0;
    }
    life30_549 = forestValue846_542_0;
    ((net.minecraft.client.renderer.texture.TextureManager)(((net.minecraft.client.Minecraft)(this.g)).a__ok())).a__Void(((moom.DD)(((moom.jX)(life26_510)).a__DD())));
    spill846_8 = __sourceIntrinsic_be919a6e83ba_invokedynamic846_145(28266, (8623974913583062755L ^ life4_3));
    if (!((life30_549 != 0))) {
        forestValue846_562_0 = spill846_8;
        break forest_join_562;
    }
    forestValue846_563_0 = spill846_8;
    forestValue846_563_1 = __sourceIntrinsic_be919a6e83ba_invokedynamic846_146(28266, (8623974913583062755L ^ life4_3));
    break forest_join_563;
    }
    forestValue846_563_0 = forestValue846_562_0;
    forestValue846_563_1 = 0;
    }
    life31_571 = (forestValue846_563_0 + forestValue846_563_1);
    spill846_9 = __sourceIntrinsic_be919a6e83ba_invokedynamic846_147(28266, (8623974913583062755L ^ life4_3));
    if (!((life30_549 != 0))) {
        forestValue846_574_0 = spill846_9;
        break forest_join_574;
    }
    forestValue846_575_0 = spill846_9;
    forestValue846_575_1 = -1;
    break forest_join_575;
    }
    forestValue846_575_0 = forestValue846_574_0;
    forestValue846_575_1 = 1;
    }
    life32_583 = (forestValue846_575_0 * forestValue846_575_1);
    net.minecraft.client.gui.Gui.a(((int)(life24_426)), ((int)(life25_436)), ((float)(0x1.0p3f)), ((float)(((float) life31_571))), ((int)(__sourceIntrinsic_be919a6e83ba_invokedynamic846_148(28266, (8623974913583062755L ^ life4_3)))), ((int)(life32_583)), ((int)(__sourceIntrinsic_be919a6e83ba_invokedynamic846_149(28266, (8623974913583062755L ^ life4_3)))), ((int)(__sourceIntrinsic_be919a6e83ba_invokedynamic846_150(28266, (8623974913583062755L ^ life4_3)))), ((float)(0x1.0p6f)), ((float)(0x1.0p6f)));
    if (!((life29_526 != null))) {
        break forest_join_659;
    }
    if (!(((net.minecraft.entity.player.EntityPlayer)(life29_526)).a(((net.minecraft.entity.player.EnumPlayerModelParts)(net.minecraft.entity.player.EnumPlayerModelParts.HAT))))) {
        break forest_join_659;
    }
    spill846_10 = __sourceIntrinsic_be919a6e83ba_invokedynamic846_154(28266, (8623974913583062755L ^ life4_3));
    if (!((life30_549 != 0))) {
        forestValue846_620_0 = spill846_10;
        break forest_join_620;
    }
    forestValue846_621_0 = spill846_10;
    forestValue846_621_1 = __sourceIntrinsic_be919a6e83ba_invokedynamic846_155(28266, (8623974913583062755L ^ life4_3));
    break forest_join_621;
    }
    forestValue846_621_0 = forestValue846_620_0;
    forestValue846_621_1 = 0;
    }
    life33_631 = (forestValue846_621_0 + forestValue846_621_1);
    spill846_11 = __sourceIntrinsic_be919a6e83ba_invokedynamic846_156(28266, (8623974913583062755L ^ life4_3));
    if (!((life30_549 != 0))) {
        forestValue846_632_0 = spill846_11;
        break forest_join_632;
    }
    forestValue846_633_0 = spill846_11;
    forestValue846_633_1 = -1;
    break forest_join_633;
    }
    forestValue846_633_0 = forestValue846_632_0;
    forestValue846_633_1 = 1;
    }
    life34_643 = (forestValue846_633_0 * forestValue846_633_1);
    net.minecraft.client.gui.Gui.a(((int)(life24_426)), ((int)(life25_436)), ((float)(0x1.4p5f)), ((float)(((float) life33_631))), ((int)(__sourceIntrinsic_be919a6e83ba_invokedynamic846_157(28266, (8623974913583062755L ^ life4_3)))), ((int)(life34_643)), ((int)(__sourceIntrinsic_be919a6e83ba_invokedynamic846_158(28266, (8623974913583062755L ^ life4_3)))), ((int)(__sourceIntrinsic_be919a6e83ba_invokedynamic846_159(28266, (8623974913583062755L ^ life4_3)))), ((float)(0x1.0p6f)), ((float)(0x1.0p6f)));
    }
    life24_426 += 9;
    }
    if (!((((moom.jX)(life26_510)).a__bE() == net.minecraft.world.WorldSettings$GameType.SPECTATOR))) {
        break forest_join_684;
    }
    life27_676 = __sourceIntrinsic_be919a6e83ba_invokedynamic846_164(net.minecraft.util.EnumChatFormatting.ITALIC, life27_514);
    ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.Minecraft)(this.g)).N)).a(((java.lang.String)(life27_676)), ((float)(((float) life24_426))), ((float)(((float) life25_436))), ((int)(__sourceIntrinsic_be919a6e83ba_invokedynamic846_167(13841, (5191415142213076611L ^ life4_3)))));
    break forest_join_695;
    }
    ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.Minecraft)(this.g)).N)).a(((java.lang.String)(life27_514)), ((float)(((float) life24_426))), ((float)(((float) life25_436))), ((int)(-1)));
    }
    if (!((p2 != null))) {
        break forest_join_725;
    }
    if (!((((moom.jX)(life26_510)).a__bE() != net.minecraft.world.WorldSettings$GameType.SPECTATOR))) {
        break forest_join_725;
    }
    life29_716 = ((life24_426 + life8_26) + 1);
    life30_720 = (life29_716 + life14_139);
    if (!(((life30_720 - life29_716) > 5))) {
        break forest_join_725;
    }
    ((moom.gD)(this)).a(((net.minecraft.scoreboard.ScoreObjective)(p2)), ((int)(life25_436)), ((java.lang.String)(((com.mojang.authlib.GameProfile)(life28_517)).getName())), ((int)(life29_716)), ((int)(life30_720)), ((moom.jX)(life26_510)));
    }
    spill846_12 = this;
    spill846_13 = life15_177;
    spill846_14 = life24_426;
    if (!((life13_126 != 0))) {
        forestValue846_736_0 = spill846_12;
        forestValue846_736_1 = spill846_13;
        forestValue846_736_2 = spill846_14;
        break forest_join_736;
    }
    forestValue846_737_0 = spill846_12;
    forestValue846_737_1 = spill846_13;
    forestValue846_737_2 = spill846_14;
    forestValue846_737_3 = __sourceIntrinsic_be919a6e83ba_invokedynamic846_176(12476, (8499452553398829072L ^ life4_3));
    break forest_join_737;
    }
    forestValue846_737_0 = forestValue846_736_0;
    forestValue846_737_1 = forestValue846_736_1;
    forestValue846_737_2 = forestValue846_736_2;
    forestValue846_737_3 = 0;
    }
    ((moom.gD)(forestValue846_737_0)).a(((int)(forestValue846_737_1)), ((int)((forestValue846_737_2 - forestValue846_737_3))), ((int)(life25_436)), ((moom.jX)(life26_510)));
    }
    life21_405 += 1;
    continue forest_cycle_402;
    }
    }
    if (!((life20_213 != null))) {
        break forest_join_834;
    }
    life17_767 = ((life17_199 + (life11_92 * __sourceIntrinsic_be919a6e83ba_invokedynamic846_178(12476, (8499452553398829072L ^ life4_3)))) + 1);
    moom.gD.a(((int)((((p0 / 2) - (life18_209 / 2)) - 1))), ((int)((life17_767 - 1))), ((int)((((p0 / 2) + (life18_209 / 2)) + 1))), ((int)((life17_767 + (((java.util.List)(life20_213)).size() * ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.Minecraft)(this.g)).N)).c)))), ((int)(__sourceIntrinsic_be919a6e83ba_invokedynamic846_183(21494, (2461289981680067452L ^ life4_3)))));
    life21_806 = ((java.util.List)(life20_213)).iterator();
    forest_cycle_796: while (true) {
    if (!(((java.util.Iterator)(life21_806)).hasNext())) {
        break forest_join_834;
    }
    life22_813 = ((java.lang.String)(((java.util.Iterator)(life21_806)).next()));
    life23_819 = ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.Minecraft)(this.g)).N)).a(((java.lang.String)(life22_813)));
    ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.Minecraft)(this.g)).N)).a(((java.lang.String)(life22_813)), ((float)(((float) ((p0 / 2) - (life23_819 / 2))))), ((float)(((float) life17_767))), ((int)(-1)));
    life17_767 = (life17_767 + ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.Minecraft)(this.g)).N)).c);
    continue forest_cycle_796;
    }
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static native <E extends Throwable> int __sourceIntrinsic_76ad672d0c54_invokedynamic3557_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_76ad672d0c54_invokedynamic3557_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_76ad672d0c54_invokedynamic3557_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_76ad672d0c54_invokedynamic3557_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_76ad672d0c54_invokedynamic3557_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_76ad672d0c54_invokedynamic3557_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_76ad672d0c54_invokedynamic3557_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_76ad672d0c54_invokedynamic3557_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_76ad672d0c54_invokedynamic3557_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_76ad672d0c54_invokedynamic3557_23(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_be919a6e83ba_invokedynamic846_31(int a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_be919a6e83ba_invokedynamic846_35(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_be919a6e83ba_invokedynamic846_39(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_be919a6e83ba_invokedynamic846_48(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_be919a6e83ba_invokedynamic846_49(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_be919a6e83ba_invokedynamic846_50(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_be919a6e83ba_invokedynamic846_51(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_be919a6e83ba_invokedynamic846_53(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_be919a6e83ba_invokedynamic846_59(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_be919a6e83ba_invokedynamic846_74(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_be919a6e83ba_invokedynamic846_88(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_be919a6e83ba_invokedynamic846_103(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_be919a6e83ba_invokedynamic846_104(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_be919a6e83ba_invokedynamic846_106(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_be919a6e83ba_invokedynamic846_108(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_be919a6e83ba_invokedynamic846_109(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_be919a6e83ba_invokedynamic846_111(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_be919a6e83ba_invokedynamic846_117(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_be919a6e83ba_invokedynamic846_118(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_be919a6e83ba_invokedynamic846_123(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_be919a6e83ba_invokedynamic846_124(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_be919a6e83ba_invokedynamic846_145(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_be919a6e83ba_invokedynamic846_146(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_be919a6e83ba_invokedynamic846_147(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_be919a6e83ba_invokedynamic846_148(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_be919a6e83ba_invokedynamic846_149(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_be919a6e83ba_invokedynamic846_150(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_be919a6e83ba_invokedynamic846_154(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_be919a6e83ba_invokedynamic846_155(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_be919a6e83ba_invokedynamic846_156(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_be919a6e83ba_invokedynamic846_157(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_be919a6e83ba_invokedynamic846_158(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_be919a6e83ba_invokedynamic846_159(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_be919a6e83ba_invokedynamic846_164(net.minecraft.util.EnumChatFormatting a0, java.lang.String a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_be919a6e83ba_invokedynamic846_167(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_be919a6e83ba_invokedynamic846_176(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_be919a6e83ba_invokedynamic846_178(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_be919a6e83ba_invokedynamic846_183(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral7688_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01156e59c2bb_invokedynamic845_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01156e59c2bb_invokedynamic845_25(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_01156e59c2bb_invokedynamic845_29(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01156e59c2bb_invokedynamic845_47(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_01156e59c2bb_invokedynamic845_57(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_01156e59c2bb_invokedynamic845_58(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01156e59c2bb_invokedynamic845_62(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01156e59c2bb_invokedynamic845_63(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01156e59c2bb_invokedynamic845_64(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01156e59c2bb_invokedynamic845_65(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01156e59c2bb_invokedynamic845_67(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01156e59c2bb_invokedynamic845_68(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01156e59c2bb_invokedynamic845_69(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01156e59c2bb_invokedynamic845_70(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01156e59c2bb_invokedynamic845_73(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01156e59c2bb_invokedynamic845_74(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01156e59c2bb_invokedynamic845_75(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01156e59c2bb_invokedynamic845_78(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01156e59c2bb_invokedynamic845_79(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01156e59c2bb_invokedynamic845_80(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01156e59c2bb_invokedynamic845_82(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01156e59c2bb_invokedynamic845_83(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01156e59c2bb_invokedynamic845_84(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01156e59c2bb_invokedynamic845_85(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01156e59c2bb_invokedynamic845_86(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01156e59c2bb_invokedynamic845_88(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01156e59c2bb_invokedynamic845_89(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01156e59c2bb_invokedynamic845_90(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01156e59c2bb_invokedynamic845_91(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01156e59c2bb_invokedynamic845_92(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01156e59c2bb_invokedynamic845_95(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01156e59c2bb_invokedynamic845_96(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_01156e59c2bb_invokedynamic845_97(float a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_01156e59c2bb_invokedynamic845_100(java.lang.String a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_01156e59c2bb_invokedynamic845_102(java.lang.String a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_01156e59c2bb_invokedynamic845_110(net.minecraft.util.EnumChatFormatting a0, int a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01156e59c2bb_invokedynamic845_116(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral7687_0() throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
