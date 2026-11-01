package net.minecraft.client.renderer.tileentity;


public abstract class TileEntitySpecialRenderer<T extends net.minecraft.tileentity.TileEntity> implements moom.Kl {

protected static final moom.DD[] a;

protected moom.oo b;

private java.lang.Class c;

private moom.DD d;

private static int[] e;

public TileEntitySpecialRenderer() {
super();
    this.c = null;
    this.d = null;
}


static {
long local11_life4 = (((moom._a)(moom._c.a(((long)(8544714383763224588L)), ((long)(-8848627340652098036L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(8211889368341L))) ^ 122274325350657L);
    if ((net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer.b() != null)) {
        net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer.b(((int[])(new int[1])));
    }
    javax.crypto.Cipher local1_life8;
    javax.crypto.Cipher __sourceSpill1824_10 = (local1_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1824_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1824_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1824_13 = new byte[8];
    (__sourceSpill1824_13)[0] = ((byte) ((int) (local11_life4 >>> 56)));
    int local2_life14 = 1;
    while ((local2_life14 < 8)) {
        (__sourceSpill1824_13)[local2_life14] = ((byte) ((int) ((local11_life4 << (local2_life14 * 8)) >>> 56)));
        local2_life14 += 1;
    }
    byte[] __sourcePreallocation1824_15 = __sourceSpill1824_13;
    ((javax.crypto.Cipher)(__sourceSpill1824_10)).init(((int)(__sourceSpill1824_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1824_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1824_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local0_life18 = new long[5];
    int local4_life19 = 0;
    java.lang.String local5_life20;
    int local6_life22 = ((java.lang.String)((local5_life20 = "÷ff\0036µt?\0172\037S¥à¨\004öW\006E"))).length();
    int local3_life23 = 0;
    do {
        java.lang.String __sourceSpill1824_24 = local5_life20;
        int __sourceSpill1824_25 = local3_life23;
        local3_life23 += 8;
        byte[] local7_life28 = ((java.lang.String)(((java.lang.String)(__sourceSpill1824_24)).substring(((int)(__sourceSpill1824_25)), ((int)(local3_life23))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1824_29 = local0_life18;
        int __sourceSpill1824_30 = local4_life19;
        local4_life19 += 1;
        long local8_life31 = (((((((((((long) (local7_life28)[0]) & 255L) << 56) | ((((long) (local7_life28)[1]) & 255L) << 48)) | ((((long) (local7_life28)[2]) & 255L) << 40)) | ((((long) (local7_life28)[3]) & 255L) << 32)) | ((((long) (local7_life28)[4]) & 255L) << 24)) | ((((long) (local7_life28)[5]) & 255L) << 16)) | ((((long) (local7_life28)[6]) & 255L) << 8)) | (((long) (local7_life28)[7]) & 255L));
        byte[] __sourceSpill1824_32 = new byte[8];
        (__sourceSpill1824_32)[0] = ((byte) ((int) (local8_life31 >>> 56)));
        (__sourceSpill1824_32)[1] = ((byte) ((int) (local8_life31 >>> 48)));
        (__sourceSpill1824_32)[2] = ((byte) ((int) (local8_life31 >>> 40)));
        (__sourceSpill1824_32)[3] = ((byte) ((int) (local8_life31 >>> 32)));
        (__sourceSpill1824_32)[4] = ((byte) ((int) (local8_life31 >>> 24)));
        (__sourceSpill1824_32)[5] = ((byte) ((int) (local8_life31 >>> 16)));
        (__sourceSpill1824_32)[6] = ((byte) ((int) (local8_life31 >>> 8)));
        (__sourceSpill1824_32)[7] = ((byte) ((int) local8_life31));
        javax.crypto.Cipher __sourceSpill1824_33 = local1_life8;
        byte[] local10_life35 = ((javax.crypto.Cipher)(__sourceSpill1824_33)).doFinal(((byte[])(__sourceSpill1824_32)));
        (__sourceSpill1824_29)[__sourceSpill1824_30] = (((((((((((long) (local10_life35)[0]) & 255L) << 56) | ((((long) (local10_life35)[1]) & 255L) << 48)) | ((((long) (local10_life35)[2]) & 255L) << 40)) | ((((long) (local10_life35)[3]) & 255L) << 32)) | ((((long) (local10_life35)[4]) & 255L) << 24)) | ((((long) (local10_life35)[5]) & 255L) << 16)) | ((((long) (local10_life35)[6]) & 255L) << 8)) | (((long) (local10_life35)[7]) & 255L));
    } while ((!(local3_life23 >= local6_life22)));
    local6_life22 = ((java.lang.String)((local5_life20 = "\032N]Ý4:1\f°\016Þ]Ð"))).length();
    local3_life23 = 0;
    do {
        java.lang.String __sourceSpill1824_37 = local5_life20;
        int __sourceSpill1824_38 = local3_life23;
        local3_life23 += 8;
        byte[] local7_life41 = ((java.lang.String)(((java.lang.String)(__sourceSpill1824_37)).substring(((int)(__sourceSpill1824_38)), ((int)(local3_life23))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1824_42 = local0_life18;
        int __sourceSpill1824_43 = local4_life19;
        local4_life19 += 1;
        long local8_life44 = (((((((((((long) (local7_life41)[0]) & 255L) << 56) | ((((long) (local7_life41)[1]) & 255L) << 48)) | ((((long) (local7_life41)[2]) & 255L) << 40)) | ((((long) (local7_life41)[3]) & 255L) << 32)) | ((((long) (local7_life41)[4]) & 255L) << 24)) | ((((long) (local7_life41)[5]) & 255L) << 16)) | ((((long) (local7_life41)[6]) & 255L) << 8)) | (((long) (local7_life41)[7]) & 255L));
        byte[] __sourceSpill1824_45 = new byte[8];
        (__sourceSpill1824_45)[0] = ((byte) ((int) (local8_life44 >>> 56)));
        (__sourceSpill1824_45)[1] = ((byte) ((int) (local8_life44 >>> 48)));
        (__sourceSpill1824_45)[2] = ((byte) ((int) (local8_life44 >>> 40)));
        (__sourceSpill1824_45)[3] = ((byte) ((int) (local8_life44 >>> 32)));
        (__sourceSpill1824_45)[4] = ((byte) ((int) (local8_life44 >>> 24)));
        (__sourceSpill1824_45)[5] = ((byte) ((int) (local8_life44 >>> 16)));
        (__sourceSpill1824_45)[6] = ((byte) ((int) (local8_life44 >>> 8)));
        (__sourceSpill1824_45)[7] = ((byte) ((int) local8_life44));
        javax.crypto.Cipher __sourceSpill1824_46 = local1_life8;
        byte[] local10_life48 = ((javax.crypto.Cipher)(__sourceSpill1824_46)).doFinal(((byte[])(__sourceSpill1824_45)));
        (__sourceSpill1824_42)[__sourceSpill1824_43] = (((((((((((long) (local10_life48)[0]) & 255L) << 56) | ((((long) (local10_life48)[1]) & 255L) << 48)) | ((((long) (local10_life48)[2]) & 255L) << 40)) | ((((long) (local10_life48)[3]) & 255L) << 32)) | ((((long) (local10_life48)[4]) & 255L) << 24)) | ((((long) (local10_life48)[5]) & 255L) << 16)) | ((((long) (local10_life48)[6]) & 255L) << 8)) | (((long) (local10_life48)[7]) & 255L));
    } while ((!(local3_life23 >= local6_life22)));
    moom.DD[] __sourceSpill1824_49 = new moom.DD[((int) (local0_life18)[2])];
    (__sourceSpill1824_49)[0] = new moom.DD("textures/blocks/destroy_stage_0.png");
    (__sourceSpill1824_49)[1] = new moom.DD("textures/blocks/destroy_stage_1.png");
    (__sourceSpill1824_49)[2] = new moom.DD("textures/blocks/destroy_stage_2.png");
    (__sourceSpill1824_49)[3] = new moom.DD("textures/blocks/destroy_stage_3.png");
    (__sourceSpill1824_49)[4] = new moom.DD("textures/blocks/destroy_stage_4.png");
    (__sourceSpill1824_49)[5] = new moom.DD("textures/blocks/destroy_stage_5.png");
    (__sourceSpill1824_49)[((int) (local0_life18)[1])] = new moom.DD("textures/blocks/destroy_stage_6.png");
    (__sourceSpill1824_49)[((int) (local0_life18)[4])] = new moom.DD("textures/blocks/destroy_stage_7.png");
    (__sourceSpill1824_49)[((int) (local0_life18)[0])] = new moom.DD("textures/blocks/destroy_stage_8.png");
    (__sourceSpill1824_49)[((int) (local0_life18)[3])] = new moom.DD("textures/blocks/destroy_stage_9.png");
    a = ((moom.DD[])(__sourceSpill1824_49));
}


public static int[] b() {
return net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer.e;
}


public static void b(int[] p0) {
net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer.e = ((int[])(p0));
    return;
}


protected void b(moom.DD p0) {
java.lang.Object local2 = ((moom.oo)(this.b)).g;
    if ((local2 != null)) {
        ((net.minecraft.client.renderer.texture.TextureManager)(local2)).a__Void(((moom.DD)(p0)));
    }
    return;
}


public void a(java.lang.Class p0) {
this.c = ((java.lang.Class)(p0));
    return;
}


public moom.DD a__DD() {
return this.d;
}


public void a(moom.DD p0) {
this.d = ((moom.DD)(p0));
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public net.minecraft.client.gui.FontRenderer a__ga() {
return ((moom.oo)(this.b)).a();
}


public void a(moom.oo p0) {
this.b = ((moom.oo)(p0));
    return;
}


protected net.minecraft.world.World a__Eu() {
return ((moom.oo)(this.b)).h;
}


public abstract void a(T p0, double p1, double p2, double p3, float p4, int p5);

public boolean a__Boolean() {
return ((0) != 0);
}


public void a(T p0, double p1, double p2, double p3, float p4, int p5, moom.lw p6) {
return;
}


public java.lang.Class a() {
return this.c;
}

}
