package moom;


public abstract class M7 {

private java.lang.String a;

private java.lang.String b;

private java.lang.String c;

private java.lang.String[] d;

private java.lang.String e;

private java.lang.String[] f;

private boolean g;

private boolean h;

private static int[] i;

private static long m;

private static java.lang.String[] p;

private static java.lang.String[] q;

private static java.util.Map r;

public M7(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String[] p3, java.lang.String p4, java.lang.String p5) { super(); }

private static void __sourceConstructorBody_65d30834c863ed7a(moom.M7 receiver, java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String[] p3, java.lang.String p4, java.lang.String p5) throws Throwable {
moom.M7 forwardValue412_52_0;
    int[] spill412_0;
    moom.M7 spill412_1;
    java.lang.String[] spill412_2;
    long life7_3;
    int[] life9_16;
    forward_join_64: {
    forward_join_59: {
    forward_join_52: {
    life7_3 = (moom.M7.m ^ 26023435877906L);
    moom.M7.__sourceConstructorInit_65d30834c863ed7a_0(((moom.M7)(receiver)));
    spill412_0 = moom.M7.b__ArrayInt();
    ((moom.M7)(receiver)).a = ((java.lang.String)(null));
    ((moom.M7)(receiver)).b = ((java.lang.String)(null));
    ((moom.M7)(receiver)).c = ((java.lang.String)(null));
    life9_16 = spill412_0;
    ((moom.M7)(receiver)).d = ((java.lang.String[])(null));
    ((moom.M7)(receiver)).e = ((java.lang.String)(null));
    ((moom.M7)(receiver)).f = ((java.lang.String[])(null));
    ((moom.M7)(receiver)).g = ((boolean)(true));
    ((moom.M7)(receiver)).h = ((boolean)(true));
    ((moom.M7)(receiver)).a = ((java.lang.String)(p0));
    ((moom.M7)(receiver)).b = ((java.lang.String)(p1));
    ((moom.M7)(receiver)).c = ((java.lang.String)(p2));
    ((moom.M7)(receiver)).d = ((java.lang.String[])(p3));
    spill412_1 = receiver;
    if (!((life9_16 == null))) {
        forwardValue412_52_0 = spill412_1;
        break forward_join_52;
    }
    ((moom.M7)(spill412_1)).e = ((java.lang.String)(p4));
    if (!((p5 != null))) {
        break forward_join_59;
    }
    forwardValue412_52_0 = receiver;
    }
    java.lang.String[] __stackOp412_16_0 = new java.lang.String[1];
    spill412_2 = __stackOp412_16_0;
    (__stackOp412_16_0)[0] = p5;
    ((moom.M7)(forwardValue412_52_0)).f = ((java.lang.String[])(spill412_2));
    }
    if (!((life9_16 != null))) {
        break forward_join_64;
    }
    net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[4])));
    }
    return;
}


