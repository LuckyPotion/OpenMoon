package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class gp extends moom.gc {

private float r;

public boolean s;

private java.lang.String t;

private float u;

private float v;

private moom.hX w;

private moom.h0 x;

private static long z;

private static long[] A;

private static java.lang.Integer[] E;

private static java.util.Map F;

public gp(moom.hX p0, int p1, int p2, int p3, java.lang.String p4, float p5, float p6, float p7, moom.h0 p8) { super(0, 0, 0, 0, 0, (java.lang.String)null); }


private static void __sourceConstructorBody_e03539d059bf70dc(moom.gp receiver, moom.hX p0, int p1, int p2, int p3, java.lang.String p4, float p5, float p6, float p7, moom.h0 p8) throws Throwable {

long local10 = (moom.gp.z ^ 100631639915638L);

    moom.gp.__sourceConstructorInit_e03539d059bf70dc_0(((moom.gp)(receiver)), ((int)(p1)), ((int)(p2)), ((int)(p3)), ((int)(__sourceIntrinsic_e03539d059bf70dc_originalDynamicSite2783_1(16234, (234165270361523750L ^ local10)))), ((int)(__sourceIntrinsic_e03539d059bf70dc_originalDynamicSite2783_2(5998, (7952951810699521571L ^ local10)))), ((java.lang.String)("")));

    ((moom.gp)(receiver)).r = ((float)(0x1.0p0f));

    ((moom.gp)(receiver)).t = ((java.lang.String)(p4));

    ((moom.gp)(receiver)).u = ((float)(p5));

    ((moom.gp)(receiver)).v = ((float)(p6));

    ((moom.gp)(receiver)).r = ((float)(((p7 - p5) / (p6 - p5))));

    ((moom.gp)(receiver)).x = ((moom.h0)(p8));

    ((moom.gp)(receiver)).w = ((moom.hX)(p0));

    ((moom.gp)(receiver)).k = ((java.lang.String)(((moom.gp)(receiver)).c()));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_e03539d059bf70dc_0(moom.gp a0, int a1, int a2, int a3, int a4, int a5, java.lang.String a6) throws E;

static {
z = ((long)(((moom._a)(moom._c.a(((long)(473296582130615853L)), ((long)(4234838136614175172L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(144675344625021L)))));
    F = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.gp.z ^ 12850257546361L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1231_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1231_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1231_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1231_14 = new byte[8];
    (__sourceSpill1231_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1231_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1231_16 = __sourceSpill1231_14;
    ((javax.crypto.Cipher)(__sourceSpill1231_11)).init(((int)(__sourceSpill1231_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1231_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1231_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[8];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = ">\177sÆ4÷ºHK¸\022ú¤y~æÍ¦»V6¨}§Î \tF3Ç:´QÔ\0003I²%VB¿"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1231_25 = local6_life21;
        int __sourceSpill1231_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1231_25)).substring(((int)(__sourceSpill1231_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1231_30 = local8_life19;
        int __sourceSpill1231_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1231_33 = new byte[8];
        (__sourceSpill1231_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1231_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1231_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1231_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1231_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1231_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1231_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1231_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1231_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1231_34)).doFinal(((byte[])(__sourceSpill1231_33)));
        (__sourceSpill1231_30)[__sourceSpill1231_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "½\022,¶!Fq%\037#àÙæ(ð1"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1231_38 = local6_life21;
        int __sourceSpill1231_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1231_38)).substring(((int)(__sourceSpill1231_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1231_43 = local8_life19;
        int __sourceSpill1231_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1231_46 = new byte[8];
        (__sourceSpill1231_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1231_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1231_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1231_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1231_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1231_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1231_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1231_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1231_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1231_47)).doFinal(((byte[])(__sourceSpill1231_46)));
        (__sourceSpill1231_43)[__sourceSpill1231_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    A = ((long[])(local8_life19));
    E = ((java.lang.Integer[])(new java.lang.Integer[8]));
}


protected void b(net.minecraft.client.Minecraft p0, int p1, int p2) {
long local4 = (moom.gp.z ^ 56536874516807L);
    if (this.n) {
        if (this.s) {
        this.r = ((float)((((float) (p1 - (this.i + 4))) / ((float) (this.g - __sourceIntrinsic_a66803e36708_invokedynamic7771_5(26444, (3806245192997724979L ^ local4)))))));
        if ((this.r < 0x0.0p0f)) {
        this.r = ((float)(0x0.0p0f));
    }
        if ((this.r > 0x1.0p0f)) {
        this.r = ((float)(0x1.0p0f));
    }
        this.k = ((java.lang.String)(((moom.gp)(this)).c()));
        ((moom.hX)(this.w)).a__Void(((int)(this.l)), ((float)(((moom.gp)(this)).a__sourceReturn_bc607678b6())));
    }
        moom.kZ.c(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
        ((moom.gp)(this)).b(((int)((this.i + ((int) (this.r * ((float) (this.g - __sourceIntrinsic_a66803e36708_invokedynamic7771_21(7404, (5798270918921132180L ^ local4))))))))), ((int)(this.j)), ((int)(0)), ((int)(__sourceIntrinsic_a66803e36708_invokedynamic7771_23(21277, (2353542891178153827L ^ local4)))), ((int)(4)), ((int)(__sourceIntrinsic_a66803e36708_invokedynamic7771_24(16700, (1109469115930559814L ^ local4)))));
        ((moom.gp)(this)).b(((int)(((this.i + ((int) (this.r * ((float) (this.g - __sourceIntrinsic_a66803e36708_invokedynamic7771_29(7404, (5798270918921132180L ^ local4))))))) + 4))), ((int)(this.j)), ((int)(__sourceIntrinsic_a66803e36708_invokedynamic7771_31(27074, (3143165994111757755L ^ local4)))), ((int)(__sourceIntrinsic_a66803e36708_invokedynamic7771_32(17731, (5926042082568847672L ^ local4)))), ((int)(4)), ((int)(__sourceIntrinsic_a66803e36708_invokedynamic7771_33(16700, (1109469115930559814L ^ local4)))));
    }
    return;
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public float b() {
return this.r;
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral7772_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/gp"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.gp.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int c(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 16294;
      if (E[var3] == null) {
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
         long var5 = A[var3];
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
         Object[] var9 = (Object[])F.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               F.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/gp", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         E[var3] = var15;
      }

      return E[var3];
}


private java.lang.String c() {
return ((this.x == null) ? __sourceIntrinsic_fe670a2392c4_invokedynamic7773_4(moom.oO.a(((java.lang.String)(this.t)), ((java.lang.Object[])(new java.lang.Object[0]))), ((moom.gp)(this)).a__sourceReturn_bc607678b6()) : ((moom.h0)(this.x)).a(((int)(this.l)), ((java.lang.String)(moom.oO.a(((java.lang.String)(this.t)), ((java.lang.Object[])(new java.lang.Object[0]))))), ((float)(((moom.gp)(this)).a__sourceReturn_bc607678b6()))));
}


public void a(float p0, boolean p1) {
this.r = ((float)(((p0 - this.u) / (this.v - this.u))));
    this.k = ((java.lang.String)(((moom.gp)(this)).c()));
    if ((__sourceIntrinsic_booleanComparison(p1) != 0)) {
        ((moom.hX)(this.w)).a__Void(((int)(this.l)), ((float)(((moom.gp)(this)).a__sourceReturn_bc607678b6())));
    }
    return;
}


public float a__sourceReturn_bc607678b6() {
return (this.u + ((this.v - this.u) * this.r));
}


public void a(float p0) {
this.r = ((float)(p0));
    this.k = ((java.lang.String)(((moom.gp)(this)).c()));
    ((moom.hX)(this.w)).a__Void(((int)(this.l)), ((float)(((moom.gp)(this)).a__sourceReturn_bc607678b6())));
    return;
}


public boolean a__Boolean(net.minecraft.client.Minecraft p0, int p1, int p2) {
long local4 = (moom.gp.z ^ 76807770960047L);
    if (super.a__Boolean(((net.minecraft.client.Minecraft)(p0)), ((int)(p1)), ((int)(p2)))) {
        this.r = ((float)((((float) (p1 - (this.i + 4))) / ((float) (this.g - __sourceIntrinsic_fe3ccd2239af_invokedynamic7774_4(7404, (5798364860403181948L ^ local4)))))));
        if ((this.r < 0x0.0p0f)) {
        this.r = ((float)(0x0.0p0f));
    }
        if ((this.r > 0x1.0p0f)) {
        this.r = ((float)(0x1.0p0f));
    }
        this.k = ((java.lang.String)(((moom.gp)(this)).c()));
        ((moom.hX)(this.w)).a__Void(((int)(this.l)), ((float)(((moom.gp)(this)).a__sourceReturn_bc607678b6())));
        this.s = ((boolean)(true));
        return true;
    }
    return false;
}


protected int a(boolean p0) {
return 0;
}


public void a(int p0, int p1) {
this.s = ((boolean)(false));
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_e03539d059bf70dc_originalDynamicSite2783_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e03539d059bf70dc_originalDynamicSite2783_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a66803e36708_invokedynamic7771_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a66803e36708_invokedynamic7771_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a66803e36708_invokedynamic7771_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a66803e36708_invokedynamic7771_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a66803e36708_invokedynamic7771_29(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a66803e36708_invokedynamic7771_31(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a66803e36708_invokedynamic7771_32(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a66803e36708_invokedynamic7771_33(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral7772_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_fe670a2392c4_invokedynamic7773_4(java.lang.String a0, float a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fe3ccd2239af_invokedynamic7774_4(int a0, long a1) throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
