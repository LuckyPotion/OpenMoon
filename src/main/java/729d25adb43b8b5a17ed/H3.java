package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class H3 extends moom.H2 {

private int h;

private static final long i;

private static final long[] j;

private static final java.lang.Integer[] k;

private static final java.util.Map l;

public H3() {
super();
}


public H3(moom.H6 p0, int p1, java.util.Random p2, moom.G2 p3, moom.bs p4) {
super(p0, p1);
    this.b = p4;
    this.a = p3;
    this.h = java.lang.Math.max((p3).a(), (p3).c());
}


static {
i = ((long)(((moom._a)(moom._c.a(((long)(6470890163145156916L)), ((long)(-671257963562685543L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(49233008466979L)))));
    l = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.H3.i ^ 36886506211793L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill804_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill804_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill804_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill804_14 = new byte[8];
    (__sourceSpill804_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill804_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation804_16 = __sourceSpill804_14;
    ((javax.crypto.Cipher)(__sourceSpill804_11)).init(((int)(__sourceSpill804_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill804_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation804_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[5];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "~ÞbkN¼ç7y\030Úýiôº\"\bÇ\001´:"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill804_25 = local6_life21;
        int __sourceSpill804_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill804_25)).substring(((int)(__sourceSpill804_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill804_30 = local8_life19;
        int __sourceSpill804_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill804_33 = new byte[8];
        (__sourceSpill804_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill804_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill804_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill804_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill804_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill804_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill804_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill804_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill804_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill804_34)).doFinal(((byte[])(__sourceSpill804_33)));
        (__sourceSpill804_30)[__sourceSpill804_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "ágCzÈæ\017Çx\032\017Æ³á"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill804_38 = local6_life21;
        int __sourceSpill804_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill804_38)).substring(((int)(__sourceSpill804_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill804_43 = local8_life19;
        int __sourceSpill804_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill804_46 = new byte[8];
        (__sourceSpill804_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill804_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill804_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill804_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill804_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill804_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill804_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill804_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill804_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill804_47)).doFinal(((byte[])(__sourceSpill804_46)));
        (__sourceSpill804_43)[__sourceSpill804_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    j = ((long[])(local8_life19));
    k = ((java.lang.Integer[])(new java.lang.Integer[5]));
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4715_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/H3"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 18607;
      if (k[var3] == null) {
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
         long var5 = j[var3];
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
         Object[] var9 = (Object[])l.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               l.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/H3", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         k[var3] = var15;
      }

      return k[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_a40956c72202e0(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


protected void b(net.minecraft.nbt.NBTTagCompound p0) {
super.b(((net.minecraft.nbt.NBTTagCompound)(p0)));
    this.h = ((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Int(((java.lang.String)("Length")))));
    return;
}


public static moom.G2 a(moom.H6 p0, java.util.List<moom.G4> p1, java.util.Random p2, int p3, int p4, int p5, moom.bs p6) {
net.minecraft.entity.Entity[] spill727_0;
    long life7_3;
    int life10_15;
    net.minecraft.entity.Entity[] life9_16;
    moom.G2 life11_35;
    lexical_join_47: {
    life7_3 = (moom.H3.i ^ 82563519518736L);
    spill727_0 = moom.G4.b();
    life10_15 = (__sourceIntrinsic_1159b7d74b22_invokedynamic727_2(7020, (8393785297997608953L ^ life7_3)) * moom.Dr.a(((java.util.Random)(p2)), ((int)(3)), ((int)(5))));
    life9_16 = spill727_0;
    lexical_cycle_17: while (true) {
    lexical_join_45: {
    lexical_join_44: {
    if (!((life10_15 >= __sourceIntrinsic_1159b7d74b22_invokedynamic727_4(1255, (6200612406797969524L ^ life7_3))))) {
        break lexical_join_47;
    }
    life11_35 = moom.G2.a(((int)(p3)), ((int)(p4)), ((int)(p5)), ((int)(0)), ((int)(0)), ((int)(0)), ((int)(3)), ((int)(3)), ((int)(life10_15)), ((moom.bs)(p6)));
    if (!((life9_16 != null))) {
        break lexical_join_45;
    }
    if (!((__sourceExactCall_21e7c855759262(((java.util.List)(p1)), ((moom.G2)(life11_35))) == null))) {
        break lexical_join_44;
    }
    return life11_35;
    }
    life10_15 += -7;
    }
    if (!((life9_16 == null))) { continue lexical_cycle_17; }
    break lexical_cycle_17;
    }
    }
    return null;
}


protected void a(net.minecraft.nbt.NBTTagCompound p0) {
super.a(((net.minecraft.nbt.NBTTagCompound)(p0)));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Void(((java.lang.String)("Length")), ((int)(this.h)));
    return;
}


public boolean a__Boolean(net.minecraft.world.World p0, java.util.Random p1, moom.G2 p2) {
int forestValue667_21_0;
    int forestValue667_80_0;
    net.minecraft.entity.Entity[] spill667_0;
    int spill667_1;
    boolean spill667_2;
    long life4_3;
    net.minecraft.block.state.IBlockState life7_8;
    net.minecraft.block.state.IBlockState life8_14;
    int life9_18;
    net.minecraft.entity.Entity[] life6_19;
    int life10_30;
    moom.DT life11_46;
    moom.DT life11_60;
    forest_join_80: {
    forest_join_79: {
    life4_3 = (moom.H3.i ^ 17091659472643L);
    life7_8 = ((moom.H3)(this)).a(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.n)).a__fE())));
    spill667_0 = moom.G4.b();
    life8_14 = ((moom.H3)(this)).a(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())));
    life9_18 = ((moom.G2)(((moom.H3)(this)).a)).a;
    life6_19 = spill667_0;
    forest_cycle_20: while (true) {
    forest_join_76: {
    forestValue667_21_0 = life9_18;
    forest_cycle_21: while (true) {
    if (!((forestValue667_21_0 <= ((moom.G2)(((moom.H3)(this)).a)).d))) {
        break forest_join_79;
    }
    spill667_1 = ((moom.G2)(((moom.H3)(this)).a)).c;
    if (!((life6_19 != null))) {
        forestValue667_80_0 = spill667_1;
        break forest_join_80;
    }
    life10_30 = spill667_1;
    forest_cycle_31: while (true) {
    forest_join_74: {
    forest_join_73: {
    if (!((life10_30 <= ((moom.G2)(((moom.H3)(this)).a)).f))) {
        break forest_join_76;
    }
    life11_46 = new moom.DT(life9_18, __sourceIntrinsic_5ac1d031d896_invokedynamic667_16(3665, (5826373230369744341L ^ life4_3)), life10_30);
    if (!((life6_19 != null))) {
        break forest_join_74;
    }
    spill667_2 = ((moom.G2)(p2)).a(((moom.DS)(life11_46)));
    if (!((life6_19 != null))) {
        forestValue667_21_0 = ((spill667_2) ? 1 : 0);
        continue forest_cycle_21;
    }
    if (!(spill667_2)) {
        break forest_join_73;
    }
    life11_60 = ((moom.DT)(((net.minecraft.world.World)(p0)).c__DT(((moom.DT)(life11_46))))).b__DT();
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(life11_60)), ((net.minecraft.block.state.IBlockState)(life7_8)), ((int)(2)));
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(((moom.DT)(life11_60)).b__DT())), ((net.minecraft.block.state.IBlockState)(life8_14)), ((int)(2)));
    }
    life10_30 += 1;
    }
    if (!((life6_19 == null))) {
        continue forest_cycle_31;
    }
    break forest_cycle_31;
    }
    break forest_cycle_21;
    }
    }
    life9_18 += 1;
    if (!((life6_19 == null))) {
        continue forest_cycle_20;
    }
    break forest_cycle_20;
    }
    }
    forestValue667_80_0 = 1;
    }
    return ((forestValue667_80_0) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(moom.G4 p0, java.util.List<moom.G4> p1, java.util.Random p2) {
int forestValue275_222_0;
    int forestValue275_228_0;
    moom.G4 forestValue275_281_0;
    net.minecraft.entity.Entity[] spill275_0;
    moom.G4 spill275_1;
    moom.G4 spill275_2;
    int spill275_3;
    int spill275_4;
    int spill275_5;
    long life4_3;
    int life7_5;
    int life8_10;
    net.minecraft.entity.Entity[] life6_11;
    moom.G4 life9_30;
    int life8_64;
    moom.G4 life9_83;
    forest_join_328: {
    forest_join_306: {
    forest_join_284: {
    forest_join_281: {
    forest_join_260: {
    forest_join_238: {
    forest_join_228: {
    forest_join_222: {
    forest_join_221: {
    forest_join_199: {
    forest_join_177: {
    forest_join_153: {
    forest_join_131: {
    forest_join_110: {
    forest_join_59: {
    life4_3 = (moom.H3.i ^ 138555566085573L);
    life7_5 = 0;
    spill275_0 = __sourceExactCall_5d2e38afa74ebe();
    life8_10 = ((java.util.Random)(p2)).nextInt(((int)(5)));
    life6_11 = spill275_0;
    forest_cycle_12: while (true) {
    forest_join_57: {
    forest_join_49: {
    if (!((life8_10 < (this.h - __sourceIntrinsic_0f75cc6dd3c5_invokedynamic275_4(4351, (4365444014099001788L ^ life4_3)))))) {
        break forest_join_59;
    }
    life9_30 = ((moom.H3)(this)).a(((moom.H6)(((moom.H6)(p0)))), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)(0)), ((int)(life8_10)));
    if (!((life6_11 != null))) {
        break forest_join_57;
    }
    spill275_1 = life9_30;
    if (!((life6_11 != null))) {
        forestValue275_281_0 = spill275_1;
        break forest_join_281;
    }
    if (!((spill275_1 != null))) {
        break forest_join_49;
    }
    life8_10 = (life8_10 + java.lang.Math.max(((int)(((moom.G2)(((moom.G4)(life9_30)).a)).a())), ((int)(((moom.G2)(((moom.G4)(life9_30)).a)).c()))));
    life7_5 = 1;
    }
    life8_10 = (life8_10 + (2 + ((java.util.Random)(p2)).nextInt(((int)(5)))));
    }
    if (!((life6_11 == null))) {
        continue forest_cycle_12;
    }
    break forest_cycle_12;
    }
    }
    life8_64 = ((java.util.Random)(p2)).nextInt(((int)(5)));
    forest_cycle_63: while (true) {
    forest_join_108: {
    forest_join_100: {
    if (!((life8_64 < (this.h - __sourceIntrinsic_0f75cc6dd3c5_invokedynamic275_15(7068, (4497613612447267549L ^ life4_3)))))) {
        break forest_join_110;
    }
    life9_83 = __sourceExactCall_e270d7cf159556(((moom.H3)(this)), ((moom.H6)(((moom.H6)(p0)))), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)(0)), ((int)(life8_64)));
    if (!((life6_11 != null))) {
        break forest_join_108;
    }
    spill275_2 = life9_83;
    if (!((life6_11 != null))) {
        forestValue275_281_0 = spill275_2;
        break forest_join_281;
    }
    if (!((spill275_2 != null))) {
        break forest_join_100;
    }
    life8_64 = (life8_64 + java.lang.Math.max(((int)(((moom.G2)(((moom.G4)(life9_83)).a)).a())), ((int)(((moom.G2)(((moom.G4)(life9_83)).a)).c()))));
    life7_5 = 1;
    }
    life8_64 = (life8_64 + (2 + ((java.util.Random)(p2)).nextInt(((int)(5)))));
    }
    if (!((life6_11 == null))) {
        continue forest_cycle_63;
    }
    break forest_cycle_63;
    }
    }
    spill275_3 = life7_5;
    if (!((life6_11 != null))) {
        forestValue275_222_0 = spill275_3;
        break forest_join_222;
    }
    if (!((spill275_3 != 0))) {
        break forest_join_221;
    }
    spill275_4 = ((java.util.Random)(p2)).nextInt(((int)(3)));
    if (!((life6_11 != null))) {
        forestValue275_222_0 = spill275_4;
        break forest_join_222;
    }
    if (!((spill275_4 > 0))) {
        break forest_join_221;
    }
    if (!((((moom.H3)(this)).b != null))) {
        break forest_join_221;
    }
    spill275_5 = (moom.IE.a)[((moom.bs)(((moom.H3)(this)).b)).ordinal()];
    if (!((life6_11 != null))) {
        forestValue275_222_0 = spill275_5;
        break forest_join_222;
    }
    switch (spill275_5) {
case 1:
{
        break forest_join_131;
    }
case 2:
{
        break forest_join_153;
    }
case 3:
{
        break forest_join_177;
    }
case 4:
{
        break forest_join_199;
    }
default:
{
        break forest_join_221;
    }
}
    }
    __sourceExactCall_a2b35a35ee714a(((moom.H6)(((moom.H6)(p0)))), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)((((moom.G2)(((moom.H3)(this)).a)).a - 1))), ((int)(((moom.G2)(((moom.H3)(this)).a)).b)), ((int)(((moom.G2)(((moom.H3)(this)).a)).c)), ((moom.bs)(moom.bs.WEST)), ((int)(__sourceExactCall_2602b40eda6d6e(((moom.H3)(this))))));
    if (!((life6_11 == null))) {
        break forest_join_221;
    }
    }
    __sourceExactCall_a2b35a35ee714a(((moom.H6)(((moom.H6)(p0)))), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)((((moom.G2)(((moom.H3)(this)).a)).a - 1))), ((int)(((moom.G2)(((moom.H3)(this)).a)).b)), ((int)((((moom.G2)(((moom.H3)(this)).a)).f - 2))), ((moom.bs)(moom.bs.WEST)), ((int)(__sourceExactCall_2602b40eda6d6e(((moom.H3)(this))))));
    if (!((life6_11 == null))) {
        break forest_join_221;
    }
    }
    __sourceExactCall_a2b35a35ee714a(((moom.H6)(((moom.H6)(p0)))), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)(((moom.G2)(((moom.H3)(this)).a)).a)), ((int)(((moom.G2)(((moom.H3)(this)).a)).b)), ((int)((((moom.G2)(((moom.H3)(this)).a)).c - 1))), ((moom.bs)(moom.bs.NORTH)), ((int)(__sourceExactCall_2602b40eda6d6e(((moom.H3)(this))))));
    if (!((life6_11 == null))) {
        break forest_join_221;
    }
    }
    __sourceExactCall_a2b35a35ee714a(((moom.H6)(((moom.H6)(p0)))), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)((((moom.G2)(((moom.H3)(this)).a)).d - 2))), ((int)(((moom.G2)(((moom.H3)(this)).a)).b)), ((int)((((moom.G2)(((moom.H3)(this)).a)).c - 1))), ((moom.bs)(moom.bs.NORTH)), ((int)(__sourceExactCall_2602b40eda6d6e(((moom.H3)(this))))));
    }
    forestValue275_222_0 = life7_5;
    }
    if (!((life6_11 != null))) {
        forestValue275_228_0 = forestValue275_222_0;
        break forest_join_228;
    }
    if (!((forestValue275_222_0 != 0))) {
        break forest_join_328;
    }
    forestValue275_228_0 = ((java.util.Random)(p2)).nextInt(((int)(3)));
    }
    if (!((forestValue275_228_0 > 0))) {
        break forest_join_328;
    }
    if (!((((moom.H3)(this)).b != null))) {
        break forest_join_328;
    }
    switch ((moom.IE.a)[((moom.bs)(((moom.H3)(this)).b)).ordinal()]) {
case 1:
{
        break forest_join_238;
    }
case 2:
{
        break forest_join_260;
    }
case 3:
{
        break forest_join_284;
    }
case 4:
{
        break forest_join_306;
    }
default:
{
        break forest_join_328;
    }
}
    }
    __sourceExactCall_a2b35a35ee714a(((moom.H6)(((moom.H6)(p0)))), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)((((moom.G2)(((moom.H3)(this)).a)).d + 1))), ((int)(((moom.G2)(((moom.H3)(this)).a)).b)), ((int)(((moom.G2)(((moom.H3)(this)).a)).c)), ((moom.bs)(moom.bs.EAST)), ((int)(__sourceExactCall_2602b40eda6d6e(((moom.H3)(this))))));
    if (!((life6_11 == null))) {
        break forest_join_328;
    }
    }
    forestValue275_281_0 = __sourceExactCall_a2b35a35ee714a(((moom.H6)(((moom.H6)(p0)))), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)((((moom.G2)(((moom.H3)(this)).a)).d + 1))), ((int)(((moom.G2)(((moom.H3)(this)).a)).b)), ((int)((((moom.G2)(((moom.H3)(this)).a)).f - 2))), ((moom.bs)(moom.bs.EAST)), ((int)(__sourceExactCall_2602b40eda6d6e(((moom.H3)(this))))));
    }
    recovery.source.CarrierOps.discard(forestValue275_281_0);
    if (!((life6_11 == null))) {
        break forest_join_328;
    }
    }
    __sourceExactCall_a2b35a35ee714a(((moom.H6)(((moom.H6)(p0)))), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)(((moom.G2)(((moom.H3)(this)).a)).a)), ((int)(((moom.G2)(((moom.H3)(this)).a)).b)), ((int)((((moom.G2)(((moom.H3)(this)).a)).f + 1))), ((moom.bs)(moom.bs.SOUTH)), ((int)(__sourceExactCall_2602b40eda6d6e(((moom.H3)(this))))));
    if (!((life6_11 == null))) {
        break forest_join_328;
    }
    }
    __sourceExactCall_a2b35a35ee714a(((moom.H6)(((moom.H6)(p0)))), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)((((moom.G2)(((moom.H3)(this)).a)).d - 2))), ((int)(((moom.G2)(((moom.H3)(this)).a)).b)), ((int)((((moom.G2)(((moom.H3)(this)).a)).f + 1))), ((moom.bs)(moom.bs.SOUTH)), ((int)(__sourceExactCall_2602b40eda6d6e(((moom.H3)(this))))));
    }
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_0f75cc6dd3c5_invokedynamic275_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0f75cc6dd3c5_invokedynamic275_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1159b7d74b22_invokedynamic727_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1159b7d74b22_invokedynamic727_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic667_16(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4715_0() throws E;

private static native int __sourceExactCall_a40956c72202e0(int p0, long p1);
private static native moom.G4 __sourceExactCall_21e7c855759262(java.util.List p0, moom.G2 p1);

private static native net.minecraft.entity.Entity[] __sourceExactCall_5d2e38afa74ebe();
private static native moom.G4 __sourceExactCall_e270d7cf159556(moom.H3 p0, moom.H6 p1, java.util.List p2, java.util.Random p3, int p4, int p5);
private static native int __sourceExactCall_2602b40eda6d6e(moom.H3 p0);

private static native moom.G4 __sourceExactCall_a2b35a35ee714a(moom.H6 p0, java.util.List p1, java.util.Random p2, int p3, int p4, int p5, moom.bs p6, int p7);
}
