package moom;


class Aq {

static final int[] a;

static {
a = ((int[])(new int[(net.minecraft.network.play.server.S38PacketPlayerListItem$Action.values()).length]));
    try {
        (moom.Aq.a)[((net.minecraft.network.play.server.S38PacketPlayerListItem$Action)(net.minecraft.network.play.server.S38PacketPlayerListItem$Action.ADD_PLAYER)).ordinal()] = 1;
    } catch (java.lang.NoSuchFieldError life0_10) {
        java.lang.NoSuchFieldError __sourceCatchScope46_life0_10 = life0_10;
    }
    try {
        (moom.Aq.a)[((net.minecraft.network.play.server.S38PacketPlayerListItem$Action)(net.minecraft.network.play.server.S38PacketPlayerListItem$Action.UPDATE_GAME_MODE)).ordinal()] = 2;
    } catch (java.lang.NoSuchFieldError life0_17) {
        java.lang.NoSuchFieldError __sourceCatchScope46_life0_17 = life0_17;
    }
    try {
        (moom.Aq.a)[((net.minecraft.network.play.server.S38PacketPlayerListItem$Action)(net.minecraft.network.play.server.S38PacketPlayerListItem$Action.UPDATE_LATENCY)).ordinal()] = 3;
    } catch (java.lang.NoSuchFieldError life0_24) {
        java.lang.NoSuchFieldError __sourceCatchScope46_life0_24 = life0_24;
    }
    try {
        (moom.Aq.a)[((net.minecraft.network.play.server.S38PacketPlayerListItem$Action)(net.minecraft.network.play.server.S38PacketPlayerListItem$Action.UPDATE_DISPLAY_NAME)).ordinal()] = 4;
    } catch (java.lang.NoSuchFieldError life0_31) {
        java.lang.NoSuchFieldError __sourceCatchScope46_life0_31 = life0_31;
    }
    try {
        (moom.Aq.a)[((net.minecraft.network.play.server.S38PacketPlayerListItem$Action)(net.minecraft.network.play.server.S38PacketPlayerListItem$Action.REMOVE_PLAYER)).ordinal()] = 5;
    } catch (java.lang.NoSuchFieldError life0_38) {
        java.lang.NoSuchFieldError __sourceCatchScope46_life0_38 = life0_38;
    }
}

}
