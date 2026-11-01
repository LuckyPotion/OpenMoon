package com.moon;


public class gI extends com.moon.gH {

private final java.util.List<moom.yK> c;

private int d;

private double e;

private static final long f;

public gI() {
super();
    this.c = new java.util.LinkedList();
}


static {
f = (moom._c.a(3652003945187749037L, 384605451480406208L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(277013714616500L);
}


public void b() {
return;
}


public void c() {
this.d = ((int)(0));
    return;
}


public void a(com.moon.event.MoveEvent p0) {
int forwardValue248_36_0;
    int forwardValue248_72_0;
    double forwardValue248_79_0;
    int forwardValue248_85_0;
    int forwardValue248_94_0;
    boolean spill248_0;
    boolean spill248_1;
    boolean spill248_2;
    boolean spill248_3;
    boolean spill248_4;
    boolean spill248_5;
    long life2_3;
    int life4_5;
    forward_join_97: {
    forward_join_94: {
    forward_join_85: {
    forward_join_82: {
    forward_join_79: {
    forward_join_78: {
    forward_join_72: {
    forward_join_70: {
    forward_join_36: {
    forward_join_33: {
    life2_3 = (com.moon.gI.f ^ 135591568016033L);
    life4_5 = ((net.minecraft.nbt.NBTTagCompound.c()) ? 1 : 0);
    if (!((((com.moon.event.MoveEvent)(p0)).getPhase() == com.moon.event.MovePhase.BEFORE))) {
        break forward_join_97;
    }
    spill248_0 = ((moom.pz)(((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(com.moon.gI.a)).W)).ap)).a__Boolean();
    if (!((life4_5 != 0))) {
        forwardValue248_36_0 = ((spill248_0) ? 1 : 0);
        break forward_join_36;
    }
    if (!(spill248_0)) {
        break forward_join_33;
    }
    spill248_1 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.gI.a)).K)).ae();
    if (!((life4_5 != 0))) {
        forwardValue248_36_0 = ((spill248_1) ? 1 : 0);
        break forward_join_36;
    }
    if (!(spill248_1)) {
        break forward_join_33;
    }
    moom.pz.a(((int)(((moom.pz)(((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(com.moon.gI.a)).W)).ar)).b())), ((boolean)(false)));
    ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.gI.a)).K)).c(((boolean)(false)));
    }
    forwardValue248_36_0 = recovery.source.CarrierOps.dcmpl(((double)(com.moon.nJ.b())), ((double)(0x1.ba5e353f7ced9p-3d)));
    }
    if (!((life4_5 != 0))) {
        forwardValue248_85_0 = forwardValue248_36_0;
        break forward_join_85;
    }
    if (!((forwardValue248_36_0 > 0))) {
        break forward_join_82;
    }
    spill248_2 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.gI.a)).K)).ae();
    if (!((life4_5 != 0))) {
        forwardValue248_85_0 = ((spill248_2) ? 1 : 0);
        break forward_join_85;
    }
    if (!(spill248_2)) {
        break forward_join_82;
    }
    spill248_3 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.gI.a)).K)).A;
    if (!((life4_5 != 0))) {
        forwardValue248_85_0 = ((spill248_3) ? 1 : 0);
        break forward_join_85;
    }
    if (!(spill248_3)) {
        break forward_join_82;
    }
    spill248_4 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.gI.a)).K)).b__Boolean(((int)(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.d)).I)));
    if (!((life4_5 != 0))) {
        forwardValue248_85_0 = ((spill248_4) ? 1 : 0);
        break forward_join_85;
    }
    if (!(spill248_4)) {
        break forward_join_82;
    }
    spill248_5 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.ScaffoldWalk)(((com.moon.gI)(this)).b)).e__kV())).getValue())))).booleanValue();
    if (!((life4_5 != 0))) {
        forwardValue248_72_0 = ((spill248_5) ? 1 : 0);
        break forward_join_72;
    }
    if (!(spill248_5)) {
        break forward_join_70;
    }
    forwardValue248_79_0 = 0x1.ba5e353f7ced9p-4d;
    break forward_join_79;
    }
    forwardValue248_72_0 = ((com.moon.o4)(com.moon.o4.a__o4())).b();
    }
    if (!((forwardValue248_72_0 > ((com.viaversion.viaversion.api.protocol.version.ProtocolVersion)(((com.moon.cl)(com.moon.cl.R1_12_2)).a())).getVersion()))) {
        break forward_join_78;
    }
    forwardValue248_79_0 = 0x1.6872b020c49bap-3d;
    break forward_join_79;
    }
    forwardValue248_79_0 = 0x1.020c49ba5e354p-3d;
    }
    com.moon.nJ.a__Void(((double)(forwardValue248_79_0)));
    if (!((life4_5 == 0))) {
        break forward_join_97;
    }
    }
    forwardValue248_85_0 = ((((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.gI.a)).K)).ae()) ? 1 : 0);
    }
    if (!((life4_5 != 0))) {
        forwardValue248_94_0 = forwardValue248_85_0;
        break forward_join_94;
    }
    if (!((forwardValue248_85_0 != 0))) {
        break forward_join_97;
    }
    forwardValue248_94_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.ScaffoldWalk)(((com.moon.gI)(this)).b)).e__kV())).getValue())))).booleanValue()) ? 1 : 0);
    }
    if (!((forwardValue248_94_0 != 0))) {
        break forward_join_97;
    }
    com.moon.nJ.a__Void(((double)(0x1.f3b645a1cac08p-4d)));
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(com.moon.event.MotionEvent p0) {
return;
}


