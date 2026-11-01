package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class iZ extends moom.iY {

private static long t;

private static long[] y;

private static java.lang.Integer[] z;

private static java.util.Map A;

public iZ() {
this(((float)(0x0.0p0f)), ((boolean)(false)));
    return;
}

private static native <E extends Throwable> void __sourceConstructorInit_a1c86b3a8434a318_0(moom.iZ a0, float a1, float a2, int a3, int a4) throws E;

public iZ(float p0, boolean p1) { super(0.0F, 0.0F, 0, 0); }


private static void __sourceConstructorBody_a1c86b3a8434a318(moom.iZ receiver, float p0, boolean p1) throws Throwable {

forward_join_168: {

    forward_join_162: {

    long local3_life2 = (moom.iZ.t ^ 125389902287007L);

    net.minecraft.entity.Entity[] __sourceSpill669_8 = moom.iQ.b();

    moom.iZ.__sourceConstructorInit_a1c86b3a8434a318_0(((moom.iZ)(receiver)), ((float)(p0)), ((float)(0x0.0p0f)), ((int)(__sourceIntrinsic_a1c86b3a8434a318_originalDynamicSite669_5(31159, (4306411752039062625L ^ local3_life2)))), ((int)(__sourceIntrinsic_a1c86b3a8434a318_originalDynamicSite669_7(28816, (5456472657970369860L ^ local3_life2)))));

    net.minecraft.entity.Entity[] local5_life10 = __sourceSpill669_8;

    if (!((local5_life10 != null))) { break forward_join_162; }

    if (!((!p1))) { break forward_join_168; }

    ((moom.iZ)(receiver)).l = ((moom.jD)(new moom.jD(((moom.iQ) receiver), __sourceIntrinsic_a1c86b3a8434a318_originalDynamicSite669_12(17327, (1120467580087608956L ^ local3_life2)), __sourceIntrinsic_a1c86b3a8434a318_originalDynamicSite669_14(12540, (1547756137875068206L ^ local3_life2)))));

    ((moom.jD)(((moom.iZ)(receiver)).l)).a(((float)(-1082130432)), ((float)(-1073741824)), ((float)(-1082130432)), ((int)(2)), ((int)(__sourceIntrinsic_a1c86b3a8434a318_originalDynamicSite669_21(23183, (5821502434993389400L ^ local3_life2)))), ((int)(2)), ((float)(p0)));

    ((moom.jD)(((moom.iZ)(receiver)).l)).a(((float)(-1063256064)), ((float)(0x1.0p1f)), ((float)(0x0.0p0f)));

    ((moom.iZ)(receiver)).m = ((moom.jD)(new moom.jD(((moom.iQ) receiver), __sourceIntrinsic_a1c86b3a8434a318_originalDynamicSite669_27(15883, (7795868559268371422L ^ local3_life2)), __sourceIntrinsic_a1c86b3a8434a318_originalDynamicSite669_29(10941, (8663672559480655725L ^ local3_life2)))));

    ((moom.jD)(((moom.iZ)(receiver)).m)).m = ((boolean)(true));

    ((moom.jD)(((moom.iZ)(receiver)).m)).a(((float)(-1082130432)), ((float)(-1073741824)), ((float)(-1082130432)), ((int)(2)), ((int)(__sourceIntrinsic_a1c86b3a8434a318_originalDynamicSite669_38(6536, (2741552309336505433L ^ local3_life2)))), ((int)(2)), ((float)(p0)));

    ((moom.jD)(((moom.iZ)(receiver)).m)).a(((float)(1084227584)), ((float)(0x1.0p1f)), ((float)(0x0.0p0f)));

    ((moom.iZ)(receiver)).n = ((moom.jD)(new moom.jD(((moom.iQ) receiver), 0, __sourceIntrinsic_a1c86b3a8434a318_originalDynamicSite669_44(10941, (8663672559480655725L ^ local3_life2)))));

    ((moom.jD)(((moom.iZ)(receiver)).n)).a(((float)(-1082130432)), ((float)(0x0.0p0f)), ((float)(-1082130432)), ((int)(2)), ((int)(__sourceIntrinsic_a1c86b3a8434a318_originalDynamicSite669_50(6536, (2741552309336505433L ^ local3_life2)))), ((int)(2)), ((float)(p0)));

    ((moom.jD)(((moom.iZ)(receiver)).n)).a(((float)(-1073741824)), ((float)(1094713344)), ((float)(0x0.0p0f)));

    ((moom.iZ)(receiver)).o = ((moom.jD)(new moom.jD(((moom.iQ) receiver), 0, __sourceIntrinsic_a1c86b3a8434a318_originalDynamicSite669_57(10941, (8663672559480655725L ^ local3_life2)))));

    ((moom.jD)(((moom.iZ)(receiver)).o)).m = ((boolean)(true));

    ((moom.jD)(((moom.iZ)(receiver)).o)).a(((float)(-1082130432)), ((float)(0x0.0p0f)), ((float)(-1082130432)), ((int)(2)), ((int)(__sourceIntrinsic_a1c86b3a8434a318_originalDynamicSite669_65(6536, (2741552309336505433L ^ local3_life2)))), ((int)(2)), ((float)(p0)));

    }

    ((moom.jD)(((moom.iZ)(receiver)).o)).a(((float)(0x1.0p1f)), ((float)(1094713344)), ((float)(0x0.0p0f)));

    }

    return;

}



static {
t = ((long)(((moom._a)(moom._c.a(((long)(-7004889289027139559L)), ((long)(-5838705141947454292L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(143229810042828L)))));
    A = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.iZ.t ^ 115108780609299L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1301_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1301_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1301_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1301_14 = new byte[8];
    (__sourceSpill1301_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1301_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1301_16 = __sourceSpill1301_14;
    ((javax.crypto.Cipher)(__sourceSpill1301_11)).init(((int)(__sourceSpill1301_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1301_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1301_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[8];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "M¸Âý%iãh½yÇÑt\033í}9d!#(Þ/<$ÔÓ¥}ÿé©ó\017\"WÎ³që{\021!ïh"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1301_25 = local6_life21;
        int __sourceSpill1301_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1301_25)).substring(((int)(__sourceSpill1301_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1301_30 = local8_life19;
        int __sourceSpill1301_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1301_33 = new byte[8];
        (__sourceSpill1301_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1301_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1301_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1301_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1301_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1301_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1301_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1301_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1301_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1301_34)).doFinal(((byte[])(__sourceSpill1301_33)));
        (__sourceSpill1301_30)[__sourceSpill1301_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = ",µ×\022¡\024}1×\007\002dI\000­\b"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1301_38 = local6_life21;
        int __sourceSpill1301_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1301_38)).substring(((int)(__sourceSpill1301_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1301_43 = local8_life19;
        int __sourceSpill1301_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1301_46 = new byte[8];
        (__sourceSpill1301_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1301_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1301_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1301_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1301_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1301_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1301_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1301_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1301_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1301_47)).doFinal(((byte[])(__sourceSpill1301_46)));
        (__sourceSpill1301_43)[__sourceSpill1301_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    y = ((long[])(local8_life19));
    z = ((java.lang.Integer[])(new java.lang.Integer[8]));
}


private static int d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.iZ.d(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral8034_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/iZ"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int d(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0xBD2;
        if (z[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = y[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])A.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    A.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/iZ", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            iZ.z[n2] = n4;
        }
        return z[n2];
}


public void a(float p0, float p1, float p2, float p3, float p4, float p5, net.minecraft.entity.Entity p6) {
super.a(((float)(p0)), ((float)(p1)), ((float)(p2)), ((float)(p3)), ((float)(p4)), ((float)(p5)), ((net.minecraft.entity.Entity)(p6)));
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(net.minecraft.entity.EntityLivingBase p0, float p1, float p2, float p3) {
moom.iZ forwardValue3634_15_0;
    int forwardValue3634_15_1;
    moom.iZ forwardValue3634_16_0;
    moom.iZ forwardValue3634_17_0;
    int forwardValue3634_17_1;
    moom.iZ spill3634_0;
    int spill3634_1;
    long life5_3;
    net.minecraft.entity.Entity[] life7_5;
    forward_join_17: {
    forward_join_16: {
    forward_join_15: {
    life5_3 = (moom.iZ.t ^ 28885268470334L);
    life7_5 = moom.iQ.b();
    spill3634_0 = this;
    spill3634_1 = ((net.minecraft.entity.monster.EntitySkeleton)(((net.minecraft.entity.monster.EntitySkeleton)(p0)))).s();
    if (!((life7_5 != null))) {
        forwardValue3634_15_0 = spill3634_0;
        forwardValue3634_15_1 = spill3634_1;
        break forward_join_15;
    }
    if (!((spill3634_1 == 1))) {
        forwardValue3634_16_0 = spill3634_0;
        break forward_join_16;
    }
    forwardValue3634_15_0 = spill3634_0;
    forwardValue3634_15_1 = 1;
    }
    forwardValue3634_17_0 = forwardValue3634_15_0;
    forwardValue3634_17_1 = forwardValue3634_15_1;
    break forward_join_17;
    }
    forwardValue3634_17_0 = forwardValue3634_16_0;
    forwardValue3634_17_1 = 0;
    }
    ((moom.iZ)(forwardValue3634_17_0)).s = ((boolean)__sourceIntrinsic_integerToBoolean((forwardValue3634_17_1)));
    super.a(((net.minecraft.entity.EntityLivingBase)(p0)), ((float)(p1)), ((float)(p2)), ((float)(p3)));
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_a1c86b3a8434a318_originalDynamicSite669_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a1c86b3a8434a318_originalDynamicSite669_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a1c86b3a8434a318_originalDynamicSite669_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a1c86b3a8434a318_originalDynamicSite669_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a1c86b3a8434a318_originalDynamicSite669_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a1c86b3a8434a318_originalDynamicSite669_27(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a1c86b3a8434a318_originalDynamicSite669_29(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a1c86b3a8434a318_originalDynamicSite669_38(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a1c86b3a8434a318_originalDynamicSite669_44(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a1c86b3a8434a318_originalDynamicSite669_50(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a1c86b3a8434a318_originalDynamicSite669_57(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a1c86b3a8434a318_originalDynamicSite669_65(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral8034_0() throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
