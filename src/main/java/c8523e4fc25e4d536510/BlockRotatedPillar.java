package net.minecraft.block;


public abstract class BlockRotatedPillar extends net.minecraft.block.Block {

public static final moom.fw<net.minecraft.util.EnumFacing$Axis> Q;

protected BlockRotatedPillar(moom.fn p0) {
super(p0, (p0).a__fm());
}


protected BlockRotatedPillar(moom.fn p0, moom.fm p1) {
super(p0, p1);
}


static {
Q = moom.fw.a("axis", net.minecraft.util.EnumFacing$Axis.class);
}

}
