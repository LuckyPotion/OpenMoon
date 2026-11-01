package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class gQ extends net.minecraft.client.gui.GuiScreen {

private final java.lang.String w;

private final java.lang.String x;

private static final long y;

private static final long[] z;

private static final java.lang.Integer[] A;

private static final java.util.Map B;

public gQ(java.lang.String p0, java.lang.String p1) {
super();
    this.w = p0;
    this.x = p1;
}


static {
y = ((long)(((moom._a)(moom._c.a(((long)(8410638717118247084L)), ((long)(183217221075700192L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(48539173731791L)))));
    B = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.gQ.y ^ 43533253488483L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1218_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1218_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1218_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1218_14 = new byte[8];
    (__sourceSpill1218_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1218_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1218_16 = __sourceSpill1218_14;
    ((javax.crypto.Cipher)(__sourceSpill1218_11)).init(((int)(__sourceSpill1218_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1218_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1218_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[8];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "ç\nºL©MÁ\027zV¤!]\022}KR¨ÁzLFw¦\024øJü\0338{¹0Ñÿ|²\013%\034"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1218_25 = local6_life21;
        int __sourceSpill1218_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1218_25)).substring(((int)(__sourceSpill1218_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1218_30 = local8_life19;
        int __sourceSpill1218_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1218_33 = new byte[8];
        (__sourceSpill1218_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1218_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1218_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1218_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1218_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1218_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1218_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1218_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1218_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1218_34)).doFinal(((byte[])(__sourceSpill1218_33)));
        (__sourceSpill1218_30)[__sourceSpill1218_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "éöÇ·ø:Ó1ð"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1218_38 = local6_life21;
        int __sourceSpill1218_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1218_38)).substring(((int)(__sourceSpill1218_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1218_43 = local8_life19;
        int __sourceSpill1218_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1218_46 = new byte[8];
        (__sourceSpill1218_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1218_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1218_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1218_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1218_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1218_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1218_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1218_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1218_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1218_47)).doFinal(((byte[])(__sourceSpill1218_46)));
        (__sourceSpill1218_43)[__sourceSpill1218_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    z = ((long[])(local8_life19));
    A = ((java.lang.Integer[])(new java.lang.Integer[8]));
}


public void c__Void() {
long local1 = (moom.gQ.y ^ 29767658826008L);
    super.c__Void();
    ((java.util.List)(((moom.gQ)(this)).m)).add(((java.lang.Object)(new moom.gc(0, ((((moom.gQ)(this)).k / 2) - __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1453_4(13791, (2577476004871166331L ^ local1))), __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1453_5(7487, (6486026598503379358L ^ local1)), moom.oO.a(((java.lang.String)("gui.cancel")), ((java.lang.Object[])(new java.lang.Object[0])))))));
    return;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.gQ.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x3FD1;
        if (A[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = z[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])B.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    B.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/gQ", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            gQ.A[n2] = n4;
        }
        return A[n2];
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral7739_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/gQ"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


protected void a__Void(moom.gc p0) throws java.io.IOException {
((net.minecraft.client.Minecraft)(((moom.gQ)(this)).i)).a(((net.minecraft.client.gui.GuiScreen)(null)));
    return;
}


protected void a(char p0, int p1) throws java.io.IOException {
return;
}


public void a(int p0, int p1, float p2) {
long local4 = (moom.gQ.y ^ 42117833125022L);
    ((moom.gQ)(this)).a(((int)(0)), ((int)(0)), ((int)(((moom.gQ)(this)).k)), ((int)(((moom.gQ)(this)).l)), ((int)(__sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1454_3(30732, (2062642115740832045L ^ local4)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1454_4(13377, (3568498861779901799L ^ local4)))));
    ((moom.gQ)(this)).a(((net.minecraft.client.gui.FontRenderer)(((moom.gQ)(this)).p)), ((java.lang.String)(this.w)), ((int)((((moom.gQ)(this)).k / 2))), ((int)(__sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1454_9(18035, (1446775365705969491L ^ local4)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1454_10(8736, (3761412520576142085L ^ local4)))));
    ((moom.gQ)(this)).a(((net.minecraft.client.gui.FontRenderer)(((moom.gQ)(this)).p)), ((java.lang.String)(this.x)), ((int)((((moom.gQ)(this)).k / 2))), ((int)(__sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1454_15(30125, (8586941265295416457L ^ local4)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1454_16(18916, (2913474916728611015L ^ local4)))));
    super.a(((int)(p0)), ((int)(p1)), ((float)(p2)));
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1453_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1453_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral7739_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1454_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1454_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1454_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1454_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1454_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1454_16(int a0, long a1) throws E;
}
