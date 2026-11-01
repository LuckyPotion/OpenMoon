package moom;


public class Bo {

public net.minecraft.world.World a;

public net.minecraft.entity.player.EntityPlayerMP b;

private net.minecraft.world.WorldSettings$GameType c;

private boolean d;

private int e;

private moom.DT f;

private int g;

private boolean h;

private moom.DT i;

private int j;

private int k;

private static final long q;

private static final long s;

public Bo(net.minecraft.world.World p0) {
super();
    this.c = net.minecraft.world.WorldSettings$GameType.NOT_SET;
    this.f = moom.DT.f;
    this.i = moom.DT.f;
    this.k = -1;
    this.a = p0;
}


static {
q = ((long)(((moom._a)(moom._c.a(((long)(-120740228765165739L)), ((long)(9065186146348631721L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(133672972435460L)))));
    long local0_life6 = (moom.Bo.q ^ 58225364071460L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill492_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill492_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill492_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill492_13 = new byte[8];
    (__sourceSpill492_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill492_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation492_15 = __sourceSpill492_13;
    ((javax.crypto.Cipher)(__sourceSpill492_10)).init(((int)(__sourceSpill492_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill492_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation492_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = 3955999883066951215L;
    byte[] __sourceSpill492_19 = new byte[8];
    (__sourceSpill492_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill492_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill492_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill492_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill492_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill492_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill492_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill492_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill492_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill492_20)).doFinal(((byte[])(__sourceSpill492_19)));
    s = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


public void b() {
this.d = ((boolean)(false));
    ((net.minecraft.world.World)(this.a)).c(((int)(((net.minecraft.entity.player.EntityPlayerMP)(this.b)).e__Int())), ((moom.DT)(this.f)), ((int)(-1)));
    return;
}


public boolean b(moom.DT p0) {
moom.Bo forwardValue1530_29_0;
    moom.Bo forwardValue1530_53_0;
    net.minecraft.item.ItemStack forwardValue1530_69_0;
    int forwardValue1530_90_0;
    moom.Bo forwardValue1530_109_0;
    net.minecraft.item.ItemStack forwardValue1530_136_0;
    int forwardValue1530_144_0;
    int forwardValue1530_162_0;
    moom.Bo spill1530_0;
    moom.Bo spill1530_1;
    moom.Bo spill1530_2;
    boolean spill1530_3;
    moom.Bo spill1530_4;
    boolean spill1530_5;
    net.minecraft.item.ItemStack spill1530_6;
    boolean spill1530_7;
    moom.Bo spill1530_8;
    net.minecraft.item.ItemStack spill1530_9;
    int spill1530_10;
    int spill1530_11;
    long life2_3;
    int life4_5;
    net.minecraft.block.state.IBlockState life5_49;
    net.minecraft.tileentity.TileEntity life6_54;
    net.minecraft.item.ItemStack life7_92;
    int life7_131;
    net.minecraft.item.ItemStack life8_161;
    int life9_171;
    forward_join_162: {
    forward_join_161: {
    forward_join_144: {
    forward_join_143: {
    forward_join_136: {
    forward_join_109: {
    forward_join_108: {
    forward_join_90: {
    forward_join_77: {
    forward_join_69: {
    forward_join_68: {
    forward_join_53: {
    forward_join_52: {
    forward_join_29: {
    forward_join_28: {
    life2_3 = (moom.Bo.q ^ 123397767284752L);
    life4_5 = ((net.minecraft.server.management.ServerConfigurationManager.b__Boolean()) ? 1 : 0);
    spill1530_0 = this;
    if (!((life4_5 == 0))) {
        forwardValue1530_29_0 = spill1530_0;
        break forward_join_29;
    }
    if (!(((net.minecraft.world.WorldSettings$GameType)(((moom.Bo)(spill1530_0)).c)).b())) {
        break forward_join_28;
    }
    spill1530_1 = this;
    if (!((life4_5 == 0))) {
        forwardValue1530_29_0 = spill1530_1;
        break forward_join_29;
    }
    if (!((((net.minecraft.entity.player.EntityPlayerMP)(((moom.Bo)(spill1530_1)).b)).a__xW() != null))) {
        break forward_join_28;
    }
    spill1530_2 = this;
    if (!((life4_5 == 0))) {
        forwardValue1530_29_0 = spill1530_2;
        break forward_join_29;
    }
    if (!((((((net.minecraft.item.ItemStack)(((net.minecraft.entity.player.EntityPlayerMP)(((moom.Bo)(spill1530_2)).b)).a__xW())).a__wQ() instanceof moom.xP) ? 1 : 0) != 0))) {
        break forward_join_28;
    }
    return ((0) != 0);
    }
    forwardValue1530_29_0 = this;
    }
    life5_49 = ((net.minecraft.world.World)(((moom.Bo)(forwardValue1530_29_0)).a)).a__fE(((moom.DT)(p0)));
    life6_54 = ((net.minecraft.world.World)(this.a)).a__B9(((moom.DT)(p0)));
    spill1530_3 = ((net.minecraft.world.WorldSettings$GameType)(this.c)).a__Boolean();
    if (!((life4_5 == 0))) {
        forwardValue1530_90_0 = ((spill1530_3) ? 1 : 0);
        break forward_join_90;
    }
    if (!(spill1530_3)) {
        break forward_join_77;
    }
    spill1530_4 = this;
    if (!((life4_5 == 0))) {
        forwardValue1530_53_0 = spill1530_4;
        break forward_join_53;
    }
    if (!((((moom.Bo)(spill1530_4)).c == net.minecraft.world.WorldSettings$GameType.SPECTATOR))) {
        break forward_join_52;
    }
    return ((0) != 0);
    }
    forwardValue1530_53_0 = this;
    }
    spill1530_5 = ((net.minecraft.entity.player.EntityPlayerMP)(((moom.Bo)(forwardValue1530_53_0)).b)).T__Boolean();
    if (!((life4_5 == 0))) {
        forwardValue1530_90_0 = ((spill1530_5) ? 1 : 0);
        break forward_join_90;
    }
    if (!((!spill1530_5))) {
        break forward_join_77;
    }
    life7_92 = ((net.minecraft.entity.player.EntityPlayerMP)(this.b)).c__xW();
    spill1530_6 = life7_92;
    if (!((life4_5 == 0))) {
        forwardValue1530_69_0 = spill1530_6;
        break forward_join_69;
    }
    if (!((spill1530_6 == null))) {
        break forward_join_68;
    }
    return ((0) != 0);
    }
    forwardValue1530_69_0 = life7_92;
    }
    spill1530_7 = ((net.minecraft.item.ItemStack)(forwardValue1530_69_0)).b(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(life5_49)).a__ch())));
    if (!((life4_5 == 0))) {
        forwardValue1530_90_0 = ((spill1530_7) ? 1 : 0);
        break forward_join_90;
    }
    if (!((!spill1530_7))) {
        break forward_join_77;
    }
    return ((0) != 0);
    }
    ((net.minecraft.world.World)(this.a)).a(((net.minecraft.entity.player.EntityPlayer)(this.b)), ((int)(((int) moom.Bo.s))), ((moom.DT)(p0)), ((int)(net.minecraft.block.Block.a(((net.minecraft.block.state.IBlockState)(life5_49))))));
    forwardValue1530_90_0 = ((((moom.Bo)(this)).a__Boolean(((moom.DT)(p0)))) ? 1 : 0);
    }
    life7_131 = forwardValue1530_90_0;
    spill1530_8 = this;
    if (!((life4_5 == 0))) {
        forwardValue1530_109_0 = spill1530_8;
        break forward_join_109;
    }
    if (!(((moom.Bo)(spill1530_8)).b__Boolean())) {
        break forward_join_108;
    }
    ((net.minecraft.network.NetHandlerPlayServer)(((net.minecraft.entity.player.EntityPlayerMP)(this.b)).cg)).a(((moom.yK)(new moom.z5(this.a, p0))));
    if (!((life4_5 != 0))) {
        break forward_join_161;
    }
    }
    forwardValue1530_109_0 = this;
    }
    life8_161 = ((net.minecraft.entity.player.EntityPlayerMP)(((moom.Bo)(forwardValue1530_109_0)).b)).c__xW();
    life9_171 = ((((net.minecraft.entity.player.EntityPlayerMP)(this.b)).a__Boolean(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(life5_49)).a__ch())), ((int)(((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.entity.player.EntityPlayerMP)(this.b)).bD)).c)))) ? 1 : 0);
    spill1530_9 = life8_161;
    if (!((life4_5 == 0))) {
        forwardValue1530_136_0 = spill1530_9;
        break forward_join_136;
    }
    if (!((spill1530_9 != null))) {
        break forward_join_143;
    }
    ((net.minecraft.item.ItemStack)(life8_161)).a(((net.minecraft.world.World)(this.a)), ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(life5_49)).a__ch())), ((moom.DT)(p0)), ((net.minecraft.entity.player.EntityPlayer)(this.b)));
    forwardValue1530_136_0 = life8_161;
    }
    spill1530_10 = ((net.minecraft.item.ItemStack)(forwardValue1530_136_0)).b;
    if (!((life4_5 == 0))) {
        forwardValue1530_144_0 = spill1530_10;
        break forward_join_144;
    }
    if (!((spill1530_10 == 0))) {
        break forward_join_143;
    }
    ((net.minecraft.entity.player.EntityPlayerMP)(this.b)).R();
    }
    forwardValue1530_144_0 = life7_131;
    }
    if (!((life4_5 == 0))) {
        forwardValue1530_162_0 = forwardValue1530_144_0;
        break forward_join_162;
    }
    if (!((forwardValue1530_144_0 != 0))) {
        break forward_join_161;
    }
    spill1530_11 = life9_171;
    if (!((life4_5 == 0))) {
        forwardValue1530_162_0 = spill1530_11;
        break forward_join_162;
    }
    if (!((spill1530_11 != 0))) {
        break forward_join_161;
    }
    ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(life5_49)).a__ch())).a(((net.minecraft.world.World)(this.a)), ((net.minecraft.entity.player.EntityPlayer)(this.b)), ((moom.DT)(p0)), ((net.minecraft.block.state.IBlockState)(life5_49)), ((net.minecraft.tileentity.TileEntity)(life6_54)));
    }
    forwardValue1530_162_0 = life7_131;
    }
    return ((forwardValue1530_162_0) != 0);
}


