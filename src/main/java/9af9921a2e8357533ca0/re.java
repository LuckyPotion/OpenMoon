package moom;


public abstract class re extends moom.rd {

private static final long f;

private static final long j;

public re() {
super();
}


static {
f = ((long)(((moom._a)(moom._c.a(((long)(-5912690157222850744L)), ((long)(6414283937093732969L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(147204167040080L)))));
    long local0_life6 = (moom.re.f ^ 52446238445032L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill998_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill998_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill998_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill998_13 = new byte[8];
    (__sourceSpill998_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill998_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation998_15 = __sourceSpill998_13;
    ((javax.crypto.Cipher)(__sourceSpill998_10)).init(((int)(__sourceSpill998_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill998_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation998_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -4920249711289967017L;
    byte[] __sourceSpill998_19 = new byte[8];
    (__sourceSpill998_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill998_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill998_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill998_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill998_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill998_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill998_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill998_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill998_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill998_20)).doFinal(((byte[])(__sourceSpill998_19)));
    j = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


protected float b__sourceReturn_bc607678b6() {
return 0x1.19999ap0f;
}


public net.minecraft.item.ItemStack b(moom.ry p0, net.minecraft.item.ItemStack p1) {
long life3_3;
    net.minecraft.world.World life6_6;
    moom.rB life7_9;
    moom.bs life8_14;
    net.minecraft.entity.IProjectile life9_19;
    java.lang.String life5_47;
    life3_3 = (moom.re.f ^ 4445242173608L);
    life6_6 = ((moom.ry)(p0)).a__Eu();
    life7_9 = __sourceExactCall_e9ee1d28afa18d(((moom.ry)(p0)));
    java.lang.String spill7285_0 = moom.rd.b();
    life8_14 = __sourceExactCall_b9f266c58b58a2(((int)(((moom.ry)(p0)).a__Int())));
    life9_19 = ((moom.re)(this)).a(((net.minecraft.world.World)(life6_6)), ((moom.rB)(life7_9)));
    ((net.minecraft.entity.IProjectile)(life9_19)).a(((double)(((double) ((moom.bs)(life8_14)).c()))), ((double)(((double) (((float) ((moom.bs)(life8_14)).d()) + 0x1.99999ap-4f)))), ((double)(((double) ((moom.bs)(life8_14)).e()))), ((float)(((moom.re)(this)).b__sourceReturn_bc607678b6())), ((float)(((moom.re)(this)).a())));
    ((net.minecraft.world.World)(life6_6)).b__Boolean(((net.minecraft.entity.Entity)(((net.minecraft.entity.Entity)(life9_19)))));
    ((net.minecraft.item.ItemStack)(p1)).a(((int)(1)));
    life5_47 = spill7285_0;
    net.minecraft.item.ItemStack spill7285_1 = p1;
    if ((net.minecraft.entity.Entity.b__ArrayString() != null)) {
        moom.rd.b(((java.lang.String)("F3yjd")));
    }
    return spill7285_1;
}


protected float a() {
return 0x1.8p2f;
}


protected abstract net.minecraft.entity.IProjectile a(net.minecraft.world.World p0, moom.rB p1);

protected void a(moom.ry p0) {
long local2 = (moom.re.f ^ 17121134478262L);
    ((net.minecraft.world.World)(((moom.ry)(p0)).a__Eu())).b(((int)(((int) moom.re.j))), ((moom.DT)(((moom.ry)(p0)).a__DT())), ((int)(0)));
    return;
}


private static native moom.rB __sourceExactCall_e9ee1d28afa18d(moom.ry p0);
private static native moom.bs __sourceExactCall_b9f266c58b58a2(int p0);
}
