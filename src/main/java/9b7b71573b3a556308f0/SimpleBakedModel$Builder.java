package net.minecraft.client.resources.model;


public class SimpleBakedModel$Builder {

private java.util.List<moom.lC> a;

private java.util.List<java.util.List<moom.lC>> b;

private boolean c;

private net.minecraft.client.renderer.texture.TextureAtlasSprite d;

private boolean e;

private moom.lP f;

private static long g;

private static long h;

private SimpleBakedModel$Builder(boolean p0, boolean p1, moom.lP p2) { super(); }

private static void __sourceConstructorBody_bc325c54564ce887(net.minecraft.client.resources.model.SimpleBakedModel$Builder receiver, boolean p0, boolean p1, moom.lP p2) throws Throwable {
init_join_49: {
    init_join_40: {
    long local4_life2 = (net.minecraft.client.resources.model.SimpleBakedModel$Builder.g ^ 131762481621457L);
    net.minecraft.client.resources.model.SimpleBakedModel$Builder.__sourceConstructorInit_bc325c54564ce887_0(((net.minecraft.client.resources.model.SimpleBakedModel$Builder)(receiver)));
    ((net.minecraft.client.resources.model.SimpleBakedModel$Builder)(receiver)).a = ((java.util.List)(com.google.common.collect.Lists.newArrayList()));
    ((net.minecraft.client.resources.model.SimpleBakedModel$Builder)(receiver)).b = ((java.util.List)(com.google.common.collect.Lists.newArrayListWithCapacity(((int)(((int) net.minecraft.client.resources.model.SimpleBakedModel$Builder.h))))));
    moom.bs[] local7_life10 = moom.bs.values();
    int __sourceSpill823_12 = moom.DE.c();
    int local8_life13 = (local7_life10).length;
    int local9_life14 = 0;
    int local6_life15 = __sourceSpill823_12;
    init_cycle_23: while (true) {
    if (!((local9_life14 < local8_life13))) {
        break init_join_40;
    }
    moom.bs local10_life16 = (local7_life10)[local9_life14];
    ((java.util.List)(((net.minecraft.client.resources.model.SimpleBakedModel$Builder)(receiver)).b)).add(((java.lang.Object)(com.google.common.collect.Lists.newArrayList())));
    local9_life14 += 1;
    if (!((local6_life15 != 0))) {
        break init_join_49;
    }
    if (!((local6_life15 == 0))) { continue init_cycle_23; }
    break init_cycle_23;
    }
    }
    ((net.minecraft.client.resources.model.SimpleBakedModel$Builder)(receiver)).c = ((boolean)(p0));
    ((net.minecraft.client.resources.model.SimpleBakedModel$Builder)(receiver)).e = ((boolean)(p1));
    ((net.minecraft.client.resources.model.SimpleBakedModel$Builder)(receiver)).f = ((moom.lP)(p2));
    }
    return;
}


public SimpleBakedModel$Builder(net.minecraft.client.resources.model.IBakedModel p0, net.minecraft.client.renderer.texture.TextureAtlasSprite p1) { this(false, false, (moom.lP)null); }

private static void __sourceConstructorBody_bb2e6d5b706c9c36(net.minecraft.client.resources.model.SimpleBakedModel$Builder receiver, net.minecraft.client.resources.model.IBakedModel p0, net.minecraft.client.renderer.texture.TextureAtlasSprite p1) throws Throwable {
init_join_46: {
    init_join_42: {
    long local3_life2 = (net.minecraft.client.resources.model.SimpleBakedModel$Builder.g ^ 107921823594913L);
    net.minecraft.client.resources.model.SimpleBakedModel$Builder.__sourceConstructorInit_bb2e6d5b706c9c36_0(((net.minecraft.client.resources.model.SimpleBakedModel$Builder)(receiver)), ((boolean)(((net.minecraft.client.resources.model.IBakedModel)(p0)).a__Boolean())), ((boolean)(((net.minecraft.client.resources.model.IBakedModel)(p0)).b())), ((moom.lP)(((net.minecraft.client.resources.model.IBakedModel)(p0)).a__lP())));
    ((net.minecraft.client.resources.model.SimpleBakedModel$Builder)(receiver)).d = ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(((net.minecraft.client.resources.model.IBakedModel)(p0)).a__oh()));
    int __sourceSpill822_11 = moom.DE.c();
    moom.bs[] local6_life12 = moom.bs.values();
    int local5_life13 = __sourceSpill822_11;
    int local7_life14 = (local6_life12).length;
    int local8_life15 = 0;
    init_cycle_25: while (true) {
    if (!((local8_life15 < local7_life14))) {
        break init_join_42;
    }
    moom.bs local9_life16 = (local6_life12)[local8_life15];
    ((net.minecraft.client.resources.model.SimpleBakedModel$Builder)(receiver)).a(((net.minecraft.client.resources.model.IBakedModel)(p0)), ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(p1)), ((moom.bs)(local9_life16)));
    local8_life15 += 1;
    if (!((local5_life13 != 0))) {
        break init_join_46;
    }
    if (!((local5_life13 == 0))) { continue init_cycle_25; }
    break init_cycle_25;
    }
    }
    ((net.minecraft.client.resources.model.SimpleBakedModel$Builder)(receiver)).a(((net.minecraft.client.resources.model.IBakedModel)(p0)), ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(p1)));
    }
    return;
}


