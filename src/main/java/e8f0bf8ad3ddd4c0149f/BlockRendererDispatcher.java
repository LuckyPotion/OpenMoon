package net.minecraft.client.renderer;


public class BlockRendererDispatcher implements net.minecraft.client.resources.IResourceManagerReloadListener {

private net.minecraft.client.renderer.BlockModelShapes a;

private net.minecraft.client.settings.GameSettings b;

private moom.kK c;

private net.minecraft.client.renderer.ChestRenderer d;

private net.minecraft.client.renderer.BlockFluidRenderer e;

public BlockRendererDispatcher(net.minecraft.client.renderer.BlockModelShapes p0, net.minecraft.client.settings.GameSettings p1) {
super();
    this.c = new moom.kK();
    this.d = new net.minecraft.client.renderer.ChestRenderer();
    this.e = new net.minecraft.client.renderer.BlockFluidRenderer();
    this.a = p0;
    this.b = p1;
}

private static native <E extends Throwable> boolean __sourceHandlerCall_2a44189ef22c2b15616a(net.minecraft.client.renderer.BlockRendererDispatcher a0, net.minecraft.block.Block a1, int a2) throws E;
private static final class __SourceHandler_2a44189ef22c2b15616a {

public static boolean f2420(net.minecraft.client.renderer.BlockRendererDispatcher receiver, net.minecraft.block.Block p0, int p1) throws Throwable {
    int life3_8;
    if ((p0 == null)) {
        return false;
    }
    life3_8 = __call2420_0(p0);
    return ((life3_8 == 2) ? true : false);
}
public static void h2420_0(moom.Oo p0) throws Throwable {
    throw __call1242000_0(p0);
}
public static void h2420_1(moom.Oo p0) throws Throwable {
    throw __call1242001_0(p0);
}
private static native int __call2420_0(net.minecraft.block.Block a0) throws Throwable;
private static native java.lang.Exception __call1242000_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1242001_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_e77d032fff7f3bf5dda4(net.minecraft.client.renderer.BlockRendererDispatcher a0, net.minecraft.block.state.IBlockState a1, float a2) throws E;
private static final class __SourceHandler_e77d032fff7f3bf5dda4 {

public static void f2421(net.minecraft.client.renderer.BlockRendererDispatcher receiver, net.minecraft.block.state.IBlockState p0, float p1) throws Throwable {
    int life3_3;
    net.minecraft.client.resources.model.IBakedModel life4_25;
    life3_3 = __call2421_1(__call2421_0(p0));
    if ((life3_3 != -1)) {
        switch (life3_3) {
case 1:
default:
{
        break;
    }
case 2:
{
        __call2421_4(__fieldRead2421_2(receiver), __call2421_3(p0), p1);
        break;
    }
case 3:
{
        life4_25 = __call2421_5(receiver, p0, null);
        __call2421_7(__fieldRead2421_6(receiver), life4_25, p0, p1, 1);
        break;
    }
}
    }
    return;
}
public static void h2421_0(moom.Oo p0) throws Throwable {
    throw __call1242100_0(p0);
}
public static void h2421_1(moom.Oo p0) throws Throwable {
    throw __call1242101_0(p0);
}
private static native net.minecraft.block.Block __call2421_0(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native int __call2421_1(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.client.renderer.ChestRenderer __fieldRead2421_2(net.minecraft.client.renderer.BlockRendererDispatcher a0) throws Throwable;
private static native net.minecraft.block.Block __call2421_3(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native void __call2421_4(net.minecraft.client.renderer.ChestRenderer a0, net.minecraft.block.Block a1, float a2) throws Throwable;
private static native net.minecraft.client.resources.model.IBakedModel __call2421_5(net.minecraft.client.renderer.BlockRendererDispatcher a0, net.minecraft.block.state.IBlockState a1, java.lang.Object a2) throws Throwable;
private static native moom.kK __fieldRead2421_6(net.minecraft.client.renderer.BlockRendererDispatcher a0) throws Throwable;
private static native void __call2421_7(moom.kK a0, net.minecraft.client.resources.model.IBakedModel a1, net.minecraft.block.state.IBlockState a2, float a3, int a4) throws Throwable;
private static native java.lang.Exception __call1242100_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1242101_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.client.resources.model.IBakedModel __sourceHandlerCall_1976a18893705e42ee47(net.minecraft.client.renderer.BlockRendererDispatcher a0, net.minecraft.block.state.IBlockState a1, moom.DT a2) throws E;
private static final class __SourceHandler_1976a18893705e42ee47 {

public static net.minecraft.client.resources.model.IBakedModel f2422(net.minecraft.client.renderer.BlockRendererDispatcher receiver, net.minecraft.block.state.IBlockState p0, moom.DT p1) throws Throwable {
    net.minecraft.client.resources.model.IBakedModel life3_4;
    life3_4 = __call2422_1(__fieldRead2422_0(receiver), p0);
    if ((p1 != null)) {
        if (__fieldRead2422_3(__fieldRead2422_2(receiver))) {
        if ((__instanceOf2422_4(life3_4) != 0)) {
        life3_4 = __call2422_7(__cast2422_5(life3_4), __call2422_6(p1));
    }
    }
    }
    return life3_4;
}
public static void h2422_0(moom.Oo p0) throws Throwable {
    throw __call1242200_0(p0);
}
public static void h2422_1(moom.Oo p0) throws Throwable {
    throw __call1242201_0(p0);
}
private static native net.minecraft.client.renderer.BlockModelShapes __fieldRead2422_0(net.minecraft.client.renderer.BlockRendererDispatcher a0) throws Throwable;
private static native net.minecraft.client.resources.model.IBakedModel __call2422_1(net.minecraft.client.renderer.BlockModelShapes a0, net.minecraft.block.state.IBlockState a1) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead2422_2(net.minecraft.client.renderer.BlockRendererDispatcher a0) throws Throwable;
private static native boolean __fieldRead2422_3(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native int __instanceOf2422_4(net.minecraft.client.resources.model.IBakedModel a0) throws Throwable;
private static native moom.pu __cast2422_5(net.minecraft.client.resources.model.IBakedModel a0) throws Throwable;
private static native long __call2422_6(moom.DT a0) throws Throwable;
private static native net.minecraft.client.resources.model.IBakedModel __call2422_7(moom.pu a0, long a1) throws Throwable;
private static native java.lang.Exception __call1242200_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1242201_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_a347b9aedfeeaf71832c(net.minecraft.client.renderer.BlockRendererDispatcher a0, net.minecraft.block.state.IBlockState a1, moom.DT a2, net.minecraft.world.IBlockAccess a3, moom.lw a4) throws E;
private static final class __SourceHandler_a347b9aedfeeaf71832c {

public static boolean f504(net.minecraft.client.renderer.BlockRendererDispatcher receiver, net.minecraft.block.state.IBlockState p0, moom.DT p1, net.minecraft.world.IBlockAccess p2, moom.lw p3) throws Throwable {
    int life5_3;
    net.minecraft.client.resources.model.IBakedModel life6_24;
    life5_3 = __call504_1(__call504_0(p0));
    if ((life5_3 == -1)) {
        return false;
    }
    switch (life5_3) {
case 1:
{
        return __call504_3(__fieldRead504_2(receiver), p2, p0, p1, p3);
    }
case 3:
{
        life6_24 = __call504_4(receiver, p0, p2, p1);
        return __call504_6(__fieldRead504_5(receiver), p2, life6_24, p0, p1, p3);
    }
default:
{
        return false;
    }
}
}
public static boolean h504_0(java.lang.Throwable p0, net.minecraft.block.state.IBlockState p1, moom.DT p2) throws Throwable {
    java.lang.Throwable local3 = p0;
    moom.qY local4 = __call2050400_0(local3, "Tesselating block in world");
    moom.qZ local5 = __call2050400_1(local4, "Block being tesselated");
    __call2050400_5(local5, p2, __call2050400_2(p1), __call2050400_4(__call2050400_3(p1), p1));
    throw new moom.Oo(local4);
}
private static native net.minecraft.block.Block __call504_0(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native int __call504_1(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.client.renderer.BlockFluidRenderer __fieldRead504_2(net.minecraft.client.renderer.BlockRendererDispatcher a0) throws Throwable;
private static native boolean __call504_3(net.minecraft.client.renderer.BlockFluidRenderer a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, moom.lw a4) throws Throwable;
private static native net.minecraft.client.resources.model.IBakedModel __call504_4(net.minecraft.client.renderer.BlockRendererDispatcher a0, net.minecraft.block.state.IBlockState a1, net.minecraft.world.IBlockAccess a2, moom.DT a3) throws Throwable;
private static native moom.kK __fieldRead504_5(net.minecraft.client.renderer.BlockRendererDispatcher a0) throws Throwable;
private static native boolean __call504_6(moom.kK a0, net.minecraft.world.IBlockAccess a1, net.minecraft.client.resources.model.IBakedModel a2, net.minecraft.block.state.IBlockState a3, moom.DT a4, moom.lw a5) throws Throwable;
private static native moom.qY __call2050400_0(java.lang.Throwable a0, java.lang.String a1) throws Throwable;
private static native moom.qZ __call2050400_1(moom.qY a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.block.Block __call2050400_2(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native net.minecraft.block.Block __call2050400_3(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native int __call2050400_4(net.minecraft.block.Block a0, net.minecraft.block.state.IBlockState a1) throws Throwable;
private static native void __call2050400_5(moom.qZ a0, moom.DT a1, net.minecraft.block.Block a2, int a3) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.client.resources.model.IBakedModel __sourceHandlerCall_850ab63ea4b9fd4697b4(net.minecraft.client.renderer.BlockRendererDispatcher a0, net.minecraft.block.state.IBlockState a1, net.minecraft.world.IBlockAccess a2, moom.DT a3) throws E;
private static final class __SourceHandler_850ab63ea4b9fd4697b4 {

public static net.minecraft.client.resources.model.IBakedModel f578(net.minecraft.client.renderer.BlockRendererDispatcher receiver, net.minecraft.block.state.IBlockState p0, net.minecraft.world.IBlockAccess p1, moom.DT p2) throws Throwable {
    net.minecraft.block.Block life4_2;
    net.minecraft.client.resources.model.IBakedModel life5_19;
    life4_2 = __call578_0(p0);
    if ((__call578_1(p1) != __fieldRead578_2())) {
        p0 = __call578_3(life4_2, p0, p1, p2);
    } else {
        
    }
    life5_19 = __call578_5(__fieldRead578_4(receiver), p0);
    if ((p2 != null)) {
        if (__fieldRead578_7(__fieldRead578_6(receiver))) {
        if ((__instanceOf578_8(life5_19) != 0)) {
        life5_19 = __call578_11(__cast578_9(life5_19), __call578_10(p2));
    } else {
        
    }
    } else {
        
    }
    } else {
        
    }
    return life5_19;
}
public static net.minecraft.client.resources.model.IBakedModel h578_0(java.lang.Exception p0, net.minecraft.client.renderer.BlockRendererDispatcher p1, net.minecraft.block.state.IBlockState p2, moom.DT p3, net.minecraft.client.resources.model.IBakedModel p4) throws Throwable {
    java.lang.Exception life4_2;
    net.minecraft.client.resources.model.IBakedModel life4_7;
    life4_2 = p0;
    life4_7 = __call3057800_1(__fieldRead3057800_0(p1), p2);
    if ((p3 != null)) {
        if (__fieldRead3057800_3(__fieldRead3057800_2(p1))) {
        if ((__instanceOf3057800_4(life4_7) != 0)) {
        life4_7 = __call3057800_7(__cast3057800_5(life4_7), __call3057800_6(p3));
    } else {
        
    }
    } else {
        
    }
    } else {
        
    }
    return life4_7;
}
public static net.minecraft.client.resources.model.IBakedModel h578_1(java.lang.Exception p0) throws Throwable {
    throw __call3057801_0(p0);
}
public static net.minecraft.client.resources.model.IBakedModel h578_2(java.lang.Exception p0) throws Throwable {
    throw __call3057802_0(p0);
}
private static native net.minecraft.block.Block __call578_0(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native net.minecraft.world.WorldType __call578_1(net.minecraft.world.IBlockAccess a0) throws Throwable;
private static native net.minecraft.world.WorldType __fieldRead578_2() throws Throwable;
private static native net.minecraft.block.state.IBlockState __call578_3(net.minecraft.block.Block a0, net.minecraft.block.state.IBlockState a1, net.minecraft.world.IBlockAccess a2, moom.DT a3) throws Throwable;
private static native net.minecraft.client.renderer.BlockModelShapes __fieldRead578_4(net.minecraft.client.renderer.BlockRendererDispatcher a0) throws Throwable;
private static native net.minecraft.client.resources.model.IBakedModel __call578_5(net.minecraft.client.renderer.BlockModelShapes a0, net.minecraft.block.state.IBlockState a1) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead578_6(net.minecraft.client.renderer.BlockRendererDispatcher a0) throws Throwable;
private static native boolean __fieldRead578_7(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native int __instanceOf578_8(net.minecraft.client.resources.model.IBakedModel a0) throws Throwable;
private static native moom.pu __cast578_9(net.minecraft.client.resources.model.IBakedModel a0) throws Throwable;
private static native long __call578_10(moom.DT a0) throws Throwable;
private static native net.minecraft.client.resources.model.IBakedModel __call578_11(moom.pu a0, long a1) throws Throwable;
private static native net.minecraft.client.renderer.BlockModelShapes __fieldRead3057800_0(net.minecraft.client.renderer.BlockRendererDispatcher a0) throws Throwable;
private static native net.minecraft.client.resources.model.IBakedModel __call3057800_1(net.minecraft.client.renderer.BlockModelShapes a0, net.minecraft.block.state.IBlockState a1) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead3057800_2(net.minecraft.client.renderer.BlockRendererDispatcher a0) throws Throwable;
private static native boolean __fieldRead3057800_3(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native int __instanceOf3057800_4(net.minecraft.client.resources.model.IBakedModel a0) throws Throwable;
private static native moom.pu __cast3057800_5(net.minecraft.client.resources.model.IBakedModel a0) throws Throwable;
private static native long __call3057800_6(moom.DT a0) throws Throwable;
private static native net.minecraft.client.resources.model.IBakedModel __call3057800_7(moom.pu a0, long a1) throws Throwable;
private static native java.lang.Exception __call3057801_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3057802_0(java.lang.Exception a0) throws Throwable;

}


public void b(moom.oR p0) {
((net.minecraft.client.renderer.BlockFluidRenderer)(this.e)).a();
    return;
}


public net.minecraft.client.resources.model.IBakedModel a(net.minecraft.block.state.IBlockState p0, net.minecraft.world.IBlockAccess p1, moom.DT p2) { return __sourceHandlerCall_850ab63ea4b9fd4697b4(this, p0, p1, p2); }


public void a(net.minecraft.block.state.IBlockState p0, float p1) { __sourceHandlerCall_e77d032fff7f3bf5dda4(this, p0, p1); }


public boolean a(net.minecraft.block.Block p0, int p1) { return __sourceHandlerCall_2a44189ef22c2b15616a(this, p0, p1); }


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public net.minecraft.client.renderer.BlockModelShapes a__kN() {
return this.a;
}


public void a(net.minecraft.block.state.IBlockState p0, moom.DT p1, net.minecraft.client.renderer.texture.TextureAtlasSprite p2, net.minecraft.world.IBlockAccess p3) {
net.minecraft.block.Block life5_2;
    int life6_5;
    net.minecraft.block.state.IBlockState life1_14;
    net.minecraft.client.resources.model.IBakedModel life7_19;
    net.minecraft.client.resources.model.IBakedModel life8_26;
    life5_2 = ((net.minecraft.block.state.IBlockState)(p0)).a__ch();
    life6_5 = ((net.minecraft.block.Block)(life5_2)).c__Int();
    if ((life6_5 == 3)) {
        life1_14 = ((net.minecraft.block.Block)(life5_2)).a(((net.minecraft.block.state.IBlockState)(p0)), ((net.minecraft.world.IBlockAccess)(p3)), ((moom.DT)(p1)));
        life7_19 = ((net.minecraft.client.renderer.BlockModelShapes)(this.a)).a__pp(((net.minecraft.block.state.IBlockState)(life1_14)));
        life8_26 = ((net.minecraft.client.resources.model.SimpleBakedModel$Builder)(new net.minecraft.client.resources.model.SimpleBakedModel$Builder(life7_19, p2))).a();
        ((moom.kK)(this.c)).a(((net.minecraft.world.IBlockAccess)(p3)), ((net.minecraft.client.resources.model.IBakedModel)(life8_26)), ((net.minecraft.block.state.IBlockState)(life1_14)), ((moom.DT)(p1)), ((moom.lw)(((net.minecraft.client.renderer.Tessellator)(net.minecraft.client.renderer.Tessellator.a())).a__lw())));
    }
    return;
}


public boolean a(net.minecraft.block.state.IBlockState p0, moom.DT p1, net.minecraft.world.IBlockAccess p2, moom.lw p3) { return __sourceHandlerCall_a347b9aedfeeaf71832c(this, p0, p1, p2, p3); }


public moom.kK a() {
return this.c;
}


private net.minecraft.client.resources.model.IBakedModel a(net.minecraft.block.state.IBlockState p0, moom.DT p1) { return __sourceHandlerCall_1976a18893705e42ee47(this, p0, p1); }

}
