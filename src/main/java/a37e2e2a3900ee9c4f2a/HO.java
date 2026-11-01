package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class HO extends moom.HF {

private static final java.util.List<moom.D5> f;

protected int g;

private static final long h;

private static final long[] i;

private static final java.lang.Integer[] j;

private static final java.util.Map k;

public HO() {
super();
}


public HO(int p0, java.util.Random p1, moom.G2 p2, moom.bs p3) {
super(p0);
    this.b = p3;
    this.e = (this).a(p1);
    this.a = p2;
    this.g = (p1).nextInt(5);
}


static {
h = ((long)(((moom._a)(moom._c.a(((long)(-1850840321078412463L)), ((long)(5593506407546523608L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(25399176651976L)))));
    long local11_life6 = (moom.HO.h ^ 53725885274008L);
    k = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life9;
    javax.crypto.Cipher __sourceSpill817_11 = (local0_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill817_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill817_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill817_14 = new byte[8];
    (__sourceSpill817_14)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local1_life15 = 1;
    while ((local1_life15 < 8)) {
        (__sourceSpill817_14)[local1_life15] = ((byte) ((int) ((local11_life6 << (local1_life15 * 8)) >>> 56)));
        local1_life15 += 1;
    }
    byte[] __sourcePreallocation817_16 = __sourceSpill817_14;
    ((javax.crypto.Cipher)(__sourceSpill817_11)).init(((int)(__sourceSpill817_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill817_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation817_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life19 = new long[15];
    int local3_life20 = 0;
    java.lang.String local4_life21;
    int local5_life23 = ((java.lang.String)((local4_life21 = ";Í\035\017\034óÀ\004½Ô\007¦Æ$äO[¦WG\021­?\026¿½\b»ÝX8f\020üÕ|SI×Í\016ë§ ®\037l\0031\025t\fÅaùÞù\000õ\037¥³±ßú\007\f\000}\030_Ö2},²ëï{#ú\016ÊÁ(ü«`xô\nB¸°"))).length();
    int local2_life24 = 0;
    do {
        java.lang.String __sourceSpill817_25 = local4_life21;
        int __sourceSpill817_26 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill817_25)).substring(((int)(__sourceSpill817_26)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill817_30 = local6_life19;
        int __sourceSpill817_31 = local3_life20;
        local3_life20 += 1;
        long local8_life32 = (((((((((((long) (local7_life29)[0]) & 255L) << 56) | ((((long) (local7_life29)[1]) & 255L) << 48)) | ((((long) (local7_life29)[2]) & 255L) << 40)) | ((((long) (local7_life29)[3]) & 255L) << 32)) | ((((long) (local7_life29)[4]) & 255L) << 24)) | ((((long) (local7_life29)[5]) & 255L) << 16)) | ((((long) (local7_life29)[6]) & 255L) << 8)) | (((long) (local7_life29)[7]) & 255L));
        byte[] __sourceSpill817_33 = new byte[8];
        (__sourceSpill817_33)[0] = ((byte) ((int) (local8_life32 >>> 56)));
        (__sourceSpill817_33)[1] = ((byte) ((int) (local8_life32 >>> 48)));
        (__sourceSpill817_33)[2] = ((byte) ((int) (local8_life32 >>> 40)));
        (__sourceSpill817_33)[3] = ((byte) ((int) (local8_life32 >>> 32)));
        (__sourceSpill817_33)[4] = ((byte) ((int) (local8_life32 >>> 24)));
        (__sourceSpill817_33)[5] = ((byte) ((int) (local8_life32 >>> 16)));
        (__sourceSpill817_33)[6] = ((byte) ((int) (local8_life32 >>> 8)));
        (__sourceSpill817_33)[7] = ((byte) ((int) local8_life32));
        javax.crypto.Cipher __sourceSpill817_34 = local0_life9;
        byte[] local10_life36 = ((javax.crypto.Cipher)(__sourceSpill817_34)).doFinal(((byte[])(__sourceSpill817_33)));
        (__sourceSpill817_30)[__sourceSpill817_31] = (((((((((((long) (local10_life36)[0]) & 255L) << 56) | ((((long) (local10_life36)[1]) & 255L) << 48)) | ((((long) (local10_life36)[2]) & 255L) << 40)) | ((((long) (local10_life36)[3]) & 255L) << 32)) | ((((long) (local10_life36)[4]) & 255L) << 24)) | ((((long) (local10_life36)[5]) & 255L) << 16)) | ((((long) (local10_life36)[6]) & 255L) << 8)) | (((long) (local10_life36)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    local5_life23 = ((java.lang.String)((local4_life21 = "¤Î-:Ë&Z+þNmë\tã"))).length();
    local2_life24 = 0;
    do {
        java.lang.String __sourceSpill817_38 = local4_life21;
        int __sourceSpill817_39 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill817_38)).substring(((int)(__sourceSpill817_39)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill817_43 = local6_life19;
        int __sourceSpill817_44 = local3_life20;
        local3_life20 += 1;
        long local8_life45 = (((((((((((long) (local7_life42)[0]) & 255L) << 56) | ((((long) (local7_life42)[1]) & 255L) << 48)) | ((((long) (local7_life42)[2]) & 255L) << 40)) | ((((long) (local7_life42)[3]) & 255L) << 32)) | ((((long) (local7_life42)[4]) & 255L) << 24)) | ((((long) (local7_life42)[5]) & 255L) << 16)) | ((((long) (local7_life42)[6]) & 255L) << 8)) | (((long) (local7_life42)[7]) & 255L));
        byte[] __sourceSpill817_46 = new byte[8];
        (__sourceSpill817_46)[0] = ((byte) ((int) (local8_life45 >>> 56)));
        (__sourceSpill817_46)[1] = ((byte) ((int) (local8_life45 >>> 48)));
        (__sourceSpill817_46)[2] = ((byte) ((int) (local8_life45 >>> 40)));
        (__sourceSpill817_46)[3] = ((byte) ((int) (local8_life45 >>> 32)));
        (__sourceSpill817_46)[4] = ((byte) ((int) (local8_life45 >>> 24)));
        (__sourceSpill817_46)[5] = ((byte) ((int) (local8_life45 >>> 16)));
        (__sourceSpill817_46)[6] = ((byte) ((int) (local8_life45 >>> 8)));
        (__sourceSpill817_46)[7] = ((byte) ((int) local8_life45));
        javax.crypto.Cipher __sourceSpill817_47 = local0_life9;
        byte[] local10_life49 = ((javax.crypto.Cipher)(__sourceSpill817_47)).doFinal(((byte[])(__sourceSpill817_46)));
        (__sourceSpill817_43)[__sourceSpill817_44] = (((((((((((long) (local10_life49)[0]) & 255L) << 56) | ((((long) (local10_life49)[1]) & 255L) << 48)) | ((((long) (local10_life49)[2]) & 255L) << 40)) | ((((long) (local10_life49)[3]) & 255L) << 32)) | ((((long) (local10_life49)[4]) & 255L) << 24)) | ((((long) (local10_life49)[5]) & 255L) << 16)) | ((((long) (local10_life49)[6]) & 255L) << 8)) | (((long) (local10_life49)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    i = ((long[])(local6_life19));
    j = ((java.lang.Integer[])(new java.lang.Integer[15]));
    moom.D5[] __sourceSpill817_55 = new moom.D5[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite817_52(140, (6729988960671332340L ^ local11_life6))];
    (__sourceSpill817_55)[0] = new moom.D5(net.minecraft.init.Items.j, 0, 1, 5, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite817_54(13587, (5889725944670667375L ^ local11_life6)));
    (__sourceSpill817_55)[1] = new moom.D5(net.minecraft.init.Items.k, 0, 1, 3, 5);
    (__sourceSpill817_55)[2] = new moom.D5(net.minecraft.init.Items.aC, 0, 4, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite817_58(13922, (5632354585351143704L ^ local11_life6)), 5);
    (__sourceSpill817_55)[3] = new moom.D5(net.minecraft.init.Items.h, 0, 3, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite817_60(10281, (6297971204459159376L ^ local11_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite817_61(19437, (2650739165696081053L ^ local11_life6)));
    (__sourceSpill817_55)[4] = new moom.D5(net.minecraft.init.Items.P, 0, 1, 3, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite817_63(25620, (2127831587224064867L ^ local11_life6)));
    (__sourceSpill817_55)[5] = new moom.D5(net.minecraft.init.Items.e, 0, 1, 3, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite817_65(14376, (9074861309547335513L ^ local11_life6)));
    (__sourceSpill817_55)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite817_66(25754, (2926847232738661352L ^ local11_life6))] = new moom.D5(net.minecraft.init.Items.b, 0, 1, 1, 1);
    f = ((java.util.List)(com.google.common.collect.Lists.newArrayList(((java.lang.Object[])(__sourceSpill817_55)))));
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4762_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/HO"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x4316;
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
                throw new RuntimeException("moom/HO", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            HO.j[n2] = n3;
        }
        return j[n2];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.HO.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


protected void b(net.minecraft.nbt.NBTTagCompound p0) {
super.b(((net.minecraft.nbt.NBTTagCompound)(p0)));
    this.g = ((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Int(((java.lang.String)("Type")))));
    return;
}


public boolean a__Boolean(net.minecraft.world.World p0, java.util.Random p1, moom.G2 p2) {
int forestValue279_125_0;
    int forestValue279_810_0;
    int forestValue279_812_0;
    boolean spill279_0;
    int spill279_1;
    moom.HO spill279_2;
    net.minecraft.world.World spill279_3;
    moom.G2 spill279_4;
    java.util.Random spill279_5;
    int spill279_6;
    int spill279_7;
    int spill279_8;
    java.util.List spill279_9;
    moom.D5[] spill279_10;
    long life4_3;
    net.minecraft.entity.Entity[] life6_5;
    int life7_300;
    int life7_401;
    int life7_564;
    int life7_636;
    forest_join_812: {
    forest_join_811: {
    forest_join_810: {
    forest_join_729: {
    forest_join_628: {
    forest_join_619: {
    forest_join_557: {
    forest_join_469: {
    forest_join_435: {
    forest_join_433: {
    forest_join_397: {
    forest_join_395: {
    forest_join_359: {
    forest_join_297: {
    forest_join_128: {
    forest_join_125: {
    forest_join_15: {
    life4_3 = (moom.HO.h ^ 4641811611868L);
    life6_5 = moom.G4.b();
    spill279_0 = ((moom.HO)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)));
    if (!((life6_5 != null))) {
        forestValue279_125_0 = ((spill279_0) ? 1 : 0);
        break forest_join_125;
    }
    if (!(spill279_0)) {
        break forest_join_15;
    }
    return ((0) != 0);
    }
    ((moom.HO)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(0)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic279_5(19437, (2650761867663862745L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic279_6(2231, (4888933917407750278L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic279_7(19437, (2650761867663862745L ^ life4_3)))), ((boolean)(true)), ((java.util.Random)(p1)), ((moom.H9)(net.minecraft.world.gen.structure.StructureStrongholdPieces.e)));
    ((moom.HO)(this)).a(((net.minecraft.world.World)(p0)), ((java.util.Random)(p1)), ((moom.G2)(p2)), ((moom.bJ)(((moom.HO)(this)).e)), ((int)(4)), ((int)(1)), ((int)(0)));
    ((moom.HO)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(4)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic279_12(19437, (2650761867663862745L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic279_13(2231, (4888933917407750278L ^ life4_3)))), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic279_14(19437, (2650761867663862745L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((boolean)(false)));
    ((moom.HO)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(1)), ((int)(4)), ((int)(0)), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic279_20(2231, (4888933917407750278L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((boolean)(false)));
    ((moom.HO)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic279_26(19437, (2650761867663862745L ^ life4_3)))), ((int)(1)), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic279_27(19437, (2650761867663862745L ^ life4_3)))), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic279_28(2231, (4888933917407750278L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((boolean)(false)));
    forestValue279_125_0 = this.g;
    }
    if (!((life6_5 != null))) {
        forestValue279_812_0 = forestValue279_125_0;
        break forest_join_812;
    }
    switch (forestValue279_125_0) {
case 0:
{
        break forest_join_128;
    }
case 1:
{
        break forest_join_297;
    }
case 2:
{
        break forest_join_397;
    }
default:
{
        break forest_join_811;
    }
}
    }
    ((moom.HO)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a5)).a__fE())), ((int)(5)), ((int)(1)), ((int)(5)), ((moom.G2)(p2)));
    ((moom.HO)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a5)).a__fE())), ((int)(5)), ((int)(2)), ((int)(5)), ((moom.G2)(p2)));
    ((moom.HO)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a5)).a__fE())), ((int)(5)), ((int)(3)), ((int)(5)), ((moom.G2)(p2)));
    ((moom.HO)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aa)).a__fE())), ((int)(4)), ((int)(3)), ((int)(5)), ((moom.G2)(p2)));
    ((moom.HO)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aa)).a__fE())), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic279_49(2231, (4888933917407750278L ^ life4_3)))), ((int)(3)), ((int)(5)), ((moom.G2)(p2)));
    ((moom.HO)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aa)).a__fE())), ((int)(5)), ((int)(3)), ((int)(4)), ((moom.G2)(p2)));
    ((moom.HO)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aa)).a__fE())), ((int)(5)), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic279_56(2231, (4888933917407750278L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.HO)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((moom.ei)(net.minecraft.init.Blocks.U)).a__fE())), ((int)(4)), ((int)(1)), ((int)(4)), ((moom.G2)(p2)));
    ((moom.HO)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((moom.ei)(net.minecraft.init.Blocks.U)).a__fE())), ((int)(4)), ((int)(1)), ((int)(5)), ((moom.G2)(p2)));
    ((moom.HO)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((moom.ei)(net.minecraft.init.Blocks.U)).a__fE())), ((int)(4)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic279_66(2231, (4888933917407750278L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.HO)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((moom.ei)(net.minecraft.init.Blocks.U)).a__fE())), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic279_70(2231, (4888933917407750278L ^ life4_3)))), ((int)(1)), ((int)(4)), ((moom.G2)(p2)));
    ((moom.HO)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((moom.ei)(net.minecraft.init.Blocks.U)).a__fE())), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic279_74(2231, (4888933917407750278L ^ life4_3)))), ((int)(1)), ((int)(5)), ((moom.G2)(p2)));
    ((moom.HO)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((moom.ei)(net.minecraft.init.Blocks.U)).a__fE())), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic279_78(2231, (4888933917407750278L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic279_79(2231, (4888933917407750278L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.HO)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((moom.ei)(net.minecraft.init.Blocks.U)).a__fE())), ((int)(5)), ((int)(1)), ((int)(4)), ((moom.G2)(p2)));
    ((moom.HO)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((moom.ei)(net.minecraft.init.Blocks.U)).a__fE())), ((int)(5)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic279_86(2231, (4888933917407750278L ^ life4_3)))), ((moom.G2)(p2)));
    if (!((life6_5 == null))) {
        break forest_join_811;
    }
    }
    life7_300 = 0;
    forest_cycle_299: while (true) {
    if (!((life7_300 < 5))) {
        break forest_join_359;
    }
    ((moom.HO)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a5)).a__fE())), ((int)(3)), ((int)(1)), ((int)((3 + life7_300))), ((moom.G2)(p2)));
    ((moom.HO)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a5)).a__fE())), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic279_93(3198, (5266112801601793092L ^ life4_3)))), ((int)(1)), ((int)((3 + life7_300))), ((moom.G2)(p2)));
    ((moom.HO)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a5)).a__fE())), ((int)((3 + life7_300))), ((int)(1)), ((int)(3)), ((moom.G2)(p2)));
    ((moom.HO)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a5)).a__fE())), ((int)((3 + life7_300))), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic279_100(3198, (5266112801601793092L ^ life4_3)))), ((moom.G2)(p2)));
    life7_300 += 1;
    if (!((life6_5 != null))) {
        break forest_join_395;
    }
    if (!((life6_5 == null))) {
        continue forest_cycle_299;
    }
    break forest_cycle_299;
    }
    }
    ((moom.HO)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a5)).a__fE())), ((int)(5)), ((int)(1)), ((int)(5)), ((moom.G2)(p2)));
    ((moom.HO)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a5)).a__fE())), ((int)(5)), ((int)(2)), ((int)(5)), ((moom.G2)(p2)));
    ((moom.HO)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a5)).a__fE())), ((int)(5)), ((int)(3)), ((int)(5)), ((moom.G2)(p2)));
    ((moom.HO)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((moom.dM)(net.minecraft.init.Blocks.i)).a__fE())), ((int)(5)), ((int)(4)), ((int)(5)), ((moom.G2)(p2)));
    }
    if (!((life6_5 == null))) {
        break forest_join_811;
    }
    }
    life7_401 = 1;
    forest_cycle_399: while (true) {
    if (!((life7_401 <= __sourceIntrinsic_5ac1d031d896_invokedynamic279_114(12185, (7014130409176043433L ^ life4_3))))) {
        break forest_join_433;
    }
    ((moom.HO)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((int)(1)), ((int)(3)), ((int)(life7_401)), ((moom.G2)(p2)));
    ((moom.HO)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic279_120(12185, (7014130409176043433L ^ life4_3)))), ((int)(3)), ((int)(life7_401)), ((moom.G2)(p2)));
    life7_401 += 1;
    if (!((life6_5 != null))) {
        break forest_join_435;
    }
    if (!((life6_5 == null))) {
        continue forest_cycle_399;
    }
    break forest_cycle_399;
    }
    }
    life7_401 = 1;
    }
    forest_cycle_435: while (true) {
    if (!((life7_401 <= __sourceIntrinsic_5ac1d031d896_invokedynamic279_122(12185, (7014130409176043433L ^ life4_3))))) {
        break forest_join_469;
    }
    ((moom.HO)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((int)(life7_401)), ((int)(3)), ((int)(1)), ((moom.G2)(p2)));
    ((moom.HO)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((int)(life7_401)), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic279_128(12185, (7014130409176043433L ^ life4_3)))), ((moom.G2)(p2)));
    life7_401 += 1;
    if (!((life6_5 != null))) {
        break forest_join_557;
    }
    if (!((life6_5 == null))) {
        continue forest_cycle_435;
    }
    break forest_cycle_435;
    }
    }
    ((moom.HO)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((int)(5)), ((int)(1)), ((int)(4)), ((moom.G2)(p2)));
    ((moom.HO)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((int)(5)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic279_135(2231, (4888933917407750278L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.HO)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((int)(5)), ((int)(3)), ((int)(4)), ((moom.G2)(p2)));
    ((moom.HO)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((int)(5)), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic279_142(2231, (4888933917407750278L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.HO)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((int)(4)), ((int)(1)), ((int)(5)), ((moom.G2)(p2)));
    ((moom.HO)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic279_149(2231, (4888933917407750278L ^ life4_3)))), ((int)(1)), ((int)(5)), ((moom.G2)(p2)));
    ((moom.HO)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((int)(4)), ((int)(3)), ((int)(5)), ((moom.G2)(p2)));
    ((moom.HO)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic279_156(2231, (4888933917407750278L ^ life4_3)))), ((int)(3)), ((int)(5)), ((moom.G2)(p2)));
    }
    life7_564 = 1;
    forest_cycle_559: while (true) {
    if (!((life7_564 <= 3))) {
        break forest_join_619;
    }
    ((moom.HO)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((int)(4)), ((int)(life7_564)), ((int)(4)), ((moom.G2)(p2)));
    ((moom.HO)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic279_163(2231, (4888933917407750278L ^ life4_3)))), ((int)(life7_564)), ((int)(4)), ((moom.G2)(p2)));
    ((moom.HO)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((int)(4)), ((int)(life7_564)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic279_167(2231, (4888933917407750278L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.HO)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic279_171(2231, (4888933917407750278L ^ life4_3)))), ((int)(life7_564)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic279_172(2231, (4888933917407750278L ^ life4_3)))), ((moom.G2)(p2)));
    life7_564 += 1;
    if (!((life6_5 != null))) {
        break forest_join_628;
    }
    if (!((life6_5 == null))) {
        continue forest_cycle_559;
    }
    break forest_cycle_559;
    }
    }
    ((moom.HO)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aa)).a__fE())), ((int)(5)), ((int)(3)), ((int)(5)), ((moom.G2)(p2)));
    }
    life7_636 = 2;
    forest_cycle_630: while (true) {
    forest_join_700: {
    forest_join_687: {
    forest_join_669: {
    if (!((life7_636 <= __sourceIntrinsic_5ac1d031d896_invokedynamic279_177(27695, (2174745456325151760L ^ life4_3))))) {
        break forest_join_729;
    }
    ((moom.HO)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((int)(2)), ((int)(3)), ((int)(life7_636)), ((moom.G2)(p2)));
    ((moom.HO)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((int)(3)), ((int)(3)), ((int)(life7_636)), ((moom.G2)(p2)));
    if (!((life6_5 != null))) {
        break forest_join_687;
    }
    spill279_1 = life7_636;
    if (!((life6_5 != null))) {
        forestValue279_810_0 = spill279_1;
        break forest_join_810;
    }
    if (!((spill279_1 > 3))) {
        break forest_join_669;
    }
    if (!((life7_636 >= __sourceIntrinsic_5ac1d031d896_invokedynamic279_184(3198, (5266112801601793092L ^ life4_3))))) {
        break forest_join_700;
    }
    }
    ((moom.HO)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((int)(4)), ((int)(3)), ((int)(life7_636)), ((moom.G2)(p2)));
    ((moom.HO)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((int)(5)), ((int)(3)), ((int)(life7_636)), ((moom.G2)(p2)));
    }
    ((moom.HO)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic279_193(2231, (4888933917407750278L ^ life4_3)))), ((int)(3)), ((int)(life7_636)), ((moom.G2)(p2)));
    }
    ((moom.HO)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic279_197(3198, (5266112801601793092L ^ life4_3)))), ((int)(3)), ((int)(life7_636)), ((moom.G2)(p2)));
    ((moom.HO)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic279_201(27695, (2174745456325151760L ^ life4_3)))), ((int)(3)), ((int)(life7_636)), ((moom.G2)(p2)));
    life7_636 += 1;
    if (!((life6_5 == null))) {
        continue forest_cycle_630;
    }
    break forest_cycle_630;
    }
    }
    ((moom.HO)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.au)).b__fE(((int)(((moom.HO)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.au)), ((int)(((moom.bs)(moom.bs.WEST)).a())))))))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic279_209(12185, (7014130409176043433L ^ life4_3)))), ((int)(1)), ((int)(3)), ((moom.G2)(p2)));
    ((moom.HO)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.au)).b__fE(((int)(((moom.HO)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.au)), ((int)(((moom.bs)(moom.bs.WEST)).a())))))))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic279_217(12185, (7014130409176043433L ^ life4_3)))), ((int)(2)), ((int)(3)), ((moom.G2)(p2)));
    ((moom.HO)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.au)).b__fE(((int)(((moom.HO)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.au)), ((int)(((moom.bs)(moom.bs.WEST)).a())))))))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic279_225(12185, (7014130409176043433L ^ life4_3)))), ((int)(3)), ((int)(3)), ((moom.G2)(p2)));
    spill279_2 = this;
    spill279_3 = p0;
    spill279_4 = p2;
    spill279_5 = p1;
    spill279_6 = 3;
    spill279_7 = 4;
    spill279_8 = __sourceIntrinsic_5ac1d031d896_invokedynamic279_227(27695, (2174745456325151760L ^ life4_3));
    spill279_9 = moom.HO.f;
    moom.D5[] __stackOp279_229_0 = new moom.D5[1];
    spill279_10 = __stackOp279_229_0;
    (__stackOp279_229_0)[0] = ((moom.xg)(net.minecraft.init.Items.bS)).a(((java.util.Random)(p1)));
    forestValue279_810_0 = ((((moom.HO)(spill279_2)).a(((net.minecraft.world.World)(spill279_3)), ((moom.G2)(spill279_4)), ((java.util.Random)(spill279_5)), ((int)(spill279_6)), ((int)(spill279_7)), ((int)(spill279_8)), ((java.util.List)(moom.D5.a(((java.util.List)(spill279_9)), ((moom.D5[])(spill279_10))))), ((int)((1 + ((java.util.Random)(p1)).nextInt(((int)(4)))))))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forestValue279_810_0);
    }
    forestValue279_812_0 = 1;
    }
    return ((forestValue279_812_0) != 0);
}


