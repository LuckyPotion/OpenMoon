package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class e4 {

private net.minecraft.world.World a;

private net.minecraft.util.EnumFacing$Axis b;

private moom.bs c;

private moom.bs d;

private int e;

private moom.DT f;

private int g;

private int h;

private static long i;

private static long[] j;

private static java.lang.Integer[] k;

private static java.util.Map l;

public e4(net.minecraft.world.World p0, moom.DT p1, net.minecraft.util.EnumFacing$Axis p2) { super(); }


private static void __sourceConstructorBody_108f2f8c3660bcde(moom.e4 receiver, net.minecraft.world.World p0, moom.DT p1, net.minecraft.util.EnumFacing$Axis p2) throws Throwable {

int forestValue448_78_0;

    int forestValue448_102_0;

    moom.e4 forestValue448_118_0;

    moom.e4 forestValue448_121_0;

    moom.e4 forestValue448_126_0;

    int[] spill448_0;

    int spill448_1;

    boolean spill448_2;

    int spill448_3;

    moom.e4 spill448_4;

    moom.e4 spill448_5;

    long life4_3;

    int[] life6_13;

    moom.DT life7_40;

    int life7_85;

    forest_join_129: {

    forest_join_126: {

    forest_join_121: {

    forest_join_120: {

    forest_join_118: {

    forest_join_114: {

    forest_join_102: {

    forest_join_78: {

    forest_join_71: {

    forest_join_36: {

    forest_join_33: {

    forest_join_30: {

    life4_3 = (moom.e4.i ^ 127194857777021L);

    moom.e4.__sourceConstructorInit_108f2f8c3660bcde_0(((moom.e4)(receiver)));

    ((moom.e4)(receiver)).e = ((int)(0));

    spill448_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();

    ((moom.e4)(receiver)).a = ((net.minecraft.world.World)(p0));

    life6_13 = spill448_0;

    ((moom.e4)(receiver)).b = ((net.minecraft.util.EnumFacing$Axis)(p2));

    if (!((life6_13 != null))) {

        break forest_join_33;

    }

    if (!((p2 == net.minecraft.util.EnumFacing$Axis.X))) {

        break forest_join_30;

    }

    ((moom.e4)(receiver)).d = ((moom.bs)(moom.bs.EAST));

    ((moom.e4)(receiver)).c = ((moom.bs)(moom.bs.WEST));

    if (!((life6_13 == null))) {

        break forest_join_36;

    }

    }

    ((moom.e4)(receiver)).d = ((moom.bs)(moom.bs.NORTH));

    }

    ((moom.e4)(receiver)).c = ((moom.bs)(moom.bs.SOUTH));

    }

    life7_40 = p1;

    forest_cycle_38: while (true) {

    if (!((((moom.DT)(p1)).b() > (((moom.DT)(life7_40)).b() - __sourceIntrinsic_108f2f8c3660bcde_invokedynamic448_17(14408, (4204346384210824060L ^ life4_3)))))) {

        break forest_join_71;

    }

    spill448_1 = ((moom.DT)(p1)).b();

    if (!((life6_13 != null))) {

        forestValue448_78_0 = spill448_1;

        break forest_join_78;

    }

    if (!((life6_13 != null))) {

        forestValue448_78_0 = spill448_1;

        break forest_join_78;

    }

    if (!((spill448_1 > 0))) {

        break forest_join_71;

    }

    spill448_2 = ((moom.e4)(receiver)).a(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).b__DT()))))).a__ch())));

    if (!((life6_13 != null))) {

        forestValue448_78_0 = ((spill448_2) ? 1 : 0);

        break forest_join_78;

    }

    if (!(spill448_2)) {

        break forest_join_71;

    }

    p1 = ((moom.DT)(p1)).b__DT();

    if (!((life6_13 == null))) {

        continue forest_cycle_38;

    }

    break forest_cycle_38;

    }

    }

    forestValue448_78_0 = (((moom.e4)(receiver)).a(((moom.DT)(p1)), ((moom.bs)(((moom.e4)(receiver)).d))) - 1);

    }

    life7_85 = forestValue448_78_0;

    spill448_3 = life7_85;

    if (!((life6_13 != null))) {

        forestValue448_102_0 = spill448_3;

        break forest_join_102;

    }

    if (!((spill448_3 >= 0))) {

        break forest_join_120;

    }

    ((moom.e4)(receiver)).f = ((moom.DT)(((moom.DT)(p1)).a(((moom.bs)(((moom.e4)(receiver)).d)), ((int)(life7_85)))));

    ((moom.e4)(receiver)).h = ((int)(((moom.e4)(receiver)).a(((moom.DT)(((moom.e4)(receiver)).f)), ((moom.bs)(((moom.e4)(receiver)).c)))));

    spill448_4 = receiver;

    if (!((life6_13 != null))) {

        forestValue448_118_0 = spill448_4;

        break forest_join_118;

    }

    forestValue448_102_0 = ((moom.e4)(spill448_4)).h;

    }

    if (!((forestValue448_102_0 >= 2))) {

        break forest_join_114;

    }

    spill448_5 = receiver;

    if (!((life6_13 != null))) {

        forestValue448_121_0 = spill448_5;

        break forest_join_121;

    }

    if (!((((moom.e4)(spill448_5)).h > __sourceIntrinsic_108f2f8c3660bcde_invokedynamic448_36(14408, (4204346384210824060L ^ life4_3))))) {

        break forest_join_120;

    }

    }

    ((moom.e4)(receiver)).f = ((moom.DT)(null));

    forestValue448_118_0 = receiver;

    }

    ((moom.e4)(forestValue448_118_0)).h = ((int)(0));

    }

    forestValue448_121_0 = receiver;

    }

    if (!((life6_13 != null))) {

        forestValue448_126_0 = forestValue448_121_0;

        break forest_join_126;

    }

    if (!((((moom.e4)(forestValue448_121_0)).f != null))) {

        break forest_join_129;

    }

    forestValue448_126_0 = receiver;

    }

    ((moom.e4)(forestValue448_126_0)).g = ((int)(((moom.e4)(receiver)).c()));

    }

    return;

}



