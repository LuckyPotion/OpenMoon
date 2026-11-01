package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public abstract class F4 extends moom.F0 {

protected final int c;

protected final net.minecraft.block.state.IBlockState d;

protected final net.minecraft.block.state.IBlockState e;

protected int f;

private static final long k;

private static final long[] m;

private static final java.lang.Integer[] n;

private static final java.util.Map o;

public F4(boolean p0, int p1, int p2, net.minecraft.block.state.IBlockState p3, net.minecraft.block.state.IBlockState p4) {
super(p0);
    this.c = p1;
    this.f = p2;
    this.d = p3;
    this.e = p4;
}


static {
k = ((long)(((moom._a)(moom._c.a(((long)(-8820657553564252797L)), ((long)(-653088423733201587L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(125392715925668L)))));
    o = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.F4.k ^ 5529454824498L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill528_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill528_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill528_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill528_14 = new byte[8];
    (__sourceSpill528_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill528_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation528_16 = __sourceSpill528_14;
    ((javax.crypto.Cipher)(__sourceSpill528_11)).init(((int)(__sourceSpill528_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill528_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation528_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "\027¦\037\\\001ïb'½ëÄ¼¸îW"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill528_25 = local6_life21;
        int __sourceSpill528_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill528_25)).substring(((int)(__sourceSpill528_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill528_30 = local8_life19;
        int __sourceSpill528_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill528_33 = new byte[8];
        (__sourceSpill528_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill528_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill528_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill528_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill528_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill528_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill528_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill528_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill528_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill528_34)).doFinal(((byte[])(__sourceSpill528_33)));
        (__sourceSpill528_30)[__sourceSpill528_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    m = ((long[])(local8_life19));
    n = ((java.lang.Integer[])(new java.lang.Integer[2]));
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


protected void b(net.minecraft.world.World p0, moom.DT p1, int p2) {
int forestValue612_15_0;
    int forestValue612_15_1;
    moom.fn forestValue612_52_0;
    moom.fn forestValue612_52_1;
    int[] spill612_0;
    int spill612_1;
    int spill612_2;
    moom.fn spill612_3;
    moom.fn spill612_4;
    long life4_3;
    int life7_8;
    int[] life6_9;
    int life8_12;
    int life9_18;
    moom.DT life10_38;
    moom.fn life11_44;
    forest_join_65: {
    life4_3 = (moom.F4.k ^ 88484999746930L);
    spill612_0 = moom.FY.b();
    life7_8 = (p2 * p2);
    life6_9 = spill612_0;
    life8_12 = (-p2);
    forest_cycle_13: while (true) {
    forest_join_62: {
    forestValue612_15_0 = life8_12;
    forestValue612_15_1 = p2;
    forest_cycle_15: while (true) {
    if (!((forestValue612_15_0 <= forestValue612_15_1))) {
        break forest_join_65;
    }
    life9_18 = (-p2);
    forest_cycle_19: while (true) {
    forest_join_59: {
    forest_join_53: {
    forest_join_52: {
    if (!((life9_18 <= p2))) {
        break forest_join_62;
    }
    spill612_1 = ((life8_12 * life8_12) + (life9_18 * life9_18));
    spill612_2 = life7_8;
    if (!((life6_9 != null))) {
        forestValue612_15_0 = spill612_1;
        forestValue612_15_1 = spill612_2;
        continue forest_cycle_15;
    }
    if (!((spill612_1 <= spill612_2))) {
        break forest_join_59;
    }
    life10_38 = ((moom.DT)(p1)).a(((int)(life8_12)), ((int)(0)), ((int)(life9_18)));
    life11_44 = ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life10_38))))).a__ch())).a__fn();
    spill612_3 = life11_44;
    spill612_4 = moom.fn.a;
    if (!((life6_9 != null))) {
        forestValue612_52_0 = spill612_3;
        forestValue612_52_1 = spill612_4;
        break forest_join_52;
    }
    if (!((spill612_3 != spill612_4))) {
        break forest_join_53;
    }
    forestValue612_52_0 = life11_44;
    forestValue612_52_1 = moom.fn.j;
    }
    if (!((forestValue612_52_0 == forestValue612_52_1))) {
        break forest_join_59;
    }
    }
    ((moom.F4)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(life10_38)), ((net.minecraft.block.state.IBlockState)(this.e)));
    }
    life9_18 += 1;
    if (!((life6_9 == null))) {
        continue forest_cycle_19;
    }
    break forest_cycle_19;
    }
    break forest_cycle_15;
    }
    }
    life8_12 += 1;
    if (!((life6_9 == null))) {
        continue forest_cycle_13;
    }
    break forest_cycle_13;
    }
    }
    return;
}


protected int a(java.util.Random p0) {
int forwardValue1872_27_0;
    int[] spill1872_0;
    int spill1872_1;
    long life2_3;
    int life5_11;
    int[] life4_12;
    forward_join_27: {
    forward_join_26: {
    life2_3 = (moom.F4.k ^ 134464691774259L);
    spill1872_0 = moom.FY.b();
    life5_11 = (((java.util.Random)(p0)).nextInt(((int)(3))) + this.c);
    life4_12 = spill1872_0;
    spill1872_1 = this.f;
    if (!((life4_12 != null))) {
        forwardValue1872_27_0 = spill1872_1;
        break forward_join_27;
    }
    if (!((spill1872_1 > 1))) {
        break forward_join_26;
    }
    life5_11 = (life5_11 + ((java.util.Random)(p0)).nextInt(((int)(this.f))));
    }
    forwardValue1872_27_0 = life5_11;
    }
    return forwardValue1872_27_0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 3146;
      if (n[var3] == null) {
         byte[] var4 = new byte[]{
            (byte)(p1 >>> 56),
            (byte)(p1 >>> 48),
            (byte)(p1 >>> 40),
            (byte)(p1 >>> 32),
            (byte)(p1 >>> 24),
            (byte)(p1 >>> 16),
            (byte)(p1 >>> 8),
            (byte)p1
         };
         long var5 = m[var3];
         byte[] var7 = new byte[]{
            (byte)(var5 >>> 56),
            (byte)(var5 >>> 48),
            (byte)(var5 >>> 40),
            (byte)(var5 >>> 32),
            (byte)(var5 >>> 24),
            (byte)(var5 >>> 16),
            (byte)(var5 >>> 8),
            (byte)var5
         };
         Long var8 = Thread.currentThread().getId();
         Object[] var9 = (Object[])o.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               o.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/F4", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         n[var3] = var15;
      }

      return n[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.F4.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral4432_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/F4"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


protected boolean a(net.minecraft.world.World p0, java.util.Random p1, moom.DT p2, int p3) {
int forwardValue1874_18_0;
    int forwardValue1874_22_0;
    int forwardValue1874_24_0;
    boolean spill1874_0;
    long life5_3;
    int[] life7_5;
    forward_join_24: {
    forward_join_23: {
    forward_join_22: {
    forward_join_18: {
    life5_3 = (moom.F4.k ^ 54470378858878L);
    life7_5 = moom.FY.b();
    spill1874_0 = ((moom.F4)(this)).a__Boolean(((net.minecraft.world.World)(p0)), ((moom.DT)(p2)), ((int)(p3)));
    if (!((life7_5 != null))) {
        forwardValue1874_18_0 = ((spill1874_0) ? 1 : 0);
        break forward_join_18;
    }
    if (!(spill1874_0)) {
        break forward_join_23;
    }
    forwardValue1874_18_0 = ((((moom.F4)(this)).a(((moom.DT)(p2)), ((net.minecraft.world.World)(p0)))) ? 1 : 0);
    }
    if (!((life7_5 != null))) {
        forwardValue1874_22_0 = forwardValue1874_18_0;
        break forward_join_22;
    }
    if (!((forwardValue1874_18_0 != 0))) {
        break forward_join_23;
    }
    forwardValue1874_22_0 = 1;
    }
    forwardValue1874_24_0 = forwardValue1874_22_0;
    break forward_join_24;
    }
    forwardValue1874_24_0 = 0;
    }
    return ((forwardValue1874_24_0) != 0);
}


protected void a(net.minecraft.world.World p0, moom.DT p1, int p2) {
int forestValue613_17_0;
    int forestValue613_17_1;
    int forestValue613_55_0;
    int forestValue613_55_1;
    int forestValue613_66_0;
    int forestValue613_66_1;
    int forestValue613_77_0;
    int forestValue613_77_1;
    moom.fn forestValue613_97_0;
    moom.fn forestValue613_97_1;
    int[] spill613_0;
    int spill613_1;
    int spill613_2;
    moom.fn spill613_3;
    moom.fn spill613_4;
    long life4_3;
    int life7_8;
    int[] life6_9;
    int life8_12;
    int life9_20;
    int life10_29;
    int life11_33;
    moom.DT life12_89;
    moom.fn life13_95;
    forest_join_110: {
    life4_3 = (moom.F4.k ^ 84842047298101L);
    spill613_0 = moom.FY.b();
    life7_8 = (p2 * p2);
    life6_9 = spill613_0;
    life8_12 = (-p2);
    forest_cycle_13: while (true) {
    forest_join_107: {
    forestValue613_17_0 = life8_12;
    forestValue613_17_1 = (p2 + 1);
    forest_cycle_17: while (true) {
    if (!((forestValue613_17_0 <= forestValue613_17_1))) {
        break forest_join_110;
    }
    life9_20 = (-p2);
    forest_cycle_21: while (true) {
    forest_join_104: {
    forest_join_98: {
    forest_join_97: {
    forest_join_78: {
    forest_join_77: {
    forest_join_66: {
    forest_join_55: {
    if (!((life9_20 <= (p2 + 1)))) {
        break forest_join_107;
    }
    life10_29 = (life8_12 - 1);
    life11_33 = (life9_20 - 1);
    spill613_1 = ((life8_12 * life8_12) + (life9_20 * life9_20));
    spill613_2 = life7_8;
    if (!((life6_9 != null))) {
        forestValue613_17_0 = spill613_1;
        forestValue613_17_1 = spill613_2;
        continue forest_cycle_17;
    }
    if (!((life6_9 != null))) {
        forestValue613_55_0 = spill613_1;
        forestValue613_55_1 = spill613_2;
        break forest_join_55;
    }
    if (!((spill613_1 > spill613_2))) {
        break forest_join_78;
    }
    forestValue613_55_0 = ((life10_29 * life10_29) + (life11_33 * life11_33));
    forestValue613_55_1 = life7_8;
    }
    if (!((life6_9 != null))) {
        forestValue613_66_0 = forestValue613_55_0;
        forestValue613_66_1 = forestValue613_55_1;
        break forest_join_66;
    }
    if (!((forestValue613_55_0 > forestValue613_55_1))) {
        break forest_join_78;
    }
    forestValue613_66_0 = ((life8_12 * life8_12) + (life11_33 * life11_33));
    forestValue613_66_1 = life7_8;
    }
    if (!((life6_9 != null))) {
        forestValue613_77_0 = forestValue613_66_0;
        forestValue613_77_1 = forestValue613_66_1;
        break forest_join_77;
    }
    if (!((forestValue613_66_0 > forestValue613_66_1))) {
        break forest_join_78;
    }
    forestValue613_77_0 = ((life10_29 * life10_29) + (life9_20 * life9_20));
    forestValue613_77_1 = life7_8;
    }
    if (!((forestValue613_77_0 <= forestValue613_77_1))) {
        break forest_join_104;
    }
    }
    life12_89 = ((moom.DT)(p1)).a(((int)(life8_12)), ((int)(0)), ((int)(life9_20)));
    life13_95 = ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life12_89))))).a__ch())).a__fn();
    spill613_3 = life13_95;
    spill613_4 = moom.fn.a;
    if (!((life6_9 != null))) {
        forestValue613_97_0 = spill613_3;
        forestValue613_97_1 = spill613_4;
        break forest_join_97;
    }
    if (!((spill613_3 != spill613_4))) {
        break forest_join_98;
    }
    forestValue613_97_0 = life13_95;
    forestValue613_97_1 = moom.fn.j;
    }
    if (!((forestValue613_97_0 == forestValue613_97_1))) {
        break forest_join_104;
    }
    }
    ((moom.F4)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(life12_89)), ((net.minecraft.block.state.IBlockState)(this.e)));
    }
    life9_20 += 1;
    if (!((life6_9 == null))) {
        continue forest_cycle_21;
    }
    break forest_cycle_21;
    }
    break forest_cycle_17;
    }
    }
    life8_12 += 1;
    if (!((life6_9 == null))) {
        continue forest_cycle_13;
    }
    break forest_cycle_13;
    }
    }
    return;
}


