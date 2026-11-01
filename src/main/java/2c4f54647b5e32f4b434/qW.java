package moom;

import io.netty.buffer.ByteBuf;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
class qW extends moom.qV {

moom.tC i;

private static long k;

private static long[] o;

private static java.lang.Integer[] p;

private static java.util.Map q;

qW(moom.tC p0) { super(); }


private static void __sourceConstructorBody_83ea3095e8470981(moom.qW receiver, moom.tC p0) throws Throwable {

((moom.qW)(receiver)).i = ((moom.tC)(p0));

    moom.qW.__sourceConstructorInit_83ea3095e8470981_0(((moom.qW)(receiver)));

    return;

}



static {
k = ((long)(((moom._a)(moom._c.a(((long)(-1833565306597379491L)), ((long)(-226983768659806335L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(122329497898678L)))));
    q = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.qW.k ^ 57800007286970L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill975_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill975_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill975_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill975_14 = new byte[8];
    (__sourceSpill975_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill975_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation975_16 = __sourceSpill975_14;
    ((javax.crypto.Cipher)(__sourceSpill975_11)).init(((int)(__sourceSpill975_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill975_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation975_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "6Aí\026\nUæÐ\0042õ\\°|\031"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill975_25 = local6_life21;
        int __sourceSpill975_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill975_25)).substring(((int)(__sourceSpill975_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill975_30 = local8_life19;
        int __sourceSpill975_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill975_33 = new byte[8];
        (__sourceSpill975_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill975_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill975_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill975_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill975_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill975_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill975_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill975_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill975_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill975_34)).doFinal(((byte[])(__sourceSpill975_33)));
        (__sourceSpill975_30)[__sourceSpill975_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    o = ((long[])(local8_life19));
    p = ((java.lang.Integer[])(new java.lang.Integer[2]));
}

private static native <E extends Throwable> void __sourceConstructorInit_83ea3095e8470981_0(moom.qW a0) throws E;

private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8800_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/qW"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int n7 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x4974;
        if (p[n7] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l3 = o[n7];
            byte[] byArray3 = new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3};
            Long l4 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])q.get(l4);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    q.put(l4, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/qW", exception);
            }
            int n8 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            qW.p[n7] = n8;
        }
        return p[n7];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.qW.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public int b() {
return 1;
}


public void a(ByteBuf p0) {
((ByteBuf)(p0)).writeInt(((int)(((moom.tC)(this.i)).e__Int())));
    return;
}


public net.minecraft.world.World a__Eu() {
return ((moom.tC)(this.i)).i;
}


public void a__Void() {
long local1 = (moom.qW.k ^ 84821003904208L);
    ((net.minecraft.entity.DataWatcher)(((moom.tC)(this.i)).a__r1())).b(((int)(__sourceIntrinsic_b82a5b29b709_originalDynamicSite1586_3(14942, (5942252884306757146L ^ local1)))), ((java.lang.Object)(((moom.qW)(this)).b__String())));
    ((net.minecraft.entity.DataWatcher)(((moom.tC)(this.i)).a__r1())).b(((int)(__sourceIntrinsic_b82a5b29b709_originalDynamicSite1586_8(28824, (9050858746659228893L ^ local1)))), ((java.lang.Object)(net.minecraft.util.IChatComponent$Serializer.a(((net.minecraft.util.IChatComponent)(((moom.qW)(this)).b__C5()))))));
    return;
}


public net.minecraft.entity.Entity a__r3() {
return this.i;
}


public moom.DT a__DT() {
return new moom.DT(((moom.tC)(this.i)).n, (((moom.tC)(this.i)).o + 0x1.0p-1d), ((moom.tC)(this.i)).p);
}


public moom.DR a__DR() {
return new moom.DR(((moom.tC)(this.i)).n, ((moom.tC)(this.i)).o, ((moom.tC)(this.i)).p);
}


private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_originalDynamicSite1586_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_originalDynamicSite1586_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8800_0() throws E;
}
