package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class gc {

public static float a;

public static float b;

public static float c;

private static net.minecraft.client.Minecraft d;

private com.moon.module.impl.KillAura e;

private org.lwjgl.util.vector.Vector2f f;

private org.lwjgl.util.vector.Vector2f g;

private float[][] h;

private int i;

private boolean j;

private static long k;

private static long[] l;

private static java.lang.Integer[] m;

private static java.util.Map n;

public gc(com.moon.module.impl.KillAura p0) { super(); __sourceHandlerCall_1564485d35f3f43f2745(this, p0); }


static {
k = ((long)(((moom._a)(moom._c.a(((long)(-7940369526507798351L)), ((long)(-8082264217039008320L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(96224789137428L)))));
    n = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.gc.k ^ 33402494964412L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill118_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill118_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill118_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill118_14 = new byte[8];
    (__sourceSpill118_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill118_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation118_16 = __sourceSpill118_14;
    ((javax.crypto.Cipher)(__sourceSpill118_11)).init(((int)(__sourceSpill118_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill118_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation118_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[3];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "ÌbÃC\035;½\"/Õï}+#úáëdºf²"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill118_25 = local6_life21;
        int __sourceSpill118_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill118_25)).substring(((int)(__sourceSpill118_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill118_30 = local8_life19;
        int __sourceSpill118_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill118_33 = new byte[8];
        (__sourceSpill118_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill118_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill118_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill118_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill118_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill118_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill118_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill118_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill118_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill118_34)).doFinal(((byte[])(__sourceSpill118_33)));
        (__sourceSpill118_30)[__sourceSpill118_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    l = ((long[])(local8_life19));
    m = ((java.lang.Integer[])(new java.lang.Integer[3]));
    a = ((float)(0x1.921fb6p1f));
    b = ((float)((com.moon.gc.a / 0x1.68p7f)));
    c = ((float)((0x1.68p7f / com.moon.gc.a)));
    d = ((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM()));
}

private static native <E extends Throwable> void __sourceHandlerCall_1564485d35f3f43f2745(com.moon.gc a0, com.moon.module.impl.KillAura a1) throws E;
private static final class __SourceHandler_1564485d35f3f43f2745 {

public static void f30(com.moon.gc receiver, com.moon.module.impl.KillAura p0) throws Throwable {
    long local2_life2 = (__fieldRead30_0() ^ __originalNumericLdc30_1());
    __directSuperInit30_3(receiver);
    __fieldWrite30_7(receiver, __multiArray30_6(__originalDynamicSite30_5(4557, (__originalNumericLdc30_4() ^ local2_life2)), 2));
    __fieldWrite30_8(receiver, 0);
    __fieldWrite30_9(receiver, p0);
    return;
}
private static native long __fieldRead30_0() throws Throwable;
private static native long __originalNumericLdc30_1() throws Throwable;
private static native void __directSuperInit30_3(com.moon.gc a0) throws Throwable;
private static native long __originalNumericLdc30_4() throws Throwable;
private static native int __originalDynamicSite30_5(int a0, long a1) throws Throwable;
private static native float[][] __multiArray30_6(int a0, int a1) throws Throwable;
private static native void __fieldWrite30_7(com.moon.gc a0, float[][] a1) throws Throwable;
private static native void __fieldWrite30_8(com.moon.gc a0, int a1) throws Throwable;
private static native void __fieldWrite30_9(com.moon.gc a0, com.moon.module.impl.KillAura a1) throws Throwable;

}


public boolean b__Boolean() {
long life1_3;
    life1_3 = (com.moon.gc.k ^ 135590337431624L);
    return ((this.f != null) ? true : false);
}


public org.lwjgl.util.vector.Vector2f b() {
return this.g;
}


public void b__Void() {
return;
}


public boolean c() {
return ((((this.j) ? 1 : 0)) != 0);
}


public int a() {
return this.i;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral1284_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/gc"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.gc.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 25498;
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
            throw new RuntimeException("com/moon/gc", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         m[var3] = var15;
      }

      return m[var3];
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public boolean a__Boolean() {
long life1_3;
    life1_3 = (com.moon.gc.k ^ 103703354127612L);
    return ((this.g != null) ? true : false);
}


private float a(float p0, float p1, float p2) {
int forwardValue274_25_0;
    float forwardValue274_31_0;
    float forwardValue274_31_1;
    boolean spill274_0;
    int spill274_1;
    float spill274_2;
    float spill274_3;
    long life4_3;
    float life7_9;
    int life6_10;
    forward_join_31: {
    forward_join_29: {
    forward_join_25: {
    forward_join_19: {
    life4_3 = (com.moon.gc.k ^ 36357405707846L);
    spill274_0 = net.minecraft.entity.EntityLiving.X();
    life7_9 = moom.Dr.e(((float)((p1 - p0))));
    life6_10 = ((spill274_0) ? 1 : 0);
    spill274_1 = recovery.source.CarrierOps.fcmpl(((float)(life7_9)), ((float)(p2)));
    if (!((life6_10 != 0))) {
        forwardValue274_25_0 = spill274_1;
        break forward_join_25;
    }
    if (!((spill274_1 > 0))) {
        break forward_join_19;
    }
    life7_9 = p2;
    }
    spill274_2 = life7_9;
    spill274_3 = (-p2);
    if (!((life6_10 != 0))) {
        forwardValue274_31_0 = spill274_2;
        forwardValue274_31_1 = spill274_3;
        break forward_join_31;
    }
    forwardValue274_25_0 = recovery.source.CarrierOps.fcmpg(((float)(spill274_2)), ((float)(spill274_3)));
    }
    if (!((forwardValue274_25_0 < 0))) {
        break forward_join_29;
    }
    life7_9 = (-p2);
    }
    forwardValue274_31_0 = p0;
    forwardValue274_31_1 = life7_9;
    }
    return (forwardValue274_31_0 + forwardValue274_31_1);
}


private org.lwjgl.util.vector.Vector2f a(com.moon.pw p0, com.moon.pw p1) {
int forestValue66_132_0;
    int forestValue66_158_0;
    com.moon.gc forestValue66_173_0;
    boolean spill66_0;
    boolean spill66_1;
    com.moon.gc spill66_2;
    long life3_3;
    com.moon.setting.MultiSelectSetting life6_8;
    int life5_9;
    com.moon.pw life7_35;
    float life8_48;
    float life9_58;
    float life10_66;
    float life9_79;
    float life10_92;
    com.moon.setting.FloatSetting life11_103;
    int life11_161;
    float[] life12_181;
    float life11_197;
    float life12_201;
    float life13_206;
    float life14_211;
    float life15_213;
    int life16_219;
    int life17_225;
    float life18_230;
    float life19_235;
    float life9_247;
    float life10_259;
    float life10_264;
    forest_join_189: {
    forest_join_173: {
    forest_join_172: {
    forest_join_158: {
    forest_join_132: {
    forest_join_129: {
    forest_join_32: {
    life3_3 = (com.moon.gc.k ^ 107756885671497L);
    spill66_0 = net.minecraft.entity.EntityLiving.W();
    life6_8 = ((com.moon.module.impl.KillAura)(this.e)).b__k4();
    life5_9 = ((spill66_0) ? 1 : 0);
    if (!(((com.moon.setting.MultiSelectSetting)(life6_8)).isSelected(((java.lang.Enum)(com.moon.bb.ATTACK_POINT))))) {
        break forest_join_32;
    }
    p1 = ((com.moon.pw)(p1)).a__pw(((com.moon.pw)(new com.moon.pw(((float) com.moon.nI.a(((double)(-0x1.999999999999ap-4d)), ((double)(0x1.999999999999ap-4d)))), ((float) com.moon.nI.a(((double)(-0x1.0p-2d)), ((double)(0x1.0p-2d)))), ((float) com.moon.nI.a(((double)(-0x1.999999999999ap-4d)), ((double)(0x1.999999999999ap-4d))))))));
    }
    life7_35 = ((com.moon.pw)(p1)).b(((com.moon.pw)(p0)));
    life8_48 = moom.Dr.c(((float)(((((com.moon.pw)(life7_35)).p() * ((com.moon.pw)(life7_35)).p()) + (((com.moon.pw)(life7_35)).r() * ((com.moon.pw)(life7_35)).r())))));
    life9_58 = ((moom.Dr.a(((float)(((com.moon.pw)(life7_35)).r())), ((float)(((com.moon.pw)(life7_35)).p()))) * com.moon.gc.c) - 0x1.68p6f);
    life10_66 = ((-moom.Dr.a(((float)(((com.moon.pw)(life7_35)).q())), ((float)(life8_48)))) * com.moon.gc.c);
    life9_79 = ((com.moon.gc)(this)).a(((float)(((org.lwjgl.util.vector.Vector2f)(this.f)).x)), ((float)(life9_58)), ((float)(((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(((com.moon.module.impl.KillAura)(this.e)).c__kZ())).getValue())))).floatValue())));
    life10_92 = ((com.moon.gc)(this)).a(((float)(((org.lwjgl.util.vector.Vector2f)(this.f)).y)), ((float)(life10_66)), ((float)(((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(((com.moon.module.impl.KillAura)(this.e)).c__kZ())).getValue())))).floatValue())));
    spill66_1 = ((com.moon.setting.MultiSelectSetting)(life6_8)).isSelected(((java.lang.Enum)(com.moon.bb.NORMAL)));
    if (!((life5_9 == 0))) {
        forestValue66_132_0 = ((spill66_1) ? 1 : 0);
        break forest_join_132;
    }
    if (!(spill66_1)) {
        break forest_join_129;
    }
    life11_103 = ((com.moon.module.impl.KillAura)(this.e)).e__kZ();
    life9_79 = (life9_79 + com.moon.nI.a(((float)((-((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(life11_103)).getValue())))).floatValue()))), ((float)(((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(life11_103)).getValue())))).floatValue()))));
    life10_92 = (life10_92 + com.moon.nI.a(((float)((-((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(life11_103)).getValue())))).floatValue()))), ((float)(((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(life11_103)).getValue())))).floatValue()))));
    }
    forestValue66_132_0 = ((((com.moon.setting.MultiSelectSetting)(life6_8)).isSelected(((java.lang.Enum)(com.moon.bb.CIRCULAR)))) ? 1 : 0);
    }
    if (!((life5_9 == 0))) {
        forestValue66_158_0 = forestValue66_132_0;
        break forest_join_158;
    }
    if (!((forestValue66_132_0 != 0))) {
        break forest_join_189;
    }
    com.moon.gc __stackOp66_62_0 = this;
    ((com.moon.gc)(__stackOp66_62_0)).i = ((int)(((int) (((float) ((com.moon.gc)(__stackOp66_62_0)).i) + (0x1.2p5f * ((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(((com.moon.module.impl.KillAura)(this.e)).d__kZ())).getValue())))).floatValue())))));
    forestValue66_158_0 = (this.i % __sourceIntrinsic_23b17702f136_invokedynamic66_71(4557, (7998858551146420115L ^ life3_3)));
    }
    life11_161 = forestValue66_158_0;
    spill66_2 = this;
    if (!((life5_9 == 0))) {
        forestValue66_173_0 = spill66_2;
        break forest_join_173;
    }
    if (!((((com.moon.gc)(spill66_2)).i > __sourceIntrinsic_23b17702f136_invokedynamic66_73(8456, (4488404932493846357L ^ life3_3))))) {
        break forest_join_172;
    }
    this.i = ((int)(0));
    }
    forestValue66_173_0 = this;
    }
    life12_181 = (((com.moon.gc)(forestValue66_173_0)).h)[life11_161];
    life9_79 = (life9_79 + (life12_181)[0]);
    life10_92 = (life10_92 + (life12_181)[1]);
    }
    life11_197 = ((org.lwjgl.util.vector.Vector2f)(this.f)).getX();
    life12_201 = ((org.lwjgl.util.vector.Vector2f)(this.f)).getY();
    life13_206 = moom.Dr.e(((float)((life9_79 - life11_197))));
    life14_211 = moom.Dr.e(((float)((life10_92 - life12_201))));
    life15_213 = com.moon.nE.b();
    life16_219 = ((int) (((double) life13_206) / 0x1.3333333333333p-3d));
    life17_225 = ((int) (((double) life14_211) / 0x1.3333333333333p-3d));
    life18_230 = (((float) life16_219) * life15_213);
    life19_235 = (((float) life17_225) * life15_213);
    life9_247 = ((float) (((double) life11_197) + ((((double) life18_230) * 0x1.3333333333333p-3d) / ((double) life15_213))));
    life10_259 = ((float) (((double) life12_201) + ((((double) life19_235) * 0x1.3333333333333p-3d) / ((double) life15_213))));
    life10_264 = moom.Dr.a(((float)(life10_259)), ((float)(-0x1.68p6f)), ((float)(0x1.68p6f)));
    return new org.lwjgl.util.vector.Vector2f(life9_247, life10_264);
}


