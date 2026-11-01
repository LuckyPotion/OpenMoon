package com.moon;


public class jG {

private final int a;

public jG() {
super();
    this.a = ((int)(org.lwjgl.opengl.GL30.glGenVertexArrays()));
    return;
}


public void b() {
org.lwjgl.opengl.GL30.glDeleteVertexArrays(((int)(this.a)));
    return;
}


public void a() {
org.lwjgl.opengl.GL30.glBindVertexArray(((int)(this.a)));
    return;
}

}
