package moom;


public abstract class ec extends net.minecraft.block.BlockRotatedPillar {

public static final moom.fw<net.minecraft.block.BlockLog$EnumAxis> R;

private static final long T;

public ec() {
super(moom.fn.d);
    (this).a(net.minecraft.creativetab.CreativeTabs.b);
    (this).c(0x1.0000000000000p+1f);
    (this).a(moom.ec.f);
}


static {
T = (moom._c.a(701180724618441521L, 364645672839649384L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(258944444556382L);
    R = moom.fw.a("axis", net.minecraft.block.BlockLog$EnumAxis.class);
}


public void c(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
net.minecraft.block.state.IBlockState lexicalValue1148_63_0;
    int lexicalValue1148_78_0;
    int[] spill1148_0;
    net.minecraft.block.state.IBlockState spill1148_1;
    boolean spill1148_2;
    long life4_3;
    int life7_5;
    int life8_10;
    int[] life6_11;
    java.util.Iterator life9_43;
    moom.DT life10_50;
    net.minecraft.block.state.IBlockState life11_54;
    lexical_join_81: {
    life4_3 = (moom.ec.T ^ 72931875631218L);
    life7_5 = 4;
    spill1148_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life8_10 = (life7_5 + 1);
    life6_11 = spill1148_0;
    if (!(((net.minecraft.world.World)(p0)).a__Boolean(((moom.DT)(((moom.DT)(p1)).a(((int)((-life8_10))), ((int)((-life8_10))), ((int)((-life8_10)))))), ((moom.DT)(((moom.DT)(p1)).a(((int)(life8_10)), ((int)(life8_10)), ((int)(life8_10)))))))) {
        break lexical_join_81;
    }
    life9_43 = ((java.lang.Iterable)(moom.DT.a(((moom.DT)(((moom.DT)(p1)).a(((int)((-life7_5))), ((int)((-life7_5))), ((int)((-life7_5)))))), ((moom.DT)(((moom.DT)(p1)).a(((int)(life7_5)), ((int)(life7_5)), ((int)(life7_5)))))))).iterator();
    lexical_cycle_44: while (true) {
    lexical_join_79: {
    lexical_join_78: {
    lexical_join_63: {
    if (!(((java.util.Iterator)(life9_43)).hasNext())) {
        break lexical_join_81;
    }
    life10_50 = ((moom.DT)(((java.util.Iterator)(life9_43)).next()));
    life11_54 = ((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life10_50)));
    spill1148_1 = life11_54;
    if (!((life6_11 != null))) {
        lexicalValue1148_63_0 = spill1148_1;
        break lexical_join_63;
    }
    if (!((((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(spill1148_1)).a__ch())).a__fn() == moom.fn.j))) {
        break lexical_join_79;
    }
    lexicalValue1148_63_0 = life11_54;
    }
    spill1148_2 = ((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(lexicalValue1148_63_0)).a(((net.minecraft.block.properties.IProperty)(moom.dH.S))))))).booleanValue();
    if (!((life6_11 != null))) {
        lexicalValue1148_78_0 = ((spill1148_2) ? 1 : 0);
        break lexical_join_78;
    }
    if (!((!spill1148_2))) {
        break lexical_join_79;
    }
    lexicalValue1148_78_0 = ((((net.minecraft.world.World)(p0)).a(((moom.DT)(life10_50)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(life11_54)).a__fE(((net.minecraft.block.properties.IProperty)(moom.dH.S)), ((java.lang.Comparable)(java.lang.Boolean.TRUE))))), ((int)(4)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(lexicalValue1148_78_0);
    }
    if (!((life6_11 == null))) { continue lexical_cycle_44; }
    break lexical_cycle_44;
    }
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public net.minecraft.block.state.IBlockState a(net.minecraft.world.World p0, moom.DT p1, moom.bs p2, float p3, float p4, float p5, int p6, net.minecraft.entity.EntityLivingBase p7) {
return ((net.minecraft.block.state.IBlockState)(super.a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((moom.bs)(p2)), ((float)(p3)), ((float)(p4)), ((float)(p5)), ((int)(p6)), ((net.minecraft.entity.EntityLivingBase)(p7))))).a__fE(((net.minecraft.block.properties.IProperty)(moom.ec.R)), ((java.lang.Comparable)(net.minecraft.block.BlockLog$EnumAxis.a(((net.minecraft.util.EnumFacing$Axis)(((moom.bs)(p2)).a__bt()))))));
}

}
