package net.minecraft.client.shader;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Shader {

private final net.minecraft.client.shader.ShaderManager a;

public final net.minecraft.client.shader.Framebuffer b;

public final net.minecraft.client.shader.Framebuffer c;

private final java.util.List<java.lang.Object> d;

private final java.util.List<java.lang.String> e;

private final java.util.List<java.lang.Integer> f;

private final java.util.List<java.lang.Integer> g;

private org.lwjgl.util.vector.Matrix4f h;

private static final long i;

private static final long[] j;

private static final java.lang.Integer[] k;

private static final java.util.Map l;

public Shader(moom.oR p0, java.lang.String p1, net.minecraft.client.shader.Framebuffer p2, net.minecraft.client.shader.Framebuffer p3) throws java.io.IOException {
super();
    this.d = com.google.common.collect.Lists.newArrayList();
    this.e = com.google.common.collect.Lists.newArrayList();
    this.f = com.google.common.collect.Lists.newArrayList();
    this.g = com.google.common.collect.Lists.newArrayList();
    this.a = new net.minecraft.client.shader.ShaderManager(p0, p1);
    this.b = p2;
    this.c = p3;
}


static {
i = ((long)(((moom._a)(moom._c.a(((long)(-9173669544179025388L)), ((long)(-4864729269885188204L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(172102721966715L)))));
    l = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (net.minecraft.client.shader.Shader.i ^ 62008768991517L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1183_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1183_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1183_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1183_14 = new byte[8];
    (__sourceSpill1183_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1183_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1183_16 = __sourceSpill1183_14;
    ((javax.crypto.Cipher)(__sourceSpill1183_11)).init(((int)(__sourceSpill1183_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1183_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1183_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[3];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "ôÒÛFÉ¹V!\032Ú¤ú.½\034×cÀ$¹"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1183_25 = local6_life21;
        int __sourceSpill1183_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1183_25)).substring(((int)(__sourceSpill1183_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1183_30 = local8_life19;
        int __sourceSpill1183_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1183_33 = new byte[8];
        (__sourceSpill1183_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1183_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1183_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1183_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1183_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1183_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1183_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1183_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1183_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1183_34)).doFinal(((byte[])(__sourceSpill1183_33)));
        (__sourceSpill1183_30)[__sourceSpill1183_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    j = ((long[])(local8_life19));
    k = ((java.lang.Integer[])(new java.lang.Integer[3]));
}


private void b() {
moom.kZ.c(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    moom.kZ.k();
    moom.kZ.i();
    moom.kZ.c__Void();
    moom.kZ.n();
    moom.kZ.f();
    moom.kZ.h();
    moom.kZ.u();
    moom.kZ.i(((int)(0)));
    return;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.client.shader.Shader.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 5394;
      if (k[var3] == null) {
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
         long var5 = j[var3];
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
         Object[] var9 = (Object[])l.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               l.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/pB", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         k[var3] = var15;
      }

      return k[var3];
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral10971_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/pB"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a__Void() {
((net.minecraft.client.shader.ShaderManager)(this.a)).a__Void();
    return;
}


public void a(java.lang.String p0, java.lang.Object p1, int p2, int p3) {
((java.util.List)(this.e)).add(((int)(((java.util.List)(this.e)).size())), ((java.lang.Object)(p0)));
    ((java.util.List)(this.d)).add(((int)(((java.util.List)(this.d)).size())), ((java.lang.Object)(p1)));
    ((java.util.List)(this.f)).add(((int)(((java.util.List)(this.f)).size())), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(p2))))));
    ((java.util.List)(this.g)).add(((int)(((java.util.List)(this.g)).size())), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(p3))))));
    return;
}


public void a(org.lwjgl.util.vector.Matrix4f p0) {
this.h = ((org.lwjgl.util.vector.Matrix4f)(p0));
    return;
}


public void a(float p0) {
long life2_3;
    float life4_13;
    float life5_18;
    int life6_33;
    net.minecraft.client.Minecraft life6_107;
    net.minecraft.client.renderer.Tessellator life7_137;
    moom.lw life8_140;
    java.util.Iterator life9_282;
    java.lang.Object life10_288;
    forest_join_296: {
    forest_join_73: {
    life2_3 = (net.minecraft.client.shader.Shader.i ^ 21159720297696L);
    this.b();
    ((net.minecraft.client.shader.Framebuffer)(this.b)).e();
    life4_13 = ((float) ((net.minecraft.client.shader.Framebuffer)(this.c)).a);
    life5_18 = ((float) ((net.minecraft.client.shader.Framebuffer)(this.c)).b);
    moom.kZ.b(((int)(0)), ((int)(0)), ((int)(((int) life4_13))), ((int)(((int) life5_18))));
    ((net.minecraft.client.shader.ShaderManager)(this.a)).a(((java.lang.String)("DiffuseSampler")), ((java.lang.Object)(this.b)));
    life6_33 = 0;
    forest_cycle_34: while (true) {
    if (!((life6_33 < ((java.util.List)(this.d)).size()))) {
        break forest_join_73;
    }
    ((net.minecraft.client.shader.ShaderManager)(this.a)).a(((java.lang.String)(((java.lang.String)(((java.util.List)(this.e)).get(((int)(life6_33))))))), ((java.lang.Object)(((java.util.List)(this.d)).get(((int)(life6_33))))));
    ((net.minecraft.client.shader.ShaderUniform)(((net.minecraft.client.shader.ShaderManager)(this.a)).b(((java.lang.String)(__sourceIntrinsic_c6b9ded72a2a_invokedynamic720009_22(life6_33)))))).a(((float)(((float) ((java.lang.Integer)(((java.lang.Integer)(((java.util.List)(this.f)).get(((int)(life6_33))))))).intValue()))), ((float)(((float) ((java.lang.Integer)(((java.lang.Integer)(((java.util.List)(this.g)).get(((int)(life6_33))))))).intValue()))));
    life6_33 += 1;
    continue forest_cycle_34;
    }
    }
    ((net.minecraft.client.shader.ShaderUniform)(((net.minecraft.client.shader.ShaderManager)(this.a)).b(((java.lang.String)("ProjMat"))))).a(((org.lwjgl.util.vector.Matrix4f)(this.h)));
    ((net.minecraft.client.shader.ShaderUniform)(((net.minecraft.client.shader.ShaderManager)(this.a)).b(((java.lang.String)("InSize"))))).a(((float)(((float) ((net.minecraft.client.shader.Framebuffer)(this.b)).a))), ((float)(((float) ((net.minecraft.client.shader.Framebuffer)(this.b)).b))));
    ((net.minecraft.client.shader.ShaderUniform)(((net.minecraft.client.shader.ShaderManager)(this.a)).b(((java.lang.String)("OutSize"))))).a(((float)(life4_13)), ((float)(life5_18)));
    ((net.minecraft.client.shader.ShaderUniform)(((net.minecraft.client.shader.ShaderManager)(this.a)).b(((java.lang.String)("Time"))))).a(((float)(p0)));
    life6_107 = net.minecraft.client.Minecraft.a__fM();
    ((net.minecraft.client.shader.ShaderUniform)(((net.minecraft.client.shader.ShaderManager)(this.a)).b(((java.lang.String)("ScreenSize"))))).a(((float)(((float) ((net.minecraft.client.Minecraft)(life6_107)).G))), ((float)(((float) ((net.minecraft.client.Minecraft)(life6_107)).H))));
    ((net.minecraft.client.shader.ShaderManager)(this.a)).c();
    ((net.minecraft.client.shader.Framebuffer)(this.c)).f();
    ((net.minecraft.client.shader.Framebuffer)(this.c)).a(((boolean)(false)));
    moom.kZ.a(((boolean)(false)));
    moom.kZ.a(((boolean)(true)), ((boolean)(true)), ((boolean)(true)), ((boolean)(true)));
    life7_137 = net.minecraft.client.renderer.Tessellator.a();
    life8_140 = ((net.minecraft.client.renderer.Tessellator)(life7_137)).a__lw();
    ((moom.lw)(life8_140)).a(((int)(__sourceIntrinsic_c6b9ded72a2a_invokedynamic720009_66(28179, (2235735051380665020L ^ life2_3)))), ((moom.oD)(moom.oB.h)));
    ((moom.lw)(((moom.lw)(((moom.lw)(life8_140)).a(((double)(0x0.0p0d)), ((double)(((double) life5_18))), ((double)(0x1.f4p8d))))).a(((int)(__sourceIntrinsic_c6b9ded72a2a_invokedynamic720009_70(28980, (6074061274895463834L ^ life2_3)))), ((int)(__sourceIntrinsic_c6b9ded72a2a_invokedynamic720009_71(16667, (5454112362156197302L ^ life2_3)))), ((int)(__sourceIntrinsic_c6b9ded72a2a_invokedynamic720009_72(16667, (5454112362156197302L ^ life2_3)))), ((int)(__sourceIntrinsic_c6b9ded72a2a_invokedynamic720009_73(16667, (5454112362156197302L ^ life2_3))))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(life8_140)).a(((double)(((double) life4_13))), ((double)(((double) life5_18))), ((double)(0x1.f4p8d))))).a(((int)(__sourceIntrinsic_c6b9ded72a2a_invokedynamic720009_77(16667, (5454112362156197302L ^ life2_3)))), ((int)(__sourceIntrinsic_c6b9ded72a2a_invokedynamic720009_78(16667, (5454112362156197302L ^ life2_3)))), ((int)(__sourceIntrinsic_c6b9ded72a2a_invokedynamic720009_79(16667, (5454112362156197302L ^ life2_3)))), ((int)(__sourceIntrinsic_c6b9ded72a2a_invokedynamic720009_80(16667, (5454112362156197302L ^ life2_3))))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(life8_140)).a(((double)(((double) life4_13))), ((double)(0x0.0p0d)), ((double)(0x1.f4p8d))))).a(((int)(__sourceIntrinsic_c6b9ded72a2a_invokedynamic720009_84(16667, (5454112362156197302L ^ life2_3)))), ((int)(__sourceIntrinsic_c6b9ded72a2a_invokedynamic720009_85(16667, (5454112362156197302L ^ life2_3)))), ((int)(__sourceIntrinsic_c6b9ded72a2a_invokedynamic720009_86(16667, (5454112362156197302L ^ life2_3)))), ((int)(__sourceIntrinsic_c6b9ded72a2a_invokedynamic720009_87(16667, (5454112362156197302L ^ life2_3))))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(life8_140)).a(((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((double)(0x1.f4p8d))))).a(((int)(__sourceIntrinsic_c6b9ded72a2a_invokedynamic720009_91(16667, (5454112362156197302L ^ life2_3)))), ((int)(__sourceIntrinsic_c6b9ded72a2a_invokedynamic720009_92(16667, (5454112362156197302L ^ life2_3)))), ((int)(__sourceIntrinsic_c6b9ded72a2a_invokedynamic720009_93(16667, (5454112362156197302L ^ life2_3)))), ((int)(__sourceIntrinsic_c6b9ded72a2a_invokedynamic720009_94(16667, (5454112362156197302L ^ life2_3))))))).c__Void();
    ((net.minecraft.client.renderer.Tessellator)(life7_137)).a__Void();
    moom.kZ.a(((boolean)(true)));
    moom.kZ.a(((boolean)(true)), ((boolean)(true)), ((boolean)(true)), ((boolean)(true)));
    ((net.minecraft.client.shader.ShaderManager)(this.a)).b__Void();
    ((net.minecraft.client.shader.Framebuffer)(this.c)).e();
    ((net.minecraft.client.shader.Framebuffer)(this.b)).d();
    life9_282 = ((java.util.List)(this.d)).iterator();
    forest_cycle_283: while (true) {
    forest_join_295: {
    if (!(((java.util.Iterator)(life9_282)).hasNext())) {
        break forest_join_296;
    }
    life10_288 = ((java.util.Iterator)(life9_282)).next();
    if (!((((life10_288 instanceof net.minecraft.client.shader.Framebuffer) ? 1 : 0) != 0))) {
        break forest_join_295;
    }
    ((net.minecraft.client.shader.Framebuffer)(((net.minecraft.client.shader.Framebuffer)(life10_288)))).d();
    }
    continue forest_cycle_283;
    }
    }
    return;
}


public net.minecraft.client.shader.ShaderManager a() {
return this.a;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c6b9ded72a2a_invokedynamic720009_22(int a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c6b9ded72a2a_invokedynamic720009_66(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c6b9ded72a2a_invokedynamic720009_70(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c6b9ded72a2a_invokedynamic720009_71(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c6b9ded72a2a_invokedynamic720009_72(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c6b9ded72a2a_invokedynamic720009_73(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c6b9ded72a2a_invokedynamic720009_77(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c6b9ded72a2a_invokedynamic720009_78(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c6b9ded72a2a_invokedynamic720009_79(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c6b9ded72a2a_invokedynamic720009_80(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c6b9ded72a2a_invokedynamic720009_84(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c6b9ded72a2a_invokedynamic720009_85(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c6b9ded72a2a_invokedynamic720009_86(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c6b9ded72a2a_invokedynamic720009_87(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c6b9ded72a2a_invokedynamic720009_91(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c6b9ded72a2a_invokedynamic720009_92(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c6b9ded72a2a_invokedynamic720009_93(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c6b9ded72a2a_invokedynamic720009_94(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral10971_0() throws E;
}
