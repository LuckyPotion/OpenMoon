package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class HS extends moom.HF {

private boolean f;

private boolean g;

private static long h;

private static long[] i;

private static java.lang.Integer[] j;

private static java.util.Map k;

public HS() {
super();
}


public HS(int p0, java.util.Random p1, moom.G2 p2, moom.bs p3) { super(0); }


private static void __sourceConstructorBody_086143ceb0b97c3e(moom.HS receiver, int p0, java.util.Random p1, moom.G2 p2, moom.bs p3) throws Throwable {

moom.HS __initValue504_28_0;

    int __initValue504_28_1;

    moom.HS __initValue504_29_0;

    moom.HS __initValue504_30_0;

    int __initValue504_30_1;

    moom.HS __initValue504_39_0;

    int __initValue504_39_1;

    moom.HS __initValue504_40_0;

    moom.HS __initValue504_41_0;

    int __initValue504_41_1;

    long local5_life2;

    net.minecraft.entity.Entity[] local7_life7;

    init_join_41: {

    init_join_40: {

    init_join_39: {

    init_join_30: {

    init_join_29: {

    init_join_28: {

    local5_life2 = (moom.HS.h ^ 112563438812770L);

    net.minecraft.entity.Entity[] __sourceSpill504_4 = moom.G4.b();

    moom.HS.__sourceConstructorInit_086143ceb0b97c3e_0(((moom.HS)(receiver)), ((int)(p0)));

    ((moom.HS)(receiver)).b = ((moom.bs)(p3));

    local7_life7 = __sourceSpill504_4;

    ((moom.HS)(receiver)).e = ((moom.bJ)(((moom.HS)(receiver)).a(((java.util.Random)(p1)))));

    ((moom.HS)(receiver)).a = ((moom.G2)(p2));

    moom.HS __sourceSpill504_12 = receiver;

    int __sourceSpill504_13 = ((java.util.Random)(p1)).nextInt(((int)(2)));

    if (!((local7_life7 != null))) {

        __initValue504_28_0 = __sourceSpill504_12;

        __initValue504_28_1 = __sourceSpill504_13;

        break init_join_28;

    }

    if (!((__sourceSpill504_13 == 0))) {

        __initValue504_29_0 = __sourceSpill504_12;

        break init_join_29;

    }

    __initValue504_28_0 = __sourceSpill504_12;

    __initValue504_28_1 = 1;

    }

    __initValue504_30_0 = __initValue504_28_0;

    __initValue504_30_1 = __initValue504_28_1;

    break init_join_30;

    }

    __initValue504_30_0 = __initValue504_29_0;

    __initValue504_30_1 = 0;

    }

    ((moom.HS)(__initValue504_30_0)).f = ((boolean)__sourceIntrinsic_integerToBoolean((__initValue504_30_1)));

    moom.HS __sourceSpill504_16 = receiver;

    int __sourceSpill504_17 = ((java.util.Random)(p1)).nextInt(((int)(2)));

    if (!((local7_life7 != null))) {

        __initValue504_39_0 = __sourceSpill504_16;

        __initValue504_39_1 = __sourceSpill504_17;

        break init_join_39;

    }

    if (!((__sourceSpill504_17 == 0))) {

        __initValue504_40_0 = __sourceSpill504_16;

        break init_join_40;

    }

    __initValue504_39_0 = __sourceSpill504_16;

    __initValue504_39_1 = 1;

    }

    __initValue504_41_0 = __initValue504_39_0;

    __initValue504_41_1 = __initValue504_39_1;

    break init_join_41;

    }

    __initValue504_41_0 = __initValue504_40_0;

    __initValue504_41_1 = 0;

    }

    ((moom.HS)(__initValue504_41_0)).g = ((boolean)__sourceIntrinsic_integerToBoolean((__initValue504_41_1)));

    return;

}



static {
h = ((long)(((moom._a)(moom._c.a(((long)(5408294883445834378L)), ((long)(-4599545270312853671L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(148347483242220L)))));
    k = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.HS.h ^ 132385034474917L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill571_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill571_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill571_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill571_14 = new byte[8];
    (__sourceSpill571_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill571_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation571_16 = __sourceSpill571_14;
    ((javax.crypto.Cipher)(__sourceSpill571_11)).init(((int)(__sourceSpill571_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill571_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation571_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[3];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "\032ÛïÇx\020[ûöò\036·WÛY5Ä;{·"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill571_25 = local6_life21;
        int __sourceSpill571_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill571_25)).substring(((int)(__sourceSpill571_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill571_30 = local8_life19;
        int __sourceSpill571_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill571_33 = new byte[8];
        (__sourceSpill571_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill571_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill571_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill571_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill571_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill571_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill571_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill571_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill571_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill571_34)).doFinal(((byte[])(__sourceSpill571_33)));
        (__sourceSpill571_30)[__sourceSpill571_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    i = ((long[])(local8_life19));
    j = ((java.lang.Integer[])(new java.lang.Integer[3]));
}

private static native <E extends Throwable> void __sourceConstructorInit_086143ceb0b97c3e_0(moom.HS a0, int a1) throws E;

private static moom.Oo b(moom.Oo p0) {
return p0;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4773_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/HS"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x3400;
        if (j[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = i[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])k.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    k.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/HS", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            HS.j[n2] = n3;
        }
        return j[n2];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.HS.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


protected void b(net.minecraft.nbt.NBTTagCompound p0) {
super.b(((net.minecraft.nbt.NBTTagCompound)(p0)));
    this.f = ((boolean)(((net.minecraft.nbt.NBTTagCompound)(p0)).b__Boolean(((java.lang.String)("Left")))));
    this.g = ((boolean)(((net.minecraft.nbt.NBTTagCompound)(p0)).b__Boolean(((java.lang.String)("Right")))));
    return;
}


public boolean a__Boolean(net.minecraft.world.World p0, java.util.Random p1, moom.G2 p2) {
int forwardValue2091_101_0;
    int forwardValue2091_121_0;
    int forwardValue2091_140_0;
    boolean spill2091_0;
    long life4_3;
    net.minecraft.entity.Entity[] life6_5;
    forward_join_140: {
    forward_join_139: {
    forward_join_121: {
    forward_join_119: {
    forward_join_101: {
    forward_join_15: {
    life4_3 = (moom.HS.h ^ 119034468956415L);
    life6_5 = moom.G4.b();
    spill2091_0 = ((moom.HS)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)));
    if (!((life6_5 != null))) {
        forwardValue2091_101_0 = ((spill2091_0) ? 1 : 0);
        break forward_join_101;
    }
    if (!(spill2091_0)) {
        break forward_join_15;
    }
    return ((0) != 0);
    }
    ((moom.HS)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(0)), ((int)(0)), ((int)(4)), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2091_5(26251, (3544548142194078114L ^ life4_3)))), ((boolean)(true)), ((java.util.Random)(p1)), ((moom.H9)(net.minecraft.world.gen.structure.StructureStrongholdPieces.e)));
    ((moom.HS)(this)).a(((net.minecraft.world.World)(p0)), ((java.util.Random)(p1)), ((moom.G2)(p2)), ((moom.bJ)(this.e)), ((int)(1)), ((int)(1)), ((int)(0)));
    ((moom.HS)(this)).a(((net.minecraft.world.World)(p0)), ((java.util.Random)(p1)), ((moom.G2)(p2)), ((moom.bJ)(moom.bJ.OPENING)), ((int)(1)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2091_11(20878, (6525584798541973156L ^ life4_3)))));
    ((moom.HS)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((java.util.Random)(p1)), ((float)(0x1.99999ap-4f)), ((int)(1)), ((int)(2)), ((int)(1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aa)).a__fE())));
    ((moom.HS)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((java.util.Random)(p1)), ((float)(0x1.99999ap-4f)), ((int)(3)), ((int)(2)), ((int)(1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aa)).a__fE())));
    ((moom.HS)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((java.util.Random)(p1)), ((float)(0x1.99999ap-4f)), ((int)(1)), ((int)(2)), ((int)(5)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aa)).a__fE())));
    ((moom.HS)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((java.util.Random)(p1)), ((float)(0x1.99999ap-4f)), ((int)(3)), ((int)(2)), ((int)(5)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aa)).a__fE())));
    forwardValue2091_101_0 = ((this.f) ? 1 : 0);
    }
    if (!((life6_5 != null))) {
        forwardValue2091_121_0 = forwardValue2091_101_0;
        break forward_join_121;
    }
    if (!((forwardValue2091_101_0 != 0))) {
        break forward_join_119;
    }
    ((moom.HS)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(1)), ((int)(2)), ((int)(0)), ((int)(3)), ((int)(4)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((boolean)(false)));
    }
    forwardValue2091_121_0 = ((this.g) ? 1 : 0);
    }
    if (!((life6_5 != null))) {
        forwardValue2091_140_0 = forwardValue2091_121_0;
        break forward_join_140;
    }
    if (!((forwardValue2091_121_0 != 0))) {
        break forward_join_139;
    }
    ((moom.HS)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(4)), ((int)(1)), ((int)(2)), ((int)(4)), ((int)(3)), ((int)(4)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((boolean)(false)));
    }
    forwardValue2091_140_0 = 1;
    }
    return ((forwardValue2091_140_0) != 0);
}


