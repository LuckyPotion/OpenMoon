package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class dy extends net.minecraft.block.Block {

public static moom.fy Q;

private static long R;

private static long[] S;

private static java.lang.Integer[] T;

private static java.util.Map U;

protected dy() { super((moom.fn)null); }


private static void __sourceConstructorBody_f2e2d2c2a417e256(moom.dy receiver) throws Throwable {

long local1 = (moom.dy.R ^ 78649930423113L);

    moom.dy.__sourceConstructorInit_f2e2d2c2a417e256_0(((moom.dy)(receiver)), ((moom.fn)(moom.fn.c)));

    ((moom.dy)(receiver)).a__Void(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((moom.fA)(((moom.dy)(receiver)).M)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.dy.Q)), ((java.lang.Comparable)(java.lang.Integer.valueOf(((int)(0)))))))));

    ((moom.dy)(receiver)).a(((boolean)(true)));

    ((moom.dy)(receiver)).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.ep-1f)), ((float)(0x1.0p0f)));

    ((moom.dy)(receiver)).b(((int)(__sourceIntrinsic_f2e2d2c2a417e256_originalDynamicSite2662_11(23321, (8086035180044597604L ^ local1)))));

    return;

}



static {
R = ((long)(((moom._a)(moom._c.a(((long)(4544529929005134318L)), ((long)(1078690467765891020L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(120134226686650L)))));
    long local11_life6 = (moom.dy.R ^ 72442366662323L);
    U = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life9;
    javax.crypto.Cipher __sourceSpill1172_11 = (local0_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1172_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1172_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1172_14 = new byte[8];
    (__sourceSpill1172_14)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local1_life15 = 1;
    while ((local1_life15 < 8)) {
        (__sourceSpill1172_14)[local1_life15] = ((byte) ((int) ((local11_life6 << (local1_life15 * 8)) >>> 56)));
        local1_life15 += 1;
    }
    byte[] __sourcePreallocation1172_16 = __sourceSpill1172_14;
    ((javax.crypto.Cipher)(__sourceSpill1172_11)).init(((int)(__sourceSpill1172_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1172_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1172_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life19 = new long[5];
    int local3_life20 = 0;
    java.lang.String local4_life21;
    int local5_life23 = ((java.lang.String)((local4_life21 = "Ä\024¦w}?GC¦%íÅQÑ­6Þ¶á7gJ\035"))).length();
    int local2_life24 = 0;
    do {
        java.lang.String __sourceSpill1172_25 = local4_life21;
        int __sourceSpill1172_26 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1172_25)).substring(((int)(__sourceSpill1172_26)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1172_30 = local6_life19;
        int __sourceSpill1172_31 = local3_life20;
        local3_life20 += 1;
        long local8_life32 = (((((((((((long) (local7_life29)[0]) & 255L) << 56) | ((((long) (local7_life29)[1]) & 255L) << 48)) | ((((long) (local7_life29)[2]) & 255L) << 40)) | ((((long) (local7_life29)[3]) & 255L) << 32)) | ((((long) (local7_life29)[4]) & 255L) << 24)) | ((((long) (local7_life29)[5]) & 255L) << 16)) | ((((long) (local7_life29)[6]) & 255L) << 8)) | (((long) (local7_life29)[7]) & 255L));
        byte[] __sourceSpill1172_33 = new byte[8];
        (__sourceSpill1172_33)[0] = ((byte) ((int) (local8_life32 >>> 56)));
        (__sourceSpill1172_33)[1] = ((byte) ((int) (local8_life32 >>> 48)));
        (__sourceSpill1172_33)[2] = ((byte) ((int) (local8_life32 >>> 40)));
        (__sourceSpill1172_33)[3] = ((byte) ((int) (local8_life32 >>> 32)));
        (__sourceSpill1172_33)[4] = ((byte) ((int) (local8_life32 >>> 24)));
        (__sourceSpill1172_33)[5] = ((byte) ((int) (local8_life32 >>> 16)));
        (__sourceSpill1172_33)[6] = ((byte) ((int) (local8_life32 >>> 8)));
        (__sourceSpill1172_33)[7] = ((byte) ((int) local8_life32));
        javax.crypto.Cipher __sourceSpill1172_34 = local0_life9;
        byte[] local10_life36 = ((javax.crypto.Cipher)(__sourceSpill1172_34)).doFinal(((byte[])(__sourceSpill1172_33)));
        (__sourceSpill1172_30)[__sourceSpill1172_31] = (((((((((((long) (local10_life36)[0]) & 255L) << 56) | ((((long) (local10_life36)[1]) & 255L) << 48)) | ((((long) (local10_life36)[2]) & 255L) << 40)) | ((((long) (local10_life36)[3]) & 255L) << 32)) | ((((long) (local10_life36)[4]) & 255L) << 24)) | ((((long) (local10_life36)[5]) & 255L) << 16)) | ((((long) (local10_life36)[6]) & 255L) << 8)) | (((long) (local10_life36)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    local5_life23 = ((java.lang.String)((local4_life21 = "YBBðeïõ\b\037è\006døC/\""))).length();
    local2_life24 = 0;
    do {
        java.lang.String __sourceSpill1172_38 = local4_life21;
        int __sourceSpill1172_39 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1172_38)).substring(((int)(__sourceSpill1172_39)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1172_43 = local6_life19;
        int __sourceSpill1172_44 = local3_life20;
        local3_life20 += 1;
        long local8_life45 = (((((((((((long) (local7_life42)[0]) & 255L) << 56) | ((((long) (local7_life42)[1]) & 255L) << 48)) | ((((long) (local7_life42)[2]) & 255L) << 40)) | ((((long) (local7_life42)[3]) & 255L) << 32)) | ((((long) (local7_life42)[4]) & 255L) << 24)) | ((((long) (local7_life42)[5]) & 255L) << 16)) | ((((long) (local7_life42)[6]) & 255L) << 8)) | (((long) (local7_life42)[7]) & 255L));
        byte[] __sourceSpill1172_46 = new byte[8];
        (__sourceSpill1172_46)[0] = ((byte) ((int) (local8_life45 >>> 56)));
        (__sourceSpill1172_46)[1] = ((byte) ((int) (local8_life45 >>> 48)));
        (__sourceSpill1172_46)[2] = ((byte) ((int) (local8_life45 >>> 40)));
        (__sourceSpill1172_46)[3] = ((byte) ((int) (local8_life45 >>> 32)));
        (__sourceSpill1172_46)[4] = ((byte) ((int) (local8_life45 >>> 24)));
        (__sourceSpill1172_46)[5] = ((byte) ((int) (local8_life45 >>> 16)));
        (__sourceSpill1172_46)[6] = ((byte) ((int) (local8_life45 >>> 8)));
        (__sourceSpill1172_46)[7] = ((byte) ((int) local8_life45));
        javax.crypto.Cipher __sourceSpill1172_47 = local0_life9;
        byte[] local10_life49 = ((javax.crypto.Cipher)(__sourceSpill1172_47)).doFinal(((byte[])(__sourceSpill1172_46)));
        (__sourceSpill1172_43)[__sourceSpill1172_44] = (((((((((((long) (local10_life49)[0]) & 255L) << 56) | ((((long) (local10_life49)[1]) & 255L) << 48)) | ((((long) (local10_life49)[2]) & 255L) << 40)) | ((((long) (local10_life49)[3]) & 255L) << 32)) | ((((long) (local10_life49)[4]) & 255L) << 24)) | ((((long) (local10_life49)[5]) & 255L) << 16)) | ((((long) (local10_life49)[6]) & 255L) << 8)) | (((long) (local10_life49)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    S = ((long[])(local6_life19));
    T = ((java.lang.Integer[])(new java.lang.Integer[5]));
    Q = ((moom.fy)(moom.fy.a(((java.lang.String)("moisture")), ((int)(0)), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1172_52(7808, (8505594363644571910L ^ local11_life6)))))));
}

private static native <E extends Throwable> void __sourceConstructorInit_f2e2d2c2a417e256_0(moom.dy a0, moom.fn a1) throws E;

private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7421_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/dy"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public net.minecraft.block.state.IBlockState b__fE(int p0) {
long local2 = (moom.dy.R ^ 66250179248946L);
    return ((net.minecraft.block.state.IBlockState)(((moom.dy)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.dy.Q)), ((java.lang.Comparable)(java.lang.Integer.valueOf(((int)((p0 & __sourceIntrinsic_819466f05fee_originalDynamicSite1414_3(20014, (4291767096949519402L ^ local2)))))))));
}


public int b(net.minecraft.block.state.IBlockState p0) {
return ((java.lang.Integer)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.dy.Q))))))).intValue();
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.dy.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 4555;
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
            throw new RuntimeException("moom/dy", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         T[var3] = var15;
      }

      return T[var3];
}


public void b(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, java.util.Random p3) {
int forwardValue3359_48_0;
    int forwardValue3359_56_0;
    int forwardValue3359_60_0;
    int forwardValue3359_81_0;
    int[] spill3359_0;
    boolean spill3359_1;
    boolean spill3359_2;
    int spill3359_3;
    long life5_3;
    int life8_10;
    int[] life7_11;
    forward_join_82: {
    forward_join_81: {
    forward_join_60: {
    forward_join_59: {
    forward_join_56: {
    forward_join_48: {
    forward_join_44: {
    life5_3 = (moom.dy.R ^ 20550841393637L);
    spill3359_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life8_10 = ((java.lang.Integer)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.dy.Q))))))).intValue();
    life7_11 = spill3359_0;
    spill3359_1 = ((moom.dy)(this)).d(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)));
    if (!((life7_11 != null))) {
        forwardValue3359_60_0 = ((spill3359_1) ? 1 : 0);
        break forward_join_60;
    }
    if (!((!spill3359_1))) {
        break forward_join_59;
    }
    spill3359_2 = ((net.minecraft.world.World)(p0)).m(((moom.DT)(((moom.DT)(p1)).a__DT())));
    if (!((life7_11 != null))) {
        forwardValue3359_60_0 = ((spill3359_2) ? 1 : 0);
        break forward_join_60;
    }
    if (!((!spill3359_2))) {
        break forward_join_59;
    }
    spill3359_3 = life8_10;
    if (!((life7_11 != null))) {
        forwardValue3359_48_0 = spill3359_3;
        break forward_join_48;
    }
    if (!((spill3359_3 > 0))) {
        break forward_join_44;
    }
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(p2)).a__fE(((net.minecraft.block.properties.IProperty)(moom.dy.Q)), ((java.lang.Comparable)(java.lang.Integer.valueOf(((int)((life8_10 - 1))))))))), ((int)(2)));
    if (!((life7_11 == null))) {
        break forward_join_82;
    }
    }
    forwardValue3359_48_0 = ((((moom.dy)(this)).c(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)))) ? 1 : 0);
    }
    if (!((life7_11 != null))) {
        forwardValue3359_56_0 = forwardValue3359_48_0;
        break forward_join_56;
    }
    if (!((forwardValue3359_48_0 == 0))) {
        break forward_join_82;
    }
    forwardValue3359_56_0 = ((((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.d)).a__fE())))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue3359_56_0);
    if (!((life7_11 == null))) {
        break forward_join_82;
    }
    }
    forwardValue3359_60_0 = life8_10;
    }
    if (!((life7_11 != null))) {
        forwardValue3359_81_0 = forwardValue3359_60_0;
        break forward_join_81;
    }
    if (!((forwardValue3359_60_0 < __sourceIntrinsic_b4b54c999db9_invokedynamic3359_22(20014, (4291725516284483325L ^ life5_3))))) {
        break forward_join_82;
    }
    forwardValue3359_81_0 = ((((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(p2)).a__fE(((net.minecraft.block.properties.IProperty)(moom.dy.Q)), ((java.lang.Comparable)(java.lang.Integer.valueOf(((int)(__sourceIntrinsic_b4b54c999db9_invokedynamic3359_24(20014, (4291725516284483325L ^ life5_3)))))))))), ((int)(2)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue3359_81_0);
    }
    return;
}


