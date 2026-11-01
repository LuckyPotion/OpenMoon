package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Au implements moom.yK<moom.y2> {

private java.lang.String a;

private java.lang.String b;

private moom.bn c;

private int d;

private static final long e;

private static final long[] f;

private static final java.lang.Integer[] g;

private static final java.util.Map h;

public Au() {
super();
}


public Au(net.minecraft.scoreboard.ScoreObjective p0, int p1) {
super();
    this.a = (p0).a();
    this.b = (p0).b();
    this.c = ((p0).a__Bb()).a__bn();
    this.d = p1;
}


static {
e = ((long)(((moom._a)(moom._c.a(((long)(-4245037755045541996L)), ((long)(-3437597357010845499L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(115170609076505L)))));
    h = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.Au.e ^ 101919408383764L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill481_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill481_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill481_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill481_14 = new byte[8];
    (__sourceSpill481_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill481_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation481_16 = __sourceSpill481_14;
    ((javax.crypto.Cipher)(__sourceSpill481_11)).init(((int)(__sourceSpill481_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill481_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation481_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[3];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "Þ°÷ü?Éã+·!RõE'\032\022¬~­£"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill481_25 = local6_life21;
        int __sourceSpill481_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill481_25)).substring(((int)(__sourceSpill481_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill481_30 = local8_life19;
        int __sourceSpill481_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill481_33 = new byte[8];
        (__sourceSpill481_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill481_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill481_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill481_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill481_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill481_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill481_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill481_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill481_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill481_34)).doFinal(((byte[])(__sourceSpill481_33)));
        (__sourceSpill481_30)[__sourceSpill481_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    f = ((long[])(local8_life19));
    g = ((java.lang.Integer[])(new java.lang.Integer[3]));
}


public java.lang.String b() {
return this.b;
}


public void b(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
long life2_3;
    int[] life4_10;
    forward_join_36: {
    forward_join_30: {
    forward_join_25: {
    life2_3 = (moom.Au.e ^ 21319390825637L);
    int[] spill1820_0 = moom.zN.b__ArrayInt();
    ((net.minecraft.network.PacketBuffer)(p0)).a(((java.lang.String)(this.a)));
    life4_10 = spill1820_0;
    ((net.minecraft.network.PacketBuffer)(p0)).writeByte(((int)(this.d)));
    if (!((life4_10 == null))) { break forward_join_30; }
    if (!((this.d != 0))) { break forward_join_25; }
    if (!((this.d == 2))) { break forward_join_36; }
    }
    ((net.minecraft.network.PacketBuffer)(p0)).a(((java.lang.String)(this.b)));
    }
    ((net.minecraft.network.PacketBuffer)(p0)).a(((java.lang.String)(((moom.bn)(this.c)).a())));
    }
    return;
}


private static java.io.IOException a(java.io.IOException p0) {
return p0;
}


public void a__sourceBridge_691ab4d076(moom.yE p0) {
((moom.Au)(this)).a(((moom.y2)(((moom.y2)(p0)))));
}


private static int a(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x530C;
        if (g[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = f[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])h.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    h.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/Au", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Au.g[n2] = n3;
        }
        return g[n2];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.Au.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral3730_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Au"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
moom.Au forwardValue1473_40_0;
    int[] spill1473_0;
    moom.Au spill1473_1;
    moom.Au spill1473_2;
    long life2_3;
    int[] life4_14;
    forward_join_49: {
    forward_join_40: {
    forward_join_30: {
    life2_3 = (moom.Au.e ^ 111833380216620L);
    spill1473_0 = moom.zN.b__ArrayInt();
    this.a = ((java.lang.String)(((net.minecraft.network.PacketBuffer)(p0)).a__String(((int)(__sourceIntrinsic_ba748fb9d83f_invokedynamic1473_2(28600, (6187834990859059933L ^ life2_3)))))));
    life4_14 = spill1473_0;
    this.d = ((int)(((net.minecraft.network.PacketBuffer)(p0)).readByte()));
    spill1473_1 = this;
    if (!((life4_14 == null))) {
        forwardValue1473_40_0 = spill1473_1;
        break forward_join_40;
    }
    if (!((((moom.Au)(spill1473_1)).d != 0))) {
        break forward_join_30;
    }
    spill1473_2 = this;
    if (!((life4_14 == null))) {
        forwardValue1473_40_0 = spill1473_2;
        break forward_join_40;
    }
    if (!((((moom.Au)(spill1473_2)).d == 2))) {
        break forward_join_49;
    }
    }
    this.b = ((java.lang.String)(((net.minecraft.network.PacketBuffer)(p0)).a__String(((int)(__sourceIntrinsic_ba748fb9d83f_invokedynamic1473_9(27982, (321267803319566377L ^ life2_3)))))));
    forwardValue1473_40_0 = this;
    }
    ((moom.Au)(forwardValue1473_40_0)).c = ((moom.bn)(moom.bn.a(((java.lang.String)(((net.minecraft.network.PacketBuffer)(p0)).a__String(((int)(__sourceIntrinsic_ba748fb9d83f_invokedynamic1473_12(21053, (3482733389937393497L ^ life2_3))))))))));
    }
    return;
}


public void a(moom.y2 p0) {
((moom.y2)(p0)).a(((moom.Au)(this)));
    return;
}


public java.lang.String a__String() {
return this.a;
}


public int a() {
return this.d;
}


public moom.bn a__bn() {
return this.c;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral3730_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ba748fb9d83f_invokedynamic1473_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ba748fb9d83f_invokedynamic1473_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ba748fb9d83f_invokedynamic1473_12(int a0, long a1) throws E;


}
