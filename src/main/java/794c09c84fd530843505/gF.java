package com.moon;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class gF {

private net.minecraft.client.Minecraft a;

private int b;

private int c;

private static java.lang.String[] d;

private static long e;

private static long[] f;

private static java.lang.Integer[] g;

private static java.util.Map h;

public gF() { super(); }


private static void __sourceConstructorBody_61abea31bc698b6f(com.moon.gF receiver) throws Throwable {

long local1_life1 = (com.moon.gF.e ^ 54561699074295L);

    com.moon.gF.__sourceConstructorInit_61abea31bc698b6f_0(((com.moon.gF)(receiver)));

    java.lang.String[] __sourceSpill53_6 = com.moon.gF.b__ArrayString();

    ((com.moon.gF)(receiver)).a = ((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM()));

    java.lang.String[] local3_life7 = __sourceSpill53_6;

    ((com.moon.gF)(receiver)).b = ((int)(0));

    ((com.moon.gF)(receiver)).c = ((int)(0));

    if ((local3_life7 != null)) {

        net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[2])));

    }

    return;

}



static {
e = ((long)(((moom._a)(moom._c.a(((long)(5508059470496116489L)), ((long)(1389970991881545685L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(3688269057500L)))));
    h = ((java.util.Map)(new java.util.HashMap(13)));
    java.lang.Object __sourceSpill108_7 = null;
    long local0_life8 = (com.moon.gF.e ^ 53654946728974L);
    com.moon.gF.b(((java.lang.String[])(__sourceSpill108_7)));
    javax.crypto.Cipher local2_life11;
    javax.crypto.Cipher __sourceSpill108_13 = (local2_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill108_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill108_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill108_16 = new byte[8];
    (__sourceSpill108_16)[0] = ((byte) ((int) (local0_life8 >>> 56)));
    int local3_life17 = 1;
    while ((local3_life17 < 8)) {
        (__sourceSpill108_16)[local3_life17] = ((byte) ((int) ((local0_life8 << (local3_life17 * 8)) >>> 56)));
        local3_life17 += 1;
    }
    byte[] __sourcePreallocation108_18 = __sourceSpill108_16;
    ((javax.crypto.Cipher)(__sourceSpill108_13)).init(((int)(__sourceSpill108_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill108_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation108_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life21 = new long[2];
    int local5_life22 = 0;
    java.lang.String local6_life23;
    int local7_life25 = ((java.lang.String)((local6_life23 = "0l6Ô ¿XºÙî$Ò"))).length();
    int local4_life26 = 0;
    do {
        java.lang.String __sourceSpill108_27 = local6_life23;
        int __sourceSpill108_28 = local4_life26;
        local4_life26 += 8;
        byte[] local9_life31 = ((java.lang.String)(((java.lang.String)(__sourceSpill108_27)).substring(((int)(__sourceSpill108_28)), ((int)(local4_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill108_32 = local8_life21;
        int __sourceSpill108_33 = local5_life22;
        local5_life22 += 1;
        long local10_life34 = (((((((((((long) (local9_life31)[0]) & 255L) << 56) | ((((long) (local9_life31)[1]) & 255L) << 48)) | ((((long) (local9_life31)[2]) & 255L) << 40)) | ((((long) (local9_life31)[3]) & 255L) << 32)) | ((((long) (local9_life31)[4]) & 255L) << 24)) | ((((long) (local9_life31)[5]) & 255L) << 16)) | ((((long) (local9_life31)[6]) & 255L) << 8)) | (((long) (local9_life31)[7]) & 255L));
        byte[] __sourceSpill108_35 = new byte[8];
        (__sourceSpill108_35)[0] = ((byte) ((int) (local10_life34 >>> 56)));
        (__sourceSpill108_35)[1] = ((byte) ((int) (local10_life34 >>> 48)));
        (__sourceSpill108_35)[2] = ((byte) ((int) (local10_life34 >>> 40)));
        (__sourceSpill108_35)[3] = ((byte) ((int) (local10_life34 >>> 32)));
        (__sourceSpill108_35)[4] = ((byte) ((int) (local10_life34 >>> 24)));
        (__sourceSpill108_35)[5] = ((byte) ((int) (local10_life34 >>> 16)));
        (__sourceSpill108_35)[6] = ((byte) ((int) (local10_life34 >>> 8)));
        (__sourceSpill108_35)[7] = ((byte) ((int) local10_life34));
        javax.crypto.Cipher __sourceSpill108_36 = local2_life11;
        byte[] local12_life38 = ((javax.crypto.Cipher)(__sourceSpill108_36)).doFinal(((byte[])(__sourceSpill108_35)));
        (__sourceSpill108_32)[__sourceSpill108_33] = (((((((((((long) (local12_life38)[0]) & 255L) << 56) | ((((long) (local12_life38)[1]) & 255L) << 48)) | ((((long) (local12_life38)[2]) & 255L) << 40)) | ((((long) (local12_life38)[3]) & 255L) << 32)) | ((((long) (local12_life38)[4]) & 255L) << 24)) | ((((long) (local12_life38)[5]) & 255L) << 16)) | ((((long) (local12_life38)[6]) & 255L) << 8)) | (((long) (local12_life38)[7]) & 255L));
    } while ((!(local4_life26 >= local7_life25)));
    f = ((long[])(local8_life21));
    g = ((java.lang.Integer[])(new java.lang.Integer[2]));
}

private static native <E extends Throwable> void __sourceConstructorInit_61abea31bc698b6f_0(com.moon.gF a0) throws E;

public void b(int p0) {
return;
}


public static java.lang.String[] b__ArrayString() {
return com.moon.gF.d;
}


public boolean b__Boolean() {
int lexicalValue48_36_0;
    java.lang.String[] spill48_0;
    boolean spill48_1;
    long life1_3;
    int life4_6;
    java.lang.String[] life3_7;
    net.minecraft.item.ItemStack life5_21;
    lexical_join_36: {
    lexical_join_35: {
    life1_3 = (com.moon.gF.e ^ 131894760680940L);
    spill48_0 = com.moon.gF.b__ArrayString();
    life4_6 = 0;
    life3_7 = spill48_0;
    lexical_cycle_8: while (true) {
    lexical_join_33: {
    lexical_join_32: {
    if (!((life4_6 <= __sourceIntrinsic_74e88f4b4822_invokedynamic48_2(3722, (1204540924935130708L ^ life1_3))))) {
        break lexical_join_35;
    }
    life5_21 = ((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(this.a)).K)).bD)).a__xW(((int)(life4_6)));
    if (!((life3_7 == null))) {
        break lexical_join_33;
    }
    spill48_1 = ((com.moon.gF)(this)).a(((net.minecraft.item.ItemStack)(life5_21)));
    if (!((life3_7 == null))) {
        lexicalValue48_36_0 = ((spill48_1) ? 1 : 0);
        break lexical_join_36;
    }
    if (!(spill48_1)) {
        break lexical_join_32;
    }
    return ((1) != 0);
    }
    life4_6 += 1;
    }
    if (!((life3_7 != null))) { continue lexical_cycle_8; }
    break lexical_cycle_8;
    }
    }
    lexicalValue48_36_0 = 0;
    }
    return ((lexicalValue48_36_0) != 0);
}


public static void b(java.lang.String[] p0) {
d = ((java.lang.String[])(p0));
    return;
}


public void b() {
return;
}


public void c() {
return;
}


private static int a(int p0, long p1) {
int n6 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x764E;
        if (g[n6] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = f[n6];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])h.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    h.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/moon/gF", exception);
            }
            int n8 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            gF.g[n6] = n8;
        }
        return g[n6];
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral1223_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/gF"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.gF.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a__Void() {
return;
}


public boolean a__Boolean() {
int forwardValue245_12_0;
    int forwardValue245_14_0;
    int spill245_0;
    long life1_3;
    java.lang.String[] life3_5;
    forward_join_14: {
    forward_join_13: {
    forward_join_12: {
    life1_3 = (com.moon.gF.e ^ 100988879842450L);
    life3_5 = com.moon.gF.b__ArrayString();
    spill245_0 = this.c;
    if (!((life3_5 == null))) {
        forwardValue245_12_0 = spill245_0;
        break forward_join_12;
    }
    if (!((spill245_0 > 0))) {
        break forward_join_13;
    }
    forwardValue245_12_0 = 1;
    }
    forwardValue245_14_0 = forwardValue245_12_0;
    break forward_join_14;
    }
    forwardValue245_14_0 = 0;
    }
    return ((forwardValue245_14_0) != 0);
}


public void a(int p0) {
int forwardValue243_11_0;
    int spill243_0;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_23: {
    forward_join_11: {
    life2_3 = (com.moon.gF.e ^ 114884961174737L);
    life4_5 = com.moon.gF.b__ArrayString();
    spill243_0 = p0;
    if (!((life4_5 == null))) {
        forwardValue243_11_0 = spill243_0;
        break forward_join_11;
    }
    if (!((spill243_0 >= 0))) {
        break forward_join_23;
    }
    forwardValue243_11_0 = p0;
    }
    if (!((forwardValue243_11_0 <= __sourceIntrinsic_b4a3d886a4d9_invokedynamic243_2(3722, (1204567899092248425L ^ life2_3))))) {
        break forward_join_23;
    }
    ((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(this.a)).K)).bD)).c = ((int)(p0));
    }
    return;
}


public com.moon.gG a() {
com.moon.gG lexicalValue47_49_0;
    java.lang.String[] spill47_0;
    com.moon.gG spill47_1;
    long life1_3;
    com.moon.gG life4_8;
    int life5_10;
    java.lang.String[] life3_11;
    net.minecraft.item.ItemStack life6_25;
    lexical_join_49: {
    lexical_join_43: {
    life1_3 = (com.moon.gF.e ^ 5524910618914L);
    spill47_0 = com.moon.gF.b__ArrayString();
    life4_8 = new com.moon.gG();
    life5_10 = 0;
    life3_11 = spill47_0;
    lexical_cycle_12: while (true) {
    lexical_join_41: {
    lexical_join_40: {
    if (!((life5_10 <= __sourceIntrinsic_a575324315c8_invokedynamic47_2(1938, (1256058911229137795L ^ life1_3))))) {
        break lexical_join_43;
    }
    life6_25 = ((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(this.a)).K)).bD)).a__xW(((int)(life5_10)));
    if (!((life3_11 == null))) {
        break lexical_join_41;
    }
    if (!(((com.moon.gF)(this)).a(((net.minecraft.item.ItemStack)(life6_25))))) {
        break lexical_join_40;
    }
    ((com.moon.gG)(life4_8)).a(((net.minecraft.item.ItemStack)(life6_25)));
    ((com.moon.gG)(life4_8)).a(((int)(life5_10)));
    if (!((life3_11 != null))) {
        break lexical_join_43;
    }
    }
    life5_10 += 1;
    }
    if (!((life3_11 != null))) { continue lexical_cycle_12; }
    break lexical_cycle_12;
    }
    }
    spill47_1 = life4_8;
    if (!((net.minecraft.entity.Entity.b__ArrayString() != null))) {
        lexicalValue47_49_0 = spill47_1;
        break lexical_join_49;
    }
    com.moon.gF.b(((java.lang.String[])(new java.lang.String[5])));
    lexicalValue47_49_0 = spill47_1;
    }
    return lexicalValue47_49_0;
}


