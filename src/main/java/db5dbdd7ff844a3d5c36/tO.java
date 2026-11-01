package moom;


public class tO extends net.minecraft.entity.projectile.EntityFireball {

public int aP;

private static final long cb;

private static final long hb;

public tO(net.minecraft.world.World p0, net.minecraft.entity.EntityLivingBase p1, double p2, double p3, double p4) {
super(p0, p1, p2, p3, p4);
    this.aP = 1;
}


public tO(net.minecraft.world.World p0, double p1, double p2, double p3, double p4, double p5, double p6) {
super(p0, p1, p2, p3, p4, p5, p6);
    this.aP = 1;
}


public tO(net.minecraft.world.World p0) {
super(p0);
    this.aP = 1;
}


static {
cb = ((long)(((moom._a)(moom._c.a(((long)(-2894288991162334962L)), ((long)(371488138012310109L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(196517804134261L)))));
    long local0_life6 = (moom.tO.cb ^ 124859164812055L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill1028_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1028_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1028_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1028_13 = new byte[8];
    (__sourceSpill1028_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill1028_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation1028_15 = __sourceSpill1028_13;
    ((javax.crypto.Cipher)(__sourceSpill1028_10)).init(((int)(__sourceSpill1028_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1028_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1028_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = 5112980048491007835L;
    byte[] __sourceSpill1028_19 = new byte[8];
    (__sourceSpill1028_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill1028_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill1028_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill1028_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill1028_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill1028_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill1028_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill1028_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill1028_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill1028_20)).doFinal(((byte[])(__sourceSpill1028_19)));
    hb = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public void c(net.minecraft.nbt.NBTTagCompound p0) {
moom.tO forwardValue4063_19_0;
    net.minecraft.nbt.NBTTagCompound forwardValue4063_19_1;
    moom.tO spill4063_0;
    net.minecraft.nbt.NBTTagCompound spill4063_1;
    long life2_3;
    int[] life4_5;
    forward_join_22: {
    forward_join_19: {
    life2_3 = (moom.tO.cb ^ 103308658677671L);
    life4_5 = moom.h1.a__ArrayInt();
    spill4063_0 = this;
    spill4063_1 = p0;
    if (!((life4_5 != null))) {
        forwardValue4063_19_0 = spill4063_0;
        forwardValue4063_19_1 = spill4063_1;
        break forward_join_19;
    }
    __sourceIntrinsic_01f4e1cd062e_call4063_2(spill4063_0, spill4063_1);
    if (!(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Boolean(((java.lang.String)("ExplosionPower")), ((int)(((int) moom.tO.hb)))))) {
        break forward_join_22;
    }
    forwardValue4063_19_0 = this;
    forwardValue4063_19_1 = p0;
    }
    ((moom.tO)(forwardValue4063_19_0)).aP = ((int)(((net.minecraft.nbt.NBTTagCompound)(forwardValue4063_19_1)).a__Int(((java.lang.String)("ExplosionPower")))));
    }
    return;
}


public void d(net.minecraft.nbt.NBTTagCompound p0) {
super.d(((net.minecraft.nbt.NBTTagCompound)(p0)));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Void(((java.lang.String)("ExplosionPower")), ((int)(this.aP)));
    return;
}


protected void a(net.minecraft.util.MovingObjectPosition p0) {
net.minecraft.entity.Entity forwardValue4062_14_0;
    net.minecraft.entity.Entity forwardValue4062_19_0;
    moom.tO spill4062_0;
    long life2_3;
    int[] life4_5;
    int life5_49;
    forward_join_56: {
    forward_join_32: {
    forward_join_19: {
    forward_join_14: {
    life2_3 = (moom.tO.cb ^ 104956275089063L);
    life4_5 = moom.h1.a__ArrayInt();
    spill4062_0 = this;
    if (!((life4_5 != null))) {
        forwardValue4062_14_0 = spill4062_0;
        break forward_join_14;
    }
    if (!((!((net.minecraft.world.World)(((moom.tO)(spill4062_0)).i)).G))) {
        break forward_join_56;
    }
    forwardValue4062_14_0 = ((net.minecraft.util.MovingObjectPosition)(p0)).e;
    }
    if (!((life4_5 != null))) {
        forwardValue4062_19_0 = forwardValue4062_14_0;
        break forward_join_19;
    }
    if (!((forwardValue4062_14_0 != null))) {
        break forward_join_32;
    }
    forwardValue4062_19_0 = ((net.minecraft.util.MovingObjectPosition)(p0)).e;
    }
    ((net.minecraft.entity.Entity)(forwardValue4062_19_0)).a__Boolean(((net.minecraft.util.DamageSource)(net.minecraft.util.DamageSource.a(((net.minecraft.entity.projectile.EntityFireball)(this)), ((net.minecraft.entity.Entity)(this.aJ))))), ((float)(0x1.8p2f)));
    ((moom.tO)(this)).a(((net.minecraft.entity.EntityLivingBase)(this.aJ)), ((net.minecraft.entity.Entity)(((net.minecraft.util.MovingObjectPosition)(p0)).e)));
    }
    life5_49 = ((((net.minecraft.world.GameRules)(((net.minecraft.world.World)(this.i)).a__Ej())).a__Boolean(((java.lang.String)("mobGriefing")))) ? 1 : 0);
    ((net.minecraft.world.World)(this.i)).a(((net.minecraft.entity.Entity)(null)), ((double)(this.n)), ((double)(this.o)), ((double)(this.p)), ((float)(((float) this.aP))), ((boolean)__sourceIntrinsic_integerToBoolean((life5_49))), ((boolean)__sourceIntrinsic_integerToBoolean((life5_49))));
    ((moom.tO)(this)).f__Void();
    }
    return;
}


private static native <E extends Throwable> void __sourceIntrinsic_01f4e1cd062e_call4063_2(moom.tO a0, net.minecraft.nbt.NBTTagCompound a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
