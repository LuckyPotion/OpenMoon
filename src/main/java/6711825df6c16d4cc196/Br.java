package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Br {

private static final org.apache.logging.log4j.Logger a;

private final net.minecraft.world.WorldServer b;

private final java.util.List<net.minecraft.entity.player.EntityPlayerMP> c;

private final moom.Do<moom.Bs> d;

private final java.util.List<moom.Bs> e;

private final java.util.List<moom.Bs> f;

private int g;

private long h;

private final int[][] i;

private final java.util.Map<net.minecraft.entity.player.EntityPlayerMP, java.util.Set<moom.Ee>> j;

private static final long k;

private static final long[] l;

private static final java.lang.Integer[] m;

private static final java.util.Map n;

private static final long[] o;

private static final java.lang.Long[] p;

private static final java.util.Map q;

public Br(net.minecraft.world.WorldServer p0) {
super();
    this.c = ((java.util.List)(com.google.common.collect.Lists.newArrayList()));
    this.d = ((moom.Do)(new moom.Do()));
    this.e = ((java.util.List)(com.google.common.collect.Lists.newArrayList()));
    this.f = ((java.util.List)(com.google.common.collect.Lists.newArrayList()));
    this.i = ((int[][])(new int[][] {new int[] {1, 0}, new int[] {0, 1}, new int[] {-1, 0}, new int[] {0, -1}}));
    this.j = ((java.util.Map)(new java.util.HashMap()));
    this.b = ((net.minecraft.world.WorldServer)(p0));
    ((moom.Br)(this)).a__Void(((int)(((net.minecraft.server.management.ServerConfigurationManager)(((moom.Bl)(__sourceExactCall_c05be346191bb1(((net.minecraft.world.WorldServer)(p0))))).a__BA())).d())));
    return;
}


static {
k = ((long)(((moom._a)(moom._c.a(((long)(-6606251867673197556L)), ((long)(6662633172065715656L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(120776415873223L)))));
    n = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (moom.Br.k ^ 51339443956044L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill494_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill494_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill494_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill494_14 = new byte[8];
    (__sourceSpill494_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill494_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation494_16 = __sourceSpill494_14;
    ((javax.crypto.Cipher)(__sourceSpill494_11)).init(((int)(__sourceSpill494_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill494_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation494_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local19_life19 = new long[9];
    int local16_life20 = 0;
    java.lang.String local17_life21;
    int local18_life23 = ((java.lang.String)((local17_life21 = "òÀ¦¥¦6å´=oo@¤X!R«?íÖß\003Ï­WÂwQ°EÏÒ\035B¶6à· ¯XN\024£P\030ö-\"$"))).length();
    int local15_life24 = 0;
    do {
        java.lang.String __sourceSpill494_25 = local17_life21;
        int __sourceSpill494_26 = local15_life24;
        local15_life24 += 8;
        byte[] local20_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill494_25)).substring(((int)(__sourceSpill494_26)), ((int)(local15_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill494_30 = local19_life19;
        int __sourceSpill494_31 = local16_life20;
        local16_life20 += 1;
        long local21_life32 = (((((((((((long) (local20_life29)[0]) & 255L) << 56) | ((((long) (local20_life29)[1]) & 255L) << 48)) | ((((long) (local20_life29)[2]) & 255L) << 40)) | ((((long) (local20_life29)[3]) & 255L) << 32)) | ((((long) (local20_life29)[4]) & 255L) << 24)) | ((((long) (local20_life29)[5]) & 255L) << 16)) | ((((long) (local20_life29)[6]) & 255L) << 8)) | (((long) (local20_life29)[7]) & 255L));
        byte[] __sourceSpill494_33 = new byte[8];
        (__sourceSpill494_33)[0] = ((byte) ((int) (local21_life32 >>> 56)));
        (__sourceSpill494_33)[1] = ((byte) ((int) (local21_life32 >>> 48)));
        (__sourceSpill494_33)[2] = ((byte) ((int) (local21_life32 >>> 40)));
        (__sourceSpill494_33)[3] = ((byte) ((int) (local21_life32 >>> 32)));
        (__sourceSpill494_33)[4] = ((byte) ((int) (local21_life32 >>> 24)));
        (__sourceSpill494_33)[5] = ((byte) ((int) (local21_life32 >>> 16)));
        (__sourceSpill494_33)[6] = ((byte) ((int) (local21_life32 >>> 8)));
        (__sourceSpill494_33)[7] = ((byte) ((int) local21_life32));
        javax.crypto.Cipher __sourceSpill494_34 = local13_life9;
        byte[] local23_life36 = ((javax.crypto.Cipher)(__sourceSpill494_34)).doFinal(((byte[])(__sourceSpill494_33)));
        (__sourceSpill494_30)[__sourceSpill494_31] = (((((((((((long) (local23_life36)[0]) & 255L) << 56) | ((((long) (local23_life36)[1]) & 255L) << 48)) | ((((long) (local23_life36)[2]) & 255L) << 40)) | ((((long) (local23_life36)[3]) & 255L) << 32)) | ((((long) (local23_life36)[4]) & 255L) << 24)) | ((((long) (local23_life36)[5]) & 255L) << 16)) | ((((long) (local23_life36)[6]) & 255L) << 8)) | (((long) (local23_life36)[7]) & 255L));
    } while ((!(local15_life24 >= local18_life23)));
    local18_life23 = ((java.lang.String)((local17_life21 = "yÎW\001¤í'\bLc\032\003<"))).length();
    local15_life24 = 0;
    do {
        java.lang.String __sourceSpill494_38 = local17_life21;
        int __sourceSpill494_39 = local15_life24;
        local15_life24 += 8;
        byte[] local20_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill494_38)).substring(((int)(__sourceSpill494_39)), ((int)(local15_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill494_43 = local19_life19;
        int __sourceSpill494_44 = local16_life20;
        local16_life20 += 1;
        long local21_life45 = (((((((((((long) (local20_life42)[0]) & 255L) << 56) | ((((long) (local20_life42)[1]) & 255L) << 48)) | ((((long) (local20_life42)[2]) & 255L) << 40)) | ((((long) (local20_life42)[3]) & 255L) << 32)) | ((((long) (local20_life42)[4]) & 255L) << 24)) | ((((long) (local20_life42)[5]) & 255L) << 16)) | ((((long) (local20_life42)[6]) & 255L) << 8)) | (((long) (local20_life42)[7]) & 255L));
        byte[] __sourceSpill494_46 = new byte[8];
        (__sourceSpill494_46)[0] = ((byte) ((int) (local21_life45 >>> 56)));
        (__sourceSpill494_46)[1] = ((byte) ((int) (local21_life45 >>> 48)));
        (__sourceSpill494_46)[2] = ((byte) ((int) (local21_life45 >>> 40)));
        (__sourceSpill494_46)[3] = ((byte) ((int) (local21_life45 >>> 32)));
        (__sourceSpill494_46)[4] = ((byte) ((int) (local21_life45 >>> 24)));
        (__sourceSpill494_46)[5] = ((byte) ((int) (local21_life45 >>> 16)));
        (__sourceSpill494_46)[6] = ((byte) ((int) (local21_life45 >>> 8)));
        (__sourceSpill494_46)[7] = ((byte) ((int) local21_life45));
        javax.crypto.Cipher __sourceSpill494_47 = local13_life9;
        byte[] local23_life49 = ((javax.crypto.Cipher)(__sourceSpill494_47)).doFinal(((byte[])(__sourceSpill494_46)));
        (__sourceSpill494_43)[__sourceSpill494_44] = (((((((((((long) (local23_life49)[0]) & 255L) << 56) | ((((long) (local23_life49)[1]) & 255L) << 48)) | ((((long) (local23_life49)[2]) & 255L) << 40)) | ((((long) (local23_life49)[3]) & 255L) << 32)) | ((((long) (local23_life49)[4]) & 255L) << 24)) | ((((long) (local23_life49)[5]) & 255L) << 16)) | ((((long) (local23_life49)[6]) & 255L) << 8)) | (((long) (local23_life49)[7]) & 255L));
    } while ((!(local15_life24 >= local18_life23)));
    l = ((long[])(local19_life19));
    m = ((java.lang.Integer[])(new java.lang.Integer[9]));
    q = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life54;
    javax.crypto.Cipher __sourceSpill494_56 = (local0_life54 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill494_57 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill494_58 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill494_59 = new byte[8];
    (__sourceSpill494_59)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life60 = 1;
    while ((local1_life60 < 8)) {
        (__sourceSpill494_59)[local1_life60] = ((byte) ((int) ((local11_life7 << (local1_life60 * 8)) >>> 56)));
        local1_life60 += 1;
    }
    byte[] __sourcePreallocation494_61 = __sourceSpill494_59;
    ((javax.crypto.Cipher)(__sourceSpill494_56)).init(((int)(__sourceSpill494_57)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill494_58)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation494_61)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life64 = new long[3];
    int local3_life65 = 0;
    java.lang.String local4_life66;
    int local5_life68 = ((java.lang.String)((local4_life66 = "2Òc1\031\024dßÉE{\000\001©yk··\031Ð"))).length();
    int local2_life69 = 0;
    do {
        java.lang.String __sourceSpill494_70 = local4_life66;
        int __sourceSpill494_71 = local2_life69;
        local2_life69 += 8;
        byte[] local7_life74 = ((java.lang.String)(((java.lang.String)(__sourceSpill494_70)).substring(((int)(__sourceSpill494_71)), ((int)(local2_life69))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill494_75 = local6_life64;
        int __sourceSpill494_76 = local3_life65;
        local3_life65 += 1;
        long local8_life77 = (((((((((((long) (local7_life74)[0]) & 255L) << 56) | ((((long) (local7_life74)[1]) & 255L) << 48)) | ((((long) (local7_life74)[2]) & 255L) << 40)) | ((((long) (local7_life74)[3]) & 255L) << 32)) | ((((long) (local7_life74)[4]) & 255L) << 24)) | ((((long) (local7_life74)[5]) & 255L) << 16)) | ((((long) (local7_life74)[6]) & 255L) << 8)) | (((long) (local7_life74)[7]) & 255L));
        byte[] __sourceSpill494_78 = new byte[8];
        (__sourceSpill494_78)[0] = ((byte) ((int) (local8_life77 >>> 56)));
        (__sourceSpill494_78)[1] = ((byte) ((int) (local8_life77 >>> 48)));
        (__sourceSpill494_78)[2] = ((byte) ((int) (local8_life77 >>> 40)));
        (__sourceSpill494_78)[3] = ((byte) ((int) (local8_life77 >>> 32)));
        (__sourceSpill494_78)[4] = ((byte) ((int) (local8_life77 >>> 24)));
        (__sourceSpill494_78)[5] = ((byte) ((int) (local8_life77 >>> 16)));
        (__sourceSpill494_78)[6] = ((byte) ((int) (local8_life77 >>> 8)));
        (__sourceSpill494_78)[7] = ((byte) ((int) local8_life77));
        javax.crypto.Cipher __sourceSpill494_79 = local0_life54;
        byte[] local10_life81 = ((javax.crypto.Cipher)(__sourceSpill494_79)).doFinal(((byte[])(__sourceSpill494_78)));
        (__sourceSpill494_75)[__sourceSpill494_76] = (((((((((((long) (local10_life81)[0]) & 255L) << 56) | ((((long) (local10_life81)[1]) & 255L) << 48)) | ((((long) (local10_life81)[2]) & 255L) << 40)) | ((((long) (local10_life81)[3]) & 255L) << 32)) | ((((long) (local10_life81)[4]) & 255L) << 24)) | ((((long) (local10_life81)[5]) & 255L) << 16)) | ((((long) (local10_life81)[6]) & 255L) << 8)) | (((long) (local10_life81)[7]) & 255L));
    } while ((!(local2_life69 >= local5_life68)));
    o = ((long[])(local6_life64));
    p = ((java.lang.Long[])(new java.lang.Long[3]));
    a = ((org.apache.logging.log4j.Logger)(org.apache.logging.log4j.LogManager.getLogger()));
}


public void b(net.minecraft.entity.player.EntityPlayerMP p0) {
int forestValue593_53_0;
    int forestValue593_55_0;
    int forestValue593_64_0;
    int forestValue593_131_0;
    boolean spill593_0;
    boolean spill593_1;
    int spill593_2;
    int spill593_3;
    boolean spill593_4;
    long life2_3;
    java.util.ArrayList life5_7;
    int life6_9;
    int life7_12;
    int life8_18;
    int life9_24;
    int life10_26;
    int life11_29;
    int life4_30;
    moom.Ee life12_37;
    int life13_55;
    int life14_64;
    int[] life15_75;
    int life16_79;
    moom.Ee life12_105;
    int life13_135;
    moom.Ee life12_169;
    forest_join_180: {
    forest_join_131: {
    forest_join_126: {
    forest_join_53: {
    forest_join_52: {
    life2_3 = (moom.Br.k ^ 79479392422045L);
    life5_7 = com.google.common.collect.Lists.newArrayList(((java.lang.Iterable)(((net.minecraft.entity.player.EntityPlayerMP)(p0)).cl)));
    life6_9 = 0;
    life7_12 = this.g;
    life8_18 = (((int) ((net.minecraft.entity.player.EntityPlayerMP)(p0)).n) >> 4);
    life9_24 = (((int) ((net.minecraft.entity.player.EntityPlayerMP)(p0)).p) >> 4);
    life10_26 = 0;
    spill593_0 = net.minecraft.server.management.ServerConfigurationManager.c__Boolean();
    life11_29 = 0;
    life4_30 = ((spill593_0) ? 1 : 0);
    life12_37 = ((moom.Bs)(this.a(((int)(life8_18)), ((int)(life9_24)), ((boolean)(true))))).b;
    ((java.util.List)(((net.minecraft.entity.player.EntityPlayerMP)(p0)).cl)).clear();
    spill593_1 = ((java.util.List)(life5_7)).contains(((java.lang.Object)(life12_37)));
    if (!((life4_30 != 0))) {
        forestValue593_53_0 = ((spill593_1) ? 1 : 0);
        break forest_join_53;
    }
    if (!(spill593_1)) {
        break forest_join_52;
    }
    ((java.util.List)(((net.minecraft.entity.player.EntityPlayerMP)(p0)).cl)).add(((java.lang.Object)(life12_37)));
    }
    forestValue593_53_0 = 1;
    }
    life13_55 = forestValue593_53_0;
    forest_cycle_54: while (true) {
    forest_join_123: {
    forestValue593_55_0 = life13_55;
    forest_cycle_55: while (true) {
    if (!((forestValue593_55_0 <= (life7_12 * 2)))) {
        break forest_join_126;
    }
    spill593_2 = 0;
    if (!((life4_30 != 0))) {
        forestValue593_131_0 = spill593_2;
        break forest_join_131;
    }
    life14_64 = spill593_2;
    forest_cycle_63: while (true) {
    forest_join_120: {
    forestValue593_64_0 = life14_64;
    forest_cycle_64: while (true) {
    if (!((forestValue593_64_0 < 2))) {
        break forest_join_123;
    }
    life15_75 = (this.i)[((life6_9++) % 4)];
    spill593_3 = 0;
    if (!((life4_30 != 0))) {
        forestValue593_55_0 = spill593_3;
        continue forest_cycle_55;
    }
    life16_79 = spill593_3;
    forest_cycle_78: while (true) {
    forest_join_118: {
    forest_join_117: {
    if (!((life16_79 < life13_55))) {
        break forest_join_120;
    }
    life10_26 = (life10_26 + (life15_75)[0]);
    life11_29 = (life11_29 + (life15_75)[1]);
    life12_105 = ((moom.Bs)(this.a(((int)((life8_18 + life10_26))), ((int)((life9_24 + life11_29))), ((boolean)(true))))).b;
    if (!((life4_30 != 0))) {
        break forest_join_118;
    }
    spill593_4 = ((java.util.List)(life5_7)).contains(((java.lang.Object)(life12_105)));
    if (!((life4_30 != 0))) {
        forestValue593_64_0 = ((spill593_4) ? 1 : 0);
        continue forest_cycle_64;
    }
    if (!(spill593_4)) {
        break forest_join_117;
    }
    ((java.util.List)(((net.minecraft.entity.player.EntityPlayerMP)(p0)).cl)).add(((java.lang.Object)(life12_105)));
    }
    life16_79 += 1;
    }
    if (!((life4_30 == 0))) {
        continue forest_cycle_78;
    }
    break forest_cycle_78;
    }
    break forest_cycle_64;
    }
    }
    life14_64 += 1;
    if (!((life4_30 == 0))) {
        continue forest_cycle_63;
    }
    break forest_cycle_63;
    }
    break forest_cycle_55;
    }
    }
    life13_55 += 1;
    if (!((life4_30 == 0))) {
        continue forest_cycle_54;
    }
    break forest_cycle_54;
    }
    }
    life6_9 = (life6_9 % 4);
    forestValue593_131_0 = 0;
    }
    life13_135 = forestValue593_131_0;
    forest_cycle_132: while (true) {
    forest_join_178: {
    forest_join_177: {
    if (!((life13_135 < (life7_12 * 2)))) {
        break forest_join_180;
    }
    life10_26 = (life10_26 + ((this.i)[life6_9])[0]);
    life11_29 = (life11_29 + ((this.i)[life6_9])[1]);
    life12_169 = ((moom.Bs)(this.a(((int)((life8_18 + life10_26))), ((int)((life9_24 + life11_29))), ((boolean)(true))))).b;
    if (!((life4_30 != 0))) {
        break forest_join_178;
    }
    if (!(((java.util.List)(life5_7)).contains(((java.lang.Object)(life12_169))))) {
        break forest_join_177;
    }
    ((java.util.List)(((net.minecraft.entity.player.EntityPlayerMP)(p0)).cl)).add(((java.lang.Object)(life12_169)));
    }
    life13_135 += 1;
    }
    if (!((life4_30 == 0))) {
        continue forest_cycle_132;
    }
    break forest_cycle_132;
    }
    }
    return;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral3971_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Br"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static long b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    long local7 = moom.Br.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local9 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Long.TYPE)), ((java.lang.Object)(java.lang.Long.valueOf(((long)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local9)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static long b(int p0, long p1) {
int life3_8;
    byte[] life4_77;
    long life5_81;
    byte[] life7_146;
    java.lang.Long life8_150;
    java.lang.Object[] life9_155;
    javax.crypto.spec.DESKeySpec life11_188;
    javax.crypto.SecretKey life12_195;
    javax.crypto.Cipher life13_200;
    byte[] life10_212;
    long life11_290;
    life3_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 20439);
    if (((moom.Br.p)[life3_8] == null)) {
        life4_77 = new byte[] {((byte) ((int) (p1 >>> 56))), ((byte) ((int) (p1 >>> 48))), ((byte) ((int) (p1 >>> 40))), ((byte) ((int) (p1 >>> 32))), ((byte) ((int) (p1 >>> 24))), ((byte) ((int) (p1 >>> 16))), ((byte) ((int) (p1 >>> 8))), ((byte) ((int) p1))};
        life5_81 = (moom.Br.o)[life3_8];
        life7_146 = new byte[] {((byte) ((int) (life5_81 >>> 56))), ((byte) ((int) (life5_81 >>> 48))), ((byte) ((int) (life5_81 >>> 40))), ((byte) ((int) (life5_81 >>> 32))), ((byte) ((int) (life5_81 >>> 24))), ((byte) ((int) (life5_81 >>> 16))), ((byte) ((int) (life5_81 >>> 8))), ((byte) ((int) life5_81))};
        life8_150 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life9_155 = ((java.lang.Object[])(((java.util.Map)(moom.Br.q)).get(((java.lang.Object)(life8_150)))));
        try {
        if ((life9_155 == null)) {
        life9_155 = new java.lang.Object[3];
        (life9_155)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding")));
        (life9_155)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life9_155)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.Br.q)).put(((java.lang.Object)(life8_150)), ((java.lang.Object)(life9_155)));
    }
        life11_188 = new javax.crypto.spec.DESKeySpec(life4_77);
        life12_195 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life9_155)[1])))).generateSecret(((java.security.spec.KeySpec)(life11_188)));
        life13_200 = ((javax.crypto.Cipher)((life9_155)[0]));
        ((javax.crypto.Cipher)(life13_200)).init(((int)(2)), ((java.security.Key)(life12_195)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life9_155)[2])))));
        life10_212 = ((javax.crypto.Cipher)(life13_200)).doFinal(((byte[])(life7_146)));
    } catch (java.lang.Exception life11_214) {
        throw new java.lang.RuntimeException("moom/Br", life11_214);
    }
        life11_290 = (((((((((((long) (life10_212)[0]) & 255L) << 56) | ((((long) (life10_212)[1]) & 255L) << 48)) | ((((long) (life10_212)[2]) & 255L) << 40)) | ((((long) (life10_212)[3]) & 255L) << 32)) | ((((long) (life10_212)[4]) & 255L) << 24)) | ((((long) (life10_212)[5]) & 255L) << 16)) | ((((long) (life10_212)[6]) & 255L) << 8)) | (((long) (life10_212)[7]) & 255L));
        (moom.Br.p)[life3_8] = java.lang.Long.valueOf(((long)(life11_290)));
    }
    return ((java.lang.Long)((moom.Br.p)[life3_8])).longValue();
}


public void c(net.minecraft.entity.player.EntityPlayerMP p0) {
int lexicalValue515_72_0;
    boolean spill515_0;
    int spill515_1;
    long life2_3;
    int life5_15;
    int life6_21;
    int life4_22;
    int life7_27;
    int life8_40;
    moom.Bs life9_52;
    lexical_join_72: {
    lexical_join_68: {
    life2_3 = (moom.Br.k ^ 5073211563135L);
    ((java.util.Map)(this.j)).remove(((java.lang.Object)(p0)));
    spill515_0 = net.minecraft.server.management.ServerConfigurationManager.b__Boolean();
    life5_15 = (((int) ((net.minecraft.entity.player.EntityPlayerMP)(p0)).cj) >> 4);
    life6_21 = (((int) ((net.minecraft.entity.player.EntityPlayerMP)(p0)).ck) >> 4);
    life4_22 = ((spill515_0) ? 1 : 0);
    life7_27 = (life5_15 - this.g);
    lexical_cycle_28: while (true) {
    lexical_join_66: {
    lexical_join_65: {
    if (!((life7_27 <= (life5_15 + this.g)))) {
        break lexical_join_68;
    }
    spill515_1 = (life6_21 - this.g);
    if (!((life4_22 == 0))) {
        lexicalValue515_72_0 = spill515_1;
        break lexical_join_72;
    }
    life8_40 = spill515_1;
    lexical_cycle_41: while (true) {
    lexical_join_63: {
    lexical_join_62: {
    if (!((life8_40 <= (life6_21 + this.g)))) {
        break lexical_join_65;
    }
    life9_52 = this.a(((int)(life7_27)), ((int)(life8_40)), ((boolean)(false)));
    if (!((life4_22 == 0))) {
        break lexical_join_66;
    }
    if (!((life4_22 == 0))) {
        break lexical_join_63;
    }
    if (!((life9_52 != null))) {
        break lexical_join_62;
    }
    ((moom.Bs)(life9_52)).b(((net.minecraft.entity.player.EntityPlayerMP)(p0)));
    }
    life8_40 += 1;
    }
    if (!((life4_22 != 0))) { continue lexical_cycle_41; }
    break lexical_cycle_41;
    }
    }
    life7_27 += 1;
    }
    if (!((life4_22 != 0))) { continue lexical_cycle_28; }
    break lexical_cycle_28;
    }
    }
    lexicalValue515_72_0 = ((((java.util.List)(this.c)).remove(((java.lang.Object)(p0)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(lexicalValue515_72_0);
    return;
}


public void d(net.minecraft.entity.player.EntityPlayerMP p0) {
int forestValue224_49_0;
    int forestValue224_72_0;
    int forestValue224_82_0;
    int forestValue224_120_0;
    int forestValue224_141_0;
    int forestValue224_155_0;
    boolean spill224_0;
    int spill224_1;
    int spill224_2;
    boolean spill224_3;
    boolean spill224_4;
    long life2_3;
    int life5_10;
    int life4_11;
    int life6_17;
    double life7_23;
    double life9_29;
    double life11_37;
    int life13_51;
    int life14_57;
    int life15_60;
    int life16_64;
    int life17_68;
    java.util.Set life18_79;
    int life19_83;
    int life20_94;
    moom.Bs life21_175;
    forest_join_190: {
    forest_join_186: {
    forest_join_179: {
    forest_join_73: {
    forest_join_72: {
    forest_join_49: {
    life2_3 = (moom.Br.k ^ 54239110103082L);
    spill224_0 = net.minecraft.server.management.ServerConfigurationManager.c__Boolean();
    life5_10 = (((int) ((net.minecraft.entity.player.EntityPlayerMP)(p0)).n) >> 4);
    life4_11 = ((spill224_0) ? 1 : 0);
    life6_17 = (((int) ((net.minecraft.entity.player.EntityPlayerMP)(p0)).p) >> 4);
    life7_23 = (((net.minecraft.entity.player.EntityPlayerMP)(p0)).cj - ((net.minecraft.entity.player.EntityPlayerMP)(p0)).n);
    life9_29 = (((net.minecraft.entity.player.EntityPlayerMP)(p0)).ck - ((net.minecraft.entity.player.EntityPlayerMP)(p0)).p);
    life11_37 = ((life7_23 * life7_23) + (life9_29 * life9_29));
    spill224_1 = recovery.source.CarrierOps.dcmpl(((double)(life11_37)), ((double)(0x1.0p6d)));
    if (!((life4_11 != 0))) {
        forestValue224_49_0 = spill224_1;
        break forest_join_49;
    }
    if (!((spill224_1 >= 0))) {
        break forest_join_190;
    }
    forestValue224_49_0 = (((int) ((net.minecraft.entity.player.EntityPlayerMP)(p0)).cj) >> 4);
    }
    life13_51 = forestValue224_49_0;
    life14_57 = (((int) ((net.minecraft.entity.player.EntityPlayerMP)(p0)).ck) >> 4);
    life15_60 = this.g;
    life16_64 = (life5_10 - life13_51);
    life17_68 = (life6_17 - life14_57);
    spill224_2 = life16_64;
    if (!((life4_11 != 0))) {
        forestValue224_72_0 = spill224_2;
        break forest_join_72;
    }
    if (!((spill224_2 == 0))) {
        break forest_join_73;
    }
    forestValue224_72_0 = life17_68;
    }
    if (!((forestValue224_72_0 != 0))) {
        break forest_join_190;
    }
    }
    life18_79 = this.a(((net.minecraft.entity.player.EntityPlayerMP)(p0)));
    life19_83 = (life5_10 - life15_60);
    forest_cycle_81: while (true) {
    forest_join_176: {
    forestValue224_82_0 = life19_83;
    forest_cycle_82: while (true) {
    if (!((forestValue224_82_0 <= (life5_10 + life15_60)))) {
        break forest_join_179;
    }
    if (!((life4_11 != 0))) {
        break forest_join_186;
    }
    life20_94 = (life6_17 - life15_60);
    forest_cycle_92: while (true) {
    forest_join_174: {
    forest_join_173: {
    forest_join_155: {
    forest_join_141: {
    forest_join_130: {
    forest_join_123: {
    forest_join_120: {
    if (!((life20_94 <= (life6_17 + life15_60)))) {
        break forest_join_176;
    }
    spill224_3 = this.a(((int)(life19_83)), ((int)(life20_94)), ((int)(life13_51)), ((int)(life14_57)), ((int)(life15_60)));
    if (!((life4_11 != 0))) {
        forestValue224_82_0 = ((spill224_3) ? 1 : 0);
        continue forest_cycle_82;
    }
    if (!((life4_11 != 0))) {
        forestValue224_141_0 = ((spill224_3) ? 1 : 0);
        break forest_join_141;
    }
    if (!((!spill224_3))) {
        break forest_join_130;
    }
    spill224_4 = moom.BU.as();
    if (!((life4_11 != 0))) {
        forestValue224_120_0 = ((spill224_4) ? 1 : 0);
        break forest_join_120;
    }
    if (!(spill224_4)) {
        break forest_join_123;
    }
    forestValue224_120_0 = ((((java.util.Set)(life18_79)).add(((java.lang.Object)(new moom.Ee(life19_83, life20_94))))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forestValue224_120_0);
    if (!((life4_11 == 0))) {
        break forest_join_130;
    }
    }
    ((moom.Bs)(this.a(((int)(life19_83)), ((int)(life20_94)), ((boolean)(true))))).a(((net.minecraft.entity.player.EntityPlayerMP)(p0)));
    }
    forestValue224_141_0 = ((this.a(((int)((life19_83 - life16_64))), ((int)((life20_94 - life17_68))), ((int)(life5_10)), ((int)(life6_17)), ((int)(life15_60)))) ? 1 : 0);
    }
    if (!((life4_11 != 0))) {
        forestValue224_155_0 = forestValue224_141_0;
        break forest_join_155;
    }
    if (!((forestValue224_141_0 == 0))) {
        break forest_join_173;
    }
    forestValue224_155_0 = ((((java.util.Set)(life18_79)).remove(((java.lang.Object)(new moom.Ee((life19_83 - life16_64), (life20_94 - life17_68)))))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forestValue224_155_0);
    life21_175 = this.a(((int)((life19_83 - life16_64))), ((int)((life20_94 - life17_68))), ((boolean)(false)));
    if (!((life4_11 != 0))) {
        break forest_join_174;
    }
    if (!((life21_175 != null))) {
        break forest_join_173;
    }
    ((moom.Bs)(life21_175)).b(((net.minecraft.entity.player.EntityPlayerMP)(p0)));
    }
    life20_94 += 1;
    }
    if (!((life4_11 == 0))) {
        continue forest_cycle_92;
    }
    break forest_cycle_92;
    }
    break forest_cycle_82;
    }
    }
    life19_83 += 1;
    if (!((life4_11 == 0))) {
        continue forest_cycle_81;
    }
    break forest_cycle_81;
    }
    }
    this.b(((net.minecraft.entity.player.EntityPlayerMP)(p0)));
    ((net.minecraft.entity.player.EntityPlayerMP)(p0)).cj = ((double)(((net.minecraft.entity.player.EntityPlayerMP)(p0)).n));
    }
    ((net.minecraft.entity.player.EntityPlayerMP)(p0)).ck = ((double)(((net.minecraft.entity.player.EntityPlayerMP)(p0)).p));
    }
    return;
}


private static int a(int p0, long p1) {
int n4 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x3B9C;
        if (m[n4] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = Br.l[n4];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])Br.n.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    Br.n.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/Br", exception);
            }
            int n6 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Br.m[n4] = n6;
        }
        return m[n4];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_2953e295adc522(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public boolean a(int p0, int p1) {
long local3 = (moom.Br.k ^ 69298695411046L);
    long local5 = ((((long) p0) + __sourceIntrinsic_425aa30d62d0_invokedynamic3975_1(6385, (6015801492228501366L ^ local3))) | ((((long) p1) + __sourceIntrinsic_425aa30d62d0_invokedynamic3975_2(14825, (7760669044325502572L ^ local3))) << __sourceIntrinsic_425aa30d62d0_invokedynamic3975_3(26624, (5995687219131476940L ^ local3))));
    return ((((moom.Do)(this.d)).a__Object(((long)(local5))) != null) ? true : false);
}


public void a__Void(int p0) {
int forestValue223_24_0;
    int forestValue223_24_1;
    int forestValue223_33_0;
    int forestValue223_65_0;
    int forestValue223_93_0;
    int forestValue223_124_0;
    int forestValue223_126_0;
    int forestValue223_163_0;
    boolean spill223_0;
    int spill223_1;
    int spill223_2;
    int spill223_3;
    int spill223_4;
    boolean spill223_5;
    int spill223_6;
    boolean spill223_7;
    long life2_3;
    int life1_13;
    int life4_14;
    int life5_27;
    java.util.Iterator life6_32;
    net.minecraft.entity.player.EntityPlayerMP life7_39;
    int life8_45;
    int life9_51;
    java.util.Set life10_55;
    int life11_67;
    int life12_78;
    moom.Bs life13_107;
    int life11_133;
    int life12_146;
    moom.Bs life13_180;
    forest_join_188: {
    forest_join_185: {
    forest_join_24: {
    life2_3 = (moom.Br.k ^ 37156054331900L);
    spill223_0 = net.minecraft.server.management.ServerConfigurationManager.c__Boolean();
    life1_13 = moom.Dr.a(((int)(p0)), ((int)(3)), ((int)(__sourceIntrinsic_6fc3381d0590_invokedynamic223_2(19615, (3502477695344716750L ^ life2_3)))));
    life4_14 = ((spill223_0) ? 1 : 0);
    spill223_1 = life1_13;
    spill223_2 = this.g;
    if (!((life4_14 != 0))) {
        forestValue223_24_0 = spill223_1;
        forestValue223_24_1 = spill223_2;
        break forest_join_24;
    }
    if (!((spill223_1 != spill223_2))) {
        break forest_join_188;
    }
    forestValue223_24_0 = life1_13;
    forestValue223_24_1 = this.g;
    }
    life5_27 = (forestValue223_24_0 - forestValue223_24_1);
    life6_32 = ((java.util.ArrayList)(com.google.common.collect.Lists.newArrayList(((java.lang.Iterable)(this.c))))).iterator();
    forest_cycle_31: while (true) {
    forest_join_183: {
    forestValue223_33_0 = ((((java.util.Iterator)(life6_32)).hasNext()) ? 1 : 0);
    forest_cycle_33: while (true) {
    forest_join_124: {
    forest_join_120: {
    forest_join_118: {
    if (!((forestValue223_33_0 != 0))) {
        break forest_join_185;
    }
    life7_39 = ((net.minecraft.entity.player.EntityPlayerMP)(((java.util.Iterator)(life6_32)).next()));
    life8_45 = (((int) ((net.minecraft.entity.player.EntityPlayerMP)(life7_39)).n) >> 4);
    life9_51 = (((int) ((net.minecraft.entity.player.EntityPlayerMP)(life7_39)).p) >> 4);
    life10_55 = this.a(((net.minecraft.entity.player.EntityPlayerMP)(life7_39)));
    if (!((life4_14 != 0))) {
        break forest_join_188;
    }
    spill223_3 = life5_27;
    if (!((life4_14 != 0))) {
        forestValue223_124_0 = spill223_3;
        break forest_join_124;
    }
    if (!((spill223_3 > 0))) {
        break forest_join_120;
    }
    life11_67 = (life8_45 - life1_13);
    forest_cycle_64: while (true) {
    forest_join_115: {
    forestValue223_65_0 = life11_67;
    forest_cycle_65: while (true) {
    if (!((forestValue223_65_0 <= (life8_45 + life1_13)))) {
        break forest_join_118;
    }
    spill223_4 = (life9_51 - life1_13);
    if (!((life4_14 != 0))) {
        forestValue223_33_0 = spill223_4;
        continue forest_cycle_33;
    }
    life12_78 = spill223_4;
    forest_cycle_75: while (true) {
    forest_join_113: {
    forest_join_112: {
    forest_join_96: {
    forest_join_93: {
    if (!((life12_78 <= (life9_51 + life1_13)))) {
        break forest_join_115;
    }
    spill223_5 = moom.BU.as();
    if (!((life4_14 != 0))) {
        forestValue223_65_0 = ((spill223_5) ? 1 : 0);
        continue forest_cycle_65;
    }
    if (!((life4_14 != 0))) {
        forestValue223_93_0 = ((spill223_5) ? 1 : 0);
        break forest_join_93;
    }
    if (!(spill223_5)) {
        break forest_join_96;
    }
    forestValue223_93_0 = ((((java.util.Set)(life10_55)).add(((java.lang.Object)(new moom.Ee(life11_67, life12_78))))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forestValue223_93_0);
    if (!((life4_14 == 0))) {
        break forest_join_112;
    }
    }
    life13_107 = this.a(((int)(life11_67)), ((int)(life12_78)), ((boolean)(true)));
    if (!((life4_14 != 0))) {
        break forest_join_113;
    }
    if (!((!((java.util.List)(((moom.Bs)(life13_107)).a)).contains(((java.lang.Object)(life7_39)))))) {
        break forest_join_112;
    }
    ((moom.Bs)(life13_107)).a(((net.minecraft.entity.player.EntityPlayerMP)(life7_39)));
    }
    life12_78 += 1;
    }
    if (!((life4_14 == 0))) {
        continue forest_cycle_75;
    }
    break forest_cycle_75;
    }
    break forest_cycle_65;
    }
    }
    life11_67 += 1;
    if (!((life4_14 == 0))) {
        continue forest_cycle_64;
    }
    break forest_cycle_64;
    }
    }
    if (!((life4_14 == 0))) {
        break forest_join_183;
    }
    }
    forestValue223_124_0 = (life8_45 - this.g);
    }
    life11_133 = forestValue223_124_0;
    forest_cycle_125: while (true) {
    forest_join_180: {
    forestValue223_126_0 = life11_133;
    forest_cycle_126: while (true) {
    if (!((forestValue223_126_0 <= (life8_45 + this.g)))) {
        break forest_join_183;
    }
    spill223_6 = (life9_51 - this.g);
    if (!((life4_14 != 0))) {
        forestValue223_33_0 = spill223_6;
        continue forest_cycle_33;
    }
    life12_146 = spill223_6;
    forest_cycle_138: while (true) {
    forest_join_178: {
    forest_join_177: {
    forest_join_163: {
    if (!((life12_146 <= (life9_51 + this.g)))) {
        break forest_join_180;
    }
    spill223_7 = this.a(((int)(life11_133)), ((int)(life12_146)), ((int)(life8_45)), ((int)(life9_51)), ((int)(life1_13)));
    if (!((life4_14 != 0))) {
        forestValue223_126_0 = ((spill223_7) ? 1 : 0);
        continue forest_cycle_126;
    }
    if (!((life4_14 != 0))) {
        forestValue223_163_0 = ((spill223_7) ? 1 : 0);
        break forest_join_163;
    }
    if (!((!spill223_7))) {
        break forest_join_177;
    }
    forestValue223_163_0 = ((((java.util.Set)(life10_55)).remove(((java.lang.Object)(new moom.Ee(life11_133, life12_146))))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forestValue223_163_0);
    life13_180 = this.a(((int)(life11_133)), ((int)(life12_146)), ((boolean)(true)));
    if (!((life4_14 != 0))) {
        break forest_join_178;
    }
    if (!((life13_180 != null))) {
        break forest_join_177;
    }
    ((moom.Bs)(life13_180)).b(((net.minecraft.entity.player.EntityPlayerMP)(life7_39)));
    }
    life12_146 += 1;
    }
    if (!((life4_14 == 0))) {
        continue forest_cycle_138;
    }
    break forest_cycle_138;
    }
    break forest_cycle_126;
    }
    }
    life11_133 += 1;
    if (!((life4_14 == 0))) {
        continue forest_cycle_125;
    }
    break forest_cycle_125;
    }
    break forest_cycle_33;
    }
    }
    if (!((life4_14 == 0))) {
        continue forest_cycle_31;
    }
    break forest_cycle_31;
    }
    }
    this.g = ((int)(life1_13));
    }
    return;
}


public net.minecraft.world.WorldServer a() {
return this.b;
}


public void a__Void() {
java.lang.Object lexicalValue511_31_0;
    int lexicalValue511_61_0;
    moom.Br lexicalValue511_165_0;
    boolean spill511_0;
    java.util.Set spill511_1;
    boolean spill511_2;
    moom.Br spill511_3;
    long life1_3;
    java.util.Set life4_8;
    int life3_9;
    java.util.Iterator life5_12;
    java.util.Map.Entry life6_19;
    java.util.Set life7_23;
    net.minecraft.entity.player.EntityPlayerMP life8_38;
    int life9_62;
    java.util.Iterator life10_86;
    moom.Ee life11_93;
    moom.Bs life12_101;
    long life6_118;
    java.util.Iterator life8_144;
    moom.Bs life9_151;
    java.util.Iterator life8_168;
    moom.Bs life9_175;
    moom.EA life8_203;
    lexical_join_175: {
    lexical_join_165: {
    lexical_join_158: {
    lexical_join_155: {
    lexical_join_138: {
    lexical_join_136: {
    lexical_join_117: {
    lexical_join_97: {
    life1_3 = (moom.Br.k ^ 64248569557631L);
    spill511_0 = net.minecraft.server.management.ServerConfigurationManager.c__Boolean();
    life4_8 = ((java.util.Map)(this.j)).entrySet();
    life3_9 = ((spill511_0) ? 1 : 0);
    life5_12 = ((java.util.Set)(life4_8)).iterator();
    lexical_cycle_13: while (true) {
    lexical_join_95: {
    lexical_join_62: {
    lexical_join_61: {
    lexical_join_44: {
    lexical_join_42: {
    lexical_join_31: {
    if (!(((java.util.Iterator)(life5_12)).hasNext())) {
        break lexical_join_97;
    }
    life6_19 = ((java.util.Map.Entry)(((java.util.Iterator)(life5_12)).next()));
    life7_23 = ((java.util.Set)(((java.util.Map.Entry)(life6_19)).getValue()));
    spill511_1 = life7_23;
    if (!((life3_9 != 0))) {
        lexicalValue511_31_0 = spill511_1;
        break lexical_join_31;
    }
    if (!((!((java.util.Set)(spill511_1)).isEmpty()))) {
        break lexical_join_95;
    }
    lexicalValue511_31_0 = ((java.util.Map.Entry)(life6_19)).getKey();
    }
    life8_38 = ((net.minecraft.entity.player.EntityPlayerMP)(lexicalValue511_31_0));
    if (!((life3_9 != 0))) {
        break lexical_join_42;
    }
    if (!((((net.minecraft.entity.player.EntityPlayerMP)(life8_38)).i != this.b))) {
        break lexical_join_44;
    }
    ((java.util.Iterator)(life5_12)).remove();
    }
    if (!((life3_9 == 0))) {
        break lexical_join_95;
    }
    }
    life9_62 = ((this.g / 3) + 1);
    spill511_2 = moom.BU.as();
    if (!((life3_9 != 0))) {
        lexicalValue511_61_0 = ((spill511_2) ? 1 : 0);
        break lexical_join_61;
    }
    if (!((!spill511_2))) {
        break lexical_join_62;
    }
    lexicalValue511_61_0 = ((this.g * 2) + 1);
    }
    life9_62 = lexicalValue511_61_0;
    }
    life10_86 = ((java.util.PriorityQueue)(this.a(((java.util.Set)(life7_23)), ((net.minecraft.entity.player.EntityPlayerMP)(life8_38)), ((int)(life9_62))))).iterator();
    lexical_cycle_69: while (true) {
    if (!(((java.util.Iterator)(life10_86)).hasNext())) {
        break lexical_join_95;
    }
    life11_93 = ((moom.Ee)(((java.util.Iterator)(life10_86)).next()));
    life12_101 = this.a(((int)(((moom.Ee)(life11_93)).a)), ((int)(((moom.Ee)(life11_93)).b)), ((boolean)(true)));
    ((moom.Bs)(life12_101)).a(((net.minecraft.entity.player.EntityPlayerMP)(life8_38)));
    ((java.util.Set)(life7_23)).remove(((java.lang.Object)(life11_93)));
    if (!((life3_9 != 0))) { continue lexical_cycle_13; }
    if (!((life3_9 == 0))) { continue lexical_cycle_69; }
    break lexical_cycle_69;
    }
    }
    if (!((life3_9 == 0))) { continue lexical_cycle_13; }
    break lexical_cycle_13;
    }
    }
    life6_118 = ((net.minecraft.world.WorldServer)(this.b)).b__Long();
    if (!((life3_9 != 0))) {
        break lexical_join_117;
    }
    if (!((recovery.source.CarrierOps.lcmp(((long)((life6_118 - this.h))), ((long)(__sourceIntrinsic_b82a5b29b709_invokedynamic511_34(19657, (4897711507397729364L ^ life1_3))))) > 0))) {
        break lexical_join_138;
    }
    this.h = ((long)(life6_118));
    }
    life8_144 = ((java.util.List)(this.f)).iterator();
    lexical_cycle_121: while (true) {
    if (!(((java.util.Iterator)(life8_144)).hasNext())) {
        break lexical_join_136;
    }
    life9_151 = ((moom.Bs)(((java.util.Iterator)(life8_144)).next()));
    ((moom.Bs)(life9_151)).b();
    ((moom.Bs)(life9_151)).a();
    if (!((life3_9 != 0))) {
        break lexical_join_158;
    }
    if (!((life3_9 == 0))) { continue lexical_cycle_121; }
    break lexical_cycle_121;
    }
    }
    if (!((life3_9 == 0))) {
        break lexical_join_155;
    }
    }
    life8_168 = ((java.util.List)(this.e)).iterator();
    lexical_cycle_142: while (true) {
    if (!(((java.util.Iterator)(life8_168)).hasNext())) {
        break lexical_join_155;
    }
    life9_175 = ((moom.Bs)(((java.util.Iterator)(life8_168)).next()));
    ((moom.Bs)(life9_175)).b();
    if (!((life3_9 != 0))) {
        break lexical_join_158;
    }
    if (!((life3_9 == 0))) { continue lexical_cycle_142; }
    break lexical_cycle_142;
    }
    }
    ((java.util.List)(this.e)).clear();
    }
    spill511_3 = this;
    if (!((life3_9 != 0))) {
        lexicalValue511_165_0 = spill511_3;
        break lexical_join_165;
    }
    if (!(((java.util.List)(((moom.Br)(spill511_3)).c)).isEmpty())) {
        break lexical_join_175;
    }
    lexicalValue511_165_0 = this;
    }
    life8_203 = ((net.minecraft.world.WorldServer)(((moom.Br)(lexicalValue511_165_0)).b)).v;
    if (!((!((moom.EA)(life8_203)).b__Boolean()))) {
        break lexical_join_175;
    }
    ((net.minecraft.world.gen.ChunkProviderServer)(((net.minecraft.world.WorldServer)(this.b)).Z)).b();
    }
    return;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral3978_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Br"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public boolean a(net.minecraft.entity.player.EntityPlayerMP p0, int p1, int p2) {
moom.Bs forwardValue1545_17_0;
    int forwardValue1545_28_0;
    int forwardValue1545_32_0;
    int forwardValue1545_34_0;
    boolean spill1545_0;
    moom.Bs spill1545_1;
    boolean spill1545_2;
    long life4_3;
    moom.Bs life7_10;
    int life6_11;
    forward_join_34: {
    forward_join_33: {
    forward_join_32: {
    forward_join_28: {
    forward_join_17: {
    life4_3 = (moom.Br.k ^ 125024452172667L);
    spill1545_0 = net.minecraft.server.management.ServerConfigurationManager.b__Boolean();
    life7_10 = this.a(((int)(p1)), ((int)(p2)), ((boolean)(false)));
    life6_11 = ((spill1545_0) ? 1 : 0);
    spill1545_1 = life7_10;
    if (!((life6_11 == 0))) {
        forwardValue1545_17_0 = spill1545_1;
        break forward_join_17;
    }
    if (!((spill1545_1 != null))) {
        break forward_join_33;
    }
    forwardValue1545_17_0 = life7_10;
    }
    spill1545_2 = ((java.util.List)(((moom.Bs)(forwardValue1545_17_0)).a)).contains(((java.lang.Object)(p0)));
    if (!((life6_11 == 0))) {
        forwardValue1545_28_0 = ((spill1545_2) ? 1 : 0);
        break forward_join_28;
    }
    if (!(spill1545_2)) {
        break forward_join_33;
    }
    forwardValue1545_28_0 = ((((java.util.List)(((net.minecraft.entity.player.EntityPlayerMP)(p0)).cl)).contains(((java.lang.Object)(((moom.Bs)(life7_10)).b)))) ? 1 : 0);
    }
    if (!((life6_11 == 0))) {
        forwardValue1545_32_0 = forwardValue1545_28_0;
        break forward_join_32;
    }
    if (!((forwardValue1545_28_0 == 0))) {
        break forward_join_33;
    }
    forwardValue1545_32_0 = 1;
    }
    forwardValue1545_34_0 = forwardValue1545_32_0;
    break forward_join_34;
    }
    forwardValue1545_34_0 = 0;
    }
    return ((forwardValue1545_34_0) != 0);
}


private boolean a(int p0, int p1, int p2, int p3, int p4) {
int forwardValue1540_22_0;
    int forwardValue1540_22_1;
    int forwardValue1540_28_0;
    int forwardValue1540_28_1;
    int forwardValue1540_35_0;
    int forwardValue1540_35_1;
    int forwardValue1540_37_0;
    int forwardValue1540_39_0;
    boolean spill1540_0;
    int spill1540_1;
    int spill1540_2;
    int spill1540_3;
    long life6_3;
    int life9_7;
    int life10_12;
    int life8_13;
    forward_join_39: {
    forward_join_38: {
    forward_join_37: {
    forward_join_35: {
    forward_join_28: {
    forward_join_22: {
    life6_3 = (moom.Br.k ^ 39603185258585L);
    life9_7 = (p0 - p2);
    spill1540_0 = net.minecraft.server.management.ServerConfigurationManager.b__Boolean();
    life10_12 = (p1 - p3);
    life8_13 = ((spill1540_0) ? 1 : 0);
    spill1540_1 = life9_7;
    spill1540_2 = (-p4);
    if (!((life8_13 == 0))) {
        forwardValue1540_22_0 = spill1540_1;
        forwardValue1540_22_1 = spill1540_2;
        break forward_join_22;
    }
    if (!((spill1540_1 >= spill1540_2))) {
        break forward_join_38;
    }
    forwardValue1540_22_0 = life9_7;
    forwardValue1540_22_1 = p4;
    }
    if (!((life8_13 == 0))) {
        forwardValue1540_28_0 = forwardValue1540_22_0;
        forwardValue1540_28_1 = forwardValue1540_22_1;
        break forward_join_28;
    }
    if (!((forwardValue1540_22_0 <= forwardValue1540_22_1))) {
        break forward_join_38;
    }
    forwardValue1540_28_0 = life10_12;
    forwardValue1540_28_1 = (-p4);
    }
    if (!((life8_13 == 0))) {
        forwardValue1540_35_0 = forwardValue1540_28_0;
        forwardValue1540_35_1 = forwardValue1540_28_1;
        break forward_join_35;
    }
    if (!((forwardValue1540_28_0 >= forwardValue1540_28_1))) {
        break forward_join_38;
    }
    spill1540_3 = life10_12;
    if (!((life8_13 == 0))) {
        forwardValue1540_37_0 = spill1540_3;
        break forward_join_37;
    }
    forwardValue1540_35_0 = spill1540_3;
    forwardValue1540_35_1 = p4;
    }
    if (!((forwardValue1540_35_0 <= forwardValue1540_35_1))) {
        break forward_join_38;
    }
    forwardValue1540_37_0 = 1;
    }
    forwardValue1540_39_0 = forwardValue1540_37_0;
    break forward_join_39;
    }
    forwardValue1540_39_0 = 0;
    }
    return ((forwardValue1540_39_0) != 0);
}


public void a(moom.DT p0) {
moom.Bs forwardValue1543_27_0;
    boolean spill1543_0;
    moom.Bs spill1543_1;
    long life2_3;
    int life5_8;
    int life6_13;
    moom.Bs life7_20;
    int life4_21;
    forward_join_46: {
    forward_join_27: {
    life2_3 = (moom.Br.k ^ 125073006351940L);
    life5_8 = (((moom.DT)(p0)).a() >> 4);
    life6_13 = (((moom.DT)(p0)).c() >> 4);
    spill1543_0 = net.minecraft.server.management.ServerConfigurationManager.b__Boolean();
    life7_20 = this.a(((int)(life5_8)), ((int)(life6_13)), ((boolean)(false)));
    life4_21 = ((spill1543_0) ? 1 : 0);
    spill1543_1 = life7_20;
    if (!((life4_21 == 0))) {
        forwardValue1543_27_0 = spill1543_1;
        break forward_join_27;
    }
    if (!((spill1543_1 != null))) {
        break forward_join_46;
    }
    forwardValue1543_27_0 = life7_20;
    }
    ((moom.Bs)(forwardValue1543_27_0)).a(((int)((((moom.DT)(p0)).a() & __sourceIntrinsic_760187f91cdd_invokedynamic1543_7(32544, (2421724257994391492L ^ life2_3))))), ((int)(((moom.DT)(p0)).b())), ((int)((((moom.DT)(p0)).c() & __sourceIntrinsic_760187f91cdd_invokedynamic1543_10(21404, (8970450321710191479L ^ life2_3))))));
    }
    return;
}


public void a__Void(net.minecraft.entity.player.EntityPlayerMP p0) {
int forestValue594_65_0;
    int forestValue594_65_1;
    int forestValue594_117_0;
    int forestValue594_128_0;
    boolean spill594_0;
    int spill594_1;
    int spill594_2;
    int spill594_3;
    int spill594_4;
    int spill594_5;
    int spill594_6;
    long life2_3;
    int life5_9;
    int life6_15;
    int life7_33;
    int life8_37;
    int life9_41;
    int life10_45;
    int life11_49;
    int life4_50;
    java.util.Set life12_54;
    int life13_59;
    int life14_72;
    forest_join_128: {
    forest_join_124: {
    life2_3 = (moom.Br.k ^ 99306047619982L);
    life5_9 = (((int) ((net.minecraft.entity.player.EntityPlayerMP)(p0)).n) >> 4);
    life6_15 = (((int) ((net.minecraft.entity.player.EntityPlayerMP)(p0)).p) >> 4);
    ((net.minecraft.entity.player.EntityPlayerMP)(p0)).cj = ((double)(((net.minecraft.entity.player.EntityPlayerMP)(p0)).n));
    ((net.minecraft.entity.player.EntityPlayerMP)(p0)).ck = ((double)(((net.minecraft.entity.player.EntityPlayerMP)(p0)).p));
    spill594_0 = net.minecraft.server.management.ServerConfigurationManager.b__Boolean();
    life7_33 = java.lang.Math.min(((int)(this.g)), ((int)(__sourceIntrinsic_92ceef1f6e69_invokedynamic594_9(5366, (41719933472621012L ^ life2_3)))));
    life8_37 = (life5_9 - life7_33);
    life9_41 = (life5_9 + life7_33);
    life10_45 = (life6_15 - life7_33);
    life11_49 = (life6_15 + life7_33);
    life4_50 = ((spill594_0) ? 1 : 0);
    life12_54 = this.a(((net.minecraft.entity.player.EntityPlayerMP)(p0)));
    life13_59 = (life5_9 - this.g);
    forest_cycle_60: while (true) {
    forest_join_121: {
    forestValue594_65_0 = life13_59;
    forestValue594_65_1 = (life5_9 + this.g);
    forest_cycle_65: while (true) {
    if (!((forestValue594_65_0 <= forestValue594_65_1))) {
        break forest_join_124;
    }
    spill594_1 = (life6_15 - this.g);
    if (!((life4_50 == 0))) {
        forestValue594_128_0 = spill594_1;
        break forest_join_128;
    }
    life14_72 = spill594_1;
    forest_cycle_73: while (true) {
    forest_join_118: {
    forest_join_117: {
    forest_join_110: {
    if (!((life14_72 <= (life6_15 + this.g)))) {
        break forest_join_121;
    }
    spill594_2 = life13_59;
    if (!((life4_50 == 0))) {
        forestValue594_117_0 = spill594_2;
        break forest_join_117;
    }
    spill594_3 = life8_37;
    if (!((life4_50 == 0))) {
        forestValue594_65_0 = spill594_2;
        forestValue594_65_1 = spill594_3;
        continue forest_cycle_65;
    }
    if (!((spill594_2 >= spill594_3))) {
        break forest_join_110;
    }
    spill594_4 = life13_59;
    if (!((life4_50 == 0))) {
        forestValue594_117_0 = spill594_4;
        break forest_join_117;
    }
    if (!((spill594_4 <= life9_41))) {
        break forest_join_110;
    }
    spill594_5 = life14_72;
    if (!((life4_50 == 0))) {
        forestValue594_117_0 = spill594_5;
        break forest_join_117;
    }
    if (!((spill594_5 >= life10_45))) {
        break forest_join_110;
    }
    spill594_6 = life14_72;
    if (!((life4_50 == 0))) {
        forestValue594_117_0 = spill594_6;
        break forest_join_117;
    }
    if (!((spill594_6 <= life11_49))) {
        break forest_join_110;
    }
    ((moom.Bs)(this.a(((int)(life13_59)), ((int)(life14_72)), ((boolean)(true))))).a(((net.minecraft.entity.player.EntityPlayerMP)(p0)));
    if (!((life4_50 != 0))) {
        break forest_join_118;
    }
    }
    forestValue594_117_0 = ((((java.util.Set)(life12_54)).add(((java.lang.Object)(new moom.Ee(life13_59, life14_72))))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forestValue594_117_0);
    }
    life14_72 += 1;
    if (!((life4_50 != 0))) {
        continue forest_cycle_73;
    }
    break forest_cycle_73;
    }
    break forest_cycle_65;
    }
    }
    life13_59 += 1;
    if (!((life4_50 != 0))) {
        continue forest_cycle_60;
    }
    break forest_cycle_60;
    }
    }
    forestValue594_128_0 = ((((java.util.List)(this.c)).add(((java.lang.Object)(p0)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forestValue594_128_0);
    this.b(((net.minecraft.entity.player.EntityPlayerMP)(p0)));
    return;
}


private java.util.Set<moom.Ee> a(net.minecraft.entity.player.EntityPlayerMP p0) {
java.util.Set forwardValue1544_17_0;
    boolean spill1544_0;
    java.util.Set spill1544_1;
    long life2_3;
    java.util.Set life5_10;
    int life4_11;
    int life6_29;
    int life7_36;
    int life8_42;
    int life9_50;
    int life9_58;
    java.util.HashSet life10_63;
    forward_join_18: {
    forward_join_17: {
    life2_3 = (moom.Br.k ^ 37542769733456L);
    spill1544_0 = net.minecraft.server.management.ServerConfigurationManager.b__Boolean();
    life5_10 = ((java.util.Set)(((java.util.Map)(this.j)).get(((java.lang.Object)(p0)))));
    life4_11 = ((spill1544_0) ? 1 : 0);
    spill1544_1 = life5_10;
    if (!((life4_11 == 0))) {
        forwardValue1544_17_0 = spill1544_1;
        break forward_join_17;
    }
    if (!((spill1544_1 != null))) {
        break forward_join_18;
    }
    forwardValue1544_17_0 = life5_10;
    }
    return forwardValue1544_17_0;
    }
    life6_29 = java.lang.Math.min(((int)(this.g)), ((int)(__sourceIntrinsic_2abb72b2cc8f_invokedynamic1544_7(8860, (4142029920639097701L ^ life2_3)))));
    life7_36 = ((this.g * 2) + 1);
    life8_42 = ((life6_29 * 2) + 1);
    life9_50 = ((life7_36 * life7_36) - (life8_42 * life8_42));
    life9_58 = java.lang.Math.max(((int)(life9_50)), ((int)(__sourceIntrinsic_2abb72b2cc8f_invokedynamic1544_10(1493, (3813455577096731693L ^ life2_3)))));
    life10_63 = new java.util.HashSet(life9_58);
    ((java.util.Map)(this.j)).put(((java.lang.Object)(p0)), ((java.lang.Object)(life10_63)));
    return life10_63;
}


private java.util.PriorityQueue<moom.Ee> a(java.util.Set<moom.Ee> p0, net.minecraft.entity.player.EntityPlayerMP p1, int p2) {
float lexicalValue510_36_0;
    java.lang.Object lexicalValue510_93_0;
    int lexicalValue510_108_0;
    java.util.PriorityQueue lexicalValue510_112_0;
    boolean spill510_0;
    float spill510_1;
    java.util.PriorityQueue spill510_2;
    int spill510_3;
    long life4_3;
    float life7_9;
    int life6_10;
    double life8_42;
    double life10_46;
    double life12_50;
    moom.Ja life14_60;
    java.util.Comparator life15_63;
    java.util.PriorityQueue life16_69;
    java.util.Iterator life17_72;
    moom.Ee life18_79;
    moom.Ee life19_109;
    lexical_join_112: {
    lexical_join_111: {
    lexical_join_36: {
    lexical_join_35: {
    lexical_join_23: {
    life4_3 = (moom.Br.k ^ 101258987764L);
    spill510_0 = net.minecraft.server.management.ServerConfigurationManager.c__Boolean();
    life7_9 = (((net.minecraft.entity.player.EntityPlayerMP)(p1)).w + 0x1.68p6f);
    life6_10 = ((spill510_0) ? 1 : 0);
    lexical_cycle_11: while (true) {
    if (!((recovery.source.CarrierOps.fcmpg(((float)(life7_9)), ((float)(-0x1.68p7f))) <= 0))) {
        break lexical_join_23;
    }
    life7_9 = (life7_9 + 0x1.68p8f);
    if (!((life6_10 != 0))) {
        break lexical_join_35;
    }
    if (!((life6_10 == 0))) { continue lexical_cycle_11; }
    break lexical_cycle_11;
    }
    }
    lexical_cycle_23: while (true) {
    if (!((recovery.source.CarrierOps.fcmpl(((float)(life7_9)), ((float)(0x1.68p7f))) > 0))) {
        break lexical_join_35;
    }
    spill510_1 = (life7_9 - 0x1.68p8f);
    if (!((life6_10 != 0))) {
        lexicalValue510_36_0 = spill510_1;
        break lexical_join_36;
    }
    life7_9 = spill510_1;
    if (!((life6_10 == 0))) { continue lexical_cycle_23; }
    break lexical_cycle_23;
    }
    }
    lexicalValue510_36_0 = life7_9;
    }
    life8_42 = (((double) lexicalValue510_36_0) * 0x1.1df46a2529d39p-6d);
    life10_46 = ((double) ((net.minecraft.entity.player.EntityPlayerMP)(p1)).x);
    life12_50 = (life10_46 * 0x1.1df46a2529d39p-6d);
    life14_60 = new moom.Ja(((net.minecraft.entity.player.EntityPlayerMP)(p1)).W, ((net.minecraft.entity.player.EntityPlayerMP)(p1)).Y, life8_42, life12_50);
    life15_63 = java.util.Collections.reverseOrder(((java.util.Comparator)(life14_60)));
    life16_69 = new java.util.PriorityQueue(p2, life15_63);
    life17_72 = ((java.util.Set)(p0)).iterator();
    lexical_cycle_70: while (true) {
    lexical_join_109: {
    lexical_join_108: {
    lexical_join_93: {
    lexical_join_91: {
    if (!(((java.util.Iterator)(life17_72)).hasNext())) {
        break lexical_join_111;
    }
    life18_79 = ((moom.Ee)(((java.util.Iterator)(life17_72)).next()));
    spill510_2 = life16_69;
    if (!((life6_10 != 0))) {
        lexicalValue510_112_0 = spill510_2;
        break lexical_join_112;
    }
    if (!((life6_10 != 0))) {
        lexicalValue510_93_0 = spill510_2;
        break lexical_join_93;
    }
    if (!((((java.util.PriorityQueue)(spill510_2)).size() < p2))) {
        break lexical_join_91;
    }
    ((java.util.PriorityQueue)(life16_69)).add(((java.lang.Object)(life18_79)));
    if (!((life6_10 == 0))) {
        break lexical_join_109;
    }
    }
    lexicalValue510_93_0 = ((java.util.PriorityQueue)(life16_69)).peek();
    }
    life19_109 = ((moom.Ee)(lexicalValue510_93_0));
    spill510_3 = ((moom.Ja)(life14_60)).a(((moom.Ee)(life18_79)), ((moom.Ee)(life19_109)));
    if (!((life6_10 != 0))) {
        lexicalValue510_108_0 = spill510_3;
        break lexical_join_108;
    }
    if (!((spill510_3 < 0))) {
        break lexical_join_109;
    }
    ((java.util.PriorityQueue)(life16_69)).remove();
    lexicalValue510_108_0 = ((((java.util.PriorityQueue)(life16_69)).add(((java.lang.Object)(life18_79)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(lexicalValue510_108_0);
    }
    if (!((life6_10 == 0))) { continue lexical_cycle_70; }
    break lexical_cycle_70;
    }
    }
    lexicalValue510_112_0 = life16_69;
    }
    return lexicalValue510_112_0;
}


public static int a(int p0) {
long local1 = (moom.Br.k ^ 62891219902810L);
    return ((p0 * __sourceIntrinsic_5c51e7cdc795_originalDynamicSite1069_1(31154, (1205848933329407555L ^ local1))) - __sourceIntrinsic_5c51e7cdc795_originalDynamicSite1069_2(31154, (1205848933329407555L ^ local1)));
}


private moom.Bs a(int p0, int p1, boolean p2) {
int forwardValue1541_60_0;
    moom.Bs forwardValue1541_62_0;
    boolean spill1541_0;
    moom.Bs spill1541_1;
    boolean spill1541_2;
    long life4_3;
    long life7_28;
    int life6_29;
    moom.Bs life9_35;
    forward_join_62: {
    forward_join_61: {
    forward_join_60: {
    life4_3 = (moom.Br.k ^ 111580142503436L);
    spill1541_0 = net.minecraft.server.management.ServerConfigurationManager.c__Boolean();
    life7_28 = ((((long) p0) + __sourceIntrinsic_124859ce1ea3_invokedynamic1541_2(14825, (7760604983115504902L ^ life4_3))) | ((((long) p1) + __sourceIntrinsic_124859ce1ea3_invokedynamic1541_3(14825, (7760604983115504902L ^ life4_3))) << __sourceIntrinsic_124859ce1ea3_invokedynamic1541_4(11413, (7297722854776323127L ^ life4_3))));
    life6_29 = ((spill1541_0) ? 1 : 0);
    life9_35 = ((moom.Bs)(((moom.Do)(this.d)).a__Object(((long)(life7_28)))));
    spill1541_1 = life9_35;
    if (!((life6_29 != 0))) {
        forwardValue1541_62_0 = spill1541_1;
        break forward_join_62;
    }
    if (!((spill1541_1 == null))) {
        break forward_join_61;
    }
    spill1541_2 = p2;
    if (!((life6_29 != 0))) {
        forwardValue1541_60_0 = ((spill1541_2) ? 1 : 0);
        break forward_join_60;
    }
    if (!(spill1541_2)) {
        break forward_join_61;
    }
    life9_35 = new moom.Bs(this, p0, p1);
    ((moom.Do)(this.d)).a(((long)(life7_28)), ((java.lang.Object)(life9_35)));
    forwardValue1541_60_0 = ((((java.util.List)(this.f)).add(((java.lang.Object)(life9_35)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue1541_60_0);
    }
    forwardValue1541_62_0 = life9_35;
    }
    return forwardValue1541_62_0;
}


private static native <E extends Throwable> int __sourceIntrinsic_5c51e7cdc795_originalDynamicSite1069_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5c51e7cdc795_originalDynamicSite1069_2(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_425aa30d62d0_invokedynamic3975_1(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_425aa30d62d0_invokedynamic3975_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_425aa30d62d0_invokedynamic3975_3(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_124859ce1ea3_invokedynamic1541_2(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_124859ce1ea3_invokedynamic1541_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_124859ce1ea3_invokedynamic1541_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral3978_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_760187f91cdd_invokedynamic1543_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_760187f91cdd_invokedynamic1543_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2abb72b2cc8f_invokedynamic1544_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2abb72b2cc8f_invokedynamic1544_10(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_b82a5b29b709_invokedynamic511_34(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6fc3381d0590_invokedynamic223_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_92ceef1f6e69_invokedynamic594_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral3971_0() throws E;

private static native moom.Bl __sourceExactCall_c05be346191bb1(net.minecraft.world.WorldServer p0);
private static native int __sourceExactCall_2953e295adc522(int p0, long p1);
}
