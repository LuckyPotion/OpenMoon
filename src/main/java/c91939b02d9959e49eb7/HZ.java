package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class HZ extends moom.HT {

private static final java.util.List<moom.D5> h;

private boolean i;

private static final long j;

private static final long[] k;

private static final java.lang.Integer[] l;

private static final java.util.Map m;

public HZ() {
super();
}


public HZ(moom.H6 p0, int p1, java.util.Random p2, moom.G2 p3, moom.bs p4) {
super(p0, p1);
    this.b = p4;
    this.a = p3;
}


static {
j = ((long)(((moom._a)(moom._c.a(((long)(4888325695368546357L)), ((long)(-3957978159754346412L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(235710779154207L)))));
    long local11_life6 = (moom.HZ.j ^ 95398110465159L);
    m = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life9;
    javax.crypto.Cipher __sourceSpill827_11 = (local0_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill827_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill827_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill827_14 = new byte[8];
    (__sourceSpill827_14)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local1_life15 = 1;
    while ((local1_life15 < 8)) {
        (__sourceSpill827_14)[local1_life15] = ((byte) ((int) ((local11_life6 << (local1_life15 * 8)) >>> 56)));
        local1_life15 += 1;
    }
    byte[] __sourcePreallocation827_16 = __sourceSpill827_14;
    ((javax.crypto.Cipher)(__sourceSpill827_11)).init(((int)(__sourceSpill827_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill827_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation827_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life19 = new long[18];
    int local3_life20 = 0;
    java.lang.String local4_life21;
    int local5_life23 = ((java.lang.String)((local4_life21 = "s/\034\b2óÙaO*µ,VµÎH®:«ÛíÜ[ÆÀ¼`ÏêÞ¿40ÕusTc\013Úâv\\±Y¬çÅ}u°º\036áÀ-\032\016ZÝËµü9íß?Ì¹Wñ'Öó[ªáÑfz¢²ò«í\t@ü2k}ªË$xÖ\002/Õ\004ù\001Bõoµ"))).length();
    int local2_life24 = 0;
    do {
        java.lang.String __sourceSpill827_25 = local4_life21;
        int __sourceSpill827_26 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill827_25)).substring(((int)(__sourceSpill827_26)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill827_30 = local6_life19;
        int __sourceSpill827_31 = local3_life20;
        local3_life20 += 1;
        long local8_life32 = (((((((((((long) (local7_life29)[0]) & 255L) << 56) | ((((long) (local7_life29)[1]) & 255L) << 48)) | ((((long) (local7_life29)[2]) & 255L) << 40)) | ((((long) (local7_life29)[3]) & 255L) << 32)) | ((((long) (local7_life29)[4]) & 255L) << 24)) | ((((long) (local7_life29)[5]) & 255L) << 16)) | ((((long) (local7_life29)[6]) & 255L) << 8)) | (((long) (local7_life29)[7]) & 255L));
        byte[] __sourceSpill827_33 = new byte[8];
        (__sourceSpill827_33)[0] = ((byte) ((int) (local8_life32 >>> 56)));
        (__sourceSpill827_33)[1] = ((byte) ((int) (local8_life32 >>> 48)));
        (__sourceSpill827_33)[2] = ((byte) ((int) (local8_life32 >>> 40)));
        (__sourceSpill827_33)[3] = ((byte) ((int) (local8_life32 >>> 32)));
        (__sourceSpill827_33)[4] = ((byte) ((int) (local8_life32 >>> 24)));
        (__sourceSpill827_33)[5] = ((byte) ((int) (local8_life32 >>> 16)));
        (__sourceSpill827_33)[6] = ((byte) ((int) (local8_life32 >>> 8)));
        (__sourceSpill827_33)[7] = ((byte) ((int) local8_life32));
        javax.crypto.Cipher __sourceSpill827_34 = local0_life9;
        byte[] local10_life36 = ((javax.crypto.Cipher)(__sourceSpill827_34)).doFinal(((byte[])(__sourceSpill827_33)));
        (__sourceSpill827_30)[__sourceSpill827_31] = (((((((((((long) (local10_life36)[0]) & 255L) << 56) | ((((long) (local10_life36)[1]) & 255L) << 48)) | ((((long) (local10_life36)[2]) & 255L) << 40)) | ((((long) (local10_life36)[3]) & 255L) << 32)) | ((((long) (local10_life36)[4]) & 255L) << 24)) | ((((long) (local10_life36)[5]) & 255L) << 16)) | ((((long) (local10_life36)[6]) & 255L) << 8)) | (((long) (local10_life36)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    local5_life23 = ((java.lang.String)((local4_life21 = "eM\000\t¼±Ç\n)¿\007³N,\031"))).length();
    local2_life24 = 0;
    do {
        java.lang.String __sourceSpill827_38 = local4_life21;
        int __sourceSpill827_39 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill827_38)).substring(((int)(__sourceSpill827_39)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill827_43 = local6_life19;
        int __sourceSpill827_44 = local3_life20;
        local3_life20 += 1;
        long local8_life45 = (((((((((((long) (local7_life42)[0]) & 255L) << 56) | ((((long) (local7_life42)[1]) & 255L) << 48)) | ((((long) (local7_life42)[2]) & 255L) << 40)) | ((((long) (local7_life42)[3]) & 255L) << 32)) | ((((long) (local7_life42)[4]) & 255L) << 24)) | ((((long) (local7_life42)[5]) & 255L) << 16)) | ((((long) (local7_life42)[6]) & 255L) << 8)) | (((long) (local7_life42)[7]) & 255L));
        byte[] __sourceSpill827_46 = new byte[8];
        (__sourceSpill827_46)[0] = ((byte) ((int) (local8_life45 >>> 56)));
        (__sourceSpill827_46)[1] = ((byte) ((int) (local8_life45 >>> 48)));
        (__sourceSpill827_46)[2] = ((byte) ((int) (local8_life45 >>> 40)));
        (__sourceSpill827_46)[3] = ((byte) ((int) (local8_life45 >>> 32)));
        (__sourceSpill827_46)[4] = ((byte) ((int) (local8_life45 >>> 24)));
        (__sourceSpill827_46)[5] = ((byte) ((int) (local8_life45 >>> 16)));
        (__sourceSpill827_46)[6] = ((byte) ((int) (local8_life45 >>> 8)));
        (__sourceSpill827_46)[7] = ((byte) ((int) local8_life45));
        javax.crypto.Cipher __sourceSpill827_47 = local0_life9;
        byte[] local10_life49 = ((javax.crypto.Cipher)(__sourceSpill827_47)).doFinal(((byte[])(__sourceSpill827_46)));
        (__sourceSpill827_43)[__sourceSpill827_44] = (((((((((((long) (local10_life49)[0]) & 255L) << 56) | ((((long) (local10_life49)[1]) & 255L) << 48)) | ((((long) (local10_life49)[2]) & 255L) << 40)) | ((((long) (local10_life49)[3]) & 255L) << 32)) | ((((long) (local10_life49)[4]) & 255L) << 24)) | ((((long) (local10_life49)[5]) & 255L) << 16)) | ((((long) (local10_life49)[6]) & 255L) << 8)) | (((long) (local10_life49)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    k = ((long[])(local6_life19));
    l = ((java.lang.Integer[])(new java.lang.Integer[18]));
    moom.D5[] __sourceSpill827_54 = new moom.D5[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite827_52(10544, (4196336520779865935L ^ local11_life6))];
    (__sourceSpill827_54)[0] = new moom.D5(net.minecraft.init.Items.i, 0, 1, 3, 3);
    (__sourceSpill827_54)[1] = new moom.D5(net.minecraft.init.Items.j, 0, 1, 5, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite827_56(8724, (4797647220920357993L ^ local11_life6)));
    (__sourceSpill827_54)[2] = new moom.D5(net.minecraft.init.Items.k, 0, 1, 3, 5);
    (__sourceSpill827_54)[3] = new moom.D5(net.minecraft.init.Items.P, 0, 1, 3, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite827_59(2328, (2290267675954364257L ^ local11_life6)));
    (__sourceSpill827_54)[4] = new moom.D5(net.minecraft.init.Items.e, 0, 1, 3, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite827_61(30970, (6187728631443607178L ^ local11_life6)));
    (__sourceSpill827_54)[5] = new moom.D5(net.minecraft.init.Items.b, 0, 1, 1, 5);
    (__sourceSpill827_54)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite827_63(24157, (395172835465750576L ^ local11_life6))] = new moom.D5(net.minecraft.init.Items.l, 0, 1, 1, 5);
    (__sourceSpill827_54)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite827_65(31675, (3225738015342316995L ^ local11_life6))] = new moom.D5(net.minecraft.init.Items.Z, 0, 1, 1, 5);
    (__sourceSpill827_54)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite827_67(14903, (645114667360816203L ^ local11_life6))] = new moom.D5(net.minecraft.init.Items.Y, 0, 1, 1, 5);
    (__sourceSpill827_54)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite827_69(21100, (5493083531921941529L ^ local11_life6))] = new moom.D5(net.minecraft.init.Items.aa, 0, 1, 1, 5);
    (__sourceSpill827_54)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite827_71(8724, (4797647220920357993L ^ local11_life6))] = new moom.D5(net.minecraft.init.Items.ab, 0, 1, 1, 5);
    (__sourceSpill827_54)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite827_73(19251, (6157664891067006303L ^ local11_life6))] = new moom.D5(net.minecraft.item.Item.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.Z))), 0, 3, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite827_76(31675, (3225738015342316995L ^ local11_life6)), 5);
    (__sourceSpill827_54)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite827_77(24639, (3505567618070599241L ^ local11_life6))] = new moom.D5(net.minecraft.item.Item.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.g))), 0, 3, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite827_80(31675, (3225738015342316995L ^ local11_life6)), 5);
    (__sourceSpill827_54)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite827_81(17964, (1757587731390296150L ^ local11_life6))] = new moom.D5(net.minecraft.init.Items.aA, 0, 1, 1, 3);
    (__sourceSpill827_54)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite827_83(429, (978557770976049116L ^ local11_life6))] = new moom.D5(net.minecraft.init.Items.bZ, 0, 1, 1, 1);
    (__sourceSpill827_54)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite827_85(30970, (6187728631443607178L ^ local11_life6))] = new moom.D5(net.minecraft.init.Items.b0, 0, 1, 1, 1);
    (__sourceSpill827_54)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite827_87(21143, (841656869866890464L ^ local11_life6))] = new moom.D5(net.minecraft.init.Items.b1, 0, 1, 1, 1);
    h = ((java.util.List)(com.google.common.collect.Lists.newArrayList(((java.lang.Object[])(__sourceSpill827_54)))));
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4802_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/HZ"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x3440;
        if (HZ.l[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = k[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])m.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    m.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/HZ", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            HZ.l[n2] = n3;
        }
        return HZ.l[n2];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_ba666c50db9739(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


protected void b(net.minecraft.nbt.NBTTagCompound p0) {
super.b(((net.minecraft.nbt.NBTTagCompound)(p0)));
    this.i = ((boolean)(((net.minecraft.nbt.NBTTagCompound)(p0)).b__Boolean(((java.lang.String)("Chest")))));
    return;
}


protected int c(int p0, int p1) {
return 3;
}


public static moom.HZ a(moom.H6 p0, java.util.List<moom.G4> p1, java.util.Random p2, int p3, int p4, int p5, moom.bs p6, int p7) {
moom.HZ forwardValue2109_45_0;
    long life8_3;
    moom.G2 life10_27;
    forward_join_45: {
    forward_join_44: {
    life8_3 = (moom.HZ.j ^ 119071648357332L);
    life10_27 = moom.G2.a(((int)(p3)), ((int)(p4)), ((int)(p5)), ((int)(0)), ((int)(0)), ((int)(0)), ((int)(__sourceIntrinsic_5cd42c488dc2_invokedynamic2109_1(28446, (703124098908507699L ^ life8_3)))), ((int)(__sourceIntrinsic_5cd42c488dc2_invokedynamic2109_2(20723, (4087617598290719186L ^ life8_3)))), ((int)(__sourceIntrinsic_5cd42c488dc2_invokedynamic2109_3(24066, (6130414637838958378L ^ life8_3)))), ((moom.bs)(p6)));
    if (!(__sourceExactCall_0448559b349003(((moom.G2)(life10_27))))) {
        break forward_join_44;
    }
    if (!((__sourceExactCall_21e7c855759262(((java.util.List)(p1)), ((moom.G2)(life10_27))) == null))) {
        break forward_join_44;
    }
    forwardValue2109_45_0 = new moom.HZ(p0, p7, p2, life10_27, p6);
    break forward_join_45;
    }
    forwardValue2109_45_0 = null;
    }
    return forwardValue2109_45_0;
}


public boolean a__Boolean(net.minecraft.world.World p0, java.util.Random p1, moom.G2 p2) {
moom.HZ lexicalValue749_25_0;
    int lexicalValue749_590_0;
    int lexicalValue749_639_0;
    moom.fn lexicalValue749_674_0;
    moom.fn lexicalValue749_674_1;
    moom.HZ lexicalValue749_677_0;
    net.minecraft.world.World lexicalValue749_677_1;
    moom.HZ lexicalValue749_741_0;
    net.minecraft.world.World lexicalValue749_741_1;
    int lexicalValue749_752_0;
    int spill749_0;
    moom.HZ spill749_1;
    boolean spill749_2;
    moom.HZ spill749_3;
    net.minecraft.world.World spill749_4;
    moom.fn spill749_5;
    moom.fn spill749_6;
    moom.HZ spill749_7;
    net.minecraft.world.World spill749_8;
    int spill749_9;
    long life4_3;
    net.minecraft.entity.Entity[] life6_5;
    int life7_662;
    int life7_730;
    int life8_741;
    lexical_join_752: {
    lexical_join_741: {
    lexical_join_739: {
    lexical_join_691: {
    lexical_join_639: {
    lexical_join_634: {
    lexical_join_590: {
    lexical_join_43: {
    lexical_join_25: {
    lexical_join_24: {
    life4_3 = (moom.HZ.j ^ 30812654792080L);
    life6_5 = moom.G4.b();
    spill749_0 = ((moom.HZ)(this)).e;
    if (!((life6_5 != null))) {
        lexicalValue749_590_0 = spill749_0;
        break lexical_join_590;
    }
    if (!((spill749_0 < 0))) {
        break lexical_join_43;
    }
    ((moom.HZ)(this)).e = ((int)(((moom.HZ)(this)).a__sourceReturn_6a83d276d7(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)))));
    spill749_1 = this;
    if (!((life6_5 != null))) {
        lexicalValue749_25_0 = spill749_1;
        break lexical_join_25;
    }
    if (!((((moom.HZ)(spill749_1)).e < 0))) {
        break lexical_join_24;
    }
    return ((1) != 0);
    }
    lexicalValue749_25_0 = this;
    }
    ((moom.G2)(((moom.HZ)(lexicalValue749_25_0)).a)).a(((int)(0)), ((int)((((((moom.HZ)(this)).e - ((moom.G2)(((moom.HZ)(this)).a)).e) + __sourceIntrinsic_5ac1d031d896_invokedynamic749_11(24157, (395091207316474151L ^ life4_3))) - 1))), ((int)(0)));
    }
    ((moom.HZ)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(1)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic749_13(25444, (289146546512507911L ^ life4_3)))), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic749_14(24157, (395091207316474151L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a))))), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a))))), ((boolean)(false)));
    ((moom.HZ)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(0)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic749_20(21100, (5493002432087196942L ^ life4_3)))), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic749_21(24157, (395091207316474151L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e))))), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e))))), ((boolean)(false)));
    ((moom.HZ)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(4)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic749_27(21100, (5493002432087196942L ^ life4_3)))), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic749_28(24157, (395091207316474151L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e))))), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e))))), ((boolean)(false)));
    ((moom.HZ)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(5)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic749_34(21100, (5493002432087196942L ^ life4_3)))), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic749_35(24157, (395091207316474151L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_c42b6878473bc7(((moom.ei)(net.minecraft.init.Blocks.U))))), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_c42b6878473bc7(((moom.ei)(net.minecraft.init.Blocks.U))))), ((boolean)(false)));
    ((moom.HZ)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(5)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic749_41(20303, (5037842158490785835L ^ life4_3)))), ((int)(5)), ((int)(5)), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a))))), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a))))), ((boolean)(false)));
    ((moom.HZ)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(1)), ((int)(0)), ((int)(2)), ((int)(3)), ((int)(0)), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f))))), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f))))), ((boolean)(false)));
    ((moom.HZ)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(1)), ((int)(0)), ((int)(0)), ((int)(4)), ((int)(0)), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.r))))), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.r))))), ((boolean)(false)));
    ((moom.HZ)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(3)), ((int)(1)), ((int)(0)), ((int)(3)), ((int)(4)), ((int)(0)), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.r))))), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.r))))), ((boolean)(false)));
    ((moom.HZ)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic749_62(24157, (395091207316474151L ^ life4_3)))), ((int)(0)), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic749_63(24157, (395091207316474151L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.r))))), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.r))))), ((boolean)(false)));
    ((moom.HZ)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f))))), ((int)(3)), ((int)(3)), ((int)(1)), ((moom.G2)(p2)));
    ((moom.HZ)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(3)), ((int)(1)), ((int)(2)), ((int)(3)), ((int)(3)), ((int)(2)), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f))))), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f))))), ((boolean)(false)));
    ((moom.HZ)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(4)), ((int)(1)), ((int)(3)), ((int)(5)), ((int)(3)), ((int)(3)), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f))))), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f))))), ((boolean)(false)));
    ((moom.HZ)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(1)), ((int)(1)), ((int)(0)), ((int)(3)), ((int)(5)), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f))))), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f))))), ((boolean)(false)));
    ((moom.HZ)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic749_87(24157, (395091207316474151L ^ life4_3)))), ((int)(5)), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic749_88(24157, (395091207316474151L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f))))), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f))))), ((boolean)(false)));
    ((moom.HZ)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(5)), ((int)(1)), ((int)(0)), ((int)(5)), ((int)(3)), ((int)(0)), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aO))))), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aO))))), ((boolean)(false)));
    ((moom.HZ)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic749_99(21100, (5493002432087196942L ^ life4_3)))), ((int)(1)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic749_100(21100, (5493002432087196942L ^ life4_3)))), ((int)(3)), ((int)(0)), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aO))))), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aO))))), ((boolean)(false)));
    ((moom.HZ)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic749_106(24157, (395091207316474151L ^ life4_3)))), ((int)(1)), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic749_107(21100, (5493002432087196942L ^ life4_3)))), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic749_108(24157, (395091207316474151L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e))))), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e))))), ((boolean)(false)));
    ((moom.HZ)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_4011ce2a926de7(((moom.dM)(net.minecraft.init.Blocks.k))))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic749_116(31675, (3225797137830292692L ^ life4_3)))), ((int)(1)), ((int)(5)), ((moom.G2)(p2)));
    ((moom.HZ)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_4011ce2a926de7(((moom.dM)(net.minecraft.init.Blocks.k))))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic749_120(14903, (645037956104777052L ^ life4_3)))), ((int)(1)), ((int)(5)), ((moom.G2)(p2)));
    ((moom.HZ)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a8))))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic749_124(21100, (5493002432087196942L ^ life4_3)))), ((int)(2)), ((int)(5)), ((moom.G2)(p2)));
    ((moom.HZ)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a8))))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic749_128(21100, (5493002432087196942L ^ life4_3)))), ((int)(2)), ((int)(4)), ((moom.G2)(p2)));
    ((moom.HZ)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic749_130(31675, (3225797137830292692L ^ life4_3)))), ((int)(2)), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic749_131(14903, (645037956104777052L ^ life4_3)))), ((int)(2)), ((int)(5)), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a))))), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a))))), ((boolean)(false)));
    ((moom.HZ)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e))))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic749_139(24157, (395091207316474151L ^ life4_3)))), ((int)(1)), ((int)(3)), ((moom.G2)(p2)));
    ((moom.HZ)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.al))))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic749_143(24157, (395091207316474151L ^ life4_3)))), ((int)(2)), ((int)(3)), ((moom.G2)(p2)));
    ((moom.HZ)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.al))))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic749_147(24157, (395091207316474151L ^ life4_3)))), ((int)(3)), ((int)(3)), ((moom.G2)(p2)));
    ((moom.HZ)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_c42b6878473bc7(((moom.ei)(net.minecraft.init.Blocks.T))))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic749_151(14903, (645037956104777052L ^ life4_3)))), ((int)(1)), ((int)(1)), ((moom.G2)(p2)));
    ((moom.HZ)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a9))))), ((int)(0)), ((int)(2)), ((int)(2)), ((moom.G2)(p2)));
    ((moom.HZ)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a9))))), ((int)(0)), ((int)(2)), ((int)(4)), ((moom.G2)(p2)));
    ((moom.HZ)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a9))))), ((int)(2)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic749_161(24157, (395091207316474151L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.HZ)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a9))))), ((int)(4)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic749_165(24157, (395091207316474151L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.HZ)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aO))))), ((int)(2)), ((int)(1)), ((int)(4)), ((moom.G2)(p2)));
    ((moom.HZ)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aB))))), ((int)(2)), ((int)(2)), ((int)(4)), ((moom.G2)(p2)));
    ((moom.HZ)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f))))), ((int)(1)), ((int)(1)), ((int)(5)), ((moom.G2)(p2)));
    ((moom.HZ)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ad)).b__fE(((int)(((moom.HZ)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ad)), ((int)(3)))))))), ((int)(2)), ((int)(1)), ((int)(5)), ((moom.G2)(p2)));
    ((moom.HZ)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ad)).b__fE(((int)(((moom.HZ)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ad)), ((int)(1)))))))), ((int)(1)), ((int)(1)), ((int)(4)), ((moom.G2)(p2)));
    lexicalValue749_590_0 = ((this.i) ? 1 : 0);
    }
    if (!((life6_5 != null))) {
        lexicalValue749_639_0 = lexicalValue749_590_0;
        break lexical_join_639;
    }
    if (!((lexicalValue749_590_0 == 0))) {
        break lexical_join_634;
    }
    spill749_2 = ((moom.G2)(p2)).a(((moom.DS)(new moom.DT(((moom.HZ)(this)).a(((int)(5)), ((int)(5))), ((moom.HZ)(this)).a(((int)(1))), ((moom.HZ)(this)).b(((int)(5)), ((int)(5)))))));
    if (!((life6_5 != null))) {
        lexicalValue749_639_0 = ((spill749_2) ? 1 : 0);
        break lexical_join_639;
    }
    if (!(spill749_2)) {
        break lexical_join_634;
    }
    this.i = ((boolean)(true));
    ((moom.HZ)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((java.util.Random)(p1)), ((int)(5)), ((int)(1)), ((int)(5)), ((java.util.List)(moom.HZ.h)), ((int)((3 + ((java.util.Random)(p1)).nextInt(((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic749_195(24157, (395091207316474151L ^ life4_3)))))))));
    }
    lexicalValue749_639_0 = __sourceIntrinsic_5ac1d031d896_invokedynamic749_198(24157, (395091207316474151L ^ life4_3));
    }
    life7_662 = lexicalValue749_639_0;
    lexical_cycle_640: while (true) {
    lexical_join_688: {
    lexical_join_677: {
    lexical_join_674: {
    if (!((life7_662 <= __sourceIntrinsic_5ac1d031d896_invokedynamic749_199(14903, (645037956104777052L ^ life4_3))))) {
        break lexical_join_691;
    }
    spill749_3 = this;
    spill749_4 = p0;
    if (!((life6_5 != null))) {
        lexicalValue749_741_0 = spill749_3;
        lexicalValue749_741_1 = spill749_4;
        break lexical_join_741;
    }
    spill749_5 = ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((moom.HZ)(spill749_3)).a(((net.minecraft.world.World)(spill749_4)), ((int)(life7_662)), ((int)(0)), ((int)(-1)), ((moom.G2)(p2))))).a__ch())).a__fn();
    spill749_6 = moom.fn.a;
    if (!((life6_5 != null))) {
        lexicalValue749_674_0 = spill749_5;
        lexicalValue749_674_1 = spill749_6;
        break lexical_join_674;
    }
    if (!((spill749_5 == spill749_6))) {
        break lexical_join_688;
    }
    spill749_7 = this;
    spill749_8 = p0;
    if (!((life6_5 != null))) {
        lexicalValue749_677_0 = spill749_7;
        lexicalValue749_677_1 = spill749_8;
        break lexical_join_677;
    }
    lexicalValue749_674_0 = ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((moom.HZ)(spill749_7)).a(((net.minecraft.world.World)(spill749_8)), ((int)(life7_662)), ((int)(-1)), ((int)(-1)), ((moom.G2)(p2))))).a__ch())).a__fn();
    lexicalValue749_674_1 = moom.fn.a;
    }
    if (!((lexicalValue749_674_0 != lexicalValue749_674_1))) {
        break lexical_join_688;
    }
    lexicalValue749_677_0 = this;
    lexicalValue749_677_1 = p0;
    }
    ((moom.HZ)(lexicalValue749_677_0)).a(((net.minecraft.world.World)(lexicalValue749_677_1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aw)).b__fE(((int)(((moom.HZ)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aw)), ((int)(3)))))))), ((int)(life7_662)), ((int)(0)), ((int)(-1)), ((moom.G2)(p2)));
    }
    life7_662 += 1;
    if (!((life6_5 == null))) { continue lexical_cycle_640; }
    break lexical_cycle_640;
    }
    }
    life7_730 = 0;
    lexical_cycle_693: while (true) {
    lexical_join_737: {
    lexical_join_736: {
    if (!((life7_730 < __sourceIntrinsic_5ac1d031d896_invokedynamic749_213(31675, (3225797137830292692L ^ life4_3))))) {
        break lexical_join_739;
    }
    spill749_9 = 0;
    if (!((life6_5 != null))) {
        lexicalValue749_752_0 = spill749_9;
        break lexical_join_752;
    }
    life8_741 = spill749_9;
    lexical_cycle_704: while (true) {
    if (!((life8_741 < __sourceIntrinsic_5ac1d031d896_invokedynamic749_214(8724, (4797706342405141886L ^ life4_3))))) {
        break lexical_join_736;
    }
    ((moom.HZ)(this)).a__Void(((net.minecraft.world.World)(p0)), ((int)(life8_741)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic749_215(24157, (395091207316474151L ^ life4_3)))), ((int)(life7_730)), ((moom.G2)(p2)));
    ((moom.HZ)(this)).b(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(__sourceExactCall_7dba7f72a5b74e(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e))))), ((int)(life8_741)), ((int)(-1)), ((int)(life7_730)), ((moom.G2)(p2)));
    life8_741 += 1;
    if (!((life6_5 != null))) {
        break lexical_join_737;
    }
    if (!((life6_5 == null))) { continue lexical_cycle_704; }
    break lexical_cycle_704;
    }
    }
    life7_730 += 1;
    }
    if (!((life6_5 == null))) { continue lexical_cycle_693; }
    break lexical_cycle_693;
    }
    }
    lexicalValue749_741_0 = this;
    lexicalValue749_741_1 = p0;
    }
    ((moom.HZ)(lexicalValue749_741_0)).a(((net.minecraft.world.World)(lexicalValue749_741_1)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic749_220(31675, (3225797137830292692L ^ life4_3)))), ((int)(1)), ((int)(1)), ((int)(1)));
    lexicalValue749_752_0 = 1;
    }
    return ((lexicalValue749_752_0) != 0);
}


