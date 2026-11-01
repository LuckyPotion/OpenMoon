package moom;


class wE extends moom.wB {

private static final long f;

private static final long g;

public wE(net.minecraft.inventory.IInventory p0, int p1, int p2, int p3) {
super(p0, p1, p2, p3);
}


static {
f = ((long)(((moom._a)(moom._c.a(((long)(1860940899900689216L)), ((long)(-2860570935248333099L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(112531746005670L)))));
    long local0_life6 = (moom.wE.f ^ 98320873787028L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill1085_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1085_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1085_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1085_13 = new byte[8];
    (__sourceSpill1085_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill1085_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation1085_15 = __sourceSpill1085_13;
    ((javax.crypto.Cipher)(__sourceSpill1085_10)).init(((int)(__sourceSpill1085_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1085_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1085_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = 1083001166318645385L;
    byte[] __sourceSpill1085_19 = new byte[8];
    (__sourceSpill1085_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill1085_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill1085_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill1085_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill1085_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill1085_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill1085_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill1085_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill1085_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill1085_20)).doFinal(((byte[])(__sourceSpill1085_19)));
    g = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public boolean a__Boolean(net.minecraft.item.ItemStack p0) {
net.minecraft.item.ItemStack forwardValue4358_11_0;
    int forwardValue4358_18_0;
    int forwardValue4358_20_0;
    net.minecraft.item.ItemStack spill4358_0;
    boolean spill4358_1;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_20: {
    forward_join_19: {
    forward_join_18: {
    forward_join_11: {
    life2_3 = (moom.wE.f ^ 23693731810662L);
    life4_5 = moom.v8.b__Arrayr3();
    spill4358_0 = p0;
    if (!((life4_5 == null))) {
        forwardValue4358_11_0 = spill4358_0;
        break forward_join_11;
    }
    if (!((spill4358_0 != null))) {
        break forward_join_19;
    }
    forwardValue4358_11_0 = p0;
    }
    spill4358_1 = ((net.minecraft.item.Item)(((net.minecraft.item.ItemStack)(forwardValue4358_11_0)).a__wQ())).a__Boolean(((net.minecraft.item.ItemStack)(p0)));
    if (!((life4_5 == null))) {
        forwardValue4358_18_0 = ((spill4358_1) ? 1 : 0);
        break forward_join_18;
    }
    if (!(spill4358_1)) {
        break forward_join_19;
    }
    forwardValue4358_18_0 = 1;
    }
    forwardValue4358_20_0 = forwardValue4358_18_0;
    break forward_join_20;
    }
    forwardValue4358_20_0 = 0;
    }
    return ((forwardValue4358_20_0) != 0);
}


public int a() {
long local1 = (moom.wE.f ^ 28473683462062L);
    return ((int) moom.wE.g);
}

}