protected void a(net.minecraft.nbt.NBTTagCompound p0) {
super.a(((net.minecraft.nbt.NBTTagCompound)(p0)));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Void(((java.lang.String)("Type")), ((int)(this.g)));
    return;
}


public static moom.HO a(java.util.List<moom.G4> p0, java.util.Random p1, int p2, int p3, int p4, moom.bs p5, int p6) {
moom.HO forwardValue2081_48_0;
    long life7_3;
    moom.G2 life9_31;
    forward_join_48: {
    forward_join_47: {
    life7_3 = (moom.HO.h ^ 129468588667393L);
    life9_31 = moom.G2.a(((int)(p2)), ((int)(p3)), ((int)(p4)), ((int)(__sourceIntrinsic_d52a431c3555_invokedynamic2081_1(5515, (4387422617616893805L ^ life7_3)))), ((int)(-1)), ((int)(0)), ((int)(__sourceIntrinsic_d52a431c3555_invokedynamic2081_2(9103, (1934336223140933995L ^ life7_3)))), ((int)(__sourceIntrinsic_d52a431c3555_invokedynamic2081_3(3198, (5265988112251117209L ^ life7_3)))), ((int)(__sourceIntrinsic_d52a431c3555_invokedynamic2081_4(31196, (3478993206474582838L ^ life7_3)))), ((moom.bs)(p5)));
    if (!(moom.HO.a(((moom.G2)(life9_31))))) {
        break forward_join_47;
    }
    if (!((moom.G4.a(((java.util.List)(p0)), ((moom.G2)(life9_31))) == null))) {
        break forward_join_47;
    }
    forwardValue2081_48_0 = new moom.HO(p6, p1, life9_31, p5);
    break forward_join_48;
    }
    forwardValue2081_48_0 = null;
    }
    return forwardValue2081_48_0;
}


