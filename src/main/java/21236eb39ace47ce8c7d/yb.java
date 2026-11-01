package moom;


public class yb implements net.minecraft.item.crafting.IRecipe {

private static final long a;

private static final long b;

public yb() {
super();
}


static {
a = ((long)(((moom._a)(moom._c.a(((long)(-8458548667743279751L)), ((long)(-3450458846038687079L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(154733310156058L)))));
    long local0_life6 = (moom.yb.a ^ 86277065513581L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill1126_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1126_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1126_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1126_13 = new byte[8];
    (__sourceSpill1126_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill1126_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation1126_15 = __sourceSpill1126_13;
    ((javax.crypto.Cipher)(__sourceSpill1126_10)).init(((int)(__sourceSpill1126_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1126_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1126_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = 6406065049780784388L;
    byte[] __sourceSpill1126_19 = new byte[8];
    (__sourceSpill1126_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill1126_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill1126_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill1126_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill1126_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill1126_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill1126_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill1126_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill1126_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill1126_20)).doFinal(((byte[])(__sourceSpill1126_19)));
    b = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public net.minecraft.item.ItemStack[] a__ArrayxW(moom.wx p0) {
java.lang.String spill1426_0;
    long life2_3;
    net.minecraft.item.ItemStack[] life5_8;
    java.lang.String life4_9;
    int life6_11;
    net.minecraft.item.ItemStack life7_19;
    lexical_join_40: {
    life2_3 = (moom.yb.a ^ 120948537913988L);
    spill1426_0 = moom.ye.b();
    life5_8 = new net.minecraft.item.ItemStack[((moom.wx)(p0)).b__Int()];
    life4_9 = spill1426_0;
    life6_11 = 0;
    lexical_cycle_12: while (true) {
    lexical_join_38: {
    lexical_join_37: {
    if (!((life6_11 < (life5_8).length))) {
        break lexical_join_40;
    }
    life7_19 = ((moom.wx)(p0)).a__xW(((int)(life6_11)));
    if (!((life4_9 == null))) {
        break lexical_join_38;
    }
    if (!((life7_19 != null))) {
        break lexical_join_37;
    }
    if (!(((net.minecraft.item.Item)(((net.minecraft.item.ItemStack)(life7_19)).a__wQ())).f())) {
        break lexical_join_37;
    }
    (life5_8)[life6_11] = new net.minecraft.item.ItemStack(((net.minecraft.item.Item)(((net.minecraft.item.ItemStack)(life7_19)).a__wQ())).b__wQ());
    }
    life6_11 += 1;
    }
    if (!((life4_9 != null))) { continue lexical_cycle_12; }
    break lexical_cycle_12;
    }
    }
    return life5_8;
}


public net.minecraft.item.ItemStack a__xW() {
return null;
}


public int a() {
long local1 = (moom.yb.a ^ 13123773225804L);
    return ((int) moom.yb.b);
}


public net.minecraft.item.ItemStack a__xW(moom.wx p0) {
net.minecraft.item.ItemStack lexicalValue1427_39_0;
    net.minecraft.item.Item lexicalValue1427_44_0;
    net.minecraft.item.ItemStack lexicalValue1427_53_0;
    net.minecraft.item.ItemStack lexicalValue1427_78_0;
    java.lang.String spill1427_0;
    net.minecraft.item.ItemStack spill1427_1;
    net.minecraft.item.Item spill1427_2;
    net.minecraft.item.ItemStack spill1427_3;
    net.minecraft.item.ItemStack spill1427_4;
    long life2_3;
    int life5_5;
    net.minecraft.item.ItemStack life6_8;
    java.lang.String life4_9;
    int life7_11;
    net.minecraft.item.ItemStack life8_19;
    net.minecraft.item.ItemStack life7_94;
    lexical_join_79: {
    lexical_join_78: {
    lexical_join_77: {
    lexical_join_53: {
    lexical_join_52: {
    life2_3 = (moom.yb.a ^ 3013335684395L);
    life5_5 = 0;
    spill1427_0 = moom.ye.b();
    life6_8 = null;
    life4_9 = spill1427_0;
    life7_11 = 0;
    lexical_cycle_12: while (true) {
    lexical_join_50: {
    lexical_join_49: {
    lexical_join_48: {
    lexical_join_44: {
    lexical_join_42: {
    lexical_join_39: {
    lexical_join_38: {
    if (!((life7_11 < ((moom.wx)(p0)).b__Int()))) {
        break lexical_join_52;
    }
    life8_19 = ((moom.wx)(p0)).a__xW(((int)(life7_11)));
    if (!((life4_9 == null))) {
        break lexical_join_50;
    }
    spill1427_1 = life8_19;
    if (!((life4_9 == null))) {
        lexicalValue1427_53_0 = spill1427_1;
        break lexical_join_53;
    }
    if (!((spill1427_1 != null))) {
        break lexical_join_49;
    }
    spill1427_2 = ((net.minecraft.item.ItemStack)(life8_19)).a__wQ();
    if (!((life4_9 == null))) {
        lexicalValue1427_44_0 = spill1427_2;
        break lexical_join_44;
    }
    if (!((spill1427_2 == net.minecraft.init.Items.a3))) {
        break lexical_join_42;
    }
    spill1427_3 = life6_8;
    if (!((life4_9 == null))) {
        lexicalValue1427_39_0 = spill1427_3;
        break lexical_join_39;
    }
    if (!((spill1427_3 != null))) {
        break lexical_join_38;
    }
    return null;
    }
    lexicalValue1427_39_0 = life8_19;
    }
    life6_8 = lexicalValue1427_39_0;
    if (!((life4_9 != null))) {
        break lexical_join_49;
    }
    }
    lexicalValue1427_44_0 = ((net.minecraft.item.ItemStack)(life8_19)).a__wQ();
    }
    if (!((lexicalValue1427_44_0 != net.minecraft.init.Items.bK))) {
        break lexical_join_48;
    }
    return null;
    }
    life5_5 += 1;
    }
    life7_11 += 1;
    }
    if (!((life4_9 != null))) { continue lexical_cycle_12; }
    break lexical_cycle_12;
    }
    }
    lexicalValue1427_53_0 = life6_8;
    }
    if (!((lexicalValue1427_53_0 != null))) {
        break lexical_join_79;
    }
    if (!((life5_5 >= 1))) {
        break lexical_join_79;
    }
    life7_94 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.a3, (life5_5 + 1), ((net.minecraft.item.ItemStack)(life6_8)).c());
    spill1427_4 = life6_8;
    if (!((life4_9 == null))) {
        lexicalValue1427_78_0 = spill1427_4;
        break lexical_join_78;
    }
    if (!(((net.minecraft.item.ItemStack)(spill1427_4)).f__Boolean())) {
        break lexical_join_77;
    }
    ((net.minecraft.item.ItemStack)(life7_94)).a(((java.lang.String)(((net.minecraft.item.ItemStack)(life6_8)).b__String())));
    }
    lexicalValue1427_78_0 = life7_94;
    }
    return lexicalValue1427_78_0;
    }
    return null;
}


public boolean a(moom.wx p0, net.minecraft.world.World p1) {
net.minecraft.item.ItemStack lexicalValue1425_39_0;
    net.minecraft.item.Item lexicalValue1425_44_0;
    net.minecraft.item.ItemStack lexicalValue1425_53_0;
    int lexicalValue1425_59_0;
    int lexicalValue1425_61_0;
    java.lang.String spill1425_0;
    net.minecraft.item.ItemStack spill1425_1;
    net.minecraft.item.Item spill1425_2;
    net.minecraft.item.ItemStack spill1425_3;
    int spill1425_4;
    long life3_3;
    int life6_6;
    net.minecraft.item.ItemStack life7_8;
    java.lang.String life5_9;
    int life8_11;
    net.minecraft.item.ItemStack life9_19;
    lexical_join_61: {
    lexical_join_60: {
    lexical_join_59: {
    lexical_join_53: {
    lexical_join_52: {
    life3_3 = (moom.yb.a ^ 133250974996208L);
    spill1425_0 = moom.ye.b();
    life6_6 = 0;
    life7_8 = null;
    life5_9 = spill1425_0;
    life8_11 = 0;
    lexical_cycle_12: while (true) {
    lexical_join_50: {
    lexical_join_49: {
    lexical_join_48: {
    lexical_join_44: {
    lexical_join_42: {
    lexical_join_39: {
    lexical_join_38: {
    if (!((life8_11 < ((moom.wx)(p0)).b__Int()))) {
        break lexical_join_52;
    }
    life9_19 = ((moom.wx)(p0)).a__xW(((int)(life8_11)));
    if (!((life5_9 == null))) {
        break lexical_join_50;
    }
    spill1425_1 = life9_19;
    if (!((life5_9 == null))) {
        lexicalValue1425_53_0 = spill1425_1;
        break lexical_join_53;
    }
    if (!((spill1425_1 != null))) {
        break lexical_join_49;
    }
    spill1425_2 = ((net.minecraft.item.ItemStack)(life9_19)).a__wQ();
    if (!((life5_9 == null))) {
        lexicalValue1425_44_0 = spill1425_2;
        break lexical_join_44;
    }
    if (!((spill1425_2 == net.minecraft.init.Items.a3))) {
        break lexical_join_42;
    }
    spill1425_3 = life7_8;
    if (!((life5_9 == null))) {
        lexicalValue1425_39_0 = spill1425_3;
        break lexical_join_39;
    }
    if (!((spill1425_3 != null))) {
        break lexical_join_38;
    }
    return ((0) != 0);
    }
    lexicalValue1425_39_0 = life9_19;
    }
    life7_8 = lexicalValue1425_39_0;
    if (!((life5_9 != null))) {
        break lexical_join_49;
    }
    }
    lexicalValue1425_44_0 = ((net.minecraft.item.ItemStack)(life9_19)).a__wQ();
    }
    if (!((lexicalValue1425_44_0 != net.minecraft.init.Items.bK))) {
        break lexical_join_48;
    }
    return ((0) != 0);
    }
    life6_6 += 1;
    }
    life8_11 += 1;
    }
    if (!((life5_9 != null))) { continue lexical_cycle_12; }
    break lexical_cycle_12;
    }
    }
    lexicalValue1425_53_0 = life7_8;
    }
    if (!((lexicalValue1425_53_0 != null))) {
        break lexical_join_60;
    }
    spill1425_4 = life6_6;
    if (!((life5_9 == null))) {
        lexicalValue1425_59_0 = spill1425_4;
        break lexical_join_59;
    }
    if (!((spill1425_4 > 0))) {
        break lexical_join_60;
    }
    lexicalValue1425_59_0 = 1;
    }
    lexicalValue1425_61_0 = lexicalValue1425_59_0;
    break lexical_join_61;
    }
    lexicalValue1425_61_0 = 0;
    }
    return ((lexicalValue1425_61_0) != 0);
}

}
