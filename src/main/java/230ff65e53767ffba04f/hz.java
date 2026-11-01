package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class hz extends net.minecraft.client.gui.GuiScreen {

private net.minecraft.client.gui.GuiScreen w;

private java.lang.String x;

private java.lang.String y;

private java.util.List<java.lang.String> z;

protected java.lang.String A;

private int B;

private static long C;

private static java.lang.String D;

private static long[] E;

private static java.lang.Integer[] F;

private static java.util.Map G;

public hz(net.minecraft.client.gui.GuiScreen p0, java.lang.String p1, java.lang.String p2) { super(); }


private static void __sourceConstructorBody_516d79052de8aebb(moom.hz receiver, net.minecraft.client.gui.GuiScreen p0, java.lang.String p1, java.lang.String p2) throws Throwable {

long local4 = (moom.hz.C ^ 81980446825722L);

    moom.hz.__sourceConstructorInit_516d79052de8aebb_0(((moom.hz)(receiver)));

    ((moom.hz)(receiver)).z = ((java.util.List)(com.google.common.collect.Lists.newArrayList()));

    ((moom.hz)(receiver)).w = ((net.minecraft.client.gui.GuiScreen)(p0));

    ((moom.hz)(receiver)).x = ((java.lang.String)(p1));

    ((moom.hz)(receiver)).y = ((java.lang.String)(p2));

    ((moom.hz)(receiver)).A = ((java.lang.String)(moom.oO.a(((java.lang.String)(moom.hz.D)), ((java.lang.Object[])(new java.lang.Object[0])))));

    return;

}



static {
C = ((long)(((moom._a)(moom._c.a(((long)(-8846061342440763706L)), ((long)(58964069557763304L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(194239178331680L)))));
    long local11_life6 = (moom.hz.C ^ 18381057239432L);
    javax.crypto.Cipher local13_life8;
    javax.crypto.Cipher __sourceSpill872_10 = (local13_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill872_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill872_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill872_13 = new byte[8];
    (__sourceSpill872_13)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local14_life14 = 1;
    while ((local14_life14 < 8)) {
        (__sourceSpill872_13)[local14_life14] = ((byte) ((int) ((local11_life6 << (local14_life14 * 8)) >>> 56)));
        local14_life14 += 1;
    }
    byte[] __sourcePreallocation872_15 = __sourceSpill872_13;
    ((javax.crypto.Cipher)(__sourceSpill872_10)).init(((int)(__sourceSpill872_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill872_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation872_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    byte[] __sourceSpill872_19 = ((java.lang.String)("éÌ(w_«\033#zAÚ{ìú'")).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __sourceSpill872_20 = local13_life8;
    byte[] local15_life22 = ((javax.crypto.Cipher)(__sourceSpill872_20)).doFinal(((byte[])(__sourceSpill872_19)));
    D = ((java.lang.String)(((java.lang.String)(moom.hz.a(((byte[])(local15_life22))))).intern()));
    G = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life28;
    javax.crypto.Cipher __sourceSpill872_30 = (local0_life28 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill872_31 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill872_32 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill872_33 = new byte[8];
    (__sourceSpill872_33)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local1_life34 = 1;
    while ((local1_life34 < 8)) {
        (__sourceSpill872_33)[local1_life34] = ((byte) ((int) ((local11_life6 << (local1_life34 * 8)) >>> 56)));
        local1_life34 += 1;
    }
    byte[] __sourcePreallocation872_35 = __sourceSpill872_33;
    ((javax.crypto.Cipher)(__sourceSpill872_30)).init(((int)(__sourceSpill872_31)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill872_32)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation872_35)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life38 = new long[8];
    int local3_life39 = 0;
    java.lang.String local4_life40;
    int local5_life42 = ((java.lang.String)((local4_life40 = "ütx\027#±Ô6Ö\n¸Om«\020øIhÅ:^6r\034\023ú\0040tK?Pl9fiý¬#"))).length();
    int local2_life43 = 0;
    do {
        java.lang.String __sourceSpill872_44 = local4_life40;
        int __sourceSpill872_45 = local2_life43;
        local2_life43 += 8;
        byte[] local7_life48 = ((java.lang.String)(((java.lang.String)(__sourceSpill872_44)).substring(((int)(__sourceSpill872_45)), ((int)(local2_life43))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill872_49 = local6_life38;
        int __sourceSpill872_50 = local3_life39;
        local3_life39 += 1;
        long local8_life51 = (((((((((((long) (local7_life48)[0]) & 255L) << 56) | ((((long) (local7_life48)[1]) & 255L) << 48)) | ((((long) (local7_life48)[2]) & 255L) << 40)) | ((((long) (local7_life48)[3]) & 255L) << 32)) | ((((long) (local7_life48)[4]) & 255L) << 24)) | ((((long) (local7_life48)[5]) & 255L) << 16)) | ((((long) (local7_life48)[6]) & 255L) << 8)) | (((long) (local7_life48)[7]) & 255L));
        byte[] __sourceSpill872_52 = new byte[8];
        (__sourceSpill872_52)[0] = ((byte) ((int) (local8_life51 >>> 56)));
        (__sourceSpill872_52)[1] = ((byte) ((int) (local8_life51 >>> 48)));
        (__sourceSpill872_52)[2] = ((byte) ((int) (local8_life51 >>> 40)));
        (__sourceSpill872_52)[3] = ((byte) ((int) (local8_life51 >>> 32)));
        (__sourceSpill872_52)[4] = ((byte) ((int) (local8_life51 >>> 24)));
        (__sourceSpill872_52)[5] = ((byte) ((int) (local8_life51 >>> 16)));
        (__sourceSpill872_52)[6] = ((byte) ((int) (local8_life51 >>> 8)));
        (__sourceSpill872_52)[7] = ((byte) ((int) local8_life51));
        javax.crypto.Cipher __sourceSpill872_53 = local0_life28;
        byte[] local10_life55 = ((javax.crypto.Cipher)(__sourceSpill872_53)).doFinal(((byte[])(__sourceSpill872_52)));
        (__sourceSpill872_49)[__sourceSpill872_50] = (((((((((((long) (local10_life55)[0]) & 255L) << 56) | ((((long) (local10_life55)[1]) & 255L) << 48)) | ((((long) (local10_life55)[2]) & 255L) << 40)) | ((((long) (local10_life55)[3]) & 255L) << 32)) | ((((long) (local10_life55)[4]) & 255L) << 24)) | ((((long) (local10_life55)[5]) & 255L) << 16)) | ((((long) (local10_life55)[6]) & 255L) << 8)) | (((long) (local10_life55)[7]) & 255L));
    } while ((!(local2_life43 >= local5_life42)));
    local5_life42 = ((java.lang.String)((local4_life40 = "Ñ\023-µ]kü\016{t'\005\005Ý\030"))).length();
    local2_life43 = 0;
    do {
        java.lang.String __sourceSpill872_57 = local4_life40;
        int __sourceSpill872_58 = local2_life43;
        local2_life43 += 8;
        byte[] local7_life61 = ((java.lang.String)(((java.lang.String)(__sourceSpill872_57)).substring(((int)(__sourceSpill872_58)), ((int)(local2_life43))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill872_62 = local6_life38;
        int __sourceSpill872_63 = local3_life39;
        local3_life39 += 1;
        long local8_life64 = (((((((((((long) (local7_life61)[0]) & 255L) << 56) | ((((long) (local7_life61)[1]) & 255L) << 48)) | ((((long) (local7_life61)[2]) & 255L) << 40)) | ((((long) (local7_life61)[3]) & 255L) << 32)) | ((((long) (local7_life61)[4]) & 255L) << 24)) | ((((long) (local7_life61)[5]) & 255L) << 16)) | ((((long) (local7_life61)[6]) & 255L) << 8)) | (((long) (local7_life61)[7]) & 255L));
        byte[] __sourceSpill872_65 = new byte[8];
        (__sourceSpill872_65)[0] = ((byte) ((int) (local8_life64 >>> 56)));
        (__sourceSpill872_65)[1] = ((byte) ((int) (local8_life64 >>> 48)));
        (__sourceSpill872_65)[2] = ((byte) ((int) (local8_life64 >>> 40)));
        (__sourceSpill872_65)[3] = ((byte) ((int) (local8_life64 >>> 32)));
        (__sourceSpill872_65)[4] = ((byte) ((int) (local8_life64 >>> 24)));
        (__sourceSpill872_65)[5] = ((byte) ((int) (local8_life64 >>> 16)));
        (__sourceSpill872_65)[6] = ((byte) ((int) (local8_life64 >>> 8)));
        (__sourceSpill872_65)[7] = ((byte) ((int) local8_life64));
        javax.crypto.Cipher __sourceSpill872_66 = local0_life28;
        byte[] local10_life68 = ((javax.crypto.Cipher)(__sourceSpill872_66)).doFinal(((byte[])(__sourceSpill872_65)));
        (__sourceSpill872_62)[__sourceSpill872_63] = (((((((((((long) (local10_life68)[0]) & 255L) << 56) | ((((long) (local10_life68)[1]) & 255L) << 48)) | ((((long) (local10_life68)[2]) & 255L) << 40)) | ((((long) (local10_life68)[3]) & 255L) << 32)) | ((((long) (local10_life68)[4]) & 255L) << 24)) | ((((long) (local10_life68)[5]) & 255L) << 16)) | ((((long) (local10_life68)[6]) & 255L) << 8)) | (((long) (local10_life68)[7]) & 255L));
    } while ((!(local2_life43 >= local5_life42)));
    E = ((long[])(local6_life38));
    F = ((java.lang.Integer[])(new java.lang.Integer[8]));
}

private static native <E extends Throwable> void __sourceConstructorInit_516d79052de8aebb_0(moom.hz a0) throws E;

public void c__Void() {
long local1 = (moom.hz.C ^ 62865714100083L);
    ((java.util.List)(this.m)).add(((java.lang.Object)(new moom.gi(0, ((this.k / 2) - __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1508_3(11742, (2294667117760458767L ^ local1))), ((this.l / __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1508_5(26019, (4114115488618477684L ^ local1))) + __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1508_6(7080, (6475915988581385850L ^ local1))), this.A))));
    ((java.util.List)(this.z)).clear();
    ((java.util.List)(this.z)).addAll(((java.util.Collection)(((net.minecraft.client.gui.FontRenderer)(this.p)).a__List(((java.lang.String)(this.y)), ((int)((this.k - __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1508_15(14037, (511559609003485957L ^ local1)))))))));
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static java.lang.String a(byte[] p0) {
int life1_1;
    int life2_5;
    char[] life3_7;
    int life4_9;
    int life5_19;
    int life6_39;
    int life5_44;
    int life6_52;
    int life6_71;
    int life5_76;
    int life6_86;
    int life5_91;
    int life6_99;
    life1_1 = 0;
    life3_7 = new char[(life2_5 = (p0).length)];
    life4_9 = 0;
    loop_region_10: while ((life4_9 < life2_5)) {
        if (((life5_19 = (255 & (p0)[life4_9])) < 192)) {
        (life3_7)[(life1_1++)] = ((char) life5_19);
    } else {
        if ((life5_19 < 224)) {
        life6_39 = ((int)(((char) (((char) (life5_19 & 31)) << 6))));
        byte[] spill4195_0 = p0;
        life4_9 += 1;
        life5_44 = (spill4195_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill4195_1 = p0;
        life4_9 += 1;
        life5_76 = (spill4195_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill4195_2 = p0;
        life4_9 += 1;
        life5_91 = (spill4195_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 20129;
      if (F[var3] == null) {
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
         long var5 = E[var3];
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
         Object[] var9 = (Object[])G.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               G.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/hz", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         F[var3] = var15;
      }

      return F[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.hz.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral7979_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/hz"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


protected void a__Void(moom.gc p0) throws java.io.IOException {
((net.minecraft.client.Minecraft)(moom.BU.a__fM())).a(((net.minecraft.client.gui.GuiScreen)(this.w)));
    return;
}


public void a__sourceReturn_d00df7729d(int p0) {
int[] spill1195_0;
    long life2_3;
    int[] life4_8;
    java.util.Iterator life5_12;
    moom.gc life6_19;
    lexical_join_25: {
    life2_3 = (moom.hz.C ^ 140116257435692L);
    spill1195_0 = moom.LL.b();
    this.B = ((int)(p0));
    life4_8 = spill1195_0;
    life5_12 = ((java.util.List)(this.m)).iterator();
    lexical_cycle_13: while (true) {
    if (!(((java.util.Iterator)(life5_12)).hasNext())) {
        break lexical_join_25;
    }
    life6_19 = ((moom.gc)(((java.util.Iterator)(life5_12)).next()));
    ((moom.gc)(life6_19)).m = ((boolean)(false));
    if (!((life4_8 != null))) { continue lexical_cycle_13; }
    break lexical_cycle_13;
    }
    }
    return;
}


public void a(int p0, int p1, float p2) {
int[] spill1196_0;
    long life4_3;
    int life7_32;
    int[] life6_33;
    java.util.Iterator life8_37;
    java.lang.String life9_44;
    lexical_join_75: {
    lexical_join_70: {
    life4_3 = (moom.hz.C ^ 4885798925045L);
    ((moom.hz)(this)).i();
    spill1196_0 = moom.LL.b();
    ((moom.hz)(this)).a(((net.minecraft.client.gui.FontRenderer)(this.p)), ((java.lang.String)(this.x)), ((int)((this.k / 2))), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic1196_6(22258, (3430100886023491233L ^ life4_3)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic1196_7(30510, (6533985228458749820L ^ life4_3)))));
    life7_32 = __sourceIntrinsic_95e4e99d9b0c_invokedynamic1196_9(21688, (2686474603775773928L ^ life4_3));
    life6_33 = spill1196_0;
    life8_37 = ((java.util.List)(this.z)).iterator();
    lexical_cycle_38: while (true) {
    if (!(((java.util.Iterator)(life8_37)).hasNext())) {
        break lexical_join_70;
    }
    life9_44 = ((java.lang.String)(((java.util.Iterator)(life8_37)).next()));
    ((moom.hz)(this)).a(((net.minecraft.client.gui.FontRenderer)(this.p)), ((java.lang.String)(life9_44)), ((int)((this.k / 2))), ((int)(life7_32)), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic1196_17(17685, (1544975199004187968L ^ life4_3)))));
    life7_32 = (life7_32 + ((net.minecraft.client.gui.FontRenderer)(this.p)).c);
    if (!((life6_33 == null))) {
        break lexical_join_75;
    }
    if (!((life6_33 != null))) { continue lexical_cycle_38; }
    break lexical_cycle_38;
    }
    }
    super.a(((int)(p0)), ((int)(p1)), ((float)(p2)));
    }
    return;
}


public void g() {
moom.hz lexicalValue1197_19_0;
    int[] spill1197_0;
    moom.hz spill1197_1;
    int spill1197_2;
    long life1_3;
    int[] life3_7;
    java.util.Iterator life4_27;
    moom.gc life5_34;
    lexical_join_34: {
    lexical_join_19: {
    life1_3 = (moom.hz.C ^ 88163042980312L);
    spill1197_0 = moom.LL.b();
    super.g();
    life3_7 = spill1197_0;
    spill1197_1 = this;
    if (!((life3_7 == null))) {
        lexicalValue1197_19_0 = spill1197_1;
        break lexical_join_19;
    }
    moom.hz __stackOp1197_3_0 = spill1197_1;
    moom.hz __stackOp1197_5_0 = __stackOp1197_3_0;
    int __stackOp1197_5_1 = (((moom.hz)(__stackOp1197_3_0)).B - 1);
    spill1197_2 = __stackOp1197_5_1;
    ((moom.hz)(__stackOp1197_5_0)).B = ((int)(__stackOp1197_5_1));
    if (!((spill1197_2 == 0))) {
        break lexical_join_34;
    }
    lexicalValue1197_19_0 = this;
    }
    life4_27 = ((java.util.List)(((moom.hz)(lexicalValue1197_19_0)).m)).iterator();
    lexical_cycle_22: while (true) {
    if (!(((java.util.Iterator)(life4_27)).hasNext())) {
        break lexical_join_34;
    }
    life5_34 = ((moom.gc)(((java.util.Iterator)(life4_27)).next()));
    ((moom.gc)(life5_34)).m = ((boolean)(true));
    if (!((life3_7 != null))) { continue lexical_cycle_22; }
    break lexical_cycle_22;
    }
    }
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic1196_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic1196_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic1196_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic1196_17(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral7979_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1508_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1508_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1508_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1508_15(int a0, long a1) throws E;
}
