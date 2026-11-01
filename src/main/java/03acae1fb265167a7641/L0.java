package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class L0 {

private moom.jD a;

private int b;

private int c;

private float d;

private float e;

private float f;

private int g;

private int h;

private int i;

private float j;

private float k;

private float l;

private float m;

private float n;

private static long o;

private static long[] p;

private static java.lang.Integer[] q;

private static java.util.Map r;

public L0(moom.jD p0, int p1, int p2, float p3, float p4, float p5, int p6, int p7, int p8, float p9) { super(); }


private static void __sourceConstructorBody_64ee9cb014dc5243(moom.L0 receiver, moom.jD p0, int p1, int p2, float p3, float p4, float p5, int p6, int p7, int p8, float p9) throws Throwable {

long local11_life1 = (moom.L0.o ^ 29991655142641L);

    moom.L0.__sourceConstructorInit_64ee9cb014dc5243_0(((moom.L0)(receiver)));

    ((moom.L0)(receiver)).a = ((moom.jD)(null));

    ((moom.L0)(receiver)).b = ((int)(0));

    ((moom.L0)(receiver)).c = ((int)(0));

    ((moom.L0)(receiver)).d = ((float)(0x0.0p0f));

    ((moom.L0)(receiver)).e = ((float)(0x0.0p0f));

    ((moom.L0)(receiver)).f = ((float)(0x0.0p0f));

    ((moom.L0)(receiver)).g = ((int)(0));

    ((moom.L0)(receiver)).h = ((int)(0));

    ((moom.L0)(receiver)).i = ((int)(0));

    ((moom.L0)(receiver)).j = ((float)(0x0.0p0f));

    ((moom.L0)(receiver)).k = ((float)(0x0.0p0f));

    ((moom.L0)(receiver)).l = ((float)(0x0.0p0f));

    int[] __sourceSpill619_17 = moom.LZ.b();

    ((moom.L0)(receiver)).m = ((float)(0x0.0p0f));

    ((moom.L0)(receiver)).n = ((float)(0x0.0p0f));

    ((moom.L0)(receiver)).a = ((moom.jD)(p0));

    ((moom.L0)(receiver)).b = ((int)(p1));

    ((moom.L0)(receiver)).c = ((int)(p2));

    ((moom.L0)(receiver)).d = ((float)(p3));

    ((moom.L0)(receiver)).e = ((float)(p4));

    ((moom.L0)(receiver)).f = ((float)(p5));

    ((moom.L0)(receiver)).g = ((int)(p6));

    int[] local13_life26 = __sourceSpill619_17;

    ((moom.L0)(receiver)).h = ((int)(p7));

    ((moom.L0)(receiver)).i = ((int)(p8));

    ((moom.L0)(receiver)).j = ((float)(p9));

    ((moom.L0)(receiver)).k = ((float)((((float) p1) / ((moom.jD)(p0)).a)));

    ((moom.L0)(receiver)).l = ((float)((((float) p2) / ((moom.jD)(p0)).b)));

    ((moom.L0)(receiver)).m = ((float)((((float) (p1 + p6)) / ((moom.jD)(p0)).a)));

    ((moom.L0)(receiver)).n = ((float)((((float) (p2 + p7)) / ((moom.jD)(p0)).b)));

    if ((net.minecraft.entity.Entity.b__ArrayString() != null)) {

        moom.LZ.b(((int[])(new int[2])));

    }

    return;

}



static {
o = ((long)(((moom._a)(moom._c.a(((long)(-7638759085803919432L)), ((long)(4491337534240300369L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(110125662183700L)))));
    r = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.L0.o ^ 115442658492458L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill661_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill661_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill661_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill661_14 = new byte[8];
    (__sourceSpill661_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill661_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation661_16 = __sourceSpill661_14;
    ((javax.crypto.Cipher)(__sourceSpill661_11)).init(((int)(__sourceSpill661_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill661_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation661_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "a´¸ï\033±æC\005Ut£x"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill661_25 = local6_life21;
        int __sourceSpill661_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill661_25)).substring(((int)(__sourceSpill661_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill661_30 = local8_life19;
        int __sourceSpill661_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill661_33 = new byte[8];
        (__sourceSpill661_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill661_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill661_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill661_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill661_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill661_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill661_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill661_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill661_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill661_34)).doFinal(((byte[])(__sourceSpill661_33)));
        (__sourceSpill661_30)[__sourceSpill661_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    p = ((long[])(local8_life19));
    q = ((java.lang.Integer[])(new java.lang.Integer[2]));
}

private static native <E extends Throwable> void __sourceConstructorInit_64ee9cb014dc5243_0(moom.L0 a0) throws E;

private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 5571;
      if (q[var3] == null) {
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
         long var5 = p[var3];
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
         Object[] var9 = (Object[])r.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               r.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/L0", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         q[var3] = var15;
      }

      return q[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.L0.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral5823_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/L0"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public static void a(net.minecraft.client.renderer.Tessellator p0, float p1, float p2, float p3, float p4, int p5, int p6, float p7, float p8, float p9) {
float lexicalValue905_16_0;
    float lexicalValue905_16_1;
    float spill905_0;
    float spill905_1;
    long life10_3;
    int[] life12_5;
    float life13_20;
    float life14_24;
    double life15_32;
    double life17_40;
    moom.lw life19_43;
    float life20_170;
    float life21_177;
    int life22_191;
    float life23_200;
    float life24_208;
    int life22_293;
    float life23_302;
    float life24_310;
    float life25_317;
    int life22_399;
    float life23_408;
    float life24_416;
    float life25_423;
    int life22_505;
    float life23_514;
    float life24_522;
    lexical_join_576: {
    lexical_join_574: {
    lexical_join_492: {
    lexical_join_478: {
    lexical_join_389: {
    lexical_join_375: {
    lexical_join_286: {
    lexical_join_272: {
    lexical_join_16: {
    lexical_join_14: {
    life10_3 = (moom.L0.o ^ 137106776116270L);
    life12_5 = moom.LZ.b();
    spill905_0 = p7;
    spill905_1 = 0x1.47ae14p-11f;
    if (!((life12_5 != null))) {
        lexicalValue905_16_0 = spill905_0;
        lexicalValue905_16_1 = spill905_1;
        break lexical_join_16;
    }
    if (!((recovery.source.CarrierOps.fcmpg(((float)(spill905_0)), ((float)(spill905_1))) < 0))) {
        break lexical_join_14;
    }
    p7 = 0x1.47ae14p-11f;
    }
    lexicalValue905_16_0 = p3;
    lexicalValue905_16_1 = p1;
    }
    life13_20 = (lexicalValue905_16_0 - lexicalValue905_16_1);
    life14_24 = (p4 - p2);
    life15_32 = ((double) (moom.Dr.d(((float)(life13_20))) * (p8 / 0x1.0p4f)));
    life17_40 = ((double) (moom.Dr.d(((float)(life14_24))) * (p9 / 0x1.0p4f)));
    life19_43 = ((net.minecraft.client.renderer.Tessellator)(p0)).a__lw();
    org.lwjgl.opengl.GL11.glNormal3f(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(-0x1.0p0f)));
    ((moom.lw)(life19_43)).a(((int)(__sourceIntrinsic_ec6c5fae7f16_invokedynamic905_7(16940, (5145522073167903558L ^ life10_3)))), ((moom.oD)(moom.oB.i)));
    ((moom.lw)(((moom.lw)(((moom.lw)(life19_43)).a(((double)(0x0.0p0d)), ((double)(life17_40)), ((double)(0x0.0p0d))))).a(((double)(((double) p1))), ((double)(((double) p4)))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(life19_43)).a(((double)(life15_32)), ((double)(life17_40)), ((double)(0x0.0p0d))))).a(((double)(((double) p3))), ((double)(((double) p4)))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(life19_43)).a(((double)(life15_32)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d))))).a(((double)(((double) p3))), ((double)(((double) p2)))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(life19_43)).a(((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d))))).a(((double)(((double) p1))), ((double)(((double) p2)))))).c__Void();
    ((net.minecraft.client.renderer.Tessellator)(p0)).a__Void();
    org.lwjgl.opengl.GL11.glNormal3f(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)));
    ((moom.lw)(life19_43)).a(((int)(__sourceIntrinsic_ec6c5fae7f16_invokedynamic905_24(15401, (6841651848148927810L ^ life10_3)))), ((moom.oD)(moom.oB.i)));
    ((moom.lw)(((moom.lw)(((moom.lw)(life19_43)).a(((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((double)(((double) p7)))))).a(((double)(((double) p1))), ((double)(((double) p2)))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(life19_43)).a(((double)(life15_32)), ((double)(0x0.0p0d)), ((double)(((double) p7)))))).a(((double)(((double) p3))), ((double)(((double) p2)))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(life19_43)).a(((double)(life15_32)), ((double)(life17_40)), ((double)(((double) p7)))))).a(((double)(((double) p3))), ((double)(((double) p4)))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(life19_43)).a(((double)(0x0.0p0d)), ((double)(life17_40)), ((double)(((double) p7)))))).a(((double)(((double) p1))), ((double)(((double) p4)))))).c__Void();
    ((net.minecraft.client.renderer.Tessellator)(p0)).a__Void();
    life20_170 = ((0x1.0p-1f * life13_20) / ((float) p5));
    life21_177 = ((0x1.0p-1f * life14_24) / ((float) p6));
    org.lwjgl.opengl.GL11.glNormal3f(((float)(-0x1.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)));
    ((moom.lw)(life19_43)).a(((int)(__sourceIntrinsic_ec6c5fae7f16_invokedynamic905_41(15401, (6841651848148927810L ^ life10_3)))), ((moom.oD)(moom.oB.i)));
    life22_191 = 0;
    lexical_cycle_189: while (true) {
    if (!((life22_191 < p5))) {
        break lexical_join_272;
    }
    life23_200 = (((float) life22_191) / ((float) p5));
    life24_208 = ((p1 + (life13_20 * life23_200)) + life20_170);
    ((moom.lw)(((moom.lw)(((moom.lw)(life19_43)).a(((double)((((double) life23_200) * life15_32))), ((double)(life17_40)), ((double)(((double) p7)))))).a(((double)(((double) life24_208))), ((double)(((double) p4)))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(life19_43)).a(((double)((((double) life23_200) * life15_32))), ((double)(life17_40)), ((double)(0x0.0p0d))))).a(((double)(((double) life24_208))), ((double)(((double) p4)))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(life19_43)).a(((double)((((double) life23_200) * life15_32))), ((double)(0x0.0p0d)), ((double)(0x0.0p0d))))).a(((double)(((double) life24_208))), ((double)(((double) p2)))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(life19_43)).a(((double)((((double) life23_200) * life15_32))), ((double)(0x0.0p0d)), ((double)(((double) p7)))))).a(((double)(((double) life24_208))), ((double)(((double) p2)))))).c__Void();
    life22_191 += 1;
    if (!((life12_5 != null))) {
        break lexical_join_286;
    }
    if (!((life12_5 == null))) { continue lexical_cycle_189; }
    break lexical_cycle_189;
    }
    net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[1])));
    }
    ((net.minecraft.client.renderer.Tessellator)(p0)).a__Void();
    org.lwjgl.opengl.GL11.glNormal3f(((float)(0x1.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)));
    ((moom.lw)(life19_43)).a(((int)(__sourceIntrinsic_ec6c5fae7f16_invokedynamic905_59(15401, (6841651848148927810L ^ life10_3)))), ((moom.oD)(moom.oB.i)));
    }
    life22_293 = 0;
    lexical_cycle_288: while (true) {
    if (!((life22_293 < p5))) {
        break lexical_join_375;
    }
    life23_302 = (((float) life22_293) / ((float) p5));
    life24_310 = ((p1 + (life13_20 * life23_302)) + life20_170);
    life25_317 = (life23_302 + (0x1.0p0f / ((float) p5)));
    ((moom.lw)(((moom.lw)(((moom.lw)(life19_43)).a(((double)((((double) life25_317) * life15_32))), ((double)(0x0.0p0d)), ((double)(((double) p7)))))).a(((double)(((double) life24_310))), ((double)(((double) p2)))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(life19_43)).a(((double)((((double) life25_317) * life15_32))), ((double)(0x0.0p0d)), ((double)(0x0.0p0d))))).a(((double)(((double) life24_310))), ((double)(((double) p2)))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(life19_43)).a(((double)((((double) life25_317) * life15_32))), ((double)(life17_40)), ((double)(0x0.0p0d))))).a(((double)(((double) life24_310))), ((double)(((double) p4)))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(life19_43)).a(((double)((((double) life25_317) * life15_32))), ((double)(life17_40)), ((double)(((double) p7)))))).a(((double)(((double) life24_310))), ((double)(((double) p4)))))).c__Void();
    life22_293 += 1;
    if (!((life12_5 != null))) {
        break lexical_join_389;
    }
    if (!((life12_5 == null))) { continue lexical_cycle_288; }
    break lexical_cycle_288;
    }
    }
    ((net.minecraft.client.renderer.Tessellator)(p0)).a__Void();
    org.lwjgl.opengl.GL11.glNormal3f(((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)));
    ((moom.lw)(life19_43)).a(((int)(__sourceIntrinsic_ec6c5fae7f16_invokedynamic905_76(15401, (6841651848148927810L ^ life10_3)))), ((moom.oD)(moom.oB.i)));
    }
    life22_399 = 0;
    lexical_cycle_391: while (true) {
    if (!((life22_399 < p6))) {
        break lexical_join_478;
    }
    life23_408 = (((float) life22_399) / ((float) p6));
    life24_416 = ((p2 + (life14_24 * life23_408)) + life21_177);
    life25_423 = (life23_408 + (0x1.0p0f / ((float) p6)));
    ((moom.lw)(((moom.lw)(((moom.lw)(life19_43)).a(((double)(0x0.0p0d)), ((double)((((double) life25_423) * life17_40))), ((double)(((double) p7)))))).a(((double)(((double) p1))), ((double)(((double) life24_416)))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(life19_43)).a(((double)(life15_32)), ((double)((((double) life25_423) * life17_40))), ((double)(((double) p7)))))).a(((double)(((double) p3))), ((double)(((double) life24_416)))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(life19_43)).a(((double)(life15_32)), ((double)((((double) life25_423) * life17_40))), ((double)(0x0.0p0d))))).a(((double)(((double) p3))), ((double)(((double) life24_416)))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(life19_43)).a(((double)(0x0.0p0d)), ((double)((((double) life25_423) * life17_40))), ((double)(0x0.0p0d))))).a(((double)(((double) p1))), ((double)(((double) life24_416)))))).c__Void();
    life22_399 += 1;
    if (!((life12_5 != null))) {
        break lexical_join_492;
    }
    if (!((life12_5 == null))) { continue lexical_cycle_391; }
    break lexical_cycle_391;
    }
    }
    ((net.minecraft.client.renderer.Tessellator)(p0)).a__Void();
    org.lwjgl.opengl.GL11.glNormal3f(((float)(0x0.0p0f)), ((float)(-0x1.0p0f)), ((float)(0x0.0p0f)));
    ((moom.lw)(life19_43)).a(((int)(__sourceIntrinsic_ec6c5fae7f16_invokedynamic905_93(15401, (6841651848148927810L ^ life10_3)))), ((moom.oD)(moom.oB.i)));
    }
    life22_505 = 0;
    lexical_cycle_494: while (true) {
    if (!((life22_505 < p6))) {
        break lexical_join_574;
    }
    life23_514 = (((float) life22_505) / ((float) p6));
    life24_522 = ((p2 + (life14_24 * life23_514)) + life21_177);
    ((moom.lw)(((moom.lw)(((moom.lw)(life19_43)).a(((double)(life15_32)), ((double)((((double) life23_514) * life17_40))), ((double)(((double) p7)))))).a(((double)(((double) p3))), ((double)(((double) life24_522)))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(life19_43)).a(((double)(0x0.0p0d)), ((double)((((double) life23_514) * life17_40))), ((double)(((double) p7)))))).a(((double)(((double) p1))), ((double)(((double) life24_522)))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(life19_43)).a(((double)(0x0.0p0d)), ((double)((((double) life23_514) * life17_40))), ((double)(0x0.0p0d))))).a(((double)(((double) p1))), ((double)(((double) life24_522)))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(life19_43)).a(((double)(life15_32)), ((double)((((double) life23_514) * life17_40))), ((double)(0x0.0p0d))))).a(((double)(((double) p3))), ((double)(((double) life24_522)))))).c__Void();
    life22_505 += 1;
    if (!((life12_5 != null))) {
        break lexical_join_576;
    }
    if (!((life12_5 == null))) { continue lexical_cycle_494; }
    break lexical_cycle_494;
    }
    }
    ((net.minecraft.client.renderer.Tessellator)(p0)).a__Void();
    }
    return;
}


