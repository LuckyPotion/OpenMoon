package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class EZ extends net.minecraft.world.biome.BiomeGenBase {

private boolean aG;

private static net.minecraft.block.state.IBlockState aH;

private static net.minecraft.block.state.IBlockState aI;

private static net.minecraft.block.state.IBlockState aJ;

private static long cb;

private static long[] gb;

private static java.lang.Integer[] hb;

private static java.util.Map ib;

public EZ(int p0, boolean p1) { super(0); }


private static void __sourceConstructorBody_55a05cc474a9ecc6(moom.EZ receiver, int p0, boolean p1) throws Throwable {

long local3_life2 = (moom.EZ.cb ^ 119751625817460L);

    moom.EZ.__sourceConstructorInit_55a05cc474a9ecc6_0(((moom.EZ)(receiver)), ((int)(p0)));

    ((moom.EZ)(receiver)).aG = ((boolean)(p1));

    if (p1) {

        ((moom.EQ)(((moom.EZ)(receiver)).au)).A = ((int)(2));

    } else {

        ((moom.EQ)(((moom.EZ)(receiver)).au)).A = ((int)(50));

    }

    ((moom.EQ)(((moom.EZ)(receiver)).au)).C = ((int)(25));

    ((moom.EQ)(((moom.EZ)(receiver)).au)).B = ((int)(4));

    if ((!p1)) {

        ((java.util.List)(((moom.EZ)(receiver)).av)).add(((java.lang.Object)(new moom.D7(net.minecraft.entity.passive.EntityOcelot.class, 2, 1, 1))));

    }

    ((java.util.List)(((moom.EZ)(receiver)).aw)).add(((java.lang.Object)(new moom.D7(net.minecraft.entity.passive.EntityChicken.class, 10, 4, 4))));

    return;

}



static {
cb = ((long)(((moom._a)(moom._c.a(((long)(5932788651553749017L)), ((long)(2961349666197325489L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(155633046797020L)))));
    ib = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.EZ.cb ^ 22367824396286L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill715_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill715_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill715_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill715_14 = new byte[8];
    (__sourceSpill715_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill715_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation715_16 = __sourceSpill715_14;
    ((javax.crypto.Cipher)(__sourceSpill715_11)).init(((int)(__sourceSpill715_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill715_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation715_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[11];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "\024ÌOz¨érßDß63\000ö|¯Ö=}»Ê¼ý ÆAC+§ÜÞ\026£{*¤þªl\026Fr\023\000îkMØÀØ5aÈú\t¼_®#öcßäZ"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill715_25 = local6_life21;
        int __sourceSpill715_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill715_25)).substring(((int)(__sourceSpill715_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill715_30 = local8_life19;
        int __sourceSpill715_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill715_33 = new byte[8];
        (__sourceSpill715_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill715_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill715_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill715_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill715_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill715_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill715_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill715_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill715_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill715_34)).doFinal(((byte[])(__sourceSpill715_33)));
        (__sourceSpill715_30)[__sourceSpill715_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "îÌä*Ø£\025ýEºÃòßÇªÞ"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill715_38 = local6_life21;
        int __sourceSpill715_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill715_38)).substring(((int)(__sourceSpill715_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill715_43 = local8_life19;
        int __sourceSpill715_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill715_46 = new byte[8];
        (__sourceSpill715_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill715_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill715_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill715_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill715_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill715_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill715_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill715_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill715_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill715_47)).doFinal(((byte[])(__sourceSpill715_46)));
        (__sourceSpill715_43)[__sourceSpill715_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    gb = ((long[])(local8_life19));
    hb = ((java.lang.Integer[])(new java.lang.Integer[11]));
    aH = ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.r)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.ee.S)), ((java.lang.Comparable)(net.minecraft.block.BlockPlanks$EnumType.JUNGLE)))));
    aI = ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((moom.dH)(net.minecraft.init.Blocks.t)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.dJ.W)), ((java.lang.Comparable)(net.minecraft.block.BlockPlanks$EnumType.JUNGLE))))).a__fE(((net.minecraft.block.properties.IProperty)(moom.dH.S)), ((java.lang.Comparable)(java.lang.Boolean.FALSE)))));
    aJ = ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((moom.dH)(net.minecraft.init.Blocks.t)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.dJ.W)), ((java.lang.Comparable)(net.minecraft.block.BlockPlanks$EnumType.OAK))))).a__fE(((net.minecraft.block.properties.IProperty)(moom.dH.S)), ((java.lang.Comparable)(java.lang.Boolean.FALSE)))));
}

