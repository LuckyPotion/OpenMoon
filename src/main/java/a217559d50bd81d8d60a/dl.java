package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


















import moom.DT;














import net.minecraft.block.BlockPlanks$EnumType;






import net.minecraft.world.World;
import java.util.Map;
public class dl extends net.minecraft.block.BlockDirectional {

private moom.fG R;

private moom.fG S;

private moom.fG T;

private moom.fG U;

private static final com.google.common.base.Predicate<net.minecraft.block.state.IBlockState> V;

private static final long W;

private static final long[] X;

private static final java.lang.Integer[] Y;

private static final java.util.Map Z;

protected dl() {
super(moom.fn.C, moom.fm.q);
    (this).a__Void(((this.M).a__fE()).a__fE(moom.dl.Q, moom.bs.NORTH));
    (this).a(true);
    (this).a(net.minecraft.creativetab.CreativeTabs.b);
}


static {
javax.crypto.Cipher forestValue441_36_0;
    int forestValue441_36_1;
    javax.crypto.SecretKeyFactory forestValue441_36_2;
    byte[] forestValue441_36_3;
    javax.crypto.Cipher forestValue441_53_0;
    int forestValue441_53_1;
    javax.crypto.SecretKeyFactory forestValue441_53_2;
    byte[] forestValue441_53_3;
    long[] forestValue441_157_0;
    int forestValue441_157_1;
    long forestValue441_157_2;
    int forestValue441_157_3;
    long[] forestValue441_300_0;
    int forestValue441_300_1;
    long forestValue441_300_2;
    long[] forestValue441_312_0;
    int forestValue441_312_1;
    long forestValue441_312_2;
    javax.crypto.Cipher spill441_0;
    int spill441_1;
    javax.crypto.SecretKeyFactory spill441_2;
    byte[] spill441_3;
    byte[] spill441_4;
    java.lang.String spill441_5;
    int spill441_6;
    int spill441_7;
    long spill441_8;
    byte[] spill441_9;
    byte[] spill441_10;
    byte[] spill441_11;
    byte[] spill441_12;
    byte[] spill441_13;
    byte[] spill441_14;
    byte[] spill441_15;
    byte[] spill441_16;
    long spill441_17;
    int spill441_18;
    java.lang.String spill441_19;
    int spill441_20;
    long[] spill441_21;
    int spill441_22;
    long spill441_23;
    int spill441_24;
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
    W = ((long)(((moom._a)(moom._c.a(((long)(-7193259941751431683L)), ((long)(-7471058372003726888L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(222213442914765L)))));
    Z = ((java.util.Map)(new java.util.HashMap(13)));
    life0_16 = (moom.dl.W ^ 111262443414196L);
    spill441_0 = (life2_20 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    spill441_1 = 2;
    spill441_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp441_9_0 = new byte[8];
    spill441_3 = __stackOp441_9_0;
    (__stackOp441_9_0)[0] = ((byte) ((int) (life0_16 >>> 56)));
    life3_35 = 1;
    forestValue441_36_0 = spill441_0;
    forestValue441_36_1 = spill441_1;
    forestValue441_36_2 = spill441_2;
    forestValue441_36_3 = spill441_3;
    forest_cycle_36: while (true) {
    if (!((life3_35 < 8))) {
        forestValue441_53_0 = forestValue441_36_0;
        forestValue441_53_1 = forestValue441_36_1;
        forestValue441_53_2 = forestValue441_36_2;
        forestValue441_53_3 = forestValue441_36_3;
        break forest_join_53;
    }
    byte[] __stackOp441_10_0 = forestValue441_36_3;
    spill441_4 = __stackOp441_10_0;
    (__stackOp441_10_0)[life3_35] = ((byte) ((int) ((life0_16 << (life3_35 * 8)) >>> 56)));
    life3_35 += 1;
    forestValue441_36_3 = spill441_4;
    continue forest_cycle_36;
    }
    }
    ((javax.crypto.Cipher)(forestValue441_53_0)).init(((int)(forestValue441_53_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue441_53_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue441_53_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    life8_66 = new long[8];
    life5_68 = 0;
    life7_73 = ((java.lang.String)((life6_71 = "Ö7EÝûæGfË¼»ÞÄgJr^\027Å¿?Ç[¼Zäèþ½ñ&jÖV ò<öäm(\027vg"))).length();
    life4_75 = 0;
    forest_cycle_76: while (true) {
    spill441_5 = life6_71;
    spill441_6 = life4_75;
    life4_75 += 8;
    life9_83 = ((java.lang.String)(((java.lang.String)(spill441_5)).substring(((int)(spill441_6)), ((int)(life4_75))))).getBytes(((java.lang.String)("ISO-8859-1")));
    forestValue441_157_0 = life8_66;
    forestValue441_157_1 = (life5_68++);
    forestValue441_157_2 = (((((((((((long) (life9_83)[0]) & 255L) << 56) | ((((long) (life9_83)[1]) & 255L) << 48)) | ((((long) (life9_83)[2]) & 255L) << 40)) | ((((long) (life9_83)[3]) & 255L) << 32)) | ((((long) (life9_83)[4]) & 255L) << 24)) | ((((long) (life9_83)[5]) & 255L) << 16)) | ((((long) (life9_83)[6]) & 255L) << 8)) | (((long) (life9_83)[7]) & 255L));
    forestValue441_157_3 = -1;
    forest_cycle_157: while (true) {
    forest_join_317: {
    forest_join_312: {
    forest_join_300: {
    long __stackOp441_16_0 = forestValue441_157_2;
    int __stackOp441_16_1 = forestValue441_157_3;
    spill441_7 = __stackOp441_16_1;
    spill441_8 = __stackOp441_16_0;
    recovery.source.CarrierOps.discard(__stackOp441_16_1);
    life10_160 = spill441_8;
    byte[] __stackOp441_18_0 = new byte[8];
    spill441_9 = __stackOp441_18_0;
    (__stackOp441_18_0)[0] = ((byte) ((int) (life10_160 >>> 56)));
    byte[] __stackOp441_19_0 = spill441_9;
    spill441_10 = __stackOp441_19_0;
    (__stackOp441_19_0)[1] = ((byte) ((int) (life10_160 >>> 48)));
    byte[] __stackOp441_20_0 = spill441_10;
    spill441_11 = __stackOp441_20_0;
    (__stackOp441_20_0)[2] = ((byte) ((int) (life10_160 >>> 40)));
    byte[] __stackOp441_21_0 = spill441_11;
    spill441_12 = __stackOp441_21_0;
    (__stackOp441_21_0)[3] = ((byte) ((int) (life10_160 >>> 32)));
    byte[] __stackOp441_22_0 = spill441_12;
    spill441_13 = __stackOp441_22_0;
    (__stackOp441_22_0)[4] = ((byte) ((int) (life10_160 >>> 24)));
    byte[] __stackOp441_23_0 = spill441_13;
    spill441_14 = __stackOp441_23_0;
    (__stackOp441_23_0)[5] = ((byte) ((int) (life10_160 >>> 16)));
    byte[] __stackOp441_24_0 = spill441_14;
    spill441_15 = __stackOp441_24_0;
    (__stackOp441_24_0)[6] = ((byte) ((int) (life10_160 >>> 8)));
    byte[] __stackOp441_25_0 = spill441_15;
    spill441_16 = __stackOp441_25_0;
    (__stackOp441_25_0)[7] = ((byte) ((int) life10_160));
    byte[] __stackOp441_26_0 = spill441_16;
    javax.crypto.Cipher __stackOp441_26_1 = life2_20;
    life12_228 = ((javax.crypto.Cipher)(__stackOp441_26_1)).doFinal(((byte[])(__stackOp441_26_0)));
    int __stackOp441_28_0 = spill441_7;
    long __stackOp441_28_1 = (((((((((((long) (life12_228)[0]) & 255L) << 56) | ((((long) (life12_228)[1]) & 255L) << 48)) | ((((long) (life12_228)[2]) & 255L) << 40)) | ((((long) (life12_228)[3]) & 255L) << 32)) | ((((long) (life12_228)[4]) & 255L) << 24)) | ((((long) (life12_228)[5]) & 255L) << 16)) | ((((long) (life12_228)[6]) & 255L) << 8)) | (((long) (life12_228)[7]) & 255L));
    spill441_17 = __stackOp441_28_1;
    spill441_18 = __stackOp441_28_0;
    recovery.source.CarrierOps.discard(__stackOp441_28_1);
    switch (spill441_18) {
default:
{
        forestValue441_300_0 = forestValue441_157_0;
        forestValue441_300_1 = forestValue441_157_1;
        forestValue441_300_2 = spill441_17;
        break forest_join_300;
    }
case 0:
{
        forestValue441_312_0 = forestValue441_157_0;
        forestValue441_312_1 = forestValue441_157_1;
        forestValue441_312_2 = spill441_17;
        break forest_join_312;
    }
}
    }
    (forestValue441_300_0)[forestValue441_300_1] = forestValue441_300_2;
    if (!((life4_75 >= life7_73))) {
        continue forest_cycle_76;
    }
    life7_73 = ((java.lang.String)((life6_71 = "Ì¼Gà\025*¼KV\003l/\003¥S£"))).length();
    life4_75 = 0;
    break forest_join_317;
    }
    (forestValue441_312_0)[forestValue441_312_1] = forestValue441_312_2;
    if (!((life4_75 >= life7_73))) {
        break forest_join_317;
    }
    break forest_join_399;
    }
    spill441_19 = life6_71;
    spill441_20 = life4_75;
    life4_75 += 8;
    life9_325 = ((java.lang.String)(((java.lang.String)(spill441_19)).substring(((int)(spill441_20)), ((int)(life4_75))))).getBytes(((java.lang.String)("ISO-8859-1")));
    spill441_21 = life8_66;
    spill441_22 = (life5_68++);
    spill441_23 = (((((((((((long) (life9_325)[0]) & 255L) << 56) | ((((long) (life9_325)[1]) & 255L) << 48)) | ((((long) (life9_325)[2]) & 255L) << 40)) | ((((long) (life9_325)[3]) & 255L) << 32)) | ((((long) (life9_325)[4]) & 255L) << 24)) | ((((long) (life9_325)[5]) & 255L) << 16)) | ((((long) (life9_325)[6]) & 255L) << 8)) | (((long) (life9_325)[7]) & 255L));
    spill441_24 = 0;
    forestValue441_157_0 = spill441_21;
    forestValue441_157_1 = spill441_22;
    forestValue441_157_2 = spill441_23;
    forestValue441_157_3 = spill441_24;
    continue forest_cycle_157;
    }
    }
    }
    X = ((long[])(life8_66));
    Y = ((java.lang.Integer[])(new java.lang.Integer[8]));
    V = ((com.google.common.base.Predicate)(__sourceIntrinsic_eb8803ad1f63_invokedynamic441_35()));
}


public int b(net.minecraft.block.state.IBlockState p0) {
return ((moom.bs)(((moom.bs)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.dl.Q))))))).b();
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7383_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/dl"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


protected moom.fG b__sourceReturn_6e102d3166() {
moom.fG forwardValue359_49_0;
    moom.fG spill359_0;
    moom.dl spill359_1;
    moom.fJ spill359_2;
    java.lang.String[] spill359_3;
    java.lang.String[] spill359_4;
    java.lang.String[] spill359_5;
    long life1_3;
    int[] life3_5;
    forward_join_49: {
    forward_join_47: {
    life1_3 = (moom.dl.W ^ 37637832546391L);
    life3_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill359_0 = this.S;
    if (!((life3_5 != null))) {
        forwardValue359_49_0 = spill359_0;
        break forward_join_49;
    }
    if (!((spill359_0 == null))) {
        break forward_join_47;
    }
    spill359_1 = this;
    spill359_2 = moom.fJ.a__fJ();
    java.lang.String[] __stackOp359_4_0 = new java.lang.String[3];
    spill359_3 = __stackOp359_4_0;
    (__stackOp359_4_0)[0] = "^";
    java.lang.String[] __stackOp359_5_0 = spill359_3;
    spill359_4 = __stackOp359_5_0;
    (__stackOp359_5_0)[1] = "#";
    java.lang.String[] __stackOp359_6_0 = spill359_4;
    spill359_5 = __stackOp359_6_0;
    (__stackOp359_6_0)[2] = "#";
    ((moom.dl)(spill359_1)).S = ((moom.fG)(((moom.fJ)(((moom.fJ)(((moom.fJ)(((moom.fJ)(spill359_2)).a(((java.lang.String[])(spill359_5))))).a(((char)(__sourceIntrinsic_c6887d250758_invokedynamic359_8(3863, (5977061178064641654L ^ life1_3)))), ((com.google.common.base.Predicate)(moom.fD.a(((com.google.common.base.Predicate)(moom.dl.V)))))))).a(((char)(__sourceIntrinsic_c6887d250758_invokedynamic359_12(19187, (7973111459639319443L ^ life1_3)))), ((com.google.common.base.Predicate)(moom.fD.a(((com.google.common.base.Predicate)(moom.fI.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aJ))))))))))).a()));
    }
    forwardValue359_49_0 = this.S;
    }
    return forwardValue359_49_0;
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.dl.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 2187;
      if (Y[var3] == null) {
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
         long var5 = X[var3];
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
         Object[] var9 = (Object[])Z.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               Z.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/dl", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         Y[var3] = var15;
      }

