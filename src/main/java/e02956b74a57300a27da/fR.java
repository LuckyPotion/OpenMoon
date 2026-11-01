package com.moon;


public class fR extends com.moon.e2<com.moon.module.impl.NoFall> {

private final java.util.List<moom.yK<?>> e;

private boolean f;

private int g;

private static final long h;

private static final long i;

public fR() {
super(com.moon.module.impl.NoFall.class);
    this.e = new java.util.concurrent.CopyOnWriteArrayList();
}


static {
h = ((long)(((moom._a)(moom._c.a(((long)(-1044834868777155276L)), ((long)(3940529082369069293L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(86217509921429L)))));
    long local0_life6 = (com.moon.fR.h ^ 68592831490299L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill93_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill93_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill93_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill93_13 = new byte[8];
    (__sourceSpill93_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill93_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation93_15 = __sourceSpill93_13;
    ((javax.crypto.Cipher)(__sourceSpill93_10)).init(((int)(__sourceSpill93_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill93_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation93_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -6156356173219838222L;
    byte[] __sourceSpill93_19 = new byte[8];
    (__sourceSpill93_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill93_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill93_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill93_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill93_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill93_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill93_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill93_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill93_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill93_20)).doFinal(((byte[])(__sourceSpill93_19)));
    i = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public void c() {
com.moon.fR forwardValue133_20_0;
    com.moon.fR spill133_0;
    long life1_3;
    java.lang.String life3_5;
    forward_join_20: {
    forward_join_19: {
    life1_3 = (com.moon.fR.h ^ 114691732656353L);
    life3_5 = net.minecraft.init.Items.b();
    spill133_0 = this;
    if (!((life3_5 == null))) {
        forwardValue133_20_0 = spill133_0;
        break forward_join_20;
    }
    if (!(((com.moon.fR)(spill133_0)).f)) {
        break forward_join_19;
    }
    if (!((((net.minecraft.client.Minecraft)(com.moon.fR.a)).K != null))) {
        break forward_join_19;
    }
    this.f = ((boolean)(false));
    ((com.moon.fR)(this)).d();
    }
    forwardValue133_20_0 = this;
    }
    __sourceIntrinsic_5b7380e7aa7c_call133_7(forwardValue133_20_0);
    return;
}


private void d() {
java.lang.String spill29_0;
    long life1_3;
    java.util.Iterator life4_8;
    java.lang.String life3_9;
    moom.yK life5_16;
    lexical_join_29: {
    lexical_join_26: {
    life1_3 = (com.moon.fR.h ^ 73261864146557L);
    spill29_0 = net.minecraft.init.Items.b();
    life4_8 = ((java.util.List)(this.e)).iterator();
    life3_9 = spill29_0;
    lexical_cycle_10: while (true) {
    if (!(((java.util.Iterator)(life4_8)).hasNext())) {
        break lexical_join_26;
    }
    life5_16 = ((moom.yK)(((java.util.Iterator)(life4_8)).next()));
    ((net.minecraft.client.network.NetHandlerPlayClient)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fR.a)).K)).cm)).b(((moom.yK)(life5_16)));
    if (!((life3_9 == null))) {
        break lexical_join_29;
    }
    if (!((life3_9 != null))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    ((java.util.List)(this.e)).clear();
    }
    return;
}


public void a(com.moon.event.MoveEvent p0) {
net.minecraft.util.MovingObjectPosition forestValue52_51_0;
    int forestValue52_83_0;
    int forestValue52_85_0;
    int forestValue52_122_0;
    int forestValue52_131_0;
    int forestValue52_145_0;
    int forestValue52_157_0;
    com.moon.fR forestValue52_162_0;
    int forestValue52_162_1;
    boolean spill52_0;
    int spill52_1;
    net.minecraft.util.MovingObjectPosition spill52_2;
    boolean spill52_3;
    int spill52_4;
    boolean spill52_5;
    int spill52_6;
    boolean spill52_7;
    boolean spill52_8;
    com.moon.fR spill52_9;
    int spill52_10;
    int spill52_11;
    long life2_3;
    java.lang.String life4_5;
    moom.DT life5_24;
    int life6_29;
    net.minecraft.util.MovingObjectPosition life7_35;
    moom.DT life8_57;
    double life9_79;
    int life11_92;
    forest_join_165: {
    forest_join_162: {
    forest_join_157: {
    forest_join_145: {
    forest_join_142: {
    forest_join_131: {
    forest_join_122: {
    forest_join_120: {
    forest_join_85: {
    forest_join_84: {
    forest_join_83: {
    forest_join_51: {
    life2_3 = (com.moon.fR.h ^ 2491797146179L);
    life4_5 = net.minecraft.init.Items.b();
    if (!((((com.moon.event.MoveEvent)(p0)).getPhase() == com.moon.event.MovePhase.PRE))) {
        break forest_join_165;
    }
    life5_24 = new moom.DT(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fR.a)).K)).n, (((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fR.a)).K)).o - 0x1.0p-1d), ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fR.a)).K)).p);
    life6_29 = ((((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(com.moon.fR.a)).I)).a__Boolean(((moom.DT)(life5_24)))) ? 1 : 0);
    life7_35 = com.moon.nQ.a(((float)(0x1.68p6f)), ((float)(0x1.68p6f)), ((float)(0x1.fep7f)), ((float)(0x1.0p0f)));
    spill52_0 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fR.a)).K)).A;
    if (!((life4_5 == null))) {
        forestValue52_122_0 = ((spill52_0) ? 1 : 0);
        break forest_join_122;
    }
    if (!(spill52_0)) {
        break forest_join_120;
    }
    spill52_1 = life6_29;
    if (!((life4_5 == null))) {
        forestValue52_122_0 = spill52_1;
        break forest_join_122;
    }
    if (!((spill52_1 != 0))) {
        break forest_join_120;
    }
    spill52_2 = life7_35;
    if (!((life4_5 == null))) {
        forestValue52_51_0 = spill52_2;
        break forest_join_51;
    }
    if (!((spill52_2 != null))) {
        break forest_join_120;
    }
    forestValue52_51_0 = life7_35;
    }
    life8_57 = ((net.minecraft.util.MovingObjectPosition)(forestValue52_51_0)).a();
    if (!((((net.minecraft.util.MovingObjectPosition)(life7_35)).b == net.minecraft.util.MovingObjectPosition$MovingObjectType.BLOCK))) {
        break forest_join_120;
    }
    if (!((life8_57 != null))) {
        break forest_join_120;
    }
    life9_79 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fR.a)).K)).b(((double)(((double) ((moom.DT)(life8_57)).a()))), ((double)(((double) (((moom.DT)(life8_57)).b() + 1)))), ((double)(((double) ((moom.DT)(life8_57)).c()))));
    spill52_3 = ((com.moon.module.Module)(((com.moon.fU)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__fU())).a(((java.lang.Class)(com.moon.module.impl.ScaffoldWalk.class))))).isEnabled();
    if (!((life4_5 == null))) {
        forestValue52_83_0 = ((spill52_3) ? 1 : 0);
        break forest_join_83;
    }
    if (!((!spill52_3))) {
        break forest_join_84;
    }
    forestValue52_83_0 = 1;
    }
    forestValue52_85_0 = forestValue52_83_0;
    break forest_join_85;
    }
    forestValue52_85_0 = 0;
    }
    life11_92 = forestValue52_85_0;
    spill52_4 = recovery.source.CarrierOps.dcmpl(((double)(life9_79)), ((double)(0x1.7333333333333p1d)));
    if (!((life4_5 == null))) {
        forestValue52_122_0 = spill52_4;
        break forest_join_122;
    }
    if (!((spill52_4 > 0))) {
        break forest_join_120;
    }
    spill52_5 = this.f;
    if (!((life4_5 == null))) {
        forestValue52_122_0 = ((spill52_5) ? 1 : 0);
        break forest_join_122;
    }
    if (!((!spill52_5))) {
        break forest_join_120;
    }
    spill52_6 = life11_92;
    if (!((life4_5 == null))) {
        forestValue52_122_0 = spill52_6;
        break forest_join_122;
    }
    if (!((spill52_6 != 0))) {
        break forest_join_120;
    }
    spill52_7 = ((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fR.a)).K)).b1)).c;
    if (!((life4_5 == null))) {
        forestValue52_122_0 = ((spill52_7) ? 1 : 0);
        break forest_join_122;
    }
    if (!((!spill52_7))) {
        break forest_join_120;
    }
    spill52_8 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fR.a)).K)).t__Boolean();
    if (!((life4_5 == null))) {
        forestValue52_122_0 = ((spill52_8) ? 1 : 0);
        break forest_join_122;
    }
    if (!((!spill52_8))) {
        break forest_join_120;
    }
    this.f = ((boolean)(true));
    this.g = ((int)(0));
    }
    forestValue52_122_0 = ((this.f) ? 1 : 0);
    }
    if (!((life4_5 == null))) {
        forestValue52_131_0 = forestValue52_122_0;
        break forest_join_131;
    }
    if (!((forestValue52_122_0 != 0))) {
        break forest_join_165;
    }
    forestValue52_131_0 = recovery.source.CarrierOps.dcmpl(((double)(((double) ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fR.a)).K)).L))), ((double)(0x1.7333333333333p1d)));
    }
    if (!((life4_5 == null))) {
        forestValue52_145_0 = forestValue52_131_0;
        break forest_join_145;
    }
    if (!((forestValue52_131_0 >= 0))) {
        break forest_join_142;
    }
    ((com.moon.event.MoveEvent)(p0)).a(((boolean)(true)));
    ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fR.a)).K)).L = ((float)(0x0.0p0f));
    }
    forestValue52_145_0 = ((((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fR.a)).K)).A) ? 1 : 0);
    }
    if (!((life4_5 == null))) {
        forestValue52_157_0 = forestValue52_145_0;
        break forest_join_157;
    }
    if (!((forestValue52_145_0 != 0))) {
        break forest_join_165;
    }
    com.moon.fR __stackOp52_65_0 = this;
    spill52_9 = __stackOp52_65_0;
    spill52_10 = (((com.moon.fR)(__stackOp52_65_0)).g + 1);
    if (!((life4_5 == null))) {
        forestValue52_162_0 = spill52_9;
        forestValue52_162_1 = spill52_10;
        break forest_join_162;
    }
    com.moon.fR __stackOp52_67_0 = spill52_9;
    int __stackOp52_67_1 = spill52_10;
    spill52_11 = __stackOp52_67_1;
    ((com.moon.fR)(__stackOp52_67_0)).g = ((int)(__stackOp52_67_1));
    forestValue52_157_0 = spill52_11;
    }
    if (!((forestValue52_157_0 > ((int) com.moon.fR.i)))) {
        break forest_join_165;
    }
    forestValue52_162_0 = this;
    forestValue52_162_1 = 0;
    }
    ((com.moon.fR)(forestValue52_162_0)).f = ((boolean)__sourceIntrinsic_integerToBoolean((forestValue52_162_1)));
    ((com.moon.fR)(this)).d();
    }
    return;
}


