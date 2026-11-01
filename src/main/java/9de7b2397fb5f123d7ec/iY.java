package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class iY extends moom.iT {

private static long u;

private static long[] v;

private static java.lang.Integer[] w;

private static java.util.Map x;

public iY(float p0, boolean p1) { super(0.0F, 0.0F, 0, 0); }


private static void __sourceConstructorBody_9918494755a1bc3f(moom.iY receiver, float p0, boolean p1) throws Throwable {

long local3_life2 = (moom.iY.u ^ 137390609952447L);

    moom.iY.__sourceConstructorInit_9918494755a1bc3f_0(((moom.iY)(receiver)), ((float)(p0)), ((float)(0x0.0p0f)), ((int)(__sourceIntrinsic_9918494755a1bc3f_originalDynamicSite426_4(26040, (6900421868846719953L ^ local3_life2)))), ((int)((p1 ? __sourceIntrinsic_9918494755a1bc3f_originalDynamicSite426_6(15614, (1637128220436462230L ^ local3_life2)) : __sourceIntrinsic_9918494755a1bc3f_originalDynamicSite426_8(31443, (3007674992269606073L ^ local3_life2))))));

    return;

}



protected iY(float p0, float p1, int p2, int p3) {
super(p0, p1, p2, p3);
}


public iY() {
this(((float)(0x0.0p0f)), ((boolean)(false)));
    return;
}


static {
u = ((long)(((moom._a)(moom._c.a(((long)(-5781069227652131705L)), ((long)(-8486540178769960347L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(241646119970009L)))));
    x = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.iY.u ^ 45123468710268L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill880_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill880_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill880_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill880_14 = new byte[8];
    (__sourceSpill880_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill880_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation880_16 = __sourceSpill880_14;
    ((javax.crypto.Cipher)(__sourceSpill880_11)).init(((int)(__sourceSpill880_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill880_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation880_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[3];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "\037¬?§ýÏ\\: \026\000ÜIù_8Ð\n\\·>"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill880_25 = local6_life21;
        int __sourceSpill880_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill880_25)).substring(((int)(__sourceSpill880_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill880_30 = local8_life19;
        int __sourceSpill880_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill880_33 = new byte[8];
        (__sourceSpill880_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill880_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill880_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill880_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill880_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill880_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill880_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill880_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill880_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill880_34)).doFinal(((byte[])(__sourceSpill880_33)));
        (__sourceSpill880_30)[__sourceSpill880_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    v = ((long[])(local8_life19));
    w = ((java.lang.Integer[])(new java.lang.Integer[3]));
}

private static native <E extends Throwable> void __sourceConstructorInit_9918494755a1bc3f_0(moom.iY a0, float a1, float a2, int a3, int a4) throws E;

private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral8033_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/iY"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int c(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x40EA;
        if (w[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = v[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])x.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    x.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/iY", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            iY.w[n2] = n4;
        }
        return w[n2];
}


private static int c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.iY.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public void a(float p0, float p1, float p2, float p3, float p4, float p5, net.minecraft.entity.Entity p6) {
super.a(((float)(p0)), ((float)(p1)), ((float)(p2)), ((float)(p3)), ((float)(p4)), ((float)(p5)), ((net.minecraft.entity.Entity)(p6)));
    float local8_life3 = moom.Dr.a(((float)((this.a * 0x1.921fb6p1f))));
    float local9_life7 = moom.Dr.a(((float)(((0x1.0p0f - ((0x1.0p0f - this.a) * (0x1.0p0f - this.a))) * 0x1.921fb6p1f))));
    ((moom.jD)(this.l)).j = ((float)(0x0.0p0f));
    ((moom.jD)(this.m)).j = ((float)(0x0.0p0f));
    ((moom.jD)(this.l)).i = ((float)((-(0x1.99999ap-4f - (local8_life3 * 0x1.333334p-1f)))));
    ((moom.jD)(this.m)).i = ((float)((0x1.99999ap-4f - (local8_life3 * 0x1.333334p-1f))));
    ((moom.jD)(this.l)).h = ((float)(-0x1.921fb6p0f));
    ((moom.jD)(this.m)).h = ((float)(-0x1.921fb6p0f));
    this.l.h -= ((local8_life3 * 0x1.333334p0f) - (local9_life7 * 0x1.99999ap-2f));
    this.m.h -= ((local8_life3 * 0x1.333334p0f) - (local9_life7 * 0x1.99999ap-2f));
    this.l.j += ((moom.Dr.b(((float)((p2 * 0x1.70a3d8p-4f)))) * 0x1.99999ap-5f) + 0x1.99999ap-5f);
    this.m.j -= ((moom.Dr.b(((float)((p2 * 0x1.70a3d8p-4f)))) * 0x1.99999ap-5f) + 0x1.99999ap-5f);
    this.l.h += (moom.Dr.a(((float)((p2 * 0x1.126e98p-4f)))) * 0x1.99999ap-5f);
    this.m.h -= (moom.Dr.a(((float)((p2 * 0x1.126e98p-4f)))) * 0x1.99999ap-5f);
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_9918494755a1bc3f_originalDynamicSite426_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9918494755a1bc3f_originalDynamicSite426_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9918494755a1bc3f_originalDynamicSite426_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral8033_0() throws E;
}
