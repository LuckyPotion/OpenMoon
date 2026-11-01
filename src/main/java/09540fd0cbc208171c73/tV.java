package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class tV extends net.minecraft.entity.projectile.EntityThrowable {

private static final long bb;

private static final long[] hb;

private static final java.lang.Integer[] ib;

private static final java.util.Map jb;

public tV(net.minecraft.world.World p0, double p1, double p2, double p3) {
super(p0, p1, p2, p3);
}


public tV(net.minecraft.world.World p0, net.minecraft.entity.EntityLivingBase p1) {
super(p0, p1);
}


public tV(net.minecraft.world.World p0) {
super(p0);
}


static {
bb = ((long)(((moom._a)(moom._c.a(((long)(2036684880135779727L)), ((long)(-5867882855565725508L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(100756302175618L)))));
    jb = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.tV.bb ^ 131453546089394L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1562_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1562_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1562_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1562_14 = new byte[8];
    (__sourceSpill1562_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1562_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1562_16 = __sourceSpill1562_14;
    ((javax.crypto.Cipher)(__sourceSpill1562_11)).init(((int)(__sourceSpill1562_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1562_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1562_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[4];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "j³T;±Úcó­sÿ^]"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1562_25 = local6_life21;
        int __sourceSpill1562_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1562_25)).substring(((int)(__sourceSpill1562_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1562_30 = local8_life19;
        int __sourceSpill1562_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1562_33 = new byte[8];
        (__sourceSpill1562_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1562_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1562_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1562_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1562_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1562_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1562_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1562_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1562_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1562_34)).doFinal(((byte[])(__sourceSpill1562_33)));
        (__sourceSpill1562_30)[__sourceSpill1562_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "­\007#¾>ÈDË)±x7cÔ"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1562_38 = local6_life21;
        int __sourceSpill1562_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1562_38)).substring(((int)(__sourceSpill1562_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1562_43 = local8_life19;
        int __sourceSpill1562_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1562_46 = new byte[8];
        (__sourceSpill1562_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1562_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1562_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1562_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1562_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1562_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1562_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1562_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1562_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1562_47)).doFinal(((byte[])(__sourceSpill1562_46)));
        (__sourceSpill1562_43)[__sourceSpill1562_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    hb = ((long[])(local8_life19));
    ib = ((java.lang.Integer[])(new java.lang.Integer[4]));
}


private static int c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.tV.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral9174_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/tV"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int c(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 10450;
      if (ib[var3] == null) {
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
         long var5 = hb[var3];
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
         Object[] var9 = (Object[])jb.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               jb.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/tV", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         ib[var3] = var15;
      }

      return ib[var3];
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


protected void a(net.minecraft.util.MovingObjectPosition p0) {
net.minecraft.entity.Entity lexicalValue1315_13_0;
    int lexicalValue1315_34_0;
    int lexicalValue1315_38_0;
    int lexicalValue1315_53_0;
    moom.tV lexicalValue1315_153_0;
    net.minecraft.entity.Entity spill1315_0;
    boolean spill1315_1;
    int spill1315_2;
    moom.tV spill1315_3;
    long life2_3;
    int[] life4_5;
    int life5_53;
    int life6_71;
    net.minecraft.entity.passive.EntityChicken life7_80;
    double life5_108;
    int life7_110;
    lexical_join_154: {
    lexical_join_153: {
    lexical_join_146: {
    lexical_join_89: {
    lexical_join_53: {
    lexical_join_52: {
    lexical_join_38: {
    lexical_join_34: {
    lexical_join_20: {
    lexical_join_13: {
    life2_3 = (moom.tV.bb ^ 14697474360341L);
    life4_5 = moom.h1.a__ArrayInt();
    spill1315_0 = ((net.minecraft.util.MovingObjectPosition)(p0)).e;
    if (!((life4_5 != null))) {
        lexicalValue1315_13_0 = spill1315_0;
        break lexical_join_13;
    }
    if (!((spill1315_0 != null))) {
        break lexical_join_20;
    }
    lexicalValue1315_13_0 = ((net.minecraft.util.MovingObjectPosition)(p0)).e;
    }
    ((net.minecraft.entity.Entity)(lexicalValue1315_13_0)).a__Boolean(((net.minecraft.util.DamageSource)(net.minecraft.util.DamageSource.a(((net.minecraft.entity.Entity)(this)), ((net.minecraft.entity.Entity)(((moom.tV)(this)).a__sG()))))), ((float)(0x0.0p0f)));
    }
    spill1315_1 = ((net.minecraft.world.World)(((moom.tV)(this)).i)).G;
    if (!((life4_5 != null))) {
        lexicalValue1315_34_0 = ((spill1315_1) ? 1 : 0);
        break lexical_join_34;
    }
    if (!((!spill1315_1))) {
        break lexical_join_89;
    }
    lexicalValue1315_34_0 = ((java.util.Random)(((moom.tV)(this)).ah)).nextInt(((int)(__sourceIntrinsic_791342a704ed_invokedynamic1315_11(2632, (7113825289903629226L ^ life2_3)))));
    }
    if (!((life4_5 != null))) {
        lexicalValue1315_38_0 = lexicalValue1315_34_0;
        break lexical_join_38;
    }
    if (!((lexicalValue1315_34_0 == 0))) {
        break lexical_join_89;
    }
    lexicalValue1315_38_0 = 1;
    }
    life5_53 = lexicalValue1315_38_0;
    spill1315_2 = ((java.util.Random)(((moom.tV)(this)).ah)).nextInt(((int)(__sourceIntrinsic_791342a704ed_invokedynamic1315_14(5133, (154269144361172461L ^ life2_3)))));
    if (!((life4_5 != null))) {
        lexicalValue1315_53_0 = spill1315_2;
        break lexical_join_53;
    }
    if (!((spill1315_2 == 0))) {
        break lexical_join_52;
    }
    life5_53 = 4;
    }
    lexicalValue1315_53_0 = 0;
    }
    life6_71 = lexicalValue1315_53_0;
    lexical_cycle_54: while (true) {
    if (!((life6_71 < life5_53))) {
        break lexical_join_89;
    }
    life7_80 = new net.minecraft.entity.passive.EntityChicken(((moom.tV)(this)).i);
    ((net.minecraft.entity.passive.EntityChicken)(life7_80)).l(((int)(__sourceIntrinsic_791342a704ed_invokedynamic1315_17(16806, (1449499633187498053L ^ life2_3)))));
    ((net.minecraft.entity.passive.EntityChicken)(life7_80)).c(((double)(((moom.tV)(this)).n)), ((double)(((moom.tV)(this)).o)), ((double)(((moom.tV)(this)).p)), ((float)(((moom.tV)(this)).w)), ((float)(0x0.0p0f)));
    ((net.minecraft.world.World)(((moom.tV)(this)).i)).b__Boolean(((net.minecraft.entity.Entity)(life7_80)));
    life6_71 += 1;
    if (!((life4_5 == null))) { continue lexical_cycle_54; }
    break lexical_cycle_54;
    }
    }
    life5_108 = 0x1.47ae147ae147bp-4d;
    life7_110 = 0;
    lexical_cycle_93: while (true) {
    if (!((life7_110 < __sourceIntrinsic_791342a704ed_invokedynamic1315_26(9318, (385941635628027271L ^ life2_3))))) {
        break lexical_join_146;
    }
    ((net.minecraft.world.World)(((moom.tV)(this)).i)).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.ITEM_CRACK)), ((double)(((moom.tV)(this)).n)), ((double)(((moom.tV)(this)).o)), ((double)(((moom.tV)(this)).p)), ((double)(((((double) ((java.util.Random)(((moom.tV)(this)).ah)).nextFloat()) - 0x1.0p-1d) * 0x1.47ae147ae147bp-4d))), ((double)(((((double) ((java.util.Random)(((moom.tV)(this)).ah)).nextFloat()) - 0x1.0p-1d) * 0x1.47ae147ae147bp-4d))), ((double)(((((double) ((java.util.Random)(((moom.tV)(this)).ah)).nextFloat()) - 0x1.0p-1d) * 0x1.47ae147ae147bp-4d))), ((int[])(new int[] {net.minecraft.item.Item.a(((net.minecraft.item.Item)(net.minecraft.init.Items.aP)))})));
    life7_110 += 1;
    if (!((life4_5 != null))) {
        break lexical_join_154;
    }
    if (!((life4_5 == null))) { continue lexical_cycle_93; }
    break lexical_cycle_93;
    }
    }
    spill1315_3 = this;
    if (!((life4_5 != null))) {
        lexicalValue1315_153_0 = spill1315_3;
        break lexical_join_153;
    }
    if (!((!((net.minecraft.world.World)(((moom.tV)(spill1315_3)).i)).G))) {
        break lexical_join_154;
    }
    lexicalValue1315_153_0 = this;
    }
    ((moom.tV)(lexicalValue1315_153_0)).f__Void();
    }
    return;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral9174_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_791342a704ed_invokedynamic1315_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_791342a704ed_invokedynamic1315_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_791342a704ed_invokedynamic1315_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_791342a704ed_invokedynamic1315_26(int a0, long a1) throws E;
}