static {
i = ((long)(((moom._a)(moom._c.a(((long)(7329160738871312468L)), ((long)(-6868400017449577896L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(266068317785135L)))));
    l = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.e4.i ^ 19289144975276L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill822_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill822_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill822_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill822_14 = new byte[8];
    (__sourceSpill822_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill822_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation822_16 = __sourceSpill822_14;
    ((javax.crypto.Cipher)(__sourceSpill822_11)).init(((int)(__sourceSpill822_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill822_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation822_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[3];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "1\f¶N\007\0214\023ºb7Òý\r %5~©\024èÃ"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill822_25 = local6_life21;
        int __sourceSpill822_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill822_25)).substring(((int)(__sourceSpill822_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill822_30 = local8_life19;
        int __sourceSpill822_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill822_33 = new byte[8];
        (__sourceSpill822_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill822_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill822_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill822_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill822_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill822_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill822_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill822_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill822_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill822_34)).doFinal(((byte[])(__sourceSpill822_33)));
        (__sourceSpill822_30)[__sourceSpill822_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    j = ((long[])(local8_life19));
    k = ((java.lang.Integer[])(new java.lang.Integer[3]));
}

private static native <E extends Throwable> void __sourceConstructorInit_108f2f8c3660bcde_0(moom.e4 a0) throws E;

public int b() {
return this.h;
}


protected int c() {
int forestValue829_11_0;
    int forestValue829_79_0;
    int forestValue829_112_0;
    moom.e4 forestValue829_137_0;
    moom.e4 forestValue829_145_0;
    int forestValue829_173_0;
    int[] spill829_0;
    int spill829_1;
    boolean spill829_2;
    int spill829_3;
    moom.e4 spill829_4;
    int spill829_5;
    int spill829_6;
    long life1_3;
    int[] life3_8;
    int life4_20;
    moom.DT life5_34;
    net.minecraft.block.Block life6_40;
    net.minecraft.block.Block life6_74;
    net.minecraft.block.Block life6_99;
    int life4_122;
    forest_join_173: {
    forest_join_163: {
    forest_join_145: {
    forest_join_144: {
    forest_join_112: {
    forest_join_111: {
    life1_3 = (moom.e4.i ^ 73990488917751L);
    spill829_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    this.g = ((int)(0));
    life3_8 = spill829_0;
    forest_cycle_9: while (true) {
    forest_join_103: {
    forestValue829_11_0 = this.g;
    forest_cycle_11: while (true) {
    if (!((forestValue829_11_0 < __sourceIntrinsic_94b06fabf08c_invokedynamic829_4(14408, (4204363308855864054L ^ life1_3))))) {
        break forest_join_111;
    }
    spill829_1 = 0;
    if (!((life3_8 != null))) {
        forestValue829_112_0 = spill829_1;
        break forest_join_112;
    }
    life4_20 = spill829_1;
    forest_cycle_21: while (true) {
    forest_join_101: {
    forest_join_100: {
    forest_join_79: {
    forest_join_78: {
    forest_join_58: {
    forest_join_49: {
    if (!((life4_20 < this.h))) {
        break forest_join_103;
    }
    life5_34 = ((moom.DT)(((moom.DT)(this.f)).a(((moom.bs)(this.c)), ((int)(life4_20))))).a(((int)(this.g)));
    life6_40 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(this.a)).a__fE(((moom.DT)(life5_34))))).a__ch();
    spill829_2 = ((moom.e4)(this)).a(((net.minecraft.block.Block)(life6_40)));
    if (!((life3_8 != null))) {
        forestValue829_11_0 = ((spill829_2) ? 1 : 0);
        continue forest_cycle_11;
    }
    if (!((!spill829_2))) {
        break forest_join_49;
    }
    if (!((life3_8 == null))) {
        break forest_join_111;
    }
    }
    if (!((life6_40 == net.minecraft.init.Blocks.aY))) {
        break forest_join_58;
    }
    moom.e4 __stackOp829_17_0 = this;
    ((moom.e4)(__stackOp829_17_0)).e = ((int)((((moom.e4)(__stackOp829_17_0)).e + 1)));
    }
    spill829_3 = life4_20;
    if (!((life3_8 != null))) {
        forestValue829_79_0 = spill829_3;
        break forest_join_79;
    }
    if (!((spill829_3 == 0))) {
        break forest_join_78;
    }
    life6_74 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(this.a)).a__fE(((moom.DT)(((moom.DT)(life5_34)).a(((moom.bs)(this.d)))))))).a__ch();
    if (!((life3_8 != null))) {
        break forest_join_101;
    }
    if (!((life6_74 != net.minecraft.init.Blocks.Z))) {
        break forest_join_100;
    }
    if (!((life3_8 == null))) {
        break forest_join_111;
    }
    }
    forestValue829_79_0 = life4_20;
    }
    if (!((forestValue829_79_0 == (this.h - 1)))) {
        break forest_join_100;
    }
    life6_99 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(this.a)).a__fE(((moom.DT)(((moom.DT)(life5_34)).a(((moom.bs)(this.c)))))))).a__ch();
    if (!((life3_8 != null))) {
        break forest_join_101;
    }
    if (!((life6_99 != net.minecraft.init.Blocks.Z))) {
        break forest_join_100;
    }
    if (!((life3_8 == null))) {
        break forest_join_111;
    }
    }
    life4_20 += 1;
    }
    if (!((life3_8 == null))) {
        continue forest_cycle_21;
    }
    break forest_cycle_21;
    }
    break forest_cycle_11;
    }
    }
    moom.e4 __stackOp829_33_0 = this;
    ((moom.e4)(__stackOp829_33_0)).g = ((int)((((moom.e4)(__stackOp829_33_0)).g + 1)));
    if (!((life3_8 == null))) {
        continue forest_cycle_9;
    }
    break forest_cycle_9;
    }
    }
    forestValue829_112_0 = 0;
    }
    life4_122 = forestValue829_112_0;
    forest_cycle_113: while (true) {
    forest_join_141: {
    forest_join_137: {
    if (!((life4_122 < this.h))) {
        break forest_join_144;
    }
    spill829_4 = this;
    if (!((life3_8 != null))) {
        forestValue829_145_0 = spill829_4;
        break forest_join_145;
    }
    if (!((life3_8 != null))) {
        forestValue829_137_0 = spill829_4;
        break forest_join_137;
    }
    if (!((((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(((moom.e4)(spill829_4)).a)).a__fE(((moom.DT)(((moom.DT)(((moom.DT)(this.f)).a(((moom.bs)(this.c)), ((int)(life4_122))))).a(((int)(this.g)))))))).a__ch() != net.minecraft.init.Blocks.Z))) {
        break forest_join_141;
    }
    forestValue829_137_0 = this;
    }
    ((moom.e4)(forestValue829_137_0)).g = ((int)(0));
    if (!((life3_8 == null))) {
        break forest_join_144;
    }
    }
    life4_122 += 1;
    if (!((life3_8 == null))) {
        continue forest_cycle_113;
    }
    break forest_cycle_113;
    }
    }
    forestValue829_145_0 = this;
    }
    spill829_5 = ((moom.e4)(forestValue829_145_0)).g;
    if (!((life3_8 != null))) {
        forestValue829_173_0 = spill829_5;
        break forest_join_173;
    }
    if (!((spill829_5 <= __sourceIntrinsic_94b06fabf08c_invokedynamic829_48(14408, (4204363308855864054L ^ life1_3))))) {
        break forest_join_163;
    }
    spill829_6 = this.g;
    if (!((life3_8 != null))) {
        forestValue829_173_0 = spill829_6;
        break forest_join_173;
    }
    if (!((spill829_6 >= 3))) {
        break forest_join_163;
    }
    return this.g;
    }
    this.f = ((moom.DT)(null));
    this.h = ((int)(0));
    this.g = ((int)(0));
    forestValue829_173_0 = 0;
    }
    return forestValue829_173_0;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.e4.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 21211;
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
            throw new RuntimeException("moom/e4", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         k[var3] = var15;
      }

      return k[var3];
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral7434_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/e4"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


