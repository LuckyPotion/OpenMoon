package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class cv extends moom.cu implements net.minecraft.block.IGrowable {

public static final moom.fy R;

private static final long S;

private static final long[] V;

private static final java.lang.Integer[] W;

private static final java.util.Map X;

protected cv() {
super();
    ((moom.cv)(this)).a__Void(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((moom.fA)(((moom.cv)(this)).M)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.cv.R)), ((java.lang.Comparable)(java.lang.Integer.valueOf(((int)(0)))))))));
    ((moom.cv)(this)).a(((boolean)(true)));
    float local1 = 0x1.0p-1f;
    ((moom.cv)(this)).a(((float)((0x1.0p-1f - local1))), ((float)(0x0.0p0f)), ((float)((0x1.0p-1f - local1))), ((float)((0x1.0p-1f + local1))), ((float)(0x1.0p-2f)), ((float)((0x1.0p-1f + local1))));
    ((moom.cv)(this)).a(((net.minecraft.creativetab.CreativeTabs)(null)));
    ((moom.cv)(this)).c(((float)(0x0.0p0f)));
    ((moom.cv)(this)).a(((moom.eJ)(moom.cv.h)));
    ((moom.cv)(this)).b__ch();
    return;
}


static {
S = ((long)(((moom._a)(moom._c.a(((long)(-3501481312297250452L)), ((long)(-4953143641267102472L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(113842873952240L)))));
    long local11_life6 = (moom.cv.S ^ 45953368062379L);
    X = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life9;
    javax.crypto.Cipher __sourceSpill1141_11 = (local0_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1141_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1141_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1141_14 = new byte[8];
    (__sourceSpill1141_14)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local1_life15 = 1;
    while ((local1_life15 < 8)) {
        (__sourceSpill1141_14)[local1_life15] = ((byte) ((int) ((local11_life6 << (local1_life15 * 8)) >>> 56)));
        local1_life15 += 1;
    }
    byte[] __sourcePreallocation1141_16 = __sourceSpill1141_14;
    ((javax.crypto.Cipher)(__sourceSpill1141_11)).init(((int)(__sourceSpill1141_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1141_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1141_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life19 = new long[5];
    int local3_life20 = 0;
    java.lang.String local4_life21;
    int local5_life23 = ((java.lang.String)((local4_life21 = "¿èÇ¥ \bú¸[P\031G\0300\003\nÕ¡×íô2T"))).length();
    int local2_life24 = 0;
    do {
        java.lang.String __sourceSpill1141_25 = local4_life21;
        int __sourceSpill1141_26 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1141_25)).substring(((int)(__sourceSpill1141_26)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1141_30 = local6_life19;
        int __sourceSpill1141_31 = local3_life20;
        local3_life20 += 1;
        long local8_life32 = (((((((((((long) (local7_life29)[0]) & 255L) << 56) | ((((long) (local7_life29)[1]) & 255L) << 48)) | ((((long) (local7_life29)[2]) & 255L) << 40)) | ((((long) (local7_life29)[3]) & 255L) << 32)) | ((((long) (local7_life29)[4]) & 255L) << 24)) | ((((long) (local7_life29)[5]) & 255L) << 16)) | ((((long) (local7_life29)[6]) & 255L) << 8)) | (((long) (local7_life29)[7]) & 255L));
        byte[] __sourceSpill1141_33 = new byte[8];
        (__sourceSpill1141_33)[0] = ((byte) ((int) (local8_life32 >>> 56)));
        (__sourceSpill1141_33)[1] = ((byte) ((int) (local8_life32 >>> 48)));
        (__sourceSpill1141_33)[2] = ((byte) ((int) (local8_life32 >>> 40)));
        (__sourceSpill1141_33)[3] = ((byte) ((int) (local8_life32 >>> 32)));
        (__sourceSpill1141_33)[4] = ((byte) ((int) (local8_life32 >>> 24)));
        (__sourceSpill1141_33)[5] = ((byte) ((int) (local8_life32 >>> 16)));
        (__sourceSpill1141_33)[6] = ((byte) ((int) (local8_life32 >>> 8)));
        (__sourceSpill1141_33)[7] = ((byte) ((int) local8_life32));
        javax.crypto.Cipher __sourceSpill1141_34 = local0_life9;
        byte[] local10_life36 = ((javax.crypto.Cipher)(__sourceSpill1141_34)).doFinal(((byte[])(__sourceSpill1141_33)));
        (__sourceSpill1141_30)[__sourceSpill1141_31] = (((((((((((long) (local10_life36)[0]) & 255L) << 56) | ((((long) (local10_life36)[1]) & 255L) << 48)) | ((((long) (local10_life36)[2]) & 255L) << 40)) | ((((long) (local10_life36)[3]) & 255L) << 32)) | ((((long) (local10_life36)[4]) & 255L) << 24)) | ((((long) (local10_life36)[5]) & 255L) << 16)) | ((((long) (local10_life36)[6]) & 255L) << 8)) | (((long) (local10_life36)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    local5_life23 = ((java.lang.String)((local4_life21 = ")ã[§i\037\t\026ã6Ó`Ïßq"))).length();
    local2_life24 = 0;
    do {
        java.lang.String __sourceSpill1141_38 = local4_life21;
        int __sourceSpill1141_39 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1141_38)).substring(((int)(__sourceSpill1141_39)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1141_43 = local6_life19;
        int __sourceSpill1141_44 = local3_life20;
        local3_life20 += 1;
        long local8_life45 = (((((((((((long) (local7_life42)[0]) & 255L) << 56) | ((((long) (local7_life42)[1]) & 255L) << 48)) | ((((long) (local7_life42)[2]) & 255L) << 40)) | ((((long) (local7_life42)[3]) & 255L) << 32)) | ((((long) (local7_life42)[4]) & 255L) << 24)) | ((((long) (local7_life42)[5]) & 255L) << 16)) | ((((long) (local7_life42)[6]) & 255L) << 8)) | (((long) (local7_life42)[7]) & 255L));
        byte[] __sourceSpill1141_46 = new byte[8];
        (__sourceSpill1141_46)[0] = ((byte) ((int) (local8_life45 >>> 56)));
        (__sourceSpill1141_46)[1] = ((byte) ((int) (local8_life45 >>> 48)));
        (__sourceSpill1141_46)[2] = ((byte) ((int) (local8_life45 >>> 40)));
        (__sourceSpill1141_46)[3] = ((byte) ((int) (local8_life45 >>> 32)));
        (__sourceSpill1141_46)[4] = ((byte) ((int) (local8_life45 >>> 24)));
        (__sourceSpill1141_46)[5] = ((byte) ((int) (local8_life45 >>> 16)));
        (__sourceSpill1141_46)[6] = ((byte) ((int) (local8_life45 >>> 8)));
        (__sourceSpill1141_46)[7] = ((byte) ((int) local8_life45));
        javax.crypto.Cipher __sourceSpill1141_47 = local0_life9;
        byte[] local10_life49 = ((javax.crypto.Cipher)(__sourceSpill1141_47)).doFinal(((byte[])(__sourceSpill1141_46)));
        (__sourceSpill1141_43)[__sourceSpill1141_44] = (((((((((((long) (local10_life49)[0]) & 255L) << 56) | ((((long) (local10_life49)[1]) & 255L) << 48)) | ((((long) (local10_life49)[2]) & 255L) << 40)) | ((((long) (local10_life49)[3]) & 255L) << 32)) | ((((long) (local10_life49)[4]) & 255L) << 24)) | ((((long) (local10_life49)[5]) & 255L) << 16)) | ((((long) (local10_life49)[6]) & 255L) << 8)) | (((long) (local10_life49)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    V = ((long[])(local6_life19));
    W = ((java.lang.Integer[])(new java.lang.Integer[5]));
    R = ((moom.fy)(moom.fy.a(((java.lang.String)("age")), ((int)(0)), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1141_52(9610, (4338158240951335276L ^ local11_life6)))))));
}


public net.minecraft.block.state.IBlockState b__fE(int p0) {
return ((net.minecraft.block.state.IBlockState)(((moom.cv)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.cv.R)), ((java.lang.Comparable)(java.lang.Integer.valueOf(((int)(p0))))));
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7181_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/cv"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


protected net.minecraft.item.Item b__sourceReturn_e516839077() {
return net.minecraft.init.Items.O;
}


public int b(net.minecraft.block.state.IBlockState p0) {
return ((java.lang.Integer)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.cv.R))))))).intValue();
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 19100;
      if (W[var3] == null) {
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
         long var5 = V[var3];
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
         Object[] var9 = (Object[])X.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               X.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/cv", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         W[var3] = var15;
      }

      return W[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.cv.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public void b(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, java.util.Random p3) {
int forwardValue3158_29_0;
    int forwardValue3158_64_0;
    int[] spill3158_0;
    int spill3158_1;
    int spill3158_2;
    long life5_3;
    int[] life7_11;
    int life8_35;
    float life9_47;
    forward_join_65: {
    forward_join_64: {
    forward_join_29: {
    life5_3 = (moom.cv.S ^ 95417194833614L);
    spill3158_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    super.b(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((java.util.Random)(p3)));
    life7_11 = spill3158_0;
    spill3158_1 = ((net.minecraft.world.World)(p0)).b(((moom.DT)(((moom.DT)(p1)).a__DT())));
    if (!((life7_11 != null))) {
        forwardValue3158_29_0 = spill3158_1;
        break forward_join_29;
    }
    if (!((spill3158_1 >= __sourceIntrinsic_b4b54c999db9_invokedynamic3158_5(16831, (5738727765119697466L ^ life5_3))))) {
        break forward_join_65;
    }
    forwardValue3158_29_0 = ((java.lang.Integer)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.cv.R))))))).intValue();
    }
    life8_35 = forwardValue3158_29_0;
    if (!((life8_35 < __sourceIntrinsic_b4b54c999db9_invokedynamic3158_10(15315, (5676128260507531348L ^ life5_3))))) {
        break forward_join_65;
    }
    life9_47 = moom.cv.a(((net.minecraft.block.Block)(this)), ((net.minecraft.world.World)(p0)), ((moom.DT)(p1)));
    spill3158_2 = ((java.util.Random)(p3)).nextInt(((int)((((int) (0x1.9p4f / life9_47)) + 1))));
    if (!((life7_11 != null))) {
        forwardValue3158_64_0 = spill3158_2;
        break forward_join_64;
    }
    if (!((spill3158_2 == 0))) {
        break forward_join_65;
    }
    forwardValue3158_64_0 = ((((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(p2)).a__fE(((net.minecraft.block.properties.IProperty)(moom.cv.R)), ((java.lang.Comparable)(java.lang.Integer.valueOf(((int)((life8_35 + 1))))))))), ((int)(2)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue3158_64_0);
    }
    return;
}


protected boolean b(net.minecraft.block.Block p0) {
long local2 = (moom.cv.S ^ 61463603679697L);
    return ((((p0 == net.minecraft.init.Blocks.ak) ? 1 : 0)) != 0);
}


public void e(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
int forwardValue3159_42_0;
    int[] spill3159_0;
    int spill3159_1;
    long life4_3;
    int life7_16;
    int[] life6_17;
    forward_join_42: {
    forward_join_33: {
    life4_3 = (moom.cv.S ^ 138919771656998L);
    spill3159_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life7_16 = (((java.lang.Integer)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.cv.R))))))).intValue() + moom.Dr.a(((java.util.Random)(((net.minecraft.world.World)(p0)).u)), ((int)(2)), ((int)(5))));
    life6_17 = spill3159_0;
    spill3159_1 = life7_16;
    if (!((life6_17 != null))) {
        forwardValue3159_42_0 = spill3159_1;
        break forward_join_42;
    }
    if (!((spill3159_1 > __sourceIntrinsic_9003fcba2468_invokedynamic3159_8(15315, (5676083662467091900L ^ life4_3))))) {
        break forward_join_33;
    }
    life7_16 = __sourceIntrinsic_9003fcba2468_invokedynamic3159_9(15315, (5676083662467091900L ^ life4_3));
    }
    forwardValue3159_42_0 = ((((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(p2)).a__fE(((net.minecraft.block.properties.IProperty)(moom.cv.R)), ((java.lang.Comparable)(java.lang.Integer.valueOf(((int)(life7_16)))))))), ((int)(2)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue3159_42_0);
    return;
}


protected moom.fA a__fA() {
return new moom.fA(this, new net.minecraft.block.properties.IProperty[] {moom.cv.R});
}


protected static float a(net.minecraft.block.Block p0, net.minecraft.world.World p1, moom.DT p2) {
net.minecraft.block.state.IBlockState lexicalValue1090_42_0;
    int lexicalValue1090_52_0;
    int lexicalValue1090_56_0;
    net.minecraft.block.Block lexicalValue1090_96_0;
    net.minecraft.block.Block lexicalValue1090_96_1;
    int lexicalValue1090_100_0;
    net.minecraft.block.Block lexicalValue1090_114_0;
    net.minecraft.block.Block lexicalValue1090_114_1;
    int lexicalValue1090_118_0;
    int lexicalValue1090_124_0;
    net.minecraft.block.Block lexicalValue1090_146_0;
    net.minecraft.block.Block lexicalValue1090_146_1;
    net.minecraft.block.Block lexicalValue1090_155_0;
    net.minecraft.block.Block lexicalValue1090_155_1;
    net.minecraft.block.Block lexicalValue1090_164_0;
    net.minecraft.block.Block lexicalValue1090_164_1;
    int lexicalValue1090_168_0;
    int[] spill1090_0;
    net.minecraft.block.state.IBlockState spill1090_1;
    int spill1090_2;
    net.minecraft.block.Block spill1090_3;
    net.minecraft.block.Block spill1090_4;
    net.minecraft.block.Block spill1090_5;
    net.minecraft.block.Block spill1090_6;
    int spill1090_7;
    net.minecraft.block.Block spill1090_8;
    net.minecraft.block.Block spill1090_9;
    long life3_3;
    float life6_6;
    moom.DT life7_9;
    int[] life5_10;
    int life8_12;
    int life9_17;
    float life10_22;
    net.minecraft.block.state.IBlockState life11_30;
    moom.DT life8_85;
    moom.DT life9_88;
    moom.DT life10_91;
    moom.DT life11_94;
    int life12_120;
    int life13_146;
    int life14_222;
    lexical_join_175: {
    lexical_join_168: {
    lexical_join_167: {
    lexical_join_165: {
    lexical_join_164: {
    lexical_join_155: {
    lexical_join_146: {
    lexical_join_131: {
    lexical_join_124: {
    lexical_join_118: {
    lexical_join_117: {
    lexical_join_115: {
    lexical_join_114: {
    lexical_join_100: {
    lexical_join_99: {
    lexical_join_97: {
    lexical_join_96: {
    lexical_join_71: {
    life3_3 = (moom.cv.S ^ 140108809300277L);
    spill1090_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life6_6 = 0x1.0p0f;
    life7_9 = ((moom.DT)(p2)).b__DT();
    life5_10 = spill1090_0;
    life8_12 = -1;
    lexical_cycle_13: while (true) {
    lexical_join_69: {
    lexical_join_68: {
    if (!((life8_12 <= 1))) {
        break lexical_join_71;
    }
    life9_17 = -1;
    lexical_cycle_18: while (true) {
    lexical_join_61: {
    lexical_join_57: {
    lexical_join_56: {
    lexical_join_52: {
    lexical_join_51: {
    lexical_join_42: {
    if (!((life9_17 <= 1))) {
        break lexical_join_68;
    }
    life10_22 = 0x0.0p0f;
    life11_30 = ((net.minecraft.world.World)(p1)).a__fE(((moom.DT)(((moom.DT)(life7_9)).a(((int)(life8_12)), ((int)(0)), ((int)(life9_17))))));
    if (!((life5_10 != null))) {
        break lexical_join_69;
    }
    spill1090_1 = life11_30;
    if (!((life5_10 != null))) {
        lexicalValue1090_42_0 = spill1090_1;
        break lexical_join_42;
    }
    if (!((((net.minecraft.block.state.IBlockState)(spill1090_1)).a__ch() == net.minecraft.init.Blocks.ak))) {
        break lexical_join_51;
    }
    life10_22 = 0x1.0p0f;
    lexicalValue1090_42_0 = life11_30;
    }
    spill1090_2 = ((java.lang.Integer)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(lexicalValue1090_42_0)).a(((net.minecraft.block.properties.IProperty)(moom.dy.Q))))))).intValue();
    if (!((life5_10 != null))) {
        lexicalValue1090_52_0 = spill1090_2;
        break lexical_join_52;
    }
    if (!((spill1090_2 > 0))) {
        break lexical_join_51;
    }
    life10_22 = 0x1.8p1f;
    }
    lexicalValue1090_52_0 = life8_12;
    }
    if (!((life5_10 != null))) {
        lexicalValue1090_56_0 = lexicalValue1090_52_0;
        break lexical_join_56;
    }
    if (!((lexicalValue1090_52_0 == 0))) {
        break lexical_join_57;
    }
    lexicalValue1090_56_0 = life9_17;
    }
    if (!((lexicalValue1090_56_0 != 0))) {
        break lexical_join_61;
    }
    }
    life10_22 = (life10_22 / 0x1.0p2f);
    }
    life6_6 = (life6_6 + life10_22);
    life9_17 += 1;
    if (!((life5_10 == null))) { continue lexical_cycle_18; }
    break lexical_cycle_18;
    }
    }
    life8_12 += 1;
    }
    if (!((life5_10 == null))) { continue lexical_cycle_13; }
    break lexical_cycle_13;
    }
    }
    life8_85 = ((moom.DT)(p2)).c__DT();
    life9_88 = ((moom.DT)(p2)).d__DT();
    life10_91 = ((moom.DT)(p2)).e();
    life11_94 = ((moom.DT)(p2)).f();
    spill1090_3 = p0;
    spill1090_4 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p1)).a__fE(((moom.DT)(life10_91))))).a__ch();
    if (!((life5_10 != null))) {
        lexicalValue1090_96_0 = spill1090_3;
        lexicalValue1090_96_1 = spill1090_4;
        break lexical_join_96;
    }
    if (!((spill1090_3 != spill1090_4))) {
        break lexical_join_97;
    }
    lexicalValue1090_96_0 = p0;
    lexicalValue1090_96_1 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p1)).a__fE(((moom.DT)(life11_94))))).a__ch();
    }
    if (!((lexicalValue1090_96_0 == lexicalValue1090_96_1))) {
        break lexical_join_99;
    }
    }
    lexicalValue1090_100_0 = 1;
    break lexical_join_100;
    }
    lexicalValue1090_100_0 = 0;
    }
    life12_120 = lexicalValue1090_100_0;
    spill1090_5 = p0;
    spill1090_6 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p1)).a__fE(((moom.DT)(life8_85))))).a__ch();
    if (!((life5_10 != null))) {
        lexicalValue1090_114_0 = spill1090_5;
        lexicalValue1090_114_1 = spill1090_6;
        break lexical_join_114;
    }
    if (!((spill1090_5 != spill1090_6))) {
        break lexical_join_115;
    }
    lexicalValue1090_114_0 = p0;
    lexicalValue1090_114_1 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p1)).a__fE(((moom.DT)(life9_88))))).a__ch();
    }
    if (!((lexicalValue1090_114_0 == lexicalValue1090_114_1))) {
        break lexical_join_117;
    }
    }
    lexicalValue1090_118_0 = 1;
    break lexical_join_118;
    }
    lexicalValue1090_118_0 = 0;
    }
    life13_146 = lexicalValue1090_118_0;
    spill1090_7 = life12_120;
    if (!((life5_10 != null))) {
        lexicalValue1090_124_0 = spill1090_7;
        break lexical_join_124;
    }
    if (!((spill1090_7 != 0))) {
        break lexical_join_131;
    }
    lexicalValue1090_124_0 = life13_146;
    }
    if (!((lexicalValue1090_124_0 != 0))) {
        break lexical_join_131;
    }
    life6_6 = (life6_6 / 0x1.0p1f);
    if (!((life5_10 == null))) {
        break lexical_join_175;
    }
    }
    spill1090_8 = p0;
    spill1090_9 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p1)).a__fE(((moom.DT)(((moom.DT)(life10_91)).c__DT()))))).a__ch();
    if (!((life5_10 != null))) {
        lexicalValue1090_146_0 = spill1090_8;
        lexicalValue1090_146_1 = spill1090_9;
        break lexical_join_146;
    }
    if (!((spill1090_8 != spill1090_9))) {
        break lexical_join_165;
    }
    lexicalValue1090_146_0 = p0;
    lexicalValue1090_146_1 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p1)).a__fE(((moom.DT)(((moom.DT)(life11_94)).c__DT()))))).a__ch();
    }
    if (!((life5_10 != null))) {
        lexicalValue1090_155_0 = lexicalValue1090_146_0;
        lexicalValue1090_155_1 = lexicalValue1090_146_1;
        break lexical_join_155;
    }
    if (!((lexicalValue1090_146_0 != lexicalValue1090_146_1))) {
        break lexical_join_165;
    }
    lexicalValue1090_155_0 = p0;
    lexicalValue1090_155_1 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p1)).a__fE(((moom.DT)(((moom.DT)(life11_94)).d__DT()))))).a__ch();
    }
    if (!((life5_10 != null))) {
        lexicalValue1090_164_0 = lexicalValue1090_155_0;
        lexicalValue1090_164_1 = lexicalValue1090_155_1;
        break lexical_join_164;
    }
    if (!((lexicalValue1090_155_0 != lexicalValue1090_155_1))) {
        break lexical_join_165;
    }
    lexicalValue1090_164_0 = p0;
    lexicalValue1090_164_1 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p1)).a__fE(((moom.DT)(((moom.DT)(life10_91)).d__DT()))))).a__ch();
    }
    if (!((lexicalValue1090_164_0 == lexicalValue1090_164_1))) {
        break lexical_join_167;
    }
    }
    lexicalValue1090_168_0 = 1;
    break lexical_join_168;
    }
    lexicalValue1090_168_0 = 0;
    }
    life14_222 = lexicalValue1090_168_0;
    if (!((life14_222 != 0))) {
        break lexical_join_175;
    }
    life6_6 = (life6_6 / 0x1.0p1f);
    }
    return life6_6;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public boolean a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, boolean p3) {
int forwardValue3156_20_0;
    int forwardValue3156_22_0;
    int spill3156_0;
    long life5_3;
    int[] life7_5;
    forward_join_22: {
    forward_join_21: {
    forward_join_20: {
    life5_3 = (moom.cv.S ^ 31054666259988L);
    life7_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3156_0 = ((java.lang.Integer)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.cv.R))))))).intValue();
    if (!((life7_5 != null))) {
        forwardValue3156_20_0 = spill3156_0;
        break forward_join_20;
    }
    if (!((spill3156_0 < __sourceIntrinsic_fc9aca05ccba_invokedynamic3156_6(15315, (5676191816664367246L ^ life5_3))))) {
        break forward_join_21;
    }
    forwardValue3156_20_0 = 1;
    }
    forwardValue3156_22_0 = forwardValue3156_20_0;
    break forward_join_22;
    }
    forwardValue3156_22_0 = 0;
    }
    return ((forwardValue3156_22_0) != 0);
}


