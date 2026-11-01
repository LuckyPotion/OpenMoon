package moom;

import io.netty.buffer.ByteBuf;


class qX extends moom.qV {

net.minecraft.tileentity.TileEntityCommandBlock i;

qX(net.minecraft.tileentity.TileEntityCommandBlock p0) { super(); }


private static void __sourceConstructorBody_a1071bb795dc9d96(moom.qX receiver, net.minecraft.tileentity.TileEntityCommandBlock p0) throws Throwable {

((moom.qX)(receiver)).i = ((net.minecraft.tileentity.TileEntityCommandBlock)(p0));

    moom.qX.__sourceConstructorInit_a1071bb795dc9d96_0(((moom.qX)(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_a1071bb795dc9d96_0(moom.qX a0) throws E;

public int b() {
return 0;
}


public void a__Void() {
((net.minecraft.world.World)(((net.minecraft.tileentity.TileEntityCommandBlock)(this.i)).c__sourceInterfaceWorld())).a__Void(((moom.DT)(((net.minecraft.tileentity.TileEntityCommandBlock)(this.i)).e)));
    return;
}


public void a(ByteBuf p0) {
((ByteBuf)(p0)).writeInt(((int)(((moom.DT)(((net.minecraft.tileentity.TileEntityCommandBlock)(this.i)).e)).a())));
    ((ByteBuf)(p0)).writeInt(((int)(((moom.DT)(((net.minecraft.tileentity.TileEntityCommandBlock)(this.i)).e)).b())));
    ((ByteBuf)(p0)).writeInt(((int)(((moom.DT)(((net.minecraft.tileentity.TileEntityCommandBlock)(this.i)).e)).c())));
    return;
}


public net.minecraft.entity.Entity a__r3() {
return null;
}


public moom.DT a__DT() {
return ((net.minecraft.tileentity.TileEntityCommandBlock)(this.i)).e;
}


public moom.DR a__DR() {
return new moom.DR((((double) ((moom.DT)(((net.minecraft.tileentity.TileEntityCommandBlock)(this.i)).e)).a()) + 0x1.0p-1d), (((double) ((moom.DT)(((net.minecraft.tileentity.TileEntityCommandBlock)(this.i)).e)).b()) + 0x1.0p-1d), (((double) ((moom.DT)(((net.minecraft.tileentity.TileEntityCommandBlock)(this.i)).e)).c()) + 0x1.0p-1d));
}


public net.minecraft.world.World a__Eu() {
return ((net.minecraft.tileentity.TileEntityCommandBlock)(this.i)).c__sourceInterfaceWorld();
}


public void a(java.lang.String p0) {
super.a(((java.lang.String)(p0)));
    ((net.minecraft.tileentity.TileEntityCommandBlock)(this.i)).a__Void();
    return;
}

}
