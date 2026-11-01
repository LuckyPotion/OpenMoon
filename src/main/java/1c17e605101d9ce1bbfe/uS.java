package moom;


public class uS extends moom.uR {

net.minecraft.entity.monster.EntityIronGolem i;

net.minecraft.entity.EntityLivingBase j;

private static final long k;

private static final long l;

public uS(net.minecraft.entity.monster.EntityIronGolem p0) {
super(p0, false, true);
    this.i = p0;
    (this).a(1);
}


static {
k = ((long)(((moom._a)(moom._c.a(((long)(2016039638034193589L)), ((long)(-632983439440314535L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(23943518392241L)))));
    long local0_life6 = (moom.uS.k ^ 4432577113582L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill1050_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1050_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1050_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1050_13 = new byte[8];
    (__sourceSpill1050_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill1050_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation1050_15 = __sourceSpill1050_13;
    ((javax.crypto.Cipher)(__sourceSpill1050_10)).init(((int)(__sourceSpill1050_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1050_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1050_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -8933594104667942013L;
    byte[] __sourceSpill1050_19 = new byte[8];
    (__sourceSpill1050_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill1050_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill1050_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill1050_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill1050_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill1050_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill1050_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill1050_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill1050_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill1050_20)).doFinal(((byte[])(__sourceSpill1050_19)));
    l = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public boolean a__Boolean() {
int forwardValue4182_35_0;
    int forwardValue4182_60_0;
    int forwardValue4182_62_0;
    boolean spill4182_0;
    int spill4182_1;
    int spill4182_2;
    long life1_3;
    net.minecraft.village.Village life4_8;
    int life3_9;
    forward_join_62: {
    forward_join_61: {
    forward_join_60: {
    forward_join_59: {
    forward_join_35: {
    forward_join_30: {
    forward_join_22: {
    forward_join_16: {
    life1_3 = (moom.uS.k ^ 19798927149643L);
    spill4182_0 = moom.uc.d();
    life4_8 = ((net.minecraft.entity.monster.EntityIronGolem)(this.i)).a__sourceReturn_0a84fc465b();
    life3_9 = ((spill4182_0) ? 1 : 0);
    if (!((life3_9 != 0))) {
        break forward_join_22;
    }
    if (!((life4_8 == null))) {
        break forward_join_16;
    }
    return ((0) != 0);
    }
    this.j = ((net.minecraft.entity.EntityLivingBase)(((net.minecraft.village.Village)(life4_8)).a(((net.minecraft.entity.EntityLivingBase)(this.i)))));
    }
    spill4182_1 = ((this.j instanceof net.minecraft.entity.monster.EntityCreeper) ? 1 : 0);
    if (!((life3_9 != 0))) {
        forwardValue4182_35_0 = spill4182_1;
        break forward_join_35;
    }
    if (!((spill4182_1 != 0))) {
        break forward_join_30;
    }
    return ((0) != 0);
    }
    forwardValue4182_35_0 = ((((moom.uS)(this)).a(((net.minecraft.entity.EntityLivingBase)(this.j)), ((boolean)(false)))) ? 1 : 0);
    }
    if (!((life3_9 != 0))) {
        forwardValue4182_62_0 = forwardValue4182_35_0;
        break forward_join_62;
    }
    if (!((forwardValue4182_35_0 == 0))) {
        break forward_join_61;
    }
    spill4182_2 = ((java.util.Random)(((moom.sI)(((moom.uS)(this)).c)).a__Random())).nextInt(((int)(((int) moom.uS.l))));
    if (!((life3_9 != 0))) {
        forwardValue4182_60_0 = spill4182_2;
        break forward_join_60;
    }
    if (!((spill4182_2 == 0))) {
        break forward_join_59;
    }
    this.j = ((net.minecraft.entity.EntityLivingBase)(((net.minecraft.village.Village)(life4_8)).a__tn(((net.minecraft.entity.EntityLivingBase)(this.i)))));
    return ((moom.uS)(this)).a(((net.minecraft.entity.EntityLivingBase)(this.j)), ((boolean)(false)));
    }
    forwardValue4182_60_0 = 0;
    }
    return ((forwardValue4182_60_0) != 0);
    }
    forwardValue4182_62_0 = 1;
    }
    return ((forwardValue4182_62_0) != 0);
}


public void a__Void() {
((net.minecraft.entity.monster.EntityIronGolem)(this.i)).c(((net.minecraft.entity.EntityLivingBase)(this.j)));
    super.a__Void();
    return;
}

}
