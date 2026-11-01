package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class li implements moom.lh {

private int[] a;

private int b;

private int c;

private static final long g;

private static final long[] i;

private static final java.lang.Integer[] j;

private static final java.util.Map k;

public li() {
super();
}


static {
g = ((long)(((moom._a)(moom._c.a(((long)(7432781568354913213L)), ((long)(8729407004595462432L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(278683320043057L)))));
    k = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.li.g ^ 12878568153985L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1385_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1385_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1385_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1385_14 = new byte[8];
    (__sourceSpill1385_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1385_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1385_16 = __sourceSpill1385_14;
    ((javax.crypto.Cipher)(__sourceSpill1385_11)).init(((int)(__sourceSpill1385_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1385_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1385_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[32];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "p\177z«Lx÷Lh`áÖAáð»\021ß°6=D\n\b:t$ã\0306â¹öÚvÉÏ6%ÇÎ­s!¨Z\007ºÙRê\036ÕbÍ8]ýk\001°\007ìpt¤zÿÑü\1778?ºÞ?ç:I¨ÌÆ\031¥y­0ì²Ïª<¼¡V5¾J 8Õ;\020\000=4\020­ÀFÉ\033C\0162Ç8\017¾\016¾\\3Y78¹î¡¶a¡´Õe9úé( ®vöµ)`Ð½^%a²I0a¨-æîÝÙZ.V\tv|©0\f*yÖ<DçÔn[à@ G- &ÑÑ&c})D\023ßªRûUyèFÁx\016«\030dÁO8ÿä\nvux"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1385_25 = local6_life21;
        int __sourceSpill1385_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1385_25)).substring(((int)(__sourceSpill1385_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1385_30 = local8_life19;
        int __sourceSpill1385_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1385_33 = new byte[8];
        (__sourceSpill1385_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1385_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1385_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1385_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1385_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1385_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1385_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1385_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1385_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1385_34)).doFinal(((byte[])(__sourceSpill1385_33)));
        (__sourceSpill1385_30)[__sourceSpill1385_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "Ä4`ZÈaqØK\006!­Ê¨"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1385_38 = local6_life21;
        int __sourceSpill1385_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1385_38)).substring(((int)(__sourceSpill1385_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1385_43 = local8_life19;
        int __sourceSpill1385_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1385_46 = new byte[8];
        (__sourceSpill1385_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1385_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1385_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1385_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1385_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1385_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1385_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1385_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1385_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1385_47)).doFinal(((byte[])(__sourceSpill1385_46)));
        (__sourceSpill1385_43)[__sourceSpill1385_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    i = ((long[])(local8_life19));
    j = ((java.lang.Integer[])(new java.lang.Integer[32]));
}


private void b(int p0, int p1, int p2, int p3) {
long life5_3;
    int life7_5;
    int life8_10;
    life5_3 = (moom.li.g ^ 48785648582130L);
    life7_5 = p0;
    loop_region_6: while ((life7_5 < p2)) {
        life8_10 = p1;
        loop_region_11: while ((life8_10 < p3)) {
        int[] __stackOp1240_3_0 = this.a;
        int __stackOp1240_3_1 = (life7_5 + (life8_10 * this.b));
        (__stackOp1240_3_0)[__stackOp1240_3_1] = ((__stackOp1240_3_0)[__stackOp1240_3_1] | __sourceIntrinsic_ac28bfb5504e_invokedynamic1240_4(16098, (7059358427114837928L ^ life5_3)));
        life8_10 += 1;
    }
        life7_5 += 1;
    }
    return;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 7515;
      if (j[var3] == null) {
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
         long var5 = i[var3];
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
         Object[] var9 = (Object[])k.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               k.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/li", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         j[var3] = var15;
      }

      return j[var3];
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.li.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral8313_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/li"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public java.awt.image.BufferedImage a(java.awt.image.BufferedImage p0) {
long life2_3;
    int life4_26;
    int life5_29;
    int life6_31;
    java.awt.image.BufferedImage life7_68;
    java.awt.Graphics life8_71;
    lexical_join_798: {
    lexical_join_55: {
    lexical_join_8: {
    life2_3 = (moom.li.g ^ 104017060269174L);
    if (!((p0 == null))) {
        break lexical_join_8;
    }
    return null;
    }
    this.b = ((int)(__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_1(20055, (8785702971692586624L ^ life2_3))));
    this.c = ((int)(__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_3(5468, (1155524902633295247L ^ life2_3))));
    life4_26 = ((java.awt.image.BufferedImage)(p0)).getWidth();
    life5_29 = ((java.awt.image.BufferedImage)(p0)).getHeight();
    life6_31 = 1;
    lexical_cycle_30: while (true) {
    lexical_join_38: {
    if (!((this.b >= life4_26))) {
        break lexical_join_38;
    }
    if (!((this.c < life5_29))) {
        break lexical_join_55;
    }
    }
    moom.li __stackOp1239_9_0 = this;
    ((moom.li)(__stackOp1239_9_0)).b = ((int)((((moom.li)(__stackOp1239_9_0)).b * 2)));
    moom.li __stackOp1239_12_0 = this;
    ((moom.li)(__stackOp1239_12_0)).c = ((int)((((moom.li)(__stackOp1239_12_0)).c * 2)));
    life6_31 = (life6_31 * 2);
    continue lexical_cycle_30;
    }
    }
    life7_68 = new java.awt.image.BufferedImage(this.b, this.c, 2);
    life8_71 = ((java.awt.image.BufferedImage)(life7_68)).getGraphics();
    ((java.awt.Graphics)(life8_71)).drawImage(((java.awt.Image)(p0)), ((int)(0)), ((int)(0)), ((java.awt.image.ImageObserver)(null)));
    if (!((((java.awt.image.BufferedImage)(p0)).getHeight() == (__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_20(7747, (4976996214261434011L ^ life2_3)) * life6_31)))) {
        break lexical_join_798;
    }
    ((java.awt.Graphics)(life8_71)).drawImage(((java.awt.Image)(life7_68)), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_21(17442, (1035978152162729195L ^ life2_3)) * life6_31))), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_22(24061, (1067464841768797480L ^ life2_3)) * life6_31))), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_23(29907, (5143595393248144409L ^ life2_3)) * life6_31))), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_24(28369, (7220476771167942163L ^ life2_3)) * life6_31))), ((int)((4 * life6_31))), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_25(14194, (5101597240293814205L ^ life2_3)) * life6_31))), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_26(5554, (4842770790579555694L ^ life2_3)) * life6_31))), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_27(6453, (4066961444745921003L ^ life2_3)) * life6_31))), ((java.awt.image.ImageObserver)(null)));
    ((java.awt.Graphics)(life8_71)).drawImage(((java.awt.Image)(life7_68)), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_29(22641, (794179894864347296L ^ life2_3)) * life6_31))), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_30(6020, (404421115305119572L ^ life2_3)) * life6_31))), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_31(9986, (2452518453685157855L ^ life2_3)) * life6_31))), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_32(32092, (8308183028500014480L ^ life2_3)) * life6_31))), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_33(23205, (8037570051242525284L ^ life2_3)) * life6_31))), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_34(21338, (4033712721915022233L ^ life2_3)) * life6_31))), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_35(19364, (8278246583262712690L ^ life2_3)) * life6_31))), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_36(6453, (4066961444745921003L ^ life2_3)) * life6_31))), ((java.awt.image.ImageObserver)(null)));
    ((java.awt.Graphics)(life8_71)).drawImage(((java.awt.Image)(life7_68)), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_38(6453, (4066961444745921003L ^ life2_3)) * life6_31))), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_39(32092, (8308183028500014480L ^ life2_3)) * life6_31))), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_40(21338, (4033712721915022233L ^ life2_3)) * life6_31))), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_41(5468, (1155524902633295247L ^ life2_3)) * life6_31))), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_42(23205, (8037570051242525284L ^ life2_3)) * life6_31))), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_43(6453, (4066961444745921003L ^ life2_3)) * life6_31))), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_44(15816, (4236125389389948177L ^ life2_3)) * life6_31))), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_45(611, (8724081851818728120L ^ life2_3)) * life6_31))), ((java.awt.image.ImageObserver)(null)));
    ((java.awt.Graphics)(life8_71)).drawImage(((java.awt.Image)(life7_68)), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_47(9986, (2452518453685157855L ^ life2_3)) * life6_31))), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_48(32092, (8308183028500014480L ^ life2_3)) * life6_31))), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_49(6453, (4066961444745921003L ^ life2_3)) * life6_31))), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_50(5468, (1155524902633295247L ^ life2_3)) * life6_31))), ((int)((4 * life6_31))), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_51(6453, (4066961444745921003L ^ life2_3)) * life6_31))), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_52(23205, (8037570051242525284L ^ life2_3)) * life6_31))), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_53(611, (8724081851818728120L ^ life2_3)) * life6_31))), ((java.awt.image.ImageObserver)(null)));
    ((java.awt.Graphics)(life8_71)).drawImage(((java.awt.Image)(life7_68)), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_55(15004, (94826781437715028L ^ life2_3)) * life6_31))), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_56(32092, (8308183028500014480L ^ life2_3)) * life6_31))), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_57(9986, (2452518453685157855L ^ life2_3)) * life6_31))), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_58(5468, (1155524902633295247L ^ life2_3)) * life6_31))), ((int)(0)), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_59(6453, (4066961444745921003L ^ life2_3)) * life6_31))), ((int)((4 * life6_31))), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_60(611, (8724081851818728120L ^ life2_3)) * life6_31))), ((java.awt.image.ImageObserver)(null)));
    ((java.awt.Graphics)(life8_71)).drawImage(((java.awt.Image)(life7_68)), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_62(611, (8724081851818728120L ^ life2_3)) * life6_31))), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_63(32092, (8308183028500014480L ^ life2_3)) * life6_31))), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_64(15004, (94826781437715028L ^ life2_3)) * life6_31))), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_65(5468, (1155524902633295247L ^ life2_3)) * life6_31))), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_66(15816, (4236125389389948177L ^ life2_3)) * life6_31))), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_67(6453, (4066961444745921003L ^ life2_3)) * life6_31))), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_68(21338, (4033712721915022233L ^ life2_3)) * life6_31))), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_69(611, (8724081851818728120L ^ life2_3)) * life6_31))), ((java.awt.image.ImageObserver)(null)));
    ((java.awt.Graphics)(life8_71)).drawImage(((java.awt.Image)(life7_68)), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_71(6123, (5647821900848975659L ^ life2_3)) * life6_31))), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_72(6020, (404421115305119572L ^ life2_3)) * life6_31))), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_73(25447, (5956326654679268285L ^ life2_3)) * life6_31))), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_74(32092, (8308183028500014480L ^ life2_3)) * life6_31))), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_75(11054, (6996018772366717923L ^ life2_3)) * life6_31))), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_76(21338, (4033712721915022233L ^ life2_3)) * life6_31))), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_77(6020, (404421115305119572L ^ life2_3)) * life6_31))), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_78(6453, (4066961444745921003L ^ life2_3)) * life6_31))), ((java.awt.image.ImageObserver)(null)));
    ((java.awt.Graphics)(life8_71)).drawImage(((java.awt.Image)(life7_68)), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_80(2148, (8447507980078600379L ^ life2_3)) * life6_31))), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_81(6020, (404421115305119572L ^ life2_3)) * life6_31))), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_82(30214, (4376954244027887309L ^ life2_3)) * life6_31))), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_83(32092, (8308183028500014480L ^ life2_3)) * life6_31))), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_84(6020, (404421115305119572L ^ life2_3)) * life6_31))), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_85(21338, (4033712721915022233L ^ life2_3)) * life6_31))), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_86(32092, (8308183028500014480L ^ life2_3)) * life6_31))), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_87(6453, (4066961444745921003L ^ life2_3)) * life6_31))), ((java.awt.image.ImageObserver)(null)));
    ((java.awt.Graphics)(life8_71)).drawImage(((java.awt.Image)(life7_68)), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_89(6001, (7216162242035896247L ^ life2_3)) * life6_31))), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_90(32092, (8308183028500014480L ^ life2_3)) * life6_31))), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_91(611, (8724081851818728120L ^ life2_3)) * life6_31))), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_92(5468, (1155524902633295247L ^ life2_3)) * life6_31))), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_93(6020, (404421115305119572L ^ life2_3)) * life6_31))), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_94(6453, (4066961444745921003L ^ life2_3)) * life6_31))), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_95(32092, (8308183028500014480L ^ life2_3)) * life6_31))), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_96(611, (8724081851818728120L ^ life2_3)) * life6_31))), ((java.awt.image.ImageObserver)(null)));
    ((java.awt.Graphics)(life8_71)).drawImage(((java.awt.Image)(life7_68)), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_98(30214, (4376954244027887309L ^ life2_3)) * life6_31))), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_99(32092, (8308183028500014480L ^ life2_3)) * life6_31))), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_100(6001, (7216162242035896247L ^ life2_3)) * life6_31))), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_101(5468, (1155524902633295247L ^ life2_3)) * life6_31))), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_102(2148, (8447507980078600379L ^ life2_3)) * life6_31))), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_103(6453, (4066961444745921003L ^ life2_3)) * life6_31))), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_104(6020, (404421115305119572L ^ life2_3)) * life6_31))), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_105(611, (8724081851818728120L ^ life2_3)) * life6_31))), ((java.awt.image.ImageObserver)(null)));
    ((java.awt.Graphics)(life8_71)).drawImage(((java.awt.Image)(life7_68)), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_107(2148, (8447507980078600379L ^ life2_3)) * life6_31))), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_108(32092, (8308183028500014480L ^ life2_3)) * life6_31))), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_109(30214, (4376954244027887309L ^ life2_3)) * life6_31))), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_110(5468, (1155524902633295247L ^ life2_3)) * life6_31))), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_111(30214, (4376954244027887309L ^ life2_3)) * life6_31))), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_112(6453, (4066961444745921003L ^ life2_3)) * life6_31))), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_113(2148, (8447507980078600379L ^ life2_3)) * life6_31))), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_114(611, (8724081851818728120L ^ life2_3)) * life6_31))), ((java.awt.image.ImageObserver)(null)));
    ((java.awt.Graphics)(life8_71)).drawImage(((java.awt.Image)(life7_68)), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_116(6020, (404421115305119572L ^ life2_3)) * life6_31))), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_117(32092, (8308183028500014480L ^ life2_3)) * life6_31))), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_118(2148, (8447507980078600379L ^ life2_3)) * life6_31))), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_119(5468, (1155524902633295247L ^ life2_3)) * life6_31))), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_120(32092, (8308183028500014480L ^ life2_3)) * life6_31))), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_121(6453, (4066961444745921003L ^ life2_3)) * life6_31))), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_122(1169, (5336506050515196997L ^ life2_3)) * life6_31))), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_123(611, (8724081851818728120L ^ life2_3)) * life6_31))), ((java.awt.image.ImageObserver)(null)));
    }
    ((java.awt.Graphics)(life8_71)).dispose();
    this.a = ((int[])(((java.awt.image.DataBufferInt)(((java.awt.image.DataBufferInt)(((java.awt.image.WritableRaster)(((java.awt.image.BufferedImage)(life7_68)).getRaster())).getDataBuffer())))).getData()));
    this.b(((int)(0)), ((int)(0)), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_131(611, (8724081851818728120L ^ life2_3)) * life6_31))), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_132(21338, (4033712721915022233L ^ life2_3)) * life6_31))));
    this.a(((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_134(611, (8724081851818728120L ^ life2_3)) * life6_31))), ((int)(0)), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_135(5468, (1155524902633295247L ^ life2_3)) * life6_31))), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_136(611, (8724081851818728120L ^ life2_3)) * life6_31))));
    this.b(((int)(0)), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_138(21338, (4033712721915022233L ^ life2_3)) * life6_31))), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_139(5468, (1155524902633295247L ^ life2_3)) * life6_31))), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_140(611, (8724081851818728120L ^ life2_3)) * life6_31))));
    this.a(((int)(0)), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_142(611, (8724081851818728120L ^ life2_3)) * life6_31))), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_143(21338, (4033712721915022233L ^ life2_3)) * life6_31))), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_144(6020, (404421115305119572L ^ life2_3)) * life6_31))));
    this.a(((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_146(21338, (4033712721915022233L ^ life2_3)) * life6_31))), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_147(611, (8724081851818728120L ^ life2_3)) * life6_31))), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_148(30214, (4376954244027887309L ^ life2_3)) * life6_31))), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_149(6020, (404421115305119572L ^ life2_3)) * life6_31))));
    this.a(((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_151(30214, (4376954244027887309L ^ life2_3)) * life6_31))), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_152(611, (8724081851818728120L ^ life2_3)) * life6_31))), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_153(5574, (7163035316897631489L ^ life2_3)) * life6_31))), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_154(6020, (404421115305119572L ^ life2_3)) * life6_31))));
    this.a(((int)(0)), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_156(6020, (404421115305119572L ^ life2_3)) * life6_31))), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_157(21338, (4033712721915022233L ^ life2_3)) * life6_31))), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_158(5468, (1155524902633295247L ^ life2_3)) * life6_31))));
    this.b(((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_160(21338, (4033712721915022233L ^ life2_3)) * life6_31))), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_161(6020, (404421115305119572L ^ life2_3)) * life6_31))), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_162(6020, (404421115305119572L ^ life2_3)) * life6_31))), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_163(5468, (1155524902633295247L ^ life2_3)) * life6_31))));
    this.a(((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_165(6020, (404421115305119572L ^ life2_3)) * life6_31))), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_166(6020, (404421115305119572L ^ life2_3)) * life6_31))), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_167(5468, (1155524902633295247L ^ life2_3)) * life6_31))), ((int)((__sourceIntrinsic_ffe7cf041fec_invokedynamic1239_168(5468, (1155524902633295247L ^ life2_3)) * life6_31))));
    return life7_68;
}