public void a(net.minecraft.entity.EntityLivingBase p0) {
int forwardValue276_72_0;
    int forwardValue276_82_0;
    com.moon.gc forwardValue276_116_0;
    java.lang.Object forwardValue276_131_0;
    java.lang.Object forwardValue276_178_0;
    int forwardValue276_180_0;
    net.minecraft.client.entity.EntityPlayerSP forwardValue276_209_0;
    moom.DR forwardValue276_274_0;
    moom.DR forwardValue276_295_0;
    moom.DR forwardValue276_316_0;
    net.minecraft.entity.EntityLivingBase spill276_0;
    com.moon.gc spill276_1;
    com.moon.gc spill276_2;
    com.moon.gc spill276_3;
    boolean spill276_4;
    boolean spill276_5;
    net.minecraft.util.MovingObjectPosition spill276_6;
    net.minecraft.util.MovingObjectPosition$MovingObjectType spill276_7;
    net.minecraft.entity.Entity spill276_8;
    net.minecraft.client.entity.EntityPlayerSP spill276_9;
    moom.DR spill276_10;
    moom.DR spill276_11;
    moom.DR spill276_12;
    long life2_3;
    int life4_5;
    org.lwjgl.util.vector.Vector2f life5_81;
    net.minecraft.util.MovingObjectPosition life5_187;
    moom.DR life5_249;
    moom.CA life6_252;
    net.minecraft.client.entity.EntityPlayerSP life5_273;
    com.moon.pw life6_289;
    moom.DR life7_294;
    moom.CA life8_322;
    forward_join_322: {
    forward_join_316: {
    forward_join_315: {
    forward_join_301: {
    forward_join_295: {
    forward_join_294: {
    forward_join_280: {
    forward_join_274: {
    forward_join_273: {
    forward_join_209: {
    forward_join_207: {
    forward_join_180: {
    forward_join_178: {
    forward_join_174: {
    forward_join_131: {
    forward_join_127: {
    forward_join_116: {
    forward_join_104: {
    forward_join_96: {
    forward_join_88: {
    forward_join_82: {
    forward_join_72: {
    life2_3 = (com.moon.gc.k ^ 53194309441430L);
    life4_5 = ((net.minecraft.entity.EntityLiving.W()) ? 1 : 0);
    spill276_0 = p0;
    if (!((life4_5 == 0))) {
        forwardValue276_131_0 = spill276_0;
        break forward_join_131;
    }
    if (!((spill276_0 == null))) {
        break forward_join_127;
    }
    spill276_1 = this;
    if (!((life4_5 == 0))) {
        forwardValue276_116_0 = spill276_1;
        break forward_join_116;
    }
    if (!(((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.KillAura)(((com.moon.gc)(spill276_1)).e)).g())).getValue())))).booleanValue())) {
        break forward_join_104;
    }
    spill276_2 = this;
    if (!((life4_5 == 0))) {
        forwardValue276_116_0 = spill276_2;
        break forward_join_116;
    }
    if (!((((com.moon.gc)(spill276_2)).g != null))) {
        break forward_join_104;
    }
    spill276_3 = this;
    if (!((life4_5 == 0))) {
        forwardValue276_116_0 = spill276_3;
        break forward_join_116;
    }
    if (!((((com.moon.gc)(spill276_3)).f != null))) {
        break forward_join_104;
    }
    life5_81 = new org.lwjgl.util.vector.Vector2f(((com.moon.gc)(this)).a(((float)(((org.lwjgl.util.vector.Vector2f)(this.f)).x)), ((float)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.gc.d)).K)).w)), ((float)(((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(((com.moon.module.impl.KillAura)(this.e)).c__kZ())).getValue())))).floatValue()))), ((com.moon.gc)(this)).a(((float)(((org.lwjgl.util.vector.Vector2f)(this.f)).y)), ((float)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.gc.d)).K)).x)), ((float)(((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(((com.moon.module.impl.KillAura)(this.e)).c__kZ())).getValue())))).floatValue()))));
    spill276_4 = this.j;
    if (!((life4_5 == 0))) {
        forwardValue276_72_0 = ((spill276_4) ? 1 : 0);
        break forward_join_72;
    }
    if (!(spill276_4)) {
        break forward_join_88;
    }
    forwardValue276_72_0 = recovery.source.CarrierOps.fcmpl(((float)(((org.lwjgl.util.vector.Vector2f)(life5_81)).getX())), ((float)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.gc.d)).K)).w)));
    }
    if (!((life4_5 == 0))) {
        forwardValue276_82_0 = forwardValue276_72_0;
        break forward_join_82;
    }
    if (!((forwardValue276_72_0 == 0))) {
        break forward_join_96;
    }
    forwardValue276_82_0 = recovery.source.CarrierOps.fcmpl(((float)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.gc.d)).K)).x)), ((float)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.gc.d)).K)).x)));
    }
    if (!((forwardValue276_82_0 == 0))) {
        break forward_join_96;
    }
    this.j = ((boolean)(false));
    if (!((life4_5 != 0))) {
        break forward_join_96;
    }
    }
    ((org.lwjgl.util.vector.Vector2f)(life5_81)).set(((float)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.gc.d)).K)).w)), ((float)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.gc.d)).K)).x)));
    }
    this.f = ((org.lwjgl.util.vector.Vector2f)(this.g));
    this.g = ((org.lwjgl.util.vector.Vector2f)(life5_81));
    return;
    }
    this.f = ((org.lwjgl.util.vector.Vector2f)(new org.lwjgl.util.vector.Vector2f(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.gc.d)).K)).w, ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.gc.d)).K)).x)));
    forwardValue276_116_0 = this;
    }
    ((com.moon.gc)(forwardValue276_116_0)).g = ((org.lwjgl.util.vector.Vector2f)(new org.lwjgl.util.vector.Vector2f(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.gc.d)).K)).w, ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.gc.d)).K)).x)));
    return;
    }
    forwardValue276_131_0 = ((com.moon.setting.BooleanSetting)(((com.moon.module.impl.KillAura)(this.e)).e())).getValue();
    }
    spill276_5 = ((java.lang.Boolean)(((java.lang.Boolean)(forwardValue276_131_0)))).booleanValue();
    if (!((life4_5 == 0))) {
        forwardValue276_180_0 = ((spill276_5) ? 1 : 0);
        break forward_join_180;
    }
    if (!(spill276_5)) {
        break forward_join_174;
    }
    life5_187 = com.moon.nQ.a(((float)(((org.lwjgl.util.vector.Vector2f)(this.g)).getX())), ((float)(((org.lwjgl.util.vector.Vector2f)(this.g)).getY())), ((float)(0x1.8p2f)), ((float)(0x1.0p0f)));
    spill276_6 = life5_187;
    if (!((life4_5 == 0))) {
        forwardValue276_178_0 = spill276_6;
        break forward_join_178;
    }
    if (!((spill276_6 != null))) {
        break forward_join_174;
    }
    spill276_7 = ((net.minecraft.util.MovingObjectPosition)(life5_187)).b;
    if (!((life4_5 == 0))) {
        forwardValue276_178_0 = spill276_7;
        break forward_join_178;
    }
    if (!((spill276_7 == net.minecraft.util.MovingObjectPosition$MovingObjectType.ENTITY))) {
        break forward_join_174;
    }
    spill276_8 = ((net.minecraft.util.MovingObjectPosition)(life5_187)).e;
    if (!((life4_5 == 0))) {
        forwardValue276_178_0 = spill276_8;
        break forward_join_178;
    }
    if (!((spill276_8 == p0))) {
        break forward_join_174;
    }
    this.f = ((org.lwjgl.util.vector.Vector2f)(new org.lwjgl.util.vector.Vector2f(((org.lwjgl.util.vector.Vector2f)(this.g)).x, ((org.lwjgl.util.vector.Vector2f)(this.g)).y)));
    return;
    }
    forwardValue276_178_0 = ((com.moon.setting.BooleanSetting)(((com.moon.module.impl.KillAura)(this.e)).f())).getValue();
    }
    forwardValue276_180_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(forwardValue276_178_0)))).booleanValue()) ? 1 : 0);
    }
    if (!((forwardValue276_180_0 != 0))) {
        break forward_join_207;
    }
    spill276_9 = ((net.minecraft.client.Minecraft)(com.moon.gc.d)).K;
    if (!((life4_5 == 0))) {
        forwardValue276_209_0 = spill276_9;
        break forward_join_209;
    }
    life5_249 = ((net.minecraft.client.entity.EntityPlayerSP)(spill276_9)).b(((float)(0x1.0p0f)));
    life6_252 = ((net.minecraft.entity.EntityLivingBase)(p0)).b();
    if (!(((moom.CA)(life6_252)).a(((moom.DR)(life5_249))))) {
        break forward_join_207;
    }
    this.f = ((org.lwjgl.util.vector.Vector2f)(new org.lwjgl.util.vector.Vector2f(((org.lwjgl.util.vector.Vector2f)(this.g)).x, ((org.lwjgl.util.vector.Vector2f)(this.g)).y)));
    return;
    }
    forwardValue276_209_0 = ((net.minecraft.client.Minecraft)(com.moon.gc.d)).K;
    }
    life5_273 = forwardValue276_209_0;
    life6_289 = new com.moon.pw(((float) ((net.minecraft.client.entity.EntityPlayerSP)(life5_273)).n), (((float) ((net.minecraft.client.entity.EntityPlayerSP)(life5_273)).o) + ((net.minecraft.client.entity.EntityPlayerSP)(life5_273)).e__Float()), ((float) ((net.minecraft.client.entity.EntityPlayerSP)(life5_273)).p));
    life7_294 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.gc.d)).K)).b(((float)(0x1.0p0f)));
    life8_322 = new moom.CA((((net.minecraft.entity.EntityLivingBase)(p0)).n - 0x1.99999ap-2d), ((net.minecraft.entity.EntityLivingBase)(p0)).o, (((net.minecraft.entity.EntityLivingBase)(p0)).p - 0x1.99999ap-2d), (((net.minecraft.entity.EntityLivingBase)(p0)).n + 0x1.99999ap-2d), (((net.minecraft.entity.EntityLivingBase)(p0)).o + ((double) ((net.minecraft.entity.EntityLivingBase)(p0)).H)), (((net.minecraft.entity.EntityLivingBase)(p0)).p + 0x1.99999ap-2d));
    spill276_10 = life7_294;
    if (!((life4_5 == 0))) {
        forwardValue276_274_0 = spill276_10;
        break forward_join_274;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(((moom.DR)(spill276_10)).a)), ((double)(((moom.CA)(life8_322)).e))) > 0))) {
        break forward_join_273;
    }
    ((moom.DR)(life7_294)).a = ((double)(((moom.CA)(life8_322)).e));
    if (!((life4_5 != 0))) {
        break forward_join_280;
    }
    }
    forwardValue276_274_0 = life7_294;
    }
    ((moom.DR)(forwardValue276_274_0)).a = ((double)(java.lang.Math.max(((double)(((moom.DR)(life7_294)).a)), ((double)(((moom.CA)(life8_322)).b)))));
    }
    spill276_11 = life7_294;
    if (!((life4_5 == 0))) {
        forwardValue276_295_0 = spill276_11;
        break forward_join_295;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(((moom.DR)(spill276_11)).b)), ((double)(((moom.CA)(life8_322)).f))) > 0))) {
        break forward_join_294;
    }
    ((moom.DR)(life7_294)).b = ((double)(((moom.CA)(life8_322)).f));
    if (!((life4_5 != 0))) {
        break forward_join_301;
    }
    }
    forwardValue276_295_0 = life7_294;
    }
    ((moom.DR)(forwardValue276_295_0)).b = ((double)(java.lang.Math.max(((double)(((moom.DR)(life7_294)).b)), ((double)(((moom.CA)(life8_322)).c)))));
    }
    spill276_12 = life7_294;
    if (!((life4_5 == 0))) {
        forwardValue276_316_0 = spill276_12;
        break forward_join_316;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(((moom.DR)(spill276_12)).c)), ((double)(((moom.CA)(life8_322)).g))) > 0))) {
        break forward_join_315;
    }
    ((moom.DR)(life7_294)).c = ((double)(((moom.CA)(life8_322)).g));
    if (!((life4_5 != 0))) {
        break forward_join_322;
    }
    }
    forwardValue276_316_0 = life7_294;
    }
    ((moom.DR)(forwardValue276_316_0)).c = ((double)(java.lang.Math.max(((double)(((moom.DR)(life7_294)).c)), ((double)(((moom.CA)(life8_322)).d)))));
    }
    this.f = ((org.lwjgl.util.vector.Vector2f)(this.g));
    this.g = ((org.lwjgl.util.vector.Vector2f)(((com.moon.gc)(this)).a(((com.moon.pw)(life6_289)), ((com.moon.pw)(new com.moon.pw(((float) ((moom.DR)(life7_294)).a), ((float) ((moom.DR)(life7_294)).b), ((float) ((moom.DR)(life7_294)).c)))))));
    this.j = ((boolean)(true));
    return;
}


