package moom;


public class CQ implements com.google.gson.JsonDeserializer, com.google.gson.JsonSerializer {

private static final long a;

public CQ() {
super();
}


static {
moom.CQ.a = (moom._c.a(-3558500877919926036L, 1267026133112921825L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(1467378426997L);
}


private static com.google.gson.JsonParseException a(com.google.gson.JsonParseException p0) {
return p0;
}


public moom.CO a(com.google.gson.JsonElement p0, java.lang.reflect.Type p1, com.google.gson.JsonDeserializationContext p2) throws com.google.gson.JsonParseException {
com.google.gson.JsonObject forwardValue1607_23_0;
    int forwardValue1607_38_0;
    int forwardValue1607_51_0;
    int forwardValue1607_64_0;
    int forwardValue1607_77_0;
    int forwardValue1607_90_0;
    int forwardValue1607_105_0;
    int forwardValue1607_117_0;
    com.google.gson.JsonPrimitive forwardValue1607_139_0;
    net.minecraft.event.ClickEvent$Action forwardValue1607_141_0;
    com.google.gson.JsonPrimitive forwardValue1607_153_0;
    java.lang.String forwardValue1607_154_0;
    com.google.gson.JsonObject forwardValue1607_172_0;
    int forwardValue1607_176_0;
    com.google.gson.JsonObject forwardValue1607_179_0;
    java.lang.String forwardValue1607_179_1;
    com.google.gson.JsonObject forwardValue1607_186_0;
    com.google.gson.JsonPrimitive forwardValue1607_196_0;
    net.minecraft.event.HoverEvent$Action forwardValue1607_198_0;
    com.google.gson.JsonObject spill1607_0;
    boolean spill1607_1;
    com.google.gson.JsonObject spill1607_2;
    com.google.gson.JsonPrimitive spill1607_3;
    com.google.gson.JsonPrimitive spill1607_4;
    boolean spill1607_5;
    java.lang.String spill1607_6;
    com.google.gson.JsonObject spill1607_7;
    com.google.gson.JsonPrimitive spill1607_8;
    long life4_3;
    int life6_5;
    moom.CO life7_12;
    com.google.gson.JsonObject life8_15;
    com.google.gson.JsonObject life9_173;
    com.google.gson.JsonPrimitive life10_184;
    net.minecraft.event.ClickEvent$Action life11_199;
    com.google.gson.JsonPrimitive life12_203;
    java.lang.String life13_217;
    com.google.gson.JsonObject life9_261;
    com.google.gson.JsonPrimitive life10_272;
    net.minecraft.event.HoverEvent$Action life11_287;
    net.minecraft.util.IChatComponent life12_295;
    forward_join_223: {
    forward_join_221: {
    forward_join_198: {
    forward_join_196: {
    forward_join_195: {
    forward_join_186: {
    forward_join_179: {
    forward_join_176: {
    forward_join_172: {
    forward_join_171: {
    forward_join_154: {
    forward_join_153: {
    forward_join_152: {
    forward_join_141: {
    forward_join_139: {
    forward_join_138: {
    forward_join_117: {
    forward_join_114: {
    forward_join_105: {
    forward_join_102: {
    forward_join_90: {
    forward_join_87: {
    forward_join_77: {
    forward_join_74: {
    forward_join_64: {
    forward_join_61: {
    forward_join_51: {
    forward_join_48: {
    forward_join_38: {
    forward_join_35: {
    forward_join_23: {
    forward_join_22: {
    life4_3 = (moom.CQ.a ^ 7921891824744L);
    life6_5 = ((moom.DS.c__Boolean()) ? 1 : 0);
    if (!(((com.google.gson.JsonElement)(p0)).isJsonObject())) {
        break forward_join_223;
    }
    life7_12 = new moom.CO();
    life8_15 = ((com.google.gson.JsonElement)(p0)).getAsJsonObject();
    spill1607_0 = life8_15;
    if (!((life6_5 != 0))) {
        forwardValue1607_23_0 = spill1607_0;
        break forward_join_23;
    }
    if (!((spill1607_0 == null))) {
        break forward_join_22;
    }
    return null;
    }
    forwardValue1607_23_0 = life8_15;
    }
    spill1607_1 = ((com.google.gson.JsonObject)(forwardValue1607_23_0)).has(((java.lang.String)("bold")));
    if (!((life6_5 != 0))) {
        forwardValue1607_38_0 = ((spill1607_1) ? 1 : 0);
        break forward_join_38;
    }
    if (!(spill1607_1)) {
        break forward_join_35;
    }
    ((moom.CO)(life7_12)).c = ((java.lang.Boolean)(java.lang.Boolean.valueOf(((boolean)(((com.google.gson.JsonElement)(((com.google.gson.JsonObject)(life8_15)).get(((java.lang.String)("bold"))))).getAsBoolean())))));
    }
    forwardValue1607_38_0 = ((((com.google.gson.JsonObject)(life8_15)).has(((java.lang.String)("italic")))) ? 1 : 0);
    }
    if (!((life6_5 != 0))) {
        forwardValue1607_51_0 = forwardValue1607_38_0;
        break forward_join_51;
    }
    if (!((forwardValue1607_38_0 != 0))) {
        break forward_join_48;
    }
    ((moom.CO)(life7_12)).d = ((java.lang.Boolean)(java.lang.Boolean.valueOf(((boolean)(((com.google.gson.JsonElement)(((com.google.gson.JsonObject)(life8_15)).get(((java.lang.String)("italic"))))).getAsBoolean())))));
    }
    forwardValue1607_51_0 = ((((com.google.gson.JsonObject)(life8_15)).has(((java.lang.String)("underlined")))) ? 1 : 0);
    }
    if (!((life6_5 != 0))) {
        forwardValue1607_64_0 = forwardValue1607_51_0;
        break forward_join_64;
    }
    if (!((forwardValue1607_51_0 != 0))) {
        break forward_join_61;
    }
    ((moom.CO)(life7_12)).e = ((java.lang.Boolean)(java.lang.Boolean.valueOf(((boolean)(((com.google.gson.JsonElement)(((com.google.gson.JsonObject)(life8_15)).get(((java.lang.String)("underlined"))))).getAsBoolean())))));
    }
    forwardValue1607_64_0 = ((((com.google.gson.JsonObject)(life8_15)).has(((java.lang.String)("strikethrough")))) ? 1 : 0);
    }
    if (!((life6_5 != 0))) {
        forwardValue1607_77_0 = forwardValue1607_64_0;
        break forward_join_77;
    }
    if (!((forwardValue1607_64_0 != 0))) {
        break forward_join_74;
    }
    ((moom.CO)(life7_12)).f = ((java.lang.Boolean)(java.lang.Boolean.valueOf(((boolean)(((com.google.gson.JsonElement)(((com.google.gson.JsonObject)(life8_15)).get(((java.lang.String)("strikethrough"))))).getAsBoolean())))));
    }
    forwardValue1607_77_0 = ((((com.google.gson.JsonObject)(life8_15)).has(((java.lang.String)("obfuscated")))) ? 1 : 0);
    }
    if (!((life6_5 != 0))) {
        forwardValue1607_90_0 = forwardValue1607_77_0;
        break forward_join_90;
    }
    if (!((forwardValue1607_77_0 != 0))) {
        break forward_join_87;
    }
    ((moom.CO)(life7_12)).g = ((java.lang.Boolean)(java.lang.Boolean.valueOf(((boolean)(((com.google.gson.JsonElement)(((com.google.gson.JsonObject)(life8_15)).get(((java.lang.String)("obfuscated"))))).getAsBoolean())))));
    }
    forwardValue1607_90_0 = ((((com.google.gson.JsonObject)(life8_15)).has(((java.lang.String)("color")))) ? 1 : 0);
    }
    if (!((life6_5 != 0))) {
        forwardValue1607_105_0 = forwardValue1607_90_0;
        break forward_join_105;
    }
    if (!((forwardValue1607_90_0 != 0))) {
        break forward_join_102;
    }
    ((moom.CO)(life7_12)).b = ((net.minecraft.util.EnumChatFormatting)(((net.minecraft.util.EnumChatFormatting)(((com.google.gson.JsonDeserializationContext)(p2)).deserialize(((com.google.gson.JsonElement)(((com.google.gson.JsonObject)(life8_15)).get(((java.lang.String)("color"))))), ((java.lang.reflect.Type)(net.minecraft.util.EnumChatFormatting.class)))))));
    }
    forwardValue1607_105_0 = ((((com.google.gson.JsonObject)(life8_15)).has(((java.lang.String)("insertion")))) ? 1 : 0);
    }
    if (!((life6_5 != 0))) {
        forwardValue1607_117_0 = forwardValue1607_105_0;
        break forward_join_117;
    }
    if (!((forwardValue1607_105_0 != 0))) {
        break forward_join_114;
    }
    ((moom.CO)(life7_12)).j = ((java.lang.String)(((com.google.gson.JsonElement)(((com.google.gson.JsonObject)(life8_15)).get(((java.lang.String)("insertion"))))).getAsString()));
    }
    forwardValue1607_117_0 = ((((com.google.gson.JsonObject)(life8_15)).has(((java.lang.String)("clickEvent")))) ? 1 : 0);
    }
    if (!((life6_5 != 0))) {
        forwardValue1607_176_0 = forwardValue1607_117_0;
        break forward_join_176;
    }
    if (!((forwardValue1607_117_0 != 0))) {
        break forward_join_171;
    }
    life9_173 = ((com.google.gson.JsonObject)(life8_15)).getAsJsonObject(((java.lang.String)("clickEvent")));
    spill1607_2 = life9_173;
    if (!((life6_5 != 0))) {
        forwardValue1607_172_0 = spill1607_2;
        break forward_join_172;
    }
    if (!((spill1607_2 != null))) {
        break forward_join_171;
    }
    life10_184 = ((com.google.gson.JsonObject)(life9_173)).getAsJsonPrimitive(((java.lang.String)("action")));
    spill1607_3 = life10_184;
    if (!((life6_5 != 0))) {
        forwardValue1607_139_0 = spill1607_3;
        break forward_join_139;
    }
    if (!((spill1607_3 == null))) {
        break forward_join_138;
    }
    forwardValue1607_141_0 = null;
    break forward_join_141;
    }
    forwardValue1607_139_0 = life10_184;
    }
    forwardValue1607_141_0 = net.minecraft.event.ClickEvent$Action.a(((java.lang.String)(((com.google.gson.JsonPrimitive)(forwardValue1607_139_0)).getAsString())));
    }
    life11_199 = forwardValue1607_141_0;
    life12_203 = ((com.google.gson.JsonObject)(life9_173)).getAsJsonPrimitive(((java.lang.String)("value")));
    spill1607_4 = life12_203;
    if (!((life6_5 != 0))) {
        forwardValue1607_153_0 = spill1607_4;
        break forward_join_153;
    }
    if (!((spill1607_4 == null))) {
        break forward_join_152;
    }
    forwardValue1607_154_0 = null;
    break forward_join_154;
    }
    forwardValue1607_153_0 = life12_203;
    }
    forwardValue1607_154_0 = ((com.google.gson.JsonPrimitive)(forwardValue1607_153_0)).getAsString();
    }
    life13_217 = forwardValue1607_154_0;
    if (!((life11_199 != null))) {
        break forward_join_171;
    }
    if (!((life13_217 != null))) {
        break forward_join_171;
    }
    spill1607_5 = ((net.minecraft.event.ClickEvent$Action)(life11_199)).a__Boolean();
    if (!((life6_5 != 0))) {
        forwardValue1607_176_0 = ((spill1607_5) ? 1 : 0);
        break forward_join_176;
    }
    if (!(spill1607_5)) {
        break forward_join_171;
    }
    ((moom.CO)(life7_12)).h = ((moom.v2)(new moom.v2(life11_199, life13_217)));
    }
    forwardValue1607_172_0 = life8_15;
    }
    spill1607_6 = "hoverEvent";
    if (!((life6_5 != 0))) {
        forwardValue1607_179_0 = forwardValue1607_172_0;
        forwardValue1607_179_1 = spill1607_6;
        break forward_join_179;
    }
    forwardValue1607_176_0 = ((((com.google.gson.JsonObject)(forwardValue1607_172_0)).has(((java.lang.String)(spill1607_6)))) ? 1 : 0);
    }
    if (!((forwardValue1607_176_0 != 0))) {
        break forward_join_221;
    }
    forwardValue1607_179_0 = life8_15;
    forwardValue1607_179_1 = "hoverEvent";
    }
    life9_261 = ((com.google.gson.JsonObject)(forwardValue1607_179_0)).getAsJsonObject(((java.lang.String)(forwardValue1607_179_1)));
    spill1607_7 = life9_261;
    if (!((life6_5 != 0))) {
        forwardValue1607_186_0 = spill1607_7;
        break forward_join_186;
    }
    if (!((spill1607_7 != null))) {
        break forward_join_221;
    }
    forwardValue1607_186_0 = life9_261;
    }
    life10_272 = ((com.google.gson.JsonObject)(forwardValue1607_186_0)).getAsJsonPrimitive(((java.lang.String)("action")));
    spill1607_8 = life10_272;
    if (!((life6_5 != 0))) {
        forwardValue1607_196_0 = spill1607_8;
        break forward_join_196;
    }
    if (!((spill1607_8 == null))) {
        break forward_join_195;
    }
    forwardValue1607_198_0 = null;
    break forward_join_198;
    }
    forwardValue1607_196_0 = life10_272;
    }
    forwardValue1607_198_0 = net.minecraft.event.HoverEvent$Action.a(((java.lang.String)(((com.google.gson.JsonPrimitive)(forwardValue1607_196_0)).getAsString())));
    }
    life11_287 = forwardValue1607_198_0;
    life12_295 = ((net.minecraft.util.IChatComponent)(((com.google.gson.JsonDeserializationContext)(p2)).deserialize(((com.google.gson.JsonElement)(((com.google.gson.JsonObject)(life9_261)).get(((java.lang.String)("value"))))), ((java.lang.reflect.Type)(net.minecraft.util.IChatComponent.class)))));
    if (!((life11_287 != null))) {
        break forward_join_221;
    }
    if (!((life12_295 != null))) {
        break forward_join_221;
    }
    if (!(((net.minecraft.event.HoverEvent$Action)(life11_287)).a__Boolean())) {
        break forward_join_221;
    }
    ((moom.CO)(life7_12)).i = ((moom.v3)(new moom.v3(life11_287, life12_295)));
    }
    return life7_12;
    }
    return null;
}


public com.google.gson.JsonElement a(moom.CO p0, java.lang.reflect.Type p1, com.google.gson.JsonSerializationContext p2) {
java.lang.Boolean forwardValue1608_27_0;
    java.lang.Boolean forwardValue1608_37_0;
    java.lang.Boolean forwardValue1608_47_0;
    java.lang.Boolean forwardValue1608_59_0;
    moom.CO forwardValue1608_66_0;
    moom.CO forwardValue1608_78_0;
    moom.CO forwardValue1608_90_0;
    moom.CO forwardValue1608_116_0;
    java.lang.Boolean spill1608_0;
    moom.CO spill1608_1;
    long life4_3;
    int life6_5;
    com.google.gson.JsonObject life7_16;
    com.google.gson.JsonObject life8_144;
    com.google.gson.JsonObject life8_168;
    forward_join_141: {
    forward_join_116: {
    forward_join_115: {
    forward_join_90: {
    forward_join_89: {
    forward_join_78: {
    forward_join_77: {
    forward_join_66: {
    forward_join_65: {
    forward_join_59: {
    forward_join_55: {
    forward_join_47: {
    forward_join_45: {
    forward_join_37: {
    forward_join_35: {
    forward_join_27: {
    forward_join_25: {
    forward_join_11: {
    life4_3 = (moom.CQ.a ^ 20710843893374L);
    life6_5 = ((moom.DS.b__Boolean()) ? 1 : 0);
    if (!(((moom.CO)(p0)).f())) {
        break forward_join_11;
    }
    return null;
    }
    life7_16 = new com.google.gson.JsonObject();
    spill1608_0 = ((moom.CO)(p0)).c;
    if (!((life6_5 == 0))) {
        forwardValue1608_27_0 = spill1608_0;
        break forward_join_27;
    }
    if (!((spill1608_0 != null))) {
        break forward_join_25;
    }
    ((com.google.gson.JsonObject)(life7_16)).addProperty(((java.lang.String)("bold")), ((java.lang.Boolean)(((moom.CO)(p0)).c)));
    }
    forwardValue1608_27_0 = ((moom.CO)(p0)).d;
    }
    if (!((life6_5 == 0))) {
        forwardValue1608_37_0 = forwardValue1608_27_0;
        break forward_join_37;
    }
    if (!((forwardValue1608_27_0 != null))) {
        break forward_join_35;
    }
    ((com.google.gson.JsonObject)(life7_16)).addProperty(((java.lang.String)("italic")), ((java.lang.Boolean)(((moom.CO)(p0)).d)));
    }
    forwardValue1608_37_0 = ((moom.CO)(p0)).e;
    }
    if (!((life6_5 == 0))) {
        forwardValue1608_47_0 = forwardValue1608_37_0;
        break forward_join_47;
    }
    if (!((forwardValue1608_37_0 != null))) {
        break forward_join_45;
    }
    ((com.google.gson.JsonObject)(life7_16)).addProperty(((java.lang.String)("underlined")), ((java.lang.Boolean)(((moom.CO)(p0)).e)));
    }
    forwardValue1608_47_0 = ((moom.CO)(p0)).f;
    }
    if (!((life6_5 == 0))) {
        forwardValue1608_59_0 = forwardValue1608_47_0;
        break forward_join_59;
    }
    if (!((forwardValue1608_47_0 != null))) {
        break forward_join_55;
    }
    ((com.google.gson.JsonObject)(life7_16)).addProperty(((java.lang.String)("strikethrough")), ((java.lang.Boolean)(((moom.CO)(p0)).f)));
    }
    spill1608_1 = p0;
    if (!((life6_5 == 0))) {
        forwardValue1608_66_0 = spill1608_1;
        break forward_join_66;
    }
    forwardValue1608_59_0 = ((moom.CO)(spill1608_1)).g;
    }
    if (!((forwardValue1608_59_0 != null))) {
        break forward_join_65;
    }
    ((com.google.gson.JsonObject)(life7_16)).addProperty(((java.lang.String)("obfuscated")), ((java.lang.Boolean)(((moom.CO)(p0)).g)));
    }
    forwardValue1608_66_0 = p0;
    }
    if (!((life6_5 == 0))) {
        forwardValue1608_78_0 = forwardValue1608_66_0;
        break forward_join_78;
    }
    if (!((((moom.CO)(forwardValue1608_66_0)).b != null))) {
        break forward_join_77;
    }
    ((com.google.gson.JsonObject)(life7_16)).add(((java.lang.String)("color")), ((com.google.gson.JsonElement)(((com.google.gson.JsonSerializationContext)(p2)).serialize(((java.lang.Object)(((moom.CO)(p0)).b))))));
    }
    forwardValue1608_78_0 = p0;
    }
    if (!((life6_5 == 0))) {
        forwardValue1608_90_0 = forwardValue1608_78_0;
        break forward_join_90;
    }
    if (!((((moom.CO)(forwardValue1608_78_0)).j != null))) {
        break forward_join_89;
    }
    ((com.google.gson.JsonObject)(life7_16)).add(((java.lang.String)("insertion")), ((com.google.gson.JsonElement)(((com.google.gson.JsonSerializationContext)(p2)).serialize(((java.lang.Object)(((moom.CO)(p0)).j))))));
    }
    forwardValue1608_90_0 = p0;
    }
    if (!((life6_5 == 0))) {
        forwardValue1608_116_0 = forwardValue1608_90_0;
        break forward_join_116;
    }
    if (!((((moom.CO)(forwardValue1608_90_0)).h != null))) {
        break forward_join_115;
    }
    life8_144 = new com.google.gson.JsonObject();
    ((com.google.gson.JsonObject)(life8_144)).addProperty(((java.lang.String)("action")), ((java.lang.String)(((net.minecraft.event.ClickEvent$Action)(((moom.v2)(((moom.CO)(p0)).h)).a__aZ())).a())));
    ((com.google.gson.JsonObject)(life8_144)).addProperty(((java.lang.String)("value")), ((java.lang.String)(((moom.v2)(((moom.CO)(p0)).h)).a())));
    ((com.google.gson.JsonObject)(life7_16)).add(((java.lang.String)("clickEvent")), ((com.google.gson.JsonElement)(life8_144)));
    }
    forwardValue1608_116_0 = p0;
    }
    if (!((((moom.CO)(forwardValue1608_116_0)).i != null))) {
        break forward_join_141;
    }
    life8_168 = new com.google.gson.JsonObject();
    ((com.google.gson.JsonObject)(life8_168)).addProperty(((java.lang.String)("action")), ((java.lang.String)(((net.minecraft.event.HoverEvent$Action)(((moom.v3)(((moom.CO)(p0)).i)).a__a0())).a())));
    ((com.google.gson.JsonObject)(life8_168)).add(((java.lang.String)("value")), ((com.google.gson.JsonElement)(((com.google.gson.JsonSerializationContext)(p2)).serialize(((java.lang.Object)(((moom.v3)(((moom.CO)(p0)).i)).a()))))));
    ((com.google.gson.JsonObject)(life7_16)).add(((java.lang.String)("hoverEvent")), ((com.google.gson.JsonElement)(life8_168)));
    }
    return life7_16;
}


public java.lang.Object deserialize(com.google.gson.JsonElement p0, java.lang.reflect.Type p1, com.google.gson.JsonDeserializationContext p2) throws com.google.gson.JsonParseException {
return ((moom.CQ)(this)).a(((com.google.gson.JsonElement)(p0)), ((java.lang.reflect.Type)(p1)), ((com.google.gson.JsonDeserializationContext)(p2)));
}


public com.google.gson.JsonElement serialize(java.lang.Object p0, java.lang.reflect.Type p1, com.google.gson.JsonSerializationContext p2) {
return ((moom.CQ)(this)).a(((moom.CO)(((moom.CO)(p0)))), ((java.lang.reflect.Type)(p1)), ((com.google.gson.JsonSerializationContext)(p2)));
}


public com.google.gson.JsonElement serialize(moom.CO __bridgeParam0, java.lang.reflect.Type __bridgeParam1, com.google.gson.JsonSerializationContext __bridgeParam2) { return this.serialize(((java.lang.Object)(__bridgeParam0)), ((java.lang.reflect.Type)(__bridgeParam1)), ((com.google.gson.JsonSerializationContext)(__bridgeParam2))); }
}