private boolean c(net.minecraft.world.World p0, moom.DT p1) {
int forwardValue3360_23_0;
    int forwardValue3360_25_0;
    int[] spill3360_0;
    int spill3360_1;
    int spill3360_2;
    long life3_3;
    net.minecraft.block.Block life6_10;
    int[] life5_11;
    forward_join_25: {
    forward_join_24: {
    forward_join_23: {
    forward_join_22: {
    life3_3 = (moom.dy.R ^ 112124821987315L);
    spill3360_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life6_10 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).a__DT()))))).a__ch();
    life5_11 = spill3360_0;
    spill3360_1 = ((life6_10 instanceof moom.cv) ? 1 : 0);
    if (!((life5_11 != null))) {
        forwardValue3360_23_0 = spill3360_1;
        break forward_join_23;
    }
    if (!((spill3360_1 == 0))) {
        break forward_join_22;
    }
    spill3360_2 = ((life6_10 instanceof moom.cH) ? 1 : 0);
    if (!((life5_11 != null))) {
        forwardValue3360_23_0 = spill3360_2;
        break forward_join_23;
    }
    if (!((spill3360_2 != 0))) {
        break forward_join_24;
    }
    }
    forwardValue3360_23_0 = 1;
    }
    forwardValue3360_25_0 = forwardValue3360_23_0;
    break forward_join_25;
    }
    forwardValue3360_25_0 = 0;
    }
    return ((forwardValue3360_25_0) != 0);
}


