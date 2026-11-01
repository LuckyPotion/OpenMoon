package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class G2 {

public int a;

public int b;

public int c;

public int d;

public int e;

public int f;

private static int[] g;

private static long h;

private static long[] i;

private static java.lang.Integer[] j;

private static java.util.Map k;

public G2(moom.G2 p0) {
super();
    this.a = p0.a;
    this.b = p0.b;
    this.c = p0.c;
    this.d = p0.d;
    this.e = p0.e;
    this.f = p0.f;
}


public G2(int p0, int p1, int p2, int p3, int p4, int p5) {
super();
    this.a = p0;
    this.b = p1;
    this.c = p2;
    this.d = p3;
    this.e = p4;
    this.f = p5;
}


public G2(moom.DS p0, moom.DS p1) {
super();
    this.a = java.lang.Math.min((p0).a(), (p1).a());
    this.b = java.lang.Math.min((p0).b(), (p1).b());
    this.c = java.lang.Math.min((p0).c(), (p1).c());
    this.d = java.lang.Math.max((p0).a(), (p1).a());
    this.e = java.lang.Math.max((p0).b(), (p1).b());
    this.f = java.lang.Math.max((p0).c(), (p1).c());
}


public G2(int p0, int p1, int p2, int p3) { super(); }

private static void __sourceConstructorBody_c8da8de8183114f6(moom.G2 receiver, int p0, int p1, int p2, int p3) throws Throwable {
long local5 = (moom.G2.h ^ 64172276952698L);
    moom.G2.__sourceConstructorInit_c8da8de8183114f6_0(((moom.G2)(receiver)));
    ((moom.G2)(receiver)).a = ((int)(p0));
    ((moom.G2)(receiver)).c = ((int)(p1));
    ((moom.G2)(receiver)).d = ((int)(p2));
    ((moom.G2)(receiver)).f = ((int)(p3));
    ((moom.G2)(receiver)).b = ((int)(1));
    ((moom.G2)(receiver)).e = ((int)(__sourceIntrinsic_c8da8de8183114f6_originalDynamicSite2055_7(11961, (1680560180433047219L ^ local5))));
    return;
}


public G2(int[] p0) { super(); }

private static void __sourceConstructorBody_1c90fa46aaaf09e5(moom.G2 receiver, int[] p0) throws Throwable {
forward_join_48: {
    forward_join_43: {
    long local2_life2 = (moom.G2.h ^ 43730682295824L);
    net.minecraft.entity.Entity[] __sourceSpill497_4 = moom.G4.b();
    moom.G2.__sourceConstructorInit_1c90fa46aaaf09e5_0(((moom.G2)(receiver)));
    net.minecraft.entity.Entity[] local4_life6 = __sourceSpill497_4;
    if (!((local4_life6 != null))) { break forward_join_43; }
    if (!(((p0).length == __sourceIntrinsic_1c90fa46aaaf09e5_originalDynamicSite497_8(30119, (893613676433313219L ^ local2_life2))))) { break forward_join_48; }
    ((moom.G2)(receiver)).a = ((int)((p0)[0]));
    ((moom.G2)(receiver)).b = ((int)((p0)[1]));
    ((moom.G2)(receiver)).c = ((int)((p0)[2]));
    ((moom.G2)(receiver)).d = ((int)((p0)[3]));
    ((moom.G2)(receiver)).e = ((int)((p0)[4]));
    }
    ((moom.G2)(receiver)).f = ((int)((p0)[5]));
    }
    return;
}


public G2() {
super();
}


static {
h = ((long)(((moom._a)(moom._c.a(((long)(-73925068915639212L)), ((long)(7060901758884839192L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(268195465343355L)))));
    int[] __sourceSpill767_6 = new int[1];
    k = ((java.util.Map)(new java.util.HashMap(13)));
    moom.G2.b(((int[])(__sourceSpill767_6)));
    long local0_life9 = (moom.G2.h ^ 54232656002161L);
    javax.crypto.Cipher local2_life11;
    javax.crypto.Cipher __sourceSpill767_13 = (local2_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill767_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill767_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill767_16 = new byte[8];
    (__sourceSpill767_16)[0] = ((byte) ((int) (local0_life9 >>> 56)));
    int local3_life17 = 1;
    while ((local3_life17 < 8)) {
        (__sourceSpill767_16)[local3_life17] = ((byte) ((int) ((local0_life9 << (local3_life17 * 8)) >>> 56)));
        local3_life17 += 1;
    }
    byte[] __sourcePreallocation767_18 = __sourceSpill767_16;
    ((javax.crypto.Cipher)(__sourceSpill767_13)).init(((int)(__sourceSpill767_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill767_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation767_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life21 = new long[7];
    int local5_life22 = 0;
    java.lang.String local6_life23;
    int local7_life25 = ((java.lang.String)((local6_life23 = "â i¡£¾wÛ\002o©ï(èªvp«ÏÀ\t÷ÖIÏk\036P\007 \nð\0325\022i\033"))).length();
    int local4_life26 = 0;
    do {
        java.lang.String __sourceSpill767_27 = local6_life23;
        int __sourceSpill767_28 = local4_life26;
        local4_life26 += 8;
        byte[] local9_life31 = ((java.lang.String)(((java.lang.String)(__sourceSpill767_27)).substring(((int)(__sourceSpill767_28)), ((int)(local4_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill767_32 = local8_life21;
        int __sourceSpill767_33 = local5_life22;
        local5_life22 += 1;
        long local10_life34 = (((((((((((long) (local9_life31)[0]) & 255L) << 56) | ((((long) (local9_life31)[1]) & 255L) << 48)) | ((((long) (local9_life31)[2]) & 255L) << 40)) | ((((long) (local9_life31)[3]) & 255L) << 32)) | ((((long) (local9_life31)[4]) & 255L) << 24)) | ((((long) (local9_life31)[5]) & 255L) << 16)) | ((((long) (local9_life31)[6]) & 255L) << 8)) | (((long) (local9_life31)[7]) & 255L));
        byte[] __sourceSpill767_35 = new byte[8];
        (__sourceSpill767_35)[0] = ((byte) ((int) (local10_life34 >>> 56)));
        (__sourceSpill767_35)[1] = ((byte) ((int) (local10_life34 >>> 48)));
        (__sourceSpill767_35)[2] = ((byte) ((int) (local10_life34 >>> 40)));
        (__sourceSpill767_35)[3] = ((byte) ((int) (local10_life34 >>> 32)));
        (__sourceSpill767_35)[4] = ((byte) ((int) (local10_life34 >>> 24)));
        (__sourceSpill767_35)[5] = ((byte) ((int) (local10_life34 >>> 16)));
        (__sourceSpill767_35)[6] = ((byte) ((int) (local10_life34 >>> 8)));
        (__sourceSpill767_35)[7] = ((byte) ((int) local10_life34));
        javax.crypto.Cipher __sourceSpill767_36 = local2_life11;
        byte[] local12_life38 = ((javax.crypto.Cipher)(__sourceSpill767_36)).doFinal(((byte[])(__sourceSpill767_35)));
        (__sourceSpill767_32)[__sourceSpill767_33] = (((((((((((long) (local12_life38)[0]) & 255L) << 56) | ((((long) (local12_life38)[1]) & 255L) << 48)) | ((((long) (local12_life38)[2]) & 255L) << 40)) | ((((long) (local12_life38)[3]) & 255L) << 32)) | ((((long) (local12_life38)[4]) & 255L) << 24)) | ((((long) (local12_life38)[5]) & 255L) << 16)) | ((((long) (local12_life38)[6]) & 255L) << 8)) | (((long) (local12_life38)[7]) & 255L));
    } while ((!(local4_life26 >= local7_life25)));
    local7_life25 = ((java.lang.String)((local6_life23 = "W9Ëîç>$~ø´Í~s\017d"))).length();
    local4_life26 = 0;
    do {
        java.lang.String __sourceSpill767_40 = local6_life23;
        int __sourceSpill767_41 = local4_life26;
        local4_life26 += 8;
        byte[] local9_life44 = ((java.lang.String)(((java.lang.String)(__sourceSpill767_40)).substring(((int)(__sourceSpill767_41)), ((int)(local4_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill767_45 = local8_life21;
        int __sourceSpill767_46 = local5_life22;
        local5_life22 += 1;
        long local10_life47 = (((((((((((long) (local9_life44)[0]) & 255L) << 56) | ((((long) (local9_life44)[1]) & 255L) << 48)) | ((((long) (local9_life44)[2]) & 255L) << 40)) | ((((long) (local9_life44)[3]) & 255L) << 32)) | ((((long) (local9_life44)[4]) & 255L) << 24)) | ((((long) (local9_life44)[5]) & 255L) << 16)) | ((((long) (local9_life44)[6]) & 255L) << 8)) | (((long) (local9_life44)[7]) & 255L));
        byte[] __sourceSpill767_48 = new byte[8];
        (__sourceSpill767_48)[0] = ((byte) ((int) (local10_life47 >>> 56)));
        (__sourceSpill767_48)[1] = ((byte) ((int) (local10_life47 >>> 48)));
        (__sourceSpill767_48)[2] = ((byte) ((int) (local10_life47 >>> 40)));
        (__sourceSpill767_48)[3] = ((byte) ((int) (local10_life47 >>> 32)));
        (__sourceSpill767_48)[4] = ((byte) ((int) (local10_life47 >>> 24)));
        (__sourceSpill767_48)[5] = ((byte) ((int) (local10_life47 >>> 16)));
        (__sourceSpill767_48)[6] = ((byte) ((int) (local10_life47 >>> 8)));
        (__sourceSpill767_48)[7] = ((byte) ((int) local10_life47));
        javax.crypto.Cipher __sourceSpill767_49 = local2_life11;
        byte[] local12_life51 = ((javax.crypto.Cipher)(__sourceSpill767_49)).doFinal(((byte[])(__sourceSpill767_48)));
        (__sourceSpill767_45)[__sourceSpill767_46] = (((((((((((long) (local12_life51)[0]) & 255L) << 56) | ((((long) (local12_life51)[1]) & 255L) << 48)) | ((((long) (local12_life51)[2]) & 255L) << 40)) | ((((long) (local12_life51)[3]) & 255L) << 32)) | ((((long) (local12_life51)[4]) & 255L) << 24)) | ((((long) (local12_life51)[5]) & 255L) << 16)) | ((((long) (local12_life51)[6]) & 255L) << 8)) | (((long) (local12_life51)[7]) & 255L));
    } while ((!(local4_life26 >= local7_life25)));
    i = ((long[])(local8_life21));
    j = ((java.lang.Integer[])(new java.lang.Integer[7]));
}

private static native <E extends Throwable> void __sourceConstructorInit_c8da8de8183114f6_0(moom.G2 a0) throws E;
private static native <E extends Throwable> void __sourceConstructorInit_1c90fa46aaaf09e5_0(moom.G2 a0) throws E;
private static native <E extends Throwable> moom.yy __sourceHandlerCall_b963225f86c4cd56db3b(moom.G2 a0) throws E;
private static final class __SourceHandler_b963225f86c4cd56db3b {

public static moom.yy f100083(moom.G2 receiver) throws Throwable {
    moom.yy spill100083_0;
    moom.yy spill100083_1;
    int[] spill100083_2;
    int[] spill100083_3;
    int[] spill100083_4;
    int[] spill100083_5;
    int[] spill100083_6;
    int[] spill100083_7;
    long life1_3;
    life1_3 = (__fieldRead100083_0() ^ 9720146223838L);
    moom.yy __stackOp100083_2_0 = __sourceUninitializedNEW100083_1();
    spill100083_0 = __stackOp100083_2_0;
    spill100083_1 = __stackOp100083_2_0;
    int[] __stackOp100083_4_0 = new int[__invokedynamic100083_3(1876, (940234109475859448L ^ life1_3))];
    spill100083_2 = __stackOp100083_4_0;
    (__stackOp100083_4_0)[0] = __fieldRead100083_5(receiver);
    int[] __stackOp100083_6_0 = spill100083_2;
    spill100083_3 = __stackOp100083_6_0;
    (__stackOp100083_6_0)[1] = __fieldRead100083_7(receiver);
    int[] __stackOp100083_8_0 = spill100083_3;
    spill100083_4 = __stackOp100083_8_0;
    (__stackOp100083_8_0)[2] = __fieldRead100083_9(receiver);
    int[] __stackOp100083_10_0 = spill100083_4;
    spill100083_5 = __stackOp100083_10_0;
    (__stackOp100083_10_0)[3] = __fieldRead100083_11(receiver);
    int[] __stackOp100083_12_0 = spill100083_5;
    spill100083_6 = __stackOp100083_12_0;
    (__stackOp100083_12_0)[4] = __fieldRead100083_13(receiver);
    int[] __stackOp100083_14_0 = spill100083_6;
    spill100083_7 = __stackOp100083_14_0;
    (__stackOp100083_14_0)[5] = __fieldRead100083_15(receiver);
    __explicitNewInit100083_16(spill100083_1, spill100083_7);
    return spill100083_0;
}
private static native long __fieldRead100083_0() throws Throwable;
private static native moom.yy __sourceUninitializedNEW100083_1() throws Throwable;
private static native int __invokedynamic100083_3(int a0, long a1) throws Throwable;
private static native int __fieldRead100083_5(moom.G2 a0) throws Throwable;
private static native int __fieldRead100083_7(moom.G2 a0) throws Throwable;
private static native int __fieldRead100083_9(moom.G2 a0) throws Throwable;
private static native int __fieldRead100083_11(moom.G2 a0) throws Throwable;
private static native int __fieldRead100083_13(moom.G2 a0) throws Throwable;
private static native int __fieldRead100083_15(moom.G2 a0) throws Throwable;
private static native void __explicitNewInit100083_16(moom.yy a0, int[] a1) throws Throwable;

}


public java.lang.String toString() {
return ((com.google.common.base.MoreObjects.ToStringHelper)(((com.google.common.base.MoreObjects.ToStringHelper)(((com.google.common.base.MoreObjects.ToStringHelper)(((com.google.common.base.MoreObjects.ToStringHelper)(((com.google.common.base.MoreObjects.ToStringHelper)(((com.google.common.base.MoreObjects.ToStringHelper)(((com.google.common.base.MoreObjects.ToStringHelper)(com.google.common.base.MoreObjects.toStringHelper(((java.lang.Object)(this))))).add(((java.lang.String)("x0")), ((int)(this.a))))).add(((java.lang.String)("y0")), ((int)(this.b))))).add(((java.lang.String)("z0")), ((int)(this.c))))).add(((java.lang.String)("x1")), ((int)(this.d))))).add(((java.lang.String)("y1")), ((int)(this.e))))).add(((java.lang.String)("z1")), ((int)(this.f))))).toString();
}


public static int[] b__ArrayInt() {
return moom.G2.g;
}


public moom.DS b__DS() {
return new moom.DT((this.a + (((this.d - this.a) + 1) / 2)), (this.b + (((this.e - this.b) + 1) / 2)), (this.c + (((this.f - this.c) + 1) / 2)));
}


public static void b(int[] p0) {
g = ((int[])(p0));
    return;
}


public int b() {
return ((this.e - this.b) + 1);
}


public int c() {
return ((this.f - this.c) + 1);
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.G2.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral4586_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/G2"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static int a(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0xB07;
        if (j[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = i[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])k.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    k.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/G2", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            G2.j[n2] = n3;
        }
        return j[n2];
}


public moom.yy a__yy() { return __sourceHandlerCall_b963225f86c4cd56db3b(this); }


public boolean a(int p0, int p1, int p2, int p3) {
int forwardValue1961_15_0;
    int forwardValue1961_15_1;
    int forwardValue1961_21_0;
    int forwardValue1961_21_1;
    int forwardValue1961_29_0;
    int forwardValue1961_29_1;
    int forwardValue1961_31_0;
    int forwardValue1961_33_0;
    int spill1961_0;
    int spill1961_1;
    int spill1961_2;
    long life5_3;
    net.minecraft.entity.Entity[] life7_5;
    forward_join_33: {
    forward_join_32: {
    forward_join_31: {
    forward_join_29: {
    forward_join_21: {
    forward_join_15: {
    life5_3 = (moom.G2.h ^ 30882804236060L);
    life7_5 = moom.G4.b();
    spill1961_0 = this.d;
    spill1961_1 = p0;
    if (!((life7_5 != null))) {
        forwardValue1961_15_0 = spill1961_0;
        forwardValue1961_15_1 = spill1961_1;
        break forward_join_15;
    }
    if (!((spill1961_0 >= spill1961_1))) {
        break forward_join_32;
    }
    forwardValue1961_15_0 = this.a;
    forwardValue1961_15_1 = p2;
    }
    if (!((life7_5 != null))) {
        forwardValue1961_21_0 = forwardValue1961_15_0;
        forwardValue1961_21_1 = forwardValue1961_15_1;
        break forward_join_21;
    }
    if (!((forwardValue1961_15_0 <= forwardValue1961_15_1))) {
        break forward_join_32;
    }
    forwardValue1961_21_0 = this.f;
    forwardValue1961_21_1 = p1;
    }
    if (!((life7_5 != null))) {
        forwardValue1961_29_0 = forwardValue1961_21_0;
        forwardValue1961_29_1 = forwardValue1961_21_1;
        break forward_join_29;
    }
    if (!((forwardValue1961_21_0 >= forwardValue1961_21_1))) {
        break forward_join_32;
    }
    spill1961_2 = this.c;
    if (!((life7_5 != null))) {
        forwardValue1961_31_0 = spill1961_2;
        break forward_join_31;
    }
    forwardValue1961_29_0 = spill1961_2;
    forwardValue1961_29_1 = p3;
    }
    if (!((forwardValue1961_29_0 <= forwardValue1961_29_1))) {
        break forward_join_32;
    }
    forwardValue1961_31_0 = 1;
    }
    forwardValue1961_33_0 = forwardValue1961_31_0;
    break forward_join_33;
    }
    forwardValue1961_33_0 = 0;
    }
    return ((forwardValue1961_33_0) != 0);
}


public boolean a__Boolean(moom.G2 p0) {
int forwardValue1963_17_0;
    int forwardValue1963_17_1;
    int forwardValue1963_24_0;
    int forwardValue1963_24_1;
    int forwardValue1963_31_0;
    int forwardValue1963_31_1;
    int forwardValue1963_38_0;
    int forwardValue1963_38_1;
    int forwardValue1963_47_0;
    int forwardValue1963_47_1;
    int forwardValue1963_49_0;
    int forwardValue1963_51_0;
    int spill1963_0;
    int spill1963_1;
    int spill1963_2;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_51: {
    forward_join_50: {
    forward_join_49: {
    forward_join_47: {
    forward_join_38: {
    forward_join_31: {
    forward_join_24: {
    forward_join_17: {
    life2_3 = (moom.G2.h ^ 1503014149145L);
    life4_5 = moom.G4.b();
    spill1963_0 = this.d;
    spill1963_1 = ((moom.G2)(p0)).a;
    if (!((life4_5 != null))) {
        forwardValue1963_17_0 = spill1963_0;
        forwardValue1963_17_1 = spill1963_1;
        break forward_join_17;
    }
    if (!((spill1963_0 >= spill1963_1))) {
        break forward_join_50;
    }
    forwardValue1963_17_0 = this.a;
    forwardValue1963_17_1 = ((moom.G2)(p0)).d;
    }
    if (!((life4_5 != null))) {
        forwardValue1963_24_0 = forwardValue1963_17_0;
        forwardValue1963_24_1 = forwardValue1963_17_1;
        break forward_join_24;
    }
    if (!((forwardValue1963_17_0 <= forwardValue1963_17_1))) {
        break forward_join_50;
    }
    forwardValue1963_24_0 = this.f;
    forwardValue1963_24_1 = ((moom.G2)(p0)).c;
    }
    if (!((life4_5 != null))) {
        forwardValue1963_31_0 = forwardValue1963_24_0;
        forwardValue1963_31_1 = forwardValue1963_24_1;
        break forward_join_31;
    }
    if (!((forwardValue1963_24_0 >= forwardValue1963_24_1))) {
        break forward_join_50;
    }
    forwardValue1963_31_0 = this.c;
    forwardValue1963_31_1 = ((moom.G2)(p0)).f;
    }
    if (!((life4_5 != null))) {
        forwardValue1963_38_0 = forwardValue1963_31_0;
        forwardValue1963_38_1 = forwardValue1963_31_1;
        break forward_join_38;
    }
    if (!((forwardValue1963_31_0 <= forwardValue1963_31_1))) {
        break forward_join_50;
    }
    forwardValue1963_38_0 = this.e;
    forwardValue1963_38_1 = ((moom.G2)(p0)).b;
    }
    if (!((life4_5 != null))) {
        forwardValue1963_47_0 = forwardValue1963_38_0;
        forwardValue1963_47_1 = forwardValue1963_38_1;
        break forward_join_47;
    }
    if (!((forwardValue1963_38_0 >= forwardValue1963_38_1))) {
        break forward_join_50;
    }
    spill1963_2 = this.b;
    if (!((life4_5 != null))) {
        forwardValue1963_49_0 = spill1963_2;
        break forward_join_49;
    }
    forwardValue1963_47_0 = spill1963_2;
    forwardValue1963_47_1 = ((moom.G2)(p0)).e;
    }
    if (!((forwardValue1963_47_0 <= forwardValue1963_47_1))) {
        break forward_join_50;
    }
    forwardValue1963_49_0 = 1;
    }
    forwardValue1963_51_0 = forwardValue1963_49_0;
    break forward_join_51;
    }
    forwardValue1963_51_0 = 0;
    }
    return ((forwardValue1963_51_0) != 0);
}


public static moom.G2 a(int p0, int p1, int p2, int p3, int p4, int p5) {
return new moom.G2(java.lang.Math.min(((int)(p0)), ((int)(p3))), java.lang.Math.min(((int)(p1)), ((int)(p4))), java.lang.Math.min(((int)(p2)), ((int)(p5))), java.lang.Math.max(((int)(p0)), ((int)(p3))), java.lang.Math.max(((int)(p1)), ((int)(p4))), java.lang.Math.max(((int)(p2)), ((int)(p5))));
}


public static moom.G2 a(int p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8, moom.bs p9) {
long local10 = (moom.G2.h ^ 22490018415925L);
    switch ((moom.G3.a)[((moom.bs)(p9)).ordinal()]) {
case 1:
{
        return new moom.G2((p0 + p3), (p1 + p4), (((p2 - p8) + 1) + p5), (((p0 + p6) - 1) + p3), (((p1 + p7) - 1) + p4), (p2 + p5));
    }
case 2:
{
        return new moom.G2((((p0 - p8) + 1) + p5), (p1 + p4), (p2 + p3), (p0 + p5), (((p1 + p7) - 1) + p4), (((p2 + p6) - 1) + p3));
    }
case 3:
{
        return new moom.G2((p0 + p5), (p1 + p4), (p2 + p3), (((p0 + p8) - 1) + p5), (((p1 + p7) - 1) + p4), (((p2 + p6) - 1) + p3));
    }
default:
{
        return new moom.G2((p0 + p3), (p1 + p4), (p2 + p5), (((p0 + p6) - 1) + p3), (((p1 + p7) - 1) + p4), (((p2 + p8) - 1) + p5));
    }
}
}


public static moom.G2 a__G2() {
long local0 = (moom.G2.h ^ 120002373734875L);
    return new moom.G2(__sourceIntrinsic_c5b2a2ac158d_originalDynamicSite1162_1(27663, (3125609926279132067L ^ local0)), __sourceIntrinsic_c5b2a2ac158d_originalDynamicSite1162_2(29818, (7611268419075959762L ^ local0)), __sourceIntrinsic_c5b2a2ac158d_originalDynamicSite1162_3(29818, (7611268419075959762L ^ local0)), __sourceIntrinsic_c5b2a2ac158d_originalDynamicSite1162_4(21418, (194730980040231940L ^ local0)), __sourceIntrinsic_c5b2a2ac158d_originalDynamicSite1162_5(16056, (8208955273995886869L ^ local0)), __sourceIntrinsic_c5b2a2ac158d_originalDynamicSite1162_6(16056, (8208955273995886869L ^ local0)));
}


public int a() {
return ((this.d - this.a) + 1);
}


public moom.DS a__DS() {
return new moom.DS((this.d - this.a), (this.e - this.b), (this.f - this.c));
}


public boolean a(moom.DS p0) {
int forwardValue1962_17_0;
    int forwardValue1962_17_1;
    int forwardValue1962_24_0;
    int forwardValue1962_24_1;
    int forwardValue1962_31_0;
    int forwardValue1962_31_1;
    int forwardValue1962_38_0;
    int forwardValue1962_38_1;
    int forwardValue1962_47_0;
    int forwardValue1962_47_1;
    int forwardValue1962_49_0;
    int forwardValue1962_51_0;
    int spill1962_0;
    int spill1962_1;
    int spill1962_2;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_51: {
    forward_join_50: {
    forward_join_49: {
    forward_join_47: {
    forward_join_38: {
    forward_join_31: {
    forward_join_24: {
    forward_join_17: {
    life2_3 = (moom.G2.h ^ 96161083117132L);
    life4_5 = moom.G4.b();
    spill1962_0 = ((moom.DS)(p0)).a();
    spill1962_1 = this.a;
    if (!((life4_5 != null))) {
        forwardValue1962_17_0 = spill1962_0;
        forwardValue1962_17_1 = spill1962_1;
        break forward_join_17;
    }
    if (!((spill1962_0 >= spill1962_1))) {
        break forward_join_50;
    }
    forwardValue1962_17_0 = ((moom.DS)(p0)).a();
    forwardValue1962_17_1 = this.d;
    }
    if (!((life4_5 != null))) {
        forwardValue1962_24_0 = forwardValue1962_17_0;
        forwardValue1962_24_1 = forwardValue1962_17_1;
        break forward_join_24;
    }
    if (!((forwardValue1962_17_0 <= forwardValue1962_17_1))) {
        break forward_join_50;
    }
    forwardValue1962_24_0 = ((moom.DS)(p0)).c();
    forwardValue1962_24_1 = this.c;
    }
    if (!((life4_5 != null))) {
        forwardValue1962_31_0 = forwardValue1962_24_0;
        forwardValue1962_31_1 = forwardValue1962_24_1;
        break forward_join_31;
    }
    if (!((forwardValue1962_24_0 >= forwardValue1962_24_1))) {
        break forward_join_50;
    }
    forwardValue1962_31_0 = ((moom.DS)(p0)).c();
    forwardValue1962_31_1 = this.f;
    }
    if (!((life4_5 != null))) {
        forwardValue1962_38_0 = forwardValue1962_31_0;
        forwardValue1962_38_1 = forwardValue1962_31_1;
        break forward_join_38;
    }
    if (!((forwardValue1962_31_0 <= forwardValue1962_31_1))) {
        break forward_join_50;
    }
    forwardValue1962_38_0 = ((moom.DS)(p0)).b();
    forwardValue1962_38_1 = this.b;
    }
    if (!((life4_5 != null))) {
        forwardValue1962_47_0 = forwardValue1962_38_0;
        forwardValue1962_47_1 = forwardValue1962_38_1;
        break forward_join_47;
    }
    if (!((forwardValue1962_38_0 >= forwardValue1962_38_1))) {
        break forward_join_50;
    }
    spill1962_2 = ((moom.DS)(p0)).b();
    if (!((life4_5 != null))) {
        forwardValue1962_49_0 = spill1962_2;
        break forward_join_49;
    }
    forwardValue1962_47_0 = spill1962_2;
    forwardValue1962_47_1 = this.e;
    }
    if (!((forwardValue1962_47_0 <= forwardValue1962_47_1))) {
        break forward_join_50;
    }
    forwardValue1962_49_0 = 1;
    }
    forwardValue1962_51_0 = forwardValue1962_49_0;
    break forward_join_51;
    }
    forwardValue1962_51_0 = 0;
    }
    return ((forwardValue1962_51_0) != 0);
}


public void a(int p0, int p1, int p2) {
this.a += p0;
    this.b += p1;
    this.c += p2;
    this.d += p0;
    this.e += p1;
    this.f += p2;
    return;
}


public void a(moom.G2 p0) {
this.a = ((int)(java.lang.Math.min(((int)(this.a)), ((int)(((moom.G2)(p0)).a)))));
    this.b = ((int)(java.lang.Math.min(((int)(this.b)), ((int)(((moom.G2)(p0)).b)))));
    this.c = ((int)(java.lang.Math.min(((int)(this.c)), ((int)(((moom.G2)(p0)).c)))));
    this.d = ((int)(java.lang.Math.max(((int)(this.d)), ((int)(((moom.G2)(p0)).d)))));
    this.e = ((int)(java.lang.Math.max(((int)(this.e)), ((int)(((moom.G2)(p0)).e)))));
    this.f = ((int)(java.lang.Math.max(((int)(this.f)), ((int)(((moom.G2)(p0)).f)))));
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_c8da8de8183114f6_originalDynamicSite2055_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1c90fa46aaaf09e5_originalDynamicSite497_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral4586_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c5b2a2ac158d_originalDynamicSite1162_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c5b2a2ac158d_originalDynamicSite1162_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c5b2a2ac158d_originalDynamicSite1162_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c5b2a2ac158d_originalDynamicSite1162_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c5b2a2ac158d_originalDynamicSite1162_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c5b2a2ac158d_originalDynamicSite1162_6(int a0, long a1) throws E;
}
