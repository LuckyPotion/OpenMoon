package net.minecraft.block;


public abstract class BlockDirectional extends net.minecraft.block.Block {

public static final moom.fx Q;

protected BlockDirectional(moom.fn p0) {
super(p0);
}


protected BlockDirectional(moom.fn p0, moom.fm p1) {
super(p0, p1);
}


static {
net.minecraft.block.BlockDirectional.Q = moom.fx.a("facing", net.minecraft.util.EnumFacing$Plane.HORIZONTAL);
}

}
