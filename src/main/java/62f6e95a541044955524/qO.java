package moom;


class qO implements net.minecraft.command.ICommandSender {

net.minecraft.command.ICommandSender a;

moom.qN b;

qO(moom.qN p0, net.minecraft.command.ICommandSender p1) { super(); }


private static void __sourceConstructorBody_2b551c743e0d8931(moom.qO receiver, moom.qN p0, net.minecraft.command.ICommandSender p1) throws Throwable {

((moom.qO)(receiver)).b = ((moom.qN)(p0));

    ((moom.qO)(receiver)).a = ((net.minecraft.command.ICommandSender)(p1));

    moom.qO.__sourceConstructorInit_2b551c743e0d8931_0(((moom.qO)(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_2b551c743e0d8931_0(moom.qO a0) throws E;

public net.minecraft.entity.Entity a__r3() {
return ((net.minecraft.command.ICommandSender)(this.a)).a__r3();
}


public net.minecraft.world.World a__Eu() {
return ((net.minecraft.command.ICommandSender)(this.a)).a__Eu();
}


public moom.DR a__DR() {
return ((net.minecraft.command.ICommandSender)(this.a)).a__DR();
}


public boolean a__Boolean() {
return (__sourceIntrinsic_booleanComparison((((net.minecraft.command.ICommandSender)(this.a)).a__Boolean())) != 0);
}


public void a(net.minecraft.command.CommandResultStats$Type p0, int p1) {
((net.minecraft.command.ICommandSender)(this.a)).a(((net.minecraft.command.CommandResultStats$Type)(p0)), ((int)(p1)));
    return;
}


public java.lang.String a__String() {
return ((net.minecraft.command.ICommandSender)(this.a)).a__String();
}


public net.minecraft.util.IChatComponent a__C5() {
return ((net.minecraft.command.ICommandSender)(this.a)).a__C5();
}


public void a(net.minecraft.util.IChatComponent p0) {
((net.minecraft.command.ICommandSender)(this.a)).a(((net.minecraft.util.IChatComponent)(p0)));
    return;
}


public boolean a(int p0, java.lang.String p1) {
return ((1) != 0);
}


public moom.DT a__DT() {
return ((net.minecraft.command.ICommandSender)(this.a)).a__DT();
}


private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