protected void a(net.minecraft.nbt.NBTTagCompound p0) {
super.a(((net.minecraft.nbt.NBTTagCompound)(p0)));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("Left")), ((boolean)__sourceIntrinsic_integerToBoolean((((this.f) ? 1 : 0)))));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("Right")), ((boolean)__sourceIntrinsic_integerToBoolean((((this.g) ? 1 : 0)))));
    return;
}


public static moom.HS a(java.util.List<moom.G4> p0, java.util.Random p1, int p2, int p3, int p4, moom.bs p5, int p6) {
moom.HS forwardValue2089_36_0;
    long life7_3;
    moom.G2 life9_19;
    forward_join_36: {
    forward_join_35: {
    life7_3 = (moom.HS.h ^ 56918085389173L);
    life9_19 = moom.G2.a(((int)(p2)), ((int)(p3)), ((int)(p4)), ((int)(-1)), ((int)(-1)), ((int)(0)), ((int)(5)), ((int)(5)), ((int)(__sourceIntrinsic_1e49acfb953b_invokedynamic2089_1(28539, (3330281465758092250L ^ life7_3)))), ((moom.bs)(p5)));
    if (!(moom.HS.a(((moom.G2)(life9_19))))) {
        break forward_join_35;
    }
    if (!((moom.G4.a(((java.util.List)(p0)), ((moom.G2)(life9_19))) == null))) {
        break forward_join_35;
    }
    forwardValue2089_36_0 = new moom.HS(p6, p1, life9_19, p5);
    break forward_join_36;
    }
    forwardValue2089_36_0 = null;
    }
    return forwardValue2089_36_0;
}


