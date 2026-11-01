package moom;


public class p6 extends net.minecraft.command.CommandBase {

private static final long c;

public p6() {
super();
}


static {
c = (moom._c.a(1657051158149446291L, -6033082342550820208L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(214188416667226L);
}


private static moom.b7 a(moom.b7 p0) {
return p0;
}


public void a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws moom.b7 {
int forwardValue3831_24_0;
    int spill3831_0;
    long life3_3;
    int life5_5;
    int life6_29;
    forward_join_24: {
    forward_join_19: {
    life3_3 = (moom.p6.c ^ 26081737663072L);
    life5_5 = ((moom.b7.c()) ? 1 : 0);
    spill3831_0 = (p1).length;
    if (!((life5_5 != 0))) {
        forwardValue3831_24_0 = spill3831_0;
        break forward_join_24;
    }
    if (!((spill3831_0 != 1))) {
        break forward_join_19;
    }
    throw new moom.cc("commands.setidletimeout.usage", new java.lang.Object[0]);
    }
    forwardValue3831_24_0 = __sourceExactCall_40c01a2952b84c(((java.lang.String)((p1)[0])), ((int)(0)));
    }
    life6_29 = forwardValue3831_24_0;
    ((moom.Bl)(moom.Bl.a__Bl())).b(((int)(life6_29)));
    moom.p6.a(((net.minecraft.command.ICommandSender)(p0)), ((net.minecraft.command.ICommand)(this)), ((java.lang.String)("commands.setidletimeout.success")), ((java.lang.Object[])(new java.lang.Object[] {java.lang.Integer.valueOf(((int)(life6_29)))})));
    return;
}


public java.lang.String a__sourceReturn_abea8daec3(net.minecraft.command.ICommandSender p0) {
return "commands.setidletimeout.usage";
}


public int a() {
return 3;
}


public java.lang.String a__String() {
return "setidletimeout";
}


private static native int __sourceExactCall_40c01a2952b84c(java.lang.String p0, int p1) throws moom.b_;
}
