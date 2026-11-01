package moom;


public class pf extends moom.pa<net.minecraft.client.resources.data.TextureMetadataSection> {

private static long a;

public pf() {
super();
}


static {
moom.pf.a = (moom._c.a(5734722878571051237L, 2617702495112012888L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(247619450840344L);
}

private static native <E extends Throwable> net.minecraft.client.resources.data.TextureMetadataSection __sourceHandlerCall_41345516d6638fdd20bc(moom.pf a0, com.google.gson.JsonElement a1, java.lang.reflect.Type a2, com.google.gson.JsonDeserializationContext a3) throws E;
private static final class __SourceHandler_41345516d6638fdd20bc {

public static net.minecraft.client.resources.data.TextureMetadataSection f436(moom.pf receiver, com.google.gson.JsonElement p0, java.lang.reflect.Type p1, com.google.gson.JsonDeserializationContext p2) throws Throwable {
    com.google.gson.JsonObject lexicalValue436_29_0;
    java.lang.String lexicalValue436_29_1;
    int lexicalValue436_57_0;
    int spill436_0;
    com.google.gson.JsonObject spill436_1;
    java.lang.String spill436_2;
    boolean spill436_3;
    long life4_3;
    com.google.gson.JsonObject life7_7;
    int life6_8;
    int life8_13;
    int life9_18;
    java.util.ArrayList life10_20;
    com.google.gson.JsonArray life11_33;
    int life12_35;
    com.google.gson.JsonElement life13_43;
    lexical_join_68: {
    lexical_join_29: {
    life4_3 = (__fieldRead436_0() ^ 27039627454912L);
    spill436_0 = __call436_1();
    life7_7 = __call436_2(p0);
    life6_8 = spill436_0;
    life8_13 = __integerCategory436_4(__call436_3(life7_7, "blur", 0));
    life9_18 = __integerCategory436_6(__call436_5(life7_7, "clamp", 0));
    life10_20 = __call436_7();
    spill436_1 = life7_7;
    spill436_2 = "mipmaps";
    if (!((life6_8 == 0))) {
        lexicalValue436_29_0 = spill436_1;
        lexicalValue436_29_1 = spill436_2;
        break lexical_join_29;
    }
    if (!(__call436_8(spill436_1, spill436_2))) {
        break lexical_join_68;
    }
    lexicalValue436_29_0 = life7_7;
    lexicalValue436_29_1 = "mipmaps";
    }
    life11_33 = __call436_9(lexicalValue436_29_0, lexicalValue436_29_1);
    life12_35 = 0;
    lexical_cycle_33: while (true) {
    lexical_join_65: {
    lexical_join_57: {
    lexical_join_55: {
    if (!((life12_35 < __call436_10(life11_33)))) {
        break lexical_join_68;
    }
    life13_43 = __call436_11(life11_33, life12_35);
    if (!((life6_8 == 0))) {
        break lexical_join_68;
    }
    spill436_3 = __call436_12(life13_43);
    if (!((life6_8 == 0))) {
        lexicalValue436_57_0 = __integerCategory436_13(spill436_3);
        break lexical_join_57;
    }
    if (!(spill436_3)) {
        break lexical_join_55;
    }
    __call436_16(life10_20, __call436_15(__call436_14(life13_43)));
    break lexical_join_65;
    }
    lexicalValue436_57_0 = __integerCategory436_18(__call436_17(life13_43));
    }
    if (!((lexicalValue436_57_0 != 0))) {
        break lexical_join_65;
    }
    throw new com.google.gson.JsonParseException(__invokedynamic436_19(life12_35, life13_43));
    }
    life12_35 += 1;
    if (!((life6_8 != 0))) { continue lexical_cycle_33; }
    break lexical_cycle_33;
    }
    }
    return new net.minecraft.client.resources.data.TextureMetadataSection(__integerCategory436_20(life8_13), __integerCategory436_21(life9_18), life10_20);
}
public static net.minecraft.client.resources.data.TextureMetadataSection h436_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call2043600_0(p0);
}
public static net.minecraft.client.resources.data.TextureMetadataSection h436_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call2043601_0(p0);
}
public static net.minecraft.client.resources.data.TextureMetadataSection h436_2(java.lang.NumberFormatException p0) throws Throwable {
    throw __call2043602_0(p0);
}
public static net.minecraft.client.resources.data.TextureMetadataSection h436_3(java.lang.ClassCastException p0) throws Throwable {
    throw __call2043603_0(p0);
}
public static net.minecraft.client.resources.data.TextureMetadataSection h436_4(java.lang.NumberFormatException p0, int p1, com.google.gson.JsonElement p2) throws Throwable {
    java.lang.NumberFormatException local3 = p0;
    throw new com.google.gson.JsonParseException(__invokedynamic2043604_0(p1, p2), local3);
}
public static net.minecraft.client.resources.data.TextureMetadataSection h436_5(java.lang.NumberFormatException p0) throws Throwable {
    throw __call2043605_0(p0);
}
public static net.minecraft.client.resources.data.TextureMetadataSection h436_6(java.lang.ClassCastException p0, com.google.gson.JsonObject p1) throws Throwable {
    java.lang.ClassCastException local2 = p0;
    throw new com.google.gson.JsonParseException(__invokedynamic2043606_1(__call2043606_0(p1, "mipmaps")), local2);
}
private static native long __fieldRead436_0() throws Throwable;
private static native int __call436_1() throws Throwable;
private static native com.google.gson.JsonObject __call436_2(com.google.gson.JsonElement a0) throws Throwable;
private static native boolean __call436_3(com.google.gson.JsonObject a0, java.lang.String a1, int a2) throws Throwable;
private static native int __integerCategory436_4(boolean value) throws Throwable;
private static native boolean __call436_5(com.google.gson.JsonObject a0, java.lang.String a1, int a2) throws Throwable;
private static native int __integerCategory436_6(boolean value) throws Throwable;
private static native java.util.ArrayList __call436_7() throws Throwable;
private static native boolean __call436_8(com.google.gson.JsonObject a0, java.lang.String a1) throws Throwable;
private static native com.google.gson.JsonArray __call436_9(com.google.gson.JsonObject a0, java.lang.String a1) throws Throwable;
private static native int __call436_10(com.google.gson.JsonArray a0) throws Throwable;
private static native com.google.gson.JsonElement __call436_11(com.google.gson.JsonArray a0, int a1) throws Throwable;
private static native boolean __call436_12(com.google.gson.JsonElement a0) throws Throwable;
private static native int __integerCategory436_13(boolean value) throws Throwable;
private static native int __call436_14(com.google.gson.JsonElement a0) throws Throwable;
private static native java.lang.Integer __call436_15(int a0) throws Throwable;
private static native boolean __call436_16(java.util.ArrayList a0, java.lang.Integer a1) throws Throwable;
private static native boolean __call436_17(com.google.gson.JsonElement a0) throws Throwable;
private static native int __integerCategory436_18(boolean value) throws Throwable;
private static native java.lang.String __invokedynamic436_19(int a0, com.google.gson.JsonElement a1) throws Throwable;
private static native boolean __integerCategory436_20(int value) throws Throwable;
private static native boolean __integerCategory436_21(int value) throws Throwable;
private static native java.lang.RuntimeException __call2043600_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.RuntimeException __call2043601_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.RuntimeException __call2043602_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.RuntimeException __call2043603_0(java.lang.ClassCastException a0) throws Throwable;
private static native java.lang.String __invokedynamic2043604_0(int a0, com.google.gson.JsonElement a1) throws Throwable;
private static native java.lang.RuntimeException __call2043605_0(java.lang.NumberFormatException a0) throws Throwable;
private static native com.google.gson.JsonElement __call2043606_0(com.google.gson.JsonObject a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic2043606_1(com.google.gson.JsonElement a0) throws Throwable;

}


private static java.lang.RuntimeException a(java.lang.RuntimeException p0) {
return p0;
}


public java.lang.String a() {
return "texture";
}


public net.minecraft.client.resources.data.TextureMetadataSection a(com.google.gson.JsonElement p0, java.lang.reflect.Type p1, com.google.gson.JsonDeserializationContext p2) throws com.google.gson.JsonParseException { return __sourceHandlerCall_41345516d6638fdd20bc(this, p0, p1, p2); }


public java.lang.Object deserialize__sourceBridge_592e56158a(com.google.gson.JsonElement p0, java.lang.reflect.Type p1, com.google.gson.JsonDeserializationContext p2) throws com.google.gson.JsonParseException {
return ((moom.pf)(this)).a(((com.google.gson.JsonElement)(p0)), ((java.lang.reflect.Type)(p1)), ((com.google.gson.JsonDeserializationContext)(p2)));
}

public net.minecraft.client.resources.data.TextureMetadataSection deserialize(com.google.gson.JsonElement __bridgeParam0, java.lang.reflect.Type __bridgeParam1, com.google.gson.JsonDeserializationContext __bridgeParam2) throws com.google.gson.JsonParseException { return ((net.minecraft.client.resources.data.TextureMetadataSection)(this.deserialize__sourceBridge_592e56158a(((com.google.gson.JsonElement)(__bridgeParam0)), ((java.lang.reflect.Type)(__bridgeParam1)), ((com.google.gson.JsonDeserializationContext)(__bridgeParam2))))); }
}
