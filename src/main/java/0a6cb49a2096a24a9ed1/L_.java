package moom;


public class L_ {

private java.awt.Dimension a;

private boolean b;

private moom.Mb[] c;

private moom.DD d;

private java.awt.image.BufferedImage e;

private moom.n3 f;

private moom.DD g;

private static java.lang.String h;

private static long i;

private static java.lang.String j;

public L_(java.awt.Dimension p0, boolean p1, moom.Mb[] p2) { super(); }


private static void __sourceConstructorBody_64916192bd976ce5(moom.L_ receiver, java.awt.Dimension p0, boolean p1, moom.Mb[] p2) throws Throwable {

long local4 = (moom.L_.i ^ 30558277198160L);

    moom.L_.__sourceConstructorInit_64916192bd976ce5_0(((moom.L_)(receiver)));

    ((moom.L_)(receiver)).a = ((java.awt.Dimension)(null));

    ((moom.L_)(receiver)).b = ((boolean)(false));

    ((moom.L_)(receiver)).c = ((moom.Mb[])(new moom.Mb[0]));

    ((moom.L_)(receiver)).d = ((moom.DD)(null));

    ((moom.L_)(receiver)).e = ((java.awt.image.BufferedImage)(null));

    ((moom.L_)(receiver)).f = ((moom.n3)(null));

    ((moom.L_)(receiver)).g = ((moom.DD)(new moom.DD(moom.L_.j)));

    ((moom.L_)(receiver)).a = ((java.awt.Dimension)(p0));

    ((moom.L_)(receiver)).b = ((boolean)(p1));

    ((moom.L_)(receiver)).c = ((moom.Mb[])(p2));

    return;

}



static {
i = ((long)(((moom._a)(moom._c.a(((long)(1206444767125267957L)), ((long)(-912682915329461267L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(44997287995026L)))));
    java.lang.Object __sourceSpill676_6 = null;
    long local0_life7 = (moom.L_.i ^ 44103304218254L);
    moom.L_.b(((java.lang.String)(__sourceSpill676_6)));
    javax.crypto.Cipher local2_life10;
    javax.crypto.Cipher __sourceSpill676_12 = (local2_life10 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill676_13 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill676_14 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill676_15 = new byte[8];
    (__sourceSpill676_15)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life16 = 1;
    while ((local3_life16 < 8)) {
        (__sourceSpill676_15)[local3_life16] = ((byte) ((int) ((local0_life7 << (local3_life16 * 8)) >>> 56)));
        local3_life16 += 1;
    }
    byte[] __sourcePreallocation676_17 = __sourceSpill676_15;
    ((javax.crypto.Cipher)(__sourceSpill676_12)).init(((int)(__sourceSpill676_13)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill676_14)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation676_17)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    byte[] __sourceSpill676_21 = ((java.lang.String)("HÂÏHÛÊ#©r\033\037SòQêUÒàÏÞ¢Ø24Fì$\b]àÖÐìsYîU\177\003")).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __sourceSpill676_22 = local2_life10;
    byte[] local4_life24 = ((javax.crypto.Cipher)(__sourceSpill676_22)).doFinal(((byte[])(__sourceSpill676_21)));
    j = ((java.lang.String)(((java.lang.String)(moom.L_.a(((byte[])(local4_life24))))).intern()));
}

private static native <E extends Throwable> void __sourceConstructorInit_64916192bd976ce5_0(moom.L_ a0) throws E;

public static void b(java.lang.String p0) {
h = ((java.lang.String)(p0));
    return;
}


public static java.lang.String b() {
return moom.L_.h;
}


public void a(moom.DD p0) {
this.d = ((moom.DD)(p0));
    return;
}


public boolean a__Boolean() {
return ((((this.b) ? 1 : 0)) != 0);
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
        byte[] spill3035_0 = p0;
        life4_9 += 1;
        life5_44 = (spill3035_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill3035_1 = p0;
        life4_9 += 1;
        life5_76 = (spill3035_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill3035_2 = p0;
        life4_9 += 1;
        life5_91 = (spill3035_2)[life4_9];
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


public void a(moom.iT p0, moom.to p1, float p2, float p3) {
moom.L_ lexicalValue927_20_0;
    moom.L_ lexicalValue927_25_0;
    moom.L_ lexicalValue927_30_0;
    moom.L_ lexicalValue927_35_0;
    java.lang.String spill927_0;
    moom.L_ spill927_1;
    long life5_3;
    net.minecraft.client.renderer.texture.TextureManager life8_6;
    java.lang.String life7_7;
    moom.Mb[] life9_91;
    int life10_94;
    int life11_96;
    moom.Mb life12_103;
    lexical_join_92: {
    lexical_join_59: {
    lexical_join_55: {
    lexical_join_49: {
    lexical_join_35: {
    lexical_join_30: {
    lexical_join_25: {
    lexical_join_20: {
    lexical_join_19: {
    life5_3 = (moom.L_.i ^ 33180171253073L);
    spill927_0 = moom.L_.b();
    life8_6 = moom.BU.a__ok();
    life7_7 = spill927_0;
    spill927_1 = this;
    if (!((life7_7 == null))) {
        lexicalValue927_20_0 = spill927_1;
        break lexical_join_20;
    }
    if (!(((moom.L_)(spill927_1)).b)) {
        break lexical_join_19;
    }
    ((net.minecraft.client.renderer.texture.TextureManager)(life8_6)).a__Void(((moom.DD)(((moom.to)(p1)).a__DD())));
    if (!((life7_7 != null))) {
        break lexical_join_59;
    }
    }
    lexicalValue927_20_0 = this;
    }
    if (!((life7_7 == null))) {
        lexicalValue927_25_0 = lexicalValue927_20_0;
        break lexical_join_25;
    }
    if (!((((moom.L_)(lexicalValue927_20_0)).d != null))) {
        break lexical_join_55;
    }
    lexicalValue927_25_0 = this;
    }
    if (!((life7_7 == null))) {
        lexicalValue927_30_0 = lexicalValue927_25_0;
        break lexical_join_30;
    }
    if (!((((moom.L_)(lexicalValue927_25_0)).f == null))) {
        break lexical_join_49;
    }
    lexicalValue927_30_0 = this;
    }
    if (!((life7_7 == null))) {
        lexicalValue927_35_0 = lexicalValue927_30_0;
        break lexical_join_35;
    }
    if (!((((moom.L_)(lexicalValue927_30_0)).e != null))) {
        break lexical_join_49;
    }
    lexicalValue927_35_0 = this;
    }
    ((moom.L_)(lexicalValue927_35_0)).f = ((moom.n3)(new moom.n3(this.e)));
    ((net.minecraft.client.renderer.texture.TextureManager)(((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).a__ok())).a(((moom.DD)(this.d)), ((net.minecraft.client.renderer.texture.ITextureObject)(this.f)));
    }
    ((net.minecraft.client.renderer.texture.TextureManager)(life8_6)).a__Void(((moom.DD)(this.d)));
    if (!((life7_7 != null))) {
        break lexical_join_59;
    }
    }
    ((net.minecraft.client.renderer.texture.TextureManager)(life8_6)).a__Void(((moom.DD)(this.g)));
    }
    life9_91 = this.c;
    life10_94 = (life9_91).length;
    life11_96 = 0;
    lexical_cycle_67: while (true) {
    lexical_join_90: {
    lexical_join_84: {
    if (!((life11_96 < life10_94))) {
        break lexical_join_92;
    }
    life12_103 = (life9_91)[life11_96];
    moom.kZ.B();
    if (!((life7_7 == null))) {
        break lexical_join_90;
    }
    if (!(((moom.to)(p1)).t__Boolean())) {
        break lexical_join_84;
    }
    moom.kZ.b(((float)(0x0.0p0f)), ((float)(0x1.99999ap-3f)), ((float)(0x0.0p0f)));
    }
    ((moom.Mb)(life12_103)).a(((moom.iT)(p0)), ((float)(p2)));
    moom.kZ.C();
    life11_96 += 1;
    }
    if (!((life7_7 != null))) { continue lexical_cycle_67; }
    break lexical_cycle_67;
    }
    }
    return;
}


public static moom.jD a(moom.iT p0, int p1) {
long local2 = (moom.L_.i ^ 2606822413729L);
    switch (p1) {
case 0:
{
        return ((moom.iT)(p0)).k;
    }
case 1:
{
        return ((moom.iT)(p0)).i;
    }
case 2:
{
        return ((moom.iT)(p0)).m;
    }
case 3:
{
        return ((moom.iT)(p0)).l;
    }
case 4:
{
        return ((moom.iT)(p0)).o;
    }
case 5:
{
        return ((moom.iT)(p0)).n;
    }
default:
{
        return null;
    }
}
}


public java.awt.image.BufferedImage a() {
return this.e;
}


public void a(java.awt.image.BufferedImage p0) {
this.e = ((java.awt.image.BufferedImage)(p0));
    return;
}


public moom.n3 a__n3() {
return this.f;
}


public moom.DD a__DD() {
return this.d;
}

}
