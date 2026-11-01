package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class E0 extends net.minecraft.world.biome.BiomeGenBase {

private net.minecraft.block.state.IBlockState[] aG;

private long aH;

private moom.FW aI;

private moom.FW aJ;

private moom.FW aK;

private boolean aL;

private boolean aM;

private static long cb;

private static long[] gb;

private static java.lang.Integer[] hb;

private static java.util.Map ib;

public E0(int p0, boolean p1, boolean p2) { super(0); }


private static void __sourceConstructorBody_4862c562db610ec4(moom.E0 receiver, int p0, boolean p1, boolean p2) throws Throwable {

long local4_life2 = (moom.E0.cb ^ 126890499591214L);

    moom.E0.__sourceConstructorInit_4862c562db610ec4_0(((moom.E0)(receiver)), ((int)(p0)));

    ((moom.E0)(receiver)).aL = ((boolean)(p1));

    ((moom.E0)(receiver)).aM = ((boolean)(p2));

    ((moom.E0)(receiver)).a__ES();

    ((moom.E0)(receiver)).a(((float)(0x1.0p1f)), ((float)(0x0.0p0f)));

    ((java.util.List)(((moom.E0)(receiver)).aw)).clear();

    ((moom.E0)(receiver)).am = ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((moom.dx)(net.minecraft.init.Blocks.m)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.dx.R)), ((java.lang.Comparable)(moom.ab.RED_SAND)))));

    ((moom.E0)(receiver)).an = ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b9)).a__fE()));

    ((moom.EQ)(((moom.E0)(receiver)).au)).A = ((int)(-999));

    ((moom.EQ)(((moom.E0)(receiver)).au)).D = ((int)(20));

    ((moom.EQ)(((moom.E0)(receiver)).au)).F = ((int)(3));

    ((moom.EQ)(((moom.E0)(receiver)).au)).G = ((int)(5));

    ((moom.EQ)(((moom.E0)(receiver)).au)).B = ((int)(0));

    ((java.util.List)(((moom.E0)(receiver)).aw)).clear();

    if (p2) {

        ((moom.EQ)(((moom.E0)(receiver)).au)).A = ((int)(5));

    }

    return;

}



