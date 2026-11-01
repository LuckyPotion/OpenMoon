package net.minecraft.client.network;


class NetHandlerPlayClient$4 {

static final int[] a;

static final int[] b;

static {
b = ((int[])(new int[(net.minecraft.network.play.server.S38PacketPlayerListItem$Action.values()).length]));
    try {
        (net.minecraft.client.network.NetHandlerPlayClient$4.b)[((net.minecraft.network.play.server.S38PacketPlayerListItem$Action)(net.minecraft.network.play.server.S38PacketPlayerListItem$Action.ADD_PLAYER)).ordinal()] = 1;
    } catch (java.lang.NoSuchFieldError life0_10) {
        java.lang.NoSuchFieldError __sourceCatchScope130_life0_10 = life0_10;
    }
    try {
        (net.minecraft.client.network.NetHandlerPlayClient$4.b)[((net.minecraft.network.play.server.S38PacketPlayerListItem$Action)(net.minecraft.network.play.server.S38PacketPlayerListItem$Action.UPDATE_GAME_MODE)).ordinal()] = 2;
    } catch (java.lang.NoSuchFieldError life0_17) {
        java.lang.NoSuchFieldError __sourceCatchScope130_life0_17 = life0_17;
    }
    try {
        (net.minecraft.client.network.NetHandlerPlayClient$4.b)[((net.minecraft.network.play.server.S38PacketPlayerListItem$Action)(net.minecraft.network.play.server.S38PacketPlayerListItem$Action.UPDATE_LATENCY)).ordinal()] = 3;
    } catch (java.lang.NoSuchFieldError life0_24) {
        java.lang.NoSuchFieldError __sourceCatchScope130_life0_24 = life0_24;
    }
    try {
        (net.minecraft.client.network.NetHandlerPlayClient$4.b)[((net.minecraft.network.play.server.S38PacketPlayerListItem$Action)(net.minecraft.network.play.server.S38PacketPlayerListItem$Action.UPDATE_DISPLAY_NAME)).ordinal()] = 4;
    } catch (java.lang.NoSuchFieldError life0_31) {
        java.lang.NoSuchFieldError __sourceCatchScope130_life0_31 = life0_31;
    }
    a = ((int[])(new int[(net.minecraft.network.play.server.S45PacketTitle$Type.values()).length]));
    try {
        (net.minecraft.client.network.NetHandlerPlayClient$4.a)[((net.minecraft.network.play.server.S45PacketTitle$Type)(net.minecraft.network.play.server.S45PacketTitle$Type.TITLE)).ordinal()] = 1;
    } catch (java.lang.NoSuchFieldError life0_42) {
        java.lang.NoSuchFieldError __sourceCatchScope130_life0_42 = life0_42;
    }
    try {
        (net.minecraft.client.network.NetHandlerPlayClient$4.a)[((net.minecraft.network.play.server.S45PacketTitle$Type)(net.minecraft.network.play.server.S45PacketTitle$Type.SUBTITLE)).ordinal()] = 2;
    } catch (java.lang.NoSuchFieldError life0_49) {
        java.lang.NoSuchFieldError __sourceCatchScope130_life0_49 = life0_49;
    }
    try {
        (net.minecraft.client.network.NetHandlerPlayClient$4.a)[((net.minecraft.network.play.server.S45PacketTitle$Type)(net.minecraft.network.play.server.S45PacketTitle$Type.RESET)).ordinal()] = 3;
    } catch (java.lang.NoSuchFieldError life0_56) {
        java.lang.NoSuchFieldError __sourceCatchScope130_life0_56 = life0_56;
    }
}

}
