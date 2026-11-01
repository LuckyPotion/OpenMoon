package net.minecraft.network;


public class ServerStatusResponse$PlayerCountData {

private final int a;

private final int b;

private com.mojang.authlib.GameProfile[] c;

public ServerStatusResponse$PlayerCountData(int p0, int p1) {
super();
    this.a = p0;
    this.b = p1;
}


public int b() {
return this.b;
}


public int a() {
return this.a;
}


public com.mojang.authlib.GameProfile[] a__ArrayGameProfile() {
return this.c;
}


public void a(com.mojang.authlib.GameProfile[] p0) {
this.c = ((com.mojang.authlib.GameProfile[])(p0));
    return;
}

}
