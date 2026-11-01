package moom;


public class oZ extends moom.oY {

private static org.apache.logging.log4j.Logger g;

private net.minecraft.client.resources.IResourcePack h;

private moom.DD i;

private static long k;

public oZ(net.minecraft.client.gui.GuiScreenResourcePacks p0) { super((net.minecraft.client.gui.GuiScreenResourcePacks)null); __sourceHandlerCall_4a708b738b4083cdfecd(this, p0); }


static {
moom.oZ.k = (moom._c.a(-7274929631905250199L, 8085850759799180456L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(268328094971438L);
    moom.oZ.g = org.apache.logging.log4j.LogManager.getLogger();
}

private static native <E extends Throwable> void __sourceHandlerCall_4a708b738b4083cdfecd(moom.oZ a0, net.minecraft.client.gui.GuiScreenResourcePacks a1) throws E;
private static final class __SourceHandler_4a708b738b4083cdfecd {

public static void f489(moom.oZ receiver, net.minecraft.client.gui.GuiScreenResourcePacks p0) throws Throwable {
    moom.n3 life2_15;
    __directSuperInit489_0(receiver, p0);
    __fieldWrite489_4(receiver, __fieldRead489_3(__call489_2(__fieldRead489_1(receiver))));
    life2_15 = new moom.n3(__call489_6(__fieldRead489_5(receiver)));
    __fieldWrite489_10(receiver, __call489_9(__call489_8(__fieldRead489_7(receiver)), "texturepackicon", life2_15));
    return;
}
public static void h489_0(java.lang.Exception p0, moom.oZ p1, moom.n3 p2) throws Throwable {
    java.lang.Exception life3_2;
    moom.n3 life2_4;
    life3_2 = p0;
    life2_4 = __fieldRead3048900_0();
    __fieldWrite3048900_4(p1, __call3048900_3(__call3048900_2(__fieldRead3048900_1(p1)), "texturepackicon", life2_4));
    return;
}
private static native void __directSuperInit489_0(moom.oZ a0, net.minecraft.client.gui.GuiScreenResourcePacks a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead489_1(moom.oZ a0) throws Throwable;
private static native net.minecraft.client.resources.ResourcePackRepository __call489_2(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.resources.IResourcePack __fieldRead489_3(net.minecraft.client.resources.ResourcePackRepository a0) throws Throwable;
private static native void __fieldWrite489_4(moom.oZ a0, net.minecraft.client.resources.IResourcePack a1) throws Throwable;
private static native net.minecraft.client.resources.IResourcePack __fieldRead489_5(moom.oZ a0) throws Throwable;
private static native java.awt.image.BufferedImage __call489_6(net.minecraft.client.resources.IResourcePack a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead489_7(moom.oZ a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureManager __call489_8(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.DD __call489_9(net.minecraft.client.renderer.texture.TextureManager a0, java.lang.String a1, moom.n3 a2) throws Throwable;
private static native void __fieldWrite489_10(moom.oZ a0, moom.DD a1) throws Throwable;
private static native moom.n3 __fieldRead3048900_0() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead3048900_1(moom.oZ a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureManager __call3048900_2(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.DD __call3048900_3(net.minecraft.client.renderer.texture.TextureManager a0, java.lang.String a1, moom.n3 a2) throws Throwable;
private static native void __fieldWrite3048900_4(moom.oZ a0, moom.DD a1) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_307a8700fede94e9a2bb(moom.oZ a0) throws E;
private static final class __SourceHandler_307a8700fede94e9a2bb {

public static java.lang.String f474(moom.oZ receiver) throws Throwable {
    net.minecraft.client.resources.data.PackMetadataSection forestValue474_21_0;
    net.minecraft.client.resources.data.PackMetadataSection spill474_0;
    long life1_3;
    java.lang.String[] life3_5;
    net.minecraft.client.resources.data.PackMetadataSection life4_15;
    forest_join_24: {
    forest_join_21: {
    life1_3 = (__fieldRead474_0() ^ 79105552284162L);
    life3_5 = __call474_1();
    life4_15 = __cast474_7(__call474_6(__fieldRead474_2(receiver), __fieldRead474_5(__call474_4(__fieldRead474_3(receiver))), "pack"));
    spill474_0 = life4_15;
    if (!((life3_5 != null))) {
        forestValue474_21_0 = spill474_0;
        break forest_join_21;
    }
    if (!((spill474_0 != null))) {
        break forest_join_24;
    }
    forestValue474_21_0 = life4_15;
    }
    return __call474_9(__call474_8(forestValue474_21_0));
    }
    return __invokedynamic474_11(__fieldRead474_10());
}
public static java.lang.String h474_0(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call3047400_0(p0);
}
public static java.lang.String h474_1(java.lang.Exception p0, net.minecraft.client.resources.data.PackMetadataSection p1) throws Throwable {
    java.lang.Exception life1_2;
    life1_2 = p0;
    __call3047401_1(__fieldRead3047401_0(), "Couldn't load metadata info", life1_2);
    return __invokedynamic3047401_3(__fieldRead3047401_2());
}
private static native long __fieldRead474_0() throws Throwable;
private static native java.lang.String[] __call474_1() throws Throwable;
private static native net.minecraft.client.resources.IResourcePack __fieldRead474_2(moom.oZ a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead474_3(moom.oZ a0) throws Throwable;
private static native net.minecraft.client.resources.ResourcePackRepository __call474_4(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.resources.data.IMetadataSerializer __fieldRead474_5(net.minecraft.client.resources.ResourcePackRepository a0) throws Throwable;
private static native net.minecraft.client.resources.data.IMetadataSection __call474_6(net.minecraft.client.resources.IResourcePack a0, net.minecraft.client.resources.data.IMetadataSerializer a1, java.lang.String a2) throws Throwable;
private static native net.minecraft.client.resources.data.PackMetadataSection __cast474_7(net.minecraft.client.resources.data.IMetadataSection a0) throws Throwable;
private static native net.minecraft.util.IChatComponent __call474_8(net.minecraft.client.resources.data.PackMetadataSection a0) throws Throwable;
private static native java.lang.String __call474_9(net.minecraft.util.IChatComponent a0) throws Throwable;
private static native net.minecraft.util.EnumChatFormatting __fieldRead474_10() throws Throwable;
private static native java.lang.String __invokedynamic474_11(net.minecraft.util.EnumChatFormatting a0) throws Throwable;
private static native com.google.gson.JsonParseException __call3047400_0(com.google.gson.JsonParseException a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead3047401_0() throws Throwable;
private static native void __call3047401_1(org.apache.logging.log4j.Logger a0, java.lang.String a1, java.lang.Exception a2) throws Throwable;
private static native net.minecraft.util.EnumChatFormatting __fieldRead3047401_2() throws Throwable;
private static native java.lang.String __invokedynamic3047401_3(net.minecraft.util.EnumChatFormatting a0) throws Throwable;

}


protected boolean b__Boolean() {
return ((0) != 0);
}


protected java.lang.String b() {
return "Default";
}


protected boolean e() {
return ((0) != 0);
}


protected boolean c() {
return ((0) != 0);
}


protected boolean d() {
return ((0) != 0);
}


protected int a() {
return 1;
}


protected boolean a__Boolean() {
return ((0) != 0);
}


private static com.google.gson.JsonParseException a(com.google.gson.JsonParseException p0) {
return p0;
}


protected void a__Void() {
((net.minecraft.client.renderer.texture.TextureManager)(((net.minecraft.client.Minecraft)(this.e)).a__ok())).a__Void(((moom.DD)(this.i)));
    return;
}


protected java.lang.String a__String() { return __sourceHandlerCall_307a8700fede94e9a2bb(this); }

}
