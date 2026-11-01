package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class HL extends moom.HF {

private static java.util.List<moom.D5> f;

private boolean g;

private static long h;

private static long[] i;

private static java.lang.Integer[] j;

private static java.util.Map k;

public HL() {
super();
}


public HL(int p0, java.util.Random p1, moom.G2 p2, moom.bs p3) { super(0); }


private static void __sourceConstructorBody_c8ccd5798d332cbf(moom.HL receiver, int p0, java.util.Random p1, moom.G2 p2, moom.bs p3) throws Throwable {

moom.HL __initValue503_32_0;

    int __initValue503_32_1;

    moom.HL __initValue503_33_0;

    moom.HL __initValue503_34_0;

    int __initValue503_34_1;

    init_join_34: {

    init_join_33: {

    init_join_32: {

    long local5_life2 = (moom.HL.h ^ 32554625414192L);

    net.minecraft.entity.Entity[] __sourceSpill503_4 = moom.G4.b();

    moom.HL.__sourceConstructorInit_c8ccd5798d332cbf_0(((moom.HL)(receiver)), ((int)(p0)));

    net.minecraft.entity.Entity[] local7_life6 = __sourceSpill503_4;

    ((moom.HL)(receiver)).b = ((moom.bs)(p3));

    ((moom.HL)(receiver)).e = ((moom.bJ)(((moom.HL)(receiver)).a(((java.util.Random)(p1)))));

    ((moom.HL)(receiver)).a = ((moom.G2)(p2));

    moom.HL __sourceSpill503_12 = receiver;

    int __sourceSpill503_13 = ((moom.G2)(p2)).b();

    if (!((local7_life6 != null))) {

        __initValue503_32_0 = __sourceSpill503_12;

        __initValue503_32_1 = __sourceSpill503_13;

        break init_join_32;

    }

    if (!((__sourceSpill503_13 > __sourceIntrinsic_c8ccd5798d332cbf_originalDynamicSite503_15(7735, (6178053374542078603L ^ local5_life2))))) {

        __initValue503_33_0 = __sourceSpill503_12;

        break init_join_33;

    }

    __initValue503_32_0 = __sourceSpill503_12;

    __initValue503_32_1 = 1;

    }

    __initValue503_34_0 = __initValue503_32_0;

    __initValue503_34_1 = __initValue503_32_1;

    break init_join_34;

    }

    __initValue503_34_0 = __initValue503_33_0;

    __initValue503_34_1 = 0;

    }

    ((moom.HL)(__initValue503_34_0)).g = ((boolean)__sourceIntrinsic_integerToBoolean((__initValue503_34_1)));

    return;

}



static {
h = ((long)(((moom._a)(moom._c.a(((long)(-2217536207594690943L)), ((long)(-4254923787952124628L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(249747817078913L)))));
    long local11_life6 = (moom.HL.h ^ 95450254142573L);
    k = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life9;
    javax.crypto.Cipher __sourceSpill814_11 = (local0_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill814_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill814_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill814_14 = new byte[8];
    (__sourceSpill814_14)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local1_life15 = 1;
    while ((local1_life15 < 8)) {
        (__sourceSpill814_14)[local1_life15] = ((byte) ((int) ((local11_life6 << (local1_life15 * 8)) >>> 56)));
        local1_life15 += 1;
    }
    byte[] __sourcePreallocation814_16 = __sourceSpill814_14;
    ((javax.crypto.Cipher)(__sourceSpill814_11)).init(((int)(__sourceSpill814_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill814_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation814_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life19 = new long[24];
    int local3_life20 = 0;
    java.lang.String local4_life21;
    int local5_life23 = ((java.lang.String)((local4_life21 = ">SùÔãSÅ\"¹\027Huh½|[¢DÔrZ¤O\022di%èSWÅqQ¬LYA«h·y8â\022ÆA³=Üß\002%æ¯a?Ar s~Õ'9ÝÎ¯m\bÈ¶u\b×u\"aÖK±\032·h\034%¶A®nÍ-æÞª\031&ròm¢\\¨\024âÞrXy\025Úé#+\177ôX\030\016)ç\006©Óê¨(n¼\024Æ¦³ä®¡ÒÞñ¥/qÔÇcXezµ'ùf©Ç|[­"))).length();
    int local2_life24 = 0;
    do {
        java.lang.String __sourceSpill814_25 = local4_life21;
        int __sourceSpill814_26 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill814_25)).substring(((int)(__sourceSpill814_26)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill814_30 = local6_life19;
        int __sourceSpill814_31 = local3_life20;
        local3_life20 += 1;
        long local8_life32 = (((((((((((long) (local7_life29)[0]) & 255L) << 56) | ((((long) (local7_life29)[1]) & 255L) << 48)) | ((((long) (local7_life29)[2]) & 255L) << 40)) | ((((long) (local7_life29)[3]) & 255L) << 32)) | ((((long) (local7_life29)[4]) & 255L) << 24)) | ((((long) (local7_life29)[5]) & 255L) << 16)) | ((((long) (local7_life29)[6]) & 255L) << 8)) | (((long) (local7_life29)[7]) & 255L));
        byte[] __sourceSpill814_33 = new byte[8];
        (__sourceSpill814_33)[0] = ((byte) ((int) (local8_life32 >>> 56)));
        (__sourceSpill814_33)[1] = ((byte) ((int) (local8_life32 >>> 48)));
        (__sourceSpill814_33)[2] = ((byte) ((int) (local8_life32 >>> 40)));
        (__sourceSpill814_33)[3] = ((byte) ((int) (local8_life32 >>> 32)));
        (__sourceSpill814_33)[4] = ((byte) ((int) (local8_life32 >>> 24)));
        (__sourceSpill814_33)[5] = ((byte) ((int) (local8_life32 >>> 16)));
        (__sourceSpill814_33)[6] = ((byte) ((int) (local8_life32 >>> 8)));
        (__sourceSpill814_33)[7] = ((byte) ((int) local8_life32));
        javax.crypto.Cipher __sourceSpill814_34 = local0_life9;
        byte[] local10_life36 = ((javax.crypto.Cipher)(__sourceSpill814_34)).doFinal(((byte[])(__sourceSpill814_33)));
        (__sourceSpill814_30)[__sourceSpill814_31] = (((((((((((long) (local10_life36)[0]) & 255L) << 56) | ((((long) (local10_life36)[1]) & 255L) << 48)) | ((((long) (local10_life36)[2]) & 255L) << 40)) | ((((long) (local10_life36)[3]) & 255L) << 32)) | ((((long) (local10_life36)[4]) & 255L) << 24)) | ((((long) (local10_life36)[5]) & 255L) << 16)) | ((((long) (local10_life36)[6]) & 255L) << 8)) | (((long) (local10_life36)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    local5_life23 = ((java.lang.String)((local4_life21 = "Qá4/s\n6¦ÓÚ+5ÑZ8®"))).length();
    local2_life24 = 0;
    do {
        java.lang.String __sourceSpill814_38 = local4_life21;
        int __sourceSpill814_39 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill814_38)).substring(((int)(__sourceSpill814_39)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill814_43 = local6_life19;
        int __sourceSpill814_44 = local3_life20;
        local3_life20 += 1;
        long local8_life45 = (((((((((((long) (local7_life42)[0]) & 255L) << 56) | ((((long) (local7_life42)[1]) & 255L) << 48)) | ((((long) (local7_life42)[2]) & 255L) << 40)) | ((((long) (local7_life42)[3]) & 255L) << 32)) | ((((long) (local7_life42)[4]) & 255L) << 24)) | ((((long) (local7_life42)[5]) & 255L) << 16)) | ((((long) (local7_life42)[6]) & 255L) << 8)) | (((long) (local7_life42)[7]) & 255L));
        byte[] __sourceSpill814_46 = new byte[8];
        (__sourceSpill814_46)[0] = ((byte) ((int) (local8_life45 >>> 56)));
        (__sourceSpill814_46)[1] = ((byte) ((int) (local8_life45 >>> 48)));
        (__sourceSpill814_46)[2] = ((byte) ((int) (local8_life45 >>> 40)));
        (__sourceSpill814_46)[3] = ((byte) ((int) (local8_life45 >>> 32)));
        (__sourceSpill814_46)[4] = ((byte) ((int) (local8_life45 >>> 24)));
        (__sourceSpill814_46)[5] = ((byte) ((int) (local8_life45 >>> 16)));
        (__sourceSpill814_46)[6] = ((byte) ((int) (local8_life45 >>> 8)));
        (__sourceSpill814_46)[7] = ((byte) ((int) local8_life45));
        javax.crypto.Cipher __sourceSpill814_47 = local0_life9;
        byte[] local10_life49 = ((javax.crypto.Cipher)(__sourceSpill814_47)).doFinal(((byte[])(__sourceSpill814_46)));
        (__sourceSpill814_43)[__sourceSpill814_44] = (((((((((((long) (local10_life49)[0]) & 255L) << 56) | ((((long) (local10_life49)[1]) & 255L) << 48)) | ((((long) (local10_life49)[2]) & 255L) << 40)) | ((((long) (local10_life49)[3]) & 255L) << 32)) | ((((long) (local10_life49)[4]) & 255L) << 24)) | ((((long) (local10_life49)[5]) & 255L) << 16)) | ((((long) (local10_life49)[6]) & 255L) << 8)) | (((long) (local10_life49)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    i = ((long[])(local6_life19));
    j = ((java.lang.Integer[])(new java.lang.Integer[24]));
    moom.D5[] __sourceSpill814_54 = new moom.D5[4];
    (__sourceSpill814_54)[0] = new moom.D5(net.minecraft.init.Items.aL, 0, 1, 3, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite814_53(11972, (4847829324537596451L ^ local11_life6)));
    (__sourceSpill814_54)[1] = new moom.D5(net.minecraft.init.Items.aK, 0, 2, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite814_56(26272, (4977984932170580548L ^ local11_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite814_57(23679, (2068236444885710999L ^ local11_life6)));
    (__sourceSpill814_54)[2] = new moom.D5(net.minecraft.init.Items.bK, 0, 1, 1, 1);
    (__sourceSpill814_54)[3] = new moom.D5(net.minecraft.init.Items.aQ, 0, 1, 1, 1);
    f = ((java.util.List)(com.google.common.collect.Lists.newArrayList(((java.lang.Object[])(__sourceSpill814_54)))));
}

private static native <E extends Throwable> void __sourceConstructorInit_c8ccd5798d332cbf_0(moom.HL a0, int a1) throws E;

private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.HL.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x13ED;
        if (j[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = i[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])k.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    k.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/HL", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            HL.j[n2] = n3;
        }
        return j[n2];
}


protected void b(net.minecraft.nbt.NBTTagCompound p0) {
super.b(((net.minecraft.nbt.NBTTagCompound)(p0)));
    this.g = ((boolean)(((net.minecraft.nbt.NBTTagCompound)(p0)).b__Boolean(((java.lang.String)("Tall")))));
    return;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4752_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/HL"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public boolean a__Boolean(net.minecraft.world.World p0, java.util.Random p1, moom.G2 p2) {
int lexicalValue738_20_0;
    int lexicalValue738_91_0;
    int lexicalValue738_280_0;
    int lexicalValue738_339_0;
    int lexicalValue738_1200_0;
    int lexicalValue738_1256_0;
    boolean spill738_0;
    boolean spill738_1;
    int spill738_2;
    boolean spill738_3;
    long life4_3;
    net.minecraft.entity.Entity[] life6_5;
    int life7_25;
    int life8_99;
    int life9_105;
    int life10_107;
    int life10_371;
    int life10_790;
    int life11_930;
    int life12_936;
    lexical_join_1256: {
    lexical_join_1255: {
    lexical_join_1200: {
    lexical_join_1198: {
    lexical_join_1171: {
    lexical_join_413: {
    lexical_join_339: {
    lexical_join_338: {
    lexical_join_91: {
    lexical_join_32: {
    lexical_join_20: {
    lexical_join_15: {
    life4_3 = (moom.HL.h ^ 90521340622926L);
    life6_5 = moom.G4.b();
    spill738_0 = ((moom.HL)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)));
    if (!((life6_5 != null))) {
        lexicalValue738_20_0 = ((spill738_0) ? 1 : 0);
        break lexical_join_20;
    }
    if (!(spill738_0)) {
        break lexical_join_15;
    }
    return ((0) != 0);
    }
    lexicalValue738_20_0 = __sourceIntrinsic_5ac1d031d896_invokedynamic738_5(15185, (9195864742447926162L ^ life4_3));
    }
    life7_25 = lexicalValue738_20_0;
    spill738_1 = this.g;
    if (!((life6_5 != null))) {
        lexicalValue738_91_0 = ((spill738_1) ? 1 : 0);
        break lexical_join_91;
    }
    if (!((!spill738_1))) {
        break lexical_join_32;
    }
    life7_25 = __sourceIntrinsic_5ac1d031d896_invokedynamic738_8(7735, (6177976616787111669L ^ life4_3));
    }
    ((moom.HL)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(0)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_9(18970, (5112068359805024976L ^ life4_3)))), ((int)((life7_25 - 1))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_10(17590, (7009095725392311398L ^ life4_3)))), ((boolean)(true)), ((java.util.Random)(p1)), ((moom.H9)(net.minecraft.world.gen.structure.StructureStrongholdPieces.e)));
    ((moom.HL)(this)).a(((net.minecraft.world.World)(p0)), ((java.util.Random)(p1)), ((moom.G2)(p2)), ((moom.bJ)(this.e)), ((int)(4)), ((int)(1)), ((int)(0)));
    ((moom.HL)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((java.util.Random)(p1)), ((float)(0x1.1eb852p-4f)), ((int)(2)), ((int)(1)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_15(15185, (9195864742447926162L ^ life4_3)))), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_16(17473, (9008001198146761879L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.G)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.G)).a__fE())), ((boolean)(false)));
    lexicalValue738_91_0 = 1;
    }
    life8_99 = lexicalValue738_91_0;
    life9_105 = __sourceIntrinsic_5ac1d031d896_invokedynamic738_22(18695, (4066278973878581707L ^ life4_3));
    life10_107 = 1;
    lexical_cycle_100: while (true) {
    lexical_join_336: {
    lexical_join_335: {
    lexical_join_280: {
    lexical_join_238: {
    if (!((life10_107 <= __sourceIntrinsic_5ac1d031d896_invokedynamic738_23(17473, (9008001198146761879L ^ life4_3))))) {
        break lexical_join_338;
    }
    spill738_2 = ((life10_107 - 1) % 4);
    if (!((life6_5 != null))) {
        lexicalValue738_339_0 = spill738_2;
        break lexical_join_339;
    }
    if (!((life6_5 != null))) {
        lexicalValue738_280_0 = spill738_2;
        break lexical_join_280;
    }
    if (!((spill738_2 == 0))) {
        break lexical_join_238;
    }
    ((moom.HL)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(1)), ((int)(life10_107)), ((int)(1)), ((int)(4)), ((int)(life10_107)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((boolean)(false)));
    ((moom.HL)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_29(26853, (3970624554912684072L ^ life4_3)))), ((int)(1)), ((int)(life10_107)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_30(26853, (3970624554912684072L ^ life4_3)))), ((int)(4)), ((int)(life10_107)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((boolean)(false)));
    ((moom.HL)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aa)).a__fE())), ((int)(2)), ((int)(3)), ((int)(life10_107)), ((moom.G2)(p2)));
    ((moom.HL)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aa)).a__fE())), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_41(15185, (9195864742447926162L ^ life4_3)))), ((int)(3)), ((int)(life10_107)), ((moom.G2)(p2)));
    if (!((life6_5 != null))) {
        break lexical_join_336;
    }
    if (!(this.g)) {
        break lexical_join_335;
    }
    ((moom.HL)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_44(7735, (6177976616787111669L ^ life4_3)))), ((int)(life10_107)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_45(10672, (3274885142886832482L ^ life4_3)))), ((int)(life10_107)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((boolean)(false)));
    ((moom.HL)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_51(26853, (3970624554912684072L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_52(7735, (6177976616787111669L ^ life4_3)))), ((int)(life10_107)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_53(26853, (3970624554912684072L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_54(13084, (3363987672802706376L ^ life4_3)))), ((int)(life10_107)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((boolean)(false)));
    if (!((life6_5 == null))) {
        break lexical_join_335;
    }
    }
    ((moom.HL)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(1)), ((int)(life10_107)), ((int)(1)), ((int)(4)), ((int)(life10_107)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.X)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.X)).a__fE())), ((boolean)(false)));
    ((moom.HL)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_65(26853, (3970624554912684072L ^ life4_3)))), ((int)(1)), ((int)(life10_107)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_66(26853, (3970624554912684072L ^ life4_3)))), ((int)(4)), ((int)(life10_107)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.X)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.X)).a__fE())), ((boolean)(false)));
    if (!((life6_5 != null))) {
        break lexical_join_336;
    }
    lexicalValue738_280_0 = ((this.g) ? 1 : 0);
    }
    if (!((lexicalValue738_280_0 != 0))) {
        break lexical_join_335;
    }
    ((moom.HL)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_74(7735, (6177976616787111669L ^ life4_3)))), ((int)(life10_107)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_75(13084, (3363987672802706376L ^ life4_3)))), ((int)(life10_107)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.X)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.X)).a__fE())), ((boolean)(false)));
    ((moom.HL)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_81(26853, (3970624554912684072L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_82(7735, (6177976616787111669L ^ life4_3)))), ((int)(life10_107)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_83(26853, (3970624554912684072L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_84(13084, (3363987672802706376L ^ life4_3)))), ((int)(life10_107)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.X)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.X)).a__fE())), ((boolean)(false)));
    }
    life10_107 += 1;
    }
    if (!((life6_5 == null))) { continue lexical_cycle_100; }
    break lexical_cycle_100;
    }
    }
    lexicalValue738_339_0 = 3;
    }
    life10_371 = lexicalValue738_339_0;
    lexical_cycle_340: while (true) {
    if (!((life10_371 < __sourceIntrinsic_5ac1d031d896_invokedynamic738_90(26853, (3970624554912684072L ^ life4_3))))) {
        break lexical_join_413;
    }
    ((moom.HL)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(3)), ((int)(1)), ((int)(life10_371)), ((int)(4)), ((int)(3)), ((int)(life10_371)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.X)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.X)).a__fE())), ((boolean)(false)));
    ((moom.HL)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_96(7735, (6177976616787111669L ^ life4_3)))), ((int)(1)), ((int)(life10_371)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_97(10350, (1515165753690839207L ^ life4_3)))), ((int)(3)), ((int)(life10_371)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.X)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.X)).a__fE())), ((boolean)(false)));
    ((moom.HL)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_103(13084, (3363987672802706376L ^ life4_3)))), ((int)(1)), ((int)(life10_371)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_104(32655, (8042118814283894618L ^ life4_3)))), ((int)(3)), ((int)(life10_371)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.X)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.X)).a__fE())), ((boolean)(false)));
    life10_371 += 2;
    if (!((life6_5 != null))) {
        break lexical_join_1198;
    }
    if (!((life6_5 == null))) { continue lexical_cycle_340; }
    break lexical_cycle_340;
    }
    }
    spill738_3 = this.g;
    if (!((life6_5 != null))) {
        lexicalValue738_1200_0 = ((spill738_3) ? 1 : 0);
        break lexical_join_1200;
    }
    if (!(spill738_3)) {
        break lexical_join_1171;
    }
    ((moom.HL)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(5)), ((int)(1)), ((int)(3)), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_112(17473, (9008001198146761879L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((boolean)(false)));
    ((moom.HL)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_118(5256, (826634415699518541L ^ life4_3)))), ((int)(5)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_119(26853, (3970624554912684072L ^ life4_3)))), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_120(17473, (9008001198146761879L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((boolean)(false)));
    ((moom.HL)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(4)), ((int)(5)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_126(13084, (3363987672802706376L ^ life4_3)))), ((int)(5)), ((int)(2)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((boolean)(false)));
    ((moom.HL)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(4)), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_132(26853, (3970624554912684072L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_133(13084, (3363987672802706376L ^ life4_3)))), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_134(17473, (9008001198146761879L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((boolean)(false)));
    ((moom.HL)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_142(13084, (3363987672802706376L ^ life4_3)))), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_143(15185, (9195864742447926162L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.HL)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_147(9903, (1730040559610123896L ^ life4_3)))), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_148(15185, (9195864742447926162L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.HL)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_152(13084, (3363987672802706376L ^ life4_3)))), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_153(5256, (826634415699518541L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.HL)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_155(7735, (6177976616787111669L ^ life4_3)))), ((int)(2)), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_156(7735, (6177976616787111669L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_157(26853, (3970624554912684072L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aO)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aO)).a__fE())), ((boolean)(false)));
    ((moom.HL)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_163(5256, (826634415699518541L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_164(7735, (6177976616787111669L ^ life4_3)))), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_165(5256, (826634415699518541L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_166(7735, (6177976616787111669L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_167(5256, (826634415699518541L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aO)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aO)).a__fE())), ((boolean)(false)));
    ((moom.HL)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_173(7735, (6177976616787111669L ^ life4_3)))), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_174(13084, (3363987672802706376L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_175(7735, (6177976616787111669L ^ life4_3)))), ((int)(2)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aO)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aO)).a__fE())), ((boolean)(false)));
    ((moom.HL)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_181(7735, (6177976616787111669L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_182(26853, (3970624554912684072L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_183(24970, (8014145835295248716L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_184(7735, (6177976616787111669L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_185(26853, (3970624554912684072L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aO)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aO)).a__fE())), ((boolean)(false)));
    ((moom.HL)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aO)).a__fE())), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_193(13084, (3363987672802706376L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_194(7735, (6177976616787111669L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_195(15185, (9195864742447926162L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.HL)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aO)).a__fE())), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_199(24970, (8014145835295248716L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_200(7735, (6177976616787111669L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_201(15185, (9195864742447926162L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.HL)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aO)).a__fE())), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_205(13084, (3363987672802706376L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_206(7735, (6177976616787111669L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_207(5256, (826634415699518541L ^ life4_3)))), ((moom.G2)(p2)));
    life10_790 = ((moom.HL)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.au)), ((int)(3)));
    ((moom.HL)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.au)).b__fE(((int)(life10_790))))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_213(5256, (826634415699518541L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_214(17473, (9008001198146761879L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.HL)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.au)).b__fE(((int)(life10_790))))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_218(5256, (826634415699518541L ^ life4_3)))), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_219(17473, (9008001198146761879L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.HL)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.au)).b__fE(((int)(life10_790))))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_223(5256, (826634415699518541L ^ life4_3)))), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_224(17473, (9008001198146761879L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.HL)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.au)).b__fE(((int)(life10_790))))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_228(5256, (826634415699518541L ^ life4_3)))), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_229(17473, (9008001198146761879L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.HL)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.au)).b__fE(((int)(life10_790))))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_233(5256, (826634415699518541L ^ life4_3)))), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_234(17473, (9008001198146761879L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.HL)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.au)).b__fE(((int)(life10_790))))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_238(5256, (826634415699518541L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_239(7735, (6177976616787111669L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_240(17473, (9008001198146761879L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.HL)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.au)).b__fE(((int)(life10_790))))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_244(5256, (826634415699518541L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_245(10350, (1515165753690839207L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_246(17473, (9008001198146761879L ^ life4_3)))), ((moom.G2)(p2)));
    life11_930 = __sourceIntrinsic_5ac1d031d896_invokedynamic738_248(10350, (1515165753690839207L ^ life4_3));
    life12_936 = __sourceIntrinsic_5ac1d031d896_invokedynamic738_249(10350, (1515165753690839207L ^ life4_3));
    ((moom.HL)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aO)).a__fE())), ((int)((life11_930 - 1))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_252(13084, (3363987672802706376L ^ life4_3)))), ((int)(life12_936)), ((moom.G2)(p2)));
    ((moom.HL)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aO)).a__fE())), ((int)(life11_930)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_256(13084, (3363987672802706376L ^ life4_3)))), ((int)(life12_936)), ((moom.G2)(p2)));
    ((moom.HL)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aO)).a__fE())), ((int)((life11_930 - 1))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_260(24970, (8014145835295248716L ^ life4_3)))), ((int)(life12_936)), ((moom.G2)(p2)));
    ((moom.HL)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aO)).a__fE())), ((int)(life11_930)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_264(24970, (8014145835295248716L ^ life4_3)))), ((int)(life12_936)), ((moom.G2)(p2)));
    ((moom.HL)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aO)).a__fE())), ((int)((life11_930 - 1))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_268(10350, (1515165753690839207L ^ life4_3)))), ((int)(life12_936)), ((moom.G2)(p2)));
    ((moom.HL)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aO)).a__fE())), ((int)(life11_930)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_272(10350, (1515165753690839207L ^ life4_3)))), ((int)(life12_936)), ((moom.G2)(p2)));
    ((moom.HL)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aO)).a__fE())), ((int)((life11_930 - 2))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_276(10350, (1515165753690839207L ^ life4_3)))), ((int)(life12_936)), ((moom.G2)(p2)));
    ((moom.HL)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aO)).a__fE())), ((int)((life11_930 + 1))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_280(10350, (1515165753690839207L ^ life4_3)))), ((int)(life12_936)), ((moom.G2)(p2)));
    ((moom.HL)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aO)).a__fE())), ((int)((life11_930 - 1))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_284(10350, (1515165753690839207L ^ life4_3)))), ((int)((life12_936 - 1))), ((moom.G2)(p2)));
    ((moom.HL)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aO)).a__fE())), ((int)((life11_930 - 1))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_288(10350, (1515165753690839207L ^ life4_3)))), ((int)((life12_936 + 1))), ((moom.G2)(p2)));
    ((moom.HL)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aO)).a__fE())), ((int)(life11_930)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_292(10350, (1515165753690839207L ^ life4_3)))), ((int)((life12_936 - 1))), ((moom.G2)(p2)));
    ((moom.HL)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aO)).a__fE())), ((int)(life11_930)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_296(10350, (1515165753690839207L ^ life4_3)))), ((int)((life12_936 + 1))), ((moom.G2)(p2)));
    ((moom.HL)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aa)).a__fE())), ((int)((life11_930 - 2))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_300(24970, (8014145835295248716L ^ life4_3)))), ((int)(life12_936)), ((moom.G2)(p2)));
    ((moom.HL)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aa)).a__fE())), ((int)((life11_930 + 1))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_304(24970, (8014145835295248716L ^ life4_3)))), ((int)(life12_936)), ((moom.G2)(p2)));
    ((moom.HL)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aa)).a__fE())), ((int)((life11_930 - 1))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_308(24970, (8014145835295248716L ^ life4_3)))), ((int)((life12_936 - 1))), ((moom.G2)(p2)));
    ((moom.HL)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aa)).a__fE())), ((int)((life11_930 - 1))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_312(24970, (8014145835295248716L ^ life4_3)))), ((int)((life12_936 + 1))), ((moom.G2)(p2)));
    ((moom.HL)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aa)).a__fE())), ((int)(life11_930)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_316(24970, (8014145835295248716L ^ life4_3)))), ((int)((life12_936 - 1))), ((moom.G2)(p2)));
    ((moom.HL)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aa)).a__fE())), ((int)(life11_930)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_320(24970, (8014145835295248716L ^ life4_3)))), ((int)((life12_936 + 1))), ((moom.G2)(p2)));
    }
    ((moom.HL)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((java.util.Random)(p1)), ((int)(3)), ((int)(3)), ((int)(5)), ((java.util.List)(moom.D5.a(((java.util.List)(moom.HL.f)), ((moom.D5[])(new moom.D5[] {((moom.xg)(net.minecraft.init.Items.bS)).a(((java.util.Random)(p1)), ((int)(1)), ((int)(5)), ((int)(2)))}))))), ((int)((1 + ((java.util.Random)(p1)).nextInt(((int)(4)))))));
    }
    lexicalValue738_1200_0 = ((this.g) ? 1 : 0);
    }
    if (!((life6_5 != null))) {
        lexicalValue738_1256_0 = lexicalValue738_1200_0;
        break lexical_join_1256;
    }
    if (!((lexicalValue738_1200_0 != 0))) {
        break lexical_join_1255;
    }
    ((moom.HL)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_332(26853, (3970624554912684072L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_333(13084, (3363987672802706376L ^ life4_3)))), ((int)(1)), ((moom.G2)(p2)));
    ((moom.HL)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((java.util.Random)(p1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_335(26853, (3970624554912684072L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic738_336(24970, (8014145835295248716L ^ life4_3)))), ((int)(1)), ((java.util.List)(moom.D5.a(((java.util.List)(moom.HL.f)), ((moom.D5[])(new moom.D5[] {((moom.xg)(net.minecraft.init.Items.bS)).a(((java.util.Random)(p1)), ((int)(1)), ((int)(5)), ((int)(2)))}))))), ((int)((1 + ((java.util.Random)(p1)).nextInt(((int)(4)))))));
    }
    lexicalValue738_1256_0 = 1;
    }
    return ((lexicalValue738_1256_0) != 0);
}


