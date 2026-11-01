package moom;


public class uE extends moom.uC {

private net.minecraft.entity.passive.EntityOcelot k;

private static long l;

private static long m;

public uE(net.minecraft.entity.passive.EntityOcelot p0, double p1) { super((moom.sI)null, 0.0D, 0); }


private static void __sourceConstructorBody_009f36c2581582d9(moom.uE receiver, net.minecraft.entity.passive.EntityOcelot p0, double p1) throws Throwable {

long local4 = (moom.uE.l ^ 25192915025445L);

    moom.uE.__sourceConstructorInit_009f36c2581582d9_0(((moom.uE)(receiver)), ((net.minecraft.entity.passive.EntityOcelot)(p0)), ((double)(p1)), ((int)(((int) moom.uE.m))));

    ((moom.uE)(receiver)).k = ((net.minecraft.entity.passive.EntityOcelot)(p0));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_009f36c2581582d9_0(moom.uE a0, net.minecraft.entity.passive.EntityOcelot a1, double a2, int a3) throws E;

static {
l = ((long)(((moom._a)(moom._c.a(((long)(1605159515992994682L)), ((long)(-7448146979871741772L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(123369512607843L)))));
    long local0_life6 = (moom.uE.l ^ 138944239295260L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill1043_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1043_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1043_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1043_13 = new byte[8];
    (__sourceSpill1043_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill1043_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation1043_15 = __sourceSpill1043_13;
    ((javax.crypto.Cipher)(__sourceSpill1043_10)).init(((int)(__sourceSpill1043_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1043_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1043_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -6142693289793951400L;
    byte[] __sourceSpill1043_19 = new byte[8];
    (__sourceSpill1043_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill1043_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill1043_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill1043_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill1043_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill1043_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill1043_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill1043_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill1043_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill1043_20)).doFinal(((byte[])(__sourceSpill1043_19)));
    m = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public void b__Void() {
super.b__Void();
    ((net.minecraft.entity.passive.EntityOcelot)(this.k)).p(((boolean)(false)));
    return;
}


public boolean b__Boolean() {
return (__sourceIntrinsic_booleanComparison((super.b__Boolean())) != 0);
}


public void c() {
int forwardValue4152_29_0;
    net.minecraft.entity.passive.EntityOcelot forwardValue4152_32_0;
    boolean spill4152_0;
    boolean spill4152_1;
    net.minecraft.entity.passive.EntityOcelot spill4152_2;
    long life1_3;
    int life3_12;
    forward_join_34: {
    forward_join_32: {
    forward_join_29: {
    forward_join_24: {
    life1_3 = (moom.uE.l ^ 112282012373547L);
    spill4152_0 = moom.uc.e();
    super.c();
    ((moom.uP)(((net.minecraft.entity.passive.EntityOcelot)(this.k)).a__uP())).a(((boolean)(false)));
    life3_12 = ((spill4152_0) ? 1 : 0);
    spill4152_1 = ((moom.uE)(this)).f();
    if (!((life3_12 == 0))) {
        forwardValue4152_29_0 = ((spill4152_1) ? 1 : 0);
        break forward_join_29;
    }
    if (!((!spill4152_1))) {
        break forward_join_24;
    }
    ((net.minecraft.entity.passive.EntityOcelot)(this.k)).p(((boolean)(false)));
    if (!((life3_12 != 0))) {
        break forward_join_34;
    }
    }
    spill4152_2 = this.k;
    if (!((life3_12 == 0))) {
        forwardValue4152_32_0 = spill4152_2;
        break forward_join_32;
    }
    forwardValue4152_29_0 = ((((net.minecraft.entity.passive.EntityOcelot)(spill4152_2)).af()) ? 1 : 0);
    }
    if (!((forwardValue4152_29_0 == 0))) {
        break forward_join_34;
    }
    forwardValue4152_32_0 = this.k;
    }
    ((net.minecraft.entity.passive.EntityOcelot)(forwardValue4152_32_0)).p(((boolean)(true)));
    }
    return;
}


public boolean a__Boolean() {
int forwardValue4151_15_0;
    int forwardValue4151_20_0;
    int forwardValue4151_24_0;
    int forwardValue4151_26_0;
    boolean spill4151_0;
    long life1_3;
    int life3_5;
    forward_join_26: {
    forward_join_25: {
    forward_join_24: {
    forward_join_20: {
    forward_join_15: {
    life1_3 = (moom.uE.l ^ 100838301194265L);
    life3_5 = ((moom.uc.e()) ? 1 : 0);
    spill4151_0 = ((net.minecraft.entity.passive.EntityOcelot)(this.k)).ae();
    if (!((life3_5 == 0))) {
        forwardValue4151_15_0 = ((spill4151_0) ? 1 : 0);
        break forward_join_15;
    }
    if (!(spill4151_0)) {
        break forward_join_25;
    }
    forwardValue4151_15_0 = ((((net.minecraft.entity.passive.EntityOcelot)(this.k)).af()) ? 1 : 0);
    }
    if (!((life3_5 == 0))) {
        forwardValue4151_20_0 = forwardValue4151_15_0;
        break forward_join_20;
    }
    if (!((forwardValue4151_15_0 == 0))) {
        break forward_join_25;
    }
    forwardValue4151_20_0 = ((super.a__Boolean()) ? 1 : 0);
    }
    if (!((life3_5 == 0))) {
        forwardValue4151_24_0 = forwardValue4151_20_0;
        break forward_join_24;
    }
    if (!((forwardValue4151_20_0 != 0))) {
        break forward_join_25;
    }
    forwardValue4151_24_0 = 1;
    }
    forwardValue4151_26_0 = forwardValue4151_24_0;
    break forward_join_26;
    }
    forwardValue4151_26_0 = 0;
    }
    return ((forwardValue4151_26_0) != 0);
}


protected boolean a(net.minecraft.world.World p0, moom.DT p1) {
net.minecraft.world.World forwardValue4150_17_0;
    moom.DT forwardValue4150_17_1;
    int forwardValue4150_39_0;
    int forwardValue4150_44_0;
    int forwardValue4150_46_0;
    net.minecraft.block.Block forwardValue4150_49_0;
    net.minecraft.block.Block forwardValue4150_49_1;
    net.minecraft.block.Block forwardValue4150_56_0;
    net.minecraft.block.Block forwardValue4150_56_1;
    int forwardValue4150_65_0;
    net.minecraft.world.World spill4150_0;
    moom.DT spill4150_1;
    net.minecraft.block.Block spill4150_2;
    moom.cZ spill4150_3;
    int spill4150_4;
    long life3_3;
    int life5_5;
    net.minecraft.block.state.IBlockState life6_23;
    net.minecraft.block.Block life7_26;
    net.minecraft.tileentity.TileEntity life8_38;
    forward_join_65: {
    forward_join_64: {
    forward_join_56: {
    forward_join_54: {
    forward_join_49: {
    forward_join_47: {
    forward_join_46: {
    forward_join_45: {
    forward_join_44: {
    forward_join_39: {
    forward_join_17: {
    forward_join_15: {
    life3_3 = (moom.uE.l ^ 73962323086814L);
    life5_5 = ((moom.uc.d()) ? 1 : 0);
    spill4150_0 = p0;
    spill4150_1 = ((moom.DT)(p1)).a__DT();
    if (!((life5_5 != 0))) {
        forwardValue4150_17_0 = spill4150_0;
        forwardValue4150_17_1 = spill4150_1;
        break forward_join_17;
    }
    if (!((!((net.minecraft.world.World)(spill4150_0)).a__Boolean(((moom.DT)(spill4150_1)))))) {
        break forward_join_15;
    }
    return ((0) != 0);
    }
    forwardValue4150_17_0 = p0;
    forwardValue4150_17_1 = p1;
    }
    life6_23 = ((net.minecraft.world.World)(forwardValue4150_17_0)).a__fE(((moom.DT)(forwardValue4150_17_1)));
    life7_26 = ((net.minecraft.block.state.IBlockState)(life6_23)).a__ch();
    spill4150_2 = life7_26;
    spill4150_3 = net.minecraft.init.Blocks.ae;
    if (!((life5_5 != 0))) {
        forwardValue4150_49_0 = spill4150_2;
        forwardValue4150_49_1 = spill4150_3;
        break forward_join_49;
    }
    if (!((spill4150_2 == spill4150_3))) {
        break forward_join_47;
    }
    life8_38 = ((net.minecraft.world.World)(p0)).a__B9(((moom.DT)(p1)));
    spill4150_4 = ((life8_38 instanceof net.minecraft.tileentity.TileEntityChest) ? 1 : 0);
    if (!((life5_5 != 0))) {
        forwardValue4150_39_0 = spill4150_4;
        break forward_join_39;
    }
    if (!((spill4150_4 != 0))) {
        break forward_join_45;
    }
    forwardValue4150_39_0 = ((net.minecraft.tileentity.TileEntityChest)(((net.minecraft.tileentity.TileEntityChest)(life8_38)))).v;
    }
    if (!((life5_5 != 0))) {
        forwardValue4150_44_0 = forwardValue4150_39_0;
        break forward_join_44;
    }
    if (!((forwardValue4150_39_0 < 1))) {
        break forward_join_45;
    }
    forwardValue4150_44_0 = 1;
    }
    forwardValue4150_46_0 = forwardValue4150_44_0;
    break forward_join_46;
    }
    forwardValue4150_46_0 = 0;
    }
    return ((forwardValue4150_46_0) != 0);
    }
    forwardValue4150_49_0 = life7_26;
    forwardValue4150_49_1 = net.minecraft.init.Blocks.am;
    }
    if (!((life5_5 != 0))) {
        forwardValue4150_56_0 = forwardValue4150_49_0;
        forwardValue4150_56_1 = forwardValue4150_49_1;
        break forward_join_56;
    }
    if (!((forwardValue4150_49_0 == forwardValue4150_49_1))) {
        break forward_join_54;
    }
    return ((1) != 0);
    }
    forwardValue4150_56_0 = life7_26;
    forwardValue4150_56_1 = net.minecraft.init.Blocks.C;
    }
    if (!((forwardValue4150_56_0 == forwardValue4150_56_1))) {
        break forward_join_64;
    }
    if (!((((net.minecraft.block.state.IBlockState)(life6_23)).a(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockBed.R))) != net.minecraft.block.BlockBed$EnumPartType.HEAD))) {
        break forward_join_64;
    }
    forwardValue4150_65_0 = 1;
    break forward_join_65;
    }
    forwardValue4150_65_0 = 0;
    }
    return ((forwardValue4150_65_0) != 0);
}


public void a__Void() {
super.a__Void();
    ((moom.uP)(((net.minecraft.entity.passive.EntityOcelot)(this.k)).a__uP())).a(((boolean)(false)));
    return;
}


private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
