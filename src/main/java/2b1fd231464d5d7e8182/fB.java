package moom;


public abstract class fB implements net.minecraft.block.state.IBlockState {

private static final com.google.common.base.Joiner a;

private static final com.google.common.base.Function<java.util.Map.Entry<net.minecraft.block.properties.IProperty, java.lang.Comparable>, java.lang.String> b;

private int c;

private int d;

private int e;

private moom.DD f;

private static final long k;

public fB() {
super();
    this.c = -1;
    this.d = -1;
    this.e = -1;
    this.f = null;
}


static {
k = ((long)(((moom._a)(moom._c.a(((long)(4878090184956412761L)), ((long)(-3517182629130076004L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(158084603484161L)))));
    long local6_life6 = (moom.fB.k ^ 110032933754365L);
    javax.crypto.Cipher local1_life8;
    javax.crypto.Cipher __sourceSpill836_10 = (local1_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill836_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill836_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill836_13 = new byte[8];
    (__sourceSpill836_13)[0] = ((byte) ((int) (local6_life6 >>> 56)));
    int local2_life14 = 1;
    while ((local2_life14 < 8)) {
        (__sourceSpill836_13)[local2_life14] = ((byte) ((int) ((local6_life6 << (local2_life14 * 8)) >>> 56)));
        local2_life14 += 1;
    }
    byte[] __sourcePreallocation836_15 = __sourceSpill836_13;
    ((javax.crypto.Cipher)(__sourceSpill836_10)).init(((int)(__sourceSpill836_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill836_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation836_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local3_life18 = 5226466015804403183L;
    byte[] __sourceSpill836_19 = new byte[8];
    (__sourceSpill836_19)[0] = ((byte) ((int) (local3_life18 >>> 56)));
    (__sourceSpill836_19)[1] = ((byte) ((int) (local3_life18 >>> 48)));
    (__sourceSpill836_19)[2] = ((byte) ((int) (local3_life18 >>> 40)));
    (__sourceSpill836_19)[3] = ((byte) ((int) (local3_life18 >>> 32)));
    (__sourceSpill836_19)[4] = ((byte) ((int) (local3_life18 >>> 24)));
    (__sourceSpill836_19)[5] = ((byte) ((int) (local3_life18 >>> 16)));
    (__sourceSpill836_19)[6] = ((byte) ((int) (local3_life18 >>> 8)));
    (__sourceSpill836_19)[7] = ((byte) ((int) local3_life18));
    javax.crypto.Cipher __sourceSpill836_20 = local1_life8;
    byte[] local5_life22 = ((javax.crypto.Cipher)(__sourceSpill836_20)).doFinal(((byte[])(__sourceSpill836_19)));
    long local0_life23 = (((((((((((long) (local5_life22)[0]) & 255L) << 56) | ((((long) (local5_life22)[1]) & 255L) << 48)) | ((((long) (local5_life22)[2]) & 255L) << 40)) | ((((long) (local5_life22)[3]) & 255L) << 32)) | ((((long) (local5_life22)[4]) & 255L) << 24)) | ((((long) (local5_life22)[5]) & 255L) << 16)) | ((((long) (local5_life22)[6]) & 255L) << 8)) | (((long) (local5_life22)[7]) & 255L));
    a = ((com.google.common.base.Joiner)(com.google.common.base.Joiner.on(((char)(((int) local0_life23))))));
    b = ((com.google.common.base.Function)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite836_26()));
}


public java.lang.String toString() {
java.lang.StringBuilder forwardValue3523_49_0;
    net.minecraft.entity.Entity[] spill3523_0;
    java.lang.StringBuilder spill3523_1;
    com.google.common.base.Joiner spill3523_2;
    java.lang.StringBuilder spill3523_3;
    java.util.stream.Stream spill3523_4;
    com.google.common.base.Function spill3523_5;
    long life1_3;
    java.lang.StringBuilder life4_8;
    net.minecraft.entity.Entity[] life3_9;
    forward_join_49: {
    forward_join_48: {
    life1_3 = (moom.fB.k ^ 44519804228902L);
    spill3523_0 = moom.fA.b();
    life4_8 = new java.lang.StringBuilder();
    life3_9 = spill3523_0;
    spill3523_1 = ((java.lang.StringBuilder)(life4_8)).append(((java.lang.Object)(((moom.DC)(net.minecraft.block.Block.b)).b(((java.lang.Object)(((moom.fB)(this)).a__ch()))))));
    if (!((life3_9 == null))) {
        forwardValue3523_49_0 = spill3523_1;
        break forward_join_49;
    }
    recovery.source.CarrierOps.discard(spill3523_1);
    if (!((!__sourceExactCall_110db18f0bdd70(((com.google.common.collect.ImmutableMap)(__sourceExactCall_d276365b742992(this))))))) {
        break forward_join_48;
    }
    ((java.lang.StringBuilder)(life4_8)).append(((java.lang.String)("[")));
    spill3523_2 = moom.fB.a;
    spill3523_3 = life4_8;
    spill3523_4 = __sourceExactCall_71620c5784a3b6(((com.google.common.collect.ImmutableSet)(__sourceExactCall_c1867ef9ac6619(((com.google.common.collect.ImmutableMap)(__sourceExactCall_d276365b742992(this)))))));
    com.google.common.base.Function __stackOp3523_15_0 = moom.fB.b;
    spill3523_5 = __stackOp3523_15_0;
    java.util.Objects.requireNonNull(((java.lang.Object)(__stackOp3523_15_0)));
    ((com.google.common.base.Joiner)(spill3523_2)).appendTo(((java.lang.StringBuilder)(spill3523_3)), ((java.lang.Iterable)(((java.lang.Iterable)(((java.util.stream.Stream)(((java.util.stream.Stream)(spill3523_4)).map(((java.util.function.Function)(__sourceIntrinsic_a86c261fcdee_invokedynamic3523_17(spill3523_5)))))).collect(((java.util.stream.Collector)(java.util.stream.Collectors.toList()))))))));
    ((java.lang.StringBuilder)(life4_8)).append(((java.lang.String)("]")));
    }
    forwardValue3523_49_0 = life4_8;
    }
    return ((java.lang.StringBuilder)(forwardValue3523_49_0)).toString();
}


public int b() {
int forwardValue3520_17_0;
    int spill3520_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_17: {
    forward_join_15: {
    life1_3 = (moom.fB.k ^ 332662532238L);
    life3_5 = moom.fA.b();
    spill3520_0 = this.d;
    if (!((life3_5 == null))) {
        forwardValue3520_17_0 = spill3520_0;
        break forward_join_17;
    }
    if (!((spill3520_0 < 0))) {
        break forward_join_15;
    }
    this.d = ((int)(__sourceExactCall_042b2eb2353c3d(((net.minecraft.block.state.IBlockState)(this)))));
    }
    forwardValue3520_17_0 = this.d;
    }
    return forwardValue3520_17_0;
}


public int c() {
int forwardValue3521_19_0;
    int spill3521_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_19: {
    forward_join_17: {
    life1_3 = (moom.fB.k ^ 10582820281940L);
    life3_5 = moom.fA.b();
    spill3521_0 = this.e;
    if (!((life3_5 == null))) {
        forwardValue3521_19_0 = spill3521_0;
        break forward_join_19;
    }
    if (!((spill3521_0 < 0))) {
        break forward_join_17;
    }
    this.e = ((int)(((net.minecraft.block.Block)(((moom.fB)(this)).a__ch())).b(((net.minecraft.block.state.IBlockState)(this)))));
    }
    forwardValue3521_19_0 = this.e;
    }
    return forwardValue3521_19_0;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


protected static <T> T a(java.util.Collection<T> p0, T p1) {
int forestValue428_16_0;
    java.lang.Object forestValue428_30_0;
    net.minecraft.entity.Entity[] spill428_0;
    java.util.Iterator spill428_1;
    boolean spill428_2;
    long life2_3;
    java.util.Iterator life5_7;
    net.minecraft.entity.Entity[] life4_8;
    forest_join_31: {
    forest_join_30: {
    forest_join_27: {
    life2_3 = (moom.fB.k ^ 112756642610992L);
    spill428_0 = moom.fA.b();
    life5_7 = ((java.util.Collection)(p0)).iterator();
    life4_8 = spill428_0;
    forest_cycle_9: while (true) {
    if (!(((java.util.Iterator)(life5_7)).hasNext())) {
        break forest_join_31;
    }
    forestValue428_16_0 = ((((java.lang.Object)(((java.util.Iterator)(life5_7)).next())).equals(((java.lang.Object)(p1)))) ? 1 : 0);
    forest_cycle_16: while (true) {
    if (!((forestValue428_16_0 != 0))) {
        continue forest_cycle_9;
    }
    spill428_1 = life5_7;
    if (!((life4_8 == null))) {
        forestValue428_30_0 = spill428_1;
        break forest_join_30;
    }
    spill428_2 = ((java.util.Iterator)(spill428_1)).hasNext();
    if (!((life4_8 == null))) {
        forestValue428_16_0 = ((spill428_2) ? 1 : 0);
        continue forest_cycle_16;
    }
    break forest_cycle_16;
    }
    break forest_cycle_9;
    }
    if (!(spill428_2)) {
        break forest_join_27;
    }
    return ((T)(((java.util.Iterator)(life5_7)).next()));
    }
    forestValue428_30_0 = ((java.util.Iterator)(((java.util.Collection)(p0)).iterator())).next();
    }
    return ((T)(forestValue428_30_0));
    }
    return ((T)(((java.util.Iterator)(life5_7)).next()));
}


public int a__sourceReturn_8abf5c6871() {
int forwardValue3517_18_0;
    int spill3517_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_18: {
    forward_join_16: {
    life1_3 = (moom.fB.k ^ 8231001061354L);
    life3_5 = moom.fA.b();
    spill3517_0 = this.c;
    if (!((life3_5 == null))) {
        forwardValue3517_18_0 = spill3517_0;
        break forward_join_18;
    }
    if (!((spill3517_0 < 0))) {
        break forward_join_16;
    }
    this.c = ((int)(__sourceExactCall_4be9acdbe11525(((net.minecraft.block.Block)(((moom.fB)(this)).a__ch())))));
    }
    forwardValue3517_18_0 = this.c;
    }
    return forwardValue3517_18_0;
}


public moom.DD a__DD() {
moom.DD forwardValue3519_20_0;
    moom.DD spill3519_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_20: {
    forward_join_18: {
    life1_3 = (moom.fB.k ^ 50659567006573L);
    life3_5 = moom.fA.b();
    spill3519_0 = this.f;
    if (!((life3_5 == null))) {
        forwardValue3519_20_0 = spill3519_0;
        break forward_join_20;
    }
    if (!((spill3519_0 == null))) {
        break forward_join_18;
    }
    this.f = ((moom.DD)(((moom.DD)(((moom.DC)(net.minecraft.block.Block.b)).b(((java.lang.Object)(((moom.fB)(this)).a__ch())))))));
    }
    forwardValue3519_20_0 = this.f;
    }
    return forwardValue3519_20_0;
}


public <T extends java.lang.Comparable<T>> net.minecraft.block.state.IBlockState a__fE(net.minecraft.block.properties.IProperty<T> p0) {
return ((moom.fB)(this)).a__fE(((net.minecraft.block.properties.IProperty)(p0)), ((java.lang.Comparable)(((java.lang.Comparable)(moom.fB.a(((java.util.Collection)(((net.minecraft.block.properties.IProperty)(p0)).a__Collection())), ((java.lang.Object)(this.a(((net.minecraft.block.properties.IProperty)(p0)))))))))));
}


private static java.lang.String lambda$static$0(java.util.Map.Entry p0) {
java.lang.Object forwardValue3522_14_0;
    java.util.Map.Entry spill3522_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    net.minecraft.block.properties.IProperty life4_20;
    forward_join_14: {
    forward_join_12: {
    life1_3 = (moom.fB.k ^ 139671982923242L);
    life3_5 = moom.fA.b();
    spill3522_0 = p0;
    if (!((life3_5 == null))) {
        forwardValue3522_14_0 = spill3522_0;
        break forward_join_14;
    }
    if (!((spill3522_0 == null))) {
        break forward_join_12;
    }
    return "<NULL>";
    }
    forwardValue3522_14_0 = ((java.util.Map.Entry)(p0)).getKey();
    }
    life4_20 = ((net.minecraft.block.properties.IProperty)(forwardValue3522_14_0));
    return __sourceIntrinsic_f94d0acc5a51_invokedynamic3522_8(((net.minecraft.block.properties.IProperty)(life4_20)).a__String(), ((net.minecraft.block.properties.IProperty)(life4_20)).a(((java.lang.Comparable)(((java.lang.Comparable)(((java.util.Map.Entry)(p0)).getValue()))))));
}


private static native <E extends Throwable> com.google.common.base.Function __sourceIntrinsic_eb8803ad1f63_originalDynamicSite836_26() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_f94d0acc5a51_invokedynamic3522_8(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.util.function.Function __sourceIntrinsic_a86c261fcdee_invokedynamic3523_17(com.google.common.base.Function a0) throws E;

private static native int __sourceExactCall_042b2eb2353c3d(net.minecraft.block.state.IBlockState p0);
private static native int __sourceExactCall_4be9acdbe11525(net.minecraft.block.Block p0);

private static native com.google.common.collect.ImmutableMap __sourceExactCall_d276365b742992(moom.fB p0);

private static native boolean __sourceExactCall_110db18f0bdd70(com.google.common.collect.ImmutableMap p0);
private static native java.util.stream.Stream __sourceExactCall_71620c5784a3b6(com.google.common.collect.ImmutableSet p0);
private static native com.google.common.collect.ImmutableSet __sourceExactCall_c1867ef9ac6619(com.google.common.collect.ImmutableMap p0);
}
