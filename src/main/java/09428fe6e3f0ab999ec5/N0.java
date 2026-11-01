package moom;


public class N0 {

private int a;

private static final long b;

private static final java.lang.String c;

public N0() {
super();
}


static {
b = ((long)(((moom._a)(moom._c.a(((long)(-1317481950340053159L)), ((long)(-424539713432969840L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(198235340285026L)))));
    long local0_life6 = (moom.N0.b ^ 3876707884394L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill714_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill714_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill714_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill714_13 = new byte[8];
    (__sourceSpill714_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill714_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation714_15 = __sourceSpill714_13;
    ((javax.crypto.Cipher)(__sourceSpill714_10)).init(((int)(__sourceSpill714_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill714_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation714_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    byte[] __sourceSpill714_19 = ((java.lang.String)(">ì\034µ\006ÈðqS%Ã7¾")).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __sourceSpill714_20 = local2_life8;
    byte[] local4_life22 = ((javax.crypto.Cipher)(__sourceSpill714_20)).doFinal(((byte[])(__sourceSpill714_19)));
    c = ((java.lang.String)(((java.lang.String)(moom.N0.a(((byte[])(local4_life22))))).intern()));
}


public java.lang.String toString() {
long local1_life2 = (moom.N0.b ^ 91611215415947L);
    int __stackOp598_5_0 = this.a;
    java.lang.String __stackOp598_5_1 = moom.N0.c;
    return __sourceIntrinsic_a86c261fcdee_originalDynamicSite598_6(__stackOp598_5_1, __stackOp598_5_0);
}


public boolean b() {
int forwardValue2761_21_0;
    int forwardValue2761_25_0;
    int forwardValue2761_27_0;
    int spill2761_0;
    long life1_3;
    int life3_5;
    forward_join_27: {
    forward_join_26: {
    forward_join_25: {
    forward_join_21: {
    forward_join_13: {
    life1_3 = (moom.N0.b ^ 92750792818231L);
    life3_5 = moom.Ob.c();
    spill2761_0 = this.a;
    if (!((life3_5 != 0))) {
        forwardValue2761_21_0 = spill2761_0;
        break forward_join_21;
    }
    if (!((spill2761_0 <= 0))) {
        break forward_join_13;
    }
    return ((0) != 0);
    }
    moom.N0 __stackOp2761_4_0 = this;
    ((moom.N0)(__stackOp2761_4_0)).a = ((int)((((moom.N0)(__stackOp2761_4_0)).a - 1)));
    forwardValue2761_21_0 = this.a;
    }
    if (!((life3_5 != 0))) {
        forwardValue2761_25_0 = forwardValue2761_21_0;
        break forward_join_25;
    }
    if (!((forwardValue2761_21_0 == 0))) {
        break forward_join_26;
    }
    forwardValue2761_25_0 = 1;
    }
    forwardValue2761_27_0 = forwardValue2761_25_0;
    break forward_join_27;
    }
    forwardValue2761_27_0 = 0;
    }
    return ((forwardValue2761_27_0) != 0);
}


public boolean c() {
int forwardValue2762_12_0;
    int forwardValue2762_14_0;
    int spill2762_0;
    long life1_3;
    int life3_5;
    forward_join_14: {
    forward_join_13: {
    forward_join_12: {
    life1_3 = (moom.N0.b ^ 75603932502374L);
    life3_5 = moom.Ob.c();
    spill2762_0 = this.a;
    if (!((life3_5 != 0))) {
        forwardValue2762_12_0 = spill2762_0;
        break forward_join_12;
    }
    if (!((spill2762_0 > 0))) {
        break forward_join_13;
    }
    forwardValue2762_12_0 = 1;
    }
    forwardValue2762_14_0 = forwardValue2762_12_0;
    break forward_join_14;
    }
    forwardValue2762_14_0 = 0;
    }
    return ((forwardValue2762_14_0) != 0);
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
        byte[] spill3265_0 = p0;
        life4_9 += 1;
        life5_44 = (spill3265_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill3265_1 = p0;
        life4_9 += 1;
        life5_76 = (spill3265_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill3265_2 = p0;
        life4_9 += 1;
        life5_91 = (spill3265_2)[life4_9];
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


public boolean a__Boolean() {
int forwardValue2760_19_0;
    int forwardValue2760_21_0;
    int spill2760_0;
    int spill2760_1;
    long life1_3;
    int life3_11;
    forward_join_21: {
    forward_join_20: {
    forward_join_19: {
    life1_3 = (moom.N0.b ^ 55001362550798L);
    spill2760_0 = moom.Ob.c();
    moom.N0 __stackOp2760_2_0 = this;
    ((moom.N0)(__stackOp2760_2_0)).a = ((int)((((moom.N0)(__stackOp2760_2_0)).a + 1)));
    life3_11 = spill2760_0;
    spill2760_1 = this.a;
    if (!((life3_11 != 0))) {
        forwardValue2760_19_0 = spill2760_1;
        break forward_join_19;
    }
    if (!((spill2760_1 == 1))) {
        break forward_join_20;
    }
    forwardValue2760_19_0 = 1;
    }
    forwardValue2760_21_0 = forwardValue2760_19_0;
    break forward_join_21;
    }
    forwardValue2760_21_0 = 0;
    }
    return ((forwardValue2760_21_0) != 0);
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite598_6(java.lang.String a0, int a1) throws E;
}
