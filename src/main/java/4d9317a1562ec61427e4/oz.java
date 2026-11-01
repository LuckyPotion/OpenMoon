package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class oz extends net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer<moom.Ct> {

private static final moom.DD f;

public moom.jo g;

private static double h;

private static final long i;

private static final long[] j;

private static final java.lang.Integer[] k;

private static final java.util.Map l;

public oz() {
super();
    this.g = new moom.jo();
}


static {
i = ((long)(((moom._a)(moom._c.a(((long)(-820543168148969222L)), ((long)(4029165035624760705L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(244200067114269L)))));
    l = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.oz.i ^ 96036151179317L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1450_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1450_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1450_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1450_14 = new byte[8];
    (__sourceSpill1450_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1450_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1450_16 = __sourceSpill1450_14;
    ((javax.crypto.Cipher)(__sourceSpill1450_11)).init(((int)(__sourceSpill1450_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1450_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1450_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[8];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "ÿa\017\037i+\006\f\013³*´\016º«OeñE~UcÐGH'Ôý¢>?¾´T¶H³\031.îEJ"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1450_25 = local6_life21;
        int __sourceSpill1450_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1450_25)).substring(((int)(__sourceSpill1450_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1450_30 = local8_life19;
        int __sourceSpill1450_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1450_33 = new byte[8];
        (__sourceSpill1450_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1450_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1450_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1450_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1450_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1450_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1450_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1450_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1450_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1450_34)).doFinal(((byte[])(__sourceSpill1450_33)));
        (__sourceSpill1450_30)[__sourceSpill1450_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "áO8ýQ\035[«÷Pæ\004%"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1450_38 = local6_life21;
        int __sourceSpill1450_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1450_38)).substring(((int)(__sourceSpill1450_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1450_43 = local8_life19;
        int __sourceSpill1450_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1450_46 = new byte[8];
        (__sourceSpill1450_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1450_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1450_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1450_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1450_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1450_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1450_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1450_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1450_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1450_47)).doFinal(((byte[])(__sourceSpill1450_46)));
        (__sourceSpill1450_43)[__sourceSpill1450_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    j = ((long[])(local8_life19));
    k = ((java.lang.Integer[])(new java.lang.Integer[8]));
    f = ((moom.DD)(new moom.DD("textures/entity/sign.png")));
    h = ((double)(0x1.0p12d));
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


private static boolean a(moom.Ct p0) {
if (moom.MP.s) {
        return false;
    }
    if ((((((net.minecraft.client.Minecraft)(moom.BU.a__fM())).P instanceof moom.hv) ? 1 : 0) != 0)) {
        return true;
    }
    if ((!moom.BU.u)) {
        if ((((moom.Ct)(p0)).m < 0)) {
        net.minecraft.entity.Entity local1 = ((net.minecraft.client.Minecraft)(moom.BU.a__fM())).a__r3();
        double local2 = ((moom.Ct)(p0)).a(((double)(((net.minecraft.entity.Entity)(local1)).n)), ((double)(((net.minecraft.entity.Entity)(local1)).o)), ((double)(((net.minecraft.entity.Entity)(local1)).p)));
        return ((!(local2 > moom.oz.h)) ? true : false);
    }
    }
    return true;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 25582;
      if (k[var3] == null) {
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
         long var5 = j[var3];
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
         Object[] var9 = (Object[])l.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               l.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/oz", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         k[var3] = var15;
      }

      return k[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.oz.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral8626_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/oz"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(moom.Ct p0, double p1, double p2, double p3, float p4, int p5) {
java.lang.String lexicalValue1265_228_0;
    int spill1265_0;
    long spill1265_1;
    int spill1265_2;
    long life10_3;
    net.minecraft.block.Block life12_6;
    float life13_9;
    float life14_39;
    int life14_54;
    float life15_56;
    net.minecraft.client.gui.FontRenderer life14_153;
    float life15_157;
    int life16_180;
    int life17_189;
    net.minecraft.util.IChatComponent life18_207;
    java.util.List life19_220;
    java.lang.String life20_238;
    java.lang.String life20_245;
    lexical_join_314: {
    lexical_join_291: {
    lexical_join_184: {
    lexical_join_134: {
    lexical_join_131: {
    lexical_join_102: {
    lexical_join_72: {
    lexical_join_67: {
    lexical_join_62: {
    lexical_join_52: {
    life10_3 = (moom.oz.i ^ 39017823519738L);
    life12_6 = ((moom.Ct)(p0)).a__ch();
    moom.kZ.B();
    life13_9 = 0x1.555556p-1f;
    if (!((life12_6 == net.minecraft.init.Blocks.an))) {
        break lexical_join_52;
    }
    moom.kZ.b(((float)((((float) p1) + 0x1.0p-1f))), ((float)((((float) p2) + (0x1.8p-1f * life13_9)))), ((float)((((float) p3) + 0x1.0p-1f))));
    life14_39 = (((float) (((moom.Ct)(p0)).e() * __sourceIntrinsic_f54c81cd9b1a_invokedynamic1265_6(18644, (209446619948434632L ^ life10_3)))) / 0x1.0p4f);
    moom.kZ.b(((float)((-life14_39))), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)));
    ((moom.jD)(((moom.jo)(this.g)).j)).n = ((boolean)(true));
    break lexical_join_102;
    }
    life14_54 = ((moom.Ct)(p0)).e();
    life15_56 = 0x0.0p0f;
    if (!((life14_54 == 2))) {
        break lexical_join_62;
    }
    life15_56 = 0x1.68p7f;
    }
    if (!((life14_54 == 4))) {
        break lexical_join_67;
    }
    life15_56 = 0x1.68p6f;
    }
    if (!((life14_54 == 5))) {
        break lexical_join_72;
    }
    life15_56 = -0x1.68p6f;
    }
    moom.kZ.b(((float)((((float) p1) + 0x1.0p-1f))), ((float)((((float) p2) + (0x1.8p-1f * life13_9)))), ((float)((((float) p3) + 0x1.0p-1f))));
    moom.kZ.b(((float)((-life15_56))), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)));
    moom.kZ.b(((float)(0x0.0p0f)), ((float)(-0x1.4p-2f)), ((float)(-0x1.cp-2f)));
    ((moom.jD)(((moom.jo)(this.g)).j)).n = ((boolean)(false));
    }
    if (!((p5 >= 0))) {
        break lexical_join_131;
    }
    ((moom.oz)(this)).b(((moom.DD)((moom.oz.a)[p5])));
    moom.kZ.l(((int)(__sourceIntrinsic_f54c81cd9b1a_invokedynamic1265_20(21627, (1175212011453175909L ^ life10_3)))));
    spill1265_0 = 2086;
    moom.kZ.B();
    spill1265_1 = (1248955702316336191L ^ life10_3);
    moom.kZ.a(((float)(0x1.0p2f)), ((float)(0x1.0p1f)), ((float)(0x1.0p0f)));
    moom.kZ.b(((float)(0x1.0p-4f)), ((float)(0x1.0p-4f)), ((float)(0x1.0p-4f)));
    moom.kZ.l(((int)(__sourceIntrinsic_f54c81cd9b1a_invokedynamic1265_25(spill1265_0, spill1265_1))));
    break lexical_join_134;
    }
    ((moom.oz)(this)).b(((moom.DD)(moom.oz.f)));
    }
    moom.kZ.y();
    moom.kZ.B();
    moom.kZ.a(((float)(life13_9)), ((float)((-life13_9))), ((float)((-life13_9))));
    ((moom.jo)(this.g)).a();
    moom.kZ.C();
    if (!(moom.oz.a(((moom.Ct)(p0))))) {
        break lexical_join_291;
    }
    life14_153 = ((moom.oz)(this)).a__ga();
    life15_157 = (0x1.0p-6f * life13_9);
    moom.kZ.b(((float)(0x0.0p0f)), ((float)((0x1.0p-1f * life13_9))), ((float)((0x1.1eb852p-4f * life13_9))));
    moom.kZ.a(((float)(life15_157)), ((float)((-life15_157))), ((float)(life15_157)));
    org.lwjgl.opengl.GL11.glNormal3f(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)((-0x1.0p0f * life15_157))));
    moom.kZ.a(((boolean)(false)));
    life16_180 = 0;
    if (!(moom.BU.ag())) {
        break lexical_join_184;
    }
    life16_180 = moom.Jl.d(((int)(life16_180)));
    }
    if (!((p5 < 0))) {
        break lexical_join_291;
    }
    life17_189 = 0;
    lexical_cycle_188: while (true) {
    lexical_join_289: {
    lexical_join_263: {
    lexical_join_228: {
    lexical_join_227: {
    if (!((life17_189 < (((moom.Ct)(p0)).l).length))) {
        break lexical_join_291;
    }
    if (!(((((moom.Ct)(p0)).l)[life17_189] != null))) {
        break lexical_join_289;
    }
    life18_207 = (((moom.Ct)(p0)).l)[life17_189];
    life19_220 = moom.im.a(((net.minecraft.util.IChatComponent)(life18_207)), ((int)(__sourceIntrinsic_f54c81cd9b1a_invokedynamic1265_46(6513, (2465446706198353262L ^ life10_3)))), ((net.minecraft.client.gui.FontRenderer)(life14_153)), ((boolean)(false)), ((boolean)(true)), ((boolean)(false)), ((com.moon.jm)(null)));
    if (!((life19_220 != null))) {
        break lexical_join_227;
    }
    if (!((((java.util.List)(life19_220)).size() > 0))) {
        break lexical_join_227;
    }
    lexicalValue1265_228_0 = ((net.minecraft.util.IChatComponent)(((net.minecraft.util.IChatComponent)(((java.util.List)(life19_220)).get(((int)(0))))))).c();
    break lexical_join_228;
    }
    lexicalValue1265_228_0 = "";
    }
    life20_238 = lexicalValue1265_228_0;
    if (!((life17_189 == ((moom.Ct)(p0)).m))) {
        break lexical_join_263;
    }
    life20_245 = __sourceIntrinsic_f54c81cd9b1a_invokedynamic1265_53(life20_238);
    ((net.minecraft.client.gui.FontRenderer)(life14_153)).b(((java.lang.String)(life20_245)), ((float)(((float) ((-((net.minecraft.client.gui.FontRenderer)(life14_153)).a(((java.lang.String)(life20_245)))) / 2)))), ((float)(((float) ((life17_189 * __sourceIntrinsic_f54c81cd9b1a_invokedynamic1265_55(7181, (7342887640669261845L ^ life10_3))) - ((((moom.Ct)(p0)).l).length * 5))))), ((int)(life16_180)));
    break lexical_join_289;
    }
    ((net.minecraft.client.gui.FontRenderer)(life14_153)).b(((java.lang.String)(life20_238)), ((float)(((float) ((-((net.minecraft.client.gui.FontRenderer)(life14_153)).a(((java.lang.String)(life20_238)))) / 2)))), ((float)(((float) ((life17_189 * __sourceIntrinsic_f54c81cd9b1a_invokedynamic1265_59(26649, (3892288687326553090L ^ life10_3))) - ((((moom.Ct)(p0)).l).length * 5))))), ((int)(life16_180)));
    }
    life17_189 += 1;
    continue lexical_cycle_188;
    }
    }
    moom.kZ.a(((boolean)(true)));
    moom.kZ.c(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    moom.kZ.C();
    if (!((p5 >= 0))) {
        break lexical_join_314;
    }
    moom.kZ.l(((int)(__sourceIntrinsic_f54c81cd9b1a_invokedynamic1265_65(10323, (6693190364718834766L ^ life10_3)))));
    spill1265_2 = 1675;
    moom.kZ.C();
    moom.kZ.l(((int)(__sourceIntrinsic_f54c81cd9b1a_invokedynamic1265_68(spill1265_2, (7795654507790764689L ^ life10_3)))));
    }
    return;
}


public void a__sourceBridge_42179a2d44(net.minecraft.tileentity.TileEntity p0, double p1, double p2, double p3, float p4, int p5) {
((moom.oz)(this)).a(((moom.Ct)(((moom.Ct)(p0)))), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((float)(p4)), ((int)(p5)));
}


public static void a__sourceReturn_da8c82d5d4() {
java.lang.Object local0 = moom.BU.a__fM();
    double local1 = ((double) moom.BU.a(((float)(((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(local0)).W)).aW)), ((float)(0x1.0p0f)), ((float)(0x1.ep6f))));
    double local3 = java.lang.Math.max(((double)(((0x1.8p0d * ((double) ((net.minecraft.client.Minecraft)(local0)).H)) / local1))), ((double)(0x1.0p4d)));
    h = ((double)((local3 * local3)));
    return;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral8626_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f54c81cd9b1a_invokedynamic1265_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f54c81cd9b1a_invokedynamic1265_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f54c81cd9b1a_invokedynamic1265_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f54c81cd9b1a_invokedynamic1265_46(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_f54c81cd9b1a_invokedynamic1265_53(java.lang.String a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f54c81cd9b1a_invokedynamic1265_55(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f54c81cd9b1a_invokedynamic1265_59(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f54c81cd9b1a_invokedynamic1265_65(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f54c81cd9b1a_invokedynamic1265_68(int a0, long a1) throws E;


}
