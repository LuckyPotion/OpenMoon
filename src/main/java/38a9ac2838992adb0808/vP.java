package moom;



public interface vP extends net.minecraft.entity.passive.IAnimals {
public static final com.google.common.base.Predicate a = null;
public static final com.google.common.base.Predicate b = null;
public static final long kb = 0L;
}
abstract class __SourceInterface_vP implements net.minecraft.entity.passive.IAnimals , moom.vP {

public static com.google.common.base.Predicate<net.minecraft.entity.Entity> a;

public static com.google.common.base.Predicate<net.minecraft.entity.Entity> b;

public static long kb;

private static void initialize() {
kb = ((long)(((moom._a)(moom._c.a(((long)(-775719215714639212L)), ((long)(9174945059271627609L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(76348570106359L)))));
    a = ((com.google.common.base.Predicate)(__SourceIntrinsics_38a9ac2838992adb0808.__sourceIntrinsic_eb8803ad1f63_originalDynamicSite5068_5()));
    b = ((com.google.common.base.Predicate)(__SourceIntrinsics_38a9ac2838992adb0808.__sourceIntrinsic_eb8803ad1f63_originalDynamicSite5068_7()));
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static boolean lambda$static$1(net.minecraft.entity.Entity p0) {
int forwardValue4303_13_0;
    int forwardValue4303_17_0;
    int forwardValue4303_19_0;
    int spill4303_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_19: {
    forward_join_18: {
    forward_join_17: {
    forward_join_13: {
    life1_3 = (moom.__SourceInterface_vP.kb ^ 93420172429110L);
    life3_5 = moom.vN.b();
    spill4303_0 = ((p0 instanceof moom.vP) ? 1 : 0);
    if (!((life3_5 == null))) {
        forwardValue4303_13_0 = spill4303_0;
        break forward_join_13;
    }
    if (!((spill4303_0 != 0))) {
        break forward_join_18;
    }
    forwardValue4303_13_0 = ((((net.minecraft.entity.Entity)(p0)).v__Boolean()) ? 1 : 0);
    }
    if (!((life3_5 == null))) {
        forwardValue4303_17_0 = forwardValue4303_13_0;
        break forward_join_17;
    }
    if (!((forwardValue4303_13_0 == 0))) {
        break forward_join_18;
    }
    forwardValue4303_17_0 = 1;
    }
    forwardValue4303_19_0 = forwardValue4303_17_0;
    break forward_join_19;
    }
    forwardValue4303_19_0 = 0;
    }
    return ((forwardValue4303_19_0) != 0);
}


private static boolean lambda$static$0(net.minecraft.entity.Entity p0) {
return ((((p0 instanceof moom.vP) ? 1 : 0)) != 0);
}



}
