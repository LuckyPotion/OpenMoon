package moom;


public class fX extends moom.fU {

private final net.minecraft.entity.player.EntityPlayer k;

private final net.minecraft.entity.item.EntityMinecart l;

private static final long m;

public fX(net.minecraft.entity.player.EntityPlayer p0, net.minecraft.entity.item.EntityMinecart p1) {
super(new moom.DD("minecraft:minecart.inside"));
    this.k = p0;
    this.l = p1;
    this.i = net.minecraft.client.audio.ISound$AttenuationType.NONE;
    this.g = true;
    this.h = 0;
}


static {
m = (moom._c.a(4069640368158791733L, -6299667514242233523L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(69915625455195L);
}


public void c__Void() {
moom.fX forwardValue3542_68_0;
    moom.fX spill3542_0;
    moom.fX spill3542_1;
    moom.fX spill3542_2;
    long life1_3;
    java.lang.String life3_5;
    float life4_57;
    forward_join_70: {
    forward_join_68: {
    forward_join_67: {
    forward_join_65: {
    forward_join_62: {
    forward_join_60: {
    life1_3 = (moom.fX.m ^ 2568684863053L);
    life3_5 = net.minecraft.client.audio.SoundHandler.b();
    spill3542_0 = this;
    if (!((life3_5 == null))) {
        forwardValue3542_68_0 = spill3542_0;
        break forward_join_68;
    }
    if (!((!((net.minecraft.entity.item.EntityMinecart)(((moom.fX)(spill3542_0)).l)).F))) {
        break forward_join_67;
    }
    spill3542_1 = this;
    if (!((life3_5 == null))) {
        forwardValue3542_68_0 = spill3542_1;
        break forward_join_68;
    }
    if (!(((net.minecraft.entity.player.EntityPlayer)(((moom.fX)(spill3542_1)).k)).s__Boolean())) {
        break forward_join_67;
    }
    spill3542_2 = this;
    if (!((life3_5 == null))) {
        forwardValue3542_68_0 = spill3542_2;
        break forward_join_68;
    }
    if (!((((net.minecraft.entity.player.EntityPlayer)(((moom.fX)(spill3542_2)).k)).g == this.l))) {
        break forward_join_67;
    }
    life4_57 = moom.Dr.a__Float(((double)(((((net.minecraft.entity.item.EntityMinecart)(this.l)).t * ((net.minecraft.entity.item.EntityMinecart)(this.l)).t) + (((net.minecraft.entity.item.EntityMinecart)(this.l)).v * ((net.minecraft.entity.item.EntityMinecart)(this.l)).v)))));
    if (!((life3_5 == null))) {
        break forward_join_60;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(((double) life4_57))), ((double)(0x1.47ae147ae147bp-7d))) >= 0))) {
        break forward_join_62;
    }
    ((moom.fX)(this)).b = ((float)((0x0.0p0f + (moom.Dr.a(((float)(life4_57)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f))) * 0x1.8p-1f))));
    }
    if (!((life3_5 != null))) {
        break forward_join_65;
    }
    }
    ((moom.fX)(this)).b = ((float)(0x0.0p0f));
    }
    if (!((life3_5 != null))) {
        break forward_join_70;
    }
    }
    forwardValue3542_68_0 = this;
    }
    ((moom.fX)(forwardValue3542_68_0)).j = ((boolean)(true));
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}

}
