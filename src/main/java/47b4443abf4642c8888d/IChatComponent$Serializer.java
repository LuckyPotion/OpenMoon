package net.minecraft.util;


public class IChatComponent$Serializer implements com.google.gson.JsonDeserializer<net.minecraft.util.IChatComponent>, com.google.gson.JsonSerializer<net.minecraft.util.IChatComponent> {

private static final com.google.gson.Gson a;

private static final long b;

public IChatComponent$Serializer() {
super();
}


static {
b = ((long)(((moom._a)(moom._c.a(((long)(-7890945010937507675L)), ((long)(509507321495543289L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(192247349079097L)))));
    com.google.gson.GsonBuilder local0 = new com.google.gson.GsonBuilder();
    ((com.google.gson.GsonBuilder)(local0)).registerTypeHierarchyAdapter(((java.lang.Class)(net.minecraft.util.IChatComponent.class)), ((java.lang.Object)(new net.minecraft.util.IChatComponent$Serializer())));
    ((com.google.gson.GsonBuilder)(local0)).registerTypeHierarchyAdapter(((java.lang.Class)(moom.CO.class)), ((java.lang.Object)(new moom.CQ())));
    ((com.google.gson.GsonBuilder)(local0)).registerTypeAdapterFactory(((com.google.gson.TypeAdapterFactory)(new moom.C1())));
    a = ((com.google.gson.Gson)(((com.google.gson.GsonBuilder)(local0)).create()));
}


private static com.google.gson.JsonParseException a(com.google.gson.JsonParseException p0) {
return p0;
}


public static net.minecraft.util.IChatComponent a(java.lang.String p0) {
return ((net.minecraft.util.IChatComponent)(((com.google.gson.Gson)(net.minecraft.util.IChatComponent$Serializer.a)).fromJson(((java.lang.String)(p0)), ((java.lang.Class)(net.minecraft.util.IChatComponent.class)))));
}


public static java.lang.String a(net.minecraft.util.IChatComponent p0) {
return ((com.google.gson.Gson)(net.minecraft.util.IChatComponent$Serializer.a)).toJson(((java.lang.Object)(p0)));
}


private void a(moom.CO p0, com.google.gson.JsonObject p1, com.google.gson.JsonSerializationContext p2) {
com.google.gson.JsonElement lexicalValue1710_16_0;
    boolean spill1710_0;
    com.google.gson.JsonElement spill1710_1;
    long life4_3;
    com.google.gson.JsonElement life7_8;
    int life6_9;
    com.google.gson.JsonObject life8_23;
    java.util.Iterator life9_27;
    java.util.Map.Entry life10_34;
    lexical_join_39: {
    lexical_join_16: {
    life4_3 = (net.minecraft.util.IChatComponent$Serializer.b ^ 98140835448285L);
    spill1710_0 = moom.DS.b__Boolean();
    life7_8 = ((com.google.gson.JsonSerializationContext)(p2)).serialize(((java.lang.Object)(p0)));
    life6_9 = ((spill1710_0) ? 1 : 0);
    spill1710_1 = life7_8;
    if (!((life6_9 == 0))) {
        lexicalValue1710_16_0 = spill1710_1;
        break lexical_join_16;
    }
    if (!(((com.google.gson.JsonElement)(spill1710_1)).isJsonObject())) {
        break lexical_join_39;
    }
    lexicalValue1710_16_0 = life7_8;
    }
    life8_23 = ((com.google.gson.JsonObject)(lexicalValue1710_16_0));
    life9_27 = ((java.util.Set)(((com.google.gson.JsonObject)(life8_23)).entrySet())).iterator();
    lexical_cycle_22: while (true) {
    if (!(((java.util.Iterator)(life9_27)).hasNext())) {
        break lexical_join_39;
    }
    life10_34 = ((java.util.Map.Entry)(((java.util.Iterator)(life9_27)).next()));
    ((com.google.gson.JsonObject)(p1)).add(((java.lang.String)(((java.lang.String)(((java.util.Map.Entry)(life10_34)).getKey())))), ((com.google.gson.JsonElement)(((com.google.gson.JsonElement)(((java.util.Map.Entry)(life10_34)).getValue())))));
    if (!((life6_9 != 0))) { continue lexical_cycle_22; }
    break lexical_cycle_22;
    }
    }
    return;
}


public net.minecraft.util.IChatComponent a(com.google.gson.JsonElement p0, java.lang.reflect.Type p1, com.google.gson.JsonDeserializationContext p2) throws com.google.gson.JsonParseException {
int forestValue29_21_0;
    com.google.gson.JsonElement forestValue29_28_0;
    net.minecraft.util.IChatComponent forestValue29_62_0;
    net.minecraft.util.IChatComponent forestValue29_66_0;
    com.google.gson.JsonElement forestValue29_74_0;
    int forestValue29_95_0;
    com.google.gson.JsonObject forestValue29_111_0;
    java.lang.String forestValue29_111_1;
    int forestValue29_183_0;
    int forestValue29_199_0;
    int forestValue29_230_0;
    com.google.gson.JsonObject forestValue29_252_0;
    java.lang.String forestValue29_252_1;
    int forestValue29_265_0;
    boolean spill29_0;
    com.google.gson.JsonElement spill29_1;
    com.google.gson.JsonElement spill29_2;
    net.minecraft.util.IChatComponent spill29_3;
    boolean spill29_4;
    com.google.gson.JsonObject spill29_5;
    java.lang.String spill29_6;
    boolean spill29_7;
    com.google.gson.JsonObject spill29_8;
    java.lang.String spill29_9;
    int spill29_10;
    long life4_3;
    int life6_5;
    com.google.gson.JsonArray life7_40;
    net.minecraft.util.IChatComponent life8_42;
    java.util.Iterator life9_45;
    com.google.gson.JsonElement life10_54;
    net.minecraft.util.IChatComponent life11_61;
    com.google.gson.JsonObject life7_99;
    moom.CJ life8_116;
    java.lang.String life9_134;
    com.google.gson.JsonArray life10_148;
    java.lang.Object[] life11_152;
    int life12_154;
    java.lang.Object life14_174;
    moom.CM life13_185;
    com.google.gson.JsonObject life9_245;
    com.google.gson.JsonArray life9_324;
    int life10_340;
    forest_join_293: {
    forest_join_285: {
    forest_join_265: {
    forest_join_264: {
    forest_join_252: {
    forest_join_244: {
    forest_join_237: {
    forest_join_230: {
    forest_join_227: {
    forest_join_225: {
    forest_join_205: {
    forest_join_200: {
    forest_join_199: {
    forest_join_183: {
    forest_join_180: {
    forest_join_178: {
    forest_join_171: {
    forest_join_163: {
    forest_join_111: {
    forest_join_95: {
    forest_join_92: {
    forest_join_74: {
    forest_join_73: {
    forest_join_67: {
    forest_join_66: {
    forest_join_65: {
    forest_join_28: {
    forest_join_21: {
    forest_join_17: {
    life4_3 = (net.minecraft.util.IChatComponent$Serializer.b ^ 57933027586696L);
    life6_5 = ((moom.DS.c__Boolean()) ? 1 : 0);
    spill29_0 = ((com.google.gson.JsonElement)(p0)).isJsonPrimitive();
    if (!((life6_5 != 0))) {
        forestValue29_21_0 = ((spill29_0) ? 1 : 0);
        break forest_join_21;
    }
    if (!(spill29_0)) {
        break forest_join_17;
    }
    return new moom.CM(((com.google.gson.JsonElement)(p0)).getAsString());
    }
    spill29_1 = p0;
    if (!((life6_5 != 0))) {
        forestValue29_74_0 = spill29_1;
        break forest_join_74;
    }
    forestValue29_21_0 = ((((com.google.gson.JsonElement)(spill29_1)).isJsonObject()) ? 1 : 0);
    }
    if (!((forestValue29_21_0 == 0))) {
        break forest_join_73;
    }
    spill29_2 = p0;
    if (!((life6_5 != 0))) {
        forestValue29_28_0 = spill29_2;
        break forest_join_28;
    }
    if (!(((com.google.gson.JsonElement)(spill29_2)).isJsonArray())) {
        break forest_join_67;
    }
    forestValue29_28_0 = p0;
    }
    life7_40 = ((com.google.gson.JsonElement)(forestValue29_28_0)).getAsJsonArray();
    life8_42 = null;
    life9_45 = ((com.google.gson.JsonArray)(life7_40)).iterator();
    forest_cycle_35: while (true) {
    forest_join_63: {
    forest_join_62: {
    forest_join_59: {
    if (!(((java.util.Iterator)(life9_45)).hasNext())) {
        break forest_join_65;
    }
    life10_54 = ((com.google.gson.JsonElement)(((java.util.Iterator)(life9_45)).next()));
    life11_61 = ((net.minecraft.util.IChatComponent$Serializer)(this)).a(((com.google.gson.JsonElement)(life10_54)), ((java.lang.reflect.Type)(((java.lang.Object)(life10_54)).getClass())), ((com.google.gson.JsonDeserializationContext)(p2)));
    spill29_3 = life8_42;
    if (!((life6_5 != 0))) {
        forestValue29_66_0 = spill29_3;
        break forest_join_66;
    }
    if (!((life6_5 != 0))) {
        forestValue29_62_0 = spill29_3;
        break forest_join_62;
    }
    if (!((spill29_3 == null))) {
        break forest_join_59;
    }
    life8_42 = life11_61;
    if (!((life6_5 == 0))) {
        break forest_join_63;
    }
    }
    forestValue29_62_0 = ((net.minecraft.util.IChatComponent)(life8_42)).a(((net.minecraft.util.IChatComponent)(life11_61)));
    }
    recovery.source.CarrierOps.discard(forestValue29_62_0);
    }
    if (!((life6_5 == 0))) {
        continue forest_cycle_35;
    }
    break forest_cycle_35;
    }
    }
    forestValue29_66_0 = life8_42;
    }
    return forestValue29_66_0;
    }
    throw new com.google.gson.JsonParseException(__sourceIntrinsic_11ddcea8addd_invokedynamic29_18(p0));
    }
    forestValue29_74_0 = p0;
    }
    life7_99 = ((com.google.gson.JsonElement)(forestValue29_74_0)).getAsJsonObject();
    spill29_4 = ((com.google.gson.JsonObject)(life7_99)).has(((java.lang.String)("text")));
    if (!((life6_5 != 0))) {
        forestValue29_95_0 = ((spill29_4) ? 1 : 0);
        break forest_join_95;
    }
    if (!(spill29_4)) {
        break forest_join_92;
    }
    life8_116 = new moom.CM(((com.google.gson.JsonElement)(((com.google.gson.JsonObject)(life7_99)).get(((java.lang.String)("text"))))).getAsString());
    if (!((life6_5 == 0))) {
        break forest_join_244;
    }
    }
    forestValue29_95_0 = ((((com.google.gson.JsonObject)(life7_99)).has(((java.lang.String)("translate")))) ? 1 : 0);
    }
    if (!((life6_5 != 0))) {
        forestValue29_183_0 = forestValue29_95_0;
        break forest_join_183;
    }
    if (!((forestValue29_95_0 != 0))) {
        break forest_join_180;
    }
    life9_134 = ((com.google.gson.JsonElement)(((com.google.gson.JsonObject)(life7_99)).get(((java.lang.String)("translate"))))).getAsString();
    spill29_5 = life7_99;
    spill29_6 = "with";
    if (!((life6_5 != 0))) {
        forestValue29_111_0 = spill29_5;
        forestValue29_111_1 = spill29_6;
        break forest_join_111;
    }
    if (!(((com.google.gson.JsonObject)(spill29_5)).has(((java.lang.String)(spill29_6))))) {
        break forest_join_171;
    }
    forestValue29_111_0 = life7_99;
    forestValue29_111_1 = "with";
    }
    life10_148 = ((com.google.gson.JsonObject)(forestValue29_111_0)).getAsJsonArray(((java.lang.String)(forestValue29_111_1)));
    life11_152 = new java.lang.Object[((com.google.gson.JsonArray)(life10_148)).size()];
    life12_154 = 0;
    forest_cycle_119: while (true) {
    forest_join_161: {
    forest_join_160: {
    if (!((life12_154 < (life11_152).length))) {
        break forest_join_163;
    }
    (life11_152)[life12_154] = ((net.minecraft.util.IChatComponent$Serializer)(this)).a(((com.google.gson.JsonElement)(((com.google.gson.JsonArray)(life10_148)).get(((int)(life12_154))))), ((java.lang.reflect.Type)(p1)), ((com.google.gson.JsonDeserializationContext)(p2)));
    life14_174 = (life11_152)[life12_154];
    if (!((life6_5 != 0))) {
        break forest_join_161;
    }
    if (!((((life14_174 instanceof moom.CM) ? 1 : 0) != 0))) {
        break forest_join_160;
    }
    life13_185 = ((moom.CM)(life14_174));
    if (!((life6_5 != 0))) {
        break forest_join_161;
    }
    if (!(((moom.CO)(((moom.CM)(life13_185)).a__CO())).f())) {
        break forest_join_160;
    }
    if (!(((java.util.List)(((moom.CM)(life13_185)).a__List())).isEmpty())) {
        break forest_join_160;
    }
    (life11_152)[life12_154] = ((moom.CM)(life13_185)).d();
    }
    life12_154 += 1;
    }
    if (!((life6_5 == 0))) {
        continue forest_cycle_119;
    }
    break forest_cycle_119;
    }
    }
    life8_116 = new moom.CN(life9_134, life11_152);
    if (!((life6_5 == 0))) {
        break forest_join_178;
    }
    }
    life8_116 = new moom.CN(life9_134, new java.lang.Object[0]);
    }
    if (!((life6_5 == 0))) {
        break forest_join_244;
    }
    }
    forestValue29_183_0 = ((((com.google.gson.JsonObject)(life7_99)).has(((java.lang.String)("score")))) ? 1 : 0);
    }
    if (!((life6_5 != 0))) {
        forestValue29_230_0 = forestValue29_183_0;
        break forest_join_230;
    }
    if (!((forestValue29_183_0 != 0))) {
        break forest_join_227;
    }
    life9_245 = ((com.google.gson.JsonObject)(life7_99)).getAsJsonObject(((java.lang.String)("score")));
    spill29_7 = ((com.google.gson.JsonObject)(life9_245)).has(((java.lang.String)("name")));
    if (!((life6_5 != 0))) {
        forestValue29_199_0 = ((spill29_7) ? 1 : 0);
        break forest_join_199;
    }
    if (!(spill29_7)) {
        break forest_join_200;
    }
    forestValue29_199_0 = ((((com.google.gson.JsonObject)(life9_245)).has(((java.lang.String)("objective")))) ? 1 : 0);
    }
    if (!((forestValue29_199_0 == 0))) {
        break forest_join_205;
    }
    }
    throw new com.google.gson.JsonParseException("A score component needs a least a name and an objective");
    }
    life8_116 = new moom.CK(moom.Dg.a__String(((com.google.gson.JsonObject)(life9_245)), ((java.lang.String)("name"))), moom.Dg.a__String(((com.google.gson.JsonObject)(life9_245)), ((java.lang.String)("objective"))));
    if (!(((com.google.gson.JsonObject)(life9_245)).has(((java.lang.String)("value"))))) {
        break forest_join_225;
    }
    ((moom.CK)(((moom.CK)(life8_116)))).a__sourceReturn_a7421bf54c(((java.lang.String)(moom.Dg.a__String(((com.google.gson.JsonObject)(life9_245)), ((java.lang.String)("value"))))));
    }
    if (!((life6_5 == 0))) {
        break forest_join_244;
    }
    }
    forestValue29_230_0 = ((((com.google.gson.JsonObject)(life7_99)).has(((java.lang.String)("selector")))) ? 1 : 0);
    }
    if (!((forestValue29_230_0 == 0))) {
        break forest_join_237;
    }
    throw new com.google.gson.JsonParseException(__sourceIntrinsic_11ddcea8addd_invokedynamic29_55(p0));
    }
    life8_116 = new moom.CL(moom.Dg.a__String(((com.google.gson.JsonObject)(life7_99)), ((java.lang.String)("selector"))));
    }
    spill29_8 = life7_99;
    spill29_9 = "extra";
    if (!((life6_5 != 0))) {
        forestValue29_252_0 = spill29_8;
        forestValue29_252_1 = spill29_9;
        break forest_join_252;
    }
    if (!(((com.google.gson.JsonObject)(spill29_8)).has(((java.lang.String)(spill29_9))))) {
        break forest_join_285;
    }
    forestValue29_252_0 = life7_99;
    forestValue29_252_1 = "extra";
    }
    life9_324 = ((com.google.gson.JsonObject)(forestValue29_252_0)).getAsJsonArray(((java.lang.String)(forestValue29_252_1)));
    spill29_10 = ((com.google.gson.JsonArray)(life9_324)).size();
    if (!((life6_5 != 0))) {
        forestValue29_265_0 = spill29_10;
        break forest_join_265;
    }
    if (!((spill29_10 <= 0))) {
        break forest_join_264;
    }
    throw new com.google.gson.JsonParseException("Unexpected empty array of components");
    }
    forestValue29_265_0 = 0;
    }
    life10_340 = forestValue29_265_0;
    forest_cycle_266: while (true) {
    if (!((life10_340 < ((com.google.gson.JsonArray)(life9_324)).size()))) {
        break forest_join_285;
    }
    ((net.minecraft.util.IChatComponent)(life8_116)).a(((net.minecraft.util.IChatComponent)(((net.minecraft.util.IChatComponent$Serializer)(this)).a(((com.google.gson.JsonElement)(((com.google.gson.JsonArray)(life9_324)).get(((int)(life10_340))))), ((java.lang.reflect.Type)(p1)), ((com.google.gson.JsonDeserializationContext)(p2))))));
    life10_340 += 1;
    if (!((life6_5 != 0))) {
        break forest_join_293;
    }
    if (!((life6_5 == 0))) {
        continue forest_cycle_266;
    }
    break forest_cycle_266;
    }
    }
    ((net.minecraft.util.IChatComponent)(life8_116)).a(((moom.CO)(((moom.CO)(((com.google.gson.JsonDeserializationContext)(p2)).deserialize(((com.google.gson.JsonElement)(p0)), ((java.lang.reflect.Type)(moom.CO.class))))))));
    }
    return life8_116;
}


public com.google.gson.JsonElement a(net.minecraft.util.IChatComponent p0, java.lang.reflect.Type p1, com.google.gson.JsonSerializationContext p2) {
int lexicalValue1711_14_0;
    int lexicalValue1711_20_0;
    int lexicalValue1711_47_0;
    int lexicalValue1711_83_0;
    int lexicalValue1711_96_0;
    int lexicalValue1711_171_0;
    int lexicalValue1711_206_0;
    net.minecraft.util.IChatComponent lexicalValue1711_208_0;
    com.google.gson.JsonObject lexicalValue1711_224_0;
    int spill1711_0;
    boolean spill1711_1;
    com.google.gson.JsonObject spill1711_2;
    net.minecraft.util.IChatComponent spill1711_3;
    long life4_3;
    int life6_5;
    com.google.gson.JsonObject life7_45;
    com.google.gson.JsonArray life8_76;
    java.util.Iterator life9_80;
    net.minecraft.util.IChatComponent life10_87;
    moom.CN life8_139;
    com.google.gson.JsonArray life10_163;
    java.lang.Object[] life11_166;
    int life12_169;
    int life13_171;
    java.lang.Object life14_178;
    moom.CK life9_238;
    com.google.gson.JsonObject life10_242;
    moom.CL life10_277;
    lexical_join_224: {
    lexical_join_223: {
    lexical_join_218: {
    lexical_join_212: {
    lexical_join_208: {
    lexical_join_206: {
    lexical_join_202: {
    lexical_join_171: {
    lexical_join_169: {
    lexical_join_167: {
    lexical_join_163: {
    lexical_join_96: {
    lexical_join_94: {
    lexical_join_83: {
    lexical_join_81: {
    lexical_join_77: {
    lexical_join_47: {
    lexical_join_44: {
    lexical_join_28: {
    lexical_join_20: {
    lexical_join_14: {
    life4_3 = (net.minecraft.util.IChatComponent$Serializer.b ^ 61169520166319L);
    life6_5 = ((moom.DS.c__Boolean()) ? 1 : 0);
    spill1711_0 = ((p0 instanceof moom.CM) ? 1 : 0);
    if (!((life6_5 != 0))) {
        lexicalValue1711_14_0 = spill1711_0;
        break lexical_join_14;
    }
    if (!((spill1711_0 != 0))) {
        break lexical_join_28;
    }
    lexicalValue1711_14_0 = ((((moom.CO)(((net.minecraft.util.IChatComponent)(p0)).a__CO())).f()) ? 1 : 0);
    }
    if (!((life6_5 != 0))) {
        lexicalValue1711_20_0 = lexicalValue1711_14_0;
        break lexical_join_20;
    }
    if (!((lexicalValue1711_14_0 != 0))) {
        break lexical_join_28;
    }
    lexicalValue1711_20_0 = ((((java.util.List)(((net.minecraft.util.IChatComponent)(p0)).a__List())).isEmpty()) ? 1 : 0);
    }
    if (!((lexicalValue1711_20_0 != 0))) {
        break lexical_join_28;
    }
    return new com.google.gson.JsonPrimitive(((moom.CM)(((moom.CM)(p0)))).d());
    }
    life7_45 = new com.google.gson.JsonObject();
    spill1711_1 = ((moom.CO)(((net.minecraft.util.IChatComponent)(p0)).a__CO())).f();
    if (!((life6_5 != 0))) {
        lexicalValue1711_47_0 = ((spill1711_1) ? 1 : 0);
        break lexical_join_47;
    }
    if (!((!spill1711_1))) {
        break lexical_join_44;
    }
    ((net.minecraft.util.IChatComponent$Serializer)(this)).a(((moom.CO)(((net.minecraft.util.IChatComponent)(p0)).a__CO())), ((com.google.gson.JsonObject)(life7_45)), ((com.google.gson.JsonSerializationContext)(p2)));
    }
    lexicalValue1711_47_0 = ((((java.util.List)(((net.minecraft.util.IChatComponent)(p0)).a__List())).isEmpty()) ? 1 : 0);
    }
    if (!((life6_5 != 0))) {
        lexicalValue1711_83_0 = lexicalValue1711_47_0;
        break lexical_join_83;
    }
    if (!((lexicalValue1711_47_0 == 0))) {
        break lexical_join_81;
    }
    life8_76 = new com.google.gson.JsonArray();
    life9_80 = ((java.util.List)(((net.minecraft.util.IChatComponent)(p0)).a__List())).iterator();
    lexical_cycle_58: while (true) {
    if (!(((java.util.Iterator)(life9_80)).hasNext())) {
        break lexical_join_77;
    }
    life10_87 = ((net.minecraft.util.IChatComponent)(((java.util.Iterator)(life9_80)).next()));
    ((com.google.gson.JsonArray)(life8_76)).add(((com.google.gson.JsonElement)(((net.minecraft.util.IChatComponent$Serializer)(this)).a(((net.minecraft.util.IChatComponent)(life10_87)), ((java.lang.reflect.Type)(((java.lang.Object)(life10_87)).getClass())), ((com.google.gson.JsonSerializationContext)(p2))))));
    if (!((life6_5 != 0))) {
        break lexical_join_81;
    }
    if (!((life6_5 == 0))) { continue lexical_cycle_58; }
    break lexical_cycle_58;
    }
    }
    ((com.google.gson.JsonObject)(life7_45)).add(((java.lang.String)("extra")), ((com.google.gson.JsonElement)(life8_76)));
    }
    lexicalValue1711_83_0 = ((p0 instanceof moom.CM) ? 1 : 0);
    }
    if (!((life6_5 != 0))) {
        lexicalValue1711_96_0 = lexicalValue1711_83_0;
        break lexical_join_96;
    }
    if (!((lexicalValue1711_83_0 != 0))) {
        break lexical_join_94;
    }
    ((com.google.gson.JsonObject)(life7_45)).addProperty(((java.lang.String)("text")), ((java.lang.String)(((moom.CM)(((moom.CM)(p0)))).d())));
    if (!((life6_5 == 0))) {
        break lexical_join_223;
    }
    }
    lexicalValue1711_96_0 = ((p0 instanceof moom.CN) ? 1 : 0);
    }
    if (!((life6_5 != 0))) {
        lexicalValue1711_171_0 = lexicalValue1711_96_0;
        break lexical_join_171;
    }
    if (!((lexicalValue1711_96_0 != 0))) {
        break lexical_join_169;
    }
    life8_139 = ((moom.CN)(p0));
    spill1711_2 = life7_45;
    if (!((life6_5 != 0))) {
        lexicalValue1711_224_0 = spill1711_2;
        break lexical_join_224;
    }
    ((com.google.gson.JsonObject)(spill1711_2)).addProperty(((java.lang.String)("translate")), ((java.lang.String)(((moom.CN)(life8_139)).d())));
    if (!((((moom.CN)(life8_139)).a__ArrayObject() != null))) {
        break lexical_join_223;
    }
    if (!(((((moom.CN)(life8_139)).a__ArrayObject()).length > 0))) {
        break lexical_join_223;
    }
    life10_163 = new com.google.gson.JsonArray();
    life11_166 = ((moom.CN)(life8_139)).a__ArrayObject();
    life12_169 = (life11_166).length;
    life13_171 = 0;
    lexical_cycle_128: while (true) {
    lexical_join_160: {
    lexical_join_153: {
    lexical_join_151: {
    if (!((life13_171 < life12_169))) {
        break lexical_join_163;
    }
    life14_178 = (life11_166)[life13_171];
    if (!((life6_5 != 0))) {
        break lexical_join_167;
    }
    if (!((life6_5 != 0))) {
        break lexical_join_151;
    }
    if (!((((life14_178 instanceof net.minecraft.util.IChatComponent) ? 1 : 0) != 0))) {
        break lexical_join_153;
    }
    ((com.google.gson.JsonArray)(life10_163)).add(((com.google.gson.JsonElement)(((net.minecraft.util.IChatComponent$Serializer)(this)).a(((net.minecraft.util.IChatComponent)(((net.minecraft.util.IChatComponent)(life14_178)))), ((java.lang.reflect.Type)(((java.lang.Object)(life14_178)).getClass())), ((com.google.gson.JsonSerializationContext)(p2))))));
    }
    if (!((life6_5 == 0))) {
        break lexical_join_160;
    }
    }
    ((com.google.gson.JsonArray)(life10_163)).add(((com.google.gson.JsonElement)(new com.google.gson.JsonPrimitive(java.lang.String.valueOf(((java.lang.Object)(life14_178)))))));
    }
    life13_171 += 1;
    if (!((life6_5 == 0))) { continue lexical_cycle_128; }
    break lexical_cycle_128;
    }
    }
    ((com.google.gson.JsonObject)(life7_45)).add(((java.lang.String)("with")), ((com.google.gson.JsonElement)(life10_163)));
    }
    if (!((life6_5 == 0))) {
        break lexical_join_223;
    }
    }
    lexicalValue1711_171_0 = ((p0 instanceof moom.CK) ? 1 : 0);
    }
    if (!((life6_5 != 0))) {
        lexicalValue1711_206_0 = lexicalValue1711_171_0;
        break lexical_join_206;
    }
    if (!((lexicalValue1711_171_0 != 0))) {
        break lexical_join_202;
    }
    life9_238 = ((moom.CK)(p0));
    life10_242 = new com.google.gson.JsonObject();
    ((com.google.gson.JsonObject)(life10_242)).addProperty(((java.lang.String)("name")), ((java.lang.String)(((moom.CK)(life9_238)).d())));
    ((com.google.gson.JsonObject)(life10_242)).addProperty(((java.lang.String)("objective")), ((java.lang.String)(((moom.CK)(life9_238)).e())));
    ((com.google.gson.JsonObject)(life10_242)).addProperty(((java.lang.String)("value")), ((java.lang.String)(((moom.CK)(life9_238)).a())));
    ((com.google.gson.JsonObject)(life7_45)).add(((java.lang.String)("score")), ((com.google.gson.JsonElement)(life10_242)));
    if (!((life6_5 == 0))) {
        break lexical_join_223;
    }
    }
    spill1711_3 = p0;
    if (!((life6_5 != 0))) {
        lexicalValue1711_208_0 = spill1711_3;
        break lexical_join_208;
    }
    lexicalValue1711_206_0 = ((spill1711_3 instanceof moom.CL) ? 1 : 0);
    }
    if (!((lexicalValue1711_206_0 != 0))) {
        break lexical_join_212;
    }
    lexicalValue1711_208_0 = p0;
    }
    life10_277 = ((moom.CL)(lexicalValue1711_208_0));
    if (!((life6_5 == 0))) {
        break lexical_join_218;
    }
    }
    throw new java.lang.IllegalArgumentException(__sourceIntrinsic_c0f2dbe355e5_invokedynamic1711_59(p0));
    }
    ((com.google.gson.JsonObject)(life7_45)).addProperty(((java.lang.String)("selector")), ((java.lang.String)(((moom.CL)(life10_277)).d())));
    }
    lexicalValue1711_224_0 = life7_45;
    }
    return lexicalValue1711_224_0;
}


public net.minecraft.util.IChatComponent deserialize(com.google.gson.JsonElement p0, java.lang.reflect.Type p1, com.google.gson.JsonDeserializationContext p2) throws com.google.gson.JsonParseException {
return ((net.minecraft.util.IChatComponent$Serializer)(this)).a(((com.google.gson.JsonElement)(p0)), ((java.lang.reflect.Type)(p1)), ((com.google.gson.JsonDeserializationContext)(p2)));
}


public com.google.gson.JsonElement serialize__sourceBridge_aa40c1536e(java.lang.Object p0, java.lang.reflect.Type p1, com.google.gson.JsonSerializationContext p2) {
return ((net.minecraft.util.IChatComponent$Serializer)(this)).a(((net.minecraft.util.IChatComponent)(((net.minecraft.util.IChatComponent)(p0)))), ((java.lang.reflect.Type)(p1)), ((com.google.gson.JsonSerializationContext)(p2)));
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_11ddcea8addd_invokedynamic29_18(com.google.gson.JsonElement a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_11ddcea8addd_invokedynamic29_55(com.google.gson.JsonElement a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0f2dbe355e5_invokedynamic1711_59(net.minecraft.util.IChatComponent a0) throws E;

public com.google.gson.JsonElement serialize(net.minecraft.util.IChatComponent __bridgeParam0, java.lang.reflect.Type __bridgeParam1, com.google.gson.JsonSerializationContext __bridgeParam2) { return this.serialize__sourceBridge_aa40c1536e(((java.lang.Object)(__bridgeParam0)), ((java.lang.reflect.Type)(__bridgeParam1)), ((com.google.gson.JsonSerializationContext)(__bridgeParam2))); }
}