private static native <E extends Throwable> void __sourceConstructorInit_55a05cc474a9ecc6_0(moom.EZ a0, int a1) throws E;

private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x1B56;
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
                throw new RuntimeException("moom/EZ", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            EZ.hb[n2] = n4;
        }
        return hb[n2];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.EZ.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4348_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/EZ"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public moom.FY a__FY(java.util.Random p0) {
long local2 = (moom.EZ.cb ^ 40681429396247L);
    return ((((java.util.Random)(p0)).nextInt(((int)(4))) == 0) ? new moom.Gz(moom.ar.FERN) : new moom.Gz(moom.ar.GRASS));
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public moom.F0 a(java.util.Random p0) {
int forwardValue1824_22_0;
    int forwardValue1824_33_0;
    int forwardValue1824_39_0;
    moom.F0 forwardValue1824_73_0;
    int spill1824_0;
    long life2_3;
    java.lang.String life4_5;
    forward_join_73: {
    forward_join_57: {
    forward_join_39: {
    forward_join_33: {
    forward_join_31: {
    forward_join_22: {
    forward_join_19: {
    life2_3 = (moom.EZ.cb ^ 64986961304218L);
    life4_5 = net.minecraft.world.biome.WorldChunkManager.b();
    spill1824_0 = ((java.util.Random)(p0)).nextInt(((int)(__sourceIntrinsic_723b001678d2_invokedynamic1824_2(22832, (6329478024722010545L ^ life2_3)))));
    if (!((life4_5 == null))) {
        forwardValue1824_22_0 = spill1824_0;
        break forward_join_22;
    }
    if (!((spill1824_0 == 0))) {
        break forward_join_19;
    }
    forwardValue1824_73_0 = this.aD;
    break forward_join_73;
    }
    forwardValue1824_22_0 = ((java.util.Random)(p0)).nextInt(((int)(2)));
    }
    if (!((life4_5 == null))) {
        forwardValue1824_33_0 = forwardValue1824_22_0;
        break forward_join_33;
    }
    if (!((forwardValue1824_22_0 == 0))) {
        break forward_join_31;
    }
    forwardValue1824_73_0 = new moom.Gb(moom.EZ.aH, moom.EZ.aJ);
    break forward_join_73;
    }
    forwardValue1824_33_0 = ((this.aG) ? 1 : 0);
    }
    if (!((life4_5 == null))) {
        forwardValue1824_39_0 = forwardValue1824_33_0;
        break forward_join_39;
    }
    if (!((forwardValue1824_33_0 == 0))) {
        break forward_join_57;
    }
    forwardValue1824_39_0 = ((java.util.Random)(p0)).nextInt(((int)(3)));
    }
    if (!((forwardValue1824_39_0 == 0))) {
        break forward_join_57;
    }
    forwardValue1824_73_0 = new moom.F5(false, __sourceIntrinsic_723b001678d2_invokedynamic1824_11(25255, (5540751950323673632L ^ life2_3)), __sourceIntrinsic_723b001678d2_invokedynamic1824_12(7148, (186740784353743724L ^ life2_3)), moom.EZ.aH, moom.EZ.aI);
    break forward_join_73;
    }
    forwardValue1824_73_0 = new moom.Ga(false, (4 + ((java.util.Random)(p0)).nextInt(((int)(__sourceIntrinsic_723b001678d2_invokedynamic1824_15(25808, (2102697655150341209L ^ life2_3)))))), moom.EZ.aH, moom.EZ.aI, true);
    }
    return forwardValue1824_73_0;
}


