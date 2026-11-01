package moom;


class yk extends moom.yj {

protected java.util.List<moom.yj> b;

private static final long c;

public yk(java.lang.String p0) {
super();
    this.b = com.google.common.collect.Lists.newArrayList();
    this.a = p0;
}


static {
c = (moom._c.a(4271392496802349657L, -7296353245701226627L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(231847373668404L);
}


public net.minecraft.nbt.NBTBase a() throws net.minecraft.nbt.NBTException {
net.minecraft.nbt.NBTTagCompound lexicalValue1437_32_0;
    java.lang.String spill1437_0;
    net.minecraft.nbt.NBTTagCompound spill1437_1;
    long life1_3;
    net.minecraft.nbt.NBTTagCompound life4_8;
    java.util.Iterator life5_12;
    java.lang.String life3_13;
    moom.yj life6_20;
    lexical_join_32: {
    lexical_join_31: {
    life1_3 = (moom.yk.c ^ 7403341718692L);
    spill1437_0 = net.minecraft.nbt.NBTBase.b();
    life4_8 = new net.minecraft.nbt.NBTTagCompound();
    life5_12 = ((java.util.List)(this.b)).iterator();
    life3_13 = spill1437_0;
    lexical_cycle_14: while (true) {
    if (!(((java.util.Iterator)(life5_12)).hasNext())) {
        break lexical_join_31;
    }
    life6_20 = ((moom.yj)(((java.util.Iterator)(life5_12)).next()));
    spill1437_1 = life4_8;
    if (!((life3_13 == null))) {
        lexicalValue1437_32_0 = spill1437_1;
        break lexical_join_32;
    }
    ((net.minecraft.nbt.NBTTagCompound)(spill1437_1)).a(((java.lang.String)(((moom.yj)(life6_20)).a)), ((net.minecraft.nbt.NBTBase)(((moom.yj)(life6_20)).a())));
    if (!((life3_13 != null))) { continue lexical_cycle_14; }
    break lexical_cycle_14;
    }
    }
    lexicalValue1437_32_0 = life4_8;
    }
    return lexicalValue1437_32_0;
}


private static net.minecraft.nbt.NBTException a(net.minecraft.nbt.NBTException p0) {
return p0;
}

}
