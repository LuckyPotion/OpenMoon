package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class lz {

private static final long c;

private static final long[] d;

private static final java.lang.Integer[] e;

private static final java.util.Map f;

public lz() {
super();
}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(-2829250586086818235L)), ((long)(-901788071871921712L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(97016120007232L)))));
    f = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.lz.c ^ 102045529015462L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1392_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1392_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1392_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1392_14 = new byte[8];
    (__sourceSpill1392_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1392_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1392_16 = __sourceSpill1392_14;
    ((javax.crypto.Cipher)(__sourceSpill1392_11)).init(((int)(__sourceSpill1392_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1392_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1392_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[9];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "jí?Vª¤êH\036öÿ\177^fßèt\016(nÐ\007ñVR\t¤ £S(q(£¸\002Ç<szÜÂ\\X«¡p§s"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1392_25 = local6_life21;
        int __sourceSpill1392_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1392_25)).substring(((int)(__sourceSpill1392_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1392_30 = local8_life19;
        int __sourceSpill1392_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1392_33 = new byte[8];
        (__sourceSpill1392_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1392_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1392_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1392_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1392_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1392_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1392_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1392_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1392_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1392_34)).doFinal(((byte[])(__sourceSpill1392_33)));
        (__sourceSpill1392_30)[__sourceSpill1392_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "¬§¦$¾Ô\030UÝ»Ësv"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1392_38 = local6_life21;
        int __sourceSpill1392_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1392_38)).substring(((int)(__sourceSpill1392_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1392_43 = local8_life19;
        int __sourceSpill1392_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1392_46 = new byte[8];
        (__sourceSpill1392_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1392_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1392_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1392_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1392_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1392_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1392_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1392_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1392_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1392_47)).doFinal(((byte[])(__sourceSpill1392_46)));
        (__sourceSpill1392_43)[__sourceSpill1392_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    d = ((long[])(local8_life19));
    e = ((java.lang.Integer[])(new java.lang.Integer[9]));
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral8370_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/lz"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.lz.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 23836;
      if (e[var3] == null) {
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
         long var5 = d[var3];
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
         Object[] var9 = (Object[])f.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               f.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/lz", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         e[var3] = var15;
      }

      return e[var3];
}


public void a(moom.lw p0) {
int spill100121_0;
    long life2_3;
    moom.oD life4_24;
    int life5_27;
    java.nio.ByteBuffer life6_30;
    java.util.List life7_33;
    int life8_35;
    moom.oF life9_44;
    net.minecraft.client.renderer.vertex.VertexFormatElement$EnumUsage life10_47;
    int life11_51;
    int life12_54;
    int life8_146;
    int life9_149;
    moom.oF life10_157;
    net.minecraft.client.renderer.vertex.VertexFormatElement$EnumUsage life11_160;
    int life12_163;
    forest_join_202: {
    forest_join_142: {
    forest_join_136: {
    forest_join_126: {
    forest_join_120: {
    forest_join_19: {
    life2_3 = (moom.lz.c ^ 132880574895132L);
    if (!((((moom.lw)(p0)).b__Int() > 0))) {
        break forest_join_202;
    }
    if (!((((moom.lw)(p0)).c__Int() == __sourceIntrinsic_b9a71cb929ad_invokedynamic100121_3(29758, (1249103025001076365L ^ life2_3))))) {
        break forest_join_19;
    }
    if (!(moom.BU.aI())) {
        break forest_join_19;
    }
    ((moom.lw)(p0)).g();
    }
    life4_24 = ((moom.lw)(p0)).a__oD();
    life5_27 = ((moom.oD)(life4_24)).d();
    life6_30 = ((moom.lw)(p0)).a__ByteBuffer();
    life7_33 = ((moom.oD)(life4_24)).a__List();
    life8_35 = 0;
    forest_cycle_33: while (true) {
    forest_join_118: {
    forest_join_108: {
    forest_join_95: {
    forest_join_76: {
    forest_join_63: {
    if (!((life8_35 < ((java.util.List)(life7_33)).size()))) {
        break forest_join_120;
    }
    life9_44 = ((moom.oF)(((java.util.List)(life7_33)).get(((int)(life8_35)))));
    life10_47 = ((moom.oF)(life9_44)).a__aK();
    life11_51 = ((net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType)(((moom.oF)(life9_44)).a__aJ())).b();
    life12_54 = ((moom.oF)(life9_44)).b();
    ((java.nio.ByteBuffer)(life6_30)).position(((int)(((moom.oD)(life4_24)).b(((int)(life8_35))))));
    switch ((moom.lB.a)[((net.minecraft.client.renderer.vertex.VertexFormatElement$EnumUsage)(life10_47)).ordinal()]) {
case 1:
{
        break forest_join_63;
    }
case 2:
{
        break forest_join_76;
    }
case 3:
{
        break forest_join_95;
    }
case 4:
{
        break forest_join_108;
    }
default:
{
        break forest_join_118;
    }
}
    }
    org.lwjgl.opengl.GL11.glVertexPointer(((int)(((moom.oF)(life9_44)).a())), ((int)(life11_51)), ((int)(life5_27)), ((java.nio.ByteBuffer)(life6_30)));
    org.lwjgl.opengl.GL11.glEnableClientState(((int)(__sourceIntrinsic_b9a71cb929ad_invokedynamic100121_23(26812, (8381830458673170958L ^ life2_3)))));
    break forest_join_118;
    }
    net.minecraft.client.renderer.OpenGlHelper.j(((int)((net.minecraft.client.renderer.OpenGlHelper.q + life12_54))));
    spill100121_0 = 18703;
    org.lwjgl.opengl.GL11.glTexCoordPointer(((int)(((moom.oF)(life9_44)).a())), ((int)(life11_51)), ((int)(life5_27)), ((java.nio.ByteBuffer)(life6_30)));
    org.lwjgl.opengl.GL11.glEnableClientState(((int)(__sourceIntrinsic_b9a71cb929ad_invokedynamic100121_29(spill100121_0, (1471354727097379769L ^ life2_3)))));
    net.minecraft.client.renderer.OpenGlHelper.j(((int)(net.minecraft.client.renderer.OpenGlHelper.q)));
    break forest_join_118;
    }
    org.lwjgl.opengl.GL11.glColorPointer(((int)(((moom.oF)(life9_44)).a())), ((int)(life11_51)), ((int)(life5_27)), ((java.nio.ByteBuffer)(life6_30)));
    org.lwjgl.opengl.GL11.glEnableClientState(((int)(__sourceIntrinsic_b9a71cb929ad_invokedynamic100121_35(24797, (169682242171667053L ^ life2_3)))));
    break forest_join_118;
    }
    org.lwjgl.opengl.GL11.glNormalPointer(((int)(life11_51)), ((int)(life5_27)), ((java.nio.ByteBuffer)(life6_30)));
    org.lwjgl.opengl.GL11.glEnableClientState(((int)(__sourceIntrinsic_b9a71cb929ad_invokedynamic100121_38(5945, (1965803286544610700L ^ life2_3)))));
    }
    life8_35 += 1;
    continue forest_cycle_33;
    }
    }
    if (!(((moom.lw)(p0)).a__Boolean())) {
        break forest_join_126;
    }
    ((moom.lw)(p0)).f();
    break forest_join_142;
    }
    if (!(moom.BU.ap())) {
        break forest_join_136;
    }
    moom.MH.a(((int)(((moom.lw)(p0)).c__Int())), ((int)(0)), ((int)(((moom.lw)(p0)).b__Int())), ((moom.lw)(p0)));
    break forest_join_142;
    }
    org.lwjgl.opengl.GL11.glDrawArrays(((int)(((moom.lw)(p0)).c__Int())), ((int)(0)), ((int)(((moom.lw)(p0)).b__Int())));
    }
    life8_146 = 0;
    life9_149 = ((java.util.List)(life7_33)).size();
    forest_cycle_147: while (true) {
    forest_join_200: {
    forest_join_194: {
    forest_join_186: {
    forest_join_173: {
    forest_join_166: {
    if (!((life8_146 < life9_149))) {
        break forest_join_202;
    }
    life10_157 = ((moom.oF)(((java.util.List)(life7_33)).get(((int)(life8_146)))));
    life11_160 = ((moom.oF)(life10_157)).a__aK();
    life12_163 = ((moom.oF)(life10_157)).b();
    switch ((moom.lB.a)[((net.minecraft.client.renderer.vertex.VertexFormatElement$EnumUsage)(life11_160)).ordinal()]) {
case 1:
{
        break forest_join_166;
    }
case 2:
{
        break forest_join_173;
    }
case 3:
{
        break forest_join_186;
    }
case 4:
{
        break forest_join_194;
    }
default:
{
        break forest_join_200;
    }
}
    }
    org.lwjgl.opengl.GL11.glDisableClientState(((int)(__sourceIntrinsic_b9a71cb929ad_invokedynamic100121_56(29911, (4440761688362063456L ^ life2_3)))));
    break forest_join_200;
    }
    net.minecraft.client.renderer.OpenGlHelper.j(((int)((net.minecraft.client.renderer.OpenGlHelper.q + life12_163))));
    org.lwjgl.opengl.GL11.glDisableClientState(((int)(__sourceIntrinsic_b9a71cb929ad_invokedynamic100121_60(3262, (6168251103037320714L ^ life2_3)))));
    net.minecraft.client.renderer.OpenGlHelper.j(((int)(net.minecraft.client.renderer.OpenGlHelper.q)));
    break forest_join_200;
    }
    org.lwjgl.opengl.GL11.glDisableClientState(((int)(__sourceIntrinsic_b9a71cb929ad_invokedynamic100121_64(26064, (8138104735521703789L ^ life2_3)))));
    moom.kZ.D();
    break forest_join_200;
    }
    org.lwjgl.opengl.GL11.glDisableClientState(((int)(__sourceIntrinsic_b9a71cb929ad_invokedynamic100121_67(6175, (7085917549094304430L ^ life2_3)))));
    }
    life8_146 += 1;
    continue forest_cycle_147;
    }
    }
    ((moom.lw)(p0)).a__Void();
    return;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral8370_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b9a71cb929ad_invokedynamic100121_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b9a71cb929ad_invokedynamic100121_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b9a71cb929ad_invokedynamic100121_29(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b9a71cb929ad_invokedynamic100121_35(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b9a71cb929ad_invokedynamic100121_38(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b9a71cb929ad_invokedynamic100121_56(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b9a71cb929ad_invokedynamic100121_60(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b9a71cb929ad_invokedynamic100121_64(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b9a71cb929ad_invokedynamic100121_67(int a0, long a1) throws E;
}
