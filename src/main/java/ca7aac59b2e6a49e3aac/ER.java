package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class ER extends moom.EQ {

protected moom.FY M;

private static final long O;

private static final long[] S;

private static final java.lang.Integer[] T;

private static final java.util.Map U;

public ER() {
super();
    this.M = new moom.Gy(net.minecraft.init.Blocks.bw);
}


static {
O = ((long)(((moom._a)(moom._c.a(((long)(6506909813435113277L)), ((long)(-8754948626168228316L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(227954189293233L)))));
    U = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.ER.O ^ 47754179542039L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill711_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill711_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill711_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill711_14 = new byte[8];
    (__sourceSpill711_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill711_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation711_16 = __sourceSpill711_14;
    ((javax.crypto.Cipher)(__sourceSpill711_11)).init(((int)(__sourceSpill711_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill711_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation711_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[4];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "øy\016cð&\n\tè¦{øy+j"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill711_25 = local6_life21;
        int __sourceSpill711_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill711_25)).substring(((int)(__sourceSpill711_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill711_30 = local8_life19;
        int __sourceSpill711_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill711_33 = new byte[8];
        (__sourceSpill711_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill711_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill711_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill711_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill711_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill711_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill711_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill711_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill711_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill711_34)).doFinal(((byte[])(__sourceSpill711_33)));
        (__sourceSpill711_30)[__sourceSpill711_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "#2áç\013`µö¸Ò©â¨"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill711_38 = local6_life21;
        int __sourceSpill711_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill711_38)).substring(((int)(__sourceSpill711_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill711_43 = local8_life19;
        int __sourceSpill711_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill711_46 = new byte[8];
        (__sourceSpill711_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill711_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill711_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill711_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill711_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill711_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill711_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill711_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill711_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill711_47)).doFinal(((byte[])(__sourceSpill711_46)));
        (__sourceSpill711_43)[__sourceSpill711_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    S = ((long[])(local8_life19));
    T = ((java.lang.Integer[])(new java.lang.Integer[4]));
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.ER.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 11225;
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
            throw new RuntimeException("moom/ER", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         T[var3] = var15;
      }

      return T[var3];
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4334_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/ER"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


protected void a(net.minecraft.world.biome.BiomeGenBase p0) {
int forwardValue1814_65_0;
    int forwardValue1814_71_0;
    java.lang.String spill1814_0;
    int spill1814_1;
    long life2_3;
    java.lang.String life4_7;
    int life5_32;
    int life6_47;
    net.minecraft.entity.boss.EntityDragon life5_86;
    forward_join_94: {
    forward_join_71: {
    forward_join_65: {
    forward_join_62: {
    life2_3 = (moom.ER.O ^ 46913628452167L);
    spill1814_0 = net.minecraft.world.biome.WorldChunkManager.b();
    ((moom.ER)(this)).a();
    life4_7 = spill1814_0;
    spill1814_1 = ((java.util.Random)(((moom.ER)(this)).b)).nextInt(((int)(5)));
    if (!((life4_7 == null))) {
        forwardValue1814_65_0 = spill1814_1;
        break forward_join_65;
    }
    if (!((spill1814_1 == 0))) {
        break forward_join_62;
    }
    life5_32 = (((java.util.Random)(((moom.ER)(this)).b)).nextInt(((int)(__sourceIntrinsic_450d2df2537b_invokedynamic1814_6(29962, (8127870084957928275L ^ life2_3))))) + __sourceIntrinsic_450d2df2537b_invokedynamic1814_8(26231, (401208278866716717L ^ life2_3)));
    life6_47 = (((java.util.Random)(((moom.ER)(this)).b)).nextInt(((int)(__sourceIntrinsic_450d2df2537b_invokedynamic1814_10(8068, (7691797892735373788L ^ life2_3))))) + __sourceIntrinsic_450d2df2537b_invokedynamic1814_12(15026, (790574423593989353L ^ life2_3)));
    ((moom.FY)(this.M)).a__Boolean(((net.minecraft.world.World)(((moom.ER)(this)).a)), ((java.util.Random)(((moom.ER)(this)).b)), ((moom.DT)(((net.minecraft.world.World)(((moom.ER)(this)).a)).c__DT(((moom.DT)(((moom.DT)(((moom.ER)(this)).c)).a(((int)(life5_32)), ((int)(0)), ((int)(life6_47)))))))));
    }
    forwardValue1814_65_0 = ((moom.DT)(((moom.ER)(this)).c)).a();
    }
    if (!((life4_7 == null))) {
        forwardValue1814_71_0 = forwardValue1814_65_0;
        break forward_join_71;
    }
    if (!((forwardValue1814_65_0 == 0))) {
        break forward_join_94;
    }
    forwardValue1814_71_0 = ((moom.DT)(((moom.ER)(this)).c)).c();
    }
    if (!((forwardValue1814_71_0 == 0))) {
        break forward_join_94;
    }
    life5_86 = new net.minecraft.entity.boss.EntityDragon(((moom.ER)(this)).a);
    ((net.minecraft.entity.boss.EntityDragon)(life5_86)).c(((double)(0x0.0p0d)), ((double)(0x1.0p7d)), ((double)(0x0.0p0d)), ((float)((((java.util.Random)(((moom.ER)(this)).b)).nextFloat() * 0x1.68p8f))), ((float)(0x0.0p0f)));
    ((net.minecraft.world.World)(((moom.ER)(this)).a)).b__Boolean(((net.minecraft.entity.Entity)(life5_86)));
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4334_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_450d2df2537b_invokedynamic1814_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_450d2df2537b_invokedynamic1814_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_450d2df2537b_invokedynamic1814_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_450d2df2537b_invokedynamic1814_12(int a0, long a1) throws E;
}
