package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
class ik extends moom.h1 {

private java.util.List<net.minecraft.entity.EntityList$EntityEggInfo> y;

net.minecraft.client.gui.achievement.GuiStats z;

private static long A;

private static long[] B;

private static java.lang.Integer[] C;

private static java.util.Map D;

public ik(net.minecraft.client.gui.achievement.GuiStats p0, net.minecraft.client.Minecraft p1) { super((net.minecraft.client.Minecraft)null, 0, 0, 0, 0, 0); }


private static void __sourceConstructorBody_81ddcf91b7ce6418(moom.ik receiver, net.minecraft.client.gui.achievement.GuiStats p0, net.minecraft.client.Minecraft p1) throws Throwable {

long life3_3;

    java.util.Iterator life5_41;

    net.minecraft.entity.EntityList$EntityEggInfo life6_48;

    forest_join_67: {

    life3_3 = (moom.ik.A ^ 12169579616888L);

    ((moom.ik)(receiver)).z = ((net.minecraft.client.gui.achievement.GuiStats)(p0));

    moom.ik.__sourceConstructorInit_81ddcf91b7ce6418_0(((moom.ik)(receiver)), ((net.minecraft.client.Minecraft)(p1)), ((int)(((net.minecraft.client.gui.achievement.GuiStats)(p0)).k)), ((int)(((net.minecraft.client.gui.achievement.GuiStats)(p0)).l)), ((int)(__sourceIntrinsic_81ddcf91b7ce6418_invokedynamic468_4(14797, (8852524086568978069L ^ life3_3)))), ((int)((((net.minecraft.client.gui.achievement.GuiStats)(p0)).l - __sourceIntrinsic_81ddcf91b7ce6418_invokedynamic468_6(13367, (8653634530380155757L ^ life3_3))))), ((int)((((net.minecraft.client.gui.FontRenderer)(net.minecraft.client.gui.achievement.GuiStats.l(((net.minecraft.client.gui.achievement.GuiStats)(p0))))).c * 4))));

    ((moom.ik)(receiver)).y = ((java.util.List)(com.google.common.collect.Lists.newArrayList()));

    ((moom.ik)(receiver)).a(((boolean)(false)));

    life5_41 = ((java.util.Collection)(((java.util.Map)(net.minecraft.entity.EntityList.g)).values())).iterator();

    forest_cycle_42: while (true) {

    forest_join_66: {

    forest_join_61: {

    if (!(((java.util.Iterator)(life5_41)).hasNext())) {

        break forest_join_67;

    }

    life6_48 = ((net.minecraft.entity.EntityList$EntityEggInfo)(((java.util.Iterator)(life5_41)).next()));

    if (!((((moom.B2)(((net.minecraft.client.gui.achievement.GuiStats)(p0)).C)).a(((moom.BY)(((net.minecraft.entity.EntityList$EntityEggInfo)(life6_48)).d))) <= 0))) {

        break forest_join_61;

    }

    if (!((((moom.B2)(((net.minecraft.client.gui.achievement.GuiStats)(p0)).C)).a(((moom.BY)(((net.minecraft.entity.EntityList$EntityEggInfo)(life6_48)).e))) > 0))) {

        break forest_join_66;

    }

    }

    ((java.util.List)(((moom.ik)(receiver)).y)).add(((java.lang.Object)(life6_48)));

    }

    continue forest_cycle_42;

    }

    }

    return;

}



static {
A = ((long)(((moom._a)(moom._c.a(((long)(-4118701218739375173L)), ((long)(302659693685691228L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(23186024826973L)))));
    D = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.ik.A ^ 67890050032079L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1311_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1311_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1311_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1311_14 = new byte[8];
    (__sourceSpill1311_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1311_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1311_16 = __sourceSpill1311_14;
    ((javax.crypto.Cipher)(__sourceSpill1311_11)).init(((int)(__sourceSpill1311_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1311_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1311_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[8];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "\032\032ÐÉ>GÞ\035C\003\030eÉ\002¸\nçÀµ`\r\031Ñà}Õ\022Ñ\003\000oøúpÎ1E\025"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1311_25 = local6_life21;
        int __sourceSpill1311_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1311_25)).substring(((int)(__sourceSpill1311_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1311_30 = local8_life19;
        int __sourceSpill1311_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1311_33 = new byte[8];
        (__sourceSpill1311_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1311_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1311_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1311_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1311_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1311_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1311_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1311_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1311_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1311_34)).doFinal(((byte[])(__sourceSpill1311_33)));
        (__sourceSpill1311_30)[__sourceSpill1311_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "\027¿¡YÅ_Ë\023ê`ÊYÇ,"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1311_38 = local6_life21;
        int __sourceSpill1311_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1311_38)).substring(((int)(__sourceSpill1311_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1311_43 = local8_life19;
        int __sourceSpill1311_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1311_46 = new byte[8];
        (__sourceSpill1311_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1311_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1311_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1311_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1311_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1311_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1311_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1311_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1311_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1311_47)).doFinal(((byte[])(__sourceSpill1311_46)));
        (__sourceSpill1311_43)[__sourceSpill1311_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    B = ((long[])(local8_life19));
    C = ((java.lang.Integer[])(new java.lang.Integer[8]));
}

private static native <E extends Throwable> void __sourceConstructorInit_81ddcf91b7ce6418_0(moom.ik a0, net.minecraft.client.Minecraft a1, int a2, int a3, int a4, int a5, int a6) throws E;

protected int b() {
return ((((moom.ik)(this)).a() * ((net.minecraft.client.gui.FontRenderer)(net.minecraft.client.gui.achievement.GuiStats.m(((net.minecraft.client.gui.achievement.GuiStats)(this.z))))).c) * 4);
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 24791;
      if (C[var3] == null) {
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
         long var5 = B[var3];
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
         Object[] var9 = (Object[])D.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               D.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/ik", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         C[var3] = var15;
      }

      return C[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.ik.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral8061_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/ik"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


protected int a() {
return ((java.util.List)(this.y)).size();
}


protected void a(int p0, boolean p1, int p2, int p3) {
return;
}


protected boolean a__Boolean(int p0) {
return ((0) != 0);
}


protected void a__Void() {
((net.minecraft.client.gui.achievement.GuiStats)(this.z)).i();
    return;
}


protected void a(int p0, int p1, int p2, int p3, int p4, int p5) {
long local7 = (moom.ik.A ^ 25376885781280L);
    net.minecraft.entity.EntityList$EntityEggInfo local9 = ((net.minecraft.entity.EntityList$EntityEggInfo)(((java.util.List)(this.y)).get(((int)(p0)))));
    java.lang.String local10 = moom.oO.a(((java.lang.String)(__sourceIntrinsic_499f7b7391d8_invokedynamic6783_6(net.minecraft.entity.EntityList.a__String(((int)(((net.minecraft.entity.EntityList$EntityEggInfo)(local9)).a)))))), ((java.lang.Object[])(new java.lang.Object[0])));
    int local11 = ((moom.B2)(((net.minecraft.client.gui.achievement.GuiStats)(this.z)).C)).a(((moom.BY)(((net.minecraft.entity.EntityList$EntityEggInfo)(local9)).d)));
    int local12 = ((moom.B2)(((net.minecraft.client.gui.achievement.GuiStats)(this.z)).C)).a(((moom.BY)(((net.minecraft.entity.EntityList$EntityEggInfo)(local9)).e)));
    java.lang.String local13 = moom.oO.a(((java.lang.String)("stat.entityKills")), ((java.lang.Object[])(new java.lang.Object[] {java.lang.Integer.valueOf(((int)(local11))), local10})));
    java.lang.String local14 = moom.oO.a(((java.lang.String)("stat.entityKilledBy")), ((java.lang.Object[])(new java.lang.Object[] {local10, java.lang.Integer.valueOf(((int)(local12)))})));
    if ((local11 == 0)) {
        local13 = moom.oO.a(((java.lang.String)("stat.entityKills.none")), ((java.lang.Object[])(new java.lang.Object[] {local10})));
    }
    if ((local12 == 0)) {
        local14 = moom.oO.a(((java.lang.String)("stat.entityKilledBy.none")), ((java.lang.Object[])(new java.lang.Object[] {local10})));
    }
    ((net.minecraft.client.gui.achievement.GuiStats)(this.z)).b(((net.minecraft.client.gui.FontRenderer)(net.minecraft.client.gui.achievement.GuiStats.n(((net.minecraft.client.gui.achievement.GuiStats)(this.z))))), ((java.lang.String)(local10)), ((int)(((p1 + 2) - __sourceIntrinsic_499f7b7391d8_invokedynamic6783_25(16703, (6772611269057419065L ^ local7))))), ((int)((p2 + 1))), ((int)(__sourceIntrinsic_499f7b7391d8_invokedynamic6783_26(4318, (5809840413319874266L ^ local7)))));
    ((net.minecraft.client.gui.achievement.GuiStats)(this.z)).b(((net.minecraft.client.gui.FontRenderer)(net.minecraft.client.gui.achievement.GuiStats.o(((net.minecraft.client.gui.achievement.GuiStats)(this.z))))), ((java.lang.String)(local13)), ((int)((p1 + 2))), ((int)(((p2 + 1) + ((net.minecraft.client.gui.FontRenderer)(net.minecraft.client.gui.achievement.GuiStats.p(((net.minecraft.client.gui.achievement.GuiStats)(this.z))))).c))), ((int)(((local11 == 0) ? __sourceIntrinsic_499f7b7391d8_invokedynamic6783_34(21683, (1573189654220538548L ^ local7)) : __sourceIntrinsic_499f7b7391d8_invokedynamic6783_35(13121, (7378038097118586176L ^ local7))))));
    ((net.minecraft.client.gui.achievement.GuiStats)(this.z)).b(((net.minecraft.client.gui.FontRenderer)(net.minecraft.client.gui.achievement.GuiStats.q(((net.minecraft.client.gui.achievement.GuiStats)(this.z))))), ((java.lang.String)(local14)), ((int)((p1 + 2))), ((int)(((p2 + 1) + (((net.minecraft.client.gui.FontRenderer)(net.minecraft.client.gui.achievement.GuiStats.r(((net.minecraft.client.gui.achievement.GuiStats)(this.z))))).c * 2)))), ((int)(((local12 == 0) ? __sourceIntrinsic_499f7b7391d8_invokedynamic6783_43(19468, (4627750935853996553L ^ local7)) : __sourceIntrinsic_499f7b7391d8_invokedynamic6783_44(8634, (2217681788358195129L ^ local7))))));
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_81ddcf91b7ce6418_invokedynamic468_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_81ddcf91b7ce6418_invokedynamic468_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_499f7b7391d8_invokedynamic6783_6(java.lang.String a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_499f7b7391d8_invokedynamic6783_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_499f7b7391d8_invokedynamic6783_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_499f7b7391d8_invokedynamic6783_34(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_499f7b7391d8_invokedynamic6783_35(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_499f7b7391d8_invokedynamic6783_43(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_499f7b7391d8_invokedynamic6783_44(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral8061_0() throws E;
}
