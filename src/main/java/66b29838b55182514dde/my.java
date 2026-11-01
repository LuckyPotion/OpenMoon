package com.moon;


public class my implements com.moon.mo {

private com.moon.k5 a;

private imgui.type.ImString b;

private long c;

private static int[] d;

private static long e;

private static long f;

public my(com.moon.k5 p0) { super(); }


private static void __sourceConstructorBody_486baff3c914faf1(com.moon.my receiver, com.moon.k5 p0) throws Throwable {

long local2_life2 = (com.moon.my.e ^ 63007608063351L);

    com.moon.my.__sourceConstructorInit_486baff3c914faf1_0(((com.moon.my)(receiver)));

    ((com.moon.my)(receiver)).b = ((imgui.type.ImString)(new imgui.type.ImString(((int) com.moon.my.f))));

    ((com.moon.my)(receiver)).a = ((com.moon.k5)(p0));

    return;

}



static {
e = ((long)(((moom._a)(moom._c.a(((long)(-2872258547910035403L)), ((long)(3349387960026190433L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(114154728367390L)))));
    int[] __sourceSpill299_6 = new int[4];
    long local0_life7 = (com.moon.my.e ^ 81930780146853L);
    com.moon.my.b(((int[])(__sourceSpill299_6)));
    javax.crypto.Cipher local2_life10;
    javax.crypto.Cipher __sourceSpill299_12 = (local2_life10 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill299_13 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill299_14 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill299_15 = new byte[8];
    (__sourceSpill299_15)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life16 = 1;
    while ((local3_life16 < 8)) {
        (__sourceSpill299_15)[local3_life16] = ((byte) ((int) ((local0_life7 << (local3_life16 * 8)) >>> 56)));
        local3_life16 += 1;
    }
    byte[] __sourcePreallocation299_17 = __sourceSpill299_15;
    ((javax.crypto.Cipher)(__sourceSpill299_12)).init(((int)(__sourceSpill299_13)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill299_14)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation299_17)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life20 = 1837276188776886536L;
    byte[] __sourceSpill299_21 = new byte[8];
    (__sourceSpill299_21)[0] = ((byte) ((int) (local4_life20 >>> 56)));
    (__sourceSpill299_21)[1] = ((byte) ((int) (local4_life20 >>> 48)));
    (__sourceSpill299_21)[2] = ((byte) ((int) (local4_life20 >>> 40)));
    (__sourceSpill299_21)[3] = ((byte) ((int) (local4_life20 >>> 32)));
    (__sourceSpill299_21)[4] = ((byte) ((int) (local4_life20 >>> 24)));
    (__sourceSpill299_21)[5] = ((byte) ((int) (local4_life20 >>> 16)));
    (__sourceSpill299_21)[6] = ((byte) ((int) (local4_life20 >>> 8)));
    (__sourceSpill299_21)[7] = ((byte) ((int) local4_life20));
    javax.crypto.Cipher __sourceSpill299_22 = local2_life10;
    byte[] local6_life24 = ((javax.crypto.Cipher)(__sourceSpill299_22)).doFinal(((byte[])(__sourceSpill299_21)));
    f = ((long)((((((((((((long) (local6_life24)[0]) & 255L) << 56) | ((((long) (local6_life24)[1]) & 255L) << 48)) | ((((long) (local6_life24)[2]) & 255L) << 40)) | ((((long) (local6_life24)[3]) & 255L) << 32)) | ((((long) (local6_life24)[4]) & 255L) << 24)) | ((((long) (local6_life24)[5]) & 255L) << 16)) | ((((long) (local6_life24)[6]) & 255L) << 8)) | (((long) (local6_life24)[7]) & 255L))));
}

private static native <E extends Throwable> void __sourceConstructorInit_486baff3c914faf1_0(com.moon.my a0) throws E;

public static int[] b__ArrayInt() {
return com.moon.my.d;
}


public static void b(int[] p0) {
d = ((int[])(p0));
    return;
}


public void b() {
int forwardValue981_33_0;
    boolean spill981_0;
    long life1_3;
    int[] life3_5;
    forward_join_41: {
    forward_join_40: {
    forward_join_33: {
    forward_join_13: {
    life1_3 = (com.moon.my.e ^ 5938031987494L);
    life3_5 = com.moon.my.b__ArrayInt();
    spill981_0 = ((com.moon.k5)(this.a)).isAvailable();
    if (!((life3_5 != null))) {
        forwardValue981_33_0 = ((spill981_0) ? 1 : 0);
        break forward_join_33;
    }
    if (!((!spill981_0))) {
        break forward_join_13;
    }
    return;
    }
    imgui.ImGui.pushID(((long)(this.c)));
    ((imgui.type.ImString)(this.b)).set(((java.lang.String)(((java.lang.String)(((com.moon.k5)(this.a)).getValue())))));
    imgui.ImGui.inputText(((java.lang.String)(((com.moon.k5)(this.a)).getDisplayName())), ((imgui.type.ImString)(this.b)));
    if (!((life3_5 != null))) {
        break forward_join_41;
    }
    forwardValue981_33_0 = ((imgui.ImGui.isItemEdited()) ? 1 : 0);
    }
    if (!((forwardValue981_33_0 != 0))) {
        break forward_join_40;
    }
    ((com.moon.k5)(this.a)).setValue(((((imgui.type.ImString)(this.b)).get())));
    }
    imgui.ImGui.popID();
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a() {
((imgui.type.ImString)(this.b)).set(((java.lang.String)(((java.lang.String)(((com.moon.k5)(this.a)).getValue())))));
    this.c = ((long)(java.lang.Math.round(((double)((java.lang.Math.random() * 0x1.dcd65p29d))))));
    return;
}

}
