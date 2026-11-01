package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class lv {

protected final net.minecraft.client.renderer.RenderGlobal a;

protected final net.minecraft.world.World b;

protected int c;

protected int d;

protected int e;

public moom.mp[] f;

private final java.util.Map<moom.Ee, moom.Mk[]> g;

private static final long h;

private static final long[] i;

private static final java.lang.Integer[] j;

private static final java.util.Map k;

public lv(net.minecraft.world.World p0, int p1, net.minecraft.client.renderer.RenderGlobal p2, net.minecraft.client.renderer.chunk.IRenderChunkFactory p3) {
super();
    this.g = new java.util.HashMap();
    this.a = p2;
    this.b = p0;
    (this).a(p1);
    (this).a(p3);
}


static {
h = ((long)(((moom._a)(moom._c.a(((long)(-628255461645090563L)), ((long)(-1715823155670698167L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(43437105833666L)))));
    k = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.lv.h ^ 110526946287215L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1390_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1390_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1390_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1390_14 = new byte[8];
    (__sourceSpill1390_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1390_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1390_16 = __sourceSpill1390_14;
    ((javax.crypto.Cipher)(__sourceSpill1390_11)).init(((int)(__sourceSpill1390_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1390_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1390_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[4];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "×Ëò\0265g4Å\"«yÊ\036×²"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1390_25 = local6_life21;
        int __sourceSpill1390_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1390_25)).substring(((int)(__sourceSpill1390_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1390_30 = local8_life19;
        int __sourceSpill1390_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1390_33 = new byte[8];
        (__sourceSpill1390_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1390_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1390_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1390_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1390_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1390_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1390_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1390_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1390_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1390_34)).doFinal(((byte[])(__sourceSpill1390_33)));
        (__sourceSpill1390_30)[__sourceSpill1390_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "\ré8Õª§/#û¿}\0040D"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1390_38 = local6_life21;
        int __sourceSpill1390_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1390_38)).substring(((int)(__sourceSpill1390_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1390_43 = local8_life19;
        int __sourceSpill1390_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1390_46 = new byte[8];
        (__sourceSpill1390_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1390_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1390_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1390_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1390_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1390_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1390_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1390_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1390_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1390_47)).doFinal(((byte[])(__sourceSpill1390_46)));
        (__sourceSpill1390_43)[__sourceSpill1390_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    i = ((long[])(local8_life19));
    j = ((java.lang.Integer[])(new java.lang.Integer[4]));
}


public void b() {
java.util.Iterator local1 = ((java.util.Set)(((java.util.Map)(this.g)).keySet())).iterator();
    while (((java.util.Iterator)(local1)).hasNext()) {
        moom.Ee local2 = ((moom.Ee)(((java.util.Iterator)(local1)).next()));
        moom.Mk[] local3 = ((moom.Mk[])(((java.util.Map)(this.g)).get(((java.lang.Object)(local2)))));
        int local4 = 0;
        while ((local4 < (local3).length)) {
        moom.Mk local5 = (local3)[local4];
        if ((local5 != null)) {
        ((moom.Mk)(local5)).d();
    }
        (local3)[local4] = null;
        local4 += 1;
    }
    }
    ((java.util.Map)(this.g)).clear();
    return;
}


private void a(moom.mp p0) {
long life2_3;
    moom.DT life4_6;
    int life5_21;
    int life6_36;
    moom.Ee life7_42;
    net.minecraft.util.EnumWorldBlockLayer[] life8_44;
    moom.Mk[] life9_50;
    int life10_58;
    int life10_83;
    moom.Mk life11_91;
    life2_3 = (moom.lv.h ^ 115095149264414L);
    life4_6 = ((moom.mp)(p0)).a__DT();
    life5_21 = ((((moom.DT)(life4_6)).a() >> __sourceIntrinsic_dbc018fe3b07_invokedynamic6819_3(31238, (6452601881742423263L ^ life2_3))) << __sourceIntrinsic_dbc018fe3b07_invokedynamic6819_4(12254, (3635625190051471620L ^ life2_3)));
    life6_36 = ((((moom.DT)(life4_6)).c() >> __sourceIntrinsic_dbc018fe3b07_invokedynamic6819_6(12254, (3635625190051471620L ^ life2_3))) << __sourceIntrinsic_dbc018fe3b07_invokedynamic6819_7(12254, (3635625190051471620L ^ life2_3)));
    life7_42 = new moom.Ee(life5_21, life6_36);
    life8_44 = moom.mp.r;
    life9_50 = ((moom.Mk[])(((java.util.Map)(this.g)).get(((java.lang.Object)(life7_42)))));
    if ((life9_50 == null)) {
        life9_50 = new moom.Mk[(life8_44).length];
        life10_58 = 0;
        while ((life10_58 < (life8_44).length)) {
        (life9_50)[life10_58] = new moom.Mk((life8_44)[life10_58]);
        life10_58 += 1;
    }
        ((java.util.Map)(this.g)).put(((java.lang.Object)(life7_42)), ((java.lang.Object)(life9_50)));
    }
    life10_83 = 0;
    while ((life10_83 < (life8_44).length)) {
        life11_91 = (life9_50)[life10_83];
        if ((life11_91 != null)) {
        ((moom.oC)(((moom.mp)(p0)).a(((int)(life10_83))))).a(((moom.Mk)(life11_91)));
    }
        life10_83 += 1;
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 23889;
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
            throw new RuntimeException("moom/lv", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         j[var3] = var15;
      }

      return j[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.lv.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral8336_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/lv"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(double p0, double p1) {
long life5_3;
    int life7_12;
    int life8_21;
    int life9_30;
    int life10_32;
    int life11_42;
    int life12_44;
    int life13_54;
    int life14_56;
    int life15_68;
    moom.mp life16_83;
    moom.DT life17_86;
    moom.DT life18_111;
    lexical_join_120: {
    life5_3 = (moom.lv.h ^ 9411275433061L);
    life7_12 = (moom.Dr.b__Int(((double)(p0))) - __sourceIntrinsic_8c1142a1dac4_invokedynamic1242_2(12254, (3635590153558096767L ^ life5_3)));
    life8_21 = (moom.Dr.b__Int(((double)(p1))) - __sourceIntrinsic_8c1142a1dac4_invokedynamic1242_4(12254, (3635590153558096767L ^ life5_3)));
    life9_30 = (this.d * __sourceIntrinsic_8c1142a1dac4_invokedynamic1242_6(16171, (2755653647314316171L ^ life5_3)));
    life10_32 = 0;
    lexical_cycle_33: while (true) {
    lexical_join_118: {
    if (!((life10_32 < this.d))) {
        break lexical_join_120;
    }
    life11_42 = this.a(((int)(life7_12)), ((int)(life9_30)), ((int)(life10_32)));
    life12_44 = 0;
    lexical_cycle_45: while (true) {
    lexical_join_116: {
    if (!((life12_44 < this.e))) {
        break lexical_join_118;
    }
    life13_54 = this.a(((int)(life8_21)), ((int)(life9_30)), ((int)(life12_44)));
    life14_56 = 0;
    lexical_cycle_57: while (true) {
    lexical_join_114: {
    lexical_join_99: {
    if (!((life14_56 < this.c))) {
        break lexical_join_116;
    }
    life15_68 = (life14_56 * __sourceIntrinsic_8c1142a1dac4_invokedynamic1242_12(16171, (2755653647314316171L ^ life5_3)));
    life16_83 = (this.f)[((((life12_44 * this.c) + life14_56) * this.d) + life10_32)];
    life17_86 = ((moom.mp)(life16_83)).a__DT();
    if (!((((moom.DT)(life17_86)).a() == life11_42))) {
        break lexical_join_99;
    }
    if (!((((moom.DT)(life17_86)).b() == life15_68))) {
        break lexical_join_99;
    }
    if (!((((moom.DT)(life17_86)).c() != life13_54))) {
        break lexical_join_114;
    }
    }
    life18_111 = new moom.DT(life11_42, life15_68, life13_54);
    if (!((!((moom.DT)(life18_111)).equals(((java.lang.Object)(((moom.mp)(life16_83)).a__DT())))))) {
        break lexical_join_114;
    }
    ((moom.mp)(life16_83)).a__Void(((moom.DT)(life18_111)));
    }
    life14_56 += 1;
    continue lexical_cycle_57;
    }
    }
    life12_44 += 1;
    continue lexical_cycle_45;
    }
    }
    life10_32 += 1;
    continue lexical_cycle_33;
    }
    }
    return;
}


protected void a(int p0) {
long local2 = (moom.lv.h ^ 83507786612472L);
    int local4 = ((p0 * 2) + 1);
    this.d = ((int)(local4));
    this.c = ((int)(__sourceIntrinsic_b4a3d886a4d9_originalDynamicSite1549_2(16171, (2755726988447822102L ^ local2))));
    this.e = ((int)(local4));
    return;
}


public void a() {
moom.mp[] life1_2;
    int life2_5;
    int life3_7;
    moom.mp life4_14;
    life1_2 = this.f;
    life2_5 = (life1_2).length;
    life3_7 = 0;
    while ((life3_7 < life2_5)) {
        life4_14 = (life1_2)[life3_7];
        ((moom.mp)(life4_14)).e();
        life3_7 += 1;
    }
    this.b();
    return;
}


protected void a(net.minecraft.client.renderer.chunk.IRenderChunkFactory p0) {
long life2_3;
    int life4_12;
    int life5_18;
    int life6_20;
    int life7_26;
    int life8_32;
    int life9_48;
    moom.DT life10_73;
    moom.mp[] life6_111;
    int life7_114;
    int life8_116;
    moom.mp life9_123;
    int life10_125;
    moom.bs life11_133;
    moom.DT life12_137;
    moom.mp life13_141;
    life2_3 = (moom.lv.h ^ 72297176696551L);
    life4_12 = ((this.d * this.c) * this.e);
    this.f = ((moom.mp[])(new moom.mp[life4_12]));
    life5_18 = 0;
    life6_20 = 0;
    loop_region_21: while ((life6_20 < this.d)) {
        life7_26 = 0;
        loop_region_27: while ((life7_26 < this.c)) {
        life8_32 = 0;
        loop_region_33: while ((life8_32 < this.e)) {
        life9_48 = ((((life8_32 * this.c) + life7_26) * this.d) + life6_20);
        life10_73 = new moom.DT((life6_20 * __sourceIntrinsic_d6d9c7133d25_invokedynamic4353_10(30583, (3899511064797086038L ^ life2_3))), (life7_26 * __sourceIntrinsic_d6d9c7133d25_invokedynamic4353_11(16171, (2755716075669571849L ^ life2_3))), (life8_32 * __sourceIntrinsic_d6d9c7133d25_invokedynamic4353_12(16171, (2755716075669571849L ^ life2_3))));
        (this.f)[life9_48] = ((net.minecraft.client.renderer.chunk.IRenderChunkFactory)(p0)).a(((net.minecraft.world.World)(this.b)), ((net.minecraft.client.renderer.RenderGlobal)(this.a)), ((moom.DT)(life10_73)), ((int)((life5_18++))));
        if (moom.BU.aE()) {
        if (moom.BU.aD()) {
        this.a(((moom.mp)((this.f)[life9_48])));
    }
    }
        life8_32 += 1;
    }
        life7_26 += 1;
    }
        life6_20 += 1;
    }
    life6_111 = this.f;
    life7_114 = (life6_111).length;
    life8_116 = 0;
    loop_region_111: while ((life8_116 < life7_114)) {
        life9_123 = (life6_111)[life8_116];
        life10_125 = 0;
        loop_region_120: while ((life10_125 < (moom.bs.VALUES).length)) {
        life11_133 = (moom.bs.VALUES)[life10_125];
        life12_137 = ((moom.mp)(life9_123)).a(((moom.bs)(life11_133)));
        life13_141 = this.a(((moom.DT)(life12_137)));
        ((moom.mp)(life9_123)).a(((moom.bs)(life11_133)), ((moom.mp)(life13_141)));
        life10_125 += 1;
    }
        life8_116 += 1;
    }
    return;
}


private int a(int p0, int p1, int p2) {
long local4 = (moom.lv.h ^ 40570450257104L);
    int local6 = (p2 * __sourceIntrinsic_248c5cdd4d82_invokedynamic8340_1(16171, (2755675263627029310L ^ local4)));
    int local7 = ((local6 - p0) + (p1 / 2));
    if ((local7 < 0)) {
        local7 = (local7 - (p1 - 1));
    }
    return (local6 - ((local7 / p1) * p1));
}


public void a(int p0, int p1, int p2, int p3, int p4, int p5) {
long local7 = (moom.lv.h ^ 27196956870957L);
    int local9 = moom.Dr.a(((int)(p0)), ((int)(__sourceIntrinsic_499f7b7391d8_invokedynamic6968_1(16171, (2755671182377436867L ^ local7)))));
    int local10 = moom.Dr.a(((int)(p1)), ((int)(__sourceIntrinsic_499f7b7391d8_invokedynamic6968_3(16171, (2755671182377436867L ^ local7)))));
    int local11 = moom.Dr.a(((int)(p2)), ((int)(__sourceIntrinsic_499f7b7391d8_invokedynamic6968_5(16171, (2755671182377436867L ^ local7)))));
    int local12 = moom.Dr.a(((int)(p3)), ((int)(__sourceIntrinsic_499f7b7391d8_invokedynamic6968_7(16171, (2755671182377436867L ^ local7)))));
    int local13 = moom.Dr.a(((int)(p4)), ((int)(__sourceIntrinsic_499f7b7391d8_invokedynamic6968_9(16171, (2755671182377436867L ^ local7)))));
    int local14 = moom.Dr.a(((int)(p5)), ((int)(__sourceIntrinsic_499f7b7391d8_invokedynamic6968_11(16171, (2755671182377436867L ^ local7)))));
    int local15 = local9;
    while ((local15 <= local12)) {
        int local16 = (local15 % this.d);
        if ((local16 < 0)) {
        local16 = (local16 + this.d);
    }
        int local17 = local10;
        while ((local17 <= local13)) {
        int local18 = (local17 % this.c);
        if ((local18 < 0)) {
        local18 = (local18 + this.c);
    }
        int local19 = local11;
        while ((local19 <= local14)) {
        int local20 = (local19 % this.e);
        if ((local20 < 0)) {
        local20 = (local20 + this.e);
    }
        int local21 = ((((local20 * this.c) + local18) * this.d) + local16);
        moom.mp local22 = (this.f)[local21];
        ((moom.mp)(local22)).a(((boolean)(true)));
        local19 += 1;
    }
        local17 += 1;
    }
        local15 += 1;
    }
    return;
}


public moom.mp a(moom.DT p0) {
int local2 = (((moom.DT)(p0)).a() >> 4);
    int local3 = (((moom.DT)(p0)).b() >> 4);
    int local4 = (((moom.DT)(p0)).c() >> 4);
    if ((local3 >= 0)) {
        if ((local3 < this.c)) {
        local2 = (local2 % this.d);
        if ((local2 < 0)) {
        local2 = (local2 + this.d);
    }
        local4 = (local4 % this.e);
        if ((local4 < 0)) {
        local4 = (local4 + this.e);
    }
        int local5 = ((((local4 * this.c) + local3) * this.d) + local2);
        return (this.f)[local5];
    }
    }
    return null;
}


private static native <E extends Throwable> int __sourceIntrinsic_dbc018fe3b07_invokedynamic6819_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_dbc018fe3b07_invokedynamic6819_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_dbc018fe3b07_invokedynamic6819_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_dbc018fe3b07_invokedynamic6819_7(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral8336_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8c1142a1dac4_invokedynamic1242_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8c1142a1dac4_invokedynamic1242_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8c1142a1dac4_invokedynamic1242_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8c1142a1dac4_invokedynamic1242_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b4a3d886a4d9_originalDynamicSite1549_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d6d9c7133d25_invokedynamic4353_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d6d9c7133d25_invokedynamic4353_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d6d9c7133d25_invokedynamic4353_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_248c5cdd4d82_invokedynamic8340_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_499f7b7391d8_invokedynamic6968_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_499f7b7391d8_invokedynamic6968_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_499f7b7391d8_invokedynamic6968_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_499f7b7391d8_invokedynamic6968_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_499f7b7391d8_invokedynamic6968_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_499f7b7391d8_invokedynamic6968_11(int a0, long a1) throws E;
}
