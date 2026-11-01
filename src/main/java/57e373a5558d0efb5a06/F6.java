package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class F6 extends moom.F4 {

private static net.minecraft.block.state.IBlockState g;

private static net.minecraft.block.state.IBlockState h;

private static net.minecraft.block.state.IBlockState i;

private boolean j;

private static long l;

private static long[] q;

private static java.lang.Integer[] s;

private static java.util.Map t;

public F6(boolean p0, boolean p1) { super(false, 0, 0, (net.minecraft.block.state.IBlockState)null, (net.minecraft.block.state.IBlockState)null); }


private static void __sourceConstructorBody_38384fa06b3b47d4(moom.F6 receiver, boolean p0, boolean p1) throws Throwable {

long local3 = (moom.F6.l ^ 58909764208433L);

    moom.F6.__sourceConstructorInit_38384fa06b3b47d4_0(((moom.F6)(receiver)), ((boolean)(p0)), ((int)(__sourceIntrinsic_38384fa06b3b47d4_originalDynamicSite1987_1(11026, (9130825135428267701L ^ local3)))), ((int)(__sourceIntrinsic_38384fa06b3b47d4_originalDynamicSite1987_2(27045, (1912052566700010500L ^ local3)))), ((net.minecraft.block.state.IBlockState)(moom.F6.g)), ((net.minecraft.block.state.IBlockState)(moom.F6.h)));

    ((moom.F6)(receiver)).j = ((boolean)(p1));

    return;

}



static {
l = ((long)(((moom._a)(moom._c.a(((long)(-7918993880744866131L)), ((long)(-6255880697599499827L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(198277658763773L)))));
    t = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.F6.l ^ 86809048592938L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill731_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill731_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill731_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill731_14 = new byte[8];
    (__sourceSpill731_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill731_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation731_16 = __sourceSpill731_14;
    ((javax.crypto.Cipher)(__sourceSpill731_11)).init(((int)(__sourceSpill731_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill731_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation731_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[11];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "QtóË\035~áT¿\000\036\013i5VÀa¼\\ÖÙç.Ð°Ü\004J-km%ª+xeÜñ>\002òsx~Ögõgjêu\007²ßðáZ\017ìø"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill731_25 = local6_life21;
        int __sourceSpill731_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill731_25)).substring(((int)(__sourceSpill731_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill731_30 = local8_life19;
        int __sourceSpill731_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill731_33 = new byte[8];
        (__sourceSpill731_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill731_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill731_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill731_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill731_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill731_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill731_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill731_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill731_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill731_34)).doFinal(((byte[])(__sourceSpill731_33)));
        (__sourceSpill731_30)[__sourceSpill731_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "¦Z1\023¼ÈøØõpÅk\023¼Óî"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill731_38 = local6_life21;
        int __sourceSpill731_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill731_38)).substring(((int)(__sourceSpill731_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill731_43 = local8_life19;
        int __sourceSpill731_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill731_46 = new byte[8];
        (__sourceSpill731_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill731_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill731_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill731_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill731_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill731_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill731_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill731_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill731_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill731_47)).doFinal(((byte[])(__sourceSpill731_46)));
        (__sourceSpill731_43)[__sourceSpill731_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    q = ((long[])(local8_life19));
    s = ((java.lang.Integer[])(new java.lang.Integer[11]));
    g = ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.r)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.ee.S)), ((java.lang.Comparable)(net.minecraft.block.BlockPlanks$EnumType.SPRUCE)))));
    h = ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((moom.dH)(net.minecraft.init.Blocks.t)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.dJ.W)), ((java.lang.Comparable)(net.minecraft.block.BlockPlanks$EnumType.SPRUCE))))).a__fE(((net.minecraft.block.properties.IProperty)(moom.dH.S)), ((java.lang.Comparable)(java.lang.Boolean.FALSE)))));
    i = ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.d)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.dq.Q)), ((java.lang.Comparable)(net.minecraft.block.BlockDirt$DirtType.PODZOL)))));
}

private static native <E extends Throwable> void __sourceConstructorInit_38384fa06b3b47d4_0(moom.F6 a0, boolean a1, int a2, int a3, net.minecraft.block.state.IBlockState a4, net.minecraft.block.state.IBlockState a5) throws E;