protected int a(moom.DT p0, moom.bs p1) {
moom.e4 lexicalValue1127_46_0;
    int lexicalValue1127_60_0;
    int[] spill1127_0;
    moom.e4 spill1127_1;
    long life3_3;
    int life6_6;
    int[] life5_7;
    moom.DT life7_19;
    net.minecraft.block.Block life7_68;
    lexical_join_60: {
    lexical_join_59: {
    lexical_join_46: {
    lexical_join_45: {
    life3_3 = (moom.e4.i ^ 80970463454459L);
    spill1127_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life6_6 = 0;
    life5_7 = spill1127_0;
    lexical_cycle_8: while (true) {
    lexical_join_42: {
    if (!((life6_6 < __sourceIntrinsic_4cdf2b9c5a0a_invokedynamic1127_2(13432, (5337245552593601736L ^ life3_3))))) {
        break lexical_join_45;
    }
    life7_19 = ((moom.DT)(p0)).a(((moom.bs)(p1)), ((int)(life6_6)));
    spill1127_1 = this;
    if (!((life5_7 != null))) {
        lexicalValue1127_46_0 = spill1127_1;
        break lexical_join_46;
    }
    if (!((life5_7 != null))) {
        lexicalValue1127_46_0 = spill1127_1;
        break lexical_join_46;
    }
    if (!(((moom.e4)(spill1127_1)).a(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(this.a)).a__fE(((moom.DT)(life7_19))))).a__ch()))))) {
        break lexical_join_45;
    }
    if (!((((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(this.a)).a__fE(((moom.DT)(((moom.DT)(life7_19)).b__DT()))))).a__ch() != net.minecraft.init.Blocks.Z))) {
        break lexical_join_42;
    }
    if (!((life5_7 == null))) {
        break lexical_join_45;
    }
    }
    life6_6 += 1;
    if (!((life5_7 == null))) { continue lexical_cycle_8; }
    break lexical_cycle_8;
    }
    }
    lexicalValue1127_46_0 = this;
    }
    life7_68 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(((moom.e4)(lexicalValue1127_46_0)).a)).a__fE(((moom.DT)(((moom.DT)(p0)).a(((moom.bs)(p1)), ((int)(life6_6)))))))).a__ch();
    if (!((life7_68 == net.minecraft.init.Blocks.Z))) {
        break lexical_join_59;
    }
    lexicalValue1127_60_0 = life6_6;
    break lexical_join_60;
    }
    lexicalValue1127_60_0 = 0;
    }
    return lexicalValue1127_60_0;
}


