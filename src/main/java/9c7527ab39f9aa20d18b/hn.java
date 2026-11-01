package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class hn extends moom.hg {

private static moom.DD Z;

public net.minecraft.inventory.IInventory aa;

public net.minecraft.inventory.IInventory ab;

private int ac;

private static long cb;

private static long[] fb;

private static java.lang.Integer[] pb;

private static java.util.Map qb;

public hn(net.minecraft.inventory.IInventory p0, net.minecraft.inventory.IInventory p1) { super((moom.v8)null); }


private static void __sourceConstructorBody_febac1ca1e607438(moom.hn receiver, net.minecraft.inventory.IInventory p0, net.minecraft.inventory.IInventory p1) throws Throwable {

long local3_life1 = (moom.hn.cb ^ 85483158092902L);

    moom.hn.__sourceConstructorInit_febac1ca1e607438_0(((moom.hn)(receiver)), ((moom.wc)(new moom.wc(p0, p1, ((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).K))));

    ((moom.hn)(receiver)).aa = ((net.minecraft.inventory.IInventory)(p0));

    ((moom.hn)(receiver)).ab = ((net.minecraft.inventory.IInventory)(p1));

    ((moom.hn)(receiver)).o = ((boolean)(false));

    int local5_life9 = __sourceIntrinsic_febac1ca1e607438_originalDynamicSite809_8(15344, (1100582287792248137L ^ local3_life1));

    int local6_life11 = (local5_life9 - __sourceIntrinsic_febac1ca1e607438_originalDynamicSite809_10(2337, (7346755663605507984L ^ local3_life1)));

    ((moom.hn)(receiver)).ac = ((int)((((net.minecraft.inventory.IInventory)(p1)).b__Int() / __sourceIntrinsic_febac1ca1e607438_originalDynamicSite809_13(28238, (8876445875932610814L ^ local3_life1)))));

    ((moom.hn)(receiver)).y = ((int)((local6_life11 + (((moom.hn)(receiver)).ac * __sourceIntrinsic_febac1ca1e607438_originalDynamicSite809_16(1566, (6977970210681825452L ^ local3_life1))))));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_febac1ca1e607438_0(moom.hn a0, moom.wc a1) throws E;

static {
cb = ((long)(((moom._a)(moom._c.a(((long)(1868612250867239017L)), ((long)(1406910879028101884L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(14257065764571L)))));
    qb = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.hn.cb ^ 100017240394228L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1263_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1263_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1263_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1263_14 = new byte[8];
    (__sourceSpill1263_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1263_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1263_16 = __sourceSpill1263_14;
    ((javax.crypto.Cipher)(__sourceSpill1263_11)).init(((int)(__sourceSpill1263_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1263_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1263_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[12];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "\000;g\003a<ª\027\037\031î0lÂ\023ØSÊf6ØøhÖ¡Ú_¢9©x\030\027h'=\001¤\027\000\004ÈMâ'Âw­.êãVÏsJ¹JãvÇSÁØÌ¢¢ü"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1263_25 = local6_life21;
        int __sourceSpill1263_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1263_25)).substring(((int)(__sourceSpill1263_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1263_30 = local8_life19;
        int __sourceSpill1263_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1263_33 = new byte[8];
        (__sourceSpill1263_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1263_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1263_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1263_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1263_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1263_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1263_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1263_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1263_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1263_34)).doFinal(((byte[])(__sourceSpill1263_33)));
        (__sourceSpill1263_30)[__sourceSpill1263_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "\005:a:~+hH\027w¥O\035\033£"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1263_38 = local6_life21;
        int __sourceSpill1263_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1263_38)).substring(((int)(__sourceSpill1263_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1263_43 = local8_life19;
        int __sourceSpill1263_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1263_46 = new byte[8];
        (__sourceSpill1263_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1263_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1263_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1263_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1263_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1263_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1263_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1263_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1263_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1263_47)).doFinal(((byte[])(__sourceSpill1263_46)));
        (__sourceSpill1263_43)[__sourceSpill1263_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    fb = ((long[])(local8_life19));
    pb = ((java.lang.Integer[])(new java.lang.Integer[12]));
    Z = ((moom.DD)(new moom.DD("textures/gui/container/generic_54.png")));
}


protected void b(int p0, int p1) {
long local3 = (moom.hn.cb ^ 34873780440020L);
    ((net.minecraft.client.gui.FontRenderer)(this.p)).b(((java.lang.String)(((net.minecraft.util.IChatComponent)(((net.minecraft.inventory.IInventory)(this.ab)).a__C5())).b())), ((float)(0x1.0p3f)), ((float)(0x1.8p2f)), ((int)(__sourceIntrinsic_45fde0f4e55e_originalDynamicSite1493_5(16544, (6644328700549126566L ^ local3)))));
    ((net.minecraft.client.gui.FontRenderer)(this.p)).b(((java.lang.String)(((net.minecraft.util.IChatComponent)(((net.minecraft.inventory.IInventory)(this.aa)).a__C5())).b())), ((float)(0x1.0p3f)), ((float)(((float) ((this.y - __sourceIntrinsic_45fde0f4e55e_originalDynamicSite1493_12(6049, (1207605876062064297L ^ local3))) + 2)))), ((int)(__sourceIntrinsic_45fde0f4e55e_originalDynamicSite1493_13(13964, (9037371858509016973L ^ local3)))));
    return;
}


private static java.lang.invoke.CallSite d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral7923_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/hn"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.hn.d(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int d(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 2264;
      if (pb[var3] == null) {
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
         long var5 = fb[var3];
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
         Object[] var9 = (Object[])qb.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               qb.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/hn", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         pb[var3] = var15;
      }

      return pb[var3];
}


public int a() {
return this.ac;
}


protected void a(float p0, int p1, int p2) {
long local4 = (moom.hn.cb ^ 99636499261301L);
    moom.kZ.c(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    ((net.minecraft.client.renderer.texture.TextureManager)(((net.minecraft.client.Minecraft)(this.i)).a__ok())).a__Void(((moom.DD)(moom.hn.Z)));
    int local6 = ((this.k - this.x) / 2);
    int local7 = ((this.l - this.y) / 2);
    ((moom.hn)(this)).b(((int)(local6)), ((int)(local7)), ((int)(0)), ((int)(0)), ((int)(this.x)), ((int)(((this.ac * __sourceIntrinsic_3f29d380c6dd_originalDynamicSite1494_12(29807, (3657066109221913031L ^ local4))) + __sourceIntrinsic_3f29d380c6dd_originalDynamicSite1494_13(21389, (3454055548181440040L ^ local4))))));
    ((moom.hn)(this)).b(((int)(local6)), ((int)(((local7 + (this.ac * __sourceIntrinsic_3f29d380c6dd_originalDynamicSite1494_16(1566, (6977955777152693183L ^ local4)))) + __sourceIntrinsic_3f29d380c6dd_originalDynamicSite1494_17(6669, (4082883563052937129L ^ local4))))), ((int)(0)), ((int)(__sourceIntrinsic_3f29d380c6dd_originalDynamicSite1494_18(27031, (2497579111359536177L ^ local4)))), ((int)(this.x)), ((int)(__sourceIntrinsic_3f29d380c6dd_originalDynamicSite1494_20(8706, (4657336918754269097L ^ local4)))));
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_febac1ca1e607438_originalDynamicSite809_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_febac1ca1e607438_originalDynamicSite809_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_febac1ca1e607438_originalDynamicSite809_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_febac1ca1e607438_originalDynamicSite809_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_45fde0f4e55e_originalDynamicSite1493_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_45fde0f4e55e_originalDynamicSite1493_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_45fde0f4e55e_originalDynamicSite1493_13(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral7923_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3f29d380c6dd_originalDynamicSite1494_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3f29d380c6dd_originalDynamicSite1494_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3f29d380c6dd_originalDynamicSite1494_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3f29d380c6dd_originalDynamicSite1494_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3f29d380c6dd_originalDynamicSite1494_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3f29d380c6dd_originalDynamicSite1494_20(int a0, long a1) throws E;
}
