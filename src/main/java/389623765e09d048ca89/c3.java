package moom;


public class c3 extends moom.c2 {

private final moom.rx V;

private static final long Y;

private static final long gb;

public c3() {
super();
    this.V = new moom.rd();
}


static {
Y = ((long)(((moom._a)(moom._c.a(((long)(-2371031221609294058L)), ((long)(3740960725245790572L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(114330215250809L)))));
    long local0_life6 = (moom.c3.Y ^ 118582742954851L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill779_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill779_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill779_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill779_13 = new byte[8];
    (__sourceSpill779_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill779_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation779_15 = __sourceSpill779_13;
    ((javax.crypto.Cipher)(__sourceSpill779_10)).init(((int)(__sourceSpill779_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill779_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation779_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = 1022164884963617714L;
    byte[] __sourceSpill779_19 = new byte[8];
    (__sourceSpill779_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill779_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill779_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill779_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill779_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill779_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill779_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill779_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill779_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill779_20)).doFinal(((byte[])(__sourceSpill779_19)));
    gb = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


protected void b__Void(net.minecraft.world.World p0, moom.DT p1) {
moom.Cm forwardValue3013_21_0;
    net.minecraft.item.ItemStack forwardValue3013_79_0;
    net.minecraft.inventory.IInventory forwardValue3013_86_0;
    net.minecraft.item.ItemStack forwardValue3013_114_0;
    int[] spill3013_0;
    moom.Cm spill3013_1;
    net.minecraft.inventory.IInventory spill3013_2;
    net.minecraft.item.ItemStack spill3013_3;
    net.minecraft.item.ItemStack spill3013_4;
    int spill3013_5;
    long life3_3;
    moom.fd life6_10;
    int[] life5_11;
    moom.Cm life7_15;
    int life8_25;
    net.minecraft.item.ItemStack life9_47;
    moom.bs life10_56;
    moom.DT life11_60;
    net.minecraft.inventory.IInventory life12_72;
    net.minecraft.item.ItemStack life13_85;
    net.minecraft.item.ItemStack life13_111;
    forward_join_119: {
    forward_join_115: {
    forward_join_114: {
    forward_join_112: {
    forward_join_86: {
    forward_join_85: {
    forward_join_79: {
    forward_join_35: {
    forward_join_33: {
    forward_join_21: {
    life3_3 = (moom.c3.Y ^ 120275871592302L);
    spill3013_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life6_10 = new moom.fd(p0, p1);
    life5_11 = spill3013_0;
    life7_15 = ((moom.Cm)(((moom.fd)(life6_10)).a__B9()));
    spill3013_1 = life7_15;
    if (!((life5_11 != null))) {
        forwardValue3013_21_0 = spill3013_1;
        break forward_join_21;
    }
    if (!((spill3013_1 != null))) {
        break forward_join_119;
    }
    forwardValue3013_21_0 = life7_15;
    }
    life8_25 = ((moom.Cm)(forwardValue3013_21_0)).h();
    if (!((life5_11 != null))) {
        break forward_join_33;
    }
    if (!((life8_25 < 0))) {
        break forward_join_35;
    }
    ((net.minecraft.world.World)(p0)).b(((int)(((int) moom.c3.gb))), ((moom.DT)(p1)), ((int)(0)));
    }
    if (!((life5_11 == null))) {
        break forward_join_119;
    }
    }
    life9_47 = ((moom.Cm)(life7_15)).a__xW(((int)(life8_25)));
    if (!((life9_47 != null))) {
        break forward_join_119;
    }
    life10_56 = ((moom.bs)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(p1))))).a(((net.minecraft.block.properties.IProperty)(moom.c3.R)))));
    life11_60 = ((moom.DT)(p1)).a(((moom.bs)(life10_56)));
    life12_72 = moom.Cp.a__wo(((net.minecraft.world.World)(p0)), ((double)(((double) ((moom.DT)(life11_60)).a()))), ((double)(((double) ((moom.DT)(life11_60)).b()))), ((double)(((double) ((moom.DT)(life11_60)).c()))));
    spill3013_2 = life12_72;
    if (!((life5_11 != null))) {
        forwardValue3013_86_0 = spill3013_2;
        break forward_join_86;
    }
    if (!((spill3013_2 == null))) {
        break forward_join_85;
    }
    life13_85 = ((moom.rx)(this.V)).a(((moom.ry)(life6_10)), ((net.minecraft.item.ItemStack)(life9_47)));
    spill3013_3 = life13_85;
    if (!((life5_11 != null))) {
        forwardValue3013_79_0 = spill3013_3;
        break forward_join_79;
    }
    if (!((spill3013_3 != null))) {
        break forward_join_115;
    }
    forwardValue3013_79_0 = life13_85;
    }
    if (!((((net.minecraft.item.ItemStack)(forwardValue3013_79_0)).b <= 0))) {
        break forward_join_115;
    }
    life13_85 = null;
    if (!((life5_11 == null))) {
        break forward_join_115;
    }
    }
    forwardValue3013_86_0 = life12_72;
    }
    life13_111 = moom.Cp.a(((net.minecraft.inventory.IInventory)(forwardValue3013_86_0)), ((net.minecraft.item.ItemStack)(((net.minecraft.item.ItemStack)(((net.minecraft.item.ItemStack)(life9_47)).a__xW())).a(((int)(1))))), ((moom.bs)(((moom.bs)(life10_56)).a__bs())));
    spill3013_4 = life13_111;
    if (!((life5_11 != null))) {
        forwardValue3013_114_0 = spill3013_4;
        break forward_join_114;
    }
    if (!((spill3013_4 == null))) {
        break forward_join_112;
    }
    life13_85 = ((net.minecraft.item.ItemStack)(life9_47)).a__xW();
    net.minecraft.item.ItemStack __stackOp3013_25_0 = life13_85;
    net.minecraft.item.ItemStack __stackOp3013_27_0 = __stackOp3013_25_0;
    int __stackOp3013_27_1 = (((net.minecraft.item.ItemStack)(__stackOp3013_25_0)).b - 1);
    spill3013_5 = __stackOp3013_27_1;
    ((net.minecraft.item.ItemStack)(__stackOp3013_27_0)).b = ((int)(__stackOp3013_27_1));
    if (!((spill3013_5 <= 0))) {
        break forward_join_115;
    }
    life13_85 = null;
    break forward_join_115;
    }
    forwardValue3013_114_0 = ((net.minecraft.item.ItemStack)(life9_47)).a__xW();
    }
    life13_85 = forwardValue3013_114_0;
    }
    ((moom.Cm)(life7_15)).a__Void(((int)(life8_25)), ((net.minecraft.item.ItemStack)(life13_85)));
    }
    return;
}


public net.minecraft.tileentity.TileEntity a(net.minecraft.world.World p0, int p1) {
return new moom.Cn();
}


protected moom.rx a(net.minecraft.item.ItemStack p0) {
return this.V;
}

}