protected void a(net.minecraft.nbt.NBTTagCompound p0) {
super.a(((net.minecraft.nbt.NBTTagCompound)(p0)));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("Chest")), ((boolean)__sourceIntrinsic_integerToBoolean((((this.i) ? 1 : 0)))));
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite827_52(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite827_56(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite827_59(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite827_61(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite827_63(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite827_65(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite827_67(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite827_69(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite827_71(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite827_73(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite827_76(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite827_77(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite827_80(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite827_81(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite827_83(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite827_85(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite827_87(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5cd42c488dc2_invokedynamic2109_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5cd42c488dc2_invokedynamic2109_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5cd42c488dc2_invokedynamic2109_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic749_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic749_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic749_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic749_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic749_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic749_27(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic749_28(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic749_34(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic749_35(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic749_41(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic749_62(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic749_63(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic749_87(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic749_88(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic749_99(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic749_100(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic749_106(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic749_107(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic749_108(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic749_116(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic749_120(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic749_124(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic749_128(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic749_130(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic749_131(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic749_139(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic749_143(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic749_147(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic749_151(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic749_161(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic749_165(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic749_195(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic749_198(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic749_199(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic749_213(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic749_214(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic749_215(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic749_220(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4802_0() throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native int __sourceExactCall_ba666c50db9739(int p0, long p1);
private static native boolean __sourceExactCall_0448559b349003(moom.G2 p0);
private static native moom.G4 __sourceExactCall_21e7c855759262(java.util.List p0, moom.G2 p1);

private static native net.minecraft.block.state.IBlockState __sourceExactCall_c42b6878473bc7(moom.ei p0);
private static native net.minecraft.block.state.IBlockState __sourceExactCall_7dba7f72a5b74e(net.minecraft.block.Block p0);

private static native net.minecraft.block.state.IBlockState __sourceExactCall_4011ce2a926de7(moom.dM p0);
}
