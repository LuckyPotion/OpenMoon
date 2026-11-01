package moom;


public class eu extends net.minecraft.block.Block {

private static final long Q;

public eu() {
super(moom.fn.p, moom.fm.B);
    (this).a(net.minecraft.creativetab.CreativeTabs.b);
}


static {
Q = (moom._c.a(-579327275256546834L, -1201268516118528192L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(52468857665479L);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.entity.Entity p3) {
long life5_3;
    com.moon.event.ActionEvent life8_9;
    int[] life7_10;
    forward_join_32: {
    forward_join_26: {
    life5_3 = (moom.eu.Q ^ 10781035931256L);
    int[] spill3485_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life8_9 = new com.moon.event.ActionEvent(com.moon.event.ActionType.BLOCKS);
    life7_10 = spill3485_0;
    ((com.moon.events.EventBus)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).getEventBus())).publish(((java.lang.Object)(life8_9)));
    if (!((life7_10 != null))) { break forward_join_26; }
    if (!((!((com.moon.event.ActionEvent)(life8_9)).isCancelled()))) { break forward_join_32; }
    net.minecraft.entity.Entity __stackOp3485_7_0 = p3;
    ((net.minecraft.entity.Entity)(__stackOp3485_7_0)).t = ((double)((((net.minecraft.entity.Entity)(__stackOp3485_7_0)).t * 0x1.999999999999ap-2d)));
    }
    net.minecraft.entity.Entity __stackOp3485_10_0 = p3;
    ((net.minecraft.entity.Entity)(__stackOp3485_10_0)).v = ((double)((((net.minecraft.entity.Entity)(__stackOp3485_10_0)).v * 0x1.999999999999ap-2d)));
    }
    return;
}


public moom.CA a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
float local4 = 0x1.0p-3f;
    return new moom.CA(((double) ((moom.DT)(p1)).a()), ((double) ((moom.DT)(p1)).b()), ((double) ((moom.DT)(p1)).c()), ((double) (((moom.DT)(p1)).a() + 1)), ((double) (((float) (((moom.DT)(p1)).b() + 1)) - local4)), ((double) (((moom.DT)(p1)).c() + 1)));
}

}
