package moom;


public class dj extends net.minecraft.block.BlockDirectional implements net.minecraft.block.IGrowable {

public static final moom.fy R;

private static final long S;

private static final long T;

public dj() {
super(moom.fn.k);
    (this).a__Void((((this.M).a__fE()).a__fE(moom.dj.Q, moom.bs.NORTH)).a__fE(moom.dj.R, java.lang.Integer.valueOf(0)));
    (this).a(true);
}


static {
S = ((long)(((moom._a)(moom._c.a(((long)(-4450133792735134196L)), ((long)(-7887126681131133676L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(200328168383016L)))));
    long local0_life6 = (moom.dj.S ^ 95519083326054L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill815_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill815_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill815_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill815_13 = new byte[8];
    (__sourceSpill815_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill815_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation815_15 = __sourceSpill815_13;
    ((javax.crypto.Cipher)(__sourceSpill815_10)).init(((int)(__sourceSpill815_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill815_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation815_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = 7997693089453416908L;
    byte[] __sourceSpill815_19 = new byte[8];
    (__sourceSpill815_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill815_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill815_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill815_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill815_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill815_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill815_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill815_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill815_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill815_20)).doFinal(((byte[])(__sourceSpill815_19)));
    T = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
    R = ((moom.fy)(moom.fy.a(((java.lang.String)("age")), ((int)(0)), ((int)(2)))));
}


public net.minecraft.block.state.IBlockState b__fE(int p0) {
long local2 = (moom.dj.S ^ 47328170062962L);
    return ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((moom.dj)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.dj.Q)), ((java.lang.Comparable)(moom.bs.b(((int)(p0)))))))).a__fE(((net.minecraft.block.properties.IProperty)(moom.dj.R)), ((java.lang.Comparable)(java.lang.Integer.valueOf(((int)(((p0 & ((int) moom.dj.T)) >> 2)))))));
}


public int b(net.minecraft.block.state.IBlockState p0) {
int local2 = 0;
    local2 = (local2 | ((moom.bs)(((moom.bs)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.dj.Q))))))).b());
    local2 = (local2 | (((java.lang.Integer)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.dj.R))))))).intValue() << 2));
    return local2;
}


public void b(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, java.util.Random p3) {
int forwardValue3315_25_0;
    int forwardValue3315_33_0;
    int forwardValue3315_50_0;
    boolean spill3315_0;
    int spill3315_1;
    long life5_3;
    int[] life7_5;
    int life8_48;
    forward_join_51: {
    forward_join_50: {
    forward_join_33: {
    forward_join_25: {
    forward_join_21: {
    life5_3 = (moom.dj.S ^ 6574474843813L);
    life7_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3315_0 = ((moom.dj)(this)).a__Boolean(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)));
    if (!((life7_5 != null))) {
        forwardValue3315_25_0 = ((spill3315_0) ? 1 : 0);
        break forward_join_25;
    }
    if (!((!spill3315_0))) {
        break forward_join_21;
    }
    ((moom.dj)(this)).d(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)));
    if (!((life7_5 == null))) {
        break forward_join_51;
    }
    }
    forwardValue3315_25_0 = ((java.util.Random)(((net.minecraft.world.World)(p0)).u)).nextInt(((int)(5)));
    }
    if (!((life7_5 != null))) {
        forwardValue3315_33_0 = forwardValue3315_25_0;
        break forward_join_33;
    }
    if (!((forwardValue3315_25_0 == 0))) {
        break forward_join_51;
    }
    forwardValue3315_33_0 = ((java.lang.Integer)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.dj.R))))))).intValue();
    }
    life8_48 = forwardValue3315_33_0;
    spill3315_1 = life8_48;
    if (!((life7_5 != null))) {
        forwardValue3315_50_0 = spill3315_1;
        break forward_join_50;
    }
    if (!((spill3315_1 < 2))) {
        break forward_join_51;
    }
    forwardValue3315_50_0 = ((((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(p2)).a__fE(((net.minecraft.block.properties.IProperty)(moom.dj.R)), ((java.lang.Comparable)(java.lang.Integer.valueOf(((int)((life8_48 + 1))))))))), ((int)(2)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue3315_50_0);
    }
    return;
}


