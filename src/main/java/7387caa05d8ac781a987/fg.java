package com.moon;


public class fg extends com.moon.e2<com.moon.module.impl.Tickbase> {

private net.minecraft.entity.EntityLivingBase e;

private int f;

private double g;

private double h;

private boolean i;

private final com.moon.nW j;

private static final long k;

public fg() {
super(com.moon.module.impl.Tickbase.class);
    this.j = new com.moon.nW();
}


static {
k = (moom._c.a(8792445146584701990L, 338893436248414324L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(1919182569995L);
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public void b() {
return;
}


public void c() {
net.minecraft.client.Minecraft forwardValue163_13_0;
    net.minecraft.client.Minecraft spill163_0;
    long life1_3;
    java.lang.String life3_5;
    forward_join_13: {
    forward_join_12: {
    life1_3 = (com.moon.fg.k ^ 83614644399204L);
    life3_5 = net.minecraft.init.Blocks.b();
    spill163_0 = com.moon.fg.a;
    if (!((life3_5 != null))) {
        forwardValue163_13_0 = spill163_0;
        break forward_join_13;
    }
    if (!((((net.minecraft.client.Minecraft)(spill163_0)).K == null))) {
        break forward_join_12;
    }
    return;
    }
    forwardValue163_13_0 = com.moon.fg.a;
    }
    ((moom.DM)(((net.minecraft.client.Minecraft)(forwardValue163_13_0)).l)).c = ((float)(0x1.0p0f));
    return;
}


public void a(com.moon.event.PacketEvent p0) {
return;
}


public void a(com.moon.eH p0) {
net.minecraft.client.entity.EntityPlayerSP forwardValue160_13_0;
    int forwardValue160_25_0;
    int forwardValue160_33_0;
    int forwardValue160_62_0;
    int forwardValue160_71_0;
    com.moon.eH forwardValue160_77_0;
    net.minecraft.client.entity.EntityPlayerSP spill160_0;
    int spill160_1;
    com.moon.eH spill160_2;
    long life2_3;
    java.lang.String life4_5;
    forward_join_78: {
    forward_join_77: {
    forward_join_71: {
    forward_join_62: {
    forward_join_60: {
    forward_join_33: {
    forward_join_29: {
    forward_join_25: {
    forward_join_19: {
    forward_join_18: {
    forward_join_13: {
    life2_3 = (com.moon.fg.k ^ 31745078408401L);
    life4_5 = net.minecraft.init.Blocks.b();
    spill160_0 = ((net.minecraft.client.Minecraft)(com.moon.fg.a)).K;
    if (!((life4_5 != null))) {
        forwardValue160_13_0 = spill160_0;
        break forward_join_13;
    }
    if (!((spill160_0 != null))) {
        break forward_join_18;
    }
    forwardValue160_13_0 = ((net.minecraft.client.Minecraft)(com.moon.fg.a)).K;
    }
    spill160_1 = ((net.minecraft.client.entity.EntityPlayerSP)(forwardValue160_13_0)).S;
    if (!((life4_5 != null))) {
        forwardValue160_25_0 = spill160_1;
        break forward_join_25;
    }
    if (!((spill160_1 <= 1))) {
        break forward_join_19;
    }
    }
    return;
    }
    forwardValue160_25_0 = recovery.source.CarrierOps.dcmpl(((double)(((double) ((moom.DM)(((net.minecraft.client.Minecraft)(com.moon.fg.a)).l)).c))), ((double)(0x1.0p0d)));
    }
    if (!((life4_5 != null))) {
        forwardValue160_33_0 = forwardValue160_25_0;
        break forward_join_33;
    }
    if (!((forwardValue160_25_0 != 0))) {
        break forward_join_29;
    }
    return;
    }
    forwardValue160_33_0 = recovery.source.CarrierOps.dcmpl(((double)(this.h)), ((double)(0x0.0p0d)));
    }
    if (!((life4_5 != null))) {
        forwardValue160_62_0 = forwardValue160_33_0;
        break forward_join_62;
    }
    if (!((forwardValue160_33_0 > 0))) {
        break forward_join_60;
    }
    this.i = ((boolean)(true));
    ((com.moon.eH)(p0)).a(((double)(this.h)));
    this.g = ((double)(this.h));
    this.f = ((int)(((int) this.h)));
    this.h = ((double)((-this.h)));
    if (!((life4_5 == null))) {
        break forward_join_78;
    }
    }
    forwardValue160_62_0 = ((this.i) ? 1 : 0);
    }
    if (!((life4_5 != null))) {
        forwardValue160_71_0 = forwardValue160_62_0;
        break forward_join_71;
    }
    if (!((forwardValue160_62_0 != 0))) {
        break forward_join_78;
    }
    spill160_2 = p0;
    if (!((life4_5 != null))) {
        forwardValue160_77_0 = spill160_2;
        break forward_join_77;
    }
    forwardValue160_71_0 = recovery.source.CarrierOps.dcmpl(((double)(((com.moon.eH)(spill160_2)).b__sourceReturn_fedcb3e4d3())), ((double)(0x0.0p0d)));
    }
    if (!((forwardValue160_71_0 == 0))) {
        break forward_join_78;
    }
    forwardValue160_77_0 = ((com.moon.eH)(p0)).a(((int)(((int) this.g))));
    }
    recovery.source.CarrierOps.discard(forwardValue160_77_0);
    }
    return;
}


private moom.DR a(float p0, float p1) {
float local3 = moom.Dr.b(((float)((((-p1) * com.moon.nQ.b) - 0x1.921fb6p1f))));
    float local4 = moom.Dr.a(((float)((((-p1) * com.moon.nQ.b) - 0x1.921fb6p1f))));
    float local5 = (-moom.Dr.b(((float)(((-p0) * com.moon.nQ.b)))));
    float local6 = moom.Dr.a(((float)(((-p0) * com.moon.nQ.b))));
    return new moom.DR(((double) (local4 * local5)), ((double) local6), ((double) (local3 * local5)));
}


public void a(com.moon.event.TickEvent p0) {
int forwardValue162_27_0;
    int forwardValue162_34_0;
    com.moon.fg forwardValue162_42_0;
    int spill162_0;
    int spill162_1;
    com.moon.fg spill162_2;
    long life2_3;
    java.lang.String life4_5;
    forward_join_44: {
    forward_join_42: {
    forward_join_34: {
    forward_join_27: {
    forward_join_20: {
    life2_3 = (com.moon.fg.k ^ 135089379922139L);
    life4_5 = net.minecraft.init.Blocks.b();
    if (!((((com.moon.event.TickEvent)(p0)).getPhase() == com.moon.event.TickPhase.PRE))) {
        break forward_join_44;
    }
    spill162_0 = recovery.source.CarrierOps.dcmpl(((double)(((double) ((moom.DM)(((net.minecraft.client.Minecraft)(com.moon.fg.a)).l)).c))), ((double)(0x1.0p0d)));
    if (!((life4_5 != null))) {
        forwardValue162_27_0 = spill162_0;
        break forward_join_27;
    }
    if (!((spill162_0 != 0))) {
        break forward_join_20;
    }
    return;
    }
    com.moon.fg __stackOp162_8_0 = this;
    com.moon.fg __stackOp162_10_0 = __stackOp162_8_0;
    int __stackOp162_10_1 = (((com.moon.fg)(__stackOp162_8_0)).f - 1);
    spill162_1 = __stackOp162_10_1;
    ((com.moon.fg)(__stackOp162_10_0)).f = ((int)(__stackOp162_10_1));
    forwardValue162_27_0 = spill162_1;
    }
    if (!((life4_5 != null))) {
        forwardValue162_34_0 = forwardValue162_27_0;
        break forward_join_34;
    }
    if (!((forwardValue162_27_0 == 0))) {
        break forward_join_44;
    }
    spill162_2 = this;
    if (!((life4_5 != null))) {
        forwardValue162_42_0 = spill162_2;
        break forward_join_42;
    }
    forwardValue162_34_0 = ((((com.moon.fg)(spill162_2)).i) ? 1 : 0);
    }
    if (!((forwardValue162_34_0 != 0))) {
        break forward_join_44;
    }
    ((com.moon.events.EventBus)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).getEventBus())).publish(((java.lang.Object)(new com.moon.ep())));
    forwardValue162_42_0 = this;
    }
    ((com.moon.fg)(forwardValue162_42_0)).i = ((boolean)(false));
    }
    return;
}


public void a(com.moon.event.MoveEvent p0) {
float lexicalValue31_23_0;
    net.minecraft.util.MovingObjectPosition lexicalValue31_60_0;
    net.minecraft.entity.Entity lexicalValue31_66_0;
    net.minecraft.entity.Entity lexicalValue31_73_0;
    com.moon.fg lexicalValue31_100_0;
    int lexicalValue31_107_0;
    int lexicalValue31_117_0;
    float spill31_0;
    net.minecraft.util.MovingObjectPosition spill31_1;
    net.minecraft.entity.Entity spill31_2;
    net.minecraft.entity.Entity spill31_3;
    com.moon.fg spill31_4;
    boolean spill31_5;
    long life2_3;
    java.lang.String life4_5;
    float life5_31;
    float life6_35;
    com.moon.eA life7_41;
    float life6_48;
    float life5_51;
    moom.DR life8_56;
    net.minecraft.util.MovingObjectPosition life9_62;
    net.minecraft.entity.Entity life11_83;
    net.minecraft.entity.EntityLivingBase life10_97;
    double life11_102;
    int life10_167;
    int life11_169;
    com.moon.n7 life12_186;
    com.moon.n7 life13_192;
    moom.DR life14_198;
    float life15_202;
    float life16_206;
    float life17_210;
    moom.DR life18_214;
    moom.CA life19_249;
    moom.DR life20_258;
    moom.DR life21_263;
    moom.DR life22_278;
    net.minecraft.util.MovingObjectPosition life23_283;
    double life24_297;
    lexical_join_268: {
    lexical_join_117: {
    lexical_join_107: {
    lexical_join_100: {
    lexical_join_94: {
    lexical_join_91: {
    lexical_join_89: {
    lexical_join_73: {
    lexical_join_66: {
    lexical_join_60: {
    lexical_join_23: {
    lexical_join_20: {
    life2_3 = (com.moon.fg.k ^ 123313614711075L);
    life4_5 = net.minecraft.init.Blocks.b();
    if (!((((com.moon.event.MoveEvent)(p0)).getPhase() == com.moon.event.MovePhase.BEFORE))) {
        break lexical_join_268;
    }
    spill31_0 = ((moom.DM)(((net.minecraft.client.Minecraft)(com.moon.fg.a)).l)).c;
    if (!((life4_5 != null))) {
        lexicalValue31_23_0 = spill31_0;
        break lexical_join_23;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(((double) spill31_0))), ((double)(0x1.0p0d))) != 0))) {
        break lexical_join_20;
    }
    return;
    }
    lexicalValue31_23_0 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fg.a)).K)).x;
    }
    life5_31 = lexicalValue31_23_0;
    life6_35 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fg.a)).K)).w;
    life7_41 = new com.moon.eA(life6_35, life5_31);
    ((com.moon.events.EventBus)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).getEventBus())).publish(((java.lang.Object)(life7_41)));
    life6_48 = ((com.moon.eA)(life7_41)).a();
    life5_51 = ((com.moon.eA)(life7_41)).b__sourceReturn_bc607678b6();
    life8_56 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fg.a)).K)).b(((float)(0x1.0p0f)));
    life9_62 = com.moon.nQ.a(((float)(life6_48)), ((float)(life5_51)), ((float)(0x1.4p3f)), ((float)(0x1.0p0f)));
    spill31_1 = life9_62;
    if (!((life4_5 != null))) {
        lexicalValue31_60_0 = spill31_1;
        break lexical_join_60;
    }
    if (!((spill31_1 != null))) {
        break lexical_join_94;
    }
    lexicalValue31_60_0 = life9_62;
    }
    spill31_2 = ((net.minecraft.util.MovingObjectPosition)(lexicalValue31_60_0)).e;
    if (!((life4_5 != null))) {
        lexicalValue31_66_0 = spill31_2;
        break lexical_join_66;
    }
    if (!((spill31_2 != null))) {
        break lexical_join_94;
    }
    lexicalValue31_66_0 = ((net.minecraft.util.MovingObjectPosition)(life9_62)).e;
    }
    life11_83 = lexicalValue31_66_0;
    spill31_3 = life11_83;
    if (!((life4_5 != null))) {
        lexicalValue31_73_0 = spill31_3;
        break lexical_join_73;
    }
    if (!((((spill31_3 instanceof net.minecraft.entity.EntityLivingBase) ? 1 : 0) != 0))) {
        break lexical_join_94;
    }
    lexicalValue31_73_0 = life11_83;
    }
    life10_97 = ((net.minecraft.entity.EntityLivingBase)(lexicalValue31_73_0));
    life11_102 = ((moom.DR)(((net.minecraft.util.MovingObjectPosition)(life9_62)).d)).b(((moom.DR)(life8_56)));
    if (!((life4_5 != null))) {
        break lexical_join_89;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(life11_102)), ((double)(0x1.8p1d))) > 0))) {
        break lexical_join_91;
    }
    this.e = ((net.minecraft.entity.EntityLivingBase)(life10_97));
    }
    if (!((life4_5 == null))) {
        break lexical_join_94;
    }
    }
    this.e = ((net.minecraft.entity.EntityLivingBase)(null));
    }
    spill31_4 = this;
    if (!((life4_5 != null))) {
        lexicalValue31_100_0 = spill31_4;
        break lexical_join_100;
    }
    if (!((((com.moon.fg)(spill31_4)).e != null))) {
        break lexical_join_268;
    }
    lexicalValue31_100_0 = this;
    }
    spill31_5 = ((com.moon.fg)(lexicalValue31_100_0)).i;
    if (!((life4_5 != null))) {
        lexicalValue31_107_0 = ((spill31_5) ? 1 : 0);
        break lexical_join_107;
    }
    if (!((!spill31_5))) {
        break lexical_join_268;
    }
    lexicalValue31_107_0 = ((((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fg.a)).K)).A) ? 1 : 0);
    }
    if (!((life4_5 != null))) {
        lexicalValue31_117_0 = lexicalValue31_107_0;
        break lexical_join_117;
    }
    if (!((lexicalValue31_107_0 != 0))) {
        break lexical_join_268;
    }
    lexicalValue31_117_0 = ((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.IntegerSetting)(((com.moon.module.impl.Tickbase)(((com.moon.module.impl.Tickbase)(((com.moon.fg)(this)).a())))).a())).getValue())))).intValue();
    }
    life10_167 = lexicalValue31_117_0;
    life11_169 = 1;
    lexical_cycle_120: while (true) {
    lexical_join_266: {
    lexical_join_265: {
    if (!((life11_169 < (life10_167 + 1)))) {
        break lexical_join_268;
    }
    life12_186 = new com.moon.n7(((net.minecraft.client.Minecraft)(com.moon.fg.a)).K, ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fg.a)).K)).bk, ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fg.a)).K)).bj);
    life13_192 = new com.moon.n7(this.e);
    life14_198 = ((com.moon.n7)(life12_186)).a(((int)((life11_169 - 1))));
    life15_202 = ((net.minecraft.entity.EntityLivingBase)(this.e)).G;
    life16_206 = ((net.minecraft.entity.EntityLivingBase)(this.e)).H;
    life17_210 = (life15_202 / 0x1.0p1f);
    life18_214 = ((com.moon.n7)(life13_192)).a(((int)(life11_169)));
    life19_249 = ((moom.CA)(new moom.CA((((moom.DR)(life18_214)).a - ((double) life17_210)), ((moom.DR)(life18_214)).b, (((moom.DR)(life18_214)).c - ((double) life17_210)), (((moom.DR)(life18_214)).a + ((double) life17_210)), (((moom.DR)(life18_214)).b + ((double) life16_206)), (((moom.DR)(life18_214)).c + ((double) life17_210))))).b(((double)(0x1.999999999999ap-4d)), ((double)(0x1.999999999999ap-4d)), ((double)(0x1.999999999999ap-4d)));
    life20_258 = ((moom.DR)(life14_198)).b(((double)(0x0.0p0d)), ((double)(((double) ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fg.a)).K)).e__Float()))), ((double)(0x0.0p0d)));
    life21_263 = ((com.moon.fg)(this)).a(((float)(life5_51)), ((float)(life6_48)));
    life22_278 = ((moom.DR)(life20_258)).b(((double)((((moom.DR)(life21_263)).a * 0x1.4p4d))), ((double)((((moom.DR)(life21_263)).b * 0x1.4p4d))), ((double)((((moom.DR)(life21_263)).c * 0x1.4p4d))));
    life23_283 = ((moom.CA)(life19_249)).a(((moom.DR)(life20_258)), ((moom.DR)(life22_278)));
    if (!((life4_5 != null))) {
        break lexical_join_266;
    }
    if (!((life23_283 != null))) {
        break lexical_join_265;
    }
    life24_297 = com.moon.nI.a(((double)(((moom.DR)(((net.minecraft.util.MovingObjectPosition)(life23_283)).d)).b(((moom.DR)(life20_258))))), ((int)(3)));
    if (!((life4_5 != null))) {
        break lexical_join_266;
    }
    if (!((recovery.source.CarrierOps.dcmpg(((double)(life24_297)), ((double)(0x1.8p1d))) <= 0))) {
        break lexical_join_265;
    }
    if (!((life11_169 > 1))) {
        break lexical_join_265;
    }
    this.h = ((double)(((double) (life11_169 - 1))));
    this.f = ((int)(-1));
    if (!((life4_5 == null))) {
        break lexical_join_268;
    }
    }
    life11_169 += 1;
    }
    if (!((life4_5 == null))) { continue lexical_cycle_120; }
    break lexical_cycle_120;
    }
    }
    return;
}

}
