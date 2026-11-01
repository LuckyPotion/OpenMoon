package moom;


class yl extends moom.yj {

protected java.util.List<moom.yj> b;

private static final long c;

public yl(java.lang.String p0) {
super();
    this.b = com.google.common.collect.Lists.newArrayList();
    this.a = p0;
}


static {
c = (moom._c.a(4621431550756831525L, -8705345248706959335L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(202628533425721L);
}


public net.minecraft.nbt.NBTBase a() throws net.minecraft.nbt.NBTException {
net.minecraft.nbt.NBTTagList lexicalValue1438_30_0;
    java.lang.String spill1438_0;
    net.minecraft.nbt.NBTTagList spill1438_1;
    long life1_3;
    net.minecraft.nbt.NBTTagList life4_8;
    java.lang.String life3_9;
    java.util.Iterator life5_13;
    moom.yj life6_20;
    lexical_join_30: {
    lexical_join_29: {
    life1_3 = (moom.yl.c ^ 61119088177123L);
    spill1438_0 = net.minecraft.nbt.NBTBase.b();
    life4_8 = new net.minecraft.nbt.NBTTagList();
    life3_9 = spill1438_0;
    life5_13 = ((java.util.List)(this.b)).iterator();
    lexical_cycle_14: while (true) {
    if (!(((java.util.Iterator)(life5_13)).hasNext())) {
        break lexical_join_29;
    }
    life6_20 = ((moom.yj)(((java.util.Iterator)(life5_13)).next()));
    spill1438_1 = life4_8;
    if (!((life3_9 == null))) {
        lexicalValue1438_30_0 = spill1438_1;
        break lexical_join_30;
    }
    ((net.minecraft.nbt.NBTTagList)(spill1438_1)).a(((net.minecraft.nbt.NBTBase)(((moom.yj)(life6_20)).a())));
    if (!((life3_9 != null))) { continue lexical_cycle_14; }
    break lexical_cycle_14;
    }
    }
    lexicalValue1438_30_0 = life4_8;
    }
    return lexicalValue1438_30_0;
}


private static net.minecraft.nbt.NBTException a(net.minecraft.nbt.NBTException p0) {
return p0;
}

}
