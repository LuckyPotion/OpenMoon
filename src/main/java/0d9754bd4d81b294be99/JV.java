package moom;


public class JV {

public java.lang.String a;

public java.lang.String b;

public moom.DD[] c;

public moom.JW[] d;

private static long e;

private static java.lang.String[] f;

private static java.lang.String[] g;

private static java.util.Map h;

public JV(java.lang.String p0, moom.DD[] p1) { super(); }


private static void __sourceConstructorBody_54fba22c43a7dc2a(moom.JV receiver, java.lang.String p0, moom.DD[] p1) throws Throwable {

long local3 = (moom.JV.e ^ 140081187696275L);

    moom.JV.__sourceConstructorInit_54fba22c43a7dc2a_0(((moom.JV)(receiver)));

    ((moom.JV)(receiver)).a = ((java.lang.String)(null));

    ((moom.JV)(receiver)).b = ((java.lang.String)(null));

    ((moom.JV)(receiver)).c = ((moom.DD[])(null));

    ((moom.JV)(receiver)).d = ((moom.JW[])(null));

    moom.J3 local5 = new moom.J3(__sourceIntrinsic_54fba22c43a7dc2a_originalDynamicSite2222_6(2271, (3093536417986800910L ^ local3)));

    ((moom.JV)(receiver)).a = ((java.lang.String)(((moom.J3)(local5)).a__String(((java.lang.String)(p0)))));

    ((moom.JV)(receiver)).b = ((java.lang.String)(((moom.J3)(local5)).b(((java.lang.String)(p0)))));

    ((moom.JV)(receiver)).c = ((moom.DD[])(p1));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_54fba22c43a7dc2a_0(moom.JV a0) throws E;
private static native <E extends Throwable> void __sourceConstructorInit_08ab27b248270f93_0(moom.JV a0) throws E;

public JV(java.util.Properties p0, java.lang.String p1, moom.DD p2) { super(); }


private static void __sourceConstructorBody_08ab27b248270f93(moom.JV receiver, java.util.Properties p0, java.lang.String p1, moom.DD p2) throws Throwable {

long local4 = (moom.JV.e ^ 126769705438235L);

    moom.JV.__sourceConstructorInit_08ab27b248270f93_0(((moom.JV)(receiver)));

    ((moom.JV)(receiver)).a = ((java.lang.String)(null));

    ((moom.JV)(receiver)).b = ((java.lang.String)(null));

    ((moom.JV)(receiver)).c = ((moom.DD[])(null));

    ((moom.JV)(receiver)).d = ((moom.JW[])(null));

    moom.J3 local6 = new moom.J3(__sourceIntrinsic_08ab27b248270f93_originalDynamicSite2223_6(16572, (6956358913514129379L ^ local4)));

    ((moom.JV)(receiver)).a = ((java.lang.String)(((moom.J3)(local6)).a__String(((java.lang.String)(p1)))));

    ((moom.JV)(receiver)).b = ((java.lang.String)(((moom.J3)(local6)).b(((java.lang.String)(p1)))));

    ((moom.JV)(receiver)).d = ((moom.JW[])(((moom.JV)(receiver)).a(((java.util.Properties)(p0)), ((java.lang.String)(p1)), ((moom.DD)(p2)), ((moom.J3)(local6)))));

    return;

}



static {
e = ((long)(((moom._a)(moom._c.a(((long)(542387501916766429L)), ((long)(-2347927491941470411L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(125076262642377L)))));

    h = ((java.util.Map)(new java.util.HashMap(13)));

    long local0_life7 = (moom.JV.e ^ 78995654408559L);

    javax.crypto.Cipher local2_life9;

    javax.crypto.Cipher __sourceSpill721_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));

    int __sourceSpill721_12 = 2;

    javax.crypto.SecretKeyFactory __sourceSpill721_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));

    byte[] __sourceSpill721_14 = new byte[8];

    (__sourceSpill721_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));

    int local3_life15 = 1;