public SimpleBakedModel$Builder(net.minecraft.client.renderer.block.model.ModelBlock p0) {
this(((boolean)(((net.minecraft.client.renderer.block.model.ModelBlock)(p0)).b())), ((boolean)(((net.minecraft.client.renderer.block.model.ModelBlock)(p0)).c())), ((moom.lP)(((net.minecraft.client.renderer.block.model.ModelBlock)(p0)).a__lP())));
    return;
}


static {
g = ((long)(((moom._a)(moom._c.a(((long)(248310039520056013L)), ((long)(6201789406909285849L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(215166151964225L)))));
    long local0_life6 = (net.minecraft.client.resources.model.SimpleBakedModel$Builder.g ^ 76873378243627L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill1181_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1181_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1181_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1181_13 = new byte[8];
    (__sourceSpill1181_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill1181_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation1181_15 = __sourceSpill1181_13;
    ((javax.crypto.Cipher)(__sourceSpill1181_10)).init(((int)(__sourceSpill1181_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1181_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1181_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = 2732398222284216315L;
    byte[] __sourceSpill1181_19 = new byte[8];
    (__sourceSpill1181_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill1181_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill1181_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill1181_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill1181_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill1181_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill1181_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill1181_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill1181_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill1181_20)).doFinal(((byte[])(__sourceSpill1181_19)));
    h = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}

private static native <E extends Throwable> void __sourceConstructorInit_bb2e6d5b706c9c36_0(net.minecraft.client.resources.model.SimpleBakedModel$Builder a0, boolean a1, boolean a2, moom.lP a3) throws E;
private static native <E extends Throwable> void __sourceConstructorInit_bc325c54564ce887_0(net.minecraft.client.resources.model.SimpleBakedModel$Builder a0) throws E;

private static java.lang.RuntimeException a(java.lang.RuntimeException p0) {
return p0;
}


public net.minecraft.client.resources.model.IBakedModel a() {
long local1 = (net.minecraft.client.resources.model.SimpleBakedModel$Builder.g ^ 9197745925222L);
    if ((this.d == null)) {
        throw new java.lang.RuntimeException("Missing particle!");
    }
    return new moom.ps(this.a, this.b, this.c, this.e, this.d, this.f);
}


public net.minecraft.client.resources.model.SimpleBakedModel$Builder a(net.minecraft.client.renderer.texture.TextureAtlasSprite p0) {
this.d = ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(p0));
    return this;
}


private void a(net.minecraft.client.resources.model.IBakedModel p0, net.minecraft.client.renderer.texture.TextureAtlasSprite p1, moom.bs p2) {
int spill1509_0;
    long life4_3;
    java.util.Iterator life7_9;
    int life6_10;
    moom.lC life8_17;
    lexical_join_29: {
    life4_3 = (net.minecraft.client.resources.model.SimpleBakedModel$Builder.g ^ 70612470362648L);
    spill1509_0 = moom.DE.c();
    life7_9 = ((java.util.List)(((net.minecraft.client.resources.model.IBakedModel)(p0)).a(((moom.bs)(p2))))).iterator();
    life6_10 = spill1509_0;
    lexical_cycle_11: while (true) {
    if (!(((java.util.Iterator)(life7_9)).hasNext())) {
        break lexical_join_29;
    }
    life8_17 = ((moom.lC)(((java.util.Iterator)(life7_9)).next()));
    ((net.minecraft.client.resources.model.SimpleBakedModel$Builder)(this)).a(((moom.bs)(p2)), ((moom.lC)(new moom.lD(life8_17, p1))));
    if (!((life6_10 == 0))) { continue lexical_cycle_11; }
    break lexical_cycle_11;
    }
    }
    return;
}


private void a(net.minecraft.client.resources.model.IBakedModel p0, net.minecraft.client.renderer.texture.TextureAtlasSprite p1) {
int spill1508_0;
    long life3_3;
    java.util.Iterator life6_8;
    int life5_9;
    moom.lC life7_16;
    lexical_join_27: {
    life3_3 = (net.minecraft.client.resources.model.SimpleBakedModel$Builder.g ^ 130668048537014L);
    spill1508_0 = moom.DE.c();
    life6_8 = ((java.util.List)(((net.minecraft.client.resources.model.IBakedModel)(p0)).a())).iterator();
    life5_9 = spill1508_0;
    lexical_cycle_10: while (true) {
    if (!(((java.util.Iterator)(life6_8)).hasNext())) {
        break lexical_join_27;
    }
    life7_16 = ((moom.lC)(((java.util.Iterator)(life6_8)).next()));
    ((net.minecraft.client.resources.model.SimpleBakedModel$Builder)(this)).a(((moom.lC)(new moom.lD(life7_16, p1))));
    if (!((life5_9 == 0))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    return;
}


public net.minecraft.client.resources.model.SimpleBakedModel$Builder a(moom.bs p0, moom.lC p1) {
((java.util.List)(((java.util.List)(((java.util.List)(this.b)).get(((int)(((moom.bs)(p0)).ordinal()))))))).add(((java.lang.Object)(p1)));
    return this;
}


public net.minecraft.client.resources.model.SimpleBakedModel$Builder a(moom.lC p0) {
((java.util.List)(this.a)).add(((java.lang.Object)(p0)));
    return this;
}

}