private boolean d(net.minecraft.world.World p0, moom.DT p1) {
int[] spill1126_0;
    long life3_3;
    java.util.Iterator life6_25;
    int[] life5_26;
    moom.DU life7_33;
    lexical_join_45: {
    life3_3 = (moom.dy.R ^ 87874495352854L);
    spill1126_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life6_25 = ((java.lang.Iterable)(moom.DT.b(((moom.DT)(((moom.DT)(p1)).a(((int)(__sourceIntrinsic_44aac53dd1a4_invokedynamic1126_2(12443, (3134375584350984634L ^ life3_3)))), ((int)(0)), ((int)(__sourceIntrinsic_44aac53dd1a4_invokedynamic1126_3(23115, (2181249774771843948L ^ life3_3))))))), ((moom.DT)(((moom.DT)(p1)).a(((int)(4)), ((int)(1)), ((int)(4)))))))).iterator();
    life5_26 = spill1126_0;
    lexical_cycle_27: while (true) {
    lexical_join_43: {
    if (!(((java.util.Iterator)(life6_25)).hasNext())) {
        break lexical_join_45;
    }
    life7_33 = ((moom.DU)(((java.util.Iterator)(life6_25)).next()));
    if (!((((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life7_33))))).a__ch())).a__fn() == moom.fn.h))) {
        break lexical_join_43;
    }
    return ((1) != 0);
    }
    if (!((life5_26 == null))) { continue lexical_cycle_27; }
    break lexical_cycle_27;
    }
    }
    return ((0) != 0);
}


