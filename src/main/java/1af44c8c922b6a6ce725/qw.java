package moom;


public class qw extends net.minecraft.command.CommandBase {

private static final long c;

public qw() {
super();
}


static {
c = (moom._c.a(-1207188776921946814L, -7125174762377206359L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(10935501408969L);
}


private static moom.b7 a(moom.b7 p0) {
return p0;
}


public void a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws moom.b7 {
net.minecraft.world.WorldServer lexicalValue1283_30_0;
    net.minecraft.command.ICommandSender lexicalValue1283_47_0;
    int spill1283_0;
    moom.Bl spill1283_1;
    net.minecraft.world.WorldServer spill1283_2;
    long life3_3;
    moom.Bl life6_6;
    int life5_7;
    int life7_9;
    int life8_11;
    net.minecraft.world.WorldServer life9_39;
    lexical_join_61: {
    lexical_join_54: {
    lexical_join_47: {
    lexical_join_44: {
    life3_3 = (moom.qw.c ^ 29509781937036L);
    spill1283_0 = moom.qV.d();
    life6_6 = moom.Bl.a__Bl();
    life5_7 = spill1283_0;
    life7_9 = 0;
    life8_11 = 0;
    lexical_cycle_12: while (true) {
    lexical_join_42: {
    lexical_join_41: {
    lexical_join_30: {
    if (!((life8_11 < (((moom.Bl)(life6_6)).n).length))) {
        break lexical_join_44;
    }
    spill1283_1 = life6_6;
    if (!((life5_7 == 0))) {
        lexicalValue1283_47_0 = spill1283_1;
        break lexical_join_47;
    }
    spill1283_2 = (((moom.Bl)(spill1283_1)).n)[life8_11];
    if (!((life5_7 == 0))) {
        lexicalValue1283_30_0 = spill1283_2;
        break lexical_join_30;
    }
    if (!((spill1283_2 != null))) {
        break lexical_join_41;
    }
    lexicalValue1283_30_0 = (((moom.Bl)(life6_6)).n)[life8_11];
    }
    life9_39 = lexicalValue1283_30_0;
    if (!((life5_7 == 0))) {
        break lexical_join_42;
    }
    if (!((!((net.minecraft.world.WorldServer)(life9_39)).aa))) {
        break lexical_join_41;
    }
    ((net.minecraft.world.WorldServer)(life9_39)).aa = ((boolean)(true));
    life7_9 = 1;
    }
    life8_11 += 1;
    }
    if (!((life5_7 != 0))) { continue lexical_cycle_12; }
    break lexical_cycle_12;
    }
    }
    if (!((life7_9 != 0))) {
        break lexical_join_54;
    }
    lexicalValue1283_47_0 = p0;
    }
    moom.qw.a(((net.minecraft.command.ICommandSender)(lexicalValue1283_47_0)), ((net.minecraft.command.ICommand)(this)), ((java.lang.String)("commands.save.disabled")), ((java.lang.Object[])(new java.lang.Object[0])));
    if (!((life5_7 != 0))) {
        break lexical_join_61;
    }
    }
    throw new moom.b7("commands.save-off.alreadyOff", new java.lang.Object[0]);
    }
    return;
}


public java.lang.String a__sourceReturn_abea8daec3(net.minecraft.command.ICommandSender p0) {
return "commands.save-off.usage";
}


public java.lang.String a__String() {
return "save-off";
}

}
