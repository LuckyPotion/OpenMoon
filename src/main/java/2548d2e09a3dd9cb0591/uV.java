package moom;


public class uV<T extends net.minecraft.entity.EntityLivingBase> extends moom.uR {

protected java.lang.Class<T> i;

private int j;

protected moom.vo k;

protected com.google.common.base.Predicate<? super T> l;

protected net.minecraft.entity.EntityLivingBase m;

private static long r;

private static long x;

public uV(moom.sI p0, java.lang.Class<T> p1, int p2, boolean p3, boolean p4, com.google.common.base.Predicate<? super T> p5) {
super(p0, p3, p4);
    this.i = ((java.lang.Class)(p1));
    this.j = ((int)(p2));
    this.k = ((moom.vo)(new moom.vo(p0)));
    ((moom.uV)(this)).a(((int)(1)));
    this.l = ((com.google.common.base.Predicate)(__sourceIntrinsic_5da139da2038_originalDynamicSite5016_4(this, p5)));
    return;
}

private static native <E extends Throwable> void __sourceConstructorInit_731e7d0d93bd5951_0(moom.uV a0, moom.sI a1, java.lang.Class a2, int a3, boolean a4, boolean a5, java.lang.Object a6) throws E;

public uV(moom.sI p0, java.lang.Class<T> p1, boolean p2, boolean p3) { this((moom.sI)null, (java.lang.Class)null, 0, false, false, (com.google.common.base.Predicate)null); }


private static void __sourceConstructorBody_731e7d0d93bd5951(moom.uV receiver, moom.sI p0, java.lang.Class p1, boolean p2, boolean p3) throws Throwable {

long local5_life1 = (moom.uV.r ^ 33748461383955L);

    moom.uV.__sourceConstructorInit_731e7d0d93bd5951_0(((moom.uV)(receiver)), ((moom.sI)(p0)), ((java.lang.Class)(p1)), ((int)(((int) moom.uV.x))), ((boolean)(p2)), ((boolean)(p3)), ((java.lang.Object)(null)));

    return;

}



public uV(moom.sI p0, java.lang.Class<T> p1, boolean p2) {
this(((moom.sI)(p0)), ((java.lang.Class)(p1)), ((boolean)(p2)), ((boolean)(false)));
    return;
}


static {
r = ((long)(((moom._a)(moom._c.a(((long)(318480555302092250L)), ((long)(-5863846316879796500L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(236110062073489L)))));
    long local0_life6 = (moom.uV.r ^ 125625327315895L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill1051_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1051_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1051_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1051_13 = new byte[8];
    (__sourceSpill1051_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill1051_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation1051_15 = __sourceSpill1051_13;
    ((javax.crypto.Cipher)(__sourceSpill1051_10)).init(((int)(__sourceSpill1051_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1051_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1051_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -7177457874168537499L;
    byte[] __sourceSpill1051_19 = new byte[8];
    (__sourceSpill1051_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill1051_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill1051_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill1051_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill1051_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill1051_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill1051_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill1051_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill1051_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill1051_20)).doFinal(((byte[])(__sourceSpill1051_19)));
    x = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public boolean a__Boolean() {
moom.uV forwardValue4186_23_0;
    int forwardValue4186_61_0;
    moom.uV spill4186_0;
    moom.uV spill4186_1;
    boolean spill4186_2;
    long life1_3;
    int life3_5;
    double life4_35;
    java.util.List life6_53;
    forward_join_61: {
    forward_join_54: {
    forward_join_23: {
    forward_join_22: {
    life1_3 = (moom.uV.r ^ 55305417383046L);
    life3_5 = ((moom.uc.d()) ? 1 : 0);
    spill4186_0 = this;
    if (!((life3_5 != 0))) {
        forwardValue4186_23_0 = spill4186_0;
        break forward_join_23;
    }
    if (!((((moom.uV)(spill4186_0)).j > 0))) {
        break forward_join_22;
    }
    spill4186_1 = this;
    if (!((life3_5 != 0))) {
        forwardValue4186_23_0 = spill4186_1;
        break forward_join_23;
    }
    if (!((((java.util.Random)(((moom.sI)(((moom.uV)(spill4186_1)).c)).a__Random())).nextInt(((int)(this.j))) != 0))) {
        break forward_join_22;
    }
    return ((0) != 0);
    }
    forwardValue4186_23_0 = this;
    }
    life4_35 = ((moom.uV)(forwardValue4186_23_0)).a__sourceReturn_fedcb3e4d3();
    life6_53 = ((net.minecraft.world.World)(((moom.sI)(this.c)).i)).a(((java.lang.Class)(this.i)), ((moom.CA)(((moom.CA)(((moom.sI)(this.c)).b())).b(((double)(life4_35)), ((double)(0x1.0p2d)), ((double)(life4_35))))), ((com.google.common.base.Predicate)(com.google.common.base.Predicates.and(((com.google.common.base.Predicate)(this.l)), ((com.google.common.base.Predicate)(moom.CY.d))))));
    ((java.util.List)(life6_53)).sort(((java.util.Comparator)(this.k)));
    spill4186_2 = ((java.util.List)(life6_53)).isEmpty();
    if (!((life3_5 != 0))) {
        forwardValue4186_61_0 = ((spill4186_2) ? 1 : 0);
        break forward_join_61;
    }
    if (!(spill4186_2)) {
        break forward_join_54;
    }
    return ((0) != 0);
    }
    this.m = ((net.minecraft.entity.EntityLivingBase)(((net.minecraft.entity.EntityLivingBase)(((java.util.List)(life6_53)).get(((int)(0)))))));
    forwardValue4186_61_0 = 1;
    }
    return ((forwardValue4186_61_0) != 0);
}


public void a__Void() {
((moom.sI)(this.c)).c(((net.minecraft.entity.EntityLivingBase)(this.m)));
    super.a__Void();
    return;
}


private boolean lambda$new$0(com.google.common.base.Predicate p0, net.minecraft.entity.EntityLivingBase p1) {
com.google.common.base.Predicate forwardValue4187_11_0;
    int forwardValue4187_20_0;
    int forwardValue4187_37_0;
    float forwardValue4187_51_0;
    int forwardValue4187_66_0;
    int forwardValue4187_75_0;
    com.google.common.base.Predicate spill4187_0;
    boolean spill4187_1;
    boolean spill4187_2;
    float spill4187_3;
    long life3_3;
    int life5_5;
    double life6_36;
    float life8_60;
    forward_join_75: {
    forward_join_71: {
    forward_join_66: {
    forward_join_59: {
    forward_join_52: {
    forward_join_51: {
    forward_join_37: {
    forward_join_35: {
    forward_join_20: {
    forward_join_18: {
    forward_join_11: {
    life3_3 = (moom.uV.r ^ 125583938486558L);
    life5_5 = ((moom.uc.d()) ? 1 : 0);
    spill4187_0 = p0;
    if (!((life5_5 != 0))) {
        forwardValue4187_11_0 = spill4187_0;
        break forward_join_11;
    }
    if (!((spill4187_0 != null))) {
        break forward_join_18;
    }
    forwardValue4187_11_0 = p0;
    }
    spill4187_1 = ((com.google.common.base.Predicate)(forwardValue4187_11_0)).apply(((java.lang.Object)(p1)));
    if (!((life5_5 != 0))) {
        forwardValue4187_20_0 = ((spill4187_1) ? 1 : 0);
        break forward_join_20;
    }
    if (!((!spill4187_1))) {
        break forward_join_18;
    }
    return ((0) != 0);
    }
    forwardValue4187_20_0 = ((p1 instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0);
    }
    if (!((life5_5 != 0))) {
        forwardValue4187_75_0 = forwardValue4187_20_0;
        break forward_join_75;
    }
    if (!((forwardValue4187_20_0 != 0))) {
        break forward_join_71;
    }
    life6_36 = ((moom.uV)(this)).a__sourceReturn_fedcb3e4d3();
    spill4187_2 = ((net.minecraft.entity.EntityLivingBase)(p1)).t__Boolean();
    if (!((life5_5 != 0))) {
        forwardValue4187_37_0 = ((spill4187_2) ? 1 : 0);
        break forward_join_37;
    }
    if (!(spill4187_2)) {
        break forward_join_35;
    }
    life6_36 = (life6_36 * 0x1.99999ap-1d);
    }
    forwardValue4187_37_0 = ((((net.minecraft.entity.EntityLivingBase)(p1)).v__Boolean()) ? 1 : 0);
    }
    if (!((life5_5 != 0))) {
        forwardValue4187_66_0 = forwardValue4187_37_0;
        break forward_join_66;
    }
    if (!((forwardValue4187_37_0 != 0))) {
        break forward_join_59;
    }
    life8_60 = ((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.entity.player.EntityPlayer)(p1)))).k();
    spill4187_3 = life8_60;
    if (!((life5_5 != 0))) {
        forwardValue4187_51_0 = spill4187_3;
        break forward_join_51;
    }
    if (!((recovery.source.CarrierOps.fcmpg(((float)(spill4187_3)), ((float)(0x1.99999ap-4f))) < 0))) {
        break forward_join_52;
    }
    forwardValue4187_51_0 = 0x1.99999ap-4f;
    }
    life8_60 = forwardValue4187_51_0;
    }
    life6_36 = (life6_36 * ((double) (0x1.666666p-1f * life8_60)));
    }
    forwardValue4187_66_0 = recovery.source.CarrierOps.dcmpl(((double)(((double) ((net.minecraft.entity.EntityLivingBase)(p1)).a__Float(((net.minecraft.entity.Entity)(this.c)))))), ((double)(life6_36)));
    }
    if (!((life5_5 != 0))) {
        forwardValue4187_75_0 = forwardValue4187_66_0;
        break forward_join_75;
    }
    if (!((forwardValue4187_66_0 > 0))) {
        break forward_join_71;
    }
    return ((0) != 0);
    }
    forwardValue4187_75_0 = ((((moom.uV)(this)).a(((net.minecraft.entity.EntityLivingBase)(p1)), ((boolean)(false)))) ? 1 : 0);
    }
    return ((forwardValue4187_75_0) != 0);
}


private static native <E extends Throwable> com.google.common.base.Predicate __sourceIntrinsic_5da139da2038_originalDynamicSite5016_4(moom.uV a0, com.google.common.base.Predicate a1) throws E;
}
