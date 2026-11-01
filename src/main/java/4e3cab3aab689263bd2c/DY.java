package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class DY {

private final byte a;

private final byte b;

private final byte c;

private final byte d;

private static final long e;

private static final long[] f;

private static final java.lang.Integer[] g;

private static final java.util.Map h;

public DY(byte p0, byte p1, byte p2, byte p3) {
super();
    this.a = p0;
    this.b = p1;
    this.c = p2;
    this.d = p3;
}


public DY(moom.DY p0) {
super();
    this.a = p0.a;
    this.b = p0.b;
    this.c = p0.c;
    this.d = p0.d;
}


static {
e = ((long)(((moom._a)(moom._c.a(((long)(7841421508164841612L)), ((long)(4693219217162076897L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(134526750676968L)))));
    h = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.DY.e ^ 16447254091830L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill515_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill515_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill515_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill515_14 = new byte[8];
    (__sourceSpill515_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill515_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation515_16 = __sourceSpill515_14;
    ((javax.crypto.Cipher)(__sourceSpill515_11)).init(((int)(__sourceSpill515_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill515_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation515_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "\f¹T\r¼\\\nÇú\033"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill515_25 = local6_life21;
        int __sourceSpill515_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill515_25)).substring(((int)(__sourceSpill515_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill515_30 = local8_life19;
        int __sourceSpill515_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill515_33 = new byte[8];
        (__sourceSpill515_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill515_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill515_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill515_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill515_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill515_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill515_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill515_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill515_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill515_34)).doFinal(((byte[])(__sourceSpill515_33)));
        (__sourceSpill515_30)[__sourceSpill515_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    f = ((long[])(local8_life19));
    g = ((java.lang.Integer[])(new java.lang.Integer[2]));
}


public boolean equals(java.lang.Object p0) {
java.lang.Object forestValue233_14_0;
    int forestValue233_24_0;
    int forestValue233_36_0;
    int forestValue233_36_1;
    int forestValue233_43_0;
    int forestValue233_43_1;
    int forestValue233_52_0;
    int forestValue233_52_1;
    int forestValue233_54_0;
    int forestValue233_56_0;
    moom.DY spill233_0;
    int spill233_1;
    byte spill233_2;
    byte spill233_3;
    byte spill233_4;
    long life2_3;
    int life4_5;
    moom.DY life5_22;
    forest_join_56: {
    forest_join_55: {
    forest_join_54: {
    forest_join_52: {
    forest_join_43: {
    forest_join_36: {
    forest_join_25: {
    forest_join_24: {
    forest_join_23: {
    forest_join_14: {
    forest_join_13: {
    life2_3 = (moom.DY.e ^ 59739839995284L);
    life4_5 = ((moom.DS.c__Boolean()) ? 1 : 0);
    spill233_0 = this;
    if (!((life4_5 != 0))) {
        forestValue233_14_0 = spill233_0;
        break forest_join_14;
    }
    if (!((spill233_0 == p0))) {
        break forest_join_13;
    }
    return ((1) != 0);
    }
    forestValue233_14_0 = p0;
    }
    spill233_1 = ((forestValue233_14_0 instanceof moom.DY) ? 1 : 0);
    if (!((life4_5 != 0))) {
        forestValue233_24_0 = spill233_1;
        break forest_join_24;
    }
    if (!((spill233_1 != 0))) {
        break forest_join_23;
    }
    life5_22 = ((moom.DY)(p0));
    if (!((life4_5 == 0))) {
        break forest_join_25;
    }
    }
    forestValue233_24_0 = 0;
    }
    return ((forestValue233_24_0) != 0);
    }
    spill233_2 = this.a;
    spill233_3 = ((moom.DY)(life5_22)).a;
    if (!((life4_5 != 0))) {
        forestValue233_36_0 = ((int)(spill233_2));
        forestValue233_36_1 = ((int)(spill233_3));
        break forest_join_36;
    }
    if (!((spill233_2 == spill233_3))) {
        break forest_join_55;
    }
    forestValue233_36_0 = ((int)(this.d));
    forestValue233_36_1 = ((int)(((moom.DY)(life5_22)).d));
    }
    if (!((life4_5 != 0))) {
        forestValue233_43_0 = forestValue233_36_0;
        forestValue233_43_1 = forestValue233_36_1;
        break forest_join_43;
    }
    if (!((forestValue233_36_0 == forestValue233_36_1))) {
        break forest_join_55;
    }
    forestValue233_43_0 = ((int)(this.b));
    forestValue233_43_1 = ((int)(((moom.DY)(life5_22)).b));
    }
    if (!((life4_5 != 0))) {
        forestValue233_52_0 = forestValue233_43_0;
        forestValue233_52_1 = forestValue233_43_1;
        break forest_join_52;
    }
    if (!((forestValue233_43_0 == forestValue233_43_1))) {
        break forest_join_55;
    }
    spill233_4 = this.c;
    if (!((life4_5 != 0))) {
        forestValue233_54_0 = ((int)(spill233_4));
        break forest_join_54;
    }
    forestValue233_52_0 = ((int)(spill233_4));
    forestValue233_52_1 = ((int)(((moom.DY)(life5_22)).c));
    }
    if (!((forestValue233_52_0 == forestValue233_52_1))) {
        break forest_join_55;
    }
    forestValue233_54_0 = 1;
    }
    forestValue233_56_0 = forestValue233_54_0;
    break forest_join_56;
    }
    forestValue233_56_0 = 0;
    }
    return ((forestValue233_56_0) != 0);
}


public int hashCode() {
long local1_life1 = (moom.DY.e ^ 119664587515296L);
    byte local3_life3 = this.a;
    int local3_life6 = ((__sourceIntrinsic_1861091996aa_originalDynamicSite1309_4(31641, (7790727741591473574L ^ local1_life1)) * local3_life3) + this.b);
    local3_life6 = ((__sourceIntrinsic_1861091996aa_originalDynamicSite1309_7(24599, (8182267177917896233L ^ local1_life1)) * local3_life6) + this.c);
    local3_life6 = ((__sourceIntrinsic_1861091996aa_originalDynamicSite1309_9(24599, (8182267177917896233L ^ local1_life1)) * local3_life6) + this.d);
    return local3_life6;
}


public byte b() {
return this.b;
}


public byte c() {
return this.c;
}


public byte d() {
return this.d;
}


private static int a(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x7159;
        if (g[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = f[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])h.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    h.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/DY", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            DY.g[n2] = n4;
        }
        return g[n2];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.DY.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral4191_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/DY"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public byte a() {
return this.a;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral4191_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_originalDynamicSite1309_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_originalDynamicSite1309_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_originalDynamicSite1309_9(int a0, long a1) throws E;
}