public int a() {
return this.g;
}


protected boolean a(net.minecraft.block.Block p0) {
net.minecraft.block.Block forwardValue3368_13_0;
    net.minecraft.block.Block forwardValue3368_18_0;
    int forwardValue3368_23_0;
    net.minecraft.block.Block spill3368_0;
    long life2_3;
    int[] life4_5;
    forward_join_23: {
    forward_join_22: {
    forward_join_20: {
    forward_join_18: {
    forward_join_13: {
    life2_3 = (moom.e4.i ^ 27357067027292L);
    life4_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3368_0 = p0;
    if (!((life4_5 != null))) {
        forwardValue3368_13_0 = spill3368_0;
        break forward_join_13;
    }
    if (!((((net.minecraft.block.Block)(spill3368_0)).J != moom.fn.a))) {
        break forward_join_20;
    }
    forwardValue3368_13_0 = p0;
    }
    if (!((life4_5 != null))) {
        forwardValue3368_18_0 = forwardValue3368_13_0;
        break forward_join_18;
    }
    if (!((forwardValue3368_13_0 != net.minecraft.init.Blocks.ab))) {
        break forward_join_20;
    }
    forwardValue3368_18_0 = p0;
    }
    if (!((forwardValue3368_18_0 == net.minecraft.init.Blocks.aY))) {
        break forward_join_22;
    }
    }
    forwardValue3368_23_0 = 1;
    break forward_join_23;
    }
    forwardValue3368_23_0 = 0;
    }
    return ((forwardValue3368_23_0) != 0);
}


