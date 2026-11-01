package com.moon;


public class gy {

private static final net.minecraft.client.Minecraft a;

private final com.moon.module.impl.ScaffoldWalk b;

private static final long c;

private static final long d;

public gy(com.moon.module.impl.ScaffoldWalk p0) {
super();
    this.b = p0;
}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(7551494456798764533L)), ((long)(4176596004340484468L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(10407059359286L)))));
    long local0_life6 = (com.moon.gy.c ^ 5715413963520L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill122_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill122_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill122_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill122_13 = new byte[8];
    (__sourceSpill122_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill122_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation122_15 = __sourceSpill122_13;
    ((javax.crypto.Cipher)(__sourceSpill122_10)).init(((int)(__sourceSpill122_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill122_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation122_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -4150035198015298572L;
    byte[] __sourceSpill122_19 = new byte[8];
    (__sourceSpill122_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill122_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill122_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill122_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill122_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill122_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill122_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill122_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill122_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill122_20)).doFinal(((byte[])(__sourceSpill122_19)));
    d = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
    a = ((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM()));
}


private void b() {
long life1_3;
    int life3_10;
    forward_join_32: {
    forward_join_25: {
    forward_join_23: {
    life1_3 = (com.moon.gy.c ^ 71203765325433L);
    boolean spill448_0 = com.moon.gD.c__Boolean();
    ((com.moon.module.impl.ScaffoldWalk)(this.b)).a(((boolean)(true)));
    life3_10 = ((spill448_0) ? 1 : 0);
    if (!((life3_10 == 0))) { break forward_join_23; }
    if (!(((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.ScaffoldWalk)(this.b)).k())).getValue())))).booleanValue())) { break forward_join_25; }
    ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.gy.a)).K)).B__sourceReturn_da8c82d5d4();
    }
    if (!((life3_10 != 0))) { break forward_join_32; }
    }
    ((net.minecraft.client.network.NetHandlerPlayClient)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.gy.a)).K)).cm)).b(((moom.yK)(new moom.zd())));
    }
    return;
}


private boolean a(net.minecraft.item.ItemStack p0, moom.DT p1, moom.bs p2, moom.DR p3) {
return (__sourceIntrinsic_booleanComparison((((moom.jI)(((net.minecraft.client.Minecraft)(com.moon.gy.a)).F)).a(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.gy.a)).K)), ((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(com.moon.gy.a)).I)), ((net.minecraft.item.ItemStack)(p0)), ((moom.DT)(p1)), ((moom.bs)(p2)), ((moom.DR)(p3))))) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(moom.DT p0, moom.bs p1) {
com.moon.gy forwardValue300_33_0;
    boolean spill300_0;
    com.moon.gy spill300_1;
    long life3_3;
    net.minecraft.item.ItemStack life6_12;
    int life5_13;
    moom.DR life7_22;
    forward_join_34: {
    forward_join_33: {
    life3_3 = (com.moon.gy.c ^ 97350573752074L);
    spill300_0 = com.moon.gD.b__Boolean();
    life6_12 = ((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.gy.a)).K)).bD)).a__xW(((int)(((moom.jI)(((net.minecraft.client.Minecraft)(com.moon.gy.a)).F)).a__Int())));
    life5_13 = ((spill300_0) ? 1 : 0);
    life7_22 = this.a(((moom.DT)(p0)), ((com.moon.n4)(((com.moon.gD)(((com.moon.gA)(((com.moon.module.impl.ScaffoldWalk)(this.b)).a__gA())).a())).b())));
    spill300_1 = this;
    if (!((life5_13 != 0))) {
        forwardValue300_33_0 = spill300_1;
        break forward_join_33;
    }
    if (!(((com.moon.gy)(spill300_1)).a(((net.minecraft.item.ItemStack)(life6_12)), ((moom.DT)(p0)), ((moom.bs)(p1)), ((moom.DR)(life7_22))))) {
        break forward_join_34;
    }
    forwardValue300_33_0 = this;
    }
    ((com.moon.gy)(forwardValue300_33_0)).b();
    }
    return;
}


