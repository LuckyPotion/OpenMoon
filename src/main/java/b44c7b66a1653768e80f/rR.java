package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class rR extends net.minecraft.enchantment.Enchantment {

private static final long G;

private static final long[] H;

private static final java.lang.Integer[] I;

private static final java.util.Map J;

public rR(int p0, moom.DD p1, int p2) {
super(p0, p1, p2, net.minecraft.enchantment.EnumEnchantmentType.ARMOR_TORSO);
    (this).b("thorns");
}


static {
G = ((long)(((moom._a)(moom._c.a(((long)(7329062562300926953L)), ((long)(987770736564389852L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(213267815242912L)))));
    J = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.rR.G ^ 32013104064126L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1500_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1500_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1500_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1500_14 = new byte[8];
    (__sourceSpill1500_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1500_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1500_16 = __sourceSpill1500_14;
    ((javax.crypto.Cipher)(__sourceSpill1500_11)).init(((int)(__sourceSpill1500_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1500_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1500_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[4];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "ËÈ\020WÌ»\000°ë¨÷\007r"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1500_25 = local6_life21;
        int __sourceSpill1500_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1500_25)).substring(((int)(__sourceSpill1500_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1500_30 = local8_life19;
        int __sourceSpill1500_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1500_33 = new byte[8];
        (__sourceSpill1500_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1500_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1500_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1500_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1500_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1500_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1500_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1500_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1500_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1500_34)).doFinal(((byte[])(__sourceSpill1500_33)));
        (__sourceSpill1500_30)[__sourceSpill1500_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "bþM0\nh\017£½%yÙn»"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1500_38 = local6_life21;
        int __sourceSpill1500_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1500_38)).substring(((int)(__sourceSpill1500_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1500_43 = local8_life19;
        int __sourceSpill1500_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1500_46 = new byte[8];
        (__sourceSpill1500_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1500_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1500_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1500_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1500_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1500_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1500_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1500_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1500_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1500_47)).doFinal(((byte[])(__sourceSpill1500_46)));
        (__sourceSpill1500_43)[__sourceSpill1500_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    H = ((long[])(local8_life19));
    I = ((java.lang.Integer[])(new java.lang.Integer[4]));
}


public void b(net.minecraft.entity.EntityLivingBase p0, net.minecraft.entity.Entity p1, int p2) {
net.minecraft.entity.Entity forwardValue3903_31_0;
    net.minecraft.item.ItemStack forwardValue3903_40_0;
    net.minecraft.item.ItemStack forwardValue3903_50_0;
    boolean spill3903_0;
    net.minecraft.entity.Entity spill3903_1;
    net.minecraft.item.ItemStack spill3903_2;
    net.minecraft.item.ItemStack spill3903_3;
    long life4_3;
    java.util.Random life7_7;
    int life6_8;
    net.minecraft.item.ItemStack life8_12;
    forward_join_53: {
    forward_join_50: {
    forward_join_45: {
    forward_join_40: {
    forward_join_35: {
    forward_join_31: {
    life4_3 = (moom.rR.G ^ 62335911442188L);
    spill3903_0 = moom.rV.c();
    life7_7 = ((net.minecraft.entity.EntityLivingBase)(p0)).a__Random();
    life6_8 = ((spill3903_0) ? 1 : 0);
    life8_12 = moom.rV.a(((net.minecraft.enchantment.Enchantment)(net.minecraft.enchantment.Enchantment.k)), ((net.minecraft.entity.EntityLivingBase)(p0)));
    if (!(moom.rR.a__Boolean(((int)(p2)), ((java.util.Random)(life7_7))))) {
        break forward_join_45;
    }
    spill3903_1 = p1;
    if (!((life6_8 == 0))) {
        forwardValue3903_31_0 = spill3903_1;
        break forward_join_31;
    }
    if (!((spill3903_1 != null))) {
        break forward_join_35;
    }
    ((net.minecraft.entity.Entity)(p1)).a__Boolean(((net.minecraft.util.DamageSource)(net.minecraft.util.DamageSource.a(((net.minecraft.entity.Entity)(p0))))), ((float)(((float) moom.rR.a(((int)(p2)), ((java.util.Random)(life7_7)))))));
    forwardValue3903_31_0 = p1;
    }
    ((net.minecraft.entity.Entity)(forwardValue3903_31_0)).a(((java.lang.String)("damage.thorns")), ((float)(0x1.0p-1f)), ((float)(0x1.0p0f)));
    }
    spill3903_2 = life8_12;
    if (!((life6_8 == 0))) {
        forwardValue3903_40_0 = spill3903_2;
        break forward_join_40;
    }
    if (!((spill3903_2 != null))) {
        break forward_join_53;
    }
    forwardValue3903_40_0 = life8_12;
    }
    ((net.minecraft.item.ItemStack)(forwardValue3903_40_0)).a(((int)(3)), ((net.minecraft.entity.EntityLivingBase)(p0)));
    if (!((life6_8 != 0))) {
        break forward_join_53;
    }
    }
    spill3903_3 = life8_12;
    if (!((life6_8 == 0))) {
        forwardValue3903_50_0 = spill3903_3;
        break forward_join_50;
    }
    if (!((spill3903_3 != null))) {
        break forward_join_53;
    }
    forwardValue3903_50_0 = life8_12;
    }
    ((net.minecraft.item.ItemStack)(forwardValue3903_50_0)).a(((int)(1)), ((net.minecraft.entity.EntityLivingBase)(p0)));
    }
    return;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8928_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/rR"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.rR.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x1B53;
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
                throw new RuntimeException("moom/rR", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            rR.I[n2] = n3;
        }
        return I[n2];
}


public int b(int p0) {
long local2 = (moom.rR.G ^ 10533386900787L);
    return (super.a(((int)(p0))) + __sourceIntrinsic_ead3c349e325_originalDynamicSite1618_2(23077, (1751509945906012035L ^ local2)));
}


public int c() {
return 3;
}


public int a(int p0) {
long local2 = (moom.rR.G ^ 49423873821232L);
    return (__sourceIntrinsic_5c51e7cdc795_originalDynamicSite1619_1(24597, (3549182212247337649L ^ local2)) + (__sourceIntrinsic_5c51e7cdc795_originalDynamicSite1619_2(8713, (5883385398933387439L ^ local2)) * (p0 - 1)));
}


public static boolean a__Boolean(int p0, java.util.Random p1) {
int forwardValue3902_17_0;
    int forwardValue3902_21_0;
    int forwardValue3902_23_0;
    int spill3902_0;
    long life2_3;
    int life4_5;
    forward_join_23: {
    forward_join_22: {
    forward_join_21: {
    forward_join_17: {
    life2_3 = (moom.rR.G ^ 135182335803741L);
    life4_5 = ((moom.rV.b()) ? 1 : 0);
    spill3902_0 = p0;
    if (!((life4_5 != 0))) {
        forwardValue3902_17_0 = spill3902_0;
        break forward_join_17;
    }
    if (!((spill3902_0 > 0))) {
        break forward_join_22;
    }
    forwardValue3902_17_0 = recovery.source.CarrierOps.fcmpg(((float)(((java.util.Random)(p1)).nextFloat())), ((float)((0x1.333334p-3f * ((float) p0)))));
    }
    if (!((life4_5 != 0))) {
        forwardValue3902_21_0 = forwardValue3902_17_0;
        break forward_join_21;
    }
    if (!((forwardValue3902_17_0 < 0))) {
        break forward_join_22;
    }
    forwardValue3902_21_0 = 1;
    }
    forwardValue3902_23_0 = forwardValue3902_21_0;
    break forward_join_23;
    }
    forwardValue3902_23_0 = 0;
    }
    return ((forwardValue3902_23_0) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public static int a(int p0, java.util.Random p1) {
int forwardValue3900_27_0;
    int forwardValue3900_27_1;
    int forwardValue3900_28_0;
    int spill3900_0;
    int spill3900_1;
    long life2_3;
    int life4_5;
    forward_join_28: {
    forward_join_27: {
    forward_join_23: {
    life2_3 = (moom.rR.G ^ 94956030020730L);
    life4_5 = ((moom.rV.c()) ? 1 : 0);
    spill3900_0 = p0;
    spill3900_1 = __sourceIntrinsic_981db85b1805_invokedynamic3900_3(10026, (4525864310423485383L ^ life2_3));
    if (!((life4_5 == 0))) {
        forwardValue3900_27_0 = spill3900_0;
        forwardValue3900_27_1 = spill3900_1;
        break forward_join_27;
    }
    if (!((spill3900_0 > spill3900_1))) {
        break forward_join_23;
    }
    forwardValue3900_28_0 = (p0 - __sourceIntrinsic_981db85b1805_invokedynamic3900_4(24597, (3549189196803620091L ^ life2_3)));
    break forward_join_28;
    }
    forwardValue3900_27_0 = 1;
    forwardValue3900_27_1 = ((java.util.Random)(p1)).nextInt(((int)(4)));
    }
    forwardValue3900_28_0 = (forwardValue3900_27_0 + forwardValue3900_27_1);
    }
    return forwardValue3900_28_0;
}


public boolean a(net.minecraft.item.ItemStack p0) {
int forwardValue3901_19_0;
    int forwardValue3901_21_0;
    int spill3901_0;
    boolean spill3901_1;
    long life2_3;
    int life4_5;
    forward_join_21: {
    forward_join_20: {
    forward_join_19: {
    forward_join_18: {
    life2_3 = (moom.rR.G ^ 49899478328718L);
    life4_5 = ((moom.rV.c()) ? 1 : 0);
    spill3901_0 = ((((net.minecraft.item.ItemStack)(p0)).a__wQ() instanceof net.minecraft.item.ItemArmor) ? 1 : 0);
    if (!((life4_5 == 0))) {
        forwardValue3901_19_0 = spill3901_0;
        break forward_join_19;
    }
    if (!((spill3901_0 == 0))) {
        break forward_join_18;
    }
    spill3901_1 = super.a(((net.minecraft.item.ItemStack)(p0)));
    if (!((life4_5 == 0))) {
        forwardValue3901_19_0 = ((spill3901_1) ? 1 : 0);
        break forward_join_19;
    }
    if (!(spill3901_1)) {
        break forward_join_20;
    }
    }
    forwardValue3901_19_0 = 1;
    }
    forwardValue3901_21_0 = forwardValue3901_19_0;
    break forward_join_21;
    }
    forwardValue3901_21_0 = 0;
    }
    return ((forwardValue3901_21_0) != 0);
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8928_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ead3c349e325_originalDynamicSite1618_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5c51e7cdc795_originalDynamicSite1619_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5c51e7cdc795_originalDynamicSite1619_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_981db85b1805_invokedynamic3900_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_981db85b1805_invokedynamic3900_4(int a0, long a1) throws E;
}
