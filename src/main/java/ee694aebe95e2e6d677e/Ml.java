package moom;


public class Ml {

private final int a;

private final moom.J_[] b;

private static final long c;

private static final java.lang.String d;

public Ml(int p0, moom.J_[] p1) {
super();
    this.a = p0;
    this.b = p1;
}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(1736634479640387876L)), ((long)(-2512492048274607688L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(177891561646281L)))));
    long local0_life6 = (moom.Ml.c ^ 129140675104325L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill707_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill707_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill707_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill707_13 = new byte[8];
    (__sourceSpill707_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill707_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation707_15 = __sourceSpill707_13;
    ((javax.crypto.Cipher)(__sourceSpill707_10)).init(((int)(__sourceSpill707_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill707_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation707_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    byte[] __sourceSpill707_19 = ((java.lang.String)("a\036õ\t\025J")).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __sourceSpill707_20 = local2_life8;
    byte[] local4_life22 = ((javax.crypto.Cipher)(__sourceSpill707_20)).doFinal(((byte[])(__sourceSpill707_19)));
    d = ((java.lang.String)(((java.lang.String)(moom.Ml.a(((byte[])(local4_life22))))).intern()));
}


public java.lang.String toString() {
long local1_life2 = (moom.Ml.c ^ 79338753061760L);
    int __stackOp593_7_0 = this.a;
    java.lang.String __stackOp593_7_1 = moom.BU.a(((java.lang.Object[])(this.b)));
    java.lang.String __stackOp593_7_2 = moom.Ml.d;
    java.lang.String __sourceSpill593_9 = __stackOp593_7_2;
    int __sourceSpill593_10 = __stackOp593_7_0;
    java.lang.String __sourceSpill593_11 = __stackOp593_7_1;
    recovery.source.CarrierOps.discard(__stackOp593_7_2);
    java.lang.String __stackOp593_12_0 = __sourceSpill593_11;
    java.lang.String __stackOp593_12_1 = "=";
    return __sourceIntrinsic_a86c261fcdee_originalDynamicSite593_13(__sourceSpill593_9, __sourceSpill593_10, __stackOp593_12_1, __stackOp593_12_0);
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
        byte[] spill3240_0 = p0;
        life4_9 += 1;
        life5_44 = (spill3240_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill3240_1 = p0;
        life4_9 += 1;
        life5_76 = (spill3240_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill3240_2 = p0;
        life4_9 += 1;
        life5_91 = (spill3240_2)[life4_9];
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


public int a() {
return this.a;
}


public boolean a(int p0, int p1) {
int lexicalValue970_36_0;
    int spill970_0;
    boolean spill970_1;
    long life3_3;
    moom.J_[] life6_7;
    int life7_10;
    int life8_12;
    int life5_13;
    moom.J_ life9_20;
    lexical_join_36: {
    lexical_join_35: {
    life3_3 = (moom.Ml.c ^ 4246156452604L);
    spill970_0 = moom.MS.c();
    life6_7 = this.b;
    life7_10 = (life6_7).length;
    life8_12 = 0;
    life5_13 = spill970_0;
    lexical_cycle_14: while (true) {
    lexical_join_33: {
    lexical_join_32: {
    if (!((life8_12 < life7_10))) {
        break lexical_join_35;
    }
    life9_20 = (life6_7)[life8_12];
    if (!((life5_13 != 0))) {
        break lexical_join_33;
    }
    spill970_1 = ((moom.J_)(life9_20)).a(((int)(p0)), ((int)(p1)));
    if (!((life5_13 != 0))) {
        lexicalValue970_36_0 = ((spill970_1) ? 1 : 0);
        break lexical_join_36;
    }
    if (!(spill970_1)) {
        break lexical_join_32;
    }
    return ((1) != 0);
    }
    life8_12 += 1;
    }
    if (!((life5_13 == 0))) { continue lexical_cycle_14; }
    break lexical_cycle_14;
    }
    }
    lexicalValue970_36_0 = 0;
    }
    return ((lexicalValue970_36_0) != 0);
}


public int[] a__ArrayInt() {
java.util.HashSet lexicalValue971_40_0;
    int lexicalValue971_40_1;
    int spill971_0;
    java.util.HashSet spill971_1;
    int spill971_2;
    long life1_3;
    java.util.HashSet life4_7;
    moom.J_[] life5_10;
    int life6_14;
    int life3_15;
    int life7_17;
    moom.J_ life8_24;
    int life9_27;
    java.lang.Integer[] life5_46;
    lexical_join_40: {
    lexical_join_38: {
    life1_3 = (moom.Ml.c ^ 63809473144866L);
    life4_7 = new java.util.HashSet();
    life5_10 = this.b;
    spill971_0 = moom.MS.b();
    life6_14 = (life5_10).length;
    life3_15 = spill971_0;
    life7_17 = 0;
    lexical_cycle_18: while (true) {
    if (!((life7_17 < life6_14))) {
        break lexical_join_38;
    }
    life8_24 = (life5_10)[life7_17];
    life9_27 = ((moom.J_)(life8_24)).a();
    spill971_1 = life4_7;
    spill971_2 = life9_27;
    if (!((life3_15 == 0))) {
        lexicalValue971_40_0 = spill971_1;
        lexicalValue971_40_1 = spill971_2;
        break lexical_join_40;
    }
    ((java.util.Set)(spill971_1)).add(((java.lang.Object)(java.lang.Integer.valueOf(((int)(spill971_2))))));
    life7_17 += 1;
    if (!((life3_15 != 0))) { continue lexical_cycle_18; }
    break lexical_cycle_18;
    }
    }
    lexicalValue971_40_0 = life4_7;
    lexicalValue971_40_1 = 0;
    }
    life5_46 = ((java.lang.Integer[])(((java.util.Set)(lexicalValue971_40_0)).toArray(((java.lang.Object[])(new java.lang.Integer[lexicalValue971_40_1])))));
    return moom.BU.a(((java.lang.Integer[])(life5_46)));
}


public moom.J_[] a(int p0) {
moom.J_[] lexicalValue969_45_0;
    int spill969_0;
    moom.J_[] spill969_1;
    long life2_3;
    java.util.ArrayList life5_7;
    moom.J_[] life6_11;
    int life7_14;
    int life8_16;
    int life4_17;
    moom.J_ life9_26;
    lexical_join_45: {
    lexical_join_40: {
    life2_3 = (moom.Ml.c ^ 115800420465272L);
    life5_7 = new java.util.ArrayList();
    spill969_0 = moom.MS.b();
    life6_11 = this.b;
    life7_14 = (life6_11).length;
    life8_16 = 0;
    life4_17 = spill969_0;
    lexical_cycle_18: while (true) {
    lexical_join_38: {
    lexical_join_37: {
    if (!((life8_16 < life7_14))) {
        break lexical_join_40;
    }
    spill969_1 = life6_11;
    if (!((life4_17 == 0))) {
        lexicalValue969_45_0 = spill969_1;
        break lexical_join_45;
    }
    life9_26 = (spill969_1)[life8_16];
    if (!((life4_17 == 0))) {
        break lexical_join_38;
    }
    if (!((((moom.J_)(life9_26)).a() == p0))) {
        break lexical_join_37;
    }
    ((java.util.List)(life5_7)).add(((java.lang.Object)(life9_26)));
    }
    life8_16 += 1;
    }
    if (!((life4_17 != 0))) { continue lexical_cycle_18; }
    break lexical_cycle_18;
    }
    }
    lexicalValue969_45_0 = ((moom.J_[])(((java.util.List)(life5_7)).toArray(((java.lang.Object[])(new moom.J_[0])))));
    }
    return lexicalValue969_45_0;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite593_13(java.lang.String a0, int a1, java.lang.String a2, java.lang.String a3) throws E;
}
