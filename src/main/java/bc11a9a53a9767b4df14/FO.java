package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class FO extends net.minecraft.world.gen.structure.MapGenStructure {

private java.util.List<moom.D7> g;

private static long h;

private static long[] i;

private static java.lang.Integer[] j;

private static java.util.Map k;

public FO() { super(); }


private static void __sourceConstructorBody_bffaf6a4ce99352d(moom.FO receiver) throws Throwable {

long local1 = (moom.FO.h ^ 134921117799161L);

    moom.FO.__sourceConstructorInit_bffaf6a4ce99352d_0(((moom.FO)(receiver)));

    ((moom.FO)(receiver)).g = ((java.util.List)(com.google.common.collect.Lists.newArrayList()));

    ((java.util.List)(((moom.FO)(receiver)).g)).add(((java.lang.Object)(new moom.D7(net.minecraft.entity.monster.EntityBlaze.class, __sourceIntrinsic_bffaf6a4ce99352d_originalDynamicSite1505_6(13066, (3868343477867239831L ^ local1)), 2, 3))));

    ((java.util.List)(((moom.FO)(receiver)).g)).add(((java.lang.Object)(new moom.D7(net.minecraft.entity.monster.EntityPigZombie.class, 5, 4, 4))));

    ((java.util.List)(((moom.FO)(receiver)).g)).add(((java.lang.Object)(new moom.D7(net.minecraft.entity.monster.EntitySkeleton.class, __sourceIntrinsic_bffaf6a4ce99352d_originalDynamicSite1505_13(6215, (5271535211114459867L ^ local1)), 4, 4))));

    ((java.util.List)(((moom.FO)(receiver)).g)).add(((java.lang.Object)(new moom.D7(moom.th.class, 3, 4, 4))));

    return;

}



static {
h = ((long)(((moom._a)(moom._c.a(((long)(1976345777453126887L)), ((long)(-2526775813172055715L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(233843960367806L)))));
    k = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.FO.h ^ 123132466037510L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill745_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill745_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill745_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill745_14 = new byte[8];
    (__sourceSpill745_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill745_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation745_16 = __sourceSpill745_14;
    ((javax.crypto.Cipher)(__sourceSpill745_11)).init(((int)(__sourceSpill745_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill745_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation745_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[4];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "M¦®\tiÀ\025J>l\buÓi\025"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill745_25 = local6_life21;
        int __sourceSpill745_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill745_25)).substring(((int)(__sourceSpill745_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill745_30 = local8_life19;
        int __sourceSpill745_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill745_33 = new byte[8];
        (__sourceSpill745_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill745_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill745_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill745_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill745_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill745_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill745_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill745_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill745_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill745_34)).doFinal(((byte[])(__sourceSpill745_33)));
        (__sourceSpill745_30)[__sourceSpill745_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "®Û\003^>AÓ(\\SÉ\035nð²"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill745_38 = local6_life21;
        int __sourceSpill745_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill745_38)).substring(((int)(__sourceSpill745_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill745_43 = local8_life19;
        int __sourceSpill745_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill745_46 = new byte[8];
        (__sourceSpill745_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill745_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill745_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill745_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill745_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill745_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill745_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill745_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill745_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill745_47)).doFinal(((byte[])(__sourceSpill745_46)));
        (__sourceSpill745_43)[__sourceSpill745_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    i = ((long[])(local8_life19));
    j = ((java.lang.Integer[])(new java.lang.Integer[4]));
}

private static native <E extends Throwable> void __sourceConstructorInit_bffaf6a4ce99352d_0(moom.FO a0) throws E;

private static moom.Oo b(moom.Oo p0) {
return p0;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 13547;
      if (j[var3] == null) {
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
         long var5 = i[var3];
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
         Object[] var9 = (Object[])k.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               k.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/FO", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         j[var3] = var15;
      }

      return j[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.FO.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4499_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/FO"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public java.util.List<moom.D7> b__sourceReturn_3f0615080b() {
return this.g;
}


public java.lang.String a() {
return "Fortress";
}


protected boolean a__Boolean(int p0, int p1) {
int forwardValue1915_39_0;
    int forwardValue1915_73_0;
    int forwardValue1915_73_1;
    int forwardValue1915_75_0;
    int forwardValue1915_77_0;
    net.minecraft.entity.Entity[] spill1915_0;
    int spill1915_1;
    int spill1915_2;
    int spill1915_3;
    long life3_3;
    int life6_8;
    int life7_12;
    net.minecraft.entity.Entity[] life5_30;
    forward_join_77: {
    forward_join_76: {
    forward_join_75: {
    forward_join_73: {
    forward_join_39: {
    life3_3 = (moom.FO.h ^ 48982041270140L);
    spill1915_0 = moom.G4.b();
    life6_8 = (p0 >> 4);
    life7_12 = (p1 >> 4);
    ((java.util.Random)(this.b)).setSeed(((long)((((long) (life6_8 ^ (life7_12 << 4))) ^ ((net.minecraft.world.World)(this.c)).a__Long()))));
    ((java.util.Random)(this.b)).nextInt();
    life5_30 = spill1915_0;
    spill1915_1 = ((java.util.Random)(this.b)).nextInt(((int)(3)));
    if (!((life5_30 != null))) {
        forwardValue1915_39_0 = spill1915_1;
        break forward_join_39;
    }
    if (!((spill1915_1 == 0))) {
        break forward_join_76;
    }
    forwardValue1915_39_0 = p0;
    }
    spill1915_2 = (((life6_8 << 4) + 4) + ((java.util.Random)(this.b)).nextInt(((int)(__sourceIntrinsic_c86802429962_invokedynamic1915_11(16650, (8458593133877341713L ^ life3_3))))));
    if (!((life5_30 != null))) {
        forwardValue1915_73_0 = forwardValue1915_39_0;
        forwardValue1915_73_1 = spill1915_2;
        break forward_join_73;
    }
    if (!((forwardValue1915_39_0 == spill1915_2))) {
        break forward_join_76;
    }
    spill1915_3 = p1;
    if (!((life5_30 != null))) {
        forwardValue1915_75_0 = spill1915_3;
        break forward_join_75;
    }
    forwardValue1915_73_0 = spill1915_3;
    forwardValue1915_73_1 = (((life7_12 << 4) + 4) + ((java.util.Random)(this.b)).nextInt(((int)(__sourceIntrinsic_c86802429962_invokedynamic1915_14(23833, (7771220227166614019L ^ life3_3))))));
    }
    if (!((forwardValue1915_73_0 == forwardValue1915_73_1))) {
        break forward_join_76;
    }
    forwardValue1915_75_0 = 1;
    }
    forwardValue1915_77_0 = forwardValue1915_75_0;
    break forward_join_77;
    }
    forwardValue1915_77_0 = 0;
    }
    return ((forwardValue1915_77_0) != 0);
}


protected moom.Ir a(int p0, int p1) {
return new moom.Is(this.c, this.b, p0, p1);
}


private static native <E extends Throwable> int __sourceIntrinsic_bffaf6a4ce99352d_originalDynamicSite1505_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bffaf6a4ce99352d_originalDynamicSite1505_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c86802429962_invokedynamic1915_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c86802429962_invokedynamic1915_14(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4499_0() throws E;
}
