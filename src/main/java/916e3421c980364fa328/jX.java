package moom;


public class jX {

private com.mojang.authlib.GameProfile a;

private net.minecraft.world.WorldSettings$GameType b;

private int c;

private boolean d;

private moom.DD e;

private moom.DD f;

private java.lang.String g;

private net.minecraft.util.IChatComponent h;

private int i;

private int j;

private long k;

private long l;

private long m;

private static long n;

public jX(com.mojang.authlib.GameProfile p0) {
super();
    this.d = false;
    this.i = 0;
    this.j = 0;
    this.k = 0L;
    this.l = 0L;
    this.m = 0L;
    this.a = p0;
}


public jX(net.minecraft.network.play.server.S38PacketPlayerListItem$AddPlayerData p0) {
super();
    this.d = ((boolean)(false));
    this.i = ((int)(0));
    this.j = ((int)(0));
    this.k = ((long)(0L));
    this.l = ((long)(0L));
    this.m = ((long)(0L));
    this.a = ((com.mojang.authlib.GameProfile)(((net.minecraft.network.play.server.S38PacketPlayerListItem$AddPlayerData)(p0)).a__GameProfile()));
    this.b = ((net.minecraft.world.WorldSettings$GameType)(((net.minecraft.network.play.server.S38PacketPlayerListItem$AddPlayerData)(p0)).a__bE()));
    com.moon.ey local2 = new com.moon.ey(this.a, ((long) ((net.minecraft.network.play.server.S38PacketPlayerListItem$AddPlayerData)(p0)).a()));
    ((com.moon.events.EventBus)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).getEventBus())).publish(((java.lang.Object)(local2)));
    this.c = ((int)(((net.minecraft.network.play.server.S38PacketPlayerListItem$AddPlayerData)(p0)).a()));
    this.h = ((net.minecraft.util.IChatComponent)(((net.minecraft.network.play.server.S38PacketPlayerListItem$AddPlayerData)(p0)).a__C5()));
    return;
}


