package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Hk extends moom.Hc {

private static long j;

private static long[] p;

private static java.lang.Integer[] q;

private static java.util.Map r;

protected Hk(java.util.Random p0, int p1, int p2) { super(0); }


private static void __sourceConstructorBody_37873ff91c6a806e(moom.Hk receiver, java.util.Random p0, int p1, int p2) throws Throwable {

long local4 = (moom.Hk.j ^ 24185454590073L);

    moom.Hk.__sourceConstructorInit_37873ff91c6a806e_0(((moom.Hk)(receiver)), ((int)(0)));

    ((moom.Hk)(receiver)).b = ((moom.bs)(((net.minecraft.util.EnumFacing$Plane)(net.minecraft.util.EnumFacing$Plane.HORIZONTAL)).a(((java.util.Random)(p0)))));

    ((moom.Hk)(receiver)).a = ((moom.G2)(new moom.G2(p1, __sourceIntrinsic_37873ff91c6a806e_originalDynamicSite2145_5(9138, (4637851601246739606L ^ local4)), p2, ((p1 + __sourceIntrinsic_37873ff91c6a806e_originalDynamicSite2145_6(5488, (6030613574500313673L ^ local4))) - 1), __sourceIntrinsic_37873ff91c6a806e_originalDynamicSite2145_7(4238, (2134959376235425727L ^ local4)), ((p2 + __sourceIntrinsic_37873ff91c6a806e_originalDynamicSite2145_8(21721, (950940884783672299L ^ local4))) - 1))));

    return;

}



public Hk(int p0, java.util.Random p1, moom.G2 p2, moom.bs p3) {
super(p0);
    this.b = p3;
    this.a = p2;
}


public Hk() {
super();
}


static {
j = ((long)(((moom._a)(moom._c.a(((long)(-5820813895227267766L)), ((long)(2649200416868500369L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(57700172787977L)))));
    r = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.Hk.j ^ 18337828972767L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill838_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill838_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill838_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill838_14 = new byte[8];
    (__sourceSpill838_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill838_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation838_16 = __sourceSpill838_14;
    ((javax.crypto.Cipher)(__sourceSpill838_11)).init(((int)(__sourceSpill838_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill838_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation838_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[20];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "É\034·ç\005_\177ukÎvé{E°×b\017gºò¥oîc¾ø¹ÒU¸$ï.,°©VÊ`ÃD½µÏäªT£\021\0262f\r^çGD\022°Y\027Í;¿×bÙ(®¹ÇÈ°\035ò^s8\023\005»N^0£Sp5Ýi\033ã\027²J¡£Rt\005pg°èÂ?¶µ ©Èî¼Æ\031á«cô\025*D"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill838_25 = local6_life21;
        int __sourceSpill838_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill838_25)).substring(((int)(__sourceSpill838_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill838_30 = local8_life19;
        int __sourceSpill838_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill838_33 = new byte[8];
        (__sourceSpill838_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill838_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill838_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill838_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill838_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill838_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill838_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill838_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill838_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill838_34)).doFinal(((byte[])(__sourceSpill838_33)));
        (__sourceSpill838_30)[__sourceSpill838_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "¸\023Ó@&\030·\b\026AB\025\020"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill838_38 = local6_life21;
        int __sourceSpill838_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill838_38)).substring(((int)(__sourceSpill838_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill838_43 = local8_life19;
        int __sourceSpill838_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill838_46 = new byte[8];
        (__sourceSpill838_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill838_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill838_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill838_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill838_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill838_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill838_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill838_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill838_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill838_47)).doFinal(((byte[])(__sourceSpill838_46)));
        (__sourceSpill838_43)[__sourceSpill838_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    p = ((long[])(local8_life19));
    q = ((java.lang.Integer[])(new java.lang.Integer[20]));
}

private static native <E extends Throwable> void __sourceConstructorInit_37873ff91c6a806e_0(moom.Hk a0, int a1) throws E;

private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x1904;
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
                throw new RuntimeException("moom/Hk", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Hk.q[n2] = n3;
        }
        return q[n2];
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.Hk.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4846_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Hk"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public boolean a__Boolean(net.minecraft.world.World p0, java.util.Random p1, moom.G2 p2) {
int lexicalValue765_623_0;
    int lexicalValue765_675_0;
    net.minecraft.entity.Entity[] spill765_0;
    int spill765_1;
    int spill765_2;
    long life4_3;
    net.minecraft.entity.Entity[] life6_32;
    int life7_467;
    int life8_478;
    int life7_626;
    int life8_637;
    lexical_join_675: {
    lexical_join_674: {
    lexical_join_623: {
    lexical_join_514: {
    life4_3 = (moom.Hk.j ^ 125549018676578L);
    spill765_0 = moom.G4.b();
    ((moom.Hk)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic765_2(2266, (2651536482306716410L ^ life4_3)))), ((int)(3)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic765_3(961, (906948045003160037L ^ life4_3)))), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic765_4(6117, (5315020707437931995L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    life6_32 = spill765_0;
    ((moom.Hk)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic765_10(17959, (3984585524431436810L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic765_11(32765, (1154751657885402560L ^ life4_3)))), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic765_12(13785, (2998050810798690289L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    ((moom.Hk)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic765_18(14354, (9175865349037507132L ^ life4_3)))), ((int)(5)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic765_19(18133, (1313936300475170042L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic765_20(17959, (3984585524431436810L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic765_21(32765, (1154751657885402560L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((boolean)(false)));
    ((moom.Hk)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic765_27(11409, (4542441691538314941L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic765_28(32765, (1154751657885402560L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic765_29(17959, (3984585524431436810L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic765_30(22831, (5927567840051438348L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((boolean)(false)));
    ((moom.Hk)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic765_36(17959, (3984585524431436810L ^ life4_3)))), ((int)(5)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic765_37(17959, (3984585524431436810L ^ life4_3)))), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic765_38(17959, (3984585524431436810L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    ((moom.Hk)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic765_44(17959, (3984585524431436810L ^ life4_3)))), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic765_45(13785, (2998050810798690289L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic765_46(17959, (3984585524431436810L ^ life4_3)))), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic765_47(32765, (1154751657885402560L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    ((moom.Hk)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic765_53(13785, (2998050810798690289L ^ life4_3)))), ((int)(5)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic765_54(13785, (2998050810798690289L ^ life4_3)))), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic765_55(17959, (3984585524431436810L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    ((moom.Hk)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic765_61(13785, (2998050810798690289L ^ life4_3)))), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic765_62(13785, (2998050810798690289L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic765_63(13785, (2998050810798690289L ^ life4_3)))), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic765_64(32765, (1154751657885402560L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    ((moom.Hk)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic765_70(17959, (3984585524431436810L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic765_71(17959, (3984585524431436810L ^ life4_3)))), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic765_72(17959, (3984585524431436810L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    ((moom.Hk)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic765_78(13785, (2998050810798690289L ^ life4_3)))), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic765_79(17959, (3984585524431436810L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic765_80(32765, (1154751657885402560L ^ life4_3)))), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic765_81(17959, (3984585524431436810L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    ((moom.Hk)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic765_87(13785, (2998050810798690289L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic765_88(17959, (3984585524431436810L ^ life4_3)))), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic765_89(13785, (2998050810798690289L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    ((moom.Hk)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic765_95(13785, (2998050810798690289L ^ life4_3)))), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic765_96(13785, (2998050810798690289L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic765_97(32765, (1154751657885402560L ^ life4_3)))), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic765_98(13785, (2998050810798690289L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    ((moom.Hk)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic765_104(17959, (3984585524431436810L ^ life4_3)))), ((int)(2)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic765_105(13785, (2998050810798690289L ^ life4_3)))), ((int)(2)), ((int)(5)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    ((moom.Hk)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic765_111(17959, (3984585524431436810L ^ life4_3)))), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic765_112(32681, (467048143967520149L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic765_113(13785, (2998050810798690289L ^ life4_3)))), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic765_114(32765, (1154751657885402560L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    ((moom.Hk)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic765_120(17959, (3984585524431436810L ^ life4_3)))), ((int)(0)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic765_121(13785, (2998050810798690289L ^ life4_3)))), ((int)(1)), ((int)(3)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    ((moom.Hk)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic765_127(17959, (3984585524431436810L ^ life4_3)))), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic765_128(11347, (8545767677345551990L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic765_129(13785, (2998050810798690289L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic765_130(32765, (1154751657885402560L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    life7_467 = __sourceIntrinsic_5ac1d031d896_invokedynamic765_136(17959, (3984585524431436810L ^ life4_3));
    lexical_cycle_468: while (true) {
    lexical_join_512: {
    lexical_join_511: {
    if (!((life7_467 <= __sourceIntrinsic_5ac1d031d896_invokedynamic765_137(13785, (2998050810798690289L ^ life4_3))))) {
        break lexical_join_514;
    }
    spill765_1 = 0;
    if (!((life6_32 != null))) {
        lexicalValue765_623_0 = spill765_1;
        break lexical_join_623;
    }
    life8_478 = spill765_1;
    lexical_cycle_479: while (true) {
    if (!((life8_478 <= 2))) {
        break lexical_join_511;
    }
    ((moom.Hk)(this)).b(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((int)(life7_467)), ((int)(-1)), ((int)(life8_478)), ((moom.G2)(p2)));
    ((moom.Hk)(this)).b(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((int)(life7_467)), ((int)(-1)), ((int)((__sourceIntrinsic_5ac1d031d896_invokedynamic765_143(32765, (1154751657885402560L ^ life4_3)) - life8_478))), ((moom.G2)(p2)));
    life8_478 += 1;
    if (!((life6_32 != null))) {
        break lexical_join_512;
    }
    if (!((life6_32 == null))) { continue lexical_cycle_479; }
    break lexical_cycle_479;
    }
    }
    life7_467 += 1;
    }
    if (!((life6_32 == null))) { continue lexical_cycle_468; }
    break lexical_cycle_468;
    }
    }
    ((moom.Hk)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic765_145(17959, (3984585524431436810L ^ life4_3)))), ((int)(5)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic765_146(13785, (2998050810798690289L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    ((moom.Hk)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic765_152(5772, (2582956223958936743L ^ life4_3)))), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic765_153(17959, (3984585524431436810L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic765_154(32765, (1154751657885402560L ^ life4_3)))), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic765_155(13785, (2998050810798690289L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    ((moom.Hk)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic765_161(17959, (3984585524431436810L ^ life4_3)))), ((int)(3)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic765_162(13785, (2998050810798690289L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    ((moom.Hk)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic765_168(2536, (2561712167239414735L ^ life4_3)))), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic765_169(17959, (3984585524431436810L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic765_170(32765, (1154751657885402560L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic765_171(13785, (2998050810798690289L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    lexicalValue765_623_0 = 0;
    }
    life7_626 = lexicalValue765_623_0;
    lexical_cycle_624: while (true) {
    lexical_join_672: {
    lexical_join_671: {
    if (!((life7_626 <= 2))) {
        break lexical_join_674;
    }
    spill765_2 = __sourceIntrinsic_5ac1d031d896_invokedynamic765_177(17959, (3984585524431436810L ^ life4_3));
    if (!((life6_32 != null))) {
        lexicalValue765_675_0 = spill765_2;
        break lexical_join_675;
    }
    life8_637 = spill765_2;
    lexical_cycle_635: while (true) {
    if (!((life8_637 <= __sourceIntrinsic_5ac1d031d896_invokedynamic765_178(13785, (2998050810798690289L ^ life4_3))))) {
        break lexical_join_671;
    }
    ((moom.Hk)(this)).b(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((int)(life7_626)), ((int)(-1)), ((int)(life8_637)), ((moom.G2)(p2)));
    ((moom.Hk)(this)).b(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((int)((__sourceIntrinsic_5ac1d031d896_invokedynamic765_184(32765, (1154751657885402560L ^ life4_3)) - life7_626))), ((int)(-1)), ((int)(life8_637)), ((moom.G2)(p2)));
    life8_637 += 1;
    if (!((life6_32 != null))) {
        break lexical_join_672;
    }
    if (!((life6_32 == null))) { continue lexical_cycle_635; }
    break lexical_cycle_635;
    }
    }
    life7_626 += 1;
    }
    if (!((life6_32 == null))) { continue lexical_cycle_624; }
    break lexical_cycle_624;
    }
    }
    lexicalValue765_675_0 = 1;
    }
    return ((lexicalValue765_675_0) != 0);
}


public void a(moom.G4 p0, java.util.List<moom.G4> p1, java.util.Random p2) {
long local4 = (moom.Hk.j ^ 4016426596260L);
    ((moom.Hk)(this)).a(((moom.Hl)(((moom.Hl)(p0)))), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)(__sourceIntrinsic_0f75cc6dd3c5_originalDynamicSite1166_2(11409, (4542319127986314363L ^ local4)))), ((int)(3)), ((boolean)(false)));
    ((moom.Hk)(this)).b(((moom.Hl)(((moom.Hl)(p0)))), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)(3)), ((int)(__sourceIntrinsic_0f75cc6dd3c5_originalDynamicSite1166_5(11409, (4542319127986314363L ^ local4)))), ((boolean)(false)));
    ((moom.Hk)(this)).c(((moom.Hl)(((moom.Hl)(p0)))), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)(3)), ((int)(__sourceIntrinsic_0f75cc6dd3c5_originalDynamicSite1166_8(11409, (4542319127986314363L ^ local4)))), ((boolean)(false)));
    return;
}


public static moom.Hk a(java.util.List<moom.G4> p0, java.util.Random p1, int p2, int p3, int p4, moom.bs p5, int p6) {
moom.Hk forwardValue2141_52_0;
    long life7_3;
    moom.G2 life9_35;
    forward_join_52: {
    forward_join_51: {
    life7_3 = (moom.Hk.j ^ 119517333554200L);
    life9_35 = moom.G2.a(((int)(p2)), ((int)(p3)), ((int)(p4)), ((int)(__sourceIntrinsic_794c55bd7517_invokedynamic2141_1(22137, (7826686199595324709L ^ life7_3)))), ((int)(__sourceIntrinsic_794c55bd7517_invokedynamic2141_2(310, (6481092374200779373L ^ life7_3)))), ((int)(0)), ((int)(__sourceIntrinsic_794c55bd7517_invokedynamic2141_3(21721, (950843353840670602L ^ life7_3)))), ((int)(__sourceIntrinsic_794c55bd7517_invokedynamic2141_4(22831, (5927560744304728694L ^ life7_3)))), ((int)(__sourceIntrinsic_794c55bd7517_invokedynamic2141_5(21721, (950843353840670602L ^ life7_3)))), ((moom.bs)(p5)));
    if (!(moom.Hk.a(((moom.G2)(life9_35))))) {
        break forward_join_51;
    }
    if (!((moom.G4.a(((java.util.List)(p0)), ((moom.G2)(life9_35))) == null))) {
        break forward_join_51;
    }
    forwardValue2141_52_0 = new moom.Hk(p6, p1, life9_35, p5);
    break forward_join_52;
    }
    forwardValue2141_52_0 = null;
    }
    return forwardValue2141_52_0;
}


private static native <E extends Throwable> int __sourceIntrinsic_37873ff91c6a806e_originalDynamicSite2145_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_37873ff91c6a806e_originalDynamicSite2145_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_37873ff91c6a806e_originalDynamicSite2145_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_37873ff91c6a806e_originalDynamicSite2145_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_794c55bd7517_invokedynamic2141_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_794c55bd7517_invokedynamic2141_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_794c55bd7517_invokedynamic2141_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_794c55bd7517_invokedynamic2141_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_794c55bd7517_invokedynamic2141_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0f75cc6dd3c5_originalDynamicSite1166_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0f75cc6dd3c5_originalDynamicSite1166_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0f75cc6dd3c5_originalDynamicSite1166_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic765_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic765_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic765_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic765_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic765_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic765_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic765_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic765_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic765_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic765_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic765_27(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic765_28(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic765_29(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic765_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic765_36(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic765_37(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic765_38(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic765_44(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic765_45(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic765_46(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic765_47(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic765_53(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic765_54(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic765_55(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic765_61(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic765_62(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic765_63(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic765_64(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic765_70(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic765_71(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic765_72(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic765_78(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic765_79(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic765_80(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic765_81(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic765_87(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic765_88(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic765_89(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic765_95(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic765_96(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic765_97(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic765_98(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic765_104(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic765_105(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic765_111(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic765_112(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic765_113(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic765_114(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic765_120(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic765_121(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic765_127(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic765_128(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic765_129(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic765_130(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic765_136(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic765_137(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic765_143(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic765_145(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic765_146(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic765_152(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic765_153(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic765_154(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic765_155(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic765_161(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic765_162(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic765_168(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic765_169(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic765_170(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic765_171(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic765_177(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic765_178(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic765_184(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4846_0() throws E;
}
