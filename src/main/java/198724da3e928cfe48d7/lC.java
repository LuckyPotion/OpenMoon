package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class lC implements moom.I5 {

protected int[] a;

protected final int b;

protected moom.bs c;

protected net.minecraft.client.renderer.texture.TextureAtlasSprite d;

private int[] e;

private moom.L2 f;

private boolean g;

private moom.lC h;

private static java.lang.String[] i;

private static final long k;

private static final long[] l;

private static final java.lang.Integer[] m;

private static final java.util.Map n;

public lC(int[] p0, int p1, moom.bs p2, net.minecraft.client.renderer.texture.TextureAtlasSprite p3) {
super();
    this.e = null;
    this.a = p0;
    this.b = p1;
    this.c = p2;
    this.d = p3;
    (this).a__Void();
}


public lC(int[] p0, int p1, moom.bs p2) {
super();
    this.e = null;
    this.a = p0;
    this.b = p1;
    this.c = p2;
    (this).a__Void();
}


static {
k = ((long)(((moom._a)(moom._c.a(((long)(7938228833531518485L)), ((long)(1330882677684093536L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(155848289130348L)))));
    n = ((java.util.Map)(new java.util.HashMap(13)));
    java.lang.String[] __sourceSpill916_7 = new java.lang.String[4];
    long local0_life8 = (moom.lC.k ^ 68401031162940L);
    moom.lC.b(((java.lang.String[])(__sourceSpill916_7)));
    javax.crypto.Cipher local2_life11;
    javax.crypto.Cipher __sourceSpill916_13 = (local2_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill916_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill916_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill916_16 = new byte[8];
    (__sourceSpill916_16)[0] = ((byte) ((int) (local0_life8 >>> 56)));
    int local3_life17 = 1;
    while ((local3_life17 < 8)) {
        (__sourceSpill916_16)[local3_life17] = ((byte) ((int) ((local0_life8 << (local3_life17 * 8)) >>> 56)));
        local3_life17 += 1;
    }
    byte[] __sourcePreallocation916_18 = __sourceSpill916_16;
    ((javax.crypto.Cipher)(__sourceSpill916_13)).init(((int)(__sourceSpill916_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill916_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation916_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life21 = new long[3];
    int local5_life22 = 0;
    java.lang.String local6_life23;
    int local7_life25 = ((java.lang.String)((local6_life23 = "´ù.4DÐñ?B\0221¹C\t\023&Ye?ôöí"))).length();
    int local4_life26 = 0;
    do {
        java.lang.String __sourceSpill916_27 = local6_life23;
        int __sourceSpill916_28 = local4_life26;
        local4_life26 += 8;
        byte[] local9_life31 = ((java.lang.String)(((java.lang.String)(__sourceSpill916_27)).substring(((int)(__sourceSpill916_28)), ((int)(local4_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill916_32 = local8_life21;
        int __sourceSpill916_33 = local5_life22;
        local5_life22 += 1;
        long local10_life34 = (((((((((((long) (local9_life31)[0]) & 255L) << 56) | ((((long) (local9_life31)[1]) & 255L) << 48)) | ((((long) (local9_life31)[2]) & 255L) << 40)) | ((((long) (local9_life31)[3]) & 255L) << 32)) | ((((long) (local9_life31)[4]) & 255L) << 24)) | ((((long) (local9_life31)[5]) & 255L) << 16)) | ((((long) (local9_life31)[6]) & 255L) << 8)) | (((long) (local9_life31)[7]) & 255L));
        byte[] __sourceSpill916_35 = new byte[8];
        (__sourceSpill916_35)[0] = ((byte) ((int) (local10_life34 >>> 56)));
        (__sourceSpill916_35)[1] = ((byte) ((int) (local10_life34 >>> 48)));
        (__sourceSpill916_35)[2] = ((byte) ((int) (local10_life34 >>> 40)));
        (__sourceSpill916_35)[3] = ((byte) ((int) (local10_life34 >>> 32)));
        (__sourceSpill916_35)[4] = ((byte) ((int) (local10_life34 >>> 24)));
        (__sourceSpill916_35)[5] = ((byte) ((int) (local10_life34 >>> 16)));
        (__sourceSpill916_35)[6] = ((byte) ((int) (local10_life34 >>> 8)));
        (__sourceSpill916_35)[7] = ((byte) ((int) local10_life34));
        javax.crypto.Cipher __sourceSpill916_36 = local2_life11;
        byte[] local12_life38 = ((javax.crypto.Cipher)(__sourceSpill916_36)).doFinal(((byte[])(__sourceSpill916_35)));
        (__sourceSpill916_32)[__sourceSpill916_33] = (((((((((((long) (local12_life38)[0]) & 255L) << 56) | ((((long) (local12_life38)[1]) & 255L) << 48)) | ((((long) (local12_life38)[2]) & 255L) << 40)) | ((((long) (local12_life38)[3]) & 255L) << 32)) | ((((long) (local12_life38)[4]) & 255L) << 24)) | ((((long) (local12_life38)[5]) & 255L) << 16)) | ((((long) (local12_life38)[6]) & 255L) << 8)) | (((long) (local12_life38)[7]) & 255L));
    } while ((!(local4_life26 >= local7_life25)));
    l = ((long[])(local8_life21));
    m = ((java.lang.Integer[])(new java.lang.Integer[3]));
}


public java.lang.String toString() {
long local1 = (moom.lC.k ^ 66410075428291L);
    return __sourceIntrinsic_a86c261fcdee_originalDynamicSite1539_6(((this.a).length / __sourceIntrinsic_a86c261fcdee_originalDynamicSite1539_2(28233, (4450080549858845723L ^ local1))), this.b, this.c, this.d);
}


public static java.lang.String[] b__ArrayString() {
return moom.lC.i;
}


public static void b(java.lang.String[] p0) {
i = ((java.lang.String[])(p0));
    return;
}


private static int[] b(int[] p0) {
int local1 = ((p0).length / 4);
    int local2 = (local1 / 2);
    int[] local3 = new int[(local2 * 4)];
    int local4 = 0;
    while ((local4 < 4)) {
        java.lang.System.arraycopy(((java.lang.Object)(p0)), ((int)((local4 * local1))), ((java.lang.Object)(local3)), ((int)((local4 * local2))), ((int)(local2)));
        local4 += 1;
    }
    return local3;
}


public double b() {
java.lang.Object local1 = ((moom.lC)(this)).a__L2();
    return ((double) ((((moom.L2)(local1)).f() + ((moom.L2)(local1)).c()) / 0x1.0p1f));
}


public boolean b__Boolean() {
java.lang.Object local1 = ((moom.lC)(this)).a__L2();
    return (__sourceIntrinsic_booleanComparison((((moom.L2)(local1)).a(((moom.bs)(this.c))))) != 0);
}


public int[] b__ArrayInt() {
if ((this.e == null)) {
        this.e = ((int[])(moom.lC.a(((int[])(((moom.lC)(this)).a__ArrayInt())), ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(((moom.lC)(this)).a__oh())))));
    }
    return this.e;
}


public boolean c() {
java.lang.Object local1 = ((moom.lC)(this)).a__L2();
    return (__sourceIntrinsic_booleanComparison((((moom.L2)(local1)).b(((moom.bs)(this.c))))) != 0);
}


public boolean d() {
int forwardValue3740_9_0;
    forward_join_9: {
    forward_join_8: {
    if (!(((moom.lC)(this)).c())) {
        break forward_join_8;
    }
    if (!(((moom.lC)(this)).b__Boolean())) {
        break forward_join_8;
    }
    forwardValue3740_9_0 = 1;
    break forward_join_9;
    }
    forwardValue3740_9_0 = 0;
    }
    return ((forwardValue3740_9_0) != 0);
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral8278_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/lC"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.lC.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public void a(moom.I4 p0) {
return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static int a(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x7B8B;
        if (m[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l5 = l[n2];
            byte[] byArray3 = new byte[]{(byte)(l5 >>> 56), (byte)(l5 >>> 48), (byte)(l5 >>> 40), (byte)(l5 >>> 32), (byte)(l5 >>> 24), (byte)(l5 >>> 16), (byte)(l5 >>> 8), (byte)l5};
            Long l6 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])lC.n.get(l6);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    lC.n.put(l6, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/lC", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            lC.m[n2] = n4;
        }
        return m[n2];
}


public moom.lC a__lC() {
if ((!this.g)) {
        if ((this.h == null)) {
        if ((this.d != null)) {
        if ((((net.minecraft.client.renderer.texture.TextureAtlasSprite)(this.d)).E != null)) {
        this.h = ((moom.lC)(new moom.lD(this, ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(this.d)).E)));
    }
    }
    }
        this.g = ((boolean)(true));
    }
    return this.h;
}


private static int[] a(int[] p0, net.minecraft.client.renderer.texture.TextureAtlasSprite p1) {
int[] life2_3;
    int life3_8;
    int life4_10;
    int life5_17;
    float life6_24;
    float life7_33;
    float life8_37;
    float life9_41;
    life2_3 = ((int[])(((int[])(p0)).clone()));
    life3_8 = ((life2_3).length / 4);
    life4_10 = 0;
    while ((life4_10 < 4)) {
        life5_17 = (life4_10 * life3_8);
        life6_24 = java.lang.Float.intBitsToFloat(((int)((life2_3)[(life5_17 + 4)])));
        life7_33 = java.lang.Float.intBitsToFloat(((int)((life2_3)[((life5_17 + 4) + 1)])));
        life8_37 = ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(p1)).a__Float(((float)(life6_24)));
        life9_41 = ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(p1)).b__Float(((float)(life7_33)));
        (life2_3)[(life5_17 + 4)] = java.lang.Float.floatToRawIntBits(((float)(life8_37)));
        (life2_3)[((life5_17 + 4) + 1)] = java.lang.Float.floatToRawIntBits(((float)(life9_41)));
        life4_10 += 1;
    }
    return life2_3;
}


public moom.bs a__bs() {
if ((this.c == null)) {
        this.c = ((moom.bs)(moom.lN.a(((int[])(((moom.lC)(this)).a__ArrayInt())))));
    }
    return this.c;
}


public int a__Int() {
return this.b;
}


public boolean a__Boolean() {
return ((((this.b != -1) ? 1 : 0)) != 0);
}


public int[] a__ArrayInt() {
((moom.lC)(this)).a__Void();
    return this.a;
}


public net.minecraft.client.renderer.texture.TextureAtlasSprite a__oh() {
if ((this.d == null)) {
        this.d = ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(__sourceExactCall_4493aac7bf26de(((int[])(((moom.lC)(this)).a__ArrayInt())))));
    }
    return this.d;
}


public double a() {
java.lang.Object local1 = ((moom.lC)(this)).a__L2();
    return ((double) ((((moom.L2)(local1)).e() + ((moom.L2)(local1)).b()) / 0x1.0p1f));
}


public float a__Float() {
java.lang.Object local1 = ((moom.lC)(this)).a__L2();
    return ((((moom.L2)(local1)).d() + ((moom.L2)(local1)).a()) / 0x1.0p1f);
}


public moom.L2 a__L2() {
if ((this.f == null)) {
        this.f = ((moom.L2)(new moom.L2(((moom.lC)(this)).a__ArrayInt())));
    }
    return this.f;
}


private static int[] a__ArrayInt(int[] p0) {
int local1 = ((p0).length / 4);
    int local2 = (local1 * 2);
    int[] local3 = new int[(local2 * 4)];
    int local4 = 0;
    while ((local4 < 4)) {
        java.lang.System.arraycopy(((java.lang.Object)(p0)), ((int)((local4 * local1))), ((java.lang.Object)(local3)), ((int)((local4 * local2))), ((int)(local1)));
        local4 += 1;
    }
    return local3;
}


protected void a__Void() {
long life1_3;
    forward_join_35: {
    forward_join_21: {
    life1_3 = (moom.lC.k ^ 16504281162388L);
    if (!(moom.BU.ap())) { break forward_join_21; }
    if (!(((this.a).length == __sourceIntrinsic_b82a5b29b709_invokedynamic4328_3(11805, (6833305871334380315L ^ life1_3))))) { break forward_join_35; }
    this.a = ((int[])(moom.lC.a__ArrayInt(((int[])(this.a)))));
    break forward_join_35;
    }
    if (!(((this.a).length == __sourceIntrinsic_b82a5b29b709_invokedynamic4328_8(18419, (8604251723229526772L ^ life1_3))))) { break forward_join_35; }
    this.a = ((int[])(moom.lC.b(((int[])(this.a)))));
    }
    return;
}


private static net.minecraft.client.renderer.texture.TextureAtlasSprite a(int[] p0) {
float life1_1;
    float life2_3;
    float life3_5;
    float life4_7;
    int life5_12;
    int life6_14;
    int life7_21;
    float life8_28;
    float life9_37;
    float life6_61;
    float life7_67;
    life1_1 = 0x1.0p0f;
    life2_3 = 0x1.0p0f;
    life3_5 = 0x0.0p0f;
    life4_7 = 0x0.0p0f;
    life5_12 = ((p0).length / 4);
    life6_14 = 0;
    while ((life6_14 < 4)) {
        life7_21 = (life6_14 * life5_12);
        life8_28 = java.lang.Float.intBitsToFloat(((int)((p0)[(life7_21 + 4)])));
        life9_37 = java.lang.Float.intBitsToFloat(((int)((p0)[((life7_21 + 4) + 1)])));
        life1_1 = java.lang.Math.min(((float)(life1_1)), ((float)(life8_28)));
        life2_3 = java.lang.Math.min(((float)(life2_3)), ((float)(life9_37)));
        life3_5 = java.lang.Math.max(((float)(life3_5)), ((float)(life8_28)));
        life4_7 = java.lang.Math.max(((float)(life4_7)), ((float)(life9_37)));
        life6_14 += 1;
    }
    life6_61 = ((life1_1 + life3_5) / 0x1.0p1f);
    life7_67 = ((life2_3 + life4_7) / 0x1.0p1f);
    return ((net.minecraft.client.renderer.texture.TextureMap)(((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).a__n8())).a(((double)(((double) life6_61))), ((double)(((double) life7_67))));
}


private static native <E extends Throwable> int __sourceIntrinsic_a86c261fcdee_originalDynamicSite1539_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite1539_6(int a0, int a1, moom.bs a2, net.minecraft.client.renderer.texture.TextureAtlasSprite a3) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral8278_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic4328_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic4328_8(int a0, long a1) throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);

private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __sourceExactCall_4493aac7bf26de(int[] p0);
}
