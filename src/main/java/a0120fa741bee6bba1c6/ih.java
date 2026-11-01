package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
















import moom.B1;






import net.minecraft.item.Item;
import java.util.Map;
import moom.BY;
import net.minecraft.stats.StatList;
class ih extends moom.ig {

net.minecraft.client.gui.achievement.GuiStats E;

private static long H;

private static long[] O;

private static java.lang.Integer[] P;

private static java.util.Map Q;

public ih(net.minecraft.client.gui.achievement.GuiStats p0, net.minecraft.client.Minecraft p1) { super((net.minecraft.client.gui.achievement.GuiStats)null, (net.minecraft.client.Minecraft)null); }

private static void __sourceConstructorBody_822709194d8ab7ce(moom.ih receiver, net.minecraft.client.gui.achievement.GuiStats p0, net.minecraft.client.Minecraft p1) throws Throwable {
java.util.Iterator life3_12;
    moom.B1 life4_19;
    int life5_21;
    int life6_25;
    forest_join_69: {
    ((moom.ih)(receiver)).E = ((net.minecraft.client.gui.achievement.GuiStats)(p0));
    moom.ih.__sourceConstructorInit_822709194d8ab7ce_0(((moom.ih)(receiver)), ((net.minecraft.client.gui.achievement.GuiStats)(p0)), ((net.minecraft.client.Minecraft)(p1)));
    ((moom.ih)(receiver)).z = ((java.util.List)(com.google.common.collect.Lists.newArrayList()));
    life3_12 = ((java.util.List)(net.minecraft.stats.StatList.e)).iterator();
    forest_cycle_13: while (true) {
    forest_join_68: {
    forest_join_61: {
    forest_join_48: {
    forest_join_34: {
    if (!(((java.util.Iterator)(life3_12)).hasNext())) {
        break forest_join_69;
    }
    life4_19 = ((moom.B1)(((java.util.Iterator)(life3_12)).next()));
    life5_21 = 0;
    life6_25 = __sourceExactCall_7da118eea97d77(((net.minecraft.item.Item)(__sourceExactCall_eaaf3b818e6f3a(((moom.B1)(life4_19))))));
    if (!((((moom.B2)(((net.minecraft.client.gui.achievement.GuiStats)(p0)).C)).a(((moom.BY)(life4_19))) > 0))) {
        break forest_join_34;
    }
    life5_21 = 1;
    break forest_join_61;
    }
    if (!(((net.minecraft.stats.StatList.ad)[life6_25] != null))) {
        break forest_join_48;
    }
    if (!((((moom.B2)(((net.minecraft.client.gui.achievement.GuiStats)(p0)).C)).a(((moom.BY)((net.minecraft.stats.StatList.ad)[life6_25]))) > 0))) {
        break forest_join_48;
    }
    life5_21 = 1;
    break forest_join_61;
    }
    if (!(((net.minecraft.stats.StatList.ac)[life6_25] != null))) {
        break forest_join_61;
    }
    if (!((((moom.B2)(((net.minecraft.client.gui.achievement.GuiStats)(p0)).C)).a(((moom.BY)((net.minecraft.stats.StatList.ac)[life6_25]))) > 0))) {
        break forest_join_61;
    }
    life5_21 = 1;
    }
    if (!((life5_21 != 0))) {
        break forest_join_68;
    }
    ((java.util.List)(((moom.ih)(receiver)).z)).add(((java.lang.Object)(life4_19)));
    }
    continue forest_cycle_13;
    }
    }
    ((moom.ih)(receiver)).A = ((java.util.Comparator)(__sourceIntrinsic_822709194d8ab7ce_invokedynamic466_23(receiver)));
    return;
}


static {
H = ((long)(((moom._a)(moom._c.a(((long)(-7371256603274247711L)), ((long)(-7074550662182066515L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(280647124632390L)))));
    Q = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.ih.H ^ 41410206616526L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1308_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1308_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1308_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1308_14 = new byte[8];
    (__sourceSpill1308_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1308_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1308_16 = __sourceSpill1308_14;
    ((javax.crypto.Cipher)(__sourceSpill1308_11)).init(((int)(__sourceSpill1308_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1308_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1308_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[13];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "ùÞÒ»àuÝ°»ýÿ\020÷ÛÁðzÙ¼\024³9¹\030\037\013e(\001]~\035§ÔèÞVb\fM\032­\037U¬ï\004½\025}¶\031ác~û,\025zMápjÅ¸\026Ü\033Ø¹\020E¯"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1308_25 = local6_life21;
        int __sourceSpill1308_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1308_25)).substring(((int)(__sourceSpill1308_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1308_30 = local8_life19;
        int __sourceSpill1308_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1308_33 = new byte[8];
        (__sourceSpill1308_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1308_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1308_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1308_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1308_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1308_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1308_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1308_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1308_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1308_34)).doFinal(((byte[])(__sourceSpill1308_33)));
        (__sourceSpill1308_30)[__sourceSpill1308_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "«9Ò\føVw\025\tùñ@%"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1308_38 = local6_life21;
        int __sourceSpill1308_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1308_38)).substring(((int)(__sourceSpill1308_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1308_43 = local8_life19;
        int __sourceSpill1308_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1308_46 = new byte[8];
        (__sourceSpill1308_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1308_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1308_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1308_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1308_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1308_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1308_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1308_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1308_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1308_47)).doFinal(((byte[])(__sourceSpill1308_46)));
        (__sourceSpill1308_43)[__sourceSpill1308_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    O = ((long[])(local8_life19));
    P = ((java.lang.Integer[])(new java.lang.Integer[13]));
}

private static native <E extends Throwable> void __sourceConstructorInit_822709194d8ab7ce_0(moom.ih a0, net.minecraft.client.gui.achievement.GuiStats a1, net.minecraft.client.Minecraft a2) throws E;

private static int c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_34eedb4b404bf5(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int c(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 29133;
      if (P[var3] == null) {
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
         long var5 = O[var3];
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
         Object[] var9 = (Object[])Q.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               Q.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/ih", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         P[var3] = var15;
      }

      return P[var3];
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral8053_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/ih"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static moom.Oo c(moom.Oo p0) {
return p0;
}


protected void a(int p0, int p1, int p2, int p3, int p4, int p5) {
long local7 = (moom.ih.H ^ 29651241992132L);
    moom.B1 local9 = ((moom.ih)(this)).a__B1(((int)(p0)));
    net.minecraft.item.Item local10 = ((moom.B1)(local9)).a__sourceReturn_e516839077();
    __sourceExactCall_c74cf69608908e(((net.minecraft.client.gui.achievement.GuiStats)(this.E)), ((int)((p1 + __sourceIntrinsic_499f7b7391d8_invokedynamic6780_4(2255, (5647211688158220250L ^ local7))))), ((int)(p2)), ((net.minecraft.item.Item)(local10)));
    int local11 = __sourceExactCall_7da118eea97d77(((net.minecraft.item.Item)(local10)));
    ((moom.ih)(this)).a(((moom.BY)((net.minecraft.stats.StatList.ac)[local11])), ((int)((p1 + __sourceIntrinsic_499f7b7391d8_invokedynamic6780_8(2852, (5508096606849584187L ^ local7))))), ((int)(p2)), ((boolean)__sourceIntrinsic_integerToBoolean(((((p0 % 2) == 0) ? 1 : 0)))));
    ((moom.ih)(this)).a(((moom.BY)((net.minecraft.stats.StatList.ad)[local11])), ((int)((p1 + __sourceIntrinsic_499f7b7391d8_invokedynamic6780_11(26165, (6798409512193663267L ^ local7))))), ((int)(p2)), ((boolean)__sourceIntrinsic_integerToBoolean(((((p0 % 2) == 0) ? 1 : 0)))));
    ((moom.ih)(this)).a(((moom.BY)(local9)), ((int)((p1 + __sourceIntrinsic_499f7b7391d8_invokedynamic6780_13(26274, (3034317300947231164L ^ local7))))), ((int)(p2)), ((boolean)__sourceIntrinsic_integerToBoolean(((((p0 % 2) == 0) ? 1 : 0)))));
    return;
}


protected java.lang.String a__sourceReturn_b52d34d971(int p0) {
return ((p0 == 0) ? "stat.crafted" : ((p0 == 1) ? "stat.used" : "stat.mined"));
}


protected void a(int p0, int p1, net.minecraft.client.renderer.Tessellator p2) {
long local4 = (moom.ih.H ^ 51899714136628L);
    super.a(((int)(p0)), ((int)(p1)), ((net.minecraft.client.renderer.Tessellator)(p2)));
    if ((this.y == 0)) {
        __sourceExactCall_6bfe5e6b27f3ff(((net.minecraft.client.gui.achievement.GuiStats)(this.E)), ((int)((((p0 + __sourceIntrinsic_ef0d3654b78f_invokedynamic8055_4(7639, (5294348913383132987L ^ local4))) - __sourceIntrinsic_ef0d3654b78f_invokedynamic8055_5(32551, (8833390639516691910L ^ local4))) + 1))), ((int)(((p1 + 1) + 1))), ((int)(__sourceIntrinsic_ef0d3654b78f_invokedynamic8055_6(7126, (3346563603379636543L ^ local4)))), ((int)(__sourceIntrinsic_ef0d3654b78f_invokedynamic8055_7(7126, (3346563603379636543L ^ local4)))));
    } else {
        __sourceExactCall_6bfe5e6b27f3ff(((net.minecraft.client.gui.achievement.GuiStats)(this.E)), ((int)(((p0 + __sourceIntrinsic_ef0d3654b78f_invokedynamic8055_10(7639, (5294348913383132987L ^ local4))) - __sourceIntrinsic_ef0d3654b78f_invokedynamic8055_11(7126, (3346563603379636543L ^ local4))))), ((int)((p1 + 1))), ((int)(__sourceIntrinsic_ef0d3654b78f_invokedynamic8055_12(7126, (3346563603379636543L ^ local4)))), ((int)(__sourceIntrinsic_ef0d3654b78f_invokedynamic8055_13(7126, (3346563603379636543L ^ local4)))));
    }
    if ((this.y == 1)) {
        __sourceExactCall_6bfe5e6b27f3ff(((net.minecraft.client.gui.achievement.GuiStats)(this.E)), ((int)((((p0 + __sourceIntrinsic_ef0d3654b78f_invokedynamic8055_17(13506, (2060176253795722799L ^ local4))) - __sourceIntrinsic_ef0d3654b78f_invokedynamic8055_18(7126, (3346563603379636543L ^ local4))) + 1))), ((int)(((p1 + 1) + 1))), ((int)(__sourceIntrinsic_ef0d3654b78f_invokedynamic8055_19(24532, (2575905444112567600L ^ local4)))), ((int)(__sourceIntrinsic_ef0d3654b78f_invokedynamic8055_20(7126, (3346563603379636543L ^ local4)))));
    } else {
        __sourceExactCall_6bfe5e6b27f3ff(((net.minecraft.client.gui.achievement.GuiStats)(this.E)), ((int)(((p0 + __sourceIntrinsic_ef0d3654b78f_invokedynamic8055_23(13506, (2060176253795722799L ^ local4))) - __sourceIntrinsic_ef0d3654b78f_invokedynamic8055_24(7126, (3346563603379636543L ^ local4))))), ((int)((p1 + 1))), ((int)(__sourceIntrinsic_ef0d3654b78f_invokedynamic8055_25(366, (985135656949339017L ^ local4)))), ((int)(__sourceIntrinsic_ef0d3654b78f_invokedynamic8055_26(7126, (3346563603379636543L ^ local4)))));
    }
    if ((this.y == 2)) {
        __sourceExactCall_6bfe5e6b27f3ff(((net.minecraft.client.gui.achievement.GuiStats)(this.E)), ((int)((((p0 + __sourceIntrinsic_ef0d3654b78f_invokedynamic8055_30(22106, (8393550824230356146L ^ local4))) - __sourceIntrinsic_ef0d3654b78f_invokedynamic8055_31(7126, (3346563603379636543L ^ local4))) + 1))), ((int)(((p1 + 1) + 1))), ((int)(__sourceIntrinsic_ef0d3654b78f_invokedynamic8055_32(7379, (7143579190131609145L ^ local4)))), ((int)(__sourceIntrinsic_ef0d3654b78f_invokedynamic8055_33(7126, (3346563603379636543L ^ local4)))));
    } else {
        __sourceExactCall_6bfe5e6b27f3ff(((net.minecraft.client.gui.achievement.GuiStats)(this.E)), ((int)(((p0 + __sourceIntrinsic_ef0d3654b78f_invokedynamic8055_36(22106, (8393550824230356146L ^ local4))) - __sourceIntrinsic_ef0d3654b78f_invokedynamic8055_37(7126, (3346563603379636543L ^ local4))))), ((int)((p1 + 1))), ((int)(__sourceIntrinsic_ef0d3654b78f_invokedynamic8055_38(22397, (1179844734751475094L ^ local4)))), ((int)(__sourceIntrinsic_ef0d3654b78f_invokedynamic8055_39(7126, (3346563603379636543L ^ local4)))));
    }
    return;
}


private int lambda$new$0(moom.B1 p0, moom.B1 p1) {
int n = __sourceExactCall_7da118eea97d77(p0.a__sourceReturn_e516839077());
        int n4 = __sourceExactCall_7da118eea97d77(p1.a__sourceReturn_e516839077());
        BY bY2 = null;
        BY bY3 = null;
        if (this.B == 2) {
            bY2 = StatList.ab[n];
            bY3 = StatList.ab[n4];
        } else if (this.B == 0) {
            bY2 = StatList.ac[n];
            bY3 = StatList.ac[n4];
        } else if (this.B == 1) {
            bY2 = StatList.ad[n];
            bY3 = StatList.ad[n4];
        }
        if (bY2 != null || bY3 != null) {
            int n8;
            if (bY2 == null) {
                return 1;
            }
            if (bY3 == null) {
                return -1;
            }
            int n10 = this.E.C.a(bY2);
            if (n10 != (n8 = this.E.C.a(bY3))) {
                return (n10 - n8) * this.C;
            }
        }
        return n - n4;
}


private static native <E extends Throwable> java.util.Comparator __sourceIntrinsic_822709194d8ab7ce_invokedynamic466_23(moom.ih a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_499f7b7391d8_invokedynamic6780_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_499f7b7391d8_invokedynamic6780_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_499f7b7391d8_invokedynamic6780_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_499f7b7391d8_invokedynamic6780_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ef0d3654b78f_invokedynamic8055_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ef0d3654b78f_invokedynamic8055_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ef0d3654b78f_invokedynamic8055_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ef0d3654b78f_invokedynamic8055_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ef0d3654b78f_invokedynamic8055_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ef0d3654b78f_invokedynamic8055_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ef0d3654b78f_invokedynamic8055_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ef0d3654b78f_invokedynamic8055_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ef0d3654b78f_invokedynamic8055_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ef0d3654b78f_invokedynamic8055_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ef0d3654b78f_invokedynamic8055_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ef0d3654b78f_invokedynamic8055_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ef0d3654b78f_invokedynamic8055_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ef0d3654b78f_invokedynamic8055_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ef0d3654b78f_invokedynamic8055_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ef0d3654b78f_invokedynamic8055_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ef0d3654b78f_invokedynamic8055_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ef0d3654b78f_invokedynamic8055_31(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ef0d3654b78f_invokedynamic8055_32(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ef0d3654b78f_invokedynamic8055_33(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ef0d3654b78f_invokedynamic8055_36(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ef0d3654b78f_invokedynamic8055_37(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ef0d3654b78f_invokedynamic8055_38(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ef0d3654b78f_invokedynamic8055_39(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral8053_0() throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native int __sourceExactCall_34eedb4b404bf5(int p0, long p1);
private static native int __sourceExactCall_7da118eea97d77(net.minecraft.item.Item p0);

private static native void __sourceExactCall_c74cf69608908e(net.minecraft.client.gui.achievement.GuiStats p0, int p1, int p2, net.minecraft.item.Item p3);
private static native void __sourceExactCall_6bfe5e6b27f3ff(net.minecraft.client.gui.achievement.GuiStats p0, int p1, int p2, int p3, int p4);

private static native net.minecraft.item.Item __sourceExactCall_eaaf3b818e6f3a(moom.B1 p0);
}
