package moom;


public class wA implements net.minecraft.inventory.IInventory {

private final net.minecraft.entity.IMerchant a;

private final net.minecraft.item.ItemStack[] b;

private final net.minecraft.entity.player.EntityPlayer c;

private net.minecraft.village.MerchantRecipe d;

private int e;

private static final long f;

private static final long g;

public wA(net.minecraft.entity.player.EntityPlayer p0, net.minecraft.entity.IMerchant p1) {
super();
    this.b = new net.minecraft.item.ItemStack[3];
    this.c = p0;
    this.a = p1;
}


static {
f = ((long)(((moom._a)(moom._c.a(((long)(1214123345161401700L)), ((long)(-5278505044038869375L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(25445960431189L)))));
    long local0_life6 = (moom.wA.f ^ 96342234632959L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill1084_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1084_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1084_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1084_13 = new byte[8];
    (__sourceSpill1084_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill1084_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation1084_15 = __sourceSpill1084_13;
    ((javax.crypto.Cipher)(__sourceSpill1084_10)).init(((int)(__sourceSpill1084_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1084_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1084_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -8560640035506255814L;
    byte[] __sourceSpill1084_19 = new byte[8];
    (__sourceSpill1084_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill1084_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill1084_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill1084_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill1084_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill1084_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill1084_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill1084_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill1084_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill1084_20)).doFinal(((byte[])(__sourceSpill1084_19)));
    g = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


public void b(net.minecraft.entity.player.EntityPlayer p0) {
return;
}


public net.minecraft.item.ItemStack b__xW(int p0) {
net.minecraft.item.ItemStack forwardValue4353_17_0;
    net.minecraft.item.ItemStack spill4353_0;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    net.minecraft.item.ItemStack life5_23;
    forward_join_25: {
    forward_join_17: {
    life2_3 = (moom.wA.f ^ 14208036434654L);
    life4_5 = moom.v8.b__Arrayr3();
    spill4353_0 = (this.b)[p0];
    if (!((life4_5 == null))) {
        forwardValue4353_17_0 = spill4353_0;
        break forward_join_17;
    }
    if (!((spill4353_0 != null))) {
        break forward_join_25;
    }
    forwardValue4353_17_0 = (this.b)[p0];
    }
    life5_23 = forwardValue4353_17_0;
    (this.b)[p0] = null;
    return life5_23;
    }
    return null;
}


public void b__Void() {
java.util.Arrays.fill(((java.lang.Object[])(this.b)), ((java.lang.Object)(null)));
    return;
}


public int b__Int() {
return (this.b).length;
}


public boolean e__Boolean() {
return ((0) != 0);
}


public int c__Int() {
long local1 = (moom.wA.f ^ 81301444217846L);
    return ((int) moom.wA.g);
}


public void c__sourceReturn_aecb585720(net.minecraft.entity.player.EntityPlayer p0) {
return;
}


public void c__Void() {
net.minecraft.item.ItemStack forwardValue4354_28_0;
    net.minecraft.village.MerchantRecipe forwardValue4354_57_0;
    net.minecraft.entity.Entity[] spill4354_0;
    net.minecraft.item.ItemStack spill4354_1;
    net.minecraft.village.MerchantRecipe spill4354_2;
    long life1_3;
    net.minecraft.item.ItemStack life4_11;
    net.minecraft.item.ItemStack life5_17;
    net.minecraft.entity.Entity[] life3_18;
    moom.OF life6_46;
    net.minecraft.village.MerchantRecipe life7_60;
    net.minecraft.village.MerchantRecipe life7_96;
    forward_join_113: {
    forward_join_107: {
    forward_join_103: {
    forward_join_101: {
    forward_join_97: {
    forward_join_70: {
    forward_join_57: {
    forward_join_35: {
    forward_join_28: {
    forward_join_27: {
    life1_3 = (moom.wA.f ^ 18551533813250L);
    this.d = ((net.minecraft.village.MerchantRecipe)(null));
    life4_11 = (this.b)[0];
    spill4354_0 = moom.v8.b__Arrayr3();
    life5_17 = (this.b)[1];
    life3_18 = spill4354_0;
    spill4354_1 = life4_11;
    if (!((life3_18 == null))) {
        forwardValue4354_28_0 = spill4354_1;
        break forward_join_28;
    }
    if (!((spill4354_1 == null))) {
        break forward_join_27;
    }
    life4_11 = life5_17;
    life5_17 = null;
    }
    forwardValue4354_28_0 = life4_11;
    }
    if (!((forwardValue4354_28_0 == null))) {
        break forward_join_35;
    }
    ((moom.wA)(this)).a__Void(((int)(2)), ((net.minecraft.item.ItemStack)(null)));
    if (!((life3_18 != null))) {
        break forward_join_107;
    }
    }
    life6_46 = __sourceExactCall_91da5b4f0de835(((net.minecraft.entity.IMerchant)(this.a)), ((net.minecraft.entity.player.EntityPlayer)(this.c)));
    if (!((life3_18 == null))) {
        break forward_join_113;
    }
    if (!((life6_46 != null))) {
        break forward_join_107;
    }
    life7_60 = __sourceExactCall_84a570237a0a5b(((moom.OF)(life6_46)), ((net.minecraft.item.ItemStack)(life4_11)), ((net.minecraft.item.ItemStack)(life5_17)), ((int)(this.e)));
    spill4354_2 = life7_60;
    if (!((life3_18 == null))) {
        forwardValue4354_57_0 = spill4354_2;
        break forward_join_57;
    }
    if (!((spill4354_2 != null))) {
        break forward_join_70;
    }
    forwardValue4354_57_0 = life7_60;
    }
    if (!((!((net.minecraft.village.MerchantRecipe)(forwardValue4354_57_0)).b__Boolean()))) {
        break forward_join_70;
    }
    this.d = ((net.minecraft.village.MerchantRecipe)(life7_60));
    ((moom.wA)(this)).a__Void(((int)(2)), ((net.minecraft.item.ItemStack)(((net.minecraft.item.ItemStack)(((net.minecraft.village.MerchantRecipe)(life7_60)).c())).a__xW())));
    if (!((life3_18 != null))) {
        break forward_join_107;
    }
    }
    if (!((life5_17 != null))) {
        break forward_join_103;
    }
    life7_96 = __sourceExactCall_84a570237a0a5b(((moom.OF)(life6_46)), ((net.minecraft.item.ItemStack)(life5_17)), ((net.minecraft.item.ItemStack)(life4_11)), ((int)(this.e)));
    if (!((life3_18 == null))) {
        break forward_join_101;
    }
    if (!((life7_96 != null))) {
        break forward_join_97;
    }
    if (!((!((net.minecraft.village.MerchantRecipe)(life7_96)).b__Boolean()))) {
        break forward_join_97;
    }
    this.d = ((net.minecraft.village.MerchantRecipe)(life7_96));
    ((moom.wA)(this)).a__Void(((int)(2)), ((net.minecraft.item.ItemStack)(((net.minecraft.item.ItemStack)(((net.minecraft.village.MerchantRecipe)(life7_96)).c())).a__xW())));
    if (!((life3_18 != null))) {
        break forward_join_107;
    }
    }
    ((moom.wA)(this)).a__Void(((int)(2)), ((net.minecraft.item.ItemStack)(null)));
    }
    if (!((life3_18 != null))) {
        break forward_join_107;
    }
    }
    ((moom.wA)(this)).a__Void(((int)(2)), ((net.minecraft.item.ItemStack)(null)));
    }
    __sourceExactCall_099c46548d1db3(((net.minecraft.entity.IMerchant)(this.a)), ((net.minecraft.item.ItemStack)(((moom.wA)(this)).a__xW(((int)(2))))));
    }
    return;
}


public int d__Int() {
return 0;
}


public void a__Void(int p0) {
this.e = ((int)(p0));
    ((moom.wA)(this)).c__Void();
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public net.minecraft.village.MerchantRecipe a__D8() {
return this.d;
}


public int a__sourceReturn_0f7a48eca2(int p0) {
return 0;
}


public void a__Void(int p0, int p1) {
return;
}


public net.minecraft.item.ItemStack a__xW(int p0) {
return (this.b)[p0];
}


public net.minecraft.util.IChatComponent a__C5() {
moom.CJ forwardValue4351_20_0;
    long life1_3;
    forward_join_20: {
    forward_join_13: {
    life1_3 = (moom.wA.f ^ 117452954220743L);
    if (!(((moom.wA)(this)).e__Boolean())) {
        break forward_join_13;
    }
    forwardValue4351_20_0 = new moom.CM(((moom.wA)(this)).a__String());
    break forward_join_20;
    }
    forwardValue4351_20_0 = new moom.CN(((moom.wA)(this)).a__String(), new java.lang.Object[0]);
    }
    return forwardValue4351_20_0;
}


public java.lang.String a__String() {
return "mob.villager";
}


public void a__Void(int p0, net.minecraft.item.ItemStack p1) {
moom.wA forwardValue4352_27_0;
    int forwardValue4352_31_0;
    moom.wA forwardValue4352_33_0;
    moom.wA spill4352_0;
    int spill4352_1;
    long life3_3;
    net.minecraft.entity.Entity[] life5_5;
    forward_join_34: {
    forward_join_33: {
    forward_join_31: {
    forward_join_27: {
    forward_join_26: {
    life3_3 = (moom.wA.f ^ 80307812490149L);
    life5_5 = moom.v8.b__Arrayr3();
    spill4352_0 = this;
    if (!((life5_5 == null))) {
        forwardValue4352_27_0 = spill4352_0;
        break forward_join_27;
    }
    (((moom.wA)(spill4352_0)).b)[p0] = p1;
    if (!((p1 != null))) {
        break forward_join_26;
    }
    spill4352_1 = ((net.minecraft.item.ItemStack)(p1)).b;
    if (!((life5_5 == null))) {
        forwardValue4352_31_0 = spill4352_1;
        break forward_join_31;
    }
    if (!((spill4352_1 > ((moom.wA)(this)).c__Int()))) {
        break forward_join_26;
    }
    ((net.minecraft.item.ItemStack)(p1)).b = ((int)(((moom.wA)(this)).c__Int()));
    }
    forwardValue4352_27_0 = this;
    }
    if (!((life5_5 == null))) {
        forwardValue4352_33_0 = forwardValue4352_27_0;
        break forward_join_33;
    }
    forwardValue4352_31_0 = ((((moom.wA)(forwardValue4352_27_0)).a__Boolean(((int)(p0)))) ? 1 : 0);
    }
    if (!((forwardValue4352_31_0 != 0))) {
        break forward_join_34;
    }
    forwardValue4352_33_0 = this;
    }
    ((moom.wA)(forwardValue4352_33_0)).c__Void();
    }
    return;
}


private boolean a__Boolean(int p0) {
int forwardValue4350_16_0;
    int forwardValue4350_18_0;
    int spill4350_0;
    int spill4350_1;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_18: {
    forward_join_17: {
    forward_join_16: {
    forward_join_15: {
    life2_3 = (moom.wA.f ^ 5194382304028L);
    life4_5 = moom.v8.b__Arrayr3();
    spill4350_0 = p0;
    if (!((life4_5 == null))) {
        forwardValue4350_16_0 = spill4350_0;
        break forward_join_16;
    }
    if (!((spill4350_0 != 0))) {
        break forward_join_15;
    }
    spill4350_1 = p0;
    if (!((life4_5 == null))) {
        forwardValue4350_16_0 = spill4350_1;
        break forward_join_16;
    }
    if (!((spill4350_1 == 1))) {
        break forward_join_17;
    }
    }
    forwardValue4350_16_0 = 1;
    }
    forwardValue4350_18_0 = forwardValue4350_16_0;
    break forward_join_18;
    }
    forwardValue4350_18_0 = 0;
    }
    return ((forwardValue4350_18_0) != 0);
}


public void a__Void() {
((moom.wA)(this)).c__Void();
    return;
}


public boolean a__Boolean(int p0, net.minecraft.item.ItemStack p1) {
return ((1) != 0);
}


public net.minecraft.item.ItemStack a(int p0, int p1) {
int forwardValue4349_36_0;
    int forwardValue4349_36_1;
    moom.wA forwardValue4349_54_0;
    net.minecraft.item.ItemStack forwardValue4349_63_0;
    int forwardValue4349_82_0;
    moom.wA forwardValue4349_84_0;
    int spill4349_0;
    int spill4349_1;
    net.minecraft.item.ItemStack spill4349_2;
    moom.wA spill4349_3;
    int spill4349_4;
    moom.wA spill4349_5;
    long life3_3;
    net.minecraft.entity.Entity[] life5_5;
    net.minecraft.item.ItemStack life6_26;
    net.minecraft.item.ItemStack life6_50;
    net.minecraft.item.ItemStack life6_78;
    forward_join_87: {
    forward_join_85: {
    forward_join_84: {
    forward_join_82: {
    forward_join_77: {
    forward_join_63: {
    forward_join_57: {
    forward_join_55: {
    forward_join_54: {
    forward_join_36: {
    forward_join_28: {
    life3_3 = (moom.wA.f ^ 110310634025878L);
    life5_5 = moom.v8.b__Arrayr3();
    if (!(((this.b)[p0] != null))) {
        break forward_join_87;
    }
    spill4349_0 = p0;
    spill4349_1 = 2;
    if (!((life5_5 == null))) {
        forwardValue4349_36_0 = spill4349_0;
        forwardValue4349_36_1 = spill4349_1;
        break forward_join_36;
    }
    if (!((spill4349_0 == spill4349_1))) {
        break forward_join_28;
    }
    life6_26 = (this.b)[p0];
    (this.b)[p0] = null;
    return life6_26;
    }
    spill4349_2 = (this.b)[p0];
    if (!((life5_5 == null))) {
        forwardValue4349_63_0 = spill4349_2;
        break forward_join_63;
    }
    forwardValue4349_36_0 = ((net.minecraft.item.ItemStack)(spill4349_2)).b;
    forwardValue4349_36_1 = p1;
    }
    if (!((forwardValue4349_36_0 <= forwardValue4349_36_1))) {
        break forward_join_57;
    }
    life6_50 = (this.b)[p0];
    (this.b)[p0] = null;
    spill4349_3 = this;
    if (!((life5_5 == null))) {
        forwardValue4349_54_0 = spill4349_3;
        break forward_join_54;
    }
    if (!(((moom.wA)(spill4349_3)).a__Boolean(((int)(p0))))) {
        break forward_join_55;
    }
    forwardValue4349_54_0 = this;
    }
    ((moom.wA)(forwardValue4349_54_0)).c__Void();
    }
    return life6_50;
    }
    forwardValue4349_63_0 = ((net.minecraft.item.ItemStack)((this.b)[p0])).a(((int)(p1)));
    }
    life6_78 = forwardValue4349_63_0;
    spill4349_4 = ((net.minecraft.item.ItemStack)((this.b)[p0])).b;
    if (!((life5_5 == null))) {
        forwardValue4349_82_0 = spill4349_4;
        break forward_join_82;
    }
    if (!((spill4349_4 == 0))) {
        break forward_join_77;
    }
    (this.b)[p0] = null;
    }
    spill4349_5 = this;
    if (!((life5_5 == null))) {
        forwardValue4349_84_0 = spill4349_5;
        break forward_join_84;
    }
    forwardValue4349_82_0 = ((((moom.wA)(spill4349_5)).a__Boolean(((int)(p0)))) ? 1 : 0);
    }
    if (!((forwardValue4349_82_0 != 0))) {
        break forward_join_85;
    }
    forwardValue4349_84_0 = this;
    }
    ((moom.wA)(forwardValue4349_84_0)).c__Void();
    }
    return life6_78;
    }
    return null;
}


public boolean a(net.minecraft.entity.player.EntityPlayer p0) {
long local2 = (moom.wA.f ^ 60976163131690L);
    return ((((((net.minecraft.entity.IMerchant)(this.a)).a__tn() == p0) ? 1 : 0)) != 0);
}


private static native moom.OF __sourceExactCall_91da5b4f0de835(net.minecraft.entity.IMerchant p0, net.minecraft.entity.player.EntityPlayer p1);
private static native net.minecraft.village.MerchantRecipe __sourceExactCall_84a570237a0a5b(moom.OF p0, net.minecraft.item.ItemStack p1, net.minecraft.item.ItemStack p2, int p3);
private static native void __sourceExactCall_099c46548d1db3(net.minecraft.entity.IMerchant p0, net.minecraft.item.ItemStack p1);
}
