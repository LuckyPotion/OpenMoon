package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class gk extends moom.gc {

private float r;

public boolean s;

private net.minecraft.client.settings.GameSettings$Options t;

private float u;

private float v;

private static long x;

private static long[] z;

private static java.lang.Integer[] A;

private static java.util.Map E;

public gk(int p0, int p1, int p2, net.minecraft.client.settings.GameSettings$Options p3) {
this(((int)(p0)), ((int)(p1)), ((int)(p2)), ((net.minecraft.client.settings.GameSettings$Options)(p3)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)));
    return;
}

private static native <E extends Throwable> void __sourceConstructorInit_685f2f93c83acd3f_0(moom.gk a0, int a1, int a2, int a3, int a4, int a5, java.lang.String a6) throws E;

public gk(int p0, int p1, int p2, net.minecraft.client.settings.GameSettings$Options p3, float p4, float p5) { super(0, 0, 0, 0, 0, (java.lang.String)null); }


private static void __sourceConstructorBody_685f2f93c83acd3f(moom.gk receiver, int p0, int p1, int p2, net.minecraft.client.settings.GameSettings$Options p3, float p4, float p5) throws Throwable {

long local7 = (moom.gk.x ^ 14252511627958L);

    moom.gk.__sourceConstructorInit_685f2f93c83acd3f_0(((moom.gk)(receiver)), ((int)(p0)), ((int)(p1)), ((int)(p2)), ((int)(__sourceIntrinsic_685f2f93c83acd3f_originalDynamicSite2777_1(11467, (7684013241487896340L ^ local7)))), ((int)(__sourceIntrinsic_685f2f93c83acd3f_originalDynamicSite2777_2(13202, (8298672002296361032L ^ local7)))), ((java.lang.String)("")));

    ((moom.gk)(receiver)).r = ((float)(0x1.0p0f));

    ((moom.gk)(receiver)).t = ((net.minecraft.client.settings.GameSettings$Options)(p3));

    ((moom.gk)(receiver)).u = ((float)(p4));

    ((moom.gk)(receiver)).v = ((float)(p5));

    net.minecraft.client.Minecraft local9 = net.minecraft.client.Minecraft.a__fM();

    ((moom.gk)(receiver)).r = ((float)(((net.minecraft.client.settings.GameSettings$Options)(p3)).a(((float)(((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(local9)).W)).a(((net.minecraft.client.settings.GameSettings$Options)(p3))))))));

    ((moom.gk)(receiver)).k = ((java.lang.String)(((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(local9)).W)).a__String(((net.minecraft.client.settings.GameSettings$Options)(p3)))));

    return;

}



