package moom;


public class qu extends net.minecraft.command.CommandBase {

private static final long c;

public qu() {
super();
}


static {
moom.qu.c = (moom._c.a(7441647196635012433L, 6457101455189049304L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(137468740135453L);
}


private static moom.b7 a(moom.b7 p0) {
return p0;
}


public void a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws moom.b7 {
long life3_3;
    java.lang.String life6_9;
    int life5_10;
    forward_join_33: {
    forward_join_27: {
    forward_join_25: {
    life3_3 = (moom.qu.c ^ 119653842334247L);
    int spill4497_0 = moom.qV.d();
    life6_9 = ((moom.Bl)(moom.Bl.a__Bl())).a(((net.minecraft.world.WorldSettings$GameType)(net.minecraft.world.WorldSettings$GameType.SURVIVAL)), ((boolean)(false)));
    life5_10 = spill4497_0;
    if (!((life5_10 == 0))) { break forward_join_25; }
    if (!((life6_9 != null))) { break forward_join_27; }
    moom.qu.a(((net.minecraft.command.ICommandSender)(p0)), ((net.minecraft.command.ICommand)(this)), ((java.lang.String)("commands.publish.started")), ((java.lang.Object[])(new java.lang.Object[] {life6_9})));
    }
    if (!((life5_10 != 0))) { break forward_join_33; }
    }
    moom.qu.a(((net.minecraft.command.ICommandSender)(p0)), ((net.minecraft.command.ICommand)(this)), ((java.lang.String)("commands.publish.failed")), ((java.lang.Object[])(new java.lang.Object[0])));
    }
    return;
}


public java.lang.String a__sourceReturn_abea8daec3(net.minecraft.command.ICommandSender p0) {
return "commands.publish.usage";
}


public java.lang.String a__String() {
return "publish";
}

}
