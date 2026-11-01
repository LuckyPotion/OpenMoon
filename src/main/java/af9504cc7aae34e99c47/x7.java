package moom;


class x7 implements net.minecraft.item.crafting.IRecipe {

private static final long a;

private x7() {
super();
}


static {
a = (moom._c.a(-2155917436845702443L, -303301841631471111L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(72671083522486L);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public net.minecraft.item.ItemStack[] a__ArrayxW(moom.wx p0) {
int lexicalValue1403_43_0;
    int lexicalValue1403_50_0;
    net.minecraft.item.ItemStack lexicalValue1403_59_0;
    java.lang.String spill1403_0;
    boolean spill1403_1;
    net.minecraft.item.ItemStack spill1403_2;
    long life2_3;
    net.minecraft.item.ItemStack[] life5_7;
    int life6_10;
    java.lang.String life4_11;
    net.minecraft.item.ItemStack life7_19;
    lexical_join_64: {
    life2_3 = (moom.x7.a ^ 44910995143819L);
    life5_7 = new net.minecraft.item.ItemStack[((moom.wx)(p0)).b__Int()];
    spill1403_0 = moom.ye.b();
    life6_10 = 0;
    life4_11 = spill1403_0;
    lexical_cycle_12: while (true) {
    lexical_join_62: {
    lexical_join_61: {
    lexical_join_59: {
    lexical_join_50: {
    lexical_join_43: {
    lexical_join_41: {
    if (!((life6_10 < (life5_7).length))) {
        break lexical_join_64;
    }
    life7_19 = ((moom.wx)(p0)).a__xW(((int)(life6_10)));
    if (!((life4_11 == null))) {
        break lexical_join_62;
    }
    if (!((life7_19 != null))) {
        break lexical_join_61;
    }
    spill1403_1 = ((net.minecraft.item.Item)(((net.minecraft.item.ItemStack)(life7_19)).a__wQ())).f();
    if (!((life4_11 == null))) {
        lexicalValue1403_43_0 = ((spill1403_1) ? 1 : 0);
        break lexical_join_43;
    }
    if (!(spill1403_1)) {
        break lexical_join_41;
    }
    (life5_7)[life6_10] = new net.minecraft.item.ItemStack(((net.minecraft.item.Item)(((net.minecraft.item.ItemStack)(life7_19)).a__wQ())).b__wQ());
    if (!((life4_11 != null))) {
        break lexical_join_61;
    }
    }
    lexicalValue1403_43_0 = ((((net.minecraft.item.ItemStack)(life7_19)).e__Boolean()) ? 1 : 0);
    }
    if (!((life4_11 == null))) {
        lexicalValue1403_50_0 = lexicalValue1403_43_0;
        break lexical_join_50;
    }
    if (!((lexicalValue1403_43_0 != 0))) {
        break lexical_join_61;
    }
    spill1403_2 = life7_19;
    if (!((life4_11 == null))) {
        lexicalValue1403_59_0 = spill1403_2;
        break lexical_join_59;
    }
    lexicalValue1403_50_0 = moom.Ca.b(((net.minecraft.item.ItemStack)(spill1403_2)));
    }
    if (!((lexicalValue1403_50_0 > 0))) {
        break lexical_join_61;
    }
    (life5_7)[life6_10] = ((net.minecraft.item.ItemStack)(life7_19)).a__xW();
    lexicalValue1403_59_0 = (life5_7)[life6_10];
    }
    ((net.minecraft.item.ItemStack)(lexicalValue1403_59_0)).b = ((int)(1));
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
return 2;
}


public net.minecraft.item.ItemStack a__xW(moom.wx p0) {
net.minecraft.item.ItemStack lexicalValue1404_27_0;
    java.lang.String spill1404_0;
    net.minecraft.item.ItemStack spill1404_1;
    long life2_3;
    int life5_6;
    java.lang.String life4_7;
    net.minecraft.item.ItemStack life6_15;
    net.minecraft.item.ItemStack life7_39;
    lexical_join_36: {
    life2_3 = (moom.x7.a ^ 75203695057700L);
    spill1404_0 = moom.ye.b();
    life5_6 = 0;
    life4_7 = spill1404_0;
    lexical_cycle_8: while (true) {
    lexical_join_34: {
    lexical_join_33: {
    lexical_join_27: {
    if (!((life5_6 < ((moom.wx)(p0)).b__Int()))) {
        break lexical_join_36;
    }
    life6_15 = ((moom.wx)(p0)).a__xW(((int)(life5_6)));
    if (!((life4_7 == null))) {
        break lexical_join_34;
    }
    if (!((life6_15 != null))) {
        break lexical_join_33;
    }
    spill1404_1 = life6_15;
    if (!((life4_7 == null))) {
        lexicalValue1404_27_0 = spill1404_1;
        break lexical_join_27;
    }
    if (!((moom.Ca.b(((net.minecraft.item.ItemStack)(spill1404_1))) > 0))) {
        break lexical_join_33;
    }
    lexicalValue1404_27_0 = ((net.minecraft.item.ItemStack)(life6_15)).a__xW();
    }
    life7_39 = lexicalValue1404_27_0;
    ((net.minecraft.item.ItemStack)(life7_39)).b = ((int)(1));
    return life7_39;
    }
    life5_6 += 1;
    }
    if (!((life4_7 != null))) { continue lexical_cycle_8; }
    break lexical_cycle_8;
    }
    }
    return null;
}


public boolean a(moom.wx p0, net.minecraft.world.World p1) {
net.minecraft.item.ItemStack lexicalValue1402_35_0;
    net.minecraft.item.ItemStack lexicalValue1402_45_0;
    int lexicalValue1402_53_0;
    int lexicalValue1402_55_0;
    int lexicalValue1402_67_0;
    int lexicalValue1402_73_0;
    net.minecraft.item.ItemStack lexicalValue1402_79_0;
    int lexicalValue1402_87_0;
    int lexicalValue1402_93_0;
    net.minecraft.item.ItemStack lexicalValue1402_110_0;
    net.minecraft.item.ItemStack lexicalValue1402_114_0;
    int lexicalValue1402_118_0;
    java.lang.String spill1402_0;
    net.minecraft.item.ItemStack spill1402_1;
    net.minecraft.item.ItemStack spill1402_2;
    net.minecraft.item.ItemStack spill1402_3;
    int spill1402_4;
    net.minecraft.item.ItemStack spill1402_5;
    int spill1402_6;
    int spill1402_7;
    long life3_3;
    net.minecraft.item.ItemStack life6_5;
    net.minecraft.item.ItemStack life7_7;
    int life8_10;
    java.lang.String life5_11;
    net.minecraft.item.ItemStack life9_19;
    int life10_71;
    int life11_83;
    lexical_join_118: {
    lexical_join_117: {
    lexical_join_114: {
    lexical_join_110: {
    lexical_join_109: {
    life3_3 = (moom.x7.a ^ 70269025507583L);
    life6_5 = null;
    life7_7 = null;
    spill1402_0 = moom.ye.b();
    life8_10 = 0;
    life5_11 = spill1402_0;
    lexical_cycle_12: while (true) {
    lexical_join_107: {
    lexical_join_106: {
    lexical_join_104: {
    lexical_join_98: {
    lexical_join_94: {
    lexical_join_93: {
    lexical_join_87: {
    lexical_join_86: {
    lexical_join_79: {
    lexical_join_78: {
    lexical_join_74: {
    lexical_join_73: {
    lexical_join_67: {
    lexical_join_66: {
    lexical_join_55: {
    lexical_join_54: {
    lexical_join_53: {
    lexical_join_45: {
    lexical_join_44: {
    lexical_join_35: {
    lexical_join_34: {
    if (!((life8_10 < ((moom.wx)(p0)).b__Int()))) {
        break lexical_join_109;
    }
    life9_19 = ((moom.wx)(p0)).a__xW(((int)(life8_10)));
    if (!((life5_11 == null))) {
        break lexical_join_107;
    }
    spill1402_1 = life9_19;
    if (!((life5_11 == null))) {
        lexicalValue1402_110_0 = spill1402_1;
        break lexical_join_110;
    }
    if (!((spill1402_1 != null))) {
        break lexical_join_106;
    }
    spill1402_2 = life9_19;
    if (!((life5_11 == null))) {
        lexicalValue1402_35_0 = spill1402_2;
        break lexical_join_35;
    }
    if (!((((net.minecraft.item.ItemStack)(spill1402_2)).a__wQ() != net.minecraft.init.Items.ci))) {
        break lexical_join_34;
    }
    return ((0) != 0);
    }
    lexicalValue1402_35_0 = life6_5;
    }
    if (!((life5_11 == null))) {
        lexicalValue1402_45_0 = lexicalValue1402_35_0;
        break lexical_join_45;
    }
    if (!((lexicalValue1402_35_0 != null))) {
        break lexical_join_44;
    }
    spill1402_3 = life7_7;
    if (!((life5_11 == null))) {
        lexicalValue1402_45_0 = spill1402_3;
        break lexical_join_45;
    }
    if (!((spill1402_3 != null))) {
        break lexical_join_44;
    }
    return ((0) != 0);
    }
    lexicalValue1402_45_0 = life9_19;
    }
    life10_71 = moom.Ca.a(((net.minecraft.item.ItemStack)(lexicalValue1402_45_0)));
    spill1402_4 = moom.Ca.b(((net.minecraft.item.ItemStack)(life9_19)));
    if (!((life5_11 == null))) {
        lexicalValue1402_53_0 = spill1402_4;
        break lexical_join_53;
    }
    if (!((spill1402_4 > 0))) {
        break lexical_join_54;
    }
    lexicalValue1402_53_0 = 1;
    }
    lexicalValue1402_55_0 = lexicalValue1402_53_0;
    break lexical_join_55;
    }
    lexicalValue1402_55_0 = 0;
    }
    life11_83 = lexicalValue1402_55_0;
    spill1402_5 = life6_5;
    if (!((life5_11 == null))) {
        lexicalValue1402_79_0 = spill1402_5;
        break lexical_join_79;
    }
    if (!((spill1402_5 != null))) {
        break lexical_join_78;
    }
    spill1402_6 = life11_83;
    if (!((life5_11 == null))) {
        lexicalValue1402_67_0 = spill1402_6;
        break lexical_join_67;
    }
    if (!((spill1402_6 != 0))) {
        break lexical_join_66;
    }
    return ((0) != 0);
    }
    lexicalValue1402_67_0 = life10_71;
    }
    if (!((life5_11 == null))) {
        lexicalValue1402_73_0 = lexicalValue1402_67_0;
        break lexical_join_73;
    }
    if (!((lexicalValue1402_67_0 != moom.Ca.a(((net.minecraft.item.ItemStack)(life6_5)))))) {
        break lexical_join_74;
    }
    lexicalValue1402_73_0 = 0;
    }
    return ((lexicalValue1402_73_0) != 0);
    }
    life7_7 = life9_19;
    if (!((life5_11 != null))) {
        break lexical_join_106;
    }
    }
    lexicalValue1402_79_0 = life7_7;
    }
    if (!((lexicalValue1402_79_0 != null))) {
        break lexical_join_98;
    }
    spill1402_7 = life11_83;
    if (!((life5_11 == null))) {
        lexicalValue1402_87_0 = spill1402_7;
        break lexical_join_87;
    }
    if (!((spill1402_7 == 0))) {
        break lexical_join_86;
    }
    return ((0) != 0);
    }
    lexicalValue1402_87_0 = life10_71;
    }
    if (!((life5_11 == null))) {
        lexicalValue1402_93_0 = lexicalValue1402_87_0;
        break lexical_join_93;
    }
    if (!((lexicalValue1402_87_0 != moom.Ca.a(((net.minecraft.item.ItemStack)(life7_7)))))) {
        break lexical_join_94;
    }
    lexicalValue1402_93_0 = 0;
    }
    return ((lexicalValue1402_93_0) != 0);
    }
    life6_5 = life9_19;
    if (!((life5_11 != null))) {
        break lexical_join_106;
    }
    }
    if (!((life11_83 != 0))) {
        break lexical_join_104;
    }
    life6_5 = life9_19;
    if (!((life5_11 != null))) {
        break lexical_join_106;
    }
    }
    life7_7 = life9_19;
    }
    life8_10 += 1;
    }
    if (!((life5_11 != null))) { continue lexical_cycle_12; }
    break lexical_cycle_12;
    }
    }
    lexicalValue1402_110_0 = life6_5;
    }
    if (!((life5_11 == null))) {
        lexicalValue1402_114_0 = lexicalValue1402_110_0;
        break lexical_join_114;
    }
    if (!((lexicalValue1402_110_0 != null))) {
        break lexical_join_117;
    }
    lexicalValue1402_114_0 = life7_7;
    }
    if (!((lexicalValue1402_114_0 != null))) {
        break lexical_join_117;
    }
    lexicalValue1402_118_0 = 1;
    break lexical_join_118;
    }
    lexicalValue1402_118_0 = 0;
    }
    return ((lexicalValue1402_118_0) != 0);
}

}