public void b(net.minecraft.world.WorldSettings$GameType p0) {
moom.Bo forwardValue1531_16_0;
    moom.Bo spill1531_0;
    long life2_3;
    int life4_5;
    forward_join_16: {
    forward_join_15: {
    life2_3 = (moom.Bo.q ^ 33838790585045L);
    life4_5 = ((net.minecraft.server.management.ServerConfigurationManager.b__Boolean()) ? 1 : 0);
    spill1531_0 = this;
    if (!((life4_5 == 0))) {
        forwardValue1531_16_0 = spill1531_0;
        break forward_join_16;
    }
    if (!((((moom.Bo)(spill1531_0)).c == net.minecraft.world.WorldSettings$GameType.NOT_SET))) {
        break forward_join_15;
    }
    this.c = ((net.minecraft.world.WorldSettings$GameType)(p0));
    }
    forwardValue1531_16_0 = this;
    }
    ((moom.Bo)(forwardValue1531_16_0)).a(((net.minecraft.world.WorldSettings$GameType)(this.c)));
    return;
}


public boolean b__Boolean() {
return (__sourceIntrinsic_booleanComparison((((net.minecraft.world.WorldSettings$GameType)(this.c)).b())) != 0);
}


public void a(net.minecraft.world.WorldServer p0) {
this.a = ((net.minecraft.world.World)(p0));
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private boolean a__Boolean(moom.DT p0) {
int forwardValue1528_37_0;
    boolean spill1528_0;
    int spill1528_1;
    long life2_3;
    net.minecraft.block.state.IBlockState life5_9;
    int life6_23;
    int life4_24;
    forward_join_37: {
    forward_join_36: {
    life2_3 = (moom.Bo.q ^ 83203220714422L);
    spill1528_0 = net.minecraft.server.management.ServerConfigurationManager.c__Boolean();
    life5_9 = ((net.minecraft.world.World)(this.a)).a__fE(((moom.DT)(p0)));
    ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(life5_9)).a__ch())).a(((net.minecraft.world.World)(this.a)), ((moom.DT)(p0)), ((net.minecraft.block.state.IBlockState)(life5_9)), ((net.minecraft.entity.player.EntityPlayer)(this.b)));
    life6_23 = ((((net.minecraft.world.World)(this.a)).d__Boolean(((moom.DT)(p0)))) ? 1 : 0);
    life4_24 = ((spill1528_0) ? 1 : 0);
    spill1528_1 = life6_23;
    if (!((life4_24 != 0))) {
        forwardValue1528_37_0 = spill1528_1;
        break forward_join_37;
    }
    if (!((spill1528_1 != 0))) {
        break forward_join_36;
    }
    ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(life5_9)).a__ch())).a__Void(((net.minecraft.world.World)(this.a)), ((moom.DT)(p0)), ((net.minecraft.block.state.IBlockState)(life5_9)));
    }
    forwardValue1528_37_0 = life6_23;
    }
    return ((forwardValue1528_37_0) != 0);
}


