package moom;


public abstract class sI extends net.minecraft.entity.EntityLiving {

public static final java.util.UUID bX;

public static final moom.vB bY;

private moom.DT bZ;

private float b0;

private final moom.uc b1;

private boolean b2;

private static int b3;

private static final long eb;

public sI(net.minecraft.world.World p0) {
super(p0);
    this.bZ = moom.DT.f;
    this.b0 = -0x1.0000000000000p+0f;
    this.b1 = new moom.uG(this, 0x1.0000000000000p+0d);
}


static {
eb = ((long)(((moom._a)(moom._c.a(((long)(6232959916819207644L)), ((long)(-8678392331461010967L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(39700949617671L)))));
    int __sourceSpill2772_7 = 106;
    bX = ((java.util.UUID)(java.util.UUID.fromString(((java.lang.String)("E199AD21-BA8A-4C53-8D13-6182D5C69D3A")))));
    moom.sI.j(((int)(__sourceSpill2772_7)));
    bY = ((moom.vB)(((moom.vB)(new moom.vB(moom.sI.bX, "Fleeing speed bonus", 0x1.0p1d, 2))).a(((boolean)(false)))));
}


public boolean Z() {
return ((moom.sI)(this)).a__Boolean(((moom.DT)(new moom.DT(this))));
}


protected void i(float p0) {
return;
}


public moom.DT b__sourceReturn_f4db834595() {
return this.bZ;
}


public float l__sourceReturn_bc607678b6() {
return this.b0;
}


public float a__sourceReturn_8d24afb582(moom.DT p0) {
return 0x0.0p0f;
}


public boolean a__Boolean(moom.DT p0) {
int forwardValue3953_28_0;
    int forwardValue3953_30_0;
    int spill3953_0;
    int spill3953_1;
    long life2_3;
    int life4_5;
    forward_join_30: {
    forward_join_29: {
    forward_join_28: {
    forward_join_27: {
    life2_3 = (moom.sI.eb ^ 87410751105391L);
    life4_5 = net.minecraft.entity.SharedMonsterAttributes.b();
    spill3953_0 = recovery.source.CarrierOps.fcmpl(((float)(this.b0)), ((float)(-0x1.0p0f)));
    if (!((life4_5 == 0))) {
        forwardValue3953_28_0 = spill3953_0;
        break forward_join_28;
    }
    if (!((spill3953_0 != 0))) {
        break forward_join_27;
    }
    spill3953_1 = recovery.source.CarrierOps.dcmpg(((double)(((moom.DT)(this.bZ)).a(((moom.DS)(p0))))), ((double)(((double) (this.b0 * this.b0)))));
    if (!((life4_5 == 0))) {
        forwardValue3953_28_0 = spill3953_1;
        break forward_join_28;
    }
    if (!((spill3953_1 < 0))) {
        break forward_join_29;
    }
    }
    forwardValue3953_28_0 = 1;
    }
    forwardValue3953_30_0 = forwardValue3953_28_0;
    break forward_join_30;
    }
    forwardValue3953_30_0 = 0;
    }
    return ((forwardValue3953_30_0) != 0);
}


public void a(moom.DT p0, int p1) {
this.bZ = ((moom.DT)(p0));
    this.b0 = ((float)(((float) p1)));
    return;
}


public static int o__sourceReturn_8abf5c6871() {
return moom.sI.b3;
}


public static int p__sourceReturn_8abf5c6871() {
int local0 = __sourceExactCall_29b1e480a5b245();
    if ((local0 == 0)) {
        return 113;
    }
    return 0;
}


private static moom.Oo g(moom.Oo p0) {
return p0;
}


public static void j(int p0) {
moom.sI.b3 = ((int)(p0));
    return;
}


public boolean N__Boolean() {
int forwardValue3950_25_0;
    int forwardValue3950_29_0;
    int forwardValue3950_31_0;
    boolean spill3950_0;
    long life1_3;
    int life3_5;
    forward_join_31: {
    forward_join_30: {
    forward_join_29: {
    forward_join_25: {
    life1_3 = (moom.sI.eb ^ 9824100621059L);
    life3_5 = net.minecraft.entity.SharedMonsterAttributes.b();
    spill3950_0 = super.N__Boolean();
    if (!((life3_5 == 0))) {
        forwardValue3950_25_0 = ((spill3950_0) ? 1 : 0);
        break forward_join_25;
    }
    if (!(spill3950_0)) {
        break forward_join_30;
    }
    forwardValue3950_25_0 = recovery.source.CarrierOps.fcmpl(((float)(((moom.sI)(this)).a__sourceReturn_8d24afb582(((moom.DT)(new moom.DT(((moom.sI)(this)).n, ((moom.CA)(((moom.sI)(this)).b())).c, ((moom.sI)(this)).p)))))), ((float)(0x0.0p0f)));
    }
    if (!((life3_5 == 0))) {
        forwardValue3950_29_0 = forwardValue3950_25_0;
        break forward_join_29;
    }
    if (!((forwardValue3950_25_0 >= 0))) {
        break forward_join_30;
    }
    forwardValue3950_29_0 = 1;
    }
    forwardValue3950_31_0 = forwardValue3950_29_0;
    break forward_join_31;
    }
    forwardValue3950_31_0 = 0;
    }
    return ((forwardValue3950_31_0) != 0);
}


public boolean Y() {
int forwardValue3952_13_0;
    int forwardValue3952_15_0;
    boolean spill3952_0;
    long life1_3;
    int life3_5;
    forward_join_15: {
    forward_join_14: {
    forward_join_13: {
    life1_3 = (moom.sI.eb ^ 100170121556371L);
    life3_5 = net.minecraft.entity.SharedMonsterAttributes.c();
    spill3952_0 = ((moom.AV)(((moom.sI)(this)).bI)).a__Boolean();
    if (!((life3_5 != 0))) {
        forwardValue3952_13_0 = ((spill3952_0) ? 1 : 0);
        break forward_join_13;
    }
    if (!((!spill3952_0))) {
        break forward_join_14;
    }
    forwardValue3952_13_0 = 1;
    }
    forwardValue3952_15_0 = forwardValue3952_13_0;
    break forward_join_15;
    }
    forwardValue3952_15_0 = 0;
    }
    return ((forwardValue3952_15_0) != 0);
}


protected void T() {
int forwardValue3951_70_0;
    moom.sI forwardValue3951_91_0;
    int forwardValue3951_99_0;
    int forwardValue3951_111_0;
    int forwardValue3951_177_0;
    moom.sI forwardValue3951_185_0;
    int forwardValue3951_186_0;
    int forwardValue3951_191_0;
    int forwardValue3951_207_0;
    moom.sI forwardValue3951_214_0;
    int spill3951_0;
    boolean spill3951_1;
    moom.sI spill3951_2;
    moom.sI spill3951_3;
    int spill3951_4;
    boolean spill3951_5;
    moom.sI spill3951_6;
    moom.sI spill3951_7;
    long life1_3;
    int life3_7;
    net.minecraft.entity.Entity life4_43;
    float life5_62;
    double life6_173;
    double life8_182;
    double life10_191;
    forward_join_215: {
    forward_join_214: {
    forward_join_213: {
    forward_join_207: {
    forward_join_191: {
    forward_join_186: {
    forward_join_185: {
    forward_join_184: {
    forward_join_182: {
    forward_join_177: {
    forward_join_174: {
    forward_join_111: {
    forward_join_108: {
    forward_join_99: {
    forward_join_93: {
    forward_join_91: {
    forward_join_90: {
    forward_join_70: {
    forward_join_68: {
    forward_join_67: {
    life1_3 = (moom.sI.eb ^ 78918777466706L);
    spill3951_0 = net.minecraft.entity.SharedMonsterAttributes.c();
    super.T();
    life3_7 = spill3951_0;
    spill3951_1 = ((moom.sI)(this)).T__Boolean();
    if (!((life3_7 != 0))) {
        forwardValue3951_186_0 = ((spill3951_1) ? 1 : 0);
        break forward_join_186;
    }
    if (!(spill3951_1)) {
        break forward_join_184;
    }
    spill3951_2 = this;
    if (!((life3_7 != 0))) {
        forwardValue3951_185_0 = spill3951_2;
        break forward_join_185;
    }
    if (!((((moom.sI)(spill3951_2)).c__sourceReturn_09c029d8c3() != null))) {
        break forward_join_184;
    }
    spill3951_3 = this;
    if (!((life3_7 != 0))) {
        forwardValue3951_185_0 = spill3951_3;
        break forward_join_185;
    }
    if (!((((net.minecraft.entity.Entity)(((moom.sI)(spill3951_3)).c__sourceReturn_09c029d8c3())).i == ((moom.sI)(this)).i))) {
        break forward_join_184;
    }
    life4_43 = ((moom.sI)(this)).c__sourceReturn_09c029d8c3();
    ((moom.sI)(this)).a(((moom.DT)(new moom.DT(((int) ((net.minecraft.entity.Entity)(life4_43)).n), ((int) ((net.minecraft.entity.Entity)(life4_43)).o), ((int) ((net.minecraft.entity.Entity)(life4_43)).p)))), ((int)(5)));
    life5_62 = ((moom.sI)(this)).a__Float(((net.minecraft.entity.Entity)(life4_43)));
    spill3951_4 = ((this instanceof moom.sS) ? 1 : 0);
    if (!((life3_7 != 0))) {
        forwardValue3951_70_0 = spill3951_4;
        break forward_join_70;
    }
    if (!((spill3951_4 != 0))) {
        break forward_join_68;
    }
    spill3951_5 = ((moom.sS)(((moom.sS)(this)))).af();
    if (!((life3_7 != 0))) {
        forwardValue3951_70_0 = ((spill3951_5) ? 1 : 0);
        break forward_join_70;
    }
    if (!(spill3951_5)) {
        break forward_join_68;
    }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(life5_62)), ((float)(0x1.4p3f))) > 0))) {
        break forward_join_67;
    }
    ((moom.sI)(this)).a(((boolean)(true)), ((boolean)(true)));
    }
    return;
    }
    forwardValue3951_70_0 = ((this.b2) ? 1 : 0);
    }
    if (!((life3_7 != 0))) {
        forwardValue3951_99_0 = forwardValue3951_70_0;
        break forward_join_99;
    }
    if (!((forwardValue3951_70_0 == 0))) {
        break forward_join_93;
    }
    ((net.minecraft.entity.ai.EntityAITasks)(((moom.sI)(this)).bJ)).a(((int)(2)), ((moom.uc)(this.b1)));
    spill3951_6 = this;
    if (!((life3_7 != 0))) {
        forwardValue3951_91_0 = spill3951_6;
        break forward_join_91;
    }
    if (!((((((moom.sI)(spill3951_6)).a__sourceReturn_407923443b() instanceof moom.AW) ? 1 : 0) != 0))) {
        break forward_join_90;
    }
    ((moom.AW)(((moom.AW)(((moom.sI)(this)).a__sourceReturn_407923443b())))).a(((boolean)(false)));
    }
    forwardValue3951_91_0 = this;
    }
    ((moom.sI)(forwardValue3951_91_0)).b2 = ((boolean)(true));
    }
    ((moom.sI)(this)).i(((float)(life5_62)));
    forwardValue3951_99_0 = recovery.source.CarrierOps.fcmpl(((float)(life5_62)), ((float)(0x1.0p2f)));
    }
    if (!((life3_7 != 0))) {
        forwardValue3951_111_0 = forwardValue3951_99_0;
        break forward_join_111;
    }
    if (!((forwardValue3951_99_0 > 0))) {
        break forward_join_108;
    }
    ((moom.AV)(((moom.sI)(this)).a__sourceReturn_407923443b())).a(((net.minecraft.entity.Entity)(life4_43)), ((double)(0x1.0p0d)));
    }
    forwardValue3951_111_0 = recovery.source.CarrierOps.fcmpl(((float)(life5_62)), ((float)(0x1.8p2f)));
    }
    if (!((life3_7 != 0))) {
        forwardValue3951_177_0 = forwardValue3951_111_0;
        break forward_join_177;
    }
    if (!((forwardValue3951_111_0 > 0))) {
        break forward_join_174;
    }
    life6_173 = ((((net.minecraft.entity.Entity)(life4_43)).n - ((moom.sI)(this)).n) / ((double) life5_62));
    life8_182 = ((((net.minecraft.entity.Entity)(life4_43)).o - ((moom.sI)(this)).o) / ((double) life5_62));
    life10_191 = ((((net.minecraft.entity.Entity)(life4_43)).p - ((moom.sI)(this)).p) / ((double) life5_62));
    moom.sI __stackOp3951_43_0 = this;
    ((moom.sI)(__stackOp3951_43_0)).t = ((double)((((moom.sI)(__stackOp3951_43_0)).t + ((life6_173 * java.lang.Math.abs(((double)(life6_173)))) * 0x1.999999999999ap-2d))));
    moom.sI __stackOp3951_47_0 = this;
    ((moom.sI)(__stackOp3951_47_0)).u = ((double)((((moom.sI)(__stackOp3951_47_0)).u + ((life8_182 * java.lang.Math.abs(((double)(life8_182)))) * 0x1.999999999999ap-2d))));
    moom.sI __stackOp3951_51_0 = this;
    ((moom.sI)(__stackOp3951_51_0)).v = ((double)((((moom.sI)(__stackOp3951_51_0)).v + ((life10_191 * java.lang.Math.abs(((double)(life10_191)))) * 0x1.999999999999ap-2d))));
    }
    forwardValue3951_177_0 = recovery.source.CarrierOps.fcmpl(((float)(life5_62)), ((float)(0x1.4p3f)));
    }
    if (!((forwardValue3951_177_0 > 0))) {
        break forward_join_182;
    }
    ((moom.sI)(this)).a(((boolean)(true)), ((boolean)(true)));
    }
    if (!((life3_7 == 0))) {
        break forward_join_215;
    }
    }
    forwardValue3951_185_0 = this;
    }
    forwardValue3951_186_0 = ((((moom.sI)(forwardValue3951_185_0)).T__Boolean()) ? 1 : 0);
    }
    if (!((life3_7 != 0))) {
        forwardValue3951_191_0 = forwardValue3951_186_0;
        break forward_join_191;
    }
    if (!((forwardValue3951_186_0 == 0))) {
        break forward_join_215;
    }
    forwardValue3951_191_0 = ((this.b2) ? 1 : 0);
    }
    if (!((life3_7 != 0))) {
        forwardValue3951_207_0 = forwardValue3951_191_0;
        break forward_join_207;
    }
    if (!((forwardValue3951_191_0 != 0))) {
        break forward_join_215;
    }
    this.b2 = ((boolean)(false));
    ((net.minecraft.entity.ai.EntityAITasks)(((moom.sI)(this)).bJ)).a(((moom.uc)(this.b1)));
    spill3951_7 = this;
    if (!((life3_7 != 0))) {
        forwardValue3951_214_0 = spill3951_7;
        break forward_join_214;
    }
    forwardValue3951_207_0 = ((((moom.sI)(spill3951_7)).a__sourceReturn_407923443b() instanceof moom.AW) ? 1 : 0);
    }
    if (!((forwardValue3951_207_0 != 0))) {
        break forward_join_213;
    }
    ((moom.AW)(((moom.AW)(((moom.sI)(this)).a__sourceReturn_407923443b())))).a(((boolean)(true)));
    }
    forwardValue3951_214_0 = this;
    }
    ((moom.sI)(forwardValue3951_214_0)).W__sourceReturn_da8c82d5d4();
    }
    return;
}


public void W__sourceReturn_da8c82d5d4() {
this.b0 = ((float)(-0x1.0p0f));
    return;
}


public boolean aa() {
int forwardValue3954_14_0;
    int forwardValue3954_16_0;
    int spill3954_0;
    long life1_3;
    int life3_5;
    forward_join_16: {
    forward_join_15: {
    forward_join_14: {
    life1_3 = (moom.sI.eb ^ 36562804549988L);
    life3_5 = net.minecraft.entity.SharedMonsterAttributes.b();
    spill3954_0 = recovery.source.CarrierOps.fcmpl(((float)(this.b0)), ((float)(-0x1.0p0f)));
    if (!((life3_5 == 0))) {
        forwardValue3954_14_0 = spill3954_0;
        break forward_join_14;
    }
    if (!((spill3954_0 != 0))) {
        break forward_join_15;
    }
    forwardValue3954_14_0 = 1;
    }
    forwardValue3954_16_0 = forwardValue3954_14_0;
    break forward_join_16;
    }
    forwardValue3954_16_0 = 0;
    }
    return ((forwardValue3954_16_0) != 0);
}


private static native int __sourceExactCall_29b1e480a5b245();
}
