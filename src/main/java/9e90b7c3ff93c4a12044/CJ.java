package moom;


public abstract class CJ implements net.minecraft.util.IChatComponent {

protected java.util.List<net.minecraft.util.IChatComponent> a;

private moom.CO b;

private static boolean c;

private static final long j;

private static final long l;

public CJ() {
super();
    this.a = com.google.common.collect.Lists.newArrayList();
}


static {
j = ((long)(((moom._a)(moom._c.a(((long)(2641176501956732877L)), ((long)(-8341317024190954251L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(275610880823029L)))));
    int __sourceSpill501_6 = 1;
    long local0_life7 = (moom.CJ.j ^ 124650243430193L);
    moom.CJ.b(((boolean)__sourceIntrinsic_integerToBoolean((__sourceSpill501_6))));
    javax.crypto.Cipher local2_life10;
    javax.crypto.Cipher __sourceSpill501_12 = (local2_life10 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill501_13 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill501_14 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill501_15 = new byte[8];
    (__sourceSpill501_15)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life16 = 1;
    while ((local3_life16 < 8)) {
        (__sourceSpill501_15)[local3_life16] = ((byte) ((int) ((local0_life7 << (local3_life16 * 8)) >>> 56)));
        local3_life16 += 1;
    }
    byte[] __sourcePreallocation501_17 = __sourceSpill501_15;
    ((javax.crypto.Cipher)(__sourceSpill501_12)).init(((int)(__sourceSpill501_13)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill501_14)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation501_17)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life20 = -3401073635077494102L;
    byte[] __sourceSpill501_21 = new byte[8];
    (__sourceSpill501_21)[0] = ((byte) ((int) (local4_life20 >>> 56)));
    (__sourceSpill501_21)[1] = ((byte) ((int) (local4_life20 >>> 48)));
    (__sourceSpill501_21)[2] = ((byte) ((int) (local4_life20 >>> 40)));
    (__sourceSpill501_21)[3] = ((byte) ((int) (local4_life20 >>> 32)));
    (__sourceSpill501_21)[4] = ((byte) ((int) (local4_life20 >>> 24)));
    (__sourceSpill501_21)[5] = ((byte) ((int) (local4_life20 >>> 16)));
    (__sourceSpill501_21)[6] = ((byte) ((int) (local4_life20 >>> 8)));
    (__sourceSpill501_21)[7] = ((byte) ((int) local4_life20));
    javax.crypto.Cipher __sourceSpill501_22 = local2_life10;
    byte[] local6_life24 = ((javax.crypto.Cipher)(__sourceSpill501_22)).doFinal(((byte[])(__sourceSpill501_21)));
    l = ((long)((((((((((((long) (local6_life24)[0]) & 255L) << 56) | ((((long) (local6_life24)[1]) & 255L) << 48)) | ((((long) (local6_life24)[2]) & 255L) << 40)) | ((((long) (local6_life24)[3]) & 255L) << 32)) | ((((long) (local6_life24)[4]) & 255L) << 24)) | ((((long) (local6_life24)[5]) & 255L) << 16)) | ((((long) (local6_life24)[6]) & 255L) << 8)) | (((long) (local6_life24)[7]) & 255L))));
}


public boolean equals(java.lang.Object p0) {
java.lang.Object forwardValue1586_14_0;
    int forwardValue1586_24_0;
    int forwardValue1586_38_0;
    int forwardValue1586_42_0;
    int forwardValue1586_44_0;
    moom.CJ spill1586_0;
    int spill1586_1;
    boolean spill1586_2;
    long life2_3;
    int life4_5;
    moom.CJ life5_28;
    forward_join_44: {
    forward_join_43: {
    forward_join_42: {
    forward_join_38: {
    forward_join_25: {
    forward_join_24: {
    forward_join_23: {
    forward_join_14: {
    forward_join_13: {
    life2_3 = (moom.CJ.j ^ 129127529884508L);
    life4_5 = ((moom.DS.b__Boolean()) ? 1 : 0);
    spill1586_0 = this;
    if (!((life4_5 == 0))) {
        forwardValue1586_14_0 = spill1586_0;
        break forward_join_14;
    }
    if (!((spill1586_0 == p0))) {
        break forward_join_13;
    }
    return ((1) != 0);
    }
    forwardValue1586_14_0 = p0;
    }
    spill1586_1 = ((forwardValue1586_14_0 instanceof moom.CJ) ? 1 : 0);
    if (!((life4_5 == 0))) {
        forwardValue1586_24_0 = spill1586_1;
        break forward_join_24;
    }
    if (!((spill1586_1 != 0))) {
        break forward_join_23;
    }
    life5_28 = ((moom.CJ)(p0));
    if (!((life4_5 != 0))) {
        break forward_join_25;
    }
    }
    forwardValue1586_24_0 = 0;
    }
    return ((forwardValue1586_24_0) != 0);
    }
    spill1586_2 = ((java.util.List)(this.a)).equals(((java.lang.Object)(((moom.CJ)(life5_28)).a)));
    if (!((life4_5 == 0))) {
        forwardValue1586_38_0 = ((spill1586_2) ? 1 : 0);
        break forward_join_38;
    }
    if (!(spill1586_2)) {
        break forward_join_43;
    }
    forwardValue1586_38_0 = ((((moom.CO)(((moom.CJ)(this)).a__CO())).equals(((java.lang.Object)(((moom.CJ)(life5_28)).a__CO())))) ? 1 : 0);
    }
    if (!((life4_5 == 0))) {
        forwardValue1586_42_0 = forwardValue1586_38_0;
        break forward_join_42;
    }
    if (!((forwardValue1586_38_0 != 0))) {
        break forward_join_43;
    }
    forwardValue1586_42_0 = 1;
    }
    forwardValue1586_44_0 = forwardValue1586_42_0;
    break forward_join_44;
    }
    forwardValue1586_44_0 = 0;
    }
    return ((forwardValue1586_44_0) != 0);
}


public java.lang.String toString() {
return __sourceIntrinsic_a86c261fcdee_originalDynamicSite1073_2(this.b, this.a);
}


public int hashCode() {
long local1 = (moom.CJ.j ^ 93740342542349L);
    return ((((int) moom.CJ.l) * ((moom.CO)(this.b)).hashCode()) + ((java.util.List)(this.a)).hashCode());
}


public java.util.Iterator<net.minecraft.util.IChatComponent> iterator() {
return com.google.common.collect.Iterators.concat(((java.util.Iterator)(com.google.common.collect.Iterators.forArray(((java.lang.Object[])(new moom.CJ[] {this}))))), ((java.util.Iterator)(__sourceExactCall_b5afbd0fac0d49(((java.lang.Iterable)(this.a))))));
}


public static void b(boolean p0) {
moom.CJ.c = ((boolean)(p0));
    return;
}


public final java.lang.String b() {
java.lang.StringBuilder lexicalValue526_30_0;
    boolean spill526_0;
    java.lang.StringBuilder spill526_1;
    long life1_3;
    java.lang.StringBuilder life4_7;
    java.util.Iterator life5_11;
    int life3_12;
    net.minecraft.util.IChatComponent life6_19;
    lexical_join_30: {
    lexical_join_29: {
    life1_3 = (moom.CJ.j ^ 34518060412866L);
    life4_7 = new java.lang.StringBuilder();
    spill526_0 = moom.DS.b__Boolean();
    life5_11 = ((moom.CJ)(this)).iterator();
    life3_12 = ((spill526_0) ? 1 : 0);
    lexical_cycle_13: while (true) {
    if (!(((java.util.Iterator)(life5_11)).hasNext())) {
        break lexical_join_29;
    }
    life6_19 = ((net.minecraft.util.IChatComponent)(((java.util.Iterator)(life5_11)).next()));
    spill526_1 = ((java.lang.StringBuilder)(life4_7)).append(((java.lang.String)(((net.minecraft.util.IChatComponent)(life6_19)).a())));
    if (!((life3_12 == 0))) {
        lexicalValue526_30_0 = spill526_1;
        break lexical_join_30;
    }
    recovery.source.CarrierOps.discard(spill526_1);
    if (!((life3_12 != 0))) { continue lexical_cycle_13; }
    break lexical_cycle_13;
    }
    }
    lexicalValue526_30_0 = life4_7;
    }
    return ((java.lang.StringBuilder)(lexicalValue526_30_0)).toString();
}


public static boolean b__Boolean() {
return ((((moom.CJ.c) ? 1 : 0)) != 0);
}


public final java.lang.String c() {
java.lang.StringBuilder lexicalValue527_40_0;
    boolean spill527_0;
    java.lang.StringBuilder spill527_1;
    long life1_3;
    java.lang.StringBuilder life4_8;
    int life3_9;
    java.util.Iterator life5_12;
    net.minecraft.util.IChatComponent life6_19;
    lexical_join_40: {
    lexical_join_39: {
    life1_3 = (moom.CJ.j ^ 98080909955716L);
    spill527_0 = moom.DS.b__Boolean();
    life4_8 = new java.lang.StringBuilder();
    life3_9 = ((spill527_0) ? 1 : 0);
    life5_12 = ((moom.CJ)(this)).iterator();
    lexical_cycle_13: while (true) {
    if (!(((java.util.Iterator)(life5_12)).hasNext())) {
        break lexical_join_39;
    }
    life6_19 = ((net.minecraft.util.IChatComponent)(((java.util.Iterator)(life5_12)).next()));
    ((java.lang.StringBuilder)(life4_8)).append(((java.lang.String)(((moom.CO)(((net.minecraft.util.IChatComponent)(life6_19)).a__CO())).b())));
    ((java.lang.StringBuilder)(life4_8)).append(((java.lang.String)(((net.minecraft.util.IChatComponent)(life6_19)).a())));
    spill527_1 = ((java.lang.StringBuilder)(life4_8)).append(((java.lang.Object)(net.minecraft.util.EnumChatFormatting.RESET)));
    if (!((life3_9 == 0))) {
        lexicalValue527_40_0 = spill527_1;
        break lexical_join_40;
    }
    recovery.source.CarrierOps.discard(spill527_1);
    if (!((life3_9 != 0))) { continue lexical_cycle_13; }
    break lexical_cycle_13;
    }
    }
    lexicalValue527_40_0 = life4_8;
    }
    return ((java.lang.StringBuilder)(lexicalValue527_40_0)).toString();
}


public static boolean c__Boolean() {
int local0 = __sourceIntrinsic_booleanToInteger(moom.CJ.b__Boolean());
    if ((local0 == 0)) {
        return ((1) != 0);
    }
    return ((0) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public net.minecraft.util.IChatComponent a(moom.CO p0) {
boolean spill525_0;
    long life2_3;
    java.util.Iterator life5_11;
    int life4_12;
    net.minecraft.util.IChatComponent life6_19;
    lexical_join_28: {
    life2_3 = (moom.CJ.j ^ 102981806164046L);
    spill525_0 = moom.DS.b__Boolean();
    this.b = ((moom.CO)(p0));
    life5_11 = ((java.util.List)(this.a)).iterator();
    life4_12 = ((spill525_0) ? 1 : 0);
    lexical_cycle_13: while (true) {
    if (!(((java.util.Iterator)(life5_11)).hasNext())) {
        break lexical_join_28;
    }
    life6_19 = ((net.minecraft.util.IChatComponent)(((java.util.Iterator)(life5_11)).next()));
    ((moom.CO)(__sourceExactCall_358f8e9fe885b7(((net.minecraft.util.IChatComponent)(life6_19))))).a(((moom.CO)(__sourceExactCall_975f061a5010e7(((moom.CJ)(this))))));
    if (!((life4_12 != 0))) { continue lexical_cycle_13; }
    break lexical_cycle_13;
    }
    }
    return this;
}


public net.minecraft.util.IChatComponent a(java.lang.String p0) {
return this.a(((net.minecraft.util.IChatComponent)(new moom.CM(p0))));
}


public java.util.List<net.minecraft.util.IChatComponent> a__List() {
return this.a;
}


public net.minecraft.util.IChatComponent a(net.minecraft.util.IChatComponent p0) {
((moom.CO)(__sourceExactCall_358f8e9fe885b7(((net.minecraft.util.IChatComponent)(p0))))).a(((moom.CO)(__sourceExactCall_975f061a5010e7(((moom.CJ)(this))))));
    ((java.util.List)(this.a)).add(((java.lang.Object)(p0)));
    return this;
}


public moom.CO a__CO() {
long life1_3;
    java.util.Iterator life3_15;
    net.minecraft.util.IChatComponent life4_22;
    life1_3 = (moom.CJ.j ^ 106708168640376L);
    if ((this.b == null)) {
        this.b = ((moom.CO)(new moom.CO()));
        life3_15 = ((java.util.List)(this.a)).iterator();
        loop_region_16: while (((java.util.Iterator)(life3_15)).hasNext()) {
        life4_22 = ((net.minecraft.util.IChatComponent)(((java.util.Iterator)(life3_15)).next()));
        ((moom.CO)(((net.minecraft.util.IChatComponent)(life4_22)).a__CO())).a(((moom.CO)(this.b)));
    }
    }
    return this.b;
}


public static java.util.Iterator<net.minecraft.util.IChatComponent> a(java.lang.Iterable<net.minecraft.util.IChatComponent> p0) {
java.util.Iterator local1 = com.google.common.collect.Iterators.concat(((java.util.Iterator)(com.google.common.collect.Iterators.transform(((java.util.Iterator)(((java.lang.Iterable)(p0)).iterator())), ((com.google.common.base.Function)(__sourceIntrinsic_45970f78d137_originalDynamicSite1074_1()))))));
    local1 = com.google.common.collect.Iterators.transform(((java.util.Iterator)(local1)), ((com.google.common.base.Function)(__sourceIntrinsic_45970f78d137_originalDynamicSite1074_4())));
    return local1;
}


private static net.minecraft.util.IChatComponent lambda$createDeepCopyIterator$0(net.minecraft.util.IChatComponent p0) {
java.lang.Object local1 = ((net.minecraft.util.IChatComponent)(p0)).a__C5();
    ((net.minecraft.util.IChatComponent)(local1)).a(((moom.CO)(((moom.CO)(((net.minecraft.util.IChatComponent)(local1)).a__CO())).c())));
    return ((net.minecraft.util.IChatComponent)(local1));
}


private static native <E extends Throwable> com.google.common.base.Function __sourceIntrinsic_45970f78d137_originalDynamicSite1074_1() throws E;

private static native <E extends Throwable> com.google.common.base.Function __sourceIntrinsic_45970f78d137_originalDynamicSite1074_4() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite1073_2(moom.CO a0, java.util.List a1) throws E;

private static native int __sourceIntrinsic_booleanToInteger(boolean value);
private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native java.util.Iterator __sourceExactCall_b5afbd0fac0d49(java.lang.Iterable p0);

private static native moom.CO __sourceExactCall_358f8e9fe885b7(net.minecraft.util.IChatComponent p0);
private static native moom.CO __sourceExactCall_975f061a5010e7(moom.CJ p0);
}