public void a() {
int forestValue900122_17_0;
    int forestValue900122_42_0;
    int forestValue900122_59_0;
    net.minecraft.item.ItemStack forestValue900122_102_0;
    int forestValue900122_105_0;
    int forestValue900122_125_0;
    net.minecraft.item.ItemStack forestValue900122_134_0;
    int forestValue900122_149_0;
    int forestValue900122_165_0;
    net.minecraft.client.Minecraft forestValue900122_171_0;
    net.minecraft.util.MovingObjectPosition forestValue900122_172_0;
    net.minecraft.util.MovingObjectPosition forestValue900122_177_0;
    int forestValue900122_183_0;
    boolean spill900122_0;
    net.minecraft.util.MovingObjectPosition spill900122_1;
    int spill900122_2;
    net.minecraft.client.Minecraft spill900122_3;
    net.minecraft.client.Minecraft spill900122_4;
    net.minecraft.item.ItemStack spill900122_5;
    boolean spill900122_6;
    net.minecraft.item.ItemStack spill900122_7;
    int spill900122_8;
    net.minecraft.client.Minecraft spill900122_9;
    long life1_3;
    int life3_5;
    int life4_21;
    int life4_59;
    int life4_79;
    net.minecraft.item.ItemStack life5_87;
    int life6_92;
    moom.DT life7_96;
    net.minecraft.block.state.IBlockState life8_104;
    int life9_134;
    int life4_158;
    int life5_245;
    forest_join_184: {
    forest_join_183: {
    forest_join_182: {
    forest_join_177: {
    forest_join_172: {
    forest_join_171: {
    forest_join_170: {
    forest_join_165: {
    forest_join_159: {
    forest_join_149: {
    forest_join_147: {
    forest_join_134: {
    forest_join_133: {
    forest_join_128: {
    forest_join_125: {
    forest_join_105: {
    forest_join_104: {
    forest_join_102: {
    forest_join_64: {
    forest_join_59: {
    forest_join_49: {
    forest_join_42: {
    forest_join_32: {
    forest_join_17: {
    life1_3 = (com.moon.gy.c ^ 71501978478902L);
    life3_5 = ((com.moon.gD.c__Boolean()) ? 1 : 0);
    spill900122_0 = ((moom.jI)(((net.minecraft.client.Minecraft)(com.moon.gy.a)).F)).i();
    if (!((life3_5 == 0))) {
        forestValue900122_17_0 = ((spill900122_0) ? 1 : 0);
        break forest_join_17;
    }
    if (!((!spill900122_0))) {
        break forest_join_184;
    }
    ((net.minecraft.client.Minecraft)(com.moon.gy.a)).aA = ((int)(((int) com.moon.gy.d)));
    forestValue900122_17_0 = 1;
    }
    life4_21 = forestValue900122_17_0;
    spill900122_1 = ((net.minecraft.client.Minecraft)(com.moon.gy.a)).V;
    if (!((life3_5 == 0))) {
        forestValue900122_172_0 = spill900122_1;
        break forest_join_172;
    }
    if (!((spill900122_1 != null))) {
        break forest_join_170;
    }
    spill900122_2 = (com.moon.gz.a)[((net.minecraft.util.MovingObjectPosition$MovingObjectType)(((net.minecraft.util.MovingObjectPosition)(((net.minecraft.client.Minecraft)(com.moon.gy.a)).V)).b)).ordinal()];
    if (!((life3_5 == 0))) {
        forestValue900122_42_0 = spill900122_2;
        break forest_join_42;
    }
    switch (spill900122_2) {
case 1:
{
        break forest_join_32;
    }
case 2:
{
        break forest_join_64;
    }
default:
{
        break forest_join_170;
    }
}
    }
    forestValue900122_42_0 = ((((moom.jI)(((net.minecraft.client.Minecraft)(com.moon.gy.a)).F)).a(((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.client.Minecraft)(com.moon.gy.a)).K)), ((net.minecraft.entity.Entity)(((net.minecraft.util.MovingObjectPosition)(((net.minecraft.client.Minecraft)(com.moon.gy.a)).V)).e)), ((net.minecraft.util.MovingObjectPosition)(((net.minecraft.client.Minecraft)(com.moon.gy.a)).V)))) ? 1 : 0);
    }
    if (!((life3_5 == 0))) {
        forestValue900122_59_0 = forestValue900122_42_0;
        break forest_join_59;
    }
    if (!((forestValue900122_42_0 != 0))) {
        break forest_join_49;
    }
    life4_59 = 0;
    if (!((life3_5 != 0))) {
        break forest_join_170;
    }
    }
    spill900122_3 = com.moon.gy.a;
    if (!((life3_5 == 0))) {
        forestValue900122_171_0 = spill900122_3;
        break forest_join_171;
    }
    forestValue900122_59_0 = ((((moom.jI)(((net.minecraft.client.Minecraft)(spill900122_3)).F)).a__Boolean(((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.client.Minecraft)(com.moon.gy.a)).K)), ((net.minecraft.entity.Entity)(((net.minecraft.util.MovingObjectPosition)(((net.minecraft.client.Minecraft)(com.moon.gy.a)).V)).e)))) ? 1 : 0);
    }
    if (!((forestValue900122_59_0 != 0))) {
        break forest_join_170;
    }
    life4_79 = 0;
    if (!((life3_5 != 0))) {
        break forest_join_170;
    }
    }
    life5_87 = ((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.gy.a)).K)).bD)).a__xW();
    life6_92 = ((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.gy.a)).K)).bD)).c;
    life7_96 = ((net.minecraft.util.MovingObjectPosition)(((net.minecraft.client.Minecraft)(com.moon.gy.a)).V)).a();
    spill900122_4 = com.moon.gy.a;
    if (!((life3_5 == 0))) {
        forestValue900122_171_0 = spill900122_4;
        break forest_join_171;
    }
    life8_104 = ((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(spill900122_4)).I)).a__fE(((moom.DT)(life7_96)));
    if (!((((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(life8_104)).a__ch())).a__fn() != moom.fn.a))) {
        break forest_join_170;
    }
    if (!(((moom.DT)(life7_96)).equals(((java.lang.Object)(((com.moon.gC)(((com.moon.module.impl.ScaffoldWalk)(this.b)).a__gC())).a__DT()))))) {
        break forest_join_170;
    }
    spill900122_5 = life5_87;
    if (!((life3_5 == 0))) {
        forestValue900122_102_0 = spill900122_5;
        break forest_join_102;
    }
    if (!((spill900122_5 != null))) {
        break forest_join_104;
    }
    forestValue900122_102_0 = life5_87;
    }
    forestValue900122_105_0 = ((net.minecraft.item.ItemStack)(forestValue900122_102_0)).b;
    break forest_join_105;
    }
    forestValue900122_105_0 = 0;
    }
    life9_134 = forestValue900122_105_0;
    spill900122_6 = ((moom.jI)(((net.minecraft.client.Minecraft)(com.moon.gy.a)).F)).a(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.gy.a)).K)), ((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(com.moon.gy.a)).I)), ((net.minecraft.item.ItemStack)(life5_87)), ((moom.DT)(life7_96)), ((moom.bs)(((net.minecraft.util.MovingObjectPosition)(((net.minecraft.client.Minecraft)(com.moon.gy.a)).V)).c)), ((moom.DR)(((net.minecraft.util.MovingObjectPosition)(((net.minecraft.client.Minecraft)(com.moon.gy.a)).V)).d)));
    if (!((life3_5 == 0))) {
        forestValue900122_125_0 = ((spill900122_6) ? 1 : 0);
        break forest_join_125;
    }
    if (!(spill900122_6)) {
        break forest_join_128;
    }
    forestValue900122_125_0 = 0;
    }
    life4_158 = forestValue900122_125_0;
    this.b();
    }
    spill900122_7 = life5_87;
    if (!((life3_5 == 0))) {
        forestValue900122_134_0 = spill900122_7;
        break forest_join_134;
    }
    if (!((spill900122_7 == null))) {
        break forest_join_133;
    }
    return;
    }
    forestValue900122_134_0 = life5_87;
    }
    spill900122_8 = ((net.minecraft.item.ItemStack)(forestValue900122_134_0)).b;
    if (!((life3_5 == 0))) {
        forestValue900122_149_0 = spill900122_8;
        break forest_join_149;
    }
    if (!((spill900122_8 == 0))) {
        break forest_join_147;
    }
    (((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.gy.a)).K)).bD)).a)[life6_92] = null;
    if (!((life3_5 != 0))) {
        break forest_join_170;
    }
    }
    forestValue900122_149_0 = ((net.minecraft.item.ItemStack)(life5_87)).b;
    }
    if (!((life3_5 == 0))) {
        forestValue900122_165_0 = forestValue900122_149_0;
        break forest_join_165;
    }
    if (!((forestValue900122_149_0 == life9_134))) {
        break forest_join_159;
    }
    spill900122_9 = com.moon.gy.a;
    if (!((life3_5 == 0))) {
        forestValue900122_171_0 = spill900122_9;
        break forest_join_171;
    }
    if (!(((moom.jI)(((net.minecraft.client.Minecraft)(spill900122_9)).F)).e())) {
        break forest_join_170;
    }
    }
    forestValue900122_165_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.ScaffoldWalk)(this.b)).k())).getValue())))).booleanValue()) ? 1 : 0);
    }
    if (!((forestValue900122_165_0 != 0))) {
        break forest_join_170;
    }
    ((moom.lm)(((net.minecraft.client.renderer.EntityRenderer)(((net.minecraft.client.Minecraft)(com.moon.gy.a)).R)).z)).c();
    }
    forestValue900122_171_0 = com.moon.gy.a;
    }
    forestValue900122_172_0 = ((net.minecraft.client.Minecraft)(forestValue900122_171_0)).V;
    }
    if (!((life3_5 == 0))) {
        forestValue900122_177_0 = forestValue900122_172_0;
        break forest_join_177;
    }
    if (!((forestValue900122_172_0 != null))) {
        break forest_join_182;
    }
    forestValue900122_177_0 = ((net.minecraft.client.Minecraft)(com.moon.gy.a)).V;
    }
    if (!((((net.minecraft.util.MovingObjectPosition)(forestValue900122_177_0)).b == net.minecraft.util.MovingObjectPosition$MovingObjectType.MISS))) {
        break forest_join_182;
    }
    forestValue900122_183_0 = 1;
    break forest_join_183;
    }
    forestValue900122_183_0 = 0;
    }
    life5_245 = forestValue900122_183_0;
    life5_245 = life5_245;
    }
    return;
}


