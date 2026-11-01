package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class LL implements moom.LJ {

private static int[] b;

private static final long a;

private static final java.lang.String d;

private static final long[] h;

private static final java.lang.Integer[] i;

private static final java.util.Map j;

public LL() {
super();
}


static {
a = ((long)(((moom._a)(moom._c.a(((long)(6660739264161425069L)), ((long)(3061511506812677425L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(242673867033093L)))));
    java.lang.Object __sourceSpill670_6 = null;
    long local11_life7 = (moom.LL.a ^ 55229747493737L);
    moom.LL.b(((int[])(__sourceSpill670_6)));
    javax.crypto.Cipher local13_life10;
    javax.crypto.Cipher __sourceSpill670_12 = (local13_life10 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill670_13 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill670_14 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill670_15 = new byte[8];
    (__sourceSpill670_15)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life16 = 1;
    while ((local14_life16 < 8)) {
        (__sourceSpill670_15)[local14_life16] = ((byte) ((int) ((local11_life7 << (local14_life16 * 8)) >>> 56)));
        local14_life16 += 1;
    }
    byte[] __sourcePreallocation670_17 = __sourceSpill670_15;
    ((javax.crypto.Cipher)(__sourceSpill670_12)).init(((int)(__sourceSpill670_13)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill670_14)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation670_17)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    byte[] __sourceSpill670_21 = ((java.lang.String)("æ£lã\032æÀ»-\021¯ÛOUk")).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __sourceSpill670_22 = local13_life10;
    byte[] local15_life24 = ((javax.crypto.Cipher)(__sourceSpill670_22)).doFinal(((byte[])(__sourceSpill670_21)));
    d = ((java.lang.String)(((java.lang.String)(moom.LL.a(((byte[])(local15_life24))))).intern()));
    j = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life30;
    javax.crypto.Cipher __sourceSpill670_32 = (local0_life30 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill670_33 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill670_34 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill670_35 = new byte[8];
    (__sourceSpill670_35)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life36 = 1;
    while ((local1_life36 < 8)) {
        (__sourceSpill670_35)[local1_life36] = ((byte) ((int) ((local11_life7 << (local1_life36 * 8)) >>> 56)));
        local1_life36 += 1;
    }
    byte[] __sourcePreallocation670_37 = __sourceSpill670_35;
    ((javax.crypto.Cipher)(__sourceSpill670_32)).init(((int)(__sourceSpill670_33)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill670_34)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation670_37)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life40 = new long[8];
    int local3_life41 = 0;
    java.lang.String local4_life42;
    int local5_life44 = ((java.lang.String)((local4_life42 = "kO=\001\022@;\022u{°#\035ç\fö\001e\004(-\024îmÿ+\026\001\rÒ \0258àm«1íFV"))).length();
    int local2_life45 = 0;
    do {
        java.lang.String __sourceSpill670_46 = local4_life42;
        int __sourceSpill670_47 = local2_life45;
        local2_life45 += 8;
        byte[] local7_life50 = ((java.lang.String)(((java.lang.String)(__sourceSpill670_46)).substring(((int)(__sourceSpill670_47)), ((int)(local2_life45))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill670_51 = local6_life40;
        int __sourceSpill670_52 = local3_life41;
        local3_life41 += 1;
        long local8_life53 = (((((((((((long) (local7_life50)[0]) & 255L) << 56) | ((((long) (local7_life50)[1]) & 255L) << 48)) | ((((long) (local7_life50)[2]) & 255L) << 40)) | ((((long) (local7_life50)[3]) & 255L) << 32)) | ((((long) (local7_life50)[4]) & 255L) << 24)) | ((((long) (local7_life50)[5]) & 255L) << 16)) | ((((long) (local7_life50)[6]) & 255L) << 8)) | (((long) (local7_life50)[7]) & 255L));
        byte[] __sourceSpill670_54 = new byte[8];
        (__sourceSpill670_54)[0] = ((byte) ((int) (local8_life53 >>> 56)));
        (__sourceSpill670_54)[1] = ((byte) ((int) (local8_life53 >>> 48)));
        (__sourceSpill670_54)[2] = ((byte) ((int) (local8_life53 >>> 40)));
        (__sourceSpill670_54)[3] = ((byte) ((int) (local8_life53 >>> 32)));
        (__sourceSpill670_54)[4] = ((byte) ((int) (local8_life53 >>> 24)));
        (__sourceSpill670_54)[5] = ((byte) ((int) (local8_life53 >>> 16)));
        (__sourceSpill670_54)[6] = ((byte) ((int) (local8_life53 >>> 8)));
        (__sourceSpill670_54)[7] = ((byte) ((int) local8_life53));
        javax.crypto.Cipher __sourceSpill670_55 = local0_life30;
        byte[] local10_life57 = ((javax.crypto.Cipher)(__sourceSpill670_55)).doFinal(((byte[])(__sourceSpill670_54)));
        (__sourceSpill670_51)[__sourceSpill670_52] = (((((((((((long) (local10_life57)[0]) & 255L) << 56) | ((((long) (local10_life57)[1]) & 255L) << 48)) | ((((long) (local10_life57)[2]) & 255L) << 40)) | ((((long) (local10_life57)[3]) & 255L) << 32)) | ((((long) (local10_life57)[4]) & 255L) << 24)) | ((((long) (local10_life57)[5]) & 255L) << 16)) | ((((long) (local10_life57)[6]) & 255L) << 8)) | (((long) (local10_life57)[7]) & 255L));
    } while ((!(local2_life45 >= local5_life44)));
    local5_life44 = ((java.lang.String)((local4_life42 = "j®\002Å=âKé\017ïë5Jd."))).length();
    local2_life45 = 0;
    do {
        java.lang.String __sourceSpill670_59 = local4_life42;
        int __sourceSpill670_60 = local2_life45;
        local2_life45 += 8;
        byte[] local7_life63 = ((java.lang.String)(((java.lang.String)(__sourceSpill670_59)).substring(((int)(__sourceSpill670_60)), ((int)(local2_life45))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill670_64 = local6_life40;
        int __sourceSpill670_65 = local3_life41;
        local3_life41 += 1;
        long local8_life66 = (((((((((((long) (local7_life63)[0]) & 255L) << 56) | ((((long) (local7_life63)[1]) & 255L) << 48)) | ((((long) (local7_life63)[2]) & 255L) << 40)) | ((((long) (local7_life63)[3]) & 255L) << 32)) | ((((long) (local7_life63)[4]) & 255L) << 24)) | ((((long) (local7_life63)[5]) & 255L) << 16)) | ((((long) (local7_life63)[6]) & 255L) << 8)) | (((long) (local7_life63)[7]) & 255L));
        byte[] __sourceSpill670_67 = new byte[8];
        (__sourceSpill670_67)[0] = ((byte) ((int) (local8_life66 >>> 56)));
        (__sourceSpill670_67)[1] = ((byte) ((int) (local8_life66 >>> 48)));
        (__sourceSpill670_67)[2] = ((byte) ((int) (local8_life66 >>> 40)));
        (__sourceSpill670_67)[3] = ((byte) ((int) (local8_life66 >>> 32)));
        (__sourceSpill670_67)[4] = ((byte) ((int) (local8_life66 >>> 24)));
        (__sourceSpill670_67)[5] = ((byte) ((int) (local8_life66 >>> 16)));
        (__sourceSpill670_67)[6] = ((byte) ((int) (local8_life66 >>> 8)));
        (__sourceSpill670_67)[7] = ((byte) ((int) local8_life66));
        javax.crypto.Cipher __sourceSpill670_68 = local0_life30;
        byte[] local10_life70 = ((javax.crypto.Cipher)(__sourceSpill670_68)).doFinal(((byte[])(__sourceSpill670_67)));
        (__sourceSpill670_64)[__sourceSpill670_65] = (((((((((((long) (local10_life70)[0]) & 255L) << 56) | ((((long) (local10_life70)[1]) & 255L) << 48)) | ((((long) (local10_life70)[2]) & 255L) << 40)) | ((((long) (local10_life70)[3]) & 255L) << 32)) | ((((long) (local10_life70)[4]) & 255L) << 24)) | ((((long) (local10_life70)[5]) & 255L) << 16)) | ((((long) (local10_life70)[6]) & 255L) << 8)) | (((long) (local10_life70)[7]) & 255L));
    } while ((!(local2_life45 >= local5_life44)));
    h = ((long[])(local6_life40));
    i = ((java.lang.Integer[])(new java.lang.Integer[8]));
}


public static int[] b() {
return moom.LL.b;
}


private static int b(int p0, long p1) {
int n4 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x3D3B;
        if (i[n4] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = h[n4];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])j.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    j.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/LL", exception);
            }
            int n8 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            LL.i[n4] = n8;
        }
        return i[n4];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.LL.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral5882_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/LL"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public static void b(int[] p0) {
moom.LL.b = ((int[])(p0));
    return;
}


public java.lang.String[] a(moom.gc p0, int p1) {
moom.gc forwardValue2563_12_0;
    moom.gc spill2563_0;
    long life3_3;
    int[] life5_5;
    moom.LH life6_19;
    net.minecraft.client.settings.GameSettings$Options life7_28;
    forward_join_18: {
    forward_join_16: {
    forward_join_12: {
    life3_3 = (moom.LL.a ^ 109942561743035L);
    life5_5 = moom.LL.b();
    spill2563_0 = p0;
    if (!((life5_5 == null))) {
        forwardValue2563_12_0 = spill2563_0;
        break forward_join_12;
    }
    if (!((((spill2563_0 instanceof moom.LH) ? 1 : 0) != 0))) {
        break forward_join_16;
    }
    forwardValue2563_12_0 = p0;
    }
    life6_19 = ((moom.LH)(forwardValue2563_12_0));
    if (!((life5_5 != null))) {
        break forward_join_18;
    }
    }
    return null;
    }
    life7_28 = __sourceExactCall_24dae4a9ae5d86(((moom.LH)(life6_19)));
    return moom.LL.a(((java.lang.String)(((net.minecraft.client.settings.GameSettings$Options)(life7_28)).a__String())));
}


public boolean a() {
return ((0) != 0);
}


public java.awt.Rectangle a(net.minecraft.client.gui.GuiScreen p0, int p1, int p2) {
int forwardValue2564_56_0;
    int forwardValue2564_56_1;
    int[] spill2564_0;
    int spill2564_1;
    int spill2564_2;
    long life4_3;
    int life7_14;
    int life8_30;
    int[] life6_31;
    int life9_60;
    int life10_74;
    forward_join_56: {
    forward_join_44: {
    life4_3 = (moom.LL.a ^ 107311054035518L);
    life7_14 = ((((net.minecraft.client.gui.GuiScreen)(p0)).k / 2) - __sourceIntrinsic_ceb6eec2aa6a_invokedynamic2564_2(30236, (6825829630654655612L ^ life4_3)));
    spill2564_0 = moom.LL.b();
    life8_30 = ((((net.minecraft.client.gui.GuiScreen)(p0)).l / __sourceIntrinsic_ceb6eec2aa6a_invokedynamic2564_5(22921, (7048352872732787694L ^ life4_3))) - __sourceIntrinsic_ceb6eec2aa6a_invokedynamic2564_6(9051, (2574008950676683064L ^ life4_3)));
    life6_31 = spill2564_0;
    spill2564_1 = p2;
    spill2564_2 = (life8_30 + __sourceIntrinsic_ceb6eec2aa6a_invokedynamic2564_7(6062, (1055614108474035656L ^ life4_3)));
    if (!((life6_31 == null))) {
        forwardValue2564_56_0 = spill2564_1;
        forwardValue2564_56_1 = spill2564_2;
        break forward_join_56;
    }
    if (!((spill2564_1 <= spill2564_2))) {
        break forward_join_44;
    }
    life8_30 += 105;
    }
    forwardValue2564_56_0 = (life7_14 + __sourceIntrinsic_ceb6eec2aa6a_invokedynamic2564_8(24588, (5196144236561480296L ^ life4_3)));
    forwardValue2564_56_1 = __sourceIntrinsic_ceb6eec2aa6a_invokedynamic2564_9(24588, (5196144236561480296L ^ life4_3));
    }
    life9_60 = (forwardValue2564_56_0 + forwardValue2564_56_1);
    life10_74 = ((life8_30 + __sourceIntrinsic_ceb6eec2aa6a_invokedynamic2564_10(5214, (1879308516654108220L ^ life4_3))) + __sourceIntrinsic_ceb6eec2aa6a_invokedynamic2564_11(23663, (5265399205937710602L ^ life4_3)));
    return new java.awt.Rectangle(life7_14, life8_30, (life9_60 - life7_14), (life10_74 - life8_30));
}


private static java.lang.String a(byte[] p0) {
int life1_1;
    int life2_5;
    char[] life3_7;
    int life4_9;
    int life5_19;
    int life6_39;
    int life5_44;
    int life6_52;
    int life6_71;
    int life5_76;
    int life6_86;
    int life5_91;
    int life6_99;
    life1_1 = 0;
    life3_7 = new char[(life2_5 = (p0).length)];
    life4_9 = 0;
    loop_region_10: while ((life4_9 < life2_5)) {
        if (((life5_19 = (255 & (p0)[life4_9])) < 192)) {
        (life3_7)[(life1_1++)] = ((char) life5_19);
    } else {
        if ((life5_19 < 224)) {
        life6_39 = ((int)(((char) (((char) (life5_19 & 31)) << 6))));
        byte[] spill3015_0 = p0;
        life4_9 += 1;
        life5_44 = (spill3015_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill3015_1 = p0;
        life4_9 += 1;
        life5_76 = (spill3015_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill3015_2 = p0;
        life4_9 += 1;
        life5_91 = (spill3015_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public static java.lang.String[] a(java.lang.String p0) {
java.util.ArrayList lexicalValue918_54_0;
    int[] spill918_0;
    java.lang.String spill918_1;
    java.util.ArrayList spill918_2;
    long life1_3;
    java.util.ArrayList life4_7;
    int life5_10;
    int[] life3_11;
    java.lang.String life6_26;
    java.lang.String life7_30;
    lexical_join_54: {
    lexical_join_53: {
    lexical_join_46: {
    life1_3 = (moom.LL.a ^ 52579099558523L);
    life4_7 = new java.util.ArrayList();
    spill918_0 = moom.LL.b();
    life5_10 = 0;
    life3_11 = spill918_0;
    lexical_cycle_12: while (true) {
    lexical_join_44: {
    lexical_join_39: {
    if (!((life5_10 < __sourceIntrinsic_7e7263bfc9f4_invokedynamic918_2(28226, (3777383219628469350L ^ life1_3))))) {
        break lexical_join_46;
    }
    spill918_1 = p0;
    int __stackOp918_4_0 = (life5_10 + 1);
    java.lang.String __stackOp918_4_1 = moom.LL.d;
    life6_26 = __sourceIntrinsic_7e7263bfc9f4_invokedynamic918_5(spill918_1, __stackOp918_4_1, __stackOp918_4_0);
    life7_30 = moom.JM.a(((java.lang.String)(life6_26)), ((java.lang.String)(null)));
    if (!((life3_11 == null))) {
        break lexical_join_53;
    }
    if (!((life3_11 == null))) {
        break lexical_join_44;
    }
    if (!((life7_30 == null))) {
        break lexical_join_39;
    }
    if (!((life3_11 != null))) {
        break lexical_join_46;
    }
    }
    ((java.util.List)(life4_7)).add(((java.lang.Object)(life7_30)));
    life5_10 += 1;
    }
    if (!((life3_11 != null))) { continue lexical_cycle_12; }
    break lexical_cycle_12;
    }
    }
    spill918_2 = life4_7;
    if (!((life3_11 == null))) {
        lexicalValue918_54_0 = spill918_2;
        break lexical_join_54;
    }
    if (!((((java.util.List)(spill918_2)).size() == 0))) {
        break lexical_join_53;
    }
    return null;
    }
    lexicalValue918_54_0 = life4_7;
    }
    return ((java.lang.String[])(((java.util.List)(lexicalValue918_54_0)).toArray(((java.lang.Object[])(new java.lang.String[0])))));
}


private static native <E extends Throwable> int __sourceIntrinsic_7e7263bfc9f4_invokedynamic918_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_7e7263bfc9f4_invokedynamic918_5(java.lang.String a0, java.lang.String a1, int a2) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ceb6eec2aa6a_invokedynamic2564_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ceb6eec2aa6a_invokedynamic2564_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ceb6eec2aa6a_invokedynamic2564_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ceb6eec2aa6a_invokedynamic2564_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ceb6eec2aa6a_invokedynamic2564_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ceb6eec2aa6a_invokedynamic2564_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ceb6eec2aa6a_invokedynamic2564_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ceb6eec2aa6a_invokedynamic2564_11(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral5882_0() throws E;

private static native net.minecraft.client.settings.GameSettings$Options __sourceExactCall_24dae4a9ae5d86(moom.LH p0);
}
