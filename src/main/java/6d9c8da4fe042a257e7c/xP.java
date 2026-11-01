package moom;


public class xP extends net.minecraft.item.Item {

private final float n;

private final moom.a4 o;

private static final long p;

private static final long q;

public xP(moom.a4 p0) {
super();
    this.o = p0;
    this.f = 1;
    (this).c((p0).a__Int());
    (this).a(net.minecraft.creativetab.CreativeTabs.j);
    this.n = (0x1.0000000000000p+2f + (p0).b());
}


static {
p = ((long)(((moom._a)(moom._c.a(((long)(-6553387942231432558L)), ((long)(-3855534152455966271L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(73461131825287L)))));
    long local0_life6 = (moom.xP.p ^ 108235079343034L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill1104_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1104_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1104_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1104_13 = new byte[8];
    (__sourceSpill1104_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill1104_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation1104_15 = __sourceSpill1104_13;
    ((javax.crypto.Cipher)(__sourceSpill1104_10)).init(((int)(__sourceSpill1104_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1104_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1104_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = 2637389985301183363L;
    byte[] __sourceSpill1104_19 = new byte[8];
    (__sourceSpill1104_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill1104_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill1104_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill1104_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill1104_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill1104_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill1104_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill1104_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill1104_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill1104_20)).doFinal(((byte[])(__sourceSpill1104_19)));
    q = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


public java.lang.String b__sourceReturn_0e30dfc966() {
return ((moom.a4)(this.o)).toString();
}


public boolean c__Boolean() {
return ((1) != 0);
}


public int c() {
return ((moom.a4)(this.o)).c();
}


public boolean a__Boolean(net.minecraft.block.Block p0) {
long local2 = (moom.xP.p ^ 125090121701550L);
    return ((((p0 == net.minecraft.init.Blocks.G) ? 1 : 0)) != 0);
}


public boolean a(net.minecraft.item.ItemStack p0, net.minecraft.item.ItemStack p1) {
moom.xP forwardValue4497_15_0;
    int forwardValue4497_22_0;
    int forwardValue4497_24_0;
    moom.xP spill4497_0;
    boolean spill4497_1;
    long life3_3;
    int life5_5;
    forward_join_24: {
    forward_join_23: {
    forward_join_22: {
    forward_join_21: {
    forward_join_15: {
    life3_3 = (moom.xP.p ^ 110159393106203L);
    life5_5 = ((net.minecraft.item.ItemStack.l()) ? 1 : 0);
    spill4497_0 = this;
    if (!((life5_5 == 0))) {
        forwardValue4497_15_0 = spill4497_0;
        break forward_join_15;
    }
    if (!((((moom.a4)(((moom.xP)(spill4497_0)).o)).a__wQ() != ((net.minecraft.item.ItemStack)(p1)).a__wQ()))) {
        break forward_join_21;
    }
    forwardValue4497_15_0 = this;
    }
    spill4497_1 = __sourceIntrinsic_0603dfbbc4ad_call4497_6(forwardValue4497_15_0, p0, p1);
    if (!((life5_5 == 0))) {
        forwardValue4497_22_0 = ((spill4497_1) ? 1 : 0);
        break forward_join_22;
    }
    if (!(spill4497_1)) {
        break forward_join_23;
    }
    }
    forwardValue4497_22_0 = 1;
    }
    forwardValue4497_24_0 = forwardValue4497_22_0;
    break forward_join_24;
    }
    forwardValue4497_24_0 = 0;
    }
    return ((forwardValue4497_24_0) != 0);
}


public com.google.common.collect.Multimap<java.lang.String, moom.vB> a__Multimap() {
com.google.common.collect.Multimap local1 = super.a__Multimap();
    ((com.google.common.collect.Multimap)(local1)).put(((java.lang.Object)(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.f)).a__String())), ((java.lang.Object)(new moom.vB(moom.xP.c, "Weapon modifier", ((double) this.n), 0))));
    return local1;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public boolean a(net.minecraft.item.ItemStack p0, net.minecraft.world.World p1, net.minecraft.block.Block p2, moom.DT p3, net.minecraft.entity.EntityLivingBase p4) {
int forwardValue4498_21_0;
    int spill4498_0;
    long life6_3;
    int life8_5;
    forward_join_21: {
    forward_join_20: {
    life6_3 = (moom.xP.p ^ 119927177306875L);
    life8_5 = ((net.minecraft.item.ItemStack.m()) ? 1 : 0);
    spill4498_0 = recovery.source.CarrierOps.dcmpl(((double)(((double) ((net.minecraft.block.Block)(p2)).a(((net.minecraft.world.World)(p1)), ((moom.DT)(p3)))))), ((double)(0x0.0p0d)));
    if (!((life8_5 != 0))) {
        forwardValue4498_21_0 = spill4498_0;
        break forward_join_21;
    }
    if (!((spill4498_0 != 0))) {
        break forward_join_20;
    }
    ((net.minecraft.item.ItemStack)(p0)).a(((int)(2)), ((net.minecraft.entity.EntityLivingBase)(p4)));
    }
    forwardValue4498_21_0 = 1;
    }
    return ((forwardValue4498_21_0) != 0);
}


public boolean a(net.minecraft.item.ItemStack p0, net.minecraft.entity.EntityLivingBase p1, net.minecraft.entity.EntityLivingBase p2) {
((net.minecraft.item.ItemStack)(p0)).a(((int)(1)), ((net.minecraft.entity.EntityLivingBase)(p2)));
    return ((1) != 0);
}


public float a(net.minecraft.item.ItemStack p0, net.minecraft.block.Block p1) {
net.minecraft.block.Block forwardValue4496_14_0;
    moom.fn forwardValue4496_23_0;
    moom.fn forwardValue4496_23_1;
    moom.fn forwardValue4496_28_0;
    moom.fn forwardValue4496_28_1;
    moom.fn forwardValue4496_33_0;
    moom.fn forwardValue4496_33_1;
    moom.fn forwardValue4496_38_0;
    moom.fn forwardValue4496_38_1;
    float forwardValue4496_42_0;
    net.minecraft.block.Block spill4496_0;
    moom.fn spill4496_1;
    moom.fn spill4496_2;
    long life3_3;
    int life5_5;
    moom.fn life6_20;
    forward_join_42: {
    forward_join_41: {
    forward_join_38: {
    forward_join_33: {
    forward_join_28: {
    forward_join_23: {
    forward_join_14: {
    forward_join_13: {
    life3_3 = (moom.xP.p ^ 75122773859602L);
    life5_5 = ((net.minecraft.item.ItemStack.m()) ? 1 : 0);
    spill4496_0 = p1;
    if (!((life5_5 != 0))) {
        forwardValue4496_14_0 = spill4496_0;
        break forward_join_14;
    }
    if (!((spill4496_0 == net.minecraft.init.Blocks.G))) {
        break forward_join_13;
    }
    return 0x1.ep3f;
    }
    forwardValue4496_14_0 = p1;
    }
    life6_20 = ((net.minecraft.block.Block)(forwardValue4496_14_0)).a__fn();
    spill4496_1 = life6_20;
    spill4496_2 = moom.fn.k;
    if (!((life5_5 != 0))) {
        forwardValue4496_23_0 = spill4496_1;
        forwardValue4496_23_1 = spill4496_2;
        break forward_join_23;
    }
    if (!((spill4496_1 != spill4496_2))) {
        break forward_join_41;
    }
    forwardValue4496_23_0 = life6_20;
    forwardValue4496_23_1 = moom.fn.l;
    }
    if (!((life5_5 != 0))) {
        forwardValue4496_28_0 = forwardValue4496_23_0;
        forwardValue4496_28_1 = forwardValue4496_23_1;
        break forward_join_28;
    }
    if (!((forwardValue4496_23_0 != forwardValue4496_23_1))) {
        break forward_join_41;
    }
    forwardValue4496_28_0 = life6_20;
    forwardValue4496_28_1 = moom.fn.v;
    }
    if (!((life5_5 != 0))) {
        forwardValue4496_33_0 = forwardValue4496_28_0;
        forwardValue4496_33_1 = forwardValue4496_28_1;
        break forward_join_33;
    }
    if (!((forwardValue4496_28_0 != forwardValue4496_28_1))) {
        break forward_join_41;
    }
    forwardValue4496_33_0 = life6_20;
    forwardValue4496_33_1 = moom.fn.j;
    }
    if (!((life5_5 != 0))) {
        forwardValue4496_38_0 = forwardValue4496_33_0;
        forwardValue4496_38_1 = forwardValue4496_33_1;
        break forward_join_38;
    }
    if (!((forwardValue4496_33_0 != forwardValue4496_33_1))) {
        break forward_join_41;
    }
    forwardValue4496_38_0 = life6_20;
    forwardValue4496_38_1 = moom.fn.C;
    }
    if (!((forwardValue4496_38_0 != forwardValue4496_38_1))) {
        break forward_join_41;
    }
    forwardValue4496_42_0 = 0x1.0p0f;
    break forward_join_42;
    }
    forwardValue4496_42_0 = 0x1.8p0f;
    }
    return forwardValue4496_42_0;
}


public float a__sourceReturn_bc607678b6() {
return ((moom.a4)(this.o)).b();
}


public moom.a1 a__a1(net.minecraft.item.ItemStack p0) {
return moom.a1.BLOCK;
}


public int a__Int(net.minecraft.item.ItemStack p0) {
long local2 = (moom.xP.p ^ 19072403806079L);
    return ((int) moom.xP.q);
}


public net.minecraft.item.ItemStack a(net.minecraft.item.ItemStack p0, net.minecraft.world.World p1, net.minecraft.entity.player.EntityPlayer p2) {
((net.minecraft.entity.player.EntityPlayer)(p2)).b(((net.minecraft.item.ItemStack)(p0)), ((int)(((moom.xP)(this)).a__Int(((net.minecraft.item.ItemStack)(p0))))));
    return p0;
}


private static native <E extends Throwable> boolean __sourceIntrinsic_0603dfbbc4ad_call4497_6(moom.xP a0, net.minecraft.item.ItemStack a1, net.minecraft.item.ItemStack a2) throws E;
}