private void d(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((int)(3)));
    ((moom.dj)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((int)(0)));
    return;
}


public boolean a__Boolean(net.minecraft.world.World p0, java.util.Random p1, moom.DT p2, net.minecraft.block.state.IBlockState p3) {
return ((1) != 0);
}


public boolean a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, boolean p3) {
int forwardValue3312_16_0;
    int forwardValue3312_18_0;
    int spill3312_0;
    long life5_3;
    int[] life7_5;
    forward_join_18: {
    forward_join_17: {
    forward_join_16: {
    life5_3 = (moom.dj.S ^ 86916370656895L);
    life7_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3312_0 = ((java.lang.Integer)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.dj.R))))))).intValue();
    if (!((life7_5 != null))) {
        forwardValue3312_16_0 = spill3312_0;
        break forward_join_16;
    }
    if (!((spill3312_0 < 2))) {
        break forward_join_17;
    }
    forwardValue3312_16_0 = 1;
    }
    forwardValue3312_18_0 = forwardValue3312_16_0;
    break forward_join_18;
    }
    forwardValue3312_18_0 = 0;
    }
    return ((forwardValue3312_18_0) != 0);
}


public int a__Int(net.minecraft.world.World p0, moom.DT p1) {
return ((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.BROWN)).b();
}


public net.minecraft.item.Item a__wQ(net.minecraft.world.World p0, moom.DT p1) {
return net.minecraft.init.Items.aW;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


protected moom.fA a__fA() {
return new moom.fA(this, new net.minecraft.block.properties.IProperty[] {moom.dj.Q, moom.dj.R});
}


public net.minecraft.util.EnumWorldBlockLayer a__bx() {
return net.minecraft.util.EnumWorldBlockLayer.CUTOUT;
}


public void a(net.minecraft.world.World p0, java.util.Random p1, moom.DT p2, net.minecraft.block.state.IBlockState p3) {
((net.minecraft.world.World)(p0)).a(((moom.DT)(p2)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(p3)).a__fE(((net.minecraft.block.properties.IProperty)(moom.dj.R)), ((java.lang.Comparable)(java.lang.Integer.valueOf(((int)((((java.lang.Integer)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(p3)).a(((net.minecraft.block.properties.IProperty)(moom.dj.R))))))).intValue() + 1))))))))), ((int)(2)));
    return;
}


public void a__Void(net.minecraft.world.IBlockAccess p0, moom.DT p1) {
int[] spill332_0;
    long life3_3;
    net.minecraft.block.state.IBlockState life6_7;
    moom.bs life7_12;
    int life8_18;
    int life9_24;
    int life10_30;
    float life11_36;
    int[] life5_37;
    forward_join_155: {
    forward_join_129: {
    forward_join_101: {
    forward_join_73: {
    forward_join_71: {
    forward_join_45: {
    life3_3 = (moom.dj.S ^ 39167827098877L);
    life6_7 = ((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(p1)));
    life7_12 = ((moom.bs)(((net.minecraft.block.state.IBlockState)(life6_7)).a(((net.minecraft.block.properties.IProperty)(moom.dj.Q)))));
    life8_18 = ((java.lang.Integer)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(life6_7)).a(((net.minecraft.block.properties.IProperty)(moom.dj.R))))))).intValue();
    life9_24 = (4 + (life8_18 * 2));
    life10_30 = (5 + (life8_18 * 2));
    spill332_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life11_36 = (((float) life9_24) / 0x1.0p1f);
    life5_37 = spill332_0;
    if (!((life5_37 != null))) {
        break forward_join_71;
    }
    switch ((moom.eR.a)[((moom.bs)(life7_12)).ordinal()]) {
case 1:
{
        break forward_join_45;
    }
case 2:
{
        break forward_join_73;
    }
case 3:
{
        break forward_join_101;
    }
case 4:
{
        break forward_join_129;
    }
default:
{
        break forward_join_155;
    }
}
    }
    ((moom.dj)(this)).a(((float)(((0x1.0p3f - life11_36) / 0x1.0p4f))), ((float)(((0x1.8p3f - ((float) life10_30)) / 0x1.0p4f))), ((float)(((0x1.ep3f - ((float) life9_24)) / 0x1.0p4f))), ((float)(((0x1.0p3f + life11_36) / 0x1.0p4f))), ((float)(0x1.8p-1f)), ((float)(0x1.ep-1f)));
    }
    if (!((life5_37 == null))) {
        break forward_join_155;
    }
    }
    ((moom.dj)(this)).a(((float)(((0x1.0p3f - life11_36) / 0x1.0p4f))), ((float)(((0x1.8p3f - ((float) life10_30)) / 0x1.0p4f))), ((float)(0x1.0p-4f)), ((float)(((0x1.0p3f + life11_36) / 0x1.0p4f))), ((float)(0x1.8p-1f)), ((float)(((0x1.0p0f + ((float) life9_24)) / 0x1.0p4f))));
    if (!((life5_37 == null))) {
        break forward_join_155;
    }
    }
    ((moom.dj)(this)).a(((float)(0x1.0p-4f)), ((float)(((0x1.8p3f - ((float) life10_30)) / 0x1.0p4f))), ((float)(((0x1.0p3f - life11_36) / 0x1.0p4f))), ((float)(((0x1.0p0f + ((float) life9_24)) / 0x1.0p4f))), ((float)(0x1.8p-1f)), ((float)(((0x1.0p3f + life11_36) / 0x1.0p4f))));
    if (!((life5_37 == null))) {
        break forward_join_155;
    }
    }
    ((moom.dj)(this)).a(((float)(((0x1.ep3f - ((float) life9_24)) / 0x1.0p4f))), ((float)(((0x1.8p3f - ((float) life10_30)) / 0x1.0p4f))), ((float)(((0x1.0p3f - life11_36) / 0x1.0p4f))), ((float)(0x1.ep-1f)), ((float)(0x1.8p-1f)), ((float)(((0x1.0p3f + life11_36) / 0x1.0p4f))));
    }
    return;
}