private boolean a(moom.DT p0, net.minecraft.world.World p1) {
net.minecraft.block.Block forwardValue1873_21_0;
    net.minecraft.block.Block forwardValue1873_21_1;
    int forwardValue1873_51_0;
    int[] spill1873_0;
    net.minecraft.block.Block spill1873_1;
    moom.dC spill1873_2;
    int spill1873_3;
    long life3_3;
    moom.DT life6_7;
    int[] life5_8;
    net.minecraft.block.Block life7_13;
    forward_join_51: {
    forward_join_50: {
    forward_join_22: {
    forward_join_21: {
    life3_3 = (moom.F4.k ^ 69882751002505L);
    spill1873_0 = moom.FY.b();
    life6_7 = ((moom.DT)(p0)).b__DT();
    life5_8 = spill1873_0;
    life7_13 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p1)).a__fE(((moom.DT)(life6_7))))).a__ch();
    spill1873_1 = life7_13;
    spill1873_2 = net.minecraft.init.Blocks.c;
    if (!((life5_8 != null))) {
        forwardValue1873_21_0 = spill1873_1;
        forwardValue1873_21_1 = spill1873_2;
        break forward_join_21;
    }
    if (!((spill1873_1 != spill1873_2))) {
        break forward_join_22;
    }
    forwardValue1873_21_0 = life7_13;
    forwardValue1873_21_1 = net.minecraft.init.Blocks.d;
    }
    if (!((forwardValue1873_21_0 == forwardValue1873_21_1))) {
        break forward_join_50;
    }
    }
    spill1873_3 = ((moom.DT)(p0)).b();
    if (!((life5_8 != null))) {
        forwardValue1873_51_0 = spill1873_3;
        break forward_join_51;
    }
    if (!((spill1873_3 >= 2))) {
        break forward_join_50;
    }
    ((moom.F4)(this)).a(((net.minecraft.world.World)(p1)), ((moom.DT)(life6_7)));
    ((moom.F4)(this)).a(((net.minecraft.world.World)(p1)), ((moom.DT)(((moom.DT)(life6_7)).f())));
    ((moom.F4)(this)).a(((net.minecraft.world.World)(p1)), ((moom.DT)(((moom.DT)(life6_7)).d__DT())));
    ((moom.F4)(this)).a(((net.minecraft.world.World)(p1)), ((moom.DT)(((moom.DT)(((moom.DT)(life6_7)).d__DT())).f())));
    return ((1) != 0);
    }
    forwardValue1873_51_0 = 0;
    }
    return ((forwardValue1873_51_0) != 0);
}


