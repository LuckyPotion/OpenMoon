package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class LC implements moom.LA {

private moom.bS[] a;

private moom.bS[] b;

private moom.bS[] c;

private int d;

private static moom.bS[] e;

private static long f;

private static long[] g;

private static java.lang.Integer[] h;

private static java.util.Map i;

public LC(moom.bS[] p0, moom.bS[] p1, moom.bS[] p2, int p3) { super(); }


private static void __sourceConstructorBody_0dd028bf5852f746(moom.LC receiver, moom.bS[] p0, moom.bS[] p1, moom.bS[] p2, int p3) throws Throwable {

long local5 = (moom.LC.f ^ 34958045826779L);

    moom.LC.__sourceConstructorInit_0dd028bf5852f746_0(((moom.LC)(receiver)));

    ((moom.LC)(receiver)).d = ((int)(__sourceIntrinsic_0dd028bf5852f746_originalDynamicSite2369_2(17671, (8607877479217787303L ^ local5))));

    ((moom.LC)(receiver)).a = ((moom.bS[])(moom.LC.a__ArraybS(((moom.bS[])(p0)))));

    ((moom.LC)(receiver)).b = ((moom.bS[])(moom.LC.a__ArraybS(((moom.bS[])(p1)))));

    ((moom.LC)(receiver)).c = ((moom.bS[])(moom.LC.a__ArraybS(((moom.bS[])(p2)))));

    ((moom.LC)(receiver)).d = ((int)(p3));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_0dd028bf5852f746_0(moom.LC a0) throws E;
private static native <E extends Throwable> void __sourceConstructorInit_8a0e1c6ba5ea8e95_0(moom.LC a0, moom.bS[] a1, moom.bS[] a2, moom.bS[] a3, int a4) throws E;

public LC(moom.bS[] p0, moom.bS[] p1, moom.bS[] p2) { this((moom.bS[])null, (moom.bS[])null, (moom.bS[])null, 0); }


private static void __sourceConstructorBody_8a0e1c6ba5ea8e95(moom.LC receiver, moom.bS[] p0, moom.bS[] p1, moom.bS[] p2) throws Throwable {

long local4_life1 = (moom.LC.f ^ 98848520333637L);

    moom.LC.__sourceConstructorInit_8a0e1c6ba5ea8e95_0(((moom.LC)(receiver)), ((moom.bS[])(p0)), ((moom.bS[])(p1)), ((moom.bS[])(p2)), ((int)(__sourceIntrinsic_8a0e1c6ba5ea8e95_originalDynamicSite678_2(19710, (5953755057197932481L ^ local4_life1)))));

    return;

}



public LC() {
this(((moom.bS[])(null)), ((moom.bS[])(null)), ((moom.bS[])(null)));
    return;
}


static {
f = ((long)(((moom._a)(moom._c.a(((long)(-4125297757409736787L)), ((long)(8457163748669630221L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(58746935634054L)))));
    i = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.LC.f ^ 75958472565562L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill666_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill666_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill666_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill666_14 = new byte[8];
    (__sourceSpill666_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill666_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation666_16 = __sourceSpill666_14;
    ((javax.crypto.Cipher)(__sourceSpill666_11)).init(((int)(__sourceSpill666_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill666_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation666_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "éì\013\022ç{´\022c9ÈÔääâ"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill666_25 = local6_life21;
        int __sourceSpill666_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill666_25)).substring(((int)(__sourceSpill666_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill666_30 = local8_life19;
        int __sourceSpill666_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill666_33 = new byte[8];
        (__sourceSpill666_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill666_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill666_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill666_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill666_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill666_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill666_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill666_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill666_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill666_34)).doFinal(((byte[])(__sourceSpill666_33)));
        (__sourceSpill666_30)[__sourceSpill666_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    g = ((long[])(local8_life19));
    h = ((java.lang.Integer[])(new java.lang.Integer[2]));
    e = ((moom.bS[])(new moom.bS[0]));
}


public moom.LC b(moom.bS[] p0) {
return new moom.LC(this.a, p0, this.c);
}


public moom.bS[] b() {
return this.b;
}


public moom.LC c(moom.bS[] p0) {
return new moom.LC(this.a, this.b, p0);
}


public moom.bS[] c() {
return this.c;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.LC.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public moom.LC a(int p0) {
return new moom.LC(this.a, this.b, this.c, p0);
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral5866_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/LC"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static int a(int p0, long p1) {
int n4 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x33E6;
        if (h[n4] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = g[n4];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])i.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    i.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/LC", exception);
            }
            int n8 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            LC.h[n4] = n8;
        }
        return h[n4];
}


private static moom.bS[] a__ArraybS(moom.bS[] p0) {
long local1 = (moom.LC.f ^ 62816474573670L);
    return ((p0 == null) ? moom.LC.e : p0);
}


public moom.bS[] a__ArraybS() {
return this.a;
}


public int a() {
moom.bS[] forwardValue2555_15_0;
    int forwardValue2555_16_0;
    moom.bS[] spill2555_0;
    long life1_3;
    java.lang.String[] life3_5;
    forward_join_16: {
    forward_join_15: {
    forward_join_13: {
    life1_3 = (moom.LC.f ^ 94277954551071L);
    life3_5 = moom.bS.b();
    spill2555_0 = this.a;
    if (!((life3_5 != null))) {
        forwardValue2555_15_0 = spill2555_0;
        break forward_join_15;
    }
    if (!((spill2555_0 == null))) {
        break forward_join_13;
    }
    forwardValue2555_16_0 = 0;
    break forward_join_16;
    }
    forwardValue2555_15_0 = this.a;
    }
    forwardValue2555_16_0 = (forwardValue2555_15_0).length;
    }
    return forwardValue2555_16_0;
}


public moom.bS[] a(moom.Lu[] p0) {
int lexicalValue914_47_0;
    int lexicalValue914_47_1;
    java.lang.String[] spill914_0;
    int spill914_1;
    int spill914_2;
    long life2_3;
    int life5_11;
    int life6_17;
    java.lang.String[] life4_18;
    int life7_20;
    int life8_22;
    java.util.ArrayList life8_66;
    int life9_68;
    lexical_join_83: {
    lexical_join_77: {
    lexical_join_54: {
    life2_3 = (moom.LC.f ^ 131487420945134L);
    life5_11 = ((this.a).length + (this.c).length);
    spill914_0 = moom.bS.b();
    life6_17 = ((p0).length - life5_11);
    life4_18 = spill914_0;
    life7_20 = 0;
    life8_22 = 0;
    lexical_cycle_23: while (true) {
    lexical_join_47: {
    if (!(((life8_22 + (this.b).length) <= life6_17))) {
        break lexical_join_54;
    }
    spill914_1 = ((life5_11 + life8_22) + (this.b).length);
    spill914_2 = this.d;
    if (!((life4_18 != null))) {
        lexicalValue914_47_0 = spill914_1;
        lexicalValue914_47_1 = spill914_2;
        break lexical_join_47;
    }
    if (!((spill914_1 <= spill914_2))) {
        break lexical_join_54;
    }
    life7_20 += 1;
    lexicalValue914_47_0 = life8_22;
    lexicalValue914_47_1 = (this.b).length;
    }
    life8_22 = (lexicalValue914_47_0 + lexicalValue914_47_1);
    if (!((life4_18 == null))) { continue lexical_cycle_23; }
    break lexical_cycle_23;
    }
    net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[2])));
    }
    life8_66 = new java.util.ArrayList(java.util.Arrays.asList(((java.lang.Object[])(this.a))));
    life9_68 = 0;
    lexical_cycle_63: while (true) {
    if (!((life9_68 < life7_20))) {
        break lexical_join_77;
    }
    ((java.util.List)(life8_66)).addAll(((java.util.Collection)(java.util.Arrays.asList(((java.lang.Object[])(this.b))))));
    life9_68 += 1;
    if (!((life4_18 != null))) {
        break lexical_join_83;
    }
    if (!((life4_18 == null))) { continue lexical_cycle_63; }
    break lexical_cycle_63;
    }
    }
    ((java.util.List)(life8_66)).addAll(((java.util.Collection)(java.util.Arrays.asList(((java.lang.Object[])(this.c))))));
    }
    return ((moom.bS[])(((java.util.List)(life8_66)).toArray(((java.lang.Object[])(new moom.bS[0])))));
}


public moom.LC a(moom.bS[] p0) {
return new moom.LC(p0, this.b, this.c);
}


private static native <E extends Throwable> int __sourceIntrinsic_0dd028bf5852f746_originalDynamicSite2369_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8a0e1c6ba5ea8e95_originalDynamicSite678_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral5866_0() throws E;
}
