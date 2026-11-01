package moom;


public class xn extends net.minecraft.item.Item {

private static long n;

private static long o;

public xn() { super(); }


private static void __sourceConstructorBody_dc7bfbc0b6cb0584(moom.xn receiver) throws Throwable {

long local1 = (moom.xn.n ^ 129245603591892L);

    moom.xn.__sourceConstructorInit_dc7bfbc0b6cb0584_0(((moom.xn)(receiver)));

    ((moom.xn)(receiver)).c(((int)(((int) moom.xn.o))));

    ((moom.xn)(receiver)).b(((int)(1)));

    ((moom.xn)(receiver)).a(((net.minecraft.creativetab.CreativeTabs)(net.minecraft.creativetab.CreativeTabs.i)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_dc7bfbc0b6cb0584_0(moom.xn a0) throws E;

static {
n = ((long)(((moom._a)(moom._c.a(((long)(-3908303898070973644L)), ((long)(-2549582380107279739L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(67650954217317L)))));
    long local0_life6 = (moom.xn.n ^ 51381211744868L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill1114_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1114_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1114_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1114_13 = new byte[8];
    (__sourceSpill1114_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill1114_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation1114_15 = __sourceSpill1114_13;
    ((javax.crypto.Cipher)(__sourceSpill1114_10)).init(((int)(__sourceSpill1114_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1114_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1114_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = 8022584429190366845L;
    byte[] __sourceSpill1114_19 = new byte[8];
    (__sourceSpill1114_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill1114_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill1114_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill1114_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill1114_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill1114_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill1114_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill1114_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill1114_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill1114_20)).doFinal(((byte[])(__sourceSpill1114_19)));
    o = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


public boolean c__Boolean(net.minecraft.item.ItemStack p0) {
return (__sourceIntrinsic_booleanComparison((super.c__Boolean(((net.minecraft.item.ItemStack)(p0))))) != 0);
}


public int c() {
return 1;
}


public boolean c__Boolean() {
return ((1) != 0);
}


public boolean d__Boolean() {
return ((1) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public net.minecraft.item.ItemStack a(net.minecraft.item.ItemStack p0, net.minecraft.world.World p1, net.minecraft.entity.player.EntityPlayer p2) {
long life4_3;
    int life6_5;
    int life7_17;
    forward_join_57: {
    forward_join_51: {
    forward_join_49: {
    forward_join_36: {
    forward_join_23: {
    life4_3 = (moom.xn.n ^ 37501384835801L);
    life6_5 = ((net.minecraft.item.ItemStack.l()) ? 1 : 0);
    if (!((life6_5 == 0))) { break forward_join_36; }
    if (!((((net.minecraft.entity.player.EntityPlayer)(p2)).cc != null))) { break forward_join_23; }
    life7_17 = ((net.minecraft.entity.projectile.EntityFishHook)(((net.minecraft.entity.player.EntityPlayer)(p2)).cc)).a();
    ((net.minecraft.item.ItemStack)(p0)).a(((int)(life7_17)), ((net.minecraft.entity.EntityLivingBase)(p2)));
    ((net.minecraft.entity.player.EntityPlayer)(p2)).B__sourceReturn_da8c82d5d4();
    if (!((life6_5 != 0))) { break forward_join_57; }
    }
    ((net.minecraft.world.World)(p1)).a(((net.minecraft.entity.Entity)(p2)), ((java.lang.String)("random.bow")), ((float)(0x1.0p-1f)), ((float)((0x1.99999ap-2f / ((((java.util.Random)(moom.xn.e)).nextFloat() * 0x1.99999ap-2f) + 0x1.99999ap-1f)))));
    }
    if (!((life6_5 == 0))) { break forward_join_51; }
    if (!((!((net.minecraft.world.World)(p1)).G))) { break forward_join_49; }
    ((net.minecraft.world.World)(p1)).b__Boolean(((net.minecraft.entity.Entity)(new net.minecraft.entity.projectile.EntityFishHook(p1, p2))));
    }
    ((net.minecraft.entity.player.EntityPlayer)(p2)).B__sourceReturn_da8c82d5d4();
    }
    ((net.minecraft.entity.player.EntityPlayer)(p2)).a(((moom.BY)((net.minecraft.stats.StatList.ad)[net.minecraft.item.Item.a(((net.minecraft.item.Item)(this)))])));
    }
    return p0;
}


private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
