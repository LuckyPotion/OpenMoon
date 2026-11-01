package moom;


public class qB extends net.minecraft.command.CommandBase {

private static final long c;

public qB() {
super();
}


static {
c = (moom._c.a(1300254751727450341L, 5940543411238817456L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(152413256689473L);
}


private static moom.b7 a(moom.b7 p0) {
return p0;
}


public void a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws moom.b7 {
moom.Bl forwardValue3844_18_0;
    moom.Bl spill3844_0;
    long life3_3;
    int life5_5;
    forward_join_18: {
    forward_join_17: {
    life3_3 = (moom.qB.c ^ 87653086484395L);
    life5_5 = moom.qV.d();
    spill3844_0 = moom.Bl.a__Bl();
    if (!((life5_5 == 0))) {
        forwardValue3844_18_0 = spill3844_0;
        break forward_join_18;
    }
    if (!((((moom.Bl)(spill3844_0)).n != null))) {
        break forward_join_17;
    }
    moom.qB.a(((net.minecraft.command.ICommandSender)(p0)), ((net.minecraft.command.ICommand)(this)), ((java.lang.String)("commands.stop.start")), ((java.lang.Object[])(new java.lang.Object[0])));
    }
    forwardValue3844_18_0 = moom.Bl.a__Bl();
    }
    ((moom.Bl)(forwardValue3844_18_0)).d__Void();
    return;
}


public java.lang.String a__sourceReturn_abea8daec3(net.minecraft.command.ICommandSender p0) {
return "commands.stop.usage";
}


public java.lang.String a__String() {
return "stop";
}

}