private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4440_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/F6"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x6441;
        if (s[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = q[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])t.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    t.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/F6", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            F6.s[n2] = n3;
        }
        return s[n2];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.F6.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private void b(net.minecraft.world.World p0, moom.DT p1) {
int forestValue614_14_0;
    int forestValue614_14_1;
    int forestValue614_35_0;
    int forestValue614_35_1;
    int[] spill614_0;
    int spill614_1;
    int spill614_2;
    long life3_3;
    int life6_10;
    int[] life5_11;
    int life7_20;
    forest_join_50: {
    life3_3 = (moom.F6.l ^ 114630305491644L);
    spill614_0 = moom.FY.b();
    life6_10 = __sourceIntrinsic_6d923203f1ab_invokedynamic614_2(26552, (638972241896591263L ^ life3_3));
    life5_11 = spill614_0;
    forest_cycle_12: while (true) {
    forest_join_47: {
    forestValue614_14_0 = life6_10;
    forestValue614_14_1 = 2;
    forest_cycle_14: while (true) {
    if (!((forestValue614_14_0 <= forestValue614_14_1))) {
        break forest_join_50;
    }
    life7_20 = __sourceIntrinsic_6d923203f1ab_invokedynamic614_3(22176, (2152109936556572301L ^ life3_3));
    forest_cycle_21: while (true) {
    forest_join_44: {
    forest_join_36: {
    forest_join_35: {
    if (!((life7_20 <= 2))) {
        break forest_join_47;
    }
    spill614_1 = java.lang.Math.abs(((int)(life6_10)));
    spill614_2 = 2;
    if (!((life5_11 != null))) {
        forestValue614_14_0 = spill614_1;
        forestValue614_14_1 = spill614_2;
        continue forest_cycle_14;
    }
    if (!((life5_11 != null))) {
        forestValue614_35_0 = spill614_1;
        forestValue614_35_1 = spill614_2;
        break forest_join_35;
    }
    if (!((spill614_1 == spill614_2))) {
        break forest_join_36;
    }
    forestValue614_35_0 = java.lang.Math.abs(((int)(life7_20)));
    forestValue614_35_1 = 2;
    }
    if (!((forestValue614_35_0 != forestValue614_35_1))) {
        break forest_join_44;
    }
    }
    ((moom.F6)(this)).c(((net.minecraft.world.World)(p0)), ((moom.DT)(((moom.DT)(p1)).a(((int)(life6_10)), ((int)(0)), ((int)(life7_20))))));
    }
    life7_20 += 1;
    if (!((life5_11 == null))) {
        continue forest_cycle_21;
    }
    break forest_cycle_21;
    }
    break forest_cycle_14;
    }
    }
    life6_10 += 1;
    if (!((life5_11 == null))) {
        continue forest_cycle_12;
    }
    break forest_cycle_12;
    }
    }
    return;
}


private void c(net.minecraft.world.World p0, moom.DT p1) {
net.minecraft.block.Block lexicalValue623_42_0;
    int[] spill623_0;
    net.minecraft.block.Block spill623_1;
    long life3_3;
    int life6_6;
    int[] life5_7;
    moom.DT life7_18;
    net.minecraft.block.Block life8_23;
    lexical_join_52: {
    life3_3 = (moom.F6.l ^ 74440850468815L);
    spill623_0 = moom.FY.b();
    life6_6 = 2;
    life5_7 = spill623_0;
    lexical_cycle_8: while (true) {
    lexical_join_49: {
    lexical_join_42: {
    lexical_join_41: {
    lexical_join_39: {
    lexical_join_34: {
    if (!((life6_6 >= __sourceIntrinsic_375e50a0a601_invokedynamic623_2(30464, (4045901203991665238L ^ life3_3))))) {
        break lexical_join_52;
    }
    life7_18 = ((moom.DT)(p1)).a(((int)(life6_6)));
    life8_23 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life7_18))))).a__ch();
    if (!((life5_7 != null))) {
        break lexical_join_39;
    }
    if (!((life8_23 != net.minecraft.init.Blocks.c))) {
        break lexical_join_34;
    }
    spill623_1 = life8_23;
    if (!((life5_7 != null))) {
        lexicalValue623_42_0 = spill623_1;
        break lexical_join_42;
    }
    if (!((spill623_1 == net.minecraft.init.Blocks.d))) {
        break lexical_join_41;
    }
    }
    ((moom.F6)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(life7_18)), ((net.minecraft.block.state.IBlockState)(moom.F6.i)));
    }
    if (!((life5_7 == null))) {
        break lexical_join_52;
    }
    }
    lexicalValue623_42_0 = life8_23;
    }
    if (!((((net.minecraft.block.Block)(lexicalValue623_42_0)).a__fn() != moom.fn.a))) {
        break lexical_join_49;
    }
    if (!((life6_6 < 0))) {
        break lexical_join_49;
    }
    if (!((life5_7 == null))) {
        break lexical_join_52;
    }
    }
    life6_6 += -1;
    if (!((life5_7 == null))) { continue lexical_cycle_8; }
    break lexical_cycle_8;
    }
    }
    return;
}


