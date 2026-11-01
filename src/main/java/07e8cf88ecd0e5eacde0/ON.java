package moom;


class ON extends paulscode.sound.SoundSystemLogger {

net.minecraft.client.audio.SoundManager a;

private static long b;

ON(net.minecraft.client.audio.SoundManager p0) { super(); }


private static void __sourceConstructorBody_4bee0a6af7f87743(moom.ON receiver, net.minecraft.client.audio.SoundManager p0) throws Throwable {

((moom.ON)(receiver)).a = ((net.minecraft.client.audio.SoundManager)(p0));

    moom.ON.__sourceConstructorInit_4bee0a6af7f87743_0(((moom.ON)(receiver)));

    return;

}



static {
moom.ON.b = (moom._c.a(5496444405156507138L, -4591924325607540623L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(39217355662787L);
}

private static native <E extends Throwable> void __sourceConstructorInit_4bee0a6af7f87743_0(moom.ON a0) throws E;

private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void message(java.lang.String p0, int p1) {
long local3 = (moom.ON.b ^ 73477582784976L);
    if ((__sourceIntrinsic_booleanComparison(((java.lang.String)(p0)).isEmpty()) == 0)) {
        ((org.apache.logging.log4j.Logger)(net.minecraft.client.audio.SoundManager.b)).info(((java.lang.String)(p0)));
    }
    return;
}


public void errorMessage(java.lang.String p0, java.lang.String p1, int p2) {
long life4_3;
    java.lang.String life6_5;
    forward_join_18: {
    forward_join_15: {
    life4_3 = (moom.ON.b ^ 36383129601362L);
    life6_5 = net.minecraft.client.audio.SoundHandler.b();
    if (!((life6_5 == null))) { break forward_join_15; }
    if (!((!((java.lang.String)(p1)).isEmpty()))) { break forward_join_18; }
    ((org.apache.logging.log4j.Logger)(net.minecraft.client.audio.SoundManager.b)).error(((java.lang.String)(__sourceIntrinsic_a20a21de599f_invokedynamic3426_4(p0))));
    }
    ((org.apache.logging.log4j.Logger)(net.minecraft.client.audio.SoundManager.b)).error(((java.lang.String)(p1)));
    }
    return;
}


public void importantMessage(java.lang.String p0, int p1) {
long local3 = (moom.ON.b ^ 111089621100342L);
    if ((__sourceIntrinsic_booleanComparison(((java.lang.String)(p0)).isEmpty()) == 0)) {
        ((org.apache.logging.log4j.Logger)(net.minecraft.client.audio.SoundManager.b)).warn(((java.lang.String)(p0)));
    }
    return;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a20a21de599f_invokedynamic3426_4(java.lang.String a0) throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
