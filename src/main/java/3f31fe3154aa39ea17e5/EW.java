package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class EW extends net.minecraft.world.biome.BiomeGenBase {

private int aG;

protected static moom.F3 aH;

protected static moom.F3 aI;

protected static moom.F2 aJ;

private static long cb;

private static long[] gb;

private static java.lang.Integer[] hb;

private static java.util.Map ib;

public EW(int p0, int p1) { super(0); }

private static void __sourceConstructorBody_591d7a0953da3588(moom.EW receiver, int p0, int p1) throws Throwable {
long local3_life2 = (moom.EW.cb ^ 29642883085536L);
    moom.EW.__sourceConstructorInit_591d7a0953da3588_0(((moom.EW)(receiver)), ((int)(p0)));
    ((moom.EW)(receiver)).aG = ((int)(p1));
    ((moom.EQ)(((moom.EW)(receiver)).au)).A = ((int)(10));
    ((moom.EQ)(((moom.EW)(receiver)).au)).C = ((int)(2));
    if ((((moom.EW)(receiver)).aG == 1)) {
        ((moom.EQ)(((moom.EW)(receiver)).au)).A = ((int)(6));
        ((moom.EQ)(((moom.EW)(receiver)).au)).B = ((int)(100));
        ((moom.EQ)(((moom.EW)(receiver)).au)).C = ((int)(1));
    }
    ((moom.EW)(receiver)).a(((int)(5159473)));
    ((moom.EW)(receiver)).a(((float)(0x1.6666660000000p-1F)), ((float)(0x1.99999a0000000p-1F)));
    if ((((moom.EW)(receiver)).aG == 2)) {
        ((moom.EW)(receiver)).al = ((int)(353825));
        ((moom.EW)(receiver)).ak = ((int)(3175492));
        ((moom.EW)(receiver)).a(((float)(0x1.3333340000000p-1F)), ((float)(0x1.3333340000000p-1F)));
    }
    if ((((moom.EW)(receiver)).aG == 0)) {
        ((java.util.List)(((moom.EW)(receiver)).aw)).add(((java.lang.Object)(new moom.D7(net.minecraft.entity.passive.EntityWolf.class, 5, 4, 4))));
    }
    if ((((moom.EW)(receiver)).aG == 3)) {
        ((moom.EQ)(((moom.EW)(receiver)).au)).A = ((int)(-999));
    }
    return;
}


static {
cb = ((long)(((moom._a)(moom._c.a(((long)(-9182523194237506607L)), ((long)(2375803201800159328L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(268968650156593L)))));
    ib = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.EW.cb ^ 3306459117908L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill713_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill713_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill713_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill713_14 = new byte[8];
    (__sourceSpill713_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill713_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation713_16 = __sourceSpill713_14;
    ((javax.crypto.Cipher)(__sourceSpill713_11)).init(((int)(__sourceSpill713_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill713_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation713_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[12];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = ":ß\"Iz\037\023¦n Õ%p\035\"Ç«x´G\fÌ+íòµJ\"Qñª,OÙ¬L\024Ï;\fþöËÁ±iäO\036£\021F^¿Ì£DGI\022DË`ª\003 S"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill713_25 = local6_life21;
        int __sourceSpill713_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill713_25)).substring(((int)(__sourceSpill713_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill713_30 = local8_life19;
        int __sourceSpill713_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill713_33 = new byte[8];
        (__sourceSpill713_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill713_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill713_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill713_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill713_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill713_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill713_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill713_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill713_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill713_34)).doFinal(((byte[])(__sourceSpill713_33)));
        (__sourceSpill713_30)[__sourceSpill713_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "lÕ(ê<½ÏQÀªvýSò"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill713_38 = local6_life21;
        int __sourceSpill713_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill713_38)).substring(((int)(__sourceSpill713_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill713_43 = local8_life19;
        int __sourceSpill713_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill713_46 = new byte[8];
        (__sourceSpill713_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill713_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill713_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill713_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill713_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill713_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill713_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill713_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill713_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill713_47)).doFinal(((byte[])(__sourceSpill713_46)));
        (__sourceSpill713_43)[__sourceSpill713_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    gb = ((long[])(local8_life19));
    hb = ((java.lang.Integer[])(new java.lang.Integer[12]));
    aH = ((moom.F3)(new moom.F3(false, true)));
    aI = ((moom.F3)(new moom.F3(false, false)));
    aJ = ((moom.F2)(new moom.F2(false)));
}

private static native <E extends Throwable> void __sourceConstructorInit_591d7a0953da3588_0(moom.EW a0, int a1) throws E;

private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4338_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/EW"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x70C6;
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
                throw new RuntimeException("moom/EW", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            EW.hb[n2] = n4;
        }
        return hb[n2];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.EW.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


protected net.minecraft.world.biome.BiomeGenBase d(int p0) {
int forwardValue1821_58_0;
    int forwardValue1821_58_1;
    int forwardValue1821_65_0;
    int forwardValue1821_65_1;
    net.minecraft.world.biome.BiomeGenMutated forwardValue1821_79_0;
    int spill1821_0;
    int spill1821_1;
    long life2_3;
    java.lang.String life4_5;
    moom.EW life5_21;
    forward_join_79: {
    forward_join_73: {
    forward_join_65: {
    forward_join_58: {
    forward_join_54: {
    life2_3 = (moom.EW.cb ^ 54948879339166L);
    life4_5 = net.minecraft.world.biome.WorldChunkManager.b();
    spill1821_0 = this.aB;
    spill1821_1 = ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.v)).aB;
    if (!((life4_5 == null))) {
        forwardValue1821_58_0 = spill1821_0;
        forwardValue1821_58_1 = spill1821_1;
        break forward_join_58;
    }
    if (!((spill1821_0 == spill1821_1))) {
        break forward_join_54;
    }
    life5_21 = new moom.EW(p0, 1);
    ((moom.EW)(life5_21)).a(((net.minecraft.world.biome.BiomeGenBase$Height)(new net.minecraft.world.biome.BiomeGenBase$Height(this.ap, (this.aq + 0x1.99999ap-3f)))));
    ((moom.EW)(life5_21)).a(((java.lang.String)("Flower Forest")));
    ((moom.EW)(life5_21)).a(((int)(__sourceIntrinsic_69a026c4ca08_invokedynamic1821_9(20356, (3993795693911736225L ^ life2_3)))), ((boolean)(true)));
    ((moom.EW)(life5_21)).a(((int)(__sourceIntrinsic_69a026c4ca08_invokedynamic1821_11(16402, (3413505994575867967L ^ life2_3)))));
    return life5_21;
    }
    forwardValue1821_58_0 = this.aB;
    forwardValue1821_58_1 = ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.S)).aB;
    }
    if (!((life4_5 == null))) {
        forwardValue1821_65_0 = forwardValue1821_58_0;
        forwardValue1821_65_1 = forwardValue1821_58_1;
        break forward_join_65;
    }
    if (!((forwardValue1821_58_0 != forwardValue1821_58_1))) {
        break forward_join_73;
    }
    forwardValue1821_65_0 = this.aB;
    forwardValue1821_65_1 = ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.T)).aB;
    }
    if (!((forwardValue1821_65_0 != forwardValue1821_65_1))) {
        break forward_join_73;
    }
    forwardValue1821_79_0 = new net.minecraft.world.biome.BiomeGenForest$1(this, p0, this);
    break forward_join_79;
    }
    forwardValue1821_79_0 = new moom.E4(this, p0, this);
    }
    return forwardValue1821_79_0;
}


public moom.F0 a(java.util.Random p0) {
int forwardValue1817_22_0;
    int forwardValue1817_25_0;
    int forwardValue1817_25_1;
    int forwardValue1817_29_0;
    moom.F0 forwardValue1817_34_0;
    int spill1817_0;
    int spill1817_1;
    int spill1817_2;
    long life2_3;
    java.lang.String life4_5;
    forward_join_34: {
    forward_join_33: {
    forward_join_29: {
    forward_join_25: {
    forward_join_22: {
    forward_join_20: {
    life2_3 = (moom.EW.cb ^ 8347908136354L);
    life4_5 = net.minecraft.world.biome.WorldChunkManager.b();
    spill1817_0 = this.aG;
    spill1817_1 = 3;
    if (!((life4_5 == null))) {
        forwardValue1817_25_0 = spill1817_0;
        forwardValue1817_25_1 = spill1817_1;
        break forward_join_25;
    }
    if (!((spill1817_0 == spill1817_1))) {
        break forward_join_20;
    }
    spill1817_2 = ((java.util.Random)(p0)).nextInt(((int)(3)));
    if (!((life4_5 == null))) {
        forwardValue1817_22_0 = spill1817_2;
        break forward_join_22;
    }
    if (!((spill1817_2 > 0))) {
        break forward_join_20;
    }
    forwardValue1817_34_0 = moom.EW.aJ;
    break forward_join_34;
    }
    forwardValue1817_22_0 = this.aG;
    }
    if (!((life4_5 == null))) {
        forwardValue1817_29_0 = forwardValue1817_22_0;
        break forward_join_29;
    }
    forwardValue1817_25_0 = forwardValue1817_22_0;
    forwardValue1817_25_1 = 2;
    }
    if (!((forwardValue1817_25_0 != forwardValue1817_25_1))) {
        break forward_join_33;
    }
    forwardValue1817_29_0 = ((java.util.Random)(p0)).nextInt(((int)(5)));
    }
    if (!((forwardValue1817_29_0 != 0))) {
        break forward_join_33;
    }
    forwardValue1817_34_0 = this.aC;
    break forward_join_34;
    }
    forwardValue1817_34_0 = moom.EW.aI;
    }
    return forwardValue1817_34_0;
}


protected net.minecraft.world.biome.BiomeGenBase a(int p0, boolean p1) {
moom.EW forwardValue1816_39_0;
    net.minecraft.world.biome.BiomeGenBase forwardValue1816_44_0;
    moom.EW spill1816_0;
    moom.EW spill1816_1;
    long life3_3;
    java.lang.String life5_5;
    forward_join_44: {
    forward_join_40: {
    forward_join_39: {
    forward_join_38: {
    life3_3 = (moom.EW.cb ^ 25569603223893L);
    life5_5 = net.minecraft.world.biome.WorldChunkManager.b();
    spill1816_0 = this;
    if (!((life5_5 == null))) {
        forwardValue1816_44_0 = spill1816_0;
        break forward_join_44;
    }
    if (!((((moom.EW)(spill1816_0)).aG == 2))) {
        break forward_join_40;
    }
    this.al = ((int)(__sourceIntrinsic_fcc3f5d4860e_invokedynamic1816_3(5100, (3150524165732871171L ^ life3_3))));
    spill1816_1 = this;
    if (!((life5_5 == null))) {
        forwardValue1816_39_0 = spill1816_1;
        break forward_join_39;
    }
    ((moom.EW)(spill1816_1)).ak = ((int)(p0));
    if (!(p1)) {
        break forward_join_38;
    }
    this.al = ((int)(((this.al & __sourceIntrinsic_fcc3f5d4860e_invokedynamic1816_7(28456, (395704737291653327L ^ life3_3))) >> 1)));
    }
    forwardValue1816_39_0 = this;
    }
    return forwardValue1816_39_0;
    }
    forwardValue1816_44_0 = super.a(((int)(p0)), ((boolean)(p1)));
    }
    return forwardValue1816_44_0;
}


public int a__Int(moom.DT p0) {
int forwardValue1820_30_0;
    int forwardValue1820_30_1;
    int forwardValue1820_33_0;
    java.lang.String spill1820_0;
    int spill1820_1;
    int spill1820_2;
    long life2_3;
    int life5_8;
    java.lang.String life4_9;
    forward_join_33: {
    forward_join_32: {
    forward_join_30: {
    life2_3 = (moom.EW.cb ^ 99105102588364L);
    spill1820_0 = net.minecraft.world.biome.WorldChunkManager.b();
    life5_8 = super.a__Int(((moom.DT)(p0)));
    life4_9 = spill1820_0;
    spill1820_1 = this.aG;
    spill1820_2 = 3;
    if (!((life4_9 == null))) {
        forwardValue1820_30_0 = spill1820_1;
        forwardValue1820_30_1 = spill1820_2;
        break forward_join_30;
    }
    if (!((spill1820_1 == spill1820_2))) {
        break forward_join_32;
    }
    forwardValue1820_30_0 = ((life5_8 & __sourceIntrinsic_798dc89b6a8c_invokedynamic1820_4(21533, (7053366212847797095L ^ life2_3))) + __sourceIntrinsic_798dc89b6a8c_invokedynamic1820_5(15176, (6810563612045175856L ^ life2_3)));
    forwardValue1820_30_1 = 1;
    }
    forwardValue1820_33_0 = (forwardValue1820_30_0 >> forwardValue1820_30_1);
    break forward_join_33;
    }
    forwardValue1820_33_0 = life5_8;
    }
    return forwardValue1820_33_0;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public net.minecraft.block.BlockFlower$EnumFlowerType a(java.util.Random p0, moom.DT p1) {
net.minecraft.block.BlockFlower$EnumFlowerType forwardValue1818_47_0;
    net.minecraft.block.BlockFlower$EnumFlowerType forwardValue1818_49_0;
    moom.EW forwardValue1818_51_0;
    moom.EW spill1818_0;
    net.minecraft.block.BlockFlower$EnumFlowerType spill1818_1;
    long life3_3;
    java.lang.String life5_5;
    double life6_34;
    net.minecraft.block.BlockFlower$EnumFlowerType life8_43;
    forward_join_51: {
    forward_join_50: {
    forward_join_49: {
    forward_join_48: {
    forward_join_47: {
    life3_3 = (moom.EW.cb ^ 114520626608620L);
    life5_5 = net.minecraft.world.biome.WorldChunkManager.b();
    spill1818_0 = this;
    if (!((life5_5 == null))) {
        forwardValue1818_51_0 = spill1818_0;
        break forward_join_51;
    }
    if (!((((moom.EW)(spill1818_0)).aG == 1))) {
        break forward_join_50;
    }
    life6_34 = moom.Dr.a(((double)(((0x1.0p0d + ((moom.FW)(moom.EW.ah)).a(((double)((((double) ((moom.DT)(p1)).a()) / 0x1.8p5d))), ((double)((((double) ((moom.DT)(p1)).c()) / 0x1.8p5d))))) / 0x1.0p1d))), ((double)(0x0.0p0d)), ((double)(0x1.fff2e48e8a71ep-1d)));
    life8_43 = (net.minecraft.block.BlockFlower$EnumFlowerType.values())[((int) (life6_34 * ((double) (net.minecraft.block.BlockFlower$EnumFlowerType.values()).length)))];
    spill1818_1 = life8_43;
    if (!((life5_5 == null))) {
        forwardValue1818_47_0 = spill1818_1;
        break forward_join_47;
    }
    if (!((spill1818_1 == net.minecraft.block.BlockFlower$EnumFlowerType.BLUE_ORCHID))) {
        break forward_join_48;
    }
    forwardValue1818_47_0 = net.minecraft.block.BlockFlower$EnumFlowerType.POPPY;
    }
    forwardValue1818_49_0 = forwardValue1818_47_0;
    break forward_join_49;
    }
    forwardValue1818_49_0 = life8_43;
    }
    return forwardValue1818_49_0;
    }
    forwardValue1818_51_0 = this;
    }
    return __sourceIntrinsic_af499c5d5d3b_call1818_12(forwardValue1818_51_0, p0, p1);
}


public void a(net.minecraft.world.World p0, java.util.Random p1, moom.DT p2) {
int forestValue602_15_0;
    int forestValue602_115_0;
    int forestValue602_115_1;
    int forestValue602_119_0;
    int forestValue602_125_0;
    int forestValue602_127_0;
    int forestValue602_145_0;
    int forestValue602_158_0;
    int forestValue602_158_1;
    int forestValue602_163_0;
    int spill602_0;
    int spill602_1;
    int spill602_2;
    int spill602_3;
    int spill602_4;
    int spill602_5;
    int spill602_6;
    boolean spill602_7;
    long life4_3;
    java.lang.String life6_5;
    int life7_14;
    int life8_21;
    int life9_40;
    int life10_56;
    moom.DT life11_64;
    moom.Gc life12_78;
    moom.F0 life12_90;
    int life8_130;
    int life9_137;
    int life10_177;
    int life11_194;
    int life12_208;
    int life13_225;
    forest_join_246: {
    forest_join_241: {
    forest_join_125: {
    forest_join_124: {
    forest_join_119: {
    forest_join_115: {
    forest_join_111: {
    life4_3 = (moom.EW.cb ^ 91966627303795L);
    life6_5 = net.minecraft.world.biome.WorldChunkManager.b();
    spill602_0 = this.aG;
    spill602_1 = 3;
    if (!((life6_5 == null))) {
        forestValue602_115_0 = spill602_0;
        forestValue602_115_1 = spill602_1;
        break forest_join_115;
    }
    if (!((spill602_0 == spill602_1))) {
        break forest_join_111;
    }
    life7_14 = 0;
    forest_cycle_14: while (true) {
    forest_join_108: {
    forestValue602_15_0 = life7_14;
    forest_cycle_15: while (true) {
    if (!((forestValue602_15_0 < 4))) {
        break forest_join_111;
    }
    spill602_2 = 0;
    if (!((life6_5 == null))) {
        forestValue602_119_0 = spill602_2;
        break forest_join_119;
    }
    life8_21 = spill602_2;
    forest_cycle_21: while (true) {
    forest_join_106: {
    forest_join_105: {
    forest_join_86: {
    if (!((life8_21 < 4))) {
        break forest_join_108;
    }
    life9_40 = ((((life7_14 * 4) + 1) + __sourceIntrinsic_83c0409717df_invokedynamic602_3(31132, (9110203242148075102L ^ life4_3))) + ((java.util.Random)(p1)).nextInt(((int)(3))));
    life10_56 = ((((life8_21 * 4) + 1) + __sourceIntrinsic_83c0409717df_invokedynamic602_5(29304, (1864084608566861243L ^ life4_3))) + ((java.util.Random)(p1)).nextInt(((int)(3))));
    life11_64 = ((net.minecraft.world.World)(p0)).a__DT(((moom.DT)(((moom.DT)(p2)).a(((int)(life9_40)), ((int)(0)), ((int)(life10_56))))));
    spill602_3 = ((java.util.Random)(p1)).nextInt(((int)(__sourceIntrinsic_83c0409717df_invokedynamic602_9(9395, (7328777760588057464L ^ life4_3)))));
    if (!((life6_5 == null))) {
        forestValue602_15_0 = spill602_3;
        continue forest_cycle_15;
    }
    if (!((spill602_3 == 0))) {
        break forest_join_86;
    }
    life12_78 = new moom.Gc();
    ((moom.Gc)(life12_78)).a__Boolean(((net.minecraft.world.World)(p0)), ((java.util.Random)(p1)), ((moom.DT)(life11_64)));
    if (!((life6_5 != null))) {
        break forest_join_105;
    }
    }
    life12_90 = ((moom.EW)(this)).a(((java.util.Random)(p1)));
    ((moom.F0)(life12_90)).a();
    if (!((life6_5 == null))) {
        break forest_join_106;
    }
    if (!(((moom.F0)(life12_90)).a__Boolean(((net.minecraft.world.World)(p0)), ((java.util.Random)(p1)), ((moom.DT)(life11_64))))) {
        break forest_join_105;
    }
    ((moom.F0)(life12_90)).a(((net.minecraft.world.World)(p0)), ((java.util.Random)(p1)), ((moom.DT)(life11_64)));
    }
    life8_21 += 1;
    }
    if (!((life6_5 != null))) {
        continue forest_cycle_21;
    }
    break forest_cycle_21;
    }
    break forest_cycle_15;
    }
    }
    life7_14 += 1;
    if (!((life6_5 != null))) {
        continue forest_cycle_14;
    }
    break forest_cycle_14;
    }
    }
    forestValue602_115_0 = ((java.util.Random)(p1)).nextInt(((int)(5)));
    forestValue602_115_1 = 3;
    }
    life7_14 = (forestValue602_115_0 - forestValue602_115_1);
    forestValue602_119_0 = this.aG;
    }
    if (!((life6_5 == null))) {
        forestValue602_125_0 = forestValue602_119_0;
        break forest_join_125;
    }
    if (!((forestValue602_119_0 == 1))) {
        break forest_join_124;
    }
    life7_14 += 2;
    }
    forestValue602_125_0 = 0;
    }
    life8_130 = forestValue602_125_0;
    forest_cycle_126: while (true) {
    forest_join_238: {
    forestValue602_127_0 = life8_130;
    forest_cycle_127: while (true) {
    forest_join_163: {
    forest_join_162: {
    forest_join_158: {
    forest_join_154: {
    forest_join_145: {
    forest_join_144: {
    if (!((forestValue602_127_0 < life7_14))) {
        break forest_join_241;
    }
    life9_137 = ((java.util.Random)(p1)).nextInt(((int)(3)));
    if (!((life6_5 == null))) {
        break forest_join_246;
    }
    spill602_4 = life9_137;
    if (!((life6_5 == null))) {
        forestValue602_145_0 = spill602_4;
        break forest_join_145;
    }
    if (!((spill602_4 == 0))) {
        break forest_join_144;
    }
    ((moom.Gi)(moom.EW.ai)).a(((net.minecraft.block.BlockDoublePlant$EnumPlantType)(net.minecraft.block.BlockDoublePlant$EnumPlantType.SYRINGA)));
    if (!((life6_5 != null))) {
        break forest_join_162;
    }
    }
    forestValue602_145_0 = life9_137;
    }
    spill602_5 = 1;
    if (!((life6_5 == null))) {
        forestValue602_158_0 = forestValue602_145_0;
        forestValue602_158_1 = spill602_5;
        break forest_join_158;
    }
    if (!((forestValue602_145_0 == spill602_5))) {
        break forest_join_154;
    }
    ((moom.Gi)(moom.EW.ai)).a(((net.minecraft.block.BlockDoublePlant$EnumPlantType)(net.minecraft.block.BlockDoublePlant$EnumPlantType.ROSE)));
    if (!((life6_5 != null))) {
        break forest_join_162;
    }
    }
    spill602_6 = life9_137;
    if (!((life6_5 == null))) {
        forestValue602_163_0 = spill602_6;
        break forest_join_163;
    }
    forestValue602_158_0 = spill602_6;
    forestValue602_158_1 = 2;
    }
    if (!((forestValue602_158_0 == forestValue602_158_1))) {
        break forest_join_162;
    }
    ((moom.Gi)(moom.EW.ai)).a(((net.minecraft.block.BlockDoublePlant$EnumPlantType)(net.minecraft.block.BlockDoublePlant$EnumPlantType.PAEONIA)));
    }
    forestValue602_163_0 = 0;
    }
    life10_177 = forestValue602_163_0;
    forest_cycle_164: while (true) {
    forest_join_236: {
    forest_join_235: {
    if (!((life10_177 < 5))) {
        break forest_join_238;
    }
    life11_194 = (((java.util.Random)(p1)).nextInt(((int)(__sourceIntrinsic_83c0409717df_invokedynamic602_28(14444, (6772824508994049958L ^ life4_3))))) + __sourceIntrinsic_83c0409717df_invokedynamic602_30(29304, (1864084608566861243L ^ life4_3)));
    life12_208 = (((java.util.Random)(p1)).nextInt(((int)(__sourceIntrinsic_83c0409717df_invokedynamic602_31(22588, (8528121870706522106L ^ life4_3))))) + __sourceIntrinsic_83c0409717df_invokedynamic602_33(29304, (1864084608566861243L ^ life4_3)));
    life13_225 = ((java.util.Random)(p1)).nextInt(((int)((((moom.DT)(((net.minecraft.world.World)(p0)).a__DT(((moom.DT)(((moom.DT)(p2)).a(((int)(life11_194)), ((int)(0)), ((int)(life12_208)))))))).b() + __sourceIntrinsic_83c0409717df_invokedynamic602_37(10418, (4827264838027364214L ^ life4_3))))));
    if (!((life6_5 == null))) {
        break forest_join_236;
    }
    spill602_7 = ((moom.Gi)(moom.EW.ai)).a__Boolean(((net.minecraft.world.World)(p0)), ((java.util.Random)(p1)), ((moom.DT)(new moom.DT((((moom.DT)(p2)).a() + life11_194), life13_225, (((moom.DT)(p2)).c() + life12_208)))));
    if (!((life6_5 == null))) {
        forestValue602_127_0 = ((spill602_7) ? 1 : 0);
        continue forest_cycle_127;
    }
    if (!(spill602_7)) {
        break forest_join_235;
    }
    if (!((life6_5 != null))) {
        break forest_join_238;
    }
    }
    life10_177 += 1;
    }
    if (!((life6_5 != null))) {
        continue forest_cycle_164;
    }
    break forest_cycle_164;
    }
    break forest_cycle_127;
    }
    }
    life8_130 += 1;
    if (!((life6_5 != null))) {
        continue forest_cycle_126;
    }
    break forest_cycle_126;
    }
    }
    super.a(((net.minecraft.world.World)(p0)), ((java.util.Random)(p1)), ((moom.DT)(p2)));
    }
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_fcc3f5d4860e_invokedynamic1816_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fcc3f5d4860e_invokedynamic1816_7(int a0, long a1) throws E;

private static native <E extends Throwable> net.minecraft.block.BlockFlower$EnumFlowerType __sourceIntrinsic_af499c5d5d3b_call1818_12(moom.EW a0, java.util.Random a1, moom.DT a2) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_83c0409717df_invokedynamic602_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_83c0409717df_invokedynamic602_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_83c0409717df_invokedynamic602_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_83c0409717df_invokedynamic602_28(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_83c0409717df_invokedynamic602_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_83c0409717df_invokedynamic602_31(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_83c0409717df_invokedynamic602_33(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_83c0409717df_invokedynamic602_37(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_798dc89b6a8c_invokedynamic1820_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_798dc89b6a8c_invokedynamic1820_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4338_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_69a026c4ca08_invokedynamic1821_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_69a026c4ca08_invokedynamic1821_11(int a0, long a1) throws E;
}
