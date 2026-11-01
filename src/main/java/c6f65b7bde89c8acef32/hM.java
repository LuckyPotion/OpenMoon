package moom;


public class hM implements moom.hO {

private java.lang.String a;

private int b;

moom.h6 c;

private static long d;

private static long e;

public hM(moom.h6 p0, java.lang.String p1) { super(); }


private static void __sourceConstructorBody_6e03a15f5d599a41(moom.hM receiver, moom.h6 p0, java.lang.String p1) throws Throwable {

((moom.hM)(receiver)).c = ((moom.h6)(p0));

    moom.hM.__sourceConstructorInit_6e03a15f5d599a41_0(((moom.hM)(receiver)));

    ((moom.hM)(receiver)).a = ((java.lang.String)(moom.oO.a(((java.lang.String)(p1)), ((java.lang.Object[])(new java.lang.Object[0])))));

    ((moom.hM)(receiver)).b = ((int)(((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.Minecraft)(((moom.h6)(p0)).z)).N)).a(((java.lang.String)(((moom.hM)(receiver)).a)))));

    return;

}



static {
d = ((long)(((moom._a)(moom._c.a(((long)(-2555650134029671332L)), ((long)(-5940899032632515404L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(21972976633197L)))));
    long local0_life6 = (moom.hM.d ^ 45184746198377L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill866_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill866_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill866_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill866_13 = new byte[8];
    (__sourceSpill866_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill866_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation866_15 = __sourceSpill866_13;
    ((javax.crypto.Cipher)(__sourceSpill866_10)).init(((int)(__sourceSpill866_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill866_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation866_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = 7893376734733194213L;
    byte[] __sourceSpill866_19 = new byte[8];
    (__sourceSpill866_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill866_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill866_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill866_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill866_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill866_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill866_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill866_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill866_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill866_20)).doFinal(((byte[])(__sourceSpill866_19)));
    e = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}

private static native <E extends Throwable> void __sourceConstructorInit_6e03a15f5d599a41_0(moom.hM a0) throws E;

public void a(int p0, int p1, int p2, int p3, int p4, int p5) {
return;
}


public void a(int p0, int p1, int p2) {
return;
}


public void a(int p0, int p1, int p2, int p3, int p4, int p5, int p6, boolean p7) {
long local9 = (moom.hM.d ^ 22132903983918L);
    ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.Minecraft)(((moom.h6)(this.c)).z)).N)).b(((java.lang.String)(this.a)), ((float)(((float) ((((net.minecraft.client.gui.GuiScreen)(((net.minecraft.client.Minecraft)(((moom.h6)(this.c)).z)).P)).k / 2) - (this.b / 2))))), ((float)(((float) (((p2 + p4) - ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.Minecraft)(((moom.h6)(this.c)).z)).N)).c) - 1)))), ((int)(((int) moom.hM.e))));
    return;
}


public boolean a__Boolean(int p0, int p1, int p2, int p3, int p4, int p5) {
return ((0) != 0);
}

}
