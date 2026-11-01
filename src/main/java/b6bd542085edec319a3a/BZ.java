package moom;


public class BZ extends moom.BY {

public int n;

public int o;

public moom.BZ p;

private java.lang.String q;

private moom.BW r;

public net.minecraft.item.ItemStack s;

private boolean t;

private static long u;

public BZ(java.lang.String p0, java.lang.String p1, int p2, int p3, net.minecraft.item.ItemStack p4, moom.BZ p5) { super((java.lang.String)null, (net.minecraft.util.IChatComponent)null); }


private static void __sourceConstructorBody_315f96a5198c0ec4(moom.BZ receiver, java.lang.String p0, java.lang.String p1, int p2, int p3, net.minecraft.item.ItemStack p4, moom.BZ p5) throws Throwable {

long local7_life2 = (moom.BZ.u ^ 42247204053621L);

    moom.BZ.__sourceConstructorInit_315f96a5198c0ec4_0(((moom.BZ)(receiver)), ((java.lang.String)(p0)), ((net.minecraft.util.IChatComponent)(new moom.CN(__sourceIntrinsic_315f96a5198c0ec4_originalDynamicSite462_3(p1), new java.lang.Object[0]))));

    ((moom.BZ)(receiver)).s = ((net.minecraft.item.ItemStack)(p4));

    ((moom.BZ)(receiver)).q = ((java.lang.String)(__sourceIntrinsic_315f96a5198c0ec4_originalDynamicSite462_6(p1)));

    ((moom.BZ)(receiver)).n = ((int)(p2));

    ((moom.BZ)(receiver)).o = ((int)(p3));

    if ((p2 < net.minecraft.stats.AchievementList.a)) {

        net.minecraft.stats.AchievementList.a = ((int)(p2));

    }

    if ((p3 < net.minecraft.stats.AchievementList.b)) {

        net.minecraft.stats.AchievementList.b = ((int)(p3));

    }

    if ((p2 > net.minecraft.stats.AchievementList.c)) {

        net.minecraft.stats.AchievementList.c = ((int)(p2));

    }

    if ((p3 > net.minecraft.stats.AchievementList.d)) {

        net.minecraft.stats.AchievementList.d = ((int)(p3));

    }

    ((moom.BZ)(receiver)).p = ((moom.BZ)(p5));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_315f96a5198c0ec4_0(moom.BZ a0, java.lang.String a1, net.minecraft.util.IChatComponent a2) throws E;

public BZ(java.lang.String p0, java.lang.String p1, int p2, int p3, net.minecraft.block.Block p4, moom.BZ p5) {
this(((java.lang.String)(p0)), ((java.lang.String)(p1)), ((int)(p2)), ((int)(p3)), ((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(p4))), ((moom.BZ)(p5)));
    return;
}


public BZ(java.lang.String p0, java.lang.String p1, int p2, int p3, net.minecraft.item.Item p4, moom.BZ p5) {
this(((java.lang.String)(p0)), ((java.lang.String)(p1)), ((int)(p2)), ((int)(p3)), ((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(p4))), ((moom.BZ)(p5)));
    return;
}


static {
moom.BZ.u = (moom._c.a(-7140314892980514008L, 4336282576940919229L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(254240848176670L);
}


public moom.BZ b__BZ() {
this.t = ((boolean)(true));
    return this;
}


public moom.BY b() {
return ((moom.BZ)(this)).c__sourceReturn_192f954764();
}


public moom.BZ c__sourceReturn_192f954764() {
super.b();
    ((java.util.List)(net.minecraft.stats.AchievementList.e)).add(((java.lang.Object)(this)));
    return this;
}


public boolean d() {
return ((((this.t) ? 1 : 0)) != 0);
}


public moom.BY a__BY() {
return ((moom.BZ)(this)).a__BZ();
}


public moom.BY a__sourceBridge_a0cef047b7(java.lang.Class p0) {
return ((moom.BZ)(this)).a__BZ(((java.lang.Class)(p0)));
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public moom.BZ a__BZ() {
this.c = ((boolean)(true));
    return this;
}


public boolean a__Boolean() {
return ((1) != 0);
}


public net.minecraft.util.IChatComponent a__C5() {
long local1 = (moom.BZ.u ^ 80479141685291L);
    net.minecraft.util.IChatComponent local3 = super.a__C5();
    ((moom.CO)(((net.minecraft.util.IChatComponent)(local3)).a__CO())).a(((net.minecraft.util.EnumChatFormatting)((((moom.BZ)(this)).d() ? net.minecraft.util.EnumChatFormatting.DARK_PURPLE : net.minecraft.util.EnumChatFormatting.GREEN))));
    return local3;
}


public moom.BZ a__BZ(java.lang.Class<? extends net.minecraft.util.IJsonSerializable> p0) {
return ((moom.BZ)(super.a(((java.lang.Class)(p0)))));
}


public java.lang.String a__sourceReturn_0e30dfc966() {
moom.BZ forwardValue1506_19_0;
    java.lang.String forwardValue1506_21_0;
    moom.BZ spill1506_0;
    long life1_3;
    int life3_5;
    forward_join_21: {
    forward_join_19: {
    forward_join_18: {
    life1_3 = (moom.BZ.u ^ 80897453141198L);
    life3_5 = ((moom.BY.c()) ? 1 : 0);
    spill1506_0 = this;
    if (!((life3_5 != 0))) {
        forwardValue1506_19_0 = spill1506_0;
        break forward_join_19;
    }
    if (!((((moom.BZ)(spill1506_0)).r != null))) {
        break forward_join_18;
    }
    forwardValue1506_21_0 = ((moom.BW)(this.r)).a(((java.lang.String)(net.minecraft.util.StatCollector.a(((java.lang.String)(this.q))))));
    break forward_join_21;
    }
    forwardValue1506_19_0 = this;
    }
    forwardValue1506_21_0 = net.minecraft.util.StatCollector.a(((java.lang.String)(((moom.BZ)(forwardValue1506_19_0)).q)));
    }
    return forwardValue1506_21_0;
}


public moom.BZ a(moom.BW p0) {
this.r = ((moom.BW)(p0));
    return this;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_315f96a5198c0ec4_originalDynamicSite462_3(java.lang.String a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_315f96a5198c0ec4_originalDynamicSite462_6(java.lang.String a0) throws E;

public moom.BY a(java.lang.Class<? extends net.minecraft.util.IJsonSerializable> __bridgeParam0) { return this.a__sourceBridge_a0cef047b7(((java.lang.Class)(__bridgeParam0))); }
}
