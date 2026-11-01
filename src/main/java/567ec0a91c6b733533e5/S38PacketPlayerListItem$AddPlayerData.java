package net.minecraft.network.play.server;


public class S38PacketPlayerListItem$AddPlayerData {

private final int a;

private final net.minecraft.world.WorldSettings$GameType b;

private final com.mojang.authlib.GameProfile c;

private final net.minecraft.util.IChatComponent d;

private static final long e;

public S38PacketPlayerListItem$AddPlayerData(com.mojang.authlib.GameProfile p0, int p1, net.minecraft.world.WorldSettings$GameType p2, net.minecraft.util.IChatComponent p3) {
super();
    this.c = p0;
    this.a = p1;
    this.b = p2;
    this.d = p3;
}


static {
net.minecraft.network.play.server.S38PacketPlayerListItem$AddPlayerData.e = (moom._c.a(-7085647726045182547L, 7385950450597543012L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(144302690602307L);
}


public java.lang.String toString() {
com.google.common.base.MoreObjects.ToStringHelper forwardValue5538_28_0;
    java.lang.String forwardValue5538_28_1;
    com.google.common.base.MoreObjects.ToStringHelper forwardValue5538_30_0;
    java.lang.String forwardValue5538_30_1;
    net.minecraft.util.IChatComponent forwardValue5538_30_2;
    com.google.common.base.MoreObjects.ToStringHelper forwardValue5538_31_0;
    java.lang.String forwardValue5538_31_1;
    java.lang.String forwardValue5538_31_2;
    com.google.common.base.MoreObjects.ToStringHelper spill5538_0;
    java.lang.String spill5538_1;
    net.minecraft.util.IChatComponent spill5538_2;
    long life1_3;
    int[] life3_5;
    forward_join_31: {
    forward_join_30: {
    forward_join_28: {
    life1_3 = (net.minecraft.network.play.server.S38PacketPlayerListItem$AddPlayerData.e ^ 82721817532368L);
    life3_5 = moom.zN.b__ArrayInt();
    spill5538_0 = ((com.google.common.base.MoreObjects.ToStringHelper)(((com.google.common.base.MoreObjects.ToStringHelper)(((com.google.common.base.MoreObjects.ToStringHelper)(com.google.common.base.MoreObjects.toStringHelper(((java.lang.Object)(this))))).add(((java.lang.String)("latency")), ((int)(this.a))))).add(((java.lang.String)("gameMode")), ((java.lang.Object)(this.b))))).add(((java.lang.String)("profile")), ((java.lang.Object)(this.c)));
    spill5538_1 = "displayName";
    spill5538_2 = this.d;
    if (!((life3_5 == null))) {
        forwardValue5538_30_0 = spill5538_0;
        forwardValue5538_30_1 = spill5538_1;
        forwardValue5538_30_2 = spill5538_2;
        break forward_join_30;
    }
    if (!((spill5538_2 == null))) {
        forwardValue5538_28_0 = spill5538_0;
        forwardValue5538_28_1 = spill5538_1;
        break forward_join_28;
    }
    forwardValue5538_31_0 = spill5538_0;
    forwardValue5538_31_1 = spill5538_1;
    forwardValue5538_31_2 = null;
    break forward_join_31;
    }
    forwardValue5538_30_0 = forwardValue5538_28_0;
    forwardValue5538_30_1 = forwardValue5538_28_1;
    forwardValue5538_30_2 = this.d;
    }
    forwardValue5538_31_0 = forwardValue5538_30_0;
    forwardValue5538_31_1 = forwardValue5538_30_1;
    forwardValue5538_31_2 = net.minecraft.util.IChatComponent$Serializer.a(((net.minecraft.util.IChatComponent)(forwardValue5538_30_2)));
    }
    return ((com.google.common.base.MoreObjects.ToStringHelper)(((com.google.common.base.MoreObjects.ToStringHelper)(forwardValue5538_31_0)).add(((java.lang.String)(forwardValue5538_31_1)), ((java.lang.Object)(forwardValue5538_31_2))))).toString();
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public net.minecraft.util.IChatComponent a__C5() {
return this.d;
}


public net.minecraft.world.WorldSettings$GameType a__bE() {
return this.b;
}


public int a() {
return this.a;
}


public com.mojang.authlib.GameProfile a__GameProfile() {
return this.c;
}

}
