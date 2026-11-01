package moom;


public class CI {

private static final long a;

public CI() {
super();
}


static {
a = (moom._c.a(-4590304514286121816L, -8930077595011537756L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(146076566314451L);
}


public static net.minecraft.util.IChatComponent a(net.minecraft.command.ICommandSender p0, net.minecraft.util.IChatComponent p1, net.minecraft.entity.Entity p2) throws moom.b7 {
java.lang.Object forestValue228_40_0;
    moom.CK forestValue228_63_0;
    int forestValue228_72_0;
    int forestValue228_93_0;
    int forestValue228_108_0;
    net.minecraft.util.IChatComponent forestValue228_112_0;
    net.minecraft.util.IChatComponent forestValue228_182_0;
    boolean spill228_0;
    int spill228_1;
    java.util.List spill228_2;
    net.minecraft.util.IChatComponent spill228_3;
    net.minecraft.util.IChatComponent spill228_4;
    long life3_3;
    java.lang.Object life6_6;
    int life5_7;
    moom.CK life7_16;
    java.lang.String life8_19;
    java.util.List life9_27;
    net.minecraft.util.IChatComponent life6_66;
    java.lang.String life8_82;
    java.lang.Object[] life8_120;
    int life9_122;
    java.lang.Object life10_130;
    moom.CO life7_159;
    java.util.Iterator life8_171;
    net.minecraft.util.IChatComponent life9_178;
    forest_join_182: {
    forest_join_181: {
    forest_join_159: {
    forest_join_149: {
    forest_join_141: {
    forest_join_112: {
    forest_join_111: {
    forest_join_108: {
    forest_join_104: {
    forest_join_93: {
    forest_join_91: {
    forest_join_90: {
    forest_join_72: {
    forest_join_70: {
    forest_join_63: {
    forest_join_57: {
    forest_join_43: {
    forest_join_40: {
    forest_join_37: {
    life3_3 = (moom.CI.a ^ 79212576266274L);
    spill228_0 = moom.DS.c__Boolean();
    life6_6 = null;
    life5_7 = ((spill228_0) ? 1 : 0);
    spill228_1 = ((p1 instanceof moom.CK) ? 1 : 0);
    if (!((life5_7 != 0))) {
        forestValue228_72_0 = spill228_1;
        break forest_join_72;
    }
    if (!((spill228_1 != 0))) {
        break forest_join_70;
    }
    life7_16 = ((moom.CK)(p1));
    life8_19 = ((moom.CK)(life7_16)).d();
    if (!(moom.qU.b(((java.lang.String)(life8_19))))) {
        break forest_join_43;
    }
    life9_27 = moom.qU.a(((net.minecraft.command.ICommandSender)(p0)), ((java.lang.String)(life8_19)), ((java.lang.Class)(net.minecraft.entity.Entity.class)));
    spill228_2 = life9_27;
    if (!((life5_7 != 0))) {
        forestValue228_40_0 = spill228_2;
        break forest_join_40;
    }
    if (!((((java.util.List)(spill228_2)).size() != 1))) {
        break forest_join_37;
    }
    throw new moom.b9();
    }
    forestValue228_40_0 = ((java.util.List)(life9_27)).get(((int)(0)));
    }
    life8_19 = ((net.minecraft.entity.Entity)(((net.minecraft.entity.Entity)(forestValue228_40_0)))).a__String();
    }
    if (!((p2 != null))) {
        break forest_join_57;
    }
    if (!(((java.lang.String)(life8_19)).equals(((java.lang.Object)("*"))))) {
        break forest_join_57;
    }
    forestValue228_63_0 = new moom.CK(((net.minecraft.entity.Entity)(p2)).a__String(), ((moom.CK)(life7_16)).e());
    break forest_join_63;
    }
    forestValue228_63_0 = new moom.CK(life8_19, ((moom.CK)(life7_16)).e());
    }
    life6_66 = forestValue228_63_0;
    ((moom.CK)(((moom.CK)(life6_66)))).a__sourceReturn_a7421bf54c(((java.lang.String)(((moom.CK)(life7_16)).a())));
    break forest_join_149;
    }
    forestValue228_72_0 = ((p1 instanceof moom.CL) ? 1 : 0);
    }
    if (!((life5_7 != 0))) {
        forestValue228_93_0 = forestValue228_72_0;
        break forest_join_93;
    }
    if (!((forestValue228_72_0 != 0))) {
        break forest_join_91;
    }
    life8_82 = ((moom.CL)(((moom.CL)(p1)))).d();
    life6_66 = moom.qU.a(((net.minecraft.command.ICommandSender)(p0)), ((java.lang.String)(life8_82)));
    if (!((life6_66 == null))) {
        break forest_join_90;
    }
    life6_66 = new moom.CM("");
    }
    break forest_join_149;
    }
    forestValue228_93_0 = ((p1 instanceof moom.CM) ? 1 : 0);
    }
    if (!((life5_7 != 0))) {
        forestValue228_108_0 = forestValue228_93_0;
        break forest_join_108;
    }
    if (!((forestValue228_93_0 != 0))) {
        break forest_join_104;
    }
    life6_66 = new moom.CM(((moom.CM)(((moom.CM)(p1)))).d());
    break forest_join_149;
    }
    spill228_3 = p1;
    if (!((life5_7 != 0))) {
        forestValue228_112_0 = spill228_3;
        break forest_join_112;
    }
    forestValue228_108_0 = ((spill228_3 instanceof moom.CN) ? 1 : 0);
    }
    if (!((forestValue228_108_0 == 0))) {
        break forest_join_111;
    }
    return p1;
    }
    forestValue228_112_0 = p1;
    }
    life8_120 = ((moom.CN)(((moom.CN)(forestValue228_112_0)))).a__ArrayObject();
    life9_122 = 0;
    forest_cycle_117: while (true) {
    forest_join_139: {
    forest_join_138: {
    if (!((life9_122 < (life8_120).length))) {
        break forest_join_141;
    }
    life10_130 = (life8_120)[life9_122];
    if (!((life5_7 != 0))) {
        break forest_join_139;
    }
    if (!((((life10_130 instanceof net.minecraft.util.IChatComponent) ? 1 : 0) != 0))) {
        break forest_join_138;
    }
    (life8_120)[life9_122] = moom.CI.a(((net.minecraft.command.ICommandSender)(p0)), ((net.minecraft.util.IChatComponent)(((net.minecraft.util.IChatComponent)(life10_130)))), ((net.minecraft.entity.Entity)(p2)));
    }
    life9_122 += 1;
    }
    if (!((life5_7 == 0))) {
        continue forest_cycle_117;
    }
    break forest_cycle_117;
    }
    }
    life6_66 = new moom.CN(((moom.CN)(((moom.CN)(p1)))).d(), life8_120);
    }
    life7_159 = ((net.minecraft.util.IChatComponent)(p1)).a__CO();
    if (!((life7_159 != null))) {
        break forest_join_159;
    }
    ((net.minecraft.util.IChatComponent)(life6_66)).a(((moom.CO)(((moom.CO)(life7_159)).b__CO())));
    }
    life8_171 = ((java.util.List)(((net.minecraft.util.IChatComponent)(p1)).a__List())).iterator();
    forest_cycle_163: while (true) {
    if (!(((java.util.Iterator)(life8_171)).hasNext())) {
        break forest_join_181;
    }
    life9_178 = ((net.minecraft.util.IChatComponent)(((java.util.Iterator)(life8_171)).next()));
    spill228_4 = ((net.minecraft.util.IChatComponent)(life6_66)).a(((net.minecraft.util.IChatComponent)(moom.CI.a(((net.minecraft.command.ICommandSender)(p0)), ((net.minecraft.util.IChatComponent)(life9_178)), ((net.minecraft.entity.Entity)(p2))))));
    if (!((life5_7 != 0))) {
        forestValue228_182_0 = spill228_4;
        break forest_join_182;
    }
    recovery.source.CarrierOps.discard(spill228_4);
    if (!((life5_7 == 0))) {
        continue forest_cycle_163;
    }
    break forest_cycle_163;
    }
    }
    forestValue228_182_0 = life6_66;
    }
    return forestValue228_182_0;
}


private static moom.b7 a(moom.b7 p0) {
return p0;
}

}
