package moom;


public class IH extends net.minecraft.world.pathfinder.NodeProcessor {

private static final long g;

public IH() {
super();
}


static {
g = (moom._c.a(-697979111466146882L, -4476812829802094451L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(201546568848742L);
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


private moom.AZ a__AZ(net.minecraft.entity.Entity p0, int p1, int p2, int p3) {
long local5 = (moom.IH.g ^ 113510488027285L);
    int local7 = ((moom.IH)(this)).a(((net.minecraft.entity.Entity)(p0)), ((int)(p1)), ((int)(p2)), ((int)(p3)));
    return ((local7 == -1) ? ((moom.IH)(this)).a(((int)(p1)), ((int)(p2)), ((int)(p3))) : null);
}


private int a(net.minecraft.entity.Entity p0, int p1, int p2, int p3) {
int forestValue679_13_0;
    int forestValue679_70_0;
    net.minecraft.entity.Entity[] spill679_0;
    int spill679_1;
    int spill679_2;
    long life5_3;
    moom.DU life8_8;
    net.minecraft.entity.Entity[] life7_9;
    int life9_11;
    int life10_21;
    int life11_31;
    net.minecraft.block.Block life12_47;
    forest_join_70: {
    forest_join_69: {
    forest_join_67: {
    life5_3 = (moom.IH.g ^ 132579423768533L);
    spill679_0 = net.minecraft.world.pathfinder.NodeProcessor.b();
    life8_8 = new moom.DU();
    life7_9 = spill679_0;
    life9_11 = p1;
    forest_cycle_12: while (true) {
    forest_join_63: {
    forestValue679_13_0 = life9_11;
    forest_cycle_13: while (true) {
    if (!((forestValue679_13_0 < (p1 + ((moom.IH)(this)).c)))) {
        break forest_join_69;
    }
    spill679_1 = p2;
    if (!((life7_9 == null))) {
        forestValue679_70_0 = spill679_1;
        break forest_join_70;
    }
    life10_21 = spill679_1;
    forest_cycle_22: while (true) {
    forest_join_61: {
    forest_join_60: {
    if (!((life10_21 < (p2 + ((moom.IH)(this)).d)))) {
        break forest_join_63;
    }
    spill679_2 = p3;
    if (!((life7_9 == null))) {
        forestValue679_13_0 = spill679_2;
        continue forest_cycle_13;
    }
    life11_31 = spill679_2;
    forest_cycle_32: while (true) {
    forest_join_58: {
    forest_join_57: {
    if (!((life11_31 < (p3 + ((moom.IH)(this)).e)))) {
        break forest_join_60;
    }
    life12_47 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.IBlockAccess)(((moom.IH)(this)).a)).a__fE(((moom.DT)(((moom.DU)(life8_8)).a(((int)(life9_11)), ((int)(life10_21)), ((int)(life11_31)))))))).a__ch();
    if (!((life7_9 == null))) {
        break forest_join_61;
    }
    if (!((life7_9 == null))) {
        break forest_join_58;
    }
    if (!((((net.minecraft.block.Block)(life12_47)).a__fn() != moom.fn.h))) {
        break forest_join_57;
    }
    break forest_join_67;
    }
    life11_31 += 1;
    }
    if (!((life7_9 != null))) {
        continue forest_cycle_32;
    }
    break forest_cycle_32;
    }
    }
    life10_21 += 1;
    }
    if (!((life7_9 != null))) {
        continue forest_cycle_22;
    }
    break forest_cycle_22;
    }
    break forest_cycle_13;
    }
    }
    life9_11 += 1;
    if (!((life7_9 != null))) {
        continue forest_cycle_12;
    }
    break forest_cycle_12;
    }
    break forest_join_69;
    }
    return 0;
    }
    forestValue679_70_0 = -1;
    }
    return forestValue679_70_0;
}


