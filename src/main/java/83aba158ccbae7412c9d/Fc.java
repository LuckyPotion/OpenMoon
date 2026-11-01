package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Fc extends net.minecraft.world.biome.BiomeGenBase {

private static moom.F9 aG;

private static moom.F_ aH;

private static moom.F6 aI;

private static moom.F6 aJ;

private static moom.Gd aK;

private int aL;

private static long cb;

private static long[] gb;

private static java.lang.Integer[] hb;

private static java.util.Map ib;

public Fc(int p0, int p1) { super(0); }

private static void __sourceConstructorBody_06ebba2f1b2ea218(moom.Fc receiver, int p0, int p1) throws Throwable {
forward_join_52: {
    forward_join_40: {
    long local3_life2 = (moom.Fc.cb ^ 119359589712348L);
    moom.Fc.__sourceConstructorInit_06ebba2f1b2ea218_0(((moom.Fc)(receiver)), ((int)(p0)));
    ((moom.Fc)(receiver)).aL = ((int)(p1));
    ((java.util.List)(((moom.Fc)(receiver)).aw)).add(((java.lang.Object)(new moom.D7(net.minecraft.entity.passive.EntityWolf.class, 8, 4, 4))));
    ((moom.EQ)(((moom.Fc)(receiver)).au)).A = ((int)(10));
    if (!((p1 != 1))) { break forward_join_40; }
    if (!((p1 != 2))) { break forward_join_40; }
    ((moom.EQ)(((moom.Fc)(receiver)).au)).C = ((int)(1));
    ((moom.EQ)(((moom.Fc)(receiver)).au)).E = ((int)(1));
    break forward_join_52;
    }
    ((moom.EQ)(((moom.Fc)(receiver)).au)).C = ((int)(7));
    ((moom.EQ)(((moom.Fc)(receiver)).au)).D = ((int)(1));
    ((moom.EQ)(((moom.Fc)(receiver)).au)).E = ((int)(3));
    }
    return;
}


static {
javax.crypto.Cipher forestValue391_36_0;
    int forestValue391_36_1;
    javax.crypto.SecretKeyFactory forestValue391_36_2;
    byte[] forestValue391_36_3;
    javax.crypto.Cipher forestValue391_53_0;
    int forestValue391_53_1;
    javax.crypto.SecretKeyFactory forestValue391_53_2;
    byte[] forestValue391_53_3;
    long[] forestValue391_157_0;
    int forestValue391_157_1;
    long forestValue391_157_2;
    int forestValue391_157_3;
    long[] forestValue391_300_0;
    int forestValue391_300_1;
    long forestValue391_300_2;
    long[] forestValue391_312_0;
    int forestValue391_312_1;
    long forestValue391_312_2;
    javax.crypto.Cipher spill391_0;
    int spill391_1;
    javax.crypto.SecretKeyFactory spill391_2;
    byte[] spill391_3;
    byte[] spill391_4;
    java.lang.String spill391_5;
    int spill391_6;
    int spill391_7;
    long spill391_8;
    byte[] spill391_9;
    byte[] spill391_10;
    byte[] spill391_11;
    byte[] spill391_12;
    byte[] spill391_13;
    byte[] spill391_14;
    byte[] spill391_15;
    byte[] spill391_16;
    long spill391_17;
    int spill391_18;
    java.lang.String spill391_19;
    int spill391_20;
    long[] spill391_21;
    int spill391_22;
    long spill391_23;
    int spill391_24;
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
    cb = ((long)(((moom._a)(moom._c.a(((long)(750241171697893408L)), ((long)(7231521779987211093L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(43373046412203L)))));
    ib = ((java.util.Map)(new java.util.HashMap(13)));
    life0_16 = (moom.Fc.cb ^ 119921341917087L);
    spill391_0 = (life2_20 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    spill391_1 = 2;
    spill391_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp391_9_0 = new byte[8];
    spill391_3 = __stackOp391_9_0;
    (__stackOp391_9_0)[0] = ((byte) ((int) (life0_16 >>> 56)));
    life3_35 = 1;
    forestValue391_36_0 = spill391_0;
    forestValue391_36_1 = spill391_1;
    forestValue391_36_2 = spill391_2;
    forestValue391_36_3 = spill391_3;
    forest_cycle_36: while (true) {
    if (!((life3_35 < 8))) {
        forestValue391_53_0 = forestValue391_36_0;
        forestValue391_53_1 = forestValue391_36_1;
        forestValue391_53_2 = forestValue391_36_2;
        forestValue391_53_3 = forestValue391_36_3;
        break forest_join_53;
    }
    byte[] __stackOp391_10_0 = forestValue391_36_3;
    spill391_4 = __stackOp391_10_0;
    (__stackOp391_10_0)[life3_35] = ((byte) ((int) ((life0_16 << (life3_35 * 8)) >>> 56)));
    life3_35 += 1;
    forestValue391_36_3 = spill391_4;
    continue forest_cycle_36;
    }
    }
    ((javax.crypto.Cipher)(forestValue391_53_0)).init(((int)(forestValue391_53_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue391_53_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue391_53_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    life8_66 = new long[9];
    life5_68 = 0;
    life7_73 = ((java.lang.String)((life6_71 = "\001¶¯ÖGÑ\020u`ØEÎÿ^$Ð¹¾|\004NqÃxÁ+o¨Z\fÿFú®\026\026\033¯[CÏe#7AIÁ¯ñ"))).length();
    life4_75 = 0;
    forest_cycle_76: while (true) {
    spill391_5 = life6_71;
    spill391_6 = life4_75;
    life4_75 += 8;
    life9_83 = ((java.lang.String)(((java.lang.String)(spill391_5)).substring(((int)(spill391_6)), ((int)(life4_75))))).getBytes(((java.lang.String)("ISO-8859-1")));
    forestValue391_157_0 = life8_66;
    forestValue391_157_1 = (life5_68++);
    forestValue391_157_2 = (((((((((((long) (life9_83)[0]) & 255L) << 56) | ((((long) (life9_83)[1]) & 255L) << 48)) | ((((long) (life9_83)[2]) & 255L) << 40)) | ((((long) (life9_83)[3]) & 255L) << 32)) | ((((long) (life9_83)[4]) & 255L) << 24)) | ((((long) (life9_83)[5]) & 255L) << 16)) | ((((long) (life9_83)[6]) & 255L) << 8)) | (((long) (life9_83)[7]) & 255L));
    forestValue391_157_3 = -1;
    forest_cycle_157: while (true) {
    forest_join_317: {
    forest_join_312: {
    forest_join_300: {
    long __stackOp391_16_0 = forestValue391_157_2;
    int __stackOp391_16_1 = forestValue391_157_3;
    spill391_7 = __stackOp391_16_1;
    spill391_8 = __stackOp391_16_0;
    recovery.source.CarrierOps.discard(__stackOp391_16_1);
    life10_160 = spill391_8;
    byte[] __stackOp391_18_0 = new byte[8];
    spill391_9 = __stackOp391_18_0;
    (__stackOp391_18_0)[0] = ((byte) ((int) (life10_160 >>> 56)));
    byte[] __stackOp391_19_0 = spill391_9;
    spill391_10 = __stackOp391_19_0;
    (__stackOp391_19_0)[1] = ((byte) ((int) (life10_160 >>> 48)));
    byte[] __stackOp391_20_0 = spill391_10;
    spill391_11 = __stackOp391_20_0;
    (__stackOp391_20_0)[2] = ((byte) ((int) (life10_160 >>> 40)));
    byte[] __stackOp391_21_0 = spill391_11;
    spill391_12 = __stackOp391_21_0;
    (__stackOp391_21_0)[3] = ((byte) ((int) (life10_160 >>> 32)));
    byte[] __stackOp391_22_0 = spill391_12;
    spill391_13 = __stackOp391_22_0;
    (__stackOp391_22_0)[4] = ((byte) ((int) (life10_160 >>> 24)));
    byte[] __stackOp391_23_0 = spill391_13;
    spill391_14 = __stackOp391_23_0;
    (__stackOp391_23_0)[5] = ((byte) ((int) (life10_160 >>> 16)));
    byte[] __stackOp391_24_0 = spill391_14;
    spill391_15 = __stackOp391_24_0;
    (__stackOp391_24_0)[6] = ((byte) ((int) (life10_160 >>> 8)));
    byte[] __stackOp391_25_0 = spill391_15;
    spill391_16 = __stackOp391_25_0;
    (__stackOp391_25_0)[7] = ((byte) ((int) life10_160));
    byte[] __stackOp391_26_0 = spill391_16;
    javax.crypto.Cipher __stackOp391_26_1 = life2_20;
    life12_228 = ((javax.crypto.Cipher)(__stackOp391_26_1)).doFinal(((byte[])(__stackOp391_26_0)));
    int __stackOp391_28_0 = spill391_7;
    long __stackOp391_28_1 = (((((((((((long) (life12_228)[0]) & 255L) << 56) | ((((long) (life12_228)[1]) & 255L) << 48)) | ((((long) (life12_228)[2]) & 255L) << 40)) | ((((long) (life12_228)[3]) & 255L) << 32)) | ((((long) (life12_228)[4]) & 255L) << 24)) | ((((long) (life12_228)[5]) & 255L) << 16)) | ((((long) (life12_228)[6]) & 255L) << 8)) | (((long) (life12_228)[7]) & 255L));
    spill391_17 = __stackOp391_28_1;
    spill391_18 = __stackOp391_28_0;
    recovery.source.CarrierOps.discard(__stackOp391_28_1);
    switch (spill391_18) {
default:
{
        forestValue391_300_0 = forestValue391_157_0;
        forestValue391_300_1 = forestValue391_157_1;
        forestValue391_300_2 = spill391_17;
        break forest_join_300;
    }
case 0:
{
        forestValue391_312_0 = forestValue391_157_0;
        forestValue391_312_1 = forestValue391_157_1;
        forestValue391_312_2 = spill391_17;
        break forest_join_312;
    }
}
    }
    (forestValue391_300_0)[forestValue391_300_1] = forestValue391_300_2;
    if (!((life4_75 >= life7_73))) {
        continue forest_cycle_76;
    }
    life7_73 = ((java.lang.String)((life6_71 = "äàN÷ì\024\035f\003Àk^5eS"))).length();
    life4_75 = 0;
    break forest_join_317;
    }
    (forestValue391_312_0)[forestValue391_312_1] = forestValue391_312_2;
    if (!((life4_75 >= life7_73))) {
        break forest_join_317;
    }
    break forest_join_399;
    }
    spill391_19 = life6_71;
    spill391_20 = life4_75;
    life4_75 += 8;
    life9_325 = ((java.lang.String)(((java.lang.String)(spill391_19)).substring(((int)(spill391_20)), ((int)(life4_75))))).getBytes(((java.lang.String)("ISO-8859-1")));
    spill391_21 = life8_66;
    spill391_22 = (life5_68++);
    spill391_23 = (((((((((((long) (life9_325)[0]) & 255L) << 56) | ((((long) (life9_325)[1]) & 255L) << 48)) | ((((long) (life9_325)[2]) & 255L) << 40)) | ((((long) (life9_325)[3]) & 255L) << 32)) | ((((long) (life9_325)[4]) & 255L) << 24)) | ((((long) (life9_325)[5]) & 255L) << 16)) | ((((long) (life9_325)[6]) & 255L) << 8)) | (((long) (life9_325)[7]) & 255L));
    spill391_24 = 0;
    forestValue391_157_0 = spill391_21;
    forestValue391_157_1 = spill391_22;
    forestValue391_157_2 = spill391_23;
    forestValue391_157_3 = spill391_24;
    continue forest_cycle_157;
    }
    }
    }
    gb = ((long[])(life8_66));
    hb = ((java.lang.Integer[])(new java.lang.Integer[9]));
    aG = ((moom.F9)(new moom.F9()));
    aH = ((moom.F_)(new moom.F_(false)));
    aI = ((moom.F6)(new moom.F6(false, false)));
    aJ = ((moom.F6)(new moom.F6(false, true)));
    aK = ((moom.Gd)(new moom.Gd(net.minecraft.init.Blocks.Y, 0)));
}

private static native <E extends Throwable> void __sourceConstructorInit_06ebba2f1b2ea218_0(moom.Fc a0, int a1) throws E;

private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4531_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Fc"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x6265;
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
                throw new RuntimeException("moom/Fc", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Fc.hb[n2] = n3;
        }
        return hb[n2];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.Fc.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


protected net.minecraft.world.biome.BiomeGenBase d(int p0) {
moom.Fc forwardValue216_46_0;
    net.minecraft.world.biome.BiomeGenBase forwardValue216_48_0;
    moom.Fc spill216_0;
    long life2_3;
    java.lang.String life4_5;
    forward_join_48: {
    forward_join_46: {
    forward_join_45: {
    life2_3 = (moom.Fc.cb ^ 139668349829558L);
    life4_5 = net.minecraft.world.biome.WorldChunkManager.b();
    spill216_0 = this;
    if (!((life4_5 == null))) {
        forwardValue216_46_0 = spill216_0;
        break forward_join_46;
    }
    if (!((((moom.Fc)(spill216_0)).aB == ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.X)).aB))) {
        break forward_join_45;
    }
    forwardValue216_48_0 = ((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.BiomeGenBase)(((moom.Fc)(new moom.Fc(p0, 2))).a(((int)(__sourceIntrinsic_69a026c4ca08_invokedynamic216_5(7342, (1972308895336447527L ^ life2_3)))), ((boolean)(true))))).a(((java.lang.String)("Mega Spruce Taiga"))))).a(((int)(__sourceIntrinsic_69a026c4ca08_invokedynamic216_8(33, (8348965052394742439L ^ life2_3))))))).a(((float)(0x1.0p-2f)), ((float)(0x1.99999ap-1f))))).a(((net.minecraft.world.biome.BiomeGenBase$Height)(new net.minecraft.world.biome.BiomeGenBase$Height(this.ap, this.aq))));
    break forward_join_48;
    }
    forwardValue216_46_0 = this;
    }
    forwardValue216_48_0 = __sourceIntrinsic_69a026c4ca08_call216_14(forwardValue216_46_0, p0);
    }
    return forwardValue216_48_0;
}


