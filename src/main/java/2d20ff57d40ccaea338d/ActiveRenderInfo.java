package net.minecraft.client.renderer;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class ActiveRenderInfo {

public static final java.nio.IntBuffer a;

public static final java.nio.FloatBuffer b;

public static final java.nio.FloatBuffer c;

public static final java.nio.FloatBuffer d;

private static moom.DR e;

private static float f;

private static float g;

private static float h;

private static float i;

private static float j;

private static final long k;

private static final long[] l;

private static final java.lang.Integer[] m;

private static final java.util.Map n;

public ActiveRenderInfo() {
super();
}


static {
k = ((long)(((moom._a)(moom._c.a(((long)(-1671707993956713459L)), ((long)(6448403593495477477L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(146167196590132L)))));
    long local11_life6 = (net.minecraft.client.renderer.ActiveRenderInfo.k ^ 135710656804213L);
    n = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life9;
    javax.crypto.Cipher __sourceSpill1802_11 = (local0_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1802_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1802_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1802_14 = new byte[8];
    (__sourceSpill1802_14)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local1_life15 = 1;
    while ((local1_life15 < 8)) {
        (__sourceSpill1802_14)[local1_life15] = ((byte) ((int) ((local11_life6 << (local1_life15 * 8)) >>> 56)));
        local1_life15 += 1;
    }
    byte[] __sourcePreallocation1802_16 = __sourceSpill1802_14;
    ((javax.crypto.Cipher)(__sourceSpill1802_11)).init(((int)(__sourceSpill1802_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1802_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1802_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life19 = new long[5];
    int local3_life20 = 0;
    java.lang.String local4_life21;
    int local5_life23 = ((java.lang.String)((local4_life21 = "á®8sÿO\032 ~Ã\032oß+±ôÚ\005\031\032Eý"))).length();
    int local2_life24 = 0;
    do {
        java.lang.String __sourceSpill1802_25 = local4_life21;
        int __sourceSpill1802_26 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1802_25)).substring(((int)(__sourceSpill1802_26)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1802_30 = local6_life19;
        int __sourceSpill1802_31 = local3_life20;
        local3_life20 += 1;
        long local8_life32 = (((((((((((long) (local7_life29)[0]) & 255L) << 56) | ((((long) (local7_life29)[1]) & 255L) << 48)) | ((((long) (local7_life29)[2]) & 255L) << 40)) | ((((long) (local7_life29)[3]) & 255L) << 32)) | ((((long) (local7_life29)[4]) & 255L) << 24)) | ((((long) (local7_life29)[5]) & 255L) << 16)) | ((((long) (local7_life29)[6]) & 255L) << 8)) | (((long) (local7_life29)[7]) & 255L));
        byte[] __sourceSpill1802_33 = new byte[8];
        (__sourceSpill1802_33)[0] = ((byte) ((int) (local8_life32 >>> 56)));
        (__sourceSpill1802_33)[1] = ((byte) ((int) (local8_life32 >>> 48)));
        (__sourceSpill1802_33)[2] = ((byte) ((int) (local8_life32 >>> 40)));
        (__sourceSpill1802_33)[3] = ((byte) ((int) (local8_life32 >>> 32)));
        (__sourceSpill1802_33)[4] = ((byte) ((int) (local8_life32 >>> 24)));
        (__sourceSpill1802_33)[5] = ((byte) ((int) (local8_life32 >>> 16)));
        (__sourceSpill1802_33)[6] = ((byte) ((int) (local8_life32 >>> 8)));
        (__sourceSpill1802_33)[7] = ((byte) ((int) local8_life32));
        javax.crypto.Cipher __sourceSpill1802_34 = local0_life9;
        byte[] local10_life36 = ((javax.crypto.Cipher)(__sourceSpill1802_34)).doFinal(((byte[])(__sourceSpill1802_33)));
        (__sourceSpill1802_30)[__sourceSpill1802_31] = (((((((((((long) (local10_life36)[0]) & 255L) << 56) | ((((long) (local10_life36)[1]) & 255L) << 48)) | ((((long) (local10_life36)[2]) & 255L) << 40)) | ((((long) (local10_life36)[3]) & 255L) << 32)) | ((((long) (local10_life36)[4]) & 255L) << 24)) | ((((long) (local10_life36)[5]) & 255L) << 16)) | ((((long) (local10_life36)[6]) & 255L) << 8)) | (((long) (local10_life36)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    local5_life23 = ((java.lang.String)((local4_life21 = "§ß=½a\027â\033úy²"))).length();
    local2_life24 = 0;
    do {
        java.lang.String __sourceSpill1802_38 = local4_life21;
        int __sourceSpill1802_39 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1802_38)).substring(((int)(__sourceSpill1802_39)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1802_43 = local6_life19;
        int __sourceSpill1802_44 = local3_life20;
        local3_life20 += 1;
        long local8_life45 = (((((((((((long) (local7_life42)[0]) & 255L) << 56) | ((((long) (local7_life42)[1]) & 255L) << 48)) | ((((long) (local7_life42)[2]) & 255L) << 40)) | ((((long) (local7_life42)[3]) & 255L) << 32)) | ((((long) (local7_life42)[4]) & 255L) << 24)) | ((((long) (local7_life42)[5]) & 255L) << 16)) | ((((long) (local7_life42)[6]) & 255L) << 8)) | (((long) (local7_life42)[7]) & 255L));
        byte[] __sourceSpill1802_46 = new byte[8];
        (__sourceSpill1802_46)[0] = ((byte) ((int) (local8_life45 >>> 56)));
        (__sourceSpill1802_46)[1] = ((byte) ((int) (local8_life45 >>> 48)));
        (__sourceSpill1802_46)[2] = ((byte) ((int) (local8_life45 >>> 40)));
        (__sourceSpill1802_46)[3] = ((byte) ((int) (local8_life45 >>> 32)));
        (__sourceSpill1802_46)[4] = ((byte) ((int) (local8_life45 >>> 24)));
        (__sourceSpill1802_46)[5] = ((byte) ((int) (local8_life45 >>> 16)));
        (__sourceSpill1802_46)[6] = ((byte) ((int) (local8_life45 >>> 8)));
        (__sourceSpill1802_46)[7] = ((byte) ((int) local8_life45));
        javax.crypto.Cipher __sourceSpill1802_47 = local0_life9;
        byte[] local10_life49 = ((javax.crypto.Cipher)(__sourceSpill1802_47)).doFinal(((byte[])(__sourceSpill1802_46)));
        (__sourceSpill1802_43)[__sourceSpill1802_44] = (((((((((((long) (local10_life49)[0]) & 255L) << 56) | ((((long) (local10_life49)[1]) & 255L) << 48)) | ((((long) (local10_life49)[2]) & 255L) << 40)) | ((((long) (local10_life49)[3]) & 255L) << 32)) | ((((long) (local10_life49)[4]) & 255L) << 24)) | ((((long) (local10_life49)[5]) & 255L) << 16)) | ((((long) (local10_life49)[6]) & 255L) << 8)) | (((long) (local10_life49)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    l = ((long[])(local6_life19));
    m = ((java.lang.Integer[])(new java.lang.Integer[5]));
    a = ((java.nio.IntBuffer)(net.minecraft.client.renderer.GLAllocation.a__IntBuffer(((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1802_52(12215, (347074193356693665L ^ local11_life6)))))));
    b = ((java.nio.FloatBuffer)(net.minecraft.client.renderer.GLAllocation.a__FloatBuffer(((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1802_55(26257, (2972684289931602307L ^ local11_life6)))))));
    c = ((java.nio.FloatBuffer)(net.minecraft.client.renderer.GLAllocation.a__FloatBuffer(((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1802_58(26257, (2972684289931602307L ^ local11_life6)))))));
    d = ((java.nio.FloatBuffer)(net.minecraft.client.renderer.GLAllocation.a__FloatBuffer(((int)(3)))));
    e = ((moom.DR)(new moom.DR(0x0.0p0d, 0x0.0p0d, 0x0.0p0d)));
}


public static float b() {
return net.minecraft.client.renderer.ActiveRenderInfo.g;
}


public static float e() {
return net.minecraft.client.renderer.ActiveRenderInfo.j;
}


public static float c() {
return net.minecraft.client.renderer.ActiveRenderInfo.h;
}


public static float d() {
return net.minecraft.client.renderer.ActiveRenderInfo.i;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral10537_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/kI"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public static void a(net.minecraft.entity.player.EntityPlayer p0, boolean p1) {
long life2_3;
    float life4_35;
    float life5_46;
    int life6_79;
    float life7_82;
    float life8_85;
    life2_3 = (net.minecraft.client.renderer.ActiveRenderInfo.k ^ 26859318951630L);
    moom.kZ.b(((int)(__sourceIntrinsic_e9aa692f4537_invokedynamic4808_1(17115, (6770597447021348464L ^ life2_3)))), ((java.nio.FloatBuffer)(net.minecraft.client.renderer.ActiveRenderInfo.b)));
    moom.kZ.b(((int)(__sourceIntrinsic_e9aa692f4537_invokedynamic4808_4(12679, (5073555546135147821L ^ life2_3)))), ((java.nio.FloatBuffer)(net.minecraft.client.renderer.ActiveRenderInfo.c)));
    org.lwjgl.opengl.GL11.glGetInteger(((int)(__sourceIntrinsic_e9aa692f4537_invokedynamic4808_7(20962, (1172989332211520842L ^ life2_3)))), ((java.nio.IntBuffer)(net.minecraft.client.renderer.ActiveRenderInfo.a)));
    life4_35 = ((float) ((((java.nio.IntBuffer)(net.minecraft.client.renderer.ActiveRenderInfo.a)).get(((int)(0))) + ((java.nio.IntBuffer)(net.minecraft.client.renderer.ActiveRenderInfo.a)).get(((int)(2)))) / 2));
    life5_46 = ((float) ((((java.nio.IntBuffer)(net.minecraft.client.renderer.ActiveRenderInfo.a)).get(((int)(1))) + ((java.nio.IntBuffer)(net.minecraft.client.renderer.ActiveRenderInfo.a)).get(((int)(3)))) / 2));
    org.lwjgl.util.glu.GLU.gluUnProject(((float)(life4_35)), ((float)(life5_46)), ((float)(0x0.0p0f)), ((java.nio.FloatBuffer)(net.minecraft.client.renderer.ActiveRenderInfo.b)), ((java.nio.FloatBuffer)(net.minecraft.client.renderer.ActiveRenderInfo.c)), ((java.nio.IntBuffer)(net.minecraft.client.renderer.ActiveRenderInfo.a)), ((java.nio.FloatBuffer)(net.minecraft.client.renderer.ActiveRenderInfo.d)));
    net.minecraft.client.renderer.ActiveRenderInfo.e = ((moom.DR)(new moom.DR(((double) ((java.nio.FloatBuffer)(net.minecraft.client.renderer.ActiveRenderInfo.d)).get(((int)(0)))), ((double) ((java.nio.FloatBuffer)(net.minecraft.client.renderer.ActiveRenderInfo.d)).get(((int)(1)))), ((double) ((java.nio.FloatBuffer)(net.minecraft.client.renderer.ActiveRenderInfo.d)).get(((int)(2)))))));
    life6_79 = (p1 ? 1 : 0);
    life7_82 = ((net.minecraft.entity.player.EntityPlayer)(p0)).x;
    life8_85 = ((net.minecraft.entity.player.EntityPlayer)(p0)).w;
    net.minecraft.client.renderer.ActiveRenderInfo.f = ((float)((moom.Dr.b(((float)(((life8_85 * 0x1.921fb6p1f) / 0x1.68p7f)))) * ((float) (1 - (life6_79 * 2))))));
    net.minecraft.client.renderer.ActiveRenderInfo.h = ((float)((moom.Dr.a(((float)(((life8_85 * 0x1.921fb6p1f) / 0x1.68p7f)))) * ((float) (1 - (life6_79 * 2))))));
    net.minecraft.client.renderer.ActiveRenderInfo.i = ((float)((((-net.minecraft.client.renderer.ActiveRenderInfo.h) * moom.Dr.a(((float)(((life7_82 * 0x1.921fb6p1f) / 0x1.68p7f))))) * ((float) (1 - (life6_79 * 2))))));
    net.minecraft.client.renderer.ActiveRenderInfo.j = ((float)(((net.minecraft.client.renderer.ActiveRenderInfo.f * moom.Dr.a(((float)(((life7_82 * 0x1.921fb6p1f) / 0x1.68p7f))))) * ((float) (1 - (life6_79 * 2))))));
    net.minecraft.client.renderer.ActiveRenderInfo.g = ((float)(moom.Dr.b(((float)(((life7_82 * 0x1.921fb6p1f) / 0x1.68p7f))))));
    return;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 5940;
      if (m[var3] == null) {
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
         long var5 = l[var3];
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
         Object[] var9 = (Object[])n.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               n.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/kI", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         m[var3] = var15;
      }

      return m[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.client.renderer.ActiveRenderInfo.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public static float a() {
return net.minecraft.client.renderer.ActiveRenderInfo.f;
}


public static moom.DR a__DR() {
return net.minecraft.client.renderer.ActiveRenderInfo.e;
}


public static net.minecraft.block.Block a(net.minecraft.world.World p0, net.minecraft.entity.Entity p1, float p2) {
moom.DR life3_4;
    moom.DT life4_9;
    net.minecraft.block.state.IBlockState life5_13;
    net.minecraft.block.Block life6_16;
    float life7_22;
    float life8_43;
    life3_4 = net.minecraft.client.renderer.ActiveRenderInfo.a(((net.minecraft.entity.Entity)(p1)), ((double)(((double) p2))));
    life4_9 = new moom.DT(life3_4);
    life5_13 = ((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life4_9)));
    life6_16 = ((net.minecraft.block.state.IBlockState)(life5_13)).a__ch();
    if (((moom.fn)(((net.minecraft.block.Block)(life6_16)).a__fn())).a__Boolean()) {
        life7_22 = 0x0.0p0f;
        if ((((((net.minecraft.block.state.IBlockState)(life5_13)).a__ch() instanceof net.minecraft.block.BlockLiquid) ? 1 : 0) != 0)) {
        life7_22 = (__sourceExactCall_47df7ec8ca7351(((int)(((java.lang.Integer)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(life5_13)).a(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockLiquid.Q))))))).intValue()))) - 0x1.c71c72p-4f);
    }
        life8_43 = (((float) (((moom.DT)(life4_9)).b() + 1)) - life7_22);
        if ((((moom.DR)(life3_4)).b >= ((double) life8_43))) {
        life6_16 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(life4_9)).a__DT()))))).a__ch();
    }
    }
    return life6_16;
}


public static moom.DR a(net.minecraft.entity.Entity p0, double p1) {
double local3 = (((net.minecraft.entity.Entity)(p0)).k + ((((net.minecraft.entity.Entity)(p0)).n - ((net.minecraft.entity.Entity)(p0)).k) * p1));
    double local5 = (((net.minecraft.entity.Entity)(p0)).l + ((((net.minecraft.entity.Entity)(p0)).o - ((net.minecraft.entity.Entity)(p0)).l) * p1));
    double local7 = (((net.minecraft.entity.Entity)(p0)).m + ((((net.minecraft.entity.Entity)(p0)).p - ((net.minecraft.entity.Entity)(p0)).m) * p1));
    double local9 = (local3 + ((moom.DR)(net.minecraft.client.renderer.ActiveRenderInfo.e)).a);
    double local11 = (local5 + ((moom.DR)(net.minecraft.client.renderer.ActiveRenderInfo.e)).b);
    double local13 = (local7 + ((moom.DR)(net.minecraft.client.renderer.ActiveRenderInfo.e)).c);
    return new moom.DR(local9, local11, local13);
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1802_52(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1802_55(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1802_58(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral10537_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e9aa692f4537_invokedynamic4808_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e9aa692f4537_invokedynamic4808_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e9aa692f4537_invokedynamic4808_7(int a0, long a1) throws E;

private static native float __sourceExactCall_47df7ec8ca7351(int p0);
}
