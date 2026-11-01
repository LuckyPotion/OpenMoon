package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public abstract class Hs extends moom.G4 {

protected static net.minecraft.block.state.IBlockState e;

protected static net.minecraft.block.state.IBlockState f;

protected static net.minecraft.block.state.IBlockState g;

protected static net.minecraft.block.state.IBlockState h;

protected static net.minecraft.block.state.IBlockState i;

protected static net.minecraft.block.state.IBlockState j;

protected static int k;

protected static int l;

protected static int m;

protected static int n;

protected moom.Il o;

private static long u;

private static long[] w;

private static java.lang.Integer[] x;

private static java.util.Map y;

public Hs(moom.bs p0, moom.G2 p1) {
super(1);
    this.b = p0;
    this.a = p1;
}


public Hs(int p0) {
super(p0);
}


public Hs() {
super(0);
}


protected Hs(int p0, moom.bs p1, moom.Il p2, int p3, int p4, int p5) { super(0); }


private static void __sourceConstructorBody_fd3ca051ae471eca(moom.Hs receiver, int p0, moom.bs p1, moom.Il p2, int p3, int p4, int p5) throws Throwable {

moom.bs __initValue395_43_0;

    moom.bs __initValue395_43_1;

    long local7_life2;

    int local10_life7;

    int local11_life10;

    net.minecraft.entity.Entity[] local9_life11;

    int local12_life12;

    int local13_life15;

    init_join_209: {

    init_join_189: {

    init_join_162: {

    init_join_140: {

    init_join_113: {

    init_join_108: {

    init_join_77: {

    init_join_43: {

    local7_life2 = (moom.Hs.u ^ 132753882961872L);

    moom.Hs.__sourceConstructorInit_fd3ca051ae471eca_0(((moom.Hs)(receiver)), ((int)(p0)));

    ((moom.Hs)(receiver)).b = ((moom.bs)(p1));

    ((moom.Hs)(receiver)).o = ((moom.Il)(p2));

    local10_life7 = ((moom.Il)(p2)).a;

    net.minecraft.entity.Entity[] __sourceSpill395_9 = moom.G4.b();

    local11_life10 = (local10_life7 % 5);

    local9_life11 = __sourceSpill395_9;

    local12_life12 = ((local10_life7 / 5) % 5);

    local13_life15 = (local10_life7 / __sourceIntrinsic_fd3ca051ae471eca_originalDynamicSite395_14(27127, (5092284322837325088L ^ local7_life2)));

    moom.bs __sourceSpill395_17 = p1;

    moom.bs __sourceSpill395_18 = moom.bs.NORTH;

    if (!((local9_life11 != null))) {

        __initValue395_43_0 = __sourceSpill395_17;

        __initValue395_43_1 = __sourceSpill395_18;

        break init_join_43;

    }

    if (!((__sourceSpill395_17 != __sourceSpill395_18))) {

        break init_join_77;

    }

    __initValue395_43_0 = p1;

    __initValue395_43_1 = moom.bs.SOUTH;

    }

    if (!((__initValue395_43_0 != __initValue395_43_1))) {

        break init_join_77;

    }

    ((moom.Hs)(receiver)).a = ((moom.G2)(new moom.G2(0, 0, 0, ((p5 * __sourceIntrinsic_fd3ca051ae471eca_originalDynamicSite395_21(10615, (7791480712137385379L ^ local7_life2))) - 1), ((p4 * 4) - 1), ((p3 * __sourceIntrinsic_fd3ca051ae471eca_originalDynamicSite395_23(10615, (7791480712137385379L ^ local7_life2))) - 1))));

    if (!((local9_life11 == null))) {

        break init_join_108;

    }

    }

    ((moom.Hs)(receiver)).a = ((moom.G2)(new moom.G2(0, 0, 0, ((p3 * __sourceIntrinsic_fd3ca051ae471eca_originalDynamicSite395_26(10615, (7791480712137385379L ^ local7_life2))) - 1), ((p4 * 4) - 1), ((p5 * __sourceIntrinsic_fd3ca051ae471eca_originalDynamicSite395_28(10615, (7791480712137385379L ^ local7_life2))) - 1))));

    }

    switch ((moom.Ih.a)[((moom.bs)(p1)).ordinal()]) {

case 1:

{

        break init_join_113;

    }

case 2:

{

        break init_join_140;

    }

case 3:

{

        break init_join_162;

    }

default:

{

        break init_join_189;

    }

}

    }

    ((moom.G2)(((moom.Hs)(receiver)).a)).a(((int)((local11_life10 * __sourceIntrinsic_fd3ca051ae471eca_originalDynamicSite395_34(10615, (7791480712137385379L ^ local7_life2))))), ((int)((local13_life15 * 4))), ((int)((((-(local12_life12 + p5)) * __sourceIntrinsic_fd3ca051ae471eca_originalDynamicSite395_36(10615, (7791480712137385379L ^ local7_life2))) + 1))));

    if (!((local9_life11 == null))) {

        break init_join_209;

    }

    }

    ((moom.G2)(((moom.Hs)(receiver)).a)).a(((int)((local11_life10 * __sourceIntrinsic_fd3ca051ae471eca_originalDynamicSite395_40(10615, (7791480712137385379L ^ local7_life2))))), ((int)((local13_life15 * 4))), ((int)((local12_life12 * __sourceIntrinsic_fd3ca051ae471eca_originalDynamicSite395_42(10615, (7791480712137385379L ^ local7_life2))))));

    if (!((local9_life11 == null))) {

        break init_join_209;

    }

    }

    ((moom.G2)(((moom.Hs)(receiver)).a)).a(((int)((((-(local12_life12 + p5)) * __sourceIntrinsic_fd3ca051ae471eca_originalDynamicSite395_46(10615, (7791480712137385379L ^ local7_life2))) + 1))), ((int)((local13_life15 * 4))), ((int)((local11_life10 * __sourceIntrinsic_fd3ca051ae471eca_originalDynamicSite395_48(10615, (7791480712137385379L ^ local7_life2))))));

    if (!((local9_life11 == null))) {

        break init_join_209;

    }

    }

    ((moom.G2)(((moom.Hs)(receiver)).a)).a(((int)((local12_life12 * __sourceIntrinsic_fd3ca051ae471eca_originalDynamicSite395_52(10615, (7791480712137385379L ^ local7_life2))))), ((int)((local13_life15 * 4))), ((int)((local11_life10 * __sourceIntrinsic_fd3ca051ae471eca_originalDynamicSite395_54(10615, (7791480712137385379L ^ local7_life2))))));

    }

    return;

}



static {
u = ((long)(__sourceExactCall_93409fc8361486(((moom._a)(__sourceExactCall_41bab94bc4b1bd(((long)(-6758202141012514438L)), ((long)(4176411596208109512L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))), ((long)(277508746176759L)))));
    y = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.Hs.u ^ 2564613480576L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill845_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill845_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill845_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill845_14 = new byte[8];
    (__sourceSpill845_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill845_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation845_16 = __sourceSpill845_14;
    ((javax.crypto.Cipher)(__sourceSpill845_11)).init(((int)(__sourceSpill845_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill845_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation845_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[4];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "©Úhã\007rÑ(§9\017¿%Þ·"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill845_25 = local6_life21;
        int __sourceSpill845_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill845_25)).substring(((int)(__sourceSpill845_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill845_30 = local8_life19;
        int __sourceSpill845_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill845_33 = new byte[8];
        (__sourceSpill845_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill845_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill845_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill845_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill845_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill845_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill845_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill845_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill845_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill845_34)).doFinal(((byte[])(__sourceSpill845_33)));
        (__sourceSpill845_30)[__sourceSpill845_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "ç\000zÃÓï=maÝ{\fEä"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill845_38 = local6_life21;
        int __sourceSpill845_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill845_38)).substring(((int)(__sourceSpill845_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill845_43 = local8_life19;
        int __sourceSpill845_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill845_46 = new byte[8];
        (__sourceSpill845_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill845_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill845_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill845_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill845_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill845_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill845_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill845_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill845_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill845_47)).doFinal(((byte[])(__sourceSpill845_46)));
        (__sourceSpill845_43)[__sourceSpill845_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    w = ((long[])(local8_life19));
    x = ((java.lang.Integer[])(new java.lang.Integer[4]));
    e = ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.cm)).b__fE(((int)(moom.d0.R)))));
    f = ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.cm)).b__fE(((int)(moom.d0.S)))));
    g = ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.cm)).b__fE(((int)(moom.d0.T)))));
    h = ((net.minecraft.block.state.IBlockState)(moom.Hs.f));
    i = ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.cn)).a__fE()));
    j = ((net.minecraft.block.state.IBlockState)(((moom.dN)(net.minecraft.init.Blocks.j)).a__fE()));
    k = ((int)(__sourceExactCall_6303461bb547d5(((int)(2)), ((int)(0)), ((int)(0)))));
    l = ((int)(__sourceExactCall_6303461bb547d5(((int)(2)), ((int)(2)), ((int)(0)))));
    m = ((int)(__sourceExactCall_6303461bb547d5(((int)(0)), ((int)(1)), ((int)(0)))));
    n = ((int)(__sourceExactCall_6303461bb547d5(((int)(4)), ((int)(1)), ((int)(0)))));
}

