package moom;


class fN implements java.util.function.Consumer<java.lang.Runnable> {

net.minecraft.client.Minecraft a;

fN(net.minecraft.client.Minecraft p0) { super(); }


private static void __sourceConstructorBody_c6598e3c8d43f37b(moom.fN receiver, net.minecraft.client.Minecraft p0) throws Throwable {

((moom.fN)(receiver)).a = ((net.minecraft.client.Minecraft)(p0));

    moom.fN.__sourceConstructorInit_c6598e3c8d43f37b_0(((moom.fN)(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_c6598e3c8d43f37b_0(moom.fN a0) throws E;

public void a(java.lang.Runnable p0) {
((net.minecraft.client.Minecraft)(this.a)).a__Void(((java.lang.Runnable)(p0)));
    return;
}


public void accept__sourceBridge_f286d6bd4c(java.lang.Object p0) {
((moom.fN)(this)).a(((java.lang.Runnable)(((java.lang.Runnable)(p0)))));
}

public void accept(java.lang.Runnable __bridgeParam0) { this.accept__sourceBridge_f286d6bd4c(((java.lang.Object)(__bridgeParam0))); }
}
