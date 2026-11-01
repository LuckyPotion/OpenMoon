package moom;


public class B1 extends moom.BY {

private net.minecraft.item.Item n;

private static long o;

public B1(java.lang.String p0, java.lang.String p1, net.minecraft.util.IChatComponent p2, net.minecraft.item.Item p3) { super((java.lang.String)null, (net.minecraft.util.IChatComponent)null); __sourceHandlerCall_cfcd6636fafa8a20e3a7(this, p0, p1, p2, p3); }

private static native <E extends Throwable> void __sourceHandlerCall_cfcd6636fafa8a20e3a7(moom.B1 a0, java.lang.String a1, java.lang.String a2, net.minecraft.util.IChatComponent a3, net.minecraft.item.Item a4) throws E;
private static final class __SourceHandler_cfcd6636fafa8a20e3a7 {

public static void f520(moom.B1 receiver, java.lang.String p0, java.lang.String p1, net.minecraft.util.IChatComponent p2, net.minecraft.item.Item p3) throws Throwable {
    long local5_life1 = (__fieldRead520_0() ^ 75446921731421L);
    __directSuperInit520_3(receiver, __originalDynamicSite520_2(p0, p1), p2);
    __fieldWrite520_4(receiver, p3);
    int local7_life6 = __call520_5(p3);
    if ((local7_life6 != 0)) {
        __call520_10(__fieldRead520_7(), __originalDynamicSite520_8(p0, local7_life6), __call520_9(receiver));
    }
    return;
}
private static native long __fieldRead520_0();
private static native java.lang.String __originalDynamicSite520_2(java.lang.String a0, java.lang.String a1);
private static native void __directSuperInit520_3(moom.B1 a0, java.lang.String a1, net.minecraft.util.IChatComponent a2);
private static native void __fieldWrite520_4(moom.B1 a0, net.minecraft.item.Item a1);
private static native int __call520_5(net.minecraft.item.Item a0);
private static native java.util.Map __fieldRead520_7();
private static native java.lang.String __originalDynamicSite520_8(java.lang.String a0, int a1);
private static native net.minecraft.scoreboard.IScoreObjectiveCriteria __call520_9(moom.B1 a0);
private static native java.lang.Object __call520_10(java.util.Map a0, java.lang.String a1, net.minecraft.scoreboard.IScoreObjectiveCriteria a2);

}


static {
moom.B1.o = (moom._c.a(7246435933090385366L, -3279886180934841259L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(206081963270579L);
}


public net.minecraft.item.Item a__sourceReturn_e516839077() {
return this.n;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_4dacf26b5a36_originalDynamicSite520_2(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_4dacf26b5a36_originalDynamicSite520_8(java.lang.String a0, int a1) throws E;
}