private static native <E extends Throwable> void __sourceConstructorInit_fd3ca051ae471eca_0(moom.Hs a0, int a1) throws E;

protected void b(net.minecraft.nbt.NBTTagCompound p0) {
return;
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


protected boolean a(net.minecraft.world.World p0, moom.G2 p1, int p2, int p3, int p4) {
int forwardValue2155_74_0;
    net.minecraft.entity.Entity[] spill2155_0;
    boolean spill2155_1;
    long life6_3;
    int life9_9;
    net.minecraft.entity.Entity[] life8_10;
    int life10_14;
    int life11_19;
    net.minecraft.entity.monster.EntityGuardian life12_38;
    forward_join_74: {
    forward_join_73: {
    life6_3 = (moom.Hs.u ^ 114952565451831L);
    spill2155_0 = moom.G4.b();
    life9_9 = ((moom.Hs)(this)).a(((int)(p2)), ((int)(p4)));
    life8_10 = spill2155_0;
    life10_14 = ((moom.Hs)(this)).a(((int)(p3)));
    life11_19 = ((moom.Hs)(this)).b(((int)(p2)), ((int)(p4)));
    spill2155_1 = ((moom.G2)(p1)).a(((moom.DS)(new moom.DT(life9_9, life10_14, life11_19))));
    if (!((life8_10 != null))) {
        forwardValue2155_74_0 = ((spill2155_1) ? 1 : 0);
        break forward_join_74;
    }
    if (!(spill2155_1)) {
        break forward_join_73;
    }
    life12_38 = new net.minecraft.entity.monster.EntityGuardian(p0);
    ((net.minecraft.entity.monster.EntityGuardian)(life12_38)).m(((boolean)(true)));
    ((net.minecraft.entity.monster.EntityGuardian)(life12_38)).c(((float)(((net.minecraft.entity.monster.EntityGuardian)(life12_38)).a())));
    ((net.minecraft.entity.monster.EntityGuardian)(life12_38)).c(((double)((((double) life9_9) + 0x1.0p-1d))), ((double)(((double) life10_14))), ((double)((((double) life11_19) + 0x1.0p-1d))), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)));
    ((net.minecraft.entity.monster.EntityGuardian)(life12_38)).a(((moom.Eh)(((net.minecraft.world.World)(p0)).a__Eh(((moom.DT)(new moom.DT(life12_38)))))), ((net.minecraft.entity.IEntityLivingData)(null)));
    ((net.minecraft.world.World)(p0)).b__Boolean(((net.minecraft.entity.Entity)(life12_38)));
    return ((1) != 0);
    }
    forwardValue2155_74_0 = 0;
    }
    return ((forwardValue2155_74_0) != 0);
}