static {
cb = ((long)(((moom._a)(moom._c.a(((long)(-1250739220898318108L)), ((long)(-36916083658934836L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(191844028650449L)))));
    ib = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.E0.cb ^ 33468541801951L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill699_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill699_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill699_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill699_14 = new byte[8];
    (__sourceSpill699_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill699_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation699_16 = __sourceSpill699_14;
    ((javax.crypto.Cipher)(__sourceSpill699_11)).init(((int)(__sourceSpill699_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill699_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation699_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[13];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "§\005&Y\002¤\001ô¸ÓZsÕ´Ú[+Ü*l×FéaAI#\016Ü&ÏZPªW³Á\006ÅÈ0\033F\024FþÐJã¾4\002\022eráÙTÄAÞ¼?ô¦+Ñ¯ãôíZmÖ»#\fm"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill699_25 = local6_life21;
        int __sourceSpill699_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill699_25)).substring(((int)(__sourceSpill699_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill699_30 = local8_life19;
        int __sourceSpill699_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill699_33 = new byte[8];
        (__sourceSpill699_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill699_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill699_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill699_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill699_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill699_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill699_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill699_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill699_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill699_34)).doFinal(((byte[])(__sourceSpill699_33)));
        (__sourceSpill699_30)[__sourceSpill699_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "¾¶þ\007*Å!\b¥ç·R©È"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill699_38 = local6_life21;
        int __sourceSpill699_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill699_38)).substring(((int)(__sourceSpill699_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill699_43 = local8_life19;
        int __sourceSpill699_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill699_46 = new byte[8];
        (__sourceSpill699_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill699_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill699_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill699_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill699_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill699_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill699_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill699_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill699_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill699_47)).doFinal(((byte[])(__sourceSpill699_46)));
        (__sourceSpill699_43)[__sourceSpill699_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    gb = ((long[])(local8_life19));
    hb = ((java.lang.Integer[])(new java.lang.Integer[13]));
}

private static native <E extends Throwable> void __sourceConstructorInit_4862c562db610ec4_0(moom.E0 a0, int a1) throws E;

private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4279_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/E0"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x4680;
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
                throw new RuntimeException("moom/E0", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            E0.hb[n2] = n4;
        }
        return hb[n2];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.E0.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public int b(moom.DT p0) {
long local2 = (moom.E0.cb ^ 14062720355654L);
    return __sourceIntrinsic_3bdbffc242b6_originalDynamicSite1120_1(15377, (5203095230017816201L ^ local2));
}


protected net.minecraft.world.biome.BiomeGenBase d(int p0) {
int forwardValue199_14_0;
    int forwardValue199_16_0;
    int spill199_0;
    long life2_3;
    java.lang.String life4_5;
    int life5_22;
    moom.E0 life6_30;
    forward_join_47: {
    forward_join_41: {
    forward_join_39: {
    forward_join_16: {
    forward_join_15: {
    forward_join_14: {
    life2_3 = (moom.E0.cb ^ 102646354571709L);
    life4_5 = net.minecraft.world.biome.WorldChunkManager.b();
    spill199_0 = this.aB;
    if (!((life4_5 == null))) {
        forwardValue199_14_0 = spill199_0;
        break forward_join_14;
    }
    if (!((spill199_0 == ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.ac)).aB))) {
        break forward_join_15;
    }
    forwardValue199_14_0 = 1;
    }
    forwardValue199_16_0 = forwardValue199_14_0;
    break forward_join_16;
    }
    forwardValue199_16_0 = 0;
    }
    life5_22 = forwardValue199_16_0;
    life6_30 = new moom.E0(p0, ((life5_22) != 0), this.aM);
    if (!((life4_5 == null))) {
        break forward_join_39;
    }
    if (!((life5_22 == 0))) {
        break forward_join_41;
    }
    ((moom.E0)(life6_30)).a(((net.minecraft.world.biome.BiomeGenBase$Height)(moom.E0.h)));
    ((moom.E0)(life6_30)).a(((java.lang.String)(__sourceIntrinsic_69a026c4ca08_invokedynamic199_10(this.aj))));
    }
    if (!((life4_5 != null))) {
        break forward_join_47;
    }
    }
    ((moom.E0)(life6_30)).a(((java.lang.String)(__sourceIntrinsic_69a026c4ca08_invokedynamic199_13(this.aj))));
    }
    ((moom.E0)(life6_30)).a(((int)(this.ak)), ((boolean)(true)));
    return life6_30;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private net.minecraft.block.state.IBlockState a(int p0, int p1, int p2) {
long local4 = (moom.E0.cb ^ 20517070717478L);
    int local6 = ((int) java.lang.Math.round(((double)((((moom.FW)(this.aK)).a(((double)((((double) p0) / 0x1.0p9d))), ((double)((((double) p0) / 0x1.0p9d)))) * 0x1.0p1d)))));
    return (this.aG)[(((p1 + local6) + __sourceIntrinsic_6ee239b26731_originalDynamicSite1121_5(4003, (1464434545721752153L ^ local4))) % __sourceIntrinsic_6ee239b26731_originalDynamicSite1121_6(4003, (1464434545721752153L ^ local4)))];
}


public moom.F0 a(java.util.Random p0) {
return this.aC;
}


public void a(net.minecraft.world.World p0, java.util.Random p1, moom.Fm p2, int p3, int p4, double p5) {
moom.E0 lexicalValue571_20_0;
    moom.E0 lexicalValue571_24_0;
    moom.FW lexicalValue571_32_0;
    moom.E0 lexicalValue571_34_0;
    moom.E0 lexicalValue571_62_0;
    double lexicalValue571_163_0;
    double lexicalValue571_163_1;
    int lexicalValue571_172_0;
    int lexicalValue571_183_0;
    int lexicalValue571_214_0;
    int lexicalValue571_216_0;
    int lexicalValue571_255_0;
    int lexicalValue571_255_1;
    net.minecraft.block.Block lexicalValue571_284_0;
    int lexicalValue571_304_0;
    int lexicalValue571_325_0;
    int lexicalValue571_325_1;
    net.minecraft.block.state.IBlockState lexicalValue571_341_0;
    int lexicalValue571_356_0;
    int lexicalValue571_356_1;
    int lexicalValue571_384_0;
    int lexicalValue571_424_0;
    int lexicalValue571_429_0;
    int lexicalValue571_429_1;
    int lexicalValue571_449_0;
    int lexicalValue571_449_1;
    int lexicalValue571_460_0;
    int lexicalValue571_460_1;
    int lexicalValue571_462_0;
    int lexicalValue571_491_0;
    int lexicalValue571_498_0;
    moom.E0 spill571_0;
    moom.E0 spill571_1;
    moom.FW spill571_2;
    moom.E0 spill571_3;
    boolean spill571_4;
    int spill571_5;
    double spill571_6;
    double spill571_7;
    int spill571_8;
    int spill571_9;
    long spill571_10;
    int spill571_11;
    int spill571_12;
    net.minecraft.block.Block spill571_13;
    int spill571_14;
    int spill571_15;
    int spill571_16;
    int spill571_17;
    int spill571_18;
    net.minecraft.block.state.IBlockState spill571_19;
    net.minecraft.block.state.IBlockState spill571_20;
    int spill571_21;
    int spill571_22;
    int spill571_23;
    int spill571_24;
    long life8_3;
    java.lang.String life10_5;
    java.util.Random life11_70;
    double life11_90;
    int life13_114;
    int life14_130;
    double life15_145;
    double life17_156;
    double life19_169;
    double life11_175;
    double life21_182;
    int life15_216;
    net.minecraft.block.state.IBlockState life16_219;
    net.minecraft.block.state.IBlockState life17_222;
    int life18_234;
    int life19_252;
    int life20_255;
    int life21_260;
    int life22_262;
    net.minecraft.block.state.IBlockState life23_318;
    net.minecraft.block.state.IBlockState life24_606;
    net.minecraft.block.state.IBlockState life24_672;
    lexical_join_526: {
    lexical_join_216: {
    lexical_join_215: {
    lexical_join_214: {
    lexical_join_183: {
    lexical_join_172: {
    lexical_join_165: {
    lexical_join_163: {
    lexical_join_161: {
    lexical_join_62: {
    lexical_join_61: {
    lexical_join_41: {
    lexical_join_34: {
    lexical_join_32: {
    lexical_join_24: {
    lexical_join_23: {
    lexical_join_20: {
    lexical_join_19: {
    life8_3 = (moom.E0.cb ^ 99810902656023L);
    life10_5 = net.minecraft.world.biome.WorldChunkManager.b();
    spill571_0 = this;
    if (!((life10_5 == null))) {
        lexicalValue571_20_0 = spill571_0;
        break lexical_join_20;
    }
    if (!((((moom.E0)(spill571_0)).aG != null))) {
        break lexical_join_19;
    }
    spill571_1 = this;
    if (!((life10_5 == null))) {
        lexicalValue571_24_0 = spill571_1;
        break lexical_join_24;
    }
    if (!((recovery.source.CarrierOps.lcmp(((long)(((moom.E0)(spill571_1)).aH)), ((long)(((net.minecraft.world.World)(p0)).a__Long()))) != 0))) {
        break lexical_join_23;
    }
    }
    lexicalValue571_20_0 = this;
    }
    ((moom.E0)(lexicalValue571_20_0)).a(((long)(((net.minecraft.world.World)(p0)).a__Long())));
    }
    lexicalValue571_24_0 = this;
    }
    spill571_2 = ((moom.E0)(lexicalValue571_24_0)).aI;
    if (!((life10_5 == null))) {
        lexicalValue571_32_0 = spill571_2;
        break lexical_join_32;
    }
    if (!((spill571_2 != null))) {
        break lexical_join_41;
    }
    spill571_3 = this;
    if (!((life10_5 == null))) {
        lexicalValue571_34_0 = spill571_3;
        break lexical_join_34;
    }
    lexicalValue571_32_0 = ((moom.E0)(spill571_3)).aJ;
    }
    if (!((lexicalValue571_32_0 != null))) {
        break lexical_join_41;
    }
    lexicalValue571_34_0 = this;
    }
    if (!((life10_5 == null))) {
        lexicalValue571_62_0 = lexicalValue571_34_0;
        break lexical_join_62;
    }
    if (!((recovery.source.CarrierOps.lcmp(((long)(((moom.E0)(lexicalValue571_34_0)).aH)), ((long)(((net.minecraft.world.World)(p0)).a__Long()))) != 0))) {
        break lexical_join_61;
    }
    }
    life11_70 = new java.util.Random(this.aH);
    this.aI = ((moom.FW)(new moom.FW(life11_70, 4)));
    this.aJ = ((moom.FW)(new moom.FW(life11_70, 1)));
    }
    lexicalValue571_62_0 = this;
    }
    ((moom.E0)(lexicalValue571_62_0)).aH = ((long)(((net.minecraft.world.World)(p0)).a__Long()));
    life11_90 = 0x0.0p0d;
    spill571_4 = this.aL;
    if (!((life10_5 == null))) {
        lexicalValue571_172_0 = ((spill571_4) ? 1 : 0);
        break lexical_join_172;
    }
    if (!(spill571_4)) {
        break lexical_join_165;
    }
    life13_114 = ((p3 & __sourceIntrinsic_d455e0af9aa3_invokedynamic571_20(1785, (8476030030340633908L ^ life8_3))) + (p4 & __sourceIntrinsic_d455e0af9aa3_invokedynamic571_21(30888, (7646445264188492651L ^ life8_3))));
    life14_130 = ((p4 & __sourceIntrinsic_d455e0af9aa3_invokedynamic571_22(28984, (2550133394645598968L ^ life8_3))) + (p3 & __sourceIntrinsic_d455e0af9aa3_invokedynamic571_23(1009, (6215094990830645300L ^ life8_3))));
    life15_145 = java.lang.Math.min(((double)(java.lang.Math.abs(((double)(p5))))), ((double)(((moom.FW)(this.aI)).a(((double)((((double) life13_114) * 0x1.0p-2d))), ((double)((((double) life14_130) * 0x1.0p-2d)))))));
    spill571_5 = recovery.source.CarrierOps.dcmpl(((double)(life15_145)), ((double)(0x0.0p0d)));
    if (!((life10_5 == null))) {
        lexicalValue571_183_0 = spill571_5;
        break lexical_join_183;
    }
    if (!((spill571_5 > 0))) {
        break lexical_join_165;
    }
    life17_156 = 0x1.0p-9d;
    life19_169 = java.lang.Math.abs(((double)(((moom.FW)(this.aJ)).a(((double)((((double) life13_114) * life17_156))), ((double)((((double) life14_130) * life17_156)))))));
    life11_175 = ((life15_145 * life15_145) * 0x1.4p1d);
    life21_182 = (java.lang.Math.ceil(((double)((life19_169 * 0x1.9p5d)))) + 0x1.cp3d);
    spill571_6 = life11_175;
    spill571_7 = life21_182;
    if (!((life10_5 == null))) {
        lexicalValue571_163_0 = spill571_6;
        lexicalValue571_163_1 = spill571_7;
        break lexical_join_163;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(spill571_6)), ((double)(spill571_7))) > 0))) {
        break lexical_join_161;
    }
    life11_175 = life21_182;
    }
    lexicalValue571_163_0 = life11_175;
    lexicalValue571_163_1 = 0x1.0p6d;
    }
    life11_90 = (lexicalValue571_163_0 + lexicalValue571_163_1);
    }
    lexicalValue571_172_0 = (p3 & __sourceIntrinsic_d455e0af9aa3_invokedynamic571_34(1009, (6215094990830645300L ^ life8_3)));
    }
    life13_114 = lexicalValue571_172_0;
    life14_130 = (p4 & __sourceIntrinsic_d455e0af9aa3_invokedynamic571_35(1009, (6215094990830645300L ^ life8_3)));
    lexicalValue571_183_0 = ((net.minecraft.world.World)(p0)).c();
    }
    life15_216 = lexicalValue571_183_0;
    life16_219 = ((net.minecraft.block.Block)(net.minecraft.init.Blocks.b9)).a__fE();
    life17_222 = this.an;
    life18_234 = ((int) (((p5 / 0x1.8p1d) + 0x1.8p1d) + (((java.util.Random)(p1)).nextDouble() * 0x1.0p-2d)));
    spill571_8 = recovery.source.CarrierOps.dcmpl(((double)(java.lang.Math.cos(((double)(((p5 / 0x1.8p1d) * 0x1.921fb54442d18p1d)))))), ((double)(0x0.0p0d)));
    if (!((life10_5 == null))) {
        lexicalValue571_214_0 = spill571_8;
        break lexical_join_214;
    }
    if (!((spill571_8 > 0))) {
        break lexical_join_215;
    }
    lexicalValue571_214_0 = 1;
    }
    lexicalValue571_216_0 = lexicalValue571_214_0;
    break lexical_join_216;
    }
    lexicalValue571_216_0 = 0;
    }
    life19_252 = lexicalValue571_216_0;
    spill571_9 = 1158;
    life20_255 = -1;
    spill571_10 = (4811419965364549452L ^ life8_3);
    life21_260 = 0;
    life22_262 = __sourceIntrinsic_d455e0af9aa3_invokedynamic571_43(spill571_9, spill571_10);
    lexical_cycle_227: while (true) {
    lexical_join_524: {
    lexical_join_523: {
    lexical_join_511: {
    lexical_join_509: {
    lexical_join_498: {
    lexical_join_491: {
    lexical_join_490: {
    lexical_join_482: {
    lexical_join_476: {
    lexical_join_468: {
    lexical_join_462: {
    lexical_join_460: {
    lexical_join_449: {
    lexical_join_443: {
    lexical_join_429: {
    lexical_join_424: {
    lexical_join_423: {
    lexical_join_414: {
    lexical_join_384: {
    lexical_join_382: {
    lexical_join_356: {
    lexical_join_342: {
    lexical_join_341: {
    lexical_join_339: {
    lexical_join_325: {
    lexical_join_323: {
    lexical_join_304: {
    lexical_join_303: {
    lexical_join_284: {
    lexical_join_282: {
    lexical_join_265: {
    lexical_join_255: {
    lexical_join_251: {
    if (!((life22_262 >= 0))) {
        break lexical_join_526;
    }
    if (!((((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((moom.Fm)(p2)).a(((int)(life14_130)), ((int)(life22_262)), ((int)(life13_114))))).a__ch())).a__fn() == moom.fn.a))) {
        break lexical_join_251;
    }
    spill571_11 = life22_262;
    spill571_12 = ((int) life11_90);
    if (!((life10_5 == null))) {
        lexicalValue571_255_0 = spill571_11;
        lexicalValue571_255_1 = spill571_12;
        break lexical_join_255;
    }
    if (!((spill571_11 < spill571_12))) {
        break lexical_join_251;
    }
    ((moom.Fm)(p2)).a(((int)(life14_130)), ((int)(life22_262)), ((int)(life13_114)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b)).a__fE())));
    }
    lexicalValue571_255_0 = life22_262;
    lexicalValue571_255_1 = ((java.util.Random)(p1)).nextInt(((int)(5)));
    }
    if (!((lexicalValue571_255_0 <= lexicalValue571_255_1))) {
        break lexical_join_265;
    }
    ((moom.Fm)(p2)).a(((int)(life14_130)), ((int)(life22_262)), ((int)(life13_114)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.h)).a__fE())));
    if (!((life10_5 != null))) {
        break lexical_join_523;
    }
    }
    life23_318 = ((moom.Fm)(p2)).a(((int)(life14_130)), ((int)(life22_262)), ((int)(life13_114)));
    spill571_13 = ((net.minecraft.block.state.IBlockState)(life23_318)).a__ch();
    if (!((life10_5 == null))) {
        lexicalValue571_284_0 = spill571_13;
        break lexical_join_284;
    }
    if (!((((net.minecraft.block.Block)(spill571_13)).a__fn() == moom.fn.a))) {
        break lexical_join_282;
    }
    life20_255 = -1;
    if (!((life10_5 != null))) {
        break lexical_join_523;
    }
    }
    lexicalValue571_284_0 = ((net.minecraft.block.state.IBlockState)(life23_318)).a__ch();
    }
    if (!((lexicalValue571_284_0 == net.minecraft.init.Blocks.b))) {
        break lexical_join_523;
    }
    spill571_14 = life20_255;
    if (!((life10_5 == null))) {
        lexicalValue571_491_0 = spill571_14;
        break lexical_join_491;
    }
    if (!((spill571_14 == -1))) {
        break lexical_join_490;
    }
    life21_260 = 0;
    spill571_15 = life18_234;
    if (!((life10_5 == null))) {
        lexicalValue571_304_0 = spill571_15;
        break lexical_join_304;
    }
    if (!((spill571_15 <= 0))) {
        break lexical_join_303;
    }
    life16_219 = null;
    life17_222 = ((net.minecraft.block.Block)(net.minecraft.init.Blocks.b)).a__fE();
    break lexical_join_323;
    }
    lexicalValue571_304_0 = life22_262;
    }
    spill571_16 = (life15_216 - 4);
    if (!((life10_5 == null))) {
        lexicalValue571_325_0 = lexicalValue571_304_0;
        lexicalValue571_325_1 = spill571_16;
        break lexical_join_325;
    }
    if (!((lexicalValue571_304_0 >= spill571_16))) {
        break lexical_join_323;
    }
    spill571_17 = life22_262;
    spill571_18 = (life15_216 + 1);
    if (!((life10_5 == null))) {
        lexicalValue571_325_0 = spill571_17;
        lexicalValue571_325_1 = spill571_18;
        break lexical_join_325;
    }
    if (!((spill571_17 <= spill571_18))) {
        break lexical_join_323;
    }
    life16_219 = ((net.minecraft.block.Block)(net.minecraft.init.Blocks.b9)).a__fE();
    life17_222 = this.an;
    }
    lexicalValue571_325_0 = life22_262;
    lexicalValue571_325_1 = life15_216;
    }
    if (!((life10_5 == null))) {
        lexicalValue571_356_0 = lexicalValue571_325_0;
        lexicalValue571_356_1 = lexicalValue571_325_1;
        break lexical_join_356;
    }
    if (!((lexicalValue571_325_0 < lexicalValue571_325_1))) {
        break lexical_join_342;
    }
    spill571_19 = life16_219;
    if (!((life10_5 == null))) {
        lexicalValue571_341_0 = spill571_19;
        break lexical_join_341;
    }
    if (!((spill571_19 != null))) {
        break lexical_join_339;
    }
    spill571_20 = life16_219;
    if (!((life10_5 == null))) {
        lexicalValue571_341_0 = spill571_20;
        break lexical_join_341;
    }
    if (!((((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(spill571_20)).a__ch())).a__fn() == moom.fn.a))) {
        break lexical_join_342;
    }
    }
    lexicalValue571_341_0 = ((moom.dN)(net.minecraft.init.Blocks.j)).a__fE();
    }
    life16_219 = lexicalValue571_341_0;
    }
    life20_255 = (life18_234 + java.lang.Math.max(((int)(0)), ((int)((life22_262 - life15_216)))));
    spill571_21 = life22_262;
    if (!((life10_5 == null))) {
        lexicalValue571_384_0 = spill571_21;
        break lexical_join_384;
    }
    lexicalValue571_356_0 = spill571_21;
    lexicalValue571_356_1 = (life15_216 - 1);
    }
    if (!((lexicalValue571_356_0 < lexicalValue571_356_1))) {
        break lexical_join_382;
    }
    ((moom.Fm)(p2)).a(((int)(life14_130)), ((int)(life22_262)), ((int)(life13_114)), ((net.minecraft.block.state.IBlockState)(life17_222)));
    if (!((life10_5 == null))) {
        break lexical_join_524;
    }
    if (!((((net.minecraft.block.state.IBlockState)(life17_222)).a__ch() == net.minecraft.init.Blocks.b9))) {
        break lexical_join_523;
    }
    ((moom.Fm)(p2)).a(((int)(life14_130)), ((int)(life22_262)), ((int)(life13_114)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(life17_222)).a__ch())).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.cR.Q)), ((java.lang.Comparable)(net.minecraft.item.EnumDyeColor.ORANGE))))));
    if (!((life10_5 != null))) {
        break lexical_join_523;
    }
    }
    lexicalValue571_384_0 = ((this.aM) ? 1 : 0);
    }
    if (!((life10_5 == null))) {
        lexicalValue571_424_0 = lexicalValue571_384_0;
        break lexical_join_424;
    }
    if (!((lexicalValue571_384_0 != 0))) {
        break lexical_join_423;
    }
    spill571_22 = life22_262;
    spill571_23 = (__sourceIntrinsic_d455e0af9aa3_invokedynamic571_83(18510, (5644333030480182153L ^ life8_3)) + (life18_234 * 2));
    if (!((life10_5 == null))) {
        lexicalValue571_429_0 = spill571_22;
        lexicalValue571_429_1 = spill571_23;
        break lexical_join_429;
    }
    if (!((spill571_22 > spill571_23))) {
        break lexical_join_423;
    }
    if (!((life19_252 != 0))) {
        break lexical_join_414;
    }
    ((moom.Fm)(p2)).a(((int)(life14_130)), ((int)(life22_262)), ((int)(life13_114)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.d)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.dq.Q)), ((java.lang.Comparable)(net.minecraft.block.BlockDirt$DirtType.COARSE_DIRT))))));
    if (!((life10_5 != null))) {
        break lexical_join_523;
    }
    }
    ((moom.Fm)(p2)).a(((int)(life14_130)), ((int)(life22_262)), ((int)(life13_114)), ((net.minecraft.block.state.IBlockState)(((moom.dC)(net.minecraft.init.Blocks.c)).a__fE())));
    if (!((life10_5 != null))) {
        break lexical_join_523;
    }
    }
    lexicalValue571_424_0 = life22_262;
    }
    lexicalValue571_429_0 = lexicalValue571_424_0;
    lexicalValue571_429_1 = ((life15_216 + 3) + life18_234);
    }
    if (!((life10_5 == null))) {
        lexicalValue571_449_0 = lexicalValue571_429_0;
        lexicalValue571_449_1 = lexicalValue571_429_1;
        break lexical_join_449;
    }
    if (!((lexicalValue571_429_0 <= lexicalValue571_429_1))) {
        break lexical_join_443;
    }
    ((moom.Fm)(p2)).a(((int)(life14_130)), ((int)(life22_262)), ((int)(life13_114)), ((net.minecraft.block.state.IBlockState)(this.am)));
    life21_260 = 1;
    if (!((life10_5 != null))) {
        break lexical_join_523;
    }
    }
    lexicalValue571_449_0 = life22_262;
    lexicalValue571_449_1 = __sourceIntrinsic_d455e0af9aa3_invokedynamic571_95(4003, (1464513323891276904L ^ life8_3));
    }
    if (!((life10_5 == null))) {
        lexicalValue571_460_0 = lexicalValue571_449_0;
        lexicalValue571_460_1 = lexicalValue571_449_1;
        break lexical_join_460;
    }
    if (!((lexicalValue571_449_0 >= lexicalValue571_449_1))) {
        break lexical_join_476;
    }
    spill571_24 = life22_262;
    if (!((life10_5 == null))) {
        lexicalValue571_462_0 = spill571_24;
        break lexical_join_462;
    }
    lexicalValue571_460_0 = spill571_24;
    lexicalValue571_460_1 = __sourceIntrinsic_d455e0af9aa3_invokedynamic571_96(417, (1180569561055212131L ^ life8_3));
    }
    if (!((lexicalValue571_460_0 <= lexicalValue571_460_1))) {
        break lexical_join_476;
    }
    lexicalValue571_462_0 = life19_252;
    }
    if (!((lexicalValue571_462_0 != 0))) {
        break lexical_join_468;
    }
    life24_606 = ((net.minecraft.block.Block)(net.minecraft.init.Blocks.cd)).a__fE();
    if (!((life10_5 != null))) {
        break lexical_join_482;
    }
    }
    life24_606 = ((moom.E0)(this)).a(((int)(p3)), ((int)(life22_262)), ((int)(p4)));
    if (!((life10_5 != null))) {
        break lexical_join_482;
    }
    }
    life24_606 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b9)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.cR.Q)), ((java.lang.Comparable)(net.minecraft.item.EnumDyeColor.ORANGE)));
    }
    ((moom.Fm)(p2)).a(((int)(life14_130)), ((int)(life22_262)), ((int)(life13_114)), ((net.minecraft.block.state.IBlockState)(life24_606)));
    if (!((life10_5 != null))) {
        break lexical_join_523;
    }
    }
    lexicalValue571_491_0 = life20_255;
    }
    if (!((life10_5 == null))) {
        lexicalValue571_498_0 = lexicalValue571_491_0;
        break lexical_join_498;
    }
    if (!((lexicalValue571_491_0 > 0))) {
        break lexical_join_523;
    }
    life20_255 += -1;
    if (!((life10_5 == null))) {
        break lexical_join_509;
    }
    lexicalValue571_498_0 = life21_260;
    }
    if (!((lexicalValue571_498_0 != 0))) {
        break lexical_join_511;
    }
    ((moom.Fm)(p2)).a(((int)(life14_130)), ((int)(life22_262)), ((int)(life13_114)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b9)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.cR.Q)), ((java.lang.Comparable)(net.minecraft.item.EnumDyeColor.ORANGE))))));
    }
    if (!((life10_5 != null))) {
        break lexical_join_523;
    }
    }
    life24_672 = ((moom.E0)(this)).a(((int)(p3)), ((int)(life22_262)), ((int)(p4)));
    ((moom.Fm)(p2)).a(((int)(life14_130)), ((int)(life22_262)), ((int)(life13_114)), ((net.minecraft.block.state.IBlockState)(life24_672)));
    }
    life22_262 += -1;
    }
    if (!((life10_5 != null))) { continue lexical_cycle_227; }
    break lexical_cycle_227;
    }
    }
    return;
}


