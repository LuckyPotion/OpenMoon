package com.moon;


public class fM extends com.moon.e2<com.moon.module.impl.NoFall> {

private final java.util.List<moom.yK<?>> e;

private static final long f;

public fM() {
super(com.moon.module.impl.NoFall.class);
    this.e = new java.util.ArrayList();
}


static {
f = (moom._c.a(-2727045816012172098L, -4565912641333054819L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(236205190185808L);
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public void c() {
long life1_3;
    java.lang.String life3_15;
    life1_3 = (com.moon.fM.f ^ 9502274874885L);
    java.lang.String spill126_0 = net.minecraft.init.Items.b();
    java.util.List spill126_1 = this.e;
    net.minecraft.client.network.NetHandlerPlayClient __stackOp126_6_0 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fM.a)).K)).cm;
    net.minecraft.client.network.NetHandlerPlayClient spill126_2 = __stackOp126_6_0;
    java.util.Objects.requireNonNull(((java.lang.Object)(__stackOp126_6_0)));
    ((java.util.List)(spill126_1)).forEach(((java.util.function.Consumer)(__sourceIntrinsic_5b7380e7aa7c_invokedynamic126_8(spill126_2))));
    life3_15 = spill126_0;
    ((java.util.List)(this.e)).clear();
    if ((life3_15 != null)) {
        net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[3])));
    }
    return;
}


public void a(com.moon.event.MoveEvent p0) {
int forwardValue124_21_0;
    int spill124_0;
    long life2_3;
    java.lang.String life4_5;
    forward_join_26: {
    forward_join_21: {
    life2_3 = (com.moon.fM.f ^ 46159143220269L);
    life4_5 = net.minecraft.init.Items.b();
    if (!((((com.moon.event.MoveEvent)(p0)).getPhase() == com.moon.event.MovePhase.PRE))) {
        break forward_join_26;
    }
    spill124_0 = recovery.source.CarrierOps.dcmpl(((double)(((double) ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fM.a)).K)).L))), ((double)(0x1.4p1d)));
    if (!((life4_5 == null))) {
        forwardValue124_21_0 = spill124_0;
        break forward_join_21;
    }
    if (!((spill124_0 >= 0))) {
        break forward_join_26;
    }
    forwardValue124_21_0 = ((((com.moon.fM)(this)).a__sourceReturn_aae029aa0a()) ? 1 : 0);
    }
    if (!((forwardValue124_21_0 != 0))) {
        break forward_join_26;
    }
    ((com.moon.event.MoveEvent)(p0)).a(((boolean)(true)));
    }
    return;
}


