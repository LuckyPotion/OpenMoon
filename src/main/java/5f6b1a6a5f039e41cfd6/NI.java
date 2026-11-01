package moom;


public class NI {

private java.util.ArrayList a;

private int b;

private float c;

private int d;

private static long e;

private static long f;

public NI(int p0, float p1) {
super();
    this.a = null;
    this.b = 0;
    this.c = 0x1.0000000000000p+0f;
    this.d = 0;
    this.a = new java.util.ArrayList(p0);
    this.b = p0;
    this.c = p1;
}

private static native <E extends Throwable> void __sourceConstructorInit_0f37e924fa1d5594_0(moom.NI a0, int a1, float a2) throws E;

public NI(int p0) {
this(p0, 0x1.8000000000000p-1f);
}


public NI() { this(0, 0.0F); }


private static void __sourceConstructorBody_0f37e924fa1d5594(moom.NI receiver) throws Throwable {

long local1_life1 = (moom.NI.e ^ 27130596173258L);

    moom.NI.__sourceConstructorInit_0f37e924fa1d5594_0(((moom.NI)(receiver)), ((int)(((int) moom.NI.f))), ((float)(0x1.8p-1f)));

    return;

}



static {
e = ((long)(((moom._a)(moom._c.a(((long)(-3834333018133457011L)), ((long)(3423971204550146873L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(116529110350407L)))));
    long local0_life6 = (moom.NI.e ^ 9653176322332L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill723_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill723_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill723_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill723_13 = new byte[8];
    (__sourceSpill723_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill723_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation723_15 = __sourceSpill723_13;
    ((javax.crypto.Cipher)(__sourceSpill723_10)).init(((int)(__sourceSpill723_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill723_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation723_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -3741977888101086101L;
    byte[] __sourceSpill723_19 = new byte[8];
    (__sourceSpill723_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill723_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill723_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill723_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill723_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill723_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill723_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill723_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill723_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill723_20)).doFinal(((byte[])(__sourceSpill723_19)));
    f = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


public void b__Void() {
int lexicalValue998_24_0;
    int lexicalValue998_31_0;
    int lexicalValue998_46_0;
    java.util.List lexicalValue998_92_0;
    int spill998_0;
    int spill998_1;
    int spill998_2;
    java.util.ArrayList spill998_3;
    long life1_3;
    int life3_5;
    float life4_58;
    int life5_70;
    int life6_72;
    java.lang.Object life7_82;
    lexical_join_93: {
    lexical_join_92: {
    lexical_join_78: {
    lexical_join_46: {
    lexical_join_31: {
    lexical_join_24: {
    lexical_join_21: {
    life1_3 = (moom.NI.e ^ 51925021447650L);
    life3_5 = moom.Ob.b();
    spill998_0 = this.d;
    if (!((life3_5 == 0))) {
        lexicalValue998_24_0 = spill998_0;
        break lexical_join_24;
    }
    if (!((spill998_0 <= 0))) {
        break lexical_join_21;
    }
    spill998_1 = ((java.util.ArrayList)(this.a)).size();
    if (!((life3_5 == 0))) {
        lexicalValue998_24_0 = spill998_1;
        break lexical_join_24;
    }
    if (!((spill998_1 == 0))) {
        break lexical_join_21;
    }
    ((moom.NI)(this)).a__Void();
    if (!((life3_5 != 0))) {
        break lexical_join_93;
    }
    }
    lexicalValue998_24_0 = ((java.util.ArrayList)(this.a)).size();
    }
    if (!((life3_5 == 0))) {
        lexicalValue998_31_0 = lexicalValue998_24_0;
        break lexical_join_31;
    }
    if (!((lexicalValue998_24_0 > this.b))) {
        break lexical_join_93;
    }
    lexicalValue998_31_0 = this.d;
    }
    life4_58 = (((float) lexicalValue998_31_0) / ((float) ((java.util.ArrayList)(this.a)).size()));
    spill998_2 = recovery.source.CarrierOps.fcmpg(((float)(life4_58)), ((float)(this.c)));
    if (!((life3_5 == 0))) {
        lexicalValue998_46_0 = spill998_2;
        break lexical_join_46;
    }
    if (!((spill998_2 <= 0))) {
        break lexical_join_93;
    }
    lexicalValue998_46_0 = 0;
    }
    life5_70 = lexicalValue998_46_0;
    life6_72 = 0;
    lexical_cycle_49: while (true) {
    lexical_join_76: {
    lexical_join_75: {
    lexical_join_74: {
    if (!((life6_72 < ((java.util.ArrayList)(this.a)).size()))) {
        break lexical_join_78;
    }
    life7_82 = ((java.util.ArrayList)(this.a)).get(((int)(life6_72)));
    if (!((life3_5 == 0))) {
        break lexical_join_93;
    }
    if (!((life3_5 == 0))) {
        break lexical_join_76;
    }
    if (!((life7_82 != null))) {
        break lexical_join_75;
    }
    if (!((life6_72 != life5_70))) {
        break lexical_join_74;
    }
    ((java.util.ArrayList)(this.a)).set(((int)(life5_70)), ((java.lang.Object)(life7_82)));
    }
    life5_70 += 1;
    }
    life6_72 += 1;
    }
    if (!((life3_5 != 0))) { continue lexical_cycle_49; }
    break lexical_cycle_49;
    }
    }
    spill998_3 = this.a;
    if (!((life3_5 == 0))) {
        lexicalValue998_92_0 = spill998_3;
        break lexical_join_92;
    }
    if (!((((java.util.ArrayList)(spill998_3)).size() > life5_70))) {
        break lexical_join_93;
    }
    lexicalValue998_92_0 = ((java.util.ArrayList)(this.a)).subList(((int)(life5_70)), ((int)(((java.util.ArrayList)(this.a)).size())));
    }
    ((java.util.List)(lexicalValue998_92_0)).clear();
    }
    return;
}


public boolean b(java.lang.Object p0) {
return (__sourceIntrinsic_booleanComparison((((java.util.ArrayList)(this.a)).contains(((java.lang.Object)(p0))))) != 0);
}


public java.lang.Object b(int p0) {
return ((java.util.ArrayList)(this.a)).get(((int)(p0)));
}


public int b() {
return this.d;
}


public int a() {
return ((java.util.ArrayList)(this.a)).size();
}


public boolean a(java.lang.Object p0) {
long life2_3;
    life2_3 = (moom.NI.e ^ 89798654511055L);
    if ((p0 != null)) {
        moom.NI __stackOp2801_1_0 = this;
        ((moom.NI)(__stackOp2801_1_0)).d = ((int)((((moom.NI)(__stackOp2801_1_0)).d + 1)));
    }
    return ((java.util.ArrayList)(this.a)).add(((java.lang.Object)(p0)));
}


public void a__Void(int p0, java.lang.Object p1) {
long life3_3;
    int life5_5;
    life3_3 = (moom.NI.e ^ 63294065225064L);
    life5_5 = moom.Ob.c();
    if ((life5_5 != 0)) {
        if ((p1 != null)) {
        moom.NI __stackOp2802_2_0 = this;
        ((moom.NI)(__stackOp2802_2_0)).d = ((int)((((moom.NI)(__stackOp2802_2_0)).d + 1)));
    }
        ((java.util.ArrayList)(this.a)).add(((int)(p0)), ((java.lang.Object)(p1)));
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a__Void() {
((java.util.ArrayList)(this.a)).clear();
    this.d = ((int)(0));
    return;
}


public java.lang.Object a(int p0) {
java.lang.Object forwardValue2799_22_0;
    int spill2799_0;
    java.lang.Object spill2799_1;
    long life2_3;
    java.lang.Object life5_9;
    int life4_10;
    forward_join_22: {
    forward_join_21: {
    life2_3 = (moom.NI.e ^ 31827580865162L);
    spill2799_0 = moom.Ob.c();
    life5_9 = ((java.util.ArrayList)(this.a)).remove(((int)(p0)));
    life4_10 = spill2799_0;
    spill2799_1 = life5_9;
    if (!((life4_10 != 0))) {
        forwardValue2799_22_0 = spill2799_1;
        break forward_join_22;
    }
    if (!((spill2799_1 != null))) {
        break forward_join_21;
    }
    moom.NI __stackOp2799_4_0 = this;
    ((moom.NI)(__stackOp2799_4_0)).d = ((int)((((moom.NI)(__stackOp2799_4_0)).d - 1)));
    }
    forwardValue2799_22_0 = life5_9;
    }
    return forwardValue2799_22_0;
}


public java.lang.Object a(int p0, java.lang.Object p1) {
java.lang.Object forwardValue2800_28_0;
    java.lang.Object forwardValue2800_38_0;
    int spill2800_0;
    java.lang.Object spill2800_1;
    java.lang.Object spill2800_2;
    long life3_3;
    java.lang.Object life6_10;
    int life5_11;
    forward_join_38: {
    forward_join_37: {
    forward_join_28: {
    forward_join_27: {
    life3_3 = (moom.NI.e ^ 126492553185306L);
    spill2800_0 = moom.Ob.c();
    life6_10 = ((java.util.ArrayList)(this.a)).set(((int)(p0)), ((java.lang.Object)(p1)));
    life5_11 = spill2800_0;
    spill2800_1 = p1;
    if (!((life5_11 != 0))) {
        forwardValue2800_38_0 = spill2800_1;
        break forward_join_38;
    }
    if (!((spill2800_1 != life6_10))) {
        break forward_join_37;
    }
    spill2800_2 = life6_10;
    if (!((life5_11 != 0))) {
        forwardValue2800_28_0 = spill2800_2;
        break forward_join_28;
    }
    if (!((spill2800_2 == null))) {
        break forward_join_27;
    }
    moom.NI __stackOp2800_4_0 = this;
    ((moom.NI)(__stackOp2800_4_0)).d = ((int)((((moom.NI)(__stackOp2800_4_0)).d + 1)));
    }
    forwardValue2800_28_0 = p1;
    }
    if (!((life5_11 != 0))) {
        forwardValue2800_38_0 = forwardValue2800_28_0;
        break forward_join_38;
    }
    if (!((forwardValue2800_28_0 == null))) {
        break forward_join_37;
    }
    moom.NI __stackOp2800_7_0 = this;
    ((moom.NI)(__stackOp2800_7_0)).d = ((int)((((moom.NI)(__stackOp2800_7_0)).d - 1)));
    }
    forwardValue2800_38_0 = life6_10;
    }
    return forwardValue2800_38_0;
}


public boolean a__Boolean() {
return (__sourceIntrinsic_booleanComparison((((java.util.ArrayList)(this.a)).isEmpty())) != 0);
}


private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
