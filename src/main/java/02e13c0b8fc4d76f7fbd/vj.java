package moom;


class vj extends moom.uc {

private final net.minecraft.entity.monster.EntitySlime c;

private int d;

private static final long e;

private static final long f;

public vj(net.minecraft.entity.monster.EntitySlime p0) {
super();
    this.c = p0;
    (this).a(2);
}


static {
e = ((long)(((moom._a)(moom._c.a(((long)(3428432974496654408L)), ((long)(8563650900602042601L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(211171063135706L)))));
    long local0_life6 = (moom.vj.e ^ 21513129343645L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill1077_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1077_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1077_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1077_13 = new byte[8];
    (__sourceSpill1077_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill1077_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation1077_15 = __sourceSpill1077_13;
    ((javax.crypto.Cipher)(__sourceSpill1077_10)).init(((int)(__sourceSpill1077_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1077_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1077_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = 7779967166093818705L;
    byte[] __sourceSpill1077_19 = new byte[8];
    (__sourceSpill1077_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill1077_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill1077_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill1077_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill1077_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill1077_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill1077_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill1077_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill1077_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill1077_20)).doFinal(((byte[])(__sourceSpill1077_19)));
    f = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


public boolean b__Boolean() {
net.minecraft.entity.EntityLivingBase forwardValue4326_15_0;
    int forwardValue4326_21_0;
    int forwardValue4326_38_0;
    int forwardValue4326_42_0;
    int forwardValue4326_44_0;
    net.minecraft.entity.Entity[] spill4326_0;
    net.minecraft.entity.EntityLivingBase spill4326_1;
    boolean spill4326_2;
    boolean spill4326_3;
    int spill4326_4;
    long life1_3;
    net.minecraft.entity.EntityLivingBase life4_8;
    net.minecraft.entity.Entity[] life3_9;
    forward_join_44: {
    forward_join_43: {
    forward_join_42: {
    forward_join_38: {
    forward_join_31: {
    forward_join_21: {
    forward_join_15: {
    life1_3 = (moom.vj.e ^ 3605471862375L);
    spill4326_0 = moom.vN.b();
    life4_8 = ((net.minecraft.entity.monster.EntitySlime)(this.c)).d__sourceReturn_d30556f370();
    life3_9 = spill4326_0;
    spill4326_1 = life4_8;
    if (!((life3_9 == null))) {
        forwardValue4326_15_0 = spill4326_1;
        break forward_join_15;
    }
    if (!((spill4326_1 != null))) {
        break forward_join_43;
    }
    forwardValue4326_15_0 = life4_8;
    }
    spill4326_2 = ((net.minecraft.entity.EntityLivingBase)(forwardValue4326_15_0)).p__Boolean();
    if (!((life3_9 == null))) {
        forwardValue4326_21_0 = ((spill4326_2) ? 1 : 0);
        break forward_join_21;
    }
    if (!(spill4326_2)) {
        break forward_join_43;
    }
    forwardValue4326_21_0 = ((life4_8 instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0);
    }
    if (!((life3_9 == null))) {
        forwardValue4326_38_0 = forwardValue4326_21_0;
        break forward_join_38;
    }
    if (!((forwardValue4326_21_0 != 0))) {
        break forward_join_31;
    }
    spill4326_3 = ((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.entity.player.EntityPlayer)(life4_8)))).b1)).a;
    if (!((life3_9 == null))) {
        forwardValue4326_38_0 = ((spill4326_3) ? 1 : 0);
        break forward_join_38;
    }
    if (!((!spill4326_3))) {
        break forward_join_43;
    }
    }
    moom.vj __stackOp4326_11_0 = this;
    moom.vj __stackOp4326_13_0 = __stackOp4326_11_0;
    int __stackOp4326_13_1 = (((moom.vj)(__stackOp4326_11_0)).d - 1);
    spill4326_4 = __stackOp4326_13_1;
    ((moom.vj)(__stackOp4326_13_0)).d = ((int)(__stackOp4326_13_1));
    forwardValue4326_38_0 = spill4326_4;
    }
    if (!((life3_9 == null))) {
        forwardValue4326_42_0 = forwardValue4326_38_0;
        break forward_join_42;
    }
    if (!((forwardValue4326_38_0 > 0))) {
        break forward_join_43;
    }
    forwardValue4326_42_0 = 1;
    }
    forwardValue4326_44_0 = forwardValue4326_42_0;
    break forward_join_44;
    }
    forwardValue4326_44_0 = 0;
    }
    return ((forwardValue4326_44_0) != 0);
}


public void c() {
((net.minecraft.entity.monster.EntitySlime)(this.c)).a(((net.minecraft.entity.Entity)(((net.minecraft.entity.monster.EntitySlime)(this.c)).d__sourceReturn_d30556f370())), ((float)(0x1.4p3f)), ((float)(0x1.4p3f)));
    ((moom.vx)(((moom.vx)(((net.minecraft.entity.monster.EntitySlime)(this.c)).a__vu())))).a(((float)(((net.minecraft.entity.monster.EntitySlime)(this.c)).w)), ((boolean)(((net.minecraft.entity.monster.EntitySlime)(this.c)).Y())));
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public boolean a__Boolean() {
net.minecraft.entity.EntityLivingBase forwardValue4325_15_0;
    int forwardValue4325_21_0;
    int forwardValue4325_32_0;
    int forwardValue4325_34_0;
    net.minecraft.entity.Entity[] spill4325_0;
    net.minecraft.entity.EntityLivingBase spill4325_1;
    boolean spill4325_2;
    boolean spill4325_3;
    long life1_3;
    net.minecraft.entity.EntityLivingBase life4_8;
    net.minecraft.entity.Entity[] life3_9;
    forward_join_34: {
    forward_join_33: {
    forward_join_32: {
    forward_join_31: {
    forward_join_21: {
    forward_join_15: {
    life1_3 = (moom.vj.e ^ 118695827371766L);
    spill4325_0 = moom.vN.b();
    life4_8 = ((net.minecraft.entity.monster.EntitySlime)(this.c)).d__sourceReturn_d30556f370();
    life3_9 = spill4325_0;
    spill4325_1 = life4_8;
    if (!((life3_9 == null))) {
        forwardValue4325_15_0 = spill4325_1;
        break forward_join_15;
    }
    if (!((spill4325_1 != null))) {
        break forward_join_33;
    }
    forwardValue4325_15_0 = life4_8;
    }
    spill4325_2 = ((net.minecraft.entity.EntityLivingBase)(forwardValue4325_15_0)).p__Boolean();
    if (!((life3_9 == null))) {
        forwardValue4325_21_0 = ((spill4325_2) ? 1 : 0);
        break forward_join_21;
    }
    if (!(spill4325_2)) {
        break forward_join_33;
    }
    forwardValue4325_21_0 = ((life4_8 instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0);
    }
    if (!((life3_9 == null))) {
        forwardValue4325_32_0 = forwardValue4325_21_0;
        break forward_join_32;
    }
    if (!((forwardValue4325_21_0 != 0))) {
        break forward_join_31;
    }
    spill4325_3 = ((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.entity.player.EntityPlayer)(life4_8)))).b1)).a;
    if (!((life3_9 == null))) {
        forwardValue4325_32_0 = ((spill4325_3) ? 1 : 0);
        break forward_join_32;
    }
    if (!((!spill4325_3))) {
        break forward_join_33;
    }
    }
    forwardValue4325_32_0 = 1;
    }
    forwardValue4325_34_0 = forwardValue4325_32_0;
    break forward_join_34;
    }
    forwardValue4325_34_0 = 0;
    }
    return ((forwardValue4325_34_0) != 0);
}


public void a__Void() {
long local1 = (moom.vj.e ^ 120776517668554L);
    this.d = ((int)(((int) moom.vj.f)));
    super.a__Void();
    return;
}

}
