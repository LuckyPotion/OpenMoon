package moom;


public class Lr implements moom.Lx {

private final moom.bT a;

private final moom.Lu[] b;

private int c;

private static final long d;

private static final java.lang.String e;

public Lr(moom.bT p0, moom.Lu[] p1) {
super();
    this.c = -1;
    this.a = p0;
    this.b = p1;
}


static {
d = ((long)(((moom._a)(moom._c.a(((long)(-2547014941576325807L)), ((long)(4136696656250502081L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(109097255305891L)))));
    long local0_life6 = (moom.Lr.d ^ 107553935379797L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill683_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill683_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill683_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill683_13 = new byte[8];
    (__sourceSpill683_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill683_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation683_15 = __sourceSpill683_13;
    ((javax.crypto.Cipher)(__sourceSpill683_10)).init(((int)(__sourceSpill683_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill683_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation683_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    byte[] __sourceSpill683_19 = ((java.lang.String)("iýDh19ô/")).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __sourceSpill683_20 = local2_life8;
    byte[] local4_life22 = ((javax.crypto.Cipher)(__sourceSpill683_20)).doFinal(((byte[])(__sourceSpill683_19)));
    e = ((java.lang.String)(((java.lang.String)(moom.Lr.a(((byte[])(local4_life22))))).intern()));
}


public java.lang.String toString() {
long local1 = (moom.Lr.d ^ 117701624591411L);
    return __sourceIntrinsic_a86c261fcdee_originalDynamicSite1269_3(this.a, moom.Lr.e);
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
        byte[] spill3065_0 = p0;
        life4_9 += 1;
        life5_44 = (spill3065_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill3065_1 = p0;
        life4_9 += 1;
        life5_76 = (spill3065_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill3065_2 = p0;
        life4_9 += 1;
        life5_91 = (spill3065_2)[life4_9];
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


public float a() {
moom.Lu[] forwardValue2600_33_0;
    float forwardValue2600_37_0;
    moom.Lu[] forwardValue2600_45_0;
    float forwardValue2600_49_0;
    int forwardValue2600_60_0;
    moom.bT forwardValue2600_67_0;
    java.lang.String[] spill2600_0;
    moom.bT spill2600_1;
    moom.Lu[] spill2600_2;
    moom.Lu[] spill2600_3;
    int spill2600_4;
    long life1_3;
    moom.Lu[] life4_7;
    java.lang.String[] life3_8;
    moom.Lu life5_21;
    float life6_28;
    float life7_46;
    float life8_64;
    forward_join_67: {
    forward_join_65: {
    forward_join_60: {
    forward_join_58: {
    forward_join_49: {
    forward_join_48: {
    forward_join_45: {
    forward_join_37: {
    forward_join_36: {
    forward_join_33: {
    life1_3 = (moom.Lr.d ^ 48393219802801L);
    spill2600_0 = moom.bS.b();
    life4_7 = this.b;
    life3_8 = spill2600_0;
    spill2600_1 = this.a;
    if (!((life3_8 != null))) {
        forwardValue2600_67_0 = spill2600_1;
        break forward_join_67;
    }
    if (!((spill2600_1 == moom.bT.SMOOTH))) {
        break forward_join_65;
    }
    life5_21 = (life4_7)[0];
    if (!((((life5_21 instanceof moom.Ll) ? 1 : 0) == 0))) {
        break forward_join_65;
    }
    life6_28 = moom.Lr.a(((moom.Lu[])(life4_7)), ((int)(0)));
    spill2600_2 = life4_7;
    if (!((life3_8 != null))) {
        forwardValue2600_33_0 = spill2600_2;
        break forward_join_33;
    }
    if (!(((spill2600_2).length > 1))) {
        break forward_join_36;
    }
    forwardValue2600_33_0 = life4_7;
    }
    forwardValue2600_37_0 = moom.Lr.a(((moom.Lu[])(forwardValue2600_33_0)), ((int)(1)));
    break forward_join_37;
    }
    forwardValue2600_37_0 = 0x1.0p0f;
    }
    life7_46 = forwardValue2600_37_0;
    spill2600_3 = life4_7;
    if (!((life3_8 != null))) {
        forwardValue2600_45_0 = spill2600_3;
        break forward_join_45;
    }
    if (!(((spill2600_3).length > 2))) {
        break forward_join_48;
    }
    forwardValue2600_45_0 = life4_7;
    }
    forwardValue2600_49_0 = moom.Lr.a(((moom.Lu[])(forwardValue2600_45_0)), ((int)(2)));
    break forward_join_49;
    }
    forwardValue2600_49_0 = life7_46;
    }
    life8_64 = forwardValue2600_49_0;
    spill2600_4 = this.c;
    if (!((life3_8 != null))) {
        forwardValue2600_60_0 = spill2600_4;
        break forward_join_60;
    }
    if (!((spill2600_4 < 0))) {
        break forward_join_58;
    }
    this.c = ((int)(moom.NA.a()));
    }
    forwardValue2600_60_0 = this.c;
    }
    return moom.NA.a(((int)(forwardValue2600_60_0)), ((float)(life6_28)), ((float)(life7_46)), ((float)(life8_64)));
    }
    forwardValue2600_67_0 = this.a;
    }
    return ((moom.bT)(forwardValue2600_67_0)).a(((moom.Lu[])(this.b)));
}


private static float a(moom.Lu[] p0, int p1) {
java.lang.Object local2 = ((moom.Lx)((p0)[p1]));
    return ((moom.Lx)(local2)).a();
}


public moom.bS a__bS() {
return moom.bS.FLOAT;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite1269_3(moom.bT a0, java.lang.String a1) throws E;
}
