package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class BQ implements moom.yS {

private final moom.Bl a;

private final net.minecraft.network.NetworkManager b;

private static final long c;

private static final long[] d;

private static final java.lang.Integer[] e;

private static final java.util.Map f;

public BQ(moom.Bl p0, net.minecraft.network.NetworkManager p1) {
super();
    this.a = p0;
    this.b = p1;
}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(-7056347101579598051L)), ((long)(-4046808342440140051L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(175267857677796L)))));
    f = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.BQ.c ^ 129851197796044L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill487_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill487_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill487_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill487_14 = new byte[8];
    (__sourceSpill487_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill487_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation487_16 = __sourceSpill487_14;
    ((javax.crypto.Cipher)(__sourceSpill487_11)).init(((int)(__sourceSpill487_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill487_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation487_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "÷0pÜI«\017Ï\177æÓ\b$å"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill487_25 = local6_life21;
        int __sourceSpill487_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill487_25)).substring(((int)(__sourceSpill487_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill487_30 = local8_life19;
        int __sourceSpill487_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill487_33 = new byte[8];
        (__sourceSpill487_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill487_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill487_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill487_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill487_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill487_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill487_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill487_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill487_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill487_34)).doFinal(((byte[])(__sourceSpill487_33)));
        (__sourceSpill487_30)[__sourceSpill487_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    d = ((long[])(local8_life19));
    e = ((java.lang.Integer[])(new java.lang.Integer[2]));
}


private static int a(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x1CD1;
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
                throw new RuntimeException("moom/BQ", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            BQ.e[n2] = n3;
        }
        return e[n2];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.BQ.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral3773_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/BQ"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.UnsupportedOperationException a(java.lang.UnsupportedOperationException p0) {
return p0;
}


public void a(net.minecraft.util.IChatComponent p0) {
return;
}


public void a(moom.yT p0) {
int forwardValue159_20_0;
    int forwardValue159_53_0;
    int forwardValue159_53_1;
    int spill159_0;
    int spill159_1;
    long life2_3;
    int[] life4_5;
    moom.CM life5_40;
    moom.CM life5_69;
    forward_join_107: {
    forward_join_100: {
    forward_join_84: {
    forward_join_72: {
    forward_join_53: {
    forward_join_46: {
    forward_join_20: {
    forward_join_14: {
    life2_3 = (moom.BQ.c ^ 22066024750353L);
    life4_5 = net.minecraft.server.network.NetHandlerLoginServer.b();
    spill159_0 = (moom.BR.a)[((net.minecraft.network.EnumConnectionState)(((moom.yT)(p0)).a__a7())).ordinal()];
    if (!((life4_5 != null))) {
        forwardValue159_20_0 = spill159_0;
        break forward_join_20;
    }
    switch (spill159_0) {
case 1:
{
        break forward_join_14;
    }
case 2:
{
        break forward_join_84;
    }
default:
{
        break forward_join_100;
    }
}
    }
    ((net.minecraft.network.NetworkManager)(this.b)).a(((net.minecraft.network.EnumConnectionState)(net.minecraft.network.EnumConnectionState.LOGIN)));
    forwardValue159_20_0 = ((moom.yT)(p0)).a();
    }
    spill159_1 = __sourceIntrinsic_81b90b5739e2_invokedynamic159_9(15531, (2929715613669250849L ^ life2_3));
    if (!((life4_5 != null))) {
        forwardValue159_53_0 = forwardValue159_20_0;
        forwardValue159_53_1 = spill159_1;
        break forward_join_53;
    }
    if (!((forwardValue159_20_0 > spill159_1))) {
        break forward_join_46;
    }
    life5_40 = new moom.CM("Outdated server! I'm still on 1.8.9");
    ((net.minecraft.network.NetworkManager)(this.b)).a(((moom.yK)(new moom.yY(life5_40))));
    ((net.minecraft.network.NetworkManager)(this.b)).a(((net.minecraft.util.IChatComponent)(life5_40)));
    if (!((life4_5 == null))) {
        break forward_join_107;
    }
    }
    forwardValue159_53_0 = ((moom.yT)(p0)).a();
    forwardValue159_53_1 = __sourceIntrinsic_81b90b5739e2_invokedynamic159_15(29502, (3787587315217864885L ^ life2_3));
    }
    if (!((forwardValue159_53_0 < forwardValue159_53_1))) {
        break forward_join_72;
    }
    life5_69 = new moom.CM("Outdated client! Please use 1.8.9");
    ((net.minecraft.network.NetworkManager)(this.b)).a(((moom.yK)(new moom.yY(life5_69))));
    ((net.minecraft.network.NetworkManager)(this.b)).a(((net.minecraft.util.IChatComponent)(life5_69)));
    if (!((life4_5 == null))) {
        break forward_join_107;
    }
    }
    ((net.minecraft.network.NetworkManager)(this.b)).a(((moom.yE)(new net.minecraft.server.network.NetHandlerLoginServer(this.a, this.b))));
    if (!((life4_5 == null))) {
        break forward_join_107;
    }
    }
    ((net.minecraft.network.NetworkManager)(this.b)).a(((net.minecraft.network.EnumConnectionState)(net.minecraft.network.EnumConnectionState.STATUS)));
    ((net.minecraft.network.NetworkManager)(this.b)).a(((moom.yE)(new moom.BT(this.a, this.b))));
    if (!((life4_5 == null))) {
        break forward_join_107;
    }
    }
    throw new java.lang.UnsupportedOperationException(__sourceIntrinsic_81b90b5739e2_invokedynamic159_32(((moom.yT)(p0)).a__a7()));
    }
    return;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral3773_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_81b90b5739e2_invokedynamic159_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_81b90b5739e2_invokedynamic159_15(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_81b90b5739e2_invokedynamic159_32(net.minecraft.network.EnumConnectionState a0) throws E;
}
