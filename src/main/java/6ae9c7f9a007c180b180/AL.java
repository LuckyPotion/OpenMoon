package moom;


public class AL implements net.minecraft.command.ICommandSender {

private static final moom.AL a;

private final java.lang.StringBuffer b;

private static int[] c;

private static final long d;

public AL() {
super();
    this.b = new java.lang.StringBuffer();
}


static {
d = ((long)(((moom._a)(moom._c.a(((long)(1913826049879048316L)), ((long)(6570681680118289181L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(189100560245799L)))));
    int[] __sourceSpill1324_6 = new int[2];
    a = ((moom.AL)(new moom.AL()));
    moom.AL.b(((int[])(__sourceSpill1324_6)));
}


public static int[] b() {
return moom.AL.c;
}


public static void b(int[] p0) {
moom.AL.c = ((int[])(p0));
    return;
}


public boolean a__Boolean() {
return ((1) != 0);
}


public net.minecraft.entity.Entity a__r3() {
return null;
}


public void a(net.minecraft.command.CommandResultStats$Type p0, int p1) {
return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public boolean a(int p0, java.lang.String p1) {
return ((1) != 0);
}


public void a(net.minecraft.util.IChatComponent p0) {
long local2 = (moom.AL.d ^ 8068338474204L);
    int[] spill3088_0 = moom.AL.b();
    ((java.lang.StringBuffer)(this.b)).append(((java.lang.String)(((net.minecraft.util.IChatComponent)(p0)).b())));
    int[] local4 = spill3088_0;
    if ((local4 == null)) {
        net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[5])));
    }
    return;
}


public net.minecraft.util.IChatComponent a__C5() {
return new moom.CM(((moom.AL)(this)).a__String());
}


public java.lang.String a__String() {
return "Rcon";
}


public moom.DT a__DT() {
return new moom.DT(0, 0, 0);
}


public moom.DR a__DR() {
return new moom.DR(0x0.0p0d, 0x0.0p0d, 0x0.0p0d);
}


public net.minecraft.world.World a__Eu() {
return ((moom.Bl)(moom.Bl.a__Bl())).a__Eu();
}

}
