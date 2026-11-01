package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Ns extends moom.Nq {

private int[] e;

private static final long f;

private static final long[] h;

private static final java.lang.Integer[] l;

private static final java.util.Map m;

public Ns(java.lang.String p0) {
super(p0);
    (this).d();
}


static {
f = ((long)(((moom._a)(moom._c.a(((long)(2945073427959209128L)), ((long)(8700571295156654996L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(153604624202992L)))));
    m = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.Ns.f ^ 74578876790040L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill736_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill736_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill736_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill736_14 = new byte[8];
    (__sourceSpill736_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill736_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation736_16 = __sourceSpill736_14;
    ((javax.crypto.Cipher)(__sourceSpill736_11)).init(((int)(__sourceSpill736_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill736_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation736_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[3];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "(¡t½ÄdáJ4evèª\005&²?kÏ\032"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill736_25 = local6_life21;
        int __sourceSpill736_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill736_25)).substring(((int)(__sourceSpill736_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill736_30 = local8_life19;
        int __sourceSpill736_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill736_33 = new byte[8];
        (__sourceSpill736_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill736_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill736_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill736_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill736_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill736_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill736_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill736_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill736_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill736_34)).doFinal(((byte[])(__sourceSpill736_33)));
        (__sourceSpill736_30)[__sourceSpill736_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    h = ((long[])(local8_life19));
    l = ((java.lang.Integer[])(new java.lang.Integer[3]));
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.Ns.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x564;
        if (Ns.l[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = h[n2];
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
                throw new RuntimeException("moom/Ns", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Ns.l[n2] = n4;
        }
        return Ns.l[n2];
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral6745_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Ns"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


protected void b(int p0) {
long life2_3;
    java.lang.String life4_5;
    int[] life5_13;
    int[] life6_22;
    int life7_32;
    lexical_join_53: {
    lexical_join_50: {
    life2_3 = (moom.Ns.f ^ 39822411867122L);
    life4_5 = moom.Nq.b__String();
    if (!((p0 >= (this.e).length))) {
        break lexical_join_53;
    }
    life5_13 = this.e;
    life6_22 = new int[(p0 + __sourceIntrinsic_8dbec06774c4_invokedynamic1016_4(22527, (1329163627037211386L ^ life2_3)))];
    java.lang.System.arraycopy(((java.lang.Object)(life5_13)), ((int)(0)), ((java.lang.Object)(life6_22)), ((int)(0)), ((int)((life5_13).length)));
    life7_32 = (life5_13).length;
    lexical_cycle_33: while (true) {
    if (!((life7_32 < (life6_22).length))) {
        break lexical_join_50;
    }
    (life6_22)[life7_32] = __sourceIntrinsic_8dbec06774c4_invokedynamic1016_6(13444, (7744785487585696130L ^ life2_3));
    life7_32 += 1;
    if (!((life4_5 != null))) {
        break lexical_join_53;
    }
    if (!((life4_5 == null))) { continue lexical_cycle_33; }
    break lexical_cycle_33;
    }
    }
    this.e = ((int[])(life6_22));
    }
    return;
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public int c__sourceReturn_8abf5c6871() {
int local1 = ((moom.Ns)(this)).a();
    return (this.e)[local1];
}


public void c(int p0) {
int forwardValue2873_26_0;
    int forwardValue2873_32_0;
    java.lang.String spill2873_0;
    int spill2873_1;
    int spill2873_2;
    long life2_3;
    int life5_6;
    int life6_12;
    java.lang.String life4_13;
    int life7_32;
    forward_join_36: {
    forward_join_32: {
    forward_join_26: {
    life2_3 = (moom.Ns.f ^ 83188994885238L);
    life5_6 = ((moom.Ns)(this)).a();
    spill2873_0 = moom.Nq.b__String();
    life6_12 = (this.e)[life5_6];
    life4_13 = spill2873_0;
    spill2873_1 = p0;
    if (!((life4_13 != null))) {
        forwardValue2873_26_0 = spill2873_1;
        break forward_join_26;
    }
    if (!((spill2873_1 != life6_12))) {
        break forward_join_36;
    }
    (this.e)[life5_6] = p0;
    forwardValue2873_26_0 = ((moom.Ns)(this)).b();
    }
    life7_32 = forwardValue2873_26_0;
    spill2873_2 = life7_32;
    if (!((life4_13 != null))) {
        forwardValue2873_32_0 = spill2873_2;
        break forward_join_32;
    }
    if (!((spill2873_2 >= 0))) {
        break forward_join_36;
    }
    forwardValue2873_32_0 = life7_32;
    }
    org.lwjgl.opengl.ARBShaderObjects.glUniform1iARB(((int)(forwardValue2873_32_0)), ((int)(p0)));
    this.e();
    }
    return;
}


protected void d() {
long local1 = (moom.Ns.f ^ 101372853204849L);
    this.e = ((int[])(new int[] {__sourceIntrinsic_6cce62949456_originalDynamicSite1356_1(3904, (798343488166426311L ^ local1))}));
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_8dbec06774c4_invokedynamic1016_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8dbec06774c4_invokedynamic1016_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral6745_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6cce62949456_originalDynamicSite1356_1(int a0, long a1) throws E;
}