      return Y[var3];
}


private void b__sourceReturn_bfedcc9a42(net.minecraft.world.World p0, moom.DT p1) {
moom.fH lexicalValue1119_154_0;
    moom.fH spill1119_0;
    long life3_3;
    int[] life5_5;
    moom.fH life6_12;
    int life7_20;
    moom.fD life8_31;
    moom.sY life7_52;
    moom.DT life8_59;
    int life9_84;
    moom.fD life10_143;
    int life7_168;
    int life8_177;
    moom.DT life7_212;
    net.minecraft.entity.monster.EntityIronGolem life8_217;
    int life9_245;
    int life10_300;
    moom.fD life11_311;
    lexical_join_307: {
    lexical_join_276: {
    lexical_join_274: {
    lexical_join_191: {
    lexical_join_154: {
    lexical_join_147: {
    lexical_join_145: {
    lexical_join_124: {
    lexical_join_122: {
    lexical_join_42: {
    life3_3 = (moom.dl.W ^ 119837271946860L);
    life5_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill1119_0 = (life6_12 = ((moom.fG)(((moom.dl)(this)).b__sourceReturn_6e102d3166())).a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1))));
    if (!((life5_5 != null))) {
        lexicalValue1119_154_0 = spill1119_0;
        break lexical_join_154;
    }
    if (!((spill1119_0 != null))) {
        break lexical_join_147;
    }
    life7_20 = 0;
    lexical_cycle_18: while (true) {
    if (!((life7_20 < ((moom.fG)(((moom.dl)(this)).b__sourceReturn_6e102d3166())).a()))) {
        break lexical_join_42;
    }
    life8_31 = ((moom.fH)(life6_12)).a(((int)(0)), ((int)(life7_20)), ((int)(0)));
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(((moom.fD)(life8_31)).a__DT())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((int)(2)));
    life7_20 += 1;
    if (!((life5_5 != null))) {
        break lexical_join_307;
    }
    if (!((life5_5 == null))) { continue lexical_cycle_18; }
    break lexical_cycle_18;
    }
    }
    life7_52 = new moom.sY(p0);
    life8_59 = ((moom.fD)(((moom.fH)(life6_12)).a(((int)(0)), ((int)(2)), ((int)(0))))).a__DT();
    ((moom.sY)(life7_52)).c(((double)((((double) ((moom.DT)(life8_59)).a()) + 0x1.0p-1d))), ((double)((((double) ((moom.DT)(life8_59)).b()) + 0x1.999999999999ap-5d))), ((double)((((double) ((moom.DT)(life8_59)).c()) + 0x1.0p-1d))), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)));
    ((net.minecraft.world.World)(p0)).b__Boolean(((net.minecraft.entity.Entity)(life7_52)));
    life9_84 = 0;
    lexical_cycle_79: while (true) {
    if (!((life9_84 < __sourceIntrinsic_6d923203f1ab_invokedynamic1119_18(26449, (2166147379213015048L ^ life3_3))))) {
        break lexical_join_122;
    }
    ((net.minecraft.world.World)(p0)).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.SNOW_SHOVEL)), ((double)((((double) ((moom.DT)(life8_59)).a()) + ((java.util.Random)(((net.minecraft.world.World)(p0)).u)).nextDouble()))), ((double)((((double) ((moom.DT)(life8_59)).b()) + (((java.util.Random)(((net.minecraft.world.World)(p0)).u)).nextDouble() * 0x1.4p1d)))), ((double)((((double) ((moom.DT)(life8_59)).c()) + ((java.util.Random)(((net.minecraft.world.World)(p0)).u)).nextDouble()))), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((int[])(new int[0])));
    life9_84 += 1;
    if (!((life5_5 != null))) {
        break lexical_join_124;
    }
    if (!((life5_5 == null))) { continue lexical_cycle_79; }
    break lexical_cycle_79;
    }
    }
    life9_84 = 0;
    }
    lexical_cycle_124: while (true) {
    if (!((life9_84 < ((moom.fG)(((moom.dl)(this)).b__sourceReturn_6e102d3166())).a()))) {
        break lexical_join_145;
    }
    life10_143 = ((moom.fH)(life6_12)).a(((int)(0)), ((int)(life9_84)), ((int)(0)));
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(((moom.fD)(life10_143)).a__DT())), ((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)));
    life9_84 += 1;
    if (!((life5_5 != null))) {
        break lexical_join_307;
    }
    if (!((life5_5 == null))) { continue lexical_cycle_124; }
    break lexical_cycle_124;
    }
    }
    if (!((life5_5 == null))) {
        break lexical_join_307;
    }
    }
    lexicalValue1119_154_0 = (life6_12 = ((moom.fG)(((moom.dl)(this)).d__sourceReturn_6e102d3166())).a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1))));
    }
    if (!((lexicalValue1119_154_0 != null))) {
        break lexical_join_307;
    }
    life7_168 = 0;
    lexical_cycle_157: while (true) {
    lexical_join_189: {
    lexical_join_188: {
    if (!((life7_168 < ((moom.fG)(((moom.dl)(this)).d__sourceReturn_6e102d3166())).b()))) {
        break lexical_join_191;
    }
    if (!((life5_5 != null))) {
        break lexical_join_307;
    }
    life8_177 = 0;
    lexical_cycle_166: while (true) {
    if (!((life8_177 < ((moom.fG)(((moom.dl)(this)).d__sourceReturn_6e102d3166())).a()))) {
        break lexical_join_188;
    }
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(((moom.fD)(((moom.fH)(life6_12)).a(((int)(life7_168)), ((int)(life8_177)), ((int)(0))))).a__DT())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((int)(2)));
    life8_177 += 1;
    if (!((life5_5 != null))) {
        break lexical_join_189;
    }
    if (!((life5_5 == null))) { continue lexical_cycle_166; }
    break lexical_cycle_166;
    }
    }
    life7_168 += 1;
    }
    if (!((life5_5 == null))) { continue lexical_cycle_157; }
    break lexical_cycle_157;
    }
    }
    life7_212 = ((moom.fD)(((moom.fH)(life6_12)).a(((int)(1)), ((int)(2)), ((int)(0))))).a__DT();
    life8_217 = new net.minecraft.entity.monster.EntityIronGolem(p0);
    ((net.minecraft.entity.monster.EntityIronGolem)(life8_217)).m(((boolean)(true)));
    ((net.minecraft.entity.monster.EntityIronGolem)(life8_217)).c(((double)((((double) ((moom.DT)(life7_212)).a()) + 0x1.0p-1d))), ((double)((((double) ((moom.DT)(life7_212)).b()) + 0x1.999999999999ap-5d))), ((double)((((double) ((moom.DT)(life7_212)).c()) + 0x1.0p-1d))), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)));
    ((net.minecraft.world.World)(p0)).b__Boolean(((net.minecraft.entity.Entity)(life8_217)));
    life9_245 = 0;
    lexical_cycle_231: while (true) {
    if (!((life9_245 < __sourceIntrinsic_6d923203f1ab_invokedynamic1119_55(2594, (378884062758532479L ^ life3_3))))) {
        break lexical_join_274;
    }
    ((net.minecraft.world.World)(p0)).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.SNOWBALL)), ((double)((((double) ((moom.DT)(life7_212)).a()) + ((java.util.Random)(((net.minecraft.world.World)(p0)).u)).nextDouble()))), ((double)((((double) ((moom.DT)(life7_212)).b()) + (((java.util.Random)(((net.minecraft.world.World)(p0)).u)).nextDouble() * 0x1.f333333333333p1d)))), ((double)((((double) ((moom.DT)(life7_212)).c()) + ((java.util.Random)(((net.minecraft.world.World)(p0)).u)).nextDouble()))), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((int[])(new int[0])));
    life9_245 += 1;
    if (!((life5_5 != null))) {
        break lexical_join_276;
    }
    if (!((life5_5 == null))) { continue lexical_cycle_231; }
    break lexical_cycle_231;
    }
    }
    life9_245 = 0;
    }
    lexical_cycle_276: while (true) {
    lexical_join_305: {
    lexical_join_304: {
    if (!((life9_245 < ((moom.fG)(((moom.dl)(this)).d__sourceReturn_6e102d3166())).b()))) {
        break lexical_join_307;
    }
    life10_300 = 0;
    lexical_cycle_283: while (true) {
    if (!((life10_300 < ((moom.fG)(((moom.dl)(this)).d__sourceReturn_6e102d3166())).a()))) {
        break lexical_join_304;
    }
    life11_311 = ((moom.fH)(life6_12)).a(((int)(life9_245)), ((int)(life10_300)), ((int)(0)));
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(((moom.fD)(life11_311)).a__DT())), ((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)));
    life10_300 += 1;
    if (!((life5_5 != null))) {
        break lexical_join_305;
    }
    if (!((life5_5 == null))) { continue lexical_cycle_283; }
    break lexical_cycle_283;
    }
    }
    life9_245 += 1;
    }
    if (!((life5_5 == null))) { continue lexical_cycle_276; }
    break lexical_cycle_276;
    }
    }
    return;
}


