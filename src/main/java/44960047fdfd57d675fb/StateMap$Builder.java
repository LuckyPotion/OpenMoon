package net.minecraft.client.renderer.block.statemap;


public class StateMap$Builder {

private net.minecraft.block.properties.IProperty<?> a;

private java.lang.String b;

private final java.util.List<net.minecraft.block.properties.IProperty<?>> c;

public StateMap$Builder() {
super();
    this.c = com.google.common.collect.Lists.newArrayList();
}


public moom.mg a() {
return new moom.mg(this.a, this.b, this.c);
}


public net.minecraft.client.renderer.block.statemap.StateMap$Builder a(net.minecraft.block.properties.IProperty<?>[] p0) {
java.util.Collections.addAll(((java.util.Collection)(this.c)), ((java.lang.Object[])(p0)));
    return this;
}


public net.minecraft.client.renderer.block.statemap.StateMap$Builder a(java.lang.String p0) {
this.b = ((java.lang.String)(p0));
    return this;
}


public net.minecraft.client.renderer.block.statemap.StateMap$Builder a(net.minecraft.block.properties.IProperty<?> p0) {
this.a = ((net.minecraft.block.properties.IProperty)(p0));
    return this;
}

}
