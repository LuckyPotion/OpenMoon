package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class HG extends moom.HF {

private static final java.util.List<moom.D5> f;

private boolean g;

private static final long h;

private static final long[] i;

private static final java.lang.Integer[] j;

private static final java.util.Map k;

public HG() {
super();
}


public HG(int p0, java.util.Random p1, moom.G2 p2, moom.bs p3) {
super(p0);
    this.b = p3;
    this.e = (this).a(p1);
    this.a = p2;
}


static {
h = ((long)(((moom._a)(moom._c.a(((long)(6466707814173481020L)), ((long)(5910191890743143120L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(157604272778364L)))));
    long local11_life6 = (moom.HG.h ^ 107580435304209L);
    k = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life9;
    javax.crypto.Cipher __sourceSpill813_11 = (local0_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill813_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill813_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill813_14 = new byte[8];
    (__sourceSpill813_14)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local1_life15 = 1;
    while ((local1_life15 < 8)) {
        (__sourceSpill813_14)[local1_life15] = ((byte) ((int) ((local11_life6 << (local1_life15 * 8)) >>> 56)));
        local1_life15 += 1;
    }
    byte[] __sourcePreallocation813_16 = __sourceSpill813_14;
    ((javax.crypto.Cipher)(__sourceSpill813_11)).init(((int)(__sourceSpill813_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill813_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation813_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life19 = new long[18];
    int local3_life20 = 0;
    java.lang.String local4_life21;
    int local5_life23 = ((java.lang.String)((local4_life21 = "\007D\013¡RÍé|ýmËì\027O\r\004ù²{7çj\004Ñ01wÝ£º³¢/\026°tÛ±+dö|¼Ò:£Ñ6O¢A¬²\02213=¹Êð°\017RÞÅ([Ý\035tiq±mËbuX+úÅñ!íØWI\bóN¦\002bò\bW¾8¦e\023ï¾åâÂ"))).length();
    int local2_life24 = 0;
    do {
        java.lang.String __sourceSpill813_25 = local4_life21;
        int __sourceSpill813_26 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill813_25)).substring(((int)(__sourceSpill813_26)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill813_30 = local6_life19;
        int __sourceSpill813_31 = local3_life20;
        local3_life20 += 1;
        long local8_life32 = (((((((((((long) (local7_life29)[0]) & 255L) << 56) | ((((long) (local7_life29)[1]) & 255L) << 48)) | ((((long) (local7_life29)[2]) & 255L) << 40)) | ((((long) (local7_life29)[3]) & 255L) << 32)) | ((((long) (local7_life29)[4]) & 255L) << 24)) | ((((long) (local7_life29)[5]) & 255L) << 16)) | ((((long) (local7_life29)[6]) & 255L) << 8)) | (((long) (local7_life29)[7]) & 255L));
        byte[] __sourceSpill813_33 = new byte[8];
        (__sourceSpill813_33)[0] = ((byte) ((int) (local8_life32 >>> 56)));
        (__sourceSpill813_33)[1] = ((byte) ((int) (local8_life32 >>> 48)));
        (__sourceSpill813_33)[2] = ((byte) ((int) (local8_life32 >>> 40)));
        (__sourceSpill813_33)[3] = ((byte) ((int) (local8_life32 >>> 32)));
        (__sourceSpill813_33)[4] = ((byte) ((int) (local8_life32 >>> 24)));
        (__sourceSpill813_33)[5] = ((byte) ((int) (local8_life32 >>> 16)));
        (__sourceSpill813_33)[6] = ((byte) ((int) (local8_life32 >>> 8)));
        (__sourceSpill813_33)[7] = ((byte) ((int) local8_life32));
        javax.crypto.Cipher __sourceSpill813_34 = local0_life9;
        byte[] local10_life36 = ((javax.crypto.Cipher)(__sourceSpill813_34)).doFinal(((byte[])(__sourceSpill813_33)));
        (__sourceSpill813_30)[__sourceSpill813_31] = (((((((((((long) (local10_life36)[0]) & 255L) << 56) | ((((long) (local10_life36)[1]) & 255L) << 48)) | ((((long) (local10_life36)[2]) & 255L) << 40)) | ((((long) (local10_life36)[3]) & 255L) << 32)) | ((((long) (local10_life36)[4]) & 255L) << 24)) | ((((long) (local10_life36)[5]) & 255L) << 16)) | ((((long) (local10_life36)[6]) & 255L) << 8)) | (((long) (local10_life36)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    local5_life23 = ((java.lang.String)((local4_life21 = " \033Ñu\177\030ôNÑ¬N\022\030gO"))).length();
    local2_life24 = 0;
    do {
        java.lang.String __sourceSpill813_38 = local4_life21;
        int __sourceSpill813_39 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill813_38)).substring(((int)(__sourceSpill813_39)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill813_43 = local6_life19;
        int __sourceSpill813_44 = local3_life20;
        local3_life20 += 1;
        long local8_life45 = (((((((((((long) (local7_life42)[0]) & 255L) << 56) | ((((long) (local7_life42)[1]) & 255L) << 48)) | ((((long) (local7_life42)[2]) & 255L) << 40)) | ((((long) (local7_life42)[3]) & 255L) << 32)) | ((((long) (local7_life42)[4]) & 255L) << 24)) | ((((long) (local7_life42)[5]) & 255L) << 16)) | ((((long) (local7_life42)[6]) & 255L) << 8)) | (((long) (local7_life42)[7]) & 255L));
        byte[] __sourceSpill813_46 = new byte[8];
        (__sourceSpill813_46)[0] = ((byte) ((int) (local8_life45 >>> 56)));
        (__sourceSpill813_46)[1] = ((byte) ((int) (local8_life45 >>> 48)));
        (__sourceSpill813_46)[2] = ((byte) ((int) (local8_life45 >>> 40)));
        (__sourceSpill813_46)[3] = ((byte) ((int) (local8_life45 >>> 32)));
        (__sourceSpill813_46)[4] = ((byte) ((int) (local8_life45 >>> 24)));
        (__sourceSpill813_46)[5] = ((byte) ((int) (local8_life45 >>> 16)));
        (__sourceSpill813_46)[6] = ((byte) ((int) (local8_life45 >>> 8)));
        (__sourceSpill813_46)[7] = ((byte) ((int) local8_life45));
        javax.crypto.Cipher __sourceSpill813_47 = local0_life9;
        byte[] local10_life49 = ((javax.crypto.Cipher)(__sourceSpill813_47)).doFinal(((byte[])(__sourceSpill813_46)));
        (__sourceSpill813_43)[__sourceSpill813_44] = (((((((((((long) (local10_life49)[0]) & 255L) << 56) | ((((long) (local10_life49)[1]) & 255L) << 48)) | ((((long) (local10_life49)[2]) & 255L) << 40)) | ((((long) (local10_life49)[3]) & 255L) << 32)) | ((((long) (local10_life49)[4]) & 255L) << 24)) | ((((long) (local10_life49)[5]) & 255L) << 16)) | ((((long) (local10_life49)[6]) & 255L) << 8)) | (((long) (local10_life49)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    i = ((long[])(local6_life19));
    j = ((java.lang.Integer[])(new java.lang.Integer[18]));
    moom.D5[] __sourceSpill813_55 = new moom.D5[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite813_52(24291, (5627035548763712491L ^ local11_life6))];
    (__sourceSpill813_55)[0] = new moom.D5(net.minecraft.init.Items.bj, 0, 1, 1, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite813_54(2742, (3679342396014804919L ^ local11_life6)));
    (__sourceSpill813_55)[1] = new moom.D5(net.minecraft.init.Items.i, 0, 1, 3, 3);
    (__sourceSpill813_55)[2] = new moom.D5(net.minecraft.init.Items.j, 0, 1, 5, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite813_58(26260, (9196729314701726609L ^ local11_life6)));
    (__sourceSpill813_55)[3] = new moom.D5(net.minecraft.init.Items.k, 0, 1, 3, 5);
    (__sourceSpill813_55)[4] = new moom.D5(net.minecraft.init.Items.aC, 0, 4, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite813_61(4984, (6475371603359311479L ^ local11_life6)), 5);
    (__sourceSpill813_55)[5] = new moom.D5(net.minecraft.init.Items.P, 0, 1, 3, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite813_63(29808, (174467246833058164L ^ local11_life6)));
    (__sourceSpill813_55)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite813_64(8645, (6734755938829800664L ^ local11_life6))] = new moom.D5(net.minecraft.init.Items.e, 0, 1, 3, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite813_66(9597, (3688757312800034942L ^ local11_life6)));
    (__sourceSpill813_55)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite813_67(926, (7243884940114048665L ^ local11_life6))] = new moom.D5(net.minecraft.init.Items.b, 0, 1, 1, 5);
    (__sourceSpill813_55)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite813_69(20360, (8135969078287366788L ^ local11_life6))] = new moom.D5(net.minecraft.init.Items.l, 0, 1, 1, 5);
    (__sourceSpill813_55)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite813_71(31921, (4106365349797874107L ^ local11_life6))] = new moom.D5(net.minecraft.init.Items.Z, 0, 1, 1, 5);
    (__sourceSpill813_55)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite813_73(26260, (9196729314701726609L ^ local11_life6))] = new moom.D5(net.minecraft.init.Items.Y, 0, 1, 1, 5);
    (__sourceSpill813_55)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite813_75(28159, (5812383425705007331L ^ local11_life6))] = new moom.D5(net.minecraft.init.Items.aa, 0, 1, 1, 5);
    (__sourceSpill813_55)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite813_77(8804, (5571072710360536930L ^ local11_life6))] = new moom.D5(net.minecraft.init.Items.ab, 0, 1, 1, 5);
    (__sourceSpill813_55)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite813_79(21861, (2318840428547530855L ^ local11_life6))] = new moom.D5(net.minecraft.init.Items.ao, 0, 1, 1, 1);
    (__sourceSpill813_55)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite813_81(24161, (260190145639967596L ^ local11_life6))] = new moom.D5(net.minecraft.init.Items.aA, 0, 1, 1, 1);
    (__sourceSpill813_55)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite813_83(9597, (3688757312800034942L ^ local11_life6))] = new moom.D5(net.minecraft.init.Items.bZ, 0, 1, 1, 1);
    (__sourceSpill813_55)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite813_85(30778, (7575011131140656436L ^ local11_life6))] = new moom.D5(net.minecraft.init.Items.b0, 0, 1, 1, 1);
    (__sourceSpill813_55)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite813_87(12172, (8629367865803545221L ^ local11_life6))] = new moom.D5(net.minecraft.init.Items.b1, 0, 1, 1, 1);
    f = ((java.util.List)(com.google.common.collect.Lists.newArrayList(((java.lang.Object[])(__sourceSpill813_55)))));
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4742_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/HG"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x6B32;
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
                throw new RuntimeException("moom/HG", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            HG.j[n2] = n3;
        }
        return j[n2];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.HG.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


protected void b(net.minecraft.nbt.NBTTagCompound p0) {
super.b(((net.minecraft.nbt.NBTTagCompound)(p0)));
    this.g = ((boolean)(((net.minecraft.nbt.NBTTagCompound)(p0)).b__Boolean(((java.lang.String)("Chest")))));
    return;
}


public boolean a__Boolean(net.minecraft.world.World p0, java.util.Random p1, moom.G2 p2) {
int lexicalValue735_115_0;
    int lexicalValue735_187_0;
    boolean spill735_0;
    boolean spill735_1;
    boolean spill735_2;
    long life4_3;
    net.minecraft.entity.Entity[] life6_5;
    int life7_120;
    lexical_join_187: {
    lexical_join_186: {
    lexical_join_135: {
    lexical_join_115: {
    lexical_join_15: {
    life4_3 = (moom.HG.h ^ 12795559195141L);
    life6_5 = moom.G4.b();
    spill735_0 = ((moom.HG)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)));
    if (!((life6_5 != null))) {
        lexicalValue735_115_0 = ((spill735_0) ? 1 : 0);
        break lexical_join_115;
    }
    if (!(spill735_0)) {
        break lexical_join_15;
    }
    return ((0) != 0);
    }
    ((moom.HG)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(0)), ((int)(0)), ((int)(4)), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic735_5(7165, (5725738900767642594L ^ life4_3)))), ((boolean)(true)), ((java.util.Random)(p1)), ((moom.H9)(net.minecraft.world.gen.structure.StructureStrongholdPieces.e)));
    ((moom.HG)(this)).a(((net.minecraft.world.World)(p0)), ((java.util.Random)(p1)), ((moom.G2)(p2)), ((moom.bJ)(((moom.HG)(this)).e)), ((int)(1)), ((int)(1)), ((int)(0)));
    ((moom.HG)(this)).a(((net.minecraft.world.World)(p0)), ((java.util.Random)(p1)), ((moom.G2)(p2)), ((moom.bJ)(moom.bJ.OPENING)), ((int)(1)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic735_11(7165, (5725738900767642594L ^ life4_3)))));
    ((moom.HG)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(3)), ((int)(1)), ((int)(2)), ((int)(3)), ((int)(1)), ((int)(4)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a5)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a5)).a__fE())), ((boolean)(false)));
    ((moom.HG)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((moom.ei)(net.minecraft.init.Blocks.U)).b__fE(((int)(((net.minecraft.block.BlockStoneSlab$EnumType)(net.minecraft.block.BlockStoneSlab$EnumType.SMOOTHBRICK)).a()))))), ((int)(3)), ((int)(1)), ((int)(1)), ((moom.G2)(p2)));
    ((moom.HG)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((moom.ei)(net.minecraft.init.Blocks.U)).b__fE(((int)(((net.minecraft.block.BlockStoneSlab$EnumType)(net.minecraft.block.BlockStoneSlab$EnumType.SMOOTHBRICK)).a()))))), ((int)(3)), ((int)(1)), ((int)(5)), ((moom.G2)(p2)));
    ((moom.HG)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((moom.ei)(net.minecraft.init.Blocks.U)).b__fE(((int)(((net.minecraft.block.BlockStoneSlab$EnumType)(net.minecraft.block.BlockStoneSlab$EnumType.SMOOTHBRICK)).a()))))), ((int)(3)), ((int)(2)), ((int)(2)), ((moom.G2)(p2)));
    ((moom.HG)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((moom.ei)(net.minecraft.init.Blocks.U)).b__fE(((int)(((net.minecraft.block.BlockStoneSlab$EnumType)(net.minecraft.block.BlockStoneSlab$EnumType.SMOOTHBRICK)).a()))))), ((int)(3)), ((int)(2)), ((int)(4)), ((moom.G2)(p2)));
    lexicalValue735_115_0 = 2;
    }
    life7_120 = lexicalValue735_115_0;
    lexical_cycle_116: while (true) {
    if (!((life7_120 <= 4))) {
        break lexical_join_135;
    }
    ((moom.HG)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((moom.ei)(net.minecraft.init.Blocks.U)).b__fE(((int)(((net.minecraft.block.BlockStoneSlab$EnumType)(net.minecraft.block.BlockStoneSlab$EnumType.SMOOTHBRICK)).a()))))), ((int)(2)), ((int)(1)), ((int)(life7_120)), ((moom.G2)(p2)));
    life7_120 += 1;
    if (!((life6_5 != null))) {
        break lexical_join_186;
    }
    if (!((life6_5 == null))) { continue lexical_cycle_116; }
    break lexical_cycle_116;
    }
    }
    spill735_1 = this.g;
    if (!((life6_5 != null))) {
        lexicalValue735_187_0 = ((spill735_1) ? 1 : 0);
        break lexical_join_187;
    }
    if (!((!spill735_1))) {
        break lexical_join_186;
    }
    spill735_2 = ((moom.G2)(p2)).a(((moom.DS)(new moom.DT(((moom.HG)(this)).a(((int)(3)), ((int)(3))), ((moom.HG)(this)).a(((int)(2))), ((moom.HG)(this)).b(((int)(3)), ((int)(3)))))));
    if (!((life6_5 != null))) {
        lexicalValue735_187_0 = ((spill735_2) ? 1 : 0);
        break lexical_join_187;
    }
    if (!(spill735_2)) {
        break lexical_join_186;
    }
    this.g = ((boolean)(true));
    ((moom.HG)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((java.util.Random)(p1)), ((int)(3)), ((int)(2)), ((int)(3)), ((java.util.List)(moom.D5.a(((java.util.List)(moom.HG.f)), ((moom.D5[])(new moom.D5[] {((moom.xg)(net.minecraft.init.Items.bS)).a(((java.util.Random)(p1)))}))))), ((int)((2 + ((java.util.Random)(p1)).nextInt(((int)(2)))))));
    }
    lexicalValue735_187_0 = 1;
    }
    return ((lexicalValue735_187_0) != 0);
}


