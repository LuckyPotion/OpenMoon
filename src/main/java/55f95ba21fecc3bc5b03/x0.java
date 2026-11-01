package moom;


public class x0 implements net.minecraft.item.crafting.IRecipe {

private static final long a;

private static final long b;

public x0() {
super();
}


static {
a = ((long)(((moom._a)(moom._c.a(((long)(-3765520836158867395L)), ((long)(685868177338338993L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(198224764704992L)))));
    long local0_life6 = (moom.x0.a ^ 72701389449935L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill1096_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1096_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1096_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1096_13 = new byte[8];
    (__sourceSpill1096_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill1096_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation1096_15 = __sourceSpill1096_13;
    ((javax.crypto.Cipher)(__sourceSpill1096_10)).init(((int)(__sourceSpill1096_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1096_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1096_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -4054819535584862427L;
    byte[] __sourceSpill1096_19 = new byte[8];
    (__sourceSpill1096_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill1096_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill1096_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill1096_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill1096_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill1096_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill1096_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill1096_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill1096_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill1096_20)).doFinal(((byte[])(__sourceSpill1096_19)));
    b = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public net.minecraft.item.ItemStack[] a__ArrayxW(moom.wx p0) {
java.lang.String spill1387_0;
    long life2_3;
    net.minecraft.item.ItemStack[] life5_8;
    int life6_10;
    java.lang.String life4_11;
    net.minecraft.item.ItemStack life7_19;
    lexical_join_37: {
    life2_3 = (moom.x0.a ^ 126386952153425L);
    spill1387_0 = moom.ye.b();
    life5_8 = new net.minecraft.item.ItemStack[((moom.wx)(p0)).b__Int()];
    life6_10 = 0;
    life4_11 = spill1387_0;
    lexical_cycle_12: while (true) {
    lexical_join_35: {
    lexical_join_34: {
    if (!((life6_10 < (life5_8).length))) {
        break lexical_join_37;
    }
    life7_19 = ((moom.wx)(p0)).a__xW(((int)(life6_10)));
    if (!((life4_11 == null))) {
        break lexical_join_35;
    }
    if (!((life7_19 != null))) {
        break lexical_join_34;
    }
    if (!((((((net.minecraft.item.ItemStack)(life7_19)).a__wQ() instanceof moom.xe) ? 1 : 0) != 0))) {
        break lexical_join_34;
    }
    (life5_8)[life6_10] = life7_19;
    if (!((life4_11 != null))) {
        break lexical_join_37;
    }
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
return null;
}


public int a() {
long local1 = (moom.x0.a ^ 25416980431001L);
    return ((int) moom.x0.b);
}


public net.minecraft.item.ItemStack a__xW(moom.wx p0) {
net.minecraft.item.ItemStack lexicalValue1388_39_0;
    net.minecraft.item.Item lexicalValue1388_45_0;
    net.minecraft.item.Item lexicalValue1388_45_1;
    net.minecraft.item.ItemStack lexicalValue1388_53_0;
    int lexicalValue1388_64_0;
    int lexicalValue1388_64_1;
    net.minecraft.item.ItemStack lexicalValue1388_70_0;
    net.minecraft.item.ItemStack lexicalValue1388_96_0;
    java.lang.String spill1388_0;
    net.minecraft.item.ItemStack spill1388_1;
    net.minecraft.item.Item spill1388_2;
    net.minecraft.item.Item spill1388_3;
    net.minecraft.item.ItemStack spill1388_4;
    int spill1388_5;
    int spill1388_6;
    net.minecraft.item.ItemStack spill1388_7;
    net.minecraft.item.ItemStack spill1388_8;
    long life2_3;
    int life5_6;
    net.minecraft.item.ItemStack life6_8;
    java.lang.String life4_9;
    int life7_11;
    net.minecraft.item.ItemStack life8_19;
    net.minecraft.item.ItemStack life7_110;
    lexical_join_97: {
    lexical_join_96: {
    lexical_join_95: {
    lexical_join_70: {
    lexical_join_64: {
    lexical_join_53: {
    lexical_join_52: {
    life2_3 = (moom.x0.a ^ 33328393473790L);
    spill1388_0 = moom.ye.b();
    life5_6 = 0;
    life6_8 = null;
    life4_9 = spill1388_0;
    life7_11 = 0;
    lexical_cycle_12: while (true) {
    lexical_join_50: {
    lexical_join_49: {
    lexical_join_48: {
    lexical_join_45: {
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
    spill1388_1 = life8_19;
    if (!((life4_9 == null))) {
        lexicalValue1388_53_0 = spill1388_1;
        break lexical_join_53;
    }
    if (!((spill1388_1 != null))) {
        break lexical_join_49;
    }
    spill1388_2 = ((net.minecraft.item.ItemStack)(life8_19)).a__wQ();
    spill1388_3 = net.minecraft.init.Items.bC;
    if (!((life4_9 == null))) {
        lexicalValue1388_45_0 = spill1388_2;
        lexicalValue1388_45_1 = spill1388_3;
        break lexical_join_45;
    }
    if (!((spill1388_2 == spill1388_3))) {
        break lexical_join_42;
    }
    spill1388_4 = life6_8;
    if (!((life4_9 == null))) {
        lexicalValue1388_39_0 = spill1388_4;
        break lexical_join_39;
    }
    if (!((spill1388_4 != null))) {
        break lexical_join_38;
    }
    return null;
    }
    lexicalValue1388_39_0 = life8_19;
    }
    life6_8 = lexicalValue1388_39_0;
    if (!((life4_9 != null))) {
        break lexical_join_49;
    }
    }
    lexicalValue1388_45_0 = ((net.minecraft.item.ItemStack)(life8_19)).a__wQ();
    lexicalValue1388_45_1 = net.minecraft.init.Items.bB;
    }
    if (!((lexicalValue1388_45_0 != lexicalValue1388_45_1))) {
        break lexical_join_48;
    }
    return null;
    }
    life5_6 += 1;
    }
    life7_11 += 1;
    }
    if (!((life4_9 != null))) { continue lexical_cycle_12; }
    break lexical_cycle_12;
    }
    }
    lexicalValue1388_53_0 = life6_8;
    }
    if (!((lexicalValue1388_53_0 != null))) {
        break lexical_join_97;
    }
    spill1388_5 = life5_6;
    spill1388_6 = 1;
    if (!((life4_9 == null))) {
        lexicalValue1388_64_0 = spill1388_5;
        lexicalValue1388_64_1 = spill1388_6;
        break lexical_join_64;
    }
    if (!((spill1388_5 >= spill1388_6))) {
        break lexical_join_97;
    }
    spill1388_7 = life6_8;
    if (!((life4_9 == null))) {
        lexicalValue1388_70_0 = spill1388_7;
        break lexical_join_70;
    }
    lexicalValue1388_64_0 = moom.xe.b(((net.minecraft.item.ItemStack)(spill1388_7)));
    lexicalValue1388_64_1 = 2;
    }
    if (!((lexicalValue1388_64_0 < lexicalValue1388_64_1))) {
        break lexical_join_97;
    }
    lexicalValue1388_70_0 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.bC, life5_6);
    }
    life7_110 = lexicalValue1388_70_0;
    ((net.minecraft.item.ItemStack)(life7_110)).b(((net.minecraft.nbt.NBTTagCompound)(((net.minecraft.nbt.NBTTagCompound)(((net.minecraft.nbt.NBTTagCompound)(((net.minecraft.item.ItemStack)(life6_8)).a__yw())).a__yn())))));
    ((net.minecraft.nbt.NBTTagCompound)(((net.minecraft.item.ItemStack)(life7_110)).a__yw())).a__Void(((java.lang.String)("generation")), ((int)((moom.xe.b(((net.minecraft.item.ItemStack)(life6_8))) + 1))));
    spill1388_8 = life6_8;
    if (!((life4_9 == null))) {
        lexicalValue1388_96_0 = spill1388_8;
        break lexical_join_96;
    }
    if (!(((net.minecraft.item.ItemStack)(spill1388_8)).f__Boolean())) {
        break lexical_join_95;
    }
    ((net.minecraft.item.ItemStack)(life7_110)).a(((java.lang.String)(((net.minecraft.item.ItemStack)(life6_8)).b__String())));
    }
    lexicalValue1388_96_0 = life7_110;
    }
    return lexicalValue1388_96_0;
    }
    return null;
}


public boolean a(moom.wx p0, net.minecraft.world.World p1) {
net.minecraft.item.ItemStack lexicalValue1386_39_0;
    net.minecraft.item.Item lexicalValue1386_45_0;
    net.minecraft.item.Item lexicalValue1386_45_1;
    net.minecraft.item.ItemStack lexicalValue1386_53_0;
    int lexicalValue1386_59_0;
    int lexicalValue1386_61_0;
    java.lang.String spill1386_0;
    net.minecraft.item.ItemStack spill1386_1;
    net.minecraft.item.Item spill1386_2;
    net.minecraft.item.Item spill1386_3;
    net.minecraft.item.ItemStack spill1386_4;
    int spill1386_5;
    long life3_3;
    int life6_5;
    net.minecraft.item.ItemStack life7_7;
    int life8_10;
    java.lang.String life5_11;
    net.minecraft.item.ItemStack life9_19;
    lexical_join_61: {
    lexical_join_60: {
    lexical_join_59: {
    lexical_join_53: {
    lexical_join_52: {
    life3_3 = (moom.x0.a ^ 111886830374181L);
    life6_5 = 0;
    life7_7 = null;
    spill1386_0 = moom.ye.b();
    life8_10 = 0;
    life5_11 = spill1386_0;
    lexical_cycle_12: while (true) {
    lexical_join_50: {
    lexical_join_49: {
    lexical_join_48: {
    lexical_join_45: {
    lexical_join_42: {
    lexical_join_39: {
    lexical_join_38: {
    if (!((life8_10 < ((moom.wx)(p0)).b__Int()))) {
        break lexical_join_52;
    }
    life9_19 = ((moom.wx)(p0)).a__xW(((int)(life8_10)));
    if (!((life5_11 == null))) {
        break lexical_join_50;
    }
    spill1386_1 = life9_19;
    if (!((life5_11 == null))) {
        lexicalValue1386_53_0 = spill1386_1;
        break lexical_join_53;
    }
    if (!((spill1386_1 != null))) {
        break lexical_join_49;
    }
    spill1386_2 = ((net.minecraft.item.ItemStack)(life9_19)).a__wQ();
    spill1386_3 = net.minecraft.init.Items.bC;
    if (!((life5_11 == null))) {
        lexicalValue1386_45_0 = spill1386_2;
        lexicalValue1386_45_1 = spill1386_3;
        break lexical_join_45;
    }
    if (!((spill1386_2 == spill1386_3))) {
        break lexical_join_42;
    }
    spill1386_4 = life7_7;
    if (!((life5_11 == null))) {
        lexicalValue1386_39_0 = spill1386_4;
        break lexical_join_39;
    }
    if (!((spill1386_4 != null))) {
        break lexical_join_38;
    }
    return ((0) != 0);
    }
    lexicalValue1386_39_0 = life9_19;
    }
    life7_7 = lexicalValue1386_39_0;
    if (!((life5_11 != null))) {
        break lexical_join_49;
    }
    }
    lexicalValue1386_45_0 = ((net.minecraft.item.ItemStack)(life9_19)).a__wQ();
    lexicalValue1386_45_1 = net.minecraft.init.Items.bB;
    }
    if (!((lexicalValue1386_45_0 != lexicalValue1386_45_1))) {
        break lexical_join_48;
    }
    return ((0) != 0);
    }
    life6_5 += 1;
    }
    life8_10 += 1;
    }
    if (!((life5_11 != null))) { continue lexical_cycle_12; }
    break lexical_cycle_12;
    }
    }
    lexicalValue1386_53_0 = life7_7;
    }
    if (!((lexicalValue1386_53_0 != null))) {
        break lexical_join_60;
    }
    spill1386_5 = life6_5;
    if (!((life5_11 == null))) {
        lexicalValue1386_59_0 = spill1386_5;
        break lexical_join_59;
    }
    if (!((spill1386_5 > 0))) {
        break lexical_join_60;
    }
    lexicalValue1386_59_0 = 1;
    }
    lexicalValue1386_61_0 = lexicalValue1386_59_0;
    break lexical_join_61;
    }
    lexicalValue1386_61_0 = 0;
    }
    return ((lexicalValue1386_61_0) != 0);
}

}
