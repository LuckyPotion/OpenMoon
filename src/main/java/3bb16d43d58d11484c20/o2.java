package moom;


class o2 implements com.google.common.util.concurrent.FutureCallback<java.lang.Object> {

java.io.File a;

com.google.common.util.concurrent.SettableFuture b;

net.minecraft.client.resources.ResourcePackRepository c;

o2(net.minecraft.client.resources.ResourcePackRepository p0, java.io.File p1, com.google.common.util.concurrent.SettableFuture p2) { super(); }


private static void __sourceConstructorBody_02491e8cdfbe8542(moom.o2 receiver, net.minecraft.client.resources.ResourcePackRepository p0, java.io.File p1, com.google.common.util.concurrent.SettableFuture p2) throws Throwable {

((moom.o2)(receiver)).c = ((net.minecraft.client.resources.ResourcePackRepository)(p0));

    ((moom.o2)(receiver)).a = ((java.io.File)(p1));

    ((moom.o2)(receiver)).b = ((com.google.common.util.concurrent.SettableFuture)(p2));

    moom.o2.__sourceConstructorInit_02491e8cdfbe8542_0(((moom.o2)(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_02491e8cdfbe8542_0(moom.o2 a0) throws E;

public void onSuccess(java.lang.Object p0) {
((net.minecraft.client.resources.ResourcePackRepository)(this.c)).a(((java.io.File)(this.a)));
    ((com.google.common.util.concurrent.SettableFuture)(this.b)).set(((java.lang.Object)(null)));
    return;
}


public void onFailure(java.lang.Throwable p0) {
((com.google.common.util.concurrent.SettableFuture)(this.b)).setException(((java.lang.Throwable)(p0)));
    return;
}

}
