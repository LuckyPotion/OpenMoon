package moom;


public class tX extends net.minecraft.entity.projectile.EntityThrowable {

private static final long bb;

private static final long hb;

public tX(net.minecraft.world.World p0, double p1, double p2, double p3) {
super(p0, p1, p2, p3);
}


public tX(net.minecraft.world.World p0, net.minecraft.entity.EntityLivingBase p1) {
super(p0, p1);
}


public tX(net.minecraft.world.World p0) {
super(p0);
}


static {
bb = ((long)(((moom._a)(moom._c.a(((long)(1982597296423141813L)), ((long)(-6682809391493405091L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(109826802847856L)))));
    long local0_life6 = (moom.tX.bb ^ 115837723745552L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill1032_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1032_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1032_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1032_13 = new byte[8];
    (__sourceSpill1032_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill1032_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation1032_15 = __sourceSpill1032_13;
    ((javax.crypto.Cipher)(__sourceSpill1032_10)).init(((int)(__sourceSpill1032_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1032_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1032_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = 6991327534404960509L;
    byte[] __sourceSpill1032_19 = new byte[8];
    (__sourceSpill1032_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill1032_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill1032_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill1032_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill1032_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill1032_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill1032_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill1032_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill1032_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill1032_20)).doFinal(((byte[])(__sourceSpill1032_19)));
    hb = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


protected void a(net.minecraft.util.MovingObjectPosition p0) {
int lexicalValue1317_28_0;
    moom.tX lexicalValue1317_62_0;
    int spill1317_0;
    moom.tX spill1317_1;
    long life2_3;
    int[] life4_5;
    int life5_10;
    int life5_33;
    lexical_join_63: {
    lexical_join_62: {
    lexical_join_55: {
    lexical_join_29: {
    lexical_join_28: {
    lexical_join_19: {
    life2_3 = (moom.tX.bb ^ 34549183502974L);
    life4_5 = moom.h1.a__ArrayInt();
    if (!((((net.minecraft.util.MovingObjectPosition)(p0)).e != null))) {
        break lexical_join_29;
    }
    life5_10 = 0;
    spill1317_0 = ((((net.minecraft.util.MovingObjectPosition)(p0)).e instanceof net.minecraft.entity.monster.EntityBlaze) ? 1 : 0);
    if (!((life4_5 != null))) {
        lexicalValue1317_28_0 = spill1317_0;
        break lexical_join_28;
    }
    if (!((spill1317_0 != 0))) {
        break lexical_join_19;
    }
    life5_10 = 3;
    }
    lexicalValue1317_28_0 = ((((net.minecraft.entity.Entity)(((net.minecraft.util.MovingObjectPosition)(p0)).e)).a__Boolean(((net.minecraft.util.DamageSource)(net.minecraft.util.DamageSource.a(((net.minecraft.entity.Entity)(this)), ((net.minecraft.entity.Entity)(((moom.tX)(this)).a__sG()))))), ((float)(((float) life5_10))))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(lexicalValue1317_28_0);
    }
    life5_33 = 0;
    lexical_cycle_31: while (true) {
    if (!((life5_33 < ((int) moom.tX.hb)))) {
        break lexical_join_55;
    }
    ((net.minecraft.world.World)(((moom.tX)(this)).i)).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.SNOWBALL)), ((double)(((moom.tX)(this)).n)), ((double)(((moom.tX)(this)).o)), ((double)(((moom.tX)(this)).p)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((int[])(new int[0])));
    life5_33 += 1;
    if (!((life4_5 != null))) {
        break lexical_join_63;
    }
    if (!((life4_5 == null))) { continue lexical_cycle_31; }
    break lexical_cycle_31;
    }
    }
    spill1317_1 = this;
    if (!((life4_5 != null))) {
        lexicalValue1317_62_0 = spill1317_1;
        break lexical_join_62;
    }
    if (!((!((net.minecraft.world.World)(((moom.tX)(spill1317_1)).i)).G))) {
        break lexical_join_63;
    }
    lexicalValue1317_62_0 = this;
    }
    ((moom.tX)(lexicalValue1317_62_0)).f__Void();
    }
    return;
}

}
