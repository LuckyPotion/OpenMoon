package moom;



import moom.fn;

import java.util.Random;

import net.minecraft.entity.Entity;

import net.minecraft.util.EnumWorldBlockLayer;
import moom.CA;
import moom.DT;
import moom.Oo;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPlanks$EnumType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.world.World;
public class cu extends net.minecraft.block.Block {

private static net.minecraft.entity.Entity[] Q;

private static final long U;

protected cu(moom.fn p0, moom.fm p1) {
super(p0, p1);
    ((moom.cu)(this)).a(((boolean)__sourceIntrinsic_integerToBoolean((1))));
    float local3 = 0x1.99999ap-3f;
    ((moom.cu)(this)).a(((float)((0x1.0p-1f - local3))), ((float)(0x0.0p0f)), ((float)((0x1.0p-1f - local3))), ((float)((0x1.0p-1f + local3))), ((float)((local3 * 0x1.8p1f))), ((float)((0x1.0p-1f + local3))));
    ((moom.cu)(this)).a(((net.minecraft.creativetab.CreativeTabs)(net.minecraft.creativetab.CreativeTabs.c)));
    return;
}


protected cu(moom.fn p0) {
this(((moom.fn)(p0)), ((moom.fm)(((moom.fn)(p0)).a__fm())));
    return;
}


protected cu() {
this(((moom.fn)(moom.fn.k)));
    return;
}


static {
U = ((long)(((moom._a)(moom._c.a(((long)(-3490713955777988345L)), ((long)(-1089053357596725239L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(117034101987843L)))));
    if ((moom.cu.a__Arrayr3() != null)) {
        moom.cu.b(((net.minecraft.entity.Entity[])(new net.minecraft.entity.Entity[2])));
    }
}


public static void b(net.minecraft.entity.Entity[] p0) {
Q = ((net.minecraft.entity.Entity[])(p0));
    return;
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public void b(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, java.util.Random p3) {
((moom.cu)(this)).d(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)));
    return;
}


protected boolean b(net.minecraft.block.Block p0) {
net.minecraft.block.Block forwardValue3152_13_0;
    net.minecraft.block.Block forwardValue3152_13_1;
    net.minecraft.block.Block forwardValue3152_18_0;
    net.minecraft.block.Block forwardValue3152_18_1;
    int forwardValue3152_22_0;
    net.minecraft.block.Block spill3152_0;
    moom.dC spill3152_1;
    long life2_3;
    int[] life4_5;
    forward_join_22: {
    forward_join_21: {
    forward_join_19: {
    forward_join_18: {
    forward_join_13: {
    life2_3 = (moom.cu.U ^ 74751708821125L);
    life4_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3152_0 = p0;
    spill3152_1 = net.minecraft.init.Blocks.c;
    if (!((life4_5 != null))) {
        forwardValue3152_13_0 = spill3152_0;
        forwardValue3152_13_1 = spill3152_1;
        break forward_join_13;
    }
    if (!((spill3152_0 != spill3152_1))) {
        break forward_join_19;
    }
    forwardValue3152_13_0 = p0;
    forwardValue3152_13_1 = net.minecraft.init.Blocks.d;
    }
    if (!((life4_5 != null))) {
        forwardValue3152_18_0 = forwardValue3152_13_0;
        forwardValue3152_18_1 = forwardValue3152_13_1;
        break forward_join_18;
    }
    if (!((forwardValue3152_13_0 != forwardValue3152_13_1))) {
        break forward_join_19;
    }
    forwardValue3152_18_0 = p0;
    forwardValue3152_18_1 = net.minecraft.init.Blocks.ak;
    }
    if (!((forwardValue3152_18_0 == forwardValue3152_18_1))) {
        break forward_join_21;
    }
    }
    forwardValue3152_22_0 = 1;
    break forward_join_22;
    }
    forwardValue3152_22_0 = 0;
    }
    return ((forwardValue3152_22_0) != 0);
}


public boolean b__Boolean(net.minecraft.world.World p0, moom.DT p1) {
long l = moom.cu.U ^ 0x1CF536C7A6FL;
        int[] nArray = BlockPlanks$EnumType.b__ArrayInt();
        boolean bl = super.b__Boolean(p0, p1);
        if (nArray != null) {
            if (!bl) return false;
            bl = this.b(p0.a__fE(__sourceExactCall_bcb977d05e639b(p1)).a__ch());
        }
        if (nArray == null) return bl;
        if (!bl) return false;
        return true;
}


protected void d(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
int forwardValue3153_26_0;
    boolean spill3153_0;
    long life4_3;
    int[] life6_5;
    forward_join_27: {
    forward_join_26: {
    life4_3 = (moom.cu.U ^ 140658912984537L);
    life6_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3153_0 = ((moom.cu)(this)).a__Boolean(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)));
    if (!((life6_5 != null))) {
        forwardValue3153_26_0 = ((spill3153_0) ? 1 : 0);
        break forward_join_26;
    }
    if (!((!spill3153_0))) {
        break forward_join_27;
    }
    ((moom.cu)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((int)(0)));
    forwardValue3153_26_0 = ((((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((int)(3)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue3153_26_0);
    }
    return;
}


public net.minecraft.util.EnumWorldBlockLayer a__bx() {
return net.minecraft.util.EnumWorldBlockLayer.CUTOUT;
}


public static net.minecraft.entity.Entity[] a__Arrayr3() {
return moom.cu.Q;
}


public boolean a__Boolean(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
return (__sourceIntrinsic_booleanComparison((((moom.cu)(this)).b(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(__sourceExactCall_bcb977d05e639b(((moom.DT)(p1)))))))).a__ch()))))) != 0);
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.block.Block p3) {
super.a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((net.minecraft.block.Block)(p3)));
    ((moom.cu)(this)).d(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)));
    return;
}


public moom.CA a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
return null;
}


public boolean g() {
return ((0) != 0);
}


public boolean j() {
return ((0) != 0);
}


private static native int __sourceIntrinsic_booleanComparison(boolean value);

private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native moom.DT __sourceExactCall_bcb977d05e639b(moom.DT p0);
}
