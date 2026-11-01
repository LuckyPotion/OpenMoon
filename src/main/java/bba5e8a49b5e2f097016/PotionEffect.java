package net.minecraft.potion;


public class PotionEffect {

private static final org.apache.logging.log4j.Logger a;

private final int b;

private int c;

private int d;

private boolean e;

private boolean f;

private boolean g;

private boolean h;

private static java.lang.String[] i;

private static final long j;

public PotionEffect(net.minecraft.potion.PotionEffect p0) {
super();
    this.b = p0.b;
    this.c = p0.c;
    this.d = p0.d;
    this.f = p0.f;
    this.h = p0.h;
}


public PotionEffect(int p0, int p1, int p2, boolean p3, boolean p4) {
super();
    this.b = p0;
    this.c = p1;
    this.d = p2;
    this.f = p3;
    this.h = p4;
}


public PotionEffect(int p0, int p1, int p2) {
this(p0, p1, p2, false, true);
}


public PotionEffect(int p0, int p1) {
this(p0, p1, 0);
    return;
}


static {
j = ((long)(((moom._a)(moom._c.a(((long)(5960970293632671413L)), ((long)(-4385380366678906744L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(261736879336062L)))));
    java.lang.String[] __sourceSpill3461_7 = new java.lang.String[4];
    a = ((org.apache.logging.log4j.Logger)(org.apache.logging.log4j.LogManager.getLogger()));
    net.minecraft.potion.PotionEffect.b(((java.lang.String[])(__sourceSpill3461_7)));
}


public boolean equals(java.lang.Object p0) {
int forwardValue5551_17_0;
    int forwardValue5551_29_0;
    int forwardValue5551_29_1;
    int forwardValue5551_36_0;
    int forwardValue5551_36_1;
    int forwardValue5551_43_0;
    int forwardValue5551_43_1;
    int forwardValue5551_52_0;
    int forwardValue5551_52_1;
    int forwardValue5551_54_0;
    int forwardValue5551_56_0;
    int spill5551_0;
    int spill5551_1;
    int spill5551_2;
    boolean spill5551_3;
    long life2_3;
    java.lang.String[] life4_5;
    net.minecraft.potion.PotionEffect life5_16;
    forward_join_56: {
    forward_join_55: {
    forward_join_54: {
    forward_join_52: {
    forward_join_43: {
    forward_join_36: {
    forward_join_29: {
    forward_join_18: {
    forward_join_17: {
    forward_join_16: {
    life2_3 = (net.minecraft.potion.PotionEffect.j ^ 94101237278811L);
    life4_5 = net.minecraft.potion.PotionEffect.b__ArrayString();
    spill5551_0 = ((p0 instanceof net.minecraft.potion.PotionEffect) ? 1 : 0);
    if (!((life4_5 != null))) {
        forwardValue5551_17_0 = spill5551_0;
        break forward_join_17;
    }
    if (!((spill5551_0 != 0))) {
        break forward_join_16;
    }
    life5_16 = ((net.minecraft.potion.PotionEffect)(p0));
    if (!((life4_5 == null))) {
        break forward_join_18;
    }
    }
    forwardValue5551_17_0 = 0;
    }
    return ((forwardValue5551_17_0) != 0);
    }
    spill5551_1 = this.b;
    spill5551_2 = ((net.minecraft.potion.PotionEffect)(life5_16)).b;
    if (!((life4_5 != null))) {
        forwardValue5551_29_0 = spill5551_1;
        forwardValue5551_29_1 = spill5551_2;
        break forward_join_29;
    }
    if (!((spill5551_1 == spill5551_2))) {
        break forward_join_55;
    }
    forwardValue5551_29_0 = this.d;
    forwardValue5551_29_1 = ((net.minecraft.potion.PotionEffect)(life5_16)).d;
    }
    if (!((life4_5 != null))) {
        forwardValue5551_36_0 = forwardValue5551_29_0;
        forwardValue5551_36_1 = forwardValue5551_29_1;
        break forward_join_36;
    }
    if (!((forwardValue5551_29_0 == forwardValue5551_29_1))) {
        break forward_join_55;
    }
    forwardValue5551_36_0 = this.c;
    forwardValue5551_36_1 = ((net.minecraft.potion.PotionEffect)(life5_16)).c;
    }
    if (!((life4_5 != null))) {
        forwardValue5551_43_0 = forwardValue5551_36_0;
        forwardValue5551_43_1 = forwardValue5551_36_1;
        break forward_join_43;
    }
    if (!((forwardValue5551_36_0 == forwardValue5551_36_1))) {
        break forward_join_55;
    }
    forwardValue5551_43_0 = ((this.e) ? 1 : 0);
    forwardValue5551_43_1 = ((((net.minecraft.potion.PotionEffect)(life5_16)).e) ? 1 : 0);
    }
    if (!((life4_5 != null))) {
        forwardValue5551_52_0 = forwardValue5551_43_0;
        forwardValue5551_52_1 = forwardValue5551_43_1;
        break forward_join_52;
    }
    if (!((forwardValue5551_43_0 == forwardValue5551_43_1))) {
        break forward_join_55;
    }
    spill5551_3 = this.f;
    if (!((life4_5 != null))) {
        forwardValue5551_54_0 = ((spill5551_3) ? 1 : 0);
        break forward_join_54;
    }
    forwardValue5551_52_0 = ((spill5551_3) ? 1 : 0);
    forwardValue5551_52_1 = ((((net.minecraft.potion.PotionEffect)(life5_16)).f) ? 1 : 0);
    }
    if (!((forwardValue5551_52_0 == forwardValue5551_52_1))) {
        break forward_join_55;
    }
    forwardValue5551_54_0 = 1;
    }
    forwardValue5551_56_0 = forwardValue5551_54_0;
    break forward_join_56;
    }
    forwardValue5551_56_0 = 0;
    }
    return ((forwardValue5551_56_0) != 0);
}


public java.lang.String toString() {
net.minecraft.potion.PotionEffect forwardValue5552_26_0;
    int forwardValue5552_41_0;
    int forwardValue5552_52_0;
    java.lang.String forwardValue5552_57_0;
    java.lang.String[] spill5552_0;
    net.minecraft.potion.PotionEffect spill5552_1;
    boolean spill5552_2;
    long life1_3;
    java.lang.String life4_6;
    java.lang.String[] life3_7;
    java.lang.String life4_25;
    forward_join_57: {
    forward_join_56: {
    forward_join_52: {
    forward_join_47: {
    forward_join_41: {
    forward_join_39: {
    forward_join_31: {
    forward_join_26: {
    forward_join_25: {
    life1_3 = (net.minecraft.potion.PotionEffect.j ^ 59351789719879L);
    spill5552_0 = net.minecraft.potion.PotionEffect.b__ArrayString();
    life4_6 = "";
    life3_7 = spill5552_0;
    spill5552_1 = this;
    if (!((life3_7 != null))) {
        forwardValue5552_26_0 = spill5552_1;
        break forward_join_26;
    }
    if (!((((net.minecraft.potion.PotionEffect)(spill5552_1)).c() > 0))) {
        break forward_join_25;
    }
    life4_25 = __sourceIntrinsic_a86c261fcdee_invokedynamic5552_6(((net.minecraft.potion.PotionEffect)(this)).a__String(), (this.c() + 1), this.b());
    if (!((life3_7 == null))) {
        break forward_join_31;
    }
    }
    forwardValue5552_26_0 = this;
    }
    life4_25 = __sourceIntrinsic_a86c261fcdee_invokedynamic5552_9(((net.minecraft.potion.PotionEffect)(forwardValue5552_26_0)).a__String(), this.b());
    }
    spill5552_2 = this.e;
    if (!((life3_7 != null))) {
        forwardValue5552_41_0 = ((spill5552_2) ? 1 : 0);
        break forward_join_41;
    }
    if (!(spill5552_2)) {
        break forward_join_39;
    }
    life4_25 = __sourceIntrinsic_a86c261fcdee_invokedynamic5552_12(life4_25);
    }
    forwardValue5552_41_0 = ((this.h) ? 1 : 0);
    }
    if (!((life3_7 != null))) {
        forwardValue5552_52_0 = forwardValue5552_41_0;
        break forward_join_52;
    }
    if (!((forwardValue5552_41_0 == 0))) {
        break forward_join_47;
    }
    life4_25 = __sourceIntrinsic_a86c261fcdee_invokedynamic5552_15(life4_25);
    }
    forwardValue5552_52_0 = ((((net.minecraft.potion.Potion)((net.minecraft.potion.Potion.a)[this.b])).d()) ? 1 : 0);
    }
    if (!((forwardValue5552_52_0 != 0))) {
        break forward_join_56;
    }
    forwardValue5552_57_0 = __sourceIntrinsic_a86c261fcdee_invokedynamic5552_20(life4_25);
    break forward_join_57;
    }
    forwardValue5552_57_0 = life4_25;
    }
    return forwardValue5552_57_0;
}


public int hashCode() {
return this.b;
}


public void b(boolean p0) {
this.g = ((boolean)(p0));
    return;
}


public static java.lang.String[] b__ArrayString() {
return net.minecraft.potion.PotionEffect.i;
}


public boolean b__Boolean() {
return ((((this.h) ? 1 : 0)) != 0);
}


public int b() {
return this.c;
}


public static void b(java.lang.String[] p0) {
net.minecraft.potion.PotionEffect.i = ((java.lang.String[])(p0));
    return;
}


public boolean c__Boolean() {
return ((((this.g) ? 1 : 0)) != 0);
}


public int c() {
return this.d;
}


private int d() {
int spill1134_0;
    net.minecraft.potion.PotionEffect __stackOp1134_0_0 = this;
    net.minecraft.potion.PotionEffect __stackOp1134_2_0 = __stackOp1134_0_0;
    int __stackOp1134_2_1 = (((net.minecraft.potion.PotionEffect)(__stackOp1134_0_0)).c - 1);
    spill1134_0 = __stackOp1134_2_1;
    ((net.minecraft.potion.PotionEffect)(__stackOp1134_2_0)).c = ((int)(__stackOp1134_2_1));
    return spill1134_0;
}


public net.minecraft.nbt.NBTTagCompound a__yw(net.minecraft.nbt.NBTTagCompound p0) {
((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("Id")), ((byte)(((byte) this.a()))));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("Amplifier")), ((byte)(((byte) this.c()))));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Void(((java.lang.String)("Duration")), ((int)(this.b())));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("Ambient")), ((boolean)(((net.minecraft.potion.PotionEffect)(this)).a__Boolean())));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("ShowParticles")), ((boolean)(((net.minecraft.potion.PotionEffect)(this)).b__Boolean())));
    return p0;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public static net.minecraft.potion.PotionEffect a(net.minecraft.nbt.NBTTagCompound p0) {
int forwardValue610_15_0;
    int forwardValue610_46_0;
    java.lang.String[] spill610_0;
    int spill610_1;
    boolean spill610_2;
    long life1_3;
    int life4_8;
    java.lang.String[] life3_9;
    int life5_31;
    int life6_35;
    int life7_39;
    int life8_41;
    forward_join_56: {
    forward_join_47: {
    forward_join_46: {
    forward_join_15: {
    life1_3 = (net.minecraft.potion.PotionEffect.j ^ 54855987147758L);
    spill610_0 = net.minecraft.potion.PotionEffect.b__ArrayString();
    life4_8 = ((net.minecraft.nbt.NBTTagCompound)(p0)).b__sourceReturn_d4c7a9581c(((java.lang.String)("Id")));
    life3_9 = spill610_0;
    spill610_1 = life4_8;
    if (!((life3_9 != null))) {
        forwardValue610_15_0 = spill610_1;
        break forward_join_15;
    }
    if (!((spill610_1 >= 0))) {
        break forward_join_56;
    }
    forwardValue610_15_0 = life4_8;
    }
    if (!((forwardValue610_15_0 < (net.minecraft.potion.Potion.a).length))) {
        break forward_join_56;
    }
    if (!(((net.minecraft.potion.Potion.a)[life4_8] != null))) {
        break forward_join_56;
    }
    life5_31 = ((net.minecraft.nbt.NBTTagCompound)(p0)).b__sourceReturn_d4c7a9581c(((java.lang.String)("Amplifier")));
    life6_35 = ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Int(((java.lang.String)("Duration")));
    life7_39 = ((((net.minecraft.nbt.NBTTagCompound)(p0)).b__Boolean(((java.lang.String)("Ambient")))) ? 1 : 0);
    life8_41 = 1;
    spill610_2 = ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Boolean(((java.lang.String)("ShowParticles")), ((int)(1)));
    if (!((life3_9 != null))) {
        forwardValue610_46_0 = ((spill610_2) ? 1 : 0);
        break forward_join_46;
    }
    if (!(spill610_2)) {
        break forward_join_47;
    }
    forwardValue610_46_0 = ((((net.minecraft.nbt.NBTTagCompound)(p0)).b__Boolean(((java.lang.String)("ShowParticles")))) ? 1 : 0);
    }
    life8_41 = forwardValue610_46_0;
    }
    return new net.minecraft.potion.PotionEffect(life4_8, life6_35, life5_31, ((life7_39) != 0), ((life8_41) != 0));
    }
    return null;
}


