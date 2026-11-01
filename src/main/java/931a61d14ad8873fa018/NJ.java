package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class NJ {

private final java.lang.Object[] a;

private int b;

private static final long c;

private static final long[] d;

private static final java.lang.Integer[] e;

private static final java.util.Map f;

public NJ(java.lang.Object p0, java.lang.Object p1, java.lang.Object p2) {
this(new java.lang.Object[] {p0, p1, p2});
    return;
}


public NJ(java.lang.Object p0, java.lang.Object p1) {
this(new java.lang.Object[] {p0, p1});
    return;
}


public NJ(java.lang.Object[] p0) {
super();
    this.b = 0;
    this.a = ((java.lang.Object[]) ((p0).clone()));
}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(1288254950267915772L)), ((long)(4813691872170431496L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(40521255023177L)))));
    f = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.NJ.c ^ 14282772467653L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill724_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill724_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill724_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill724_14 = new byte[8];
    (__sourceSpill724_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill724_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation724_16 = __sourceSpill724_14;
    ((javax.crypto.Cipher)(__sourceSpill724_11)).init(((int)(__sourceSpill724_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill724_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation724_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "¹ËnJD$7§\026\021]CîkÑ"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill724_25 = local6_life21;
        int __sourceSpill724_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill724_25)).substring(((int)(__sourceSpill724_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill724_30 = local8_life19;
        int __sourceSpill724_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill724_33 = new byte[8];
        (__sourceSpill724_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill724_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill724_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill724_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill724_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill724_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill724_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill724_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill724_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill724_34)).doFinal(((byte[])(__sourceSpill724_33)));
        (__sourceSpill724_30)[__sourceSpill724_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    d = ((long[])(local8_life19));
    e = ((java.lang.Integer[])(new java.lang.Integer[2]));
}


public boolean equals(java.lang.Object p0) {
java.lang.Object lexicalValue999_13_0;
    java.lang.Object lexicalValue999_20_0;
    int lexicalValue999_30_0;
    int lexicalValue999_45_0;
    int lexicalValue999_65_0;
    int lexicalValue999_70_0;
    java.lang.Object spill999_0;
    int spill999_1;
    int spill999_2;
    boolean spill999_3;
    long life2_3;
    int life4_5;
    moom.NJ life5_39;
    java.lang.Object[] life6_49;
    int life7_66;
    lexical_join_70: {
    lexical_join_69: {
    lexical_join_45: {
    lexical_join_44: {
    lexical_join_31: {
    lexical_join_30: {
    lexical_join_29: {
    lexical_join_20: {
    lexical_join_19: {
    lexical_join_13: {
    lexical_join_12: {
    life2_3 = (moom.NJ.c ^ 56915287129623L);
    life4_5 = moom.Ob.c();
    spill999_0 = p0;
    if (!((life4_5 != 0))) {
        lexicalValue999_13_0 = spill999_0;
        break lexical_join_13;
    }
    if (!((spill999_0 == null))) {
        break lexical_join_12;
    }
    return ((0) != 0);
    }
    lexicalValue999_13_0 = p0;
    }
    if (!((life4_5 != 0))) {
        lexicalValue999_20_0 = lexicalValue999_13_0;
        break lexical_join_20;
    }
    if (!((lexicalValue999_13_0 == this))) {
        break lexical_join_19;
    }
    return ((1) != 0);
    }
    lexicalValue999_20_0 = p0;
    }
    spill999_1 = ((lexicalValue999_20_0 instanceof moom.NJ) ? 1 : 0);
    if (!((life4_5 != 0))) {
        lexicalValue999_30_0 = spill999_1;
        break lexical_join_30;
    }
    if (!((spill999_1 != 0))) {
        break lexical_join_29;
    }
    life5_39 = ((moom.NJ)(p0));
    if (!((life4_5 == 0))) {
        break lexical_join_31;
    }
    }
    lexicalValue999_30_0 = 0;
    }
    return ((lexicalValue999_30_0) != 0);
    }
    life6_49 = ((moom.NJ)(life5_39)).a();
    spill999_2 = (life6_49).length;
    if (!((life4_5 != 0))) {
        lexicalValue999_45_0 = spill999_2;
        break lexical_join_45;
    }
    if (!((spill999_2 != (this.a).length))) {
        break lexical_join_44;
    }
    return ((0) != 0);
    }
    lexicalValue999_45_0 = 0;
    }
    life7_66 = lexicalValue999_45_0;
    lexical_cycle_46: while (true) {
    lexical_join_66: {
    lexical_join_65: {
    if (!((life7_66 < (this.a).length))) {
        break lexical_join_69;
    }
    spill999_3 = moom.NJ.a(((java.lang.Object)((this.a)[life7_66])), ((java.lang.Object)((life6_49)[life7_66])));
    if (!((life4_5 != 0))) {
        lexicalValue999_70_0 = ((spill999_3) ? 1 : 0);
        break lexical_join_70;
    }
    if (!((life4_5 != 0))) {
        lexicalValue999_65_0 = ((spill999_3) ? 1 : 0);
        break lexical_join_65;
    }
    if (!((!spill999_3))) {
        break lexical_join_66;
    }
    lexicalValue999_65_0 = 0;
    }
    return ((lexicalValue999_65_0) != 0);
    }
    life7_66 += 1;
    if (!((life4_5 == 0))) { continue lexical_cycle_46; }
    break lexical_cycle_46;
    }
    }
    lexicalValue999_70_0 = 1;
    }
    return ((lexicalValue999_70_0) != 0);
}


public java.lang.String toString() {
return __sourceIntrinsic_a86c261fcdee_originalDynamicSite1342_2(moom.BU.a(((java.lang.Object[])(this.a))));
}


public int hashCode() {
int lexicalValue1000_55_0;
    int spill1000_0;
    long life1_3;
    int life3_5;
    java.lang.Object[] life4_23;
    int life5_26;
    int life6_28;
    java.lang.Object life7_35;
    lexical_join_55: {
    lexical_join_53: {
    life1_3 = (moom.NJ.c ^ 122212420111222L);
    life3_5 = moom.Ob.b();
    spill1000_0 = this.b;
    if (!((life3_5 == 0))) {
        lexicalValue1000_55_0 = spill1000_0;
        break lexical_join_55;
    }
    if (!((spill1000_0 == 0))) {
        break lexical_join_53;
    }
    this.b = ((int)(__sourceIntrinsic_1861091996aa_invokedynamic1000_3(1378, (873953951214719205L ^ life1_3))));
    life4_23 = this.a;
    life5_26 = (life4_23).length;
    life6_28 = 0;
    lexical_cycle_26: while (true) {
    lexical_join_51: {
    lexical_join_50: {
    if (!((life6_28 < life5_26))) {
        break lexical_join_53;
    }
    life7_35 = (life4_23)[life6_28];
    if (!((life3_5 == 0))) {
        break lexical_join_51;
    }
    if (!((life7_35 != null))) {
        break lexical_join_50;
    }
    this.b = ((int)(((__sourceIntrinsic_1861091996aa_invokedynamic1000_6(27695, (3804096689046829481L ^ life1_3)) * this.b) + ((java.lang.Object)(life7_35)).hashCode())));
    }
    life6_28 += 1;
    }
    if (!((life3_5 != 0))) { continue lexical_cycle_26; }
    break lexical_cycle_26;
    }
    }
    lexicalValue1000_55_0 = this.b;
    }
    return lexicalValue1000_55_0;
}


public java.lang.Object[] b() {
return ((java.lang.Object[])(((java.lang.Object[])(this.a)).clone()));
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral6582_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/NJ"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.NJ.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x589D;
        if (e[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = d[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])f.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    f.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/NJ", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            NJ.e[n2] = n4;
        }
        return e[n2];
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static boolean a(java.lang.Object p0, java.lang.Object p1) {
java.lang.Object forwardValue2804_12_0;
    java.lang.Object forwardValue2804_16_0;
    int forwardValue2804_22_0;
    int forwardValue2804_24_0;
    java.lang.Object spill2804_0;
    boolean spill2804_1;
    long life2_3;
    int life4_5;
    forward_join_24: {
    forward_join_23: {
    forward_join_22: {
    forward_join_21: {
    forward_join_16: {
    forward_join_12: {
    life2_3 = (moom.NJ.c ^ 138417250857691L);
    life4_5 = moom.Ob.c();
    spill2804_0 = p0;
    if (!((life4_5 != 0))) {
        forwardValue2804_12_0 = spill2804_0;
        break forward_join_12;
    }
    if (!((spill2804_0 != p1))) {
        break forward_join_21;
    }
    forwardValue2804_12_0 = p0;
    }
    if (!((life4_5 != 0))) {
        forwardValue2804_16_0 = forwardValue2804_12_0;
        break forward_join_16;
    }
    if (!((forwardValue2804_12_0 != null))) {
        break forward_join_23;
    }
    forwardValue2804_16_0 = p0;
    }
    spill2804_1 = ((java.lang.Object)(forwardValue2804_16_0)).equals(((java.lang.Object)(p1)));
    if (!((life4_5 != 0))) {
        forwardValue2804_22_0 = ((spill2804_1) ? 1 : 0);
        break forward_join_22;
    }
    if (!(spill2804_1)) {
        break forward_join_23;
    }
    }
    forwardValue2804_22_0 = 1;
    }
    forwardValue2804_24_0 = forwardValue2804_22_0;
    break forward_join_24;
    }
    forwardValue2804_24_0 = 0;
    }
    return ((forwardValue2804_24_0) != 0);
}


private java.lang.Object[] a() {
return this.a;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite1342_2(java.lang.String a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_invokedynamic1000_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_invokedynamic1000_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral6582_0() throws E;
}
