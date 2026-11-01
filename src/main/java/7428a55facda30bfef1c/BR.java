package moom;


class BR {

static final int[] a;

static {
a = ((int[])(new int[(net.minecraft.network.EnumConnectionState.values()).length]));
    try {
        (moom.BR.a)[((net.minecraft.network.EnumConnectionState)(net.minecraft.network.EnumConnectionState.LOGIN)).ordinal()] = 1;
    } catch (java.lang.NoSuchFieldError life0_10) {
        java.lang.NoSuchFieldError __sourceCatchScope47_life0_10 = life0_10;
    }
    try {
        (moom.BR.a)[((net.minecraft.network.EnumConnectionState)(net.minecraft.network.EnumConnectionState.STATUS)).ordinal()] = 2;
    } catch (java.lang.NoSuchFieldError life0_17) {
        java.lang.NoSuchFieldError __sourceCatchScope47_life0_17 = life0_17;
    }
}

}
