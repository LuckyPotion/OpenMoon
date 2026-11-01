package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class jy extends moom.iQ {

public moom.jD[] i;

public moom.jD[] j;

private static long k;

private static long[] l;

private static java.lang.Integer[] m;

private static java.util.Map n;

public jy(float p0) { super(); }


private static void __sourceConstructorBody_bfcb4223a868ca05(moom.jy receiver, float p0) throws Throwable {

long local2 = (moom.jy.k ^ 64205227460532L);

    moom.jy.__sourceConstructorInit_bfcb4223a868ca05_0(((moom.jy)(receiver)));

    ((moom.jy)(receiver)).f = ((int)(__sourceIntrinsic_bfcb4223a868ca05_originalDynamicSite3016_2(11965, (2247897215231998416L ^ local2))));

    ((moom.jy)(receiver)).g = ((int)(__sourceIntrinsic_bfcb4223a868ca05_originalDynamicSite3016_4(22012, (5076262929920606876L ^ local2))));

    ((moom.jy)(receiver)).i = ((moom.jD[])(new moom.jD[3]));

    (((moom.jy)(receiver)).i)[0] = new moom.jD(receiver, 0, __sourceIntrinsic_bfcb4223a868ca05_originalDynamicSite3016_8(1113, (1133727817171440443L ^ local2)));

    ((moom.jD)((((moom.jy)(receiver)).i)[0])).a(((float)(-0x1.4p3f)), ((float)(0x1.f33334p1f)), ((float)(-0x1.0p-1f)), ((int)(__sourceIntrinsic_bfcb4223a868ca05_originalDynamicSite3016_10(26726, (4580145369456508675L ^ local2)))), ((int)(3)), ((int)(3)), ((float)(p0)));

    (((moom.jy)(receiver)).i)[1] = ((moom.jD)(new moom.jD(receiver))).b(((int)(((moom.jy)(receiver)).f)), ((int)(((moom.jy)(receiver)).g)));

    ((moom.jD)((((moom.jy)(receiver)).i)[1])).a(((float)(-0x1.0p1f)), ((float)(0x1.b9999ap2f)), ((float)(-0x1.0p-1f)));

    ((moom.jD)(((moom.jD)((((moom.jy)(receiver)).i)[1])).a(((int)(0)), ((int)(__sourceIntrinsic_bfcb4223a868ca05_originalDynamicSite3016_19(19272, (7151042933299272743L ^ local2))))))).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((int)(3)), ((int)(__sourceIntrinsic_bfcb4223a868ca05_originalDynamicSite3016_21(9263, (6010994754478191425L ^ local2)))), ((int)(3)), ((float)(p0)));

    ((moom.jD)(((moom.jD)((((moom.jy)(receiver)).i)[1])).a(((int)(__sourceIntrinsic_bfcb4223a868ca05_originalDynamicSite3016_24(7256, (4814394374395890489L ^ local2)))), ((int)(__sourceIntrinsic_bfcb4223a868ca05_originalDynamicSite3016_25(31309, (7770147346832649509L ^ local2))))))).a(((float)(-0x1.0p2f)), ((float)(0x1.8p0f)), ((float)(0x1.0p-1f)), ((int)(__sourceIntrinsic_bfcb4223a868ca05_originalDynamicSite3016_27(19655, (8869077186480430002L ^ local2)))), ((int)(2)), ((int)(2)), ((float)(p0)));

    ((moom.jD)(((moom.jD)((((moom.jy)(receiver)).i)[1])).a(((int)(__sourceIntrinsic_bfcb4223a868ca05_originalDynamicSite3016_30(18634, (465113863935418275L ^ local2)))), ((int)(__sourceIntrinsic_bfcb4223a868ca05_originalDynamicSite3016_31(31309, (7770147346832649509L ^ local2))))))).a(((float)(-0x1.0p2f)), ((float)(0x1.0p2f)), ((float)(0x1.0p-1f)), ((int)(__sourceIntrinsic_bfcb4223a868ca05_originalDynamicSite3016_33(17193, (2273282169248306245L ^ local2)))), ((int)(2)), ((int)(2)), ((float)(p0)));

    ((moom.jD)(((moom.jD)((((moom.jy)(receiver)).i)[1])).a(((int)(__sourceIntrinsic_bfcb4223a868ca05_originalDynamicSite3016_36(18634, (465113863935418275L ^ local2)))), ((int)(__sourceIntrinsic_bfcb4223a868ca05_originalDynamicSite3016_37(31309, (7770147346832649509L ^ local2))))))).a(((float)(-0x1.0p2f)), ((float)(0x1.ap2f)), ((float)(0x1.0p-1f)), ((int)(__sourceIntrinsic_bfcb4223a868ca05_originalDynamicSite3016_39(17193, (2273282169248306245L ^ local2)))), ((int)(2)), ((int)(2)), ((float)(p0)));

    (((moom.jy)(receiver)).i)[2] = new moom.jD(receiver, __sourceIntrinsic_bfcb4223a868ca05_originalDynamicSite3016_42(15792, (6085788268777908950L ^ local2)), __sourceIntrinsic_bfcb4223a868ca05_originalDynamicSite3016_43(31309, (7770147346832649509L ^ local2)));

    ((moom.jD)((((moom.jy)(receiver)).i)[2])).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((int)(3)), ((int)(__sourceIntrinsic_bfcb4223a868ca05_originalDynamicSite3016_45(8305, (5133972683798558482L ^ local2)))), ((int)(3)), ((float)(p0)));

    ((moom.jy)(receiver)).j = ((moom.jD[])(new moom.jD[3]));

    (((moom.jy)(receiver)).j)[0] = new moom.jD(receiver, 0, 0);

    ((moom.jD)((((moom.jy)(receiver)).j)[0])).a(((float)(-0x1.0p2f)), ((float)(-0x1.0p2f)), ((float)(-0x1.0p2f)), ((int)(__sourceIntrinsic_bfcb4223a868ca05_originalDynamicSite3016_50(26244, (825299458342875619L ^ local2)))), ((int)(__sourceIntrinsic_bfcb4223a868ca05_originalDynamicSite3016_51(31556, (6861162495275265056L ^ local2)))), ((int)(__sourceIntrinsic_bfcb4223a868ca05_originalDynamicSite3016_52(31556, (6861162495275265056L ^ local2)))), ((float)(p0)));

    (((moom.jy)(receiver)).j)[1] = new moom.jD(receiver, __sourceIntrinsic_bfcb4223a868ca05_originalDynamicSite3016_55(30618, (1311290770826289392L ^ local2)), 0);

    ((moom.jD)((((moom.jy)(receiver)).j)[1])).a(((float)(-0x1.0p2f)), ((float)(-0x1.0p2f)), ((float)(-0x1.0p2f)), ((int)(__sourceIntrinsic_bfcb4223a868ca05_originalDynamicSite3016_57(30960, (1980483967858569092L ^ local2)))), ((int)(__sourceIntrinsic_bfcb4223a868ca05_originalDynamicSite3016_58(30960, (1980483967858569092L ^ local2)))), ((int)(__sourceIntrinsic_bfcb4223a868ca05_originalDynamicSite3016_59(30960, (1980483967858569092L ^ local2)))), ((float)(p0)));

    ((moom.jD)((((moom.jy)(receiver)).j)[1])).e = ((float)(-0x1.0p3f));

    ((moom.jD)((((moom.jy)(receiver)).j)[1])).f = ((float)(0x1.0p2f));

    (((moom.jy)(receiver)).j)[2] = new moom.jD(receiver, __sourceIntrinsic_bfcb4223a868ca05_originalDynamicSite3016_66(4297, (2640459145110652834L ^ local2)), 0);

    ((moom.jD)((((moom.jy)(receiver)).j)[2])).a(((float)(-0x1.0p2f)), ((float)(-0x1.0p2f)), ((float)(-0x1.0p2f)), ((int)(__sourceIntrinsic_bfcb4223a868ca05_originalDynamicSite3016_68(30960, (1980483967858569092L ^ local2)))), ((int)(__sourceIntrinsic_bfcb4223a868ca05_originalDynamicSite3016_69(30960, (1980483967858569092L ^ local2)))), ((int)(__sourceIntrinsic_bfcb4223a868ca05_originalDynamicSite3016_70(30960, (1980483967858569092L ^ local2)))), ((float)(p0)));

    ((moom.jD)((((moom.jy)(receiver)).j)[2])).e = ((float)(0x1.4p3f));

    ((moom.jD)((((moom.jy)(receiver)).j)[2])).f = ((float)(0x1.0p2f));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_bfcb4223a868ca05_0(moom.jy a0) throws E;

