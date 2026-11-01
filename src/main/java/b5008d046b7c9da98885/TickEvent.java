package com.moon.event;


public class TickEvent extends com.moon.event.Event {

private final com.moon.event.TickPhase phase;

private int tickCounter;

private static final long d;

public TickEvent(com.moon.event.TickPhase p0) {
super();
    this.phase = p0;
}


static {
d = (moom._c.a(2615692105955052925L, -1378921720520236143L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(141732310180328L);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public int getTickCounter() {
return this.tickCounter;
}


public com.moon.event.TickPhase getPhase() {
return this.phase;
}


public boolean consumeCounter() {
int forwardValue73_17_0;
    int forwardValue73_19_0;
    int spill73_0;
    long life1_3;
    int life3_5;
    forward_join_19: {
    forward_join_18: {
    forward_join_17: {
    life1_3 = (com.moon.event.TickEvent.d ^ 35336297589212L);
    life3_5 = ((com.moon.event.MoveEvent.d()) ? 1 : 0);
    com.moon.event.TickEvent __stackOp73_3_0 = this;
    com.moon.event.TickEvent __stackOp73_5_0 = __stackOp73_3_0;
    int __stackOp73_5_1 = ((com.moon.event.TickEvent)(__stackOp73_3_0)).tickCounter;
    spill73_0 = __stackOp73_5_1;
    ((com.moon.event.TickEvent)(__stackOp73_5_0)).tickCounter = ((int)((__stackOp73_5_1 - 1)));
    if (!((life3_5 == 0))) {
        forwardValue73_17_0 = spill73_0;
        break forward_join_17;
    }
    if (!((spill73_0 > 0))) {
        break forward_join_18;
    }
    forwardValue73_17_0 = 1;
    }
    forwardValue73_19_0 = forwardValue73_17_0;
    break forward_join_19;
    }
    forwardValue73_19_0 = 0;
    }
    return ((forwardValue73_19_0) != 0);
}


public void incrementCounter() {
this.tickCounter += 1;
    return;
}

}