private boolean a__Boolean(net.minecraft.world.World p0, moom.DT p1, int p2) {
int forestValue249_31_0;
    int forestValue249_48_0;
    int forestValue249_60_0;
    int forestValue249_62_0;
    int forestValue249_72_0;
    int forestValue249_86_0;
    int forestValue249_115_0;
    int forestValue249_126_0;
    int forestValue249_128_0;
    int[] spill249_0;
    int spill249_1;
    int spill249_2;
    int spill249_3;
    int spill249_4;
    int spill249_5;
    int spill249_6;
    boolean spill249_7;
    long life4_3;
    int life7_6;
    int[] life6_7;
    int life8_32;
    int life9_39;
    int life10_67;
    int life11_81;
    forest_join_128: {
    forest_join_127: {
    forest_join_126: {
    forest_join_125: {
    life4_3 = (moom.F4.k ^ 74149577941479L);
    spill249_0 = moom.FY.b();
    life7_6 = 1;
    life6_7 = spill249_0;
    spill249_1 = ((moom.DT)(p1)).b();
    if (!((life6_7 != null))) {
        forestValue249_128_0 = spill249_1;
        break forest_join_128;
    }
    if (!((spill249_1 >= 1))) {
        break forest_join_127;
    }
    spill249_2 = ((((moom.DT)(p1)).b() + p2) + 1);
    if (!((life6_7 != null))) {
        forestValue249_128_0 = spill249_2;
        break forest_join_128;
    }
    if (!((spill249_2 <= __sourceIntrinsic_8e6e410e6c67_invokedynamic249_4(28946, (8059388739390806649L ^ life4_3))))) {
        break forest_join_127;
    }
    life8_32 = 0;
    forest_cycle_30: while (true) {
    forest_join_122: {
    forestValue249_31_0 = life8_32;
    forest_cycle_31: while (true) {
    forest_join_60: {
    forest_join_58: {
    forest_join_48: {
    forest_join_47: {
    if (!((forestValue249_31_0 <= (1 + p2)))) {
        break forest_join_125;
    }
    life9_39 = 2;
    spill249_3 = life8_32;
    if (!((life6_7 != null))) {
        forestValue249_126_0 = spill249_3;
        break forest_join_126;
    }
    if (!((life6_7 != null))) {
        forestValue249_48_0 = spill249_3;
        break forest_join_48;
    }
    if (!((spill249_3 == 0))) {
        break forest_join_47;
    }
    life9_39 = 1;
    if (!((life6_7 == null))) {
        break forest_join_58;
    }
    }
    forestValue249_48_0 = life8_32;
    }
    if (!((life6_7 != null))) {
        forestValue249_60_0 = forestValue249_48_0;
        break forest_join_60;
    }
    if (!((forestValue249_48_0 >= ((1 + p2) - 2)))) {
        break forest_join_58;
    }
    life9_39 = 2;
    }
    forestValue249_60_0 = (-life9_39);
    }
    life10_67 = forestValue249_60_0;
    forest_cycle_61: while (true) {
    forest_join_119: {
    forestValue249_62_0 = life10_67;
    forest_cycle_62: while (true) {
    forest_join_72: {
    if (!((forestValue249_62_0 <= life9_39))) {
        break forest_join_122;
    }
    spill249_4 = life7_6;
    if (!((life6_7 != null))) {
        forestValue249_31_0 = spill249_4;
        continue forest_cycle_31;
    }
    if (!((life6_7 != null))) {
        forestValue249_72_0 = spill249_4;
        break forest_join_72;
    }
    if (!((spill249_4 != 0))) {
        break forest_join_122;
    }
    forestValue249_72_0 = (-life9_39);
    }
    life11_81 = forestValue249_72_0;
    forest_cycle_73: while (true) {
    forest_join_116: {
    forest_join_115: {
    forest_join_114: {
    forest_join_86: {
    if (!((life11_81 <= life9_39))) {
        break forest_join_119;
    }
    spill249_5 = life7_6;
    if (!((life6_7 != null))) {
        forestValue249_62_0 = spill249_5;
        continue forest_cycle_62;
    }
    if (!((life6_7 != null))) {
        forestValue249_86_0 = spill249_5;
        break forest_join_86;
    }
    if (!((spill249_5 != 0))) {
        break forest_join_119;
    }
    forestValue249_86_0 = (((moom.DT)(p1)).b() + life8_32);
    }
    if (!((life6_7 != null))) {
        forestValue249_115_0 = forestValue249_86_0;
        break forest_join_115;
    }
    if (!((forestValue249_86_0 >= 0))) {
        break forest_join_114;
    }
    spill249_6 = (((moom.DT)(p1)).b() + life8_32);
    if (!((life6_7 != null))) {
        forestValue249_115_0 = spill249_6;
        break forest_join_115;
    }
    if (!((spill249_6 < __sourceIntrinsic_8e6e410e6c67_invokedynamic249_7(22749, (2693598837364044727L ^ life4_3))))) {
        break forest_join_114;
    }
    spill249_7 = ((moom.F4)(this)).a(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).a(((int)(life10_67)), ((int)(life8_32)), ((int)(life11_81)))))))).a__ch())));
    if (!((life6_7 != null))) {
        forestValue249_115_0 = ((spill249_7) ? 1 : 0);
        break forest_join_115;
    }
    if (!((!spill249_7))) {
        break forest_join_116;
    }
    }
    forestValue249_115_0 = 0;
    }
    life7_6 = forestValue249_115_0;
    }
    life11_81 += 1;
    if (!((life6_7 == null))) {
        continue forest_cycle_73;
    }
    break forest_cycle_73;
    }
    break forest_cycle_62;
    }
    }
    life10_67 += 1;
    if (!((life6_7 == null))) {
        continue forest_cycle_61;
    }
    break forest_cycle_61;
    }
    break forest_cycle_31;
    }
    }
    life8_32 += 1;
    if (!((life6_7 == null))) {
        continue forest_cycle_30;
    }
    break forest_cycle_30;
    }
    }
    forestValue249_126_0 = life7_6;
    }
    return ((forestValue249_126_0) != 0);
    }
    forestValue249_128_0 = 0;
    }
    return ((forestValue249_128_0) != 0);
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral4432_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8e6e410e6c67_invokedynamic249_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8e6e410e6c67_invokedynamic249_7(int a0, long a1) throws E;
}
