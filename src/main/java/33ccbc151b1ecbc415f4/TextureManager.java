package net.minecraft.client.renderer.texture;


public class TextureManager implements net.minecraft.client.renderer.texture.ITickable, net.minecraft.client.resources.IResourceManagerReloadListener {

private static org.apache.logging.log4j.Logger a;

private java.util.Map<moom.DD, net.minecraft.client.renderer.texture.ITextureObject> b;

private java.util.List<net.minecraft.client.renderer.texture.ITickable> c;

private java.util.Map<java.lang.String, java.lang.Integer> d;

private moom.oR e;

private net.minecraft.client.renderer.texture.ITextureObject f;

private moom.DD g;

private static int h;

public TextureManager(moom.oR p0) {
super();
    this.b = com.google.common.collect.Maps.newHashMap();
    this.c = com.google.common.collect.Lists.newArrayList();
    this.d = com.google.common.collect.Maps.newHashMap();
    this.e = p0;
}


static {
int __sourceSpill3268_2 = 0;
    a = ((org.apache.logging.log4j.Logger)(org.apache.logging.log4j.LogManager.getLogger()));
    net.minecraft.client.renderer.texture.TextureManager.b(((int)(__sourceSpill3268_2)));
}

private static native <E extends Throwable> boolean __sourceHandlerCall_6de21a22e98453fc0407(net.minecraft.client.renderer.texture.TextureManager a0, moom.DD a1, net.minecraft.client.renderer.texture.ITextureObject a2) throws E;
private static final class __SourceHandler_6de21a22e98453fc0407 {

public static boolean f617(net.minecraft.client.renderer.texture.TextureManager receiver, moom.DD p0, net.minecraft.client.renderer.texture.ITextureObject p1) throws Throwable {
    int life3_1;
    life3_1 = 1;
    __call617_1(p1, __fieldRead617_0(receiver));
    __call617_3(__fieldRead617_2(receiver), p0, p1);
    return __integerCategory617_4(life3_1);
}
public static boolean h617_0(java.io.IOException p0, net.minecraft.client.renderer.texture.TextureManager p1, moom.DD p2, net.minecraft.client.renderer.texture.ITextureObject p3, int p4) throws Throwable {
    java.io.IOException life5_2;
    moom.n3 life3_9;
    int life4_17;
    life5_2 = p0;
    __call3061700_2(__fieldRead3061700_0(), __invokedynamic3061700_1(p2), life5_2);
    life3_9 = __fieldRead3061700_3();
    __call3061700_5(__fieldRead3061700_4(p1), p2, life3_9);
    life4_17 = 0;
    __call3061700_7(__fieldRead3061700_6(p1), p2, life3_9);
    return __integerCategory3061700_8(life4_17);
}
public static boolean h617_1(java.lang.Throwable p0, moom.DD p1, net.minecraft.client.renderer.texture.ITextureObject p2) throws Throwable {
    java.lang.Throwable life3_2;
    net.minecraft.client.renderer.texture.ITextureObject life4_4;
    moom.qY life5_8;
    moom.qZ life6_12;
    life3_2 = p0;
    life4_4 = p2;
    life5_8 = __call3061701_0(life3_2, "Registering texture");
    life6_12 = __call3061701_1(life5_8, "Resource location being registered");
    __call3061701_2(life6_12, "Resource location", p1);
    __call3061701_4(life6_12, "Texture object class", __invokedynamic3061701_3(life4_4));
    throw new moom.Oo(life5_8);
}
private static native moom.oR __fieldRead617_0(net.minecraft.client.renderer.texture.TextureManager a0) throws Throwable;
private static native void __call617_1(net.minecraft.client.renderer.texture.ITextureObject a0, moom.oR a1) throws Throwable;
private static native java.util.Map __fieldRead617_2(net.minecraft.client.renderer.texture.TextureManager a0) throws Throwable;
private static native java.lang.Object __call617_3(java.util.Map a0, moom.DD a1, net.minecraft.client.renderer.texture.ITextureObject a2) throws Throwable;
private static native boolean __integerCategory617_4(int value) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead3061700_0() throws Throwable;
private static native java.lang.String __invokedynamic3061700_1(moom.DD a0) throws Throwable;
private static native void __call3061700_2(org.apache.logging.log4j.Logger a0, java.lang.String a1, java.io.IOException a2) throws Throwable;
private static native moom.n3 __fieldRead3061700_3() throws Throwable;
private static native java.util.Map __fieldRead3061700_4(net.minecraft.client.renderer.texture.TextureManager a0) throws Throwable;
private static native java.lang.Object __call3061700_5(java.util.Map a0, moom.DD a1, moom.n3 a2) throws Throwable;
private static native java.util.Map __fieldRead3061700_6(net.minecraft.client.renderer.texture.TextureManager a0) throws Throwable;
private static native java.lang.Object __call3061700_7(java.util.Map a0, moom.DD a1, moom.n3 a2) throws Throwable;
private static native boolean __integerCategory3061700_8(int value) throws Throwable;
private static native moom.qY __call3061701_0(java.lang.Throwable a0, java.lang.String a1) throws Throwable;
private static native moom.qZ __call3061701_1(moom.qY a0, java.lang.String a1) throws Throwable;
private static native void __call3061701_2(moom.qZ a0, java.lang.String a1, moom.DD a2) throws Throwable;
private static native java.util.concurrent.Callable __invokedynamic3061701_3(net.minecraft.client.renderer.texture.ITextureObject a0) throws Throwable;
private static native void __call3061701_4(moom.qZ a0, java.lang.String a1, java.util.concurrent.Callable a2) throws Throwable;

}


public void b(moom.DD p0) {
java.lang.Object local2 = ((net.minecraft.client.renderer.texture.TextureManager)(this)).a(((moom.DD)(p0)));
    if ((local2 != null)) {
        ((java.util.Map)(this.b)).remove(((java.lang.Object)(p0)));
        moom.ol.a__Void(((int)(((net.minecraft.client.renderer.texture.ITextureObject)(local2)).a())));
    }
    return;
}


public void b(moom.oR p0) {
java.util.Iterator life2_9;
    moom.DD life3_16;
    java.lang.String life4_19;
    net.minecraft.client.renderer.texture.ITextureObject life5_38;
    moom.n2 life6_44;
    java.util.Iterator life3_58;
    java.util.Map.Entry life4_65;
    net.minecraft.client.Minecraft life3_77;
    com.moon.runtime.ClientContext life4_86;
    com.moon.jo life5_91;
    forest_join_93: {
    forest_join_82: {
    forest_join_74: {
    forest_join_48: {
    moom.BU.b__Void(((java.lang.String)("*** Reloading textures ***")));
    moom.BU.e(((java.lang.String)(__sourceIntrinsic_7f2d7a5744d2_invokedynamic1072_2(moom.BU.e__String()))));
    life2_9 = ((java.util.Set)(((java.util.Map)(this.b)).keySet())).iterator();
    forest_cycle_10: while (true) {
    forest_join_47: {
    forest_join_45: {
    forest_join_31: {
    if (!(((java.util.Iterator)(life2_9)).hasNext())) {
        break forest_join_48;
    }
    life3_16 = ((moom.DD)(((java.util.Iterator)(life2_9)).next()));
    life4_19 = ((moom.DD)(life3_16)).a();
    if (!((!((java.lang.String)(life4_19)).startsWith(((java.lang.String)("mcpatcher/")))))) {
        break forest_join_31;
    }
    if (!((!((java.lang.String)(life4_19)).startsWith(((java.lang.String)("optifine/")))))) {
        break forest_join_31;
    }
    if (!(moom.JH.a(((moom.DD)(life3_16))))) {
        break forest_join_47;
    }
    }
    life5_38 = ((net.minecraft.client.renderer.texture.ITextureObject)(((java.util.Map)(this.b)).get(((java.lang.Object)(life3_16)))));
    if (!((((life5_38 instanceof moom.n2) ? 1 : 0) != 0))) {
        break forest_join_45;
    }
    life6_44 = ((moom.n2)(life5_38));
    ((moom.n2)(life6_44)).c__Void();
    }
    ((java.util.Iterator)(life2_9)).remove();
    }
    continue forest_cycle_10;
    }
    }
    moom.JH.e();
    life3_58 = ((java.util.HashSet)(new java.util.HashSet(((java.util.Map)(this.b)).entrySet()))).iterator();
    forest_cycle_57: while (true) {
    if (!(((java.util.Iterator)(life3_58)).hasNext())) {
        break forest_join_74;
    }
    life4_65 = ((java.util.Map.Entry)(((java.util.Iterator)(life3_58)).next()));
    ((net.minecraft.client.renderer.texture.TextureManager)(this)).a(((moom.DD)(((moom.DD)(((java.util.Map.Entry)(life4_65)).getKey())))), ((net.minecraft.client.renderer.texture.ITextureObject)(((net.minecraft.client.renderer.texture.ITextureObject)(((java.util.Map.Entry)(life4_65)).getValue())))));
    continue forest_cycle_57;
    }
    }
    life3_77 = net.minecraft.client.Minecraft.a__fM();
    if (!((((net.minecraft.client.Minecraft)(life3_77)).N != null))) {
        break forest_join_82;
    }
    ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.Minecraft)(life3_77)).N)).e();
    }
    life4_86 = com.moon.runtime.ClientContext.getInstance();
    if (!((life4_86 != null))) {
        break forest_join_93;
    }
    life5_91 = ((com.moon.runtime.ClientContext)(life4_86)).a__jo();
    if (!((life5_91 != null))) {
        break forest_join_93;
    }
    ((com.moon.jo)(life5_91)).a();
    }
    return;
}