public void a(com.moon.dQ p0) {
com.moon.fR forwardValue130_15_0;
    com.moon.fR spill130_0;
    long life2_3;
    java.lang.String life4_5;
    forward_join_16: {
    forward_join_15: {
    life2_3 = (com.moon.fR.h ^ 1928190761480L);
    life4_5 = net.minecraft.init.Items.b();
    spill130_0 = this;
    if (!((life4_5 == null))) {
        forwardValue130_15_0 = spill130_0;
        break forward_join_15;
    }
    if (!(((com.moon.fR)(spill130_0)).f)) {
        break forward_join_16;
    }
    this.f = ((boolean)(false));
    forwardValue130_15_0 = this;
    }
    ((com.moon.fR)(forwardValue130_15_0)).d();
    }
    return;
}


public void a(com.moon.event.PacketEvent p0) {
int forwardValue132_13_0;
    int forwardValue132_19_0;
    int forwardValue132_51_0;
    boolean spill132_0;
    int spill132_1;
    int spill132_2;
    int spill132_3;
    int spill132_4;
    long life2_3;
    java.lang.String life4_5;
    forward_join_56: {
    forward_join_51: {
    forward_join_46: {
    forward_join_19: {
    forward_join_13: {
    life2_3 = (com.moon.fR.h ^ 83553478139635L);
    life4_5 = net.minecraft.init.Items.b();
    spill132_0 = ((com.moon.event.PacketEvent)(p0)).b__sourceReturn_aae029aa0a();
    if (!((life4_5 == null))) {
        forwardValue132_13_0 = ((spill132_0) ? 1 : 0);
        break forward_join_13;
    }
    if (!(spill132_0)) {
        break forward_join_56;
    }
    forwardValue132_13_0 = ((this.f) ? 1 : 0);
    }
    if (!((life4_5 == null))) {
        forwardValue132_19_0 = forwardValue132_13_0;
        break forward_join_19;
    }
    if (!((forwardValue132_13_0 != 0))) {
        break forward_join_56;
    }
    forwardValue132_19_0 = ((((com.moon.event.PacketEvent)(p0)).getPacket() instanceof moom.y7) ? 1 : 0);
    }
    if (!((life4_5 == null))) {
        forwardValue132_51_0 = forwardValue132_19_0;
        break forward_join_51;
    }
    if (!((forwardValue132_19_0 == 0))) {
        break forward_join_46;
    }
    spill132_1 = ((((com.moon.event.PacketEvent)(p0)).getPacket() instanceof moom.y6) ? 1 : 0);
    if (!((life4_5 == null))) {
        forwardValue132_51_0 = spill132_1;
        break forward_join_51;
    }
    if (!((spill132_1 == 0))) {
        break forward_join_46;
    }
    spill132_2 = ((((com.moon.event.PacketEvent)(p0)).getPacket() instanceof moom.za) ? 1 : 0);
    if (!((life4_5 == null))) {
        forwardValue132_51_0 = spill132_2;
        break forward_join_51;
    }
    if (!((spill132_2 == 0))) {
        break forward_join_46;
    }
    spill132_3 = ((((com.moon.event.PacketEvent)(p0)).getPacket() instanceof moom.zb) ? 1 : 0);
    if (!((life4_5 == null))) {
        forwardValue132_51_0 = spill132_3;
        break forward_join_51;
    }
    if (!((spill132_3 == 0))) {
        break forward_join_46;
    }
    spill132_4 = ((((com.moon.event.PacketEvent)(p0)).getPacket() instanceof moom.zd) ? 1 : 0);
    if (!((life4_5 == null))) {
        forwardValue132_51_0 = spill132_4;
        break forward_join_51;
    }
    if (!((spill132_4 != 0))) {
        break forward_join_56;
    }
    }
    forwardValue132_51_0 = ((((java.util.List)(this.e)).add(((java.lang.Object)(((com.moon.event.PacketEvent)(p0)).getPacket())))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue132_51_0);
    ((com.moon.event.PacketEvent)(p0)).setCancelled(((boolean)(true)));
    }
    return;
}


private static native <E extends Throwable> void __sourceIntrinsic_5b7380e7aa7c_call133_7(com.moon.fR a0) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