protected net.minecraft.item.Item a__wQ() {
return net.minecraft.init.Items.N;
}


public net.minecraft.item.Item a__wQ(net.minecraft.world.World p0, moom.DT p1) {
return ((moom.cv)(this)).a__wQ();
}


public net.minecraft.item.Item a(net.minecraft.block.state.IBlockState p0, java.util.Random p1, int p2) {
long local4 = (moom.cv.S ^ 47690078853506L);
    return ((((java.lang.Integer)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.cv.R))))))).intValue() == __sourceIntrinsic_0611ab0e6a18_invokedynamic7186_5(15315, (5676177118009886488L ^ local4))) ? ((moom.cv)(this)).b__sourceReturn_e516839077() : ((moom.cv)(this)).a__wQ());
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, float p3, int p4) {
int lexicalValue1091_23_0;
    int lexicalValue1091_35_0;
    int lexicalValue1091_35_1;
    net.minecraft.world.World lexicalValue1091_55_0;
    int[] spill1091_0;
    boolean spill1091_1;
    int spill1091_2;
    int spill1091_3;
    net.minecraft.world.World spill1091_4;
    long life6_3;
    int[] life8_12;
    int life9_29;
    int life10_48;
    int life11_50;
    lexical_join_67: {
    lexical_join_35: {
    lexical_join_23: {
    life6_3 = (moom.cv.S ^ 103007065377770L);
    spill1091_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    super.a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((float)(p3)), ((int)(0)));
    life8_12 = spill1091_0;
    spill1091_1 = ((net.minecraft.world.World)(p0)).G;
    if (!((life8_12 != null))) {
        lexicalValue1091_23_0 = ((spill1091_1) ? 1 : 0);
        break lexical_join_23;
    }
    if (!((!spill1091_1))) {
        break lexical_join_67;
    }
    lexicalValue1091_23_0 = ((java.lang.Integer)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.cv.R))))))).intValue();
    }
    life9_29 = lexicalValue1091_23_0;
    spill1091_2 = life9_29;
    spill1091_3 = __sourceIntrinsic_205edd9df212_invokedynamic1091_9(15315, (5676123171129988464L ^ life6_3));
    if (!((life8_12 != null))) {
        lexicalValue1091_35_0 = spill1091_2;
        lexicalValue1091_35_1 = spill1091_3;
        break lexical_join_35;
    }
    if (!((spill1091_2 >= spill1091_3))) {
        break lexical_join_67;
    }
    lexicalValue1091_35_0 = 3;
    lexicalValue1091_35_1 = p4;
    }
    life10_48 = (lexicalValue1091_35_0 + lexicalValue1091_35_1);
    life11_50 = 0;
    lexical_cycle_39: while (true) {
    lexical_join_64: {
    lexical_join_55: {
    if (!((life11_50 < life10_48))) {
        break lexical_join_67;
    }
    spill1091_4 = p0;
    if (!((life8_12 != null))) {
        lexicalValue1091_55_0 = spill1091_4;
        break lexical_join_55;
    }
    if (!((((java.util.Random)(((net.minecraft.world.World)(spill1091_4)).u)).nextInt(((int)(__sourceIntrinsic_205edd9df212_invokedynamic1091_11(12386, (4210988200978325184L ^ life6_3))))) <= life9_29))) {
        break lexical_join_64;
    }
    lexicalValue1091_55_0 = p0;
    }
    moom.cv.a(((net.minecraft.world.World)(lexicalValue1091_55_0)), ((moom.DT)(p1)), ((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(((moom.cv)(this)).a__wQ(), 1, 0))));
    }
    life11_50 += 1;
    if (!((life8_12 == null))) { continue lexical_cycle_39; }
    break lexical_cycle_39;
    }
    }
    return;
}


