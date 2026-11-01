package moom;

import io.netty.buffer.ByteBuf;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Ay implements moom.yK<moom.y2> {

private java.lang.String a;

private net.minecraft.network.PacketBuffer b;

private static long c;

private static long[] d;

private static java.lang.Integer[] e;

private static java.util.Map f;

public Ay() {
super();
}

private static native <E extends Throwable> void __sourceConstructorInit_6f5fb066d80ffcf4_0(moom.Ay a0) throws E;

public Ay(java.lang.String p0, net.minecraft.network.PacketBuffer p1) { super(); }


private static void __sourceConstructorBody_6f5fb066d80ffcf4(moom.Ay receiver, java.lang.String p0, net.minecraft.network.PacketBuffer p1) throws Throwable {

long local3 = (moom.Ay.c ^ 103864185574679L);

    moom.Ay.__sourceConstructorInit_6f5fb066d80ffcf4_0(((moom.Ay)(receiver)));

    ((moom.Ay)(receiver)).a = ((java.lang.String)(p0));

    ((moom.Ay)(receiver)).b = ((net.minecraft.network.PacketBuffer)(p1));

    if ((((net.minecraft.network.PacketBuffer)(p1)).writerIndex() > __sourceIntrinsic_6f5fb066d80ffcf4_originalDynamicSite1835_5(28661, (3271700811903594858L ^ local3)))) {

        throw new java.lang.IllegalArgumentException("Payload may not be larger than 1048576 bytes");

    }

    return;

}



static {
c = ((long)(((moom._a)(moom._c.a(((long)(7665069176140852033L)), ((long)(-445589302458417676L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(189799092868252L)))));
    f = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.Ay.c ^ 50921142234853L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill484_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill484_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill484_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill484_14 = new byte[8];
    (__sourceSpill484_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill484_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation484_16 = __sourceSpill484_14;
    ((javax.crypto.Cipher)(__sourceSpill484_11)).init(((int)(__sourceSpill484_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill484_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation484_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[3];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "J9Ò¾ûrÊ\034÷Ð?å\tS\rÂòÒ \\/"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill484_25 = local6_life21;
        int __sourceSpill484_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill484_25)).substring(((int)(__sourceSpill484_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill484_30 = local8_life19;
        int __sourceSpill484_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill484_33 = new byte[8];
        (__sourceSpill484_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill484_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill484_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill484_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill484_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill484_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill484_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill484_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill484_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill484_34)).doFinal(((byte[])(__sourceSpill484_33)));
        (__sourceSpill484_30)[__sourceSpill484_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    d = ((long[])(local8_life19));
    e = ((java.lang.Integer[])(new java.lang.Integer[3]));
}


public void b(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
((net.minecraft.network.PacketBuffer)(p0)).a(((java.lang.String)(this.a)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeBytes(((ByteBuf)(this.b)));
    return;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.Ay.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.io.IOException a(java.io.IOException p0) {
return p0;
}


private static int a(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x6CD8;
        if (e[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = d[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])f.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    f.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/Ay", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Ay.e[n2] = n3;
        }
        return e[n2];
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral3738_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Ay"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
int forwardValue1476_23_0;
    int[] spill1476_0;
    int spill1476_1;
    long life2_3;
    int life5_16;
    int[] life4_17;
    forward_join_44: {
    forward_join_39: {
    forward_join_23: {
    life2_3 = (moom.Ay.c ^ 49592044919099L);
    spill1476_0 = moom.zN.b__ArrayInt();
    this.a = ((java.lang.String)(((net.minecraft.network.PacketBuffer)(p0)).a__String(((int)(__sourceIntrinsic_ba748fb9d83f_invokedynamic1476_2(32637, (4783694653145787852L ^ life2_3)))))));
    life5_16 = ((net.minecraft.network.PacketBuffer)(p0)).readableBytes();
    life4_17 = spill1476_0;
    spill1476_1 = life5_16;
    if (!((life4_17 == null))) {
        forwardValue1476_23_0 = spill1476_1;
        break forward_join_23;
    }
    if (!((spill1476_1 >= 0))) {
        break forward_join_39;
    }
    forwardValue1476_23_0 = life5_16;
    }
    if (!((forwardValue1476_23_0 <= __sourceIntrinsic_ba748fb9d83f_invokedynamic1476_6(9835, (6049824673424700635L ^ life2_3))))) {
        break forward_join_39;
    }
    this.b = ((net.minecraft.network.PacketBuffer)(new net.minecraft.network.PacketBuffer(((net.minecraft.network.PacketBuffer)(p0)).readBytes(((int)(life5_16))))));
    if (!((life4_17 != null))) {
        break forward_join_44;
    }
    }
    throw new java.io.IOException("Payload may not be larger than 1048576 bytes");
    }
    return;
}


public void a(moom.y2 p0) {
((moom.y2)(p0)).a(((moom.Ay)(this)));
    return;
}


public java.lang.String a() {
return this.a;
}


public net.minecraft.network.PacketBuffer a__i() {
return this.b;
}


private static native <E extends Throwable> int __sourceIntrinsic_6f5fb066d80ffcf4_originalDynamicSite1835_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral3738_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ba748fb9d83f_invokedynamic1476_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ba748fb9d83f_invokedynamic1476_6(int a0, long a1) throws E;
}