static {
x = ((long)(((moom._a)(moom._c.a(((long)(-5034562422812542057L)), ((long)(-7818567395546838551L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(200651162143280L)))));
    E = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.gk.x ^ 40681032297908L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1228_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1228_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1228_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1228_14 = new byte[8];
    (__sourceSpill1228_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1228_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1228_16 = __sourceSpill1228_14;
    ((javax.crypto.Cipher)(__sourceSpill1228_11)).init(((int)(__sourceSpill1228_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1228_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1228_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[8];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "j¥â\004L\023¾\036\033Y³îþ±ä\020HG\034û¨~SË÷²v]¹PYåî§\003Ü[~3Ä ¢h"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1228_25 = local6_life21;
        int __sourceSpill1228_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1228_25)).substring(((int)(__sourceSpill1228_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1228_30 = local8_life19;
        int __sourceSpill1228_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1228_33 = new byte[8];
        (__sourceSpill1228_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1228_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1228_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1228_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1228_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1228_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1228_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1228_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1228_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1228_34)).doFinal(((byte[])(__sourceSpill1228_33)));
        (__sourceSpill1228_30)[__sourceSpill1228_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "Ch<^!úõgò:<Ïa¸"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1228_38 = local6_life21;
        int __sourceSpill1228_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1228_38)).substring(((int)(__sourceSpill1228_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1228_43 = local8_life19;
        int __sourceSpill1228_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1228_46 = new byte[8];
        (__sourceSpill1228_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1228_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1228_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1228_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1228_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1228_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1228_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1228_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1228_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1228_47)).doFinal(((byte[])(__sourceSpill1228_46)));
        (__sourceSpill1228_43)[__sourceSpill1228_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    z = ((long[])(local8_life19));
    A = ((java.lang.Integer[])(new java.lang.Integer[8]));
}


protected void b(net.minecraft.client.Minecraft p0, int p1, int p2) {
long life4_3;
    float life6_44;
    life4_3 = (moom.gk.x ^ 102617628360567L);
    if (this.n) {
        if (this.s) {
        this.r = ((float)((((float) (p1 - (this.i + 4))) / ((float) (this.g - __sourceIntrinsic_a66803e36708_invokedynamic6475_5(30009, (1740468304617947936L ^ life4_3)))))));
        this.r = ((float)(moom.Dr.a(((float)(this.r)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)))));
        life6_44 = ((net.minecraft.client.settings.GameSettings$Options)(this.t)).b(((float)(this.r)));
        ((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(p0)).W)).a(((net.minecraft.client.settings.GameSettings$Options)(this.t)), ((float)(life6_44)));
        this.r = ((float)(((net.minecraft.client.settings.GameSettings$Options)(this.t)).a(((float)(life6_44)))));
        this.k = ((java.lang.String)(((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(p0)).W)).a__String(((net.minecraft.client.settings.GameSettings$Options)(this.t)))));
    }
        ((net.minecraft.client.renderer.texture.TextureManager)(((net.minecraft.client.Minecraft)(p0)).a__ok())).a__Void(((moom.DD)(moom.gk.f)));
        moom.kZ.c(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
        ((moom.gk)(this)).b(((int)((this.i + ((int) (this.r * ((float) (this.g - __sourceIntrinsic_a66803e36708_invokedynamic6475_30(24045, (8466259859547876343L ^ life4_3))))))))), ((int)(this.j)), ((int)(0)), ((int)(__sourceIntrinsic_a66803e36708_invokedynamic6475_32(16787, (8395301455444014990L ^ life4_3)))), ((int)(4)), ((int)(__sourceIntrinsic_a66803e36708_invokedynamic6475_33(27117, (6152635697584988145L ^ life4_3)))));
        ((moom.gk)(this)).b(((int)(((this.i + ((int) (this.r * ((float) (this.g - __sourceIntrinsic_a66803e36708_invokedynamic6475_38(24045, (8466259859547876343L ^ life4_3))))))) + 4))), ((int)(this.j)), ((int)(__sourceIntrinsic_a66803e36708_invokedynamic6475_40(19949, (37873566921620469L ^ life4_3)))), ((int)(__sourceIntrinsic_a66803e36708_invokedynamic6475_41(3711, (3074764843319703648L ^ life4_3)))), ((int)(4)), ((int)(__sourceIntrinsic_a66803e36708_invokedynamic6475_42(13202, (8298620726369781129L ^ life4_3)))));
    }
    return;
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


private static int c(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 3524;
      if (A[var3] == null) {
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
         long var5 = z[var3];
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
            throw new RuntimeException("moom/gk", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         A[var3] = var15;
      }

      return A[var3];
}


private static int c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.gk.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral7763_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/gk"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(int p0, int p1) {
this.s = ((boolean)(false));
    return;
}


protected int a(boolean p0) {
return 0;
}


public boolean a__Boolean(net.minecraft.client.Minecraft p0, int p1, int p2) {
long local4 = (moom.gk.x ^ 48259074412191L);
    if (super.a__Boolean(((net.minecraft.client.Minecraft)(p0)), ((int)(p1)), ((int)(p2)))) {
        this.r = ((float)((((float) (p1 - (this.i + 4))) / ((float) (this.g - __sourceIntrinsic_fe3ccd2239af_invokedynamic7764_4(24045, (8466279995819039263L ^ local4)))))));
        this.r = ((float)(moom.Dr.a(((float)(this.r)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)))));
        ((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(p0)).W)).a(((net.minecraft.client.settings.GameSettings$Options)(this.t)), ((float)(((net.minecraft.client.settings.GameSettings$Options)(this.t)).b(((float)(this.r))))));
        this.k = ((java.lang.String)(((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(p0)).W)).a__String(((net.minecraft.client.settings.GameSettings$Options)(this.t)))));
        this.s = ((boolean)(true));
        return true;
    }
    return false;
}


private static native <E extends Throwable> int __sourceIntrinsic_685f2f93c83acd3f_originalDynamicSite2777_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_685f2f93c83acd3f_originalDynamicSite2777_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a66803e36708_invokedynamic6475_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a66803e36708_invokedynamic6475_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a66803e36708_invokedynamic6475_32(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a66803e36708_invokedynamic6475_33(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a66803e36708_invokedynamic6475_38(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a66803e36708_invokedynamic6475_40(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a66803e36708_invokedynamic6475_41(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a66803e36708_invokedynamic6475_42(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral7763_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fe3ccd2239af_invokedynamic7764_4(int a0, long a1) throws E;
}
