package moom;


public class xO extends net.minecraft.item.Item {

private static long n;

private static long o;

public xO() { super(); }


private static void __sourceConstructorBody_16589f791fcf3a92(moom.xO receiver) throws Throwable {

long local1 = (moom.xO.n ^ 21039977766743L);

    moom.xO.__sourceConstructorInit_16589f791fcf3a92_0(((moom.xO)(receiver)));

    ((moom.xO)(receiver)).f = ((int)(((int) moom.xO.o)));

    ((moom.xO)(receiver)).a(((net.minecraft.creativetab.CreativeTabs)(net.minecraft.creativetab.CreativeTabs.f)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_16589f791fcf3a92_0(moom.xO a0) throws E;

static {
n = ((long)(((moom._a)(moom._c.a(((long)(-7463773521604457007L)), ((long)(-4543171885556582388L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(74984048442967L)))));
    long local0_life6 = (moom.xO.n ^ 7420932476040L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill1103_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1103_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1103_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1103_13 = new byte[8];
    (__sourceSpill1103_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill1103_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation1103_15 = __sourceSpill1103_13;
    ((javax.crypto.Cipher)(__sourceSpill1103_10)).init(((int)(__sourceSpill1103_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1103_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1103_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = 3293405214797330968L;
    byte[] __sourceSpill1103_19 = new byte[8];
    (__sourceSpill1103_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill1103_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill1103_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill1103_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill1103_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill1103_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill1103_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill1103_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill1103_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill1103_20)).doFinal(((byte[])(__sourceSpill1103_19)));
    o = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


public net.minecraft.item.ItemStack a(net.minecraft.item.ItemStack p0, net.minecraft.world.World p1, net.minecraft.entity.player.EntityPlayer p2) {
int forwardValue4495_35_0;
    boolean spill4495_0;
    long life4_3;
    int life6_5;
    forward_join_50: {
    forward_join_44: {
    forward_join_35: {
    forward_join_18: {
    life4_3 = (moom.xO.n ^ 8766990645091L);
    life6_5 = ((net.minecraft.item.ItemStack.l()) ? 1 : 0);
    spill4495_0 = ((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.entity.player.EntityPlayer)(p2)).b1)).d;
    if (!((life6_5 == 0))) {
        forwardValue4495_35_0 = ((spill4495_0) ? 1 : 0);
        break forward_join_35;
    }
    if (!((!spill4495_0))) {
        break forward_join_18;
    }
    net.minecraft.item.ItemStack __stackOp4495_6_0 = p0;
    ((net.minecraft.item.ItemStack)(__stackOp4495_6_0)).b = ((int)((((net.minecraft.item.ItemStack)(__stackOp4495_6_0)).b - 1)));
    }
    ((net.minecraft.world.World)(p1)).a(((net.minecraft.entity.Entity)(p2)), ((java.lang.String)("random.bow")), ((float)(0x1.0p-1f)), ((float)((0x1.99999ap-2f / ((((java.util.Random)(moom.xO.e)).nextFloat() * 0x1.99999ap-2f) + 0x1.99999ap-1f)))));
    if (!((life6_5 == 0))) {
        break forward_join_50;
    }
    forwardValue4495_35_0 = ((((net.minecraft.world.World)(p1)).G) ? 1 : 0);
    }
    if (!((forwardValue4495_35_0 == 0))) {
        break forward_join_44;
    }
    ((net.minecraft.world.World)(p1)).b__Boolean(((net.minecraft.entity.Entity)(new moom.tX(p1, p2))));
    }
    ((net.minecraft.entity.player.EntityPlayer)(p2)).a(((moom.BY)((net.minecraft.stats.StatList.ad)[net.minecraft.item.Item.a(((net.minecraft.item.Item)(this)))])));
    }
    return p0;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}

}
