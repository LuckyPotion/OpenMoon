package moom;


public class Ez implements net.minecraft.world.IWorldAccess {

private final moom.Bl a;

private final net.minecraft.world.WorldServer b;

private static final long c;

public Ez(moom.Bl p0, net.minecraft.world.WorldServer p1) {
super();
    this.a = p0;
    this.b = p1;
}


static {
c = (moom._c.a(-5435955491754604935L, 5751344144832561732L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(9460950603281L);
}


public void b(moom.DT p0) {
return;
}


public void b(int p0, moom.DT p1, int p2) {
net.minecraft.entity.player.EntityPlayerMP lexicalValue603_24_0;
    net.minecraft.entity.player.EntityPlayerMP lexicalValue603_31_0;
    int lexicalValue603_38_0;
    java.lang.String spill603_0;
    net.minecraft.entity.player.EntityPlayerMP spill603_1;
    int spill603_2;
    long life4_3;
    java.util.Iterator life7_10;
    java.lang.String life6_11;
    net.minecraft.entity.player.EntityPlayerMP life8_18;
    double life9_57;
    double life11_64;
    double life13_71;
    lexical_join_82: {
    life4_3 = (moom.Ez.c ^ 9502552902420L);
    spill603_0 = net.minecraft.world.World.c__String();
    life7_10 = ((java.util.List)(((net.minecraft.server.management.ServerConfigurationManager)(((moom.Bl)(this.a)).a__BA())).a__List())).iterator();
    life6_11 = spill603_0;
    lexical_cycle_12: while (true) {
    lexical_join_80: {
    lexical_join_38: {
    lexical_join_31: {
    lexical_join_24: {
    if (!(((java.util.Iterator)(life7_10)).hasNext())) {
        break lexical_join_82;
    }
    life8_18 = ((net.minecraft.entity.player.EntityPlayerMP)(((java.util.Iterator)(life7_10)).next()));
    spill603_1 = life8_18;
    if (!((life6_11 == null))) {
        lexicalValue603_24_0 = spill603_1;
        break lexical_join_24;
    }
    if (!((spill603_1 != null))) {
        break lexical_join_80;
    }
    lexicalValue603_24_0 = life8_18;
    }
    if (!((life6_11 == null))) {
        lexicalValue603_31_0 = lexicalValue603_24_0;
        break lexical_join_31;
    }
    if (!((((net.minecraft.entity.player.EntityPlayerMP)(lexicalValue603_24_0)).i == this.b))) {
        break lexical_join_80;
    }
    lexicalValue603_31_0 = life8_18;
    }
    spill603_2 = ((net.minecraft.entity.player.EntityPlayerMP)(lexicalValue603_31_0)).e__Int();
    if (!((life6_11 == null))) {
        lexicalValue603_38_0 = spill603_2;
        break lexical_join_38;
    }
    if (!((spill603_2 != p0))) {
        break lexical_join_80;
    }
    lexicalValue603_38_0 = ((moom.DT)(p1)).a();
    }
    life9_57 = (((double) lexicalValue603_38_0) - ((net.minecraft.entity.player.EntityPlayerMP)(life8_18)).n);
    life11_64 = (((double) ((moom.DT)(p1)).b()) - ((net.minecraft.entity.player.EntityPlayerMP)(life8_18)).o);
    life13_71 = (((double) ((moom.DT)(p1)).c()) - ((net.minecraft.entity.player.EntityPlayerMP)(life8_18)).p);
    if (!((recovery.source.CarrierOps.dcmpg(((double)((((life9_57 * life9_57) + (life11_64 * life11_64)) + (life13_71 * life13_71)))), ((double)(0x1.0p10d))) < 0))) {
        break lexical_join_80;
    }
    ((net.minecraft.network.NetHandlerPlayServer)(((net.minecraft.entity.player.EntityPlayerMP)(life8_18)).cg)).a(((moom.yK)(new moom.z7(p0, p1, p2))));
    }
    if (!((life6_11 != null))) { continue lexical_cycle_12; }
    break lexical_cycle_12;
    }
    }
    return;
}


public void b(net.minecraft.entity.Entity p0) {
((net.minecraft.entity.EntityTracker)(((net.minecraft.world.WorldServer)(this.b)).a__t2())).b(((net.minecraft.entity.Entity)(p0)));
    ((net.minecraft.scoreboard.Scoreboard)(((net.minecraft.world.WorldServer)(this.b)).a__Bh())).a(((net.minecraft.entity.Entity)(p0)));
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(java.lang.String p0, moom.DT p1) {
return;
}


public void a(net.minecraft.entity.player.EntityPlayer p0, int p1, moom.DT p2, int p3) {
((net.minecraft.server.management.ServerConfigurationManager)(((moom.Bl)(this.a)).a__BA())).a(((net.minecraft.entity.player.EntityPlayer)(p0)), ((double)(((double) ((moom.DT)(p2)).a()))), ((double)(((double) ((moom.DT)(p2)).b()))), ((double)(((double) ((moom.DT)(p2)).c()))), ((double)(0x1.0p6d)), ((int)(((moom.EA)(((net.minecraft.world.WorldServer)(this.b)).v)).b())), ((moom.yK)(new moom.z_(p1, p2, p3, false))));
    return;
}


public void a(int p0, moom.DT p1, int p2) {
((net.minecraft.server.management.ServerConfigurationManager)(((moom.Bl)(this.a)).a__BA())).a(((moom.yK)(new moom.z_(p0, p1, p2, true))));
    return;
}


public void a__Void(int p0, boolean p1, double p2, double p3, double p4, double p5, double p6, double p7, int[] p8) {
return;
}


public void a(net.minecraft.entity.Entity p0) {
((net.minecraft.entity.EntityTracker)(((net.minecraft.world.WorldServer)(this.b)).a__t2())).a(((net.minecraft.entity.Entity)(p0)));
    return;
}


public void a(java.lang.String p0, double p1, double p2, double p3, float p4, float p5) {
net.minecraft.server.management.ServerConfigurationManager forwardValue1850_20_0;
    double forwardValue1850_20_1;
    double forwardValue1850_20_2;
    double forwardValue1850_20_3;
    float forwardValue1850_20_4;
    float forwardValue1850_20_5;
    net.minecraft.server.management.ServerConfigurationManager forwardValue1850_23_0;
    double forwardValue1850_23_1;
    double forwardValue1850_23_2;
    double forwardValue1850_23_3;
    net.minecraft.server.management.ServerConfigurationManager forwardValue1850_24_0;
    double forwardValue1850_24_1;
    double forwardValue1850_24_2;
    double forwardValue1850_24_3;
    double forwardValue1850_24_4;
    net.minecraft.server.management.ServerConfigurationManager spill1850_0;
    double spill1850_1;
    double spill1850_2;
    double spill1850_3;
    float spill1850_4;
    float spill1850_5;
    long life10_3;
    java.lang.String life12_5;
    forward_join_24: {
    forward_join_23: {
    forward_join_20: {
    life10_3 = (moom.Ez.c ^ 47093436695670L);
    life12_5 = net.minecraft.world.World.c__String();
    spill1850_0 = ((moom.Bl)(this.a)).a__BA();
    spill1850_1 = p1;
    spill1850_2 = p2;
    spill1850_3 = p3;
    spill1850_4 = p4;
    spill1850_5 = 0x1.0p0f;
    if (!((life12_5 == null))) {
        forwardValue1850_20_0 = spill1850_0;
        forwardValue1850_20_1 = spill1850_1;
        forwardValue1850_20_2 = spill1850_2;
        forwardValue1850_20_3 = spill1850_3;
        forwardValue1850_20_4 = spill1850_4;
        forwardValue1850_20_5 = spill1850_5;
        break forward_join_20;
    }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(spill1850_4)), ((float)(spill1850_5))) > 0))) {
        forwardValue1850_23_0 = spill1850_0;
        forwardValue1850_23_1 = spill1850_1;
        forwardValue1850_23_2 = spill1850_2;
        forwardValue1850_23_3 = spill1850_3;
        break forward_join_23;
    }
    forwardValue1850_20_0 = spill1850_0;
    forwardValue1850_20_1 = spill1850_1;
    forwardValue1850_20_2 = spill1850_2;
    forwardValue1850_20_3 = spill1850_3;
    forwardValue1850_20_4 = 0x1.0p4f;
    forwardValue1850_20_5 = p4;
    }
    forwardValue1850_24_0 = forwardValue1850_20_0;
    forwardValue1850_24_1 = forwardValue1850_20_1;
    forwardValue1850_24_2 = forwardValue1850_20_2;
    forwardValue1850_24_3 = forwardValue1850_20_3;
    forwardValue1850_24_4 = ((double) (forwardValue1850_20_4 * forwardValue1850_20_5));
    break forward_join_24;
    }
    forwardValue1850_24_0 = forwardValue1850_23_0;
    forwardValue1850_24_1 = forwardValue1850_23_1;
    forwardValue1850_24_2 = forwardValue1850_23_2;
    forwardValue1850_24_3 = forwardValue1850_23_3;
    forwardValue1850_24_4 = 0x1.0p4d;
    }
    ((net.minecraft.server.management.ServerConfigurationManager)(forwardValue1850_24_0)).a(((double)(forwardValue1850_24_1)), ((double)(forwardValue1850_24_2)), ((double)(forwardValue1850_24_3)), ((double)(forwardValue1850_24_4)), ((int)(((moom.EA)(((net.minecraft.world.WorldServer)(this.b)).v)).b())), ((moom.yK)(new moom.Aa(p0, p1, p2, p3, p4, p5))));
    return;
}