public float[][] a__ArrayArrayFloat() {
return this.h;
}


public void a__Void() {
net.minecraft.client.entity.EntityPlayerSP lexicalValue56_16_0;
    float lexicalValue56_17_0;
    net.minecraft.client.entity.EntityPlayerSP lexicalValue56_25_0;
    float lexicalValue56_26_0;
    net.minecraft.client.entity.EntityPlayerSP lexicalValue56_34_0;
    float lexicalValue56_35_0;
    net.minecraft.client.entity.EntityPlayerSP lexicalValue56_43_0;
    float lexicalValue56_44_0;
    int lexicalValue56_112_0;
    boolean spill56_0;
    net.minecraft.client.entity.EntityPlayerSP spill56_1;
    net.minecraft.client.entity.EntityPlayerSP spill56_2;
    net.minecraft.client.entity.EntityPlayerSP spill56_3;
    net.minecraft.client.entity.EntityPlayerSP spill56_4;
    long life1_3;
    net.minecraft.client.entity.EntityPlayerSP life4_7;
    int life3_8;
    float life5_22;
    float life6_36;
    float life7_50;
    float life8_64;
    int life9_80;
    float life10_97;
    float life11_107;
    lexical_join_113: {
    lexical_join_112: {
    lexical_join_111: {
    lexical_join_105: {
    lexical_join_44: {
    lexical_join_43: {
    lexical_join_42: {
    lexical_join_35: {
    lexical_join_34: {
    lexical_join_33: {
    lexical_join_26: {
    lexical_join_25: {
    lexical_join_24: {
    lexical_join_17: {
    lexical_join_16: {
    lexical_join_15: {
    life1_3 = (com.moon.gc.k ^ 138713820134512L);
    spill56_0 = net.minecraft.entity.EntityLiving.X();
    life4_7 = ((net.minecraft.client.Minecraft)(com.moon.gc.d)).K;
    life3_8 = ((spill56_0) ? 1 : 0);
    spill56_1 = life4_7;
    if (!((life3_8 != 0))) {
        lexicalValue56_16_0 = spill56_1;
        break lexical_join_16;
    }
    if (!((spill56_1 == null))) {
        break lexical_join_15;
    }
    lexicalValue56_17_0 = 0x0.0p0f;
    break lexical_join_17;
    }
    lexicalValue56_16_0 = life4_7;
    }
    lexicalValue56_17_0 = ((net.minecraft.client.entity.EntityPlayerSP)(lexicalValue56_16_0)).w;
    }
    life5_22 = lexicalValue56_17_0;
    spill56_2 = life4_7;
    if (!((life3_8 != 0))) {
        lexicalValue56_25_0 = spill56_2;
        break lexical_join_25;
    }
    if (!((spill56_2 == null))) {
        break lexical_join_24;
    }
    lexicalValue56_26_0 = 0x0.0p0f;
    break lexical_join_26;
    }
    lexicalValue56_25_0 = life4_7;
    }
    lexicalValue56_26_0 = ((net.minecraft.client.entity.EntityPlayerSP)(lexicalValue56_25_0)).x;
    }
    life6_36 = lexicalValue56_26_0;
    spill56_3 = life4_7;
    if (!((life3_8 != 0))) {
        lexicalValue56_34_0 = spill56_3;
        break lexical_join_34;
    }
    if (!((spill56_3 == null))) {
        break lexical_join_33;
    }
    lexicalValue56_35_0 = 0x0.0p0f;
    break lexical_join_35;
    }
    lexicalValue56_34_0 = life4_7;
    }
    lexicalValue56_35_0 = ((net.minecraft.client.entity.EntityPlayerSP)(lexicalValue56_34_0)).cN;
    }
    life7_50 = lexicalValue56_35_0;
    spill56_4 = life4_7;
    if (!((life3_8 != 0))) {
        lexicalValue56_43_0 = spill56_4;
        break lexical_join_43;
    }
    if (!((spill56_4 == null))) {
        break lexical_join_42;
    }
    lexicalValue56_44_0 = 0x0.0p0f;
    break lexical_join_44;
    }
    lexicalValue56_43_0 = life4_7;
    }
    lexicalValue56_44_0 = ((net.minecraft.client.entity.EntityPlayerSP)(lexicalValue56_43_0)).cL;
    }
    life8_64 = lexicalValue56_44_0;
    this.f = ((org.lwjgl.util.vector.Vector2f)(new org.lwjgl.util.vector.Vector2f(life7_50, life8_64)));
    this.g = ((org.lwjgl.util.vector.Vector2f)(new org.lwjgl.util.vector.Vector2f(life5_22, life6_36)));
    life9_80 = 0;
    lexical_cycle_61: while (true) {
    if (!((life9_80 < __sourceIntrinsic_b82a5b29b709_invokedynamic56_11(15440, (6125681030773094453L ^ life1_3))))) {
        break lexical_join_105;
    }
    life10_97 = (((float) java.lang.Math.sin(((double)(java.lang.Math.toRadians(((double)(((double) life9_80)))))))) * com.moon.nI.a(((float)(0x1.4p0f)), ((float)(0x1.8p2f))));
    life11_107 = (((float) java.lang.Math.cos(((double)(java.lang.Math.toRadians(((double)(((double) life9_80)))))))) * com.moon.nI.a(((float)(0x1.4p0f)), ((float)(0x1.8p2f))));
    (this.h)[life9_80] = new float[] {life10_97, life11_107};
    life9_80 += 1;
    if (!((life3_8 == 0))) { continue lexical_cycle_61; }
    break lexical_cycle_61;
    }
    }
    if (!((net.minecraft.entity.Entity.b__ArrayString() != null))) {
        break lexical_join_113;
    }
    if (!((life3_8 != 0))) {
        break lexical_join_111;
    }
    lexicalValue56_112_0 = 0;
    break lexical_join_112;
    }
    lexicalValue56_112_0 = 1;
    }
    net.minecraft.entity.EntityLiving.k(((boolean)__sourceIntrinsic_integerToBoolean((lexicalValue56_112_0))));
    }
    return;
}


public org.lwjgl.util.vector.Vector2f a__Vector2f() {
return this.f;
}


public com.moon.module.impl.KillAura a__lb() {
return this.e;
}


private static native <E extends Throwable> int __sourceIntrinsic_cc23345fe239_originalDynamicSite30_5(int a0, long a1) throws E;

private static native <E extends Throwable> float[][] __sourceIntrinsic_cc23345fe239_multiArray30_6(int a0, int a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_23b17702f136_invokedynamic66_71(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_23b17702f136_invokedynamic66_73(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral1284_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic56_11(int a0, long a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