private boolean a(net.minecraft.item.ItemStack p0) {
net.minecraft.item.ItemStack forwardValue244_11_0;
    net.minecraft.item.Item forwardValue244_20_0;
    int forwardValue244_35_0;
    int forwardValue244_38_0;
    int forwardValue244_62_0;
    int forwardValue244_64_0;
    net.minecraft.item.ItemStack spill244_0;
    net.minecraft.item.Item spill244_1;
    int spill244_2;
    boolean spill244_3;
    int spill244_4;
    int spill244_5;
    int spill244_6;
    int spill244_7;
    long life2_3;
    java.lang.String[] life4_5;
    net.minecraft.block.Block life5_30;
    forward_join_64: {
    forward_join_63: {
    forward_join_62: {
    forward_join_61: {
    forward_join_38: {
    forward_join_36: {
    forward_join_35: {
    forward_join_34: {
    forward_join_20: {
    forward_join_18: {
    forward_join_16: {
    forward_join_11: {
    life2_3 = (com.moon.gF.e ^ 125375608875208L);
    life4_5 = com.moon.gF.b__ArrayString();
    spill244_0 = p0;
    if (!((life4_5 == null))) {
        forwardValue244_11_0 = spill244_0;
        break forward_join_11;
    }
    if (!((spill244_0 != null))) {
        break forward_join_16;
    }
    forwardValue244_11_0 = p0;
    }
    spill244_1 = ((net.minecraft.item.ItemStack)(forwardValue244_11_0)).a__wQ();
    if (!((life4_5 == null))) {
        forwardValue244_20_0 = spill244_1;
        break forward_join_20;
    }
    if (!((((spill244_1 instanceof moom.wU) ? 1 : 0) == 0))) {
        break forward_join_18;
    }
    }
    return ((0) != 0);
    }
    forwardValue244_20_0 = ((net.minecraft.item.ItemStack)(p0)).a__wQ();
    }
    life5_30 = ((moom.wU)(((moom.wU)(forwardValue244_20_0)))).a__ch();
    spill244_2 = ((life5_30 instanceof moom.cT) ? 1 : 0);
    if (!((life4_5 == null))) {
        forwardValue244_35_0 = spill244_2;
        break forward_join_35;
    }
    if (!((spill244_2 == 0))) {
        break forward_join_34;
    }
    spill244_3 = ((moom.fn)(((net.minecraft.block.Block)(life5_30)).a__fn())).d__Boolean();
    if (!((life4_5 == null))) {
        forwardValue244_38_0 = ((spill244_3) ? 1 : 0);
        break forward_join_38;
    }
    if (!((!spill244_3))) {
        break forward_join_36;
    }
    }
    forwardValue244_35_0 = 0;
    }
    return ((forwardValue244_35_0) != 0);
    }
    forwardValue244_38_0 = ((life5_30 instanceof moom.dx) ? 1 : 0);
    }
    if (!((life4_5 == null))) {
        forwardValue244_62_0 = forwardValue244_38_0;
        break forward_join_62;
    }
    if (!((forwardValue244_38_0 == 0))) {
        break forward_join_61;
    }
    spill244_4 = ((life5_30 instanceof moom.dw) ? 1 : 0);
    if (!((life4_5 == null))) {
        forwardValue244_62_0 = spill244_4;
        break forward_join_62;
    }
    if (!((spill244_4 == 0))) {
        break forward_join_61;
    }
    spill244_5 = ((life5_30 instanceof moom.eu) ? 1 : 0);
    if (!((life4_5 == null))) {
        forwardValue244_62_0 = spill244_5;
        break forward_join_62;
    }
    if (!((spill244_5 == 0))) {
        break forward_join_61;
    }
    spill244_6 = ((life5_30 instanceof moom.dv) ? 1 : 0);
    if (!((life4_5 == null))) {
        forwardValue244_62_0 = spill244_6;
        break forward_join_62;
    }
    if (!((spill244_6 == 0))) {
        break forward_join_61;
    }
    spill244_7 = ((life5_30 instanceof moom.ez) ? 1 : 0);
    if (!((life4_5 == null))) {
        forwardValue244_64_0 = spill244_7;
        break forward_join_64;
    }
    if (!((spill244_7 != 0))) {
        break forward_join_63;
    }
    }
    forwardValue244_62_0 = 0;
    }
    return ((forwardValue244_62_0) != 0);
    }
    forwardValue244_64_0 = 1;
    }
    return ((forwardValue244_64_0) != 0);
}


private static native <E extends Throwable> int __sourceIntrinsic_a575324315c8_invokedynamic47_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b4a3d886a4d9_invokedynamic243_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral1223_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e88f4b4822_invokedynamic48_2(int a0, long a1) throws E;
}
