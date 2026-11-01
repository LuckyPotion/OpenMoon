package net.minecraft.client.gui;


class GuiPlayerTabOverlay$PlayerComparator implements java.util.Comparator<moom.jX> {

private GuiPlayerTabOverlay$PlayerComparator() {
super();
}


public int compare__sourceBridge_3438c2120d(java.lang.Object p0, java.lang.Object p1) {
return ((net.minecraft.client.gui.GuiPlayerTabOverlay$PlayerComparator)(this)).a(((moom.jX)(((moom.jX)(p0)))), ((moom.jX)(((moom.jX)(p1)))));
}


public int a(moom.jX p0, moom.jX p1) {
moom.Bk local3 = ((moom.jX)(p0)).a__Bk();
    moom.Bk local4 = ((moom.jX)(p1)).a__Bk();
    com.google.common.collect.ComparisonChain spill8505_0 = com.google.common.collect.ComparisonChain.start();
    int spill8505_1 = ((((moom.jX)(p0)).a__bE() != net.minecraft.world.WorldSettings$GameType.SPECTATOR) ? 1 : 0);
    com.google.common.collect.ComparisonChain spill8505_2 = ((com.google.common.collect.ComparisonChain)(spill8505_0)).compareTrueFirst(((boolean)__sourceIntrinsic_integerToBoolean((spill8505_1))), ((boolean)__sourceIntrinsic_integerToBoolean((((((moom.jX)(p1)).a__bE() != net.minecraft.world.WorldSettings$GameType.SPECTATOR) ? 1 : 0)))));
    java.lang.String spill8505_3 = ((local3 != null) ? ((moom.Bk)(local3)).a__String() : "");
    return ((com.google.common.collect.ComparisonChain)(((com.google.common.collect.ComparisonChain)(((com.google.common.collect.ComparisonChain)(spill8505_2)).compare(((java.lang.Comparable)(spill8505_3)), ((java.lang.Comparable)(((local4 != null) ? ((moom.Bk)(local4)).a__String() : "")))))).compare(((java.lang.Comparable)(((com.mojang.authlib.GameProfile)(((moom.jX)(p0)).a__GameProfile())).getName())), ((java.lang.Comparable)(((com.mojang.authlib.GameProfile)(((moom.jX)(p1)).a__GameProfile())).getName()))))).result();
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static native boolean __sourceIntrinsic_integerToBoolean(int value);

public int compare(moom.jX __bridgeParam0, moom.jX __bridgeParam1) { return this.compare__sourceBridge_3438c2120d(((java.lang.Object)(__bridgeParam0)), ((java.lang.Object)(__bridgeParam1))); }
}
