package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Aa implements moom.yK<moom.y2> {

private java.lang.String a;

private int b;

private int c;

private int d;

private float e;

private int f;

private static long g;

private static long[] h;

private static java.lang.Integer[] i;

private static java.util.Map j;

public Aa() { super(); }


private static void __sourceConstructorBody_d7a26775d8d59928(moom.Aa receiver) throws Throwable {

long local1 = (moom.Aa.g ^ 138316336997052L);

    moom.Aa.__sourceConstructorInit_d7a26775d8d59928_0(((moom.Aa)(receiver)));

    ((moom.Aa)(receiver)).c = ((int)(__sourceIntrinsic_d7a26775d8d59928_originalDynamicSite1812_2(17467, (4489399631099485413L ^ local1))));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_d7a26775d8d59928_0(moom.Aa a0) throws E;
private static native <E extends Throwable> void __sourceConstructorInit_7ca33fdf00d0658e_0(moom.Aa a0) throws E;

public Aa(java.lang.String p0, double p1, double p2, double p3, float p4, float p5) { super(); }


private static void __sourceConstructorBody_7ca33fdf00d0658e(moom.Aa receiver, java.lang.String p0, double p1, double p2, double p3, float p4, float p5) throws Throwable {

long local10 = (moom.Aa.g ^ 114033663137896L);

    moom.Aa.__sourceConstructorInit_7ca33fdf00d0658e_0(((moom.Aa)(receiver)));

    ((moom.Aa)(receiver)).c = ((int)(__sourceIntrinsic_7ca33fdf00d0658e_originalDynamicSite1813_2(26690, (7396169394130422347L ^ local10))));

    org.apache.commons.lang3.Validate.notNull(((java.lang.Object)(p0)), ((java.lang.String)("name")), ((java.lang.Object[])(new java.lang.Object[0])));

    ((moom.Aa)(receiver)).a = ((java.lang.String)(p0));

    ((moom.Aa)(receiver)).b = ((int)(((int) (p1 * 0x1.0p3d))));

    ((moom.Aa)(receiver)).c = ((int)(((int) (p2 * 0x1.0p3d))));

    ((moom.Aa)(receiver)).d = ((int)(((int) (p3 * 0x1.0p3d))));

    ((moom.Aa)(receiver)).e = ((float)(p4));

    ((moom.Aa)(receiver)).f = ((int)(((int) (p5 * 0x1.f8p5f))));

    p5 = moom.Dr.a(((float)(p5)), ((float)(0x0.0p0f)), ((float)(0x1.fep7f)));

    return;

}



static {
g = ((long)(((moom._a)(moom._c.a(((long)(-8726709537233215816L)), ((long)(-3303184209629869587L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(79344363096453L)))));
    j = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.Aa.g ^ 19430548213033L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill475_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill475_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill475_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill475_14 = new byte[8];
    (__sourceSpill475_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill475_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation475_16 = __sourceSpill475_14;
    ((javax.crypto.Cipher)(__sourceSpill475_11)).init(((int)(__sourceSpill475_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill475_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation475_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[3];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "\rÆ¤¯éAÍ:Ï`=\0014pg\001G'§L¸m"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill475_25 = local6_life21;
        int __sourceSpill475_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill475_25)).substring(((int)(__sourceSpill475_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill475_30 = local8_life19;
        int __sourceSpill475_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill475_33 = new byte[8];
        (__sourceSpill475_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill475_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill475_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill475_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill475_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill475_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill475_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill475_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill475_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill475_34)).doFinal(((byte[])(__sourceSpill475_33)));
        (__sourceSpill475_30)[__sourceSpill475_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    h = ((long[])(local8_life19));
    i = ((java.lang.Integer[])(new java.lang.Integer[3]));
}


public float b__Float() {
return (((float) this.f) / 0x1.f8p5f);
}


public double b() {
return ((double) (((float) this.c) / 0x1.0p3f));
}


public void b(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
((net.minecraft.network.PacketBuffer)(p0)).a(((java.lang.String)(this.a)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeInt(((int)(this.b)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeInt(((int)(this.c)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeInt(((int)(this.d)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeFloat(((float)(this.e)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeByte(((int)(this.f)));
    return;
}


public double c() {
return ((double) (((float) this.d) / 0x1.0p3f));
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 1351;
      if (i[var3] == null) {
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
         long var5 = h[var3];
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
         Object[] var9 = (Object[])j.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               j.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/Aa", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         i[var3] = var15;
      }

      return i[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.Aa.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral3705_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Aa"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
long local2 = (moom.Aa.g ^ 131484580053326L);
    this.a = ((java.lang.String)(((net.minecraft.network.PacketBuffer)(p0)).a__String(((int)(__sourceIntrinsic_ba748fb9d83f_originalDynamicSite1054_1(13724, (1710059109445701298L ^ local2)))))));
    this.b = ((int)(((net.minecraft.network.PacketBuffer)(p0)).readInt()));
    this.c = ((int)(((net.minecraft.network.PacketBuffer)(p0)).readInt()));
    this.d = ((int)(((net.minecraft.network.PacketBuffer)(p0)).readInt()));
    this.e = ((float)(((net.minecraft.network.PacketBuffer)(p0)).readFloat()));
    this.f = ((int)(((net.minecraft.network.PacketBuffer)(p0)).readUnsignedByte()));
    return;
}


public java.lang.String a__String() {
return this.a;
}


public double a() {
return ((double) (((float) this.b) / 0x1.0p3f));
}


public float a__Float() {
return this.e;
}


public void a(moom.y2 p0) {
((moom.y2)(p0)).a(((moom.Aa)(this)));
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_d7a26775d8d59928_originalDynamicSite1812_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ca33fdf00d0658e_originalDynamicSite1813_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral3705_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ba748fb9d83f_originalDynamicSite1054_1(int a0, long a1) throws E;
}
