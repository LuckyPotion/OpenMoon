package moom;


public class xC extends net.minecraft.item.Item {

private static final long n;

private static final long o;

public xC() {
super();
    (this).a(true);
    (this).a(net.minecraft.creativetab.CreativeTabs.f);
}


static {
n = ((long)(((moom._a)(moom._c.a(((long)(-370060961758325029L)), ((long)(-4794555350882163863L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(217319941133990L)))));
    long local0_life6 = (moom.xC.n ^ 34597818407782L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill1099_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1099_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1099_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1099_13 = new byte[8];
    (__sourceSpill1099_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill1099_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation1099_15 = __sourceSpill1099_13;
    ((javax.crypto.Cipher)(__sourceSpill1099_10)).init(((int)(__sourceSpill1099_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1099_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1099_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = 1184897133018573894L;
    byte[] __sourceSpill1099_19 = new byte[8];
    (__sourceSpill1099_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill1099_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill1099_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill1099_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill1099_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill1099_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill1099_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill1099_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill1099_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill1099_20)).doFinal(((byte[])(__sourceSpill1099_19)));
    o = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


public java.lang.String d(net.minecraft.item.ItemStack p0) {
java.lang.String forwardValue4484_28_0;
    boolean spill4484_0;
    java.lang.String spill4484_1;
    long life2_3;
    java.lang.String life5_10;
    java.lang.String life6_15;
    int life4_16;
    forward_join_28: {
    forward_join_27: {
    life2_3 = (moom.xC.n ^ 34388634870512L);
    life5_10 = ((java.lang.String)(__sourceIntrinsic_480a975002ff_invokedynamic4484_4(net.minecraft.util.StatCollector.a(((java.lang.String)(__sourceIntrinsic_480a975002ff_invokedynamic4484_2(((moom.xC)(this)).a__String()))))))).trim();
    spill4484_0 = net.minecraft.item.ItemStack.m();
    life6_15 = net.minecraft.entity.EntityList.a__String(((int)(((net.minecraft.item.ItemStack)(p0)).c())));
    life4_16 = ((spill4484_0) ? 1 : 0);
    spill4484_1 = life6_15;
    if (!((life4_16 != 0))) {
        forwardValue4484_28_0 = spill4484_1;
        break forward_join_28;
    }
    if (!((spill4484_1 != null))) {
        break forward_join_27;
    }
    life5_10 = __sourceIntrinsic_480a975002ff_invokedynamic4484_12(life5_10, net.minecraft.util.StatCollector.a(((java.lang.String)(__sourceIntrinsic_480a975002ff_invokedynamic4484_10(life6_15)))));
    }
    forwardValue4484_28_0 = life5_10;
    }
    return forwardValue4484_28_0;
}


public static net.minecraft.entity.Entity a(net.minecraft.world.World p0, int p1, double p2, double p3, double p4) {
net.minecraft.entity.Entity lexicalValue1408_74_0;
    net.minecraft.entity.Entity spill1408_0;
    long life8_3;
    int life10_5;
    net.minecraft.entity.Entity life11_16;
    int life12_18;
    net.minecraft.entity.EntityLiving life13_41;
    lexical_join_74: {
    lexical_join_73: {
    lexical_join_13: {
    life8_3 = (moom.xC.n ^ 53997512961833L);
    life10_5 = ((net.minecraft.item.ItemStack.l()) ? 1 : 0);
    if (!((!((java.util.Map)(net.minecraft.entity.EntityList.g)).containsKey(((java.lang.Object)(java.lang.Integer.valueOf(((int)(p1))))))))) {
        break lexical_join_13;
    }
    return null;
    }
    life11_16 = null;
    life12_18 = 0;
    lexical_cycle_17: while (true) {
    lexical_join_71: {
    lexical_join_70: {
    if (!((life12_18 < 1))) {
        break lexical_join_73;
    }
    life11_16 = net.minecraft.entity.EntityList.a(((int)(p1)), ((net.minecraft.world.World)(p0)));
    if (!((life10_5 == 0))) {
        break lexical_join_71;
    }
    spill1408_0 = life11_16;
    if (!((life10_5 == 0))) {
        lexicalValue1408_74_0 = spill1408_0;
        break lexical_join_74;
    }
    if (!((((spill1408_0 instanceof net.minecraft.entity.EntityLivingBase) ? 1 : 0) != 0))) {
        break lexical_join_70;
    }
    life13_41 = ((net.minecraft.entity.EntityLiving)(life11_16));
    ((net.minecraft.entity.Entity)(life11_16)).c(((double)(p2)), ((double)(p3)), ((double)(p4)), ((float)(moom.Dr.e(((float)((((java.util.Random)(((net.minecraft.world.World)(p0)).u)).nextFloat() * 0x1.68p8f)))))), ((float)(0x0.0p0f)));
    ((net.minecraft.entity.EntityLiving)(life13_41)).a4 = ((float)(((net.minecraft.entity.EntityLiving)(life13_41)).w));
    ((net.minecraft.entity.EntityLiving)(life13_41)).a2 = ((float)(((net.minecraft.entity.EntityLiving)(life13_41)).w));
    ((net.minecraft.entity.EntityLiving)(life13_41)).a(((moom.Eh)(((net.minecraft.world.World)(p0)).a__Eh(((moom.DT)(new moom.DT(life13_41)))))), ((net.minecraft.entity.IEntityLivingData)(null)));
    ((net.minecraft.world.World)(p0)).b__Boolean(((net.minecraft.entity.Entity)(life11_16)));
    ((net.minecraft.entity.EntityLiving)(life13_41)).O();
    }
    life12_18 += 1;
    }
    if (!((life10_5 != 0))) { continue lexical_cycle_17; }
    break lexical_cycle_17;
    }
    }
    lexicalValue1408_74_0 = life11_16;
    }
    return lexicalValue1408_74_0;
}


public void a(net.minecraft.item.Item p0, net.minecraft.creativetab.CreativeTabs p1, java.util.List<net.minecraft.item.ItemStack> p2) {
boolean spill1407_0;
    long life4_3;
    java.util.Iterator life7_8;
    int life6_9;
    net.minecraft.entity.EntityList$EntityEggInfo life8_16;
    lexical_join_29: {
    life4_3 = (moom.xC.n ^ 69571994515894L);
    spill1407_0 = net.minecraft.item.ItemStack.m();
    life7_8 = ((java.util.Collection)(((java.util.Map)(net.minecraft.entity.EntityList.g)).values())).iterator();
    life6_9 = ((spill1407_0) ? 1 : 0);
    lexical_cycle_10: while (true) {
    if (!(((java.util.Iterator)(life7_8)).hasNext())) {
        break lexical_join_29;
    }
    life8_16 = ((net.minecraft.entity.EntityList$EntityEggInfo)(((java.util.Iterator)(life7_8)).next()));
    ((java.util.List)(p2)).add(((java.lang.Object)(new net.minecraft.item.ItemStack(p0, 1, ((net.minecraft.entity.EntityList$EntityEggInfo)(life8_16)).a))));
    if (!((life6_9 == 0))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public net.minecraft.item.ItemStack a(net.minecraft.item.ItemStack p0, net.minecraft.world.World p1, net.minecraft.entity.player.EntityPlayer p2) {
net.minecraft.util.MovingObjectPosition forwardValue4482_20_0;
    net.minecraft.util.MovingObjectPosition forwardValue4482_26_0;
    int forwardValue4482_43_0;
    int forwardValue4482_55_0;
    net.minecraft.world.World forwardValue4482_57_0;
    net.minecraft.entity.Entity forwardValue4482_81_0;
    int forwardValue4482_99_0;
    net.minecraft.entity.player.EntityPlayer forwardValue4482_107_0;
    net.minecraft.util.MovingObjectPosition spill4482_0;
    boolean spill4482_1;
    net.minecraft.world.World spill4482_2;
    net.minecraft.entity.Entity spill4482_3;
    int spill4482_4;
    boolean spill4482_5;
    net.minecraft.entity.player.EntityPlayer spill4482_6;
    long life4_3;
    int life6_5;
    net.minecraft.util.MovingObjectPosition life7_14;
    moom.DT life8_36;
    net.minecraft.entity.Entity life9_97;
    forward_join_112: {
    forward_join_107: {
    forward_join_106: {
    forward_join_99: {
    forward_join_94: {
    forward_join_81: {
    forward_join_57: {
    forward_join_55: {
    forward_join_48: {
    forward_join_43: {
    forward_join_37: {
    forward_join_26: {
    forward_join_20: {
    life4_3 = (moom.xC.n ^ 792981441341L);
    life6_5 = ((net.minecraft.item.ItemStack.m()) ? 1 : 0);
    if (!((!((net.minecraft.world.World)(p1)).G))) {
        break forward_join_112;
    }
    life7_14 = ((moom.xC)(this)).a(((net.minecraft.world.World)(p1)), ((net.minecraft.entity.player.EntityPlayer)(p2)), ((boolean)(true)));
    spill4482_0 = life7_14;
    if (!((life6_5 != 0))) {
        forwardValue4482_20_0 = spill4482_0;
        break forward_join_20;
    }
    if (!((spill4482_0 != null))) {
        break forward_join_112;
    }
    forwardValue4482_20_0 = life7_14;
    }
    if (!((life6_5 != 0))) {
        forwardValue4482_26_0 = forwardValue4482_20_0;
        break forward_join_26;
    }
    if (!((((net.minecraft.util.MovingObjectPosition)(forwardValue4482_20_0)).b == net.minecraft.util.MovingObjectPosition$MovingObjectType.BLOCK))) {
        break forward_join_112;
    }
    forwardValue4482_26_0 = life7_14;
    }
    life8_36 = ((net.minecraft.util.MovingObjectPosition)(forwardValue4482_26_0)).a();
    spill4482_1 = ((net.minecraft.world.World)(p1)).a(((net.minecraft.entity.player.EntityPlayer)(p2)), ((moom.DT)(life8_36)));
    if (!((life6_5 != 0))) {
        forwardValue4482_43_0 = ((spill4482_1) ? 1 : 0);
        break forward_join_43;
    }
    if (!((!spill4482_1))) {
        break forward_join_37;
    }
    return p0;
    }
    forwardValue4482_43_0 = ((((net.minecraft.entity.player.EntityPlayer)(p2)).a(((moom.DT)(life8_36)), ((moom.bs)(((net.minecraft.util.MovingObjectPosition)(life7_14)).c)), ((net.minecraft.item.ItemStack)(p0)))) ? 1 : 0);
    }
    if (!((life6_5 != 0))) {
        forwardValue4482_55_0 = forwardValue4482_43_0;
        break forward_join_55;
    }
    if (!((forwardValue4482_43_0 == 0))) {
        break forward_join_48;
    }
    return p0;
    }
    spill4482_2 = p1;
    if (!((life6_5 != 0))) {
        forwardValue4482_57_0 = spill4482_2;
        break forward_join_57;
    }
    forwardValue4482_55_0 = ((((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(spill4482_2)).a__fE(((moom.DT)(life8_36))))).a__ch() instanceof net.minecraft.block.BlockLiquid) ? 1 : 0);
    }
    if (!((forwardValue4482_55_0 != 0))) {
        break forward_join_112;
    }
    forwardValue4482_57_0 = p1;
    }
    life9_97 = moom.xC.a(((net.minecraft.world.World)(forwardValue4482_57_0)), ((int)(((net.minecraft.item.ItemStack)(p0)).c())), ((double)((((double) ((moom.DT)(life8_36)).a()) + 0x1.0p-1d))), ((double)((((double) ((moom.DT)(life8_36)).b()) + 0x1.0p-1d))), ((double)((((double) ((moom.DT)(life8_36)).c()) + 0x1.0p-1d))));
    spill4482_3 = life9_97;
    if (!((life6_5 != 0))) {
        forwardValue4482_81_0 = spill4482_3;
        break forward_join_81;
    }
    if (!((spill4482_3 != null))) {
        break forward_join_112;
    }
    forwardValue4482_81_0 = life9_97;
    }
    spill4482_4 = ((forwardValue4482_81_0 instanceof net.minecraft.entity.EntityLivingBase) ? 1 : 0);
    if (!((life6_5 != 0))) {
        forwardValue4482_99_0 = spill4482_4;
        break forward_join_99;
    }
    if (!((spill4482_4 != 0))) {
        break forward_join_94;
    }
    spill4482_5 = ((net.minecraft.item.ItemStack)(p0)).f__Boolean();
    if (!((life6_5 != 0))) {
        forwardValue4482_99_0 = ((spill4482_5) ? 1 : 0);
        break forward_join_99;
    }
    if (!(spill4482_5)) {
        break forward_join_94;
    }
    ((net.minecraft.entity.Entity)(life9_97)).a(((java.lang.String)(((net.minecraft.item.ItemStack)(p0)).b__String())));
    }
    spill4482_6 = p2;
    if (!((life6_5 != 0))) {
        forwardValue4482_107_0 = spill4482_6;
        break forward_join_107;
    }
    forwardValue4482_99_0 = ((((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.entity.player.EntityPlayer)(spill4482_6)).b1)).d) ? 1 : 0);
    }
    if (!((forwardValue4482_99_0 == 0))) {
        break forward_join_106;
    }
    net.minecraft.item.ItemStack __stackOp4482_29_0 = p0;
    ((net.minecraft.item.ItemStack)(__stackOp4482_29_0)).b = ((int)((((net.minecraft.item.ItemStack)(__stackOp4482_29_0)).b - 1)));
    }
    forwardValue4482_107_0 = p2;
    }
    ((net.minecraft.entity.player.EntityPlayer)(forwardValue4482_107_0)).a(((moom.BY)((net.minecraft.stats.StatList.ad)[net.minecraft.item.Item.a(((net.minecraft.item.Item)(this)))])));
    }
    return p0;
}


public boolean a(net.minecraft.item.ItemStack p0, net.minecraft.entity.player.EntityPlayer p1, net.minecraft.world.World p2, moom.DT p3, moom.bs p4, float p5, float p6, float p7) {
int forwardValue4481_20_0;
    int forwardValue4481_24_0;
    int forwardValue4481_71_0;
    net.minecraft.entity.Entity forwardValue4481_111_0;
    int forwardValue4481_127_0;
    int forwardValue4481_137_0;
    boolean spill4481_0;
    boolean spill4481_1;
    net.minecraft.entity.Entity spill4481_2;
    int spill4481_3;
    boolean spill4481_4;
    long life9_3;
    int life11_5;
    net.minecraft.block.state.IBlockState life12_36;
    net.minecraft.tileentity.TileEntity life13_49;
    net.minecraft.tileentity.MobSpawnerBaseLogic life14_61;
    double life13_97;
    net.minecraft.entity.Entity life15_128;
    forward_join_137: {
    forward_join_136: {
    forward_join_127: {
    forward_join_124: {
    forward_join_111: {
    forward_join_86: {
    forward_join_76: {
    forward_join_72: {
    forward_join_71: {
    forward_join_70: {
    forward_join_25: {
    forward_join_24: {
    forward_join_20: {
    forward_join_13: {
    life9_3 = (moom.xC.n ^ 130643267824518L);
    life11_5 = ((net.minecraft.item.ItemStack.l()) ? 1 : 0);
    spill4481_0 = ((net.minecraft.world.World)(p2)).G;
    if (!((life11_5 == 0))) {
        forwardValue4481_20_0 = ((spill4481_0) ? 1 : 0);
        break forward_join_20;
    }
    if (!(spill4481_0)) {
        break forward_join_13;
    }
    return ((1) != 0);
    }
    forwardValue4481_20_0 = ((((net.minecraft.entity.player.EntityPlayer)(p1)).a(((moom.DT)(((moom.DT)(p3)).a(((moom.bs)(p4))))), ((moom.bs)(p4)), ((net.minecraft.item.ItemStack)(p0)))) ? 1 : 0);
    }
    if (!((life11_5 == 0))) {
        forwardValue4481_24_0 = forwardValue4481_20_0;
        break forward_join_24;
    }
    if (!((forwardValue4481_20_0 == 0))) {
        break forward_join_25;
    }
    forwardValue4481_24_0 = 0;
    }
    return ((forwardValue4481_24_0) != 0);
    }
    life12_36 = ((net.minecraft.world.World)(p2)).a__fE(((moom.DT)(p3)));
    if (!((life11_5 == 0))) {
        break forward_join_76;
    }
    if (!((((net.minecraft.block.state.IBlockState)(life12_36)).a__ch() == net.minecraft.init.Blocks.ac))) {
        break forward_join_72;
    }
    life13_49 = ((net.minecraft.world.World)(p2)).a__B9(((moom.DT)(p3)));
    if (!((life11_5 == 0))) {
        break forward_join_76;
    }
    if (!((((life13_49 instanceof moom.Cq) ? 1 : 0) != 0))) {
        break forward_join_72;
    }
    life14_61 = ((moom.Cq)(((moom.Cq)(life13_49)))).a__sourceReturn_30e49adebc();
    ((net.minecraft.tileentity.MobSpawnerBaseLogic)(life14_61)).a(((java.lang.String)(net.minecraft.entity.EntityList.a__String(((int)(((net.minecraft.item.ItemStack)(p0)).c()))))));
    ((net.minecraft.tileentity.TileEntity)(life13_49)).a__Void();
    ((net.minecraft.world.World)(p2)).a__Void(((moom.DT)(p3)));
    spill4481_1 = ((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.entity.player.EntityPlayer)(p1)).b1)).d;
    if (!((life11_5 == 0))) {
        forwardValue4481_71_0 = ((spill4481_1) ? 1 : 0);
        break forward_join_71;
    }
    if (!((!spill4481_1))) {
        break forward_join_70;
    }
    net.minecraft.item.ItemStack __stackOp4481_25_0 = p0;
    ((net.minecraft.item.ItemStack)(__stackOp4481_25_0)).b = ((int)((((net.minecraft.item.ItemStack)(__stackOp4481_25_0)).b - 1)));
    }
    forwardValue4481_71_0 = 1;
    }
    return ((forwardValue4481_71_0) != 0);
    }
    p3 = ((moom.DT)(p3)).a(((moom.bs)(p4)));
    }
    life13_97 = 0x0.0p0d;
    if (!((p4 == moom.bs.UP))) {
        break forward_join_86;
    }
    if (!((((life12_36 instanceof moom.dz) ? 1 : 0) != 0))) {
        break forward_join_86;
    }
    life13_97 = 0x1.0p-1d;
    }
    life15_128 = moom.xC.a(((net.minecraft.world.World)(p2)), ((int)(((net.minecraft.item.ItemStack)(p0)).c())), ((double)((((double) ((moom.DT)(p3)).a()) + 0x1.0p-1d))), ((double)((((double) ((moom.DT)(p3)).b()) + life13_97))), ((double)((((double) ((moom.DT)(p3)).c()) + 0x1.0p-1d))));
    spill4481_2 = life15_128;
    if (!((life11_5 == 0))) {
        forwardValue4481_111_0 = spill4481_2;
        break forward_join_111;
    }
    if (!((spill4481_2 != null))) {
        break forward_join_136;
    }
    forwardValue4481_111_0 = life15_128;
    }
    spill4481_3 = ((forwardValue4481_111_0 instanceof net.minecraft.entity.EntityLivingBase) ? 1 : 0);
    if (!((life11_5 == 0))) {
        forwardValue4481_127_0 = spill4481_3;
        break forward_join_127;
    }
    if (!((spill4481_3 != 0))) {
        break forward_join_124;
    }
    spill4481_4 = ((net.minecraft.item.ItemStack)(p0)).f__Boolean();
    if (!((life11_5 == 0))) {
        forwardValue4481_127_0 = ((spill4481_4) ? 1 : 0);
        break forward_join_127;
    }
    if (!(spill4481_4)) {
        break forward_join_124;
    }
    ((net.minecraft.entity.Entity)(life15_128)).a(((java.lang.String)(((net.minecraft.item.ItemStack)(p0)).b__String())));
    }
    forwardValue4481_127_0 = ((((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.entity.player.EntityPlayer)(p1)).b1)).d) ? 1 : 0);
    }
    if (!((life11_5 == 0))) {
        forwardValue4481_137_0 = forwardValue4481_127_0;
        break forward_join_137;
    }
    if (!((forwardValue4481_127_0 == 0))) {
        break forward_join_136;
    }
    net.minecraft.item.ItemStack __stackOp4481_45_0 = p0;
    ((net.minecraft.item.ItemStack)(__stackOp4481_45_0)).b = ((int)((((net.minecraft.item.ItemStack)(__stackOp4481_45_0)).b - 1)));
    }
    forwardValue4481_137_0 = 1;
    }
    return ((forwardValue4481_137_0) != 0);
}


public int a(net.minecraft.item.ItemStack p0, int p1) {
int forwardValue4480_24_0;
    int forwardValue4480_27_0;
    boolean spill4480_0;
    int spill4480_1;
    long life3_3;
    net.minecraft.entity.EntityList$EntityEggInfo life6_11;
    int life5_12;
    forward_join_27: {
    forward_join_25: {
    forward_join_24: {
    forward_join_22: {
    life3_3 = (moom.xC.n ^ 65296082291639L);
    spill4480_0 = net.minecraft.item.ItemStack.l();
    life6_11 = ((net.minecraft.entity.EntityList$EntityEggInfo)(((java.util.Map)(net.minecraft.entity.EntityList.g)).get(((java.lang.Object)(java.lang.Integer.valueOf(((int)(((net.minecraft.item.ItemStack)(p0)).c()))))))));
    life5_12 = ((spill4480_0) ? 1 : 0);
    if (!((life6_11 != null))) {
        break forward_join_25;
    }
    spill4480_1 = p1;
    if (!((life5_12 == 0))) {
        forwardValue4480_24_0 = spill4480_1;
        break forward_join_24;
    }
    if (!((spill4480_1 == 0))) {
        break forward_join_22;
    }
    forwardValue4480_27_0 = ((net.minecraft.entity.EntityList$EntityEggInfo)(life6_11)).b;
    break forward_join_27;
    }
    forwardValue4480_24_0 = ((net.minecraft.entity.EntityList$EntityEggInfo)(life6_11)).c;
    }
    forwardValue4480_27_0 = forwardValue4480_24_0;
    break forward_join_27;
    }
    forwardValue4480_27_0 = ((int) moom.xC.o);
    }
    return forwardValue4480_27_0;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_480a975002ff_invokedynamic4484_2(java.lang.String a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_480a975002ff_invokedynamic4484_4(java.lang.String a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_480a975002ff_invokedynamic4484_10(java.lang.String a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_480a975002ff_invokedynamic4484_12(java.lang.String a0, java.lang.String a1) throws E;
}