public void a(net.minecraft.world.World p0, java.util.Random p1, moom.DT p2) {
java.lang.String spill594_0;
    long life4_3;
    int life7_22;
    int life8_37;
    java.lang.String life6_38;
    int life9_51;
    moom.GA life10_67;
    int life8_69;
    int life9_90;
    int life11_96;
    int life12_110;
    lexical_join_128: {
    life4_3 = (moom.EZ.cb ^ 122225986491979L);
    super.a(((net.minecraft.world.World)(p0)), ((java.util.Random)(p1)), ((moom.DT)(p2)));
    life7_22 = (((java.util.Random)(p1)).nextInt(((int)(__sourceIntrinsic_83c0409717df_invokedynamic594_2(27293, (5182607342427860686L ^ life4_3))))) + __sourceIntrinsic_83c0409717df_invokedynamic594_4(14844, (4968775209318727083L ^ life4_3)));
    spill594_0 = net.minecraft.world.biome.WorldChunkManager.b();
    life8_37 = (((java.util.Random)(p1)).nextInt(((int)(__sourceIntrinsic_83c0409717df_invokedynamic594_6(7635, (1128296967099816330L ^ life4_3))))) + __sourceIntrinsic_83c0409717df_invokedynamic594_8(15821, (4645721302560192919L ^ life4_3)));
    life6_38 = spill594_0;
    life9_51 = ((java.util.Random)(p1)).nextInt(((int)((((moom.DT)(((net.minecraft.world.World)(p0)).a__DT(((moom.DT)(((moom.DT)(p2)).a(((int)(life7_22)), ((int)(0)), ((int)(life8_37)))))))).b() * 2))));
    ((moom.Gt)(new moom.Gt())).a__Boolean(((net.minecraft.world.World)(p0)), ((java.util.Random)(p1)), ((moom.DT)(((moom.DT)(p2)).a(((int)(life7_22)), ((int)(life9_51)), ((int)(life8_37))))));
    life10_67 = new moom.GA();
    life8_69 = 0;
    lexical_cycle_70: while (true) {
    if (!((life8_69 < __sourceIntrinsic_83c0409717df_invokedynamic594_15(30943, (7434482326201629834L ^ life4_3))))) {
        break lexical_join_128;
    }
    life9_90 = (((java.util.Random)(p1)).nextInt(((int)(__sourceIntrinsic_83c0409717df_invokedynamic594_16(7635, (1128296967099816330L ^ life4_3))))) + __sourceIntrinsic_83c0409717df_invokedynamic594_18(15821, (4645721302560192919L ^ life4_3)));
    life11_96 = __sourceIntrinsic_83c0409717df_invokedynamic594_19(12232, (1217216497098435484L ^ life4_3));
    life12_110 = (((java.util.Random)(p1)).nextInt(((int)(__sourceIntrinsic_83c0409717df_invokedynamic594_20(7635, (1128296967099816330L ^ life4_3))))) + __sourceIntrinsic_83c0409717df_invokedynamic594_22(15821, (4645721302560192919L ^ life4_3)));
    ((moom.GA)(life10_67)).a__Boolean(((net.minecraft.world.World)(p0)), ((java.util.Random)(p1)), ((moom.DT)(((moom.DT)(p2)).a(((int)(life9_90)), ((int)(__sourceIntrinsic_83c0409717df_invokedynamic594_23(20843, (5192479812047656249L ^ life4_3)))), ((int)(life12_110))))));
    life8_69 += 1;
    if (!((life6_38 != null))) { continue lexical_cycle_70; }
    break lexical_cycle_70;
    }
    }
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_723b001678d2_invokedynamic1824_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_723b001678d2_invokedynamic1824_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_723b001678d2_invokedynamic1824_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_723b001678d2_invokedynamic1824_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_83c0409717df_invokedynamic594_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_83c0409717df_invokedynamic594_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_83c0409717df_invokedynamic594_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_83c0409717df_invokedynamic594_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_83c0409717df_invokedynamic594_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_83c0409717df_invokedynamic594_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_83c0409717df_invokedynamic594_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_83c0409717df_invokedynamic594_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_83c0409717df_invokedynamic594_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_83c0409717df_invokedynamic594_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_83c0409717df_invokedynamic594_23(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4348_0() throws E;
}