public boolean a(net.minecraft.entity.player.EntityPlayer p0, net.minecraft.world.World p1, net.minecraft.item.ItemStack p2) {
net.minecraft.item.ItemStack forwardValue1526_33_0;
    int forwardValue1526_59_0;
    int forwardValue1526_75_0;
    int forwardValue1526_88_0;
    int forwardValue1526_97_0;
    int forwardValue1526_99_0;
    net.minecraft.item.ItemStack spill1526_0;
    int spill1526_1;
    int spill1526_2;
    int spill1526_3;
    boolean spill1526_4;
    long life4_3;
    int life6_5;
    int life7_16;
    int life8_19;
    net.minecraft.item.ItemStack life9_24;
    forward_join_99: {
    forward_join_98: {
    forward_join_97: {
    forward_join_96: {
    forward_join_88: {
    forward_join_86: {
    forward_join_75: {
    forward_join_73: {
    forward_join_59: {
    forward_join_57: {
    forward_join_49: {
    forward_join_33: {
    forward_join_12: {
    life4_3 = (moom.Bo.q ^ 8792194890221L);
    life6_5 = ((net.minecraft.server.management.ServerConfigurationManager.b__Boolean()) ? 1 : 0);
    if (!((this.c == net.minecraft.world.WorldSettings$GameType.SPECTATOR))) {
        break forward_join_12;
    }
    return ((0) != 0);
    }
    life7_16 = ((net.minecraft.item.ItemStack)(p2)).b;
    life8_19 = ((net.minecraft.item.ItemStack)(p2)).c();
    life9_24 = ((net.minecraft.item.ItemStack)(p2)).a(((net.minecraft.world.World)(p1)), ((net.minecraft.entity.player.EntityPlayer)(p0)));
    if (!((life6_5 == 0))) {
        break forward_join_57;
    }
    if (!((life9_24 == p2))) {
        break forward_join_49;
    }
    spill1526_0 = life9_24;
    if (!((life6_5 == 0))) {
        forwardValue1526_33_0 = spill1526_0;
        break forward_join_33;
    }
    if (!((spill1526_0 != null))) {
        break forward_join_98;
    }
    forwardValue1526_33_0 = life9_24;
    }
    spill1526_1 = ((net.minecraft.item.ItemStack)(forwardValue1526_33_0)).b;
    if (!((life6_5 == 0))) {
        forwardValue1526_59_0 = spill1526_1;
        break forward_join_59;
    }
    if (!((spill1526_1 == life7_16))) {
        break forward_join_49;
    }
    spill1526_2 = ((net.minecraft.item.ItemStack)(life9_24)).e();
    if (!((life6_5 == 0))) {
        forwardValue1526_59_0 = spill1526_2;
        break forward_join_59;
    }
    if (!((spill1526_2 <= 0))) {
        break forward_join_49;
    }
    spill1526_3 = ((net.minecraft.item.ItemStack)(life9_24)).c();
    if (!((life6_5 == 0))) {
        forwardValue1526_99_0 = spill1526_3;
        break forward_join_99;
    }
    if (!((spill1526_3 != life8_19))) {
        break forward_join_98;
    }
    }
    (((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.entity.player.EntityPlayer)(p0)).bD)).a)[((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.entity.player.EntityPlayer)(p0)).bD)).c] = life9_24;
    }
    forwardValue1526_59_0 = ((((moom.Bo)(this)).b__Boolean()) ? 1 : 0);
    }
    if (!((life6_5 == 0))) {
        forwardValue1526_75_0 = forwardValue1526_59_0;
        break forward_join_75;
    }
    if (!((forwardValue1526_59_0 != 0))) {
        break forward_join_73;
    }
    ((net.minecraft.item.ItemStack)(life9_24)).b = ((int)(life7_16));
    spill1526_4 = ((net.minecraft.item.ItemStack)(life9_24)).b__Boolean();
    if (!((life6_5 == 0))) {
        forwardValue1526_75_0 = ((spill1526_4) ? 1 : 0);
        break forward_join_75;
    }
    if (!(spill1526_4)) {
        break forward_join_73;
    }
    ((net.minecraft.item.ItemStack)(life9_24)).a__Void(((int)(life8_19)));
    }
    forwardValue1526_75_0 = ((net.minecraft.item.ItemStack)(life9_24)).b;
    }
    if (!((life6_5 == 0))) {
        forwardValue1526_88_0 = forwardValue1526_75_0;
        break forward_join_88;
    }
    if (!((forwardValue1526_75_0 == 0))) {
        break forward_join_86;
    }
    (((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.entity.player.EntityPlayer)(p0)).bD)).a)[((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.entity.player.EntityPlayer)(p0)).bD)).c] = null;
    }
    forwardValue1526_88_0 = ((((net.minecraft.entity.player.EntityPlayer)(p0)).M()) ? 1 : 0);
    }
    if (!((life6_5 == 0))) {
        forwardValue1526_97_0 = forwardValue1526_88_0;
        break forward_join_97;
    }
    if (!((forwardValue1526_88_0 == 0))) {
        break forward_join_96;
    }
    ((net.minecraft.entity.player.EntityPlayerMP)(((net.minecraft.entity.player.EntityPlayerMP)(p0)))).a(((moom.v8)(((net.minecraft.entity.player.EntityPlayer)(p0)).bF)));
    }
    forwardValue1526_97_0 = 1;
    }
    return ((forwardValue1526_97_0) != 0);
    }
    forwardValue1526_99_0 = 0;
    }
    return ((forwardValue1526_99_0) != 0);
}