static {
moom.jX.n = (moom._c.a(7937104842486842696L, -7220482505946399367L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(4710377191735L);
}

private static native <E extends Throwable> void __sourceHandlerCall_e50931f2f369dfeb5d26(moom.jX a0) throws E;
private static final class __SourceHandler_e50931f2f369dfeb5d26 {

public static void f447(moom.jX receiver) throws Throwable {
    moom.jX forestValue447_27_0;
    boolean spill447_0;
    moom.jX spill447_1;
    long life1_3;
    moom.jX life4_7;
    int life3_9;
    forest_join_27: {
    forest_join_26: {
    life1_3 = (__fieldRead447_0() ^ 96633740194503L);
    spill447_0 = __call447_1();
    __monitorEnter447_2((life4_7 = receiver));
    life3_9 = __integerCategory447_3(spill447_0);
    spill447_1 = receiver;
    if (!((life3_9 != 0))) {
        forestValue447_27_0 = spill447_1;
        break forest_join_27;
    }
    if (!((!__fieldRead447_4(spill447_1)))) {
        break forest_join_26;
    }
    __fieldWrite447_5(receiver, 1);
    __call447_10(__call447_7(__call447_6()), __fieldRead447_8(receiver), __invokedynamic447_9(receiver), 1);
    }
    forestValue447_27_0 = life4_7;
    }
    __monitorExit447_11(forestValue447_27_0);
    return;
}
public static void h447_0(moom.Oo p0) throws Throwable {
    throw __call3044700_0(p0);
}
public static void h447_1(moom.Oo p0) throws Throwable {
    throw __call3044701_0(p0);
}
public static void h447_2(java.lang.Throwable p0, moom.jX p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __monitorExit3044702_0(p1);
    throw life2_2;
}
private static native long __fieldRead447_0() throws Throwable;
private static native boolean __call447_1() throws Throwable;
private static native void __monitorEnter447_2(moom.jX a0) throws Throwable;
private static native int __integerCategory447_3(boolean value) throws Throwable;
private static native boolean __fieldRead447_4(moom.jX a0) throws Throwable;
private static native void __fieldWrite447_5(moom.jX a0, int a1) throws Throwable;
private static native net.minecraft.client.Minecraft __call447_6() throws Throwable;
private static native moom.o6 __call447_7(net.minecraft.client.Minecraft a0) throws Throwable;
private static native com.mojang.authlib.GameProfile __fieldRead447_8(moom.jX a0) throws Throwable;
private static native moom.o8 __invokedynamic447_9(moom.jX a0) throws Throwable;
private static native void __call447_10(moom.o6 a0, com.mojang.authlib.GameProfile a1, moom.o8 a2, int a3) throws Throwable;
private static native void __monitorExit447_11(moom.jX a0) throws Throwable;
private static native moom.Oo __call3044700_0(moom.Oo a0) throws Throwable;
private static native moom.Oo __call3044701_0(moom.Oo a0) throws Throwable;
private static native void __monitorExit3044702_0(moom.jX a0) throws Throwable;

}


public long b__Long() {
return this.l;
}


public moom.DD b__DD() {
moom.DD forwardValue3684_15_0;
    moom.DD spill3684_0;
    long life1_3;
    int life3_5;
    forward_join_15: {
    forward_join_13: {
    life1_3 = (moom.jX.n ^ 121121924907147L);
    life3_5 = ((net.minecraft.client.network.NetHandlerPlayClient.b()) ? 1 : 0);
    spill3684_0 = this.f;
    if (!((life3_5 == 0))) {
        forwardValue3684_15_0 = spill3684_0;
        break forward_join_15;
    }
    if (!((spill3684_0 == null))) {
        break forward_join_13;
    }
    ((moom.jX)(this)).a__Void();
    }
    forwardValue3684_15_0 = this.f;
    }
    return forwardValue3684_15_0;
}


public void b(int p0) {
this.i = ((int)(p0));
    return;
}


public int b() {
return this.i;
}


public void b(long p0) {
this.l = ((long)(p0));
    return;
}


public void c(int p0) {
this.j = ((int)(p0));
    return;
}


public int c() {
return this.j;
}


public void c(long p0) {
this.m = ((long)(p0));
    return;
}


public long c__Long() {
return this.m;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(long p0) {
this.k = ((long)(p0));
    return;
}


public long a__Long() {
return this.k;
}


public boolean a__Boolean() {
long local1 = (moom.jX.n ^ 22503168718683L);
    return ((((this.e != null) ? 1 : 0)) != 0);
}


protected void a(int p0) {
com.moon.ey local2 = new com.moon.ey(this.a, ((long) p0));
    ((com.moon.events.EventBus)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).getEventBus())).publish(((java.lang.Object)(local2)));
    this.c = ((int)(p0));
    return;
}


protected void a(net.minecraft.world.WorldSettings$GameType p0) {
this.b = ((net.minecraft.world.WorldSettings$GameType)(p0));
    return;
}


public int a() {
return this.c;
}


public net.minecraft.world.WorldSettings$GameType a__bE() {
return this.b;
}


public com.mojang.authlib.GameProfile a__GameProfile() {
return this.a;
}


public net.minecraft.util.IChatComponent a__C5() {
return this.h;
}


public void a(net.minecraft.util.IChatComponent p0) {
this.h = ((net.minecraft.util.IChatComponent)(p0));
    return;
}


protected void a__Void() { __sourceHandlerCall_e50931f2f369dfeb5d26(this); }


public java.lang.String a__String() {
moom.jX forwardValue3683_17_0;
    java.lang.String forwardValue3683_18_0;
    moom.jX spill3683_0;
    long life1_3;
    int life3_5;
    forward_join_18: {
    forward_join_17: {
    forward_join_16: {
    life1_3 = (moom.jX.n ^ 108793046020941L);
    life3_5 = ((net.minecraft.client.network.NetHandlerPlayClient.c()) ? 1 : 0);
    spill3683_0 = this;
    if (!((life3_5 != 0))) {
        forwardValue3683_17_0 = spill3683_0;
        break forward_join_17;
    }
    if (!((((moom.jX)(spill3683_0)).g == null))) {
        break forward_join_16;
    }
    forwardValue3683_18_0 = moom.oJ.a(((java.util.UUID)(((com.mojang.authlib.GameProfile)(this.a)).getId())));
    break forward_join_18;
    }
    forwardValue3683_17_0 = this;
    }
    forwardValue3683_18_0 = ((moom.jX)(forwardValue3683_17_0)).g;
    }
    return forwardValue3683_18_0;
}


public moom.DD a__DD() {
moom.DD forwardValue3682_21_0;
    moom.DD spill3682_0;
    long life1_3;
    int life3_5;
    forward_join_21: {
    forward_join_13: {
    life1_3 = (moom.jX.n ^ 7809791884333L);
    life3_5 = ((net.minecraft.client.network.NetHandlerPlayClient.b()) ? 1 : 0);
    spill3682_0 = this.e;
    if (!((life3_5 == 0))) {
        forwardValue3682_21_0 = spill3682_0;
        break forward_join_21;
    }
    if (!((spill3682_0 == null))) {
        break forward_join_13;
    }
    ((moom.jX)(this)).a__Void();
    }
    forwardValue3682_21_0 = ((moom.DD)(com.google.common.base.MoreObjects.firstNonNull(((java.lang.Object)(this.e)), ((java.lang.Object)(moom.oJ.a__DD(((java.util.UUID)(((com.mojang.authlib.GameProfile)(this.a)).getId()))))))));
    }
    return forwardValue3682_21_0;
}


public moom.Bk a__Bk() {
return ((net.minecraft.scoreboard.Scoreboard)(((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).I)).a__Bh())).c(((java.lang.String)(((com.mojang.authlib.GameProfile)(((moom.jX)(this)).a__GameProfile())).getName())));
}


