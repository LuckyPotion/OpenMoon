package moom;


public class ww implements net.minecraft.inventory.IInventory {

private final net.minecraft.item.ItemStack[] a;

private static final long b;

private static final long c;

public ww() {
super();
    this.a = new net.minecraft.item.ItemStack[1];
}


static {
b = ((long)(((moom._a)(moom._c.a(((long)(-6062801472554692831L)), ((long)(-1603025663862768320L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(64803367468252L)))));
    long local0_life6 = (moom.ww.b ^ 29654648917053L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill1093_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1093_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1093_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1093_13 = new byte[8];
    (__sourceSpill1093_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill1093_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation1093_15 = __sourceSpill1093_13;
    ((javax.crypto.Cipher)(__sourceSpill1093_10)).init(((int)(__sourceSpill1093_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1093_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1093_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -8046756374751730337L;
    byte[] __sourceSpill1093_19 = new byte[8];
    (__sourceSpill1093_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill1093_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill1093_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill1093_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill1093_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill1093_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill1093_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill1093_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill1093_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill1093_20)).doFinal(((byte[])(__sourceSpill1093_19)));
    c = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


public void b__Void() {
java.util.Arrays.fill(((java.lang.Object[])(this.a)), ((java.lang.Object)(null)));
    return;
}


public net.minecraft.item.ItemStack b__xW(int p0) {
net.minecraft.item.ItemStack forwardValue4440_17_0;
    net.minecraft.item.ItemStack spill4440_0;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    net.minecraft.item.ItemStack life5_23;
    forward_join_25: {
    forward_join_17: {
    life2_3 = (moom.ww.b ^ 90088544874760L);
    life4_5 = moom.v8.b__Arrayr3();
    spill4440_0 = (this.a)[0];
    if (!((life4_5 == null))) {
        forwardValue4440_17_0 = spill4440_0;
        break forward_join_17;
    }
    if (!((spill4440_0 != null))) {
        break forward_join_25;
    }
    forwardValue4440_17_0 = (this.a)[0];
    }
    life5_23 = forwardValue4440_17_0;
    (this.a)[0] = null;
    return life5_23;
    }
    return null;
}


public void b(net.minecraft.entity.player.EntityPlayer p0) {
return;
}


public int b__Int() {
return 1;
}


public boolean e__Boolean() {
return ((0) != 0);
}


public void c__sourceReturn_aecb585720(net.minecraft.entity.player.EntityPlayer p0) {
return;
}


public int c__Int() {
long local1 = (moom.ww.b ^ 23030570027040L);
    return ((int) moom.ww.c);
}


public int d__Int() {
return 0;
}


public void a__Void(int p0, int p1) {
return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public boolean a__Boolean(int p0, net.minecraft.item.ItemStack p1) {
return ((1) != 0);
}


public int a__sourceReturn_0f7a48eca2(int p0) {
return 0;
}


public net.minecraft.item.ItemStack a(int p0, int p1) {
net.minecraft.item.ItemStack forwardValue4438_17_0;
    net.minecraft.item.ItemStack spill4438_0;
    long life3_3;
    net.minecraft.entity.Entity[] life5_5;
    net.minecraft.item.ItemStack life6_23;
    forward_join_25: {
    forward_join_17: {
    life3_3 = (moom.ww.b ^ 63020011499584L);
    life5_5 = moom.v8.b__Arrayr3();
    spill4438_0 = (this.a)[0];
    if (!((life5_5 == null))) {
        forwardValue4438_17_0 = spill4438_0;
        break forward_join_17;
    }
    if (!((spill4438_0 != null))) {
        break forward_join_25;
    }
    forwardValue4438_17_0 = (this.a)[0];
    }
    life6_23 = forwardValue4438_17_0;
    (this.a)[0] = null;
    return life6_23;
    }
    return null;
}


public net.minecraft.util.IChatComponent a__C5() {
moom.CJ forwardValue4439_20_0;
    long life1_3;
    forward_join_20: {
    forward_join_13: {
    life1_3 = (moom.ww.b ^ 61374728043281L);
    if (!(((moom.ww)(this)).e__Boolean())) {
        break forward_join_13;
    }
    forwardValue4439_20_0 = new moom.CM(((moom.ww)(this)).a__String());
    break forward_join_20;
    }
    forwardValue4439_20_0 = new moom.CN(((moom.ww)(this)).a__String(), new java.lang.Object[0]);
    }
    return forwardValue4439_20_0;
}


public java.lang.String a__String() {
return "Result";
}


public net.minecraft.item.ItemStack a__xW(int p0) {
return (this.a)[0];
}


public void a__Void(int p0, net.minecraft.item.ItemStack p1) {
(this.a)[0] = p1;
    return;
}


public void a__Void() {
return;
}


public boolean a(net.minecraft.entity.player.EntityPlayer p0) {
return ((1) != 0);
}

}
