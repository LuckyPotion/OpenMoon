package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class d_ extends net.minecraft.block.Block {

public static final moom.fy Q;

private static final long R;

private static final long[] S;

private static final java.lang.Integer[] T;

private static final java.util.Map U;

protected d_() {
super(moom.fn.k);
    ((moom.d_)(this)).a__Void(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((moom.fA)(((moom.d_)(this)).M)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.d_.Q)), ((java.lang.Comparable)(java.lang.Integer.valueOf(((int)(0)))))))));
    float local1 = 0x1.8p-2f;
    ((moom.d_)(this)).a(((float)((0x1.0p-1f - local1))), ((float)(0x0.0p0f)), ((float)((0x1.0p-1f - local1))), ((float)((0x1.0p-1f + local1))), ((float)(0x1.0p0f)), ((float)((0x1.0p-1f + local1))));
    ((moom.d_)(this)).a(((boolean)(true)));
    return;
}


static {
R = ((long)(((moom._a)(moom._c.a(((long)(7201159570738492479L)), ((long)(-3430635420253940779L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(216733258218751L)))));
    long local11_life6 = (moom.d_.R ^ 106433620704619L);
    U = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life9;
    javax.crypto.Cipher __sourceSpill811_11 = (local0_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill811_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill811_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill811_14 = new byte[8];
    (__sourceSpill811_14)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local1_life15 = 1;
    while ((local1_life15 < 8)) {
        (__sourceSpill811_14)[local1_life15] = ((byte) ((int) ((local11_life6 << (local1_life15 * 8)) >>> 56)));
        local1_life15 += 1;
    }
    byte[] __sourcePreallocation811_16 = __sourceSpill811_14;
    ((javax.crypto.Cipher)(__sourceSpill811_11)).init(((int)(__sourceSpill811_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill811_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation811_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life19 = new long[2];
    int local3_life20 = 0;
    java.lang.String local4_life21;
    int local5_life23 = ((java.lang.String)((local4_life21 = "ç\013¿´\000ymÜ¢äÂ5UÁø"))).length();
    int local2_life24 = 0;
    do {
        java.lang.String __sourceSpill811_25 = local4_life21;
        int __sourceSpill811_26 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill811_25)).substring(((int)(__sourceSpill811_26)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill811_30 = local6_life19;
        int __sourceSpill811_31 = local3_life20;
        local3_life20 += 1;
        long local8_life32 = (((((((((((long) (local7_life29)[0]) & 255L) << 56) | ((((long) (local7_life29)[1]) & 255L) << 48)) | ((((long) (local7_life29)[2]) & 255L) << 40)) | ((((long) (local7_life29)[3]) & 255L) << 32)) | ((((long) (local7_life29)[4]) & 255L) << 24)) | ((((long) (local7_life29)[5]) & 255L) << 16)) | ((((long) (local7_life29)[6]) & 255L) << 8)) | (((long) (local7_life29)[7]) & 255L));
        byte[] __sourceSpill811_33 = new byte[8];
        (__sourceSpill811_33)[0] = ((byte) ((int) (local8_life32 >>> 56)));
        (__sourceSpill811_33)[1] = ((byte) ((int) (local8_life32 >>> 48)));
        (__sourceSpill811_33)[2] = ((byte) ((int) (local8_life32 >>> 40)));
        (__sourceSpill811_33)[3] = ((byte) ((int) (local8_life32 >>> 32)));
        (__sourceSpill811_33)[4] = ((byte) ((int) (local8_life32 >>> 24)));
        (__sourceSpill811_33)[5] = ((byte) ((int) (local8_life32 >>> 16)));
        (__sourceSpill811_33)[6] = ((byte) ((int) (local8_life32 >>> 8)));
        (__sourceSpill811_33)[7] = ((byte) ((int) local8_life32));
        javax.crypto.Cipher __sourceSpill811_34 = local0_life9;
        byte[] local10_life36 = ((javax.crypto.Cipher)(__sourceSpill811_34)).doFinal(((byte[])(__sourceSpill811_33)));
        (__sourceSpill811_30)[__sourceSpill811_31] = (((((((((((long) (local10_life36)[0]) & 255L) << 56) | ((((long) (local10_life36)[1]) & 255L) << 48)) | ((((long) (local10_life36)[2]) & 255L) << 40)) | ((((long) (local10_life36)[3]) & 255L) << 32)) | ((((long) (local10_life36)[4]) & 255L) << 24)) | ((((long) (local10_life36)[5]) & 255L) << 16)) | ((((long) (local10_life36)[6]) & 255L) << 8)) | (((long) (local10_life36)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    S = ((long[])(local6_life19));
    T = ((java.lang.Integer[])(new java.lang.Integer[2]));
    Q = ((moom.fy)(moom.fy.a(((java.lang.String)("age")), ((int)(0)), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite811_39(23661, (6782106012003793588L ^ local11_life6)))))));
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7345_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/d_"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public net.minecraft.block.state.IBlockState b__fE(int p0) {
return ((net.minecraft.block.state.IBlockState)(((moom.d_)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.d_.Q)), ((java.lang.Comparable)(java.lang.Integer.valueOf(((int)(p0))))));
}


public int b(net.minecraft.block.state.IBlockState p0) {
return ((java.lang.Integer)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.d_.Q))))))).intValue();
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.d_.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 14162;
      if (T[var3] == null) {
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
         long var5 = S[var3];
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
         Object[] var9 = (Object[])U.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               U.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/d_", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         T[var3] = var15;
      }

      return T[var3];
}


public boolean b__Boolean(net.minecraft.world.World p0, moom.DT p1) {
net.minecraft.block.Block lexicalValue1117_20_0;
    net.minecraft.block.Block lexicalValue1117_28_0;
    net.minecraft.block.Block lexicalValue1117_28_1;
    net.minecraft.block.Block lexicalValue1117_30_0;
    int[] spill1117_0;
    net.minecraft.block.Block spill1117_1;
    moom.dC spill1117_2;
    net.minecraft.block.Block spill1117_3;
    long life3_3;
    net.minecraft.block.Block life6_10;
    int[] life5_11;
    java.util.Iterator life7_52;
    moom.bs life8_59;
    lexical_join_58: {
    lexical_join_34: {
    lexical_join_30: {
    lexical_join_28: {
    lexical_join_20: {
    lexical_join_19: {
    life3_3 = (moom.d_.R ^ 17721001582095L);
    spill1117_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life6_10 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).b__DT()))))).a__ch();
    life5_11 = spill1117_0;
    spill1117_1 = life6_10;
    if (!((life5_11 != null))) {
        lexicalValue1117_20_0 = spill1117_1;
        break lexical_join_20;
    }
    if (!((spill1117_1 == this))) {
        break lexical_join_19;
    }
    return ((1) != 0);
    }
    lexicalValue1117_20_0 = life6_10;
    }
    spill1117_2 = net.minecraft.init.Blocks.c;
    if (!((life5_11 != null))) {
        lexicalValue1117_28_0 = lexicalValue1117_20_0;
        lexicalValue1117_28_1 = spill1117_2;
        break lexical_join_28;
    }
    if (!((lexicalValue1117_20_0 != spill1117_2))) {
        break lexical_join_34;
    }
    spill1117_3 = life6_10;
    if (!((life5_11 != null))) {
        lexicalValue1117_30_0 = spill1117_3;
        break lexical_join_30;
    }
    lexicalValue1117_28_0 = spill1117_3;
    lexicalValue1117_28_1 = net.minecraft.init.Blocks.d;
    }
    if (!((lexicalValue1117_28_0 != lexicalValue1117_28_1))) {
        break lexical_join_34;
    }
    lexicalValue1117_30_0 = life6_10;
    }
    if (!((lexicalValue1117_30_0 != net.minecraft.init.Blocks.m))) {
        break lexical_join_34;
    }
    return ((0) != 0);
    }
    life7_52 = ((net.minecraft.util.EnumFacing$Plane)(net.minecraft.util.EnumFacing$Plane.HORIZONTAL)).iterator();
    lexical_cycle_37: while (true) {
    lexical_join_56: {
    if (!(((java.util.Iterator)(life7_52)).hasNext())) {
        break lexical_join_58;
    }
    life8_59 = ((moom.bs)(((java.util.Iterator)(life7_52)).next()));
    if (!((((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(((moom.DT)(p1)).a(((moom.bs)(life8_59))))).b__DT()))))).a__ch())).a__fn() == moom.fn.h))) {
        break lexical_join_56;
    }
    return ((1) != 0);
    }
    if (!((life5_11 == null))) { continue lexical_cycle_37; }
    break lexical_cycle_37;
    }
    }
    return ((0) != 0);
}


