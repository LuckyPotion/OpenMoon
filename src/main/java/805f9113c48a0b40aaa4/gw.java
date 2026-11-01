package moom;


public class gw extends moom.gc {

private moom.bW r;

private static final long s;

private static final java.lang.String t;

public gw(moom.bW p0, int p1, int p2, int p3, int p4) {
super((p0).ordinal(), p1, p2, p3, p4, __sourceExactCall_cb91d724585e17(p0));
    this.r = null;
    this.r = p0;
}


static {
s = ((long)(((moom._a)(moom._c.a(((long)(6170261343906218395L)), ((long)(6078974430595592728L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(562571300760L)))));
    long local0_life6 = (moom.gw.s ^ 53802647818440L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill856_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill856_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill856_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill856_13 = new byte[8];
    (__sourceSpill856_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill856_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation856_15 = __sourceSpill856_13;
    ((javax.crypto.Cipher)(__sourceSpill856_10)).init(((int)(__sourceSpill856_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill856_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation856_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    byte[] __sourceSpill856_19 = ((java.lang.String)("Èº¹±À\007")).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __sourceSpill856_20 = local2_life8;
    byte[] local4_life22 = ((javax.crypto.Cipher)(__sourceSpill856_20)).doFinal(((byte[])(__sourceSpill856_19)));
    t = ((java.lang.String)(((java.lang.String)(moom.gw.a(((byte[])(local4_life22))))).intern()));
}


private static moom.Oo b(moom.Oo p0) {
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
        byte[] spill4139_0 = p0;
        life4_9 += 1;
        life5_44 = (spill4139_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill4139_1 = p0;
        life4_9 += 1;
        life5_76 = (spill4139_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill4139_2 = p0;
        life4_9 += 1;
        life5_91 = (spill4139_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


public void a__Void() {
((moom.gw)(this)).k = ((java.lang.String)(__sourceExactCall_cb91d724585e17(((moom.bW)(this.r)))));
    return;
}


private static java.lang.String a(moom.bW p0) {
long local1 = (moom.gw.s ^ 132842021498148L);
    java.lang.String local3 = __sourceIntrinsic_38a49d0f6d1e_invokedynamic6544_4(moom.oO.a(((java.lang.String)(((moom.bW)(p0)).a())), ((java.lang.Object[])(new java.lang.Object[0]))), moom.gw.t);
    switch ((moom.Ni.a)[((moom.bW)(p0)).ordinal()]) {
case 1:
{
        return __sourceIntrinsic_38a49d0f6d1e_invokedynamic6544_9(local3, __sourceExactCall_2e19a13ed33823(((int)(moom.MP.dP))));
    }
case 2:
{
        return __sourceIntrinsic_38a49d0f6d1e_invokedynamic6544_12(local3, __sourceExactCall_0ce2d252ec603a(((boolean)(moom.MP.dL))));
    }
case 3:
{
        return __sourceIntrinsic_38a49d0f6d1e_invokedynamic6544_15(local3, __sourceExactCall_0ce2d252ec603a(((boolean)(moom.MP.dM))));
    }
case 4:
{
        return __sourceIntrinsic_38a49d0f6d1e_invokedynamic6544_18(local3, __sourceExactCall_f3c8d8c37a327b(((float)(moom.MP.dC))));
    }
case 5:
{
        return __sourceIntrinsic_38a49d0f6d1e_invokedynamic6544_21(local3, __sourceExactCall_f3c8d8c37a327b(((float)(moom.MP.dD))));
    }
case 6:
{
        return __sourceIntrinsic_38a49d0f6d1e_invokedynamic6544_24(local3, __sourceExactCall_b69ce277f2e88c(((float)(moom.MP.dB))));
    }
case 7:
{
        return __sourceIntrinsic_38a49d0f6d1e_invokedynamic6544_27(local3, __sourceExactCall_0ce2d252ec603a(((boolean)(moom.MP.dA))));
    }
case 8:
{
        return __sourceIntrinsic_38a49d0f6d1e_invokedynamic6544_30(local3, ((moom.M0)(moom.MP.dO)).a__String());
    }
case 9:
{
        return __sourceIntrinsic_38a49d0f6d1e_invokedynamic6544_33(local3, ((moom.M0)(moom.MP.dN)).a__String());
    }
case 10:
{
        return __sourceIntrinsic_38a49d0f6d1e_invokedynamic6544_36(local3, __sourceExactCall_0ce2d252ec603a(((boolean)(moom.MP.dK))));
    }
case 11:
{
        return __sourceIntrinsic_38a49d0f6d1e_invokedynamic6544_39(local3, __sourceExactCall_0ce2d252ec603a(((boolean)(moom.MP.dz))));
    }
default:
{
        return __sourceIntrinsic_38a49d0f6d1e_invokedynamic6544_41(local3, moom.MP.a(((moom.bW)(p0))));
    }
}
}


public moom.bW a__sourceReturn_128cc006c0() {
return this.r;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38a49d0f6d1e_invokedynamic6544_4(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38a49d0f6d1e_invokedynamic6544_9(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38a49d0f6d1e_invokedynamic6544_12(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38a49d0f6d1e_invokedynamic6544_15(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38a49d0f6d1e_invokedynamic6544_18(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38a49d0f6d1e_invokedynamic6544_21(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38a49d0f6d1e_invokedynamic6544_24(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38a49d0f6d1e_invokedynamic6544_27(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38a49d0f6d1e_invokedynamic6544_30(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38a49d0f6d1e_invokedynamic6544_33(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38a49d0f6d1e_invokedynamic6544_36(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38a49d0f6d1e_invokedynamic6544_39(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38a49d0f6d1e_invokedynamic6544_41(java.lang.String a0, java.lang.String a1) throws E;

private static native java.lang.String __sourceExactCall_cb91d724585e17(moom.bW p0);
private static native java.lang.String __sourceExactCall_2e19a13ed33823(int p0);
private static native java.lang.String __sourceExactCall_0ce2d252ec603a(boolean p0);
private static native java.lang.String __sourceExactCall_f3c8d8c37a327b(float p0);
private static native java.lang.String __sourceExactCall_b69ce277f2e88c(float p0);
}