public void a(moom.G4 p0, java.util.List<moom.G4> p1, java.util.Random p2) {
int forwardValue2090_33_0;
    moom.G4 forwardValue2090_42_0;
    net.minecraft.entity.Entity[] spill2090_0;
    boolean spill2090_1;
    moom.HS spill2090_2;
    long life4_3;
    net.minecraft.entity.Entity[] life6_14;
    forward_join_43: {
    forward_join_42: {
    forward_join_33: {
    forward_join_29: {
    life4_3 = (moom.HS.h ^ 32754800144953L);
    spill2090_0 = moom.G4.b();
    ((moom.HS)(this)).a(((moom.HQ)(((moom.HQ)(p0)))), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)(1)), ((int)(1)));
    life6_14 = spill2090_0;
    spill2090_1 = this.f;
    if (!((life6_14 != null))) {
        forwardValue2090_33_0 = ((spill2090_1) ? 1 : 0);
        break forward_join_33;
    }
    if (!(spill2090_1)) {
        break forward_join_29;
    }
    ((moom.HS)(this)).b(((moom.HQ)(((moom.HQ)(p0)))), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)(1)), ((int)(2)));
    }
    spill2090_2 = this;
    if (!((life6_14 != null))) {
        forwardValue2090_42_0 = spill2090_2;
        break forward_join_42;
    }
    forwardValue2090_33_0 = ((((moom.HS)(spill2090_2)).g) ? 1 : 0);
    }
    if (!((forwardValue2090_33_0 != 0))) {
        break forward_join_43;
    }
    forwardValue2090_42_0 = ((moom.HS)(this)).c(((moom.HQ)(((moom.HQ)(p0)))), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)(1)), ((int)(2)));
    }
    recovery.source.CarrierOps.discard(forwardValue2090_42_0);
    }
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_1e49acfb953b_invokedynamic2089_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2091_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2091_11(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4773_0() throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
