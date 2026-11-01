package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class As implements moom.yK<moom.y2> {

private boolean a;

private boolean b;

private boolean c;

private boolean d;

private float e;

private float f;

private static final long g;

private static final long[] h;

private static final java.lang.Integer[] i;

private static final java.util.Map j;

public As() {
super();
}


public As(net.minecraft.entity.player.PlayerCapabilities p0) {
super();
    (this).a(p0.a);
    (this).b(p0.b);
    (this).c(p0.c);
    (this).d(p0.d);
    (this).a((p0).a());
    (this).b((p0).b());
}


static {
g = ((long)(((moom._a)(moom._c.a(((long)(7266071010104746869L)), ((long)(-7995030633386916587L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(73846656374802L)))));
    j = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.As.g ^ 77966031766085L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill479_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill479_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill479_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill479_14 = new byte[8];
    (__sourceSpill479_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill479_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation479_16 = __sourceSpill479_14;
    ((javax.crypto.Cipher)(__sourceSpill479_11)).init(((int)(__sourceSpill479_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill479_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation479_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "NU\022£ÃjZc¶:*:\007Ë¼"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill479_25 = local6_life21;
        int __sourceSpill479_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill479_25)).substring(((int)(__sourceSpill479_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill479_30 = local8_life19;
        int __sourceSpill479_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill479_33 = new byte[8];
        (__sourceSpill479_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill479_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill479_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill479_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill479_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill479_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill479_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill479_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill479_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill479_34)).doFinal(((byte[])(__sourceSpill479_33)));
        (__sourceSpill479_30)[__sourceSpill479_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    h = ((long[])(local8_life19));
    i = ((java.lang.Integer[])(new java.lang.Integer[2]));
}


public float b() {
return this.f;
}


public boolean b__Boolean() {
return ((((this.b) ? 1 : 0)) != 0);
}


public void b(boolean p0) {
this.b = ((boolean)(p0));
    return;
}


public void b(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
int forwardValue1470_20_0;
    int forwardValue1470_30_0;
    int forwardValue1470_40_0;
    int forwardValue1470_51_0;
    int[] spill1470_0;
    boolean spill1470_1;
    long life2_3;
    int life5_6;
    int[] life4_7;
    forward_join_52: {
    forward_join_51: {
    forward_join_40: {
    forward_join_38: {
    forward_join_30: {
    forward_join_28: {
    forward_join_20: {
    forward_join_18: {
    life2_3 = (moom.As.g ^ 32792516217771L);
    spill1470_0 = moom.zN.b__ArrayInt();
    life5_6 = 0;
    life4_7 = spill1470_0;
    spill1470_1 = ((moom.As)(this)).a__Boolean();
    if (!((life4_7 == null))) {
        forwardValue1470_20_0 = ((spill1470_1) ? 1 : 0);
        break forward_join_20;
    }
    if (!(spill1470_1)) {
        break forward_join_18;
    }
    life5_6 = ((byte) (life5_6 | 1));
    }
    forwardValue1470_20_0 = ((((moom.As)(this)).b__Boolean()) ? 1 : 0);
    }
    if (!((life4_7 == null))) {
        forwardValue1470_30_0 = forwardValue1470_20_0;
        break forward_join_30;
    }
    if (!((forwardValue1470_20_0 != 0))) {
        break forward_join_28;
    }
    life5_6 = ((byte) (life5_6 | 2));
    }
    forwardValue1470_30_0 = ((((moom.As)(this)).c()) ? 1 : 0);
    }
    if (!((life4_7 == null))) {
        forwardValue1470_40_0 = forwardValue1470_30_0;
        break forward_join_40;
    }
    if (!((forwardValue1470_30_0 != 0))) {
        break forward_join_38;
    }
    life5_6 = ((byte) (life5_6 | 4));
    }
    forwardValue1470_40_0 = ((((moom.As)(this)).d()) ? 1 : 0);
    }
    if (!((life4_7 == null))) {
        forwardValue1470_51_0 = forwardValue1470_40_0;
        break forward_join_51;
    }
    if (!((forwardValue1470_40_0 != 0))) {
        break forward_join_52;
    }
    forwardValue1470_51_0 = ((int)(((byte) (life5_6 | __sourceIntrinsic_0875c19f50e0_invokedynamic1470_10(6978, (210323646915321641L ^ life2_3))))));
    }
    life5_6 = forwardValue1470_51_0;
    }
    ((net.minecraft.network.PacketBuffer)(p0)).writeByte(((int)(life5_6)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeFloat(((float)(this.e)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeFloat(((float)(this.f)));
    return;
}


public void b(float p0) {
this.f = ((float)(p0));
    return;
}


public boolean c() {
return ((((this.c) ? 1 : 0)) != 0);
}


public void c(boolean p0) {
this.c = ((boolean)(p0));
    return;
}


public boolean d() {
return ((((this.d) ? 1 : 0)) != 0);
}


public void d(boolean p0) {
this.d = ((boolean)(p0));
    return;
}


public void a__sourceBridge_691ab4d076(moom.yE p0) {
((moom.As)(this)).a(((moom.y2)(((moom.y2)(p0)))));
}


public void a(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
moom.As forwardValue1469_17_0;
    int forwardValue1469_17_1;
    moom.As forwardValue1469_18_0;
    moom.As forwardValue1469_19_0;
    int forwardValue1469_19_1;
    moom.As forwardValue1469_28_0;
    int forwardValue1469_28_1;
    moom.As forwardValue1469_29_0;
    moom.As forwardValue1469_30_0;
    int forwardValue1469_30_1;
    moom.As forwardValue1469_39_0;
    int forwardValue1469_39_1;
    moom.As forwardValue1469_40_0;
    moom.As forwardValue1469_41_0;
    int forwardValue1469_41_1;
    moom.As forwardValue1469_54_0;
    int forwardValue1469_54_1;
    moom.As forwardValue1469_55_0;
    moom.As forwardValue1469_56_0;
    int forwardValue1469_56_1;
    int[] spill1469_0;
    moom.As spill1469_1;
    int spill1469_2;
    moom.As spill1469_3;
    int spill1469_4;
    moom.As spill1469_5;
    int spill1469_6;
    moom.As spill1469_7;
    int spill1469_8;
    long life2_3;
    int life5_7;
    int[] life4_8;
    forward_join_56: {
    forward_join_55: {
    forward_join_54: {
    forward_join_41: {
    forward_join_40: {
    forward_join_39: {
    forward_join_30: {
    forward_join_29: {
    forward_join_28: {
    forward_join_19: {
    forward_join_18: {
    forward_join_17: {
    life2_3 = (moom.As.g ^ 117677407770658L);
    spill1469_0 = moom.zN.b__ArrayInt();
    life5_7 = ((net.minecraft.network.PacketBuffer)(p0)).readByte();
    life4_8 = spill1469_0;
    spill1469_1 = this;
    spill1469_2 = (life5_7 & 1);
    if (!((life4_8 == null))) {
        forwardValue1469_17_0 = spill1469_1;
        forwardValue1469_17_1 = spill1469_2;
        break forward_join_17;
    }
    if (!((spill1469_2 > 0))) {
        forwardValue1469_18_0 = spill1469_1;
        break forward_join_18;
    }
    forwardValue1469_17_0 = spill1469_1;
    forwardValue1469_17_1 = 1;
    }
    forwardValue1469_19_0 = forwardValue1469_17_0;
    forwardValue1469_19_1 = forwardValue1469_17_1;
    break forward_join_19;
    }
    forwardValue1469_19_0 = forwardValue1469_18_0;
    forwardValue1469_19_1 = 0;
    }
    ((moom.As)(forwardValue1469_19_0)).a(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue1469_19_1))));
    spill1469_3 = this;
    spill1469_4 = (life5_7 & 2);
    if (!((life4_8 == null))) {
        forwardValue1469_28_0 = spill1469_3;
        forwardValue1469_28_1 = spill1469_4;
        break forward_join_28;
    }
    if (!((spill1469_4 > 0))) {
        forwardValue1469_29_0 = spill1469_3;
        break forward_join_29;
    }
    forwardValue1469_28_0 = spill1469_3;
    forwardValue1469_28_1 = 1;
    }
    forwardValue1469_30_0 = forwardValue1469_28_0;
    forwardValue1469_30_1 = forwardValue1469_28_1;
    break forward_join_30;
    }
    forwardValue1469_30_0 = forwardValue1469_29_0;
    forwardValue1469_30_1 = 0;
    }
    ((moom.As)(forwardValue1469_30_0)).b(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue1469_30_1))));
    spill1469_5 = this;
    spill1469_6 = (life5_7 & 4);
    if (!((life4_8 == null))) {
        forwardValue1469_39_0 = spill1469_5;
        forwardValue1469_39_1 = spill1469_6;
        break forward_join_39;
    }
    if (!((spill1469_6 > 0))) {
        forwardValue1469_40_0 = spill1469_5;
        break forward_join_40;
    }
    forwardValue1469_39_0 = spill1469_5;
    forwardValue1469_39_1 = 1;
    }
    forwardValue1469_41_0 = forwardValue1469_39_0;
    forwardValue1469_41_1 = forwardValue1469_39_1;
    break forward_join_41;
    }
    forwardValue1469_41_0 = forwardValue1469_40_0;
    forwardValue1469_41_1 = 0;
    }
    ((moom.As)(forwardValue1469_41_0)).c(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue1469_41_1))));
    spill1469_7 = this;
    spill1469_8 = (life5_7 & __sourceIntrinsic_ba748fb9d83f_invokedynamic1469_6(2855, (6313390327653817540L ^ life2_3)));
    if (!((life4_8 == null))) {
        forwardValue1469_54_0 = spill1469_7;
        forwardValue1469_54_1 = spill1469_8;
        break forward_join_54;
    }
    if (!((spill1469_8 > 0))) {
        forwardValue1469_55_0 = spill1469_7;
        break forward_join_55;
    }
    forwardValue1469_54_0 = spill1469_7;
    forwardValue1469_54_1 = 1;
    }
    forwardValue1469_56_0 = forwardValue1469_54_0;
    forwardValue1469_56_1 = forwardValue1469_54_1;
    break forward_join_56;
    }
    forwardValue1469_56_0 = forwardValue1469_55_0;
    forwardValue1469_56_1 = 0;
    }
    ((moom.As)(forwardValue1469_56_0)).d(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue1469_56_1))));
    ((moom.As)(this)).a(((float)(((net.minecraft.network.PacketBuffer)(p0)).readFloat())));
    ((moom.As)(this)).b(((float)(((net.minecraft.network.PacketBuffer)(p0)).readFloat())));
    return;
}


private static java.io.IOException a(java.io.IOException p0) {
return p0;
}


private static int a(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x698A;
        if (i[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = h[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])j.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    j.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/As", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            As.i[n2] = n3;
        }
        return i[n2];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.As.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral3726_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/As"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(boolean p0) {
this.a = ((boolean)(p0));
    return;
}


public float a() {
return this.e;
}


public void a(float p0) {
this.e = ((float)(p0));
    return;
}


public boolean a__Boolean() {
return ((((this.a) ? 1 : 0)) != 0);
}


public void a(moom.y2 p0) {
((moom.y2)(p0)).a(((moom.As)(this)));
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_0875c19f50e0_invokedynamic1470_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ba748fb9d83f_invokedynamic1469_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral3726_0() throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);


}