public boolean a(net.minecraft.entity.player.EntityPlayer p0, net.minecraft.world.World p1, net.minecraft.item.ItemStack p2, moom.DT p3, moom.bs p4, float p5, float p6, float p7) {
net.minecraft.block.Block forwardValue1527_38_0;
    net.minecraft.world.ILockableContainer forwardValue1527_44_0;
    int forwardValue1527_54_0;
    int forwardValue1527_64_0;
    net.minecraft.entity.player.EntityPlayer forwardValue1527_71_0;
    int forwardValue1527_94_0;
    net.minecraft.item.ItemStack forwardValue1527_96_0;
    int forwardValue1527_137_0;
    int spill1527_0;
    net.minecraft.world.ILockableContainer spill1527_1;
    net.minecraft.block.Block spill1527_2;
    net.minecraft.entity.player.EntityPlayer spill1527_3;
    net.minecraft.item.ItemStack spill1527_4;
    boolean spill1527_5;
    boolean spill1527_6;
    long life9_3;
    int life11_5;
    net.minecraft.tileentity.TileEntity life12_13;
    net.minecraft.world.ILockableContainer life13_24;
    net.minecraft.block.Block life14_29;
    net.minecraft.block.state.IBlockState life12_112;
    int life12_148;
    int life13_151;
    int life14_161;
    forward_join_137: {
    forward_join_128: {
    forward_join_99: {
    forward_join_96: {
    forward_join_95: {
    forward_join_94: {
    forward_join_75: {
    forward_join_71: {
    forward_join_65: {
    forward_join_64: {
    forward_join_63: {
    forward_join_54: {
    forward_join_52: {
    forward_join_50: {
    forward_join_44: {
    forward_join_43: {
    forward_join_38: {
    life9_3 = (moom.Bo.q ^ 12024409128834L);
    life11_5 = ((net.minecraft.server.management.ServerConfigurationManager.c__Boolean()) ? 1 : 0);
    if (!((this.c == net.minecraft.world.WorldSettings$GameType.SPECTATOR))) {
        break forward_join_65;
    }
    life12_13 = ((net.minecraft.world.World)(p1)).a__B9(((moom.DT)(p3)));
    spill1527_0 = ((life12_13 instanceof net.minecraft.world.ILockableContainer) ? 1 : 0);
    if (!((life11_5 != 0))) {
        forwardValue1527_54_0 = spill1527_0;
        break forward_join_54;
    }
    if (!((spill1527_0 != 0))) {
        break forward_join_52;
    }
    life13_24 = ((net.minecraft.world.ILockableContainer)(life12_13));
    life14_29 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p1)).a__fE(((moom.DT)(p3))))).a__ch();
    spill1527_1 = life13_24;
    if (!((life11_5 != 0))) {
        forwardValue1527_44_0 = spill1527_1;
        break forward_join_44;
    }
    if (!((((spill1527_1 instanceof net.minecraft.tileentity.TileEntityChest) ? 1 : 0) != 0))) {
        break forward_join_43;
    }
    spill1527_2 = life14_29;
    if (!((life11_5 != 0))) {
        forwardValue1527_38_0 = spill1527_2;
        break forward_join_38;
    }
    if (!((((spill1527_2 instanceof moom.cZ) ? 1 : 0) != 0))) {
        break forward_join_43;
    }
    forwardValue1527_38_0 = life14_29;
    }
    life13_24 = ((moom.cZ)(((moom.cZ)(forwardValue1527_38_0)))).a__sourceReturn_5599c2b7a2(((net.minecraft.world.World)(p1)), ((moom.DT)(p3)));
    }
    forwardValue1527_44_0 = life13_24;
    }
    if (!((forwardValue1527_44_0 != null))) {
        break forward_join_50;
    }
    ((net.minecraft.entity.player.EntityPlayer)(p0)).a(((net.minecraft.inventory.IInventory)(life13_24)));
    return ((1) != 0);
    }
    if (!((life11_5 == 0))) {
        break forward_join_63;
    }
    }
    forwardValue1527_54_0 = ((life12_13 instanceof net.minecraft.inventory.IInventory) ? 1 : 0);
    }
    if (!((life11_5 != 0))) {
        forwardValue1527_64_0 = forwardValue1527_54_0;
        break forward_join_64;
    }
    if (!((forwardValue1527_54_0 != 0))) {
        break forward_join_63;
    }
    ((net.minecraft.entity.player.EntityPlayer)(p0)).a(((net.minecraft.inventory.IInventory)(((net.minecraft.inventory.IInventory)(life12_13)))));
    return ((1) != 0);
    }
    forwardValue1527_64_0 = 0;
    }
    return ((forwardValue1527_64_0) != 0);
    }
    spill1527_3 = p0;
    if (!((life11_5 != 0))) {
        forwardValue1527_71_0 = spill1527_3;
        break forward_join_71;
    }
    if (!(((net.minecraft.entity.player.EntityPlayer)(spill1527_3)).t__Boolean())) {
        break forward_join_75;
    }
    forwardValue1527_71_0 = p0;
    }
    spill1527_4 = ((net.minecraft.entity.player.EntityPlayer)(forwardValue1527_71_0)).a__xW();
    if (!((life11_5 != 0))) {
        forwardValue1527_96_0 = spill1527_4;
        break forward_join_96;
    }
    if (!((spill1527_4 == null))) {
        break forward_join_95;
    }
    }
    life12_112 = ((net.minecraft.world.World)(p1)).a__fE(((moom.DT)(p3)));
    spill1527_5 = ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(life12_112)).a__ch())).a(((net.minecraft.world.World)(p1)), ((moom.DT)(p3)), ((net.minecraft.block.state.IBlockState)(life12_112)), ((net.minecraft.entity.player.EntityPlayer)(p0)), ((moom.bs)(p4)), ((float)(p5)), ((float)(p6)), ((float)(p7)));
    if (!((life11_5 != 0))) {
        forwardValue1527_94_0 = ((spill1527_5) ? 1 : 0);
        break forward_join_94;
    }
    if (!(spill1527_5)) {
        break forward_join_95;
    }
    forwardValue1527_94_0 = 1;
    }
    return ((forwardValue1527_94_0) != 0);
    }
    forwardValue1527_96_0 = p2;
    }
    if (!((forwardValue1527_96_0 == null))) {
        break forward_join_99;
    }
    return ((0) != 0);
    }
    spill1527_6 = ((moom.Bo)(this)).b__Boolean();
    if (!((life11_5 != 0))) {
        forwardValue1527_137_0 = ((spill1527_6) ? 1 : 0);
        break forward_join_137;
    }
    if (!(spill1527_6)) {
        break forward_join_128;
    }
    life12_148 = ((net.minecraft.item.ItemStack)(p2)).c();
    life13_151 = ((net.minecraft.item.ItemStack)(p2)).b;
    life14_161 = ((((net.minecraft.item.ItemStack)(p2)).a(((net.minecraft.entity.player.EntityPlayer)(p0)), ((net.minecraft.world.World)(p1)), ((moom.DT)(p3)), ((moom.bs)(p4)), ((float)(p5)), ((float)(p6)), ((float)(p7)))) ? 1 : 0);
    ((net.minecraft.item.ItemStack)(p2)).a__Void(((int)(life12_148)));
    ((net.minecraft.item.ItemStack)(p2)).b = ((int)(life13_151));
    return ((life14_161) != 0);
    }
    forwardValue1527_137_0 = ((((net.minecraft.item.ItemStack)(p2)).a(((net.minecraft.entity.player.EntityPlayer)(p0)), ((net.minecraft.world.World)(p1)), ((moom.DT)(p3)), ((moom.bs)(p4)), ((float)(p5)), ((float)(p6)), ((float)(p7)))) ? 1 : 0);
    }
    return ((forwardValue1527_137_0) != 0);
}


