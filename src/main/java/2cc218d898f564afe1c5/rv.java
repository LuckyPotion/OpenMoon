package moom;


class rv extends moom.rd {

private static final long c;

rv() {
super();
}


static {
c = (moom._c.a(1466071167180052642L, -7231879351066169443L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(143986372834039L);
}


protected net.minecraft.item.ItemStack b(moom.ry p0, net.minecraft.item.ItemStack p1) {
java.lang.Object forwardValue3933_64_0;
    int forwardValue3933_72_0;
    int forwardValue3933_74_0;
    boolean spill3933_0;
    java.util.List spill3933_1;
    int spill3933_2;
    long life3_3;
    moom.DT life6_11;
    int life7_14;
    int life5_15;
    int life8_18;
    int life9_21;
    moom.CA life10_43;
    java.util.List life11_55;
    net.minecraft.entity.EntityLivingBase life12_71;
    int life13_83;
    int life14_86;
    net.minecraft.item.ItemStack life15_89;
    forward_join_108: {
    forward_join_106: {
    forward_join_100: {
    forward_join_74: {
    forward_join_73: {
    forward_join_72: {
    forward_join_64: {
    life3_3 = (moom.rv.c ^ 86613782788576L);
    spill3933_0 = net.minecraft.item.ItemStack.l();
    life6_11 = ((moom.DT)(((moom.ry)(p0)).a__DT())).a(((moom.bs)(__sourceExactCall_b9f266c58b58a2(((int)(((moom.ry)(p0)).a__Int()))))));
    life7_14 = ((moom.DT)(life6_11)).a();
    life5_15 = ((spill3933_0) ? 1 : 0);
    life8_18 = ((moom.DT)(life6_11)).b();
    life9_21 = ((moom.DT)(life6_11)).c();
    life10_43 = new moom.CA(((double) life7_14), ((double) life8_18), ((double) life9_21), ((double) (life7_14 + 1)), ((double) (life8_18 + 1)), ((double) (life9_21 + 1)));
    life11_55 = ((net.minecraft.world.World)(((moom.ry)(p0)).a__Eu())).a(((java.lang.Class)(net.minecraft.entity.EntityLivingBase.class)), ((moom.CA)(life10_43)), ((com.google.common.base.Predicate)(com.google.common.base.Predicates.and(((com.google.common.base.Predicate)(moom.CY.d)), ((com.google.common.base.Predicate)(new moom.CZ(p1)))))));
    spill3933_1 = life11_55;
    if (!((life5_15 == 0))) {
        forwardValue3933_64_0 = spill3933_1;
        break forward_join_64;
    }
    if (!((((java.util.List)(spill3933_1)).size() > 0))) {
        break forward_join_108;
    }
    forwardValue3933_64_0 = ((java.util.List)(life11_55)).get(((int)(0)));
    }
    life12_71 = ((net.minecraft.entity.EntityLivingBase)(forwardValue3933_64_0));
    spill3933_2 = ((life12_71 instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0);
    if (!((life5_15 == 0))) {
        forwardValue3933_72_0 = spill3933_2;
        break forward_join_72;
    }
    if (!((spill3933_2 != 0))) {
        break forward_join_73;
    }
    forwardValue3933_72_0 = 1;
    }
    forwardValue3933_74_0 = forwardValue3933_72_0;
    break forward_join_74;
    }
    forwardValue3933_74_0 = 0;
    }
    life13_83 = forwardValue3933_74_0;
    life14_86 = __sourceExactCall_f21b3836e04476(((net.minecraft.item.ItemStack)(p1)));
    life15_89 = ((net.minecraft.item.ItemStack)(p1)).a__xW();
    ((net.minecraft.item.ItemStack)(life15_89)).b = ((int)(1));
    ((net.minecraft.entity.EntityLivingBase)(life12_71)).b(((int)((life14_86 - life13_83))), ((net.minecraft.item.ItemStack)(life15_89)));
    if (!((life5_15 == 0))) {
        break forward_join_106;
    }
    if (!((((life12_71 instanceof net.minecraft.entity.EntityLiving) ? 1 : 0) != 0))) {
        break forward_join_100;
    }
    ((net.minecraft.entity.EntityLiving)(((net.minecraft.entity.EntityLiving)(life12_71)))).a(((int)(life14_86)), ((float)(0x1.0p1f)));
    }
    net.minecraft.item.ItemStack __stackOp3933_26_0 = p1;
    ((net.minecraft.item.ItemStack)(__stackOp3933_26_0)).b = ((int)((((net.minecraft.item.ItemStack)(__stackOp3933_26_0)).b - 1)));
    }
    return p1;
    }
    return super.b(((moom.ry)(p0)), ((net.minecraft.item.ItemStack)(p1)));
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


private static native moom.bs __sourceExactCall_b9f266c58b58a2(int p0);
private static native int __sourceExactCall_f21b3836e04476(net.minecraft.item.ItemStack p0);
}
