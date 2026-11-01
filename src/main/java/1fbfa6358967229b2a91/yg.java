package moom;


public class yg implements net.minecraft.item.crafting.IRecipe {

private final net.minecraft.item.ItemStack a;

private final java.util.List<net.minecraft.item.ItemStack> b;

private static final long c;

private static final long d;

public yg(net.minecraft.item.ItemStack p0, java.util.List<net.minecraft.item.ItemStack> p1) {
super();
    this.a = p0;
    this.b = p1;
}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(-4480779992055577400L)), ((long)(2689886092568637857L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(273137673107765L)))));
    long local0_life6 = (moom.yg.c ^ 71959292924574L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill1129_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1129_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1129_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1129_13 = new byte[8];
    (__sourceSpill1129_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill1129_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation1129_15 = __sourceSpill1129_13;
    ((javax.crypto.Cipher)(__sourceSpill1129_10)).init(((int)(__sourceSpill1129_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1129_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1129_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = 3509129744647750639L;
    byte[] __sourceSpill1129_19 = new byte[8];
    (__sourceSpill1129_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill1129_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill1129_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill1129_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill1129_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill1129_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill1129_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill1129_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill1129_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill1129_20)).doFinal(((byte[])(__sourceSpill1129_19)));
    d = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public int a() {
return ((java.util.List)(this.b)).size();
}


public net.minecraft.item.ItemStack a__xW(moom.wx p0) {
return ((net.minecraft.item.ItemStack)(this.a)).a__xW();
}


public boolean a(moom.wx p0, net.minecraft.world.World p1) {
net.minecraft.item.ItemStack forestValue524_34_0;
    net.minecraft.item.ItemStack forestValue524_57_0;
    int forestValue524_75_0;
    int forestValue524_93_0;
    int forestValue524_96_0;
    java.lang.String spill524_0;
    int spill524_1;
    net.minecraft.item.ItemStack spill524_2;
    int spill524_3;
    int spill524_4;
    int spill524_5;
    long life3_3;
    java.util.ArrayList life6_8;
    java.lang.String life5_9;
    int life7_11;
    int life8_19;
    net.minecraft.item.ItemStack life9_28;
    int life10_38;
    java.util.Iterator life11_41;
    net.minecraft.item.ItemStack life12_48;
    forest_join_96: {
    forest_join_94: {
    forest_join_93: {
    forest_join_92: {
    life3_3 = (moom.yg.c ^ 8687392984656L);
    spill524_0 = moom.ye.b();
    life6_8 = com.google.common.collect.Lists.newArrayList(((java.lang.Iterable)(this.b)));
    life5_9 = spill524_0;
    life7_11 = 0;
    forest_cycle_12: while (true) {
    forest_join_89: {
    forest_join_88: {
    if (!((life7_11 < ((moom.wx)(p0)).e()))) {
        break forest_join_94;
    }
    spill524_1 = 0;
    if (!((life5_9 == null))) {
        forestValue524_96_0 = spill524_1;
        break forest_join_96;
    }
    life8_19 = spill524_1;
    forest_cycle_20: while (true) {
    forest_join_86: {
    forest_join_85: {
    forest_join_80: {
    if (!((life8_19 < ((moom.wx)(p0)).f()))) {
        break forest_join_88;
    }
    life9_28 = ((moom.wx)(p0)).b(((int)(life8_19)), ((int)(life7_11)));
    if (!((life5_9 == null))) {
        break forest_join_89;
    }
    if (!((life5_9 == null))) {
        break forest_join_86;
    }
    forestValue524_34_0 = life9_28;
    forest_cycle_34: while (true) {
    if (!((forestValue524_34_0 != null))) {
        break forest_join_85;
    }
    life10_38 = 0;
    life11_41 = ((java.util.List)(life6_8)).iterator();
    forest_cycle_40: while (true) {
    forest_join_78: {
    forest_join_75: {
    forest_join_70: {
    forest_join_57: {
    if (!(((java.util.Iterator)(life11_41)).hasNext())) {
        break forest_join_80;
    }
    life12_48 = ((net.minecraft.item.ItemStack)(((java.util.Iterator)(life11_41)).next()));
    spill524_2 = life9_28;
    if (!((life5_9 == null))) {
        forestValue524_34_0 = spill524_2;
        continue forest_cycle_34;
    }
    if (!((life5_9 == null))) {
        forestValue524_57_0 = spill524_2;
        break forest_join_57;
    }
    if (!((((net.minecraft.item.ItemStack)(spill524_2)).a__wQ() == ((net.minecraft.item.ItemStack)(life12_48)).a__wQ()))) {
        break forest_join_78;
    }
    forestValue524_57_0 = life12_48;
    }
    spill524_3 = ((net.minecraft.item.ItemStack)(forestValue524_57_0)).c();
    if (!((life5_9 == null))) {
        forestValue524_75_0 = spill524_3;
        break forest_join_75;
    }
    if (!((spill524_3 != ((int) moom.yg.d)))) {
        break forest_join_70;
    }
    spill524_4 = ((net.minecraft.item.ItemStack)(life9_28)).c();
    if (!((life5_9 == null))) {
        forestValue524_75_0 = spill524_4;
        break forest_join_75;
    }
    if (!((spill524_4 == ((net.minecraft.item.ItemStack)(life12_48)).c()))) {
        break forest_join_78;
    }
    }
    life10_38 = 1;
    forestValue524_75_0 = ((((java.util.List)(life6_8)).remove(((java.lang.Object)(life12_48)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forestValue524_75_0);
    if (!((life5_9 != null))) {
        break forest_join_80;
    }
    }
    if (!((life5_9 != null))) {
        continue forest_cycle_40;
    }
    break forest_cycle_40;
    }
    break forest_cycle_34;
    }
    }
    spill524_5 = life10_38;
    if (!((life5_9 == null))) {
        forestValue524_93_0 = spill524_5;
        break forest_join_93;
    }
    if (!((spill524_5 == 0))) {
        break forest_join_85;
    }
    break forest_join_92;
    }
    life8_19 += 1;
    }
    if (!((life5_9 != null))) {
        continue forest_cycle_20;
    }
    break forest_cycle_20;
    }
    }
    life7_11 += 1;
    }
    if (!((life5_9 != null))) {
        continue forest_cycle_12;
    }
    break forest_cycle_12;
    }
    break forest_join_94;
    }
    forestValue524_93_0 = 0;
    }
    return ((forestValue524_93_0) != 0);
    }
    forestValue524_96_0 = ((((java.util.List)(life6_8)).isEmpty()) ? 1 : 0);
    }
    return ((forestValue524_96_0) != 0);
}


public net.minecraft.item.ItemStack[] a__ArrayxW(moom.wx p0) {
java.lang.String spill1436_0;
    long life2_3;
    net.minecraft.item.ItemStack[] life5_8;
    int life6_10;
    java.lang.String life4_11;
    net.minecraft.item.ItemStack life7_19;
    lexical_join_40: {
    life2_3 = (moom.yg.c ^ 18515056503332L);
    spill1436_0 = moom.ye.b();
    life5_8 = new net.minecraft.item.ItemStack[((moom.wx)(p0)).b__Int()];
    life6_10 = 0;
    life4_11 = spill1436_0;
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


public net.minecraft.item.ItemStack a__xW() {
return this.a;
}

}