public boolean a__Boolean() {
moom.e4 forwardValue3369_12_0;
    int forwardValue3369_24_0;
    int forwardValue3369_24_1;
    int forwardValue3369_30_0;
    int forwardValue3369_30_1;
    int forwardValue3369_42_0;
    int forwardValue3369_42_1;
    int forwardValue3369_44_0;
    int forwardValue3369_46_0;
    moom.e4 spill3369_0;
    int spill3369_1;
    int spill3369_2;
    int spill3369_3;
    long life1_3;
    int[] life3_5;
    forward_join_46: {
    forward_join_45: {
    forward_join_44: {
    forward_join_42: {
    forward_join_30: {
    forward_join_24: {
    forward_join_12: {
    life1_3 = (moom.e4.i ^ 51528614913537L);
    life3_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3369_0 = this;
    if (!((life3_5 != null))) {
        forwardValue3369_12_0 = spill3369_0;
        break forward_join_12;
    }
    if (!((((moom.e4)(spill3369_0)).f != null))) {
        break forward_join_45;
    }
    forwardValue3369_12_0 = this;
    }
    spill3369_1 = ((moom.e4)(forwardValue3369_12_0)).h;
    spill3369_2 = 2;
    if (!((life3_5 != null))) {
        forwardValue3369_24_0 = spill3369_1;
        forwardValue3369_24_1 = spill3369_2;
        break forward_join_24;
    }
    if (!((spill3369_1 >= spill3369_2))) {
        break forward_join_45;
    }
    forwardValue3369_24_0 = this.h;
    forwardValue3369_24_1 = __sourceIntrinsic_1a14968dced5_invokedynamic3369_5(21054, (3320731685821309047L ^ life1_3));
    }
    if (!((life3_5 != null))) {
        forwardValue3369_30_0 = forwardValue3369_24_0;
        forwardValue3369_30_1 = forwardValue3369_24_1;
        break forward_join_30;
    }
    if (!((forwardValue3369_24_0 <= forwardValue3369_24_1))) {
        break forward_join_45;
    }
    forwardValue3369_30_0 = this.g;
    forwardValue3369_30_1 = 3;
    }
    if (!((life3_5 != null))) {
        forwardValue3369_42_0 = forwardValue3369_30_0;
        forwardValue3369_42_1 = forwardValue3369_30_1;
        break forward_join_42;
    }
    if (!((forwardValue3369_30_0 >= forwardValue3369_30_1))) {
        break forward_join_45;
    }
    spill3369_3 = this.g;
    if (!((life3_5 != null))) {
        forwardValue3369_44_0 = spill3369_3;
        break forward_join_44;
    }
    forwardValue3369_42_0 = spill3369_3;
    forwardValue3369_42_1 = __sourceIntrinsic_1a14968dced5_invokedynamic3369_8(14408, (4204263846271814144L ^ life1_3));
    }
    if (!((forwardValue3369_42_0 <= forwardValue3369_42_1))) {
        break forward_join_45;
    }
    forwardValue3369_44_0 = 1;
    }
    forwardValue3369_46_0 = forwardValue3369_44_0;
    break forward_join_46;
    }
    forwardValue3369_46_0 = 0;
    }
    return ((forwardValue3369_46_0) != 0);
}


