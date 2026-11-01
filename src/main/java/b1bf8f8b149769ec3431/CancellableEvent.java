package com.moon.event;

public class CancellableEvent extends com.moon.event.Event {
    private boolean cancelled;
    private static java.lang.String[] d;

    public CancellableEvent() {
        super();
    }

    static {
        if (com.moon.event.CancellableEvent.a() == null) {
            com.moon.event.CancellableEvent.a(new java.lang.String[3]);
        }
    }

    public static void a(java.lang.String[] p0) {
        com.moon.event.CancellableEvent.d = p0;
        return;
    }

    public static java.lang.String[] a() {
        return com.moon.event.CancellableEvent.d;
    }

    public boolean isCancelled() {
        return this.cancelled;
    }

    public com.moon.event.CancellableEvent setCancelled(boolean p0) {
        this.cancelled = p0;
        return this;
    }

}