    while ((local3_life15 < 8)) {

        (__sourceSpill721_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));

        local3_life15 += 1;

    }

    byte[] __sourcePreallocation721_16 = __sourceSpill721_14;

    ((javax.crypto.Cipher)(__sourceSpill721_11)).init(((int)(__sourceSpill721_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill721_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation721_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));

    java.lang.String[] local9_life19 = new java.lang.String[6];

    int local7_life20 = 0;

    java.lang.String local6_life21;

    int local8_life23 = ((java.lang.String)((local6_life21 = ")ÚÀÔA¶4A1¾àóÅà4p\0323ÆÑ\00005Ëy\177\033gôð(3¤?-+\b]ª×\024á I4p\004ü¾o\002ýx*òô¯¡\034Ä\t\002D\f öat$»\021\025ð·\022¥s.A^\004ö²\017çx{r6_@ujÚ\001³\020\n¥\f;­\006ÅOs¹ ~Æë÷"))).length();

    int local5_life24 = 32;

    int local4_life25 = -1;

    while (true) {

        local4_life25 += 1;

        byte[] __sourceSpill721_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill721_29 = local2_life9;

        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill721_29)).doFinal(((byte[])(__sourceSpill721_28)));

        java.lang.String __sourceSpill721_34 = ((java.lang.String)(moom.JV.a(((byte[])(local10_life31))))).intern();

        java.lang.String[] __sourceSpill721_35 = local9_life19;

        int __sourceSpill721_36 = local7_life20;

        local7_life20 += 1;

        (__sourceSpill721_35)[__sourceSpill721_36] = __sourceSpill721_34;

        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }

        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));

    }

    local8_life23 = ((java.lang.String)((local6_life21 = "´¤¥Sõ~!\tãIåËçÐà==Ù\032\017wË(A­:íL¸»-\005;\036\t}¸)^ñ\036È´þ,\036nEÂiCY v]ÿf.(g"))).length();

    local5_life24 = 24;

    local4_life25 = -1;

    while (true) {

        local4_life25 += 1;

        byte[] __sourceSpill721_42 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill721_43 = local2_life9;

        byte[] local10_life45 = ((javax.crypto.Cipher)(__sourceSpill721_43)).doFinal(((byte[])(__sourceSpill721_42)));

        java.lang.String __sourceSpill721_48 = ((java.lang.String)(moom.JV.a(((byte[])(local10_life45))))).intern();

        java.lang.String[] __sourceSpill721_49 = local9_life19;

        int __sourceSpill721_50 = local7_life20;

        local7_life20 += 1;

        (__sourceSpill721_49)[__sourceSpill721_50] = __sourceSpill721_48;

        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }

        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));

    }

    f = ((java.lang.String[])(local9_life19));

    g = ((java.lang.String[])(new java.lang.String[6]));
}