public moom.CA a__CA(net.minecraft.world.World p0, moom.DT p1) {
((moom.dj)(this)).a__Void(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(p1)));
    return super.a__CA(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)));
}


public moom.CA a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
((moom.dj)(this)).a__Void(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(p1)));
    return super.a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)));
}


public boolean a__Boolean(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
net.minecraft.block.state.IBlockState forwardValue3313_24_0;
    int forwardValue3313_31_0;
    int[] spill3313_0;
    net.minecraft.block.state.IBlockState spill3313_1;
    long life4_3;
    moom.DT life2_10;
    net.minecraft.block.state.IBlockState life7_15;
    int[] life6_16;
    forward_join_31: {
    forward_join_30: {
    forward_join_24: {
    life4_3 = (moom.dj.S ^ 69659008169764L);
    life2_10 = ((moom.DT)(p1)).a(((moom.bs)(((moom.bs)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.dj.Q))))))));
    spill3313_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life7_15 = ((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life2_10)));
    life6_16 = spill3313_0;
    spill3313_1 = life7_15;
    if (!((life6_16 != null))) {
        forwardValue3313_24_0 = spill3313_1;
        break forward_join_24;
    }
    if (!((((net.minecraft.block.state.IBlockState)(spill3313_1)).a__ch() == net.minecraft.init.Blocks.r))) {
        break forward_join_30;
    }
    forwardValue3313_24_0 = life7_15;
    }
    if (!((((net.minecraft.block.state.IBlockState)(forwardValue3313_24_0)).a(((net.minecraft.block.properties.IProperty)(moom.dZ.Q))) == net.minecraft.block.BlockPlanks$EnumType.JUNGLE))) {
        break forward_join_30;
    }
    forwardValue3313_31_0 = 1;
    break forward_join_31;
    }
    forwardValue3313_31_0 = 0;
    }
    return ((forwardValue3313_31_0) != 0);
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, float p3, int p4) {
int lexicalValue1118_22_0;
    int[] spill1118_0;
    int spill1118_1;
    long life6_3;
    int life9_10;
    int life10_12;
    int[] life8_13;
    int life11_25;
    lexical_join_39: {
    lexical_join_22: {
    lexical_join_21: {
    life6_3 = (moom.dj.S ^ 16069665667969L);
    spill1118_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life9_10 = ((java.lang.Integer)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.dj.R))))))).intValue();
    life10_12 = 1;
    life8_13 = spill1118_0;
    spill1118_1 = life9_10;
    if (!((life8_13 != null))) {
        lexicalValue1118_22_0 = spill1118_1;
        break lexical_join_22;
    }
    if (!((spill1118_1 >= 2))) {
        break lexical_join_21;
    }
    life10_12 = 3;
    }
    lexicalValue1118_22_0 = 0;
    }
    life11_25 = lexicalValue1118_22_0;
    lexical_cycle_23: while (true) {
    if (!((life11_25 < life10_12))) {
        break lexical_join_39;
    }
    moom.dj.a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(net.minecraft.init.Items.aW, 1, ((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.BROWN)).b()))));
    life11_25 += 1;
    if (!((life8_13 == null))) { continue lexical_cycle_23; }
    break lexical_cycle_23;
    }
    }
    return;
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.block.Block p3) {
moom.dj forwardValue3311_18_0;
    net.minecraft.world.World forwardValue3311_18_1;
    moom.DT forwardValue3311_18_2;
    net.minecraft.block.state.IBlockState forwardValue3311_18_3;
    moom.dj spill3311_0;
    net.minecraft.world.World spill3311_1;
    moom.DT spill3311_2;
    net.minecraft.block.state.IBlockState spill3311_3;
    long life5_3;
    int[] life7_5;
    forward_join_19: {
    forward_join_18: {
    life5_3 = (moom.dj.S ^ 18204317329956L);
    life7_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3311_0 = this;
    spill3311_1 = p0;
    spill3311_2 = p1;
    spill3311_3 = p2;
    if (!((life7_5 != null))) {
        forwardValue3311_18_0 = spill3311_0;
        forwardValue3311_18_1 = spill3311_1;
        forwardValue3311_18_2 = spill3311_2;
        forwardValue3311_18_3 = spill3311_3;
        break forward_join_18;
    }
    if (!((!((moom.dj)(spill3311_0)).a__Boolean(((net.minecraft.world.World)(spill3311_1)), ((moom.DT)(spill3311_2)), ((net.minecraft.block.state.IBlockState)(spill3311_3)))))) {
        break forward_join_19;
    }
    forwardValue3311_18_0 = this;
    forwardValue3311_18_1 = p0;
    forwardValue3311_18_2 = p1;
    forwardValue3311_18_3 = p2;
    }
    ((moom.dj)(forwardValue3311_18_0)).d(((net.minecraft.world.World)(forwardValue3311_18_1)), ((moom.DT)(forwardValue3311_18_2)), ((net.minecraft.block.state.IBlockState)(forwardValue3311_18_3)));
    }
    return;
}


