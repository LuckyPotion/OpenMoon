package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class EY extends net.minecraft.world.biome.BiomeGenBase {

private moom.FY aG;

private moom.F_ aH;

private int aI;

private int aJ;

private int aK;

private int aL;

private static long cb;

private static long[] gb;

private static java.lang.Integer[] hb;

private static java.util.Map ib;

protected EY(int p0, boolean p1) { super(0); }


private static void __sourceConstructorBody_aab6195f622439e5(moom.EY receiver, int p0, boolean p1) throws Throwable {

long local3_life2 = (moom.EY.cb ^ 118665659498754L);

    moom.EY.__sourceConstructorInit_aab6195f622439e5_0(((moom.EY)(receiver)), ((int)(p0)));

    ((moom.EY)(receiver)).aG = ((moom.FY)(new moom.Gu(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a4)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.eh.Q)), ((java.lang.Comparable)(net.minecraft.block.BlockSilverfish$EnumType.STONE))), 9)));

    ((moom.EY)(receiver)).aH = ((moom.F_)(new moom.F_(false)));

    ((moom.EY)(receiver)).aI = ((int)(0));

    ((moom.EY)(receiver)).aJ = ((int)(1));

    ((moom.EY)(receiver)).aK = ((int)(2));

    moom.EY __sourceSpill479_17 = receiver;

    java.util.Objects.requireNonNull(((java.lang.Object)(receiver)));

    ((moom.EY)(__sourceSpill479_17)).aL = ((int)(0));

    if (p1) {

        ((moom.EQ)(((moom.EY)(receiver)).au)).A = ((int)(3));

        moom.EY __sourceSpill479_23 = receiver;

        java.util.Objects.requireNonNull(((java.lang.Object)(receiver)));

        ((moom.EY)(__sourceSpill479_23)).aL = ((int)(1));

    }

    return;

}