public boolean b__Boolean(net.minecraft.world.World p0, moom.DT p1) {
long l = moom.dl.W ^ 0x208B3EE37354L;
        int[] nArray = BlockPlanks$EnumType.b__ArrayInt();
        boolean bl = p0.a__fE((DT)p1).a__ch().J.f__Boolean();
        if (nArray != null) {
            if (!bl) return false;
            bl = World.a(p0, p1.b__DT());
        }
        if (nArray == null) return bl;
        if (!bl) return false;
        return true;
}


public void b__Void(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
super.b__Void(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)));
    ((moom.dl)(this)).b__sourceReturn_bfedcc9a42(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)));
    return;
}


public net.minecraft.block.state.IBlockState b__fE(int p0) {
return ((net.minecraft.block.state.IBlockState)(((moom.dl)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.dl.Q)), ((java.lang.Comparable)(moom.bs.b(((int)(p0))))));
}


protected moom.fG c__sourceReturn_6e102d3166() {
moom.fG forwardValue360_50_0;
    moom.fG spill360_0;
    moom.dl spill360_1;
    moom.fJ spill360_2;
    java.lang.String[] spill360_3;
    java.lang.String[] spill360_4;
    java.lang.String[] spill360_5;
    long life1_3;
    int[] life3_5;
    forward_join_50: {
    forward_join_48: {
    life1_3 = (moom.dl.W ^ 83085230631511L);
    life3_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill360_0 = this.T;
    if (!((life3_5 != null))) {
        forwardValue360_50_0 = spill360_0;
        break forward_join_50;
    }
    if (!((spill360_0 == null))) {
        break forward_join_48;
    }
    spill360_1 = this;
    spill360_2 = moom.fJ.a__fJ();
    java.lang.String[] __stackOp360_4_0 = new java.lang.String[3];
    spill360_3 = __stackOp360_4_0;
    (__stackOp360_4_0)[0] = "~ ~";
    java.lang.String[] __stackOp360_5_0 = spill360_3;
    spill360_4 = __stackOp360_5_0;
    (__stackOp360_5_0)[1] = "###";
    java.lang.String[] __stackOp360_6_0 = spill360_4;
    spill360_5 = __stackOp360_6_0;
    (__stackOp360_6_0)[2] = "~#~";
    ((moom.dl)(spill360_1)).T = ((moom.fG)(((moom.fJ)(((moom.fJ)(((moom.fJ)(((moom.fJ)(spill360_2)).a(((java.lang.String[])(spill360_5))))).a(((char)(__sourceIntrinsic_b0ff648cc612_invokedynamic360_8(19187, (7973138302447266195L ^ life1_3)))), ((com.google.common.base.Predicate)(moom.fD.a(((com.google.common.base.Predicate)(moom.fI.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.S))))))))))).a(((char)(__sourceIntrinsic_b0ff648cc612_invokedynamic360_13(8350, (6536769167013331963L ^ life1_3)))), ((com.google.common.base.Predicate)(moom.fD.a(((com.google.common.base.Predicate)(moom.fI.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a))))))))))).a()));
    }
    forwardValue360_50_0 = this.T;
    }
    return forwardValue360_50_0;
}


