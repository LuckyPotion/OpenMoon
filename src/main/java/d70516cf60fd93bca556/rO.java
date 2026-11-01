package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class rO extends net.minecraft.enchantment.Enchantment {

private static long G;

private static long[] H;

private static java.lang.Integer[] I;

private static java.util.Map J;

protected rO(int p0, moom.DD p1, int p2, net.minecraft.enchantment.EnumEnchantmentType p3) { super(0, (moom.DD)null, 0, (net.minecraft.enchantment.EnumEnchantmentType)null); }


private static void __sourceConstructorBody_66e0869060bcfaec(moom.rO receiver, int p0, moom.DD p1, int p2, net.minecraft.enchantment.EnumEnchantmentType p3) throws Throwable {

long local5_life1 = (moom.rO.G ^ 133127713353989L);

    moom.rO.__sourceConstructorInit_66e0869060bcfaec_0(((moom.rO)(receiver)), ((int)(p0)), ((moom.DD)(p1)), ((int)(p2)), ((net.minecraft.enchantment.EnumEnchantmentType)(p3)));

    if ((p3 == net.minecraft.enchantment.EnumEnchantmentType.DIGGER)) {

        ((moom.rO)(receiver)).b(((java.lang.String)("lootBonusDigger")));

    } else {

        if ((p3 == net.minecraft.enchantment.EnumEnchantmentType.FISHING_ROD)) {

        ((moom.rO)(receiver)).b(((java.lang.String)("lootBonusFishing")));

    } else {

        ((moom.rO)(receiver)).b(((java.lang.String)("lootBonus")));

    }

    }

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_66e0869060bcfaec_0(moom.rO a0, int a1, moom.DD a2, int a3, net.minecraft.enchantment.EnumEnchantmentType a4) throws E;

static {
G = ((long)(((moom._a)(moom._c.a(((long)(-6847170567476429948L)), ((long)(-3471514162887672963L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(50924408557360L)))));
    J = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.rO.G ^ 48735918575414L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill991_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill991_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill991_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill991_14 = new byte[8];
    (__sourceSpill991_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill991_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation991_16 = __sourceSpill991_14;
    ((javax.crypto.Cipher)(__sourceSpill991_11)).init(((int)(__sourceSpill991_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill991_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation991_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[3];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "?,\000°\030\005\007S¢Ì=\ntNßî|\177Ok\bÛ£"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill991_25 = local6_life21;
        int __sourceSpill991_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill991_25)).substring(((int)(__sourceSpill991_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill991_30 = local8_life19;
        int __sourceSpill991_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill991_33 = new byte[8];
        (__sourceSpill991_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill991_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill991_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill991_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill991_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill991_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill991_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill991_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill991_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill991_34)).doFinal(((byte[])(__sourceSpill991_33)));
        (__sourceSpill991_30)[__sourceSpill991_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    H = ((long[])(local8_life19));
    I = ((java.lang.Integer[])(new java.lang.Integer[3]));
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.rO.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x18;
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
                throw new RuntimeException("moom/rO", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            rO.I[n2] = n3;
        }
        return I[n2];
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8920_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/rO"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public int b(int p0) {
long local2 = (moom.rO.G ^ 32424838001897L);
    return (super.a(((int)(p0))) + __sourceIntrinsic_ead3c349e325_originalDynamicSite1613_2(9279, (1787676066968238803L ^ local2)));
}


public int c() {
return 3;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public int a(int p0) {
long local2 = (moom.rO.G ^ 61686002936810L);
    return (__sourceIntrinsic_5c51e7cdc795_originalDynamicSite1614_1(21569, (675804549348988332L ^ local2)) + ((p0 - 1) * __sourceIntrinsic_5c51e7cdc795_originalDynamicSite1614_2(16107, (2455702937835110149L ^ local2))));
}


public boolean a(net.minecraft.enchantment.Enchantment p0) {
int forwardValue3896_14_0;
    int forwardValue3896_20_0;
    int forwardValue3896_22_0;
    boolean spill3896_0;
    long life2_3;
    int life4_5;
    forward_join_22: {
    forward_join_21: {
    forward_join_20: {
    forward_join_14: {
    life2_3 = (moom.rO.G ^ 103199393585223L);
    life4_5 = ((moom.rV.c()) ? 1 : 0);
    spill3896_0 = super.a(((net.minecraft.enchantment.Enchantment)(p0)));
    if (!((life4_5 == 0))) {
        forwardValue3896_14_0 = ((spill3896_0) ? 1 : 0);
        break forward_join_14;
    }
    if (!(spill3896_0)) {
        break forward_join_21;
    }
    forwardValue3896_14_0 = ((net.minecraft.enchantment.Enchantment)(p0)).C;
    }
    if (!((life4_5 == 0))) {
        forwardValue3896_20_0 = forwardValue3896_14_0;
        break forward_join_20;
    }
    if (!((forwardValue3896_14_0 != ((net.minecraft.enchantment.Enchantment)(moom.rO.t)).C))) {
        break forward_join_21;
    }
    forwardValue3896_20_0 = 1;
    }
    forwardValue3896_22_0 = forwardValue3896_20_0;
    break forward_join_22;
    }
    forwardValue3896_22_0 = 0;
    }
    return ((forwardValue3896_22_0) != 0);
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8920_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ead3c349e325_originalDynamicSite1613_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5c51e7cdc795_originalDynamicSite1614_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5c51e7cdc795_originalDynamicSite1614_2(int a0, long a1) throws E;
}
