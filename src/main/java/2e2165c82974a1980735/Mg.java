package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Mg {

private boolean a;

private int b;

private float c;

private static long d;

private static java.lang.String[] e;

private static java.lang.String[] f;

private static java.util.Map g;

private static long[] h;

private static java.lang.Integer[] i;

private static java.util.Map j;

public Mg(boolean p0, int p1, float p2) {
super();
    this.a = p0;
    this.b = p1;
    this.c = p2;
}


public Mg(boolean p0) { this(false, 0, 0.0F); }


private static void __sourceConstructorBody_840331e467c01723(moom.Mg receiver, boolean p0) throws Throwable {

long local2_life1 = (moom.Mg.d ^ 12175855352722L);

    moom.Mg.__sourceConstructorInit_840331e467c01723_0(((moom.Mg)(receiver)), ((boolean)(p0)), ((int)(__sourceIntrinsic_840331e467c01723_originalDynamicSite713_2(26620, (5402263687883288219L ^ local2_life1)))), ((float)(0x0.0p0f)));

    return;

}



public Mg() { this(false, 0, 0.0F); }


private static void __sourceConstructorBody_dabb141290b64e20(moom.Mg receiver) throws Throwable {

long local1_life1 = (moom.Mg.d ^ 106831369106121L);

    moom.Mg.__sourceConstructorInit_dabb141290b64e20_0(((moom.Mg)(receiver)), ((int)(0)), ((int)(__sourceIntrinsic_dabb141290b64e20_originalDynamicSite714_2(6032, (3970614484027512749L ^ local1_life1)))), ((float)(0x0.0p0f)));

    return;

}



static {
d = ((long)(((moom._a)(moom._c.a(((long)(-6428773185089644252L)), ((long)(-4360401474913646711L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(64403434035196L)))));
    g = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (moom.Mg.d ^ 115590363334297L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill705_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill705_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill705_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill705_14 = new byte[8];
    (__sourceSpill705_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill705_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation705_16 = __sourceSpill705_14;
    ((javax.crypto.Cipher)(__sourceSpill705_11)).init(((int)(__sourceSpill705_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill705_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation705_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local20_life19 = new java.lang.String[3];
    int local18_life20 = 0;
    java.lang.String local17_life21;
    int local19_life23 = ((java.lang.String)((local17_life21 = "\034x\001®°\023«R¾x¥xÉ\006ó%Ï?\033AF9¨ Ðn¨È#sIÕo\017ÜÇ©Ô\002{¬rbÄDjmj¹ö\005©}a\020¤÷\tÙàâ·Ìû\034\027"))).length();
    int local16_life24 = 24;
    int local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill705_28 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill705_29 = local13_life9;
        byte[] local21_life31 = ((javax.crypto.Cipher)(__sourceSpill705_29)).doFinal(((byte[])(__sourceSpill705_28)));
        java.lang.String __sourceSpill705_34 = ((java.lang.String)(moom.Mg.a(((byte[])(local21_life31))))).intern();
        java.lang.String[] __sourceSpill705_35 = local20_life19;
        int __sourceSpill705_36 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill705_35)[__sourceSpill705_36] = __sourceSpill705_34;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    e = ((java.lang.String[])(local20_life19));
    f = ((java.lang.String[])(new java.lang.String[3]));
    j = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life42;
    javax.crypto.Cipher __sourceSpill705_44 = (local0_life42 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill705_45 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill705_46 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill705_47 = new byte[8];
    (__sourceSpill705_47)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life48 = 1;
    while ((local1_life48 < 8)) {
        (__sourceSpill705_47)[local1_life48] = ((byte) ((int) ((local11_life7 << (local1_life48 * 8)) >>> 56)));
        local1_life48 += 1;
    }
    byte[] __sourcePreallocation705_49 = __sourceSpill705_47;
    ((javax.crypto.Cipher)(__sourceSpill705_44)).init(((int)(__sourceSpill705_45)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill705_46)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation705_49)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life52 = new long[2];
    int local3_life53 = 0;
    java.lang.String local4_life54;
    int local5_life56 = ((java.lang.String)((local4_life54 = "ðRÝ\t½ØË¹ïZxÀ`½D4"))).length();
    int local2_life57 = 0;
    do {
        java.lang.String __sourceSpill705_58 = local4_life54;
        int __sourceSpill705_59 = local2_life57;
        local2_life57 += 8;
        byte[] local7_life62 = ((java.lang.String)(((java.lang.String)(__sourceSpill705_58)).substring(((int)(__sourceSpill705_59)), ((int)(local2_life57))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill705_63 = local6_life52;
        int __sourceSpill705_64 = local3_life53;
        local3_life53 += 1;
        long local8_life65 = (((((((((((long) (local7_life62)[0]) & 255L) << 56) | ((((long) (local7_life62)[1]) & 255L) << 48)) | ((((long) (local7_life62)[2]) & 255L) << 40)) | ((((long) (local7_life62)[3]) & 255L) << 32)) | ((((long) (local7_life62)[4]) & 255L) << 24)) | ((((long) (local7_life62)[5]) & 255L) << 16)) | ((((long) (local7_life62)[6]) & 255L) << 8)) | (((long) (local7_life62)[7]) & 255L));
        byte[] __sourceSpill705_66 = new byte[8];
        (__sourceSpill705_66)[0] = ((byte) ((int) (local8_life65 >>> 56)));
        (__sourceSpill705_66)[1] = ((byte) ((int) (local8_life65 >>> 48)));
        (__sourceSpill705_66)[2] = ((byte) ((int) (local8_life65 >>> 40)));
        (__sourceSpill705_66)[3] = ((byte) ((int) (local8_life65 >>> 32)));
        (__sourceSpill705_66)[4] = ((byte) ((int) (local8_life65 >>> 24)));
        (__sourceSpill705_66)[5] = ((byte) ((int) (local8_life65 >>> 16)));
        (__sourceSpill705_66)[6] = ((byte) ((int) (local8_life65 >>> 8)));
        (__sourceSpill705_66)[7] = ((byte) ((int) local8_life65));
        javax.crypto.Cipher __sourceSpill705_67 = local0_life42;
        byte[] local10_life69 = ((javax.crypto.Cipher)(__sourceSpill705_67)).doFinal(((byte[])(__sourceSpill705_66)));
        (__sourceSpill705_63)[__sourceSpill705_64] = (((((((((((long) (local10_life69)[0]) & 255L) << 56) | ((((long) (local10_life69)[1]) & 255L) << 48)) | ((((long) (local10_life69)[2]) & 255L) << 40)) | ((((long) (local10_life69)[3]) & 255L) << 32)) | ((((long) (local10_life69)[4]) & 255L) << 24)) | ((((long) (local10_life69)[5]) & 255L) << 16)) | ((((long) (local10_life69)[6]) & 255L) << 8)) | (((long) (local10_life69)[7]) & 255L));
    } while ((!(local2_life57 >= local5_life56)));
    h = ((long[])(local6_life52));
    i = ((java.lang.Integer[])(new java.lang.Integer[2]));
}

private static native <E extends Throwable> void __sourceConstructorInit_dabb141290b64e20_0(moom.Mg a0, int a1, int a2, float a3) throws E;
private static native <E extends Throwable> void __sourceConstructorInit_840331e467c01723_0(moom.Mg a0, boolean a1, int a2, float a3) throws E;

public java.lang.String toString() {
long local1 = (moom.Mg.d ^ 83074510483879L);
    boolean __sourceSpill1955_4 = this.a;
    int __sourceSpill1955_5 = this.b;
    float local3 = this.c;
    int local4 = __sourceSpill1955_5;
    boolean local5 = __sourceSpill1955_4;
    return __sourceIntrinsic_a86c261fcdee_originalDynamicSite1955_9(__sourceIntrinsic_a86c261fcdee_originalDynamicSite1955_6(14845, (628700667511134870L ^ local1)), local5, __sourceIntrinsic_a86c261fcdee_originalDynamicSite1955_7(11912, (7282942480356658658L ^ local1)), local4, __sourceIntrinsic_a86c261fcdee_originalDynamicSite1955_8(7792, (3898297593807043865L ^ local1)), local3);
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral6401_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Mg"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void b() {
this.a = ((boolean)(false));
    return;
}


private static int b(int p0, long p1) {
int n4 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0xCE7;
        if (i[n4] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = h[n4];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])j.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    j.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/Mg", exception);
            }
            int n6 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Mg.i[n4] = n6;
        }
        return i[n4];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.Mg.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 27871);
    if (((moom.Mg.f)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.Mg.g)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.Mg.g)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/Mg", life9_51);
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
        life9_116 = ((java.lang.String)((moom.Mg.e)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.Mg.f)[life5_8] = moom.Mg.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.Mg.f)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.Mg.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral6403_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Mg"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(moom.Mg p0) {
this.a = ((boolean)__sourceIntrinsic_integerToBoolean((((((moom.Mg)(p0)).a) ? 1 : 0))));
    this.b = ((int)(((moom.Mg)(p0)).b));
    this.c = ((float)(((moom.Mg)(p0)).c));
    return;
}


public void a(boolean p0, int p1, float p2) {
this.a = ((boolean)(p0));
    this.b = ((int)(p1));
    this.c = ((float)(p2));
    return;
}


public int a__Int() {
return this.b;
}


public boolean a__Boolean() {
return ((((this.a) ? 1 : 0)) != 0);
}


public void a__Void() {
this.a = ((boolean)(true));
    return;
}


public float a() {
return this.c;
}


public void a(boolean p0) {
this.a = ((boolean)(p0));
    return;
}


public void a(int p0, float p1) {
this.b = ((int)(p0));
    this.c = ((float)(p1));
    return;
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
        byte[] spill3210_0 = p0;
        life4_9 += 1;
        life5_44 = (spill3210_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill3210_1 = p0;
        life4_9 += 1;
        life5_76 = (spill3210_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill3210_2 = p0;
        life4_9 += 1;
        life5_91 = (spill3210_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static native <E extends Throwable> int __sourceIntrinsic_dabb141290b64e20_originalDynamicSite714_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_840331e467c01723_originalDynamicSite713_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral6403_0() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral6401_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite1955_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite1955_7(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite1955_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite1955_9(java.lang.String a0, boolean a1, java.lang.String a2, int a3, java.lang.String a4, float a5) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
