package net.minecraft.client.renderer.block.model;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class ItemModelGenerator {

public static final java.util.List<java.lang.String> a;

private static final long b;

private static final long[] c;

private static final java.lang.Integer[] d;

private static final java.util.Map e;

public ItemModelGenerator() {
super();
}


static {
b = ((long)(((moom._a)(moom._c.a(((long)(-5282362310537522647L)), ((long)(-5787532409138884880L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(239096642479469L)))));
    e = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (net.minecraft.client.renderer.block.model.ItemModelGenerator.b ^ 47753798546150L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1174_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1174_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1174_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1174_14 = new byte[8];
    (__sourceSpill1174_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1174_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1174_16 = __sourceSpill1174_14;
    ((javax.crypto.Cipher)(__sourceSpill1174_11)).init(((int)(__sourceSpill1174_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1174_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1174_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "-5\031vä<%èËm4¶)·n"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1174_25 = local6_life21;
        int __sourceSpill1174_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1174_25)).substring(((int)(__sourceSpill1174_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1174_30 = local8_life19;
        int __sourceSpill1174_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1174_33 = new byte[8];
        (__sourceSpill1174_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1174_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1174_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1174_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1174_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1174_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1174_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1174_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1174_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1174_34)).doFinal(((byte[])(__sourceSpill1174_33)));
        (__sourceSpill1174_30)[__sourceSpill1174_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    c = ((long[])(local8_life19));
    d = ((java.lang.Integer[])(new java.lang.Integer[2]));
    java.lang.String[] __sourceSpill1174_39 = new java.lang.String[5];
    (__sourceSpill1174_39)[0] = "layer0";
    (__sourceSpill1174_39)[1] = "layer1";
    (__sourceSpill1174_39)[2] = "layer2";
    (__sourceSpill1174_39)[3] = "layer3";
    (__sourceSpill1174_39)[4] = "layer4";
    a = ((java.util.List)(com.google.common.collect.Lists.newArrayList(((java.lang.Object[])(__sourceSpill1174_39)))));
}


private boolean a(int[] p0, int p1, int p2, int p3, int p4) {
int forwardValue4821_37_0;
    long life6_3;
    forward_join_37: {
    forward_join_36: {
    forward_join_34: {
    life6_3 = (net.minecraft.client.renderer.block.model.ItemModelGenerator.b ^ 77812361549889L);
    if (!((p1 >= 0))) {
        break forward_join_34;
    }
    if (!((p2 >= 0))) {
        break forward_join_34;
    }
    if (!((p1 < p3))) {
        break forward_join_34;
    }
    if (!((p2 < p4))) {
        break forward_join_34;
    }
    if (!(((((p0)[((p2 * p3) + p1)] >> __sourceIntrinsic_410841430c5f_invokedynamic4821_1(18794, (2947478089941904583L ^ life6_3))) & __sourceIntrinsic_410841430c5f_invokedynamic4821_2(21138, (1275253403423733566L ^ life6_3))) == 0))) {
        break forward_join_36;
    }
    }
    forwardValue4821_37_0 = 1;
    break forward_join_37;
    }
    forwardValue4821_37_0 = 0;
    }
    return ((forwardValue4821_37_0) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 18185;
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
            throw new RuntimeException("moom/lS", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         d[var3] = var15;
      }

      return d[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_09103825312d17(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral10720_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/lS"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public net.minecraft.client.renderer.block.model.ModelBlock a(net.minecraft.client.renderer.texture.TextureMap p0, net.minecraft.client.renderer.block.model.ModelBlock p1) {
java.util.HashMap life3_1;
    java.util.ArrayList life4_3;
    int life5_5;
    java.lang.String life6_14;
    java.lang.String life7_25;
    net.minecraft.client.renderer.texture.TextureAtlasSprite life8_38;
    life3_1 = com.google.common.collect.Maps.newHashMap();
    life4_3 = com.google.common.collect.Lists.newArrayList();
    life5_5 = 0;
    loop_region_6: while ((life5_5 < ((java.util.List)(net.minecraft.client.renderer.block.model.ItemModelGenerator.a)).size())) {
        life6_14 = ((java.lang.String)(((java.util.List)(net.minecraft.client.renderer.block.model.ItemModelGenerator.a)).get(((int)(life5_5)))));
        if ((!((net.minecraft.client.renderer.block.model.ModelBlock)(p1)).a__Boolean(((java.lang.String)(life6_14))))) {
        break loop_region_6;
    }
        life7_25 = ((net.minecraft.client.renderer.block.model.ModelBlock)(p1)).a(((java.lang.String)(life6_14)));
        ((java.util.Map)(life3_1)).put(((java.lang.Object)(life6_14)), ((java.lang.Object)(life7_25)));
        life8_38 = ((net.minecraft.client.renderer.texture.TextureMap)(p0)).a(((java.lang.String)(((moom.DD)(new moom.DD(life7_25))).toString())));
        ((java.util.List)(life4_3)).addAll(((java.util.Collection)(this.a(((int)(life5_5)), ((java.lang.String)(life6_14)), ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(life8_38))))));
        life5_5 += 1;
    }
    if (((java.util.List)(life4_3)).isEmpty()) {
        return null;
    }
    java.util.HashMap spill8592_0 = life3_1;
    java.lang.String spill8592_1 = "particle";
    ((java.util.Map)(spill8592_0)).put(((java.lang.Object)(spill8592_1)), ((java.lang.Object)((((net.minecraft.client.renderer.block.model.ModelBlock)(p1)).a__Boolean(((java.lang.String)("particle"))) ? ((net.minecraft.client.renderer.block.model.ModelBlock)(p1)).a(((java.lang.String)("particle"))) : ((java.lang.String)(((java.util.Map)(life3_1)).get(((java.lang.Object)("layer0")))))))));
    return new net.minecraft.client.renderer.block.model.ModelBlock(life4_3, life3_1, false, false, ((net.minecraft.client.renderer.block.model.ModelBlock)(p1)).a__lP());
}


private java.util.List<net.minecraft.client.renderer.block.model.BlockPart> a(int p0, java.lang.String p1, net.minecraft.client.renderer.texture.TextureAtlasSprite p2) {
java.util.HashMap local4_life1 = com.google.common.collect.Maps.newHashMap();
    ((java.util.Map)(local4_life1)).put(((java.lang.Object)(moom.bs.SOUTH)), ((java.lang.Object)(new net.minecraft.client.renderer.block.model.BlockPartFace(null, p0, p1, new moom.lE(new float[] {0x0.0p0f, 0x0.0p0f, 1098907648, 1098907648}, 0)))));
    ((java.util.Map)(local4_life1)).put(((java.lang.Object)(moom.bs.NORTH)), ((java.lang.Object)(new net.minecraft.client.renderer.block.model.BlockPartFace(null, p0, p1, new moom.lE(new float[] {1098907648, 0x0.0p0f, 0x0.0p0f, 1098907648}, 0)))));
    java.util.ArrayList local5_life11 = com.google.common.collect.Lists.newArrayList();
    ((java.util.List)(local5_life11)).add(((java.lang.Object)(new net.minecraft.client.renderer.block.model.BlockPart(new org.lwjgl.util.vector.Vector3f(0x0.0p0f, 0x0.0p0f, 1089470464), new org.lwjgl.util.vector.Vector3f(1098907648, 1098907648, 1091043328), ((java.util.Map) local4_life1), null, true))));
    ((java.util.List)(local5_life11)).addAll(((java.util.Collection)(this.a(((net.minecraft.client.renderer.texture.TextureAtlasSprite)(p2)), ((java.lang.String)(p1)), ((int)(p0))))));
    return local5_life11;
}


private java.util.List<net.minecraft.client.renderer.block.model.BlockPart> a(net.minecraft.client.renderer.texture.TextureAtlasSprite p0, java.lang.String p1, int p2) {
float life4_3;
    float life5_7;
    java.util.ArrayList life6_9;
    java.util.Iterator life7_14;
    net.minecraft.client.renderer.block.model.ItemModelGenerator$Span life8_21;
    float life9_23;
    float life10_25;
    float life11_27;
    float life12_29;
    float life13_31;
    float life14_33;
    float life15_35;
    float life16_37;
    float life17_39;
    float life18_41;
    float life19_45;
    float life20_49;
    float life21_53;
    net.minecraft.client.renderer.block.model.ItemModelGenerator$SpanFacing life22_56;
    float life23_188;
    float life24_192;
    float life9_196;
    float life11_200;
    float life10_204;
    float life12_208;
    float life10_212;
    float life12_216;
    float life13_220;
    float life14_224;
    float life15_228;
    float life16_232;
    java.util.HashMap life25_234;
    lexical_join_361: {
    life4_3 = ((float) ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(p0)).c__Int());
    life5_7 = ((float) ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(p0)).d__Int());
    life6_9 = com.google.common.collect.Lists.newArrayList();
    life7_14 = ((java.util.List)(this.a(((net.minecraft.client.renderer.texture.TextureAtlasSprite)(p0))))).iterator();
    lexical_cycle_15: while (true) {
    lexical_join_360: {
    lexical_join_339: {
    lexical_join_317: {
    lexical_join_295: {
    lexical_join_273: {
    lexical_join_185: {
    lexical_join_153: {
    lexical_join_124: {
    lexical_join_91: {
    lexical_join_62: {
    if (!(((java.util.Iterator)(life7_14)).hasNext())) {
        break lexical_join_361;
    }
    life8_21 = ((net.minecraft.client.renderer.block.model.ItemModelGenerator$Span)(((java.util.Iterator)(life7_14)).next()));
    life9_23 = 0x0.0p0f;
    life10_25 = 0x0.0p0f;
    life11_27 = 0x0.0p0f;
    life12_29 = 0x0.0p0f;
    life13_31 = 0x0.0p0f;
    life14_33 = 0x0.0p0f;
    life15_35 = 0x0.0p0f;
    life16_37 = 0x0.0p0f;
    life17_39 = 0x0.0p0f;
    life18_41 = 0x0.0p0f;
    life19_45 = ((float) ((net.minecraft.client.renderer.block.model.ItemModelGenerator$Span)(life8_21)).a());
    life20_49 = ((float) ((net.minecraft.client.renderer.block.model.ItemModelGenerator$Span)(life8_21)).b());
    life21_53 = ((float) ((net.minecraft.client.renderer.block.model.ItemModelGenerator$Span)(life8_21)).c());
    life22_56 = ((net.minecraft.client.renderer.block.model.ItemModelGenerator$Span)(life8_21)).a__aG();
    switch ((net.minecraft.client.renderer.block.model.ItemModelGenerator$1.a)[((net.minecraft.client.renderer.block.model.ItemModelGenerator$SpanFacing)(life22_56)).ordinal()]) {
case 1:
{
        break lexical_join_62;
    }
case 2:
{
        break lexical_join_91;
    }
case 3:
{
        break lexical_join_124;
    }
case 4:
{
        break lexical_join_153;
    }
default:
{
        break lexical_join_185;
    }
}
    }
    life13_31 = life19_45;
    life9_23 = life19_45;
    life11_27 = (life14_33 = (life20_49 + 0x1.0p0f));
    life15_35 = life21_53;
    life10_25 = life21_53;
    life16_37 = life21_53;
    life12_29 = life21_53;
    life17_39 = (0x1.0p4f / life4_3);
    life18_41 = (0x1.0p4f / (life5_7 - 0x1.0p0f));
    break lexical_join_185;
    }
    life16_37 = life21_53;
    life15_35 = life21_53;
    life13_31 = life19_45;
    life9_23 = life19_45;
    life11_27 = (life14_33 = (life20_49 + 0x1.0p0f));
    life10_25 = (life21_53 + 0x1.0p0f);
    life12_29 = (life21_53 + 0x1.0p0f);
    life17_39 = (0x1.0p4f / life4_3);
    life18_41 = (0x1.0p4f / (life5_7 - 0x1.0p0f));
    break lexical_join_185;
    }
    life13_31 = life21_53;
    life9_23 = life21_53;
    life14_33 = life21_53;
    life11_27 = life21_53;
    life16_37 = life19_45;
    life10_25 = life19_45;
    life12_29 = (life15_35 = (life20_49 + 0x1.0p0f));
    life17_39 = (0x1.0p4f / (life4_3 - 0x1.0p0f));
    life18_41 = (0x1.0p4f / life5_7);
    break lexical_join_185;
    }
    life14_33 = life21_53;
    life13_31 = life21_53;
    life9_23 = (life21_53 + 0x1.0p0f);
    life11_27 = (life21_53 + 0x1.0p0f);
    life16_37 = life19_45;
    life10_25 = life19_45;
    life12_29 = (life15_35 = (life20_49 + 0x1.0p0f));
    life17_39 = (0x1.0p4f / (life4_3 - 0x1.0p0f));
    life18_41 = (0x1.0p4f / life5_7);
    }
    life23_188 = (0x1.0p4f / life4_3);
    life24_192 = (0x1.0p4f / life5_7);
    life9_196 = (life9_23 * life23_188);
    life11_200 = (life11_27 * life23_188);
    life10_204 = (life10_25 * life24_192);
    life12_208 = (life12_29 * life24_192);
    life10_212 = (0x1.0p4f - life10_204);
    life12_216 = (0x1.0p4f - life12_208);
    life13_220 = (life13_31 * life17_39);
    life14_224 = (life14_33 * life17_39);
    life15_228 = (life15_35 * life18_41);
    life16_232 = (life16_37 * life18_41);
    life25_234 = com.google.common.collect.Maps.newHashMap();
    ((java.util.Map)(life25_234)).put(((java.lang.Object)(((net.minecraft.client.renderer.block.model.ItemModelGenerator$SpanFacing)(life22_56)).a__bs())), ((java.lang.Object)(new net.minecraft.client.renderer.block.model.BlockPartFace(null, p2, p1, new moom.lE(new float[] {life13_220, life15_228, life14_224, life16_232}, 0)))));
    switch ((net.minecraft.client.renderer.block.model.ItemModelGenerator$1.a)[((net.minecraft.client.renderer.block.model.ItemModelGenerator$SpanFacing)(life22_56)).ordinal()]) {
case 1:
{
        break lexical_join_273;
    }
case 2:
{
        break lexical_join_295;
    }
case 3:
{
        break lexical_join_317;
    }
case 4:
{
        break lexical_join_339;
    }
default:
{
        break lexical_join_360;
    }
}
    }
    ((java.util.List)(life6_9)).add(((java.lang.Object)(new net.minecraft.client.renderer.block.model.BlockPart(new org.lwjgl.util.vector.Vector3f(life9_196, life10_212, 0x1.ep2f), new org.lwjgl.util.vector.Vector3f(life11_200, life10_212, 0x1.1p3f), life25_234, null, true))));
    break lexical_join_360;
    }
    ((java.util.List)(life6_9)).add(((java.lang.Object)(new net.minecraft.client.renderer.block.model.BlockPart(new org.lwjgl.util.vector.Vector3f(life9_196, life12_216, 0x1.ep2f), new org.lwjgl.util.vector.Vector3f(life11_200, life12_216, 0x1.1p3f), life25_234, null, true))));
    break lexical_join_360;
    }
    ((java.util.List)(life6_9)).add(((java.lang.Object)(new net.minecraft.client.renderer.block.model.BlockPart(new org.lwjgl.util.vector.Vector3f(life9_196, life10_212, 0x1.ep2f), new org.lwjgl.util.vector.Vector3f(life9_196, life12_216, 0x1.1p3f), life25_234, null, true))));
    break lexical_join_360;
    }
    ((java.util.List)(life6_9)).add(((java.lang.Object)(new net.minecraft.client.renderer.block.model.BlockPart(new org.lwjgl.util.vector.Vector3f(life11_200, life10_212, 0x1.ep2f), new org.lwjgl.util.vector.Vector3f(life11_200, life12_216, 0x1.1p3f), life25_234, null, true))));
    }
    continue lexical_cycle_15;
    }
    }
    return life6_9;
}


private java.util.List<net.minecraft.client.renderer.block.model.ItemModelGenerator$Span> a(net.minecraft.client.renderer.texture.TextureAtlasSprite p0) {
int local2 = ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(p0)).c__Int();
    int local3 = ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(p0)).d__Int();
    java.util.ArrayList local4 = com.google.common.collect.Lists.newArrayList();
    int local5 = 0;
    while ((local5 < ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(p0)).e())) {
        int[] local6 = (((net.minecraft.client.renderer.texture.TextureAtlasSprite)(p0)).a__ArrayArrayInt(((int)(local5))))[0];
        int local7 = 0;
        while ((local7 < local3)) {
        int local8 = 0;
        while ((local8 < local2)) {
        int local9 = ((!this.a(((int[])(local6)), ((int)(local8)), ((int)(local7)), ((int)(local2)), ((int)(local3)))) ? 1 : 0);
        this.a(((net.minecraft.client.renderer.block.model.ItemModelGenerator$SpanFacing)(net.minecraft.client.renderer.block.model.ItemModelGenerator$SpanFacing.UP)), ((java.util.List)(local4)), ((int[])(local6)), ((int)(local8)), ((int)(local7)), ((int)(local2)), ((int)(local3)), ((boolean)__sourceIntrinsic_integerToBoolean((local9))));
        this.a(((net.minecraft.client.renderer.block.model.ItemModelGenerator$SpanFacing)(net.minecraft.client.renderer.block.model.ItemModelGenerator$SpanFacing.DOWN)), ((java.util.List)(local4)), ((int[])(local6)), ((int)(local8)), ((int)(local7)), ((int)(local2)), ((int)(local3)), ((boolean)__sourceIntrinsic_integerToBoolean((local9))));
        this.a(((net.minecraft.client.renderer.block.model.ItemModelGenerator$SpanFacing)(net.minecraft.client.renderer.block.model.ItemModelGenerator$SpanFacing.LEFT)), ((java.util.List)(local4)), ((int[])(local6)), ((int)(local8)), ((int)(local7)), ((int)(local2)), ((int)(local3)), ((boolean)__sourceIntrinsic_integerToBoolean((local9))));
        this.a(((net.minecraft.client.renderer.block.model.ItemModelGenerator$SpanFacing)(net.minecraft.client.renderer.block.model.ItemModelGenerator$SpanFacing.RIGHT)), ((java.util.List)(local4)), ((int[])(local6)), ((int)(local8)), ((int)(local7)), ((int)(local2)), ((int)(local3)), ((boolean)__sourceIntrinsic_integerToBoolean((local9))));
        local8 += 1;
    }
        local7 += 1;
    }
        local5 += 1;
    }
    return local4;
}


private void a(net.minecraft.client.renderer.block.model.ItemModelGenerator$SpanFacing p0, java.util.List<net.minecraft.client.renderer.block.model.ItemModelGenerator$Span> p1, int[] p2, int p3, int p4, int p5, int p6, boolean p7) {
int forwardValue4819_19_0;
    int life9_24;
    forward_join_28: {
    forward_join_19: {
    forward_join_18: {
    if (!(this.a(((int[])(p2)), ((int)((p3 + ((net.minecraft.client.renderer.block.model.ItemModelGenerator$SpanFacing)(p0)).a()))), ((int)((p4 + ((net.minecraft.client.renderer.block.model.ItemModelGenerator$SpanFacing)(p0)).b()))), ((int)(p5)), ((int)(p6))))) {
        break forward_join_18;
    }
    if (!(p7)) {
        break forward_join_18;
    }
    forwardValue4819_19_0 = 1;
    break forward_join_19;
    }
    forwardValue4819_19_0 = 0;
    }
    life9_24 = forwardValue4819_19_0;
    if (!((life9_24 != 0))) {
        break forward_join_28;
    }
    this.a(((java.util.List)(p1)), ((net.minecraft.client.renderer.block.model.ItemModelGenerator$SpanFacing)(p0)), ((int)(p3)), ((int)(p4)));
    }
    return;
}


private void a(java.util.List<net.minecraft.client.renderer.block.model.ItemModelGenerator$Span> p0, net.minecraft.client.renderer.block.model.ItemModelGenerator$SpanFacing p1, int p2, int p3) {
int forestValue1065_22_0;
    int forestValue1065_37_0;
    int forestValue1065_44_0;
    net.minecraft.client.renderer.block.model.ItemModelGenerator$Span life5_1;
    java.util.Iterator life6_4;
    net.minecraft.client.renderer.block.model.ItemModelGenerator$Span life7_11;
    int life8_23;
    int life6_39;
    int life7_46;
    forest_join_60: {
    forest_join_57: {
    forest_join_44: {
    forest_join_43: {
    forest_join_37: {
    forest_join_36: {
    forest_join_31: {
    forest_join_29: {
    life5_1 = null;
    life6_4 = ((java.util.List)(p0)).iterator();
    forest_cycle_5: while (true) {
    forest_join_28: {
    forest_join_22: {
    forest_join_21: {
    if (!(((java.util.Iterator)(life6_4)).hasNext())) {
        break forest_join_31;
    }
    life7_11 = ((net.minecraft.client.renderer.block.model.ItemModelGenerator$Span)(((java.util.Iterator)(life6_4)).next()));
    if (!((((net.minecraft.client.renderer.block.model.ItemModelGenerator$Span)(life7_11)).a__aG() == p1))) {
        break forest_join_28;
    }
    if (!(__sourceExactCall_d03d4008157744(((net.minecraft.client.renderer.block.model.ItemModelGenerator$SpanFacing)(p1))))) {
        break forest_join_21;
    }
    forestValue1065_22_0 = p3;
    break forest_join_22;
    }
    forestValue1065_22_0 = p2;
    }
    life8_23 = forestValue1065_22_0;
    if (!((((net.minecraft.client.renderer.block.model.ItemModelGenerator$Span)(life7_11)).c() == life8_23))) {
        break forest_join_28;
    }
    break forest_join_29;
    }
    continue forest_cycle_5;
    }
    }
    life5_1 = life7_11;
    }
    if (!(__sourceExactCall_d03d4008157744(((net.minecraft.client.renderer.block.model.ItemModelGenerator$SpanFacing)(p1))))) {
        break forest_join_36;
    }
    forestValue1065_37_0 = p3;
    break forest_join_37;
    }
    forestValue1065_37_0 = p2;
    }
    life6_39 = forestValue1065_37_0;
    if (!(__sourceExactCall_d03d4008157744(((net.minecraft.client.renderer.block.model.ItemModelGenerator$SpanFacing)(p1))))) {
        break forest_join_43;
    }
    forestValue1065_44_0 = p2;
    break forest_join_44;
    }
    forestValue1065_44_0 = p3;
    }
    life7_46 = forestValue1065_44_0;
    if (!((life5_1 == null))) {
        break forest_join_57;
    }
    ((java.util.List)(p0)).add(((java.lang.Object)(new net.minecraft.client.renderer.block.model.ItemModelGenerator$Span(p1, life7_46, life6_39))));
    break forest_join_60;
    }
    ((net.minecraft.client.renderer.block.model.ItemModelGenerator$Span)(life5_1)).a(((int)(life7_46)));
    }
    return;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral10720_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_410841430c5f_invokedynamic4821_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_410841430c5f_invokedynamic4821_2(int a0, long a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native int __sourceExactCall_09103825312d17(int p0, long p1);

private static native boolean __sourceExactCall_d03d4008157744(net.minecraft.client.renderer.block.model.ItemModelGenerator$SpanFacing p0);
}
