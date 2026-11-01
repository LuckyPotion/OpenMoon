package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class g3 extends com.moon.gZ {

private static net.minecraft.client.Minecraft c;

private com.moon.iu d;

private com.moon.iu e;

private com.moon.iu f;

private float[] g;

private com.moon.gX h;

private com.moon.g1 i;

private int j;

private int k;

private com.moon.hW l;

private com.moon.hW m;

private com.moon.hW n;

private static long p;

private static long[] t;

private static java.lang.Integer[] u;

private static java.util.Map v;

public g3(com.moon.module.impl.ESP p0, com.moon.g1 p1) { super((com.moon.module.impl.ESP)null); }


private static void __sourceConstructorBody_10fce845935348e3(com.moon.g3 receiver, com.moon.module.impl.ESP p0, com.moon.g1 p1) throws Throwable {

long local3 = (com.moon.g3.p ^ 104860594211129L);

    com.moon.g3.__sourceConstructorInit_10fce845935348e3_0(((com.moon.g3)(receiver)), ((com.moon.module.impl.ESP)(p0)));

    ((com.moon.g3)(receiver)).d = ((com.moon.iu)(new com.moon.iu(1, 1, false)));

    ((com.moon.g3)(receiver)).e = ((com.moon.iu)(new com.moon.iu(1, 1, false)));

    ((com.moon.g3)(receiver)).f = ((com.moon.iu)(new com.moon.iu(1, 1, false)));

    ((com.moon.g3)(receiver)).g = ((float[])(new float[__sourceIntrinsic_10fce845935348e3_originalDynamicSite868_5(16962, (680328639039145279L ^ local3))]));

    ((com.moon.g3)(receiver)).h = ((com.moon.gX)(new com.moon.gX()));

    ((com.moon.g3)(receiver)).i = ((com.moon.g1)(p1));

    java.util.Arrays.fill(((float[])(((com.moon.g3)(receiver)).g)), ((float)(0x1.0p0f)));

    return;

}



static {
p = ((long)(((moom._a)(moom._c.a(((long)(-3760277418794523420L)), ((long)(-6927244975220342979L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(209853777008603L)))));
    v = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.g3.p ^ 31065860558167L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill194_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill194_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill194_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill194_14 = new byte[8];
    (__sourceSpill194_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill194_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation194_16 = __sourceSpill194_14;
    ((javax.crypto.Cipher)(__sourceSpill194_11)).init(((int)(__sourceSpill194_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill194_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation194_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[14];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "Ñk*J'Æ\b8\023ÞL]\035*\002û<3\036ä¿\005ÌWèîáE*à;\003}­À<ÖV\tÀ>­]\027¿ømx\\\027Ê\026 ]}È\"w@òº\\®\030ñÞ×S{\rùî\023:M\026æÌî.@u4"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill194_25 = local6_life21;
        int __sourceSpill194_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill194_25)).substring(((int)(__sourceSpill194_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill194_30 = local8_life19;
        int __sourceSpill194_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill194_33 = new byte[8];
        (__sourceSpill194_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill194_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill194_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill194_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill194_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill194_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill194_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill194_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill194_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill194_34)).doFinal(((byte[])(__sourceSpill194_33)));
        (__sourceSpill194_30)[__sourceSpill194_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "Å¸¤mÏ#'\023×\006¢\024@"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill194_38 = local6_life21;
        int __sourceSpill194_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill194_38)).substring(((int)(__sourceSpill194_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill194_43 = local8_life19;
        int __sourceSpill194_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill194_46 = new byte[8];
        (__sourceSpill194_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill194_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill194_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill194_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill194_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill194_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill194_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill194_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill194_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill194_47)).doFinal(((byte[])(__sourceSpill194_46)));
        (__sourceSpill194_43)[__sourceSpill194_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    t = ((long[])(local8_life19));
    u = ((java.lang.Integer[])(new java.lang.Integer[14]));
    c = ((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM()));
}

private static native <E extends Throwable> void __sourceConstructorInit_10fce845935348e3_0(com.moon.g3 a0, com.moon.module.impl.ESP a1) throws E;

public int b() {
return this.k;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral1186_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/g3"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public com.moon.iu b__iu() {
return this.e;
}


public com.moon.hW b__hW() {
return this.m;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 30483;
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
            throw new RuntimeException("com/moon/g3", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         u[var3] = var15;
      }

      return u[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.g3.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public void b(com.moon.iu p0) {
long life2_3;
    int life4_14;
    com.moon.iw life6_25;
    com.moon.iK life5_36;
    life2_3 = (com.moon.g3.p ^ 123377836113128L);
    moom.kZ.u();
    org.lwjgl.opengl.GL13.glActiveTexture(((int)(__sourceIntrinsic_52698f6522d0_invokedynamic216_2(30426, (8564987537691706490L ^ life2_3)))));
    int spill216_0 = moom.sK.s();
    ((com.moon.iu)(p0)).c();
    life4_14 = spill216_0;
    ((com.moon.iu)(this.e)).a(((boolean)(false)));
    ((com.moon.iu)(this.e)).e();
    life6_25 = ((com.moon.hW)(this.n)).a__iw();
    if ((life4_14 == 0)) {
        if ((((life6_25 instanceof com.moon.iK) ? 1 : 0) != 0)) {
        life5_36 = ((com.moon.iK)(life6_25));
        int spill216_1 = 32138;
        ((com.moon.jD)(((com.moon.iK)(life5_36)).a__jD())).a__Void();
        org.lwjgl.opengl.GL13.glActiveTexture(((int)(__sourceIntrinsic_52698f6522d0_invokedynamic216_16(spill216_1, (1568741628196523811L ^ life2_3)))));
        moom.kZ.i(((int)(((com.moon.iu)(p0)).g)));
        ((com.moon.jE)(((com.moon.iK)(life5_36)).c())).a__Void(((int)(0)));
    }
        ((com.moon.hW)(this.n)).b();
    }
    return;
}


public void b__Void() {
((com.moon.g3)(this)).a(((com.moon.iu)(((com.moon.g1)(this.i)).a__sourceReturn_5e9ab4bfb0())));
    return;
}


public com.moon.hW c() {
return this.n;
}


public void c__Void() {
return;
}


public com.moon.iu c__iu() {
return this.f;
}


public void c(com.moon.iu p0) {
com.moon.iw lexicalValue40_57_0;
    com.moon.iu lexicalValue40_106_0;
    int lexicalValue40_121_0;
    int lexicalValue40_253_0;
    int spill40_0;
    com.moon.iw spill40_1;
    int spill40_2;
    int spill40_3;
    com.moon.iu spill40_4;
    int spill40_5;
    int spill40_6;
    int spill40_7;
    int spill40_8;
    int spill40_9;
    long life2_3;
    float life5_11;
    float life6_21;
    int life7_35;
    int life9_37;
    int life4_38;
    com.moon.iw life11_48;
    com.moon.iK life10_64;
    com.moon.iu life8_112;
    com.moon.iw life10_141;
    com.moon.iI life9_152;
    lexical_join_259: {
    lexical_join_253: {
    lexical_join_227: {
    lexical_join_121: {
    lexical_join_120: {
    life2_3 = (com.moon.g3.p ^ 111056040257183L);
    life5_11 = ((float) ((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.IntegerSetting)(((com.moon.module.impl.ESP)(((com.moon.g3)(this)).a())).c__k1())).getValue())))).intValue());
    life6_21 = (((float) (((double) life5_11) - java.lang.Math.log(((double)(((double) life5_11)))))) / 0x1.99999ap0f);
    spill40_0 = __sourceExactCall_6acc809fc8fdc0();
    life7_35 = java.lang.Math.min(((int)(java.lang.Math.max(((int)(((int) java.lang.Math.ceil(((double)((java.lang.Math.log(((double)(((double) life5_11)))) / java.lang.Math.log(((double)(0x1.0p1d)))))))))), ((int)(1))))), ((int)(5)));
    life9_37 = life7_35;
    life4_38 = spill40_0;
    lexical_cycle_39: while (true) {
    lexical_join_106: {
    lexical_join_104: {
    lexical_join_57: {
    if (!((life9_37 >= 0))) {
        break lexical_join_120;
    }
    ((com.moon.iu)(this.f)).a(((boolean)(false)));
    life11_48 = ((com.moon.hW)(this.l)).a__iw();
    spill40_1 = life11_48;
    if (!((life4_38 != 0))) {
        lexicalValue40_57_0 = spill40_1;
        break lexical_join_57;
    }
    spill40_2 = ((spill40_1 instanceof com.moon.iK) ? 1 : 0);
    if (!((life4_38 != 0))) {
        lexicalValue40_121_0 = spill40_2;
        break lexical_join_121;
    }
    if (!((spill40_2 != 0))) {
        break lexical_join_104;
    }
    lexicalValue40_57_0 = life11_48;
    }
    life10_64 = ((com.moon.iK)(lexicalValue40_57_0));
    spill40_3 = 32138;
    ((com.moon.jD)(((com.moon.iK)(life10_64)).a__jD())).a__Void();
    org.lwjgl.opengl.GL13.glActiveTexture(((int)(__sourceIntrinsic_b083ce8177a1_invokedynamic40_21(spill40_3, (1568764516509537620L ^ life2_3)))));
    spill40_4 = this.e;
    if (!((life4_38 != 0))) {
        lexicalValue40_106_0 = spill40_4;
        break lexical_join_106;
    }
    moom.kZ.i(((int)(((com.moon.iu)(spill40_4)).g)));
    ((com.moon.jE)(((com.moon.iK)(life10_64)).c())).a__Void(((int)(0)));
    ((com.moon.jE)(((com.moon.iK)(life10_64)).e())).a(((float)(life6_21)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)));
    ((com.moon.jE)(((com.moon.iK)(life10_64)).g())).a(((float)(((float) ((net.minecraft.client.Minecraft)(com.moon.g3.c)).G))), ((float)(((float) ((net.minecraft.client.Minecraft)(com.moon.g3.c)).H))));
    life6_21 = (life6_21 / 0x1.0p1f);
    if (!((recovery.source.CarrierOps.fcmpg(((float)(life6_21)), ((float)(0x1.0p0f))) < 0))) {
        break lexical_join_104;
    }
    life6_21 = 0x1.0p0f;
    }
    lexicalValue40_106_0 = this.e;
    }
    life8_112 = lexicalValue40_106_0;
    this.e = ((com.moon.iu)(this.f));
    this.f = ((com.moon.iu)(life8_112));
    ((com.moon.hW)(this.l)).b();
    life9_37 += -1;
    if (!((life4_38 == 0))) { continue lexical_cycle_39; }
    break lexical_cycle_39;
    }
    }
    lexicalValue40_121_0 = 1;
    }
    moom.kZ.a(((int)(lexicalValue40_121_0)), ((int)(0)), ((int)(1)), ((int)(0)));
    ((com.moon.iu)(this.d)).a(((boolean)(false)));
    ((com.moon.iu)(this.d)).e();
    life10_141 = ((com.moon.hW)(this.m)).a__iw();
    spill40_5 = ((life10_141 instanceof com.moon.iI) ? 1 : 0);
    if (!((life4_38 != 0))) {
        lexicalValue40_253_0 = spill40_5;
        break lexical_join_253;
    }
    if (!((spill40_5 != 0))) {
        break lexical_join_227;
    }
    life9_152 = ((com.moon.iI)(life10_141));
    spill40_6 = 23439;
    ((com.moon.jD)(((com.moon.iI)(life9_152)).a__jD())).a__Void();
    org.lwjgl.opengl.GL13.glActiveTexture(((int)(__sourceIntrinsic_b083ce8177a1_invokedynamic40_54(spill40_6, (8722417306892989266L ^ life2_3)))));
    ((com.moon.jE)(((com.moon.iI)(life9_152)).d__sourceReturn_2220af9394())).a__Void(((int)(__sourceIntrinsic_b083ce8177a1_invokedynamic40_57(32351, (6772899728617985677L ^ life2_3)))));
    spill40_7 = 32138;
    moom.kZ.i(((int)(((com.moon.iu)(this.e)).g)));
    org.lwjgl.opengl.GL13.glActiveTexture(((int)(__sourceIntrinsic_b083ce8177a1_invokedynamic40_62(spill40_7, (1568764516509537620L ^ life2_3)))));
    ((com.moon.jE)(((com.moon.iI)(life9_152)).c())).a__Void(((int)(0)));
    moom.kZ.i(((int)(((com.moon.iu)(p0)).g)));
    ((com.moon.jE)(((com.moon.iI)(life9_152)).f())).a(((float)((0x1.0p0f / ((float) ((net.minecraft.client.Minecraft)(com.moon.g3.c)).G)))), ((float)((0x1.0p0f / ((float) ((net.minecraft.client.Minecraft)(com.moon.g3.c)).H)))));
    ((com.moon.jE)(((com.moon.iI)(life9_152)).h())).a(((float)(life5_11)));
    ((com.moon.jE)(((com.moon.iI)(life9_152)).e())).a(((float[])(this.g)));
    ((com.moon.jE)(((com.moon.iI)(life9_152)).i())).a(((float)(((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(((com.moon.module.impl.ESP)(((com.moon.g3)(this)).a())).d__kZ())).getValue())))).floatValue())));
    ((com.moon.jE)(((com.moon.iI)(life9_152)).j())).a(((float)(((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(((com.moon.module.impl.ESP)(((com.moon.g3)(this)).a())).e__kZ())).getValue())))).floatValue())));
    ((com.moon.jE)(((com.moon.iI)(life9_152)).k())).a(((float)(((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(((com.moon.module.impl.ESP)(((com.moon.g3)(this)).a())).f__kZ())).getValue())))).floatValue())));
    }
    ((com.moon.hW)(this.m)).b();
    org.lwjgl.opengl.GL13.glActiveTexture(((int)(__sourceIntrinsic_b083ce8177a1_invokedynamic40_102(13349, (2420454427806932213L ^ life2_3)))));
    spill40_8 = 1908;
    moom.kZ.i(((int)(0)));
    org.lwjgl.opengl.GL13.glActiveTexture(((int)(__sourceIntrinsic_b083ce8177a1_invokedynamic40_105(spill40_8, (2673996535836520359L ^ life2_3)))));
    spill40_9 = 32138;
    moom.kZ.i(((int)(0)));
    org.lwjgl.opengl.GL13.glActiveTexture(((int)(__sourceIntrinsic_b083ce8177a1_invokedynamic40_108(spill40_9, (1568764516509537620L ^ life2_3)))));
    lexicalValue40_253_0 = 0;
    }
    moom.kZ.i(((int)(lexicalValue40_253_0)));
    if (!((net.minecraft.entity.Entity.b__ArrayString() != null))) {
        break lexical_join_259;
    }
    life4_38 += 1;
    moom.sK.m(((int)(life4_38)));
    }
    return;
}