public static void b(int p0) {
h = ((int)(p0));
    return;
}


public static int b() {
return net.minecraft.client.renderer.texture.TextureManager.h;
}


public void b__Void() {
java.util.Iterator life1_3;
    net.minecraft.client.renderer.texture.ITickable life2_10;
    life1_3 = ((java.util.List)(this.c)).iterator();
    while (((java.util.Iterator)(life1_3)).hasNext()) {
        life2_10 = ((net.minecraft.client.renderer.texture.ITickable)(((java.util.Iterator)(life1_3)).next()));
        ((net.minecraft.client.renderer.texture.ITickable)(life2_10)).b__Void();
    }
    return;
}


public static int c() {
int local0 = net.minecraft.client.renderer.texture.TextureManager.b();
    if ((local0 == 0)) {
        return 6;
    }
    return 0;
}


public net.minecraft.client.renderer.texture.ITextureObject a__ob() {
return this.f;
}


public moom.DD a() {
return this.g;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public net.minecraft.client.renderer.texture.ITextureObject a(moom.DD p0) {
return ((net.minecraft.client.renderer.texture.ITextureObject)(((java.util.Map)(this.b)).get(((java.lang.Object)(p0)))));
}


public boolean a(moom.DD p0, net.minecraft.client.renderer.texture.ITextureObject p1) { return __sourceHandlerCall_6de21a22e98453fc0407(this, p0, p1); }


public boolean a(moom.DD p0, net.minecraft.client.renderer.texture.ITickableTextureObject p1) {
if ((__sourceIntrinsic_booleanComparison(((net.minecraft.client.renderer.texture.TextureManager)(this)).a(((moom.DD)(p0)), ((net.minecraft.client.renderer.texture.ITextureObject)(p1)))) != 0)) {
        ((java.util.List)(this.c)).add(((java.lang.Object)(p1)));
        return ((1) != 0);
    }
    return ((0) != 0);
}


public void a__Void(moom.DD p0) {
net.minecraft.client.renderer.texture.ITextureObject life2_19;
    forest_join_43: {
    forest_join_40: {
    forest_join_35: {
    forest_join_23: {
    forest_join_10: {
    forest_join_5: {
    if (!(moom.BU.ae())) {
        break forest_join_5;
    }
    p0 = moom.JT.a(((moom.DD)(p0)));
    }
    if (!(moom.BU.aC())) {
        break forest_join_10;
    }
    p0 = moom.Ju.a(((moom.DD)(p0)));
    }
    life2_19 = ((net.minecraft.client.renderer.texture.ITextureObject)(((java.util.Map)(this.b)).get(((java.lang.Object)(p0)))));
    if (!(moom.JH.a__Boolean())) {
        break forest_join_23;
    }
    life2_19 = moom.JH.a(((net.minecraft.client.renderer.texture.ITextureObject)(life2_19)), ((java.util.Map)(this.b)));
    }
    if (!((life2_19 == null))) {
        break forest_join_35;
    }
    life2_19 = new moom.n6(p0);
    ((net.minecraft.client.renderer.texture.TextureManager)(this)).a(((moom.DD)(p0)), ((net.minecraft.client.renderer.texture.ITextureObject)(life2_19)));
    }
    if (!(moom.BU.ap())) {
        break forest_join_40;
    }
    moom.MS.a(((net.minecraft.client.renderer.texture.ITextureObject)(life2_19)));
    break forest_join_43;
    }
    moom.ol.b(((int)(((net.minecraft.client.renderer.texture.ITextureObject)(life2_19)).a())));
    }
    this.f = ((net.minecraft.client.renderer.texture.ITextureObject)(life2_19));
    this.g = ((moom.DD)(p0));
    return;
}


public moom.DD a(java.lang.String p0, moom.n3 p1) {
if (((java.lang.String)(p0)).equals(((java.lang.Object)("logo")))) {
        p1 = moom.BU.a(((moom.n3)(p1)));
    }
    java.lang.Integer local3 = ((java.lang.Integer)(((java.util.Map)(this.d)).get(((java.lang.Object)(p0)))));
    if ((local3 == null)) {
        local3 = java.lang.Integer.valueOf(((int)(1)));
    } else {
        local3 = java.lang.Integer.valueOf(((int)((((java.lang.Integer)(local3)).intValue() + 1))));
    }
    ((java.util.Map)(this.d)).put(((java.lang.Object)(p0)), ((java.lang.Object)(local3)));
    moom.DD local4 = new moom.DD(java.lang.String.format(((java.lang.String)("dynamic/%s_%d")), ((java.lang.Object[])(new java.lang.Object[] {p0, local3}))));
    ((net.minecraft.client.renderer.texture.TextureManager)(this)).a(((moom.DD)(local4)), ((net.minecraft.client.renderer.texture.ITextureObject)(p1)));
    return local4;
}


public void a__Void() {
java.util.Iterator local1 = ((java.util.HashSet)(new java.util.HashSet(((java.util.Map)(this.b)).entrySet()))).iterator();
    while (((java.util.Iterator)(local1)).hasNext()) {
        java.util.Map.Entry local2 = ((java.util.Map.Entry)(((java.util.Iterator)(local1)).next()));
        moom.DD local3 = ((moom.DD)(((java.util.Map.Entry)(local2)).getKey()));
        net.minecraft.client.renderer.texture.ITextureObject local4 = ((net.minecraft.client.renderer.texture.ITextureObject)(((java.util.Map.Entry)(local2)).getValue()));
        if ((((local4 instanceof moom.n4) ? 1 : 0) != 0)) {
        ((net.minecraft.client.renderer.texture.TextureManager)(this)).a(((moom.DD)(local3)), ((net.minecraft.client.renderer.texture.ITextureObject)(local4)));
    }
    }
    return;
}


private static java.lang.String lambda$loadTexture$0(net.minecraft.client.renderer.texture.ITextureObject p0) throws java.lang.Exception {
return ((java.lang.Class)(((java.lang.Object)(p0)).getClass())).getName();
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_7f2d7a5744d2_invokedynamic1072_2(java.lang.String a0) throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
