package moom;


public class Jx implements java.util.Comparator {

private static final long a;

public Jx() {
super();
}


static {
a = (moom._c.a(-8071655727005072024L, -3365775414856007275L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(10945822917604L);
}


public int compare(java.lang.Object p0, java.lang.Object p1) {
int forwardValue2446_32_0;
    java.lang.String forwardValue2446_43_0;
    java.lang.String forwardValue2446_43_1;
    int forwardValue2446_44_0;
    net.minecraft.entity.Entity[] spill2446_0;
    int spill2446_1;
    java.lang.String spill2446_2;
    java.lang.String spill2446_3;
    long life3_3;
    moom.Jv life6_7;
    net.minecraft.entity.Entity[] life5_8;
    moom.Jv life7_11;
    forward_join_44: {
    forward_join_43: {
    forward_join_39: {
    forward_join_32: {
    forward_join_25: {
    life3_3 = (moom.Jx.a ^ 123283742965373L);
    spill2446_0 = moom.JM.b__Arrayr3();
    life6_7 = ((moom.Jv)(p0));
    life5_8 = spill2446_0;
    life7_11 = ((moom.Jv)(p1));
    spill2446_1 = ((moom.Jv)(life6_7)).v;
    if (!((life5_8 != null))) {
        forwardValue2446_32_0 = spill2446_1;
        break forward_join_32;
    }
    if (!((spill2446_1 != ((moom.Jv)(life7_11)).v))) {
        break forward_join_25;
    }
    forwardValue2446_44_0 = (((moom.Jv)(life7_11)).v - ((moom.Jv)(life6_7)).v);
    break forward_join_44;
    }
    spill2446_2 = ((moom.Jv)(life6_7)).b;
    spill2446_3 = ((moom.Jv)(life7_11)).b;
    if (!((life5_8 != null))) {
        forwardValue2446_43_0 = spill2446_2;
        forwardValue2446_43_1 = spill2446_3;
        break forward_join_43;
    }
    forwardValue2446_32_0 = ((moom.BU.a(((java.lang.Object)(spill2446_2)), ((java.lang.Object)(spill2446_3)))) ? 1 : 0);
    }
    if (!((forwardValue2446_32_0 == 0))) {
        break forward_join_39;
    }
    forwardValue2446_44_0 = ((java.lang.String)(((moom.Jv)(life6_7)).b)).compareTo(((java.lang.String)(((moom.Jv)(life7_11)).b)));
    break forward_join_44;
    }
    forwardValue2446_43_0 = ((moom.Jv)(life6_7)).a;
    forwardValue2446_43_1 = ((moom.Jv)(life7_11)).a;
    }
    forwardValue2446_44_0 = ((java.lang.String)(forwardValue2446_43_0)).compareTo(((java.lang.String)(forwardValue2446_43_1)));
    }
    return forwardValue2446_44_0;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}

}
