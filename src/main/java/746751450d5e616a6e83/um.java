package moom;


public abstract class um extends moom.uc {

protected net.minecraft.entity.EntityLiving c;

protected moom.DT d;

protected net.minecraft.block.BlockDoor e;

boolean f;

float g;

float h;

private static long l;

public um(net.minecraft.entity.EntityLiving p0) { super(); }


private static void __sourceConstructorBody_e7f137e711522763(moom.um receiver, net.minecraft.entity.EntityLiving p0) throws Throwable {

long local2 = (moom.um.l ^ 113716380031886L);

    moom.um.__sourceConstructorInit_e7f137e711522763_0(((moom.um)(receiver)));

    ((moom.um)(receiver)).d = ((moom.DT)(moom.DT.f));

    ((moom.um)(receiver)).c = ((net.minecraft.entity.EntityLiving)(p0));

    if ((((__sourceExactCall_397ed84fa0ab7e(((net.minecraft.entity.EntityLiving)(p0))) instanceof moom.AW) ? 1 : 0) == 0)) {

        throw new java.lang.IllegalArgumentException("Unsupported mob type for DoorInteractGoal");

    }

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_e7f137e711522763_0(moom.um a0) throws E;

static {
moom.um.l = (moom._c.a(1009073497746229433L, 8040136766068959888L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(39999052196138L);
}


public boolean b__Boolean() {
int forwardValue4216_12_0;
    int forwardValue4216_14_0;
    boolean spill4216_0;
    long life1_3;
    int life3_5;
    forward_join_14: {
    forward_join_13: {
    forward_join_12: {
    life1_3 = (moom.um.l ^ 85706594652789L);
    life3_5 = ((moom.uc.e()) ? 1 : 0);
    spill4216_0 = this.f;
    if (!((life3_5 == 0))) {
        forwardValue4216_12_0 = ((spill4216_0) ? 1 : 0);
        break forward_join_12;
    }
    if (!((!spill4216_0))) {
        break forward_join_13;
    }
    forwardValue4216_12_0 = 1;
    }
    forwardValue4216_14_0 = forwardValue4216_12_0;
    break forward_join_14;
    }
    forwardValue4216_14_0 = 0;
    }
    return ((forwardValue4216_14_0) != 0);
}


public void c() {
long local1 = (moom.um.l ^ 27388489953494L);
    float local3 = ((float) (((double) (((float) ((moom.DT)(this.d)).a()) + 0x1.0p-1f)) - ((net.minecraft.entity.EntityLiving)(this.c)).n));
    float local4 = ((float) (((double) (((float) ((moom.DT)(this.d)).c()) + 0x1.0p-1f)) - ((net.minecraft.entity.EntityLiving)(this.c)).p));
    float local5 = ((this.g * local3) + (this.h * local4));
    if ((local5 < 0x0.0p0f)) {
        this.f = ((boolean)(true));
    }
    return;
}


private static java.lang.IllegalArgumentException a(java.lang.IllegalArgumentException p0) {
return p0;
}


public boolean a__Boolean() {
net.minecraft.entity.EntityLiving lexicalValue1334_16_0;
    moom.AT lexicalValue1334_27_0;
    int lexicalValue1334_121_0;
    int lexicalValue1334_123_0;
    net.minecraft.entity.EntityLiving spill1334_0;
    moom.AT spill1334_1;
    boolean spill1334_2;
    boolean spill1334_3;
    int spill1334_4;
    long life1_3;
    int life3_5;
    moom.AW life4_23;
    moom.AT life5_26;
    int life6_54;
    moom.AZ life7_67;
    lexical_join_123: {
    lexical_join_122: {
    lexical_join_121: {
    lexical_join_120: {
    lexical_join_101: {
    lexical_join_27: {
    lexical_join_16: {
    lexical_join_14: {
    life1_3 = (moom.um.l ^ 40958676695780L);
    life3_5 = ((moom.uc.e()) ? 1 : 0);
    spill1334_0 = this.c;
    if (!((life3_5 == 0))) {
        lexicalValue1334_16_0 = spill1334_0;
        break lexical_join_16;
    }
    if (!((!((net.minecraft.entity.EntityLiving)(spill1334_0)).B))) {
        break lexical_join_14;
    }
    return ((0) != 0);
    }
    lexicalValue1334_16_0 = this.c;
    }
    life4_23 = ((moom.AW)(((net.minecraft.entity.EntityLiving)(lexicalValue1334_16_0)).a__sourceReturn_407923443b()));
    life5_26 = ((moom.AW)(life4_23)).a__AT();
    spill1334_1 = life5_26;
    if (!((life3_5 == 0))) {
        lexicalValue1334_27_0 = spill1334_1;
        break lexical_join_27;
    }
    if (!((spill1334_1 != null))) {
        break lexical_join_122;
    }
    lexicalValue1334_27_0 = life5_26;
    }
    spill1334_2 = ((moom.AT)(lexicalValue1334_27_0)).a__Boolean();
    if (!((life3_5 == 0))) {
        lexicalValue1334_123_0 = ((spill1334_2) ? 1 : 0);
        break lexical_join_123;
    }
    if (!((!spill1334_2))) {
        break lexical_join_122;
    }
    spill1334_3 = ((moom.AW)(life4_23)).e();
    if (!((life3_5 == 0))) {
        lexicalValue1334_123_0 = ((spill1334_3) ? 1 : 0);
        break lexical_join_123;
    }
    if (!(spill1334_3)) {
        break lexical_join_122;
    }
    life6_54 = 0;
    lexical_cycle_38: while (true) {
    lexical_join_99: {
    lexical_join_98: {
    if (!((life6_54 < java.lang.Math.min(((int)((((moom.AT)(life5_26)).b() + 2))), ((int)(((moom.AT)(life5_26)).a())))))) {
        break lexical_join_101;
    }
    life7_67 = ((moom.AT)(life5_26)).a(((int)(life6_54)));
    this.d = ((moom.DT)(new moom.DT(((moom.AZ)(life7_67)).a, (((moom.AZ)(life7_67)).b + 1), ((moom.AZ)(life7_67)).c)));
    if (!((life3_5 == 0))) {
        break lexical_join_99;
    }
    spill1334_4 = recovery.source.CarrierOps.dcmpg(((double)(((net.minecraft.entity.EntityLiving)(this.c)).a(((double)(((double) ((moom.DT)(this.d)).a()))), ((double)(((net.minecraft.entity.EntityLiving)(this.c)).o)), ((double)(((double) ((moom.DT)(this.d)).c())))))), ((double)(0x1.2p1d)));
    if (!((life3_5 == 0))) {
        lexicalValue1334_121_0 = spill1334_4;
        break lexical_join_121;
    }
    if (!((spill1334_4 <= 0))) {
        break lexical_join_98;
    }
    this.e = ((net.minecraft.block.BlockDoor)(((moom.um)(this)).a(((moom.DT)(this.d)))));
    if (!((life3_5 == 0))) {
        break lexical_join_99;
    }
    if (!((this.e != null))) {
        break lexical_join_98;
    }
    return ((1) != 0);
    }
    life6_54 += 1;
    }
    if (!((life3_5 != 0))) { continue lexical_cycle_38; }
    break lexical_cycle_38;
    }
    }
    this.d = ((moom.DT)(((moom.DT)(new moom.DT(this.c))).a__DT()));
    this.e = ((net.minecraft.block.BlockDoor)(((moom.um)(this)).a(((moom.DT)(this.d)))));
    if (!((this.e != null))) {
        break lexical_join_120;
    }
    lexicalValue1334_121_0 = 1;
    break lexical_join_121;
    }
    lexicalValue1334_121_0 = 0;
    }
    return ((lexicalValue1334_121_0) != 0);
    }
    lexicalValue1334_123_0 = 0;
    }
    return ((lexicalValue1334_123_0) != 0);
}


private net.minecraft.block.BlockDoor a(moom.DT p0) {
net.minecraft.block.Block forwardValue4214_19_0;
    net.minecraft.block.Block forwardValue4214_25_0;
    net.minecraft.block.BlockDoor forwardValue4214_28_0;
    boolean spill4214_0;
    net.minecraft.block.Block spill4214_1;
    long life2_3;
    net.minecraft.block.Block life5_11;
    int life4_12;
    forward_join_28: {
    forward_join_27: {
    forward_join_25: {
    forward_join_19: {
    life2_3 = (moom.um.l ^ 134126374833347L);
    spill4214_0 = moom.uc.e();
    life5_11 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(((net.minecraft.entity.EntityLiving)(this.c)).i)).a__fE(((moom.DT)(p0))))).a__ch();
    life4_12 = ((spill4214_0) ? 1 : 0);
    spill4214_1 = life5_11;
    if (!((life4_12 == 0))) {
        forwardValue4214_19_0 = spill4214_1;
        break forward_join_19;
    }
    if (!((((spill4214_1 instanceof net.minecraft.block.BlockDoor) ? 1 : 0) != 0))) {
        break forward_join_27;
    }
    forwardValue4214_19_0 = life5_11;
    }
    if (!((life4_12 == 0))) {
        forwardValue4214_25_0 = forwardValue4214_19_0;
        break forward_join_25;
    }
    if (!((((net.minecraft.block.Block)(forwardValue4214_19_0)).a__fn() == moom.fn.d))) {
        break forward_join_27;
    }
    forwardValue4214_25_0 = life5_11;
    }
    forwardValue4214_28_0 = ((net.minecraft.block.BlockDoor)(forwardValue4214_25_0));
    break forward_join_28;
    }
    forwardValue4214_28_0 = null;
    }
    return forwardValue4214_28_0;
}


public void a__Void() {
this.f = ((boolean)(false));
    this.g = ((float)(((float) (((double) (((float) ((moom.DT)(this.d)).a()) + 0x1.0p-1f)) - ((net.minecraft.entity.EntityLiving)(this.c)).n))));
    this.h = ((float)(((float) (((double) (((float) ((moom.DT)(this.d)).c()) + 0x1.0p-1f)) - ((net.minecraft.entity.EntityLiving)(this.c)).p))));
    return;
}


private static native moom.AV __sourceExactCall_397ed84fa0ab7e(net.minecraft.entity.EntityLiving p0);
}
