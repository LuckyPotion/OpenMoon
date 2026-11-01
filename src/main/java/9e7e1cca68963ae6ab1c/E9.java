package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class E9 extends net.minecraft.world.biome.BiomeGenBase {

private static final moom.F7 aG;

private static final long cb;

private static final long[] gb;

private static final java.lang.Integer[] hb;

private static final java.util.Map ib;

protected E9(int p0) {
super(((int)(p0)));
    ((java.util.List)(((moom.E9)(this)).aw)).add(((java.lang.Object)(new moom.D7(net.minecraft.entity.passive.EntityHorse.class, 1, 2, 6))));
    ((moom.EQ)(((moom.E9)(this)).au)).A = ((int)(1));
    ((moom.EQ)(((moom.E9)(this)).au)).B = ((int)(4));
    ((moom.EQ)(((moom.E9)(this)).au)).C = ((int)(20));
    return;
}


static {
cb = ((long)(((moom._a)(moom._c.a(((long)(-5214820887508648064L)), ((long)(1555625571711790649L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(112841979384354L)))));
    ib = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.E9.cb ^ 8900486444343L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill702_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill702_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill702_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill702_14 = new byte[8];
    (__sourceSpill702_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill702_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation702_16 = __sourceSpill702_14;
    ((javax.crypto.Cipher)(__sourceSpill702_11)).init(((int)(__sourceSpill702_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill702_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation702_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[6];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "þ\005\026\007ÂÄ¯Sño& Óò¿þiÐoWÌÏ£9Xz"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill702_25 = local6_life21;
        int __sourceSpill702_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill702_25)).substring(((int)(__sourceSpill702_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill702_30 = local8_life19;
        int __sourceSpill702_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill702_33 = new byte[8];
        (__sourceSpill702_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill702_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill702_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill702_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill702_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill702_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill702_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill702_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill702_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill702_34)).doFinal(((byte[])(__sourceSpill702_33)));
        (__sourceSpill702_30)[__sourceSpill702_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "¾mÖ\t·l¤É!CH"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill702_38 = local6_life21;
        int __sourceSpill702_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill702_38)).substring(((int)(__sourceSpill702_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill702_43 = local8_life19;
        int __sourceSpill702_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill702_46 = new byte[8];
        (__sourceSpill702_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill702_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill702_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill702_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill702_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill702_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill702_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill702_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill702_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill702_47)).doFinal(((byte[])(__sourceSpill702_46)));
        (__sourceSpill702_43)[__sourceSpill702_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    gb = ((long[])(local8_life19));
    hb = ((java.lang.Integer[])(new java.lang.Integer[6]));
    aG = ((moom.F7)(new moom.F7(false)));
}


private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x333A;
        if (hb[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = gb[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])ib.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    ib.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/E9", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            E9.hb[n2] = n4;
        }
        return hb[n2];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.E9.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4288_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/E9"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


protected net.minecraft.world.biome.BiomeGenBase d(int p0) {
moom.E5 local2 = new moom.E5(p0, this);
    ((net.minecraft.world.biome.BiomeGenBase)(local2)).ar = ((float)(((((moom.E9)(this)).ar + 0x1.0p0f) * 0x1.0p-1f)));
    ((net.minecraft.world.biome.BiomeGenBase)(local2)).ap = ((float)(((((moom.E9)(this)).ap * 0x1.0p-1f) + 0x1.333334p-2f)));
    ((net.minecraft.world.biome.BiomeGenBase)(local2)).aq = ((float)(((((moom.E9)(this)).aq * 0x1.0p-1f) + 0x1.333334p0f)));
    return local2;
}


public moom.F0 a(java.util.Random p0) {
long local2 = (moom.E9.cb ^ 123136404663276L);
    return ((((java.util.Random)(p0)).nextInt(((int)(5))) > 0) ? moom.E9.aG : ((moom.E9)(this)).aC);
}


public void a(net.minecraft.world.World p0, java.util.Random p1, moom.DT p2) {
java.lang.String spill573_0;
    long life4_3;
    int life7_9;
    java.lang.String life6_10;
    int life8_31;
    int life9_45;
    int life10_62;
    lexical_join_83: {
    lexical_join_78: {
    life4_3 = (moom.E9.cb ^ 65759935407933L);
    ((moom.Gi)(moom.E9.ai)).a(((net.minecraft.block.BlockDoublePlant$EnumPlantType)(net.minecraft.block.BlockDoublePlant$EnumPlantType.GRASS)));
    spill573_0 = net.minecraft.world.biome.WorldChunkManager.b();
    life7_9 = 0;
    life6_10 = spill573_0;
    lexical_cycle_11: while (true) {
    if (!((life7_9 < __sourceIntrinsic_83c0409717df_invokedynamic573_5(28502, (3389522581282112360L ^ life4_3))))) {
        break lexical_join_78;
    }
    life8_31 = (((java.util.Random)(p1)).nextInt(((int)(__sourceIntrinsic_83c0409717df_invokedynamic573_6(17473, (1657062437629913213L ^ life4_3))))) + __sourceIntrinsic_83c0409717df_invokedynamic573_8(3090, (2100100246461259823L ^ life4_3)));
    life9_45 = (((java.util.Random)(p1)).nextInt(((int)(__sourceIntrinsic_83c0409717df_invokedynamic573_9(11099, (9161278427380385634L ^ life4_3))))) + __sourceIntrinsic_83c0409717df_invokedynamic573_11(8769, (281383932074593918L ^ life4_3)));
    life10_62 = ((java.util.Random)(p1)).nextInt(((int)((((moom.DT)(((net.minecraft.world.World)(p0)).a__DT(((moom.DT)(((moom.DT)(p2)).a(((int)(life8_31)), ((int)(0)), ((int)(life9_45)))))))).b() + __sourceIntrinsic_83c0409717df_invokedynamic573_15(14088, (8730645417192692528L ^ life4_3))))));
    ((moom.Gi)(moom.E9.ai)).a__Boolean(((net.minecraft.world.World)(p0)), ((java.util.Random)(p1)), ((moom.DT)(((moom.DT)(p2)).a(((int)(life8_31)), ((int)(life10_62)), ((int)(life9_45))))));
    life7_9 += 1;
    if (!((life6_10 == null))) {
        break lexical_join_83;
    }
    if (!((life6_10 != null))) { continue lexical_cycle_11; }
    break lexical_cycle_11;
    }
    }
    super.a(((net.minecraft.world.World)(p0)), ((java.util.Random)(p1)), ((moom.DT)(p2)));
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4288_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_83c0409717df_invokedynamic573_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_83c0409717df_invokedynamic573_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_83c0409717df_invokedynamic573_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_83c0409717df_invokedynamic573_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_83c0409717df_invokedynamic573_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_83c0409717df_invokedynamic573_15(int a0, long a1) throws E;
}
