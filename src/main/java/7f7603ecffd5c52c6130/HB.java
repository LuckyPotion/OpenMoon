package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class HB extends moom.Hs {

private static final long p;

private static final long[] q;

private static final java.lang.Integer[] r;

private static final java.util.Map t;

public HB() {
super();
}


public HB(moom.bs p0, moom.G2 p1) {
super(p0, p1);
}


static {
p = ((long)(((moom._a)(moom._c.a(((long)(-1128492505076759636L)), ((long)(8351519090231827557L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(74885434237634L)))));
    t = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.HB.p ^ 55143298299437L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill808_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill808_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill808_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill808_14 = new byte[8];
    (__sourceSpill808_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill808_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation808_16 = __sourceSpill808_14;
    ((javax.crypto.Cipher)(__sourceSpill808_11)).init(((int)(__sourceSpill808_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill808_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation808_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[16];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = ";¦\177ï3øä²vå\006Qü°S\002@\\U4½Ò}\fÈN\020ºt\030ä¢ln2Dðy´(©\033\035 z2W\017¸ÓµÀ?\\@À­¨È¶Õq0© æ\034lþm1çî\\ý\017F¢¶ô®U\026Cóh\0070#Kú\024\033T¦Tú"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill808_25 = local6_life21;
        int __sourceSpill808_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill808_25)).substring(((int)(__sourceSpill808_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill808_30 = local8_life19;
        int __sourceSpill808_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill808_33 = new byte[8];
        (__sourceSpill808_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill808_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill808_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill808_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill808_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill808_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill808_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill808_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill808_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill808_34)).doFinal(((byte[])(__sourceSpill808_33)));
        (__sourceSpill808_30)[__sourceSpill808_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = ":¤-ãØAÕÝgm]V\022#÷"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill808_38 = local6_life21;
        int __sourceSpill808_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill808_38)).substring(((int)(__sourceSpill808_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill808_43 = local8_life19;
        int __sourceSpill808_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill808_46 = new byte[8];
        (__sourceSpill808_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill808_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill808_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill808_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill808_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill808_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill808_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill808_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill808_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill808_47)).doFinal(((byte[])(__sourceSpill808_46)));
        (__sourceSpill808_43)[__sourceSpill808_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    q = ((long[])(local8_life19));
    r = ((java.lang.Integer[])(new java.lang.Integer[16]));
}


private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x71FC;
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
                throw new RuntimeException("moom/HB", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            HB.r[n2] = n3;
        }
        return r[n2];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.HB.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4727_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/HB"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public boolean a__Boolean(net.minecraft.world.World p0, java.util.Random p1, moom.G2 p2) {
int lexicalValue732_591_0;
    net.minecraft.entity.Entity[] spill732_0;
    int spill732_1;
    long life4_3;
    net.minecraft.entity.Entity[] life6_43;
    int life7_196;
    int life8_437;
    int life9_444;
    lexical_join_591: {
    lexical_join_476: {
    lexical_join_433: {
    lexical_join_237: {
    life4_3 = (moom.HB.p ^ 94177487689880L);
    ((moom.HB)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(2)), ((int)(-1)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic732_1(28990, (1450495602740126696L ^ life4_3)))), ((int)(-1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic732_2(24487, (6480092738094615926L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HB.f)), ((net.minecraft.block.state.IBlockState)(moom.HB.f)), ((boolean)(false)));
    spill732_0 = moom.G4.b();
    ((moom.HB)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(-1)), ((int)(0)), ((int)(1)), ((int)(-1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic732_7(24487, (6480092738094615926L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HB.e)), ((net.minecraft.block.state.IBlockState)(moom.HB.e)), ((boolean)(false)));
    life6_43 = spill732_0;
    ((moom.HB)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic732_11(18011, (1919079750749181068L ^ life4_3)))), ((int)(-1)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic732_12(13044, (2131811325955022884L ^ life4_3)))), ((int)(-1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic732_13(24487, (6480092738094615926L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HB.e)), ((net.minecraft.block.state.IBlockState)(moom.HB.e)), ((boolean)(false)));
    ((moom.HB)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(2)), ((int)(-1)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic732_17(24487, (6480092738094615926L ^ life4_3)))), ((int)(-1)), ((int)(1)), ((net.minecraft.block.state.IBlockState)(moom.HB.e)), ((net.minecraft.block.state.IBlockState)(moom.HB.e)), ((boolean)(false)));
    ((moom.HB)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(2)), ((int)(-1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic732_21(20027, (9008061712436944110L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic732_22(24487, (6480092738094615926L ^ life4_3)))), ((int)(-1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic732_23(29220, (1867241157050458365L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HB.e)), ((net.minecraft.block.state.IBlockState)(moom.HB.e)), ((boolean)(false)));
    ((moom.HB)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(0)), ((int)(0)), ((int)(0)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic732_27(29220, (1867241157050458365L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HB.f)), ((net.minecraft.block.state.IBlockState)(moom.HB.f)), ((boolean)(false)));
    ((moom.HB)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic732_31(29220, (1867241157050458365L ^ life4_3)))), ((int)(0)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic732_32(29220, (1867241157050458365L ^ life4_3)))), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic732_33(29220, (1867241157050458365L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HB.f)), ((net.minecraft.block.state.IBlockState)(moom.HB.f)), ((boolean)(false)));
    ((moom.HB)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(0)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic732_37(20027, (9008061712436944110L ^ life4_3)))), ((int)(0)), ((int)(0)), ((net.minecraft.block.state.IBlockState)(moom.HB.f)), ((net.minecraft.block.state.IBlockState)(moom.HB.f)), ((boolean)(false)));
    ((moom.HB)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic732_41(29220, (1867241157050458365L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic732_42(20027, (9008061712436944110L ^ life4_3)))), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic732_43(29220, (1867241157050458365L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HB.f)), ((net.minecraft.block.state.IBlockState)(moom.HB.f)), ((boolean)(false)));
    life7_196 = 2;
    lexical_cycle_197: while (true) {
    if (!((life7_196 <= __sourceIntrinsic_5ac1d031d896_invokedynamic732_47(24487, (6480092738094615926L ^ life4_3))))) {
        break lexical_join_237;
    }
    ((moom.HB)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.HB.i)), ((int)(0)), ((int)(0)), ((int)(life7_196)), ((moom.G2)(p2)));
    ((moom.HB)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.HB.i)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic732_51(29220, (1867241157050458365L ^ life4_3)))), ((int)(0)), ((int)(life7_196)), ((moom.G2)(p2)));
    ((moom.HB)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.HB.i)), ((int)(life7_196)), ((int)(0)), ((int)(0)), ((moom.G2)(p2)));
    life7_196 += 3;
    if (!((life6_43 != null))) {
        break lexical_join_433;
    }
    if (!((life6_43 == null))) { continue lexical_cycle_197; }
    break lexical_cycle_197;
    }
    }
    ((moom.HB)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(2)), ((int)(0)), ((int)(3)), ((int)(4)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic732_55(6261, (3073976943535688362L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HB.f)), ((net.minecraft.block.state.IBlockState)(moom.HB.f)), ((boolean)(false)));
    ((moom.HB)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic732_59(31748, (8894911139539250910L ^ life4_3)))), ((int)(0)), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic732_60(24487, (6480092738094615926L ^ life4_3)))), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic732_61(31748, (8894911139539250910L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HB.f)), ((net.minecraft.block.state.IBlockState)(moom.HB.f)), ((boolean)(false)));
    ((moom.HB)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(4)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic732_65(31748, (8894911139539250910L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic732_66(31748, (8894911139539250910L ^ life4_3)))), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic732_67(24487, (6480092738094615926L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HB.f)), ((net.minecraft.block.state.IBlockState)(moom.HB.f)), ((boolean)(false)));
    ((moom.HB)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.HB.f)), ((int)(5)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic732_72(1873, (4725918715889489290L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.HB)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.HB.f)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic732_75(30308, (1378013867734262972L ^ life4_3)))), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic732_76(30308, (1378013867734262972L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.HB)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.HB.f)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic732_79(6806, (2253082902190426180L ^ life4_3)))), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic732_80(3854, (5641502832902086096L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.HB)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.HB.f)), ((int)(3)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic732_83(3854, (5641502832902086096L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.HB)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(3)), ((int)(0)), ((int)(3)), ((int)(3)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic732_85(10975, (336374376832972802L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HB.g)), ((net.minecraft.block.state.IBlockState)(moom.HB.g)), ((boolean)(false)));
    ((moom.HB)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic732_89(3854, (5641502832902086096L ^ life4_3)))), ((int)(0)), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic732_90(3854, (5641502832902086096L ^ life4_3)))), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic732_91(2184, (2600745386334394971L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HB.g)), ((net.minecraft.block.state.IBlockState)(moom.HB.g)), ((boolean)(false)));
    ((moom.HB)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic732_95(30234, (7991780179762832582L ^ life4_3)))), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic732_96(3854, (5641502832902086096L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic732_97(2184, (2600745386334394971L ^ life4_3)))), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic732_98(3854, (5641502832902086096L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HB.g)), ((net.minecraft.block.state.IBlockState)(moom.HB.g)), ((boolean)(false)));
    life7_196 = 3;
    }
    life8_437 = 0;
    lexical_cycle_435: while (true) {
    lexical_join_474: {
    lexical_join_467: {
    if (!((life8_437 < 2))) {
        break lexical_join_476;
    }
    spill732_1 = 2;
    if (!((life6_43 != null))) {
        lexicalValue732_591_0 = spill732_1;
        break lexical_join_591;
    }
    life9_444 = spill732_1;
    lexical_cycle_442: while (true) {
    if (!((life9_444 <= __sourceIntrinsic_5ac1d031d896_invokedynamic732_102(30308, (1378013867734262972L ^ life4_3))))) {
        break lexical_join_467;
    }
    ((moom.HB)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(life7_196)), ((int)(0)), ((int)(life9_444)), ((int)(life7_196)), ((int)(2)), ((int)(life9_444)), ((net.minecraft.block.state.IBlockState)(moom.HB.f)), ((net.minecraft.block.state.IBlockState)(moom.HB.f)), ((boolean)(false)));
    life9_444 += 3;
    if (!((life6_43 != null))) {
        break lexical_join_474;
    }
    if (!((life6_43 == null))) { continue lexical_cycle_442; }
    break lexical_cycle_442;
    }
    }
    life7_196 = __sourceIntrinsic_5ac1d031d896_invokedynamic732_106(3854, (5641502832902086096L ^ life4_3));
    life8_437 += 1;
    }
    if (!((life6_43 == null))) { continue lexical_cycle_435; }
    break lexical_cycle_435;
    }
    }
    ((moom.HB)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(5)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic732_107(3854, (5641502832902086096L ^ life4_3)))), ((int)(5)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic732_108(3854, (5641502832902086096L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HB.f)), ((net.minecraft.block.state.IBlockState)(moom.HB.f)), ((boolean)(false)));
    ((moom.HB)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic732_112(30308, (1378013867734262972L ^ life4_3)))), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic732_113(3854, (5641502832902086096L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic732_114(30308, (1378013867734262972L ^ life4_3)))), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic732_115(3854, (5641502832902086096L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HB.f)), ((net.minecraft.block.state.IBlockState)(moom.HB.f)), ((boolean)(false)));
    ((moom.HB)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic732_119(398, (9021028320769676122L ^ life4_3)))), ((int)(-1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic732_120(2184, (2600745386334394971L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic732_121(2184, (2600745386334394971L ^ life4_3)))), ((int)(-1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic732_122(30308, (1378013867734262972L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.HB.g)), ((net.minecraft.block.state.IBlockState)(moom.HB.g)), ((boolean)(false)));
    ((moom.HB)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic732_126(398, (9021028320769676122L ^ life4_3)))), ((int)(-1)), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic732_127(2184, (2600745386334394971L ^ life4_3)))), ((int)(-1)), ((int)(4)), ((boolean)(false)));
    ((moom.HB)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic732_129(398, (9021028320769676122L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic732_130(398, (9021028320769676122L ^ life4_3)))));
    lexicalValue732_591_0 = 1;
    }
    return ((lexicalValue732_591_0) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4727_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic732_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic732_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic732_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic732_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic732_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic732_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic732_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic732_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic732_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic732_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic732_27(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic732_31(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic732_32(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic732_33(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic732_37(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic732_41(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic732_42(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic732_43(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic732_47(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic732_51(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic732_55(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic732_59(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic732_60(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic732_61(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic732_65(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic732_66(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic732_67(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic732_72(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic732_75(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic732_76(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic732_79(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic732_80(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic732_83(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic732_85(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic732_89(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic732_90(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic732_91(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic732_95(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic732_96(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic732_97(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic732_98(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic732_102(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic732_106(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic732_107(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic732_108(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic732_112(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic732_113(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic732_114(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic732_115(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic732_119(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic732_120(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic732_121(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic732_122(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic732_126(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic732_127(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic732_129(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic732_130(int a0, long a1) throws E;
}
