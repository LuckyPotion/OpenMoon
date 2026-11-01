package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
class h4 extends moom.h1 {

private java.util.List<java.lang.String> y;

private java.util.Map<java.lang.String, moom.oU> z;

moom.gU A;

private static long B;

private static long[] C;

private static java.lang.Integer[] D;

private static java.util.Map E;

public h4(moom.gU p0, net.minecraft.client.Minecraft p1) { super((net.minecraft.client.Minecraft)null, 0, 0, 0, 0, 0); }


private static void __sourceConstructorBody_1bc9b546fdf8fd48(moom.h4 receiver, moom.gU p0, net.minecraft.client.Minecraft p1) throws Throwable {

long local3_life1 = (moom.h4.B ^ 111873031885614L);

    ((moom.h4)(receiver)).A = ((moom.gU)(p0));

    moom.h4.__sourceConstructorInit_1bc9b546fdf8fd48_0(((moom.h4)(receiver)), ((net.minecraft.client.Minecraft)(p1)), ((int)(((moom.gU)(p0)).k)), ((int)(((moom.gU)(p0)).l)), ((int)(__sourceIntrinsic_1bc9b546fdf8fd48_originalDynamicSite2164_5(14664, (3425716577552635102L ^ local3_life1)))), ((int)(((((moom.gU)(p0)).l - __sourceIntrinsic_1bc9b546fdf8fd48_originalDynamicSite2164_7(22949, (3487746300954833975L ^ local3_life1))) + 4))), ((int)(__sourceIntrinsic_1bc9b546fdf8fd48_originalDynamicSite2164_8(22370, (3943648070614645493L ^ local3_life1)))));

    ((moom.h4)(receiver)).y = ((java.util.List)(com.google.common.collect.Lists.newArrayList()));

    ((moom.h4)(receiver)).z = ((java.util.Map)(com.google.common.collect.Maps.newHashMap()));

    java.util.Iterator local5_life17 = ((java.util.SortedSet)(((net.minecraft.client.resources.LanguageManager)(((moom.gU)(p0)).z)).a())).iterator();

    while (((java.util.Iterator)(local5_life17)).hasNext()) {

        moom.oU local6_life21 = ((moom.oU)(((java.util.Iterator)(local5_life17)).next()));

        ((java.util.Map)(((moom.h4)(receiver)).z)).put(((java.lang.Object)(((moom.oU)(local6_life21)).a())), ((java.lang.Object)(local6_life21)));

        ((java.util.List)(((moom.h4)(receiver)).y)).add(((java.lang.Object)(((moom.oU)(local6_life21)).a())));

    }

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_1bc9b546fdf8fd48_0(moom.h4 a0, net.minecraft.client.Minecraft a1, int a2, int a3, int a4, int a5, int a6) throws E;

static {
B = ((long)(((moom._a)(moom._c.a(((long)(5329721280937780195L)), ((long)(-3451169072830232124L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(127746446699659L)))));
    E = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.h4.B ^ 42356345886316L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1242_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1242_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1242_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1242_14 = new byte[8];
    (__sourceSpill1242_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1242_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1242_16 = __sourceSpill1242_14;
    ((javax.crypto.Cipher)(__sourceSpill1242_11)).init(((int)(__sourceSpill1242_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1242_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1242_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[5];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "ë|½lîsDÕSIîU?À¸dH\031±ï¶"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1242_25 = local6_life21;
        int __sourceSpill1242_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1242_25)).substring(((int)(__sourceSpill1242_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1242_30 = local8_life19;
        int __sourceSpill1242_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1242_33 = new byte[8];
        (__sourceSpill1242_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1242_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1242_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1242_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1242_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1242_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1242_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1242_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1242_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1242_34)).doFinal(((byte[])(__sourceSpill1242_33)));
        (__sourceSpill1242_30)[__sourceSpill1242_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "6é0´×bX0¿^$|\005A"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1242_38 = local6_life21;
        int __sourceSpill1242_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1242_38)).substring(((int)(__sourceSpill1242_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1242_43 = local8_life19;
        int __sourceSpill1242_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1242_46 = new byte[8];
        (__sourceSpill1242_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1242_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1242_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1242_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1242_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1242_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1242_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1242_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1242_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1242_47)).doFinal(((byte[])(__sourceSpill1242_46)));
        (__sourceSpill1242_43)[__sourceSpill1242_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    C = ((long[])(local8_life19));
    D = ((java.lang.Integer[])(new java.lang.Integer[5]));
}


protected int b() {
long local1 = (moom.h4.B ^ 57858499245421L);
    return (((moom.h4)(this)).a() * __sourceIntrinsic_e1958f95391c_originalDynamicSite1470_2(27808, (4097021035439991L ^ local1)));
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 52;
      if (D[var3] == null) {
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
         long var5 = C[var3];
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
         Object[] var9 = (Object[])E.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               E.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/h4", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         D[var3] = var15;
      }

      return D[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.h4.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral7801_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/h4"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


protected int a() {
return ((java.util.List)(this.y)).size();
}


protected void a(int p0, boolean p1, int p2, int p3) {
net.minecraft.client.gui.FontRenderer forwardValue3581_36_0;
    net.minecraft.client.gui.FontRenderer forwardValue3581_38_0;
    net.minecraft.client.gui.FontRenderer forwardValue3581_39_0;
    int forwardValue3581_39_1;
    net.minecraft.client.gui.FontRenderer spill3581_0;
    moom.oU life5_8;
    forward_join_39: {
    forward_join_38: {
    forward_join_36: {
    life5_8 = ((moom.oU)(((java.util.Map)(this.z)).get(((java.lang.Object)(((java.util.List)(this.y)).get(((int)(p0))))))));
    ((net.minecraft.client.resources.LanguageManager)(((moom.gU)(this.A)).z)).a(((moom.oU)(life5_8)));
    ((net.minecraft.client.settings.GameSettings)(((moom.gU)(this.A)).y)).a1 = ((java.lang.String)(((moom.oU)(life5_8)).a()));
    ((net.minecraft.client.Minecraft)(this.a)).i();
    spill3581_0 = ((moom.gU)(this.A)).p;
    if (!((!((net.minecraft.client.resources.LanguageManager)(((moom.gU)(this.A)).z)).a__Boolean()))) {
        forwardValue3581_36_0 = spill3581_0;
        break forward_join_36;
    }
    if (!(((net.minecraft.client.settings.GameSettings)(((moom.gU)(this.A)).y)).a2)) {
        forwardValue3581_38_0 = spill3581_0;
        break forward_join_38;
    }
    forwardValue3581_36_0 = spill3581_0;
    }
    forwardValue3581_39_0 = forwardValue3581_36_0;
    forwardValue3581_39_1 = 1;
    break forward_join_39;
    }
    forwardValue3581_39_0 = forwardValue3581_38_0;
    forwardValue3581_39_1 = 0;
    }
    ((net.minecraft.client.gui.FontRenderer)(forwardValue3581_39_0)).a(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue3581_39_1))));
    ((net.minecraft.client.gui.FontRenderer)(((moom.gU)(this.A)).p)).b(((boolean)(((net.minecraft.client.resources.LanguageManager)(((moom.gU)(this.A)).z)).b())));
    ((moom.gi)(((moom.gU)(this.A)).B)).k = ((java.lang.String)(moom.oO.a(((java.lang.String)("gui.done")), ((java.lang.Object[])(new java.lang.Object[0])))));
    ((moom.gi)(((moom.gU)(this.A)).A)).k = ((java.lang.String)(((net.minecraft.client.settings.GameSettings)(((moom.gU)(this.A)).y)).a__String(((net.minecraft.client.settings.GameSettings$Options)(net.minecraft.client.settings.GameSettings$Options.FORCE_UNICODE_FONT)))));
    ((net.minecraft.client.settings.GameSettings)(((moom.gU)(this.A)).y)).b();
    return;
}


protected boolean a__Boolean(int p0) {
return (__sourceIntrinsic_booleanComparison((((java.lang.String)(((java.lang.String)(((java.util.List)(this.y)).get(((int)(p0))))))).equals(((java.lang.Object)(((moom.oU)(((net.minecraft.client.resources.LanguageManager)(((moom.gU)(this.A)).z)).a__oU())).a()))))) != 0);
}


protected void a__Void() {
((moom.gU)(this.A)).i();
    return;
}


protected void a(int p0, int p1, int p2, int p3, int p4, int p5) {
long local7 = (moom.h4.B ^ 87437484116060L);
    ((net.minecraft.client.gui.FontRenderer)(((moom.gU)(this.A)).p)).b(((boolean)(true)));
    ((moom.gU)(this.A)).a(((net.minecraft.client.gui.FontRenderer)(((moom.gU)(this.A)).p)), ((java.lang.String)(((moom.oU)(((moom.oU)(((java.util.Map)(this.z)).get(((java.lang.Object)(((java.util.List)(this.y)).get(((int)(p0)))))))))).toString())), ((int)((this.b / 2))), ((int)((p2 + 1))), ((int)(__sourceIntrinsic_499f7b7391d8_originalDynamicSite1471_14(699, (5501765367639094364L ^ local7)))));
    ((net.minecraft.client.gui.FontRenderer)(((moom.gU)(this.A)).p)).b(((boolean)(((moom.oU)(((net.minecraft.client.resources.LanguageManager)(((moom.gU)(this.A)).z)).a__oU())).a__Boolean())));
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_1bc9b546fdf8fd48_originalDynamicSite2164_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1bc9b546fdf8fd48_originalDynamicSite2164_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1bc9b546fdf8fd48_originalDynamicSite2164_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e1958f95391c_originalDynamicSite1470_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral7801_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_499f7b7391d8_originalDynamicSite1471_14(int a0, long a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
