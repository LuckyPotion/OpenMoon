package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Hn extends moom.Hc {

private static final long f;

private static final long[] g;

private static final java.lang.Integer[] h;

private static final java.util.Map i;

public Hn() {
super();
}


public Hn(int p0, java.util.Random p1, moom.G2 p2, moom.bs p3) {
super(p0);
    this.b = p3;
    this.a = p2;
}


static {
f = ((long)(((moom._a)(moom._c.a(((long)(3029899913418889624L)), ((long)(-4527669088099672736L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(123484949013846L)))));
    i = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.Hn.f ^ 95228929093687L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill840_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill840_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill840_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill840_14 = new byte[8];
    (__sourceSpill840_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill840_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation840_16 = __sourceSpill840_14;
    ((javax.crypto.Cipher)(__sourceSpill840_11)).init(((int)(__sourceSpill840_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill840_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation840_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[19];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "þ\tÀá§\030\024}ÐjÂ\b½ï\034[äø]ñüGN üìâi\tµ\027wv\177!²×\021>=\037\017à{k\037\035ò-S<çÉk$i£hFÑÅ\0259\bÖÝÅB¥\006£<J\034ºMÕÚ Ê_\036§»H{ >ìì9\024Þh#\026&ò\035¿³Øàygp~ç<SèÞ>\020"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill840_25 = local6_life21;
        int __sourceSpill840_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill840_25)).substring(((int)(__sourceSpill840_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill840_30 = local8_life19;
        int __sourceSpill840_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill840_33 = new byte[8];
        (__sourceSpill840_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill840_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill840_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill840_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill840_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill840_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill840_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill840_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill840_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill840_34)).doFinal(((byte[])(__sourceSpill840_33)));
        (__sourceSpill840_30)[__sourceSpill840_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "\004ß\031R)\"³Wgqlñ\000¤"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill840_38 = local6_life21;
        int __sourceSpill840_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill840_38)).substring(((int)(__sourceSpill840_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill840_43 = local8_life19;
        int __sourceSpill840_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill840_46 = new byte[8];
        (__sourceSpill840_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill840_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill840_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill840_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill840_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill840_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill840_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill840_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill840_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill840_47)).doFinal(((byte[])(__sourceSpill840_46)));
        (__sourceSpill840_43)[__sourceSpill840_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    g = ((long[])(local8_life19));
    h = ((java.lang.Integer[])(new java.lang.Integer[19]));
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.Hn.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x99F;
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
                throw new RuntimeException("moom/Hn", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Hn.h[n2] = n3;
        }
        return h[n2];
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4852_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Hn"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public static moom.Hn a(java.util.List<moom.G4> p0, java.util.Random p1, int p2, int p3, int p4, moom.bs p5, int p6) {
moom.Hn forwardValue2145_52_0;
    long life7_3;
    moom.G2 life9_35;
    forward_join_52: {
    forward_join_51: {
    life7_3 = (moom.Hn.f ^ 72277308337096L);
    life9_35 = moom.G2.a(((int)(p2)), ((int)(p3)), ((int)(p4)), ((int)(__sourceIntrinsic_1d76b51c4730_invokedynamic2145_1(20809, (2139535593277139118L ^ life7_3)))), ((int)(__sourceIntrinsic_1d76b51c4730_invokedynamic2145_2(5253, (3453461427388149103L ^ life7_3)))), ((int)(0)), ((int)(__sourceIntrinsic_1d76b51c4730_invokedynamic2145_3(15076, (2345236239264596744L ^ life7_3)))), ((int)(__sourceIntrinsic_1d76b51c4730_invokedynamic2145_4(20528, (276823921472055773L ^ life7_3)))), ((int)(__sourceIntrinsic_1d76b51c4730_invokedynamic2145_5(11049, (4315873674253062857L ^ life7_3)))), ((moom.bs)(p5)));
    if (!(moom.Hn.a(((moom.G2)(life9_35))))) {
        break forward_join_51;
    }
    if (!((moom.G4.a(((java.util.List)(p0)), ((moom.G2)(life9_35))) == null))) {
        break forward_join_51;
    }
    forwardValue2145_52_0 = new moom.Hn(p6, p1, life9_35, p5);
    break forward_join_52;
    }
    forwardValue2145_52_0 = null;
    }
    return forwardValue2145_52_0;
}


public void a(moom.G4 p0, java.util.List<moom.G4> p1, java.util.Random p2) {
((moom.Hn)(this)).a(((moom.Hl)(((moom.Hl)(p0)))), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)(5)), ((int)(3)), ((boolean)(true)));
    return;
}


public boolean a__Boolean(net.minecraft.world.World p0, java.util.Random p1, moom.G2 p2) {
int lexicalValue767_903_0;
    int lexicalValue767_1081_0;
    net.minecraft.entity.Entity[] spill767_0;
    int spill767_1;
    boolean spill767_2;
    long life4_3;
    net.minecraft.entity.Entity[] life6_78;
    int life7_339;
    int life7_652;
    int life7_861;
    int life8_872;
    int life7_912;
    int life8_919;
    moom.DT life7_1080;
    lexical_join_1081: {
    lexical_join_1080: {
    lexical_join_1038: {
    lexical_join_950: {
    lexical_join_903: {
    lexical_join_902: {
    lexical_join_854: {
    lexical_join_716: {
    lexical_join_648: {
    lexical_join_588: {
    life4_3 = (moom.Hn.f ^ 64789686483090L);
    ((moom.Hn)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(3)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic767_1(11194, (4884032274855248130L ^ life4_3)))), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic767_2(15694, (785862961997633520L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    spill767_0 = moom.G4.b();
    ((moom.Hn)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(5)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic767_9(15694, (785862961997633520L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic767_10(11049, (4315973933131547027L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic767_11(15694, (785862961997633520L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((boolean)(false)));
    ((moom.Hn)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(5)), ((int)(0)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic767_17(15694, (785862961997633520L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic767_18(15694, (785862961997633520L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    life6_78 = spill767_0;
    ((moom.Hn)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic767_24(9132, (489457423174420767L ^ life4_3)))), ((int)(5)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic767_25(15694, (785862961997633520L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic767_26(15694, (785862961997633520L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic767_27(15694, (785862961997633520L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    ((moom.Hn)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(2)), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic767_33(6388, (3164375399800009296L ^ life4_3)))), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic767_34(15694, (785862961997633520L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic767_35(15694, (785862961997633520L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    ((moom.Hn)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic767_41(30497, (2630714208395664772L ^ life4_3)))), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic767_42(6388, (3164375399800009296L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic767_43(1507, (9198807900059332421L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic767_44(15694, (785862961997633520L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic767_45(15694, (785862961997633520L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    ((moom.Hn)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic767_51(28323, (2032487900864676895L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic767_52(6388, (3164375399800009296L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic767_53(2031, (729400456312843614L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic767_54(15694, (785862961997633520L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic767_55(15694, (785862961997633520L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    ((moom.Hn)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(2)), ((int)(5)), ((int)(0)), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic767_61(15694, (785862961997633520L ^ life4_3)))), ((int)(1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    ((moom.Hn)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic767_67(24512, (5872944236260111743L ^ life4_3)))), ((int)(5)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic767_68(13846, (2349691172250705060L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic767_69(15694, (785862961997633520L ^ life4_3)))), ((int)(1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    ((moom.Hn)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic767_75(18199, (1247087636588539298L ^ life4_3)))), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic767_76(19826, (102366326602475467L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic767_77(15694, (785862961997633520L ^ life4_3)))), ((int)(1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    ((moom.Hn)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic767_83(6388, (3164375399800009296L ^ life4_3)))), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic767_84(13846, (2349691172250705060L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic767_85(15694, (785862961997633520L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic767_86(13846, (2349691172250705060L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    ((moom.Hn)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic767_92(24512, (5872944236260111743L ^ life4_3)))), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic767_93(19826, (102366326602475467L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic767_94(24512, (5872944236260111743L ^ life4_3)))), ((int)(0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bo)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bo)).a__fE())), ((boolean)(false)));
    life7_339 = 1;
    lexical_cycle_340: while (true) {
    if (!((life7_339 <= __sourceIntrinsic_5ac1d031d896_invokedynamic767_100(6388, (3164375399800009296L ^ life4_3))))) {
        break lexical_join_588;
    }
    ((moom.Hn)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(life7_339)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic767_101(13846, (2349691172250705060L ^ life4_3)))), ((int)(0)), ((int)(life7_339)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic767_102(6388, (3164375399800009296L ^ life4_3)))), ((int)(0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bo)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bo)).a__fE())), ((boolean)(false)));
    ((moom.Hn)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(life7_339)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic767_108(13846, (2349691172250705060L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic767_109(15694, (785862961997633520L ^ life4_3)))), ((int)(life7_339)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic767_110(6388, (3164375399800009296L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic767_111(15694, (785862961997633520L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bo)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bo)).a__fE())), ((boolean)(false)));
    ((moom.Hn)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic767_117(13846, (2349691172250705060L ^ life4_3)))), ((int)(life7_339)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic767_118(6388, (3164375399800009296L ^ life4_3)))), ((int)(life7_339)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bo)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bo)).a__fE())), ((boolean)(false)));
    ((moom.Hn)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic767_124(15694, (785862961997633520L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic767_125(13846, (2349691172250705060L ^ life4_3)))), ((int)(life7_339)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic767_126(15694, (785862961997633520L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic767_127(6388, (3164375399800009296L ^ life4_3)))), ((int)(life7_339)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bo)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bo)).a__fE())), ((boolean)(false)));
    ((moom.Hn)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((int)(life7_339)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic767_135(11049, (4315973933131547027L ^ life4_3)))), ((int)(0)), ((moom.G2)(p2)));
    ((moom.Hn)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((int)(life7_339)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic767_139(11049, (4315973933131547027L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic767_140(15694, (785862961997633520L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.Hn)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic767_144(11049, (4315973933131547027L ^ life4_3)))), ((int)(life7_339)), ((moom.G2)(p2)));
    ((moom.Hn)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic767_148(15694, (785862961997633520L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic767_149(11049, (4315973933131547027L ^ life4_3)))), ((int)(life7_339)), ((moom.G2)(p2)));
    ((moom.Hn)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bo)).a__fE())), ((int)((life7_339 + 1))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic767_153(11049, (4315973933131547027L ^ life4_3)))), ((int)(0)), ((moom.G2)(p2)));
    ((moom.Hn)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bo)).a__fE())), ((int)((life7_339 + 1))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic767_157(11049, (4315973933131547027L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic767_158(15694, (785862961997633520L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.Hn)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bo)).a__fE())), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic767_162(11049, (4315973933131547027L ^ life4_3)))), ((int)((life7_339 + 1))), ((moom.G2)(p2)));
    ((moom.Hn)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bo)).a__fE())), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic767_166(15694, (785862961997633520L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic767_167(11049, (4315973933131547027L ^ life4_3)))), ((int)((life7_339 + 1))), ((moom.G2)(p2)));
    life7_339 += 2;
    if (!((life6_78 != null))) {
        break lexical_join_648;
    }
    if (!((life6_78 == null))) { continue lexical_cycle_340; }
    break lexical_cycle_340;
    }
    }
    ((moom.Hn)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bo)).a__fE())), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic767_171(11049, (4315973933131547027L ^ life4_3)))), ((int)(0)), ((moom.G2)(p2)));
    ((moom.Hn)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bo)).a__fE())), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic767_175(11049, (4315973933131547027L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic767_176(15694, (785862961997633520L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.Hn)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bo)).a__fE())), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic767_180(11049, (4315973933131547027L ^ life4_3)))), ((int)(0)), ((moom.G2)(p2)));
    ((moom.Hn)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bo)).a__fE())), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic767_184(15694, (785862961997633520L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic767_185(11049, (4315973933131547027L ^ life4_3)))), ((int)(0)), ((moom.G2)(p2)));
    }
    life7_652 = 3;
    lexical_cycle_650: while (true) {
    if (!((life7_652 <= __sourceIntrinsic_5ac1d031d896_invokedynamic767_187(18199, (1247087636588539298L ^ life4_3))))) {
        break lexical_join_716;
    }
    ((moom.Hn)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic767_188(19826, (102366326602475467L ^ life4_3)))), ((int)(life7_652)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic767_189(24512, (5872944236260111743L ^ life4_3)))), ((int)(life7_652)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bo)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bo)).a__fE())), ((boolean)(false)));
    ((moom.Hn)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic767_195(6388, (3164375399800009296L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic767_196(19826, (102366326602475467L ^ life4_3)))), ((int)(life7_652)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic767_197(6388, (3164375399800009296L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic767_198(24512, (5872944236260111743L ^ life4_3)))), ((int)(life7_652)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bo)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bo)).a__fE())), ((boolean)(false)));
    life7_652 += 2;
    if (!((life6_78 != null))) {
        break lexical_join_854;
    }
    if (!((life6_78 == null))) { continue lexical_cycle_650; }
    break lexical_cycle_650;
    }
    }
    ((moom.Hn)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(4)), ((int)(2)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic767_204(24512, (5872944236260111743L ^ life4_3)))), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic767_205(15694, (785862961997633520L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    ((moom.Hn)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(2)), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic767_211(15694, (785862961997633520L ^ life4_3)))), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic767_212(24512, (5872944236260111743L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    ((moom.Hn)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(4)), ((int)(0)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic767_218(24512, (5872944236260111743L ^ life4_3)))), ((int)(1)), ((int)(3)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    ((moom.Hn)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(4)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic767_224(18199, (1247087636588539298L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic767_225(24512, (5872944236260111743L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic767_226(15694, (785862961997633520L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    ((moom.Hn)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(0)), ((int)(4)), ((int)(3)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic767_232(24512, (5872944236260111743L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    ((moom.Hn)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic767_238(18199, (1247087636588539298L ^ life4_3)))), ((int)(0)), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic767_239(15694, (785862961997633520L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic767_240(24512, (5872944236260111743L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    }
    life7_861 = 4;
    lexical_cycle_856: while (true) {
    lexical_join_900: {
    lexical_join_899: {
    if (!((life7_861 <= __sourceIntrinsic_5ac1d031d896_invokedynamic767_246(24512, (5872944236260111743L ^ life4_3))))) {
        break lexical_join_902;
    }
    spill767_1 = 0;
    if (!((life6_78 != null))) {
        lexicalValue767_903_0 = spill767_1;
        break lexical_join_903;
    }
    life8_872 = spill767_1;
    lexical_cycle_867: while (true) {
    if (!((life8_872 <= 2))) {
        break lexical_join_899;
    }
    ((moom.Hn)(this)).b(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((int)(life7_861)), ((int)(-1)), ((int)(life8_872)), ((moom.G2)(p2)));
    ((moom.Hn)(this)).b(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((int)(life7_861)), ((int)(-1)), ((int)((__sourceIntrinsic_5ac1d031d896_invokedynamic767_252(15694, (785862961997633520L ^ life4_3)) - life8_872))), ((moom.G2)(p2)));
    life8_872 += 1;
    if (!((life6_78 != null))) {
        break lexical_join_900;
    }
    if (!((life6_78 == null))) { continue lexical_cycle_867; }
    break lexical_cycle_867;
    }
    }
    life7_861 += 1;
    }
    if (!((life6_78 == null))) { continue lexical_cycle_856; }
    break lexical_cycle_856;
    }
    }
    lexicalValue767_903_0 = 0;
    }
    life7_912 = lexicalValue767_903_0;
    lexical_cycle_904: while (true) {
    lexical_join_948: {
    lexical_join_947: {
    if (!((life7_912 <= 2))) {
        break lexical_join_950;
    }
    if (!((life6_78 != null))) {
        break lexical_join_1038;
    }
    life8_919 = 4;
    lexical_cycle_911: while (true) {
    if (!((life8_919 <= __sourceIntrinsic_5ac1d031d896_invokedynamic767_254(24512, (5872944236260111743L ^ life4_3))))) {
        break lexical_join_947;
    }
    ((moom.Hn)(this)).b(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((int)(life7_912)), ((int)(-1)), ((int)(life8_919)), ((moom.G2)(p2)));
    ((moom.Hn)(this)).b(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((int)((__sourceIntrinsic_5ac1d031d896_invokedynamic767_260(15694, (785862961997633520L ^ life4_3)) - life7_912))), ((int)(-1)), ((int)(life8_919)), ((moom.G2)(p2)));
    life8_919 += 1;
    if (!((life6_78 != null))) {
        break lexical_join_948;
    }
    if (!((life6_78 == null))) { continue lexical_cycle_911; }
    break lexical_cycle_911;
    }
    }
    life7_912 += 1;
    }
    if (!((life6_78 == null))) { continue lexical_cycle_904; }
    break lexical_cycle_904;
    }
    }
    ((moom.Hn)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(5)), ((int)(5)), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic767_262(19826, (102366326602475467L ^ life4_3)))), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic767_263(19826, (102366326602475467L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    ((moom.Hn)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic767_269(30851, (3816161107699372600L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic767_270(13761, (751567939075465077L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic767_271(13761, (751567939075465077L ^ life4_3)))), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic767_272(13761, (751567939075465077L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((boolean)(false)));
    ((moom.Hn)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic767_280(13761, (751567939075465077L ^ life4_3)))), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic767_281(13761, (751567939075465077L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.Hn)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((moom.dM)(net.minecraft.init.Blocks.k)).a__fE())), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic767_285(13761, (751567939075465077L ^ life4_3)))), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic767_286(13761, (751567939075465077L ^ life4_3)))), ((moom.G2)(p2)));
    }
    life7_1080 = new moom.DT(((moom.Hn)(this)).a(((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic767_288(13761, (751567939075465077L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic767_289(13761, (751567939075465077L ^ life4_3))))), ((moom.Hn)(this)).a(((int)(5))), ((moom.Hn)(this)).b(((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic767_292(13761, (751567939075465077L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic767_293(13761, (751567939075465077L ^ life4_3))))));
    spill767_2 = ((moom.G2)(p2)).a(((moom.DS)(life7_1080)));
    if (!((life6_78 != null))) {
        lexicalValue767_1081_0 = ((spill767_2) ? 1 : 0);
        break lexical_join_1081;
    }
    if (!(spill767_2)) {
        break lexical_join_1080;
    }
    ((net.minecraft.world.World)(p0)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.k)), ((moom.DT)(life7_1080)), ((java.util.Random)(p1)));
    }
    lexicalValue767_1081_0 = 1;
    }
    return ((lexicalValue767_1081_0) != 0);
}


private static native <E extends Throwable> int __sourceIntrinsic_1d76b51c4730_invokedynamic2145_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1d76b51c4730_invokedynamic2145_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1d76b51c4730_invokedynamic2145_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1d76b51c4730_invokedynamic2145_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1d76b51c4730_invokedynamic2145_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_27(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_33(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_34(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_35(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_41(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_42(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_43(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_44(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_45(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_51(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_52(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_53(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_54(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_55(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_61(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_67(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_68(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_69(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_75(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_76(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_77(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_83(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_84(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_85(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_86(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_92(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_93(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_94(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_100(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_101(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_102(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_108(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_109(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_110(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_111(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_117(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_118(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_124(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_125(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_126(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_127(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_135(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_139(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_140(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_144(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_148(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_149(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_153(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_157(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_158(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_162(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_166(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_167(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_171(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_175(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_176(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_180(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_184(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_185(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_187(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_188(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_189(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_195(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_196(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_197(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_198(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_204(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_205(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_211(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_212(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_218(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_224(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_225(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_226(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_232(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_238(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_239(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_240(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_246(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_252(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_254(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_260(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_262(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_263(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_269(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_270(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_271(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_272(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_280(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_281(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_285(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_286(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_288(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_289(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_292(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic767_293(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4852_0() throws E;
}