private static int a(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x1C91;
        if (x[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = w[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])y.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    y.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/Hs", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Hs.x[n2] = n3;
        }
        return x[n2];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_b7cbcf4aa3078b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral4868_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Hs"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


protected static final int a__sourceReturn_cabccf1c64(int p0, int p1, int p2) {
long local3 = (moom.Hs.u ^ 66976336707728L);
    return (((p1 * __sourceIntrinsic_248c5cdd4d82_originalDynamicSite1169_1(32604, (6511639458655249609L ^ local3))) + (p2 * 5)) + p0);
}


protected void a(net.minecraft.nbt.NBTTagCompound p0) {
return;
}


protected void a(net.minecraft.world.World p0, moom.G2 p1, int p2, int p3, int p4, int p5, int p6, int p7, boolean p8) {
int forestValue672_9_0;
    int forestValue672_14_0;
    moom.Hs forestValue672_43_0;
    int forestValue672_47_0;
    moom.Hs forestValue672_62_0;
    net.minecraft.entity.Entity[] spill672_0;
    int spill672_1;
    boolean spill672_2;
    moom.Hs spill672_3;
    long life10_3;
    int life13_6;
    net.minecraft.entity.Entity[] life12_7;
    int life14_12;
    int life15_19;
    forest_join_78: {
    life10_3 = (moom.Hs.u ^ 76115822692061L);
    spill672_0 = moom.G4.b();
    life13_6 = p3;
    life12_7 = spill672_0;
    forest_cycle_8: while (true) {
    forest_join_75: {
    forestValue672_9_0 = life13_6;
    forest_cycle_9: while (true) {
    if (!((forestValue672_9_0 <= p6))) {
        break forest_join_78;
    }
    life14_12 = p2;
    forest_cycle_13: while (true) {
    forest_join_72: {
    forestValue672_14_0 = life14_12;
    forest_cycle_14: while (true) {
    if (!((forestValue672_14_0 <= p5))) {
        break forest_join_75;
    }
    spill672_1 = p4;
    if (!((life12_7 != null))) {
        forestValue672_9_0 = spill672_1;
        continue forest_cycle_9;
    }
    life15_19 = spill672_1;
    forest_cycle_20: while (true) {
    forest_join_69: {
    forest_join_62: {
    forest_join_61: {
    forest_join_47: {
    forest_join_43: {
    forest_join_42: {
    if (!((life15_19 <= p7))) {
        break forest_join_72;
    }
    spill672_2 = p8;
    if (!((life12_7 != null))) {
        forestValue672_14_0 = ((spill672_2) ? 1 : 0);
        continue forest_cycle_14;
    }
    if (!((life12_7 != null))) {
        forestValue672_47_0 = ((spill672_2) ? 1 : 0);
        break forest_join_47;
    }
    if (!(spill672_2)) {
        break forest_join_42;
    }
    spill672_3 = this;
    if (!((life12_7 != null))) {
        forestValue672_43_0 = spill672_3;
        break forest_join_43;
    }
    if (!((((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((moom.Hs)(spill672_3)).a(((net.minecraft.world.World)(p0)), ((int)(life14_12)), ((int)(life13_6)), ((int)(life15_19)), ((moom.G2)(p1))))).a__ch())).a__fn() != moom.fn.a))) {
        break forest_join_69;
    }
    }
    forestValue672_43_0 = this;
    }
    if (!((life12_7 != null))) {
        forestValue672_62_0 = forestValue672_43_0;
        break forest_join_62;
    }
    forestValue672_47_0 = ((moom.Hs)(forestValue672_43_0)).a(((int)(life13_6)));
    }
    if (!((forestValue672_47_0 >= ((net.minecraft.world.World)(p0)).c()))) {
        break forest_join_61;
    }
    ((moom.Hs)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((int)(life14_12)), ((int)(life13_6)), ((int)(life15_19)), ((moom.G2)(p1)));
    if (!((life12_7 == null))) {
        break forest_join_69;
    }
    }
    forestValue672_62_0 = this;
    }
    ((moom.Hs)(forestValue672_62_0)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.Hs.j)), ((int)(life14_12)), ((int)(life13_6)), ((int)(life15_19)), ((moom.G2)(p1)));
    }
    life15_19 += 1;
    if (!((life12_7 == null))) {
        continue forest_cycle_20;
    }
    break forest_cycle_20;
    }
    break forest_cycle_14;
    }
    }
    life14_12 += 1;
    if (!((life12_7 == null))) {
        continue forest_cycle_13;
    }
    break forest_cycle_13;
    }
    break forest_cycle_9;
    }
    }
    life13_6 += 1;
    if (!((life12_7 == null))) {
        continue forest_cycle_8;
    }
    break forest_cycle_8;
    }
    }
    return;
}


