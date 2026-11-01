package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class J_ {

private int a;

private int[] b;

private static int c;

private static long d;

private static long[] e;

private static java.lang.Integer[] f;

private static java.util.Map g;

public J_(int p0, int[] p1) {
super();
    this.a = -1;
    this.b = null;
    this.a = p0;
    this.b = p1;
}


public J_(int p0, int p1) { super(); }


private static void __sourceConstructorBody_ed205f5fce2c051d(moom.J_ receiver, int p0, int p1) throws Throwable {

int forwardValue403_22_0;

    int spill403_0;

    int spill403_1;

    moom.J_ spill403_2;

    int[] spill403_3;

    long life3_3;

    int life5_16;

    forward_join_36: {

    forward_join_22: {

    life3_3 = (moom.J_.d ^ 111043904921355L);

    moom.J_.__sourceConstructorInit_ed205f5fce2c051d_0(((moom.J_)(receiver)));

    ((moom.J_)(receiver)).a = ((int)(-1));

    spill403_0 = moom.J_.c();

    ((moom.J_)(receiver)).b = ((int[])(null));

    ((moom.J_)(receiver)).a = ((int)(p0));

    life5_16 = spill403_0;

    spill403_1 = p1;

    if (!((life5_16 != 0))) {

        forwardValue403_22_0 = spill403_1;

        break forward_join_22;

    }

    if (!((spill403_1 >= 0))) {

        break forward_join_36;

    }

    forwardValue403_22_0 = p1;

    }

    if (!((forwardValue403_22_0 <= __sourceIntrinsic_ed205f5fce2c051d_invokedynamic403_6(1213, (5823523787112240775L ^ life3_3))))) {

        break forward_join_36;

    }

    spill403_2 = receiver;

    int[] __stackOp403_7_0 = new int[1];

    spill403_3 = __stackOp403_7_0;

    (__stackOp403_7_0)[0] = p1;

    ((moom.J_)(spill403_2)).b = ((int[])(spill403_3));

    }

    return;

}



public J_(int p0) {
super();
    this.a = -1;
    this.b = null;
    this.a = p0;
}


static {
d = ((long)(((moom._a)(moom._c.a(((long)(4032412382176895272L)), ((long)(1391094623895184860L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(206793279175431L)))));
    int __sourceSpill606_6 = 0;
    g = ((java.util.Map)(new java.util.HashMap(13)));
    moom.J_.b(((int)(__sourceSpill606_6)));
    long local0_life9 = (moom.J_.d ^ 23684496096350L);
    javax.crypto.Cipher local2_life11;
    javax.crypto.Cipher __sourceSpill606_13 = (local2_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill606_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill606_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill606_16 = new byte[8];
    (__sourceSpill606_16)[0] = ((byte) ((int) (local0_life9 >>> 56)));
    int local3_life17 = 1;
    while ((local3_life17 < 8)) {
        (__sourceSpill606_16)[local3_life17] = ((byte) ((int) ((local0_life9 << (local3_life17 * 8)) >>> 56)));
        local3_life17 += 1;
    }
    byte[] __sourcePreallocation606_18 = __sourceSpill606_16;
    ((javax.crypto.Cipher)(__sourceSpill606_13)).init(((int)(__sourceSpill606_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill606_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation606_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life21 = new long[2];
    int local5_life22 = 0;
    java.lang.String local6_life23;
    int local7_life25 = ((java.lang.String)((local6_life23 = "AÜLO\030æ\025\003y1C"))).length();
    int local4_life26 = 0;
    do {
        java.lang.String __sourceSpill606_27 = local6_life23;
        int __sourceSpill606_28 = local4_life26;
        local4_life26 += 8;
        byte[] local9_life31 = ((java.lang.String)(((java.lang.String)(__sourceSpill606_27)).substring(((int)(__sourceSpill606_28)), ((int)(local4_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill606_32 = local8_life21;
        int __sourceSpill606_33 = local5_life22;
        local5_life22 += 1;
        long local10_life34 = (((((((((((long) (local9_life31)[0]) & 255L) << 56) | ((((long) (local9_life31)[1]) & 255L) << 48)) | ((((long) (local9_life31)[2]) & 255L) << 40)) | ((((long) (local9_life31)[3]) & 255L) << 32)) | ((((long) (local9_life31)[4]) & 255L) << 24)) | ((((long) (local9_life31)[5]) & 255L) << 16)) | ((((long) (local9_life31)[6]) & 255L) << 8)) | (((long) (local9_life31)[7]) & 255L));
        byte[] __sourceSpill606_35 = new byte[8];
        (__sourceSpill606_35)[0] = ((byte) ((int) (local10_life34 >>> 56)));
        (__sourceSpill606_35)[1] = ((byte) ((int) (local10_life34 >>> 48)));
        (__sourceSpill606_35)[2] = ((byte) ((int) (local10_life34 >>> 40)));
        (__sourceSpill606_35)[3] = ((byte) ((int) (local10_life34 >>> 32)));
        (__sourceSpill606_35)[4] = ((byte) ((int) (local10_life34 >>> 24)));
        (__sourceSpill606_35)[5] = ((byte) ((int) (local10_life34 >>> 16)));
        (__sourceSpill606_35)[6] = ((byte) ((int) (local10_life34 >>> 8)));
        (__sourceSpill606_35)[7] = ((byte) ((int) local10_life34));
        javax.crypto.Cipher __sourceSpill606_36 = local2_life11;
        byte[] local12_life38 = ((javax.crypto.Cipher)(__sourceSpill606_36)).doFinal(((byte[])(__sourceSpill606_35)));
        (__sourceSpill606_32)[__sourceSpill606_33] = (((((((((((long) (local12_life38)[0]) & 255L) << 56) | ((((long) (local12_life38)[1]) & 255L) << 48)) | ((((long) (local12_life38)[2]) & 255L) << 40)) | ((((long) (local12_life38)[3]) & 255L) << 32)) | ((((long) (local12_life38)[4]) & 255L) << 24)) | ((((long) (local12_life38)[5]) & 255L) << 16)) | ((((long) (local12_life38)[6]) & 255L) << 8)) | (((long) (local12_life38)[7]) & 255L));
    } while ((!(local4_life26 >= local7_life25)));
    e = ((long[])(local8_life21));
    f = ((java.lang.Integer[])(new java.lang.Integer[2]));
}

private static native <E extends Throwable> void __sourceConstructorInit_ed205f5fce2c051d_0(moom.J_ a0) throws E;

public java.lang.String toString() {
return __sourceIntrinsic_a86c261fcdee_originalDynamicSite1197_3(this.a, moom.BU.a(((int[])(this.b))));
}


public static void b(int p0) {
c = ((int)(p0));
    return;
}


public static int b() {
return moom.J_.c;
}


public static int c() {
int local0 = moom.J_.b();
    if ((local0 == 0)) {
        return 46;
    }
    return 0;
}


public int a() {
return this.a;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral5230_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/J_"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.J_.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int n4 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0xA13;
        if (f[n4] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = e[n4];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])g.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    g.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/J_", exception);
            }
            int n7 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            J_.f[n4] = n7;
        }
        return f[n4];
}


public boolean a(int p0, int p1) {
int forwardValue2336_14_0;
    moom.J_ forwardValue2336_14_1;
    int forwardValue2336_20_0;
    int forwardValue2336_22_0;
    int spill2336_0;
    moom.J_ spill2336_1;
    boolean spill2336_2;
    long life3_3;
    int life5_5;
    forward_join_22: {
    forward_join_21: {
    forward_join_20: {
    forward_join_14: {
    life3_3 = (moom.J_.d ^ 71434414730870L);
    life5_5 = moom.J_.b();
    spill2336_0 = p0;
    spill2336_1 = this;
    if (!((life5_5 == 0))) {
        forwardValue2336_14_0 = spill2336_0;
        forwardValue2336_14_1 = spill2336_1;
        break forward_join_14;
    }
    if (!((spill2336_0 == ((moom.J_)(spill2336_1)).a))) {
        break forward_join_21;
    }
    forwardValue2336_14_0 = p1;
    forwardValue2336_14_1 = this;
    }
    spill2336_2 = moom.Ka.a(((int)(forwardValue2336_14_0)), ((int[])(((moom.J_)(forwardValue2336_14_1)).b)));
    if (!((life5_5 == 0))) {
        forwardValue2336_20_0 = ((spill2336_2) ? 1 : 0);
        break forward_join_20;
    }
    if (!(spill2336_2)) {
        break forward_join_21;
    }
    forwardValue2336_20_0 = 1;
    }
    forwardValue2336_22_0 = forwardValue2336_20_0;
    break forward_join_22;
    }
    forwardValue2336_22_0 = 0;
    }
    return ((forwardValue2336_22_0) != 0);
}


public void a(int p0) {
int lexicalValue848_14_0;
    int spill848_0;
    long life2_3;
    int life4_5;
    int[] life5_28;
    int life6_31;
    int life7_33;
    int life8_40;
    lexical_join_52: {
    lexical_join_46: {
    lexical_join_14: {
    life2_3 = (moom.J_.d ^ 6230025978222L);
    life4_5 = moom.J_.c();
    if (!((this.b != null))) {
        break lexical_join_52;
    }
    spill848_0 = p0;
    if (!((life4_5 != 0))) {
        lexicalValue848_14_0 = spill848_0;
        break lexical_join_14;
    }
    if (!((spill848_0 >= 0))) {
        break lexical_join_52;
    }
    lexicalValue848_14_0 = p0;
    }
    if (!((lexicalValue848_14_0 <= __sourceIntrinsic_b4a3d886a4d9_invokedynamic848_3(27987, (2642911707195351309L ^ life2_3))))) {
        break lexical_join_52;
    }
    life5_28 = this.b;
    life6_31 = (life5_28).length;
    life7_33 = 0;
    lexical_cycle_28: while (true) {
    lexical_join_44: {
    lexical_join_43: {
    if (!((life7_33 < life6_31))) {
        break lexical_join_46;
    }
    life8_40 = (life5_28)[life7_33];
    if (!((life4_5 != 0))) {
        break lexical_join_52;
    }
    if (!((life4_5 != 0))) {
        break lexical_join_44;
    }
    if (!((life8_40 == p0))) {
        break lexical_join_43;
    }
    return;
    }
    life7_33 += 1;
    }
    if (!((life4_5 == 0))) { continue lexical_cycle_28; }
    break lexical_cycle_28;
    }
    }
    this.b = ((int[])(moom.BU.a(((int[])(this.b)), ((int)(p0)))));
    }
    return;
}


public int[] a__ArrayInt() {
return this.b;
}


public boolean a(moom.fB p0) {
int forwardValue2337_16_0;
    moom.J_ forwardValue2337_16_1;
    int forwardValue2337_22_0;
    int forwardValue2337_24_0;
    int spill2337_0;
    moom.J_ spill2337_1;
    boolean spill2337_2;
    long life2_3;
    int life4_5;
    forward_join_24: {
    forward_join_23: {
    forward_join_22: {
    forward_join_16: {
    life2_3 = (moom.J_.d ^ 123905158390871L);
    life4_5 = moom.J_.c();
    spill2337_0 = ((moom.fB)(p0)).a__sourceReturn_8abf5c6871();
    spill2337_1 = this;
    if (!((life4_5 != 0))) {
        forwardValue2337_16_0 = spill2337_0;
        forwardValue2337_16_1 = spill2337_1;
        break forward_join_16;
    }
    if (!((spill2337_0 == ((moom.J_)(spill2337_1)).a))) {
        break forward_join_23;
    }
    forwardValue2337_16_0 = ((moom.fB)(p0)).c();
    forwardValue2337_16_1 = this;
    }
    spill2337_2 = moom.Ka.a(((int)(forwardValue2337_16_0)), ((int[])(((moom.J_)(forwardValue2337_16_1)).b)));
    if (!((life4_5 != 0))) {
        forwardValue2337_22_0 = ((spill2337_2) ? 1 : 0);
        break forward_join_22;
    }
    if (!(spill2337_2)) {
        break forward_join_23;
    }
    forwardValue2337_22_0 = 1;
    }
    forwardValue2337_24_0 = forwardValue2337_22_0;
    break forward_join_24;
    }
    forwardValue2337_24_0 = 0;
    }
    return ((forwardValue2337_24_0) != 0);
}


private static native <E extends Throwable> int __sourceIntrinsic_ed205f5fce2c051d_invokedynamic403_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b4a3d886a4d9_invokedynamic848_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral5230_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite1197_3(int a0, java.lang.String a1) throws E;
}