static {
k = ((long)(((moom._a)(moom._c.a(((long)(-1532311718796076417L)), ((long)(7118528206080064905L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(148349830649880L)))));
    n = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.jy.k ^ 30248252195851L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1352_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1352_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1352_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1352_14 = new byte[8];
    (__sourceSpill1352_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1352_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1352_16 = __sourceSpill1352_14;
    ((javax.crypto.Cipher)(__sourceSpill1352_11)).init(((int)(__sourceSpill1352_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1352_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1352_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[18];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "(= %ü\027ß·Ø\036!&Á\r£Â\0217#ñGKö\016ÚW7Ð_\t\016\004ÄW}!ÌQ{vI\t\b)ïÞªAåÂ:n}ÞÊSZ±/\004\023Ùú¡¿ÝâÿÂX\002ò$É\005óé'øîØ©\034\005ZË§Qæbþ¼{QµOù Wî;Åáö\f\024\020Í\004â\001(\030º¥)U"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1352_25 = local6_life21;
        int __sourceSpill1352_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1352_25)).substring(((int)(__sourceSpill1352_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1352_30 = local8_life19;
        int __sourceSpill1352_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1352_33 = new byte[8];
        (__sourceSpill1352_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1352_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1352_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1352_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1352_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1352_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1352_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1352_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1352_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1352_34)).doFinal(((byte[])(__sourceSpill1352_33)));
        (__sourceSpill1352_30)[__sourceSpill1352_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "\t=Ù\"$G¿yî:Ù&½ïè"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1352_38 = local6_life21;
        int __sourceSpill1352_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1352_38)).substring(((int)(__sourceSpill1352_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1352_43 = local8_life19;
        int __sourceSpill1352_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1352_46 = new byte[8];
        (__sourceSpill1352_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1352_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1352_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1352_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1352_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1352_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1352_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1352_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1352_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1352_47)).doFinal(((byte[])(__sourceSpill1352_46)));
        (__sourceSpill1352_43)[__sourceSpill1352_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    l = ((long[])(local8_life19));
    m = ((java.lang.Integer[])(new java.lang.Integer[18]));
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 18703;
      if (m[var3] == null) {
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
         long var5 = l[var3];
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
         Object[] var9 = (Object[])n.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               n.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/jy", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         m[var3] = var15;
      }

      return m[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.jy.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8197_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/jy"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(float p0, float p1, float p2, float p3, float p4, float p5, net.minecraft.entity.Entity p6) {
float local8 = moom.Dr.b(((float)((p2 * 0x1.99999ap-4f))));
    ((moom.jD)((this.i)[1])).h = ((float)(((0x1.0a3d7p-4f + (0x1.99999ap-5f * local8)) * 0x1.921fb6p1f)));
    ((moom.jD)((this.i)[2])).a(((float)(-0x1.0p1f)), ((float)((0x1.b9999ap2f + (moom.Dr.b(((float)(((moom.jD)((this.i)[1])).h))) * 0x1.4p3f)))), ((float)((-0x1.0p-1f + (moom.Dr.a(((float)(((moom.jD)((this.i)[1])).h))) * 0x1.4p3f)))));
    ((moom.jD)((this.i)[2])).h = ((float)(((0x1.0f5c28p-2f + (0x1.99999ap-4f * local8)) * 0x1.921fb6p1f)));
    ((moom.jD)((this.j)[0])).i = ((float)((p3 / 0x1.ca5dcp5f)));
    ((moom.jD)((this.j)[0])).h = ((float)((p4 / 0x1.ca5dcp5f)));
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(net.minecraft.entity.Entity p0, float p1, float p2, float p3, float p4, float p5, float p6) {
net.minecraft.entity.Entity[] spill1227_0;
    long life8_3;
    net.minecraft.entity.Entity[] life10_14;
    moom.jD[] life11_17;
    int life12_20;
    int life13_22;
    moom.jD life14_29;
    int life13_48;
    moom.jD life14_55;
    lexical_join_59: {
    lexical_join_44: {
    lexical_join_38: {
    life8_3 = (moom.jy.k ^ 38210895323237L);
    spill1227_0 = moom.iQ.b();
    ((moom.jy)(this)).a(((float)(p1)), ((float)(p2)), ((float)(p3)), ((float)(p4)), ((float)(p5)), ((float)(p6)), ((net.minecraft.entity.Entity)(p0)));
    life10_14 = spill1227_0;
    life11_17 = this.j;
    life12_20 = (life11_17).length;
    life13_22 = 0;
    lexical_cycle_23: while (true) {
    if (!((life13_22 < life12_20))) {
        break lexical_join_38;
    }
    life14_29 = (life11_17)[life13_22];
    ((moom.jD)(life14_29)).a(((float)(p6)));
    life13_22 += 1;
    if (!((life10_14 != null))) {
        break lexical_join_44;
    }
    if (!((life10_14 == null))) { continue lexical_cycle_23; }
    break lexical_cycle_23;
    }
    }
    life11_17 = this.i;
    life12_20 = (life11_17).length;
    }
    life13_48 = 0;
    lexical_cycle_46: while (true) {
    if (!((life13_48 < life12_20))) {
        break lexical_join_59;
    }
    life14_55 = (life11_17)[life13_48];
    ((moom.jD)(life14_55)).a(((float)(p6)));
    life13_48 += 1;
    if (!((life10_14 == null))) { continue lexical_cycle_46; }
    break lexical_cycle_46;
    }
    }
    return;
}


public void a(net.minecraft.entity.EntityLivingBase p0, float p1, float p2, float p3) {
net.minecraft.entity.Entity[] spill1228_0;
    long life5_3;
    net.minecraft.entity.boss.EntityWither life8_7;
    net.minecraft.entity.Entity[] life7_8;
    int life9_10;
    lexical_join_44: {
    life5_3 = (moom.jy.k ^ 66832199466367L);
    spill1228_0 = moom.iQ.b();
    life8_7 = ((net.minecraft.entity.boss.EntityWither)(p0));
    life7_8 = spill1228_0;
    life9_10 = 1;
    lexical_cycle_11: while (true) {
    if (!((life9_10 < 3))) {
        break lexical_join_44;
    }
    ((moom.jD)((this.j)[life9_10])).i = ((float)(((((net.minecraft.entity.boss.EntityWither)(life8_7)).a__Float(((int)((life9_10 - 1)))) - ((net.minecraft.entity.EntityLivingBase)(p0)).a2) / 0x1.ca5dcp5f)));
    ((moom.jD)((this.j)[life9_10])).h = ((float)((((net.minecraft.entity.boss.EntityWither)(life8_7)).b__Float(((int)((life9_10 - 1)))) / 0x1.ca5dcp5f)));
    life9_10 += 1;
    if (!((life7_8 == null))) { continue lexical_cycle_11; }
    break lexical_cycle_11;
    }
    }
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_bfcb4223a868ca05_originalDynamicSite3016_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bfcb4223a868ca05_originalDynamicSite3016_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bfcb4223a868ca05_originalDynamicSite3016_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bfcb4223a868ca05_originalDynamicSite3016_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bfcb4223a868ca05_originalDynamicSite3016_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bfcb4223a868ca05_originalDynamicSite3016_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bfcb4223a868ca05_originalDynamicSite3016_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bfcb4223a868ca05_originalDynamicSite3016_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bfcb4223a868ca05_originalDynamicSite3016_27(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bfcb4223a868ca05_originalDynamicSite3016_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bfcb4223a868ca05_originalDynamicSite3016_31(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bfcb4223a868ca05_originalDynamicSite3016_33(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bfcb4223a868ca05_originalDynamicSite3016_36(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bfcb4223a868ca05_originalDynamicSite3016_37(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bfcb4223a868ca05_originalDynamicSite3016_39(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bfcb4223a868ca05_originalDynamicSite3016_42(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bfcb4223a868ca05_originalDynamicSite3016_43(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bfcb4223a868ca05_originalDynamicSite3016_45(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bfcb4223a868ca05_originalDynamicSite3016_50(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bfcb4223a868ca05_originalDynamicSite3016_51(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bfcb4223a868ca05_originalDynamicSite3016_52(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bfcb4223a868ca05_originalDynamicSite3016_55(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bfcb4223a868ca05_originalDynamicSite3016_57(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bfcb4223a868ca05_originalDynamicSite3016_58(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bfcb4223a868ca05_originalDynamicSite3016_59(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bfcb4223a868ca05_originalDynamicSite3016_66(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bfcb4223a868ca05_originalDynamicSite3016_68(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bfcb4223a868ca05_originalDynamicSite3016_69(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bfcb4223a868ca05_originalDynamicSite3016_70(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8197_0() throws E;
}
