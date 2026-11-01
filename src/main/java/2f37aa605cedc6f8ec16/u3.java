package moom;


public class u3 extends moom.uc {

private moom.sI c;

private double d;

private double e;

private double f;

private double g;

private double h;

private double i;

private net.minecraft.entity.player.EntityPlayer j;

private int k;

private boolean l;

private net.minecraft.item.Item m;

private boolean n;

private boolean o;

private static long p;

private static long q;

public u3(moom.sI p0, double p1, net.minecraft.item.Item p2, boolean p3) { super(); }


private static void __sourceConstructorBody_b991c2325bbf4467(moom.u3 receiver, moom.sI p0, double p1, net.minecraft.item.Item p2, boolean p3) throws Throwable {

long local6 = (moom.u3.p ^ 37385494048301L);

    moom.u3.__sourceConstructorInit_b991c2325bbf4467_0(((moom.u3)(receiver)));

    ((moom.u3)(receiver)).c = ((moom.sI)(p0));

    ((moom.u3)(receiver)).d = ((double)(p1));

    ((moom.u3)(receiver)).m = ((net.minecraft.item.Item)(p2));

    ((moom.u3)(receiver)).n = ((boolean)(p3));

    ((moom.u3)(receiver)).a(((int)(3)));

    if ((((__sourceExactCall_61e3a024849730(((moom.sI)(p0))) instanceof moom.AW) ? 1 : 0) == 0)) {

        throw new java.lang.IllegalArgumentException("Unsupported mob type for TemptGoal");

    }

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_b991c2325bbf4467_0(moom.u3 a0) throws E;

static {
p = ((long)(((moom._a)(moom._c.a(((long)(-7328546173177409607L)), ((long)(-831742163027521239L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(4514789343777L)))));
    long local0_life6 = (moom.u3.p ^ 40428122460001L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill1039_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1039_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1039_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1039_13 = new byte[8];
    (__sourceSpill1039_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill1039_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation1039_15 = __sourceSpill1039_13;
    ((javax.crypto.Cipher)(__sourceSpill1039_10)).init(((int)(__sourceSpill1039_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1039_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1039_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = 2824528956133708145L;
    byte[] __sourceSpill1039_19 = new byte[8];
    (__sourceSpill1039_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill1039_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill1039_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill1039_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill1039_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill1039_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill1039_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill1039_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill1039_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill1039_20)).doFinal(((byte[])(__sourceSpill1039_19)));
    q = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


public void b__Void() {
long local1 = (moom.u3.p ^ 66550433253232L);
    this.j = ((net.minecraft.entity.player.EntityPlayer)(null));
    ((moom.AV)(((moom.sI)(this.c)).a__sourceReturn_407923443b())).c();
    this.k = ((int)(((int) moom.u3.q)));
    this.l = ((boolean)(false));
    ((moom.AW)(((moom.AW)(((moom.sI)(this.c)).a__sourceReturn_407923443b())))).a(((boolean)__sourceIntrinsic_integerToBoolean((((this.o) ? 1 : 0)))));
    return;
}


public boolean b__Boolean() {
int forwardValue4118_47_0;
    int forwardValue4118_64_0;
    moom.u3 forwardValue4118_76_0;
    moom.u3 forwardValue4118_87_0;
    int forwardValue4118_94_0;
    boolean spill4118_0;
    moom.u3 spill4118_1;
    int spill4118_2;
    moom.u3 spill4118_3;
    long life1_3;
    int life3_5;
    forward_join_94: {
    forward_join_92: {
    forward_join_87: {
    forward_join_80: {
    forward_join_76: {
    forward_join_65: {
    forward_join_64: {
    forward_join_63: {
    forward_join_47: {
    forward_join_37: {
    life1_3 = (moom.u3.p ^ 130824966520809L);
    life3_5 = ((moom.uc.d()) ? 1 : 0);
    spill4118_0 = this.n;
    if (!((life3_5 != 0))) {
        forwardValue4118_94_0 = ((spill4118_0) ? 1 : 0);
        break forward_join_94;
    }
    if (!(spill4118_0)) {
        break forward_join_92;
    }
    spill4118_1 = this;
    if (!((life3_5 != 0))) {
        forwardValue4118_76_0 = spill4118_1;
        break forward_join_76;
    }
    if (!((recovery.source.CarrierOps.dcmpg(((double)(((moom.sI)(((moom.u3)(spill4118_1)).c)).a(((net.minecraft.entity.Entity)(this.j))))), ((double)(0x1.2p5d))) < 0))) {
        break forward_join_65;
    }
    spill4118_2 = recovery.source.CarrierOps.dcmpl(((double)(((net.minecraft.entity.player.EntityPlayer)(this.j)).a(((double)(this.e)), ((double)(this.f)), ((double)(this.g))))), ((double)(0x1.47ae147ae147cp-7d)));
    if (!((life3_5 != 0))) {
        forwardValue4118_47_0 = spill4118_2;
        break forward_join_47;
    }
    if (!((spill4118_2 > 0))) {
        break forward_join_37;
    }
    return ((0) != 0);
    }
    forwardValue4118_47_0 = recovery.source.CarrierOps.dcmpl(((double)(java.lang.Math.abs(((double)((((double) ((net.minecraft.entity.player.EntityPlayer)(this.j)).x) - this.h)))))), ((double)(0x1.4p2d)));
    }
    if (!((life3_5 != 0))) {
        forwardValue4118_64_0 = forwardValue4118_47_0;
        break forward_join_64;
    }
    if (!((forwardValue4118_47_0 <= 0))) {
        break forward_join_63;
    }
    spill4118_3 = this;
    if (!((life3_5 != 0))) {
        forwardValue4118_87_0 = spill4118_3;
        break forward_join_87;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(java.lang.Math.abs(((double)((((double) ((net.minecraft.entity.player.EntityPlayer)(((moom.u3)(spill4118_3)).j)).w) - this.i)))))), ((double)(0x1.4p2d))) > 0))) {
        break forward_join_80;
    }
    }
    forwardValue4118_64_0 = 0;
    }
    return ((forwardValue4118_64_0) != 0);
    }
    this.e = ((double)(((net.minecraft.entity.player.EntityPlayer)(this.j)).n));
    this.f = ((double)(((net.minecraft.entity.player.EntityPlayer)(this.j)).o));
    forwardValue4118_76_0 = this;
    }
    ((moom.u3)(forwardValue4118_76_0)).g = ((double)(((net.minecraft.entity.player.EntityPlayer)(this.j)).p));
    }
    this.h = ((double)(((double) ((net.minecraft.entity.player.EntityPlayer)(this.j)).x)));
    forwardValue4118_87_0 = this;
    }
    ((moom.u3)(forwardValue4118_87_0)).i = ((double)(((double) ((net.minecraft.entity.player.EntityPlayer)(this.j)).w)));
    }
    forwardValue4118_94_0 = ((((moom.u3)(this)).a__Boolean()) ? 1 : 0);
    }
    return ((forwardValue4118_94_0) != 0);
}


public void c() {
int forwardValue4119_41_0;
    boolean spill4119_0;
    int spill4119_1;
    long life1_3;
    int life3_16;
    forward_join_42: {
    forward_join_41: {
    forward_join_33: {
    life1_3 = (moom.u3.p ^ 39479100300618L);
    spill4119_0 = moom.uc.e();
    ((net.minecraft.entity.ai.EntityLookHelper)(((moom.sI)(this.c)).a__vt())).a(((net.minecraft.entity.Entity)(this.j)), ((float)(0x1.ep4f)), ((float)(((float) ((moom.sI)(this.c)).m__Int()))));
    life3_16 = ((spill4119_0) ? 1 : 0);
    spill4119_1 = recovery.source.CarrierOps.dcmpg(((double)(((moom.sI)(this.c)).a(((net.minecraft.entity.Entity)(this.j))))), ((double)(0x1.9p2d)));
    if (!((life3_16 == 0))) {
        forwardValue4119_41_0 = spill4119_1;
        break forward_join_41;
    }
    if (!((spill4119_1 < 0))) {
        break forward_join_33;
    }
    ((moom.AV)(((moom.sI)(this.c)).a__sourceReturn_407923443b())).c();
    if (!((life3_16 != 0))) {
        break forward_join_42;
    }
    }
    forwardValue4119_41_0 = ((((moom.AV)(((moom.sI)(this.c)).a__sourceReturn_407923443b())).a(((net.minecraft.entity.Entity)(this.j)), ((double)(this.d)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue4119_41_0);
    }
    return;
}


public boolean f() {
return ((((this.l) ? 1 : 0)) != 0);
}


private static java.lang.IllegalArgumentException a(java.lang.IllegalArgumentException p0) {
return p0;
}


public boolean a__Boolean() {
moom.u3 forwardValue4117_29_0;
    net.minecraft.entity.player.EntityPlayer forwardValue4117_37_0;
    net.minecraft.item.ItemStack forwardValue4117_44_0;
    int forwardValue4117_51_0;
    moom.u3 spill4117_0;
    net.minecraft.entity.player.EntityPlayer spill4117_1;
    net.minecraft.item.ItemStack spill4117_2;
    long life1_3;
    int life3_5;
    net.minecraft.item.ItemStack life4_48;
    forward_join_51: {
    forward_join_50: {
    forward_join_44: {
    forward_join_37: {
    forward_join_35: {
    forward_join_29: {
    forward_join_19: {
    life1_3 = (moom.u3.p ^ 33326796035960L);
    life3_5 = ((moom.uc.e()) ? 1 : 0);
    spill4117_0 = this;
    if (!((life3_5 == 0))) {
        forwardValue4117_29_0 = spill4117_0;
        break forward_join_29;
    }
    if (!((((moom.u3)(spill4117_0)).k > 0))) {
        break forward_join_19;
    }
    moom.u3 __stackOp4117_4_0 = this;
    ((moom.u3)(__stackOp4117_4_0)).k = ((int)((((moom.u3)(__stackOp4117_4_0)).k - 1)));
    return ((0) != 0);
    }
    this.j = ((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.world.World)(((moom.sI)(this.c)).i)).a(((net.minecraft.entity.Entity)(this.c)), ((double)(0x1.4p3d)))));
    forwardValue4117_29_0 = this;
    }
    spill4117_1 = ((moom.u3)(forwardValue4117_29_0)).j;
    if (!((life3_5 == 0))) {
        forwardValue4117_37_0 = spill4117_1;
        break forward_join_37;
    }
    if (!((spill4117_1 == null))) {
        break forward_join_35;
    }
    return ((0) != 0);
    }
    forwardValue4117_37_0 = this.j;
    }
    life4_48 = ((net.minecraft.entity.player.EntityPlayer)(forwardValue4117_37_0)).c__xW();
    spill4117_2 = life4_48;
    if (!((life3_5 == 0))) {
        forwardValue4117_44_0 = spill4117_2;
        break forward_join_44;
    }
    if (!((spill4117_2 != null))) {
        break forward_join_50;
    }
    forwardValue4117_44_0 = life4_48;
    }
    if (!((((net.minecraft.item.ItemStack)(forwardValue4117_44_0)).a__wQ() == this.m))) {
        break forward_join_50;
    }
    forwardValue4117_51_0 = 1;
    break forward_join_51;
    }
    forwardValue4117_51_0 = 0;
    }
    return ((forwardValue4117_51_0) != 0);
}


public void a__Void() {
this.e = ((double)(((net.minecraft.entity.player.EntityPlayer)(this.j)).n));
    this.f = ((double)(((net.minecraft.entity.player.EntityPlayer)(this.j)).o));
    this.g = ((double)(((net.minecraft.entity.player.EntityPlayer)(this.j)).p));
    this.l = ((boolean)(true));
    this.o = ((boolean)(((moom.AW)(((moom.AW)(((moom.sI)(this.c)).a__sourceReturn_407923443b())))).d__Boolean()));
    ((moom.AW)(((moom.AW)(((moom.sI)(this.c)).a__sourceReturn_407923443b())))).a(((boolean)(false)));
    return;
}


private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native moom.AV __sourceExactCall_61e3a024849730(moom.sI p0);
}
