package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class oe {

private int a;

private java.util.Set<net.minecraft.client.renderer.texture.Stitcher$Holder> b;

private java.util.List<net.minecraft.client.renderer.texture.Stitcher$Slot> c;

private int d;

private int e;

private int f;

private int g;

private boolean h;

private int i;

private static long j;

private static long[] k;

private static java.lang.Integer[] l;

private static java.util.Map m;

public oe(int p0, int p1, boolean p2, int p3, int p4) { super(); }


private static void __sourceConstructorBody_390c11d8fa263ebc(moom.oe receiver, int p0, int p1, boolean p2, int p3, int p4) throws Throwable {

long local6 = (moom.oe.j ^ 127607950906641L);

    moom.oe.__sourceConstructorInit_390c11d8fa263ebc_0(((moom.oe)(receiver)));

    ((moom.oe)(receiver)).b = ((java.util.Set)(com.google.common.collect.Sets.newHashSetWithExpectedSize(((int)(__sourceIntrinsic_390c11d8fa263ebc_originalDynamicSite3168_2(13306, (7751534110049106456L ^ local6)))))));

    ((moom.oe)(receiver)).c = ((java.util.List)(com.google.common.collect.Lists.newArrayListWithCapacity(((int)(__sourceIntrinsic_390c11d8fa263ebc_originalDynamicSite3168_5(23922, (4421426141119714449L ^ local6)))))));

    ((moom.oe)(receiver)).a = ((int)(p4));

    ((moom.oe)(receiver)).f = ((int)(p0));

    ((moom.oe)(receiver)).g = ((int)(p1));

    ((moom.oe)(receiver)).h = ((boolean)(p2));

    ((moom.oe)(receiver)).i = ((int)(p3));

    return;

}



static {
j = ((long)(((moom._a)(moom._c.a(((long)(-8269578033827496907L)), ((long)(7096888168841364345L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(173202229593847L)))));
    m = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.oe.j ^ 347839601540L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1442_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1442_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1442_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1442_14 = new byte[8];
    (__sourceSpill1442_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1442_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1442_16 = __sourceSpill1442_14;
    ((javax.crypto.Cipher)(__sourceSpill1442_11)).init(((int)(__sourceSpill1442_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1442_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1442_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[4];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "j\036­Uã»Es®P{×è\017F"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1442_25 = local6_life21;
        int __sourceSpill1442_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1442_25)).substring(((int)(__sourceSpill1442_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1442_30 = local8_life19;
        int __sourceSpill1442_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1442_33 = new byte[8];
        (__sourceSpill1442_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1442_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1442_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1442_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1442_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1442_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1442_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1442_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1442_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1442_34)).doFinal(((byte[])(__sourceSpill1442_33)));
        (__sourceSpill1442_30)[__sourceSpill1442_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "!Ø@_\025JC«\002î\013\\¾[P"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1442_38 = local6_life21;
        int __sourceSpill1442_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1442_38)).substring(((int)(__sourceSpill1442_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1442_43 = local8_life19;
        int __sourceSpill1442_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1442_46 = new byte[8];
        (__sourceSpill1442_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1442_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1442_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1442_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1442_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1442_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1442_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1442_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1442_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1442_47)).doFinal(((byte[])(__sourceSpill1442_46)));
        (__sourceSpill1442_43)[__sourceSpill1442_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    k = ((long[])(local8_life19));
    l = ((java.lang.Integer[])(new java.lang.Integer[4]));
}

private static native <E extends Throwable> void __sourceConstructorInit_390c11d8fa263ebc_0(moom.oe a0) throws E;

private boolean b(net.minecraft.client.renderer.texture.Stitcher$Holder p0) {
int forestValue909_15_0;
    int forestValue909_46_0;
    int forestValue909_54_0;
    int forestValue909_67_0;
    int forestValue909_74_0;
    int forestValue909_84_0;
    int forestValue909_94_0;
    int forestValue909_106_0;
    int forestValue909_117_0;
    int forestValue909_136_0;
    int forestValue909_150_0;
    int forestValue909_158_0;
    int forestValue909_160_0;
    int forestValue909_160_1;
    int spill909_0;
    int life2_5;
    int life3_16;
    int life5_23;
    int life6_27;
    int life7_33;
    int life8_39;
    int life9_47;
    int life10_55;
    int life11_69;
    int life12_76;
    int life4_87;
    int life5_110;
    int life6_121;
    int life5_149;
    net.minecraft.client.renderer.texture.Stitcher$Slot life6_199;
    forest_join_216: {
    forest_join_198: {
    forest_join_179: {
    forest_join_172: {
    forest_join_163: {
    forest_join_160: {
    forest_join_158: {
    forest_join_150: {
    forest_join_148: {
    forest_join_137: {
    forest_join_136: {
    forest_join_135: {
    forest_join_133: {
    forest_join_124: {
    forest_join_117: {
    forest_join_116: {
    forest_join_106: {
    forest_join_105: {
    forest_join_96: {
    forest_join_95: {
    forest_join_94: {
    forest_join_93: {
    forest_join_86: {
    forest_join_84: {
    forest_join_83: {
    forest_join_74: {
    forest_join_73: {
    forest_join_67: {
    forest_join_66: {
    forest_join_61: {
    forest_join_54: {
    forest_join_53: {
    forest_join_46: {
    forest_join_45: {
    forest_join_15: {
    forest_join_14: {
    life2_5 = java.lang.Math.min(((int)(((net.minecraft.client.renderer.texture.Stitcher$Holder)(p0)).a())), ((int)(((net.minecraft.client.renderer.texture.Stitcher$Holder)(p0)).b())));
    if (!((this.d == 0))) {
        break forest_join_14;
    }
    if (!((this.e == 0))) {
        break forest_join_14;
    }
    forestValue909_15_0 = 1;
    break forest_join_15;
    }
    forestValue909_15_0 = 0;
    }
    life3_16 = forestValue909_15_0;
    if (!(this.h)) {
        break forest_join_96;
    }
    life5_23 = moom.Dr.b(((int)(this.d)));
    life6_27 = moom.Dr.b(((int)(this.e)));
    life7_33 = moom.Dr.b(((int)((this.d + life2_5))));
    life8_39 = moom.Dr.b(((int)((this.e + life2_5))));
    if (!((life7_33 <= this.f))) {
        break forest_join_45;
    }
    forestValue909_46_0 = 1;
    break forest_join_46;
    }
    forestValue909_46_0 = 0;
    }
    life9_47 = forestValue909_46_0;
    if (!((life8_39 <= this.g))) {
        break forest_join_53;
    }
    forestValue909_54_0 = 1;
    break forest_join_54;
    }
    forestValue909_54_0 = 0;
    }
    life10_55 = forestValue909_54_0;
    if (!((life9_47 == 0))) {
        break forest_join_61;
    }
    if (!((life10_55 == 0))) {
        break forest_join_61;
    }
    return ((0) != 0);
    }
    if (!((life5_23 != life7_33))) {
        break forest_join_66;
    }
    forestValue909_67_0 = 1;
    break forest_join_67;
    }
    forestValue909_67_0 = 0;
    }
    life11_69 = forestValue909_67_0;
    if (!((life6_27 != life8_39))) {
        break forest_join_73;
    }
    forestValue909_74_0 = 1;
    break forest_join_74;
    }
    forestValue909_74_0 = 0;
    }
    life12_76 = forestValue909_74_0;
    if (!(((life11_69 ^ life12_76) != 0))) {
        break forest_join_86;
    }
    if (!((life11_69 == 0))) {
        break forest_join_83;
    }
    forestValue909_84_0 = 1;
    break forest_join_84;
    }
    forestValue909_84_0 = 0;
    }
    life4_87 = forestValue909_84_0;
    break forest_join_95;
    }
    if (!((life9_47 != 0))) {
        break forest_join_93;
    }
    if (!((life5_23 <= life6_27))) {
        break forest_join_93;
    }
    forestValue909_94_0 = 1;
    break forest_join_94;
    }
    forestValue909_94_0 = 0;
    }
    life4_87 = forestValue909_94_0;
    }
    break forest_join_137;
    }
    if (!(((this.d + life2_5) <= this.f))) {
        break forest_join_105;
    }
    forestValue909_106_0 = 1;
    break forest_join_106;
    }
    forestValue909_106_0 = 0;
    }
    life5_110 = forestValue909_106_0;
    if (!(((this.e + life2_5) <= this.g))) {
        break forest_join_116;
    }
    forestValue909_117_0 = 1;
    break forest_join_117;
    }
    forestValue909_117_0 = 0;
    }
    life6_121 = forestValue909_117_0;
    if (!((life5_110 == 0))) {
        break forest_join_124;
    }
    if (!((life6_121 == 0))) {
        break forest_join_124;
    }
    return ((0) != 0);
    }
    if (!((life5_110 != 0))) {
        break forest_join_135;
    }
    if (!((life3_16 == 0))) {
        break forest_join_133;
    }
    if (!((this.d <= this.e))) {
        break forest_join_135;
    }
    }
    forestValue909_136_0 = 1;
    break forest_join_136;
    }
    forestValue909_136_0 = 0;
    }
    life4_87 = forestValue909_136_0;
    }
    life5_149 = java.lang.Math.max(((int)(((net.minecraft.client.renderer.texture.Stitcher$Holder)(p0)).a())), ((int)(((net.minecraft.client.renderer.texture.Stitcher$Holder)(p0)).b())));
    if (!((life4_87 == 0))) {
        break forest_join_148;
    }
    forestValue909_150_0 = this.e;
    break forest_join_150;
    }
    forestValue909_150_0 = this.d;
    }
    spill909_0 = moom.Dr.b(((int)((forestValue909_150_0 + life5_149))));
    if (!((life4_87 == 0))) {
        forestValue909_158_0 = spill909_0;
        break forest_join_158;
    }
    forestValue909_160_0 = spill909_0;
    forestValue909_160_1 = this.g;
    break forest_join_160;
    }
    forestValue909_160_0 = forestValue909_158_0;
    forestValue909_160_1 = this.f;
    }
    if (!((forestValue909_160_0 > forestValue909_160_1))) {
        break forest_join_163;
    }
    return ((0) != 0);
    }
    if (!((life4_87 != 0))) {
        break forest_join_198;
    }
    if (!((((net.minecraft.client.renderer.texture.Stitcher$Holder)(p0)).a() > ((net.minecraft.client.renderer.texture.Stitcher$Holder)(p0)).b()))) {
        break forest_join_172;
    }
    ((net.minecraft.client.renderer.texture.Stitcher$Holder)(p0)).a__Void();
    }
    if (!((this.e == 0))) {
        break forest_join_179;
    }
    this.e = ((int)(((net.minecraft.client.renderer.texture.Stitcher$Holder)(p0)).b()));
    }
    life6_199 = new net.minecraft.client.renderer.texture.Stitcher$Slot(this.d, 0, ((net.minecraft.client.renderer.texture.Stitcher$Holder)(p0)).a(), this.e);
    moom.oe __stackOp909_42_0 = this;
    ((moom.oe)(__stackOp909_42_0)).d = ((int)((((moom.oe)(__stackOp909_42_0)).d + ((net.minecraft.client.renderer.texture.Stitcher$Holder)(p0)).a())));
    break forest_join_216;
    }
    life6_199 = new net.minecraft.client.renderer.texture.Stitcher$Slot(0, this.e, this.d, ((net.minecraft.client.renderer.texture.Stitcher$Holder)(p0)).b());
    moom.oe __stackOp909_49_0 = this;
    ((moom.oe)(__stackOp909_49_0)).e = ((int)((((moom.oe)(__stackOp909_49_0)).e + ((net.minecraft.client.renderer.texture.Stitcher$Holder)(p0)).b())));
    }
    ((net.minecraft.client.renderer.texture.Stitcher$Slot)(life6_199)).a(((net.minecraft.client.renderer.texture.Stitcher$Holder)(p0)));
    ((java.util.List)(this.c)).add(((java.lang.Object)(life6_199)));
    return ((1) != 0);
}


public int b() {
return this.e;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 2885;
      if (l[var3] == null) {
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
         long var5 = k[var3];
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
         Object[] var9 = (Object[])m.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               m.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/oe", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         l[var3] = var15;
      }

      return l[var3];
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral8584_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/oe"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static net.minecraft.client.renderer.StitcherException a(net.minecraft.client.renderer.StitcherException p0) {
return p0;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.oe.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public int a() {
return this.d;
}


public void a(net.minecraft.client.renderer.texture.TextureAtlasSprite p0) {
net.minecraft.client.renderer.texture.Stitcher$Holder local2 = new net.minecraft.client.renderer.texture.Stitcher$Holder(p0, this.a);
    if ((this.i > 0)) {
        ((net.minecraft.client.renderer.texture.Stitcher$Holder)(local2)).a(((int)(this.i)));
    }
    ((java.util.Set)(this.b)).add(((java.lang.Object)(local2)));
    return;
}


public void a__Void() {
long life1_3;
    net.minecraft.client.renderer.texture.Stitcher$Holder[] life3_10;
    net.minecraft.client.renderer.texture.Stitcher$Holder[] life4_14;
    int life5_17;
    int life6_19;
    net.minecraft.client.renderer.texture.Stitcher$Holder life7_26;
    java.lang.String life8_87;
    life1_3 = (moom.oe.j ^ 42090394755679L);
    life3_10 = ((net.minecraft.client.renderer.texture.Stitcher$Holder[])(((java.util.Set)(this.b)).toArray(((java.lang.Object[])(new net.minecraft.client.renderer.texture.Stitcher$Holder[0])))));
    java.util.Arrays.sort(((java.lang.Object[])(life3_10)));
    life4_14 = life3_10;
    life5_17 = (life4_14).length;
    life6_19 = 0;
    loop_region_20: while ((life6_19 < life5_17)) {
        life7_26 = (life4_14)[life6_19];
        if ((!((moom.oe)(this)).a(((net.minecraft.client.renderer.texture.Stitcher$Holder)(life7_26))))) {
        java.lang.String spill1259_0 = "Unable to fit: %s, size: %dx%d, atlas: %dx%d, atlasMax: %dx%d - Maybe try a lower resolution resourcepack?";
        java.lang.Object[] __stackOp1259_7_0 = new java.lang.Object[__sourceIntrinsic_b82a5b29b709_invokedynamic1259_6(11721, (6581350718744515431L ^ life1_3))];
        java.lang.Object[] spill1259_1 = __stackOp1259_7_0;
        (__stackOp1259_7_0)[0] = ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(((net.minecraft.client.renderer.texture.Stitcher$Holder)(life7_26)).a__oh())).a__String();
        java.lang.Object[] __stackOp1259_10_0 = spill1259_1;
        java.lang.Object[] spill1259_2 = __stackOp1259_10_0;
        (__stackOp1259_10_0)[1] = java.lang.Integer.valueOf(((int)(((net.minecraft.client.renderer.texture.TextureAtlasSprite)(((net.minecraft.client.renderer.texture.Stitcher$Holder)(life7_26)).a__oh())).c__Int())));
        java.lang.Object[] __stackOp1259_14_0 = spill1259_2;
        java.lang.Object[] spill1259_3 = __stackOp1259_14_0;
        (__stackOp1259_14_0)[2] = java.lang.Integer.valueOf(((int)(((net.minecraft.client.renderer.texture.TextureAtlasSprite)(((net.minecraft.client.renderer.texture.Stitcher$Holder)(life7_26)).a__oh())).d__Int())));
        java.lang.Object[] __stackOp1259_18_0 = spill1259_3;
        java.lang.Object[] spill1259_4 = __stackOp1259_18_0;
        (__stackOp1259_18_0)[3] = java.lang.Integer.valueOf(((int)(this.d)));
        java.lang.Object[] __stackOp1259_21_0 = spill1259_4;
        java.lang.Object[] spill1259_5 = __stackOp1259_21_0;
        (__stackOp1259_21_0)[4] = java.lang.Integer.valueOf(((int)(this.e)));
        java.lang.Object[] __stackOp1259_24_0 = spill1259_5;
        java.lang.Object[] spill1259_6 = __stackOp1259_24_0;
        (__stackOp1259_24_0)[5] = java.lang.Integer.valueOf(((int)(this.f)));
        java.lang.Object[] __stackOp1259_27_0 = spill1259_6;
        java.lang.Object[] spill1259_7 = __stackOp1259_27_0;
        (__stackOp1259_27_0)[__sourceIntrinsic_b82a5b29b709_invokedynamic1259_28(14016, (2620643133668640879L ^ life1_3))] = java.lang.Integer.valueOf(((int)(this.g)));
        life8_87 = java.lang.String.format(((java.lang.String)(spill1259_0)), ((java.lang.Object[])(spill1259_7)));
        throw new net.minecraft.client.renderer.StitcherException(life7_26, life8_87);
    }
        life6_19 += 1;
    }
    if (this.h) {
        this.d = ((int)(moom.Dr.b(((int)(this.d)))));
        this.e = ((int)(moom.Dr.b(((int)(this.e)))));
    }
    return;
}


public java.util.List<net.minecraft.client.renderer.texture.TextureAtlasSprite> a__List() {
java.util.ArrayList life1_1;
    java.util.Iterator life2_5;
    net.minecraft.client.renderer.texture.Stitcher$Slot life3_12;
    java.util.ArrayList life2_18;
    java.util.Iterator life3_21;
    net.minecraft.client.renderer.texture.Stitcher$Slot life4_28;
    net.minecraft.client.renderer.texture.Stitcher$Holder life5_31;
    net.minecraft.client.renderer.texture.TextureAtlasSprite life6_34;
    life1_1 = com.google.common.collect.Lists.newArrayList();
    life2_5 = ((java.util.List)(this.c)).iterator();
    while (((java.util.Iterator)(life2_5)).hasNext()) {
        life3_12 = ((net.minecraft.client.renderer.texture.Stitcher$Slot)(((java.util.Iterator)(life2_5)).next()));
        ((net.minecraft.client.renderer.texture.Stitcher$Slot)(life3_12)).a(((java.util.List)(life1_1)));
    }
    life2_18 = com.google.common.collect.Lists.newArrayList();
    life3_21 = ((java.util.List)(life1_1)).iterator();
    while (((java.util.Iterator)(life3_21)).hasNext()) {
        life4_28 = ((net.minecraft.client.renderer.texture.Stitcher$Slot)(((java.util.Iterator)(life3_21)).next()));
        life5_31 = ((net.minecraft.client.renderer.texture.Stitcher$Slot)(life4_28)).a__of();
        life6_34 = ((net.minecraft.client.renderer.texture.Stitcher$Holder)(life5_31)).a__oh();
        ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(life6_34)).a(((int)(this.d)), ((int)(this.e)), ((int)(((net.minecraft.client.renderer.texture.Stitcher$Slot)(life4_28)).a())), ((int)(((net.minecraft.client.renderer.texture.Stitcher$Slot)(life4_28)).b())), ((boolean)(((net.minecraft.client.renderer.texture.Stitcher$Holder)(life5_31)).a__Boolean())));
        ((java.util.List)(life2_18)).add(((java.lang.Object)(life6_34)));
    }
    return life2_18;
}


private static int a(int p0, int p1) {
return (((p0 >> p1) + (((p0 & ((1 << p1) - 1)) == 0) ? 0 : 1)) << p1);
}


private boolean a(net.minecraft.client.renderer.texture.Stitcher$Holder p0) {
java.util.Iterator local2 = ((java.util.List)(this.c)).iterator();
    while (((java.util.Iterator)(local2)).hasNext()) {
        net.minecraft.client.renderer.texture.Stitcher$Slot local3 = ((net.minecraft.client.renderer.texture.Stitcher$Slot)(((java.util.Iterator)(local2)).next()));
        if (((net.minecraft.client.renderer.texture.Stitcher$Slot)(local3)).a(((net.minecraft.client.renderer.texture.Stitcher$Holder)(p0)))) {
        return true;
    }
        ((net.minecraft.client.renderer.texture.Stitcher$Holder)(p0)).a__Void();
        if (((net.minecraft.client.renderer.texture.Stitcher$Slot)(local3)).a(((net.minecraft.client.renderer.texture.Stitcher$Holder)(p0)))) {
        return true;
    }
        ((net.minecraft.client.renderer.texture.Stitcher$Holder)(p0)).a__Void();
    }
    return ((moom.oe)(this)).b(((net.minecraft.client.renderer.texture.Stitcher$Holder)(p0)));
}


private static native <E extends Throwable> int __sourceIntrinsic_390c11d8fa263ebc_originalDynamicSite3168_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_390c11d8fa263ebc_originalDynamicSite3168_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral8584_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic1259_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic1259_28(int a0, long a1) throws E;
}
