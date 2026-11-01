package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Nx extends moom.Nq {

private int[][] e;

private static final long f;

private static final long[] h;

private static final java.lang.Integer[] l;

private static final java.util.Map m;

public Nx(java.lang.String p0) {
super(p0);
    (this).d();
}


static {
f = ((long)(((moom._a)(moom._c.a(((long)(6974879455967549791L)), ((long)(-6233381137092460752L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(176649732142913L)))));
    m = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.Nx.f ^ 103645103772383L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill741_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill741_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill741_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill741_14 = new byte[8];
    (__sourceSpill741_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill741_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation741_16 = __sourceSpill741_14;
    ((javax.crypto.Cipher)(__sourceSpill741_11)).init(((int)(__sourceSpill741_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill741_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation741_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[3];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "SÇc\023Õù++\005(Ã\026o÷Ãµò\023D|`HAb"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill741_25 = local6_life21;
        int __sourceSpill741_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill741_25)).substring(((int)(__sourceSpill741_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill741_30 = local8_life19;
        int __sourceSpill741_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill741_33 = new byte[8];
        (__sourceSpill741_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill741_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill741_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill741_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill741_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill741_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill741_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill741_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill741_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill741_34)).doFinal(((byte[])(__sourceSpill741_33)));
        (__sourceSpill741_30)[__sourceSpill741_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    h = ((long[])(local8_life19));
    l = ((java.lang.Integer[])(new java.lang.Integer[3]));
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.Nx.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x791A;
        if (Nx.l[n2] == null) {
            
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
                throw new RuntimeException("moom/Nx", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Nx.l[n2] = n4;
        }
        return Nx.l[n2];
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral6757_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Nx"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


protected void b(int p0) {
int[][] forwardValue2883_43_0;
    int forwardValue2883_43_1;
    int[][] spill2883_0;
    int spill2883_1;
    long life2_3;
    java.lang.String life4_5;
    int[][] life5_13;
    int[][] life6_22;
    forward_join_78: {
    forward_join_43: {
    forward_join_33: {
    life2_3 = (moom.Nx.f ^ 84512542756530L);
    life4_5 = moom.Nq.b__String();
    if (!((p0 >= (this.e).length))) {
        break forward_join_33;
    }
    life5_13 = this.e;
    life6_22 = new int[(p0 + __sourceIntrinsic_8dbec06774c4_invokedynamic2883_4(6459, (2303877350672205891L ^ life2_3)))][];
    java.lang.System.arraycopy(((java.lang.Object)(life5_13)), ((int)(0)), ((java.lang.Object)(life6_22)), ((int)(0)), ((int)((life5_13).length)));
    this.e = ((int[][])(life6_22));
    }
    spill2883_0 = this.e;
    spill2883_1 = p0;
    if (!((life4_5 != null))) {
        forwardValue2883_43_0 = spill2883_0;
        forwardValue2883_43_1 = spill2883_1;
        break forward_join_43;
    }
    if (!(((spill2883_0)[spill2883_1] == null))) {
        break forward_join_78;
    }
    forwardValue2883_43_0 = this.e;
    forwardValue2883_43_1 = p0;
    }
    (forwardValue2883_43_0)[forwardValue2883_43_1] = new int[] {__sourceIntrinsic_8dbec06774c4_invokedynamic2883_9(13040, (3541226036376052619L ^ life2_3)), __sourceIntrinsic_8dbec06774c4_invokedynamic2883_10(13040, (3541226036376052619L ^ life2_3)), __sourceIntrinsic_8dbec06774c4_invokedynamic2883_11(13040, (3541226036376052619L ^ life2_3)), __sourceIntrinsic_8dbec06774c4_invokedynamic2883_12(13040, (3541226036376052619L ^ life2_3))};
    }
    return;
}


protected void d() {
long local1 = (moom.Nx.f ^ 58103530134065L);
    this.e = ((int[][])(new int[][] {new int[] {__sourceIntrinsic_6cce62949456_originalDynamicSite1358_1(13147, (8386045558493787810L ^ local1)), __sourceIntrinsic_6cce62949456_originalDynamicSite1358_2(13040, (3541111698647561992L ^ local1)), __sourceIntrinsic_6cce62949456_originalDynamicSite1358_3(13040, (3541111698647561992L ^ local1)), __sourceIntrinsic_6cce62949456_originalDynamicSite1358_4(13040, (3541111698647561992L ^ local1))}}));
    return;
}


public int[] a__sourceReturn_d4d28024c9() {
int local1 = ((moom.Nx)(this)).a();
    return (this.e)[local1];
}


public void a(int p0, int p1, int p2, int p3) {
int forwardValue2882_60_0;
    int forwardValue2882_66_0;
    java.lang.String spill2882_0;
    int spill2882_1;
    int spill2882_2;
    int spill2882_3;
    int spill2882_4;
    int spill2882_5;
    long life5_3;
    int life8_7;
    java.lang.String life7_8;
    int[] life9_13;
    int life10_84;
    forward_join_77: {
    forward_join_73: {
    forward_join_66: {
    forward_join_60: {
    forward_join_42: {
    life5_3 = (moom.Nx.f ^ 49446156284365L);
    spill2882_0 = moom.Nq.b__String();
    life8_7 = ((moom.Nx)(this)).a();
    life7_8 = spill2882_0;
    life9_13 = (this.e)[life8_7];
    spill2882_1 = (life9_13)[0];
    if (!((life7_8 != null))) {
        forwardValue2882_60_0 = spill2882_1;
        break forward_join_60;
    }
    if (!((spill2882_1 == p0))) {
        break forward_join_42;
    }
    spill2882_2 = (life9_13)[1];
    if (!((life7_8 != null))) {
        forwardValue2882_60_0 = spill2882_2;
        break forward_join_60;
    }
    if (!((spill2882_2 == p1))) {
        break forward_join_42;
    }
    spill2882_3 = (life9_13)[2];
    if (!((life7_8 != null))) {
        forwardValue2882_60_0 = spill2882_3;
        break forward_join_60;
    }
    if (!((spill2882_3 == p2))) {
        break forward_join_42;
    }
    spill2882_4 = (life9_13)[3];
    if (!((life7_8 != null))) {
        forwardValue2882_60_0 = spill2882_4;
        break forward_join_60;
    }
    if (!((spill2882_4 != p3))) {
        break forward_join_73;
    }
    }
    (life9_13)[0] = p0;
    (life9_13)[1] = p1;
    (life9_13)[2] = p2;
    (life9_13)[3] = p3;
    forwardValue2882_60_0 = ((moom.Nx)(this)).b();
    }
    life10_84 = forwardValue2882_60_0;
    spill2882_5 = life10_84;
    if (!((life7_8 != null))) {
        forwardValue2882_66_0 = spill2882_5;
        break forward_join_66;
    }
    if (!((spill2882_5 >= 0))) {
        break forward_join_73;
    }
    forwardValue2882_66_0 = life10_84;
    }
    org.lwjgl.opengl.ARBShaderObjects.glUniform4iARB(((int)(forwardValue2882_66_0)), ((int)(p0)), ((int)(p1)), ((int)(p2)), ((int)(p3)));
    this.e();
    }
    if (!((net.minecraft.entity.Entity.b__ArrayString() != null))) {
        break forward_join_77;
    }
    __sourceExactCall_45694347059c97(((java.lang.String)("jcyXpc")));
    }
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_8dbec06774c4_invokedynamic2883_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8dbec06774c4_invokedynamic2883_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8dbec06774c4_invokedynamic2883_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8dbec06774c4_invokedynamic2883_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8dbec06774c4_invokedynamic2883_12(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral6757_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6cce62949456_originalDynamicSite1358_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6cce62949456_originalDynamicSite1358_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6cce62949456_originalDynamicSite1358_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6cce62949456_originalDynamicSite1358_4(int a0, long a1) throws E;

private static native void __sourceExactCall_45694347059c97(java.lang.String p0);
}
