package moom;


public class qc extends net.minecraft.command.CommandBase {

private static final long c;

public qc() {
super();
}


static {
c = (moom._c.a(5983057247819691729L, 4744916627686605817L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(188672177367898L);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


protected void a__Void() {
net.minecraft.world.storage.WorldInfo forwardValue3886_19_0;
    int forwardValue3886_19_1;
    net.minecraft.world.storage.WorldInfo forwardValue3886_20_0;
    net.minecraft.world.storage.WorldInfo forwardValue3886_21_0;
    int forwardValue3886_21_1;
    boolean spill3886_0;
    net.minecraft.world.storage.WorldInfo spill3886_1;
    boolean spill3886_2;
    long life1_3;
    net.minecraft.world.storage.WorldInfo life4_10;
    int life3_11;
    forward_join_21: {
    forward_join_20: {
    forward_join_19: {
    life1_3 = (moom.qc.c ^ 52018168075397L);
    spill3886_0 = moom.b7.b();
    life4_10 = ((net.minecraft.world.WorldServer)((((moom.Bl)(moom.Bl.a__Bl())).n)[0])).a__IX();
    life3_11 = ((spill3886_0) ? 1 : 0);
    spill3886_1 = life4_10;
    spill3886_2 = ((net.minecraft.world.storage.WorldInfo)(life4_10)).b__Boolean();
    if (!((life3_11 == 0))) {
        forwardValue3886_19_0 = spill3886_1;
        forwardValue3886_19_1 = ((spill3886_2) ? 1 : 0);
        break forward_join_19;
    }
    if (!((!spill3886_2))) {
        forwardValue3886_20_0 = spill3886_1;
        break forward_join_20;
    }
    forwardValue3886_19_0 = spill3886_1;
    forwardValue3886_19_1 = 1;
    }
    forwardValue3886_21_0 = forwardValue3886_19_0;
    forwardValue3886_21_1 = forwardValue3886_19_1;
    break forward_join_21;
    }
    forwardValue3886_21_0 = forwardValue3886_20_0;
    forwardValue3886_21_1 = 0;
    }
    ((net.minecraft.world.storage.WorldInfo)(forwardValue3886_21_0)).b(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue3886_21_1))));
    return;
}


public void a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws moom.b7 {
((moom.qc)(this)).a__Void();
    moom.qc.a(((net.minecraft.command.ICommandSender)(p0)), ((net.minecraft.command.ICommand)(this)), ((java.lang.String)("commands.downfall.success")), ((java.lang.Object[])(new java.lang.Object[0])));
    return;
}


public java.lang.String a__sourceReturn_abea8daec3(net.minecraft.command.ICommandSender p0) {
return "commands.downfall.usage";
}


public int a() {
return 2;
}


public java.lang.String a__String() {
return "toggledownfall";
}


private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
