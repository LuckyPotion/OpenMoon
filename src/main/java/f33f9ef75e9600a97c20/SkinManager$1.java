package net.minecraft.client.resources;


class SkinManager$1 extends com.google.common.cache.CacheLoader<com.mojang.authlib.GameProfile, java.util.Map<com.mojang.authlib.minecraft.MinecraftProfileTexture.Type, com.mojang.authlib.minecraft.MinecraftProfileTexture>> {

moom.o6 a;

SkinManager$1(moom.o6 p0) { super(); }

private static void __sourceConstructorBody_c9432fff8c6039a4(net.minecraft.client.resources.SkinManager$1 receiver, moom.o6 p0) throws Throwable {
((net.minecraft.client.resources.SkinManager$1)(receiver)).a = ((moom.o6)(p0));
    net.minecraft.client.resources.SkinManager$1.__sourceConstructorInit_c9432fff8c6039a4_0(((net.minecraft.client.resources.SkinManager$1)(receiver)));
    return;
}

private static native <E extends Throwable> void __sourceConstructorInit_c9432fff8c6039a4_0(net.minecraft.client.resources.SkinManager$1 a0) throws E;

public java.lang.Object load__sourceBridge_262c527aaf(java.lang.Object p0) throws java.lang.Exception {
return ((net.minecraft.client.resources.SkinManager$1)(this)).a(((com.mojang.authlib.GameProfile)(((com.mojang.authlib.GameProfile)(p0)))));
}


public java.util.Map<com.mojang.authlib.minecraft.MinecraftProfileTexture.Type, com.mojang.authlib.minecraft.MinecraftProfileTexture> a(com.mojang.authlib.GameProfile p0) throws java.lang.Exception {
return ((com.mojang.authlib.minecraft.MinecraftSessionService)(((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).a__MinecraftSessionService())).getTextures(((com.mojang.authlib.GameProfile)(p0)), ((boolean)(false)));
}


public java.util.Map<com.mojang.authlib.minecraft.MinecraftProfileTexture.Type, com.mojang.authlib.minecraft.MinecraftProfileTexture> load(com.mojang.authlib.GameProfile __bridgeParam0) { return ((java.util.Map<com.mojang.authlib.minecraft.MinecraftProfileTexture.Type, com.mojang.authlib.minecraft.MinecraftProfileTexture>)(this.load__sourceBridge_262c527aaf(((java.lang.Object)(__bridgeParam0))))); }
}
