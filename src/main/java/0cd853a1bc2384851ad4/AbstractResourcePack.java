package net.minecraft.client.resources;


public abstract class AbstractResourcePack implements net.minecraft.client.resources.IResourcePack {

private static org.apache.logging.log4j.Logger a;

public java.io.File b;

public AbstractResourcePack(java.io.File p0) {
super();
    this.b = p0;
}


static {
net.minecraft.client.resources.AbstractResourcePack.a = org.apache.logging.log4j.LogManager.getLogger();
}

private static native <E extends Throwable> net.minecraft.client.resources.data.IMetadataSection __sourceHandlerCall_f4b44d1e96cd7af148ec(net.minecraft.client.resources.data.IMetadataSerializer a0, java.io.InputStream a1, java.lang.String a2) throws E;
private static final class __SourceHandler_f4b44d1e96cd7af148ec {

public static net.minecraft.client.resources.data.IMetadataSection f621(net.minecraft.client.resources.data.IMetadataSerializer p0, java.io.InputStream p1, java.lang.String p2) throws Throwable {
    java.lang.Object life3_1;
    java.lang.Object life4_3;
    java.io.BufferedReader life4_12;
    com.google.gson.JsonObject life3_16;
    life3_1 = null;
    life4_3 = null;
    life4_12 = new java.io.BufferedReader(new java.io.InputStreamReader(p1, __fieldRead621_0()));
    life3_16 = __call621_2(__call621_1(life4_12));
    __call621_3(life4_12);
    return __call621_4(p0, p2, life3_16);
}
public static net.minecraft.client.resources.data.IMetadataSection h621_0(java.lang.RuntimeException p0) throws Throwable {
    java.lang.RuntimeException life1_2;
    life1_2 = p0;
    throw new com.google.gson.JsonParseException(life1_2);
}
public static net.minecraft.client.resources.data.IMetadataSection h621_1(java.lang.Throwable p0, java.io.BufferedReader p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __call3062101_0(p1);
    throw life2_2;
}
private static native java.nio.charset.Charset __fieldRead621_0() throws Throwable;
private static native com.google.gson.JsonElement __call621_1(java.io.BufferedReader a0) throws Throwable;
private static native com.google.gson.JsonObject __call621_2(com.google.gson.JsonElement a0) throws Throwable;
private static native void __call621_3(java.io.BufferedReader a0) throws Throwable;
private static native net.minecraft.client.resources.data.IMetadataSection __call621_4(net.minecraft.client.resources.data.IMetadataSerializer a0, java.lang.String a1, com.google.gson.JsonObject a2) throws Throwable;
private static native void __call3062101_0(java.io.BufferedReader a0) throws Throwable;

}


protected void a__Void(java.lang.String p0) {
((org.apache.logging.log4j.Logger)(net.minecraft.client.resources.AbstractResourcePack.a)).warn(((java.lang.String)("ResourcePack: ignored non-lowercase namespace: {} in {}")), ((java.lang.Object[])(new java.lang.Object[] {p0, this.b})));
    return;
}


public <T extends net.minecraft.client.resources.data.IMetadataSection> T a(net.minecraft.client.resources.data.IMetadataSerializer p0, java.lang.String p1) throws java.io.IOException {
return net.minecraft.client.resources.AbstractResourcePack.a(((net.minecraft.client.resources.data.IMetadataSerializer)(p0)), ((java.io.InputStream)(((net.minecraft.client.resources.AbstractResourcePack)(this)).a(((java.lang.String)("pack.mcmeta"))))), ((java.lang.String)(p1)));
}


static <T extends net.minecraft.client.resources.data.IMetadataSection> T a(net.minecraft.client.resources.data.IMetadataSerializer p0, java.io.InputStream p1, java.lang.String p2) { return ((T)(__sourceHandlerCall_f4b44d1e96cd7af148ec(p0, p1, p2))); }


public java.awt.image.BufferedImage a() throws java.io.IOException {
return moom.ol.a(((java.io.InputStream)(((net.minecraft.client.resources.AbstractResourcePack)(this)).a(((java.lang.String)("pack.png"))))));
}


public java.lang.String a__String() {
return ((java.io.File)(this.b)).getName();
}


protected abstract boolean a__Boolean(java.lang.String p0);

protected static java.lang.String a(java.io.File p0, java.io.File p1) {
return ((java.net.URI)(((java.net.URI)(((java.io.File)(p0)).toURI())).relativize(((java.net.URI)(((java.io.File)(p1)).toURI()))))).getPath();
}


public java.io.InputStream a(moom.DD p0) throws java.io.IOException {
return ((net.minecraft.client.resources.AbstractResourcePack)(this)).a(((java.lang.String)(net.minecraft.client.resources.AbstractResourcePack.a__String(((moom.DD)(p0))))));
}


public boolean a__Boolean(moom.DD p0) {
return (__sourceIntrinsic_booleanComparison((((net.minecraft.client.resources.AbstractResourcePack)(this)).a__Boolean(((java.lang.String)(net.minecraft.client.resources.AbstractResourcePack.a__String(((moom.DD)(p0)))))))) != 0);
}


protected abstract java.io.InputStream a(java.lang.String p0) throws java.io.IOException;

private static java.lang.String a__String(moom.DD p0) {
return java.lang.String.format(((java.lang.String)("%s/%s/%s")), ((java.lang.Object[])(new java.lang.Object[] {"assets", ((moom.DD)(p0)).b(), ((moom.DD)(p0)).a()})));
}


private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