protected moom.fA a__fA() {
return new moom.fA(this, new net.minecraft.block.properties.IProperty[] {moom.dy.Q});
}


public net.minecraft.item.Item a(net.minecraft.block.state.IBlockState p0, java.util.Random p1, int p2) {
return ((net.minecraft.block.Block)(net.minecraft.init.Blocks.d)).a(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.d)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.dq.Q)), ((java.lang.Comparable)(net.minecraft.block.BlockDirt$DirtType.DIRT))))), ((java.util.Random)(p1)), ((int)(p2)));
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public moom.CA a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
return new moom.CA(((double) ((moom.DT)(p1)).a()), ((double) ((moom.DT)(p1)).b()), ((double) ((moom.DT)(p1)).c()), ((double) (((moom.DT)(p1)).a() + 1)), ((double) (((moom.DT)(p1)).b() + 1)), ((double) (((moom.DT)(p1)).c() + 1)));
}


public boolean a__Boolean(net.minecraft.world.IBlockAccess p0, moom.DT p1, moom.bs p2) {
net.minecraft.block.Block forwardValue339_26_0;
    int forwardValue339_31_0;
    int forwardValue339_37_0;
    int spill339_0;
    net.minecraft.block.Block spill339_1;
    long life4_3;
    int[] life6_5;
    net.minecraft.block.Block life7_23;
    forward_join_37: {
    forward_join_32: {
    forward_join_31: {
    forward_join_30: {
    forward_join_26: {
    forward_join_15: {
    forward_join_13: {
    life4_3 = (moom.dy.R ^ 9366304385169L);
    life6_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill339_0 = (moom.eT.a)[((moom.bs)(p2)).ordinal()];
    if (!((life6_5 != null))) {
        forwardValue339_37_0 = spill339_0;
        break forward_join_37;
    }
    switch (spill339_0) {
case 1:
{
        break forward_join_13;
    }
case 2:
case 3:
case 4:
case 5:
{
        break forward_join_15;
    }
default:
{
        break forward_join_32;
    }
}
    }
    return ((1) != 0);
    }
    life7_23 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(p1))))).a__ch();
    spill339_1 = life7_23;
    if (!((life6_5 != null))) {
        forwardValue339_26_0 = spill339_1;
        break forward_join_26;
    }
    if (!((!((net.minecraft.block.Block)(spill339_1)).j()))) {
        break forward_join_30;
    }
    forwardValue339_26_0 = life7_23;
    }
    if (!((forwardValue339_26_0 != net.minecraft.init.Blocks.ak))) {
        break forward_join_30;
    }
    forwardValue339_31_0 = 1;
    break forward_join_31;
    }
    forwardValue339_31_0 = 0;
    }
    return ((forwardValue339_31_0) != 0);
    }
    forwardValue339_37_0 = ((super.a__Boolean(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(p1)), ((moom.bs)(p2)))) ? 1 : 0);
    }
    return ((forwardValue339_37_0) != 0);
}


