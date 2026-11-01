package moom;


public class Ab implements moom.yK<moom.y2> {

private net.minecraft.util.EnumParticleTypes a;

private float b;

private float c;

private float d;

private float e;

private float f;

private float g;

private float h;

private int i;

private boolean j;

private int[] k;

private static final long l;

public Ab() {
super();
}


public Ab(net.minecraft.util.EnumParticleTypes p0, boolean p1, float p2, float p3, float p4, float p5, float p6, float p7, float p8, int p9, int[] p10) {
super();
    this.a = p0;
    this.j = p1;
    this.b = p2;
    this.c = p3;
    this.d = p4;
    this.e = p5;
    this.f = p6;
    this.g = p7;
    this.h = p8;
    this.i = p9;
    this.k = p10;
}


static {
moom.Ab.l = (moom._c.a(-3526057531207825867L, -9178635448950173180L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(261512687231768L);
}


public double b() {
return ((double) this.c);
}


public float b__Float() {
return this.f;
}


public void b(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
int[] spill481_0;
    long life2_3;
    int[] life4_41;
    int life5_60;
    int life6_62;
    lexical_join_75: {
    life2_3 = (moom.Ab.l ^ 32026394345822L);
    ((net.minecraft.network.PacketBuffer)(p0)).writeInt(((int)(((net.minecraft.util.EnumParticleTypes)(this.a)).a())));
    ((net.minecraft.network.PacketBuffer)(p0)).writeBoolean(((boolean)(this.j)));
    spill481_0 = moom.zN.b__ArrayInt();
    ((net.minecraft.network.PacketBuffer)(p0)).writeFloat(((float)(this.b)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeFloat(((float)(this.c)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeFloat(((float)(this.d)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeFloat(((float)(this.e)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeFloat(((float)(this.f)));
    life4_41 = spill481_0;
    ((net.minecraft.network.PacketBuffer)(p0)).writeFloat(((float)(this.g)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeFloat(((float)(this.h)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeInt(((int)(this.i)));
    life5_60 = ((net.minecraft.util.EnumParticleTypes)(this.a)).b();
    life6_62 = 0;
    lexical_cycle_63: while (true) {
    if (!((life6_62 < life5_60))) {
        break lexical_join_75;
    }
    ((net.minecraft.network.PacketBuffer)(p0)).a__Void(((int)((this.k)[life6_62])));
    life6_62 += 1;
    if (!((life4_41 != null))) { continue lexical_cycle_63; }
    break lexical_cycle_63;
    }
    }
    return;
}


public float c__Float() {
return this.g;
}


public double c() {
return ((double) this.d);
}


public float d() {
return this.h;
}


private static java.io.IOException a(java.io.IOException p0) {
return p0;
}


public int a__Int() {
return this.i;
}


public int[] a__ArrayInt() {
return this.k;
}


public void a(moom.y2 p0) {
((moom.y2)(p0)).a(((moom.Ab)(this)));
    return;
}


public void a__sourceBridge_691ab4d076(moom.yE p0) {
((moom.Ab)(this)).a(((moom.y2)(((moom.y2)(p0)))));
}


public void a(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
net.minecraft.util.EnumParticleTypes lexicalValue480_57_0;
    int[] spill480_0;
    net.minecraft.util.EnumParticleTypes spill480_1;
    long life2_3;
    int[] life4_10;
    int life5_64;
    int life6_70;
    lexical_join_77: {
    lexical_join_57: {
    lexical_join_19: {
    life2_3 = (moom.Ab.l ^ 118701278532311L);
    spill480_0 = moom.zN.b__ArrayInt();
    this.a = ((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.a(((int)(((net.minecraft.network.PacketBuffer)(p0)).readInt())))));
    life4_10 = spill480_0;
    spill480_1 = this.a;
    if (!((life4_10 == null))) {
        lexicalValue480_57_0 = spill480_1;
        break lexical_join_57;
    }
    if (!((spill480_1 == null))) {
        break lexical_join_19;
    }
    this.a = ((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.BARRIER));
    }
    this.j = ((boolean)(((net.minecraft.network.PacketBuffer)(p0)).readBoolean()));
    this.b = ((float)(((net.minecraft.network.PacketBuffer)(p0)).readFloat()));
    this.c = ((float)(((net.minecraft.network.PacketBuffer)(p0)).readFloat()));
    this.d = ((float)(((net.minecraft.network.PacketBuffer)(p0)).readFloat()));
    this.e = ((float)(((net.minecraft.network.PacketBuffer)(p0)).readFloat()));
    this.f = ((float)(((net.minecraft.network.PacketBuffer)(p0)).readFloat()));
    this.g = ((float)(((net.minecraft.network.PacketBuffer)(p0)).readFloat()));
    this.h = ((float)(((net.minecraft.network.PacketBuffer)(p0)).readFloat()));
    this.i = ((int)(((net.minecraft.network.PacketBuffer)(p0)).readInt()));
    lexicalValue480_57_0 = this.a;
    }
    life5_64 = ((net.minecraft.util.EnumParticleTypes)(lexicalValue480_57_0)).b();
    this.k = ((int[])(new int[life5_64]));
    life6_70 = 0;
    lexical_cycle_65: while (true) {
    if (!((life6_70 < life5_64))) {
        break lexical_join_77;
    }
    (this.k)[life6_70] = ((net.minecraft.network.PacketBuffer)(p0)).a();
    life6_70 += 1;
    if (!((life4_10 != null))) { continue lexical_cycle_65; }
    break lexical_cycle_65;
    }
    }
    return;
}


public net.minecraft.util.EnumParticleTypes a__bw() {
return this.a;
}


public boolean a__Boolean() {
return ((((this.j) ? 1 : 0)) != 0);
}


public double a() {
return ((double) this.b);
}


public float a__Float() {
return this.e;
}



}