public void b(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, java.util.Random p3) {
net.minecraft.world.World lexicalValue1116_26_0;
    moom.DT lexicalValue1116_26_1;
    int lexicalValue1116_27_0;
    int lexicalValue1116_31_0;
    int lexicalValue1116_55_0;
    int lexicalValue1116_95_0;
    net.minecraft.world.World spill1116_0;
    moom.DT spill1116_1;
    boolean spill1116_2;
    int spill1116_3;
    int spill1116_4;
    long life5_3;
    int[] life7_5;
    int life8_46;
    int life9_79;
    lexical_join_96: {
    lexical_join_95: {
    lexical_join_84: {
    lexical_join_55: {
    lexical_join_45: {
    lexical_join_31: {
    lexical_join_27: {
    lexical_join_26: {
    lexical_join_23: {
    life5_3 = (moom.d_.R ^ 56076169045498L);
    life7_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill1116_0 = p0;
    spill1116_1 = ((moom.DT)(p1)).b__DT();
    if (!((life7_5 != null))) {
        lexicalValue1116_26_0 = spill1116_0;
        lexicalValue1116_26_1 = spill1116_1;
        break lexical_join_26;
    }
    if (!((((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(spill1116_0)).a__fE(((moom.DT)(spill1116_1))))).a__ch() != net.minecraft.init.Blocks.aM))) {
        break lexical_join_23;
    }
    spill1116_2 = ((moom.d_)(this)).a__Boolean(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)));
    if (!((life7_5 != null))) {
        lexicalValue1116_27_0 = ((spill1116_2) ? 1 : 0);
        break lexical_join_27;
    }
    if (!(spill1116_2)) {
        break lexical_join_96;
    }
    }
    lexicalValue1116_26_0 = p0;
    lexicalValue1116_26_1 = ((moom.DT)(p1)).a__DT();
    }
    lexicalValue1116_27_0 = ((((net.minecraft.world.World)(lexicalValue1116_26_0)).a__Boolean(((moom.DT)(lexicalValue1116_26_1)))) ? 1 : 0);
    }
    if (!((life7_5 != null))) {
        lexicalValue1116_31_0 = lexicalValue1116_27_0;
        break lexical_join_31;
    }
    if (!((lexicalValue1116_27_0 != 0))) {
        break lexical_join_96;
    }
    lexicalValue1116_31_0 = 1;
    }
    life8_46 = lexicalValue1116_31_0;
    lexical_cycle_32: while (true) {
    if (!((((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).b(((int)(life8_46)))))))).a__ch() == this))) {
        break lexical_join_45;
    }
    life8_46 += 1;
    if (!((life7_5 != null))) {
        break lexical_join_96;
    }
    if (!((life7_5 == null))) { continue lexical_cycle_32; }
    break lexical_cycle_32;
    }
    }
    spill1116_3 = life8_46;
    if (!((life7_5 != null))) {
        lexicalValue1116_55_0 = spill1116_3;
        break lexical_join_55;
    }
    if (!((spill1116_3 < 3))) {
        break lexical_join_96;
    }
    lexicalValue1116_55_0 = ((java.lang.Integer)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.d_.Q))))))).intValue();
    }
    life9_79 = lexicalValue1116_55_0;
    spill1116_4 = life9_79;
    if (!((life7_5 != null))) {
        lexicalValue1116_95_0 = spill1116_4;
        break lexical_join_95;
    }
    if (!((spill1116_4 == __sourceIntrinsic_b4b54c999db9_invokedynamic1116_18(15896, (8203602615012229201L ^ life5_3))))) {
        break lexical_join_84;
    }
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(((moom.DT)(p1)).a__DT())), ((net.minecraft.block.state.IBlockState)(((moom.d_)(this)).a__fE())));
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(p2)).a__fE(((net.minecraft.block.properties.IProperty)(moom.d_.Q)), ((java.lang.Comparable)(java.lang.Integer.valueOf(((int)(0)))))))), ((int)(4)));
    if (!((life7_5 == null))) {
        break lexical_join_96;
    }
    }
    lexicalValue1116_95_0 = ((((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(p2)).a__fE(((net.minecraft.block.properties.IProperty)(moom.d_.Q)), ((java.lang.Comparable)(java.lang.Integer.valueOf(((int)((life9_79 + 1))))))))), ((int)(4)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(lexicalValue1116_95_0);
    }
    return;
}