public void a(com.moon.event.PacketEvent p0) {
int forwardValue125_17_0;
    int forwardValue125_54_0;
    int forwardValue125_62_0;
    int forwardValue125_70_0;
    int forwardValue125_76_0;
    int forwardValue125_82_0;
    boolean spill125_0;
    boolean spill125_1;
    boolean spill125_2;
    boolean spill125_3;
    java.util.List spill125_4;
    net.minecraft.client.network.NetHandlerPlayClient spill125_5;
    long life2_3;
    java.lang.String life4_5;
    forward_join_96: {
    forward_join_83: {
    forward_join_82: {
    forward_join_76: {
    forward_join_70: {
    forward_join_62: {
    forward_join_54: {
    forward_join_51: {
    forward_join_17: {
    life2_3 = (com.moon.fM.f ^ 105824911845160L);
    life4_5 = net.minecraft.init.Items.b();
    spill125_0 = ((com.moon.event.PacketEvent)(p0)).b__sourceReturn_aae029aa0a();
    if (!((life4_5 == null))) {
        forwardValue125_17_0 = ((spill125_0) ? 1 : 0);
        break forward_join_17;
    }
    if (!(spill125_0)) {
        break forward_join_96;
    }
    forwardValue125_17_0 = recovery.source.CarrierOps.dcmpl(((double)(((double) ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fM.a)).K)).L))), ((double)(0x1.4p1d)));
    }
    if (!((life4_5 == null))) {
        forwardValue125_54_0 = forwardValue125_17_0;
        break forward_join_54;
    }
    if (!((forwardValue125_17_0 >= 0))) {
        break forward_join_51;
    }
    spill125_1 = ((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fM.a)).K)).b1)).b;
    if (!((life4_5 == null))) {
        forwardValue125_54_0 = ((spill125_1) ? 1 : 0);
        break forward_join_54;
    }
    if (!((!spill125_1))) {
        break forward_join_51;
    }
    spill125_2 = ((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fM.a)).K)).b1)).c;
    if (!((life4_5 == null))) {
        forwardValue125_54_0 = ((spill125_2) ? 1 : 0);
        break forward_join_54;
    }
    if (!((!spill125_2))) {
        break forward_join_51;
    }
    spill125_3 = ((com.moon.fM)(this)).a__sourceReturn_aae029aa0a();
    if (!((life4_5 == null))) {
        forwardValue125_54_0 = ((spill125_3) ? 1 : 0);
        break forward_join_54;
    }
    if (!(spill125_3)) {
        break forward_join_51;
    }
    ((java.util.List)(this.e)).add(((java.lang.Object)(((com.moon.event.PacketEvent)(p0)).getPacket())));
    ((com.moon.event.PacketEvent)(p0)).setCancelled(((boolean)(true)));
    if (!((life4_5 != null))) {
        break forward_join_96;
    }
    }
    forwardValue125_54_0 = ((((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fM.a)).K)).A) ? 1 : 0);
    }
    if (!((life4_5 == null))) {
        forwardValue125_62_0 = forwardValue125_54_0;
        break forward_join_62;
    }
    if (!((forwardValue125_54_0 == 0))) {
        break forward_join_83;
    }
    forwardValue125_62_0 = recovery.source.CarrierOps.fcmpg(((float)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fM.a)).K)).L)), ((float)(0x1.0p1f)));
    }
    if (!((life4_5 == null))) {
        forwardValue125_70_0 = forwardValue125_62_0;
        break forward_join_70;
    }
    if (!((forwardValue125_62_0 > 0))) {
        break forward_join_83;
    }
    forwardValue125_70_0 = recovery.source.CarrierOps.dcmpg(((double)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fM.a)).K)).o)), ((double)(0x0.0p0d)));
    }
    if (!((life4_5 == null))) {
        forwardValue125_76_0 = forwardValue125_70_0;
        break forward_join_76;
    }
    if (!((forwardValue125_70_0 >= 0))) {
        break forward_join_83;
    }
    forwardValue125_76_0 = ((((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fM.a)).K)).F) ? 1 : 0);
    }
    if (!((life4_5 == null))) {
        forwardValue125_82_0 = forwardValue125_76_0;
        break forward_join_82;
    }
    if (!((forwardValue125_76_0 == 0))) {
        break forward_join_83;
    }
    forwardValue125_82_0 = ((((moom.jI)(((net.minecraft.client.Minecraft)(com.moon.fM.a)).F)).a__Boolean()) ? 1 : 0);
    }
    if (!((forwardValue125_82_0 != 0))) {
        break forward_join_96;
    }
    }
    spill125_4 = this.e;
    net.minecraft.client.network.NetHandlerPlayClient __stackOp125_48_0 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fM.a)).K)).cm;
    spill125_5 = __stackOp125_48_0;
    java.util.Objects.requireNonNull(((java.lang.Object)(__stackOp125_48_0)));
    ((java.util.List)(spill125_4)).forEach(((java.util.function.Consumer)(__sourceIntrinsic_0d28a2dd2629_invokedynamic125_50(spill125_5))));
    ((java.util.List)(this.e)).clear();
    }
    return;
}


public boolean a__sourceReturn_aae029aa0a() {
int lexicalValue28_53_0;
    boolean spill28_0;
    long life1_3;
    java.lang.String life3_5;
    int life4_14;
    moom.CA life5_36;
    lexical_join_53: {
    lexical_join_52: {
    lexical_join_11: {
    life1_3 = (com.moon.fM.f ^ 43515452201349L);
    life3_5 = net.minecraft.init.Items.b();
    if (!((((net.minecraft.client.Minecraft)(com.moon.fM.a)).K == null))) {
        break lexical_join_11;
    }
    return ((1) != 0);
    }
    life4_14 = 0;
    lexical_cycle_13: while (true) {
    lexical_join_50: {
    lexical_join_49: {
    if (!((recovery.source.CarrierOps.dcmpg(((double)(((double) life4_14))), ((double)((((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fM.a)).K)).o + ((double) ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fM.a)).K)).e__Float()))))) < 0))) {
        break lexical_join_52;
    }
    life5_36 = ((moom.CA)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fM.a)).K)).b())).c(((double)(0x0.0p0d)), ((double)(((double) (-life4_14)))), ((double)(0x0.0p0d)));
    if (!((life3_5 == null))) {
        break lexical_join_50;
    }
    spill28_0 = ((java.util.List)(((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(com.moon.fM.a)).I)).a(((net.minecraft.entity.Entity)(((net.minecraft.client.Minecraft)(com.moon.fM.a)).K)), ((moom.CA)(life5_36))))).isEmpty();
    if (!((life3_5 == null))) {
        lexicalValue28_53_0 = ((spill28_0) ? 1 : 0);
        break lexical_join_53;
    }
    if (!((!spill28_0))) {
        break lexical_join_49;
    }
    return ((1) != 0);
    }
    life4_14 += 1;
    }
    if (!((life3_5 != null))) { continue lexical_cycle_13; }
    break lexical_cycle_13;
    }
    }
    lexicalValue28_53_0 = 0;
    }
    return ((lexicalValue28_53_0) != 0);
}


private static native <E extends Throwable> java.util.function.Consumer __sourceIntrinsic_5b7380e7aa7c_invokedynamic126_8(net.minecraft.client.network.NetHandlerPlayClient a0) throws E;

private static native <E extends Throwable> java.util.function.Consumer __sourceIntrinsic_0d28a2dd2629_invokedynamic125_50(net.minecraft.client.network.NetHandlerPlayClient a0) throws E;
}