public void a(net.minecraft.world.IBlockAccess p0, net.minecraft.entity.Entity p1) {
super.a(((net.minecraft.world.IBlockAccess)(p0)), ((net.minecraft.entity.Entity)(p1)));
    return;
}


public int a(moom.AZ[] p0, net.minecraft.entity.Entity p1, moom.AZ p2, moom.AZ p3, float p4) {
int lexicalValue790_55_0;
    net.minecraft.entity.Entity[] spill790_0;
    boolean spill790_1;
    long life6_3;
    int life9_6;
    net.minecraft.entity.Entity[] life8_7;
    moom.bs[] life10_9;
    int life11_12;
    int life12_14;
    moom.bs life13_21;
    moom.AZ life14_40;
    lexical_join_64: {
    life6_3 = (moom.IH.g ^ 692185147943L);
    spill790_0 = net.minecraft.world.pathfinder.NodeProcessor.b();
    life9_6 = 0;
    life8_7 = spill790_0;
    life10_9 = moom.bs.values();
    life11_12 = (life10_9).length;
    life12_14 = 0;
    lexical_cycle_15: while (true) {
    lexical_join_62: {
    lexical_join_61: {
    lexical_join_55: {
    if (!((life12_14 < life11_12))) {
        break lexical_join_64;
    }
    life13_21 = (life10_9)[life12_14];
    life14_40 = ((moom.IH)(this)).a__AZ(((net.minecraft.entity.Entity)(p1)), ((int)((((moom.AZ)(p2)).a + ((moom.bs)(life13_21)).c()))), ((int)((((moom.AZ)(p2)).b + ((moom.bs)(life13_21)).d()))), ((int)((((moom.AZ)(p2)).c + ((moom.bs)(life13_21)).e()))));
    if (!((life8_7 == null))) {
        break lexical_join_62;
    }
    if (!((life14_40 != null))) {
        break lexical_join_61;
    }
    spill790_1 = ((moom.AZ)(life14_40)).j;
    if (!((life8_7 == null))) {
        lexicalValue790_55_0 = ((spill790_1) ? 1 : 0);
        break lexical_join_55;
    }
    if (!((!spill790_1))) {
        break lexical_join_61;
    }
    lexicalValue790_55_0 = recovery.source.CarrierOps.fcmpg(((float)(((moom.AZ)(life14_40)).a(((moom.AZ)(p3))))), ((float)(p4)));
    }
    if (!((lexicalValue790_55_0 < 0))) {
        break lexical_join_61;
    }
    (p0)[(life9_6++)] = life14_40;
    }
    life12_14 += 1;
    }
    if (!((life8_7 != null))) { continue lexical_cycle_15; }
    break lexical_cycle_15;
    }
    }
    return life9_6;
}


public void a() {
super.a();
    return;
}


public moom.AZ a(net.minecraft.entity.Entity p0, double p1, double p2, double p3) {
return ((moom.IH)(this)).a(((int)(moom.Dr.b__Int(((double)((p1 - ((double) (((net.minecraft.entity.Entity)(p0)).G / 0x1.0p1f)))))))), ((int)(moom.Dr.b__Int(((double)((p2 + 0x1.0p-1d)))))), ((int)(moom.Dr.b__Int(((double)((p3 - ((double) (((net.minecraft.entity.Entity)(p0)).G / 0x1.0p1f)))))))));
}


public moom.AZ a(net.minecraft.entity.Entity p0) {
return ((moom.IH)(this)).a(((int)(moom.Dr.b__Int(((double)(((moom.CA)(((net.minecraft.entity.Entity)(p0)).b())).b))))), ((int)(moom.Dr.b__Int(((double)((((moom.CA)(((net.minecraft.entity.Entity)(p0)).b())).c + 0x1.0p-1d)))))), ((int)(moom.Dr.b__Int(((double)(((moom.CA)(((net.minecraft.entity.Entity)(p0)).b())).d))))));
}

}
