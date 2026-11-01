package moom;


public class wS extends net.minecraft.item.Item {

private static final long n;

private static final long o;

public wS() {
super();
    (this).a(net.minecraft.creativetab.CreativeTabs.c);
}


static {
n = ((long)(((moom._a)(moom._c.a(((long)(8674952806301721525L)), ((long)(858669175297315116L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(11994451295918L)))));
    long local0_life6 = (moom.wS.n ^ 26634882347241L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill1087_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1087_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1087_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1087_13 = new byte[8];
    (__sourceSpill1087_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill1087_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation1087_15 = __sourceSpill1087_13;
    ((javax.crypto.Cipher)(__sourceSpill1087_10)).init(((int)(__sourceSpill1087_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1087_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1087_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = 1947822075313219455L;
    byte[] __sourceSpill1087_19 = new byte[8];
    (__sourceSpill1087_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill1087_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill1087_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill1087_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill1087_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill1087_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill1087_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill1087_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill1087_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill1087_20)).doFinal(((byte[])(__sourceSpill1087_19)));
    o = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private void a(net.minecraft.entity.item.EntityArmorStand p0, java.util.Random p1) {
net.minecraft.util.Rotations local3 = ((net.minecraft.entity.item.EntityArmorStand)(p0)).a__sourceReturn_6a331ccf0b();
    float local4 = (((java.util.Random)(p1)).nextFloat() * 0x1.4p2f);
    float local5 = ((((java.util.Random)(p1)).nextFloat() * 0x1.4p4f) - 0x1.4p3f);
    net.minecraft.util.Rotations local6 = new net.minecraft.util.Rotations((((net.minecraft.util.Rotations)(local3)).a() + local4), (((net.minecraft.util.Rotations)(local3)).b() + local5), ((net.minecraft.util.Rotations)(local3)).c());
    ((net.minecraft.entity.item.EntityArmorStand)(p0)).a(((net.minecraft.util.Rotations)(local6)));
    local3 = ((net.minecraft.entity.item.EntityArmorStand)(p0)).b__sourceReturn_6a331ccf0b();
    local4 = ((((java.util.Random)(p1)).nextFloat() * 0x1.4p3f) - 0x1.4p2f);
    local6 = new net.minecraft.util.Rotations(((net.minecraft.util.Rotations)(local3)).a(), (((net.minecraft.util.Rotations)(local3)).b() + local4), ((net.minecraft.util.Rotations)(local3)).c());
    ((net.minecraft.entity.item.EntityArmorStand)(p0)).b(((net.minecraft.util.Rotations)(local6)));
    return;
}


public boolean a(net.minecraft.item.ItemStack p0, net.minecraft.entity.player.EntityPlayer p1, net.minecraft.world.World p2, moom.DT p3, moom.bs p4, float p5, float p6, float p7) {
moom.DT forwardValue4377_26_0;
    int forwardValue4377_36_0;
    int forwardValue4377_53_0;
    int forwardValue4377_57_0;
    int forwardValue4377_59_0;
    int forwardValue4377_74_0;
    int forwardValue4377_74_1;
    int forwardValue4377_78_0;
    int forwardValue4377_78_1;
    int forwardValue4377_79_0;
    int forwardValue4377_80_0;
    int forwardValue4377_80_1;
    int forwardValue4377_90_0;
    int forwardValue4377_126_0;
    net.minecraft.nbt.NBTTagCompound forwardValue4377_187_0;
    int forwardValue4377_213_0;
    int forwardValue4377_221_0;
    boolean spill4377_0;
    boolean spill4377_1;
    int spill4377_2;
    boolean spill4377_3;
    int spill4377_4;
    int spill4377_5;
    net.minecraft.nbt.NBTTagCompound spill4377_6;
    boolean spill4377_7;
    long life9_3;
    int life11_5;
    int life12_20;
    moom.DT life13_30;
    moom.DT life14_46;
    int life15_75;
    int life15_106;
    double life16_121;
    double life18_125;
    double life20_129;
    java.util.List life22_146;
    net.minecraft.entity.item.EntityArmorStand life23_186;
    float life24_200;
    net.minecraft.nbt.NBTTagCompound life25_219;
    net.minecraft.nbt.NBTTagCompound life26_241;
    forward_join_221: {
    forward_join_214: {
    forward_join_213: {
    forward_join_210: {
    forward_join_187: {
    forward_join_126: {
    forward_join_124: {
    forward_join_90: {
    forward_join_88: {
    forward_join_80: {
    forward_join_79: {
    forward_join_78: {
    forward_join_74: {
    forward_join_59: {
    forward_join_58: {
    forward_join_57: {
    forward_join_53: {
    forward_join_37: {
    forward_join_36: {
    forward_join_26: {
    forward_join_23: {
    forward_join_11: {
    life9_3 = (moom.wS.n ^ 115978940422992L);
    life11_5 = ((net.minecraft.item.ItemStack.m()) ? 1 : 0);
    if (!((p4 == moom.bs.DOWN))) {
        break forward_join_11;
    }
    return ((0) != 0);
    }
    life12_20 = ((((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p2)).a__fE(((moom.DT)(p3))))).a__ch())).a__Boolean(((net.minecraft.world.World)(p2)), ((moom.DT)(p3)))) ? 1 : 0);
    if (!((life12_20 != 0))) {
        break forward_join_23;
    }
    forwardValue4377_26_0 = p3;
    break forward_join_26;
    }
    forwardValue4377_26_0 = ((moom.DT)(p3)).a(((moom.bs)(p4)));
    }
    life13_30 = forwardValue4377_26_0;
    spill4377_0 = ((net.minecraft.entity.player.EntityPlayer)(p1)).a(((moom.DT)(life13_30)), ((moom.bs)(p4)), ((net.minecraft.item.ItemStack)(p0)));
    if (!((life11_5 != 0))) {
        forwardValue4377_36_0 = ((spill4377_0) ? 1 : 0);
        break forward_join_36;
    }
    if (!((!spill4377_0))) {
        break forward_join_37;
    }
    forwardValue4377_36_0 = 0;
    }
    return ((forwardValue4377_36_0) != 0);
    }
    life14_46 = ((moom.DT)(life13_30)).a__DT();
    spill4377_1 = ((net.minecraft.world.World)(p2)).a__Boolean(((moom.DT)(life13_30)));
    if (!((life11_5 != 0))) {
        forwardValue4377_53_0 = ((spill4377_1) ? 1 : 0);
        break forward_join_53;
    }
    if (!((!spill4377_1))) {
        break forward_join_58;
    }
    forwardValue4377_53_0 = ((((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p2)).a__fE(((moom.DT)(life13_30))))).a__ch())).a__Boolean(((net.minecraft.world.World)(p2)), ((moom.DT)(life13_30)))) ? 1 : 0);
    }
    if (!((life11_5 != 0))) {
        forwardValue4377_57_0 = forwardValue4377_53_0;
        break forward_join_57;
    }
    if (!((forwardValue4377_53_0 == 0))) {
        break forward_join_58;
    }
    forwardValue4377_57_0 = 1;
    }
    forwardValue4377_59_0 = forwardValue4377_57_0;
    break forward_join_59;
    }
    forwardValue4377_59_0 = 0;
    }
    life15_75 = forwardValue4377_59_0;
    spill4377_2 = life15_75;
    spill4377_3 = ((net.minecraft.world.World)(p2)).a__Boolean(((moom.DT)(life14_46)));
    if (!((life11_5 != 0))) {
        forwardValue4377_74_0 = spill4377_2;
        forwardValue4377_74_1 = ((spill4377_3) ? 1 : 0);
        break forward_join_74;
    }
    if (!((!spill4377_3))) {
        forwardValue4377_79_0 = spill4377_2;
        break forward_join_79;
    }
    forwardValue4377_74_0 = spill4377_2;
    forwardValue4377_74_1 = ((((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p2)).a__fE(((moom.DT)(life14_46))))).a__ch())).a__Boolean(((net.minecraft.world.World)(p2)), ((moom.DT)(life14_46)))) ? 1 : 0);
    }
    if (!((life11_5 != 0))) {
        forwardValue4377_78_0 = forwardValue4377_74_0;
        forwardValue4377_78_1 = forwardValue4377_74_1;
        break forward_join_78;
    }
    if (!((forwardValue4377_74_1 == 0))) {
        forwardValue4377_79_0 = forwardValue4377_74_0;
        break forward_join_79;
    }
    forwardValue4377_78_0 = forwardValue4377_74_0;
    forwardValue4377_78_1 = 1;
    }
    forwardValue4377_80_0 = forwardValue4377_78_0;
    forwardValue4377_80_1 = forwardValue4377_78_1;
    break forward_join_80;
    }
    forwardValue4377_80_0 = forwardValue4377_79_0;
    forwardValue4377_80_1 = 0;
    }
    life15_106 = (forwardValue4377_80_0 | forwardValue4377_80_1);
    spill4377_4 = life15_106;
    if (!((life11_5 != 0))) {
        forwardValue4377_90_0 = spill4377_4;
        break forward_join_90;
    }
    if (!((spill4377_4 != 0))) {
        break forward_join_88;
    }
    return ((0) != 0);
    }
    forwardValue4377_90_0 = ((moom.DT)(life13_30)).a();
    }
    life16_121 = ((double) forwardValue4377_90_0);
    life18_125 = ((double) ((moom.DT)(life13_30)).b());
    life20_129 = ((double) ((moom.DT)(life13_30)).c());
    life22_146 = ((net.minecraft.world.World)(p2)).b(((net.minecraft.entity.Entity)(null)), ((moom.CA)(moom.CA.a(((double)(life16_121)), ((double)(life18_125)), ((double)(life20_129)), ((double)((life16_121 + 0x1.0p0d))), ((double)((life18_125 + 0x1.0p1d))), ((double)((life20_129 + 0x1.0p0d)))))));
    spill4377_5 = ((java.util.List)(life22_146)).size();
    if (!((life11_5 != 0))) {
        forwardValue4377_126_0 = spill4377_5;
        break forward_join_126;
    }
    if (!((spill4377_5 > 0))) {
        break forward_join_124;
    }
    return ((0) != 0);
    }
    forwardValue4377_126_0 = ((((net.minecraft.world.World)(p2)).G) ? 1 : 0);
    }
    if (!((life11_5 != 0))) {
        forwardValue4377_221_0 = forwardValue4377_126_0;
        break forward_join_221;
    }
    if (!((forwardValue4377_126_0 == 0))) {
        break forward_join_214;
    }
    ((net.minecraft.world.World)(p2)).d__Boolean(((moom.DT)(life13_30)));
    ((net.minecraft.world.World)(p2)).d__Boolean(((moom.DT)(life14_46)));
    life23_186 = new net.minecraft.entity.item.EntityArmorStand(p2, (life16_121 + 0x1.0p-1d), life18_125, (life20_129 + 0x1.0p-1d));
    life24_200 = (((float) moom.Dr.a__Int(((float)(((moom.Dr.e(((float)((((net.minecraft.entity.player.EntityPlayer)(p1)).w - 0x1.68p7f)))) + 0x1.68p4f) / 0x1.68p5f))))) * 0x1.68p5f);
    ((net.minecraft.entity.item.EntityArmorStand)(life23_186)).c(((double)((life16_121 + 0x1.0p-1d))), ((double)(life18_125)), ((double)((life20_129 + 0x1.0p-1d))), ((float)(life24_200)), ((float)(0x0.0p0f)));
    ((moom.wS)(this)).a(((net.minecraft.entity.item.EntityArmorStand)(life23_186)), ((java.util.Random)(((net.minecraft.world.World)(p2)).u)));
    life25_219 = ((net.minecraft.item.ItemStack)(p0)).a__yw();
    spill4377_6 = life25_219;
    if (!((life11_5 != 0))) {
        forwardValue4377_187_0 = spill4377_6;
        break forward_join_187;
    }
    if (!((spill4377_6 != null))) {
        break forward_join_210;
    }
    forwardValue4377_187_0 = life25_219;
    }
    spill4377_7 = ((net.minecraft.nbt.NBTTagCompound)(forwardValue4377_187_0)).a__Boolean(((java.lang.String)("EntityTag")), ((int)(((int) moom.wS.o))));
    if (!((life11_5 != 0))) {
        forwardValue4377_213_0 = ((spill4377_7) ? 1 : 0);
        break forward_join_213;
    }
    if (!(spill4377_7)) {
        break forward_join_210;
    }
    life26_241 = new net.minecraft.nbt.NBTTagCompound();
    ((net.minecraft.entity.item.EntityArmorStand)(life23_186)).b__Boolean(((net.minecraft.nbt.NBTTagCompound)(life26_241)));
    ((net.minecraft.nbt.NBTTagCompound)(life26_241)).a(((net.minecraft.nbt.NBTTagCompound)(((net.minecraft.nbt.NBTTagCompound)(life25_219)).a__yw(((java.lang.String)("EntityTag"))))));
    ((net.minecraft.entity.item.EntityArmorStand)(life23_186)).b(((net.minecraft.nbt.NBTTagCompound)(life26_241)));
    }
    forwardValue4377_213_0 = ((((net.minecraft.world.World)(p2)).b__Boolean(((net.minecraft.entity.Entity)(life23_186)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue4377_213_0);
    }
    net.minecraft.item.ItemStack __stackOp4377_55_0 = p0;
    ((net.minecraft.item.ItemStack)(__stackOp4377_55_0)).b = ((int)((((net.minecraft.item.ItemStack)(__stackOp4377_55_0)).b - 1)));
    forwardValue4377_221_0 = 1;
    }
    return ((forwardValue4377_221_0) != 0);
}

}
