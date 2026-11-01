package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class h6 extends moom.h5 {

private net.minecraft.client.gui.GuiControls y;

private net.minecraft.client.Minecraft z;

private moom.hO[] A;

private int B;

private static long C;

private static long[] D;

private static java.lang.Integer[] E;

private static java.util.Map F;

public h6(net.minecraft.client.gui.GuiControls p0, net.minecraft.client.Minecraft p1) { super((net.minecraft.client.Minecraft)null, 0, 0, 0, 0, 0); }


private static void __sourceConstructorBody_ac71367499666f04(moom.h6 receiver, net.minecraft.client.gui.GuiControls p0, net.minecraft.client.Minecraft p1) throws Throwable {

long life3_3;

    moom.pz[] life5_43;

    int life6_55;

    java.lang.String life7_57;

    moom.pz[] life8_59;

    int life9_62;

    int life10_64;

    moom.pz life11_71;

    java.lang.String life12_74;

    int life13_99;

    forest_join_119: {

    life3_3 = (moom.h6.C ^ 109629246404637L);

    moom.h6.__sourceConstructorInit_ac71367499666f04_0(((moom.h6)(receiver)), ((net.minecraft.client.Minecraft)(p1)), ((int)(((net.minecraft.client.gui.GuiControls)(p0)).k)), ((int)(((net.minecraft.client.gui.GuiControls)(p0)).l)), ((int)(__sourceIntrinsic_ac71367499666f04_invokedynamic462_3(7836, (6315443401612194656L ^ life3_3)))), ((int)((((net.minecraft.client.gui.GuiControls)(p0)).l - __sourceIntrinsic_ac71367499666f04_invokedynamic462_5(9200, (6798479577371561480L ^ life3_3))))), ((int)(__sourceIntrinsic_ac71367499666f04_invokedynamic462_6(16573, (6184437884728847683L ^ life3_3)))));

    ((moom.h6)(receiver)).B = ((int)(0));

    ((moom.h6)(receiver)).y = ((net.minecraft.client.gui.GuiControls)(p0));

    ((moom.h6)(receiver)).z = ((net.minecraft.client.Minecraft)(p1));

    life5_43 = ((moom.pz[])(org.apache.commons.lang3.ArrayUtils.clone(((java.lang.Object[])(((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(p1)).W)).aK)))));

    ((moom.h6)(receiver)).A = ((moom.hO[])(new moom.hO[((life5_43).length + ((java.util.Set)(moom.pz.a__Set())).size())]));

    java.util.Arrays.sort(((java.lang.Object[])(life5_43)));

    life6_55 = 0;

    life7_57 = null;

    life8_59 = life5_43;

    life9_62 = (life8_59).length;

    life10_64 = 0;

    forest_cycle_65: while (true) {

    forest_join_107: {

    forest_join_91: {

    if (!((life10_64 < life9_62))) {

        break forest_join_119;

    }

    life11_71 = (life8_59)[life10_64];

    life12_74 = ((moom.pz)(life11_71)).a__String();

    if (!((!((java.lang.String)(life12_74)).equals(((java.lang.Object)(life7_57)))))) {

        break forest_join_91;

    }

    life7_57 = life12_74;

    (((moom.h6)(receiver)).A)[(life6_55++)] = new moom.hM(receiver, life12_74);

    }

    life13_99 = ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.Minecraft)(p1)).N)).a(((java.lang.String)(moom.oO.a(((java.lang.String)(((moom.pz)(life11_71)).b__String())), ((java.lang.Object[])(new java.lang.Object[0]))))));

    if (!((life13_99 > ((moom.h6)(receiver)).B))) {

        break forest_join_107;

    }

    ((moom.h6)(receiver)).B = ((int)(life13_99));

    }

    (((moom.h6)(receiver)).A)[(life6_55++)] = new moom.hN(receiver, life11_71);

    life10_64 += 1;

    continue forest_cycle_65;

    }

    }

    return;

}



static {
C = ((long)(((moom._a)(moom._c.a(((long)(-4667378094572518055L)), ((long)(-1314554117934462556L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(37373184452180L)))));
    F = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.h6.C ^ 108599681463108L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1243_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1243_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1243_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1243_14 = new byte[8];
    (__sourceSpill1243_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1243_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1243_16 = __sourceSpill1243_14;
    ((javax.crypto.Cipher)(__sourceSpill1243_11)).init(((int)(__sourceSpill1243_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1243_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1243_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[5];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "<P\001Á5«üÜ^j\f¬Å\000,c\001C."))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1243_25 = local6_life21;
        int __sourceSpill1243_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1243_25)).substring(((int)(__sourceSpill1243_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1243_30 = local8_life19;
        int __sourceSpill1243_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1243_33 = new byte[8];
        (__sourceSpill1243_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1243_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1243_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1243_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1243_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1243_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1243_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1243_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1243_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1243_34)).doFinal(((byte[])(__sourceSpill1243_33)));
        (__sourceSpill1243_30)[__sourceSpill1243_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "¹ªùÜYé8[)¤N\004¶éÝõ"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1243_38 = local6_life21;
        int __sourceSpill1243_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1243_38)).substring(((int)(__sourceSpill1243_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1243_43 = local8_life19;
        int __sourceSpill1243_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1243_46 = new byte[8];
        (__sourceSpill1243_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1243_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1243_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1243_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1243_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1243_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1243_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1243_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1243_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1243_47)).doFinal(((byte[])(__sourceSpill1243_46)));
        (__sourceSpill1243_43)[__sourceSpill1243_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    D = ((long[])(local8_life19));
    E = ((java.lang.Integer[])(new java.lang.Integer[5]));
}

private static native <E extends Throwable> void __sourceConstructorInit_ac71367499666f04_0(moom.h6 a0, net.minecraft.client.Minecraft a1, int a2, int a3, int a4, int a5, int a6) throws E;

public int e() {
long local1 = (moom.h6.C ^ 49573664054160L);
    return (super.e() + __sourceIntrinsic_c4b63a62bb23_originalDynamicSite1472_2(7639, (6446172008927024039L ^ local1)));
}


private static moom.Oo c(moom.Oo p0) {
return p0;
}


protected int f() {
long local1 = (moom.h6.C ^ 112238795458104L);
    return (super.f() + __sourceIntrinsic_d5f736cb4191_originalDynamicSite1473_2(10393, (3389822072527895363L ^ local1)));
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 1418;
      if (E[var3] == null) {
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
         long var5 = D[var3];
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
         Object[] var9 = (Object[])F.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               F.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/h6", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         E[var3] = var15;
      }

      return E[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.h6.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral7803_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/h6"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public moom.hO a__hO(int p0) {
return (this.A)[p0];
}


protected int a() {
return (this.A).length;
}


private static native <E extends Throwable> int __sourceIntrinsic_ac71367499666f04_invokedynamic462_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ac71367499666f04_invokedynamic462_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ac71367499666f04_invokedynamic462_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral7803_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c4b63a62bb23_originalDynamicSite1472_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d5f736cb4191_originalDynamicSite1473_2(int a0, long a1) throws E;
}
