package moom;


public class AS {

private moom.AZ[] a;

private int b;

private static long c;

private static long d;

public AS() { super(); }


private static void __sourceConstructorBody_b93756c0cc640f5e(moom.AS receiver) throws Throwable {

long local1 = (moom.AS.c ^ 13070664924606L);

    moom.AS.__sourceConstructorInit_b93756c0cc640f5e_0(((moom.AS)(receiver)));

    ((moom.AS)(receiver)).a = ((moom.AZ[])(new moom.AZ[((int) moom.AS.d)]));

    return;

}



static {
c = ((long)(((moom._a)(moom._c.a(((long)(-8187531931381756215L)), ((long)(5879363751454157329L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(235880895031998L)))));
    long local0_life6 = (moom.AS.c ^ 4966288971484L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill469_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill469_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill469_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill469_13 = new byte[8];
    (__sourceSpill469_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill469_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation469_15 = __sourceSpill469_13;
    ((javax.crypto.Cipher)(__sourceSpill469_10)).init(((int)(__sourceSpill469_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill469_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation469_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -6582136536651366957L;
    byte[] __sourceSpill469_19 = new byte[8];
    (__sourceSpill469_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill469_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill469_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill469_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill469_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill469_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill469_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill469_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill469_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill469_20)).doFinal(((byte[])(__sourceSpill469_19)));
    d = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}

private static native <E extends Throwable> void __sourceConstructorInit_b93756c0cc640f5e_0(moom.AS a0) throws E;

private void b(int p0) {
int lexicalValue172_81_0;
    int lexicalValue172_87_0;
    int lexicalValue172_101_0;
    int[] spill172_0;
    int spill172_1;
    int spill172_2;
    long life2_3;
    moom.AZ life5_9;
    int[] life4_10;
    float life6_13;
    int life7_19;
    int life8_23;
    moom.AZ life9_39;
    float life10_42;
    moom.AZ life11_48;
    float life12_50;
    lexical_join_112: {
    lexical_join_104: {
    life2_3 = (moom.AS.c ^ 123459045259266L);
    spill172_0 = moom.AV.b__ArrayInt();
    life5_9 = (this.a)[p0];
    life4_10 = spill172_0;
    life6_13 = ((moom.AZ)(life5_9)).h;
    lexical_cycle_14: while (true) {
    lexical_join_102: {
    lexical_join_101: {
    lexical_join_92: {
    lexical_join_87: {
    lexical_join_84: {
    lexical_join_81: {
    lexical_join_72: {
    lexical_join_58: {
    lexical_join_50: {
    lexical_join_32: {
    life7_19 = (1 + (p0 << 1));
    life8_23 = (life7_19 + 1);
    if (!((life7_19 >= this.b))) {
        break lexical_join_32;
    }
    if (!((life4_10 != null))) {
        break lexical_join_112;
    }
    if (!((life4_10 == null))) {
        break lexical_join_104;
    }
    }
    life9_39 = (this.a)[life7_19];
    life10_42 = ((moom.AZ)(life9_39)).h;
    if (!((life8_23 >= this.b))) {
        break lexical_join_50;
    }
    life11_48 = null;
    life12_50 = __sourceIntrinsic_8dbec06774c4_exactNonfiniteFloatLiteral172_8();
    if (!((life4_10 == null))) {
        break lexical_join_58;
    }
    }
    life11_48 = (this.a)[life8_23];
    life12_50 = ((moom.AZ)(life11_48)).h;
    }
    spill172_1 = recovery.source.CarrierOps.fcmpg(((float)(life10_42)), ((float)(life12_50)));
    if (!((life4_10 != null))) {
        lexicalValue172_87_0 = spill172_1;
        break lexical_join_87;
    }
    if (!((spill172_1 < 0))) {
        break lexical_join_84;
    }
    spill172_2 = recovery.source.CarrierOps.fcmpl(((float)(life10_42)), ((float)(life6_13)));
    if (!((life4_10 != null))) {
        lexicalValue172_81_0 = spill172_2;
        break lexical_join_81;
    }
    if (!((spill172_2 >= 0))) {
        break lexical_join_72;
    }
    if (!((life4_10 == null))) {
        break lexical_join_104;
    }
    }
    (this.a)[p0] = life9_39;
    ((moom.AZ)(life9_39)).e = ((int)(p0));
    lexicalValue172_81_0 = life7_19;
    }
    p0 = lexicalValue172_81_0;
    if (!((life4_10 == null))) {
        break lexical_join_102;
    }
    }
    lexicalValue172_87_0 = recovery.source.CarrierOps.fcmpl(((float)(life12_50)), ((float)(life6_13)));
    }
    if (!((life4_10 != null))) {
        lexicalValue172_101_0 = lexicalValue172_87_0;
        break lexical_join_101;
    }
    if (!((lexicalValue172_87_0 >= 0))) {
        break lexical_join_92;
    }
    if (!((life4_10 == null))) {
        break lexical_join_104;
    }
    }
    (this.a)[p0] = life11_48;
    ((moom.AZ)(life11_48)).e = ((int)(p0));
    lexicalValue172_101_0 = life8_23;
    }
    p0 = lexicalValue172_101_0;
    }
    if (!((life4_10 == null))) { continue lexical_cycle_14; }
    break lexical_cycle_14;
    }
    }
    (this.a)[p0] = life5_9;
    ((moom.AZ)(life5_9)).e = ((int)(p0));
    }
    return;
}


private void a(int p0) {
int lexicalValue467_47_0;
    int[] spill467_0;
    int spill467_1;
    long life2_3;
    moom.AZ life5_9;
    int[] life4_10;
    float life7_13;
    int life6_21;
    moom.AZ life8_26;
    lexical_join_58: {
    lexical_join_50: {
    life2_3 = (moom.AS.c ^ 113656369984413L);
    spill467_0 = moom.AV.b__ArrayInt();
    life5_9 = (this.a)[p0];
    life4_10 = spill467_0;
    life7_13 = ((moom.AZ)(life5_9)).h;
    lexical_cycle_14: while (true) {
    lexical_join_47: {
    lexical_join_38: {
    if (!((p0 > 0))) {
        break lexical_join_50;
    }
    life6_21 = ((p0 - 1) >> 1);
    life8_26 = (this.a)[life6_21];
    if (!((life4_10 != null))) {
        break lexical_join_58;
    }
    spill467_1 = recovery.source.CarrierOps.fcmpl(((float)(life7_13)), ((float)(((moom.AZ)(life8_26)).h)));
    if (!((life4_10 != null))) {
        lexicalValue467_47_0 = spill467_1;
        break lexical_join_47;
    }
    if (!((spill467_1 >= 0))) {
        break lexical_join_38;
    }
    if (!((life4_10 == null))) {
        break lexical_join_50;
    }
    }
    (this.a)[p0] = life8_26;
    ((moom.AZ)(life8_26)).e = ((int)(p0));
    lexicalValue467_47_0 = life6_21;
    }
    p0 = lexicalValue467_47_0;
    if (!((life4_10 == null))) { continue lexical_cycle_14; }
    break lexical_cycle_14;
    }
    }
    (this.a)[p0] = life5_9;
    ((moom.AZ)(life5_9)).e = ((int)(p0));
    }
    return;
}


public boolean a__Boolean() {
int forwardValue1429_12_0;
    int forwardValue1429_14_0;
    int spill1429_0;
    long life1_3;
    int[] life3_5;
    forward_join_14: {
    forward_join_13: {
    forward_join_12: {
    life1_3 = (moom.AS.c ^ 92308954368669L);
    life3_5 = moom.AV.b__ArrayInt();
    spill1429_0 = this.b;
    if (!((life3_5 != null))) {
        forwardValue1429_12_0 = spill1429_0;
        break forward_join_12;
    }
    if (!((spill1429_0 == 0))) {
        break forward_join_13;
    }
    forwardValue1429_12_0 = 1;
    }
    forwardValue1429_14_0 = forwardValue1429_12_0;
    break forward_join_14;
    }
    forwardValue1429_14_0 = 0;
    }
    return ((forwardValue1429_14_0) != 0);
}


private static java.lang.IllegalStateException a(java.lang.IllegalStateException p0) {
return p0;
}


public moom.AZ a(moom.AZ p0) {
int forestValue204_20_0;
    moom.AS forestValue204_52_0;
    int spill204_0;
    moom.AS spill204_1;
    int spill204_2;
    long life2_3;
    int[] life4_5;
    moom.AZ[] life5_31;
    forest_join_52: {
    forest_join_41: {
    forest_join_20: {
    forest_join_16: {
    life2_3 = (moom.AS.c ^ 134560964112525L);
    life4_5 = moom.AV.b__ArrayInt();
    spill204_0 = ((moom.AZ)(p0)).e;
    if (!((life4_5 != null))) {
        forestValue204_20_0 = spill204_0;
        break forest_join_20;
    }
    if (!((spill204_0 >= 0))) {
        break forest_join_16;
    }
    throw new java.lang.IllegalStateException("OW KNOWS!");
    }
    spill204_1 = this;
    if (!((life4_5 != null))) {
        forestValue204_52_0 = spill204_1;
        break forest_join_52;
    }
    forestValue204_20_0 = ((moom.AS)(spill204_1)).b;
    }
    if (!((forestValue204_20_0 == (this.a).length))) {
        break forest_join_41;
    }
    life5_31 = new moom.AZ[(this.b << 1)];
    java.lang.System.arraycopy(((java.lang.Object)(this.a)), ((int)(0)), ((java.lang.Object)(life5_31)), ((int)(0)), ((int)(this.b)));
    this.a = ((moom.AZ[])(life5_31));
    }
    (this.a)[this.b] = p0;
    ((moom.AZ)(p0)).e = ((int)(this.b));
    forestValue204_52_0 = this;
    }
    moom.AS __stackOp204_14_0 = this;
    moom.AS __stackOp204_16_0 = __stackOp204_14_0;
    int __stackOp204_16_1 = ((moom.AS)(__stackOp204_14_0)).b;
    spill204_2 = __stackOp204_16_1;
    ((moom.AS)(__stackOp204_16_0)).b = ((int)((__stackOp204_16_1 + 1)));
    ((moom.AS)(forestValue204_52_0)).a(((int)(spill204_2)));
    return p0;
}


public void a__Void() {
this.b = ((int)(0));
    return;
}


public moom.AZ a() {
long life1_3;
    moom.AZ life4_8;
    int[] life3_30;
    life1_3 = (moom.AS.c ^ 59429503724336L);
    life4_8 = (this.a)[0];
    int[] spill1426_0 = moom.AV.b__ArrayInt();
    moom.AZ[] spill1426_1 = this.a;
    int spill1426_2 = 0;
    moom.AZ[] spill1426_3 = this.a;
    moom.AS __stackOp1426_5_0 = this;
    moom.AS __stackOp1426_7_0 = __stackOp1426_5_0;
    int __stackOp1426_7_1 = (((moom.AS)(__stackOp1426_5_0)).b - 1);
    int spill1426_4 = __stackOp1426_7_1;
    ((moom.AS)(__stackOp1426_7_0)).b = ((int)(__stackOp1426_7_1));
    (spill1426_1)[spill1426_2] = (spill1426_3)[spill1426_4];
    (this.a)[this.b] = null;
    life3_30 = spill1426_0;
    if ((life3_30 != null)) {
        if ((this.b > 0)) {
        ((moom.AS)(this)).b(((int)(0)));
    }
        ((moom.AZ)(life4_8)).e = ((int)(-1));
    }
    return life4_8;
}


public void a(moom.AZ p0, float p1) {
long life3_3;
    float life6_7;
    int[] life5_8;
    forward_join_28: {
    forward_join_24: {
    forward_join_22: {
    life3_3 = (moom.AS.c ^ 65174207237986L);
    int[] spill1774_0 = moom.AV.b__ArrayInt();
    life6_7 = ((moom.AZ)(p0)).h;
    life5_8 = spill1774_0;
    ((moom.AZ)(p0)).h = ((float)(p1));
    if (!((life5_8 != null))) { break forward_join_22; }
    if (!((recovery.source.CarrierOps.fcmpg(((float)(p1)), ((float)(life6_7))) < 0))) { break forward_join_24; }
    ((moom.AS)(this)).a(((int)(((moom.AZ)(p0)).e)));
    }
    if (!((life5_8 == null))) { break forward_join_28; }
    }
    ((moom.AS)(this)).b(((int)(((moom.AZ)(p0)).e)));
    }
    return;
}


private static native <E extends Throwable> float __sourceIntrinsic_8dbec06774c4_exactNonfiniteFloatLiteral172_8() throws E;
}