private static moom.Oo c(moom.Oo p0) {
return p0;
}


public void a(net.minecraft.world.World p0, java.util.Random p1, moom.DT p2) {
int lexicalValue620_68_0;
    int lexicalValue620_77_0;
    int lexicalValue620_81_0;
    int[] spill620_0;
    int spill620_1;
    long life4_3;
    int life7_34;
    int[] life6_35;
    int life8_46;
    int life9_54;
    int life10_62;
    lexical_join_110: {
    life4_3 = (moom.F6.l ^ 45037117695685L);
    ((moom.F6)(this)).b(((net.minecraft.world.World)(p0)), ((moom.DT)(((moom.DT)(((moom.DT)(p2)).e())).c__DT())));
    ((moom.F6)(this)).b(((net.minecraft.world.World)(p0)), ((moom.DT)(((moom.DT)(((moom.DT)(p2)).f(((int)(2))))).c__DT())));
    spill620_0 = moom.FY.b();
    ((moom.F6)(this)).b(((net.minecraft.world.World)(p0)), ((moom.DT)(((moom.DT)(((moom.DT)(p2)).e())).d(((int)(2))))));
    ((moom.F6)(this)).b(((net.minecraft.world.World)(p0)), ((moom.DT)(((moom.DT)(((moom.DT)(p2)).f(((int)(2))))).d(((int)(2))))));
    life7_34 = 0;
    life6_35 = spill620_0;
    lexical_cycle_36: while (true) {
    lexical_join_107: {
    lexical_join_87: {
    lexical_join_81: {
    lexical_join_77: {
    lexical_join_68: {
    if (!((life7_34 < 5))) {
        break lexical_join_110;
    }
    life8_46 = ((java.util.Random)(p1)).nextInt(((int)(__sourceIntrinsic_83c0409717df_invokedynamic620_14(10522, (14165955714960714L ^ life4_3)))));
    life9_54 = (life8_46 % __sourceIntrinsic_83c0409717df_invokedynamic620_16(6896, (7934738545535549095L ^ life4_3)));
    life10_62 = (life8_46 / __sourceIntrinsic_83c0409717df_invokedynamic620_17(11216, (7335256631766601606L ^ life4_3)));
    spill620_1 = life9_54;
    if (!((life6_35 != null))) {
        lexicalValue620_68_0 = spill620_1;
        break lexical_join_68;
    }
    if (!((spill620_1 != 0))) {
        break lexical_join_87;
    }
    lexicalValue620_68_0 = life9_54;
    }
    if (!((life6_35 != null))) {
        lexicalValue620_77_0 = lexicalValue620_68_0;
        break lexical_join_77;
    }
    if (!((lexicalValue620_68_0 != __sourceIntrinsic_83c0409717df_invokedynamic620_18(18960, (4065693638990638671L ^ life4_3))))) {
        break lexical_join_87;
    }
    lexicalValue620_77_0 = life10_62;
    }
    if (!((life6_35 != null))) {
        lexicalValue620_81_0 = lexicalValue620_77_0;
        break lexical_join_81;
    }
    if (!((lexicalValue620_77_0 != 0))) {
        break lexical_join_87;
    }
    lexicalValue620_81_0 = life10_62;
    }
    if (!((lexicalValue620_81_0 == __sourceIntrinsic_83c0409717df_invokedynamic620_19(24592, (3508244440738432065L ^ life4_3))))) {
        break lexical_join_107;
    }
    }
    ((moom.F6)(this)).b(((net.minecraft.world.World)(p0)), ((moom.DT)(((moom.DT)(p2)).a(((int)((__sourceIntrinsic_83c0409717df_invokedynamic620_20(2373, (8123418899445214487L ^ life4_3)) + life9_54))), ((int)(0)), ((int)((__sourceIntrinsic_83c0409717df_invokedynamic620_21(30464, (4045788237374657372L ^ life4_3)) + life10_62)))))));
    }
    life7_34 += 1;
    if (!((life6_35 == null))) { continue lexical_cycle_36; }
    break lexical_cycle_36;
    }
    }
    return;
}


