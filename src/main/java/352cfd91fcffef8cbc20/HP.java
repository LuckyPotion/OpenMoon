package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class HP extends moom.HF {

private boolean f;

private static long j;

private static long[] p;

private static java.lang.Integer[] q;

private static java.util.Map r;

public HP(int p0, java.util.Random p1, moom.G2 p2, moom.bs p3) {
super(p0);
    this.f = false;
    this.b = p3;
    this.e = (this).a(p1);
    this.a = p2;
}


public HP(int p0, java.util.Random p1, int p2, int p3) { super(0); }


private static void __sourceConstructorBody_bb0580700b111874(moom.HP receiver, int p0, java.util.Random p1, int p2, int p3) throws Throwable {

long local5 = (moom.HP.j ^ 81169142556518L);

    moom.HP.__sourceConstructorInit_bb0580700b111874_0(((moom.HP)(receiver)), ((int)(p0)));

    ((moom.HP)(receiver)).f = ((boolean)(true));

    ((moom.HP)(receiver)).b = ((moom.bs)(((net.minecraft.util.EnumFacing$Plane)(net.minecraft.util.EnumFacing$Plane.HORIZONTAL)).a(((java.util.Random)(p1)))));

    ((moom.HP)(receiver)).e = ((moom.bJ)(moom.bJ.OPENING));

    ((moom.HP)(receiver)).a = ((moom.G2)(new moom.G2(p2, __sourceIntrinsic_bb0580700b111874_originalDynamicSite2119_8(10859, (2816627737745017825L ^ local5)), p3, ((p2 + 5) - 1), __sourceIntrinsic_bb0580700b111874_originalDynamicSite2119_9(17220, (3325086125662927L ^ local5)), ((p3 + 5) - 1))));

    return;

}



public HP() {
super();
}


static {
j = ((long)(((moom._a)(moom._c.a(((long)(-1620123842732160728L)), ((long)(-7918642342806062880L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(202480534588441L)))));
    r = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.HP.j ^ 56004639191320L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill818_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill818_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill818_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill818_14 = new byte[8];
    (__sourceSpill818_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill818_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation818_16 = __sourceSpill818_14;
    ((javax.crypto.Cipher)(__sourceSpill818_11)).init(((int)(__sourceSpill818_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill818_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation818_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[8];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "bÝlÙ)3j\032º3}Á<%\022/¦À¤\036ý\003¨M\r1éïÂúm¤æG{\000¦$ãH"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill818_25 = local6_life21;
        int __sourceSpill818_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill818_25)).substring(((int)(__sourceSpill818_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill818_30 = local8_life19;
        int __sourceSpill818_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill818_33 = new byte[8];
        (__sourceSpill818_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill818_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill818_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill818_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill818_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill818_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill818_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill818_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill818_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill818_34)).doFinal(((byte[])(__sourceSpill818_33)));
        (__sourceSpill818_30)[__sourceSpill818_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "QJ\000$È\036+!j:âBê8"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill818_38 = local6_life21;
        int __sourceSpill818_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill818_38)).substring(((int)(__sourceSpill818_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill818_43 = local8_life19;
        int __sourceSpill818_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill818_46 = new byte[8];
        (__sourceSpill818_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill818_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill818_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill818_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill818_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill818_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill818_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill818_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill818_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill818_47)).doFinal(((byte[])(__sourceSpill818_46)));
        (__sourceSpill818_43)[__sourceSpill818_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    p = ((long[])(local8_life19));
    q = ((java.lang.Integer[])(new java.lang.Integer[8]));
}

private static native <E extends Throwable> void __sourceConstructorInit_bb0580700b111874_0(moom.HP a0, int a1) throws E;

private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x252F;
        if (q[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = p[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])r.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    r.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/HP", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            HP.q[n2] = n3;
        }
        return q[n2];
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.HP.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


protected void b(net.minecraft.nbt.NBTTagCompound p0) {
super.b(((net.minecraft.nbt.NBTTagCompound)(p0)));
    this.f = ((boolean)(((net.minecraft.nbt.NBTTagCompound)(p0)).b__Boolean(((java.lang.String)("Source")))));
    return;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4765_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/HP"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


protected void a(net.minecraft.nbt.NBTTagCompound p0) {
super.a(((net.minecraft.nbt.NBTTagCompound)(p0)));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("Source")), ((boolean)__sourceIntrinsic_integerToBoolean((((this.f) ? 1 : 0)))));
    return;
}


public static moom.HP a(java.util.List<moom.G4> p0, java.util.Random p1, int p2, int p3, int p4, moom.bs p5, int p6) {
moom.HP forwardValue2083_40_0;
    long life7_3;
    moom.G2 life9_23;
    forward_join_40: {
    forward_join_39: {
    life7_3 = (moom.HP.j ^ 125593258927341L);
    life9_23 = moom.G2.a(((int)(p2)), ((int)(p3)), ((int)(p4)), ((int)(-1)), ((int)(__sourceIntrinsic_735ffd0f8a87_invokedynamic2083_1(32253, (4698737455455281147L ^ life7_3)))), ((int)(0)), ((int)(5)), ((int)(__sourceIntrinsic_735ffd0f8a87_invokedynamic2083_2(30280, (5036789064050545743L ^ life7_3)))), ((int)(5)), ((moom.bs)(p5)));
    if (!(moom.HP.a(((moom.G2)(life9_23))))) {
        break forward_join_39;
    }
    if (!((moom.G4.a(((java.util.List)(p0)), ((moom.G2)(life9_23))) == null))) {
        break forward_join_39;
    }
    forwardValue2083_40_0 = new moom.HP(p6, p1, life9_23, p5);
    break forward_join_40;
    }
    forwardValue2083_40_0 = null;
    }
    return forwardValue2083_40_0;
}


public boolean a__Boolean(net.minecraft.world.World p0, java.util.Random p1, moom.G2 p2) {
int forwardValue2085_229_0;
    boolean spill2085_0;
    long life4_3;
    net.minecraft.entity.Entity[] life6_5;
    forward_join_229: {
    forward_join_15: {
    life4_3 = (moom.HP.j ^ 17580310823145L);
    life6_5 = moom.G4.b();
    spill2085_0 = ((moom.HP)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)));
    if (!((life6_5 != null))) {
        forwardValue2085_229_0 = ((spill2085_0) ? 1 : 0);
        break forward_join_229;
    }
    if (!(spill2085_0)) {
        break forward_join_15;
    }
    return ((0) != 0);
    }
    ((moom.HP)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(0)), ((int)(0)), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2085_5(13688, (5111345126032044927L ^ life4_3)))), ((int)(4)), ((boolean)(true)), ((java.util.Random)(p1)), ((moom.H9)(net.minecraft.world.gen.structure.StructureStrongholdPieces.e)));
    ((moom.HP)(this)).a(((net.minecraft.world.World)(p0)), ((java.util.Random)(p1)), ((moom.G2)(p2)), ((moom.bJ)(this.e)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2085_9(21567, (2837026694609900095L ^ life4_3)))), ((int)(0)));
    ((moom.HP)(this)).a(((net.minecraft.world.World)(p0)), ((java.util.Random)(p1)), ((moom.G2)(p2)), ((moom.bJ)(moom.bJ.OPENING)), ((int)(1)), ((int)(1)), ((int)(4)));
    ((moom.HP)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a5)).a__fE())), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2085_15(1173, (6914301875443155604L ^ life4_3)))), ((int)(1)), ((moom.G2)(p2)));
    ((moom.HP)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a5)).a__fE())), ((int)(1)), ((int)(5)), ((int)(1)), ((moom.G2)(p2)));
    ((moom.HP)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((moom.ei)(net.minecraft.init.Blocks.U)).b__fE(((int)(((net.minecraft.block.BlockStoneSlab$EnumType)(net.minecraft.block.BlockStoneSlab$EnumType.STONE)).a()))))), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2085_24(22279, (2134776571931037953L ^ life4_3)))), ((int)(1)), ((moom.G2)(p2)));
    ((moom.HP)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a5)).a__fE())), ((int)(1)), ((int)(5)), ((int)(2)), ((moom.G2)(p2)));
    ((moom.HP)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a5)).a__fE())), ((int)(1)), ((int)(4)), ((int)(3)), ((moom.G2)(p2)));
    ((moom.HP)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((moom.ei)(net.minecraft.init.Blocks.U)).b__fE(((int)(((net.minecraft.block.BlockStoneSlab$EnumType)(net.minecraft.block.BlockStoneSlab$EnumType.STONE)).a()))))), ((int)(1)), ((int)(5)), ((int)(3)), ((moom.G2)(p2)));
    ((moom.HP)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a5)).a__fE())), ((int)(2)), ((int)(4)), ((int)(3)), ((moom.G2)(p2)));
    ((moom.HP)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a5)).a__fE())), ((int)(3)), ((int)(3)), ((int)(3)), ((moom.G2)(p2)));
    ((moom.HP)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((moom.ei)(net.minecraft.init.Blocks.U)).b__fE(((int)(((net.minecraft.block.BlockStoneSlab$EnumType)(net.minecraft.block.BlockStoneSlab$EnumType.STONE)).a()))))), ((int)(3)), ((int)(4)), ((int)(3)), ((moom.G2)(p2)));
    ((moom.HP)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a5)).a__fE())), ((int)(3)), ((int)(3)), ((int)(2)), ((moom.G2)(p2)));
    ((moom.HP)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a5)).a__fE())), ((int)(3)), ((int)(2)), ((int)(1)), ((moom.G2)(p2)));
    ((moom.HP)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((moom.ei)(net.minecraft.init.Blocks.U)).b__fE(((int)(((net.minecraft.block.BlockStoneSlab$EnumType)(net.minecraft.block.BlockStoneSlab$EnumType.STONE)).a()))))), ((int)(3)), ((int)(3)), ((int)(1)), ((moom.G2)(p2)));
    ((moom.HP)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a5)).a__fE())), ((int)(2)), ((int)(2)), ((int)(1)), ((moom.G2)(p2)));
    ((moom.HP)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a5)).a__fE())), ((int)(1)), ((int)(1)), ((int)(1)), ((moom.G2)(p2)));
    ((moom.HP)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((moom.ei)(net.minecraft.init.Blocks.U)).b__fE(((int)(((net.minecraft.block.BlockStoneSlab$EnumType)(net.minecraft.block.BlockStoneSlab$EnumType.STONE)).a()))))), ((int)(1)), ((int)(2)), ((int)(1)), ((moom.G2)(p2)));
    ((moom.HP)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a5)).a__fE())), ((int)(1)), ((int)(1)), ((int)(2)), ((moom.G2)(p2)));
    ((moom.HP)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((moom.ei)(net.minecraft.init.Blocks.U)).b__fE(((int)(((net.minecraft.block.BlockStoneSlab$EnumType)(net.minecraft.block.BlockStoneSlab$EnumType.STONE)).a()))))), ((int)(1)), ((int)(1)), ((int)(3)), ((moom.G2)(p2)));
    forwardValue2085_229_0 = 1;
    }
    return ((forwardValue2085_229_0) != 0);
}