public void a(net.minecraft.world.WorldSettings$GameType p0) {
this.c = ((net.minecraft.world.WorldSettings$GameType)(p0));
    ((net.minecraft.world.WorldSettings$GameType)(p0)).a(((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.entity.player.EntityPlayerMP)(this.b)).b1)));
    ((net.minecraft.entity.player.EntityPlayerMP)(this.b)).T();
    ((net.minecraft.server.management.ServerConfigurationManager)(((moom.Bl)(((net.minecraft.entity.player.EntityPlayerMP)(this.b)).ch)).a__BA())).a(((moom.yK)(new moom.Ap(net.minecraft.network.play.server.S38PacketPlayerListItem$Action.UPDATE_GAME_MODE, new net.minecraft.entity.player.EntityPlayerMP[] {this.b}))));
    return;
}


public net.minecraft.world.WorldSettings$GameType a() {
return this.c;
}


public boolean a__Boolean() {
return (__sourceIntrinsic_booleanComparison((((net.minecraft.world.WorldSettings$GameType)(this.c)).c())) != 0);
}


public void a__Void() {
net.minecraft.block.Block forwardValue1529_42_0;
    int forwardValue1529_82_0;
    int forwardValue1529_92_0;
    int forwardValue1529_99_0;
    moom.Bo forwardValue1529_101_0;
    boolean spill1529_0;
    boolean spill1529_1;
    net.minecraft.block.Block spill1529_2;
    int spill1529_3;
    moom.Bo spill1529_4;
    long life1_3;
    int life3_11;
    int life4_25;
    net.minecraft.block.Block life5_32;
    float life6_67;
    int life7_72;
    net.minecraft.block.Block life4_136;
    int life5_171;
    float life6_186;
    int life7_191;
    forward_join_174: {
    forward_join_171: {
    forward_join_130: {
    forward_join_128: {
    forward_join_101: {
    forward_join_99: {
    forward_join_95: {
    forward_join_93: {
    forward_join_92: {
    forward_join_82: {
    forward_join_79: {
    forward_join_42: {
    forward_join_41: {
    life1_3 = (moom.Bo.q ^ 56910454297728L);
    spill1529_0 = net.minecraft.server.management.ServerConfigurationManager.b__Boolean();
    moom.Bo __stackOp1529_2_0 = this;
    ((moom.Bo)(__stackOp1529_2_0)).g = ((int)((((moom.Bo)(__stackOp1529_2_0)).g + 1)));
    life3_11 = ((spill1529_0) ? 1 : 0);
    spill1529_1 = this.h;
    if (!((life3_11 == 0))) {
        forwardValue1529_99_0 = ((spill1529_1) ? 1 : 0);
        break forward_join_99;
    }
    if (!(spill1529_1)) {
        break forward_join_95;
    }
    life4_25 = (this.g - this.j);
    life5_32 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(this.a)).a__fE(((moom.DT)(this.i))))).a__ch();
    spill1529_2 = life5_32;
    if (!((life3_11 == 0))) {
        forwardValue1529_42_0 = spill1529_2;
        break forward_join_42;
    }
    if (!((((net.minecraft.block.Block)(spill1529_2)).a__fn() == moom.fn.a))) {
        break forward_join_41;
    }
    this.h = ((boolean)(false));
    if (!((life3_11 != 0))) {
        break forward_join_93;
    }
    }
    forwardValue1529_42_0 = life5_32;
    }
    life6_67 = (((net.minecraft.block.Block)(forwardValue1529_42_0)).a(((net.minecraft.entity.player.EntityPlayer)(this.b)), ((net.minecraft.world.World)(((net.minecraft.entity.player.EntityPlayerMP)(this.b)).i)), ((moom.DT)(this.i))) * ((float) (life4_25 + 1)));
    life7_72 = ((int) (life6_67 * 0x1.4p3f));
    spill1529_3 = life7_72;
    if (!((life3_11 == 0))) {
        forwardValue1529_82_0 = spill1529_3;
        break forward_join_82;
    }
    if (!((spill1529_3 != this.k))) {
        break forward_join_79;
    }
    ((net.minecraft.world.World)(this.a)).c(((int)(((net.minecraft.entity.player.EntityPlayerMP)(this.b)).e__Int())), ((moom.DT)(this.i)), ((int)(life7_72)));
    this.k = ((int)(life7_72));
    }
    forwardValue1529_82_0 = recovery.source.CarrierOps.fcmpl(((float)(life6_67)), ((float)(0x1.0p0f)));
    }
    if (!((life3_11 == 0))) {
        forwardValue1529_92_0 = forwardValue1529_82_0;
        break forward_join_92;
    }
    if (!((forwardValue1529_82_0 >= 0))) {
        break forward_join_93;
    }
    this.h = ((boolean)(false));
    forwardValue1529_92_0 = ((this.b(((moom.DT)(this.i)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue1529_92_0);
    }
    if (!((life3_11 != 0))) {
        break forward_join_174;
    }
    }
    spill1529_4 = this;
    if (!((life3_11 == 0))) {
        forwardValue1529_101_0 = spill1529_4;
        break forward_join_101;
    }
    forwardValue1529_99_0 = ((((moom.Bo)(spill1529_4)).d) ? 1 : 0);
    }
    if (!((forwardValue1529_99_0 != 0))) {
        break forward_join_174;
    }
    forwardValue1529_101_0 = this;
    }
    life4_136 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(((moom.Bo)(forwardValue1529_101_0)).a)).a__fE(((moom.DT)(this.f))))).a__ch();
    if (!((life3_11 == 0))) {
        break forward_join_128;
    }
    if (!((((net.minecraft.block.Block)(life4_136)).a__fn() == moom.fn.a))) {
        break forward_join_130;
    }
    ((net.minecraft.world.World)(this.a)).c(((int)(((net.minecraft.entity.player.EntityPlayerMP)(this.b)).e__Int())), ((moom.DT)(this.f)), ((int)(-1)));
    this.k = ((int)(-1));
    this.d = ((boolean)(false));
    }
    if (!((life3_11 != 0))) {
        break forward_join_174;
    }
    }
    life5_171 = (this.g - this.e);
    life6_186 = (((net.minecraft.block.Block)(life4_136)).a(((net.minecraft.entity.player.EntityPlayer)(this.b)), ((net.minecraft.world.World)(((net.minecraft.entity.player.EntityPlayerMP)(this.b)).i)), ((moom.DT)(this.i))) * ((float) (life5_171 + 1)));
    life7_191 = ((int) (life6_186 * 0x1.4p3f));
    if (!((life3_11 == 0))) {
        break forward_join_171;
    }
    if (!((life7_191 != this.k))) {
        break forward_join_174;
    }
    ((net.minecraft.world.World)(this.a)).c(((int)(((net.minecraft.entity.player.EntityPlayerMP)(this.b)).e__Int())), ((moom.DT)(this.f)), ((int)(life7_191)));
    }
    this.k = ((int)(life7_191));
    }
    return;
}


