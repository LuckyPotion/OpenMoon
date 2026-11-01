package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class ji extends moom.iQ {

public moom.jD i;

public moom.jD j;

public moom.jD k;

public moom.jD l;

public moom.jD m;

public moom.jD n;

protected float o;

protected float p;

private static long r;

private static long[] t;

private static java.lang.Integer[] u;

private static java.util.Map v;

public ji(int p0, float p1) { super(); }


private static void __sourceConstructorBody_47a4696181b64910(moom.ji receiver, int p0, float p1) throws Throwable {

long local3 = (moom.ji.r ^ 38025755913714L);

    moom.ji.__sourceConstructorInit_47a4696181b64910_0(((moom.ji)(receiver)));

    ((moom.ji)(receiver)).i = ((moom.jD)(new moom.jD(receiver, 0, 0)));

    ((moom.ji)(receiver)).o = ((float)(0x1.0p3f));

    ((moom.ji)(receiver)).p = ((float)(0x1.0p2f));

    ((moom.jD)(((moom.ji)(receiver)).i)).a(((float)(-0x1.0p2f)), ((float)(-0x1.0p2f)), ((float)(-0x1.0p3f)), ((int)(__sourceIntrinsic_47a4696181b64910_originalDynamicSite2981_6(26942, (7541816829218001915L ^ local3)))), ((int)(__sourceIntrinsic_47a4696181b64910_originalDynamicSite2981_7(15312, (4091117184333562131L ^ local3)))), ((int)(__sourceIntrinsic_47a4696181b64910_originalDynamicSite2981_8(15312, (4091117184333562131L ^ local3)))), ((float)(p1)));

    ((moom.jD)(((moom.ji)(receiver)).i)).a(((float)(0x0.0p0f)), ((float)(((float) (__sourceIntrinsic_47a4696181b64910_originalDynamicSite2981_11(890, (8774381561681541564L ^ local3)) - p0)))), ((float)(-0x1.8p2f)));

    ((moom.ji)(receiver)).j = ((moom.jD)(new moom.jD(receiver, __sourceIntrinsic_47a4696181b64910_originalDynamicSite2981_13(4386, (246170954994609120L ^ local3)), __sourceIntrinsic_47a4696181b64910_originalDynamicSite2981_14(15312, (4091117184333562131L ^ local3)))));

    ((moom.jD)(((moom.ji)(receiver)).j)).a(((float)(-0x1.4p2f)), ((float)(-0x1.4p3f)), ((float)(-0x1.cp2f)), ((int)(__sourceIntrinsic_47a4696181b64910_originalDynamicSite2981_17(18683, (5670148562412286522L ^ local3)))), ((int)(__sourceIntrinsic_47a4696181b64910_originalDynamicSite2981_18(6679, (2072606051749519571L ^ local3)))), ((int)(__sourceIntrinsic_47a4696181b64910_originalDynamicSite2981_19(15312, (4091117184333562131L ^ local3)))), ((float)(p1)));

    ((moom.jD)(((moom.ji)(receiver)).j)).a(((float)(0x0.0p0f)), ((float)(((float) (__sourceIntrinsic_47a4696181b64910_originalDynamicSite2981_22(13685, (5972518625415385019L ^ local3)) - p0)))), ((float)(0x1.0p1f)));

    ((moom.ji)(receiver)).k = ((moom.jD)(new moom.jD(receiver, 0, __sourceIntrinsic_47a4696181b64910_originalDynamicSite2981_24(19883, (6114260174464202596L ^ local3)))));

    ((moom.jD)(((moom.ji)(receiver)).k)).a(((float)(-0x1.0p1f)), ((float)(0x0.0p0f)), ((float)(-0x1.0p1f)), ((int)(4)), ((int)(p0)), ((int)(4)), ((float)(p1)));

    ((moom.jD)(((moom.ji)(receiver)).k)).a(((float)(-0x1.8p1f)), ((float)(((float) (__sourceIntrinsic_47a4696181b64910_originalDynamicSite2981_29(8324, (7736643634650929732L ^ local3)) - p0)))), ((float)(0x1.cp2f)));

    ((moom.ji)(receiver)).l = ((moom.jD)(new moom.jD(receiver, 0, __sourceIntrinsic_47a4696181b64910_originalDynamicSite2981_31(19883, (6114260174464202596L ^ local3)))));

    ((moom.jD)(((moom.ji)(receiver)).l)).a(((float)(-0x1.0p1f)), ((float)(0x0.0p0f)), ((float)(-0x1.0p1f)), ((int)(4)), ((int)(p0)), ((int)(4)), ((float)(p1)));

    ((moom.jD)(((moom.ji)(receiver)).l)).a(((float)(0x1.8p1f)), ((float)(((float) (__sourceIntrinsic_47a4696181b64910_originalDynamicSite2981_36(14444, (5350295335500890795L ^ local3)) - p0)))), ((float)(0x1.cp2f)));

    ((moom.ji)(receiver)).m = ((moom.jD)(new moom.jD(receiver, 0, __sourceIntrinsic_47a4696181b64910_originalDynamicSite2981_38(19883, (6114260174464202596L ^ local3)))));

    ((moom.jD)(((moom.ji)(receiver)).m)).a(((float)(-0x1.0p1f)), ((float)(0x0.0p0f)), ((float)(-0x1.0p1f)), ((int)(4)), ((int)(p0)), ((int)(4)), ((float)(p1)));

    ((moom.jD)(((moom.ji)(receiver)).m)).a(((float)(-0x1.8p1f)), ((float)(((float) (__sourceIntrinsic_47a4696181b64910_originalDynamicSite2981_43(14444, (5350295335500890795L ^ local3)) - p0)))), ((float)(-0x1.4p2f)));

    ((moom.ji)(receiver)).n = ((moom.jD)(new moom.jD(receiver, 0, __sourceIntrinsic_47a4696181b64910_originalDynamicSite2981_45(19883, (6114260174464202596L ^ local3)))));

    ((moom.jD)(((moom.ji)(receiver)).n)).a(((float)(-0x1.0p1f)), ((float)(0x0.0p0f)), ((float)(-0x1.0p1f)), ((int)(4)), ((int)(p0)), ((int)(4)), ((float)(p1)));

    ((moom.jD)(((moom.ji)(receiver)).n)).a(((float)(0x1.8p1f)), ((float)(((float) (__sourceIntrinsic_47a4696181b64910_originalDynamicSite2981_50(14444, (5350295335500890795L ^ local3)) - p0)))), ((float)(-0x1.4p2f)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_47a4696181b64910_0(moom.ji a0) throws E;

static {
r = ((long)(((moom._a)(moom._c.a(((long)(7607653428836706408L)), ((long)(-4680759535964986735L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(135207743622991L)))));
    v = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.ji.r ^ 67267325418689L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1336_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1336_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1336_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1336_14 = new byte[8];
    (__sourceSpill1336_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1336_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1336_16 = __sourceSpill1336_14;
    ((javax.crypto.Cipher)(__sourceSpill1336_11)).init(((int)(__sourceSpill1336_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1336_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1336_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[10];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "zk\"Öû\023\034Í¤\036I\022.÷\023yV\n?\024Ý\013±Q@ô \024Ì &Åb0\016ÛÔæ¢+\036¯ºq$ \032ët\025\016d\0041Û6"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1336_25 = local6_life21;
        int __sourceSpill1336_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1336_25)).substring(((int)(__sourceSpill1336_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1336_30 = local8_life19;
        int __sourceSpill1336_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1336_33 = new byte[8];
        (__sourceSpill1336_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1336_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1336_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1336_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1336_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1336_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1336_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1336_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1336_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1336_34)).doFinal(((byte[])(__sourceSpill1336_33)));
        (__sourceSpill1336_30)[__sourceSpill1336_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "Ñö\026\005OÕÆÙÅ®V;B\\\"E"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1336_38 = local6_life21;
        int __sourceSpill1336_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1336_38)).substring(((int)(__sourceSpill1336_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1336_43 = local8_life19;
        int __sourceSpill1336_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1336_46 = new byte[8];
        (__sourceSpill1336_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1336_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1336_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1336_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1336_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1336_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1336_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1336_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1336_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1336_47)).doFinal(((byte[])(__sourceSpill1336_46)));
        (__sourceSpill1336_43)[__sourceSpill1336_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    t = ((long[])(local8_life19));
    u = ((java.lang.Integer[])(new java.lang.Integer[10]));
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8173_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/ji"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 10517;
      if (u[var3] == null) {
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
         long var5 = t[var3];
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
         Object[] var9 = (Object[])v.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               v.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/ji", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         u[var3] = var15;
      }

      return u[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.ji.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public void a(float p0, float p1, float p2, float p3, float p4, float p5, net.minecraft.entity.Entity p6) {
float local8 = 0x1.ca5dcp5f;
    ((moom.jD)(this.i)).h = ((float)((p4 / 0x1.ca5dcp5f)));
    ((moom.jD)(this.i)).i = ((float)((p3 / 0x1.ca5dcp5f)));
    ((moom.jD)(this.j)).h = ((float)(0x1.921fb6p0f));
    ((moom.jD)(this.k)).h = ((float)(((moom.Dr.b(((float)((p0 * 0x1.55182ap-1f)))) * 0x1.666666p0f) * p1)));
    ((moom.jD)(this.l)).h = ((float)(((moom.Dr.b(((float)(((p0 * 0x1.55182ap-1f) + 0x1.921fb6p1f)))) * 0x1.666666p0f) * p1)));
    ((moom.jD)(this.m)).h = ((float)(((moom.Dr.b(((float)(((p0 * 0x1.55182ap-1f) + 0x1.921fb6p1f)))) * 0x1.666666p0f) * p1)));
    ((moom.jD)(this.n)).h = ((float)(((moom.Dr.b(((float)((p0 * 0x1.55182ap-1f)))) * 0x1.666666p0f) * p1)));
    return;
}


public void a(net.minecraft.entity.Entity p0, float p1, float p2, float p3, float p4, float p5, float p6) {
moom.ji forwardValue3696_99_0;
    net.minecraft.entity.Entity[] spill3696_0;
    moom.ji spill3696_1;
    long life8_3;
    net.minecraft.entity.Entity[] life10_14;
    float life11_24;
    forward_join_102: {
    forward_join_99: {
    forward_join_78: {
    life8_3 = (moom.ji.r ^ 132651509630875L);
    spill3696_0 = moom.iQ.b();
    ((moom.ji)(this)).a(((float)(p1)), ((float)(p2)), ((float)(p3)), ((float)(p4)), ((float)(p5)), ((float)(p6)), ((net.minecraft.entity.Entity)(p0)));
    life10_14 = spill3696_0;
    spill3696_1 = this;
    if (!((life10_14 != null))) {
        forwardValue3696_99_0 = spill3696_1;
        break forward_join_99;
    }
    if (!(((moom.ji)(spill3696_1)).c)) {
        break forward_join_78;
    }
    life11_24 = 0x1.0p1f;
    moom.kZ.B();
    moom.kZ.b(((float)(0x0.0p0f)), ((float)((this.o * p6))), ((float)((this.p * p6))));
    ((moom.jD)(this.i)).a(((float)(p6)));
    moom.kZ.C();
    moom.kZ.B();
    moom.kZ.a(((float)((0x1.0p0f / life11_24))), ((float)((0x1.0p0f / life11_24))), ((float)((0x1.0p0f / life11_24))));
    moom.kZ.b(((float)(0x0.0p0f)), ((float)((0x1.8p4f * p6))), ((float)(0x0.0p0f)));
    ((moom.jD)(this.j)).a(((float)(p6)));
    ((moom.jD)(this.k)).a(((float)(p6)));
    ((moom.jD)(this.l)).a(((float)(p6)));
    ((moom.jD)(this.m)).a(((float)(p6)));
    ((moom.jD)(this.n)).a(((float)(p6)));
    moom.kZ.C();
    if (!((life10_14 == null))) {
        break forward_join_102;
    }
    }
    ((moom.jD)(this.i)).a(((float)(p6)));
    ((moom.jD)(this.j)).a(((float)(p6)));
    ((moom.jD)(this.k)).a(((float)(p6)));
    ((moom.jD)(this.l)).a(((float)(p6)));
    ((moom.jD)(this.m)).a(((float)(p6)));
    forwardValue3696_99_0 = this;
    }
    ((moom.jD)(((moom.ji)(forwardValue3696_99_0)).n)).a(((float)(p6)));
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static native <E extends Throwable> int __sourceIntrinsic_47a4696181b64910_originalDynamicSite2981_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_47a4696181b64910_originalDynamicSite2981_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_47a4696181b64910_originalDynamicSite2981_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_47a4696181b64910_originalDynamicSite2981_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_47a4696181b64910_originalDynamicSite2981_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_47a4696181b64910_originalDynamicSite2981_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_47a4696181b64910_originalDynamicSite2981_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_47a4696181b64910_originalDynamicSite2981_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_47a4696181b64910_originalDynamicSite2981_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_47a4696181b64910_originalDynamicSite2981_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_47a4696181b64910_originalDynamicSite2981_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_47a4696181b64910_originalDynamicSite2981_29(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_47a4696181b64910_originalDynamicSite2981_31(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_47a4696181b64910_originalDynamicSite2981_36(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_47a4696181b64910_originalDynamicSite2981_38(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_47a4696181b64910_originalDynamicSite2981_43(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_47a4696181b64910_originalDynamicSite2981_45(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_47a4696181b64910_originalDynamicSite2981_50(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8173_0() throws E;
}
