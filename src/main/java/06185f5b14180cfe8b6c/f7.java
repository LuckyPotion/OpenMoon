package moom;


public class f7 implements com.google.gson.JsonDeserializer {

private static final long a;

public f7() {
super();
}


static {
a = (moom._c.a(3811343211415992209L, 4489722219144586121L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(26596723189890L);
}


private static com.google.gson.JsonParseException a(com.google.gson.JsonParseException p0) {
return p0;
}


public moom.f5 a(com.google.gson.JsonElement p0, java.lang.reflect.Type p1, com.google.gson.JsonDeserializationContext p2) throws com.google.gson.JsonParseException {
com.google.gson.JsonElement lexicalValue1160_76_0;
    int lexicalValue1160_107_0;
    int lexicalValue1160_121_0;
    int lexicalValue1160_123_0;
    int lexicalValue1160_133_0;
    int lexicalValue1160_147_0;
    int lexicalValue1160_149_0;
    int lexicalValue1160_159_0;
    int lexicalValue1160_171_0;
    int lexicalValue1160_173_0;
    int lexicalValue1160_183_0;
    int lexicalValue1160_195_0;
    moom.f5 lexicalValue1160_200_0;
    java.lang.String spill1160_0;
    moom.f5 spill1160_1;
    com.google.gson.JsonElement spill1160_2;
    boolean spill1160_3;
    int spill1160_4;
    int spill1160_5;
    int spill1160_6;
    long life4_3;
    com.google.gson.JsonObject life7_8;
    moom.f5 life8_12;
    net.minecraft.client.audio.SoundCategory life9_25;
    java.lang.String life6_26;
    com.google.gson.JsonArray life10_48;
    int life11_50;
    com.google.gson.JsonElement life12_58;
    moom.f6 life13_62;
    com.google.gson.JsonObject life14_90;
    net.minecraft.client.audio.SoundList$SoundEntry$Type life15_109;
    float life15_131;
    float life15_163;
    int life15_195;
    lexical_join_200: {
    lexical_join_199: {
    life4_3 = (moom.f7.a ^ 133217036152524L);
    spill1160_0 = net.minecraft.client.audio.SoundHandler.b();
    life7_8 = moom.Dg.a__JsonObject(((com.google.gson.JsonElement)(p0)), ((java.lang.String)("entry")));
    life8_12 = new moom.f5();
    ((moom.f5)(life8_12)).a(((boolean)(moom.Dg.a(((com.google.gson.JsonObject)(life7_8)), ((java.lang.String)("replace")), ((boolean)(false))))));
    life9_25 = net.minecraft.client.audio.SoundCategory.a(((java.lang.String)(moom.Dg.a(((com.google.gson.JsonObject)(life7_8)), ((java.lang.String)("category")), ((java.lang.String)(((net.minecraft.client.audio.SoundCategory)(net.minecraft.client.audio.SoundCategory.MASTER)).a__String()))))));
    life6_26 = spill1160_0;
    spill1160_1 = life8_12;
    if (!((life6_26 == null))) {
        lexicalValue1160_200_0 = spill1160_1;
        break lexical_join_200;
    }
    ((moom.f5)(spill1160_1)).a(((net.minecraft.client.audio.SoundCategory)(life9_25)));
    org.apache.commons.lang3.Validate.notNull(((java.lang.Object)(life9_25)), ((java.lang.String)("Invalid category")), ((java.lang.Object[])(new java.lang.Object[0])));
    if (!(((com.google.gson.JsonObject)(life7_8)).has(((java.lang.String)("sounds"))))) {
        break lexical_join_199;
    }
    life10_48 = moom.Dg.a__JsonArray(((com.google.gson.JsonObject)(life7_8)), ((java.lang.String)("sounds")));
    life11_50 = 0;
    lexical_cycle_48: while (true) {
    lexical_join_195: {
    lexical_join_191: {
    lexical_join_183: {
    lexical_join_180: {
    lexical_join_173: {
    lexical_join_172: {
    lexical_join_171: {
    lexical_join_159: {
    lexical_join_156: {
    lexical_join_149: {
    lexical_join_148: {
    lexical_join_147: {
    lexical_join_133: {
    lexical_join_130: {
    lexical_join_123: {
    lexical_join_122: {
    lexical_join_121: {
    lexical_join_107: {
    lexical_join_104: {
    lexical_join_76: {
    lexical_join_75: {
    if (!((life11_50 < ((com.google.gson.JsonArray)(life10_48)).size()))) {
        break lexical_join_199;
    }
    life12_58 = ((com.google.gson.JsonArray)(life10_48)).get(((int)(life11_50)));
    life13_62 = new moom.f6();
    spill1160_2 = life12_58;
    if (!((life6_26 == null))) {
        lexicalValue1160_76_0 = spill1160_2;
        break lexical_join_76;
    }
    if (!(moom.Dg.a__Boolean(((com.google.gson.JsonElement)(spill1160_2))))) {
        break lexical_join_75;
    }
    ((moom.f6)(life13_62)).a(((java.lang.String)(moom.Dg.a__String(((com.google.gson.JsonElement)(life12_58)), ((java.lang.String)("sound"))))));
    if (!((life6_26 != null))) {
        break lexical_join_191;
    }
    net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[5])));
    }
    lexicalValue1160_76_0 = life12_58;
    }
    life14_90 = moom.Dg.a__JsonObject(((com.google.gson.JsonElement)(lexicalValue1160_76_0)), ((java.lang.String)("sound")));
    ((moom.f6)(life13_62)).a(((java.lang.String)(moom.Dg.a__String(((com.google.gson.JsonObject)(life14_90)), ((java.lang.String)("name"))))));
    spill1160_3 = ((com.google.gson.JsonObject)(life14_90)).has(((java.lang.String)("type")));
    if (!((life6_26 == null))) {
        lexicalValue1160_107_0 = ((spill1160_3) ? 1 : 0);
        break lexical_join_107;
    }
    if (!(spill1160_3)) {
        break lexical_join_104;
    }
    life15_109 = net.minecraft.client.audio.SoundList$SoundEntry$Type.a(((java.lang.String)(moom.Dg.a__String(((com.google.gson.JsonObject)(life14_90)), ((java.lang.String)("type"))))));
    org.apache.commons.lang3.Validate.notNull(((java.lang.Object)(life15_109)), ((java.lang.String)("Invalid type")), ((java.lang.Object[])(new java.lang.Object[0])));
    ((moom.f6)(life13_62)).a(((net.minecraft.client.audio.SoundList$SoundEntry$Type)(life15_109)));
    }
    lexicalValue1160_107_0 = ((((com.google.gson.JsonObject)(life14_90)).has(((java.lang.String)("volume")))) ? 1 : 0);
    }
    if (!((life6_26 == null))) {
        lexicalValue1160_133_0 = lexicalValue1160_107_0;
        break lexical_join_133;
    }
    if (!((lexicalValue1160_107_0 != 0))) {
        break lexical_join_130;
    }
    life15_131 = moom.Dg.a(((com.google.gson.JsonObject)(life14_90)), ((java.lang.String)("volume")));
    spill1160_4 = recovery.source.CarrierOps.fcmpl(((float)(life15_131)), ((float)(0x0.0p0f)));
    if (!((life6_26 == null))) {
        lexicalValue1160_121_0 = spill1160_4;
        break lexical_join_121;
    }
    if (!((spill1160_4 > 0))) {
        break lexical_join_122;
    }
    lexicalValue1160_121_0 = 1;
    }
    lexicalValue1160_123_0 = lexicalValue1160_121_0;
    break lexical_join_123;
    }
    lexicalValue1160_123_0 = 0;
    }
    org.apache.commons.lang3.Validate.isTrue(((boolean)__sourceIntrinsic_integerToBoolean((lexicalValue1160_123_0))), ((java.lang.String)("Invalid volume")), ((java.lang.Object[])(new java.lang.Object[0])));
    ((moom.f6)(life13_62)).a(((float)(life15_131)));
    }
    lexicalValue1160_133_0 = ((((com.google.gson.JsonObject)(life14_90)).has(((java.lang.String)("pitch")))) ? 1 : 0);
    }
    if (!((life6_26 == null))) {
        lexicalValue1160_159_0 = lexicalValue1160_133_0;
        break lexical_join_159;
    }
    if (!((lexicalValue1160_133_0 != 0))) {
        break lexical_join_156;
    }
    life15_163 = moom.Dg.a(((com.google.gson.JsonObject)(life14_90)), ((java.lang.String)("pitch")));
    spill1160_5 = recovery.source.CarrierOps.fcmpl(((float)(life15_163)), ((float)(0x0.0p0f)));
    if (!((life6_26 == null))) {
        lexicalValue1160_147_0 = spill1160_5;
        break lexical_join_147;
    }
    if (!((spill1160_5 > 0))) {
        break lexical_join_148;
    }
    lexicalValue1160_147_0 = 1;
    }
    lexicalValue1160_149_0 = lexicalValue1160_147_0;
    break lexical_join_149;
    }
    lexicalValue1160_149_0 = 0;
    }
    org.apache.commons.lang3.Validate.isTrue(((boolean)__sourceIntrinsic_integerToBoolean((lexicalValue1160_149_0))), ((java.lang.String)("Invalid pitch")), ((java.lang.Object[])(new java.lang.Object[0])));
    ((moom.f6)(life13_62)).b(((float)(life15_163)));
    }
    lexicalValue1160_159_0 = ((((com.google.gson.JsonObject)(life14_90)).has(((java.lang.String)("weight")))) ? 1 : 0);
    }
    if (!((life6_26 == null))) {
        lexicalValue1160_183_0 = lexicalValue1160_159_0;
        break lexical_join_183;
    }
    if (!((lexicalValue1160_159_0 != 0))) {
        break lexical_join_180;
    }
    life15_195 = moom.Dg.a__Int(((com.google.gson.JsonObject)(life14_90)), ((java.lang.String)("weight")));
    spill1160_6 = life15_195;
    if (!((life6_26 == null))) {
        lexicalValue1160_171_0 = spill1160_6;
        break lexical_join_171;
    }
    if (!((spill1160_6 > 0))) {
        break lexical_join_172;
    }
    lexicalValue1160_171_0 = 1;
    }
    lexicalValue1160_173_0 = lexicalValue1160_171_0;
    break lexical_join_173;
    }
    lexicalValue1160_173_0 = 0;
    }
    org.apache.commons.lang3.Validate.isTrue(((boolean)__sourceIntrinsic_integerToBoolean((lexicalValue1160_173_0))), ((java.lang.String)("Invalid weight")), ((java.lang.Object[])(new java.lang.Object[0])));
    ((moom.f6)(life13_62)).a(((int)(life15_195)));
    }
    lexicalValue1160_183_0 = ((((com.google.gson.JsonObject)(life14_90)).has(((java.lang.String)("stream")))) ? 1 : 0);
    }
    if (!((life6_26 == null))) {
        lexicalValue1160_195_0 = lexicalValue1160_183_0;
        break lexical_join_195;
    }
    if (!((lexicalValue1160_183_0 != 0))) {
        break lexical_join_191;
    }
    ((moom.f6)(life13_62)).a(((boolean)(moom.Dg.f(((com.google.gson.JsonObject)(life14_90)), ((java.lang.String)("stream"))))));
    }
    lexicalValue1160_195_0 = ((((java.util.List)(((moom.f5)(life8_12)).a())).add(((java.lang.Object)(life13_62)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(lexicalValue1160_195_0);
    life11_50 += 1;
    if (!((life6_26 != null))) { continue lexical_cycle_48; }
    break lexical_cycle_48;
    }
    }
    lexicalValue1160_200_0 = life8_12;
    }
    return lexicalValue1160_200_0;
}


public java.lang.Object deserialize(com.google.gson.JsonElement p0, java.lang.reflect.Type p1, com.google.gson.JsonDeserializationContext p2) throws com.google.gson.JsonParseException {
return this.a(((com.google.gson.JsonElement)(p0)), ((java.lang.reflect.Type)(p1)), ((com.google.gson.JsonDeserializationContext)(p2)));
}


private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