static {
m = ((long)(((moom._a)(moom._c.a(((long)(-9221732979338090440L)), ((long)(-6118424822302457443L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(103769248780306L)))));
    java.lang.Object __sourceSpill826_6 = null;
    r = ((java.util.Map)(new java.util.HashMap(13)));
    moom.M7.b(((int[])(__sourceSpill826_6)));
    long local0_life9 = (moom.M7.m ^ 125167670864121L);
    javax.crypto.Cipher local2_life11;
    javax.crypto.Cipher __sourceSpill826_13 = (local2_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill826_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill826_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill826_16 = new byte[8];
    (__sourceSpill826_16)[0] = ((byte) ((int) (local0_life9 >>> 56)));
    int local3_life17 = 1;
    while ((local3_life17 < 8)) {
        (__sourceSpill826_16)[local3_life17] = ((byte) ((int) ((local0_life9 << (local3_life17 * 8)) >>> 56)));
        local3_life17 += 1;
    }
    byte[] __sourcePreallocation826_18 = __sourceSpill826_16;
    ((javax.crypto.Cipher)(__sourceSpill826_13)).init(((int)(__sourceSpill826_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill826_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation826_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local9_life21 = new java.lang.String[8];
    int local7_life22 = 0;
    java.lang.String local6_life23;
    int local8_life25 = ((java.lang.String)((local6_life23 = "\000í\037!\022cãaV4Oÿ\025ï $ö\nïÞ]&JffÍ -¯¬Ô¹\0135\t'M\031äí¦Ò\fÁòª\020\0063exD\nP£^¤÷Jûi\020oËÑ\037Hñ\031\\\030òËÍg_(ÂÐ\tZ2>-¡~¶`EuÉî£×ÑhgF|µaºaq§Uà»Xt ç8k\001.ø¡¾.´êã3<ÑM(%\026ÅÈÖ®\0277ífl\035"))).length();
    int local5_life26 = 16;
    int local4_life27 = -1;
    while (true) {
        local4_life27 += 1;
        byte[] __sourceSpill826_30 = ((java.lang.String)(((java.lang.String)(local6_life23)).substring(((int)(local4_life27)), ((int)((local4_life27 + local5_life26)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill826_31 = local2_life11;
        byte[] local10_life33 = ((javax.crypto.Cipher)(__sourceSpill826_31)).doFinal(((byte[])(__sourceSpill826_30)));
        java.lang.String __sourceSpill826_36 = ((java.lang.String)(moom.M7.a(((byte[])(local10_life33))))).intern();
        java.lang.String[] __sourceSpill826_37 = local9_life21;
        int __sourceSpill826_38 = local7_life22;
        local7_life22 += 1;
        (__sourceSpill826_37)[__sourceSpill826_38] = __sourceSpill826_36;
        if (!(((local4_life27 = (local4_life27 + local5_life26)) < local8_life25))) { break; }
        local5_life26 = ((java.lang.String)(local6_life23)).charAt(((int)(local4_life27)));
    }
    local8_life25 = ((java.lang.String)((local6_life23 = "\030tºÿfDÿW¶Ò\0173\000çø\026Nþ\016â¡æ\\Ù\0030Ã¯C\037\020ÁÂ\021¡YW&ýi]\rÕã"))).length();
    local5_life26 = 32;
    local4_life27 = -1;
    while (true) {
        local4_life27 += 1;
        byte[] __sourceSpill826_44 = ((java.lang.String)(((java.lang.String)(local6_life23)).substring(((int)(local4_life27)), ((int)((local4_life27 + local5_life26)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill826_45 = local2_life11;
        byte[] local10_life47 = ((javax.crypto.Cipher)(__sourceSpill826_45)).doFinal(((byte[])(__sourceSpill826_44)));
        java.lang.String __sourceSpill826_50 = ((java.lang.String)(moom.M7.a(((byte[])(local10_life47))))).intern();
        java.lang.String[] __sourceSpill826_51 = local9_life21;
        int __sourceSpill826_52 = local7_life22;
        local7_life22 += 1;
        (__sourceSpill826_51)[__sourceSpill826_52] = __sourceSpill826_50;
        if (!(((local4_life27 = (local4_life27 + local5_life26)) < local8_life25))) { break; }
        local5_life26 = ((java.lang.String)(local6_life23)).charAt(((int)(local4_life27)));
    }
    p = ((java.lang.String[])(local9_life21));
    q = ((java.lang.String[])(new java.lang.String[8]));
}

private static native <E extends Throwable> void __sourceConstructorInit_65d30834c863ed7a_0(moom.M7 a0) throws E;

public java.lang.String toString() {
long local1 = (moom.M7.m ^ 123399776152907L);
    java.lang.String __sourceSpill1900_6 = this.a;
    java.lang.String __sourceSpill1900_7 = this.c;
    java.lang.String __sourceSpill1900_8 = this.e;
    java.lang.String local3 = moom.BU.a(((java.lang.Object[])(this.f)));
    java.lang.String local4 = __sourceSpill1900_8;
    java.lang.String local5 = __sourceSpill1900_7;
    return __sourceIntrinsic_a86c261fcdee_originalDynamicSite1900_12(__sourceSpill1900_6, __sourceIntrinsic_a86c261fcdee_originalDynamicSite1900_9(5122, (1070446393055963569L ^ local1)), local5, __sourceIntrinsic_a86c261fcdee_originalDynamicSite1900_10(13546, (1035430096265038171L ^ local1)), local4, __sourceIntrinsic_a86c261fcdee_originalDynamicSite1900_11(24796, (7811571689316031848L ^ local1)), local3);
}


public boolean b__Boolean(java.lang.String p0) {
int forwardValue2643_14_0;
    int forwardValue2643_16_0;
    int spill2643_0;
    long life2_3;
    int[] life4_5;
    forward_join_16: {
    forward_join_15: {
    forward_join_14: {
    life2_3 = (moom.M7.m ^ 109918709038496L);
    life4_5 = moom.M7.b__ArrayInt();
    spill2643_0 = moom.M7.a(((java.lang.String)(p0)), ((java.lang.String[])(this.d)));
    if (!((life4_5 == null))) {
        forwardValue2643_14_0 = spill2643_0;
        break forward_join_14;
    }
    if (!((spill2643_0 >= 0))) {
        break forward_join_15;
    }
    forwardValue2643_14_0 = 1;
    }
    forwardValue2643_16_0 = forwardValue2643_14_0;
    break forward_join_16;
    }
    forwardValue2643_16_0 = 0;
    }
    return ((forwardValue2643_16_0) != 0);
}


public java.lang.String b(java.lang.String p0) {
return "";
}


public void b(boolean p0) {
this.h = ((boolean)(p0));
    return;
}


public boolean b__Boolean() {
int forwardValue2642_15_0;
    int forwardValue2642_17_0;
    boolean spill2642_0;
    long life1_3;
    int[] life3_5;
    forward_join_17: {
    forward_join_16: {
    forward_join_15: {
    life1_3 = (moom.M7.m ^ 130395632814363L);
    life3_5 = moom.M7.b__ArrayInt();
    spill2642_0 = moom.BU.a(((java.lang.Object)(this.c)), ((java.lang.Object)(this.e)));
    if (!((life3_5 == null))) {
        forwardValue2642_15_0 = ((spill2642_0) ? 1 : 0);
        break forward_join_15;
    }
    if (!((!spill2642_0))) {
        break forward_join_16;
    }
    forwardValue2642_15_0 = 1;
    }
    forwardValue2642_17_0 = forwardValue2642_15_0;
    break forward_join_17;
    }
    forwardValue2642_17_0 = 0;
    }
    return ((forwardValue2642_17_0) != 0);
}


public java.lang.String[] b__ArrayString() {
return ((java.lang.String[])(((java.lang.String[])(this.d)).clone()));
}


public static void b(int[] p0) {
i = ((int[])(p0));
    return;
}


public static int[] b__ArrayInt() {
return moom.M7.i;
}


public void b__Void() {
int forwardValue2644_23_0;
    int[] spill2644_0;
    int spill2644_1;
    long life1_3;
    int life4_10;
    int[] life3_11;
    int life4_29;
    forward_join_30: {
    forward_join_23: {
    life1_3 = (moom.M7.m ^ 113787259326992L);
    spill2644_0 = moom.M7.b__ArrayInt();
    life4_10 = moom.M7.a(((java.lang.String)(this.c)), ((java.lang.String[])(this.d)));
    life3_11 = spill2644_0;
    spill2644_1 = life4_10;
    if (!((life3_11 == null))) {
        forwardValue2644_23_0 = spill2644_1;
        break forward_join_23;
    }
    if (!((spill2644_1 >= 0))) {
        break forward_join_30;
    }
    forwardValue2644_23_0 = ((life4_10 + 1) % (this.d).length);
    }
    life4_29 = forwardValue2644_23_0;
    this.c = ((java.lang.String)((this.d)[life4_29]));
    }
    return;
}


public java.lang.String b() {
return this.b;
}


public java.lang.String e() {
return this.e;
}


public boolean c(java.lang.String p0) {
return ((0) != 0);
}


public boolean c__Boolean() {
return ((((this.h) ? 1 : 0)) != 0);
}


public void c__Void() {
int forwardValue2645_27_0;
    int[] spill2645_0;
    int spill2645_1;
    long life1_3;
    int life4_10;
    int[] life3_11;
    int life4_33;
    forward_join_34: {
    forward_join_27: {
    life1_3 = (moom.M7.m ^ 71598179919861L);
    spill2645_0 = moom.M7.b__ArrayInt();
    life4_10 = moom.M7.a(((java.lang.String)(this.c)), ((java.lang.String[])(this.d)));
    life3_11 = spill2645_0;
    spill2645_1 = life4_10;
    if (!((life3_11 == null))) {
        forwardValue2645_27_0 = spill2645_1;
        break forward_join_27;
    }
    if (!((spill2645_1 >= 0))) {
        break forward_join_34;
    }
    forwardValue2645_27_0 = (((life4_10 - 1) + (this.d).length) % (this.d).length);
    }
    life4_33 = forwardValue2645_27_0;
    this.c = ((java.lang.String)((this.d)[life4_33]));
    }
    return;
}


private static moom.Oo c(moom.Oo p0) {
return p0;
}


public java.lang.String c() {
long local1_life2 = (moom.M7.m ^ 104376494288820L);
    java.lang.String local3_life5 = moom.BU.a(((java.lang.String)(this.b)));
    local3_life5 = moom.Ob.b(((java.lang.String)(local3_life5)), ((java.lang.String)(__sourceIntrinsic_fe670a2392c4_originalDynamicSite571_7(12714, (3770413807851802339L ^ local1_life2)))));
    java.lang.String __stackOp571_12_0 = ((moom.M7)(this)).a__String();
    java.lang.String __stackOp571_12_1 = __sourceIntrinsic_fe670a2392c4_originalDynamicSite571_11(22859, (7208519057980483078L ^ local1_life2));
    local3_life5 = moom.MP.a(((java.lang.String)(__sourceIntrinsic_fe670a2392c4_originalDynamicSite571_15(__stackOp571_12_1, __stackOp571_12_0, __sourceIntrinsic_fe670a2392c4_originalDynamicSite571_14(22114, (3627276312935164205L ^ local1_life2))))), ((java.lang.String)(local3_life5)));
    return local3_life5;
}


public java.lang.String f() {
long local1_life2 = (moom.M7.m ^ 62301945485142L);
    java.lang.String __stackOp572_6_0 = this.a;
    java.lang.String __stackOp572_6_1 = __sourceIntrinsic_1bc14720020d_originalDynamicSite572_5(28838, (6551293699372054286L ^ local1_life2));
    return moom.MP.a(((java.lang.String)(__sourceIntrinsic_1bc14720020d_originalDynamicSite572_7(__stackOp572_6_1, __stackOp572_6_0))), ((java.lang.String)(this.a)));
}


public boolean d(java.lang.String p0) {
return ((0) != 0);
}


public java.lang.String d() {
return this.c;
}


public boolean d__Boolean() {
return ((0) != 0);
}


private static int a(java.lang.String p0, java.lang.String[] p1) {
int lexicalValue941_30_0;
    int[] spill941_0;
    boolean spill941_1;
    long life2_3;
    int life5_6;
    int[] life4_7;
    java.lang.String life6_15;
    lexical_join_30: {
    lexical_join_29: {
    life2_3 = (moom.M7.m ^ 44595996612736L);
    spill941_0 = moom.M7.b__ArrayInt();
    life5_6 = 0;
    life4_7 = spill941_0;
    lexical_cycle_8: while (true) {
    lexical_join_27: {
    lexical_join_26: {
    if (!((life5_6 < (p1).length))) {
        break lexical_join_29;
    }
    life6_15 = (p1)[life5_6];
    if (!((life4_7 == null))) {
        break lexical_join_27;
    }
    spill941_1 = ((java.lang.String)(life6_15)).equals(((java.lang.Object)(p0)));
    if (!((life4_7 == null))) {
        lexicalValue941_30_0 = ((spill941_1) ? 1 : 0);
        break lexical_join_30;
    }
    if (!(spill941_1)) {
        break lexical_join_26;
    }
    return life5_6;
    }
    life5_6 += 1;
    }
    if (!((life4_7 != null))) { continue lexical_cycle_8; }
    break lexical_cycle_8;
    }
    }
    lexicalValue941_30_0 = -1;
    }
    return lexicalValue941_30_0;
}


public java.lang.String a__String() {
return this.a;
}


public java.lang.String[] a__ArrayString() {
return this.f;
}


public void a(java.lang.String[] p0) {
int[] spill942_0;
    long life2_3;
    java.util.List life5_7;
    java.lang.String[] life6_9;
    int life7_13;
    int[] life4_14;
    int life8_16;
    java.lang.String life9_23;
    lexical_join_40: {
    life2_3 = (moom.M7.m ^ 72796529311983L);
    life5_7 = java.util.Arrays.asList(((java.lang.Object[])(this.f)));
    life6_9 = p0;
    spill942_0 = moom.M7.b__ArrayInt();
    life7_13 = (life6_9).length;
    life4_14 = spill942_0;
    life8_16 = 0;
    lexical_cycle_17: while (true) {
    lexical_join_38: {
    lexical_join_37: {
    if (!((life8_16 < life7_13))) {
        break lexical_join_40;
    }
    life9_23 = (life6_9)[life8_16];
    if (!((life4_14 == null))) {
        break lexical_join_38;
    }
    if (!((!((java.util.List)(life5_7)).contains(((java.lang.Object)(life9_23)))))) {
        break lexical_join_37;
    }
    this.f = ((java.lang.String[])(((java.lang.String[])(moom.BU.a(((java.lang.Object[])(this.f)), ((java.lang.Object)(life9_23)))))));
    }
    life8_16 += 1;
    }
    if (!((life4_14 != null))) { continue lexical_cycle_17; }
    break lexical_cycle_17;
    }
    }
    return;
}


public void a__Void(java.lang.String p0) {
this.b = ((java.lang.String)(p0));
    return;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral6051_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/M7"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.M7.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 1295);
    if (((moom.M7.q)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.M7.r)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.M7.r)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/M7", life9_51);
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
        life9_116 = ((java.lang.String)((moom.M7.p)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.M7.q)[life5_8] = moom.M7.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.M7.q)[life5_8];
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
        byte[] spill3110_0 = p0;
        life4_9 += 1;
        life5_44 = (spill3110_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill3110_1 = p0;
        life4_9 += 1;
        life5_76 = (spill3110_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill3110_2 = p0;
        life4_9 += 1;
        life5_91 = (spill3110_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


public void a(boolean p0) {
this.g = ((boolean)(p0));
    return;
}


public void a__Void() {
this.c = ((java.lang.String)(this.e));
    return;
}


public java.lang.String a(java.lang.String p0) {
long local2_life2 = (moom.M7.m ^ 43748110262042L);
    java.lang.String __stackOp570_6_0 = this.a;
    java.lang.String __stackOp570_6_1 = p0;
    java.lang.String __stackOp570_6_2 = __sourceIntrinsic_c43bc540f167_originalDynamicSite570_5(26893, (8438718863522096875L ^ local2_life2));
    java.lang.String __sourceSpill570_8 = __stackOp570_6_2;
    java.lang.String __sourceSpill570_9 = __stackOp570_6_0;
    java.lang.String __sourceSpill570_10 = __stackOp570_6_1;
    recovery.source.CarrierOps.discard(__stackOp570_6_2);
    java.lang.String __stackOp570_11_0 = __sourceSpill570_10;
    java.lang.String __stackOp570_11_1 = ".";
    return moom.MP.a(((java.lang.String)(__sourceIntrinsic_c43bc540f167_originalDynamicSite570_12(__sourceSpill570_8, __sourceSpill570_9, __stackOp570_11_1, __stackOp570_11_0))), ((java.lang.String)(p0)));
}


public boolean a__Boolean(java.lang.String p0) {
int forwardValue2641_21_0;
    int[] spill2641_0;
    int spill2641_1;
    long life2_3;
    int life5_9;
    int[] life4_10;
    forward_join_21: {
    forward_join_17: {
    life2_3 = (moom.M7.m ^ 41037168890999L);
    spill2641_0 = moom.M7.b__ArrayInt();
    life5_9 = moom.M7.a(((java.lang.String)(p0)), ((java.lang.String[])(this.d)));
    life4_10 = spill2641_0;
    spill2641_1 = life5_9;
    if (!((life4_10 == null))) {
        forwardValue2641_21_0 = spill2641_1;
        break forward_join_21;
    }
    if (!((spill2641_1 < 0))) {
        break forward_join_17;
    }
    return ((0) != 0);
    }
    this.c = ((java.lang.String)(p0));
    forwardValue2641_21_0 = 1;
    }
    return ((forwardValue2641_21_0) != 0);
}


public void a(float p0) {
int forwardValue2638_27_0;
    int spill2638_0;
    long life2_3;
    int[] life4_5;
    float life1_20;
    int life5_30;
    forward_join_34: {
    forward_join_27: {
    life2_3 = (moom.M7.m ^ 107082691587349L);
    life4_5 = moom.M7.b__ArrayInt();
    spill2638_0 = (this.d).length;
    if (!((life4_5 == null))) {
        forwardValue2638_27_0 = spill2638_0;
        break forward_join_27;
    }
    if (!((spill2638_0 > 1))) {
        break forward_join_34;
    }
    life1_20 = moom.BU.a(((float)(p0)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)));
    forwardValue2638_27_0 = java.lang.Math.round(((float)((life1_20 * ((float) ((this.d).length - 1))))));
    }
    life5_30 = forwardValue2638_27_0;
    this.c = ((java.lang.String)((this.d)[life5_30]));
    }
    return;
}


public boolean a__Boolean() {
return ((((this.g) ? 1 : 0)) != 0);
}


public float a() {
int forwardValue2637_20_0;
    int forwardValue2637_28_0;
    int spill2637_0;
    int spill2637_1;
    long life1_3;
    int[] life3_5;
    int life4_25;
    forward_join_28: {
    forward_join_27: {
    forward_join_20: {
    forward_join_15: {
    life1_3 = (moom.M7.m ^ 91227504255533L);
    life3_5 = moom.M7.b__ArrayInt();
    spill2637_0 = (this.d).length;
    if (!((life3_5 == null))) {
        forwardValue2637_20_0 = spill2637_0;
        break forward_join_20;
    }
    if (!((spill2637_0 <= 1))) {
        break forward_join_15;
    }
    return 0x0.0p0f;
    }
    forwardValue2637_20_0 = moom.M7.a(((java.lang.String)(this.c)), ((java.lang.String[])(this.d)));
    }
    life4_25 = forwardValue2637_20_0;
    spill2637_1 = life4_25;
    if (!((life3_5 == null))) {
        forwardValue2637_28_0 = spill2637_1;
        break forward_join_28;
    }
    if (!((spill2637_1 < 0))) {
        break forward_join_27;
    }
    return 0x0.0p0f;
    }
    forwardValue2637_28_0 = life4_25;
    }
    return (((float) forwardValue2637_28_0) / (((float) (this.d).length) - 0x1.0p0f));
}


public java.lang.String g() {
return null;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c43bc540f167_originalDynamicSite570_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c43bc540f167_originalDynamicSite570_12(java.lang.String a0, java.lang.String a1, java.lang.String a2, java.lang.String a3) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral6051_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_fe670a2392c4_originalDynamicSite571_7(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_fe670a2392c4_originalDynamicSite571_11(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_fe670a2392c4_originalDynamicSite571_14(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_fe670a2392c4_originalDynamicSite571_15(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_1bc14720020d_originalDynamicSite572_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_1bc14720020d_originalDynamicSite572_7(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite1900_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite1900_10(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite1900_11(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite1900_12(java.lang.String a0, java.lang.String a1, java.lang.String a2, java.lang.String a3, java.lang.String a4, java.lang.String a5, java.lang.String a6) throws E;
}
