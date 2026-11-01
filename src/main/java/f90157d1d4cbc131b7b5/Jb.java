package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Jb {

private static final long a;

private static final java.lang.String[] b;

private static final java.lang.String[] c;

private static final java.util.Map d;

private static final long[] e;

private static final java.lang.Integer[] f;

private static final java.util.Map g;

public Jb() {
super();
}


static {
a = ((long)(((moom._a)(moom._c.a(((long)(8573839385443440472L)), ((long)(-6649014378587516416L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(192169674093020L)))));
    d = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (moom.Jb.a ^ 126906322014864L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill607_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill607_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill607_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill607_14 = new byte[8];
    (__sourceSpill607_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill607_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation607_16 = __sourceSpill607_14;
    ((javax.crypto.Cipher)(__sourceSpill607_11)).init(((int)(__sourceSpill607_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill607_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation607_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local20_life19 = new java.lang.String[5];
    int local18_life20 = 0;
    java.lang.String local17_life21;
    int local19_life23 = ((java.lang.String)((local17_life21 = ".\030ÕÊ<öÖoX3ûÄ4±9\020.ä¡9ÚC xZjµv\002\177ù\030×d$ê½n\001Eë;yBgìÃK]öì\033"))).length();
    int local16_life24 = 16;
    int local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill607_28 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill607_29 = local13_life9;
        byte[] local21_life31 = ((javax.crypto.Cipher)(__sourceSpill607_29)).doFinal(((byte[])(__sourceSpill607_28)));
        java.lang.String __sourceSpill607_34 = ((java.lang.String)(moom.Jb.a(((byte[])(local21_life31))))).intern();
        java.lang.String[] __sourceSpill607_35 = local20_life19;
        int __sourceSpill607_36 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill607_35)[__sourceSpill607_36] = __sourceSpill607_34;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    local19_life23 = ((java.lang.String)((local17_life21 = "EÇ½\022ÆÅÉ\027.vþx\t=¡óá.zCÕ\030Å\006Å\020Øáä\177\030ð@é(þâÜm7"))).length();
    local16_life24 = 32;
    local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill607_41 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill607_42 = local13_life9;
        byte[] local21_life44 = ((javax.crypto.Cipher)(__sourceSpill607_42)).doFinal(((byte[])(__sourceSpill607_41)));
        java.lang.String __sourceSpill607_47 = ((java.lang.String)(moom.Jb.a(((byte[])(local21_life44))))).intern();
        java.lang.String[] __sourceSpill607_48 = local20_life19;
        int __sourceSpill607_49 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill607_48)[__sourceSpill607_49] = __sourceSpill607_47;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    b = ((java.lang.String[])(local20_life19));
    c = ((java.lang.String[])(new java.lang.String[5]));
    g = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life55;
    javax.crypto.Cipher __sourceSpill607_57 = (local0_life55 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill607_58 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill607_59 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill607_60 = new byte[8];
    (__sourceSpill607_60)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life61 = 1;
    while ((local1_life61 < 8)) {
        (__sourceSpill607_60)[local1_life61] = ((byte) ((int) ((local11_life7 << (local1_life61 * 8)) >>> 56)));
        local1_life61 += 1;
    }
    byte[] __sourcePreallocation607_62 = __sourceSpill607_60;
    ((javax.crypto.Cipher)(__sourceSpill607_57)).init(((int)(__sourceSpill607_58)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill607_59)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation607_62)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life65 = new long[4];
    int local3_life66 = 0;
    java.lang.String local4_life67;
    int local5_life69 = ((java.lang.String)((local4_life67 = "x:¡4º±.\021ÿ\036»Ù"))).length();
    int local2_life70 = 0;
    do {
        java.lang.String __sourceSpill607_71 = local4_life67;
        int __sourceSpill607_72 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill607_71)).substring(((int)(__sourceSpill607_72)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill607_76 = local6_life65;
        int __sourceSpill607_77 = local3_life66;
        local3_life66 += 1;
        long local8_life78 = (((((((((((long) (local7_life75)[0]) & 255L) << 56) | ((((long) (local7_life75)[1]) & 255L) << 48)) | ((((long) (local7_life75)[2]) & 255L) << 40)) | ((((long) (local7_life75)[3]) & 255L) << 32)) | ((((long) (local7_life75)[4]) & 255L) << 24)) | ((((long) (local7_life75)[5]) & 255L) << 16)) | ((((long) (local7_life75)[6]) & 255L) << 8)) | (((long) (local7_life75)[7]) & 255L));
        byte[] __sourceSpill607_79 = new byte[8];
        (__sourceSpill607_79)[0] = ((byte) ((int) (local8_life78 >>> 56)));
        (__sourceSpill607_79)[1] = ((byte) ((int) (local8_life78 >>> 48)));
        (__sourceSpill607_79)[2] = ((byte) ((int) (local8_life78 >>> 40)));
        (__sourceSpill607_79)[3] = ((byte) ((int) (local8_life78 >>> 32)));
        (__sourceSpill607_79)[4] = ((byte) ((int) (local8_life78 >>> 24)));
        (__sourceSpill607_79)[5] = ((byte) ((int) (local8_life78 >>> 16)));
        (__sourceSpill607_79)[6] = ((byte) ((int) (local8_life78 >>> 8)));
        (__sourceSpill607_79)[7] = ((byte) ((int) local8_life78));
        javax.crypto.Cipher __sourceSpill607_80 = local0_life55;
        byte[] local10_life82 = ((javax.crypto.Cipher)(__sourceSpill607_80)).doFinal(((byte[])(__sourceSpill607_79)));
        (__sourceSpill607_76)[__sourceSpill607_77] = (((((((((((long) (local10_life82)[0]) & 255L) << 56) | ((((long) (local10_life82)[1]) & 255L) << 48)) | ((((long) (local10_life82)[2]) & 255L) << 40)) | ((((long) (local10_life82)[3]) & 255L) << 32)) | ((((long) (local10_life82)[4]) & 255L) << 24)) | ((((long) (local10_life82)[5]) & 255L) << 16)) | ((((long) (local10_life82)[6]) & 255L) << 8)) | (((long) (local10_life82)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    local5_life69 = ((java.lang.String)((local4_life67 = "úfÇßâèóÛú;\021°"))).length();
    local2_life70 = 0;
    do {
        java.lang.String __sourceSpill607_84 = local4_life67;
        int __sourceSpill607_85 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life88 = ((java.lang.String)(((java.lang.String)(__sourceSpill607_84)).substring(((int)(__sourceSpill607_85)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill607_89 = local6_life65;
        int __sourceSpill607_90 = local3_life66;
        local3_life66 += 1;
        long local8_life91 = (((((((((((long) (local7_life88)[0]) & 255L) << 56) | ((((long) (local7_life88)[1]) & 255L) << 48)) | ((((long) (local7_life88)[2]) & 255L) << 40)) | ((((long) (local7_life88)[3]) & 255L) << 32)) | ((((long) (local7_life88)[4]) & 255L) << 24)) | ((((long) (local7_life88)[5]) & 255L) << 16)) | ((((long) (local7_life88)[6]) & 255L) << 8)) | (((long) (local7_life88)[7]) & 255L));
        byte[] __sourceSpill607_92 = new byte[8];
        (__sourceSpill607_92)[0] = ((byte) ((int) (local8_life91 >>> 56)));
        (__sourceSpill607_92)[1] = ((byte) ((int) (local8_life91 >>> 48)));
        (__sourceSpill607_92)[2] = ((byte) ((int) (local8_life91 >>> 40)));
        (__sourceSpill607_92)[3] = ((byte) ((int) (local8_life91 >>> 32)));
        (__sourceSpill607_92)[4] = ((byte) ((int) (local8_life91 >>> 24)));
        (__sourceSpill607_92)[5] = ((byte) ((int) (local8_life91 >>> 16)));
        (__sourceSpill607_92)[6] = ((byte) ((int) (local8_life91 >>> 8)));
        (__sourceSpill607_92)[7] = ((byte) ((int) local8_life91));
        javax.crypto.Cipher __sourceSpill607_93 = local0_life55;
        byte[] local10_life95 = ((javax.crypto.Cipher)(__sourceSpill607_93)).doFinal(((byte[])(__sourceSpill607_92)));
        (__sourceSpill607_89)[__sourceSpill607_90] = (((((((((((long) (local10_life95)[0]) & 255L) << 56) | ((((long) (local10_life95)[1]) & 255L) << 48)) | ((((long) (local10_life95)[2]) & 255L) << 40)) | ((((long) (local10_life95)[3]) & 255L) << 32)) | ((((long) (local10_life95)[4]) & 255L) << 24)) | ((((long) (local10_life95)[5]) & 255L) << 16)) | ((((long) (local10_life95)[6]) & 255L) << 8)) | (((long) (local10_life95)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    e = ((long[])(local6_life65));
    f = ((java.lang.Integer[])(new java.lang.Integer[4]));
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.Jb.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int b(int p0, long p1) {
int n4 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x6C14;
        if (f[n4] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = e[n4];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])g.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    g.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/Jb", exception);
            }
            int n7 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Jb.f[n4] = n7;
        }
        return f[n4];
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral5235_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Jb"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.String a(int p0, long p1) {
int life5_8;
    java.lang.Long life3_16;
    java.lang.Object[] life4_21;
    byte[] life6_60;
    int life7_70;
    javax.crypto.spec.DESKeySpec life7_92;
    javax.crypto.SecretKey life8_99;
    byte[] life9_116;
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 14919);
    if (((moom.Jb.c)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.Jb.d)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.Jb.d)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/Jb", life9_51);
    }
        life6_60 = new byte[8];
        (life6_60)[0] = ((byte) ((int) (p1 >>> 56)));
        life7_70 = 1;
        loop_region_71: while ((life7_70 < 8)) {
        (life6_60)[life7_70] = ((byte) ((int) ((p1 << (life7_70 * 8)) >>> 56)));
        life7_70 += 1;
    }
        life7_92 = new javax.crypto.spec.DESKeySpec(life6_60);
        life8_99 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life4_21)[1])))).generateSecret(((java.security.spec.KeySpec)(life7_92)));
        ((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).init(((int)(2)), ((java.security.Key)(life8_99)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life4_21)[2])))));
        life9_116 = ((java.lang.String)((moom.Jb.b)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.Jb.c)[life5_8] = moom.Jb.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.Jb.c)[life5_8];
}


public static void a(net.minecraft.client.settings.GameSettings p0, net.minecraft.world.World p1) {
net.minecraft.world.World forestValue300_28_0;
    net.minecraft.entity.Entity forestValue300_40_0;
    int forestValue300_96_0;
    int forestValue300_103_0;
    moom.Fn forestValue300_117_0;
    int forestValue300_117_1;
    int forestValue300_117_2;
    int forestValue300_131_0;
    int forestValue300_169_0;
    int forestValue300_240_0;
    net.minecraft.world.World spill300_0;
    net.minecraft.entity.Entity spill300_1;
    int spill300_2;
    moom.Fn spill300_3;
    int spill300_4;
    int spill300_5;
    boolean spill300_6;
    int spill300_7;
    int spill300_8;
    int spill300_9;
    java.lang.String spill300_10;
    java.lang.String spill300_11;
    int spill300_12;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    int life5_9;
    moom.Fn life5_31;
    net.minecraft.entity.Entity life6_36;
    int life7_51;
    int life8_61;
    int life9_69;
    int life10_77;
    int life11_85;
    int life12_93;
    int life13_95;
    int life14_97;
    int life15_104;
    net.minecraft.world.chunk.Chunk life16_123;
    int life17_140;
    int life18_144;
    int life19_152;
    int life20_160;
    moom.DX life21_167;
    moom.DX life22_174;
    int life23_176;
    int life24_183;
    moom.DT life25_195;
    int life26_199;
    net.minecraft.block.state.IBlockState life27_212;
    java.lang.String life14_259;
    forest_join_277: {
    forest_join_255: {
    forest_join_240: {
    forest_join_239: {
    forest_join_40: {
    forest_join_28: {
    forest_join_23: {
    forest_join_20: {
    forest_join_17: {
    life2_3 = (moom.Jb.a ^ 17417995758410L);
    life4_5 = moom.JM.b__Arrayr3();
    if (!((p0 != null))) {
        break forest_join_23;
    }
    life5_9 = 3;
    if (!((life4_5 != null))) {
        break forest_join_20;
    }
    if (!(((net.minecraft.client.settings.GameSettings)(p0)).bw)) {
        break forest_join_17;
    }
    life5_9 = 1;
    }
    moom.ci.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.j)), ((int)(life5_9)));
    }
    moom.ci.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.i)), ((int)(life5_9)));
    }
    spill300_0 = p1;
    if (!((life4_5 != null))) {
        forestValue300_28_0 = spill300_0;
        break forest_join_28;
    }
    if (!((spill300_0 != null))) {
        break forest_join_277;
    }
    forestValue300_28_0 = p1;
    }
    life5_31 = ((net.minecraft.world.World)(forestValue300_28_0)).b__Fn();
    if (!((life5_31 != null))) {
        break forest_join_277;
    }
    life6_36 = ((net.minecraft.client.Minecraft)(moom.BU.a__fM())).a__r3();
    spill300_1 = life6_36;
    if (!((life4_5 != null))) {
        forestValue300_40_0 = spill300_1;
        break forest_join_40;
    }
    if (!((spill300_1 != null))) {
        break forest_join_277;
    }
    forestValue300_40_0 = life6_36;
    }
    life7_51 = (((int) ((net.minecraft.entity.Entity)(forestValue300_40_0)).n) / __sourceIntrinsic_60433ded056e_invokedynamic300_11(26941, (6237997045550779652L ^ life2_3)));
    life8_61 = (((int) ((net.minecraft.entity.Entity)(life6_36)).p) / __sourceIntrinsic_60433ded056e_invokedynamic300_13(1957, (3085935536129794975L ^ life2_3)));
    life9_69 = (life7_51 - __sourceIntrinsic_60433ded056e_invokedynamic300_14(27052, (3841658825260174740L ^ life2_3)));
    life10_77 = (life7_51 + __sourceIntrinsic_60433ded056e_invokedynamic300_15(3470, (7919851574442682805L ^ life2_3)));
    life11_85 = (life8_61 - __sourceIntrinsic_60433ded056e_invokedynamic300_16(3470, (7919851574442682805L ^ life2_3)));
    life12_93 = (life8_61 + __sourceIntrinsic_60433ded056e_invokedynamic300_17(3470, (7919851574442682805L ^ life2_3)));
    life13_95 = 0;
    life14_97 = life9_69;
    forest_cycle_95: while (true) {
    forest_join_236: {
    forestValue300_96_0 = life14_97;
    forest_cycle_96: while (true) {
    if (!((forestValue300_96_0 < life10_77))) {
        break forest_join_239;
    }
    spill300_2 = life11_85;
    if (!((life4_5 != null))) {
        forestValue300_240_0 = spill300_2;
        break forest_join_240;
    }
    life15_104 = spill300_2;
    forest_cycle_102: while (true) {
    forest_join_234: {
    forest_join_233: {
    forestValue300_103_0 = life15_104;
    forest_cycle_103: while (true) {
    forest_join_131: {
    forest_join_117: {
    if (!((forestValue300_103_0 < life12_93))) {
        break forest_join_236;
    }
    spill300_3 = life5_31;
    spill300_4 = life14_97;
    spill300_5 = life15_104;
    if (!((life4_5 != null))) {
        forestValue300_117_0 = spill300_3;
        forestValue300_117_1 = spill300_4;
        forestValue300_117_2 = spill300_5;
        break forest_join_117;
    }
    spill300_6 = ((moom.Fn)(spill300_3)).a__Boolean(((int)(spill300_4)), ((int)(spill300_5)));
    if (!((life4_5 != null))) {
        forestValue300_96_0 = ((spill300_6) ? 1 : 0);
        continue forest_cycle_96;
    }
    if (!(spill300_6)) {
        break forest_join_233;
    }
    forestValue300_117_0 = life5_31;
    forestValue300_117_1 = life14_97;
    forestValue300_117_2 = life15_104;
    }
    life16_123 = ((moom.Fn)(forestValue300_117_0)).a(((int)(forestValue300_117_1)), ((int)(forestValue300_117_2)));
    if (!((life4_5 != null))) {
        break forest_join_234;
    }
    if (!((life16_123 != null))) {
        break forest_join_233;
    }
    spill300_7 = ((life16_123 instanceof moom.Fl) ? 1 : 0);
    if (!((life4_5 != null))) {
        forestValue300_131_0 = spill300_7;
        break forest_join_131;
    }
    if (!((spill300_7 == 0))) {
        break forest_join_233;
    }
    forestValue300_131_0 = (life14_97 << 4);
    }
    life17_140 = forestValue300_131_0;
    life18_144 = (life15_104 << 4);
    life19_152 = (life17_140 + __sourceIntrinsic_60433ded056e_invokedynamic300_22(1957, (3085935536129794975L ^ life2_3)));
    life20_160 = (life18_144 + __sourceIntrinsic_60433ded056e_invokedynamic300_23(1957, (3085935536129794975L ^ life2_3)));
    life21_167 = new moom.DX(0, 0, 0);
    life22_174 = new moom.DX(0, 0, 0);
    life23_176 = life17_140;
    forest_cycle_168: while (true) {
    forest_join_230: {
    forestValue300_169_0 = life23_176;
    forest_cycle_169: while (true) {
    if (!((forestValue300_169_0 < life19_152))) {
        break forest_join_233;
    }
    spill300_8 = life18_144;
    if (!((life4_5 != null))) {
        forestValue300_103_0 = spill300_8;
        continue forest_cycle_103;
    }
    life24_183 = spill300_8;
    forest_cycle_175: while (true) {
    forest_join_228: {
    forest_join_227: {
    if (!((life24_183 < life20_160))) {
        break forest_join_230;
    }
    ((moom.DX)(life21_167)).a__Void(((int)(life23_176)), ((int)(0)), ((int)(life24_183)));
    life25_195 = ((net.minecraft.world.World)(p1)).b__DT(((moom.DT)(life21_167)));
    spill300_9 = 0;
    if (!((life4_5 != null))) {
        forestValue300_169_0 = spill300_9;
        continue forest_cycle_169;
    }
    life26_199 = spill300_9;
    forest_cycle_191: while (true) {
    forest_join_225: {
    forest_join_224: {
    if (!((life26_199 < ((moom.DT)(life25_195)).b()))) {
        break forest_join_227;
    }
    ((moom.DX)(life22_174)).a__Void(((int)(life23_176)), ((int)(life26_199)), ((int)(life24_183)));
    life27_212 = ((net.minecraft.world.World)(p1)).a__fE(((moom.DT)(life22_174)));
    if (!((life4_5 != null))) {
        break forest_join_228;
    }
    if (!((life4_5 != null))) {
        break forest_join_225;
    }
    if (!((((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(life27_212)).a__ch())).a__fn() == moom.fn.h))) {
        break forest_join_224;
    }
    ((net.minecraft.world.World)(p1)).a(((int)(life23_176)), ((int)(life24_183)), ((int)(((moom.DX)(life22_174)).b())), ((int)(((moom.DT)(life25_195)).b())));
    life13_95 += 1;
    if (!((life4_5 == null))) {
        break forest_join_227;
    }
    }
    life26_199 += 1;
    }
    if (!((life4_5 == null))) {
        continue forest_cycle_191;
    }
    break forest_cycle_191;
    }
    }
    life24_183 += 1;
    }
    if (!((life4_5 == null))) {
        continue forest_cycle_175;
    }
    break forest_cycle_175;
    }
    break forest_cycle_169;
    }
    }
    life23_176 += 1;
    if (!((life4_5 == null))) {
        continue forest_cycle_168;
    }
    break forest_cycle_168;
    }
    break forest_cycle_103;
    }
    }
    life15_104 += 1;
    }
    if (!((life4_5 == null))) {
        continue forest_cycle_102;
    }
    break forest_cycle_102;
    }
    break forest_cycle_96;
    }
    }
    life14_97 += 1;
    if (!((life4_5 == null))) {
        continue forest_cycle_95;
    }
    break forest_cycle_95;
    }
    }
    forestValue300_240_0 = life13_95;
    }
    if (!((forestValue300_240_0 > 0))) {
        break forest_join_277;
    }
    life14_259 = __sourceIntrinsic_60433ded056e_invokedynamic300_35(7443, (8003611072280571770L ^ life2_3));
    if (!(moom.BU.c__Boolean())) {
        break forest_join_255;
    }
    life14_259 = __sourceIntrinsic_60433ded056e_invokedynamic300_37(31883, (8208866129216294627L ^ life2_3));
    }
    java.lang.String __stackOp300_39_0 = life14_259;
    int __stackOp300_39_1 = life13_95;
    java.lang.String __stackOp300_39_2 = __sourceIntrinsic_60433ded056e_invokedynamic300_38(5085, (2183368154628497847L ^ life2_3));
    spill300_10 = __stackOp300_39_2;
    spill300_11 = __stackOp300_39_0;
    spill300_12 = __stackOp300_39_1;
    recovery.source.CarrierOps.discard(__stackOp300_39_2);
    int __stackOp300_42_0 = spill300_12;
    java.lang.String __stackOp300_42_1 = __sourceIntrinsic_60433ded056e_invokedynamic300_41(15341, (2319994160441166214L ^ life2_3));
    moom.BU.b__Void(((java.lang.String)(__sourceIntrinsic_60433ded056e_invokedynamic300_44(spill300_10, spill300_11, __stackOp300_42_1, __stackOp300_42_0, __sourceIntrinsic_60433ded056e_invokedynamic300_43(4904, (2381684595379708229L ^ life2_3))))));
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral5238_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Jb"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.Jb.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.String a(byte[] p0) {
int life1_1;
    int life2_5;
    char[] life3_7;
    int life4_9;
    int life5_19;
    int life6_39;
    int life5_44;
    int life6_52;
    int life6_71;
    int life5_76;
    int life6_86;
    int life5_91;
    int life6_99;
    life1_1 = 0;
    life3_7 = new char[(life2_5 = (p0).length)];
    life4_9 = 0;
    loop_region_10: while ((life4_9 < life2_5)) {
        if (((life5_19 = (255 & (p0)[life4_9])) < 192)) {
        (life3_7)[(life1_1++)] = ((char) life5_19);
    } else {
        if ((life5_19 < 224)) {
        life6_39 = ((int)(((char) (((char) (life5_19 & 31)) << 6))));
        byte[] spill2713_0 = p0;
        life4_9 += 1;
        life5_44 = (spill2713_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill2713_1 = p0;
        life4_9 += 1;
        life5_76 = (spill2713_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill2713_2 = p0;
        life4_9 += 1;
        life5_91 = (spill2713_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral5238_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_60433ded056e_invokedynamic300_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_60433ded056e_invokedynamic300_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_60433ded056e_invokedynamic300_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_60433ded056e_invokedynamic300_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_60433ded056e_invokedynamic300_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_60433ded056e_invokedynamic300_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_60433ded056e_invokedynamic300_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_60433ded056e_invokedynamic300_23(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_60433ded056e_invokedynamic300_35(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_60433ded056e_invokedynamic300_37(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_60433ded056e_invokedynamic300_38(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_60433ded056e_invokedynamic300_41(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_60433ded056e_invokedynamic300_43(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_60433ded056e_invokedynamic300_44(java.lang.String a0, java.lang.String a1, java.lang.String a2, int a3, java.lang.String a4) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral5235_0() throws E;
}