public net.minecraft.item.Item a__wQ(net.minecraft.world.World p0, moom.DT p1) {
return net.minecraft.item.Item.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.d)));
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.entity.Entity p2, float p3) {
int forwardValue3357_13_0;
    int forwardValue3357_23_0;
    int forwardValue3357_28_0;
    int forwardValue3357_44_0;
    int spill3357_0;
    boolean spill3357_1;
    long life5_3;
    int[] life7_5;
    forward_join_51: {
    forward_join_45: {
    forward_join_44: {
    forward_join_39: {
    forward_join_28: {
    forward_join_23: {
    forward_join_13: {
    life5_3 = (moom.dy.R ^ 62371471171429L);
    life7_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3357_0 = ((p2 instanceof net.minecraft.entity.EntityLivingBase) ? 1 : 0);
    if (!((life7_5 != null))) {
        forwardValue3357_13_0 = spill3357_0;
        break forward_join_13;
    }
    if (!((spill3357_0 != 0))) {
        break forward_join_51;
    }
    forwardValue3357_13_0 = ((((net.minecraft.world.World)(p0)).G) ? 1 : 0);
    }
    if (!((life7_5 != null))) {
        forwardValue3357_23_0 = forwardValue3357_13_0;
        break forward_join_23;
    }
    if (!((forwardValue3357_13_0 == 0))) {
        break forward_join_45;
    }
    forwardValue3357_23_0 = recovery.source.CarrierOps.fcmpg(((float)(((java.util.Random)(((net.minecraft.world.World)(p0)).u)).nextFloat())), ((float)((p3 - 0x1.0p-1f))));
    }
    if (!((life7_5 != null))) {
        forwardValue3357_28_0 = forwardValue3357_23_0;
        break forward_join_28;
    }
    if (!((forwardValue3357_23_0 < 0))) {
        break forward_join_45;
    }
    forwardValue3357_28_0 = ((p2 instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0);
    }
    if (!((life7_5 != null))) {
        forwardValue3357_44_0 = forwardValue3357_28_0;
        break forward_join_44;
    }
    if (!((forwardValue3357_28_0 == 0))) {
        break forward_join_39;
    }
    spill3357_1 = ((net.minecraft.world.GameRules)(((net.minecraft.world.World)(p0)).a__Ej())).a__Boolean(((java.lang.String)("mobGriefing")));
    if (!((life7_5 != null))) {
        forwardValue3357_44_0 = ((spill3357_1) ? 1 : 0);
        break forward_join_44;
    }
    if (!((!spill3357_1))) {
        break forward_join_39;
    }
    return;
    }
    forwardValue3357_44_0 = ((((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.d)).a__fE())))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue3357_44_0);
    }
    super.a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.entity.Entity)(p2)), ((float)(p3)));
    }
    return;
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.block.Block p3) {
int forwardValue3356_27_0;
    int[] spill3356_0;
    boolean spill3356_1;
    long life5_3;
    int[] life7_11;
    forward_join_28: {
    forward_join_27: {
    life5_3 = (moom.dy.R ^ 8542245035364L);
    spill3356_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    super.a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((net.minecraft.block.Block)(p3)));
    life7_11 = spill3356_0;
    spill3356_1 = ((moom.fn)(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).a__DT()))))).a__ch())).a__fn())).b__Boolean();
    if (!((life7_11 != null))) {
        forwardValue3356_27_0 = ((spill3356_1) ? 1 : 0);
        break forward_join_27;
    }
    if (!(spill3356_1)) {
        break forward_join_28;
    }
    forwardValue3356_27_0 = ((((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.d)).a__fE())))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue3356_27_0);
    }
    return;
}


public boolean g() {
return ((0) != 0);
}


public boolean j() {
return ((0) != 0);
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1172_52(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f2e2d2c2a417e256_originalDynamicSite2662_11(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7421_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b4b54c999db9_invokedynamic3359_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b4b54c999db9_invokedynamic3359_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_819466f05fee_originalDynamicSite1414_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_44aac53dd1a4_invokedynamic1126_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_44aac53dd1a4_invokedynamic1126_3(int a0, long a1) throws E;
}
