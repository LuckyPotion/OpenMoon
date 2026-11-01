package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class H0 extends moom.HT {

private static final long h;

private static final long[] i;

private static final java.lang.Integer[] j;

private static final java.util.Map k;

public H0() {
super();
}


public H0(moom.H6 p0, int p1, java.util.Random p2, moom.G2 p3, moom.bs p4) {
super(p0, p1);
    this.b = p4;
    this.a = p3;
}


static {
h = ((long)(((moom._a)(moom._c.a(((long)(-3058787821899081125L)), ((long)(6614810395136358641L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(96062490891863L)))));
    k = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.H0.h ^ 44740537268486L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill802_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill802_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill802_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill802_14 = new byte[8];
    (__sourceSpill802_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill802_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation802_16 = __sourceSpill802_14;
    ((javax.crypto.Cipher)(__sourceSpill802_11)).init(((int)(__sourceSpill802_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill802_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation802_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[13];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "Y\017@OÞ7¼íâ0i8û­\"¶IÕý\036V\033bJ£\177Ûn! ¦÷?N-Ù-|¸·Jð\037\0362Ìv$0¯²\021s\022Ù[Æ\016Gé¨]®Ã\002Exî\022è£Û\033\f\"\"»f\020"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill802_25 = local6_life21;
        int __sourceSpill802_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill802_25)).substring(((int)(__sourceSpill802_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill802_30 = local8_life19;
        int __sourceSpill802_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill802_33 = new byte[8];
        (__sourceSpill802_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill802_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill802_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill802_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill802_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill802_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill802_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill802_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill802_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill802_34)).doFinal(((byte[])(__sourceSpill802_33)));
        (__sourceSpill802_30)[__sourceSpill802_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "=¦ó#,/¯ô\020%þ\025M\035\bß"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill802_38 = local6_life21;
        int __sourceSpill802_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill802_38)).substring(((int)(__sourceSpill802_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill802_43 = local8_life19;
        int __sourceSpill802_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill802_46 = new byte[8];
        (__sourceSpill802_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill802_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill802_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill802_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill802_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill802_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill802_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill802_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill802_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill802_47)).doFinal(((byte[])(__sourceSpill802_46)));
        (__sourceSpill802_43)[__sourceSpill802_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    i = ((long[])(local8_life19));
    j = ((java.lang.Integer[])(new java.lang.Integer[13]));
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.H0.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4709_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/H0"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x4522;
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
                throw new RuntimeException("moom/H0", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            H0.j[n2] = n3;
        }
        return j[n2];
}


public boolean a__Boolean(net.minecraft.world.World p0, java.util.Random p1, moom.G2 p2) {
moom.H0 forestValue666_25_0;
    int forestValue666_405_0;
    int forestValue666_415_0;
    int forestValue666_415_1;
    int forestValue666_452_0;
    int forestValue666_461_0;
    int forestValue666_462_0;
    int forestValue666_462_1;
    int forestValue666_467_0;
    int forestValue666_467_1;
    int forestValue666_613_0;
    int forestValue666_729_0;
    moom.fn forestValue666_1164_0;
    moom.fn forestValue666_1164_1;
    moom.H0 forestValue666_1167_0;
    net.minecraft.world.World forestValue666_1167_1;
    int forestValue666_1179_0;
    int forestValue666_1223_0;
    int forestValue666_1279_0;
    int spill666_0;
    moom.H0 spill666_1;
    int spill666_2;
    int spill666_3;
    int spill666_4;
    int spill666_5;
    int spill666_6;
    int spill666_7;
    int spill666_8;
    int spill666_9;
    moom.fn spill666_10;
    moom.fn spill666_11;
    moom.H0 spill666_12;
    net.minecraft.world.World spill666_13;
    int spill666_14;
    int spill666_15;
    long life4_3;
    net.minecraft.entity.Entity[] life6_5;
    int life7_408;
    int life8_413;
    int life9_415;
    int life10_422;
    int life10_626;
    int life11_656;
    int life11_743;
    int life12_754;
    int life11_1198;
    int life12_1205;
    int life11_1243;
    int life12_1254;
    forest_join_1279: {
    forest_join_1270: {
    forest_join_1223: {
    forest_join_1222: {
    forest_join_1179: {
    forest_join_1178: {
    forest_join_1167: {
    forest_join_1164: {
    forest_join_772: {
    forest_join_729: {
    forest_join_671: {
    forest_join_613: {
    forest_join_488: {
    forest_join_405: {
    forest_join_43: {
    forest_join_25: {
    forest_join_24: {
    life4_3 = (moom.H0.h ^ 80719204789620L);
    life6_5 = moom.G4.b();
    spill666_0 = ((moom.H0)(this)).e;
    if (!((life6_5 != null))) {
        forestValue666_405_0 = spill666_0;
        break forest_join_405;
    }
    if (!((spill666_0 < 0))) {
        break forest_join_43;
    }
    ((moom.H0)(this)).e = ((int)(((moom.H0)(this)).a__sourceReturn_6a83d276d7(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)))));
    spill666_1 = this;
    if (!((life6_5 != null))) {
        forestValue666_25_0 = spill666_1;
        break forest_join_25;
    }
    if (!((((moom.H0)(spill666_1)).e < 0))) {
        break forest_join_24;
    }
    return ((1) != 0);
    }
    forestValue666_25_0 = this;
    }
    ((moom.G2)(((moom.H0)(forestValue666_25_0)).a)).a(((int)(0)), ((int)((((((moom.H0)(this)).e - ((moom.G2)(((moom.H0)(this)).a)).e) + __sourceIntrinsic_5ac1d031d896_invokedynamic666_11(9687, (1993925343845319640L ^ life4_3))) - 1))), ((int)(0)));
    }
    ((moom.H0)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(1)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic666_13(9687, (1993925343845319640L ^ life4_3)))), ((int)(4)), ((int)(4)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((boolean)(false)));
    ((moom.H0)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(2)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic666_19(23833, (3678455112901327635L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic666_20(32105, (7290725214175583083L ^ life4_3)))), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic666_21(23532, (152557880750636519L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((boolean)(false)));
    ((moom.H0)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(2)), ((int)(0)), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic666_27(13627, (1843455956160451381L ^ life4_3)))), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic666_28(29864, (526297904544436907L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((boolean)(false)));
    ((moom.H0)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(0)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic666_34(9687, (1993925343845319640L ^ life4_3)))), ((int)(0)), ((int)(4)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((boolean)(false)));
    ((moom.H0)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(0)), ((int)(0)), ((int)(0)), ((int)(3)), ((int)(5)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((boolean)(false)));
    ((moom.H0)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic666_45(13627, (1843455956160451381L ^ life4_3)))), ((int)(0)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic666_46(13627, (1843455956160451381L ^ life4_3)))), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic666_47(29864, (526297904544436907L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((boolean)(false)));
    ((moom.H0)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(0)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic666_53(9687, (1993925343845319640L ^ life4_3)))), ((int)(2)), ((int)(0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((boolean)(false)));
    ((moom.H0)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(0)), ((int)(5)), ((int)(2)), ((int)(1)), ((int)(5)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((boolean)(false)));
    ((moom.H0)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(2)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic666_64(32542, (7544164183662680343L ^ life4_3)))), ((int)(2)), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic666_65(29864, (526297904544436907L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((boolean)(false)));
    ((moom.H0)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(3)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic666_71(29864, (526297904544436907L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic666_72(9687, (1993925343845319640L ^ life4_3)))), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic666_73(29864, (526297904544436907L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((boolean)(false)));
    ((moom.H0)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(2)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic666_79(9687, (1993925343845319640L ^ life4_3)))), ((int)(3)), ((int)(0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((boolean)(false)));
    ((moom.H0)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(2)), ((int)(5)), ((int)(2)), ((int)(3)), ((int)(5)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((boolean)(false)));
    ((moom.H0)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(4)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic666_90(13627, (1843455956160451381L ^ life4_3)))), ((int)(4)), ((int)(1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((boolean)(false)));
    ((moom.H0)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(4)), ((int)(4)), ((int)(3)), ((int)(4)), ((int)(4)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((boolean)(false)));
    ((moom.H0)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(5)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic666_101(13627, (1843455956160451381L ^ life4_3)))), ((int)(5)), ((int)(3)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((boolean)(false)));
    ((moom.H0)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((int)(0)), ((int)(4)), ((int)(2)), ((moom.G2)(p2)));
    ((moom.H0)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((int)(0)), ((int)(4)), ((int)(3)), ((moom.G2)(p2)));
    ((moom.H0)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic666_115(13627, (1843455956160451381L ^ life4_3)))), ((int)(4)), ((int)(2)), ((moom.G2)(p2)));
    ((moom.H0)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic666_119(13627, (1843455956160451381L ^ life4_3)))), ((int)(4)), ((int)(3)), ((moom.G2)(p2)));
    ((moom.H0)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic666_123(13627, (1843455956160451381L ^ life4_3)))), ((int)(4)), ((int)(4)), ((moom.G2)(p2)));
    forestValue666_405_0 = ((moom.H0)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ad)), ((int)(3)));
    }
    life7_408 = forestValue666_405_0;
    life8_413 = ((moom.H0)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ad)), ((int)(2)));
    life9_415 = -1;
    forest_cycle_413: while (true) {
    forest_join_485: {
    forestValue666_415_0 = life9_415;
    forestValue666_415_1 = 2;
    forest_cycle_415: while (true) {
    if (!((forestValue666_415_0 <= forestValue666_415_1))) {
        break forest_join_488;
    }
    spill666_2 = 0;
    if (!((life6_5 != null))) {
        forestValue666_613_0 = spill666_2;
        break forest_join_613;
    }
    life10_422 = spill666_2;
    forest_cycle_420: while (true) {
    forest_join_482: {
    forest_join_468: {
    forest_join_467: {
    forest_join_462: {
    forest_join_461: {
    forest_join_460: {
    forest_join_452: {
    forest_join_451: {
    if (!((life10_422 <= __sourceIntrinsic_5ac1d031d896_invokedynamic666_129(13627, (1843455956160451381L ^ life4_3))))) {
        break forest_join_485;
    }
    ((moom.H0)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ad)).b__fE(((int)(life7_408))))), ((int)(life10_422)), ((int)((4 + life9_415))), ((int)(life9_415)), ((moom.G2)(p2)));
    spill666_3 = life9_415;
    if (!((life6_5 != null))) {
        forestValue666_452_0 = spill666_3;
        break forest_join_452;
    }
    spill666_4 = -1;
    if (!((life6_5 != null))) {
        forestValue666_415_0 = spill666_3;
        forestValue666_415_1 = spill666_4;
        continue forest_cycle_415;
    }
    if (!((spill666_3 <= spill666_4))) {
        break forest_join_451;
    }
    spill666_5 = life10_422;
    if (!((life6_5 != null))) {
        forestValue666_452_0 = spill666_5;
        break forest_join_452;
    }
    if (!((spill666_5 <= 1))) {
        break forest_join_482;
    }
    }
    forestValue666_452_0 = life9_415;
    }
    if (!((life6_5 != null))) {
        forestValue666_461_0 = forestValue666_452_0;
        break forest_join_461;
    }
    if (!((forestValue666_452_0 <= 0))) {
        break forest_join_460;
    }
    spill666_6 = life10_422;
    spill666_7 = 3;
    if (!((life6_5 != null))) {
        forestValue666_462_0 = spill666_6;
        forestValue666_462_1 = spill666_7;
        break forest_join_462;
    }
    if (!((spill666_6 <= spill666_7))) {
        break forest_join_482;
    }
    }
    forestValue666_461_0 = life9_415;
    }
    forestValue666_462_0 = forestValue666_461_0;
    forestValue666_462_1 = 1;
    }
    if (!((life6_5 != null))) {
        forestValue666_467_0 = forestValue666_462_0;
        forestValue666_467_1 = forestValue666_462_1;
        break forest_join_467;
    }
    if (!((forestValue666_462_0 <= forestValue666_462_1))) {
        break forest_join_468;
    }
    forestValue666_467_0 = life10_422;
    forestValue666_467_1 = 5;
    }
    if (!((forestValue666_467_0 != forestValue666_467_1))) {
        break forest_join_482;
    }
    }
    ((moom.H0)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ad)).b__fE(((int)(life8_413))))), ((int)(life10_422)), ((int)((4 + life9_415))), ((int)((5 - life9_415))), ((moom.G2)(p2)));
    }
    life10_422 += 1;
    if (!((life6_5 == null))) {
        continue forest_cycle_420;
    }
    break forest_cycle_420;
    }
    break forest_cycle_415;
    }
    }
    life9_415 += 1;
    if (!((life6_5 == null))) {
        continue forest_cycle_413;
    }
    break forest_cycle_413;
    }
    }
    ((moom.H0)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(3)), ((int)(4)), ((int)(5)), ((int)(3)), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic666_136(29864, (526297904544436907L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((boolean)(false)));
    ((moom.H0)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic666_142(9687, (1993925343845319640L ^ life4_3)))), ((int)(4)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic666_143(9687, (1993925343845319640L ^ life4_3)))), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic666_144(29864, (526297904544436907L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((boolean)(false)));
    ((moom.H0)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(4)), ((int)(5)), ((int)(4)), ((int)(4)), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic666_150(29864, (526297904544436907L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((boolean)(false)));
    ((moom.H0)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic666_156(32542, (7544164183662680343L ^ life4_3)))), ((int)(5)), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic666_157(32542, (7544164183662680343L ^ life4_3)))), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic666_158(29864, (526297904544436907L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((boolean)(false)));
    ((moom.H0)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic666_164(32542, (7544164183662680343L ^ life4_3)))), ((int)(3)), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic666_165(32542, (7544164183662680343L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic666_166(29864, (526297904544436907L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((boolean)(false)));
    life9_415 = ((moom.H0)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ad)), ((int)(0)));
    forestValue666_613_0 = 4;
    }
    life10_626 = forestValue666_613_0;
    forest_cycle_614: while (true) {
    forest_join_669: {
    forest_join_668: {
    if (!((life10_626 >= 1))) {
        break forest_join_671;
    }
    ((moom.H0)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((int)(life10_626)), ((int)((2 + life10_626))), ((int)((__sourceIntrinsic_5ac1d031d896_invokedynamic666_176(9687, (1993925343845319640L ^ life4_3)) - life10_626))), ((moom.G2)(p2)));
    spill666_8 = (__sourceIntrinsic_5ac1d031d896_invokedynamic666_178(13627, (1843455956160451381L ^ life4_3)) - life10_626);
    if (!((life6_5 != null))) {
        forestValue666_729_0 = spill666_8;
        break forest_join_729;
    }
    life11_656 = spill666_8;
    forest_cycle_644: while (true) {
    if (!((life11_656 <= __sourceIntrinsic_5ac1d031d896_invokedynamic666_179(29864, (526297904544436907L ^ life4_3))))) {
        break forest_join_668;
    }
    ((moom.H0)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ad)).b__fE(((int)(life9_415))))), ((int)(life10_626)), ((int)((2 + life10_626))), ((int)(life11_656)), ((moom.G2)(p2)));
    life11_656 += 1;
    if (!((life6_5 != null))) {
        break forest_join_669;
    }
    if (!((life6_5 == null))) {
        continue forest_cycle_644;
    }
    break forest_cycle_644;
    }
    }
    life10_626 += -1;
    }
    if (!((life6_5 == null))) {
        continue forest_cycle_614;
    }
    break forest_cycle_614;
    }
    }
    life10_626 = ((moom.H0)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ad)), ((int)(1)));
    ((moom.H0)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic666_187(32542, (7544164183662680343L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic666_188(32542, (7544164183662680343L ^ life4_3)))), ((int)(3)), ((moom.G2)(p2)));
    ((moom.H0)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic666_192(9687, (1993925343845319640L ^ life4_3)))), ((int)(5)), ((int)(4)), ((moom.G2)(p2)));
    ((moom.H0)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ad)).b__fE(((int)(life10_626))))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic666_196(32542, (7544164183662680343L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic666_197(32542, (7544164183662680343L ^ life4_3)))), ((int)(4)), ((moom.G2)(p2)));
    forestValue666_729_0 = __sourceIntrinsic_5ac1d031d896_invokedynamic666_199(32542, (7544164183662680343L ^ life4_3));
    }
    life11_743 = forestValue666_729_0;
    forest_cycle_730: while (true) {
    forest_join_770: {
    forest_join_769: {
    if (!((life11_743 <= __sourceIntrinsic_5ac1d031d896_invokedynamic666_200(13627, (1843455956160451381L ^ life4_3))))) {
        break forest_join_772;
    }
    spill666_9 = 5;
    if (!((life6_5 != null))) {
        forestValue666_1179_0 = spill666_9;
        break forest_join_1179;
    }
    life12_754 = spill666_9;
    forest_cycle_741: while (true) {
    if (!((life12_754 <= __sourceIntrinsic_5ac1d031d896_invokedynamic666_201(29864, (526297904544436907L ^ life4_3))))) {
        break forest_join_769;
    }
    ((moom.H0)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ad)).b__fE(((int)(life10_626))))), ((int)(life11_743)), ((int)((__sourceIntrinsic_5ac1d031d896_invokedynamic666_204(31670, (9107749586506669502L ^ life4_3)) - life11_743))), ((int)(life12_754)), ((moom.G2)(p2)));
    life12_754 += 1;
    if (!((life6_5 != null))) {
        break forest_join_770;
    }
    if (!((life6_5 == null))) {
        continue forest_cycle_741;
    }
    break forest_cycle_741;
    }
    }
    life11_743 += 1;
    }
    if (!((life6_5 == null))) {
        continue forest_cycle_730;
    }
    break forest_cycle_730;
    }
    }
    ((moom.H0)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.r)).a__fE())), ((int)(0)), ((int)(2)), ((int)(1)), ((moom.G2)(p2)));
    ((moom.H0)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.r)).a__fE())), ((int)(0)), ((int)(2)), ((int)(4)), ((moom.G2)(p2)));
    ((moom.H0)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a9)).a__fE())), ((int)(0)), ((int)(2)), ((int)(2)), ((moom.G2)(p2)));
    ((moom.H0)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a9)).a__fE())), ((int)(0)), ((int)(2)), ((int)(3)), ((moom.G2)(p2)));
    ((moom.H0)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.r)).a__fE())), ((int)(4)), ((int)(2)), ((int)(0)), ((moom.G2)(p2)));
    ((moom.H0)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a9)).a__fE())), ((int)(5)), ((int)(2)), ((int)(0)), ((moom.G2)(p2)));
    ((moom.H0)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.r)).a__fE())), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic666_226(32542, (7544164183662680343L ^ life4_3)))), ((int)(2)), ((int)(0)), ((moom.G2)(p2)));
    ((moom.H0)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.r)).a__fE())), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic666_230(13627, (1843455956160451381L ^ life4_3)))), ((int)(2)), ((int)(1)), ((moom.G2)(p2)));
    ((moom.H0)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a9)).a__fE())), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic666_234(13627, (1843455956160451381L ^ life4_3)))), ((int)(2)), ((int)(2)), ((moom.G2)(p2)));
    ((moom.H0)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a9)).a__fE())), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic666_238(13627, (1843455956160451381L ^ life4_3)))), ((int)(2)), ((int)(3)), ((moom.G2)(p2)));
    ((moom.H0)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.r)).a__fE())), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic666_242(13627, (1843455956160451381L ^ life4_3)))), ((int)(2)), ((int)(4)), ((moom.G2)(p2)));
    ((moom.H0)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic666_246(13627, (1843455956160451381L ^ life4_3)))), ((int)(2)), ((int)(5)), ((moom.G2)(p2)));
    ((moom.H0)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.r)).a__fE())), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic666_250(13627, (1843455956160451381L ^ life4_3)))), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic666_251(32542, (7544164183662680343L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.H0)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a9)).a__fE())), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic666_255(13627, (1843455956160451381L ^ life4_3)))), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic666_256(9687, (1993925343845319640L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.H0)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a9)).a__fE())), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic666_260(13627, (1843455956160451381L ^ life4_3)))), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic666_261(13627, (1843455956160451381L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.H0)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.r)).a__fE())), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic666_265(13627, (1843455956160451381L ^ life4_3)))), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic666_266(8579, (6102288560468133763L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.H0)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.r)).a__fE())), ((int)(2)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic666_270(32542, (7544164183662680343L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.H0)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a9)).a__fE())), ((int)(2)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic666_274(9687, (1993925343845319640L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.H0)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a9)).a__fE())), ((int)(2)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic666_278(13627, (1843455956160451381L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.H0)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.r)).a__fE())), ((int)(2)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic666_282(8579, (6102288560468133763L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.H0)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.r)).a__fE())), ((int)(4)), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic666_286(29864, (526297904544436907L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.H0)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a9)).a__fE())), ((int)(5)), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic666_290(29864, (526297904544436907L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.H0)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.r)).a__fE())), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic666_294(32542, (7544164183662680343L ^ life4_3)))), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic666_295(29864, (526297904544436907L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.H0)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((int)(5)), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic666_299(29864, (526297904544436907L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.H0)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((int)(2)), ((int)(1)), ((int)(0)), ((moom.G2)(p2)));
    ((moom.H0)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((int)(2)), ((int)(2)), ((int)(0)), ((moom.G2)(p2)));
    ((moom.H0)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aa)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.eA.Q)), ((java.lang.Comparable)(((moom.H0)(this)).b))))), ((int)(2)), ((int)(3)), ((int)(1)), ((moom.G2)(p2)));
    ((moom.H0)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((java.util.Random)(p1)), ((int)(2)), ((int)(1)), ((int)(0)), ((moom.bs)(moom.bs.b(((int)(((moom.H0)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ao)), ((int)(1)))))))));
    ((moom.H0)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(0)), ((int)(-1)), ((int)(3)), ((int)(2)), ((int)(-1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((boolean)(false)));
    spill666_10 = ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((moom.H0)(this)).a(((net.minecraft.world.World)(p0)), ((int)(2)), ((int)(0)), ((int)(-1)), ((moom.G2)(p2))))).a__ch())).a__fn();
    spill666_11 = moom.fn.a;
    if (!((life6_5 != null))) {
        forestValue666_1164_0 = spill666_10;
        forestValue666_1164_1 = spill666_11;
        break forest_join_1164;
    }
    if (!((spill666_10 == spill666_11))) {
        break forest_join_1178;
    }
    spill666_12 = this;
    spill666_13 = p0;
    if (!((life6_5 != null))) {
        forestValue666_1167_0 = spill666_12;
        forestValue666_1167_1 = spill666_13;
        break forest_join_1167;
    }
    forestValue666_1164_0 = ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((moom.H0)(spill666_12)).a(((net.minecraft.world.World)(spill666_13)), ((int)(2)), ((int)(-1)), ((int)(-1)), ((moom.G2)(p2))))).a__ch())).a__fn();
    forestValue666_1164_1 = moom.fn.a;
    }
    if (!((forestValue666_1164_0 != forestValue666_1164_1))) {
        break forest_join_1178;
    }
    forestValue666_1167_0 = this;
    forestValue666_1167_1 = p0;
    }
    ((moom.H0)(forestValue666_1167_0)).a(((net.minecraft.world.World)(forestValue666_1167_1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aw)).b__fE(((int)(((moom.H0)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aw)), ((int)(3)))))))), ((int)(2)), ((int)(0)), ((int)(-1)), ((moom.G2)(p2)));
    }
    forestValue666_1179_0 = 0;
    }
    life11_1198 = forestValue666_1179_0;
    forest_cycle_1180: while (true) {
    forest_join_1220: {
    forest_join_1219: {
    if (!((life11_1198 < 5))) {
        break forest_join_1222;
    }
    spill666_14 = 0;
    if (!((life6_5 != null))) {
        forestValue666_1223_0 = spill666_14;
        break forest_join_1223;
    }
    life12_1205 = spill666_14;
    forest_cycle_1187: while (true) {
    if (!((life12_1205 < __sourceIntrinsic_5ac1d031d896_invokedynamic666_335(8579, (6102288560468133763L ^ life4_3))))) {
        break forest_join_1219;
    }
    ((moom.H0)(this)).a__Void(((net.minecraft.world.World)(p0)), ((int)(life12_1205)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic666_336(9687, (1993925343845319640L ^ life4_3)))), ((int)(life11_1198)), ((moom.G2)(p2)));
    ((moom.H0)(this)).b(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((int)(life12_1205)), ((int)(-1)), ((int)(life11_1198)), ((moom.G2)(p2)));
    life12_1205 += 1;
    if (!((life6_5 != null))) {
        break forest_join_1220;
    }
    if (!((life6_5 == null))) {
        continue forest_cycle_1187;
    }
    break forest_cycle_1187;
    }
    }
    life11_1198 += 1;
    }
    if (!((life6_5 == null))) {
        continue forest_cycle_1180;
    }
    break forest_cycle_1180;
    }
    }
    forestValue666_1223_0 = 5;
    }
    life11_1243 = forestValue666_1223_0;
    forest_cycle_1224: while (true) {
    forest_join_1268: {
    forest_join_1267: {
    if (!((life11_1243 < __sourceIntrinsic_5ac1d031d896_invokedynamic666_341(19562, (7646455607948307046L ^ life4_3))))) {
        break forest_join_1270;
    }
    spill666_15 = 2;
    if (!((life6_5 != null))) {
        forestValue666_1279_0 = spill666_15;
        break forest_join_1279;
    }
    life12_1254 = spill666_15;
    forest_cycle_1235: while (true) {
    if (!((life12_1254 < __sourceIntrinsic_5ac1d031d896_invokedynamic666_342(8579, (6102288560468133763L ^ life4_3))))) {
        break forest_join_1267;
    }
    ((moom.H0)(this)).a__Void(((net.minecraft.world.World)(p0)), ((int)(life12_1254)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic666_343(9687, (1993925343845319640L ^ life4_3)))), ((int)(life11_1243)), ((moom.G2)(p2)));
    ((moom.H0)(this)).b(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((int)(life12_1254)), ((int)(-1)), ((int)(life11_1243)), ((moom.G2)(p2)));
    life12_1254 += 1;
    if (!((life6_5 != null))) {
        break forest_join_1268;
    }
    if (!((life6_5 == null))) {
        continue forest_cycle_1235;
    }
    break forest_cycle_1235;
    }
    }
    life11_1243 += 1;
    }
    if (!((life6_5 == null))) {
        continue forest_cycle_1224;
    }
    break forest_cycle_1224;
    }
    }
    ((moom.H0)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(4)), ((int)(1)), ((int)(2)), ((int)(2)));
    forestValue666_1279_0 = 1;
    }
    return ((forestValue666_1279_0) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public static moom.H0 a(moom.H6 p0, java.util.List<moom.G4> p1, java.util.Random p2, int p3, int p4, int p5, moom.bs p6, int p7) {
moom.H0 forwardValue2045_45_0;
    long life8_3;
    moom.G2 life10_27;
    forward_join_45: {
    forward_join_44: {
    life8_3 = (moom.H0.h ^ 17708092420167L);
    life10_27 = moom.G2.a(((int)(p3)), ((int)(p4)), ((int)(p5)), ((int)(0)), ((int)(0)), ((int)(0)), ((int)(__sourceIntrinsic_ece1ace01e7e_invokedynamic2045_1(17159, (4498460371963426873L ^ life8_3)))), ((int)(__sourceIntrinsic_ece1ace01e7e_invokedynamic2045_2(14760, (5525904754482102942L ^ life8_3)))), ((int)(__sourceIntrinsic_ece1ace01e7e_invokedynamic2045_3(22155, (635475382920129977L ^ life8_3)))), ((moom.bs)(p6)));
    if (!(moom.H0.a(((moom.G2)(life10_27))))) {
        break forward_join_44;
    }
    if (!((moom.G4.a(((java.util.List)(p1)), ((moom.G2)(life10_27))) == null))) {
        break forward_join_44;
    }
    forwardValue2045_45_0 = new moom.H0(p0, p7, p2, life10_27, p6);
    break forward_join_45;
    }
    forwardValue2045_45_0 = null;
    }
    return forwardValue2045_45_0;
}


private static native <E extends Throwable> int __sourceIntrinsic_ece1ace01e7e_invokedynamic2045_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ece1ace01e7e_invokedynamic2045_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ece1ace01e7e_invokedynamic2045_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic666_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic666_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic666_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic666_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic666_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic666_27(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic666_28(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic666_34(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic666_45(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic666_46(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic666_47(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic666_53(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic666_64(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic666_65(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic666_71(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic666_72(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic666_73(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic666_79(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic666_90(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic666_101(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic666_115(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic666_119(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic666_123(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic666_129(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic666_136(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic666_142(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic666_143(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic666_144(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic666_150(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic666_156(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic666_157(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic666_158(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic666_164(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic666_165(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic666_166(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic666_176(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic666_178(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic666_179(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic666_187(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic666_188(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic666_192(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic666_196(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic666_197(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic666_199(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic666_200(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic666_201(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic666_204(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic666_226(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic666_230(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic666_234(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic666_238(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic666_242(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic666_246(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic666_250(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic666_251(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic666_255(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic666_256(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic666_260(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic666_261(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic666_265(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic666_266(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic666_270(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic666_274(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic666_278(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic666_282(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic666_286(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic666_290(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic666_294(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic666_295(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic666_299(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic666_335(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic666_336(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic666_341(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic666_342(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic666_343(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4709_0() throws E;
}