public boolean c(net.minecraft.world.World p0, moom.DT p1) {
moom.fH forwardValue361_19_0;
    int forwardValue361_23_0;
    moom.fH spill361_0;
    long life3_3;
    int[] life5_5;
    forward_join_23: {
    forward_join_22: {
    forward_join_20: {
    forward_join_19: {
    life3_3 = (moom.dl.W ^ 58421942601989L);
    life5_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill361_0 = ((moom.fG)(((moom.dl)(this)).a__fG())).a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)));
    if (!((life5_5 != null))) {
        forwardValue361_19_0 = spill361_0;
        break forward_join_19;
    }
    if (!((spill361_0 == null))) {
        break forward_join_20;
    }
    forwardValue361_19_0 = ((moom.fG)(((moom.dl)(this)).c__sourceReturn_6e102d3166())).a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)));
    }
    if (!((forwardValue361_19_0 != null))) {
        break forward_join_22;
    }
    }
    forwardValue361_23_0 = 1;
    break forward_join_23;
    }
    forwardValue361_23_0 = 0;
    }
    return ((forwardValue361_23_0) != 0);
}


protected moom.fG d__sourceReturn_6e102d3166() {
moom.fG forwardValue362_58_0;
    moom.fG spill362_0;
    moom.dl spill362_1;
    moom.fJ spill362_2;
    java.lang.String[] spill362_3;
    java.lang.String[] spill362_4;
    java.lang.String[] spill362_5;
    long life1_3;
    int[] life3_5;
    forward_join_58: {
    forward_join_56: {
    life1_3 = (moom.dl.W ^ 91890679708406L);
    life3_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill362_0 = this.U;
    if (!((life3_5 != null))) {
        forwardValue362_58_0 = spill362_0;
        break forward_join_58;
    }
    if (!((spill362_0 == null))) {
        break forward_join_56;
    }
    spill362_1 = this;
    spill362_2 = moom.fJ.a__fJ();
    java.lang.String[] __stackOp362_4_0 = new java.lang.String[3];
    spill362_3 = __stackOp362_4_0;
    (__stackOp362_4_0)[0] = "~^~";
    java.lang.String[] __stackOp362_5_0 = spill362_3;
    spill362_4 = __stackOp362_5_0;
    (__stackOp362_5_0)[1] = "###";
    java.lang.String[] __stackOp362_6_0 = spill362_4;
    spill362_5 = __stackOp362_6_0;
    (__stackOp362_6_0)[2] = "~#~";
    ((moom.dl)(spill362_1)).U = ((moom.fG)(((moom.fJ)(((moom.fJ)(((moom.fJ)(((moom.fJ)(((moom.fJ)(spill362_2)).a(((java.lang.String[])(spill362_5))))).a(((char)(__sourceIntrinsic_faf8a31981a4_invokedynamic362_8(14634, (6583514272125405935L ^ life1_3)))), ((com.google.common.base.Predicate)(moom.fD.a(((com.google.common.base.Predicate)(moom.dl.V)))))))).a(((char)(__sourceIntrinsic_faf8a31981a4_invokedynamic362_12(19187, (7973164681904011570L ^ life1_3)))), ((com.google.common.base.Predicate)(moom.fD.a(((com.google.common.base.Predicate)(moom.fI.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.S))))))))))).a(((char)(__sourceIntrinsic_faf8a31981a4_invokedynamic362_17(4083, (8591381431973215285L ^ life1_3)))), ((com.google.common.base.Predicate)(moom.fD.a(((com.google.common.base.Predicate)(moom.fI.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a))))))))))).a()));
    }
    forwardValue362_58_0 = this.U;
    }
    return forwardValue362_58_0;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


