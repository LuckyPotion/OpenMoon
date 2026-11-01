package moom;


public class xx extends net.minecraft.item.Item {

private static final long n;

public xx() {
super();
    (this).a(net.minecraft.creativetab.CreativeTabs.i);
}


static {
n = (moom._c.a(-1657182259680455614L, -2584521339466295200L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(106471008254638L);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public static boolean a(net.minecraft.entity.player.EntityPlayer p0, net.minecraft.world.World p1, moom.DT p2) {
net.minecraft.entity.Entity lexicalValue1422_71_0;
    moom.sD lexicalValue1422_80_0;
    int lexicalValue1422_90_0;
    boolean spill1422_0;
    net.minecraft.entity.EntityLiving spill1422_1;
    boolean spill1422_2;
    moom.sD spill1422_3;
    long life3_3;
    moom.sD life6_8;
    int life7_10;
    double life8_12;
    int life5_13;
    int life10_16;
    int life11_19;
    int life12_22;
    java.util.Iterator life13_54;
    net.minecraft.entity.EntityLiving life14_61;
    lexical_join_90: {
    lexical_join_89: {
    life3_3 = (moom.xx.n ^ 10059938271093L);
    spill1422_0 = net.minecraft.item.ItemStack.m();
    life6_8 = moom.sD.b(((net.minecraft.world.World)(p1)), ((moom.DT)(p2)));
    life7_10 = 0;
    life8_12 = 0x1.cp2d;
    life5_13 = ((spill1422_0) ? 1 : 0);
    life10_16 = ((moom.DT)(p2)).a();
    life11_19 = ((moom.DT)(p2)).b();
    life12_22 = ((moom.DT)(p2)).c();
    life13_54 = ((java.util.List)(((net.minecraft.world.World)(p1)).a(((java.lang.Class)(net.minecraft.entity.EntityLiving.class)), ((moom.CA)(new moom.CA((((double) life10_16) - life8_12), (((double) life11_19) - life8_12), (((double) life12_22) - life8_12), (((double) life10_16) + life8_12), (((double) life11_19) + life8_12), (((double) life12_22) + life8_12))))))).iterator();
    lexical_cycle_55: while (true) {
    lexical_join_87: {
    lexical_join_81: {
    lexical_join_80: {
    lexical_join_71: {
    if (!(((java.util.Iterator)(life13_54)).hasNext())) {
        break lexical_join_89;
    }
    life14_61 = ((net.minecraft.entity.EntityLiving)(((java.util.Iterator)(life13_54)).next()));
    spill1422_1 = life14_61;
    if (!((life5_13 != 0))) {
        lexicalValue1422_71_0 = spill1422_1;
        break lexical_join_71;
    }
    spill1422_2 = ((net.minecraft.entity.EntityLiving)(spill1422_1)).T__Boolean();
    if (!((life5_13 != 0))) {
        lexicalValue1422_90_0 = ((spill1422_2) ? 1 : 0);
        break lexical_join_90;
    }
    if (!(spill1422_2)) {
        break lexical_join_87;
    }
    lexicalValue1422_71_0 = ((net.minecraft.entity.EntityLiving)(life14_61)).c__sourceReturn_09c029d8c3();
    }
    if (!((lexicalValue1422_71_0 == p0))) {
        break lexical_join_87;
    }
    spill1422_3 = life6_8;
    if (!((life5_13 != 0))) {
        lexicalValue1422_80_0 = spill1422_3;
        break lexical_join_80;
    }
    if (!((spill1422_3 == null))) {
        break lexical_join_81;
    }
    lexicalValue1422_80_0 = moom.sD.a(((net.minecraft.world.World)(p1)), ((moom.DT)(p2)));
    }
    life6_8 = lexicalValue1422_80_0;
    }
    ((net.minecraft.entity.EntityLiving)(life14_61)).a(((net.minecraft.entity.Entity)(life6_8)), ((boolean)(true)));
    life7_10 = 1;
    }
    if (!((life5_13 == 0))) { continue lexical_cycle_55; }
    break lexical_cycle_55;
    }
    }
    lexicalValue1422_90_0 = life7_10;
    }
    return ((lexicalValue1422_90_0) != 0);
}


public boolean a(net.minecraft.item.ItemStack p0, net.minecraft.entity.player.EntityPlayer p1, net.minecraft.world.World p2, moom.DT p3, moom.bs p4, float p5, float p6, float p7) {
int forwardValue4548_27_0;
    int forwardValue4548_29_0;
    boolean spill4548_0;
    int spill4548_1;
    boolean spill4548_2;
    long life9_3;
    net.minecraft.block.Block life12_9;
    int life11_10;
    forward_join_29: {
    forward_join_28: {
    forward_join_27: {
    forward_join_26: {
    life9_3 = (moom.xx.n ^ 105802837444844L);
    spill4548_0 = net.minecraft.item.ItemStack.l();
    life12_9 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p2)).a__fE(((moom.DT)(p3))))).a__ch();
    life11_10 = ((spill4548_0) ? 1 : 0);
    spill4548_1 = ((life12_9 instanceof moom.dz) ? 1 : 0);
    if (!((life11_10 == 0))) {
        forwardValue4548_29_0 = spill4548_1;
        break forward_join_29;
    }
    if (!((spill4548_1 != 0))) {
        break forward_join_28;
    }
    spill4548_2 = ((net.minecraft.world.World)(p2)).G;
    if (!((life11_10 == 0))) {
        forwardValue4548_27_0 = ((spill4548_2) ? 1 : 0);
        break forward_join_27;
    }
    if (!((!spill4548_2))) {
        break forward_join_26;
    }
    moom.xx.a(((net.minecraft.entity.player.EntityPlayer)(p1)), ((net.minecraft.world.World)(p2)), ((moom.DT)(p3)));
    }
    forwardValue4548_27_0 = 1;
    }
    return ((forwardValue4548_27_0) != 0);
    }
    forwardValue4548_29_0 = 0;
    }
    return ((forwardValue4548_29_0) != 0);
}

}
