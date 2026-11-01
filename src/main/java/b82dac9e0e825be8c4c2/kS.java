package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class kS extends moom.kR {

private double h;

private double i;

private double j;

java.nio.IntBuffer k;

private static long m;

private static long[] o;

private static java.lang.Integer[] p;

private static java.util.Map q;

public kS() { super(); }


private static void __sourceConstructorBody_af68f1c901ba7bf4(moom.kS receiver) throws Throwable {

long local1 = (moom.kS.m ^ 22890548259268L);

    moom.kS.__sourceConstructorInit_af68f1c901ba7bf4_0(((moom.kS)(receiver)));

    ((moom.kS)(receiver)).k = ((java.nio.IntBuffer)(net.minecraft.client.renderer.GLAllocation.a__IntBuffer(((int)(__sourceIntrinsic_af68f1c901ba7bf4_originalDynamicSite3041_2(752, (4975426480855487278L ^ local1)))))));

    return;

}



static {
m = ((long)(((moom._a)(moom._c.a(((long)(-5725896184030841001L)), ((long)(-3735564969976844711L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(119289707413675L)))));
    q = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.kS.m ^ 1373522801963L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill908_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill908_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill908_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill908_14 = new byte[8];
    (__sourceSpill908_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill908_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation908_16 = __sourceSpill908_14;
    ((javax.crypto.Cipher)(__sourceSpill908_11)).init(((int)(__sourceSpill908_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill908_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation908_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[3];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "»Lÿ\033F'­Nê=ÉèÔVJ*Ù÷iD "))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill908_25 = local6_life21;
        int __sourceSpill908_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill908_25)).substring(((int)(__sourceSpill908_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill908_30 = local8_life19;
        int __sourceSpill908_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill908_33 = new byte[8];
        (__sourceSpill908_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill908_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill908_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill908_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill908_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill908_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill908_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill908_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill908_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill908_34)).doFinal(((byte[])(__sourceSpill908_33)));
        (__sourceSpill908_30)[__sourceSpill908_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    o = ((long[])(local8_life19));
    p = ((java.lang.Integer[])(new java.lang.Integer[3]));
}

private static native <E extends Throwable> void __sourceConstructorInit_af68f1c901ba7bf4_0(moom.kS a0) throws E;

private static moom.Oo b(moom.Oo p0) {
return p0;
}


public void a(double p0, double p1, double p2) {
this.h = ((double)(p0));
    this.i = ((double)(p1));
    this.j = ((double)(p2));
    super.a(((double)(p0)), ((double)(p1)), ((double)(p2)));
    return;
}


private static int a(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x36C4;
        if (p[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l5 = o[n2];
            byte[] byArray3 = new byte[]{(byte)(l5 >>> 56), (byte)(l5 >>> 48), (byte)(l5 >>> 40), (byte)(l5 >>> 32), (byte)(l5 >>> 24), (byte)(l5 >>> 16), (byte)(l5 >>> 8), (byte)l5};
            Long l6 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])q.get(l6);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    q.put(l6, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/kS", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            kS.p[n2] = n4;
        }
        return p[n2];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.kS.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral8229_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/kS"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(net.minecraft.util.EnumWorldBlockLayer p0) {
long life2_3;
    java.util.Iterator life4_13;
    moom.mp life5_20;
    moom.mq life6_23;
    int life4_42;
    int life5_48;
    java.util.Iterator life6_52;
    moom.mp life7_59;
    moom.mq life8_62;
    java.nio.IntBuffer life9_103;
    forest_join_139: {
    forest_join_135: {
    forest_join_132: {
    forest_join_122: {
    forest_join_36: {
    forest_join_35: {
    life2_3 = (moom.kS.m ^ 125060476944611L);
    if (!(this.e)) {
        break forest_join_139;
    }
    if (!((!moom.BU.aD()))) {
        break forest_join_36;
    }
    life4_13 = ((java.util.List)(this.d)).iterator();
    forest_cycle_13: while (true) {
    if (!(((java.util.Iterator)(life4_13)).hasNext())) {
        break forest_join_35;
    }
    life5_20 = ((moom.mp)(((java.util.Iterator)(life4_13)).next()));
    life6_23 = ((moom.mq)(life5_20));
    moom.kZ.B();
    ((moom.kS)(this)).a(((moom.mp)(life5_20)));
    org.lwjgl.opengl.GL11.glCallList(((int)(((moom.mq)(life6_23)).a(((net.minecraft.util.EnumWorldBlockLayer)(p0)), ((net.minecraft.client.renderer.chunk.CompiledChunk)(((moom.mq)(life6_23)).a__ml()))))));
    moom.kZ.C();
    continue forest_cycle_13;
    }
    }
    break forest_join_132;
    }
    life4_42 = __sourceIntrinsic_9ef2a47e018c_invokedynamic200007_15(1100, (3806526635436063926L ^ life2_3));
    life5_48 = __sourceIntrinsic_9ef2a47e018c_invokedynamic200007_16(15171, (4554868089692029880L ^ life2_3));
    life6_52 = ((java.util.List)(this.d)).iterator();
    forest_cycle_52: while (true) {
    forest_join_112: {
    forest_join_86: {
    forest_join_80: {
    forest_join_70: {
    if (!(((java.util.Iterator)(life6_52)).hasNext())) {
        break forest_join_122;
    }
    life7_59 = ((moom.mp)(((java.util.Iterator)(life6_52)).next()));
    life8_62 = ((moom.mq)(life7_59));
    if (!((life4_42 == ((moom.mp)(life7_59)).v))) {
        break forest_join_70;
    }
    if (!((life5_48 != ((moom.mp)(life7_59)).w))) {
        break forest_join_86;
    }
    }
    if (!((((java.nio.IntBuffer)(this.k)).position() > 0))) {
        break forest_join_80;
    }
    ((moom.kS)(this)).a(((int)(life4_42)), ((int)(life5_48)), ((java.nio.IntBuffer)(this.k)));
    }
    life4_42 = ((moom.mp)(life7_59)).v;
    life5_48 = ((moom.mp)(life7_59)).w;
    }
    if (!((((java.nio.IntBuffer)(this.k)).position() >= ((java.nio.IntBuffer)(this.k)).capacity()))) {
        break forest_join_112;
    }
    life9_103 = net.minecraft.client.renderer.GLAllocation.a__IntBuffer(((int)((((java.nio.IntBuffer)(this.k)).capacity() * 2))));
    ((java.nio.IntBuffer)(this.k)).flip();
    ((java.nio.IntBuffer)(life9_103)).put(((java.nio.IntBuffer)(this.k)));
    this.k = ((java.nio.IntBuffer)(life9_103));
    }
    ((java.nio.IntBuffer)(this.k)).put(((int)(((moom.mq)(life8_62)).a(((net.minecraft.util.EnumWorldBlockLayer)(p0)), ((net.minecraft.client.renderer.chunk.CompiledChunk)(((moom.mq)(life8_62)).a__ml()))))));
    continue forest_cycle_52;
    }
    }
    if (!((((java.nio.IntBuffer)(this.k)).position() > 0))) {
        break forest_join_132;
    }
    ((moom.kS)(this)).a(((int)(life4_42)), ((int)(life5_48)), ((java.nio.IntBuffer)(this.k)));
    }
    if (!(moom.BU.Y())) {
        break forest_join_135;
    }
    moom.kZ.G();
    }
    moom.kZ.D();
    ((java.util.List)(this.d)).clear();
    }
    return;
}


public void a(int p0, int p1, int p2) {
moom.kZ.b(((float)(((float) (((double) p0) - this.h)))), ((float)(((float) (((double) p1) - this.i)))), ((float)(((float) (((double) p2) - this.j)))));
    return;
}


private void a(int p0, int p1, java.nio.IntBuffer p2) {
moom.kZ.B();
    ((moom.kS)(this)).a(((int)(p0)), ((int)(0)), ((int)(p1)));
    ((java.nio.IntBuffer)(p2)).flip();
    moom.kZ.a(((java.nio.IntBuffer)(p2)));
    ((java.nio.IntBuffer)(p2)).clear();
    moom.kZ.C();
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_af68f1c901ba7bf4_originalDynamicSite3041_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral8229_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9ef2a47e018c_invokedynamic200007_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9ef2a47e018c_invokedynamic200007_16(int a0, long a1) throws E;
}
