package com.moon;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public abstract class gZ {

protected static final net.minecraft.client.Minecraft a;

private final com.moon.module.impl.ESP b;

private static final long o;

private static final long[] q;

private static final java.lang.Integer[] r;

private static final java.util.Map s;

public gZ(com.moon.module.impl.ESP p0) {
super();
    this.b = p0;
}


static {
o = ((long)(((moom._a)(moom._c.a(((long)(6051537244388584196L)), ((long)(2165311892360518041L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(145301761794452L)))));
    s = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.gZ.o ^ 118328728045882L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill116_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill116_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill116_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill116_14 = new byte[8];
    (__sourceSpill116_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill116_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation116_16 = __sourceSpill116_14;
    ((javax.crypto.Cipher)(__sourceSpill116_11)).init(((int)(__sourceSpill116_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill116_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation116_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "Æ>9Ï ¡Ô¨Ý¡\022 ^Ó"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill116_25 = local6_life21;
        int __sourceSpill116_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill116_25)).substring(((int)(__sourceSpill116_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill116_30 = local8_life19;
        int __sourceSpill116_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill116_33 = new byte[8];
        (__sourceSpill116_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill116_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill116_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill116_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill116_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill116_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill116_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill116_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill116_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill116_34)).doFinal(((byte[])(__sourceSpill116_33)));
        (__sourceSpill116_30)[__sourceSpill116_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    q = ((long[])(local8_life19));
    r = ((java.lang.Integer[])(new java.lang.Integer[2]));
    a = ((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM()));
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public abstract void b__Void();

public abstract void c__Void();

private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.gZ.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int n6 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x39A6;
        if (r[n6] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = q[n6];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])s.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    s.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/moon/gZ", exception);
            }
            int n8 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            gZ.r[n6] = n8;
        }
        return r[n6];
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral1272_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/gZ"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public abstract boolean a__Boolean();

public boolean a(net.minecraft.entity.Entity p0) {
int forwardValue266_23_0;
    int forwardValue266_25_0;
    net.minecraft.entity.Entity forwardValue266_27_0;
    net.minecraft.entity.Entity forwardValue266_34_0;
    int forwardValue266_54_0;
    int forwardValue266_57_0;
    int forwardValue266_70_0;
    int forwardValue266_83_0;
    int forwardValue266_99_0;
    int forwardValue266_106_0;
    int forwardValue266_112_0;
    int forwardValue266_116_0;
    int forwardValue266_118_0;
    int spill266_0;
    net.minecraft.entity.Entity spill266_1;
    int spill266_2;
    int spill266_3;
    int spill266_4;
    boolean spill266_5;
    boolean spill266_6;
    int spill266_7;
    int spill266_8;
    long life2_3;
    com.moon.setting.MultiSelectSetting life5_8;
    int life4_9;
    forward_join_118: {
    forward_join_117: {
    forward_join_116: {
    forward_join_112: {
    forward_join_106: {
    forward_join_104: {
    forward_join_99: {
    forward_join_96: {
    forward_join_83: {
    forward_join_81: {
    forward_join_70: {
    forward_join_68: {
    forward_join_57: {
    forward_join_55: {
    forward_join_54: {
    forward_join_53: {
    forward_join_34: {
    forward_join_33: {
    forward_join_27: {
    forward_join_26: {
    forward_join_25: {
    forward_join_24: {
    forward_join_23: {
    life2_3 = (com.moon.gZ.o ^ 92143478523735L);
    spill266_0 = __sourceExactCall_ea2573d3bcb2e3();
    life5_8 = ((com.moon.module.impl.ESP)(this.a())).a__k4();
    life4_9 = spill266_0;
    spill266_1 = p0;
    if (!((life4_9 != 0))) {
        forwardValue266_27_0 = spill266_1;
        break forward_join_27;
    }
    if (!((spill266_1 == ((net.minecraft.client.Minecraft)(com.moon.gZ.a)).K))) {
        break forward_join_26;
    }
    spill266_2 = ((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(com.moon.gZ.a)).W)).aP;
    if (!((life4_9 != 0))) {
        forwardValue266_23_0 = spill266_2;
        break forward_join_23;
    }
    if (!((spill266_2 != 0))) {
        break forward_join_24;
    }
    forwardValue266_23_0 = 1;
    }
    forwardValue266_25_0 = forwardValue266_23_0;
    break forward_join_25;
    }
    forwardValue266_25_0 = 0;
    }
    return ((forwardValue266_25_0) != 0);
    }
    forwardValue266_27_0 = p0;
    }
    if (!((life4_9 != 0))) {
        forwardValue266_34_0 = forwardValue266_27_0;
        break forward_join_34;
    }
    if (!((((net.minecraft.entity.Entity)(forwardValue266_27_0)).a__Vector4f() == null))) {
        break forward_join_33;
    }
    return ((0) != 0);
    }
    forwardValue266_34_0 = p0;
    }
    spill266_3 = ((net.minecraft.entity.Entity)(forwardValue266_34_0)).e__Int();
    if (!((life4_9 != 0))) {
        forwardValue266_54_0 = spill266_3;
        break forward_join_54;
    }
    if (!((spill266_3 != __sourceIntrinsic_376c3b2efa03_invokedynamic266_13(8484, (4584924766194162996L ^ life2_3))))) {
        break forward_join_53;
    }
    spill266_4 = ((net.minecraft.entity.Entity)(p0)).e__Int();
    if (!((life4_9 != 0))) {
        forwardValue266_57_0 = spill266_4;
        break forward_join_57;
    }
    if (!((spill266_4 == __sourceIntrinsic_376c3b2efa03_invokedynamic266_15(6722, (6510744499201664595L ^ life2_3))))) {
        break forward_join_55;
    }
    }
    forwardValue266_54_0 = 0;
    }
    return ((forwardValue266_54_0) != 0);
    }
    forwardValue266_57_0 = ((((net.minecraft.entity.Entity)(p0)).v__Boolean()) ? 1 : 0);
    }
    if (!((life4_9 != 0))) {
        forwardValue266_70_0 = forwardValue266_57_0;
        break forward_join_70;
    }
    if (!((forwardValue266_57_0 != 0))) {
        break forward_join_68;
    }
    spill266_5 = ((com.moon.setting.MultiSelectSetting)(life5_8)).isSelected(((java.lang.Enum)(com.moon.ESPTargetType.INVISIBLE)));
    if (!((life4_9 != 0))) {
        forwardValue266_70_0 = ((spill266_5) ? 1 : 0);
        break forward_join_70;
    }
    if (!((!spill266_5))) {
        break forward_join_68;
    }
    return ((0) != 0);
    }
    forwardValue266_70_0 = ((p0 instanceof moom.sZ) ? 1 : 0);
    }
    if (!((life4_9 != 0))) {
        forwardValue266_83_0 = forwardValue266_70_0;
        break forward_join_83;
    }
    if (!((forwardValue266_70_0 != 0))) {
        break forward_join_81;
    }
    spill266_6 = ((com.moon.setting.MultiSelectSetting)(life5_8)).isSelected(((java.lang.Enum)(com.moon.ESPTargetType.MOB)));
    if (!((life4_9 != 0))) {
        forwardValue266_83_0 = ((spill266_6) ? 1 : 0);
        break forward_join_83;
    }
    if (!(spill266_6)) {
        break forward_join_81;
    }
    return ((1) != 0);
    }
    forwardValue266_83_0 = ((p0 instanceof moom.sK) ? 1 : 0);
    }
    if (!((life4_9 != 0))) {
        forwardValue266_99_0 = forwardValue266_83_0;
        break forward_join_99;
    }
    if (!((forwardValue266_83_0 == 0))) {
        break forward_join_96;
    }
    spill266_7 = ((p0 instanceof net.minecraft.entity.passive.EntityVillager) ? 1 : 0);
    if (!((life4_9 != 0))) {
        forwardValue266_99_0 = spill266_7;
        break forward_join_99;
    }
    if (!((spill266_7 == 0))) {
        break forward_join_96;
    }
    spill266_8 = ((p0 instanceof moom.tl) ? 1 : 0);
    if (!((life4_9 != 0))) {
        forwardValue266_106_0 = spill266_8;
        break forward_join_106;
    }
    if (!((spill266_8 != 0))) {
        break forward_join_104;
    }
    }
    forwardValue266_99_0 = ((((com.moon.setting.MultiSelectSetting)(life5_8)).isSelected(((java.lang.Enum)(com.moon.ESPTargetType.ANIMAL)))) ? 1 : 0);
    }
    if (!((life4_9 != 0))) {
        forwardValue266_106_0 = forwardValue266_99_0;
        break forward_join_106;
    }
    if (!((forwardValue266_99_0 != 0))) {
        break forward_join_104;
    }
    return ((1) != 0);
    }
    forwardValue266_106_0 = ((p0 instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0);
    }
    if (!((life4_9 != 0))) {
        forwardValue266_112_0 = forwardValue266_106_0;
        break forward_join_112;
    }
    if (!((forwardValue266_106_0 != 0))) {
        break forward_join_117;
    }
    forwardValue266_112_0 = ((((com.moon.setting.MultiSelectSetting)(life5_8)).isSelected(((java.lang.Enum)(com.moon.ESPTargetType.PLAYER)))) ? 1 : 0);
    }
    if (!((life4_9 != 0))) {
        forwardValue266_116_0 = forwardValue266_112_0;
        break forward_join_116;
    }
    if (!((forwardValue266_112_0 != 0))) {
        break forward_join_117;
    }
    forwardValue266_116_0 = 1;
    }
    forwardValue266_118_0 = forwardValue266_116_0;
    break forward_join_118;
    }
    forwardValue266_118_0 = 0;
    }
    return ((forwardValue266_118_0) != 0);
}


public com.moon.module.impl.ESP a() {
return this.b;
}


public abstract void a__Void();

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral1272_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_376c3b2efa03_invokedynamic266_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_376c3b2efa03_invokedynamic266_15(int a0, long a1) throws E;

private static native int __sourceExactCall_ea2573d3bcb2e3();
}