public void a(moom.G4 p0, java.util.List<moom.G4> p1, java.util.Random p2) {
moom.G4 forwardValue2084_21_0;
    moom.HP spill2084_0;
    long life4_3;
    net.minecraft.entity.Entity[] life6_5;
    forward_join_21: {
    forward_join_13: {
    life4_3 = (moom.HP.j ^ 139043948481071L);
    life6_5 = moom.G4.b();
    spill2084_0 = this;
    if (!((life6_5 != null))) {
        forwardValue2084_21_0 = spill2084_0;
        break forward_join_21;
    }
    if (!(((moom.HP)(spill2084_0)).f)) {
        break forward_join_13;
    }
    net.minecraft.world.gen.structure.StructureStrongholdPieces.c = ((java.lang.Class)(net.minecraft.world.gen.structure.StructureStrongholdPieces$Crossing.class));
    }
    forwardValue2084_21_0 = ((moom.HP)(this)).a(((moom.HQ)(((moom.HQ)(p0)))), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)(1)), ((int)(1)));
    }
    recovery.source.CarrierOps.discard(forwardValue2084_21_0);
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_bb0580700b111874_originalDynamicSite2119_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bb0580700b111874_originalDynamicSite2119_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_735ffd0f8a87_invokedynamic2083_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_735ffd0f8a87_invokedynamic2083_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2085_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2085_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2085_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2085_24(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4765_0() throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
