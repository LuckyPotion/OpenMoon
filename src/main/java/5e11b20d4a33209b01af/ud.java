package moom;


public class ud extends moom.uc {

private net.minecraft.entity.EntityLiving c;

private net.minecraft.entity.IRangedAttackMob d;

private net.minecraft.entity.EntityLivingBase e;

private int f;

private double g;

private int h;

private int i;

private int j;

private float k;

private float l;

private static long m;

private static long n;

public ud(net.minecraft.entity.IRangedAttackMob p0, double p1, int p2, float p3) {
this(((net.minecraft.entity.IRangedAttackMob)(p0)), ((double)(p1)), ((int)(p2)), ((int)(p2)), ((float)(p3)));
    return;
}


public ud(net.minecraft.entity.IRangedAttackMob p0, double p1, int p2, int p3, float p4) { super(); }


private static void __sourceConstructorBody_565d90662756b3af(moom.ud receiver, net.minecraft.entity.IRangedAttackMob p0, double p1, int p2, int p3, float p4) throws Throwable {

long local7_life1 = (moom.ud.m ^ 107857881600628L);

    boolean __sourceSpill824_3 = moom.uc.d();

    moom.ud.__sourceConstructorInit_565d90662756b3af_0(((moom.ud)(receiver)));

    boolean local9_life5 = __sourceSpill824_3;

    ((moom.ud)(receiver)).f = ((int)(-1));

    if (local9_life5) {

        if ((((p0 instanceof net.minecraft.entity.EntityLivingBase) ? 1 : 0) == 0)) {

        throw new java.lang.IllegalArgumentException("ArrowAttackGoal requires Mob implements RangedAttackMob");

    }

        ((moom.ud)(receiver)).d = ((net.minecraft.entity.IRangedAttackMob)(p0));

        ((moom.ud)(receiver)).c = ((net.minecraft.entity.EntityLiving)(((net.minecraft.entity.EntityLiving)(p0))));

        ((moom.ud)(receiver)).g = ((double)(p1));

        ((moom.ud)(receiver)).i = ((int)(p2));

        ((moom.ud)(receiver)).j = ((int)(p3));

        ((moom.ud)(receiver)).k = ((float)(p4));

        ((moom.ud)(receiver)).l = ((float)((p4 * p4)));

        ((moom.ud)(receiver)).a(((int)(3)));

    }

    return;

}



static {
m = ((long)(((moom._a)(moom._c.a(((long)(-7909285376609071415L)), ((long)(8774289178650971808L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(152674316530227L)))));
    long local0_life6 = (moom.ud.m ^ 122262877120346L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill1054_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1054_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1054_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1054_13 = new byte[8];
    (__sourceSpill1054_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill1054_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation1054_15 = __sourceSpill1054_13;
    ((javax.crypto.Cipher)(__sourceSpill1054_10)).init(((int)(__sourceSpill1054_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1054_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1054_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -5600406636097719389L;
    byte[] __sourceSpill1054_19 = new byte[8];
    (__sourceSpill1054_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill1054_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill1054_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill1054_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill1054_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill1054_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill1054_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill1054_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill1054_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill1054_20)).doFinal(((byte[])(__sourceSpill1054_19)));
    n = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}

private static native <E extends Throwable> void __sourceConstructorInit_565d90662756b3af_0(moom.ud a0) throws E;

public void b__Void() {
this.e = ((net.minecraft.entity.EntityLivingBase)(null));
    this.h = ((int)(0));
    this.f = ((int)(-1));
    return;
}


public boolean b__Boolean() {
int forwardValue4195_19_0;
    int forwardValue4195_21_0;
    boolean spill4195_0;
    boolean spill4195_1;
    long life1_3;
    int life3_5;
    forward_join_21: {
    forward_join_20: {
    forward_join_19: {
    forward_join_18: {
    life1_3 = (moom.ud.m ^ 60539084287304L);
    life3_5 = ((moom.uc.e()) ? 1 : 0);
    spill4195_0 = ((moom.ud)(this)).a__Boolean();
    if (!((life3_5 == 0))) {
        forwardValue4195_19_0 = ((spill4195_0) ? 1 : 0);
        break forward_join_19;
    }
    if (!((!spill4195_0))) {
        break forward_join_18;
    }
    spill4195_1 = ((moom.AV)(((net.minecraft.entity.EntityLiving)(this.c)).a__sourceReturn_407923443b())).a__Boolean();
    if (!((life3_5 == 0))) {
        forwardValue4195_19_0 = ((spill4195_1) ? 1 : 0);
        break forward_join_19;
    }
    if (!((!spill4195_1))) {
        break forward_join_20;
    }
    }
    forwardValue4195_19_0 = 1;
    }
    forwardValue4195_21_0 = forwardValue4195_19_0;
    break forward_join_21;
    }
    forwardValue4195_21_0 = 0;
    }
    return ((forwardValue4195_21_0) != 0);
}


public void c() {
int forwardValue4196_71_0;
    int forwardValue4196_99_0;
    int forwardValue4196_137_0;
    boolean spill4196_0;
    int spill4196_1;
    int spill4196_2;
    int spill4196_3;
    int spill4196_4;
    long life1_3;
    double life4_18;
    int life3_19;
    int life6_26;
    float life7_139;
    float life8_144;
    float life7_179;
    forward_join_159: {
    forward_join_137: {
    forward_join_135: {
    forward_join_101: {
    forward_join_100: {
    forward_join_99: {
    forward_join_72: {
    forward_join_71: {
    forward_join_63: {
    forward_join_42: {
    forward_join_39: {
    forward_join_37: {
    life1_3 = (moom.ud.m ^ 107840799428587L);
    spill4196_0 = moom.uc.d();
    life4_18 = ((net.minecraft.entity.EntityLiving)(this.c)).a(((double)(((net.minecraft.entity.EntityLivingBase)(this.e)).n)), ((double)(((moom.CA)(((net.minecraft.entity.EntityLivingBase)(this.e)).b())).c)), ((double)(((net.minecraft.entity.EntityLivingBase)(this.e)).p)));
    life3_19 = ((spill4196_0) ? 1 : 0);
    life6_26 = ((((net.minecraft.entity.ai.EntitySenses)(((net.minecraft.entity.EntityLiving)(this.c)).a__vz())).a(((net.minecraft.entity.Entity)(this.e)))) ? 1 : 0);
    if (!((life3_19 != 0))) {
        break forward_join_37;
    }
    if (!((life6_26 != 0))) {
        break forward_join_39;
    }
    moom.ud __stackOp4196_17_0 = this;
    ((moom.ud)(__stackOp4196_17_0)).h = ((int)((((moom.ud)(__stackOp4196_17_0)).h + 1)));
    }
    if (!((life3_19 == 0))) {
        break forward_join_42;
    }
    }
    this.h = ((int)(0));
    }
    spill4196_1 = recovery.source.CarrierOps.dcmpg(((double)(life4_18)), ((double)(((double) this.l))));
    if (!((life3_19 != 0))) {
        forwardValue4196_71_0 = spill4196_1;
        break forward_join_71;
    }
    if (!((spill4196_1 <= 0))) {
        break forward_join_63;
    }
    spill4196_2 = this.h;
    if (!((life3_19 != 0))) {
        forwardValue4196_71_0 = spill4196_2;
        break forward_join_71;
    }
    if (!((spill4196_2 >= ((int) moom.ud.n)))) {
        break forward_join_63;
    }
    ((moom.AV)(((net.minecraft.entity.EntityLiving)(this.c)).a__sourceReturn_407923443b())).c();
    if (!((life3_19 == 0))) {
        break forward_join_72;
    }
    }
    forwardValue4196_71_0 = ((((moom.AV)(((net.minecraft.entity.EntityLiving)(this.c)).a__sourceReturn_407923443b())).a(((net.minecraft.entity.Entity)(this.e)), ((double)(this.g)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue4196_71_0);
    }
    ((net.minecraft.entity.ai.EntityLookHelper)(((net.minecraft.entity.EntityLiving)(this.c)).a__vt())).a(((net.minecraft.entity.Entity)(this.e)), ((float)(0x1.ep4f)), ((float)(0x1.ep4f)));
    moom.ud __stackOp4196_39_0 = this;
    moom.ud __stackOp4196_41_0 = __stackOp4196_39_0;
    int __stackOp4196_41_1 = (((moom.ud)(__stackOp4196_39_0)).f - 1);
    spill4196_3 = __stackOp4196_41_1;
    ((moom.ud)(__stackOp4196_41_0)).f = ((int)(__stackOp4196_41_1));
    if (!((life3_19 != 0))) {
        forwardValue4196_137_0 = spill4196_3;
        break forward_join_137;
    }
    if (!((spill4196_3 == 0))) {
        break forward_join_135;
    }
    spill4196_4 = recovery.source.CarrierOps.dcmpl(((double)(life4_18)), ((double)(((double) this.l))));
    if (!((life3_19 != 0))) {
        forwardValue4196_99_0 = spill4196_4;
        break forward_join_99;
    }
    if (!((spill4196_4 <= 0))) {
        break forward_join_100;
    }
    forwardValue4196_99_0 = life6_26;
    }
    if (!((forwardValue4196_99_0 == 0))) {
        break forward_join_101;
    }
    }
    return;
    }
    life7_139 = (moom.Dr.a__Float(((double)(life4_18))) / this.k);
    life8_144 = moom.Dr.a(((float)(life7_139)), ((float)(0x1.99999ap-4f)), ((float)(0x1.0p0f)));
    ((net.minecraft.entity.IRangedAttackMob)(this.d)).a(((net.minecraft.entity.EntityLivingBase)(this.e)), ((float)(life8_144)));
    this.f = ((int)(moom.Dr.a__Int(((float)(((life7_139 * ((float) (this.j - this.i))) + ((float) this.i)))))));
    if (!((life3_19 == 0))) {
        break forward_join_159;
    }
    }
    forwardValue4196_137_0 = this.f;
    }
    if (!((forwardValue4196_137_0 < 0))) {
        break forward_join_159;
    }
    life7_179 = (moom.Dr.a__Float(((double)(life4_18))) / this.k);
    this.f = ((int)(moom.Dr.a__Int(((float)(((life7_179 * ((float) (this.j - this.i))) + ((float) this.i)))))));
    }
    return;
}


private static java.lang.IllegalArgumentException a(java.lang.IllegalArgumentException p0) {
return p0;
}


public boolean a__Boolean() {
long life1_3;
    net.minecraft.entity.EntityLivingBase life4_8;
    int life3_9;
    life1_3 = (moom.ud.m ^ 105261778060761L);
    boolean spill7595_0 = moom.uc.d();
    life4_8 = ((net.minecraft.entity.EntityLiving)(this.c)).d__sourceReturn_d30556f370();
    life3_9 = ((spill7595_0) ? 1 : 0);
    if ((life3_9 != 0)) {
        if ((life4_8 == null)) {
        return false;
    }
        this.e = ((net.minecraft.entity.EntityLivingBase)(life4_8));
    }
    return true;
}

}