protected void a(net.minecraft.world.World p0, moom.G2 p1, int p2, int p3, boolean p4) {
long life6_3;
    net.minecraft.entity.Entity[] life8_5;
    forward_join_225: {
    forward_join_196: {
    forward_join_194: {
    life6_3 = (moom.Hs.u ^ 37938879418250L);
    life8_5 = moom.G4.b();
    if (!((life8_5 != null))) { break forward_join_194; }
    if (!(p4)) { break forward_join_196; }
    ((moom.Hs)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p1)), ((int)(p2)), ((int)(0)), ((int)(p3)), ((int)((p2 + 2))), ((int)(0)), ((int)(((p3 + __sourceIntrinsic_ae69bb28f5f9_invokedynamic2507_2(7714, (6976091864832019118L ^ life6_3))) - 1))), ((net.minecraft.block.state.IBlockState)(moom.Hs.e)), ((net.minecraft.block.state.IBlockState)(moom.Hs.e)), ((boolean)(false)));
    ((moom.Hs)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p1)), ((int)((p2 + 5))), ((int)(0)), ((int)(p3)), ((int)(((p2 + __sourceIntrinsic_ae69bb28f5f9_invokedynamic2507_6(10615, (7791434412505611769L ^ life6_3))) - 1))), ((int)(0)), ((int)(((p3 + __sourceIntrinsic_ae69bb28f5f9_invokedynamic2507_7(10615, (7791434412505611769L ^ life6_3))) - 1))), ((net.minecraft.block.state.IBlockState)(moom.Hs.e)), ((net.minecraft.block.state.IBlockState)(moom.Hs.e)), ((boolean)(false)));
    ((moom.Hs)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p1)), ((int)((p2 + 3))), ((int)(0)), ((int)(p3)), ((int)((p2 + 4))), ((int)(0)), ((int)((p3 + 2))), ((net.minecraft.block.state.IBlockState)(moom.Hs.e)), ((net.minecraft.block.state.IBlockState)(moom.Hs.e)), ((boolean)(false)));
    ((moom.Hs)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p1)), ((int)((p2 + 3))), ((int)(0)), ((int)((p3 + 5))), ((int)((p2 + 4))), ((int)(0)), ((int)(((p3 + __sourceIntrinsic_ae69bb28f5f9_invokedynamic2507_14(10615, (7791434412505611769L ^ life6_3))) - 1))), ((net.minecraft.block.state.IBlockState)(moom.Hs.e)), ((net.minecraft.block.state.IBlockState)(moom.Hs.e)), ((boolean)(false)));
    ((moom.Hs)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p1)), ((int)((p2 + 3))), ((int)(0)), ((int)((p3 + 2))), ((int)((p2 + 4))), ((int)(0)), ((int)((p3 + 2))), ((net.minecraft.block.state.IBlockState)(moom.Hs.f)), ((net.minecraft.block.state.IBlockState)(moom.Hs.f)), ((boolean)(false)));
    ((moom.Hs)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p1)), ((int)((p2 + 3))), ((int)(0)), ((int)((p3 + 5))), ((int)((p2 + 4))), ((int)(0)), ((int)((p3 + 5))), ((net.minecraft.block.state.IBlockState)(moom.Hs.f)), ((net.minecraft.block.state.IBlockState)(moom.Hs.f)), ((boolean)(false)));
    ((moom.Hs)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p1)), ((int)((p2 + 2))), ((int)(0)), ((int)((p3 + 3))), ((int)((p2 + 2))), ((int)(0)), ((int)((p3 + 4))), ((net.minecraft.block.state.IBlockState)(moom.Hs.f)), ((net.minecraft.block.state.IBlockState)(moom.Hs.f)), ((boolean)(false)));
    ((moom.Hs)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p1)), ((int)((p2 + 5))), ((int)(0)), ((int)((p3 + 3))), ((int)((p2 + 5))), ((int)(0)), ((int)((p3 + 4))), ((net.minecraft.block.state.IBlockState)(moom.Hs.f)), ((net.minecraft.block.state.IBlockState)(moom.Hs.f)), ((boolean)(false)));
    }
    if (!((life8_5 == null))) { break forward_join_225; }
    }
    ((moom.Hs)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p1)), ((int)(p2)), ((int)(0)), ((int)(p3)), ((int)(((p2 + __sourceIntrinsic_ae69bb28f5f9_invokedynamic2507_30(10615, (7791434412505611769L ^ life6_3))) - 1))), ((int)(0)), ((int)(((p3 + __sourceIntrinsic_ae69bb28f5f9_invokedynamic2507_31(10615, (7791434412505611769L ^ life6_3))) - 1))), ((net.minecraft.block.state.IBlockState)(moom.Hs.e)), ((net.minecraft.block.state.IBlockState)(moom.Hs.e)), ((boolean)(false)));
    }
    return;
}


