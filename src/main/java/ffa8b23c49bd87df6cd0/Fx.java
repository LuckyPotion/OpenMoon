package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Fx implements moom.Fn {

private static final java.util.List<net.minecraft.block.state.IBlockState> a;

private static final int b;

private static final int c;

private final net.minecraft.world.World d;

private static final long e;

private static final long[] f;

private static final java.lang.Integer[] g;

private static final java.util.Map h;

public Fx(net.minecraft.world.World p0) {
super();
    this.d = p0;
}


static {
e = ((long)(((moom._a)(moom._c.a(((long)(6586499106895180508L)), ((long)(4512545604623688448L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(150560072439464L)))));
    h = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.Fx.e ^ 106984799217550L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill765_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill765_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill765_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill765_14 = new byte[8];
    (__sourceSpill765_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill765_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation765_16 = __sourceSpill765_14;
    ((javax.crypto.Cipher)(__sourceSpill765_11)).init(((int)(__sourceSpill765_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill765_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation765_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[4];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "Â\003\020ð½Ø£\004Ç{ä\006ZR"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill765_25 = local6_life21;
        int __sourceSpill765_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill765_25)).substring(((int)(__sourceSpill765_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill765_30 = local8_life19;
        int __sourceSpill765_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill765_33 = new byte[8];
        (__sourceSpill765_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill765_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill765_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill765_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill765_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill765_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill765_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill765_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill765_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill765_34)).doFinal(((byte[])(__sourceSpill765_33)));
        (__sourceSpill765_30)[__sourceSpill765_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "å@Ú/¬v}¼#×\b«\024h"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill765_38 = local6_life21;
        int __sourceSpill765_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill765_38)).substring(((int)(__sourceSpill765_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill765_43 = local8_life19;
        int __sourceSpill765_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill765_46 = new byte[8];
        (__sourceSpill765_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill765_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill765_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill765_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill765_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill765_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill765_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill765_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill765_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill765_47)).doFinal(((byte[])(__sourceSpill765_46)));
        (__sourceSpill765_43)[__sourceSpill765_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    f = ((long[])(local8_life19));
    g = ((java.lang.Integer[])(new java.lang.Integer[4]));
    a = ((java.util.List)(com.google.common.collect.Lists.newArrayList()));
    java.util.Iterator local13_life56 = ((moom.DC)(net.minecraft.block.Block.b)).iterator();
    while (((java.util.Iterator)(local13_life56)).hasNext()) {
        net.minecraft.block.Block local14_life60 = ((net.minecraft.block.Block)(((java.util.Iterator)(local13_life56)).next()));
        ((java.util.List)(moom.Fx.a)).addAll(((java.util.Collection)(((moom.fA)(((net.minecraft.block.Block)(local14_life60)).b__fA())).a())));
    }
    b = ((int)(moom.Dr.b__Int(((float)(moom.Dr.c(((float)(((float) ((java.util.List)(moom.Fx.a)).size())))))))));
    c = ((int)(moom.Dr.b__Int(((float)((((float) ((java.util.List)(moom.Fx.a)).size()) / ((float) moom.Fx.b)))))));
}


public boolean b__Boolean() {
return ((1) != 0);
}


public void a(net.minecraft.world.chunk.Chunk p0, int p1, int p2) {
return;
}


public java.util.List<moom.D7> a(net.minecraft.entity.EnumCreatureType p0, moom.DT p1) {
java.lang.Object local3 = ((net.minecraft.world.World)(this.d)).a__ES(((moom.DT)(p1)));
    return ((net.minecraft.world.biome.BiomeGenBase)(local3)).a(((net.minecraft.entity.EnumCreatureType)(p0)));
}


public int a() {
return 0;
}


public moom.DT a(net.minecraft.world.World p0, java.lang.String p1, moom.DT p2) {
return null;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral4574_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Fx"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.Fx.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x2DB7;
        if (g[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = f[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])h.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    h.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/Fx", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Fx.g[n2] = n3;
        }
        return g[n2];
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public net.minecraft.world.chunk.Chunk a(moom.DT p0) {
return this.a(((int)((((moom.DT)(p0)).a() >> 4))), ((int)((((moom.DT)(p0)).c() >> 4))));
}


public boolean a(moom.Fn p0, net.minecraft.world.chunk.Chunk p1, int p2, int p3) {
return ((0) != 0);
}


public void a(moom.Fn p0, int p1, int p2) {
return;
}


public boolean a__Boolean(int p0, int p1) {
return ((1) != 0);
}


public static net.minecraft.block.state.IBlockState a__fE(int p0, int p1) {
int forwardValue1956_13_0;
    int forwardValue1956_19_0;
    int forwardValue1956_25_0;
    int forwardValue1956_37_0;
    int forwardValue1956_43_0;
    int forwardValue1956_43_1;
    int forwardValue1956_50_0;
    int forwardValue1956_50_1;
    java.lang.String[] spill1956_0;
    int spill1956_1;
    int spill1956_2;
    long life2_3;
    net.minecraft.block.state.IBlockState life5_6;
    java.lang.String[] life4_7;
    int life6_82;
    forward_join_62: {
    forward_join_50: {
    forward_join_43: {
    forward_join_37: {
    forward_join_25: {
    forward_join_19: {
    forward_join_13: {
    life2_3 = (moom.Fx.e ^ 13731010743272L);
    spill1956_0 = moom.FI.b();
    life5_6 = null;
    life4_7 = spill1956_0;
    spill1956_1 = p0;
    if (!((life4_7 != null))) {
        forwardValue1956_13_0 = spill1956_1;
        break forward_join_13;
    }
    if (!((spill1956_1 > 0))) {
        break forward_join_62;
    }
    forwardValue1956_13_0 = p1;
    }
    if (!((life4_7 != null))) {
        forwardValue1956_19_0 = forwardValue1956_13_0;
        break forward_join_19;
    }
    if (!((forwardValue1956_13_0 > 0))) {
        break forward_join_62;
    }
    forwardValue1956_19_0 = (p0 % 2);
    }
    if (!((life4_7 != null))) {
        forwardValue1956_25_0 = forwardValue1956_19_0;
        break forward_join_25;
    }
    if (!((forwardValue1956_19_0 != 0))) {
        break forward_join_62;
    }
    forwardValue1956_25_0 = (p1 % 2);
    }
    if (!((life4_7 != null))) {
        forwardValue1956_37_0 = forwardValue1956_25_0;
        break forward_join_37;
    }
    if (!((forwardValue1956_25_0 != 0))) {
        break forward_join_62;
    }
    p0 = (p0 / 2);
    p1 = (p1 / 2);
    forwardValue1956_37_0 = p0;
    }
    spill1956_2 = moom.Fx.b;
    if (!((life4_7 != null))) {
        forwardValue1956_43_0 = forwardValue1956_37_0;
        forwardValue1956_43_1 = spill1956_2;
        break forward_join_43;
    }
    if (!((forwardValue1956_37_0 <= spill1956_2))) {
        break forward_join_62;
    }
    forwardValue1956_43_0 = p1;
    forwardValue1956_43_1 = moom.Fx.c;
    }
    if (!((life4_7 != null))) {
        forwardValue1956_50_0 = forwardValue1956_43_0;
        forwardValue1956_50_1 = forwardValue1956_43_1;
        break forward_join_50;
    }
    if (!((forwardValue1956_43_0 <= forwardValue1956_43_1))) {
        break forward_join_62;
    }
    forwardValue1956_50_0 = (p0 * moom.Fx.b);
    forwardValue1956_50_1 = p1;
    }
    life6_82 = moom.Dr.a(((int)((forwardValue1956_50_0 + forwardValue1956_50_1))));
    if (!((life6_82 < ((java.util.List)(moom.Fx.a)).size()))) {
        break forward_join_62;
    }
    life5_6 = ((net.minecraft.block.state.IBlockState)(((java.util.List)(moom.Fx.a)).get(((int)(life6_82)))));
    }
    return life5_6;
}


public net.minecraft.world.chunk.Chunk a(int p0, int p1) {
java.lang.String[] spill660_0;
    long life3_3;
    moom.Fm life6_7;
    int life7_10;
    java.lang.String[] life5_11;
    int life8_20;
    int life9_37;
    int life10_47;
    net.minecraft.block.state.IBlockState life11_62;
    net.minecraft.world.chunk.Chunk life7_102;
    net.minecraft.world.biome.BiomeGenBase[] life8_134;
    byte[] life9_137;
    int life10_139;
    lexical_join_150: {
    lexical_join_148: {
    lexical_join_85: {
    life3_3 = (moom.Fx.e ^ 101408205740769L);
    life6_7 = new moom.Fm();
    spill660_0 = moom.FI.b();
    life7_10 = 0;
    life5_11 = spill660_0;
    lexical_cycle_12: while (true) {
    lexical_join_83: {
    lexical_join_82: {
    if (!((life7_10 < __sourceIntrinsic_a55be857de7c_invokedynamic660_2(3860, (3427112892406226914L ^ life3_3))))) {
        break lexical_join_85;
    }
    life8_20 = 0;
    lexical_cycle_21: while (true) {
    lexical_join_80: {
    lexical_join_79: {
    if (!((life8_20 < __sourceIntrinsic_a55be857de7c_invokedynamic660_3(29162, (1197585715324363039L ^ life3_3))))) {
        break lexical_join_82;
    }
    life9_37 = ((p0 * __sourceIntrinsic_a55be857de7c_invokedynamic660_4(29162, (1197585715324363039L ^ life3_3))) + life7_10);
    life10_47 = ((p1 * __sourceIntrinsic_a55be857de7c_invokedynamic660_5(29162, (1197585715324363039L ^ life3_3))) + life8_20);
    ((moom.Fm)(life6_7)).a(((int)(life7_10)), ((int)(__sourceIntrinsic_a55be857de7c_invokedynamic660_6(2992, (8834764208882932551L ^ life3_3)))), ((int)(life8_20)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b_)).a__fE())));
    life11_62 = moom.Fx.a__fE(((int)(life9_37)), ((int)(life10_47)));
    if (!((life5_11 != null))) {
        break lexical_join_83;
    }
    if (!((life5_11 != null))) {
        break lexical_join_80;
    }
    if (!((life11_62 != null))) {
        break lexical_join_79;
    }
    ((moom.Fm)(life6_7)).a(((int)(life7_10)), ((int)(__sourceIntrinsic_a55be857de7c_invokedynamic660_11(8785, (5927896752888148645L ^ life3_3)))), ((int)(life8_20)), ((net.minecraft.block.state.IBlockState)(life11_62)));
    }
    life8_20 += 1;
    }
    if (!((life5_11 == null))) { continue lexical_cycle_21; }
    break lexical_cycle_21;
    }
    }
    life7_10 += 1;
    }
    if (!((life5_11 == null))) { continue lexical_cycle_12; }
    break lexical_cycle_12;
    }
    }
    life7_102 = new net.minecraft.world.chunk.Chunk(this.d, life6_7, p0, p1);
    ((net.minecraft.world.chunk.Chunk)(life7_102)).b__Void();
    life8_134 = ((net.minecraft.world.biome.WorldChunkManager)(((net.minecraft.world.World)(this.d)).a__Ff())).b(((net.minecraft.world.biome.BiomeGenBase[])(null)), ((int)((p0 * __sourceIntrinsic_a55be857de7c_invokedynamic660_17(29162, (1197585715324363039L ^ life3_3))))), ((int)((p1 * __sourceIntrinsic_a55be857de7c_invokedynamic660_18(29162, (1197585715324363039L ^ life3_3))))), ((int)(__sourceIntrinsic_a55be857de7c_invokedynamic660_19(29162, (1197585715324363039L ^ life3_3)))), ((int)(__sourceIntrinsic_a55be857de7c_invokedynamic660_20(29162, (1197585715324363039L ^ life3_3)))));
    life9_137 = ((net.minecraft.world.chunk.Chunk)(life7_102)).a__ArrayByte();
    life10_139 = 0;
    lexical_cycle_131: while (true) {
    if (!((life10_139 < (life9_137).length))) {
        break lexical_join_148;
    }
    (life9_137)[life10_139] = ((byte) ((net.minecraft.world.biome.BiomeGenBase)((life8_134)[life10_139])).aB);
    life10_139 += 1;
    if (!((life5_11 != null))) {
        break lexical_join_150;
    }
    if (!((life5_11 == null))) { continue lexical_cycle_131; }
    break lexical_cycle_131;
    }
    }
    ((net.minecraft.world.chunk.Chunk)(life7_102)).b__Void();
    }
    return life7_102;
}


public java.lang.String a__String() {
return "DebugLevelSource";
}


public boolean a__Boolean() {
return ((0) != 0);
}


public void a__Void() {
return;
}


public boolean a(boolean p0, net.minecraft.util.IProgressUpdate p1) {
return ((1) != 0);
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral4574_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a55be857de7c_invokedynamic660_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a55be857de7c_invokedynamic660_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a55be857de7c_invokedynamic660_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a55be857de7c_invokedynamic660_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a55be857de7c_invokedynamic660_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a55be857de7c_invokedynamic660_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a55be857de7c_invokedynamic660_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a55be857de7c_invokedynamic660_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a55be857de7c_invokedynamic660_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a55be857de7c_invokedynamic660_20(int a0, long a1) throws E;
}
