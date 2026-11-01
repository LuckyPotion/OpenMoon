package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class iW extends moom.iT {

public boolean t;

public boolean u;

private static long v;

private static long[] w;

private static java.lang.Integer[] x;

private static java.util.Map y;

public iW(float p0) { super(0.0F, 0.0F, 0, 0); }


private static void __sourceConstructorBody_bdcd40e2d3521aef(moom.iW receiver, float p0) throws Throwable {

long local2 = (moom.iW.v ^ 37736907931088L);

    moom.iW.__sourceConstructorInit_bdcd40e2d3521aef_0(((moom.iW)(receiver)), ((float)(0x0.0p0f)), ((float)(-0x1.cp3f)), ((int)(__sourceIntrinsic_bdcd40e2d3521aef_originalDynamicSite2903_1(32743, (7939245863177416716L ^ local2)))), ((int)(__sourceIntrinsic_bdcd40e2d3521aef_originalDynamicSite2903_2(20500, (5968306646457311219L ^ local2)))));

    float local4 = -0x1.cp3f;

    ((moom.iW)(receiver)).j = ((moom.jD)(new moom.jD(receiver, 0, __sourceIntrinsic_bdcd40e2d3521aef_originalDynamicSite2903_4(7921, (654351371530899731L ^ local2)))));

    ((moom.jD)(((moom.iW)(receiver)).j)).a(((float)(-0x1.0p2f)), ((float)(-0x1.0p3f)), ((float)(-0x1.0p2f)), ((int)(__sourceIntrinsic_bdcd40e2d3521aef_originalDynamicSite2903_7(24689, (7078488998219804564L ^ local2)))), ((int)(__sourceIntrinsic_bdcd40e2d3521aef_originalDynamicSite2903_8(4563, (2713293471211691570L ^ local2)))), ((int)(__sourceIntrinsic_bdcd40e2d3521aef_originalDynamicSite2903_9(4563, (2713293471211691570L ^ local2)))), ((float)((p0 - 0x1.0p-1f))));

    ((moom.jD)(((moom.iW)(receiver)).j)).a(((float)(0x0.0p0f)), ((float)((0x0.0p0f + local4))), ((float)(0x0.0p0f)));

    ((moom.iW)(receiver)).k = ((moom.jD)(new moom.jD(receiver, __sourceIntrinsic_bdcd40e2d3521aef_originalDynamicSite2903_13(27118, (7583562352094242312L ^ local2)), __sourceIntrinsic_bdcd40e2d3521aef_originalDynamicSite2903_14(11888, (6264948406589170073L ^ local2)))));

    ((moom.jD)(((moom.iW)(receiver)).k)).a(((float)(-0x1.0p2f)), ((float)(0x0.0p0f)), ((float)(-0x1.0p1f)), ((int)(__sourceIntrinsic_bdcd40e2d3521aef_originalDynamicSite2903_17(4563, (2713293471211691570L ^ local2)))), ((int)(__sourceIntrinsic_bdcd40e2d3521aef_originalDynamicSite2903_18(26466, (2607731988482058369L ^ local2)))), ((int)(4)), ((float)(p0)));

    ((moom.jD)(((moom.iW)(receiver)).k)).a(((float)(0x0.0p0f)), ((float)((0x0.0p0f + local4))), ((float)(0x0.0p0f)));

    ((moom.iW)(receiver)).l = ((moom.jD)(new moom.jD(receiver, __sourceIntrinsic_bdcd40e2d3521aef_originalDynamicSite2903_22(5971, (8928295391630104763L ^ local2)), 0)));

    ((moom.jD)(((moom.iW)(receiver)).l)).a(((float)(-0x1.0p0f)), ((float)(-0x1.0p1f)), ((float)(-0x1.0p0f)), ((int)(2)), ((int)(__sourceIntrinsic_bdcd40e2d3521aef_originalDynamicSite2903_25(12501, (1510341432127471413L ^ local2)))), ((int)(2)), ((float)(p0)));

    ((moom.jD)(((moom.iW)(receiver)).l)).a(((float)(-0x1.8p1f)), ((float)((0x1.0p1f + local4))), ((float)(0x0.0p0f)));

    ((moom.iW)(receiver)).m = ((moom.jD)(new moom.jD(receiver, __sourceIntrinsic_bdcd40e2d3521aef_originalDynamicSite2903_29(30260, (3882780876946143710L ^ local2)), 0)));

    ((moom.jD)(((moom.iW)(receiver)).m)).m = ((boolean)(true));

    ((moom.jD)(((moom.iW)(receiver)).m)).a(((float)(-0x1.0p0f)), ((float)(-0x1.0p1f)), ((float)(-0x1.0p0f)), ((int)(2)), ((int)(__sourceIntrinsic_bdcd40e2d3521aef_originalDynamicSite2903_34(28925, (8810976783343812377L ^ local2)))), ((int)(2)), ((float)(p0)));

    ((moom.jD)(((moom.iW)(receiver)).m)).a(((float)(0x1.4p2f)), ((float)((0x1.0p1f + local4))), ((float)(0x0.0p0f)));

    ((moom.iW)(receiver)).n = ((moom.jD)(new moom.jD(receiver, __sourceIntrinsic_bdcd40e2d3521aef_originalDynamicSite2903_38(30260, (3882780876946143710L ^ local2)), 0)));

    ((moom.jD)(((moom.iW)(receiver)).n)).a(((float)(-0x1.0p0f)), ((float)(0x0.0p0f)), ((float)(-0x1.0p0f)), ((int)(2)), ((int)(__sourceIntrinsic_bdcd40e2d3521aef_originalDynamicSite2903_41(28925, (8810976783343812377L ^ local2)))), ((int)(2)), ((float)(p0)));

    ((moom.jD)(((moom.iW)(receiver)).n)).a(((float)(-0x1.0p1f)), ((float)((0x1.8p3f + local4))), ((float)(0x0.0p0f)));

    ((moom.iW)(receiver)).o = ((moom.jD)(new moom.jD(receiver, __sourceIntrinsic_bdcd40e2d3521aef_originalDynamicSite2903_45(30260, (3882780876946143710L ^ local2)), 0)));

    ((moom.jD)(((moom.iW)(receiver)).o)).m = ((boolean)(true));

    ((moom.jD)(((moom.iW)(receiver)).o)).a(((float)(-0x1.0p0f)), ((float)(0x0.0p0f)), ((float)(-0x1.0p0f)), ((int)(2)), ((int)(__sourceIntrinsic_bdcd40e2d3521aef_originalDynamicSite2903_50(28925, (8810976783343812377L ^ local2)))), ((int)(2)), ((float)(p0)));

    ((moom.jD)(((moom.iW)(receiver)).o)).a(((float)(0x1.0p1f)), ((float)((0x1.8p3f + local4))), ((float)(0x0.0p0f)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_bdcd40e2d3521aef_0(moom.iW a0, float a1, float a2, int a3, int a4) throws E;

static {
v = ((long)(((moom._a)(moom._c.a(((long)(7185876276767536338L)), ((long)(4973342671852898921L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(151331071376996L)))));
    y = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.iW.v ^ 122175878854933L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1298_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1298_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1298_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1298_14 = new byte[8];
    (__sourceSpill1298_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1298_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1298_16 = __sourceSpill1298_14;
    ((javax.crypto.Cipher)(__sourceSpill1298_11)).init(((int)(__sourceSpill1298_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1298_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1298_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[12];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "õ\bÁ]/%¨YÖ\005J©¨ç^nj7°ÜD6\007~¶PòPu²CÀQ7I×øSÕwr/\001\037ë§ë\026\022uÀ÷\\?ê-Å[£¬gº_ªk\bù"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1298_25 = local6_life21;
        int __sourceSpill1298_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1298_25)).substring(((int)(__sourceSpill1298_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1298_30 = local8_life19;
        int __sourceSpill1298_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1298_33 = new byte[8];
        (__sourceSpill1298_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1298_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1298_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1298_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1298_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1298_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1298_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1298_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1298_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1298_34)).doFinal(((byte[])(__sourceSpill1298_33)));
        (__sourceSpill1298_30)[__sourceSpill1298_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "BFaâ\\«\"ÿ6Æê·ß"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1298_38 = local6_life21;
        int __sourceSpill1298_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1298_38)).substring(((int)(__sourceSpill1298_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1298_43 = local8_life19;
        int __sourceSpill1298_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1298_46 = new byte[8];
        (__sourceSpill1298_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1298_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1298_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1298_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1298_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1298_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1298_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1298_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1298_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1298_47)).doFinal(((byte[])(__sourceSpill1298_46)));
        (__sourceSpill1298_43)[__sourceSpill1298_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    w = ((long[])(local8_life19));
    x = ((java.lang.Integer[])(new java.lang.Integer[12]));
}


private static int c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.iW.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int c(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x4722;
        if (x[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = w[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])y.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    y.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/iW", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            iW.x[n2] = n4;
        }
        return x[n2];
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral8028_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/iW"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(float p0, float p1, float p2, float p3, float p4, float p5, net.minecraft.entity.Entity p6) {
int forwardValue3631_106_0;
    int forwardValue3631_119_0;
    int forwardValue3631_133_0;
    int forwardValue3631_146_0;
    int forwardValue3631_158_0;
    int forwardValue3631_171_0;
    int forwardValue3631_185_0;
    int forwardValue3631_195_0;
    int forwardValue3631_290_0;
    net.minecraft.entity.Entity[] spill3631_0;
    int spill3631_1;
    long life8_3;
    float life11_18;
    net.minecraft.entity.Entity[] life10_32;
    float life12_88;
    float life13_346;
    forward_join_302: {
    forward_join_290: {
    forward_join_214: {
    forward_join_195: {
    forward_join_193: {
    forward_join_185: {
    forward_join_179: {
    forward_join_171: {
    forward_join_165: {
    forward_join_158: {
    forward_join_153: {
    forward_join_146: {
    forward_join_141: {
    forward_join_133: {
    forward_join_127: {
    forward_join_119: {
    forward_join_113: {
    forward_join_106: {
    forward_join_101: {
    life8_3 = (moom.iW.v ^ 75847332626560L);
    super.a(((float)(p0)), ((float)(p1)), ((float)(p2)), ((float)(p3)), ((float)(p4)), ((float)(p5)), ((net.minecraft.entity.Entity)(p6)));
    ((moom.jD)(this.i)).n = ((boolean)(true));
    life11_18 = -0x1.cp3f;
    spill3631_0 = moom.iQ.b();
    ((moom.jD)(this.k)).h = ((float)(0x0.0p0f));
    ((moom.jD)(this.k)).f = ((float)(life11_18));
    ((moom.jD)(this.k)).g = ((float)(-0x0.0p0f));
    life10_32 = spill3631_0;
    moom.jD __stackOp3631_12_0 = this.n;
    ((moom.jD)(__stackOp3631_12_0)).h = ((float)((((moom.jD)(__stackOp3631_12_0)).h - 0x0.0p0f)));
    moom.jD __stackOp3631_16_0 = this.o;
    ((moom.jD)(__stackOp3631_16_0)).h = ((float)((((moom.jD)(__stackOp3631_16_0)).h - 0x0.0p0f)));
    ((moom.jD)(this.l)).h = ((float)(((float) (((double) ((moom.jD)(this.l)).h) * 0x1.0p-1d))));
    ((moom.jD)(this.m)).h = ((float)(((float) (((double) ((moom.jD)(this.m)).h) * 0x1.0p-1d))));
    ((moom.jD)(this.n)).h = ((float)(((float) (((double) ((moom.jD)(this.n)).h) * 0x1.0p-1d))));
    ((moom.jD)(this.o)).h = ((float)(((float) (((double) ((moom.jD)(this.o)).h) * 0x1.0p-1d))));
    life12_88 = 0x1.99999ap-2f;
    spill3631_1 = recovery.source.CarrierOps.fcmpl(((float)(((moom.jD)(this.l)).h)), ((float)(life12_88)));
    if (!((life10_32 != null))) {
        forwardValue3631_106_0 = spill3631_1;
        break forward_join_106;
    }
    if (!((spill3631_1 > 0))) {
        break forward_join_101;
    }
    ((moom.jD)(this.l)).h = ((float)(life12_88));
    }
    forwardValue3631_106_0 = recovery.source.CarrierOps.fcmpl(((float)(((moom.jD)(this.m)).h)), ((float)(life12_88)));
    }
    if (!((life10_32 != null))) {
        forwardValue3631_119_0 = forwardValue3631_106_0;
        break forward_join_119;
    }
    if (!((forwardValue3631_106_0 > 0))) {
        break forward_join_113;
    }
    ((moom.jD)(this.m)).h = ((float)(life12_88));
    }
    forwardValue3631_119_0 = recovery.source.CarrierOps.fcmpg(((float)(((moom.jD)(this.l)).h)), ((float)((-life12_88))));
    }
    if (!((life10_32 != null))) {
        forwardValue3631_133_0 = forwardValue3631_119_0;
        break forward_join_133;
    }
    if (!((forwardValue3631_119_0 < 0))) {
        break forward_join_127;
    }
    ((moom.jD)(this.l)).h = ((float)((-life12_88)));
    }
    forwardValue3631_133_0 = recovery.source.CarrierOps.fcmpg(((float)(((moom.jD)(this.m)).h)), ((float)((-life12_88))));
    }
    if (!((life10_32 != null))) {
        forwardValue3631_146_0 = forwardValue3631_133_0;
        break forward_join_146;
    }
    if (!((forwardValue3631_133_0 < 0))) {
        break forward_join_141;
    }
    ((moom.jD)(this.m)).h = ((float)((-life12_88)));
    }
    forwardValue3631_146_0 = recovery.source.CarrierOps.fcmpl(((float)(((moom.jD)(this.n)).h)), ((float)(life12_88)));
    }
    if (!((life10_32 != null))) {
        forwardValue3631_158_0 = forwardValue3631_146_0;
        break forward_join_158;
    }
    if (!((forwardValue3631_146_0 > 0))) {
        break forward_join_153;
    }
    ((moom.jD)(this.n)).h = ((float)(life12_88));
    }
    forwardValue3631_158_0 = recovery.source.CarrierOps.fcmpl(((float)(((moom.jD)(this.o)).h)), ((float)(life12_88)));
    }
    if (!((life10_32 != null))) {
        forwardValue3631_171_0 = forwardValue3631_158_0;
        break forward_join_171;
    }
    if (!((forwardValue3631_158_0 > 0))) {
        break forward_join_165;
    }
    ((moom.jD)(this.o)).h = ((float)(life12_88));
    }
    forwardValue3631_171_0 = recovery.source.CarrierOps.fcmpg(((float)(((moom.jD)(this.n)).h)), ((float)((-life12_88))));
    }
    if (!((life10_32 != null))) {
        forwardValue3631_185_0 = forwardValue3631_171_0;
        break forward_join_185;
    }
    if (!((forwardValue3631_171_0 < 0))) {
        break forward_join_179;
    }
    ((moom.jD)(this.n)).h = ((float)((-life12_88)));
    }
    forwardValue3631_185_0 = recovery.source.CarrierOps.fcmpg(((float)(((moom.jD)(this.o)).h)), ((float)((-life12_88))));
    }
    if (!((life10_32 != null))) {
        forwardValue3631_195_0 = forwardValue3631_185_0;
        break forward_join_195;
    }
    if (!((forwardValue3631_185_0 < 0))) {
        break forward_join_193;
    }
    ((moom.jD)(this.o)).h = ((float)((-life12_88)));
    }
    forwardValue3631_195_0 = ((this.t) ? 1 : 0);
    }
    if (!((life10_32 != null))) {
        forwardValue3631_290_0 = forwardValue3631_195_0;
        break forward_join_290;
    }
    if (!((forwardValue3631_195_0 != 0))) {
        break forward_join_214;
    }
    ((moom.jD)(this.l)).h = ((float)(-0x1.0p-1f));
    ((moom.jD)(this.m)).h = ((float)(-0x1.0p-1f));
    ((moom.jD)(this.l)).j = ((float)(0x1.99999ap-5f));
    ((moom.jD)(this.m)).j = ((float)(-0x1.99999ap-5f));
    }
    ((moom.jD)(this.l)).g = ((float)(0x0.0p0f));
    ((moom.jD)(this.m)).g = ((float)(0x0.0p0f));
    ((moom.jD)(this.n)).g = ((float)(0x0.0p0f));
    ((moom.jD)(this.o)).g = ((float)(0x0.0p0f));
    ((moom.jD)(this.n)).f = ((float)((0x1.2p3f + life11_18)));
    ((moom.jD)(this.o)).f = ((float)((0x1.2p3f + life11_18)));
    ((moom.jD)(this.i)).g = ((float)(-0x0.0p0f));
    ((moom.jD)(this.i)).f = ((float)((life11_18 + 0x1.0p0f)));
    ((moom.jD)(this.j)).e = ((float)(((moom.jD)(this.i)).e));
    ((moom.jD)(this.j)).f = ((float)(((moom.jD)(this.i)).f));
    ((moom.jD)(this.j)).g = ((float)(((moom.jD)(this.i)).g));
    ((moom.jD)(this.j)).h = ((float)(((moom.jD)(this.i)).h));
    ((moom.jD)(this.j)).i = ((float)(((moom.jD)(this.i)).i));
    ((moom.jD)(this.j)).j = ((float)(((moom.jD)(this.i)).j));
    forwardValue3631_290_0 = ((this.u) ? 1 : 0);
    }
    if (!((forwardValue3631_290_0 != 0))) {
        break forward_join_302;
    }
    life13_346 = 0x1.0p0f;
    moom.jD __stackOp3631_128_0 = this.i;
    ((moom.jD)(__stackOp3631_128_0)).f = ((float)((((moom.jD)(__stackOp3631_128_0)).f - (life13_346 * 0x1.4p2f))));
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static native <E extends Throwable> int __sourceIntrinsic_bdcd40e2d3521aef_originalDynamicSite2903_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bdcd40e2d3521aef_originalDynamicSite2903_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bdcd40e2d3521aef_originalDynamicSite2903_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bdcd40e2d3521aef_originalDynamicSite2903_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bdcd40e2d3521aef_originalDynamicSite2903_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bdcd40e2d3521aef_originalDynamicSite2903_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bdcd40e2d3521aef_originalDynamicSite2903_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bdcd40e2d3521aef_originalDynamicSite2903_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bdcd40e2d3521aef_originalDynamicSite2903_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bdcd40e2d3521aef_originalDynamicSite2903_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bdcd40e2d3521aef_originalDynamicSite2903_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bdcd40e2d3521aef_originalDynamicSite2903_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bdcd40e2d3521aef_originalDynamicSite2903_29(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bdcd40e2d3521aef_originalDynamicSite2903_34(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bdcd40e2d3521aef_originalDynamicSite2903_38(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bdcd40e2d3521aef_originalDynamicSite2903_41(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bdcd40e2d3521aef_originalDynamicSite2903_45(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bdcd40e2d3521aef_originalDynamicSite2903_50(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral8028_0() throws E;
}
