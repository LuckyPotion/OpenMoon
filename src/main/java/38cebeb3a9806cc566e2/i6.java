package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class i6 extends moom.iQ {

public moom.jD i;

public moom.jD j;

public moom.jD k;

public moom.jD l;

public moom.jD m;

public moom.jD n;

public moom.jD o;

public moom.jD p;

private static long q;

private static long[] r;

private static java.lang.Integer[] s;

private static java.util.Map t;

public i6() { super(); }


private static void __sourceConstructorBody_ebbd2b84ab33fd4f(moom.i6 receiver) throws Throwable {

long local1 = (moom.i6.q ^ 21515463392176L);

    moom.i6.__sourceConstructorInit_ebbd2b84ab33fd4f_0(((moom.i6)(receiver)));

    int local3 = __sourceIntrinsic_ebbd2b84ab33fd4f_originalDynamicSite2866_2(31513, (7402346803345692785L ^ local1));

    ((moom.i6)(receiver)).i = ((moom.jD)(new moom.jD(receiver, 0, 0)));

    ((moom.jD)(((moom.i6)(receiver)).i)).a(((float)(-0x1.0p1f)), ((float)(-0x1.8p2f)), ((float)(-0x1.0p1f)), ((int)(4)), ((int)(__sourceIntrinsic_ebbd2b84ab33fd4f_originalDynamicSite2866_5(734, (1380154747906711997L ^ local1)))), ((int)(3)), ((float)(0x0.0p0f)));

    ((moom.jD)(((moom.i6)(receiver)).i)).a(((float)(0x0.0p0f)), ((float)(((float) (-1 + local3)))), ((float)(-0x1.0p2f)));

    ((moom.i6)(receiver)).o = ((moom.jD)(new moom.jD(receiver, __sourceIntrinsic_ebbd2b84ab33fd4f_originalDynamicSite2866_9(19169, (1596272568460880261L ^ local1)), 0)));

    ((moom.jD)(((moom.i6)(receiver)).o)).a(((float)(-0x1.0p1f)), ((float)(-0x1.0p2f)), ((float)(-0x1.0p2f)), ((int)(4)), ((int)(2)), ((int)(2)), ((float)(0x0.0p0f)));

    ((moom.jD)(((moom.i6)(receiver)).o)).a(((float)(0x0.0p0f)), ((float)(((float) (-1 + local3)))), ((float)(-0x1.0p2f)));

    ((moom.i6)(receiver)).p = ((moom.jD)(new moom.jD(receiver, __sourceIntrinsic_ebbd2b84ab33fd4f_originalDynamicSite2866_15(8765, (5824477122671624531L ^ local1)), 4)));

    ((moom.jD)(((moom.i6)(receiver)).p)).a(((float)(-0x1.0p0f)), ((float)(-0x1.0p1f)), ((float)(-0x1.8p1f)), ((int)(2)), ((int)(2)), ((int)(2)), ((float)(0x0.0p0f)));

    ((moom.jD)(((moom.i6)(receiver)).p)).a(((float)(0x0.0p0f)), ((float)(((float) (-1 + local3)))), ((float)(-0x1.0p2f)));

    ((moom.i6)(receiver)).j = ((moom.jD)(new moom.jD(receiver, 0, __sourceIntrinsic_ebbd2b84ab33fd4f_originalDynamicSite2866_21(3409, (5740435627562561072L ^ local1)))));

    ((moom.jD)(((moom.i6)(receiver)).j)).a(((float)(-0x1.8p1f)), ((float)(-0x1.0p2f)), ((float)(-0x1.8p1f)), ((int)(__sourceIntrinsic_ebbd2b84ab33fd4f_originalDynamicSite2866_24(13042, (465841190022271381L ^ local1)))), ((int)(__sourceIntrinsic_ebbd2b84ab33fd4f_originalDynamicSite2866_25(7285, (3674954808470404887L ^ local1)))), ((int)(__sourceIntrinsic_ebbd2b84ab33fd4f_originalDynamicSite2866_26(13042, (465841190022271381L ^ local1)))), ((float)(0x0.0p0f)));

    ((moom.jD)(((moom.i6)(receiver)).j)).a(((float)(0x0.0p0f)), ((float)(((float) local3))), ((float)(0x0.0p0f)));

    ((moom.i6)(receiver)).k = ((moom.jD)(new moom.jD(receiver, __sourceIntrinsic_ebbd2b84ab33fd4f_originalDynamicSite2866_30(22666, (7542502404608375782L ^ local1)), 0)));

    ((moom.jD)(((moom.i6)(receiver)).k)).a(((float)(-0x1.0p0f)), ((float)(0x0.0p0f)), ((float)(-0x1.8p1f)), ((int)(3)), ((int)(5)), ((int)(3)));

    ((moom.jD)(((moom.i6)(receiver)).k)).a(((float)(-0x1.0p1f)), ((float)(((float) (3 + local3)))), ((float)(0x1.0p0f)));

    ((moom.i6)(receiver)).l = ((moom.jD)(new moom.jD(receiver, __sourceIntrinsic_ebbd2b84ab33fd4f_originalDynamicSite2866_36(8209, (8713522542920647550L ^ local1)), 0)));

    ((moom.jD)(((moom.i6)(receiver)).l)).a(((float)(-0x1.0p0f)), ((float)(0x0.0p0f)), ((float)(-0x1.8p1f)), ((int)(3)), ((int)(5)), ((int)(3)));

    ((moom.jD)(((moom.i6)(receiver)).l)).a(((float)(0x1.0p0f)), ((float)(((float) (3 + local3)))), ((float)(0x1.0p0f)));

    ((moom.i6)(receiver)).m = ((moom.jD)(new moom.jD(receiver, __sourceIntrinsic_ebbd2b84ab33fd4f_originalDynamicSite2866_42(18859, (1367501691018521294L ^ local1)), __sourceIntrinsic_ebbd2b84ab33fd4f_originalDynamicSite2866_43(11816, (3227067749002300738L ^ local1)))));

    ((moom.jD)(((moom.i6)(receiver)).m)).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(-0x1.8p1f)), ((int)(1)), ((int)(4)), ((int)(__sourceIntrinsic_ebbd2b84ab33fd4f_originalDynamicSite2866_46(13042, (465841190022271381L ^ local1)))));

    ((moom.jD)(((moom.i6)(receiver)).m)).a(((float)(-0x1.0p2f)), ((float)(((float) (__sourceIntrinsic_ebbd2b84ab33fd4f_originalDynamicSite2866_49(25142, (8830009005268795743L ^ local1)) + local3)))), ((float)(0x0.0p0f)));

    ((moom.i6)(receiver)).n = ((moom.jD)(new moom.jD(receiver, __sourceIntrinsic_ebbd2b84ab33fd4f_originalDynamicSite2866_51(24237, (4123963373601340870L ^ local1)), __sourceIntrinsic_ebbd2b84ab33fd4f_originalDynamicSite2866_52(2587, (5047125760697067901L ^ local1)))));

    ((moom.jD)(((moom.i6)(receiver)).n)).a(((float)(-0x1.0p0f)), ((float)(0x0.0p0f)), ((float)(-0x1.8p1f)), ((int)(1)), ((int)(4)), ((int)(__sourceIntrinsic_ebbd2b84ab33fd4f_originalDynamicSite2866_55(13042, (465841190022271381L ^ local1)))));

    ((moom.jD)(((moom.i6)(receiver)).n)).a(((float)(0x1.0p2f)), ((float)(((float) (__sourceIntrinsic_ebbd2b84ab33fd4f_originalDynamicSite2866_58(11829, (2248629748017712469L ^ local1)) + local3)))), ((float)(0x0.0p0f)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_ebbd2b84ab33fd4f_0(moom.i6 a0) throws E;

static {
q = ((long)(((moom._a)(moom._c.a(((long)(5406431425308429621L)), ((long)(3290287685184561880L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(55474037244844L)))));
    t = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.i6.q ^ 1486520715101L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1281_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1281_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1281_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1281_14 = new byte[8];
    (__sourceSpill1281_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1281_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1281_16 = __sourceSpill1281_14;
    ((javax.crypto.Cipher)(__sourceSpill1281_11)).init(((int)(__sourceSpill1281_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1281_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1281_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[15];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "Òf1£2[\034x¯¡\004¿Ë\000`·\006vÐ±/_å?Ì!¡t\n¬!Ç1\006ãÓ3ÿ Áê×±2yIÐÂ£ý4¸Ü´,_il\024/\\U}ïë¸ée­5°'}s\017l\002@áGHüä\fÜG¥[y"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1281_25 = local6_life21;
        int __sourceSpill1281_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1281_25)).substring(((int)(__sourceSpill1281_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1281_30 = local8_life19;
        int __sourceSpill1281_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1281_33 = new byte[8];
        (__sourceSpill1281_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1281_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1281_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1281_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1281_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1281_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1281_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1281_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1281_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1281_34)).doFinal(((byte[])(__sourceSpill1281_33)));
        (__sourceSpill1281_30)[__sourceSpill1281_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "\016u\036\020î\fU1x7XÏM~"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1281_38 = local6_life21;
        int __sourceSpill1281_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1281_38)).substring(((int)(__sourceSpill1281_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1281_43 = local8_life19;
        int __sourceSpill1281_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1281_46 = new byte[8];
        (__sourceSpill1281_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1281_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1281_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1281_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1281_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1281_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1281_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1281_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1281_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1281_47)).doFinal(((byte[])(__sourceSpill1281_46)));
        (__sourceSpill1281_43)[__sourceSpill1281_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    r = ((long[])(local8_life19));
    s = ((java.lang.Integer[])(new java.lang.Integer[15]));
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7992_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/i6"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 12992;
      if (s[var3] == null) {
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
         long var5 = r[var3];
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
         Object[] var9 = (Object[])t.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               t.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/i6", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         s[var3] = var15;
      }

      return s[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.i6.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public void a(float p0, float p1, float p2, float p3, float p4, float p5, net.minecraft.entity.Entity p6) {
((moom.jD)(this.i)).h = ((float)((p4 / 0x1.ca5dcp5f)));
    ((moom.jD)(this.i)).i = ((float)((p3 / 0x1.ca5dcp5f)));
    ((moom.jD)(this.o)).h = ((float)(((moom.jD)(this.i)).h));
    ((moom.jD)(this.o)).i = ((float)(((moom.jD)(this.i)).i));
    ((moom.jD)(this.p)).h = ((float)(((moom.jD)(this.i)).h));
    ((moom.jD)(this.p)).i = ((float)(((moom.jD)(this.i)).i));
    ((moom.jD)(this.j)).h = ((float)(0x1.921fb6p0f));
    ((moom.jD)(this.k)).h = ((float)(((moom.Dr.b(((float)((p0 * 0x1.55182ap-1f)))) * 0x1.666666p0f) * p1)));
    ((moom.jD)(this.l)).h = ((float)(((moom.Dr.b(((float)(((p0 * 0x1.55182ap-1f) + 0x1.921fb6p1f)))) * 0x1.666666p0f) * p1)));
    ((moom.jD)(this.m)).j = ((float)(p2));
    ((moom.jD)(this.n)).j = ((float)((-p2)));
    return;
}


public void a(net.minecraft.entity.Entity p0, float p1, float p2, float p3, float p4, float p5, float p6) {
moom.i6 forwardValue3621_113_0;
    net.minecraft.entity.Entity[] spill3621_0;
    moom.i6 spill3621_1;
    long life8_3;
    net.minecraft.entity.Entity[] life10_14;
    float life11_24;
    forward_join_116: {
    forward_join_113: {
    forward_join_84: {
    life8_3 = (moom.i6.q ^ 48041894630312L);
    spill3621_0 = moom.iQ.b();
    ((moom.i6)(this)).a(((float)(p1)), ((float)(p2)), ((float)(p3)), ((float)(p4)), ((float)(p5)), ((float)(p6)), ((net.minecraft.entity.Entity)(p0)));
    life10_14 = spill3621_0;
    spill3621_1 = this;
    if (!((life10_14 != null))) {
        forwardValue3621_113_0 = spill3621_1;
        break forward_join_113;
    }
    if (!(((moom.i6)(spill3621_1)).c)) {
        break forward_join_84;
    }
    life11_24 = 0x1.0p1f;
    moom.kZ.B();
    moom.kZ.b(((float)(0x0.0p0f)), ((float)((0x1.4p2f * p6))), ((float)((0x1.0p1f * p6))));
    ((moom.jD)(this.i)).a(((float)(p6)));
    ((moom.jD)(this.o)).a(((float)(p6)));
    ((moom.jD)(this.p)).a(((float)(p6)));
    moom.kZ.C();
    moom.kZ.B();
    moom.kZ.a(((float)((0x1.0p0f / life11_24))), ((float)((0x1.0p0f / life11_24))), ((float)((0x1.0p0f / life11_24))));
    moom.kZ.b(((float)(0x0.0p0f)), ((float)((0x1.8p4f * p6))), ((float)(0x0.0p0f)));
    ((moom.jD)(this.j)).a(((float)(p6)));
    ((moom.jD)(this.k)).a(((float)(p6)));
    ((moom.jD)(this.l)).a(((float)(p6)));
    ((moom.jD)(this.m)).a(((float)(p6)));
    ((moom.jD)(this.n)).a(((float)(p6)));
    moom.kZ.C();
    if (!((life10_14 == null))) {
        break forward_join_116;
    }
    }
    ((moom.jD)(this.i)).a(((float)(p6)));
    ((moom.jD)(this.o)).a(((float)(p6)));
    ((moom.jD)(this.p)).a(((float)(p6)));
    ((moom.jD)(this.j)).a(((float)(p6)));
    ((moom.jD)(this.k)).a(((float)(p6)));
    ((moom.jD)(this.l)).a(((float)(p6)));
    ((moom.jD)(this.m)).a(((float)(p6)));
    forwardValue3621_113_0 = this;
    }
    ((moom.jD)(((moom.i6)(forwardValue3621_113_0)).n)).a(((float)(p6)));
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static native <E extends Throwable> int __sourceIntrinsic_ebbd2b84ab33fd4f_originalDynamicSite2866_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ebbd2b84ab33fd4f_originalDynamicSite2866_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ebbd2b84ab33fd4f_originalDynamicSite2866_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ebbd2b84ab33fd4f_originalDynamicSite2866_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ebbd2b84ab33fd4f_originalDynamicSite2866_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ebbd2b84ab33fd4f_originalDynamicSite2866_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ebbd2b84ab33fd4f_originalDynamicSite2866_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ebbd2b84ab33fd4f_originalDynamicSite2866_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ebbd2b84ab33fd4f_originalDynamicSite2866_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ebbd2b84ab33fd4f_originalDynamicSite2866_36(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ebbd2b84ab33fd4f_originalDynamicSite2866_42(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ebbd2b84ab33fd4f_originalDynamicSite2866_43(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ebbd2b84ab33fd4f_originalDynamicSite2866_46(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ebbd2b84ab33fd4f_originalDynamicSite2866_49(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ebbd2b84ab33fd4f_originalDynamicSite2866_51(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ebbd2b84ab33fd4f_originalDynamicSite2866_52(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ebbd2b84ab33fd4f_originalDynamicSite2866_55(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ebbd2b84ab33fd4f_originalDynamicSite2866_58(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7992_0() throws E;
}
