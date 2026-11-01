package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Ho extends moom.Hc {

private static final long f;

private static final long[] g;

private static final java.lang.Integer[] h;

private static final java.util.Map i;

public Ho() {
super();
}


public Ho(int p0, java.util.Random p1, moom.G2 p2, moom.bs p3) {
super(p0);
    this.b = p3;
    this.a = p2;
}


static {
f = ((long)(((moom._a)(moom._c.a(((long)(-6824912176285531537L)), ((long)(-1279597326862200L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(174549706838288L)))));
    i = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.Ho.f ^ 97926110210749L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill841_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill841_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill841_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill841_14 = new byte[8];
    (__sourceSpill841_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill841_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation841_16 = __sourceSpill841_14;
    ((javax.crypto.Cipher)(__sourceSpill841_11)).init(((int)(__sourceSpill841_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill841_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation841_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[19];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "\007\\:Ò6È¹\005º2]Ç×oÜ~¾ÊÓÁû¶\016Õ)\r\001Í\001ä²d'¦Òø\007æá\035Öú?}1nè¥µY+ít\025S\034Ô\tÂG4aä¹n\023ïÛsW´\024þiø¯r\023ãSfÉf@\0374KÄÃÜÕ÷\021ÖmëVPØîôx'ip\030Ï\tl}KÒO,\007`]<Ì/­@"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill841_25 = local6_life21;
        int __sourceSpill841_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill841_25)).substring(((int)(__sourceSpill841_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill841_30 = local8_life19;
        int __sourceSpill841_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill841_33 = new byte[8];
        (__sourceSpill841_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill841_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill841_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill841_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill841_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill841_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill841_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill841_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill841_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill841_34)).doFinal(((byte[])(__sourceSpill841_33)));
        (__sourceSpill841_30)[__sourceSpill841_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "ëÕÊ9l\017\002×æHãr¢Ç"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill841_38 = local6_life21;
        int __sourceSpill841_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill841_38)).substring(((int)(__sourceSpill841_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill841_43 = local8_life19;
        int __sourceSpill841_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill841_46 = new byte[8];
        (__sourceSpill841_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill841_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill841_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill841_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill841_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill841_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill841_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill841_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill841_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill841_47)).doFinal(((byte[])(__sourceSpill841_46)));
        (__sourceSpill841_43)[__sourceSpill841_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    g = ((long[])(local8_life19));
    h = ((java.lang.Integer[])(new java.lang.Integer[19]));
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.Ho.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x1D78;
        if (h[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = g[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])i.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    i.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/Ho", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Ho.h[n2] = n3;
        }
        return h[n2];
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4855_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Ho"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public static moom.Ho a(java.util.List<moom.G4> p0, java.util.Random p1, int p2, int p3, int p4, moom.bs p5, int p6) {
moom.Ho forwardValue2147_52_0;
    long life7_3;
    moom.G2 life9_35;
    forward_join_52: {
    forward_join_51: {
    life7_3 = (moom.Ho.f ^ 130622718716994L);
    life9_35 = moom.G2.a(((int)(p2)), ((int)(p3)), ((int)(p4)), ((int)(__sourceIntrinsic_8c68aa565418_invokedynamic2147_1(16281, (5321584856731686588L ^ life7_3)))), ((int)(__sourceIntrinsic_8c68aa565418_invokedynamic2147_2(883, (8494163318798199386L ^ life7_3)))), ((int)(0)), ((int)(__sourceIntrinsic_8c68aa565418_invokedynamic2147_3(8311, (6603932856859855190L ^ life7_3)))), ((int)(__sourceIntrinsic_8c68aa565418_invokedynamic2147_4(12766, (4380940278175373560L ^ life7_3)))), ((int)(__sourceIntrinsic_8c68aa565418_invokedynamic2147_5(11314, (6622889590849930500L ^ life7_3)))), ((moom.bs)(p5)));
    if (!(moom.Ho.a(((moom.G2)(life9_35))))) {
        break forward_join_51;
    }
    if (!((moom.G4.a(((java.util.List)(p0)), ((moom.G2)(life9_35))) == null))) {
        break forward_join_51;
    }
    forwardValue2147_52_0 = new moom.Ho(p6, p1, life9_35, p5);
    break forward_join_52;
    }
    forwardValue2147_52_0 = null;
    }
    return forwardValue2147_52_0;
}


public void a(moom.G4 p0, java.util.List<moom.G4> p1, java.util.Random p2) {
long local4 = (moom.Ho.f ^ 13870483583473L);
    ((moom.Ho)(this)).a(((moom.Hl)(((moom.Hl)(p0)))), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)(5)), ((int)(3)), ((boolean)(true)));
    ((moom.Ho)(this)).a(((moom.Hl)(((moom.Hl)(p0)))), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)(5)), ((int)(__sourceIntrinsic_0f75cc6dd3c5_originalDynamicSite1167_4(4046, (5167333070081899351L ^ local4)))), ((boolean)(true)));
    return;
}


public boolean a__Boolean(net.minecraft.world.World p0, java.util.Random p1, moom.G2 p2) {
int lexicalValue768_778_0;
    int lexicalValue768_778_1;
    int lexicalValue768_817_0;
    int lexicalValue768_817_1;
    int lexicalValue768_853_0;
    int lexicalValue768_1528_0;
    int lexicalValue768_1576_0;
    int lexicalValue768_1581_0;
    net.minecraft.entity.Entity[] spill768_0;
    int spill768_1;
    int spill768_2;
    int spill768_3;
    int spill768_4;
    int spill768_5;
    int spill768_6;
    int spill768_7;
    int spill768_8;
    int spill768_9;
    long life4_3;
    net.minecraft.entity.Entity[] life6_136;
    int life7_312;
    int life7_625;
    int life8_701;
    int life9_712;
    int life10_716;
    int life8_889;
    int life9_1175;
    int life10_1519;
    int life11_1530;
    int life10_1570;
    int life11_1577;
    lexical_join_1581: {
    lexical_join_1576: {
    lexical_join_1575: {
    lexical_join_1528: {
    lexical_join_1527: {
    lexical_join_1132: {
    lexical_join_884: {
    lexical_join_853: {
    lexical_join_852: {
    lexical_join_694: {
    lexical_join_689: {
    lexical_join_621: {
    lexical_join_561: {
    life4_3 = (moom.Ho.f ^ 137533245225783L);
    ((moom.Ho)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(3)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_1(22011, (6036762219277691811L ^ life4_3)))), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_2(7143, (2054890140228380081L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    spill768_0 = moom.G4.b();
    ((moom.Ho)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(5)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_9(7143, (2054890140228380081L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_10(11314, (6622878771768218225L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_11(7143, (2054890140228380081L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((boolean)(false)));
    ((moom.Ho)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(5)), ((int)(0)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_17(7143, (2054890140228380081L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_18(7143, (2054890140228380081L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    ((moom.Ho)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_24(17708, (3781010622997478257L ^ life4_3)))), ((int)(5)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_25(7143, (2054890140228380081L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_26(7143, (2054890140228380081L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_27(7143, (2054890140228380081L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    ((moom.Ho)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(2)), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_33(4046, (5167457827959796113L ^ life4_3)))), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_34(7143, (2054890140228380081L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_35(7143, (2054890140228380081L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    life6_136 = spill768_0;
    ((moom.Ho)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_41(18589, (2203802896665261768L ^ life4_3)))), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_42(4046, (5167457827959796113L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_43(8939, (6080787022300110010L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_44(7143, (2054890140228380081L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_45(7143, (2054890140228380081L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    ((moom.Ho)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_51(4682, (8854209888365734929L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_52(4046, (5167457827959796113L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_53(31451, (7392820615701791877L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_54(7143, (2054890140228380081L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_55(7143, (2054890140228380081L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    ((moom.Ho)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(2)), ((int)(5)), ((int)(0)), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_61(7143, (2054890140228380081L ^ life4_3)))), ((int)(1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    ((moom.Ho)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_67(16984, (8281101826838117401L ^ life4_3)))), ((int)(5)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_68(26132, (6530522624983275597L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_69(7143, (2054890140228380081L ^ life4_3)))), ((int)(1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    ((moom.Ho)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_75(5873, (6159586904244086947L ^ life4_3)))), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_76(8623, (2982357714830221301L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_77(7143, (2054890140228380081L ^ life4_3)))), ((int)(1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    ((moom.Ho)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_83(4046, (5167457827959796113L ^ life4_3)))), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_84(26132, (6530522624983275597L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_85(7143, (2054890140228380081L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_86(26132, (6530522624983275597L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    life7_312 = 1;
    lexical_cycle_313: while (true) {
    if (!((life7_312 <= __sourceIntrinsic_5ac1d031d896_invokedynamic768_92(4046, (5167457827959796113L ^ life4_3))))) {
        break lexical_join_561;
    }
    ((moom.Ho)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(life7_312)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_93(26132, (6530522624983275597L ^ life4_3)))), ((int)(0)), ((int)(life7_312)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_94(4046, (5167457827959796113L ^ life4_3)))), ((int)(0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bo)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bo)).a__fE())), ((boolean)(false)));
    ((moom.Ho)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(life7_312)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_100(26132, (6530522624983275597L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_101(7143, (2054890140228380081L ^ life4_3)))), ((int)(life7_312)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_102(4046, (5167457827959796113L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_103(7143, (2054890140228380081L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bo)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bo)).a__fE())), ((boolean)(false)));
    ((moom.Ho)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_109(26132, (6530522624983275597L ^ life4_3)))), ((int)(life7_312)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_110(4046, (5167457827959796113L ^ life4_3)))), ((int)(life7_312)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bo)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bo)).a__fE())), ((boolean)(false)));
    ((moom.Ho)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_116(7143, (2054890140228380081L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_117(26132, (6530522624983275597L ^ life4_3)))), ((int)(life7_312)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_118(7143, (2054890140228380081L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_119(4046, (5167457827959796113L ^ life4_3)))), ((int)(life7_312)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bo)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bo)).a__fE())), ((boolean)(false)));
    ((moom.Ho)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((int)(life7_312)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_127(11314, (6622878771768218225L ^ life4_3)))), ((int)(0)), ((moom.G2)(p2)));
    ((moom.Ho)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((int)(life7_312)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_131(11314, (6622878771768218225L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_132(7143, (2054890140228380081L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.Ho)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_136(11314, (6622878771768218225L ^ life4_3)))), ((int)(life7_312)), ((moom.G2)(p2)));
    ((moom.Ho)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_140(7143, (2054890140228380081L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_141(11314, (6622878771768218225L ^ life4_3)))), ((int)(life7_312)), ((moom.G2)(p2)));
    ((moom.Ho)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bo)).a__fE())), ((int)((life7_312 + 1))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_145(11314, (6622878771768218225L ^ life4_3)))), ((int)(0)), ((moom.G2)(p2)));
    ((moom.Ho)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bo)).a__fE())), ((int)((life7_312 + 1))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_149(11314, (6622878771768218225L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_150(7143, (2054890140228380081L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.Ho)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bo)).a__fE())), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_154(11314, (6622878771768218225L ^ life4_3)))), ((int)((life7_312 + 1))), ((moom.G2)(p2)));
    ((moom.Ho)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bo)).a__fE())), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_158(7143, (2054890140228380081L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_159(11314, (6622878771768218225L ^ life4_3)))), ((int)((life7_312 + 1))), ((moom.G2)(p2)));
    life7_312 += 2;
    if (!((life6_136 != null))) {
        break lexical_join_621;
    }
    if (!((life6_136 == null))) { continue lexical_cycle_313; }
    break lexical_cycle_313;
    }
    }
    ((moom.Ho)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bo)).a__fE())), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_163(11314, (6622878771768218225L ^ life4_3)))), ((int)(0)), ((moom.G2)(p2)));
    ((moom.Ho)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bo)).a__fE())), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_167(11314, (6622878771768218225L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_168(7143, (2054890140228380081L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.Ho)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bo)).a__fE())), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_172(11314, (6622878771768218225L ^ life4_3)))), ((int)(0)), ((moom.G2)(p2)));
    ((moom.Ho)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bo)).a__fE())), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_176(7143, (2054890140228380081L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_177(11314, (6622878771768218225L ^ life4_3)))), ((int)(0)), ((moom.G2)(p2)));
    }
    life7_625 = 3;
    lexical_cycle_623: while (true) {
    if (!((life7_625 <= __sourceIntrinsic_5ac1d031d896_invokedynamic768_179(5873, (6159586904244086947L ^ life4_3))))) {
        break lexical_join_689;
    }
    ((moom.Ho)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_180(8623, (2982357714830221301L ^ life4_3)))), ((int)(life7_625)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_181(16984, (8281101826838117401L ^ life4_3)))), ((int)(life7_625)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bo)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bo)).a__fE())), ((boolean)(false)));
    ((moom.Ho)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_187(4046, (5167457827959796113L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_188(8623, (2982357714830221301L ^ life4_3)))), ((int)(life7_625)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_189(4046, (5167457827959796113L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_190(16984, (8281101826838117401L ^ life4_3)))), ((int)(life7_625)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bo)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bo)).a__fE())), ((boolean)(false)));
    life7_625 += 2;
    if (!((life6_136 != null))) {
        break lexical_join_694;
    }
    if (!((life6_136 == null))) { continue lexical_cycle_623; }
    break lexical_cycle_623;
    }
    }
    life7_625 = ((moom.Ho)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bp)), ((int)(3)));
    }
    life8_701 = 0;
    lexical_cycle_696: while (true) {
    lexical_join_849: {
    lexical_join_817: {
    lexical_join_815: {
    lexical_join_778: {
    lexical_join_772: {
    lexical_join_735: {
    if (!((life8_701 <= __sourceIntrinsic_5ac1d031d896_invokedynamic768_198(31659, (128063386743178748L ^ life4_3))))) {
        break lexical_join_852;
    }
    life9_712 = (life8_701 + 4);
    spill768_1 = 5;
    if (!((life6_136 != null))) {
        lexicalValue768_853_0 = spill768_1;
        break lexical_join_853;
    }
    life10_716 = spill768_1;
    lexical_cycle_711: while (true) {
    if (!((life10_716 <= __sourceIntrinsic_5ac1d031d896_invokedynamic768_199(8623, (2982357714830221301L ^ life4_3))))) {
        break lexical_join_735;
    }
    ((moom.Ho)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bp)).b__fE(((int)(life7_625))))), ((int)(life10_716)), ((int)((5 + life8_701))), ((int)(life9_712)), ((moom.G2)(p2)));
    life10_716 += 1;
    if (!((life6_136 != null))) {
        break lexical_join_772;
    }
    if (!((life6_136 == null))) { continue lexical_cycle_711; }
    break lexical_cycle_711;
    }
    }
    spill768_2 = life9_712;
    spill768_3 = 5;
    if (!((life6_136 != null))) {
        lexicalValue768_778_0 = spill768_2;
        lexicalValue768_778_1 = spill768_3;
        break lexical_join_778;
    }
    if (!((spill768_2 >= spill768_3))) {
        break lexical_join_772;
    }
    spill768_4 = life9_712;
    spill768_5 = __sourceIntrinsic_5ac1d031d896_invokedynamic768_203(16984, (8281101826838117401L ^ life4_3));
    if (!((life6_136 != null))) {
        lexicalValue768_778_0 = spill768_4;
        lexicalValue768_778_1 = spill768_5;
        break lexical_join_778;
    }
    if (!((spill768_4 <= spill768_5))) {
        break lexical_join_772;
    }
    ((moom.Ho)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(5)), ((int)(5)), ((int)(life9_712)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_204(8623, (2982357714830221301L ^ life4_3)))), ((int)((life8_701 + 4))), ((int)(life9_712)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    if (!((life6_136 == null))) {
        break lexical_join_815;
    }
    }
    lexicalValue768_778_0 = life9_712;
    lexicalValue768_778_1 = __sourceIntrinsic_5ac1d031d896_invokedynamic768_210(5873, (6159586904244086947L ^ life4_3));
    }
    if (!((life6_136 != null))) {
        lexicalValue768_817_0 = lexicalValue768_778_0;
        lexicalValue768_817_1 = lexicalValue768_778_1;
        break lexical_join_817;
    }
    if (!((lexicalValue768_778_0 >= lexicalValue768_778_1))) {
        break lexical_join_815;
    }
    spill768_6 = life9_712;
    spill768_7 = __sourceIntrinsic_5ac1d031d896_invokedynamic768_211(26132, (6530522624983275597L ^ life4_3));
    if (!((life6_136 != null))) {
        lexicalValue768_817_0 = spill768_6;
        lexicalValue768_817_1 = spill768_7;
        break lexical_join_817;
    }
    if (!((spill768_6 <= spill768_7))) {
        break lexical_join_815;
    }
    ((moom.Ho)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_212(16984, (8281101826838117401L ^ life4_3)))), ((int)(life9_712)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_213(8623, (2982357714830221301L ^ life4_3)))), ((int)((life8_701 + 4))), ((int)(life9_712)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    }
    lexicalValue768_817_0 = life8_701;
    lexicalValue768_817_1 = 1;
    }
    if (!((lexicalValue768_817_0 >= lexicalValue768_817_1))) {
        break lexical_join_849;
    }
    ((moom.Ho)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(5)), ((int)((__sourceIntrinsic_5ac1d031d896_invokedynamic768_219(7081, (5325834636257453547L ^ life4_3)) + life8_701))), ((int)(life9_712)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_220(8623, (2982357714830221301L ^ life4_3)))), ((int)((__sourceIntrinsic_5ac1d031d896_invokedynamic768_221(5873, (6159586904244086947L ^ life4_3)) + life8_701))), ((int)(life9_712)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((boolean)(false)));
    }
    life8_701 += 1;
    if (!((life6_136 == null))) { continue lexical_cycle_696; }
    break lexical_cycle_696;
    }
    }
    lexicalValue768_853_0 = 5;
    }
    life8_889 = lexicalValue768_853_0;
    lexical_cycle_854: while (true) {
    if (!((life8_889 <= __sourceIntrinsic_5ac1d031d896_invokedynamic768_227(8623, (2982357714830221301L ^ life4_3))))) {
        break lexical_join_884;
    }
    ((moom.Ho)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bp)).b__fE(((int)(life7_625))))), ((int)(life8_889)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_230(7143, (2054890140228380081L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_231(4046, (5167457827959796113L ^ life4_3)))), ((moom.G2)(p2)));
    life8_889 += 1;
    if (!((life6_136 != null))) {
        break lexical_join_1132;
    }
    if (!((life6_136 == null))) { continue lexical_cycle_854; }
    break lexical_cycle_854;
    }
    }
    ((moom.Ho)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_233(7081, (5325834636257453547L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_234(8623, (2982357714830221301L ^ life4_3)))), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_235(8623, (2982357714830221301L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_236(8623, (2982357714830221301L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bo)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bo)).a__fE())), ((boolean)(false)));
    ((moom.Ho)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_242(8623, (2982357714830221301L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_243(7081, (5325834636257453547L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_244(8623, (2982357714830221301L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_245(8623, (2982357714830221301L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_246(8623, (2982357714830221301L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_247(8623, (2982357714830221301L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bo)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bo)).a__fE())), ((boolean)(false)));
    ((moom.Ho)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_253(11314, (6622878771768218225L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_254(7143, (2054890140228380081L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_255(8623, (2982357714830221301L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_256(11314, (6622878771768218225L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_257(7143, (2054890140228380081L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((boolean)(false)));
    ((moom.Ho)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(2)), ((int)(5)), ((int)(2)), ((int)(3)), ((int)(5)), ((int)(3)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    ((moom.Ho)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(2)), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_268(5873, (6159586904244086947L ^ life4_3)))), ((int)(3)), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_269(26132, (6530522624983275597L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    ((moom.Ho)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(2)), ((int)(5)), ((int)(4)), ((int)(2)), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_275(16984, (8281101826838117401L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    ((moom.Ho)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_281(5873, (6159586904244086947L ^ life4_3)))), ((int)(5)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_282(26132, (6530522624983275597L ^ life4_3)))), ((int)(5)), ((int)(3)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    ((moom.Ho)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_288(5873, (6159586904244086947L ^ life4_3)))), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_289(5873, (6159586904244086947L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_290(26132, (6530522624983275597L ^ life4_3)))), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_291(26132, (6530522624983275597L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    ((moom.Ho)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_297(26132, (6530522624983275597L ^ life4_3)))), ((int)(5)), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_298(26132, (6530522624983275597L ^ life4_3)))), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_299(16984, (8281101826838117401L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    life8_889 = ((moom.Ho)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bp)), ((int)(0)));
    }
    life9_1175 = ((moom.Ho)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bp)), ((int)(1)));
    ((moom.Ho)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bp)).b__fE(((int)(life9_1175))))), ((int)(4)), ((int)(5)), ((int)(2)), ((moom.G2)(p2)));
    ((moom.Ho)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bp)).b__fE(((int)(life9_1175))))), ((int)(4)), ((int)(5)), ((int)(3)), ((moom.G2)(p2)));
    ((moom.Ho)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bp)).b__fE(((int)(life9_1175))))), ((int)(4)), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_317(5873, (6159586904244086947L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.Ho)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bp)).b__fE(((int)(life9_1175))))), ((int)(4)), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_321(26132, (6530522624983275597L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.Ho)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bp)).b__fE(((int)(life8_889))))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_325(16984, (8281101826838117401L ^ life4_3)))), ((int)(5)), ((int)(2)), ((moom.G2)(p2)));
    ((moom.Ho)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bp)).b__fE(((int)(life8_889))))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_329(16984, (8281101826838117401L ^ life4_3)))), ((int)(5)), ((int)(3)), ((moom.G2)(p2)));
    ((moom.Ho)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bp)).b__fE(((int)(life8_889))))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_333(16984, (8281101826838117401L ^ life4_3)))), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_334(5873, (6159586904244086947L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.Ho)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bp)).b__fE(((int)(life8_889))))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_338(16984, (8281101826838117401L ^ life4_3)))), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_339(26132, (6530522624983275597L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.Ho)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(3)), ((int)(4)), ((int)(4)), ((int)(4)), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_341(16984, (8281101826838117401L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aW)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aW)).a__fE())), ((boolean)(false)));
    ((moom.Ho)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_347(16984, (8281101826838117401L ^ life4_3)))), ((int)(4)), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_348(5873, (6159586904244086947L ^ life4_3)))), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_349(16984, (8281101826838117401L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aW)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aW)).a__fE())), ((boolean)(false)));
    ((moom.Ho)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(3)), ((int)(5)), ((int)(4)), ((int)(4)), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_355(16984, (8281101826838117401L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bq)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bq)).a__fE())), ((boolean)(false)));
    ((moom.Ho)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_361(16984, (8281101826838117401L ^ life4_3)))), ((int)(5)), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_362(5873, (6159586904244086947L ^ life4_3)))), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_363(16984, (8281101826838117401L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bq)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bq)).a__fE())), ((boolean)(false)));
    ((moom.Ho)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(4)), ((int)(2)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_369(16984, (8281101826838117401L ^ life4_3)))), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_370(7143, (2054890140228380081L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    ((moom.Ho)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(2)), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_376(7143, (2054890140228380081L ^ life4_3)))), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_377(16984, (8281101826838117401L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    ((moom.Ho)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(4)), ((int)(0)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_383(16984, (8281101826838117401L ^ life4_3)))), ((int)(1)), ((int)(3)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    ((moom.Ho)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(4)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_389(5873, (6159586904244086947L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_390(16984, (8281101826838117401L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_391(7143, (2054890140228380081L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    ((moom.Ho)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(0)), ((int)(4)), ((int)(3)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_397(16984, (8281101826838117401L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    ((moom.Ho)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_403(5873, (6159586904244086947L ^ life4_3)))), ((int)(0)), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_404(7143, (2054890140228380081L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic768_405(16984, (8281101826838117401L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    life10_1519 = 4;
    lexical_cycle_1481: while (true) {
    lexical_join_1525: {
    lexical_join_1524: {
    if (!((life10_1519 <= __sourceIntrinsic_5ac1d031d896_invokedynamic768_411(16984, (8281101826838117401L ^ life4_3))))) {
        break lexical_join_1527;
    }
    spill768_8 = 0;
    if (!((life6_136 != null))) {
        lexicalValue768_1528_0 = spill768_8;
        break lexical_join_1528;
    }
    life11_1530 = spill768_8;
    lexical_cycle_1492: while (true) {
    if (!((life11_1530 <= 2))) {
        break lexical_join_1524;
    }
    ((moom.Ho)(this)).b(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((int)(life10_1519)), ((int)(-1)), ((int)(life11_1530)), ((moom.G2)(p2)));
    ((moom.Ho)(this)).b(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((int)(life10_1519)), ((int)(-1)), ((int)((__sourceIntrinsic_5ac1d031d896_invokedynamic768_417(7143, (2054890140228380081L ^ life4_3)) - life11_1530))), ((moom.G2)(p2)));
    life11_1530 += 1;
    if (!((life6_136 != null))) {
        break lexical_join_1525;
    }
    if (!((life6_136 == null))) { continue lexical_cycle_1492; }
    break lexical_cycle_1492;
    }
    }
    life10_1519 += 1;
    }
    if (!((life6_136 == null))) { continue lexical_cycle_1481; }
    break lexical_cycle_1481;
    }
    }
    lexicalValue768_1528_0 = 0;
    }
    life10_1570 = lexicalValue768_1528_0;
    lexical_cycle_1529: while (true) {
    lexical_join_1573: {
    lexical_join_1572: {
    if (!((life10_1570 <= 2))) {
        break lexical_join_1575;
    }
    spill768_9 = 4;
    if (!((life6_136 != null))) {
        lexicalValue768_1576_0 = spill768_9;
        break lexical_join_1576;
    }
    life11_1577 = spill768_9;
    lexical_cycle_1536: while (true) {
    if (!((life11_1577 <= __sourceIntrinsic_5ac1d031d896_invokedynamic768_419(16984, (8281101826838117401L ^ life4_3))))) {
        break lexical_join_1572;
    }
    ((moom.Ho)(this)).b(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((int)(life10_1570)), ((int)(-1)), ((int)(life11_1577)), ((moom.G2)(p2)));
    ((moom.Ho)(this)).b(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((int)((__sourceIntrinsic_5ac1d031d896_invokedynamic768_425(7143, (2054890140228380081L ^ life4_3)) - life10_1570))), ((int)(-1)), ((int)(life11_1577)), ((moom.G2)(p2)));
    life11_1577 += 1;
    if (!((life6_136 != null))) {
        break lexical_join_1573;
    }
    if (!((life6_136 == null))) { continue lexical_cycle_1536; }
    break lexical_cycle_1536;
    }
    }
    life10_1570 += 1;
    }
    if (!((life6_136 == null))) { continue lexical_cycle_1529; }
    break lexical_cycle_1529;
    }
    }
    lexicalValue768_1576_0 = 1;
    }
    if (!((net.minecraft.entity.Entity.b__ArrayString() != null))) {
        lexicalValue768_1581_0 = lexicalValue768_1576_0;
        break lexical_join_1581;
    }
    moom.G4.b(((net.minecraft.entity.Entity[])(new net.minecraft.entity.Entity[1])));
    lexicalValue768_1581_0 = lexicalValue768_1576_0;
    }
    return ((lexicalValue768_1581_0) != 0);
}


private static native <E extends Throwable> int __sourceIntrinsic_8c68aa565418_invokedynamic2147_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8c68aa565418_invokedynamic2147_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8c68aa565418_invokedynamic2147_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8c68aa565418_invokedynamic2147_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8c68aa565418_invokedynamic2147_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0f75cc6dd3c5_originalDynamicSite1167_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_27(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_33(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_34(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_35(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_41(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_42(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_43(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_44(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_45(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_51(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_52(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_53(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_54(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_55(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_61(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_67(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_68(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_69(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_75(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_76(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_77(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_83(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_84(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_85(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_86(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_92(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_93(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_94(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_100(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_101(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_102(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_103(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_109(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_110(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_116(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_117(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_118(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_119(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_127(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_131(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_132(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_136(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_140(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_141(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_145(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_149(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_150(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_154(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_158(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_159(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_163(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_167(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_168(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_172(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_176(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_177(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_179(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_180(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_181(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_187(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_188(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_189(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_190(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_198(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_199(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_203(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_204(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_210(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_211(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_212(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_213(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_219(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_220(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_221(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_227(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_230(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_231(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_233(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_234(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_235(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_236(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_242(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_243(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_244(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_245(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_246(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_247(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_253(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_254(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_255(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_256(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_257(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_268(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_269(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_275(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_281(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_282(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_288(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_289(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_290(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_291(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_297(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_298(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_299(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_317(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_321(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_325(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_329(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_333(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_334(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_338(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_339(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_341(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_347(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_348(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_349(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_355(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_361(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_362(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_363(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_369(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_370(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_376(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_377(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_383(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_389(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_390(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_391(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_397(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_403(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_404(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_405(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_411(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_417(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_419(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic768_425(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4855_0() throws E;
}