public boolean a__Boolean() {
return ((1) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public com.moon.gX a__gX() {
return this.h;
}


public void a__Void() {
long life1_3;
    moom.ir life4_5;
    double life5_8;
    double life7_11;
    double life9_13;
    double life11_15;
    double life13_17;
    double life15_19;
    double life17_21;
    double life19_23;
    net.minecraft.client.renderer.Tessellator life21_48;
    moom.lw life22_51;
    int life3_105;
    life1_3 = (com.moon.g3.p ^ 6654072740481L);
    life4_5 = com.moon.nS.a();
    life5_8 = ((moom.ir)(life4_5)).a();
    life7_11 = ((moom.ir)(life4_5)).b();
    life9_13 = 0x0.0p0d;
    life11_15 = 0x0.0p0d;
    life13_17 = 0x0.0p0d;
    life15_19 = 0x1.0p0d;
    life17_21 = 0x1.0p0d;
    life19_23 = 0x0.0p0d;
    moom.kZ.l();
    moom.kZ.d__Void();
    moom.kZ.u();
    moom.kZ.a(((int)(__sourceIntrinsic_b82a5b29b709_invokedynamic1052_7(6299, (9132790964046400601L ^ life1_3)))), ((float)(0x0.0p0f)));
    moom.kZ.a(((int)(__sourceIntrinsic_b82a5b29b709_invokedynamic1052_9(2524, (6879422512997113112L ^ life1_3)))), ((int)(__sourceIntrinsic_b82a5b29b709_invokedynamic1052_10(30276, (5957737619469787779L ^ life1_3)))), ((int)(1)), ((int)(0)));
    life21_48 = net.minecraft.client.renderer.Tessellator.a();
    life22_51 = ((net.minecraft.client.renderer.Tessellator)(life21_48)).a__lw();
    ((moom.lw)(life22_51)).a(((int)(__sourceIntrinsic_b82a5b29b709_invokedynamic1052_14(32248, (8762783000464615737L ^ life1_3)))), ((moom.oD)(moom.oB.i)));
    int spill1052_0 = moom.sK.s();
    ((moom.lw)(((moom.lw)(((moom.lw)(life22_51)).a(((double)(life9_13)), ((double)((life11_15 + life7_11))), ((double)(0x0.0p0d))))).a(((double)(life13_17)), ((double)(life19_23))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(life22_51)).a(((double)((life9_13 + life5_8))), ((double)((life11_15 + life7_11))), ((double)(0x0.0p0d))))).a(((double)(life15_19)), ((double)(life19_23))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(life22_51)).a(((double)((life9_13 + life5_8))), ((double)(life11_15)), ((double)(0x0.0p0d))))).a(((double)(life15_19)), ((double)(life17_21))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(life22_51)).a(((double)(life9_13)), ((double)(life11_15)), ((double)(0x0.0p0d))))).a(((double)(life13_17)), ((double)(life17_21))))).c__Void();
    life3_105 = spill1052_0;
    ((com.moon.iu)(this.d)).c();
    ((net.minecraft.client.renderer.Tessellator)(life21_48)).a__Void();
    moom.kZ.i(((int)(0)));
    moom.kZ.a(((int)(__sourceIntrinsic_b82a5b29b709_invokedynamic1052_34(1363, (262236314674696597L ^ life1_3)))), ((float)(0x1.99999ap-4f)));
    if ((life3_105 != 0)) {
        __sourceExactCall_6604345f74a40b(((java.lang.String[])(new java.lang.String[3])));
    }
    return;
}


