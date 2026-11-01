package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
class go extends moom.gc {

private net.minecraft.client.audio.SoundCategory r;

private java.lang.String s;

public float t;

public boolean u;

moom.g4 v;

private static long w;

private static long[] x;

private static java.lang.Integer[] z;

private static java.util.Map A;

public go(moom.g4 p0, int p1, int p2, int p3, net.minecraft.client.audio.SoundCategory p4, boolean p5) { super(0, 0, 0, 0, 0, (java.lang.String)null); }


private static void __sourceConstructorBody_0ca6f0fcd800a9ef(moom.go receiver, moom.g4 p0, int p1, int p2, int p3, net.minecraft.client.audio.SoundCategory p4, boolean p5) throws Throwable {

long local7_life2 = (moom.go.w ^ 25025908088752L);

    ((moom.go)(receiver)).v = ((moom.g4)(p0));

    moom.go.__sourceConstructorInit_0ca6f0fcd800a9ef_0(((moom.go)(receiver)), ((int)(p1)), ((int)(p2)), ((int)(p3)), ((int)((p5 ? __sourceIntrinsic_0ca6f0fcd800a9ef_originalDynamicSite422_5(30150, (434365592913035457L ^ local7_life2)) : __sourceIntrinsic_0ca6f0fcd800a9ef_originalDynamicSite422_7(12373, (4278042061757384016L ^ local7_life2))))), ((int)(__sourceIntrinsic_0ca6f0fcd800a9ef_originalDynamicSite422_9(13983, (741253755320828818L ^ local7_life2)))), ((java.lang.String)("")));

    ((moom.go)(receiver)).t = ((float)(0x1.0p0f));

    ((moom.go)(receiver)).r = ((net.minecraft.client.audio.SoundCategory)(p4));

    ((moom.go)(receiver)).s = ((java.lang.String)(moom.oO.a(((java.lang.String)(__sourceIntrinsic_0ca6f0fcd800a9ef_originalDynamicSite422_14(((net.minecraft.client.audio.SoundCategory)(p4)).a__String()))), ((java.lang.Object[])(new java.lang.Object[0])))));

    ((moom.go)(receiver)).k = ((java.lang.String)(__sourceIntrinsic_0ca6f0fcd800a9ef_originalDynamicSite422_19(((moom.go)(receiver)).s, ((moom.g4)(p0)).a(((net.minecraft.client.audio.SoundCategory)(p4))))));

    ((moom.go)(receiver)).t = ((float)(((net.minecraft.client.settings.GameSettings)(((moom.g4)(p0)).x)).a(((net.minecraft.client.audio.SoundCategory)(p4)))));

    return;

}



static {
w = ((long)(((moom._a)(moom._c.a(((long)(-732251327767509101L)), ((long)(7324781504459218341L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(38050979469252L)))));
    A = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.go.w ^ 85692823322129L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1230_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1230_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1230_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1230_14 = new byte[8];
    (__sourceSpill1230_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1230_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1230_16 = __sourceSpill1230_14;
    ((javax.crypto.Cipher)(__sourceSpill1230_11)).init(((int)(__sourceSpill1230_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1230_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1230_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[9];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "q\032s4b nëÂ¨U\036íZÄ¾ÊúÕ-¤ä$?¸DRn³é¸ÃO]3Y\001\tm&\f²öÇ Ð"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1230_25 = local6_life21;
        int __sourceSpill1230_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1230_25)).substring(((int)(__sourceSpill1230_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1230_30 = local8_life19;
        int __sourceSpill1230_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1230_33 = new byte[8];
        (__sourceSpill1230_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1230_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1230_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1230_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1230_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1230_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1230_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1230_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1230_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1230_34)).doFinal(((byte[])(__sourceSpill1230_33)));
        (__sourceSpill1230_30)[__sourceSpill1230_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "ÚUD¯å\037R#cÍÆÚ@¢\r"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1230_38 = local6_life21;
        int __sourceSpill1230_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1230_38)).substring(((int)(__sourceSpill1230_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1230_43 = local8_life19;
        int __sourceSpill1230_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1230_46 = new byte[8];
        (__sourceSpill1230_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1230_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1230_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1230_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1230_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1230_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1230_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1230_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1230_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1230_47)).doFinal(((byte[])(__sourceSpill1230_46)));
        (__sourceSpill1230_43)[__sourceSpill1230_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    x = ((long[])(local8_life19));
    z = ((java.lang.Integer[])(new java.lang.Integer[9]));
}

private static native <E extends Throwable> void __sourceConstructorInit_0ca6f0fcd800a9ef_0(moom.go a0, int a1, int a2, int a3, int a4, int a5, java.lang.String a6) throws E;

private static moom.Oo b(moom.Oo p0) {
return p0;
}


protected void b(net.minecraft.client.Minecraft p0, int p1, int p2) {
long local4 = (moom.go.w ^ 27340251770693L);
    if (this.n) {
        if (this.u) {
        this.t = ((float)((((float) (p1 - (this.i + 4))) / ((float) (this.g - __sourceIntrinsic_a66803e36708_invokedynamic7767_5(23798, (5229864552045566215L ^ local4)))))));
        this.t = ((float)(moom.Dr.a(((float)(this.t)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)))));
        ((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(p0)).W)).a(((net.minecraft.client.audio.SoundCategory)(this.r)), ((float)(this.t)));
        ((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(p0)).W)).b();
        this.k = ((java.lang.String)(__sourceIntrinsic_a66803e36708_invokedynamic7767_20(this.s, ((moom.g4)(this.v)).a(((net.minecraft.client.audio.SoundCategory)(this.r))))));
    }
        moom.kZ.c(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
        ((moom.go)(this)).b(((int)((this.i + ((int) (this.t * ((float) (this.g - __sourceIntrinsic_a66803e36708_invokedynamic7767_26(23798, (5229864552045566215L ^ local4))))))))), ((int)(this.j)), ((int)(0)), ((int)(__sourceIntrinsic_a66803e36708_invokedynamic7767_28(9138, (1388296047602968132L ^ local4)))), ((int)(4)), ((int)(__sourceIntrinsic_a66803e36708_invokedynamic7767_29(25936, (4102562007989379236L ^ local4)))));
        ((moom.go)(this)).b(((int)(((this.i + ((int) (this.t * ((float) (this.g - __sourceIntrinsic_a66803e36708_invokedynamic7767_34(23798, (5229864552045566215L ^ local4))))))) + 4))), ((int)(this.j)), ((int)(__sourceIntrinsic_a66803e36708_invokedynamic7767_36(6532, (7813594369975065715L ^ local4)))), ((int)(__sourceIntrinsic_a66803e36708_invokedynamic7767_37(5970, (4958279453914534567L ^ local4)))), ((int)(4)), ((int)(__sourceIntrinsic_a66803e36708_invokedynamic7767_38(25936, (4102562007989379236L ^ local4)))));
    }
    return;
}


private static int c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.go.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int c(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 15914;
      if (z[var3] == null) {
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
         long var5 = x[var3];
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
         Object[] var9 = (Object[])A.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               A.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/go", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         z[var3] = var15;
      }

      return z[var3];
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral7768_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/go"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(int p0, int p1) {
float life3_11;
    if (this.u) {
        if ((this.r == net.minecraft.client.audio.SoundCategory.MASTER)) {
        life3_11 = 0x1.0p0f;
    } else {
        ((net.minecraft.client.settings.GameSettings)(((moom.g4)(this.v)).x)).a(((net.minecraft.client.audio.SoundCategory)(this.r)));
    }
        ((net.minecraft.client.audio.SoundHandler)(((net.minecraft.client.Minecraft)(((moom.g4)(this.v)).i)).a__f1())).a(((net.minecraft.client.audio.ISound)(moom.fY.a(((moom.DD)(new moom.DD("gui.button.press"))), ((float)(0x1.0p0f))))));
    }
    this.u = ((boolean)(false));
    return;
}


protected int a(boolean p0) {
return 0;
}


public boolean a__Boolean(net.minecraft.client.Minecraft p0, int p1, int p2) {
long local4 = (moom.go.w ^ 121414737419949L);
    if (super.a__Boolean(((net.minecraft.client.Minecraft)(p0)), ((int)(p1)), ((int)(p2)))) {
        this.t = ((float)((((float) (p1 - (this.i + 4))) / ((float) (this.g - __sourceIntrinsic_fe3ccd2239af_invokedynamic7770_4(15659, (6986441858058996016L ^ local4)))))));
        this.t = ((float)(moom.Dr.a(((float)(this.t)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)))));
        ((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(p0)).W)).a(((net.minecraft.client.audio.SoundCategory)(this.r)), ((float)(this.t)));
        ((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(p0)).W)).b();
        this.k = ((java.lang.String)(__sourceIntrinsic_fe3ccd2239af_invokedynamic7770_19(this.s, ((moom.g4)(this.v)).a(((net.minecraft.client.audio.SoundCategory)(this.r))))));
        this.u = ((boolean)(true));
        return true;
    }
    return false;
}


public void a(net.minecraft.client.audio.SoundHandler p0) {
return;
}


private static native <E extends Throwable> int __sourceIntrinsic_0ca6f0fcd800a9ef_originalDynamicSite422_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0ca6f0fcd800a9ef_originalDynamicSite422_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0ca6f0fcd800a9ef_originalDynamicSite422_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_0ca6f0fcd800a9ef_originalDynamicSite422_14(java.lang.String a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_0ca6f0fcd800a9ef_originalDynamicSite422_19(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fe3ccd2239af_invokedynamic7770_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_fe3ccd2239af_invokedynamic7770_19(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a66803e36708_invokedynamic7767_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a66803e36708_invokedynamic7767_20(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a66803e36708_invokedynamic7767_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a66803e36708_invokedynamic7767_28(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a66803e36708_invokedynamic7767_29(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a66803e36708_invokedynamic7767_34(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a66803e36708_invokedynamic7767_36(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a66803e36708_invokedynamic7767_37(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a66803e36708_invokedynamic7767_38(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral7768_0() throws E;
}
