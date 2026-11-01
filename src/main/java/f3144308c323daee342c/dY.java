package com.moon;


public class dY extends com.moon.event.CancellableEvent {

private final net.minecraft.scoreboard.ScoreObjective c;

private static net.minecraft.entity.Entity[] e;

public dY(net.minecraft.scoreboard.ScoreObjective p0) {
super();
    this.c = p0;
}


static {
if ((com.moon.dY.a__Arrayr3() != null)) {
        com.moon.dY.a(((net.minecraft.entity.Entity[])(new net.minecraft.entity.Entity[1])));
    }
}


public static net.minecraft.entity.Entity[] a__Arrayr3() {
return com.moon.dY.e;
}


public net.minecraft.scoreboard.ScoreObjective a__sourceReturn_9a115a8a6d() {
return this.c;
}


public static void a(net.minecraft.entity.Entity[] p0) {
com.moon.dY.e = ((net.minecraft.entity.Entity[])(p0));
    return;
}

}
