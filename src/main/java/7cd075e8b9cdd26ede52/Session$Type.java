package net.minecraft.util;


public class Session$Type extends sourcebuild.EnumConstructor<net.minecraft.util.Session$Type> {

public static net.minecraft.util.Session$Type LEGACY;

public static net.minecraft.util.Session$Type MOJANG;

private static java.util.Map<java.lang.String, net.minecraft.util.Session$Type> a;

private java.lang.String b;

private static net.minecraft.util.Session$Type[] c;

private Session$Type(java.lang.String p0, int p1, java.lang.String p2) {
super(p0, p1);
    this.b = p2;
}


private static void initialize() {
net.minecraft.util.Session$Type[] life0_19;
    int life1_22;
    int life2_24;
    net.minecraft.util.Session$Type life3_31;
    LEGACY = ((net.minecraft.util.Session$Type)(new net.minecraft.util.Session$Type("LEGACY", 0, "legacy")));
    MOJANG = ((net.minecraft.util.Session$Type)(new net.minecraft.util.Session$Type("MOJANG", 1, "mojang")));
    c = ((net.minecraft.util.Session$Type[])(net.minecraft.util.Session$Type.a()));
    a = ((java.util.Map)(com.google.common.collect.Maps.newHashMap()));
    life0_19 = net.minecraft.util.Session$Type.values();
    life1_22 = (life0_19).length;
    life2_24 = 0;
    loop_region_25: while ((life2_24 < life1_22)) {
        life3_31 = (life0_19)[life2_24];
        ((java.util.Map)(net.minecraft.util.Session$Type.a)).put(((java.lang.Object)(((net.minecraft.util.Session$Type)(life3_31)).b)), ((java.lang.Object)(life3_31)));
        life2_24 += 1;
    }
}


public static net.minecraft.util.Session$Type[] values() {
return ((net.minecraft.util.Session$Type[])(((net.minecraft.util.Session$Type[])(net.minecraft.util.Session$Type.c)).clone()));
}


public static net.minecraft.util.Session$Type valueOf(java.lang.String p0) {
return ((net.minecraft.util.Session$Type)(java.lang.Enum.valueOf(((java.lang.Class)(net.minecraft.util.Session$Type.class)), ((java.lang.String)(p0)))));
}


private static net.minecraft.util.Session$Type[] a() {
return new net.minecraft.util.Session$Type[] {net.minecraft.util.Session$Type.LEGACY, net.minecraft.util.Session$Type.MOJANG};
}


public static net.minecraft.util.Session$Type a(java.lang.String p0) {
return ((net.minecraft.util.Session$Type)(((java.util.Map)(net.minecraft.util.Session$Type.a)).get(((java.lang.Object)(((java.lang.String)(p0)).toLowerCase())))));
}

}
