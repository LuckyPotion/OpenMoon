package moom;

import io.netty.util.internal.ThreadLocalRandom;


public class vB {

private double a;

private int b;

private java.lang.String c;

private java.util.UUID d;

private boolean e;

private static int f;

private static long g;

private static long h;

public vB(java.lang.String p0, double p1, int p2) {
this(((java.util.UUID)(moom.Dr.a(((java.util.Random)(ThreadLocalRandom.current()))))), ((java.lang.String)(p0)), ((double)(p1)), ((int)(p2)));
    return;
}

private static native <E extends Throwable> void __sourceConstructorInit_46aec01c4f0cc1f5_0(moom.vB a0) throws E;

public vB(java.util.UUID p0, java.lang.String p1, double p2, int p3) { super(); }


private static void __sourceConstructorBody_46aec01c4f0cc1f5(moom.vB receiver, java.util.UUID p0, java.lang.String p1, double p2, int p3) throws Throwable {

long local6 = (moom.vB.g ^ 100419855687788L);

    moom.vB.__sourceConstructorInit_46aec01c4f0cc1f5_0(((moom.vB)(receiver)));

    ((moom.vB)(receiver)).e = ((boolean)(true));

    ((moom.vB)(receiver)).d = ((java.util.UUID)(p0));

    ((moom.vB)(receiver)).c = ((java.lang.String)(p1));

    ((moom.vB)(receiver)).a = ((double)(p2));

    ((moom.vB)(receiver)).b = ((int)(p3));

    org.apache.commons.lang3.Validate.notEmpty(((java.lang.CharSequence)(p1)), ((java.lang.String)("Modifier name cannot be empty")), ((java.lang.Object[])(new java.lang.Object[0])));

    org.apache.commons.lang3.Validate.inclusiveBetween(((long)(0L)), ((long)(moom.vB.h)), ((long)(((long) p3))), ((java.lang.String)("Invalid operation")));

    return;

}



static {
g = ((long)(((moom._a)(moom._c.a(((long)(-1845457808709267055L)), ((long)(-540453281435024371L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(115557341419998L)))));
    int __sourceSpill1070_6 = 23;
    long local0_life7 = (moom.vB.g ^ 4917251137542L);
    moom.vB.b(((int)(__sourceSpill1070_6)));
    javax.crypto.Cipher local2_life10;
    javax.crypto.Cipher __sourceSpill1070_12 = (local2_life10 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1070_13 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1070_14 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1070_15 = new byte[8];
    (__sourceSpill1070_15)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life16 = 1;
    while ((local3_life16 < 8)) {
        (__sourceSpill1070_15)[local3_life16] = ((byte) ((int) ((local0_life7 << (local3_life16 * 8)) >>> 56)));
        local3_life16 += 1;
    }
    byte[] __sourcePreallocation1070_17 = __sourceSpill1070_15;
    ((javax.crypto.Cipher)(__sourceSpill1070_12)).init(((int)(__sourceSpill1070_13)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1070_14)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1070_17)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life20 = 8806979334756889510L;
    byte[] __sourceSpill1070_21 = new byte[8];
    (__sourceSpill1070_21)[0] = ((byte) ((int) (local4_life20 >>> 56)));
    (__sourceSpill1070_21)[1] = ((byte) ((int) (local4_life20 >>> 48)));
    (__sourceSpill1070_21)[2] = ((byte) ((int) (local4_life20 >>> 40)));
    (__sourceSpill1070_21)[3] = ((byte) ((int) (local4_life20 >>> 32)));
    (__sourceSpill1070_21)[4] = ((byte) ((int) (local4_life20 >>> 24)));
    (__sourceSpill1070_21)[5] = ((byte) ((int) (local4_life20 >>> 16)));
    (__sourceSpill1070_21)[6] = ((byte) ((int) (local4_life20 >>> 8)));
    (__sourceSpill1070_21)[7] = ((byte) ((int) local4_life20));
    javax.crypto.Cipher __sourceSpill1070_22 = local2_life10;
    byte[] local6_life24 = ((javax.crypto.Cipher)(__sourceSpill1070_22)).doFinal(((byte[])(__sourceSpill1070_21)));
    h = ((long)((((((((((((long) (local6_life24)[0]) & 255L) << 56) | ((((long) (local6_life24)[1]) & 255L) << 48)) | ((((long) (local6_life24)[2]) & 255L) << 40)) | ((((long) (local6_life24)[3]) & 255L) << 32)) | ((((long) (local6_life24)[4]) & 255L) << 24)) | ((((long) (local6_life24)[5]) & 255L) << 16)) | ((((long) (local6_life24)[6]) & 255L) << 8)) | (((long) (local6_life24)[7]) & 255L))));
}


public boolean equals(java.lang.Object p0) {
java.lang.Object forwardValue4284_14_0;
    java.lang.Object forwardValue4284_23_0;
    java.util.UUID forwardValue4284_38_0;
    int forwardValue4284_42_0;
    moom.vB spill4284_0;
    java.lang.Class spill4284_1;
    java.util.UUID spill4284_2;
    long life2_3;
    int life4_5;
    moom.vB life5_38;
    forward_join_43: {
    forward_join_42: {
    forward_join_41: {
    forward_join_38: {
    forward_join_36: {
    forward_join_23: {
    forward_join_14: {
    forward_join_13: {
    life2_3 = (moom.vB.g ^ 127774446293477L);
    life4_5 = moom.vB.c();
    spill4284_0 = this;
    if (!((life4_5 == 0))) {
        forwardValue4284_14_0 = spill4284_0;
        break forward_join_14;
    }
    if (!((spill4284_0 == p0))) {
        break forward_join_13;
    }
    return ((1) != 0);
    }
    forwardValue4284_14_0 = p0;
    }
    if (!((forwardValue4284_14_0 != null))) {
        break forward_join_43;
    }
    spill4284_1 = ((java.lang.Object)(this)).getClass();
    if (!((life4_5 == 0))) {
        forwardValue4284_23_0 = spill4284_1;
        break forward_join_23;
    }
    if (!((spill4284_1 == ((java.lang.Object)(p0)).getClass()))) {
        break forward_join_43;
    }
    forwardValue4284_23_0 = p0;
    }
    life5_38 = ((moom.vB)(forwardValue4284_23_0));
    spill4284_2 = this.d;
    if (!((life4_5 == 0))) {
        forwardValue4284_38_0 = spill4284_2;
        break forward_join_38;
    }
    if (!((spill4284_2 != null))) {
        break forward_join_36;
    }
    return ((java.util.UUID)(this.d)).equals(((java.lang.Object)(((moom.vB)(life5_38)).d)));
    }
    forwardValue4284_38_0 = ((moom.vB)(life5_38)).d;
    }
    if (!((forwardValue4284_38_0 == null))) {
        break forward_join_41;
    }
    forwardValue4284_42_0 = 1;
    break forward_join_42;
    }
    forwardValue4284_42_0 = 0;
    }
    return ((forwardValue4284_42_0) != 0);
    }
    return ((0) != 0);
}


public java.lang.String toString() {
return __sourceIntrinsic_a86c261fcdee_originalDynamicSite1686_5(this.a, this.b, this.c, this.d, this.e);
}


public int hashCode() {
java.util.UUID forwardValue4285_13_0;
    int forwardValue4285_16_0;
    java.util.UUID spill4285_0;
    long life1_3;
    int life3_5;
    forward_join_16: {
    forward_join_15: {
    forward_join_13: {
    life1_3 = (moom.vB.g ^ 34491878548981L);
    life3_5 = moom.vB.c();
    spill4285_0 = this.d;
    if (!((life3_5 == 0))) {
        forwardValue4285_13_0 = spill4285_0;
        break forward_join_13;
    }
    if (!((spill4285_0 != null))) {
        break forward_join_15;
    }
    forwardValue4285_13_0 = this.d;
    }
    forwardValue4285_16_0 = ((java.util.UUID)(forwardValue4285_13_0)).hashCode();
    break forward_join_16;
    }
    forwardValue4285_16_0 = 0;
    }
    return forwardValue4285_16_0;
}


public static void b(int p0) {
f = ((int)(p0));
    return;
}


public static int b() {
return moom.vB.f;
}


public static int c() {
int local0 = moom.vB.b();
    if ((local0 == 0)) {
        return 59;
    }
    return 0;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public java.util.UUID a__UUID() {
return this.d;
}


public double a() {
return this.a;
}


public boolean a__Boolean() {
return ((((this.e) ? 1 : 0)) != 0);
}


public moom.vB a(boolean p0) {
this.e = ((boolean)(p0));
    return this;
}


public java.lang.String a__String() {
return this.c;
}


public int a__Int() {
return this.b;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite1686_5(double a0, int a1, java.lang.String a2, java.util.UUID a3, boolean a4) throws E;
}
