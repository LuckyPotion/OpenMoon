package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
class vV implements net.minecraft.entity.passive.EntityVillager$ITradeList {

private static final long a;

private static final long[] b;

private static final java.lang.Integer[] c;

private static final java.util.Map d;

vV() {
super();
}


static {
javax.crypto.Cipher forestValue510_36_0;
    int forestValue510_36_1;
    javax.crypto.SecretKeyFactory forestValue510_36_2;
    byte[] forestValue510_36_3;
    javax.crypto.Cipher forestValue510_53_0;
    int forestValue510_53_1;
    javax.crypto.SecretKeyFactory forestValue510_53_2;
    byte[] forestValue510_53_3;
    javax.crypto.Cipher spill510_0;
    int spill510_1;
    javax.crypto.SecretKeyFactory spill510_2;
    byte[] spill510_3;
    byte[] spill510_4;
    java.lang.String spill510_5;
    int spill510_6;
    long[] spill510_7;
    int spill510_8;
    int spill510_9;
    long spill510_10;
    byte[] spill510_11;
    byte[] spill510_12;
    byte[] spill510_13;
    byte[] spill510_14;
    byte[] spill510_15;
    byte[] spill510_16;
    byte[] spill510_17;
    byte[] spill510_18;
    long spill510_19;
    int spill510_20;
    long life0_16;
    javax.crypto.Cipher life2_20;
    int life3_35;
    long[] life8_66;
    int life5_68;
    java.lang.String life6_71;
    int life7_73;
    int life4_75;
    byte[] life9_83;
    long life10_160;
    byte[] life12_228;
    forest_join_53: {
    a = ((long)(((moom._a)(moom._c.a(((long)(8380373034424184197L)), ((long)(1632468306609650245L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(225233547590072L)))));
    d = ((java.util.Map)(new java.util.HashMap(13)));
    life0_16 = (moom.vV.a ^ 99591108337452L);
    spill510_0 = (life2_20 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    spill510_1 = 2;
    spill510_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp510_9_0 = new byte[8];
    spill510_3 = __stackOp510_9_0;
    (__stackOp510_9_0)[0] = ((byte) ((int) (life0_16 >>> 56)));
    life3_35 = 1;
    forestValue510_36_0 = spill510_0;
    forestValue510_36_1 = spill510_1;
    forestValue510_36_2 = spill510_2;
    forestValue510_36_3 = spill510_3;
    forest_cycle_36: while (true) {
    if (!((life3_35 < 8))) {
        forestValue510_53_0 = forestValue510_36_0;
        forestValue510_53_1 = forestValue510_36_1;
        forestValue510_53_2 = forestValue510_36_2;
        forestValue510_53_3 = forestValue510_36_3;
        break forest_join_53;
    }
    byte[] __stackOp510_10_0 = forestValue510_36_3;
    spill510_4 = __stackOp510_10_0;
    (__stackOp510_10_0)[life3_35] = ((byte) ((int) ((life0_16 << (life3_35 * 8)) >>> 56)));
    life3_35 += 1;
    forestValue510_36_3 = spill510_4;
    continue forest_cycle_36;
    }
    }
    ((javax.crypto.Cipher)(forestValue510_53_0)).init(((int)(forestValue510_53_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue510_53_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue510_53_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    life8_66 = new long[3];
    life5_68 = 0;
    life7_73 = ((java.lang.String)((life6_71 = "\177×\023â\021k;ÿI6³\tó0ÕVÝÃøºp"))).length();
    life4_75 = 0;
    forest_cycle_76: while (true) {
    spill510_5 = life6_71;
    spill510_6 = life4_75;
    life4_75 += 8;
    life9_83 = ((java.lang.String)(((java.lang.String)(spill510_5)).substring(((int)(spill510_6)), ((int)(life4_75))))).getBytes(((java.lang.String)("ISO-8859-1")));
    spill510_7 = life8_66;
    spill510_8 = (life5_68++);
    long __stackOp510_16_0 = (((((((((((long) (life9_83)[0]) & 255L) << 56) | ((((long) (life9_83)[1]) & 255L) << 48)) | ((((long) (life9_83)[2]) & 255L) << 40)) | ((((long) (life9_83)[3]) & 255L) << 32)) | ((((long) (life9_83)[4]) & 255L) << 24)) | ((((long) (life9_83)[5]) & 255L) << 16)) | ((((long) (life9_83)[6]) & 255L) << 8)) | (((long) (life9_83)[7]) & 255L));
    int __stackOp510_16_1 = -1;
    spill510_9 = __stackOp510_16_1;
    spill510_10 = __stackOp510_16_0;
    recovery.source.CarrierOps.discard(__stackOp510_16_1);
    life10_160 = spill510_10;
    byte[] __stackOp510_18_0 = new byte[8];
    spill510_11 = __stackOp510_18_0;
    (__stackOp510_18_0)[0] = ((byte) ((int) (life10_160 >>> 56)));
    byte[] __stackOp510_19_0 = spill510_11;
    spill510_12 = __stackOp510_19_0;
    (__stackOp510_19_0)[1] = ((byte) ((int) (life10_160 >>> 48)));
    byte[] __stackOp510_20_0 = spill510_12;
    spill510_13 = __stackOp510_20_0;
    (__stackOp510_20_0)[2] = ((byte) ((int) (life10_160 >>> 40)));
    byte[] __stackOp510_21_0 = spill510_13;
    spill510_14 = __stackOp510_21_0;
    (__stackOp510_21_0)[3] = ((byte) ((int) (life10_160 >>> 32)));
    byte[] __stackOp510_22_0 = spill510_14;
    spill510_15 = __stackOp510_22_0;
    (__stackOp510_22_0)[4] = ((byte) ((int) (life10_160 >>> 24)));
    byte[] __stackOp510_23_0 = spill510_15;
    spill510_16 = __stackOp510_23_0;
    (__stackOp510_23_0)[5] = ((byte) ((int) (life10_160 >>> 16)));
    byte[] __stackOp510_24_0 = spill510_16;
    spill510_17 = __stackOp510_24_0;
    (__stackOp510_24_0)[6] = ((byte) ((int) (life10_160 >>> 8)));
    byte[] __stackOp510_25_0 = spill510_17;
    spill510_18 = __stackOp510_25_0;
    (__stackOp510_25_0)[7] = ((byte) ((int) life10_160));
    byte[] __stackOp510_26_0 = spill510_18;
    javax.crypto.Cipher __stackOp510_26_1 = life2_20;
    life12_228 = ((javax.crypto.Cipher)(__stackOp510_26_1)).doFinal(((byte[])(__stackOp510_26_0)));
    int __stackOp510_28_0 = spill510_9;
    long __stackOp510_28_1 = (((((((((((long) (life12_228)[0]) & 255L) << 56) | ((((long) (life12_228)[1]) & 255L) << 48)) | ((((long) (life12_228)[2]) & 255L) << 40)) | ((((long) (life12_228)[3]) & 255L) << 32)) | ((((long) (life12_228)[4]) & 255L) << 24)) | ((((long) (life12_228)[5]) & 255L) << 16)) | ((((long) (life12_228)[6]) & 255L) << 8)) | (((long) (life12_228)[7]) & 255L));
    spill510_19 = __stackOp510_28_1;
    spill510_20 = __stackOp510_28_0;
    recovery.source.CarrierOps.discard(__stackOp510_28_1);
    recovery.source.CarrierOps.discard(spill510_20);
    (spill510_7)[spill510_8] = spill510_19;
    if (!((life4_75 >= life7_73))) {
        continue forest_cycle_76;
    }
    break forest_cycle_76;
    }
    b = ((long[])(life8_66));
    c = ((java.lang.Integer[])(new java.lang.Integer[3]));
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral9471_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/vV"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_b747b5d2b333ee(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x3E22;
        if (c[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = b[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])d.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    d.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/vV", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            vV.c[n2] = n3;
        }
        return c[n2];
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(moom.OF p0, java.util.Random p1) {
int forwardValue4304_76_0;
    int spill4304_0;
    int spill4304_1;
    long life3_3;
    net.minecraft.enchantment.Enchantment life6_11;
    int life7_18;
    net.minecraft.item.ItemStack life8_26;
    int life5_27;
    int life9_45;
    forward_join_76: {
    forward_join_61: {
    life3_3 = (moom.vV.a ^ 75661657783042L);
    spill4304_0 = moom.vR.b();
    life6_11 = (net.minecraft.enchantment.Enchantment.b)[((java.util.Random)(p1)).nextInt(((int)((net.minecraft.enchantment.Enchantment.b).length)))];
    life7_18 = moom.Dr.a(((java.util.Random)(p1)), ((int)(((net.minecraft.enchantment.Enchantment)(life6_11)).b())), ((int)(((net.minecraft.enchantment.Enchantment)(life6_11)).c())));
    life8_26 = ((moom.xg)(net.minecraft.init.Items.bS)).a(((moom.D3)(new moom.D3(life6_11, life7_18))));
    life5_27 = spill4304_0;
    life9_45 = ((2 + ((java.util.Random)(p1)).nextInt(((int)((5 + (life7_18 * __sourceIntrinsic_6b2c9f75d723_invokedynamic4304_10(20822, (2077689399859357885L ^ life3_3)))))))) + (3 * life7_18));
    spill4304_1 = life9_45;
    if (!((life5_27 != 0))) {
        forwardValue4304_76_0 = spill4304_1;
        break forward_join_76;
    }
    if (!((spill4304_1 > __sourceIntrinsic_6b2c9f75d723_invokedynamic4304_12(18276, (2984990787792223885L ^ life3_3))))) {
        break forward_join_61;
    }
    life9_45 = __sourceIntrinsic_6b2c9f75d723_invokedynamic4304_13(17238, (8932635114593335998L ^ life3_3));
    }
    forwardValue4304_76_0 = ((((moom.OF)(p0)).add(((new net.minecraft.village.MerchantRecipe(new net.minecraft.item.ItemStack(net.minecraft.init.Items.aL), new net.minecraft.item.ItemStack(net.minecraft.init.Items.bD, life9_45), life8_26))))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue4304_76_0);
    return;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral9471_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6b2c9f75d723_invokedynamic4304_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6b2c9f75d723_invokedynamic4304_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6b2c9f75d723_invokedynamic4304_13(int a0, long a1) throws E;

private static native int __sourceExactCall_b747b5d2b333ee(int p0, long p1);
}