protected moom.fA a__fA() {
return new moom.fA(this, new net.minecraft.block.properties.IProperty[] {moom.dl.Q});
}


public net.minecraft.block.state.IBlockState a(net.minecraft.world.World p0, moom.DT p1, moom.bs p2, float p3, float p4, float p5, int p6, net.minecraft.entity.EntityLivingBase p7) {
return ((net.minecraft.block.state.IBlockState)(((moom.dl)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.dl.Q)), ((java.lang.Comparable)(((moom.bs)(((net.minecraft.entity.EntityLivingBase)(p7)).b__bs())).a__bs())));
}


protected moom.fG a__fG() {
moom.fG forwardValue358_41_0;
    moom.fG spill358_0;
    moom.dl spill358_1;
    moom.fJ spill358_2;
    java.lang.String[] spill358_3;
    java.lang.String[] spill358_4;
    java.lang.String[] spill358_5;
    long life1_3;
    int[] life3_5;
    forward_join_41: {
    forward_join_39: {
    life1_3 = (moom.dl.W ^ 83499463018928L);
    life3_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill358_0 = this.R;
    if (!((life3_5 != null))) {
        forwardValue358_41_0 = spill358_0;
        break forward_join_41;
    }
    if (!((spill358_0 == null))) {
        break forward_join_39;
    }
    spill358_1 = this;
    spill358_2 = moom.fJ.a__fJ();
    java.lang.String[] __stackOp358_4_0 = new java.lang.String[3];
    spill358_3 = __stackOp358_4_0;
    (__stackOp358_4_0)[0] = " ";
    java.lang.String[] __stackOp358_5_0 = spill358_3;
    spill358_4 = __stackOp358_5_0;
    (__stackOp358_5_0)[1] = "#";
    java.lang.String[] __stackOp358_6_0 = spill358_4;
    spill358_5 = __stackOp358_6_0;
    (__stackOp358_6_0)[2] = "#";
    ((moom.dl)(spill358_1)).R = ((moom.fG)(((moom.fJ)(((moom.fJ)(((moom.fJ)(spill358_2)).a(((java.lang.String[])(spill358_5))))).a(((char)(__sourceIntrinsic_6aaeda081082_invokedynamic358_8(29727, (4853367774220678299L ^ life1_3)))), ((com.google.common.base.Predicate)(moom.fD.a(((com.google.common.base.Predicate)(moom.fI.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aJ))))))))))).a()));
    }
    forwardValue358_41_0 = this.R;
    }
    return forwardValue358_41_0;
}