private void a(long p0) {
int forestValue236_75_0;
    int forestValue236_75_1;
    int forestValue236_81_0;
    int forestValue236_81_1;
    int forestValue236_138_0;
    int forestValue236_141_0;
    int forestValue236_141_1;
    int forestValue236_198_0;
    int forestValue236_201_0;
    int forestValue236_201_1;
    int forestValue236_260_0;
    int forestValue236_263_0;
    int forestValue236_263_1;
    int forestValue236_311_0;
    int forestValue236_311_1;
    int forestValue236_335_0;
    int forestValue236_342_0;
    int forestValue236_342_1;
    int forestValue236_345_0;
    java.lang.String spill236_0;
    int spill236_1;
    int spill236_2;
    int spill236_3;
    int spill236_4;
    int spill236_5;
    int spill236_6;
    int spill236_7;
    int spill236_8;
    int spill236_9;
    int spill236_10;
    int spill236_11;
    int spill236_12;
    int spill236_13;
    boolean spill236_14;
    long life3_3;
    java.util.Random life6_22;
    java.lang.String life5_30;
    int life7_32;
    int life7_79;
    int life8_81;
    int life9_90;
    int life10_98;
    int life11_102;
    int life9_142;
    int life10_151;
    int life11_159;
    int life12_163;
    int life10_203;
    int life11_212;
    int life12_220;
    int life13_224;
    int life12_266;
    int life13_271;
    int life14_285;
    forest_join_365: {
    forest_join_260: {
    forest_join_251: {
    forest_join_198: {
    forest_join_191: {
    forest_join_138: {
    forest_join_131: {
    forest_join_75: {
    forest_join_71: {
    life3_3 = (moom.E0.cb ^ 35488515435177L);
    spill236_0 = net.minecraft.world.biome.WorldChunkManager.b();
    this.aG = ((net.minecraft.block.state.IBlockState[])(new net.minecraft.block.state.IBlockState[__sourceIntrinsic_e753b806269e_invokedynamic236_2(25088, (1177071522036727674L ^ life3_3))]));
    java.util.Arrays.fill(((java.lang.Object[])(this.aG)), ((java.lang.Object)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.cd)).a__fE())));
    life6_22 = new java.util.Random(p0);
    this.aK = ((moom.FW)(new moom.FW(life6_22, 1)));
    life5_30 = spill236_0;
    life7_32 = 0;
    forest_cycle_33: while (true) {
    forest_join_69: {
    forest_join_68: {
    if (!((life7_32 < __sourceIntrinsic_e753b806269e_invokedynamic236_9(4003, (1464379725561680598L ^ life3_3))))) {
        break forest_join_71;
    }
    life7_32 = (life7_32 + (((java.util.Random)(life6_22)).nextInt(((int)(5))) + 1));
    if (!((life5_30 == null))) {
        break forest_join_69;
    }
    spill236_1 = life7_32;
    spill236_2 = __sourceIntrinsic_e753b806269e_invokedynamic236_11(4003, (1464379725561680598L ^ life3_3));
    if (!((life5_30 == null))) {
        forestValue236_75_0 = spill236_1;
        forestValue236_75_1 = spill236_2;
        break forest_join_75;
    }
    if (!((spill236_1 < spill236_2))) {
        break forest_join_68;
    }
    (this.aG)[life7_32] = ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b9)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.cR.Q)), ((java.lang.Comparable)(net.minecraft.item.EnumDyeColor.ORANGE)));
    }
    life7_32 += 1;
    }
    if (!((life5_30 != null))) {
        continue forest_cycle_33;
    }
    break forest_cycle_33;
    }
    }
    forestValue236_75_0 = ((java.util.Random)(life6_22)).nextInt(((int)(4)));
    forestValue236_75_1 = 2;
    }
    life7_79 = (forestValue236_75_0 + forestValue236_75_1);
    life8_81 = 0;
    forest_cycle_79: while (true) {
    forest_join_128: {
    forestValue236_81_0 = life8_81;
    forestValue236_81_1 = life7_79;
    forest_cycle_81: while (true) {
    if (!((forestValue236_81_0 < forestValue236_81_1))) {
        break forest_join_131;
    }
    life9_90 = (((java.util.Random)(life6_22)).nextInt(((int)(3))) + 1);
    life10_98 = ((java.util.Random)(life6_22)).nextInt(((int)(__sourceIntrinsic_e753b806269e_invokedynamic236_20(4003, (1464379725561680598L ^ life3_3)))));
    spill236_3 = 0;
    if (!((life5_30 == null))) {
        forestValue236_138_0 = spill236_3;
        break forest_join_138;
    }
    life11_102 = spill236_3;
    forest_cycle_100: while (true) {
    if (!(((life10_98 + life11_102) < __sourceIntrinsic_e753b806269e_invokedynamic236_22(4003, (1464379725561680598L ^ life3_3))))) {
        break forest_join_128;
    }
    spill236_4 = life11_102;
    spill236_5 = life9_90;
    if (!((life5_30 == null))) {
        forestValue236_81_0 = spill236_4;
        forestValue236_81_1 = spill236_5;
        continue forest_cycle_81;
    }
    if (!((spill236_4 < spill236_5))) {
        break forest_join_128;
    }
    (this.aG)[(life10_98 + life11_102)] = ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b9)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.cR.Q)), ((java.lang.Comparable)(net.minecraft.item.EnumDyeColor.YELLOW)));
    life11_102 += 1;
    if (!((life5_30 != null))) {
        continue forest_cycle_100;
    }
    break forest_cycle_100;
    }
    break forest_cycle_81;
    }
    }
    life8_81 += 1;
    if (!((life5_30 != null))) {
        continue forest_cycle_79;
    }
    break forest_cycle_79;
    }
    }
    life8_81 = (((java.util.Random)(life6_22)).nextInt(((int)(4))) + 2);
    forestValue236_138_0 = 0;
    }
    life9_142 = forestValue236_138_0;
    forest_cycle_139: while (true) {
    forest_join_188: {
    forestValue236_141_0 = life9_142;
    forestValue236_141_1 = life8_81;
    forest_cycle_141: while (true) {
    if (!((forestValue236_141_0 < forestValue236_141_1))) {
        break forest_join_191;
    }
    life10_151 = (((java.util.Random)(life6_22)).nextInt(((int)(3))) + 2);
    life11_159 = ((java.util.Random)(life6_22)).nextInt(((int)(__sourceIntrinsic_e753b806269e_invokedynamic236_31(4003, (1464379725561680598L ^ life3_3)))));
    spill236_6 = 0;
    if (!((life5_30 == null))) {
        forestValue236_198_0 = spill236_6;
        break forest_join_198;
    }
    life12_163 = spill236_6;
    forest_cycle_160: while (true) {
    if (!(((life11_159 + life12_163) < __sourceIntrinsic_e753b806269e_invokedynamic236_33(4003, (1464379725561680598L ^ life3_3))))) {
        break forest_join_188;
    }
    spill236_7 = life12_163;
    spill236_8 = life10_151;
    if (!((life5_30 == null))) {
        forestValue236_141_0 = spill236_7;
        forestValue236_141_1 = spill236_8;
        continue forest_cycle_141;
    }
    if (!((spill236_7 < spill236_8))) {
        break forest_join_188;
    }
    (this.aG)[(life11_159 + life12_163)] = ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b9)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.cR.Q)), ((java.lang.Comparable)(net.minecraft.item.EnumDyeColor.BROWN)));
    life12_163 += 1;
    if (!((life5_30 != null))) {
        continue forest_cycle_160;
    }
    break forest_cycle_160;
    }
    break forest_cycle_141;
    }
    }
    life9_142 += 1;
    if (!((life5_30 != null))) {
        continue forest_cycle_139;
    }
    break forest_cycle_139;
    }
    }
    life9_142 = (((java.util.Random)(life6_22)).nextInt(((int)(4))) + 2);
    forestValue236_198_0 = 0;
    }
    life10_203 = forestValue236_198_0;
    forest_cycle_199: while (true) {
    forest_join_248: {
    forestValue236_201_0 = life10_203;
    forestValue236_201_1 = life9_142;
    forest_cycle_201: while (true) {
    if (!((forestValue236_201_0 < forestValue236_201_1))) {
        break forest_join_251;
    }
    life11_212 = (((java.util.Random)(life6_22)).nextInt(((int)(3))) + 1);
    life12_220 = ((java.util.Random)(life6_22)).nextInt(((int)(__sourceIntrinsic_e753b806269e_invokedynamic236_42(4003, (1464379725561680598L ^ life3_3)))));
    spill236_9 = 0;
    if (!((life5_30 == null))) {
        forestValue236_260_0 = spill236_9;
        break forest_join_260;
    }
    life13_224 = spill236_9;
    forest_cycle_220: while (true) {
    if (!(((life12_220 + life13_224) < __sourceIntrinsic_e753b806269e_invokedynamic236_44(4003, (1464379725561680598L ^ life3_3))))) {
        break forest_join_248;
    }
    spill236_10 = life13_224;
    spill236_11 = life11_212;
    if (!((life5_30 == null))) {
        forestValue236_201_0 = spill236_10;
        forestValue236_201_1 = spill236_11;
        continue forest_cycle_201;
    }
    if (!((spill236_10 < spill236_11))) {
        break forest_join_248;
    }
    (this.aG)[(life12_220 + life13_224)] = ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b9)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.cR.Q)), ((java.lang.Comparable)(net.minecraft.item.EnumDyeColor.RED)));
    life13_224 += 1;
    if (!((life5_30 != null))) {
        continue forest_cycle_220;
    }
    break forest_cycle_220;
    }
    break forest_cycle_201;
    }
    }
    life10_203 += 1;
    if (!((life5_30 != null))) {
        continue forest_cycle_199;
    }
    break forest_cycle_199;
    }
    }
    life10_203 = (((java.util.Random)(life6_22)).nextInt(((int)(3))) + 3);
    life11_212 = 0;
    forestValue236_260_0 = 0;
    }
    life12_266 = forestValue236_260_0;
    forest_cycle_261: while (true) {
    forest_join_362: {
    forestValue236_263_0 = life12_266;
    forestValue236_263_1 = life10_203;
    forest_cycle_263: while (true) {
    if (!((forestValue236_263_0 < forestValue236_263_1))) {
        break forest_join_365;
    }
    life13_271 = 1;
    life11_212 = (life11_212 + (((java.util.Random)(life6_22)).nextInt(((int)(__sourceIntrinsic_e753b806269e_invokedynamic236_52(29308, (8813132227521425155L ^ life3_3))))) + 4));
    life14_285 = 0;
    forest_cycle_280: while (true) {
    forest_join_359: {
    forest_join_345: {
    forest_join_342: {
    forest_join_335: {
    forest_join_332: {
    forest_join_311: {
    if (!(((life11_212 + life14_285) < __sourceIntrinsic_e753b806269e_invokedynamic236_54(4003, (1464379725561680598L ^ life3_3))))) {
        break forest_join_362;
    }
    spill236_12 = life14_285;
    spill236_13 = life13_271;
    if (!((life5_30 == null))) {
        forestValue236_263_0 = spill236_12;
        forestValue236_263_1 = spill236_13;
        continue forest_cycle_263;
    }
    if (!((life5_30 == null))) {
        forestValue236_311_0 = spill236_12;
        forestValue236_311_1 = spill236_13;
        break forest_join_311;
    }
    if (!((spill236_12 < spill236_13))) {
        break forest_join_362;
    }
    (this.aG)[(life11_212 + life14_285)] = ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b9)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.cR.Q)), ((java.lang.Comparable)(net.minecraft.item.EnumDyeColor.WHITE)));
    forestValue236_311_0 = (life11_212 + life14_285);
    forestValue236_311_1 = 1;
    }
    if (!((life5_30 == null))) {
        forestValue236_342_0 = forestValue236_311_0;
        forestValue236_342_1 = forestValue236_311_1;
        break forest_join_342;
    }
    if (!((forestValue236_311_0 > forestValue236_311_1))) {
        break forest_join_332;
    }
    spill236_14 = ((java.util.Random)(life6_22)).nextBoolean();
    if (!((life5_30 == null))) {
        forestValue236_335_0 = ((spill236_14) ? 1 : 0);
        break forest_join_335;
    }
    if (!(spill236_14)) {
        break forest_join_332;
    }
    (this.aG)[((life11_212 + life14_285) - 1)] = ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b9)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.cR.Q)), ((java.lang.Comparable)(net.minecraft.item.EnumDyeColor.SILVER)));
    }
    forestValue236_335_0 = (life11_212 + life14_285);
    }
    if (!((life5_30 == null))) {
        forestValue236_345_0 = forestValue236_335_0;
        break forest_join_345;
    }
    forestValue236_342_0 = forestValue236_335_0;
    forestValue236_342_1 = __sourceIntrinsic_e753b806269e_invokedynamic236_69(24951, (5126108781677231119L ^ life3_3));
    }
    if (!((forestValue236_342_0 < forestValue236_342_1))) {
        break forest_join_359;
    }
    forestValue236_345_0 = ((((java.util.Random)(life6_22)).nextBoolean()) ? 1 : 0);
    }
    if (!((forestValue236_345_0 != 0))) {
        break forest_join_359;
    }
    (this.aG)[((life11_212 + life14_285) + 1)] = ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b9)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.cR.Q)), ((java.lang.Comparable)(net.minecraft.item.EnumDyeColor.SILVER)));
    }
    life14_285 += 1;
    if (!((life5_30 != null))) {
        continue forest_cycle_280;
    }
    break forest_cycle_280;
    }
    break forest_cycle_263;
    }
    }
    life12_266 += 1;
    if (!((life5_30 != null))) {
        continue forest_cycle_261;
    }
    break forest_cycle_261;
    }
    }
    return;
}


