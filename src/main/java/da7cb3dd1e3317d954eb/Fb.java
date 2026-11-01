package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Fb extends net.minecraft.world.biome.BiomeGenBase {

private static final long cb;

private static final long[] gb;

private static final java.lang.Integer[] hb;

private static final java.util.Map ib;

protected Fb(int p0) {
super(((int)(p0)));
    ((moom.EQ)(((moom.Fb)(this)).au)).A = ((int)(2));
    ((moom.EQ)(((moom.Fb)(this)).au)).B = ((int)(1));
    ((moom.EQ)(((moom.Fb)(this)).au)).D = ((int)(1));
    ((moom.EQ)(((moom.Fb)(this)).au)).E = ((int)(8));
    ((moom.EQ)(((moom.Fb)(this)).au)).F = ((int)(10));
    ((moom.EQ)(((moom.Fb)(this)).au)).J = ((int)(1));
    ((moom.EQ)(((moom.Fb)(this)).au)).z = ((int)(4));
    ((moom.EQ)(((moom.Fb)(this)).au)).I = ((int)(0));
    ((moom.EQ)(((moom.Fb)(this)).au)).H = ((int)(0));
    ((moom.EQ)(((moom.Fb)(this)).au)).C = ((int)(5));
    ((moom.Fb)(this)).at = ((int)(14745518));
    ((java.util.List)(((moom.Fb)(this)).av)).add(((java.lang.Object)(new moom.D7(net.minecraft.entity.monster.EntitySlime.class, 1, 1, 1))));
    return;
}


static {
cb = ((long)(((moom._a)(moom._c.a(((long)(-1919156771322685152L)), ((long)(-5982632842171710823L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(102317057721972L)))));
    ib = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.Fb.cb ^ 110269929938688L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill755_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill755_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill755_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill755_14 = new byte[8];
    (__sourceSpill755_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill755_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation755_16 = __sourceSpill755_14;
    ((javax.crypto.Cipher)(__sourceSpill755_11)).init(((int)(__sourceSpill755_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill755_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation755_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[7];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "Úòh\002áºÍ\022Ý:u\023Iä¹­\tÖnß×i½4¢óT°\013Ë5º>\0347"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill755_25 = local6_life21;
        int __sourceSpill755_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill755_25)).substring(((int)(__sourceSpill755_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill755_30 = local8_life19;
        int __sourceSpill755_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill755_33 = new byte[8];
        (__sourceSpill755_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill755_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill755_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill755_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill755_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill755_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill755_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill755_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill755_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill755_34)).doFinal(((byte[])(__sourceSpill755_33)));
        (__sourceSpill755_30)[__sourceSpill755_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "D!ÛL»ÒÑzÑ¨³À´"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill755_38 = local6_life21;
        int __sourceSpill755_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill755_38)).substring(((int)(__sourceSpill755_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill755_43 = local8_life19;
        int __sourceSpill755_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill755_46 = new byte[8];
        (__sourceSpill755_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill755_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill755_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill755_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill755_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill755_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill755_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill755_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill755_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill755_47)).doFinal(((byte[])(__sourceSpill755_46)));
        (__sourceSpill755_43)[__sourceSpill755_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    gb = ((long[])(local8_life19));
    hb = ((java.lang.Integer[])(new java.lang.Integer[7]));
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4528_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Fb"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x33E3;
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
                throw new RuntimeException("moom/Fb", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Fb.hb[n2] = n3;
        }
        return hb[n2];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.Fb.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public int b(moom.DT p0) {
long local2 = (moom.Fb.cb ^ 45187556875857L);
    return __sourceIntrinsic_3bdbffc242b6_originalDynamicSite1149_1(16507, (3482356465528197002L ^ local2));
}


public int a__Int(moom.DT p0) {
int forwardValue1934_30_0;
    int forwardValue1934_36_0;
    java.lang.String spill1934_0;
    int spill1934_1;
    long life2_3;
    double life5_17;
    java.lang.String life4_18;
    forward_join_36: {
    forward_join_31: {
    forward_join_30: {
    life2_3 = (moom.Fb.cb ^ 21249295451640L);
    spill1934_0 = net.minecraft.world.biome.WorldChunkManager.b();
    life5_17 = ((moom.FW)(moom.Fb.ah)).a(((double)((((double) ((moom.DT)(p0)).a()) * 0x1.70a3d70a3d70ap-6d))), ((double)((((double) ((moom.DT)(p0)).c()) * 0x1.70a3d70a3d70ap-6d))));
    life4_18 = spill1934_0;
    spill1934_1 = recovery.source.CarrierOps.dcmpg(((double)(life5_17)), ((double)(-0x1.999999999999ap-4d)));
    if (!((life4_18 == null))) {
        forwardValue1934_30_0 = spill1934_1;
        break forward_join_30;
    }
    if (!((spill1934_1 < 0))) {
        break forward_join_31;
    }
    forwardValue1934_30_0 = __sourceIntrinsic_798dc89b6a8c_invokedynamic1934_7(23807, (7843018309879968L ^ life2_3));
    }
    forwardValue1934_36_0 = forwardValue1934_30_0;
    break forward_join_36;
    }
    forwardValue1934_36_0 = __sourceIntrinsic_798dc89b6a8c_invokedynamic1934_8(32262, (4835146374034057820L ^ life2_3));
    }
    return forwardValue1934_36_0;
}


public moom.F0 a(java.util.Random p0) {
return ((moom.Fb)(this)).aE;
}


public void a(net.minecraft.world.World p0, java.util.Random p1, moom.Fm p2, int p3, int p4, double p5) {
moom.Fm lexicalValue656_79_0;
    int lexicalValue656_79_1;
    int lexicalValue656_79_2;
    int lexicalValue656_79_3;
    java.lang.String spill656_0;
    moom.Fm spill656_1;
    int spill656_2;
    int spill656_3;
    int spill656_4;
    long life8_3;
    double life11_15;
    java.lang.String life10_16;
    int life13_33;
    int life14_41;
    int life15_47;
    lexical_join_110: {
    lexical_join_102: {
    life8_3 = (moom.Fb.cb ^ 139724921558784L);
    spill656_0 = net.minecraft.world.biome.WorldChunkManager.b();
    life11_15 = ((moom.FW)(moom.Fb.ah)).a(((double)((((double) p3) * 0x1.0p-2d))), ((double)((((double) p4) * 0x1.0p-2d))));
    life10_16 = spill656_0;
    if (!((life10_16 == null))) {
        break lexical_join_110;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(life11_15)), ((double)(0x0.0p0d))) > 0))) {
        break lexical_join_102;
    }
    life13_33 = (p3 & __sourceIntrinsic_d455e0af9aa3_invokedynamic656_5(5964, (5024046761767064047L ^ life8_3)));
    life14_41 = (p4 & __sourceIntrinsic_d455e0af9aa3_invokedynamic656_6(19850, (2027261920319540011L ^ life8_3)));
    life15_47 = __sourceIntrinsic_d455e0af9aa3_invokedynamic656_7(23337, (217519347398516111L ^ life8_3));
    lexical_cycle_45: while (true) {
    lexical_join_99: {
    lexical_join_79: {
    if (!((life15_47 >= 0))) {
        break lexical_join_102;
    }
    if (!((life10_16 == null))) {
        break lexical_join_110;
    }
    if (!((((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((moom.Fm)(p2)).a(((int)(life14_41)), ((int)(life15_47)), ((int)(life13_33))))).a__ch())).a__fn() != moom.fn.a))) {
        break lexical_join_99;
    }
    if (!((life15_47 == __sourceIntrinsic_d455e0af9aa3_invokedynamic656_12(4561, (3762557866703214453L ^ life8_3))))) {
        break lexical_join_102;
    }
    spill656_1 = p2;
    spill656_2 = life14_41;
    spill656_3 = life15_47;
    spill656_4 = life13_33;
    if (!((life10_16 == null))) {
        lexicalValue656_79_0 = spill656_1;
        lexicalValue656_79_1 = spill656_2;
        lexicalValue656_79_2 = spill656_3;
        lexicalValue656_79_3 = spill656_4;
        break lexical_join_79;
    }
    if (!((((net.minecraft.block.state.IBlockState)(((moom.Fm)(spill656_1)).a(((int)(spill656_2)), ((int)(spill656_3)), ((int)(spill656_4))))).a__ch() != net.minecraft.init.Blocks.j))) {
        break lexical_join_102;
    }
    lexicalValue656_79_0 = p2;
    lexicalValue656_79_1 = life14_41;
    lexicalValue656_79_2 = life15_47;
    lexicalValue656_79_3 = life13_33;
    }
    ((moom.Fm)(lexicalValue656_79_0)).a(((int)(lexicalValue656_79_1)), ((int)(lexicalValue656_79_2)), ((int)(lexicalValue656_79_3)), ((net.minecraft.block.state.IBlockState)(((moom.dN)(net.minecraft.init.Blocks.j)).a__fE())));
    if (!((life10_16 == null))) {
        break lexical_join_110;
    }
    if (!((recovery.source.CarrierOps.dcmpg(((double)(life11_15)), ((double)(0x1.eb851eb851eb8p-4d))) < 0))) {
        break lexical_join_102;
    }
    ((moom.Fm)(p2)).a(((int)(life14_41)), ((int)((life15_47 + 1))), ((int)(life13_33)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bm)).a__fE())));
    if (!((life10_16 != null))) {
        break lexical_join_102;
    }
    }
    life15_47 += -1;
    if (!((life10_16 != null))) { continue lexical_cycle_45; }
    break lexical_cycle_45;
    }
    }
    ((moom.Fb)(this)).b(((net.minecraft.world.World)(p0)), ((java.util.Random)(p1)), ((moom.Fm)(p2)), ((int)(p3)), ((int)(p4)), ((double)(p5)));
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public net.minecraft.block.BlockFlower$EnumFlowerType a(java.util.Random p0, moom.DT p1) {
return net.minecraft.block.BlockFlower$EnumFlowerType.BLUE_ORCHID;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4528_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3bdbffc242b6_originalDynamicSite1149_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_798dc89b6a8c_invokedynamic1934_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_798dc89b6a8c_invokedynamic1934_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d455e0af9aa3_invokedynamic656_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d455e0af9aa3_invokedynamic656_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d455e0af9aa3_invokedynamic656_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d455e0af9aa3_invokedynamic656_12(int a0, long a1) throws E;
}
