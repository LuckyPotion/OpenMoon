package moom;


public class x3 {

private final java.lang.String[][] a;

private final net.minecraft.item.Item[][] b;

private static final long c;

private static final long d;

public x3() {
super();
    this.a = ((java.lang.String[][])(new java.lang.String[][] {new java.lang.String[] {"XXX", "X X"}, new java.lang.String[] {"X X", "XXX", "XXX"}, new java.lang.String[] {"XXX", "X X", "X X"}, new java.lang.String[] {"X X", "X X"}}));
    this.b = ((net.minecraft.item.Item[][])(new net.minecraft.item.Item[][] {new net.minecraft.item.Item[] {net.minecraft.init.Items.aF, net.minecraft.init.Items.j, net.minecraft.init.Items.i, net.minecraft.init.Items.k}, new net.minecraft.item.Item[] {net.minecraft.init.Items.Q, net.minecraft.init.Items.Y, net.minecraft.init.Items.ac, net.minecraft.init.Items.ag}, new net.minecraft.item.Item[] {net.minecraft.init.Items.R, net.minecraft.init.Items.Z, net.minecraft.init.Items.ad, net.minecraft.init.Items.ah}, new net.minecraft.item.Item[] {net.minecraft.init.Items.S, net.minecraft.init.Items.aa, net.minecraft.init.Items.ae, net.minecraft.init.Items.ai}, new net.minecraft.item.Item[] {net.minecraft.init.Items.T, net.minecraft.init.Items.ab, net.minecraft.init.Items.af, net.minecraft.init.Items.aj}}));
    return;
}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(229905226637594669L)), ((long)(-8779081531716803172L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(233596417173542L)))));
    long local0_life6 = (moom.x3.c ^ 76088621449307L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill1098_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1098_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1098_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1098_13 = new byte[8];
    (__sourceSpill1098_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill1098_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation1098_15 = __sourceSpill1098_13;
    ((javax.crypto.Cipher)(__sourceSpill1098_10)).init(((int)(__sourceSpill1098_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1098_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1098_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -6856709084375396084L;
    byte[] __sourceSpill1098_19 = new byte[8];
    (__sourceSpill1098_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill1098_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill1098_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill1098_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill1098_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill1098_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill1098_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill1098_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill1098_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill1098_20)).doFinal(((byte[])(__sourceSpill1098_19)));
    d = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


public void a(net.minecraft.item.crafting.CraftingManager p0) {
long local2 = (moom.x3.c ^ 133424288906986L);
    int local4 = 0;
    while ((local4 < ((this.b)[0]).length)) {
        net.minecraft.item.Item local5 = ((this.b)[0])[local4];
        int local6 = 0;
        while ((local6 < ((this.b).length - 1))) {
        net.minecraft.item.Item local7 = ((this.b)[(local6 + 1)])[local4];
        ((net.minecraft.item.crafting.CraftingManager)(p0)).a(((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(local7))), ((java.lang.Object[])(new java.lang.Object[] {(this.a)[local6], java.lang.Character.valueOf(((char)(((int) moom.x3.d)))), local5})));
        local6 += 1;
    }
        local4 += 1;
    }
    return;
}

}
