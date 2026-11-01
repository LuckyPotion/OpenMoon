package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Gy extends moom.FY {

private final net.minecraft.block.Block c;

private static final long d;

private static final long[] e;

private static final java.lang.Integer[] f;

private static final java.util.Map g;

public Gy(net.minecraft.block.Block p0) {
super();
    this.c = p0;
}


static {
d = ((long)(((moom._a)(moom._c.a(((long)(1411835197009985861L)), ((long)(-5558408557774710631L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(221980136565844L)))));
    g = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.Gy.d ^ 5855899830620L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill566_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill566_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill566_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill566_14 = new byte[8];
    (__sourceSpill566_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill566_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation566_16 = __sourceSpill566_14;
    ((javax.crypto.Cipher)(__sourceSpill566_11)).init(((int)(__sourceSpill566_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill566_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation566_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[3];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "äM*Vö0Eãy·\f \026ãµu\033å¸Ã¬"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill566_25 = local6_life21;
        int __sourceSpill566_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill566_25)).substring(((int)(__sourceSpill566_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill566_30 = local8_life19;
        int __sourceSpill566_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill566_33 = new byte[8];
        (__sourceSpill566_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill566_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill566_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill566_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill566_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill566_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill566_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill566_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill566_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill566_34)).doFinal(((byte[])(__sourceSpill566_33)));
        (__sourceSpill566_30)[__sourceSpill566_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    e = ((long[])(local8_life19));
    f = ((java.lang.Integer[])(new java.lang.Integer[3]));
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral4705_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Gy"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.Gy.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x6E44;
        if (f[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = e[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])g.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    g.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/Gy", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Gy.f[n2] = n3;
        }
        return f[n2];
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public boolean a__Boolean(net.minecraft.world.World p0, java.util.Random p1, moom.DT p2) {
int forestValue665_54_0;
    int forestValue665_54_1;
    int forestValue665_121_0;
    int forestValue665_123_0;
    int forestValue665_140_0;
    int forestValue665_140_1;
    int forestValue665_147_0;
    int forestValue665_147_1;
    int forestValue665_254_0;
    boolean spill665_0;
    int spill665_1;
    int spill665_2;
    int spill665_3;
    int spill665_4;
    int spill665_5;
    int spill665_6;
    int spill665_7;
    int spill665_8;
    long life4_3;
    int[] life6_5;
    int life7_35;
    int life8_41;
    moom.DU life9_45;
    int life10_50;
    int life11_63;
    int life12_74;
    int life13_79;
    int life10_125;
    int life11_147;
    int life12_160;
    int life13_171;
    int life14_176;
    moom.tw life10_221;
    forest_join_254: {
    forest_join_253: {
    forest_join_209: {
    forest_join_121: {
    forest_join_119: {
    forest_join_117: {
    life4_3 = (moom.Gy.d ^ 37097606038340L);
    life6_5 = moom.FY.b();
    spill665_0 = ((net.minecraft.world.World)(p0)).a__Boolean(((moom.DT)(p2)));
    if (!((life6_5 != null))) {
        forestValue665_254_0 = ((spill665_0) ? 1 : 0);
        break forest_join_254;
    }
    if (!(spill665_0)) {
        break forest_join_253;
    }
    if (!((((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p2)).b__DT()))))).a__ch() == this.c))) {
        break forest_join_253;
    }
    life7_35 = (((java.util.Random)(p1)).nextInt(((int)(__sourceIntrinsic_e7ba66b54646_invokedynamic665_8(25915, (1749063043912994306L ^ life4_3))))) + __sourceIntrinsic_e7ba66b54646_invokedynamic665_10(16899, (5111721544009296184L ^ life4_3)));
    life8_41 = (((java.util.Random)(p1)).nextInt(((int)(4))) + 1);
    life9_45 = new moom.DU();
    life10_50 = (((moom.DT)(p2)).a() - life8_41);
    forest_cycle_49: while (true) {
    forest_join_113: {
    forestValue665_54_0 = life10_50;
    forestValue665_54_1 = (((moom.DT)(p2)).a() + life8_41);
    forest_cycle_54: while (true) {
    if (!((forestValue665_54_0 <= forestValue665_54_1))) {
        break forest_join_119;
    }
    spill665_1 = (((moom.DT)(p2)).c() - life8_41);
    if (!((life6_5 != null))) {
        forestValue665_121_0 = spill665_1;
        break forest_join_121;
    }
    life11_63 = spill665_1;
    forest_cycle_62: while (true) {
    forest_join_111: {
    forest_join_110: {
    if (!((life11_63 <= (((moom.DT)(p2)).c() + life8_41)))) {
        break forest_join_113;
    }
    life12_74 = (life10_50 - ((moom.DT)(p2)).a());
    life13_79 = (life11_63 - ((moom.DT)(p2)).c());
    if (!((life6_5 != null))) {
        break forest_join_111;
    }
    spill665_2 = ((life12_74 * life12_74) + (life13_79 * life13_79));
    spill665_3 = ((life8_41 * life8_41) + 1);
    if (!((life6_5 != null))) {
        forestValue665_54_0 = spill665_2;
        forestValue665_54_1 = spill665_3;
        continue forest_cycle_54;
    }
    if (!((spill665_2 <= spill665_3))) {
        break forest_join_110;
    }
    if (!((((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DU)(life9_45)).a(((int)(life10_50)), ((int)((((moom.DT)(p2)).b() - 1))), ((int)(life11_63)))))))).a__ch() != this.c))) {
        break forest_join_110;
    }
    break forest_join_117;
    }
    life11_63 += 1;
    }
    if (!((life6_5 == null))) {
        continue forest_cycle_62;
    }
    break forest_cycle_62;
    }
    break forest_cycle_54;
    }
    }
    life10_50 += 1;
    if (!((life6_5 == null))) {
        continue forest_cycle_49;
    }
    break forest_cycle_49;
    }
    break forest_join_119;
    }
    return ((0) != 0);
    }
    forestValue665_121_0 = ((moom.DT)(p2)).b();
    }
    life10_125 = forestValue665_121_0;
    forest_cycle_122: while (true) {
    forest_join_206: {
    forestValue665_123_0 = life10_125;
    forest_cycle_123: while (true) {
    forest_join_140: {
    if (!((forestValue665_123_0 < (((moom.DT)(p2)).b() + life7_35)))) {
        break forest_join_209;
    }
    spill665_4 = life10_125;
    spill665_5 = __sourceIntrinsic_e7ba66b54646_invokedynamic665_26(2858, (3801330015181725712L ^ life4_3));
    if (!((life6_5 != null))) {
        forestValue665_140_0 = spill665_4;
        forestValue665_140_1 = spill665_5;
        break forest_join_140;
    }
    if (!((spill665_4 < spill665_5))) {
        break forest_join_209;
    }
    forestValue665_140_0 = ((moom.DT)(p2)).a();
    forestValue665_140_1 = life8_41;
    }
    life11_147 = (forestValue665_140_0 - forestValue665_140_1);
    forest_cycle_142: while (true) {
    forest_join_203: {
    forestValue665_147_0 = life11_147;
    forestValue665_147_1 = (((moom.DT)(p2)).a() + life8_41);
    forest_cycle_147: while (true) {
    if (!((forestValue665_147_0 <= forestValue665_147_1))) {
        break forest_join_206;
    }
    spill665_6 = (((moom.DT)(p2)).c() - life8_41);
    if (!((life6_5 != null))) {
        forestValue665_123_0 = spill665_6;
        continue forest_cycle_123;
    }
    life12_160 = spill665_6;
    forest_cycle_155: while (true) {
    forest_join_201: {
    forest_join_200: {
    if (!((life12_160 <= (((moom.DT)(p2)).c() + life8_41)))) {
        break forest_join_203;
    }
    life13_171 = (life11_147 - ((moom.DT)(p2)).a());
    life14_176 = (life12_160 - ((moom.DT)(p2)).c());
    if (!((life6_5 != null))) {
        break forest_join_201;
    }
    spill665_7 = ((life13_171 * life13_171) + (life14_176 * life14_176));
    spill665_8 = ((life8_41 * life8_41) + 1);
    if (!((life6_5 != null))) {
        forestValue665_147_0 = spill665_7;
        forestValue665_147_1 = spill665_8;
        continue forest_cycle_147;
    }
    if (!((spill665_7 <= spill665_8))) {
        break forest_join_200;
    }
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(new moom.DT(life11_147, life10_125, life12_160))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.Z)).a__fE())), ((int)(2)));
    }
    life12_160 += 1;
    }
    if (!((life6_5 == null))) {
        continue forest_cycle_155;
    }
    break forest_cycle_155;
    }
    break forest_cycle_147;
    }
    }
    life11_147 += 1;
    if (!((life6_5 == null))) {
        continue forest_cycle_142;
    }
    break forest_cycle_142;
    }
    break forest_cycle_123;
    }
    }
    life10_125 += 1;
    if (!((life6_5 == null))) {
        continue forest_cycle_122;
    }
    break forest_cycle_122;
    }
    }
    life10_221 = new moom.tw(p0);
    ((net.minecraft.entity.Entity)(life10_221)).c(((double)(((double) (((float) ((moom.DT)(p2)).a()) + 0x1.0p-1f)))), ((double)(((double) (((moom.DT)(p2)).b() + life7_35)))), ((double)(((double) (((float) ((moom.DT)(p2)).c()) + 0x1.0p-1f)))), ((float)((((java.util.Random)(p1)).nextFloat() * 0x1.68p8f))), ((float)(0x0.0p0f)));
    ((net.minecraft.world.World)(p0)).b__Boolean(((net.minecraft.entity.Entity)(life10_221)));
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(((moom.DT)(p2)).a(((int)(life7_35))))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.h)).a__fE())), ((int)(2)));
    return ((1) != 0);
    }
    forestValue665_254_0 = 0;
    }
    return ((forestValue665_254_0) != 0);
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral4705_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7ba66b54646_invokedynamic665_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7ba66b54646_invokedynamic665_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7ba66b54646_invokedynamic665_26(int a0, long a1) throws E;
}
