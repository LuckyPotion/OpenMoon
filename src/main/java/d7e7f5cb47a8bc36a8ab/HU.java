package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class HU extends moom.HT {

private static final long h;

private static final long[] i;

private static final java.lang.Integer[] j;

private static final java.util.Map k;

public HU() {
super();
}


public HU(moom.H6 p0, int p1, java.util.Random p2, moom.G2 p3, moom.bs p4) {
super(p0, p1);
    this.b = p4;
    this.a = p3;
}


static {
h = ((long)(((moom._a)(moom._c.a(((long)(5088591940716738818L)), ((long)(8307001378624266896L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(209619044498764L)))));
    k = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.HU.h ^ 125314666900170L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill822_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill822_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill822_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill822_14 = new byte[8];
    (__sourceSpill822_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill822_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation822_16 = __sourceSpill822_14;
    ((javax.crypto.Cipher)(__sourceSpill822_11)).init(((int)(__sourceSpill822_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill822_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation822_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[14];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "\031VÌß ý*P¿¤ëN\016Ê{¡¯(+XÜ4ä\007·~µ\bÓ|N\030\0316ke(ë4Éd\017fºú¢uÔ`LL¤2èù´HP¬\017\036ÁþÆKÌû\0367B®\\'fîwA:\033©¦£p"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill822_25 = local6_life21;
        int __sourceSpill822_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill822_25)).substring(((int)(__sourceSpill822_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill822_30 = local8_life19;
        int __sourceSpill822_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill822_33 = new byte[8];
        (__sourceSpill822_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill822_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill822_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill822_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill822_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill822_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill822_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill822_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill822_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill822_34)).doFinal(((byte[])(__sourceSpill822_33)));
        (__sourceSpill822_30)[__sourceSpill822_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "ç&x\024Øô[1íôûjÃ"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill822_38 = local6_life21;
        int __sourceSpill822_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill822_38)).substring(((int)(__sourceSpill822_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill822_43 = local8_life19;
        int __sourceSpill822_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill822_46 = new byte[8];
        (__sourceSpill822_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill822_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill822_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill822_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill822_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill822_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill822_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill822_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill822_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill822_47)).doFinal(((byte[])(__sourceSpill822_46)));
        (__sourceSpill822_43)[__sourceSpill822_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    i = ((long[])(local8_life19));
    j = ((java.lang.Integer[])(new java.lang.Integer[14]));
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.HU.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x5CD7;
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
                throw new RuntimeException("moom/HU", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            HU.j[n2] = n3;
        }
        return j[n2];
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4784_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/HU"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


protected int c(int p0, int p1) {
return 2;
}


public boolean a__Boolean(net.minecraft.world.World p0, java.util.Random p1, moom.G2 p2) {
moom.HU lexicalValue744_25_0;
    int lexicalValue744_738_0;
    moom.fn lexicalValue744_819_0;
    moom.fn lexicalValue744_819_1;
    moom.HU lexicalValue744_822_0;
    net.minecraft.world.World lexicalValue744_822_1;
    int lexicalValue744_886_0;
    int spill744_0;
    moom.HU spill744_1;
    moom.fn spill744_2;
    moom.fn spill744_3;
    moom.HU spill744_4;
    net.minecraft.world.World spill744_5;
    int spill744_6;
    long life4_3;
    net.minecraft.entity.Entity[] life6_5;
    int life7_749;
    int life8_751;
    int life8_860;
    int life9_871;
    lexical_join_886: {
    lexical_join_877: {
    lexical_join_833: {
    lexical_join_822: {
    lexical_join_819: {
    lexical_join_794: {
    lexical_join_763: {
    lexical_join_738: {
    lexical_join_43: {
    lexical_join_25: {
    lexical_join_24: {
    life4_3 = (moom.HU.h ^ 97032568477120L);
    life6_5 = moom.G4.b();
    spill744_0 = ((moom.HU)(this)).e;
    if (!((life6_5 != null))) {
        lexicalValue744_738_0 = spill744_0;
        break lexical_join_738;
    }
    if (!((spill744_0 < 0))) {
        break lexical_join_43;
    }
    ((moom.HU)(this)).e = ((int)(((moom.HU)(this)).a__sourceReturn_6a83d276d7(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)))));
    spill744_1 = this;
    if (!((life6_5 != null))) {
        lexicalValue744_25_0 = spill744_1;
        break lexical_join_25;
    }
    if (!((((moom.HU)(spill744_1)).e < 0))) {
        break lexical_join_24;
    }
    return ((1) != 0);
    }
    lexicalValue744_25_0 = this;
    }
    ((moom.G2)(((moom.HU)(lexicalValue744_25_0)).a)).a(((int)(0)), ((int)((((((moom.HU)(this)).e - ((moom.G2)(((moom.HU)(this)).a)).e) + __sourceIntrinsic_5ac1d031d896_invokedynamic744_11(6296, (2857879744327329637L ^ life4_3))) - 1))), ((int)(0)));
    }
    ((moom.HU)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(1)), ((int)(1)), ((int)(3)), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic744_13(12812, (780256043105095162L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((boolean)(false)));
    ((moom.HU)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(5)), ((int)(1)), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic744_19(17132, (3519328529926192404L ^ life4_3)))), ((int)(3)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((boolean)(false)));
    ((moom.HU)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(0)), ((int)(0)), ((int)(3)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic744_25(25775, (5461901360530971477L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((boolean)(false)));
    ((moom.HU)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(1)), ((int)(0)), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic744_31(32222, (7626532889436340782L ^ life4_3)))), ((int)(0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((boolean)(false)));
    ((moom.HU)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(1)), ((int)(1)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic744_37(16473, (517277740396838821L ^ life4_3)))), ((int)(3)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((boolean)(false)));
    ((moom.HU)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(4)), ((int)(1)), ((int)(1)), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic744_43(16473, (517277740396838821L ^ life4_3)))), ((int)(3)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((boolean)(false)));
    ((moom.HU)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(0)), ((int)(4)), ((int)(0)), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic744_49(21741, (4285256848025283346L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((boolean)(false)));
    ((moom.HU)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(4)), ((int)(0)), ((int)(4)), ((int)(4)), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic744_55(21741, (4285256848025283346L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((boolean)(false)));
    ((moom.HU)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic744_61(23975, (1696941262094983766L ^ life4_3)))), ((int)(3)), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic744_62(23975, (1696941262094983766L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((boolean)(false)));
    ((moom.HU)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(5)), ((int)(4)), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic744_68(16473, (517277740396838821L ^ life4_3)))), ((int)(4)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((boolean)(false)));
    ((moom.HU)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(5)), ((int)(5)), ((int)(3)), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic744_74(21741, (4285256848025283346L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((boolean)(false)));
    ((moom.HU)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic744_80(21321, (4410214756024904893L ^ life4_3)))), ((int)(0)), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic744_81(21321, (4410214756024904893L ^ life4_3)))), ((int)(4)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((boolean)(false)));
    ((moom.HU)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(4)), ((int)(0)), ((int)(4)), ((int)(4)), ((int)(4)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((boolean)(false)));
    ((moom.HU)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic744_94(17064, (1140588056835587411L ^ life4_3)))), ((int)(2)), ((moom.G2)(p2)));
    ((moom.HU)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic744_98(25563, (2723414163038362661L ^ life4_3)))), ((int)(2)), ((moom.G2)(p2)));
    ((moom.HU)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic744_102(25563, (2723414163038362661L ^ life4_3)))), ((int)(0)), ((moom.G2)(p2)));
    ((moom.HU)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic744_106(25563, (2723414163038362661L ^ life4_3)))), ((int)(4)), ((moom.G2)(p2)));
    ((moom.HU)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((int)(1)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic744_110(10355, (7677666067290134410L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.HU)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((int)(1)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic744_114(21741, (4285256848025283346L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.HU)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((int)(2)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic744_118(21741, (4285256848025283346L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.HU)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((int)(3)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic744_122(28826, (5519567870404153199L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.HU)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((int)(3)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic744_126(21741, (4285256848025283346L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.HU)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aw)).b__fE(((int)(((moom.HU)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aw)), ((int)(3)))))))), ((int)(1)), ((int)(1)), ((int)(5)), ((moom.G2)(p2)));
    ((moom.HU)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aw)).b__fE(((int)(((moom.HU)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aw)), ((int)(3)))))))), ((int)(2)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic744_137(28826, (5519567870404153199L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.HU)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aw)).b__fE(((int)(((moom.HU)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aw)), ((int)(3)))))))), ((int)(3)), ((int)(1)), ((int)(5)), ((moom.G2)(p2)));
    ((moom.HU)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aw)).b__fE(((int)(((moom.HU)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aw)), ((int)(1)))))))), ((int)(1)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic744_148(21741, (4285256848025283346L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.HU)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aw)).b__fE(((int)(((moom.HU)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aw)), ((int)(0)))))))), ((int)(3)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic744_154(21741, (4285256848025283346L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.HU)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a9)).a__fE())), ((int)(0)), ((int)(2)), ((int)(2)), ((moom.G2)(p2)));
    ((moom.HU)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a9)).a__fE())), ((int)(0)), ((int)(3)), ((int)(2)), ((moom.G2)(p2)));
    ((moom.HU)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a9)).a__fE())), ((int)(4)), ((int)(2)), ((int)(2)), ((moom.G2)(p2)));
    ((moom.HU)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a9)).a__fE())), ((int)(4)), ((int)(3)), ((int)(2)), ((moom.G2)(p2)));
    ((moom.HU)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a9)).a__fE())), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic744_170(28826, (5519567870404153199L ^ life4_3)))), ((int)(2)), ((moom.G2)(p2)));
    ((moom.HU)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a9)).a__fE())), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic744_174(21741, (4285256848025283346L ^ life4_3)))), ((int)(2)), ((moom.G2)(p2)));
    ((moom.HU)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a9)).a__fE())), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic744_178(28826, (5519567870404153199L ^ life4_3)))), ((int)(2)), ((moom.G2)(p2)));
    ((moom.HU)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a9)).a__fE())), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic744_182(21741, (4285256848025283346L ^ life4_3)))), ((int)(2)), ((moom.G2)(p2)));
    ((moom.HU)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a9)).a__fE())), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic744_186(28826, (5519567870404153199L ^ life4_3)))), ((int)(0)), ((moom.G2)(p2)));
    ((moom.HU)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a9)).a__fE())), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic744_190(21741, (4285256848025283346L ^ life4_3)))), ((int)(0)), ((moom.G2)(p2)));
    ((moom.HU)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a9)).a__fE())), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic744_194(28826, (5519567870404153199L ^ life4_3)))), ((int)(4)), ((moom.G2)(p2)));
    ((moom.HU)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a9)).a__fE())), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic744_198(21741, (4285256848025283346L ^ life4_3)))), ((int)(4)), ((moom.G2)(p2)));
    ((moom.HU)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a9)).a__fE())), ((int)(0)), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic744_202(28826, (5519567870404153199L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.HU)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a9)).a__fE())), ((int)(4)), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic744_206(28826, (5519567870404153199L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.HU)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a9)).a__fE())), ((int)(2)), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic744_210(23975, (1696941262094983766L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.HU)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aa)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.eA.Q)), ((java.lang.Comparable)(((moom.bs)(((moom.HU)(this)).b)).a__bs()))))), ((int)(2)), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic744_218(21741, (4285256848025283346L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.HU)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aa)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.eA.Q)), ((java.lang.Comparable)(((moom.bs)(((moom.HU)(this)).b)).b__bs()))))), ((int)(1)), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic744_226(28826, (5519567870404153199L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.HU)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aa)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.eA.Q)), ((java.lang.Comparable)(((moom.bs)(((moom.HU)(this)).b)).e__bs()))))), ((int)(3)), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic744_234(28826, (5519567870404153199L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.HU)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aa)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.eA.Q)), ((java.lang.Comparable)(((moom.HU)(this)).b))))), ((int)(2)), ((int)(4)), ((int)(5)), ((moom.G2)(p2)));
    lexicalValue744_738_0 = ((moom.HU)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.au)), ((int)(4)));
    }
    life7_749 = lexicalValue744_738_0;
    life8_751 = 1;
    lexical_cycle_741: while (true) {
    if (!((life8_751 <= __sourceIntrinsic_5ac1d031d896_invokedynamic744_244(21321, (4410214756024904893L ^ life4_3))))) {
        break lexical_join_763;
    }
    ((moom.HU)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.au)).b__fE(((int)(life7_749))))), ((int)(3)), ((int)(life8_751)), ((int)(3)), ((moom.G2)(p2)));
    life8_751 += 1;
    if (!((life6_5 != null))) {
        break lexical_join_794;
    }
    if (!((life6_5 == null))) { continue lexical_cycle_741; }
    break lexical_cycle_741;
    }
    }
    ((moom.HU)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((int)(2)), ((int)(1)), ((int)(0)), ((moom.G2)(p2)));
    ((moom.HU)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((int)(2)), ((int)(2)), ((int)(0)), ((moom.G2)(p2)));
    ((moom.HU)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((java.util.Random)(p1)), ((int)(2)), ((int)(1)), ((int)(0)), ((moom.bs)(moom.bs.b(((int)(((moom.HU)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ao)), ((int)(1)))))))));
    }
    spill744_2 = ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((moom.HU)(this)).a(((net.minecraft.world.World)(p0)), ((int)(2)), ((int)(0)), ((int)(-1)), ((moom.G2)(p2))))).a__ch())).a__fn();
    spill744_3 = moom.fn.a;
    if (!((life6_5 != null))) {
        lexicalValue744_819_0 = spill744_2;
        lexicalValue744_819_1 = spill744_3;
        break lexical_join_819;
    }
    if (!((spill744_2 == spill744_3))) {
        break lexical_join_833;
    }
    spill744_4 = this;
    spill744_5 = p0;
    if (!((life6_5 != null))) {
        lexicalValue744_822_0 = spill744_4;
        lexicalValue744_822_1 = spill744_5;
        break lexical_join_822;
    }
    lexicalValue744_819_0 = ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((moom.HU)(spill744_4)).a(((net.minecraft.world.World)(spill744_5)), ((int)(2)), ((int)(-1)), ((int)(-1)), ((moom.G2)(p2))))).a__ch())).a__fn();
    lexicalValue744_819_1 = moom.fn.a;
    }
    if (!((lexicalValue744_819_0 != lexicalValue744_819_1))) {
        break lexical_join_833;
    }
    lexicalValue744_822_0 = this;
    lexicalValue744_822_1 = p0;
    }
    ((moom.HU)(lexicalValue744_822_0)).a(((net.minecraft.world.World)(lexicalValue744_822_1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aw)).b__fE(((int)(((moom.HU)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aw)), ((int)(3)))))))), ((int)(2)), ((int)(0)), ((int)(-1)), ((moom.G2)(p2)));
    }
    life8_860 = 0;
    lexical_cycle_835: while (true) {
    lexical_join_875: {
    lexical_join_874: {
    if (!((life8_860 < __sourceIntrinsic_5ac1d031d896_invokedynamic744_271(21321, (4410214756024904893L ^ life4_3))))) {
        break lexical_join_877;
    }
    spill744_6 = 0;
    if (!((life6_5 != null))) {
        lexicalValue744_886_0 = spill744_6;
        break lexical_join_886;
    }
    life9_871 = spill744_6;
    lexical_cycle_846: while (true) {
    if (!((life9_871 < 5))) {
        break lexical_join_874;
    }
    ((moom.HU)(this)).a__Void(((net.minecraft.world.World)(p0)), ((int)(life9_871)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic744_272(14859, (264442266714899964L ^ life4_3)))), ((int)(life8_860)), ((moom.G2)(p2)));
    ((moom.HU)(this)).b(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((int)(life9_871)), ((int)(-1)), ((int)(life8_860)), ((moom.G2)(p2)));
    life9_871 += 1;
    if (!((life6_5 != null))) {
        break lexical_join_875;
    }
    if (!((life6_5 == null))) { continue lexical_cycle_846; }
    break lexical_cycle_846;
    }
    }
    life8_860 += 1;
    }
    if (!((life6_5 == null))) { continue lexical_cycle_835; }
    break lexical_cycle_835;
    }
    }
    ((moom.HU)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(2)), ((int)(1)), ((int)(2)), ((int)(1)));
    lexicalValue744_886_0 = 1;
    }
    return ((lexicalValue744_886_0) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public static moom.HU a(moom.H6 p0, java.util.List<moom.G4> p1, java.util.Random p2, int p3, int p4, int p5, moom.bs p6, int p7) {
moom.HU forwardValue2098_41_0;
    long life8_3;
    moom.G2 life10_23;
    forward_join_41: {
    forward_join_40: {
    life8_3 = (moom.HU.h ^ 85585859007403L);
    life10_23 = moom.G2.a(((int)(p3)), ((int)(p4)), ((int)(p5)), ((int)(0)), ((int)(0)), ((int)(0)), ((int)(5)), ((int)(__sourceIntrinsic_9dbed0d379ce_invokedynamic2098_1(14859, (264420726971024279L ^ life8_3)))), ((int)(__sourceIntrinsic_9dbed0d379ce_invokedynamic2098_2(21321, (4410202039119981270L ^ life8_3)))), ((moom.bs)(p6)));
    if (!(moom.HU.a(((moom.G2)(life10_23))))) {
        break forward_join_40;
    }
    if (!((moom.G4.a(((java.util.List)(p1)), ((moom.G2)(life10_23))) == null))) {
        break forward_join_40;
    }
    forwardValue2098_41_0 = new moom.HU(p0, p7, p2, life10_23, p6);
    break forward_join_41;
    }
    forwardValue2098_41_0 = null;
    }
    return forwardValue2098_41_0;
}


private static native <E extends Throwable> int __sourceIntrinsic_9dbed0d379ce_invokedynamic2098_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9dbed0d379ce_invokedynamic2098_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic744_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic744_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic744_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic744_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic744_31(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic744_37(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic744_43(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic744_49(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic744_55(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic744_61(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic744_62(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic744_68(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic744_74(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic744_80(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic744_81(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic744_94(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic744_98(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic744_102(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic744_106(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic744_110(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic744_114(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic744_118(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic744_122(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic744_126(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic744_137(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic744_148(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic744_154(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic744_170(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic744_174(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic744_178(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic744_182(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic744_186(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic744_190(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic744_194(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic744_198(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic744_202(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic744_206(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic744_210(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic744_218(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic744_226(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic744_234(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic744_244(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic744_271(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic744_272(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4784_0() throws E;
}
