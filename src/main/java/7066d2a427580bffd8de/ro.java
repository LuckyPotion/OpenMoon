package moom;


class ro extends moom.rd {

ro() {
super();
}


protected net.minecraft.item.ItemStack b(moom.ry p0, net.minecraft.item.ItemStack p1) {
net.minecraft.world.World local3_life1 = ((moom.ry)(p0)).a__Eu();
    moom.DT local4_life6 = ((moom.DT)(((moom.ry)(p0)).a__DT())).a(((moom.bs)(__sourceExactCall_b9f266c58b58a2(((int)(((moom.ry)(p0)).a__Int()))))));
    moom.tK local5_life10 = new moom.tK(local3_life1, (((double) ((moom.DT)(local4_life6)).a()) + 0x1.0p-1d), ((double) ((moom.DT)(local4_life6)).b()), (((double) ((moom.DT)(local4_life6)).c()) + 0x1.0p-1d), null);
    ((net.minecraft.world.World)(local3_life1)).b__Boolean(((net.minecraft.entity.Entity)(local5_life10)));
    ((net.minecraft.world.World)(local3_life1)).a(((net.minecraft.entity.Entity)(local5_life10)), ((java.lang.String)("game.tnt.primed")), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    p1.b -= 1;
    return p1;
}


private static native moom.bs __sourceExactCall_b9f266c58b58a2(int p0);
}
