package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public abstract class Nq {

private final java.lang.String a;

private int b;

private int[] c;

private static java.lang.String d;

private static final long g;

private static final long[] i;

private static final java.lang.Integer[] j;

private static final java.util.Map k;

public Nq(java.lang.String p0) {
super();
    this.b = ((int)(0));
    this.c = ((int[])(new int[] {-1}));
    this.a = ((java.lang.String)(p0));
    return;
}


static {
g = ((long)(((moom._a)(moom._c.a(((long)(8541063521867471524L)), ((long)(1201402434047612012L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(257818654668540L)))));
    java.lang.String __sourceSpill734_6 = "rEhGe";
    k = ((java.util.Map)(new java.util.HashMap(13)));
    moom.Nq.b(((java.lang.String)(__sourceSpill734_6)));
    long local0_life9 = (moom.Nq.g ^ 51286761838321L);
    javax.crypto.Cipher local2_life11;
    javax.crypto.Cipher __sourceSpill734_13 = (local2_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill734_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill734_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill734_16 = new byte[8];
    (__sourceSpill734_16)[0] = ((byte) ((int) (local0_life9 >>> 56)));
    int local3_life17 = 1;
    while ((local3_life17 < 8)) {
        (__sourceSpill734_16)[local3_life17] = ((byte) ((int) ((local0_life9 << (local3_life17 * 8)) >>> 56)));
        local3_life17 += 1;
    }
    byte[] __sourcePreallocation734_18 = __sourceSpill734_16;
    ((javax.crypto.Cipher)(__sourceSpill734_13)).init(((int)(__sourceSpill734_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill734_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation734_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life21 = new long[2];
    int local5_life22 = 0;
    java.lang.String local6_life23;
    int local7_life25 = ((java.lang.String)((local6_life23 = "½`÷ÍådSÃOØ,aÈ"))).length();
    int local4_life26 = 0;
    do {
        java.lang.String __sourceSpill734_27 = local6_life23;
        int __sourceSpill734_28 = local4_life26;
        local4_life26 += 8;
        byte[] local9_life31 = ((java.lang.String)(((java.lang.String)(__sourceSpill734_27)).substring(((int)(__sourceSpill734_28)), ((int)(local4_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill734_32 = local8_life21;
        int __sourceSpill734_33 = local5_life22;
        local5_life22 += 1;
        long local10_life34 = (((((((((((long) (local9_life31)[0]) & 255L) << 56) | ((((long) (local9_life31)[1]) & 255L) << 48)) | ((((long) (local9_life31)[2]) & 255L) << 40)) | ((((long) (local9_life31)[3]) & 255L) << 32)) | ((((long) (local9_life31)[4]) & 255L) << 24)) | ((((long) (local9_life31)[5]) & 255L) << 16)) | ((((long) (local9_life31)[6]) & 255L) << 8)) | (((long) (local9_life31)[7]) & 255L));
        byte[] __sourceSpill734_35 = new byte[8];
        (__sourceSpill734_35)[0] = ((byte) ((int) (local10_life34 >>> 56)));
        (__sourceSpill734_35)[1] = ((byte) ((int) (local10_life34 >>> 48)));
        (__sourceSpill734_35)[2] = ((byte) ((int) (local10_life34 >>> 40)));
        (__sourceSpill734_35)[3] = ((byte) ((int) (local10_life34 >>> 32)));
        (__sourceSpill734_35)[4] = ((byte) ((int) (local10_life34 >>> 24)));
        (__sourceSpill734_35)[5] = ((byte) ((int) (local10_life34 >>> 16)));
        (__sourceSpill734_35)[6] = ((byte) ((int) (local10_life34 >>> 8)));
        (__sourceSpill734_35)[7] = ((byte) ((int) local10_life34));
        javax.crypto.Cipher __sourceSpill734_36 = local2_life11;
        byte[] local12_life38 = ((javax.crypto.Cipher)(__sourceSpill734_36)).doFinal(((byte[])(__sourceSpill734_35)));
        (__sourceSpill734_32)[__sourceSpill734_33] = (((((((((((long) (local12_life38)[0]) & 255L) << 56) | ((((long) (local12_life38)[1]) & 255L) << 48)) | ((((long) (local12_life38)[2]) & 255L) << 40)) | ((((long) (local12_life38)[3]) & 255L) << 32)) | ((((long) (local12_life38)[4]) & 255L) << 24)) | ((((long) (local12_life38)[5]) & 255L) << 16)) | ((((long) (local12_life38)[6]) & 255L) << 8)) | (((long) (local12_life38)[7]) & 255L));
    } while ((!(local4_life26 >= local7_life25)));
    i = ((long[])(local8_life21));
    j = ((java.lang.Integer[])(new java.lang.Integer[2]));
}


public java.lang.String toString() {
return this.a;
}


public void b__Void() {
(this.c)[this.b] = -1;
    return;
}


public int b() {
int forwardValue2868_18_0;
    int forwardValue2868_41_0;
    int spill2868_0;
    int spill2868_1;
    long life1_3;
    java.lang.String life3_5;
    int life4_23;
    forward_join_41: {
    forward_join_40: {
    forward_join_18: {
    forward_join_13: {
    life1_3 = (moom.Nq.g ^ 110772985693983L);
    life3_5 = moom.Nq.b__String();
    spill2868_0 = this.b;
    if (!((life3_5 != null))) {
        forwardValue2868_18_0 = spill2868_0;
        break forward_join_18;
    }
    if (!((spill2868_0 <= 0))) {
        break forward_join_13;
    }
    return -1;
    }
    forwardValue2868_18_0 = (this.c)[this.b];
    }
    life4_23 = forwardValue2868_18_0;
    spill2868_1 = life4_23;
    if (!((life3_5 != null))) {
        forwardValue2868_41_0 = spill2868_1;
        break forward_join_41;
    }
    if (!((spill2868_1 == __sourceIntrinsic_e1958f95391c_invokedynamic2868_5(3950, (6425304906024216188L ^ life1_3))))) {
        break forward_join_40;
    }
    life4_23 = org.lwjgl.opengl.ARBShaderObjects.glGetUniformLocationARB(((int)(this.b)), ((java.lang.CharSequence)(this.a)));
    (this.c)[this.b] = life4_23;
    }
    forwardValue2868_41_0 = life4_23;
    }
    return forwardValue2868_41_0;
}


public static java.lang.String b__String() {
return moom.Nq.d;
}


public static void b(java.lang.String p0) {
moom.Nq.d = ((java.lang.String)(p0));
    return;
}


protected abstract void b(int p0);

protected void e() {
moom.Nq forwardValue2869_13_0;
    moom.Nq spill2869_0;
    long life1_3;
    java.lang.String life3_5;
    forward_join_14: {
    forward_join_13: {
    life1_3 = (moom.Nq.g ^ 74721449919187L);
    life3_5 = moom.Nq.b__String();
    spill2869_0 = this;
    if (!((life3_5 != null))) {
        forwardValue2869_13_0 = spill2869_0;
        break forward_join_13;
    }
    if (!((moom.MP.b(((java.lang.String)(((moom.Nq)(spill2869_0)).a))) != 0))) {
        break forward_join_14;
    }
    forwardValue2869_13_0 = this;
    }
    ((moom.Nq)(forwardValue2869_13_0)).b__Void();
    }
    return;
}


public void c() {
this.b = ((int)(0));
    this.c = ((int[])(new int[] {-1}));
    this.d();
    return;
}


protected abstract void d();

public void a(int p0) {
moom.Nq forwardValue2865_18_0;
    moom.Nq spill2865_0;
    long life2_3;
    java.lang.String life4_5;
    forward_join_20: {
    forward_join_18: {
    life2_3 = (moom.Nq.g ^ 76952232879895L);
    life4_5 = moom.Nq.b__String();
    spill2865_0 = this;
    if (!((life4_5 != null))) {
        forwardValue2865_18_0 = spill2865_0;
        break forward_join_18;
    }
    if (!((((moom.Nq)(spill2865_0)).b != p0))) {
        break forward_join_20;
    }
    this.b = ((int)(p0));
    ((moom.Nq)(this)).a__Void();
    forwardValue2865_18_0 = this;
    }
    ((moom.Nq)(forwardValue2865_18_0)).b(((int)(p0)));
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static int a(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x441C;
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
                throw new RuntimeException("moom/Nq", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Nq.j[n2] = n4;
        }
        return j[n2];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.Nq.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral6740_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Nq"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public boolean a__Boolean() {
int forwardValue2866_12_0;
    int forwardValue2866_14_0;
    int spill2866_0;
    long life1_3;
    java.lang.String life3_5;
    forward_join_14: {
    forward_join_13: {
    forward_join_12: {
    life1_3 = (moom.Nq.g ^ 99999201276023L);
    life3_5 = moom.Nq.b__String();
    spill2866_0 = this.b();
    if (!((life3_5 != null))) {
        forwardValue2866_12_0 = spill2866_0;
        break forward_join_12;
    }
    if (!((spill2866_0 >= 0))) {
        break forward_join_13;
    }
    forwardValue2866_12_0 = 1;
    }
    forwardValue2866_14_0 = forwardValue2866_12_0;
    break forward_join_14;
    }
    forwardValue2866_14_0 = 0;
    }
    return ((forwardValue2866_14_0) != 0);
}


public int a() {
return this.b;
}


public java.lang.String a__String() {
return this.a;
}


private void a__Void() {
int forwardValue2867_17_0;
    int forwardValue2867_17_1;
    int spill2867_0;
    int spill2867_1;
    long life1_3;
    java.lang.String life3_5;
    int[] life4_25;
    forward_join_39: {
    forward_join_17: {
    life1_3 = (moom.Nq.g ^ 109800207604253L);
    life3_5 = moom.Nq.b__String();
    spill2867_0 = this.b;
    spill2867_1 = (this.c).length;
    if (!((life3_5 != null))) {
        forwardValue2867_17_0 = spill2867_0;
        forwardValue2867_17_1 = spill2867_1;
        break forward_join_17;
    }
    if (!((spill2867_0 >= spill2867_1))) {
        break forward_join_39;
    }
    forwardValue2867_17_0 = this.b;
    forwardValue2867_17_1 = 2;
    }
    life4_25 = new int[(forwardValue2867_17_0 * forwardValue2867_17_1)];
    java.util.Arrays.fill(((int[])(life4_25)), ((int)(__sourceIntrinsic_b82a5b29b709_invokedynamic2867_5(17632, (1066420854200299761L ^ life1_3)))));
    java.lang.System.arraycopy(((java.lang.Object)(this.c)), ((int)(0)), ((java.lang.Object)(life4_25)), ((int)(0)), ((int)((this.c).length)));
    this.c = ((int[])(life4_25));
    }
    return;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral6740_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic2867_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e1958f95391c_invokedynamic2868_5(int a0, long a1) throws E;
}