static {
cb = ((long)(((moom._a)(moom._c.a(((long)(-2683235974794478760L)), ((long)(-2148797527424034647L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(217652892828795L)))));
    ib = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.EY.cb ^ 33633492217804L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill714_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill714_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill714_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill714_14 = new byte[8];
    (__sourceSpill714_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill714_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation714_16 = __sourceSpill714_14;
    ((javax.crypto.Cipher)(__sourceSpill714_11)).init(((int)(__sourceSpill714_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill714_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation714_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[7];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "\024\037'jDñ¾·j\"â ®\003g\007q¬\f<Q\034¡Þ¶Nä¾Ú{±å~}$ã"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill714_25 = local6_life21;
        int __sourceSpill714_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill714_25)).substring(((int)(__sourceSpill714_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill714_30 = local8_life19;
        int __sourceSpill714_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill714_33 = new byte[8];
        (__sourceSpill714_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill714_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill714_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill714_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill714_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill714_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill714_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill714_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill714_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill714_34)).doFinal(((byte[])(__sourceSpill714_33)));
        (__sourceSpill714_30)[__sourceSpill714_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "¢\007s\"´ÿôZ¨Jq@\006\002è"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill714_38 = local6_life21;
        int __sourceSpill714_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill714_38)).substring(((int)(__sourceSpill714_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill714_43 = local8_life19;
        int __sourceSpill714_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill714_46 = new byte[8];
        (__sourceSpill714_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill714_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill714_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill714_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill714_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill714_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill714_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill714_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill714_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill714_47)).doFinal(((byte[])(__sourceSpill714_46)));
        (__sourceSpill714_43)[__sourceSpill714_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    gb = ((long[])(local8_life19));
    hb = ((java.lang.Integer[])(new java.lang.Integer[7]));
}

private static native <E extends Throwable> void __sourceConstructorInit_aab6195f622439e5_0(moom.EY a0, int a1) throws E;

private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4345_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/EY"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x5600;
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
                throw new RuntimeException("moom/EY", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            EY.hb[n2] = n4;
        }
        return hb[n2];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.EY.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


protected net.minecraft.world.biome.BiomeGenBase d(int p0) {
return ((moom.EY)(new moom.EY(p0, false))).a__sourceReturn_83d2ac9a07(((net.minecraft.world.biome.BiomeGenBase)(this)));
}


public void a(net.minecraft.world.World p0, java.util.Random p1, moom.DT p2) {
java.lang.String spill593_0;
    long life4_3;
    int life7_19;
    int life8_21;
    java.lang.String life6_22;
    int life9_33;
    int life10_43;
    int life11_51;
    moom.DT life12_57;
    int life8_103;
    int life9_111;
    int life10_119;
    lexical_join_125: {
    lexical_join_80: {
    lexical_join_78: {
    life4_3 = (moom.EY.cb ^ 78641475305514L);
    super.a(((net.minecraft.world.World)(p0)), ((java.util.Random)(p1)), ((moom.DT)(p2)));
    spill593_0 = net.minecraft.world.biome.WorldChunkManager.b();
    life7_19 = (3 + ((java.util.Random)(p1)).nextInt(((int)(__sourceIntrinsic_83c0409717df_invokedynamic593_3(28681, (6996113914705754383L ^ life4_3))))));
    life8_21 = 0;
    life6_22 = spill593_0;
    lexical_cycle_23: while (true) {
    lexical_join_76: {
    lexical_join_75: {
    if (!((life8_21 < life7_19))) {
        break lexical_join_78;
    }
    life9_33 = ((java.util.Random)(p1)).nextInt(((int)(__sourceIntrinsic_83c0409717df_invokedynamic593_5(22506, (8812314129031405288L ^ life4_3)))));
    life10_43 = (((java.util.Random)(p1)).nextInt(((int)(__sourceIntrinsic_83c0409717df_invokedynamic593_7(8454, (7951782562319132674L ^ life4_3))))) + 4);
    life11_51 = ((java.util.Random)(p1)).nextInt(((int)(__sourceIntrinsic_83c0409717df_invokedynamic593_9(1756, (4962682781786755039L ^ life4_3)))));
    life12_57 = ((moom.DT)(p2)).a(((int)(life9_33)), ((int)(life10_43)), ((int)(life11_51)));
    if (!((life6_22 == null))) {
        break lexical_join_80;
    }
    if (!((life6_22 == null))) {
        break lexical_join_76;
    }
    if (!((((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life12_57))))).a__ch() == net.minecraft.init.Blocks.b))) {
        break lexical_join_75;
    }
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(life12_57)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bE)).a__fE())), ((int)(2)));
    }
    life8_21 += 1;
    }
    if (!((life6_22 != null))) { continue lexical_cycle_23; }
    break lexical_cycle_23;
    }
    }
    life7_19 = 0;
    }
    lexical_cycle_80: while (true) {
    if (!((life7_19 < __sourceIntrinsic_83c0409717df_invokedynamic593_18(12720, (8183963393457453239L ^ life4_3))))) {
        break lexical_join_125;
    }
    life8_103 = ((java.util.Random)(p1)).nextInt(((int)(__sourceIntrinsic_83c0409717df_invokedynamic593_19(1756, (4962682781786755039L ^ life4_3)))));
    life9_111 = ((java.util.Random)(p1)).nextInt(((int)(__sourceIntrinsic_83c0409717df_invokedynamic593_21(31675, (5035379235543036603L ^ life4_3)))));
    life10_119 = ((java.util.Random)(p1)).nextInt(((int)(__sourceIntrinsic_83c0409717df_invokedynamic593_23(1756, (4962682781786755039L ^ life4_3)))));
    ((moom.FY)(this.aG)).a__Boolean(((net.minecraft.world.World)(p0)), ((java.util.Random)(p1)), ((moom.DT)(((moom.DT)(p2)).a(((int)(life8_103)), ((int)(life9_111)), ((int)(life10_119))))));
    life7_19 += 1;
    if (!((life6_22 != null))) { continue lexical_cycle_80; }
    break lexical_cycle_80;
    }
    }
    return;
}


public moom.F0 a(java.util.Random p0) {
long local2 = (moom.EY.cb ^ 21668731604219L);
    return ((((java.util.Random)(p0)).nextInt(((int)(3))) > 0) ? this.aH : super.a(((java.util.Random)(p0))));
}


private moom.EY a__sourceReturn_83d2ac9a07(net.minecraft.world.biome.BiomeGenBase p0) {
long local2 = (moom.EY.cb ^ 80506426153355L);
    moom.EY __sourceSpill1467_2 = this;
    java.util.Objects.requireNonNull(((java.lang.Object)(this)));
    ((moom.EY)(__sourceSpill1467_2)).aL = ((int)(__sourceIntrinsic_51fb29bca550_originalDynamicSite1467_3(1388, (2940043783826167240L ^ local2))));
    ((moom.EY)(this)).a(((int)(((net.minecraft.world.biome.BiomeGenBase)(p0)).ak)), ((boolean)(true)));
    ((moom.EY)(this)).a(((java.lang.String)(__sourceIntrinsic_51fb29bca550_originalDynamicSite1467_8(((net.minecraft.world.biome.BiomeGenBase)(p0)).aj))));
    ((moom.EY)(this)).a(((net.minecraft.world.biome.BiomeGenBase$Height)(new net.minecraft.world.biome.BiomeGenBase$Height(((net.minecraft.world.biome.BiomeGenBase)(p0)).ap, ((net.minecraft.world.biome.BiomeGenBase)(p0)).aq))));
    ((moom.EY)(this)).a(((float)(((net.minecraft.world.biome.BiomeGenBase)(p0)).ar)), ((float)(((net.minecraft.world.biome.BiomeGenBase)(p0)).as)));
    return this;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(net.minecraft.world.World p0, java.util.Random p1, moom.Fm p2, int p3, int p4, double p5) {
int forwardValue1823_31_0;
    int forwardValue1823_48_0;
    int forwardValue1823_58_0;
    moom.EY forwardValue1823_69_0;
    java.lang.String spill1823_0;
    int spill1823_1;
    int spill1823_2;
    int spill1823_3;
    moom.EY spill1823_4;
    int spill1823_5;
    long life8_3;
    java.lang.String life10_13;
    forward_join_69: {
    forward_join_68: {
    forward_join_58: {
    forward_join_48: {
    forward_join_45: {
    forward_join_31: {
    forward_join_26: {
    life8_3 = (moom.EY.cb ^ 37690311387757L);
    spill1823_0 = net.minecraft.world.biome.WorldChunkManager.b();
    this.am = ((net.minecraft.block.state.IBlockState)(((moom.dC)(net.minecraft.init.Blocks.c)).a__fE()));
    this.an = ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.d)).a__fE()));
    life10_13 = spill1823_0;
    spill1823_1 = recovery.source.CarrierOps.dcmpg(((double)(p5)), ((double)(-0x1.0p0d)));
    if (!((life10_13 == null))) {
        forwardValue1823_31_0 = spill1823_1;
        break forward_join_31;
    }
    if (!((spill1823_1 >= 0))) {
        break forward_join_26;
    }
    spill1823_2 = recovery.source.CarrierOps.dcmpl(((double)(p5)), ((double)(0x1.0p1d)));
    if (!((life10_13 == null))) {
        forwardValue1823_48_0 = spill1823_2;
        break forward_join_48;
    }
    if (!((spill1823_2 > 0))) {
        break forward_join_45;
    }
    }
    spill1823_3 = this.aL;
    java.util.Objects.requireNonNull(((java.lang.Object)(this)));
    forwardValue1823_31_0 = spill1823_3;
    }
    if (!((life10_13 == null))) {
        forwardValue1823_48_0 = forwardValue1823_31_0;
        break forward_join_48;
    }
    if (!((forwardValue1823_31_0 == 2))) {
        break forward_join_45;
    }
    this.am = ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.n)).a__fE()));
    this.an = ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.n)).a__fE()));
    if (!((life10_13 != null))) {
        break forward_join_68;
    }
    }
    forwardValue1823_48_0 = recovery.source.CarrierOps.dcmpl(((double)(p5)), ((double)(0x1.0p0d)));
    }
    if (!((life10_13 == null))) {
        forwardValue1823_58_0 = forwardValue1823_48_0;
        break forward_join_58;
    }
    if (!((forwardValue1823_48_0 > 0))) {
        break forward_join_68;
    }
    spill1823_4 = this;
    if (!((life10_13 == null))) {
        forwardValue1823_69_0 = spill1823_4;
        break forward_join_69;
    }
    spill1823_5 = ((moom.EY)(spill1823_4)).aL;
    java.util.Objects.requireNonNull(((java.lang.Object)(this)));
    forwardValue1823_58_0 = spill1823_5;
    }
    if (!((forwardValue1823_58_0 != 1))) {
        break forward_join_68;
    }
    this.am = ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b)).a__fE()));
    this.an = ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b)).a__fE()));
    }
    forwardValue1823_69_0 = this;
    }
    ((moom.EY)(forwardValue1823_69_0)).b(((net.minecraft.world.World)(p0)), ((java.util.Random)(p1)), ((moom.Fm)(p2)), ((int)(p3)), ((int)(p4)), ((double)(p5)));
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_83c0409717df_invokedynamic593_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_83c0409717df_invokedynamic593_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_83c0409717df_invokedynamic593_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_83c0409717df_invokedynamic593_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_83c0409717df_invokedynamic593_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_83c0409717df_invokedynamic593_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_83c0409717df_invokedynamic593_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_83c0409717df_invokedynamic593_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_51fb29bca550_originalDynamicSite1467_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_51fb29bca550_originalDynamicSite1467_8(java.lang.String a0) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4345_0() throws E;
}