private static boolean lambda$static$0(net.minecraft.block.state.IBlockState p0) {
net.minecraft.block.state.IBlockState forwardValue363_11_0;
    net.minecraft.block.Block forwardValue363_19_0;
    net.minecraft.block.Block forwardValue363_19_1;
    int forwardValue363_23_0;
    net.minecraft.block.state.IBlockState spill363_0;
    net.minecraft.block.Block spill363_1;
    net.minecraft.block.Block spill363_2;
    long life1_3;
    int[] life3_5;
    forward_join_23: {
    forward_join_22: {
    forward_join_20: {
    forward_join_19: {
    forward_join_11: {
    life1_3 = (moom.dl.W ^ 25222768513477L);
    life3_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill363_0 = p0;
    if (!((life3_5 != null))) {
        forwardValue363_11_0 = spill363_0;
        break forward_join_11;
    }
    if (!((spill363_0 != null))) {
        break forward_join_22;
    }
    forwardValue363_11_0 = p0;
    }
    spill363_1 = ((net.minecraft.block.state.IBlockState)(forwardValue363_11_0)).a__ch();
    spill363_2 = net.minecraft.init.Blocks.aU;
    if (!((life3_5 != null))) {
        forwardValue363_19_0 = spill363_1;
        forwardValue363_19_1 = spill363_2;
        break forward_join_19;
    }
    if (!((spill363_1 != spill363_2))) {
        break forward_join_20;
    }
    forwardValue363_19_0 = ((net.minecraft.block.state.IBlockState)(p0)).a__ch();
    forwardValue363_19_1 = net.minecraft.init.Blocks.aZ;
    }
    if (!((forwardValue363_19_0 == forwardValue363_19_1))) {
        break forward_join_22;
    }
    }
    forwardValue363_23_0 = 1;
    break forward_join_23;
    }
    forwardValue363_23_0 = 0;
    }
    return ((forwardValue363_23_0) != 0);
}


private static native <E extends Throwable> com.google.common.base.Predicate __sourceIntrinsic_eb8803ad1f63_invokedynamic441_35() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6aaeda081082_invokedynamic358_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c6887d250758_invokedynamic359_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c6887d250758_invokedynamic359_12(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7383_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6d923203f1ab_invokedynamic1119_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6d923203f1ab_invokedynamic1119_55(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b0ff648cc612_invokedynamic360_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b0ff648cc612_invokedynamic360_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_faf8a31981a4_invokedynamic362_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_faf8a31981a4_invokedynamic362_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_faf8a31981a4_invokedynamic362_17(int a0, long a1) throws E;
}
