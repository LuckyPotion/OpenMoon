package net.minecraft.client.resources;


public class ResourcePackRepository$Entry {

private java.io.File a;

private net.minecraft.client.resources.IResourcePack b;

private net.minecraft.client.resources.data.PackMetadataSection c;

private java.awt.image.BufferedImage d;

private moom.DD e;

net.minecraft.client.resources.ResourcePackRepository f;

private static long g;

private ResourcePackRepository$Entry(net.minecraft.client.resources.ResourcePackRepository p0, java.io.File p1) { super(); }

private static void __sourceConstructorBody_33d0c5177aa9572c(net.minecraft.client.resources.ResourcePackRepository$Entry receiver, net.minecraft.client.resources.ResourcePackRepository p0, java.io.File p1) throws Throwable {
((net.minecraft.client.resources.ResourcePackRepository$Entry)(receiver)).f = ((net.minecraft.client.resources.ResourcePackRepository)(p0));
    net.minecraft.client.resources.ResourcePackRepository$Entry.__sourceConstructorInit_33d0c5177aa9572c_0(((net.minecraft.client.resources.ResourcePackRepository$Entry)(receiver)));
    ((net.minecraft.client.resources.ResourcePackRepository$Entry)(receiver)).a = ((java.io.File)(p1));
    return;
}


static {
net.minecraft.client.resources.ResourcePackRepository$Entry.g = (moom._c.a(4485219395767968740L, -262357991562781507L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(81684883448584L);
}

private static native <E extends Throwable> void __sourceConstructorInit_33d0c5177aa9572c_0(net.minecraft.client.resources.ResourcePackRepository$Entry a0) throws E;
private static native <E extends Throwable> void __sourceHandlerCall_c41e0881ed07cfc82873(net.minecraft.client.resources.ResourcePackRepository$Entry a0, net.minecraft.client.renderer.texture.TextureManager a1) throws E;
private static final class __SourceHandler_c41e0881ed07cfc82873 {

public static void f624(net.minecraft.client.resources.ResourcePackRepository$Entry receiver, net.minecraft.client.renderer.texture.TextureManager p0) throws Throwable {
    net.minecraft.client.resources.ResourcePackRepository$Entry forwardValue624_12_0;
    net.minecraft.client.resources.ResourcePackRepository$Entry spill624_0;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_26: {
    forward_join_22: {
    forward_join_12: {
    life2_3 = (__fieldRead624_0() ^ 81160190163998L);
    life4_5 = __call624_1();
    spill624_0 = receiver;
    if (!((life4_5 != null))) {
        forwardValue624_12_0 = spill624_0;
        break forward_join_12;
    }
    if (!((__fieldRead624_2(spill624_0) == null))) {
        break forward_join_22;
    }
    forwardValue624_12_0 = receiver;
    }
    __fieldWrite624_5(forwardValue624_12_0, __call624_4(p0, "texturepackicon", new moom.n3(__fieldRead624_3(receiver))));
    break forward_join_26;
    }
    __call624_7(p0, __fieldRead624_6(receiver));
    }
    return;
}
public static void h624_0(java.lang.Exception p0) throws Throwable {
    throw __call3062400_0(p0);
}
public static void h624_1(java.lang.Exception p0, net.minecraft.client.resources.ResourcePackRepository$Entry p1, net.minecraft.client.renderer.texture.TextureManager p2, java.lang.String[] p3) throws Throwable {
    java.lang.Exception life4_2;
    life4_2 = p0;
    if ((p3 == null)) {
        __call3062401_1(p2, __fieldRead3062401_0(p1));
    } else {
        
    }
    return;
}
public static void h624_2(java.lang.Exception p0) throws Throwable {
    throw __call3062402_0(p0);
}
private static native long __fieldRead624_0() throws Throwable;
private static native java.lang.String[] __call624_1() throws Throwable;
private static native moom.DD __fieldRead624_2(net.minecraft.client.resources.ResourcePackRepository$Entry a0) throws Throwable;
private static native java.awt.image.BufferedImage __fieldRead624_3(net.minecraft.client.resources.ResourcePackRepository$Entry a0) throws Throwable;
private static native moom.DD __call624_4(net.minecraft.client.renderer.texture.TextureManager a0, java.lang.String a1, moom.n3 a2) throws Throwable;
private static native void __fieldWrite624_5(net.minecraft.client.resources.ResourcePackRepository$Entry a0, moom.DD a1) throws Throwable;
private static native moom.DD __fieldRead624_6(net.minecraft.client.resources.ResourcePackRepository$Entry a0) throws Throwable;
private static native void __call624_7(net.minecraft.client.renderer.texture.TextureManager a0, moom.DD a1) throws Throwable;
private static native java.lang.Exception __call3062400_0(java.lang.Exception a0) throws Throwable;
private static native moom.DD __fieldRead3062401_0(net.minecraft.client.resources.ResourcePackRepository$Entry a0) throws Throwable;
private static native void __call3062401_1(net.minecraft.client.renderer.texture.TextureManager a0, moom.DD a1) throws Throwable;
private static native java.lang.Exception __call3062402_0(java.lang.Exception a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_c7a2e444e43c60e8520a(net.minecraft.client.resources.ResourcePackRepository$Entry a0) throws E;
private static final class __SourceHandler_c7a2e444e43c60e8520a {

public static void f625(net.minecraft.client.resources.ResourcePackRepository$Entry receiver) throws Throwable {
    net.minecraft.client.resources.ResourcePackRepository$Entry forwardValue625_17_0;
    net.minecraft.client.resources.ResourcePackRepository$Entry forwardValue625_22_0;
    net.minecraft.client.resources.AbstractResourcePack forwardValue625_22_1;
    net.minecraft.client.resources.ResourcePackRepository$Entry forwardValue625_50_0;
    net.minecraft.client.resources.ResourcePackRepository$Entry spill625_0;
    net.minecraft.client.resources.ResourcePackRepository$Entry spill625_1;
    long life1_3;
    java.lang.String[] life3_5;
    forward_join_50: {
    forward_join_49: {
    forward_join_22: {
    forward_join_17: {
    life1_3 = (__fieldRead625_0() ^ 118401749038640L);
    life3_5 = __call625_1();
    spill625_0 = receiver;
    if (!(__call625_3(__fieldRead625_2(receiver)))) {
        forwardValue625_17_0 = spill625_0;
        break forward_join_17;
    }
    forwardValue625_22_0 = spill625_0;
    forwardValue625_22_1 = new moom.oI(__fieldRead625_4(receiver));
    break forward_join_22;
    }
    forwardValue625_22_0 = forwardValue625_17_0;
    forwardValue625_22_1 = new moom.oH(__fieldRead625_5(receiver));
    }
    __fieldWrite625_6(forwardValue625_22_0, forwardValue625_22_1);
    __fieldWrite625_12(receiver, __cast625_11(__call625_10(__fieldRead625_7(receiver), __fieldRead625_9(__fieldRead625_8(receiver)), "pack")));
    __fieldWrite625_15(receiver, __call625_14(__fieldRead625_13(receiver)));
    spill625_1 = receiver;
    if (!((life3_5 != null))) {
        forwardValue625_50_0 = spill625_1;
        break forward_join_50;
    }
    if (!((__fieldRead625_16(spill625_1) == null))) {
        break forward_join_49;
    }
    __fieldWrite625_20(receiver, __call625_19(__fieldRead625_18(__fieldRead625_17(receiver))));
    }
    forwardValue625_50_0 = receiver;
    }
    __call625_21(forwardValue625_50_0);
    return;
}
public static void h625_0(java.io.IOException p0) throws Throwable {
    throw __call3062500_0(p0);
}
public static void h625_1(java.io.IOException p0, net.minecraft.client.resources.ResourcePackRepository$Entry p1, java.lang.String[] p2) throws Throwable {
    net.minecraft.client.resources.ResourcePackRepository$Entry spill3062501_0;
    net.minecraft.client.resources.ResourcePackRepository$Entry joinValue3062501_1_0;
    java.io.IOException life3_2;
    life3_2 = p0;
    spill3062501_0 = p1;
    if ((p2 != null)) {
        if ((__fieldRead3062501_0(spill3062501_0) == null)) {
        __fieldWrite3062501_4(p1, __call3062501_3(__fieldRead3062501_2(__fieldRead3062501_1(p1))));
    } else {
        
    }
        joinValue3062501_1_0 = p1;
    } else {
        joinValue3062501_1_0 = spill3062501_0;
    }
    __call3062501_5(joinValue3062501_1_0);
    return;
}
public static void h625_2(java.io.IOException p0) throws Throwable {
    throw __call3062502_0(p0);
}
public static void h625_3(java.io.IOException p0) throws Throwable {
    throw __call3062503_0(p0);
}
private static native long __fieldRead625_0() throws Throwable;
private static native java.lang.String[] __call625_1() throws Throwable;
private static native java.io.File __fieldRead625_2(net.minecraft.client.resources.ResourcePackRepository$Entry a0) throws Throwable;
private static native boolean __call625_3(java.io.File a0) throws Throwable;
private static native java.io.File __fieldRead625_4(net.minecraft.client.resources.ResourcePackRepository$Entry a0) throws Throwable;
private static native java.io.File __fieldRead625_5(net.minecraft.client.resources.ResourcePackRepository$Entry a0) throws Throwable;
private static native void __fieldWrite625_6(net.minecraft.client.resources.ResourcePackRepository$Entry a0, net.minecraft.client.resources.AbstractResourcePack a1) throws Throwable;
private static native net.minecraft.client.resources.IResourcePack __fieldRead625_7(net.minecraft.client.resources.ResourcePackRepository$Entry a0) throws Throwable;
private static native net.minecraft.client.resources.ResourcePackRepository __fieldRead625_8(net.minecraft.client.resources.ResourcePackRepository$Entry a0) throws Throwable;
private static native net.minecraft.client.resources.data.IMetadataSerializer __fieldRead625_9(net.minecraft.client.resources.ResourcePackRepository a0) throws Throwable;
private static native net.minecraft.client.resources.data.IMetadataSection __call625_10(net.minecraft.client.resources.IResourcePack a0, net.minecraft.client.resources.data.IMetadataSerializer a1, java.lang.String a2) throws Throwable;
private static native net.minecraft.client.resources.data.PackMetadataSection __cast625_11(net.minecraft.client.resources.data.IMetadataSection a0) throws Throwable;
private static native void __fieldWrite625_12(net.minecraft.client.resources.ResourcePackRepository$Entry a0, net.minecraft.client.resources.data.PackMetadataSection a1) throws Throwable;
private static native net.minecraft.client.resources.IResourcePack __fieldRead625_13(net.minecraft.client.resources.ResourcePackRepository$Entry a0) throws Throwable;
private static native java.awt.image.BufferedImage __call625_14(net.minecraft.client.resources.IResourcePack a0) throws Throwable;
private static native void __fieldWrite625_15(net.minecraft.client.resources.ResourcePackRepository$Entry a0, java.awt.image.BufferedImage a1) throws Throwable;
private static native java.awt.image.BufferedImage __fieldRead625_16(net.minecraft.client.resources.ResourcePackRepository$Entry a0) throws Throwable;
private static native net.minecraft.client.resources.ResourcePackRepository __fieldRead625_17(net.minecraft.client.resources.ResourcePackRepository$Entry a0) throws Throwable;
private static native net.minecraft.client.resources.IResourcePack __fieldRead625_18(net.minecraft.client.resources.ResourcePackRepository a0) throws Throwable;
private static native java.awt.image.BufferedImage __call625_19(net.minecraft.client.resources.IResourcePack a0) throws Throwable;
private static native void __fieldWrite625_20(net.minecraft.client.resources.ResourcePackRepository$Entry a0, java.awt.image.BufferedImage a1) throws Throwable;
private static native void __call625_21(net.minecraft.client.resources.ResourcePackRepository$Entry a0) throws Throwable;
private static native java.lang.Exception __call3062500_0(java.io.IOException a0) throws Throwable;
private static native java.awt.image.BufferedImage __fieldRead3062501_0(net.minecraft.client.resources.ResourcePackRepository$Entry a0) throws Throwable;
private static native net.minecraft.client.resources.ResourcePackRepository __fieldRead3062501_1(net.minecraft.client.resources.ResourcePackRepository$Entry a0) throws Throwable;
private static native net.minecraft.client.resources.IResourcePack __fieldRead3062501_2(net.minecraft.client.resources.ResourcePackRepository a0) throws Throwable;
private static native java.awt.image.BufferedImage __call3062501_3(net.minecraft.client.resources.IResourcePack a0) throws Throwable;
private static native void __fieldWrite3062501_4(net.minecraft.client.resources.ResourcePackRepository$Entry a0, java.awt.image.BufferedImage a1) throws Throwable;
private static native void __call3062501_5(net.minecraft.client.resources.ResourcePackRepository$Entry a0) throws Throwable;
private static native java.lang.Exception __call3062502_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3062503_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_b9cabdfb0eaef5ae6693(net.minecraft.client.resources.ResourcePackRepository$Entry a0) throws E;
private static final class __SourceHandler_b9cabdfb0eaef5ae6693 {

public static java.lang.String f1429(net.minecraft.client.resources.ResourcePackRepository$Entry receiver) throws Throwable {
    net.minecraft.client.resources.data.PackMetadataSection forwardValue1429_16_0;
    java.lang.String forwardValue1429_18_0;
    net.minecraft.client.resources.data.PackMetadataSection spill1429_0;
    long life1_3;
    java.lang.String[] life3_5;
    forward_join_18: {
    forward_join_16: {
    forward_join_14: {
    life1_3 = (__fieldRead1429_0() ^ 73246533987499L);
    life3_5 = __call1429_1();
    spill1429_0 = __fieldRead1429_2(receiver);
    if (!((life3_5 != null))) {
        forwardValue1429_16_0 = spill1429_0;
        break forward_join_16;
    }
    if (!((spill1429_0 == null))) {
        break forward_join_14;
    }
    forwardValue1429_18_0 = __invokedynamic1429_4(__fieldRead1429_3());
    break forward_join_18;
    }
    forwardValue1429_16_0 = __fieldRead1429_5(receiver);
    }
    forwardValue1429_18_0 = __call1429_7(__call1429_6(forwardValue1429_16_0));
    }
    return forwardValue1429_18_0;
}
public static void h1429_0(moom.Oo p0) throws Throwable {
    throw __call1142900_0(p0);
}
public static void h1429_1(moom.Oo p0) throws Throwable {
    throw __call1142901_0(p0);
}
private static native long __fieldRead1429_0() throws Throwable;
private static native java.lang.String[] __call1429_1() throws Throwable;
private static native net.minecraft.client.resources.data.PackMetadataSection __fieldRead1429_2(net.minecraft.client.resources.ResourcePackRepository$Entry a0) throws Throwable;
private static native net.minecraft.util.EnumChatFormatting __fieldRead1429_3() throws Throwable;
private static native java.lang.String __invokedynamic1429_4(net.minecraft.util.EnumChatFormatting a0) throws Throwable;
private static native net.minecraft.client.resources.data.PackMetadataSection __fieldRead1429_5(net.minecraft.client.resources.ResourcePackRepository$Entry a0) throws Throwable;
private static native net.minecraft.util.IChatComponent __call1429_6(net.minecraft.client.resources.data.PackMetadataSection a0) throws Throwable;
private static native java.lang.String __call1429_7(net.minecraft.util.IChatComponent a0) throws Throwable;
private static native java.lang.Exception __call1142900_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1142901_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_591905d790de3f7cf852(net.minecraft.client.resources.ResourcePackRepository$Entry a0) throws E;
private static final class __SourceHandler_591905d790de3f7cf852 {

public static void f1430(net.minecraft.client.resources.ResourcePackRepository$Entry receiver) throws Throwable {
    net.minecraft.client.resources.IResourcePack forwardValue1430_14_0;
    net.minecraft.client.resources.IResourcePack spill1430_0;
    long life1_3;
    java.lang.String[] life3_5;
    forward_join_16: {
    forward_join_14: {
    life1_3 = (__fieldRead1430_0() ^ 45647672553260L);
    life3_5 = __call1430_1();
    spill1430_0 = __fieldRead1430_2(receiver);
    if (!((life3_5 != null))) {
        forwardValue1430_14_0 = spill1430_0;
        break forward_join_14;
    }
    if (!((__instanceOf1430_3(spill1430_0) != 0))) {
        break forward_join_16;
    }
    forwardValue1430_14_0 = __fieldRead1430_4(receiver);
    }
    __call1430_6(__cast1430_5(forwardValue1430_14_0));
    }
    return;
}
public static void h1430_0(moom.Oo p0) throws Throwable {
    throw __call1143000_0(p0);
}
public static void h1430_1(moom.Oo p0) throws Throwable {
    throw __call1143001_0(p0);
}
private static native long __fieldRead1430_0() throws Throwable;
private static native java.lang.String[] __call1430_1() throws Throwable;
private static native net.minecraft.client.resources.IResourcePack __fieldRead1430_2(net.minecraft.client.resources.ResourcePackRepository$Entry a0) throws Throwable;
private static native int __instanceOf1430_3(net.minecraft.client.resources.IResourcePack a0) throws Throwable;
private static native net.minecraft.client.resources.IResourcePack __fieldRead1430_4(net.minecraft.client.resources.ResourcePackRepository$Entry a0) throws Throwable;
private static native java.io.Closeable __cast1430_5(net.minecraft.client.resources.IResourcePack a0) throws Throwable;
private static native void __call1430_6(java.io.Closeable a0) throws Throwable;
private static native java.lang.Exception __call1143000_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1143001_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_6fde948aafd5d0a8f4f7(net.minecraft.client.resources.ResourcePackRepository$Entry a0, java.lang.Object a1) throws E;
private static final class __SourceHandler_6fde948aafd5d0a8f4f7 {

public static boolean f1431(net.minecraft.client.resources.ResourcePackRepository$Entry receiver, java.lang.Object p0) throws Throwable {
    java.lang.Object forwardValue1431_12_0;
    int forwardValue1431_21_0;
    int forwardValue1431_25_0;
    int forwardValue1431_27_0;
    net.minecraft.client.resources.ResourcePackRepository$Entry spill1431_0;
    int spill1431_1;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_27: {
    forward_join_26: {
    forward_join_25: {
    forward_join_24: {
    forward_join_21: {
    forward_join_12: {
    life2_3 = (__fieldRead1431_0() ^ 134499217882663L);
    life4_5 = __call1431_1();
    spill1431_0 = receiver;
    if (!((life4_5 != null))) {
        forwardValue1431_12_0 = spill1431_0;
        break forward_join_12;
    }
    if (!((spill1431_0 != p0))) {
        break forward_join_24;
    }
    forwardValue1431_12_0 = p0;
    }
    spill1431_1 = __instanceOf1431_2(forwardValue1431_12_0);
    if (!((life4_5 != null))) {
        forwardValue1431_21_0 = spill1431_1;
        break forward_join_21;
    }
    if (!((spill1431_1 != 0))) {
        break forward_join_26;
    }
    forwardValue1431_21_0 = __integerCategory1431_6(__call1431_5(__call1431_3(receiver), __call1431_4(p0)));
    }
    if (!((life4_5 != null))) {
        forwardValue1431_25_0 = forwardValue1431_21_0;
        break forward_join_25;
    }
    if (!((forwardValue1431_21_0 != 0))) {
        break forward_join_26;
    }
    }
    forwardValue1431_25_0 = 1;
    }
    forwardValue1431_27_0 = forwardValue1431_25_0;
    break forward_join_27;
    }
    forwardValue1431_27_0 = 0;
    }
    return __integerCategory1431_7(forwardValue1431_27_0);
}
public static void h1431_0(moom.Oo p0) throws Throwable {
    throw __call1143100_0(p0);
}
public static void h1431_1(moom.Oo p0) throws Throwable {
    throw __call1143101_0(p0);
}
public static void h1431_2(moom.Oo p0) throws Throwable {
    throw __call1143102_0(p0);
}
public static void h1431_3(moom.Oo p0) throws Throwable {
    throw __call1143103_0(p0);
}
public static void h1431_4(moom.Oo p0) throws Throwable {
    throw __call1143104_0(p0);
}
private static native long __fieldRead1431_0() throws Throwable;
private static native java.lang.String[] __call1431_1() throws Throwable;
private static native int __instanceOf1431_2(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call1431_3(net.minecraft.client.resources.ResourcePackRepository$Entry a0) throws Throwable;
private static native java.lang.String __call1431_4(java.lang.Object a0) throws Throwable;
private static native boolean __call1431_5(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1431_6(boolean value) throws Throwable;
private static native boolean __integerCategory1431_7(int value) throws Throwable;
private static native java.lang.Exception __call1143100_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1143101_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1143102_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1143103_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1143104_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_57bbd7a3383b1ee2a095(net.minecraft.client.resources.ResourcePackRepository$Entry a0) throws E;
private static final class __SourceHandler_57bbd7a3383b1ee2a095 {

public static java.lang.String f234(net.minecraft.client.resources.ResourcePackRepository$Entry receiver) throws Throwable {
    java.lang.String forwardValue234_24_0;
    java.lang.Object[] forwardValue234_24_1;
    java.lang.Object[] forwardValue234_24_2;
    int forwardValue234_24_3;
    java.lang.String forwardValue234_24_4;
    java.lang.String forwardValue234_25_0;
    java.lang.Object[] forwardValue234_25_1;
    java.lang.Object[] forwardValue234_25_2;
    int forwardValue234_25_3;
    java.lang.String forwardValue234_26_0;
    java.lang.Object[] forwardValue234_26_1;
    java.lang.Object[] forwardValue234_26_2;
    int forwardValue234_26_3;
    java.lang.String forwardValue234_26_4;
    java.lang.String spill234_0;
    java.lang.Object[] spill234_1;
    java.lang.Object[] spill234_2;
    int spill234_3;
    java.lang.String spill234_4;
    java.lang.Object[] spill234_5;
    java.lang.Object[] spill234_6;
    int spill234_7;
    java.lang.Object[] spill234_8;
    long life1_3;
    java.lang.String[] life3_5;
    forward_join_26: {
    forward_join_25: {
    forward_join_24: {
    life1_3 = (__fieldRead234_0() ^ 46861900660383L);
    life3_5 = __call234_1();
    spill234_0 = "%s:%s:%d";
    java.lang.Object[] __stackOp234_2_0 = new java.lang.Object[3];
    spill234_1 = __stackOp234_2_0;
    spill234_2 = __stackOp234_2_0;
    spill234_3 = 0;
    spill234_4 = __call234_4(__fieldRead234_3(receiver));
    if (!((life3_5 != null))) {
        forwardValue234_24_0 = spill234_0;
        forwardValue234_24_1 = spill234_1;
        forwardValue234_24_2 = spill234_2;
        forwardValue234_24_3 = spill234_3;
        forwardValue234_24_4 = spill234_4;
        break forward_join_24;
    }
    (spill234_2)[spill234_3] = spill234_4;
    java.lang.Object[] __stackOp234_5_0 = spill234_1;
    spill234_5 = __stackOp234_5_0;
    spill234_6 = __stackOp234_5_0;
    spill234_7 = 1;
    if (!(__call234_7(__fieldRead234_6(receiver)))) {
        forwardValue234_25_0 = spill234_0;
        forwardValue234_25_1 = spill234_5;
        forwardValue234_25_2 = spill234_6;
        forwardValue234_25_3 = spill234_7;
        break forward_join_25;
    }
    forwardValue234_24_0 = spill234_0;
    forwardValue234_24_1 = spill234_5;
    forwardValue234_24_2 = spill234_6;
    forwardValue234_24_3 = spill234_7;
    forwardValue234_24_4 = "folder";
    }
    forwardValue234_26_0 = forwardValue234_24_0;
    forwardValue234_26_1 = forwardValue234_24_1;
    forwardValue234_26_2 = forwardValue234_24_2;
    forwardValue234_26_3 = forwardValue234_24_3;
    forwardValue234_26_4 = forwardValue234_24_4;
    break forward_join_26;
    }
    forwardValue234_26_0 = forwardValue234_25_0;
    forwardValue234_26_1 = forwardValue234_25_1;
    forwardValue234_26_2 = forwardValue234_25_2;
    forwardValue234_26_3 = forwardValue234_25_3;
    forwardValue234_26_4 = "zip";
    }
    (forwardValue234_26_2)[forwardValue234_26_3] = forwardValue234_26_4;
    java.lang.Object[] __stackOp234_8_0 = forwardValue234_26_1;
    spill234_8 = __stackOp234_8_0;
    (__stackOp234_8_0)[2] = __call234_11(__call234_10(__fieldRead234_9(receiver)));
    return __call234_12(forwardValue234_26_0, spill234_8);
}
public static void h234_0(moom.Oo p0) throws Throwable {
    throw __call1023400_0(p0);
}
public static void h234_1(moom.Oo p0) throws Throwable {
    throw __call1023401_0(p0);
}
private static native long __fieldRead234_0() throws Throwable;
private static native java.lang.String[] __call234_1() throws Throwable;
private static native java.io.File __fieldRead234_3(net.minecraft.client.resources.ResourcePackRepository$Entry a0) throws Throwable;
private static native java.lang.String __call234_4(java.io.File a0) throws Throwable;
private static native java.io.File __fieldRead234_6(net.minecraft.client.resources.ResourcePackRepository$Entry a0) throws Throwable;
private static native boolean __call234_7(java.io.File a0) throws Throwable;
private static native java.io.File __fieldRead234_9(net.minecraft.client.resources.ResourcePackRepository$Entry a0) throws Throwable;
private static native long __call234_10(java.io.File a0) throws Throwable;
private static native java.lang.Long __call234_11(long a0) throws Throwable;
private static native java.lang.String __call234_12(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native java.lang.Exception __call1023400_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1023401_0(moom.Oo a0) throws Throwable;

}


public boolean equals(java.lang.Object p0) { return __sourceHandlerCall_6fde948aafd5d0a8f4f7(this, p0); }


public java.lang.String toString() { return __sourceHandlerCall_57bbd7a3383b1ee2a095(this); }


public int hashCode() {
return ((java.lang.String)(((net.minecraft.client.resources.ResourcePackRepository$Entry)(this)).toString())).hashCode();
}


public java.lang.String b() { return __sourceHandlerCall_b9cabdfb0eaef5ae6693(this); }


public void b__Void() { __sourceHandlerCall_591905d790de3f7cf852(this); }


public void a(net.minecraft.client.renderer.texture.TextureManager p0) { __sourceHandlerCall_c41e0881ed07cfc82873(this, p0); }


public void a__Void() throws java.io.IOException { __sourceHandlerCall_c7a2e444e43c60e8520a(this); }


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public java.lang.String a__String() {
return ((net.minecraft.client.resources.IResourcePack)(this.b)).a__String();
}


public net.minecraft.client.resources.IResourcePack a__oT() {
return this.b;
}


public int a() {
return ((net.minecraft.client.resources.data.PackMetadataSection)(this.c)).a();
}

}
