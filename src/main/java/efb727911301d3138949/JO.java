package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class JO {

private moom.JN a;

private moom.JN b;

private moom.JN c;

private int[] d;

private int[] e;

private static long f;

private static long[] g;

private static java.lang.Integer[] h;

private static java.util.Map i;

public JO(moom.JN p0, moom.JN p1, moom.JN p2) { super(); }


private static void __sourceConstructorBody_7ed42499bf87c739(moom.JO receiver, moom.JN p0, moom.JN p1, moom.JN p2) throws Throwable {

moom.JN __initValue525_25_0;

    moom.JN __initValue525_31_0;

    moom.JN __initValue525_35_0;

    long local4_life2;

    net.minecraft.entity.Entity[] local6_life8;

    init_join_36: {

    init_join_35: {

    init_join_31: {

    init_join_30: {

    init_join_25: {

    init_join_24: {

    local4_life2 = (moom.JO.f ^ 65635181638969L);

    net.minecraft.entity.Entity[] __sourceSpill525_4 = moom.JM.b__Arrayr3();

    moom.JO.__sourceConstructorInit_7ed42499bf87c739_0(((moom.JO)(receiver)));

    ((moom.JO)(receiver)).d = ((int[])(new int[0]));

    ((moom.JO)(receiver)).e = ((int[])(new int[0]));

    local6_life8 = __sourceSpill525_4;

    moom.JN __sourceSpill525_9 = p1;

    if (!((local6_life8 != null))) {

        __initValue525_25_0 = __sourceSpill525_9;

        break init_join_25;

    }

    if (!((__sourceSpill525_9 == null))) {

        break init_join_24;

    }

    moom.JN __sourceSpill525_10 = p2;

    if (!((local6_life8 != null))) {

        __initValue525_25_0 = __sourceSpill525_10;

        break init_join_25;

    }

    if (!((__sourceSpill525_10 != null))) {

        break init_join_36;

    }

    }

    __initValue525_25_0 = p1;

    }

    moom.JN __sourceSpill525_11 = __initValue525_25_0;

    if (!((local6_life8 != null))) {

        __initValue525_31_0 = __sourceSpill525_11;

        break init_join_31;

    }

    if (!((__sourceSpill525_11 == null))) {

        break init_join_30;

    }

    p1 = p0;

    }

    __initValue525_31_0 = p2;

    }

    moom.JN __sourceSpill525_12 = __initValue525_31_0;

    if (!((local6_life8 != null))) {

        __initValue525_35_0 = __sourceSpill525_12;

        break init_join_35;

    }

    if (!((__sourceSpill525_12 == null))) {

        break init_join_36;

    }

    __initValue525_35_0 = p1;

    }

    p2 = __initValue525_35_0;

    }

    ((moom.JO)(receiver)).a = ((moom.JN)(p0));

    ((moom.JO)(receiver)).b = ((moom.JN)(p1));

    ((moom.JO)(receiver)).c = ((moom.JN)(p2));

    return;

}



static {
f = ((long)(((moom._a)(moom._c.a(((long)(705075553663309420L)), ((long)(-4679563768525846603L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(275175094608703L)))));
    i = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.JO.f ^ 115101277275990L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill882_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill882_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill882_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill882_14 = new byte[8];
    (__sourceSpill882_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill882_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation882_16 = __sourceSpill882_14;
    ((javax.crypto.Cipher)(__sourceSpill882_11)).init(((int)(__sourceSpill882_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill882_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation882_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[8];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "(õ%BAe¡\032µ®mÊG#²ÍÌD½\034Ä¾÷ÃÕwº­ñ-0\017íÂM\016ø4 C²[ "))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill882_25 = local6_life21;
        int __sourceSpill882_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill882_25)).substring(((int)(__sourceSpill882_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill882_30 = local8_life19;
        int __sourceSpill882_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill882_33 = new byte[8];
        (__sourceSpill882_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill882_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill882_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill882_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill882_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill882_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill882_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill882_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill882_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill882_34)).doFinal(((byte[])(__sourceSpill882_33)));
        (__sourceSpill882_30)[__sourceSpill882_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "êÎg\\/c~©Ã\027~R\030Õ"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill882_38 = local6_life21;
        int __sourceSpill882_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill882_38)).substring(((int)(__sourceSpill882_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill882_43 = local8_life19;
        int __sourceSpill882_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill882_46 = new byte[8];
        (__sourceSpill882_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill882_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill882_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill882_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill882_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill882_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill882_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill882_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill882_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill882_47)).doFinal(((byte[])(__sourceSpill882_46)));
        (__sourceSpill882_43)[__sourceSpill882_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    g = ((long[])(local8_life19));
    h = ((java.lang.Integer[])(new java.lang.Integer[8]));
}

private static native <E extends Throwable> void __sourceConstructorInit_7ed42499bf87c739_0(moom.JO a0) throws E;

private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static int a(int p0, long p1) {
int n4 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x3F1C;
        if (h[n4] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = g[n4];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])i.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    i.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/JO", exception);
            }
            int n7 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            JO.h[n4] = n7;
        }
        return h[n4];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.JO.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral5146_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/JO"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public boolean a(net.minecraft.world.World p0, float p1, int[] p2, boolean p3, float p4) {
moom.JN forwardValue2299_13_0;
    moom.JN forwardValue2299_18_0;
    int forwardValue2299_55_0;
    int forwardValue2299_57_0;
    int forwardValue2299_65_0;
    int forwardValue2299_67_0;
    int forwardValue2299_89_0;
    float forwardValue2299_96_0;
    float forwardValue2299_96_1;
    int forwardValue2299_121_0;
    int forwardValue2299_168_0;
    moom.JN forwardValue2299_178_0;
    int forwardValue2299_196_0;
    moom.JN forwardValue2299_206_0;
    int forwardValue2299_222_0;
    int forwardValue2299_245_0;
    int forwardValue2299_245_1;
    int forwardValue2299_270_0;
    int forwardValue2299_272_0;
    int forwardValue2299_280_0;
    moom.JN spill2299_0;
    int spill2299_1;
    int spill2299_2;
    int spill2299_3;
    int spill2299_4;
    int spill2299_5;
    int spill2299_6;
    float spill2299_7;
    float spill2299_8;
    int spill2299_9;
    int spill2299_10;
    boolean spill2299_11;
    moom.JN spill2299_12;
    boolean spill2299_13;
    moom.JN spill2299_14;
    boolean spill2299_15;
    int spill2299_16;
    int spill2299_17;
    boolean spill2299_18;
    long life6_3;
    net.minecraft.entity.Entity[] life8_5;
    int life9_39;
    float life10_62;
    float life11_66;
    float life12_68;
    int life13_81;
    int life14_94;
    float life15_138;
    float life16_142;
    int life17_168;
    int[][] life18_185;
    float[] life19_188;
    forward_join_280: {
    forward_join_273: {
    forward_join_272: {
    forward_join_271: {
    forward_join_270: {
    forward_join_269: {
    forward_join_245: {
    forward_join_241: {
    forward_join_222: {
    forward_join_221: {
    forward_join_206: {
    forward_join_196: {
    forward_join_193: {
    forward_join_178: {
    forward_join_168: {
    forward_join_165: {
    forward_join_121: {
    forward_join_120: {
    forward_join_96: {
    forward_join_94: {
    forward_join_89: {
    forward_join_84: {
    forward_join_67: {
    forward_join_66: {
    forward_join_65: {
    forward_join_57: {
    forward_join_56: {
    forward_join_55: {
    forward_join_24: {
    forward_join_18: {
    forward_join_13: {
    life6_3 = (moom.JO.f ^ 72808717764280L);
    life8_5 = moom.JM.b__Arrayr3();
    spill2299_0 = this.b;
    if (!((life8_5 != null))) {
        forwardValue2299_13_0 = spill2299_0;
        break forward_join_13;
    }
    if (!((spill2299_0 == null))) {
        break forward_join_24;
    }
    forwardValue2299_13_0 = this.c;
    }
    if (!((life8_5 != null))) {
        forwardValue2299_18_0 = forwardValue2299_13_0;
        break forward_join_18;
    }
    if (!((forwardValue2299_13_0 == null))) {
        break forward_join_24;
    }
    forwardValue2299_18_0 = this.a;
    }
    return ((moom.JN)(forwardValue2299_18_0)).a(((net.minecraft.world.World)(p0)), ((float)(p1)), ((int[])(p2)), ((boolean)(p3)));
    }
    life9_39 = ((moom.EA)(((net.minecraft.world.World)(p0)).v)).b();
    spill2299_1 = life9_39;
    if (!((life8_5 != null))) {
        forwardValue2299_280_0 = spill2299_1;
        break forward_join_280;
    }
    if (!((spill2299_1 != 1))) {
        break forward_join_273;
    }
    spill2299_2 = life9_39;
    if (!((life8_5 != null))) {
        forwardValue2299_280_0 = spill2299_2;
        break forward_join_280;
    }
    if (!((spill2299_2 != -1))) {
        break forward_join_273;
    }
    life10_62 = ((net.minecraft.world.World)(p0)).f(((float)(p4)));
    life11_66 = ((net.minecraft.world.World)(p0)).e(((float)(p4)));
    life12_68 = 0x1.a36e2ep-14f;
    spill2299_3 = recovery.source.CarrierOps.fcmpl(((float)(life10_62)), ((float)(life12_68)));
    if (!((life8_5 != null))) {
        forwardValue2299_55_0 = spill2299_3;
        break forward_join_55;
    }
    if (!((spill2299_3 > 0))) {
        break forward_join_56;
    }
    forwardValue2299_55_0 = 1;
    }
    forwardValue2299_57_0 = forwardValue2299_55_0;
    break forward_join_57;
    }
    forwardValue2299_57_0 = 0;
    }
    life13_81 = forwardValue2299_57_0;
    spill2299_4 = recovery.source.CarrierOps.fcmpl(((float)(life11_66)), ((float)(life12_68)));
    if (!((life8_5 != null))) {
        forwardValue2299_65_0 = spill2299_4;
        break forward_join_65;
    }
    if (!((spill2299_4 > 0))) {
        break forward_join_66;
    }
    forwardValue2299_65_0 = 1;
    }
    forwardValue2299_67_0 = forwardValue2299_65_0;
    break forward_join_67;
    }
    forwardValue2299_67_0 = 0;
    }
    life14_94 = forwardValue2299_67_0;
    spill2299_5 = life13_81;
    if (!((life8_5 != null))) {
        forwardValue2299_89_0 = spill2299_5;
        break forward_join_89;
    }
    if (!((spill2299_5 == 0))) {
        break forward_join_84;
    }
    spill2299_6 = life14_94;
    if (!((life8_5 != null))) {
        forwardValue2299_89_0 = spill2299_6;
        break forward_join_89;
    }
    if (!((spill2299_6 == 0))) {
        break forward_join_84;
    }
    return ((moom.JN)(this.a)).a(((net.minecraft.world.World)(p0)), ((float)(p1)), ((int[])(p2)), ((boolean)(p3)));
    }
    spill2299_7 = life10_62;
    spill2299_8 = 0x0.0p0f;
    if (!((life8_5 != null))) {
        forwardValue2299_96_0 = spill2299_7;
        forwardValue2299_96_1 = spill2299_8;
        break forward_join_96;
    }
    forwardValue2299_89_0 = recovery.source.CarrierOps.fcmpl(((float)(spill2299_7)), ((float)(spill2299_8)));
    }
    if (!((forwardValue2299_89_0 > 0))) {
        break forward_join_94;
    }
    life11_66 = (life11_66 / life10_62);
    }
    forwardValue2299_96_0 = 0x1.0p0f;
    forwardValue2299_96_1 = life10_62;
    }
    life15_138 = (forwardValue2299_96_0 - forwardValue2299_96_1);
    life16_142 = (life10_62 - life11_66);
    spill2299_9 = (this.d).length;
    if (!((life8_5 != null))) {
        forwardValue2299_121_0 = spill2299_9;
        break forward_join_121;
    }
    if (!((spill2299_9 != (p2).length))) {
        break forward_join_120;
    }
    this.d = ((int[])(new int[(p2).length]));
    this.e = ((int[])(new int[(p2).length]));
    }
    forwardValue2299_121_0 = 0;
    }
    life17_168 = forwardValue2299_121_0;
    life18_185 = new int[][] {p2, this.d, this.e};
    life19_188 = new float[3];
    spill2299_10 = recovery.source.CarrierOps.fcmpl(((float)(life15_138)), ((float)(life12_68)));
    if (!((life8_5 != null))) {
        forwardValue2299_168_0 = spill2299_10;
        break forward_join_168;
    }
    if (!((spill2299_10 > 0))) {
        break forward_join_165;
    }
    spill2299_11 = ((moom.JN)(this.a)).a(((net.minecraft.world.World)(p0)), ((float)(p1)), ((int[])((life18_185)[life17_168])), ((boolean)(p3)));
    if (!((life8_5 != null))) {
        forwardValue2299_168_0 = ((spill2299_11) ? 1 : 0);
        break forward_join_168;
    }
    if (!(spill2299_11)) {
        break forward_join_165;
    }
    (life19_188)[life17_168] = life15_138;
    life17_168 += 1;
    }
    forwardValue2299_168_0 = recovery.source.CarrierOps.fcmpl(((float)(life16_142)), ((float)(life12_68)));
    }
    if (!((life8_5 != null))) {
        forwardValue2299_196_0 = forwardValue2299_168_0;
        break forward_join_196;
    }
    if (!((forwardValue2299_168_0 > 0))) {
        break forward_join_193;
    }
    spill2299_12 = this.b;
    if (!((life8_5 != null))) {
        forwardValue2299_178_0 = spill2299_12;
        break forward_join_178;
    }
    if (!((spill2299_12 != null))) {
        break forward_join_193;
    }
    forwardValue2299_178_0 = this.b;
    }
    spill2299_13 = ((moom.JN)(forwardValue2299_178_0)).a(((net.minecraft.world.World)(p0)), ((float)(p1)), ((int[])((life18_185)[life17_168])), ((boolean)(p3)));
    if (!((life8_5 != null))) {
        forwardValue2299_196_0 = ((spill2299_13) ? 1 : 0);
        break forward_join_196;
    }
    if (!(spill2299_13)) {
        break forward_join_193;
    }
    (life19_188)[life17_168] = life16_142;
    life17_168 += 1;
    }
    forwardValue2299_196_0 = recovery.source.CarrierOps.fcmpl(((float)(life11_66)), ((float)(life12_68)));
    }
    if (!((life8_5 != null))) {
        forwardValue2299_222_0 = forwardValue2299_196_0;
        break forward_join_222;
    }
    if (!((forwardValue2299_196_0 > 0))) {
        break forward_join_221;
    }
    spill2299_14 = this.c;
    if (!((life8_5 != null))) {
        forwardValue2299_206_0 = spill2299_14;
        break forward_join_206;
    }
    if (!((spill2299_14 != null))) {
        break forward_join_221;
    }
    forwardValue2299_206_0 = this.c;
    }
    spill2299_15 = ((moom.JN)(forwardValue2299_206_0)).a(((net.minecraft.world.World)(p0)), ((float)(p1)), ((int[])((life18_185)[life17_168])), ((boolean)(p3)));
    if (!((life8_5 != null))) {
        forwardValue2299_222_0 = ((spill2299_15) ? 1 : 0);
        break forward_join_222;
    }
    if (!(spill2299_15)) {
        break forward_join_221;
    }
    (life19_188)[life17_168] = life11_66;
    life17_168 += 1;
    }
    forwardValue2299_222_0 = life17_168;
    }
    spill2299_16 = 2;
    if (!((life8_5 != null))) {
        forwardValue2299_245_0 = forwardValue2299_222_0;
        forwardValue2299_245_1 = spill2299_16;
        break forward_join_245;
    }
    if (!((forwardValue2299_222_0 == spill2299_16))) {
        break forward_join_241;
    }
    forwardValue2299_272_0 = ((((moom.JO)(this)).a(((int[])((life18_185)[0])), ((float)((life19_188)[0])), ((int[])((life18_185)[1])), ((float)((life19_188)[1])))) ? 1 : 0);
    break forward_join_272;
    }
    spill2299_17 = life17_168;
    if (!((life8_5 != null))) {
        forwardValue2299_270_0 = spill2299_17;
        break forward_join_270;
    }
    forwardValue2299_245_0 = spill2299_17;
    forwardValue2299_245_1 = 3;
    }
    if (!((forwardValue2299_245_0 == forwardValue2299_245_1))) {
        break forward_join_269;
    }
    spill2299_18 = ((moom.JO)(this)).a(((int[])((life18_185)[0])), ((float)((life19_188)[0])), ((int[])((life18_185)[1])), ((float)((life19_188)[1])), ((int[])((life18_185)[2])), ((float)((life19_188)[2])));
    if (!((life8_5 != null))) {
        forwardValue2299_270_0 = ((spill2299_18) ? 1 : 0);
        break forward_join_270;
    }
    if (!(spill2299_18)) {
        break forward_join_271;
    }
    }
    forwardValue2299_270_0 = 1;
    }
    forwardValue2299_272_0 = forwardValue2299_270_0;
    break forward_join_272;
    }
    forwardValue2299_272_0 = 0;
    }
    return ((forwardValue2299_272_0) != 0);
    }
    forwardValue2299_280_0 = ((((moom.JN)(this.a)).a(((net.minecraft.world.World)(p0)), ((float)(p1)), ((int[])(p2)), ((boolean)(p3)))) ? 1 : 0);
    }
    return ((forwardValue2299_280_0) != 0);
}


private boolean a(int[] p0, float p1, int[] p2, float p3, int[] p4, float p5) {
int lexicalValue833_226_0;
    int lexicalValue833_228_0;
    int spill833_0;
    int spill833_1;
    int spill833_2;
    long life7_3;
    net.minecraft.entity.Entity[] life9_5;
    int life10_30;
    int life11_38;
    int life12_52;
    int life13_66;
    int life14_74;
    int life15_78;
    int life16_92;
    int life17_106;
    int life18_114;
    int life19_118;
    int life20_132;
    int life21_146;
    int life22_154;
    int life23_170;
    int life24_186;
    int life25_204;
    lexical_join_228: {
    lexical_join_227: {
    lexical_join_226: {
    lexical_join_225: {
    life7_3 = (moom.JO.f ^ 133380043723798L);
    life9_5 = moom.JM.b__Arrayr3();
    spill833_0 = (p2).length;
    if (!((life9_5 != null))) {
        lexicalValue833_228_0 = spill833_0;
        break lexical_join_228;
    }
    if (!((spill833_0 == (p0).length))) {
        break lexical_join_227;
    }
    spill833_1 = (p4).length;
    if (!((life9_5 != null))) {
        lexicalValue833_228_0 = spill833_1;
        break lexical_join_228;
    }
    if (!((spill833_1 == (p0).length))) {
        break lexical_join_227;
    }
    life10_30 = 0;
    lexical_cycle_22: while (true) {
    if (!((life10_30 < (p0).length))) {
        break lexical_join_225;
    }
    life11_38 = (p0)[life10_30];
    life12_52 = ((life11_38 >> __sourceIntrinsic_c69c1596cb74_invokedynamic833_2(19155, (7974499789192538862L ^ life7_3))) & __sourceIntrinsic_c69c1596cb74_invokedynamic833_3(4928, (305321262188786552L ^ life7_3)));
    life13_66 = ((life11_38 >> __sourceIntrinsic_c69c1596cb74_invokedynamic833_4(30093, (6225530847820518834L ^ life7_3))) & __sourceIntrinsic_c69c1596cb74_invokedynamic833_5(4928, (305321262188786552L ^ life7_3)));
    life14_74 = (life11_38 & __sourceIntrinsic_c69c1596cb74_invokedynamic833_6(4928, (305321262188786552L ^ life7_3)));
    life15_78 = (p2)[life10_30];
    life16_92 = ((life15_78 >> __sourceIntrinsic_c69c1596cb74_invokedynamic833_7(19155, (7974499789192538862L ^ life7_3))) & __sourceIntrinsic_c69c1596cb74_invokedynamic833_8(4928, (305321262188786552L ^ life7_3)));
    life17_106 = ((life15_78 >> __sourceIntrinsic_c69c1596cb74_invokedynamic833_9(30093, (6225530847820518834L ^ life7_3))) & __sourceIntrinsic_c69c1596cb74_invokedynamic833_10(4928, (305321262188786552L ^ life7_3)));
    life18_114 = (life15_78 & __sourceIntrinsic_c69c1596cb74_invokedynamic833_11(4928, (305321262188786552L ^ life7_3)));
    life19_118 = (p4)[life10_30];
    life20_132 = ((life19_118 >> __sourceIntrinsic_c69c1596cb74_invokedynamic833_12(19155, (7974499789192538862L ^ life7_3))) & __sourceIntrinsic_c69c1596cb74_invokedynamic833_13(4928, (305321262188786552L ^ life7_3)));
    life21_146 = ((life19_118 >> __sourceIntrinsic_c69c1596cb74_invokedynamic833_14(30093, (6225530847820518834L ^ life7_3))) & __sourceIntrinsic_c69c1596cb74_invokedynamic833_15(4928, (305321262188786552L ^ life7_3)));
    life22_154 = (life19_118 & __sourceIntrinsic_c69c1596cb74_invokedynamic833_16(4928, (305321262188786552L ^ life7_3)));
    life23_170 = ((int) (((((float) life12_52) * p1) + (((float) life16_92) * p3)) + (((float) life20_132) * p5)));
    life24_186 = ((int) (((((float) life13_66) * p1) + (((float) life17_106) * p3)) + (((float) life21_146) * p5)));
    spill833_2 = ((int) (((((float) life14_74) * p1) + (((float) life18_114) * p3)) + (((float) life22_154) * p5)));
    if (!((life9_5 != null))) {
        lexicalValue833_226_0 = spill833_2;
        break lexical_join_226;
    }
    life25_204 = spill833_2;
    (p0)[life10_30] = (((__sourceIntrinsic_c69c1596cb74_invokedynamic833_17(24564, (9162730551608721359L ^ life7_3)) | (life23_170 << __sourceIntrinsic_c69c1596cb74_invokedynamic833_18(19155, (7974499789192538862L ^ life7_3)))) | (life24_186 << __sourceIntrinsic_c69c1596cb74_invokedynamic833_19(30093, (6225530847820518834L ^ life7_3)))) | life25_204);
    life10_30 += 1;
    if (!((life9_5 == null))) { continue lexical_cycle_22; }
    break lexical_cycle_22;
    }
    }
    lexicalValue833_226_0 = 1;
    }
    return ((lexicalValue833_226_0) != 0);
    }
    lexicalValue833_228_0 = 0;
    }
    return ((lexicalValue833_228_0) != 0);
}


private boolean a(int[] p0, float p1, int[] p2, float p3) {
int lexicalValue832_16_0;
    int lexicalValue832_166_0;
    int spill832_0;
    int spill832_1;
    long life5_3;
    net.minecraft.entity.Entity[] life7_5;
    int life8_21;
    int life9_29;
    int life10_43;
    int life11_57;
    int life12_65;
    int life13_69;
    int life14_83;
    int life15_97;
    int life16_105;
    int life17_116;
    int life18_127;
    int life19_140;
    lexical_join_166: {
    lexical_join_165: {
    lexical_join_16: {
    lexical_join_15: {
    life5_3 = (moom.JO.f ^ 48108431245035L);
    life7_5 = moom.JM.b__Arrayr3();
    spill832_0 = (p2).length;
    if (!((life7_5 != null))) {
        lexicalValue832_16_0 = spill832_0;
        break lexical_join_16;
    }
    if (!((spill832_0 != (p0).length))) {
        break lexical_join_15;
    }
    return ((0) != 0);
    }
    lexicalValue832_16_0 = 0;
    }
    life8_21 = lexicalValue832_16_0;
    lexical_cycle_17: while (true) {
    if (!((life8_21 < (p0).length))) {
        break lexical_join_165;
    }
    life9_29 = (p0)[life8_21];
    life10_43 = ((life9_29 >> __sourceIntrinsic_edce771eafb6_invokedynamic832_3(6618, (1370180852989023001L ^ life5_3))) & __sourceIntrinsic_edce771eafb6_invokedynamic832_4(27581, (2806732176117277049L ^ life5_3)));
    life11_57 = ((life9_29 >> __sourceIntrinsic_edce771eafb6_invokedynamic832_5(11998, (2963229438433682457L ^ life5_3))) & __sourceIntrinsic_edce771eafb6_invokedynamic832_6(4928, (305376839431805317L ^ life5_3)));
    life12_65 = (life9_29 & __sourceIntrinsic_edce771eafb6_invokedynamic832_7(4928, (305376839431805317L ^ life5_3)));
    life13_69 = (p2)[life8_21];
    life14_83 = ((life13_69 >> __sourceIntrinsic_edce771eafb6_invokedynamic832_8(19155, (7974555257011929107L ^ life5_3))) & __sourceIntrinsic_edce771eafb6_invokedynamic832_9(4928, (305376839431805317L ^ life5_3)));
    life15_97 = ((life13_69 >> __sourceIntrinsic_edce771eafb6_invokedynamic832_10(30093, (6225617207376756559L ^ life5_3))) & __sourceIntrinsic_edce771eafb6_invokedynamic832_11(4928, (305376839431805317L ^ life5_3)));
    life16_105 = (life13_69 & __sourceIntrinsic_edce771eafb6_invokedynamic832_12(4928, (305376839431805317L ^ life5_3)));
    life17_116 = ((int) ((((float) life10_43) * p1) + (((float) life14_83) * p3)));
    life18_127 = ((int) ((((float) life11_57) * p1) + (((float) life15_97) * p3)));
    spill832_1 = ((int) ((((float) life12_65) * p1) + (((float) life16_105) * p3)));
    if (!((life7_5 != null))) {
        lexicalValue832_166_0 = spill832_1;
        break lexical_join_166;
    }
    life19_140 = spill832_1;
    (p0)[life8_21] = (((__sourceIntrinsic_edce771eafb6_invokedynamic832_13(15656, (4281031654332397545L ^ life5_3)) | (life17_116 << __sourceIntrinsic_edce771eafb6_invokedynamic832_14(19155, (7974555257011929107L ^ life5_3)))) | (life18_127 << __sourceIntrinsic_edce771eafb6_invokedynamic832_15(30093, (6225617207376756559L ^ life5_3)))) | life19_140);
    life8_21 += 1;
    if (!((life7_5 == null))) { continue lexical_cycle_17; }
    break lexical_cycle_17;
    }
    }
    lexicalValue832_166_0 = 1;
    }
    return ((lexicalValue832_166_0) != 0);
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral5146_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_edce771eafb6_invokedynamic832_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_edce771eafb6_invokedynamic832_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_edce771eafb6_invokedynamic832_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_edce771eafb6_invokedynamic832_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_edce771eafb6_invokedynamic832_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_edce771eafb6_invokedynamic832_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_edce771eafb6_invokedynamic832_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_edce771eafb6_invokedynamic832_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_edce771eafb6_invokedynamic832_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_edce771eafb6_invokedynamic832_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_edce771eafb6_invokedynamic832_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_edce771eafb6_invokedynamic832_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_edce771eafb6_invokedynamic832_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c69c1596cb74_invokedynamic833_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c69c1596cb74_invokedynamic833_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c69c1596cb74_invokedynamic833_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c69c1596cb74_invokedynamic833_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c69c1596cb74_invokedynamic833_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c69c1596cb74_invokedynamic833_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c69c1596cb74_invokedynamic833_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c69c1596cb74_invokedynamic833_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c69c1596cb74_invokedynamic833_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c69c1596cb74_invokedynamic833_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c69c1596cb74_invokedynamic833_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c69c1596cb74_invokedynamic833_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c69c1596cb74_invokedynamic833_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c69c1596cb74_invokedynamic833_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c69c1596cb74_invokedynamic833_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c69c1596cb74_invokedynamic833_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c69c1596cb74_invokedynamic833_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c69c1596cb74_invokedynamic833_19(int a0, long a1) throws E;
}
