package com.moon;


public class o_ implements com.viaversion.viaversion.api.platform.ViaPlatformLoader {

private static java.lang.String b;

public o_() {
super();
}


static {
if ((com.moon.o_.b() != null)) {
        com.moon.o_.b(((java.lang.String)("uuto1b")));
    }
}


public void load() {
((com.viaversion.viaversion.api.platform.providers.ViaProviders)(((com.viaversion.viaversion.api.ViaManager)(com.viaversion.viaversion.api.Via.getManager())).getProviders())).use(((java.lang.Class)(com.viaversion.viaversion.protocols.protocol1_9to1_8.providers.MovementTransmitterProvider.class)), ((com.viaversion.viaversion.api.platform.providers.Provider)(new com.viaversion.viaversion.bungee.providers.BungeeMovementTransmitter())));
    ((com.viaversion.viaversion.api.platform.providers.ViaProviders)(((com.viaversion.viaversion.api.ViaManager)(com.viaversion.viaversion.api.Via.getManager())).getProviders())).use(((java.lang.Class)(com.viaversion.viaversion.api.protocol.version.VersionProvider.class)), ((com.viaversion.viaversion.api.platform.providers.Provider)(new com.moon.aJ(this))));
    return;
}


public static void b(java.lang.String p0) {
com.moon.o_.b = ((java.lang.String)(p0));
    return;
}


public static java.lang.String b() {
return com.moon.o_.b;
}


public void unload() {
return;
}

}
