package net.minecraft.client.renderer;


public class GLAllocation {

public GLAllocation() {
super();
}


public static synchronized java.nio.ByteBuffer a__ByteBuffer(int p0) {
return ((java.nio.ByteBuffer)(java.nio.ByteBuffer.allocateDirect(((int)(p0))))).order(((java.nio.ByteOrder)(java.nio.ByteOrder.nativeOrder())));
}


public static java.nio.IntBuffer a__IntBuffer(int p0) {
return ((java.nio.ByteBuffer)(net.minecraft.client.renderer.GLAllocation.a__ByteBuffer(((int)((p0 << 2)))))).asIntBuffer();
}


public static java.nio.FloatBuffer a__FloatBuffer(int p0) {
return ((java.nio.ByteBuffer)(net.minecraft.client.renderer.GLAllocation.a__ByteBuffer(((int)((p0 << 2)))))).asFloatBuffer();
}


public static synchronized void a__Void(int p0) {
org.lwjgl.opengl.GL11.glDeleteLists(((int)(p0)), ((int)(1)));
    return;
}


public static synchronized void a(int p0, int p1) {
org.lwjgl.opengl.GL11.glDeleteLists(((int)(p0)), ((int)(p1)));
    return;
}


public static synchronized int a(int p0) {
int life1_2;
    int life2_6;
    java.lang.String life3_8;
    life1_2 = org.lwjgl.opengl.GL11.glGenLists(((int)(p0)));
    if ((life1_2 == 0)) {
        life2_6 = org.lwjgl.opengl.GL11.glGetError();
        life3_8 = "No error code reported";
        if ((life2_6 != 0)) {
        life3_8 = org.lwjgl.util.glu.GLU.gluErrorString(((int)(life2_6)));
    }
        throw new java.lang.IllegalStateException(__sourceIntrinsic_5c51e7cdc795_invokedynamic4810_3(p0, life2_6, life3_8));
    }
    return life1_2;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_5c51e7cdc795_invokedynamic4810_3(int a0, int a1, java.lang.String a2) throws E;
}
