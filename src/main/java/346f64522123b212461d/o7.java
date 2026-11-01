package moom;


class o7 implements moom.lh {

moom.lh a;

moom.o8 b;

com.mojang.authlib.minecraft.MinecraftProfileTexture.Type c;

moom.DD d;

com.mojang.authlib.minecraft.MinecraftProfileTexture e;

moom.o6 f;

private static long g;

o7(moom.o6 p0, moom.lh p1, moom.o8 p2, com.mojang.authlib.minecraft.MinecraftProfileTexture.Type p3, moom.DD p4, com.mojang.authlib.minecraft.MinecraftProfileTexture p5) { super(); }


private static void __sourceConstructorBody_3a008ce5d3eec9c8(moom.o7 receiver, moom.o6 p0, moom.lh p1, moom.o8 p2, com.mojang.authlib.minecraft.MinecraftProfileTexture.Type p3, moom.DD p4, com.mojang.authlib.minecraft.MinecraftProfileTexture p5) throws Throwable {

((moom.o7)(receiver)).f = ((moom.o6)(p0));

    ((moom.o7)(receiver)).a = ((moom.lh)(p1));

    ((moom.o7)(receiver)).b = ((moom.o8)(p2));

    ((moom.o7)(receiver)).c = ((com.mojang.authlib.minecraft.MinecraftProfileTexture.Type)(p3));

    ((moom.o7)(receiver)).d = ((moom.DD)(p4));

    ((moom.o7)(receiver)).e = ((com.mojang.authlib.minecraft.MinecraftProfileTexture)(p5));

    moom.o7.__sourceConstructorInit_3a008ce5d3eec9c8_0(((moom.o7)(receiver)));

    return;

}



static {
moom.o7.g = (moom._c.a(2743736564281422406L, -6382187177722931027L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(273023029062809L);
}

private static native <E extends Throwable> void __sourceConstructorInit_3a008ce5d3eec9c8_0(moom.o7 a0) throws E;

private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a() {
moom.o7 forwardValue3795_15_0;

    moom.o8 forwardValue3795_21_0;

    moom.o7 spill3795_0;

    moom.o8 spill3795_1;

    long life1_3;

    java.lang.String[] life3_5;

    forward_join_28: {

    forward_join_21: {

    forward_join_15: {

    forward_join_14: {

    life1_3 = (moom.o7.g ^ 82292537870925L);

    life3_5 = moom.oO.b();

    spill3795_0 = this;

    if (!((life3_5 != null))) {

        forwardValue3795_15_0 = spill3795_0;

        break forward_join_15;

    }

    if (!((((moom.o7)(spill3795_0)).a != null))) {

        break forward_join_14;

    }

    ((moom.lh)(this.a)).a();

    }

    forwardValue3795_15_0 = this;

    }

    spill3795_1 = ((moom.o7)(forwardValue3795_15_0)).b;

    if (!((life3_5 != null))) {

        forwardValue3795_21_0 = spill3795_1;

        break forward_join_21;

    }

    if (!((spill3795_1 != null))) {

        break forward_join_28;

    }

    forwardValue3795_21_0 = this.b;

    }

    ((moom.o8)(forwardValue3795_21_0)).a(((com.mojang.authlib.minecraft.MinecraftProfileTexture.Type)(this.c)), ((moom.DD)(this.d)), ((com.mojang.authlib.minecraft.MinecraftProfileTexture)(this.e)));

    }

    return;
}


public java.awt.image.BufferedImage a(java.awt.image.BufferedImage p0) {
moom.lh forwardValue3796_13_0;
    moom.lh spill3796_0;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_16: {
    forward_join_13: {
    life2_3 = (moom.o7.g ^ 75371910151201L);
    life4_5 = moom.oO.b();
    spill3796_0 = this.a;
    if (!((life4_5 != null))) {
        forwardValue3796_13_0 = spill3796_0;
        break forward_join_13;
    }
    if (!((spill3796_0 != null))) {
        break forward_join_16;
    }
    forwardValue3796_13_0 = this.a;
    }
    p0 = ((moom.lh)(forwardValue3796_13_0)).a(((java.awt.image.BufferedImage)(p0)));
    }
    return p0;
}

}