public net.minecraft.block.state.IBlockState a(net.minecraft.world.World p0, moom.DT p1, moom.bs p2, float p3, float p4, float p5, int p6, net.minecraft.entity.EntityLivingBase p7) {
moom.bs forwardValue3309_13_0;
    moom.bs spill3309_0;
    long life9_3;
    int[] life11_5;
    forward_join_14: {
    forward_join_13: {
    life9_3 = (moom.dj.S ^ 12372852951791L);
    life11_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3309_0 = p2;
    if (!((life11_5 != null))) {
        forwardValue3309_13_0 = spill3309_0;
        break forward_join_13;
    }
    if (!((!((net.minecraft.util.EnumFacing$Axis)(((moom.bs)(spill3309_0)).a__bt())).b__Boolean()))) {
        break forward_join_14;
    }
    forwardValue3309_13_0 = moom.bs.NORTH;
    }
    p2 = forwardValue3309_13_0;
    }
    return ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((moom.dj)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.dj.Q)), ((java.lang.Comparable)(((moom.bs)(p2)).a__bs()))))).a__fE(((net.minecraft.block.properties.IProperty)(moom.dj.R)), ((java.lang.Comparable)(java.lang.Integer.valueOf(((int)(0))))));
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.entity.EntityLivingBase p3, net.minecraft.item.ItemStack p4) {
java.lang.Object local6 = moom.bs.a(((double)(((double) ((net.minecraft.entity.EntityLivingBase)(p3)).w))));
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(p2)).a__fE(((net.minecraft.block.properties.IProperty)(moom.dj.Q)), ((java.lang.Comparable)(local6))))), ((int)(2)));
    return;
}


public boolean g() {
return ((0) != 0);
}


public boolean j() {
return ((0) != 0);
}

}
