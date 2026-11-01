package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
class vi extends moom.uc {

private final moom.s7 c;

private int d;

private static final long e;

private static final long[] f;

private static final java.lang.Integer[] g;

private static final java.util.Map h;

public vi(moom.s7 p0) {
super();
    this.c = p0;
}


static {
e = ((long)(((moom._a)(moom._c.a(((long)(-3172753523311155035L)), ((long)(-6414109902254562511L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(280129665203966L)))));
    h = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.vi.e ^ 33915493951620L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1628_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1628_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1628_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1628_14 = new byte[8];
    (__sourceSpill1628_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1628_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1628_16 = __sourceSpill1628_14;
    ((javax.crypto.Cipher)(__sourceSpill1628_11)).init(((int)(__sourceSpill1628_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1628_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1628_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[6];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "Curîµ{ç1éCá\032F­\b'`ôË\026FL\021±B"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1628_25 = local6_life21;
        int __sourceSpill1628_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1628_25)).substring(((int)(__sourceSpill1628_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1628_30 = local8_life19;
        int __sourceSpill1628_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1628_33 = new byte[8];
        (__sourceSpill1628_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1628_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1628_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1628_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1628_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1628_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1628_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1628_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1628_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1628_34)).doFinal(((byte[])(__sourceSpill1628_33)));
        (__sourceSpill1628_30)[__sourceSpill1628_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "å?v§F9ET«LÁ 6¨"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1628_38 = local6_life21;
        int __sourceSpill1628_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1628_38)).substring(((int)(__sourceSpill1628_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1628_43 = local8_life19;
        int __sourceSpill1628_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1628_46 = new byte[8];
        (__sourceSpill1628_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1628_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1628_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1628_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1628_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1628_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1628_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1628_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1628_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1628_47)).doFinal(((byte[])(__sourceSpill1628_46)));
        (__sourceSpill1628_43)[__sourceSpill1628_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    f = ((long[])(local8_life19));
    g = ((java.lang.Integer[])(new java.lang.Integer[6]));
}


public void c() {
moom.vi forestValue514_18_0;
    int forestValue514_35_0;
    int forestValue514_35_1;
    int forestValue514_46_0;
    int forestValue514_53_0;
    int forestValue514_53_1;
    int forestValue514_122_0;
    int forestValue514_130_0;
    int forestValue514_138_0;
    int forestValue514_139_0;
    int forestValue514_143_0;
    int forestValue514_151_0;
    int forestValue514_152_0;
    int forestValue514_156_0;
    int forestValue514_164_0;
    int forestValue514_165_0;
    net.minecraft.entity.Entity[] spill514_0;
    moom.vi spill514_1;
    int spill514_2;
    int spill514_3;
    int spill514_4;
    int spill514_5;
    int spill514_6;
    boolean spill514_7;
    boolean spill514_8;
    long life1_3;
    net.minecraft.entity.Entity[] life3_11;
    net.minecraft.world.World life4_22;
    java.util.Random life5_26;
    moom.DT life6_32;
    int life7_34;
    int life8_50;
    int life9_71;
    moom.DT life10_96;
    net.minecraft.block.state.IBlockState life11_100;
    forest_join_170: {
    forest_join_169: {
    forest_join_18: {
    life1_3 = (moom.vi.e ^ 55455116466675L);
    spill514_0 = moom.vN.b();
    moom.vi __stackOp514_2_0 = this;
    ((moom.vi)(__stackOp514_2_0)).d = ((int)((((moom.vi)(__stackOp514_2_0)).d - 1)));
    life3_11 = spill514_0;
    spill514_1 = this;
    if (!((life3_11 == null))) {
        forestValue514_18_0 = spill514_1;
        break forest_join_18;
    }
    if (!((((moom.vi)(spill514_1)).d <= 0))) {
        break forest_join_170;
    }
    forestValue514_18_0 = this;
    }
    life4_22 = ((moom.s7)(((moom.vi)(forestValue514_18_0)).c)).i;
    life5_26 = ((moom.s7)(this.c)).a__Random();
    life6_32 = new moom.DT(this.c);
    life7_34 = 0;
    forest_cycle_33: while (true) {
    forest_join_165: {
    forest_join_164: {
    forest_join_163: {
    forest_join_156: {
    forest_join_155: {
    forestValue514_35_0 = life7_34;
    forestValue514_35_1 = 5;
    forest_cycle_35: while (true) {
    forest_join_46: {
    if (!((forestValue514_35_0 <= forestValue514_35_1))) {
        break forest_join_170;
    }
    spill514_2 = life7_34;
    if (!((life3_11 == null))) {
        forestValue514_46_0 = spill514_2;
        break forest_join_46;
    }
    if (!((spill514_2 >= __sourceIntrinsic_5b7380e7aa7c_invokedynamic514_11(17698, (1927589411404833333L ^ life1_3))))) {
        break forest_join_170;
    }
    forestValue514_46_0 = 0;
    }
    life8_50 = forestValue514_46_0;
    forest_cycle_47: while (true) {
    forest_join_152: {
    forest_join_151: {
    forest_join_150: {
    forest_join_143: {
    forest_join_142: {
    forestValue514_53_0 = life8_50;
    forestValue514_53_1 = __sourceIntrinsic_5b7380e7aa7c_invokedynamic514_12(5783, (3955178977660023174L ^ life1_3));
    forest_cycle_53: while (true) {
    if (!((forestValue514_53_0 <= forestValue514_53_1))) {
        break forest_join_155;
    }
    spill514_3 = life8_50;
    if (!((life3_11 == null))) {
        forestValue514_156_0 = spill514_3;
        break forest_join_156;
    }
    spill514_4 = __sourceIntrinsic_5b7380e7aa7c_invokedynamic514_13(17511, (2609443982123492215L ^ life1_3));
    if (!((life3_11 == null))) {
        forestValue514_35_0 = spill514_3;
        forestValue514_35_1 = spill514_4;
        continue forest_cycle_35;
    }
    if (!((spill514_3 >= spill514_4))) {
        break forest_join_155;
    }
    life9_71 = 0;
    forest_cycle_67: while (true) {
    forest_join_139: {
    forest_join_138: {
    forest_join_137: {
    forest_join_130: {
    forest_join_129: {
    forest_join_123: {
    forest_join_122: {
    forest_join_113: {
    if (!((life9_71 <= __sourceIntrinsic_5b7380e7aa7c_invokedynamic514_14(14460, (5945304094416576362L ^ life1_3))))) {
        break forest_join_142;
    }
    spill514_5 = life9_71;
    if (!((life3_11 == null))) {
        forestValue514_143_0 = spill514_5;
        break forest_join_143;
    }
    spill514_6 = __sourceIntrinsic_5b7380e7aa7c_invokedynamic514_15(14117, (2600260902758551600L ^ life1_3));
    if (!((life3_11 == null))) {
        forestValue514_53_0 = spill514_5;
        forestValue514_53_1 = spill514_6;
        continue forest_cycle_53;
    }
    if (!((spill514_5 >= spill514_6))) {
        break forest_join_142;
    }
    life10_96 = ((moom.DT)(life6_32)).a(((int)(life8_50)), ((int)(life7_34)), ((int)(life9_71)));
    life11_100 = ((net.minecraft.world.World)(life4_22)).a__fE(((moom.DT)(life10_96)));
    if (!((((net.minecraft.block.state.IBlockState)(life11_100)).a__ch() == net.minecraft.init.Blocks.a4))) {
        break forest_join_129;
    }
    spill514_7 = ((net.minecraft.world.GameRules)(((net.minecraft.world.World)(life4_22)).a__Ej())).a__Boolean(((java.lang.String)("mobGriefing")));
    if (!((life3_11 == null))) {
        forestValue514_122_0 = ((spill514_7) ? 1 : 0);
        break forest_join_122;
    }
    if (!(spill514_7)) {
        break forest_join_113;
    }
    ((net.minecraft.world.World)(life4_22)).b(((moom.DT)(life10_96)), ((boolean)(true)));
    if (!((life3_11 != null))) {
        break forest_join_123;
    }
    }
    forestValue514_122_0 = ((((net.minecraft.world.World)(life4_22)).a(((moom.DT)(life10_96)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.BlockSilverfish$EnumType)(((net.minecraft.block.BlockSilverfish$EnumType)(((net.minecraft.block.state.IBlockState)(life11_100)).a(((net.minecraft.block.properties.IProperty)(moom.eh.Q))))))).a__fE())), ((int)(3)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forestValue514_122_0);
    }
    spill514_8 = ((java.util.Random)(life5_26)).nextBoolean();
    if (!((life3_11 == null))) {
        forestValue514_130_0 = ((spill514_8) ? 1 : 0);
        break forest_join_130;
    }
    if (!(spill514_8)) {
        break forest_join_129;
    }
    break forest_join_169;
    }
    forestValue514_130_0 = life9_71;
    }
    if (!((life3_11 == null))) {
        forestValue514_138_0 = forestValue514_130_0;
        break forest_join_138;
    }
    if (!((forestValue514_130_0 <= 0))) {
        break forest_join_137;
    }
    forestValue514_139_0 = (1 - life9_71);
    break forest_join_139;
    }
    forestValue514_138_0 = life9_71;
    }
    forestValue514_139_0 = (-forestValue514_138_0);
    }
    life9_71 = forestValue514_139_0;
    if (!((life3_11 != null))) {
        continue forest_cycle_67;
    }
    break forest_cycle_67;
    }
    break forest_cycle_53;
    }
    }
    forestValue514_143_0 = life8_50;
    }
    if (!((life3_11 == null))) {
        forestValue514_151_0 = forestValue514_143_0;
        break forest_join_151;
    }
    if (!((forestValue514_143_0 <= 0))) {
        break forest_join_150;
    }
    forestValue514_152_0 = (1 - life8_50);
    break forest_join_152;
    }
    forestValue514_151_0 = life8_50;
    }
    forestValue514_152_0 = (-forestValue514_151_0);
    }
    life8_50 = forestValue514_152_0;
    if (!((life3_11 != null))) {
        continue forest_cycle_47;
    }
    break forest_cycle_47;
    }
    break forest_cycle_35;
    }
    }
    forestValue514_156_0 = life7_34;
    }
    if (!((life3_11 == null))) {
        forestValue514_164_0 = forestValue514_156_0;
        break forest_join_164;
    }
    if (!((forestValue514_156_0 <= 0))) {
        break forest_join_163;
    }
    forestValue514_165_0 = (1 - life7_34);
    break forest_join_165;
    }
    forestValue514_164_0 = life7_34;
    }
    forestValue514_165_0 = (-forestValue514_164_0);
    }
    life7_34 = forestValue514_165_0;
    if (!((life3_11 != null))) {
        continue forest_cycle_33;
    }
    break forest_cycle_33;
    }
    break forest_join_170;
    }
    return;
    }
    return;
}


public void d__sourceReturn_da8c82d5d4() {
moom.vi forwardValue4324_12_0;
    moom.vi spill4324_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_18: {
    forward_join_12: {
    life1_3 = (moom.vi.e ^ 93675913297744L);
    life3_5 = moom.vN.b();
    spill4324_0 = this;
    if (!((life3_5 == null))) {
        forwardValue4324_12_0 = spill4324_0;
        break forward_join_12;
    }
    if (!((((moom.vi)(spill4324_0)).d == 0))) {
        break forward_join_18;
    }
    forwardValue4324_12_0 = this;
    }
    ((moom.vi)(forwardValue4324_12_0)).d = ((int)(__sourceIntrinsic_6cce62949456_invokedynamic4324_3(4066, (3815280949852704341L ^ life1_3))));
    }
    return;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.vi.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 21969;
      if (g[var3] == null) {
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
         long var5 = f[var3];
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
         Object[] var9 = (Object[])h.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               h.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/vi", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         g[var3] = var15;
      }

      return g[var3];
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral9495_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/vi"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public boolean a__Boolean() {
int forwardValue4322_12_0;
    int forwardValue4322_14_0;
    int spill4322_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_14: {
    forward_join_13: {
    forward_join_12: {
    life1_3 = (moom.vi.e ^ 17348059567041L);
    life3_5 = moom.vN.b();
    spill4322_0 = this.d;
    if (!((life3_5 == null))) {
        forwardValue4322_12_0 = spill4322_0;
        break forward_join_12;
    }
    if (!((spill4322_0 > 0))) {
        break forward_join_13;
    }
    forwardValue4322_12_0 = 1;
    }
    forwardValue4322_14_0 = forwardValue4322_12_0;
    break forward_join_14;
    }
    forwardValue4322_14_0 = 0;
    }
    return ((forwardValue4322_14_0) != 0);
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral9495_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b7380e7aa7c_invokedynamic514_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b7380e7aa7c_invokedynamic514_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b7380e7aa7c_invokedynamic514_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b7380e7aa7c_invokedynamic514_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b7380e7aa7c_invokedynamic514_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6cce62949456_invokedynamic4324_3(int a0, long a1) throws E;
}
