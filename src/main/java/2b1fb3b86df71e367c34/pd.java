package moom;


public class pd extends moom.pa<net.minecraft.client.resources.data.LanguageMetadataSection> {

private static final long a;

public pd() {
super();
}


static {
a = (moom._c.a(-6891786409818373123L, 4725229409092753632L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(191639969108708L);
}


private static com.google.gson.JsonParseException a(com.google.gson.JsonParseException p0) {
return p0;
}


public java.lang.String a() {
return "language";
}


public net.minecraft.client.resources.data.LanguageMetadataSection a(com.google.gson.JsonElement p0, java.lang.reflect.Type p1, com.google.gson.JsonDeserializationContext p2) throws com.google.gson.JsonParseException {
int lexicalValue435_58_0;
    int lexicalValue435_76_0;
    int spill435_0;
    boolean spill435_1;
    long life4_3;
    com.google.gson.JsonObject life7_7;
    java.util.HashSet life8_9;
    int life6_10;
    java.util.Iterator life9_14;
    java.util.Map.Entry life10_21;
    java.lang.String life11_25;
    com.google.gson.JsonObject life12_31;
    java.lang.String life13_35;
    java.lang.String life14_39;
    int life15_44;
    lexical_join_85: {
    life4_3 = (moom.pd.a ^ 97012965162948L);
    spill435_0 = moom.pa.b();
    life7_7 = ((com.google.gson.JsonElement)(p0)).getAsJsonObject();
    life8_9 = com.google.common.collect.Sets.newHashSet();
    life6_10 = spill435_0;
    life9_14 = ((java.util.Set)(((com.google.gson.JsonObject)(life7_7)).entrySet())).iterator();
    lexical_cycle_15: while (true) {
    lexical_join_83: {
    lexical_join_76: {
    lexical_join_67: {
    lexical_join_58: {
    lexical_join_56: {
    if (!(((java.util.Iterator)(life9_14)).hasNext())) {
        break lexical_join_85;
    }
    life10_21 = ((java.util.Map.Entry)(((java.util.Iterator)(life9_14)).next()));
    life11_25 = ((java.lang.String)(((java.util.Map.Entry)(life10_21)).getKey()));
    life12_31 = moom.Dg.a__JsonObject(((com.google.gson.JsonElement)(((com.google.gson.JsonElement)(((java.util.Map.Entry)(life10_21)).getValue())))), ((java.lang.String)("language")));
    life13_35 = moom.Dg.a__String(((com.google.gson.JsonObject)(life12_31)), ((java.lang.String)("region")));
    life14_39 = moom.Dg.a__String(((com.google.gson.JsonObject)(life12_31)), ((java.lang.String)("name")));
    life15_44 = ((moom.Dg.a(((com.google.gson.JsonObject)(life12_31)), ((java.lang.String)("bidirectional")), ((boolean)(false)))) ? 1 : 0);
    spill435_1 = ((java.lang.String)(life13_35)).isEmpty();
    if (!((life6_10 == 0))) {
        lexicalValue435_58_0 = ((spill435_1) ? 1 : 0);
        break lexical_join_58;
    }
    if (!(spill435_1)) {
        break lexical_join_56;
    }
    throw new com.google.gson.JsonParseException(__sourceIntrinsic_4776cb2639b8_invokedynamic435_20(life11_25));
    }
    lexicalValue435_58_0 = ((((java.lang.String)(life14_39)).isEmpty()) ? 1 : 0);
    }
    if (!((life6_10 == 0))) {
        lexicalValue435_76_0 = lexicalValue435_58_0;
        break lexical_join_76;
    }
    if (!((lexicalValue435_58_0 != 0))) {
        break lexical_join_67;
    }
    throw new com.google.gson.JsonParseException(__sourceIntrinsic_4776cb2639b8_invokedynamic435_23(life11_25));
    }
    lexicalValue435_76_0 = ((((java.util.Set)(life8_9)).add(((java.lang.Object)(new moom.oU(life11_25, life13_35, life14_39, ((life15_44) != 0)))))) ? 1 : 0);
    }
    if (!((lexicalValue435_76_0 == 0))) {
        break lexical_join_83;
    }
    throw new com.google.gson.JsonParseException(__sourceIntrinsic_4776cb2639b8_invokedynamic435_27(life11_25));
    }
    if (!((life6_10 != 0))) { continue lexical_cycle_15; }
    break lexical_cycle_15;
    }
    }
    return new net.minecraft.client.resources.data.LanguageMetadataSection(life8_9);
}


public net.minecraft.client.resources.data.LanguageMetadataSection deserialize(com.google.gson.JsonElement p0, java.lang.reflect.Type p1, com.google.gson.JsonDeserializationContext p2) throws com.google.gson.JsonParseException {
return this.a(((com.google.gson.JsonElement)(p0)), ((java.lang.reflect.Type)(p1)), ((com.google.gson.JsonDeserializationContext)(p2)));
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_4776cb2639b8_invokedynamic435_20(java.lang.String a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_4776cb2639b8_invokedynamic435_23(java.lang.String a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_4776cb2639b8_invokedynamic435_27(java.lang.String a0) throws E;
}
