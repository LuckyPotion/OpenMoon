package moom;


class h<T> extends com.google.gson.TypeAdapter<T> {

java.util.Map a;

moom.C1 b;

private static long c;

h(moom.C1 p0, java.util.Map p1) { super(); }


private static void __sourceConstructorBody_472e1a15b256e1b8(moom.h receiver, moom.C1 p0, java.util.Map p1) throws Throwable {

((moom.h)(receiver)).b = ((moom.C1)(p0));

    ((moom.h)(receiver)).a = ((java.util.Map)(p1));

    moom.h.__sourceConstructorInit_472e1a15b256e1b8_0(((moom.h)(receiver)));

    return;

}



static {
moom.h.c = (moom._c.a(3325109018586198260L, -6573175813269579580L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(14711146367520L);
}

private static native <E extends Throwable> void __sourceConstructorInit_472e1a15b256e1b8_0(moom.h a0) throws E;

private static java.io.IOException a(java.io.IOException p0) {
return p0;
}


public void write(com.google.gson.stream.JsonWriter p0, T p1) throws java.io.IOException {
long life3_3;
    int life5_5;
    forward_join_22: {
    forward_join_15: {
    forward_join_13: {
    life3_3 = (moom.h.c ^ 30298305326843L);
    life5_5 = ((moom.DS.c__Boolean()) ? 1 : 0);
    if (!((life5_5 != 0))) { break forward_join_13; }
    if (!((p1 == null))) { break forward_join_15; }
    ((com.google.gson.stream.JsonWriter)(p0)).nullValue();
    }
    if (!((life5_5 == 0))) { break forward_join_22; }
    }
    __sourceExactCall_1c7c24e80c5459(((com.google.gson.stream.JsonWriter)(p0)), ((java.lang.String)(__sourceExactCall_640eac1f22ce05(((moom.C1)(this.b)), ((java.lang.Object)(p1))))));
    }
    return;
}


public T read(com.google.gson.stream.JsonReader p0) throws java.io.IOException {
java.lang.Object forwardValue3574_21_0;
    com.google.gson.stream.JsonToken spill3574_0;
    long life2_3;
    int life4_5;
    forward_join_21: {
    forward_join_16: {
    life2_3 = (moom.h.c ^ 57518285217093L);
    life4_5 = ((moom.DS.b__Boolean()) ? 1 : 0);
    spill3574_0 = ((com.google.gson.stream.JsonReader)(p0)).peek();
    if (!((life4_5 == 0))) {
        forwardValue3574_21_0 = spill3574_0;
        break forward_join_21;
    }
    if (!((spill3574_0 == com.google.gson.stream.JsonToken.NULL))) {
        break forward_join_16;
    }
    ((com.google.gson.stream.JsonReader)(p0)).nextNull();
    return null;
    }
    forwardValue3574_21_0 = ((java.util.Map)(this.a)).get(((java.lang.Object)(((com.google.gson.stream.JsonReader)(p0)).nextString())));
    }
    return ((T)(forwardValue3574_21_0));
}


private static native com.google.gson.stream.JsonWriter __sourceExactCall_1c7c24e80c5459(com.google.gson.stream.JsonWriter p0, java.lang.String p1);
private static native java.lang.String __sourceExactCall_640eac1f22ce05(moom.C1 p0, java.lang.Object p1);
}
