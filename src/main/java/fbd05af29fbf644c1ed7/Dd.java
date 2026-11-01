package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Dd<V> {

private transient moom.De<V>[] a;

private transient int b;

private int c;

private float d;

private static long e;

private static long[] f;

private static java.lang.Integer[] g;

private static java.util.Map h;

public Dd() { super(); }


private static void __sourceConstructorBody_1e683a2c8b409694(moom.Dd receiver) throws Throwable {

long local1 = (moom.Dd.e ^ 98534688433244L);

    moom.Dd.__sourceConstructorInit_1e683a2c8b409694_0(((moom.Dd)(receiver)));

    ((moom.Dd)(receiver)).a = ((moom.De[])(new moom.De[__sourceIntrinsic_1e683a2c8b409694_originalDynamicSite1923_2(25636, (835615448782201855L ^ local1))]));

    ((moom.Dd)(receiver)).c = ((int)(__sourceIntrinsic_1e683a2c8b409694_originalDynamicSite1923_4(11928, (2721277600767125828L ^ local1))));

    ((moom.Dd)(receiver)).d = ((float)(0x1.8p-1f));

    return;

}



static {
e = ((long)(((moom._a)(moom._c.a(((long)(1986560581079889689L)), ((long)(-6633698434945494015L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(253864912034188L)))));
    h = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.Dd.e ^ 5993283485451L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill693_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill693_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill693_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill693_14 = new byte[8];
    (__sourceSpill693_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill693_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation693_16 = __sourceSpill693_14;
    ((javax.crypto.Cipher)(__sourceSpill693_11)).init(((int)(__sourceSpill693_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill693_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation693_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[7];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "|Ýe\\\\ùô44òáRJ\n\036ìÙ\023Vóú\006!3\"\016ôí!ÏRº]Gù"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill693_25 = local6_life21;
        int __sourceSpill693_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill693_25)).substring(((int)(__sourceSpill693_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill693_30 = local8_life19;
        int __sourceSpill693_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill693_33 = new byte[8];
        (__sourceSpill693_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill693_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill693_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill693_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill693_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill693_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill693_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill693_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill693_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill693_34)).doFinal(((byte[])(__sourceSpill693_33)));
        (__sourceSpill693_30)[__sourceSpill693_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "½\031Re9\036]R\035¢\034*{H/"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill693_38 = local6_life21;
        int __sourceSpill693_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill693_38)).substring(((int)(__sourceSpill693_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill693_43 = local8_life19;
        int __sourceSpill693_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill693_46 = new byte[8];
        (__sourceSpill693_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill693_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill693_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill693_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill693_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill693_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill693_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill693_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill693_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill693_47)).doFinal(((byte[])(__sourceSpill693_46)));
        (__sourceSpill693_43)[__sourceSpill693_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    f = ((long[])(local8_life19));
    g = ((java.lang.Integer[])(new java.lang.Integer[7]));
}

private static native <E extends Throwable> void __sourceConstructorInit_1e683a2c8b409694_0(moom.Dd a0) throws E;

public V b(int p0) {
moom.De forwardValue1709_17_0;
    java.lang.Object forwardValue1709_18_0;
    boolean spill1709_0;
    moom.De spill1709_1;
    long life2_3;
    moom.De life5_8;
    int life4_9;
    forward_join_18: {
    forward_join_17: {
    forward_join_16: {
    life2_3 = (moom.Dd.e ^ 2214026869833L);
    spill1709_0 = moom.DS.b__Boolean();
    life5_8 = ((moom.Dd)(this)).b__De(((int)(p0)));
    life4_9 = ((spill1709_0) ? 1 : 0);
    spill1709_1 = life5_8;
    if (!((life4_9 == 0))) {
        forwardValue1709_17_0 = spill1709_1;
        break forward_join_17;
    }
    if (!((spill1709_1 == null))) {
        break forward_join_16;
    }
    forwardValue1709_18_0 = null;
    break forward_join_18;
    }
    forwardValue1709_17_0 = life5_8;
    }
    forwardValue1709_18_0 = ((moom.De)(forwardValue1709_17_0)).b;
    }
    return ((V)(forwardValue1709_18_0));
}


final moom.De<V> b__De(int p0) {
moom.De lexicalValue560_55_0;
    moom.De lexicalValue560_55_1;
    moom.De lexicalValue560_61_0;
    moom.De lexicalValue560_65_0;
    boolean spill560_0;
    moom.De spill560_1;
    moom.De spill560_2;
    moom.De spill560_3;
    long life2_3;
    int life5_6;
    int life6_12;
    moom.De life7_17;
    moom.De life8_20;
    int life4_21;
    moom.De life9_26;
    lexical_join_65: {
    lexical_join_64: {
    life2_3 = (moom.Dd.e ^ 4871181845373L);
    life5_6 = __sourceExactCall_265f4047ca3d4f(((int)(p0)));
    life6_12 = __sourceExactCall_902fd6aafc8bf4(((int)(life5_6)), ((int)((this.a).length)));
    life7_17 = (this.a)[life6_12];
    spill560_0 = moom.DS.c__Boolean();
    life8_20 = life7_17;
    life4_21 = ((spill560_0) ? 1 : 0);
    lexical_cycle_22: while (true) {
    lexical_join_61: {
    lexical_join_58: {
    lexical_join_56: {
    lexical_join_55: {
    lexical_join_53: {
    if (!((life8_20 != null))) {
        break lexical_join_64;
    }
    life9_26 = ((moom.De)(life8_20)).c;
    spill560_1 = life8_20;
    if (!((life4_21 != 0))) {
        lexicalValue560_65_0 = spill560_1;
        break lexical_join_65;
    }
    if (!((life4_21 != 0))) {
        lexicalValue560_61_0 = spill560_1;
        break lexical_join_61;
    }
    if (!((((moom.De)(spill560_1)).a == p0))) {
        break lexical_join_58;
    }
    moom.Dd __stackOp560_9_0 = this;
    ((moom.Dd)(__stackOp560_9_0)).b = ((int)((((moom.Dd)(__stackOp560_9_0)).b - 1)));
    spill560_2 = life7_17;
    spill560_3 = life8_20;
    if (!((life4_21 != 0))) {
        lexicalValue560_55_0 = spill560_2;
        lexicalValue560_55_1 = spill560_3;
        break lexical_join_55;
    }
    if (!((spill560_2 == spill560_3))) {
        break lexical_join_53;
    }
    (this.a)[life6_12] = life9_26;
    if (!((life4_21 == 0))) {
        break lexical_join_56;
    }
    }
    lexicalValue560_55_0 = life7_17;
    lexicalValue560_55_1 = life9_26;
    }
    ((moom.De)(lexicalValue560_55_0)).c = ((moom.De)(lexicalValue560_55_1));
    }
    return life8_20;
    }
    life7_17 = life8_20;
    lexicalValue560_61_0 = life9_26;
    }
    life8_20 = lexicalValue560_61_0;
    if (!((life4_21 == 0))) { continue lexical_cycle_22; }
    break lexical_cycle_22;
    }
    }
    lexicalValue560_65_0 = life8_20;
    }
    return lexicalValue560_65_0;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static int a(int p0) {
long local1 = (moom.Dd.e ^ 16314024306838L);
    p0 = ((p0 ^ (p0 >>> __sourceIntrinsic_5c51e7cdc795_originalDynamicSite1108_1(15827, (8094266815781582528L ^ local1)))) ^ (p0 >>> __sourceIntrinsic_5c51e7cdc795_originalDynamicSite1108_2(20461, (6923874603995546872L ^ local1))));
    return ((p0 ^ (p0 >>> __sourceIntrinsic_5c51e7cdc795_originalDynamicSite1108_3(29134, (5755888658506054361L ^ local1)))) ^ (p0 >>> 4));
}


private void a(int p0, int p1, V p2, int p3) {
moom.Dd forestValue234_40_0;
    int forestValue234_40_1;
    boolean spill234_0;
    moom.Dd spill234_1;
    int spill234_2;
    int spill234_3;
    long life5_3;
    moom.De life8_9;
    int life7_10;
    forest_join_41: {
    forest_join_40: {
    life5_3 = (moom.Dd.e ^ 32008776810103L);
    spill234_0 = moom.DS.c__Boolean();
    life8_9 = (this.a)[p3];
    life7_10 = ((spill234_0) ? 1 : 0);
    (this.a)[p3] = new moom.De(p0, p1, p2, life8_9);
    moom.Dd __stackOp234_5_0 = this;
    spill234_1 = __stackOp234_5_0;
    spill234_2 = ((moom.Dd)(__stackOp234_5_0)).b;
    if (!((life7_10 != 0))) {
        forestValue234_40_0 = spill234_1;
        forestValue234_40_1 = spill234_2;
        break forest_join_40;
    }
    moom.Dd __stackOp234_7_0 = spill234_1;
    int __stackOp234_7_1 = spill234_2;
    spill234_3 = __stackOp234_7_1;
    ((moom.Dd)(__stackOp234_7_0)).b = ((int)((__stackOp234_7_1 + 1)));
    if (!((spill234_3 >= this.c))) {
        break forest_join_41;
    }
    forestValue234_40_0 = this;
    forestValue234_40_1 = (2 * (this.a).length);
    }
    ((moom.Dd)(forestValue234_40_0)).a__Void(((int)(forestValue234_40_1)));
    }
    return;
}


public void a() {
java.lang.Object[] local1 = this.a;
    java.util.Arrays.fill(((java.lang.Object[])(local1)), ((java.lang.Object)(null)));
    this.b = ((int)(0));
    return;
}


private static int a(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x1F29;
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
                throw new RuntimeException("moom/Dd", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Dd.g[n2] = n4;
        }
        return g[n2];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_49aade11be3012(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral4195_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Dd"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private void a__Void(int p0) {
int forwardValue1708_31_0;
    boolean spill1708_0;
    int spill1708_1;
    moom.Dd spill1708_2;
    float spill1708_3;
    long life2_3;
    moom.De[] life5_6;
    int life6_10;
    int life4_11;
    moom.De[] life7_41;
    forward_join_49: {
    forward_join_31: {
    forward_join_30: {
    life2_3 = (moom.Dd.e ^ 33150906693948L);
    life5_6 = this.a;
    spill1708_0 = moom.DS.b__Boolean();
    life6_10 = (life5_6).length;
    life4_11 = ((spill1708_0) ? 1 : 0);
    spill1708_1 = life6_10;
    if (!((life4_11 == 0))) {
        forwardValue1708_31_0 = spill1708_1;
        break forward_join_31;
    }
    if (!((spill1708_1 == __sourceIntrinsic_6fc3381d0590_invokedynamic1708_4(15201, (5618217904034144731L ^ life2_3))))) {
        break forward_join_30;
    }
    this.c = ((int)(__sourceIntrinsic_6fc3381d0590_invokedynamic1708_5(21015, (405334276613179561L ^ life2_3))));
    if (!((life4_11 != 0))) {
        break forward_join_49;
    }
    }
    forwardValue1708_31_0 = p0;
    }
    life7_41 = new moom.De[forwardValue1708_31_0];
    ((moom.Dd)(this)).a(((moom.De[])(life7_41)));
    this.a = ((moom.De[])(life7_41));
    spill1708_2 = this;
    spill1708_3 = ((float) p0);
    java.util.Objects.requireNonNull(((java.lang.Object)(this)));
    ((moom.Dd)(spill1708_2)).c = ((int)(((int) (spill1708_3 * 0x1.8p-1f))));
    }
    return;
}


public void a(int p0, V p1) {
moom.De lexicalValue556_36_0;
    boolean spill556_0;
    moom.De spill556_1;
    long life3_3;
    int life6_7;
    int life5_8;
    int life7_14;
    moom.De life8_19;
    lexical_join_45: {
    lexical_join_39: {
    life3_3 = (moom.Dd.e ^ 9104002997258L);
    spill556_0 = moom.DS.b__Boolean();
    life6_7 = __sourceExactCall_265f4047ca3d4f(((int)(p0)));
    life5_8 = ((spill556_0) ? 1 : 0);
    life7_14 = __sourceExactCall_902fd6aafc8bf4(((int)(life6_7)), ((int)((this.a).length)));
    life8_19 = (this.a)[life7_14];
    lexical_cycle_20: while (true) {
    lexical_join_36: {
    lexical_join_34: {
    if (!((life8_19 != null))) {
        break lexical_join_39;
    }
    if (!((life5_8 == 0))) {
        break lexical_join_45;
    }
    spill556_1 = life8_19;
    if (!((life5_8 == 0))) {
        lexicalValue556_36_0 = spill556_1;
        break lexical_join_36;
    }
    if (!((((moom.De)(spill556_1)).a == p0))) {
        break lexical_join_34;
    }
    ((moom.De)(life8_19)).b = ((java.lang.Object)(p1));
    return;
    }
    lexicalValue556_36_0 = ((moom.De)(life8_19)).c;
    }
    life8_19 = lexicalValue556_36_0;
    if (!((life5_8 != 0))) { continue lexical_cycle_20; }
    break lexical_cycle_20;
    }
    }
    ((moom.Dd)(this)).a(((int)(life6_7)), ((int)(p0)), ((java.lang.Object)(p1)), ((int)(life7_14)));
    }
    return;
}


final moom.De<V> a__De(int p0) {
moom.De lexicalValue558_30_0;
    boolean spill558_0;
    moom.De spill558_1;
    long life2_3;
    int life5_6;
    moom.De life6_16;
    int life4_17;
    lexical_join_33: {
    life2_3 = (moom.Dd.e ^ 60383308212669L);
    life5_6 = __sourceExactCall_265f4047ca3d4f(((int)(p0)));
    spill558_0 = moom.DS.c__Boolean();
    life6_16 = (this.a)[__sourceExactCall_902fd6aafc8bf4(((int)(life5_6)), ((int)((this.a).length)))];
    life4_17 = ((spill558_0) ? 1 : 0);
    lexical_cycle_18: while (true) {
    lexical_join_30: {
    lexical_join_28: {
    if (!((life6_16 != null))) {
        break lexical_join_33;
    }
    spill558_1 = life6_16;
    if (!((life4_17 != 0))) {
        lexicalValue558_30_0 = spill558_1;
        break lexical_join_30;
    }
    if (!((((moom.De)(spill558_1)).a == p0))) {
        break lexical_join_28;
    }
    return life6_16;
    }
    lexicalValue558_30_0 = ((moom.De)(life6_16)).c;
    }
    life6_16 = lexicalValue558_30_0;
    if (!((life4_17 == 0))) { continue lexical_cycle_18; }
    break lexical_cycle_18;
    }
    }
    return null;
}


public boolean a__Boolean(int p0) {
long local2 = (moom.Dd.e ^ 59913021667760L);
    return ((((((moom.Dd)(this)).a__De(((int)(p0))) != null) ? 1 : 0)) != 0);
}


private void a(moom.De<V>[] p0) {
boolean spill557_0;
    long life2_3;
    moom.De[] life5_6;
    int life6_9;
    int life7_12;
    int life4_13;
    moom.De life8_21;
    moom.De life9_38;
    int life10_43;
    lexical_join_58: {
    life2_3 = (moom.Dd.e ^ 139216363223924L);
    life5_6 = this.a;
    life6_9 = (p0).length;
    spill557_0 = moom.DS.b__Boolean();
    life7_12 = 0;
    life4_13 = ((spill557_0) ? 1 : 0);
    lexical_cycle_14: while (true) {
    lexical_join_56: {
    lexical_join_55: {
    if (!((life7_12 < (life5_6).length))) {
        break lexical_join_58;
    }
    life8_21 = (life5_6)[life7_12];
    if (!((life4_13 == 0))) {
        break lexical_join_56;
    }
    if (!((life8_21 != null))) {
        break lexical_join_55;
    }
    (life5_6)[life7_12] = null;
    lexical_cycle_30: while (true) {
    lexical_join_53: {
    life9_38 = ((moom.De)(life8_21)).c;
    life10_43 = __sourceExactCall_902fd6aafc8bf4(((int)(((moom.De)(life8_21)).d)), ((int)(life6_9)));
    ((moom.De)(life8_21)).c = ((moom.De)((p0)[life10_43]));
    (p0)[life10_43] = life8_21;
    life8_21 = life9_38;
    if (!((life9_38 == null))) {
        break lexical_join_53;
    }
    if (!((life4_13 != 0))) {
        break lexical_join_55;
    }
    }
    if (!((life4_13 != 0))) { continue lexical_cycle_30; }
    break lexical_cycle_30;
    }
    }
    life7_12 += 1;
    }
    if (!((life4_13 != 0))) { continue lexical_cycle_14; }
    break lexical_cycle_14;
    }
    }
    return;
}


public V a__Object(int p0) {
moom.De lexicalValue559_31_0;
    boolean spill559_0;
    moom.De spill559_1;
    long life2_3;
    int life5_7;
    int life4_8;
    moom.De life6_17;
    lexical_join_34: {
    life2_3 = (moom.Dd.e ^ 51691813416372L);
    spill559_0 = moom.DS.c__Boolean();
    life5_7 = __sourceExactCall_265f4047ca3d4f(((int)(p0)));
    life4_8 = ((spill559_0) ? 1 : 0);
    life6_17 = (this.a)[__sourceExactCall_902fd6aafc8bf4(((int)(life5_7)), ((int)((this.a).length)))];
    lexical_cycle_18: while (true) {
    lexical_join_31: {
    lexical_join_29: {
    if (!((life6_17 != null))) {
        break lexical_join_34;
    }
    spill559_1 = life6_17;
    if (!((life4_8 != 0))) {
        lexicalValue559_31_0 = spill559_1;
        break lexical_join_31;
    }
    if (!((((moom.De)(spill559_1)).a == p0))) {
        break lexical_join_29;
    }
    return ((V)(((moom.De)(life6_17)).b));
    }
    lexicalValue559_31_0 = ((moom.De)(life6_17)).c;
    }
    life6_17 = lexicalValue559_31_0;
    if (!((life4_8 == 0))) { continue lexical_cycle_18; }
    break lexical_cycle_18;
    }
    }
    return null;
}


private static int a(int p0, int p1) {
return (p0 & (p1 - 1));
}


private static native <E extends Throwable> int __sourceIntrinsic_1e683a2c8b409694_originalDynamicSite1923_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1e683a2c8b409694_originalDynamicSite1923_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5c51e7cdc795_originalDynamicSite1108_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5c51e7cdc795_originalDynamicSite1108_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5c51e7cdc795_originalDynamicSite1108_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral4195_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6fc3381d0590_invokedynamic1708_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6fc3381d0590_invokedynamic1708_5(int a0, long a1) throws E;

private static native int __sourceExactCall_265f4047ca3d4f(int p0);
private static native int __sourceExactCall_902fd6aafc8bf4(int p0, int p1);
private static native int __sourceExactCall_49aade11be3012(int p0, long p1);
}
