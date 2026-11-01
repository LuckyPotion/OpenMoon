package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class gA extends net.minecraft.client.gui.Gui {

protected int f;

protected int g;

public int h;

public int i;

private java.util.List<java.lang.String> j;

public int k;

private boolean l;

public boolean m;

private boolean n;

private int o;

private int p;

private int q;

private int r;

private net.minecraft.client.gui.FontRenderer s;

private int t;

private static long u;

private static long[] v;

private static java.lang.Integer[] w;

private static java.util.Map x;

public gA(net.minecraft.client.gui.FontRenderer p0, int p1, int p2, int p3, int p4, int p5, int p6) { super(); }


private static void __sourceConstructorBody_1b29d78a5662e001(moom.gA receiver, net.minecraft.client.gui.FontRenderer p0, int p1, int p2, int p3, int p4, int p5, int p6) throws Throwable {

long local8 = (moom.gA.u ^ 54274531894336L);

    moom.gA.__sourceConstructorInit_1b29d78a5662e001_0(((moom.gA)(receiver)));

    ((moom.gA)(receiver)).f = ((int)(__sourceIntrinsic_1b29d78a5662e001_originalDynamicSite2746_2(16257, (3550139706146650362L ^ local8))));

    ((moom.gA)(receiver)).g = ((int)(__sourceIntrinsic_1b29d78a5662e001_originalDynamicSite2746_4(29570, (667494538849957116L ^ local8))));

    ((moom.gA)(receiver)).m = ((boolean)(true));

    ((moom.gA)(receiver)).s = ((net.minecraft.client.gui.FontRenderer)(p0));

    ((moom.gA)(receiver)).k = ((int)(p1));

    ((moom.gA)(receiver)).h = ((int)(p2));

    ((moom.gA)(receiver)).i = ((int)(p3));

    ((moom.gA)(receiver)).f = ((int)(p4));

    ((moom.gA)(receiver)).g = ((int)(p5));

    ((moom.gA)(receiver)).j = ((java.util.List)(com.google.common.collect.Lists.newArrayList()));

    ((moom.gA)(receiver)).l = ((boolean)(false));

    ((moom.gA)(receiver)).n = ((boolean)(false));

    ((moom.gA)(receiver)).o = ((int)(p6));

    ((moom.gA)(receiver)).p = ((int)(-1));

    ((moom.gA)(receiver)).q = ((int)(-1));

    ((moom.gA)(receiver)).r = ((int)(-1));

    ((moom.gA)(receiver)).t = ((int)(0));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_1b29d78a5662e001_0(moom.gA a0) throws E;

static {
u = ((long)(((moom._a)(moom._c.a(((long)(-4471151602524764137L)), ((long)(6735482940038005801L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(147100699106115L)))));
    x = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.gA.u ^ 81575523822145L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1207_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1207_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1207_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1207_14 = new byte[8];
    (__sourceSpill1207_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1207_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1207_16 = __sourceSpill1207_14;
    ((javax.crypto.Cipher)(__sourceSpill1207_11)).init(((int)(__sourceSpill1207_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1207_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1207_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[6];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "Ct\177`#4<òÄaÄÊ©ô~üzÔ\016[pÂF ,¡N%]"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1207_25 = local6_life21;
        int __sourceSpill1207_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1207_25)).substring(((int)(__sourceSpill1207_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1207_30 = local8_life19;
        int __sourceSpill1207_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1207_33 = new byte[8];
        (__sourceSpill1207_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1207_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1207_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1207_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1207_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1207_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1207_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1207_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1207_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1207_34)).doFinal(((byte[])(__sourceSpill1207_33)));
        (__sourceSpill1207_30)[__sourceSpill1207_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "ëÇ\020Ûö7l\0134«RÆpæt"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1207_38 = local6_life21;
        int __sourceSpill1207_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1207_38)).substring(((int)(__sourceSpill1207_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1207_43 = local8_life19;
        int __sourceSpill1207_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1207_46 = new byte[8];
        (__sourceSpill1207_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1207_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1207_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1207_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1207_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1207_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1207_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1207_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1207_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1207_47)).doFinal(((byte[])(__sourceSpill1207_46)));
        (__sourceSpill1207_43)[__sourceSpill1207_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    v = ((long[])(local8_life19));
    w = ((java.lang.Integer[])(new java.lang.Integer[6]));
}


protected void b(net.minecraft.client.Minecraft p0, int p1, int p2) {
int life4_10;
    int life5_18;
    int life6_24;
    int life7_30;
    if (this.n) {
        life4_10 = (this.f + (this.t * 2));
        life5_18 = (this.g + (this.t * 2));
        life6_24 = (this.h - this.t);
        life7_30 = (this.i - this.t);
        moom.gA.a(((int)(life6_24)), ((int)(life7_30)), ((int)((life6_24 + life4_10))), ((int)((life7_30 + life5_18))), ((int)(this.p)));
        ((moom.gA)(this)).a(((int)(life6_24)), ((int)((life6_24 + life4_10))), ((int)(life7_30)), ((int)(this.q)));
        ((moom.gA)(this)).a(((int)(life6_24)), ((int)((life6_24 + life4_10))), ((int)((life7_30 + life5_18))), ((int)(this.r)));
        ((moom.gA)(this)).b(((int)(life6_24)), ((int)(life7_30)), ((int)((life7_30 + life5_18))), ((int)(this.q)));
        ((moom.gA)(this)).b(((int)((life6_24 + life4_10))), ((int)(life7_30)), ((int)((life7_30 + life5_18))), ((int)(this.r)));
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 21150;
      if (w[var3] == null) {
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
         long var5 = v[var3];
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
         Object[] var9 = (Object[])x.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               x.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/gA", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         w[var3] = var15;
      }

      return w[var3];
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral7676_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/gA"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.gA.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public void a(java.lang.String p0) {
((java.util.List)(this.j)).add(((java.lang.Object)(moom.oO.a(((java.lang.String)(p0)), ((java.lang.Object[])(new java.lang.Object[0]))))));
    return;
}


public void a(net.minecraft.client.Minecraft p0, int p1, int p2) {
long life4_3;
    int life6_38;
    int life7_52;
    int life8_54;
    life4_3 = (moom.gA.u ^ 113686244566433L);
    if (this.m) {
        moom.kZ.l();
        moom.kZ.a(((int)(__sourceIntrinsic_de1ba8f88103_invokedynamic6280_3(17929, (8510161339409596564L ^ life4_3)))), ((int)(__sourceIntrinsic_de1ba8f88103_invokedynamic6280_4(29383, (5134208307257422939L ^ life4_3)))), ((int)(1)), ((int)(0)));
        ((moom.gA)(this)).b(((net.minecraft.client.Minecraft)(p0)), ((int)(p1)), ((int)(p2)));
        life6_38 = ((this.i + (this.g / 2)) + (this.t / 2));
        life7_52 = (life6_38 - ((((java.util.List)(this.j)).size() * __sourceIntrinsic_de1ba8f88103_invokedynamic6280_12(13620, (6343518263849251759L ^ life4_3))) / 2));
        life8_54 = 0;
        loop_region_55: while ((life8_54 < ((java.util.List)(this.j)).size())) {
        if (this.l) {
        ((moom.gA)(this)).a(((net.minecraft.client.gui.FontRenderer)(this.s)), ((java.lang.String)(((java.lang.String)(((java.util.List)(this.j)).get(((int)(life8_54))))))), ((int)((this.h + (this.f / 2)))), ((int)((life7_52 + (life8_54 * __sourceIntrinsic_de1ba8f88103_invokedynamic6280_22(9304, (3853724812365030086L ^ life4_3)))))), ((int)(this.o)));
    } else {
        ((moom.gA)(this)).b(((net.minecraft.client.gui.FontRenderer)(this.s)), ((java.lang.String)(((java.lang.String)(((java.util.List)(this.j)).get(((int)(life8_54))))))), ((int)(this.h)), ((int)((life7_52 + (life8_54 * __sourceIntrinsic_de1ba8f88103_invokedynamic6280_30(9304, (3853724812365030086L ^ life4_3)))))), ((int)(this.o)));
    }
        life8_54 += 1;
    }
    }
    return;
}


public moom.gA a() {
this.l = ((boolean)(true));
    return this;
}


private static native <E extends Throwable> int __sourceIntrinsic_1b29d78a5662e001_originalDynamicSite2746_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1b29d78a5662e001_originalDynamicSite2746_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral7676_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_de1ba8f88103_invokedynamic6280_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_de1ba8f88103_invokedynamic6280_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_de1ba8f88103_invokedynamic6280_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_de1ba8f88103_invokedynamic6280_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_de1ba8f88103_invokedynamic6280_30(int a0, long a1) throws E;
}
