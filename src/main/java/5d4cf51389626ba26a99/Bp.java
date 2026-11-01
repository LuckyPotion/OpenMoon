package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Bp extends moom.Bo {

private boolean l;

private boolean m;

private int n;

private int o;

private static java.lang.String[] p;

private static final long r;

private static final long[] t;

private static final java.lang.Integer[] u;

private static final java.util.Map v;

private static final long[] w;

private static final java.lang.Long[] x;

private static final java.util.Map y;

public Bp(net.minecraft.world.World p0) {
super(p0);
}


static {
r = ((long)(((moom._a)(moom._c.a(((long)(-6972538268281820154L)), ((long)(-7739261376616601643L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(189818027809267L)))));
    java.lang.Object __sourceSpill493_6 = null;
    v = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life8 = (moom.Bp.r ^ 102634678927402L);
    moom.Bp.b(((java.lang.String[])(__sourceSpill493_6)));
    javax.crypto.Cipher local13_life11;
    javax.crypto.Cipher __sourceSpill493_13 = (local13_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill493_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill493_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill493_16 = new byte[8];
    (__sourceSpill493_16)[0] = ((byte) ((int) (local11_life8 >>> 56)));
    int local14_life17 = 1;
    while ((local14_life17 < 8)) {
        (__sourceSpill493_16)[local14_life17] = ((byte) ((int) ((local11_life8 << (local14_life17 * 8)) >>> 56)));
        local14_life17 += 1;
    }
    byte[] __sourcePreallocation493_18 = __sourceSpill493_16;
    ((javax.crypto.Cipher)(__sourceSpill493_13)).init(((int)(__sourceSpill493_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill493_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation493_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local19_life21 = new long[2];
    int local16_life22 = 0;
    java.lang.String local17_life23;
    int local18_life25 = ((java.lang.String)((local17_life23 = "k&Ý\020Ñ åE¶~F\n«"))).length();
    int local15_life26 = 0;
    do {
        java.lang.String __sourceSpill493_27 = local17_life23;
        int __sourceSpill493_28 = local15_life26;
        local15_life26 += 8;
        byte[] local20_life31 = ((java.lang.String)(((java.lang.String)(__sourceSpill493_27)).substring(((int)(__sourceSpill493_28)), ((int)(local15_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill493_32 = local19_life21;
        int __sourceSpill493_33 = local16_life22;
        local16_life22 += 1;
        long local21_life34 = (((((((((((long) (local20_life31)[0]) & 255L) << 56) | ((((long) (local20_life31)[1]) & 255L) << 48)) | ((((long) (local20_life31)[2]) & 255L) << 40)) | ((((long) (local20_life31)[3]) & 255L) << 32)) | ((((long) (local20_life31)[4]) & 255L) << 24)) | ((((long) (local20_life31)[5]) & 255L) << 16)) | ((((long) (local20_life31)[6]) & 255L) << 8)) | (((long) (local20_life31)[7]) & 255L));
        byte[] __sourceSpill493_35 = new byte[8];
        (__sourceSpill493_35)[0] = ((byte) ((int) (local21_life34 >>> 56)));
        (__sourceSpill493_35)[1] = ((byte) ((int) (local21_life34 >>> 48)));
        (__sourceSpill493_35)[2] = ((byte) ((int) (local21_life34 >>> 40)));
        (__sourceSpill493_35)[3] = ((byte) ((int) (local21_life34 >>> 32)));
        (__sourceSpill493_35)[4] = ((byte) ((int) (local21_life34 >>> 24)));
        (__sourceSpill493_35)[5] = ((byte) ((int) (local21_life34 >>> 16)));
        (__sourceSpill493_35)[6] = ((byte) ((int) (local21_life34 >>> 8)));
        (__sourceSpill493_35)[7] = ((byte) ((int) local21_life34));
        javax.crypto.Cipher __sourceSpill493_36 = local13_life11;
        byte[] local23_life38 = ((javax.crypto.Cipher)(__sourceSpill493_36)).doFinal(((byte[])(__sourceSpill493_35)));
        (__sourceSpill493_32)[__sourceSpill493_33] = (((((((((((long) (local23_life38)[0]) & 255L) << 56) | ((((long) (local23_life38)[1]) & 255L) << 48)) | ((((long) (local23_life38)[2]) & 255L) << 40)) | ((((long) (local23_life38)[3]) & 255L) << 32)) | ((((long) (local23_life38)[4]) & 255L) << 24)) | ((((long) (local23_life38)[5]) & 255L) << 16)) | ((((long) (local23_life38)[6]) & 255L) << 8)) | (((long) (local23_life38)[7]) & 255L));
    } while ((!(local15_life26 >= local18_life25)));
    t = ((long[])(local19_life21));
    u = ((java.lang.Integer[])(new java.lang.Integer[2]));
    y = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life43;
    javax.crypto.Cipher __sourceSpill493_45 = (local0_life43 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill493_46 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill493_47 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill493_48 = new byte[8];
    (__sourceSpill493_48)[0] = ((byte) ((int) (local11_life8 >>> 56)));
    int local1_life49 = 1;
    while ((local1_life49 < 8)) {
        (__sourceSpill493_48)[local1_life49] = ((byte) ((int) ((local11_life8 << (local1_life49 * 8)) >>> 56)));
        local1_life49 += 1;
    }
    byte[] __sourcePreallocation493_50 = __sourceSpill493_48;
    ((javax.crypto.Cipher)(__sourceSpill493_45)).init(((int)(__sourceSpill493_46)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill493_47)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation493_50)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life53 = new long[10];
    int local3_life54 = 0;
    java.lang.String local4_life55;
    int local5_life57 = ((java.lang.String)((local4_life55 = "Í=êóTsUi\031Rîõ0¦Mjþ×ÑÄO¯#ìLÆÀ3\035\002P\024ïÊç%\nP¹¢.äHÉ½\r.euæfî_}Xá"))).length();
    int local2_life58 = 0;
    do {
        java.lang.String __sourceSpill493_59 = local4_life55;
        int __sourceSpill493_60 = local2_life58;
        local2_life58 += 8;
        byte[] local7_life63 = ((java.lang.String)(((java.lang.String)(__sourceSpill493_59)).substring(((int)(__sourceSpill493_60)), ((int)(local2_life58))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill493_64 = local6_life53;
        int __sourceSpill493_65 = local3_life54;
        local3_life54 += 1;
        long local8_life66 = (((((((((((long) (local7_life63)[0]) & 255L) << 56) | ((((long) (local7_life63)[1]) & 255L) << 48)) | ((((long) (local7_life63)[2]) & 255L) << 40)) | ((((long) (local7_life63)[3]) & 255L) << 32)) | ((((long) (local7_life63)[4]) & 255L) << 24)) | ((((long) (local7_life63)[5]) & 255L) << 16)) | ((((long) (local7_life63)[6]) & 255L) << 8)) | (((long) (local7_life63)[7]) & 255L));
        byte[] __sourceSpill493_67 = new byte[8];
        (__sourceSpill493_67)[0] = ((byte) ((int) (local8_life66 >>> 56)));
        (__sourceSpill493_67)[1] = ((byte) ((int) (local8_life66 >>> 48)));
        (__sourceSpill493_67)[2] = ((byte) ((int) (local8_life66 >>> 40)));
        (__sourceSpill493_67)[3] = ((byte) ((int) (local8_life66 >>> 32)));
        (__sourceSpill493_67)[4] = ((byte) ((int) (local8_life66 >>> 24)));
        (__sourceSpill493_67)[5] = ((byte) ((int) (local8_life66 >>> 16)));
        (__sourceSpill493_67)[6] = ((byte) ((int) (local8_life66 >>> 8)));
        (__sourceSpill493_67)[7] = ((byte) ((int) local8_life66));
        javax.crypto.Cipher __sourceSpill493_68 = local0_life43;
        byte[] local10_life70 = ((javax.crypto.Cipher)(__sourceSpill493_68)).doFinal(((byte[])(__sourceSpill493_67)));
        (__sourceSpill493_64)[__sourceSpill493_65] = (((((((((((long) (local10_life70)[0]) & 255L) << 56) | ((((long) (local10_life70)[1]) & 255L) << 48)) | ((((long) (local10_life70)[2]) & 255L) << 40)) | ((((long) (local10_life70)[3]) & 255L) << 32)) | ((((long) (local10_life70)[4]) & 255L) << 24)) | ((((long) (local10_life70)[5]) & 255L) << 16)) | ((((long) (local10_life70)[6]) & 255L) << 8)) | (((long) (local10_life70)[7]) & 255L));
    } while ((!(local2_life58 >= local5_life57)));
    local5_life57 = ((java.lang.String)((local4_life55 = "Í(§ºëð\023¼\016o¶\005="))).length();
    local2_life58 = 0;
    do {
        java.lang.String __sourceSpill493_72 = local4_life55;
        int __sourceSpill493_73 = local2_life58;
        local2_life58 += 8;
        byte[] local7_life76 = ((java.lang.String)(((java.lang.String)(__sourceSpill493_72)).substring(((int)(__sourceSpill493_73)), ((int)(local2_life58))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill493_77 = local6_life53;
        int __sourceSpill493_78 = local3_life54;
        local3_life54 += 1;
        long local8_life79 = (((((((((((long) (local7_life76)[0]) & 255L) << 56) | ((((long) (local7_life76)[1]) & 255L) << 48)) | ((((long) (local7_life76)[2]) & 255L) << 40)) | ((((long) (local7_life76)[3]) & 255L) << 32)) | ((((long) (local7_life76)[4]) & 255L) << 24)) | ((((long) (local7_life76)[5]) & 255L) << 16)) | ((((long) (local7_life76)[6]) & 255L) << 8)) | (((long) (local7_life76)[7]) & 255L));
        byte[] __sourceSpill493_80 = new byte[8];
        (__sourceSpill493_80)[0] = ((byte) ((int) (local8_life79 >>> 56)));
        (__sourceSpill493_80)[1] = ((byte) ((int) (local8_life79 >>> 48)));
        (__sourceSpill493_80)[2] = ((byte) ((int) (local8_life79 >>> 40)));
        (__sourceSpill493_80)[3] = ((byte) ((int) (local8_life79 >>> 32)));
        (__sourceSpill493_80)[4] = ((byte) ((int) (local8_life79 >>> 24)));
        (__sourceSpill493_80)[5] = ((byte) ((int) (local8_life79 >>> 16)));
        (__sourceSpill493_80)[6] = ((byte) ((int) (local8_life79 >>> 8)));
        (__sourceSpill493_80)[7] = ((byte) ((int) local8_life79));
        javax.crypto.Cipher __sourceSpill493_81 = local0_life43;
        byte[] local10_life83 = ((javax.crypto.Cipher)(__sourceSpill493_81)).doFinal(((byte[])(__sourceSpill493_80)));
        (__sourceSpill493_77)[__sourceSpill493_78] = (((((((((((long) (local10_life83)[0]) & 255L) << 56) | ((((long) (local10_life83)[1]) & 255L) << 48)) | ((((long) (local10_life83)[2]) & 255L) << 40)) | ((((long) (local10_life83)[3]) & 255L) << 32)) | ((((long) (local10_life83)[4]) & 255L) << 24)) | ((((long) (local10_life83)[5]) & 255L) << 16)) | ((((long) (local10_life83)[6]) & 255L) << 8)) | (((long) (local10_life83)[7]) & 255L));
    } while ((!(local2_life58 >= local5_life57)));
    w = ((long[])(local6_life53));
    x = ((java.lang.Long[])(new java.lang.Long[10]));
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public static java.lang.String[] b__sourceReturn_44c5829186() {
return moom.Bp.p;
}


public static void b(java.lang.String[] p0) {
p = ((java.lang.String[])(p0));
    return;
}


private static long b(int p0, long p1) {
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
    life3_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 21994);
    if (((moom.Bp.x)[life3_8] == null)) {
        life4_77 = new byte[] {((byte) ((int) (p1 >>> 56))), ((byte) ((int) (p1 >>> 48))), ((byte) ((int) (p1 >>> 40))), ((byte) ((int) (p1 >>> 32))), ((byte) ((int) (p1 >>> 24))), ((byte) ((int) (p1 >>> 16))), ((byte) ((int) (p1 >>> 8))), ((byte) ((int) p1))};
        life5_81 = (moom.Bp.w)[life3_8];
        life7_146 = new byte[] {((byte) ((int) (life5_81 >>> 56))), ((byte) ((int) (life5_81 >>> 48))), ((byte) ((int) (life5_81 >>> 40))), ((byte) ((int) (life5_81 >>> 32))), ((byte) ((int) (life5_81 >>> 24))), ((byte) ((int) (life5_81 >>> 16))), ((byte) ((int) (life5_81 >>> 8))), ((byte) ((int) life5_81))};
        life8_150 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life9_155 = ((java.lang.Object[])(((java.util.Map)(moom.Bp.y)).get(((java.lang.Object)(life8_150)))));
        try {
        if ((life9_155 == null)) {
        life9_155 = new java.lang.Object[3];
        (life9_155)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding")));
        (life9_155)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life9_155)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.Bp.y)).put(((java.lang.Object)(life8_150)), ((java.lang.Object)(life9_155)));
    }
        life11_188 = new javax.crypto.spec.DESKeySpec(life4_77);
        life12_195 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life9_155)[1])))).generateSecret(((java.security.spec.KeySpec)(life11_188)));
        life13_200 = ((javax.crypto.Cipher)((life9_155)[0]));
        ((javax.crypto.Cipher)(life13_200)).init(((int)(2)), ((java.security.Key)(life12_195)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life9_155)[2])))));
        life10_212 = ((javax.crypto.Cipher)(life13_200)).doFinal(((byte[])(life7_146)));
    } catch (java.lang.Exception life11_214) {
        throw new java.lang.RuntimeException("moom/Bp", life11_214);
    }
        life11_290 = (((((((((((long) (life10_212)[0]) & 255L) << 56) | ((((long) (life10_212)[1]) & 255L) << 48)) | ((((long) (life10_212)[2]) & 255L) << 40)) | ((((long) (life10_212)[3]) & 255L) << 32)) | ((((long) (life10_212)[4]) & 255L) << 24)) | ((((long) (life10_212)[5]) & 255L) << 16)) | ((((long) (life10_212)[6]) & 255L) << 8)) | (((long) (life10_212)[7]) & 255L));
        (moom.Bp.x)[life3_8] = java.lang.Long.valueOf(((long)(life11_290)));
    }
    return ((java.lang.Long)((moom.Bp.x)[life3_8])).longValue();
}


private static long b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    long local7 = moom.Bp.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local9 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Long.TYPE)), ((java.lang.Object)(java.lang.Long.valueOf(((long)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local9)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral3960_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Bp"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public boolean b(moom.DT p0) {
int forwardValue1537_14_0;
    int forwardValue1537_18_0;
    int forwardValue1537_20_0;
    boolean spill1537_0;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_20: {
    forward_join_19: {
    forward_join_18: {
    forward_join_14: {
    life2_3 = (moom.Bp.r ^ 89509952023060L);
    life4_5 = __sourceExactCall_e688eb7a52b4a5();
    spill1537_0 = this.m;
    if (!((life4_5 == null))) {
        forwardValue1537_14_0 = ((spill1537_0) ? 1 : 0);
        break forward_join_14;
    }
    if (!((!spill1537_0))) {
        break forward_join_19;
    }
    forwardValue1537_14_0 = ((super.b(((moom.DT)(p0)))) ? 1 : 0);
    }
    if (!((life4_5 == null))) {
        forwardValue1537_18_0 = forwardValue1537_14_0;
        break forward_join_18;
    }
    if (!((forwardValue1537_14_0 != 0))) {
        break forward_join_19;
    }
    forwardValue1537_18_0 = 1;
    }
    forwardValue1537_20_0 = forwardValue1537_18_0;
    break forward_join_20;
    }
    forwardValue1537_20_0 = 0;
    }
    return ((forwardValue1537_20_0) != 0);
}


private void c() {
moom.Bp forwardValue1538_26_0;
    moom.Bp spill1538_0;
    long life1_3;
    java.lang.String[] life3_5;
    forward_join_28: {
    forward_join_26: {
    life1_3 = (moom.Bp.r ^ 93804266705770L);
    life3_5 = __sourceExactCall_e688eb7a52b4a5();
    spill1538_0 = this;
    if (!((life3_5 == null))) {
        forwardValue1538_26_0 = spill1538_0;
        break forward_join_26;
    }
    if (!((((moom.Bp)(spill1538_0)).n > __sourceIntrinsic_5b7380e7aa7c_invokedynamic1538_3(25868, (6703716126491609089L ^ life1_3))))) {
        break forward_join_28;
    }
    ((net.minecraft.entity.player.EntityPlayerMP)(this.b)).a(((net.minecraft.util.IChatComponent)(new moom.CN("demo.reminder", new java.lang.Object[0]))));
    forwardValue1538_26_0 = this;
    }
    ((moom.Bp)(forwardValue1538_26_0)).n = ((int)(0));
    }
    return;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral3963_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Bp"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_82b43d40f66e50(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public void a(moom.DT p0, moom.bs p1) {
moom.Bp forwardValue1533_16_0;
    moom.Bp spill1533_0;
    long life3_3;
    java.lang.String[] life5_5;
    forward_join_19: {
    forward_join_16: {
    forward_join_15: {
    life3_3 = (moom.Bp.r ^ 23581278908947L);
    life5_5 = __sourceExactCall_e688eb7a52b4a5();
    spill1533_0 = this;
    if (!((life5_5 == null))) {
        forwardValue1533_16_0 = spill1533_0;
        break forward_join_16;
    }
    if (!(((moom.Bp)(spill1533_0)).m)) {
        break forward_join_15;
    }
    ((moom.Bp)(this)).c();
    if (!((life5_5 != null))) {
        break forward_join_19;
    }
    }
    forwardValue1533_16_0 = this;
    }
    __sourceIntrinsic_0004ca107f64_call1533_4(forwardValue1533_16_0, p0, p1);
    }
    return;
}


public void a__Void() {
moom.Bp forwardValue1536_56_0;
    moom.Bp forwardValue1536_67_0;
    int forwardValue1536_67_1;
    moom.Bp forwardValue1536_68_0;
    moom.Bp forwardValue1536_69_0;
    int forwardValue1536_69_1;
    int forwardValue1536_94_0;
    int forwardValue1536_123_0;
    int forwardValue1536_154_0;
    int forwardValue1536_175_0;
    int forwardValue1536_194_0;
    int forwardValue1536_210_0;
    java.lang.String[] spill1536_0;
    moom.Bp spill1536_1;
    moom.Bp spill1536_2;
    int spill1536_3;
    boolean spill1536_4;
    int spill1536_5;
    long life1_3;
    java.lang.String[] life3_7;
    long life4_17;
    long life6_27;
    forward_join_220: {
    forward_join_210: {
    forward_join_194: {
    forward_join_187: {
    forward_join_175: {
    forward_join_168: {
    forward_join_154: {
    forward_join_147: {
    forward_join_123: {
    forward_join_120: {
    forward_join_94: {
    forward_join_81: {
    forward_join_69: {
    forward_join_68: {
    forward_join_67: {
    forward_join_56: {
    forward_join_55: {
    life1_3 = (moom.Bp.r ^ 20410214692484L);
    spill1536_0 = __sourceExactCall_e688eb7a52b4a5();
    super.a__Void();
    life3_7 = spill1536_0;
    moom.Bp __stackOp1536_3_0 = this;
    ((moom.Bp)(__stackOp1536_3_0)).o = ((int)((((moom.Bp)(__stackOp1536_3_0)).o + 1)));
    life4_17 = ((net.minecraft.world.World)(this.a)).b__Long();
    life6_27 = ((life4_17 / __sourceIntrinsic_b82a5b29b709_invokedynamic1536_8(19552, (4807255711756896650L ^ life1_3))) + 1L);
    spill1536_1 = this;
    if (!((life3_7 == null))) {
        forwardValue1536_56_0 = spill1536_1;
        break forward_join_56;
    }
    if (!((!((moom.Bp)(spill1536_1)).l))) {
        break forward_join_55;
    }
    spill1536_2 = this;
    if (!((life3_7 == null))) {
        forwardValue1536_56_0 = spill1536_2;
        break forward_join_56;
    }
    if (!((((moom.Bp)(spill1536_2)).o > __sourceIntrinsic_b82a5b29b709_invokedynamic1536_11(26768, (3959286119644094578L ^ life1_3))))) {
        break forward_join_55;
    }
    this.l = ((boolean)(true));
    ((net.minecraft.network.NetHandlerPlayServer)(((net.minecraft.entity.player.EntityPlayerMP)(this.b)).cg)).a(((moom.yK)(new moom.Ac(5, 0x0.0p0f))));
    }
    forwardValue1536_56_0 = this;
    }
    spill1536_3 = recovery.source.CarrierOps.lcmp(((long)(life4_17)), ((long)(__sourceIntrinsic_b82a5b29b709_invokedynamic1536_16(11848, (4324209921178348451L ^ life1_3)))));
    if (!((life3_7 == null))) {
        forwardValue1536_67_0 = forwardValue1536_56_0;
        forwardValue1536_67_1 = spill1536_3;
        break forward_join_67;
    }
    if (!((spill1536_3 > 0))) {
        forwardValue1536_68_0 = forwardValue1536_56_0;
        break forward_join_68;
    }
    forwardValue1536_67_0 = forwardValue1536_56_0;
    forwardValue1536_67_1 = 1;
    }
    forwardValue1536_69_0 = forwardValue1536_67_0;
    forwardValue1536_69_1 = forwardValue1536_67_1;
    break forward_join_69;
    }
    forwardValue1536_69_0 = forwardValue1536_68_0;
    forwardValue1536_69_1 = 0;
    }
    ((moom.Bp)(forwardValue1536_69_0)).m = ((boolean)__sourceIntrinsic_integerToBoolean((forwardValue1536_69_1)));
    spill1536_4 = this.m;
    if (!((life3_7 == null))) {
        forwardValue1536_94_0 = ((spill1536_4) ? 1 : 0);
        break forward_join_94;
    }
    if (!(spill1536_4)) {
        break forward_join_81;
    }
    moom.Bp __stackOp1536_21_0 = this;
    ((moom.Bp)(__stackOp1536_21_0)).n = ((int)((((moom.Bp)(__stackOp1536_21_0)).n + 1)));
    }
    forwardValue1536_94_0 = recovery.source.CarrierOps.lcmp(((long)((life4_17 % __sourceIntrinsic_b82a5b29b709_invokedynamic1536_24(4004, (7158637768919091780L ^ life1_3))))), ((long)(__sourceIntrinsic_b82a5b29b709_invokedynamic1536_25(13925, (12419633733940098L ^ life1_3)))));
    }
    if (!((life3_7 == null))) {
        forwardValue1536_123_0 = forwardValue1536_94_0;
        break forward_join_123;
    }
    if (!((forwardValue1536_94_0 == 0))) {
        break forward_join_120;
    }
    if (!((recovery.source.CarrierOps.lcmp(((long)(life6_27)), ((long)(__sourceIntrinsic_b82a5b29b709_invokedynamic1536_27(23223, (6866113028530954069L ^ life1_3))))) <= 0))) {
        break forward_join_220;
    }
    ((net.minecraft.entity.player.EntityPlayerMP)(this.b)).a(((net.minecraft.util.IChatComponent)(new moom.CN(__sourceIntrinsic_b82a5b29b709_invokedynamic1536_30(life6_27), new java.lang.Object[0]))));
    if (!((life3_7 != null))) {
        break forward_join_220;
    }
    __sourceExactCall_6604345f74a40b(((java.lang.String[])(new java.lang.String[3])));
    }
    forwardValue1536_123_0 = recovery.source.CarrierOps.lcmp(((long)(life6_27)), ((long)(1L)));
    }
    if (!((life3_7 == null))) {
        forwardValue1536_194_0 = forwardValue1536_123_0;
        break forward_join_194;
    }
    if (!((forwardValue1536_123_0 == 0))) {
        break forward_join_187;
    }
    spill1536_5 = recovery.source.CarrierOps.lcmp(((long)(life4_17)), ((long)(__sourceIntrinsic_b82a5b29b709_invokedynamic1536_34(6116, (5352966450149757445L ^ life1_3)))));
    if (!((life3_7 == null))) {
        forwardValue1536_154_0 = spill1536_5;
        break forward_join_154;
    }
    if (!((spill1536_5 == 0))) {
        break forward_join_147;
    }
    ((net.minecraft.network.NetHandlerPlayServer)(((net.minecraft.entity.player.EntityPlayerMP)(this.b)).cg)).a(((moom.yK)(new moom.Ac(5, 0x1.94p6f))));
    if (!((life3_7 != null))) {
        break forward_join_220;
    }
    }
    forwardValue1536_154_0 = recovery.source.CarrierOps.lcmp(((long)(life4_17)), ((long)(__sourceIntrinsic_b82a5b29b709_invokedynamic1536_39(16509, (3917230648433198494L ^ life1_3)))));
    }
    if (!((life3_7 == null))) {
        forwardValue1536_175_0 = forwardValue1536_154_0;
        break forward_join_175;
    }
    if (!((forwardValue1536_154_0 == 0))) {
        break forward_join_168;
    }
    ((net.minecraft.network.NetHandlerPlayServer)(((net.minecraft.entity.player.EntityPlayerMP)(this.b)).cg)).a(((moom.yK)(new moom.Ac(5, 0x1.98p6f))));
    if (!((life3_7 != null))) {
        break forward_join_220;
    }
    }
    forwardValue1536_175_0 = recovery.source.CarrierOps.lcmp(((long)(life4_17)), ((long)(__sourceIntrinsic_b82a5b29b709_invokedynamic1536_44(3254, (4873859873830373712L ^ life1_3)))));
    }
    if (!((forwardValue1536_175_0 == 0))) {
        break forward_join_220;
    }
    ((net.minecraft.network.NetHandlerPlayServer)(((net.minecraft.entity.player.EntityPlayerMP)(this.b)).cg)).a(((moom.yK)(new moom.Ac(5, 0x1.9cp6f))));
    if (!((life3_7 != null))) {
        break forward_join_220;
    }
    }
    forwardValue1536_194_0 = recovery.source.CarrierOps.lcmp(((long)(life6_27)), ((long)(__sourceIntrinsic_b82a5b29b709_invokedynamic1536_49(14296, (829152448780972605L ^ life1_3)))));
    }
    if (!((life3_7 == null))) {
        forwardValue1536_210_0 = forwardValue1536_194_0;
        break forward_join_210;
    }
    if (!((forwardValue1536_194_0 == 0))) {
        break forward_join_220;
    }
    forwardValue1536_210_0 = recovery.source.CarrierOps.lcmp(((long)((life4_17 % __sourceIntrinsic_b82a5b29b709_invokedynamic1536_51(4004, (7158637768919091780L ^ life1_3))))), ((long)(__sourceIntrinsic_b82a5b29b709_invokedynamic1536_52(3305, (6876894156401379597L ^ life1_3)))));
    }
    if (!((forwardValue1536_210_0 == 0))) {
        break forward_join_220;
    }
    ((net.minecraft.entity.player.EntityPlayerMP)(this.b)).a(((net.minecraft.util.IChatComponent)(new moom.CN("demo.day.warning", new java.lang.Object[0]))));
    }
    return;
}


public boolean a(net.minecraft.entity.player.EntityPlayer p0, net.minecraft.world.World p1, net.minecraft.item.ItemStack p2, moom.DT p3, moom.bs p4, float p5, float p6, float p7) {
int forwardValue1535_25_0;
    boolean spill1535_0;
    long life9_3;
    java.lang.String[] life11_5;
    forward_join_25: {
    forward_join_15: {
    life9_3 = (moom.Bp.r ^ 48094076165510L);
    life11_5 = __sourceExactCall_e688eb7a52b4a5();
    spill1535_0 = this.m;
    if (!((life11_5 == null))) {
        forwardValue1535_25_0 = ((spill1535_0) ? 1 : 0);
        break forward_join_25;
    }
    if (!(spill1535_0)) {
        break forward_join_15;
    }
    ((moom.Bp)(this)).c();
    return ((0) != 0);
    }
    forwardValue1535_25_0 = ((super.a(((net.minecraft.entity.player.EntityPlayer)(p0)), ((net.minecraft.world.World)(p1)), ((net.minecraft.item.ItemStack)(p2)), ((moom.DT)(p3)), ((moom.bs)(p4)), ((float)(p5)), ((float)(p6)), ((float)(p7)))) ? 1 : 0);
    }
    return ((forwardValue1535_25_0) != 0);
}


public boolean a(net.minecraft.entity.player.EntityPlayer p0, net.minecraft.world.World p1, net.minecraft.item.ItemStack p2) {
int forwardValue1534_20_0;
    boolean spill1534_0;
    long life4_3;
    java.lang.String[] life6_5;
    forward_join_20: {
    forward_join_15: {
    life4_3 = (moom.Bp.r ^ 42526473329641L);
    life6_5 = __sourceExactCall_e688eb7a52b4a5();
    spill1534_0 = this.m;
    if (!((life6_5 == null))) {
        forwardValue1534_20_0 = ((spill1534_0) ? 1 : 0);
        break forward_join_20;
    }
    if (!(spill1534_0)) {
        break forward_join_15;
    }
    ((moom.Bp)(this)).c();
    return ((0) != 0);
    }
    forwardValue1534_20_0 = ((super.a(((net.minecraft.entity.player.EntityPlayer)(p0)), ((net.minecraft.world.World)(p1)), ((net.minecraft.item.ItemStack)(p2)))) ? 1 : 0);
    }
    return ((forwardValue1534_20_0) != 0);
}


public void a(moom.DT p0) {
moom.Bp forwardValue1532_12_0;
    moom.Bp spill1532_0;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_14: {
    forward_join_12: {
    life2_3 = (moom.Bp.r ^ 56052868935147L);
    life4_5 = __sourceExactCall_e688eb7a52b4a5();
    spill1532_0 = this;
    if (!((life4_5 == null))) {
        forwardValue1532_12_0 = spill1532_0;
        break forward_join_12;
    }
    if (!((!((moom.Bp)(spill1532_0)).m))) {
        break forward_join_14;
    }
    forwardValue1532_12_0 = this;
    }
    __sourceIntrinsic_760187f91cdd_call1532_3(forwardValue1532_12_0, p0);
    }
    return;
}


private static int a(int p0, long p1) {
int n4 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x58EA;
        if (u[n4] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = t[n4];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])v.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    v.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/Bp", exception);
            }
            int n6 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Bp.u[n4] = n6;
        }
        return u[n4];
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral3960_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b7380e7aa7c_invokedynamic1538_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral3963_0() throws E;

private static native <E extends Throwable> void __sourceIntrinsic_0004ca107f64_call1533_4(moom.Bp a0, moom.DT a1, moom.bs a2) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_b82a5b29b709_invokedynamic1536_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic1536_11(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_b82a5b29b709_invokedynamic1536_16(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_b82a5b29b709_invokedynamic1536_24(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_b82a5b29b709_invokedynamic1536_25(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_b82a5b29b709_invokedynamic1536_27(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b82a5b29b709_invokedynamic1536_30(long a0) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_b82a5b29b709_invokedynamic1536_34(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_b82a5b29b709_invokedynamic1536_39(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_b82a5b29b709_invokedynamic1536_44(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_b82a5b29b709_invokedynamic1536_49(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_b82a5b29b709_invokedynamic1536_51(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_b82a5b29b709_invokedynamic1536_52(int a0, long a1) throws E;

private static native <E extends Throwable> void __sourceIntrinsic_760187f91cdd_call1532_3(moom.Bp a0, moom.DT a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native java.lang.String[] __sourceExactCall_e688eb7a52b4a5();
private static native int __sourceExactCall_82b43d40f66e50(int p0, long p1);
private static native void __sourceExactCall_6604345f74a40b(java.lang.String[] p0);
}
