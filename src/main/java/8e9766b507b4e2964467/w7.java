package moom;


public class w7 extends net.minecraft.item.Item {

private static final long n;

public w7() {
super();
}


static {
n = (moom._c.a(-2500465012680764134L, 1146483409316605005L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(196581816792020L);
}


public int c() {
return 1;
}


public boolean c__Boolean(net.minecraft.item.ItemStack p0) {
int forwardValue4345_13_0;
    int forwardValue4345_15_0;
    int spill4345_0;
    long life2_3;
    int life4_5;
    forward_join_15: {
    forward_join_14: {
    forward_join_13: {
    life2_3 = (moom.w7.n ^ 111018744004045L);
    life4_5 = ((net.minecraft.item.ItemStack.m()) ? 1 : 0);
    spill4345_0 = ((net.minecraft.item.ItemStack)(p0)).b;
    if (!((life4_5 != 0))) {
        forwardValue4345_13_0 = spill4345_0;
        break forward_join_13;
    }
    if (!((spill4345_0 == 1))) {
        break forward_join_14;
    }
    forwardValue4345_13_0 = 1;
    }
    forwardValue4345_15_0 = forwardValue4345_13_0;
    break forward_join_15;
    }
    forwardValue4345_15_0 = 0;
    }
    return ((forwardValue4345_15_0) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}

}