public void a__Void() {
int[] spill1128_0;
    long life1_3;
    int life4_6;
    int[] life3_7;
    moom.DT life5_18;
    int life6_20;
    lexical_join_47: {
    life1_3 = (moom.e4.i ^ 78453794287943L);
    spill1128_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life4_6 = 0;
    life3_7 = spill1128_0;
    lexical_cycle_8: while (true) {
    lexical_join_45: {
    lexical_join_44: {
    if (!((life4_6 < this.h))) {
        break lexical_join_47;
    }
    life5_18 = ((moom.DT)(this.f)).a(((moom.bs)(this.c)), ((int)(life4_6)));
    life6_20 = 0;
    lexical_cycle_21: while (true) {
    if (!((life6_20 < this.g))) {
        break lexical_join_44;
    }
    ((net.minecraft.world.World)(this.a)).a(((moom.DT)(((moom.DT)(life5_18)).a(((int)(life6_20))))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((moom.cr)(net.minecraft.init.Blocks.aY)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.cr.R)), ((java.lang.Comparable)(this.b))))), ((int)(2)));
    life6_20 += 1;
    if (!((life3_7 != null))) {
        break lexical_join_45;
    }
    if (!((life3_7 == null))) { continue lexical_cycle_21; }
    break lexical_cycle_21;
    }
    }
    life4_6 += 1;
    }
    if (!((life3_7 == null))) { continue lexical_cycle_8; }
    break lexical_cycle_8;
    }
    }
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_108f2f8c3660bcde_invokedynamic448_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_108f2f8c3660bcde_invokedynamic448_36(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral7434_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4cdf2b9c5a0a_invokedynamic1127_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1a14968dced5_invokedynamic3369_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1a14968dced5_invokedynamic3369_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_94b06fabf08c_invokedynamic829_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_94b06fabf08c_invokedynamic829_48(int a0, long a1) throws E;
}