public void a() {
return;
}


private void a(int p0, int p1, int p2, int p3) {
long life5_3;
    int life7_12;
    int life8_17;
    life5_3 = (moom.li.g ^ 124461706821412L);
    if ((!((moom.li)(this)).a__Boolean(((int)(p0)), ((int)(p1)), ((int)(p2)), ((int)(p3))))) {
        life7_12 = p0;
        loop_region_13: while ((life7_12 < p2)) {
        life8_17 = p1;
        loop_region_18: while ((life8_17 < p3)) {
        int[] __stackOp1238_4_0 = this.a;
        int __stackOp1238_4_1 = (life7_12 + (life8_17 * this.b));
        (__stackOp1238_4_0)[__stackOp1238_4_1] = ((__stackOp1238_4_0)[__stackOp1238_4_1] & __sourceIntrinsic_78ef822b053c_invokedynamic1238_5(25515, (2396973669735008299L ^ life5_3)));
        life8_17 += 1;
    }
        life7_12 += 1;
    }
    }
    return;
}


private boolean a__Boolean(int p0, int p1, int p2, int p3) {
long local5 = (moom.li.g ^ 78558423942819L);
    int local7 = p0;
    while ((local7 < p2)) {
        int local8 = p1;
        while ((local8 < p3)) {
        int local9 = (this.a)[(local7 + (local8 * this.b))];
        if ((((local9 >> __sourceIntrinsic_ed1e1977d778_invokedynamic6950_3(9986, (2452492995483137290L ^ local5))) & __sourceIntrinsic_ed1e1977d778_invokedynamic6950_4(30530, (4787306030783669586L ^ local5))) < __sourceIntrinsic_ed1e1977d778_invokedynamic6950_5(2456, (8357924005566438281L ^ local5)))) {
        return true;
    }
        local8 += 1;
    }
        local7 += 1;
    }
    return false;
}


