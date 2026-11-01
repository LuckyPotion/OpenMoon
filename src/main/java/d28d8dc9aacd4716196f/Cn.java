package moom;


public class Cn extends moom.Cm {

private static final long r;

public Cn() {
super();
}


static {
r = (moom._c.a(7712694717569114265L, 7411691169255803048L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(221444588494005L);
}


private static moom.Oo c(moom.Oo p0) {
return p0;
}


public java.lang.String c__String() {
return "minecraft:dropper";
}


public java.lang.String a__String() {
moom.Cn forwardValue1646_12_0;
    java.lang.String forwardValue1646_15_0;
    moom.Cn spill1646_0;
    long life1_3;
    java.lang.String[] life3_5;
    forward_join_15: {
    forward_join_14: {
    forward_join_12: {
    life1_3 = (moom.Cn.r ^ 57379997897008L);
    life3_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    spill1646_0 = this;
    if (!((life3_5 != null))) {
        forwardValue1646_12_0 = spill1646_0;
        break forward_join_12;
    }
    if (!(((moom.Cn)(spill1646_0)).e__Boolean())) {
        break forward_join_14;
    }
    forwardValue1646_12_0 = this;
    }
    forwardValue1646_15_0 = ((moom.Cn)(forwardValue1646_12_0)).p;
    break forward_join_15;
    }
    forwardValue1646_15_0 = "container.dropper";
    }
    return forwardValue1646_15_0;
}

}