protected void a(net.minecraft.nbt.NBTTagCompound p0) {
super.a(((net.minecraft.nbt.NBTTagCompound)(p0)));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("Chest")), ((boolean)__sourceIntrinsic_integerToBoolean((((this.g) ? 1 : 0)))));
    return;
}


public static moom.HG a(java.util.List<moom.G4> p0, java.util.Random p1, int p2, int p3, int p4, moom.bs p5, int p6) {
moom.HG forwardValue2065_36_0;
    long life7_3;
    moom.G2 life9_19;
    forward_join_36: {
    forward_join_35: {
    life7_3 = (moom.HG.h ^ 122351232678277L);
    life9_19 = moom.G2.a(((int)(p2)), ((int)(p3)), ((int)(p4)), ((int)(-1)), ((int)(-1)), ((int)(0)), ((int)(5)), ((int)(5)), ((int)(__sourceIntrinsic_ce8a35bcf259_invokedynamic2065_1(770, (3151982389134409878L ^ life7_3)))), ((moom.bs)(p5)));
    if (!(moom.HG.a(((moom.G2)(life9_19))))) {
        break forward_join_35;
    }
    if (!((moom.G4.a(((java.util.List)(p0)), ((moom.G2)(life9_19))) == null))) {
        break forward_join_35;
    }
    forwardValue2065_36_0 = new moom.HG(p6, p1, life9_19, p5);
    break forward_join_36;
    }
    forwardValue2065_36_0 = null;
    }
    return forwardValue2065_36_0;
}


public void a(moom.G4 p0, java.util.List<moom.G4> p1, java.util.Random p2) {
((moom.HG)(this)).a(((moom.HQ)(((moom.HQ)(p0)))), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)(1)), ((int)(1)));
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite813_52(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite813_54(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite813_58(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite813_61(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite813_63(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite813_64(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite813_66(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite813_67(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite813_69(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite813_71(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite813_73(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite813_75(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite813_77(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite813_79(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite813_81(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite813_83(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite813_85(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite813_87(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ce8a35bcf259_invokedynamic2065_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic735_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic735_11(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4742_0() throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
