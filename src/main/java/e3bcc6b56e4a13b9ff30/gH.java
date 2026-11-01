package moom;


public class gH extends moom.gF {

private static final long G;

private static final java.lang.String[] H;

private static final java.lang.String[] I;

private static final java.util.Map J;

public gH(moom.gF p0) {
super(net.minecraft.client.gui.GuiVideoSettings.a(p0));
}


static {
G = ((long)(((moom._a)(moom._c.a(((long)(-889881408778128891L)), ((long)(-8032136304911507860L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(179828109724589L)))));
    J = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.gH.G ^ 16581954766001L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill846_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill846_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill846_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill846_14 = new byte[8];
    (__sourceSpill846_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill846_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation846_16 = __sourceSpill846_14;
    ((javax.crypto.Cipher)(__sourceSpill846_11)).init(((int)(__sourceSpill846_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill846_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation846_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local9_life19 = new java.lang.String[2];
    int local7_life20 = 0;
    java.lang.String local6_life21;
    int local8_life23 = ((java.lang.String)((local6_life21 = "ñCÿ§ÓFÐBïÿ±QPSM\000CY·|pã\023Wk;ÔÞ!o£² vz?N°\fhE£>Ço~+G´\023;P\025jùdm\027ÇìX"))).length();
    int local5_life24 = 32;
    int local4_life25 = -1;
    while (true) {
        local4_life25 += 1;
        byte[] __sourceSpill846_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill846_29 = local2_life9;
        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill846_29)).doFinal(((byte[])(__sourceSpill846_28)));
        java.lang.String __sourceSpill846_34 = ((java.lang.String)(moom.gH.a(((byte[])(local10_life31))))).intern();
        java.lang.String[] __sourceSpill846_35 = local9_life19;
        int __sourceSpill846_36 = local7_life20;
        local7_life20 += 1;
        (__sourceSpill846_35)[__sourceSpill846_36] = __sourceSpill846_34;
        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }
        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));
    }
    H = ((java.lang.String[])(local9_life19));
    I = ((java.lang.String[])(new java.lang.String[2]));
}


public void f(java.lang.String p0) {
moom.gH forwardValue3561_22_0;
    java.lang.String forwardValue3561_22_1;
    moom.gH spill3561_0;
    java.lang.String spill3561_1;
    long life2_3;
    int[] life4_5;
    forward_join_23: {
    forward_join_22: {
    forward_join_20: {
    life2_3 = (moom.gH.G ^ 96827748877275L);
    life4_5 = moom.LL.b();
    spill3561_0 = this;
    spill3561_1 = p0;
    if (!((life4_5 == null))) {
        forwardValue3561_22_0 = spill3561_0;
        forwardValue3561_22_1 = spill3561_1;
        break forward_join_22;
    }
    if (!(((moom.gH)(spill3561_0)).a(((java.lang.String)(spill3561_1))))) {
        break forward_join_20;
    }
    ((moom.gB)(((net.minecraft.client.gui.GuiIngame)(((net.minecraft.client.Minecraft)(this.i)).T)).a__gB())).a(((java.lang.String)(p0)));
    if (!((life4_5 != null))) {
        break forward_join_23;
    }
    }
    forwardValue3561_22_0 = this;
    forwardValue3561_22_1 = p0;
    }
    __sourceIntrinsic_9c17daea9624_call3561_7(forwardValue3561_22_0, forwardValue3561_22_1);
    }
    return;
}


private static java.lang.String a(int p0, long p1) {
int life5_8;
    java.lang.Long life3_16;
    java.lang.Object[] life4_21;
    byte[] life6_60;
    int life7_70;
    javax.crypto.spec.DESKeySpec life7_92;
    javax.crypto.SecretKey life8_99;
    byte[] life9_116;
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 25305);
    if (((moom.gH.I)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.gH.J)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.gH.J)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/gH", life9_51);
    }
        life6_60 = new byte[8];
        (life6_60)[0] = ((byte) ((int) (p1 >>> 56)));
        life7_70 = 1;
        loop_region_71: while ((life7_70 < 8)) {
        (life6_60)[life7_70] = ((byte) ((int) ((p1 << (life7_70 * 8)) >>> 56)));
        life7_70 += 1;
    }
        life7_92 = new javax.crypto.spec.DESKeySpec(life6_60);
        life8_99 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life4_21)[1])))).generateSecret(((java.security.spec.KeySpec)(life7_92)));
        ((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).init(((int)(2)), ((java.security.Key)(life8_99)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life4_21)[2])))));
        life9_116 = ((java.lang.String)((moom.gH.H)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.gH.I)[life5_8] = moom.gH.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.gH.I)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.gH.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral7706_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/gH"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
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
        byte[] spill4125_0 = p0;
        life4_9 += 1;
        life5_44 = (spill4125_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill4125_1 = p0;
        life4_9 += 1;
        life5_76 = (spill4125_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill4125_2 = p0;
        life4_9 += 1;
        life5_91 = (spill4125_2)[life4_9];
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


private boolean a(java.lang.String p0) {
java.lang.String forwardValue3560_16_0;
    int forwardValue3560_32_0;
    int forwardValue3560_40_0;
    int forwardValue3560_50_0;
    java.lang.String spill3560_0;
    boolean spill3560_1;
    boolean spill3560_2;
    long life2_3;
    int[] life4_5;
    forward_join_50: {
    forward_join_49: {
    forward_join_40: {
    forward_join_33: {
    forward_join_32: {
    forward_join_31: {
    forward_join_16: {
    forward_join_12: {
    life2_3 = (moom.gH.G ^ 42206688604848L);
    life4_5 = moom.LL.b();
    spill3560_0 = p0;
    if (!((life4_5 == null))) {
        forwardValue3560_16_0 = spill3560_0;
        break forward_join_16;
    }
    if (!((spill3560_0 == null))) {
        break forward_join_12;
    }
    return ((0) != 0);
    }
    p0 = ((java.lang.String)(p0)).trim();
    forwardValue3560_16_0 = p0;
    }
    spill3560_1 = ((java.lang.String)(forwardValue3560_16_0)).equals(((java.lang.Object)(__sourceIntrinsic_4b5a4712eca9_invokedynamic3560_4(4993, (2772287456442434213L ^ life2_3)))));
    if (!((life4_5 == null))) {
        forwardValue3560_40_0 = ((spill3560_1) ? 1 : 0);
        break forward_join_40;
    }
    if (!(spill3560_1)) {
        break forward_join_33;
    }
    spill3560_2 = moom.BU.ap();
    if (!((life4_5 == null))) {
        forwardValue3560_32_0 = ((spill3560_2) ? 1 : 0);
        break forward_join_32;
    }
    if (!(spill3560_2)) {
        break forward_join_31;
    }
    moom.MP.m();
    moom.MP.c();
    }
    forwardValue3560_32_0 = 1;
    }
    return ((forwardValue3560_32_0) != 0);
    }
    forwardValue3560_40_0 = ((((java.lang.String)(p0)).equals(((java.lang.Object)(__sourceIntrinsic_4b5a4712eca9_invokedynamic3560_12(24026, (5078800186435144959L ^ life2_3)))))) ? 1 : 0);
    }
    if (!((life4_5 == null))) {
        forwardValue3560_50_0 = forwardValue3560_40_0;
        break forward_join_50;
    }
    if (!((forwardValue3560_40_0 != 0))) {
        break forward_join_49;
    }
    ((net.minecraft.client.renderer.RenderGlobal)(((net.minecraft.client.Minecraft)(this.i)).J)).g();
    return ((1) != 0);
    }
    forwardValue3560_50_0 = 0;
    }
    return ((forwardValue3560_50_0) != 0);
}


private static native <E extends Throwable> void __sourceIntrinsic_9c17daea9624_call3561_7(moom.gH a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral7706_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_4b5a4712eca9_invokedynamic3560_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_4b5a4712eca9_invokedynamic3560_12(int a0, long a1) throws E;
}
