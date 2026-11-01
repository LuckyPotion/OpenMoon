package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class jf extends moom.iQ {

public moom.jD[] i;

public moom.jD j;

private static long k;

private static long[] l;

private static java.lang.Integer[] m;

private static java.util.Map n;

public jf() { super(); }


private static void __sourceConstructorBody_dceb0643f63dbffc(moom.jf receiver) throws Throwable {

int __initValue682_52_0;

    int __initValue682_52_1;

    int __initValue682_64_0;

    long local1_life2;

    net.minecraft.entity.Entity[] local3_life6;

    int local4_life10;

    int local5_life12;

    int local6_life13;

    init_join_127: {

    init_join_105: {

    local1_life2 = (moom.jf.k ^ 114782480581535L);

    net.minecraft.entity.Entity[] __sourceSpill682_4 = moom.iQ.b();

    moom.jf.__sourceConstructorInit_dceb0643f63dbffc_0(((moom.jf)(receiver)));

    local3_life6 = __sourceSpill682_4;

    ((moom.jf)(receiver)).i = ((moom.jD[])(new moom.jD[__sourceIntrinsic_dceb0643f63dbffc_originalDynamicSite682_8(29961, (321113788971761268L ^ local1_life2))]));

    local4_life10 = 0;

    init_cycle_18: while (true) {

    init_join_65: {

    init_join_64: {

    init_join_52: {

    init_join_48: {

    if (!((local4_life10 < (((moom.jf)(receiver)).i).length))) {

        break init_join_105;

    }

    local5_life12 = 0;

    local6_life13 = local4_life10;

    if (!((local3_life6 != null))) {

        break init_join_127;

    }

    int __sourceSpill682_14 = local4_life10;

    int __sourceSpill682_15 = 2;

    if (!((local3_life6 != null))) {

        __initValue682_52_0 = __sourceSpill682_14;

        __initValue682_52_1 = __sourceSpill682_15;

        break init_join_52;

    }

    if (!((__sourceSpill682_14 == __sourceSpill682_15))) {

        break init_join_48;

    }

    local5_life12 = __sourceIntrinsic_dceb0643f63dbffc_originalDynamicSite682_17(497, (267109438084434573L ^ local1_life2));

    local6_life13 = __sourceIntrinsic_dceb0643f63dbffc_originalDynamicSite682_19(14928, (5823103165654167850L ^ local1_life2));

    if (!((local3_life6 == null))) {

        break init_join_65;

    }

    }

    int __sourceSpill682_20 = local4_life10;

    if (!((local3_life6 != null))) {

        __initValue682_64_0 = __sourceSpill682_20;

        break init_join_64;

    }

    __initValue682_52_0 = __sourceSpill682_20;

    __initValue682_52_1 = 3;

    }

    if (!((__initValue682_52_0 == __initValue682_52_1))) {

        break init_join_65;

    }

    local5_life12 = __sourceIntrinsic_dceb0643f63dbffc_originalDynamicSite682_22(27412, (455440957365952621L ^ local1_life2));

    __initValue682_64_0 = __sourceIntrinsic_dceb0643f63dbffc_originalDynamicSite682_24(4078, (5813786263134389397L ^ local1_life2));

    }

    local6_life13 = __initValue682_64_0;

    }

    (((moom.jf)(receiver)).i)[local4_life10] = new moom.jD(((moom.iQ) receiver), local5_life12, local6_life13);

    ((moom.jD)((((moom.jf)(receiver)).i)[local4_life10])).a(((float)(-1065353216)), ((float)(((float) (__sourceIntrinsic_dceb0643f63dbffc_originalDynamicSite682_29(19450, (1123198608146399365L ^ local1_life2)) + local4_life10)))), ((float)(-1065353216)), ((int)(__sourceIntrinsic_dceb0643f63dbffc_originalDynamicSite682_32(5340, (1637472247602831268L ^ local1_life2)))), ((int)(1)), ((int)(__sourceIntrinsic_dceb0643f63dbffc_originalDynamicSite682_34(5340, (1637472247602831268L ^ local1_life2)))));

    local4_life10 += 1;

    if (!((local3_life6 == null))) { continue init_cycle_18; }

    break init_cycle_18;

    }

    }

    ((moom.jf)(receiver)).j = ((moom.jD)(new moom.jD(((moom.iQ) receiver), 0, __sourceIntrinsic_dceb0643f63dbffc_originalDynamicSite682_37(12873, (8987062727399078199L ^ local1_life2)))));

    ((moom.jD)(((moom.jf)(receiver)).j)).a(((float)(-1073741824)), ((float)(1099956224)), ((float)(-1073741824)), ((int)(4)), ((int)(4)), ((int)(4)));

    }

    return;

}



static {
k = ((long)(((moom._a)(moom._c.a(((long)(3579109193995774583L)), ((long)(-5531532857443544656L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(10349280403342L)))));
    n = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.jf.k ^ 101913985637451L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1334_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1334_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1334_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1334_14 = new byte[8];
    (__sourceSpill1334_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1334_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1334_16 = __sourceSpill1334_14;
    ((javax.crypto.Cipher)(__sourceSpill1334_11)).init(((int)(__sourceSpill1334_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1334_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1334_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[8];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "Z\030HðPVt\024ðL¼e<\005± |\177÷9l*³Áx¨\024s÷\rÓJ\013ûÒþ+\035\006\035\020b©b"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1334_25 = local6_life21;
        int __sourceSpill1334_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1334_25)).substring(((int)(__sourceSpill1334_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1334_30 = local8_life19;
        int __sourceSpill1334_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1334_33 = new byte[8];
        (__sourceSpill1334_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1334_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1334_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1334_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1334_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1334_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1334_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1334_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1334_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1334_34)).doFinal(((byte[])(__sourceSpill1334_33)));
        (__sourceSpill1334_30)[__sourceSpill1334_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "\022Ú=HÕYÆU\034\0136:K]-3"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1334_38 = local6_life21;
        int __sourceSpill1334_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1334_38)).substring(((int)(__sourceSpill1334_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1334_43 = local8_life19;
        int __sourceSpill1334_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1334_46 = new byte[8];
        (__sourceSpill1334_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1334_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1334_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1334_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1334_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1334_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1334_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1334_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1334_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1334_47)).doFinal(((byte[])(__sourceSpill1334_46)));
        (__sourceSpill1334_43)[__sourceSpill1334_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    l = ((long[])(local8_life19));
    m = ((java.lang.Integer[])(new java.lang.Integer[8]));
}

private static native <E extends Throwable> void __sourceConstructorInit_dceb0643f63dbffc_0(moom.jf a0) throws E;

private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8168_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/jf"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 24967;
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
            throw new RuntimeException("moom/jf", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         m[var3] = var15;
      }

      return m[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.jf.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public void a(net.minecraft.entity.Entity p0, float p1, float p2, float p3, float p4, float p5, float p6) {
net.minecraft.entity.Entity[] spill1220_0;
    long life8_3;
    moom.jD[] life11_20;
    int life12_23;
    net.minecraft.entity.Entity[] life10_24;
    int life13_26;
    moom.jD life14_33;
    lexical_join_40: {
    life8_3 = (moom.jf.k ^ 70312344752345L);
    ((moom.jf)(this)).a(((float)(p1)), ((float)(p2)), ((float)(p3)), ((float)(p4)), ((float)(p5)), ((float)(p6)), ((net.minecraft.entity.Entity)(p0)));
    ((moom.jD)(this.j)).a(((float)(p6)));
    spill1220_0 = moom.iQ.b();
    life11_20 = this.i;
    life12_23 = (life11_20).length;
    life10_24 = spill1220_0;
    life13_26 = 0;
    lexical_cycle_27: while (true) {
    if (!((life13_26 < life12_23))) {
        break lexical_join_40;
    }
    life14_33 = (life11_20)[life13_26];
    ((moom.jD)(life14_33)).a(((float)(p6)));
    life13_26 += 1;
    if (!((life10_24 == null))) { continue lexical_cycle_27; }
    break lexical_cycle_27;
    }
    }
    return;
}


public void a(net.minecraft.entity.EntityLivingBase p0, float p1, float p2, float p3) {
int lexicalValue1221_29_0;
    net.minecraft.entity.Entity[] spill1221_0;
    int spill1221_1;
    long life5_3;
    moom.th life8_7;
    net.minecraft.entity.Entity[] life7_8;
    float life9_19;
    int life10_32;
    lexical_join_52: {
    lexical_join_29: {
    lexical_join_28: {
    life5_3 = (moom.jf.k ^ 37361400450499L);
    spill1221_0 = moom.iQ.b();
    life8_7 = ((moom.th)(p0));
    life7_8 = spill1221_0;
    life9_19 = (((moom.th)(life8_7)).bZ + ((((moom.th)(life8_7)).bY - ((moom.th)(life8_7)).bZ) * p3));
    spill1221_1 = recovery.source.CarrierOps.fcmpg(((float)(life9_19)), ((float)(0x0.0p0f)));
    if (!((life7_8 != null))) {
        lexicalValue1221_29_0 = spill1221_1;
        break lexical_join_29;
    }
    if (!((spill1221_1 < 0))) {
        break lexical_join_28;
    }
    life9_19 = 0x0.0p0f;
    }
    lexicalValue1221_29_0 = 0;
    }
    life10_32 = lexicalValue1221_29_0;
    lexical_cycle_30: while (true) {
    if (!((life10_32 < (this.i).length))) {
        break lexical_join_52;
    }
    ((moom.jD)((this.i)[life10_32])).f = ((float)(((((float) (-(4 - life10_32))) * life9_19) * 0x1.b33334p0f)));
    life10_32 += 1;
    if (!((life7_8 == null))) { continue lexical_cycle_30; }
    break lexical_cycle_30;
    }
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static native <E extends Throwable> int __sourceIntrinsic_dceb0643f63dbffc_originalDynamicSite682_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_dceb0643f63dbffc_originalDynamicSite682_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_dceb0643f63dbffc_originalDynamicSite682_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_dceb0643f63dbffc_originalDynamicSite682_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_dceb0643f63dbffc_originalDynamicSite682_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_dceb0643f63dbffc_originalDynamicSite682_29(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_dceb0643f63dbffc_originalDynamicSite682_32(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_dceb0643f63dbffc_originalDynamicSite682_34(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_dceb0643f63dbffc_originalDynamicSite682_37(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8168_0() throws E;
}
