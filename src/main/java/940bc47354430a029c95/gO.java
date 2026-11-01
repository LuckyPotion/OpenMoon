package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class gO extends net.minecraft.client.gui.GuiScreen {

private final java.lang.String w;

private final net.minecraft.util.IChatComponent x;

private java.util.List<java.lang.String> y;

private final net.minecraft.client.gui.GuiScreen z;

private int A;

private static final long B;

private static final long[] C;

private static final java.lang.Integer[] D;

private static final java.util.Map E;

public gO(net.minecraft.client.gui.GuiScreen p0, java.lang.String p1, net.minecraft.util.IChatComponent p2) {
super();
    this.z = p0;
    this.w = moom.oO.a(p1, new java.lang.Object[0]);
    this.x = p2;
}


static {
B = ((long)(((moom._a)(moom._c.a(((long)(-773189532301616969L)), ((long)(-1250891297852454071L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(170776659654524L)))));
    E = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.gO.B ^ 2680075080565L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1216_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1216_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1216_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1216_14 = new byte[8];
    (__sourceSpill1216_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1216_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1216_16 = __sourceSpill1216_14;
    ((javax.crypto.Cipher)(__sourceSpill1216_11)).init(((int)(__sourceSpill1216_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1216_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1216_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[4];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "¶B[çãûþ\025JÍê=Z"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1216_25 = local6_life21;
        int __sourceSpill1216_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1216_25)).substring(((int)(__sourceSpill1216_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1216_30 = local8_life19;
        int __sourceSpill1216_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1216_33 = new byte[8];
        (__sourceSpill1216_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1216_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1216_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1216_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1216_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1216_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1216_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1216_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1216_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1216_34)).doFinal(((byte[])(__sourceSpill1216_33)));
        (__sourceSpill1216_30)[__sourceSpill1216_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "ø\"ãM\032@ÕÂÝ1aø¾j"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1216_38 = local6_life21;
        int __sourceSpill1216_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1216_38)).substring(((int)(__sourceSpill1216_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1216_43 = local8_life19;
        int __sourceSpill1216_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1216_46 = new byte[8];
        (__sourceSpill1216_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1216_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1216_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1216_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1216_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1216_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1216_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1216_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1216_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1216_47)).doFinal(((byte[])(__sourceSpill1216_46)));
        (__sourceSpill1216_43)[__sourceSpill1216_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    C = ((long[])(local8_life19));
    D = ((java.lang.Integer[])(new java.lang.Integer[4]));
}


public void c__Void() {
long local1 = (moom.gO.B ^ 129968494540239L);
    ((java.util.List)(((moom.gO)(this)).m)).clear();
    this.y = ((java.util.List)(((net.minecraft.client.gui.FontRenderer)(((moom.gO)(this)).p)).a__List(((java.lang.String)(((net.minecraft.util.IChatComponent)(this.x)).c())), ((int)((((moom.gO)(this)).k - __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1452_7(18991, (4813941940739076169L ^ local1))))))));
    this.A = ((int)((((java.util.List)(this.y)).size() * ((net.minecraft.client.gui.FontRenderer)(((moom.gO)(this)).p)).c)));
    ((java.util.List)(((moom.gO)(this)).m)).add(((java.lang.Object)(new moom.gc(0, ((((moom.gO)(this)).k / 2) - __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1452_17(813, (3978834624196294984L ^ local1))), (((((moom.gO)(this)).l / 2) + (this.A / 2)) + ((net.minecraft.client.gui.FontRenderer)(((moom.gO)(this)).p)).c), moom.oO.a(((java.lang.String)("gui.toMenu")), ((java.lang.Object[])(new java.lang.Object[0])))))));
    return;
}


private static java.io.IOException a(java.io.IOException p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 26898;
      if (D[var3] == null) {
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
         long var5 = C[var3];
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
         Object[] var9 = (Object[])E.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               E.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/gO", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         D[var3] = var15;
      }

      return D[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.gO.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral7734_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/gO"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


protected void a(char p0, int p1) throws java.io.IOException {
return;
}


public void a(int p0, int p1, float p2) {
long life4_3;
    int life6_45;
    java.util.Iterator life7_52;
    java.lang.String life8_59;
    life4_3 = (moom.gO.B ^ 82910672810057L);
    ((moom.gO)(this)).i();
    ((moom.gO)(this)).a(((net.minecraft.client.gui.FontRenderer)(((moom.gO)(this)).p)), ((java.lang.String)(this.w)), ((int)((((moom.gO)(this)).k / 2))), ((int)((((((moom.gO)(this)).l / 2) - (this.A / 2)) - (((net.minecraft.client.gui.FontRenderer)(((moom.gO)(this)).p)).c * 2)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic6324_9(10239, (3201424496470726685L ^ life4_3)))));
    life6_45 = ((((moom.gO)(this)).l / 2) - (this.A / 2));
    if ((this.y != null)) {
        life7_52 = ((java.util.List)(this.y)).iterator();
        loop_region_53: while (((java.util.Iterator)(life7_52)).hasNext()) {
        life8_59 = ((java.lang.String)(((java.util.Iterator)(life7_52)).next()));
        ((moom.gO)(this)).a(((net.minecraft.client.gui.FontRenderer)(((moom.gO)(this)).p)), ((java.lang.String)(life8_59)), ((int)((((moom.gO)(this)).k / 2))), ((int)(life6_45)), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic6324_21(24126, (5736908327896801759L ^ life4_3)))));
        life6_45 = (life6_45 + ((net.minecraft.client.gui.FontRenderer)(((moom.gO)(this)).p)).c);
    }
    }
    super.a(((int)(p0)), ((int)(p1)), ((float)(p2)));
    return;
}


protected void a__Void(moom.gc p0) throws java.io.IOException {
if ((((moom.gc)(p0)).l == 0)) {
        ((net.minecraft.client.Minecraft)(((moom.gO)(this)).i)).a(((net.minecraft.client.gui.GuiScreen)(this.z)));
    }
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1452_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1452_17(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral7734_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6324_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6324_21(int a0, long a1) throws E;
}
