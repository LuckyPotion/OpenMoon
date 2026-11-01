package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class jn extends com.moon.jm {

private final com.moon.ji a;

private final com.moon.jy c;

private final float d;

private final float e;

private final float f;

public boolean g;

private static boolean h;

private static final long j;

private static final long[] n;

private static final java.lang.Integer[] o;

private static final java.util.Map p;

public jn(java.lang.String p0, float p1, float p2, float p3) {
super();
    this.c = new com.moon.jy();
    this.d = p1;
    this.e = p2;
    this.f = p3;
    (this.c).a(p0);
    this.a = new com.moon.jq((this.c).a__jz());
}


static {
j = ((long)(((moom._a)(moom._c.a(((long)(3716922480129864787L)), ((long)(-7112720733378191264L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(105750843200686L)))));
    int __sourceSpill325_6 = 0;
    p = ((java.util.Map)(new java.util.HashMap(13)));
    com.moon.jn.b(((boolean)__sourceIntrinsic_integerToBoolean((__sourceSpill325_6))));
    long local0_life9 = (com.moon.jn.j ^ 30342111927389L);
    javax.crypto.Cipher local2_life11;
    javax.crypto.Cipher __sourceSpill325_13 = (local2_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill325_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill325_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill325_16 = new byte[8];
    (__sourceSpill325_16)[0] = ((byte) ((int) (local0_life9 >>> 56)));
    int local3_life17 = 1;
    while ((local3_life17 < 8)) {
        (__sourceSpill325_16)[local3_life17] = ((byte) ((int) ((local0_life9 << (local3_life17 * 8)) >>> 56)));
        local3_life17 += 1;
    }
    byte[] __sourcePreallocation325_18 = __sourceSpill325_16;
    ((javax.crypto.Cipher)(__sourceSpill325_13)).init(((int)(__sourceSpill325_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill325_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation325_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life21 = new long[9];
    int local5_life22 = 0;
    java.lang.String local6_life23;
    int local7_life25 = ((java.lang.String)((local6_life23 = "H\002Åë\024EÃU¢\037ÌÐi+¤\035²Ð&åè!¸îT®Øb>Ø7\020ÊÈ6\013±\"r\001%j~÷\023gº[\b"))).length();
    int local4_life26 = 0;
    do {
        java.lang.String __sourceSpill325_27 = local6_life23;
        int __sourceSpill325_28 = local4_life26;
        local4_life26 += 8;
        byte[] local9_life31 = ((java.lang.String)(((java.lang.String)(__sourceSpill325_27)).substring(((int)(__sourceSpill325_28)), ((int)(local4_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill325_32 = local8_life21;
        int __sourceSpill325_33 = local5_life22;
        local5_life22 += 1;
        long local10_life34 = (((((((((((long) (local9_life31)[0]) & 255L) << 56) | ((((long) (local9_life31)[1]) & 255L) << 48)) | ((((long) (local9_life31)[2]) & 255L) << 40)) | ((((long) (local9_life31)[3]) & 255L) << 32)) | ((((long) (local9_life31)[4]) & 255L) << 24)) | ((((long) (local9_life31)[5]) & 255L) << 16)) | ((((long) (local9_life31)[6]) & 255L) << 8)) | (((long) (local9_life31)[7]) & 255L));
        byte[] __sourceSpill325_35 = new byte[8];
        (__sourceSpill325_35)[0] = ((byte) ((int) (local10_life34 >>> 56)));
        (__sourceSpill325_35)[1] = ((byte) ((int) (local10_life34 >>> 48)));
        (__sourceSpill325_35)[2] = ((byte) ((int) (local10_life34 >>> 40)));
        (__sourceSpill325_35)[3] = ((byte) ((int) (local10_life34 >>> 32)));
        (__sourceSpill325_35)[4] = ((byte) ((int) (local10_life34 >>> 24)));
        (__sourceSpill325_35)[5] = ((byte) ((int) (local10_life34 >>> 16)));
        (__sourceSpill325_35)[6] = ((byte) ((int) (local10_life34 >>> 8)));
        (__sourceSpill325_35)[7] = ((byte) ((int) local10_life34));
        javax.crypto.Cipher __sourceSpill325_36 = local2_life11;
        byte[] local12_life38 = ((javax.crypto.Cipher)(__sourceSpill325_36)).doFinal(((byte[])(__sourceSpill325_35)));
        (__sourceSpill325_32)[__sourceSpill325_33] = (((((((((((long) (local12_life38)[0]) & 255L) << 56) | ((((long) (local12_life38)[1]) & 255L) << 48)) | ((((long) (local12_life38)[2]) & 255L) << 40)) | ((((long) (local12_life38)[3]) & 255L) << 32)) | ((((long) (local12_life38)[4]) & 255L) << 24)) | ((((long) (local12_life38)[5]) & 255L) << 16)) | ((((long) (local12_life38)[6]) & 255L) << 8)) | (((long) (local12_life38)[7]) & 255L));
    } while ((!(local4_life26 >= local7_life25)));
    local7_life25 = ((java.lang.String)((local6_life23 = "#toò\n\b*j\003¶\003Ê&Æ"))).length();
    local4_life26 = 0;
    do {
        java.lang.String __sourceSpill325_40 = local6_life23;
        int __sourceSpill325_41 = local4_life26;
        local4_life26 += 8;
        byte[] local9_life44 = ((java.lang.String)(((java.lang.String)(__sourceSpill325_40)).substring(((int)(__sourceSpill325_41)), ((int)(local4_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill325_45 = local8_life21;
        int __sourceSpill325_46 = local5_life22;
        local5_life22 += 1;
        long local10_life47 = (((((((((((long) (local9_life44)[0]) & 255L) << 56) | ((((long) (local9_life44)[1]) & 255L) << 48)) | ((((long) (local9_life44)[2]) & 255L) << 40)) | ((((long) (local9_life44)[3]) & 255L) << 32)) | ((((long) (local9_life44)[4]) & 255L) << 24)) | ((((long) (local9_life44)[5]) & 255L) << 16)) | ((((long) (local9_life44)[6]) & 255L) << 8)) | (((long) (local9_life44)[7]) & 255L));
        byte[] __sourceSpill325_48 = new byte[8];
        (__sourceSpill325_48)[0] = ((byte) ((int) (local10_life47 >>> 56)));
        (__sourceSpill325_48)[1] = ((byte) ((int) (local10_life47 >>> 48)));
        (__sourceSpill325_48)[2] = ((byte) ((int) (local10_life47 >>> 40)));
        (__sourceSpill325_48)[3] = ((byte) ((int) (local10_life47 >>> 32)));
        (__sourceSpill325_48)[4] = ((byte) ((int) (local10_life47 >>> 24)));
        (__sourceSpill325_48)[5] = ((byte) ((int) (local10_life47 >>> 16)));
        (__sourceSpill325_48)[6] = ((byte) ((int) (local10_life47 >>> 8)));
        (__sourceSpill325_48)[7] = ((byte) ((int) local10_life47));
        javax.crypto.Cipher __sourceSpill325_49 = local2_life11;
        byte[] local12_life51 = ((javax.crypto.Cipher)(__sourceSpill325_49)).doFinal(((byte[])(__sourceSpill325_48)));
        (__sourceSpill325_45)[__sourceSpill325_46] = (((((((((((long) (local12_life51)[0]) & 255L) << 56) | ((((long) (local12_life51)[1]) & 255L) << 48)) | ((((long) (local12_life51)[2]) & 255L) << 40)) | ((((long) (local12_life51)[3]) & 255L) << 32)) | ((((long) (local12_life51)[4]) & 255L) << 24)) | ((((long) (local12_life51)[5]) & 255L) << 16)) | ((((long) (local12_life51)[6]) & 255L) << 8)) | (((long) (local12_life51)[7]) & 255L));
    } while ((!(local4_life26 >= local7_life25)));
    n = ((long[])(local8_life21));
    o = ((java.lang.Integer[])(new java.lang.Integer[9]));
}


public float b__sourceReturn_bc607678b6() {
return this.e;
}


public static boolean b__Boolean() {
return ((((com.moon.jn.h) ? 1 : 0)) != 0);
}


public static void b(boolean p0) {
com.moon.jn.h = ((boolean)(p0));
    return;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral1980_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/jn"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.jn.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 1083;
      if (o[var3] == null) {
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
         long var5 = n[var3];
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
         Object[] var9 = (Object[])p.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               p.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/moon/jn", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         o[var3] = var15;
      }

      return o[var3];
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public float b(java.lang.String p0, float p1) {
return (((com.moon.ji)(((com.moon.jn)(this)).a__ji())).b(((java.lang.String)(p0))) * p1);
}


public static boolean c__Boolean() {
int local0 = __sourceIntrinsic_booleanToInteger(com.moon.jn.b__Boolean());
    if ((local0 == 0)) {
        return ((1) != 0);
    }
    return ((0) != 0);
}


public float c__sourceReturn_bc607678b6() {
return this.f;
}


public void a(com.moon.hW p0, java.lang.String p1, float p2, float p3, float p4, int p5, boolean p6, boolean p7, float p8) {
this.a(((com.moon.hW)(p0)), ((java.lang.String)(p1)), ((float)(p2)), ((float)(p3)), ((float)(p4)), ((int)(p5)), ((boolean)(p6)), ((boolean)(p7)), ((float)(p8)), ((float)(0x0.0p0f)));
    return;
}


public float a(java.lang.String p0, float p1) {
return (((com.moon.ji)(this.a)).a(((java.lang.String)(p0))) * p1);
}


public void a__Void() {
int forwardValue606_36_0;
    boolean spill606_0;
    boolean spill606_1;
    long life1_3;
    moom.DD life4_7;
    int life3_13;
    forward_join_46: {
    forward_join_36: {
    life1_3 = (com.moon.jn.j ^ 8258015680972L);
    life4_7 = ((com.moon.jy)(this.c)).a__DD();
    spill606_0 = com.moon.jn.c__Boolean();
    ((net.minecraft.client.renderer.texture.TextureManager)(((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).a__ok())).a__Void(((moom.DD)(life4_7)));
    life3_13 = ((spill606_0) ? 1 : 0);
    spill606_1 = this.g;
    if (!((life3_13 != 0))) {
        forwardValue606_36_0 = ((spill606_1) ? 1 : 0);
        break forward_join_36;
    }
    if (!(spill606_1)) {
        break forward_join_46;
    }
    org.lwjgl.opengl.GL11.glTexParameterf(((int)(__sourceIntrinsic_b82a5b29b709_invokedynamic606_10(30700, (3676971265712503068L ^ life1_3)))), ((int)(__sourceIntrinsic_b82a5b29b709_invokedynamic606_11(9008, (1563074555611704774L ^ life1_3)))), ((float)(0x1.3008p13f)));
    forwardValue606_36_0 = __sourceIntrinsic_b82a5b29b709_invokedynamic606_13(6169, (1293240907836937966L ^ life1_3));
    }
    org.lwjgl.opengl.GL11.glTexParameterf(((int)(forwardValue606_36_0)), ((int)(__sourceIntrinsic_b82a5b29b709_invokedynamic606_14(16385, (68273253331013360L ^ life1_3)))), ((float)(0x1.3008p13f)));
    this.g = ((boolean)(false));
    }
    return;
}


public void a(com.moon.hW p0, java.lang.String p1, float p2, float p3, float p4, int p5, boolean p6, boolean p7, float p8, float p9) {
int lexicalValue126_51_0;
    int lexicalValue126_53_0;
    int lexicalValue126_80_0;
    int lexicalValue126_80_1;
    int lexicalValue126_88_0;
    com.moon.jk lexicalValue126_93_0;
    com.moon.jr lexicalValue126_108_0;
    float lexicalValue126_117_0;
    com.moon.jr lexicalValue126_130_0;
    float lexicalValue126_156_0;
    int lexicalValue126_162_0;
    int lexicalValue126_169_0;
    com.moon.jk lexicalValue126_204_0;
    int lexicalValue126_235_0;
    float lexicalValue126_253_0;
    com.moon.jk lexicalValue126_315_0;
    int lexicalValue126_333_0;
    int lexicalValue126_358_0;
    com.moon.jk lexicalValue126_386_0;
    int lexicalValue126_405_0;
    boolean spill126_0;
    int spill126_1;
    int spill126_2;
    int spill126_3;
    int spill126_4;
    com.moon.jk spill126_5;
    com.moon.jr spill126_6;
    boolean spill126_7;
    com.moon.jr spill126_8;
    com.moon.jk spill126_9;
    int spill126_10;
    boolean spill126_11;
    com.moon.jk spill126_12;
    boolean spill126_13;
    com.moon.jk spill126_14;
    long life11_3;
    char[] life14_6;
    com.moon.jz life15_11;
    com.moon.jk life16_20;
    int life13_21;
    com.moon.ju life17_25;
    float life18_31;
    float life19_33;
    int life20_35;
    int life21_37;
    int life22_45;
    int life23_56;
    com.moon.jj life24_127;
    com.moon.jr life25_131;
    float life26_161;
    com.moon.jr life27_186;
    int life27_310;
    float life28_330;
    float life29_343;
    float life30_347;
    float life31_361;
    float life31_442;
    float life32_450;
    lexical_join_409: {
    life11_3 = (com.moon.jn.j ^ 24747145815770L);
    life14_6 = ((java.lang.String)(p1)).toCharArray();
    spill126_0 = com.moon.jn.b__Boolean();
    life15_11 = ((com.moon.jy)(this.c)).a__jz();
    life16_20 = ((com.moon.jl)(((com.moon.jl)(((com.moon.jl)(((com.moon.jl)(com.moon.jk.a__jl())).a(((char[])(life14_6))))).a(((int)(p5))))).a(((boolean)(p6))))).a();
    life13_21 = ((spill126_0) ? 1 : 0);
    life17_25 = ((com.moon.jy)(this.c)).a();
    life18_31 = (((com.moon.jx)(((com.moon.ju)(life17_25)).a__jx())).c() * p2);
    life19_33 = 0x0.0p0f;
    life20_35 = 0;
    life21_37 = 0;
    lexical_cycle_38: while (true) {
    lexical_join_407: {
    lexical_join_406: {
    lexical_join_405: {
    lexical_join_400: {
    lexical_join_387: {
    lexical_join_386: {
    lexical_join_358: {
    lexical_join_333: {
    lexical_join_331: {
    lexical_join_329: {
    lexical_join_316: {
    lexical_join_315: {
    lexical_join_253: {
    lexical_join_247: {
    lexical_join_235: {
    lexical_join_234: {
    lexical_join_205: {
    lexical_join_204: {
    lexical_join_169: {
    lexical_join_162: {
    lexical_join_161: {
    lexical_join_156: {
    lexical_join_155: {
    lexical_join_145: {
    lexical_join_130: {
    lexical_join_117: {
    lexical_join_116: {
    lexical_join_108: {
    lexical_join_105: {
    lexical_join_93: {
    lexical_join_92: {
    lexical_join_88: {
    lexical_join_83: {
    lexical_join_80: {
    lexical_join_53: {
    lexical_join_52: {
    lexical_join_51: {
    if (!((life21_37 < (life14_6).length))) {
        break lexical_join_409;
    }
    life22_45 = ((int)((life14_6)[life21_37]));
    spill126_1 = life20_35;
    if (!((life13_21 == 0))) {
        lexicalValue126_51_0 = spill126_1;
        break lexical_join_51;
    }
    if (!((spill126_1 != 0))) {
        break lexical_join_52;
    }
    lexicalValue126_51_0 = 1;
    }
    lexicalValue126_53_0 = lexicalValue126_51_0;
    break lexical_join_53;
    }
    lexicalValue126_53_0 = 0;
    }
    life23_56 = lexicalValue126_53_0;
    if (!((life13_21 == 0))) {
        break lexical_join_407;
    }
    if (!((life22_45 != __sourceIntrinsic_abe755a95741_invokedynamic126_16(18043, (4100016790382983064L ^ life11_3))))) {
        break lexical_join_406;
    }
    spill126_2 = life22_45;
    spill126_3 = __sourceIntrinsic_abe755a95741_invokedynamic126_17(19479, (1911425678229126645L ^ life11_3));
    if (!((life13_21 == 0))) {
        lexicalValue126_80_0 = spill126_2;
        lexicalValue126_80_1 = spill126_3;
        break lexical_join_80;
    }
    if (!((spill126_2 != spill126_3))) {
        break lexical_join_406;
    }
    spill126_4 = life22_45;
    if (!((life13_21 == 0))) {
        lexicalValue126_88_0 = spill126_4;
        break lexical_join_88;
    }
    lexicalValue126_80_0 = spill126_4;
    lexicalValue126_80_1 = __sourceIntrinsic_abe755a95741_invokedynamic126_18(28495, (1638241435485871786L ^ life11_3));
    }
    if (!((lexicalValue126_80_0 == lexicalValue126_80_1))) {
        break lexical_join_83;
    }
    if (!((life13_21 != 0))) {
        break lexical_join_406;
    }
    }
    spill126_5 = life16_20;
    if (!((life13_21 == 0))) {
        lexicalValue126_93_0 = spill126_5;
        break lexical_join_93;
    }
    lexicalValue126_88_0 = ((((com.moon.jk)(spill126_5)).a(((int)(life21_37)))) ? 1 : 0);
    }
    if (!((lexicalValue126_88_0 != 0))) {
        break lexical_join_92;
    }
    life21_37 += 1;
    if (!((life13_21 != 0))) {
        break lexical_join_406;
    }
    }
    lexicalValue126_93_0 = life16_20;
    }
    life24_127 = ((com.moon.jk)(lexicalValue126_93_0)).a__jj();
    life25_131 = ((com.moon.jz)(life15_11)).a(((char)(life22_45)));
    spill126_6 = life25_131;
    if (!((life13_21 == 0))) {
        lexicalValue126_108_0 = spill126_6;
        break lexical_join_108;
    }
    if (!((spill126_6 == null))) {
        break lexical_join_105;
    }
    if (!((life13_21 != 0))) {
        break lexical_join_406;
    }
    }
    lexicalValue126_108_0 = ((com.moon.jr)(life25_131)).b(((float)(p2)));
    }
    recovery.source.CarrierOps.discard(lexicalValue126_108_0);
    if (!((life23_56 != 0))) {
        break lexical_join_116;
    }
    lexicalValue126_117_0 = ((com.moon.jz)(life15_11)).a(((char)(life20_35)), ((char)(life22_45)));
    break lexical_join_117;
    }
    lexicalValue126_117_0 = 0x0.0p0f;
    }
    life26_161 = lexicalValue126_117_0;
    spill126_7 = ((com.moon.jj)(life24_127)).c();
    if (!((life13_21 == 0))) {
        lexicalValue126_162_0 = ((spill126_7) ? 1 : 0);
        break lexical_join_162;
    }
    if (!(spill126_7)) {
        break lexical_join_161;
    }
    spill126_8 = life25_131;
    if (!((life13_21 == 0))) {
        lexicalValue126_130_0 = spill126_8;
        break lexical_join_130;
    }
    if (!((((com.moon.jv)(((com.moon.jr)(spill126_8)).a__jv())).a__jt() != null))) {
        break lexical_join_161;
    }
    lexicalValue126_130_0 = life25_131;
    }
    life27_186 = lexicalValue126_130_0;
    life25_131 = ((com.moon.jz)(life15_11)).a(((com.moon.jr)(life27_186)));
    lexical_cycle_135: while (true) {
    if (!((life25_131 == null))) {
        break lexical_join_145;
    }
    life25_131 = ((com.moon.jz)(life15_11)).a(((com.moon.jr)(life27_186)));
    if (!((life13_21 == 0))) {
        break lexical_join_155;
    }
    if (!((life13_21 != 0))) { continue lexical_cycle_135; }
    break lexical_cycle_135;
    }
    }
    if (!((life23_56 != 0))) {
        break lexical_join_155;
    }
    lexicalValue126_156_0 = ((com.moon.jz)(life15_11)).a(((char)(life20_35)), ((char)(((char) ((com.moon.jv)(((com.moon.jr)(life25_131)).a__jv())).a__Int()))));
    break lexical_join_156;
    }
    lexicalValue126_156_0 = 0x0.0p0f;
    }
    life26_161 = lexicalValue126_156_0;
    ((com.moon.jr)(life25_131)).b(((float)(p2)));
    }
    lexicalValue126_162_0 = ((p7) ? 1 : 0);
    }
    if (!((life13_21 == 0))) {
        lexicalValue126_169_0 = lexicalValue126_162_0;
        break lexical_join_169;
    }
    if (!((lexicalValue126_162_0 != 0))) {
        break lexical_join_205;
    }
    spill126_9 = life16_20;
    if (!((life13_21 == 0))) {
        lexicalValue126_204_0 = spill126_9;
        break lexical_join_204;
    }
    lexicalValue126_169_0 = ((((com.moon.jk)(spill126_9)).a__Boolean()) ? 1 : 0);
    }
    if (!((lexicalValue126_169_0 != 0))) {
        break lexical_join_205;
    }
    ((com.moon.jk)(life16_20)).a(((boolean)(false)));
    ((com.moon.hW)(p0)).a(((com.moon.iX)(((com.moon.jr)(life25_131)).a(((float)((((p3 + life19_33) + (life26_161 * p2)) + 0x1.0p-1f))), ((float)((p4 + 0x1.0p-1f))), ((float)((this.d + p9))), ((float)(this.e)), ((float)(p8)), ((float)(this.f)), ((boolean)(true)), ((com.moon.jk)(life16_20))))));
    lexicalValue126_204_0 = ((com.moon.jk)(life16_20)).a(((boolean)(true)));
    }
    recovery.source.CarrierOps.discard(lexicalValue126_204_0);
    }
    ((com.moon.hW)(p0)).a(((com.moon.iX)(((com.moon.jr)(life25_131)).a(((float)(((p3 + life19_33) + (life26_161 * p2)))), ((float)(p4)), ((float)((this.d + p9))), ((float)(this.e)), ((float)(p8)), ((float)(this.f)), ((boolean)(false)), ((com.moon.jk)(life16_20))))));
    if (!((((com.moon.jv)(((com.moon.jr)(life25_131)).a__jv())).a__jt() == null))) {
        break lexical_join_234;
    }
    lexicalValue126_235_0 = 1;
    break lexical_join_235;
    }
    lexicalValue126_235_0 = 0;
    }
    life27_310 = lexicalValue126_235_0;
    if (!((life21_37 == ((life14_6).length - 1)))) {
        break lexical_join_247;
    }
    lexicalValue126_253_0 = (((com.moon.jr)(life25_131)).g() * p2);
    break lexical_join_253;
    }
    lexicalValue126_253_0 = ((((com.moon.jr)(life25_131)).g() + life26_161) * p2);
    }
    life28_330 = lexicalValue126_253_0;
    spill126_10 = life27_310;
    if (!((life13_21 == 0))) {
        lexicalValue126_405_0 = spill126_10;
        break lexical_join_405;
    }
    if (!((spill126_10 == 0))) {
        break lexical_join_400;
    }
    life29_343 = (((com.moon.jx)(((com.moon.ju)(life17_25)).a__jx())).g() * p2);
    life30_347 = (p3 + life19_33);
    spill126_11 = ((com.moon.jj)(life24_127)).d();
    if (!((life13_21 == 0))) {
        lexicalValue126_333_0 = ((spill126_11) ? 1 : 0);
        break lexical_join_333;
    }
    if (!(spill126_11)) {
        break lexical_join_331;
    }
    life31_361 = (p4 + (life18_31 / 0x1.0p1f));
    if (!((life13_21 == 0))) {
        break lexical_join_329;
    }
    if (!(p7)) {
        break lexical_join_316;
    }
    spill126_12 = life16_20;
    if (!((life13_21 == 0))) {
        lexicalValue126_315_0 = spill126_12;
        break lexical_join_315;
    }
    if (!(((com.moon.jk)(spill126_12)).a__Boolean())) {
        break lexical_join_316;
    }
    ((com.moon.jk)(life16_20)).a(((boolean)(false)));
    ((com.moon.hW)(p0)).a(((com.moon.iX)(com.moon.iY.a(((float)((life30_347 + 0x1.0p-1f))), ((float)((life31_361 + 0x1.0p-1f))), ((float)((life30_347 + life28_330))), ((float)((life31_361 + life29_343))), ((int)(__sourceIntrinsic_abe755a95741_invokedynamic126_62(532, (8581069337728087024L ^ life11_3))))))));
    lexicalValue126_315_0 = ((com.moon.jk)(life16_20)).a(((boolean)(true)));
    }
    recovery.source.CarrierOps.discard(lexicalValue126_315_0);
    }
    ((com.moon.hW)(p0)).a(((com.moon.iX)(com.moon.iY.a(((float)(life30_347)), ((float)(life31_361)), ((float)((life30_347 + life28_330))), ((float)((life31_361 + life29_343))), ((int)(((com.moon.jk)(life16_20)).b()))))));
    }
    if (!((life13_21 != 0))) {
        break lexical_join_400;
    }
    }
    lexicalValue126_333_0 = ((((com.moon.jj)(life24_127)).e()) ? 1 : 0);
    }
    if (!((life13_21 == 0))) {
        lexicalValue126_405_0 = lexicalValue126_333_0;
        break lexical_join_405;
    }
    if (!((lexicalValue126_333_0 != 0))) {
        break lexical_join_400;
    }
    life31_442 = (((com.moon.jx)(((com.moon.ju)(life17_25)).a__jx())).f() * p2);
    life32_450 = ((p4 + life18_31) + (life31_442 * 0x1.0p1f));
    spill126_13 = p7;
    if (!((life13_21 == 0))) {
        lexicalValue126_358_0 = ((spill126_13) ? 1 : 0);
        break lexical_join_358;
    }
    if (!(spill126_13)) {
        break lexical_join_387;
    }
    spill126_14 = life16_20;
    if (!((life13_21 == 0))) {
        lexicalValue126_386_0 = spill126_14;
        break lexical_join_386;
    }
    lexicalValue126_358_0 = ((((com.moon.jk)(spill126_14)).a__Boolean()) ? 1 : 0);
    }
    if (!((lexicalValue126_358_0 != 0))) {
        break lexical_join_387;
    }
    ((com.moon.jk)(life16_20)).a(((boolean)(false)));
    ((com.moon.hW)(p0)).a(((com.moon.iX)(com.moon.iY.a(((float)((life30_347 + 0x1.0p-1f))), ((float)((life32_450 + 0x1.0p-1f))), ((float)((life30_347 + life28_330))), ((float)((life32_450 + life29_343))), ((int)(__sourceIntrinsic_abe755a95741_invokedynamic126_78(14562, (7997504384980863241L ^ life11_3))))))));
    lexicalValue126_386_0 = ((com.moon.jk)(life16_20)).a(((boolean)(true)));
    }
    recovery.source.CarrierOps.discard(lexicalValue126_386_0);
    }
    ((com.moon.hW)(p0)).a(((com.moon.iX)(com.moon.iY.a(((float)(life30_347)), ((float)(life32_450)), ((float)((life30_347 + life28_330))), ((float)((life32_450 + life29_343))), ((int)(((com.moon.jk)(life16_20)).b()))))));
    }
    life19_33 = (life19_33 + life28_330);
    lexicalValue126_405_0 = life22_45;
    }
    life20_35 = lexicalValue126_405_0;
    }
    life21_37 += 1;
    }
    if (!((life13_21 != 0))) { continue lexical_cycle_38; }
    break lexical_cycle_38;
    }
    }
    return;
}


public com.moon.jy a__jy() {
return this.c;
}


public boolean a__Boolean() {
return ((((this.g) ? 1 : 0)) != 0);
}


public com.moon.ji a__ji() {
return this.a;
}


public float a(float p0) {
return (((com.moon.ji)(this.a)).a() * p0);
}


public float a() {
return this.d;
}


private static native <E extends Throwable> int __sourceIntrinsic_abe755a95741_invokedynamic126_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_abe755a95741_invokedynamic126_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_abe755a95741_invokedynamic126_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_abe755a95741_invokedynamic126_62(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_abe755a95741_invokedynamic126_78(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic606_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic606_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic606_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic606_14(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral1980_0() throws E;

private static native int __sourceIntrinsic_booleanToInteger(boolean value);
private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
