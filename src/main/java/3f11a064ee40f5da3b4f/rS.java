package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class rS extends net.minecraft.enchantment.Enchantment {

private static final long G;

private static final long[] H;

private static final java.lang.Integer[] I;

private static final java.util.Map J;

protected rS(int p0, moom.DD p1, int p2) {
super(p0, p1, p2, net.minecraft.enchantment.EnumEnchantmentType.DIGGER);
    (this).b("untouching");
}


static {
G = ((long)(((moom._a)(moom._c.a(((long)(-3849256206756371968L)), ((long)(7394772722963774504L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(11655935765769L)))));
    J = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.rS.G ^ 52369150340966L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill993_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill993_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill993_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill993_14 = new byte[8];
    (__sourceSpill993_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill993_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation993_16 = __sourceSpill993_14;
    ((javax.crypto.Cipher)(__sourceSpill993_11)).init(((int)(__sourceSpill993_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill993_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation993_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "ñãoò\035Z6¥Ò_=."))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill993_25 = local6_life21;
        int __sourceSpill993_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill993_25)).substring(((int)(__sourceSpill993_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill993_30 = local8_life19;
        int __sourceSpill993_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill993_33 = new byte[8];
        (__sourceSpill993_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill993_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill993_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill993_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill993_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill993_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill993_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill993_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill993_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill993_34)).doFinal(((byte[])(__sourceSpill993_33)));
        (__sourceSpill993_30)[__sourceSpill993_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    H = ((long[])(local8_life19));
    I = ((java.lang.Integer[])(new java.lang.Integer[2]));
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8932_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/rS"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x627D;
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
                throw new RuntimeException("moom/rS", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            rS.I[n2] = n3;
        }
        return I[n2];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.rS.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public int b(int p0) {
long local2 = (moom.rS.G ^ 107196967985830L);
    return (super.a(((int)(p0))) + __sourceIntrinsic_ead3c349e325_originalDynamicSite1620_2(17677, (1983229045911058820L ^ local2)));
}


public int c() {
return 1;
}


public int a(int p0) {
long local2 = (moom.rS.G ^ 74876975791525L);
    return __sourceIntrinsic_5c51e7cdc795_originalDynamicSite1621_1(7040, (7878230909328701451L ^ local2));
}


public boolean a(net.minecraft.item.ItemStack p0) {
int forwardValue3905_17_0;
    int forwardValue3905_19_0;
    boolean spill3905_0;
    long life2_3;
    int life4_5;
    forward_join_19: {
    forward_join_18: {
    forward_join_17: {
    forward_join_16: {
    life2_3 = (moom.rS.G ^ 76454231822875L);
    life4_5 = ((moom.rV.c()) ? 1 : 0);
    if (!((((net.minecraft.item.ItemStack)(p0)).a__wQ() != net.minecraft.init.Items.a4))) {
        break forward_join_16;
    }
    spill3905_0 = super.a(((net.minecraft.item.ItemStack)(p0)));
    if (!((life4_5 == 0))) {
        forwardValue3905_17_0 = ((spill3905_0) ? 1 : 0);
        break forward_join_17;
    }
    if (!(spill3905_0)) {
        break forward_join_18;
    }
    }
    forwardValue3905_17_0 = 1;
    }
    forwardValue3905_19_0 = forwardValue3905_17_0;
    break forward_join_19;
    }
    forwardValue3905_19_0 = 0;
    }
    return ((forwardValue3905_19_0) != 0);
}


public boolean a(net.minecraft.enchantment.Enchantment p0) {
int forwardValue3904_14_0;
    int forwardValue3904_20_0;
    int forwardValue3904_22_0;
    boolean spill3904_0;
    long life2_3;
    int life4_5;
    forward_join_22: {
    forward_join_21: {
    forward_join_20: {
    forward_join_14: {
    life2_3 = (moom.rS.G ^ 37212552154632L);
    life4_5 = ((moom.rV.c()) ? 1 : 0);
    spill3904_0 = super.a(((net.minecraft.enchantment.Enchantment)(p0)));
    if (!((life4_5 == 0))) {
        forwardValue3904_14_0 = ((spill3904_0) ? 1 : 0);
        break forward_join_14;
    }
    if (!(spill3904_0)) {
        break forward_join_21;
    }
    forwardValue3904_14_0 = ((net.minecraft.enchantment.Enchantment)(p0)).C;
    }
    if (!((life4_5 == 0))) {
        forwardValue3904_20_0 = forwardValue3904_14_0;
        break forward_join_20;
    }
    if (!((forwardValue3904_14_0 != ((net.minecraft.enchantment.Enchantment)(moom.rS.v)).C))) {
        break forward_join_21;
    }
    forwardValue3904_20_0 = 1;
    }
    forwardValue3904_22_0 = forwardValue3904_20_0;
    break forward_join_22;
    }
    forwardValue3904_22_0 = 0;
    }
    return ((forwardValue3904_22_0) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8932_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ead3c349e325_originalDynamicSite1620_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5c51e7cdc795_originalDynamicSite1621_1(int a0, long a1) throws E;
}
