package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class E_ extends net.minecraft.world.biome.BiomeGenBase {

private boolean aG;

private moom.Gq aH;

private moom.Gp aI;

private static long cb;

private static long[] gb;

private static java.lang.Integer[] hb;

private static java.util.Map ib;

public E_(int p0, boolean p1) { super(0); }

private static void __sourceConstructorBody_df419b5a34daaafb(moom.E_ receiver, int p0, boolean p1) throws Throwable {
long local3 = (moom.E_.cb ^ 50733532667548L);
    moom.E_.__sourceConstructorInit_df419b5a34daaafb_0(((moom.E_)(receiver)), ((int)(p0)));
    ((moom.E_)(receiver)).aH = ((moom.Gq)(new moom.Gq()));
    ((moom.E_)(receiver)).aI = ((moom.Gp)(new moom.Gp(4)));
    ((moom.E_)(receiver)).aG = ((boolean)(p1));
    if (p1) {
        ((moom.E_)(receiver)).am = ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aJ)).a__fE()));
    }
    ((java.util.List)(((moom.E_)(receiver)).aw)).clear();
    return;
}


static {
javax.crypto.Cipher forestValue388_36_0;
    int forestValue388_36_1;
    javax.crypto.SecretKeyFactory forestValue388_36_2;
    byte[] forestValue388_36_3;
    javax.crypto.Cipher forestValue388_53_0;
    int forestValue388_53_1;
    javax.crypto.SecretKeyFactory forestValue388_53_2;
    byte[] forestValue388_53_3;
    long[] forestValue388_157_0;
    int forestValue388_157_1;
    long forestValue388_157_2;
    int forestValue388_157_3;
    long[] forestValue388_300_0;
    int forestValue388_300_1;
    long forestValue388_300_2;
    long[] forestValue388_312_0;
    int forestValue388_312_1;
    long forestValue388_312_2;
    javax.crypto.Cipher spill388_0;
    int spill388_1;
    javax.crypto.SecretKeyFactory spill388_2;
    byte[] spill388_3;
    byte[] spill388_4;
    java.lang.String spill388_5;
    int spill388_6;
    int spill388_7;
    long spill388_8;
    byte[] spill388_9;
    byte[] spill388_10;
    byte[] spill388_11;
    byte[] spill388_12;
    byte[] spill388_13;
    byte[] spill388_14;
    byte[] spill388_15;
    byte[] spill388_16;
    long spill388_17;
    int spill388_18;
    java.lang.String spill388_19;
    int spill388_20;
    long[] spill388_21;
    int spill388_22;
    long spill388_23;
    int spill388_24;
    long life0_16;
    javax.crypto.Cipher life2_20;
    int life3_35;
    long[] life8_66;
    int life5_68;
    java.lang.String life6_71;
    int life7_73;
    int life4_75;
    byte[] life9_83;
    long life10_160;
    byte[] life12_228;
    byte[] life9_325;
    forest_join_399: {
    forest_join_53: {
    cb = ((long)(((moom._a)(moom._c.a(((long)(8988647922296281709L)), ((long)(-7401790246980329343L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(122317691450218L)))));
    ib = ((java.util.Map)(new java.util.HashMap(13)));
    life0_16 = (moom.E_.cb ^ 131574761279148L);
    spill388_0 = (life2_20 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    spill388_1 = 2;
    spill388_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp388_9_0 = new byte[8];
    spill388_3 = __stackOp388_9_0;
    (__stackOp388_9_0)[0] = ((byte) ((int) (life0_16 >>> 56)));
    life3_35 = 1;
    forestValue388_36_0 = spill388_0;
    forestValue388_36_1 = spill388_1;
    forestValue388_36_2 = spill388_2;
    forestValue388_36_3 = spill388_3;
    forest_cycle_36: while (true) {
    if (!((life3_35 < 8))) {
        forestValue388_53_0 = forestValue388_36_0;
        forestValue388_53_1 = forestValue388_36_1;
        forestValue388_53_2 = forestValue388_36_2;
        forestValue388_53_3 = forestValue388_36_3;
        break forest_join_53;
    }
    byte[] __stackOp388_10_0 = forestValue388_36_3;
    spill388_4 = __stackOp388_10_0;
    (__stackOp388_10_0)[life3_35] = ((byte) ((int) ((life0_16 << (life3_35 * 8)) >>> 56)));
    life3_35 += 1;
    forestValue388_36_3 = spill388_4;
    continue forest_cycle_36;
    }
    }
    ((javax.crypto.Cipher)(forestValue388_53_0)).init(((int)(forestValue388_53_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue388_53_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue388_53_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    life8_66 = new long[5];
    life5_68 = 0;
    life7_73 = ((java.lang.String)((life6_71 = "Qõpoúò9¯ÄX\rF\024ímV¼ÛÉºÐ{\035"))).length();
    life4_75 = 0;
    forest_cycle_76: while (true) {
    spill388_5 = life6_71;
    spill388_6 = life4_75;
    life4_75 += 8;
    life9_83 = ((java.lang.String)(((java.lang.String)(spill388_5)).substring(((int)(spill388_6)), ((int)(life4_75))))).getBytes(((java.lang.String)("ISO-8859-1")));
    forestValue388_157_0 = life8_66;
    forestValue388_157_1 = (life5_68++);
    forestValue388_157_2 = (((((((((((long) (life9_83)[0]) & 255L) << 56) | ((((long) (life9_83)[1]) & 255L) << 48)) | ((((long) (life9_83)[2]) & 255L) << 40)) | ((((long) (life9_83)[3]) & 255L) << 32)) | ((((long) (life9_83)[4]) & 255L) << 24)) | ((((long) (life9_83)[5]) & 255L) << 16)) | ((((long) (life9_83)[6]) & 255L) << 8)) | (((long) (life9_83)[7]) & 255L));
    forestValue388_157_3 = -1;
    forest_cycle_157: while (true) {
    forest_join_317: {
    forest_join_312: {
    forest_join_300: {
    long __stackOp388_16_0 = forestValue388_157_2;
    int __stackOp388_16_1 = forestValue388_157_3;
    spill388_7 = __stackOp388_16_1;
    spill388_8 = __stackOp388_16_0;
    recovery.source.CarrierOps.discard(__stackOp388_16_1);
    life10_160 = spill388_8;
    byte[] __stackOp388_18_0 = new byte[8];
    spill388_9 = __stackOp388_18_0;
    (__stackOp388_18_0)[0] = ((byte) ((int) (life10_160 >>> 56)));
    byte[] __stackOp388_19_0 = spill388_9;
    spill388_10 = __stackOp388_19_0;
    (__stackOp388_19_0)[1] = ((byte) ((int) (life10_160 >>> 48)));
    byte[] __stackOp388_20_0 = spill388_10;
    spill388_11 = __stackOp388_20_0;
    (__stackOp388_20_0)[2] = ((byte) ((int) (life10_160 >>> 40)));
    byte[] __stackOp388_21_0 = spill388_11;
    spill388_12 = __stackOp388_21_0;
    (__stackOp388_21_0)[3] = ((byte) ((int) (life10_160 >>> 32)));
    byte[] __stackOp388_22_0 = spill388_12;
    spill388_13 = __stackOp388_22_0;
    (__stackOp388_22_0)[4] = ((byte) ((int) (life10_160 >>> 24)));
    byte[] __stackOp388_23_0 = spill388_13;
    spill388_14 = __stackOp388_23_0;
    (__stackOp388_23_0)[5] = ((byte) ((int) (life10_160 >>> 16)));
    byte[] __stackOp388_24_0 = spill388_14;
    spill388_15 = __stackOp388_24_0;
    (__stackOp388_24_0)[6] = ((byte) ((int) (life10_160 >>> 8)));
    byte[] __stackOp388_25_0 = spill388_15;
    spill388_16 = __stackOp388_25_0;
    (__stackOp388_25_0)[7] = ((byte) ((int) life10_160));
    byte[] __stackOp388_26_0 = spill388_16;
    javax.crypto.Cipher __stackOp388_26_1 = life2_20;
    life12_228 = ((javax.crypto.Cipher)(__stackOp388_26_1)).doFinal(((byte[])(__stackOp388_26_0)));
    int __stackOp388_28_0 = spill388_7;
    long __stackOp388_28_1 = (((((((((((long) (life12_228)[0]) & 255L) << 56) | ((((long) (life12_228)[1]) & 255L) << 48)) | ((((long) (life12_228)[2]) & 255L) << 40)) | ((((long) (life12_228)[3]) & 255L) << 32)) | ((((long) (life12_228)[4]) & 255L) << 24)) | ((((long) (life12_228)[5]) & 255L) << 16)) | ((((long) (life12_228)[6]) & 255L) << 8)) | (((long) (life12_228)[7]) & 255L));
    spill388_17 = __stackOp388_28_1;
    spill388_18 = __stackOp388_28_0;
    recovery.source.CarrierOps.discard(__stackOp388_28_1);
    switch (spill388_18) {
default:
{
        forestValue388_300_0 = forestValue388_157_0;
        forestValue388_300_1 = forestValue388_157_1;
        forestValue388_300_2 = spill388_17;
        break forest_join_300;
    }
case 0:
{
        forestValue388_312_0 = forestValue388_157_0;
        forestValue388_312_1 = forestValue388_157_1;
        forestValue388_312_2 = spill388_17;
        break forest_join_312;
    }
}
    }
    (forestValue388_300_0)[forestValue388_300_1] = forestValue388_300_2;
    if (!((life4_75 >= life7_73))) {
        continue forest_cycle_76;
    }
    life7_73 = ((java.lang.String)((life6_71 = "I¢.k°nF87\002uO"))).length();
    life4_75 = 0;
    break forest_join_317;
    }
    (forestValue388_312_0)[forestValue388_312_1] = forestValue388_312_2;
    if (!((life4_75 >= life7_73))) {
        break forest_join_317;
    }
    break forest_join_399;
    }
    spill388_19 = life6_71;
    spill388_20 = life4_75;
    life4_75 += 8;
    life9_325 = ((java.lang.String)(((java.lang.String)(spill388_19)).substring(((int)(spill388_20)), ((int)(life4_75))))).getBytes(((java.lang.String)("ISO-8859-1")));
    spill388_21 = life8_66;
    spill388_22 = (life5_68++);
    spill388_23 = (((((((((((long) (life9_325)[0]) & 255L) << 56) | ((((long) (life9_325)[1]) & 255L) << 48)) | ((((long) (life9_325)[2]) & 255L) << 40)) | ((((long) (life9_325)[3]) & 255L) << 32)) | ((((long) (life9_325)[4]) & 255L) << 24)) | ((((long) (life9_325)[5]) & 255L) << 16)) | ((((long) (life9_325)[6]) & 255L) << 8)) | (((long) (life9_325)[7]) & 255L));
    spill388_24 = 0;
    forestValue388_157_0 = spill388_21;
    forestValue388_157_1 = spill388_22;
    forestValue388_157_2 = spill388_23;
    forestValue388_157_3 = spill388_24;
    continue forest_cycle_157;
    }
    }
    }
    gb = ((long[])(life8_66));
    hb = ((java.lang.Integer[])(new java.lang.Integer[5]));
}

private static native <E extends Throwable> void __sourceConstructorInit_df419b5a34daaafb_0(moom.E_ a0, int a1) throws E;

private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.E_.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x151E;
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
                throw new RuntimeException("moom/E_", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            E_.hb[n2] = n4;
        }
        return hb[n2];
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4352_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/E_"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


protected net.minecraft.world.biome.BiomeGenBase d(int p0) {
long local2 = (moom.E_.cb ^ 44685122674528L);
    net.minecraft.world.biome.BiomeGenBase local4 = ((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((moom.E_)(new moom.E_(p0, true))).a(((int)(__sourceIntrinsic_69a026c4ca08_originalDynamicSite1131_1(10330, (6878196643174481323L ^ local2)))), ((boolean)(true))))).a(((java.lang.String)(__sourceIntrinsic_69a026c4ca08_originalDynamicSite1131_4(this.aj)))))).b__ES())).a(((float)(0x0.0p0f)), ((float)(0x1.0p-1f))))).a(((net.minecraft.world.biome.BiomeGenBase$Height)(new net.minecraft.world.biome.BiomeGenBase$Height((this.ap + 0x1.99999ap-4f), (this.aq + 0x1.99999ap-4f)))));
    ((net.minecraft.world.biome.BiomeGenBase)(local4)).ap = ((float)((this.ap + 0x1.333334p-2f)));
    ((net.minecraft.world.biome.BiomeGenBase)(local4)).aq = ((float)((this.aq + 0x1.99999ap-2f)));
    return local4;
}


public moom.F0 a(java.util.Random p0) {
return new moom.F_(false);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(net.minecraft.world.World p0, java.util.Random p1, moom.DT p2) {
moom.E_ lexicalValue595_114_0;
    moom.E_ spill595_0;
    long life4_3;
    java.lang.String life6_5;
    int life7_15;
    int life8_32;
    int life9_46;
    int life8_86;
    int life9_100;
    lexical_join_118: {
    lexical_join_114: {
    lexical_join_113: {
    lexical_join_64: {
    lexical_join_62: {
    life4_3 = (moom.E_.cb ^ 82435430989965L);
    life6_5 = net.minecraft.world.biome.WorldChunkManager.b();
    spill595_0 = this;
    if (!((life6_5 == null))) {
        lexicalValue595_114_0 = spill595_0;
        break lexical_join_114;
    }
    if (!(((moom.E_)(spill595_0)).aG)) {
        break lexical_join_113;
    }
    life7_15 = 0;
    lexical_cycle_13: while (true) {
    if (!((life7_15 < 3))) {
        break lexical_join_62;
    }
    life8_32 = (((java.util.Random)(p1)).nextInt(((int)(__sourceIntrinsic_83c0409717df_invokedynamic595_3(6229, (6770915649957106255L ^ life4_3))))) + __sourceIntrinsic_83c0409717df_invokedynamic595_5(18772, (4950990486976119631L ^ life4_3)));
    life9_46 = (((java.util.Random)(p1)).nextInt(((int)(__sourceIntrinsic_83c0409717df_invokedynamic595_6(1321, (3037865427319361328L ^ life4_3))))) + __sourceIntrinsic_83c0409717df_invokedynamic595_8(27871, (6929500680880023239L ^ life4_3)));
    ((moom.Gq)(this.aH)).a__Boolean(((net.minecraft.world.World)(p0)), ((java.util.Random)(p1)), ((moom.DT)(((net.minecraft.world.World)(p0)).a__DT(((moom.DT)(((moom.DT)(p2)).a(((int)(life8_32)), ((int)(0)), ((int)(life9_46)))))))));
    life7_15 += 1;
    if (!((life6_5 == null))) {
        break lexical_join_64;
    }
    if (!((life6_5 != null))) { continue lexical_cycle_13; }
    break lexical_cycle_13;
    }
    }
    life7_15 = 0;
    }
    lexical_cycle_64: while (true) {
    if (!((life7_15 < 2))) {
        break lexical_join_113;
    }
    life8_86 = (((java.util.Random)(p1)).nextInt(((int)(__sourceIntrinsic_83c0409717df_invokedynamic595_13(1321, (3037865427319361328L ^ life4_3))))) + __sourceIntrinsic_83c0409717df_invokedynamic595_15(27871, (6929500680880023239L ^ life4_3)));
    life9_100 = (((java.util.Random)(p1)).nextInt(((int)(__sourceIntrinsic_83c0409717df_invokedynamic595_16(1321, (3037865427319361328L ^ life4_3))))) + __sourceIntrinsic_83c0409717df_invokedynamic595_18(27871, (6929500680880023239L ^ life4_3)));
    ((moom.Gp)(this.aI)).a__Boolean(((net.minecraft.world.World)(p0)), ((java.util.Random)(p1)), ((moom.DT)(((net.minecraft.world.World)(p0)).a__DT(((moom.DT)(((moom.DT)(p2)).a(((int)(life8_86)), ((int)(0)), ((int)(life9_100)))))))));
    life7_15 += 1;
    if (!((life6_5 == null))) {
        break lexical_join_118;
    }
    if (!((life6_5 != null))) { continue lexical_cycle_64; }
    break lexical_cycle_64;
    }
    }
    lexicalValue595_114_0 = this;
    }
    __sourceIntrinsic_83c0409717df_call595_23(lexicalValue595_114_0, p0, p1, p2);
    }
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_83c0409717df_invokedynamic595_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_83c0409717df_invokedynamic595_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_83c0409717df_invokedynamic595_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_83c0409717df_invokedynamic595_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_83c0409717df_invokedynamic595_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_83c0409717df_invokedynamic595_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_83c0409717df_invokedynamic595_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_83c0409717df_invokedynamic595_18(int a0, long a1) throws E;

private static native <E extends Throwable> void __sourceIntrinsic_83c0409717df_call595_23(moom.E_ a0, net.minecraft.world.World a1, java.util.Random a2, moom.DT a3) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4352_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_69a026c4ca08_originalDynamicSite1131_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_69a026c4ca08_originalDynamicSite1131_4(java.lang.String a0) throws E;
}
