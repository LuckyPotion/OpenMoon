package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class i7 extends moom.iQ {

public moom.jD i;

public moom.jD j;

public moom.jD k;

public moom.jD l;

public moom.jD m;

public moom.jD n;

public moom.jD o;

private static long p;

private static long[] q;

private static java.lang.Integer[] r;

private static java.util.Map s;

public i7() {
this(((float)(0x0.0p0f)));
    return;
}

private static native <E extends Throwable> void __sourceConstructorInit_e8cfbaab9c08eee7_0(moom.i7 a0) throws E;

public i7(float p0) { super(); }


private static void __sourceConstructorBody_e8cfbaab9c08eee7(moom.i7 receiver, float p0) throws Throwable {

long local2 = (moom.i7.p ^ 102737280712570L);

    moom.i7.__sourceConstructorInit_e8cfbaab9c08eee7_0(((moom.i7)(receiver)));

    int local4 = __sourceIntrinsic_e8cfbaab9c08eee7_originalDynamicSite2869_2(7090, (4894288439053725907L ^ local2));

    ((moom.i7)(receiver)).i = ((moom.jD)(new moom.jD(receiver, 0, 0)));

    ((moom.jD)(((moom.i7)(receiver)).i)).a(((float)(-0x1.0p2f)), ((float)(-0x1.0p3f)), ((float)(-0x1.0p2f)), ((int)(__sourceIntrinsic_e8cfbaab9c08eee7_originalDynamicSite2869_5(4599, (6526849104698489491L ^ local2)))), ((int)(__sourceIntrinsic_e8cfbaab9c08eee7_originalDynamicSite2869_6(8474, (1568398057163131513L ^ local2)))), ((int)(__sourceIntrinsic_e8cfbaab9c08eee7_originalDynamicSite2869_7(8474, (1568398057163131513L ^ local2)))), ((float)(p0)));

    ((moom.jD)(((moom.i7)(receiver)).i)).a(((float)(0x0.0p0f)), ((float)(((float) local4))), ((float)(0x0.0p0f)));

    ((moom.i7)(receiver)).j = ((moom.jD)(new moom.jD(receiver, __sourceIntrinsic_e8cfbaab9c08eee7_originalDynamicSite2869_11(13611, (5136249505348656708L ^ local2)), 0)));

    ((moom.jD)(((moom.i7)(receiver)).j)).a(((float)(-0x1.0p2f)), ((float)(-0x1.0p3f)), ((float)(-0x1.0p2f)), ((int)(__sourceIntrinsic_e8cfbaab9c08eee7_originalDynamicSite2869_14(8474, (1568398057163131513L ^ local2)))), ((int)(__sourceIntrinsic_e8cfbaab9c08eee7_originalDynamicSite2869_15(8474, (1568398057163131513L ^ local2)))), ((int)(__sourceIntrinsic_e8cfbaab9c08eee7_originalDynamicSite2869_16(8474, (1568398057163131513L ^ local2)))), ((float)((p0 + 0x1.0p-1f))));

    ((moom.jD)(((moom.i7)(receiver)).j)).a(((float)(0x0.0p0f)), ((float)(((float) local4))), ((float)(0x0.0p0f)));

    ((moom.i7)(receiver)).k = ((moom.jD)(new moom.jD(receiver, __sourceIntrinsic_e8cfbaab9c08eee7_originalDynamicSite2869_20(14229, (6408843321667230960L ^ local2)), __sourceIntrinsic_e8cfbaab9c08eee7_originalDynamicSite2869_21(20949, (7245509664039729845L ^ local2)))));

    ((moom.jD)(((moom.i7)(receiver)).k)).a(((float)(-0x1.0p2f)), ((float)(0x0.0p0f)), ((float)(-0x1.0p1f)), ((int)(__sourceIntrinsic_e8cfbaab9c08eee7_originalDynamicSite2869_24(8474, (1568398057163131513L ^ local2)))), ((int)(__sourceIntrinsic_e8cfbaab9c08eee7_originalDynamicSite2869_25(16321, (5474669120514462886L ^ local2)))), ((int)(4)), ((float)(p0)));

    ((moom.jD)(((moom.i7)(receiver)).k)).a(((float)(0x0.0p0f)), ((float)(((float) local4))), ((float)(0x0.0p0f)));

    ((moom.i7)(receiver)).l = ((moom.jD)(new moom.jD(receiver, 0, __sourceIntrinsic_e8cfbaab9c08eee7_originalDynamicSite2869_29(20949, (7245509664039729845L ^ local2)))));

    ((moom.jD)(((moom.i7)(receiver)).l)).a(((float)(-0x1.0p1f)), ((float)(0x0.0p0f)), ((float)(-0x1.0p1f)), ((int)(4)), ((int)(__sourceIntrinsic_e8cfbaab9c08eee7_originalDynamicSite2869_32(13406, (1553854097230536504L ^ local2)))), ((int)(4)), ((float)(p0)));

    ((moom.jD)(((moom.i7)(receiver)).l)).a(((float)(-0x1.0p1f)), ((float)(((float) (__sourceIntrinsic_e8cfbaab9c08eee7_originalDynamicSite2869_35(22102, (3908206695248035124L ^ local2)) + local4)))), ((float)(0x1.0p2f)));

    ((moom.i7)(receiver)).m = ((moom.jD)(new moom.jD(receiver, 0, __sourceIntrinsic_e8cfbaab9c08eee7_originalDynamicSite2869_37(20949, (7245509664039729845L ^ local2)))));

    ((moom.jD)(((moom.i7)(receiver)).m)).a(((float)(-0x1.0p1f)), ((float)(0x0.0p0f)), ((float)(-0x1.0p1f)), ((int)(4)), ((int)(__sourceIntrinsic_e8cfbaab9c08eee7_originalDynamicSite2869_40(13406, (1553854097230536504L ^ local2)))), ((int)(4)), ((float)(p0)));

    ((moom.jD)(((moom.i7)(receiver)).m)).a(((float)(0x1.0p1f)), ((float)(((float) (__sourceIntrinsic_e8cfbaab9c08eee7_originalDynamicSite2869_43(22102, (3908206695248035124L ^ local2)) + local4)))), ((float)(0x1.0p2f)));

    ((moom.i7)(receiver)).n = ((moom.jD)(new moom.jD(receiver, 0, __sourceIntrinsic_e8cfbaab9c08eee7_originalDynamicSite2869_45(20949, (7245509664039729845L ^ local2)))));

    ((moom.jD)(((moom.i7)(receiver)).n)).a(((float)(-0x1.0p1f)), ((float)(0x0.0p0f)), ((float)(-0x1.0p1f)), ((int)(4)), ((int)(__sourceIntrinsic_e8cfbaab9c08eee7_originalDynamicSite2869_48(13406, (1553854097230536504L ^ local2)))), ((int)(4)), ((float)(p0)));

    ((moom.jD)(((moom.i7)(receiver)).n)).a(((float)(-0x1.0p1f)), ((float)(((float) (__sourceIntrinsic_e8cfbaab9c08eee7_originalDynamicSite2869_51(22102, (3908206695248035124L ^ local2)) + local4)))), ((float)(-0x1.0p2f)));

    ((moom.i7)(receiver)).o = ((moom.jD)(new moom.jD(receiver, 0, __sourceIntrinsic_e8cfbaab9c08eee7_originalDynamicSite2869_53(20949, (7245509664039729845L ^ local2)))));

    ((moom.jD)(((moom.i7)(receiver)).o)).a(((float)(-0x1.0p1f)), ((float)(0x0.0p0f)), ((float)(-0x1.0p1f)), ((int)(4)), ((int)(__sourceIntrinsic_e8cfbaab9c08eee7_originalDynamicSite2869_56(13406, (1553854097230536504L ^ local2)))), ((int)(4)), ((float)(p0)));

    ((moom.jD)(((moom.i7)(receiver)).o)).a(((float)(0x1.0p1f)), ((float)(((float) (__sourceIntrinsic_e8cfbaab9c08eee7_originalDynamicSite2869_59(22102, (3908206695248035124L ^ local2)) + local4)))), ((float)(-0x1.0p2f)));

    return;

}



static {
p = ((long)(((moom._a)(moom._c.a(((long)(7172568599651245973L)), ((long)(-6966657154041172972L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(190756663661216L)))));
    s = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.i7.p ^ 33319904327321L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1282_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1282_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1282_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1282_14 = new byte[8];
    (__sourceSpill1282_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1282_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1282_16 = __sourceSpill1282_14;
    ((javax.crypto.Cipher)(__sourceSpill1282_11)).init(((int)(__sourceSpill1282_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1282_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1282_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[9];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "A¨pw\037³×cÛcFÀX^­ræ\013®æ|zÃ£?g½ý\000\006^°\037@FÄÈâÁíÍAóÐ['\\E"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1282_25 = local6_life21;
        int __sourceSpill1282_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1282_25)).substring(((int)(__sourceSpill1282_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1282_30 = local8_life19;
        int __sourceSpill1282_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1282_33 = new byte[8];
        (__sourceSpill1282_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1282_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1282_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1282_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1282_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1282_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1282_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1282_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1282_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1282_34)).doFinal(((byte[])(__sourceSpill1282_33)));
        (__sourceSpill1282_30)[__sourceSpill1282_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "fD\177¦BN\033n:PÚøc"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1282_38 = local6_life21;
        int __sourceSpill1282_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1282_38)).substring(((int)(__sourceSpill1282_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1282_43 = local8_life19;
        int __sourceSpill1282_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1282_46 = new byte[8];
        (__sourceSpill1282_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1282_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1282_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1282_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1282_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1282_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1282_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1282_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1282_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1282_47)).doFinal(((byte[])(__sourceSpill1282_46)));
        (__sourceSpill1282_43)[__sourceSpill1282_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    q = ((long[])(local8_life19));
    r = ((java.lang.Integer[])(new java.lang.Integer[9]));
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.i7.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7994_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/i7"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 10751;
      if (r[var3] == null) {
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
         long var5 = q[var3];
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
         Object[] var9 = (Object[])s.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               s.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/i7", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         r[var3] = var15;
      }

      return r[var3];
}


public void a(net.minecraft.entity.Entity p0, float p1, float p2, float p3, float p4, float p5, float p6) {
((moom.i7)(this)).a(((float)(p1)), ((float)(p2)), ((float)(p3)), ((float)(p4)), ((float)(p5)), ((float)(p6)), ((net.minecraft.entity.Entity)(p0)));
    ((moom.jD)(this.i)).a(((float)(p6)));
    ((moom.jD)(this.k)).a(((float)(p6)));
    ((moom.jD)(this.l)).a(((float)(p6)));
    ((moom.jD)(this.m)).a(((float)(p6)));
    ((moom.jD)(this.n)).a(((float)(p6)));
    ((moom.jD)(this.o)).a(((float)(p6)));
    return;
}


public void a(float p0, float p1, float p2, float p3, float p4, float p5, net.minecraft.entity.Entity p6) {
((moom.jD)(this.i)).i = ((float)((p3 / 0x1.ca5dcp5f)));
    ((moom.jD)(this.i)).h = ((float)((p4 / 0x1.ca5dcp5f)));
    ((moom.jD)(this.l)).h = ((float)(((moom.Dr.b(((float)((p0 * 0x1.55182ap-1f)))) * 0x1.666666p0f) * p1)));
    ((moom.jD)(this.m)).h = ((float)(((moom.Dr.b(((float)(((p0 * 0x1.55182ap-1f) + 0x1.921fb6p1f)))) * 0x1.666666p0f) * p1)));
    ((moom.jD)(this.n)).h = ((float)(((moom.Dr.b(((float)(((p0 * 0x1.55182ap-1f) + 0x1.921fb6p1f)))) * 0x1.666666p0f) * p1)));
    ((moom.jD)(this.o)).h = ((float)(((moom.Dr.b(((float)((p0 * 0x1.55182ap-1f)))) * 0x1.666666p0f) * p1)));
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_e8cfbaab9c08eee7_originalDynamicSite2869_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e8cfbaab9c08eee7_originalDynamicSite2869_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e8cfbaab9c08eee7_originalDynamicSite2869_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e8cfbaab9c08eee7_originalDynamicSite2869_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e8cfbaab9c08eee7_originalDynamicSite2869_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e8cfbaab9c08eee7_originalDynamicSite2869_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e8cfbaab9c08eee7_originalDynamicSite2869_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e8cfbaab9c08eee7_originalDynamicSite2869_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e8cfbaab9c08eee7_originalDynamicSite2869_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e8cfbaab9c08eee7_originalDynamicSite2869_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e8cfbaab9c08eee7_originalDynamicSite2869_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e8cfbaab9c08eee7_originalDynamicSite2869_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e8cfbaab9c08eee7_originalDynamicSite2869_29(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e8cfbaab9c08eee7_originalDynamicSite2869_32(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e8cfbaab9c08eee7_originalDynamicSite2869_35(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e8cfbaab9c08eee7_originalDynamicSite2869_37(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e8cfbaab9c08eee7_originalDynamicSite2869_40(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e8cfbaab9c08eee7_originalDynamicSite2869_43(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e8cfbaab9c08eee7_originalDynamicSite2869_45(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e8cfbaab9c08eee7_originalDynamicSite2869_48(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e8cfbaab9c08eee7_originalDynamicSite2869_51(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e8cfbaab9c08eee7_originalDynamicSite2869_53(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e8cfbaab9c08eee7_originalDynamicSite2869_56(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e8cfbaab9c08eee7_originalDynamicSite2869_59(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7994_0() throws E;
}