private void lambda$loadPlayerTextures$0(com.mojang.authlib.minecraft.MinecraftProfileTexture.Type p0, moom.DD p1, com.mojang.authlib.minecraft.MinecraftProfileTexture p2) {
moom.jX forestValue448_27_0;
    moom.jX spill448_0;
    long life4_3;
    int life6_5;
    forest_join_34: {
    forest_join_31: {
    forest_join_27: {
    forest_join_21: {
    forest_join_13: {
    life4_3 = (moom.jX.n ^ 96046175745388L);
    life6_5 = ((net.minecraft.client.network.NetHandlerPlayClient.b()) ? 1 : 0);
    if (!((life6_5 == 0))) {
        break forest_join_21;
    }
    switch ((moom.jY.a)[((com.mojang.authlib.minecraft.MinecraftProfileTexture.Type)(p0)).ordinal()]) {
case 1:
{
        break forest_join_13;
    }
case 2:
{
        break forest_join_31;
    }
default:
{
        break forest_join_34;
    }
}
    }
    this.e = ((moom.DD)(p1));
    this.g = ((java.lang.String)(((com.mojang.authlib.minecraft.MinecraftProfileTexture)(p2)).getMetadata(((java.lang.String)("model")))));
    }
    spill448_0 = this;
    if (!((life6_5 == 0))) {
        forestValue448_27_0 = spill448_0;
        break forest_join_27;
    }
    if (!((((moom.jX)(spill448_0)).g == null))) {
        break forest_join_34;
    }
    forestValue448_27_0 = this;
    }
    ((moom.jX)(forestValue448_27_0)).g = ((java.lang.String)("default"));
    if (!((life6_5 != 0))) {
        break forest_join_34;
    }
    }
    this.f = ((moom.DD)(p1));
    }
    return;
}

}