public boolean a__Boolean(net.minecraft.world.World p0, java.util.Random p1, moom.DT p2) {
int lexicalValue621_35_0;
    moom.fn lexicalValue621_55_0;
    moom.fn lexicalValue621_55_1;
    moom.fn lexicalValue621_87_0;
    moom.fn lexicalValue621_87_1;
    moom.fn lexicalValue621_112_0;
    moom.fn lexicalValue621_112_1;
    moom.fn lexicalValue621_118_0;
    moom.fn lexicalValue621_118_1;
    moom.fn lexicalValue621_143_0;
    moom.fn lexicalValue621_143_1;
    moom.fn lexicalValue621_149_0;
    moom.fn lexicalValue621_149_1;
    int[] spill621_0;
    boolean spill621_1;
    moom.fn spill621_2;
    moom.fn spill621_3;
    moom.fn spill621_4;
    moom.fn spill621_5;
    long life4_3;
    int life7_8;
    int[] life6_9;
    int life8_40;
    net.minecraft.block.Block life9_50;
    net.minecraft.block.Block life9_91;
    lexical_join_163: {
    lexical_join_35: {
    lexical_join_21: {
    life4_3 = (moom.F6.l ^ 3258123084717L);
    spill621_0 = moom.FY.b();
    life7_8 = ((moom.F6)(this)).a(((java.util.Random)(p1)));
    life6_9 = spill621_0;
    spill621_1 = ((moom.F6)(this)).a(((net.minecraft.world.World)(p0)), ((java.util.Random)(p1)), ((moom.DT)(p2)), ((int)(life7_8)));
    if (!((life6_9 != null))) {
        lexicalValue621_35_0 = ((spill621_1) ? 1 : 0);
        break lexical_join_35;
    }
    if (!((!spill621_1))) {
        break lexical_join_21;
    }
    return ((0) != 0);
    }
    ((moom.F6)(this)).a(((net.minecraft.world.World)(p0)), ((int)(((moom.DT)(p2)).a())), ((int)(((moom.DT)(p2)).c())), ((int)((((moom.DT)(p2)).b() + life7_8))), ((int)(0)), ((java.util.Random)(p1)));
    lexicalValue621_35_0 = 0;
    }
    life8_40 = lexicalValue621_35_0;
    lexical_cycle_36: while (true) {
    lexical_join_160: {
    lexical_join_150: {
    lexical_join_149: {
    lexical_join_143: {
    lexical_join_131: {
    lexical_join_121: {
    lexical_join_118: {
    lexical_join_112: {
    lexical_join_100: {
    lexical_join_90: {
    lexical_join_87: {
    lexical_join_64: {
    lexical_join_56: {
    lexical_join_55: {
    if (!((life8_40 < life7_8))) {
        break lexical_join_163;
    }
    life9_50 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p2)).a(((int)(life8_40)))))))).a__ch();
    spill621_2 = ((net.minecraft.block.Block)(life9_50)).a__fn();
    spill621_3 = moom.fn.a;
    if (!((life6_9 != null))) {
        lexicalValue621_55_0 = spill621_2;
        lexicalValue621_55_1 = spill621_3;
        break lexical_join_55;
    }
    if (!((spill621_2 != spill621_3))) {
        break lexical_join_56;
    }
    lexicalValue621_55_0 = ((net.minecraft.block.Block)(life9_50)).a__fn();
    lexicalValue621_55_1 = moom.fn.j;
    }
    if (!((lexicalValue621_55_0 == lexicalValue621_55_1))) {
        break lexical_join_64;
    }
    }
    ((moom.F6)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(((moom.DT)(p2)).a(((int)(life8_40))))), ((net.minecraft.block.state.IBlockState)(this.d)));
    }
    if (!((life8_40 < (life7_8 - 1)))) {
        break lexical_join_160;
    }
    life9_91 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p2)).a(((int)(1)), ((int)(life8_40)), ((int)(0)))))))).a__ch();
    spill621_4 = ((net.minecraft.block.Block)(life9_91)).a__fn();
    spill621_5 = moom.fn.a;
    if (!((life6_9 != null))) {
        lexicalValue621_87_0 = spill621_4;
        lexicalValue621_87_1 = spill621_5;
        break lexical_join_87;
    }
    if (!((spill621_4 != spill621_5))) {
        break lexical_join_90;
    }
    lexicalValue621_87_0 = ((net.minecraft.block.Block)(life9_91)).a__fn();
    lexicalValue621_87_1 = moom.fn.j;
    }
    if (!((life6_9 != null))) {
        lexicalValue621_112_0 = lexicalValue621_87_0;
        lexicalValue621_112_1 = lexicalValue621_87_1;
        break lexical_join_112;
    }
    if (!((lexicalValue621_87_0 == lexicalValue621_87_1))) {
        break lexical_join_100;
    }
    }
    ((moom.F6)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(((moom.DT)(p2)).a(((int)(1)), ((int)(life8_40)), ((int)(0))))), ((net.minecraft.block.state.IBlockState)(this.d)));
    }
    life9_91 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p2)).a(((int)(1)), ((int)(life8_40)), ((int)(1)))))))).a__ch();
    lexicalValue621_112_0 = ((net.minecraft.block.Block)(life9_91)).a__fn();
    lexicalValue621_112_1 = moom.fn.a;
    }
    if (!((life6_9 != null))) {
        lexicalValue621_118_0 = lexicalValue621_112_0;
        lexicalValue621_118_1 = lexicalValue621_112_1;
        break lexical_join_118;
    }
    if (!((lexicalValue621_112_0 != lexicalValue621_112_1))) {
        break lexical_join_121;
    }
    lexicalValue621_118_0 = ((net.minecraft.block.Block)(life9_91)).a__fn();
    lexicalValue621_118_1 = moom.fn.j;
    }
    if (!((life6_9 != null))) {
        lexicalValue621_143_0 = lexicalValue621_118_0;
        lexicalValue621_143_1 = lexicalValue621_118_1;
        break lexical_join_143;
    }
    if (!((lexicalValue621_118_0 == lexicalValue621_118_1))) {
        break lexical_join_131;
    }
    }
    ((moom.F6)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(((moom.DT)(p2)).a(((int)(1)), ((int)(life8_40)), ((int)(1))))), ((net.minecraft.block.state.IBlockState)(this.d)));
    }
    life9_91 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p2)).a(((int)(0)), ((int)(life8_40)), ((int)(1)))))))).a__ch();
    lexicalValue621_143_0 = ((net.minecraft.block.Block)(life9_91)).a__fn();
    lexicalValue621_143_1 = moom.fn.a;
    }
    if (!((life6_9 != null))) {
        lexicalValue621_149_0 = lexicalValue621_143_0;
        lexicalValue621_149_1 = lexicalValue621_143_1;
        break lexical_join_149;
    }
    if (!((lexicalValue621_143_0 != lexicalValue621_143_1))) {
        break lexical_join_150;
    }
    lexicalValue621_149_0 = ((net.minecraft.block.Block)(life9_91)).a__fn();
    lexicalValue621_149_1 = moom.fn.j;
    }
    if (!((lexicalValue621_149_0 == lexicalValue621_149_1))) {
        break lexical_join_160;
    }
    }
    ((moom.F6)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(((moom.DT)(p2)).a(((int)(0)), ((int)(life8_40)), ((int)(1))))), ((net.minecraft.block.state.IBlockState)(this.d)));
    }
    life8_40 += 1;
    if (!((life6_9 == null))) { continue lexical_cycle_36; }
    break lexical_cycle_36;
    }
    }
    return ((1) != 0);
}


