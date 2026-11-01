package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class uH extends moom.uc {

private final moom.sI c;

private net.minecraft.entity.EntityLivingBase d;

private double e;

private double f;

private double g;

private final double h;

private final float i;

private static final long j;

private static final long[] k;

private static final java.lang.Integer[] l;

private static final java.util.Map m;

public uH(moom.sI p0, double p1, float p2) {
super();
    this.c = p0;
    this.h = p1;
    this.i = p2;
    (this).a(1);
}


static {
j = ((long)(((moom._a)(moom._c.a(((long)(6253156592891331965L)), ((long)(2994623982483060176L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(223565607973405L)))));
    m = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.uH.j ^ 40191216328322L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1045_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1045_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1045_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1045_14 = new byte[8];
    (__sourceSpill1045_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1045_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1045_16 = __sourceSpill1045_14;
    ((javax.crypto.Cipher)(__sourceSpill1045_11)).init(((int)(__sourceSpill1045_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1045_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1045_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "\017¤ó>\031K²Ìþ9¤ôGék"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1045_25 = local6_life21;
        int __sourceSpill1045_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1045_25)).substring(((int)(__sourceSpill1045_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1045_30 = local8_life19;
        int __sourceSpill1045_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1045_33 = new byte[8];
        (__sourceSpill1045_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1045_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1045_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1045_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1045_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1045_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1045_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1045_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1045_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1045_34)).doFinal(((byte[])(__sourceSpill1045_33)));
        (__sourceSpill1045_30)[__sourceSpill1045_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    k = ((long[])(local8_life19));
    l = ((java.lang.Integer[])(new java.lang.Integer[2]));
}


public boolean b__Boolean() {
int forwardValue4160_16_0;
    int forwardValue4160_31_0;
    int forwardValue4160_35_0;
    int forwardValue4160_37_0;
    boolean spill4160_0;
    long life1_3;
    int life3_5;
    forward_join_37: {
    forward_join_36: {
    forward_join_35: {
    forward_join_31: {
    forward_join_16: {
    life1_3 = (moom.uH.j ^ 67370281072460L);
    life3_5 = ((moom.uc.d()) ? 1 : 0);
    spill4160_0 = ((moom.AV)(((moom.sI)(this.c)).a__sourceReturn_407923443b())).a__Boolean();
    if (!((life3_5 != 0))) {
        forwardValue4160_16_0 = ((spill4160_0) ? 1 : 0);
        break forward_join_16;
    }
    if (!((!spill4160_0))) {
        break forward_join_36;
    }
    forwardValue4160_16_0 = ((((net.minecraft.entity.EntityLivingBase)(this.d)).p__Boolean()) ? 1 : 0);
    }
    if (!((life3_5 != 0))) {
        forwardValue4160_31_0 = forwardValue4160_16_0;
        break forward_join_31;
    }
    if (!((forwardValue4160_16_0 != 0))) {
        break forward_join_36;
    }
    forwardValue4160_31_0 = recovery.source.CarrierOps.dcmpg(((double)(((net.minecraft.entity.EntityLivingBase)(this.d)).a(((net.minecraft.entity.Entity)(this.c))))), ((double)(((double) (this.i * this.i)))));
    }
    if (!((life3_5 != 0))) {
        forwardValue4160_35_0 = forwardValue4160_31_0;
        break forward_join_35;
    }
    if (!((forwardValue4160_31_0 < 0))) {
        break forward_join_36;
    }
    forwardValue4160_35_0 = 1;
    }
    forwardValue4160_37_0 = forwardValue4160_35_0;
    break forward_join_37;
    }
    forwardValue4160_37_0 = 0;
    }
    return ((forwardValue4160_37_0) != 0);
}


public void b__Void() {
this.d = ((net.minecraft.entity.EntityLivingBase)(null));
    return;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.uH.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int n4 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x29AE;
        if (uH.l[n4] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = k[n4];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])m.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    m.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/uH", exception);
            }
            int n8 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            uH.l[n4] = n8;
        }
        return uH.l[n4];
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral9301_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/uH"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public boolean a__Boolean() {
net.minecraft.entity.EntityLivingBase forwardValue4159_22_0;
    moom.uH forwardValue4159_36_0;
    boolean spill4159_0;
    net.minecraft.entity.EntityLivingBase spill4159_1;
    moom.uH spill4159_2;
    long life1_3;
    int life3_10;
    moom.DR life4_70;
    forward_join_79: {
    forward_join_67: {
    forward_join_36: {
    forward_join_35: {
    forward_join_22: {
    forward_join_18: {
    life1_3 = (moom.uH.j ^ 94517966741469L);
    spill4159_0 = moom.uc.e();
    this.d = ((net.minecraft.entity.EntityLivingBase)(((moom.sI)(this.c)).d__sourceReturn_d30556f370()));
    life3_10 = ((spill4159_0) ? 1 : 0);
    spill4159_1 = this.d;
    if (!((life3_10 == 0))) {
        forwardValue4159_22_0 = spill4159_1;
        break forward_join_22;
    }
    if (!((spill4159_1 == null))) {
        break forward_join_18;
    }
    return ((0) != 0);
    }
    spill4159_2 = this;
    if (!((life3_10 == 0))) {
        forwardValue4159_36_0 = spill4159_2;
        break forward_join_36;
    }
    forwardValue4159_22_0 = ((moom.uH)(spill4159_2)).d;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(((net.minecraft.entity.EntityLivingBase)(forwardValue4159_22_0)).a(((net.minecraft.entity.Entity)(this.c))))), ((double)(((double) (this.i * this.i))))) > 0))) {
        break forward_join_35;
    }
    return ((0) != 0);
    }
    forwardValue4159_36_0 = this;
    }
    life4_70 = moom.vA.a(((moom.sI)(((moom.uH)(forwardValue4159_36_0)).c)), ((int)(__sourceIntrinsic_1a14968dced5_invokedynamic4159_16(447, (5581771840885215462L ^ life1_3)))), ((int)(__sourceIntrinsic_1a14968dced5_invokedynamic4159_17(2495, (6008021061384853735L ^ life1_3)))), ((moom.DR)(new moom.DR(((net.minecraft.entity.EntityLivingBase)(this.d)).n, ((net.minecraft.entity.EntityLivingBase)(this.d)).o, ((net.minecraft.entity.EntityLivingBase)(this.d)).p))));
    if (!((life3_10 == 0))) {
        break forward_join_79;
    }
    if (!((life4_70 == null))) {
        break forward_join_67;
    }
    return ((0) != 0);
    }
    this.e = ((double)(((moom.DR)(life4_70)).a));
    this.f = ((double)(((moom.DR)(life4_70)).b));
    this.g = ((double)(((moom.DR)(life4_70)).c));
    }
    return ((1) != 0);
}


public void a__Void() {
((moom.AV)(((moom.sI)(this.c)).a__sourceReturn_407923443b())).a(((double)(this.e)), ((double)(this.f)), ((double)(this.g)), ((double)(this.h)));
    return;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral9301_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1a14968dced5_invokedynamic4159_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1a14968dced5_invokedynamic4159_17(int a0, long a1) throws E;
}