public void a(net.minecraft.entity.player.EntityPlayer p0, java.lang.String p1, double p2, double p3, double p4, float p5, float p6) {
net.minecraft.server.management.ServerConfigurationManager forwardValue1851_21_0;
    net.minecraft.entity.player.EntityPlayer forwardValue1851_21_1;
    double forwardValue1851_21_2;
    double forwardValue1851_21_3;
    double forwardValue1851_21_4;
    float forwardValue1851_21_5;
    float forwardValue1851_21_6;
    net.minecraft.server.management.ServerConfigurationManager forwardValue1851_24_0;
    net.minecraft.entity.player.EntityPlayer forwardValue1851_24_1;
    double forwardValue1851_24_2;
    double forwardValue1851_24_3;
    double forwardValue1851_24_4;
    net.minecraft.server.management.ServerConfigurationManager forwardValue1851_25_0;
    net.minecraft.entity.player.EntityPlayer forwardValue1851_25_1;
    double forwardValue1851_25_2;
    double forwardValue1851_25_3;
    double forwardValue1851_25_4;
    double forwardValue1851_25_5;
    net.minecraft.server.management.ServerConfigurationManager spill1851_0;
    net.minecraft.entity.player.EntityPlayer spill1851_1;
    double spill1851_2;
    double spill1851_3;
    double spill1851_4;
    float spill1851_5;
    float spill1851_6;
    long life11_3;
    java.lang.String life13_5;
    forward_join_25: {
    forward_join_24: {
    forward_join_21: {
    life11_3 = (moom.Ez.c ^ 76879516924039L);
    life13_5 = net.minecraft.world.World.c__String();
    spill1851_0 = ((moom.Bl)(this.a)).a__BA();
    spill1851_1 = p0;
    spill1851_2 = p2;
    spill1851_3 = p3;
    spill1851_4 = p4;
    spill1851_5 = p5;
    spill1851_6 = 0x1.0p0f;
    if (!((life13_5 == null))) {
        forwardValue1851_21_0 = spill1851_0;
        forwardValue1851_21_1 = spill1851_1;
        forwardValue1851_21_2 = spill1851_2;
        forwardValue1851_21_3 = spill1851_3;
        forwardValue1851_21_4 = spill1851_4;
        forwardValue1851_21_5 = spill1851_5;
        forwardValue1851_21_6 = spill1851_6;
        break forward_join_21;
    }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(spill1851_5)), ((float)(spill1851_6))) > 0))) {
        forwardValue1851_24_0 = spill1851_0;
        forwardValue1851_24_1 = spill1851_1;
        forwardValue1851_24_2 = spill1851_2;
        forwardValue1851_24_3 = spill1851_3;
        forwardValue1851_24_4 = spill1851_4;
        break forward_join_24;
    }
    forwardValue1851_21_0 = spill1851_0;
    forwardValue1851_21_1 = spill1851_1;
    forwardValue1851_21_2 = spill1851_2;
    forwardValue1851_21_3 = spill1851_3;
    forwardValue1851_21_4 = spill1851_4;
    forwardValue1851_21_5 = 0x1.0p4f;
    forwardValue1851_21_6 = p5;
    }
    forwardValue1851_25_0 = forwardValue1851_21_0;
    forwardValue1851_25_1 = forwardValue1851_21_1;
    forwardValue1851_25_2 = forwardValue1851_21_2;
    forwardValue1851_25_3 = forwardValue1851_21_3;
    forwardValue1851_25_4 = forwardValue1851_21_4;
    forwardValue1851_25_5 = ((double) (forwardValue1851_21_5 * forwardValue1851_21_6));
    break forward_join_25;
    }
    forwardValue1851_25_0 = forwardValue1851_24_0;
    forwardValue1851_25_1 = forwardValue1851_24_1;
    forwardValue1851_25_2 = forwardValue1851_24_2;
    forwardValue1851_25_3 = forwardValue1851_24_3;
    forwardValue1851_25_4 = forwardValue1851_24_4;
    forwardValue1851_25_5 = 0x1.0p4d;
    }
    ((net.minecraft.server.management.ServerConfigurationManager)(forwardValue1851_25_0)).a(((net.minecraft.entity.player.EntityPlayer)(forwardValue1851_25_1)), ((double)(forwardValue1851_25_2)), ((double)(forwardValue1851_25_3)), ((double)(forwardValue1851_25_4)), ((double)(forwardValue1851_25_5)), ((int)(((moom.EA)(((net.minecraft.world.WorldServer)(this.b)).v)).b())), ((moom.yK)(new moom.Aa(p1, p2, p3, p4, p5, p6))));
    return;
}


public void a(int p0, int p1, int p2, int p3, int p4, int p5) {
return;
}


public void a__Void(moom.DT p0) {
((moom.Br)(((net.minecraft.world.WorldServer)(this.b)).a__Br())).a(((moom.DT)(p0)));
    return;
}

}