public void a(net.minecraft.world.World p0, java.util.Random p1, moom.DT p2) {
super.a(((net.minecraft.world.World)(p0)), ((java.util.Random)(p1)), ((moom.DT)(p2)));
    return;
}


public int a__Int(moom.DT p0) {
long local2 = (moom.E0.cb ^ 59924650399471L);
    return __sourceIntrinsic_798dc89b6a8c_originalDynamicSite1122_1(25539, (2470913096754070259L ^ local2));
}


private static native <E extends Throwable> int __sourceIntrinsic_6ee239b26731_originalDynamicSite1121_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6ee239b26731_originalDynamicSite1121_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e753b806269e_invokedynamic236_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e753b806269e_invokedynamic236_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e753b806269e_invokedynamic236_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e753b806269e_invokedynamic236_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e753b806269e_invokedynamic236_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e753b806269e_invokedynamic236_31(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e753b806269e_invokedynamic236_33(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e753b806269e_invokedynamic236_42(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e753b806269e_invokedynamic236_44(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e753b806269e_invokedynamic236_52(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e753b806269e_invokedynamic236_54(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e753b806269e_invokedynamic236_69(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d455e0af9aa3_invokedynamic571_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d455e0af9aa3_invokedynamic571_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d455e0af9aa3_invokedynamic571_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d455e0af9aa3_invokedynamic571_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d455e0af9aa3_invokedynamic571_34(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d455e0af9aa3_invokedynamic571_35(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d455e0af9aa3_invokedynamic571_43(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d455e0af9aa3_invokedynamic571_83(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d455e0af9aa3_invokedynamic571_95(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d455e0af9aa3_invokedynamic571_96(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_798dc89b6a8c_originalDynamicSite1122_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4279_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3bdbffc242b6_originalDynamicSite1120_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_69a026c4ca08_invokedynamic199_10(java.lang.String a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_69a026c4ca08_invokedynamic199_13(java.lang.String a0) throws E;
}
