package moom;


public class qx extends net.minecraft.command.CommandBase {

private static final long c;

public qx() {
super();
}


static {
c = (moom._c.a(-9040763347219111489L, -855513497527980159L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(28730133745801L);
}


private static moom.b7 a(moom.b7 p0) {
return p0;
}


public void a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws moom.b7 {
net.minecraft.world.WorldServer lexicalValue1284_30_0;
    net.minecraft.command.ICommandSender lexicalValue1284_47_0;
    int spill1284_0;
    moom.Bl spill1284_1;
    net.minecraft.world.WorldServer spill1284_2;
    long life3_3;
    moom.Bl life6_6;
    int life7_8;
    int life8_10;
    int life5_11;
    net.minecraft.world.WorldServer life9_39;
    lexical_join_61: {
    lexical_join_54: {
    lexical_join_47: {
    lexical_join_44: {
    life3_3 = (moom.qx.c ^ 95314610517748L);
    spill1284_0 = moom.qV.c();
    life6_6 = moom.Bl.a__Bl();
    life7_8 = 0;
    life8_10 = 0;
    life5_11 = spill1284_0;
    lexical_cycle_12: while (true) {
    lexical_join_42: {
    lexical_join_41: {
    lexical_join_30: {
    if (!((life8_10 < (((moom.Bl)(life6_6)).n).length))) {
        break lexical_join_44;
    }
    spill1284_1 = life6_6;
    if (!((life5_11 != 0))) {
        lexicalValue1284_47_0 = spill1284_1;
        break lexical_join_47;
    }
    spill1284_2 = (((moom.Bl)(spill1284_1)).n)[life8_10];
    if (!((life5_11 != 0))) {
        lexicalValue1284_30_0 = spill1284_2;
        break lexical_join_30;
    }
    if (!((spill1284_2 != null))) {
        break lexical_join_41;
    }
    lexicalValue1284_30_0 = (((moom.Bl)(life6_6)).n)[life8_10];
    }
    life9_39 = lexicalValue1284_30_0;
    if (!((life5_11 != 0))) {
        break lexical_join_42;
    }
    if (!(((net.minecraft.world.WorldServer)(life9_39)).aa)) {
        break lexical_join_41;
    }
    ((net.minecraft.world.WorldServer)(life9_39)).aa = ((boolean)(false));
    life7_8 = 1;
    }
    life8_10 += 1;
    }
    if (!((life5_11 == 0))) { continue lexical_cycle_12; }
    break lexical_cycle_12;
    }
    }
    if (!((life7_8 != 0))) {
        break lexical_join_54;
    }
    lexicalValue1284_47_0 = p0;
    }
    moom.qx.a(((net.minecraft.command.ICommandSender)(lexicalValue1284_47_0)), ((net.minecraft.command.ICommand)(this)), ((java.lang.String)("commands.save.enabled")), ((java.lang.Object[])(new java.lang.Object[0])));
    if (!((life5_11 == 0))) {
        break lexical_join_61;
    }
    }
    throw new moom.b7("commands.save-on.alreadyOn", new java.lang.Object[0]);
    }
    return;
}


public java.lang.String a__sourceReturn_abea8daec3(net.minecraft.command.ICommandSender p0) {
return "commands.save-on.usage";
}


public java.lang.String a__String() {
return "save-on";
}

}