public com.moon.iu a__iu() {
return this.d;
}


public float[] a__ArrayFloat() {
return this.g;
}


public com.moon.g1 a__g1() {
return this.i;
}


public int a__sourceReturn_8abf5c6871() {
return this.j;
}


public void a(com.moon.iu p0) {
com.moon.g3 forwardValue215_41_0;
    com.moon.hW forwardValue215_42_0;
    com.moon.hW forwardValue215_51_0;
    com.moon.hW forwardValue215_62_0;
    com.moon.g3 forwardValue215_84_0;
    com.moon.g3 forwardValue215_92_0;
    int forwardValue215_116_0;
    int forwardValue215_136_0;
    com.moon.g3 forwardValue215_149_0;
    int spill215_0;
    com.moon.g3 spill215_1;
    com.moon.g3 spill215_2;
    com.moon.hW spill215_3;
    com.moon.g3 spill215_4;
    com.moon.g3 spill215_5;
    boolean spill215_6;
    com.moon.g3 spill215_7;
    long life2_3;
    int life5_6;
    int life6_10;
    int life4_11;
    forward_join_149: {
    forward_join_145: {
    forward_join_136: {
    forward_join_127: {
    forward_join_116: {
    forward_join_109: {
    forward_join_92: {
    forward_join_91: {
    forward_join_84: {
    forward_join_67: {
    forward_join_62: {
    forward_join_58: {
    forward_join_51: {
    forward_join_49: {
    forward_join_42: {
    forward_join_41: {
    forward_join_34: {
    life2_3 = (com.moon.g3.p ^ 126515380507392L);
    life5_6 = ((net.minecraft.client.Minecraft)(com.moon.g3.c)).G;
    spill215_0 = moom.sK.s();
    life6_10 = ((net.minecraft.client.Minecraft)(com.moon.g3.c)).H;
    life4_11 = spill215_0;
    spill215_1 = this;
    if (!((life4_11 == 0))) {
        forwardValue215_41_0 = spill215_1;
        break forward_join_41;
    }
    if (!((((com.moon.g3)(spill215_1)).j == life5_6))) {
        break forward_join_34;
    }
    spill215_2 = this;
    if (!((life4_11 == 0))) {
        forwardValue215_41_0 = spill215_2;
        break forward_join_41;
    }
    if (!((((com.moon.g3)(spill215_2)).k == life6_10))) {
        break forward_join_34;
    }
    spill215_3 = this.l;
    if (!((life4_11 == 0))) {
        forwardValue215_42_0 = spill215_3;
        break forward_join_42;
    }
    if (!((spill215_3 == null))) {
        break forward_join_34;
    }
    spill215_4 = this;
    if (!((life4_11 == 0))) {
        forwardValue215_92_0 = spill215_4;
        break forward_join_92;
    }
    if (!((((com.moon.g3)(spill215_4)).m != null))) {
        break forward_join_91;
    }
    }
    this.j = ((int)(life5_6));
    this.k = ((int)(life6_10));
    forwardValue215_41_0 = this;
    }
    forwardValue215_42_0 = ((com.moon.g3)(forwardValue215_41_0)).l;
    }
    if (!((life4_11 == 0))) {
        forwardValue215_51_0 = forwardValue215_42_0;
        break forward_join_51;
    }
    if (!((forwardValue215_42_0 != null))) {
        break forward_join_49;
    }
    ((com.moon.hY)(((com.moon.hW)(this.l)).a__hY())).g();
    }
    forwardValue215_51_0 = this.m;
    }
    if (!((life4_11 == 0))) {
        forwardValue215_62_0 = forwardValue215_51_0;
        break forward_join_62;
    }
    if (!((forwardValue215_51_0 != null))) {
        break forward_join_58;
    }
    ((com.moon.hY)(((com.moon.hW)(this.m)).a__hY())).g();
    }
    spill215_5 = this;
    if (!((life4_11 == 0))) {
        forwardValue215_84_0 = spill215_5;
        break forward_join_84;
    }
    forwardValue215_62_0 = ((com.moon.g3)(spill215_5)).n;
    }
    if (!((forwardValue215_62_0 != null))) {
        break forward_join_67;
    }
    ((com.moon.hY)(((com.moon.hW)(this.n)).a__hY())).g();
    }
    this.m = ((com.moon.hW)(((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.ENTITY_OUTLINE))))).c())).a__hX())).a()));
    this.l = ((com.moon.hW)(((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.JUMP_FLOOD_OUTLINE))))).c())).a__hX())).a()));
    forwardValue215_84_0 = this;
    }
    ((com.moon.g3)(forwardValue215_84_0)).n = ((com.moon.hW)(((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.JUMP_FLOOD_OUTLINE_BASE))))).c())).a__hX())).a()));
    }
    forwardValue215_92_0 = this;
    }
    spill215_6 = ((com.moon.iu)(((com.moon.g3)(forwardValue215_92_0)).e)).a__Boolean(((int)(((net.minecraft.client.Minecraft)(com.moon.g3.c)).G)), ((int)(((net.minecraft.client.Minecraft)(com.moon.g3.c)).H)));
    if (!((life4_11 == 0))) {
        forwardValue215_116_0 = ((spill215_6) ? 1 : 0);
        break forward_join_116;
    }
    if (!(spill215_6)) {
        break forward_join_109;
    }
    ((com.moon.iu)(this.e)).a(((int)(__sourceIntrinsic_645df3396178_invokedynamic215_53(9847, (2258211619265657657L ^ life2_3)))));
    }
    forwardValue215_116_0 = ((((com.moon.iu)(this.f)).a__Boolean(((int)(((net.minecraft.client.Minecraft)(com.moon.g3.c)).G)), ((int)(((net.minecraft.client.Minecraft)(com.moon.g3.c)).H)))) ? 1 : 0);
    }
    if (!((life4_11 == 0))) {
        forwardValue215_136_0 = forwardValue215_116_0;
        break forward_join_136;
    }
    if (!((forwardValue215_116_0 != 0))) {
        break forward_join_127;
    }
    ((com.moon.iu)(this.f)).a(((int)(__sourceIntrinsic_645df3396178_invokedynamic215_63(24624, (8863393752743738745L ^ life2_3)))));
    }
    spill215_7 = this;
    if (!((life4_11 == 0))) {
        forwardValue215_149_0 = spill215_7;
        break forward_join_149;
    }
    forwardValue215_136_0 = ((((com.moon.iu)(((com.moon.g3)(spill215_7)).d)).a__Boolean(((int)(((net.minecraft.client.Minecraft)(com.moon.g3.c)).G)), ((int)(((net.minecraft.client.Minecraft)(com.moon.g3.c)).H)))) ? 1 : 0);
    }
    if (!((forwardValue215_136_0 != 0))) {
        break forward_join_145;
    }
    ((com.moon.iu)(this.d)).a(((int)(__sourceIntrinsic_645df3396178_invokedynamic215_73(24624, (8863393752743738745L ^ life2_3)))));
    }
    ((com.moon.g3)(this)).b(((com.moon.iu)(p0)));
    forwardValue215_149_0 = this;
    }
    ((com.moon.g3)(forwardValue215_149_0)).c(((com.moon.iu)(p0)));
    return;
}


public com.moon.hW a__hW() {
return this.l;
}


private static native <E extends Throwable> int __sourceIntrinsic_10fce845935348e3_originalDynamicSite868_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_645df3396178_invokedynamic215_53(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_645df3396178_invokedynamic215_63(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_645df3396178_invokedynamic215_73(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic1052_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic1052_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic1052_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic1052_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic1052_34(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_52698f6522d0_invokedynamic216_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_52698f6522d0_invokedynamic216_16(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral1186_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b083ce8177a1_invokedynamic40_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b083ce8177a1_invokedynamic40_54(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b083ce8177a1_invokedynamic40_57(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b083ce8177a1_invokedynamic40_62(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b083ce8177a1_invokedynamic40_102(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b083ce8177a1_invokedynamic40_105(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b083ce8177a1_invokedynamic40_108(int a0, long a1) throws E;

private static native int __sourceExactCall_6acc809fc8fdc0();
private static native void __sourceExactCall_6604345f74a40b(java.lang.String[] p0);
}
