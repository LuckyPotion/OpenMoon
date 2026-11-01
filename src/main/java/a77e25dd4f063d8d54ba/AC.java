package moom;


class AC {

static final int[] a;

static {
a = ((int[])(new int[(net.minecraft.network.play.server.S42PacketCombatEvent$Event.values()).length]));
    try {
        (moom.AC.a)[((net.minecraft.network.play.server.S42PacketCombatEvent$Event)(net.minecraft.network.play.server.S42PacketCombatEvent$Event.END_COMBAT)).ordinal()] = 1;
    } catch (java.lang.NoSuchFieldError life0_10) {
        java.lang.NoSuchFieldError __sourceCatchScope45_life0_10 = life0_10;
    }
    try {
        (moom.AC.a)[((net.minecraft.network.play.server.S42PacketCombatEvent$Event)(net.minecraft.network.play.server.S42PacketCombatEvent$Event.ENTITY_DIED)).ordinal()] = 2;
    } catch (java.lang.NoSuchFieldError life0_17) {
        java.lang.NoSuchFieldError __sourceCatchScope45_life0_17 = life0_17;
    }
}

}
