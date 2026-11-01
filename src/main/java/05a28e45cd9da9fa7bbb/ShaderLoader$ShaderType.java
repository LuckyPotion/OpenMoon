package net.minecraft.client.shader;


public class ShaderLoader$ShaderType extends sourcebuild.EnumConstructor<net.minecraft.client.shader.ShaderLoader$ShaderType> {

public static net.minecraft.client.shader.ShaderLoader$ShaderType VERTEX;

public static net.minecraft.client.shader.ShaderLoader$ShaderType FRAGMENT;

private java.lang.String a;

private java.lang.String b;

private int c;

private java.util.Map<java.lang.String, moom.pE> d;

private static net.minecraft.client.shader.ShaderLoader$ShaderType[] e;

private ShaderLoader$ShaderType(java.lang.String p0, int p1, java.lang.String p2, java.lang.String p3, int p4) {
super(p0, p1);

    this.d = com.google.common.collect.Maps.newHashMap();
    this.a = p2;
    this.b = p3;
    this.c = p4;
}


private static void initialize() {
VERTEX = ((net.minecraft.client.shader.ShaderLoader$ShaderType)(new net.minecraft.client.shader.ShaderLoader$ShaderType("VERTEX", 0, "vertex", ".vsh", net.minecraft.client.renderer.OpenGlHelper.o)));
    FRAGMENT = ((net.minecraft.client.shader.ShaderLoader$ShaderType)(new net.minecraft.client.shader.ShaderLoader$ShaderType("FRAGMENT", 1, "fragment", ".fsh", net.minecraft.client.renderer.OpenGlHelper.p)));
    e = ((net.minecraft.client.shader.ShaderLoader$ShaderType[])(net.minecraft.client.shader.ShaderLoader$ShaderType.a__ArrayaN()));
}


public static net.minecraft.client.shader.ShaderLoader$ShaderType[] values() {
return ((net.minecraft.client.shader.ShaderLoader$ShaderType[])(((net.minecraft.client.shader.ShaderLoader$ShaderType[])(net.minecraft.client.shader.ShaderLoader$ShaderType.e)).clone()));
}


public static net.minecraft.client.shader.ShaderLoader$ShaderType valueOf(java.lang.String p0) {
return ((net.minecraft.client.shader.ShaderLoader$ShaderType)(java.lang.Enum.valueOf(((java.lang.Class)(net.minecraft.client.shader.ShaderLoader$ShaderType.class)), ((java.lang.String)(p0)))));
}


private java.lang.String b() {
return this.b;
}


private static net.minecraft.client.shader.ShaderLoader$ShaderType[] a__ArrayaN() {
return new net.minecraft.client.shader.ShaderLoader$ShaderType[] {net.minecraft.client.shader.ShaderLoader$ShaderType.VERTEX, net.minecraft.client.shader.ShaderLoader$ShaderType.FRAGMENT};
}


public java.lang.String a__String() {
return this.a;
}


private java.util.Map<java.lang.String, moom.pE> a__Map() {
return this.d;
}


private int a() {
return this.c;
}

}
