package moom;


public class qm extends net.minecraft.command.CommandBase {

private static final long c;

public qm() {
super();
}


static {
c = (moom._c.a(-5653773803512368641L, -4412174247602034368L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(40936757245265L);
}


private static moom.b7 a(moom.b7 p0) {
return p0;
}


public java.util.List<java.lang.String> a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1, moom.DT p2) {
return __sourceExactCall_3c18a1906a7b06(((java.lang.String[])(p1)), ((java.lang.String[])(((moom.Bl)(moom.Bl.a__Bl())).a__ArrayString())));
}


public void a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws moom.b7 {
net.minecraft.command.ICommandSender forwardValue3887_25_0;
    java.lang.String[] forwardValue3887_25_1;
    int forwardValue3887_25_2;
    int forwardValue3887_25_3;
    net.minecraft.command.ICommandSender forwardValue3887_26_0;
    java.lang.String[] forwardValue3887_26_1;
    int forwardValue3887_26_2;
    net.minecraft.command.ICommandSender forwardValue3887_27_0;
    java.lang.String[] forwardValue3887_27_1;
    int forwardValue3887_27_2;
    int forwardValue3887_27_3;
    net.minecraft.command.ICommandSender spill3887_0;
    java.lang.String[] spill3887_1;
    int spill3887_2;
    int spill3887_3;
    long life3_3;
    int life5_5;
    net.minecraft.util.IChatComponent life6_33;
    forward_join_27: {
    forward_join_26: {
    forward_join_25: {
    forward_join_16: {
    life3_3 = (moom.qm.c ^ 139350312352661L);
    life5_5 = moom.qV.d();
    if (!(((p1).length == 0))) {
        break forward_join_16;
    }
    throw new moom.cc("commands.me.usage", new java.lang.Object[0]);
    }
    spill3887_0 = p0;
    spill3887_1 = p1;
    spill3887_2 = 0;
    spill3887_3 = ((p0 instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0);
    if (!((life5_5 == 0))) {
        forwardValue3887_25_0 = spill3887_0;
        forwardValue3887_25_1 = spill3887_1;
        forwardValue3887_25_2 = spill3887_2;
        forwardValue3887_25_3 = spill3887_3;
        break forward_join_25;
    }
    if (!((spill3887_3 == 0))) {
        forwardValue3887_26_0 = spill3887_0;
        forwardValue3887_26_1 = spill3887_1;
        forwardValue3887_26_2 = spill3887_2;
        break forward_join_26;
    }
    forwardValue3887_25_0 = spill3887_0;
    forwardValue3887_25_1 = spill3887_1;
    forwardValue3887_25_2 = spill3887_2;
    forwardValue3887_25_3 = 1;
    }
    forwardValue3887_27_0 = forwardValue3887_25_0;
    forwardValue3887_27_1 = forwardValue3887_25_1;
    forwardValue3887_27_2 = forwardValue3887_25_2;
    forwardValue3887_27_3 = forwardValue3887_25_3;
    break forward_join_27;
    }
    forwardValue3887_27_0 = forwardValue3887_26_0;
    forwardValue3887_27_1 = forwardValue3887_26_1;
    forwardValue3887_27_2 = forwardValue3887_26_2;
    forwardValue3887_27_3 = 0;
    }
    life6_33 = moom.qm.a(((net.minecraft.command.ICommandSender)(forwardValue3887_27_0)), ((java.lang.String[])(forwardValue3887_27_1)), ((int)(forwardValue3887_27_2)), ((boolean)__sourceIntrinsic_integerToBoolean((forwardValue3887_27_3))));
    ((net.minecraft.server.management.ServerConfigurationManager)(((moom.Bl)(moom.Bl.a__Bl())).a__BA())).a(((net.minecraft.util.IChatComponent)(new moom.CN("chat.type.emote", new java.lang.Object[] {((net.minecraft.command.ICommandSender)(p0)).a__C5(), life6_33}))));
    return;
}


public java.lang.String a__sourceReturn_abea8daec3(net.minecraft.command.ICommandSender p0) {
return "commands.me.usage";
}


public int a() {
return 0;
}


public java.lang.String a__String() {
return "me";
}


private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native java.util.List __sourceExactCall_3c18a1906a7b06(java.lang.String[] p0, java.lang.String[] p1);
}
