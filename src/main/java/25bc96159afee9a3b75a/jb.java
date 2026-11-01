package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class jb {

private final java.util.Map<java.lang.Integer, com.moon.i_> a;

private static final long b;

private static final long[] c;

private static final java.lang.Integer[] d;

private static final java.util.Map e;

public jb(java.lang.String p0, float p1, com.moon.cc p2) {
super();
    this.a = new java.util.HashMap();
    (this).a(p0, p1, p2);
}


static {
b = ((long)(((moom._a)(moom._c.a(((long)(4445730849207973252L)), ((long)(-4511497600343999716L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(231999017745245L)))));
    e = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.jb.b ^ 25533645370365L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill196_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill196_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill196_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill196_14 = new byte[8];
    (__sourceSpill196_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill196_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation196_16 = __sourceSpill196_14;
    ((javax.crypto.Cipher)(__sourceSpill196_11)).init(((int)(__sourceSpill196_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill196_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation196_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "¥iËÍ/hR\f:$iè¢"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill196_25 = local6_life21;
        int __sourceSpill196_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill196_25)).substring(((int)(__sourceSpill196_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill196_30 = local8_life19;
        int __sourceSpill196_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill196_33 = new byte[8];
        (__sourceSpill196_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill196_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill196_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill196_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill196_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill196_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill196_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill196_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill196_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill196_34)).doFinal(((byte[])(__sourceSpill196_33)));
        (__sourceSpill196_30)[__sourceSpill196_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    c = ((long[])(local8_life19));
    d = ((java.lang.Integer[])(new java.lang.Integer[2]));
}


public void b(org.lwjgl.util.vector.Matrix4f p0) {
((com.moon.i_)(this.a(((int)(((com.moon.jb)(this)).a__Int()))))).b(((org.lwjgl.util.vector.Matrix4f)(p0)));
    return;
}


public void b(com.moon.hW p0, java.lang.String p1, float p2, float p3, int p4) {
long local6 = (com.moon.jb.b ^ 33696058401464L);
    net.minecraft.entity.Entity[] spill1677_0 = com.moon.je.b();
    ((com.moon.i_)(this.a(((int)(((com.moon.jb)(this)).a__Int()))))).a(((com.moon.hW)(p0)), ((java.lang.String)(p1)), ((float)((p2 + 0x1.0p-1f))), ((float)((p3 + 0x1.0p-1f))), ((int)(__sourceIntrinsic_0fc9b787c557_invokedynamic1677_4(14616, (5743678373015257168L ^ local6)))), ((boolean)(true)));
    net.minecraft.entity.Entity[] local8 = spill1677_0;
    ((com.moon.i_)(this.a(((int)(((com.moon.jb)(this)).a__Int()))))).a(((com.moon.hW)(p0)), ((java.lang.String)(p1)), ((float)(p2)), ((float)(p3)), ((int)(p4)), ((boolean)(false)));
    if ((net.minecraft.entity.Entity.b__ArrayString() != null)) {
        com.moon.je.b(((net.minecraft.entity.Entity[])(new net.minecraft.entity.Entity[2])));
    }
    return;
}


private com.moon.i_ a(int p0) {
return ((com.moon.i_)(((java.util.Map)(this.a)).get(((java.lang.Object)(java.lang.Integer.valueOf(((int)(p0))))))));
}


private int a__Int() {
return ((moom.ir)(com.moon.nS.a())).c();
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral1955_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/jb"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.jb.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 1418;
      if (d[var3] == null) {
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
         long var5 = c[var3];
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
         Object[] var9 = (Object[])e.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               e.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/moon/jb", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         d[var3] = var15;
      }

      return d[var3];
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private void a(java.lang.String p0, float p1, com.moon.cc p2) {
net.minecraft.entity.Entity[] spill124_0;
    long life4_3;
    int life7_6;
    net.minecraft.entity.Entity[] life6_7;
    lexical_join_31: {
    life4_3 = (com.moon.jb.b ^ 16530393925424L);
    spill124_0 = com.moon.je.b();
    life7_6 = 1;
    life6_7 = spill124_0;
    lexical_cycle_8: while (true) {
    if (!((life7_6 < __sourceIntrinsic_c73b12041d88_invokedynamic124_2(29467, (5995406614465228762L ^ life4_3))))) {
        break lexical_join_31;
    }
    ((java.util.Map)(this.a)).put(((java.lang.Object)(java.lang.Integer.valueOf(((int)(life7_6))))), ((java.lang.Object)(((com.moon.jc)(com.moon.jc.a(((java.lang.String)(p0)), ((float)(p1)), ((float)(((float) life7_6)))))).a(((com.moon.cc)(p2))))));
    life7_6 += 1;
    if (!((life6_7 != null))) { continue lexical_cycle_8; }
    break lexical_cycle_8;
    }
    }
    return;
}


public void a(com.moon.hW p0, java.lang.String p1, float p2, float p3, int p4) {
((com.moon.i_)(this.a(((int)(((com.moon.jb)(this)).a__Int()))))).a(((com.moon.hW)(p0)), ((java.lang.String)(p1)), ((float)(p2)), ((float)(p3)), ((int)(p4)), ((boolean)(false)));
    return;
}


public void a(com.moon.hW p0, java.lang.String p1, float p2, float p3, float p4, int p5) {
long life7_3;
    float life5_9;
    com.moon.i_ life10_14;
    net.minecraft.entity.Entity[] life9_112;
    life7_3 = (com.moon.jb.b ^ 110784987099567L);
    life5_9 = (p4 / ((float) ((com.moon.jb)(this)).a__Int()));
    life10_14 = this.a(((int)(((com.moon.jb)(this)).a__Int())));
    ((com.moon.i_)(life10_14)).a(((com.moon.hW)(p0)), ((java.lang.String)(p1)), ((float)((p2 - life5_9))), ((float)((p3 - life5_9))), ((int)(((java.awt.Color)(java.awt.Color.BLACK)).getRGB())), ((boolean)(true)));
    ((com.moon.i_)(life10_14)).a(((com.moon.hW)(p0)), ((java.lang.String)(p1)), ((float)((p2 + life5_9))), ((float)((p3 + life5_9))), ((int)(((java.awt.Color)(java.awt.Color.BLACK)).getRGB())), ((boolean)(true)));
    ((com.moon.i_)(life10_14)).a(((com.moon.hW)(p0)), ((java.lang.String)(p1)), ((float)((p2 + life5_9))), ((float)((p3 - life5_9))), ((int)(((java.awt.Color)(java.awt.Color.BLACK)).getRGB())), ((boolean)(true)));
    net.minecraft.entity.Entity[] spill1659_0 = com.moon.je.b();
    ((com.moon.i_)(life10_14)).a(((com.moon.hW)(p0)), ((java.lang.String)(p1)), ((float)((p2 - life5_9))), ((float)((p3 + life5_9))), ((int)(((java.awt.Color)(java.awt.Color.BLACK)).getRGB())), ((boolean)(true)));
    ((com.moon.i_)(life10_14)).a(((com.moon.hW)(p0)), ((java.lang.String)(p1)), ((float)(p2)), ((float)((p3 - life5_9))), ((int)(((java.awt.Color)(java.awt.Color.BLACK)).getRGB())), ((boolean)(true)));
    ((com.moon.i_)(life10_14)).a(((com.moon.hW)(p0)), ((java.lang.String)(p1)), ((float)(p2)), ((float)((p3 + life5_9))), ((int)(((java.awt.Color)(java.awt.Color.BLACK)).getRGB())), ((boolean)(true)));
    ((com.moon.i_)(life10_14)).a(((com.moon.hW)(p0)), ((java.lang.String)(p1)), ((float)((p2 - life5_9))), ((float)(p3)), ((int)(((java.awt.Color)(java.awt.Color.BLACK)).getRGB())), ((boolean)(true)));
    ((com.moon.i_)(life10_14)).a(((com.moon.hW)(p0)), ((java.lang.String)(p1)), ((float)((p2 + life5_9))), ((float)(p3)), ((int)(((java.awt.Color)(java.awt.Color.BLACK)).getRGB())), ((boolean)(true)));
    life9_112 = spill1659_0;
    ((com.moon.i_)(life10_14)).a(((com.moon.hW)(p0)), ((java.lang.String)(p1)), ((float)(p2)), ((float)(p3)), ((int)(p5)), ((boolean)(false)));
    if ((life9_112 != null)) {
        net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[1])));
    }
    return;
}


public void a(org.lwjgl.util.vector.Matrix4f p0) {
((com.moon.i_)(this.a(((int)(((com.moon.jb)(this)).a__Int()))))).a(((org.lwjgl.util.vector.Matrix4f)(p0)));
    return;
}


public float a(java.lang.String p0) {
return (((com.moon.i_)(this.a(((int)(((com.moon.jb)(this)).a__Int()))))).a(((java.lang.String)(p0))) / ((float) ((com.moon.jb)(this)).a__Int()));
}


public float a() {
return (((com.moon.i_)(this.a(((int)(((com.moon.jb)(this)).a__Int()))))).a() / ((float) ((com.moon.jb)(this)).a__Int()));
}


private static native <E extends Throwable> int __sourceIntrinsic_c73b12041d88_invokedynamic124_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral1955_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0fc9b787c557_invokedynamic1677_4(int a0, long a1) throws E;
}
