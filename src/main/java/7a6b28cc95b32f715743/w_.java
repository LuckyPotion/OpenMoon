package moom;


public class w_ extends net.minecraft.item.Item {

private static final long n;

private static final long o;

public w_() {
super();
    (this).b(1);
    (this).a(net.minecraft.creativetab.CreativeTabs.f);
}


static {
n = ((long)(((moom._a)(moom._c.a(((long)(-1440508377136428700L)), ((long)(8060270381149747448L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(171435351411303L)))));
    long local0_life6 = (moom.w_.n ^ 54184822900397L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill1089_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1089_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1089_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1089_13 = new byte[8];
    (__sourceSpill1089_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill1089_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation1089_15 = __sourceSpill1089_13;
    ((javax.crypto.Cipher)(__sourceSpill1089_10)).init(((int)(__sourceSpill1089_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1089_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1089_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -8760888249060200342L;
    byte[] __sourceSpill1089_19 = new byte[8];
    (__sourceSpill1089_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill1089_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill1089_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill1089_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill1089_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill1089_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill1089_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill1089_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill1089_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill1089_20)).doFinal(((byte[])(__sourceSpill1089_19)));
    o = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


public net.minecraft.item.ItemStack b(net.minecraft.item.ItemStack p0, net.minecraft.world.World p1, net.minecraft.entity.player.EntityPlayer p2) {
int forwardValue4389_20_0;
    int forwardValue4389_35_0;
    net.minecraft.item.ItemStack forwardValue4389_40_0;
    net.minecraft.item.ItemStack forwardValue4389_42_0;
    boolean spill4389_0;
    net.minecraft.item.ItemStack spill4389_1;
    long life4_3;
    int life6_5;
    forward_join_42: {
    forward_join_41: {
    forward_join_40: {
    forward_join_35: {
    forward_join_25: {
    forward_join_20: {
    forward_join_18: {
    life4_3 = (moom.w_.n ^ 19341888734911L);
    life6_5 = ((net.minecraft.item.ItemStack.m()) ? 1 : 0);
    spill4389_0 = ((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.entity.player.EntityPlayer)(p2)).b1)).d;
    if (!((life6_5 != 0))) {
        forwardValue4389_20_0 = ((spill4389_0) ? 1 : 0);
        break forward_join_20;
    }
    if (!((!spill4389_0))) {
        break forward_join_18;
    }
    net.minecraft.item.ItemStack __stackOp4389_6_0 = p0;
    ((net.minecraft.item.ItemStack)(__stackOp4389_6_0)).b = ((int)((((net.minecraft.item.ItemStack)(__stackOp4389_6_0)).b - 1)));
    }
    forwardValue4389_20_0 = ((((net.minecraft.world.World)(p1)).G) ? 1 : 0);
    }
    if (!((life6_5 != 0))) {
        forwardValue4389_35_0 = forwardValue4389_20_0;
        break forward_join_35;
    }
    if (!((forwardValue4389_20_0 == 0))) {
        break forward_join_25;
    }
    ((net.minecraft.entity.player.EntityPlayer)(p2)).z__sourceReturn_da8c82d5d4();
    }
    ((net.minecraft.entity.player.EntityPlayer)(p2)).a(((moom.BY)((net.minecraft.stats.StatList.ad)[net.minecraft.item.Item.a(((net.minecraft.item.Item)(this)))])));
    spill4389_1 = p0;
    if (!((life6_5 != 0))) {
        forwardValue4389_40_0 = spill4389_1;
        break forward_join_40;
    }
    forwardValue4389_35_0 = ((net.minecraft.item.ItemStack)(spill4389_1)).b;
    }
    if (!((forwardValue4389_35_0 <= 0))) {
        break forward_join_41;
    }
    forwardValue4389_40_0 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.aw);
    }
    forwardValue4389_42_0 = forwardValue4389_40_0;
    break forward_join_42;
    }
    forwardValue4389_42_0 = p0;
    }
    return forwardValue4389_42_0;
}


public net.minecraft.item.ItemStack a(net.minecraft.item.ItemStack p0, net.minecraft.world.World p1, net.minecraft.entity.player.EntityPlayer p2) {
((net.minecraft.entity.player.EntityPlayer)(p2)).b(((net.minecraft.item.ItemStack)(p0)), ((int)(((moom.w_)(this)).a__Int(((net.minecraft.item.ItemStack)(p0))))));
    return p0;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public moom.a1 a__a1(net.minecraft.item.ItemStack p0) {
return moom.a1.DRINK;
}


public int a__Int(net.minecraft.item.ItemStack p0) {
long local2 = (moom.w_.n ^ 72925725687158L);
    return ((int) moom.w_.o);
}

}