private static native <E extends Throwable> int __sourceIntrinsic_ac28bfb5504e_invokedynamic1240_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral8313_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_27(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_29(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_31(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_32(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_33(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_34(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_35(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_36(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_38(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_39(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_40(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_41(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_42(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_43(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_44(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_45(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_47(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_48(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_49(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_50(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_51(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_52(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_53(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_55(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_56(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_57(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_58(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_59(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_60(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_62(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_63(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_64(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_65(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_66(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_67(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_68(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_69(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_71(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_72(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_73(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_74(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_75(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_76(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_77(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_78(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_80(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_81(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_82(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_83(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_84(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_85(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_86(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_87(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_89(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_90(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_91(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_92(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_93(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_94(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_95(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_96(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_98(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_99(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_100(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_101(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_102(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_103(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_104(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_105(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_107(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_108(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_109(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_110(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_111(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_112(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_113(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_114(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_116(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_117(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_118(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_119(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_120(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_121(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_122(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_123(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_131(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_132(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_134(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_135(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_136(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_138(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_139(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_140(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_142(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_143(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_144(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_146(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_147(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_148(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_149(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_151(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_152(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_153(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_154(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_156(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_157(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_158(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_160(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_161(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_162(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_163(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_165(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_166(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_167(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffe7cf041fec_invokedynamic1239_168(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_78ef822b053c_invokedynamic1238_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ed1e1977d778_invokedynamic6950_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ed1e1977d778_invokedynamic6950_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ed1e1977d778_invokedynamic6950_5(int a0, long a1) throws E;
}