public boolean c(net.minecraft.world.World p0, moom.DT p1) {
return (__sourceIntrinsic_booleanComparison((((moom.d_)(this)).b__Boolean(((net.minecraft.world.World)(p0)), ((moom.DT)(p1))))) != 0);
}


protected moom.fA a__fA() {
return new moom.fA(this, new net.minecraft.block.properties.IProperty[] {moom.d_.Q});
}


protected final boolean a__Boolean(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
int forwardValue3292_26_0;
    boolean spill3292_0;
    long life4_3;
    int[] life6_5;
    forward_join_26: {
    forward_join_15: {
    life4_3 = (moom.d_.R ^ 87825214290438L);
    life6_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3292_0 = ((moom.d_)(this)).c(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)));
    if (!((life6_5 != null))) {
        forwardValue3292_26_0 = ((spill3292_0) ? 1 : 0);
        break forward_join_26;
    }
    if (!(spill3292_0)) {
        break forward_join_15;
    }
    return ((1) != 0);
    }
    ((moom.d_)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((int)(0)));
    ((net.minecraft.world.World)(p0)).d__Boolean(((moom.DT)(p1)));
    forwardValue3292_26_0 = 0;
    }
    return ((forwardValue3292_26_0) != 0);
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.block.Block p3) {
((moom.d_)(this)).a__Boolean(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)));
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public net.minecraft.item.Item a__wQ(net.minecraft.world.World p0, moom.DT p1) {
return net.minecraft.init.Items.aJ;
}


public net.minecraft.item.Item a(net.minecraft.block.state.IBlockState p0, java.util.Random p1, int p2) {
return net.minecraft.init.Items.aJ;
}


public moom.CA a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
return null;
}


public int a(net.minecraft.world.IBlockAccess p0, moom.DT p1, int p2) {
return ((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.IBlockAccess)(p0)).a__ES(((moom.DT)(p1))))).a__Int(((moom.DT)(p1)));
}


public net.minecraft.util.EnumWorldBlockLayer a__bx() {
return net.minecraft.util.EnumWorldBlockLayer.CUTOUT;
}


public boolean g() {
return ((0) != 0);
}


public boolean j() {
return ((0) != 0);
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite811_39(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7345_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b4b54c999db9_invokedynamic1116_18(int a0, long a1) throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