public boolean a__Boolean() {
return ((((this.f) ? 1 : 0)) != 0);
}


public void a(boolean p0) {
this.e = ((boolean)(p0));
    return;
}


public int a() {
return this.b;
}


public void a(net.minecraft.potion.PotionEffect p0) {
int forwardValue5549_20_0;
    int forwardValue5549_20_1;
    int forwardValue5549_39_0;
    int forwardValue5549_39_1;
    int forwardValue5549_57_0;
    net.minecraft.potion.PotionEffect forwardValue5549_68_0;
    int spill5549_0;
    int spill5549_1;
    int spill5549_2;
    int spill5549_3;
    net.minecraft.potion.PotionEffect spill5549_4;
    net.minecraft.potion.PotionEffect spill5549_5;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_68: {
    forward_join_67: {
    forward_join_57: {
    forward_join_53: {
    forward_join_39: {
    forward_join_33: {
    forward_join_20: {
    forward_join_16: {
    life2_3 = (net.minecraft.potion.PotionEffect.j ^ 5654673316773L);
    life4_5 = net.minecraft.potion.PotionEffect.b__ArrayString();
    spill5549_0 = this.b;
    spill5549_1 = ((net.minecraft.potion.PotionEffect)(p0)).b;
    if (!((life4_5 != null))) {
        forwardValue5549_20_0 = spill5549_0;
        forwardValue5549_20_1 = spill5549_1;
        break forward_join_20;
    }
    if (!((spill5549_0 != spill5549_1))) {
        break forward_join_16;
    }
    ((org.apache.logging.log4j.Logger)(net.minecraft.potion.PotionEffect.a)).warn(((java.lang.String)("This method should only be called for matching effects!")));
    }
    forwardValue5549_20_0 = ((net.minecraft.potion.PotionEffect)(p0)).d;
    forwardValue5549_20_1 = this.d;
    }
    if (!((life4_5 != null))) {
        forwardValue5549_39_0 = forwardValue5549_20_0;
        forwardValue5549_39_1 = forwardValue5549_20_1;
        break forward_join_39;
    }
    if (!((forwardValue5549_20_0 > forwardValue5549_20_1))) {
        break forward_join_33;
    }
    this.d = ((int)(((net.minecraft.potion.PotionEffect)(p0)).d));
    this.c = ((int)(((net.minecraft.potion.PotionEffect)(p0)).c));
    if (!((life4_5 == null))) {
        break forward_join_67;
    }
    }
    spill5549_2 = ((net.minecraft.potion.PotionEffect)(p0)).d;
    if (!((life4_5 != null))) {
        forwardValue5549_57_0 = spill5549_2;
        break forward_join_57;
    }
    forwardValue5549_39_0 = spill5549_2;
    forwardValue5549_39_1 = this.d;
    }
    if (!((forwardValue5549_39_0 == forwardValue5549_39_1))) {
        break forward_join_53;
    }
    spill5549_3 = this.c;
    if (!((life4_5 != null))) {
        forwardValue5549_57_0 = spill5549_3;
        break forward_join_57;
    }
    if (!((spill5549_3 < ((net.minecraft.potion.PotionEffect)(p0)).c))) {
        break forward_join_53;
    }
    this.c = ((int)(((net.minecraft.potion.PotionEffect)(p0)).c));
    if (!((life4_5 == null))) {
        break forward_join_67;
    }
    }
    spill5549_4 = p0;
    if (!((life4_5 != null))) {
        forwardValue5549_68_0 = spill5549_4;
        break forward_join_68;
    }
    forwardValue5549_57_0 = ((((net.minecraft.potion.PotionEffect)(spill5549_4)).f) ? 1 : 0);
    }
    if (!((forwardValue5549_57_0 == 0))) {
        break forward_join_67;
    }
    spill5549_5 = this;
    if (!((life4_5 != null))) {
        forwardValue5549_68_0 = spill5549_5;
        break forward_join_68;
    }
    if (!(((net.minecraft.potion.PotionEffect)(spill5549_5)).f)) {
        break forward_join_67;
    }
    this.f = ((boolean)(((net.minecraft.potion.PotionEffect)(p0)).f));
    }
    forwardValue5549_68_0 = this;
    }
    ((net.minecraft.potion.PotionEffect)(forwardValue5549_68_0)).h = ((boolean)(((net.minecraft.potion.PotionEffect)(p0)).h));
    return;
}


