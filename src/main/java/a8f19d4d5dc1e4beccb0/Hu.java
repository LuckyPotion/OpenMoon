package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Hu extends moom.Hs {

private static final long p;

private static final long[] q;

private static final java.lang.Integer[] r;

private static final java.util.Map t;

public Hu() {
super();
}


public Hu(moom.bs p0, moom.Il p1, java.util.Random p2) {
super(1, p0, p1, 2, 2, 1);
}


static {
p = ((long)(((moom._a)(moom._c.a(((long)(-1291132809242977288L)), ((long)(-341349893468266843L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(213538502734165L)))));
    t = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.Hu.p ^ 5301349432871L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill847_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill847_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill847_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill847_14 = new byte[8];
    (__sourceSpill847_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill847_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation847_16 = __sourceSpill847_14;
    ((javax.crypto.Cipher)(__sourceSpill847_11)).init(((int)(__sourceSpill847_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill847_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation847_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[21];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "\016k¿)\025ªoÇ9´hÔ-oTU\021Xïö!p=J<\036\005IúãVFRÛý\030ªlô\001|¬\177- \006\027$H[`UK4µµÐà)¨\003\021\177Ð¥ Ì\034AÝ-²\017\013\016ù#Ó\0134ÒiW.¡î\nÏ\003\007kì\025VÛ:uÑê7Vµ\017\005Ï!\006ï8\\ç²\037ÈPÙöIç\r÷oçe=\033Ã¤jm"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill847_25 = local6_life21;
        int __sourceSpill847_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill847_25)).substring(((int)(__sourceSpill847_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill847_30 = local8_life19;
        int __sourceSpill847_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill847_33 = new byte[8];
        (__sourceSpill847_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill847_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill847_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill847_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill847_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill847_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill847_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill847_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill847_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill847_34)).doFinal(((byte[])(__sourceSpill847_33)));
        (__sourceSpill847_30)[__sourceSpill847_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "æÐD_ðW\"ø{ ÀÒIö"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill847_38 = local6_life21;
        int __sourceSpill847_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill847_38)).substring(((int)(__sourceSpill847_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill847_43 = local8_life19;
        int __sourceSpill847_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill847_46 = new byte[8];
        (__sourceSpill847_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill847_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill847_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill847_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill847_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill847_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill847_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill847_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill847_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill847_47)).doFinal(((byte[])(__sourceSpill847_46)));
        (__sourceSpill847_43)[__sourceSpill847_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    q = ((long[])(local8_life19));
    r = ((java.lang.Integer[])(new java.lang.Integer[21]));
}


private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x3312;
        if (r[n2] == null) {
            
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
                throw new RuntimeException("moom/Hu", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Hu.r[n2] = n3;
        }
        return r[n2];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.Hu.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4874_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Hu"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public boolean a__Boolean(net.minecraft.world.World p0, java.util.Random p1, moom.G2 p2) {
moom.Il lexicalValue774_71_0;
    moom.Il lexicalValue774_106_0;
    int lexicalValue774_162_0;
    int lexicalValue774_162_1;
    int lexicalValue774_668_0;
    int lexicalValue774_687_0;
    int lexicalValue774_714_0;
    int lexicalValue774_733_0;
    int lexicalValue774_760_0;
    int lexicalValue774_795_0;
    int lexicalValue774_822_0;
    int lexicalValue774_845_0;
    int lexicalValue774_876_0;
    int lexicalValue774_899_0;
    int lexicalValue774_930_0;
    int lexicalValue774_969_0;
    int lexicalValue774_996_0;
    net.minecraft.entity.Entity[] spill774_0;
    moom.Il spill774_1;
    int spill774_2;
    int spill774_3;
    long life4_3;
    moom.Il life7_11;
    moom.Il life8_14;
    moom.Il life9_20;
    net.minecraft.entity.Entity[] life6_21;
    moom.Il life10_27;
    int life11_154;
    net.minecraft.block.state.IBlockState life12_163;
    lexical_join_996: {
    lexical_join_995: {
    lexical_join_969: {
    lexical_join_964: {
    lexical_join_930: {
    lexical_join_925: {
    lexical_join_899: {
    lexical_join_894: {
    lexical_join_876: {
    lexical_join_871: {
    lexical_join_845: {
    lexical_join_840: {
    lexical_join_822: {
    lexical_join_817: {
    lexical_join_795: {
    lexical_join_790: {
    lexical_join_760: {
    lexical_join_755: {
    lexical_join_733: {
    lexical_join_728: {
    lexical_join_714: {
    lexical_join_709: {
    lexical_join_687: {
    lexical_join_682: {
    lexical_join_668: {
    lexical_join_252: {
    lexical_join_138: {
    lexical_join_106: {
    lexical_join_101: {
    lexical_join_71: {
    lexical_join_66: {
    life4_3 = (moom.Hu.p ^ 43994689792549L);
    spill774_0 = moom.G4.b();
    life7_11 = (((moom.Il)(((moom.Hu)(this)).o)).b)[((moom.bs)(moom.bs.EAST)).a()];
    life8_14 = ((moom.Hu)(this)).o;
    life9_20 = (((moom.Il)(life8_14)).b)[((moom.bs)(moom.bs.UP)).a()];
    life6_21 = spill774_0;
    life10_27 = (((moom.Il)(life7_11)).b)[((moom.bs)(moom.bs.UP)).a()];
    spill774_1 = ((moom.Hu)(this)).o;
    if (!((life6_21 != null))) {
        lexicalValue774_71_0 = spill774_1;
        break lexical_join_71;
    }
    if (!(((((moom.Il)(spill774_1)).a / __sourceIntrinsic_5ac1d031d896_invokedynamic774_15(4405, (4198905778451235074L ^ life4_3))) > 0))) {
        break lexical_join_66;
    }
    ((moom.Hu)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic774_16(17861, (8153308346357126653L ^ life4_3)))), ((int)(0)), ((boolean)((((moom.Il)(life7_11)).c)[((moom.bs)(moom.bs.DOWN)).a()])));
    ((moom.Hu)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(0)), ((boolean)((((moom.Il)(life8_14)).c)[((moom.bs)(moom.bs.DOWN)).a()])));
    }
    lexicalValue774_71_0 = (((moom.Il)(life9_20)).b)[((moom.bs)(moom.bs.UP)).a()];
    }
    if (!((life6_21 != null))) {
        lexicalValue774_106_0 = lexicalValue774_71_0;
        break lexical_join_106;
    }
    if (!((lexicalValue774_71_0 == null))) {
        break lexical_join_101;
    }
    ((moom.Hu)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic774_28(2041, (7516427946970077131L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic774_29(26220, (5888032159127811649L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic774_30(2041, (7516427946970077131L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic774_31(7103, (6820697057920961409L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hu.e)));
    }
    lexicalValue774_106_0 = (((moom.Il)(life10_27)).b)[((moom.bs)(moom.bs.UP)).a()];
    }
    if (!((lexicalValue774_106_0 == null))) {
        break lexical_join_138;
    }
    ((moom.Hu)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic774_37(2041, (7516427946970077131L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic774_38(2041, (7516427946970077131L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic774_39(5925, (5898699378726618894L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic774_40(2041, (7516427946970077131L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic774_41(18271, (6981264216571320165L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hu.e)));
    }
    life11_154 = 1;
    lexical_cycle_140: while (true) {
    lexical_join_165: {
    lexical_join_163: {
    lexical_join_162: {
    if (!((life11_154 <= __sourceIntrinsic_5ac1d031d896_invokedynamic774_44(2830, (6329181710202100539L ^ life4_3))))) {
        break lexical_join_252;
    }
    life12_163 = moom.Hu.f;
    spill774_2 = life11_154;
    if (!((life6_21 != null))) {
        lexicalValue774_668_0 = spill774_2;
        break lexical_join_668;
    }
    spill774_3 = 2;
    if (!((life6_21 != null))) {
        lexicalValue774_162_0 = spill774_2;
        lexicalValue774_162_1 = spill774_3;
        break lexical_join_162;
    }
    if (!((spill774_2 != spill774_3))) {
        break lexical_join_163;
    }
    lexicalValue774_162_0 = life11_154;
    lexicalValue774_162_1 = __sourceIntrinsic_5ac1d031d896_invokedynamic774_46(18271, (6981264216571320165L ^ life4_3));
    }
    if (!((lexicalValue774_162_0 == lexicalValue774_162_1))) {
        break lexical_join_165;
    }
    }
    life12_163 = moom.Hu.e;
    }
    ((moom.Hu)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(life11_154)), ((int)(0)), ((int)(0)), ((int)(life11_154)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic774_48(2830, (6329181710202100539L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(life12_163)), ((net.minecraft.block.state.IBlockState)(life12_163)), ((boolean)(false)));
    ((moom.Hu)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic774_50(15397, (3366444417162734604L ^ life4_3)))), ((int)(life11_154)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic774_51(18032, (2139099535789069899L ^ life4_3)))), ((int)(life11_154)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic774_52(2830, (6329181710202100539L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(life12_163)), ((net.minecraft.block.state.IBlockState)(life12_163)), ((boolean)(false)));
    ((moom.Hu)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(life11_154)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic774_54(18032, (2139099535789069899L ^ life4_3)))), ((int)(life11_154)), ((int)(0)), ((net.minecraft.block.state.IBlockState)(life12_163)), ((net.minecraft.block.state.IBlockState)(life12_163)), ((boolean)(false)));
    ((moom.Hu)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(life11_154)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic774_56(2830, (6329181710202100539L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic774_57(16511, (6493639305642119247L ^ life4_3)))), ((int)(life11_154)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic774_58(2830, (6329181710202100539L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(life12_163)), ((net.minecraft.block.state.IBlockState)(life12_163)), ((boolean)(false)));
    life11_154 += 1;
    if (!((life6_21 == null))) { continue lexical_cycle_140; }
    break lexical_cycle_140;
    }
    }
    ((moom.Hu)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(2)), ((int)(1)), ((int)(3)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic774_60(2830, (6329181710202100539L ^ life4_3)))), ((int)(4)), ((net.minecraft.block.state.IBlockState)(moom.Hu.f)), ((net.minecraft.block.state.IBlockState)(moom.Hu.f)), ((boolean)(false)));
    ((moom.Hu)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(3)), ((int)(1)), ((int)(2)), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic774_64(2830, (6329181710202100539L ^ life4_3)))), ((int)(2)), ((net.minecraft.block.state.IBlockState)(moom.Hu.f)), ((net.minecraft.block.state.IBlockState)(moom.Hu.f)), ((boolean)(false)));
    ((moom.Hu)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(3)), ((int)(1)), ((int)(5)), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic774_68(2830, (6329181710202100539L ^ life4_3)))), ((int)(5)), ((net.minecraft.block.state.IBlockState)(moom.Hu.f)), ((net.minecraft.block.state.IBlockState)(moom.Hu.f)), ((boolean)(false)));
    ((moom.Hu)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic774_72(15110, (1085861881614232383L ^ life4_3)))), ((int)(1)), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic774_73(25234, (3359928308345582244L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic774_74(2830, (6329181710202100539L ^ life4_3)))), ((int)(4)), ((net.minecraft.block.state.IBlockState)(moom.Hu.f)), ((net.minecraft.block.state.IBlockState)(moom.Hu.f)), ((boolean)(false)));
    ((moom.Hu)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic774_78(14137, (9207518925232334596L ^ life4_3)))), ((int)(1)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic774_79(9296, (7392382547930870906L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic774_80(2830, (6329181710202100539L ^ life4_3)))), ((int)(2)), ((net.minecraft.block.state.IBlockState)(moom.Hu.f)), ((net.minecraft.block.state.IBlockState)(moom.Hu.f)), ((boolean)(false)));
    ((moom.Hu)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic774_84(2404, (8645640387619346776L ^ life4_3)))), ((int)(1)), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic774_85(2682, (8510287601833237061L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic774_86(2830, (6329181710202100539L ^ life4_3)))), ((int)(5)), ((net.minecraft.block.state.IBlockState)(moom.Hu.f)), ((net.minecraft.block.state.IBlockState)(moom.Hu.f)), ((boolean)(false)));
    ((moom.Hu)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(5)), ((int)(1)), ((int)(3)), ((int)(5)), ((int)(3)), ((int)(4)), ((net.minecraft.block.state.IBlockState)(moom.Hu.f)), ((net.minecraft.block.state.IBlockState)(moom.Hu.f)), ((boolean)(false)));
    ((moom.Hu)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic774_93(12510, (6853281617474806006L ^ life4_3)))), ((int)(1)), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic774_94(13769, (5195338809506784760L ^ life4_3)))), ((int)(3)), ((int)(4)), ((net.minecraft.block.state.IBlockState)(moom.Hu.f)), ((net.minecraft.block.state.IBlockState)(moom.Hu.f)), ((boolean)(false)));
    ((moom.Hu)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic774_98(2830, (6329181710202100539L ^ life4_3)))), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic774_99(13769, (5195338809506784760L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic774_100(2830, (6329181710202100539L ^ life4_3)))), ((int)(5)), ((net.minecraft.block.state.IBlockState)(moom.Hu.f)), ((net.minecraft.block.state.IBlockState)(moom.Hu.f)), ((boolean)(false)));
    ((moom.Hu)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(5)), ((int)(5)), ((int)(2)), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic774_104(2830, (6329181710202100539L ^ life4_3)))), ((int)(2)), ((net.minecraft.block.state.IBlockState)(moom.Hu.f)), ((net.minecraft.block.state.IBlockState)(moom.Hu.f)), ((boolean)(false)));
    ((moom.Hu)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic774_108(13769, (5195338809506784760L ^ life4_3)))), ((int)(5)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic774_109(13769, (5195338809506784760L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic774_110(2830, (6329181710202100539L ^ life4_3)))), ((int)(2)), ((net.minecraft.block.state.IBlockState)(moom.Hu.f)), ((net.minecraft.block.state.IBlockState)(moom.Hu.f)), ((boolean)(false)));
    ((moom.Hu)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(5)), ((int)(5)), ((int)(5)), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic774_114(2830, (6329181710202100539L ^ life4_3)))), ((int)(5)), ((net.minecraft.block.state.IBlockState)(moom.Hu.f)), ((net.minecraft.block.state.IBlockState)(moom.Hu.f)), ((boolean)(false)));
    ((moom.Hu)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic774_118(13769, (5195338809506784760L ^ life4_3)))), ((int)(5)), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic774_119(13769, (5195338809506784760L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic774_120(2830, (6329181710202100539L ^ life4_3)))), ((int)(5)), ((net.minecraft.block.state.IBlockState)(moom.Hu.f)), ((net.minecraft.block.state.IBlockState)(moom.Hu.f)), ((boolean)(false)));
    ((moom.Hu)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.Hu.f)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic774_125(18271, (6981264216571320165L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic774_126(18271, (6981264216571320165L ^ life4_3)))), ((int)(2)), ((moom.G2)(p2)));
    ((moom.Hu)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.Hu.f)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic774_129(29564, (2459444635255284552L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic774_130(18271, (6981264216571320165L ^ life4_3)))), ((int)(2)), ((moom.G2)(p2)));
    ((moom.Hu)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.Hu.f)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic774_133(18271, (6981264216571320165L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic774_134(18271, (6981264216571320165L ^ life4_3)))), ((int)(5)), ((moom.G2)(p2)));
    ((moom.Hu)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.Hu.f)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic774_137(30885, (2412516551663626390L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic774_138(18271, (6981264216571320165L ^ life4_3)))), ((int)(5)), ((moom.G2)(p2)));
    ((moom.Hu)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(5)), ((int)(4)), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic774_140(18271, (6981264216571320165L ^ life4_3)))), ((int)(4)), ((int)(4)), ((net.minecraft.block.state.IBlockState)(moom.Hu.f)), ((net.minecraft.block.state.IBlockState)(moom.Hu.f)), ((boolean)(false)));
    ((moom.Hu)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic774_144(30885, (2412516551663626390L ^ life4_3)))), ((int)(4)), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic774_145(13769, (5195338809506784760L ^ life4_3)))), ((int)(4)), ((int)(4)), ((net.minecraft.block.state.IBlockState)(moom.Hu.f)), ((net.minecraft.block.state.IBlockState)(moom.Hu.f)), ((boolean)(false)));
    ((moom.Hu)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.Hu.i)), ((int)(5)), ((int)(4)), ((int)(2)), ((moom.G2)(p2)));
    ((moom.Hu)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.Hu.i)), ((int)(5)), ((int)(4)), ((int)(5)), ((moom.G2)(p2)));
    ((moom.Hu)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.Hu.i)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic774_154(13769, (5195338809506784760L ^ life4_3)))), ((int)(4)), ((int)(2)), ((moom.G2)(p2)));
    ((moom.Hu)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.Hu.i)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic774_157(13769, (5195338809506784760L ^ life4_3)))), ((int)(4)), ((int)(5)), ((moom.G2)(p2)));
    lexicalValue774_668_0 = (((((moom.Il)(life8_14)).c)[((moom.bs)(moom.bs.SOUTH)).a()]) ? 1 : 0);
    }
    if (!((life6_21 != null))) {
        lexicalValue774_687_0 = lexicalValue774_668_0;
        break lexical_join_687;
    }
    if (!((lexicalValue774_668_0 != 0))) {
        break lexical_join_682;
    }
    ((moom.Hu)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(3)), ((int)(1)), ((int)(0)), ((int)(4)), ((int)(2)), ((int)(0)), ((boolean)(false)));
    }
    lexicalValue774_687_0 = (((((moom.Il)(life8_14)).c)[((moom.bs)(moom.bs.NORTH)).a()]) ? 1 : 0);
    }
    if (!((life6_21 != null))) {
        lexicalValue774_714_0 = lexicalValue774_687_0;
        break lexical_join_714;
    }
    if (!((lexicalValue774_687_0 != 0))) {
        break lexical_join_709;
    }
    ((moom.Hu)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(3)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic774_168(2830, (6329181710202100539L ^ life4_3)))), ((int)(4)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic774_169(2830, (6329181710202100539L ^ life4_3)))), ((boolean)(false)));
    }
    lexicalValue774_714_0 = (((((moom.Il)(life8_14)).c)[((moom.bs)(moom.bs.WEST)).a()]) ? 1 : 0);
    }
    if (!((life6_21 != null))) {
        lexicalValue774_733_0 = lexicalValue774_714_0;
        break lexical_join_733;
    }
    if (!((lexicalValue774_714_0 != 0))) {
        break lexical_join_728;
    }
    ((moom.Hu)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(1)), ((int)(3)), ((int)(0)), ((int)(2)), ((int)(4)), ((boolean)(false)));
    }
    lexicalValue774_733_0 = (((((moom.Il)(life7_11)).c)[((moom.bs)(moom.bs.SOUTH)).a()]) ? 1 : 0);
    }
    if (!((life6_21 != null))) {
        lexicalValue774_760_0 = lexicalValue774_733_0;
        break lexical_join_760;
    }
    if (!((lexicalValue774_733_0 != 0))) {
        break lexical_join_755;
    }
    ((moom.Hu)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic774_180(2404, (8645640387619346776L ^ life4_3)))), ((int)(1)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic774_181(2682, (8510287601833237061L ^ life4_3)))), ((int)(2)), ((int)(0)), ((boolean)(false)));
    }
    lexicalValue774_760_0 = (((((moom.Il)(life7_11)).c)[((moom.bs)(moom.bs.NORTH)).a()]) ? 1 : 0);
    }
    if (!((life6_21 != null))) {
        lexicalValue774_795_0 = lexicalValue774_760_0;
        break lexical_join_795;
    }
    if (!((lexicalValue774_760_0 != 0))) {
        break lexical_join_790;
    }
    ((moom.Hu)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic774_187(2404, (8645640387619346776L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic774_188(2830, (6329181710202100539L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic774_189(2682, (8510287601833237061L ^ life4_3)))), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic774_190(2830, (6329181710202100539L ^ life4_3)))), ((boolean)(false)));
    }
    lexicalValue774_795_0 = (((((moom.Il)(life7_11)).c)[((moom.bs)(moom.bs.EAST)).a()]) ? 1 : 0);
    }
    if (!((life6_21 != null))) {
        lexicalValue774_822_0 = lexicalValue774_795_0;
        break lexical_join_822;
    }
    if (!((lexicalValue774_795_0 != 0))) {
        break lexical_join_817;
    }
    ((moom.Hu)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic774_196(18032, (2139099535789069899L ^ life4_3)))), ((int)(1)), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic774_197(18032, (2139099535789069899L ^ life4_3)))), ((int)(2)), ((int)(4)), ((boolean)(false)));
    }
    lexicalValue774_822_0 = (((((moom.Il)(life9_20)).c)[((moom.bs)(moom.bs.SOUTH)).a()]) ? 1 : 0);
    }
    if (!((life6_21 != null))) {
        lexicalValue774_845_0 = lexicalValue774_822_0;
        break lexical_join_845;
    }
    if (!((lexicalValue774_822_0 != 0))) {
        break lexical_join_840;
    }
    ((moom.Hu)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(3)), ((int)(5)), ((int)(0)), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic774_203(18271, (6981264216571320165L ^ life4_3)))), ((int)(0)), ((boolean)(false)));
    }
    lexicalValue774_845_0 = (((((moom.Il)(life9_20)).c)[((moom.bs)(moom.bs.NORTH)).a()]) ? 1 : 0);
    }
    if (!((life6_21 != null))) {
        lexicalValue774_876_0 = lexicalValue774_845_0;
        break lexical_join_876;
    }
    if (!((lexicalValue774_845_0 != 0))) {
        break lexical_join_871;
    }
    ((moom.Hu)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(3)), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic774_209(2830, (6329181710202100539L ^ life4_3)))), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic774_210(18271, (6981264216571320165L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic774_211(2830, (6329181710202100539L ^ life4_3)))), ((boolean)(false)));
    }
    lexicalValue774_876_0 = (((((moom.Il)(life9_20)).c)[((moom.bs)(moom.bs.WEST)).a()]) ? 1 : 0);
    }
    if (!((life6_21 != null))) {
        lexicalValue774_899_0 = lexicalValue774_876_0;
        break lexical_join_899;
    }
    if (!((lexicalValue774_876_0 != 0))) {
        break lexical_join_894;
    }
    ((moom.Hu)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(5)), ((int)(3)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic774_217(18271, (6981264216571320165L ^ life4_3)))), ((int)(4)), ((boolean)(false)));
    }
    lexicalValue774_899_0 = (((((moom.Il)(life10_27)).c)[((moom.bs)(moom.bs.SOUTH)).a()]) ? 1 : 0);
    }
    if (!((life6_21 != null))) {
        lexicalValue774_930_0 = lexicalValue774_899_0;
        break lexical_join_930;
    }
    if (!((lexicalValue774_899_0 != 0))) {
        break lexical_join_925;
    }
    ((moom.Hu)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic774_223(2404, (8645640387619346776L ^ life4_3)))), ((int)(5)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic774_224(2682, (8510287601833237061L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic774_225(18271, (6981264216571320165L ^ life4_3)))), ((int)(0)), ((boolean)(false)));
    }
    lexicalValue774_930_0 = (((((moom.Il)(life10_27)).c)[((moom.bs)(moom.bs.NORTH)).a()]) ? 1 : 0);
    }
    if (!((life6_21 != null))) {
        lexicalValue774_969_0 = lexicalValue774_930_0;
        break lexical_join_969;
    }
    if (!((lexicalValue774_930_0 != 0))) {
        break lexical_join_964;
    }
    ((moom.Hu)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic774_231(2404, (8645640387619346776L ^ life4_3)))), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic774_232(2830, (6329181710202100539L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic774_233(2682, (8510287601833237061L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic774_234(18271, (6981264216571320165L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic774_235(2830, (6329181710202100539L ^ life4_3)))), ((boolean)(false)));
    }
    lexicalValue774_969_0 = (((((moom.Il)(life10_27)).c)[((moom.bs)(moom.bs.EAST)).a()]) ? 1 : 0);
    }
    if (!((life6_21 != null))) {
        lexicalValue774_996_0 = lexicalValue774_969_0;
        break lexical_join_996;
    }
    if (!((lexicalValue774_969_0 != 0))) {
        break lexical_join_995;
    }
    ((moom.Hu)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic774_241(18032, (2139099535789069899L ^ life4_3)))), ((int)(5)), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic774_242(18032, (2139099535789069899L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic774_243(18271, (6981264216571320165L ^ life4_3)))), ((int)(4)), ((boolean)(false)));
    }
    lexicalValue774_996_0 = 1;
    }
    return ((lexicalValue774_996_0) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4874_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic774_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic774_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic774_28(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic774_29(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic774_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic774_31(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic774_37(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic774_38(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic774_39(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic774_40(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic774_41(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic774_44(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic774_46(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic774_48(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic774_50(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic774_51(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic774_52(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic774_54(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic774_56(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic774_57(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic774_58(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic774_60(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic774_64(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic774_68(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic774_72(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic774_73(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic774_74(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic774_78(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic774_79(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic774_80(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic774_84(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic774_85(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic774_86(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic774_93(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic774_94(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic774_98(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic774_99(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic774_100(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic774_104(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic774_108(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic774_109(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic774_110(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic774_114(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic774_118(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic774_119(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic774_120(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic774_125(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic774_126(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic774_129(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic774_130(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic774_133(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic774_134(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic774_137(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic774_138(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic774_140(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic774_144(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic774_145(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic774_154(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic774_157(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic774_168(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic774_169(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic774_180(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic774_181(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic774_187(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic774_188(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic774_189(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic774_190(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic774_196(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic774_197(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic774_203(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic774_209(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic774_210(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic774_211(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic774_217(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic774_223(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic774_224(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic774_225(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic774_231(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic774_232(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic774_233(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic774_234(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic774_235(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic774_241(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic774_242(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic774_243(int a0, long a1) throws E;
}
