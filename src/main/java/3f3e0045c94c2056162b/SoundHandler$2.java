package net.minecraft.client.audio;


class SoundHandler$2 implements net.minecraft.client.audio.ISoundEventAccessor<net.minecraft.client.audio.SoundPoolEntry> {

moom.DD a;

java.lang.String b;

moom.f6 c;

net.minecraft.client.audio.SoundHandler d;

private static long e;

SoundHandler$2(net.minecraft.client.audio.SoundHandler p0, java.lang.String p1, moom.f6 p2) { super(); }

private static void __sourceConstructorBody_231cb8813d30bc12(net.minecraft.client.audio.SoundHandler$2 receiver, net.minecraft.client.audio.SoundHandler p0, java.lang.String p1, moom.f6 p2) throws Throwable {
((net.minecraft.client.audio.SoundHandler$2)(receiver)).d = ((net.minecraft.client.audio.SoundHandler)(p0));
    ((net.minecraft.client.audio.SoundHandler$2)(receiver)).b = ((java.lang.String)(p1));
    ((net.minecraft.client.audio.SoundHandler$2)(receiver)).c = ((moom.f6)(p2));
    net.minecraft.client.audio.SoundHandler$2.__sourceConstructorInit_231cb8813d30bc12_0(((net.minecraft.client.audio.SoundHandler$2)(receiver)));
    ((net.minecraft.client.audio.SoundHandler$2)(receiver)).a = ((moom.DD)(new moom.DD(((net.minecraft.client.audio.SoundHandler$2)(receiver)).b, ((moom.f6)(((net.minecraft.client.audio.SoundHandler$2)(receiver)).c)).a__String())));
    return;
}


static {
net.minecraft.client.audio.SoundHandler$2.e = (moom._c.a(-4220010390704031909L, -8275371978510423136L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(110678528620875L);
}

private static native <E extends Throwable> void __sourceConstructorInit_231cb8813d30bc12_0(net.minecraft.client.audio.SoundHandler$2 a0) throws E;

private static moom.Oo a(moom.Oo p0) {
return p0;
}


public net.minecraft.client.audio.SoundPoolEntry a__Object() {
return ((net.minecraft.client.audio.SoundHandler$2)(this)).a__f9();
}


public net.minecraft.client.audio.SoundPoolEntry a__f9() {
net.minecraft.client.audio.SoundEventAccessorComposite forwardValue4755_21_0;
    net.minecraft.client.audio.SoundPoolEntry forwardValue4755_22_0;
    java.lang.String spill4755_0;
    net.minecraft.client.audio.SoundEventAccessorComposite spill4755_1;
    long life1_3;
    net.minecraft.client.audio.SoundEventAccessorComposite life4_12;
    java.lang.String life3_13;
    forward_join_22: {
    forward_join_21: {
    forward_join_20: {
    life1_3 = (net.minecraft.client.audio.SoundHandler$2.e ^ 72169295949177L);
    spill4755_0 = net.minecraft.client.audio.SoundHandler.b();
    life4_12 = ((net.minecraft.client.audio.SoundEventAccessorComposite)(((moom.Dz)(((net.minecraft.client.audio.SoundHandler)(this.d)).e)).a__Object(((this.a)))));
    life3_13 = spill4755_0;
    spill4755_1 = life4_12;
    if (!((life3_13 == null))) {
        forwardValue4755_21_0 = spill4755_1;
        break forward_join_21;
    }
    if (!((spill4755_1 == null))) {
        break forward_join_20;
    }
    forwardValue4755_22_0 = net.minecraft.client.audio.SoundHandler.d;
    break forward_join_22;
    }
    forwardValue4755_21_0 = life4_12;
    }
    forwardValue4755_22_0 = ((net.minecraft.client.audio.SoundEventAccessorComposite)(forwardValue4755_21_0)).a__f9();
    }
    return forwardValue4755_22_0;
}


public int a() {
net.minecraft.client.audio.SoundEventAccessorComposite forwardValue4754_21_0;
    int forwardValue4754_22_0;
    java.lang.String spill4754_0;
    net.minecraft.client.audio.SoundEventAccessorComposite spill4754_1;
    long life1_3;
    net.minecraft.client.audio.SoundEventAccessorComposite life4_12;
    java.lang.String life3_13;
    forward_join_22: {
    forward_join_21: {
    forward_join_20: {
    life1_3 = (net.minecraft.client.audio.SoundHandler$2.e ^ 9469459954832L);
    spill4754_0 = net.minecraft.client.audio.SoundHandler.b();
    life4_12 = ((net.minecraft.client.audio.SoundEventAccessorComposite)(((moom.Dz)(((net.minecraft.client.audio.SoundHandler)(this.d)).e)).a__Object(((this.a)))));
    life3_13 = spill4754_0;
    spill4754_1 = life4_12;
    if (!((life3_13 == null))) {
        forwardValue4754_21_0 = spill4754_1;
        break forward_join_21;
    }
    if (!((spill4754_1 == null))) {
        break forward_join_20;
    }
    forwardValue4754_22_0 = 0;
    break forward_join_22;
    }
    forwardValue4754_21_0 = life4_12;
    }
    forwardValue4754_22_0 = ((net.minecraft.client.audio.SoundEventAccessorComposite)(forwardValue4754_21_0)).a();
    }
    return forwardValue4754_22_0;
}

}