private static moom.Oo a(moom.Oo p0) {
return p0;
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
        byte[] spill2691_0 = p0;
        life4_9 += 1;
        life5_44 = (spill2691_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill2691_1 = p0;
        life4_9 += 1;
        life5_76 = (spill2691_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill2691_2 = p0;
        life4_9 += 1;
        life5_91 = (spill2691_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 17624);
    if (((moom.JV.g)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.JV.h)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.JV.h)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/JV", life9_51);
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
        life9_116 = ((java.lang.String)((moom.JV.f)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.JV.g)[life5_8] = moom.JV.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.JV.g)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.JV.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral5204_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/JV"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private moom.JW[] a(java.util.Properties p0, java.lang.String p1, moom.DD p2, moom.J3 p3) {
java.lang.String lexicalValue841_49_0;
    net.minecraft.entity.Entity[] spill841_0;
    java.util.Properties spill841_1;
    java.lang.String spill841_2;
    java.util.Properties spill841_3;
    long life5_3;
    java.util.ArrayList life8_8;
    net.minecraft.entity.Entity[] life7_9;
    int life9_12;
    int life10_14;
    int life11_21;
    java.lang.String life12_32;
    moom.JW life13_62;
    lexical_join_73: {
    life5_3 = (moom.JV.e ^ 57817554673584L);
    spill841_0 = moom.JM.b__Arrayr3();
    life8_8 = new java.util.ArrayList();
    life7_9 = spill841_0;
    life9_12 = ((java.util.Properties)(p0)).size();
    life10_14 = 0;
    lexical_cycle_15: while (true) {
    lexical_join_71: {
    lexical_join_70: {
    lexical_join_49: {
    lexical_join_48: {
    if (!((life10_14 < life9_12))) {
        break lexical_join_73;
    }
    life11_21 = (life10_14 + 1);
    spill841_1 = p0;
    int __stackOp841_4_0 = life11_21;
    java.lang.String __stackOp841_4_1 = __sourceIntrinsic_8e32216e149c_invokedynamic841_3(27311, (8298557485195755103L ^ life5_3));
    life12_32 = ((java.util.Properties)(spill841_1)).getProperty(((java.lang.String)(__sourceIntrinsic_8e32216e149c_invokedynamic841_5(__stackOp841_4_1, __stackOp841_4_0))));
    spill841_2 = life12_32;
    if (!((life7_9 != null))) {
        lexicalValue841_49_0 = spill841_2;
        break lexical_join_49;
    }
    if (!((spill841_2 == null))) {
        break lexical_join_48;
    }
    spill841_3 = p0;
    int __stackOp841_8_0 = life11_21;
    java.lang.String __stackOp841_8_1 = __sourceIntrinsic_8e32216e149c_invokedynamic841_7(12114, (4233369711020653473L ^ life5_3));
    life12_32 = ((java.util.Properties)(spill841_3)).getProperty(((java.lang.String)(__sourceIntrinsic_8e32216e149c_invokedynamic841_9(__stackOp841_8_1, __stackOp841_8_0))));
    }
    lexicalValue841_49_0 = life12_32;
    }
    if (!((lexicalValue841_49_0 != null))) {
        break lexical_join_70;
    }
    life13_62 = new moom.JW(p0, p1, p2, life11_21, life12_32, p3);
    if (!((life7_9 != null))) {
        break lexical_join_71;
    }
    if (!(((moom.JW)(life13_62)).a(((java.lang.String)(p1))))) {
        break lexical_join_70;
    }
    ((java.util.List)(life8_8)).add(((java.lang.Object)(life13_62)));
    }
    life10_14 += 1;
    }
    if (!((life7_9 == null))) { continue lexical_cycle_15; }
    break lexical_cycle_15;
    }
    }
    return ((moom.JW[])(((java.util.List)(life8_8)).toArray(((java.lang.Object[])(new moom.JW[0])))));
}


public boolean a(java.lang.String p0) {
moom.JV lexicalValue840_28_0;
    moom.JW[] lexicalValue840_31_0;
    moom.JV lexicalValue840_61_0;
    moom.DD[] lexicalValue840_67_0;
    int lexicalValue840_103_0;
    moom.JV spill840_0;
    moom.JW[] spill840_1;
    boolean spill840_2;
    moom.DD[] spill840_3;
    boolean spill840_4;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    moom.JW[] life5_48;
    int life6_51;
    int life7_53;
    moom.JW life8_60;
    moom.DD[] life5_95;
    int life6_98;
    int life7_100;
    moom.DD life8_107;
    lexical_join_103: {
    lexical_join_102: {
    lexical_join_67: {
    lexical_join_61: {
    lexical_join_60: {
    lexical_join_31: {
    lexical_join_28: {
    lexical_join_27: {
    life2_3 = (moom.JV.e ^ 42181161766341L);
    life4_5 = moom.JM.b__Arrayr3();
    spill840_0 = this;
    if (!((life4_5 != null))) {
        lexicalValue840_28_0 = spill840_0;
        break lexical_join_28;
    }
    if (!((((moom.JV)(spill840_0)).c == null))) {
        break lexical_join_27;
    }
    spill840_1 = this.d;
    if (!((life4_5 != null))) {
        lexicalValue840_31_0 = spill840_1;
        break lexical_join_31;
    }
    if (!((spill840_1 == null))) {
        break lexical_join_27;
    }
    java.lang.String __stackOp840_5_0 = p0;
    java.lang.String __stackOp840_5_1 = __sourceIntrinsic_4b5a4712eca9_invokedynamic840_4(30214, (377808312457556098L ^ life2_3));
    moom.BU.c(((java.lang.String)(__sourceIntrinsic_4b5a4712eca9_invokedynamic840_6(__stackOp840_5_1, __stackOp840_5_0))));
    return ((0) != 0);
    }
    lexicalValue840_28_0 = this;
    }
    if (!((life4_5 != null))) {
        lexicalValue840_61_0 = lexicalValue840_28_0;
        break lexical_join_61;
    }
    lexicalValue840_31_0 = ((moom.JV)(lexicalValue840_28_0)).d;
    }
    if (!((lexicalValue840_31_0 != null))) {
        break lexical_join_60;
    }
    life5_48 = this.d;
    life6_51 = (life5_48).length;
    life7_53 = 0;
    lexical_cycle_40: while (true) {
    lexical_join_58: {
    lexical_join_57: {
    if (!((life7_53 < life6_51))) {
        break lexical_join_60;
    }
    life8_60 = (life5_48)[life7_53];
    if (!((life4_5 != null))) {
        break lexical_join_58;
    }
    spill840_2 = ((moom.JW)(life8_60)).a(((java.lang.String)(p0)));
    if (!((life4_5 != null))) {
        lexicalValue840_103_0 = ((spill840_2) ? 1 : 0);
        break lexical_join_103;
    }
    if (!((!spill840_2))) {
        break lexical_join_57;
    }
    return ((0) != 0);
    }
    life7_53 += 1;
    }
    if (!((life4_5 == null))) { continue lexical_cycle_40; }
    break lexical_cycle_40;
    }
    }
    lexicalValue840_61_0 = this;
    }
    spill840_3 = ((moom.JV)(lexicalValue840_61_0)).c;
    if (!((life4_5 != null))) {
        lexicalValue840_67_0 = spill840_3;
        break lexical_join_67;
    }
    if (!((spill840_3 != null))) {
        break lexical_join_102;
    }
    lexicalValue840_67_0 = this.c;
    }
    life5_95 = lexicalValue840_67_0;
    life6_98 = (life5_95).length;
    life7_100 = 0;
    lexical_cycle_73: while (true) {
    lexical_join_100: {
    lexical_join_99: {
    if (!((life7_100 < life6_98))) {
        break lexical_join_102;
    }
    life8_107 = (life5_95)[life7_100];
    if (!((life4_5 != null))) {
        break lexical_join_100;
    }
    spill840_4 = moom.BU.a__Boolean(((moom.DD)(life8_107)));
    if (!((life4_5 != null))) {
        lexicalValue840_103_0 = ((spill840_4) ? 1 : 0);
        break lexical_join_103;
    }
    if (!((!spill840_4))) {
        break lexical_join_99;
    }
    java.lang.String __stackOp840_20_0 = ((moom.DD)(life8_107)).a();
    java.lang.String __stackOp840_20_1 = __sourceIntrinsic_4b5a4712eca9_invokedynamic840_19(24857, (8753993940483893145L ^ life2_3));
    moom.BU.c(((java.lang.String)(__sourceIntrinsic_4b5a4712eca9_invokedynamic840_21(__stackOp840_20_1, __stackOp840_20_0))));
    return ((0) != 0);
    }
    life7_100 += 1;
    }
    if (!((life4_5 == null))) { continue lexical_cycle_73; }
    break lexical_cycle_73;
    }
    }
    lexicalValue840_103_0 = 1;
    }
    return ((lexicalValue840_103_0) != 0);
}


public boolean a() {
moom.JV forwardValue2317_12_0;
    int forwardValue2317_17_0;
    moom.JV spill2317_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_17: {
    forward_join_16: {
    forward_join_12: {
    life1_3 = (moom.JV.e ^ 129704697078866L);
    life3_5 = moom.JM.b__Arrayr3();
    spill2317_0 = this;
    if (!((life3_5 != null))) {
        forwardValue2317_12_0 = spill2317_0;
        break forward_join_12;
    }
    if (!((((moom.JV)(spill2317_0)).d == null))) {
        break forward_join_16;
    }
    forwardValue2317_12_0 = this;
    }
    if (!((((moom.JV)(forwardValue2317_12_0)).c == null))) {
        break forward_join_16;
    }
    forwardValue2317_17_0 = 1;
    break forward_join_17;
    }
    forwardValue2317_17_0 = 0;
    }
    return ((forwardValue2317_17_0) != 0);
}


public moom.DD a(moom.DD p0, moom.JJ p1) {
moom.JV lexicalValue842_44_0;
    int lexicalValue842_48_0;
    moom.JV spill842_0;
    boolean spill842_1;
    long life3_3;
    net.minecraft.entity.Entity[] life5_5;
    moom.JW[] life6_16;
    int life7_19;
    int life8_21;
    moom.JW life9_28;
    int life6_62;
    int life7_68;
    lexical_join_60: {
    lexical_join_48: {
    lexical_join_44: {
    lexical_join_43: {
    life3_3 = (moom.JV.e ^ 1797088841092L);
    life5_5 = moom.JM.b__Arrayr3();
    spill842_0 = this;
    if (!((life5_5 != null))) {
        lexicalValue842_44_0 = spill842_0;
        break lexical_join_44;
    }
    if (!((((moom.JV)(spill842_0)).d != null))) {
        break lexical_join_43;
    }
    life6_16 = this.d;
    life7_19 = (life6_16).length;
    life8_21 = 0;
    lexical_cycle_19: while (true) {
    lexical_join_41: {
    lexical_join_40: {
    if (!((life8_21 < life7_19))) {
        break lexical_join_43;
    }
    life9_28 = (life6_16)[life8_21];
    if (!((life5_5 != null))) {
        break lexical_join_41;
    }
    spill842_1 = ((moom.JW)(life9_28)).a(((moom.JJ)(p1)));
    if (!((life5_5 != null))) {
        lexicalValue842_48_0 = ((spill842_1) ? 1 : 0);
        break lexical_join_48;
    }
    if (!(spill842_1)) {
        break lexical_join_40;
    }
    return ((moom.JW)(life9_28)).a(((moom.DD)(p0)), ((int)(((moom.JJ)(p1)).a())));
    }
    life8_21 += 1;
    }
    if (!((life5_5 == null))) { continue lexical_cycle_19; }
    break lexical_cycle_19;
    }
    }
    lexicalValue842_44_0 = this;
    }
    if (!((((moom.JV)(lexicalValue842_44_0)).c != null))) {
        break lexical_join_60;
    }
    lexicalValue842_48_0 = ((moom.JJ)(p1)).a();
    }
    life6_62 = lexicalValue842_48_0;
    life7_68 = (life6_62 % (this.c).length);
    return (this.c)[life7_68];
    }
    return p0;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_54fba22c43a7dc2a_originalDynamicSite2222_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_08ab27b248270f93_originalDynamicSite2223_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral5204_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_8e32216e149c_invokedynamic841_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_8e32216e149c_invokedynamic841_5(java.lang.String a0, int a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_8e32216e149c_invokedynamic841_7(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_8e32216e149c_invokedynamic841_9(java.lang.String a0, int a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_4b5a4712eca9_invokedynamic840_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_4b5a4712eca9_invokedynamic840_6(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_4b5a4712eca9_invokedynamic840_19(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_4b5a4712eca9_invokedynamic840_21(java.lang.String a0, java.lang.String a1) throws E;
}