public moom.FY a__FY(java.util.Random p0) {
long local2 = (moom.Fc.cb ^ 95161083044615L);
    return ((((java.util.Random)(p0)).nextInt(((int)(5))) > 0) ? new moom.Gz(moom.ar.FERN) : new moom.Gz(moom.ar.GRASS));
}


public moom.F0 a(java.util.Random p0) {
int forwardValue214_21_0;
    int forwardValue214_37_0;
    int forwardValue214_45_0;
    moom.F0 forwardValue214_49_0;
    int spill214_0;
    int spill214_1;
    int spill214_2;
    long life2_3;
    java.lang.String life4_5;
    forward_join_49: {
    forward_join_48: {
    forward_join_45: {
    forward_join_42: {
    forward_join_40: {
    forward_join_37: {
    forward_join_21: {
    forward_join_18: {
    life2_3 = (moom.Fc.cb ^ 80717402247818L);
    life4_5 = net.minecraft.world.biome.WorldChunkManager.b();
    spill214_0 = this.aL;
    if (!((life4_5 == null))) {
        forwardValue214_21_0 = spill214_0;
        break forward_join_21;
    }
    if (!((spill214_0 != 1))) {
        break forward_join_18;
    }
    spill214_1 = this.aL;
    if (!((life4_5 == null))) {
        forwardValue214_45_0 = spill214_1;
        break forward_join_45;
    }
    if (!((spill214_1 == 2))) {
        break forward_join_42;
    }
    }
    forwardValue214_21_0 = ((java.util.Random)(p0)).nextInt(((int)(3)));
    }
    if (!((life4_5 == null))) {
        forwardValue214_45_0 = forwardValue214_21_0;
        break forward_join_45;
    }
    if (!((forwardValue214_21_0 == 0))) {
        break forward_join_42;
    }
    spill214_2 = this.aL;
    if (!((life4_5 == null))) {
        forwardValue214_37_0 = spill214_2;
        break forward_join_37;
    }
    if (!((spill214_2 != 2))) {
        break forward_join_40;
    }
    forwardValue214_37_0 = ((java.util.Random)(p0)).nextInt(((int)(__sourceIntrinsic_723b001678d2_invokedynamic214_6(3276, (3531030251352325498L ^ life2_3)))));
    }
    if (!((forwardValue214_37_0 != 0))) {
        break forward_join_40;
    }
    forwardValue214_49_0 = moom.Fc.aI;
    break forward_join_49;
    }
    forwardValue214_49_0 = moom.Fc.aJ;
    break forward_join_49;
    }
    forwardValue214_45_0 = ((java.util.Random)(p0)).nextInt(((int)(3)));
    }
    if (!((forwardValue214_45_0 == 0))) {
        break forward_join_48;
    }
    forwardValue214_49_0 = moom.Fc.aG;
    break forward_join_49;
    }
    forwardValue214_49_0 = moom.Fc.aH;
    }
    return forwardValue214_49_0;
}


