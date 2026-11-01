package moom;


public class x2 implements net.minecraft.item.crafting.IRecipe {

private static final long a;

private static final long b;

public x2() {
super();
}


static {
a = ((long)(((moom._a)(moom._c.a(((long)(112393344779944101L)), ((long)(4117890859939026165L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(183339919296768L)))));
    long local0_life6 = (moom.x2.a ^ 34619638013546L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill1097_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1097_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1097_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1097_13 = new byte[8];
    (__sourceSpill1097_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill1097_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation1097_15 = __sourceSpill1097_13;
    ((javax.crypto.Cipher)(__sourceSpill1097_10)).init(((int)(__sourceSpill1097_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1097_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1097_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -2278416645339452769L;
    byte[] __sourceSpill1097_19 = new byte[8];
    (__sourceSpill1097_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill1097_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill1097_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill1097_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill1097_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill1097_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill1097_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill1097_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill1097_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill1097_20)).doFinal(((byte[])(__sourceSpill1097_19)));
    b = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public net.minecraft.item.ItemStack[] a__ArrayxW(moom.wx p0) {
java.lang.String spill1392_0;
    long life2_3;
    net.minecraft.item.ItemStack[] life5_7;
    int life6_10;
    java.lang.String life4_11;
    net.minecraft.item.ItemStack life7_19;
    lexical_join_40: {
    life2_3 = (moom.x2.a ^ 20475938101194L);
    life5_7 = new net.minecraft.item.ItemStack[((moom.wx)(p0)).b__Int()];
    spill1392_0 = moom.ye.b();
    life6_10 = 0;
    life4_11 = spill1392_0;
    lexical_cycle_12: while (true) {
    lexical_join_38: {
    lexical_join_37: {
    if (!((life6_10 < (life5_7).length))) {
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
    (life5_7)[life6_10] = new net.minecraft.item.ItemStack(((net.minecraft.item.Item)(((net.minecraft.item.ItemStack)(life7_19)).a__wQ())).b__wQ());
    }
    life6_10 += 1;
    }
    if (!((life4_11 != null))) { continue lexical_cycle_12; }
    break lexical_cycle_12;
    }
    }
    return life5_7;
}


public net.minecraft.item.ItemStack a__xW() {
return null;
}


public int a() {
return 4;
}


public net.minecraft.item.ItemStack a__xW(moom.wx p0) {
net.minecraft.item.ItemStack lexicalValue1393_47_0;
    int lexicalValue1393_57_0;
    int lexicalValue1393_57_1;
    int lexicalValue1393_61_0;
    java.lang.Object lexicalValue1393_76_0;
    net.minecraft.item.ItemStack lexicalValue1393_77_0;
    net.minecraft.item.ItemStack lexicalValue1393_91_0;
    int lexicalValue1393_101_0;
    int lexicalValue1393_101_1;
    int lexicalValue1393_107_0;
    net.minecraft.item.Item lexicalValue1393_110_0;
    int lexicalValue1393_145_0;
    java.lang.String spill1393_0;
    net.minecraft.item.ItemStack spill1393_1;
    net.minecraft.item.ItemStack spill1393_2;
    int spill1393_3;
    int spill1393_4;
    int spill1393_5;
    java.util.ArrayList spill1393_6;
    net.minecraft.item.ItemStack spill1393_7;
    int spill1393_8;
    int spill1393_9;
    int spill1393_10;
    net.minecraft.item.Item spill1393_11;
    int spill1393_12;
    long life2_3;
    java.util.ArrayList life5_5;
    int life6_8;
    java.lang.String life4_9;
    net.minecraft.item.ItemStack life7_17;
    net.minecraft.item.ItemStack life8_50;
    net.minecraft.item.ItemStack life6_115;
    net.minecraft.item.ItemStack life7_120;
    net.minecraft.item.Item life8_172;
    int life9_178;
    int life10_184;
    int life11_196;
    int life12_201;
    lexical_join_154: {
    lexical_join_146: {
    lexical_join_145: {
    lexical_join_110: {
    lexical_join_107: {
    lexical_join_101: {
    lexical_join_91: {
    lexical_join_77: {
    lexical_join_76: {
    lexical_join_67: {
    life2_3 = (moom.x2.a ^ 138686430359653L);
    life5_5 = com.google.common.collect.Lists.newArrayList();
    spill1393_0 = moom.ye.b();
    life6_8 = 0;
    life4_9 = spill1393_0;
    lexical_cycle_10: while (true) {
    lexical_join_65: {
    lexical_join_64: {
    lexical_join_62: {
    lexical_join_61: {
    lexical_join_57: {
    lexical_join_47: {
    if (!((life6_8 < ((moom.wx)(p0)).b__Int()))) {
        break lexical_join_67;
    }
    life7_17 = ((moom.wx)(p0)).a__xW(((int)(life6_8)));
    if (!((life4_9 == null))) {
        break lexical_join_65;
    }
    spill1393_1 = life7_17;
    if (!((life4_9 == null))) {
        lexicalValue1393_77_0 = spill1393_1;
        break lexical_join_77;
    }
    if (!((spill1393_1 != null))) {
        break lexical_join_64;
    }
    ((java.util.List)(life5_5)).add(((java.lang.Object)(life7_17)));
    if (!((life4_9 == null))) {
        break lexical_join_65;
    }
    if (!((((java.util.List)(life5_5)).size() > 1))) {
        break lexical_join_64;
    }
    life8_50 = ((net.minecraft.item.ItemStack)(((java.util.List)(life5_5)).get(((int)(0)))));
    spill1393_2 = life7_17;
    if (!((life4_9 == null))) {
        lexicalValue1393_47_0 = spill1393_2;
        break lexical_join_47;
    }
    if (!((((net.minecraft.item.ItemStack)(spill1393_2)).a__wQ() == ((net.minecraft.item.ItemStack)(life8_50)).a__wQ()))) {
        break lexical_join_62;
    }
    lexicalValue1393_47_0 = life8_50;
    }
    spill1393_3 = ((net.minecraft.item.ItemStack)(lexicalValue1393_47_0)).b;
    spill1393_4 = 1;
    if (!((life4_9 == null))) {
        lexicalValue1393_57_0 = spill1393_3;
        lexicalValue1393_57_1 = spill1393_4;
        break lexical_join_57;
    }
    if (!((spill1393_3 == spill1393_4))) {
        break lexical_join_62;
    }
    spill1393_5 = ((net.minecraft.item.ItemStack)(life7_17)).b;
    if (!((life4_9 == null))) {
        lexicalValue1393_61_0 = spill1393_5;
        break lexical_join_61;
    }
    lexicalValue1393_57_0 = spill1393_5;
    lexicalValue1393_57_1 = 1;
    }
    if (!((lexicalValue1393_57_0 == lexicalValue1393_57_1))) {
        break lexical_join_62;
    }
    lexicalValue1393_61_0 = ((((net.minecraft.item.Item)(((net.minecraft.item.ItemStack)(life8_50)).a__wQ())).b__Boolean()) ? 1 : 0);
    }
    if (!((lexicalValue1393_61_0 == 0))) {
        break lexical_join_64;
    }
    }
    return null;
    }
    life6_8 += 1;
    }
    if (!((life4_9 != null))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    spill1393_6 = life5_5;
    if (!((life4_9 == null))) {
        lexicalValue1393_76_0 = spill1393_6;
        break lexical_join_76;
    }
    if (!((((java.util.List)(spill1393_6)).size() == 2))) {
        break lexical_join_154;
    }
    lexicalValue1393_76_0 = ((java.util.List)(life5_5)).get(((int)(0)));
    }
    lexicalValue1393_77_0 = ((net.minecraft.item.ItemStack)(lexicalValue1393_76_0));
    }
    life6_115 = lexicalValue1393_77_0;
    life7_120 = ((net.minecraft.item.ItemStack)(((java.util.List)(life5_5)).get(((int)(1)))));
    spill1393_7 = life6_115;
    if (!((life4_9 == null))) {
        lexicalValue1393_91_0 = spill1393_7;
        break lexical_join_91;
    }
    if (!((((net.minecraft.item.ItemStack)(spill1393_7)).a__wQ() == ((net.minecraft.item.ItemStack)(life7_120)).a__wQ()))) {
        break lexical_join_154;
    }
    lexicalValue1393_91_0 = life6_115;
    }
    spill1393_8 = ((net.minecraft.item.ItemStack)(lexicalValue1393_91_0)).b;
    spill1393_9 = 1;
    if (!((life4_9 == null))) {
        lexicalValue1393_101_0 = spill1393_8;
        lexicalValue1393_101_1 = spill1393_9;
        break lexical_join_101;
    }
    if (!((spill1393_8 == spill1393_9))) {
        break lexical_join_154;
    }
    spill1393_10 = ((net.minecraft.item.ItemStack)(life7_120)).b;
    if (!((life4_9 == null))) {
        lexicalValue1393_107_0 = spill1393_10;
        break lexical_join_107;
    }
    lexicalValue1393_101_0 = spill1393_10;
    lexicalValue1393_101_1 = 1;
    }
    if (!((lexicalValue1393_101_0 == lexicalValue1393_101_1))) {
        break lexical_join_154;
    }
    spill1393_11 = ((net.minecraft.item.ItemStack)(life6_115)).a__wQ();
    if (!((life4_9 == null))) {
        lexicalValue1393_110_0 = spill1393_11;
        break lexical_join_110;
    }
    lexicalValue1393_107_0 = ((((net.minecraft.item.Item)(spill1393_11)).b__Boolean()) ? 1 : 0);
    }
    if (!((lexicalValue1393_107_0 != 0))) {
        break lexical_join_154;
    }
    lexicalValue1393_110_0 = ((net.minecraft.item.ItemStack)(life6_115)).a__wQ();
    }
    life8_172 = lexicalValue1393_110_0;
    life9_178 = (((net.minecraft.item.Item)(life8_172)).b() - ((net.minecraft.item.ItemStack)(life6_115)).b());
    life10_184 = (((net.minecraft.item.Item)(life8_172)).b() - ((net.minecraft.item.ItemStack)(life7_120)).b());
    life11_196 = ((life9_178 + life10_184) + ((((net.minecraft.item.Item)(life8_172)).b() * 5) / ((int) moom.x2.b)));
    life12_201 = (((net.minecraft.item.Item)(life8_172)).b() - life11_196);
    spill1393_12 = life12_201;
    if (!((life4_9 == null))) {
        lexicalValue1393_145_0 = spill1393_12;
        break lexical_join_145;
    }
    if (!((spill1393_12 < 0))) {
        break lexical_join_146;
    }
    lexicalValue1393_145_0 = 0;
    }
    life12_201 = lexicalValue1393_145_0;
    }
    return new net.minecraft.item.ItemStack(((net.minecraft.item.ItemStack)(life6_115)).a__wQ(), 1, life12_201);
    }
    return null;
}


public boolean a(moom.wx p0, net.minecraft.world.World p1) {
net.minecraft.item.ItemStack lexicalValue1391_47_0;
    int lexicalValue1391_65_0;
    int lexicalValue1391_76_0;
    int lexicalValue1391_78_0;
    java.lang.String spill1391_0;
    net.minecraft.item.ItemStack spill1391_1;
    int spill1391_2;
    int spill1391_3;
    boolean spill1391_4;
    int spill1391_5;
    long life3_3;
    java.util.ArrayList life6_6;
    int life7_8;
    java.lang.String life5_9;
    net.minecraft.item.ItemStack life8_17;
    net.minecraft.item.ItemStack life9_50;
    lexical_join_78: {
    lexical_join_77: {
    lexical_join_76: {
    lexical_join_69: {
    life3_3 = (moom.x2.a ^ 6249221518270L);
    spill1391_0 = moom.ye.b();
    life6_6 = com.google.common.collect.Lists.newArrayList();
    life7_8 = 0;
    life5_9 = spill1391_0;
    lexical_cycle_10: while (true) {
    lexical_join_67: {
    lexical_join_66: {
    lexical_join_65: {
    lexical_join_64: {
    lexical_join_47: {
    if (!((life7_8 < ((moom.wx)(p0)).b__Int()))) {
        break lexical_join_69;
    }
    life8_17 = ((moom.wx)(p0)).a__xW(((int)(life7_8)));
    if (!((life5_9 == null))) {
        break lexical_join_77;
    }
    if (!((life5_9 == null))) {
        break lexical_join_67;
    }
    if (!((life8_17 != null))) {
        break lexical_join_66;
    }
    ((java.util.List)(life6_6)).add(((java.lang.Object)(life8_17)));
    if (!((life5_9 == null))) {
        break lexical_join_67;
    }
    if (!((((java.util.List)(life6_6)).size() > 1))) {
        break lexical_join_66;
    }
    life9_50 = ((net.minecraft.item.ItemStack)(((java.util.List)(life6_6)).get(((int)(0)))));
    spill1391_1 = life8_17;
    if (!((life5_9 == null))) {
        lexicalValue1391_47_0 = spill1391_1;
        break lexical_join_47;
    }
    if (!((((net.minecraft.item.ItemStack)(spill1391_1)).a__wQ() == ((net.minecraft.item.ItemStack)(life9_50)).a__wQ()))) {
        break lexical_join_64;
    }
    lexicalValue1391_47_0 = life9_50;
    }
    spill1391_2 = ((net.minecraft.item.ItemStack)(lexicalValue1391_47_0)).b;
    if (!((life5_9 == null))) {
        lexicalValue1391_65_0 = spill1391_2;
        break lexical_join_65;
    }
    if (!((spill1391_2 == 1))) {
        break lexical_join_64;
    }
    spill1391_3 = ((net.minecraft.item.ItemStack)(life8_17)).b;
    if (!((life5_9 == null))) {
        lexicalValue1391_65_0 = spill1391_3;
        break lexical_join_65;
    }
    if (!((spill1391_3 == 1))) {
        break lexical_join_64;
    }
    spill1391_4 = ((net.minecraft.item.Item)(((net.minecraft.item.ItemStack)(life9_50)).a__wQ())).b__Boolean();
    if (!((life5_9 == null))) {
        lexicalValue1391_65_0 = ((spill1391_4) ? 1 : 0);
        break lexical_join_65;
    }
    if (!((!spill1391_4))) {
        break lexical_join_66;
    }
    }
    lexicalValue1391_65_0 = 0;
    }
    return ((lexicalValue1391_65_0) != 0);
    }
    life7_8 += 1;
    }
    if (!((life5_9 != null))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    spill1391_5 = ((java.util.List)(life6_6)).size();
    if (!((life5_9 == null))) {
        lexicalValue1391_76_0 = spill1391_5;
        break lexical_join_76;
    }
    if (!((spill1391_5 == 2))) {
        break lexical_join_77;
    }
    lexicalValue1391_76_0 = 1;
    }
    lexicalValue1391_78_0 = lexicalValue1391_76_0;
    break lexical_join_78;
    }
    lexicalValue1391_78_0 = 0;
    }
    return ((lexicalValue1391_78_0) != 0);
}

}
