package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class oD {

private static final org.apache.logging.log4j.Logger a;

private final java.util.List<moom.oF> b;

private final java.util.List<java.lang.Integer> c;

private int d;

private int e;

private final java.util.List<java.lang.Integer> f;

private int g;

private static final long h;

private static final long[] i;

private static final java.lang.Integer[] j;

private static final java.util.Map k;

public oD(moom.oD p0) {
this();
    int local2_life1 = 0;
    while ((local2_life1 < ((moom.oD)(p0)).e())) {
        this.a(((moom.oF)(((moom.oD)(p0)).a__oF(((int)(local2_life1))))));
        local2_life1 += 1;
    }
    this.d = ((int)(((moom.oD)(p0)).d()));
    return;
}


public oD() {
super();
    this.b = com.google.common.collect.Lists.newArrayList();
    this.c = com.google.common.collect.Lists.newArrayList();
    this.d = 0;
    this.e = -1;
    this.f = com.google.common.collect.Lists.newArrayList();
    this.g = -1;
}


static {
h = ((long)(((moom._a)(moom._c.a(((long)(2423140068552328284L)), ((long)(4091588978394454272L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(93281727668682L)))));
    k = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.oD.h ^ 93704289954250L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill951_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill951_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill951_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill951_14 = new byte[8];
    (__sourceSpill951_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill951_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation951_16 = __sourceSpill951_14;
    ((javax.crypto.Cipher)(__sourceSpill951_11)).init(((int)(__sourceSpill951_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill951_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation951_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "­(ÎÁíû\000¬ùº[ì,£"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill951_25 = local6_life21;
        int __sourceSpill951_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill951_25)).substring(((int)(__sourceSpill951_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill951_30 = local8_life19;
        int __sourceSpill951_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill951_33 = new byte[8];
        (__sourceSpill951_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill951_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill951_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill951_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill951_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill951_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill951_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill951_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill951_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill951_34)).doFinal(((byte[])(__sourceSpill951_33)));
        (__sourceSpill951_30)[__sourceSpill951_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    i = ((long[])(local8_life19));
    j = ((java.lang.Integer[])(new java.lang.Integer[2]));
    a = ((org.apache.logging.log4j.Logger)(org.apache.logging.log4j.LogManager.getLogger()));
}


public boolean equals(java.lang.Object p0) {
int forwardValue3801_35_0;
    moom.oD life2_19;
    forward_join_36: {
    forward_join_35: {
    forward_join_34: {
    forward_join_5: {
    if (!((this == p0))) {
        break forward_join_5;
    }
    return ((1) != 0);
    }
    if (!((p0 != null))) {
        break forward_join_36;
    }
    if (!((((java.lang.Object)(this)).getClass() == ((java.lang.Object)(p0)).getClass()))) {
        break forward_join_36;
    }
    life2_19 = ((moom.oD)(p0));
    if (!((this.d == ((moom.oD)(life2_19)).d))) {
        break forward_join_34;
    }
    if (!(((java.util.List)(this.b)).equals(((java.lang.Object)(((moom.oD)(life2_19)).b))))) {
        break forward_join_34;
    }
    if (!(((java.util.List)(this.c)).equals(((java.lang.Object)(((moom.oD)(life2_19)).c))))) {
        break forward_join_34;
    }
    forwardValue3801_35_0 = 1;
    break forward_join_35;
    }
    forwardValue3801_35_0 = 0;
    }
    return ((forwardValue3801_35_0) != 0);
    }
    return ((0) != 0);
}


public java.lang.String toString() {
java.lang.StringBuilder local1 = new java.lang.StringBuilder(__sourceIntrinsic_a86c261fcdee_invokedynamic8544_2(((java.util.List)(this.b)).size()));
    int local2 = 0;
    while ((local2 < ((java.util.List)(this.b)).size())) {
        ((java.lang.StringBuilder)(local1)).append(((java.lang.String)(((moom.oF)(((moom.oF)(((java.util.List)(this.b)).get(((int)(local2))))))).toString())));
        if ((local2 != (((java.util.List)(this.b)).size() - 1))) {
        ((java.lang.StringBuilder)(local1)).append(((java.lang.String)(" ")));
    }
        local2 += 1;
    }
    return ((java.lang.StringBuilder)(local1)).toString();
}


public int hashCode() {
long local1 = (moom.oD.h ^ 127337365530828L);
    int local3 = ((java.util.List)(this.b)).hashCode();
    local3 = ((__sourceIntrinsic_1861091996aa_originalDynamicSite1574_3(13043, (440324402921481242L ^ local1)) * local3) + ((java.util.List)(this.c)).hashCode());
    local3 = ((__sourceIntrinsic_1861091996aa_originalDynamicSite1574_6(29003, (3498863710859224995L ^ local1)) * local3) + this.d);
    return local3;
}


public int b() {
return this.e;
}


public int b(int p0) {
return ((java.lang.Integer)(((java.lang.Integer)(((java.util.List)(this.c)).get(((int)(p0))))))).intValue();
}


public boolean b__Boolean() {
return ((((this.e >= 0) ? 1 : 0)) != 0);
}


public int e() {
return ((java.util.List)(this.b)).size();
}


private boolean c__Boolean() {
int local1 = 0;
    int local2 = ((java.util.List)(this.b)).size();
    while ((local1 < local2)) {
        moom.oF local3 = ((moom.oF)(((java.util.List)(this.b)).get(((int)(local1)))));
        if (((moom.oF)(local3)).a__Boolean()) {
        return true;
    }
        local1 += 1;
    }
    return false;
}


public int c() {
return (this.d() / 4);
}


public int d() {
return this.d;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a__Void() {
((java.util.List)(this.b)).clear();
    ((java.util.List)(this.c)).clear();
    this.e = ((int)(-1));
    ((java.util.List)(this.f)).clear();
    this.g = ((int)(-1));
    this.d = ((int)(0));
    return;
}


public moom.oD a(moom.oF p0) {
forest_join_47: {
    forest_join_39: {
    forest_join_34: {
    forest_join_29: {
    forest_join_11: {
    if (!(((moom.oF)(p0)).a__Boolean())) {
        break forest_join_11;
    }
    if (!(((moom.oD)(this)).c__Boolean())) {
        break forest_join_11;
    }
    ((org.apache.logging.log4j.Logger)(moom.oD.a)).warn(((java.lang.String)("VertexFormat error: Trying to add a position VertexFormatElement when one already exists, ignoring.")));
    return this;
    }
    ((java.util.List)(this.b)).add(((java.lang.Object)(p0)));
    ((java.util.List)(this.c)).add(((java.lang.Object)(java.lang.Integer.valueOf(((int)(this.d))))));
    switch ((moom.oE.a)[((net.minecraft.client.renderer.vertex.VertexFormatElement$EnumUsage)(((moom.oF)(p0)).a__aK())).ordinal()]) {
case 1:
{
        break forest_join_29;
    }
case 2:
{
        break forest_join_34;
    }
case 3:
{
        break forest_join_39;
    }
default:
{
        break forest_join_47;
    }
}
    }
    this.g = ((int)(this.d));
    break forest_join_47;
    }
    this.e = ((int)(this.d));
    break forest_join_47;
    }
    ((java.util.List)(this.f)).add(((int)(((moom.oF)(p0)).b())), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(this.d))))));
    }
    moom.oD __stackOp906_22_0 = this;
    ((moom.oD)(__stackOp906_22_0)).d = ((int)((((moom.oD)(__stackOp906_22_0)).d + ((moom.oF)(p0)).c())));
    return this;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 28983;
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
            throw new RuntimeException("moom/oD", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         j[var3] = var15;
      }

      return j[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.oD.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral8547_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/oD"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public int a(int p0) {
return ((java.lang.Integer)(((java.lang.Integer)(((java.util.List)(this.f)).get(((int)(p0))))))).intValue();
}


public java.util.List<moom.oF> a__List() {
return this.b;
}


public boolean a__Boolean(int p0) {
return (((((((java.util.List)(this.f)).size() - 1) >= p0) ? 1 : 0)) != 0);
}


public moom.oF a__oF(int p0) {
return ((moom.oF)(((java.util.List)(this.b)).get(((int)(p0)))));
}


public int a() {
return this.g;
}


public boolean a__Boolean() {
return ((((this.g >= 0) ? 1 : 0)) != 0);
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral8547_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_originalDynamicSite1574_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_originalDynamicSite1574_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_invokedynamic8544_2(int a0) throws E;
}