public boolean a__Boolean(net.minecraft.entity.EntityLivingBase p0) {
int forwardValue5550_28_0;
    int forwardValue5550_31_0;
    int forwardValue5550_35_0;
    int forwardValue5550_37_0;
    int spill5550_0;
    boolean spill5550_1;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_37: {
    forward_join_36: {
    forward_join_35: {
    forward_join_31: {
    forward_join_29: {
    forward_join_28: {
    forward_join_26: {
    life2_3 = (net.minecraft.potion.PotionEffect.j ^ 29948250483507L);
    life4_5 = net.minecraft.potion.PotionEffect.b__ArrayString();
    spill5550_0 = this.c;
    if (!((life4_5 != null))) {
        forwardValue5550_31_0 = spill5550_0;
        break forward_join_31;
    }
    if (!((spill5550_0 > 0))) {
        break forward_join_29;
    }
    spill5550_1 = ((net.minecraft.potion.Potion)((net.minecraft.potion.Potion.a)[this.b])).a__Boolean(((int)(this.c)), ((int)(this.d)));
    if (!((life4_5 != null))) {
        forwardValue5550_28_0 = ((spill5550_1) ? 1 : 0);
        break forward_join_28;
    }
    if (!(spill5550_1)) {
        break forward_join_26;
    }
    this.a(((net.minecraft.entity.EntityLivingBase)(p0)));
    }
    forwardValue5550_28_0 = this.d();
    }
    recovery.source.CarrierOps.discard(forwardValue5550_28_0);
    }
    forwardValue5550_31_0 = this.c;
    }
    if (!((life4_5 != null))) {
        forwardValue5550_35_0 = forwardValue5550_31_0;
        break forward_join_35;
    }
    if (!((forwardValue5550_31_0 > 0))) {
        break forward_join_36;
    }
    forwardValue5550_35_0 = 1;
    }
    forwardValue5550_37_0 = forwardValue5550_35_0;
    break forward_join_37;
    }
    forwardValue5550_37_0 = 0;
    }
    return ((forwardValue5550_37_0) != 0);
}


public void a(net.minecraft.entity.EntityLivingBase p0) {
long local2 = (net.minecraft.potion.PotionEffect.j ^ 69631254764772L);
    if ((this.c > 0)) {
        ((net.minecraft.potion.Potion)((net.minecraft.potion.Potion.a)[this.b])).a(((net.minecraft.entity.EntityLivingBase)(p0)), ((int)(this.d)));
    }
    return;
}


public java.lang.String a__String() {
return ((net.minecraft.potion.Potion)((net.minecraft.potion.Potion.a)[this.b])).a__String();
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_invokedynamic5552_6(java.lang.String a0, int a1, int a2) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_invokedynamic5552_9(java.lang.String a0, int a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_invokedynamic5552_12(java.lang.String a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_invokedynamic5552_15(java.lang.String a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_invokedynamic5552_20(java.lang.String a0) throws E;
}
