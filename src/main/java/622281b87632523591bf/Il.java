package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
class Il {

int a;

moom.Il[] b;

boolean[] c;

boolean d;

boolean e;

int f;

private static long g;

private static long[] h;

private static java.lang.Integer[] i;

private static java.util.Map j;

public Il(int p0) { super(); }


private static void __sourceConstructorBody_e618f06737ed48a0(moom.Il receiver, int p0) throws Throwable {

long local2 = (moom.Il.g ^ 46172106736378L);

    moom.Il.__sourceConstructorInit_e618f06737ed48a0_0(((moom.Il)(receiver)));

    ((moom.Il)(receiver)).b = ((moom.Il[])(new moom.Il[__sourceIntrinsic_e618f06737ed48a0_originalDynamicSite2179_2(11810, (7772214973242560898L ^ local2))]));

    ((moom.Il)(receiver)).c = ((boolean[])(new boolean[__sourceIntrinsic_e618f06737ed48a0_originalDynamicSite2179_4(11810, (7772214973242560898L ^ local2))]));

    ((moom.Il)(receiver)).a = ((int)(p0));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_e618f06737ed48a0_0(moom.Il a0) throws E;

static {
g = ((long)(((moom._a)(moom._c.a(((long)(-2316056795594503060L)), ((long)(6162901135314583521L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(268696356929699L)))));
    j = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.Il.g ^ 130063370695477L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill581_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill581_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill581_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill581_14 = new byte[8];
    (__sourceSpill581_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill581_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation581_16 = __sourceSpill581_14;
    ((javax.crypto.Cipher)(__sourceSpill581_11)).init(((int)(__sourceSpill581_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill581_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation581_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[3];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "|\177GôG\037.½¦ËÐ\024q9?\bU\021óËÔná"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill581_25 = local6_life21;
        int __sourceSpill581_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill581_25)).substring(((int)(__sourceSpill581_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill581_30 = local8_life19;
        int __sourceSpill581_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill581_33 = new byte[8];
        (__sourceSpill581_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill581_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill581_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill581_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill581_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill581_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill581_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill581_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill581_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill581_34)).doFinal(((byte[])(__sourceSpill581_33)));
        (__sourceSpill581_30)[__sourceSpill581_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    h = ((long[])(local8_life19));
    i = ((java.lang.Integer[])(new java.lang.Integer[3]));
}


private static int a(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x13F0;
        if (i[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = h[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])j.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    j.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/Il", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Il.i[n2] = n3;
        }
        return i[n2];
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral4951_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Il"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.Il.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public void a(moom.bs p0, moom.Il p1) {
(this.b)[((moom.bs)(p0)).a()] = p1;
    (((moom.Il)(p1)).b)[((moom.bs)(((moom.bs)(p0)).a__bs())).a()] = this;
    return;
}


public void a__Void() {
boolean[] lexicalValue796_25_0;
    int lexicalValue796_25_1;
    boolean[] lexicalValue796_26_0;
    int lexicalValue796_26_1;
    int lexicalValue796_26_2;
    net.minecraft.entity.Entity[] spill796_0;
    boolean[] spill796_1;
    int spill796_2;
    long life1_3;
    int life4_6;
    net.minecraft.entity.Entity[] life3_7;
    lexical_join_30: {
    life1_3 = (moom.Il.g ^ 25184328078353L);
    spill796_0 = moom.G4.b();
    life4_6 = 0;
    life3_7 = spill796_0;
    lexical_cycle_8: while (true) {
    lexical_join_26: {
    lexical_join_25: {
    if (!((life4_6 < __sourceIntrinsic_b82a5b29b709_invokedynamic796_2(32710, (1954881771117844111L ^ life1_3))))) {
        break lexical_join_30;
    }
    spill796_1 = this.c;
    spill796_2 = life4_6;
    if (!(((this.b)[life4_6] != null))) {
        lexicalValue796_25_0 = spill796_1;
        lexicalValue796_25_1 = spill796_2;
        break lexical_join_25;
    }
    lexicalValue796_26_0 = spill796_1;
    lexicalValue796_26_1 = spill796_2;
    lexicalValue796_26_2 = 1;
    break lexical_join_26;
    }
    lexicalValue796_26_0 = lexicalValue796_25_0;
    lexicalValue796_26_1 = lexicalValue796_25_1;
    lexicalValue796_26_2 = 0;
    }
    (lexicalValue796_26_0)[lexicalValue796_26_1] = ((lexicalValue796_26_2) != 0);
    life4_6 += 1;
    if (!((life3_7 == null))) { continue lexical_cycle_8; }
    break lexical_cycle_8;
    }
    }
    return;
}


public boolean a(int p0) {
int lexicalValue795_17_0;
    moom.Il lexicalValue795_33_0;
    int lexicalValue795_44_0;
    int lexicalValue795_54_0;
    int lexicalValue795_58_0;
    boolean spill795_0;
    moom.Il spill795_1;
    boolean spill795_2;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    int life5_22;
    lexical_join_62: {
    lexical_join_17: {
    lexical_join_13: {
    life2_3 = (moom.Il.g ^ 16272789731595L);
    life4_5 = moom.G4.b();
    spill795_0 = this.e;
    if (!((life4_5 != null))) {
        lexicalValue795_17_0 = ((spill795_0) ? 1 : 0);
        break lexical_join_17;
    }
    if (!(spill795_0)) {
        break lexical_join_13;
    }
    return ((1) != 0);
    }
    this.f = ((int)(p0));
    lexicalValue795_17_0 = 0;
    }
    life5_22 = lexicalValue795_17_0;
    lexical_cycle_18: while (true) {
    lexical_join_59: {
    lexical_join_58: {
    lexical_join_54: {
    lexical_join_44: {
    lexical_join_33: {
    if (!((life5_22 < __sourceIntrinsic_f3a7748b91d1_invokedynamic795_6(11810, (7772178747301882483L ^ life2_3))))) {
        break lexical_join_62;
    }
    spill795_1 = (this.b)[life5_22];
    if (!((life4_5 != null))) {
        lexicalValue795_33_0 = spill795_1;
        break lexical_join_33;
    }
    if (!((spill795_1 != null))) {
        break lexical_join_59;
    }
    lexicalValue795_33_0 = this;
    }
    spill795_2 = (((moom.Il)(lexicalValue795_33_0)).c)[life5_22];
    if (!((life4_5 != null))) {
        lexicalValue795_44_0 = ((spill795_2) ? 1 : 0);
        break lexical_join_44;
    }
    if (!(spill795_2)) {
        break lexical_join_59;
    }
    lexicalValue795_44_0 = ((moom.Il)((this.b)[life5_22])).f;
    }
    if (!((life4_5 != null))) {
        lexicalValue795_54_0 = lexicalValue795_44_0;
        break lexical_join_54;
    }
    if (!((lexicalValue795_44_0 != p0))) {
        break lexical_join_59;
    }
    lexicalValue795_54_0 = ((((moom.Il)((this.b)[life5_22])).a(((int)(p0)))) ? 1 : 0);
    }
    if (!((life4_5 != null))) {
        lexicalValue795_58_0 = lexicalValue795_54_0;
        break lexical_join_58;
    }
    if (!((lexicalValue795_54_0 != 0))) {
        break lexical_join_59;
    }
    lexicalValue795_58_0 = 1;
    }
    return ((lexicalValue795_58_0) != 0);
    }
    life5_22 += 1;
    if (!((life4_5 == null))) { continue lexical_cycle_18; }
    break lexical_cycle_18;
    }
    }
    return ((0) != 0);
}


public boolean a__Boolean() {
int forwardValue2206_17_0;
    int forwardValue2206_19_0;
    int spill2206_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_19: {
    forward_join_18: {
    forward_join_17: {
    life1_3 = (moom.Il.g ^ 140672664115475L);
    life3_5 = moom.G4.b();
    spill2206_0 = this.a;
    if (!((life3_5 != null))) {
        forwardValue2206_17_0 = spill2206_0;
        break forward_join_17;
    }
    if (!((spill2206_0 >= __sourceIntrinsic_1a14968dced5_invokedynamic2206_3(27510, (3083706348538842942L ^ life1_3))))) {
        break forward_join_18;
    }
    forwardValue2206_17_0 = 1;
    }
    forwardValue2206_19_0 = forwardValue2206_17_0;
    break forward_join_19;
    }
    forwardValue2206_19_0 = 0;
    }
    return ((forwardValue2206_19_0) != 0);
}


public int a() {
int lexicalValue794_29_0;
    net.minecraft.entity.Entity[] spill794_0;
    boolean spill794_1;
    long life1_3;
    int life4_5;
    int life5_8;
    net.minecraft.entity.Entity[] life3_9;
    lexical_join_29: {
    lexical_join_28: {
    life1_3 = (moom.Il.g ^ 17498556539456L);
    life4_5 = 0;
    spill794_0 = moom.G4.b();
    life5_8 = 0;
    life3_9 = spill794_0;
    lexical_cycle_10: while (true) {
    lexical_join_25: {
    if (!((life5_8 < __sourceIntrinsic_8aebf151eadb_invokedynamic794_2(11810, (7772177503260651832L ^ life1_3))))) {
        break lexical_join_28;
    }
    spill794_1 = (this.c)[life5_8];
    if (!((life3_9 != null))) {
        lexicalValue794_29_0 = ((spill794_1) ? 1 : 0);
        break lexical_join_29;
    }
    if (!(spill794_1)) {
        break lexical_join_25;
    }
    life4_5 += 1;
    }
    life5_8 += 1;
    if (!((life3_9 == null))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    lexicalValue794_29_0 = life4_5;
    }
    return lexicalValue794_29_0;
}


private static native <E extends Throwable> int __sourceIntrinsic_e618f06737ed48a0_originalDynamicSite2179_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e618f06737ed48a0_originalDynamicSite2179_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral4951_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic796_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f3a7748b91d1_invokedynamic795_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1a14968dced5_invokedynamic2206_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8aebf151eadb_invokedynamic794_2(int a0, long a1) throws E;
}
