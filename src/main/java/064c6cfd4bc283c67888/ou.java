package moom;


public class ou extends net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer<moom.Ce> {

private static final moom.DD f;

public moom.i3 g;

public ou() {
super();
    this.g = new moom.i3();
}


static {
moom.ou.f = new moom.DD("textures/entity/enchanting_table_book.png");
}


public void a(moom.Ce p0, double p1, double p2, double p3, float p4, int p5) {
moom.kZ.B();
    moom.kZ.b(((float)((((float) p1) + 0x1.0p-1f))), ((float)((((float) p2) + 0x1.8p-1f))), ((float)((((float) p3) + 0x1.0p-1f))));
    float local10 = (((float) ((moom.Ce)(p0)).l) + p4);
    moom.kZ.b(((float)(0x0.0p0f)), ((float)((0x1.99999ap-4f + (moom.Dr.a(((float)((local10 * 0x1.99999ap-4f)))) * 0x1.47ae14p-7f)))), ((float)(0x0.0p0f)));
    float local11 = (((moom.Ce)(p0)).s - ((moom.Ce)(p0)).t);
    while ((local11 >= 0x1.921fb6p1f)) {
        local11 = (local11 - 0x1.921fb6p2f);
    }
    while ((local11 < -0x1.921fb6p1f)) {
        local11 = (local11 + 0x1.921fb6p2f);
    }
    float local12 = (((moom.Ce)(p0)).t + (local11 * p4));
    moom.kZ.b(((float)((((-local12) * 0x1.68p7f) / 0x1.921fb6p1f))), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)));
    moom.kZ.b(((float)(0x1.4p6f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)));
    ((moom.ou)(this)).b(((moom.DD)(moom.ou.f)));
    float local13 = ((((moom.Ce)(p0)).n + ((((moom.Ce)(p0)).m - ((moom.Ce)(p0)).n) * p4)) + 0x1.0p-2f);
    float local14 = ((((moom.Ce)(p0)).n + ((((moom.Ce)(p0)).m - ((moom.Ce)(p0)).n) * p4)) + 0x1.8p-1f);
    local13 = (((local13 - ((float) moom.Dr.a__Int(((double)(((double) local13)))))) * 0x1.99999ap0f) - 0x1.333334p-2f);
    local14 = (((local14 - ((float) moom.Dr.a__Int(((double)(((double) local14)))))) * 0x1.99999ap0f) - 0x1.333334p-2f);
    if ((local13 < 0x0.0p0f)) {
        local13 = 0x0.0p0f;
    }
    if ((local14 < 0x0.0p0f)) {
        local14 = 0x0.0p0f;
    }
    if ((local13 > 0x1.0p0f)) {
        local13 = 0x1.0p0f;
    }
    if ((local14 > 0x1.0p0f)) {
        local14 = 0x1.0p0f;
    }
    float local15 = (((moom.Ce)(p0)).r + ((((moom.Ce)(p0)).q - ((moom.Ce)(p0)).r) * p4));
    moom.kZ.o();
    ((moom.i3)(this.g)).a(((net.minecraft.entity.Entity)(null)), ((float)(local10)), ((float)(local13)), ((float)(local14)), ((float)(local15)), ((float)(0x0.0p0f)), ((float)(0x1.0p-4f)));
    moom.kZ.C();
    return;
}


public void a__sourceBridge_42179a2d44(net.minecraft.tileentity.TileEntity p0, double p1, double p2, double p3, float p4, int p5) {
((moom.ou)(this)).a(((moom.Ce)(((moom.Ce)(p0)))), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((float)(p4)), ((int)(p5)));
}



}
