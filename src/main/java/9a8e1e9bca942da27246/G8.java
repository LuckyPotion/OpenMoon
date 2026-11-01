package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class G8 extends net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$Feature {

private boolean i;

private static long j;

private static long[] k;

private static java.lang.Integer[] l;

private static java.util.Map m;

public G8() {
super();
}


public G8(java.util.Random p0, int p1, int p2) { super((java.util.Random)null, 0, 0, 0, 0, 0, 0); }


private static void __sourceConstructorBody_90877997f3d529d6(moom.G8 receiver, java.util.Random p0, int p1, int p2) throws Throwable {

long local4 = (moom.G8.j ^ 45239491531464L);

    moom.G8.__sourceConstructorInit_90877997f3d529d6_0(((moom.G8)(receiver)), ((java.util.Random)(p0)), ((int)(p1)), ((int)(__sourceIntrinsic_90877997f3d529d6_originalDynamicSite2060_1(31807, (6952269471159526163L ^ local4)))), ((int)(p2)), ((int)(__sourceIntrinsic_90877997f3d529d6_originalDynamicSite2060_2(4851, (4301445106440785373L ^ local4)))), ((int)(__sourceIntrinsic_90877997f3d529d6_originalDynamicSite2060_3(20309, (522282130495344764L ^ local4)))), ((int)(__sourceIntrinsic_90877997f3d529d6_originalDynamicSite2060_4(8962, (6893053353605889066L ^ local4)))));

    return;

}



static {
javax.crypto.Cipher forestValue393_36_0;
    int forestValue393_36_1;
    javax.crypto.SecretKeyFactory forestValue393_36_2;
    byte[] forestValue393_36_3;
    javax.crypto.Cipher forestValue393_53_0;
    int forestValue393_53_1;
    javax.crypto.SecretKeyFactory forestValue393_53_2;
    byte[] forestValue393_53_3;
    long[] forestValue393_157_0;
    int forestValue393_157_1;
    long forestValue393_157_2;
    int forestValue393_157_3;
    long[] forestValue393_300_0;
    int forestValue393_300_1;
    long forestValue393_300_2;
    long[] forestValue393_312_0;
    int forestValue393_312_1;
    long forestValue393_312_2;
    javax.crypto.Cipher spill393_0;
    int spill393_1;
    javax.crypto.SecretKeyFactory spill393_2;
    byte[] spill393_3;
    byte[] spill393_4;
    java.lang.String spill393_5;
    int spill393_6;
    int spill393_7;
    long spill393_8;
    byte[] spill393_9;
    byte[] spill393_10;
    byte[] spill393_11;
    byte[] spill393_12;
    byte[] spill393_13;
    byte[] spill393_14;
    byte[] spill393_15;
    byte[] spill393_16;
    long spill393_17;
    int spill393_18;
    java.lang.String spill393_19;
    int spill393_20;
    long[] spill393_21;
    int spill393_22;
    long spill393_23;
    int spill393_24;
    long life0_16;
    javax.crypto.Cipher life2_20;
    int life3_35;
    long[] life8_66;
    int life5_68;
    java.lang.String life6_71;
    int life7_73;
    int life4_75;
    byte[] life9_83;
    long life10_160;
    byte[] life12_228;
    byte[] life9_325;
    forest_join_399: {
    forest_join_53: {
    j = ((long)(((moom._a)(moom._c.a(((long)(4414623955473727757L)), ((long)(3910481844394470604L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(80765839352316L)))));
    m = ((java.util.Map)(new java.util.HashMap(13)));
    life0_16 = (moom.G8.j ^ 82748029334429L);
    spill393_0 = (life2_20 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    spill393_1 = 2;
    spill393_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp393_9_0 = new byte[8];
    spill393_3 = __stackOp393_9_0;
    (__stackOp393_9_0)[0] = ((byte) ((int) (life0_16 >>> 56)));
    life3_35 = 1;
    forestValue393_36_0 = spill393_0;
    forestValue393_36_1 = spill393_1;
    forestValue393_36_2 = spill393_2;
    forestValue393_36_3 = spill393_3;
    forest_cycle_36: while (true) {
    if (!((life3_35 < 8))) {
        forestValue393_53_0 = forestValue393_36_0;
        forestValue393_53_1 = forestValue393_36_1;
        forestValue393_53_2 = forestValue393_36_2;
        forestValue393_53_3 = forestValue393_36_3;
        break forest_join_53;
    }
    byte[] __stackOp393_10_0 = forestValue393_36_3;
    spill393_4 = __stackOp393_10_0;
    (__stackOp393_10_0)[life3_35] = ((byte) ((int) ((life0_16 << (life3_35 * 8)) >>> 56)));
    life3_35 += 1;
    forestValue393_36_3 = spill393_4;
    continue forest_cycle_36;
    }
    }
    ((javax.crypto.Cipher)(forestValue393_53_0)).init(((int)(forestValue393_53_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue393_53_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue393_53_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    life8_66 = new long[8];
    life5_68 = 0;
    life7_73 = ((java.lang.String)((life6_71 = "ÂD¼\022Ä\017\\\021NR\002,FN½PGhSö¢àxênÒ\005ñ¢è\017b£DÄ#u\033UY\016:B¦D4×"))).length();
    life4_75 = 0;
    forest_cycle_76: while (true) {
    spill393_5 = life6_71;
    spill393_6 = life4_75;
    life4_75 += 8;
    life9_83 = ((java.lang.String)(((java.lang.String)(spill393_5)).substring(((int)(spill393_6)), ((int)(life4_75))))).getBytes(((java.lang.String)("ISO-8859-1")));
    forestValue393_157_0 = life8_66;
    forestValue393_157_1 = (life5_68++);
    forestValue393_157_2 = (((((((((((long) (life9_83)[0]) & 255L) << 56) | ((((long) (life9_83)[1]) & 255L) << 48)) | ((((long) (life9_83)[2]) & 255L) << 40)) | ((((long) (life9_83)[3]) & 255L) << 32)) | ((((long) (life9_83)[4]) & 255L) << 24)) | ((((long) (life9_83)[5]) & 255L) << 16)) | ((((long) (life9_83)[6]) & 255L) << 8)) | (((long) (life9_83)[7]) & 255L));
    forestValue393_157_3 = -1;
    forest_cycle_157: while (true) {
    forest_join_317: {
    forest_join_312: {
    forest_join_300: {
    long __stackOp393_16_0 = forestValue393_157_2;
    int __stackOp393_16_1 = forestValue393_157_3;
    spill393_7 = __stackOp393_16_1;
    spill393_8 = __stackOp393_16_0;
    recovery.source.CarrierOps.discard(__stackOp393_16_1);
    life10_160 = spill393_8;
    byte[] __stackOp393_18_0 = new byte[8];
    spill393_9 = __stackOp393_18_0;
    (__stackOp393_18_0)[0] = ((byte) ((int) (life10_160 >>> 56)));
    byte[] __stackOp393_19_0 = spill393_9;
    spill393_10 = __stackOp393_19_0;
    (__stackOp393_19_0)[1] = ((byte) ((int) (life10_160 >>> 48)));
    byte[] __stackOp393_20_0 = spill393_10;
    spill393_11 = __stackOp393_20_0;
    (__stackOp393_20_0)[2] = ((byte) ((int) (life10_160 >>> 40)));
    byte[] __stackOp393_21_0 = spill393_11;
    spill393_12 = __stackOp393_21_0;
    (__stackOp393_21_0)[3] = ((byte) ((int) (life10_160 >>> 32)));
    byte[] __stackOp393_22_0 = spill393_12;
    spill393_13 = __stackOp393_22_0;
    (__stackOp393_22_0)[4] = ((byte) ((int) (life10_160 >>> 24)));
    byte[] __stackOp393_23_0 = spill393_13;
    spill393_14 = __stackOp393_23_0;
    (__stackOp393_23_0)[5] = ((byte) ((int) (life10_160 >>> 16)));
    byte[] __stackOp393_24_0 = spill393_14;
    spill393_15 = __stackOp393_24_0;
    (__stackOp393_24_0)[6] = ((byte) ((int) (life10_160 >>> 8)));
    byte[] __stackOp393_25_0 = spill393_15;
    spill393_16 = __stackOp393_25_0;
    (__stackOp393_25_0)[7] = ((byte) ((int) life10_160));
    byte[] __stackOp393_26_0 = spill393_16;
    javax.crypto.Cipher __stackOp393_26_1 = life2_20;
    life12_228 = ((javax.crypto.Cipher)(__stackOp393_26_1)).doFinal(((byte[])(__stackOp393_26_0)));
    int __stackOp393_28_0 = spill393_7;
    long __stackOp393_28_1 = (((((((((((long) (life12_228)[0]) & 255L) << 56) | ((((long) (life12_228)[1]) & 255L) << 48)) | ((((long) (life12_228)[2]) & 255L) << 40)) | ((((long) (life12_228)[3]) & 255L) << 32)) | ((((long) (life12_228)[4]) & 255L) << 24)) | ((((long) (life12_228)[5]) & 255L) << 16)) | ((((long) (life12_228)[6]) & 255L) << 8)) | (((long) (life12_228)[7]) & 255L));
    spill393_17 = __stackOp393_28_1;
    spill393_18 = __stackOp393_28_0;
    recovery.source.CarrierOps.discard(__stackOp393_28_1);
    switch (spill393_18) {
default:
{
        forestValue393_300_0 = forestValue393_157_0;
        forestValue393_300_1 = forestValue393_157_1;
        forestValue393_300_2 = spill393_17;
        break forest_join_300;
    }
case 0:
{
        forestValue393_312_0 = forestValue393_157_0;
        forestValue393_312_1 = forestValue393_157_1;
        forestValue393_312_2 = spill393_17;
        break forest_join_312;
    }
}
    }
    (forestValue393_300_0)[forestValue393_300_1] = forestValue393_300_2;
    if (!((life4_75 >= life7_73))) {
        continue forest_cycle_76;
    }
    life7_73 = ((java.lang.String)((life6_71 = "aIËÿò°O\006È¹U\"×®#"))).length();
    life4_75 = 0;
    break forest_join_317;
    }
    (forestValue393_312_0)[forestValue393_312_1] = forestValue393_312_2;
    if (!((life4_75 >= life7_73))) {
        break forest_join_317;
    }
    break forest_join_399;
    }
    spill393_19 = life6_71;
    spill393_20 = life4_75;
    life4_75 += 8;
    life9_325 = ((java.lang.String)(((java.lang.String)(spill393_19)).substring(((int)(spill393_20)), ((int)(life4_75))))).getBytes(((java.lang.String)("ISO-8859-1")));
    spill393_21 = life8_66;
    spill393_22 = (life5_68++);
    spill393_23 = (((((((((((long) (life9_325)[0]) & 255L) << 56) | ((((long) (life9_325)[1]) & 255L) << 48)) | ((((long) (life9_325)[2]) & 255L) << 40)) | ((((long) (life9_325)[3]) & 255L) << 32)) | ((((long) (life9_325)[4]) & 255L) << 24)) | ((((long) (life9_325)[5]) & 255L) << 16)) | ((((long) (life9_325)[6]) & 255L) << 8)) | (((long) (life9_325)[7]) & 255L));
    spill393_24 = 0;
    forestValue393_157_0 = spill393_21;
    forestValue393_157_1 = spill393_22;
    forestValue393_157_2 = spill393_23;
    forestValue393_157_3 = spill393_24;
    continue forest_cycle_157;
    }
    }
    }
    k = ((long[])(life8_66));
    l = ((java.lang.Integer[])(new java.lang.Integer[8]));
}

private static native <E extends Throwable> void __sourceConstructorInit_90877997f3d529d6_0(moom.G8 a0, java.util.Random a1, int a2, int a3, int a4, int a5, int a6, int a7) throws E;

private static moom.Oo b(moom.Oo p0) {
return p0;
}


protected void b(net.minecraft.nbt.NBTTagCompound p0) {
super.b(((net.minecraft.nbt.NBTTagCompound)(p0)));
    this.i = ((boolean)(((net.minecraft.nbt.NBTTagCompound)(p0)).b__Boolean(((java.lang.String)("Witch")))));
    return;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 29548;
      if (l[var3] == null) {
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
         long var5 = k[var3];
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
         Object[] var9 = (Object[])m.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               m.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/G8", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         l[var3] = var15;
      }

      return l[var3];
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral4611_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/G8"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.G8.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


protected void a(net.minecraft.nbt.NBTTagCompound p0) {
super.a(((net.minecraft.nbt.NBTTagCompound)(p0)));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("Witch")), ((boolean)__sourceIntrinsic_integerToBoolean((((this.i) ? 1 : 0)))));
    return;
}


public boolean a__Boolean(net.minecraft.world.World p0, java.util.Random p1, moom.G2 p2) {
int lexicalValue674_358_0;
    int lexicalValue674_509_0;
    int lexicalValue674_576_0;
    boolean spill674_0;
    int spill674_1;
    boolean spill674_2;
    long life4_3;
    net.minecraft.entity.Entity[] life6_5;
    int life7_363;
    int life8_368;
    int life9_373;
    int life10_378;
    int life11_480;
    int life12_491;
    int life11_527;
    int life12_531;
    int life13_536;
    moom.ta life14_558;
    lexical_join_576: {
    lexical_join_575: {
    lexical_join_509: {
    lexical_join_507: {
    lexical_join_358: {
    lexical_join_16: {
    life4_3 = (moom.G8.j ^ 111985521548709L);
    life6_5 = moom.G4.b();
    spill674_0 = ((moom.G8)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)));
    if (!((life6_5 != null))) {
        lexicalValue674_358_0 = ((spill674_0) ? 1 : 0);
        break lexical_join_358;
    }
    if (!((!spill674_0))) {
        break lexical_join_16;
    }
    return ((0) != 0);
    }
    ((moom.G8)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(1)), ((int)(1)), ((int)(5)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic674_5(20309, (522356156297666321L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).b__fE(((int)(((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.SPRUCE)).a()))))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).b__fE(((int)(((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.SPRUCE)).a()))))), ((boolean)(false)));
    ((moom.G8)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(4)), ((int)(2)), ((int)(5)), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic674_15(20309, (522356156297666321L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).b__fE(((int)(((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.SPRUCE)).a()))))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).b__fE(((int)(((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.SPRUCE)).a()))))), ((boolean)(false)));
    ((moom.G8)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(2)), ((int)(1)), ((int)(0)), ((int)(4)), ((int)(1)), ((int)(0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).b__fE(((int)(((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.SPRUCE)).a()))))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).b__fE(((int)(((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.SPRUCE)).a()))))), ((boolean)(false)));
    ((moom.G8)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(2)), ((int)(2)), ((int)(2)), ((int)(3)), ((int)(3)), ((int)(2)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).b__fE(((int)(((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.SPRUCE)).a()))))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).b__fE(((int)(((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.SPRUCE)).a()))))), ((boolean)(false)));
    ((moom.G8)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(2)), ((int)(3)), ((int)(1)), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic674_43(31289, (9065453841162365566L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).b__fE(((int)(((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.SPRUCE)).a()))))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).b__fE(((int)(((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.SPRUCE)).a()))))), ((boolean)(false)));
    ((moom.G8)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(5)), ((int)(2)), ((int)(3)), ((int)(5)), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic674_53(6031, (6910723971650521033L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).b__fE(((int)(((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.SPRUCE)).a()))))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).b__fE(((int)(((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.SPRUCE)).a()))))), ((boolean)(false)));
    ((moom.G8)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(2)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic674_63(20309, (522356156297666321L ^ life4_3)))), ((int)(4)), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic674_64(20309, (522356156297666321L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).b__fE(((int)(((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.SPRUCE)).a()))))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).b__fE(((int)(((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.SPRUCE)).a()))))), ((boolean)(false)));
    ((moom.G8)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(0)), ((int)(2)), ((int)(1)), ((int)(3)), ((int)(2)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.r)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.r)).a__fE())), ((boolean)(false)));
    ((moom.G8)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(5)), ((int)(0)), ((int)(2)), ((int)(5)), ((int)(3)), ((int)(2)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.r)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.r)).a__fE())), ((boolean)(false)));
    ((moom.G8)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic674_84(20309, (522356156297666321L ^ life4_3)))), ((int)(1)), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic674_85(20309, (522356156297666321L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.r)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.r)).a__fE())), ((boolean)(false)));
    ((moom.G8)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(5)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic674_91(20309, (522356156297666321L ^ life4_3)))), ((int)(5)), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic674_92(20309, (522356156297666321L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.r)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.r)).a__fE())), ((boolean)(false)));
    ((moom.G8)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aO)).a__fE())), ((int)(2)), ((int)(3)), ((int)(2)), ((moom.G2)(p2)));
    ((moom.G8)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aO)).a__fE())), ((int)(3)), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic674_103(20309, (522356156297666321L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.G8)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((int)(1)), ((int)(3)), ((int)(4)), ((moom.G2)(p2)));
    ((moom.G8)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((int)(5)), ((int)(3)), ((int)(4)), ((moom.G2)(p2)));
    ((moom.G8)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((int)(5)), ((int)(3)), ((int)(5)), ((moom.G2)(p2)));
    ((moom.G8)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bP)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockFlowerPot.S)), ((java.lang.Comparable)(net.minecraft.block.BlockFlowerPot$EnumFlowerType.MUSHROOM_RED))))), ((int)(1)), ((int)(3)), ((int)(5)), ((moom.G2)(p2)));
    ((moom.G8)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ai)).a__fE())), ((int)(3)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic674_122(6031, (6910723971650521033L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.G8)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((moom.cP)(net.minecraft.init.Blocks.bt)).a__fE())), ((int)(4)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic674_126(6031, (6910723971650521033L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.G8)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aO)).a__fE())), ((int)(1)), ((int)(2)), ((int)(1)), ((moom.G2)(p2)));
    ((moom.G8)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aO)).a__fE())), ((int)(5)), ((int)(2)), ((int)(1)), ((moom.G2)(p2)));
    lexicalValue674_358_0 = ((moom.G8)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ad)), ((int)(3)));
    }
    life7_363 = lexicalValue674_358_0;
    life8_368 = ((moom.G8)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ad)), ((int)(1)));
    life9_373 = ((moom.G8)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ad)), ((int)(0)));
    life10_378 = ((moom.G8)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ad)), ((int)(2)));
    ((moom.G8)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(4)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic674_142(6031, (6910723971650521033L ^ life4_3)))), ((int)(4)), ((int)(1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bJ)).b__fE(((int)(life7_363))))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bJ)).b__fE(((int)(life7_363))))), ((boolean)(false)));
    ((moom.G8)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(4)), ((int)(2)), ((int)(0)), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic674_148(20309, (522356156297666321L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bJ)).b__fE(((int)(life9_373))))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bJ)).b__fE(((int)(life9_373))))), ((boolean)(false)));
    ((moom.G8)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic674_154(6031, (6910723971650521033L ^ life4_3)))), ((int)(4)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic674_155(6031, (6910723971650521033L ^ life4_3)))), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic674_156(20309, (522356156297666321L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bJ)).b__fE(((int)(life8_368))))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bJ)).b__fE(((int)(life8_368))))), ((boolean)(false)));
    ((moom.G8)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic674_162(3148, (7998140423116889102L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic674_163(6031, (6910723971650521033L ^ life4_3)))), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic674_164(17819, (3301225552336803291L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bJ)).b__fE(((int)(life10_378))))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bJ)).b__fE(((int)(life10_378))))), ((boolean)(false)));
    life11_480 = 2;
    lexical_cycle_476: while (true) {
    lexical_join_505: {
    lexical_join_504: {
    if (!((life11_480 <= __sourceIntrinsic_5ac1d031d896_invokedynamic674_170(20309, (522356156297666321L ^ life4_3))))) {
        break lexical_join_507;
    }
    spill674_1 = 1;
    if (!((life6_5 != null))) {
        lexicalValue674_509_0 = spill674_1;
        break lexical_join_509;
    }
    life12_491 = spill674_1;
    lexical_cycle_487: while (true) {
    if (!((life12_491 <= 5))) {
        break lexical_join_504;
    }
    ((moom.G8)(this)).b(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.r)).a__fE())), ((int)(life12_491)), ((int)(-1)), ((int)(life11_480)), ((moom.G2)(p2)));
    life12_491 += 4;
    if (!((life6_5 != null))) {
        break lexical_join_505;
    }
    if (!((life6_5 == null))) { continue lexical_cycle_487; }
    break lexical_cycle_487;
    }
    }
    life11_480 += 5;
    }
    if (!((life6_5 == null))) { continue lexical_cycle_476; }
    break lexical_cycle_476;
    }
    }
    lexicalValue674_509_0 = ((this.i) ? 1 : 0);
    }
    if (!((life6_5 != null))) {
        lexicalValue674_576_0 = lexicalValue674_509_0;
        break lexical_join_576;
    }
    if (!((lexicalValue674_509_0 == 0))) {
        break lexical_join_575;
    }
    life11_527 = ((moom.G8)(this)).a(((int)(2)), ((int)(5)));
    life12_531 = ((moom.G8)(this)).a(((int)(2)));
    life13_536 = ((moom.G8)(this)).b(((int)(2)), ((int)(5)));
    spill674_2 = ((moom.G2)(p2)).a(((moom.DS)(new moom.DT(life11_527, life12_531, life13_536))));
    if (!((life6_5 != null))) {
        lexicalValue674_576_0 = ((spill674_2) ? 1 : 0);
        break lexical_join_576;
    }
    if (!(spill674_2)) {
        break lexical_join_575;
    }
    this.i = ((boolean)(true));
    life14_558 = new moom.ta(p0);
    ((moom.ta)(life14_558)).c(((double)((((double) life11_527) + 0x1.0p-1d))), ((double)(((double) life12_531))), ((double)((((double) life13_536) + 0x1.0p-1d))), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)));
    ((moom.ta)(life14_558)).a(((moom.Eh)(((net.minecraft.world.World)(p0)).a__Eh(((moom.DT)(new moom.DT(life11_527, life12_531, life13_536)))))), ((net.minecraft.entity.IEntityLivingData)(null)));
    ((net.minecraft.world.World)(p0)).b__Boolean(((net.minecraft.entity.Entity)(life14_558)));
    }
    lexicalValue674_576_0 = 1;
    }
    return ((lexicalValue674_576_0) != 0);
}


private static native <E extends Throwable> int __sourceIntrinsic_90877997f3d529d6_originalDynamicSite2060_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_90877997f3d529d6_originalDynamicSite2060_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_90877997f3d529d6_originalDynamicSite2060_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_90877997f3d529d6_originalDynamicSite2060_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral4611_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic674_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic674_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic674_43(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic674_53(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic674_63(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic674_64(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic674_84(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic674_85(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic674_91(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic674_92(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic674_103(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic674_122(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic674_126(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic674_142(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic674_148(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic674_154(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic674_155(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic674_156(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic674_162(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic674_163(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic674_164(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic674_170(int a0, long a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
