package com.moon;


public class jH {

private final int a;

private static java.lang.String b;

private static final long c;

public jH() {
super();
    this.a = ((int)(org.lwjgl.opengl.GL15.glGenBuffers()));
    return;
}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(-2846255816261976747L)), ((long)(4181926029783941688L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(48020202742957L)))));
    if ((com.moon.jH.b() != null)) {
        com.moon.jH.b(((java.lang.String)("ySiXoc")));
    }
}


public static void b(java.lang.String p0) {
com.moon.jH.b = ((java.lang.String)(p0));
    return;
}


public static java.lang.String b() {
return com.moon.jH.b;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public int a() {
return this.a;
}


public void a(int p0) {
org.lwjgl.opengl.GL15.glBindBuffer(((int)(p0)), ((int)(this.a)));
    return;
}


public void a(int p0, long p1, int p2) {
org.lwjgl.opengl.GL15.glBufferData(((int)(p0)), ((long)(p1)), ((int)(p2)));
    return;
}


public void a(int p0, long p1, com.moon.iv p2) {
long life5_3;
    java.lang.String life7_13;
    life5_3 = (com.moon.jH.c ^ 139290139458711L);
    java.lang.String spill573_0 = com.moon.jH.b();
    org.lwjgl.opengl.GL15.nglBufferSubData(((int)(p0)), ((long)(p1)), ((long)(((long) ((com.moon.iv)(p2)).c))), ((long)(((com.moon.iv)(p2)).a)));
    life7_13 = spill573_0;
    if ((life7_13 != null)) {
        net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[4])));
    }
    return;
}


public void a__Void() {
org.lwjgl.opengl.GL15.glDeleteBuffers(((int)(this.a)));
    return;
}

}
