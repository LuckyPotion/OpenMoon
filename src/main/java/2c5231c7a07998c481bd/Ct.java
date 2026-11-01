package moom;


public class Ct extends net.minecraft.tileentity.TileEntity {

public net.minecraft.util.IChatComponent[] l;

public int m;

private boolean n;

private net.minecraft.entity.player.EntityPlayer o;

private moom.qN p;

private static long q;

public Ct() {
super();
    this.l = ((net.minecraft.util.IChatComponent[])(new net.minecraft.util.IChatComponent[] {new moom.CM(""), new moom.CM(""), new moom.CM(""), new moom.CM("")}));
    this.m = ((int)(-1));
    this.n = ((boolean)(true));
    this.p = ((moom.qN)(new moom.qN()));
    return;
}


static {
moom.Ct.q = (moom._c.a(8073738090841477045L, -1099105759071318187L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(143394882498185L);
}

private static native <E extends Throwable> void __sourceHandlerCall_cf54897d8e42de94ce6b(moom.Ct a0, net.minecraft.nbt.NBTTagCompound a1) throws E;
private static final class __SourceHandler_cf54897d8e42de94ce6b {

public static void f598(moom.Ct receiver, net.minecraft.nbt.NBTTagCompound p0) throws Throwable {
    java.lang.String[] spill598_0;
    long life2_3;
    moom.Cy life5_15;
    java.lang.String[] life4_16;
    int life6_18;
    java.lang.String life7_28;
    net.minecraft.util.IChatComponent life8_31;
    forest_join_49: {
    forest_join_45: {
    life2_3 = (__fieldRead598_0() ^ 43465483916839L);
    __fieldWrite598_1(receiver, 0);
    spill598_0 = __call598_2();
    __call598_3(receiver, p0);
    life5_15 = new moom.Cy(receiver);
    life4_16 = spill598_0;
    life6_18 = 0;
    forest_cycle_19: while (true) {
    if (!((life6_18 < 4))) {
        break forest_join_45;
    }
    life7_28 = __call598_5(p0, __invokedynamic598_4((life6_18 + 1)));
    life8_31 = __call598_6(life7_28);
    (__fieldRead598_7(receiver))[life6_18] = __call598_8(life5_15, life8_31, null);
    if (!((life4_16 != null))) {
        break forest_join_49;
    }
    life6_18 += 1;
    if (!((life4_16 == null))) {
        continue forest_cycle_19;
    }
    break forest_cycle_19;
    }
    }
    __call598_10(__fieldRead598_9(receiver), p0);
    }
    return;
}
public static void h598_0(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call3059800_0(p0);
}
public static void h598_1(moom.b7 p0, moom.Ct p1, net.minecraft.nbt.NBTTagCompound p2, java.lang.String[] p3, moom.Cy p4, int p5, java.lang.String p6, net.minecraft.util.IChatComponent p7) throws Throwable {
    moom.b7 life8_2;
    java.lang.String life6_22;
    net.minecraft.util.IChatComponent life7_25;
    forest_join_39: {
    forest_join_35: {
    life8_2 = p0;
    (__fieldRead3059801_0(p1))[p5] = p7;
    forest_cycle_7: while (true) {
    forest_join_11: {
    p5 += 1;
    if (!((p3 == null))) {
        break forest_join_11;
    }
    break forest_join_35;
    }
    if (!((p5 < 4))) {
        break forest_join_35;
    }
    life6_22 = __call3059801_2(p2, __invokedynamic3059801_1((p5 + 1)));
    life7_25 = __call3059801_3(life6_22);
    (__fieldRead3059801_4(p1))[p5] = __call3059801_5(p4, life7_25, null);
    if (!((p3 != null))) {
        break forest_join_39;
    }
    continue forest_cycle_7;
    }
    }
    __call3059801_7(__fieldRead3059801_6(p1), p2);
    }
    return;
}
public static void h598_2(com.google.gson.JsonParseException p0, moom.Ct p1, net.minecraft.nbt.NBTTagCompound p2, java.lang.String[] p3, moom.Cy p4, int p5, java.lang.String p6, net.minecraft.util.IChatComponent p7) throws Throwable {
    com.google.gson.JsonParseException life7_2;
    java.lang.String life6_24;
    net.minecraft.util.IChatComponent life7_27;
    forest_join_42: {
    forest_join_38: {
    life7_2 = p0;
    (__fieldRead3059802_0(p1))[p5] = new moom.CM(p6);
    forest_cycle_10: while (true) {
    forest_join_14: {
    p5 += 1;
    if (!((p3 == null))) {
        break forest_join_14;
    }
    break forest_join_38;
    }
    if (!((p5 < 4))) {
        break forest_join_38;
    }
    life6_24 = __call3059802_2(p2, __invokedynamic3059802_1((p5 + 1)));
    life7_27 = __call3059802_3(life6_24);
    (__fieldRead3059802_4(p1))[p5] = __call3059802_5(p4, life7_27, null);
    if (!((p3 != null))) {
        break forest_join_42;
    }
    continue forest_cycle_10;
    }
    }
    __call3059802_7(__fieldRead3059802_6(p1), p2);
    }
    return;
}
private static native long __fieldRead598_0() throws Throwable;
private static native void __fieldWrite598_1(moom.Ct a0, int a1) throws Throwable;
private static native java.lang.String[] __call598_2() throws Throwable;
private static native void __call598_3(moom.Ct a0, net.minecraft.nbt.NBTTagCompound a1) throws Throwable;
private static native java.lang.String __invokedynamic598_4(int a0) throws Throwable;
private static native java.lang.String __call598_5(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.util.IChatComponent __call598_6(java.lang.String a0) throws Throwable;
private static native net.minecraft.util.IChatComponent[] __fieldRead598_7(moom.Ct a0) throws Throwable;
private static native net.minecraft.util.IChatComponent __call598_8(moom.Cy a0, net.minecraft.util.IChatComponent a1, java.lang.Object a2) throws Throwable;
private static native moom.qN __fieldRead598_9(moom.Ct a0) throws Throwable;
private static native void __call598_10(moom.qN a0, net.minecraft.nbt.NBTTagCompound a1) throws Throwable;
private static native com.google.gson.JsonParseException __call3059800_0(com.google.gson.JsonParseException a0) throws Throwable;
private static native net.minecraft.util.IChatComponent[] __fieldRead3059801_0(moom.Ct a0) throws Throwable;
private static native java.lang.String __invokedynamic3059801_1(int a0) throws Throwable;
private static native java.lang.String __call3059801_2(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.util.IChatComponent __call3059801_3(java.lang.String a0) throws Throwable;
private static native net.minecraft.util.IChatComponent[] __fieldRead3059801_4(moom.Ct a0) throws Throwable;
private static native net.minecraft.util.IChatComponent __call3059801_5(moom.Cy a0, net.minecraft.util.IChatComponent a1, java.lang.Object a2) throws Throwable;
private static native moom.qN __fieldRead3059801_6(moom.Ct a0) throws Throwable;
private static native void __call3059801_7(moom.qN a0, net.minecraft.nbt.NBTTagCompound a1) throws Throwable;
private static native net.minecraft.util.IChatComponent[] __fieldRead3059802_0(moom.Ct a0) throws Throwable;
private static native java.lang.String __invokedynamic3059802_1(int a0) throws Throwable;
private static native java.lang.String __call3059802_2(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.util.IChatComponent __call3059802_3(java.lang.String a0) throws Throwable;
private static native net.minecraft.util.IChatComponent[] __fieldRead3059802_4(moom.Ct a0) throws Throwable;
private static native net.minecraft.util.IChatComponent __call3059802_5(moom.Cy a0, net.minecraft.util.IChatComponent a1, java.lang.Object a2) throws Throwable;
private static native moom.qN __fieldRead3059802_6(moom.Ct a0) throws Throwable;
private static native void __call3059802_7(moom.qN a0, net.minecraft.nbt.NBTTagCompound a1) throws Throwable;

}


public boolean b() {
return ((((this.n) ? 1 : 0)) != 0);
}


public void b(net.minecraft.nbt.NBTTagCompound p0) {
java.lang.String[] spill548_0;
    long life2_3;
    java.lang.String[] life4_8;
    int life5_10;
    java.lang.String life6_19;
    lexical_join_36: {
    lexical_join_32: {
    life2_3 = (moom.Ct.q ^ 77741684119334L);
    spill548_0 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    super.b(((net.minecraft.nbt.NBTTagCompound)(p0)));
    life4_8 = spill548_0;
    life5_10 = 0;
    lexical_cycle_11: while (true) {
    if (!((life5_10 < 4))) {
        break lexical_join_32;
    }
    life6_19 = net.minecraft.util.IChatComponent$Serializer.a(((net.minecraft.util.IChatComponent)((this.l)[life5_10])));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)(__sourceIntrinsic_ac4a479fad6b_invokedynamic548_5((life5_10 + 1)))), ((java.lang.String)(life6_19)));
    life5_10 += 1;
    if (!((life4_8 != null))) {
        break lexical_join_36;
    }
    if (!((life4_8 == null))) { continue lexical_cycle_11; }
    break lexical_cycle_11;
    }
    }
    ((moom.qN)(this.p)).b(((net.minecraft.nbt.NBTTagCompound)(p0)));
    }
    return;
}


public net.minecraft.entity.player.EntityPlayer a__tn() {
return this.o;
}


public boolean a__Boolean(net.minecraft.entity.player.EntityPlayer p0) {
net.minecraft.util.IChatComponent lexicalValue547_34_0;
    moom.CO lexicalValue547_35_0;
    moom.v2 lexicalValue547_47_0;
    java.lang.String[] spill547_0;
    net.minecraft.util.IChatComponent spill547_1;
    moom.v2 spill547_2;
    long life2_3;
    moom.Cz life5_9;
    net.minecraft.util.IChatComponent[] life6_13;
    java.lang.String[] life4_14;
    int life7_17;
    int life8_19;
    net.minecraft.util.IChatComponent life9_26;
    moom.CO life10_40;
    moom.v2 life11_64;
    lexical_join_64: {
    life2_3 = (moom.Ct.q ^ 94482981205719L);
    life5_9 = new moom.Cz(this, p0);
    spill547_0 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    life6_13 = this.l;
    life4_14 = spill547_0;
    life7_17 = (life6_13).length;
    life8_19 = 0;
    lexical_cycle_20: while (true) {
    lexical_join_62: {
    lexical_join_61: {
    lexical_join_47: {
    lexical_join_35: {
    lexical_join_34: {
    lexical_join_33: {
    if (!((life8_19 < life7_17))) {
        break lexical_join_64;
    }
    life9_26 = (life6_13)[life8_19];
    spill547_1 = life9_26;
    if (!((life4_14 != null))) {
        lexicalValue547_34_0 = spill547_1;
        break lexical_join_34;
    }
    if (!((spill547_1 == null))) {
        break lexical_join_33;
    }
    lexicalValue547_35_0 = null;
    break lexical_join_35;
    }
    lexicalValue547_34_0 = life9_26;
    }
    lexicalValue547_35_0 = ((net.minecraft.util.IChatComponent)(lexicalValue547_34_0)).a__CO();
    }
    life10_40 = lexicalValue547_35_0;
    if (!((life4_14 != null))) {
        break lexical_join_62;
    }
    if (!((life10_40 != null))) {
        break lexical_join_61;
    }
    spill547_2 = ((moom.CO)(life10_40)).a__v2();
    if (!((life4_14 != null))) {
        lexicalValue547_47_0 = spill547_2;
        break lexical_join_47;
    }
    if (!((spill547_2 != null))) {
        break lexical_join_61;
    }
    lexicalValue547_47_0 = ((moom.CO)(life10_40)).a__v2();
    }
    life11_64 = lexicalValue547_47_0;
    if (!((life4_14 != null))) {
        break lexical_join_62;
    }
    if (!((((moom.v2)(life11_64)).a__aZ() == net.minecraft.event.ClickEvent$Action.RUN_COMMAND))) {
        break lexical_join_61;
    }
    ((net.minecraft.command.ICommandManager)(((moom.Bl)(moom.Bl.a__Bl())).a__qS())).a(((net.minecraft.command.ICommandSender)(life5_9)), ((java.lang.String)(((moom.v2)(life11_64)).a())));
    }
    life8_19 += 1;
    }
    if (!((life4_14 == null))) { continue lexical_cycle_20; }
    break lexical_cycle_20;
    }
    }
    return ((1) != 0);
}


public moom.qN a__sourceReturn_37f0d120e7() {
return this.p;
}


private static com.google.gson.JsonParseException a(com.google.gson.JsonParseException p0) {
return p0;
}


public moom.yK a__yK() {
net.minecraft.util.IChatComponent[] local1 = new net.minecraft.util.IChatComponent[4];
    java.lang.System.arraycopy(((java.lang.Object)(this.l)), ((int)(0)), ((java.lang.Object)(local1)), ((int)(0)), ((int)(4)));
    return new moom.Ak(this.d, this.e, local1);
}


public void a__Void(net.minecraft.nbt.NBTTagCompound p0) { __sourceHandlerCall_cf54897d8e42de94ce6b(this, p0); }


public void a(boolean p0) {
moom.Ct forwardValue1675_14_0;
    moom.Ct spill1675_0;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_16: {
    forward_join_14: {
    life2_3 = (moom.Ct.q ^ 995652941215L);
    life4_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    spill1675_0 = this;
    if (!((life4_5 != null))) {
        forwardValue1675_14_0 = spill1675_0;
        break forward_join_14;
    }
    ((moom.Ct)(spill1675_0)).n = ((boolean)(p0));
    if (!((!p0))) {
        break forward_join_16;
    }
    forwardValue1675_14_0 = this;
    }
    ((moom.Ct)(forwardValue1675_14_0)).o = ((net.minecraft.entity.player.EntityPlayer)(null));
    }
    return;
}


public void a(net.minecraft.entity.player.EntityPlayer p0) {
this.o = ((net.minecraft.entity.player.EntityPlayer)(p0));
    return;
}


public boolean g__Boolean() {
return ((1) != 0);
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ac4a479fad6b_invokedynamic548_5(int a0) throws E;
}