protected void a(net.minecraft.nbt.NBTTagCompound p0) {
super.a(((net.minecraft.nbt.NBTTagCompound)(p0)));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("Tall")), ((boolean)__sourceIntrinsic_integerToBoolean((((this.g) ? 1 : 0)))));
    return;
}


public static moom.HL a(java.util.List<moom.G4> p0, java.util.Random p1, int p2, int p3, int p4, moom.bs p5, int p6) {
int forwardValue2074_73_0;
    net.minecraft.entity.Entity[] spill2074_0;
    boolean spill2074_1;
    long life7_3;
    moom.G2 life10_32;
    net.minecraft.entity.Entity[] life9_33;
    forward_join_80: {
    forward_join_78: {
    forward_join_73: {
    forward_join_43: {
    life7_3 = (moom.HL.h ^ 74282847979029L);
    spill2074_0 = moom.G4.b();
    life10_32 = moom.G2.a(((int)(p2)), ((int)(p3)), ((int)(p4)), ((int)(__sourceIntrinsic_90cab9ede557_invokedynamic2074_2(29789, (2756467635951434440L ^ life7_3)))), ((int)(-1)), ((int)(0)), ((int)(__sourceIntrinsic_90cab9ede557_invokedynamic2074_3(23618, (6418980169821213398L ^ life7_3)))), ((int)(__sourceIntrinsic_90cab9ede557_invokedynamic2074_4(27004, (8571499530996967412L ^ life7_3)))), ((int)(__sourceIntrinsic_90cab9ede557_invokedynamic2074_5(26775, (6580304358888924684L ^ life7_3)))), ((moom.bs)(p5)));
    life9_33 = spill2074_0;
    spill2074_1 = moom.HL.a(((moom.G2)(life10_32)));
    if (!((life9_33 != null))) {
        forwardValue2074_73_0 = ((spill2074_1) ? 1 : 0);
        break forward_join_73;
    }
    if (!(spill2074_1)) {
        break forward_join_43;
    }
    if (!((moom.G4.a(((java.util.List)(p0)), ((moom.G2)(life10_32))) != null))) {
        break forward_join_80;
    }
    }
    life10_32 = moom.G2.a(((int)(p2)), ((int)(p3)), ((int)(p4)), ((int)(__sourceIntrinsic_90cab9ede557_invokedynamic2074_10(11819, (5016698081126752440L ^ life7_3)))), ((int)(-1)), ((int)(0)), ((int)(__sourceIntrinsic_90cab9ede557_invokedynamic2074_11(17590, (7009112532361792061L ^ life7_3)))), ((int)(__sourceIntrinsic_90cab9ede557_invokedynamic2074_12(3843, (3791807449260163465L ^ life7_3)))), ((int)(__sourceIntrinsic_90cab9ede557_invokedynamic2074_13(13629, (3019179377270143911L ^ life7_3)))), ((moom.bs)(p5)));
    forwardValue2074_73_0 = ((moom.HL.a(((moom.G2)(life10_32)))) ? 1 : 0);
    }
    if (!((forwardValue2074_73_0 != 0))) {
        break forward_join_78;
    }
    if (!((moom.G4.a(((java.util.List)(p0)), ((moom.G2)(life10_32))) != null))) {
        break forward_join_80;
    }
    }
    return null;
    }
    return new moom.HL(p6, p1, life10_32, p5);
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite814_53(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite814_56(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite814_57(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c8ccd5798d332cbf_originalDynamicSite503_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_90cab9ede557_invokedynamic2074_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_90cab9ede557_invokedynamic2074_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_90cab9ede557_invokedynamic2074_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_90cab9ede557_invokedynamic2074_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_90cab9ede557_invokedynamic2074_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_90cab9ede557_invokedynamic2074_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_90cab9ede557_invokedynamic2074_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_90cab9ede557_invokedynamic2074_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_29(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_41(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_44(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_45(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_51(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_52(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_53(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_54(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_65(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_66(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_74(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_75(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_81(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_82(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_83(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_84(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_90(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_96(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_97(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_103(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_104(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_112(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_118(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_119(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_120(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_126(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_132(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_133(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_134(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_142(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_143(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_147(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_148(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_152(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_153(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_155(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_156(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_157(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_163(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_164(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_165(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_166(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_167(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_173(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_174(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_175(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_181(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_182(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_183(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_184(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_185(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_193(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_194(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_195(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_199(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_200(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_201(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_205(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_206(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_207(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_213(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_214(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_218(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_219(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_223(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_224(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_228(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_229(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_233(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_234(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_238(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_239(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_240(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_244(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_245(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_246(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_248(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_249(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_252(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_256(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_260(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_264(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_268(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_272(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_276(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_280(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_284(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_288(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_292(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_296(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_300(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_304(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_308(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_312(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_316(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_320(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_332(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_333(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_335(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic738_336(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4752_0() throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
