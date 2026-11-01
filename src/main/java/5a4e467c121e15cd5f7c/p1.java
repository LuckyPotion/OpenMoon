package moom;


public class p1 extends net.minecraft.command.CommandBase {

private static final long c;

public p1() {
super();
}


static {
c = (moom._c.a(7575232581323065182L, 95816354160197160L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(93575488827075L);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public java.util.List<java.lang.String> a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1, moom.DT p2) {
java.lang.String[] forwardValue3829_13_0;
    java.util.List forwardValue3829_18_0;
    java.lang.String[] spill3829_0;
    long life4_3;
    int life6_5;
    forward_join_18: {
    forward_join_17: {
    forward_join_13: {
    life4_3 = (moom.p1.c ^ 101533000704370L);
    life6_5 = ((moom.b7.c()) ? 1 : 0);
    spill3829_0 = p1;
    if (!((life6_5 != 0))) {
        forwardValue3829_13_0 = spill3829_0;
        break forward_join_13;
    }
    if (!(((spill3829_0).length == 1))) {
        break forward_join_17;
    }
    forwardValue3829_13_0 = p1;
    }
    forwardValue3829_18_0 = __sourceExactCall_4877f84039dafe(((java.lang.String[])(forwardValue3829_13_0)), ((java.lang.String[])(((moom.Bl)(moom.Bl.a__Bl())).a__ArrayString())));
    break forward_join_18;
    }
    forwardValue3829_18_0 = null;
    }
    return forwardValue3829_18_0;
}


public boolean a__Boolean(java.lang.String[] p0, int p1) {
int forwardValue3830_11_0;
    int forwardValue3830_13_0;
    int spill3830_0;
    long life3_3;
    int life5_5;
    forward_join_13: {
    forward_join_12: {
    forward_join_11: {
    life3_3 = (moom.p1.c ^ 110996785533289L);
    life5_5 = ((moom.b7.c()) ? 1 : 0);
    spill3830_0 = p1;
    if (!((life5_5 != 0))) {
        forwardValue3830_11_0 = spill3830_0;
        break forward_join_11;
    }
    if (!((spill3830_0 == 0))) {
        break forward_join_12;
    }
    forwardValue3830_11_0 = 1;
    }
    forwardValue3830_13_0 = forwardValue3830_11_0;
    break forward_join_13;
    }
    forwardValue3830_13_0 = 0;
    }
    return ((forwardValue3830_13_0) != 0);
}


public java.lang.String a__String() {
return "kill";
}


public int a() {
return 2;
}


public java.lang.String a__sourceReturn_abea8daec3(net.minecraft.command.ICommandSender p0) {
return "commands.kill.usage";
}


public void a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws moom.b7 {
long life3_3;
    int life5_5;
    net.minecraft.entity.player.EntityPlayerMP life6_11;
    net.minecraft.entity.Entity life6_32;
    forward_join_46: {
    forward_join_27: {
    life3_3 = (moom.p1.c ^ 30095596990705L);
    life5_5 = ((moom.b7.b()) ? 1 : 0);
    if (!(((p1).length == 0))) { break forward_join_27; }
    life6_11 = __sourceExactCall_9f2399800c96a3(((net.minecraft.command.ICommandSender)(p0)));
    __sourceExactCall_4e5921a0edc8e4(((net.minecraft.entity.player.EntityPlayer)(life6_11)));
    moom.p1.a(((net.minecraft.command.ICommandSender)(p0)), ((net.minecraft.command.ICommand)(this)), ((java.lang.String)("commands.kill.successful")), ((java.lang.Object[])(new java.lang.Object[] {__sourceExactCall_deee156f5c6602(((net.minecraft.entity.player.EntityPlayer)(life6_11)))})));
    if (!((life5_5 != 0))) { break forward_join_46; }
    }
    life6_32 = moom.p1.a__r3(((net.minecraft.command.ICommandSender)(p0)), ((java.lang.String)((p1)[0])));
    __sourceExactCall_2408bc848139ba(((net.minecraft.entity.Entity)(life6_32)));
    moom.p1.a(((net.minecraft.command.ICommandSender)(p0)), ((net.minecraft.command.ICommand)(this)), ((java.lang.String)("commands.kill.successful")), ((java.lang.Object[])(new java.lang.Object[] {__sourceExactCall_a3be8b76d22b9b(((net.minecraft.entity.Entity)(life6_32)))})));
    }
    return;
}


private static native java.util.List __sourceExactCall_4877f84039dafe(java.lang.String[] p0, java.lang.String[] p1);
private static native net.minecraft.entity.player.EntityPlayerMP __sourceExactCall_9f2399800c96a3(net.minecraft.command.ICommandSender p0) throws moom.ca;

private static native void __sourceExactCall_4e5921a0edc8e4(net.minecraft.entity.player.EntityPlayer p0);
private static native net.minecraft.util.IChatComponent __sourceExactCall_deee156f5c6602(net.minecraft.entity.player.EntityPlayer p0);
private static native void __sourceExactCall_2408bc848139ba(net.minecraft.entity.Entity p0);
private static native net.minecraft.util.IChatComponent __sourceExactCall_a3be8b76d22b9b(net.minecraft.entity.Entity p0);
}
