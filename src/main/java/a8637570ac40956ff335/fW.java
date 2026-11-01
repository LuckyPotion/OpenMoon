package moom;


public class fW extends moom.fU {

private final net.minecraft.entity.item.EntityMinecart k;

private float l;

private static final long m;

public fW(net.minecraft.entity.item.EntityMinecart p0) {
super(new moom.DD("minecraft:minecart.base"));
    this.l = 0x0.0p+0f;
    this.k = p0;
    this.g = true;
    this.h = 0;
}


static {
m = (moom._c.a(2041553315061591480L, -1137229850096953575L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(172977392445863L);
}


public void c__Void() {
net.minecraft.entity.item.EntityMinecart forwardValue3541_37_0;
    net.minecraft.entity.item.EntityMinecart spill3541_0;
    long life1_3;
    java.lang.String life3_5;
    float life4_60;
    forward_join_86: {
    forward_join_83: {
    forward_join_80: {
    forward_join_37: {
    forward_join_17: {
    life1_3 = (moom.fW.m ^ 9005913301544L);
    life3_5 = net.minecraft.client.audio.SoundHandler.b();
    spill3541_0 = this.k;
    if (!((life3_5 == null))) {
        forwardValue3541_37_0 = spill3541_0;
        break forward_join_37;
    }
    if (!(((net.minecraft.entity.item.EntityMinecart)(spill3541_0)).F)) {
        break forward_join_17;
    }
    ((moom.fW)(this)).j = ((boolean)(true));
    if (!((life3_5 != null))) {
        break forward_join_86;
    }
    }
    ((moom.fW)(this)).d = ((float)(((float) ((net.minecraft.entity.item.EntityMinecart)(this.k)).n)));
    ((moom.fW)(this)).e = ((float)(((float) ((net.minecraft.entity.item.EntityMinecart)(this.k)).o)));
    ((moom.fW)(this)).f = ((float)(((float) ((net.minecraft.entity.item.EntityMinecart)(this.k)).p)));
    forwardValue3541_37_0 = this.k;
    }
    life4_60 = moom.Dr.a__Float(((double)(((((net.minecraft.entity.item.EntityMinecart)(forwardValue3541_37_0)).t * ((net.minecraft.entity.item.EntityMinecart)(this.k)).t) + (((net.minecraft.entity.item.EntityMinecart)(this.k)).v * ((net.minecraft.entity.item.EntityMinecart)(this.k)).v)))));
    if (!((life3_5 == null))) {
        break forward_join_83;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(((double) life4_60))), ((double)(0x1.47ae147ae147bp-7d))) >= 0))) {
        break forward_join_80;
    }
    this.l = ((float)(moom.Dr.a(((float)((this.l + 0x1.47ae14p-9f))), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)))));
    ((moom.fW)(this)).b = ((float)((0x0.0p0f + (moom.Dr.a(((float)(life4_60)), ((float)(0x0.0p0f)), ((float)(0x1.0p-1f))) * 0x1.666666p-1f))));
    if (!((life3_5 != null))) {
        break forward_join_86;
    }
    }
    this.l = ((float)(0x0.0p0f));
    }
    ((moom.fW)(this)).b = ((float)(0x0.0p0f));
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}

}
