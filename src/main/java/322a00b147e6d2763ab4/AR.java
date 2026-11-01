package moom;


public class AR implements moom.yK<moom.AM> {

private long a;

private static java.lang.String b;

public AR() {
super();
}


public AR(long p0) {
super();
    this.a = p0;
}


static {
if ((moom.AR.b() != null)) {
        moom.AR.b(((java.lang.String)("OsN4K")));
    }
}


public static java.lang.String b() {
return moom.AR.b;
}


public static void b(java.lang.String p0) {
b = ((java.lang.String)(p0));
    return;
}


public void b(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
((net.minecraft.network.PacketBuffer)(p0)).writeLong(((long)(this.a)));
    return;
}


public void a(moom.AM p0) {
((moom.AM)(p0)).a(((moom.AR)(this)));
    return;
}


public void a__sourceBridge_691ab4d076(moom.yE p0) {
((moom.AR)(this)).a(((moom.AM)(((moom.AM)(p0)))));
}


public void a(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
this.a = ((long)(((net.minecraft.network.PacketBuffer)(p0)).readLong()));
    return;
}



}
