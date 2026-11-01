package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class HX extends moom.HT {

private static final long h;

private static final long[] i;

private static final java.lang.Integer[] j;

private static final java.util.Map k;

public HX() {
super();
}


public HX(moom.H6 p0, int p1, java.util.Random p2, moom.G2 p3, moom.bs p4) {
super(p0, p1);
    this.b = p4;
    this.a = p3;
}


static {
h = ((long)(((moom._a)(moom._c.a(((long)(-7418510457092056606L)), ((long)(-1362250435886402428L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(211962508329724L)))));
    k = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.HX.h ^ 128975788511320L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill825_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill825_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill825_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill825_14 = new byte[8];
    (__sourceSpill825_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill825_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation825_16 = __sourceSpill825_14;
    ((javax.crypto.Cipher)(__sourceSpill825_11)).init(((int)(__sourceSpill825_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill825_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation825_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[11];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "H}t×ÚtÔ£Îr@·e((ß¾!Gw\rMÖ§÷]]Lc ½àâi\030\0162g¥kÑÒì§RWi\013 u»ØÞ}ý°\023GYI©ÐÌË²"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill825_25 = local6_life21;
        int __sourceSpill825_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill825_25)).substring(((int)(__sourceSpill825_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill825_30 = local8_life19;
        int __sourceSpill825_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill825_33 = new byte[8];
        (__sourceSpill825_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill825_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill825_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill825_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill825_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill825_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill825_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill825_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill825_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill825_34)).doFinal(((byte[])(__sourceSpill825_33)));
        (__sourceSpill825_30)[__sourceSpill825_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "\030ýí®j\021Í\f\013ÖtXÞ\026;É"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill825_38 = local6_life21;
        int __sourceSpill825_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill825_38)).substring(((int)(__sourceSpill825_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill825_43 = local8_life19;
        int __sourceSpill825_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill825_46 = new byte[8];
        (__sourceSpill825_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill825_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill825_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill825_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill825_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill825_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill825_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill825_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill825_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill825_47)).doFinal(((byte[])(__sourceSpill825_46)));
        (__sourceSpill825_43)[__sourceSpill825_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    i = ((long[])(local8_life19));
    j = ((java.lang.Integer[])(new java.lang.Integer[11]));
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.HX.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x623B;
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
                throw new RuntimeException("moom/HX", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            HX.j[n2] = n3;
        }
        return j[n2];
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4795_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/HX"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


protected int c(int p0, int p1) {
int forwardValue2106_11_0;
    int forwardValue2106_16_0;
    int spill2106_0;
    long life3_3;
    net.minecraft.entity.Entity[] life5_5;
    forward_join_16: {
    forward_join_12: {
    forward_join_11: {
    life3_3 = (moom.HX.h ^ 27421420164899L);
    life5_5 = moom.G4.b();
    spill2106_0 = p0;
    if (!((life5_5 != null))) {
        forwardValue2106_11_0 = spill2106_0;
        break forward_join_11;
    }
    if (!((spill2106_0 == 0))) {
        break forward_join_12;
    }
    forwardValue2106_11_0 = 4;
    }
    forwardValue2106_16_0 = forwardValue2106_11_0;
    break forward_join_16;
    }
    forwardValue2106_16_0 = super.c(((int)(p0)), ((int)(p1)));
    }
    return forwardValue2106_16_0;
}


public boolean a__Boolean(net.minecraft.world.World p0, java.util.Random p1, moom.G2 p2) {
moom.HX lexicalValue747_25_0;
    int lexicalValue747_452_0;
    moom.HX lexicalValue747_863_0;
    net.minecraft.world.World lexicalValue747_863_1;
    int lexicalValue747_879_0;
    int lexicalValue747_931_0;
    int spill747_0;
    moom.HX spill747_1;
    int spill747_2;
    moom.HX spill747_3;
    net.minecraft.world.World spill747_4;
    moom.HX spill747_5;
    net.minecraft.world.World spill747_6;
    int spill747_7;
    long life4_3;
    net.minecraft.entity.Entity[] life6_5;
    int life7_463;
    int life8_468;
    int life9_470;
    int life10_477;
    int life9_905;
    int life10_912;
    lexical_join_931: {
    lexical_join_922: {
    lexical_join_879: {
    lexical_join_863: {
    lexical_join_817: {
    lexical_join_508: {
    lexical_join_452: {
    lexical_join_43: {
    lexical_join_25: {
    lexical_join_24: {
    life4_3 = (moom.HX.h ^ 85258491453606L);
    life6_5 = moom.G4.b();
    spill747_0 = ((moom.HX)(this)).e;
    if (!((life6_5 != null))) {
        lexicalValue747_452_0 = spill747_0;
        break lexical_join_452;
    }
    if (!((spill747_0 < 0))) {
        break lexical_join_43;
    }
    ((moom.HX)(this)).e = ((int)(((moom.HX)(this)).a__sourceReturn_6a83d276d7(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)))));
    spill747_1 = this;
    if (!((life6_5 != null))) {
        lexicalValue747_25_0 = spill747_1;
        break lexical_join_25;
    }
    if (!((((moom.HX)(spill747_1)).e < 0))) {
        break lexical_join_24;
    }
    return ((1) != 0);
    }
    lexicalValue747_25_0 = this;
    }
    ((moom.G2)(((moom.HX)(lexicalValue747_25_0)).a)).a(((int)(0)), ((int)((((((moom.HX)(this)).e - ((moom.G2)(((moom.HX)(this)).a)).e) + __sourceIntrinsic_5ac1d031d896_invokedynamic747_11(22622, (1596435624734513485L ^ life4_3))) - 1))), ((int)(0)));
    }
    ((moom.HX)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(1)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic747_13(22622, (1596435624734513485L ^ life4_3)))), ((int)(4)), ((int)(4)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((boolean)(false)));
    ((moom.HX)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(2)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic747_19(30193, (2806289511669986531L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic747_20(19168, (7646887377412180984L ^ life4_3)))), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic747_21(20456, (876747435859431154L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((boolean)(false)));
    ((moom.HX)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(2)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic747_27(32122, (3506228534933519471L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic747_28(25691, (4925808778543883596L ^ life4_3)))), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic747_29(9316, (3692627250368226674L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.d)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.d)).a__fE())), ((boolean)(false)));
    ((moom.HX)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic747_37(32122, (3506228534933519471L ^ life4_3)))), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic747_38(32122, (3506228534933519471L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.HX)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(2)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic747_40(32122, (3506228534933519471L ^ life4_3)))), ((int)(2)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic747_41(9316, (3692627250368226674L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aO)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aO)).a__fE())), ((boolean)(false)));
    ((moom.HX)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic747_47(25691, (4925808778543883596L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic747_48(32122, (3506228534933519471L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic747_49(25691, (4925808778543883596L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic747_50(9316, (3692627250368226674L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aO)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aO)).a__fE())), ((boolean)(false)));
    ((moom.HX)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(3)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic747_56(9316, (3692627250368226674L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic747_57(22622, (1596435624734513485L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic747_58(9316, (3692627250368226674L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aO)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aO)).a__fE())), ((boolean)(false)));
    ((moom.HX)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(0)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic747_64(22622, (1596435624734513485L ^ life4_3)))), ((int)(0)), ((int)(4)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((boolean)(false)));
    ((moom.HX)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(0)), ((int)(0)), ((int)(0)), ((int)(3)), ((int)(5)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((boolean)(false)));
    ((moom.HX)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic747_75(25691, (4925808778543883596L ^ life4_3)))), ((int)(0)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic747_76(25691, (4925808778543883596L ^ life4_3)))), ((int)(3)), ((int)(5)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((boolean)(false)));
    ((moom.HX)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(0)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic747_82(22622, (1596435624734513485L ^ life4_3)))), ((int)(1)), ((int)(0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((boolean)(false)));
    ((moom.HX)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(0)), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic747_88(22622, (1596435624734513485L ^ life4_3)))), ((int)(1)), ((int)(5)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((boolean)(false)));
    ((moom.HX)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(2)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic747_94(22622, (1596435624734513485L ^ life4_3)))), ((int)(3)), ((int)(0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((boolean)(false)));
    ((moom.HX)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(2)), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic747_100(22622, (1596435624734513485L ^ life4_3)))), ((int)(3)), ((int)(5)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((boolean)(false)));
    ((moom.HX)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(4)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic747_106(25691, (4925808778543883596L ^ life4_3)))), ((int)(4)), ((int)(1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((boolean)(false)));
    ((moom.HX)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(4)), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic747_112(25691, (4925808778543883596L ^ life4_3)))), ((int)(4)), ((int)(4)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((boolean)(false)));
    ((moom.HX)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(5)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic747_118(25691, (4925808778543883596L ^ life4_3)))), ((int)(5)), ((int)(3)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((boolean)(false)));
    ((moom.HX)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((int)(0)), ((int)(4)), ((int)(2)), ((moom.G2)(p2)));
    ((moom.HX)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((int)(0)), ((int)(4)), ((int)(3)), ((moom.G2)(p2)));
    ((moom.HX)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic747_132(25691, (4925808778543883596L ^ life4_3)))), ((int)(4)), ((int)(2)), ((moom.G2)(p2)));
    ((moom.HX)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic747_136(25691, (4925808778543883596L ^ life4_3)))), ((int)(4)), ((int)(3)), ((moom.G2)(p2)));
    lexicalValue747_452_0 = ((moom.HX)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ad)), ((int)(3)));
    }
    life7_463 = lexicalValue747_452_0;
    life8_468 = ((moom.HX)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ad)), ((int)(2)));
    life9_470 = -1;
    lexical_cycle_460: while (true) {
    lexical_join_506: {
    lexical_join_505: {
    if (!((life9_470 <= 2))) {
        break lexical_join_508;
    }
    spill747_2 = 0;
    if (!((life6_5 != null))) {
        lexicalValue747_879_0 = spill747_2;
        break lexical_join_879;
    }
    life10_477 = spill747_2;
    lexical_cycle_467: while (true) {
    if (!((life10_477 <= __sourceIntrinsic_5ac1d031d896_invokedynamic747_142(25691, (4925808778543883596L ^ life4_3))))) {
        break lexical_join_505;
    }
    ((moom.HX)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ad)).b__fE(((int)(life7_463))))), ((int)(life10_477)), ((int)((4 + life9_470))), ((int)(life9_470)), ((moom.G2)(p2)));
    ((moom.HX)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ad)).b__fE(((int)(life8_468))))), ((int)(life10_477)), ((int)((4 + life9_470))), ((int)((5 - life9_470))), ((moom.G2)(p2)));
    life10_477 += 1;
    if (!((life6_5 != null))) {
        break lexical_join_506;
    }
    if (!((life6_5 == null))) { continue lexical_cycle_467; }
    break lexical_cycle_467;
    }
    }
    life9_470 += 1;
    }
    if (!((life6_5 == null))) { continue lexical_cycle_460; }
    break lexical_cycle_460;
    }
    }
    ((moom.HX)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.r)).a__fE())), ((int)(0)), ((int)(2)), ((int)(1)), ((moom.G2)(p2)));
    ((moom.HX)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.r)).a__fE())), ((int)(0)), ((int)(2)), ((int)(4)), ((moom.G2)(p2)));
    ((moom.HX)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.r)).a__fE())), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic747_157(25691, (4925808778543883596L ^ life4_3)))), ((int)(2)), ((int)(1)), ((moom.G2)(p2)));
    ((moom.HX)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.r)).a__fE())), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic747_161(25691, (4925808778543883596L ^ life4_3)))), ((int)(2)), ((int)(4)), ((moom.G2)(p2)));
    ((moom.HX)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a9)).a__fE())), ((int)(0)), ((int)(2)), ((int)(2)), ((moom.G2)(p2)));
    ((moom.HX)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a9)).a__fE())), ((int)(0)), ((int)(2)), ((int)(3)), ((moom.G2)(p2)));
    ((moom.HX)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a9)).a__fE())), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic747_171(25691, (4925808778543883596L ^ life4_3)))), ((int)(2)), ((int)(2)), ((moom.G2)(p2)));
    ((moom.HX)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a9)).a__fE())), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic747_175(25691, (4925808778543883596L ^ life4_3)))), ((int)(2)), ((int)(3)), ((moom.G2)(p2)));
    ((moom.HX)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a9)).a__fE())), ((int)(2)), ((int)(2)), ((int)(5)), ((moom.G2)(p2)));
    ((moom.HX)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a9)).a__fE())), ((int)(3)), ((int)(2)), ((int)(5)), ((moom.G2)(p2)));
    ((moom.HX)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a9)).a__fE())), ((int)(5)), ((int)(2)), ((int)(0)), ((moom.G2)(p2)));
    ((moom.HX)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a9)).a__fE())), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic747_188(32122, (3506228534933519471L ^ life4_3)))), ((int)(2)), ((int)(5)), ((moom.G2)(p2)));
    ((moom.HX)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aO)).a__fE())), ((int)(2)), ((int)(1)), ((int)(3)), ((moom.G2)(p2)));
    ((moom.HX)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aB)).a__fE())), ((int)(2)), ((int)(2)), ((int)(3)), ((moom.G2)(p2)));
    ((moom.HX)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((int)(1)), ((int)(1)), ((int)(4)), ((moom.G2)(p2)));
    ((moom.HX)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ad)).b__fE(((int)(((moom.HX)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ad)), ((int)(3)))))))), ((int)(2)), ((int)(1)), ((int)(4)), ((moom.G2)(p2)));
    ((moom.HX)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ad)).b__fE(((int)(((moom.HX)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ad)), ((int)(1)))))))), ((int)(1)), ((int)(1)), ((int)(3)), ((moom.G2)(p2)));
    ((moom.HX)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(5)), ((int)(0)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic747_209(22622, (1596435624734513485L ^ life4_3)))), ((int)(0)), ((int)(3)), ((net.minecraft.block.state.IBlockState)(((moom.ei)(net.minecraft.init.Blocks.T)).a__fE())), ((net.minecraft.block.state.IBlockState)(((moom.ei)(net.minecraft.init.Blocks.T)).a__fE())), ((boolean)(false)));
    ((moom.HX)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((moom.ei)(net.minecraft.init.Blocks.T)).a__fE())), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic747_217(32122, (3506228534933519471L ^ life4_3)))), ((int)(1)), ((int)(1)), ((moom.G2)(p2)));
    ((moom.HX)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((moom.ei)(net.minecraft.init.Blocks.T)).a__fE())), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic747_221(32122, (3506228534933519471L ^ life4_3)))), ((int)(1)), ((int)(2)), ((moom.G2)(p2)));
    ((moom.HX)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((int)(2)), ((int)(1)), ((int)(0)), ((moom.G2)(p2)));
    ((moom.HX)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((int)(2)), ((int)(2)), ((int)(0)), ((moom.G2)(p2)));
    ((moom.HX)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aa)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.eA.Q)), ((java.lang.Comparable)(((moom.HX)(this)).b))))), ((int)(2)), ((int)(3)), ((int)(1)), ((moom.G2)(p2)));
    ((moom.HX)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((java.util.Random)(p1)), ((int)(2)), ((int)(1)), ((int)(0)), ((moom.bs)(moom.bs.b(((int)(((moom.HX)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ao)), ((int)(1)))))))));
    spill747_3 = this;
    spill747_4 = p0;
    if (!((life6_5 != null))) {
        lexicalValue747_863_0 = spill747_3;
        lexicalValue747_863_1 = spill747_4;
        break lexical_join_863;
    }
    if (!((((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((moom.HX)(spill747_3)).a(((net.minecraft.world.World)(spill747_4)), ((int)(2)), ((int)(0)), ((int)(-1)), ((moom.G2)(p2))))).a__ch())).a__fn() == moom.fn.a))) {
        break lexical_join_817;
    }
    spill747_5 = this;
    spill747_6 = p0;
    if (!((life6_5 != null))) {
        lexicalValue747_863_0 = spill747_5;
        lexicalValue747_863_1 = spill747_6;
        break lexical_join_863;
    }
    if (!((((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((moom.HX)(spill747_5)).a(((net.minecraft.world.World)(spill747_6)), ((int)(2)), ((int)(-1)), ((int)(-1)), ((moom.G2)(p2))))).a__ch())).a__fn() != moom.fn.a))) {
        break lexical_join_817;
    }
    ((moom.HX)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aw)).b__fE(((int)(((moom.HX)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aw)), ((int)(3)))))))), ((int)(2)), ((int)(0)), ((int)(-1)), ((moom.G2)(p2)));
    }
    ((moom.HX)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic747_254(32122, (3506228534933519471L ^ life4_3)))), ((int)(1)), ((int)(5)), ((moom.G2)(p2)));
    ((moom.HX)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic747_258(32122, (3506228534933519471L ^ life4_3)))), ((int)(2)), ((int)(5)), ((moom.G2)(p2)));
    ((moom.HX)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aa)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.eA.Q)), ((java.lang.Comparable)(((moom.bs)(((moom.HX)(this)).b)).a__bs()))))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic747_266(32122, (3506228534933519471L ^ life4_3)))), ((int)(3)), ((int)(4)), ((moom.G2)(p2)));
    lexicalValue747_863_0 = this;
    lexicalValue747_863_1 = p0;
    }
    ((moom.HX)(lexicalValue747_863_0)).a(((net.minecraft.world.World)(lexicalValue747_863_1)), ((moom.G2)(p2)), ((java.util.Random)(p1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic747_268(32122, (3506228534933519471L ^ life4_3)))), ((int)(1)), ((int)(5)), ((moom.bs)(moom.bs.b(((int)(((moom.HX)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ao)), ((int)(1)))))))));
    lexicalValue747_879_0 = 0;
    }
    life9_905 = lexicalValue747_879_0;
    lexical_cycle_880: while (true) {
    lexical_join_920: {
    lexical_join_919: {
    if (!((life9_905 < 5))) {
        break lexical_join_922;
    }
    spill747_7 = 0;
    if (!((life6_5 != null))) {
        lexicalValue747_931_0 = spill747_7;
        break lexical_join_931;
    }
    life10_912 = spill747_7;
    lexical_cycle_887: while (true) {
    if (!((life10_912 < __sourceIntrinsic_5ac1d031d896_invokedynamic747_273(31005, (6479474423504566276L ^ life4_3))))) {
        break lexical_join_919;
    }
    ((moom.HX)(this)).a__Void(((net.minecraft.world.World)(p0)), ((int)(life10_912)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic747_274(22622, (1596435624734513485L ^ life4_3)))), ((int)(life9_905)), ((moom.G2)(p2)));
    ((moom.HX)(this)).b(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((int)(life10_912)), ((int)(-1)), ((int)(life9_905)), ((moom.G2)(p2)));
    life10_912 += 1;
    if (!((life6_5 != null))) {
        break lexical_join_920;
    }
    if (!((life6_5 == null))) { continue lexical_cycle_887; }
    break lexical_cycle_887;
    }
    }
    life9_905 += 1;
    }
    if (!((life6_5 == null))) { continue lexical_cycle_880; }
    break lexical_cycle_880;
    }
    }
    ((moom.HX)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(4)), ((int)(1)), ((int)(2)), ((int)(2)));
    lexicalValue747_931_0 = 1;
    }
    return ((lexicalValue747_931_0) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public static moom.HX a(moom.H6 p0, java.util.List<moom.G4> p1, java.util.Random p2, int p3, int p4, int p5, moom.bs p6, int p7) {
moom.HX forwardValue2104_45_0;
    long life8_3;
    moom.G2 life10_27;
    forward_join_45: {
    forward_join_44: {
    life8_3 = (moom.HX.h ^ 97930677681061L);
    life10_27 = moom.G2.a(((int)(p3)), ((int)(p4)), ((int)(p5)), ((int)(0)), ((int)(0)), ((int)(0)), ((int)(__sourceIntrinsic_57747978e225_invokedynamic2104_1(16020, (2404737792382674055L ^ life8_3)))), ((int)(__sourceIntrinsic_57747978e225_invokedynamic2104_2(22709, (2000957712595403431L ^ life8_3)))), ((int)(__sourceIntrinsic_57747978e225_invokedynamic2104_3(28579, (463761874859390388L ^ life8_3)))), ((moom.bs)(p6)));
    if (!(moom.HX.a(((moom.G2)(life10_27))))) {
        break forward_join_44;
    }
    if (!((moom.G4.a(((java.util.List)(p1)), ((moom.G2)(life10_27))) == null))) {
        break forward_join_44;
    }
    forwardValue2104_45_0 = new moom.HX(p0, p7, p2, life10_27, p6);
    break forward_join_45;
    }
    forwardValue2104_45_0 = null;
    }
    return forwardValue2104_45_0;
}


private static native <E extends Throwable> int __sourceIntrinsic_57747978e225_invokedynamic2104_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_57747978e225_invokedynamic2104_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_57747978e225_invokedynamic2104_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic747_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic747_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic747_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic747_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic747_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic747_27(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic747_28(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic747_29(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic747_37(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic747_38(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic747_40(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic747_41(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic747_47(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic747_48(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic747_49(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic747_50(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic747_56(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic747_57(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic747_58(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic747_64(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic747_75(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic747_76(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic747_82(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic747_88(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic747_94(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic747_100(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic747_106(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic747_112(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic747_118(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic747_132(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic747_136(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic747_142(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic747_157(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic747_161(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic747_171(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic747_175(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic747_188(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic747_209(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic747_217(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic747_221(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic747_254(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic747_258(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic747_266(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic747_268(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic747_273(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic747_274(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4795_0() throws E;
}
