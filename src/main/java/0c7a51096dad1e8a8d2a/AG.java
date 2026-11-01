package moom;


public class AG implements moom.yK<moom.y2> {

private net.minecraft.network.play.server.S45PacketTitle$Type a;

private net.minecraft.util.IChatComponent b;

private int c;

private int d;

private int e;

private static final long f;

public AG(net.minecraft.network.play.server.S45PacketTitle$Type p0, net.minecraft.util.IChatComponent p1, int p2, int p3, int p4) {
super();
    this.a = p0;
    this.b = p1;
    this.c = p2;
    this.d = p3;
    this.e = p4;
}


public AG(int p0, int p1, int p2) {
this(net.minecraft.network.play.server.S45PacketTitle$Type.TIMES, null, p0, p1, p2);
}


public AG(net.minecraft.network.play.server.S45PacketTitle$Type p0, net.minecraft.util.IChatComponent p1) {
this(p0, p1, -1, -1, -1);
}


public AG() {
super();
}


static {
moom.AG.f = (moom._c.a(830313645249149873L, -5674609756278013600L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(124412305140608L);
}


public int b() {
return this.d;
}


public void b(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
net.minecraft.network.PacketBuffer forwardValue1425_24_0;
    moom.AG forwardValue1425_24_1;
    net.minecraft.network.play.server.S45PacketTitle$Type forwardValue1425_29_0;
    net.minecraft.network.play.server.S45PacketTitle$Type forwardValue1425_29_1;
    net.minecraft.network.PacketBuffer spill1425_0;
    moom.AG spill1425_1;
    net.minecraft.network.play.server.S45PacketTitle$Type spill1425_2;
    net.minecraft.network.play.server.S45PacketTitle$Type spill1425_3;
    long life2_3;
    int[] life4_5;
    forward_join_45: {
    forward_join_29: {
    forward_join_26: {
    forward_join_24: {
    forward_join_22: {
    life2_3 = (moom.AG.f ^ 121181301788894L);
    life4_5 = moom.zN.b__ArrayInt();
    spill1425_0 = p0;
    spill1425_1 = this;
    if (!((life4_5 == null))) {
        forwardValue1425_24_0 = spill1425_0;
        forwardValue1425_24_1 = spill1425_1;
        break forward_join_24;
    }
    ((net.minecraft.network.PacketBuffer)(spill1425_0)).a(((java.lang.Enum)(((moom.AG)(spill1425_1)).a)));
    if (!((this.a != net.minecraft.network.play.server.S45PacketTitle$Type.TITLE))) {
        break forward_join_22;
    }
    spill1425_2 = this.a;
    spill1425_3 = net.minecraft.network.play.server.S45PacketTitle$Type.SUBTITLE;
    if (!((life4_5 == null))) {
        forwardValue1425_29_0 = spill1425_2;
        forwardValue1425_29_1 = spill1425_3;
        break forward_join_29;
    }
    if (!((spill1425_2 == spill1425_3))) {
        break forward_join_26;
    }
    }
    forwardValue1425_24_0 = p0;
    forwardValue1425_24_1 = this;
    }
    ((net.minecraft.network.PacketBuffer)(forwardValue1425_24_0)).a(((net.minecraft.util.IChatComponent)(((moom.AG)(forwardValue1425_24_1)).b)));
    }
    forwardValue1425_29_0 = this.a;
    forwardValue1425_29_1 = net.minecraft.network.play.server.S45PacketTitle$Type.TIMES;
    }
    if (!((forwardValue1425_29_0 == forwardValue1425_29_1))) {
        break forward_join_45;
    }
    ((net.minecraft.network.PacketBuffer)(p0)).writeInt(((int)(this.c)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeInt(((int)(this.d)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeInt(((int)(this.e)));
    }
    return;
}


public int c() {
return this.e;
}


public void a__sourceBridge_691ab4d076(moom.yE p0) {
((moom.AG)(this)).a(((moom.y2)(((moom.y2)(p0)))));
}


private static java.io.IOException a(java.io.IOException p0) {
return p0;
}


public void a(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
moom.AG forwardValue1424_25_0;
    net.minecraft.network.play.server.S45PacketTitle$Type forwardValue1424_33_0;
    net.minecraft.network.play.server.S45PacketTitle$Type forwardValue1424_33_1;
    moom.AG forwardValue1424_43_0;
    int[] spill1424_0;
    moom.AG spill1424_1;
    net.minecraft.network.play.server.S45PacketTitle$Type spill1424_2;
    net.minecraft.network.play.server.S45PacketTitle$Type spill1424_3;
    moom.AG spill1424_4;
    long life2_3;
    int[] life4_11;
    forward_join_46: {
    forward_join_43: {
    forward_join_33: {
    forward_join_28: {
    forward_join_25: {
    forward_join_24: {
    life2_3 = (moom.AG.f ^ 27364480451415L);
    spill1424_0 = moom.zN.b__ArrayInt();
    this.a = ((net.minecraft.network.play.server.S45PacketTitle$Type)(((net.minecraft.network.play.server.S45PacketTitle$Type)(((net.minecraft.network.PacketBuffer)(p0)).a(((java.lang.Class)(net.minecraft.network.play.server.S45PacketTitle$Type.class)))))));
    life4_11 = spill1424_0;
    spill1424_1 = this;
    if (!((life4_11 == null))) {
        forwardValue1424_25_0 = spill1424_1;
        break forward_join_25;
    }
    if (!((((moom.AG)(spill1424_1)).a != net.minecraft.network.play.server.S45PacketTitle$Type.TITLE))) {
        break forward_join_24;
    }
    spill1424_2 = this.a;
    spill1424_3 = net.minecraft.network.play.server.S45PacketTitle$Type.SUBTITLE;
    if (!((life4_11 == null))) {
        forwardValue1424_33_0 = spill1424_2;
        forwardValue1424_33_1 = spill1424_3;
        break forward_join_33;
    }
    if (!((spill1424_2 == spill1424_3))) {
        break forward_join_28;
    }
    }
    forwardValue1424_25_0 = this;
    }
    ((moom.AG)(forwardValue1424_25_0)).b = ((net.minecraft.util.IChatComponent)(((net.minecraft.network.PacketBuffer)(p0)).a__C5()));
    }
    spill1424_4 = this;
    if (!((life4_11 == null))) {
        forwardValue1424_43_0 = spill1424_4;
        break forward_join_43;
    }
    forwardValue1424_33_0 = ((moom.AG)(spill1424_4)).a;
    forwardValue1424_33_1 = net.minecraft.network.play.server.S45PacketTitle$Type.TIMES;
    }
    if (!((forwardValue1424_33_0 == forwardValue1424_33_1))) {
        break forward_join_46;
    }
    this.c = ((int)(((net.minecraft.network.PacketBuffer)(p0)).readInt()));
    this.d = ((int)(((net.minecraft.network.PacketBuffer)(p0)).readInt()));
    forwardValue1424_43_0 = this;
    }
    ((moom.AG)(forwardValue1424_43_0)).e = ((int)(((net.minecraft.network.PacketBuffer)(p0)).readInt()));
    }
    return;
}


public void a(moom.y2 p0) {
((moom.y2)(p0)).a(((moom.AG)(this)));
    return;
}


public net.minecraft.network.play.server.S45PacketTitle$Type a__bm() {
return this.a;
}


public net.minecraft.util.IChatComponent a__C5() {
return this.b;
}


public int a() {
return this.c;
}



}