public boolean a__Boolean(net.minecraft.world.World p0, java.util.Random p1, moom.DT p2, net.minecraft.block.state.IBlockState p3) {
return ((1) != 0);
}


public void a(net.minecraft.world.World p0, java.util.Random p1, moom.DT p2, net.minecraft.block.state.IBlockState p3) {
((moom.cv)(this)).e(((net.minecraft.world.World)(p0)), ((moom.DT)(p2)), ((net.minecraft.block.state.IBlockState)(p3)));
    return;
}


public boolean a__Boolean(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
int forwardValue3157_30_0;
    int forwardValue3157_34_0;
    int forwardValue3157_36_0;
    int spill3157_0;
    boolean spill3157_1;
    long life4_3;
    int[] life6_5;
    forward_join_36: {
    forward_join_35: {
    forward_join_34: {
    forward_join_30: {
    forward_join_23: {
    life4_3 = (moom.cv.S ^ 47710395729388L);
    life6_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3157_0 = ((net.minecraft.world.World)(p0)).a__Int(((moom.DT)(p1)));
    if (!((life6_5 != null))) {
        forwardValue3157_30_0 = spill3157_0;
        break forward_join_30;
    }
    if (!((spill3157_0 < __sourceIntrinsic_43cd2316f2c9_invokedynamic3157_3(22286, (7477812436495857576L ^ life4_3))))) {
        break forward_join_23;
    }
    spill3157_1 = ((net.minecraft.world.World)(p0)).e(((moom.DT)(p1)));
    if (!((life6_5 != null))) {
        forwardValue3157_30_0 = ((spill3157_1) ? 1 : 0);
        break forward_join_30;
    }
    if (!(spill3157_1)) {
        break forward_join_35;
    }
    }
    forwardValue3157_30_0 = ((((moom.cv)(this)).b(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).b__DT()))))).a__ch())))) ? 1 : 0);
    }
    if (!((life6_5 != null))) {
        forwardValue3157_34_0 = forwardValue3157_30_0;
        break forward_join_34;
    }
    if (!((forwardValue3157_30_0 != 0))) {
        break forward_join_35;
    }
    forwardValue3157_34_0 = 1;
    }
    forwardValue3157_36_0 = forwardValue3157_34_0;
    break forward_join_36;
    }
    forwardValue3157_36_0 = 0;
    }
    return ((forwardValue3157_36_0) != 0);
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1141_52(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7181_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b4b54c999db9_invokedynamic3158_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b4b54c999db9_invokedynamic3158_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9003fcba2468_invokedynamic3159_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9003fcba2468_invokedynamic3159_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fc9aca05ccba_invokedynamic3156_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0611ab0e6a18_invokedynamic7186_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_205edd9df212_invokedynamic1091_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_205edd9df212_invokedynamic1091_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_43cd2316f2c9_invokedynamic3157_3(int a0, long a1) throws E;
}
