package net.minecraft.client.renderer.block.model;


public class ModelBlock {

private static org.apache.logging.log4j.Logger a;

static com.google.gson.Gson b;

private java.util.List<net.minecraft.client.renderer.block.model.BlockPart> c;

private boolean d;

private boolean e;

private moom.lP f;

public java.lang.String g;

public java.util.Map<java.lang.String, java.lang.String> h;

protected net.minecraft.client.renderer.block.model.ModelBlock i;

public moom.DD j;

private static long k;

private static long l;

private ModelBlock(moom.DD p0, java.util.List<net.minecraft.client.renderer.block.model.BlockPart> p1, java.util.Map<java.lang.String, java.lang.String> p2, boolean p3, boolean p4, moom.lP p5) {
super();
    this.g = "";
    this.c = p1;
    this.e = p3;
    this.d = p4;
    this.h = p2;
    this.j = p0;
    this.f = p5;
}


protected ModelBlock(java.util.List<net.minecraft.client.renderer.block.model.BlockPart> p0, java.util.Map<java.lang.String, java.lang.String> p1, boolean p2, boolean p3, moom.lP p4) {
this(null, p0, p1, p2, p3, p4);
}


protected ModelBlock(moom.DD p0, java.util.Map<java.lang.String, java.lang.String> p1, boolean p2, boolean p3, moom.lP p4) {
this(p0, java.util.Collections.emptyList(), p1, p2, p3, p4);
}


static {
k = ((long)(((moom._a)(moom._c.a(((long)(-5671568440964087799L)), ((long)(-2821398595706458195L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(112856792919574L)))));
    long local0_life6 = (net.minecraft.client.renderer.block.model.ModelBlock.k ^ 58325704391419L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill1175_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1175_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1175_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1175_13 = new byte[8];
    (__sourceSpill1175_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill1175_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation1175_15 = __sourceSpill1175_13;
    ((javax.crypto.Cipher)(__sourceSpill1175_10)).init(((int)(__sourceSpill1175_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1175_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1175_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = 2181215055393542320L;
    byte[] __sourceSpill1175_19 = new byte[8];
    (__sourceSpill1175_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill1175_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill1175_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill1175_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill1175_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill1175_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill1175_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill1175_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill1175_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill1175_20)).doFinal(((byte[])(__sourceSpill1175_19)));
    l = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
    a = ((org.apache.logging.log4j.Logger)(org.apache.logging.log4j.LogManager.getLogger()));
    b = ((com.google.gson.Gson)(((com.google.gson.GsonBuilder)(((com.google.gson.GsonBuilder)(((com.google.gson.GsonBuilder)(((com.google.gson.GsonBuilder)(((com.google.gson.GsonBuilder)(((com.google.gson.GsonBuilder)(((com.google.gson.GsonBuilder)(new com.google.gson.GsonBuilder())).registerTypeAdapter(((java.lang.reflect.Type)(net.minecraft.client.renderer.block.model.ModelBlock.class)), ((java.lang.Object)(new net.minecraft.client.renderer.block.model.ModelBlock$Deserializer()))))).registerTypeAdapter(((java.lang.reflect.Type)(net.minecraft.client.renderer.block.model.BlockPart.class)), ((java.lang.Object)(new net.minecraft.client.renderer.block.model.BlockPart$Deserializer()))))).registerTypeAdapter(((java.lang.reflect.Type)(net.minecraft.client.renderer.block.model.BlockPartFace.class)), ((java.lang.Object)(new net.minecraft.client.renderer.block.model.BlockPartFace$Deserializer()))))).registerTypeAdapter(((java.lang.reflect.Type)(moom.lE.class)), ((java.lang.Object)(new moom.lF()))))).registerTypeAdapter(((java.lang.reflect.Type)(moom.lV.class)), ((java.lang.Object)(new net.minecraft.client.renderer.block.model.ItemTransformVec3f$Deserializer()))))).registerTypeAdapter(((java.lang.reflect.Type)(moom.lP.class)), ((java.lang.Object)(new net.minecraft.client.renderer.block.model.ItemCameraTransforms$Deserializer()))))).create()));
}

private static native <E extends Throwable> void __sourceHandlerCall_c5e785456a82db311959(java.util.Map a0) throws E;
private static final class __SourceHandler_c5e785456a82db311959 {

public static void f1068(java.util.Map p0) throws Throwable {
    java.util.Iterator life1_3;
    net.minecraft.client.renderer.block.model.ModelBlock life2_10;
    net.minecraft.client.renderer.block.model.ModelBlock life3_13;
    net.minecraft.client.renderer.block.model.ModelBlock life4_16;
    forest_join_32: {
    forest_join_28: {
    life1_3 = __call1068_1(__call1068_0(p0));
    if (!(__call1068_2(life1_3))) {
        break forest_join_32;
    }
    life2_10 = __cast1068_4(__call1068_3(life1_3));
    life3_13 = __fieldRead1068_5(life2_10);
    life4_16 = __fieldRead1068_6(life3_13);
    forest_cycle_17: while (true) {
    if (!((life3_13 != life4_16))) {
        break forest_join_28;
    }
    life3_13 = __fieldRead1068_7(life3_13);
    life4_16 = __fieldRead1068_9(__fieldRead1068_8(life4_16));
    continue forest_cycle_17;
    }
    }
    throw new net.minecraft.client.renderer.block.model.ModelBlock$LoopException();
    }
    return;
}
public static void h1068_0(java.lang.NullPointerException p0, java.util.Iterator p1, net.minecraft.client.renderer.block.model.ModelBlock p2, net.minecraft.client.renderer.block.model.ModelBlock p3, net.minecraft.client.renderer.block.model.ModelBlock p4) throws Throwable {
    java.lang.NullPointerException life3_2;
    net.minecraft.client.renderer.block.model.ModelBlock life2_10;
    net.minecraft.client.renderer.block.model.ModelBlock life3_13;
    net.minecraft.client.renderer.block.model.ModelBlock life4_16;
    forest_join_30: {
    forest_join_26: {
    life3_2 = p0;
    if (!(__call3106800_0(p1))) {
        break forest_join_30;
    }
    life2_10 = __cast3106800_2(__call3106800_1(p1));
    life3_13 = __fieldRead3106800_3(life2_10);
    life4_16 = __fieldRead3106800_4(life3_13);
    forest_cycle_15: while (true) {
    if (!((life3_13 != life4_16))) {
        break forest_join_26;
    }
    life3_13 = __fieldRead3106800_5(life3_13);
    life4_16 = __fieldRead3106800_7(__fieldRead3106800_6(life4_16));
    continue forest_cycle_15;
    }
    }
    throw new net.minecraft.client.renderer.block.model.ModelBlock$LoopException();
    }
    return;
}
private static native java.util.Collection __call1068_0(java.util.Map a0) throws Throwable;
private static native java.util.Iterator __call1068_1(java.util.Collection a0) throws Throwable;
private static native boolean __call1068_2(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1068_3(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.client.renderer.block.model.ModelBlock __cast1068_4(java.lang.Object a0) throws Throwable;
private static native net.minecraft.client.renderer.block.model.ModelBlock __fieldRead1068_5(net.minecraft.client.renderer.block.model.ModelBlock a0) throws Throwable;
private static native net.minecraft.client.renderer.block.model.ModelBlock __fieldRead1068_6(net.minecraft.client.renderer.block.model.ModelBlock a0) throws Throwable;
private static native net.minecraft.client.renderer.block.model.ModelBlock __fieldRead1068_7(net.minecraft.client.renderer.block.model.ModelBlock a0) throws Throwable;
private static native net.minecraft.client.renderer.block.model.ModelBlock __fieldRead1068_8(net.minecraft.client.renderer.block.model.ModelBlock a0) throws Throwable;
private static native net.minecraft.client.renderer.block.model.ModelBlock __fieldRead1068_9(net.minecraft.client.renderer.block.model.ModelBlock a0) throws Throwable;
private static native boolean __call3106800_0(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call3106800_1(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.client.renderer.block.model.ModelBlock __cast3106800_2(java.lang.Object a0) throws Throwable;
private static native net.minecraft.client.renderer.block.model.ModelBlock __fieldRead3106800_3(net.minecraft.client.renderer.block.model.ModelBlock a0) throws Throwable;
private static native net.minecraft.client.renderer.block.model.ModelBlock __fieldRead3106800_4(net.minecraft.client.renderer.block.model.ModelBlock a0) throws Throwable;
private static native net.minecraft.client.renderer.block.model.ModelBlock __fieldRead3106800_5(net.minecraft.client.renderer.block.model.ModelBlock a0) throws Throwable;
private static native net.minecraft.client.renderer.block.model.ModelBlock __fieldRead3106800_6(net.minecraft.client.renderer.block.model.ModelBlock a0) throws Throwable;
private static native net.minecraft.client.renderer.block.model.ModelBlock __fieldRead3106800_7(net.minecraft.client.renderer.block.model.ModelBlock a0) throws Throwable;

}


public static void b(java.util.Map<moom.DD, net.minecraft.client.renderer.block.model.ModelBlock> p0) { __sourceHandlerCall_c5e785456a82db311959(p0); }


private boolean b(java.lang.String p0) {
long local2 = (net.minecraft.client.renderer.block.model.ModelBlock.k ^ 19253944761018L);
    return ((((((java.lang.String)(p0)).charAt(((int)(0))) == ((int) net.minecraft.client.renderer.block.model.ModelBlock.l)) ? 1 : 0)) != 0);
}


public boolean b() {
return ((((__sourceIntrinsic_booleanComparison(__sourceExactCall_a2ea87b34dbdf1(((net.minecraft.client.renderer.block.model.ModelBlock)(this)))) != 0) ? __sourceIntrinsic_booleanComparison(__sourceExactCall_bb6818b1ea60cf(((net.minecraft.client.renderer.block.model.ModelBlock)(this.i)))) : ((this.e) ? 1 : 0))) != 0);
}


public boolean c() {
return ((((this.d) ? 1 : 0)) != 0);
}


public boolean d() {
int forwardValue4826_13_0;
    forward_join_13: {
    forward_join_12: {
    forward_join_10: {
    if (!((this.j != null))) {
        break forward_join_10;
    }
    if (!((this.i != null))) {
        break forward_join_12;
    }
    if (!(((net.minecraft.client.renderer.block.model.ModelBlock)(this.i)).d())) {
        break forward_join_12;
    }
    }
    forwardValue4826_13_0 = 1;
    break forward_join_13;
    }
    forwardValue4826_13_0 = 0;
    }
    return ((forwardValue4826_13_0) != 0);
}


public net.minecraft.client.renderer.block.model.ModelBlock a__lX() {
return ((__sourceIntrinsic_booleanComparison(((net.minecraft.client.renderer.block.model.ModelBlock)(this)).a__Boolean()) != 0) ? ((net.minecraft.client.renderer.block.model.ModelBlock)(this.i)).a__lX() : this);
}


public moom.DD a__DD() {
return this.j;
}


private static net.minecraft.client.renderer.block.model.ModelBlock$LoopException a(net.minecraft.client.renderer.block.model.ModelBlock$LoopException p0) {
return p0;
}


public moom.lP a__lP() {
moom.lV local1 = ((net.minecraft.client.renderer.block.model.ModelBlock)(this)).a(((net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType)(net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType.THIRD_PERSON)));
    moom.lV local2 = ((net.minecraft.client.renderer.block.model.ModelBlock)(this)).a(((net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType)(net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType.FIRST_PERSON)));
    moom.lV local3 = ((net.minecraft.client.renderer.block.model.ModelBlock)(this)).a(((net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType)(net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType.HEAD)));
    moom.lV local4 = ((net.minecraft.client.renderer.block.model.ModelBlock)(this)).a(((net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType)(net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType.GUI)));
    moom.lV local5 = ((net.minecraft.client.renderer.block.model.ModelBlock)(this)).a(((net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType)(net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType.GROUND)));
    moom.lV local6 = ((net.minecraft.client.renderer.block.model.ModelBlock)(this)).a(((net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType)(net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType.FIXED)));
    return new moom.lP(local1, local2, local3, local4, local5, local6);
}


private moom.lV a(net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType p0) {
moom.lV forwardValue4825_17_0;
    forward_join_17: {
    forward_join_13: {
    if (!((this.i != null))) {
        break forward_join_13;
    }
    if (!((!((moom.lP)(this.f)).a__Boolean(((net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType)(p0)))))) {
        break forward_join_13;
    }
    forwardValue4825_17_0 = ((net.minecraft.client.renderer.block.model.ModelBlock)(this.i)).a(((net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType)(p0)));
    break forward_join_17;
    }
    forwardValue4825_17_0 = ((moom.lP)(this.f)).a(((net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType)(p0)));
    }
    return forwardValue4825_17_0;
}


private boolean a__Boolean() {
return ((((this.i != null) ? 1 : 0)) != 0);
}


public java.util.List<net.minecraft.client.renderer.block.model.BlockPart> a() {
return ((__sourceIntrinsic_booleanComparison(((net.minecraft.client.renderer.block.model.ModelBlock)(this)).a__Boolean()) != 0) ? ((net.minecraft.client.renderer.block.model.ModelBlock)(this.i)).a() : this.c);
}


public static net.minecraft.client.renderer.block.model.ModelBlock a__lX(java.lang.String p0) {
return __sourceExactCall_900773fe071061(((java.io.Reader)(new java.io.StringReader(p0))));
}


public static net.minecraft.client.renderer.block.model.ModelBlock a(java.io.Reader p0) {
return ((net.minecraft.client.renderer.block.model.ModelBlock)(((com.google.gson.Gson)(net.minecraft.client.renderer.block.model.ModelBlock.b)).fromJson(((java.io.Reader)(p0)), ((java.lang.Class)(net.minecraft.client.renderer.block.model.ModelBlock.class)))));
}


private java.lang.String a(java.lang.String p0, moom.lY p1) {
java.lang.String forwardValue4824_59_0;
    java.lang.String life3_28;
    forward_join_60: {
    forward_join_59: {
    forward_join_58: {
    forward_join_50: {
    forward_join_35: {
    forward_join_16: {
    if (!(((net.minecraft.client.renderer.block.model.ModelBlock)(this)).b(((java.lang.String)(p0))))) {
        break forward_join_60;
    }
    if (!((this == ((moom.lY)(p1)).b))) {
        break forward_join_16;
    }
    ((org.apache.logging.log4j.Logger)(net.minecraft.client.renderer.block.model.ModelBlock.a)).warn(((java.lang.String)(__sourceIntrinsic_3dbc7473ce68_invokedynamic4824_4(p0, this.g))));
    return "missingno";
    }
    life3_28 = ((java.lang.String)(((java.util.Map)(this.h)).get(((java.lang.Object)(((java.lang.String)(p0)).substring(((int)(1))))))));
    if (!((life3_28 == null))) {
        break forward_join_35;
    }
    if (!(((net.minecraft.client.renderer.block.model.ModelBlock)(this)).a__Boolean())) {
        break forward_join_35;
    }
    life3_28 = ((net.minecraft.client.renderer.block.model.ModelBlock)(this.i)).a(((java.lang.String)(p0)), ((moom.lY)(p1)));
    }
    ((moom.lY)(p1)).b = ((net.minecraft.client.renderer.block.model.ModelBlock)(this));
    if (!((life3_28 != null))) {
        break forward_join_50;
    }
    if (!(((net.minecraft.client.renderer.block.model.ModelBlock)(this)).b(((java.lang.String)(life3_28))))) {
        break forward_join_50;
    }
    life3_28 = ((net.minecraft.client.renderer.block.model.ModelBlock)(((moom.lY)(p1)).a)).a(((java.lang.String)(life3_28)), ((moom.lY)(p1)));
    }
    if (!((life3_28 != null))) {
        break forward_join_58;
    }
    if (!((!((net.minecraft.client.renderer.block.model.ModelBlock)(this)).b(((java.lang.String)(life3_28)))))) {
        break forward_join_58;
    }
    forwardValue4824_59_0 = life3_28;
    break forward_join_59;
    }
    forwardValue4824_59_0 = "missingno";
    }
    return forwardValue4824_59_0;
    }
    return p0;
}


public java.lang.String a(java.lang.String p0) {
if ((!((net.minecraft.client.renderer.block.model.ModelBlock)(this)).b(((java.lang.String)(p0))))) {
        p0 = __sourceIntrinsic_c43bc540f167_invokedynamic10734_1(p0);
    }
    return ((net.minecraft.client.renderer.block.model.ModelBlock)(this)).a(((java.lang.String)(p0)), ((moom.lY)(new moom.lY(this))));
}


public boolean a__Boolean(java.lang.String p0) {
return ((((__sourceIntrinsic_booleanComparison(((java.lang.String)("missingno")).equals(((java.lang.Object)(((net.minecraft.client.renderer.block.model.ModelBlock)(this)).a(((java.lang.String)(p0))))))) == 0) ? 1 : 0)) != 0);
}


public void a(java.util.Map<moom.DD, net.minecraft.client.renderer.block.model.ModelBlock> p0) {
if ((this.j != null)) {
        this.i = ((net.minecraft.client.renderer.block.model.ModelBlock)(((net.minecraft.client.renderer.block.model.ModelBlock)(((java.util.Map)(p0)).get(((java.lang.Object)(this.j)))))));
    }
    return;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c43bc540f167_invokedynamic10734_1(java.lang.String a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3dbc7473ce68_invokedynamic4824_4(java.lang.String a0, java.lang.String a1) throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);

private static native net.minecraft.client.renderer.block.model.ModelBlock __sourceExactCall_900773fe071061(java.io.Reader p0);

private static native boolean __sourceExactCall_a2ea87b34dbdf1(net.minecraft.client.renderer.block.model.ModelBlock p0);
private static native boolean __sourceExactCall_bb6818b1ea60cf(net.minecraft.client.renderer.block.model.ModelBlock p0);
}
