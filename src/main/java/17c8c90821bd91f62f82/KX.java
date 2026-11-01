package moom;


public class KX extends moom.KS {

private static long f;

private static java.lang.String[] l;

private static java.lang.String[] m;

private static java.util.Map n;

public KX() { super((java.lang.Class)null, (java.lang.String)null, 0.0F); }


private static void __sourceConstructorBody_193440bc5ebf4764(moom.KX receiver) throws Throwable {

long local1 = (moom.KX.f ^ 61502747994637L);

    moom.KX.__sourceConstructorInit_193440bc5ebf4764_0(((moom.KX)(receiver)), ((java.lang.Object)(net.minecraft.entity.passive.EntitySheep.class)), ((java.lang.String)(__sourceIntrinsic_193440bc5ebf4764_originalDynamicSite2317_2(20525, (9209273586495961811L ^ local1)))), ((float)(0x1.666666p-1f)));

    return;

}



static {
f = ((long)(((moom._a)(moom._c.a(((long)(5512763507996339276L)), ((long)(5833232662139044788L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(200978522003211L)))));
    n = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.KX.f ^ 90347573854704L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill647_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill647_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill647_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill647_14 = new byte[8];
    (__sourceSpill647_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill647_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation647_16 = __sourceSpill647_14;
    ((javax.crypto.Cipher)(__sourceSpill647_11)).init(((int)(__sourceSpill647_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill647_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation647_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local9_life19 = new java.lang.String[2];
    int local7_life20 = 0;
    java.lang.String local6_life21;
    int local8_life23 = ((java.lang.String)((local6_life21 = "Ãk¿²¼,{ã×ÝV´o(Ä1ÔýRÌvD¯¢fÿz\\¥¬MT \\f è/w1\032¶ñn\016¼Oøãa.Bï\1775K\036Þal©"))).length();
    int local5_life24 = 40;
    int local4_life25 = -1;
    while (true) {
        local4_life25 += 1;
        byte[] __sourceSpill647_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill647_29 = local2_life9;
        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill647_29)).doFinal(((byte[])(__sourceSpill647_28)));
        java.lang.String __sourceSpill647_34 = ((java.lang.String)(moom.KX.b(((byte[])(local10_life31))))).intern();
        java.lang.String[] __sourceSpill647_35 = local9_life19;
        int __sourceSpill647_36 = local7_life20;
        local7_life20 += 1;
        (__sourceSpill647_35)[__sourceSpill647_36] = __sourceSpill647_34;
        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }
        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));
    }
    l = ((java.lang.String[])(local9_life19));
    m = ((java.lang.String[])(new java.lang.String[2]));
}

private static native <E extends Throwable> void __sourceConstructorInit_193440bc5ebf4764_0(moom.KX a0, java.lang.Object a1, java.lang.String a2, float a3) throws E;

private static java.lang.String b(byte[] p0) {
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
        byte[] spill2902_0 = p0;
        life4_9 += 1;
        life5_44 = (spill2902_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill2902_1 = p0;
        life4_9 += 1;
        life5_76 = (spill2902_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill2902_2 = p0;
        life4_9 += 1;
        life5_91 = (spill2902_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static java.lang.String b(int p0, long p1) {
int life5_8;
    java.lang.Long life3_16;
    java.lang.Object[] life4_21;
    byte[] life6_60;
    int life7_70;
    javax.crypto.spec.DESKeySpec life7_92;
    javax.crypto.SecretKey life8_99;
    byte[] life9_116;
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 20274);
    if (((moom.KX.m)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.KX.n)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.KX.n)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/KX", life9_51);
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
        life9_116 = ((java.lang.String)((moom.KX.l)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.KX.m)[life5_8] = moom.KX.b(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.KX.m)[life5_8];
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral5696_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/KX"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.Object b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.KX.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public moom.Kl a(moom.iQ p0, float p1) {
net.minecraft.client.renderer.entity.Render forestValue900154_26_0;
    int[] spill900154_0;
    net.minecraft.client.renderer.entity.Render spill900154_1;
    long life3_3;
    net.minecraft.client.renderer.entity.RenderManager life6_7;
    int[] life5_8;
    net.minecraft.client.renderer.entity.Render life7_14;
    moom.ng life8_25;
    moom.ng life7_53;
    java.util.List life9_57;
    java.util.Iterator life10_60;
    net.minecraft.client.renderer.entity.layers.LayerRenderer life11_69;
    moom.nW life11_84;
    forest_join_68: {
    forest_join_48: {
    forest_join_36: {
    forest_join_26: {
    forest_join_25: {
    life3_3 = (moom.KX.f ^ 46278071777328L);
    spill900154_0 = moom.Km.b();
    life6_7 = ((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).a__nw();
    life5_8 = spill900154_0;
    life7_14 = ((net.minecraft.client.renderer.entity.Render)(((java.util.Map)(((net.minecraft.client.renderer.entity.RenderManager)(life6_7)).a__Map())).get(((java.lang.Object)(net.minecraft.entity.passive.EntitySheep.class)))));
    spill900154_1 = life7_14;
    if (!((life5_8 != null))) {
        forestValue900154_26_0 = spill900154_1;
        break forest_join_26;
    }
    if (!((((spill900154_1 instanceof moom.ng) ? 1 : 0) != 0))) {
        break forest_join_25;
    }
    life8_25 = ((moom.ng)(life7_14));
    if (!((life5_8 == null))) {
        break forest_join_36;
    }
    }
    forestValue900154_26_0 = life7_14;
    }
    net.minecraft.client.renderer.entity.Render __stackOp900154_11_0 = forestValue900154_26_0;
    java.lang.String __stackOp900154_11_1 = __sourceIntrinsic_7ab34bcb5e67_invokedynamic900154_10(19442, (8720437654299652912L ^ life3_3));
    moom.BU.c(((java.lang.String)(__sourceIntrinsic_7ab34bcb5e67_invokedynamic900154_12(__stackOp900154_11_1, __stackOp900154_11_0))));
    return null;
    }
    if (!((((net.minecraft.client.renderer.entity.Render)(life7_14)).a() == null))) {
        break forest_join_48;
    }
    life7_53 = new moom.ng(life6_7, new moom.jm(), 0x1.666666p-1f);
    life7_53 = life7_53;
    }
    life9_57 = ((moom.ng)(life8_25)).a__sourceReturn_3f0615080b();
    life10_60 = ((java.util.List)(life9_57)).iterator();
    forest_cycle_54: while (true) {
    forest_join_66: {
    if (!(((java.util.Iterator)(life10_60)).hasNext())) {
        break forest_join_68;
    }
    life11_69 = ((net.minecraft.client.renderer.entity.layers.LayerRenderer)(((java.util.Iterator)(life10_60)).next()));
    if (!((((life11_69 instanceof moom.nW) ? 1 : 0) != 0))) {
        break forest_join_66;
    }
    ((java.util.Iterator)(life10_60)).remove();
    }
    if (!((life5_8 == null))) {
        continue forest_cycle_54;
    }
    break forest_cycle_54;
    }
    }
    life11_84 = new moom.nW(life8_25);
    ((moom.nW)(life11_84)).c = ((moom.jl)(((moom.jl)(p0))));
    ((moom.ng)(life8_25)).a(((net.minecraft.client.renderer.entity.layers.LayerRenderer)(life11_84)));
    return life8_25;
}


public moom.iQ a__iQ() {
return new moom.jl();
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_193440bc5ebf4764_originalDynamicSite2317_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_7ab34bcb5e67_invokedynamic900154_10(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_7ab34bcb5e67_invokedynamic900154_12(java.lang.String a0, net.minecraft.client.renderer.entity.Render a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral5696_0() throws E;
}
