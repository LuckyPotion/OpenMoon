package moom;


public class fJ {

private static com.google.common.base.Joiner a;

private java.util.List<java.lang.String[]> b;

private java.util.Map<java.lang.Character, com.google.common.base.Predicate<moom.fD>> c;

private int d;

private int e;

private static long f;

private static long g;

private fJ() { super(); }


private static void __sourceConstructorBody_c89b159196a06812(moom.fJ receiver) throws Throwable {

long local1 = (moom.fJ.f ^ 47002889437608L);

    moom.fJ.__sourceConstructorInit_c89b159196a06812_0(((moom.fJ)(receiver)));

    ((moom.fJ)(receiver)).b = ((java.util.List)(com.google.common.collect.Lists.newArrayList()));

    ((moom.fJ)(receiver)).c = ((java.util.Map)(com.google.common.collect.Maps.newHashMap()));

    ((java.util.Map)(((moom.fJ)(receiver)).c)).put(((java.lang.Object)(java.lang.Character.valueOf(((char)(((int) moom.fJ.g)))))), ((java.lang.Object)(com.google.common.base.Predicates.alwaysTrue())));

    return;

}



static {
f = ((long)(((moom._a)(moom._c.a(((long)(-7016254440025273820L)), ((long)(5164595289110352397L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(8572088155116L)))));
    long local0_life6 = (moom.fJ.f ^ 50902744363733L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill837_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill837_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill837_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill837_13 = new byte[8];
    (__sourceSpill837_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill837_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation837_15 = __sourceSpill837_13;
    ((javax.crypto.Cipher)(__sourceSpill837_10)).init(((int)(__sourceSpill837_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill837_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation837_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -690234174927429040L;
    byte[] __sourceSpill837_19 = new byte[8];
    (__sourceSpill837_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill837_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill837_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill837_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill837_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill837_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill837_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill837_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill837_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill837_20)).doFinal(((byte[])(__sourceSpill837_19)));
    g = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
    a = ((com.google.common.base.Joiner)(com.google.common.base.Joiner.on(((java.lang.String)(",")))));
}

private static native <E extends Throwable> void __sourceConstructorInit_c89b159196a06812_0(moom.fJ a0) throws E;

private static java.lang.IllegalArgumentException a(java.lang.IllegalArgumentException p0) {
return p0;
}


private void a__Void() {
int[] spill1169_0;
    long life1_3;
    java.util.ArrayList life4_6;
    int[] life3_7;
    java.util.Iterator life5_12;
    java.util.Map.Entry life6_19;
    lexical_join_44: {
    lexical_join_33: {
    life1_3 = (moom.fJ.f ^ 119490908239971L);
    spill1169_0 = moom.fG.b__ArrayInt();
    life4_6 = com.google.common.collect.Lists.newArrayList();
    life3_7 = spill1169_0;
    life5_12 = ((java.util.Set)(((java.util.Map)(this.c)).entrySet())).iterator();
    lexical_cycle_13: while (true) {
    lexical_join_31: {
    if (!(((java.util.Iterator)(life5_12)).hasNext())) {
        break lexical_join_33;
    }
    life6_19 = ((java.util.Map.Entry)(((java.util.Iterator)(life5_12)).next()));
    if (!((life3_7 == null))) {
        break lexical_join_44;
    }
    if (!((((java.util.Map.Entry)(life6_19)).getValue() == null))) {
        break lexical_join_31;
    }
    ((java.util.List)(life4_6)).add(((java.lang.Object)(((java.lang.Character)(((java.util.Map.Entry)(life6_19)).getKey())))));
    }
    if (!((life3_7 != null))) { continue lexical_cycle_13; }
    break lexical_cycle_13;
    }
    }
    if (!((!((java.util.List)(life4_6)).isEmpty()))) {
        break lexical_join_44;
    }
    throw new java.lang.IllegalStateException(__sourceIntrinsic_b82a5b29b709_invokedynamic1169_16(((com.google.common.base.Joiner)(moom.fJ.a)).join(((java.lang.Iterable)(life4_6)))));
    }
    return;
}


private com.google.common.base.Predicate<moom.fD>[][][] a__ArrayArrayArrayPredicate() {
int forestValue838_33_0;
    int[] spill838_0;
    java.lang.Object spill838_1;
    int[] spill838_2;
    int[] spill838_3;
    int[] spill838_4;
    int spill838_5;
    long life1_3;
    com.google.common.base.Predicate[][][] life4_28;
    int[] life3_29;
    int life5_31;
    int life6_38;
    int life7_46;
    forest_join_83: {
    life1_3 = (moom.fJ.f ^ 48069990119639L);
    spill838_0 = moom.fG.b__ArrayInt();
    ((moom.fJ)(this)).a__Void();
    spill838_1 = com.google.common.base.Predicate.class;
    int[] __stackOp838_4_0 = new int[3];
    spill838_2 = __stackOp838_4_0;
    (__stackOp838_4_0)[0] = ((java.util.List)(this.b)).size();
    int[] __stackOp838_7_0 = spill838_2;
    spill838_3 = __stackOp838_7_0;
    (__stackOp838_7_0)[1] = this.d;
    int[] __stackOp838_9_0 = spill838_3;
    spill838_4 = __stackOp838_9_0;
    (__stackOp838_9_0)[2] = this.e;
    life4_28 = ((com.google.common.base.Predicate[][][])(java.lang.reflect.Array.newInstance(((java.lang.Class)(spill838_1)), ((int[])(spill838_4)))));
    life3_29 = spill838_0;
    life5_31 = 0;
    forest_cycle_32: while (true) {
    forest_join_80: {
    forestValue838_33_0 = life5_31;
    forest_cycle_33: while (true) {
    if (!((forestValue838_33_0 < ((java.util.List)(this.b)).size()))) {
        break forest_join_83;
    }
    life6_38 = 0;
    forest_cycle_39: while (true) {
    forest_join_78: {
    forest_join_77: {
    if (!((life6_38 < this.d))) {
        break forest_join_80;
    }
    spill838_5 = 0;
    if (!((life3_29 == null))) {
        forestValue838_33_0 = spill838_5;
        continue forest_cycle_33;
    }
    life7_46 = spill838_5;
    forest_cycle_47: while (true) {
    if (!((life7_46 < this.e))) {
        break forest_join_77;
    }
    (((life4_28)[life5_31])[life6_38])[life7_46] = ((com.google.common.base.Predicate)(((java.util.Map)(this.c)).get(((java.lang.Object)(java.lang.Character.valueOf(((char)(((java.lang.String)((((java.lang.String[])(((java.util.List)(this.b)).get(((int)(life5_31))))))[life6_38])).charAt(((int)(life7_46)))))))))));
    life7_46 += 1;
    if (!((life3_29 == null))) {
        break forest_join_78;
    }
    if (!((life3_29 != null))) {
        continue forest_cycle_47;
    }
    break forest_cycle_47;
    }
    }
    life6_38 += 1;
    }
    if (!((life3_29 != null))) {
        continue forest_cycle_39;
    }
    break forest_cycle_39;
    }
    break forest_cycle_33;
    }
    }
    life5_31 += 1;
    if (!((life3_29 != null))) {
        continue forest_cycle_32;
    }
    break forest_cycle_32;
    }
    }
    return life4_28;
}


public moom.fJ a(java.lang.String[] p0) {
int forestValue430_15_0;
    int forestValue430_21_0;
    int forestValue430_38_0;
    java.lang.String[] forestValue430_51_0;
    int forestValue430_58_0;
    java.lang.String forestValue430_75_0;
    int forestValue430_126_0;
    moom.fJ forestValue430_133_0;
    boolean spill430_0;
    java.lang.String[] spill430_1;
    java.lang.String spill430_2;
    int spill430_3;
    boolean spill430_4;
    moom.fJ spill430_5;
    long life2_3;
    int[] life4_5;
    java.lang.String[] life5_58;
    int life6_61;
    int life7_63;
    java.lang.String life8_70;
    char[] life9_84;
    int life10_87;
    int life11_89;
    int life12_96;
    forest_join_134: {
    forest_join_133: {
    forest_join_126: {
    forest_join_122: {
    forest_join_113: {
    forest_join_51: {
    forest_join_50: {
    forest_join_38: {
    forest_join_34: {
    forest_join_21: {
    forest_join_15: {
    life2_3 = (moom.fJ.f ^ 124084149808578L);
    life4_5 = moom.fG.b__ArrayInt();
    spill430_0 = org.apache.commons.lang3.ArrayUtils.isEmpty(((java.lang.Object[])(p0)));
    if (!((life4_5 == null))) {
        forestValue430_15_0 = ((spill430_0) ? 1 : 0);
        break forest_join_15;
    }
    if (!((!spill430_0))) {
        break forest_join_134;
    }
    forestValue430_15_0 = ((org.apache.commons.lang3.StringUtils.isEmpty(((java.lang.CharSequence)((p0)[0])))) ? 1 : 0);
    }
    if (!((life4_5 == null))) {
        forestValue430_21_0 = forestValue430_15_0;
        break forest_join_21;
    }
    if (!((forestValue430_15_0 == 0))) {
        break forest_join_134;
    }
    forestValue430_21_0 = ((((java.util.List)(this.b)).isEmpty()) ? 1 : 0);
    }
    if (!((life4_5 == null))) {
        forestValue430_38_0 = forestValue430_21_0;
        break forest_join_38;
    }
    if (!((forestValue430_21_0 != 0))) {
        break forest_join_34;
    }
    this.d = ((int)((p0).length));
    this.e = ((int)(((java.lang.String)((p0)[0])).length()));
    }
    spill430_1 = p0;
    if (!((life4_5 == null))) {
        forestValue430_51_0 = spill430_1;
        break forest_join_51;
    }
    forestValue430_38_0 = (spill430_1).length;
    }
    if (!((forestValue430_38_0 != this.d))) {
        break forest_join_50;
    }
    throw new java.lang.IllegalArgumentException(__sourceIntrinsic_f029add002d5_invokedynamic430_14(this.d, (p0).length));
    }
    forestValue430_51_0 = p0;
    }
    life5_58 = forestValue430_51_0;
    life6_61 = (life5_58).length;
    life7_63 = 0;
    forest_cycle_57: while (true) {
    forest_join_109: {
    forestValue430_58_0 = life7_63;
    forest_cycle_58: while (true) {
    forest_join_75: {
    forest_join_74: {
    if (!((forestValue430_58_0 < life6_61))) {
        break forest_join_122;
    }
    life8_70 = (life5_58)[life7_63];
    spill430_2 = life8_70;
    if (!((life4_5 == null))) {
        forestValue430_75_0 = spill430_2;
        break forest_join_75;
    }
    spill430_3 = ((java.lang.String)(spill430_2)).length();
    if (!((life4_5 == null))) {
        forestValue430_126_0 = spill430_3;
        break forest_join_126;
    }
    if (!((spill430_3 != this.e))) {
        break forest_join_74;
    }
    break forest_join_113;
    }
    forestValue430_75_0 = life8_70;
    }
    life9_84 = ((java.lang.String)(forestValue430_75_0)).toCharArray();
    life10_87 = (life9_84).length;
    life11_89 = 0;
    forest_cycle_82: while (true) {
    forest_join_107: {
    forest_join_106: {
    if (!((life11_89 < life10_87))) {
        break forest_join_109;
    }
    life12_96 = ((int)((life9_84)[life11_89]));
    if (!((life4_5 == null))) {
        break forest_join_107;
    }
    spill430_4 = ((java.util.Map)(this.c)).containsKey(((java.lang.Object)(java.lang.Character.valueOf(((char)(life12_96))))));
    if (!((life4_5 == null))) {
        forestValue430_58_0 = ((spill430_4) ? 1 : 0);
        continue forest_cycle_58;
    }
    if (!((!spill430_4))) {
        break forest_join_106;
    }
    ((java.util.Map)(this.c)).put(((java.lang.Object)(java.lang.Character.valueOf(((char)(life12_96))))), ((java.lang.Object)(null)));
    }
    life11_89 += 1;
    }
    if (!((life4_5 != null))) {
        continue forest_cycle_82;
    }
    break forest_cycle_82;
    }
    break forest_cycle_58;
    }
    }
    life7_63 += 1;
    if (!((life4_5 != null))) {
        continue forest_cycle_57;
    }
    break forest_cycle_57;
    }
    break forest_join_122;
    }
    throw new java.lang.IllegalArgumentException(__sourceIntrinsic_f029add002d5_invokedynamic430_28(this.e, ((java.lang.String)(life8_70)).length()));
    }
    forestValue430_126_0 = ((((java.util.List)(this.b)).add(((java.lang.Object)(p0)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forestValue430_126_0);
    spill430_5 = this;
    if (!((net.minecraft.entity.Entity.b__ArrayString() != null))) {
        forestValue430_133_0 = spill430_5;
        break forest_join_133;
    }
    moom.fG.b(((int[])(new int[5])));
    forestValue430_133_0 = spill430_5;
    }
    return forestValue430_133_0;
    }
    throw new java.lang.IllegalArgumentException("Empty pattern for aisle");
}


public static moom.fJ a__fJ() {
return new moom.fJ();
}


public moom.fJ a(char p0, com.google.common.base.Predicate<moom.fD> p1) {
((java.util.Map)(this.c)).put(((java.lang.Object)(java.lang.Character.valueOf(((char)(p0))))), ((java.lang.Object)(p1)));
    return this;
}


public moom.fG a() {
return new moom.fG(((moom.fJ)(this)).a__ArrayArrayArrayPredicate());
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_f029add002d5_invokedynamic430_14(int a0, int a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_f029add002d5_invokedynamic430_28(int a0, int a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b82a5b29b709_invokedynamic1169_16(java.lang.String a0) throws E;
}
