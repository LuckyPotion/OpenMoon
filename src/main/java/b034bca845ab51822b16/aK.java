package com.moon;

import io.netty.buffer.ByteBuf;


public class aK extends com.viaversion.viaversion.ViaAPIBase<java.util.UUID> {

private static java.lang.String b;

public aK() {
super();
    return;
}


static {
if ((com.moon.aK.b() != null)) {
        com.moon.aK.b(((java.lang.String)("q981K")));
    }
}


public static void b(java.lang.String p0) {
b = ((java.lang.String)(p0));
    return;
}


public static java.lang.String b() {
return com.moon.aK.b;
}


public int getPlayerVersion__sourceBridge_e47da4afb6(java.lang.Object p0) {
return super.getPlayerVersion(((java.util.UUID)(((java.util.UUID)(p0)))));
}


public void sendRawPacket__sourceBridge_b1d9f08d0d(java.lang.Object p0, ByteBuf p1) {
super.sendRawPacket(((java.util.UUID)(((java.util.UUID)(p0)))), ((ByteBuf)(p1)));
}


public int getPlayerVersion(java.util.UUID __bridgeParam0) { return this.getPlayerVersion__sourceBridge_e47da4afb6(((java.lang.Object)(__bridgeParam0))); }
public void sendRawPacket(java.util.UUID __bridgeParam0, ByteBuf __bridgeParam1) { this.sendRawPacket__sourceBridge_b1d9f08d0d(((java.lang.Object)(__bridgeParam0)), ((ByteBuf)(__bridgeParam1))); }
}