public void a(net.minecraft.world.World p0, java.util.Random p1, moom.Fm p2, int p3, int p4, double p5) {
int forwardValue215_29_0;
    int forwardValue215_44_0;
    moom.Fc forwardValue215_53_0;
    int spill215_0;
    moom.Fc spill215_1;
    long life8_3;
    java.lang.String life10_5;
    forward_join_53: {
    forward_join_52: {
    forward_join_44: {
    forward_join_41: {
    forward_join_29: {
    forward_join_18: {
    life8_3 = (moom.Fc.cb ^ 132607862207516L);
    life10_5 = net.minecraft.world.biome.WorldChunkManager.b();
    spill215_0 = this.aL;
    if (!((life10_5 == null))) {
        forwardValue215_29_0 = spill215_0;
        break forward_join_29;
    }
    if (!((spill215_0 != 1))) {
        break forward_join_18;
    }
    spill215_1 = this;
    if (!((life10_5 == null))) {
        forwardValue215_53_0 = spill215_1;
        break forward_join_53;
    }
    if (!((((moom.Fc)(spill215_1)).aL == 2))) {
        break forward_join_52;
    }
    }
    this.am = ((net.minecraft.block.state.IBlockState)(((moom.dC)(net.minecraft.init.Blocks.c)).a__fE()));
    this.an = ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.d)).a__fE()));
    forwardValue215_29_0 = recovery.source.CarrierOps.dcmpl(((double)(p5)), ((double)(0x1.cp0d)));
    }
    if (!((life10_5 == null))) {
        forwardValue215_44_0 = forwardValue215_29_0;
        break forward_join_44;
    }
    if (!((forwardValue215_29_0 > 0))) {
        break forward_join_41;
    }
    this.am = ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.d)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.dq.Q)), ((java.lang.Comparable)(net.minecraft.block.BlockDirt$DirtType.COARSE_DIRT)))));
    if (!((life10_5 != null))) {
        break forward_join_52;
    }
    }
    forwardValue215_44_0 = recovery.source.CarrierOps.dcmpl(((double)(p5)), ((double)(-0x1.e666666666666p-1d)));
    }
    if (!((forwardValue215_44_0 > 0))) {
        break forward_join_52;
    }
    this.am = ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.d)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.dq.Q)), ((java.lang.Comparable)(net.minecraft.block.BlockDirt$DirtType.PODZOL)))));
    }
    forwardValue215_53_0 = this;
    }
    ((moom.Fc)(forwardValue215_53_0)).b(((net.minecraft.world.World)(p0)), ((java.util.Random)(p1)), ((moom.Fm)(p2)), ((int)(p3)), ((int)(p4)), ((double)(p5)));
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(net.minecraft.world.World p0, java.util.Random p1, moom.DT p2) {
int lexicalValue657_21_0;
    int lexicalValue657_78_0;
    int spill657_0;
    int spill657_1;
    long life4_3;
    java.lang.String life6_5;
    int life7_33;
    int life8_35;
    int life9_52;
    int life10_66;
    moom.DT life11_74;
    int life7_93;
    int life8_114;
    int life9_128;
    int life10_145;
    lexical_join_151: {
    lexical_join_146: {
    lexical_join_78: {
    lexical_join_77: {
    lexical_join_74: {
    lexical_join_21: {
    lexical_join_18: {
    life4_3 = (moom.Fc.cb ^ 32274467331675L);
    life6_5 = net.minecraft.world.biome.WorldChunkManager.b();
    spill657_0 = this.aL;
    if (!((life6_5 == null))) {
        lexicalValue657_21_0 = spill657_0;
        break lexical_join_21;
    }
    if (!((spill657_0 != 1))) {
        break lexical_join_18;
    }
    spill657_1 = this.aL;
    if (!((life6_5 == null))) {
        lexicalValue657_78_0 = spill657_1;
        break lexical_join_78;
    }
    if (!((spill657_1 == 2))) {
        break lexical_join_74;
    }
    }
    lexicalValue657_21_0 = ((java.util.Random)(p1)).nextInt(((int)(3)));
    }
    life7_33 = lexicalValue657_21_0;
    life8_35 = 0;
    lexical_cycle_24: while (true) {
    if (!((life8_35 < life7_33))) {
        break lexical_join_74;
    }
    life9_52 = (((java.util.Random)(p1)).nextInt(((int)(__sourceIntrinsic_83c0409717df_invokedynamic657_5(17142, (9168260656572972950L ^ life4_3))))) + __sourceIntrinsic_83c0409717df_invokedynamic657_7(26649, (8835998214757586303L ^ life4_3)));
    life10_66 = (((java.util.Random)(p1)).nextInt(((int)(__sourceIntrinsic_83c0409717df_invokedynamic657_8(28072, (4478658023081545933L ^ life4_3))))) + __sourceIntrinsic_83c0409717df_invokedynamic657_10(30265, (4157270696713096027L ^ life4_3)));
    life11_74 = ((net.minecraft.world.World)(p0)).a__DT(((moom.DT)(((moom.DT)(p2)).a(((int)(life9_52)), ((int)(0)), ((int)(life10_66))))));
    ((moom.Gd)(moom.Fc.aK)).a__Boolean(((net.minecraft.world.World)(p0)), ((java.util.Random)(p1)), ((moom.DT)(life11_74)));
    life8_35 += 1;
    if (!((life6_5 == null))) {
        break lexical_join_77;
    }
    if (!((life6_5 != null))) { continue lexical_cycle_24; }
    break lexical_cycle_24;
    }
    }
    ((moom.Gi)(moom.Fc.ai)).a(((net.minecraft.block.BlockDoublePlant$EnumPlantType)(net.minecraft.block.BlockDoublePlant$EnumPlantType.FERN)));
    }
    lexicalValue657_78_0 = 0;
    }
    life7_93 = lexicalValue657_78_0;
    lexical_cycle_79: while (true) {
    if (!((life7_93 < __sourceIntrinsic_83c0409717df_invokedynamic657_18(22908, (7439732761425421341L ^ life4_3))))) {
        break lexical_join_146;
    }
    life8_114 = (((java.util.Random)(p1)).nextInt(((int)(__sourceIntrinsic_83c0409717df_invokedynamic657_19(28072, (4478658023081545933L ^ life4_3))))) + __sourceIntrinsic_83c0409717df_invokedynamic657_21(30265, (4157270696713096027L ^ life4_3)));
    life9_128 = (((java.util.Random)(p1)).nextInt(((int)(__sourceIntrinsic_83c0409717df_invokedynamic657_22(28072, (4478658023081545933L ^ life4_3))))) + __sourceIntrinsic_83c0409717df_invokedynamic657_24(30265, (4157270696713096027L ^ life4_3)));
    life10_145 = ((java.util.Random)(p1)).nextInt(((int)((((moom.DT)(((net.minecraft.world.World)(p0)).a__DT(((moom.DT)(((moom.DT)(p2)).a(((int)(life8_114)), ((int)(0)), ((int)(life9_128)))))))).b() + __sourceIntrinsic_83c0409717df_invokedynamic657_28(5295, (3105471475964733900L ^ life4_3))))));
    ((moom.Gi)(moom.Fc.ai)).a__Boolean(((net.minecraft.world.World)(p0)), ((java.util.Random)(p1)), ((moom.DT)(((moom.DT)(p2)).a(((int)(life8_114)), ((int)(life10_145)), ((int)(life9_128))))));
    life7_93 += 1;
    if (!((life6_5 == null))) {
        break lexical_join_151;
    }
    if (!((life6_5 != null))) { continue lexical_cycle_79; }
    break lexical_cycle_79;
    }
    }
    super.a(((net.minecraft.world.World)(p0)), ((java.util.Random)(p1)), ((moom.DT)(p2)));
    }
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_723b001678d2_invokedynamic214_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_83c0409717df_invokedynamic657_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_83c0409717df_invokedynamic657_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_83c0409717df_invokedynamic657_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_83c0409717df_invokedynamic657_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_83c0409717df_invokedynamic657_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_83c0409717df_invokedynamic657_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_83c0409717df_invokedynamic657_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_83c0409717df_invokedynamic657_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_83c0409717df_invokedynamic657_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_83c0409717df_invokedynamic657_28(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4531_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_69a026c4ca08_invokedynamic216_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_69a026c4ca08_invokedynamic216_8(int a0, long a1) throws E;

private static native <E extends Throwable> net.minecraft.world.biome.BiomeGenBase __sourceIntrinsic_69a026c4ca08_call216_14(moom.Fc a0, int a1) throws E;
}