private void a(net.minecraft.world.World p0, int p1, int p2, int p3, int p4, java.util.Random p5) {
int lexicalValue619_16_0;
    int lexicalValue619_16_1;
    int lexicalValue619_17_0;
    int lexicalValue619_18_0;
    int lexicalValue619_18_1;
    moom.F6 lexicalValue619_58_0;
    net.minecraft.world.World lexicalValue619_58_1;
    moom.DT lexicalValue619_58_2;
    int lexicalValue619_58_3;
    int lexicalValue619_58_4;
    moom.F6 lexicalValue619_64_0;
    net.minecraft.world.World lexicalValue619_64_1;
    moom.DT lexicalValue619_64_2;
    int lexicalValue619_64_3;
    int lexicalValue619_64_4;
    int lexicalValue619_64_5;
    moom.F6 lexicalValue619_69_0;
    net.minecraft.world.World lexicalValue619_69_1;
    moom.DT lexicalValue619_69_2;
    int lexicalValue619_69_3;
    int lexicalValue619_69_4;
    moom.F6 lexicalValue619_70_0;
    net.minecraft.world.World lexicalValue619_70_1;
    moom.DT lexicalValue619_70_2;
    int lexicalValue619_70_3;
    moom.F6 lexicalValue619_71_0;
    net.minecraft.world.World lexicalValue619_71_1;
    moom.DT lexicalValue619_71_2;
    int lexicalValue619_71_3;
    int lexicalValue619_71_4;
    int spill619_0;
    boolean spill619_1;
    moom.F6 spill619_2;
    net.minecraft.world.World spill619_3;
    moom.DT spill619_4;
    int spill619_5;
    int spill619_6;
    int spill619_7;
    int spill619_8;
    long life7_3;
    int[] life9_5;
    int life10_25;
    int life11_27;
    int life12_31;
    int life13_38;
    int life14_49;
    lexical_join_78: {
    lexical_join_18: {
    lexical_join_17: {
    lexical_join_16: {
    life7_3 = (moom.F6.l ^ 12635108772279L);
    life9_5 = moom.FY.b();
    spill619_0 = ((java.util.Random)(p5)).nextInt(((int)(5)));
    spill619_1 = this.j;
    if (!((life9_5 != null))) {
        lexicalValue619_16_0 = spill619_0;
        lexicalValue619_16_1 = ((spill619_1) ? 1 : 0);
        break lexical_join_16;
    }
    if (!(spill619_1)) {
        lexicalValue619_17_0 = spill619_0;
        break lexical_join_17;
    }
    lexicalValue619_16_0 = spill619_0;
    lexicalValue619_16_1 = this.c;
    }
    lexicalValue619_18_0 = lexicalValue619_16_0;
    lexicalValue619_18_1 = lexicalValue619_16_1;
    break lexical_join_18;
    }
    lexicalValue619_18_0 = lexicalValue619_17_0;
    lexicalValue619_18_1 = 3;
    }
    life10_25 = (lexicalValue619_18_0 + lexicalValue619_18_1);
    life11_27 = 0;
    life12_31 = (p3 - life10_25);
    lexical_cycle_26: while (true) {
    lexical_join_71: {
    lexical_join_70: {
    lexical_join_69: {
    lexical_join_64: {
    lexical_join_58: {
    if (!((life12_31 <= p3))) {
        break lexical_join_78;
    }
    life13_38 = (p3 - life12_31);
    life14_49 = (p4 + moom.Dr.a__Int(((float)(((((float) life13_38) / ((float) life10_25)) * 0x1.cp1f)))));
    spill619_2 = this;
    spill619_3 = p0;
    spill619_4 = new moom.DT(p1, life12_31, p2);
    spill619_5 = life14_49;
    spill619_6 = life13_38;
    if (!((life9_5 != null))) {
        lexicalValue619_58_0 = spill619_2;
        lexicalValue619_58_1 = spill619_3;
        lexicalValue619_58_2 = spill619_4;
        lexicalValue619_58_3 = spill619_5;
        lexicalValue619_58_4 = spill619_6;
        break lexical_join_58;
    }
    if (!((spill619_6 > 0))) {
        lexicalValue619_70_0 = spill619_2;
        lexicalValue619_70_1 = spill619_3;
        lexicalValue619_70_2 = spill619_4;
        lexicalValue619_70_3 = spill619_5;
        break lexical_join_70;
    }
    lexicalValue619_58_0 = spill619_2;
    lexicalValue619_58_1 = spill619_3;
    lexicalValue619_58_2 = spill619_4;
    lexicalValue619_58_3 = spill619_5;
    lexicalValue619_58_4 = life14_49;
    }
    spill619_7 = life11_27;
    if (!((life9_5 != null))) {
        lexicalValue619_64_0 = lexicalValue619_58_0;
        lexicalValue619_64_1 = lexicalValue619_58_1;
        lexicalValue619_64_2 = lexicalValue619_58_2;
        lexicalValue619_64_3 = lexicalValue619_58_3;
        lexicalValue619_64_4 = lexicalValue619_58_4;
        lexicalValue619_64_5 = spill619_7;
        break lexical_join_64;
    }
    if (!((lexicalValue619_58_4 == spill619_7))) {
        lexicalValue619_70_0 = lexicalValue619_58_0;
        lexicalValue619_70_1 = lexicalValue619_58_1;
        lexicalValue619_70_2 = lexicalValue619_58_2;
        lexicalValue619_70_3 = lexicalValue619_58_3;
        break lexical_join_70;
    }
    lexicalValue619_64_0 = lexicalValue619_58_0;
    lexicalValue619_64_1 = lexicalValue619_58_1;
    lexicalValue619_64_2 = lexicalValue619_58_2;
    lexicalValue619_64_3 = lexicalValue619_58_3;
    lexicalValue619_64_4 = life12_31;
    lexicalValue619_64_5 = 1;
    }
    spill619_8 = (lexicalValue619_64_4 & lexicalValue619_64_5);
    if (!((life9_5 != null))) {
        lexicalValue619_69_0 = lexicalValue619_64_0;
        lexicalValue619_69_1 = lexicalValue619_64_1;
        lexicalValue619_69_2 = lexicalValue619_64_2;
        lexicalValue619_69_3 = lexicalValue619_64_3;
        lexicalValue619_69_4 = spill619_8;
        break lexical_join_69;
    }
    if (!((spill619_8 == 0))) {
        lexicalValue619_70_0 = lexicalValue619_64_0;
        lexicalValue619_70_1 = lexicalValue619_64_1;
        lexicalValue619_70_2 = lexicalValue619_64_2;
        lexicalValue619_70_3 = lexicalValue619_64_3;
        break lexical_join_70;
    }
    lexicalValue619_69_0 = lexicalValue619_64_0;
    lexicalValue619_69_1 = lexicalValue619_64_1;
    lexicalValue619_69_2 = lexicalValue619_64_2;
    lexicalValue619_69_3 = lexicalValue619_64_3;
    lexicalValue619_69_4 = 1;
    }
    lexicalValue619_71_0 = lexicalValue619_69_0;
    lexicalValue619_71_1 = lexicalValue619_69_1;
    lexicalValue619_71_2 = lexicalValue619_69_2;
    lexicalValue619_71_3 = lexicalValue619_69_3;
    lexicalValue619_71_4 = lexicalValue619_69_4;
    break lexical_join_71;
    }
    lexicalValue619_71_0 = lexicalValue619_70_0;
    lexicalValue619_71_1 = lexicalValue619_70_1;
    lexicalValue619_71_2 = lexicalValue619_70_2;
    lexicalValue619_71_3 = lexicalValue619_70_3;
    lexicalValue619_71_4 = 0;
    }
    ((moom.F6)(lexicalValue619_71_0)).a(((net.minecraft.world.World)(lexicalValue619_71_1)), ((moom.DT)(lexicalValue619_71_2)), ((int)((lexicalValue619_71_3 + lexicalValue619_71_4))));
    life11_27 = life14_49;
    life12_31 += 1;
    if (!((life9_5 == null))) { continue lexical_cycle_26; }
    break lexical_cycle_26;
    }
    }
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_38384fa06b3b47d4_originalDynamicSite1987_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_38384fa06b3b47d4_originalDynamicSite1987_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_83c0409717df_invokedynamic620_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_83c0409717df_invokedynamic620_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_83c0409717df_invokedynamic620_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_83c0409717df_invokedynamic620_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_83c0409717df_invokedynamic620_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_83c0409717df_invokedynamic620_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_83c0409717df_invokedynamic620_21(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4440_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6d923203f1ab_invokedynamic614_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6d923203f1ab_invokedynamic614_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_375e50a0a601_invokedynamic623_2(int a0, long a1) throws E;
}
