package moom;


public class vN implements net.minecraft.entity.IEntityLivingData {

public int a;

private static net.minecraft.entity.Entity[] b;

private static final long c;

public vN() {
super();
}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(-1658191665537584271L)), ((long)(-5178185131789448812L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(78843659327365L)))));
    if ((moom.vN.b() != null)) {
        moom.vN.b(((net.minecraft.entity.Entity[])(new net.minecraft.entity.Entity[4])));
    }
}


public static net.minecraft.entity.Entity[] b() {
return moom.vN.b;
}


public static void b(net.minecraft.entity.Entity[] p0) {
moom.vN.b = ((net.minecraft.entity.Entity[])(p0));
    return;
}


public void a(java.util.Random p0) {
int forwardValue4302_23_0;
    int forwardValue4302_23_1;
    int forwardValue4302_34_0;
    int forwardValue4302_34_1;
    int forwardValue4302_45_0;
    int forwardValue4302_45_1;
    net.minecraft.entity.Entity[] spill4302_0;
    int spill4302_1;
    int spill4302_2;
    long life2_3;
    int life5_8;
    net.minecraft.entity.Entity[] life4_9;
    forward_join_50: {
    forward_join_45: {
    forward_join_43: {
    forward_join_34: {
    forward_join_32: {
    forward_join_23: {
    forward_join_21: {
    life2_3 = (moom.vN.c ^ 76174958773240L);
    spill4302_0 = moom.vN.b();
    life5_8 = ((java.util.Random)(p0)).nextInt(((int)(5)));
    life4_9 = spill4302_0;
    spill4302_1 = life5_8;
    spill4302_2 = 1;
    if (!((life4_9 == null))) {
        forwardValue4302_23_0 = spill4302_1;
        forwardValue4302_23_1 = spill4302_2;
        break forward_join_23;
    }
    if (!((spill4302_1 <= spill4302_2))) {
        break forward_join_21;
    }
    this.a = ((int)(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.d)).I));
    if (!((life4_9 != null))) {
        break forward_join_50;
    }
    }
    forwardValue4302_23_0 = life5_8;
    forwardValue4302_23_1 = 2;
    }
    if (!((life4_9 == null))) {
        forwardValue4302_34_0 = forwardValue4302_23_0;
        forwardValue4302_34_1 = forwardValue4302_23_1;
        break forward_join_34;
    }
    if (!((forwardValue4302_23_0 == forwardValue4302_23_1))) {
        break forward_join_32;
    }
    this.a = ((int)(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.h)).I));
    if (!((life4_9 != null))) {
        break forward_join_50;
    }
    }
    forwardValue4302_34_0 = life5_8;
    forwardValue4302_34_1 = 3;
    }
    if (!((life4_9 == null))) {
        forwardValue4302_45_0 = forwardValue4302_34_0;
        forwardValue4302_45_1 = forwardValue4302_34_1;
        break forward_join_45;
    }
    if (!((forwardValue4302_34_0 == forwardValue4302_34_1))) {
        break forward_join_43;
    }
    this.a = ((int)(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.m)).I));
    if (!((life4_9 != null))) {
        break forward_join_50;
    }
    }
    forwardValue4302_45_0 = life5_8;
    forwardValue4302_45_1 = 4;
    }
    if (!((forwardValue4302_45_0 <= forwardValue4302_45_1))) {
        break forward_join_50;
    }
    this.a = ((int)(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.q)).I));
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}

}
