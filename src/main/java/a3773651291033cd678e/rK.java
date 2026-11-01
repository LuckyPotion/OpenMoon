package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class rK extends net.minecraft.enchantment.Enchantment {

private static final long G;

private static final long[] H;

private static final java.lang.Integer[] I;

private static final java.util.Map J;

protected rK(int p0, moom.DD p1, int p2) {
super(p0, p1, p2, net.minecraft.enchantment.EnumEnchantmentType.BREAKABLE);
    (this).b("durability");
}


static {
G = ((long)(((moom._a)(moom._c.a(((long)(6837467400184695340L)), ((long)(1672398813336165028L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(115885237879578L)))));
    J = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.rK.G ^ 129699251179472L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill987_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill987_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill987_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill987_14 = new byte[8];
    (__sourceSpill987_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill987_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation987_16 = __sourceSpill987_14;
    ((javax.crypto.Cipher)(__sourceSpill987_11)).init(((int)(__sourceSpill987_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill987_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation987_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "c\nôÖ÷JsÓCÃìÍ'"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill987_25 = local6_life21;
        int __sourceSpill987_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill987_25)).substring(((int)(__sourceSpill987_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill987_30 = local8_life19;
        int __sourceSpill987_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill987_33 = new byte[8];
        (__sourceSpill987_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill987_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill987_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill987_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill987_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill987_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill987_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill987_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill987_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill987_34)).doFinal(((byte[])(__sourceSpill987_33)));
        (__sourceSpill987_30)[__sourceSpill987_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    H = ((long[])(local8_life19));
    I = ((java.lang.Integer[])(new java.lang.Integer[2]));
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8914_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/rK"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x552D;
        if (I[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = H[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])J.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    J.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/rK", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            rK.I[n2] = n3;
        }
        return I[n2];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.rK.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public int b(int p0) {
long local2 = (moom.rK.G ^ 30017298028694L);
    return (super.a(((int)(p0))) + __sourceIntrinsic_ead3c349e325_originalDynamicSite1605_2(5743, (445914370484116919L ^ local2)));
}


public int c() {
return 3;
}


public int a(int p0) {
long local2 = (moom.rK.G ^ 68358311200661L);
    return (5 + ((p0 - 1) * __sourceIntrinsic_5c51e7cdc795_originalDynamicSite1606_1(19570, (8782588964091943080L ^ local2))));
}


public static boolean a(net.minecraft.item.ItemStack p0, int p1, java.util.Random p2) {
int forwardValue3895_24_0;
    int forwardValue3895_28_0;
    int forwardValue3895_30_0;
    int spill3895_0;
    int spill3895_1;
    long life3_3;
    int life5_5;
    forward_join_30: {
    forward_join_29: {
    forward_join_28: {
    forward_join_24: {
    forward_join_19: {
    life3_3 = (moom.rK.G ^ 133626886957051L);
    life5_5 = ((moom.rV.c()) ? 1 : 0);
    spill3895_0 = ((((net.minecraft.item.ItemStack)(p0)).a__wQ() instanceof net.minecraft.item.ItemArmor) ? 1 : 0);
    if (!((life5_5 == 0))) {
        forwardValue3895_24_0 = spill3895_0;
        break forward_join_24;
    }
    if (!((spill3895_0 != 0))) {
        break forward_join_19;
    }
    spill3895_1 = recovery.source.CarrierOps.fcmpg(((float)(((java.util.Random)(p2)).nextFloat())), ((float)(0x1.333334p-1f)));
    if (!((life5_5 == 0))) {
        forwardValue3895_24_0 = spill3895_1;
        break forward_join_24;
    }
    if (!((spill3895_1 >= 0))) {
        break forward_join_29;
    }
    }
    forwardValue3895_24_0 = ((java.util.Random)(p2)).nextInt(((int)((p1 + 1))));
    }
    if (!((life5_5 == 0))) {
        forwardValue3895_28_0 = forwardValue3895_24_0;
        break forward_join_28;
    }
    if (!((forwardValue3895_24_0 > 0))) {
        break forward_join_29;
    }
    forwardValue3895_28_0 = 1;
    }
    forwardValue3895_30_0 = forwardValue3895_28_0;
    break forward_join_30;
    }
    forwardValue3895_30_0 = 0;
    }
    return ((forwardValue3895_30_0) != 0);
}


public boolean a(net.minecraft.item.ItemStack p0) {
int forwardValue3894_18_0;
    int forwardValue3894_20_0;
    boolean spill3894_0;
    boolean spill3894_1;
    long life2_3;
    int life4_5;
    forward_join_20: {
    forward_join_19: {
    forward_join_18: {
    forward_join_17: {
    life2_3 = (moom.rK.G ^ 70070982420523L);
    life4_5 = ((moom.rV.c()) ? 1 : 0);
    spill3894_0 = ((net.minecraft.item.ItemStack)(p0)).b__Boolean();
    if (!((life4_5 == 0))) {
        forwardValue3894_18_0 = ((spill3894_0) ? 1 : 0);
        break forward_join_18;
    }
    if (!((!spill3894_0))) {
        break forward_join_17;
    }
    spill3894_1 = super.a(((net.minecraft.item.ItemStack)(p0)));
    if (!((life4_5 == 0))) {
        forwardValue3894_18_0 = ((spill3894_1) ? 1 : 0);
        break forward_join_18;
    }
    if (!(spill3894_1)) {
        break forward_join_19;
    }
    }
    forwardValue3894_18_0 = 1;
    }
    forwardValue3894_20_0 = forwardValue3894_18_0;
    break forward_join_20;
    }
    forwardValue3894_20_0 = 0;
    }
    return ((forwardValue3894_20_0) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8914_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ead3c349e325_originalDynamicSite1605_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5c51e7cdc795_originalDynamicSite1606_1(int a0, long a1) throws E;
}
