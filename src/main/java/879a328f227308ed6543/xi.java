package moom;


public class xi extends net.minecraft.item.Item {

private static long n;

private static long o;

public xi() { super(); }


private static void __sourceConstructorBody_b4e22686a913f550(moom.xi receiver) throws Throwable {

long local1 = (moom.xi.n ^ 112891809392340L);

    moom.xi.__sourceConstructorInit_b4e22686a913f550_0(((moom.xi)(receiver)));

    ((moom.xi)(receiver)).f = ((int)(((int) moom.xi.o)));

    ((moom.xi)(receiver)).a(((net.minecraft.creativetab.CreativeTabs)(net.minecraft.creativetab.CreativeTabs.f)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_b4e22686a913f550_0(moom.xi a0) throws E;

static {
n = ((long)(((moom._a)(moom._c.a(((long)(7452570667849945334L)), ((long)(2336630206765620109L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(277936981911092L)))));
    long local0_life6 = (moom.xi.n ^ 99756282999133L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill1112_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1112_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1112_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1112_13 = new byte[8];
    (__sourceSpill1112_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill1112_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation1112_15 = __sourceSpill1112_13;
    ((javax.crypto.Cipher)(__sourceSpill1112_10)).init(((int)(__sourceSpill1112_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1112_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1112_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -5451516788968081174L;
    byte[] __sourceSpill1112_19 = new byte[8];
    (__sourceSpill1112_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill1112_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill1112_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill1112_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill1112_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill1112_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill1112_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill1112_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill1112_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill1112_20)).doFinal(((byte[])(__sourceSpill1112_19)));
    o = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


public net.minecraft.item.ItemStack a(net.minecraft.item.ItemStack p0, net.minecraft.world.World p1, net.minecraft.entity.player.EntityPlayer p2) {
int forwardValue4523_33_0;
    int forwardValue4523_43_0;
    boolean spill4523_0;
    long life4_3;
    int life6_5;
    forward_join_50: {
    forward_join_44: {
    forward_join_43: {
    forward_join_33: {
    life4_3 = (moom.xi.n ^ 110373273434376L);
    life6_5 = ((net.minecraft.item.ItemStack.l()) ? 1 : 0);
    spill4523_0 = ((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.entity.player.EntityPlayer)(p2)).b1)).d;
    if (!((life6_5 == 0))) {
        forwardValue4523_33_0 = ((spill4523_0) ? 1 : 0);
        break forward_join_33;
    }
    if (!((!spill4523_0))) {
        break forward_join_50;
    }
    net.minecraft.item.ItemStack __stackOp4523_6_0 = p0;
    ((net.minecraft.item.ItemStack)(__stackOp4523_6_0)).b = ((int)((((net.minecraft.item.ItemStack)(__stackOp4523_6_0)).b - 1)));
    ((net.minecraft.world.World)(p1)).a(((net.minecraft.entity.Entity)(p2)), ((java.lang.String)("random.bow")), ((float)(0x1.0p-1f)), ((float)((0x1.99999ap-2f / ((((java.util.Random)(moom.xi.e)).nextFloat() * 0x1.99999ap-2f) + 0x1.99999ap-1f)))));
    forwardValue4523_33_0 = ((((net.minecraft.world.World)(p1)).G) ? 1 : 0);
    }
    if (!((life6_5 == 0))) {
        forwardValue4523_43_0 = forwardValue4523_33_0;
        break forward_join_43;
    }
    if (!((forwardValue4523_33_0 == 0))) {
        break forward_join_44;
    }
    forwardValue4523_43_0 = ((((net.minecraft.world.World)(p1)).b__Boolean(((net.minecraft.entity.Entity)(new moom.tT(p1, p2))))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue4523_43_0);
    }
    ((net.minecraft.entity.player.EntityPlayer)(p2)).a(((moom.BY)((net.minecraft.stats.StatList.ad)[net.minecraft.item.Item.a(((net.minecraft.item.Item)(this)))])));
    }
    return p0;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}

}
