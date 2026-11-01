package moom;


public class uu extends moom.uc {

private moom.sS c;

private net.minecraft.entity.EntityLivingBase d;

net.minecraft.world.World e;

private double f;

private moom.AV g;

private int h;

float i;

float j;

private boolean k;

private static long l;

private static long m;

public uu(moom.sS p0, double p1, float p2, float p3) { super(); }


private static void __sourceConstructorBody_1a30e5ac09e6b3bc(moom.uu receiver, moom.sS p0, double p1, float p2, float p3) throws Throwable {

long local6 = (moom.uu.l ^ 94137880535326L);

    moom.uu.__sourceConstructorInit_1a30e5ac09e6b3bc_0(((moom.uu)(receiver)));

    ((moom.uu)(receiver)).c = ((moom.sS)(p0));

    ((moom.uu)(receiver)).e = ((net.minecraft.world.World)(((moom.sS)(p0)).i));

    ((moom.uu)(receiver)).f = ((double)(p1));

    ((moom.uu)(receiver)).g = ((moom.AV)(__sourceExactCall_820183f1730cf2(((moom.sS)(p0)))));

    ((moom.uu)(receiver)).j = ((float)(p2));

    ((moom.uu)(receiver)).i = ((float)(p3));

    ((moom.uu)(receiver)).a(((int)(3)));

    if ((((__sourceExactCall_820183f1730cf2(((moom.sS)(p0))) instanceof moom.AW) ? 1 : 0) == 0)) {

        throw new java.lang.IllegalArgumentException("Unsupported mob type for FollowOwnerGoal");

    }

    return;

}



static {
l = ((long)(((moom._a)(moom._c.a(((long)(4018264628485531552L)), ((long)(-8395657813662693735L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(132136816139601L)))));
    long local0_life6 = (moom.uu.l ^ 70930854004173L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill1061_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1061_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1061_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1061_13 = new byte[8];
    (__sourceSpill1061_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill1061_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation1061_15 = __sourceSpill1061_13;
    ((javax.crypto.Cipher)(__sourceSpill1061_10)).init(((int)(__sourceSpill1061_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1061_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1061_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -7459451946854930508L;
    byte[] __sourceSpill1061_19 = new byte[8];
    (__sourceSpill1061_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill1061_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill1061_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill1061_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill1061_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill1061_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill1061_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill1061_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill1061_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill1061_20)).doFinal(((byte[])(__sourceSpill1061_19)));
    m = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}

private static native <E extends Throwable> void __sourceConstructorInit_1a30e5ac09e6b3bc_0(moom.uu a0) throws E;

public void b__Void() {
this.d = ((net.minecraft.entity.EntityLivingBase)(null));
    ((moom.AV)(this.g)).c();
    ((moom.AW)(((moom.AW)(((moom.sS)(this.c)).a__sourceReturn_407923443b())))).a(((boolean)(true)));
    return;
}


public boolean b__Boolean() {
int forwardValue4241_24_0;
    int forwardValue4241_30_0;
    int forwardValue4241_34_0;
    int forwardValue4241_36_0;
    boolean spill4241_0;
    long life1_3;
    int life3_5;
    forward_join_36: {
    forward_join_35: {
    forward_join_34: {
    forward_join_30: {
    forward_join_24: {
    life1_3 = (moom.uu.l ^ 74449679209369L);
    life3_5 = ((moom.uc.e()) ? 1 : 0);
    spill4241_0 = ((moom.AV)(this.g)).a__Boolean();
    if (!((life3_5 == 0))) {
        forwardValue4241_24_0 = ((spill4241_0) ? 1 : 0);
        break forward_join_24;
    }
    if (!((!spill4241_0))) {
        break forward_join_35;
    }
    forwardValue4241_24_0 = recovery.source.CarrierOps.dcmpl(((double)(((moom.sS)(this.c)).a(((net.minecraft.entity.Entity)(this.d))))), ((double)(((double) (this.i * this.i)))));
    }
    if (!((life3_5 == 0))) {
        forwardValue4241_30_0 = forwardValue4241_24_0;
        break forward_join_30;
    }
    if (!((forwardValue4241_24_0 > 0))) {
        break forward_join_35;
    }
    forwardValue4241_30_0 = ((((moom.sS)(this.c)).af()) ? 1 : 0);
    }
    if (!((life3_5 == 0))) {
        forwardValue4241_34_0 = forwardValue4241_30_0;
        break forward_join_34;
    }
    if (!((forwardValue4241_30_0 == 0))) {
        break forward_join_35;
    }
    forwardValue4241_34_0 = 1;
    }
    forwardValue4241_36_0 = forwardValue4241_34_0;
    break forward_join_36;
    }
    forwardValue4241_36_0 = 0;
    }
    return ((forwardValue4241_36_0) != 0);
}


public void c() {
int forestValue511_30_0;
    int forestValue511_44_0;
    int forestValue511_50_0;
    int forestValue511_60_0;
    int forestValue511_69_0;
    int forestValue511_87_0;
    int forestValue511_87_1;
    int forestValue511_130_0;
    int forestValue511_145_0;
    int forestValue511_164_0;
    moom.uu forestValue511_199_0;
    boolean spill511_0;
    boolean spill511_1;
    int spill511_2;
    int spill511_3;
    int spill511_4;
    int spill511_5;
    int spill511_6;
    int spill511_7;
    moom.uu spill511_8;
    long life1_3;
    int life3_16;
    int life4_79;
    int life5_86;
    int life6_92;
    int life7_94;
    int life8_99;
    forest_join_202: {
    forest_join_199: {
    forest_join_173: {
    forest_join_69: {
    forest_join_60: {
    forest_join_50: {
    forest_join_44: {
    forest_join_30: {
    life1_3 = (moom.uu.l ^ 24935854059834L);
    spill511_0 = moom.uc.e();
    ((net.minecraft.entity.ai.EntityLookHelper)(((moom.sS)(this.c)).a__vt())).a(((net.minecraft.entity.Entity)(this.d)), ((float)(0x1.4p3f)), ((float)(((float) ((moom.sS)(this.c)).m__Int()))));
    life3_16 = ((spill511_0) ? 1 : 0);
    spill511_1 = ((moom.sS)(this.c)).af();
    if (!((life3_16 == 0))) {
        forestValue511_30_0 = ((spill511_1) ? 1 : 0);
        break forest_join_30;
    }
    if (!((!spill511_1))) {
        break forest_join_202;
    }
    moom.uu __stackOp511_12_0 = this;
    moom.uu __stackOp511_14_0 = __stackOp511_12_0;
    int __stackOp511_14_1 = (((moom.uu)(__stackOp511_12_0)).h - 1);
    spill511_2 = __stackOp511_14_1;
    ((moom.uu)(__stackOp511_14_0)).h = ((int)(__stackOp511_14_1));
    forestValue511_30_0 = spill511_2;
    }
    if (!((life3_16 == 0))) {
        forestValue511_44_0 = forestValue511_30_0;
        break forest_join_44;
    }
    if (!((forestValue511_30_0 <= 0))) {
        break forest_join_202;
    }
    this.h = ((int)(((int) moom.uu.m)));
    forestValue511_44_0 = ((((moom.AV)(this.g)).a(((net.minecraft.entity.Entity)(this.d)), ((double)(this.f)))) ? 1 : 0);
    }
    if (!((life3_16 == 0))) {
        forestValue511_50_0 = forestValue511_44_0;
        break forest_join_50;
    }
    if (!((forestValue511_44_0 == 0))) {
        break forest_join_202;
    }
    forestValue511_50_0 = ((((moom.sS)(this.c)).T__Boolean()) ? 1 : 0);
    }
    if (!((life3_16 == 0))) {
        forestValue511_60_0 = forestValue511_50_0;
        break forest_join_60;
    }
    if (!((forestValue511_50_0 == 0))) {
        break forest_join_202;
    }
    forestValue511_60_0 = recovery.source.CarrierOps.dcmpl(((double)(((moom.sS)(this.c)).a(((net.minecraft.entity.Entity)(this.d))))), ((double)(0x1.2p7d)));
    }
    if (!((life3_16 == 0))) {
        forestValue511_69_0 = forestValue511_60_0;
        break forest_join_69;
    }
    if (!((forestValue511_60_0 >= 0))) {
        break forest_join_202;
    }
    forestValue511_69_0 = (moom.Dr.b__Int(((double)(((net.minecraft.entity.EntityLivingBase)(this.d)).n))) - 2);
    }
    life4_79 = forestValue511_69_0;
    life5_86 = (moom.Dr.b__Int(((double)(((net.minecraft.entity.EntityLivingBase)(this.d)).p))) - 2);
    life6_92 = moom.Dr.b__Int(((double)(((moom.CA)(((net.minecraft.entity.EntityLivingBase)(this.d)).b())).c)));
    life7_94 = 0;
    forest_cycle_85: while (true) {
    forest_join_169: {
    forestValue511_87_0 = life7_94;
    forestValue511_87_1 = 4;
    forest_cycle_87: while (true) {
    if (!((forestValue511_87_0 <= forestValue511_87_1))) {
        break forest_join_202;
    }
    life8_99 = 0;
    forest_cycle_90: while (true) {
    forest_join_166: {
    forest_join_164: {
    forest_join_145: {
    forest_join_130: {
    forest_join_115: {
    if (!((life8_99 <= 4))) {
        break forest_join_169;
    }
    spill511_3 = life7_94;
    if (!((life3_16 == 0))) {
        forestValue511_130_0 = spill511_3;
        break forest_join_130;
    }
    spill511_4 = 1;
    if (!((life3_16 == 0))) {
        forestValue511_87_0 = spill511_3;
        forestValue511_87_1 = spill511_4;
        continue forest_cycle_87;
    }
    if (!((spill511_3 >= spill511_4))) {
        break forest_join_115;
    }
    spill511_5 = life8_99;
    if (!((life3_16 == 0))) {
        forestValue511_130_0 = spill511_5;
        break forest_join_130;
    }
    if (!((spill511_5 >= 1))) {
        break forest_join_115;
    }
    spill511_6 = life7_94;
    if (!((life3_16 == 0))) {
        forestValue511_130_0 = spill511_6;
        break forest_join_130;
    }
    if (!((spill511_6 <= 3))) {
        break forest_join_115;
    }
    spill511_7 = life8_99;
    if (!((life3_16 == 0))) {
        forestValue511_130_0 = spill511_7;
        break forest_join_130;
    }
    if (!((spill511_7 > 3))) {
        break forest_join_166;
    }
    }
    forestValue511_130_0 = ((__sourceExactCall_fafaf58231f9bd(((net.minecraft.world.IBlockAccess)(this.e)), ((moom.DT)(new moom.DT((life4_79 + life7_94), (life6_92 - 1), (life5_86 + life8_99)))))) ? 1 : 0);
    }
    if (!((life3_16 == 0))) {
        forestValue511_145_0 = forestValue511_130_0;
        break forest_join_145;
    }
    if (!((forestValue511_130_0 != 0))) {
        break forest_join_166;
    }
    forestValue511_145_0 = ((((moom.uu)(this)).a(((moom.DT)(new moom.DT((life4_79 + life7_94), life6_92, (life5_86 + life8_99)))))) ? 1 : 0);
    }
    if (!((life3_16 == 0))) {
        forestValue511_164_0 = forestValue511_145_0;
        break forest_join_164;
    }
    if (!((forestValue511_145_0 != 0))) {
        break forest_join_166;
    }
    spill511_8 = this;
    if (!((life3_16 == 0))) {
        forestValue511_199_0 = spill511_8;
        break forest_join_199;
    }
    forestValue511_164_0 = ((((moom.uu)(spill511_8)).a(((moom.DT)(new moom.DT((life4_79 + life7_94), (life6_92 + 1), (life5_86 + life8_99)))))) ? 1 : 0);
    }
    if (!((forestValue511_164_0 != 0))) {
        break forest_join_166;
    }
    break forest_join_173;
    }
    life8_99 += 1;
    if (!((life3_16 != 0))) {
        continue forest_cycle_90;
    }
    break forest_cycle_90;
    }
    break forest_cycle_87;
    }
    }
    life7_94 += 1;
    if (!((life3_16 != 0))) {
        continue forest_cycle_85;
    }
    break forest_cycle_85;
    }
    break forest_join_202;
    }
    ((moom.sS)(this.c)).c(((double)(((double) (((float) (life4_79 + life7_94)) + 0x1.0p-1f)))), ((double)(((double) life6_92))), ((double)(((double) (((float) (life5_86 + life8_99)) + 0x1.0p-1f)))), ((float)(((moom.sS)(this.c)).w)), ((float)(((moom.sS)(this.c)).x)));
    forestValue511_199_0 = this;
    }
    ((moom.AV)(((moom.uu)(forestValue511_199_0)).g)).c();
    return;
    }
    return;
}


public boolean a__Boolean() {
net.minecraft.entity.EntityLivingBase forwardValue4240_17_0;
    int forwardValue4240_32_0;
    int forwardValue4240_48_0;
    int forwardValue4240_57_0;
    boolean spill4240_0;
    net.minecraft.entity.EntityLivingBase spill4240_1;
    int spill4240_2;
    boolean spill4240_3;
    long life1_3;
    net.minecraft.entity.EntityLivingBase life4_8;
    int life3_9;
    forward_join_57: {
    forward_join_53: {
    forward_join_48: {
    forward_join_37: {
    forward_join_32: {
    forward_join_29: {
    forward_join_17: {
    forward_join_16: {
    life1_3 = (moom.uu.l ^ 47301998426888L);
    spill4240_0 = moom.uc.d();
    life4_8 = ((moom.sS)(this.c)).e__sourceReturn_d30556f370();
    life3_9 = ((spill4240_0) ? 1 : 0);
    spill4240_1 = life4_8;
    if (!((life3_9 != 0))) {
        forwardValue4240_17_0 = spill4240_1;
        break forward_join_17;
    }
    if (!((spill4240_1 == null))) {
        break forward_join_16;
    }
    return ((0) != 0);
    }
    forwardValue4240_17_0 = life4_8;
    }
    spill4240_2 = ((forwardValue4240_17_0 instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0);
    if (!((life3_9 != 0))) {
        forwardValue4240_32_0 = spill4240_2;
        break forward_join_32;
    }
    if (!((spill4240_2 != 0))) {
        break forward_join_29;
    }
    spill4240_3 = ((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.entity.player.EntityPlayer)(life4_8)))).U__Boolean();
    if (!((life3_9 != 0))) {
        forwardValue4240_32_0 = ((spill4240_3) ? 1 : 0);
        break forward_join_32;
    }
    if (!(spill4240_3)) {
        break forward_join_29;
    }
    return ((0) != 0);
    }
    forwardValue4240_32_0 = ((((moom.sS)(this.c)).af()) ? 1 : 0);
    }
    if (!((life3_9 != 0))) {
        forwardValue4240_48_0 = forwardValue4240_32_0;
        break forward_join_48;
    }
    if (!((forwardValue4240_32_0 != 0))) {
        break forward_join_37;
    }
    return ((0) != 0);
    }
    forwardValue4240_48_0 = recovery.source.CarrierOps.dcmpg(((double)(((moom.sS)(this.c)).a(((net.minecraft.entity.Entity)(life4_8))))), ((double)(((double) (this.j * this.j)))));
    }
    if (!((life3_9 != 0))) {
        forwardValue4240_57_0 = forwardValue4240_48_0;
        break forward_join_57;
    }
    if (!((forwardValue4240_48_0 < 0))) {
        break forward_join_53;
    }
    return ((0) != 0);
    }
    this.d = ((net.minecraft.entity.EntityLivingBase)(life4_8));
    forwardValue4240_57_0 = 1;
    }
    return ((forwardValue4240_57_0) != 0);
}


private static java.lang.IllegalArgumentException a(java.lang.IllegalArgumentException p0) {
return p0;
}


public void a__Void() {
this.h = ((int)(0));
    this.k = ((boolean)(((moom.AW)(((moom.AW)(((moom.sS)(this.c)).a__sourceReturn_407923443b())))).d__Boolean()));
    ((moom.AW)(((moom.AW)(((moom.sS)(this.c)).a__sourceReturn_407923443b())))).a(((boolean)(false)));
    return;
}


private boolean a(moom.DT p0) {
net.minecraft.block.Block forwardValue4239_20_0;
    int forwardValue4239_25_0;
    int forwardValue4239_27_0;
    boolean spill4239_0;
    net.minecraft.block.Block spill4239_1;
    boolean spill4239_2;
    long life2_3;
    net.minecraft.block.state.IBlockState life5_8;
    net.minecraft.block.Block life6_12;
    int life4_13;
    forward_join_27: {
    forward_join_26: {
    forward_join_25: {
    forward_join_24: {
    forward_join_20: {
    life2_3 = (moom.uu.l ^ 41555016109468L);
    life5_8 = ((net.minecraft.world.World)(this.e)).a__fE(((moom.DT)(p0)));
    spill4239_0 = moom.uc.e();
    life6_12 = ((net.minecraft.block.state.IBlockState)(life5_8)).a__ch();
    life4_13 = ((spill4239_0) ? 1 : 0);
    spill4239_1 = life6_12;
    if (!((life4_13 == 0))) {
        forwardValue4239_20_0 = spill4239_1;
        break forward_join_20;
    }
    if (!((spill4239_1 != net.minecraft.init.Blocks.a))) {
        break forward_join_24;
    }
    forwardValue4239_20_0 = life6_12;
    }
    spill4239_2 = ((net.minecraft.block.Block)(forwardValue4239_20_0)).g();
    if (!((life4_13 == 0))) {
        forwardValue4239_25_0 = ((spill4239_2) ? 1 : 0);
        break forward_join_25;
    }
    if (!((!spill4239_2))) {
        break forward_join_26;
    }
    }
    forwardValue4239_25_0 = 1;
    }
    forwardValue4239_27_0 = forwardValue4239_25_0;
    break forward_join_27;
    }
    forwardValue4239_27_0 = 0;
    }
    return ((forwardValue4239_27_0) != 0);
}


private static native boolean __sourceExactCall_fafaf58231f9bd(net.minecraft.world.IBlockAccess p0, moom.DT p1);

private static native moom.AV __sourceExactCall_820183f1730cf2(moom.sS p0);
}
