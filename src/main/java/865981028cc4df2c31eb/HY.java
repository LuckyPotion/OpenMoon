package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class HY extends moom.HT {

private static final long h;

private static final long[] i;

private static final java.lang.Integer[] j;

private static final java.util.Map k;

public HY() {
super();
}


public HY(moom.H6 p0, int p1, java.util.Random p2, moom.G2 p3, moom.bs p4) {
super(p0, p1);
    this.b = p4;
    this.a = p3;
}


static {
h = ((long)(((moom._a)(moom._c.a(((long)(5919431130365952489L)), ((long)(9218669216604681300L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(79491332575058L)))));
    k = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.HY.h ^ 6384832059350L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill826_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill826_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill826_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill826_14 = new byte[8];
    (__sourceSpill826_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill826_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation826_16 = __sourceSpill826_14;
    ((javax.crypto.Cipher)(__sourceSpill826_11)).init(((int)(__sourceSpill826_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill826_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation826_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[8];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "KþÖ\ní\nfõjùDõ'ØÜe\002Ó,¥\rª@¦jÏ_»\0162·¤IÝ=ïÎÈ°4äÖ"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill826_25 = local6_life21;
        int __sourceSpill826_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill826_25)).substring(((int)(__sourceSpill826_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill826_30 = local8_life19;
        int __sourceSpill826_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill826_33 = new byte[8];
        (__sourceSpill826_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill826_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill826_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill826_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill826_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill826_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill826_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill826_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill826_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill826_34)).doFinal(((byte[])(__sourceSpill826_33)));
        (__sourceSpill826_30)[__sourceSpill826_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "uo¢M\030c\031ÿßj!±9"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill826_38 = local6_life21;
        int __sourceSpill826_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill826_38)).substring(((int)(__sourceSpill826_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill826_43 = local8_life19;
        int __sourceSpill826_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill826_46 = new byte[8];
        (__sourceSpill826_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill826_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill826_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill826_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill826_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill826_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill826_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill826_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill826_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill826_47)).doFinal(((byte[])(__sourceSpill826_46)));
        (__sourceSpill826_43)[__sourceSpill826_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    i = ((long[])(local8_life19));
    j = ((java.lang.Integer[])(new java.lang.Integer[8]));
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.HY.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x154F;
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
                throw new RuntimeException("moom/HY", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            HY.j[n2] = n3;
        }
        return j[n2];
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4799_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/HY"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


protected int c(int p0, int p1) {
return 1;
}


public boolean a__Boolean(net.minecraft.world.World p0, java.util.Random p1, moom.G2 p2) {
moom.HY lexicalValue748_25_0;
    int lexicalValue748_158_0;
    int lexicalValue748_731_0;
    moom.HY lexicalValue748_892_0;
    net.minecraft.world.World lexicalValue748_892_1;
    int lexicalValue748_904_0;
    int lexicalValue748_960_0;
    int spill748_0;
    moom.HY spill748_1;
    int spill748_2;
    moom.HY spill748_3;
    net.minecraft.world.World spill748_4;
    int spill748_5;
    long life4_3;
    net.minecraft.entity.Entity[] life6_5;
    int life7_169;
    int life8_174;
    int life9_176;
    int life10_183;
    int life9_747;
    int life10_927;
    int life11_938;
    lexical_join_960: {
    lexical_join_951: {
    lexical_join_904: {
    lexical_join_903: {
    lexical_join_892: {
    lexical_join_731: {
    lexical_join_222: {
    lexical_join_158: {
    lexical_join_43: {
    lexical_join_25: {
    lexical_join_24: {
    life4_3 = (moom.HY.h ^ 118140946749795L);
    life6_5 = moom.G4.b();
    spill748_0 = ((moom.HY)(this)).e;
    if (!((life6_5 != null))) {
        lexicalValue748_158_0 = spill748_0;
        break lexical_join_158;
    }
    if (!((spill748_0 < 0))) {
        break lexical_join_43;
    }
    ((moom.HY)(this)).e = ((int)(((moom.HY)(this)).a__sourceReturn_6a83d276d7(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)))));
    spill748_1 = this;
    if (!((life6_5 != null))) {
        lexicalValue748_25_0 = spill748_1;
        break lexical_join_25;
    }
    if (!((((moom.HY)(spill748_1)).e < 0))) {
        break lexical_join_24;
    }
    return ((1) != 0);
    }
    lexicalValue748_25_0 = this;
    }
    ((moom.G2)(((moom.HY)(lexicalValue748_25_0)).a)).a(((int)(0)), ((int)((((((moom.HY)(this)).e - ((moom.G2)(((moom.HY)(this)).a)).e) + __sourceIntrinsic_5ac1d031d896_invokedynamic748_11(32283, (6771162775123331192L ^ life4_3))) - 1))), ((int)(0)));
    }
    ((moom.HY)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(1)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic748_13(5210, (613631995747656255L ^ life4_3)))), ((int)(5)), ((int)(4)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((boolean)(false)));
    ((moom.HY)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(0)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic748_19(9896, (5443959782753947849L ^ life4_3)))), ((int)(0)), ((int)(5)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((boolean)(false)));
    ((moom.HY)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(5)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic748_25(31165, (3404475610659819485L ^ life4_3)))), ((int)(5)), ((int)(5)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((boolean)(false)));
    ((moom.HY)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic748_31(25068, (6960019673506748299L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic748_32(31165, (3404475610659819485L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic748_33(25068, (6960019673506748299L ^ life4_3)))), ((int)(4)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((boolean)(false)));
    ((moom.HY)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic748_39(23273, (281863790688513165L ^ life4_3)))), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic748_40(31165, (3404475610659819485L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic748_41(23273, (281863790688513165L ^ life4_3)))), ((int)(3)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((boolean)(false)));
    lexicalValue748_158_0 = ((moom.HY)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ad)), ((int)(3)));
    }
    life7_169 = lexicalValue748_158_0;
    life8_174 = ((moom.HY)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ad)), ((int)(2)));
    life9_176 = -1;
    lexical_cycle_166: while (true) {
    lexical_join_220: {
    lexical_join_219: {
    if (!((life9_176 <= 2))) {
        break lexical_join_222;
    }
    spill748_2 = 0;
    if (!((life6_5 != null))) {
        lexicalValue748_731_0 = spill748_2;
        break lexical_join_731;
    }
    life10_183 = spill748_2;
    lexical_cycle_173: while (true) {
    if (!((life10_183 <= __sourceIntrinsic_5ac1d031d896_invokedynamic748_51(31165, (3404475610659819485L ^ life4_3))))) {
        break lexical_join_219;
    }
    ((moom.HY)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ad)).b__fE(((int)(life7_169))))), ((int)(life10_183)), ((int)((__sourceIntrinsic_5ac1d031d896_invokedynamic748_54(25068, (6960019673506748299L ^ life4_3)) + life9_176))), ((int)(life9_176)), ((moom.G2)(p2)));
    ((moom.HY)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ad)).b__fE(((int)(life8_174))))), ((int)(life10_183)), ((int)((__sourceIntrinsic_5ac1d031d896_invokedynamic748_58(25068, (6960019673506748299L ^ life4_3)) + life9_176))), ((int)((5 - life9_176))), ((moom.G2)(p2)));
    life10_183 += 1;
    if (!((life6_5 != null))) {
        break lexical_join_220;
    }
    if (!((life6_5 == null))) { continue lexical_cycle_173; }
    break lexical_cycle_173;
    }
    }
    life9_176 += 1;
    }
    if (!((life6_5 == null))) { continue lexical_cycle_166; }
    break lexical_cycle_166;
    }
    }
    ((moom.HY)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(1)), ((int)(0)), ((int)(0)), ((int)(1)), ((int)(5)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((boolean)(false)));
    ((moom.HY)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(1)), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic748_65(31165, (3404475610659819485L ^ life4_3)))), ((int)(1)), ((int)(5)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((boolean)(false)));
    ((moom.HY)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic748_71(31165, (3404475610659819485L ^ life4_3)))), ((int)(1)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic748_72(31165, (3404475610659819485L ^ life4_3)))), ((int)(1)), ((int)(4)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((boolean)(false)));
    ((moom.HY)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(2)), ((int)(1)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic748_78(23273, (281863790688513165L ^ life4_3)))), ((int)(1)), ((int)(0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((boolean)(false)));
    ((moom.HY)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(2)), ((int)(0)), ((int)(0)), ((int)(4)), ((int)(0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((boolean)(false)));
    ((moom.HY)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(2)), ((int)(5)), ((int)(0)), ((int)(4)), ((int)(5)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((boolean)(false)));
    ((moom.HY)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic748_94(31165, (3404475610659819485L ^ life4_3)))), ((int)(2)), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic748_95(31165, (3404475610659819485L ^ life4_3)))), ((int)(4)), ((int)(5)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((boolean)(false)));
    ((moom.HY)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic748_101(31165, (3404475610659819485L ^ life4_3)))), ((int)(2)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic748_102(31165, (3404475610659819485L ^ life4_3)))), ((int)(4)), ((int)(0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((boolean)(false)));
    ((moom.HY)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(2)), ((int)(1)), ((int)(0)), ((int)(4)), ((int)(4)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((boolean)(false)));
    ((moom.HY)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(2)), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic748_113(23273, (281863790688513165L ^ life4_3)))), ((int)(4)), ((int)(5)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((boolean)(false)));
    ((moom.HY)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic748_119(31165, (3404475610659819485L ^ life4_3)))), ((int)(2)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic748_120(31165, (3404475610659819485L ^ life4_3)))), ((int)(4)), ((int)(4)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((boolean)(false)));
    ((moom.HY)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(2)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic748_126(23273, (281863790688513165L ^ life4_3)))), ((int)(4)), ((int)(0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((boolean)(false)));
    ((moom.HY)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a9)).a__fE())), ((int)(4)), ((int)(2)), ((int)(0)), ((moom.G2)(p2)));
    ((moom.HY)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a9)).a__fE())), ((int)(5)), ((int)(2)), ((int)(0)), ((moom.G2)(p2)));
    ((moom.HY)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a9)).a__fE())), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic748_140(25068, (6960019673506748299L ^ life4_3)))), ((int)(2)), ((int)(0)), ((moom.G2)(p2)));
    ((moom.HY)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a9)).a__fE())), ((int)(4)), ((int)(3)), ((int)(0)), ((moom.G2)(p2)));
    ((moom.HY)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a9)).a__fE())), ((int)(5)), ((int)(3)), ((int)(0)), ((moom.G2)(p2)));
    ((moom.HY)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a9)).a__fE())), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic748_150(25068, (6960019673506748299L ^ life4_3)))), ((int)(3)), ((int)(0)), ((moom.G2)(p2)));
    ((moom.HY)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a9)).a__fE())), ((int)(0)), ((int)(2)), ((int)(2)), ((moom.G2)(p2)));
    ((moom.HY)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a9)).a__fE())), ((int)(0)), ((int)(2)), ((int)(3)), ((moom.G2)(p2)));
    ((moom.HY)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a9)).a__fE())), ((int)(0)), ((int)(3)), ((int)(2)), ((moom.G2)(p2)));
    ((moom.HY)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a9)).a__fE())), ((int)(0)), ((int)(3)), ((int)(3)), ((moom.G2)(p2)));
    ((moom.HY)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a9)).a__fE())), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic748_166(31165, (3404475610659819485L ^ life4_3)))), ((int)(2)), ((int)(2)), ((moom.G2)(p2)));
    ((moom.HY)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a9)).a__fE())), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic748_170(31165, (3404475610659819485L ^ life4_3)))), ((int)(2)), ((int)(3)), ((moom.G2)(p2)));
    ((moom.HY)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a9)).a__fE())), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic748_174(31165, (3404475610659819485L ^ life4_3)))), ((int)(3)), ((int)(2)), ((moom.G2)(p2)));
    ((moom.HY)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a9)).a__fE())), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic748_178(31165, (3404475610659819485L ^ life4_3)))), ((int)(3)), ((int)(3)), ((moom.G2)(p2)));
    ((moom.HY)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a9)).a__fE())), ((int)(2)), ((int)(2)), ((int)(5)), ((moom.G2)(p2)));
    ((moom.HY)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a9)).a__fE())), ((int)(3)), ((int)(2)), ((int)(5)), ((moom.G2)(p2)));
    ((moom.HY)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a9)).a__fE())), ((int)(5)), ((int)(2)), ((int)(5)), ((moom.G2)(p2)));
    ((moom.HY)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a9)).a__fE())), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic748_191(25068, (6960019673506748299L ^ life4_3)))), ((int)(2)), ((int)(5)), ((moom.G2)(p2)));
    ((moom.HY)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(4)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic748_193(23273, (281863790688513165L ^ life4_3)))), ((int)(4)), ((int)(1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((boolean)(false)));
    ((moom.HY)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(4)), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic748_199(23273, (281863790688513165L ^ life4_3)))), ((int)(4)), ((int)(4)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((boolean)(false)));
    ((moom.HY)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(3)), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic748_205(23273, (281863790688513165L ^ life4_3)))), ((int)(3)), ((int)(4)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.X)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.X)).a__fE())), ((boolean)(false)));
    ((moom.HY)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic748_213(23273, (281863790688513165L ^ life4_3)))), ((int)(1)), ((int)(4)), ((moom.G2)(p2)));
    ((moom.HY)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ad)).b__fE(((int)(((moom.HY)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ad)), ((int)(0)))))))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic748_219(23273, (281863790688513165L ^ life4_3)))), ((int)(1)), ((int)(3)), ((moom.G2)(p2)));
    lexicalValue748_731_0 = ((moom.HY)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ad)), ((int)(3)));
    }
    if (!((life6_5 != null))) {
        lexicalValue748_904_0 = lexicalValue748_731_0;
        break lexical_join_904;
    }
    life9_747 = lexicalValue748_731_0;
    ((moom.HY)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ad)).b__fE(((int)(life9_747))))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic748_225(25068, (6960019673506748299L ^ life4_3)))), ((int)(1)), ((int)(4)), ((moom.G2)(p2)));
    ((moom.HY)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ad)).b__fE(((int)(life9_747))))), ((int)(5)), ((int)(1)), ((int)(4)), ((moom.G2)(p2)));
    ((moom.HY)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ad)).b__fE(((int)(life9_747))))), ((int)(4)), ((int)(1)), ((int)(4)), ((moom.G2)(p2)));
    ((moom.HY)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ad)).b__fE(((int)(life9_747))))), ((int)(3)), ((int)(1)), ((int)(4)), ((moom.G2)(p2)));
    ((moom.HY)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aO)).a__fE())), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic748_238(25068, (6960019673506748299L ^ life4_3)))), ((int)(1)), ((int)(3)), ((moom.G2)(p2)));
    ((moom.HY)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aB)).a__fE())), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic748_242(25068, (6960019673506748299L ^ life4_3)))), ((int)(2)), ((int)(3)), ((moom.G2)(p2)));
    ((moom.HY)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aO)).a__fE())), ((int)(4)), ((int)(1)), ((int)(3)), ((moom.G2)(p2)));
    ((moom.HY)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aB)).a__fE())), ((int)(4)), ((int)(2)), ((int)(3)), ((moom.G2)(p2)));
    ((moom.HY)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ai)).a__fE())), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic748_252(23273, (281863790688513165L ^ life4_3)))), ((int)(1)), ((int)(1)), ((moom.G2)(p2)));
    ((moom.HY)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((int)(1)), ((int)(1)), ((int)(0)), ((moom.G2)(p2)));
    ((moom.HY)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((int)(1)), ((int)(2)), ((int)(0)), ((moom.G2)(p2)));
    ((moom.HY)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((java.util.Random)(p1)), ((int)(1)), ((int)(1)), ((int)(0)), ((moom.bs)(moom.bs.b(((int)(((moom.HY)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ao)), ((int)(1)))))))));
    if (!((((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((moom.HY)(this)).a(((net.minecraft.world.World)(p0)), ((int)(1)), ((int)(0)), ((int)(-1)), ((moom.G2)(p2))))).a__ch())).a__fn() == moom.fn.a))) {
        break lexical_join_903;
    }
    spill748_3 = this;
    spill748_4 = p0;
    if (!((life6_5 != null))) {
        lexicalValue748_892_0 = spill748_3;
        lexicalValue748_892_1 = spill748_4;
        break lexical_join_892;
    }
    if (!((((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((moom.HY)(spill748_3)).a(((net.minecraft.world.World)(spill748_4)), ((int)(1)), ((int)(-1)), ((int)(-1)), ((moom.G2)(p2))))).a__ch())).a__fn() != moom.fn.a))) {
        break lexical_join_903;
    }
    lexicalValue748_892_0 = this;
    lexicalValue748_892_1 = p0;
    }
    ((moom.HY)(lexicalValue748_892_0)).a(((net.minecraft.world.World)(lexicalValue748_892_1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aw)).b__fE(((int)(((moom.HY)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aw)), ((int)(3)))))))), ((int)(1)), ((int)(0)), ((int)(-1)), ((moom.G2)(p2)));
    }
    lexicalValue748_904_0 = 0;
    }
    life10_927 = lexicalValue748_904_0;
    lexical_cycle_905: while (true) {
    lexical_join_949: {
    lexical_join_948: {
    if (!((life10_927 < __sourceIntrinsic_5ac1d031d896_invokedynamic748_277(25068, (6960019673506748299L ^ life4_3))))) {
        break lexical_join_951;
    }
    spill748_5 = 0;
    if (!((life6_5 != null))) {
        lexicalValue748_960_0 = spill748_5;
        break lexical_join_960;
    }
    life11_938 = spill748_5;
    lexical_cycle_916: while (true) {
    if (!((life11_938 < __sourceIntrinsic_5ac1d031d896_invokedynamic748_278(32283, (6771162775123331192L ^ life4_3))))) {
        break lexical_join_948;
    }
    ((moom.HY)(this)).a__Void(((net.minecraft.world.World)(p0)), ((int)(life11_938)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic748_279(32283, (6771162775123331192L ^ life4_3)))), ((int)(life10_927)), ((moom.G2)(p2)));
    ((moom.HY)(this)).b(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((int)(life11_938)), ((int)(-1)), ((int)(life10_927)), ((moom.G2)(p2)));
    life11_938 += 1;
    if (!((life6_5 != null))) {
        break lexical_join_949;
    }
    if (!((life6_5 == null))) { continue lexical_cycle_916; }
    break lexical_cycle_916;
    }
    }
    life10_927 += 1;
    }
    if (!((life6_5 == null))) { continue lexical_cycle_905; }
    break lexical_cycle_905;
    }
    }
    ((moom.HY)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(2)), ((int)(1)), ((int)(2)), ((int)(1)));
    lexicalValue748_960_0 = 1;
    }
    return ((lexicalValue748_960_0) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public static moom.HY a(moom.H6 p0, java.util.List<moom.G4> p1, java.util.Random p2, int p3, int p4, int p5, moom.bs p6, int p7) {
moom.HY forwardValue2107_45_0;
    long life8_3;
    moom.G2 life10_27;
    forward_join_45: {
    forward_join_44: {
    life8_3 = (moom.HY.h ^ 231404239953L);
    life10_27 = moom.G2.a(((int)(p3)), ((int)(p4)), ((int)(p5)), ((int)(0)), ((int)(0)), ((int)(0)), ((int)(__sourceIntrinsic_3283f05e249c_invokedynamic2107_1(19704, (2778781150002995116L ^ life8_3)))), ((int)(__sourceIntrinsic_3283f05e249c_invokedynamic2107_2(32283, (6771280701149769034L ^ life8_3)))), ((int)(__sourceIntrinsic_3283f05e249c_invokedynamic2107_3(21765, (2146482115212527189L ^ life8_3)))), ((moom.bs)(p6)));
    if (!(moom.HY.a(((moom.G2)(life10_27))))) {
        break forward_join_44;
    }
    if (!((moom.G4.a(((java.util.List)(p1)), ((moom.G2)(life10_27))) == null))) {
        break forward_join_44;
    }
    forwardValue2107_45_0 = new moom.HY(p0, p7, p2, life10_27, p6);
    break forward_join_45;
    }
    forwardValue2107_45_0 = null;
    }
    return forwardValue2107_45_0;
}


private static native <E extends Throwable> int __sourceIntrinsic_3283f05e249c_invokedynamic2107_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3283f05e249c_invokedynamic2107_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3283f05e249c_invokedynamic2107_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic748_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic748_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic748_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic748_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic748_31(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic748_32(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic748_33(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic748_39(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic748_40(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic748_41(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic748_51(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic748_54(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic748_58(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic748_65(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic748_71(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic748_72(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic748_78(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic748_94(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic748_95(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic748_101(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic748_102(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic748_113(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic748_119(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic748_120(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic748_126(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic748_140(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic748_150(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic748_166(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic748_170(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic748_174(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic748_178(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic748_191(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic748_193(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic748_199(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic748_205(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic748_213(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic748_219(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic748_225(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic748_238(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic748_242(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic748_252(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic748_277(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic748_278(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic748_279(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4799_0() throws E;
}
