package moom;


public class Lc implements moom.La {

private moom.Km a;

private moom.iQ b;

private moom.Kk[] c;

private moom.jD d;

private moom.jD e;

private moom.Lb f;

private static long g;

private static java.lang.String[] h;

private static java.lang.String[] i;

private static java.util.Map j;

public Lc(moom.Km p0, moom.iQ p1, moom.Kk[] p2) { super(); }


private static void __sourceConstructorBody_137bddce9014fe1d(moom.Lc receiver, moom.Km p0, moom.iQ p1, moom.Kk[] p2) throws Throwable {

long local4_life2;

    int[] local6_life7;

    java.lang.Class local7_life11;

    forward_join_41: {

    forward_join_36: {

    forward_join_31: {

    local4_life2 = (moom.Lc.g ^ 44658875760483L);

    int[] __sourceSpill376_4 = moom.Lg.b();

    moom.Lc.__sourceConstructorInit_137bddce9014fe1d_0(((moom.Lc)(receiver)));

    ((moom.Lc)(receiver)).a = ((moom.Km)(p0));

    local6_life7 = __sourceSpill376_4;

    ((moom.Lc)(receiver)).b = ((moom.iQ)(p1));

    ((moom.Lc)(receiver)).c = ((moom.Kk[])(p2));

    local7_life11 = ((moom.Km)(p0)).a__Class();

    if (!((local6_life7 == null))) { break forward_join_31; }

    if (!(((java.lang.Class)(net.minecraft.tileentity.TileEntity.class)).isAssignableFrom(((java.lang.Class)(local7_life11))))) { break forward_join_36; }

    ((moom.Lc)(receiver)).f = ((moom.Lb)(new moom.Lk()));

    }

    if (!((local6_life7 != null))) { break forward_join_41; }

    net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[2])));

    }

    ((moom.Lc)(receiver)).f = ((moom.Lb)(new moom.Lj()));

    }

    return;

}



