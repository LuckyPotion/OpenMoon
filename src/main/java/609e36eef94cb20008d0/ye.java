package moom;


public class ye implements net.minecraft.item.crafting.IRecipe {

private final int a;

private final int b;

private final net.minecraft.item.ItemStack[] c;

private final net.minecraft.item.ItemStack d;

private boolean e;

private static java.lang.String f;

private static final long h;

private static final long i;

public ye(int p0, int p1, net.minecraft.item.ItemStack[] p2, net.minecraft.item.ItemStack p3) {
super();
    this.a = p0;
    this.b = p1;
    this.c = p2;
    this.d = p3;
}


static {
h = ((long)(((moom._a)(moom._c.a(((long)(-8568671779053431028L)), ((long)(1055131834021547949L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(5937975073135L)))));
    java.lang.Object __sourceSpill1128_6 = null;
    long local0_life7 = (moom.ye.h ^ 46482219239596L);
    moom.ye.b(((java.lang.String)(__sourceSpill1128_6)));
    javax.crypto.Cipher local2_life10;
    javax.crypto.Cipher __sourceSpill1128_12 = (local2_life10 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1128_13 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1128_14 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1128_15 = new byte[8];
    (__sourceSpill1128_15)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life16 = 1;
    while ((local3_life16 < 8)) {
        (__sourceSpill1128_15)[local3_life16] = ((byte) ((int) ((local0_life7 << (local3_life16 * 8)) >>> 56)));
        local3_life16 += 1;
    }
    byte[] __sourcePreallocation1128_17 = __sourceSpill1128_15;
    ((javax.crypto.Cipher)(__sourceSpill1128_12)).init(((int)(__sourceSpill1128_13)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1128_14)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1128_17)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life20 = -8023975903922743156L;
    byte[] __sourceSpill1128_21 = new byte[8];
    (__sourceSpill1128_21)[0] = ((byte) ((int) (local4_life20 >>> 56)));
    (__sourceSpill1128_21)[1] = ((byte) ((int) (local4_life20 >>> 48)));
    (__sourceSpill1128_21)[2] = ((byte) ((int) (local4_life20 >>> 40)));
    (__sourceSpill1128_21)[3] = ((byte) ((int) (local4_life20 >>> 32)));
    (__sourceSpill1128_21)[4] = ((byte) ((int) (local4_life20 >>> 24)));
    (__sourceSpill1128_21)[5] = ((byte) ((int) (local4_life20 >>> 16)));
    (__sourceSpill1128_21)[6] = ((byte) ((int) (local4_life20 >>> 8)));
    (__sourceSpill1128_21)[7] = ((byte) ((int) local4_life20));
    javax.crypto.Cipher __sourceSpill1128_22 = local2_life10;
    byte[] local6_life24 = ((javax.crypto.Cipher)(__sourceSpill1128_22)).doFinal(((byte[])(__sourceSpill1128_21)));
    i = ((long)((((((((((((long) (local6_life24)[0]) & 255L) << 56) | ((((long) (local6_life24)[1]) & 255L) << 48)) | ((((long) (local6_life24)[2]) & 255L) << 40)) | ((((long) (local6_life24)[3]) & 255L) << 32)) | ((((long) (local6_life24)[4]) & 255L) << 24)) | ((((long) (local6_life24)[5]) & 255L) << 16)) | ((((long) (local6_life24)[6]) & 255L) << 8)) | (((long) (local6_life24)[7]) & 255L))));
}


public static void b(java.lang.String p0) {
moom.ye.f = ((java.lang.String)(p0));
    return;
}


public static java.lang.String b() {
return moom.ye.f;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public int a() {
return (this.a * this.b);
}


public net.minecraft.item.ItemStack a__xW() {
return this.d;
}


public net.minecraft.item.ItemStack[] a__ArrayxW(moom.wx p0) {
java.lang.String spill1431_0;
    long life2_3;
    net.minecraft.item.ItemStack[] life5_8;
    int life6_10;
    java.lang.String life4_11;
    net.minecraft.item.ItemStack life7_19;
    lexical_join_40: {
    life2_3 = (moom.ye.h ^ 39616096624603L);
    spill1431_0 = moom.ye.b();
    life5_8 = new net.minecraft.item.ItemStack[((moom.wx)(p0)).b__Int()];
    life6_10 = 0;
    life4_11 = spill1431_0;
    lexical_cycle_12: while (true) {
    lexical_join_38: {
    lexical_join_37: {
    if (!((life6_10 < (life5_8).length))) {
        break lexical_join_40;
    }
    life7_19 = ((moom.wx)(p0)).a__xW(((int)(life6_10)));
    if (!((life4_11 == null))) {
        break lexical_join_38;
    }
    if (!((life7_19 != null))) {
        break lexical_join_37;
    }
    if (!(((net.minecraft.item.Item)(((net.minecraft.item.ItemStack)(life7_19)).a__wQ())).f())) {
        break lexical_join_37;
    }
    (life5_8)[life6_10] = new net.minecraft.item.ItemStack(((net.minecraft.item.Item)(((net.minecraft.item.ItemStack)(life7_19)).a__wQ())).b__wQ());
    }
    life6_10 += 1;
    }
    if (!((life4_11 != null))) { continue lexical_cycle_12; }
    break lexical_cycle_12;
    }
    }
    return life5_8;
}


public boolean a(moom.wx p0, net.minecraft.world.World p1) {
int forestValue947_9_0;
    int forestValue947_42_0;
    int forestValue947_56_0;
    int forestValue947_58_0;
    java.lang.String spill947_0;
    int spill947_1;
    boolean spill947_2;
    long life3_3;
    int life6_6;
    java.lang.String life5_7;
    int life7_17;
    forest_join_58: {
    forest_join_57: {
    forest_join_56: {
    forest_join_55: {
    forest_join_53: {
    life3_3 = (moom.ye.h ^ 56314419575727L);
    spill947_0 = moom.ye.b();
    life6_6 = 0;
    life5_7 = spill947_0;
    forest_cycle_8: while (true) {
    forest_join_49: {
    forestValue947_9_0 = life6_6;
    forest_cycle_9: while (true) {
    if (!((forestValue947_9_0 <= (3 - this.a)))) {
        break forest_join_57;
    }
    spill947_1 = 0;
    if (!((life5_7 == null))) {
        forestValue947_58_0 = spill947_1;
        break forest_join_58;
    }
    life7_17 = spill947_1;
    forest_cycle_18: while (true) {
    forest_join_46: {
    forest_join_42: {
    forest_join_36: {
    if (!((life7_17 <= (3 - this.b)))) {
        break forest_join_49;
    }
    spill947_2 = this.a(((moom.wx)(p0)), ((int)(life6_6)), ((int)(life7_17)), ((boolean)(true)));
    if (!((life5_7 == null))) {
        forestValue947_9_0 = ((spill947_2) ? 1 : 0);
        continue forest_cycle_9;
    }
    if (!((life5_7 == null))) {
        forestValue947_42_0 = ((spill947_2) ? 1 : 0);
        break forest_join_42;
    }
    if (!(spill947_2)) {
        break forest_join_36;
    }
    break forest_join_53;
    }
    forestValue947_42_0 = ((this.a(((moom.wx)(p0)), ((int)(life6_6)), ((int)(life7_17)), ((boolean)(false)))) ? 1 : 0);
    }
    if (!((life5_7 == null))) {
        forestValue947_56_0 = forestValue947_42_0;
        break forest_join_56;
    }
    if (!((forestValue947_42_0 != 0))) {
        break forest_join_46;
    }
    break forest_join_55;
    }
    life7_17 += 1;
    if (!((life5_7 != null))) {
        continue forest_cycle_18;
    }
    break forest_cycle_18;
    }
    break forest_cycle_9;
    }
    }
    life6_6 += 1;
    if (!((life5_7 != null))) {
        continue forest_cycle_8;
    }
    break forest_cycle_8;
    }
    break forest_join_57;
    }
    return ((1) != 0);
    }
    forestValue947_56_0 = 1;
    }
    return ((forestValue947_56_0) != 0);
    }
    forestValue947_58_0 = 0;
    }
    return ((forestValue947_58_0) != 0);
}


private boolean a(moom.wx p0, int p1, int p2, boolean p3) {
int forestValue948_9_0;
    int forestValue948_35_0;
    int forestValue948_39_0;
    int forestValue948_49_0;
    int forestValue948_49_1;
    int forestValue948_51_0;
    net.minecraft.item.ItemStack forestValue948_92_0;
    net.minecraft.item.ItemStack forestValue948_100_0;
    net.minecraft.item.ItemStack forestValue948_109_0;
    net.minecraft.item.ItemStack forestValue948_117_0;
    int forestValue948_129_0;
    int forestValue948_129_1;
    int forestValue948_143_0;
    int forestValue948_145_0;
    java.lang.String spill948_0;
    int spill948_1;
    int spill948_2;
    int spill948_3;
    int spill948_4;
    net.minecraft.item.ItemStack spill948_5;
    net.minecraft.item.ItemStack spill948_6;
    net.minecraft.item.ItemStack spill948_7;
    net.minecraft.item.ItemStack spill948_8;
    int spill948_9;
    int spill948_10;
    int spill948_11;
    long life5_3;
    int life8_6;
    java.lang.String life7_7;
    int life9_14;
    int life10_21;
    int life11_25;
    net.minecraft.item.ItemStack life12_27;
    net.minecraft.item.ItemStack life13_87;
    forest_join_145: {
    forest_join_144: {
    forest_join_143: {
    forest_join_142: {
    forest_join_140: {
    forest_join_138: {
    life5_3 = (moom.ye.h ^ 115132914132396L);
    spill948_0 = moom.ye.b();
    life8_6 = 0;
    life7_7 = spill948_0;
    forest_cycle_8: while (true) {
    forest_join_134: {
    forestValue948_9_0 = life8_6;
    forest_cycle_9: while (true) {
    if (!((forestValue948_9_0 < 3))) {
        break forest_join_144;
    }
    spill948_1 = 0;
    if (!((life7_7 == null))) {
        forestValue948_145_0 = spill948_1;
        break forest_join_145;
    }
    life9_14 = spill948_1;
    forest_cycle_15: while (true) {
    forest_join_131: {
    forest_join_129: {
    forest_join_117: {
    forest_join_116: {
    forest_join_109: {
    forest_join_108: {
    forest_join_100: {
    forest_join_99: {
    forest_join_92: {
    forest_join_91: {
    forest_join_78: {
    forest_join_68: {
    forest_join_51: {
    forest_join_49: {
    forest_join_39: {
    forest_join_35: {
    if (!((life9_14 < 3))) {
        break forest_join_134;
    }
    life10_21 = (life8_6 - p1);
    life11_25 = (life9_14 - p2);
    life12_27 = null;
    spill948_2 = life10_21;
    if (!((life7_7 == null))) {
        forestValue948_9_0 = spill948_2;
        continue forest_cycle_9;
    }
    if (!((life7_7 == null))) {
        forestValue948_35_0 = spill948_2;
        break forest_join_35;
    }
    if (!((spill948_2 >= 0))) {
        break forest_join_78;
    }
    forestValue948_35_0 = life11_25;
    }
    if (!((life7_7 == null))) {
        forestValue948_39_0 = forestValue948_35_0;
        break forest_join_39;
    }
    if (!((forestValue948_35_0 >= 0))) {
        break forest_join_78;
    }
    forestValue948_39_0 = life10_21;
    }
    spill948_3 = this.a;
    if (!((life7_7 == null))) {
        forestValue948_49_0 = forestValue948_39_0;
        forestValue948_49_1 = spill948_3;
        break forest_join_49;
    }
    if (!((forestValue948_39_0 < spill948_3))) {
        break forest_join_78;
    }
    spill948_4 = life11_25;
    if (!((life7_7 == null))) {
        forestValue948_51_0 = spill948_4;
        break forest_join_51;
    }
    forestValue948_49_0 = spill948_4;
    forestValue948_49_1 = this.b;
    }
    if (!((forestValue948_49_0 < forestValue948_49_1))) {
        break forest_join_78;
    }
    forestValue948_51_0 = ((p3) ? 1 : 0);
    }
    if (!((forestValue948_51_0 != 0))) {
        break forest_join_68;
    }
    life12_27 = (this.c)[(((this.a - life10_21) - 1) + (life11_25 * this.a))];
    break forest_join_78;
    }
    life12_27 = (this.c)[(life10_21 + (life11_25 * this.a))];
    }
    life13_87 = ((moom.wx)(p0)).b(((int)(life8_6)), ((int)(life9_14)));
    spill948_5 = life13_87;
    if (!((life7_7 == null))) {
        forestValue948_92_0 = spill948_5;
        break forest_join_92;
    }
    if (!((spill948_5 == null))) {
        break forest_join_91;
    }
    spill948_6 = life12_27;
    if (!((life7_7 == null))) {
        forestValue948_92_0 = spill948_6;
        break forest_join_92;
    }
    if (!((spill948_6 != null))) {
        break forest_join_131;
    }
    }
    forestValue948_92_0 = life13_87;
    }
    if (!((life7_7 == null))) {
        forestValue948_100_0 = forestValue948_92_0;
        break forest_join_100;
    }
    if (!((forestValue948_92_0 == null))) {
        break forest_join_99;
    }
    spill948_7 = life12_27;
    if (!((life7_7 == null))) {
        forestValue948_100_0 = spill948_7;
        break forest_join_100;
    }
    if (!((spill948_7 == null))) {
        break forest_join_138;
    }
    }
    forestValue948_100_0 = life13_87;
    }
    if (!((life7_7 == null))) {
        forestValue948_109_0 = forestValue948_100_0;
        break forest_join_109;
    }
    if (!((forestValue948_100_0 != null))) {
        break forest_join_108;
    }
    spill948_8 = life12_27;
    if (!((life7_7 == null))) {
        forestValue948_109_0 = spill948_8;
        break forest_join_109;
    }
    if (!((spill948_8 == null))) {
        break forest_join_108;
    }
    break forest_join_138;
    }
    forestValue948_109_0 = life12_27;
    }
    if (!((life7_7 == null))) {
        forestValue948_117_0 = forestValue948_109_0;
        break forest_join_117;
    }
    if (!((((net.minecraft.item.ItemStack)(forestValue948_109_0)).a__wQ() != ((net.minecraft.item.ItemStack)(life13_87)).a__wQ()))) {
        break forest_join_116;
    }
    break forest_join_140;
    }
    forestValue948_117_0 = life12_27;
    }
    spill948_9 = ((net.minecraft.item.ItemStack)(forestValue948_117_0)).c();
    spill948_10 = ((int) moom.ye.i);
    if (!((life7_7 == null))) {
        forestValue948_129_0 = spill948_9;
        forestValue948_129_1 = spill948_10;
        break forest_join_129;
    }
    if (!((spill948_9 != spill948_10))) {
        break forest_join_131;
    }
    spill948_11 = ((net.minecraft.item.ItemStack)(life12_27)).c();
    if (!((life7_7 == null))) {
        forestValue948_143_0 = spill948_11;
        break forest_join_143;
    }
    forestValue948_129_0 = spill948_11;
    forestValue948_129_1 = ((net.minecraft.item.ItemStack)(life13_87)).c();
    }
    if (!((forestValue948_129_0 != forestValue948_129_1))) {
        break forest_join_131;
    }
    break forest_join_142;
    }
    life9_14 += 1;
    if (!((life7_7 != null))) {
        continue forest_cycle_15;
    }
    break forest_cycle_15;
    }
    break forest_cycle_9;
    }
    }
    life8_6 += 1;
    if (!((life7_7 != null))) {
        continue forest_cycle_8;
    }
    break forest_cycle_8;
    }
    break forest_join_144;
    }
    return ((0) != 0);
    }
    return ((0) != 0);
    }
    forestValue948_143_0 = 0;
    }
    return ((forestValue948_143_0) != 0);
    }
    forestValue948_145_0 = 1;
    }
    return ((forestValue948_145_0) != 0);
}


public net.minecraft.item.ItemStack a__xW(moom.wx p0) {
int lexicalValue1432_16_0;
    net.minecraft.item.ItemStack lexicalValue1432_37_0;
    net.minecraft.item.ItemStack lexicalValue1432_46_0;
    java.lang.String spill1432_0;
    boolean spill1432_1;
    net.minecraft.item.ItemStack spill1432_2;
    net.minecraft.item.ItemStack spill1432_3;
    long life2_3;
    net.minecraft.item.ItemStack life5_8;
    java.lang.String life4_9;
    int life6_19;
    net.minecraft.item.ItemStack life7_27;
    lexical_join_46: {
    lexical_join_45: {
    lexical_join_16: {
    life2_3 = (moom.ye.h ^ 79967076694132L);
    spill1432_0 = moom.ye.b();
    life5_8 = ((net.minecraft.item.ItemStack)(((moom.ye)(this)).a__xW())).a__xW();
    life4_9 = spill1432_0;
    spill1432_1 = this.e;
    if (!((life4_9 == null))) {
        lexicalValue1432_16_0 = ((spill1432_1) ? 1 : 0);
        break lexical_join_16;
    }
    if (!(spill1432_1)) {
        break lexical_join_45;
    }
    lexicalValue1432_16_0 = 0;
    }
    life6_19 = lexicalValue1432_16_0;
    lexical_cycle_17: while (true) {
    lexical_join_43: {
    lexical_join_42: {
    lexical_join_37: {
    if (!((life6_19 < ((moom.wx)(p0)).b__Int()))) {
        break lexical_join_45;
    }
    life7_27 = ((moom.wx)(p0)).a__xW(((int)(life6_19)));
    if (!((life4_9 == null))) {
        break lexical_join_43;
    }
    spill1432_2 = life7_27;
    if (!((life4_9 == null))) {
        lexicalValue1432_46_0 = spill1432_2;
        break lexical_join_46;
    }
    if (!((spill1432_2 != null))) {
        break lexical_join_42;
    }
    spill1432_3 = life7_27;
    if (!((life4_9 == null))) {
        lexicalValue1432_37_0 = spill1432_3;
        break lexical_join_37;
    }
    if (!(((net.minecraft.item.ItemStack)(spill1432_3)).e__Boolean())) {
        break lexical_join_42;
    }
    lexicalValue1432_37_0 = life5_8;
    }
    ((net.minecraft.item.ItemStack)(lexicalValue1432_37_0)).b(((net.minecraft.nbt.NBTTagCompound)(((net.minecraft.nbt.NBTTagCompound)(((net.minecraft.nbt.NBTTagCompound)(((net.minecraft.item.ItemStack)(life7_27)).a__yw())).a__yn())))));
    }
    life6_19 += 1;
    }
    if (!((life4_9 != null))) { continue lexical_cycle_17; }
    break lexical_cycle_17;
    }
    }
    lexicalValue1432_46_0 = life5_8;
    }
    return lexicalValue1432_46_0;
}

}