public void a(net.minecraft.client.renderer.Tessellator p0, float p1) {
int forwardValue2532_48_0;
    moom.L0 forwardValue2532_77_0;
    int[] spill2532_0;
    boolean spill2532_1;
    moom.L0 spill2532_2;
    long life3_3;
    float life6_19;
    float life7_22;
    float life8_25;
    float life9_29;
    int[] life5_30;
    forward_join_77: {
    forward_join_55: {
    forward_join_48: {
    forward_join_43: {
    life3_3 = (moom.L0.o ^ 85909915468927L);
    moom.kZ.b(((float)((this.d * p1))), ((float)((this.e * p1))), ((float)((this.f * p1))));
    life6_19 = this.k;
    life7_22 = this.m;
    life8_25 = this.l;
    spill2532_0 = moom.LZ.b();
    life9_29 = this.n;
    life5_30 = spill2532_0;
    spill2532_1 = ((moom.jD)(this.a)).m;
    if (!((life5_30 != null))) {
        forwardValue2532_48_0 = ((spill2532_1) ? 1 : 0);
        break forward_join_48;
    }
    if (!(spill2532_1)) {
        break forward_join_43;
    }
    life6_19 = this.m;
    life7_22 = this.k;
    }
    spill2532_2 = this;
    if (!((life5_30 != null))) {
        forwardValue2532_77_0 = spill2532_2;
        break forward_join_77;
    }
    forwardValue2532_48_0 = ((((moom.jD)(((moom.L0)(spill2532_2)).a)).x) ? 1 : 0);
    }
    if (!((forwardValue2532_48_0 != 0))) {
        break forward_join_55;
    }
    life8_25 = this.n;
    life9_29 = this.l;
    }
    moom.L0.a(((net.minecraft.client.renderer.Tessellator)(p0)), ((float)(life6_19)), ((float)(life8_25)), ((float)(life7_22)), ((float)(life9_29)), ((int)(this.g)), ((int)(this.h)), ((float)((p1 * ((float) this.i)))), ((float)(((moom.jD)(this.a)).a)), ((float)(((moom.jD)(this.a)).b)));
    forwardValue2532_77_0 = this;
    }
    moom.kZ.b(((float)(((-((moom.L0)(forwardValue2532_77_0)).d) * p1))), ((float)(((-this.e) * p1))), ((float)(((-this.f) * p1))));
    return;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral5823_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ec6c5fae7f16_invokedynamic905_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ec6c5fae7f16_invokedynamic905_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ec6c5fae7f16_invokedynamic905_41(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ec6c5fae7f16_invokedynamic905_59(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ec6c5fae7f16_invokedynamic905_76(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ec6c5fae7f16_invokedynamic905_93(int a0, long a1) throws E;
}