public void a(moom.G4 p0, java.util.List<moom.G4> p1, java.util.Random p2) {
((moom.HO)(this)).a(((moom.HQ)(((moom.HQ)(p0)))), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)(4)), ((int)(1)));
    ((moom.HO)(this)).b(((moom.HQ)(((moom.HQ)(p0)))), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)(1)), ((int)(4)));
    ((moom.HO)(this)).c(((moom.HQ)(((moom.HQ)(p0)))), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)(1)), ((int)(4)));
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite817_52(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite817_54(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite817_58(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite817_60(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite817_61(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite817_63(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite817_65(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite817_66(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d52a431c3555_invokedynamic2081_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d52a431c3555_invokedynamic2081_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d52a431c3555_invokedynamic2081_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d52a431c3555_invokedynamic2081_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic279_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic279_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic279_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic279_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic279_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic279_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic279_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic279_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic279_27(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic279_28(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic279_49(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic279_56(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic279_66(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic279_70(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic279_74(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic279_78(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic279_79(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic279_86(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic279_93(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic279_100(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic279_114(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic279_120(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic279_122(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic279_128(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic279_135(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic279_142(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic279_149(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic279_156(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic279_163(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic279_167(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic279_171(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic279_172(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic279_177(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic279_184(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic279_193(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic279_197(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic279_201(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic279_209(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic279_217(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic279_225(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic279_227(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4762_0() throws E;
}
