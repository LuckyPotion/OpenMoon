package net.minecraft.util;


public class Session {

private final java.lang.String a;

private final java.lang.String b;

private final java.lang.String c;

private final net.minecraft.util.Session$Type d;

public Session(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) {
super();
    this.a = p0;
    this.b = p1;
    this.c = p2;
    this.d = net.minecraft.util.Session$Type.a(p3);
}


public java.lang.String b() {
return this.b;
}


public java.lang.String c() {
return this.a;
}


public java.lang.String d() {
return this.c;
}


public net.minecraft.util.Session$Type a__bz() {
return this.d;
}


public com.mojang.authlib.GameProfile a() {
try {
        java.util.UUID local1 = com.mojang.util.UUIDTypeAdapter.fromString(((java.lang.String)(((net.minecraft.util.Session)(this)).b())));
        return new com.mojang.authlib.GameProfile(local1, ((net.minecraft.util.Session)(this)).c());
    } catch (java.lang.IllegalArgumentException caught1) {
        return new com.mojang.authlib.GameProfile(null, ((net.minecraft.util.Session)(this)).c());
    }
}


public java.lang.String a__String() {
return __sourceIntrinsic_64ccfb84e285_originalDynamicSite2056_2(this.c, this.b);
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_64ccfb84e285_originalDynamicSite2056_2(java.lang.String a0, java.lang.String a1) throws E;
}
