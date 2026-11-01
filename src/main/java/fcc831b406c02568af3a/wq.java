package moom;


public class wq implements net.minecraft.inventory.IInventory {

private java.lang.String a;

private final int b;

private final net.minecraft.item.ItemStack[] c;

private java.util.List<net.minecraft.inventory.IInvBasic> d;

private boolean e;

private static final long i;

private static final long j;

public wq(java.lang.String p0, boolean p1, int p2) {
super();
    this.a = p0;
    this.e = p1;
    this.b = p2;
    this.c = new net.minecraft.item.ItemStack[p2];
}


public wq(net.minecraft.util.IChatComponent p0, int p1) {
this(((net.minecraft.util.IChatComponent)(p0)).b(), true, p1);
    return;
}


static {
i = ((long)(((moom._a)(moom._c.a(((long)(-3281093375257706651L)), ((long)(-7907730164568167340L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(205393618772865L)))));
    long local0_life6 = (moom.wq.i ^ 126955864939048L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill1090_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1090_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1090_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1090_13 = new byte[8];
    (__sourceSpill1090_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill1090_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation1090_15 = __sourceSpill1090_13;
    ((javax.crypto.Cipher)(__sourceSpill1090_10)).init(((int)(__sourceSpill1090_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1090_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1090_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = 841490023609555344L;
    byte[] __sourceSpill1090_19 = new byte[8];
    (__sourceSpill1090_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill1090_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill1090_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill1090_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill1090_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill1090_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill1090_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill1090_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill1090_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill1090_20)).doFinal(((byte[])(__sourceSpill1090_19)));
    j = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


public net.minecraft.item.ItemStack b__xW(int p0) {
net.minecraft.item.ItemStack forwardValue4432_17_0;
    net.minecraft.item.ItemStack spill4432_0;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    net.minecraft.item.ItemStack life5_23;
    forward_join_25: {
    forward_join_17: {
    life2_3 = (moom.wq.i ^ 66187651180406L);
    life4_5 = moom.v8.b__Arrayr3();
    spill4432_0 = (this.c)[p0];
    if (!((life4_5 == null))) {
        forwardValue4432_17_0 = spill4432_0;
        break forward_join_17;
    }
    if (!((spill4432_0 != null))) {
        break forward_join_25;
    }
    forwardValue4432_17_0 = (this.c)[p0];
    }
    life5_23 = forwardValue4432_17_0;
    (this.c)[p0] = null;
    return life5_23;
    }
    return null;
}


public void b(net.minecraft.entity.player.EntityPlayer p0) {
return;
}


public int b__Int() {
return this.b;
}


public void b(net.minecraft.inventory.IInvBasic p0) {
((java.util.List)(this.d)).remove(((java.lang.Object)(p0)));
    return;
}


public void b__Void() {
java.util.Arrays.fill(((java.lang.Object[])(this.c)), ((java.lang.Object)(null)));
    return;
}


public boolean e__Boolean() {
return ((((this.e) ? 1 : 0)) != 0);
}


public int c__Int() {
long local1 = (moom.wq.i ^ 133246598438494L);
    return ((int) moom.wq.j);
}


public void c__sourceReturn_aecb585720(net.minecraft.entity.player.EntityPlayer p0) {
return;
}


public int d__Int() {
return 0;
}


public boolean a(net.minecraft.entity.player.EntityPlayer p0) {
return ((1) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a__Void(int p0, int p1) {
return;
}


public int a__sourceReturn_0f7a48eca2(int p0) {
return 0;
}


public boolean a__Boolean(int p0, net.minecraft.item.ItemStack p1) {
return ((1) != 0);
}


public void a__Void(int p0, net.minecraft.item.ItemStack p1) {
net.minecraft.item.ItemStack forwardValue4430_23_0;
    net.minecraft.entity.Entity[] spill4430_0;
    net.minecraft.item.ItemStack spill4430_1;
    long life3_3;
    net.minecraft.entity.Entity[] life5_10;
    forward_join_28: {
    forward_join_26: {
    forward_join_23: {
    life3_3 = (moom.wq.i ^ 133953809534477L);
    spill4430_0 = moom.v8.b__Arrayr3();
    (this.c)[p0] = p1;
    life5_10 = spill4430_0;
    if (!((life5_10 == null))) {
        break forward_join_28;
    }
    if (!((p1 != null))) {
        break forward_join_26;
    }
    spill4430_1 = p1;
    if (!((life5_10 == null))) {
        forwardValue4430_23_0 = spill4430_1;
        break forward_join_23;
    }
    if (!((((net.minecraft.item.ItemStack)(spill4430_1)).b > ((moom.wq)(this)).c__Int()))) {
        break forward_join_26;
    }
    forwardValue4430_23_0 = p1;
    }
    ((net.minecraft.item.ItemStack)(forwardValue4430_23_0)).b = ((int)(((moom.wq)(this)).c__Int()));
    }
    ((moom.wq)(this)).a__Void();
    }
    return;
}


public net.minecraft.item.ItemStack a(net.minecraft.item.ItemStack p0) {
net.minecraft.item.ItemStack lexicalValue1380_34_0;
    int lexicalValue1380_44_0;
    net.minecraft.item.ItemStack lexicalValue1380_82_0;
    net.minecraft.item.ItemStack lexicalValue1380_91_0;
    net.minecraft.entity.Entity[] spill1380_0;
    net.minecraft.item.ItemStack spill1380_1;
    boolean spill1380_2;
    long life2_3;
    net.minecraft.item.ItemStack life5_7;
    net.minecraft.entity.Entity[] life4_8;
    int life6_10;
    net.minecraft.item.ItemStack life7_18;
    int life8_58;
    int life9_66;
    lexical_join_91: {
    lexical_join_90: {
    lexical_join_82: {
    lexical_join_81: {
    life2_3 = (moom.wq.i ^ 19571010343621L);
    spill1380_0 = moom.v8.b__Arrayr3();
    life5_7 = ((net.minecraft.item.ItemStack)(p0)).a__xW();
    life4_8 = spill1380_0;
    life6_10 = 0;
    lexical_cycle_11: while (true) {
    lexical_join_79: {
    lexical_join_78: {
    lexical_join_44: {
    lexical_join_34: {
    lexical_join_33: {
    if (!((life6_10 < this.b))) {
        break lexical_join_81;
    }
    life7_18 = ((moom.wq)(this)).a__xW(((int)(life6_10)));
    spill1380_1 = life7_18;
    if (!((life4_8 == null))) {
        lexicalValue1380_82_0 = spill1380_1;
        break lexical_join_82;
    }
    if (!((life4_8 == null))) {
        lexicalValue1380_34_0 = spill1380_1;
        break lexical_join_34;
    }
    if (!((spill1380_1 == null))) {
        break lexical_join_33;
    }
    ((moom.wq)(this)).a__Void(((int)(life6_10)), ((net.minecraft.item.ItemStack)(life5_7)));
    ((moom.wq)(this)).a__Void();
    return null;
    }
    lexicalValue1380_34_0 = life7_18;
    }
    spill1380_2 = net.minecraft.item.ItemStack.c(((net.minecraft.item.ItemStack)(lexicalValue1380_34_0)), ((net.minecraft.item.ItemStack)(life5_7)));
    if (!((life4_8 == null))) {
        lexicalValue1380_44_0 = ((spill1380_2) ? 1 : 0);
        break lexical_join_44;
    }
    if (!(spill1380_2)) {
        break lexical_join_78;
    }
    lexicalValue1380_44_0 = java.lang.Math.min(((int)(((moom.wq)(this)).c__Int())), ((int)(((net.minecraft.item.ItemStack)(life7_18)).a())));
    }
    life8_58 = lexicalValue1380_44_0;
    life9_66 = java.lang.Math.min(((int)(((net.minecraft.item.ItemStack)(life5_7)).b)), ((int)((life8_58 - ((net.minecraft.item.ItemStack)(life7_18)).b))));
    if (!((life4_8 == null))) {
        break lexical_join_79;
    }
    if (!((life9_66 > 0))) {
        break lexical_join_78;
    }
    net.minecraft.item.ItemStack __stackOp1380_15_0 = life7_18;
    ((net.minecraft.item.ItemStack)(__stackOp1380_15_0)).b = ((int)((((net.minecraft.item.ItemStack)(__stackOp1380_15_0)).b + life9_66)));
    net.minecraft.item.ItemStack __stackOp1380_18_0 = life5_7;
    ((net.minecraft.item.ItemStack)(__stackOp1380_18_0)).b = ((int)((((net.minecraft.item.ItemStack)(__stackOp1380_18_0)).b - life9_66)));
    if (!((life4_8 == null))) {
        break lexical_join_79;
    }
    if (!((((net.minecraft.item.ItemStack)(life5_7)).b <= 0))) {
        break lexical_join_78;
    }
    ((moom.wq)(this)).a__Void();
    return null;
    }
    life6_10 += 1;
    }
    if (!((life4_8 != null))) { continue lexical_cycle_11; }
    break lexical_cycle_11;
    }
    }
    lexicalValue1380_82_0 = life5_7;
    }
    if (!((life4_8 == null))) {
        lexicalValue1380_91_0 = lexicalValue1380_82_0;
        break lexical_join_91;
    }
    if (!((((net.minecraft.item.ItemStack)(lexicalValue1380_82_0)).b != ((net.minecraft.item.ItemStack)(p0)).b))) {
        break lexical_join_90;
    }
    ((moom.wq)(this)).a__Void();
    }
    lexicalValue1380_91_0 = life5_7;
    }
    return lexicalValue1380_91_0;
}


public net.minecraft.item.ItemStack a(int p0, int p1) {
net.minecraft.item.ItemStack forwardValue4425_17_0;
    net.minecraft.item.ItemStack forwardValue4425_42_0;
    net.minecraft.item.ItemStack forwardValue4425_59_0;
    net.minecraft.item.ItemStack spill4425_0;
    net.minecraft.item.ItemStack spill4425_1;
    long life3_3;
    net.minecraft.entity.Entity[] life5_5;
    net.minecraft.item.ItemStack life6_35;
    net.minecraft.item.ItemStack life6_51;
    forward_join_60: {
    forward_join_59: {
    forward_join_56: {
    forward_join_42: {
    forward_join_36: {
    forward_join_17: {
    life3_3 = (moom.wq.i ^ 92965133280830L);
    life5_5 = moom.v8.b__Arrayr3();
    spill4425_0 = (this.c)[p0];
    if (!((life5_5 == null))) {
        forwardValue4425_17_0 = spill4425_0;
        break forward_join_17;
    }
    if (!((spill4425_0 != null))) {
        break forward_join_60;
    }
    forwardValue4425_17_0 = (this.c)[p0];
    }
    if (!((life5_5 == null))) {
        forwardValue4425_42_0 = forwardValue4425_17_0;
        break forward_join_42;
    }
    if (!((((net.minecraft.item.ItemStack)(forwardValue4425_17_0)).b <= p1))) {
        break forward_join_36;
    }
    life6_35 = (this.c)[p0];
    (this.c)[p0] = null;
    ((moom.wq)(this)).a__Void();
    return life6_35;
    }
    forwardValue4425_42_0 = ((net.minecraft.item.ItemStack)((this.c)[p0])).a(((int)(p1)));
    }
    life6_51 = forwardValue4425_42_0;
    spill4425_1 = (this.c)[p0];
    if (!((life5_5 == null))) {
        forwardValue4425_59_0 = spill4425_1;
        break forward_join_59;
    }
    if (!((((net.minecraft.item.ItemStack)(spill4425_1)).b == 0))) {
        break forward_join_56;
    }
    (this.c)[p0] = null;
    }
    ((moom.wq)(this)).a__Void();
    forwardValue4425_59_0 = life6_51;
    }
    return forwardValue4425_59_0;
    }
    return null;
}


public net.minecraft.item.ItemStack a__xW(int p0) {
int forwardValue4431_11_0;
    net.minecraft.item.ItemStack forwardValue4431_21_0;
    int spill4431_0;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_21: {
    forward_join_20: {
    forward_join_11: {
    life2_3 = (moom.wq.i ^ 14991423648269L);
    life4_5 = moom.v8.b__Arrayr3();
    spill4431_0 = p0;
    if (!((life4_5 == null))) {
        forwardValue4431_11_0 = spill4431_0;
        break forward_join_11;
    }
    if (!((spill4431_0 >= 0))) {
        break forward_join_20;
    }
    forwardValue4431_11_0 = p0;
    }
    if (!((forwardValue4431_11_0 < (this.c).length))) {
        break forward_join_20;
    }
    forwardValue4431_21_0 = (this.c)[p0];
    break forward_join_21;
    }
    forwardValue4431_21_0 = null;
    }
    return forwardValue4431_21_0;
}


public void a(net.minecraft.inventory.IInvBasic p0) {
java.util.List forwardValue4426_16_0;
    java.util.List spill4426_0;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_16: {
    forward_join_14: {
    life2_3 = (moom.wq.i ^ 3679425475885L);
    life4_5 = moom.v8.b__Arrayr3();
    spill4426_0 = this.d;
    if (!((life4_5 == null))) {
        forwardValue4426_16_0 = spill4426_0;
        break forward_join_16;
    }
    if (!((spill4426_0 == null))) {
        break forward_join_14;
    }
    this.d = ((java.util.List)(com.google.common.collect.Lists.newArrayList()));
    }
    forwardValue4426_16_0 = this.d;
    }
    ((java.util.List)(forwardValue4426_16_0)).add(((java.lang.Object)(p0)));
    return;
}


public void a__Void() {
java.util.List lexicalValue1381_13_0;
    java.util.List spill1381_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    java.util.Iterator life4_20;
    net.minecraft.inventory.IInvBasic life5_27;
    lexical_join_27: {
    lexical_join_13: {
    life1_3 = (moom.wq.i ^ 62264369642844L);
    life3_5 = moom.v8.b__Arrayr3();
    spill1381_0 = this.d;
    if (!((life3_5 == null))) {
        lexicalValue1381_13_0 = spill1381_0;
        break lexical_join_13;
    }
    if (!((spill1381_0 != null))) {
        break lexical_join_27;
    }
    lexicalValue1381_13_0 = this.d;
    }
    life4_20 = ((java.util.List)(lexicalValue1381_13_0)).iterator();
    lexical_cycle_15: while (true) {
    if (!(((java.util.Iterator)(life4_20)).hasNext())) {
        break lexical_join_27;
    }
    life5_27 = ((net.minecraft.inventory.IInvBasic)(((java.util.Iterator)(life4_20)).next()));
    ((net.minecraft.inventory.IInvBasic)(life5_27)).a(((moom.wq)(this)));
    if (!((life3_5 != null))) { continue lexical_cycle_15; }
    break lexical_cycle_15;
    }
    }
    return;
}


public net.minecraft.util.IChatComponent a__C5() {
moom.CJ forwardValue4428_20_0;
    long life1_3;
    forward_join_20: {
    forward_join_13: {
    life1_3 = (moom.wq.i ^ 99008492350831L);
    if (!(((moom.wq)(this)).e__Boolean())) {
        break forward_join_13;
    }
    forwardValue4428_20_0 = new moom.CM(((moom.wq)(this)).a__String());
    break forward_join_20;
    }
    forwardValue4428_20_0 = new moom.CN(((moom.wq)(this)).a__String(), new java.lang.Object[0]);
    }
    return forwardValue4428_20_0;
}


public void a(java.lang.String p0) {
this.e = ((boolean)(true));
    this.a = ((java.lang.String)(p0));
    return;
}


public java.lang.String a__String() {
return this.a;
}

}
