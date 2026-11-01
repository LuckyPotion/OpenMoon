package moom;


class NX<T> implements java.util.Iterator<moom.NY<T>> {

moom.NY<T> a;

moom.NW b;

private static long c;

private static java.lang.String d;

NX(moom.NW p0) { super(); }


private static void __sourceConstructorBody_1cffb914ea565220(moom.NX receiver, moom.NW p0) throws Throwable {

((moom.NX)(receiver)).b = ((moom.NW)(p0));

    moom.NX.__sourceConstructorInit_1cffb914ea565220_0(((moom.NX)(receiver)));

    ((moom.NX)(receiver)).a = ((moom.NY)(((moom.NW)(((moom.NX)(receiver)).b)).a__NY()));

    return;

}



static {
c = ((long)(((moom._a)(moom._c.a(((long)(9063351269320736788L)), ((long)(3605401338852812384L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(49017747735220L)))));
    long local0_life6 = (moom.NX.c ^ 6592197675151L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill728_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill728_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill728_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill728_13 = new byte[8];
    (__sourceSpill728_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill728_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation728_15 = __sourceSpill728_13;
    ((javax.crypto.Cipher)(__sourceSpill728_10)).init(((int)(__sourceSpill728_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill728_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation728_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    byte[] __sourceSpill728_19 = ((java.lang.String)("}¿4¼Íd")).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __sourceSpill728_20 = local2_life8;
    byte[] local4_life22 = ((javax.crypto.Cipher)(__sourceSpill728_20)).doFinal(((byte[])(__sourceSpill728_19)));
    d = ((java.lang.String)(((java.lang.String)(moom.NX.a(((byte[])(local4_life22))))).intern()));
}

private static native <E extends Throwable> void __sourceConstructorInit_1cffb914ea565220_0(moom.NX a0) throws E;

public void remove() {
long local1 = (moom.NX.c ^ 60254253659875L);
    throw new java.lang.UnsupportedOperationException(moom.NX.d);
}


public boolean hasNext() {
long local1 = (moom.NX.c ^ 4941233574824L);
    return ((((this.a != null) ? 1 : 0)) != 0);
}


public moom.NY<T> a() {
moom.NY forwardValue2834_20_0;
    int spill2834_0;
    moom.NY spill2834_1;
    long life1_3;
    moom.NY life4_7;
    int life3_8;
    forward_join_20: {
    forward_join_19: {
    life1_3 = (moom.NX.c ^ 60947285439804L);
    spill2834_0 = moom.Ob.b();
    life4_7 = this.a;
    life3_8 = spill2834_0;
    spill2834_1 = this.a;
    if (!((life3_8 == 0))) {
        forwardValue2834_20_0 = spill2834_1;
        break forward_join_20;
    }
    if (!((spill2834_1 != null))) {
        break forward_join_19;
    }
    this.a = ((moom.NY)(((moom.NY)(this.a)).c));
    }
    forwardValue2834_20_0 = life4_7;
    }
    return forwardValue2834_20_0;
}


private static java.lang.UnsupportedOperationException a(java.lang.UnsupportedOperationException p0) {
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
        byte[] spill3352_0 = p0;
        life4_9 += 1;
        life5_44 = (spill3352_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill3352_1 = p0;
        life4_9 += 1;
        life5_76 = (spill3352_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill3352_2 = p0;
        life4_9 += 1;
        life5_91 = (spill3352_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


public java.lang.Object next__sourceBridge_0502b11602() {
return ((moom.NX)(this)).a();
}

public moom.NY<T> next() { return ((moom.NY<T>)(this.next__sourceBridge_0502b11602())); }
}
