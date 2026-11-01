package moom;


class vx extends net.minecraft.entity.ai.EntityMoveHelper {

private float g;

private int h;

private final net.minecraft.entity.monster.EntitySlime i;

private boolean j;

private static final long l;

public vx(net.minecraft.entity.monster.EntitySlime p0) {
super(p0);
    this.i = p0;
}


static {
l = (moom._c.a(3272305096575653595L, 2937804542245635176L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(133751033419188L);
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public void a(double p0) {
((moom.vx)(this)).e = ((double)(p0));
    ((moom.vx)(this)).f = ((boolean)(true));
    return;
}


public void a(float p0, boolean p1) {
this.g = ((float)(p0));
    this.j = ((boolean)(p1));
    return;
}


public void a__Void() {
int forwardValue4336_48_0;
    int forwardValue4336_96_0;
    net.minecraft.entity.monster.EntitySlime forwardValue4336_99_0;
    moom.vx forwardValue4336_132_0;
    net.minecraft.entity.EntityLiving forwardValue4336_139_0;
    net.minecraft.entity.Entity[] spill4336_0;
    boolean spill4336_1;
    net.minecraft.entity.EntityLiving spill4336_2;
    moom.vx spill4336_3;
    int spill4336_4;
    boolean spill4336_5;
    net.minecraft.entity.monster.EntitySlime spill4336_6;
    net.minecraft.entity.monster.EntitySlime spill4336_7;
    float spill4336_8;
    long life1_3;
    net.minecraft.entity.Entity[] life3_16;
    forward_join_149: {
    forward_join_139: {
    forward_join_137: {
    forward_join_132: {
    forward_join_123: {
    forward_join_99: {
    forward_join_96: {
    forward_join_87: {
    forward_join_48: {
    forward_join_40: {
    life1_3 = (moom.vx.l ^ 89976354877899L);
    spill4336_0 = moom.vN.b();
    ((net.minecraft.entity.EntityLiving)(((moom.vx)(this)).a)).w = ((float)(((moom.vx)(this)).a(((float)(((net.minecraft.entity.EntityLiving)(((moom.vx)(this)).a)).w)), ((float)(this.g)), ((float)(0x1.ep4f)))));
    life3_16 = spill4336_0;
    ((net.minecraft.entity.EntityLiving)(((moom.vx)(this)).a)).a4 = ((float)(((net.minecraft.entity.EntityLiving)(((moom.vx)(this)).a)).w));
    ((net.minecraft.entity.EntityLiving)(((moom.vx)(this)).a)).a2 = ((float)(((net.minecraft.entity.EntityLiving)(((moom.vx)(this)).a)).w));
    spill4336_1 = ((moom.vx)(this)).f;
    if (!((life3_16 == null))) {
        forwardValue4336_48_0 = ((spill4336_1) ? 1 : 0);
        break forward_join_48;
    }
    if (!((!spill4336_1))) {
        break forward_join_40;
    }
    ((net.minecraft.entity.EntityLiving)(((moom.vx)(this)).a)).h(((float)(0x0.0p0f)));
    if (!((life3_16 != null))) {
        break forward_join_149;
    }
    }
    ((moom.vx)(this)).f = ((boolean)(false));
    spill4336_2 = ((moom.vx)(this)).a;
    if (!((life3_16 == null))) {
        forwardValue4336_139_0 = spill4336_2;
        break forward_join_139;
    }
    forwardValue4336_48_0 = ((((net.minecraft.entity.EntityLiving)(spill4336_2)).A) ? 1 : 0);
    }
    if (!((forwardValue4336_48_0 != 0))) {
        break forward_join_137;
    }
    ((net.minecraft.entity.EntityLiving)(((moom.vx)(this)).a)).f(((float)(((float) (((moom.vx)(this)).e * ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((net.minecraft.entity.EntityLiving)(((moom.vx)(this)).a)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.e))))).b())))));
    spill4336_3 = this;
    if (!((life3_16 == null))) {
        forwardValue4336_132_0 = spill4336_3;
        break forward_join_132;
    }
    moom.vx __stackOp4336_31_0 = spill4336_3;
    moom.vx __stackOp4336_33_0 = __stackOp4336_31_0;
    int __stackOp4336_33_1 = ((moom.vx)(__stackOp4336_31_0)).h;
    spill4336_4 = __stackOp4336_33_1;
    ((moom.vx)(__stackOp4336_33_0)).h = ((int)((__stackOp4336_33_1 - 1)));
    if (!((spill4336_4 <= 0))) {
        break forward_join_123;
    }
    this.h = ((int)(((net.minecraft.entity.monster.EntitySlime)(this.i)).p__sourceReturn_8abf5c6871()));
    spill4336_5 = this.j;
    if (!((life3_16 == null))) {
        forwardValue4336_96_0 = ((spill4336_5) ? 1 : 0);
        break forward_join_96;
    }
    if (!(spill4336_5)) {
        break forward_join_87;
    }
    moom.vx __stackOp4336_40_0 = this;
    ((moom.vx)(__stackOp4336_40_0)).h = ((int)((((moom.vx)(__stackOp4336_40_0)).h / 3)));
    }
    ((net.minecraft.entity.ai.EntityJumpHelper)(((net.minecraft.entity.monster.EntitySlime)(this.i)).a__vr())).a();
    spill4336_6 = this.i;
    if (!((life3_16 == null))) {
        forwardValue4336_99_0 = spill4336_6;
        break forward_join_99;
    }
    forwardValue4336_96_0 = ((((net.minecraft.entity.monster.EntitySlime)(spill4336_6)).Z()) ? 1 : 0);
    }
    if (!((forwardValue4336_96_0 != 0))) {
        break forward_join_149;
    }
    forwardValue4336_99_0 = this.i;
    }
    ((net.minecraft.entity.monster.EntitySlime)(forwardValue4336_99_0)).a(((java.lang.String)(((net.minecraft.entity.monster.EntitySlime)(this.i)).b__sourceReturn_0e30dfc966())), ((float)(((net.minecraft.entity.monster.EntitySlime)(this.i)).f__sourceReturn_bc607678b6())), ((float)(((((((java.util.Random)(((net.minecraft.entity.monster.EntitySlime)(this.i)).a__Random())).nextFloat() - ((java.util.Random)(((net.minecraft.entity.monster.EntitySlime)(this.i)).a__Random())).nextFloat()) * 0x1.99999ap-3f) + 0x1.0p0f) * 0x1.99999ap-1f))));
    if (!((life3_16 != null))) {
        break forward_join_149;
    }
    }
    spill4336_7 = this.i;
    net.minecraft.entity.monster.EntitySlime __stackOp4336_63_0 = this.i;
    float __stackOp4336_63_1 = 0x0.0p0f;
    spill4336_8 = __stackOp4336_63_1;
    ((net.minecraft.entity.monster.EntitySlime)(__stackOp4336_63_0)).bk = ((float)(__stackOp4336_63_1));
    ((net.minecraft.entity.monster.EntitySlime)(spill4336_7)).bj = ((float)(spill4336_8));
    forwardValue4336_132_0 = this;
    }
    ((net.minecraft.entity.EntityLiving)(((moom.vx)(forwardValue4336_132_0)).a)).f(((float)(0x0.0p0f)));
    if (!((life3_16 != null))) {
        break forward_join_149;
    }
    }
    forwardValue4336_139_0 = ((moom.vx)(this)).a;
    }
    ((net.minecraft.entity.EntityLiving)(forwardValue4336_139_0)).f(((float)(((float) (((moom.vx)(this)).e * ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((net.minecraft.entity.EntityLiving)(((moom.vx)(this)).a)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.e))))).b())))));
    }
    return;
}

}