private moom.DR a(moom.DT p0, com.moon.n4 p1) {
net.minecraft.util.MovingObjectPosition forwardValue299_30_0;
    boolean spill299_0;
    net.minecraft.util.MovingObjectPosition spill299_1;
    long life3_3;
    net.minecraft.util.MovingObjectPosition life6_8;
    int life5_9;
    moom.DR life7_29;
    forward_join_32: {
    forward_join_30: {
    forward_join_29: {
    life3_3 = (com.moon.gy.c ^ 110150360236048L);
    spill299_0 = com.moon.gD.b__Boolean();
    life6_8 = this.a(((com.moon.n4)(p1)));
    life5_9 = ((spill299_0) ? 1 : 0);
    spill299_1 = life6_8;
    if (!((life5_9 != 0))) {
        forwardValue299_30_0 = spill299_1;
        break forward_join_30;
    }
    if (!((spill299_1 == null))) {
        break forward_join_29;
    }
    life7_29 = new moom.DR(((double) ((moom.DT)(p0)).a()), ((double) ((moom.DT)(p0)).b()), ((double) ((moom.DT)(p0)).c()));
    if (!((life5_9 == 0))) {
        break forward_join_32;
    }
    }
    forwardValue299_30_0 = life6_8;
    }
    life7_29 = ((net.minecraft.util.MovingObjectPosition)(forwardValue299_30_0)).d;
    }
    return life7_29;
}


private net.minecraft.util.MovingObjectPosition a(com.moon.n4 p0) {
java.lang.Object local2 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.gy.a)).K)).b(((float)(0x1.0p0f)));
    java.lang.Object local3 = com.moon.nI.a__DR(((float)(((com.moon.n4)(p0)).a__Float())), ((float)(((com.moon.n4)(p0)).b__Float())));
    java.lang.Object local4 = ((moom.DR)(local2)).d(((moom.DR)(((moom.DR)(local3)).c(((float)(((moom.jI)(((net.minecraft.client.Minecraft)(com.moon.gy.a)).F)).a()))))));
    return ((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(com.moon.gy.a)).I)).a(((moom.DR)(local2)), ((moom.DR)(local4)), ((boolean)(false)));
}


private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