public void a(moom.DT p0, moom.bs p1) {
int forwardValue1525_23_0;
    moom.Bo forwardValue1525_27_0;
    moom.Bo forwardValue1525_46_0;
    net.minecraft.item.ItemStack forwardValue1525_61_0;
    int forwardValue1525_73_0;
    moom.fn forwardValue1525_105_0;
    moom.fn forwardValue1525_105_1;
    int forwardValue1525_128_0;
    moom.Bo spill1525_0;
    boolean spill1525_1;
    boolean spill1525_2;
    moom.Bo spill1525_3;
    boolean spill1525_4;
    net.minecraft.item.ItemStack spill1525_5;
    boolean spill1525_6;
    moom.fn spill1525_7;
    moom.fn spill1525_8;
    int spill1525_9;
    long life3_3;
    int life5_5;
    net.minecraft.block.Block life6_46;
    net.minecraft.item.ItemStack life7_83;
    float life7_114;
    int life8_178;
    forward_join_140: {
    forward_join_128: {
    forward_join_118: {
    forward_join_105: {
    forward_join_102: {
    forward_join_73: {
    forward_join_67: {
    forward_join_61: {
    forward_join_60: {
    forward_join_46: {
    forward_join_45: {
    forward_join_27: {
    forward_join_26: {
    forward_join_23: {
    life3_3 = (moom.Bo.q ^ 57312332058647L);
    life5_5 = ((net.minecraft.server.management.ServerConfigurationManager.b__Boolean()) ? 1 : 0);
    spill1525_0 = this;
    if (!((life5_5 == 0))) {
        forwardValue1525_27_0 = spill1525_0;
        break forward_join_27;
    }
    if (!(((moom.Bo)(spill1525_0)).b__Boolean())) {
        break forward_join_26;
    }
    spill1525_1 = ((net.minecraft.world.World)(this.a)).a(((net.minecraft.entity.player.EntityPlayer)(null)), ((moom.DT)(p0)), ((moom.bs)(p1)));
    if (!((life5_5 == 0))) {
        forwardValue1525_23_0 = ((spill1525_1) ? 1 : 0);
        break forward_join_23;
    }
    if (!((!spill1525_1))) {
        break forward_join_140;
    }
    forwardValue1525_23_0 = ((this.b(((moom.DT)(p0)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue1525_23_0);
    if (!((life5_5 != 0))) {
        break forward_join_140;
    }
    }
    forwardValue1525_27_0 = this;
    }
    life6_46 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(((moom.Bo)(forwardValue1525_27_0)).a)).a__fE(((moom.DT)(p0))))).a__ch();
    spill1525_2 = ((net.minecraft.world.WorldSettings$GameType)(this.c)).a__Boolean();
    if (!((life5_5 == 0))) {
        forwardValue1525_73_0 = ((spill1525_2) ? 1 : 0);
        break forward_join_73;
    }
    if (!(spill1525_2)) {
        break forward_join_67;
    }
    spill1525_3 = this;
    if (!((life5_5 == 0))) {
        forwardValue1525_46_0 = spill1525_3;
        break forward_join_46;
    }
    if (!((((moom.Bo)(spill1525_3)).c == net.minecraft.world.WorldSettings$GameType.SPECTATOR))) {
        break forward_join_45;
    }
    return;
    }
    forwardValue1525_46_0 = this;
    }
    spill1525_4 = ((net.minecraft.entity.player.EntityPlayerMP)(((moom.Bo)(forwardValue1525_46_0)).b)).T__Boolean();
    if (!((life5_5 == 0))) {
        forwardValue1525_73_0 = ((spill1525_4) ? 1 : 0);
        break forward_join_73;
    }
    if (!((!spill1525_4))) {
        break forward_join_67;
    }
    life7_83 = ((net.minecraft.entity.player.EntityPlayerMP)(this.b)).c__xW();
    spill1525_5 = life7_83;
    if (!((life5_5 == 0))) {
        forwardValue1525_61_0 = spill1525_5;
        break forward_join_61;
    }
    if (!((spill1525_5 == null))) {
        break forward_join_60;
    }
    return;
    }
    forwardValue1525_61_0 = life7_83;
    }
    spill1525_6 = ((net.minecraft.item.ItemStack)(forwardValue1525_61_0)).b(((net.minecraft.block.Block)(life6_46)));
    if (!((life5_5 == 0))) {
        forwardValue1525_73_0 = ((spill1525_6) ? 1 : 0);
        break forward_join_73;
    }
    if (!((!spill1525_6))) {
        break forward_join_67;
    }
    return;
    }
    forwardValue1525_73_0 = ((((net.minecraft.world.World)(this.a)).a(((net.minecraft.entity.player.EntityPlayer)(null)), ((moom.DT)(p0)), ((moom.bs)(p1)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue1525_73_0);
    this.e = ((int)(this.g));
    life7_114 = 0x1.0p0f;
    spill1525_7 = ((net.minecraft.block.Block)(life6_46)).a__fn();
    spill1525_8 = moom.fn.a;
    if (!((life5_5 == 0))) {
        forwardValue1525_105_0 = spill1525_7;
        forwardValue1525_105_1 = spill1525_8;
        break forward_join_105;
    }
    if (!((spill1525_7 != spill1525_8))) {
        break forward_join_102;
    }
    ((net.minecraft.block.Block)(life6_46)).a(((net.minecraft.world.World)(this.a)), ((moom.DT)(p0)), ((net.minecraft.entity.player.EntityPlayer)(this.b)));
    life7_114 = ((net.minecraft.block.Block)(life6_46)).a(((net.minecraft.entity.player.EntityPlayer)(this.b)), ((net.minecraft.world.World)(((net.minecraft.entity.player.EntityPlayerMP)(this.b)).i)), ((moom.DT)(p0)));
    }
    forwardValue1525_105_0 = ((net.minecraft.block.Block)(life6_46)).a__fn();
    forwardValue1525_105_1 = moom.fn.a;
    }
    if (!((forwardValue1525_105_0 != forwardValue1525_105_1))) {
        break forward_join_118;
    }
    spill1525_9 = recovery.source.CarrierOps.fcmpl(((float)(life7_114)), ((float)(0x1.0p0f)));
    if (!((life5_5 == 0))) {
        forwardValue1525_128_0 = spill1525_9;
        break forward_join_128;
    }
    if (!((spill1525_9 >= 0))) {
        break forward_join_118;
    }
    this.b(((moom.DT)(p0)));
    if (!((life5_5 != 0))) {
        break forward_join_140;
    }
    }
    this.d = ((boolean)(true));
    this.f = ((moom.DT)(p0));
    forwardValue1525_128_0 = ((int) (life7_114 * 0x1.4p3f));
    }
    life8_178 = forwardValue1525_128_0;
    ((net.minecraft.world.World)(this.a)).c(((int)(((net.minecraft.entity.player.EntityPlayerMP)(this.b)).e__Int())), ((moom.DT)(p0)), ((int)(life8_178)));
    this.k = ((int)(life8_178));
    }
    return;
}


public void a(moom.DT p0) {
int forwardValue1524_18_0;
    net.minecraft.block.Block forwardValue1524_32_0;
    int forwardValue1524_72_0;
    moom.Bo forwardValue1524_83_0;
    boolean spill1524_0;
    net.minecraft.block.Block spill1524_1;
    int spill1524_2;
    moom.Bo spill1524_3;
    long life2_3;
    int life4_5;
    int life5_24;
    net.minecraft.block.Block life6_30;
    float life7_56;
    forward_join_86: {
    forward_join_83: {
    forward_join_72: {
    forward_join_68: {
    forward_join_32: {
    forward_join_18: {
    life2_3 = (moom.Bo.q ^ 21615289454575L);
    life4_5 = ((net.minecraft.server.management.ServerConfigurationManager.b__Boolean()) ? 1 : 0);
    spill1524_0 = ((moom.DT)(p0)).equals(((java.lang.Object)(this.f)));
    if (!((life4_5 == 0))) {
        forwardValue1524_18_0 = ((spill1524_0) ? 1 : 0);
        break forward_join_18;
    }
    if (!(spill1524_0)) {
        break forward_join_86;
    }
    forwardValue1524_18_0 = (this.g - this.e);
    }
    life5_24 = forwardValue1524_18_0;
    life6_30 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(this.a)).a__fE(((moom.DT)(p0))))).a__ch();
    spill1524_1 = life6_30;
    if (!((life4_5 == 0))) {
        forwardValue1524_32_0 = spill1524_1;
        break forward_join_32;
    }
    if (!((((net.minecraft.block.Block)(spill1524_1)).a__fn() != moom.fn.a))) {
        break forward_join_86;
    }
    forwardValue1524_32_0 = life6_30;
    }
    life7_56 = (((net.minecraft.block.Block)(forwardValue1524_32_0)).a(((net.minecraft.entity.player.EntityPlayer)(this.b)), ((net.minecraft.world.World)(((net.minecraft.entity.player.EntityPlayerMP)(this.b)).i)), ((moom.DT)(p0))) * ((float) (life5_24 + 1)));
    spill1524_2 = recovery.source.CarrierOps.fcmpl(((float)(life7_56)), ((float)(0x1.666666p-1f)));
    if (!((life4_5 == 0))) {
        forwardValue1524_72_0 = spill1524_2;
        break forward_join_72;
    }
    if (!((spill1524_2 >= 0))) {
        break forward_join_68;
    }
    this.d = ((boolean)(false));
    ((net.minecraft.world.World)(this.a)).c(((int)(((net.minecraft.entity.player.EntityPlayerMP)(this.b)).e__Int())), ((moom.DT)(p0)), ((int)(-1)));
    this.b(((moom.DT)(p0)));
    if (!((life4_5 != 0))) {
        break forward_join_86;
    }
    }
    spill1524_3 = this;
    if (!((life4_5 == 0))) {
        forwardValue1524_83_0 = spill1524_3;
        break forward_join_83;
    }
    forwardValue1524_72_0 = ((((moom.Bo)(spill1524_3)).h) ? 1 : 0);
    }
    if (!((forwardValue1524_72_0 == 0))) {
        break forward_join_86;
    }
    this.d = ((boolean)(false));
    this.h = ((boolean)(true));
    this.i = ((moom.DT)(p0));
    forwardValue1524_83_0 = this;
    }
    ((moom.Bo)(forwardValue1524_83_0)).j = ((int)(this.e));
    }
    return;
}


private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
