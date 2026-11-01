package moom;


public class yY implements moom.yK<moom.yU> {

private net.minecraft.util.IChatComponent a;

private static net.minecraft.entity.Entity[] b;

public yY() {
super();
}


public yY(net.minecraft.util.IChatComponent p0) {
super();
    this.a = p0;
}


static {
if ((moom.yY.b() == null)) {
        moom.yY.b(((net.minecraft.entity.Entity[])(new net.minecraft.entity.Entity[1])));
    }
}


public static void b(net.minecraft.entity.Entity[] p0) {
b = ((net.minecraft.entity.Entity[])(p0));
    return;
}


public static net.minecraft.entity.Entity[] b() {
return moom.yY.b;
}


public void b(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
((net.minecraft.network.PacketBuffer)(p0)).a(((net.minecraft.util.IChatComponent)(this.a)));
    return;
}


public net.minecraft.util.IChatComponent a() {
return this.a;
}


public void a__sourceBridge_691ab4d076(moom.yE p0) {
((moom.yY)(this)).a(((moom.yU)(((moom.yU)(p0)))));
}


public void a(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
this.a = ((net.minecraft.util.IChatComponent)(((net.minecraft.network.PacketBuffer)(p0)).a__C5()));
    return;
}


public void a(moom.yU p0) {
((moom.yU)(p0)).a(((moom.yY)(this)));
    return;
}



}
