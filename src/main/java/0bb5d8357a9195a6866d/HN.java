package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class HN extends moom.HF {

private static final long f;

private static final long[] g;

private static final java.lang.Integer[] h;

private static final java.util.Map i;

public HN() {
super();
}


public HN(int p0, java.util.Random p1, moom.G2 p2, moom.bs p3) {
super(p0);
    this.b = p3;
    this.e = (this).a(p1);
    this.a = p2;
}


static {
f = ((long)(((moom._a)(moom._c.a(((long)(-3985290051881165411L)), ((long)(8591806879323119417L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(255838695682537L)))));
    i = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.HN.f ^ 27586244865181L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill816_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill816_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill816_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill816_14 = new byte[8];
    (__sourceSpill816_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill816_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation816_16 = __sourceSpill816_14;
    ((javax.crypto.Cipher)(__sourceSpill816_11)).init(((int)(__sourceSpill816_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill816_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation816_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[10];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "ï[»vÁò¢®¡ÑWX\021ÌÊO\033ÂQ,\004\007Â¦eÕ ]0;iEñö¦à÷%Ãìç;w¹ò'µV¸Êi"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill816_25 = local6_life21;
        int __sourceSpill816_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill816_25)).substring(((int)(__sourceSpill816_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill816_30 = local8_life19;
        int __sourceSpill816_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill816_33 = new byte[8];
        (__sourceSpill816_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill816_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill816_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill816_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill816_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill816_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill816_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill816_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill816_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill816_34)).doFinal(((byte[])(__sourceSpill816_33)));
        (__sourceSpill816_30)[__sourceSpill816_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "[Ç\017V~ßR\021®Ò=~`D"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill816_38 = local6_life21;
        int __sourceSpill816_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill816_38)).substring(((int)(__sourceSpill816_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill816_43 = local8_life19;
        int __sourceSpill816_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill816_46 = new byte[8];
        (__sourceSpill816_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill816_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill816_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill816_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill816_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill816_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill816_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill816_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill816_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill816_47)).doFinal(((byte[])(__sourceSpill816_46)));
        (__sourceSpill816_43)[__sourceSpill816_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    g = ((long[])(local8_life19));
    h = ((java.lang.Integer[])(new java.lang.Integer[10]));
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.HN.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x2060;
        if (h[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = g[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])i.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    i.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/HN", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            HN.h[n2] = n3;
        }
        return h[n2];
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4759_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/HN"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public static moom.HN a(java.util.List<moom.G4> p0, java.util.Random p1, int p2, int p3, int p4, moom.bs p5, int p6) {
moom.HN forwardValue2079_40_0;
    long life7_3;
    moom.G2 life9_23;
    forward_join_40: {
    forward_join_39: {
    life7_3 = (moom.HN.f ^ 83538022541451L);
    life9_23 = moom.G2.a(((int)(p2)), ((int)(p3)), ((int)(p4)), ((int)(-1)), ((int)(-1)), ((int)(0)), ((int)(__sourceIntrinsic_fe265d5c987a_invokedynamic2079_1(28987, (1087651276601154263L ^ life7_3)))), ((int)(5)), ((int)(__sourceIntrinsic_fe265d5c987a_invokedynamic2079_2(21566, (5622611881821994967L ^ life7_3)))), ((moom.bs)(p5)));
    if (!(moom.HN.a(((moom.G2)(life9_23))))) {
        break forward_join_39;
    }
    if (!((moom.G4.a(((java.util.List)(p0)), ((moom.G2)(life9_23))) == null))) {
        break forward_join_39;
    }
    forwardValue2079_40_0 = new moom.HN(p6, p1, life9_23, p5);
    break forward_join_40;
    }
    forwardValue2079_40_0 = null;
    }
    return forwardValue2079_40_0;
}


public void a(moom.G4 p0, java.util.List<moom.G4> p1, java.util.Random p2) {
((moom.HN)(this)).a(((moom.HQ)(((moom.HQ)(p0)))), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)(1)), ((int)(1)));
    return;
}


public boolean a__Boolean(net.minecraft.world.World p0, java.util.Random p1, moom.G2 p2) {
int forwardValue2080_270_0;
    boolean spill2080_0;
    long life4_3;
    net.minecraft.entity.Entity[] life6_5;
    forward_join_270: {
    forward_join_15: {
    life4_3 = (moom.HN.f ^ 53703573749806L);
    life6_5 = moom.G4.b();
    spill2080_0 = ((moom.HN)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)));
    if (!((life6_5 != null))) {
        forwardValue2080_270_0 = ((spill2080_0) ? 1 : 0);
        break forward_join_270;
    }
    if (!(spill2080_0)) {
        break forward_join_15;
    }
    return ((0) != 0);
    }
    ((moom.HN)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(0)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2080_5(3581, (6321896006094769843L ^ life4_3)))), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2080_6(4865, (4502143584996216910L ^ life4_3)))), ((boolean)(true)), ((java.util.Random)(p1)), ((moom.H9)(net.minecraft.world.gen.structure.StructureStrongholdPieces.e)));
    ((moom.HN)(this)).a(((net.minecraft.world.World)(p0)), ((java.util.Random)(p1)), ((moom.G2)(p2)), ((moom.bJ)(((moom.HN)(this)).e)), ((int)(1)), ((int)(1)), ((int)(0)));
    ((moom.HN)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2080_11(15508, (8903308024269078487L ^ life4_3)))), ((int)(3)), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2080_12(15508, (8903308024269078487L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((boolean)(false)));
    ((moom.HN)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(4)), ((int)(1)), ((int)(1)), ((int)(4)), ((int)(3)), ((int)(1)), ((boolean)(false)), ((java.util.Random)(p1)), ((moom.H9)(net.minecraft.world.gen.structure.StructureStrongholdPieces.e)));
    ((moom.HN)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(4)), ((int)(1)), ((int)(3)), ((int)(4)), ((int)(3)), ((int)(3)), ((boolean)(false)), ((java.util.Random)(p1)), ((moom.H9)(net.minecraft.world.gen.structure.StructureStrongholdPieces.e)));
    ((moom.HN)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(4)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2080_22(22658, (2752230276366834639L ^ life4_3)))), ((int)(4)), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2080_23(15703, (3501868100973461013L ^ life4_3)))), ((boolean)(false)), ((java.util.Random)(p1)), ((moom.H9)(net.minecraft.world.gen.structure.StructureStrongholdPieces.e)));
    ((moom.HN)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(4)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2080_26(12113, (4078593562460351515L ^ life4_3)))), ((int)(4)), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2080_27(28987, (1087731731534492274L ^ life4_3)))), ((boolean)(false)), ((java.util.Random)(p1)), ((moom.H9)(net.minecraft.world.gen.structure.StructureStrongholdPieces.e)));
    ((moom.HN)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(4)), ((int)(1)), ((int)(4)), ((int)(4)), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2080_30(130, (4619174043944109002L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a8)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a8)).a__fE())), ((boolean)(false)));
    ((moom.HN)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(5)), ((int)(1)), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2080_36(15703, (3501868100973461013L ^ life4_3)))), ((int)(3)), ((int)(5)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a8)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a8)).a__fE())), ((boolean)(false)));
    ((moom.HN)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a8)).a__fE())), ((int)(4)), ((int)(3)), ((int)(2)), ((moom.G2)(p2)));
    ((moom.HN)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a8)).a__fE())), ((int)(4)), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2080_47(238, (331118047789499301L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.HN)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aA)).b__fE(((int)(((moom.HN)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aA)), ((int)(3)))))))), ((int)(4)), ((int)(1)), ((int)(2)), ((moom.G2)(p2)));
    ((moom.HN)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aA)).b__fE(((int)((((moom.HN)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aA)), ((int)(3))) + __sourceIntrinsic_5ac1d031d896_invokedynamic2080_57(238, (331118047789499301L ^ life4_3)))))))), ((int)(4)), ((int)(2)), ((int)(2)), ((moom.G2)(p2)));
    ((moom.HN)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aA)).b__fE(((int)(((moom.HN)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aA)), ((int)(3)))))))), ((int)(4)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2080_64(238, (331118047789499301L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.HN)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aA)).b__fE(((int)((((moom.HN)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aA)), ((int)(3))) + __sourceIntrinsic_5ac1d031d896_invokedynamic2080_69(238, (331118047789499301L ^ life4_3)))))))), ((int)(4)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2080_71(238, (331118047789499301L ^ life4_3)))), ((moom.G2)(p2)));
    forwardValue2080_270_0 = 1;
    }
    return ((forwardValue2080_270_0) != 0);
}


private static native <E extends Throwable> int __sourceIntrinsic_fe265d5c987a_invokedynamic2079_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fe265d5c987a_invokedynamic2079_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2080_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2080_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2080_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2080_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2080_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2080_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2080_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2080_27(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2080_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2080_36(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2080_47(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2080_57(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2080_64(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2080_69(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2080_71(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4759_0() throws E;
}
