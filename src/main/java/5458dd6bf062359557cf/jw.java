package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class jw extends moom.iQ {

public moom.jD i;

public moom.jD j;

public moom.jD k;

public moom.jD l;

public moom.jD m;

public moom.jD n;

private static long r;

private static long[] t;

private static java.lang.Integer[] u;

private static java.util.Map v;

public jw(float p0) { this(0.0F, 0.0F, 0, 0); }


private static void __sourceConstructorBody_b5efc33485e7f086(moom.jw receiver, float p0) throws Throwable {

long local2_life1 = (moom.jw.r ^ 66512032088385L);

    moom.jw.__sourceConstructorInit_b5efc33485e7f086_0(((moom.jw)(receiver)), ((float)(p0)), ((float)(0x0.0p0f)), ((int)(__sourceIntrinsic_b5efc33485e7f086_originalDynamicSite861_2(8840, (673799361513324067L ^ local2_life1)))), ((int)(__sourceIntrinsic_b5efc33485e7f086_originalDynamicSite861_3(30490, (7636965739913948076L ^ local2_life1)))));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_b5efc33485e7f086_0(moom.jw a0, float a1, float a2, int a3, int a4) throws E;
private static native <E extends Throwable> void __sourceConstructorInit_4a577d60564c3272_0(moom.jw a0) throws E;

public jw(float p0, float p1, int p2, int p3) { super(); }


private static void __sourceConstructorBody_4a577d60564c3272(moom.jw receiver, float p0, float p1, int p2, int p3) throws Throwable {

long local5 = (moom.jw.r ^ 138137195893676L);

    moom.jw.__sourceConstructorInit_4a577d60564c3272_0(((moom.jw)(receiver)));

    ((moom.jw)(receiver)).i = ((moom.jD)(((moom.jD)(new moom.jD(receiver))).b(((int)(p2)), ((int)(p3)))));

    ((moom.jD)(((moom.jw)(receiver)).i)).a(((float)(0x0.0p0f)), ((float)((0x0.0p0f + p1))), ((float)(0x0.0p0f)));

    ((moom.jD)(((moom.jD)(((moom.jw)(receiver)).i)).a(((int)(0)), ((int)(0))))).a(((float)(-0x1.0p2f)), ((float)(-0x1.4p3f)), ((float)(-0x1.0p2f)), ((int)(__sourceIntrinsic_4a577d60564c3272_originalDynamicSite3012_8(26408, (7847075887616043362L ^ local5)))), ((int)(__sourceIntrinsic_4a577d60564c3272_originalDynamicSite3012_9(19777, (6450455736337203971L ^ local5)))), ((int)(__sourceIntrinsic_4a577d60564c3272_originalDynamicSite3012_10(67, (6641215173889740296L ^ local5)))), ((float)(p0)));

    ((moom.jw)(receiver)).n = ((moom.jD)(((moom.jD)(new moom.jD(receiver))).b(((int)(p2)), ((int)(p3)))));

    ((moom.jD)(((moom.jw)(receiver)).n)).a(((float)(0x0.0p0f)), ((float)((p1 - 0x1.0p1f))), ((float)(0x0.0p0f)));

    ((moom.jD)(((moom.jD)(((moom.jw)(receiver)).n)).a(((int)(__sourceIntrinsic_4a577d60564c3272_originalDynamicSite3012_17(17849, (6647651386910936052L ^ local5)))), ((int)(0))))).a(((float)(-0x1.0p0f)), ((float)(-0x1.0p0f)), ((float)(-0x1.8p2f)), ((int)(2)), ((int)(4)), ((int)(2)), ((float)(p0)));

    ((moom.jD)(((moom.jw)(receiver)).i)).a(((moom.jD)(((moom.jw)(receiver)).n)));

    ((moom.jw)(receiver)).j = ((moom.jD)(((moom.jD)(new moom.jD(receiver))).b(((int)(p2)), ((int)(p3)))));

    ((moom.jD)(((moom.jw)(receiver)).j)).a(((float)(0x0.0p0f)), ((float)((0x0.0p0f + p1))), ((float)(0x0.0p0f)));

    ((moom.jD)(((moom.jD)(((moom.jw)(receiver)).j)).a(((int)(__sourceIntrinsic_4a577d60564c3272_originalDynamicSite3012_28(27296, (2530611720502322415L ^ local5)))), ((int)(__sourceIntrinsic_4a577d60564c3272_originalDynamicSite3012_29(8136, (215432588273471873L ^ local5))))))).a(((float)(-0x1.0p2f)), ((float)(0x0.0p0f)), ((float)(-0x1.8p1f)), ((int)(__sourceIntrinsic_4a577d60564c3272_originalDynamicSite3012_31(67, (6641215173889740296L ^ local5)))), ((int)(__sourceIntrinsic_4a577d60564c3272_originalDynamicSite3012_32(11831, (4707245423202492537L ^ local5)))), ((int)(__sourceIntrinsic_4a577d60564c3272_originalDynamicSite3012_33(22847, (4124315611869058940L ^ local5)))), ((float)(p0)));

    ((moom.jD)(((moom.jD)(((moom.jw)(receiver)).j)).a(((int)(0)), ((int)(__sourceIntrinsic_4a577d60564c3272_originalDynamicSite3012_36(28827, (8929460692538310367L ^ local5))))))).a(((float)(-0x1.0p2f)), ((float)(0x0.0p0f)), ((float)(-0x1.8p1f)), ((int)(__sourceIntrinsic_4a577d60564c3272_originalDynamicSite3012_38(67, (6641215173889740296L ^ local5)))), ((int)(__sourceIntrinsic_4a577d60564c3272_originalDynamicSite3012_39(13409, (6149927904286964280L ^ local5)))), ((int)(__sourceIntrinsic_4a577d60564c3272_originalDynamicSite3012_40(17210, (3466366877964438907L ^ local5)))), ((float)((p0 + 0x1.0p-1f))));

    ((moom.jw)(receiver)).k = ((moom.jD)(((moom.jD)(new moom.jD(receiver))).b(((int)(p2)), ((int)(p3)))));

    ((moom.jD)(((moom.jw)(receiver)).k)).a(((float)(0x0.0p0f)), ((float)(((0x0.0p0f + p1) + 0x1.0p1f))), ((float)(0x0.0p0f)));

    ((moom.jD)(((moom.jD)(((moom.jw)(receiver)).k)).a(((int)(__sourceIntrinsic_4a577d60564c3272_originalDynamicSite3012_47(1837, (7310337158135105901L ^ local5)))), ((int)(__sourceIntrinsic_4a577d60564c3272_originalDynamicSite3012_48(31097, (3073710512176478012L ^ local5))))))).a(((float)(-0x1.0p3f)), ((float)(-0x1.0p1f)), ((float)(-0x1.0p1f)), ((int)(4)), ((int)(__sourceIntrinsic_4a577d60564c3272_originalDynamicSite3012_50(67, (6641215173889740296L ^ local5)))), ((int)(4)), ((float)(p0)));

    ((moom.jD)(((moom.jD)(((moom.jw)(receiver)).k)).a(((int)(__sourceIntrinsic_4a577d60564c3272_originalDynamicSite3012_53(186, (92527293445721853L ^ local5)))), ((int)(__sourceIntrinsic_4a577d60564c3272_originalDynamicSite3012_54(24082, (3162379397444898910L ^ local5))))))).a(((float)(0x1.0p2f)), ((float)(-0x1.0p1f)), ((float)(-0x1.0p1f)), ((int)(4)), ((int)(__sourceIntrinsic_4a577d60564c3272_originalDynamicSite3012_56(67, (6641215173889740296L ^ local5)))), ((int)(4)), ((float)(p0)));

    ((moom.jD)(((moom.jD)(((moom.jw)(receiver)).k)).a(((int)(__sourceIntrinsic_4a577d60564c3272_originalDynamicSite3012_59(11590, (1698676481296392990L ^ local5)))), ((int)(__sourceIntrinsic_4a577d60564c3272_originalDynamicSite3012_60(21611, (8998932180071422499L ^ local5))))))).a(((float)(-0x1.0p2f)), ((float)(0x1.0p1f)), ((float)(-0x1.0p1f)), ((int)(__sourceIntrinsic_4a577d60564c3272_originalDynamicSite3012_62(67, (6641215173889740296L ^ local5)))), ((int)(4)), ((int)(4)), ((float)(p0)));

    ((moom.jw)(receiver)).l = ((moom.jD)(((moom.jD)(new moom.jD(receiver, 0, __sourceIntrinsic_4a577d60564c3272_originalDynamicSite3012_64(24082, (3162379397444898910L ^ local5))))).b(((int)(p2)), ((int)(p3)))));

    ((moom.jD)(((moom.jw)(receiver)).l)).a(((float)(-0x1.0p1f)), ((float)((0x1.8p3f + p1))), ((float)(0x0.0p0f)));

    ((moom.jD)(((moom.jw)(receiver)).l)).a(((float)(-0x1.0p1f)), ((float)(0x0.0p0f)), ((float)(-0x1.0p1f)), ((int)(4)), ((int)(__sourceIntrinsic_4a577d60564c3272_originalDynamicSite3012_70(2102, (8427056441700140652L ^ local5)))), ((int)(4)), ((float)(p0)));

    ((moom.jw)(receiver)).m = ((moom.jD)(((moom.jD)(new moom.jD(receiver, 0, __sourceIntrinsic_4a577d60564c3272_originalDynamicSite3012_72(24082, (3162379397444898910L ^ local5))))).b(((int)(p2)), ((int)(p3)))));

    ((moom.jD)(((moom.jw)(receiver)).m)).m = ((boolean)(true));

    ((moom.jD)(((moom.jw)(receiver)).m)).a(((float)(0x1.0p1f)), ((float)((0x1.8p3f + p1))), ((float)(0x0.0p0f)));

    ((moom.jD)(((moom.jw)(receiver)).m)).a(((float)(-0x1.0p1f)), ((float)(0x0.0p0f)), ((float)(-0x1.0p1f)), ((int)(4)), ((int)(__sourceIntrinsic_4a577d60564c3272_originalDynamicSite3012_80(2102, (8427056441700140652L ^ local5)))), ((int)(4)), ((float)(p0)));

    return;

}



static {
r = ((long)(((moom._a)(moom._c.a(((long)(-505142548548233724L)), ((long)(-5546618096447933828L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(100003247735379L)))));
    v = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.jw.r ^ 41168950913536L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1350_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1350_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1350_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1350_14 = new byte[8];
    (__sourceSpill1350_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1350_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1350_16 = __sourceSpill1350_14;
    ((javax.crypto.Cipher)(__sourceSpill1350_11)).init(((int)(__sourceSpill1350_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1350_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1350_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[20];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "Å÷ óO³\035<ú25m\016I]µ;LehµF\r¬H/ â_R¡ ªdæeG\b\036Ñ\016×Erjoö\031î\021\024\\d6L<±TY{\031]k©s<\033æV\021û\013S\022#?Á\000i{8\\òÖ\n\020X«¨Á}¨[<íRFHA*°\034z\027Ð\022µöæz~\024XíEk\032\026ÈS²u&¹DfÞÍÓ¯"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1350_25 = local6_life21;
        int __sourceSpill1350_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1350_25)).substring(((int)(__sourceSpill1350_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1350_30 = local8_life19;
        int __sourceSpill1350_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1350_33 = new byte[8];
        (__sourceSpill1350_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1350_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1350_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1350_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1350_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1350_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1350_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1350_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1350_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1350_34)).doFinal(((byte[])(__sourceSpill1350_33)));
        (__sourceSpill1350_30)[__sourceSpill1350_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "Æ\024F\025«D\\\t[¤>_/·"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1350_38 = local6_life21;
        int __sourceSpill1350_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1350_38)).substring(((int)(__sourceSpill1350_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1350_43 = local8_life19;
        int __sourceSpill1350_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1350_46 = new byte[8];
        (__sourceSpill1350_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1350_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1350_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1350_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1350_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1350_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1350_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1350_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1350_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1350_47)).doFinal(((byte[])(__sourceSpill1350_46)));
        (__sourceSpill1350_43)[__sourceSpill1350_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    t = ((long[])(local8_life19));
    u = ((java.lang.Integer[])(new java.lang.Integer[20]));
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.jw.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8194_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/jw"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 13977;
      if (u[var3] == null) {
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
         long var5 = t[var3];
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
         Object[] var9 = (Object[])v.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               v.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/jw", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         u[var3] = var15;
      }

      return u[var3];
}


public void a(net.minecraft.entity.Entity p0, float p1, float p2, float p3, float p4, float p5, float p6) {
((moom.jw)(this)).a(((float)(p1)), ((float)(p2)), ((float)(p3)), ((float)(p4)), ((float)(p5)), ((float)(p6)), ((net.minecraft.entity.Entity)(p0)));
    ((moom.jD)(this.i)).a(((float)(p6)));
    ((moom.jD)(this.j)).a(((float)(p6)));
    ((moom.jD)(this.l)).a(((float)(p6)));
    ((moom.jD)(this.m)).a(((float)(p6)));
    ((moom.jD)(this.k)).a(((float)(p6)));
    return;
}


public void a(float p0, float p1, float p2, float p3, float p4, float p5, net.minecraft.entity.Entity p6) {
((moom.jD)(this.i)).i = ((float)((p3 / 0x1.ca5dcp5f)));
    ((moom.jD)(this.i)).h = ((float)((p4 / 0x1.ca5dcp5f)));
    ((moom.jD)(this.k)).f = ((float)(0x1.8p1f));
    ((moom.jD)(this.k)).g = ((float)(-0x1.0p0f));
    ((moom.jD)(this.k)).h = ((float)(-0x1.8p-1f));
    ((moom.jD)(this.l)).h = ((float)((((moom.Dr.b(((float)((p0 * 0x1.55182ap-1f)))) * 0x1.666666p0f) * p1) * 0x1.0p-1f)));
    ((moom.jD)(this.m)).h = ((float)((((moom.Dr.b(((float)(((p0 * 0x1.55182ap-1f) + 0x1.921fb6p1f)))) * 0x1.666666p0f) * p1) * 0x1.0p-1f)));
    ((moom.jD)(this.l)).i = ((float)(0x0.0p0f));
    ((moom.jD)(this.m)).i = ((float)(0x0.0p0f));
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_b5efc33485e7f086_originalDynamicSite861_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b5efc33485e7f086_originalDynamicSite861_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4a577d60564c3272_originalDynamicSite3012_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4a577d60564c3272_originalDynamicSite3012_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4a577d60564c3272_originalDynamicSite3012_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4a577d60564c3272_originalDynamicSite3012_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4a577d60564c3272_originalDynamicSite3012_28(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4a577d60564c3272_originalDynamicSite3012_29(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4a577d60564c3272_originalDynamicSite3012_31(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4a577d60564c3272_originalDynamicSite3012_32(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4a577d60564c3272_originalDynamicSite3012_33(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4a577d60564c3272_originalDynamicSite3012_36(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4a577d60564c3272_originalDynamicSite3012_38(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4a577d60564c3272_originalDynamicSite3012_39(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4a577d60564c3272_originalDynamicSite3012_40(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4a577d60564c3272_originalDynamicSite3012_47(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4a577d60564c3272_originalDynamicSite3012_48(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4a577d60564c3272_originalDynamicSite3012_50(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4a577d60564c3272_originalDynamicSite3012_53(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4a577d60564c3272_originalDynamicSite3012_54(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4a577d60564c3272_originalDynamicSite3012_56(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4a577d60564c3272_originalDynamicSite3012_59(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4a577d60564c3272_originalDynamicSite3012_60(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4a577d60564c3272_originalDynamicSite3012_62(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4a577d60564c3272_originalDynamicSite3012_64(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4a577d60564c3272_originalDynamicSite3012_70(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4a577d60564c3272_originalDynamicSite3012_72(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4a577d60564c3272_originalDynamicSite3012_80(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8194_0() throws E;
}