public void a(com.moon.event.PacketEvent p0) {
int forwardValue249_20_0;
    int forwardValue249_22_0;
    int forwardValue249_33_0;
    int forwardValue249_64_0;
    moom.yK forwardValue249_72_0;
    moom.yK forwardValue249_79_0;
    double forwardValue249_139_0;
    double forwardValue249_142_0;
    double forwardValue249_142_1;
    double forwardValue249_152_0;
    com.moon.gI forwardValue249_203_0;
    net.minecraft.client.entity.EntityPlayerSP forwardValue249_220_0;
    int forwardValue249_231_0;
    int forwardValue249_238_0;
    int forwardValue249_251_0;
    boolean spill249_0;
    boolean spill249_1;
    int spill249_2;
    int spill249_3;
    int spill249_4;
    moom.yK spill249_5;
    moom.yK spill249_6;
    net.minecraft.client.entity.EntityPlayerSP spill249_7;
    double spill249_8;
    com.moon.gI spill249_9;
    long life2_3;
    int life4_5;
    int life5_31;
    moom.yK life7_114;
    moom.y7 life6_128;
    double life7_147;
    double life9_170;
    double life11_174;
    double life13_177;
    double life15_214;
    forward_join_277: {
    forward_join_251: {
    forward_join_247: {
    forward_join_238: {
    forward_join_231: {
    forward_join_229: {
    forward_join_227: {
    forward_join_224: {
    forward_join_220: {
    forward_join_207: {
    forward_join_205: {
    forward_join_203: {
    forward_join_185: {
    forward_join_152: {
    forward_join_145: {
    forward_join_142: {
    forward_join_139: {
    forward_join_79: {
    forward_join_72: {
    forward_join_70: {
    forward_join_64: {
    forward_join_55: {
    forward_join_33: {
    forward_join_32: {
    forward_join_22: {
    forward_join_21: {
    forward_join_20: {
    forward_join_19: {
    life2_3 = (com.moon.gI.f ^ 101551979431505L);
    life4_5 = ((net.minecraft.nbt.NBTTagCompound.c()) ? 1 : 0);
    spill249_0 = ((moom.pz)(((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(com.moon.gI.a)).W)).ap)).a__Boolean();
    if (!((life4_5 != 0))) {
        forwardValue249_20_0 = ((spill249_0) ? 1 : 0);
        break forward_join_20;
    }
    if (!(spill249_0)) {
        break forward_join_19;
    }
    spill249_1 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.gI.a)).K)).ae();
    if (!((life4_5 != 0))) {
        forwardValue249_20_0 = ((spill249_1) ? 1 : 0);
        break forward_join_20;
    }
    if (!((!spill249_1))) {
        break forward_join_21;
    }
    }
    forwardValue249_20_0 = 1;
    }
    forwardValue249_22_0 = forwardValue249_20_0;
    break forward_join_22;
    }
    forwardValue249_22_0 = 0;
    }
    life5_31 = forwardValue249_22_0;
    spill249_2 = ((((com.moon.event.PacketEvent)(p0)).getPacket() instanceof moom.zB) ? 1 : 0);
    if (!((life4_5 != 0))) {
        forwardValue249_33_0 = spill249_2;
        break forward_join_33;
    }
    if (!((spill249_2 != 0))) {
        break forward_join_32;
    }
    this.e = ((double)(0x1.4p4d));
    }
    forwardValue249_33_0 = life5_31;
    }
    if (!((life4_5 != 0))) {
        forwardValue249_231_0 = forwardValue249_33_0;
        break forward_join_231;
    }
    if (!((forwardValue249_33_0 != 0))) {
        break forward_join_229;
    }
    spill249_3 = recovery.source.CarrierOps.dcmpl(((double)(this.e)), ((double)(0x0.0p0d)));
    if (!((life4_5 != 0))) {
        forwardValue249_231_0 = spill249_3;
        break forward_join_231;
    }
    if (!((spill249_3 == 0))) {
        break forward_join_229;
    }
    spill249_4 = ((((com.moon.event.PacketEvent)(p0)).getPacket() instanceof moom.zd) ? 1 : 0);
    if (!((life4_5 != 0))) {
        forwardValue249_64_0 = spill249_4;
        break forward_join_64;
    }
    if (!((spill249_4 == 0))) {
        break forward_join_55;
    }
    spill249_5 = ((com.moon.event.PacketEvent)(p0)).getPacket();
    if (!((life4_5 != 0))) {
        forwardValue249_72_0 = spill249_5;
        break forward_join_72;
    }
    if (!((((spill249_5 instanceof moom.zb) ? 1 : 0) != 0))) {
        break forward_join_70;
    }
    }
    ((com.moon.event.PacketEvent)(p0)).setCancelled(((boolean)(true)));
    forwardValue249_64_0 = ((((java.util.List)(this.c)).add(((java.lang.Object)(((com.moon.event.PacketEvent)(p0)).getPacket())))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue249_64_0);
    if (!((life4_5 == 0))) {
        break forward_join_227;
    }
    net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[3])));
    }
    forwardValue249_72_0 = ((com.moon.event.PacketEvent)(p0)).getPacket();
    }
    life7_114 = forwardValue249_72_0;
    spill249_6 = life7_114;
    if (!((life4_5 != 0))) {
        forwardValue249_79_0 = spill249_6;
        break forward_join_79;
    }
    if (!((((spill249_6 instanceof moom.y7) ? 1 : 0) != 0))) {
        break forward_join_227;
    }
    forwardValue249_79_0 = life7_114;
    }
    life6_128 = ((moom.y7)(forwardValue249_79_0));
    if (!((!((moom.y7)(life6_128)).d__Boolean()))) {
        break forward_join_227;
    }
    life7_147 = java.lang.Math.hypot(((double)((((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.gI.a)).K)).n - ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.gI.a)).K)).k))), ((double)((((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.gI.a)).K)).p - ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.gI.a)).K)).m))));
    if (!((life4_5 != 0))) {
        break forward_join_224;
    }
    if (!(((moom.y7)(life6_128)).b__Boolean())) {
        break forward_join_207;
    }
    spill249_7 = ((net.minecraft.client.Minecraft)(com.moon.gI.a)).K;
    if (!((life4_5 != 0))) {
        forwardValue249_220_0 = spill249_7;
        break forward_join_220;
    }
    if (!(((net.minecraft.client.entity.EntityPlayerSP)(spill249_7)).A)) {
        break forward_join_207;
    }
    life9_170 = ((double) com.moon.nJ.a__Float());
    life11_174 = (-java.lang.Math.sin(((double)(life9_170))));
    life13_177 = java.lang.Math.cos(((double)(life9_170)));
    if (!(((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.ScaffoldWalk)(((com.moon.gI)(this)).b)).e__kV())).getValue())))).booleanValue())) {
        break forward_join_145;
    }
    spill249_8 = life7_147;
    if (!(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.gI.a)).K)).b__Boolean(((int)(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.d)).I))))) {
        forwardValue249_139_0 = spill249_8;
        break forward_join_139;
    }
    forwardValue249_142_0 = spill249_8;
    forwardValue249_142_1 = com.moon.nI.a(((double)(0x1.47ae147ae147bp-3d)), ((double)(0x1.70a3d70a3d70ap-3d)));
    break forward_join_142;
    }
    forwardValue249_142_0 = forwardValue249_139_0;
    forwardValue249_142_1 = com.moon.nI.a(((double)(0x1.47ae147ae147bp-4d)), ((double)(0x1.999999999999ap-4d)));
    }
    forwardValue249_152_0 = java.lang.Math.abs(((double)((forwardValue249_142_0 - forwardValue249_142_1))));
    break forward_join_152;
    }
    forwardValue249_152_0 = java.lang.Math.max(((double)((life7_147 - com.moon.nI.a(((double)(0x1.eb851eb851eb8p-4d)), ((double)(0x1.0p-3d)))))), ((double)(0x0.0p0d)));
    }
    life15_214 = forwardValue249_152_0;
    com.moon.gI __stackOp249_67_0 = this;
    ((com.moon.gI)(__stackOp249_67_0)).d = ((int)((((com.moon.gI)(__stackOp249_67_0)).d + 1)));
    spill249_9 = this;
    if (!((life4_5 != 0))) {
        forwardValue249_203_0 = spill249_9;
        break forward_join_203;
    }
    if (!((((com.moon.gI)(spill249_9)).d == 1))) {
        break forward_join_185;
    }
    ((moom.y7)(life6_128)).a(((double)((((moom.y7)(life6_128)).d() - (life11_174 * life15_214)))));
    ((moom.y7)(life6_128)).c(((double)((((moom.y7)(life6_128)).f() - (life13_177 * life15_214)))));
    if (!((life4_5 == 0))) {
        break forward_join_205;
    }
    }
    ((java.util.List)(this.c)).forEach(((java.util.function.Consumer)(__sourceIntrinsic_0d28a2dd2629_invokedynamic249_76())));
    ((java.util.List)(this.c)).clear();
    ((com.moon.event.PacketEvent)(p0)).setCancelled(((boolean)(true)));
    ((net.minecraft.client.network.NetHandlerPlayClient)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.gI.a)).K)).cm)).b(((moom.yK)(((com.moon.event.PacketEvent)(p0)).getPacket())));
    forwardValue249_203_0 = this;
    }
    ((com.moon.gI)(forwardValue249_203_0)).d = ((int)(0));
    }
    if (!((life4_5 == 0))) {
        break forward_join_227;
    }
    }
    ((java.util.List)(this.c)).forEach(((java.util.function.Consumer)(__sourceIntrinsic_0d28a2dd2629_invokedynamic249_88())));
    ((java.util.List)(this.c)).clear();
    ((com.moon.event.PacketEvent)(p0)).setCancelled(((boolean)(true)));
    forwardValue249_220_0 = ((net.minecraft.client.Minecraft)(com.moon.gI.a)).K;
    }
    ((net.minecraft.client.network.NetHandlerPlayClient)(((net.minecraft.client.entity.EntityPlayerSP)(forwardValue249_220_0)).cm)).b(((moom.yK)(((com.moon.event.PacketEvent)(p0)).getPacket())));
    }
    this.d = ((int)(0));
    }
    if (!((life4_5 == 0))) {
        break forward_join_277;
    }
    }
    forwardValue249_231_0 = ((((com.moon.event.PacketEvent)(p0)).b__sourceReturn_aae029aa0a()) ? 1 : 0);
    }
    if (!((life4_5 != 0))) {
        forwardValue249_238_0 = forwardValue249_231_0;
        break forward_join_238;
    }
    if (!((forwardValue249_231_0 != 0))) {
        break forward_join_277;
    }
    forwardValue249_238_0 = recovery.source.CarrierOps.dcmpl(((double)(this.e)), ((double)(0x0.0p0d)));
    }
    if (!((life4_5 != 0))) {
        forwardValue249_251_0 = forwardValue249_238_0;
        break forward_join_251;
    }
    if (!((forwardValue249_238_0 > 0))) {
        break forward_join_247;
    }
    com.moon.gI __stackOp249_103_0 = this;
    ((com.moon.gI)(__stackOp249_103_0)).e = ((double)((((com.moon.gI)(__stackOp249_103_0)).e - 0x1.0p0d)));
    }
    forwardValue249_251_0 = ((moom.pz)(((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(com.moon.gI.a)).W)).ar)).b();
    }
    moom.pz.a(((int)(forwardValue249_251_0)), ((boolean)(false)));
    ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.gI.a)).K)).c(((boolean)(false)));
    ((java.util.List)(this.c)).forEach(((java.util.function.Consumer)(__sourceIntrinsic_0d28a2dd2629_invokedynamic249_115())));
    ((java.util.List)(this.c)).clear();
    ((com.moon.event.PacketEvent)(p0)).setCancelled(((boolean)(true)));
    ((net.minecraft.client.network.NetHandlerPlayClient)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.gI.a)).K)).cm)).b(((moom.yK)(((com.moon.event.PacketEvent)(p0)).getPacket())));
    this.d = ((int)(0));
    }
    return;
}


public void a() {
return;
}


private static void lambda$receivePacket$1(moom.yK p0) {
((net.minecraft.client.network.NetHandlerPlayClient)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.gI.a)).K)).cm)).b(((moom.yK)(p0)));
    return;
}


private static void lambda$receivePacket$0(moom.yK p0) {
((net.minecraft.client.network.NetHandlerPlayClient)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.gI.a)).K)).cm)).b(((moom.yK)(p0)));
    return;
}


private static void lambda$receivePacket$2(moom.yK p0) {
((net.minecraft.client.network.NetHandlerPlayClient)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.gI.a)).K)).cm)).b(((moom.yK)(p0)));
    return;
}


private static native <E extends Throwable> java.util.function.Consumer __sourceIntrinsic_0d28a2dd2629_invokedynamic249_76() throws E;

private static native <E extends Throwable> java.util.function.Consumer __sourceIntrinsic_0d28a2dd2629_invokedynamic249_88() throws E;

private static native <E extends Throwable> java.util.function.Consumer __sourceIntrinsic_0d28a2dd2629_invokedynamic249_115() throws E;
}