protected void a(net.minecraft.world.World p0, moom.G2 p1, int p2, int p3, int p4, int p5, int p6, int p7, net.minecraft.block.state.IBlockState p8) {
int forestValue673_9_0;
    moom.Hs forestValue673_38_0;
    net.minecraft.world.World forestValue673_38_1;
    net.minecraft.entity.Entity[] spill673_0;
    int spill673_1;
    moom.Hs spill673_2;
    net.minecraft.world.World spill673_3;
    long life10_3;
    int life13_6;
    net.minecraft.entity.Entity[] life12_7;
    int life14_12;
    int life15_19;
    forest_join_53: {
    life10_3 = (moom.Hs.u ^ 110567034624384L);
    spill673_0 = moom.G4.b();
    life13_6 = p3;
    life12_7 = spill673_0;
    forest_cycle_8: while (true) {
    forest_join_50: {
    forestValue673_9_0 = life13_6;
    forest_cycle_9: while (true) {
    if (!((forestValue673_9_0 <= p6))) {
        break forest_join_53;
    }
    life14_12 = p2;
    forest_cycle_13: while (true) {
    forest_join_48: {
    forest_join_47: {
    if (!((life14_12 <= p5))) {
        break forest_join_50;
    }
    spill673_1 = p4;
    if (!((life12_7 != null))) {
        forestValue673_9_0 = spill673_1;
        continue forest_cycle_9;
    }
    life15_19 = spill673_1;
    forest_cycle_20: while (true) {
    forest_join_44: {
    forest_join_38: {
    if (!((life15_19 <= p7))) {
        break forest_join_47;
    }
    if (!((life12_7 != null))) {
        break forest_join_48;
    }
    spill673_2 = this;
    spill673_3 = p0;
    if (!((life12_7 != null))) {
        forestValue673_38_0 = spill673_2;
        forestValue673_38_1 = spill673_3;
        break forest_join_38;
    }
    if (!((((moom.Hs)(spill673_2)).a(((net.minecraft.world.World)(spill673_3)), ((int)(life14_12)), ((int)(life13_6)), ((int)(life15_19)), ((moom.G2)(p1))) == moom.Hs.j))) {
        break forest_join_44;
    }
    forestValue673_38_0 = this;
    forestValue673_38_1 = p0;
    }
    ((moom.Hs)(forestValue673_38_0)).a(((net.minecraft.world.World)(forestValue673_38_1)), ((net.minecraft.block.state.IBlockState)(p8)), ((int)(life14_12)), ((int)(life13_6)), ((int)(life15_19)), ((moom.G2)(p1)));
    }
    life15_19 += 1;
    if (!((life12_7 == null))) {
        continue forest_cycle_20;
    }
    break forest_cycle_20;
    }
    }
    life14_12 += 1;
    }
    if (!((life12_7 == null))) {
        continue forest_cycle_13;
    }
    break forest_cycle_13;
    }
    break forest_cycle_9;
    }
    }
    life13_6 += 1;
    if (!((life12_7 == null))) {
        continue forest_cycle_8;
    }
    break forest_cycle_8;
    }
    }
    return;
}


