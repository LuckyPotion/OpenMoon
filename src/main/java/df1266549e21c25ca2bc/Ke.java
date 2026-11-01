package moom;


public class Ke {

private moom.Kd[] a;

private static final long b;

private static final java.lang.String c;

public Ke() {
super();
    this.a = new moom.Kd[0];
}


public Ke(moom.Kd p0) {
super();
    this.a = new moom.Kd[0];
    (this).a(p0);
}


static {
b = ((long)(((moom._a)(moom._c.a(((long)(-2010570142118157400L)), ((long)(6528005661227744228L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(193367928496054L)))));
    long local0_life6 = (moom.Ke.b ^ 113321220155853L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill652_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill652_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill652_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill652_13 = new byte[8];
    (__sourceSpill652_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill652_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation652_15 = __sourceSpill652_13;
    ((javax.crypto.Cipher)(__sourceSpill652_10)).init(((int)(__sourceSpill652_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill652_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation652_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    byte[] __sourceSpill652_19 = ((java.lang.String)("oæQä\006+p")).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __sourceSpill652_20 = local2_life8;
    byte[] local4_life22 = ((javax.crypto.Cipher)(__sourceSpill652_20)).doFinal(((byte[])(__sourceSpill652_19)));
    c = ((java.lang.String)(((java.lang.String)(moom.Ke.a(((byte[])(local4_life22))))).intern()));
}


public java.lang.String toString() {
int spill898_0;
    long life1_3;
    java.lang.StringBuilder life4_8;
    int life3_9;
    int life5_15;
    moom.Kd life6_25;
    lexical_join_48: {
    lexical_join_44: {
    life1_3 = (moom.Ke.b ^ 90789524136072L);
    spill898_0 = moom.J_.c();
    life4_8 = new java.lang.StringBuilder();
    life3_9 = spill898_0;
    ((java.lang.StringBuilder)(life4_8)).append(((java.lang.String)("[")));
    life5_15 = 0;
    lexical_cycle_16: while (true) {
    lexical_join_42: {
    lexical_join_36: {
    if (!((life5_15 < (this.a).length))) {
        break lexical_join_44;
    }
    life6_25 = (this.a)[life5_15];
    if (!((life3_9 != 0))) {
        break lexical_join_48;
    }
    if (!((life3_9 != 0))) {
        break lexical_join_42;
    }
    if (!((life5_15 > 0))) {
        break lexical_join_36;
    }
    ((java.lang.StringBuilder)(life4_8)).append(((java.lang.String)(moom.Ke.c)));
    }
    ((java.lang.StringBuilder)(life4_8)).append(((java.lang.String)(((moom.Kd)(life6_25)).toString())));
    life5_15 += 1;
    }
    if (!((life3_9 == 0))) { continue lexical_cycle_16; }
    break lexical_cycle_16;
    }
    }
    ((java.lang.StringBuilder)(life4_8)).append(((java.lang.String)("]")));
    }
    return ((java.lang.StringBuilder)(life4_8)).toString();
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
        byte[] spill2927_0 = p0;
        life4_9 += 1;
        life5_44 = (spill2927_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill2927_1 = p0;
        life4_9 += 1;
        life5_76 = (spill2927_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill2927_2 = p0;
        life4_9 += 1;
        life5_91 = (spill2927_2)[life4_9];
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


public void a(moom.Kd p0) {
this.a = ((moom.Kd[])(((moom.Kd[])(moom.BU.a(((java.lang.Object[])(this.a)), ((java.lang.Object)(p0)))))));
    return;
}


public boolean a__Boolean(int p0) {
int lexicalValue897_35_0;
    int spill897_0;
    boolean spill897_1;
    long life2_3;
    moom.Kd[] life5_6;
    int life6_10;
    int life7_12;
    int life4_13;
    moom.Kd life8_20;
    lexical_join_35: {
    lexical_join_34: {
    life2_3 = (moom.Ke.b ^ 83059753124205L);
    life5_6 = this.a;
    spill897_0 = moom.J_.b();
    life6_10 = (life5_6).length;
    life7_12 = 0;
    life4_13 = spill897_0;
    lexical_cycle_14: while (true) {
    lexical_join_32: {
    lexical_join_31: {
    if (!((life7_12 < life6_10))) {
        break lexical_join_34;
    }
    life8_20 = (life5_6)[life7_12];
    if (!((life4_13 == 0))) {
        break lexical_join_32;
    }
    spill897_1 = ((moom.Kd)(life8_20)).a(((int)(p0)));
    if (!((life4_13 == 0))) {
        lexicalValue897_35_0 = ((spill897_1) ? 1 : 0);
        break lexical_join_35;
    }
    if (!(spill897_1)) {
        break lexical_join_31;
    }
    return ((1) != 0);
    }
    life7_12 += 1;
    }
    if (!((life4_13 != 0))) { continue lexical_cycle_14; }
    break lexical_cycle_14;
    }
    }
    lexicalValue897_35_0 = 0;
    }
    return ((lexicalValue897_35_0) != 0);
}


public int a() {
return (this.a).length;
}


public moom.Kd a(int p0) {
return (this.a)[p0];
}

}
