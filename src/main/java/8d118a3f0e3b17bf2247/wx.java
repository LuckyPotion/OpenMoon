package moom;


public class wx implements net.minecraft.inventory.IInventory {

private final net.minecraft.item.ItemStack[] a;

private final int b;

private final int c;

private final moom.v8 d;

private static final long e;

private static final long f;

public wx(moom.v8 p0, int p1, int p2) {
super();
    int local4 = (p1 * p2);
    this.a = ((net.minecraft.item.ItemStack[])(new net.minecraft.item.ItemStack[local4]));
    this.d = ((moom.v8)(p0));
    this.b = ((int)(p1));
    this.c = ((int)(p2));
    return;
}


static {
e = ((long)(((moom._a)(moom._c.a(((long)(1968217592842881533L)), ((long)(-6975585745900653703L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(98366258290952L)))));
    long local0_life6 = (moom.wx.e ^ 114708885183065L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill1094_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1094_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1094_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1094_13 = new byte[8];
    (__sourceSpill1094_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill1094_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation1094_15 = __sourceSpill1094_13;
    ((javax.crypto.Cipher)(__sourceSpill1094_10)).init(((int)(__sourceSpill1094_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1094_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1094_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -6743044293857763110L;
    byte[] __sourceSpill1094_19 = new byte[8];
    (__sourceSpill1094_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill1094_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill1094_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill1094_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill1094_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill1094_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill1094_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill1094_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill1094_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill1094_20)).doFinal(((byte[])(__sourceSpill1094_19)));
    f = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


public net.minecraft.item.ItemStack b__xW(int p0) {
net.minecraft.item.ItemStack forwardValue4444_17_0;
    net.minecraft.item.ItemStack spill4444_0;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    net.minecraft.item.ItemStack life5_23;
    forward_join_25: {
    forward_join_17: {
    life2_3 = (moom.wx.e ^ 72536081096464L);
    life4_5 = moom.v8.b__Arrayr3();
    spill4444_0 = (this.a)[p0];
    if (!((life4_5 == null))) {
        forwardValue4444_17_0 = spill4444_0;
        break forward_join_17;
    }
    if (!((spill4444_0 != null))) {
        break forward_join_25;
    }
    forwardValue4444_17_0 = (this.a)[p0];
    }
    life5_23 = forwardValue4444_17_0;
    (this.a)[p0] = null;
    return life5_23;
    }
    return null;
}


public void b__Void() {
java.util.Arrays.fill(((java.lang.Object[])(this.a)), ((java.lang.Object)(null)));
    return;
}


public int b__Int() {
return (this.a).length;
}


public net.minecraft.item.ItemStack b(int p0, int p1) {
int forwardValue4443_11_0;
    int forwardValue4443_17_0;
    int forwardValue4443_21_0;
    net.minecraft.item.ItemStack forwardValue4443_34_0;
    int spill4443_0;
    long life3_3;
    net.minecraft.entity.Entity[] life5_5;
    forward_join_34: {
    forward_join_33: {
    forward_join_21: {
    forward_join_17: {
    forward_join_11: {
    life3_3 = (moom.wx.e ^ 24360281056278L);
    life5_5 = moom.v8.b__Arrayr3();
    spill4443_0 = p0;
    if (!((life5_5 == null))) {
        forwardValue4443_11_0 = spill4443_0;
        break forward_join_11;
    }
    if (!((spill4443_0 >= 0))) {
        break forward_join_33;
    }
    forwardValue4443_11_0 = p0;
    }
    if (!((life5_5 == null))) {
        forwardValue4443_17_0 = forwardValue4443_11_0;
        break forward_join_17;
    }
    if (!((forwardValue4443_11_0 < this.b))) {
        break forward_join_33;
    }
    forwardValue4443_17_0 = p1;
    }
    if (!((life5_5 == null))) {
        forwardValue4443_21_0 = forwardValue4443_17_0;
        break forward_join_21;
    }
    if (!((forwardValue4443_17_0 >= 0))) {
        break forward_join_33;
    }
    forwardValue4443_21_0 = p1;
    }
    if (!((forwardValue4443_21_0 <= this.c))) {
        break forward_join_33;
    }
    forwardValue4443_34_0 = ((moom.wx)(this)).a__xW(((int)((p0 + (p1 * this.b)))));
    break forward_join_34;
    }
    forwardValue4443_34_0 = null;
    }
    return forwardValue4443_34_0;
}


public void b(net.minecraft.entity.player.EntityPlayer p0) {
return;
}


public int e() {
return this.c;
}


public boolean e__Boolean() {
return ((0) != 0);
}


public int c__Int() {
long local1 = (moom.wx.e ^ 5385756730936L);
    return ((int) moom.wx.f);
}


public void c__sourceReturn_aecb585720(net.minecraft.entity.player.EntityPlayer p0) {
return;
}


public int f() {
return this.b;
}


public int d__Int() {
return 0;
}


public int a__sourceReturn_0f7a48eca2(int p0) {
return 0;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a__Void(int p0, int p1) {
return;
}


public net.minecraft.item.ItemStack a(int p0, int p1) {
net.minecraft.item.ItemStack forwardValue4441_17_0;
    net.minecraft.item.ItemStack forwardValue4441_44_0;
    net.minecraft.item.ItemStack forwardValue4441_63_0;
    net.minecraft.item.ItemStack spill4441_0;
    net.minecraft.item.ItemStack spill4441_1;
    long life3_3;
    net.minecraft.entity.Entity[] life5_5;
    net.minecraft.item.ItemStack life6_35;
    net.minecraft.item.ItemStack life6_53;
    forward_join_64: {
    forward_join_63: {
    forward_join_58: {
    forward_join_44: {
    forward_join_38: {
    forward_join_17: {
    life3_3 = (moom.wx.e ^ 45385951862360L);
    life5_5 = moom.v8.b__Arrayr3();
    spill4441_0 = (this.a)[p0];
    if (!((life5_5 == null))) {
        forwardValue4441_17_0 = spill4441_0;
        break forward_join_17;
    }
    if (!((spill4441_0 != null))) {
        break forward_join_64;
    }
    forwardValue4441_17_0 = (this.a)[p0];
    }
    if (!((life5_5 == null))) {
        forwardValue4441_44_0 = forwardValue4441_17_0;
        break forward_join_44;
    }
    if (!((((net.minecraft.item.ItemStack)(forwardValue4441_17_0)).b <= p1))) {
        break forward_join_38;
    }
    life6_35 = (this.a)[p0];
    (this.a)[p0] = null;
    ((moom.v8)(this.d)).a__Void(((net.minecraft.inventory.IInventory)(this)));
    return life6_35;
    }
    forwardValue4441_44_0 = ((net.minecraft.item.ItemStack)((this.a)[p0])).a(((int)(p1)));
    }
    life6_53 = forwardValue4441_44_0;
    spill4441_1 = (this.a)[p0];
    if (!((life5_5 == null))) {
        forwardValue4441_63_0 = spill4441_1;
        break forward_join_63;
    }
    if (!((((net.minecraft.item.ItemStack)(spill4441_1)).b == 0))) {
        break forward_join_58;
    }
    (this.a)[p0] = null;
    }
    ((moom.v8)(this.d)).a__Void(((net.minecraft.inventory.IInventory)(this)));
    forwardValue4441_63_0 = life6_53;
    }
    return forwardValue4441_63_0;
    }
    return null;
}


public net.minecraft.util.IChatComponent a__C5() {
moom.CJ forwardValue4442_20_0;
    long life1_3;
    forward_join_20: {
    forward_join_13: {
    life1_3 = (moom.wx.e ^ 43732064998665L);
    if (!(((moom.wx)(this)).e__Boolean())) {
        break forward_join_13;
    }
    forwardValue4442_20_0 = new moom.CM(((moom.wx)(this)).a__String());
    break forward_join_20;
    }
    forwardValue4442_20_0 = new moom.CN(((moom.wx)(this)).a__String(), new java.lang.Object[0]);
    }
    return forwardValue4442_20_0;
}


public java.lang.String a__String() {
return "container.crafting";
}


public net.minecraft.item.ItemStack a__xW(int p0) {
long local2 = (moom.wx.e ^ 123593762277995L);
    return ((p0 >= ((moom.wx)(this)).b__Int()) ? null : (this.a)[p0]);
}


public boolean a__Boolean(int p0, net.minecraft.item.ItemStack p1) {
return ((1) != 0);
}


public boolean a(net.minecraft.entity.player.EntityPlayer p0) {
return ((1) != 0);
}


public void a__Void() {
return;
}


public void a__Void(int p0, net.minecraft.item.ItemStack p1) {
(this.a)[p0] = p1;
    ((moom.v8)(this.d)).a__Void(((net.minecraft.inventory.IInventory)(this)));
    return;
}

}
