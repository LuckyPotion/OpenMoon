package com.moon;


public abstract class ol<T> {

private final com.moon.od a;

private final byte b;

private static int[] c;

public ol(com.moon.od p0, byte p1) {
super();
    this.a = p0;
    this.b = p1;
}


static {
if ((com.moon.ol.b() == null)) {
        com.moon.ol.b(((int[])(new int[3])));
    }
}


public static int[] b() {
return com.moon.ol.c;
}


public static void b(int[] p0) {
c = ((int[])(p0));
    return;
}


public abstract void a(java.nio.ByteBuffer p0);

public com.moon.od a__od() {
return this.a;
}


public T a(java.nio.ByteBuffer p0, com.google.protobuf.GeneratedMessageV3 p1) {
try {
        return ((T)(((com.google.protobuf.Parser)(((com.google.protobuf.GeneratedMessageV3)(p1)).getParserForType())).parseFrom(((java.nio.ByteBuffer)(p0)))));
    } catch (com.google.protobuf.InvalidProtocolBufferException caught3) {
        ((com.google.protobuf.InvalidProtocolBufferException)(caught3)).printStackTrace();
        return null;
    }
}


public byte a() {
return this.b;
}

}