static {
g = ((long)(((moom._a)(moom._c.a(((long)(-1615692681803089639L)), ((long)(-3628220387720165336L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(150856098298506L)))));
    j = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.Lc.g ^ 74277597372476L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill677_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill677_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill677_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill677_14 = new byte[8];
    (__sourceSpill677_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill677_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation677_16 = __sourceSpill677_14;
    ((javax.crypto.Cipher)(__sourceSpill677_11)).init(((int)(__sourceSpill677_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill677_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation677_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local9_life19 = new java.lang.String[2];
    int local7_life20 = 0;
    java.lang.String local6_life21;
    int local8_life23 = ((java.lang.String)((local6_life21 = "½]½Go\033_ë»6\rÌÂ\020YÍ¦\n\023ã'ßDA\022G6"))).length();
    int local5_life24 = 16;
    int local4_life25 = -1;
    while (true) {
        local4_life25 += 1;
        byte[] __sourceSpill677_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill677_29 = local2_life9;
        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill677_29)).doFinal(((byte[])(__sourceSpill677_28)));
        java.lang.String __sourceSpill677_34 = ((java.lang.String)(moom.Lc.a(((byte[])(local10_life31))))).intern();
        java.lang.String[] __sourceSpill677_35 = local9_life19;
        int __sourceSpill677_36 = local7_life20;
        local7_life20 += 1;
        (__sourceSpill677_35)[__sourceSpill677_36] = __sourceSpill677_34;
        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }
        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));
    }
    h = ((java.lang.String[])(local9_life19));
    i = ((java.lang.String[])(new java.lang.String[2]));
}

private static native <E extends Throwable> void __sourceConstructorInit_137bddce9014fe1d_0(moom.Lc a0) throws E;

public void b(moom.jD p0) {
this.d = ((moom.jD)(p0));
    return;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral5954_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Lc"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
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
        byte[] spill3037_0 = p0;
        life4_9 += 1;
        life5_44 = (spill3037_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill3037_1 = p0;
        life4_9 += 1;
        life5_76 = (spill3037_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill3037_2 = p0;
        life4_9 += 1;
        life5_91 = (spill3037_2)[life4_9];
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


private static java.lang.String a(int p0, long p1) {
int life5_8;
    java.lang.Long life3_16;
    java.lang.Object[] life4_21;
    byte[] life6_60;
    int life7_70;
    javax.crypto.spec.DESKeySpec life7_92;
    javax.crypto.SecretKey life8_99;
    byte[] life9_116;
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 17322);
    if (((moom.Lc.i)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.Lc.j)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.Lc.j)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/Lc", life9_51);
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
        life9_116 = ((java.lang.String)((moom.Lc.h)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.Lc.i)[life5_8] = moom.Lc.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.Lc.i)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.Lc.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public moom.jD a__jD(java.lang.String p0) {
java.lang.String lexicalValue928_13_0;
    java.lang.String lexicalValue928_20_0;
    java.lang.String lexicalValue928_20_1;
    moom.jD lexicalValue928_51_0;
    moom.jD lexicalValue928_56_0;
    moom.jD lexicalValue928_75_0;
    moom.jD lexicalValue928_95_0;
    moom.jD lexicalValue928_101_0;
    java.lang.String spill928_0;
    java.lang.String spill928_1;
    moom.jD spill928_2;
    moom.jD spill928_3;
    moom.jD spill928_4;
    long life2_3;
    int[] life4_5;
    java.lang.String[] life5_32;
    moom.jD life6_38;
    int life7_40;
    java.lang.String life8_48;
    moom.jD life9_52;
    moom.jD life5_130;
    moom.Kk[] life6_142;
    int life7_145;
    int life8_147;
    moom.Kk life9_154;
    moom.jD life10_157;
    moom.jD life11_170;
    lexical_join_140: {
    lexical_join_102: {
    lexical_join_101: {
    lexical_join_95: {
    lexical_join_89: {
    lexical_join_75: {
    lexical_join_73: {
    lexical_join_57: {
    lexical_join_56: {
    lexical_join_55: {
    lexical_join_20: {
    lexical_join_13: {
    lexical_join_12: {
    life2_3 = (moom.Lc.g ^ 108139534693023L);
    life4_5 = moom.Lg.b();
    spill928_0 = p0;
    if (!((life4_5 == null))) {
        lexicalValue928_13_0 = spill928_0;
        break lexical_join_13;
    }
    if (!((spill928_0 == null))) {
        break lexical_join_12;
    }
    return null;
    }
    lexicalValue928_13_0 = p0;
    }
    spill928_1 = ":";
    if (!((life4_5 == null))) {
        lexicalValue928_20_0 = lexicalValue928_13_0;
        lexicalValue928_20_1 = spill928_1;
        break lexical_join_20;
    }
    if (!(((java.lang.String)(lexicalValue928_13_0)).contains(((java.lang.CharSequence)(spill928_1))))) {
        break lexical_join_57;
    }
    lexicalValue928_20_0 = p0;
    lexicalValue928_20_1 = ":";
    }
    life5_32 = moom.BU.a__ArrayString(((java.lang.String)(lexicalValue928_20_0)), ((java.lang.String)(lexicalValue928_20_1)));
    life6_38 = ((moom.Lc)(this)).a__jD(((java.lang.String)((life5_32)[0])));
    life7_40 = 1;
    lexical_cycle_30: while (true) {
    lexical_join_51: {
    lexical_join_50: {
    if (!((life7_40 < (life5_32).length))) {
        break lexical_join_55;
    }
    life8_48 = (life5_32)[life7_40];
    life9_52 = ((moom.jD)(life6_38)).b(((java.lang.String)(life8_48)));
    spill928_2 = life9_52;
    if (!((life4_5 == null))) {
        lexicalValue928_56_0 = spill928_2;
        break lexical_join_56;
    }
    if (!((life4_5 == null))) {
        lexicalValue928_51_0 = spill928_2;
        break lexical_join_51;
    }
    if (!((spill928_2 == null))) {
        break lexical_join_50;
    }
    return null;
    }
    lexicalValue928_51_0 = life9_52;
    }
    life6_38 = lexicalValue928_51_0;
    life7_40 += 1;
    if (!((life4_5 != null))) { continue lexical_cycle_30; }
    break lexical_cycle_30;
    }
    }
    lexicalValue928_56_0 = life6_38;
    }
    return lexicalValue928_56_0;
    }
    spill928_3 = this.d;
    if (!((life4_5 == null))) {
        lexicalValue928_75_0 = spill928_3;
        break lexical_join_75;
    }
    if (!((spill928_3 != null))) {
        break lexical_join_73;
    }
    if (!(((java.lang.String)(p0)).equals(((java.lang.Object)(__sourceIntrinsic_395913edf9ff_invokedynamic928_7(26863, (7367135822591090032L ^ life2_3))))))) {
        break lexical_join_73;
    }
    return this.d;
    }
    lexicalValue928_75_0 = this.e;
    }
    if (!((life4_5 == null))) {
        lexicalValue928_95_0 = lexicalValue928_75_0;
        break lexical_join_95;
    }
    if (!((lexicalValue928_75_0 != null))) {
        break lexical_join_89;
    }
    if (!(((java.lang.String)(p0)).equals(((java.lang.Object)(__sourceIntrinsic_395913edf9ff_invokedynamic928_11(30228, (7432202709810398090L ^ life2_3))))))) {
        break lexical_join_89;
    }
    return this.e;
    }
    lexicalValue928_95_0 = ((moom.Km)(this.a)).a(((moom.iQ)(this.b)), ((java.lang.String)(p0)));
    }
    life5_130 = lexicalValue928_95_0;
    spill928_4 = life5_130;
    if (!((life4_5 == null))) {
        lexicalValue928_101_0 = spill928_4;
        break lexical_join_101;
    }
    if (!((spill928_4 != null))) {
        break lexical_join_102;
    }
    lexicalValue928_101_0 = life5_130;
    }
    return lexicalValue928_101_0;
    }
    life6_142 = this.c;
    life7_145 = (life6_142).length;
    life8_147 = 0;
    lexical_cycle_110: while (true) {
    lexical_join_138: {
    lexical_join_137: {
    lexical_join_127: {
    if (!((life8_147 < life7_145))) {
        break lexical_join_140;
    }
    life9_154 = (life6_142)[life8_147];
    life10_157 = ((moom.Kk)(life9_154)).a__jD();
    if (!(((java.lang.String)(p0)).equals(((java.lang.Object)(((moom.jD)(life10_157)).a__String()))))) {
        break lexical_join_127;
    }
    return life10_157;
    }
    life11_170 = ((moom.jD)(life10_157)).b(((java.lang.String)(p0)));
    if (!((life4_5 == null))) {
        break lexical_join_138;
    }
    if (!((life11_170 != null))) {
        break lexical_join_137;
    }
    return life11_170;
    }
    life8_147 += 1;
    }
    if (!((life4_5 != null))) { continue lexical_cycle_110; }
    break lexical_cycle_110;
    }
    }
    return null;
}


public moom.Le a(java.lang.String p0) {
java.lang.String[] forwardValue2578_19_0;
    moom.Le forwardValue2578_47_0;
    int[] spill2578_0;
    java.lang.String[] spill2578_1;
    long life2_3;
    java.lang.String[] life5_8;
    int[] life4_9;
    java.lang.String life6_26;
    java.lang.String life7_30;
    moom.jD life8_34;
    moom.bP life9_43;
    forward_join_47: {
    forward_join_41: {
    forward_join_34: {
    forward_join_19: {
    forward_join_18: {
    life2_3 = (moom.Lc.g ^ 19113292798640L);
    spill2578_0 = moom.Lg.b();
    life5_8 = moom.BU.a__ArrayString(((java.lang.String)(p0)), ((java.lang.String)(".")));
    life4_9 = spill2578_0;
    spill2578_1 = life5_8;
    if (!((life4_9 == null))) {
        forwardValue2578_19_0 = spill2578_1;
        break forward_join_19;
    }
    if (!(((spill2578_1).length != 2))) {
        break forward_join_18;
    }
    return null;
    }
    forwardValue2578_19_0 = life5_8;
    }
    life6_26 = (forwardValue2578_19_0)[0];
    life7_30 = (life5_8)[1];
    life8_34 = ((moom.Lc)(this)).a__jD(((java.lang.String)(life6_26)));
    if (!((life8_34 == null))) {
        break forward_join_34;
    }
    return null;
    }
    life9_43 = moom.bP.a(((java.lang.String)(life7_30)));
    if (!((life9_43 == null))) {
        break forward_join_41;
    }
    forwardValue2578_47_0 = null;
    break forward_join_47;
    }
    forwardValue2578_47_0 = new moom.Le(p0, life8_34, life9_43);
    }
    return forwardValue2578_47_0;
}


public void a(moom.jD p0) {
this.e = ((moom.jD)(p0));
    return;
}


public moom.Lu a__Lu(java.lang.String p0) {
moom.Lu forwardValue2579_20_0;
    int[] spill2579_0;
    moom.Le spill2579_1;
    long life2_3;
    moom.Le life5_8;
    int[] life4_9;
    forward_join_20: {
    forward_join_16: {
    life2_3 = (moom.Lc.g ^ 37973542055065L);
    spill2579_0 = moom.Lg.b();
    life5_8 = ((moom.Lc)(this)).a(((java.lang.String)(p0)));
    life4_9 = spill2579_0;
    spill2579_1 = life5_8;
    if (!((life4_9 == null))) {
        forwardValue2579_20_0 = spill2579_1;
        break forward_join_20;
    }
    if (!((spill2579_1 != null))) {
        break forward_join_16;
    }
    return life5_8;
    }
    forwardValue2579_20_0 = ((moom.Lb)(this.f)).a(((java.lang.String)(p0)));
    }
    return forwardValue2579_20_0;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral5954_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_395913edf9ff_invokedynamic928_7(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_395913edf9ff_invokedynamic928_11(int a0, long a1) throws E;
}
