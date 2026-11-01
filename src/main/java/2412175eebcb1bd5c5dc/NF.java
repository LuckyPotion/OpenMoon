package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class NF {

private int a;

private int b;

private int c;

private int d;

private int e;

private int f;

private byte[][][] g;

private byte[] h;

private int i;

private static long j;

private static long[] k;

private static java.lang.Integer[] l;

private static java.util.Map m;

public NF(int p0, int p1, int p2) { super(); __sourceHandlerCall_6dc77cb512f4c3e1ee37(this, p0, p1, p2); }


static {
j = ((long)(((moom._a)(moom._c.a(((long)(-5964078772566675743L)), ((long)(8891282985147519192L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(174388682432315L)))));
    m = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.NF.j ^ 110660845615676L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill721_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill721_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill721_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill721_14 = new byte[8];
    (__sourceSpill721_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill721_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation721_16 = __sourceSpill721_14;
    ((javax.crypto.Cipher)(__sourceSpill721_11)).init(((int)(__sourceSpill721_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill721_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation721_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[3];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "4%\030Á©w«¡\016\025×®ì<÷söÒt\017W"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill721_25 = local6_life21;
        int __sourceSpill721_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill721_25)).substring(((int)(__sourceSpill721_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill721_30 = local8_life19;
        int __sourceSpill721_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill721_33 = new byte[8];
        (__sourceSpill721_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill721_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill721_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill721_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill721_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill721_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill721_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill721_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill721_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill721_34)).doFinal(((byte[])(__sourceSpill721_33)));
        (__sourceSpill721_30)[__sourceSpill721_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    k = ((long[])(local8_life19));
    l = ((java.lang.Integer[])(new java.lang.Integer[3]));
}

private static native <E extends Throwable> void __sourceHandlerCall_6dc77cb512f4c3e1ee37(moom.NF a0, int a1, int a2, int a3) throws E;
private static final class __SourceHandler_6dc77cb512f4c3e1ee37 {

public static void f601(moom.NF receiver, int p0, int p1, int p2) throws Throwable {
    long local4_life2 = (__fieldRead601_0() ^ __originalNumericLdc601_1());
    __directSuperInit601_3(receiver);
    __fieldWrite601_6(receiver, __originalDynamicSite601_5(26082, (__originalNumericLdc601_4() ^ local4_life2)));
    __fieldWrite601_9(receiver, __originalDynamicSite601_8(7565, (__originalNumericLdc601_7() ^ local4_life2)));
    __fieldWrite601_12(receiver, __originalDynamicSite601_11(19279, (__originalNumericLdc601_10() ^ local4_life2)));
    __fieldWrite601_13(receiver, 0);
    __fieldWrite601_14(receiver, 0);
    __fieldWrite601_15(receiver, 0);
    __fieldWrite601_16(receiver, null);
    __fieldWrite601_17(receiver, null);
    __fieldWrite601_18(receiver, 0);
    __fieldWrite601_19(receiver, p0);
    __fieldWrite601_20(receiver, p1);
    __fieldWrite601_21(receiver, p2);
    __fieldWrite601_23(receiver, __multiArray601_22(p0, p1, p2));
    __call601_24(receiver);
    return;
}
private static native long __fieldRead601_0() throws Throwable;
private static native long __originalNumericLdc601_1() throws Throwable;
private static native void __directSuperInit601_3(moom.NF a0) throws Throwable;
private static native long __originalNumericLdc601_4() throws Throwable;
private static native int __originalDynamicSite601_5(int a0, long a1) throws Throwable;
private static native void __fieldWrite601_6(moom.NF a0, int a1) throws Throwable;
private static native long __originalNumericLdc601_7() throws Throwable;
private static native int __originalDynamicSite601_8(int a0, long a1) throws Throwable;
private static native void __fieldWrite601_9(moom.NF a0, int a1) throws Throwable;
private static native long __originalNumericLdc601_10() throws Throwable;
private static native int __originalDynamicSite601_11(int a0, long a1) throws Throwable;
private static native void __fieldWrite601_12(moom.NF a0, int a1) throws Throwable;
private static native void __fieldWrite601_13(moom.NF a0, int a1) throws Throwable;
private static native void __fieldWrite601_14(moom.NF a0, int a1) throws Throwable;
private static native void __fieldWrite601_15(moom.NF a0, int a1) throws Throwable;
private static native void __fieldWrite601_16(moom.NF a0, java.lang.Object a1) throws Throwable;
private static native void __fieldWrite601_17(moom.NF a0, java.lang.Object a1) throws Throwable;
private static native void __fieldWrite601_18(moom.NF a0, int a1) throws Throwable;
private static native void __fieldWrite601_19(moom.NF a0, int a1) throws Throwable;
private static native void __fieldWrite601_20(moom.NF a0, int a1) throws Throwable;
private static native void __fieldWrite601_21(moom.NF a0, int a1) throws Throwable;
private static native byte[][][] __multiArray601_22(int a0, int a1, int a2) throws Throwable;
private static native void __fieldWrite601_23(moom.NF a0, byte[][][] a1) throws Throwable;
private static native void __call601_24(moom.NF a0) throws Throwable;

}


private static java.lang.ArrayIndexOutOfBoundsException a(java.lang.ArrayIndexOutOfBoundsException p0) {
return p0;
}


private static int a(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x1DC0;
        if (NF.l[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = k[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])m.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    m.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/NF", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            NF.l[n2] = n3;
        }
        return NF.l[n2];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.NF.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral6559_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/NF"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a__Void(int p0, int p1, int p2) {
this.d = ((int)(p0));
    this.e = ((int)(p1));
    this.f = ((int)(p2));
    ((moom.NF)(this)).a();
    return;
}


public byte a(int p0, int p1, int p2) {
try {
        this.h = ((byte[])(((this.g)[(p0 - this.d)])[(p1 - this.e)]));
        this.i = ((int)((p2 - this.f)));
        return (this.h)[this.i];
    } catch (java.lang.ArrayIndexOutOfBoundsException caught4) {
        ((java.lang.ArrayIndexOutOfBoundsException)(caught4)).printStackTrace();
        return ((byte) -1);
    }
}


public void a(byte p0) {
try {
        (this.h)[this.i] = p0;
    } catch (java.lang.Exception caught2) {
        ((java.lang.Exception)(caught2)).printStackTrace();
    }
    return;
}


public void a() {
int forestValue803_9_0;
    int spill803_0;
    int spill803_1;
    long life1_3;
    int life4_6;
    int life3_7;
    byte[][] life5_16;
    int life6_18;
    byte[] life7_26;
    int life8_30;
    forest_join_50: {
    life1_3 = (moom.NF.j ^ 94966659702974L);
    spill803_0 = moom.Ob.b();
    life4_6 = 0;
    life3_7 = spill803_0;
    forest_cycle_8: while (true) {
    forest_join_47: {
    forestValue803_9_0 = life4_6;
    forest_cycle_9: while (true) {
    if (!((forestValue803_9_0 < this.a))) {
        break forest_join_50;
    }
    life5_16 = (this.g)[life4_6];
    life6_18 = 0;
    forest_cycle_19: while (true) {
    forest_join_45: {
    forest_join_44: {
    if (!((life6_18 < this.b))) {
        break forest_join_47;
    }
    life7_26 = (life5_16)[life6_18];
    spill803_1 = 0;
    if (!((life3_7 == 0))) {
        forestValue803_9_0 = spill803_1;
        continue forest_cycle_9;
    }
    life8_30 = spill803_1;
    forest_cycle_31: while (true) {
    if (!((life8_30 < this.c))) {
        break forest_join_44;
    }
    (life7_26)[life8_30] = ((byte)(-1));
    life8_30 += 1;
    if (!((life3_7 == 0))) {
        break forest_join_45;
    }
    if (!((life3_7 != 0))) {
        continue forest_cycle_31;
    }
    break forest_cycle_31;
    }
    }
    life6_18 += 1;
    }
    if (!((life3_7 != 0))) {
        continue forest_cycle_19;
    }
    break forest_cycle_19;
    }
    break forest_cycle_9;
    }
    }
    life4_6 += 1;
    if (!((life3_7 != 0))) {
        continue forest_cycle_8;
    }
    break forest_cycle_8;
    }
    }
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_8725dae22d49_originalDynamicSite601_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8725dae22d49_originalDynamicSite601_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8725dae22d49_originalDynamicSite601_11(int a0, long a1) throws E;

private static native <E extends Throwable> byte[][][] __sourceIntrinsic_8725dae22d49_multiArray601_22(int a0, int a1, int a2) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral6559_0() throws E;
}