protected boolean a(moom.G2 p0, int p1, int p2, int p3, int p4) {
int local6 = ((moom.Hs)(this)).a(((int)(p1)), ((int)(p2)));
    int local7 = ((moom.Hs)(this)).b(((int)(p1)), ((int)(p2)));
    int local8 = ((moom.Hs)(this)).a(((int)(p3)), ((int)(p4)));
    int local9 = ((moom.Hs)(this)).b(((int)(p3)), ((int)(p4)));
    return (__sourceIntrinsic_booleanComparison((((moom.G2)(p0)).a(((int)(java.lang.Math.min(((int)(local6)), ((int)(local8))))), ((int)(java.lang.Math.min(((int)(local7)), ((int)(local9))))), ((int)(java.lang.Math.max(((int)(local6)), ((int)(local8))))), ((int)(java.lang.Math.max(((int)(local7)), ((int)(local9)))))))) != 0);
}


private static native <E extends Throwable> int __sourceIntrinsic_fd3ca051ae471eca_originalDynamicSite395_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fd3ca051ae471eca_originalDynamicSite395_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fd3ca051ae471eca_originalDynamicSite395_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fd3ca051ae471eca_originalDynamicSite395_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fd3ca051ae471eca_originalDynamicSite395_28(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fd3ca051ae471eca_originalDynamicSite395_34(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fd3ca051ae471eca_originalDynamicSite395_36(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fd3ca051ae471eca_originalDynamicSite395_40(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fd3ca051ae471eca_originalDynamicSite395_42(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fd3ca051ae471eca_originalDynamicSite395_46(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fd3ca051ae471eca_originalDynamicSite395_48(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fd3ca051ae471eca_originalDynamicSite395_52(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fd3ca051ae471eca_originalDynamicSite395_54(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_248c5cdd4d82_originalDynamicSite1169_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral4868_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ae69bb28f5f9_invokedynamic2507_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ae69bb28f5f9_invokedynamic2507_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ae69bb28f5f9_invokedynamic2507_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ae69bb28f5f9_invokedynamic2507_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ae69bb28f5f9_invokedynamic2507_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ae69bb28f5f9_invokedynamic2507_31(int a0, long a1) throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);

private static native int __sourceExactCall_b7cbcf4aa3078b(int p0, long p1);

private static native long __sourceExactCall_93409fc8361486(moom._a p0, long p1);
private static native moom._a __sourceExactCall_41bab94bc4b1bd(long p0, long p1, java.lang.Object p2);
private static native int __sourceExactCall_6303461bb547d5(int p0, int p1, int p2);
}
