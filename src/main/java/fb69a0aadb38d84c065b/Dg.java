package moom;


public class Dg {

private static final long a;

private static final long b;

public Dg() {
super();
}


static {
a = ((long)(((moom._a)(moom._c.a(((long)(-7239239542889163943L)), ((long)(-5137554601530617391L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(135155046398223L)))));
    long local0_life6 = (moom.Dg.a ^ 121419844375155L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill517_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill517_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill517_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill517_13 = new byte[8];
    (__sourceSpill517_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill517_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation517_15 = __sourceSpill517_13;
    ((javax.crypto.Cipher)(__sourceSpill517_10)).init(((int)(__sourceSpill517_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill517_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation517_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -5387439175564542415L;
    byte[] __sourceSpill517_19 = new byte[8];
    (__sourceSpill517_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill517_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill517_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill517_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill517_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill517_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill517_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill517_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill517_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill517_20)).doFinal(((byte[])(__sourceSpill517_19)));
    b = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


public static boolean b(com.google.gson.JsonObject p0, java.lang.String p1) {
int forwardValue1733_16_0;
    int forwardValue1733_20_0;
    int forwardValue1733_22_0;
    boolean spill1733_0;
    long life2_3;
    int life4_5;
    forward_join_22: {
    forward_join_21: {
    forward_join_20: {
    forward_join_16: {
    life2_3 = (moom.Dg.a ^ 98898099445188L);
    life4_5 = ((moom.DS.c__Boolean()) ? 1 : 0);
    spill1733_0 = moom.Dg.d(((com.google.gson.JsonObject)(p0)), ((java.lang.String)(p1)));
    if (!((life4_5 != 0))) {
        forwardValue1733_16_0 = ((spill1733_0) ? 1 : 0);
        break forward_join_16;
    }
    if (!(spill1733_0)) {
        break forward_join_21;
    }
    forwardValue1733_16_0 = ((((com.google.gson.JsonPrimitive)(((com.google.gson.JsonObject)(p0)).getAsJsonPrimitive(((java.lang.String)(p1))))).isBoolean()) ? 1 : 0);
    }
    if (!((life4_5 != 0))) {
        forwardValue1733_20_0 = forwardValue1733_16_0;
        break forward_join_20;
    }
    if (!((forwardValue1733_16_0 != 0))) {
        break forward_join_21;
    }
    forwardValue1733_20_0 = 1;
    }
    forwardValue1733_22_0 = forwardValue1733_20_0;
    break forward_join_22;
    }
    forwardValue1733_22_0 = 0;
    }
    return ((forwardValue1733_22_0) != 0);
}


public static boolean e(com.google.gson.JsonObject p0, java.lang.String p1) {
com.google.gson.JsonElement forwardValue1736_13_0;
    int forwardValue1736_17_0;
    com.google.gson.JsonObject spill1736_0;
    long life2_3;
    int life4_5;
    forward_join_17: {
    forward_join_16: {
    forward_join_13: {
    life2_3 = (moom.Dg.a ^ 103486876514445L);
    life4_5 = ((moom.DS.c__Boolean()) ? 1 : 0);
    spill1736_0 = p0;
    if (!((life4_5 != 0))) {
        forwardValue1736_13_0 = spill1736_0;
        break forward_join_13;
    }
    if (!((spill1736_0 != null))) {
        break forward_join_16;
    }
    forwardValue1736_13_0 = ((com.google.gson.JsonObject)(p0)).get(((java.lang.String)(p1)));
    }
    if (!((forwardValue1736_13_0 != null))) {
        break forward_join_16;
    }
    forwardValue1736_17_0 = 1;
    break forward_join_17;
    }
    forwardValue1736_17_0 = 0;
    }
    return ((forwardValue1736_17_0) != 0);
}


public static boolean c(com.google.gson.JsonObject p0, java.lang.String p1) {
int forwardValue1734_16_0;
    int forwardValue1734_20_0;
    int forwardValue1734_22_0;
    boolean spill1734_0;
    long life2_3;
    int life4_5;
    forward_join_22: {
    forward_join_21: {
    forward_join_20: {
    forward_join_16: {
    life2_3 = (moom.Dg.a ^ 100935499618398L);
    life4_5 = ((moom.DS.c__Boolean()) ? 1 : 0);
    spill1734_0 = moom.Dg.e(((com.google.gson.JsonObject)(p0)), ((java.lang.String)(p1)));
    if (!((life4_5 != 0))) {
        forwardValue1734_16_0 = ((spill1734_0) ? 1 : 0);
        break forward_join_16;
    }
    if (!(spill1734_0)) {
        break forward_join_21;
    }
    forwardValue1734_16_0 = ((((com.google.gson.JsonElement)(((com.google.gson.JsonObject)(p0)).get(((java.lang.String)(p1))))).isJsonArray()) ? 1 : 0);
    }
    if (!((life4_5 != 0))) {
        forwardValue1734_20_0 = forwardValue1734_16_0;
        break forward_join_20;
    }
    if (!((forwardValue1734_16_0 != 0))) {
        break forward_join_21;
    }
    forwardValue1734_20_0 = 1;
    }
    forwardValue1734_22_0 = forwardValue1734_20_0;
    break forward_join_22;
    }
    forwardValue1734_22_0 = 0;
    }
    return ((forwardValue1734_22_0) != 0);
}


public static boolean f(com.google.gson.JsonObject p0, java.lang.String p1) {
int forwardValue1737_17_0;
    boolean spill1737_0;
    long life2_3;
    int life4_5;
    forward_join_18: {
    forward_join_17: {
    life2_3 = (moom.Dg.a ^ 93651105962193L);
    life4_5 = ((moom.DS.b__Boolean()) ? 1 : 0);
    spill1737_0 = ((com.google.gson.JsonObject)(p0)).has(((java.lang.String)(p1)));
    if (!((life4_5 == 0))) {
        forwardValue1737_17_0 = ((spill1737_0) ? 1 : 0);
        break forward_join_17;
    }
    if (!(spill1737_0)) {
        break forward_join_18;
    }
    forwardValue1737_17_0 = ((moom.Dg.a__Boolean(((com.google.gson.JsonElement)(((com.google.gson.JsonObject)(p0)).get(((java.lang.String)(p1))))), ((java.lang.String)(p1)))) ? 1 : 0);
    }
    return ((forwardValue1737_17_0) != 0);
    }
    throw new com.google.gson.JsonSyntaxException(__sourceIntrinsic_d07fce7aa6a8_invokedynamic1737_9(p1));
}


public static boolean d(com.google.gson.JsonObject p0, java.lang.String p1) {
int forwardValue1735_16_0;
    int forwardValue1735_20_0;
    int forwardValue1735_22_0;
    boolean spill1735_0;
    long life2_3;
    int life4_5;
    forward_join_22: {
    forward_join_21: {
    forward_join_20: {
    forward_join_16: {
    life2_3 = (moom.Dg.a ^ 78138575698072L);
    life4_5 = ((moom.DS.b__Boolean()) ? 1 : 0);
    spill1735_0 = moom.Dg.e(((com.google.gson.JsonObject)(p0)), ((java.lang.String)(p1)));
    if (!((life4_5 == 0))) {
        forwardValue1735_16_0 = ((spill1735_0) ? 1 : 0);
        break forward_join_16;
    }
    if (!(spill1735_0)) {
        break forward_join_21;
    }
    forwardValue1735_16_0 = ((((com.google.gson.JsonElement)(((com.google.gson.JsonObject)(p0)).get(((java.lang.String)(p1))))).isJsonPrimitive()) ? 1 : 0);
    }
    if (!((life4_5 == 0))) {
        forwardValue1735_20_0 = forwardValue1735_16_0;
        break forward_join_20;
    }
    if (!((forwardValue1735_16_0 != 0))) {
        break forward_join_21;
    }
    forwardValue1735_20_0 = 1;
    }
    forwardValue1735_22_0 = forwardValue1735_20_0;
    break forward_join_22;
    }
    forwardValue1735_22_0 = 0;
    }
    return ((forwardValue1735_22_0) != 0);
}


public static com.google.gson.JsonObject a__JsonObject(com.google.gson.JsonObject p0, java.lang.String p1) {
com.google.gson.JsonElement forwardValue1730_16_0;
    java.lang.String forwardValue1730_16_1;
    com.google.gson.JsonObject spill1730_0;
    java.lang.String spill1730_1;
    long life2_3;
    int life4_5;
    forward_join_18: {
    forward_join_16: {
    life2_3 = (moom.Dg.a ^ 41409713784992L);
    life4_5 = ((moom.DS.b__Boolean()) ? 1 : 0);
    spill1730_0 = p0;
    spill1730_1 = p1;
    if (!((life4_5 == 0))) {
        forwardValue1730_16_0 = spill1730_0;
        forwardValue1730_16_1 = spill1730_1;
        break forward_join_16;
    }
    if (!(((com.google.gson.JsonObject)(spill1730_0)).has(((java.lang.String)(spill1730_1))))) {
        break forward_join_18;
    }
    forwardValue1730_16_0 = ((com.google.gson.JsonObject)(p0)).get(((java.lang.String)(p1)));
    forwardValue1730_16_1 = p1;
    }
    return moom.Dg.a__JsonObject(((com.google.gson.JsonElement)(forwardValue1730_16_0)), ((java.lang.String)(forwardValue1730_16_1)));
    }
    throw new com.google.gson.JsonSyntaxException(__sourceIntrinsic_bac44e373dd4_invokedynamic1730_6(p1));
}


public static com.google.gson.JsonObject a__JsonObject(com.google.gson.JsonElement p0, java.lang.String p1) {
com.google.gson.JsonElement forwardValue1729_12_0;
    com.google.gson.JsonElement spill1729_0;
    long life2_3;
    int life4_5;
    forward_join_14: {
    forward_join_12: {
    life2_3 = (moom.Dg.a ^ 86402272431427L);
    life4_5 = ((moom.DS.b__Boolean()) ? 1 : 0);
    spill1729_0 = p0;
    if (!((life4_5 == 0))) {
        forwardValue1729_12_0 = spill1729_0;
        break forward_join_12;
    }
    if (!(((com.google.gson.JsonElement)(spill1729_0)).isJsonObject())) {
        break forward_join_14;
    }
    forwardValue1729_12_0 = p0;
    }
    return ((com.google.gson.JsonElement)(forwardValue1729_12_0)).getAsJsonObject();
    }
    throw new com.google.gson.JsonSyntaxException(__sourceIntrinsic_ef97ab9e364e_invokedynamic1729_6(p1, moom.Dg.a(((com.google.gson.JsonElement)(p0)))));
}


public static com.google.gson.JsonObject a(com.google.gson.JsonObject p0, java.lang.String p1, com.google.gson.JsonObject p2) {
com.google.gson.JsonElement forwardValue1719_16_0;
    java.lang.String forwardValue1719_16_1;
    com.google.gson.JsonObject forwardValue1719_19_0;
    com.google.gson.JsonObject spill1719_0;
    java.lang.String spill1719_1;
    long life3_3;
    int life5_5;
    forward_join_19: {
    forward_join_18: {
    forward_join_16: {
    life3_3 = (moom.Dg.a ^ 21768054914888L);
    life5_5 = ((moom.DS.b__Boolean()) ? 1 : 0);
    spill1719_0 = p0;
    spill1719_1 = p1;
    if (!((life5_5 == 0))) {
        forwardValue1719_16_0 = spill1719_0;
        forwardValue1719_16_1 = spill1719_1;
        break forward_join_16;
    }
    if (!(((com.google.gson.JsonObject)(spill1719_0)).has(((java.lang.String)(spill1719_1))))) {
        break forward_join_18;
    }
    forwardValue1719_16_0 = ((com.google.gson.JsonObject)(p0)).get(((java.lang.String)(p1)));
    forwardValue1719_16_1 = p1;
    }
    forwardValue1719_19_0 = moom.Dg.a__JsonObject(((com.google.gson.JsonElement)(forwardValue1719_16_0)), ((java.lang.String)(forwardValue1719_16_1)));
    break forward_join_19;
    }
    forwardValue1719_19_0 = p2;
    }
    return forwardValue1719_19_0;
}


public static int a(com.google.gson.JsonObject p0, java.lang.String p1, int p2) {
int forwardValue1717_17_0;
    int forwardValue1717_19_0;
    boolean spill1717_0;
    long life3_3;
    int life5_5;
    forward_join_19: {
    forward_join_18: {
    forward_join_17: {
    life3_3 = (moom.Dg.a ^ 125592441745996L);
    life5_5 = ((moom.DS.c__Boolean()) ? 1 : 0);
    spill1717_0 = ((com.google.gson.JsonObject)(p0)).has(((java.lang.String)(p1)));
    if (!((life5_5 != 0))) {
        forwardValue1717_17_0 = ((spill1717_0) ? 1 : 0);
        break forward_join_17;
    }
    if (!(spill1717_0)) {
        break forward_join_18;
    }
    forwardValue1717_17_0 = moom.Dg.a__Int(((com.google.gson.JsonElement)(((com.google.gson.JsonObject)(p0)).get(((java.lang.String)(p1))))), ((java.lang.String)(p1)));
    }
    forwardValue1717_19_0 = forwardValue1717_17_0;
    break forward_join_19;
    }
    forwardValue1717_19_0 = p2;
    }
    return forwardValue1717_19_0;
}


public static int a__Int(com.google.gson.JsonObject p0, java.lang.String p1) {
int forwardValue1726_17_0;
    boolean spill1726_0;
    long life2_3;
    int life4_5;
    forward_join_18: {
    forward_join_17: {
    life2_3 = (moom.Dg.a ^ 67858542278154L);
    life4_5 = ((moom.DS.c__Boolean()) ? 1 : 0);
    spill1726_0 = ((com.google.gson.JsonObject)(p0)).has(((java.lang.String)(p1)));
    if (!((life4_5 != 0))) {
        forwardValue1726_17_0 = ((spill1726_0) ? 1 : 0);
        break forward_join_17;
    }
    if (!(spill1726_0)) {
        break forward_join_18;
    }
    forwardValue1726_17_0 = moom.Dg.a__Int(((com.google.gson.JsonElement)(((com.google.gson.JsonObject)(p0)).get(((java.lang.String)(p1))))), ((java.lang.String)(p1)));
    }
    return forwardValue1726_17_0;
    }
    throw new com.google.gson.JsonSyntaxException(__sourceIntrinsic_b181ddc976d2_invokedynamic1726_7(p1));
}


private static com.google.gson.JsonSyntaxException a(com.google.gson.JsonSyntaxException p0) {
return p0;
}


public static java.lang.String a(com.google.gson.JsonElement p0) {
com.google.gson.JsonElement forwardValue1713_20_0;
    int forwardValue1713_28_0;
    int forwardValue1713_36_0;
    int forwardValue1713_46_0;
    com.google.gson.JsonElement forwardValue1713_48_0;
    int forwardValue1713_60_0;
    boolean spill1713_0;
    com.google.gson.JsonElement spill1713_1;
    boolean spill1713_2;
    com.google.gson.JsonElement spill1713_3;
    boolean spill1713_4;
    long life1_3;
    java.lang.String life4_11;
    int life3_12;
    com.google.gson.JsonPrimitive life5_72;
    forward_join_64: {
    forward_join_60: {
    forward_join_58: {
    forward_join_48: {
    forward_join_46: {
    forward_join_42: {
    forward_join_36: {
    forward_join_34: {
    forward_join_28: {
    forward_join_26: {
    forward_join_20: {
    forward_join_19: {
    life1_3 = (moom.Dg.a ^ 120648938060344L);
    spill1713_0 = moom.DS.c__Boolean();
    life4_11 = org.apache.commons.lang3.StringUtils.abbreviateMiddle(((java.lang.String)(java.lang.String.valueOf(((java.lang.Object)(p0))))), ((java.lang.String)("...")), ((int)(((int) moom.Dg.b))));
    life3_12 = ((spill1713_0) ? 1 : 0);
    spill1713_1 = p0;
    if (!((life3_12 != 0))) {
        forwardValue1713_20_0 = spill1713_1;
        break forward_join_20;
    }
    if (!((spill1713_1 == null))) {
        break forward_join_19;
    }
    return "null (missing)";
    }
    forwardValue1713_20_0 = p0;
    }
    spill1713_2 = ((com.google.gson.JsonElement)(forwardValue1713_20_0)).isJsonNull();
    if (!((life3_12 != 0))) {
        forwardValue1713_28_0 = ((spill1713_2) ? 1 : 0);
        break forward_join_28;
    }
    if (!(spill1713_2)) {
        break forward_join_26;
    }
    return "null (json)";
    }
    forwardValue1713_28_0 = ((((com.google.gson.JsonElement)(p0)).isJsonArray()) ? 1 : 0);
    }
    if (!((life3_12 != 0))) {
        forwardValue1713_36_0 = forwardValue1713_28_0;
        break forward_join_36;
    }
    if (!((forwardValue1713_28_0 != 0))) {
        break forward_join_34;
    }
    return __sourceIntrinsic_018fb67fce94_invokedynamic1713_10(life4_11);
    }
    forwardValue1713_36_0 = ((((com.google.gson.JsonElement)(p0)).isJsonObject()) ? 1 : 0);
    }
    if (!((life3_12 != 0))) {
        forwardValue1713_46_0 = forwardValue1713_36_0;
        break forward_join_46;
    }
    if (!((forwardValue1713_36_0 != 0))) {
        break forward_join_42;
    }
    return __sourceIntrinsic_018fb67fce94_invokedynamic1713_13(life4_11);
    }
    spill1713_3 = p0;
    if (!((life3_12 != 0))) {
        forwardValue1713_48_0 = spill1713_3;
        break forward_join_48;
    }
    forwardValue1713_46_0 = ((((com.google.gson.JsonElement)(spill1713_3)).isJsonPrimitive()) ? 1 : 0);
    }
    if (!((forwardValue1713_46_0 != 0))) {
        break forward_join_64;
    }
    forwardValue1713_48_0 = p0;
    }
    life5_72 = ((com.google.gson.JsonElement)(forwardValue1713_48_0)).getAsJsonPrimitive();
    spill1713_4 = ((com.google.gson.JsonPrimitive)(life5_72)).isNumber();
    if (!((life3_12 != 0))) {
        forwardValue1713_60_0 = ((spill1713_4) ? 1 : 0);
        break forward_join_60;
    }
    if (!(spill1713_4)) {
        break forward_join_58;
    }
    return __sourceIntrinsic_018fb67fce94_invokedynamic1713_19(life4_11);
    }
    forwardValue1713_60_0 = ((((com.google.gson.JsonPrimitive)(life5_72)).isBoolean()) ? 1 : 0);
    }
    if (!((forwardValue1713_60_0 != 0))) {
        break forward_join_64;
    }
    return __sourceIntrinsic_018fb67fce94_invokedynamic1713_22(life4_11);
    }
    return life4_11;
}


public static com.google.gson.JsonArray a(com.google.gson.JsonObject p0, java.lang.String p1, com.google.gson.JsonArray p2) {
com.google.gson.JsonElement forwardValue1718_16_0;
    java.lang.String forwardValue1718_16_1;
    com.google.gson.JsonArray forwardValue1718_19_0;
    com.google.gson.JsonObject spill1718_0;
    java.lang.String spill1718_1;
    long life3_3;
    int life5_5;
    forward_join_19: {
    forward_join_18: {
    forward_join_16: {
    life3_3 = (moom.Dg.a ^ 74443585146336L);
    life5_5 = ((moom.DS.b__Boolean()) ? 1 : 0);
    spill1718_0 = p0;
    spill1718_1 = p1;
    if (!((life5_5 == 0))) {
        forwardValue1718_16_0 = spill1718_0;
        forwardValue1718_16_1 = spill1718_1;
        break forward_join_16;
    }
    if (!(((com.google.gson.JsonObject)(spill1718_0)).has(((java.lang.String)(spill1718_1))))) {
        break forward_join_18;
    }
    forwardValue1718_16_0 = ((com.google.gson.JsonObject)(p0)).get(((java.lang.String)(p1)));
    forwardValue1718_16_1 = p1;
    }
    forwardValue1718_19_0 = moom.Dg.a__JsonArray(((com.google.gson.JsonElement)(forwardValue1718_16_0)), ((java.lang.String)(forwardValue1718_16_1)));
    break forward_join_19;
    }
    forwardValue1718_19_0 = p2;
    }
    return forwardValue1718_19_0;
}


public static com.google.gson.JsonArray a__JsonArray(com.google.gson.JsonObject p0, java.lang.String p1) {
com.google.gson.JsonElement forwardValue1728_16_0;
    java.lang.String forwardValue1728_16_1;
    com.google.gson.JsonObject spill1728_0;
    java.lang.String spill1728_1;
    long life2_3;
    int life4_5;
    forward_join_18: {
    forward_join_16: {
    life2_3 = (moom.Dg.a ^ 130771593532886L);
    life4_5 = ((moom.DS.b__Boolean()) ? 1 : 0);
    spill1728_0 = p0;
    spill1728_1 = p1;
    if (!((life4_5 == 0))) {
        forwardValue1728_16_0 = spill1728_0;
        forwardValue1728_16_1 = spill1728_1;
        break forward_join_16;
    }
    if (!(((com.google.gson.JsonObject)(spill1728_0)).has(((java.lang.String)(spill1728_1))))) {
        break forward_join_18;
    }
    forwardValue1728_16_0 = ((com.google.gson.JsonObject)(p0)).get(((java.lang.String)(p1)));
    forwardValue1728_16_1 = p1;
    }
    return moom.Dg.a__JsonArray(((com.google.gson.JsonElement)(forwardValue1728_16_0)), ((java.lang.String)(forwardValue1728_16_1)));
    }
    throw new com.google.gson.JsonSyntaxException(__sourceIntrinsic_9205f5f665a8_invokedynamic1728_6(p1));
}


public static com.google.gson.JsonArray a__JsonArray(com.google.gson.JsonElement p0, java.lang.String p1) {
com.google.gson.JsonElement forwardValue1727_12_0;
    com.google.gson.JsonElement spill1727_0;
    long life2_3;
    int life4_5;
    forward_join_14: {
    forward_join_12: {
    life2_3 = (moom.Dg.a ^ 85113824140412L);
    life4_5 = ((moom.DS.b__Boolean()) ? 1 : 0);
    spill1727_0 = p0;
    if (!((life4_5 == 0))) {
        forwardValue1727_12_0 = spill1727_0;
        break forward_join_12;
    }
    if (!(((com.google.gson.JsonElement)(spill1727_0)).isJsonArray())) {
        break forward_join_14;
    }
    forwardValue1727_12_0 = p0;
    }
    return ((com.google.gson.JsonElement)(forwardValue1727_12_0)).getAsJsonArray();
    }
    throw new com.google.gson.JsonSyntaxException(__sourceIntrinsic_b4d3978cba78_invokedynamic1727_6(p1, moom.Dg.a(((com.google.gson.JsonElement)(p0)))));
}


public static boolean a__Boolean(com.google.gson.JsonElement p0, java.lang.String p1) {
int forwardValue1723_13_0;
    boolean spill1723_0;
    long life2_3;
    int life4_5;
    forward_join_14: {
    forward_join_13: {
    life2_3 = (moom.Dg.a ^ 132041496162950L);
    life4_5 = ((moom.DS.b__Boolean()) ? 1 : 0);
    spill1723_0 = ((com.google.gson.JsonElement)(p0)).isJsonPrimitive();
    if (!((life4_5 == 0))) {
        forwardValue1723_13_0 = ((spill1723_0) ? 1 : 0);
        break forward_join_13;
    }
    if (!(spill1723_0)) {
        break forward_join_14;
    }
    forwardValue1723_13_0 = ((((com.google.gson.JsonElement)(p0)).getAsBoolean()) ? 1 : 0);
    }
    return ((forwardValue1723_13_0) != 0);
    }
    throw new com.google.gson.JsonSyntaxException(__sourceIntrinsic_ad3b4f040b54_invokedynamic1723_9(p1, moom.Dg.a(((com.google.gson.JsonElement)(p0)))));
}


public static java.lang.String a(com.google.gson.JsonObject p0, java.lang.String p1, java.lang.String p2) {
com.google.gson.JsonElement forwardValue1720_16_0;
    java.lang.String forwardValue1720_16_1;
    java.lang.String forwardValue1720_19_0;
    com.google.gson.JsonObject spill1720_0;
    java.lang.String spill1720_1;
    long life3_3;
    int life5_5;
    forward_join_19: {
    forward_join_18: {
    forward_join_16: {
    life3_3 = (moom.Dg.a ^ 77824359859837L);
    life5_5 = ((moom.DS.c__Boolean()) ? 1 : 0);
    spill1720_0 = p0;
    spill1720_1 = p1;
    if (!((life5_5 != 0))) {
        forwardValue1720_16_0 = spill1720_0;
        forwardValue1720_16_1 = spill1720_1;
        break forward_join_16;
    }
    if (!(((com.google.gson.JsonObject)(spill1720_0)).has(((java.lang.String)(spill1720_1))))) {
        break forward_join_18;
    }
    forwardValue1720_16_0 = ((com.google.gson.JsonObject)(p0)).get(((java.lang.String)(p1)));
    forwardValue1720_16_1 = p1;
    }
    forwardValue1720_19_0 = moom.Dg.a__String(((com.google.gson.JsonElement)(forwardValue1720_16_0)), ((java.lang.String)(forwardValue1720_16_1)));
    break forward_join_19;
    }
    forwardValue1720_19_0 = p2;
    }
    return forwardValue1720_19_0;
}


public static java.lang.String a__String(com.google.gson.JsonObject p0, java.lang.String p1) {
com.google.gson.JsonElement forwardValue1732_16_0;
    java.lang.String forwardValue1732_16_1;
    com.google.gson.JsonObject spill1732_0;
    java.lang.String spill1732_1;
    long life2_3;
    int life4_5;
    forward_join_18: {
    forward_join_16: {
    life2_3 = (moom.Dg.a ^ 138268210033786L);
    life4_5 = ((moom.DS.c__Boolean()) ? 1 : 0);
    spill1732_0 = p0;
    spill1732_1 = p1;
    if (!((life4_5 != 0))) {
        forwardValue1732_16_0 = spill1732_0;
        forwardValue1732_16_1 = spill1732_1;
        break forward_join_16;
    }
    if (!(((com.google.gson.JsonObject)(spill1732_0)).has(((java.lang.String)(spill1732_1))))) {
        break forward_join_18;
    }
    forwardValue1732_16_0 = ((com.google.gson.JsonObject)(p0)).get(((java.lang.String)(p1)));
    forwardValue1732_16_1 = p1;
    }
    return moom.Dg.a__String(((com.google.gson.JsonElement)(forwardValue1732_16_0)), ((java.lang.String)(forwardValue1732_16_1)));
    }
    throw new com.google.gson.JsonSyntaxException(__sourceIntrinsic_420e2554ce76_invokedynamic1732_6(p1));
}


public static java.lang.String a__String(com.google.gson.JsonElement p0, java.lang.String p1) {
com.google.gson.JsonElement forwardValue1731_12_0;
    com.google.gson.JsonElement spill1731_0;
    long life2_3;
    int life4_5;
    forward_join_14: {
    forward_join_12: {
    life2_3 = (moom.Dg.a ^ 96383913015588L);
    life4_5 = ((moom.DS.c__Boolean()) ? 1 : 0);
    spill1731_0 = p0;
    if (!((life4_5 != 0))) {
        forwardValue1731_12_0 = spill1731_0;
        break forward_join_12;
    }
    if (!(((com.google.gson.JsonElement)(spill1731_0)).isJsonPrimitive())) {
        break forward_join_14;
    }
    forwardValue1731_12_0 = p0;
    }
    return ((com.google.gson.JsonElement)(forwardValue1731_12_0)).getAsString();
    }
    throw new com.google.gson.JsonSyntaxException(__sourceIntrinsic_44c2df07d00e_invokedynamic1731_6(p1, moom.Dg.a(((com.google.gson.JsonElement)(p0)))));
}


public static boolean a__Boolean(com.google.gson.JsonElement p0) {
int forwardValue1722_14_0;
    int forwardValue1722_18_0;
    int forwardValue1722_20_0;
    boolean spill1722_0;
    long life1_3;
    int life3_5;
    forward_join_20: {
    forward_join_19: {
    forward_join_18: {
    forward_join_14: {
    life1_3 = (moom.Dg.a ^ 33136226412270L);
    life3_5 = ((moom.DS.c__Boolean()) ? 1 : 0);
    spill1722_0 = ((com.google.gson.JsonElement)(p0)).isJsonPrimitive();
    if (!((life3_5 != 0))) {
        forwardValue1722_14_0 = ((spill1722_0) ? 1 : 0);
        break forward_join_14;
    }
    if (!(spill1722_0)) {
        break forward_join_19;
    }
    forwardValue1722_14_0 = ((((com.google.gson.JsonPrimitive)(((com.google.gson.JsonElement)(p0)).getAsJsonPrimitive())).isString()) ? 1 : 0);
    }
    if (!((life3_5 != 0))) {
        forwardValue1722_18_0 = forwardValue1722_14_0;
        break forward_join_18;
    }
    if (!((forwardValue1722_14_0 != 0))) {
        break forward_join_19;
    }
    forwardValue1722_18_0 = 1;
    }
    forwardValue1722_20_0 = forwardValue1722_18_0;
    break forward_join_20;
    }
    forwardValue1722_20_0 = 0;
    }
    return ((forwardValue1722_20_0) != 0);
}


public static boolean a__Boolean(com.google.gson.JsonObject p0, java.lang.String p1) {
int forwardValue1724_16_0;
    int forwardValue1724_20_0;
    int forwardValue1724_22_0;
    boolean spill1724_0;
    long life2_3;
    int life4_5;
    forward_join_22: {
    forward_join_21: {
    forward_join_20: {
    forward_join_16: {
    life2_3 = (moom.Dg.a ^ 28464977347446L);
    life4_5 = ((moom.DS.c__Boolean()) ? 1 : 0);
    spill1724_0 = moom.Dg.d(((com.google.gson.JsonObject)(p0)), ((java.lang.String)(p1)));
    if (!((life4_5 != 0))) {
        forwardValue1724_16_0 = ((spill1724_0) ? 1 : 0);
        break forward_join_16;
    }
    if (!(spill1724_0)) {
        break forward_join_21;
    }
    forwardValue1724_16_0 = ((((com.google.gson.JsonPrimitive)(((com.google.gson.JsonObject)(p0)).getAsJsonPrimitive(((java.lang.String)(p1))))).isString()) ? 1 : 0);
    }
    if (!((life4_5 != 0))) {
        forwardValue1724_20_0 = forwardValue1724_16_0;
        break forward_join_20;
    }
    if (!((forwardValue1724_16_0 != 0))) {
        break forward_join_21;
    }
    forwardValue1724_20_0 = 1;
    }
    forwardValue1724_22_0 = forwardValue1724_20_0;
    break forward_join_22;
    }
    forwardValue1724_22_0 = 0;
    }
    return ((forwardValue1724_22_0) != 0);
}


public static int a__Int(com.google.gson.JsonElement p0, java.lang.String p1) {
int forwardValue1725_14_0;
    int forwardValue1725_19_0;
    boolean spill1725_0;
    long life2_3;
    int life4_5;
    forward_join_20: {
    forward_join_19: {
    forward_join_14: {
    life2_3 = (moom.Dg.a ^ 136960062502306L);
    life4_5 = ((moom.DS.c__Boolean()) ? 1 : 0);
    spill1725_0 = ((com.google.gson.JsonElement)(p0)).isJsonPrimitive();
    if (!((life4_5 != 0))) {
        forwardValue1725_14_0 = ((spill1725_0) ? 1 : 0);
        break forward_join_14;
    }
    if (!(spill1725_0)) {
        break forward_join_20;
    }
    forwardValue1725_14_0 = ((((com.google.gson.JsonPrimitive)(((com.google.gson.JsonElement)(p0)).getAsJsonPrimitive())).isNumber()) ? 1 : 0);
    }
    if (!((life4_5 != 0))) {
        forwardValue1725_19_0 = forwardValue1725_14_0;
        break forward_join_19;
    }
    if (!((forwardValue1725_14_0 != 0))) {
        break forward_join_20;
    }
    forwardValue1725_19_0 = ((com.google.gson.JsonElement)(p0)).getAsInt();
    }
    return forwardValue1725_19_0;
    }
    throw new com.google.gson.JsonSyntaxException(__sourceIntrinsic_ead5884bf473_invokedynamic1725_10(p1, moom.Dg.a(((com.google.gson.JsonElement)(p0)))));
}


public static float a(com.google.gson.JsonObject p0, java.lang.String p1, float p2) {
com.google.gson.JsonElement forwardValue1716_16_0;
    java.lang.String forwardValue1716_16_1;
    float forwardValue1716_19_0;
    com.google.gson.JsonObject spill1716_0;
    java.lang.String spill1716_1;
    long life3_3;
    int life5_5;
    forward_join_19: {
    forward_join_18: {
    forward_join_16: {
    life3_3 = (moom.Dg.a ^ 107305173497103L);
    life5_5 = ((moom.DS.b__Boolean()) ? 1 : 0);
    spill1716_0 = p0;
    spill1716_1 = p1;
    if (!((life5_5 == 0))) {
        forwardValue1716_16_0 = spill1716_0;
        forwardValue1716_16_1 = spill1716_1;
        break forward_join_16;
    }
    if (!(((com.google.gson.JsonObject)(spill1716_0)).has(((java.lang.String)(spill1716_1))))) {
        break forward_join_18;
    }
    forwardValue1716_16_0 = ((com.google.gson.JsonObject)(p0)).get(((java.lang.String)(p1)));
    forwardValue1716_16_1 = p1;
    }
    forwardValue1716_19_0 = moom.Dg.a(((com.google.gson.JsonElement)(forwardValue1716_16_0)), ((java.lang.String)(forwardValue1716_16_1)));
    break forward_join_19;
    }
    forwardValue1716_19_0 = p2;
    }
    return forwardValue1716_19_0;
}


public static float a(com.google.gson.JsonObject p0, java.lang.String p1) {
com.google.gson.JsonElement forwardValue1715_16_0;
    java.lang.String forwardValue1715_16_1;
    com.google.gson.JsonObject spill1715_0;
    java.lang.String spill1715_1;
    long life2_3;
    int life4_5;
    forward_join_18: {
    forward_join_16: {
    life2_3 = (moom.Dg.a ^ 67554951509121L);
    life4_5 = ((moom.DS.b__Boolean()) ? 1 : 0);
    spill1715_0 = p0;
    spill1715_1 = p1;
    if (!((life4_5 == 0))) {
        forwardValue1715_16_0 = spill1715_0;
        forwardValue1715_16_1 = spill1715_1;
        break forward_join_16;
    }
    if (!(((com.google.gson.JsonObject)(spill1715_0)).has(((java.lang.String)(spill1715_1))))) {
        break forward_join_18;
    }
    forwardValue1715_16_0 = ((com.google.gson.JsonObject)(p0)).get(((java.lang.String)(p1)));
    forwardValue1715_16_1 = p1;
    }
    return moom.Dg.a(((com.google.gson.JsonElement)(forwardValue1715_16_0)), ((java.lang.String)(forwardValue1715_16_1)));
    }
    throw new com.google.gson.JsonSyntaxException(__sourceIntrinsic_f47be6126099_invokedynamic1715_6(p1));
}


public static float a(com.google.gson.JsonElement p0, java.lang.String p1) {
int forwardValue1714_16_0;
    com.google.gson.JsonElement forwardValue1714_18_0;
    boolean spill1714_0;
    com.google.gson.JsonPrimitive spill1714_1;
    long life2_3;
    int life4_5;
    forward_join_20: {
    forward_join_18: {
    forward_join_16: {
    life2_3 = (moom.Dg.a ^ 138446801670698L);
    life4_5 = ((moom.DS.c__Boolean()) ? 1 : 0);
    spill1714_0 = ((com.google.gson.JsonElement)(p0)).isJsonPrimitive();
    if (!((life4_5 != 0))) {
        forwardValue1714_16_0 = ((spill1714_0) ? 1 : 0);
        break forward_join_16;
    }
    if (!(spill1714_0)) {
        break forward_join_20;
    }
    spill1714_1 = ((com.google.gson.JsonElement)(p0)).getAsJsonPrimitive();
    if (!((life4_5 != 0))) {
        forwardValue1714_18_0 = spill1714_1;
        break forward_join_18;
    }
    forwardValue1714_16_0 = ((((com.google.gson.JsonPrimitive)(spill1714_1)).isNumber()) ? 1 : 0);
    }
    if (!((forwardValue1714_16_0 != 0))) {
        break forward_join_20;
    }
    forwardValue1714_18_0 = p0;
    }
    return ((com.google.gson.JsonElement)(forwardValue1714_18_0)).getAsFloat();
    }
    throw new com.google.gson.JsonSyntaxException(__sourceIntrinsic_7f325afb69ad_invokedynamic1714_10(p1, moom.Dg.a(((com.google.gson.JsonElement)(p0)))));
}


public static boolean a(com.google.gson.JsonObject p0, java.lang.String p1, boolean p2) {
int forwardValue1721_17_0;
    int forwardValue1721_19_0;
    boolean spill1721_0;
    long life3_3;
    int life5_5;
    forward_join_19: {
    forward_join_18: {
    forward_join_17: {
    life3_3 = (moom.Dg.a ^ 139160414159874L);
    life5_5 = ((moom.DS.b__Boolean()) ? 1 : 0);
    spill1721_0 = ((com.google.gson.JsonObject)(p0)).has(((java.lang.String)(p1)));
    if (!((life5_5 == 0))) {
        forwardValue1721_17_0 = ((spill1721_0) ? 1 : 0);
        break forward_join_17;
    }
    if (!(spill1721_0)) {
        break forward_join_18;
    }
    forwardValue1721_17_0 = ((moom.Dg.a__Boolean(((com.google.gson.JsonElement)(((com.google.gson.JsonObject)(p0)).get(((java.lang.String)(p1))))), ((java.lang.String)(p1)))) ? 1 : 0);
    }
    forwardValue1721_19_0 = forwardValue1721_17_0;
    break forward_join_19;
    }
    forwardValue1721_19_0 = ((p2) ? 1 : 0);
    }
    return ((forwardValue1721_19_0) != 0);
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_d07fce7aa6a8_invokedynamic1737_9(java.lang.String a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_bac44e373dd4_invokedynamic1730_6(java.lang.String a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ef97ab9e364e_invokedynamic1729_6(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b181ddc976d2_invokedynamic1726_7(java.lang.String a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_018fb67fce94_invokedynamic1713_10(java.lang.String a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_018fb67fce94_invokedynamic1713_13(java.lang.String a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_018fb67fce94_invokedynamic1713_19(java.lang.String a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_018fb67fce94_invokedynamic1713_22(java.lang.String a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9205f5f665a8_invokedynamic1728_6(java.lang.String a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b4d3978cba78_invokedynamic1727_6(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ad3b4f040b54_invokedynamic1723_9(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_420e2554ce76_invokedynamic1732_6(java.lang.String a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_44c2df07d00e_invokedynamic1731_6(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ead5884bf473_invokedynamic1725_10(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_f47be6126099_invokedynamic1715_6(java.lang.String a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_7f325afb69ad_invokedynamic1714_10(java.lang.String a0, java.lang.String a1) throws E;
}
