package moom;


public class tT extends net.minecraft.entity.projectile.EntityThrowable {

private net.minecraft.entity.EntityLivingBase aO;

private static final long bb;

private static final long hb;

public tT(net.minecraft.world.World p0, double p1, double p2, double p3) {
super(p0, p1, p2, p3);
}


public tT(net.minecraft.world.World p0, net.minecraft.entity.EntityLivingBase p1) {
super(p0, p1);
    this.aO = p1;
}


public tT(net.minecraft.world.World p0) {
super(p0);
}


static {
bb = ((long)(((moom._a)(moom._c.a(((long)(-4529370376192339745L)), ((long)(5291845679846176841L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(202163084210102L)))));
    long local0_life6 = (moom.tT.bb ^ 66799173251802L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill1029_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1029_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1029_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1029_13 = new byte[8];
    (__sourceSpill1029_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill1029_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation1029_15 = __sourceSpill1029_13;
    ((javax.crypto.Cipher)(__sourceSpill1029_10)).init(((int)(__sourceSpill1029_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1029_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1029_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = 9031332433480607699L;
    byte[] __sourceSpill1029_19 = new byte[8];
    (__sourceSpill1029_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill1029_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill1029_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill1029_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill1029_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill1029_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill1029_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill1029_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill1029_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill1029_20)).doFinal(((byte[])(__sourceSpill1029_19)));
    hb = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


protected void a(net.minecraft.util.MovingObjectPosition p0) {
net.minecraft.entity.Entity lexicalValue1313_16_0;
    net.minecraft.entity.Entity lexicalValue1313_25_0;
    moom.tT lexicalValue1313_25_1;
    int lexicalValue1313_76_0;
    net.minecraft.entity.player.EntityPlayerMP lexicalValue1313_88_0;
    net.minecraft.entity.player.EntityPlayerMP lexicalValue1313_95_0;
    int lexicalValue1313_104_0;
    int lexicalValue1313_143_0;
    int lexicalValue1313_164_0;
    net.minecraft.entity.EntityLivingBase lexicalValue1313_167_0;
    net.minecraft.entity.EntityLivingBase lexicalValue1313_179_0;
    int spill1313_0;
    net.minecraft.entity.Entity spill1313_1;
    moom.tT spill1313_2;
    boolean spill1313_3;
    net.minecraft.entity.EntityLivingBase spill1313_4;
    net.minecraft.entity.player.EntityPlayerMP spill1313_5;
    boolean spill1313_6;
    boolean spill1313_7;
    long life2_3;
    net.minecraft.entity.EntityLivingBase life5_7;
    int life4_8;
    int life6_42;
    net.minecraft.entity.player.EntityPlayerMP life6_102;
    net.minecraft.entity.monster.EntityEndermite life7_170;
    lexical_join_183: {
    lexical_join_181: {
    lexical_join_179: {
    lexical_join_167: {
    lexical_join_166: {
    lexical_join_164: {
    lexical_join_149: {
    lexical_join_143: {
    lexical_join_141: {
    lexical_join_104: {
    lexical_join_95: {
    lexical_join_88: {
    lexical_join_76: {
    lexical_join_66: {
    lexical_join_30: {
    lexical_join_25: {
    lexical_join_22: {
    lexical_join_16: {
    life2_3 = (moom.tT.bb ^ 118985860104326L);
    spill1313_0 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.c();
    life5_7 = ((moom.tT)(this)).a__sG();
    life4_8 = spill1313_0;
    spill1313_1 = ((net.minecraft.util.MovingObjectPosition)(p0)).e;
    if (!((life4_8 == 0))) {
        lexicalValue1313_16_0 = spill1313_1;
        break lexical_join_16;
    }
    if (!((spill1313_1 != null))) {
        break lexical_join_30;
    }
    lexicalValue1313_16_0 = ((net.minecraft.util.MovingObjectPosition)(p0)).e;
    }
    spill1313_2 = this;
    if (!((life4_8 == 0))) {
        lexicalValue1313_25_0 = lexicalValue1313_16_0;
        lexicalValue1313_25_1 = spill1313_2;
        break lexical_join_25;
    }
    if (!((lexicalValue1313_16_0 == ((moom.tT)(spill1313_2)).aO))) {
        break lexical_join_22;
    }
    return;
    }
    lexicalValue1313_25_0 = ((net.minecraft.util.MovingObjectPosition)(p0)).e;
    lexicalValue1313_25_1 = this;
    }
    ((net.minecraft.entity.Entity)(lexicalValue1313_25_0)).a__Boolean(((net.minecraft.util.DamageSource)(net.minecraft.util.DamageSource.a(((net.minecraft.entity.Entity)(lexicalValue1313_25_1)), ((net.minecraft.entity.Entity)(life5_7))))), ((float)(0x0.0p0f)));
    }
    life6_42 = 0;
    lexical_cycle_32: while (true) {
    if (!((life6_42 < ((int) moom.tT.hb)))) {
        break lexical_join_66;
    }
    ((net.minecraft.world.World)(((moom.tT)(this)).i)).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.PORTAL)), ((double)(((moom.tT)(this)).n)), ((double)((((moom.tT)(this)).o + (((java.util.Random)(((moom.tT)(this)).ah)).nextDouble() * 0x1.0p1d)))), ((double)(((moom.tT)(this)).p)), ((double)(((java.util.Random)(((moom.tT)(this)).ah)).nextGaussian())), ((double)(0x0.0p0d)), ((double)(((java.util.Random)(((moom.tT)(this)).ah)).nextGaussian())), ((int[])(new int[0])));
    life6_42 += 1;
    if (!((life4_8 == 0))) {
        break lexical_join_183;
    }
    if (!((life4_8 != 0))) { continue lexical_cycle_32; }
    break lexical_cycle_32;
    }
    }
    spill1313_3 = ((net.minecraft.world.World)(((moom.tT)(this)).i)).G;
    if (!((life4_8 == 0))) {
        lexicalValue1313_76_0 = ((spill1313_3) ? 1 : 0);
        break lexical_join_76;
    }
    if (!((!spill1313_3))) {
        break lexical_join_183;
    }
    spill1313_4 = life5_7;
    if (!((life4_8 == 0))) {
        lexicalValue1313_167_0 = spill1313_4;
        break lexical_join_167;
    }
    lexicalValue1313_76_0 = ((spill1313_4 instanceof net.minecraft.entity.player.EntityPlayerMP) ? 1 : 0);
    }
    if (!((lexicalValue1313_76_0 != 0))) {
        break lexical_join_166;
    }
    life6_102 = ((net.minecraft.entity.player.EntityPlayerMP)(life5_7));
    spill1313_5 = life6_102;
    if (!((life4_8 == 0))) {
        lexicalValue1313_88_0 = spill1313_5;
        break lexical_join_88;
    }
    if (!(((net.minecraft.network.NetworkManager)(((net.minecraft.network.NetHandlerPlayServer)(((net.minecraft.entity.player.EntityPlayerMP)(spill1313_5)).cg)).a__r())).c__Boolean())) {
        break lexical_join_181;
    }
    lexicalValue1313_88_0 = life6_102;
    }
    if (!((life4_8 == 0))) {
        lexicalValue1313_95_0 = lexicalValue1313_88_0;
        break lexical_join_95;
    }
    if (!((((net.minecraft.entity.player.EntityPlayerMP)(lexicalValue1313_88_0)).i == ((moom.tT)(this)).i))) {
        break lexical_join_181;
    }
    lexicalValue1313_95_0 = life6_102;
    }
    spill1313_6 = ((net.minecraft.entity.player.EntityPlayerMP)(lexicalValue1313_95_0)).K__Boolean();
    if (!((life4_8 == 0))) {
        lexicalValue1313_104_0 = ((spill1313_6) ? 1 : 0);
        break lexical_join_104;
    }
    if (!((!spill1313_6))) {
        break lexical_join_181;
    }
    lexicalValue1313_104_0 = recovery.source.CarrierOps.fcmpg(((float)(((java.util.Random)(((moom.tT)(this)).ah)).nextFloat())), ((float)(0x1.99999ap-5f)));
    }
    if (!((life4_8 == 0))) {
        lexicalValue1313_143_0 = lexicalValue1313_104_0;
        break lexical_join_143;
    }
    if (!((lexicalValue1313_104_0 < 0))) {
        break lexical_join_141;
    }
    spill1313_7 = ((net.minecraft.world.GameRules)(((net.minecraft.world.World)(((moom.tT)(this)).i)).a__Ej())).a__Boolean(((java.lang.String)("doMobSpawning")));
    if (!((life4_8 == 0))) {
        lexicalValue1313_143_0 = ((spill1313_7) ? 1 : 0);
        break lexical_join_143;
    }
    if (!(spill1313_7)) {
        break lexical_join_141;
    }
    life7_170 = new net.minecraft.entity.monster.EntityEndermite(((moom.tT)(this)).i);
    ((net.minecraft.entity.monster.EntityEndermite)(life7_170)).l(((boolean)(true)));
    ((net.minecraft.entity.monster.EntityEndermite)(life7_170)).c(((double)(((net.minecraft.entity.EntityLivingBase)(life5_7)).n)), ((double)(((net.minecraft.entity.EntityLivingBase)(life5_7)).o)), ((double)(((net.minecraft.entity.EntityLivingBase)(life5_7)).p)), ((float)(((net.minecraft.entity.EntityLivingBase)(life5_7)).w)), ((float)(((net.minecraft.entity.EntityLivingBase)(life5_7)).x)));
    ((net.minecraft.world.World)(((moom.tT)(this)).i)).b__Boolean(((net.minecraft.entity.Entity)(life7_170)));
    }
    lexicalValue1313_143_0 = ((((net.minecraft.entity.EntityLivingBase)(life5_7)).s__Boolean()) ? 1 : 0);
    }
    if (!((life4_8 == 0))) {
        lexicalValue1313_164_0 = lexicalValue1313_143_0;
        break lexical_join_164;
    }
    if (!((lexicalValue1313_143_0 != 0))) {
        break lexical_join_149;
    }
    ((net.minecraft.entity.EntityLivingBase)(life5_7)).b(((net.minecraft.entity.Entity)(null)));
    }
    ((net.minecraft.entity.EntityLivingBase)(life5_7)).e(((double)(((moom.tT)(this)).n)), ((double)(((moom.tT)(this)).o)), ((double)(((moom.tT)(this)).p)));
    ((net.minecraft.entity.EntityLivingBase)(life5_7)).L = ((float)(0x0.0p0f));
    lexicalValue1313_164_0 = ((((net.minecraft.entity.EntityLivingBase)(life5_7)).a__Boolean(((net.minecraft.util.DamageSource)(net.minecraft.util.DamageSource.i)), ((float)(0x1.4p2f)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(lexicalValue1313_164_0);
    break lexical_join_181;
    }
    lexicalValue1313_167_0 = life5_7;
    }
    if (!((life4_8 == 0))) {
        lexicalValue1313_179_0 = lexicalValue1313_167_0;
        break lexical_join_179;
    }
    if (!((lexicalValue1313_167_0 != null))) {
        break lexical_join_181;
    }
    ((net.minecraft.entity.EntityLivingBase)(life5_7)).e(((double)(((moom.tT)(this)).n)), ((double)(((moom.tT)(this)).o)), ((double)(((moom.tT)(this)).p)));
    lexicalValue1313_179_0 = life5_7;
    }
    ((net.minecraft.entity.EntityLivingBase)(lexicalValue1313_179_0)).L = ((float)(0x0.0p0f));
    }
    ((moom.tT)(this)).f__Void();
    }
    return;
}


public void g__Void() {
int forwardValue4071_16_0;
    int spill4071_0;
    int spill4071_1;
    long life1_3;
    net.minecraft.entity.EntityLivingBase life4_7;
    int life3_8;
    forward_join_23: {
    forward_join_21: {
    forward_join_16: {
    life1_3 = (moom.tT.bb ^ 32461054775391L);
    spill4071_0 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.c();
    life4_7 = ((moom.tT)(this)).a__sG();
    life3_8 = spill4071_0;
    spill4071_1 = ((life4_7 instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0);
    if (!((life3_8 == 0))) {
        forwardValue4071_16_0 = spill4071_1;
        break forward_join_16;
    }
    if (!((spill4071_1 != 0))) {
        break forward_join_21;
    }
    forwardValue4071_16_0 = ((((net.minecraft.entity.EntityLivingBase)(life4_7)).p__Boolean()) ? 1 : 0);
    }
    if (!((forwardValue4071_16_0 == 0))) {
        break forward_join_21;
    }
    ((moom.tT)(this)).f__Void();
    if (!((life3_8 != 0))) {
        break forward_join_23;
    }
    }
    super.g__Void();
    }
    return;
}

}
